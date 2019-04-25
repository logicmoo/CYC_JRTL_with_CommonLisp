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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class nl_trie extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.nl_trie";
    public static final String myFingerPrint = "4ea78b3ba04d03c5abb643b4dbafcdc3e81514d51590c10f1e2f6c803c2df4d4";
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 6216L)
    private static SubLSymbol $nl_trie_default_test$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 6410L)
    private static SubLSymbol $default_nl_trie_cache_strategy_size$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 6555L)
    public static SubLSymbol $nl_trie_cache_strategy$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 7464L)
    public static SubLSymbol $nl_trie_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 10594L)
    private static SubLSymbol $english_definite_determiner$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 29085L)
    private static SubLSymbol $nl_trie_word_denot_invalidity_tests$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 32752L)
    public static SubLSymbol $dtp_nl_trie_word_struc$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 33480L)
    private static SubLSymbol $cfasl_opcode_nl_trie_word_struc$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 34694L)
    private static SubLSymbol $nl_trie_word_semantic_support_set_test$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 35176L)
    private static SubLSymbol $nl_trie_word_syntactic_support_set_test$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 38294L)
    private static SubLSymbol $call_to_nl_trie_word_syntactic_supports_licensedP$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 38983L)
    private static SubLSymbol $call_to_nl_trie_word_semantic_supports_licensedP$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 48562L)
    private static SubLSymbol $nl_trie_closed_class_pos_preds_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 52996L)
    private static SubLSymbol $nl_trie_preferred_semantic_predicates$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 64841L)
    private static SubLSymbol $nl_trie_lexical_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 65105L)
    private static SubLSymbol $nl_trie_syntactic_predicates$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 65241L)
    private static SubLSymbol $nl_trie_denotation_predicates$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 65384L)
    private static SubLSymbol $nl_trie_semtrans_predicates$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 65523L)
    private static SubLSymbol $nl_trie_abbreviation_predicates$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 65665L)
    private static SubLSymbol $nl_trie_arg_in_reln_predicates$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 65809L)
    private static SubLSymbol $nl_trie_pragmatic_predicates$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 67075L)
    private static SubLSymbol $nl_tries_being_initialized$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 68172L)
    private static SubLSymbol $nl_trie$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 95076L)
    private static SubLSymbol $nl_trie_entry_filter_stack$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 98878L)
    private static SubLSymbol $nl_trie_multi_word_abbreviation_preds_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 106402L)
    private static SubLSymbol $catch_nl_trie_errorsP$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 112218L)
    private static SubLSymbol $nl_trie_spec_predicates_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 118810L)
    private static SubLSymbol $nl_trie_pos_for_semtrans_pred_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 119504L)
    private static SubLSymbol $nl_trie_pred_ok_for_posP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 119759L)
    private static SubLSymbol $nl_trie_preds_licensed_by_pos_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 134531L)
    public static SubLSymbol $nl_trie_denot_set_test$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 165087L)
    private static SubLSymbol $nl_trie_preds_of_pos_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 165515L)
    private static SubLSymbol $nl_trie_pos_of_pred_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 166471L)
    private static SubLSymbol $nl_trie_break_list$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 169328L)
    private static SubLSymbol $nl_trie_use_two_letter_stringsP$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 172294L)
    public static SubLSymbol $nl_trie_warning_level$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 173050L)
    public static SubLSymbol $nl_trie_break_on_errorP$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 173576L)
    public static SubLSymbol $nl_trie_include_derived_formsP$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 178959L)
    private static SubLSymbol $nl_trie_name_string_preds_set$;
    private static final SubLString $str0$_Revision__142735__;
    private static final SubLSymbol $sym1$_NL_TRIE_CODE_REVISION_;
    private static final SubLList $list2;
    private static final SubLInteger $int3$6000;
    private static final SubLSymbol $sym4$_NL_TRIE_CACHE_STRATEGY_;
    private static final SubLSymbol $sym5$WITH_BACKED_MAP_CACHE_STRATEGY;
    private static final SubLList $list6;
    private static final SubLList $list7;
    private static final SubLSymbol $sym8$_NL_TRIE_LOCK_;
    private static final SubLString $str9$NL_Trie_Lock;
    private static final SubLList $list10;
    private static final SubLSymbol $sym11$WITH_LOCK_HELD;
    private static final SubLSymbol $kw12$WHOSTATE;
    private static final SubLSymbol $sym13$WITH_FILE_VECTOR_BACKED_MAP_STREAM_LOCK;
    private static final SubLList $list14;
    private static final SubLObject $const15$termPhrases;
    private static final SubLSymbol $sym16$VALIDATE_NL_TRIE_ENTRY;
    private static final SubLInteger $int17$200;
    private static final SubLSymbol $sym18$GET;
    private static final SubLSymbol $kw19$NAME;
    private static final SubLSymbol $kw20$WORD;
    private static final SubLSymbol $kw21$STRING;
    private static final SubLString $str22$the;
    private static final SubLSymbol $kw23$OFF;
    private static final SubLList $list24;
    private static final SubLSymbol $sym25$STRIE;
    private static final SubLSymbol $sym26$KEY;
    private static final SubLSymbol $sym27$ENTRIES;
    private static final SubLSymbol $sym28$WITH_NL_TRIE_CACHE_STRATEGY;
    private static final SubLSymbol $sym29$CLET;
    private static final SubLList $list30;
    private static final SubLSymbol $sym31$WITH_NL_TRIE_LOCK_HELD;
    private static final SubLList $list32;
    private static final SubLSymbol $sym33$DO_STRIE_PROGRESS;
    private static final SubLList $list34;
    private static final SubLSymbol $sym35$CDOLIST;
    private static final SubLSymbol $sym36$PWHEN;
    private static final SubLSymbol $sym37$CAND;
    private static final SubLSymbol $sym38$NL_TRIE_NAME_P;
    private static final SubLSymbol $sym39$CNOT;
    private static final SubLSymbol $sym40$SUBSTRING_MATCH_;
    private static final SubLSymbol $sym41$NL_TRIE_NAME_STRING;
    private static final SubLList $list42;
    private static final SubLObject $const43$Noun;
    private static final SubLObject $const44$EnglishLexiconMt;
    private static final SubLObject $const45$properNounStrings;
    private static final SubLSymbol $sym46$SPEC_PREDICATE_;
    private static final SubLSymbol $sym47$NL_TRIE_DONT_ADD_THE_CATEGORIES;
    private static final SubLSymbol $sym48$_COLLECTION;
    private static final SubLList $list49;
    private static final SubLObject $const50$MtUnionFn;
    private static final SubLObject $const51$EnglishMt;
    private static final SubLSymbol $sym52$NL_TRIE_DONT_ADD_THE_TERMS;
    private static final SubLSymbol $sym53$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const54$EverythingPSC;
    private static final SubLSymbol $sym55$NL_TRIE_NAME_PRED_OK_FOR_ADDING_THE_;
    private static final SubLObject $const56$dontAddTheToNamesWithPred;
    private static final SubLSymbol $kw57$CYC_POS;
    private static final SubLSymbol $kw58$PREDICATE;
    private static final SubLSymbol $kw59$DENOTS;
    private static final SubLList $list60;
    private static final SubLSymbol $sym61$PCOND;
    private static final SubLList $list62;
    private static final SubLSymbol $sym63$NL_TRIE_NAME_DENOT;
    private static final SubLSymbol $sym64$NL_TRIE_TERM_PHRASES_ENTRY_P;
    private static final SubLSymbol $sym65$GAF_ARG1;
    private static final SubLSymbol $sym66$NL_TRIE_WORD_P;
    private static final SubLSymbol $sym67$DO_NL_TRIE_WORD_DENOTS;
    private static final SubLSymbol $kw68$CYC_SUBLOOP;
    private static final SubLSymbol $kw69$CYC_NL;
    private static final SubLSymbol $sym70$LEX_ENTRY_P;
    private static final SubLSymbol $sym71$NL_TRIE_LEX_ENTRY_GET;
    private static final SubLList $list72;
    private static final SubLList $list73;
    private static final SubLSymbol $sym74$NL_TRIE_NAME_STRING_MACRO_HELPER;
    private static final SubLSymbol $sym75$GAF_ARG3;
    private static final SubLSymbol $sym76$DO_NL_TRIE_WORD_STRINGS;
    private static final SubLList $list77;
    private static final SubLSymbol $sym78$DO_NL_TRIE_ENTRY_STRINGS;
    private static final SubLList $list79;
    private static final SubLList $list80;
    private static final SubLSymbol $kw81$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw82$DONE;
    private static final SubLSymbol $sym83$DO_SET;
    private static final SubLSymbol $sym84$NL_TRIE_WORD_SYNTACTIC_SUPPORT_SET;
    private static final SubLSymbol $sym85$NL_TRIE_WORD_SEMANTIC_SUPPORT_SET;
    private static final SubLSymbol $kw86$MT;
    private static final SubLSymbol $kw87$PRAGMATICS;
    private static final SubLSymbol $sym88$NL_TRIE_ENTRY_P;
    private static final SubLString $str89$Removing_bad_syntactic_support___;
    private static final SubLString $str90$Removing_bad_semantic_support___S;
    private static final SubLSymbol $sym91$NL_TRIE_WORD_STRUC_VALID_P;
    private static final SubLSymbol $sym92$NL_TRIE_VALID_ASSERTION__MEMOIZED;
    private static final SubLInteger $int93$500;
    private static final SubLSymbol $sym94$INVALID_FORT_;
    private static final SubLList $list95;
    private static final SubLList $list96;
    private static final SubLList $list97;
    private static final SubLString $str98$Removing_invalid_denot___S;
    private static final SubLList $list99;
    private static final SubLSymbol $sym100$INVALID_CONSTANT_;
    private static final SubLSymbol $sym101$EL_FORMULA_P;
    private static final SubLSymbol $sym102$HLMT_P;
    private static final SubLSymbol $sym103$SET_P;
    private static final SubLString $str104$_S___is_not_a_valid_NL_trie_denot;
    private static final SubLObject $const105$denotation;
    private static final SubLSymbol $sym106$NL_TRIE_WORD_STRUC;
    private static final SubLSymbol $sym107$NL_TRIE_WORD_STRUC_P;
    private static final SubLInteger $int108$166;
    private static final SubLList $list109;
    private static final SubLList $list110;
    private static final SubLList $list111;
    private static final SubLList $list112;
    private static final SubLSymbol $sym113$PPRINT_NL_TRIE_WORD_STRUC;
    private static final SubLSymbol $sym114$NL_TRIE_WORD_STRUC_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list115;
    private static final SubLSymbol $sym116$NL_TRIE_WORD_STRUC_SYNTACTIC_SUPPORTS;
    private static final SubLSymbol $sym117$_CSETF_NL_TRIE_WORD_STRUC_SYNTACTIC_SUPPORTS;
    private static final SubLSymbol $sym118$NL_TRIE_WORD_STRUC_SEMANTIC_SUPPORTS;
    private static final SubLSymbol $sym119$_CSETF_NL_TRIE_WORD_STRUC_SEMANTIC_SUPPORTS;
    private static final SubLSymbol $kw120$SYNTACTIC_SUPPORTS;
    private static final SubLSymbol $kw121$SEMANTIC_SUPPORTS;
    private static final SubLString $str122$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw123$BEGIN;
    private static final SubLSymbol $sym124$MAKE_NL_TRIE_WORD_STRUC;
    private static final SubLSymbol $kw125$SLOT;
    private static final SubLSymbol $kw126$END;
    private static final SubLSymbol $sym127$VISIT_DEFSTRUCT_OBJECT_NL_TRIE_WORD_STRUC_METHOD;
    private static final SubLInteger $int128$509;
    private static final SubLSymbol $sym129$SXHASH_NL_TRIE_WORD_STRUC_METHOD;
    private static final SubLString $str130$_NL_TRIE_WORD;
    private static final SubLString $str131$____S;
    private static final SubLString $str132$_;
    private static final SubLInteger $int133$71;
    private static final SubLSymbol $sym134$CFASL_INPUT_NL_TRIE_WORD_STRUC;
    private static final SubLSymbol $sym135$CFASL_OUTPUT_OBJECT_NL_TRIE_WORD_STRUC_METHOD;
    private static final SubLSymbol $sym136$NL_TRIE_VALID_SEMANTIC_SUPPORT_P;
    private static final SubLSymbol $sym137$NL_TRIE_SYNTACTIC_SUPPORT_P;
    private static final SubLSymbol $sym138$NL_TRIE_WORD_VALID_SYNTACTIC_SUPPORT_SET_P;
    private static final SubLSymbol $sym139$NL_TRIE_WORD_VALID_SEMANTIC_SUPPORT_SET_P;
    private static final SubLObject $const140$partOfSpeech;
    private static final SubLString $str141$Couldn_t_find_valid_arbitrary_syn;
    private static final SubLString $str142$Illicit_call_to_NL_TRIE_WORD_SYNT;
    private static final SubLString $str143$Illicit_call_to_NL_TRIE_WORD_SEMA;
    private static final SubLString $str144$Couldn_t_find_valid_arbitrary_sem;
    private static final SubLSymbol $kw145$ADDED;
    private static final SubLSymbol $kw146$ALREADY_PRESENT;
    private static final SubLSymbol $kw147$REMOVED;
    private static final SubLSymbol $kw148$NOT_FOUND;
    private static final SubLSymbol $sym149$NL_TRIE_WORD_SEMANTIC_SUPPORT_DENOTS;
    private static final SubLString $str150$Can_t_get_arg__S_of__S;
    private static final SubLSymbol $sym151$NL_TRIE_WORD_SEMANTIC_SUPPORT_SEMTRANS_TEMPLATES;
    private static final SubLList $list152;
    private static final SubLSymbol $sym153$NL_TRIE_CLOSED_CLASS_POS_PREDS;
    private static final SubLSymbol $kw154$BREADTH;
    private static final SubLSymbol $kw155$QUEUE;
    private static final SubLSymbol $kw156$STACK;
    private static final SubLObject $const157$True_JustificationTruth;
    private static final SubLSymbol $sym158$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw159$ERROR;
    private static final SubLString $str160$_A_is_not_a__A;
    private static final SubLSymbol $sym161$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw162$CERROR;
    private static final SubLString $str163$continue_anyway;
    private static final SubLSymbol $kw164$WARN;
    private static final SubLString $str165$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLObject $const166$genls;
    private static final SubLObject $const167$ClosedClassWord;
    private static final SubLString $str168$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str169$attempting_to_bind_direction_link;
    private static final SubLString $str170$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLSymbol $sym171$_NL_TRIE_CLOSED_CLASS_POS_PREDS_CACHING_STATE_;
    private static final SubLInteger $int172$64;
    private static final SubLSymbol $sym173$CLEAR_NL_TRIE_CLOSED_CLASS_POS_PREDS;
    private static final SubLObject $const174$abbreviationForLexicalWord;
    private static final SubLSymbol $sym175$NL_TRIE_WORD_POS;
    private static final SubLObject $const176$gerund;
    private static final SubLSymbol $sym177$ASSERTION_P;
    private static final SubLInteger $int178$1000;
    private static final SubLList $list179;
    private static final SubLList $list180;
    private static final SubLSymbol $kw181$PREFERRED_ONLY_;
    private static final SubLSymbol $sym182$PRED;
    private static final SubLSymbol $sym183$DENOT_ARG;
    private static final SubLSymbol $sym184$SEMANTIC_SUPPORT;
    private static final SubLSymbol $sym185$NL_TRIE_WORD_SEM_PRED;
    private static final SubLSymbol $sym186$FWHEN;
    private static final SubLSymbol $sym187$INDEXED_TERM_P;
    private static final SubLSymbol $sym188$DENOTATUM_ARG_OF_PRED_CACHED;
    private static final SubLSymbol $sym189$INTEGERP;
    private static final SubLSymbol $sym190$FIMPLIES;
    private static final SubLSymbol $sym191$NL_TRIE_PREFERRED_SEMANTIC_SUPPORT_;
    private static final SubLList $list192;
    private static final SubLObject $const193$preferredLexification;
    private static final SubLList $list194;
    private static final SubLSymbol $sym195$PRED;
    private static final SubLSymbol $sym196$SEMTRANS_TEMPLATE_ARG;
    private static final SubLSymbol $sym197$SEMANTIC_SUPPORT;
    private static final SubLSymbol $sym198$INVALID_SUPPORTS;
    private static final SubLSymbol $sym199$SEMTRANS_ARG_OF_PRED_CACHED;
    private static final SubLSymbol $sym200$PIF;
    private static final SubLSymbol $sym201$VALID_NL_TRIE_WORD_SEMANTIC_SUPPORT_P;
    private static final SubLSymbol $sym202$CPUSH;
    private static final SubLSymbol $sym203$NL_TRIE_WORD_REMOVE_SEMANTIC_SUPPORT;
    private static final SubLList $list204;
    private static final SubLSymbol $sym205$SEMANTIC_SUPPORT;
    private static final SubLSymbol $sym206$LEADING_STRINGS;
    private static final SubLSymbol $sym207$HEAD_STRING;
    private static final SubLSymbol $sym208$FOLLOWING_STRINGS;
    private static final SubLSymbol $sym209$NL_TRIE_WORD_HEAD_STRING_MACRO_HELPER;
    private static final SubLSymbol $sym210$DO_NL_TRIE_WORD_SEMANTIC_SUPPORTS;
    private static final SubLSymbol $sym211$NL_TRIE_WORD_LEADING_STRINGS_FROM_SUPPORT_MACRO_HELPER;
    private static final SubLSymbol $sym212$NL_TRIE_WORD_FOLLOWING_STRINGS_FROM_SUPPORT_MACRO_HELPER;
    private static final SubLSymbol $sym213$NL_TRIE_ASSEMBLE_STRINGS_MACRO_HELPER;
    private static final SubLString $str214$__NL_TRIE_WORD_Word_unit______S__;
    private static final SubLString $str215$_______________POS____________S__;
    private static final SubLString $str216$_______________POS_Preds______S__;
    private static final SubLString $str217$_______________Lexical_Pred___S__;
    private static final SubLString $str218$_______________Denotations____S__;
    private static final SubLString $str219$_______________Pragmatics_____S__;
    private static final SubLString $str220$_______________Microtheory____S__;
    private static final SubLString $str221$__NL_TRIE_NAME_Namestring_Pred___;
    private static final SubLString $str222$_______________Denotations_______;
    private static final SubLString $str223$_______________Pragmatics________;
    private static final SubLString $str224$_______________Microtheory_______;
    private static final SubLString $str225$Invalid_NL_trie_name___S;
    private static final SubLString $str226$Invalid_NL_trie_tp_entry___S;
    private static final SubLSymbol $sym227$NL_TRIE_RECORD_P;
    private static final SubLSymbol $sym228$VALID_NL_TRIE_RECORD_KEY_P;
    private static final SubLSymbol $sym229$VALID_NL_TRIE_RECORD_ENTRIES_P;
    private static final SubLSymbol $sym230$CYCL_STRING_P;
    private static final SubLSymbol $sym231$_NL_TRIE_LEXICAL_MT_;
    private static final SubLObject $const232$AllLexicalMicrotheoryPSC;
    private static final SubLSymbol $sym233$_NL_TRIE_SYNTACTIC_PREDICATES_;
    private static final SubLSymbol $kw234$UNINITIALIZED;
    private static final SubLSymbol $sym235$_NL_TRIE_DENOTATION_PREDICATES_;
    private static final SubLSymbol $sym236$_NL_TRIE_SEMTRANS_PREDICATES_;
    private static final SubLSymbol $sym237$_NL_TRIE_ABBREVIATION_PREDICATES_;
    private static final SubLSymbol $sym238$_NL_TRIE_ARG_IN_RELN_PREDICATES_;
    private static final SubLSymbol $sym239$_NL_TRIE_PRAGMATIC_PREDICATES_;
    private static final SubLList $list240;
    private static final SubLSymbol $sym241$_NL_TRIES_BEING_INITIALIZED_;
    private static final SubLSymbol $sym242$CONS;
    private static final SubLList $list243;
    private static final SubLList $list244;
    private static final SubLSymbol $sym245$_NL_TRIE_;
    private static final SubLSymbol $kw246$ABORTED;
    private static final SubLList $list247;
    private static final SubLList $list248;
    private static final SubLSymbol $sym249$DO_STRIE;
    private static final SubLList $list250;
    private static final SubLList $list251;
    private static final SubLList $list252;
    private static final SubLSymbol $kw253$PROGRESS_NOTE;
    private static final SubLString $str254$Mapping_NL_trie___;
    private static final SubLList $list255;
    private static final SubLList $list256;
    private static final SubLSymbol $kw257$COPIED;
    private static final SubLString $str258$__Clearing_the_present_contents_o;
    private static final SubLSymbol $kw259$CLEARED;
    private static final SubLSymbol $kw260$NEVER;
    private static final SubLSymbol $kw261$INITIALIZED;
    private static final SubLSymbol $kw262$ON;
    private static final SubLSymbol $kw263$PREFERRED;
    private static final SubLString $str264$Didn_t_recognize_NL_Trie_case_sen;
    private static final SubLSymbol $sym265$NL_TRIE_SEARCH_CASE_SENSITIVE;
    private static final SubLInteger $int266$48;
    private static final SubLSymbol $sym267$NL_TRIE_SEARCH_CASE_INSENSITIVE;
    private static final SubLSymbol $sym268$NL_TRIE_SEARCH_CASE_SENSITIVE_PREFERRED;
    private static final SubLString $str269$NL_Trie_empty_;
    private static final SubLString $str270$NL_Trie_incompletely_built_;
    private static final SubLString $str271$NL_trie_built_with_stale_code__;
    private static final SubLSymbol $kw272$NOT_ADDED;
    private static final SubLSymbol $kw273$NOT_REMOVED;
    private static final SubLSymbol $kw274$RETRIEFIED;
    private static final SubLSymbol $kw275$NOT_RETRIEFIED;
    private static final SubLList $list276;
    private static final SubLSymbol $sym277$TOP;
    private static final SubLSymbol $sym278$CFASL_INPUT;
    private static final SubLList $list279;
    private static final SubLList $list280;
    private static final SubLSymbol $sym281$CSETQ;
    private static final SubLSymbol $sym282$WARN;
    private static final SubLString $str283$___S_is_not_the_right_type_of_obj;
    private static final SubLSymbol $sym284$QUOTE;
    private static final SubLSymbol $kw285$EOF;
    private static final SubLSymbol $sym286$MAP_P;
    private static final SubLSymbol $sym287$_NL_TRIE_COMPLETION_INDEX_;
    private static final SubLString $str288$Mismatch_between_world_and_HL_cac;
    private static final SubLString $str289$Reconnecting_to_legacy_unit_files;
    private static final SubLSymbol $sym290$DUMP_SWAPPABLE_NL_TRIE_VISITOR_BEGIN_VISIT;
    private static final SubLSymbol $sym291$DUMP_SWAPPABLE_NL_TRIE_VISITOR_BEGIN_PATH;
    private static final SubLSymbol $sym292$DUMP_SWAPPABLE_NL_TRIE_VISITOR_ACCEPT_NODE;
    private static final SubLSymbol $sym293$DUMP_SWAPPABLE_NL_TRIE_VISITOR_END_PATH;
    private static final SubLSymbol $sym294$DUMP_SWAPPABLE_NL_TRIE_VISITOR_END_VISIT;
    private static final SubLString $str295$The_NL_trie_visitor_is_not_proper;
    private static final SubLString $str296$The_NL_trie_visitor_did_nto_compl;
    private static final SubLSymbol $kw297$SWAPPED_OUT;
    private static final SubLSymbol $kw298$COMPACT;
    private static final SubLList $list299;
    private static final SubLSymbol $kw300$FILE_VECTOR;
    private static final SubLSymbol $kw301$MAP_STACK;
    private static final SubLString $str302$Invalid_case_sensitivity_setting_;
    private static final SubLString $str303$Validating_all_NL_trie_entries;
    private static final SubLSymbol $kw304$VALIDATED;
    private static final SubLString $str305$Removing_bad_NL_trie_entry_for__S;
    private static final SubLString $str306$Remaining_entries_____S__;
    private static final SubLSymbol $sym307$NL_TRIE_SYNTACTIC_PRED_;
    private static final SubLList $list308;
    private static final SubLObject $const309$DenotesArgInRelnPredicate;
    private static final SubLObject $const310$SemTransPred;
    private static final SubLSymbol $sym311$NL_TRIE_SEMTRANS_PRED_HAS_POS_SPECIFICATION_;
    private static final SubLSymbol $sym312$NL_TRIE_MULTI_WORD_ABBREVIATION_PREDS;
    private static final SubLObject $const313$MultiWordForStringPred;
    private static final SubLSymbol $sym314$_NL_TRIE_MULTI_WORD_ABBREVIATION_PREDS_CACHING_STATE_;
    private static final SubLObject $const315$NLPragmaticPredicate_New;
    private static final SubLString $str316$__Initializing_NL_Trie_____;
    private static final SubLString $str317$__Triefying_the_syntactic_predica;
    private static final SubLSymbol $kw318$SYNTACTIC;
    private static final SubLString $str319$__Triefying_the_semantic_predicat;
    private static final SubLSymbol $kw320$SEMANTIC;
    private static final SubLSymbol $sym321$VALID_CONSTANT_;
    private static final SubLString $str322$____D__D__Triefying__S_assertions;
    private static final SubLObject $const323$NLSyntacticPredicate;
    private static final SubLObject $const324$NLSemanticPredicate;
    private static final SubLString $str325$Triefying__S;
    private static final SubLSymbol $kw326$GAF;
    private static final SubLSymbol $kw327$TRUE;
    private static final SubLString $str328$Triefying__S_assertions___;
    private static final SubLString $str329$Got_failure_result__S_when_triefy;
    private static final SubLSymbol $sym330$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLObject $const331$abbreviationForMultiWordString;
    private static final SubLObject $const332$abbreviationForCompoundString;
    private static final SubLString $str333$Caught_error_in_UPDATE_NL_TRIE_SY;
    private static final SubLString $str334$Trie_not_present___S;
    private static final SubLString $str335$Assertion_fails_OK_ASSERTION_FOR_;
    private static final SubLList $list336;
    private static final SubLList $list337;
    private static final SubLSymbol $sym338$NL_TRIE_SPEC_PREDICATES;
    private static final SubLSymbol $sym339$_NL_TRIE_SPEC_PREDICATES_CACHING_STATE_;
    private static final SubLInteger $int340$256;
    private static final SubLSymbol $sym341$CLEAR_NL_TRIE_SPEC_PREDICATES;
    private static final SubLList $list342;
    private static final SubLList $list343;
    private static final SubLList $list344;
    private static final SubLList $list345;
    private static final SubLSymbol $sym346$NL_TRIE_POS_FOR_SEMTRANS_PRED;
    private static final SubLSymbol $sym347$_NL_TRIE_POS_FOR_SEMTRANS_PRED_CACHING_STATE_;
    private static final SubLInteger $int348$128;
    private static final SubLSymbol $sym349$NL_TRIE_PRED_OK_FOR_POS_;
    private static final SubLSymbol $sym350$GENL_POS_;
    private static final SubLSymbol $sym351$GENL_POS_PRED_;
    private static final SubLSymbol $sym352$_NL_TRIE_PRED_OK_FOR_POS__CACHING_STATE_;
    private static final SubLInteger $int353$1024;
    private static final SubLSymbol $sym354$NL_TRIE_PREDS_LICENSED_BY_POS;
    private static final SubLSymbol $sym355$_NL_TRIE_PREDS_LICENSED_BY_POS_CACHING_STATE_;
    private static final SubLInteger $int356$32;
    private static final SubLString $str357$Caught_error_in_NL_TRIEFY_SEMANTI;
    private static final SubLList $list358;
    private static final SubLString $str359$Couldn_t_find_any_string_nl_trie_;
    private static final SubLList $list360;
    private static final SubLList $list361;
    private static final SubLList $list362;
    private static final SubLSymbol $sym363$GAF_ASSERTION_;
    private static final SubLSymbol $kw364$UNDETERMINED;
    private static final SubLList $list365;
    private static final SubLList $list366;
    private static final SubLSymbol $sym367$RELEVANT_PRED_IS_EQ;
    private static final SubLList $list368;
    private static final SubLObject $const369$compoundString;
    private static final SubLList $list370;
    private static final SubLObject $const371$multiWordString;
    private static final SubLString $str372$_;
    private static final SubLSymbol $kw373$AUGMENTED;
    private static final SubLSymbol $kw374$REDUNDANT;
    private static final SubLSymbol $kw375$ALL;
    private static final SubLSymbol $sym376$NL_TRIE_PREDS_OF_POS;
    private static final SubLObject $const377$speechPartPreds;
    private static final SubLObject $const378$Verb;
    private static final SubLSymbol $sym379$_NL_TRIE_PREDS_OF_POS_CACHING_STATE_;
    private static final SubLSymbol $sym380$NL_TRIE_POS_OF_PRED;
    private static final SubLSymbol $sym381$_NL_TRIE_POS_OF_PRED_CACHING_STATE_;
    private static final SubLList $list382;
    private static final SubLSymbol $sym383$NL_TRIE_BREAK_CHAR_P;
    private static final SubLList $list384;
    private static final SubLList $list385;
    private static final SubLString $str386$_;
    private static final SubLSymbol $sym387$DIGIT_CHAR_P;
    private static final SubLList $list388;
    private static final SubLString $str389$_a_is_not_currently_an_NL_Trie_;
    private static final SubLString $str390$Couldn_t_find_any_strings_to_add_;
    private static final SubLString $str391$Couldn_t_find_any_strings_to_remo;
    private static final SubLString $str392$error_;
    private static final SubLString $str393$Unable_to_determine_pragmatic_fea;
    private static final SubLObject $const394$pragmaticallyAcceptable;
    private static final SubLSymbol $sym395$FIND_POS_PREDS_FOR_LEX_CONST;
    private static final SubLList $list396;
    private static final SubLSymbol $sym397$SPEC_POS_PRED_;
    private static final SubLSymbol $sym398$_NL_TRIE_NAME_STRING_PREDS_SET_;
    private static final SubLList $list399;
    private static final SubLSymbol $sym400$_EXIT;
    private static final SubLSymbol $sym401$TRIEFY_NART;
    private static final SubLSymbol $sym402$NL_TRIE_P;
    private static final SubLSymbol $sym403$NL_TRIE_ITERATOR_DONE;
    private static final SubLSymbol $sym404$NL_TRIE_ITERATOR_NEXT;
    private static final SubLList $list405;
    private static final SubLSymbol $sym406$NL_TRIE_STRING_TOKENIZE;
    private static final SubLSymbol $kw407$TEST;
    private static final SubLSymbol $kw408$OWNER;
    private static final SubLSymbol $kw409$CLASSES;
    private static final SubLList $list410;
    private static final SubLSymbol $kw411$KB;
    private static final SubLSymbol $kw412$FULL;
    private static final SubLSymbol $kw413$WORKING_;
    private static final SubLList $list414;
    private static final SubLSymbol $sym415$TEST_SWAPPABLE_NL_TRIE_DUMP;
    private static final SubLSymbol $kw416$TINY;
    private static final SubLList $list417;
    private static final SubLString $str418$index;
    private static final SubLString $str419$data;
    private static final SubLSymbol $kw420$OUTPUT;
    private static final SubLSymbol $kw421$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym422$IGNORE_ERRORS_HANDLER;
    private static final SubLString $str423$_A;
    private static final SubLSymbol $kw424$SUCCESS;
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 6866L)
    public static SubLObject with_nl_trie_cache_strategy(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)nl_trie.$sym5$WITH_BACKED_MAP_CACHE_STRATEGY, (SubLObject)nl_trie.$list6, ConsesLow.append(body, (SubLObject)nl_trie.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 7172L)
    public static SubLObject without_nl_trie_cache_strategy(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)nl_trie.$sym5$WITH_BACKED_MAP_CACHE_STRATEGY, (SubLObject)nl_trie.$list7, ConsesLow.append(body, (SubLObject)nl_trie.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 7635L)
    public static SubLObject with_nl_trie_lock_held(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list10);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject reason = (SubLObject)nl_trie.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list10);
        reason = current.first();
        current = current.rest();
        if (nl_trie.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym11$WITH_LOCK_HELD, (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym8$_NL_TRIE_LOCK_, (SubLObject)nl_trie.$kw12$WHOSTATE, reason), (SubLObject)ConsesLow.listS((SubLObject)nl_trie.$sym13$WITH_FILE_VECTOR_BACKED_MAP_STREAM_LOCK, (SubLObject)nl_trie.$list14, ConsesLow.append(body, (SubLObject)nl_trie.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_trie.$list10);
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 7848L)
    public static SubLObject nl_trie_entry_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL != nl_trie_name_p(obj, (SubLObject)nl_trie.UNPROVIDED) || nl_trie.NIL != nl_trie_word_p(obj, (SubLObject)nl_trie.UNPROVIDED) || nl_trie.NIL != nl_trie_term_phrases_entry_p(obj, (SubLObject)nl_trie.UNPROVIDED) || nl_trie.NIL != nl_trie_lex_entry_p(obj, (SubLObject)nl_trie.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 8315L)
    public static SubLObject nl_trie_term_phrases_entry_p(final SubLObject obj, SubLObject robustP) {
        if (robustP == nl_trie.UNPROVIDED) {
            robustP = (SubLObject)nl_trie.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL != assertion_handles.assertion_p(obj) && (nl_trie.NIL == robustP || nl_trie.NIL != assertion_handles.valid_assertionP(obj, (SubLObject)nl_trie.UNPROVIDED)) && nl_trie.NIL != assertions_high.gaf_assertionP(obj) && assertions_high.gaf_arg0(obj).eql(nl_trie.$const15$termPhrases));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 8537L)
    public static SubLObject valid_nl_trie_entry_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL != nl_trie_name_p(obj, (SubLObject)nl_trie.T) || nl_trie.NIL != nl_trie_word_p(obj, (SubLObject)nl_trie.T) || nl_trie.NIL != nl_trie_term_phrases_entry_p(obj, (SubLObject)nl_trie.T) || nl_trie.NIL != nl_trie_lex_entry_p(obj, (SubLObject)nl_trie.T));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 8774L)
    public static SubLObject validate_nl_trie_entry_internal(final SubLObject obj) {
        if (nl_trie.NIL != nl_trie_name_p(obj, (SubLObject)nl_trie.UNPROVIDED)) {
            return validate_nl_trie_name(obj);
        }
        if (nl_trie.NIL != nl_trie_term_phrases_entry_p(obj, (SubLObject)nl_trie.UNPROVIDED)) {
            return validate_nl_trie_term_phrases_entry(obj);
        }
        if (nl_trie.NIL != nl_trie_word_p(obj, (SubLObject)nl_trie.UNPROVIDED)) {
            return validate_nl_trie_word(obj, (SubLObject)nl_trie.T);
        }
        if (nl_trie.NIL != nl_trie_lex_entry_p(obj, (SubLObject)nl_trie.UNPROVIDED)) {
            return validate_nl_trie_lex_entry(obj);
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 8774L)
    public static SubLObject validate_nl_trie_entry(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)nl_trie.NIL;
        if (nl_trie.NIL == v_memoization_state) {
            return validate_nl_trie_entry_internal(obj);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)nl_trie.$sym16$VALIDATE_NL_TRIE_ENTRY, (SubLObject)nl_trie.UNPROVIDED);
        if (nl_trie.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)nl_trie.$sym16$VALIDATE_NL_TRIE_ENTRY, (SubLObject)nl_trie.ONE_INTEGER, (SubLObject)nl_trie.$int17$200, (SubLObject)nl_trie.EQL, (SubLObject)nl_trie.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)nl_trie.$sym16$VALIDATE_NL_TRIE_ENTRY, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, obj, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(validate_nl_trie_entry_internal(obj)));
            memoization_state.caching_state_put(caching_state, obj, results, (SubLObject)nl_trie.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 9263L)
    public static SubLObject nl_trie_lex_entry_p(final SubLObject obj, SubLObject robustP) {
        if (robustP == nl_trie.UNPROVIDED) {
            robustP = (SubLObject)nl_trie.NIL;
        }
        return abstract_lexicon.lex_entry_p(obj);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 9465L)
    public static SubLObject validate_nl_trie_lex_entry(final SubLObject lex_entry) {
        return lex_entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 9586L)
    public static SubLObject nl_trie_lex_entry_get(final SubLObject entry, final SubLObject slot) {
        return methods.funcall_instance_method_with_1_args(entry, (SubLObject)nl_trie.$sym18$GET, slot);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 9792L)
    public static SubLObject print_nl_trie_entry(final SubLObject entry, final SubLObject stream, final SubLObject depth) {
        if (nl_trie.NIL != nl_trie_word_p(entry, (SubLObject)nl_trie.UNPROVIDED)) {
            return print_nl_trie_word(entry, stream, depth);
        }
        if (nl_trie.NIL != nl_trie_name_p(entry, (SubLObject)nl_trie.UNPROVIDED)) {
            return print_nl_trie_name(entry, stream, depth);
        }
        print_high.print(entry, stream);
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 10044L)
    public static SubLObject nl_trie_entry_type(final SubLObject entry) {
        if (nl_trie.NIL != nl_trie_name_p(entry, (SubLObject)nl_trie.T)) {
            return (SubLObject)nl_trie.$kw19$NAME;
        }
        if (nl_trie.NIL != nl_trie_word_p(entry, (SubLObject)nl_trie.UNPROVIDED)) {
            return (SubLObject)nl_trie.$kw20$WORD;
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 10191L)
    public static SubLObject nl_trie_entry_string(final SubLObject entry) {
        if (nl_trie.NIL != nl_trie_name_p(entry, (SubLObject)nl_trie.T)) {
            return nl_trie_name_string(entry);
        }
        if (nl_trie.NIL != nl_trie_term_phrases_entry_p(entry, (SubLObject)nl_trie.T)) {
            return cycl_string.cycl_string_to_utf8_string(assertions_high.gaf_arg3(entry));
        }
        if (nl_trie.NIL != nl_trie_word_p(entry, (SubLObject)nl_trie.UNPROVIDED)) {
            return nl_trie_word_string(entry);
        }
        if (nl_trie.NIL != nl_trie_lex_entry_p(entry, (SubLObject)nl_trie.UNPROVIDED)) {
            return cycl_string.cycl_string_to_utf8_string(nl_trie_lex_entry_get(entry, (SubLObject)nl_trie.$kw21$STRING));
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 10653L)
    public static SubLObject nl_trie_entry_keys(final SubLObject entry, SubLObject consider_adding_theP) {
        if (consider_adding_theP == nl_trie.UNPROVIDED) {
            consider_adding_theP = (SubLObject)nl_trie.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject raw_keys = nl_trie_string_tokenize_multiple(nl_trie_entry_string(entry));
        final SubLObject entry_mt = nl_trie_entry_mt(entry);
        SubLObject ans = conses_high.copy_list(raw_keys);
        SubLObject cdolist_list_var = raw_keys;
        SubLObject raw_key = (SubLObject)nl_trie.NIL;
        raw_key = cdolist_list_var.first();
        while (nl_trie.NIL != cdolist_list_var) {
            if (nl_trie.NIL != nl_trie_name_p(entry, (SubLObject)nl_trie.T)) {
                final SubLObject _prev_bind_0 = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.currentBinding(thread);
                try {
                    lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.bind((SubLObject)nl_trie.$kw23$OFF, thread);
                    if (nl_trie.NIL != list_utilities.lengthG(raw_key, (SubLObject)nl_trie.ONE_INTEGER, (SubLObject)nl_trie.UNPROVIDED) && raw_key.first().equalp(nl_trie.$english_definite_determiner$.getGlobalValue()) && !conses_high.second(raw_key).equalp(nl_trie.$english_definite_determiner$.getGlobalValue())) {
                        ans = (SubLObject)ConsesLow.cons(raw_key.rest(), ans);
                    }
                    else if (nl_trie.NIL != consider_adding_theP && nl_trie.NIL != nl_trie_name_ok_for_adding_theP(entry, entry_mt, raw_key)) {
                        final SubLObject the_ful = (SubLObject)ConsesLow.cons(nl_trie.$english_definite_determiner$.getGlobalValue(), raw_key);
                        ans = (SubLObject)ConsesLow.cons(the_ful, ans);
                    }
                }
                finally {
                    lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.rebind(_prev_bind_0, thread);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            raw_key = cdolist_list_var.first();
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 11560L)
    public static SubLObject do_nl_trie_names_with_added_the(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list24);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject name = (SubLObject)nl_trie.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list24);
        name = current.first();
        current = current.rest();
        if (nl_trie.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject v_strie = (SubLObject)nl_trie.$sym25$STRIE;
            final SubLObject key = (SubLObject)nl_trie.$sym26$KEY;
            final SubLObject entries = (SubLObject)nl_trie.$sym27$ENTRIES;
            return (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym28$WITH_NL_TRIE_CACHE_STRATEGY, (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym29$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(v_strie, (SubLObject)nl_trie.$list30)), (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym31$WITH_NL_TRIE_LOCK_HELD, (SubLObject)nl_trie.$list32, (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym33$DO_STRIE_PROGRESS, (SubLObject)ConsesLow.listS(key, entries, v_strie, (SubLObject)nl_trie.$list34), (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym35$CDOLIST, (SubLObject)ConsesLow.list(name, entries), (SubLObject)ConsesLow.listS((SubLObject)nl_trie.$sym36$PWHEN, (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym37$CAND, (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym38$NL_TRIE_NAME_P, name), (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym39$CNOT, (SubLObject)ConsesLow.listS((SubLObject)nl_trie.$sym40$SUBSTRING_MATCH_, (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym41$NL_TRIE_NAME_STRING, name), (SubLObject)nl_trie.$list42))), ConsesLow.append(body, (SubLObject)nl_trie.NIL)))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_trie.$list24);
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 12271L)
    public static SubLObject nl_trie_name_ok_for_adding_theP(final SubLObject entry, final SubLObject entry_mt, final SubLObject raw_key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject add_theP = (SubLObject)nl_trie.NIL;
        final SubLObject _prev_bind_0 = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.currentBinding(thread);
        try {
            lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.bind((SubLObject)nl_trie.$kw23$OFF, thread);
            add_theP = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL != lexicon_accessors.speech_partP(nl_trie.$const43$Noun, (SubLObject)nl_trie.UNPROVIDED) && nl_trie.NIL != list_utilities.lengthG(raw_key, (SubLObject)nl_trie.ONE_INTEGER, (SubLObject)nl_trie.UNPROVIDED) && nl_trie.NIL != string_is_non_name_nounP(list_utilities.last_one(raw_key), entry_mt) && nl_trie.NIL != lexicon_utilities.lexical_assertion_of_lexiconP(nl_trie.$const44$EnglishLexiconMt, entry, entry_mt) && nl_trie.NIL != nl_trie_name_pred_ok_for_adding_theP(nl_trie_name_pred(entry), entry_mt) && nl_trie.NIL != nl_trie_name_denot_ok_for_adding_theP(nl_trie_name_denot(entry), entry_mt));
        }
        finally {
            lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.rebind(_prev_bind_0, thread);
        }
        return add_theP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 12818L)
    public static SubLObject string_is_non_name_nounP(final SubLObject string, SubLObject mt) {
        if (mt == nl_trie.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject noun_preds = Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)nl_trie.ONE_INTEGER), lexicon_accessors.words_of_stringXspeech_part(string, nl_trie.$const43$Noun, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED));
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            noun_preds = Sequences.remove(nl_trie.$const45$properNounStrings, noun_preds, (SubLObject)nl_trie.$sym46$SPEC_PREDICATE_, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return list_utilities.non_empty_list_p(noun_preds);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 13146L)
    public static SubLObject nl_trie_dont_add_the_categories_internal(final SubLObject mt) {
        return ask_utilities.ask_variable((SubLObject)nl_trie.$sym48$_COLLECTION, (SubLObject)nl_trie.$list49, hlmt_czer.canonicalize_hlmt(el_utilities.make_binary_formula(nl_trie.$const50$MtUnionFn, nl_trie.$const51$EnglishMt, mt)), (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 13146L)
    public static SubLObject nl_trie_dont_add_the_categories(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)nl_trie.NIL;
        if (nl_trie.NIL == v_memoization_state) {
            return nl_trie_dont_add_the_categories_internal(mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)nl_trie.$sym47$NL_TRIE_DONT_ADD_THE_CATEGORIES, (SubLObject)nl_trie.UNPROVIDED);
        if (nl_trie.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)nl_trie.$sym47$NL_TRIE_DONT_ADD_THE_CATEGORIES, (SubLObject)nl_trie.ONE_INTEGER, (SubLObject)nl_trie.NIL, (SubLObject)nl_trie.EQL, (SubLObject)nl_trie.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)nl_trie.$sym47$NL_TRIE_DONT_ADD_THE_CATEGORIES, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(nl_trie_dont_add_the_categories_internal(mt)));
            memoization_state.caching_state_put(caching_state, mt, results, (SubLObject)nl_trie.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 13383L)
    public static SubLObject nl_trie_name_denot_ok_for_adding_theP(final SubLObject name_denot, final SubLObject mt) {
        if (nl_trie.NIL != nl_trie_being_initializedP((SubLObject)nl_trie.UNPROVIDED) && nl_trie.NIL != memoization_state.memoization_state_p(memoization_state.current_memoization_state())) {
            return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL == nl_trie_dont_add_the_term_p(name_denot, mt));
        }
        SubLObject badP = (SubLObject)nl_trie.NIL;
        if (nl_trie.NIL == badP) {
            SubLObject csome_list_var;
            SubLObject category;
            for (csome_list_var = nl_trie_dont_add_the_categories(mt), category = (SubLObject)nl_trie.NIL, category = csome_list_var.first(); nl_trie.NIL == badP && nl_trie.NIL != csome_list_var; badP = isa.isa_in_any_mtP(name_denot, category), csome_list_var = csome_list_var.rest(), category = csome_list_var.first()) {}
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL == badP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 13783L)
    public static SubLObject nl_trie_dont_add_the_term_p(final SubLObject name_denot, final SubLObject mt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL != forts.fort_p(name_denot) && nl_trie.NIL != set.set_memberP(name_denot, nl_trie_dont_add_the_terms(mt)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 13943L)
    public static SubLObject nl_trie_dont_add_the_terms_internal(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject terms = new_nl_trie_denot_set((SubLObject)nl_trie.UNPROVIDED);
        SubLObject cdolist_list_var = nl_trie_dont_add_the_categories(mt);
        SubLObject category = (SubLObject)nl_trie.NIL;
        category = cdolist_list_var.first();
        while (nl_trie.NIL != cdolist_list_var) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)nl_trie.$sym53$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(nl_trie.$const54$EverythingPSC, thread);
                SubLObject cdolist_list_var_$1 = isa.all_fort_instances(category, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
                SubLObject instance = (SubLObject)nl_trie.NIL;
                instance = cdolist_list_var_$1.first();
                while (nl_trie.NIL != cdolist_list_var_$1) {
                    set.set_add(instance, terms);
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    instance = cdolist_list_var_$1.first();
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            category = cdolist_list_var.first();
        }
        return terms;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 13943L)
    public static SubLObject nl_trie_dont_add_the_terms(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)nl_trie.NIL;
        if (nl_trie.NIL == v_memoization_state) {
            return nl_trie_dont_add_the_terms_internal(mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)nl_trie.$sym52$NL_TRIE_DONT_ADD_THE_TERMS, (SubLObject)nl_trie.UNPROVIDED);
        if (nl_trie.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)nl_trie.$sym52$NL_TRIE_DONT_ADD_THE_TERMS, (SubLObject)nl_trie.ONE_INTEGER, (SubLObject)nl_trie.NIL, (SubLObject)nl_trie.EQL, (SubLObject)nl_trie.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)nl_trie.$sym52$NL_TRIE_DONT_ADD_THE_TERMS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(nl_trie_dont_add_the_terms_internal(mt)));
            memoization_state.caching_state_put(caching_state, mt, results, (SubLObject)nl_trie.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 14221L)
    public static SubLObject nl_trie_name_pred_ok_for_adding_theP_internal(final SubLObject name_pred, final SubLObject mt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL == cyc_kernel.closed_query_success_result_p(inference_kernel.new_cyc_query((SubLObject)ConsesLow.list(nl_trie.$const56$dontAddTheToNamesWithPred, name_pred), hlmt_czer.canonicalize_hlmt(el_utilities.make_binary_formula(nl_trie.$const50$MtUnionFn, nl_trie.$const51$EnglishMt, mt)), (SubLObject)nl_trie.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 14221L)
    public static SubLObject nl_trie_name_pred_ok_for_adding_theP(final SubLObject name_pred, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)nl_trie.NIL;
        if (nl_trie.NIL == v_memoization_state) {
            return nl_trie_name_pred_ok_for_adding_theP_internal(name_pred, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)nl_trie.$sym55$NL_TRIE_NAME_PRED_OK_FOR_ADDING_THE_, (SubLObject)nl_trie.UNPROVIDED);
        if (nl_trie.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)nl_trie.$sym55$NL_TRIE_NAME_PRED_OK_FOR_ADDING_THE_, (SubLObject)nl_trie.TWO_INTEGER, (SubLObject)nl_trie.NIL, (SubLObject)nl_trie.EQL, (SubLObject)nl_trie.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)nl_trie.$sym55$NL_TRIE_NAME_PRED_OK_FOR_ADDING_THE_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(name_pred, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)nl_trie.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)nl_trie.NIL;
            collision = cdolist_list_var.first();
            while (nl_trie.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (name_pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (nl_trie.NIL != cached_args && nl_trie.NIL == cached_args.rest() && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(nl_trie_name_pred_ok_for_adding_theP_internal(name_pred, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(name_pred, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 14497L)
    public static SubLObject nl_trie_entry_pos(final SubLObject entry) {
        if (nl_trie.NIL != nl_trie_name_p(entry, (SubLObject)nl_trie.T)) {
            return (SubLObject)nl_trie.NIL;
        }
        if (nl_trie.NIL != nl_trie_term_phrases_entry_p(entry, (SubLObject)nl_trie.T)) {
            final SubLObject constraint = assertions_high.gaf_arg2(entry);
            return (SubLObject)((nl_trie.NIL != lexicon_accessors.speech_partP(constraint, (SubLObject)nl_trie.UNPROVIDED)) ? constraint : ((nl_trie.NIL != lexicon_accessors.speech_part_predP(constraint, (SubLObject)nl_trie.UNPROVIDED)) ? lexicon_accessors.pos_of_pred(constraint) : nl_trie.NIL));
        }
        if (nl_trie.NIL != nl_trie_word_p(entry, (SubLObject)nl_trie.UNPROVIDED)) {
            return nl_trie_word_pos(entry);
        }
        if (nl_trie.NIL != nl_trie_lex_entry_p(entry, (SubLObject)nl_trie.UNPROVIDED)) {
            return nl_trie_lex_entry_get(entry, (SubLObject)nl_trie.$kw57$CYC_POS);
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 14956L)
    public static SubLObject nl_trie_entry_pos_preds(final SubLObject entry) {
        if (nl_trie.NIL != nl_trie_name_p(entry, (SubLObject)nl_trie.T)) {
            return (SubLObject)nl_trie.NIL;
        }
        if (nl_trie.NIL != nl_trie_term_phrases_entry_p(entry, (SubLObject)nl_trie.T)) {
            final SubLObject constraint = assertions_high.gaf_arg2(entry);
            return (SubLObject)((nl_trie.NIL != lexicon_accessors.speech_part_predP(constraint, (SubLObject)nl_trie.UNPROVIDED)) ? ConsesLow.list(constraint) : ((nl_trie.NIL != lexicon_accessors.speech_partP(constraint, (SubLObject)nl_trie.UNPROVIDED)) ? lexicon_accessors.max_preds_of_pos(constraint) : nl_trie.NIL));
        }
        if (nl_trie.NIL != nl_trie_word_p(entry, (SubLObject)nl_trie.UNPROVIDED)) {
            return nl_trie_word_pos_preds(entry);
        }
        if (nl_trie.NIL != nl_trie_lex_entry_p(entry, (SubLObject)nl_trie.UNPROVIDED)) {
            return (SubLObject)ConsesLow.list(nl_trie_lex_entry_get(entry, (SubLObject)nl_trie.$kw58$PREDICATE));
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 15449L)
    public static SubLObject nl_trie_entry_denots(final SubLObject entry) {
        if (nl_trie.NIL != nl_trie_name_p(entry, (SubLObject)nl_trie.T)) {
            return (SubLObject)ConsesLow.list(nl_trie_name_denot(entry));
        }
        if (nl_trie.NIL != nl_trie_term_phrases_entry_p(entry, (SubLObject)nl_trie.T)) {
            return (SubLObject)ConsesLow.list(assertions_high.gaf_arg1(entry));
        }
        if (nl_trie.NIL != nl_trie_word_p(entry, (SubLObject)nl_trie.UNPROVIDED)) {
            return nl_trie_word_denots(entry);
        }
        if (nl_trie.NIL != nl_trie_lex_entry_p(entry, (SubLObject)nl_trie.UNPROVIDED)) {
            return nl_trie_lex_entry_get(entry, (SubLObject)nl_trie.$kw59$DENOTS);
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 15807L)
    public static SubLObject nl_trie_entry_preferred_denots(final SubLObject entry) {
        if (nl_trie.NIL != nl_trie_name_p(entry, (SubLObject)nl_trie.T)) {
            return nl_trie_name_preferred_denots(entry);
        }
        if (nl_trie.NIL != nl_trie_word_p(entry, (SubLObject)nl_trie.UNPROVIDED)) {
            return nl_trie_word_preferred_denots(entry);
        }
        if (nl_trie.NIL != nl_trie_lex_entry_p(entry, (SubLObject)nl_trie.UNPROVIDED)) {
            return (SubLObject)nl_trie.NIL;
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 16170L)
    public static SubLObject nl_trie_entry_semtrans_templates(final SubLObject entry) {
        if (nl_trie.NIL != nl_trie_word_p(entry, (SubLObject)nl_trie.UNPROVIDED)) {
            return nl_trie_word_semtrans_templates(entry);
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 16453L)
    public static SubLObject do_nl_trie_entry_denots(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list60);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject denot = (SubLObject)nl_trie.NIL;
        SubLObject entry = (SubLObject)nl_trie.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list60);
        denot = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list60);
        entry = current.first();
        current = current.rest();
        if (nl_trie.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)nl_trie.$sym61$PCOND, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)nl_trie.$sym38$NL_TRIE_NAME_P, entry, (SubLObject)nl_trie.$list62), (SubLObject)ConsesLow.listS((SubLObject)nl_trie.$sym29$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(denot, (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym63$NL_TRIE_NAME_DENOT, entry))), ConsesLow.append(body, (SubLObject)nl_trie.NIL))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)nl_trie.$sym64$NL_TRIE_TERM_PHRASES_ENTRY_P, entry, (SubLObject)nl_trie.$list62), (SubLObject)ConsesLow.listS((SubLObject)nl_trie.$sym29$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(denot, (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym65$GAF_ARG1, entry))), ConsesLow.append(body, (SubLObject)nl_trie.NIL))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym66$NL_TRIE_WORD_P, entry), (SubLObject)ConsesLow.listS((SubLObject)nl_trie.$sym67$DO_NL_TRIE_WORD_DENOTS, (SubLObject)ConsesLow.list(denot, entry), ConsesLow.append(body, (SubLObject)nl_trie.NIL))), ConsesLow.append((SubLObject)((nl_trie.NIL != subl_promotions.memberP((SubLObject)nl_trie.$kw68$CYC_SUBLOOP, reader.$features$.getDynamicValue(thread), (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED) && nl_trie.NIL != conses_high.member((SubLObject)nl_trie.$kw69$CYC_NL, reader.$features$.getDynamicValue(thread), (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED)) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym70$LEX_ENTRY_P, entry), (SubLObject)ConsesLow.listS((SubLObject)nl_trie.$sym35$CDOLIST, (SubLObject)ConsesLow.list(denot, (SubLObject)ConsesLow.listS((SubLObject)nl_trie.$sym71$NL_TRIE_LEX_ENTRY_GET, entry, (SubLObject)nl_trie.$list72)), ConsesLow.append(body, (SubLObject)nl_trie.NIL)))) : nl_trie.NIL), (SubLObject)nl_trie.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_trie.$list60);
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 17157L)
    public static SubLObject do_nl_trie_entry_strings(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list73);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject string = (SubLObject)nl_trie.NIL;
        SubLObject entry = (SubLObject)nl_trie.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list73);
        string = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list73);
        entry = current.first();
        current = current.rest();
        if (nl_trie.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)nl_trie.$sym61$PCOND, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)nl_trie.$sym38$NL_TRIE_NAME_P, entry, (SubLObject)nl_trie.$list62), (SubLObject)ConsesLow.listS((SubLObject)nl_trie.$sym29$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(string, (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym74$NL_TRIE_NAME_STRING_MACRO_HELPER, entry))), ConsesLow.append(body, (SubLObject)nl_trie.NIL))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)nl_trie.$sym64$NL_TRIE_TERM_PHRASES_ENTRY_P, entry, (SubLObject)nl_trie.$list62), (SubLObject)ConsesLow.listS((SubLObject)nl_trie.$sym29$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(string, (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym75$GAF_ARG3, entry))), ConsesLow.append(body, (SubLObject)nl_trie.NIL))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym66$NL_TRIE_WORD_P, entry), (SubLObject)ConsesLow.listS((SubLObject)nl_trie.$sym76$DO_NL_TRIE_WORD_STRINGS, (SubLObject)ConsesLow.list(string, entry), ConsesLow.append(body, (SubLObject)nl_trie.NIL))), ConsesLow.append((SubLObject)((nl_trie.NIL != subl_promotions.memberP((SubLObject)nl_trie.$kw68$CYC_SUBLOOP, reader.$features$.getDynamicValue(thread), (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED) && nl_trie.NIL != conses_high.member((SubLObject)nl_trie.$kw69$CYC_NL, reader.$features$.getDynamicValue(thread), (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED)) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym70$LEX_ENTRY_P, entry), (SubLObject)ConsesLow.listS((SubLObject)nl_trie.$sym29$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(string, (SubLObject)ConsesLow.listS((SubLObject)nl_trie.$sym71$NL_TRIE_LEX_ENTRY_GET, entry, (SubLObject)nl_trie.$list77))), ConsesLow.append(body, (SubLObject)nl_trie.NIL)))) : nl_trie.NIL), (SubLObject)nl_trie.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_trie.$list73);
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 18027L)
    public static SubLObject nl_trie_name_string_macro_helper(final SubLObject name) {
        return nl_trie_name_string(name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 18161L)
    public static SubLObject do_nl_trie_word_syntactic_supports(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list79);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject support = (SubLObject)nl_trie.NIL;
        SubLObject word = (SubLObject)nl_trie.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list79);
        support = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list79);
        word = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)nl_trie.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)nl_trie.NIL;
        SubLObject current_$2 = (SubLObject)nl_trie.NIL;
        while (nl_trie.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)nl_trie.$list79);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)nl_trie.$list79);
            if (nl_trie.NIL == conses_high.member(current_$2, (SubLObject)nl_trie.$list80, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED)) {
                bad = (SubLObject)nl_trie.T;
            }
            if (current_$2 == nl_trie.$kw81$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (nl_trie.NIL != bad && nl_trie.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_trie.$list79);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)nl_trie.$kw82$DONE, current);
        final SubLObject done = (SubLObject)((nl_trie.NIL != done_tail) ? conses_high.cadr(done_tail) : nl_trie.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)nl_trie.$sym83$DO_SET, (SubLObject)ConsesLow.list(support, (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym84$NL_TRIE_WORD_SYNTACTIC_SUPPORT_SET, word), (SubLObject)nl_trie.$kw82$DONE, done), ConsesLow.append(body, (SubLObject)nl_trie.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 18351L)
    public static SubLObject do_nl_trie_word_semantic_supports(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list79);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject support = (SubLObject)nl_trie.NIL;
        SubLObject word = (SubLObject)nl_trie.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list79);
        support = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list79);
        word = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)nl_trie.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)nl_trie.NIL;
        SubLObject current_$3 = (SubLObject)nl_trie.NIL;
        while (nl_trie.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)nl_trie.$list79);
            current_$3 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)nl_trie.$list79);
            if (nl_trie.NIL == conses_high.member(current_$3, (SubLObject)nl_trie.$list80, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED)) {
                bad = (SubLObject)nl_trie.T;
            }
            if (current_$3 == nl_trie.$kw81$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (nl_trie.NIL != bad && nl_trie.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_trie.$list79);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)nl_trie.$kw82$DONE, current);
        final SubLObject done = (SubLObject)((nl_trie.NIL != done_tail) ? conses_high.cadr(done_tail) : nl_trie.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)nl_trie.$sym83$DO_SET, (SubLObject)ConsesLow.list(support, (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym85$NL_TRIE_WORD_SEMANTIC_SUPPORT_SET, word), (SubLObject)nl_trie.$kw82$DONE, done), ConsesLow.append(body, (SubLObject)nl_trie.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 18538L)
    public static SubLObject nl_trie_entry_semantic_pred(final SubLObject entry, SubLObject use_abbrev_predP) {
        if (use_abbrev_predP == nl_trie.UNPROVIDED) {
            use_abbrev_predP = (SubLObject)nl_trie.T;
        }
        if (nl_trie.NIL != nl_trie_name_p(entry, (SubLObject)nl_trie.T)) {
            return nl_trie_name_pred(entry);
        }
        if (nl_trie.NIL != nl_trie_term_phrases_entry_p(entry, (SubLObject)nl_trie.T)) {
            return nl_trie.$const15$termPhrases;
        }
        if (nl_trie.NIL != nl_trie_word_p(entry, (SubLObject)nl_trie.UNPROVIDED)) {
            return nl_trie_word_sem_pred(entry, use_abbrev_predP);
        }
        if (nl_trie.NIL != nl_trie_lex_entry_p(entry, (SubLObject)nl_trie.UNPROVIDED)) {
            return nl_trie_lex_entry_get(entry, (SubLObject)nl_trie.$kw58$PREDICATE);
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 18939L)
    public static SubLObject nl_trie_entry_mt(final SubLObject entry) {
        if (nl_trie.NIL != assertion_handles.assertion_p(entry)) {
            return assertions_high.assertion_mt(entry);
        }
        if (nl_trie.NIL != nl_trie_word_p(entry, (SubLObject)nl_trie.UNPROVIDED)) {
            return nl_trie_word_syntax_mt(entry);
        }
        if (nl_trie.NIL != nl_trie_lex_entry_p(entry, (SubLObject)nl_trie.UNPROVIDED)) {
            return nl_trie_lex_entry_get(entry, (SubLObject)nl_trie.$kw86$MT);
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 19196L)
    public static SubLObject nl_trie_entry_semantic_mt(final SubLObject entry) {
        if (nl_trie.NIL != assertion_handles.assertion_p(entry)) {
            return assertions_high.assertion_mt(entry);
        }
        if (nl_trie.NIL != nl_trie_word_p(entry, (SubLObject)nl_trie.UNPROVIDED)) {
            return nl_trie_word_semantics_mt(entry);
        }
        if (nl_trie.NIL != nl_trie_lex_entry_p(entry, (SubLObject)nl_trie.UNPROVIDED)) {
            return nl_trie_lex_entry_get(entry, (SubLObject)nl_trie.$kw86$MT);
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 19465L)
    public static SubLObject nl_trie_entry_semantic_support_set(final SubLObject entry) {
        if (nl_trie.NIL != nl_trie_name_p(entry, (SubLObject)nl_trie.UNPROVIDED)) {
            final SubLObject result_set = set.new_set((SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
            set.set_add(entry, result_set);
            return result_set;
        }
        if (nl_trie.NIL != nl_trie_word_p(entry, (SubLObject)nl_trie.UNPROVIDED)) {
            return nl_trie_word_semantic_support_set(entry);
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 19756L)
    public static SubLObject nl_trie_entry_semantic_support_list(final SubLObject entry) {
        if (nl_trie.NIL != nl_trie_name_p(entry, (SubLObject)nl_trie.UNPROVIDED)) {
            return (SubLObject)ConsesLow.list(entry);
        }
        if (nl_trie.NIL != nl_trie_word_p(entry, (SubLObject)nl_trie.UNPROVIDED)) {
            return nl_trie_word_semantic_support_list(entry);
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 19980L)
    public static SubLObject nl_trie_insert_entry(final SubLObject v_nl_trie, final SubLObject key0, final SubLObject entry) {
        final SubLObject key = unicode_nauts.convert_unicode_nauts_to_utf8_strings(key0);
        if (nl_trie.NIL != nl_trie_word_p(entry, (SubLObject)nl_trie.UNPROVIDED)) {
            return nl_trie_insert_word(v_nl_trie, key, entry);
        }
        if (nl_trie.NIL != nl_trie_name_p(entry, (SubLObject)nl_trie.UNPROVIDED)) {
            return nl_trie_insert_name(v_nl_trie, key, entry);
        }
        if (nl_trie.NIL != nl_trie_entry_p(entry)) {
            return nl_trie_insert_low(v_nl_trie, key, entry);
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 20385L)
    public static SubLObject nl_trie_delete_entry(final SubLObject v_nl_trie, final SubLObject key0, final SubLObject entry) {
        final SubLObject key = unicode_nauts.convert_unicode_nauts_to_utf8_strings(key0);
        if (nl_trie.NIL != nl_trie_word_p(entry, (SubLObject)nl_trie.UNPROVIDED)) {
            nl_trie_delete_word(v_nl_trie, key, entry);
        }
        else if (nl_trie.NIL != nl_trie_name_p(entry, (SubLObject)nl_trie.UNPROVIDED)) {
            nl_trie_delete_name(v_nl_trie, key, entry);
        }
        else if (nl_trie.NIL != nl_trie_entry_p(entry)) {
            nl_trie_unassociate(key, entry, v_nl_trie);
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 20762L)
    public static SubLObject nl_trie_entry_pragmatics(final SubLObject entry) {
        if (nl_trie.NIL != nl_trie_name_p(entry, (SubLObject)nl_trie.UNPROVIDED)) {
            return get_nl_trie_name_pragmatic_features(entry);
        }
        if (nl_trie.NIL != nl_trie_term_phrases_entry_p(entry, (SubLObject)nl_trie.UNPROVIDED)) {
            return get_assertion_pragmatic_features(entry);
        }
        if (nl_trie.NIL != nl_trie_word_p(entry, (SubLObject)nl_trie.UNPROVIDED)) {
            final SubLObject semantic_support = nl_trie_word_arbitrary_semantic_support(entry);
            return nl_trie_word_semantic_support_pragmatics(semantic_support);
        }
        if (nl_trie.NIL != nl_trie_lex_entry_p(entry, (SubLObject)nl_trie.UNPROVIDED)) {
            return nl_trie_lex_entry_get(entry, (SubLObject)nl_trie.$kw87$PRAGMATICS);
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 21265L)
    public static SubLObject nl_trie_word_semantic_support_pragmatics(final SubLObject semantic_support) {
        return (SubLObject)((nl_trie.NIL != assertions_high.gaf_assertionP(semantic_support)) ? get_assertion_pragmatic_features(semantic_support) : nl_trie.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 21447L)
    public static SubLObject nl_trie_entry_to_javalists(final SubLObject nl_trie_entry) {
        assert nl_trie.NIL != nl_trie_entry_p(nl_trie_entry) : nl_trie_entry;
        SubLObject javalists = (SubLObject)nl_trie.NIL;
        final SubLObject string = nl_trie_entry_string(nl_trie_entry);
        SubLObject cdolist_list_var;
        final SubLObject denots = cdolist_list_var = nl_trie_entry_denots(nl_trie_entry);
        SubLObject denot = (SubLObject)nl_trie.NIL;
        denot = cdolist_list_var.first();
        while (nl_trie.NIL != cdolist_list_var) {
            final SubLObject java_item = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(string, (SubLObject)ConsesLow.list(pph_utilities.new_pph_javalist_item(string, denot, (SubLObject)nl_trie.NIL, (SubLObject)nl_trie.NIL, (SubLObject)nl_trie.NIL, (SubLObject)nl_trie.ZERO_INTEGER))), denot);
            SubLObject cdolist_list_var_$4;
            final SubLObject java_list = cdolist_list_var_$4 = (SubLObject)ConsesLow.list(java_item);
            SubLObject java_list_item = (SubLObject)nl_trie.NIL;
            java_list_item = cdolist_list_var_$4.first();
            while (nl_trie.NIL != cdolist_list_var_$4) {
                javalists = (SubLObject)ConsesLow.cons(java_list_item, javalists);
                cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                java_list_item = cdolist_list_var_$4.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            denot = cdolist_list_var.first();
        }
        javalists = Sequences.delete_duplicates(javalists, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
        return Values.values(javalists, Sequences.nreverse(denots));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 22167L)
    public static SubLObject javalist_string(final SubLObject javalist) {
        return javalist.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 22271L)
    public static SubLObject nl_trie_word_p(final SubLObject obj, SubLObject robustP) {
        if (robustP == nl_trie.UNPROVIDED) {
            robustP = (SubLObject)nl_trie.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL != nl_trie_word_struc_p(obj) && (nl_trie.NIL != lexicon_macros.assume_nl_trie_validP() || nl_trie.NIL == robustP || nl_trie.NIL != nl_trie_word_struc_valid_p(obj)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 22685L)
    public static SubLObject has_bad_syntactic_support_p(final SubLObject word) {
        SubLObject badP = (SubLObject)nl_trie.NIL;
        final SubLObject set_var = nl_trie_word_syntactic_support_set(word);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject support;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)nl_trie.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); nl_trie.NIL == badP && nl_trie.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            support = set_contents.do_set_contents_next(basis_object, state);
            if (nl_trie.NIL != set_contents.do_set_contents_element_validP(state, support)) {
                badP = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL == valid_nl_trie_word_syntactic_support_p(support));
            }
        }
        return badP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 22926L)
    public static SubLObject nl_trie_word_copy(final SubLObject word) {
        final SubLObject syntactic_supports = set.copy_set(nl_trie_word_syntactic_support_set(word));
        final SubLObject semantic_supports = set.copy_set(nl_trie_word_semantic_support_set(word));
        return new_nl_trie_word(syntactic_supports, semantic_supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 23196L)
    public static SubLObject nl_trie_word_support_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL != assertion_handles.assertion_p(v_object) || nl_trie.NIL != nl_trie_word_hl_support_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 23321L)
    public static SubLObject validate_nl_trie_word(final SubLObject word, SubLObject robustP) {
        if (robustP == nl_trie.UNPROVIDED) {
            robustP = (SubLObject)nl_trie.NIL;
        }
        SubLObject bad_syntactic_supports = (SubLObject)nl_trie.NIL;
        SubLObject set_var = nl_trie_word_syntactic_support_set(word);
        SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject syntactic_support;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)nl_trie.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); nl_trie.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            syntactic_support = set_contents.do_set_contents_next(basis_object, state);
            if (nl_trie.NIL != set_contents.do_set_contents_element_validP(state, syntactic_support) && nl_trie.NIL == valid_nl_trie_word_syntactic_support_p(syntactic_support)) {
                bad_syntactic_supports = (SubLObject)ConsesLow.cons(syntactic_support, bad_syntactic_supports);
            }
        }
        if (nl_trie.NIL != bad_syntactic_supports) {
            SubLObject cdolist_list_var = bad_syntactic_supports;
            SubLObject bad_syntactic_support = (SubLObject)nl_trie.NIL;
            bad_syntactic_support = cdolist_list_var.first();
            while (nl_trie.NIL != cdolist_list_var) {
                nl_trie_warn((SubLObject)nl_trie.TWO_INTEGER, (SubLObject)nl_trie.$str89$Removing_bad_syntactic_support___, bad_syntactic_support, word, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
                nl_trie_word_remove_syntactic_support(word, bad_syntactic_support);
                cdolist_list_var = cdolist_list_var.rest();
                bad_syntactic_support = cdolist_list_var.first();
            }
        }
        if (nl_trie.NIL != set.set_emptyP(nl_trie_word_syntactic_support_set(word))) {
            return (SubLObject)nl_trie.NIL;
        }
        SubLObject bad_semantic_supports = (SubLObject)nl_trie.NIL;
        set_var = nl_trie_word_semantic_support_set(word);
        set_contents_var = set.do_set_internal(set_var);
        SubLObject semantic_support;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)nl_trie.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); nl_trie.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            semantic_support = set_contents.do_set_contents_next(basis_object, state);
            if (nl_trie.NIL != set_contents.do_set_contents_element_validP(state, semantic_support) && nl_trie.NIL == validate_nl_trie_word_semantic_support(semantic_support, robustP)) {
                bad_semantic_supports = (SubLObject)ConsesLow.cons(semantic_support, bad_semantic_supports);
            }
        }
        if (nl_trie.NIL != bad_semantic_supports) {
            SubLObject cdolist_list_var = bad_semantic_supports;
            SubLObject bad_semantic_support = (SubLObject)nl_trie.NIL;
            bad_semantic_support = cdolist_list_var.first();
            while (nl_trie.NIL != cdolist_list_var) {
                nl_trie_warn((SubLObject)nl_trie.TWO_INTEGER, (SubLObject)nl_trie.$str90$Removing_bad_semantic_support___S, bad_semantic_support, word, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
                nl_trie_word_remove_semantic_support(word, bad_semantic_support);
                cdolist_list_var = cdolist_list_var.rest();
                bad_semantic_support = cdolist_list_var.first();
            }
        }
        return word;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 24552L)
    public static SubLObject nl_trie_word_struc_valid_p_internal(final SubLObject word) {
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL != nl_trie_word_struc_p(word) && nl_trie.NIL != nl_trie_word_valid_syntactic_support_set_p(nl_trie_word_syntactic_support_set(word)) && nl_trie.NIL != nl_trie_word_valid_semantic_support_set_p(nl_trie_word_semantic_support_set(word)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 24552L)
    public static SubLObject nl_trie_word_struc_valid_p(final SubLObject word) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)nl_trie.NIL;
        if (nl_trie.NIL == v_memoization_state) {
            return nl_trie_word_struc_valid_p_internal(word);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)nl_trie.$sym91$NL_TRIE_WORD_STRUC_VALID_P, (SubLObject)nl_trie.UNPROVIDED);
        if (nl_trie.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)nl_trie.$sym91$NL_TRIE_WORD_STRUC_VALID_P, (SubLObject)nl_trie.ONE_INTEGER, (SubLObject)nl_trie.$int17$200, (SubLObject)nl_trie.EQL, (SubLObject)nl_trie.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)nl_trie.$sym91$NL_TRIE_WORD_STRUC_VALID_P, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, word, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(nl_trie_word_struc_valid_p_internal(word)));
            memoization_state.caching_state_put(caching_state, word, results, (SubLObject)nl_trie.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 25371L)
    public static SubLObject nl_trie_valid_assertionP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL != assertion_handles.assertion_p(v_object) && (nl_trie.NIL != lexicon_macros.assume_nl_trie_validP() || nl_trie.NIL != nl_trie_valid_assertionP_memoized(v_object, (SubLObject)nl_trie.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 25605L)
    public static SubLObject nl_trie_valid_assertionP_memoized_internal(final SubLObject assertion, SubLObject robustP) {
        if (robustP == nl_trie.UNPROVIDED) {
            robustP = (SubLObject)nl_trie.T;
        }
        return assertion_handles.valid_assertionP(assertion, robustP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 25605L)
    public static SubLObject nl_trie_valid_assertionP_memoized(final SubLObject assertion, SubLObject robustP) {
        if (robustP == nl_trie.UNPROVIDED) {
            robustP = (SubLObject)nl_trie.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)nl_trie.NIL;
        if (nl_trie.NIL == v_memoization_state) {
            return nl_trie_valid_assertionP_memoized_internal(assertion, robustP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)nl_trie.$sym92$NL_TRIE_VALID_ASSERTION__MEMOIZED, (SubLObject)nl_trie.UNPROVIDED);
        if (nl_trie.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)nl_trie.$sym92$NL_TRIE_VALID_ASSERTION__MEMOIZED, (SubLObject)nl_trie.TWO_INTEGER, (SubLObject)nl_trie.$int93$500, (SubLObject)nl_trie.EQL, (SubLObject)nl_trie.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)nl_trie.$sym92$NL_TRIE_VALID_ASSERTION__MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(assertion, robustP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)nl_trie.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)nl_trie.NIL;
            collision = cdolist_list_var.first();
            while (nl_trie.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (assertion.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (nl_trie.NIL != cached_args && nl_trie.NIL == cached_args.rest() && robustP.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(nl_trie_valid_assertionP_memoized_internal(assertion, robustP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(assertion, robustP));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 25858L)
    public static SubLObject valid_nl_trie_word_syntactic_support_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL != nl_trie_valid_assertionP(v_object) || nl_trie.NIL != valid_nl_trie_word_hl_syntactic_support_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 26028L)
    public static SubLObject valid_nl_trie_word_semantic_support_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL != nl_trie_valid_assertionP(v_object) || nl_trie.NIL != valid_nl_trie_word_hl_semantic_support_p(v_object, (SubLObject)nl_trie.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 26196L)
    public static SubLObject nl_trie_word_semantic_support_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL != assertion_handles.assertion_p(v_object) || nl_trie.NIL != nl_trie_word_hl_semantic_support_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 26339L)
    public static SubLObject nl_trie_word_syntactic_support_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL != assertion_handles.assertion_p(v_object) || nl_trie.NIL != nl_trie_word_hl_syntactic_support_p(v_object, (SubLObject)nl_trie.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 26484L)
    public static SubLObject validate_nl_trie_word_semantic_support(final SubLObject v_object, SubLObject robustP) {
        if (robustP == nl_trie.UNPROVIDED) {
            robustP = (SubLObject)nl_trie.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL != nl_trie_valid_assertionP(v_object) || nl_trie.NIL != validate_nl_trie_word_hl_semantic_support(v_object, robustP));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 26680L)
    public static SubLObject nl_trie_word_hl_support_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL != nl_trie_word_hl_syntactic_support_p(v_object, (SubLObject)nl_trie.UNPROVIDED) || nl_trie.NIL != nl_trie_word_hl_semantic_support_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 26841L)
    public static SubLObject valid_nl_trie_word_hl_syntactic_support_p(final SubLObject v_object) {
        return nl_trie_word_hl_syntactic_support_p(v_object, (SubLObject)nl_trie.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 26965L)
    public static SubLObject nl_trie_word_hl_syntactic_support_p(final SubLObject v_object, SubLObject robustP) {
        if (robustP == nl_trie.UNPROVIDED) {
            robustP = (SubLObject)nl_trie.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isCons() && nl_trie.NIL != el_utilities.el_formula_p(v_object.first()) && (nl_trie.NIL == robustP || nl_trie.NIL == list_utilities.tree_find_if((SubLObject)nl_trie.$sym94$INVALID_FORT_, v_object, (SubLObject)nl_trie.UNPROVIDED)) && nl_trie.NIL != hlmt.hlmt_p(v_object.rest()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 27209L)
    public static SubLObject nl_trie_justify_hl_syntactic_support(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject meta_supports = (SubLObject)nl_trie.NIL;
        SubLObject sentence = (SubLObject)nl_trie.NIL;
        SubLObject mt = (SubLObject)nl_trie.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)nl_trie.$list95);
        sentence = support.first();
        final SubLObject current = mt = support.rest();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (nl_trie.NIL != el_utilities.formula_arityE(sentence, (SubLObject)nl_trie.TWO_INTEGER, (SubLObject)nl_trie.UNPROVIDED)) {
                SubLObject current_$6;
                final SubLObject datum_$5 = current_$6 = sentence;
                SubLObject pred = (SubLObject)nl_trie.NIL;
                SubLObject word = (SubLObject)nl_trie.NIL;
                SubLObject string = (SubLObject)nl_trie.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$6, datum_$5, (SubLObject)nl_trie.$list96);
                pred = current_$6.first();
                current_$6 = current_$6.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$6, datum_$5, (SubLObject)nl_trie.$list96);
                word = current_$6.first();
                current_$6 = current_$6.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$6, datum_$5, (SubLObject)nl_trie.$list96);
                string = current_$6.first();
                current_$6 = current_$6.rest();
                if (nl_trie.NIL == current_$6) {
                    if (nl_trie.NIL == meta_supports) {
                        SubLObject csome_list_var = lexicon_cache.inference_strings_of_wordXpred(word, pred);
                        SubLObject supported_string = (SubLObject)nl_trie.NIL;
                        supported_string = csome_list_var.first();
                        while (nl_trie.NIL == meta_supports && nl_trie.NIL != csome_list_var) {
                            SubLObject current_$7;
                            final SubLObject datum_$6 = current_$7 = supported_string;
                            SubLObject this_string = (SubLObject)nl_trie.NIL;
                            SubLObject supports = (SubLObject)nl_trie.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current_$7, datum_$6, (SubLObject)nl_trie.$list97);
                            this_string = current_$7.first();
                            current_$7 = (supports = current_$7.rest());
                            if (this_string.equal(string)) {
                                meta_supports = supports;
                            }
                            csome_list_var = csome_list_var.rest();
                            supported_string = csome_list_var.first();
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$5, (SubLObject)nl_trie.$list96);
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return meta_supports;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 27741L)
    public static SubLObject nl_trie_word_hl_semantic_support_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isVector() && (nl_trie.NIL == Vectors.aref(v_object, (SubLObject)nl_trie.ONE_INTEGER) || nl_trie.NIL != hlmt.hlmt_p(Vectors.aref(v_object, (SubLObject)nl_trie.ONE_INTEGER))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 27899L)
    public static SubLObject valid_nl_trie_word_hl_semantic_support_p(final SubLObject v_object, SubLObject robustP) {
        if (robustP == nl_trie.UNPROVIDED) {
            robustP = (SubLObject)nl_trie.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isVector() && nl_trie.NIL != set.set_p(Vectors.aref(v_object, (SubLObject)nl_trie.ZERO_INTEGER)) && nl_trie.$nl_trie_denot_set_test$.getGlobalValue().eql(set.set_test(Vectors.aref(v_object, (SubLObject)nl_trie.ZERO_INTEGER))) && (nl_trie.NIL == Vectors.aref(v_object, (SubLObject)nl_trie.ONE_INTEGER) || nl_trie.NIL != hlmt.hlmt_p(Vectors.aref(v_object, (SubLObject)nl_trie.ONE_INTEGER))) && (nl_trie.NIL == robustP || nl_trie.NIL != valid_nl_trie_word_denot_set_p(Vectors.aref(v_object, (SubLObject)nl_trie.ZERO_INTEGER))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 28249L)
    public static SubLObject valid_nl_trie_word_denot_set_p(final SubLObject v_set) {
        SubLObject badP = (SubLObject)nl_trie.NIL;
        final SubLObject set_contents_var = set.do_set_internal(v_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject denot;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)nl_trie.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); nl_trie.NIL == badP && nl_trie.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            denot = set_contents.do_set_contents_next(basis_object, state);
            if (nl_trie.NIL != set_contents.do_set_contents_element_validP(state, denot)) {
                badP = invalid_nl_trie_word_denotP(denot);
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL == badP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 28439L)
    public static SubLObject validate_nl_trie_word_hl_semantic_support(final SubLObject v_object, SubLObject robustP) {
        if (robustP == nl_trie.UNPROVIDED) {
            robustP = (SubLObject)nl_trie.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isVector() && nl_trie.NIL != set.set_p(Vectors.aref(v_object, (SubLObject)nl_trie.ZERO_INTEGER)) && nl_trie.$nl_trie_denot_set_test$.getGlobalValue().eql(set.set_test(Vectors.aref(v_object, (SubLObject)nl_trie.ZERO_INTEGER))) && (nl_trie.NIL == Vectors.aref(v_object, (SubLObject)nl_trie.ONE_INTEGER) || nl_trie.NIL != hlmt.hlmt_p(Vectors.aref(v_object, (SubLObject)nl_trie.ONE_INTEGER))) && (nl_trie.NIL == robustP || nl_trie.NIL != validate_nl_trie_word_denot_set(Vectors.aref(v_object, (SubLObject)nl_trie.ZERO_INTEGER))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 28791L)
    public static SubLObject validate_nl_trie_word_denot_set(final SubLObject v_set) {
        SubLObject bad = (SubLObject)nl_trie.NIL;
        final SubLObject set_contents_var = set.do_set_internal(v_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject denot;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)nl_trie.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); nl_trie.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            denot = set_contents.do_set_contents_next(basis_object, state);
            if (nl_trie.NIL != set_contents.do_set_contents_element_validP(state, denot) && nl_trie.NIL != invalid_nl_trie_word_denotP(denot)) {
                nl_trie_warn((SubLObject)nl_trie.TWO_INTEGER, (SubLObject)nl_trie.$str98$Removing_invalid_denot___S, denot, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
                bad = (SubLObject)ConsesLow.cons(denot, bad);
            }
        }
        SubLObject cdolist_list_var = bad;
        SubLObject bad_one = (SubLObject)nl_trie.NIL;
        bad_one = cdolist_list_var.first();
        while (nl_trie.NIL != cdolist_list_var) {
            set.set_remove(bad_one, v_set);
            cdolist_list_var = cdolist_list_var.rest();
            bad_one = cdolist_list_var.first();
        }
        return (SubLObject)nl_trie.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 29188L)
    public static SubLObject invalid_nl_trie_word_denotP(final SubLObject denot) {
        SubLObject badP = (SubLObject)nl_trie.NIL;
        if (nl_trie.NIL == badP) {
            SubLObject csome_list_var = nl_trie.$nl_trie_word_denot_invalidity_tests$.getGlobalValue();
            SubLObject test = (SubLObject)nl_trie.NIL;
            test = csome_list_var.first();
            while (nl_trie.NIL == badP && nl_trie.NIL != csome_list_var) {
                if (nl_trie.NIL != Functions.funcall(test, denot)) {
                    badP = (SubLObject)nl_trie.T;
                }
                csome_list_var = csome_list_var.rest();
                test = csome_list_var.first();
            }
        }
        return badP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 29392L)
    public static SubLObject nl_trie_denot_has_invalid_constantP(final SubLObject denot) {
        return cycl_utilities.expression_find_if((SubLObject)nl_trie.$sym100$INVALID_CONSTANT_, denot, (SubLObject)nl_trie.T, (SubLObject)nl_trie.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 29510L)
    public static SubLObject find_or_create_nl_trie_word_syn_support(final SubLObject sentence, final SubLObject mt, SubLObject string) {
        if (string == nl_trie.UNPROVIDED) {
            string = (SubLObject)nl_trie.NIL;
        }
        if (string.isString()) {
            final SubLObject existing = nl_trie_find_syntactic_support(sentence, mt, string);
            if (nl_trie.NIL != nl_trie_word_syntactic_support_p(existing)) {
                return existing;
            }
        }
        final SubLObject as = kb_indexing.find_gaf_genl_mts(sentence, mt);
        if (nl_trie.NIL != assertion_handles.assertion_p(as)) {
            return as;
        }
        return make_nl_trie_word_hl_syn_support(sentence, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 30078L)
    public static SubLObject nl_trie_find_syntactic_support(final SubLObject sentence, final SubLObject mt, final SubLObject string) {
        SubLObject matching_syn_support = (SubLObject)nl_trie.NIL;
        final SubLObject entries = nl_trie_search(string, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
        if (entries.isList() && nl_trie.NIL == matching_syn_support) {
            SubLObject csome_list_var = entries;
            SubLObject entry = (SubLObject)nl_trie.NIL;
            entry = csome_list_var.first();
            while (nl_trie.NIL == matching_syn_support && nl_trie.NIL != csome_list_var) {
                if (nl_trie.NIL != nl_trie_word_p(entry, (SubLObject)nl_trie.UNPROVIDED) && mt.eql(nl_trie_word_syntax_mt(entry))) {
                    final SubLObject set_var = nl_trie_word_syntactic_support_set(entry);
                    final SubLObject set_contents_var = set.do_set_internal(set_var);
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject syn_support;
                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)nl_trie.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); nl_trie.NIL == matching_syn_support && nl_trie.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        syn_support = set_contents.do_set_contents_next(basis_object, state);
                        if (nl_trie.NIL != set_contents.do_set_contents_element_validP(state, syn_support) && sentence.equal(nl_trie_word_support_sentence(syn_support))) {
                            matching_syn_support = syn_support;
                        }
                    }
                }
                csome_list_var = csome_list_var.rest();
                entry = csome_list_var.first();
            }
        }
        return matching_syn_support;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 30735L)
    public static SubLObject new_nl_trie_word_hl_syn_support(final SubLObject sentence, final SubLObject mt) {
        assert nl_trie.NIL != el_utilities.el_formula_p(sentence) : sentence;
        assert nl_trie.NIL != hlmt.hlmt_p(mt) : mt;
        return make_nl_trie_word_hl_syn_support(sentence, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 30987L)
    public static SubLObject make_nl_trie_word_hl_syn_support(final SubLObject sentence, final SubLObject mt) {
        return (SubLObject)ConsesLow.cons(sentence, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 31079L)
    public static SubLObject new_nl_trie_word_hl_sem_support(final SubLObject denots, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert nl_trie.NIL != set.set_p(denots) : denots;
        if (nl_trie.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !set.set_test(denots).eql(nl_trie.$nl_trie_denot_set_test$.getGlobalValue())) {
            Errors.error((SubLObject)nl_trie.$str104$_S___is_not_a_valid_NL_trie_denot, nl_trie.$nl_trie_denot_set_test$.getGlobalValue());
        }
        assert nl_trie.NIL != hlmt.hlmt_p(mt) : mt;
        return nl_trie_semantic_support_from_denots(denots, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 31464L)
    public static SubLObject nl_trie_semantic_support_from_denots(final SubLObject denots, final SubLObject mt) {
        final SubLObject support = Vectors.make_vector((SubLObject)nl_trie.TWO_INTEGER, (SubLObject)nl_trie.UNPROVIDED);
        nl_trie_word_hl_semantic_support_set_denots(support, denots);
        Vectors.set_aref(support, (SubLObject)nl_trie.ONE_INTEGER, mt);
        return support;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 31683L)
    public static SubLObject nl_trie_word_support_sentence(final SubLObject support) {
        if (nl_trie.NIL != assertion_handles.assertion_p(support)) {
            return assertions_high.assertion_formula(support);
        }
        if (nl_trie.NIL != nl_trie_word_hl_syntactic_support_p(support, (SubLObject)nl_trie.UNPROVIDED)) {
            return support.first();
        }
        if (nl_trie.NIL != nl_trie_word_hl_semantic_support_p(support)) {
            return (SubLObject)nl_trie.NIL;
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 31974L)
    public static SubLObject nl_trie_word_support_mt(final SubLObject support) {
        if (nl_trie.NIL != assertion_handles.assertion_p(support)) {
            return assertions_high.assertion_mt(support);
        }
        if (nl_trie.NIL != nl_trie_word_hl_syntactic_support_p(support, (SubLObject)nl_trie.UNPROVIDED)) {
            return support.rest();
        }
        if (nl_trie.NIL != nl_trie_word_hl_semantic_support_p(support)) {
            return Vectors.aref(support, (SubLObject)nl_trie.ONE_INTEGER);
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 32265L)
    public static SubLObject nl_trie_word_support_predicate(final SubLObject support) {
        if (nl_trie.NIL != nl_trie_word_hl_semantic_support_p(support)) {
            return nl_trie.$const105$denotation;
        }
        return cycl_utilities.atomic_sentence_predicate(nl_trie_word_support_sentence(support));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 32752L)
    public static SubLObject nl_trie_word_struc_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        pprint_nl_trie_word_struc(v_object, stream, (SubLObject)nl_trie.ZERO_INTEGER);
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 32752L)
    public static SubLObject nl_trie_word_struc_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $nl_trie_word_struc_native.class) ? nl_trie.T : nl_trie.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 32752L)
    public static SubLObject nl_trie_word_struc_syntactic_supports(final SubLObject v_object) {
        assert nl_trie.NIL != nl_trie_word_struc_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 32752L)
    public static SubLObject nl_trie_word_struc_semantic_supports(final SubLObject v_object) {
        assert nl_trie.NIL != nl_trie_word_struc_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 32752L)
    public static SubLObject _csetf_nl_trie_word_struc_syntactic_supports(final SubLObject v_object, final SubLObject value) {
        assert nl_trie.NIL != nl_trie_word_struc_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 32752L)
    public static SubLObject _csetf_nl_trie_word_struc_semantic_supports(final SubLObject v_object, final SubLObject value) {
        assert nl_trie.NIL != nl_trie_word_struc_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 32752L)
    public static SubLObject make_nl_trie_word_struc(SubLObject arglist) {
        if (arglist == nl_trie.UNPROVIDED) {
            arglist = (SubLObject)nl_trie.NIL;
        }
        final SubLObject v_new = (SubLObject)new $nl_trie_word_struc_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)nl_trie.NIL, next = arglist; nl_trie.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)nl_trie.$kw120$SYNTACTIC_SUPPORTS)) {
                _csetf_nl_trie_word_struc_syntactic_supports(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)nl_trie.$kw121$SEMANTIC_SUPPORTS)) {
                _csetf_nl_trie_word_struc_semantic_supports(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)nl_trie.$str122$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 32752L)
    public static SubLObject visit_defstruct_nl_trie_word_struc(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)nl_trie.$kw123$BEGIN, (SubLObject)nl_trie.$sym124$MAKE_NL_TRIE_WORD_STRUC, (SubLObject)nl_trie.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)nl_trie.$kw125$SLOT, (SubLObject)nl_trie.$kw120$SYNTACTIC_SUPPORTS, nl_trie_word_struc_syntactic_supports(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)nl_trie.$kw125$SLOT, (SubLObject)nl_trie.$kw121$SEMANTIC_SUPPORTS, nl_trie_word_struc_semantic_supports(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)nl_trie.$kw126$END, (SubLObject)nl_trie.$sym124$MAKE_NL_TRIE_WORD_STRUC, (SubLObject)nl_trie.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 32752L)
    public static SubLObject visit_defstruct_object_nl_trie_word_struc_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_nl_trie_word_struc(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 32925L)
    public static SubLObject sxhash_nl_trie_word_struc_method(final SubLObject v_object) {
        return Numbers.logxor(new SubLObject[] { nl_trie.$int128$509, Sxhash.sxhash(nl_trie_word_struc_syntactic_supports(v_object)), Sxhash.sxhash(nl_trie_word_struc_semantic_supports(v_object)) });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 33153L)
    public static SubLObject pprint_nl_trie_word_struc(final SubLObject word, final SubLObject stream, final SubLObject depth) {
        print_high.princ((SubLObject)nl_trie.$str130$_NL_TRIE_WORD, stream);
        SubLObject set_var = nl_trie_word_syntactic_support_set(word);
        SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject support;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)nl_trie.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); nl_trie.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            support = set_contents.do_set_contents_next(basis_object, state);
            if (nl_trie.NIL != set_contents.do_set_contents_element_validP(state, support)) {
                PrintLow.format(stream, (SubLObject)nl_trie.$str131$____S, support);
            }
        }
        set_var = nl_trie_word_semantic_support_set(word);
        set_contents_var = set.do_set_internal(set_var);
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)nl_trie.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); nl_trie.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            support = set_contents.do_set_contents_next(basis_object, state);
            if (nl_trie.NIL != set_contents.do_set_contents_element_validP(state, support)) {
                PrintLow.format(stream, (SubLObject)nl_trie.$str131$____S, support);
            }
        }
        print_high.princ((SubLObject)nl_trie.$str132$_, stream);
        return word;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 33812L)
    public static SubLObject cfasl_input_nl_trie_word_struc(final SubLObject stream) {
        SubLObject nl_trie_word_struc = (SubLObject)nl_trie.NIL;
        nl_trie_word_struc = make_nl_trie_word_struc((SubLObject)nl_trie.UNPROVIDED);
        _csetf_nl_trie_word_struc_syntactic_supports(nl_trie_word_struc, cfasl.cfasl_input_object(stream));
        _csetf_nl_trie_word_struc_semantic_supports(nl_trie_word_struc, cfasl.cfasl_input_object(stream));
        return nl_trie_word_struc;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 34226L)
    public static SubLObject cfasl_output_nl_trie_word_struc(final SubLObject nl_trie_word_struc, final SubLObject stream) {
        cfasl.cfasl_raw_write_byte(nl_trie.$cfasl_opcode_nl_trie_word_struc$.getGlobalValue(), stream);
        cfasl.cfasl_output(nl_trie_word_struc_syntactic_supports(nl_trie_word_struc), stream);
        cfasl.cfasl_output(nl_trie_word_struc_semantic_supports(nl_trie_word_struc), stream);
        return nl_trie_word_struc;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 34563L)
    public static SubLObject cfasl_output_object_nl_trie_word_struc_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_nl_trie_word_struc(v_object, stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 34766L)
    public static SubLObject nl_trie_word_valid_semantic_support_set_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL != set.set_p(v_object) && set.set_test(v_object).eql(nl_trie.$nl_trie_word_semantic_support_set_test$.getGlobalValue()) && nl_trie.NIL == set_utilities.set_find_if_not((SubLObject)nl_trie.$sym136$NL_TRIE_VALID_SEMANTIC_SUPPORT_P, v_object, (SubLObject)nl_trie.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 35007L)
    public static SubLObject new_nl_trie_word_semantic_support_set(SubLObject support_list) {
        if (support_list == nl_trie.UNPROVIDED) {
            support_list = (SubLObject)nl_trie.NIL;
        }
        return set_utilities.construct_set_from_list(support_list, nl_trie.$nl_trie_word_semantic_support_set_test$.getGlobalValue(), (SubLObject)nl_trie.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 35250L)
    public static SubLObject nl_trie_word_valid_syntactic_support_set_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL != set.set_p(v_object) && set.set_test(v_object).eql(nl_trie.$nl_trie_word_syntactic_support_set_test$.getGlobalValue()) && nl_trie.NIL == set_utilities.set_find_if_not((SubLObject)nl_trie.$sym137$NL_TRIE_SYNTACTIC_SUPPORT_P, v_object, (SubLObject)nl_trie.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 35488L)
    public static SubLObject new_nl_trie_word_syntactic_support_set(SubLObject support_list) {
        if (support_list == nl_trie.UNPROVIDED) {
            support_list = (SubLObject)nl_trie.NIL;
        }
        return set_utilities.construct_set_from_list(support_list, nl_trie.$nl_trie_word_syntactic_support_set_test$.getGlobalValue(), (SubLObject)nl_trie.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 35659L)
    public static SubLObject new_nl_trie_word_for_syntactic_support(final SubLObject support) {
        return new_nl_trie_word(set_utilities.new_singleton_set(support, nl_trie.$nl_trie_word_syntactic_support_set_test$.getGlobalValue()), (SubLObject)nl_trie.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 35830L)
    public static SubLObject new_nl_trie_word(final SubLObject syntactic_supports, SubLObject semantic_supports) {
        if (semantic_supports == nl_trie.UNPROVIDED) {
            semantic_supports = new_nl_trie_word_semantic_support_set((SubLObject)nl_trie.UNPROVIDED);
        }
        assert nl_trie.NIL != nl_trie_word_valid_syntactic_support_set_p(syntactic_supports) : syntactic_supports;
        assert nl_trie.NIL != nl_trie_word_valid_semantic_support_set_p(semantic_supports) : semantic_supports;
        return make_nl_trie_word_struc((SubLObject)ConsesLow.list((SubLObject)nl_trie.$kw120$SYNTACTIC_SUPPORTS, syntactic_supports, (SubLObject)nl_trie.$kw121$SEMANTIC_SUPPORTS, semantic_supports));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 36260L)
    public static SubLObject nl_trie_word_set_syn_supports(final SubLObject word, final SubLObject syn_supports) {
        assert nl_trie.NIL != nl_trie_word_struc_p(word) : word;
        assert nl_trie.NIL != nl_trie_word_valid_syntactic_support_set_p(syn_supports) : syn_supports;
        _csetf_nl_trie_word_struc_syntactic_supports(word, syn_supports);
        return nl_trie_word_struc_syntactic_supports(word);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 36561L)
    public static SubLObject nl_trie_word_set_sem_supports(final SubLObject word, final SubLObject sem_supports) {
        assert nl_trie.NIL != nl_trie_word_struc_p(word) : word;
        assert nl_trie.NIL != nl_trie_word_valid_semantic_support_set_p(sem_supports) : sem_supports;
        _csetf_nl_trie_word_struc_semantic_supports(word, sem_supports);
        return nl_trie_word_struc_semantic_supports(word);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 36859L)
    public static SubLObject nl_trie_syntactic_support_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL != nl_trie_word_support_p(obj) && nl_trie.NIL != nl_trie_valid_syntactic_support_pred_p(nl_trie_word_support_predicate(obj)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 37047L)
    public static SubLObject nl_trie_valid_syntactic_support_pred_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.$const140$partOfSpeech.eql(obj) || nl_trie.NIL != lexicon_accessors.speech_part_predP(obj, (SubLObject)nl_trie.UNPROVIDED) || nl_trie.NIL != nl_trie_abbreviation_pred_p(obj));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 37217L)
    public static SubLObject nl_trie_semantic_support_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL != assertion_handles.assertion_p(obj) || nl_trie.NIL != nl_trie_word_hl_semantic_support_p(obj));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 37347L)
    public static SubLObject nl_trie_valid_semantic_support_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL != assertion_handles.valid_assertionP(obj, (SubLObject)nl_trie.NIL) || nl_trie.NIL != valid_nl_trie_word_hl_semantic_support_p(obj, (SubLObject)nl_trie.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 37497L)
    public static SubLObject nl_trie_word_arbitrary_syntactic_support(final SubLObject word) {
        final SubLObject all_supports = nl_trie_word_syntactic_support_set(word);
        SubLObject support = (SubLObject)nl_trie.NIL;
        SubLObject doneP = (SubLObject)nl_trie.NIL;
        while (nl_trie.NIL == doneP) {
            if (nl_trie.NIL != set.empty_set_p(all_supports)) {
                nl_trie_warn((SubLObject)nl_trie.THREE_INTEGER, (SubLObject)nl_trie.$str141$Couldn_t_find_valid_arbitrary_syn, word, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
                doneP = (SubLObject)nl_trie.T;
            }
            else if (nl_trie.NIL != valid_nl_trie_word_syntactic_support_p(support)) {
                doneP = (SubLObject)nl_trie.T;
            }
            else if (nl_trie.NIL != support) {
                nl_trie_warn((SubLObject)nl_trie.TWO_INTEGER, (SubLObject)nl_trie.$str89$Removing_bad_syntactic_support___, support, word, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
                nl_trie_word_remove_syntactic_support(word, support);
                support = (SubLObject)nl_trie.NIL;
            }
            else {
                support = set_utilities.set_arbitrary_element(all_supports);
            }
        }
        return support;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 38165L)
    public static SubLObject nl_trie_word_syntactic_support_list(final SubLObject word) {
        return set.set_element_list(nl_trie_word_syntactic_supports(word));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 38374L)
    public static SubLObject nl_trie_word_syntactic_support_set(final SubLObject word) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)nl_trie.NIL;
        final SubLObject _prev_bind_0 = nl_trie.$call_to_nl_trie_word_syntactic_supports_licensedP$.currentBinding(thread);
        try {
            nl_trie.$call_to_nl_trie_word_syntactic_supports_licensedP$.bind((SubLObject)nl_trie.T, thread);
            ans = nl_trie_word_syntactic_supports(word);
        }
        finally {
            nl_trie.$call_to_nl_trie_word_syntactic_supports_licensedP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 38590L)
    public static SubLObject nl_trie_word_syntactic_supports(final SubLObject word) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (nl_trie.NIL == nl_trie.$call_to_nl_trie_word_syntactic_supports_licensedP$.getDynamicValue(thread)) {
            nl_trie_error((SubLObject)nl_trie.$str142$Illicit_call_to_NL_TRIE_WORD_SYNT, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
        }
        return nl_trie_word_struc_syntactic_supports(word);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 38853L)
    public static SubLObject nl_trie_word_semantic_support_list(final SubLObject word) {
        return set.set_element_list(nl_trie_word_semantic_support_set(word));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 39062L)
    public static SubLObject nl_trie_word_semantic_support_set(final SubLObject word) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)nl_trie.NIL;
        final SubLObject _prev_bind_0 = nl_trie.$call_to_nl_trie_word_semantic_supports_licensedP$.currentBinding(thread);
        try {
            nl_trie.$call_to_nl_trie_word_semantic_supports_licensedP$.bind((SubLObject)nl_trie.T, thread);
            ans = nl_trie_word_semantic_supports(word);
        }
        finally {
            nl_trie.$call_to_nl_trie_word_semantic_supports_licensedP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 39275L)
    public static SubLObject nl_trie_word_semantic_supports(final SubLObject word) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (nl_trie.NIL == nl_trie.$call_to_nl_trie_word_semantic_supports_licensedP$.getDynamicValue(thread)) {
            nl_trie_error((SubLObject)nl_trie.$str143$Illicit_call_to_NL_TRIE_WORD_SEMA, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
        }
        return nl_trie_word_struc_semantic_supports(word);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 39534L)
    public static SubLObject nl_trie_word_arbitrary_semantic_support(final SubLObject word) {
        final SubLObject all_supports = nl_trie_word_semantic_support_set(word);
        SubLObject support = (SubLObject)nl_trie.NIL;
        SubLObject doneP = (SubLObject)nl_trie.NIL;
        while (nl_trie.NIL == doneP) {
            if (nl_trie.NIL != set.empty_set_p(all_supports)) {
                nl_trie_warn((SubLObject)nl_trie.THREE_INTEGER, (SubLObject)nl_trie.$str144$Couldn_t_find_valid_arbitrary_sem, word, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
                doneP = (SubLObject)nl_trie.T;
            }
            else if (nl_trie.NIL != valid_nl_trie_word_semantic_support_p(support)) {
                doneP = (SubLObject)nl_trie.T;
            }
            else if (nl_trie.NIL != support) {
                nl_trie_warn((SubLObject)nl_trie.TWO_INTEGER, (SubLObject)nl_trie.$str90$Removing_bad_semantic_support___S, support, word, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
                nl_trie_word_remove_semantic_support(word, support);
                support = (SubLObject)nl_trie.NIL;
            }
            else {
                support = set_utilities.set_arbitrary_element(all_supports);
            }
        }
        return support;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 40197L)
    public static SubLObject nl_trie_word_has_syntactic_support_p(final SubLObject word, final SubLObject support, SubLObject strictP) {
        if (strictP == nl_trie.UNPROVIDED) {
            strictP = (SubLObject)nl_trie.T;
        }
        final SubLObject existing = nl_trie_word_syntactic_support_set(word);
        if (nl_trie.NIL != strictP) {
            return set.set_memberP(support, existing);
        }
        final SubLObject support_sentence = nl_trie_word_support_sentence(support);
        final SubLObject support_mt = nl_trie_word_support_mt(support);
        SubLObject foundP = (SubLObject)nl_trie.NIL;
        final SubLObject set_contents_var = set.do_set_internal(existing);
        SubLObject basis_object;
        SubLObject state;
        SubLObject existing_support;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)nl_trie.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); nl_trie.NIL == foundP && nl_trie.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            existing_support = set_contents.do_set_contents_next(basis_object, state);
            if (nl_trie.NIL != set_contents.do_set_contents_element_validP(state, existing_support) && nl_trie_word_support_sentence(existing_support).equal(support_sentence) && nl_trie_word_support_mt(existing_support).equal(support_mt)) {
                foundP = (SubLObject)nl_trie.T;
            }
        }
        return foundP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 40812L)
    public static SubLObject nl_trie_word_add_syntactic_support(final SubLObject word, final SubLObject support, SubLObject check_for_impliedP) {
        if (check_for_impliedP == nl_trie.UNPROVIDED) {
            check_for_impliedP = (SubLObject)nl_trie.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject existing = nl_trie_word_syntactic_support_set(word);
        SubLObject newP = (SubLObject)nl_trie.NIL;
        final SubLObject _prev_bind_0 = nl_trie.$call_to_nl_trie_word_syntactic_supports_licensedP$.currentBinding(thread);
        try {
            nl_trie.$call_to_nl_trie_word_syntactic_supports_licensedP$.bind((SubLObject)nl_trie.T, thread);
            newP = set.set_add(support, existing);
        }
        finally {
            nl_trie.$call_to_nl_trie_word_syntactic_supports_licensedP$.rebind(_prev_bind_0, thread);
        }
        if (nl_trie.NIL != check_for_impliedP) {
            nl_trie_word_remove_implied_hl_syntactic_supports(word);
        }
        assert nl_trie.NIL != nl_trie_word_p(word, (SubLObject)nl_trie.UNPROVIDED) : word;
        return (SubLObject)((nl_trie.NIL != newP) ? nl_trie.$kw145$ADDED : nl_trie.$kw146$ALREADY_PRESENT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 41321L)
    public static SubLObject nl_trie_word_remove_implied_hl_syntactic_supports(final SubLObject word) {
        SubLObject implied_supports = (SubLObject)nl_trie.NIL;
        final SubLObject set_var = nl_trie_word_syntactic_support_set(word);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject support;
        SubLObject not_implied;
        SubLObject csome_list_var;
        SubLObject pred;
        SubLObject implied_by;
        SubLObject existing;
        SubLObject set_contents_var_$9;
        SubLObject basis_object_$10;
        SubLObject state_$11;
        SubLObject existing_support;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)nl_trie.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); nl_trie.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            support = set_contents.do_set_contents_next(basis_object, state);
            if (nl_trie.NIL != set_contents.do_set_contents_element_validP(state, support) && nl_trie.NIL != nl_trie_word_hl_syntactic_support_p(support, (SubLObject)nl_trie.UNPROVIDED)) {
                not_implied = (SubLObject)nl_trie.NIL;
                if (nl_trie.NIL == not_implied) {
                    csome_list_var = nl_trie_word_syntactic_support_pos_preds(support);
                    pred = (SubLObject)nl_trie.NIL;
                    pred = csome_list_var.first();
                    while (nl_trie.NIL == not_implied && nl_trie.NIL != csome_list_var) {
                        implied_by = (SubLObject)nl_trie.NIL;
                        existing = nl_trie_word_syntactic_support_set(word);
                        set_contents_var_$9 = set.do_set_internal(existing);
                        for (basis_object_$10 = set_contents.do_set_contents_basis_object(set_contents_var_$9), state_$11 = (SubLObject)nl_trie.NIL, state_$11 = set_contents.do_set_contents_initial_state(basis_object_$10, set_contents_var_$9); nl_trie.NIL == implied_by && nl_trie.NIL == set_contents.do_set_contents_doneP(basis_object_$10, state_$11); state_$11 = set_contents.do_set_contents_update_state(state_$11)) {
                            existing_support = set_contents.do_set_contents_next(basis_object_$10, state_$11);
                            if (nl_trie.NIL != set_contents.do_set_contents_element_validP(state_$11, existing_support) && !existing_support.eql(support) && nl_trie.NIL != lexicon_accessors.genl_pos_predP(nl_trie_word_support_predicate(existing_support), pred, (SubLObject)nl_trie.UNPROVIDED)) {
                                implied_by = existing_support;
                            }
                        }
                        if (nl_trie.NIL == implied_by) {
                            not_implied = pred;
                        }
                        csome_list_var = csome_list_var.rest();
                        pred = csome_list_var.first();
                    }
                }
                if (nl_trie.NIL == not_implied) {
                    implied_supports = (SubLObject)ConsesLow.cons(support, implied_supports);
                }
            }
        }
        SubLObject cdolist_list_var = implied_supports;
        SubLObject support2 = (SubLObject)nl_trie.NIL;
        support2 = cdolist_list_var.first();
        while (nl_trie.NIL != cdolist_list_var) {
            if (!nl_trie.ONE_INTEGER.eql(set.set_size(nl_trie_word_syntactic_support_set(word)))) {
                nl_trie_word_remove_syntactic_support(word, support2);
            }
            cdolist_list_var = cdolist_list_var.rest();
            support2 = cdolist_list_var.first();
        }
        return implied_supports;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 42483L)
    public static SubLObject nl_trie_word_remove_syntactic_support(final SubLObject word, final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject was_thereP = (SubLObject)nl_trie.NIL;
        final SubLObject support_sentence = nl_trie_word_support_sentence(support);
        SubLObject matching_supports = (SubLObject)nl_trie.NIL;
        final SubLObject set_var = nl_trie_word_syntactic_support_set(word);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject existing_support;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)nl_trie.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); nl_trie.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            existing_support = set_contents.do_set_contents_next(basis_object, state);
            if (nl_trie.NIL != set_contents.do_set_contents_element_validP(state, existing_support) && nl_trie_word_support_sentence(existing_support).equal(support_sentence)) {
                matching_supports = (SubLObject)ConsesLow.cons(existing_support, matching_supports);
            }
        }
        if (nl_trie.NIL != matching_supports) {
            was_thereP = (SubLObject)nl_trie.T;
            SubLObject cdolist_list_var = matching_supports;
            SubLObject support_$12 = (SubLObject)nl_trie.NIL;
            support_$12 = cdolist_list_var.first();
            while (nl_trie.NIL != cdolist_list_var) {
                final SubLObject _prev_bind_0 = nl_trie.$call_to_nl_trie_word_syntactic_supports_licensedP$.currentBinding(thread);
                try {
                    nl_trie.$call_to_nl_trie_word_syntactic_supports_licensedP$.bind((SubLObject)nl_trie.T, thread);
                    set.set_remove(support_$12, nl_trie_word_syntactic_supports(word));
                }
                finally {
                    nl_trie.$call_to_nl_trie_word_syntactic_supports_licensedP$.rebind(_prev_bind_0, thread);
                }
                cdolist_list_var = cdolist_list_var.rest();
                support_$12 = cdolist_list_var.first();
            }
        }
        assert nl_trie.NIL != nl_trie_word_p(word, (SubLObject)nl_trie.UNPROVIDED) : word;
        return (SubLObject)((nl_trie.NIL != was_thereP) ? nl_trie.$kw147$REMOVED : nl_trie.$kw148$NOT_FOUND);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 43239L)
    public static SubLObject nl_trie_word_has_semantic_support_p(final SubLObject word, final SubLObject support) {
        final SubLObject existing = nl_trie_word_semantic_support_set(word);
        return set.set_memberP(support, existing);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 43412L)
    public static SubLObject nl_trie_word_semantic_support_equalP(final SubLObject support1, final SubLObject support2) {
        return Equality.equalp(support1, support2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 43522L)
    public static SubLObject nl_trie_word_add_semantic_support(final SubLObject word, final SubLObject support) {
        if (nl_trie.NIL != nl_trie_word_has_semantic_support_p(word, support)) {
            return (SubLObject)nl_trie.$kw146$ALREADY_PRESENT;
        }
        if (nl_trie.NIL != nl_trie_word_spliceable_semantic_support_p(support)) {
            final SubLObject existing = nl_trie_word_semantic_support_set(word);
            SubLObject splicedP = (SubLObject)nl_trie.NIL;
            final SubLObject set_contents_var = set.do_set_internal(existing);
            SubLObject basis_object;
            SubLObject state;
            SubLObject existing_support;
            SubLObject set_var;
            SubLObject set_contents_var_$13;
            SubLObject basis_object_$14;
            SubLObject state_$15;
            SubLObject denot;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)nl_trie.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); nl_trie.NIL == splicedP && nl_trie.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                existing_support = set_contents.do_set_contents_next(basis_object, state);
                if (nl_trie.NIL != set_contents.do_set_contents_element_validP(state, existing_support) && nl_trie.NIL != nl_trie_word_hl_semantic_supports_unifiable_p(existing_support, support)) {
                    set_var = nl_trie_word_hl_semantic_support_denots(support);
                    set_contents_var_$13 = set.do_set_internal(set_var);
                    for (basis_object_$14 = set_contents.do_set_contents_basis_object(set_contents_var_$13), state_$15 = (SubLObject)nl_trie.NIL, state_$15 = set_contents.do_set_contents_initial_state(basis_object_$14, set_contents_var_$13); nl_trie.NIL == set_contents.do_set_contents_doneP(basis_object_$14, state_$15); state_$15 = set_contents.do_set_contents_update_state(state_$15)) {
                        denot = set_contents.do_set_contents_next(basis_object_$14, state_$15);
                        if (nl_trie.NIL != set_contents.do_set_contents_element_validP(state_$15, denot)) {
                            set.set_add(denot, nl_trie_word_hl_semantic_support_denots(existing_support));
                        }
                    }
                    splicedP = (SubLObject)nl_trie.T;
                }
            }
            if (nl_trie.NIL == splicedP) {
                do_nl_trie_word_add_semantic_support(word, support);
            }
            return word;
        }
        do_nl_trie_word_add_semantic_support(word, support);
        return word;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 44352L)
    public static SubLObject nl_trie_word_spliceable_semantic_support_p(final SubLObject support) {
        return nl_trie_word_hl_semantic_support_p(support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 44476L)
    public static SubLObject do_nl_trie_word_add_semantic_support(final SubLObject word, final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = nl_trie.$call_to_nl_trie_word_semantic_supports_licensedP$.currentBinding(thread);
        try {
            nl_trie.$call_to_nl_trie_word_semantic_supports_licensedP$.bind((SubLObject)nl_trie.T, thread);
            set.set_add(support, nl_trie_word_semantic_supports(word));
        }
        finally {
            nl_trie.$call_to_nl_trie_word_semantic_supports_licensedP$.rebind(_prev_bind_0, thread);
        }
        assert nl_trie.NIL != nl_trie_word_p(word, (SubLObject)nl_trie.UNPROVIDED) : word;
        return word;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 44720L)
    public static SubLObject nl_trie_word_hl_semantic_supports_unifiable_p(final SubLObject support1, final SubLObject support2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL != nl_trie_word_hl_semantic_support_p(support1) && nl_trie_word_support_mt(support1).eql(nl_trie_word_support_mt(support2)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 44951L)
    public static SubLObject nl_trie_word_hl_semantic_support_denots(final SubLObject support) {
        return Vectors.aref(support, (SubLObject)nl_trie.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 45087L)
    public static SubLObject nl_trie_word_hl_semantic_support_set_denots(final SubLObject support, final SubLObject denots) {
        assert nl_trie.NIL != set.set_p(denots) : denots;
        Vectors.set_aref(support, (SubLObject)nl_trie.ZERO_INTEGER, denots);
        return support;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 45554L)
    public static SubLObject nl_trie_word_semantic_support_denots_internal(final SubLObject support, SubLObject denot_arg) {
        if (denot_arg == nl_trie.UNPROVIDED) {
            denot_arg = (SubLObject)nl_trie.NIL;
        }
        if (nl_trie.NIL != nl_trie_valid_assertionP(support)) {
            if (!denot_arg.isInteger()) {
                final SubLObject pred = nl_trie_word_support_predicate(support);
                denot_arg = lexicon_utilities.denotatum_arg_of_pred_cached(pred);
            }
            if (denot_arg.isInteger()) {
                final SubLObject terms = cycl_utilities.formula_terms(nl_trie_word_support_sentence(support), (SubLObject)nl_trie.UNPROVIDED);
                final SubLObject okP = list_utilities.lengthG(terms, denot_arg, (SubLObject)nl_trie.UNPROVIDED);
                if (nl_trie.NIL == okP) {
                    nl_trie_error((SubLObject)nl_trie.$str150$Can_t_get_arg__S_of__S, denot_arg, support, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
                }
                return (SubLObject)((nl_trie.NIL != okP) ? ConsesLow.list(ConsesLow.nth(denot_arg, terms)) : nl_trie.NIL);
            }
        }
        else if (nl_trie.NIL != nl_trie_word_hl_semantic_support_p(support)) {
            return set.set_element_list(nl_trie_word_hl_semantic_support_denots(support));
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 45554L)
    public static SubLObject nl_trie_word_semantic_support_denots(final SubLObject support, SubLObject denot_arg) {
        if (denot_arg == nl_trie.UNPROVIDED) {
            denot_arg = (SubLObject)nl_trie.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)nl_trie.NIL;
        if (nl_trie.NIL == v_memoization_state) {
            return nl_trie_word_semantic_support_denots_internal(support, denot_arg);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)nl_trie.$sym149$NL_TRIE_WORD_SEMANTIC_SUPPORT_DENOTS, (SubLObject)nl_trie.UNPROVIDED);
        if (nl_trie.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)nl_trie.$sym149$NL_TRIE_WORD_SEMANTIC_SUPPORT_DENOTS, (SubLObject)nl_trie.TWO_INTEGER, (SubLObject)nl_trie.NIL, (SubLObject)nl_trie.EQUALP, (SubLObject)nl_trie.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)nl_trie.$sym149$NL_TRIE_WORD_SEMANTIC_SUPPORT_DENOTS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(support, denot_arg);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)nl_trie.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)nl_trie.NIL;
            collision = cdolist_list_var.first();
            while (nl_trie.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (support.equalp(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (nl_trie.NIL != cached_args && nl_trie.NIL == cached_args.rest() && denot_arg.equalp(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(nl_trie_word_semantic_support_denots_internal(support, denot_arg)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(support, denot_arg));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 46412L)
    public static SubLObject nl_trie_word_semantic_support_semtrans_templates_internal(final SubLObject support, SubLObject semtrans_template_arg) {
        if (semtrans_template_arg == nl_trie.UNPROVIDED) {
            semtrans_template_arg = (SubLObject)nl_trie.NIL;
        }
        if (nl_trie.NIL != nl_trie_valid_assertionP(support)) {
            return (SubLObject)((nl_trie.NIL != assertions_high.gaf_assertionP(support)) ? ConsesLow.list(lexicon_accessors.semtrans_template_from_assertion(support, semtrans_template_arg)) : nl_trie.NIL);
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 46412L)
    public static SubLObject nl_trie_word_semantic_support_semtrans_templates(final SubLObject support, SubLObject semtrans_template_arg) {
        if (semtrans_template_arg == nl_trie.UNPROVIDED) {
            semtrans_template_arg = (SubLObject)nl_trie.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)nl_trie.NIL;
        if (nl_trie.NIL == v_memoization_state) {
            return nl_trie_word_semantic_support_semtrans_templates_internal(support, semtrans_template_arg);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)nl_trie.$sym151$NL_TRIE_WORD_SEMANTIC_SUPPORT_SEMTRANS_TEMPLATES, (SubLObject)nl_trie.UNPROVIDED);
        if (nl_trie.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)nl_trie.$sym151$NL_TRIE_WORD_SEMANTIC_SUPPORT_SEMTRANS_TEMPLATES, (SubLObject)nl_trie.TWO_INTEGER, (SubLObject)nl_trie.NIL, (SubLObject)nl_trie.EQUALP, (SubLObject)nl_trie.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)nl_trie.$sym151$NL_TRIE_WORD_SEMANTIC_SUPPORT_SEMTRANS_TEMPLATES, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(support, semtrans_template_arg);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)nl_trie.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)nl_trie.NIL;
            collision = cdolist_list_var.first();
            while (nl_trie.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (support.equalp(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (nl_trie.NIL != cached_args && nl_trie.NIL == cached_args.rest() && semtrans_template_arg.equalp(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(nl_trie_word_semantic_support_semtrans_templates_internal(support, semtrans_template_arg)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(support, semtrans_template_arg));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 46942L)
    public static SubLObject nl_trie_word_remove_semantic_support(final SubLObject word, final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject was_thereP = (SubLObject)nl_trie.NIL;
        final SubLObject _prev_bind_0 = nl_trie.$call_to_nl_trie_word_semantic_supports_licensedP$.currentBinding(thread);
        try {
            nl_trie.$call_to_nl_trie_word_semantic_supports_licensedP$.bind((SubLObject)nl_trie.T, thread);
            was_thereP = set.set_remove(support, nl_trie_word_semantic_supports(word));
        }
        finally {
            nl_trie.$call_to_nl_trie_word_semantic_supports_licensedP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)((nl_trie.NIL != was_thereP) ? word : nl_trie.$kw148$NOT_FOUND);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 47279L)
    public static SubLObject nl_trie_word_pos_preds(final SubLObject word) {
        SubLObject preds = (SubLObject)nl_trie.NIL;
        final SubLObject set_var = nl_trie_word_syntactic_support_set(word);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject syn_support;
        SubLObject cdolist_list_var;
        SubLObject pred;
        SubLObject item_var;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)nl_trie.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); nl_trie.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            syn_support = set_contents.do_set_contents_next(basis_object, state);
            if (nl_trie.NIL != set_contents.do_set_contents_element_validP(state, syn_support)) {
                cdolist_list_var = nl_trie_word_syntactic_support_pos_preds(syn_support);
                pred = (SubLObject)nl_trie.NIL;
                pred = cdolist_list_var.first();
                while (nl_trie.NIL != cdolist_list_var) {
                    item_var = pred;
                    if (nl_trie.NIL == conses_high.member(item_var, preds, Symbols.symbol_function((SubLObject)nl_trie.EQL), Symbols.symbol_function((SubLObject)nl_trie.IDENTITY))) {
                        preds = (SubLObject)ConsesLow.cons(item_var, preds);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    pred = cdolist_list_var.first();
                }
            }
        }
        if (nl_trie.NIL == preds) {
            preds = (SubLObject)nl_trie.$list152;
        }
        return preds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 47594L)
    public static SubLObject nl_trie_word_syntactic_support_abbreviation_p(final SubLObject syn_support) {
        return nl_trie_abbreviation_pred_p(nl_trie_word_support_predicate(syn_support));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 47811L)
    public static SubLObject nl_trie_word_syntactic_support_pos_preds(final SubLObject syn_support) {
        final SubLObject syn_support_sentence = nl_trie_word_support_sentence(syn_support);
        final SubLObject syn_arg0 = nl_trie_word_support_predicate(syn_support);
        if (nl_trie.NIL != nl_trie_abbreviation_pred_p(syn_arg0)) {
            SubLObject preds = (SubLObject)nl_trie.NIL;
            final SubLObject const_arg = nl_trie_const_arg_of_pred(syn_arg0);
            final SubLObject v_const = cycl_utilities.atomic_sentence_arg(syn_support_sentence, const_arg, (SubLObject)nl_trie.UNPROVIDED);
            SubLObject cdolist_list_var = find_pos_preds_for_lex_const(v_const);
            SubLObject pred = (SubLObject)nl_trie.NIL;
            pred = cdolist_list_var.first();
            while (nl_trie.NIL != cdolist_list_var) {
                final SubLObject item_var = pred;
                if (nl_trie.NIL == conses_high.member(item_var, preds, Symbols.symbol_function((SubLObject)nl_trie.EQL), Symbols.symbol_function((SubLObject)nl_trie.IDENTITY))) {
                    preds = (SubLObject)ConsesLow.cons(item_var, preds);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            }
            return preds;
        }
        if (nl_trie.$const140$partOfSpeech.eql(syn_arg0)) {
            return nl_trie_closed_class_pos_preds(cycl_utilities.atomic_sentence_arg2(syn_support_sentence, (SubLObject)nl_trie.UNPROVIDED), (SubLObject)nl_trie.UNPROVIDED);
        }
        return (SubLObject)ConsesLow.list(syn_arg0);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 48562L)
    public static SubLObject clear_nl_trie_closed_class_pos_preds() {
        final SubLObject cs = nl_trie.$nl_trie_closed_class_pos_preds_caching_state$.getGlobalValue();
        if (nl_trie.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 48562L)
    public static SubLObject remove_nl_trie_closed_class_pos_preds(final SubLObject pos, SubLObject mt) {
        if (mt == nl_trie.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args(nl_trie.$nl_trie_closed_class_pos_preds_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(pos, mt), (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 48562L)
    public static SubLObject nl_trie_closed_class_pos_preds_internal(final SubLObject pos, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = (SubLObject)nl_trie.NIL;
        SubLObject too_generalP = (SubLObject)nl_trie.NIL;
        if (nl_trie.NIL == too_generalP) {
            SubLObject node_var = pos;
            final SubLObject deck_type = (SubLObject)nl_trie.$kw156$STACK;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject _prev_bind_0_$16 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
                        final SubLObject tv_var = nl_trie.$const157$True_JustificationTruth;
                        final SubLObject _prev_bind_0_$17 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$18 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((nl_trie.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((nl_trie.NIL != tv_var) ? nl_trie.$sym158$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (nl_trie.NIL != tv_var && nl_trie.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && nl_trie.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)nl_trie.$kw159$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)nl_trie.ONE_INTEGER, (SubLObject)nl_trie.$str160$_A_is_not_a__A, tv_var, (SubLObject)nl_trie.$sym161$SBHL_TRUE_TV_P, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)nl_trie.$kw162$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)nl_trie.ONE_INTEGER, (SubLObject)nl_trie.$str163$continue_anyway, (SubLObject)nl_trie.$str160$_A_is_not_a__A, tv_var, (SubLObject)nl_trie.$sym161$SBHL_TRUE_TV_P, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)nl_trie.$kw164$WARN)) {
                                    Errors.warn((SubLObject)nl_trie.$str160$_A_is_not_a__A, tv_var, (SubLObject)nl_trie.$sym161$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)nl_trie.$str165$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)nl_trie.$str163$continue_anyway, (SubLObject)nl_trie.$str160$_A_is_not_a__A, tv_var, (SubLObject)nl_trie.$sym161$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$18 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$19 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$21 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(nl_trie.$const166$genls), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(nl_trie.$const166$genls)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(nl_trie.$const166$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)nl_trie.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(nl_trie.$const166$genls), thread);
                                if (nl_trie.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || nl_trie.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pos, sbhl_module_vars.get_sbhl_module((SubLObject)nl_trie.UNPROVIDED))) {
                                    final SubLObject _prev_bind_0_$19 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$20 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$22 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(nl_trie.$const166$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)nl_trie.NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)nl_trie.UNPROVIDED);
                                        while (nl_trie.NIL != node_var && nl_trie.NIL == too_generalP) {
                                            final SubLObject genl_pos = node_var;
                                            if (nl_trie.NIL == lexicon_accessors.speech_partP(genl_pos, (SubLObject)nl_trie.UNPROVIDED)) {
                                                too_generalP = (SubLObject)nl_trie.T;
                                            }
                                            else if (nl_trie.NIL != lexicon_accessors.genl_posP(genl_pos, nl_trie.$const167$ClosedClassWord, (SubLObject)nl_trie.UNPROVIDED)) {
                                                SubLObject cdolist_list_var = lexicon_accessors.max_preds_of_pos(genl_pos);
                                                SubLObject pos_pred = (SubLObject)nl_trie.NIL;
                                                pos_pred = cdolist_list_var.first();
                                                while (nl_trie.NIL != cdolist_list_var) {
                                                    final SubLObject item_var = pos_pred;
                                                    if (nl_trie.NIL == conses_high.member(item_var, preds, Symbols.symbol_function((SubLObject)nl_trie.EQL), Symbols.symbol_function((SubLObject)nl_trie.IDENTITY))) {
                                                        preds = (SubLObject)ConsesLow.cons(item_var, preds);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    pos_pred = cdolist_list_var.first();
                                                }
                                            }
                                            final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(nl_trie.$const166$genls));
                                            SubLObject rest;
                                            SubLObject module_var;
                                            SubLObject _prev_bind_0_$20;
                                            SubLObject _prev_bind_1_$21;
                                            SubLObject node;
                                            SubLObject d_link;
                                            SubLObject mt_links;
                                            SubLObject iteration_state;
                                            SubLObject mt_$27;
                                            SubLObject tv_links;
                                            SubLObject _prev_bind_0_$21;
                                            SubLObject iteration_state_$29;
                                            SubLObject tv;
                                            SubLObject link_nodes;
                                            SubLObject _prev_bind_0_$22;
                                            SubLObject sol;
                                            SubLObject set_contents_var;
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject node_vars_link_node;
                                            SubLObject csome_list_var;
                                            SubLObject node_vars_link_node2;
                                            SubLObject new_list;
                                            SubLObject rest_$31;
                                            SubLObject generating_fn;
                                            SubLObject _prev_bind_0_$23;
                                            SubLObject sol2;
                                            SubLObject link_nodes2;
                                            SubLObject set_contents_var2;
                                            SubLObject basis_object2;
                                            SubLObject state2;
                                            SubLObject node_vars_link_node3;
                                            SubLObject csome_list_var2;
                                            SubLObject node_vars_link_node4;
                                            for (rest = (SubLObject)nl_trie.NIL, rest = accessible_modules; nl_trie.NIL == too_generalP && nl_trie.NIL != rest; rest = rest.rest()) {
                                                module_var = rest.first();
                                                _prev_bind_0_$20 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                _prev_bind_1_$21 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((nl_trie.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(nl_trie.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    node = function_terms.naut_to_nart(node_var);
                                                    if (nl_trie.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)nl_trie.UNPROVIDED));
                                                        if (nl_trie.NIL != d_link) {
                                                            mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)nl_trie.UNPROVIDED));
                                                            if (nl_trie.NIL != mt_links) {
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); nl_trie.NIL == too_generalP && nl_trie.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    mt_$27 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (nl_trie.NIL != mt_relevance_macros.relevant_mtP(mt_$27)) {
                                                                        _prev_bind_0_$21 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_$27, thread);
                                                                            for (iteration_state_$29 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); nl_trie.NIL == too_generalP && nl_trie.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$29); iteration_state_$29 = dictionary_contents.do_dictionary_contents_next(iteration_state_$29)) {
                                                                                thread.resetMultipleValues();
                                                                                tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$29);
                                                                                link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (nl_trie.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    _prev_bind_0_$22 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        sol = link_nodes;
                                                                                        if (nl_trie.NIL != set.set_p(sol)) {
                                                                                            set_contents_var = set.do_set_internal(sol);
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)nl_trie.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); nl_trie.NIL == too_generalP && nl_trie.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (nl_trie.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && nl_trie.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)nl_trie.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)nl_trie.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            if (nl_trie.NIL == too_generalP) {
                                                                                                csome_list_var = sol;
                                                                                                node_vars_link_node2 = (SubLObject)nl_trie.NIL;
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                while (nl_trie.NIL == too_generalP && nl_trie.NIL != csome_list_var) {
                                                                                                    if (nl_trie.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)nl_trie.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)nl_trie.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)nl_trie.$str168$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$22, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$29);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$21, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)nl_trie.FIVE_INTEGER, (SubLObject)nl_trie.$str169$attempting_to_bind_direction_link, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (nl_trie.NIL != obsolete.cnat_p(node, (SubLObject)nl_trie.UNPROVIDED)) {
                                                        new_list = ((nl_trie.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)nl_trie.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)nl_trie.UNPROVIDED)));
                                                        for (rest_$31 = (SubLObject)nl_trie.NIL, rest_$31 = new_list; nl_trie.NIL == too_generalP && nl_trie.NIL != rest_$31; rest_$31 = rest_$31.rest()) {
                                                            generating_fn = rest_$31.first();
                                                            _prev_bind_0_$23 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                link_nodes2 = (sol2 = Functions.funcall(generating_fn, node));
                                                                if (nl_trie.NIL != set.set_p(sol2)) {
                                                                    set_contents_var2 = set.do_set_internal(sol2);
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)nl_trie.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); nl_trie.NIL == too_generalP && nl_trie.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (nl_trie.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && nl_trie.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)nl_trie.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)nl_trie.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node3, recur_deck);
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol2.isList()) {
                                                                    if (nl_trie.NIL == too_generalP) {
                                                                        csome_list_var2 = sol2;
                                                                        node_vars_link_node4 = (SubLObject)nl_trie.NIL;
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                        while (nl_trie.NIL == too_generalP && nl_trie.NIL != csome_list_var2) {
                                                                            if (nl_trie.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)nl_trie.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)nl_trie.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)nl_trie.$str168$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$23, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$21, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$20, thread);
                                                }
                                            }
                                            node_var = deck.deck_pop(recur_deck);
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$22, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$20, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$19, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)nl_trie.TWO_INTEGER, (SubLObject)nl_trie.$str170$Node__a_does_not_pass_sbhl_type_t, pos, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)nl_trie.UNPROVIDED)), (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$21, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$19, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$18, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$18, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$17, thread);
                        }
                    }
                    finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$16, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$24 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nl_trie.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
        }
        return preds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 48562L)
    public static SubLObject nl_trie_closed_class_pos_preds(final SubLObject pos, SubLObject mt) {
        if (mt == nl_trie.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        SubLObject caching_state = nl_trie.$nl_trie_closed_class_pos_preds_caching_state$.getGlobalValue();
        if (nl_trie.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)nl_trie.$sym153$NL_TRIE_CLOSED_CLASS_POS_PREDS, (SubLObject)nl_trie.$sym171$_NL_TRIE_CLOSED_CLASS_POS_PREDS_CACHING_STATE_, (SubLObject)nl_trie.$int172$64, (SubLObject)nl_trie.EQL, (SubLObject)nl_trie.TWO_INTEGER, (SubLObject)nl_trie.ZERO_INTEGER);
            memoization_state.register_genls_dependent_cache_clear_callback((SubLObject)nl_trie.$sym173$CLEAR_NL_TRIE_CLOSED_CLASS_POS_PREDS);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pos, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)nl_trie.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)nl_trie.NIL;
            collision = cdolist_list_var.first();
            while (nl_trie.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (pos.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (nl_trie.NIL != cached_args && nl_trie.NIL == cached_args.rest() && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(nl_trie_closed_class_pos_preds_internal(pos, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(pos, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 49053L)
    public static SubLObject nl_trie_const_arg_of_pred(final SubLObject pred) {
        if (nl_trie.NIL == nl_trie_abbreviation_pred_p(pred)) {
            return (SubLObject)nl_trie.NIL;
        }
        if (pred.eql(nl_trie.$const174$abbreviationForLexicalWord)) {
            return (SubLObject)nl_trie.TWO_INTEGER;
        }
        return (SubLObject)nl_trie.THREE_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 49328L)
    public static SubLObject nl_trie_word_syn_pred_string_arg(final SubLObject pred) {
        if (pred.eql(nl_trie.$const140$partOfSpeech)) {
            return (SubLObject)nl_trie.THREE_INTEGER;
        }
        if (nl_trie.NIL != lexicon_accessors.speech_part_predP(pred, (SubLObject)nl_trie.UNPROVIDED)) {
            return (SubLObject)nl_trie.TWO_INTEGER;
        }
        if (nl_trie.NIL != nl_trie_abbreviation_pred_p(pred)) {
            return nl_trie_abbr_arg_of_pred(pred);
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 49625L)
    public static SubLObject nl_trie_abbr_arg_of_pred(final SubLObject pred) {
        if (nl_trie.NIL == nl_trie_abbreviation_pred_p(pred)) {
            return (SubLObject)nl_trie.NIL;
        }
        if (pred.eql(nl_trie.$const174$abbreviationForLexicalWord)) {
            return (SubLObject)nl_trie.THREE_INTEGER;
        }
        return (SubLObject)nl_trie.FOUR_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 49895L)
    public static SubLObject nl_trie_word_pos_internal(final SubLObject word) {
        final SubLObject syn_support = nl_trie_word_arbitrary_syntactic_support(word);
        final SubLObject pred = nl_trie_word_support_predicate(syn_support);
        final SubLObject sem_support = (SubLObject)(pred.eql(nl_trie.$const176$gerund) ? nl_trie.NIL : set_utilities.set_find_if((SubLObject)nl_trie.$sym177$ASSERTION_P, nl_trie_word_semantic_support_set(word), (SubLObject)nl_trie.UNPROVIDED));
        final SubLObject sem_pos = (SubLObject)((nl_trie.NIL != sem_support) ? nl_trie_semantic_support_pos(sem_support) : nl_trie.NIL);
        if (nl_trie.NIL != sem_pos) {
            return sem_pos;
        }
        if (pred.eql(nl_trie.$const140$partOfSpeech)) {
            return cycl_utilities.formula_arg2(nl_trie_word_support_sentence(syn_support), (SubLObject)nl_trie.UNPROVIDED);
        }
        if (nl_trie.NIL != nl_trie_abbreviation_pred_p(pred)) {
            final SubLObject const_arg = nl_trie_const_arg_of_pred(pred);
            final SubLObject v_const = cycl_utilities.atomic_sentence_arg(nl_trie_word_support_sentence(syn_support), const_arg, (SubLObject)nl_trie.UNPROVIDED);
            return find_pos_for_lex_const(v_const);
        }
        if (nl_trie.NIL != lexicon_accessors.speech_part_predP(pred, (SubLObject)nl_trie.UNPROVIDED)) {
            return lexicon_accessors.pos_of_pred(pred);
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 49895L)
    public static SubLObject nl_trie_word_pos(final SubLObject word) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)nl_trie.NIL;
        if (nl_trie.NIL == v_memoization_state) {
            return nl_trie_word_pos_internal(word);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)nl_trie.$sym175$NL_TRIE_WORD_POS, (SubLObject)nl_trie.UNPROVIDED);
        if (nl_trie.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)nl_trie.$sym175$NL_TRIE_WORD_POS, (SubLObject)nl_trie.ONE_INTEGER, (SubLObject)nl_trie.$int178$1000, (SubLObject)nl_trie.EQL, (SubLObject)nl_trie.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)nl_trie.$sym175$NL_TRIE_WORD_POS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, word, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(nl_trie_word_pos_internal(word)));
            memoization_state.caching_state_put(caching_state, word, results, (SubLObject)nl_trie.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 50739L)
    public static SubLObject nl_trie_word_word_unit(final SubLObject word, SubLObject verify_wordhoodP) {
        if (verify_wordhoodP == nl_trie.UNPROVIDED) {
            verify_wordhoodP = (SubLObject)nl_trie.T;
        }
        final SubLObject syn_support = nl_trie_word_arbitrary_syntactic_support(word);
        final SubLObject pred = nl_trie_word_support_predicate(syn_support);
        if (nl_trie.NIL != nl_trie_multi_word_abbreviation_pred_p(pred)) {
            return (SubLObject)nl_trie.NIL;
        }
        final SubLObject wu_arg = lexicon_utilities.wu_arg_of_pred_cached(pred);
        SubLObject result = (SubLObject)nl_trie.NIL;
        if (wu_arg.isInteger()) {
            result = cycl_utilities.atomic_sentence_arg(nl_trie_word_support_sentence(syn_support), wu_arg, (SubLObject)nl_trie.UNPROVIDED);
        }
        return (SubLObject)((nl_trie.NIL == verify_wordhoodP || nl_trie.NIL != lexicon_accessors.quick_lexical_wordP(result, (SubLObject)nl_trie.UNPROVIDED)) ? result : nl_trie.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 51322L)
    public static SubLObject nl_trie_word_frame(final SubLObject word) {
        final SubLObject set_var = nl_trie_word_semantic_support_set(word);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject sem_support;
        SubLObject frame;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)nl_trie.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); nl_trie.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            sem_support = set_contents.do_set_contents_next(basis_object, state);
            if (nl_trie.NIL != set_contents.do_set_contents_element_validP(state, sem_support)) {
                frame = nl_trie_word_semantic_support_frame(sem_support);
                if (nl_trie.NIL != forts.fort_p(frame)) {
                    return frame;
                }
            }
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 51594L)
    public static SubLObject nl_trie_word_semantic_support_frame(final SubLObject sem_support) {
        final SubLObject pred = nl_trie_word_support_predicate(sem_support);
        final SubLObject frame_arg = lexicon_utilities.frame_arg_of_pred_cached(pred, (SubLObject)nl_trie.UNPROVIDED);
        return (SubLObject)(frame_arg.isInteger() ? cycl_utilities.atomic_sentence_arg(nl_trie_word_support_sentence(sem_support), frame_arg, (SubLObject)nl_trie.UNPROVIDED) : nl_trie.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 51944L)
    public static SubLObject do_nl_trie_word_denots(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list179);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject denot = (SubLObject)nl_trie.NIL;
        SubLObject entry = (SubLObject)nl_trie.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list179);
        denot = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list179);
        entry = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)nl_trie.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)nl_trie.NIL;
        SubLObject current_$34 = (SubLObject)nl_trie.NIL;
        while (nl_trie.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)nl_trie.$list179);
            current_$34 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)nl_trie.$list179);
            if (nl_trie.NIL == conses_high.member(current_$34, (SubLObject)nl_trie.$list180, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED)) {
                bad = (SubLObject)nl_trie.T;
            }
            if (current_$34 == nl_trie.$kw81$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (nl_trie.NIL != bad && nl_trie.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_trie.$list179);
        }
        final SubLObject preferred_onlyP_tail = cdestructuring_bind.property_list_member((SubLObject)nl_trie.$kw181$PREFERRED_ONLY_, current);
        final SubLObject preferred_onlyP = (SubLObject)((nl_trie.NIL != preferred_onlyP_tail) ? conses_high.cadr(preferred_onlyP_tail) : nl_trie.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject pred = (SubLObject)nl_trie.$sym182$PRED;
        final SubLObject denot_arg = (SubLObject)nl_trie.$sym183$DENOT_ARG;
        final SubLObject semantic_support = (SubLObject)nl_trie.$sym184$SEMANTIC_SUPPORT;
        return (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym29$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(pred, (SubLObject)ConsesLow.listS((SubLObject)nl_trie.$sym185$NL_TRIE_WORD_SEM_PRED, entry, (SubLObject)nl_trie.$list7)), (SubLObject)ConsesLow.list(denot_arg, (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym186$FWHEN, (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym187$INDEXED_TERM_P, pred), (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym188$DENOTATUM_ARG_OF_PRED_CACHED, pred)))), (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym36$PWHEN, (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym189$INTEGERP, denot_arg), (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym83$DO_SET, (SubLObject)ConsesLow.list(semantic_support, (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym85$NL_TRIE_WORD_SEMANTIC_SUPPORT_SET, entry)), (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym36$PWHEN, (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym190$FIMPLIES, preferred_onlyP, (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym191$NL_TRIE_PREFERRED_SEMANTIC_SUPPORT_, semantic_support)), (SubLObject)ConsesLow.listS((SubLObject)nl_trie.$sym35$CDOLIST, (SubLObject)ConsesLow.list(denot, (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym149$NL_TRIE_WORD_SEMANTIC_SUPPORT_DENOTS, semantic_support, denot_arg)), ConsesLow.append(body, (SubLObject)nl_trie.NIL))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 52608L)
    public static SubLObject nl_trie_preferred_semantic_supportP(final SubLObject semantic_support) {
        SubLObject preferredP = (SubLObject)nl_trie.NIL;
        if (nl_trie.NIL != nl_trie_preferred_semantic_predicate_p(nl_trie_word_support_predicate(semantic_support))) {
            preferredP = (SubLObject)nl_trie.T;
        }
        else if (nl_trie.NIL != nl_trie_preferred_lexical_assertionP(semantic_support)) {
            preferredP = (SubLObject)nl_trie.T;
        }
        return preferredP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 53110L)
    public static SubLObject nl_trie_preferred_semantic_predicate_p(final SubLObject predicate) {
        return subl_promotions.memberP(predicate, nl_trie.$nl_trie_preferred_semantic_predicates$.getGlobalValue(), (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 53257L)
    public static SubLObject nl_trie_preferred_lexical_assertionP(final SubLObject semantic_support) {
        SubLObject preferredP = (SubLObject)nl_trie.NIL;
        if (nl_trie.NIL != assertion_handles.assertion_p(semantic_support) && nl_trie.NIL == preferredP) {
            SubLObject csome_list_var = assertion_utilities.all_meta_assertions(semantic_support);
            SubLObject meta_assertion = (SubLObject)nl_trie.NIL;
            meta_assertion = csome_list_var.first();
            while (nl_trie.NIL == preferredP && nl_trie.NIL != csome_list_var) {
                if (nl_trie.NIL != nl_trie_preferred_meta_assertionP(meta_assertion)) {
                    preferredP = (SubLObject)nl_trie.T;
                }
                csome_list_var = csome_list_var.rest();
                meta_assertion = csome_list_var.first();
            }
        }
        return preferredP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 53588L)
    public static SubLObject nl_trie_preferred_meta_assertionP(final SubLObject meta_assertion) {
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL != assertions_high.gaf_assertionP(meta_assertion) && nl_trie.NIL != genl_predicates.genl_predicateP(assertions_high.gaf_arg0(meta_assertion), nl_trie.$const193$preferredLexification, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 53778L)
    public static SubLObject do_nl_trie_word_semtrans_templates(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list194);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject semtrans_template = (SubLObject)nl_trie.NIL;
        SubLObject entry = (SubLObject)nl_trie.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list194);
        semtrans_template = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list194);
        entry = current.first();
        current = current.rest();
        if (nl_trie.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject pred = (SubLObject)nl_trie.$sym195$PRED;
            final SubLObject semtrans_template_arg = (SubLObject)nl_trie.$sym196$SEMTRANS_TEMPLATE_ARG;
            final SubLObject semantic_support = (SubLObject)nl_trie.$sym197$SEMANTIC_SUPPORT;
            final SubLObject invalid_supports = (SubLObject)nl_trie.$sym198$INVALID_SUPPORTS;
            return (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym29$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(pred, (SubLObject)ConsesLow.listS((SubLObject)nl_trie.$sym185$NL_TRIE_WORD_SEM_PRED, entry, (SubLObject)nl_trie.$list7)), (SubLObject)ConsesLow.list(semtrans_template_arg, (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym186$FWHEN, (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym187$INDEXED_TERM_P, pred), (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym199$SEMTRANS_ARG_OF_PRED_CACHED, pred))), reader.bq_cons(invalid_supports, (SubLObject)nl_trie.$list7)), (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym36$PWHEN, (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym189$INTEGERP, semtrans_template_arg), (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym83$DO_SET, (SubLObject)ConsesLow.list(semantic_support, (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym85$NL_TRIE_WORD_SEMANTIC_SUPPORT_SET, entry)), (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym200$PIF, (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym201$VALID_NL_TRIE_WORD_SEMANTIC_SUPPORT_P, semantic_support), (SubLObject)ConsesLow.listS((SubLObject)nl_trie.$sym35$CDOLIST, (SubLObject)ConsesLow.list(semtrans_template, (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym151$NL_TRIE_WORD_SEMANTIC_SUPPORT_SEMTRANS_TEMPLATES, semantic_support, semtrans_template_arg)), ConsesLow.append(body, (SubLObject)nl_trie.NIL)), (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym202$CPUSH, semantic_support, invalid_supports))), (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym35$CDOLIST, (SubLObject)ConsesLow.list(semantic_support, invalid_supports), (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym203$NL_TRIE_WORD_REMOVE_SEMANTIC_SUPPORT, entry, semantic_support))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_trie.$list194);
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 54695L)
    public static SubLObject do_nl_trie_word_strings(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list204);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject string = (SubLObject)nl_trie.NIL;
        SubLObject word_entry = (SubLObject)nl_trie.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list204);
        string = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list204);
        word_entry = current.first();
        current = current.rest();
        if (nl_trie.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject semantic_support = (SubLObject)nl_trie.$sym205$SEMANTIC_SUPPORT;
            final SubLObject leading_strings = (SubLObject)nl_trie.$sym206$LEADING_STRINGS;
            final SubLObject head_string = (SubLObject)nl_trie.$sym207$HEAD_STRING;
            final SubLObject following_strings = (SubLObject)nl_trie.$sym208$FOLLOWING_STRINGS;
            return (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym29$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(head_string, (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym209$NL_TRIE_WORD_HEAD_STRING_MACRO_HELPER, word_entry))), (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym210$DO_NL_TRIE_WORD_SEMANTIC_SUPPORTS, (SubLObject)ConsesLow.list(semantic_support, word_entry), (SubLObject)ConsesLow.listS((SubLObject)nl_trie.$sym29$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(leading_strings, (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym211$NL_TRIE_WORD_LEADING_STRINGS_FROM_SUPPORT_MACRO_HELPER, semantic_support)), (SubLObject)ConsesLow.list(following_strings, (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym212$NL_TRIE_WORD_FOLLOWING_STRINGS_FROM_SUPPORT_MACRO_HELPER, semantic_support)), (SubLObject)ConsesLow.list(string, (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym213$NL_TRIE_ASSEMBLE_STRINGS_MACRO_HELPER, leading_strings, head_string, following_strings))), ConsesLow.append(body, (SubLObject)nl_trie.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_trie.$list204);
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 55383L)
    public static SubLObject nl_trie_word_head_string_macro_helper(final SubLObject word) {
        return nl_trie_word_head_string(word);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 55526L)
    public static SubLObject nl_trie_word_leading_strings_from_support_macro_helper(final SubLObject support) {
        return nl_trie_word_leading_strings_from_support(support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 55709L)
    public static SubLObject nl_trie_word_following_strings_from_support_macro_helper(final SubLObject support) {
        return nl_trie_word_following_strings_from_support(support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 55896L)
    public static SubLObject nl_trie_assemble_strings_macro_helper(final SubLObject leading_strings, final SubLObject head_string, final SubLObject following_strings) {
        return nl_trie_assemble_strings(leading_strings, head_string, following_strings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 56121L)
    public static SubLObject nl_trie_word_string(final SubLObject word) {
        final SubLObject leading_strings = nl_trie_word_leading_strings(word);
        final SubLObject head_string = nl_trie_word_head_string(word);
        final SubLObject following_strings = nl_trie_word_following_strings(word);
        return (SubLObject)((nl_trie.NIL != head_string) ? nl_trie_assemble_strings(leading_strings, head_string, following_strings) : nl_trie.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 56446L)
    public static SubLObject nl_trie_word_head_string(final SubLObject word) {
        final SubLObject syn_support = nl_trie_word_arbitrary_syntactic_support(word);
        return nl_trie_syntactic_support_string(syn_support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 56626L)
    public static SubLObject nl_trie_syntactic_support_string(final SubLObject syn_support) {
        final SubLObject pred = nl_trie_word_support_predicate(syn_support);
        final SubLObject head_string_arg = nl_trie_word_syn_pred_string_arg(pred);
        return (SubLObject)(head_string_arg.isInteger() ? cycl_string.cycl_string_to_utf8_string(cycl_utilities.atomic_sentence_arg(nl_trie_word_support_sentence(syn_support), head_string_arg, (SubLObject)nl_trie.UNPROVIDED)) : nl_trie.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 56985L)
    public static SubLObject nl_trie_word_leading_strings(final SubLObject word) {
        final SubLObject sem_support = nl_trie_word_arbitrary_semantic_support(word);
        return nl_trie_word_leading_strings_from_support(sem_support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 57177L)
    public static SubLObject nl_trie_word_leading_strings_from_support(final SubLObject support) {
        return lexicon_utilities.get_leading_strings_from_formula(nl_trie_word_support_sentence(support));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 57332L)
    public static SubLObject nl_trie_word_following_strings(final SubLObject word) {
        final SubLObject sem_support = nl_trie_word_arbitrary_semantic_support(word);
        return nl_trie_word_following_strings_from_support(sem_support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 57530L)
    public static SubLObject nl_trie_word_following_strings_from_support(final SubLObject support) {
        return lexicon_utilities.get_following_strings_from_formula(nl_trie_word_support_sentence(support));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 57687L)
    public static SubLObject nl_trie_word_head_onlyP(final SubLObject word) {
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL == nl_trie_word_leading_strings(word) && nl_trie.NIL == nl_trie_word_following_strings(word));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 57953L)
    public static SubLObject nl_trie_head_locations_in_lexical_string(final SubLObject v_cycl_string) {
        final SubLObject string = cycl_string.cycl_string_to_utf8_string(v_cycl_string);
        final SubLObject entries = nl_trie_search(string, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
        SubLObject locations = (SubLObject)nl_trie.NIL;
        SubLObject cdolist_list_var = entries;
        SubLObject entry = (SubLObject)nl_trie.NIL;
        entry = cdolist_list_var.first();
        while (nl_trie.NIL != cdolist_list_var) {
            if (nl_trie.NIL != nl_trie_word_p(entry, (SubLObject)nl_trie.UNPROVIDED)) {
                final SubLObject head_string = nl_trie_word_head_string(entry);
                final SubLObject var;
                final SubLObject location = var = lexification_utilities.lex_find_word_in_string(head_string, string);
                if (nl_trie.NIL != var) {
                    locations = (SubLObject)ConsesLow.cons(var, locations);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        return Sequences.remove_duplicates(locations, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 58548L)
    public static SubLObject nl_trie_word_sem_pred(final SubLObject word, SubLObject use_abbrev_predP) {
        if (use_abbrev_predP == nl_trie.UNPROVIDED) {
            use_abbrev_predP = (SubLObject)nl_trie.T;
        }
        final SubLObject syntactic_support = nl_trie_word_arbitrary_syntactic_support(word);
        final SubLObject syn_arg0 = nl_trie_word_support_predicate(syntactic_support);
        final SubLObject semantic_support = nl_trie_word_arbitrary_semantic_support(word);
        if (nl_trie.NIL != use_abbrev_predP && nl_trie.NIL != nl_trie_abbreviation_pred_p(syn_arg0)) {
            return syn_arg0;
        }
        if (nl_trie.NIL != nl_trie_word_support_p(semantic_support)) {
            return nl_trie_word_support_predicate(semantic_support);
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 59053L)
    public static SubLObject nl_trie_word_denots(final SubLObject word) {
        SubLObject denots = (SubLObject)nl_trie.NIL;
        final SubLObject pred = nl_trie_word_sem_pred(word, (SubLObject)nl_trie.NIL);
        final SubLObject denot_arg = (SubLObject)((nl_trie.NIL != kb_indexing_datastructures.indexed_term_p(pred)) ? lexicon_utilities.denotatum_arg_of_pred_cached(pred) : nl_trie.NIL);
        if (denot_arg.isInteger()) {
            final SubLObject set_var = nl_trie_word_semantic_support_set(word);
            final SubLObject set_contents_var = set.do_set_internal(set_var);
            SubLObject basis_object;
            SubLObject state;
            SubLObject semantic_support;
            SubLObject cdolist_list_var;
            SubLObject denot;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)nl_trie.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); nl_trie.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                semantic_support = set_contents.do_set_contents_next(basis_object, state);
                if (nl_trie.NIL != set_contents.do_set_contents_element_validP(state, semantic_support)) {
                    cdolist_list_var = nl_trie_word_semantic_support_denots(semantic_support, denot_arg);
                    denot = (SubLObject)nl_trie.NIL;
                    denot = cdolist_list_var.first();
                    while (nl_trie.NIL != cdolist_list_var) {
                        denots = (SubLObject)ConsesLow.cons(denot, denots);
                        cdolist_list_var = cdolist_list_var.rest();
                        denot = cdolist_list_var.first();
                    }
                }
            }
        }
        return denots;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 59247L)
    public static SubLObject nl_trie_word_preferred_denots(final SubLObject word) {
        SubLObject denots = (SubLObject)nl_trie.NIL;
        final SubLObject pred = nl_trie_word_sem_pred(word, (SubLObject)nl_trie.NIL);
        final SubLObject denot_arg = (SubLObject)((nl_trie.NIL != kb_indexing_datastructures.indexed_term_p(pred)) ? lexicon_utilities.denotatum_arg_of_pred_cached(pred) : nl_trie.NIL);
        if (denot_arg.isInteger()) {
            final SubLObject set_var = nl_trie_word_semantic_support_set(word);
            final SubLObject set_contents_var = set.do_set_internal(set_var);
            SubLObject basis_object;
            SubLObject state;
            SubLObject semantic_support;
            SubLObject cdolist_list_var;
            SubLObject denot;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)nl_trie.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); nl_trie.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                semantic_support = set_contents.do_set_contents_next(basis_object, state);
                if (nl_trie.NIL != set_contents.do_set_contents_element_validP(state, semantic_support) && nl_trie.NIL != nl_trie_preferred_semantic_supportP(semantic_support)) {
                    cdolist_list_var = nl_trie_word_semantic_support_denots(semantic_support, denot_arg);
                    denot = (SubLObject)nl_trie.NIL;
                    denot = cdolist_list_var.first();
                    while (nl_trie.NIL != cdolist_list_var) {
                        denots = (SubLObject)ConsesLow.cons(denot, denots);
                        cdolist_list_var = cdolist_list_var.rest();
                        denot = cdolist_list_var.first();
                    }
                }
            }
        }
        return denots;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 59514L)
    public static SubLObject nl_trie_word_semtrans_templates(final SubLObject word) {
        SubLObject semtrans_templates = (SubLObject)nl_trie.NIL;
        final SubLObject pred = nl_trie_word_sem_pred(word, (SubLObject)nl_trie.NIL);
        final SubLObject semtrans_template_arg = (SubLObject)((nl_trie.NIL != kb_indexing_datastructures.indexed_term_p(pred)) ? lexicon_utilities.semtrans_arg_of_pred_cached(pred) : nl_trie.NIL);
        SubLObject invalid_supports = (SubLObject)nl_trie.NIL;
        if (semtrans_template_arg.isInteger()) {
            final SubLObject set_var = nl_trie_word_semantic_support_set(word);
            final SubLObject set_contents_var = set.do_set_internal(set_var);
            SubLObject basis_object;
            SubLObject state;
            SubLObject semantic_support;
            SubLObject cdolist_list_var;
            SubLObject semtrans_template;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)nl_trie.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); nl_trie.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                semantic_support = set_contents.do_set_contents_next(basis_object, state);
                if (nl_trie.NIL != set_contents.do_set_contents_element_validP(state, semantic_support)) {
                    if (nl_trie.NIL != valid_nl_trie_word_semantic_support_p(semantic_support)) {
                        cdolist_list_var = nl_trie_word_semantic_support_semtrans_templates(semantic_support, semtrans_template_arg);
                        semtrans_template = (SubLObject)nl_trie.NIL;
                        semtrans_template = cdolist_list_var.first();
                        while (nl_trie.NIL != cdolist_list_var) {
                            semtrans_templates = (SubLObject)ConsesLow.cons(semtrans_template, semtrans_templates);
                            cdolist_list_var = cdolist_list_var.rest();
                            semtrans_template = cdolist_list_var.first();
                        }
                    }
                    else {
                        invalid_supports = (SubLObject)ConsesLow.cons(semantic_support, invalid_supports);
                    }
                }
            }
            SubLObject cdolist_list_var2 = invalid_supports;
            SubLObject semantic_support2 = (SubLObject)nl_trie.NIL;
            semantic_support2 = cdolist_list_var2.first();
            while (nl_trie.NIL != cdolist_list_var2) {
                nl_trie_word_remove_semantic_support(word, semantic_support2);
                cdolist_list_var2 = cdolist_list_var2.rest();
                semantic_support2 = cdolist_list_var2.first();
            }
        }
        return semtrans_templates;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 59806L)
    public static SubLObject nl_trie_word_syntax_mt(final SubLObject word) {
        return nl_trie_word_support_mt(nl_trie_word_arbitrary_syntactic_support(word));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 60038L)
    public static SubLObject nl_trie_word_semantics_mt(final SubLObject word) {
        if (nl_trie.NIL != set.set_emptyP(nl_trie_word_semantic_support_set(word))) {
            return (SubLObject)nl_trie.NIL;
        }
        final SubLObject syntax_mt = nl_trie_word_syntax_mt(word);
        final SubLObject semantic_support = nl_trie_word_arbitrary_semantic_support(word);
        final SubLObject semantics_mt = nl_trie_word_support_mt(semantic_support);
        return (nl_trie.NIL != lexicon_accessors.genl_lexicon_mtP(semantics_mt, syntax_mt)) ? semantics_mt : syntax_mt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 60707L)
    public static SubLObject print_nl_trie_word(final SubLObject word, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)nl_trie.$str214$__NL_TRIE_WORD_Word_unit______S__, nl_trie_word_word_unit(word, (SubLObject)nl_trie.UNPROVIDED));
        PrintLow.format(stream, (SubLObject)nl_trie.$str215$_______________POS____________S__, nl_trie_word_pos(word));
        PrintLow.format(stream, (SubLObject)nl_trie.$str216$_______________POS_Preds______S__, nl_trie_word_pos_preds(word));
        PrintLow.format(stream, (SubLObject)nl_trie.$str217$_______________Lexical_Pred___S__, nl_trie_entry_semantic_pred(word, (SubLObject)nl_trie.UNPROVIDED));
        PrintLow.format(stream, (SubLObject)nl_trie.$str218$_______________Denotations____S__, nl_trie_entry_denots(word));
        PrintLow.format(stream, (SubLObject)nl_trie.$str219$_______________Pragmatics_____S__, nl_trie_entry_pragmatics(word));
        PrintLow.format(stream, (SubLObject)nl_trie.$str220$_______________Microtheory____S__, nl_trie_entry_mt(word));
        return word;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 61523L)
    public static SubLObject print_nl_trie_name(final SubLObject name, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)nl_trie.$str221$__NL_TRIE_NAME_Namestring_Pred___, nl_trie_entry_semantic_pred(name, (SubLObject)nl_trie.UNPROVIDED));
        PrintLow.format(stream, (SubLObject)nl_trie.$str222$_______________Denotations_______, nl_trie_entry_denots(name));
        PrintLow.format(stream, (SubLObject)nl_trie.$str223$_______________Pragmatics________, nl_trie_entry_pragmatics(name));
        PrintLow.format(stream, (SubLObject)nl_trie.$str224$_______________Microtheory_______, nl_trie_entry_mt(name));
        return name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 62323L)
    public static SubLObject nl_trie_name_p(final SubLObject obj, SubLObject robustP) {
        if (robustP == nl_trie.UNPROVIDED) {
            robustP = (SubLObject)nl_trie.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL != nart_handles.nart_p(obj) || (nl_trie.NIL != assertion_handles.assertion_p(obj) && nl_trie.NIL == nl_trie_term_phrases_entry_p(obj, (SubLObject)nl_trie.NIL) && (nl_trie.NIL != lexicon_macros.assume_nl_trie_validP() || nl_trie.NIL == robustP || (nl_trie.NIL != assertions_high.gaf_assertionP(obj) && nl_trie.NIL != nl_trie_name_string_predP(assertions_high.gaf_arg0(obj))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 62628L)
    public static SubLObject validate_nl_trie_name(final SubLObject name) {
        final SubLObject validP = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL != lexicon_macros.assume_nl_trie_validP() || nl_trie.NIL != nart_handles.valid_nartP(name, (SubLObject)nl_trie.UNPROVIDED) || nl_trie.NIL != nl_trie_valid_assertionP(name));
        if (nl_trie.NIL == validP) {
            nl_trie_warn((SubLObject)nl_trie.TWO_INTEGER, (SubLObject)nl_trie.$str225$Invalid_NL_trie_name___S, name, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
        }
        return (SubLObject)((nl_trie.NIL != validP) ? name : nl_trie.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 62889L)
    public static SubLObject validate_nl_trie_term_phrases_entry(final SubLObject tp_entry) {
        final SubLObject validP = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL != lexicon_macros.assume_nl_trie_validP() || nl_trie.NIL != nl_trie_valid_assertionP(tp_entry));
        if (nl_trie.NIL == validP) {
            nl_trie_warn((SubLObject)nl_trie.TWO_INTEGER, (SubLObject)nl_trie.$str226$Invalid_NL_trie_tp_entry___S, tp_entry, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
        }
        return (SubLObject)((nl_trie.NIL != validP) ? tp_entry : nl_trie.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 63161L)
    public static SubLObject nl_trie_name_pred(final SubLObject name) {
        if (nl_trie.NIL != assertion_handles.assertion_p(name)) {
            return assertions_high.gaf_arg0(name);
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 63268L)
    public static SubLObject nl_trie_name_denot(final SubLObject name) {
        if (nl_trie.NIL != nart_handles.nart_p(name)) {
            return name;
        }
        if (nl_trie.NIL != assertion_handles.assertion_p(name)) {
            return assertions_high.gaf_arg1(name);
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 63408L)
    public static SubLObject nl_trie_name_preferred_denots(final SubLObject name) {
        if (nl_trie.NIL != assertion_handles.assertion_p(name) && nl_trie.NIL != nl_trie_preferred_semantic_supportP(name)) {
            return (SubLObject)ConsesLow.list(nl_trie_name_denot(name));
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 63611L)
    public static SubLObject nl_trie_name_string(final SubLObject name) {
        if (nl_trie.NIL != assertion_handles.assertion_p(name)) {
            return cycl_string.cycl_string_to_utf8_string(assertions_high.gaf_arg2(name));
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 63847L)
    public static SubLObject nl_trie_record_p_internal(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(obj.isCons() && nl_trie.NIL != valid_nl_trie_record_key_p(obj.first()) && nl_trie.NIL != valid_nl_trie_record_entries_p(obj.rest()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 63847L)
    public static SubLObject nl_trie_record_p(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)nl_trie.NIL;
        if (nl_trie.NIL == v_memoization_state) {
            return nl_trie_record_p_internal(obj);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)nl_trie.$sym227$NL_TRIE_RECORD_P, (SubLObject)nl_trie.UNPROVIDED);
        if (nl_trie.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)nl_trie.$sym227$NL_TRIE_RECORD_P, (SubLObject)nl_trie.ONE_INTEGER, (SubLObject)nl_trie.NIL, (SubLObject)nl_trie.EQUALP, (SubLObject)nl_trie.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)nl_trie.$sym227$NL_TRIE_RECORD_P, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, obj, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(nl_trie_record_p_internal(obj)));
            memoization_state.caching_state_put(caching_state, obj, results, (SubLObject)nl_trie.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 64125L)
    public static SubLObject new_nl_trie_record(final SubLObject key, final SubLObject entries) {
        assert nl_trie.NIL != valid_nl_trie_record_key_p(key) : key;
        assert nl_trie.NIL != valid_nl_trie_record_entries_p(entries) : entries;
        return (SubLObject)ConsesLow.cons(unicode_nauts.convert_unicode_nauts_to_utf8_strings(key), entries);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 64351L)
    public static SubLObject nl_trie_record_key(final SubLObject record) {
        assert nl_trie.NIL != nl_trie_record_p(record) : record;
        return record.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 64466L)
    public static SubLObject nl_trie_record_entries(final SubLObject record) {
        assert nl_trie.NIL != nl_trie_record_p(record) : record;
        return record.rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 64587L)
    public static SubLObject valid_nl_trie_record_key_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(obj.isList() && nl_trie.NIL == list_utilities.find_if_not((SubLObject)nl_trie.$sym230$CYCL_STRING_P, obj, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 64711L)
    public static SubLObject valid_nl_trie_record_entries_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(obj.isList() && nl_trie.NIL == list_utilities.find_if_not((SubLObject)nl_trie.$sym88$NL_TRIE_ENTRY_P, obj, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 65951L)
    public static SubLObject nl_trie_syntactic_predicates() {
        if (!nl_trie.$nl_trie_syntactic_predicates$.getGlobalValue().isList()) {
            initialize_nl_trie_syntactic_predicates();
        }
        return nl_trie.$nl_trie_syntactic_predicates$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 66137L)
    public static SubLObject nl_trie_denotation_predicates() {
        if (!nl_trie.$nl_trie_denotation_predicates$.getGlobalValue().isList()) {
            initialize_nl_trie_denotation_predicates();
        }
        return nl_trie.$nl_trie_denotation_predicates$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 66329L)
    public static SubLObject nl_trie_semtrans_predicates() {
        if (!nl_trie.$nl_trie_semtrans_predicates$.getGlobalValue().isList()) {
            initialize_nl_trie_other_predicates();
        }
        return nl_trie.$nl_trie_semtrans_predicates$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 66510L)
    public static SubLObject nl_trie_abbreviation_predicates() {
        if (!nl_trie.$nl_trie_abbreviation_predicates$.getGlobalValue().isList()) {
            initialize_nl_trie_other_predicates();
        }
        return nl_trie.$nl_trie_abbreviation_predicates$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 66701L)
    public static SubLObject nl_trie_arg_in_reln_predicates() {
        if (!nl_trie.$nl_trie_arg_in_reln_predicates$.getGlobalValue().isList()) {
            initialize_nl_trie_other_predicates();
        }
        return nl_trie.$nl_trie_arg_in_reln_predicates$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 66889L)
    public static SubLObject nl_trie_pragmatic_predicates() {
        if (!nl_trie.$nl_trie_pragmatic_predicates$.getGlobalValue().isList()) {
            initialize_nl_trie_pragmatic_predicates();
        }
        return nl_trie.$nl_trie_pragmatic_predicates$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 67647L)
    public static SubLObject initializing_nl_trie(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list240);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_nl_trie = (SubLObject)nl_trie.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list240);
        v_nl_trie = current.first();
        current = current.rest();
        if (nl_trie.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym29$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym241$_NL_TRIES_BEING_INITIALIZED_, (SubLObject)ConsesLow.listS((SubLObject)nl_trie.$sym242$CONS, v_nl_trie, (SubLObject)nl_trie.$list243))), (SubLObject)ConsesLow.listS((SubLObject)nl_trie.$sym31$WITH_NL_TRIE_LOCK_HELD, (SubLObject)nl_trie.$list244, ConsesLow.append(body, (SubLObject)nl_trie.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_trie.$list240);
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 67867L)
    public static SubLObject nl_trie_being_initializedP(SubLObject v_nl_trie) {
        if (v_nl_trie == nl_trie.UNPROVIDED) {
            v_nl_trie = get_nl_trie();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(v_nl_trie, nl_trie.$nl_tries_being_initialized$.getDynamicValue(thread), (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 68004L)
    public static SubLObject new_nl_trie(SubLObject test) {
        if (test == nl_trie.UNPROVIDED) {
            test = nl_trie.$nl_trie_default_test$.getGlobalValue();
        }
        return strie.new_strie(test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 68415L)
    public static SubLObject nl_trie_p(final SubLObject v_object, SubLObject sloppyP) {
        if (sloppyP == nl_trie.UNPROVIDED) {
            sloppyP = (SubLObject)nl_trie.T;
        }
        return strie.strie_p(v_object, sloppyP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 68550L)
    public static SubLObject nl_trie_presentP(SubLObject v_nl_trie) {
        if (v_nl_trie == nl_trie.UNPROVIDED) {
            v_nl_trie = nl_trie.$nl_trie$.getGlobalValue();
        }
        return nl_trie_p(v_nl_trie, (SubLObject)nl_trie.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 68725L)
    public static SubLObject get_nl_trie() {
        if (nl_trie.NIL != nl_trie_presentP((SubLObject)nl_trie.UNPROVIDED)) {
            return nl_trie.$nl_trie$.getGlobalValue();
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 68880L)
    public static SubLObject nl_trie_size(SubLObject v_nl_trie) {
        if (v_nl_trie == nl_trie.UNPROVIDED) {
            v_nl_trie = nl_trie.$nl_trie$.getGlobalValue();
        }
        if (nl_trie.NIL == nl_trie_presentP(v_nl_trie)) {
            nl_trie_not_present_message(v_nl_trie);
            return (SubLObject)nl_trie.$kw246$ABORTED;
        }
        return strie.strie_size(v_nl_trie);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 69258L)
    public static SubLObject nl_trie_keys(SubLObject v_nl_trie) {
        if (v_nl_trie == nl_trie.UNPROVIDED) {
            v_nl_trie = nl_trie.$nl_trie$.getGlobalValue();
        }
        if (nl_trie.NIL == nl_trie_presentP(v_nl_trie)) {
            nl_trie_not_present_message(v_nl_trie);
            return (SubLObject)nl_trie.$kw246$ABORTED;
        }
        return strie.strie_keys(v_nl_trie);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 69702L)
    public static SubLObject empty_nl_trieP(SubLObject v_nl_trie) {
        if (v_nl_trie == nl_trie.UNPROVIDED) {
            v_nl_trie = nl_trie.$nl_trie$.getGlobalValue();
        }
        if (nl_trie.NIL == nl_trie_presentP(v_nl_trie)) {
            nl_trie_not_present_message(v_nl_trie);
            return (SubLObject)nl_trie.$kw246$ABORTED;
        }
        return strie.strie_empty_p(v_nl_trie);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 70100L)
    public static SubLObject do_nl_trie(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list247);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = (SubLObject)nl_trie.NIL;
        SubLObject entries = (SubLObject)nl_trie.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list247);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list247);
        entries = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)nl_trie.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)nl_trie.NIL;
        SubLObject current_$35 = (SubLObject)nl_trie.NIL;
        while (nl_trie.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)nl_trie.$list247);
            current_$35 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)nl_trie.$list247);
            if (nl_trie.NIL == conses_high.member(current_$35, (SubLObject)nl_trie.$list80, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED)) {
                bad = (SubLObject)nl_trie.T;
            }
            if (current_$35 == nl_trie.$kw81$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (nl_trie.NIL != bad && nl_trie.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_trie.$list247);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)nl_trie.$kw82$DONE, current);
        final SubLObject done = (SubLObject)((nl_trie.NIL != done_tail) ? conses_high.cadr(done_tail) : nl_trie.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym31$WITH_NL_TRIE_LOCK_HELD, (SubLObject)nl_trie.$list248, (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym28$WITH_NL_TRIE_CACHE_STRATEGY, (SubLObject)ConsesLow.listS((SubLObject)nl_trie.$sym249$DO_STRIE, (SubLObject)ConsesLow.list(key, entries, (SubLObject)nl_trie.$list250, (SubLObject)nl_trie.$kw82$DONE, done), ConsesLow.append(body, (SubLObject)nl_trie.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 70596L)
    public static SubLObject do_nl_trie_progress(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list251);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = (SubLObject)nl_trie.NIL;
        SubLObject entries = (SubLObject)nl_trie.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list251);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list251);
        entries = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)nl_trie.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)nl_trie.NIL;
        SubLObject current_$36 = (SubLObject)nl_trie.NIL;
        while (nl_trie.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)nl_trie.$list251);
            current_$36 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)nl_trie.$list251);
            if (nl_trie.NIL == conses_high.member(current_$36, (SubLObject)nl_trie.$list252, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED)) {
                bad = (SubLObject)nl_trie.T;
            }
            if (current_$36 == nl_trie.$kw81$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (nl_trie.NIL != bad && nl_trie.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_trie.$list251);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)nl_trie.$kw82$DONE, current);
        final SubLObject done = (SubLObject)((nl_trie.NIL != done_tail) ? conses_high.cadr(done_tail) : nl_trie.NIL);
        final SubLObject progress_note_tail = cdestructuring_bind.property_list_member((SubLObject)nl_trie.$kw253$PROGRESS_NOTE, current);
        final SubLObject progress_note = (SubLObject)((nl_trie.NIL != progress_note_tail) ? conses_high.cadr(progress_note_tail) : nl_trie.$str254$Mapping_NL_trie___);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym31$WITH_NL_TRIE_LOCK_HELD, (SubLObject)nl_trie.$list255, (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym28$WITH_NL_TRIE_CACHE_STRATEGY, (SubLObject)ConsesLow.listS((SubLObject)nl_trie.$sym33$DO_STRIE_PROGRESS, (SubLObject)ConsesLow.list(key, entries, (SubLObject)nl_trie.$list250, (SubLObject)nl_trie.$kw82$DONE, done, (SubLObject)nl_trie.$kw253$PROGRESS_NOTE, progress_note), ConsesLow.append(body, (SubLObject)nl_trie.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 71071L)
    public static SubLObject nl_trie_entry_count(SubLObject string) {
        if (string == nl_trie.UNPROVIDED) {
            string = (SubLObject)nl_trie.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (nl_trie.NIL != string) {
            final SubLObject entries = nl_trie_search(string, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
            return (SubLObject)(entries.isList() ? Sequences.length(entries) : nl_trie.ZERO_INTEGER);
        }
        SubLObject count = (SubLObject)nl_trie.ZERO_INTEGER;
        SubLObject release = (SubLObject)nl_trie.NIL;
        try {
            release = Locks.seize_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
            final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
            final SubLObject _prev_bind_2 = file_vector_utilities.$current_backed_map_cache_strategy$.currentBinding(thread);
            try {
                file_vector_utilities.$file_vector_backed_map_read_lock$.bind(nl_trie.$nl_trie_lock$.getGlobalValue(), thread);
                file_vector_utilities.$current_backed_map_cache_strategy$.bind(nl_trie.$nl_trie_cache_strategy$.getGlobalValue(), thread);
                final SubLObject stack = stacks.create_stack();
                final SubLObject iterator = map_utilities.new_map_iterator(get_nl_trie());
                SubLObject valid;
                for (SubLObject done_var = (SubLObject)nl_trie.NIL; nl_trie.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL == valid)) {
                    thread.resetMultipleValues();
                    final SubLObject var = iteration.iteration_next(iterator);
                    valid = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (nl_trie.NIL != valid) {
                        SubLObject current;
                        final SubLObject datum = current = var;
                        SubLObject dict_key = (SubLObject)nl_trie.NIL;
                        SubLObject dict_value = (SubLObject)nl_trie.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list256);
                        dict_key = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list256);
                        dict_value = current.first();
                        current = current.rest();
                        if (nl_trie.NIL == current) {
                            if (nl_trie.NIL != map_utilities.map_p(dict_value)) {
                                stacks.stack_push(dict_value, stack);
                            }
                            else if (dict_value.isCons()) {
                                final SubLObject key = dict_value.first();
                                final SubLObject entries2 = dict_value.rest();
                                count = Numbers.add(count, Sequences.length(entries2));
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_trie.$list256);
                        }
                    }
                }
                while (nl_trie.NIL == stacks.stack_empty_p(stack)) {
                    final SubLObject entry = stacks.stack_pop(stack);
                    final SubLObject iterator2 = map_utilities.new_map_iterator(entry);
                    SubLObject valid2;
                    for (SubLObject done_var2 = (SubLObject)nl_trie.NIL; nl_trie.NIL == done_var2; done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL == valid2)) {
                        thread.resetMultipleValues();
                        final SubLObject var2 = iteration.iteration_next(iterator2);
                        valid2 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (nl_trie.NIL != valid2) {
                            SubLObject current2;
                            final SubLObject datum2 = current2 = var2;
                            SubLObject dict_key2 = (SubLObject)nl_trie.NIL;
                            SubLObject dict_value2 = (SubLObject)nl_trie.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)nl_trie.$list256);
                            dict_key2 = current2.first();
                            current2 = current2.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)nl_trie.$list256);
                            dict_value2 = current2.first();
                            current2 = current2.rest();
                            if (nl_trie.NIL == current2) {
                                if (nl_trie.NIL != map_utilities.map_p(dict_value2)) {
                                    stacks.stack_push(dict_value2, stack);
                                }
                                else if (dict_value2.isCons()) {
                                    final SubLObject key2 = dict_value2.first();
                                    final SubLObject entries3 = dict_value2.rest();
                                    count = Numbers.add(count, Sequences.length(entries3));
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(datum2, (SubLObject)nl_trie.$list256);
                            }
                        }
                    }
                }
            }
            finally {
                file_vector_utilities.$current_backed_map_cache_strategy$.rebind(_prev_bind_2, thread);
                file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            if (nl_trie.NIL != release) {
                Locks.release_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
            }
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 71444L)
    public static SubLObject copy_nl_trie(final SubLObject from_trie, final SubLObject to_trie) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (nl_trie.NIL == nl_trie_presentP(from_trie)) {
            nl_trie_not_present_message(from_trie);
            return (SubLObject)nl_trie.$kw246$ABORTED;
        }
        if (nl_trie.NIL == nl_trie_presentP(to_trie)) {
            nl_trie_not_present_message(to_trie);
            return (SubLObject)nl_trie.$kw246$ABORTED;
        }
        clear_nl_trie(to_trie);
        if (from_trie.eql(nl_trie.$nl_trie$.getGlobalValue())) {
            SubLObject release = (SubLObject)nl_trie.NIL;
            try {
                release = Locks.seize_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
                final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
                final SubLObject _prev_bind_2 = file_vector_utilities.$current_backed_map_cache_strategy$.currentBinding(thread);
                try {
                    file_vector_utilities.$file_vector_backed_map_read_lock$.bind(nl_trie.$nl_trie_lock$.getGlobalValue(), thread);
                    file_vector_utilities.$current_backed_map_cache_strategy$.bind(nl_trie.$nl_trie_cache_strategy$.getGlobalValue(), thread);
                    final SubLObject stack = stacks.create_stack();
                    final SubLObject iterator = map_utilities.new_map_iterator(from_trie);
                    SubLObject valid;
                    for (SubLObject done_var = (SubLObject)nl_trie.NIL; nl_trie.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL == valid)) {
                        thread.resetMultipleValues();
                        final SubLObject var = iteration.iteration_next(iterator);
                        valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (nl_trie.NIL != valid) {
                            SubLObject current;
                            final SubLObject datum = current = var;
                            SubLObject dict_key = (SubLObject)nl_trie.NIL;
                            SubLObject dict_value = (SubLObject)nl_trie.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list256);
                            dict_key = current.first();
                            current = current.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list256);
                            dict_value = current.first();
                            current = current.rest();
                            if (nl_trie.NIL == current) {
                                if (nl_trie.NIL != map_utilities.map_p(dict_value)) {
                                    stacks.stack_push(dict_value, stack);
                                }
                                else if (dict_value.isCons()) {
                                    final SubLObject key = dict_value.first();
                                    SubLObject cdolist_list_var;
                                    final SubLObject values = cdolist_list_var = dict_value.rest();
                                    SubLObject value = (SubLObject)nl_trie.NIL;
                                    value = cdolist_list_var.first();
                                    while (nl_trie.NIL != cdolist_list_var) {
                                        nl_trie_insert_low(to_trie, key, value);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        value = cdolist_list_var.first();
                                    }
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_trie.$list256);
                            }
                        }
                    }
                    while (nl_trie.NIL == stacks.stack_empty_p(stack)) {
                        final SubLObject entry = stacks.stack_pop(stack);
                        final SubLObject iterator2 = map_utilities.new_map_iterator(entry);
                        SubLObject valid2;
                        for (SubLObject done_var2 = (SubLObject)nl_trie.NIL; nl_trie.NIL == done_var2; done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL == valid2)) {
                            thread.resetMultipleValues();
                            final SubLObject var2 = iteration.iteration_next(iterator2);
                            valid2 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (nl_trie.NIL != valid2) {
                                SubLObject current2;
                                final SubLObject datum2 = current2 = var2;
                                SubLObject dict_key2 = (SubLObject)nl_trie.NIL;
                                SubLObject dict_value2 = (SubLObject)nl_trie.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)nl_trie.$list256);
                                dict_key2 = current2.first();
                                current2 = current2.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)nl_trie.$list256);
                                dict_value2 = current2.first();
                                current2 = current2.rest();
                                if (nl_trie.NIL == current2) {
                                    if (nl_trie.NIL != map_utilities.map_p(dict_value2)) {
                                        stacks.stack_push(dict_value2, stack);
                                    }
                                    else if (dict_value2.isCons()) {
                                        final SubLObject key2 = dict_value2.first();
                                        SubLObject cdolist_list_var2;
                                        final SubLObject values2 = cdolist_list_var2 = dict_value2.rest();
                                        SubLObject value2 = (SubLObject)nl_trie.NIL;
                                        value2 = cdolist_list_var2.first();
                                        while (nl_trie.NIL != cdolist_list_var2) {
                                            nl_trie_insert_low(to_trie, key2, value2);
                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                            value2 = cdolist_list_var2.first();
                                        }
                                    }
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(datum2, (SubLObject)nl_trie.$list256);
                                }
                            }
                        }
                    }
                }
                finally {
                    file_vector_utilities.$current_backed_map_cache_strategy$.rebind(_prev_bind_2, thread);
                    file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
                }
            }
            finally {
                if (nl_trie.NIL != release) {
                    Locks.release_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
                }
            }
        }
        else {
            final SubLObject stack2 = stacks.create_stack();
            final SubLObject iterator3 = map_utilities.new_map_iterator(from_trie);
            SubLObject valid3;
            for (SubLObject done_var3 = (SubLObject)nl_trie.NIL; nl_trie.NIL == done_var3; done_var3 = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL == valid3)) {
                thread.resetMultipleValues();
                final SubLObject var3 = iteration.iteration_next(iterator3);
                valid3 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (nl_trie.NIL != valid3) {
                    SubLObject current3;
                    final SubLObject datum3 = current3 = var3;
                    SubLObject dict_key3 = (SubLObject)nl_trie.NIL;
                    SubLObject dict_value3 = (SubLObject)nl_trie.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current3, datum3, (SubLObject)nl_trie.$list256);
                    dict_key3 = current3.first();
                    current3 = current3.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current3, datum3, (SubLObject)nl_trie.$list256);
                    dict_value3 = current3.first();
                    current3 = current3.rest();
                    if (nl_trie.NIL == current3) {
                        if (nl_trie.NIL != map_utilities.map_p(dict_value3)) {
                            stacks.stack_push(dict_value3, stack2);
                        }
                        else if (dict_value3.isCons()) {
                            final SubLObject key3 = dict_value3.first();
                            SubLObject cdolist_list_var3;
                            final SubLObject values3 = cdolist_list_var3 = dict_value3.rest();
                            SubLObject value3 = (SubLObject)nl_trie.NIL;
                            value3 = cdolist_list_var3.first();
                            while (nl_trie.NIL != cdolist_list_var3) {
                                nl_trie_insert_low(to_trie, key3, value3);
                                cdolist_list_var3 = cdolist_list_var3.rest();
                                value3 = cdolist_list_var3.first();
                            }
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum3, (SubLObject)nl_trie.$list256);
                    }
                }
            }
            while (nl_trie.NIL == stacks.stack_empty_p(stack2)) {
                final SubLObject entry2 = stacks.stack_pop(stack2);
                final SubLObject iterator4 = map_utilities.new_map_iterator(entry2);
                SubLObject valid4;
                for (SubLObject done_var4 = (SubLObject)nl_trie.NIL; nl_trie.NIL == done_var4; done_var4 = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL == valid4)) {
                    thread.resetMultipleValues();
                    final SubLObject var4 = iteration.iteration_next(iterator4);
                    valid4 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (nl_trie.NIL != valid4) {
                        SubLObject current4;
                        final SubLObject datum4 = current4 = var4;
                        SubLObject dict_key4 = (SubLObject)nl_trie.NIL;
                        SubLObject dict_value4 = (SubLObject)nl_trie.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current4, datum4, (SubLObject)nl_trie.$list256);
                        dict_key4 = current4.first();
                        current4 = current4.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current4, datum4, (SubLObject)nl_trie.$list256);
                        dict_value4 = current4.first();
                        current4 = current4.rest();
                        if (nl_trie.NIL == current4) {
                            if (nl_trie.NIL != map_utilities.map_p(dict_value4)) {
                                stacks.stack_push(dict_value4, stack2);
                            }
                            else if (dict_value4.isCons()) {
                                final SubLObject key4 = dict_value4.first();
                                SubLObject cdolist_list_var4;
                                final SubLObject values4 = cdolist_list_var4 = dict_value4.rest();
                                SubLObject value4 = (SubLObject)nl_trie.NIL;
                                value4 = cdolist_list_var4.first();
                                while (nl_trie.NIL != cdolist_list_var4) {
                                    nl_trie_insert_low(to_trie, key4, value4);
                                    cdolist_list_var4 = cdolist_list_var4.rest();
                                    value4 = cdolist_list_var4.first();
                                }
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum4, (SubLObject)nl_trie.$list256);
                        }
                    }
                }
            }
        }
        return (SubLObject)nl_trie.$kw257$COPIED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 72411L)
    public static SubLObject clear_nl_trie(SubLObject v_nl_trie) {
        if (v_nl_trie == nl_trie.UNPROVIDED) {
            v_nl_trie = nl_trie.$nl_trie$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (nl_trie.NIL == nl_trie_presentP(v_nl_trie)) {
            nl_trie_not_present_message(v_nl_trie);
            return (SubLObject)nl_trie.$kw246$ABORTED;
        }
        if (nl_trie.$nl_trie$.getGlobalValue().eql(v_nl_trie)) {
            SubLObject release = (SubLObject)nl_trie.NIL;
            try {
                release = Locks.seize_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
                final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
                try {
                    file_vector_utilities.$file_vector_backed_map_read_lock$.bind(nl_trie.$nl_trie_lock$.getGlobalValue(), thread);
                    PrintLow.format((SubLObject)nl_trie.T, (SubLObject)nl_trie.$str258$__Clearing_the_present_contents_o, v_nl_trie);
                    nl_trie_staleness_test.nl_trie_clear_revisions();
                    cache_utilities.cache_strategy_reset(nl_trie.$nl_trie_cache_strategy$.getGlobalValue());
                    strie.strie_clear(v_nl_trie);
                }
                finally {
                    file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
                }
            }
            finally {
                if (nl_trie.NIL != release) {
                    Locks.release_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
                }
            }
        }
        else {
            strie.strie_clear(v_nl_trie);
        }
        return (SubLObject)nl_trie.$kw259$CLEARED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 73108L)
    public static SubLObject swap_out_all_pristine_nl_trie_entries(SubLObject v_nl_trie, SubLObject cache_strategy) {
        if (v_nl_trie == nl_trie.UNPROVIDED) {
            v_nl_trie = nl_trie.$nl_trie$.getGlobalValue();
        }
        if (cache_strategy == nl_trie.UNPROVIDED) {
            cache_strategy = nl_trie.$nl_trie_cache_strategy$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject paged_out_count = (SubLObject)nl_trie.NIL;
        SubLObject release = (SubLObject)nl_trie.NIL;
        try {
            release = Locks.seize_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
            final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
            try {
                file_vector_utilities.$file_vector_backed_map_read_lock$.bind(nl_trie.$nl_trie_lock$.getGlobalValue(), thread);
                thread.resetMultipleValues();
                final SubLObject the_trie = file_vector_utilities.swap_out_all_pristine_backed_map_objects(v_nl_trie);
                final SubLObject paged_out = thread.secondMultipleValue();
                thread.resetMultipleValues();
                paged_out_count = paged_out;
                cache_utilities.cache_strategy_reset(cache_strategy);
            }
            finally {
                file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            if (nl_trie.NIL != release) {
                Locks.release_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
            }
        }
        return paged_out_count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 73861L)
    public static SubLObject initialize_nl_trie(SubLObject v_nl_trie, SubLObject init_nl_trie_syntactic_predsP, SubLObject init_nl_trie_denot_predsP, SubLObject init_nl_trie_other_predsP, SubLObject init_nl_trie_pragmatic_predsP) {
        if (v_nl_trie == nl_trie.UNPROVIDED) {
            v_nl_trie = nl_trie.$nl_trie$.getGlobalValue();
        }
        if (init_nl_trie_syntactic_predsP == nl_trie.UNPROVIDED) {
            init_nl_trie_syntactic_predsP = (SubLObject)nl_trie.T;
        }
        if (init_nl_trie_denot_predsP == nl_trie.UNPROVIDED) {
            init_nl_trie_denot_predsP = (SubLObject)nl_trie.T;
        }
        if (init_nl_trie_other_predsP == nl_trie.UNPROVIDED) {
            init_nl_trie_other_predsP = (SubLObject)nl_trie.T;
        }
        if (init_nl_trie_pragmatic_predsP == nl_trie.UNPROVIDED) {
            init_nl_trie_pragmatic_predsP = (SubLObject)nl_trie.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (nl_trie.NIL != nl_trie_presentP(v_nl_trie)) {
            clear_nl_trie(v_nl_trie);
            final SubLObject _prev_bind_0 = lexicon_vars.$parse_morphologically$.currentBinding(thread);
            final SubLObject _prev_bind_2 = nl_trie.$nl_tries_being_initialized$.currentBinding(thread);
            try {
                lexicon_vars.$parse_morphologically$.bind((SubLObject)nl_trie.$kw260$NEVER, thread);
                nl_trie.$nl_tries_being_initialized$.bind((SubLObject)ConsesLow.cons(v_nl_trie, nl_trie.$nl_tries_being_initialized$.getDynamicValue(thread)), thread);
                SubLObject release = (SubLObject)nl_trie.NIL;
                try {
                    release = Locks.seize_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
                    final SubLObject _prev_bind_0_$37 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
                    try {
                        file_vector_utilities.$file_vector_backed_map_read_lock$.bind(nl_trie.$nl_trie_lock$.getGlobalValue(), thread);
                        if (v_nl_trie.eql(get_nl_trie())) {
                            nl_trie_completion.prepare_nl_trie_completion_index();
                        }
                        clear_nl_trie_caches();
                        if (nl_trie.NIL != init_nl_trie_syntactic_predsP) {
                            initialize_nl_trie_syntactic_predicates();
                        }
                        if (nl_trie.NIL != init_nl_trie_denot_predsP) {
                            initialize_nl_trie_denotation_predicates();
                        }
                        if (nl_trie.NIL != init_nl_trie_other_predsP) {
                            initialize_nl_trie_other_predicates();
                        }
                        if (nl_trie.NIL != init_nl_trie_pragmatic_predsP) {
                            initialize_nl_trie_pragmatic_predicates();
                        }
                        final SubLObject local_state;
                        final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
                        final SubLObject _prev_bind_0_$38 = memoization_state.$memoization_state$.currentBinding(thread);
                        try {
                            memoization_state.$memoization_state$.bind(local_state, thread);
                            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                            try {
                                final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                                final SubLObject _prev_bind_0_$39 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$40 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, (SubLObject)nl_trie.SIX_INTEGER), thread);
                                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)nl_trie.T, thread);
                                    initialize_nl_trie_int(v_nl_trie);
                                }
                                finally {
                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$40, thread);
                                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$39, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$40 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nl_trie.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$40, thread);
                                }
                            }
                        }
                        finally {
                            memoization_state.$memoization_state$.rebind(_prev_bind_0_$38, thread);
                        }
                        clear_nl_trie_caches();
                        nl_trie_staleness_test.nl_trie_note_revisions();
                        nl_trie_staleness_test.declare_nl_trie_not_known_stale();
                    }
                    finally {
                        file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0_$37, thread);
                    }
                }
                finally {
                    if (nl_trie.NIL != release) {
                        Locks.release_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
                    }
                }
            }
            finally {
                nl_trie.$nl_tries_being_initialized$.rebind(_prev_bind_2, thread);
                lexicon_vars.$parse_morphologically$.rebind(_prev_bind_0, thread);
            }
            return (SubLObject)nl_trie.$kw261$INITIALIZED;
        }
        nl_trie_not_present_message(v_nl_trie);
        return (SubLObject)nl_trie.$kw246$ABORTED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 77153L)
    public static SubLObject nl_trie_entries_for_string(final SubLObject v_cycl_string, SubLObject case_sensitivity) {
        if (case_sensitivity == nl_trie.UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject string = cycl_string.cycl_string_to_utf8_string(v_cycl_string);
        SubLObject ans = (SubLObject)nl_trie.NIL;
        final SubLObject _prev_bind_0 = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.currentBinding(thread);
        try {
            lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.bind(case_sensitivity, thread);
            final SubLObject search_result = ans = nl_trie_search(string, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
            if (ans.isList()) {
                ans = ConsesLow.append(ans, morphological_word_parser.derived_nl_trie_words(string));
            }
        }
        finally {
            lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 77991L)
    public static SubLObject nl_trie_search(final SubLObject v_cycl_string, SubLObject v_nl_trie, SubLObject case_sensitivity) {
        if (v_nl_trie == nl_trie.UNPROVIDED) {
            v_nl_trie = nl_trie.$nl_trie$.getGlobalValue();
        }
        if (case_sensitivity == nl_trie.UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLObject string = cycl_string.cycl_string_to_utf8_string(v_cycl_string);
        if (case_sensitivity.eql((SubLObject)nl_trie.$kw23$OFF)) {
            return nl_trie_search_case_insensitive(string, v_nl_trie);
        }
        if (case_sensitivity.eql((SubLObject)nl_trie.$kw262$ON)) {
            return nl_trie_search_case_sensitive(string, v_nl_trie);
        }
        if (case_sensitivity.eql((SubLObject)nl_trie.$kw263$PREFERRED)) {
            return nl_trie_search_case_sensitive_preferred(string, v_nl_trie);
        }
        nl_trie_error((SubLObject)nl_trie.$str264$Didn_t_recognize_NL_Trie_case_sen, case_sensitivity, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 78602L)
    public static SubLObject nl_trie_case_sensitive_p(SubLObject v_nl_trie) {
        if (v_nl_trie == nl_trie.UNPROVIDED) {
            v_nl_trie = get_nl_trie();
        }
        return Equality.eql(Symbols.symbol_function((SubLObject)nl_trie.EQUAL), strie.strie_test(v_nl_trie));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 78785L)
    public static SubLObject nl_trie_search_case_sensitive_internal(final SubLObject string, final SubLObject v_nl_trie) {
        return nl_trie_search_int(string, v_nl_trie, (SubLObject)nl_trie.$kw262$ON);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 78785L)
    public static SubLObject nl_trie_search_case_sensitive(final SubLObject string, final SubLObject v_nl_trie) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)nl_trie.NIL;
        if (nl_trie.NIL == v_memoization_state) {
            return nl_trie_search_case_sensitive_internal(string, v_nl_trie);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)nl_trie.$sym265$NL_TRIE_SEARCH_CASE_SENSITIVE, (SubLObject)nl_trie.UNPROVIDED);
        if (nl_trie.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)nl_trie.$sym265$NL_TRIE_SEARCH_CASE_SENSITIVE, (SubLObject)nl_trie.TWO_INTEGER, (SubLObject)nl_trie.$int266$48, (SubLObject)nl_trie.EQUAL, (SubLObject)nl_trie.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)nl_trie.$sym265$NL_TRIE_SEARCH_CASE_SENSITIVE, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(string, v_nl_trie);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)nl_trie.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)nl_trie.NIL;
            collision = cdolist_list_var.first();
            while (nl_trie.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (string.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (nl_trie.NIL != cached_args && nl_trie.NIL == cached_args.rest() && v_nl_trie.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(nl_trie_search_case_sensitive_internal(string, v_nl_trie)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(string, v_nl_trie));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 78991L)
    public static SubLObject nl_trie_search_case_insensitive_internal(final SubLObject string, final SubLObject v_nl_trie) {
        return nl_trie_search_int(string, v_nl_trie, (SubLObject)nl_trie.$kw23$OFF);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 78991L)
    public static SubLObject nl_trie_search_case_insensitive(final SubLObject string, final SubLObject v_nl_trie) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)nl_trie.NIL;
        if (nl_trie.NIL == v_memoization_state) {
            return nl_trie_search_case_insensitive_internal(string, v_nl_trie);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)nl_trie.$sym267$NL_TRIE_SEARCH_CASE_INSENSITIVE, (SubLObject)nl_trie.UNPROVIDED);
        if (nl_trie.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)nl_trie.$sym267$NL_TRIE_SEARCH_CASE_INSENSITIVE, (SubLObject)nl_trie.TWO_INTEGER, (SubLObject)nl_trie.$int266$48, (SubLObject)nl_trie.EQUALP, (SubLObject)nl_trie.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)nl_trie.$sym267$NL_TRIE_SEARCH_CASE_INSENSITIVE, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(string, v_nl_trie);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)nl_trie.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)nl_trie.NIL;
            collision = cdolist_list_var.first();
            while (nl_trie.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (string.equalp(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (nl_trie.NIL != cached_args && nl_trie.NIL == cached_args.rest() && v_nl_trie.equalp(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(nl_trie_search_case_insensitive_internal(string, v_nl_trie)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(string, v_nl_trie));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 79208L)
    public static SubLObject nl_trie_search_case_sensitive_preferred_internal(final SubLObject string, final SubLObject v_nl_trie) {
        return nl_trie_search_int(string, v_nl_trie, (SubLObject)nl_trie.$kw263$PREFERRED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 79208L)
    public static SubLObject nl_trie_search_case_sensitive_preferred(final SubLObject string, final SubLObject v_nl_trie) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)nl_trie.NIL;
        if (nl_trie.NIL == v_memoization_state) {
            return nl_trie_search_case_sensitive_preferred_internal(string, v_nl_trie);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)nl_trie.$sym268$NL_TRIE_SEARCH_CASE_SENSITIVE_PREFERRED, (SubLObject)nl_trie.UNPROVIDED);
        if (nl_trie.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)nl_trie.$sym268$NL_TRIE_SEARCH_CASE_SENSITIVE_PREFERRED, (SubLObject)nl_trie.TWO_INTEGER, (SubLObject)nl_trie.$int266$48, (SubLObject)nl_trie.EQUALP, (SubLObject)nl_trie.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)nl_trie.$sym268$NL_TRIE_SEARCH_CASE_SENSITIVE_PREFERRED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(string, v_nl_trie);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)nl_trie.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)nl_trie.NIL;
            collision = cdolist_list_var.first();
            while (nl_trie.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (string.equalp(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (nl_trie.NIL != cached_args && nl_trie.NIL == cached_args.rest() && v_nl_trie.equalp(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(nl_trie_search_case_sensitive_preferred_internal(string, v_nl_trie)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(string, v_nl_trie));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 79370L)
    public static SubLObject nl_trie_search_int(final SubLObject string, SubLObject v_nl_trie, SubLObject case_sensitivity) {
        if (v_nl_trie == nl_trie.UNPROVIDED) {
            v_nl_trie = nl_trie.$nl_trie$.getGlobalValue();
        }
        if (case_sensitivity == nl_trie.UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)nl_trie.NIL;
        SubLObject release = (SubLObject)nl_trie.NIL;
        try {
            release = Locks.seize_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
            final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
            try {
                file_vector_utilities.$file_vector_backed_map_read_lock$.bind(nl_trie.$nl_trie_lock$.getGlobalValue(), thread);
                if (nl_trie.NIL == nl_trie_presentP(v_nl_trie)) {
                    nl_trie_not_present_message(v_nl_trie);
                    ans = (SubLObject)nl_trie.$kw246$ABORTED;
                }
                else if (nl_trie.NIL != empty_nl_trieP(v_nl_trie)) {
                    nl_trie_warn((SubLObject)nl_trie.ONE_INTEGER, (SubLObject)nl_trie.$str269$NL_Trie_empty_, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
                    ans = (SubLObject)nl_trie.NIL;
                }
                else if (v_nl_trie.eql(nl_trie.$nl_trie$.getGlobalValue()) && nl_trie.NIL != nl_trie_staleness_test.nl_trie_unfinishedP() && nl_trie.NIL == nl_trie_being_initializedP(nl_trie.$nl_trie$.getGlobalValue())) {
                    nl_trie_warn((SubLObject)nl_trie.ONE_INTEGER, (SubLObject)nl_trie.$str270$NL_Trie_incompletely_built_, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
                    clear_nl_trie((SubLObject)nl_trie.UNPROVIDED);
                    ans = (SubLObject)nl_trie.$kw246$ABORTED;
                }
                else if (v_nl_trie.eql(nl_trie.$nl_trie$.getGlobalValue()) && nl_trie.NIL == nl_trie_staleness_test.nl_trie_staleness_acceptableP() && nl_trie.NIL != nl_trie_staleness_test.nl_trie_revisions_staleP()) {
                    nl_trie_warn((SubLObject)nl_trie.ONE_INTEGER, (SubLObject)nl_trie.$str271$NL_trie_built_with_stale_code__, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
                    clear_nl_trie(v_nl_trie);
                    ans = (SubLObject)nl_trie.$kw246$ABORTED;
                }
                else {
                    SubLObject cdolist_list_var = nl_trie_string_tokenize_multiple(string);
                    SubLObject key = (SubLObject)nl_trie.NIL;
                    key = cdolist_list_var.first();
                    while (nl_trie.NIL != cdolist_list_var) {
                        ans = conses_high.union(ans, (SubLObject)((nl_trie.NIL != key) ? nl_trie_remove_invalid_entries(nl_trie_lookup(v_nl_trie, key, case_sensitivity), v_nl_trie, key) : nl_trie.NIL), (SubLObject)nl_trie.EQUAL, (SubLObject)nl_trie.UNPROVIDED);
                        cdolist_list_var = cdolist_list_var.rest();
                        key = cdolist_list_var.first();
                    }
                }
            }
            finally {
                file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            if (nl_trie.NIL != release) {
                Locks.release_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 81042L)
    public static SubLObject augment_nl_trie_syntactic(final SubLObject assertion, SubLObject v_nl_trie) {
        if (v_nl_trie == nl_trie.UNPROVIDED) {
            v_nl_trie = nl_trie.$nl_trie$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (nl_trie.NIL == nl_trie_presentP(v_nl_trie)) {
            return (SubLObject)nl_trie.NIL;
        }
        if (nl_trie.NIL != lexicon_vars.$initialize_nl_trie_control_varsP$.getDynamicValue(thread)) {
            initialize_nl_trie_control_vars();
        }
        if (nl_trie.NIL != nl_trie_syntactic_assertionP(assertion)) {
            return update_nl_trie_syntactic(assertion, v_nl_trie, (SubLObject)nl_trie.NIL);
        }
        nl_trie_warn_bad_add(assertion);
        return (SubLObject)nl_trie.$kw272$NOT_ADDED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 81517L)
    public static SubLObject prune_nl_trie_syntactic(final SubLObject assertion, SubLObject v_nl_trie) {
        if (v_nl_trie == nl_trie.UNPROVIDED) {
            v_nl_trie = nl_trie.$nl_trie$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (nl_trie.NIL == nl_trie_presentP(v_nl_trie)) {
            return (SubLObject)nl_trie.NIL;
        }
        if (nl_trie.NIL != lexicon_vars.$initialize_nl_trie_control_varsP$.getDynamicValue(thread)) {
            initialize_nl_trie_control_vars();
        }
        if (nl_trie.NIL != nl_trie_syntactic_assertionP(assertion)) {
            return update_nl_trie_syntactic(assertion, v_nl_trie, (SubLObject)nl_trie.T);
        }
        nl_trie_warn_bad_remove(assertion);
        return (SubLObject)nl_trie.$kw273$NOT_REMOVED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 82000L)
    public static SubLObject augment_nl_trie_semantic(final SubLObject assertion, SubLObject v_nl_trie) {
        if (v_nl_trie == nl_trie.UNPROVIDED) {
            v_nl_trie = nl_trie.$nl_trie$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (nl_trie.NIL == nl_trie_presentP(v_nl_trie)) {
            return (SubLObject)nl_trie.NIL;
        }
        if (nl_trie.NIL != lexicon_vars.$initialize_nl_trie_control_varsP$.getDynamicValue(thread)) {
            initialize_nl_trie_control_vars();
        }
        if (nl_trie.NIL != nl_trie_semantic_assertionP(assertion)) {
            return update_nl_trie_semantic(assertion, v_nl_trie, (SubLObject)nl_trie.NIL, (SubLObject)nl_trie.UNPROVIDED);
        }
        nl_trie_warn_bad_add(assertion);
        return Values.values((SubLObject)nl_trie.$kw272$NOT_ADDED, (SubLObject)nl_trie.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 82483L)
    public static SubLObject prune_nl_trie_semantic(final SubLObject assertion, SubLObject v_nl_trie) {
        if (v_nl_trie == nl_trie.UNPROVIDED) {
            v_nl_trie = nl_trie.$nl_trie$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (nl_trie.NIL == nl_trie_presentP(v_nl_trie)) {
            return (SubLObject)nl_trie.NIL;
        }
        if (nl_trie.NIL != lexicon_vars.$initialize_nl_trie_control_varsP$.getDynamicValue(thread)) {
            initialize_nl_trie_control_vars();
        }
        if (nl_trie.NIL != nl_trie_semantic_assertionP(assertion)) {
            return update_nl_trie_semantic(assertion, v_nl_trie, (SubLObject)nl_trie.T, (SubLObject)nl_trie.UNPROVIDED);
        }
        nl_trie_warn_bad_remove(assertion);
        return Values.values((SubLObject)nl_trie.$kw273$NOT_REMOVED, (SubLObject)nl_trie.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 82974L)
    public static SubLObject retriefy_semantic_assertion(final SubLObject assertion, SubLObject v_nl_trie) {
        if (v_nl_trie == nl_trie.UNPROVIDED) {
            v_nl_trie = nl_trie.$nl_trie$.getGlobalValue();
        }
        if (nl_trie.NIL != nl_trie_semantic_assertionP(assertion)) {
            prune_nl_trie_semantic(assertion, v_nl_trie);
            augment_nl_trie_semantic(assertion, v_nl_trie);
            return (SubLObject)nl_trie.$kw274$RETRIEFIED;
        }
        return (SubLObject)nl_trie.$kw275$NOT_RETRIEFIED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 83395L)
    public static SubLObject nl_trie_carefully_load_global(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject stream = (SubLObject)nl_trie.NIL;
        SubLObject global = (SubLObject)nl_trie.NIL;
        SubLObject type = (SubLObject)nl_trie.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list276);
        stream = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list276);
        global = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list276);
        type = current.first();
        current = current.rest();
        if (nl_trie.NIL == current) {
            final SubLObject top = (SubLObject)nl_trie.$sym277$TOP;
            return (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym29$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(top, (SubLObject)ConsesLow.listS((SubLObject)nl_trie.$sym278$CFASL_INPUT, stream, (SubLObject)nl_trie.$list279))), (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym200$PIF, (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym37$CAND, (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym39$CNOT, (SubLObject)ConsesLow.listS((SubLObject)nl_trie.EQ, top, (SubLObject)nl_trie.$list280)), (SubLObject)ConsesLow.list(type, top)), (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym281$CSETQ, global, top), (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym282$WARN, (SubLObject)nl_trie.$str283$___S_is_not_the_right_type_of_obj, top, (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym284$QUOTE, global), (SubLObject)ConsesLow.list((SubLObject)nl_trie.$sym284$QUOTE, type))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_trie.$list276);
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 84075L)
    public static SubLObject load_nl_trie_from_lexicon_cache(final SubLObject stream) {
        final SubLObject top = cfasl.cfasl_input(stream, (SubLObject)nl_trie.NIL, (SubLObject)nl_trie.$kw285$EOF);
        if (top != nl_trie.$kw285$EOF && nl_trie.NIL != map_utilities.map_p(top)) {
            nl_trie.$nl_trie$.setGlobalValue(top);
        }
        else {
            Errors.warn((SubLObject)nl_trie.$str283$___S_is_not_the_right_type_of_obj, top, (SubLObject)nl_trie.$sym245$_NL_TRIE_, (SubLObject)nl_trie.$sym286$MAP_P);
        }
        return stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 84208L)
    public static SubLObject dump_nl_trie_to_lexicon_cache(final SubLObject stream) {
        cfasl.cfasl_output(nl_trie.$nl_trie$.getGlobalValue(), stream);
        return stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 84316L)
    public static SubLObject load_nl_trie_completion_index(final SubLObject stream) {
        final SubLObject top = cfasl.cfasl_input(stream, (SubLObject)nl_trie.NIL, (SubLObject)nl_trie.$kw285$EOF);
        if (top != nl_trie.$kw285$EOF && nl_trie.NIL != map_utilities.map_p(top)) {
            nl_trie_completion.$nl_trie_completion_index$.setGlobalValue(top);
        }
        else {
            Errors.warn((SubLObject)nl_trie.$str283$___S_is_not_the_right_type_of_obj, top, (SubLObject)nl_trie.$sym287$_NL_TRIE_COMPLETION_INDEX_, (SubLObject)nl_trie.$sym286$MAP_P);
        }
        return stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 84464L)
    public static SubLObject dump_nl_trie_completion_index(final SubLObject stream) {
        cfasl.cfasl_output(nl_trie_completion.$nl_trie_completion_index$.getGlobalValue(), stream);
        return stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 84589L)
    public static SubLObject reconnect_nl_trie_backing(final SubLObject directory, final SubLObject common_symbols) {
        final SubLObject data_file = lexicon_cache.get_nl_trie_contents_data_file(directory);
        final SubLObject index_file = lexicon_cache.get_nl_trie_contents_index_file(directory);
        return reconnect_nl_trie_to_file_vector_files(data_file, index_file, common_symbols);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 85017L)
    public static SubLObject reconnect_nl_trie_to_file_vector_files(final SubLObject data_file, final SubLObject index_file, SubLObject common_symbols) {
        if (common_symbols == nl_trie.UNPROVIDED) {
            common_symbols = cfasl.cfasl_current_common_symbols();
        }
        final SubLObject valid_files = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL != file_utilities.file_existsP(data_file) && nl_trie.NIL != file_utilities.file_existsP(index_file));
        if (nl_trie.NIL != file_vector_utilities.backed_map_p(nl_trie.$nl_trie$.getGlobalValue())) {
            if (nl_trie.NIL == valid_files) {
                Errors.error((SubLObject)nl_trie.$str288$Mismatch_between_world_and_HL_cac, data_file, index_file);
            }
            final SubLObject fvector = file_vector.new_file_vector(data_file, index_file, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
            file_vector_utilities.reconnect_backed_map(nl_trie.$nl_trie$.getGlobalValue(), fvector, common_symbols);
            return file_vector_utilities.backed_map_p(nl_trie.$nl_trie$.getGlobalValue());
        }
        if (nl_trie.NIL != valid_files) {
            nl_trie.$nl_trie$.setGlobalValue(file_vector_utilities.new_backed_map_from_files(nl_trie.$nl_trie$.getGlobalValue(), data_file, index_file, common_symbols));
            return file_vector_utilities.backed_map_p(nl_trie.$nl_trie$.getGlobalValue());
        }
        if (nl_trie.NIL != kb_control_vars.nl_kb_loaded_p()) {
            Errors.warn((SubLObject)nl_trie.$str289$Reconnecting_to_legacy_unit_files, data_file, index_file);
            return (SubLObject)nl_trie.NIL;
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 86344L)
    public static SubLObject dump_swappable_nl_trie_to_lexicon_cache(final SubLObject lexicon_cache_stream, final SubLObject fvector) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_context = dump_swappable_nl_trie_new_context(fvector);
        final SubLObject visitor = new_swappable_nl_trie_dump_visitor(v_context);
        SubLObject future_nl_trie = (SubLObject)nl_trie.NIL;
        SubLObject release = (SubLObject)nl_trie.NIL;
        try {
            release = Locks.seize_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
            final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
            final SubLObject _prev_bind_2 = file_vector_utilities.$current_backed_map_cache_strategy$.currentBinding(thread);
            try {
                file_vector_utilities.$file_vector_backed_map_read_lock$.bind(nl_trie.$nl_trie_lock$.getGlobalValue(), thread);
                file_vector_utilities.$current_backed_map_cache_strategy$.bind(nl_trie.$nl_trie_cache_strategy$.getGlobalValue(), thread);
                strie.visit_strie_hierarchically(nl_trie.$nl_trie$.getGlobalValue(), visitor);
            }
            finally {
                file_vector_utilities.$current_backed_map_cache_strategy$.rebind(_prev_bind_2, thread);
                file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            if (nl_trie.NIL != release) {
                Locks.release_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
            }
        }
        future_nl_trie = dump_swappable_nl_trie_get_final_result(v_context);
        cfasl.cfasl_output(future_nl_trie, lexicon_cache_stream);
        return lexicon_cache_stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 87193L)
    public static SubLObject new_swappable_nl_trie_dump_visitor(final SubLObject v_context) {
        return hierarchical_visitor.new_hiearchical_visitor((SubLObject)nl_trie.$sym290$DUMP_SWAPPABLE_NL_TRIE_VISITOR_BEGIN_VISIT, (SubLObject)nl_trie.$sym291$DUMP_SWAPPABLE_NL_TRIE_VISITOR_BEGIN_PATH, (SubLObject)nl_trie.$sym292$DUMP_SWAPPABLE_NL_TRIE_VISITOR_ACCEPT_NODE, (SubLObject)nl_trie.$sym293$DUMP_SWAPPABLE_NL_TRIE_VISITOR_END_PATH, (SubLObject)nl_trie.$sym294$DUMP_SWAPPABLE_NL_TRIE_VISITOR_END_VISIT, v_context);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 87740L)
    public static SubLObject dump_swappable_nl_trie_visitor_begin_visit(final SubLObject visitor) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_context = hierarchical_visitor.get_hierarchical_visitor_parameter(visitor);
        if (nl_trie.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && nl_trie.NIL == dump_swappable_nl_trie_valid_initial_context(v_context)) {
            Errors.error((SubLObject)nl_trie.$str295$The_NL_trie_visitor_is_not_proper, v_context);
        }
        return visitor;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 88054L)
    public static SubLObject dump_swappable_nl_trie_visitor_end_visit(final SubLObject visitor) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_context = hierarchical_visitor.get_hierarchical_visitor_parameter(visitor);
        if (nl_trie.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && nl_trie.NIL == dump_swappable_nl_trie_valid_final_context(v_context)) {
            Errors.error((SubLObject)nl_trie.$str296$The_NL_trie_visitor_did_nto_compl, v_context);
        }
        return visitor;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 88367L)
    public static SubLObject dump_swappable_nl_trie_visitor_begin_path(final SubLObject visitor, final SubLObject path) {
        final SubLObject v_context = hierarchical_visitor.get_hierarchical_visitor_parameter(visitor);
        dump_swappable_nl_trie_push_new_current_map(v_context, path);
        return visitor;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 88705L)
    public static SubLObject dump_swappable_nl_trie_visitor_end_path(final SubLObject visitor, final SubLObject path) {
        final SubLObject v_context = hierarchical_visitor.get_hierarchical_visitor_parameter(visitor);
        SubLObject curr_map = dump_swappable_nl_trie_pop_current_map(v_context, path);
        final SubLObject fvector = dump_swappable_nl_trie_get_file_vector(v_context);
        final SubLObject modified_map = file_vector_utilities.convert_map_to_file_vector_backed_map(curr_map, fvector, (SubLObject)nl_trie.$kw297$SWAPPED_OUT, (SubLObject)nl_trie.$kw298$COMPACT);
        if (nl_trie.NIL == path) {
            dump_swappable_nl_trie_set_final_result(v_context, modified_map);
        }
        else {
            final SubLObject map_key = path.first();
            final SubLObject swappable_map = file_vector_utilities.new_future_backed_map(modified_map);
            curr_map = dump_swappable_nl_trie_get_current_map(v_context);
            map_utilities.map_put(curr_map, map_key, swappable_map);
        }
        return visitor;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 89743L)
    public static SubLObject dump_swappable_nl_trie_visitor_accept_node(final SubLObject visitor, final SubLObject node) {
        final SubLObject v_context = hierarchical_visitor.get_hierarchical_visitor_parameter(visitor);
        final SubLObject curr_map = dump_swappable_nl_trie_get_current_map(v_context);
        SubLObject map_key = (SubLObject)nl_trie.NIL;
        SubLObject payload = (SubLObject)nl_trie.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(node, node, (SubLObject)nl_trie.$list299);
        map_key = node.first();
        final SubLObject current = payload = node.rest();
        map_utilities.map_put(curr_map, map_key, payload);
        return visitor;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 90151L)
    public static SubLObject dump_swappable_nl_trie_new_context(final SubLObject fvector) {
        return list_utilities.make_plist((SubLObject)ConsesLow.list((SubLObject)nl_trie.$kw300$FILE_VECTOR, (SubLObject)nl_trie.$kw301$MAP_STACK), (SubLObject)ConsesLow.list(fvector, stacks.create_stack()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 90394L)
    public static SubLObject dump_swappable_nl_trie_valid_initial_context(final SubLObject v_context) {
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL != list_utilities.property_list_p(v_context) && nl_trie.NIL != file_vector.file_vector_p(conses_high.getf(v_context, (SubLObject)nl_trie.$kw300$FILE_VECTOR, (SubLObject)nl_trie.UNPROVIDED)) && nl_trie.NIL != stacks.stack_empty_p(conses_high.getf(v_context, (SubLObject)nl_trie.$kw301$MAP_STACK, (SubLObject)nl_trie.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 90705L)
    public static SubLObject dump_swappable_nl_trie_valid_final_context(final SubLObject v_context) {
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL != list_utilities.property_list_p(v_context) && nl_trie.NIL != file_vector.file_vector_p(conses_high.getf(v_context, (SubLObject)nl_trie.$kw300$FILE_VECTOR, (SubLObject)nl_trie.UNPROVIDED)) && nl_trie.ONE_INTEGER.numE(stacks.stack_size(conses_high.getf(v_context, (SubLObject)nl_trie.$kw301$MAP_STACK, (SubLObject)nl_trie.UNPROVIDED))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 91030L)
    public static SubLObject dump_swappable_nl_trie_get_current_map(final SubLObject v_context) {
        final SubLObject map_stack = conses_high.getf(v_context, (SubLObject)nl_trie.$kw301$MAP_STACK, (SubLObject)nl_trie.UNPROVIDED);
        return stacks.stack_peek(map_stack);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 91229L)
    public static SubLObject dump_swappable_nl_trie_get_file_vector(final SubLObject v_context) {
        return conses_high.getf(v_context, (SubLObject)nl_trie.$kw300$FILE_VECTOR, (SubLObject)nl_trie.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 91395L)
    public static SubLObject dump_swappable_nl_trie_pop_current_map(final SubLObject v_context, final SubLObject path) {
        final SubLObject map_stack = conses_high.getf(v_context, (SubLObject)nl_trie.$kw301$MAP_STACK, (SubLObject)nl_trie.UNPROVIDED);
        return stacks.stack_pop(map_stack);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 91663L)
    public static SubLObject dump_swappable_nl_trie_push_new_current_map(final SubLObject v_context, final SubLObject path) {
        final SubLObject map_stack = conses_high.getf(v_context, (SubLObject)nl_trie.$kw301$MAP_STACK, (SubLObject)nl_trie.UNPROVIDED);
        final SubLObject map = dictionary.new_dictionary(map_utilities.map_test(get_nl_trie()), (SubLObject)nl_trie.UNPROVIDED);
        stacks.stack_push(map, map_stack);
        return map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 92017L)
    public static SubLObject dump_swappable_nl_trie_get_final_result(final SubLObject v_context) {
        return dump_swappable_nl_trie_get_current_map(v_context);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 92212L)
    public static SubLObject dump_swappable_nl_trie_set_final_result(final SubLObject v_context, final SubLObject final_map) {
        final SubLObject map_stack = conses_high.getf(v_context, (SubLObject)nl_trie.$kw301$MAP_STACK, (SubLObject)nl_trie.UNPROVIDED);
        stacks.stack_push(final_map, map_stack);
        return final_map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 92445L)
    public static SubLObject nl_trie_lookup(final SubLObject v_nl_trie, final SubLObject key0, SubLObject case_sensitivity) {
        if (case_sensitivity == nl_trie.UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject key = unicode_nauts.convert_unicode_nauts_to_utf8_strings(key0);
        SubLObject raw_entries = (SubLObject)nl_trie.NIL;
        SubLObject release = (SubLObject)nl_trie.NIL;
        try {
            release = Locks.seize_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
            final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
            try {
                file_vector_utilities.$file_vector_backed_map_read_lock$.bind(nl_trie.$nl_trie_lock$.getGlobalValue(), thread);
                if (v_nl_trie.eql(get_nl_trie())) {
                    final SubLObject _prev_bind_0_$42 = file_vector_utilities.$current_backed_map_cache_strategy$.currentBinding(thread);
                    try {
                        file_vector_utilities.$current_backed_map_cache_strategy$.bind(nl_trie.$nl_trie_cache_strategy$.getGlobalValue(), thread);
                        raw_entries = strie.strie_lookup(v_nl_trie, key);
                    }
                    finally {
                        file_vector_utilities.$current_backed_map_cache_strategy$.rebind(_prev_bind_0_$42, thread);
                    }
                }
                else {
                    raw_entries = strie.strie_lookup(v_nl_trie, key);
                }
            }
            finally {
                file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            if (nl_trie.NIL != release) {
                Locks.release_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
            }
        }
        if (nl_trie.NIL != nl_trie_case_sensitive_p(v_nl_trie) || case_sensitivity.eql((SubLObject)nl_trie.$kw23$OFF)) {
            return raw_entries;
        }
        if (case_sensitivity.eql((SubLObject)nl_trie.$kw262$ON)) {
            return nl_trie_filter_entries_for_case(raw_entries, key);
        }
        if (case_sensitivity == nl_trie.$kw263$PREFERRED) {
            final SubLObject filtered = nl_trie_filter_entries_for_case(raw_entries, key);
            return (nl_trie.NIL != filtered) ? filtered : raw_entries;
        }
        nl_trie_error((SubLObject)nl_trie.$str302$Invalid_case_sensitivity_setting_, case_sensitivity, v_nl_trie, strie.strie_test(v_nl_trie), (SubLObject)nl_trie.UNPROVIDED);
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 93873L)
    public static SubLObject nl_trie_validate_all_entries() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject str = (SubLObject)nl_trie.$str303$Validating_all_NL_trie_entries;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
        try {
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
            utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
            utilities_macros.$progress_notification_count$.bind((SubLObject)nl_trie.ZERO_INTEGER, thread);
            utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)nl_trie.ZERO_INTEGER, thread);
            utilities_macros.$progress_count$.bind((SubLObject)nl_trie.ZERO_INTEGER, thread);
            utilities_macros.$is_noting_progressP$.bind((SubLObject)nl_trie.T, thread);
            utilities_macros.$silent_progressP$.bind((SubLObject)((nl_trie.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : nl_trie.T), thread);
            utilities_macros.noting_progress_preamble(str);
            SubLObject release = (SubLObject)nl_trie.NIL;
            try {
                release = Locks.seize_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
                final SubLObject _prev_bind_0_$43 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
                final SubLObject _prev_bind_1_$44 = file_vector_utilities.$current_backed_map_cache_strategy$.currentBinding(thread);
                try {
                    file_vector_utilities.$file_vector_backed_map_read_lock$.bind(nl_trie.$nl_trie_lock$.getGlobalValue(), thread);
                    file_vector_utilities.$current_backed_map_cache_strategy$.bind(nl_trie.$nl_trie_cache_strategy$.getGlobalValue(), thread);
                    final SubLObject stack = stacks.create_stack();
                    final SubLObject iterator = map_utilities.new_map_iterator(get_nl_trie());
                    SubLObject valid;
                    for (SubLObject done_var = (SubLObject)nl_trie.NIL; nl_trie.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL == valid)) {
                        thread.resetMultipleValues();
                        final SubLObject var = iteration.iteration_next(iterator);
                        valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (nl_trie.NIL != valid) {
                            SubLObject current;
                            final SubLObject datum = current = var;
                            SubLObject dict_key = (SubLObject)nl_trie.NIL;
                            SubLObject dict_value = (SubLObject)nl_trie.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list256);
                            dict_key = current.first();
                            current = current.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list256);
                            dict_value = current.first();
                            current = current.rest();
                            if (nl_trie.NIL == current) {
                                if (nl_trie.NIL != map_utilities.map_p(dict_value)) {
                                    stacks.stack_push(dict_value, stack);
                                }
                                else if (dict_value.isCons()) {
                                    final SubLObject key = dict_value.first();
                                    SubLObject cdolist_list_var;
                                    final SubLObject entries = cdolist_list_var = dict_value.rest();
                                    SubLObject entry = (SubLObject)nl_trie.NIL;
                                    entry = cdolist_list_var.first();
                                    while (nl_trie.NIL != cdolist_list_var) {
                                        final SubLObject validated = validate_nl_trie_entry(entry);
                                        if (nl_trie.NIL == validated) {
                                            nl_trie_delete_entry(nl_trie.$nl_trie$.getGlobalValue(), key, entry);
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        entry = cdolist_list_var.first();
                                    }
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_trie.$list256);
                            }
                        }
                    }
                    while (nl_trie.NIL == stacks.stack_empty_p(stack)) {
                        final SubLObject entry2 = stacks.stack_pop(stack);
                        final SubLObject iterator2 = map_utilities.new_map_iterator(entry2);
                        SubLObject valid2;
                        for (SubLObject done_var2 = (SubLObject)nl_trie.NIL; nl_trie.NIL == done_var2; done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL == valid2)) {
                            thread.resetMultipleValues();
                            final SubLObject var2 = iteration.iteration_next(iterator2);
                            valid2 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (nl_trie.NIL != valid2) {
                                SubLObject current2;
                                final SubLObject datum2 = current2 = var2;
                                SubLObject dict_key2 = (SubLObject)nl_trie.NIL;
                                SubLObject dict_value2 = (SubLObject)nl_trie.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)nl_trie.$list256);
                                dict_key2 = current2.first();
                                current2 = current2.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)nl_trie.$list256);
                                dict_value2 = current2.first();
                                current2 = current2.rest();
                                if (nl_trie.NIL == current2) {
                                    if (nl_trie.NIL != map_utilities.map_p(dict_value2)) {
                                        stacks.stack_push(dict_value2, stack);
                                    }
                                    else if (dict_value2.isCons()) {
                                        final SubLObject key2 = dict_value2.first();
                                        SubLObject cdolist_list_var2;
                                        final SubLObject entries2 = cdolist_list_var2 = dict_value2.rest();
                                        SubLObject entry_$45 = (SubLObject)nl_trie.NIL;
                                        entry_$45 = cdolist_list_var2.first();
                                        while (nl_trie.NIL != cdolist_list_var2) {
                                            final SubLObject validated2 = validate_nl_trie_entry(entry_$45);
                                            if (nl_trie.NIL == validated2) {
                                                nl_trie_delete_entry(nl_trie.$nl_trie$.getGlobalValue(), key2, entry_$45);
                                            }
                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                            entry_$45 = cdolist_list_var2.first();
                                        }
                                    }
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(datum2, (SubLObject)nl_trie.$list256);
                                }
                            }
                        }
                    }
                }
                finally {
                    file_vector_utilities.$current_backed_map_cache_strategy$.rebind(_prev_bind_1_$44, thread);
                    file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0_$43, thread);
                }
            }
            finally {
                if (nl_trie.NIL != release) {
                    Locks.release_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
                }
            }
            utilities_macros.noting_progress_postamble();
        }
        finally {
            utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
            utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
            utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
            utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)nl_trie.$kw304$VALIDATED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 94246L)
    public static SubLObject nl_trie_remove_invalid_entries(final SubLObject raw_entries, final SubLObject v_nl_trie, final SubLObject key0) {
        if (nl_trie.NIL != lexicon_macros.assume_nl_trie_validP()) {
            return raw_entries;
        }
        final SubLObject key = unicode_nauts.convert_unicode_nauts_to_utf8_strings(key0);
        SubLObject bad_entries = (SubLObject)nl_trie.NIL;
        SubLObject cdolist_list_var = raw_entries;
        SubLObject entry = (SubLObject)nl_trie.NIL;
        entry = cdolist_list_var.first();
        while (nl_trie.NIL != cdolist_list_var) {
            final SubLObject validP = validate_nl_trie_entry(entry);
            if (nl_trie.NIL == validP) {
                bad_entries = (SubLObject)ConsesLow.cons(entry, bad_entries);
                nl_trie_warn((SubLObject)nl_trie.TWO_INTEGER, (SubLObject)nl_trie.$str305$Removing_bad_NL_trie_entry_for__S, key, entry, raw_entries, (SubLObject)nl_trie.UNPROVIDED);
                nl_trie_delete_entry(v_nl_trie, key, entry);
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        if (nl_trie.NIL != bad_entries) {
            final SubLObject good_raw_entries = nl_trie_remaining_entries(raw_entries, bad_entries);
            nl_trie_warn((SubLObject)nl_trie.TWO_INTEGER, (SubLObject)nl_trie.$str306$Remaining_entries_____S__, good_raw_entries, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
            return good_raw_entries;
        }
        return raw_entries;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 94957L)
    public static SubLObject nl_trie_remaining_entries(final SubLObject raw_entries, final SubLObject bad_entries) {
        return conses_high.set_difference(raw_entries, bad_entries, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 95132L)
    public static SubLObject nl_trie_filter_entries_for_case(final SubLObject raw_entries, final SubLObject key0) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject key = unicode_nauts.convert_unicode_nauts_to_utf8_strings(key0);
        SubLObject good_entries = (SubLObject)nl_trie.NIL;
        SubLObject cdolist_list_var = raw_entries;
        SubLObject raw_entry = (SubLObject)nl_trie.NIL;
        raw_entry = cdolist_list_var.first();
        while (nl_trie.NIL != cdolist_list_var) {
            if (nl_trie.NIL != subl_promotions.memberP(raw_entry, nl_trie.$nl_trie_entry_filter_stack$.getDynamicValue(thread), (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED)) {
                good_entries = (SubLObject)ConsesLow.cons(raw_entry, good_entries);
            }
            else {
                final SubLObject _prev_bind_0 = nl_trie.$nl_trie_entry_filter_stack$.currentBinding(thread);
                try {
                    nl_trie.$nl_trie_entry_filter_stack$.bind((SubLObject)ConsesLow.cons(raw_entry, nl_trie.$nl_trie_entry_filter_stack$.getDynamicValue(thread)), thread);
                    if (nl_trie.NIL != nl_trie_entry_case_matches_keyP(raw_entry, key)) {
                        good_entries = (SubLObject)ConsesLow.cons(raw_entry, good_entries);
                    }
                }
                finally {
                    nl_trie.$nl_trie_entry_filter_stack$.rebind(_prev_bind_0, thread);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            raw_entry = cdolist_list_var.first();
        }
        return good_entries;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 95753L)
    public static SubLObject nl_trie_entry_case_matches_keyP(final SubLObject entry, final SubLObject key0) {
        final SubLObject key = unicode_nauts.convert_unicode_nauts_to_utf8_strings(key0);
        SubLObject matchP = (SubLObject)nl_trie.NIL;
        final SubLObject consider_adding_theP = Equality.equalp(key.first(), nl_trie.$english_definite_determiner$.getGlobalValue());
        if (nl_trie.NIL == matchP) {
            SubLObject csome_list_var;
            SubLObject entry_key;
            for (csome_list_var = nl_trie_entry_keys(entry, consider_adding_theP), entry_key = (SubLObject)nl_trie.NIL, entry_key = csome_list_var.first(); nl_trie.NIL == matchP && nl_trie.NIL != csome_list_var; matchP = Equality.equal(entry_key, key), csome_list_var = csome_list_var.rest(), entry_key = csome_list_var.first()) {}
        }
        return matchP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 96108L)
    public static SubLObject clear_nl_trie_caches() {
        clear_nl_trie_preds_of_pos();
        clear_nl_trie_multi_word_abbreviation_preds();
        clear_nl_trie_preds_licensed_by_pos();
        clear_nl_trie_name_string_preds();
        clear_nl_trie_pos_of_pred();
        clear_nl_trie_spec_predicates();
        clear_nl_trie_pred_ok_for_posP();
        clear_nl_trie_pos_for_semtrans_pred();
        clear_nl_trie_closed_class_pos_preds();
        return (SubLObject)nl_trie.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 96497L)
    public static SubLObject initialize_nl_trie_control_vars() {
        initialize_nl_trie_syntactic_predicates();
        initialize_nl_trie_denotation_predicates();
        initialize_nl_trie_other_predicates();
        initialize_nl_trie_pragmatic_predicates();
        return (SubLObject)nl_trie.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 96824L)
    public static SubLObject initialize_nl_trie_syntactic_predicates() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)nl_trie.$sym53$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(nl_trie.$const54$EverythingPSC, thread);
            final SubLObject raw_preds = (SubLObject)ConsesLow.cons(nl_trie.$const140$partOfSpeech, lexicon_accessors.all_speech_part_preds(nl_trie.$nl_trie_lexical_mt$.getGlobalValue()));
            final SubLObject filtered_preds = list_utilities.remove_if_not((SubLObject)nl_trie.$sym307$NL_TRIE_SYNTACTIC_PRED_, raw_preds, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
            nl_trie.$nl_trie_syntactic_predicates$.setGlobalValue(filtered_preds);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)nl_trie.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 97250L)
    public static SubLObject initialize_nl_trie_denotation_predicates() {
        nl_trie.$nl_trie_denotation_predicates$.setGlobalValue((SubLObject)nl_trie.$list308);
        return (SubLObject)nl_trie.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 97675L)
    public static SubLObject initialize_nl_trie_other_predicates() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)nl_trie.$sym53$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(nl_trie.$const54$EverythingPSC, thread);
            nl_trie.$nl_trie_abbreviation_predicates$.setGlobalValue((SubLObject)ConsesLow.cons(nl_trie.$const174$abbreviationForLexicalWord, nl_trie_multi_word_abbreviation_preds()));
            nl_trie.$nl_trie_arg_in_reln_predicates$.setGlobalValue(isa.all_fort_instances(nl_trie.$const309$DenotesArgInRelnPredicate, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED));
            nl_trie.$nl_trie_semtrans_predicates$.setGlobalValue(isa.all_fort_instances(nl_trie.$const310$SemTransPred, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED));
            nl_trie.$nl_trie_semtrans_predicates$.setGlobalValue(list_utilities.delete_if_not((SubLObject)nl_trie.$sym311$NL_TRIE_SEMTRANS_PRED_HAS_POS_SPECIFICATION_, nl_trie.$nl_trie_semtrans_predicates$.getGlobalValue(), (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED));
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return nl_trie.$nl_trie_arg_in_reln_predicates$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 98489L)
    public static SubLObject nl_trie_semtrans_pred_has_pos_specificationP(final SubLObject pred) {
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL != nl_trie_pos_for_semtrans_pred(pred, (SubLObject)nl_trie.UNPROVIDED) || nl_trie.NIL != lexicon_utilities.pos_arg_of_pred_cached(pred));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 98645L)
    public static SubLObject nl_trie_abbreviation_pred_p(final SubLObject obj) {
        return subl_promotions.memberP(obj, nl_trie_abbreviation_predicates(), (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 98753L)
    public static SubLObject nl_trie_multi_word_abbreviation_pred_p(final SubLObject obj) {
        return subl_promotions.memberP(obj, nl_trie_multi_word_abbreviation_preds(), (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 98878L)
    public static SubLObject clear_nl_trie_multi_word_abbreviation_preds() {
        final SubLObject cs = nl_trie.$nl_trie_multi_word_abbreviation_preds_caching_state$.getGlobalValue();
        if (nl_trie.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 98878L)
    public static SubLObject remove_nl_trie_multi_word_abbreviation_preds() {
        return memoization_state.caching_state_remove_function_results_with_args(nl_trie.$nl_trie_multi_word_abbreviation_preds_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(nl_trie.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 98878L)
    public static SubLObject nl_trie_multi_word_abbreviation_preds_internal() {
        return isa.all_fort_instances_in_all_mts(nl_trie.$const313$MultiWordForStringPred);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 98878L)
    public static SubLObject nl_trie_multi_word_abbreviation_preds() {
        SubLObject caching_state = nl_trie.$nl_trie_multi_word_abbreviation_preds_caching_state$.getGlobalValue();
        if (nl_trie.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)nl_trie.$sym312$NL_TRIE_MULTI_WORD_ABBREVIATION_PREDS, (SubLObject)nl_trie.$sym314$_NL_TRIE_MULTI_WORD_ABBREVIATION_PREDS_CACHING_STATE_, (SubLObject)nl_trie.NIL, (SubLObject)nl_trie.EQL, (SubLObject)nl_trie.ZERO_INTEGER, (SubLObject)nl_trie.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)nl_trie.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(nl_trie_multi_word_abbreviation_preds_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)nl_trie.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 99010L)
    public static SubLObject initialize_nl_trie_pragmatic_predicates() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)nl_trie.$sym53$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(nl_trie.$const54$EverythingPSC, thread);
            nl_trie.$nl_trie_pragmatic_predicates$.setGlobalValue(isa.all_fort_instances(nl_trie.$const315$NLPragmaticPredicate_New, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED));
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)nl_trie.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 99373L)
    public static SubLObject nl_trie_syntactic_assertionP(final SubLObject assertion) {
        if (nl_trie.NIL != ok_assertion_for_nl_trieP(assertion)) {
            final SubLObject assertion_pred = assertions_high.gaf_arg0(assertion);
            return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL != subl_promotions.memberP(assertion_pred, nl_trie_syntactic_predicates(), (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED) || nl_trie.NIL != conses_high.member(assertion_pred, nl_trie_arg_in_reln_predicates(), (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED) || nl_trie.NIL != nl_trie_abbreviation_pred_p(assertion_pred));
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 99838L)
    public static SubLObject nl_trie_semantic_assertionP(final SubLObject assertion) {
        if (nl_trie.NIL != ok_assertion_for_nl_trieP(assertion)) {
            final SubLObject assertion_pred = assertions_high.gaf_arg0(assertion);
            return (SubLObject)SubLObjectFactory.makeBoolean(assertion_pred.eql(nl_trie.$const15$termPhrases) || nl_trie.NIL != subl_promotions.memberP(assertion_pred, nl_trie_denotation_predicates(), (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED) || nl_trie.NIL != conses_high.member(assertion_pred, nl_trie_semtrans_predicates(), (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED) || (nl_trie.NIL != nl_trie_name_string_predP(assertion_pred) && nl_trie.NIL != cycl_string.cycl_string_p(assertions_high.gaf_arg2(assertion))) || nl_trie.NIL != conses_high.member(assertion_pred, nl_trie_arg_in_reln_predicates(), (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED));
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 100413L)
    public static SubLObject initialize_nl_trie_int(SubLObject v_nl_trie) {
        if (v_nl_trie == nl_trie.UNPROVIDED) {
            v_nl_trie = nl_trie.$nl_trie$.getGlobalValue();
        }
        PrintLow.format((SubLObject)nl_trie.T, (SubLObject)nl_trie.$str316$__Initializing_NL_Trie_____);
        streams_high.force_output((SubLObject)nl_trie.UNPROVIDED);
        PrintLow.format((SubLObject)nl_trie.T, (SubLObject)nl_trie.$str317$__Triefying_the_syntactic_predica);
        nl_triefy_preds((SubLObject)nl_trie.$kw318$SYNTACTIC, v_nl_trie);
        PrintLow.format((SubLObject)nl_trie.T, (SubLObject)nl_trie.$str319$__Triefying_the_semantic_predicat);
        nl_triefy_preds((SubLObject)nl_trie.$kw320$SEMANTIC, v_nl_trie);
        return (SubLObject)nl_trie.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 101496L)
    public static SubLObject nl_triefy_preds(final SubLObject init_type, SubLObject v_nl_trie) {
        if (v_nl_trie == nl_trie.UNPROVIDED) {
            v_nl_trie = nl_trie.$nl_trie$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject preds_to_use = list_utilities.remove_if_not((SubLObject)nl_trie.$sym321$VALID_CONSTANT_, (SubLObject)((init_type == nl_trie.$kw318$SYNTACTIC) ? ConsesLow.append(nl_trie_syntactic_predicates(), nl_trie_abbreviation_predicates()) : ConsesLow.cons(nl_trie.$const15$termPhrases, nl_trie_name_string_preds())), (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
        final SubLObject total_preds = Sequences.length(preds_to_use);
        SubLObject count_preds_done = (SubLObject)nl_trie.ZERO_INTEGER;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject cdolist_list_var = preds_to_use;
                SubLObject pred = (SubLObject)nl_trie.NIL;
                pred = cdolist_list_var.first();
                while (nl_trie.NIL != cdolist_list_var) {
                    final SubLObject progress_note = PrintLow.format((SubLObject)nl_trie.NIL, (SubLObject)nl_trie.$str322$____D__D__Triefying__S_assertions, new SubLObject[] { number_utilities.f_1X(count_preds_done), total_preds, pred });
                    nl_triefy_pred(pred, (SubLObject)nl_trie.NIL, init_type, v_nl_trie, progress_note);
                    count_preds_done = Numbers.add(count_preds_done, (SubLObject)nl_trie.ONE_INTEGER);
                    cdolist_list_var = cdolist_list_var.rest();
                    pred = cdolist_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$46 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nl_trie.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$46, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)nl_trie.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 102485L)
    public static SubLObject triefy_mt(final SubLObject mt, SubLObject v_nl_trie) {
        if (v_nl_trie == nl_trie.UNPROVIDED) {
            v_nl_trie = nl_trie.$nl_trie$.getGlobalValue();
        }
        triefy_mt_int(mt, isa.all_fort_instances(nl_trie.$const323$NLSyntacticPredicate, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED), v_nl_trie);
        triefy_mt_int(mt, isa.all_fort_instances(nl_trie.$const324$NLSemanticPredicate, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED), v_nl_trie);
        return (SubLObject)nl_trie.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 102802L)
    public static SubLObject triefy_mt_int(final SubLObject mt, SubLObject preds_to_use, SubLObject v_nl_trie) {
        if (v_nl_trie == nl_trie.UNPROVIDED) {
            v_nl_trie = nl_trie.$nl_trie$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        preds_to_use = list_utilities.remove_if_not((SubLObject)nl_trie.$sym321$VALID_CONSTANT_, preds_to_use, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
        final SubLObject total_preds = Sequences.length(preds_to_use);
        SubLObject count_preds_done = (SubLObject)nl_trie.ZERO_INTEGER;
        final SubLObject progress_message = PrintLow.format((SubLObject)nl_trie.NIL, (SubLObject)nl_trie.$str325$Triefying__S, mt);
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)nl_trie.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)nl_trie.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)nl_trie.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(progress_message);
                SubLObject cdolist_list_var = preds_to_use;
                SubLObject pred = (SubLObject)nl_trie.NIL;
                pred = cdolist_list_var.first();
                while (nl_trie.NIL != cdolist_list_var) {
                    final SubLObject init_type = (SubLObject)((nl_trie.NIL != Sequences.find(pred, nl_trie_syntactic_predicates(), (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED)) ? nl_trie.$kw318$SYNTACTIC : nl_trie.$kw320$SEMANTIC);
                    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                    final SubLObject _prev_bind_0_$47 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$48 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$49 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        final SubLObject pred_var = pred;
                        if (nl_trie.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                            final SubLObject str = (SubLObject)nl_trie.NIL;
                            final SubLObject _prev_bind_0_$48 = utilities_macros.$progress_start_time$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$49 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$50 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                            final SubLObject _prev_bind_3_$53 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                            final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                            final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                            final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                            try {
                                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                                utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                                utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                                utilities_macros.$progress_notification_count$.bind((SubLObject)nl_trie.ZERO_INTEGER, thread);
                                utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)nl_trie.ZERO_INTEGER, thread);
                                utilities_macros.$progress_count$.bind((SubLObject)nl_trie.ZERO_INTEGER, thread);
                                utilities_macros.$is_noting_progressP$.bind((SubLObject)nl_trie.T, thread);
                                utilities_macros.$silent_progressP$.bind((SubLObject)((nl_trie.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : nl_trie.T), thread);
                                utilities_macros.noting_progress_preamble(str);
                                final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                SubLObject done_var = (SubLObject)nl_trie.NIL;
                                final SubLObject token_var = (SubLObject)nl_trie.NIL;
                                while (nl_trie.NIL == done_var) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                    if (nl_trie.NIL != valid) {
                                        utilities_macros.note_progress();
                                        SubLObject final_index_iterator = (SubLObject)nl_trie.NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)nl_trie.$kw326$GAF, (SubLObject)nl_trie.$kw327$TRUE, (SubLObject)nl_trie.NIL);
                                            SubLObject done_var_$54 = (SubLObject)nl_trie.NIL;
                                            final SubLObject token_var_$55 = (SubLObject)nl_trie.NIL;
                                            while (nl_trie.NIL == done_var_$54) {
                                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$55);
                                                final SubLObject valid_$56 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$55.eql(assertion));
                                                if (nl_trie.NIL != valid_$56) {
                                                    final SubLObject pcase_var = init_type;
                                                    if (pcase_var.eql((SubLObject)nl_trie.$kw318$SYNTACTIC)) {
                                                        update_nl_trie_syntactic(assertion, v_nl_trie, (SubLObject)nl_trie.UNPROVIDED);
                                                    }
                                                    else if (pcase_var.eql((SubLObject)nl_trie.$kw320$SEMANTIC)) {
                                                        update_nl_trie_semantic(assertion, v_nl_trie, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
                                                    }
                                                }
                                                done_var_$54 = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL == valid_$56);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$49 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nl_trie.T, thread);
                                                final SubLObject _values = Values.getValuesAsVector();
                                                if (nl_trie.NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                Values.restoreValuesFromVector(_values);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$49, thread);
                                            }
                                        }
                                    }
                                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL == valid);
                                }
                                utilities_macros.noting_progress_postamble();
                            }
                            finally {
                                utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                                utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                                utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                                utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                                utilities_macros.$progress_notification_count$.rebind(_prev_bind_3_$53, thread);
                                utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$50, thread);
                                utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$49, thread);
                                utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$48, thread);
                            }
                        }
                    }
                    finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$49, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$48, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$47, thread);
                    }
                    count_preds_done = Numbers.add(count_preds_done, (SubLObject)nl_trie.ONE_INTEGER);
                    utilities_macros.note_percent_progress(count_preds_done, total_preds);
                    cdolist_list_var = cdolist_list_var.rest();
                    pred = cdolist_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$50 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nl_trie.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$50, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)nl_trie.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 103666L)
    public static SubLObject nl_triefy_pred(final SubLObject pred, SubLObject clear_firstP, SubLObject init_type, SubLObject v_nl_trie, SubLObject progress_note) {
        if (clear_firstP == nl_trie.UNPROVIDED) {
            clear_firstP = (SubLObject)nl_trie.T;
        }
        if (init_type == nl_trie.UNPROVIDED) {
            init_type = (SubLObject)nl_trie.NIL;
        }
        if (v_nl_trie == nl_trie.UNPROVIDED) {
            v_nl_trie = nl_trie.$nl_trie$.getGlobalValue();
        }
        if (progress_note == nl_trie.UNPROVIDED) {
            progress_note = PrintLow.format((SubLObject)nl_trie.NIL, (SubLObject)nl_trie.$str328$Triefying__S_assertions___, pred);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (nl_trie.NIL != clear_firstP) {
            nl_trie_clear_pred(pred);
        }
        if (nl_trie.NIL == init_type) {
            init_type = (SubLObject)((nl_trie.NIL != Sequences.find(pred, nl_trie_syntactic_predicates(), (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED)) ? nl_trie.$kw318$SYNTACTIC : nl_trie.$kw320$SEMANTIC);
        }
        SubLObject total = (SubLObject)nl_trie.ZERO_INTEGER;
        SubLObject sofar = (SubLObject)nl_trie.ZERO_INTEGER;
        final SubLObject threshold = (SubLObject)nl_trie.$int178$1000;
        final SubLObject desired_result = nl_trie_return_keyword((SubLObject)nl_trie.NIL, (SubLObject)nl_trie.T);
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)nl_trie.$sym53$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(nl_trie.$const54$EverythingPSC, thread);
            total = kb_indexing.relevant_num_predicate_extent_index(pred);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)nl_trie.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)nl_trie.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)nl_trie.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(progress_note);
                final SubLObject _prev_bind_0_$59 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$60 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)nl_trie.$sym53$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(nl_trie.$const54$EverythingPSC, thread);
                    if (nl_trie.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred)) {
                        final SubLObject str = (SubLObject)nl_trie.NIL;
                        final SubLObject _prev_bind_0_$60 = utilities_macros.$progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$61 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$63 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                        final SubLObject _prev_bind_3_$64 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                        final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                        final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                        try {
                            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                            utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                            utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                            utilities_macros.$progress_notification_count$.bind((SubLObject)nl_trie.ZERO_INTEGER, thread);
                            utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)nl_trie.ZERO_INTEGER, thread);
                            utilities_macros.$progress_count$.bind((SubLObject)nl_trie.ZERO_INTEGER, thread);
                            utilities_macros.$is_noting_progressP$.bind((SubLObject)nl_trie.T, thread);
                            utilities_macros.$silent_progressP$.bind((SubLObject)((nl_trie.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : nl_trie.T), thread);
                            utilities_macros.noting_progress_preamble(str);
                            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred);
                            SubLObject done_var = (SubLObject)nl_trie.NIL;
                            final SubLObject token_var = (SubLObject)nl_trie.NIL;
                            while (nl_trie.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (nl_trie.NIL != valid) {
                                    utilities_macros.note_progress();
                                    SubLObject final_index_iterator = (SubLObject)nl_trie.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)nl_trie.$kw326$GAF, (SubLObject)nl_trie.$kw327$TRUE, (SubLObject)nl_trie.NIL);
                                        SubLObject done_var_$65 = (SubLObject)nl_trie.NIL;
                                        final SubLObject token_var_$66 = (SubLObject)nl_trie.NIL;
                                        while (nl_trie.NIL == done_var_$65) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$66);
                                            final SubLObject valid_$67 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$66.eql(assertion));
                                            if (nl_trie.NIL != valid_$67) {
                                                final SubLObject pcase_var = init_type;
                                                if (pcase_var.eql((SubLObject)nl_trie.$kw318$SYNTACTIC)) {
                                                    if (nl_trie.NIL != nl_trie_syntactic_assertionP(assertion)) {
                                                        final SubLObject result = update_nl_trie_syntactic(assertion, v_nl_trie, (SubLObject)nl_trie.UNPROVIDED);
                                                        if (!result.eql(desired_result)) {
                                                            Errors.warn((SubLObject)nl_trie.$str329$Got_failure_result__S_when_triefy, result, assertion);
                                                        }
                                                    }
                                                }
                                                else if (pcase_var.eql((SubLObject)nl_trie.$kw320$SEMANTIC) && nl_trie.NIL != nl_trie_semantic_assertionP(assertion)) {
                                                    final SubLObject result = update_nl_trie_semantic(assertion, v_nl_trie, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
                                                    if (!result.eql(desired_result)) {
                                                        Errors.warn((SubLObject)nl_trie.$str329$Got_failure_result__S_when_triefy, result, assertion);
                                                    }
                                                }
                                                sofar = Numbers.add(sofar, (SubLObject)nl_trie.ONE_INTEGER);
                                                if (total.numGE(threshold)) {
                                                    utilities_macros.note_percent_progress(sofar, total);
                                                }
                                            }
                                            done_var_$65 = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL == valid_$67);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$61 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nl_trie.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            if (nl_trie.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$61, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL == valid);
                            }
                            utilities_macros.noting_progress_postamble();
                        }
                        finally {
                            utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                            utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                            utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                            utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                            utilities_macros.$progress_notification_count$.rebind(_prev_bind_3_$64, thread);
                            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$63, thread);
                            utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$61, thread);
                            utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$60, thread);
                        }
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$60, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$59, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$62 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nl_trie.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$62, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)nl_trie.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 105022L)
    public static SubLObject nl_trie_clear_pred(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = (SubLObject)nl_trie.NIL;
        try {
            release = Locks.seize_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
            final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
            final SubLObject _prev_bind_2 = file_vector_utilities.$current_backed_map_cache_strategy$.currentBinding(thread);
            try {
                file_vector_utilities.$file_vector_backed_map_read_lock$.bind(nl_trie.$nl_trie_lock$.getGlobalValue(), thread);
                file_vector_utilities.$current_backed_map_cache_strategy$.bind(nl_trie.$nl_trie_cache_strategy$.getGlobalValue(), thread);
                final SubLObject stack = stacks.create_stack();
                final SubLObject iterator = map_utilities.new_map_iterator(nl_trie.$nl_trie$.getGlobalValue());
                SubLObject valid;
                for (SubLObject done_var = (SubLObject)nl_trie.NIL; nl_trie.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL == valid)) {
                    thread.resetMultipleValues();
                    final SubLObject var = iteration.iteration_next(iterator);
                    valid = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (nl_trie.NIL != valid) {
                        SubLObject current;
                        final SubLObject datum = current = var;
                        SubLObject dict_key = (SubLObject)nl_trie.NIL;
                        SubLObject dict_value = (SubLObject)nl_trie.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list256);
                        dict_key = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list256);
                        dict_value = current.first();
                        current = current.rest();
                        if (nl_trie.NIL == current) {
                            if (nl_trie.NIL != map_utilities.map_p(dict_value)) {
                                stacks.stack_push(dict_value, stack);
                            }
                            else if (dict_value.isCons()) {
                                final SubLObject key = dict_value.first();
                                final SubLObject entries = dict_value.rest();
                                thread.resetMultipleValues();
                                final SubLObject new_entries = nl_trie_remove_entries_wXpred(entries, pred);
                                final SubLObject changedP = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (nl_trie.NIL != changedP) {
                                    if (nl_trie.NIL != new_entries) {
                                        strie.strie_replace(nl_trie.$nl_trie$.getGlobalValue(), key, new_entries);
                                    }
                                    else {
                                        strie.strie_remove(nl_trie.$nl_trie$.getGlobalValue(), key);
                                    }
                                }
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_trie.$list256);
                        }
                    }
                }
                while (nl_trie.NIL == stacks.stack_empty_p(stack)) {
                    final SubLObject entry = stacks.stack_pop(stack);
                    final SubLObject iterator2 = map_utilities.new_map_iterator(entry);
                    SubLObject valid2;
                    for (SubLObject done_var2 = (SubLObject)nl_trie.NIL; nl_trie.NIL == done_var2; done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL == valid2)) {
                        thread.resetMultipleValues();
                        final SubLObject var2 = iteration.iteration_next(iterator2);
                        valid2 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (nl_trie.NIL != valid2) {
                            SubLObject current2;
                            final SubLObject datum2 = current2 = var2;
                            SubLObject dict_key2 = (SubLObject)nl_trie.NIL;
                            SubLObject dict_value2 = (SubLObject)nl_trie.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)nl_trie.$list256);
                            dict_key2 = current2.first();
                            current2 = current2.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)nl_trie.$list256);
                            dict_value2 = current2.first();
                            current2 = current2.rest();
                            if (nl_trie.NIL == current2) {
                                if (nl_trie.NIL != map_utilities.map_p(dict_value2)) {
                                    stacks.stack_push(dict_value2, stack);
                                }
                                else if (dict_value2.isCons()) {
                                    final SubLObject key2 = dict_value2.first();
                                    final SubLObject entries2 = dict_value2.rest();
                                    thread.resetMultipleValues();
                                    final SubLObject new_entries2 = nl_trie_remove_entries_wXpred(entries2, pred);
                                    final SubLObject changedP2 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (nl_trie.NIL != changedP2) {
                                        if (nl_trie.NIL != new_entries2) {
                                            strie.strie_replace(nl_trie.$nl_trie$.getGlobalValue(), key2, new_entries2);
                                        }
                                        else {
                                            strie.strie_remove(nl_trie.$nl_trie$.getGlobalValue(), key2);
                                        }
                                    }
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(datum2, (SubLObject)nl_trie.$list256);
                            }
                        }
                    }
                }
            }
            finally {
                file_vector_utilities.$current_backed_map_cache_strategy$.rebind(_prev_bind_2, thread);
                file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            if (nl_trie.NIL != release) {
                Locks.release_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
            }
        }
        return (SubLObject)nl_trie.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 105550L)
    public static SubLObject nl_trie_remove_entries_wXpred(final SubLObject entries, final SubLObject pred) {
        SubLObject ans = (SubLObject)nl_trie.NIL;
        SubLObject changedP = (SubLObject)nl_trie.NIL;
        SubLObject cdolist_list_var = entries;
        SubLObject entry = (SubLObject)nl_trie.NIL;
        entry = cdolist_list_var.first();
        while (nl_trie.NIL != cdolist_list_var) {
            if (nl_trie.NIL == nl_trie_entry_p(entry)) {
                changedP = (SubLObject)nl_trie.T;
            }
            else if (nl_trie_entry_semantic_pred(entry, (SubLObject)nl_trie.UNPROVIDED).eql(pred)) {
                changedP = (SubLObject)nl_trie.T;
            }
            else {
                ans = (SubLObject)ConsesLow.cons(entry, ans);
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        return Values.values(ans, changedP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 105891L)
    public static SubLObject ok_assertion_for_nl_trieP(final SubLObject assertion) {
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL != assertions_high.gaf_assertionP(assertion) && nl_trie.NIL != hlmt.hlmt_p(assertions_high.assertion_mt(assertion)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 106107L)
    public static SubLObject nl_trie_return_keyword(final SubLObject removeP, SubLObject successP) {
        if (successP == nl_trie.UNPROVIDED) {
            successP = (SubLObject)nl_trie.T;
        }
        if (nl_trie.NIL != removeP) {
            return (SubLObject)((nl_trie.NIL != successP) ? nl_trie.$kw147$REMOVED : nl_trie.$kw273$NOT_REMOVED);
        }
        return (SubLObject)((nl_trie.NIL != successP) ? nl_trie.$kw145$ADDED : nl_trie.$kw272$NOT_ADDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 106452L)
    public static SubLObject update_nl_trie_syntactic(final SubLObject assertion, SubLObject v_nl_trie, SubLObject removeP) {
        if (v_nl_trie == nl_trie.UNPROVIDED) {
            v_nl_trie = nl_trie.$nl_trie$.getGlobalValue();
        }
        if (removeP == nl_trie.UNPROVIDED) {
            removeP = (SubLObject)nl_trie.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (nl_trie.NIL == nl_trie_ok_trie_and_assertionP(v_nl_trie, assertion)) {
            return nl_trie_return_keyword(removeP, (SubLObject)nl_trie.NIL);
        }
        final SubLObject pred = assertions_high.gaf_arg0(assertion);
        final SubLObject desired_result = nl_trie_return_keyword(removeP, (SubLObject)nl_trie.T);
        SubLObject error_message = (SubLObject)nl_trie.NIL;
        SubLObject result = (SubLObject)nl_trie.NIL;
        if (nl_trie.NIL != nl_trie.$catch_nl_trie_errorsP$.getDynamicValue(thread)) {
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)nl_trie.$sym330$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        SubLObject release = (SubLObject)nl_trie.NIL;
                        try {
                            release = Locks.seize_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
                            final SubLObject _prev_bind_0_$70 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
                            try {
                                file_vector_utilities.$file_vector_backed_map_read_lock$.bind(nl_trie.$nl_trie_lock$.getGlobalValue(), thread);
                                if (pred.eql(nl_trie.$const140$partOfSpeech)) {
                                    result = nl_triefy_pos_assertion(assertion, v_nl_trie, removeP);
                                }
                                else if (nl_trie.NIL != nl_trie_abbreviation_pred_p(pred)) {
                                    final SubLObject pcase_var = pred;
                                    if (pcase_var.eql(nl_trie.$const174$abbreviationForLexicalWord)) {
                                        result = nl_triefy_abbr_lex_word_assertion(assertion, v_nl_trie, removeP);
                                    }
                                    else if (pcase_var.eql(nl_trie.$const331$abbreviationForMultiWordString)) {
                                        result = nl_triefy_abbr_mws_assertion(assertion, v_nl_trie, removeP);
                                    }
                                    else if (pcase_var.eql(nl_trie.$const332$abbreviationForCompoundString)) {
                                        result = nl_triefy_abbr_cps_assertion(assertion, v_nl_trie, removeP);
                                    }
                                }
                                else {
                                    result = nl_triefy_spp_assertion(assertion, v_nl_trie, removeP);
                                }
                            }
                            finally {
                                file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0_$70, thread);
                            }
                        }
                        finally {
                            if (nl_trie.NIL != release) {
                                Locks.release_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
                            }
                        }
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)nl_trie.NIL);
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
        }
        else {
            SubLObject release2 = (SubLObject)nl_trie.NIL;
            try {
                release2 = Locks.seize_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
                final SubLObject _prev_bind_2 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
                try {
                    file_vector_utilities.$file_vector_backed_map_read_lock$.bind(nl_trie.$nl_trie_lock$.getGlobalValue(), thread);
                    if (pred.eql(nl_trie.$const140$partOfSpeech)) {
                        result = nl_triefy_pos_assertion(assertion, v_nl_trie, removeP);
                    }
                    else if (nl_trie.NIL != nl_trie_abbreviation_pred_p(pred)) {
                        final SubLObject pcase_var2 = pred;
                        if (pcase_var2.eql(nl_trie.$const174$abbreviationForLexicalWord)) {
                            result = nl_triefy_abbr_lex_word_assertion(assertion, v_nl_trie, removeP);
                        }
                        else if (pcase_var2.eql(nl_trie.$const331$abbreviationForMultiWordString)) {
                            result = nl_triefy_abbr_mws_assertion(assertion, v_nl_trie, removeP);
                        }
                        else if (pcase_var2.eql(nl_trie.$const332$abbreviationForCompoundString)) {
                            result = nl_triefy_abbr_cps_assertion(assertion, v_nl_trie, removeP);
                        }
                    }
                    else {
                        result = nl_triefy_spp_assertion(assertion, v_nl_trie, removeP);
                    }
                }
                finally {
                    file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_2, thread);
                }
            }
            finally {
                if (nl_trie.NIL != release2) {
                    Locks.release_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
                }
            }
        }
        if (error_message.isString()) {
            nl_trie_warn((SubLObject)nl_trie.ONE_INTEGER, (SubLObject)nl_trie.$str333$Caught_error_in_UPDATE_NL_TRIE_SY, assertion, error_message, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
        }
        return nl_trie_return_keyword(removeP, Equality.eql(result, desired_result));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 108519L)
    public static SubLObject nl_trie_ok_trie_and_assertionP(final SubLObject v_nl_trie, final SubLObject assertion) {
        if (nl_trie.NIL == nl_trie_presentP(v_nl_trie)) {
            nl_trie_warn((SubLObject)nl_trie.TWO_INTEGER, (SubLObject)nl_trie.$str334$Trie_not_present___S, v_nl_trie, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
            return (SubLObject)nl_trie.NIL;
        }
        if (nl_trie.NIL == ok_assertion_for_nl_trieP(assertion)) {
            nl_trie_warn((SubLObject)nl_trie.TWO_INTEGER, (SubLObject)nl_trie.$str335$Assertion_fails_OK_ASSERTION_FOR_, assertion, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
            return (SubLObject)nl_trie.NIL;
        }
        return (SubLObject)nl_trie.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 108949L)
    public static SubLObject nl_triefy_spp_assertion(final SubLObject assertion, final SubLObject v_nl_trie, final SubLObject removeP) {
        final SubLObject string = cycl_string.cycl_string_to_utf8_string(assertions_high.gaf_arg2(assertion));
        final SubLObject wu = assertions_high.gaf_arg1(assertion);
        final SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
        final SubLObject spp_pred = assertions_high.gaf_arg0(assertion);
        final SubLObject syntactic_info = find_morphologically_derivable_strings(wu, string, spp_pred, assertion_mt);
        final SubLObject mod_list = find_mod_list(syntactic_info, assertion_mt);
        SubLObject cdolist_list_var = nl_trie_string_tokenize_multiple(string);
        SubLObject key = (SubLObject)nl_trie.NIL;
        key = cdolist_list_var.first();
        while (nl_trie.NIL != cdolist_list_var) {
            final SubLObject entry = new_nl_trie_word_for_syntactic_support(assertion);
            add_or_remove_nl_trie_word(v_nl_trie, key, entry, removeP);
            cdolist_list_var = cdolist_list_var.rest();
            key = cdolist_list_var.first();
        }
        cdolist_list_var = mod_list;
        SubLObject item = (SubLObject)nl_trie.NIL;
        item = cdolist_list_var.first();
        while (nl_trie.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = item;
            SubLObject mod_str_list = (SubLObject)nl_trie.NIL;
            SubLObject constraint = (SubLObject)nl_trie.NIL;
            SubLObject mt = (SubLObject)nl_trie.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list336);
            mod_str_list = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list336);
            constraint = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list336);
            mt = current.first();
            current = current.rest();
            if (nl_trie.NIL == current) {
                final SubLObject pred = (nl_trie.NIL != fort_types_interface.predicate_p(constraint)) ? constraint : nl_trie.$const140$partOfSpeech;
                SubLObject cdolist_list_var_$71 = mod_str_list;
                SubLObject mod_string = (SubLObject)nl_trie.NIL;
                mod_string = cdolist_list_var_$71.first();
                while (nl_trie.NIL != cdolist_list_var_$71) {
                    SubLObject cdolist_list_var_$72 = nl_trie_string_tokenize_multiple(mod_string);
                    SubLObject key2 = (SubLObject)nl_trie.NIL;
                    key2 = cdolist_list_var_$72.first();
                    while (nl_trie.NIL != cdolist_list_var_$72) {
                        final SubLObject sentence = el_utilities.make_binary_formula(pred, wu, mod_string);
                        final SubLObject syntactic_support = find_or_create_nl_trie_word_syn_support(sentence, mt, mod_string);
                        final SubLObject entry2 = new_nl_trie_word_for_syntactic_support(syntactic_support);
                        add_or_remove_nl_trie_word(v_nl_trie, key2, entry2, removeP);
                        cdolist_list_var_$72 = cdolist_list_var_$72.rest();
                        key2 = cdolist_list_var_$72.first();
                    }
                    cdolist_list_var_$71 = cdolist_list_var_$71.rest();
                    mod_string = cdolist_list_var_$71.first();
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_trie.$list336);
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        update_nl_trie_semantic_on_wu(wu, v_nl_trie, assertion_mt, removeP, (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(string), spp_pred, assertion_mt), mod_list));
        if (nl_trie.NIL != unique_irregular_form_assertionP(assertion)) {
            nl_trie_clean_up_regular_forms(assertion, v_nl_trie, removeP);
        }
        return nl_trie_return_keyword(removeP, (SubLObject)nl_trie.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 111399L)
    public static SubLObject unique_irregular_form_assertionP(final SubLObject assertion) {
        SubLObject current;
        final SubLObject datum = current = assertions_high.gaf_formula(assertion);
        SubLObject spp_pred = (SubLObject)nl_trie.NIL;
        SubLObject word = (SubLObject)nl_trie.NIL;
        SubLObject string = (SubLObject)nl_trie.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list337);
        spp_pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list337);
        word = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list337);
        string = current.first();
        current = current.rest();
        if (nl_trie.NIL == current) {
            final SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
            return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL != lexicon_accessors.derived_predP(spp_pred, assertion_mt) && nl_trie.NIL == Sequences.remove(string, nl_trie_get_irregular_forms(word, spp_pred, assertion_mt), Symbols.symbol_function((SubLObject)nl_trie.EQUALP), (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_trie.$list337);
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 111856L)
    public static SubLObject nl_trie_get_irregular_forms(final SubLObject wu, final SubLObject pred, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject forms = (SubLObject)nl_trie.NIL;
        SubLObject cdolist_list_var = nl_trie_spec_predicates(pred, mt);
        SubLObject spec_pred = (SubLObject)nl_trie.NIL;
        spec_pred = cdolist_list_var.first();
        while (nl_trie.NIL != cdolist_list_var) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                SubLObject cdolist_list_var_$73 = kb_mapping_utilities.pred_values(wu, spec_pred, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
                SubLObject form = (SubLObject)nl_trie.NIL;
                form = cdolist_list_var_$73.first();
                while (nl_trie.NIL != cdolist_list_var_$73) {
                    forms = (SubLObject)ConsesLow.cons(form, forms);
                    cdolist_list_var_$73 = cdolist_list_var_$73.rest();
                    form = cdolist_list_var_$73.first();
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            spec_pred = cdolist_list_var.first();
        }
        return Sequences.delete_duplicates(forms, Symbols.symbol_function((SubLObject)nl_trie.EQUAL), (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 112218L)
    public static SubLObject clear_nl_trie_spec_predicates() {
        final SubLObject cs = nl_trie.$nl_trie_spec_predicates_caching_state$.getGlobalValue();
        if (nl_trie.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 112218L)
    public static SubLObject remove_nl_trie_spec_predicates(final SubLObject pred, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args(nl_trie.$nl_trie_spec_predicates_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(pred, mt), (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 112218L)
    public static SubLObject nl_trie_spec_predicates_internal(final SubLObject pred, final SubLObject mt) {
        return genl_predicates.all_spec_predicates(pred, mt, (SubLObject)nl_trie.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 112218L)
    public static SubLObject nl_trie_spec_predicates(final SubLObject pred, final SubLObject mt) {
        SubLObject caching_state = nl_trie.$nl_trie_spec_predicates_caching_state$.getGlobalValue();
        if (nl_trie.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)nl_trie.$sym338$NL_TRIE_SPEC_PREDICATES, (SubLObject)nl_trie.$sym339$_NL_TRIE_SPEC_PREDICATES_CACHING_STATE_, (SubLObject)nl_trie.$int340$256, (SubLObject)nl_trie.EQL, (SubLObject)nl_trie.TWO_INTEGER, (SubLObject)nl_trie.ZERO_INTEGER);
            memoization_state.register_genl_preds_dependent_cache_clear_callback((SubLObject)nl_trie.$sym341$CLEAR_NL_TRIE_SPEC_PREDICATES);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pred, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)nl_trie.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)nl_trie.NIL;
            collision = cdolist_list_var.first();
            while (nl_trie.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (nl_trie.NIL != cached_args && nl_trie.NIL == cached_args.rest() && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(nl_trie_spec_predicates_internal(pred, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(pred, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 112374L)
    public static SubLObject nl_trie_clean_up_regular_forms(final SubLObject assertion, final SubLObject v_nl_trie, final SubLObject removeP) {
        SubLObject current;
        final SubLObject datum = current = assertions_high.gaf_formula(assertion);
        SubLObject sp_pred = (SubLObject)nl_trie.NIL;
        SubLObject word = (SubLObject)nl_trie.NIL;
        SubLObject string = (SubLObject)nl_trie.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list342);
        sp_pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list342);
        word = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list342);
        string = current.first();
        current = current.rest();
        if (nl_trie.NIL == current) {
            final SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
            SubLObject cleaned_up_forms = (SubLObject)nl_trie.NIL;
            if (nl_trie.NIL != lexicon_accessors.speech_part_predP(sp_pred, (SubLObject)nl_trie.UNPROVIDED) && nl_trie.NIL != lexicon_accessors.lexical_wordP(word)) {
                SubLObject cdolist_list_var = lexicon_cache.generate_regular_strings(word, sp_pred, assertion_mt);
                SubLObject regular_form = (SubLObject)nl_trie.NIL;
                regular_form = cdolist_list_var.first();
                while (nl_trie.NIL != cdolist_list_var) {
                    if (!regular_form.equal(string)) {
                        if (nl_trie.NIL != removeP) {
                            if (nl_trie.NIL == lexicon_accessors.string_is_pred_on_wuP(regular_form, word, sp_pred, assertion_mt, (SubLObject)nl_trie.UNPROVIDED)) {
                                nl_trie_clean_up_one_regular_form(regular_form, assertion, v_nl_trie, removeP);
                                cleaned_up_forms = (SubLObject)ConsesLow.cons(regular_form, cleaned_up_forms);
                            }
                        }
                        else if (nl_trie.NIL == nl_trie_asserted_word_formP(sp_pred, word, regular_form, assertion_mt)) {
                            nl_trie_clean_up_one_regular_form(regular_form, assertion, v_nl_trie, removeP);
                            cleaned_up_forms = (SubLObject)ConsesLow.cons(regular_form, cleaned_up_forms);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    regular_form = cdolist_list_var.first();
                }
            }
            return cleaned_up_forms;
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_trie.$list342);
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 113592L)
    public static SubLObject nl_trie_asserted_word_formP(final SubLObject sp_pred, final SubLObject word, final SubLObject word_form, final SubLObject query_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertedP = (SubLObject)nl_trie.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(query_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject asserted_string = (SubLObject)nl_trie.NIL;
            if (nl_trie.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(word, (SubLObject)nl_trie.NIL, sp_pred)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(word, (SubLObject)nl_trie.NIL, sp_pred);
                SubLObject done_var = assertedP;
                final SubLObject token_var = (SubLObject)nl_trie.NIL;
                while (nl_trie.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (nl_trie.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)nl_trie.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)nl_trie.$kw326$GAF, (SubLObject)nl_trie.NIL, (SubLObject)nl_trie.NIL);
                            SubLObject done_var_$74 = assertedP;
                            final SubLObject token_var_$75 = (SubLObject)nl_trie.NIL;
                            while (nl_trie.NIL == done_var_$74) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$75);
                                final SubLObject valid_$76 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$75.eql(assertion));
                                if (nl_trie.NIL != valid_$76) {
                                    asserted_string = assertions_high.gaf_arg(assertion, (SubLObject)nl_trie.TWO_INTEGER);
                                    if (asserted_string.equal(word_form)) {
                                        assertedP = (SubLObject)nl_trie.T;
                                    }
                                }
                                done_var_$74 = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL == valid_$76 || nl_trie.NIL != assertedP);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$77 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nl_trie.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (nl_trie.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$77, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL == valid || nl_trie.NIL != assertedP);
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return assertedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 113920L)
    public static SubLObject nl_trie_clean_up_one_regular_form(final SubLObject regular_form, final SubLObject assertion, final SubLObject v_nl_trie, final SubLObject removeP) {
        SubLObject current;
        final SubLObject datum = current = assertions_high.gaf_formula(assertion);
        SubLObject spp_pred = (SubLObject)nl_trie.NIL;
        SubLObject wu = (SubLObject)nl_trie.NIL;
        SubLObject irregular_string = (SubLObject)nl_trie.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list343);
        spp_pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list343);
        wu = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list343);
        irregular_string = current.first();
        current = current.rest();
        if (nl_trie.NIL == current) {
            final SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
            final SubLObject remove_this_oneP = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL == removeP);
            final SubLObject regular_sentence = el_utilities.make_binary_formula(spp_pred, wu, regular_form);
            final SubLObject syntactic_support = find_or_create_nl_trie_word_syn_support(regular_sentence, assertion_mt, regular_form);
            final SubLObject nl_trie_word = new_nl_trie_word_for_syntactic_support(syntactic_support);
            SubLObject cdolist_list_var = nl_trie_string_tokenize_multiple(regular_form);
            SubLObject key = (SubLObject)nl_trie.NIL;
            key = cdolist_list_var.first();
            while (nl_trie.NIL != cdolist_list_var) {
                add_or_remove_nl_trie_word(v_nl_trie, key, nl_trie_word, remove_this_oneP);
                cdolist_list_var = cdolist_list_var.rest();
                key = cdolist_list_var.first();
            }
            if (nl_trie.NIL == remove_this_oneP) {
                final SubLObject new_mod_list = find_mod_list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(regular_form), spp_pred)), assertion_mt);
                update_nl_trie_semantic_on_wu(wu, v_nl_trie, assertion_mt, remove_this_oneP, new_mod_list);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_trie.$list343);
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 114844L)
    public static SubLObject find_mod_list(final SubLObject str_pred_list, final SubLObject assertion_mt) {
        SubLObject mod_list = (SubLObject)nl_trie.NIL;
        SubLObject cdolist_list_var = str_pred_list;
        SubLObject str_pred_pair = (SubLObject)nl_trie.NIL;
        str_pred_pair = cdolist_list_var.first();
        while (nl_trie.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = str_pred_pair;
            SubLObject mod_str_list = (SubLObject)nl_trie.NIL;
            SubLObject pred = (SubLObject)nl_trie.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list344);
            mod_str_list = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list344);
            pred = current.first();
            current = current.rest();
            if (nl_trie.NIL == current) {
                mod_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(mod_str_list, pred, assertion_mt), mod_list);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_trie.$list344);
            }
            cdolist_list_var = cdolist_list_var.rest();
            str_pred_pair = cdolist_list_var.first();
        }
        return mod_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 115112L)
    public static SubLObject nl_triefy_pos_assertion(final SubLObject assertion, final SubLObject v_nl_trie, final SubLObject removeP) {
        SubLObject current;
        final SubLObject datum = current = assertions_high.gaf_args(assertion);
        SubLObject word = (SubLObject)nl_trie.NIL;
        SubLObject pos = (SubLObject)nl_trie.NIL;
        SubLObject v_cycl_string = (SubLObject)nl_trie.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list345);
        word = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list345);
        pos = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list345);
        v_cycl_string = current.first();
        current = current.rest();
        if (nl_trie.NIL == current) {
            final SubLObject string = cycl_string.cycl_string_to_utf8_string(v_cycl_string);
            final SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
            final SubLObject mod_list = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(string), pos, assertion_mt));
            final SubLObject nl_trie_word = new_nl_trie_word_for_syntactic_support(assertion);
            SubLObject cdolist_list_var = nl_trie_string_tokenize_multiple(string);
            SubLObject key = (SubLObject)nl_trie.NIL;
            key = cdolist_list_var.first();
            while (nl_trie.NIL != cdolist_list_var) {
                add_or_remove_nl_trie_word(v_nl_trie, key, nl_trie_word, removeP);
                cdolist_list_var = cdolist_list_var.rest();
                key = cdolist_list_var.first();
            }
            update_nl_trie_semantic_on_wu(word, v_nl_trie, assertion_mt, removeP, mod_list);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_trie.$list345);
        }
        return nl_trie_return_keyword(removeP, (SubLObject)nl_trie.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 116361L)
    public static SubLObject update_nl_trie_semantic_on_wu(final SubLObject wu, final SubLObject v_nl_trie, final SubLObject syntactic_mt, final SubLObject removeP, SubLObject mod_list) {
        if (mod_list == nl_trie.UNPROVIDED) {
            mod_list = (SubLObject)nl_trie.NIL;
        }
        SubLObject cdolist_list_var;
        final SubLObject semantic_preds_to_use = cdolist_list_var = Sequences.remove_duplicates(ConsesLow.append(nl_trie_arg_in_reln_predicates(), nl_trie_denotation_predicates(), nl_trie_semtrans_predicates()), (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
        SubLObject pred = (SubLObject)nl_trie.NIL;
        pred = cdolist_list_var.first();
        while (nl_trie.NIL != cdolist_list_var) {
            update_nl_trie_semantic_on_wu_for_pred(wu, v_nl_trie, syntactic_mt, removeP, mod_list, pred);
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        }
        return nl_trie_return_keyword(removeP, (SubLObject)nl_trie.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 117620L)
    public static SubLObject update_nl_trie_semantic_on_wu_for_pred(final SubLObject wu, final SubLObject v_nl_trie, final SubLObject syntactic_mt, final SubLObject removeP, SubLObject mod_list, final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject word_index = lexicon_utilities.wu_arg_of_pred_cached(pred);
        final SubLObject pos_index = lexicon_utilities.pos_arg_of_pred_cached(pred);
        final SubLObject pos = nl_trie_pos_for_semtrans_pred(pred, (SubLObject)nl_trie.UNPROVIDED);
        if (nl_trie.NIL != lexicon_accessors.speech_partP(pos, (SubLObject)nl_trie.UNPROVIDED)) {
            mod_list = filter_mod_list_for_pos(mod_list, pos);
        }
        if (nl_trie.NIL != mod_list) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)nl_trie.$sym53$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(nl_trie.$const54$EverythingPSC, thread);
                if (nl_trie.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(wu, word_index, pred)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(wu, word_index, pred);
                    SubLObject done_var = (SubLObject)nl_trie.NIL;
                    final SubLObject token_var = (SubLObject)nl_trie.NIL;
                    while (nl_trie.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (nl_trie.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)nl_trie.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)nl_trie.$kw326$GAF, (SubLObject)nl_trie.$kw327$TRUE, (SubLObject)nl_trie.NIL);
                                SubLObject done_var_$78 = (SubLObject)nl_trie.NIL;
                                final SubLObject token_var_$79 = (SubLObject)nl_trie.NIL;
                                while (nl_trie.NIL == done_var_$78) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$79);
                                    final SubLObject valid_$80 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$79.eql(assertion));
                                    if (nl_trie.NIL != valid_$80) {
                                        update_nl_trie_semantic_assertion(assertion, syntactic_mt, pos_index, mod_list, v_nl_trie, removeP);
                                    }
                                    done_var_$78 = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL == valid_$80);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$81 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nl_trie.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (nl_trie.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$81, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL == valid);
                    }
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return pred;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 118199L)
    public static SubLObject update_nl_trie_semantic_assertion(final SubLObject assertion, final SubLObject syntactic_mt, final SubLObject pos_index, final SubLObject mod_list, final SubLObject v_nl_trie, final SubLObject removeP) {
        if (nl_trie.NIL != ok_assertion_for_nl_trieP(assertion) && (nl_trie.NIL != lexicon_accessors.genl_lexicon_mtP(assertions_high.assertion_mt(assertion), syntactic_mt) || nl_trie.NIL != lexicon_accessors.genl_lexicon_mtP(syntactic_mt, assertions_high.assertion_mt(assertion)))) {
            if (nl_trie.NIL != pos_index) {
                final SubLObject this_pos = assertions_high.gaf_arg(assertion, pos_index);
                final SubLObject new_mod_list = filter_mod_list_for_pos(mod_list, this_pos);
                if (nl_trie.NIL != new_mod_list) {
                    update_nl_trie_semantic(assertion, v_nl_trie, removeP, new_mod_list);
                }
            }
            else {
                update_nl_trie_semantic(assertion, v_nl_trie, removeP, mod_list);
            }
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 118810L)
    public static SubLObject clear_nl_trie_pos_for_semtrans_pred() {
        final SubLObject cs = nl_trie.$nl_trie_pos_for_semtrans_pred_caching_state$.getGlobalValue();
        if (nl_trie.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 118810L)
    public static SubLObject remove_nl_trie_pos_for_semtrans_pred(final SubLObject pred, SubLObject mt) {
        if (mt == nl_trie.UNPROVIDED) {
            mt = nl_trie.$nl_trie_lexical_mt$.getGlobalValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args(nl_trie.$nl_trie_pos_for_semtrans_pred_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(pred, mt), (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 118810L)
    public static SubLObject nl_trie_pos_for_semtrans_pred_internal(final SubLObject pred, final SubLObject mt) {
        return lexicon_accessors.semtrans_pred_to_pos(pred, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 118810L)
    public static SubLObject nl_trie_pos_for_semtrans_pred(final SubLObject pred, SubLObject mt) {
        if (mt == nl_trie.UNPROVIDED) {
            mt = nl_trie.$nl_trie_lexical_mt$.getGlobalValue();
        }
        SubLObject caching_state = nl_trie.$nl_trie_pos_for_semtrans_pred_caching_state$.getGlobalValue();
        if (nl_trie.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)nl_trie.$sym346$NL_TRIE_POS_FOR_SEMTRANS_PRED, (SubLObject)nl_trie.$sym347$_NL_TRIE_POS_FOR_SEMTRANS_PRED_CACHING_STATE_, (SubLObject)nl_trie.$int348$128, (SubLObject)nl_trie.EQL, (SubLObject)nl_trie.TWO_INTEGER, (SubLObject)nl_trie.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pred, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)nl_trie.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)nl_trie.NIL;
            collision = cdolist_list_var.first();
            while (nl_trie.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (nl_trie.NIL != cached_args && nl_trie.NIL == cached_args.rest() && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(nl_trie_pos_for_semtrans_pred_internal(pred, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(pred, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 118973L)
    public static SubLObject filter_mod_list_for_pos(final SubLObject mod_list, final SubLObject pos) {
        SubLObject new_mod_list = (SubLObject)nl_trie.NIL;
        SubLObject cdolist_list_var = mod_list;
        SubLObject item = (SubLObject)nl_trie.NIL;
        item = cdolist_list_var.first();
        while (nl_trie.NIL != cdolist_list_var) {
            final SubLObject constraint = conses_high.second(item);
            SubLObject okP = (SubLObject)nl_trie.NIL;
            if (nl_trie.NIL != fort_types_interface.collection_p(constraint)) {
                okP = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL != lexicon_accessors.genl_posP(constraint, pos, (SubLObject)nl_trie.UNPROVIDED) || nl_trie.NIL != lexicon_accessors.genl_posP(pos, constraint, (SubLObject)nl_trie.UNPROVIDED));
            }
            else if (nl_trie.NIL != fort_types_interface.predicate_p(constraint)) {
                okP = nl_trie_pred_ok_for_posP(constraint, pos);
            }
            if (nl_trie.NIL != okP) {
                new_mod_list = (SubLObject)ConsesLow.cons(item, new_mod_list);
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        return new_mod_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 119504L)
    public static SubLObject clear_nl_trie_pred_ok_for_posP() {
        final SubLObject cs = nl_trie.$nl_trie_pred_ok_for_posP_caching_state$.getGlobalValue();
        if (nl_trie.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 119504L)
    public static SubLObject remove_nl_trie_pred_ok_for_posP(final SubLObject pred, final SubLObject pos) {
        return memoization_state.caching_state_remove_function_results_with_args(nl_trie.$nl_trie_pred_ok_for_posP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(pred, pos), (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 119504L)
    public static SubLObject nl_trie_pred_ok_for_posP_internal(final SubLObject pred, final SubLObject pos) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pred.eql(nl_trie.$const140$partOfSpeech) || nl_trie.NIL != conses_high.member(pos, nl_trie_pos_of_pred(pred), (SubLObject)nl_trie.$sym350$GENL_POS_, (SubLObject)nl_trie.UNPROVIDED) || nl_trie.NIL != conses_high.member(pred, nl_trie_preds_licensed_by_pos(pos), (SubLObject)nl_trie.$sym351$GENL_POS_PRED_, (SubLObject)nl_trie.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 119504L)
    public static SubLObject nl_trie_pred_ok_for_posP(final SubLObject pred, final SubLObject pos) {
        SubLObject caching_state = nl_trie.$nl_trie_pred_ok_for_posP_caching_state$.getGlobalValue();
        if (nl_trie.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)nl_trie.$sym349$NL_TRIE_PRED_OK_FOR_POS_, (SubLObject)nl_trie.$sym352$_NL_TRIE_PRED_OK_FOR_POS__CACHING_STATE_, (SubLObject)nl_trie.$int353$1024, (SubLObject)nl_trie.EQL, (SubLObject)nl_trie.TWO_INTEGER, (SubLObject)nl_trie.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pred, pos);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)nl_trie.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)nl_trie.NIL;
            collision = cdolist_list_var.first();
            while (nl_trie.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (nl_trie.NIL != cached_args && nl_trie.NIL == cached_args.rest() && pos.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(nl_trie_pred_ok_for_posP_internal(pred, pos)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(pred, pos));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 119759L)
    public static SubLObject clear_nl_trie_preds_licensed_by_pos() {
        final SubLObject cs = nl_trie.$nl_trie_preds_licensed_by_pos_caching_state$.getGlobalValue();
        if (nl_trie.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 119759L)
    public static SubLObject remove_nl_trie_preds_licensed_by_pos(final SubLObject pos) {
        return memoization_state.caching_state_remove_function_results_with_args(nl_trie.$nl_trie_preds_licensed_by_pos_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(pos), (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 119759L)
    public static SubLObject nl_trie_preds_licensed_by_pos_internal(final SubLObject pos) {
        return conses_high.intersection(nl_trie_preds_of_pos(pos), lexicon_utilities.preds_licensed_by_pos(pos), (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 119759L)
    public static SubLObject nl_trie_preds_licensed_by_pos(final SubLObject pos) {
        SubLObject caching_state = nl_trie.$nl_trie_preds_licensed_by_pos_caching_state$.getGlobalValue();
        if (nl_trie.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)nl_trie.$sym354$NL_TRIE_PREDS_LICENSED_BY_POS, (SubLObject)nl_trie.$sym355$_NL_TRIE_PREDS_LICENSED_BY_POS_CACHING_STATE_, (SubLObject)nl_trie.$int340$256, (SubLObject)nl_trie.EQL, (SubLObject)nl_trie.ONE_INTEGER, (SubLObject)nl_trie.$int356$32);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pos, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(nl_trie_preds_licensed_by_pos_internal(pos)));
            memoization_state.caching_state_put(caching_state, pos, results, (SubLObject)nl_trie.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 120093L)
    public static SubLObject update_nl_trie_semantic(final SubLObject assertion, SubLObject v_nl_trie, SubLObject removeP, SubLObject mod_list) {
        if (v_nl_trie == nl_trie.UNPROVIDED) {
            v_nl_trie = nl_trie.$nl_trie$.getGlobalValue();
        }
        if (removeP == nl_trie.UNPROVIDED) {
            removeP = (SubLObject)nl_trie.NIL;
        }
        if (mod_list == nl_trie.UNPROVIDED) {
            mod_list = (SubLObject)nl_trie.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (nl_trie.NIL == nl_trie_ok_trie_and_assertionP(v_nl_trie, assertion)) {
            return nl_trie_return_keyword(removeP, (SubLObject)nl_trie.NIL);
        }
        final SubLObject pred = assertions_high.gaf_arg0(assertion);
        final SubLObject desired_result = nl_trie_return_keyword(removeP, (SubLObject)nl_trie.T);
        SubLObject result = (SubLObject)nl_trie.NIL;
        SubLObject strings = (SubLObject)nl_trie.NIL;
        SubLObject release = (SubLObject)nl_trie.NIL;
        try {
            release = Locks.seize_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
            final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
            try {
                file_vector_utilities.$file_vector_backed_map_read_lock$.bind(nl_trie.$nl_trie_lock$.getGlobalValue(), thread);
                if (pred.eql(nl_trie.$const15$termPhrases)) {
                    thread.resetMultipleValues();
                    final SubLObject result_$82 = nl_triefy_term_phrases_assertion(assertion, v_nl_trie, removeP);
                    final SubLObject strings_$83 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    result = result_$82;
                    strings = strings_$83;
                }
                else if (nl_trie.NIL != conses_high.member(pred, nl_trie_denotation_predicates(), (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED)) {
                    thread.resetMultipleValues();
                    final SubLObject result_$83 = nl_triefy_semantic_assertion(assertion, v_nl_trie, removeP, mod_list);
                    final SubLObject strings_$84 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    result = result_$83;
                    strings = strings_$84;
                }
                else if (nl_trie.NIL != conses_high.member(pred, nl_trie_semtrans_predicates(), (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED)) {
                    thread.resetMultipleValues();
                    final SubLObject result_$84 = nl_triefy_semantic_assertion(assertion, v_nl_trie, removeP, mod_list);
                    final SubLObject strings_$85 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    result = result_$84;
                    strings = strings_$85;
                }
                else if (nl_trie.NIL != nl_trie_name_string_predP(pred)) {
                    thread.resetMultipleValues();
                    final SubLObject result_$85 = nl_triefy_name_string(assertion, v_nl_trie, removeP);
                    final SubLObject strings_$86 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    result = result_$85;
                    strings = strings_$86;
                }
                else if (nl_trie.NIL != conses_high.member(pred, nl_trie_arg_in_reln_predicates(), (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED)) {
                    thread.resetMultipleValues();
                    final SubLObject result_$86 = nl_triefy_arg_in_reln_assertion(assertion, v_nl_trie, removeP, mod_list);
                    final SubLObject strings_$87 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    result = result_$86;
                    strings = strings_$87;
                }
            }
            finally {
                file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            if (nl_trie.NIL != release) {
                Locks.release_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
            }
        }
        return Values.values(nl_trie_return_keyword(removeP, Equality.eql(result, desired_result)), strings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 122374L)
    public static SubLObject nl_triefy_semantic_assertion(final SubLObject assertion, final SubLObject v_nl_trie, final SubLObject removeP, final SubLObject mod_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject formula = assertions_high.gaf_formula(assertion);
        final SubLObject desired_result = nl_trie_return_keyword(removeP, (SubLObject)nl_trie.T);
        SubLObject successP = (SubLObject)nl_trie.NIL;
        SubLObject error_message = (SubLObject)nl_trie.NIL;
        SubLObject entries = (SubLObject)nl_trie.NIL;
        SubLObject strings = (SubLObject)nl_trie.NIL;
        if (nl_trie.NIL != nl_trie.$catch_nl_trie_errorsP$.getDynamicValue(thread)) {
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)nl_trie.$sym330$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        thread.resetMultipleValues();
                        final SubLObject leading_strings = nl_trie_get_morpho_syntax_from_formula(formula);
                        final SubLObject wu = thread.secondMultipleValue();
                        final SubLObject following_strings = thread.thirdMultipleValue();
                        final SubLObject pos = thread.fourthMultipleValue();
                        thread.resetMultipleValues();
                        if (nl_trie.NIL != mod_list) {
                            entries = semantic_update_triggered_by_syntactic_update_new(wu, assertion, mod_list);
                        }
                        else {
                            entries = semantic_update_triggered_by_incremental_semantic_update_new(wu, assertion, pos);
                        }
                        SubLObject cdolist_list_var = entries;
                        SubLObject entry = (SubLObject)nl_trie.NIL;
                        entry = cdolist_list_var.first();
                        while (nl_trie.NIL != cdolist_list_var) {
                            final SubLObject head_string = nl_trie_word_head_string(entry);
                            final SubLObject big_string = nl_trie_assemble_strings(leading_strings, head_string, following_strings);
                            SubLObject cdolist_list_var_$92;
                            final SubLObject keys = cdolist_list_var_$92 = nl_trie_string_tokenize_multiple(big_string);
                            SubLObject key = (SubLObject)nl_trie.NIL;
                            key = cdolist_list_var_$92.first();
                            while (nl_trie.NIL != cdolist_list_var_$92) {
                                final SubLObject result = add_or_remove_nl_trie_word(v_nl_trie, key, entry, removeP);
                                if (desired_result.eql(result)) {
                                    final SubLObject item_var = big_string;
                                    if (nl_trie.NIL == conses_high.member(item_var, strings, Symbols.symbol_function((SubLObject)nl_trie.EQL), Symbols.symbol_function((SubLObject)nl_trie.IDENTITY))) {
                                        strings = (SubLObject)ConsesLow.cons(item_var, strings);
                                    }
                                    successP = (SubLObject)nl_trie.T;
                                }
                                cdolist_list_var_$92 = cdolist_list_var_$92.rest();
                                key = cdolist_list_var_$92.first();
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            entry = cdolist_list_var.first();
                        }
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)nl_trie.NIL);
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
        }
        else {
            thread.resetMultipleValues();
            final SubLObject leading_strings2 = nl_trie_get_morpho_syntax_from_formula(formula);
            final SubLObject wu2 = thread.secondMultipleValue();
            final SubLObject following_strings2 = thread.thirdMultipleValue();
            final SubLObject pos2 = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            if (nl_trie.NIL != mod_list) {
                entries = semantic_update_triggered_by_syntactic_update_new(wu2, assertion, mod_list);
            }
            else {
                entries = semantic_update_triggered_by_incremental_semantic_update_new(wu2, assertion, pos2);
            }
            SubLObject cdolist_list_var2 = entries;
            SubLObject entry2 = (SubLObject)nl_trie.NIL;
            entry2 = cdolist_list_var2.first();
            while (nl_trie.NIL != cdolist_list_var2) {
                final SubLObject head_string2 = nl_trie_word_head_string(entry2);
                final SubLObject big_string2 = nl_trie_assemble_strings(leading_strings2, head_string2, following_strings2);
                SubLObject cdolist_list_var_$93;
                final SubLObject keys2 = cdolist_list_var_$93 = nl_trie_string_tokenize_multiple(big_string2);
                SubLObject key2 = (SubLObject)nl_trie.NIL;
                key2 = cdolist_list_var_$93.first();
                while (nl_trie.NIL != cdolist_list_var_$93) {
                    final SubLObject result2 = add_or_remove_nl_trie_word(v_nl_trie, key2, entry2, removeP);
                    if (desired_result.eql(result2)) {
                        final SubLObject item_var2 = big_string2;
                        if (nl_trie.NIL == conses_high.member(item_var2, strings, Symbols.symbol_function((SubLObject)nl_trie.EQL), Symbols.symbol_function((SubLObject)nl_trie.IDENTITY))) {
                            strings = (SubLObject)ConsesLow.cons(item_var2, strings);
                        }
                        successP = (SubLObject)nl_trie.T;
                    }
                    cdolist_list_var_$93 = cdolist_list_var_$93.rest();
                    key2 = cdolist_list_var_$93.first();
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                entry2 = cdolist_list_var2.first();
            }
        }
        if (error_message.isString()) {
            successP = (SubLObject)nl_trie.NIL;
            nl_trie_warn((SubLObject)nl_trie.ONE_INTEGER, (SubLObject)nl_trie.$str357$Caught_error_in_NL_TRIEFY_SEMANTI, assertion, error_message, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
        }
        if (nl_trie.NIL == successP) {
            if (nl_trie.NIL != removeP) {
                nl_trie_warn_bad_remove(assertion);
            }
            else {
                nl_trie_warn_bad_add(assertion);
            }
        }
        return Values.values(nl_trie_return_keyword(removeP, successP), strings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 125068L)
    public static SubLObject nl_triefy_term_phrases_assertion(final SubLObject assertion, final SubLObject v_nl_trie, final SubLObject removeP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject formula = assertions_high.gaf_formula(assertion);
        final SubLObject string = cycl_string.cycl_string_to_utf8_string(cycl_utilities.formula_arg3(formula, (SubLObject)nl_trie.UNPROVIDED));
        final SubLObject desired_result = nl_trie_return_keyword(removeP, (SubLObject)nl_trie.T);
        SubLObject successP = (SubLObject)nl_trie.T;
        SubLObject error_message = (SubLObject)nl_trie.NIL;
        if (nl_trie.NIL != nl_trie.$catch_nl_trie_errorsP$.getDynamicValue(thread)) {
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)nl_trie.$sym330$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        SubLObject cdolist_list_var = nl_trie_string_tokenize_multiple(string);
                        SubLObject key = (SubLObject)nl_trie.NIL;
                        key = cdolist_list_var.first();
                        while (nl_trie.NIL != cdolist_list_var) {
                            final SubLObject result = add_or_remove_term_phrases_entry(v_nl_trie, key, assertion, removeP);
                            if (!desired_result.eql(result)) {
                                successP = (SubLObject)nl_trie.NIL;
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            key = cdolist_list_var.first();
                        }
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)nl_trie.NIL);
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
        }
        else {
            SubLObject cdolist_list_var2 = nl_trie_string_tokenize_multiple(string);
            SubLObject key2 = (SubLObject)nl_trie.NIL;
            key2 = cdolist_list_var2.first();
            while (nl_trie.NIL != cdolist_list_var2) {
                final SubLObject result2 = add_or_remove_term_phrases_entry(v_nl_trie, key2, assertion, removeP);
                if (!desired_result.eql(result2)) {
                    successP = (SubLObject)nl_trie.NIL;
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                key2 = cdolist_list_var2.first();
            }
        }
        if (error_message.isString()) {
            successP = (SubLObject)nl_trie.NIL;
            nl_trie_warn((SubLObject)nl_trie.ONE_INTEGER, (SubLObject)nl_trie.$str357$Caught_error_in_NL_TRIEFY_SEMANTI, assertion, error_message, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
        }
        if (nl_trie.NIL == successP) {
            if (nl_trie.NIL != removeP) {
                nl_trie_warn_bad_remove(assertion);
            }
            else {
                nl_trie_warn_bad_add(assertion);
            }
        }
        return Values.values(nl_trie_return_keyword(removeP, successP), (SubLObject)ConsesLow.list(string));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 126066L)
    public static SubLObject add_or_remove_term_phrases_entry(final SubLObject v_nl_trie, final SubLObject key, final SubLObject entry, final SubLObject removeP) {
        if (nl_trie.NIL != removeP) {
            return nl_trie_remove_term_phrases_entry(v_nl_trie, key, entry);
        }
        return nl_trie_insert_term_phrases_entry(v_nl_trie, key, entry);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 126295L)
    public static SubLObject nl_trie_insert_term_phrases_entry(final SubLObject v_nl_trie, final SubLObject key, final SubLObject new_entry) {
        nl_trie_insert_low(v_nl_trie, key, new_entry);
        return (SubLObject)nl_trie.$kw145$ADDED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 126636L)
    public static SubLObject nl_trie_remove_term_phrases_entry(final SubLObject v_nl_trie, final SubLObject key, final SubLObject entry) {
        nl_trie_unassociate(key, entry, v_nl_trie);
        return (SubLObject)nl_trie.$kw145$ADDED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 126970L)
    public static SubLObject nl_trie_get_morpho_syntax_from_formula(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject leading_strings = lexicon_utilities.parse_lexical_semantic_formula(formula, (SubLObject)nl_trie.UNPROVIDED);
        final SubLObject wu = thread.secondMultipleValue();
        final SubLObject following_strings = thread.thirdMultipleValue();
        SubLObject pos = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (nl_trie.NIL == lexicon_accessors.speech_partP(pos, (SubLObject)nl_trie.UNPROVIDED) && nl_trie.NIL != subl_promotions.memberP(cycl_utilities.formula_arg0(formula), nl_trie_semtrans_predicates(), (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED)) {
            pos = nl_trie_pos_for_semtrans_pred(cycl_utilities.formula_arg0(formula), (SubLObject)nl_trie.UNPROVIDED);
        }
        return Values.values(unicode_nauts.convert_unicode_nauts_to_utf8_strings(leading_strings), wu, unicode_nauts.convert_unicode_nauts_to_utf8_strings(following_strings), pos);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 127486L)
    public static SubLObject nl_trie_semantic_support_pos(final SubLObject sem_support) {
        if (nl_trie.NIL != assertion_handles.assertion_p(sem_support)) {
            final SubLObject formula = uncanonicalizer.assertion_el_formula(sem_support);
            return Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)nl_trie.THREE_INTEGER), nl_trie_get_morpho_syntax_from_formula(formula));
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 127728L)
    public static SubLObject semantic_update_triggered_by_syntactic_update_new(final SubLObject wu, final SubLObject semantic_as, final SubLObject mod_list) {
        SubLObject words = (SubLObject)nl_trie.NIL;
        final SubLObject sem_pred = assertions_high.gaf_arg0(semantic_as);
        final SubLObject pos_arg = lexicon_utilities.pos_arg_of_pred_cached(sem_pred);
        final SubLObject pos = pos_arg.isInteger() ? assertions_high.gaf_arg(semantic_as, pos_arg) : nl_trie_pos_for_semtrans_pred(sem_pred, (SubLObject)nl_trie.UNPROVIDED);
        if (nl_trie.NIL != lexicon_accessors.speech_partP(pos, (SubLObject)nl_trie.UNPROVIDED)) {
            SubLObject cdolist_list_var = mod_list;
            SubLObject mod_tuple = (SubLObject)nl_trie.NIL;
            mod_tuple = cdolist_list_var.first();
            while (nl_trie.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = mod_tuple;
                SubLObject string_list = (SubLObject)nl_trie.NIL;
                SubLObject constraint = (SubLObject)nl_trie.NIL;
                SubLObject mt = (SubLObject)nl_trie.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list358);
                string_list = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list358);
                constraint = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list358);
                mt = current.first();
                current = current.rest();
                if (nl_trie.NIL == current) {
                    final SubLObject pred = (nl_trie.NIL != fort_types_interface.predicate_p(constraint)) ? constraint : nl_trie.$const140$partOfSpeech;
                    SubLObject cdolist_list_var_$94 = string_list;
                    SubLObject string = (SubLObject)nl_trie.NIL;
                    string = cdolist_list_var_$94.first();
                    while (nl_trie.NIL != cdolist_list_var_$94) {
                        final SubLObject sentence = make_nl_trie_syntactic_support_sentence(pred, wu, pos, string);
                        final SubLObject syntactic_support = find_or_create_nl_trie_word_syn_support(sentence, mt, string);
                        final SubLObject entry = new_nl_trie_word(set_utilities.new_singleton_set(syntactic_support, Symbols.symbol_function((SubLObject)nl_trie.EQUALP)), set_utilities.new_singleton_set(semantic_as, Symbols.symbol_function((SubLObject)nl_trie.EQUALP)));
                        words = (SubLObject)ConsesLow.cons(entry, words);
                        cdolist_list_var_$94 = cdolist_list_var_$94.rest();
                        string = cdolist_list_var_$94.first();
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_trie.$list358);
                }
                cdolist_list_var = cdolist_list_var.rest();
                mod_tuple = cdolist_list_var.first();
            }
        }
        return words;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 128865L)
    public static SubLObject make_nl_trie_syntactic_support_sentence(final SubLObject pred, final SubLObject wu, final SubLObject pos, final SubLObject string) {
        if (pred.eql(nl_trie.$const140$partOfSpeech)) {
            return el_utilities.make_ternary_formula(pred, wu, pos, string);
        }
        return el_utilities.make_binary_formula(pred, wu, string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 129083L)
    public static SubLObject semantic_update_triggered_by_incremental_semantic_update_new(final SubLObject wu, final SubLObject semantic_as, final SubLObject pos) {
        final SubLObject preds = nl_trie_syntactic_preds_for_pos(pos);
        if (nl_trie.NIL != preds) {
            return inc_sem_from_preds_new(preds, wu, semantic_as);
        }
        return inc_sem_from_pos_new(pos, wu, semantic_as);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 129800L)
    public static SubLObject inc_sem_from_preds_new(final SubLObject preds, final SubLObject wu, final SubLObject semantic_as) {
        SubLObject words = (SubLObject)nl_trie.NIL;
        final SubLObject assertion_mt = assertions_high.assertion_mt(semantic_as);
        SubLObject cdolist_list_var;
        final SubLObject syntactic_supports = cdolist_list_var = inc_sem_from_preds_syntactic_supports(preds, wu, assertion_mt);
        SubLObject syntactic_support = (SubLObject)nl_trie.NIL;
        syntactic_support = cdolist_list_var.first();
        while (nl_trie.NIL != cdolist_list_var) {
            final SubLObject entry = new_nl_trie_word(set_utilities.new_singleton_set(syntactic_support, Symbols.symbol_function((SubLObject)nl_trie.EQUALP)), set_utilities.new_singleton_set(semantic_as, Symbols.symbol_function((SubLObject)nl_trie.EQUALP)));
            words = (SubLObject)ConsesLow.cons(entry, words);
            cdolist_list_var = cdolist_list_var.rest();
            syntactic_support = cdolist_list_var.first();
        }
        if (nl_trie.NIL == words) {
            nl_trie_warn((SubLObject)nl_trie.TWO_INTEGER, (SubLObject)nl_trie.$str359$Couldn_t_find_any_string_nl_trie_, wu, preds, assertion_mt, (SubLObject)nl_trie.UNPROVIDED);
        }
        return words;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 130611L)
    public static SubLObject inc_sem_from_preds_syntactic_supports(final SubLObject preds, final SubLObject wu, final SubLObject assertion_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject syntactic_supports = (SubLObject)nl_trie.NIL;
        SubLObject cdolist_list_var = preds;
        SubLObject pred = (SubLObject)nl_trie.NIL;
        pred = cdolist_list_var.first();
        while (nl_trie.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$95;
            final SubLObject supported_wu_strings = cdolist_list_var_$95 = nl_trie_strings_of_word_unit(wu, (SubLObject)ConsesLow.list(pred), assertion_mt, (SubLObject)nl_trie.T);
            SubLObject supported_wu_string = (SubLObject)nl_trie.NIL;
            supported_wu_string = cdolist_list_var_$95.first();
            while (nl_trie.NIL != cdolist_list_var_$95) {
                SubLObject current;
                final SubLObject datum = current = supported_wu_string;
                SubLObject wu_string = (SubLObject)nl_trie.NIL;
                SubLObject supports = (SubLObject)nl_trie.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list360);
                wu_string = current.first();
                current = (supports = current.rest());
                SubLObject support = (SubLObject)nl_trie.NIL;
                if (nl_trie.NIL == support) {
                    SubLObject csome_list_var = supports;
                    SubLObject this_support = (SubLObject)nl_trie.NIL;
                    this_support = csome_list_var.first();
                    while (nl_trie.NIL == support && nl_trie.NIL != csome_list_var) {
                        if (nl_trie.NIL != nl_trie_syntactic_support_p(this_support) && nl_trie_syntactic_support_string(this_support).equalp(wu_string)) {
                            support = this_support;
                        }
                        csome_list_var = csome_list_var.rest();
                        this_support = csome_list_var.first();
                    }
                }
                if (nl_trie.NIL == support) {
                    final SubLObject sentence = el_utilities.make_binary_formula(pred, wu, wu_string);
                    support = find_or_create_nl_trie_word_syn_support(sentence, assertion_mt, wu_string);
                }
                final SubLObject item_var = support;
                if (nl_trie.NIL == conses_high.member(item_var, syntactic_supports, Symbols.symbol_function((SubLObject)nl_trie.EQL), Symbols.symbol_function((SubLObject)nl_trie.IDENTITY))) {
                    syntactic_supports = (SubLObject)ConsesLow.cons(item_var, syntactic_supports);
                }
                cdolist_list_var_$95 = cdolist_list_var_$95.rest();
                supported_wu_string = cdolist_list_var_$95.first();
            }
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(nl_trie.$nl_trie_lexical_mt$.getGlobalValue());
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject pred_var = pred;
                if (nl_trie.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(wu, (SubLObject)nl_trie.ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(wu, (SubLObject)nl_trie.ONE_INTEGER, pred_var);
                    SubLObject done_var = (SubLObject)nl_trie.NIL;
                    final SubLObject token_var = (SubLObject)nl_trie.NIL;
                    while (nl_trie.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (nl_trie.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)nl_trie.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)nl_trie.$kw326$GAF, (SubLObject)nl_trie.$kw327$TRUE, (SubLObject)nl_trie.NIL);
                                SubLObject done_var_$96 = (SubLObject)nl_trie.NIL;
                                final SubLObject token_var_$97 = (SubLObject)nl_trie.NIL;
                                while (nl_trie.NIL == done_var_$96) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$97);
                                    final SubLObject valid_$98 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$97.eql(assertion));
                                    if (nl_trie.NIL != valid_$98) {
                                        final SubLObject string = lexicon_utilities.spp_assertion_string(assertion);
                                        final SubLObject mt = assertions_high.assertion_mt(assertion);
                                        SubLObject str_pred_list = find_morphologically_derivable_strings(wu, string, pred, mt);
                                        if (nl_trie.NIL != lexicon_accessors.genl_lexicon_mtP(mt, assertion_mt) && !mt.eql(assertion_mt)) {
                                            final SubLObject item_var2 = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(string), pred);
                                            if (nl_trie.NIL == conses_high.member(item_var2, str_pred_list, Symbols.symbol_function((SubLObject)nl_trie.EQL), Symbols.symbol_function((SubLObject)nl_trie.IDENTITY))) {
                                                str_pred_list = (SubLObject)ConsesLow.cons(item_var2, str_pred_list);
                                            }
                                            SubLObject cdolist_list_var_$96 = str_pred_list;
                                            SubLObject str_pred_pair = (SubLObject)nl_trie.NIL;
                                            str_pred_pair = cdolist_list_var_$96.first();
                                            while (nl_trie.NIL != cdolist_list_var_$96) {
                                                SubLObject current2;
                                                final SubLObject datum2 = current2 = str_pred_pair;
                                                SubLObject each_str_list = (SubLObject)nl_trie.NIL;
                                                SubLObject each_pred = (SubLObject)nl_trie.NIL;
                                                cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)nl_trie.$list361);
                                                each_str_list = current2.first();
                                                current2 = current2.rest();
                                                cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)nl_trie.$list361);
                                                each_pred = current2.first();
                                                current2 = current2.rest();
                                                if (nl_trie.NIL == current2) {
                                                    SubLObject cdolist_list_var_$97 = each_str_list;
                                                    SubLObject pred_string = (SubLObject)nl_trie.NIL;
                                                    pred_string = cdolist_list_var_$97.first();
                                                    while (nl_trie.NIL != cdolist_list_var_$97) {
                                                        final SubLObject sentence2 = el_utilities.make_binary_formula(each_pred, wu, pred_string);
                                                        final SubLObject item_var3;
                                                        final SubLObject support2 = item_var3 = find_or_create_nl_trie_word_syn_support(sentence2, mt, pred_string);
                                                        if (nl_trie.NIL == conses_high.member(item_var3, syntactic_supports, Symbols.symbol_function((SubLObject)nl_trie.EQL), Symbols.symbol_function((SubLObject)nl_trie.IDENTITY))) {
                                                            syntactic_supports = (SubLObject)ConsesLow.cons(item_var3, syntactic_supports);
                                                        }
                                                        cdolist_list_var_$97 = cdolist_list_var_$97.rest();
                                                        pred_string = cdolist_list_var_$97.first();
                                                    }
                                                }
                                                else {
                                                    cdestructuring_bind.cdestructuring_bind_error(datum2, (SubLObject)nl_trie.$list361);
                                                }
                                                cdolist_list_var_$96 = cdolist_list_var_$96.rest();
                                                str_pred_pair = cdolist_list_var_$96.first();
                                            }
                                        }
                                    }
                                    done_var_$96 = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL == valid_$98);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$101 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nl_trie.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (nl_trie.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$101, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL == valid);
                    }
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        }
        return syntactic_supports;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 132876L)
    public static SubLObject inc_sem_from_pos_new(final SubLObject pos, final SubLObject wu, final SubLObject semantic_assertion) {
        final SubLObject assertion_mt = assertions_high.assertion_mt(semantic_assertion);
        SubLObject words = (SubLObject)nl_trie.NIL;
        SubLObject cdolist_list_var = find_string_mt_pairs_for_closed_class_word(wu, pos, assertion_mt);
        SubLObject pair = (SubLObject)nl_trie.NIL;
        pair = cdolist_list_var.first();
        while (nl_trie.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject string = (SubLObject)nl_trie.NIL;
            SubLObject mt = (SubLObject)nl_trie.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list362);
            string = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list362);
            mt = current.first();
            current = current.rest();
            if (nl_trie.NIL == current) {
                final SubLObject sentence = el_utilities.make_ternary_formula(nl_trie.$const140$partOfSpeech, wu, pos, string);
                final SubLObject syntactic_support = find_or_create_nl_trie_word_syn_support(sentence, mt, string);
                final SubLObject entry = new_nl_trie_word(set_utilities.new_singleton_set(syntactic_support, Symbols.symbol_function((SubLObject)nl_trie.EQUALP)), set_utilities.new_singleton_set(semantic_assertion, Symbols.symbol_function((SubLObject)nl_trie.EQUALP)));
                words = (SubLObject)ConsesLow.cons(entry, words);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_trie.$list362);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        }
        return words;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 133563L)
    public static SubLObject find_string_mt_pairs_for_closed_class_word(final SubLObject wu, final SubLObject pos, final SubLObject semantic_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pairs = (SubLObject)nl_trie.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)nl_trie.$sym53$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(nl_trie.$const54$EverythingPSC, thread);
            SubLObject cdolist_list_var = kb_mapping.gather_gaf_arg_index(wu, (SubLObject)nl_trie.ONE_INTEGER, nl_trie.$const140$partOfSpeech, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
            SubLObject pos_as = (SubLObject)nl_trie.NIL;
            pos_as = cdolist_list_var.first();
            while (nl_trie.NIL != cdolist_list_var) {
                final SubLObject pos_mt = assertions_high.assertion_mt(pos_as);
                final SubLObject pos_pos = assertions_high.gaf_arg2(pos_as);
                final SubLObject string = assertions_high.gaf_arg3(pos_as);
                if (nl_trie.NIL != lexicon_accessors.genl_posP(pos_pos, pos, (SubLObject)nl_trie.UNPROVIDED) || nl_trie.NIL != lexicon_accessors.genl_posP(pos, pos_pos, (SubLObject)nl_trie.UNPROVIDED)) {
                    SubLObject cdolist_list_var_$102 = genl_mts.max_floor_mts((SubLObject)ConsesLow.list(pos_mt, semantic_mt), (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
                    SubLObject floor_mt = (SubLObject)nl_trie.NIL;
                    floor_mt = cdolist_list_var_$102.first();
                    while (nl_trie.NIL != cdolist_list_var_$102) {
                        final SubLObject item_var = (SubLObject)ConsesLow.list(string, floor_mt);
                        if (nl_trie.NIL == conses_high.member(item_var, pairs, Symbols.symbol_function((SubLObject)nl_trie.EQUAL), Symbols.symbol_function((SubLObject)nl_trie.IDENTITY))) {
                            pairs = (SubLObject)ConsesLow.cons(item_var, pairs);
                        }
                        cdolist_list_var_$102 = cdolist_list_var_$102.rest();
                        floor_mt = cdolist_list_var_$102.first();
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                pos_as = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return pairs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 134109L)
    public static SubLObject nl_trie_assemble_strings(final SubLObject leading_strings, final SubLObject wu_string, final SubLObject following_strings) {
        return lexicon_utilities.assemble_denot_strings(leading_strings, wu_string, following_strings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 134589L)
    public static SubLObject new_nl_trie_denot_set(SubLObject denots) {
        if (denots == nl_trie.UNPROVIDED) {
            denots = (SubLObject)nl_trie.NIL;
        }
        return set_utilities.construct_set_from_list(denots, nl_trie.$nl_trie_denot_set_test$.getGlobalValue(), (SubLObject)nl_trie.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 134715L)
    public static SubLObject nl_triefy_arg_in_reln_assertion(final SubLObject assertion, final SubLObject v_nl_trie, final SubLObject removeP, SubLObject mod_list) {
        if (mod_list == nl_trie.UNPROVIDED) {
            mod_list = (SubLObject)nl_trie.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert nl_trie.NIL != assertions_high.gaf_assertionP(assertion) : assertion;
        final SubLObject arg_in_reln_pred = assertions_high.gaf_arg0(assertion);
        final SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
        final SubLObject wu_arg = lexicon_utilities.wu_arg_of_pred_cached(arg_in_reln_pred);
        final SubLObject pos_arg = lexicon_utilities.pos_arg_of_pred_cached(arg_in_reln_pred);
        final SubLObject denotatum_arg = lexicon_utilities.denotatum_arg_of_pred_cached(arg_in_reln_pred);
        final SubLObject head_word = (SubLObject)((nl_trie.NIL != wu_arg) ? assertions_high.gaf_arg(assertion, wu_arg) : nl_trie.NIL);
        SubLObject leading_strings = (SubLObject)nl_trie.NIL;
        SubLObject following_strings = (SubLObject)nl_trie.NIL;
        SubLObject full_strings = (SubLObject)nl_trie.NIL;
        final SubLObject pos = (SubLObject)((nl_trie.NIL != pos_arg) ? assertions_high.gaf_arg(assertion, pos_arg) : nl_trie.NIL);
        final SubLObject denoted_reln = (SubLObject)((nl_trie.NIL != denotatum_arg) ? assertions_high.gaf_arg(assertion, denotatum_arg) : nl_trie.NIL);
        SubLObject successP = (SubLObject)nl_trie.NIL;
        thread.resetMultipleValues();
        final SubLObject leading_strings_$103 = lexicon_utilities.get_leading_strings_and_following_strings(assertions_high.gaf_formula(assertion));
        final SubLObject following_strings_$104 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        leading_strings = leading_strings_$103;
        following_strings = following_strings_$104;
        if (nl_trie.NIL != head_word && nl_trie.NIL != lexicon_accessors.speech_partP(pos, (SubLObject)nl_trie.UNPROVIDED) && nl_trie.NIL != denoted_reln) {
            final SubLObject denot_list = lexicon_accessors.relational_noun_denots(leading_strings, head_word, following_strings, pos, (SubLObject)nl_trie.$kw364$UNDETERMINED, denoted_reln, assertion_mt, assertion_mt);
            final SubLObject denot_set = new_nl_trie_denot_set(denot_list);
            final SubLObject sem_support = nl_trie_semantic_support_from_denots(denot_set, assertion_mt);
            if (nl_trie.NIL != denot_list) {
                if (nl_trie.NIL != mod_list) {
                    thread.resetMultipleValues();
                    final SubLObject successP_$105 = nl_triefy_arg_in_reln_wX_mod_list(sem_support, leading_strings, head_word, following_strings, pos, v_nl_trie, removeP, mod_list);
                    final SubLObject full_strings_$106 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    successP = successP_$105;
                    full_strings = full_strings_$106;
                }
                else {
                    thread.resetMultipleValues();
                    final SubLObject successP_$106 = nl_triefy_arg_in_reln_wXo_mod_list(sem_support, leading_strings, head_word, following_strings, pos, v_nl_trie, removeP, assertion_mt);
                    final SubLObject full_strings_$107 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    successP = successP_$106;
                    full_strings = full_strings_$107;
                }
            }
        }
        return Values.values(nl_trie_return_keyword(removeP, successP), full_strings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 137084L)
    public static SubLObject nl_triefy_arg_in_reln_wX_mod_list(final SubLObject semantic_support, final SubLObject leading_strings, final SubLObject head_word, final SubLObject following_strings, final SubLObject pos, final SubLObject v_nl_trie, final SubLObject removeP, final SubLObject mod_list) {
        SubLObject successP = (SubLObject)nl_trie.NIL;
        SubLObject strings = (SubLObject)nl_trie.NIL;
        SubLObject cdolist_list_var = mod_list;
        SubLObject tuple = (SubLObject)nl_trie.NIL;
        tuple = cdolist_list_var.first();
        while (nl_trie.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = tuple;
            SubLObject head_strings = (SubLObject)nl_trie.NIL;
            SubLObject constraint = (SubLObject)nl_trie.NIL;
            SubLObject mt = (SubLObject)nl_trie.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list365);
            head_strings = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list365);
            constraint = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list365);
            mt = current.first();
            current = current.rest();
            if (nl_trie.NIL == current) {
                final SubLObject pred = (nl_trie.NIL != fort_types_interface.predicate_p(constraint)) ? constraint : nl_trie.$const140$partOfSpeech;
                if ((nl_trie.NIL != lexicon_accessors.speech_part_predP(pred, (SubLObject)nl_trie.UNPROVIDED) && pos.eql(lexicon_accessors.pos_of_pred(pred))) || constraint.eql(pos)) {
                    SubLObject cdolist_list_var_$109 = head_strings;
                    SubLObject head_string = (SubLObject)nl_trie.NIL;
                    head_string = cdolist_list_var_$109.first();
                    while (nl_trie.NIL != cdolist_list_var_$109) {
                        final SubLObject big_string = nl_trie_assemble_strings(leading_strings, head_string, following_strings);
                        final SubLObject syn_sentence = el_utilities.make_binary_formula(pred, head_word, head_string);
                        final SubLObject syntactic_support = find_or_create_nl_trie_word_syn_support(syn_sentence, mt, head_string);
                        final SubLObject nl_trie_word = new_nl_trie_word(set_utilities.new_singleton_set(syntactic_support, Symbols.symbol_function((SubLObject)nl_trie.EQUALP)), set_utilities.new_singleton_set(semantic_support, Symbols.symbol_function((SubLObject)nl_trie.EQUALP)));
                        successP = (SubLObject)nl_trie.T;
                        strings = (SubLObject)ConsesLow.cons(big_string, strings);
                        SubLObject cdolist_list_var_$110 = nl_trie_string_tokenize_multiple(big_string);
                        SubLObject key = (SubLObject)nl_trie.NIL;
                        key = cdolist_list_var_$110.first();
                        while (nl_trie.NIL != cdolist_list_var_$110) {
                            add_or_remove_nl_trie_word(v_nl_trie, key, nl_trie_word, removeP);
                            cdolist_list_var_$110 = cdolist_list_var_$110.rest();
                            key = cdolist_list_var_$110.first();
                        }
                        cdolist_list_var_$109 = cdolist_list_var_$109.rest();
                        head_string = cdolist_list_var_$109.first();
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_trie.$list365);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        }
        return Values.values(successP, strings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 138257L)
    public static SubLObject nl_triefy_arg_in_reln_wXo_mod_list(final SubLObject semantic_support, final SubLObject leading_strings, final SubLObject head_word, final SubLObject following_strings, final SubLObject pos, final SubLObject v_nl_trie, final SubLObject removeP, final SubLObject mt) {
        final SubLObject basic_pred = lexicon_utilities.ordered_lexification_preds_of_pos(pos).first();
        final SubLObject derived_preds = morphology.pos_preds_derivable_from_pred(basic_pred, (SubLObject)nl_trie.UNPROVIDED);
        SubLObject successP = (SubLObject)nl_trie.NIL;
        SubLObject strings = (SubLObject)nl_trie.NIL;
        SubLObject cdolist_list_var = lexicon_cache.strings_of_wordXpred(head_word, basic_pred, (SubLObject)nl_trie.UNPROVIDED);
        SubLObject basic_head_string = (SubLObject)nl_trie.NIL;
        basic_head_string = cdolist_list_var.first();
        while (nl_trie.NIL != cdolist_list_var) {
            final SubLObject big_string = nl_trie_assemble_strings(leading_strings, basic_head_string, following_strings);
            final SubLObject syn_sentence = el_utilities.make_binary_formula(basic_pred, head_word, basic_head_string);
            final SubLObject syntactic_support = find_or_create_nl_trie_word_syn_support(syn_sentence, mt, basic_head_string);
            final SubLObject nl_trie_word = new_nl_trie_word(set_utilities.new_singleton_set(syntactic_support, nl_trie.$nl_trie_word_syntactic_support_set_test$.getGlobalValue()), set_utilities.new_singleton_set(semantic_support, nl_trie.$nl_trie_word_semantic_support_set_test$.getGlobalValue()));
            successP = (SubLObject)nl_trie.T;
            strings = (SubLObject)ConsesLow.cons(big_string, strings);
            SubLObject cdolist_list_var_$111 = nl_trie_string_tokenize_multiple(big_string);
            SubLObject key = (SubLObject)nl_trie.NIL;
            key = cdolist_list_var_$111.first();
            while (nl_trie.NIL != cdolist_list_var_$111) {
                add_or_remove_nl_trie_word(v_nl_trie, key, nl_trie_word, removeP);
                cdolist_list_var_$111 = cdolist_list_var_$111.rest();
                key = cdolist_list_var_$111.first();
            }
            SubLObject cdolist_list_var_$112 = derived_preds;
            SubLObject derived_pred = (SubLObject)nl_trie.NIL;
            derived_pred = cdolist_list_var_$112.first();
            while (nl_trie.NIL != cdolist_list_var_$112) {
                final SubLObject derived_head_string = morphology.generate_regular_string_from_form(derived_pred, basic_pred, basic_head_string, (SubLObject)nl_trie.UNPROVIDED);
                final SubLObject syn_sentence2 = el_utilities.make_binary_formula(derived_pred, head_word, derived_head_string);
                final SubLObject syntactic_support2 = find_or_create_nl_trie_word_syn_support(syn_sentence2, mt, derived_head_string);
                final SubLObject nl_trie_word2 = new_nl_trie_word(set_utilities.new_singleton_set(syntactic_support2, Symbols.symbol_function((SubLObject)nl_trie.EQUALP)), set_utilities.new_singleton_set(semantic_support, Symbols.symbol_function((SubLObject)nl_trie.EQUALP)));
                final SubLObject big_string2 = nl_trie_assemble_strings(leading_strings, derived_head_string, following_strings);
                successP = (SubLObject)nl_trie.T;
                strings = (SubLObject)ConsesLow.cons(big_string2, strings);
                SubLObject cdolist_list_var_$113 = nl_trie_string_tokenize_multiple(big_string2);
                SubLObject key2 = (SubLObject)nl_trie.NIL;
                key2 = cdolist_list_var_$113.first();
                while (nl_trie.NIL != cdolist_list_var_$113) {
                    add_or_remove_nl_trie_word(v_nl_trie, key2, nl_trie_word2, removeP);
                    cdolist_list_var_$113 = cdolist_list_var_$113.rest();
                    key2 = cdolist_list_var_$113.first();
                }
                cdolist_list_var_$112 = cdolist_list_var_$112.rest();
                derived_pred = cdolist_list_var_$112.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            basic_head_string = cdolist_list_var.first();
        }
        return Values.values(successP, strings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 140341L)
    public static SubLObject nl_triefy_abbr_lex_word_assertion(final SubLObject assertion, final SubLObject v_nl_trie, final SubLObject removeP) {
        assert nl_trie.NIL != assertions_high.gaf_assertionP(assertion) : assertion;
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_terms(assertions_high.gaf_formula(assertion), (SubLObject)nl_trie.UNPROVIDED);
        SubLObject abbrev_pred = (SubLObject)nl_trie.NIL;
        SubLObject wu = (SubLObject)nl_trie.NIL;
        SubLObject v_const = (SubLObject)nl_trie.NIL;
        SubLObject cycl_abbr = (SubLObject)nl_trie.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list366);
        abbrev_pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list366);
        wu = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list366);
        v_const = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list366);
        cycl_abbr = current.first();
        current = current.rest();
        if (nl_trie.NIL == current) {
            final SubLObject abbr = cycl_string.cycl_string_to_utf8_string(cycl_abbr);
            final SubLObject pos = find_pos_for_lex_const(v_const);
            final SubLObject preds = find_pos_preds_for_lex_const(v_const);
            final SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
            final SubLObject syntactic_supports = new_nl_trie_word_syntactic_support_set((SubLObject)nl_trie.UNPROVIDED);
            final SubLObject denots = get_denot_for_abbr_lex_word_assertion(wu, pos, assertion_mt);
            SubLObject successP = (SubLObject)nl_trie.T;
            final SubLObject desired_result = nl_trie_return_keyword(removeP, (SubLObject)nl_trie.T);
            SubLObject cdolist_list_var = preds;
            SubLObject pos_pred = (SubLObject)nl_trie.NIL;
            pos_pred = cdolist_list_var.first();
            while (nl_trie.NIL != cdolist_list_var) {
                final SubLObject sentence = (SubLObject)ConsesLow.list(abbrev_pred, wu, pos_pred, cycl_abbr);
                final SubLObject syntactic_support = find_or_create_nl_trie_word_syn_support(sentence, assertion_mt, cycl_abbr);
                set.set_add(syntactic_support, syntactic_supports);
                update_nl_trie_semantic_on_wu(wu, v_nl_trie, assertion_mt, (SubLObject)nl_trie.NIL, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(cycl_abbr), pos_pred, assertion_mt)));
                cdolist_list_var = cdolist_list_var.rest();
                pos_pred = cdolist_list_var.first();
            }
            final SubLObject nl_trie_word = new_nl_trie_word(syntactic_supports, denots);
            SubLObject cdolist_list_var2 = nl_trie_string_tokenize_multiple(abbr);
            SubLObject key = (SubLObject)nl_trie.NIL;
            key = cdolist_list_var2.first();
            while (nl_trie.NIL != cdolist_list_var2) {
                final SubLObject result = add_or_remove_nl_trie_word(v_nl_trie, key, nl_trie_word, removeP);
                if (!result.eql(desired_result)) {
                    successP = (SubLObject)nl_trie.NIL;
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                key = cdolist_list_var2.first();
            }
            return nl_trie_return_keyword(removeP, successP);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_trie.$list366);
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 142705L)
    public static SubLObject get_denot_for_abbr_lex_word_assertion(final SubLObject wu, final SubLObject apos, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject denots = new_nl_trie_denot_set((SubLObject)nl_trie.UNPROVIDED);
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        final SubLObject _prev_bind_4 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
        final SubLObject _prev_bind_5 = pred_relevance_macros.$pred$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            pred_relevance_macros.$relevant_pred_function$.bind((SubLObject)nl_trie.$sym367$RELEVANT_PRED_IS_EQ, thread);
            pred_relevance_macros.$pred$.bind(nl_trie.$const105$denotation, thread);
            final SubLObject pred_var = (SubLObject)nl_trie.NIL;
            if (nl_trie.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(wu, (SubLObject)nl_trie.ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(wu, (SubLObject)nl_trie.ONE_INTEGER, pred_var);
                SubLObject done_var = (SubLObject)nl_trie.NIL;
                final SubLObject token_var = (SubLObject)nl_trie.NIL;
                while (nl_trie.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (nl_trie.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)nl_trie.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)nl_trie.$kw326$GAF, (SubLObject)nl_trie.$kw327$TRUE, (SubLObject)nl_trie.NIL);
                            SubLObject done_var_$114 = (SubLObject)nl_trie.NIL;
                            final SubLObject token_var_$115 = (SubLObject)nl_trie.NIL;
                            while (nl_trie.NIL == done_var_$114) {
                                final SubLObject denot_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$115);
                                final SubLObject valid_$116 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$115.eql(denot_assertion));
                                if (nl_trie.NIL != valid_$116) {
                                    final SubLObject pos = assertions_high.gaf_arg2(denot_assertion);
                                    if (pos.equal(apos)) {
                                        set.set_add(denot_assertion, denots);
                                    }
                                }
                                done_var_$114 = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL == valid_$116);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$117 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nl_trie.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (nl_trie.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$117, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL == valid);
                }
            }
        }
        finally {
            pred_relevance_macros.$pred$.rebind(_prev_bind_5, thread);
            pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_4, thread);
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return denots;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 143298L)
    public static SubLObject nl_triefy_abbr_cps_assertion(final SubLObject assertion, final SubLObject v_nl_trie, final SubLObject removeP) {
        assert nl_trie.NIL != assertions_high.gaf_assertionP(assertion) : assertion;
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_terms(assertions_high.gaf_formula(assertion), (SubLObject)nl_trie.UNPROVIDED);
        SubLObject abbrev_pred = (SubLObject)nl_trie.NIL;
        SubLObject wu = (SubLObject)nl_trie.NIL;
        SubLObject cycl_mw_str = (SubLObject)nl_trie.NIL;
        SubLObject v_const = (SubLObject)nl_trie.NIL;
        SubLObject abbr = (SubLObject)nl_trie.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list368);
        abbrev_pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list368);
        wu = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list368);
        cycl_mw_str = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list368);
        v_const = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list368);
        abbr = current.first();
        current = current.rest();
        if (nl_trie.NIL == current) {
            final SubLObject mw_str = unicode_nauts.convert_unicode_nauts_to_utf8_strings(cycl_mw_str);
            final SubLObject pos = find_pos_for_lex_const(v_const);
            final SubLObject preds = find_pos_preds_for_lex_const(v_const);
            final SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
            final SubLObject syntactic_supports = new_nl_trie_word_syntactic_support_set((SubLObject)nl_trie.UNPROVIDED);
            final SubLObject denots = get_denot_for_abbr_cps_assertion(mw_str, wu, pos, assertion_mt);
            SubLObject successP = (SubLObject)nl_trie.T;
            final SubLObject desired_result = nl_trie_return_keyword(removeP, (SubLObject)nl_trie.T);
            SubLObject cdolist_list_var = preds;
            SubLObject pos_pred = (SubLObject)nl_trie.NIL;
            pos_pred = cdolist_list_var.first();
            while (nl_trie.NIL != cdolist_list_var) {
                final SubLObject sentence = (SubLObject)ConsesLow.list(abbrev_pred, wu, mw_str, pos_pred, abbr);
                final SubLObject syntactic_support = find_or_create_nl_trie_word_syn_support(sentence, assertion_mt, abbr);
                set.set_add(syntactic_support, syntactic_supports);
                cdolist_list_var = cdolist_list_var.rest();
                pos_pred = cdolist_list_var.first();
            }
            final SubLObject nl_trie_word = new_nl_trie_word(syntactic_supports, denots);
            SubLObject cdolist_list_var2 = nl_trie_string_tokenize_multiple(abbr);
            SubLObject key = (SubLObject)nl_trie.NIL;
            key = cdolist_list_var2.first();
            while (nl_trie.NIL != cdolist_list_var2) {
                final SubLObject result = add_or_remove_nl_trie_word(v_nl_trie, key, nl_trie_word, removeP);
                if (!result.eql(desired_result)) {
                    successP = (SubLObject)nl_trie.NIL;
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                key = cdolist_list_var2.first();
            }
            return nl_trie_return_keyword(removeP, successP);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_trie.$list368);
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 145579L)
    public static SubLObject get_denot_for_abbr_cps_assertion(final SubLObject amw_str, final SubLObject word, final SubLObject apos, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject denots = new_nl_trie_denot_set((SubLObject)nl_trie.UNPROVIDED);
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        final SubLObject _prev_bind_4 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
        final SubLObject _prev_bind_5 = pred_relevance_macros.$pred$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            pred_relevance_macros.$relevant_pred_function$.bind((SubLObject)nl_trie.$sym367$RELEVANT_PRED_IS_EQ, thread);
            pred_relevance_macros.$pred$.bind(nl_trie.$const369$compoundString, thread);
            final SubLObject pred_var = (SubLObject)nl_trie.NIL;
            if (nl_trie.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(word, (SubLObject)nl_trie.ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(word, (SubLObject)nl_trie.ONE_INTEGER, pred_var);
                SubLObject done_var = (SubLObject)nl_trie.NIL;
                final SubLObject token_var = (SubLObject)nl_trie.NIL;
                while (nl_trie.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (nl_trie.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)nl_trie.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)nl_trie.$kw326$GAF, (SubLObject)nl_trie.$kw327$TRUE, (SubLObject)nl_trie.NIL);
                            SubLObject done_var_$118 = (SubLObject)nl_trie.NIL;
                            final SubLObject token_var_$119 = (SubLObject)nl_trie.NIL;
                            while (nl_trie.NIL == done_var_$118) {
                                final SubLObject cp_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$119);
                                final SubLObject valid_$120 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$119.eql(cp_assertion));
                                if (nl_trie.NIL != valid_$120) {
                                    final SubLObject mw_str = assertions_high.gaf_arg2(cp_assertion);
                                    final SubLObject pos = assertions_high.gaf_arg3(cp_assertion);
                                    if (mw_str.equal(amw_str) && pos.equal(apos)) {
                                        set.set_add(cp_assertion, denots);
                                    }
                                }
                                done_var_$118 = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL == valid_$120);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$121 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nl_trie.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (nl_trie.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$121, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL == valid);
                }
            }
        }
        finally {
            pred_relevance_macros.$pred$.rebind(_prev_bind_5, thread);
            pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_4, thread);
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return denots;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 146322L)
    public static SubLObject nl_triefy_abbr_mws_assertion(final SubLObject assertion, final SubLObject v_nl_trie, final SubLObject removeP) {
        assert nl_trie.NIL != assertions_high.gaf_assertionP(assertion) : assertion;
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_terms(assertions_high.gaf_formula(assertion), (SubLObject)nl_trie.UNPROVIDED);
        SubLObject abbrev_pred = (SubLObject)nl_trie.NIL;
        SubLObject cycl_mw_str = (SubLObject)nl_trie.NIL;
        SubLObject wu = (SubLObject)nl_trie.NIL;
        SubLObject v_const = (SubLObject)nl_trie.NIL;
        SubLObject cycl_abbr = (SubLObject)nl_trie.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list370);
        abbrev_pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list370);
        cycl_mw_str = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list370);
        wu = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list370);
        v_const = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list370);
        cycl_abbr = current.first();
        current = current.rest();
        if (nl_trie.NIL == current) {
            final SubLObject mw_str = unicode_nauts.convert_unicode_nauts_to_utf8_strings(cycl_mw_str);
            final SubLObject abbr = cycl_string.cycl_string_to_utf8_string(cycl_abbr);
            final SubLObject pos = find_pos_for_lex_const(v_const);
            final SubLObject preds = find_pos_preds_for_lex_const(v_const);
            final SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
            final SubLObject syntactic_supports = new_nl_trie_word_syntactic_support_set((SubLObject)nl_trie.UNPROVIDED);
            final SubLObject denots = get_denot_for_abbr_mws_assertion(mw_str, wu, pos, assertion_mt);
            SubLObject successP = (SubLObject)nl_trie.T;
            final SubLObject desired_result = nl_trie_return_keyword(removeP, (SubLObject)nl_trie.T);
            SubLObject cdolist_list_var = preds;
            SubLObject pos_pred = (SubLObject)nl_trie.NIL;
            pos_pred = cdolist_list_var.first();
            while (nl_trie.NIL != cdolist_list_var) {
                final SubLObject sentence = (SubLObject)ConsesLow.list(abbrev_pred, mw_str, wu, pos_pred, abbr);
                final SubLObject syntactic_support = find_or_create_nl_trie_word_syn_support(sentence, assertion_mt, abbr);
                set.set_add(syntactic_support, syntactic_supports);
                cdolist_list_var = cdolist_list_var.rest();
                pos_pred = cdolist_list_var.first();
            }
            final SubLObject nl_trie_word = new_nl_trie_word(syntactic_supports, denots);
            SubLObject cdolist_list_var2 = nl_trie_string_tokenize_multiple(abbr);
            SubLObject key = (SubLObject)nl_trie.NIL;
            key = cdolist_list_var2.first();
            while (nl_trie.NIL != cdolist_list_var2) {
                final SubLObject result = add_or_remove_nl_trie_word(v_nl_trie, key, nl_trie_word, removeP);
                if (!result.eql(desired_result)) {
                    successP = (SubLObject)nl_trie.NIL;
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                key = cdolist_list_var2.first();
            }
            return nl_trie_return_keyword(removeP, successP);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_trie.$list370);
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 148516L)
    public static SubLObject get_denot_for_abbr_mws_assertion(final SubLObject amw_str, final SubLObject word, final SubLObject apos, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject denots = new_nl_trie_denot_set((SubLObject)nl_trie.UNPROVIDED);
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        final SubLObject _prev_bind_4 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
        final SubLObject _prev_bind_5 = pred_relevance_macros.$pred$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            pred_relevance_macros.$relevant_pred_function$.bind((SubLObject)nl_trie.$sym367$RELEVANT_PRED_IS_EQ, thread);
            pred_relevance_macros.$pred$.bind(nl_trie.$const371$multiWordString, thread);
            final SubLObject pred_var = (SubLObject)nl_trie.NIL;
            if (nl_trie.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(word, (SubLObject)nl_trie.TWO_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(word, (SubLObject)nl_trie.TWO_INTEGER, pred_var);
                SubLObject done_var = (SubLObject)nl_trie.NIL;
                final SubLObject token_var = (SubLObject)nl_trie.NIL;
                while (nl_trie.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (nl_trie.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)nl_trie.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)nl_trie.$kw326$GAF, (SubLObject)nl_trie.$kw327$TRUE, (SubLObject)nl_trie.NIL);
                            SubLObject done_var_$122 = (SubLObject)nl_trie.NIL;
                            final SubLObject token_var_$123 = (SubLObject)nl_trie.NIL;
                            while (nl_trie.NIL == done_var_$122) {
                                final SubLObject mw_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$123);
                                final SubLObject valid_$124 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$123.eql(mw_assertion));
                                if (nl_trie.NIL != valid_$124) {
                                    final SubLObject mw_str = assertions_high.gaf_arg1(mw_assertion);
                                    final SubLObject pos = assertions_high.gaf_arg3(mw_assertion);
                                    if (mw_str.equal(amw_str) && pos.equal(apos)) {
                                        set.set_add(mw_assertion, denots);
                                    }
                                }
                                done_var_$122 = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL == valid_$124);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$125 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nl_trie.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (nl_trie.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$125, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL == valid);
                }
            }
        }
        finally {
            pred_relevance_macros.$pred$.rebind(_prev_bind_5, thread);
            pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_4, thread);
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return denots;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 149256L)
    public static SubLObject nl_triefy_name_string(final SubLObject content, final SubLObject v_nl_trie, final SubLObject removeP) {
        final SubLObject string = nl_trie_name_string(content);
        final SubLObject desired_result = nl_trie_return_keyword(removeP, (SubLObject)nl_trie.T);
        SubLObject successP = (SubLObject)nl_trie.NIL;
        if (!string.isString()) {
            if (nl_trie.NIL != removeP) {
                nl_trie_warn_bad_remove(content);
            }
            else {
                nl_trie_warn_bad_add(content);
            }
            return nl_trie_return_keyword(removeP, (SubLObject)nl_trie.NIL);
        }
        final SubLObject trie_keys = nl_trie_entry_keys(content, (SubLObject)nl_trie.UNPROVIDED);
        SubLObject result = (SubLObject)nl_trie.NIL;
        SubLObject entry_strings = (SubLObject)ConsesLow.list(string);
        SubLObject cdolist_list_var = trie_keys;
        SubLObject trie_key = (SubLObject)nl_trie.NIL;
        trie_key = cdolist_list_var.first();
        while (nl_trie.NIL != cdolist_list_var) {
            if (nl_trie.NIL != nl_trie_name_ok_for_adding_theP(content, nl_trie_entry_mt(content), trie_key)) {
                final SubLObject item_var = Sequences.cconcatenate(nl_trie.$english_definite_determiner$.getGlobalValue(), new SubLObject[] { nl_trie.$str372$_, string });
                if (nl_trie.NIL == conses_high.member(item_var, entry_strings, Symbols.symbol_function((SubLObject)nl_trie.EQL), Symbols.symbol_function((SubLObject)nl_trie.IDENTITY))) {
                    entry_strings = (SubLObject)ConsesLow.cons(item_var, entry_strings);
                }
            }
            result = update_nl_trie_name(v_nl_trie, trie_key, content, removeP);
            if (desired_result.eql(result)) {
                successP = (SubLObject)nl_trie.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            trie_key = cdolist_list_var.first();
        }
        return Values.values(nl_trie_return_keyword(removeP, successP), entry_strings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 150866L)
    public static SubLObject add_or_remove_nl_trie_word(final SubLObject v_nl_trie, final SubLObject key0, final SubLObject word, final SubLObject removeP) {
        final SubLObject desired_result = nl_trie_return_keyword(removeP, (SubLObject)nl_trie.T);
        final SubLObject key = unicode_nauts.convert_unicode_nauts_to_utf8_strings(key0);
        final SubLObject result = (SubLObject)((nl_trie.NIL != key) ? ((nl_trie.NIL != removeP) ? nl_trie_delete_word(v_nl_trie, key, word) : nl_trie_insert_word(v_nl_trie, key, word)) : nl_trie.NIL);
        nl_trie_accessors.update_nl_trie_rotation_index((SubLObject)ConsesLow.list(word), removeP, (SubLObject)nl_trie.UNPROVIDED);
        return nl_trie_return_keyword(removeP, Equality.eql(desired_result, result));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 152036L)
    public static SubLObject nl_trie_insert_low(final SubLObject v_nl_trie, SubLObject key, final SubLObject entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)nl_trie.NIL;
        if (v_nl_trie.eql(get_nl_trie())) {
            nl_trie_completion.nl_trie_completion_index_add_string(nl_trie_entry_string(entry));
            SubLObject release = (SubLObject)nl_trie.NIL;
            try {
                release = Locks.seize_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
                final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
                final SubLObject _prev_bind_2 = file_vector_utilities.$current_backed_map_cache_strategy$.currentBinding(thread);
                try {
                    file_vector_utilities.$file_vector_backed_map_read_lock$.bind(nl_trie.$nl_trie_lock$.getGlobalValue(), thread);
                    file_vector_utilities.$current_backed_map_cache_strategy$.bind(nl_trie.$nl_trie_cache_strategy$.getGlobalValue(), thread);
                    key = nl_trie_eqify_key(key);
                    result = strie.strie_insert(v_nl_trie, key, entry);
                }
                finally {
                    file_vector_utilities.$current_backed_map_cache_strategy$.rebind(_prev_bind_2, thread);
                    file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
                }
            }
            finally {
                if (nl_trie.NIL != release) {
                    Locks.release_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
                }
            }
        }
        else {
            result = strie.strie_insert(v_nl_trie, key, entry);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 152585L)
    public static SubLObject nl_trie_eqify_key(final SubLObject key) {
        SubLObject list_var = (SubLObject)nl_trie.NIL;
        SubLObject string = (SubLObject)nl_trie.NIL;
        SubLObject i = (SubLObject)nl_trie.NIL;
        list_var = key;
        string = list_var.first();
        for (i = (SubLObject)nl_trie.ZERO_INTEGER; nl_trie.NIL != list_var; list_var = list_var.rest(), string = list_var.first(), i = Numbers.add((SubLObject)nl_trie.ONE_INTEGER, i)) {
            final SubLObject string_to_use = nl_trie_accessors.nl_trie_string_to_use(string);
            if (!string.eql(string_to_use)) {
                list_utilities.nreplace_nth(i, string_to_use, key);
            }
        }
        return key;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 152987L)
    public static SubLObject nl_trie_insert_word(final SubLObject v_nl_trie, final SubLObject key0, final SubLObject new_entry) {
        final SubLObject key = unicode_nauts.convert_unicode_nauts_to_utf8_strings(key0);
        final SubLObject exist_entries = nl_trie_lookup(v_nl_trie, key, (SubLObject)nl_trie.$kw23$OFF);
        SubLObject csome_list_var = nl_trie_remove_invalid_entries(exist_entries, v_nl_trie, key);
        SubLObject exist_entry = (SubLObject)nl_trie.NIL;
        exist_entry = csome_list_var.first();
        while (nl_trie.NIL != csome_list_var) {
            if (nl_trie.NIL != nl_trie_word_p(exist_entry, (SubLObject)nl_trie.UNPROVIDED) && nl_trie.NIL != unifiable_word_entriesP(exist_entry, new_entry, (SubLObject)nl_trie.UNPROVIDED)) {
                nl_trie_augment_word(exist_entry, new_entry, (SubLObject)nl_trie.T);
                return (SubLObject)nl_trie.$kw145$ADDED;
            }
            csome_list_var = csome_list_var.rest();
            exist_entry = csome_list_var.first();
        }
        nl_trie_insert_low(v_nl_trie, key, new_entry);
        return (SubLObject)nl_trie.$kw145$ADDED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 154090L)
    public static SubLObject nl_trie_closed_lexical_class_entryP(final SubLObject entry) {
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL != nl_trie_word_p(entry, (SubLObject)nl_trie.UNPROVIDED) && nl_trie.NIL != lexicon_accessors.closed_lexical_classP(nl_trie_word_pos(entry), (SubLObject)nl_trie.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 154247L)
    public static SubLObject nl_trie_entry_case_matches_stringP(final SubLObject entry, final SubLObject string) {
        return Equality.equal(nl_trie_entry_string(entry), string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 154369L)
    public static SubLObject nl_trie_augment_word(final SubLObject word, final SubLObject new_word, SubLObject check_for_impliedP) {
        if (check_for_impliedP == nl_trie.UNPROVIDED) {
            check_for_impliedP = (SubLObject)nl_trie.T;
        }
        SubLObject set_var = nl_trie_word_syntactic_support_set(new_word);
        SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject syn_support;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)nl_trie.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); nl_trie.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            syn_support = set_contents.do_set_contents_next(basis_object, state);
            if (nl_trie.NIL != set_contents.do_set_contents_element_validP(state, syn_support)) {
                nl_trie_word_add_syntactic_support(word, syn_support, check_for_impliedP);
            }
        }
        set_var = nl_trie_word_semantic_support_set(new_word);
        set_contents_var = set.do_set_internal(set_var);
        SubLObject sem_support;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)nl_trie.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); nl_trie.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            sem_support = set_contents.do_set_contents_next(basis_object, state);
            if (nl_trie.NIL != set_contents.do_set_contents_element_validP(state, sem_support)) {
                nl_trie_word_add_semantic_support(word, sem_support);
            }
        }
        return (SubLObject)nl_trie.$kw373$AUGMENTED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 154901L)
    public static SubLObject nl_trie_delete_word(final SubLObject v_nl_trie, final SubLObject key, final SubLObject del_word) {
        final SubLObject exist_entries = nl_trie_lookup(v_nl_trie, key, (SubLObject)nl_trie.$kw23$OFF);
        final SubLObject syn_supports = nl_trie_word_syntactic_support_set(del_word);
        final SubLObject sem_supports = nl_trie_word_semantic_support_set(del_word);
        SubLObject foundP = (SubLObject)nl_trie.NIL;
        SubLObject cdolist_list_var = exist_entries;
        SubLObject exist_entry = (SubLObject)nl_trie.NIL;
        exist_entry = cdolist_list_var.first();
        while (nl_trie.NIL != cdolist_list_var) {
            if (nl_trie.NIL != nl_trie_word_p(exist_entry, (SubLObject)nl_trie.UNPROVIDED)) {
                SubLObject unassociateP = set.set_emptyP(syn_supports);
                final SubLObject set_contents_var = set.do_set_internal(syn_supports);
                SubLObject basis_object;
                SubLObject state;
                SubLObject syn_support;
                SubLObject set_contents_var_$126;
                SubLObject basis_object_$127;
                SubLObject state_$128;
                SubLObject sem_support;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)nl_trie.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); nl_trie.NIL == unassociateP && nl_trie.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    syn_support = set_contents.do_set_contents_next(basis_object, state);
                    if (nl_trie.NIL != set_contents.do_set_contents_element_validP(state, syn_support) && nl_trie.NIL != nl_trie_word_has_syntactic_support_p(exist_entry, syn_support, (SubLObject)nl_trie.NIL)) {
                        if (nl_trie.NIL != set.set_emptyP(sem_supports)) {
                            foundP = (SubLObject)nl_trie.T;
                            nl_trie_word_remove_syntactic_support(exist_entry, syn_support);
                            if (nl_trie.NIL != set.set_emptyP(nl_trie_word_syntactic_support_set(exist_entry))) {
                                unassociateP = (SubLObject)nl_trie.T;
                            }
                        }
                        else {
                            set_contents_var_$126 = set.do_set_internal(sem_supports);
                            for (basis_object_$127 = set_contents.do_set_contents_basis_object(set_contents_var_$126), state_$128 = (SubLObject)nl_trie.NIL, state_$128 = set_contents.do_set_contents_initial_state(basis_object_$127, set_contents_var_$126); nl_trie.NIL == set_contents.do_set_contents_doneP(basis_object_$127, state_$128); state_$128 = set_contents.do_set_contents_update_state(state_$128)) {
                                sem_support = set_contents.do_set_contents_next(basis_object_$127, state_$128);
                                if (nl_trie.NIL != set_contents.do_set_contents_element_validP(state_$128, sem_support) && nl_trie.NIL != nl_trie_word_has_semantic_support_p(exist_entry, sem_support)) {
                                    foundP = (SubLObject)nl_trie.T;
                                    nl_trie_word_remove_semantic_support(exist_entry, sem_support);
                                }
                            }
                            if (nl_trie.NIL != nl_trie_syntactic_orphanP(exist_entry, key)) {
                                unassociateP = (SubLObject)nl_trie.T;
                            }
                        }
                    }
                }
                if (nl_trie.NIL != unassociateP) {
                    nl_trie_unassociate(key, exist_entry, v_nl_trie);
                    foundP = (SubLObject)nl_trie.T;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            exist_entry = cdolist_list_var.first();
        }
        return (SubLObject)((nl_trie.NIL != foundP) ? nl_trie.$kw147$REMOVED : nl_trie.$kw148$NOT_FOUND);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 156626L)
    public static SubLObject nl_trie_unassociate(final SubLObject key, final SubLObject entry, SubLObject v_nl_trie) {
        if (v_nl_trie == nl_trie.UNPROVIDED) {
            v_nl_trie = get_nl_trie();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = (SubLObject)nl_trie.NIL;
        try {
            release = Locks.seize_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
            final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
            final SubLObject _prev_bind_2 = file_vector_utilities.$current_backed_map_cache_strategy$.currentBinding(thread);
            try {
                file_vector_utilities.$file_vector_backed_map_read_lock$.bind(nl_trie.$nl_trie_lock$.getGlobalValue(), thread);
                file_vector_utilities.$current_backed_map_cache_strategy$.bind(nl_trie.$nl_trie_cache_strategy$.getGlobalValue(), thread);
                strie.strie_unassociate(v_nl_trie, key, entry);
            }
            finally {
                file_vector_utilities.$current_backed_map_cache_strategy$.rebind(_prev_bind_2, thread);
                file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            if (nl_trie.NIL != release) {
                Locks.release_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
            }
        }
        if (v_nl_trie.eql(get_nl_trie()) && nl_trie.NIL == nl_trie_search(nl_trie_entry_string(entry), get_nl_trie(), (SubLObject)nl_trie.UNPROVIDED)) {
            nl_trie_completion.nl_trie_completion_index_remove_string(nl_trie_entry_string(entry));
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 157092L)
    public static SubLObject nl_trie_syntactic_orphanP(final SubLObject word, final SubLObject key) {
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL != set.set_emptyP(nl_trie_word_semantic_support_set(word)) && nl_trie.NIL == subl_promotions.memberP(key, nl_trie_string_tokenize_multiple(nl_trie_word_string(word)), (SubLObject)nl_trie.EQUALP, (SubLObject)nl_trie.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 157406L)
    public static SubLObject unifiable_word_entriesP(final SubLObject word1, final SubLObject word2, SubLObject check_pragmaticsP) {
        if (check_pragmaticsP == nl_trie.UNPROVIDED) {
            check_pragmaticsP = (SubLObject)nl_trie.T;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL != nl_trie_syntax_unifiable_p(word1, word2) && nl_trie.NIL != nl_trie_semantics_unifiable_p(word1, word2) && (nl_trie.NIL == check_pragmaticsP || nl_trie.NIL != nl_trie_pragmatics_unifiable_p(word1, word2)) && nl_trie.NIL != nl_trie_words_case_identicalP(word1, word2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 157893L)
    public static SubLObject nl_trie_words_case_identicalP(final SubLObject word1, final SubLObject word2) {
        return Equality.equal(nl_trie_entry_string(word1), nl_trie_entry_string(word2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 158058L)
    public static SubLObject nl_trie_syntax_unifiable_p(final SubLObject word1, final SubLObject word2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL != nl_trie_frame_unifiable_p(word1, word2) && nl_trie.NIL != nl_trie_pos_unifiable_p(word1, word2) && (nl_trie.NIL != nl_trie_no_new_syntax_p(word1, word2) || (nl_trie.NIL != nl_trie_wu_unifiable_p(word1, word2) && nl_trie.NIL != nl_trie_syntax_mt_unifiable_p(word1, word2))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 158429L)
    public static SubLObject nl_trie_semantics_unifiable_p(final SubLObject word1, final SubLObject word2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL != nl_trie_no_new_semantics_p(word1, word2) || (nl_trie.NIL != nl_trie_semantic_pred_unifiable_p(word1, word2) && nl_trie.NIL != nl_trie_semantics_mt_unifiable_p(word1, word2)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 158727L)
    public static SubLObject nl_trie_pragmatics_unifiable_p(final SubLObject word1, final SubLObject word2) {
        if (nl_trie.NIL != set.set_emptyP(nl_trie_word_semantic_support_set(word1))) {
            return (SubLObject)nl_trie.T;
        }
        if (nl_trie.NIL != set.set_emptyP(nl_trie_word_semantic_support_set(word2))) {
            return (SubLObject)nl_trie.T;
        }
        if (nl_trie_entry_pragmatics(word1).equal(nl_trie_entry_pragmatics(word2))) {
            return (SubLObject)nl_trie.T;
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 159127L)
    public static SubLObject nl_trie_semantic_pred_unifiable_p(final SubLObject word1, final SubLObject word2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL == nl_trie_entry_semantic_pred(word1, (SubLObject)nl_trie.UNPROVIDED) || nl_trie.NIL == nl_trie_entry_semantic_pred(word2, (SubLObject)nl_trie.UNPROVIDED) || nl_trie_entry_semantic_pred(word1, (SubLObject)nl_trie.UNPROVIDED).equal(nl_trie_entry_semantic_pred(word2, (SubLObject)nl_trie.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 159388L)
    public static SubLObject nl_trie_semantics_mt_unifiable_p(final SubLObject word1, final SubLObject word2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL == nl_trie_word_semantics_mt(word1) || nl_trie.NIL == nl_trie_word_semantics_mt(word2) || nl_trie_word_semantics_mt(word1).equal(nl_trie_word_semantics_mt(word2)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 159640L)
    public static SubLObject nl_trie_no_new_syntax_p(final SubLObject word1, final SubLObject word2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL != set.set_emptyP(nl_trie_word_syntactic_support_set(word1)) || nl_trie.NIL != set.set_emptyP(nl_trie_word_syntactic_support_set(word2)) || nl_trie.NIL != set_utilities.sets_coextensionalP(nl_trie_word_syntactic_support_set(word1), nl_trie_word_syntactic_support_set(word2)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 160056L)
    public static SubLObject nl_trie_no_new_semantics_p(final SubLObject word1, final SubLObject word2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL != set.set_emptyP(nl_trie_word_semantic_support_set(word1)) || nl_trie.NIL != set.set_emptyP(nl_trie_word_semantic_support_set(word2)) || nl_trie.NIL != set_utilities.sets_coextensionalP(nl_trie_word_semantic_support_set(word1), nl_trie_word_semantic_support_set(word2)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 160539L)
    public static SubLObject nl_trie_pos_unifiable_p(final SubLObject word1, final SubLObject word2) {
        return Equality.equal(nl_trie_word_pos(word1), nl_trie_word_pos(word2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 160668L)
    public static SubLObject nl_trie_frame_unifiable_p(final SubLObject word1, final SubLObject word2) {
        return Equality.equal(nl_trie_word_frame(word1), nl_trie_word_frame(word2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 160803L)
    public static SubLObject nl_trie_wu_unifiable_p(final SubLObject word1, final SubLObject word2) {
        return Equality.equal(nl_trie_word_word_unit(word1, (SubLObject)nl_trie.UNPROVIDED), nl_trie_word_word_unit(word2, (SubLObject)nl_trie.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 160943L)
    public static SubLObject nl_trie_syntax_mt_unifiable_p(final SubLObject word1, final SubLObject word2) {
        return Equality.equal(nl_trie_word_syntax_mt(word1), nl_trie_word_syntax_mt(word2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 161090L)
    public static SubLObject update_nl_trie_name(final SubLObject v_nl_trie, final SubLObject key, final SubLObject name, final SubLObject removeP) {
        SubLObject success = (SubLObject)nl_trie.T;
        SubLObject cdolist_list_var;
        final SubLObject keys = cdolist_list_var = (SubLObject)((nl_trie.NIL != key) ? ConsesLow.list(key) : nl_trie_string_tokenize_multiple(nl_trie_name_string(name)));
        SubLObject key_$129 = (SubLObject)nl_trie.NIL;
        key_$129 = cdolist_list_var.first();
        while (nl_trie.NIL != cdolist_list_var) {
            final SubLObject desired_result = nl_trie_return_keyword(removeP, (SubLObject)nl_trie.T);
            final SubLObject result = (SubLObject)((nl_trie.NIL != key_$129) ? ((nl_trie.NIL != removeP) ? nl_trie_delete_name(v_nl_trie, key_$129, name) : nl_trie_insert_name(v_nl_trie, key_$129, name)) : nl_trie.NIL);
            nl_trie_accessors.update_nl_trie_rotation_index((SubLObject)ConsesLow.list(name), removeP, (SubLObject)nl_trie.UNPROVIDED);
            if (!desired_result.eql(result)) {
                success = (SubLObject)nl_trie.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            key_$129 = cdolist_list_var.first();
        }
        return nl_trie_return_keyword(removeP, success);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 162186L)
    public static SubLObject nl_trie_insert_name(final SubLObject v_nl_trie, final SubLObject key0, final SubLObject new_entry) {
        final SubLObject key = unicode_nauts.convert_unicode_nauts_to_utf8_strings(key0);
        SubLObject csome_list_var = nl_trie_lookup(v_nl_trie, key, (SubLObject)nl_trie.UNPROVIDED);
        SubLObject existing_entry = (SubLObject)nl_trie.NIL;
        existing_entry = csome_list_var.first();
        while (nl_trie.NIL != csome_list_var) {
            if (nl_trie.NIL != nl_trie_name_p(existing_entry, (SubLObject)nl_trie.UNPROVIDED)) {
                if (nl_trie.NIL != nl_trie_name_redundantP(new_entry, existing_entry)) {
                    return (SubLObject)nl_trie.$kw374$REDUNDANT;
                }
                if (nl_trie.NIL != nl_trie_name_redundantP(existing_entry, new_entry)) {
                    nl_trie_delete_name(v_nl_trie, key, existing_entry);
                }
            }
            csome_list_var = csome_list_var.rest();
            existing_entry = csome_list_var.first();
        }
        nl_trie_insert_low(v_nl_trie, key, new_entry);
        return (SubLObject)nl_trie.$kw145$ADDED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 162892L)
    public static SubLObject nl_trie_name_redundantP(final SubLObject focus, final SubLObject referent) {
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL != assertions_high.gaf_assertionP(referent) && nl_trie.NIL != assertions_high.gaf_assertionP(focus) && assertions_high.gaf_arg1(referent).equal(assertions_high.gaf_arg1(focus)) && assertions_high.gaf_arg2(referent).equal(assertions_high.gaf_arg2(focus)) && nl_trie_entry_mt(focus).eql(nl_trie_entry_mt(referent)) && nl_trie_entry_semantic_pred(referent, (SubLObject)nl_trie.UNPROVIDED).eql(nl_trie_entry_semantic_pred(focus, (SubLObject)nl_trie.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 163629L)
    public static SubLObject nl_trie_delete_name(final SubLObject v_nl_trie, final SubLObject key, final SubLObject name) {
        nl_trie_unassociate(key, name, v_nl_trie);
        return (SubLObject)nl_trie.$kw147$REMOVED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 164115L)
    public static SubLObject nl_trie_strings_of_wuXpos(final SubLObject wu, final SubLObject pos, final SubLObject mt) {
        if (nl_trie.NIL != genls.genl_ofP(nl_trie.$const167$ClosedClassWord, pos, mt, (SubLObject)nl_trie.UNPROVIDED)) {
            SubLObject ans = (SubLObject)nl_trie.NIL;
            SubLObject cdolist_list_var = kb_mapping.gather_gaf_arg_index(wu, (SubLObject)nl_trie.ONE_INTEGER, nl_trie.$const140$partOfSpeech, mt, (SubLObject)nl_trie.UNPROVIDED);
            SubLObject as = (SubLObject)nl_trie.NIL;
            as = cdolist_list_var.first();
            while (nl_trie.NIL != cdolist_list_var) {
                if (nl_trie.NIL != lexicon_accessors.genl_posP(assertions_high.gaf_arg2(as), pos, (SubLObject)nl_trie.UNPROVIDED)) {
                    final SubLObject item_var = assertions_high.gaf_arg3(as);
                    if (nl_trie.NIL == conses_high.member(item_var, ans, Symbols.symbol_function((SubLObject)nl_trie.EQUALP), Symbols.symbol_function((SubLObject)nl_trie.IDENTITY))) {
                        ans = (SubLObject)ConsesLow.cons(item_var, ans);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                as = cdolist_list_var.first();
            }
            return ans;
        }
        return lexicon_accessors.get_strings_of_type(wu, pos, (SubLObject)nl_trie.$kw375$ALL, (SubLObject)nl_trie.NIL, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 165087L)
    public static SubLObject clear_nl_trie_preds_of_pos() {
        final SubLObject cs = nl_trie.$nl_trie_preds_of_pos_caching_state$.getGlobalValue();
        if (nl_trie.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 165087L)
    public static SubLObject remove_nl_trie_preds_of_pos(final SubLObject pos) {
        return memoization_state.caching_state_remove_function_results_with_args(nl_trie.$nl_trie_preds_of_pos_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(pos), (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 165087L)
    public static SubLObject nl_trie_preds_of_pos_internal(final SubLObject pos) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = list_utilities.remove_if_not((SubLObject)nl_trie.$sym307$NL_TRIE_SYNTACTIC_PRED_, kb_mapping_utilities.pred_values_in_any_mt(pos, nl_trie.$const377$speechPartPreds, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED), (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)nl_trie.$sym53$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(nl_trie.$const54$EverythingPSC, thread);
            if (nl_trie.NIL != lexicon_accessors.genl_posP(nl_trie.$const378$Verb, pos, (SubLObject)nl_trie.UNPROVIDED)) {
                final SubLObject item_var = nl_trie.$const176$gerund;
                if (nl_trie.NIL == conses_high.member(item_var, preds, Symbols.symbol_function((SubLObject)nl_trie.EQL), Symbols.symbol_function((SubLObject)nl_trie.IDENTITY))) {
                    preds = (SubLObject)ConsesLow.cons(item_var, preds);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return preds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 165087L)
    public static SubLObject nl_trie_preds_of_pos(final SubLObject pos) {
        SubLObject caching_state = nl_trie.$nl_trie_preds_of_pos_caching_state$.getGlobalValue();
        if (nl_trie.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)nl_trie.$sym376$NL_TRIE_PREDS_OF_POS, (SubLObject)nl_trie.$sym379$_NL_TRIE_PREDS_OF_POS_CACHING_STATE_, (SubLObject)nl_trie.$int348$128, (SubLObject)nl_trie.EQL, (SubLObject)nl_trie.ONE_INTEGER, (SubLObject)nl_trie.$int356$32);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pos, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(nl_trie_preds_of_pos_internal(pos)));
            memoization_state.caching_state_put(caching_state, pos, results, (SubLObject)nl_trie.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 165515L)
    public static SubLObject clear_nl_trie_pos_of_pred() {
        final SubLObject cs = nl_trie.$nl_trie_pos_of_pred_caching_state$.getGlobalValue();
        if (nl_trie.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 165515L)
    public static SubLObject remove_nl_trie_pos_of_pred(final SubLObject pred) {
        return memoization_state.caching_state_remove_function_results_with_args(nl_trie.$nl_trie_pos_of_pred_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(pred), (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 165515L)
    public static SubLObject nl_trie_pos_of_pred_internal(final SubLObject pred) {
        return (SubLObject)((nl_trie.NIL != lexicon_accessors.speech_part_predP(pred, (SubLObject)nl_trie.UNPROVIDED)) ? kb_mapping_utilities.pred_values_in_any_mt(pred, nl_trie.$const377$speechPartPreds, (SubLObject)nl_trie.TWO_INTEGER, (SubLObject)nl_trie.ONE_INTEGER, (SubLObject)nl_trie.UNPROVIDED) : nl_trie.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 165515L)
    public static SubLObject nl_trie_pos_of_pred(final SubLObject pred) {
        SubLObject caching_state = nl_trie.$nl_trie_pos_of_pred_caching_state$.getGlobalValue();
        if (nl_trie.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)nl_trie.$sym380$NL_TRIE_POS_OF_PRED, (SubLObject)nl_trie.$sym381$_NL_TRIE_POS_OF_PRED_CACHING_STATE_, (SubLObject)nl_trie.$int348$128, (SubLObject)nl_trie.EQL, (SubLObject)nl_trie.ONE_INTEGER, (SubLObject)nl_trie.$int172$64);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(nl_trie_pos_of_pred_internal(pred)));
            memoization_state.caching_state_put(caching_state, pred, results, (SubLObject)nl_trie.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 165766L)
    public static SubLObject nl_trie_strings_of_word_unit(final SubLObject wu, final SubLObject pred_list, final SubLObject mt, SubLObject include_supportsP) {
        if (include_supportsP == nl_trie.UNPROVIDED) {
            include_supportsP = (SubLObject)nl_trie.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject strings = (SubLObject)nl_trie.NIL;
        if (nl_trie.NIL != include_supportsP) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                strings = lexicon_cache.strings_of_word_unit_with_supports(wu, pred_list);
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            strings = lexicon_cache.strings_of_word_unit(wu, pred_list, (SubLObject)nl_trie.NIL, mt);
        }
        return strings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 167144L)
    public static SubLObject nl_trie_string_tokenize(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject tokens = (SubLObject)((nl_trie.NIL != nl_trie_single_token_stringP(string)) ? ConsesLow.list(string) : string_utilities.nl_string_tokenize(string, string_utilities.whitespace_chars(), (SubLObject)nl_trie.NIL, (SubLObject)nl_trie.NIL, (SubLObject)nl_trie.NIL, (SubLObject)nl_trie.NIL, nl_trie.$nl_trie_break_list$.getDynamicValue(thread)));
        SubLObject ans = (SubLObject)nl_trie.NIL;
        final SubLObject _prev_bind_0 = lexicon_macros.$nl_trie_assume_standardized_stringsP$.currentBinding(thread);
        try {
            lexicon_macros.$nl_trie_assume_standardized_stringsP$.bind((SubLObject)nl_trie.NIL, thread);
            ans = nl_trie_standardize_strings(tokens).first();
        }
        finally {
            lexicon_macros.$nl_trie_assume_standardized_stringsP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)((nl_trie.NIL != ans) ? ans : ConsesLow.list(string));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 167757L)
    public static SubLObject nl_trie_string_tokenize_multiple(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject tokens = (SubLObject)((nl_trie.NIL != nl_trie_single_token_stringP(string)) ? ConsesLow.list(string) : string_utilities.nl_string_tokenize(string, string_utilities.whitespace_chars(), (SubLObject)nl_trie.NIL, (SubLObject)nl_trie.NIL, (SubLObject)nl_trie.NIL, (SubLObject)nl_trie.NIL, nl_trie.$nl_trie_break_list$.getDynamicValue(thread)));
        SubLObject ans = (SubLObject)nl_trie.NIL;
        final SubLObject _prev_bind_0 = lexicon_macros.$nl_trie_assume_standardized_stringsP$.currentBinding(thread);
        try {
            lexicon_macros.$nl_trie_assume_standardized_stringsP$.bind((SubLObject)nl_trie.NIL, thread);
            ans = nl_trie_standardize_strings(tokens);
        }
        finally {
            lexicon_macros.$nl_trie_assume_standardized_stringsP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)((nl_trie.NIL != ans) ? ans : ConsesLow.list((SubLObject)ConsesLow.list(string)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 168434L)
    public static SubLObject nl_trie_single_token_stringP(final SubLObject string) {
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL == Sequences.find((SubLObject)Characters.CHAR_space, string, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED) && nl_trie.NIL == Sequences.find_if((SubLObject)nl_trie.$sym383$NL_TRIE_BREAK_CHAR_P, string, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 168576L)
    public static SubLObject nl_trie_strings_keys(final SubLObject strings) {
        return nl_trie_standardize_strings(strings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 168877L)
    public static SubLObject nl_trie_standardize_strings(final SubLObject strings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (nl_trie.NIL != lexicon_macros.$nl_trie_assume_standardized_stringsP$.getDynamicValue(thread)) {
            return Values.values((SubLObject)ConsesLow.list(strings), (SubLObject)ConsesLow.list((SubLObject)nl_trie.NIL));
        }
        return nl_trie_standardize_strings_int(strings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 169390L)
    public static SubLObject nl_trie_standardize_strings_int(final SubLObject strings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject standardized_lists = (SubLObject)nl_trie.NIL;
        SubLObject alterations_lists = (SubLObject)nl_trie.NIL;
        SubLObject removal_list = (SubLObject)nl_trie.NIL;
        SubLObject removal_list_$130 = (SubLObject)nl_trie.NIL;
        SubLObject substring_removal_list = (SubLObject)nl_trie.NIL;
        SubLObject substring_removal_list_$131 = (SubLObject)nl_trie.NIL;
        removal_list = (SubLObject)nl_trie.$list384;
        removal_list_$130 = removal_list.first();
        substring_removal_list = (SubLObject)nl_trie.$list385;
        substring_removal_list_$131 = substring_removal_list.first();
        while (nl_trie.NIL != substring_removal_list || nl_trie.NIL != removal_list) {
            SubLObject stack = (SubLObject)nl_trie.NIL;
            SubLObject alterations = (SubLObject)nl_trie.NIL;
            SubLObject list_var = (SubLObject)nl_trie.NIL;
            SubLObject string = (SubLObject)nl_trie.NIL;
            SubLObject i = (SubLObject)nl_trie.NIL;
            list_var = strings;
            string = list_var.first();
            for (i = (SubLObject)nl_trie.ZERO_INTEGER; nl_trie.NIL != list_var; list_var = list_var.rest(), string = list_var.first(), i = Numbers.add((SubLObject)nl_trie.ONE_INTEGER, i)) {
                if (nl_trie.NIL != unicode_nauts.unicode_naut_p(string, (SubLObject)nl_trie.UNPROVIDED)) {
                    stack = (SubLObject)ConsesLow.cons(string, stack);
                }
                else if (nl_trie.NIL != conses_high.member(string, removal_list_$130, Symbols.symbol_function((SubLObject)nl_trie.EQUAL), (SubLObject)nl_trie.UNPROVIDED)) {
                    alterations = list_utilities.alist_enter(alterations, i, (SubLObject)nl_trie.ZERO_INTEGER, (SubLObject)nl_trie.UNPROVIDED);
                }
                else if (nl_trie.NIL != nl_trie_break_char_exception_string_p(string)) {
                    stack = (SubLObject)ConsesLow.cons(string, stack);
                }
                else if (nl_trie.NIL != string_utilities.ends_with(string, (SubLObject)nl_trie.$str386$_, (SubLObject)nl_trie.UNPROVIDED)) {
                    stack = (SubLObject)ConsesLow.cons(string, stack);
                }
                else if (nl_trie.NIL != Sequences.find_if((SubLObject)nl_trie.$sym387$DIGIT_CHAR_P, string, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED)) {
                    stack = (SubLObject)ConsesLow.cons(string, stack);
                }
                else {
                    final SubLObject no_dots = Sequences.remove((SubLObject)Characters.CHAR_period, string, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
                    final SubLObject substrings = string_utilities.string_tokenize(no_dots, substring_removal_list_$131, (SubLObject)nl_trie.NIL, (SubLObject)nl_trie.NIL, (SubLObject)nl_trie.T, (SubLObject)nl_trie.NIL, (SubLObject)nl_trie.$list388);
                    if (nl_trie.NIL == list_utilities.lengthE(substrings, (SubLObject)nl_trie.ONE_INTEGER, (SubLObject)nl_trie.UNPROVIDED)) {
                        alterations = list_utilities.alist_enter(alterations, i, Sequences.length(substrings), (SubLObject)nl_trie.UNPROVIDED);
                    }
                    SubLObject cdolist_list_var = substrings;
                    SubLObject substring = (SubLObject)nl_trie.NIL;
                    substring = cdolist_list_var.first();
                    while (nl_trie.NIL != cdolist_list_var) {
                        stack = (SubLObject)ConsesLow.cons(substring, stack);
                        cdolist_list_var = cdolist_list_var.rest();
                        substring = cdolist_list_var.first();
                    }
                }
            }
            if (nl_trie.NIL != nl_trie.$nl_trie_use_two_letter_stringsP$.getDynamicValue(thread)) {
                SubLObject new_stack = (SubLObject)nl_trie.NIL;
                SubLObject cdolist_list_var2 = stack;
                SubLObject string2 = (SubLObject)nl_trie.NIL;
                string2 = cdolist_list_var2.first();
                while (nl_trie.NIL != cdolist_list_var2) {
                    if (nl_trie.NIL != list_utilities.lengthG(string2, (SubLObject)nl_trie.TWO_INTEGER, (SubLObject)nl_trie.UNPROVIDED)) {
                        new_stack = (SubLObject)ConsesLow.cons(string_utilities.char_list_to_string((SubLObject)ConsesLow.list(string_utilities.first_char(string2), string_utilities.last_char(string2))), new_stack);
                    }
                    else {
                        new_stack = (SubLObject)ConsesLow.cons(string2, new_stack);
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    string2 = cdolist_list_var2.first();
                }
                stack = Sequences.nreverse(new_stack);
            }
            stack = Sequences.nreverse(stack);
            if (nl_trie.NIL == subl_promotions.memberP(stack, standardized_lists, (SubLObject)nl_trie.EQUAL, (SubLObject)nl_trie.UNPROVIDED)) {
                standardized_lists = (SubLObject)ConsesLow.cons(stack, standardized_lists);
                alterations_lists = (SubLObject)ConsesLow.cons(alterations, alterations_lists);
            }
            removal_list = removal_list.rest();
            removal_list_$130 = removal_list.first();
            substring_removal_list = substring_removal_list.rest();
            substring_removal_list_$131 = substring_removal_list.first();
        }
        return Values.values(standardized_lists, alterations_lists);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 171181L)
    public static SubLObject nl_trie_break_char_exception_string_p(final SubLObject string) {
        SubLObject exceptionP = list_utilities.lengthL(string, (SubLObject)nl_trie.TWO_INTEGER, (SubLObject)nl_trie.UNPROVIDED);
        if (nl_trie.NIL == exceptionP) {
            SubLObject unexceptionalP = (SubLObject)nl_trie.NIL;
            final SubLObject first_char_result = nl_trie_break_char_p(string_utilities.first_char(string));
            final SubLObject end_var = Sequences.length(string);
            if (nl_trie.NIL == unexceptionalP) {
                SubLObject end_var_$132;
                SubLObject char_num;
                SubLObject v_char;
                for (end_var_$132 = end_var, char_num = (SubLObject)nl_trie.NIL, char_num = (SubLObject)nl_trie.ONE_INTEGER; nl_trie.NIL == unexceptionalP && !char_num.numGE(end_var_$132); unexceptionalP = (SubLObject)SubLObjectFactory.makeBoolean(!nl_trie_break_char_p(v_char).eql(first_char_result)), char_num = number_utilities.f_1X(char_num)) {
                    v_char = Strings.sublisp_char(string, char_num);
                }
            }
            exceptionP = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL == unexceptionalP);
        }
        return exceptionP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 171708L)
    public static SubLObject nl_trie_break_char_p(final SubLObject v_char) {
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL != Characters.charE(v_char, (SubLObject)Characters.CHAR_hyphen) || nl_trie.NIL != Characters.charE(v_char, (SubLObject)Characters.CHAR_period) || nl_trie.NIL != Characters.charE(v_char, (SubLObject)Characters.CHAR_slash) || nl_trie.NIL != Characters.charE(v_char, (SubLObject)Characters.CHAR_quote) || nl_trie.NIL != string_utilities.whitespace_charP(v_char) || nl_trie.NIL != string_utilities.grammatical_punctuation_charP(v_char));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 172032L)
    public static SubLObject nl_trie_not_present_message(final SubLObject v_nl_trie) {
        nl_trie_warn((SubLObject)nl_trie.ONE_INTEGER, (SubLObject)nl_trie.$str389$_a_is_not_currently_an_NL_Trie_, v_nl_trie, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
        return (SubLObject)nl_trie.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 172439L)
    public static SubLObject nl_trie_warn_bad_add(final SubLObject assertion) {
        return nl_trie_warn((SubLObject)nl_trie.TWO_INTEGER, (SubLObject)nl_trie.$str390$Couldn_t_find_any_strings_to_add_, assertion, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 172574L)
    public static SubLObject nl_trie_warn_bad_remove(final SubLObject assertion) {
        return nl_trie_warn((SubLObject)nl_trie.TWO_INTEGER, (SubLObject)nl_trie.$str391$Couldn_t_find_any_strings_to_remo, assertion, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 172717L)
    public static SubLObject nl_trie_warn(final SubLObject level, final SubLObject format_string, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4) {
        if (arg1 == nl_trie.UNPROVIDED) {
            arg1 = (SubLObject)nl_trie.NIL;
        }
        if (arg2 == nl_trie.UNPROVIDED) {
            arg2 = (SubLObject)nl_trie.NIL;
        }
        if (arg3 == nl_trie.UNPROVIDED) {
            arg3 = (SubLObject)nl_trie.NIL;
        }
        if (arg4 == nl_trie.UNPROVIDED) {
            arg4 = (SubLObject)nl_trie.NIL;
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 173103L)
    public static SubLObject nl_trie_error(final SubLObject format_string, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4) {
        if (arg1 == nl_trie.UNPROVIDED) {
            arg1 = (SubLObject)nl_trie.NIL;
        }
        if (arg2 == nl_trie.UNPROVIDED) {
            arg2 = (SubLObject)nl_trie.NIL;
        }
        if (arg3 == nl_trie.UNPROVIDED) {
            arg3 = (SubLObject)nl_trie.NIL;
        }
        if (arg4 == nl_trie.UNPROVIDED) {
            arg4 = (SubLObject)nl_trie.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (nl_trie.NIL != nl_trie.$nl_trie_break_on_errorP$.getDynamicValue(thread)) {
            Errors.error(format_string, new SubLObject[] { arg1, arg2, arg3, arg4 });
        }
        else {
            nl_trie_warn((SubLObject)nl_trie.ONE_INTEGER, Sequences.cconcatenate((SubLObject)nl_trie.$str392$error_, format_string), arg1, arg2, arg3, arg4);
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 173358L)
    public static SubLObject nl_trie_syntactic_preds_for_pos(final SubLObject pos) {
        return conses_high.intersection(nl_trie_preds_of_pos(pos), nl_trie_syntactic_predicates(), (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 173708L)
    public static SubLObject find_morphologically_derivable_strings(final SubLObject wu, final SubLObject string, final SubLObject spp_pred, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject str_pred_list = (SubLObject)nl_trie.NIL;
        if (nl_trie.NIL != nl_trie.$nl_trie_include_derived_formsP$.getDynamicValue(thread)) {
            SubLObject cdolist_list_var = morphology.pos_preds_derivable_from_pred(spp_pred, mt);
            SubLObject pred = (SubLObject)nl_trie.NIL;
            pred = cdolist_list_var.first();
            while (nl_trie.NIL != cdolist_list_var) {
                if (nl_trie.NIL != lexicon_cache.ok_to_derive_word_form_from_predP(wu, pred, spp_pred, mt)) {
                    final SubLObject dep_str_list = morphology.generate_regular_strings_from_form(pred, spp_pred, string, mt, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
                    if (nl_trie.NIL != dep_str_list) {
                        str_pred_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(dep_str_list, pred), str_pred_list);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            }
        }
        return str_pred_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 174453L)
    public static SubLObject get_nl_trie_name_pragmatic_features(final SubLObject name_entry) {
        if (nl_trie.NIL != assertion_handles.assertion_p(name_entry)) {
            return get_assertion_pragmatic_features(name_entry);
        }
        nl_trie_warn((SubLObject)nl_trie.TWO_INTEGER, (SubLObject)nl_trie.$str393$Unable_to_determine_pragmatic_fea, name_entry, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 175055L)
    public static SubLObject get_assertion_pragmatic_features(final SubLObject assertion) {
        SubLObject pragmatic_features = (SubLObject)nl_trie.NIL;
        SubLObject cdolist_list_var = nl_trie_pragmatic_predicates();
        SubLObject prag_pred = (SubLObject)nl_trie.NIL;
        prag_pred = cdolist_list_var.first();
        while (nl_trie.NIL != cdolist_list_var) {
            final SubLObject prag_pred_feats = get_pragmatic_features(assertion, prag_pred);
            pragmatic_features = ConsesLow.append(pragmatic_features, prag_pred_feats);
            cdolist_list_var = cdolist_list_var.rest();
            prag_pred = cdolist_list_var.first();
        }
        return pragmatic_features;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 175653L)
    public static SubLObject get_pragmatic_features(final SubLObject assertion, final SubLObject prag_pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)nl_trie.NIL;
        if (nl_trie.NIL != assertion_utilities.assertion_has_meta_assertionsP(assertion)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(nl_trie.$nl_trie_lexical_mt$.getGlobalValue());
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            final SubLObject _prev_bind_4 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
            final SubLObject _prev_bind_5 = pred_relevance_macros.$pred$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                pred_relevance_macros.$relevant_pred_function$.bind((SubLObject)nl_trie.$sym367$RELEVANT_PRED_IS_EQ, thread);
                pred_relevance_macros.$pred$.bind(prag_pred, thread);
                SubLObject pred_var = (SubLObject)nl_trie.NIL;
                if (nl_trie.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(assertion, (SubLObject)nl_trie.TWO_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(assertion, (SubLObject)nl_trie.TWO_INTEGER, pred_var);
                    SubLObject done_var = (SubLObject)nl_trie.NIL;
                    final SubLObject token_var = (SubLObject)nl_trie.NIL;
                    while (nl_trie.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (nl_trie.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)nl_trie.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)nl_trie.$kw326$GAF, (SubLObject)nl_trie.$kw327$TRUE, (SubLObject)nl_trie.NIL);
                                SubLObject done_var_$133 = (SubLObject)nl_trie.NIL;
                                final SubLObject token_var_$134 = (SubLObject)nl_trie.NIL;
                                while (nl_trie.NIL == done_var_$133) {
                                    final SubLObject meta_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$134);
                                    final SubLObject valid_$135 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$134.eql(meta_assertion));
                                    if (nl_trie.NIL != valid_$135) {
                                        final SubLObject prag_req = assertions_high.gaf_arg1(meta_assertion);
                                        final SubLObject prag_feat = (SubLObject)(cycl_utilities.formula_arg0(prag_req).eql(nl_trie.$const394$pragmaticallyAcceptable) ? cycl_utilities.formula_arg1(prag_req, (SubLObject)nl_trie.UNPROVIDED) : nl_trie.NIL);
                                        final SubLObject prag_mt = assertions_high.assertion_mt(meta_assertion);
                                        result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(prag_feat, prag_mt), result);
                                    }
                                    done_var_$133 = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL == valid_$135);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$136 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nl_trie.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (nl_trie.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$136, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL == valid);
                    }
                }
                pred_var = (SubLObject)nl_trie.NIL;
                if (nl_trie.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(assertion, (SubLObject)nl_trie.ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(assertion, (SubLObject)nl_trie.ONE_INTEGER, pred_var);
                    SubLObject done_var = (SubLObject)nl_trie.NIL;
                    final SubLObject token_var = (SubLObject)nl_trie.NIL;
                    while (nl_trie.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (nl_trie.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)nl_trie.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)nl_trie.$kw326$GAF, (SubLObject)nl_trie.$kw327$TRUE, (SubLObject)nl_trie.NIL);
                                SubLObject done_var_$134 = (SubLObject)nl_trie.NIL;
                                final SubLObject token_var_$135 = (SubLObject)nl_trie.NIL;
                                while (nl_trie.NIL == done_var_$134) {
                                    final SubLObject meta_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$135);
                                    final SubLObject valid_$136 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$135.eql(meta_assertion));
                                    if (nl_trie.NIL != valid_$136) {
                                        final SubLObject prag_feat2 = assertions_high.gaf_arg2(meta_assertion);
                                        final SubLObject prag_mt2 = assertions_high.assertion_mt(meta_assertion);
                                        result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(prag_feat2, prag_mt2), result);
                                    }
                                    done_var_$134 = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL == valid_$136);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$137 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nl_trie.T, thread);
                                    final SubLObject _values2 = Values.getValuesAsVector();
                                    if (nl_trie.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values2);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$137, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL == valid);
                    }
                }
            }
            finally {
                pred_relevance_macros.$pred$.rebind(_prev_bind_5, thread);
                pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_4, thread);
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 176837L)
    public static SubLObject find_pos_preds_for_lex_const_internal(final SubLObject v_const) {
        if (nl_trie.NIL != lexicon_accessors.speech_part_predP(v_const, (SubLObject)nl_trie.UNPROVIDED)) {
            return (SubLObject)ConsesLow.list(v_const);
        }
        if (nl_trie.NIL != lexicon_accessors.speech_partP(v_const, (SubLObject)nl_trie.UNPROVIDED)) {
            return remove_genl_pos_preds(Sequences.nreverse(lexicon_utilities.preds_of_pos(v_const, (SubLObject)nl_trie.UNPROVIDED)));
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 176837L)
    public static SubLObject find_pos_preds_for_lex_const(final SubLObject v_const) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)nl_trie.NIL;
        if (nl_trie.NIL == v_memoization_state) {
            return find_pos_preds_for_lex_const_internal(v_const);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)nl_trie.$sym395$FIND_POS_PREDS_FOR_LEX_CONST, (SubLObject)nl_trie.UNPROVIDED);
        if (nl_trie.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)nl_trie.$sym395$FIND_POS_PREDS_FOR_LEX_CONST, (SubLObject)nl_trie.ONE_INTEGER, (SubLObject)nl_trie.NIL, (SubLObject)nl_trie.EQL, (SubLObject)nl_trie.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)nl_trie.$sym395$FIND_POS_PREDS_FOR_LEX_CONST, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_const, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(find_pos_preds_for_lex_const_internal(v_const)));
            memoization_state.caching_state_put(caching_state, v_const, results, (SubLObject)nl_trie.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 177278L)
    public static SubLObject remove_genl_pos_preds(final SubLObject preds) {
        if (!preds.isList()) {
            return (SubLObject)nl_trie.NIL;
        }
        SubLObject ans = (SubLObject)nl_trie.NIL;
        SubLObject remain;
        SubLObject current;
        SubLObject datum;
        SubLObject now;
        SubLObject later;
        for (remain = (SubLObject)nl_trie.NIL, remain = preds; nl_trie.NIL != remain; remain = remain.rest()) {
            datum = (current = remain);
            now = (SubLObject)nl_trie.NIL;
            later = (SubLObject)nl_trie.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list396);
            now = current.first();
            current = (later = current.rest());
            if (nl_trie.NIL == subl_promotions.memberP(now, later, (SubLObject)nl_trie.$sym397$SPEC_POS_PRED_, (SubLObject)nl_trie.UNPROVIDED) && nl_trie.NIL == conses_high.member(now, ans, (SubLObject)nl_trie.$sym397$SPEC_POS_PRED_, (SubLObject)nl_trie.UNPROVIDED)) {
                ans = (SubLObject)ConsesLow.cons(now, ans);
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 177694L)
    public static SubLObject find_pos_for_lex_const(final SubLObject v_const) {
        if (nl_trie.NIL != lexicon_accessors.speech_part_predP(v_const, (SubLObject)nl_trie.UNPROVIDED)) {
            final SubLObject all_pos = nl_trie_pos_of_pred(v_const);
            return (SubLObject)((nl_trie.NIL != all_pos) ? ((nl_trie.NIL != list_utilities.singletonP(all_pos)) ? all_pos.first() : genls.min_ceiling_cols(all_pos, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED).first()) : nl_trie.NIL);
        }
        if (nl_trie.NIL != lexicon_accessors.speech_partP(v_const, (SubLObject)nl_trie.UNPROVIDED)) {
            return v_const;
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 178141L)
    public static SubLObject nl_trie_syntactic_predP(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(fort.eql(nl_trie.$const140$partOfSpeech) || (nl_trie.NIL != lexicon_accessors.speech_part_predP(fort, lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread)) && nl_trie.NIL != has_pos_of_predP(fort)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 178516L)
    public static SubLObject english_lexical_mtP(final SubLObject mt) {
        return lexicon_accessors.genl_lexicon_mtP(mt, nl_trie.$const44$EnglishLexiconMt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 178608L)
    public static SubLObject has_pos_of_predP(final SubLObject pred) {
        return list_utilities.sublisp_boolean(nl_trie_pos_of_pred(pred));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 178761L)
    public static SubLObject nl_trie_semantic_predP(final SubLObject fort) {
        return isa.isa_in_any_mtP(fort, nl_trie.$const324$NLSemanticPredicate);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 179086L)
    public static SubLObject clear_nl_trie_name_string_preds() {
        if (nl_trie.NIL != lexicon_vars.lex_pred_set_p(nl_trie.$nl_trie_name_string_preds_set$.getGlobalValue())) {
            lexicon_vars.clear_lex_pred_set(nl_trie.$nl_trie_name_string_preds_set$.getGlobalValue());
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 179301L)
    public static SubLObject initialize_nl_trie_name_string_preds() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (nl_trie.NIL == lexicon_vars.lex_pred_set_p(nl_trie.$nl_trie_name_string_preds_set$.getGlobalValue())) {
            nl_trie.$nl_trie_name_string_preds_set$.setGlobalValue(lexicon_vars.new_lex_pred_set());
        }
        final SubLObject rw_lock_var = locking_map.locking_map_lock(nl_trie.$nl_trie_name_string_preds_set$.getGlobalValue());
        SubLObject needs_to_releaseP = (SubLObject)nl_trie.NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            map_utilities.map_remove_all(nl_trie.$nl_trie_name_string_preds_set$.getGlobalValue());
            SubLObject iterator = map_utilities.new_map_iterator(lexicon_vars.name_string_preds_set((SubLObject)nl_trie.T));
            SubLObject valid;
            for (SubLObject done_var = (SubLObject)nl_trie.NIL; nl_trie.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject var = iteration.iteration_next(iterator);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (nl_trie.NIL != valid) {
                    SubLObject current;
                    final SubLObject datum = current = var;
                    SubLObject pred = (SubLObject)nl_trie.NIL;
                    SubLObject value = (SubLObject)nl_trie.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list399);
                    pred = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list399);
                    value = current.first();
                    current = current.rest();
                    if (nl_trie.NIL == current) {
                        map_utilities.map_put(nl_trie.$nl_trie_name_string_preds_set$.getGlobalValue(), pred, (SubLObject)nl_trie.T);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_trie.$list399);
                    }
                }
            }
            iterator = map_utilities.new_map_iterator(lexicon_vars.term_strings_preds_set((SubLObject)nl_trie.T));
            for (SubLObject done_var = (SubLObject)nl_trie.NIL; nl_trie.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(nl_trie.NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject var = iteration.iteration_next(iterator);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (nl_trie.NIL != valid) {
                    SubLObject current;
                    final SubLObject datum = current = var;
                    SubLObject pred = (SubLObject)nl_trie.NIL;
                    SubLObject value = (SubLObject)nl_trie.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list399);
                    pred = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_trie.$list399);
                    value = current.first();
                    current = current.rest();
                    if (nl_trie.NIL == current) {
                        map_utilities.map_put(nl_trie.$nl_trie_name_string_preds_set$.getGlobalValue(), pred, (SubLObject)nl_trie.T);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_trie.$list399);
                    }
                }
            }
        }
        finally {
            if (nl_trie.NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
        return nl_trie.$nl_trie_name_string_preds_set$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 180015L)
    public static SubLObject nl_trie_name_string_preds() {
        if (nl_trie.NIL == lexicon_vars.lex_pred_set_p(nl_trie.$nl_trie_name_string_preds_set$.getGlobalValue())) {
            nl_trie.$nl_trie_name_string_preds_set$.setGlobalValue(lexicon_vars.new_lex_pred_set());
        }
        final SubLObject rw_lock_var = locking_map.locking_map_lock(nl_trie.$nl_trie_name_string_preds_set$.getGlobalValue());
        SubLObject needs_to_releaseP = (SubLObject)nl_trie.NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            if (nl_trie.NIL != lexicon_vars.lex_pred_set_uninitializedP(nl_trie.$nl_trie_name_string_preds_set$.getGlobalValue())) {
                initialize_nl_trie_name_string_preds();
            }
            return lexicon_vars.lex_pred_set_element_list(nl_trie.$nl_trie_name_string_preds_set$.getGlobalValue());
        }
        finally {
            if (nl_trie.NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 180744L)
    public static SubLObject nl_trie_name_string_predP(final SubLObject pred) {
        if (nl_trie.NIL == lexicon_vars.lex_pred_set_p(nl_trie.$nl_trie_name_string_preds_set$.getGlobalValue())) {
            nl_trie.$nl_trie_name_string_preds_set$.setGlobalValue(lexicon_vars.new_lex_pred_set());
        }
        final SubLObject rw_lock_var = locking_map.locking_map_lock(nl_trie.$nl_trie_name_string_preds_set$.getGlobalValue());
        SubLObject needs_to_releaseP = (SubLObject)nl_trie.NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            if (nl_trie.NIL != lexicon_vars.lex_pred_set_uninitializedP(nl_trie.$nl_trie_name_string_preds_set$.getGlobalValue())) {
                initialize_nl_trie_name_string_preds();
            }
            return lexicon_vars.lex_pred_set_memberP(pred, nl_trie.$nl_trie_name_string_preds_set$.getGlobalValue());
        }
        finally {
            if (nl_trie.NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 181295L)
    public static SubLObject nl_trie_pragmatic_predP(final SubLObject fort) {
        return isa.isa_in_any_mtP(fort, nl_trie.$const315$NLPragmaticPredicate_New);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 181501L)
    public static SubLObject triefy_reifiable_function_extent(final SubLObject function) {
        return Mapping.mapcar((SubLObject)nl_trie.$sym401$TRIEFY_NART, function_terms.narts_of_function(function));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 185194L)
    public static SubLObject triefy_nart(final SubLObject nart) {
        SubLObject cdolist_list_var;
        final SubLObject strings = cdolist_list_var = pph_methods_lexicon.all_phrases_for_term(nart, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED, (SubLObject)nl_trie.UNPROVIDED);
        SubLObject string = (SubLObject)nl_trie.NIL;
        string = cdolist_list_var.first();
        while (nl_trie.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$141 = nl_trie_string_tokenize_multiple(cycl_string.cycl_string_to_utf8_string(string));
            SubLObject key = (SubLObject)nl_trie.NIL;
            key = cdolist_list_var_$141.first();
            while (nl_trie.NIL != cdolist_list_var_$141) {
                nl_trie_insert_name(get_nl_trie(), key, nart);
                cdolist_list_var_$141 = cdolist_list_var_$141.rest();
                key = cdolist_list_var_$141.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        }
        return (SubLObject)nl_trie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 185462L)
    public static SubLObject new_nl_trie_iterator(SubLObject v_nl_trie) {
        if (v_nl_trie == nl_trie.UNPROVIDED) {
            v_nl_trie = nl_trie.$nl_trie$.getGlobalValue();
        }
        assert nl_trie.NIL != nl_trie_p(v_nl_trie, (SubLObject)nl_trie.UNPROVIDED) : v_nl_trie;
        return iteration.new_iterator(make_nl_trie_iterator_state(v_nl_trie), (SubLObject)nl_trie.$sym403$NL_TRIE_ITERATOR_DONE, (SubLObject)nl_trie.$sym404$NL_TRIE_ITERATOR_NEXT, (SubLObject)nl_trie.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 186014L)
    public static SubLObject make_nl_trie_iterator_state(final SubLObject v_nl_trie) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject is_current_nl_trie_p = Equality.eq(v_nl_trie, get_nl_trie());
        SubLObject iterator = (SubLObject)nl_trie.NIL;
        if (nl_trie.NIL != is_current_nl_trie_p) {
            SubLObject release = (SubLObject)nl_trie.NIL;
            try {
                release = Locks.seize_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
                final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
                final SubLObject _prev_bind_2 = file_vector_utilities.$current_backed_map_cache_strategy$.currentBinding(thread);
                try {
                    file_vector_utilities.$file_vector_backed_map_read_lock$.bind(nl_trie.$nl_trie_lock$.getGlobalValue(), thread);
                    file_vector_utilities.$current_backed_map_cache_strategy$.bind(nl_trie.$nl_trie_cache_strategy$.getGlobalValue(), thread);
                    iterator = strie.new_strie_iterator(v_nl_trie);
                }
                finally {
                    file_vector_utilities.$current_backed_map_cache_strategy$.rebind(_prev_bind_2, thread);
                    file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
                }
            }
            finally {
                if (nl_trie.NIL != release) {
                    Locks.release_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
                }
            }
        }
        else {
            iterator = strie.new_strie_iterator(v_nl_trie);
        }
        return (SubLObject)ConsesLow.list(iterator, is_current_nl_trie_p);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 186444L)
    public static SubLObject nl_trie_iterator_done(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)nl_trie.NIL;
        SubLObject iterator = (SubLObject)nl_trie.NIL;
        SubLObject is_current_nl_trie_p = (SubLObject)nl_trie.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)nl_trie.$list405);
        iterator = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)nl_trie.$list405);
        is_current_nl_trie_p = current.first();
        current = current.rest();
        if (nl_trie.NIL == current) {
            if (nl_trie.NIL != is_current_nl_trie_p) {
                SubLObject release = (SubLObject)nl_trie.NIL;
                try {
                    release = Locks.seize_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
                    final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = file_vector_utilities.$current_backed_map_cache_strategy$.currentBinding(thread);
                    try {
                        file_vector_utilities.$file_vector_backed_map_read_lock$.bind(nl_trie.$nl_trie_lock$.getGlobalValue(), thread);
                        file_vector_utilities.$current_backed_map_cache_strategy$.bind(nl_trie.$nl_trie_cache_strategy$.getGlobalValue(), thread);
                        result = iteration.iteration_done(iterator);
                    }
                    finally {
                        file_vector_utilities.$current_backed_map_cache_strategy$.rebind(_prev_bind_2, thread);
                        file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
                    }
                }
                finally {
                    if (nl_trie.NIL != release) {
                        Locks.release_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
                    }
                }
            }
            else {
                result = iteration.iteration_done(iterator);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)nl_trie.$list405);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 186852L)
    public static SubLObject nl_trie_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject next = (SubLObject)nl_trie.NIL;
        SubLObject valid = (SubLObject)nl_trie.NIL;
        SubLObject iterator = (SubLObject)nl_trie.NIL;
        SubLObject is_current_nl_trie_p = (SubLObject)nl_trie.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)nl_trie.$list405);
        iterator = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)nl_trie.$list405);
        is_current_nl_trie_p = current.first();
        current = current.rest();
        if (nl_trie.NIL == current) {
            if (nl_trie.NIL != is_current_nl_trie_p) {
                SubLObject release = (SubLObject)nl_trie.NIL;
                try {
                    release = Locks.seize_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
                    final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = file_vector_utilities.$current_backed_map_cache_strategy$.currentBinding(thread);
                    try {
                        file_vector_utilities.$file_vector_backed_map_read_lock$.bind(nl_trie.$nl_trie_lock$.getGlobalValue(), thread);
                        file_vector_utilities.$current_backed_map_cache_strategy$.bind(nl_trie.$nl_trie_cache_strategy$.getGlobalValue(), thread);
                        thread.resetMultipleValues();
                        final SubLObject next_$142 = iteration.iteration_next(iterator);
                        final SubLObject valid_$143 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        next = next_$142;
                        valid = valid_$143;
                    }
                    finally {
                        file_vector_utilities.$current_backed_map_cache_strategy$.rebind(_prev_bind_2, thread);
                        file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
                    }
                }
                finally {
                    if (nl_trie.NIL != release) {
                        Locks.release_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
                    }
                }
            }
            else {
                thread.resetMultipleValues();
                final SubLObject next_$143 = iteration.iteration_next(iterator);
                final SubLObject valid_$144 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                next = next_$143;
                valid = valid_$144;
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)nl_trie.$list405);
        }
        if (nl_trie.NIL == valid) {
            return Values.values((SubLObject)nl_trie.NIL, state, (SubLObject)nl_trie.T);
        }
        return Values.values(next, state, (SubLObject)nl_trie.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-trie.lisp", position = 189567L)
    public static SubLObject test_swappable_nl_trie_dump(final SubLObject key_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_strie = strie.new_strie((SubLObject)nl_trie.UNPROVIDED);
        SubLObject list_var = (SubLObject)nl_trie.NIL;
        SubLObject key = (SubLObject)nl_trie.NIL;
        SubLObject index = (SubLObject)nl_trie.NIL;
        list_var = key_list;
        key = list_var.first();
        for (index = (SubLObject)nl_trie.ZERO_INTEGER; nl_trie.NIL != list_var; list_var = list_var.rest(), key = list_var.first(), index = Numbers.add((SubLObject)nl_trie.ONE_INTEGER, index)) {
            strie.strie_insert(v_strie, key, index);
        }
        final SubLObject temp_index_file = file_utilities.make_prefixed_temp_filename((SubLObject)nl_trie.$str418$index, (SubLObject)nl_trie.UNPROVIDED);
        final SubLObject temp_data_file = file_utilities.make_prefixed_temp_filename((SubLObject)nl_trie.$str419$data, (SubLObject)nl_trie.UNPROVIDED);
        SubLObject errmsg = (SubLObject)nl_trie.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)nl_trie.$sym330$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    SubLObject fvector = (SubLObject)nl_trie.NIL;
                    try {
                        fvector = file_vector.new_file_vector(temp_data_file, temp_index_file, (SubLObject)nl_trie.$kw420$OUTPUT, file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), (SubLObject)nl_trie.UNPROVIDED);
                        dumper.dump_copyright(file_vector.get_file_vector_data_stream(fvector));
                        file_vector.update_file_vector_index_linear(fvector);
                        dumper.dump_copyright(file_vector.get_file_vector_data_stream(fvector));
                        final SubLObject v_context = dump_swappable_nl_trie_new_context(fvector);
                        final SubLObject visitor = new_swappable_nl_trie_dump_visitor(v_context);
                        strie.visit_strie_hierarchically(v_strie, visitor);
                    }
                    finally {
                        final SubLObject _prev_bind_0_$146 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nl_trie.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (nl_trie.NIL != file_vector.file_vector_p(fvector)) {
                                file_vector.close_file_vector(fvector);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$146, thread);
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)nl_trie.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            errmsg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        SubLObject ignore_errors_tag = (SubLObject)nl_trie.NIL;
        try {
            thread.throwStack.push(nl_trie.$kw421$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)nl_trie.$sym422$IGNORE_ERRORS_HANDLER), thread);
                try {
                    Filesys.delete_file(temp_index_file);
                }
                catch (Throwable catch_var2) {
                    Errors.handleThrowable(catch_var2, (SubLObject)nl_trie.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_2, thread);
            }
        }
        catch (Throwable ccatch_env_var2) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, (SubLObject)nl_trie.$kw421$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        ignore_errors_tag = (SubLObject)nl_trie.NIL;
        try {
            thread.throwStack.push(nl_trie.$kw421$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)nl_trie.$sym422$IGNORE_ERRORS_HANDLER), thread);
                try {
                    Filesys.delete_file(temp_data_file);
                }
                catch (Throwable catch_var2) {
                    Errors.handleThrowable(catch_var2, (SubLObject)nl_trie.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_2, thread);
            }
        }
        catch (Throwable ccatch_env_var2) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, (SubLObject)nl_trie.$kw421$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        if (errmsg.isString()) {
            Errors.error((SubLObject)nl_trie.$str423$_A, errmsg);
        }
        return (SubLObject)nl_trie.$kw424$SUCCESS;
    }
    
    public static SubLObject declare_nl_trie_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.nl_trie", "with_nl_trie_cache_strategy", "WITH-NL-TRIE-CACHE-STRATEGY");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.nl_trie", "without_nl_trie_cache_strategy", "WITHOUT-NL-TRIE-CACHE-STRATEGY");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.nl_trie", "with_nl_trie_lock_held", "WITH-NL-TRIE-LOCK-HELD");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_entry_p", "NL-TRIE-ENTRY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_term_phrases_entry_p", "NL-TRIE-TERM-PHRASES-ENTRY-P", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "valid_nl_trie_entry_p", "VALID-NL-TRIE-ENTRY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "validate_nl_trie_entry_internal", "VALIDATE-NL-TRIE-ENTRY-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "validate_nl_trie_entry", "VALIDATE-NL-TRIE-ENTRY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_lex_entry_p", "NL-TRIE-LEX-ENTRY-P", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "validate_nl_trie_lex_entry", "VALIDATE-NL-TRIE-LEX-ENTRY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_lex_entry_get", "NL-TRIE-LEX-ENTRY-GET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "print_nl_trie_entry", "PRINT-NL-TRIE-ENTRY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_entry_type", "NL-TRIE-ENTRY-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_entry_string", "NL-TRIE-ENTRY-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_entry_keys", "NL-TRIE-ENTRY-KEYS", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.nl_trie", "do_nl_trie_names_with_added_the", "DO-NL-TRIE-NAMES-WITH-ADDED-THE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_name_ok_for_adding_theP", "NL-TRIE-NAME-OK-FOR-ADDING-THE?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "string_is_non_name_nounP", "STRING-IS-NON-NAME-NOUN?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_dont_add_the_categories_internal", "NL-TRIE-DONT-ADD-THE-CATEGORIES-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_dont_add_the_categories", "NL-TRIE-DONT-ADD-THE-CATEGORIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_name_denot_ok_for_adding_theP", "NL-TRIE-NAME-DENOT-OK-FOR-ADDING-THE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_dont_add_the_term_p", "NL-TRIE-DONT-ADD-THE-TERM-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_dont_add_the_terms_internal", "NL-TRIE-DONT-ADD-THE-TERMS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_dont_add_the_terms", "NL-TRIE-DONT-ADD-THE-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_name_pred_ok_for_adding_theP_internal", "NL-TRIE-NAME-PRED-OK-FOR-ADDING-THE?-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_name_pred_ok_for_adding_theP", "NL-TRIE-NAME-PRED-OK-FOR-ADDING-THE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_entry_pos", "NL-TRIE-ENTRY-POS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_entry_pos_preds", "NL-TRIE-ENTRY-POS-PREDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_entry_denots", "NL-TRIE-ENTRY-DENOTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_entry_preferred_denots", "NL-TRIE-ENTRY-PREFERRED-DENOTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_entry_semtrans_templates", "NL-TRIE-ENTRY-SEMTRANS-TEMPLATES", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.nl_trie", "do_nl_trie_entry_denots", "DO-NL-TRIE-ENTRY-DENOTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.nl_trie", "do_nl_trie_entry_strings", "DO-NL-TRIE-ENTRY-STRINGS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_name_string_macro_helper", "NL-TRIE-NAME-STRING-MACRO-HELPER", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.nl_trie", "do_nl_trie_word_syntactic_supports", "DO-NL-TRIE-WORD-SYNTACTIC-SUPPORTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.nl_trie", "do_nl_trie_word_semantic_supports", "DO-NL-TRIE-WORD-SEMANTIC-SUPPORTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_entry_semantic_pred", "NL-TRIE-ENTRY-SEMANTIC-PRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_entry_mt", "NL-TRIE-ENTRY-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_entry_semantic_mt", "NL-TRIE-ENTRY-SEMANTIC-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_entry_semantic_support_set", "NL-TRIE-ENTRY-SEMANTIC-SUPPORT-SET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_entry_semantic_support_list", "NL-TRIE-ENTRY-SEMANTIC-SUPPORT-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_insert_entry", "NL-TRIE-INSERT-ENTRY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_delete_entry", "NL-TRIE-DELETE-ENTRY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_entry_pragmatics", "NL-TRIE-ENTRY-PRAGMATICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_semantic_support_pragmatics", "NL-TRIE-WORD-SEMANTIC-SUPPORT-PRAGMATICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_entry_to_javalists", "NL-TRIE-ENTRY-TO-JAVALISTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "javalist_string", "JAVALIST-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_p", "NL-TRIE-WORD-P", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "has_bad_syntactic_support_p", "HAS-BAD-SYNTACTIC-SUPPORT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_copy", "NL-TRIE-WORD-COPY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_support_p", "NL-TRIE-WORD-SUPPORT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "validate_nl_trie_word", "VALIDATE-NL-TRIE-WORD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_struc_valid_p_internal", "NL-TRIE-WORD-STRUC-VALID-P-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_struc_valid_p", "NL-TRIE-WORD-STRUC-VALID-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_valid_assertionP", "NL-TRIE-VALID-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_valid_assertionP_memoized_internal", "NL-TRIE-VALID-ASSERTION?-MEMOIZED-INTERNAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_valid_assertionP_memoized", "NL-TRIE-VALID-ASSERTION?-MEMOIZED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "valid_nl_trie_word_syntactic_support_p", "VALID-NL-TRIE-WORD-SYNTACTIC-SUPPORT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "valid_nl_trie_word_semantic_support_p", "VALID-NL-TRIE-WORD-SEMANTIC-SUPPORT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_semantic_support_p", "NL-TRIE-WORD-SEMANTIC-SUPPORT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_syntactic_support_p", "NL-TRIE-WORD-SYNTACTIC-SUPPORT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "validate_nl_trie_word_semantic_support", "VALIDATE-NL-TRIE-WORD-SEMANTIC-SUPPORT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_hl_support_p", "NL-TRIE-WORD-HL-SUPPORT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "valid_nl_trie_word_hl_syntactic_support_p", "VALID-NL-TRIE-WORD-HL-SYNTACTIC-SUPPORT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_hl_syntactic_support_p", "NL-TRIE-WORD-HL-SYNTACTIC-SUPPORT-P", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_justify_hl_syntactic_support", "NL-TRIE-JUSTIFY-HL-SYNTACTIC-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_hl_semantic_support_p", "NL-TRIE-WORD-HL-SEMANTIC-SUPPORT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "valid_nl_trie_word_hl_semantic_support_p", "VALID-NL-TRIE-WORD-HL-SEMANTIC-SUPPORT-P", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "valid_nl_trie_word_denot_set_p", "VALID-NL-TRIE-WORD-DENOT-SET-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "validate_nl_trie_word_hl_semantic_support", "VALIDATE-NL-TRIE-WORD-HL-SEMANTIC-SUPPORT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "validate_nl_trie_word_denot_set", "VALIDATE-NL-TRIE-WORD-DENOT-SET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "invalid_nl_trie_word_denotP", "INVALID-NL-TRIE-WORD-DENOT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_denot_has_invalid_constantP", "NL-TRIE-DENOT-HAS-INVALID-CONSTANT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "find_or_create_nl_trie_word_syn_support", "FIND-OR-CREATE-NL-TRIE-WORD-SYN-SUPPORT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_find_syntactic_support", "NL-TRIE-FIND-SYNTACTIC-SUPPORT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "new_nl_trie_word_hl_syn_support", "NEW-NL-TRIE-WORD-HL-SYN-SUPPORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "make_nl_trie_word_hl_syn_support", "MAKE-NL-TRIE-WORD-HL-SYN-SUPPORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "new_nl_trie_word_hl_sem_support", "NEW-NL-TRIE-WORD-HL-SEM-SUPPORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_semantic_support_from_denots", "NL-TRIE-SEMANTIC-SUPPORT-FROM-DENOTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_support_sentence", "NL-TRIE-WORD-SUPPORT-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_support_mt", "NL-TRIE-WORD-SUPPORT-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_support_predicate", "NL-TRIE-WORD-SUPPORT-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_struc_print_function_trampoline", "NL-TRIE-WORD-STRUC-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_struc_p", "NL-TRIE-WORD-STRUC-P", 1, 0, false);
        new $nl_trie_word_struc_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_struc_syntactic_supports", "NL-TRIE-WORD-STRUC-SYNTACTIC-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_struc_semantic_supports", "NL-TRIE-WORD-STRUC-SEMANTIC-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "_csetf_nl_trie_word_struc_syntactic_supports", "_CSETF-NL-TRIE-WORD-STRUC-SYNTACTIC-SUPPORTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "_csetf_nl_trie_word_struc_semantic_supports", "_CSETF-NL-TRIE-WORD-STRUC-SEMANTIC-SUPPORTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "make_nl_trie_word_struc", "MAKE-NL-TRIE-WORD-STRUC", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "visit_defstruct_nl_trie_word_struc", "VISIT-DEFSTRUCT-NL-TRIE-WORD-STRUC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "visit_defstruct_object_nl_trie_word_struc_method", "VISIT-DEFSTRUCT-OBJECT-NL-TRIE-WORD-STRUC-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "sxhash_nl_trie_word_struc_method", "SXHASH-NL-TRIE-WORD-STRUC-METHOD", 1, 0, false);
        new $sxhash_nl_trie_word_struc_method$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "pprint_nl_trie_word_struc", "PPRINT-NL-TRIE-WORD-STRUC", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "cfasl_input_nl_trie_word_struc", "CFASL-INPUT-NL-TRIE-WORD-STRUC", 1, 0, false);
        new $cfasl_input_nl_trie_word_struc$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "cfasl_output_nl_trie_word_struc", "CFASL-OUTPUT-NL-TRIE-WORD-STRUC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "cfasl_output_object_nl_trie_word_struc_method", "CFASL-OUTPUT-OBJECT-NL-TRIE-WORD-STRUC-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_valid_semantic_support_set_p", "NL-TRIE-WORD-VALID-SEMANTIC-SUPPORT-SET-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "new_nl_trie_word_semantic_support_set", "NEW-NL-TRIE-WORD-SEMANTIC-SUPPORT-SET", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_valid_syntactic_support_set_p", "NL-TRIE-WORD-VALID-SYNTACTIC-SUPPORT-SET-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "new_nl_trie_word_syntactic_support_set", "NEW-NL-TRIE-WORD-SYNTACTIC-SUPPORT-SET", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "new_nl_trie_word_for_syntactic_support", "NEW-NL-TRIE-WORD-FOR-SYNTACTIC-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "new_nl_trie_word", "NEW-NL-TRIE-WORD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_set_syn_supports", "NL-TRIE-WORD-SET-SYN-SUPPORTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_set_sem_supports", "NL-TRIE-WORD-SET-SEM-SUPPORTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_syntactic_support_p", "NL-TRIE-SYNTACTIC-SUPPORT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_valid_syntactic_support_pred_p", "NL-TRIE-VALID-SYNTACTIC-SUPPORT-PRED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_semantic_support_p", "NL-TRIE-SEMANTIC-SUPPORT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_valid_semantic_support_p", "NL-TRIE-VALID-SEMANTIC-SUPPORT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_arbitrary_syntactic_support", "NL-TRIE-WORD-ARBITRARY-SYNTACTIC-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_syntactic_support_list", "NL-TRIE-WORD-SYNTACTIC-SUPPORT-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_syntactic_support_set", "NL-TRIE-WORD-SYNTACTIC-SUPPORT-SET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_syntactic_supports", "NL-TRIE-WORD-SYNTACTIC-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_semantic_support_list", "NL-TRIE-WORD-SEMANTIC-SUPPORT-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_semantic_support_set", "NL-TRIE-WORD-SEMANTIC-SUPPORT-SET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_semantic_supports", "NL-TRIE-WORD-SEMANTIC-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_arbitrary_semantic_support", "NL-TRIE-WORD-ARBITRARY-SEMANTIC-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_has_syntactic_support_p", "NL-TRIE-WORD-HAS-SYNTACTIC-SUPPORT-P", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_add_syntactic_support", "NL-TRIE-WORD-ADD-SYNTACTIC-SUPPORT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_remove_implied_hl_syntactic_supports", "NL-TRIE-WORD-REMOVE-IMPLIED-HL-SYNTACTIC-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_remove_syntactic_support", "NL-TRIE-WORD-REMOVE-SYNTACTIC-SUPPORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_has_semantic_support_p", "NL-TRIE-WORD-HAS-SEMANTIC-SUPPORT-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_semantic_support_equalP", "NL-TRIE-WORD-SEMANTIC-SUPPORT-EQUAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_add_semantic_support", "NL-TRIE-WORD-ADD-SEMANTIC-SUPPORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_spliceable_semantic_support_p", "NL-TRIE-WORD-SPLICEABLE-SEMANTIC-SUPPORT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "do_nl_trie_word_add_semantic_support", "DO-NL-TRIE-WORD-ADD-SEMANTIC-SUPPORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_hl_semantic_supports_unifiable_p", "NL-TRIE-WORD-HL-SEMANTIC-SUPPORTS-UNIFIABLE-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_hl_semantic_support_denots", "NL-TRIE-WORD-HL-SEMANTIC-SUPPORT-DENOTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_hl_semantic_support_set_denots", "NL-TRIE-WORD-HL-SEMANTIC-SUPPORT-SET-DENOTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_semantic_support_denots_internal", "NL-TRIE-WORD-SEMANTIC-SUPPORT-DENOTS-INTERNAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_semantic_support_denots", "NL-TRIE-WORD-SEMANTIC-SUPPORT-DENOTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_semantic_support_semtrans_templates_internal", "NL-TRIE-WORD-SEMANTIC-SUPPORT-SEMTRANS-TEMPLATES-INTERNAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_semantic_support_semtrans_templates", "NL-TRIE-WORD-SEMANTIC-SUPPORT-SEMTRANS-TEMPLATES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_remove_semantic_support", "NL-TRIE-WORD-REMOVE-SEMANTIC-SUPPORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_pos_preds", "NL-TRIE-WORD-POS-PREDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_syntactic_support_abbreviation_p", "NL-TRIE-WORD-SYNTACTIC-SUPPORT-ABBREVIATION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_syntactic_support_pos_preds", "NL-TRIE-WORD-SYNTACTIC-SUPPORT-POS-PREDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "clear_nl_trie_closed_class_pos_preds", "CLEAR-NL-TRIE-CLOSED-CLASS-POS-PREDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "remove_nl_trie_closed_class_pos_preds", "REMOVE-NL-TRIE-CLOSED-CLASS-POS-PREDS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_closed_class_pos_preds_internal", "NL-TRIE-CLOSED-CLASS-POS-PREDS-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_closed_class_pos_preds", "NL-TRIE-CLOSED-CLASS-POS-PREDS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_const_arg_of_pred", "NL-TRIE-CONST-ARG-OF-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_syn_pred_string_arg", "NL-TRIE-WORD-SYN-PRED-STRING-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_abbr_arg_of_pred", "NL-TRIE-ABBR-ARG-OF-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_pos_internal", "NL-TRIE-WORD-POS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_pos", "NL-TRIE-WORD-POS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_word_unit", "NL-TRIE-WORD-WORD-UNIT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_frame", "NL-TRIE-WORD-FRAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_semantic_support_frame", "NL-TRIE-WORD-SEMANTIC-SUPPORT-FRAME", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.nl_trie", "do_nl_trie_word_denots", "DO-NL-TRIE-WORD-DENOTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_preferred_semantic_supportP", "NL-TRIE-PREFERRED-SEMANTIC-SUPPORT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_preferred_semantic_predicate_p", "NL-TRIE-PREFERRED-SEMANTIC-PREDICATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_preferred_lexical_assertionP", "NL-TRIE-PREFERRED-LEXICAL-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_preferred_meta_assertionP", "NL-TRIE-PREFERRED-META-ASSERTION?", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.nl_trie", "do_nl_trie_word_semtrans_templates", "DO-NL-TRIE-WORD-SEMTRANS-TEMPLATES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.nl_trie", "do_nl_trie_word_strings", "DO-NL-TRIE-WORD-STRINGS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_head_string_macro_helper", "NL-TRIE-WORD-HEAD-STRING-MACRO-HELPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_leading_strings_from_support_macro_helper", "NL-TRIE-WORD-LEADING-STRINGS-FROM-SUPPORT-MACRO-HELPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_following_strings_from_support_macro_helper", "NL-TRIE-WORD-FOLLOWING-STRINGS-FROM-SUPPORT-MACRO-HELPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_assemble_strings_macro_helper", "NL-TRIE-ASSEMBLE-STRINGS-MACRO-HELPER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_string", "NL-TRIE-WORD-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_head_string", "NL-TRIE-WORD-HEAD-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_syntactic_support_string", "NL-TRIE-SYNTACTIC-SUPPORT-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_leading_strings", "NL-TRIE-WORD-LEADING-STRINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_leading_strings_from_support", "NL-TRIE-WORD-LEADING-STRINGS-FROM-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_following_strings", "NL-TRIE-WORD-FOLLOWING-STRINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_following_strings_from_support", "NL-TRIE-WORD-FOLLOWING-STRINGS-FROM-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_head_onlyP", "NL-TRIE-WORD-HEAD-ONLY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_head_locations_in_lexical_string", "NL-TRIE-HEAD-LOCATIONS-IN-LEXICAL-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_sem_pred", "NL-TRIE-WORD-SEM-PRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_denots", "NL-TRIE-WORD-DENOTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_preferred_denots", "NL-TRIE-WORD-PREFERRED-DENOTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_semtrans_templates", "NL-TRIE-WORD-SEMTRANS-TEMPLATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_syntax_mt", "NL-TRIE-WORD-SYNTAX-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_word_semantics_mt", "NL-TRIE-WORD-SEMANTICS-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "print_nl_trie_word", "PRINT-NL-TRIE-WORD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "print_nl_trie_name", "PRINT-NL-TRIE-NAME", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_name_p", "NL-TRIE-NAME-P", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "validate_nl_trie_name", "VALIDATE-NL-TRIE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "validate_nl_trie_term_phrases_entry", "VALIDATE-NL-TRIE-TERM-PHRASES-ENTRY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_name_pred", "NL-TRIE-NAME-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_name_denot", "NL-TRIE-NAME-DENOT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_name_preferred_denots", "NL-TRIE-NAME-PREFERRED-DENOTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_name_string", "NL-TRIE-NAME-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_record_p_internal", "NL-TRIE-RECORD-P-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_record_p", "NL-TRIE-RECORD-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "new_nl_trie_record", "NEW-NL-TRIE-RECORD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_record_key", "NL-TRIE-RECORD-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_record_entries", "NL-TRIE-RECORD-ENTRIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "valid_nl_trie_record_key_p", "VALID-NL-TRIE-RECORD-KEY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "valid_nl_trie_record_entries_p", "VALID-NL-TRIE-RECORD-ENTRIES-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_syntactic_predicates", "NL-TRIE-SYNTACTIC-PREDICATES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_denotation_predicates", "NL-TRIE-DENOTATION-PREDICATES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_semtrans_predicates", "NL-TRIE-SEMTRANS-PREDICATES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_abbreviation_predicates", "NL-TRIE-ABBREVIATION-PREDICATES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_arg_in_reln_predicates", "NL-TRIE-ARG-IN-RELN-PREDICATES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_pragmatic_predicates", "NL-TRIE-PRAGMATIC-PREDICATES", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.nl_trie", "initializing_nl_trie", "INITIALIZING-NL-TRIE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_being_initializedP", "NL-TRIE-BEING-INITIALIZED?", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "new_nl_trie", "NEW-NL-TRIE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_p", "NL-TRIE-P", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_presentP", "NL-TRIE-PRESENT?", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "get_nl_trie", "GET-NL-TRIE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_size", "NL-TRIE-SIZE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_keys", "NL-TRIE-KEYS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "empty_nl_trieP", "EMPTY-NL-TRIE?", 0, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.nl_trie", "do_nl_trie", "DO-NL-TRIE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.nl_trie", "do_nl_trie_progress", "DO-NL-TRIE-PROGRESS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_entry_count", "NL-TRIE-ENTRY-COUNT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "copy_nl_trie", "COPY-NL-TRIE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "clear_nl_trie", "CLEAR-NL-TRIE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "swap_out_all_pristine_nl_trie_entries", "SWAP-OUT-ALL-PRISTINE-NL-TRIE-ENTRIES", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "initialize_nl_trie", "INITIALIZE-NL-TRIE", 0, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_entries_for_string", "NL-TRIE-ENTRIES-FOR-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_search", "NL-TRIE-SEARCH", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_case_sensitive_p", "NL-TRIE-CASE-SENSITIVE-P", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_search_case_sensitive_internal", "NL-TRIE-SEARCH-CASE-SENSITIVE-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_search_case_sensitive", "NL-TRIE-SEARCH-CASE-SENSITIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_search_case_insensitive_internal", "NL-TRIE-SEARCH-CASE-INSENSITIVE-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_search_case_insensitive", "NL-TRIE-SEARCH-CASE-INSENSITIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_search_case_sensitive_preferred_internal", "NL-TRIE-SEARCH-CASE-SENSITIVE-PREFERRED-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_search_case_sensitive_preferred", "NL-TRIE-SEARCH-CASE-SENSITIVE-PREFERRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_search_int", "NL-TRIE-SEARCH-INT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "augment_nl_trie_syntactic", "AUGMENT-NL-TRIE-SYNTACTIC", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "prune_nl_trie_syntactic", "PRUNE-NL-TRIE-SYNTACTIC", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "augment_nl_trie_semantic", "AUGMENT-NL-TRIE-SEMANTIC", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "prune_nl_trie_semantic", "PRUNE-NL-TRIE-SEMANTIC", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "retriefy_semantic_assertion", "RETRIEFY-SEMANTIC-ASSERTION", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.nl_trie", "nl_trie_carefully_load_global", "NL-TRIE-CAREFULLY-LOAD-GLOBAL");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "load_nl_trie_from_lexicon_cache", "LOAD-NL-TRIE-FROM-LEXICON-CACHE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "dump_nl_trie_to_lexicon_cache", "DUMP-NL-TRIE-TO-LEXICON-CACHE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "load_nl_trie_completion_index", "LOAD-NL-TRIE-COMPLETION-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "dump_nl_trie_completion_index", "DUMP-NL-TRIE-COMPLETION-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "reconnect_nl_trie_backing", "RECONNECT-NL-TRIE-BACKING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "reconnect_nl_trie_to_file_vector_files", "RECONNECT-NL-TRIE-TO-FILE-VECTOR-FILES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "dump_swappable_nl_trie_to_lexicon_cache", "DUMP-SWAPPABLE-NL-TRIE-TO-LEXICON-CACHE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "new_swappable_nl_trie_dump_visitor", "NEW-SWAPPABLE-NL-TRIE-DUMP-VISITOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "dump_swappable_nl_trie_visitor_begin_visit", "DUMP-SWAPPABLE-NL-TRIE-VISITOR-BEGIN-VISIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "dump_swappable_nl_trie_visitor_end_visit", "DUMP-SWAPPABLE-NL-TRIE-VISITOR-END-VISIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "dump_swappable_nl_trie_visitor_begin_path", "DUMP-SWAPPABLE-NL-TRIE-VISITOR-BEGIN-PATH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "dump_swappable_nl_trie_visitor_end_path", "DUMP-SWAPPABLE-NL-TRIE-VISITOR-END-PATH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "dump_swappable_nl_trie_visitor_accept_node", "DUMP-SWAPPABLE-NL-TRIE-VISITOR-ACCEPT-NODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "dump_swappable_nl_trie_new_context", "DUMP-SWAPPABLE-NL-TRIE-NEW-CONTEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "dump_swappable_nl_trie_valid_initial_context", "DUMP-SWAPPABLE-NL-TRIE-VALID-INITIAL-CONTEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "dump_swappable_nl_trie_valid_final_context", "DUMP-SWAPPABLE-NL-TRIE-VALID-FINAL-CONTEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "dump_swappable_nl_trie_get_current_map", "DUMP-SWAPPABLE-NL-TRIE-GET-CURRENT-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "dump_swappable_nl_trie_get_file_vector", "DUMP-SWAPPABLE-NL-TRIE-GET-FILE-VECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "dump_swappable_nl_trie_pop_current_map", "DUMP-SWAPPABLE-NL-TRIE-POP-CURRENT-MAP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "dump_swappable_nl_trie_push_new_current_map", "DUMP-SWAPPABLE-NL-TRIE-PUSH-NEW-CURRENT-MAP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "dump_swappable_nl_trie_get_final_result", "DUMP-SWAPPABLE-NL-TRIE-GET-FINAL-RESULT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "dump_swappable_nl_trie_set_final_result", "DUMP-SWAPPABLE-NL-TRIE-SET-FINAL-RESULT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_lookup", "NL-TRIE-LOOKUP", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_validate_all_entries", "NL-TRIE-VALIDATE-ALL-ENTRIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_remove_invalid_entries", "NL-TRIE-REMOVE-INVALID-ENTRIES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_remaining_entries", "NL-TRIE-REMAINING-ENTRIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_filter_entries_for_case", "NL-TRIE-FILTER-ENTRIES-FOR-CASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_entry_case_matches_keyP", "NL-TRIE-ENTRY-CASE-MATCHES-KEY?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "clear_nl_trie_caches", "CLEAR-NL-TRIE-CACHES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "initialize_nl_trie_control_vars", "INITIALIZE-NL-TRIE-CONTROL-VARS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "initialize_nl_trie_syntactic_predicates", "INITIALIZE-NL-TRIE-SYNTACTIC-PREDICATES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "initialize_nl_trie_denotation_predicates", "INITIALIZE-NL-TRIE-DENOTATION-PREDICATES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "initialize_nl_trie_other_predicates", "INITIALIZE-NL-TRIE-OTHER-PREDICATES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_semtrans_pred_has_pos_specificationP", "NL-TRIE-SEMTRANS-PRED-HAS-POS-SPECIFICATION?", 1, 0, false);
        new $nl_trie_semtrans_pred_has_pos_specificationP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_abbreviation_pred_p", "NL-TRIE-ABBREVIATION-PRED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_multi_word_abbreviation_pred_p", "NL-TRIE-MULTI-WORD-ABBREVIATION-PRED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "clear_nl_trie_multi_word_abbreviation_preds", "CLEAR-NL-TRIE-MULTI-WORD-ABBREVIATION-PREDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "remove_nl_trie_multi_word_abbreviation_preds", "REMOVE-NL-TRIE-MULTI-WORD-ABBREVIATION-PREDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_multi_word_abbreviation_preds_internal", "NL-TRIE-MULTI-WORD-ABBREVIATION-PREDS-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_multi_word_abbreviation_preds", "NL-TRIE-MULTI-WORD-ABBREVIATION-PREDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "initialize_nl_trie_pragmatic_predicates", "INITIALIZE-NL-TRIE-PRAGMATIC-PREDICATES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_syntactic_assertionP", "NL-TRIE-SYNTACTIC-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_semantic_assertionP", "NL-TRIE-SEMANTIC-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "initialize_nl_trie_int", "INITIALIZE-NL-TRIE-INT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_triefy_preds", "NL-TRIEFY-PREDS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "triefy_mt", "TRIEFY-MT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "triefy_mt_int", "TRIEFY-MT-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_triefy_pred", "NL-TRIEFY-PRED", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_clear_pred", "NL-TRIE-CLEAR-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_remove_entries_wXpred", "NL-TRIE-REMOVE-ENTRIES-W/PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "ok_assertion_for_nl_trieP", "OK-ASSERTION-FOR-NL-TRIE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_return_keyword", "NL-TRIE-RETURN-KEYWORD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "update_nl_trie_syntactic", "UPDATE-NL-TRIE-SYNTACTIC", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_ok_trie_and_assertionP", "NL-TRIE-OK-TRIE-AND-ASSERTION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_triefy_spp_assertion", "NL-TRIEFY-SPP-ASSERTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "unique_irregular_form_assertionP", "UNIQUE-IRREGULAR-FORM-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_get_irregular_forms", "NL-TRIE-GET-IRREGULAR-FORMS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "clear_nl_trie_spec_predicates", "CLEAR-NL-TRIE-SPEC-PREDICATES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "remove_nl_trie_spec_predicates", "REMOVE-NL-TRIE-SPEC-PREDICATES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_spec_predicates_internal", "NL-TRIE-SPEC-PREDICATES-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_spec_predicates", "NL-TRIE-SPEC-PREDICATES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_clean_up_regular_forms", "NL-TRIE-CLEAN-UP-REGULAR-FORMS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_asserted_word_formP", "NL-TRIE-ASSERTED-WORD-FORM?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_clean_up_one_regular_form", "NL-TRIE-CLEAN-UP-ONE-REGULAR-FORM", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "find_mod_list", "FIND-MOD-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_triefy_pos_assertion", "NL-TRIEFY-POS-ASSERTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "update_nl_trie_semantic_on_wu", "UPDATE-NL-TRIE-SEMANTIC-ON-WU", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "update_nl_trie_semantic_on_wu_for_pred", "UPDATE-NL-TRIE-SEMANTIC-ON-WU-FOR-PRED", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "update_nl_trie_semantic_assertion", "UPDATE-NL-TRIE-SEMANTIC-ASSERTION", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "clear_nl_trie_pos_for_semtrans_pred", "CLEAR-NL-TRIE-POS-FOR-SEMTRANS-PRED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "remove_nl_trie_pos_for_semtrans_pred", "REMOVE-NL-TRIE-POS-FOR-SEMTRANS-PRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_pos_for_semtrans_pred_internal", "NL-TRIE-POS-FOR-SEMTRANS-PRED-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_pos_for_semtrans_pred", "NL-TRIE-POS-FOR-SEMTRANS-PRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "filter_mod_list_for_pos", "FILTER-MOD-LIST-FOR-POS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "clear_nl_trie_pred_ok_for_posP", "CLEAR-NL-TRIE-PRED-OK-FOR-POS?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "remove_nl_trie_pred_ok_for_posP", "REMOVE-NL-TRIE-PRED-OK-FOR-POS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_pred_ok_for_posP_internal", "NL-TRIE-PRED-OK-FOR-POS?-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_pred_ok_for_posP", "NL-TRIE-PRED-OK-FOR-POS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "clear_nl_trie_preds_licensed_by_pos", "CLEAR-NL-TRIE-PREDS-LICENSED-BY-POS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "remove_nl_trie_preds_licensed_by_pos", "REMOVE-NL-TRIE-PREDS-LICENSED-BY-POS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_preds_licensed_by_pos_internal", "NL-TRIE-PREDS-LICENSED-BY-POS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_preds_licensed_by_pos", "NL-TRIE-PREDS-LICENSED-BY-POS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "update_nl_trie_semantic", "UPDATE-NL-TRIE-SEMANTIC", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_triefy_semantic_assertion", "NL-TRIEFY-SEMANTIC-ASSERTION", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_triefy_term_phrases_assertion", "NL-TRIEFY-TERM-PHRASES-ASSERTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "add_or_remove_term_phrases_entry", "ADD-OR-REMOVE-TERM-PHRASES-ENTRY", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_insert_term_phrases_entry", "NL-TRIE-INSERT-TERM-PHRASES-ENTRY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_remove_term_phrases_entry", "NL-TRIE-REMOVE-TERM-PHRASES-ENTRY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_get_morpho_syntax_from_formula", "NL-TRIE-GET-MORPHO-SYNTAX-FROM-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_semantic_support_pos", "NL-TRIE-SEMANTIC-SUPPORT-POS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "semantic_update_triggered_by_syntactic_update_new", "SEMANTIC-UPDATE-TRIGGERED-BY-SYNTACTIC-UPDATE-NEW", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "make_nl_trie_syntactic_support_sentence", "MAKE-NL-TRIE-SYNTACTIC-SUPPORT-SENTENCE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "semantic_update_triggered_by_incremental_semantic_update_new", "SEMANTIC-UPDATE-TRIGGERED-BY-INCREMENTAL-SEMANTIC-UPDATE-NEW", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "inc_sem_from_preds_new", "INC-SEM-FROM-PREDS-NEW", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "inc_sem_from_preds_syntactic_supports", "INC-SEM-FROM-PREDS-SYNTACTIC-SUPPORTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "inc_sem_from_pos_new", "INC-SEM-FROM-POS-NEW", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "find_string_mt_pairs_for_closed_class_word", "FIND-STRING-MT-PAIRS-FOR-CLOSED-CLASS-WORD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_assemble_strings", "NL-TRIE-ASSEMBLE-STRINGS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "new_nl_trie_denot_set", "NEW-NL-TRIE-DENOT-SET", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_triefy_arg_in_reln_assertion", "NL-TRIEFY-ARG-IN-RELN-ASSERTION", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_triefy_arg_in_reln_wX_mod_list", "NL-TRIEFY-ARG-IN-RELN-W/-MOD-LIST", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_triefy_arg_in_reln_wXo_mod_list", "NL-TRIEFY-ARG-IN-RELN-W/O-MOD-LIST", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_triefy_abbr_lex_word_assertion", "NL-TRIEFY-ABBR-LEX-WORD-ASSERTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "get_denot_for_abbr_lex_word_assertion", "GET-DENOT-FOR-ABBR-LEX-WORD-ASSERTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_triefy_abbr_cps_assertion", "NL-TRIEFY-ABBR-CPS-ASSERTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "get_denot_for_abbr_cps_assertion", "GET-DENOT-FOR-ABBR-CPS-ASSERTION", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_triefy_abbr_mws_assertion", "NL-TRIEFY-ABBR-MWS-ASSERTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "get_denot_for_abbr_mws_assertion", "GET-DENOT-FOR-ABBR-MWS-ASSERTION", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_triefy_name_string", "NL-TRIEFY-NAME-STRING", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "add_or_remove_nl_trie_word", "ADD-OR-REMOVE-NL-TRIE-WORD", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_insert_low", "NL-TRIE-INSERT-LOW", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_eqify_key", "NL-TRIE-EQIFY-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_insert_word", "NL-TRIE-INSERT-WORD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_closed_lexical_class_entryP", "NL-TRIE-CLOSED-LEXICAL-CLASS-ENTRY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_entry_case_matches_stringP", "NL-TRIE-ENTRY-CASE-MATCHES-STRING?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_augment_word", "NL-TRIE-AUGMENT-WORD", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_delete_word", "NL-TRIE-DELETE-WORD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_unassociate", "NL-TRIE-UNASSOCIATE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_syntactic_orphanP", "NL-TRIE-SYNTACTIC-ORPHAN?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "unifiable_word_entriesP", "UNIFIABLE-WORD-ENTRIES?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_words_case_identicalP", "NL-TRIE-WORDS-CASE-IDENTICAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_syntax_unifiable_p", "NL-TRIE-SYNTAX-UNIFIABLE-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_semantics_unifiable_p", "NL-TRIE-SEMANTICS-UNIFIABLE-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_pragmatics_unifiable_p", "NL-TRIE-PRAGMATICS-UNIFIABLE-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_semantic_pred_unifiable_p", "NL-TRIE-SEMANTIC-PRED-UNIFIABLE-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_semantics_mt_unifiable_p", "NL-TRIE-SEMANTICS-MT-UNIFIABLE-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_no_new_syntax_p", "NL-TRIE-NO-NEW-SYNTAX-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_no_new_semantics_p", "NL-TRIE-NO-NEW-SEMANTICS-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_pos_unifiable_p", "NL-TRIE-POS-UNIFIABLE-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_frame_unifiable_p", "NL-TRIE-FRAME-UNIFIABLE-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_wu_unifiable_p", "NL-TRIE-WU-UNIFIABLE-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_syntax_mt_unifiable_p", "NL-TRIE-SYNTAX-MT-UNIFIABLE-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "update_nl_trie_name", "UPDATE-NL-TRIE-NAME", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_insert_name", "NL-TRIE-INSERT-NAME", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_name_redundantP", "NL-TRIE-NAME-REDUNDANT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_delete_name", "NL-TRIE-DELETE-NAME", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_strings_of_wuXpos", "NL-TRIE-STRINGS-OF-WU&POS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "clear_nl_trie_preds_of_pos", "CLEAR-NL-TRIE-PREDS-OF-POS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "remove_nl_trie_preds_of_pos", "REMOVE-NL-TRIE-PREDS-OF-POS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_preds_of_pos_internal", "NL-TRIE-PREDS-OF-POS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_preds_of_pos", "NL-TRIE-PREDS-OF-POS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "clear_nl_trie_pos_of_pred", "CLEAR-NL-TRIE-POS-OF-PRED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "remove_nl_trie_pos_of_pred", "REMOVE-NL-TRIE-POS-OF-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_pos_of_pred_internal", "NL-TRIE-POS-OF-PRED-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_pos_of_pred", "NL-TRIE-POS-OF-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_strings_of_word_unit", "NL-TRIE-STRINGS-OF-WORD-UNIT", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_string_tokenize", "NL-TRIE-STRING-TOKENIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_string_tokenize_multiple", "NL-TRIE-STRING-TOKENIZE-MULTIPLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_single_token_stringP", "NL-TRIE-SINGLE-TOKEN-STRING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_strings_keys", "NL-TRIE-STRINGS-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_standardize_strings", "NL-TRIE-STANDARDIZE-STRINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_standardize_strings_int", "NL-TRIE-STANDARDIZE-STRINGS-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_break_char_exception_string_p", "NL-TRIE-BREAK-CHAR-EXCEPTION-STRING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_break_char_p", "NL-TRIE-BREAK-CHAR-P", 1, 0, false);
        new $nl_trie_break_char_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_not_present_message", "NL-TRIE-NOT-PRESENT-MESSAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_warn_bad_add", "NL-TRIE-WARN-BAD-ADD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_warn_bad_remove", "NL-TRIE-WARN-BAD-REMOVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_warn", "NL-TRIE-WARN", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_error", "NL-TRIE-ERROR", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_syntactic_preds_for_pos", "NL-TRIE-SYNTACTIC-PREDS-FOR-POS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "find_morphologically_derivable_strings", "FIND-MORPHOLOGICALLY-DERIVABLE-STRINGS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "get_nl_trie_name_pragmatic_features", "GET-NL-TRIE-NAME-PRAGMATIC-FEATURES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "get_assertion_pragmatic_features", "GET-ASSERTION-PRAGMATIC-FEATURES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "get_pragmatic_features", "GET-PRAGMATIC-FEATURES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "find_pos_preds_for_lex_const_internal", "FIND-POS-PREDS-FOR-LEX-CONST-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "find_pos_preds_for_lex_const", "FIND-POS-PREDS-FOR-LEX-CONST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "remove_genl_pos_preds", "REMOVE-GENL-POS-PREDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "find_pos_for_lex_const", "FIND-POS-FOR-LEX-CONST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_syntactic_predP", "NL-TRIE-SYNTACTIC-PRED?", 1, 0, false);
        new $nl_trie_syntactic_predP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "english_lexical_mtP", "ENGLISH-LEXICAL-MT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "has_pos_of_predP", "HAS-POS-OF-PRED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_semantic_predP", "NL-TRIE-SEMANTIC-PRED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "clear_nl_trie_name_string_preds", "CLEAR-NL-TRIE-NAME-STRING-PREDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "initialize_nl_trie_name_string_preds", "INITIALIZE-NL-TRIE-NAME-STRING-PREDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_name_string_preds", "NL-TRIE-NAME-STRING-PREDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_name_string_predP", "NL-TRIE-NAME-STRING-PRED?", 1, 0, false);
        new $nl_trie_name_string_predP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_pragmatic_predP", "NL-TRIE-PRAGMATIC-PRED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "triefy_reifiable_function_extent", "TRIEFY-REIFIABLE-FUNCTION-EXTENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "triefy_nart", "TRIEFY-NART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "new_nl_trie_iterator", "NEW-NL-TRIE-ITERATOR", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "make_nl_trie_iterator_state", "MAKE-NL-TRIE-ITERATOR-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_iterator_done", "NL-TRIE-ITERATOR-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "nl_trie_iterator_next", "NL-TRIE-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_trie", "test_swappable_nl_trie_dump", "TEST-SWAPPABLE-NL-TRIE-DUMP", 1, 0, false);
        return (SubLObject)nl_trie.NIL;
    }
    
    public static SubLObject init_nl_trie_file() {
        nl_trie.$nl_trie_default_test$ = SubLFiles.deflexical("*NL-TRIE-DEFAULT-TEST*", Symbols.symbol_function((SubLObject)nl_trie.EQUALP));
        nl_trie.$default_nl_trie_cache_strategy_size$ = SubLFiles.deflexical("*DEFAULT-NL-TRIE-CACHE-STRATEGY-SIZE*", (SubLObject)nl_trie.$int3$6000);
        nl_trie.$nl_trie_cache_strategy$ = SubLFiles.deflexical("*NL-TRIE-CACHE-STRATEGY*", maybeDefault((SubLObject)nl_trie.$sym4$_NL_TRIE_CACHE_STRATEGY_, nl_trie.$nl_trie_cache_strategy$, ()->(cache_utilities.new_metered_preallocated_cache(nl_trie.$default_nl_trie_cache_strategy_size$.getGlobalValue(), nl_trie.$nl_trie_default_test$.getGlobalValue()))));
        nl_trie.$nl_trie_lock$ = SubLFiles.deflexical("*NL-TRIE-LOCK*", maybeDefault((SubLObject)nl_trie.$sym8$_NL_TRIE_LOCK_, nl_trie.$nl_trie_lock$, ()->(Locks.make_lock((SubLObject)nl_trie.$str9$NL_Trie_Lock))));
        nl_trie.$english_definite_determiner$ = SubLFiles.defconstant("*ENGLISH-DEFINITE-DETERMINER*", (SubLObject)nl_trie.$str22$the);
        nl_trie.$nl_trie_word_denot_invalidity_tests$ = SubLFiles.deflexical("*NL-TRIE-WORD-DENOT-INVALIDITY-TESTS*", (SubLObject)nl_trie.$list99);
        nl_trie.$dtp_nl_trie_word_struc$ = SubLFiles.defconstant("*DTP-NL-TRIE-WORD-STRUC*", (SubLObject)nl_trie.$sym106$NL_TRIE_WORD_STRUC);
        nl_trie.$cfasl_opcode_nl_trie_word_struc$ = SubLFiles.defconstant("*CFASL-OPCODE-NL-TRIE-WORD-STRUC*", (SubLObject)nl_trie.$int133$71);
        nl_trie.$nl_trie_word_semantic_support_set_test$ = SubLFiles.deflexical("*NL-TRIE-WORD-SEMANTIC-SUPPORT-SET-TEST*", Symbols.symbol_function((SubLObject)nl_trie.EQUALP));
        nl_trie.$nl_trie_word_syntactic_support_set_test$ = SubLFiles.deflexical("*NL-TRIE-WORD-SYNTACTIC-SUPPORT-SET-TEST*", Symbols.symbol_function((SubLObject)nl_trie.EQUALP));
        nl_trie.$call_to_nl_trie_word_syntactic_supports_licensedP$ = SubLFiles.defparameter("*CALL-TO-NL-TRIE-WORD-SYNTACTIC-SUPPORTS-LICENSED?*", (SubLObject)nl_trie.NIL);
        nl_trie.$call_to_nl_trie_word_semantic_supports_licensedP$ = SubLFiles.defparameter("*CALL-TO-NL-TRIE-WORD-SEMANTIC-SUPPORTS-LICENSED?*", (SubLObject)nl_trie.NIL);
        nl_trie.$nl_trie_closed_class_pos_preds_caching_state$ = SubLFiles.deflexical("*NL-TRIE-CLOSED-CLASS-POS-PREDS-CACHING-STATE*", (SubLObject)nl_trie.NIL);
        nl_trie.$nl_trie_preferred_semantic_predicates$ = SubLFiles.deflexical("*NL-TRIE-PREFERRED-SEMANTIC-PREDICATES*", (SubLObject)nl_trie.$list192);
        nl_trie.$nl_trie_lexical_mt$ = SubLFiles.deflexical("*NL-TRIE-LEXICAL-MT*", maybeDefault((SubLObject)nl_trie.$sym231$_NL_TRIE_LEXICAL_MT_, nl_trie.$nl_trie_lexical_mt$, nl_trie.$const232$AllLexicalMicrotheoryPSC));
        nl_trie.$nl_trie_syntactic_predicates$ = SubLFiles.deflexical("*NL-TRIE-SYNTACTIC-PREDICATES*", (SubLObject)(maybeDefault((SubLObject)nl_trie.$sym233$_NL_TRIE_SYNTACTIC_PREDICATES_, nl_trie.$nl_trie_syntactic_predicates$, nl_trie.$kw234$UNINITIALIZED)));
        nl_trie.$nl_trie_denotation_predicates$ = SubLFiles.deflexical("*NL-TRIE-DENOTATION-PREDICATES*", (SubLObject)(maybeDefault((SubLObject)nl_trie.$sym235$_NL_TRIE_DENOTATION_PREDICATES_, nl_trie.$nl_trie_denotation_predicates$, nl_trie.$kw234$UNINITIALIZED)));
        nl_trie.$nl_trie_semtrans_predicates$ = SubLFiles.deflexical("*NL-TRIE-SEMTRANS-PREDICATES*", (SubLObject)(maybeDefault((SubLObject)nl_trie.$sym236$_NL_TRIE_SEMTRANS_PREDICATES_, nl_trie.$nl_trie_semtrans_predicates$, nl_trie.$kw234$UNINITIALIZED)));
        nl_trie.$nl_trie_abbreviation_predicates$ = SubLFiles.deflexical("*NL-TRIE-ABBREVIATION-PREDICATES*", (SubLObject)(maybeDefault((SubLObject)nl_trie.$sym237$_NL_TRIE_ABBREVIATION_PREDICATES_, nl_trie.$nl_trie_abbreviation_predicates$, nl_trie.$kw234$UNINITIALIZED)));
        nl_trie.$nl_trie_arg_in_reln_predicates$ = SubLFiles.deflexical("*NL-TRIE-ARG-IN-RELN-PREDICATES*", (SubLObject)(maybeDefault((SubLObject)nl_trie.$sym238$_NL_TRIE_ARG_IN_RELN_PREDICATES_, nl_trie.$nl_trie_arg_in_reln_predicates$, nl_trie.$kw234$UNINITIALIZED)));
        nl_trie.$nl_trie_pragmatic_predicates$ = SubLFiles.deflexical("*NL-TRIE-PRAGMATIC-PREDICATES*", (SubLObject)(maybeDefault((SubLObject)nl_trie.$sym239$_NL_TRIE_PRAGMATIC_PREDICATES_, nl_trie.$nl_trie_pragmatic_predicates$, nl_trie.$kw234$UNINITIALIZED)));
        nl_trie.$nl_tries_being_initialized$ = SubLFiles.defparameter("*NL-TRIES-BEING-INITIALIZED*", (SubLObject)nl_trie.NIL);
        nl_trie.$nl_trie$ = SubLFiles.deflexical("*NL-TRIE*", maybeDefault((SubLObject)nl_trie.$sym245$_NL_TRIE_, nl_trie.$nl_trie$, ()->(new_nl_trie((SubLObject)nl_trie.UNPROVIDED))));
        nl_trie.$nl_trie_entry_filter_stack$ = SubLFiles.defparameter("*NL-TRIE-ENTRY-FILTER-STACK*", (SubLObject)nl_trie.NIL);
        nl_trie.$nl_trie_multi_word_abbreviation_preds_caching_state$ = SubLFiles.deflexical("*NL-TRIE-MULTI-WORD-ABBREVIATION-PREDS-CACHING-STATE*", (SubLObject)nl_trie.NIL);
        nl_trie.$catch_nl_trie_errorsP$ = SubLFiles.defparameter("*CATCH-NL-TRIE-ERRORS?*", (SubLObject)nl_trie.T);
        nl_trie.$nl_trie_spec_predicates_caching_state$ = SubLFiles.deflexical("*NL-TRIE-SPEC-PREDICATES-CACHING-STATE*", (SubLObject)nl_trie.NIL);
        nl_trie.$nl_trie_pos_for_semtrans_pred_caching_state$ = SubLFiles.deflexical("*NL-TRIE-POS-FOR-SEMTRANS-PRED-CACHING-STATE*", (SubLObject)nl_trie.NIL);
        nl_trie.$nl_trie_pred_ok_for_posP_caching_state$ = SubLFiles.deflexical("*NL-TRIE-PRED-OK-FOR-POS?-CACHING-STATE*", (SubLObject)nl_trie.NIL);
        nl_trie.$nl_trie_preds_licensed_by_pos_caching_state$ = SubLFiles.deflexical("*NL-TRIE-PREDS-LICENSED-BY-POS-CACHING-STATE*", (SubLObject)nl_trie.NIL);
        nl_trie.$nl_trie_denot_set_test$ = SubLFiles.deflexical("*NL-TRIE-DENOT-SET-TEST*", Symbols.symbol_function((SubLObject)nl_trie.EQUALP));
        nl_trie.$nl_trie_preds_of_pos_caching_state$ = SubLFiles.deflexical("*NL-TRIE-PREDS-OF-POS-CACHING-STATE*", (SubLObject)nl_trie.NIL);
        nl_trie.$nl_trie_pos_of_pred_caching_state$ = SubLFiles.deflexical("*NL-TRIE-POS-OF-PRED-CACHING-STATE*", (SubLObject)nl_trie.NIL);
        nl_trie.$nl_trie_break_list$ = SubLFiles.defparameter("*NL-TRIE-BREAK-LIST*", (SubLObject)nl_trie.$list382);
        nl_trie.$nl_trie_use_two_letter_stringsP$ = SubLFiles.defparameter("*NL-TRIE-USE-TWO-LETTER-STRINGS?*", (SubLObject)nl_trie.NIL);
        nl_trie.$nl_trie_warning_level$ = SubLFiles.defparameter("*NL-TRIE-WARNING-LEVEL*", (SubLObject)nl_trie.ONE_INTEGER);
        nl_trie.$nl_trie_break_on_errorP$ = SubLFiles.defparameter("*NL-TRIE-BREAK-ON-ERROR?*", (SubLObject)nl_trie.NIL);
        nl_trie.$nl_trie_include_derived_formsP$ = SubLFiles.defparameter("*NL-TRIE-INCLUDE-DERIVED-FORMS?*", (SubLObject)nl_trie.T);
        nl_trie.$nl_trie_name_string_preds_set$ = SubLFiles.deflexical("*NL-TRIE-NAME-STRING-PREDS-SET*", maybeDefault((SubLObject)nl_trie.$sym398$_NL_TRIE_NAME_STRING_PREDS_SET_, nl_trie.$nl_trie_name_string_preds_set$, ()->(lexicon_vars.new_lex_pred_set())));
        return (SubLObject)nl_trie.NIL;
    }
    
    public static SubLObject setup_nl_trie_file() {
        lexicon_vars.$nl_trie_code_revision$.setGlobalValue((SubLObject)nl_trie.$str0$_Revision__142735__);
        lexicon_vars.declare_noop_updates_for_lexicon_global((SubLObject)nl_trie.$sym1$_NL_TRIE_CODE_REVISION_, (SubLObject)nl_trie.$list2);
        subl_macro_promotions.declare_defglobal((SubLObject)nl_trie.$sym4$_NL_TRIE_CACHE_STRATEGY_);
        subl_macro_promotions.declare_defglobal((SubLObject)nl_trie.$sym8$_NL_TRIE_LOCK_);
        memoization_state.note_memoized_function((SubLObject)nl_trie.$sym16$VALIDATE_NL_TRIE_ENTRY);
        memoization_state.note_memoized_function((SubLObject)nl_trie.$sym47$NL_TRIE_DONT_ADD_THE_CATEGORIES);
        memoization_state.note_memoized_function((SubLObject)nl_trie.$sym52$NL_TRIE_DONT_ADD_THE_TERMS);
        memoization_state.note_memoized_function((SubLObject)nl_trie.$sym55$NL_TRIE_NAME_PRED_OK_FOR_ADDING_THE_);
        access_macros.register_macro_helper((SubLObject)nl_trie.$sym74$NL_TRIE_NAME_STRING_MACRO_HELPER, (SubLObject)nl_trie.$sym78$DO_NL_TRIE_ENTRY_STRINGS);
        memoization_state.note_memoized_function((SubLObject)nl_trie.$sym91$NL_TRIE_WORD_STRUC_VALID_P);
        memoization_state.note_memoized_function((SubLObject)nl_trie.$sym92$NL_TRIE_VALID_ASSERTION__MEMOIZED);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), nl_trie.$dtp_nl_trie_word_struc$.getGlobalValue(), Symbols.symbol_function((SubLObject)nl_trie.$sym114$NL_TRIE_WORD_STRUC_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)nl_trie.$list115);
        Structures.def_csetf((SubLObject)nl_trie.$sym116$NL_TRIE_WORD_STRUC_SYNTACTIC_SUPPORTS, (SubLObject)nl_trie.$sym117$_CSETF_NL_TRIE_WORD_STRUC_SYNTACTIC_SUPPORTS);
        Structures.def_csetf((SubLObject)nl_trie.$sym118$NL_TRIE_WORD_STRUC_SEMANTIC_SUPPORTS, (SubLObject)nl_trie.$sym119$_CSETF_NL_TRIE_WORD_STRUC_SEMANTIC_SUPPORTS);
        Equality.identity((SubLObject)nl_trie.$sym106$NL_TRIE_WORD_STRUC);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), nl_trie.$dtp_nl_trie_word_struc$.getGlobalValue(), Symbols.symbol_function((SubLObject)nl_trie.$sym127$VISIT_DEFSTRUCT_OBJECT_NL_TRIE_WORD_STRUC_METHOD));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), nl_trie.$dtp_nl_trie_word_struc$.getGlobalValue(), Symbols.symbol_function((SubLObject)nl_trie.$sym129$SXHASH_NL_TRIE_WORD_STRUC_METHOD));
        cfasl.register_cfasl_input_function(nl_trie.$cfasl_opcode_nl_trie_word_struc$.getGlobalValue(), (SubLObject)nl_trie.$sym134$CFASL_INPUT_NL_TRIE_WORD_STRUC);
        Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), nl_trie.$dtp_nl_trie_word_struc$.getGlobalValue(), Symbols.symbol_function((SubLObject)nl_trie.$sym135$CFASL_OUTPUT_OBJECT_NL_TRIE_WORD_STRUC_METHOD));
        memoization_state.note_memoized_function((SubLObject)nl_trie.$sym149$NL_TRIE_WORD_SEMANTIC_SUPPORT_DENOTS);
        memoization_state.note_memoized_function((SubLObject)nl_trie.$sym151$NL_TRIE_WORD_SEMANTIC_SUPPORT_SEMTRANS_TEMPLATES);
        memoization_state.note_globally_cached_function((SubLObject)nl_trie.$sym153$NL_TRIE_CLOSED_CLASS_POS_PREDS);
        memoization_state.note_memoized_function((SubLObject)nl_trie.$sym175$NL_TRIE_WORD_POS);
        access_macros.register_macro_helper((SubLObject)nl_trie.$sym191$NL_TRIE_PREFERRED_SEMANTIC_SUPPORT_, (SubLObject)nl_trie.$sym67$DO_NL_TRIE_WORD_DENOTS);
        access_macros.register_macro_helper((SubLObject)nl_trie.$sym209$NL_TRIE_WORD_HEAD_STRING_MACRO_HELPER, (SubLObject)nl_trie.$sym76$DO_NL_TRIE_WORD_STRINGS);
        access_macros.register_macro_helper((SubLObject)nl_trie.$sym211$NL_TRIE_WORD_LEADING_STRINGS_FROM_SUPPORT_MACRO_HELPER, (SubLObject)nl_trie.$sym76$DO_NL_TRIE_WORD_STRINGS);
        access_macros.register_macro_helper((SubLObject)nl_trie.$sym212$NL_TRIE_WORD_FOLLOWING_STRINGS_FROM_SUPPORT_MACRO_HELPER, (SubLObject)nl_trie.$sym76$DO_NL_TRIE_WORD_STRINGS);
        access_macros.register_macro_helper((SubLObject)nl_trie.$sym213$NL_TRIE_ASSEMBLE_STRINGS_MACRO_HELPER, (SubLObject)nl_trie.$sym76$DO_NL_TRIE_WORD_STRINGS);
        memoization_state.note_memoized_function((SubLObject)nl_trie.$sym227$NL_TRIE_RECORD_P);
        subl_macro_promotions.declare_defglobal((SubLObject)nl_trie.$sym231$_NL_TRIE_LEXICAL_MT_);
        subl_macro_promotions.declare_defglobal((SubLObject)nl_trie.$sym233$_NL_TRIE_SYNTACTIC_PREDICATES_);
        subl_macro_promotions.declare_defglobal((SubLObject)nl_trie.$sym235$_NL_TRIE_DENOTATION_PREDICATES_);
        subl_macro_promotions.declare_defglobal((SubLObject)nl_trie.$sym236$_NL_TRIE_SEMTRANS_PREDICATES_);
        subl_macro_promotions.declare_defglobal((SubLObject)nl_trie.$sym237$_NL_TRIE_ABBREVIATION_PREDICATES_);
        subl_macro_promotions.declare_defglobal((SubLObject)nl_trie.$sym238$_NL_TRIE_ARG_IN_RELN_PREDICATES_);
        subl_macro_promotions.declare_defglobal((SubLObject)nl_trie.$sym239$_NL_TRIE_PRAGMATIC_PREDICATES_);
        subl_macro_promotions.declare_defglobal((SubLObject)nl_trie.$sym245$_NL_TRIE_);
        memoization_state.note_memoized_function((SubLObject)nl_trie.$sym265$NL_TRIE_SEARCH_CASE_SENSITIVE);
        memoization_state.note_memoized_function((SubLObject)nl_trie.$sym267$NL_TRIE_SEARCH_CASE_INSENSITIVE);
        memoization_state.note_memoized_function((SubLObject)nl_trie.$sym268$NL_TRIE_SEARCH_CASE_SENSITIVE_PREFERRED);
        memoization_state.note_globally_cached_function((SubLObject)nl_trie.$sym312$NL_TRIE_MULTI_WORD_ABBREVIATION_PREDS);
        memoization_state.note_globally_cached_function((SubLObject)nl_trie.$sym338$NL_TRIE_SPEC_PREDICATES);
        memoization_state.note_globally_cached_function((SubLObject)nl_trie.$sym346$NL_TRIE_POS_FOR_SEMTRANS_PRED);
        memoization_state.note_globally_cached_function((SubLObject)nl_trie.$sym349$NL_TRIE_PRED_OK_FOR_POS_);
        memoization_state.note_globally_cached_function((SubLObject)nl_trie.$sym354$NL_TRIE_PREDS_LICENSED_BY_POS);
        memoization_state.note_globally_cached_function((SubLObject)nl_trie.$sym376$NL_TRIE_PREDS_OF_POS);
        memoization_state.note_globally_cached_function((SubLObject)nl_trie.$sym380$NL_TRIE_POS_OF_PRED);
        memoization_state.note_memoized_function((SubLObject)nl_trie.$sym395$FIND_POS_PREDS_FOR_LEX_CONST);
        subl_macro_promotions.declare_defglobal((SubLObject)nl_trie.$sym398$_NL_TRIE_NAME_STRING_PREDS_SET_);
        generic_testing.define_test_case_table_int((SubLObject)nl_trie.$sym406$NL_TRIE_STRING_TOKENIZE, (SubLObject)ConsesLow.list(new SubLObject[] { nl_trie.$kw407$TEST, nl_trie.EQUAL, nl_trie.$kw408$OWNER, nl_trie.NIL, nl_trie.$kw409$CLASSES, nl_trie.$list410, nl_trie.$kw411$KB, nl_trie.$kw412$FULL, nl_trie.$kw413$WORKING_, nl_trie.T }), (SubLObject)nl_trie.$list414);
        generic_testing.define_test_case_table_int((SubLObject)nl_trie.$sym415$TEST_SWAPPABLE_NL_TRIE_DUMP, (SubLObject)ConsesLow.list(new SubLObject[] { nl_trie.$kw407$TEST, nl_trie.NIL, nl_trie.$kw408$OWNER, nl_trie.NIL, nl_trie.$kw409$CLASSES, nl_trie.NIL, nl_trie.$kw411$KB, nl_trie.$kw416$TINY, nl_trie.$kw413$WORKING_, nl_trie.T }), (SubLObject)nl_trie.$list417);
        return (SubLObject)nl_trie.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_nl_trie_file();
    }
    
    @Override
	public void initializeVariables() {
        init_nl_trie_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_nl_trie_file();
    }
    
    static {
        me = (SubLFile)new nl_trie();
        nl_trie.$nl_trie_default_test$ = null;
        nl_trie.$default_nl_trie_cache_strategy_size$ = null;
        nl_trie.$nl_trie_cache_strategy$ = null;
        nl_trie.$nl_trie_lock$ = null;
        nl_trie.$english_definite_determiner$ = null;
        nl_trie.$nl_trie_word_denot_invalidity_tests$ = null;
        nl_trie.$dtp_nl_trie_word_struc$ = null;
        nl_trie.$cfasl_opcode_nl_trie_word_struc$ = null;
        nl_trie.$nl_trie_word_semantic_support_set_test$ = null;
        nl_trie.$nl_trie_word_syntactic_support_set_test$ = null;
        nl_trie.$call_to_nl_trie_word_syntactic_supports_licensedP$ = null;
        nl_trie.$call_to_nl_trie_word_semantic_supports_licensedP$ = null;
        nl_trie.$nl_trie_closed_class_pos_preds_caching_state$ = null;
        nl_trie.$nl_trie_preferred_semantic_predicates$ = null;
        nl_trie.$nl_trie_lexical_mt$ = null;
        nl_trie.$nl_trie_syntactic_predicates$ = null;
        nl_trie.$nl_trie_denotation_predicates$ = null;
        nl_trie.$nl_trie_semtrans_predicates$ = null;
        nl_trie.$nl_trie_abbreviation_predicates$ = null;
        nl_trie.$nl_trie_arg_in_reln_predicates$ = null;
        nl_trie.$nl_trie_pragmatic_predicates$ = null;
        nl_trie.$nl_tries_being_initialized$ = null;
        nl_trie.$nl_trie$ = null;
        nl_trie.$nl_trie_entry_filter_stack$ = null;
        nl_trie.$nl_trie_multi_word_abbreviation_preds_caching_state$ = null;
        nl_trie.$catch_nl_trie_errorsP$ = null;
        nl_trie.$nl_trie_spec_predicates_caching_state$ = null;
        nl_trie.$nl_trie_pos_for_semtrans_pred_caching_state$ = null;
        nl_trie.$nl_trie_pred_ok_for_posP_caching_state$ = null;
        nl_trie.$nl_trie_preds_licensed_by_pos_caching_state$ = null;
        nl_trie.$nl_trie_denot_set_test$ = null;
        nl_trie.$nl_trie_preds_of_pos_caching_state$ = null;
        nl_trie.$nl_trie_pos_of_pred_caching_state$ = null;
        nl_trie.$nl_trie_break_list$ = null;
        nl_trie.$nl_trie_use_two_letter_stringsP$ = null;
        nl_trie.$nl_trie_warning_level$ = null;
        nl_trie.$nl_trie_break_on_errorP$ = null;
        nl_trie.$nl_trie_include_derived_formsP$ = null;
        nl_trie.$nl_trie_name_string_preds_set$ = null;
        $str0$_Revision__142735__ = SubLObjectFactory.makeString("$Revision: 142735 $");
        $sym1$_NL_TRIE_CODE_REVISION_ = SubLObjectFactory.makeSymbol("*NL-TRIE-CODE-REVISION*");
        $list2 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1.195"), (SubLObject)SubLObjectFactory.makeString("1.196")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1.196"), (SubLObject)SubLObjectFactory.makeString("1.197")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1.197"), (SubLObject)SubLObjectFactory.makeString("1.198")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1.198"), (SubLObject)SubLObjectFactory.makeString("1.199")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1.199"), (SubLObject)SubLObjectFactory.makeString("1.200")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1.200"), (SubLObject)SubLObjectFactory.makeString("1.201")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1.201"), (SubLObject)SubLObjectFactory.makeString("1.202")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1.202"), (SubLObject)SubLObjectFactory.makeString("1.203")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1.203"), (SubLObject)SubLObjectFactory.makeString("1.204")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1.204"), (SubLObject)SubLObjectFactory.makeString("1.205")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1.205"), (SubLObject)SubLObjectFactory.makeString("1.206")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1.206"), (SubLObject)SubLObjectFactory.makeString("1.207")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1.207"), (SubLObject)SubLObjectFactory.makeString("1.208")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1.219"), (SubLObject)SubLObjectFactory.makeString("1.220")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1.222"), (SubLObject)SubLObjectFactory.makeString("1.223")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1.228"), (SubLObject)SubLObjectFactory.makeString("1.229")) });
        $int3$6000 = SubLObjectFactory.makeInteger(6000);
        $sym4$_NL_TRIE_CACHE_STRATEGY_ = SubLObjectFactory.makeSymbol("*NL-TRIE-CACHE-STRATEGY*");
        $sym5$WITH_BACKED_MAP_CACHE_STRATEGY = SubLObjectFactory.makeSymbol("WITH-BACKED-MAP-CACHE-STRATEGY");
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*NL-TRIE-CACHE-STRATEGY*"));
        $list7 = ConsesLow.list((SubLObject)nl_trie.NIL);
        $sym8$_NL_TRIE_LOCK_ = SubLObjectFactory.makeSymbol("*NL-TRIE-LOCK*");
        $str9$NL_Trie_Lock = SubLObjectFactory.makeString("NL Trie Lock");
        $list10 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REASON")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym11$WITH_LOCK_HELD = SubLObjectFactory.makeSymbol("WITH-LOCK-HELD");
        $kw12$WHOSTATE = SubLObjectFactory.makeKeyword("WHOSTATE");
        $sym13$WITH_FILE_VECTOR_BACKED_MAP_STREAM_LOCK = SubLObjectFactory.makeSymbol("WITH-FILE-VECTOR-BACKED-MAP-STREAM-LOCK");
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*NL-TRIE-LOCK*"));
        $const15$termPhrases = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases"));
        $sym16$VALIDATE_NL_TRIE_ENTRY = SubLObjectFactory.makeSymbol("VALIDATE-NL-TRIE-ENTRY");
        $int17$200 = SubLObjectFactory.makeInteger(200);
        $sym18$GET = SubLObjectFactory.makeSymbol("GET");
        $kw19$NAME = SubLObjectFactory.makeKeyword("NAME");
        $kw20$WORD = SubLObjectFactory.makeKeyword("WORD");
        $kw21$STRING = SubLObjectFactory.makeKeyword("STRING");
        $str22$the = SubLObjectFactory.makeString("the");
        $kw23$OFF = SubLObjectFactory.makeKeyword("OFF");
        $list24 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym25$STRIE = SubLObjectFactory.makeUninternedSymbol("STRIE");
        $sym26$KEY = SubLObjectFactory.makeUninternedSymbol("KEY");
        $sym27$ENTRIES = SubLObjectFactory.makeUninternedSymbol("ENTRIES");
        $sym28$WITH_NL_TRIE_CACHE_STRATEGY = SubLObjectFactory.makeSymbol("WITH-NL-TRIE-CACHE-STRATEGY");
        $sym29$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list30 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAP-GET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-NL-TRIE")), (SubLObject)SubLObjectFactory.makeString("the")));
        $sym31$WITH_NL_TRIE_LOCK_HELD = SubLObjectFactory.makeSymbol("WITH-NL-TRIE-LOCK-HELD");
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("NL Trie Names with Added The"));
        $sym33$DO_STRIE_PROGRESS = SubLObjectFactory.makeSymbol("DO-STRIE-PROGRESS");
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-NOTE"), (SubLObject)SubLObjectFactory.makeString("Finding NL trie names with added 'the'..."));
        $sym35$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $sym36$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym37$CAND = SubLObjectFactory.makeSymbol("CAND");
        $sym38$NL_TRIE_NAME_P = SubLObjectFactory.makeSymbol("NL-TRIE-NAME-P");
        $sym39$CNOT = SubLObjectFactory.makeSymbol("CNOT");
        $sym40$SUBSTRING_MATCH_ = SubLObjectFactory.makeSymbol("SUBSTRING-MATCH?");
        $sym41$NL_TRIE_NAME_STRING = SubLObjectFactory.makeSymbol("NL-TRIE-NAME-STRING");
        $list42 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the "), (SubLObject)nl_trie.ZERO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)nl_trie.EQUALP));
        $const43$Noun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun"));
        $const44$EnglishLexiconMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishLexiconMt"));
        $const45$properNounStrings = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("properNounStrings"));
        $sym46$SPEC_PREDICATE_ = SubLObjectFactory.makeSymbol("SPEC-PREDICATE?");
        $sym47$NL_TRIE_DONT_ADD_THE_CATEGORIES = SubLObjectFactory.makeSymbol("NL-TRIE-DONT-ADD-THE-CATEGORIES");
        $sym48$_COLLECTION = SubLObjectFactory.makeSymbol("?COLLECTION");
        $list49 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dontAddTheToNamesOfInstances")), (SubLObject)SubLObjectFactory.makeSymbol("?COLLECTION"));
        $const50$MtUnionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtUnionFn"));
        $const51$EnglishMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishMt"));
        $sym52$NL_TRIE_DONT_ADD_THE_TERMS = SubLObjectFactory.makeSymbol("NL-TRIE-DONT-ADD-THE-TERMS");
        $sym53$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const54$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $sym55$NL_TRIE_NAME_PRED_OK_FOR_ADDING_THE_ = SubLObjectFactory.makeSymbol("NL-TRIE-NAME-PRED-OK-FOR-ADDING-THE?");
        $const56$dontAddTheToNamesWithPred = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dontAddTheToNamesWithPred"));
        $kw57$CYC_POS = SubLObjectFactory.makeKeyword("CYC-POS");
        $kw58$PREDICATE = SubLObjectFactory.makeKeyword("PREDICATE");
        $kw59$DENOTS = SubLObjectFactory.makeKeyword("DENOTS");
        $list60 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DENOT"), (SubLObject)SubLObjectFactory.makeSymbol("ENTRY")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym61$PCOND = SubLObjectFactory.makeSymbol("PCOND");
        $list62 = ConsesLow.list((SubLObject)nl_trie.T);
        $sym63$NL_TRIE_NAME_DENOT = SubLObjectFactory.makeSymbol("NL-TRIE-NAME-DENOT");
        $sym64$NL_TRIE_TERM_PHRASES_ENTRY_P = SubLObjectFactory.makeSymbol("NL-TRIE-TERM-PHRASES-ENTRY-P");
        $sym65$GAF_ARG1 = SubLObjectFactory.makeSymbol("GAF-ARG1");
        $sym66$NL_TRIE_WORD_P = SubLObjectFactory.makeSymbol("NL-TRIE-WORD-P");
        $sym67$DO_NL_TRIE_WORD_DENOTS = SubLObjectFactory.makeSymbol("DO-NL-TRIE-WORD-DENOTS");
        $kw68$CYC_SUBLOOP = SubLObjectFactory.makeKeyword("CYC-SUBLOOP");
        $kw69$CYC_NL = SubLObjectFactory.makeKeyword("CYC-NL");
        $sym70$LEX_ENTRY_P = SubLObjectFactory.makeSymbol("LEX-ENTRY-P");
        $sym71$NL_TRIE_LEX_ENTRY_GET = SubLObjectFactory.makeSymbol("NL-TRIE-LEX-ENTRY-GET");
        $list72 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DENOTS"));
        $list73 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("ENTRY")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym74$NL_TRIE_NAME_STRING_MACRO_HELPER = SubLObjectFactory.makeSymbol("NL-TRIE-NAME-STRING-MACRO-HELPER");
        $sym75$GAF_ARG3 = SubLObjectFactory.makeSymbol("GAF-ARG3");
        $sym76$DO_NL_TRIE_WORD_STRINGS = SubLObjectFactory.makeSymbol("DO-NL-TRIE-WORD-STRINGS");
        $list77 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STRING"));
        $sym78$DO_NL_TRIE_ENTRY_STRINGS = SubLObjectFactory.makeSymbol("DO-NL-TRIE-ENTRY-STRINGS");
        $list79 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUPPORT"), (SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list80 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw81$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw82$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym83$DO_SET = SubLObjectFactory.makeSymbol("DO-SET");
        $sym84$NL_TRIE_WORD_SYNTACTIC_SUPPORT_SET = SubLObjectFactory.makeSymbol("NL-TRIE-WORD-SYNTACTIC-SUPPORT-SET");
        $sym85$NL_TRIE_WORD_SEMANTIC_SUPPORT_SET = SubLObjectFactory.makeSymbol("NL-TRIE-WORD-SEMANTIC-SUPPORT-SET");
        $kw86$MT = SubLObjectFactory.makeKeyword("MT");
        $kw87$PRAGMATICS = SubLObjectFactory.makeKeyword("PRAGMATICS");
        $sym88$NL_TRIE_ENTRY_P = SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-P");
        $str89$Removing_bad_syntactic_support___ = SubLObjectFactory.makeString("Removing bad syntactic support: ~S~% from ~S");
        $str90$Removing_bad_semantic_support___S = SubLObjectFactory.makeString("Removing bad semantic support: ~S~% from ~S");
        $sym91$NL_TRIE_WORD_STRUC_VALID_P = SubLObjectFactory.makeSymbol("NL-TRIE-WORD-STRUC-VALID-P");
        $sym92$NL_TRIE_VALID_ASSERTION__MEMOIZED = SubLObjectFactory.makeSymbol("NL-TRIE-VALID-ASSERTION?-MEMOIZED");
        $int93$500 = SubLObjectFactory.makeInteger(500);
        $sym94$INVALID_FORT_ = SubLObjectFactory.makeSymbol("INVALID-FORT?");
        $list95 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $list96 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"));
        $list97 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("THIS-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORTS"));
        $str98$Removing_invalid_denot___S = SubLObjectFactory.makeString("Removing invalid denot: ~S");
        $list99 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-DENOT-HAS-INVALID-CONSTANT?"));
        $sym100$INVALID_CONSTANT_ = SubLObjectFactory.makeSymbol("INVALID-CONSTANT?");
        $sym101$EL_FORMULA_P = SubLObjectFactory.makeSymbol("EL-FORMULA-P");
        $sym102$HLMT_P = SubLObjectFactory.makeSymbol("HLMT-P");
        $sym103$SET_P = SubLObjectFactory.makeSymbol("SET-P");
        $str104$_S___is_not_a_valid_NL_trie_denot = SubLObjectFactory.makeString("~S~% is not a valid NL trie denot set. Test must be ~S.");
        $const105$denotation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotation"));
        $sym106$NL_TRIE_WORD_STRUC = SubLObjectFactory.makeSymbol("NL-TRIE-WORD-STRUC");
        $sym107$NL_TRIE_WORD_STRUC_P = SubLObjectFactory.makeSymbol("NL-TRIE-WORD-STRUC-P");
        $int108$166 = SubLObjectFactory.makeInteger(166);
        $list109 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYNTACTIC-SUPPORTS"), (SubLObject)SubLObjectFactory.makeSymbol("SEMANTIC-SUPPORTS"));
        $list110 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SYNTACTIC-SUPPORTS"), (SubLObject)SubLObjectFactory.makeKeyword("SEMANTIC-SUPPORTS"));
        $list111 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-WORD-STRUC-SYNTACTIC-SUPPORTS"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-WORD-STRUC-SEMANTIC-SUPPORTS"));
        $list112 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-NL-TRIE-WORD-STRUC-SYNTACTIC-SUPPORTS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-NL-TRIE-WORD-STRUC-SEMANTIC-SUPPORTS"));
        $sym113$PPRINT_NL_TRIE_WORD_STRUC = SubLObjectFactory.makeSymbol("PPRINT-NL-TRIE-WORD-STRUC");
        $sym114$NL_TRIE_WORD_STRUC_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("NL-TRIE-WORD-STRUC-PRINT-FUNCTION-TRAMPOLINE");
        $list115 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-WORD-STRUC-P"));
        $sym116$NL_TRIE_WORD_STRUC_SYNTACTIC_SUPPORTS = SubLObjectFactory.makeSymbol("NL-TRIE-WORD-STRUC-SYNTACTIC-SUPPORTS");
        $sym117$_CSETF_NL_TRIE_WORD_STRUC_SYNTACTIC_SUPPORTS = SubLObjectFactory.makeSymbol("_CSETF-NL-TRIE-WORD-STRUC-SYNTACTIC-SUPPORTS");
        $sym118$NL_TRIE_WORD_STRUC_SEMANTIC_SUPPORTS = SubLObjectFactory.makeSymbol("NL-TRIE-WORD-STRUC-SEMANTIC-SUPPORTS");
        $sym119$_CSETF_NL_TRIE_WORD_STRUC_SEMANTIC_SUPPORTS = SubLObjectFactory.makeSymbol("_CSETF-NL-TRIE-WORD-STRUC-SEMANTIC-SUPPORTS");
        $kw120$SYNTACTIC_SUPPORTS = SubLObjectFactory.makeKeyword("SYNTACTIC-SUPPORTS");
        $kw121$SEMANTIC_SUPPORTS = SubLObjectFactory.makeKeyword("SEMANTIC-SUPPORTS");
        $str122$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw123$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym124$MAKE_NL_TRIE_WORD_STRUC = SubLObjectFactory.makeSymbol("MAKE-NL-TRIE-WORD-STRUC");
        $kw125$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw126$END = SubLObjectFactory.makeKeyword("END");
        $sym127$VISIT_DEFSTRUCT_OBJECT_NL_TRIE_WORD_STRUC_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-NL-TRIE-WORD-STRUC-METHOD");
        $int128$509 = SubLObjectFactory.makeInteger(509);
        $sym129$SXHASH_NL_TRIE_WORD_STRUC_METHOD = SubLObjectFactory.makeSymbol("SXHASH-NL-TRIE-WORD-STRUC-METHOD");
        $str130$_NL_TRIE_WORD = SubLObjectFactory.makeString("<NL-TRIE-WORD");
        $str131$____S = SubLObjectFactory.makeString("~% ~S");
        $str132$_ = SubLObjectFactory.makeString(">");
        $int133$71 = SubLObjectFactory.makeInteger(71);
        $sym134$CFASL_INPUT_NL_TRIE_WORD_STRUC = SubLObjectFactory.makeSymbol("CFASL-INPUT-NL-TRIE-WORD-STRUC");
        $sym135$CFASL_OUTPUT_OBJECT_NL_TRIE_WORD_STRUC_METHOD = SubLObjectFactory.makeSymbol("CFASL-OUTPUT-OBJECT-NL-TRIE-WORD-STRUC-METHOD");
        $sym136$NL_TRIE_VALID_SEMANTIC_SUPPORT_P = SubLObjectFactory.makeSymbol("NL-TRIE-VALID-SEMANTIC-SUPPORT-P");
        $sym137$NL_TRIE_SYNTACTIC_SUPPORT_P = SubLObjectFactory.makeSymbol("NL-TRIE-SYNTACTIC-SUPPORT-P");
        $sym138$NL_TRIE_WORD_VALID_SYNTACTIC_SUPPORT_SET_P = SubLObjectFactory.makeSymbol("NL-TRIE-WORD-VALID-SYNTACTIC-SUPPORT-SET-P");
        $sym139$NL_TRIE_WORD_VALID_SEMANTIC_SUPPORT_SET_P = SubLObjectFactory.makeSymbol("NL-TRIE-WORD-VALID-SEMANTIC-SUPPORT-SET-P");
        $const140$partOfSpeech = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("partOfSpeech"));
        $str141$Couldn_t_find_valid_arbitrary_syn = SubLObjectFactory.makeString("Couldn't find valid arbitrary syntactic support in~% ~S~%");
        $str142$Illicit_call_to_NL_TRIE_WORD_SYNT = SubLObjectFactory.makeString("Illicit call to NL-TRIE-WORD-SYNTACTIC-SUPPORTS.");
        $str143$Illicit_call_to_NL_TRIE_WORD_SEMA = SubLObjectFactory.makeString("Illicit call to NL-TRIE-WORD-SEMANTIC-SUPPORTS.");
        $str144$Couldn_t_find_valid_arbitrary_sem = SubLObjectFactory.makeString("Couldn't find valid arbitrary semantic support in~% ~S~%");
        $kw145$ADDED = SubLObjectFactory.makeKeyword("ADDED");
        $kw146$ALREADY_PRESENT = SubLObjectFactory.makeKeyword("ALREADY-PRESENT");
        $kw147$REMOVED = SubLObjectFactory.makeKeyword("REMOVED");
        $kw148$NOT_FOUND = SubLObjectFactory.makeKeyword("NOT-FOUND");
        $sym149$NL_TRIE_WORD_SEMANTIC_SUPPORT_DENOTS = SubLObjectFactory.makeSymbol("NL-TRIE-WORD-SEMANTIC-SUPPORT-DENOTS");
        $str150$Can_t_get_arg__S_of__S = SubLObjectFactory.makeString("Can't get arg ~S of ~S");
        $sym151$NL_TRIE_WORD_SEMANTIC_SUPPORT_SEMTRANS_TEMPLATES = SubLObjectFactory.makeSymbol("NL-TRIE-WORD-SEMANTIC-SUPPORT-SEMTRANS-TEMPLATES");
        $list152 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wordStrings")));
        $sym153$NL_TRIE_CLOSED_CLASS_POS_PREDS = SubLObjectFactory.makeSymbol("NL-TRIE-CLOSED-CLASS-POS-PREDS");
        $kw154$BREADTH = SubLObjectFactory.makeKeyword("BREADTH");
        $kw155$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $kw156$STACK = SubLObjectFactory.makeKeyword("STACK");
        $const157$True_JustificationTruth = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True-JustificationTruth"));
        $sym158$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw159$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str160$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym161$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw162$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str163$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw164$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str165$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $const166$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $const167$ClosedClassWord = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ClosedClassWord"));
        $str168$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str169$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $str170$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $sym171$_NL_TRIE_CLOSED_CLASS_POS_PREDS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*NL-TRIE-CLOSED-CLASS-POS-PREDS-CACHING-STATE*");
        $int172$64 = SubLObjectFactory.makeInteger(64);
        $sym173$CLEAR_NL_TRIE_CLOSED_CLASS_POS_PREDS = SubLObjectFactory.makeSymbol("CLEAR-NL-TRIE-CLOSED-CLASS-POS-PREDS");
        $const174$abbreviationForLexicalWord = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("abbreviationForLexicalWord"));
        $sym175$NL_TRIE_WORD_POS = SubLObjectFactory.makeSymbol("NL-TRIE-WORD-POS");
        $const176$gerund = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("gerund"));
        $sym177$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $int178$1000 = SubLObjectFactory.makeInteger(1000);
        $list179 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DENOT"), (SubLObject)SubLObjectFactory.makeSymbol("ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("PREFERRED-ONLY?")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list180 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PREFERRED-ONLY?"));
        $kw181$PREFERRED_ONLY_ = SubLObjectFactory.makeKeyword("PREFERRED-ONLY?");
        $sym182$PRED = SubLObjectFactory.makeUninternedSymbol("PRED");
        $sym183$DENOT_ARG = SubLObjectFactory.makeUninternedSymbol("DENOT-ARG");
        $sym184$SEMANTIC_SUPPORT = SubLObjectFactory.makeUninternedSymbol("SEMANTIC-SUPPORT");
        $sym185$NL_TRIE_WORD_SEM_PRED = SubLObjectFactory.makeSymbol("NL-TRIE-WORD-SEM-PRED");
        $sym186$FWHEN = SubLObjectFactory.makeSymbol("FWHEN");
        $sym187$INDEXED_TERM_P = SubLObjectFactory.makeSymbol("INDEXED-TERM-P");
        $sym188$DENOTATUM_ARG_OF_PRED_CACHED = SubLObjectFactory.makeSymbol("DENOTATUM-ARG-OF-PRED-CACHED");
        $sym189$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $sym190$FIMPLIES = SubLObjectFactory.makeSymbol("FIMPLIES");
        $sym191$NL_TRIE_PREFERRED_SEMANTIC_SUPPORT_ = SubLObjectFactory.makeSymbol("NL-TRIE-PREFERRED-SEMANTIC-SUPPORT?");
        $list192 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("preferredNameString")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("preferredTermStrings")));
        $const193$preferredLexification = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("preferredLexification"));
        $list194 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS-TEMPLATE"), (SubLObject)SubLObjectFactory.makeSymbol("ENTRY")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym195$PRED = SubLObjectFactory.makeUninternedSymbol("PRED");
        $sym196$SEMTRANS_TEMPLATE_ARG = SubLObjectFactory.makeUninternedSymbol("SEMTRANS-TEMPLATE-ARG");
        $sym197$SEMANTIC_SUPPORT = SubLObjectFactory.makeUninternedSymbol("SEMANTIC-SUPPORT");
        $sym198$INVALID_SUPPORTS = SubLObjectFactory.makeUninternedSymbol("INVALID-SUPPORTS");
        $sym199$SEMTRANS_ARG_OF_PRED_CACHED = SubLObjectFactory.makeSymbol("SEMTRANS-ARG-OF-PRED-CACHED");
        $sym200$PIF = SubLObjectFactory.makeSymbol("PIF");
        $sym201$VALID_NL_TRIE_WORD_SEMANTIC_SUPPORT_P = SubLObjectFactory.makeSymbol("VALID-NL-TRIE-WORD-SEMANTIC-SUPPORT-P");
        $sym202$CPUSH = SubLObjectFactory.makeSymbol("CPUSH");
        $sym203$NL_TRIE_WORD_REMOVE_SEMANTIC_SUPPORT = SubLObjectFactory.makeSymbol("NL-TRIE-WORD-REMOVE-SEMANTIC-SUPPORT");
        $list204 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("WORD-ENTRY")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym205$SEMANTIC_SUPPORT = SubLObjectFactory.makeUninternedSymbol("SEMANTIC-SUPPORT");
        $sym206$LEADING_STRINGS = SubLObjectFactory.makeUninternedSymbol("LEADING-STRINGS");
        $sym207$HEAD_STRING = SubLObjectFactory.makeUninternedSymbol("HEAD-STRING");
        $sym208$FOLLOWING_STRINGS = SubLObjectFactory.makeUninternedSymbol("FOLLOWING-STRINGS");
        $sym209$NL_TRIE_WORD_HEAD_STRING_MACRO_HELPER = SubLObjectFactory.makeSymbol("NL-TRIE-WORD-HEAD-STRING-MACRO-HELPER");
        $sym210$DO_NL_TRIE_WORD_SEMANTIC_SUPPORTS = SubLObjectFactory.makeSymbol("DO-NL-TRIE-WORD-SEMANTIC-SUPPORTS");
        $sym211$NL_TRIE_WORD_LEADING_STRINGS_FROM_SUPPORT_MACRO_HELPER = SubLObjectFactory.makeSymbol("NL-TRIE-WORD-LEADING-STRINGS-FROM-SUPPORT-MACRO-HELPER");
        $sym212$NL_TRIE_WORD_FOLLOWING_STRINGS_FROM_SUPPORT_MACRO_HELPER = SubLObjectFactory.makeSymbol("NL-TRIE-WORD-FOLLOWING-STRINGS-FROM-SUPPORT-MACRO-HELPER");
        $sym213$NL_TRIE_ASSEMBLE_STRINGS_MACRO_HELPER = SubLObjectFactory.makeSymbol("NL-TRIE-ASSEMBLE-STRINGS-MACRO-HELPER");
        $str214$__NL_TRIE_WORD_Word_unit______S__ = SubLObjectFactory.makeString("#<NL-TRIE-WORD:Word-unit:    ~S~%");
        $str215$_______________POS____________S__ = SubLObjectFactory.makeString("               POS:          ~S~%");
        $str216$_______________POS_Preds______S__ = SubLObjectFactory.makeString("               POS Preds:    ~S~%");
        $str217$_______________Lexical_Pred___S__ = SubLObjectFactory.makeString("               Lexical Pred: ~S~%");
        $str218$_______________Denotations____S__ = SubLObjectFactory.makeString("               Denotations:  ~S~%");
        $str219$_______________Pragmatics_____S__ = SubLObjectFactory.makeString("               Pragmatics:   ~S~%");
        $str220$_______________Microtheory____S__ = SubLObjectFactory.makeString("               Microtheory:  ~S>~%");
        $str221$__NL_TRIE_NAME_Namestring_Pred___ = SubLObjectFactory.makeString("#<NL-TRIE-NAME:Namestring Pred: ~S~%");
        $str222$_______________Denotations_______ = SubLObjectFactory.makeString("               Denotations:     ~S~%");
        $str223$_______________Pragmatics________ = SubLObjectFactory.makeString("               Pragmatics:      ~S~%");
        $str224$_______________Microtheory_______ = SubLObjectFactory.makeString("               Microtheory:     ~S>~%");
        $str225$Invalid_NL_trie_name___S = SubLObjectFactory.makeString("Invalid NL trie name: ~S");
        $str226$Invalid_NL_trie_tp_entry___S = SubLObjectFactory.makeString("Invalid NL trie tp-entry: ~S");
        $sym227$NL_TRIE_RECORD_P = SubLObjectFactory.makeSymbol("NL-TRIE-RECORD-P");
        $sym228$VALID_NL_TRIE_RECORD_KEY_P = SubLObjectFactory.makeSymbol("VALID-NL-TRIE-RECORD-KEY-P");
        $sym229$VALID_NL_TRIE_RECORD_ENTRIES_P = SubLObjectFactory.makeSymbol("VALID-NL-TRIE-RECORD-ENTRIES-P");
        $sym230$CYCL_STRING_P = SubLObjectFactory.makeSymbol("CYCL-STRING-P");
        $sym231$_NL_TRIE_LEXICAL_MT_ = SubLObjectFactory.makeSymbol("*NL-TRIE-LEXICAL-MT*");
        $const232$AllLexicalMicrotheoryPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AllLexicalMicrotheoryPSC"));
        $sym233$_NL_TRIE_SYNTACTIC_PREDICATES_ = SubLObjectFactory.makeSymbol("*NL-TRIE-SYNTACTIC-PREDICATES*");
        $kw234$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $sym235$_NL_TRIE_DENOTATION_PREDICATES_ = SubLObjectFactory.makeSymbol("*NL-TRIE-DENOTATION-PREDICATES*");
        $sym236$_NL_TRIE_SEMTRANS_PREDICATES_ = SubLObjectFactory.makeSymbol("*NL-TRIE-SEMTRANS-PREDICATES*");
        $sym237$_NL_TRIE_ABBREVIATION_PREDICATES_ = SubLObjectFactory.makeSymbol("*NL-TRIE-ABBREVIATION-PREDICATES*");
        $sym238$_NL_TRIE_ARG_IN_RELN_PREDICATES_ = SubLObjectFactory.makeSymbol("*NL-TRIE-ARG-IN-RELN-PREDICATES*");
        $sym239$_NL_TRIE_PRAGMATIC_PREDICATES_ = SubLObjectFactory.makeSymbol("*NL-TRIE-PRAGMATIC-PREDICATES*");
        $list240 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym241$_NL_TRIES_BEING_INITIALIZED_ = SubLObjectFactory.makeSymbol("*NL-TRIES-BEING-INITIALIZED*");
        $sym242$CONS = SubLObjectFactory.makeSymbol("CONS");
        $list243 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*NL-TRIES-BEING-INITIALIZED*"));
        $list244 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Initialize NL Trie"));
        $sym245$_NL_TRIE_ = SubLObjectFactory.makeSymbol("*NL-TRIE*");
        $kw246$ABORTED = SubLObjectFactory.makeKeyword("ABORTED");
        $list247 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("ENTRIES"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list248 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Do NL Trie"));
        $sym249$DO_STRIE = SubLObjectFactory.makeSymbol("DO-STRIE");
        $list250 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-NL-TRIE"));
        $list251 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("ENTRIES"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-NOTE"), (SubLObject)SubLObjectFactory.makeString("Mapping NL trie..."))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list252 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"), (SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-NOTE"));
        $kw253$PROGRESS_NOTE = SubLObjectFactory.makeKeyword("PROGRESS-NOTE");
        $str254$Mapping_NL_trie___ = SubLObjectFactory.makeString("Mapping NL trie...");
        $list255 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Do NL Trie Progress"));
        $list256 = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("DICT-KEY"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("DICT-VALUE"));
        $kw257$COPIED = SubLObjectFactory.makeKeyword("COPIED");
        $str258$__Clearing_the_present_contents_o = SubLObjectFactory.makeString("~%Clearing the present contents of ~a ...~%");
        $kw259$CLEARED = SubLObjectFactory.makeKeyword("CLEARED");
        $kw260$NEVER = SubLObjectFactory.makeKeyword("NEVER");
        $kw261$INITIALIZED = SubLObjectFactory.makeKeyword("INITIALIZED");
        $kw262$ON = SubLObjectFactory.makeKeyword("ON");
        $kw263$PREFERRED = SubLObjectFactory.makeKeyword("PREFERRED");
        $str264$Didn_t_recognize_NL_Trie_case_sen = SubLObjectFactory.makeString("Didn't recognize NL Trie case-sensitivity setting ~S");
        $sym265$NL_TRIE_SEARCH_CASE_SENSITIVE = SubLObjectFactory.makeSymbol("NL-TRIE-SEARCH-CASE-SENSITIVE");
        $int266$48 = SubLObjectFactory.makeInteger(48);
        $sym267$NL_TRIE_SEARCH_CASE_INSENSITIVE = SubLObjectFactory.makeSymbol("NL-TRIE-SEARCH-CASE-INSENSITIVE");
        $sym268$NL_TRIE_SEARCH_CASE_SENSITIVE_PREFERRED = SubLObjectFactory.makeSymbol("NL-TRIE-SEARCH-CASE-SENSITIVE-PREFERRED");
        $str269$NL_Trie_empty_ = SubLObjectFactory.makeString("NL Trie empty.");
        $str270$NL_Trie_incompletely_built_ = SubLObjectFactory.makeString("NL Trie incompletely built.");
        $str271$NL_trie_built_with_stale_code__ = SubLObjectFactory.makeString("NL trie built with stale code~%");
        $kw272$NOT_ADDED = SubLObjectFactory.makeKeyword("NOT-ADDED");
        $kw273$NOT_REMOVED = SubLObjectFactory.makeKeyword("NOT-REMOVED");
        $kw274$RETRIEFIED = SubLObjectFactory.makeKeyword("RETRIEFIED");
        $kw275$NOT_RETRIEFIED = SubLObjectFactory.makeKeyword("NOT-RETRIEFIED");
        $list276 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("GLOBAL"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"));
        $sym277$TOP = SubLObjectFactory.makeUninternedSymbol("TOP");
        $sym278$CFASL_INPUT = SubLObjectFactory.makeSymbol("CFASL-INPUT");
        $list279 = ConsesLow.list((SubLObject)nl_trie.NIL, (SubLObject)SubLObjectFactory.makeKeyword("EOF"));
        $list280 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EOF"));
        $sym281$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym282$WARN = SubLObjectFactory.makeSymbol("WARN");
        $str283$___S_is_not_the_right_type_of_obj = SubLObjectFactory.makeString("~&~S is not the right type of object for ~S (expected a ~S).");
        $sym284$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $kw285$EOF = SubLObjectFactory.makeKeyword("EOF");
        $sym286$MAP_P = SubLObjectFactory.makeSymbol("MAP-P");
        $sym287$_NL_TRIE_COMPLETION_INDEX_ = SubLObjectFactory.makeSymbol("*NL-TRIE-COMPLETION-INDEX*");
        $str288$Mismatch_between_world_and_HL_cac = SubLObjectFactory.makeString("Mismatch between world and HL caches: no ~A and ~A to reconnect NL trie with.");
        $str289$Reconnecting_to_legacy_unit_files = SubLObjectFactory.makeString("Reconnecting to legacy unit files w/out NL trie contents in ~A and ~A.");
        $sym290$DUMP_SWAPPABLE_NL_TRIE_VISITOR_BEGIN_VISIT = SubLObjectFactory.makeSymbol("DUMP-SWAPPABLE-NL-TRIE-VISITOR-BEGIN-VISIT");
        $sym291$DUMP_SWAPPABLE_NL_TRIE_VISITOR_BEGIN_PATH = SubLObjectFactory.makeSymbol("DUMP-SWAPPABLE-NL-TRIE-VISITOR-BEGIN-PATH");
        $sym292$DUMP_SWAPPABLE_NL_TRIE_VISITOR_ACCEPT_NODE = SubLObjectFactory.makeSymbol("DUMP-SWAPPABLE-NL-TRIE-VISITOR-ACCEPT-NODE");
        $sym293$DUMP_SWAPPABLE_NL_TRIE_VISITOR_END_PATH = SubLObjectFactory.makeSymbol("DUMP-SWAPPABLE-NL-TRIE-VISITOR-END-PATH");
        $sym294$DUMP_SWAPPABLE_NL_TRIE_VISITOR_END_VISIT = SubLObjectFactory.makeSymbol("DUMP-SWAPPABLE-NL-TRIE-VISITOR-END-VISIT");
        $str295$The_NL_trie_visitor_is_not_proper = SubLObjectFactory.makeString("The NL trie visitor is not properly setup; initial context ~A is bogus.");
        $str296$The_NL_trie_visitor_did_nto_compl = SubLObjectFactory.makeString("The NL trie visitor did nto complete properly; final context ~A is bogus.");
        $kw297$SWAPPED_OUT = SubLObjectFactory.makeKeyword("SWAPPED-OUT");
        $kw298$COMPACT = SubLObjectFactory.makeKeyword("COMPACT");
        $list299 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("MAP-KEY"), (SubLObject)SubLObjectFactory.makeSymbol("PAYLOAD"));
        $kw300$FILE_VECTOR = SubLObjectFactory.makeKeyword("FILE-VECTOR");
        $kw301$MAP_STACK = SubLObjectFactory.makeKeyword("MAP-STACK");
        $str302$Invalid_case_sensitivity_setting_ = SubLObjectFactory.makeString("Invalid case-sensitivity setting ~S for trie ~S, whose test function is ~S");
        $str303$Validating_all_NL_trie_entries = SubLObjectFactory.makeString("Validating all NL trie entries");
        $kw304$VALIDATED = SubLObjectFactory.makeKeyword("VALIDATED");
        $str305$Removing_bad_NL_trie_entry_for__S = SubLObjectFactory.makeString("Removing bad NL trie entry for ~S:~% ~S~% from ~S~%");
        $str306$Remaining_entries_____S__ = SubLObjectFactory.makeString("Remaining entries:~% ~S~%");
        $sym307$NL_TRIE_SYNTACTIC_PRED_ = SubLObjectFactory.makeSymbol("NL-TRIE-SYNTACTIC-PRED?");
        $list308 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotation")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotationRelatedTo")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotationPlaceholder")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("multiWordString")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("compoundString")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("multiWordString-Speculative")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("headMedialString")));
        $const309$DenotesArgInRelnPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DenotesArgInRelnPredicate"));
        $const310$SemTransPred = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SemTransPred"));
        $sym311$NL_TRIE_SEMTRANS_PRED_HAS_POS_SPECIFICATION_ = SubLObjectFactory.makeSymbol("NL-TRIE-SEMTRANS-PRED-HAS-POS-SPECIFICATION?");
        $sym312$NL_TRIE_MULTI_WORD_ABBREVIATION_PREDS = SubLObjectFactory.makeSymbol("NL-TRIE-MULTI-WORD-ABBREVIATION-PREDS");
        $const313$MultiWordForStringPred = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MultiWordForStringPred"));
        $sym314$_NL_TRIE_MULTI_WORD_ABBREVIATION_PREDS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*NL-TRIE-MULTI-WORD-ABBREVIATION-PREDS-CACHING-STATE*");
        $const315$NLPragmaticPredicate_New = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLPragmaticPredicate-New"));
        $str316$__Initializing_NL_Trie_____ = SubLObjectFactory.makeString("~%Initializing NL Trie...~%");
        $str317$__Triefying_the_syntactic_predica = SubLObjectFactory.makeString("~%Triefying the syntactic predicates ...~%");
        $kw318$SYNTACTIC = SubLObjectFactory.makeKeyword("SYNTACTIC");
        $str319$__Triefying_the_semantic_predicat = SubLObjectFactory.makeString("~%Triefying the semantic predicates ...~%");
        $kw320$SEMANTIC = SubLObjectFactory.makeKeyword("SEMANTIC");
        $sym321$VALID_CONSTANT_ = SubLObjectFactory.makeSymbol("VALID-CONSTANT?");
        $str322$____D__D__Triefying__S_assertions = SubLObjectFactory.makeString("~%[~D/~D] Triefying ~S assertions...");
        $const323$NLSyntacticPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLSyntacticPredicate"));
        $const324$NLSemanticPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLSemanticPredicate"));
        $str325$Triefying__S = SubLObjectFactory.makeString("Triefying ~S");
        $kw326$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw327$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $str328$Triefying__S_assertions___ = SubLObjectFactory.makeString("Triefying ~S assertions...");
        $str329$Got_failure_result__S_when_triefy = SubLObjectFactory.makeString("Got failure result ~S when triefying~% ~S");
        $sym330$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $const331$abbreviationForMultiWordString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("abbreviationForMultiWordString"));
        $const332$abbreviationForCompoundString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("abbreviationForCompoundString"));
        $str333$Caught_error_in_UPDATE_NL_TRIE_SY = SubLObjectFactory.makeString("Caught error in UPDATE-NL-TRIE-SYNTACTIC for~% ~S:~% ~S");
        $str334$Trie_not_present___S = SubLObjectFactory.makeString("Trie not present: ~S");
        $str335$Assertion_fails_OK_ASSERTION_FOR_ = SubLObjectFactory.makeString("Assertion fails OK-ASSERTION-FOR-NL-TRIE?~% ~S");
        $list336 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MOD-STR-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTRAINT"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $list337 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPP-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"));
        $sym338$NL_TRIE_SPEC_PREDICATES = SubLObjectFactory.makeSymbol("NL-TRIE-SPEC-PREDICATES");
        $sym339$_NL_TRIE_SPEC_PREDICATES_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*NL-TRIE-SPEC-PREDICATES-CACHING-STATE*");
        $int340$256 = SubLObjectFactory.makeInteger(256);
        $sym341$CLEAR_NL_TRIE_SPEC_PREDICATES = SubLObjectFactory.makeSymbol("CLEAR-NL-TRIE-SPEC-PREDICATES");
        $list342 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SP-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"));
        $list343 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPP-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("WU"), (SubLObject)SubLObjectFactory.makeSymbol("IRREGULAR-STRING"));
        $list344 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MOD-STR-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"));
        $list345 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)SubLObjectFactory.makeSymbol("POS"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-STRING"));
        $sym346$NL_TRIE_POS_FOR_SEMTRANS_PRED = SubLObjectFactory.makeSymbol("NL-TRIE-POS-FOR-SEMTRANS-PRED");
        $sym347$_NL_TRIE_POS_FOR_SEMTRANS_PRED_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*NL-TRIE-POS-FOR-SEMTRANS-PRED-CACHING-STATE*");
        $int348$128 = SubLObjectFactory.makeInteger(128);
        $sym349$NL_TRIE_PRED_OK_FOR_POS_ = SubLObjectFactory.makeSymbol("NL-TRIE-PRED-OK-FOR-POS?");
        $sym350$GENL_POS_ = SubLObjectFactory.makeSymbol("GENL-POS?");
        $sym351$GENL_POS_PRED_ = SubLObjectFactory.makeSymbol("GENL-POS-PRED?");
        $sym352$_NL_TRIE_PRED_OK_FOR_POS__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*NL-TRIE-PRED-OK-FOR-POS?-CACHING-STATE*");
        $int353$1024 = SubLObjectFactory.makeInteger(1024);
        $sym354$NL_TRIE_PREDS_LICENSED_BY_POS = SubLObjectFactory.makeSymbol("NL-TRIE-PREDS-LICENSED-BY-POS");
        $sym355$_NL_TRIE_PREDS_LICENSED_BY_POS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*NL-TRIE-PREDS-LICENSED-BY-POS-CACHING-STATE*");
        $int356$32 = SubLObjectFactory.makeInteger(32);
        $str357$Caught_error_in_NL_TRIEFY_SEMANTI = SubLObjectFactory.makeString("Caught error in NL-TRIEFY-SEMANTIC-ASSERTION for~% ~S:~% ~S");
        $list358 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTRAINT"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $str359$Couldn_t_find_any_string_nl_trie_ = SubLObjectFactory.makeString("Couldn't find any string-nl-trie-word pairs for ~S with ~S from ~S");
        $list360 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("WU-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORTS"));
        $list361 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EACH-STR-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("EACH-PRED"));
        $list362 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $sym363$GAF_ASSERTION_ = SubLObjectFactory.makeSymbol("GAF-ASSERTION?");
        $kw364$UNDETERMINED = SubLObjectFactory.makeKeyword("UNDETERMINED");
        $list365 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD-STRINGS"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTRAINT"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $list366 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ABBREV-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("WU"), (SubLObject)SubLObjectFactory.makeSymbol("CONST"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-ABBR"));
        $sym367$RELEVANT_PRED_IS_EQ = SubLObjectFactory.makeSymbol("RELEVANT-PRED-IS-EQ");
        $list368 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ABBREV-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("WU"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-MW-STR"), (SubLObject)SubLObjectFactory.makeSymbol("CONST"), (SubLObject)SubLObjectFactory.makeSymbol("ABBR"));
        $const369$compoundString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("compoundString"));
        $list370 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ABBREV-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-MW-STR"), (SubLObject)SubLObjectFactory.makeSymbol("WU"), (SubLObject)SubLObjectFactory.makeSymbol("CONST"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-ABBR"));
        $const371$multiWordString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("multiWordString"));
        $str372$_ = SubLObjectFactory.makeString(" ");
        $kw373$AUGMENTED = SubLObjectFactory.makeKeyword("AUGMENTED");
        $kw374$REDUNDANT = SubLObjectFactory.makeKeyword("REDUNDANT");
        $kw375$ALL = SubLObjectFactory.makeKeyword("ALL");
        $sym376$NL_TRIE_PREDS_OF_POS = SubLObjectFactory.makeSymbol("NL-TRIE-PREDS-OF-POS");
        $const377$speechPartPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("speechPartPreds"));
        $const378$Verb = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb"));
        $sym379$_NL_TRIE_PREDS_OF_POS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*NL-TRIE-PREDS-OF-POS-CACHING-STATE*");
        $sym380$NL_TRIE_POS_OF_PRED = SubLObjectFactory.makeSymbol("NL-TRIE-POS-OF-PRED");
        $sym381$_NL_TRIE_POS_OF_PRED_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*NL-TRIE-POS-OF-PRED-CACHING-STATE*");
        $list382 = ConsesLow.list(new SubLObject[] { Characters.CHAR_comma, Characters.CHAR_question, Characters.CHAR_exclamation, Characters.CHAR_ampersand, Characters.CHAR_backslash, Characters.CHAR_slash, Characters.CHAR_quotation, Characters.CHAR_semicolon, Characters.CHAR_colon, Characters.CHAR_lparen, Characters.CHAR_rparen, Characters.CHAR_plus, Characters.CHAR_hyphen });
        $sym383$NL_TRIE_BREAK_CHAR_P = SubLObjectFactory.makeSymbol("NL-TRIE-BREAK-CHAR-P");
        $list384 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("-"), (SubLObject)SubLObjectFactory.makeString(""), (SubLObject)SubLObjectFactory.makeString(".")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString(""), (SubLObject)SubLObjectFactory.makeString(".")));
        $list385 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("-")), (SubLObject)nl_trie.NIL);
        $str386$_ = SubLObjectFactory.makeString("-");
        $sym387$DIGIT_CHAR_P = SubLObjectFactory.makeSymbol("DIGIT-CHAR-P");
        $list388 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("'"));
        $str389$_a_is_not_currently_an_NL_Trie_ = SubLObjectFactory.makeString("~a is not currently an NL Trie.");
        $str390$Couldn_t_find_any_strings_to_add_ = SubLObjectFactory.makeString("Couldn't find any strings to add to trie:~% ~S");
        $str391$Couldn_t_find_any_strings_to_remo = SubLObjectFactory.makeString("Couldn't find any strings to remove from trie:~% ~S");
        $str392$error_ = SubLObjectFactory.makeString("error ");
        $str393$Unable_to_determine_pragmatic_fea = SubLObjectFactory.makeString("Unable to determine pragmatic features for ~A");
        $const394$pragmaticallyAcceptable = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pragmaticallyAcceptable"));
        $sym395$FIND_POS_PREDS_FOR_LEX_CONST = SubLObjectFactory.makeSymbol("FIND-POS-PREDS-FOR-LEX-CONST");
        $list396 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("NOW"), (SubLObject)SubLObjectFactory.makeSymbol("LATER"));
        $sym397$SPEC_POS_PRED_ = SubLObjectFactory.makeSymbol("SPEC-POS-PRED?");
        $sym398$_NL_TRIE_NAME_STRING_PREDS_SET_ = SubLObjectFactory.makeSymbol("*NL-TRIE-NAME-STRING-PREDS-SET*");
        $list399 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $sym400$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $sym401$TRIEFY_NART = SubLObjectFactory.makeSymbol("TRIEFY-NART");
        $sym402$NL_TRIE_P = SubLObjectFactory.makeSymbol("NL-TRIE-P");
        $sym403$NL_TRIE_ITERATOR_DONE = SubLObjectFactory.makeSymbol("NL-TRIE-ITERATOR-DONE");
        $sym404$NL_TRIE_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("NL-TRIE-ITERATOR-NEXT");
        $list405 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("IS-CURRENT-NL-TRIE-P"));
        $sym406$NL_TRIE_STRING_TOKENIZE = SubLObjectFactory.makeSymbol("NL-TRIE-STRING-TOKENIZE");
        $kw407$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw408$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw409$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $list410 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-TEST-CASE-TABLES"));
        $kw411$KB = SubLObjectFactory.makeKeyword("KB");
        $kw412$FULL = SubLObjectFactory.makeKeyword("FULL");
        $kw413$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list414 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("George Bush, president of the United States")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("George"), (SubLObject)SubLObjectFactory.makeString("Bush"), (SubLObject)SubLObjectFactory.makeString(","), (SubLObject)SubLObjectFactory.makeString("president"), (SubLObject)SubLObjectFactory.makeString("of"), (SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("United"), (SubLObject)SubLObjectFactory.makeString("States"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("George Bush")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("George"), (SubLObject)SubLObjectFactory.makeString("Bush"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Mr. Bush")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Mr"), (SubLObject)SubLObjectFactory.makeString("Bush"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("I met George Bush.")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("I"), (SubLObject)SubLObjectFactory.makeString("met"), (SubLObject)SubLObjectFactory.makeString("George"), (SubLObject)SubLObjectFactory.makeString("Bush"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("3.6 kilos")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("3.6"), (SubLObject)SubLObjectFactory.makeString("kilos"))));
        $sym415$TEST_SWAPPABLE_NL_TRIE_DUMP = SubLObjectFactory.makeSymbol("TEST-SWAPPABLE-NL-TRIE-DUMP");
        $kw416$TINY = SubLObjectFactory.makeKeyword("TINY");
        $list417 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeString("North"), (SubLObject)SubLObjectFactory.makeString("Dartmouth"), (SubLObject)SubLObjectFactory.makeString(","), (SubLObject)SubLObjectFactory.makeString("Massachusetts")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("North"), (SubLObject)SubLObjectFactory.makeString("Vancouver")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("North"), (SubLObject)SubLObjectFactory.makeString("Anna"), (SubLObject)SubLObjectFactory.makeString("nuclear"), (SubLObject)SubLObjectFactory.makeString("power"), (SubLObject)SubLObjectFactory.makeString("plant")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("North"), (SubLObject)SubLObjectFactory.makeString("East"), (SubLObject)SubLObjectFactory.makeString("optic"), (SubLObject)SubLObjectFactory.makeString("network"), (SubLObject)SubLObjectFactory.makeString("("), (SubLObject)SubLObjectFactory.makeString("NOPT"), (SubLObject)SubLObjectFactory.makeString(")")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("North"), (SubLObject)SubLObjectFactory.makeString("central"), (SubLObject)SubLObjectFactory.makeString("intercollegiate"), (SubLObject)SubLObjectFactory.makeString("athletic"), (SubLObject)SubLObjectFactory.makeString("conference")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("North"), (SubLObject)SubLObjectFactory.makeString("sea")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("North"), (SubLObject)SubLObjectFactory.makeString("valley"), (SubLObject)SubLObjectFactory.makeString("Bancorp"), (SubLObject)SubLObjectFactory.makeString("("), (SubLObject)SubLObjectFactory.makeString("Nasdaq"), (SubLObject)SubLObjectFactory.makeString(":"), (SubLObject)SubLObjectFactory.makeString("Novb"), (SubLObject)SubLObjectFactory.makeString(")")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("North"), (SubLObject)SubLObjectFactory.makeString("Sea"), (SubLObject)SubLObjectFactory.makeString("Brent"), (SubLObject)SubLObjectFactory.makeString("crude")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("North"), (SubLObject)SubLObjectFactory.makeString("Rolandsay")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("North"), (SubLObject)SubLObjectFactory.makeString("county"), (SubLObject)SubLObjectFactory.makeString("Bancorp"), (SubLObject)SubLObjectFactory.makeString("("), (SubLObject)SubLObjectFactory.makeString("Nasdaq"), (SubLObject)SubLObjectFactory.makeString(":"), (SubLObject)SubLObjectFactory.makeString("NCBH"), (SubLObject)SubLObjectFactory.makeString(")")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("North"), (SubLObject)SubLObjectFactory.makeString("GOA"), (SubLObject)SubLObjectFactory.makeString("district")), ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("North"), SubLObjectFactory.makeString("point"), SubLObjectFactory.makeString("communications"), SubLObjectFactory.makeString("group"), SubLObjectFactory.makeString(","), SubLObjectFactory.makeString("inc"), SubLObjectFactory.makeString("("), SubLObjectFactory.makeString("Nasdaq"), SubLObjectFactory.makeString(":"), SubLObjectFactory.makeString("NPNT"), SubLObjectFactory.makeString(")") }), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("North"), (SubLObject)SubLObjectFactory.makeString("fork"), (SubLObject)SubLObjectFactory.makeString("ranger"), (SubLObject)SubLObjectFactory.makeString("district")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("North"), (SubLObject)SubLObjectFactory.makeString("Carolina"), (SubLObject)SubLObjectFactory.makeString("a"), (SubLObject)SubLObjectFactory.makeString("&"), (SubLObject)SubLObjectFactory.makeString("t"), (SubLObject)SubLObjectFactory.makeString("football"), (SubLObject)SubLObjectFactory.makeString("team")) })), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")));
        $str418$index = SubLObjectFactory.makeString("index");
        $str419$data = SubLObjectFactory.makeString("data");
        $kw420$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $kw421$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym422$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $str423$_A = SubLObjectFactory.makeString("~A");
        $kw424$SUCCESS = SubLObjectFactory.makeKeyword("SUCCESS");
    }
    
    public static final class $nl_trie_word_struc_native extends SubLStructNative
    {
        public SubLObject $syntactic_supports;
        public SubLObject $semantic_supports;
        private static final SubLStructDeclNative structDecl;
        
        public $nl_trie_word_struc_native() {
            this.$syntactic_supports = (SubLObject)CommonSymbols.NIL;
            this.$semantic_supports = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$nl_trie_word_struc_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$syntactic_supports;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$semantic_supports;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$syntactic_supports = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$semantic_supports = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$nl_trie_word_struc_native.class, nl_trie.$sym106$NL_TRIE_WORD_STRUC, nl_trie.$sym107$NL_TRIE_WORD_STRUC_P, nl_trie.$list109, nl_trie.$list110, new String[] { "$syntactic_supports", "$semantic_supports" }, nl_trie.$list111, nl_trie.$list112, nl_trie.$sym113$PPRINT_NL_TRIE_WORD_STRUC);
        }
    }
    
    public static final class $nl_trie_word_struc_p$UnaryFunction extends UnaryFunction
    {
        public $nl_trie_word_struc_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("NL-TRIE-WORD-STRUC-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return nl_trie.nl_trie_word_struc_p(arg1);
        }
    }
    
    public static final class $sxhash_nl_trie_word_struc_method$UnaryFunction extends UnaryFunction
    {
        public $sxhash_nl_trie_word_struc_method$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SXHASH-NL-TRIE-WORD-STRUC-METHOD"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return nl_trie.sxhash_nl_trie_word_struc_method(arg1);
        }
    }
    
    public static final class $cfasl_input_nl_trie_word_struc$UnaryFunction extends UnaryFunction
    {
        public $cfasl_input_nl_trie_word_struc$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CFASL-INPUT-NL-TRIE-WORD-STRUC"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return nl_trie.cfasl_input_nl_trie_word_struc(arg1);
        }
    }
    
    public static final class $nl_trie_semtrans_pred_has_pos_specificationP$UnaryFunction extends UnaryFunction
    {
        public $nl_trie_semtrans_pred_has_pos_specificationP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("NL-TRIE-SEMTRANS-PRED-HAS-POS-SPECIFICATION?"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return nl_trie.nl_trie_semtrans_pred_has_pos_specificationP(arg1);
        }
    }
    
    public static final class $nl_trie_break_char_p$UnaryFunction extends UnaryFunction
    {
        public $nl_trie_break_char_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("NL-TRIE-BREAK-CHAR-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return nl_trie.nl_trie_break_char_p(arg1);
        }
    }
    
    public static final class $nl_trie_syntactic_predP$UnaryFunction extends UnaryFunction
    {
        public $nl_trie_syntactic_predP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("NL-TRIE-SYNTACTIC-PRED?"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return nl_trie.nl_trie_syntactic_predP(arg1);
        }
    }
    
    public static final class $nl_trie_name_string_predP$UnaryFunction extends UnaryFunction
    {
        public $nl_trie_name_string_predP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("NL-TRIE-NAME-STRING-PRED?"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return nl_trie.nl_trie_name_string_predP(arg1);
        }
    }
}

/*

	Total time: 4197 ms
	
*/