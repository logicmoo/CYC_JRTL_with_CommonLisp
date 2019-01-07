package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_admitted_formula;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders;
import com.cyc.cycjava.cycl.rtp.rtp_iterators;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.rtp.rtp_initialize;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_assisted_reader extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rkf_assisted_reader";
    public static final String myFingerPrint = "0cea9b5c76f74feae7e5538d4705e8c3c7c37267a9974bbf61f104db91692a13";
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 1055L)
    private static SubLSymbol $ar_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 1451L)
    public static SubLSymbol $dtp_ar_sentence$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 3218L)
    public static SubLSymbol $dtp_ar_token$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 4303L)
    public static SubLSymbol $dtp_ar_phrase$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 9397L)
    public static SubLSymbol $dtp_ar_concept$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 15595L)
    public static SubLSymbol $dtp_ar_template$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 17225L)
    public static SubLSymbol $dtp_ar_state$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 37541L)
    private static SubLSymbol $max_surrogate_chain_length$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 38171L)
    private static SubLSymbol $ar_concept_grounding_map$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 39538L)
    public static SubLSymbol $ar_concept_cycle_count$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 41878L)
    private static SubLSymbol $ar_divide_best$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 46682L)
    public static SubLSymbol $rkf_ar_parsing_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 46959L)
    public static SubLSymbol $rkf_ar_semantics_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 47064L)
    public static SubLSymbol $rkf_user$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 49531L)
    public static SubLSymbol $rkf_ar_text_processor$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 49720L)
    public static SubLSymbol $rkf_ar_question_processor$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 49792L)
    public static SubLSymbol $rkf_ar_concept_harvester$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 49865L)
    public static SubLSymbol $rfk_ar_template_category_map$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 50008L)
    public static SubLSymbol $rkf_ar_processing_mode$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 59218L)
    private static SubLSymbol $rkf_ar_logging_default_parser$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 59288L)
    private static SubLSymbol $rkf_ar_logging_default_project$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 59354L)
    private static SubLSymbol $rkf_ar_logging_default_priority$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 80712L)
    private static SubLSymbol $rkf_reformulatable_terms$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 83847L)
    public static SubLSymbol $rkf_ar_additional_constraints$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 92140L)
    private static SubLSymbol $ar_pragmatic_relations$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 104061L)
    private static SubLSymbol $relation_args_sorted_by_restriction_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 104624L)
    private static SubLSymbol $all_relation_args_caching_state$;
    private static final SubLString $str0$Assisted_Reader_lock;
    private static final SubLSymbol $sym1$WITH_LOCK_HELD;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$AR_SENTENCE;
    private static final SubLSymbol $sym4$AR_SENTENCE_P;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLList $list7;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym10$AR_SENTENCE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$AR_SENTENCE_ID;
    private static final SubLSymbol $sym13$_CSETF_AR_SENTENCE_ID;
    private static final SubLSymbol $sym14$AR_SENTENCE_PLAINTEXT;
    private static final SubLSymbol $sym15$_CSETF_AR_SENTENCE_PLAINTEXT;
    private static final SubLSymbol $sym16$AR_SENTENCE_TOKEN_VECTOR;
    private static final SubLSymbol $sym17$_CSETF_AR_SENTENCE_TOKEN_VECTOR;
    private static final SubLSymbol $sym18$AR_SENTENCE_CLARIFICATIONS;
    private static final SubLSymbol $sym19$_CSETF_AR_SENTENCE_CLARIFICATIONS;
    private static final SubLSymbol $sym20$AR_SENTENCE_SOURCE_SENTENCE;
    private static final SubLSymbol $sym21$_CSETF_AR_SENTENCE_SOURCE_SENTENCE;
    private static final SubLSymbol $sym22$AR_SENTENCE_PHRASES;
    private static final SubLSymbol $sym23$_CSETF_AR_SENTENCE_PHRASES;
    private static final SubLSymbol $kw24$ID;
    private static final SubLSymbol $kw25$PLAINTEXT;
    private static final SubLSymbol $kw26$TOKEN_VECTOR;
    private static final SubLSymbol $kw27$CLARIFICATIONS;
    private static final SubLSymbol $kw28$SOURCE_SENTENCE;
    private static final SubLSymbol $kw29$PHRASES;
    private static final SubLString $str30$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw31$BEGIN;
    private static final SubLSymbol $sym32$MAKE_AR_SENTENCE;
    private static final SubLSymbol $kw33$SLOT;
    private static final SubLSymbol $kw34$END;
    private static final SubLSymbol $sym35$VISIT_DEFSTRUCT_OBJECT_AR_SENTENCE_METHOD;
    private static final SubLSymbol $sym36$SXHASH_AR_SENTENCE_METHOD;
    private static final SubLSymbol $sym37$VECTORP;
    private static final SubLSymbol $sym38$AR_PHRASE_P;
    private static final SubLSymbol $sym39$AR_TOKEN;
    private static final SubLSymbol $sym40$AR_TOKEN_P;
    private static final SubLList $list41;
    private static final SubLList $list42;
    private static final SubLList $list43;
    private static final SubLList $list44;
    private static final SubLSymbol $sym45$PRINT_AR_TOKEN;
    private static final SubLSymbol $sym46$AR_TOKEN_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list47;
    private static final SubLSymbol $sym48$AR_TOKEN_ID;
    private static final SubLSymbol $sym49$_CSETF_AR_TOKEN_ID;
    private static final SubLSymbol $sym50$AR_TOKEN_TEXT;
    private static final SubLSymbol $sym51$_CSETF_AR_TOKEN_TEXT;
    private static final SubLSymbol $sym52$AR_TOKEN_SENTENCE;
    private static final SubLSymbol $sym53$_CSETF_AR_TOKEN_SENTENCE;
    private static final SubLSymbol $sym54$AR_TOKEN_NUMBER;
    private static final SubLSymbol $sym55$_CSETF_AR_TOKEN_NUMBER;
    private static final SubLSymbol $sym56$AR_TOKEN_PHRASES;
    private static final SubLSymbol $sym57$_CSETF_AR_TOKEN_PHRASES;
    private static final SubLSymbol $kw58$TEXT;
    private static final SubLSymbol $kw59$SENTENCE;
    private static final SubLSymbol $kw60$NUMBER;
    private static final SubLSymbol $sym61$MAKE_AR_TOKEN;
    private static final SubLSymbol $sym62$VISIT_DEFSTRUCT_OBJECT_AR_TOKEN_METHOD;
    private static final SubLString $str63$_A_;
    private static final SubLSymbol $sym64$SXHASH_AR_TOKEN_METHOD;
    private static final SubLSymbol $sym65$AR_PHRASE;
    private static final SubLList $list66;
    private static final SubLList $list67;
    private static final SubLList $list68;
    private static final SubLList $list69;
    private static final SubLSymbol $sym70$PRINT_AR_PHRASE;
    private static final SubLSymbol $sym71$AR_PHRASE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list72;
    private static final SubLSymbol $sym73$AR_PHRASE_ID;
    private static final SubLSymbol $sym74$_CSETF_AR_PHRASE_ID;
    private static final SubLSymbol $sym75$AR_PHRASE_STATUS;
    private static final SubLSymbol $sym76$_CSETF_AR_PHRASE_STATUS;
    private static final SubLSymbol $sym77$AR_PHRASE_TOKEN_LIST;
    private static final SubLSymbol $sym78$_CSETF_AR_PHRASE_TOKEN_LIST;
    private static final SubLSymbol $sym79$AR_PHRASE_SENTENCE;
    private static final SubLSymbol $sym80$_CSETF_AR_PHRASE_SENTENCE;
    private static final SubLSymbol $sym81$AR_PHRASE_CONCEPTS;
    private static final SubLSymbol $sym82$_CSETF_AR_PHRASE_CONCEPTS;
    private static final SubLSymbol $sym83$AR_PHRASE_REJECTED_CONCEPTS;
    private static final SubLSymbol $sym84$_CSETF_AR_PHRASE_REJECTED_CONCEPTS;
    private static final SubLSymbol $sym85$AR_PHRASE_DISAMBIGUATED_CONCEPT;
    private static final SubLSymbol $sym86$_CSETF_AR_PHRASE_DISAMBIGUATED_CONCEPT;
    private static final SubLSymbol $sym87$AR_PHRASE_SURROGATE;
    private static final SubLSymbol $sym88$_CSETF_AR_PHRASE_SURROGATE;
    private static final SubLSymbol $sym89$AR_PHRASE_CONSTRAINT;
    private static final SubLSymbol $sym90$_CSETF_AR_PHRASE_CONSTRAINT;
    private static final SubLSymbol $sym91$AR_PHRASE_FORCE;
    private static final SubLSymbol $sym92$_CSETF_AR_PHRASE_FORCE;
    private static final SubLSymbol $kw93$STATUS;
    private static final SubLSymbol $kw94$TOKEN_LIST;
    private static final SubLSymbol $kw95$CONCEPTS;
    private static final SubLSymbol $kw96$REJECTED_CONCEPTS;
    private static final SubLSymbol $kw97$DISAMBIGUATED_CONCEPT;
    private static final SubLSymbol $kw98$SURROGATE;
    private static final SubLSymbol $kw99$CONSTRAINT;
    private static final SubLSymbol $kw100$FORCE;
    private static final SubLSymbol $sym101$MAKE_AR_PHRASE;
    private static final SubLSymbol $sym102$VISIT_DEFSTRUCT_OBJECT_AR_PHRASE_METHOD;
    private static final SubLString $str103$_AR_PHRASE__D_;
    private static final SubLString $str104$_;
    private static final SubLSymbol $sym105$SXHASH_AR_PHRASE_METHOD;
    private static final SubLSymbol $sym106$LISTP;
    private static final SubLSymbol $sym107$AR_CONCEPT_P;
    private static final SubLSymbol $sym108$KEYWORDP;
    private static final SubLString $str109$_;
    private static final SubLSymbol $kw110$QUESTION;
    private static final SubLString $str111$_;
    private static final SubLSymbol $kw112$DECLARATIVE;
    private static final SubLSymbol $kw113$NONE;
    private static final SubLSymbol $sym114$AR_CONCEPT;
    private static final SubLList $list115;
    private static final SubLList $list116;
    private static final SubLList $list117;
    private static final SubLList $list118;
    private static final SubLSymbol $sym119$PRINT_AR_CONCEPT;
    private static final SubLSymbol $sym120$AR_CONCEPT_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list121;
    private static final SubLSymbol $sym122$AR_CONCEPT_ID;
    private static final SubLSymbol $sym123$_CSETF_AR_CONCEPT_ID;
    private static final SubLSymbol $sym124$AR_CONCEPT_CYCL;
    private static final SubLSymbol $sym125$_CSETF_AR_CONCEPT_CYCL;
    private static final SubLSymbol $sym126$AR_CONCEPT_DISAMBIGUATION_TEXT;
    private static final SubLSymbol $sym127$_CSETF_AR_CONCEPT_DISAMBIGUATION_TEXT;
    private static final SubLSymbol $sym128$AR_CONCEPT_PHRASES;
    private static final SubLSymbol $sym129$_CSETF_AR_CONCEPT_PHRASES;
    private static final SubLSymbol $sym130$AR_CONCEPT_PARTS;
    private static final SubLSymbol $sym131$_CSETF_AR_CONCEPT_PARTS;
    private static final SubLSymbol $sym132$AR_CONCEPT_AGGLOMERATIONS;
    private static final SubLSymbol $sym133$_CSETF_AR_CONCEPT_AGGLOMERATIONS;
    private static final SubLSymbol $sym134$AR_CONCEPT_FORCE;
    private static final SubLSymbol $sym135$_CSETF_AR_CONCEPT_FORCE;
    private static final SubLSymbol $sym136$AR_CONCEPT_CONFIDENCE;
    private static final SubLSymbol $sym137$_CSETF_AR_CONCEPT_CONFIDENCE;
    private static final SubLSymbol $sym138$AR_CONCEPT_OPEN_TERM_SCORE;
    private static final SubLSymbol $sym139$_CSETF_AR_CONCEPT_OPEN_TERM_SCORE;
    private static final SubLSymbol $kw140$CYCL;
    private static final SubLSymbol $kw141$DISAMBIGUATION_TEXT;
    private static final SubLSymbol $kw142$PARTS;
    private static final SubLSymbol $kw143$AGGLOMERATIONS;
    private static final SubLSymbol $kw144$CONFIDENCE;
    private static final SubLSymbol $kw145$OPEN_TERM_SCORE;
    private static final SubLSymbol $sym146$MAKE_AR_CONCEPT;
    private static final SubLSymbol $sym147$VISIT_DEFSTRUCT_OBJECT_AR_CONCEPT_METHOD;
    private static final SubLString $str148$__AR_CONCEPT__S__S_;
    private static final SubLSymbol $sym149$SXHASH_AR_CONCEPT_METHOD;
    private static final SubLSymbol $sym150$STRINGP;
    private static final SubLSymbol $sym151$AR_TEMPLATE;
    private static final SubLSymbol $sym152$AR_TEMPLATE_P;
    private static final SubLList $list153;
    private static final SubLList $list154;
    private static final SubLList $list155;
    private static final SubLList $list156;
    private static final SubLSymbol $sym157$AR_TEMPLATE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list158;
    private static final SubLSymbol $sym159$AR_TEMPLATE_ID;
    private static final SubLSymbol $sym160$_CSETF_AR_TEMPLATE_ID;
    private static final SubLSymbol $sym161$AR_TEMPLATE_CONCEPT;
    private static final SubLSymbol $sym162$_CSETF_AR_TEMPLATE_CONCEPT;
    private static final SubLSymbol $sym163$AR_TEMPLATE_FORMULA;
    private static final SubLSymbol $sym164$_CSETF_AR_TEMPLATE_FORMULA;
    private static final SubLSymbol $sym165$AR_TEMPLATE_PROMPT;
    private static final SubLSymbol $sym166$_CSETF_AR_TEMPLATE_PROMPT;
    private static final SubLSymbol $sym167$AR_TEMPLATE_CHOICE_TABLE;
    private static final SubLSymbol $sym168$_CSETF_AR_TEMPLATE_CHOICE_TABLE;
    private static final SubLSymbol $sym169$AR_TEMPLATE_AGGLOMERATIONS;
    private static final SubLSymbol $sym170$_CSETF_AR_TEMPLATE_AGGLOMERATIONS;
    private static final SubLSymbol $kw171$CONCEPT;
    private static final SubLSymbol $kw172$FORMULA;
    private static final SubLSymbol $kw173$PROMPT;
    private static final SubLSymbol $kw174$CHOICE_TABLE;
    private static final SubLSymbol $sym175$MAKE_AR_TEMPLATE;
    private static final SubLSymbol $sym176$VISIT_DEFSTRUCT_OBJECT_AR_TEMPLATE_METHOD;
    private static final SubLSymbol $sym177$SXHASH_AR_TEMPLATE_METHOD;
    private static final SubLSymbol $sym178$CONSP;
    private static final SubLSymbol $sym179$AR_STATE;
    private static final SubLSymbol $sym180$AR_STATE_P;
    private static final SubLList $list181;
    private static final SubLList $list182;
    private static final SubLList $list183;
    private static final SubLList $list184;
    private static final SubLSymbol $sym185$AR_STATE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list186;
    private static final SubLSymbol $sym187$AR_STATE_ISG;
    private static final SubLSymbol $sym188$_CSETF_AR_STATE_ISG;
    private static final SubLSymbol $sym189$AR_STATE_INDEX;
    private static final SubLSymbol $sym190$_CSETF_AR_STATE_INDEX;
    private static final SubLSymbol $sym191$AR_STATE_SOURCE_SENTENCES;
    private static final SubLSymbol $sym192$_CSETF_AR_STATE_SOURCE_SENTENCES;
    private static final SubLSymbol $sym193$AR_STATE_FOCUS_SENTENCE;
    private static final SubLSymbol $sym194$_CSETF_AR_STATE_FOCUS_SENTENCE;
    private static final SubLSymbol $sym195$AR_STATE_COMPLETED_SENTENCES;
    private static final SubLSymbol $sym196$_CSETF_AR_STATE_COMPLETED_SENTENCES;
    private static final SubLSymbol $sym197$AR_STATE_UNKNOWN_PHRASES;
    private static final SubLSymbol $sym198$_CSETF_AR_STATE_UNKNOWN_PHRASES;
    private static final SubLSymbol $sym199$AR_STATE_REJECTED_PHRASES;
    private static final SubLSymbol $sym200$_CSETF_AR_STATE_REJECTED_PHRASES;
    private static final SubLSymbol $sym201$AR_STATE_IRRELEVANT_PHRASES;
    private static final SubLSymbol $sym202$_CSETF_AR_STATE_IRRELEVANT_PHRASES;
    private static final SubLSymbol $sym203$AR_STATE_AMBIGUOUS_PHRASES;
    private static final SubLSymbol $sym204$_CSETF_AR_STATE_AMBIGUOUS_PHRASES;
    private static final SubLSymbol $sym205$AR_STATE_ASSUMED_PHRASES;
    private static final SubLSymbol $sym206$_CSETF_AR_STATE_ASSUMED_PHRASES;
    private static final SubLSymbol $sym207$AR_STATE_PENDING_PHRASES;
    private static final SubLSymbol $sym208$_CSETF_AR_STATE_PENDING_PHRASES;
    private static final SubLSymbol $sym209$AR_STATE_ACCEPTED_PHRASES;
    private static final SubLSymbol $sym210$_CSETF_AR_STATE_ACCEPTED_PHRASES;
    private static final SubLSymbol $sym211$AR_STATE_PENDING_CONCEPTS;
    private static final SubLSymbol $sym212$_CSETF_AR_STATE_PENDING_CONCEPTS;
    private static final SubLSymbol $sym213$AR_STATE_ACCEPTED_CONCEPTS;
    private static final SubLSymbol $sym214$_CSETF_AR_STATE_ACCEPTED_CONCEPTS;
    private static final SubLSymbol $sym215$AR_STATE_CANDIDATE_CYCLS;
    private static final SubLSymbol $sym216$_CSETF_AR_STATE_CANDIDATE_CYCLS;
    private static final SubLSymbol $sym217$AR_STATE_ASSERTED_ASSERTIONS;
    private static final SubLSymbol $sym218$_CSETF_AR_STATE_ASSERTED_ASSERTIONS;
    private static final SubLSymbol $sym219$AR_STATE_TERM_TEMPLATES;
    private static final SubLSymbol $sym220$_CSETF_AR_STATE_TERM_TEMPLATES;
    private static final SubLSymbol $sym221$AR_STATE_ASSERT_TEMPLATES;
    private static final SubLSymbol $sym222$_CSETF_AR_STATE_ASSERT_TEMPLATES;
    private static final SubLSymbol $kw223$ISG;
    private static final SubLSymbol $kw224$INDEX;
    private static final SubLSymbol $kw225$SOURCE_SENTENCES;
    private static final SubLSymbol $kw226$FOCUS_SENTENCE;
    private static final SubLSymbol $kw227$COMPLETED_SENTENCES;
    private static final SubLSymbol $kw228$UNKNOWN_PHRASES;
    private static final SubLSymbol $kw229$REJECTED_PHRASES;
    private static final SubLSymbol $kw230$IRRELEVANT_PHRASES;
    private static final SubLSymbol $kw231$AMBIGUOUS_PHRASES;
    private static final SubLSymbol $kw232$ASSUMED_PHRASES;
    private static final SubLSymbol $kw233$PENDING_PHRASES;
    private static final SubLSymbol $kw234$ACCEPTED_PHRASES;
    private static final SubLSymbol $kw235$PENDING_CONCEPTS;
    private static final SubLSymbol $kw236$ACCEPTED_CONCEPTS;
    private static final SubLSymbol $kw237$CANDIDATE_CYCLS;
    private static final SubLSymbol $kw238$ASSERTED_ASSERTIONS;
    private static final SubLSymbol $kw239$TERM_TEMPLATES;
    private static final SubLSymbol $kw240$ASSERT_TEMPLATES;
    private static final SubLSymbol $sym241$MAKE_AR_STATE;
    private static final SubLSymbol $sym242$VISIT_DEFSTRUCT_OBJECT_AR_STATE_METHOD;
    private static final SubLSymbol $sym243$AR_PHRASE_SPAN_LENGTH_;
    private static final SubLSymbol $sym244$AR_CONCEPT_ASSERTION_;
    private static final SubLSymbol $sym245$AR_CONCEPT_QUERY_;
    private static final SubLSymbol $sym246$_;
    private static final SubLSymbol $kw247$ASSUMED;
    private static final SubLSymbol $sym248$NOT_EQL;
    private static final SubLSymbol $kw249$UNKNOWN;
    private static final SubLString $str250$no_discourse_context;
    private static final SubLSymbol $kw251$PENDING;
    private static final SubLSymbol $sym252$RKF_DISC_IMPLIED_INDEXICALS_FORMULA_;
    private static final SubLSymbol $kw253$AMBIGUOUS;
    private static final SubLSymbol $sym254$MEMBER;
    private static final SubLSymbol $sym255$AR_DETERMINE_CONCEPT_SENTENCES;
    private static final SubLSymbol $sym256$CLET;
    private static final SubLList $list257;
    private static final SubLList $list258;
    private static final SubLSymbol $sym259$PROGN;
    private static final SubLSymbol $kw260$GROUNDED;
    private static final SubLSymbol $kw261$UNGROUNDED;
    private static final SubLSymbol $kw262$IN_PROGRESS;
    private static final SubLInteger $int263$10000;
    private static final SubLObject $const264$TheResultOfParsing;
    private static final SubLSymbol $sym265$_;
    private static final SubLSymbol $sym266$AR_CONCEPT_COMPLEXITY;
    private static final SubLSymbol $sym267$AR_PHRASE_DIVIDE_EQ_BEST_LAMBDA_SUBSTITUTE;
    private static final SubLSymbol $kw268$IGNORE;
    private static final SubLObject $const269$isa;
    private static final SubLObject $const270$genls;
    private static final SubLString $str271$Assisted_Reader_reading_texts;
    private static final SubLSymbol $sym272$RKF_AR_ACT_ADD_SOURCE_TEXTS_BACKGROUND_INTERNAL;
    private static final SubLSymbol $kw273$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym274$IGNORE_ERRORS_HANDLER;
    private static final SubLSymbol $sym275$HLMT_P;
    private static final SubLString $str276$Assisted_Reader_rewriting_a_sente;
    private static final SubLSymbol $sym277$RKF_AR_ACT_ADD_REWRITE_TEXTS_BACKGROUND_INTERNAL;
    private static final SubLSymbol $sym278$RKF_SENTENCE_READER;
    private static final SubLSymbol $sym279$RKF_QUESTION_READER;
    private static final SubLSymbol $sym280$RKF_CONCEPT_HARVESTER;
    private static final SubLList $list281;
    private static final SubLSymbol $kw282$TEXT_PROCESSING;
    private static final SubLSymbol $kw283$QUESTION_PROCESSING;
    private static final SubLSymbol $sym284$VECTOR;
    private static final SubLSymbol $kw285$UNINTERESTING;
    private static final SubLSymbol $sym286$RTP_TEMPLATE_CATEGORY_;
    private static final SubLObject $const287$STemplate;
    private static final SubLSymbol $sym288$UNKNOWN_INSTANCE_INDEXED_EXPRESSION_;
    private static final SubLSymbol $sym289$ROP_FROM_UNKNOWN_INSTANCE_INDEXED_FN;
    private static final SubLSymbol $sym290$ITP_SEQUEL;
    private static final SubLString $str291$UIA_use;
    private static final SubLString $str292$Medium;
    private static final SubLSymbol $kw293$IRRELEVANT;
    private static final SubLSymbol $kw294$ACCEPTED;
    private static final SubLSymbol $kw295$REJECTED;
    private static final SubLObject $const296$RewriteSequenceFn;
    private static final SubLObject $const297$elementOf;
    private static final SubLSymbol $kw298$NO_DISAMBIGS;
    private static final SubLObject $const299$TheNthFn;
    private static final SubLObject $const300$TheSetOf;
    private static final SubLObject $const301$Thing;
    private static final SubLSymbol $sym302$RKF_REFORMULATABLE_TERM_;
    private static final SubLSymbol $sym303$RELEVANT_MT_IS_GENL_MT;
    private static final SubLList $list304;
    private static final SubLObject $const305$genlFunctions;
    private static final SubLObject $const306$NLTagFn;
    private static final SubLObject $const307$NLUtteranceAttribute;
    private static final SubLSymbol $kw308$INITIALIZED;
    private static final SubLList $list309;
    private static final SubLSymbol $sym310$_RKF_AR_ADDITIONAL_CONSTRAINTS_;
    private static final SubLSymbol $sym311$KEYWORD_IMPOSTOR_P;
    private static final SubLSymbol $sym312$KEYWORD_FROM_IMPOSTOR;
    private static final SubLList $list313;
    private static final SubLSymbol $sym314$RKF_AR_PHRASE_SUBSUMED;
    private static final SubLObject $const315$TruthFunction;
    private static final SubLList $list316;
    private static final SubLSymbol $sym317$RKF_AR_CONTEXT_REFERENCE_P;
    private static final SubLObject $const318$TheSpec;
    private static final SubLObject $const319$TheInstance;
    private static final SubLSymbol $sym320$CDR;
    private static final SubLSymbol $sym321$CAR;
    private static final SubLSymbol $sym322$RELATION_ARGS_SORTED_BY_RESTRICTION;
    private static final SubLSymbol $sym323$SECOND;
    private static final SubLSymbol $sym324$_RELATION_ARGS_SORTED_BY_RESTRICTION_CACHING_STATE_;
    private static final SubLInteger $int325$64;
    private static final SubLSymbol $sym326$ALL_RELATION_ARGS;
    private static final SubLSymbol $sym327$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const328$EverythingPSC;
    private static final SubLSymbol $sym329$_ALL_RELATION_ARGS_CACHING_STATE_;
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 1357L)
    public static SubLObject with_ar_lock(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)rkf_assisted_reader.$sym1$WITH_LOCK_HELD, (SubLObject)rkf_assisted_reader.$list2, ConsesLow.append(body, (SubLObject)rkf_assisted_reader.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 1451L)
    public static SubLObject ar_sentence_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)rkf_assisted_reader.ZERO_INTEGER);
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 1451L)
    public static SubLObject ar_sentence_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $ar_sentence_native.class) ? rkf_assisted_reader.T : rkf_assisted_reader.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 1451L)
    public static SubLObject ar_sentence_id(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_sentence_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 1451L)
    public static SubLObject ar_sentence_plaintext(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_sentence_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 1451L)
    public static SubLObject ar_sentence_token_vector(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_sentence_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 1451L)
    public static SubLObject ar_sentence_clarifications(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_sentence_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 1451L)
    public static SubLObject ar_sentence_source_sentence(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_sentence_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 1451L)
    public static SubLObject ar_sentence_phrases(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_sentence_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 1451L)
    public static SubLObject _csetf_ar_sentence_id(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_sentence_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 1451L)
    public static SubLObject _csetf_ar_sentence_plaintext(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_sentence_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 1451L)
    public static SubLObject _csetf_ar_sentence_token_vector(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_sentence_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 1451L)
    public static SubLObject _csetf_ar_sentence_clarifications(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_sentence_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 1451L)
    public static SubLObject _csetf_ar_sentence_source_sentence(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_sentence_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 1451L)
    public static SubLObject _csetf_ar_sentence_phrases(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_sentence_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 1451L)
    public static SubLObject make_ar_sentence(SubLObject arglist) {
        if (arglist == rkf_assisted_reader.UNPROVIDED) {
            arglist = (SubLObject)rkf_assisted_reader.NIL;
        }
        final SubLObject v_new = (SubLObject)new $ar_sentence_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)rkf_assisted_reader.NIL, next = arglist; rkf_assisted_reader.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw24$ID)) {
                _csetf_ar_sentence_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw25$PLAINTEXT)) {
                _csetf_ar_sentence_plaintext(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw26$TOKEN_VECTOR)) {
                _csetf_ar_sentence_token_vector(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw27$CLARIFICATIONS)) {
                _csetf_ar_sentence_clarifications(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw28$SOURCE_SENTENCE)) {
                _csetf_ar_sentence_source_sentence(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw29$PHRASES)) {
                _csetf_ar_sentence_phrases(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)rkf_assisted_reader.$str30$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 1451L)
    public static SubLObject visit_defstruct_ar_sentence(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw31$BEGIN, (SubLObject)rkf_assisted_reader.$sym32$MAKE_AR_SENTENCE, (SubLObject)rkf_assisted_reader.SIX_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw24$ID, ar_sentence_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw25$PLAINTEXT, ar_sentence_plaintext(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw26$TOKEN_VECTOR, ar_sentence_token_vector(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw27$CLARIFICATIONS, ar_sentence_clarifications(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw28$SOURCE_SENTENCE, ar_sentence_source_sentence(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw29$PHRASES, ar_sentence_phrases(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw34$END, (SubLObject)rkf_assisted_reader.$sym32$MAKE_AR_SENTENCE, (SubLObject)rkf_assisted_reader.SIX_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 1451L)
    public static SubLObject visit_defstruct_object_ar_sentence_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_ar_sentence(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 1846L)
    public static SubLObject sxhash_ar_sentence_method(final SubLObject v_object) {
        return Sxhash.sxhash(ar_sentence_id(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 1934L)
    public static SubLObject new_ar_sentence(final SubLObject state, final SubLObject plaintext) {
        final SubLObject sentence = make_ar_sentence((SubLObject)rkf_assisted_reader.UNPROVIDED);
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            final SubLObject id = next_ar_state_id(state);
            _csetf_ar_sentence_id(sentence, id);
            _csetf_ar_sentence_plaintext(sentence, plaintext);
            add_ar_object_index(state, id, sentence);
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 2247L)
    public static SubLObject note_ar_sentence_token_vector(final SubLObject sentence, final SubLObject token_vector) {
        assert rkf_assisted_reader.NIL != ar_sentence_p(sentence) : sentence;
        assert rkf_assisted_reader.NIL != Types.vectorp(token_vector) : token_vector;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            _csetf_ar_sentence_token_vector(sentence, token_vector);
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 2487L)
    public static SubLObject add_ar_sentence_phrase(final SubLObject sentence, final SubLObject phrase) {
        assert rkf_assisted_reader.NIL != ar_sentence_p(sentence) : sentence;
        assert rkf_assisted_reader.NIL != ar_phrase_p(phrase) : phrase;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            if (rkf_assisted_reader.NIL == conses_high.member(phrase, ar_sentence_phrases(sentence), Symbols.symbol_function((SubLObject)rkf_assisted_reader.EQL), Symbols.symbol_function((SubLObject)rkf_assisted_reader.IDENTITY))) {
                _csetf_ar_sentence_phrases(sentence, (SubLObject)ConsesLow.cons(phrase, ar_sentence_phrases(sentence)));
            }
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 2704L)
    public static SubLObject add_ar_sentence_clarification(final SubLObject sentence, final SubLObject clarification) {
        assert rkf_assisted_reader.NIL != ar_sentence_p(sentence) : sentence;
        assert rkf_assisted_reader.NIL != ar_sentence_p(clarification) : clarification;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            if (rkf_assisted_reader.NIL == conses_high.member(clarification, ar_sentence_clarifications(sentence), Symbols.symbol_function((SubLObject)rkf_assisted_reader.EQL), Symbols.symbol_function((SubLObject)rkf_assisted_reader.IDENTITY))) {
                _csetf_ar_sentence_clarifications(sentence, (SubLObject)ConsesLow.cons(clarification, ar_sentence_clarifications(sentence)));
            }
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 2958L)
    public static SubLObject note_ar_sentence_source_sentence(final SubLObject clarification, final SubLObject sentence) {
        assert rkf_assisted_reader.NIL != ar_sentence_p(clarification) : clarification;
        assert rkf_assisted_reader.NIL != ar_sentence_p(sentence) : sentence;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            _csetf_ar_sentence_source_sentence(clarification, sentence);
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return clarification;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 3218L)
    public static SubLObject ar_token_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_ar_token(v_object, stream, (SubLObject)rkf_assisted_reader.ZERO_INTEGER);
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 3218L)
    public static SubLObject ar_token_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $ar_token_native.class) ? rkf_assisted_reader.T : rkf_assisted_reader.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 3218L)
    public static SubLObject ar_token_id(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_token_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 3218L)
    public static SubLObject ar_token_text(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_token_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 3218L)
    public static SubLObject ar_token_sentence(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_token_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 3218L)
    public static SubLObject ar_token_number(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_token_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 3218L)
    public static SubLObject ar_token_phrases(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_token_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 3218L)
    public static SubLObject _csetf_ar_token_id(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_token_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 3218L)
    public static SubLObject _csetf_ar_token_text(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_token_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 3218L)
    public static SubLObject _csetf_ar_token_sentence(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_token_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 3218L)
    public static SubLObject _csetf_ar_token_number(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_token_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 3218L)
    public static SubLObject _csetf_ar_token_phrases(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_token_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 3218L)
    public static SubLObject make_ar_token(SubLObject arglist) {
        if (arglist == rkf_assisted_reader.UNPROVIDED) {
            arglist = (SubLObject)rkf_assisted_reader.NIL;
        }
        final SubLObject v_new = (SubLObject)new $ar_token_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)rkf_assisted_reader.NIL, next = arglist; rkf_assisted_reader.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw24$ID)) {
                _csetf_ar_token_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw58$TEXT)) {
                _csetf_ar_token_text(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw59$SENTENCE)) {
                _csetf_ar_token_sentence(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw60$NUMBER)) {
                _csetf_ar_token_number(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw29$PHRASES)) {
                _csetf_ar_token_phrases(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)rkf_assisted_reader.$str30$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 3218L)
    public static SubLObject visit_defstruct_ar_token(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw31$BEGIN, (SubLObject)rkf_assisted_reader.$sym61$MAKE_AR_TOKEN, (SubLObject)rkf_assisted_reader.FIVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw24$ID, ar_token_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw58$TEXT, ar_token_text(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw59$SENTENCE, ar_token_sentence(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw60$NUMBER, ar_token_number(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw29$PHRASES, ar_token_phrases(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw34$END, (SubLObject)rkf_assisted_reader.$sym61$MAKE_AR_TOKEN, (SubLObject)rkf_assisted_reader.FIVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 3218L)
    public static SubLObject visit_defstruct_object_ar_token_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_ar_token(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 3512L)
    public static SubLObject print_ar_token(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)rkf_assisted_reader.$str63$_A_, ar_token_text(v_object));
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 3646L)
    public static SubLObject sxhash_ar_token_method(final SubLObject v_object) {
        return Sxhash.sxhash(ar_token_id(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 3730L)
    public static SubLObject new_ar_token(final SubLObject state, final SubLObject text, final SubLObject sentence, final SubLObject number) {
        final SubLObject token = make_ar_token((SubLObject)rkf_assisted_reader.UNPROVIDED);
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            final SubLObject id = next_ar_state_id(state);
            _csetf_ar_token_id(token, id);
            _csetf_ar_token_text(token, text);
            _csetf_ar_token_sentence(token, sentence);
            _csetf_ar_token_number(token, number);
            add_ar_object_index(state, id, token);
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return token;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 4107L)
    public static SubLObject add_ar_token_phrase(final SubLObject token, final SubLObject phrase) {
        assert rkf_assisted_reader.NIL != ar_token_p(token) : token;
        assert rkf_assisted_reader.NIL != ar_phrase_p(phrase) : phrase;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            if (rkf_assisted_reader.NIL == conses_high.member(phrase, ar_token_phrases(token), Symbols.symbol_function((SubLObject)rkf_assisted_reader.EQL), Symbols.symbol_function((SubLObject)rkf_assisted_reader.IDENTITY))) {
                _csetf_ar_token_phrases(token, (SubLObject)ConsesLow.cons(phrase, ar_token_phrases(token)));
            }
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return token;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 4303L)
    public static SubLObject ar_phrase_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_ar_phrase(v_object, stream, (SubLObject)rkf_assisted_reader.ZERO_INTEGER);
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 4303L)
    public static SubLObject ar_phrase_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $ar_phrase_native.class) ? rkf_assisted_reader.T : rkf_assisted_reader.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 4303L)
    public static SubLObject ar_phrase_id(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_phrase_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 4303L)
    public static SubLObject ar_phrase_status(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_phrase_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 4303L)
    public static SubLObject ar_phrase_token_list(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_phrase_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 4303L)
    public static SubLObject ar_phrase_sentence(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_phrase_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 4303L)
    public static SubLObject ar_phrase_concepts(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_phrase_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 4303L)
    public static SubLObject ar_phrase_rejected_concepts(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_phrase_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 4303L)
    public static SubLObject ar_phrase_disambiguated_concept(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_phrase_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 4303L)
    public static SubLObject ar_phrase_surrogate(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_phrase_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 4303L)
    public static SubLObject ar_phrase_constraint(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_phrase_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 4303L)
    public static SubLObject ar_phrase_force(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_phrase_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 4303L)
    public static SubLObject _csetf_ar_phrase_id(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_phrase_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 4303L)
    public static SubLObject _csetf_ar_phrase_status(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_phrase_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 4303L)
    public static SubLObject _csetf_ar_phrase_token_list(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_phrase_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 4303L)
    public static SubLObject _csetf_ar_phrase_sentence(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_phrase_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 4303L)
    public static SubLObject _csetf_ar_phrase_concepts(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_phrase_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 4303L)
    public static SubLObject _csetf_ar_phrase_rejected_concepts(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_phrase_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 4303L)
    public static SubLObject _csetf_ar_phrase_disambiguated_concept(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_phrase_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 4303L)
    public static SubLObject _csetf_ar_phrase_surrogate(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_phrase_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 4303L)
    public static SubLObject _csetf_ar_phrase_constraint(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_phrase_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 4303L)
    public static SubLObject _csetf_ar_phrase_force(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_phrase_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 4303L)
    public static SubLObject make_ar_phrase(SubLObject arglist) {
        if (arglist == rkf_assisted_reader.UNPROVIDED) {
            arglist = (SubLObject)rkf_assisted_reader.NIL;
        }
        final SubLObject v_new = (SubLObject)new $ar_phrase_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)rkf_assisted_reader.NIL, next = arglist; rkf_assisted_reader.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw24$ID)) {
                _csetf_ar_phrase_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw93$STATUS)) {
                _csetf_ar_phrase_status(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw94$TOKEN_LIST)) {
                _csetf_ar_phrase_token_list(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw59$SENTENCE)) {
                _csetf_ar_phrase_sentence(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw95$CONCEPTS)) {
                _csetf_ar_phrase_concepts(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw96$REJECTED_CONCEPTS)) {
                _csetf_ar_phrase_rejected_concepts(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw97$DISAMBIGUATED_CONCEPT)) {
                _csetf_ar_phrase_disambiguated_concept(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw98$SURROGATE)) {
                _csetf_ar_phrase_surrogate(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw99$CONSTRAINT)) {
                _csetf_ar_phrase_constraint(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw100$FORCE)) {
                _csetf_ar_phrase_force(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)rkf_assisted_reader.$str30$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 4303L)
    public static SubLObject visit_defstruct_ar_phrase(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw31$BEGIN, (SubLObject)rkf_assisted_reader.$sym101$MAKE_AR_PHRASE, (SubLObject)rkf_assisted_reader.TEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw24$ID, ar_phrase_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw93$STATUS, ar_phrase_status(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw94$TOKEN_LIST, ar_phrase_token_list(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw59$SENTENCE, ar_phrase_sentence(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw95$CONCEPTS, ar_phrase_concepts(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw96$REJECTED_CONCEPTS, ar_phrase_rejected_concepts(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw97$DISAMBIGUATED_CONCEPT, ar_phrase_disambiguated_concept(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw98$SURROGATE, ar_phrase_surrogate(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw99$CONSTRAINT, ar_phrase_constraint(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw100$FORCE, ar_phrase_force(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw34$END, (SubLObject)rkf_assisted_reader.$sym101$MAKE_AR_PHRASE, (SubLObject)rkf_assisted_reader.TEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 4303L)
    public static SubLObject visit_defstruct_object_ar_phrase_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_ar_phrase(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 4936L)
    public static SubLObject print_ar_phrase(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLObject token_list = ar_phrase_token_list(v_object);
        PrintLow.format(stream, (SubLObject)rkf_assisted_reader.$str103$_AR_PHRASE__D_, ar_phrase_id(v_object));
        SubLObject cdolist_list_var = token_list;
        SubLObject token = (SubLObject)rkf_assisted_reader.NIL;
        token = cdolist_list_var.first();
        while (rkf_assisted_reader.NIL != cdolist_list_var) {
            streams_high.write_string(ar_token_text(token), stream, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED);
            streams_high.write_char((SubLObject)Characters.CHAR_space, stream);
            cdolist_list_var = cdolist_list_var.rest();
            token = cdolist_list_var.first();
        }
        streams_high.write_string((SubLObject)rkf_assisted_reader.$str104$_, stream, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED);
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 5287L)
    public static SubLObject sxhash_ar_phrase_method(final SubLObject v_object) {
        return Sxhash.sxhash(ar_phrase_id(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 5371L)
    public static SubLObject new_ar_phrase(final SubLObject state, final SubLObject sentence, final SubLObject token_list) {
        assert rkf_assisted_reader.NIL != ar_sentence_p(sentence) : sentence;
        assert rkf_assisted_reader.NIL != Types.listp(token_list) : token_list;
        final SubLObject phrase = make_ar_phrase((SubLObject)rkf_assisted_reader.UNPROVIDED);
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            final SubLObject id = next_ar_state_id(state);
            _csetf_ar_phrase_id(phrase, id);
            _csetf_ar_phrase_sentence(phrase, sentence);
            _csetf_ar_phrase_token_list(phrase, token_list);
            _csetf_ar_phrase_force(phrase, compute_ar_phrase_force(phrase, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED));
            add_ar_object_index(state, id, phrase);
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        clear_ar_phrase_disambiguated_concept(phrase);
        SubLObject cdolist_list_var = token_list;
        SubLObject token = (SubLObject)rkf_assisted_reader.NIL;
        token = cdolist_list_var.first();
        while (rkf_assisted_reader.NIL != cdolist_list_var) {
            add_ar_token_phrase(token, phrase);
            cdolist_list_var = cdolist_list_var.rest();
            token = cdolist_list_var.first();
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 5989L)
    public static SubLObject add_ar_phrase_concept(final SubLObject phrase, final SubLObject concept) {
        assert rkf_assisted_reader.NIL != ar_phrase_p(phrase) : phrase;
        assert rkf_assisted_reader.NIL != ar_concept_p(concept) : concept;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            if (rkf_assisted_reader.NIL == conses_high.member(concept, ar_phrase_concepts(phrase), Symbols.symbol_function((SubLObject)rkf_assisted_reader.EQL), Symbols.symbol_function((SubLObject)rkf_assisted_reader.IDENTITY))) {
                _csetf_ar_phrase_concepts(phrase, (SubLObject)ConsesLow.cons(concept, ar_phrase_concepts(phrase)));
            }
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 6198L)
    public static SubLObject remove_ar_phrase_concept(final SubLObject phrase, final SubLObject concept) {
        assert rkf_assisted_reader.NIL != ar_phrase_p(phrase) : phrase;
        assert rkf_assisted_reader.NIL != ar_concept_p(concept) : concept;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            _csetf_ar_phrase_concepts(phrase, Sequences.remove(concept, ar_phrase_concepts(phrase), (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED));
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 6444L)
    public static SubLObject add_ar_phrase_rejected_concept(final SubLObject phrase, final SubLObject concept) {
        assert rkf_assisted_reader.NIL != ar_phrase_p(phrase) : phrase;
        assert rkf_assisted_reader.NIL != ar_concept_p(concept) : concept;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            if (rkf_assisted_reader.NIL == conses_high.member(concept, ar_phrase_rejected_concepts(phrase), Symbols.symbol_function((SubLObject)rkf_assisted_reader.EQL), Symbols.symbol_function((SubLObject)rkf_assisted_reader.IDENTITY))) {
                _csetf_ar_phrase_rejected_concepts(phrase, (SubLObject)ConsesLow.cons(concept, ar_phrase_rejected_concepts(phrase)));
            }
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 6671L)
    public static SubLObject clear_ar_phrase_disambiguated_concept(final SubLObject phrase) {
        assert rkf_assisted_reader.NIL != ar_phrase_p(phrase) : phrase;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            _csetf_ar_phrase_disambiguated_concept(phrase, (SubLObject)rkf_assisted_reader.NIL);
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 6877L)
    public static SubLObject note_ar_phrase_disambiguated_concept(final SubLObject phrase, final SubLObject concept) {
        assert rkf_assisted_reader.NIL != ar_phrase_p(phrase) : phrase;
        assert rkf_assisted_reader.NIL != ar_concept_p(concept) : concept;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            _csetf_ar_phrase_disambiguated_concept(phrase, concept);
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 7111L)
    public static SubLObject note_ar_phrase_status(final SubLObject phrase, final SubLObject status) {
        assert rkf_assisted_reader.NIL != ar_phrase_p(phrase) : phrase;
        assert rkf_assisted_reader.NIL != Types.keywordp(status) : status;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            _csetf_ar_phrase_status(phrase, status);
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 7308L)
    public static SubLObject note_ar_phrase_force(final SubLObject phrase, final SubLObject force) {
        assert rkf_assisted_reader.NIL != ar_phrase_p(phrase) : phrase;
        assert rkf_assisted_reader.NIL != Types.keywordp(force) : force;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            _csetf_ar_phrase_force(phrase, force);
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 7500L)
    public static SubLObject note_ar_phrase_surrogate(final SubLObject phrase, final SubLObject surrogate) {
        assert rkf_assisted_reader.NIL != ar_phrase_p(phrase) : phrase;
        assert rkf_assisted_reader.NIL != ar_concept_p(surrogate) : surrogate;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            SubLObject surrogates = ar_phrase_surrogate(phrase);
            surrogates = (SubLObject)ConsesLow.cons(surrogate, surrogates);
            _csetf_ar_phrase_surrogate(phrase, surrogates);
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 7809L)
    public static SubLObject note_ar_phrase_constraint(final SubLObject phrase, final SubLObject constraint) {
        assert rkf_assisted_reader.NIL != ar_phrase_p(phrase) : phrase;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            _csetf_ar_phrase_constraint(phrase, constraint);
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 7991L)
    public static SubLObject compute_ar_phrase_force(final SubLObject phrase, SubLObject default_sentenceP, SubLObject mt) {
        if (default_sentenceP == rkf_assisted_reader.UNPROVIDED) {
            default_sentenceP = (SubLObject)rkf_assisted_reader.T;
        }
        if (mt == rkf_assisted_reader.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject token_list = ar_phrase_token_list(phrase);
        final SubLObject first_token = ar_token_text(token_list.first());
        final SubLObject last_token = ar_token_text(conses_high.last(token_list, (SubLObject)rkf_assisted_reader.UNPROVIDED).first());
        SubLObject result = (SubLObject)rkf_assisted_reader.NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(mt, thread);
            if (rkf_assisted_reader.NIL != string_utilities.ends_with(last_token, (SubLObject)rkf_assisted_reader.$str109$_, (SubLObject)rkf_assisted_reader.UNPROVIDED)) {
                result = (SubLObject)rkf_assisted_reader.$kw110$QUESTION;
            }
            else if (rkf_assisted_reader.NIL != string_utilities.ends_with(last_token, (SubLObject)rkf_assisted_reader.$str111$_, (SubLObject)rkf_assisted_reader.UNPROVIDED)) {
                result = (SubLObject)rkf_assisted_reader.$kw112$DECLARATIVE;
            }
            else if (rkf_assisted_reader.NIL != default_sentenceP && rkf_assisted_reader.NIL != lexicon_accessors.string_is_form_of_aux_verbP(first_token, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED)) {
                result = (SubLObject)rkf_assisted_reader.$kw110$QUESTION;
            }
            else if (rkf_assisted_reader.NIL != default_sentenceP) {
                result = (SubLObject)rkf_assisted_reader.$kw112$DECLARATIVE;
            }
            else {
                result = (SubLObject)rkf_assisted_reader.$kw113$NONE;
            }
        }
        finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 8931L)
    public static SubLObject ar_phrase_has_non_surrogate_conceptsP(final SubLObject phrase) {
        assert rkf_assisted_reader.NIL != ar_phrase_p(phrase) : phrase;
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_assisted_reader.NIL != ar_phrase_concepts(phrase) || rkf_assisted_reader.NIL != ar_phrase_rejected_concepts(phrase) || rkf_assisted_reader.NIL != ar_phrase_disambiguated_concept(phrase));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 9266L)
    public static SubLObject ar_phrase_token_count(final SubLObject phrase) {
        return Sequences.length(ar_phrase_token_list(phrase));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 9397L)
    public static SubLObject ar_concept_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_ar_concept(v_object, stream, (SubLObject)rkf_assisted_reader.ZERO_INTEGER);
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 9397L)
    public static SubLObject ar_concept_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $ar_concept_native.class) ? rkf_assisted_reader.T : rkf_assisted_reader.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 9397L)
    public static SubLObject ar_concept_id(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_concept_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 9397L)
    public static SubLObject ar_concept_cycl(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_concept_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 9397L)
    public static SubLObject ar_concept_disambiguation_text(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_concept_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 9397L)
    public static SubLObject ar_concept_phrases(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_concept_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 9397L)
    public static SubLObject ar_concept_parts(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_concept_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 9397L)
    public static SubLObject ar_concept_agglomerations(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_concept_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 9397L)
    public static SubLObject ar_concept_force(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_concept_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 9397L)
    public static SubLObject ar_concept_confidence(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_concept_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 9397L)
    public static SubLObject ar_concept_open_term_score(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_concept_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 9397L)
    public static SubLObject _csetf_ar_concept_id(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_concept_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 9397L)
    public static SubLObject _csetf_ar_concept_cycl(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_concept_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 9397L)
    public static SubLObject _csetf_ar_concept_disambiguation_text(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_concept_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 9397L)
    public static SubLObject _csetf_ar_concept_phrases(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_concept_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 9397L)
    public static SubLObject _csetf_ar_concept_parts(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_concept_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 9397L)
    public static SubLObject _csetf_ar_concept_agglomerations(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_concept_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 9397L)
    public static SubLObject _csetf_ar_concept_force(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_concept_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 9397L)
    public static SubLObject _csetf_ar_concept_confidence(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_concept_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 9397L)
    public static SubLObject _csetf_ar_concept_open_term_score(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_concept_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 9397L)
    public static SubLObject make_ar_concept(SubLObject arglist) {
        if (arglist == rkf_assisted_reader.UNPROVIDED) {
            arglist = (SubLObject)rkf_assisted_reader.NIL;
        }
        final SubLObject v_new = (SubLObject)new $ar_concept_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)rkf_assisted_reader.NIL, next = arglist; rkf_assisted_reader.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw24$ID)) {
                _csetf_ar_concept_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw140$CYCL)) {
                _csetf_ar_concept_cycl(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw141$DISAMBIGUATION_TEXT)) {
                _csetf_ar_concept_disambiguation_text(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw29$PHRASES)) {
                _csetf_ar_concept_phrases(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw142$PARTS)) {
                _csetf_ar_concept_parts(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw143$AGGLOMERATIONS)) {
                _csetf_ar_concept_agglomerations(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw100$FORCE)) {
                _csetf_ar_concept_force(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw144$CONFIDENCE)) {
                _csetf_ar_concept_confidence(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw145$OPEN_TERM_SCORE)) {
                _csetf_ar_concept_open_term_score(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)rkf_assisted_reader.$str30$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 9397L)
    public static SubLObject visit_defstruct_ar_concept(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw31$BEGIN, (SubLObject)rkf_assisted_reader.$sym146$MAKE_AR_CONCEPT, (SubLObject)rkf_assisted_reader.NINE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw24$ID, ar_concept_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw140$CYCL, ar_concept_cycl(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw141$DISAMBIGUATION_TEXT, ar_concept_disambiguation_text(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw29$PHRASES, ar_concept_phrases(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw142$PARTS, ar_concept_parts(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw143$AGGLOMERATIONS, ar_concept_agglomerations(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw100$FORCE, ar_concept_force(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw144$CONFIDENCE, ar_concept_confidence(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw145$OPEN_TERM_SCORE, ar_concept_open_term_score(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw34$END, (SubLObject)rkf_assisted_reader.$sym146$MAKE_AR_CONCEPT, (SubLObject)rkf_assisted_reader.NINE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 9397L)
    public static SubLObject visit_defstruct_object_ar_concept_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_ar_concept(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 10126L)
    public static SubLObject print_ar_concept(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)rkf_assisted_reader.$str148$__AR_CONCEPT__S__S_, ar_concept_id(v_object), ar_concept_cycl(v_object));
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 10305L)
    public static SubLObject sxhash_ar_concept_method(final SubLObject v_object) {
        return Sxhash.sxhash(ar_concept_id(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 10391L)
    public static SubLObject new_ar_concept(final SubLObject state, final SubLObject cycl) {
        final SubLObject concept = make_ar_concept((SubLObject)rkf_assisted_reader.UNPROVIDED);
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            final SubLObject id = next_ar_state_id(state);
            _csetf_ar_concept_id(concept, id);
            _csetf_ar_concept_cycl(concept, cycl);
            _csetf_ar_concept_parts(concept, (SubLObject)rkf_assisted_reader.NIL);
            _csetf_ar_concept_phrases(concept, (SubLObject)rkf_assisted_reader.NIL);
            _csetf_ar_concept_disambiguation_text(concept, (SubLObject)rkf_assisted_reader.NIL);
            _csetf_ar_concept_force(concept, (SubLObject)rkf_assisted_reader.NIL);
            _csetf_ar_concept_confidence(concept, (SubLObject)rkf_assisted_reader.ZERO_INTEGER);
            _csetf_ar_concept_open_term_score(concept, (SubLObject)rkf_assisted_reader.ZERO_INTEGER);
            add_ar_object_index(state, id, concept);
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return concept;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 10950L)
    public static SubLObject clone_ar_concept(final SubLObject state, final SubLObject src_concept, final SubLObject new_cycl) {
        final SubLObject concept = make_ar_concept((SubLObject)rkf_assisted_reader.UNPROVIDED);
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            final SubLObject id = next_ar_state_id(state);
            _csetf_ar_concept_id(concept, id);
            _csetf_ar_concept_cycl(concept, new_cycl);
            _csetf_ar_concept_parts(concept, conses_high.copy_list(ar_concept_parts(src_concept)));
            _csetf_ar_concept_phrases(concept, conses_high.copy_list(ar_concept_phrases(src_concept)));
            _csetf_ar_concept_disambiguation_text(concept, ar_concept_disambiguation_text(src_concept));
            _csetf_ar_concept_force(concept, ar_concept_force(src_concept));
            _csetf_ar_concept_confidence(concept, ar_concept_confidence(src_concept));
            _csetf_ar_concept_open_term_score(concept, ar_concept_open_term_score(src_concept));
            add_ar_object_index(state, id, concept);
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return concept;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 11826L)
    public static SubLObject rkf_ar_act_clone_augment_concept(final SubLObject state, final SubLObject src_concept, final SubLObject interpretation) {
        final SubLObject concept = clone_ar_concept(state, src_concept, interpretation);
        SubLObject things_to_toss = (SubLObject)rkf_assisted_reader.NIL;
        SubLObject cdolist_list_var = ar_concept_parts(concept);
        SubLObject part = (SubLObject)rkf_assisted_reader.NIL;
        part = cdolist_list_var.first();
        while (rkf_assisted_reader.NIL != cdolist_list_var) {
            final SubLObject subpart = ar_concept_cycl(part);
            if (rkf_assisted_reader.NIL == cycl_utilities.expression_find(subpart, interpretation, (SubLObject)rkf_assisted_reader.T, (SubLObject)rkf_assisted_reader.EQUALP, (SubLObject)rkf_assisted_reader.UNPROVIDED)) {
                things_to_toss = (SubLObject)ConsesLow.cons(part, things_to_toss);
            }
            cdolist_list_var = cdolist_list_var.rest();
            part = cdolist_list_var.first();
        }
        cdolist_list_var = things_to_toss;
        SubLObject weakest_link = (SubLObject)rkf_assisted_reader.NIL;
        weakest_link = cdolist_list_var.first();
        while (rkf_assisted_reader.NIL != cdolist_list_var) {
            rem_ar_concept_part(concept, weakest_link);
            cdolist_list_var = cdolist_list_var.rest();
            weakest_link = cdolist_list_var.first();
        }
        return concept;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 12448L)
    public static SubLObject add_ar_concept_phrase(final SubLObject concept, final SubLObject phrase) {
        assert rkf_assisted_reader.NIL != ar_concept_p(concept) : concept;
        assert rkf_assisted_reader.NIL != ar_phrase_p(phrase) : phrase;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            if (rkf_assisted_reader.NIL == conses_high.member(phrase, ar_concept_phrases(concept), Symbols.symbol_function((SubLObject)rkf_assisted_reader.EQL), Symbols.symbol_function((SubLObject)rkf_assisted_reader.IDENTITY))) {
                _csetf_ar_concept_phrases(concept, (SubLObject)ConsesLow.cons(phrase, ar_concept_phrases(concept)));
            }
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return concept;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 12661L)
    public static SubLObject add_ar_concept_part(final SubLObject concept, final SubLObject part_concept) {
        assert rkf_assisted_reader.NIL != ar_concept_p(concept) : concept;
        assert rkf_assisted_reader.NIL != ar_concept_p(part_concept) : part_concept;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            if (rkf_assisted_reader.NIL == conses_high.member(part_concept, ar_concept_parts(concept), Symbols.symbol_function((SubLObject)rkf_assisted_reader.EQL), Symbols.symbol_function((SubLObject)rkf_assisted_reader.IDENTITY))) {
                _csetf_ar_concept_parts(concept, (SubLObject)ConsesLow.cons(part_concept, ar_concept_parts(concept)));
            }
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return concept;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 12886L)
    public static SubLObject rem_ar_concept_part(final SubLObject concept, final SubLObject part_concept) {
        assert rkf_assisted_reader.NIL != ar_concept_p(concept) : concept;
        assert rkf_assisted_reader.NIL != ar_concept_p(part_concept) : part_concept;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            _csetf_ar_concept_parts(concept, Sequences.delete(part_concept, ar_concept_parts(concept), (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED));
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return concept;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 13148L)
    public static SubLObject add_ar_concept_agglomeration(final SubLObject concept, final SubLObject agglomeration) {
        assert rkf_assisted_reader.NIL != ar_concept_p(concept) : concept;
        assert rkf_assisted_reader.NIL != ar_concept_p(agglomeration) : agglomeration;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            if (rkf_assisted_reader.NIL == conses_high.member(agglomeration, ar_concept_agglomerations(concept), Symbols.symbol_function((SubLObject)rkf_assisted_reader.EQL), Symbols.symbol_function((SubLObject)rkf_assisted_reader.IDENTITY))) {
                _csetf_ar_concept_agglomerations(concept, (SubLObject)ConsesLow.cons(agglomeration, ar_concept_agglomerations(concept)));
            }
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return concept;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 13395L)
    public static SubLObject rem_ar_concept_agglomeration(final SubLObject concept, final SubLObject agglomeration) {
        assert rkf_assisted_reader.NIL != ar_concept_p(concept) : concept;
        assert rkf_assisted_reader.NIL != ar_concept_p(agglomeration) : agglomeration;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            _csetf_ar_concept_agglomerations(concept, Sequences.delete(agglomeration, ar_concept_agglomerations(concept), (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED));
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return concept;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 13687L)
    public static SubLObject note_ar_concept_disambiguation_text(final SubLObject concept, final SubLObject text) {
        assert rkf_assisted_reader.NIL != ar_concept_p(concept) : concept;
        assert rkf_assisted_reader.NIL != Types.stringp(text) : text;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            _csetf_ar_concept_disambiguation_text(concept, text);
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return concept;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 13911L)
    public static SubLObject replace_ar_concept_cycl(final SubLObject concept, final SubLObject new_cycl) {
        assert rkf_assisted_reader.NIL != ar_concept_p(concept) : concept;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            _csetf_ar_concept_cycl(concept, new_cycl);
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return concept;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 14088L)
    public static SubLObject subst_ar_concept_cycl(final SubLObject concept, final SubLObject v_new, final SubLObject old) {
        assert rkf_assisted_reader.NIL != ar_concept_p(concept) : concept;
        final SubLObject original_cycl = ar_concept_cycl(concept);
        final SubLObject new_cycl = conses_high.subst(v_new, old, original_cycl, Symbols.symbol_function((SubLObject)rkf_assisted_reader.EQUAL), (SubLObject)rkf_assisted_reader.UNPROVIDED);
        replace_ar_concept_cycl(concept, new_cycl);
        return concept;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 14402L)
    public static SubLObject note_ar_concept_force(final SubLObject concept, final SubLObject force) {
        assert rkf_assisted_reader.NIL != ar_concept_p(concept) : concept;
        if (force.isKeyword()) {
            SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
            try {
                release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
                _csetf_ar_concept_force(concept, force);
            }
            finally {
                if (rkf_assisted_reader.NIL != release) {
                    Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
                }
            }
        }
        return concept;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 14603L)
    public static SubLObject ar_concept_queryP(final SubLObject concept) {
        return (SubLObject)((ar_concept_force(concept) == rkf_assisted_reader.$kw110$QUESTION) ? rkf_assisted_reader.$kw110$QUESTION : rkf_assisted_reader.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 14719L)
    public static SubLObject ar_concept_assertionP(final SubLObject concept) {
        return (SubLObject)((ar_concept_force(concept) == rkf_assisted_reader.$kw112$DECLARATIVE) ? rkf_assisted_reader.$kw112$DECLARATIVE : rkf_assisted_reader.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 14845L)
    public static SubLObject note_ar_concept_confidence(final SubLObject concept, final SubLObject confidence) {
        assert rkf_assisted_reader.NIL != ar_concept_p(concept) : concept;
        if (confidence.isNumber() && rkf_assisted_reader.ZERO_INTEGER.numGE(confidence)) {
            SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
            try {
                release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
                _csetf_ar_concept_confidence(concept, confidence);
            }
            finally {
                if (rkf_assisted_reader.NIL != release) {
                    Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
                }
            }
        }
        return concept;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 15192L)
    public static SubLObject note_ar_concept_open_term_score(final SubLObject concept, final SubLObject open_term_score) {
        assert rkf_assisted_reader.NIL != ar_concept_p(concept) : concept;
        if (open_term_score.isNumber() && rkf_assisted_reader.ZERO_INTEGER.numLE(open_term_score)) {
            SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
            try {
                release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
                _csetf_ar_concept_open_term_score(concept, open_term_score);
            }
            finally {
                if (rkf_assisted_reader.NIL != release) {
                    Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
                }
            }
        }
        return concept;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 15595L)
    public static SubLObject ar_template_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)rkf_assisted_reader.ZERO_INTEGER);
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 15595L)
    public static SubLObject ar_template_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $ar_template_native.class) ? rkf_assisted_reader.T : rkf_assisted_reader.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 15595L)
    public static SubLObject ar_template_id(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_template_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 15595L)
    public static SubLObject ar_template_concept(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_template_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 15595L)
    public static SubLObject ar_template_formula(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_template_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 15595L)
    public static SubLObject ar_template_prompt(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_template_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 15595L)
    public static SubLObject ar_template_choice_table(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_template_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 15595L)
    public static SubLObject ar_template_agglomerations(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_template_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 15595L)
    public static SubLObject _csetf_ar_template_id(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_template_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 15595L)
    public static SubLObject _csetf_ar_template_concept(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_template_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 15595L)
    public static SubLObject _csetf_ar_template_formula(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_template_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 15595L)
    public static SubLObject _csetf_ar_template_prompt(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_template_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 15595L)
    public static SubLObject _csetf_ar_template_choice_table(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_template_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 15595L)
    public static SubLObject _csetf_ar_template_agglomerations(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_template_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 15595L)
    public static SubLObject make_ar_template(SubLObject arglist) {
        if (arglist == rkf_assisted_reader.UNPROVIDED) {
            arglist = (SubLObject)rkf_assisted_reader.NIL;
        }
        final SubLObject v_new = (SubLObject)new $ar_template_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)rkf_assisted_reader.NIL, next = arglist; rkf_assisted_reader.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw24$ID)) {
                _csetf_ar_template_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw171$CONCEPT)) {
                _csetf_ar_template_concept(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw172$FORMULA)) {
                _csetf_ar_template_formula(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw173$PROMPT)) {
                _csetf_ar_template_prompt(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw174$CHOICE_TABLE)) {
                _csetf_ar_template_choice_table(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw143$AGGLOMERATIONS)) {
                _csetf_ar_template_agglomerations(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)rkf_assisted_reader.$str30$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 15595L)
    public static SubLObject visit_defstruct_ar_template(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw31$BEGIN, (SubLObject)rkf_assisted_reader.$sym175$MAKE_AR_TEMPLATE, (SubLObject)rkf_assisted_reader.SIX_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw24$ID, ar_template_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw171$CONCEPT, ar_template_concept(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw172$FORMULA, ar_template_formula(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw173$PROMPT, ar_template_prompt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw174$CHOICE_TABLE, ar_template_choice_table(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw143$AGGLOMERATIONS, ar_template_agglomerations(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw34$END, (SubLObject)rkf_assisted_reader.$sym175$MAKE_AR_TEMPLATE, (SubLObject)rkf_assisted_reader.SIX_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 15595L)
    public static SubLObject visit_defstruct_object_ar_template_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_ar_template(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 15920L)
    public static SubLObject sxhash_ar_template_method(final SubLObject v_object) {
        return Sxhash.sxhash(ar_template_id(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 16008L)
    public static SubLObject new_ar_template(final SubLObject state, final SubLObject concept) {
        final SubLObject template = make_ar_template((SubLObject)rkf_assisted_reader.UNPROVIDED);
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            final SubLObject id = next_ar_state_id(state);
            _csetf_ar_template_id(template, id);
            _csetf_ar_template_concept(template, concept);
            add_ar_object_index(state, id, template);
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 16313L)
    public static SubLObject note_ar_template_formula(final SubLObject template, final SubLObject formula) {
        assert rkf_assisted_reader.NIL != ar_template_p(template) : template;
        assert rkf_assisted_reader.NIL != Types.consp(formula) : formula;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            _csetf_ar_template_formula(template, formula);
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 16526L)
    public static SubLObject note_ar_template_prompt(final SubLObject template, final SubLObject prompt) {
        assert rkf_assisted_reader.NIL != ar_template_p(template) : template;
        assert rkf_assisted_reader.NIL != Types.consp(prompt) : prompt;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            _csetf_ar_template_prompt(template, prompt);
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 16734L)
    public static SubLObject note_ar_template_choice_table(final SubLObject template, final SubLObject choice_table) {
        assert rkf_assisted_reader.NIL != ar_template_p(template) : template;
        assert rkf_assisted_reader.NIL != Types.consp(choice_table) : choice_table;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            _csetf_ar_template_choice_table(template, choice_table);
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 16972L)
    public static SubLObject add_ar_template_agglomeration(final SubLObject template, final SubLObject agglomeration) {
        assert rkf_assisted_reader.NIL != ar_template_p(template) : template;
        assert rkf_assisted_reader.NIL != ar_concept_p(agglomeration) : agglomeration;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            if (rkf_assisted_reader.NIL == conses_high.member(agglomeration, ar_template_agglomerations(template), Symbols.symbol_function((SubLObject)rkf_assisted_reader.EQL), Symbols.symbol_function((SubLObject)rkf_assisted_reader.IDENTITY))) {
                _csetf_ar_template_agglomerations(template, (SubLObject)ConsesLow.cons(agglomeration, ar_template_agglomerations(template)));
            }
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 17225L)
    public static SubLObject ar_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)rkf_assisted_reader.ZERO_INTEGER);
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 17225L)
    public static SubLObject ar_state_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $ar_state_native.class) ? rkf_assisted_reader.T : rkf_assisted_reader.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 17225L)
    public static SubLObject ar_state_isg(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_state_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 17225L)
    public static SubLObject ar_state_index(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_state_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 17225L)
    public static SubLObject ar_state_source_sentences(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_state_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 17225L)
    public static SubLObject ar_state_focus_sentence(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_state_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 17225L)
    public static SubLObject ar_state_completed_sentences(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_state_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 17225L)
    public static SubLObject ar_state_unknown_phrases(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_state_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 17225L)
    public static SubLObject ar_state_rejected_phrases(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_state_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 17225L)
    public static SubLObject ar_state_irrelevant_phrases(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_state_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 17225L)
    public static SubLObject ar_state_ambiguous_phrases(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_state_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 17225L)
    public static SubLObject ar_state_assumed_phrases(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_state_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 17225L)
    public static SubLObject ar_state_pending_phrases(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_state_p(v_object) : v_object;
        return v_object.getField12();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 17225L)
    public static SubLObject ar_state_accepted_phrases(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_state_p(v_object) : v_object;
        return v_object.getField13();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 17225L)
    public static SubLObject ar_state_pending_concepts(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_state_p(v_object) : v_object;
        return v_object.getField14();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 17225L)
    public static SubLObject ar_state_accepted_concepts(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_state_p(v_object) : v_object;
        return v_object.getField15();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 17225L)
    public static SubLObject ar_state_candidate_cycls(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_state_p(v_object) : v_object;
        return v_object.getField16();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 17225L)
    public static SubLObject ar_state_asserted_assertions(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_state_p(v_object) : v_object;
        return v_object.getField17();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 17225L)
    public static SubLObject ar_state_term_templates(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_state_p(v_object) : v_object;
        return v_object.getField18();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 17225L)
    public static SubLObject ar_state_assert_templates(final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_state_p(v_object) : v_object;
        return v_object.getField19();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 17225L)
    public static SubLObject _csetf_ar_state_isg(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_state_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 17225L)
    public static SubLObject _csetf_ar_state_index(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_state_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 17225L)
    public static SubLObject _csetf_ar_state_source_sentences(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_state_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 17225L)
    public static SubLObject _csetf_ar_state_focus_sentence(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_state_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 17225L)
    public static SubLObject _csetf_ar_state_completed_sentences(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_state_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 17225L)
    public static SubLObject _csetf_ar_state_unknown_phrases(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_state_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 17225L)
    public static SubLObject _csetf_ar_state_rejected_phrases(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_state_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 17225L)
    public static SubLObject _csetf_ar_state_irrelevant_phrases(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_state_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 17225L)
    public static SubLObject _csetf_ar_state_ambiguous_phrases(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_state_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 17225L)
    public static SubLObject _csetf_ar_state_assumed_phrases(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_state_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 17225L)
    public static SubLObject _csetf_ar_state_pending_phrases(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_state_p(v_object) : v_object;
        return v_object.setField12(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 17225L)
    public static SubLObject _csetf_ar_state_accepted_phrases(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_state_p(v_object) : v_object;
        return v_object.setField13(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 17225L)
    public static SubLObject _csetf_ar_state_pending_concepts(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_state_p(v_object) : v_object;
        return v_object.setField14(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 17225L)
    public static SubLObject _csetf_ar_state_accepted_concepts(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_state_p(v_object) : v_object;
        return v_object.setField15(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 17225L)
    public static SubLObject _csetf_ar_state_candidate_cycls(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_state_p(v_object) : v_object;
        return v_object.setField16(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 17225L)
    public static SubLObject _csetf_ar_state_asserted_assertions(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_state_p(v_object) : v_object;
        return v_object.setField17(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 17225L)
    public static SubLObject _csetf_ar_state_term_templates(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_state_p(v_object) : v_object;
        return v_object.setField18(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 17225L)
    public static SubLObject _csetf_ar_state_assert_templates(final SubLObject v_object, final SubLObject value) {
        assert rkf_assisted_reader.NIL != ar_state_p(v_object) : v_object;
        return v_object.setField19(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 17225L)
    public static SubLObject make_ar_state(SubLObject arglist) {
        if (arglist == rkf_assisted_reader.UNPROVIDED) {
            arglist = (SubLObject)rkf_assisted_reader.NIL;
        }
        final SubLObject v_new = (SubLObject)new $ar_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)rkf_assisted_reader.NIL, next = arglist; rkf_assisted_reader.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw223$ISG)) {
                _csetf_ar_state_isg(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw224$INDEX)) {
                _csetf_ar_state_index(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw225$SOURCE_SENTENCES)) {
                _csetf_ar_state_source_sentences(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw226$FOCUS_SENTENCE)) {
                _csetf_ar_state_focus_sentence(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw227$COMPLETED_SENTENCES)) {
                _csetf_ar_state_completed_sentences(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw228$UNKNOWN_PHRASES)) {
                _csetf_ar_state_unknown_phrases(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw229$REJECTED_PHRASES)) {
                _csetf_ar_state_rejected_phrases(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw230$IRRELEVANT_PHRASES)) {
                _csetf_ar_state_irrelevant_phrases(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw231$AMBIGUOUS_PHRASES)) {
                _csetf_ar_state_ambiguous_phrases(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw232$ASSUMED_PHRASES)) {
                _csetf_ar_state_assumed_phrases(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw233$PENDING_PHRASES)) {
                _csetf_ar_state_pending_phrases(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw234$ACCEPTED_PHRASES)) {
                _csetf_ar_state_accepted_phrases(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw235$PENDING_CONCEPTS)) {
                _csetf_ar_state_pending_concepts(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw236$ACCEPTED_CONCEPTS)) {
                _csetf_ar_state_accepted_concepts(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw237$CANDIDATE_CYCLS)) {
                _csetf_ar_state_candidate_cycls(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw238$ASSERTED_ASSERTIONS)) {
                _csetf_ar_state_asserted_assertions(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw239$TERM_TEMPLATES)) {
                _csetf_ar_state_term_templates(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw240$ASSERT_TEMPLATES)) {
                _csetf_ar_state_assert_templates(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)rkf_assisted_reader.$str30$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 17225L)
    public static SubLObject visit_defstruct_ar_state(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw31$BEGIN, (SubLObject)rkf_assisted_reader.$sym241$MAKE_AR_STATE, (SubLObject)rkf_assisted_reader.EIGHTEEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw223$ISG, ar_state_isg(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw224$INDEX, ar_state_index(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw225$SOURCE_SENTENCES, ar_state_source_sentences(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw226$FOCUS_SENTENCE, ar_state_focus_sentence(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw227$COMPLETED_SENTENCES, ar_state_completed_sentences(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw228$UNKNOWN_PHRASES, ar_state_unknown_phrases(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw229$REJECTED_PHRASES, ar_state_rejected_phrases(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw230$IRRELEVANT_PHRASES, ar_state_irrelevant_phrases(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw231$AMBIGUOUS_PHRASES, ar_state_ambiguous_phrases(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw232$ASSUMED_PHRASES, ar_state_assumed_phrases(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw233$PENDING_PHRASES, ar_state_pending_phrases(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw234$ACCEPTED_PHRASES, ar_state_accepted_phrases(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw235$PENDING_CONCEPTS, ar_state_pending_concepts(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw236$ACCEPTED_CONCEPTS, ar_state_accepted_concepts(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw237$CANDIDATE_CYCLS, ar_state_candidate_cycls(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw238$ASSERTED_ASSERTIONS, ar_state_asserted_assertions(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw239$TERM_TEMPLATES, ar_state_term_templates(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw33$SLOT, (SubLObject)rkf_assisted_reader.$kw240$ASSERT_TEMPLATES, ar_state_assert_templates(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_assisted_reader.$kw34$END, (SubLObject)rkf_assisted_reader.$sym241$MAKE_AR_STATE, (SubLObject)rkf_assisted_reader.EIGHTEEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 17225L)
    public static SubLObject visit_defstruct_object_ar_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_ar_state(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 18795L)
    public static SubLObject new_ar_state() {
        final SubLObject state = make_ar_state((SubLObject)rkf_assisted_reader.UNPROVIDED);
        final SubLObject isg = integer_sequence_generator.new_integer_sequence_generator((SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED);
        final SubLObject index = dictionary.new_dictionary((SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED);
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            _csetf_ar_state_isg(state, isg);
            _csetf_ar_state_index(state, index);
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 19050L)
    public static SubLObject ar_reset(SubLObject state) {
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            state = new_ar_state();
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        if (rkf_assisted_reader.NIL == rtp_initialize.rtp_initializedP()) {
            rtp_initialize.reset_rtp_completely();
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 19353L)
    public static SubLObject next_ar_state_id(final SubLObject state) {
        assert rkf_assisted_reader.NIL != ar_state_p(state) : state;
        return integer_sequence_generator.integer_sequence_generator_next(ar_state_isg(state));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 19491L)
    public static SubLObject add_ar_object_index(final SubLObject state, final SubLObject id, final SubLObject v_object) {
        assert rkf_assisted_reader.NIL != ar_state_p(state) : state;
        return dictionary.dictionary_enter(ar_state_index(state), id, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 19678L)
    public static SubLObject find_ar_object(final SubLObject state, final SubLObject id) {
        assert rkf_assisted_reader.NIL != ar_state_p(state) : state;
        return dictionary.dictionary_lookup(ar_state_index(state), id, (SubLObject)rkf_assisted_reader.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 19810L)
    public static SubLObject find_ar_sentence(final SubLObject state, final SubLObject id) {
        return find_ar_object(state, id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 19889L)
    public static SubLObject find_ar_token(final SubLObject state, final SubLObject id) {
        return find_ar_object(state, id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 19965L)
    public static SubLObject find_ar_phrase(final SubLObject state, final SubLObject id) {
        return find_ar_object(state, id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 20042L)
    public static SubLObject find_ar_concept(final SubLObject state, final SubLObject id) {
        return find_ar_object(state, id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 20120L)
    public static SubLObject find_ar_template(final SubLObject state, final SubLObject id) {
        return find_ar_object(state, id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 20199L)
    public static SubLObject add_ar_state_source_sentence(final SubLObject state, final SubLObject sentence) {
        assert rkf_assisted_reader.NIL != ar_state_p(state) : state;
        assert rkf_assisted_reader.NIL != ar_sentence_p(sentence) : sentence;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            if (rkf_assisted_reader.NIL == conses_high.member(sentence, ar_state_source_sentences(state), Symbols.symbol_function((SubLObject)rkf_assisted_reader.EQL), Symbols.symbol_function((SubLObject)rkf_assisted_reader.IDENTITY))) {
                _csetf_ar_state_source_sentences(state, (SubLObject)ConsesLow.cons(sentence, ar_state_source_sentences(state)));
            }
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 20555L)
    public static SubLObject clear_ar_state_focus_sentence(final SubLObject state) {
        assert rkf_assisted_reader.NIL != ar_state_p(state) : state;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            _csetf_ar_state_focus_sentence(state, (SubLObject)rkf_assisted_reader.NIL);
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 20740L)
    public static SubLObject note_ar_state_focus_sentence(final SubLObject state, final SubLObject sentence) {
        assert rkf_assisted_reader.NIL != ar_state_p(state) : state;
        assert rkf_assisted_reader.NIL != ar_sentence_p(sentence) : sentence;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            _csetf_ar_state_focus_sentence(state, sentence);
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 20957L)
    public static SubLObject ar_state_force(final SubLObject state) {
        SubLObject force = (SubLObject)rkf_assisted_reader.NIL;
        final SubLObject phrases = ar_sentence_phrases(ar_state_focus_sentence(state));
        final SubLObject sorted_phrases = Sort.sort(conses_high.copy_list(phrases), (SubLObject)rkf_assisted_reader.$sym243$AR_PHRASE_SPAN_LENGTH_, (SubLObject)rkf_assisted_reader.UNPROVIDED);
        if (rkf_assisted_reader.NIL == force) {
            SubLObject csome_list_var = sorted_phrases;
            SubLObject phrase = (SubLObject)rkf_assisted_reader.NIL;
            phrase = csome_list_var.first();
            while (rkf_assisted_reader.NIL == force && rkf_assisted_reader.NIL != csome_list_var) {
                final SubLObject phrase_force = ar_phrase_force(phrase);
                if (rkf_assisted_reader.NIL != phrase_force && phrase_force != rkf_assisted_reader.$kw113$NONE) {
                    force = phrase_force;
                }
                csome_list_var = csome_list_var.rest();
                phrase = csome_list_var.first();
            }
        }
        return force;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 21501L)
    public static SubLObject ar_phrase_span_lengthG(final SubLObject phrase1, final SubLObject phrase2) {
        return Numbers.numG(Sequences.length(ar_phrase_token_list(phrase1)), Sequences.length(ar_phrase_token_list(phrase2)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 21731L)
    public static SubLObject add_ar_state_completed_sentence(final SubLObject state, final SubLObject sentence) {
        assert rkf_assisted_reader.NIL != ar_state_p(state) : state;
        assert rkf_assisted_reader.NIL != ar_sentence_p(sentence) : sentence;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            if (rkf_assisted_reader.NIL == conses_high.member(sentence, ar_state_completed_sentences(state), Symbols.symbol_function((SubLObject)rkf_assisted_reader.EQL), Symbols.symbol_function((SubLObject)rkf_assisted_reader.IDENTITY))) {
                _csetf_ar_state_completed_sentences(state, (SubLObject)ConsesLow.cons(sentence, ar_state_completed_sentences(state)));
            }
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 21985L)
    public static SubLObject add_ar_state_unknown_phrase(final SubLObject state, final SubLObject phrase) {
        assert rkf_assisted_reader.NIL != ar_state_p(state) : state;
        assert rkf_assisted_reader.NIL != ar_phrase_p(phrase) : phrase;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            if (rkf_assisted_reader.NIL == conses_high.member(phrase, ar_state_unknown_phrases(state), Symbols.symbol_function((SubLObject)rkf_assisted_reader.EQL), Symbols.symbol_function((SubLObject)rkf_assisted_reader.IDENTITY))) {
                _csetf_ar_state_unknown_phrases(state, (SubLObject)ConsesLow.cons(phrase, ar_state_unknown_phrases(state)));
            }
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 22217L)
    public static SubLObject rem_ar_state_unknown_phrase(final SubLObject state, final SubLObject phrase) {
        assert rkf_assisted_reader.NIL != ar_state_p(state) : state;
        assert rkf_assisted_reader.NIL != ar_phrase_p(phrase) : phrase;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            _csetf_ar_state_unknown_phrases(state, Sequences.delete(phrase, ar_state_unknown_phrases(state), (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED));
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 22472L)
    public static SubLObject add_ar_state_rejected_phrase(final SubLObject state, final SubLObject phrase) {
        assert rkf_assisted_reader.NIL != ar_state_p(state) : state;
        assert rkf_assisted_reader.NIL != ar_phrase_p(phrase) : phrase;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            if (rkf_assisted_reader.NIL == conses_high.member(phrase, ar_state_rejected_phrases(state), Symbols.symbol_function((SubLObject)rkf_assisted_reader.EQL), Symbols.symbol_function((SubLObject)rkf_assisted_reader.IDENTITY))) {
                _csetf_ar_state_rejected_phrases(state, (SubLObject)ConsesLow.cons(phrase, ar_state_rejected_phrases(state)));
            }
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 22707L)
    public static SubLObject rem_ar_state_rejected_phrase(final SubLObject state, final SubLObject phrase) {
        assert rkf_assisted_reader.NIL != ar_state_p(state) : state;
        assert rkf_assisted_reader.NIL != ar_phrase_p(phrase) : phrase;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            _csetf_ar_state_rejected_phrases(state, Sequences.delete(phrase, ar_state_rejected_phrases(state), (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED));
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 22965L)
    public static SubLObject add_ar_state_irrelevant_phrase(final SubLObject state, final SubLObject phrase) {
        assert rkf_assisted_reader.NIL != ar_state_p(state) : state;
        assert rkf_assisted_reader.NIL != ar_phrase_p(phrase) : phrase;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            if (rkf_assisted_reader.NIL == conses_high.member(phrase, ar_state_irrelevant_phrases(state), Symbols.symbol_function((SubLObject)rkf_assisted_reader.EQL), Symbols.symbol_function((SubLObject)rkf_assisted_reader.IDENTITY))) {
                _csetf_ar_state_irrelevant_phrases(state, (SubLObject)ConsesLow.cons(phrase, ar_state_irrelevant_phrases(state)));
            }
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 23206L)
    public static SubLObject rem_ar_state_irrelevant_phrase(final SubLObject state, final SubLObject phrase) {
        assert rkf_assisted_reader.NIL != ar_state_p(state) : state;
        assert rkf_assisted_reader.NIL != ar_phrase_p(phrase) : phrase;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            _csetf_ar_state_irrelevant_phrases(state, Sequences.delete(phrase, ar_state_irrelevant_phrases(state), (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED));
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 23470L)
    public static SubLObject add_ar_state_ambiguous_phrase(final SubLObject state, final SubLObject phrase) {
        assert rkf_assisted_reader.NIL != ar_state_p(state) : state;
        assert rkf_assisted_reader.NIL != ar_phrase_p(phrase) : phrase;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            if (rkf_assisted_reader.NIL == conses_high.member(phrase, ar_state_ambiguous_phrases(state), Symbols.symbol_function((SubLObject)rkf_assisted_reader.EQL), Symbols.symbol_function((SubLObject)rkf_assisted_reader.IDENTITY))) {
                _csetf_ar_state_ambiguous_phrases(state, (SubLObject)ConsesLow.cons(phrase, ar_state_ambiguous_phrases(state)));
            }
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 23708L)
    public static SubLObject rem_ar_state_ambiguous_phrase(final SubLObject state, final SubLObject phrase) {
        assert rkf_assisted_reader.NIL != ar_state_p(state) : state;
        assert rkf_assisted_reader.NIL != ar_phrase_p(phrase) : phrase;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            _csetf_ar_state_ambiguous_phrases(state, Sequences.delete(phrase, ar_state_ambiguous_phrases(state), (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED));
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 23969L)
    public static SubLObject add_ar_state_assumed_phrase(final SubLObject state, final SubLObject phrase) {
        assert rkf_assisted_reader.NIL != ar_state_p(state) : state;
        assert rkf_assisted_reader.NIL != ar_phrase_p(phrase) : phrase;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            if (rkf_assisted_reader.NIL == conses_high.member(phrase, ar_state_assumed_phrases(state), Symbols.symbol_function((SubLObject)rkf_assisted_reader.EQL), Symbols.symbol_function((SubLObject)rkf_assisted_reader.IDENTITY))) {
                _csetf_ar_state_assumed_phrases(state, (SubLObject)ConsesLow.cons(phrase, ar_state_assumed_phrases(state)));
            }
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 24201L)
    public static SubLObject rem_ar_state_assumed_phrase(final SubLObject state, final SubLObject phrase) {
        assert rkf_assisted_reader.NIL != ar_state_p(state) : state;
        assert rkf_assisted_reader.NIL != ar_phrase_p(phrase) : phrase;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            _csetf_ar_state_assumed_phrases(state, Sequences.delete(phrase, ar_state_assumed_phrases(state), (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED));
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 24456L)
    public static SubLObject add_ar_state_pending_phrase(final SubLObject state, final SubLObject phrase) {
        assert rkf_assisted_reader.NIL != ar_state_p(state) : state;
        assert rkf_assisted_reader.NIL != ar_phrase_p(phrase) : phrase;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            if (rkf_assisted_reader.NIL == conses_high.member(phrase, ar_state_pending_phrases(state), Symbols.symbol_function((SubLObject)rkf_assisted_reader.EQL), Symbols.symbol_function((SubLObject)rkf_assisted_reader.IDENTITY))) {
                _csetf_ar_state_pending_phrases(state, (SubLObject)ConsesLow.cons(phrase, ar_state_pending_phrases(state)));
            }
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 24688L)
    public static SubLObject rem_ar_state_pending_phrase(final SubLObject state, final SubLObject phrase) {
        assert rkf_assisted_reader.NIL != ar_state_p(state) : state;
        assert rkf_assisted_reader.NIL != ar_phrase_p(phrase) : phrase;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            _csetf_ar_state_pending_phrases(state, Sequences.delete(phrase, ar_state_pending_phrases(state), (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED));
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 24943L)
    public static SubLObject add_ar_state_accepted_phrase(final SubLObject state, final SubLObject phrase) {
        assert rkf_assisted_reader.NIL != ar_state_p(state) : state;
        assert rkf_assisted_reader.NIL != ar_phrase_p(phrase) : phrase;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            if (rkf_assisted_reader.NIL == conses_high.member(phrase, ar_state_accepted_phrases(state), Symbols.symbol_function((SubLObject)rkf_assisted_reader.EQL), Symbols.symbol_function((SubLObject)rkf_assisted_reader.IDENTITY))) {
                _csetf_ar_state_accepted_phrases(state, (SubLObject)ConsesLow.cons(phrase, ar_state_accepted_phrases(state)));
            }
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 25178L)
    public static SubLObject rem_ar_state_accepted_phrase(final SubLObject state, final SubLObject phrase) {
        assert rkf_assisted_reader.NIL != ar_state_p(state) : state;
        assert rkf_assisted_reader.NIL != ar_phrase_p(phrase) : phrase;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            _csetf_ar_state_accepted_phrases(state, Sequences.delete(phrase, ar_state_accepted_phrases(state), (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED));
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 25436L)
    public static SubLObject add_ar_state_accepted_concept(final SubLObject state, final SubLObject concept) {
        assert rkf_assisted_reader.NIL != ar_state_p(state) : state;
        assert rkf_assisted_reader.NIL != ar_concept_p(concept) : concept;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            if (rkf_assisted_reader.NIL == conses_high.member(concept, ar_state_accepted_concepts(state), Symbols.symbol_function((SubLObject)rkf_assisted_reader.EQL), Symbols.symbol_function((SubLObject)rkf_assisted_reader.IDENTITY))) {
                _csetf_ar_state_accepted_concepts(state, (SubLObject)ConsesLow.cons(concept, ar_state_accepted_concepts(state)));
            }
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 25678L)
    public static SubLObject rem_ar_state_accepted_concept(final SubLObject state, final SubLObject concept) {
        assert rkf_assisted_reader.NIL != ar_state_p(state) : state;
        assert rkf_assisted_reader.NIL != ar_concept_p(concept) : concept;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            _csetf_ar_state_accepted_concepts(state, Sequences.delete(concept, ar_state_accepted_concepts(state), (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED));
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 25943L)
    public static SubLObject add_ar_state_pending_concept(final SubLObject state, final SubLObject concept) {
        assert rkf_assisted_reader.NIL != ar_state_p(state) : state;
        assert rkf_assisted_reader.NIL != ar_concept_p(concept) : concept;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            if (rkf_assisted_reader.NIL == conses_high.member(concept, ar_state_pending_concepts(state), Symbols.symbol_function((SubLObject)rkf_assisted_reader.EQL), Symbols.symbol_function((SubLObject)rkf_assisted_reader.IDENTITY))) {
                _csetf_ar_state_pending_concepts(state, (SubLObject)ConsesLow.cons(concept, ar_state_pending_concepts(state)));
            }
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 26182L)
    public static SubLObject rem_ar_state_pending_concept(final SubLObject state, final SubLObject concept) {
        assert rkf_assisted_reader.NIL != ar_state_p(state) : state;
        assert rkf_assisted_reader.NIL != ar_concept_p(concept) : concept;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            _csetf_ar_state_pending_concepts(state, Sequences.delete(concept, ar_state_pending_concepts(state), (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED));
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 26444L)
    public static SubLObject ar_state_candidate_assertions(final SubLObject state) {
        final SubLObject result = list_utilities.remove_if_not((SubLObject)rkf_assisted_reader.$sym244$AR_CONCEPT_ASSERTION_, ar_state_candidate_cycls(state), (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 26634L)
    public static SubLObject ar_state_candidate_queries(final SubLObject state) {
        final SubLObject result = list_utilities.remove_if_not((SubLObject)rkf_assisted_reader.$sym245$AR_CONCEPT_QUERY_, ar_state_candidate_cycls(state), (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 26792L)
    public static SubLObject add_ar_state_candidate_cycl(final SubLObject state, final SubLObject concept) {
        assert rkf_assisted_reader.NIL != ar_state_p(state) : state;
        assert rkf_assisted_reader.NIL != ar_concept_p(concept) : concept;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            if (rkf_assisted_reader.NIL == conses_high.member(concept, ar_state_candidate_cycls(state), Symbols.symbol_function((SubLObject)rkf_assisted_reader.EQL), Symbols.symbol_function((SubLObject)rkf_assisted_reader.IDENTITY))) {
                _csetf_ar_state_candidate_cycls(state, (SubLObject)ConsesLow.cons(concept, ar_state_candidate_cycls(state)));
            }
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 27008L)
    public static SubLObject add_ar_state_candidate_assertion(final SubLObject state, final SubLObject concept) {
        assert rkf_assisted_reader.NIL != ar_state_p(state) : state;
        assert rkf_assisted_reader.NIL != ar_concept_p(concept) : concept;
        _csetf_ar_concept_force(concept, (SubLObject)rkf_assisted_reader.$kw112$DECLARATIVE);
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            if (rkf_assisted_reader.NIL == conses_high.member(concept, ar_state_candidate_cycls(state), Symbols.symbol_function((SubLObject)rkf_assisted_reader.EQL), Symbols.symbol_function((SubLObject)rkf_assisted_reader.IDENTITY))) {
                _csetf_ar_state_candidate_cycls(state, (SubLObject)ConsesLow.cons(concept, ar_state_candidate_cycls(state)));
            }
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 27279L)
    public static SubLObject add_ar_state_candidate_query(final SubLObject state, final SubLObject concept) {
        assert rkf_assisted_reader.NIL != ar_state_p(state) : state;
        assert rkf_assisted_reader.NIL != ar_concept_p(concept) : concept;
        _csetf_ar_concept_force(concept, (SubLObject)rkf_assisted_reader.$kw110$QUESTION);
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            if (rkf_assisted_reader.NIL == conses_high.member(concept, ar_state_candidate_cycls(state), Symbols.symbol_function((SubLObject)rkf_assisted_reader.EQL), Symbols.symbol_function((SubLObject)rkf_assisted_reader.IDENTITY))) {
                _csetf_ar_state_candidate_cycls(state, (SubLObject)ConsesLow.cons(concept, ar_state_candidate_cycls(state)));
            }
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 27543L)
    public static SubLObject rem_ar_state_candidate_assertion(final SubLObject state, final SubLObject concept) {
        assert rkf_assisted_reader.NIL != ar_state_p(state) : state;
        assert rkf_assisted_reader.NIL != ar_concept_p(concept) : concept;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            _csetf_ar_state_candidate_cycls(state, Sequences.delete(concept, ar_state_candidate_cycls(state), (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED));
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 27807L)
    public static SubLObject rem_ar_state_candidate_query(final SubLObject state, final SubLObject concept) {
        assert rkf_assisted_reader.NIL != ar_state_p(state) : state;
        assert rkf_assisted_reader.NIL != ar_concept_p(concept) : concept;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            _csetf_ar_state_candidate_cycls(state, Sequences.delete(concept, ar_state_candidate_cycls(state), (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED));
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 28067L)
    public static SubLObject add_ar_state_asserted_assertion(final SubLObject state, final SubLObject concept) {
        assert rkf_assisted_reader.NIL != ar_state_p(state) : state;
        assert rkf_assisted_reader.NIL != ar_concept_p(concept) : concept;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            if (rkf_assisted_reader.NIL == conses_high.member(concept, ar_state_asserted_assertions(state), Symbols.symbol_function((SubLObject)rkf_assisted_reader.EQL), Symbols.symbol_function((SubLObject)rkf_assisted_reader.IDENTITY))) {
                _csetf_ar_state_asserted_assertions(state, (SubLObject)ConsesLow.cons(concept, ar_state_asserted_assertions(state)));
            }
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 28315L)
    public static SubLObject rem_ar_state_asserted_assertion(final SubLObject state, final SubLObject concept) {
        assert rkf_assisted_reader.NIL != ar_state_p(state) : state;
        assert rkf_assisted_reader.NIL != ar_concept_p(concept) : concept;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            _csetf_ar_state_asserted_assertions(state, Sequences.delete(concept, ar_state_asserted_assertions(state), (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED));
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 28586L)
    public static SubLObject add_ar_state_term_template(final SubLObject state, final SubLObject template) {
        assert rkf_assisted_reader.NIL != ar_state_p(state) : state;
        assert rkf_assisted_reader.NIL != ar_template_p(template) : template;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            if (rkf_assisted_reader.NIL == conses_high.member(template, ar_state_term_templates(state), Symbols.symbol_function((SubLObject)rkf_assisted_reader.EQL), Symbols.symbol_function((SubLObject)rkf_assisted_reader.IDENTITY))) {
                _csetf_ar_state_term_templates(state, (SubLObject)ConsesLow.cons(template, ar_state_term_templates(state)));
            }
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 28823L)
    public static SubLObject rem_ar_state_term_template(final SubLObject state, final SubLObject template) {
        assert rkf_assisted_reader.NIL != ar_state_p(state) : state;
        assert rkf_assisted_reader.NIL != ar_template_p(template) : template;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            _csetf_ar_state_term_templates(state, Sequences.delete(template, ar_state_term_templates(state), (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED));
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 29083L)
    public static SubLObject add_ar_state_assert_template(final SubLObject state, final SubLObject template) {
        assert rkf_assisted_reader.NIL != ar_state_p(state) : state;
        assert rkf_assisted_reader.NIL != ar_template_p(template) : template;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            if (rkf_assisted_reader.NIL == conses_high.member(template, ar_state_assert_templates(state), Symbols.symbol_function((SubLObject)rkf_assisted_reader.EQL), Symbols.symbol_function((SubLObject)rkf_assisted_reader.IDENTITY))) {
                _csetf_ar_state_assert_templates(state, (SubLObject)ConsesLow.cons(template, ar_state_assert_templates(state)));
            }
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 29326L)
    public static SubLObject rem_ar_state_assert_template(final SubLObject state, final SubLObject template) {
        assert rkf_assisted_reader.NIL != ar_state_p(state) : state;
        assert rkf_assisted_reader.NIL != ar_template_p(template) : template;
        SubLObject release = (SubLObject)rkf_assisted_reader.NIL;
        try {
            release = Locks.seize_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            _csetf_ar_state_assert_templates(state, Sequences.delete(template, ar_state_assert_templates(state), (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED));
        }
        finally {
            if (rkf_assisted_reader.NIL != release) {
                Locks.release_lock(rkf_assisted_reader.$ar_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 29592L)
    public static SubLObject ar_state_top_level_parsesP(final SubLObject state) {
        final SubLObject focus_sentence = ar_state_focus_sentence(state);
        SubLObject doneP = (SubLObject)rkf_assisted_reader.NIL;
        if (rkf_assisted_reader.NIL != ar_sentence_p(focus_sentence)) {
            final SubLObject focus_sentence_length = Sequences.length(ar_sentence_token_vector(focus_sentence));
            final SubLObject phrases = Sequences.cconcatenate(ar_state_ambiguous_phrases(state), new SubLObject[] { ar_state_pending_phrases(state), ar_state_assumed_phrases(state) });
            if (rkf_assisted_reader.NIL == doneP) {
                SubLObject csome_list_var = phrases;
                SubLObject phrase = (SubLObject)rkf_assisted_reader.NIL;
                phrase = csome_list_var.first();
                while (rkf_assisted_reader.NIL == doneP && rkf_assisted_reader.NIL != csome_list_var) {
                    if (focus_sentence_length.numE(ar_phrase_token_count(phrase))) {
                        doneP = (SubLObject)rkf_assisted_reader.T;
                    }
                    csome_list_var = csome_list_var.rest();
                    phrase = csome_list_var.first();
                }
            }
        }
        return doneP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 30330L)
    public static SubLObject ar_sentence_completed_p(final SubLObject state, final SubLObject sentence) {
        return subl_promotions.memberP(sentence, ar_state_completed_sentences(state), (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 30613L)
    public static SubLObject ar_source_sentence_p(final SubLObject sentence) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_assisted_reader.NIL != ar_sentence_p(sentence) && rkf_assisted_reader.NIL == ar_clarification_sentence_p(sentence));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 30755L)
    public static SubLObject ar_clarification_sentence_p(final SubLObject sentence) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_assisted_reader.NIL != ar_sentence_p(sentence) && rkf_assisted_reader.NIL != ar_sentence_source_sentence(sentence));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 30896L)
    public static SubLObject ar_source_sentence_number(final SubLObject state, final SubLObject sentence) {
        if (rkf_assisted_reader.NIL != ar_source_sentence_p(sentence)) {
            final SubLObject source_sentences = ar_state_source_sentences(state);
            final SubLObject total = Sequences.length(source_sentences);
            return Numbers.subtract(total, Sequences.position(sentence, source_sentences, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED));
        }
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 31205L)
    public static SubLObject ar_clarification_sentence_number(final SubLObject state, final SubLObject clarification) {
        if (rkf_assisted_reader.NIL != ar_clarification_sentence_p(clarification)) {
            final SubLObject sentence = ar_sentence_source_sentence(clarification);
            final SubLObject clarifications = ar_sentence_clarifications(sentence);
            final SubLObject total = Sequences.length(clarifications);
            return Numbers.subtract(total, Sequences.position(clarification, clarifications, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED));
        }
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 31616L)
    public static SubLObject ar_determine_source_sentence(final SubLObject sentence) {
        if (rkf_assisted_reader.NIL != ar_source_sentence_p(sentence)) {
            return sentence;
        }
        if (rkf_assisted_reader.NIL != ar_clarification_sentence_p(sentence)) {
            return ar_sentence_source_sentence(sentence);
        }
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 31854L)
    public static SubLObject ar_determine_concept_sentences(final SubLObject concept) {
        SubLObject sentences = ar_determine_concept_sentences_recursive(concept, (SubLObject)rkf_assisted_reader.NIL);
        sentences = Sort.sort(sentences, Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym246$_), Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym12$AR_SENTENCE_ID));
        return sentences;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 32071L)
    public static SubLObject ar_determine_concept_sentences_recursive(final SubLObject concept, SubLObject sentences) {
        SubLObject cdolist_list_var = ar_concept_phrases(concept);
        SubLObject phrase = (SubLObject)rkf_assisted_reader.NIL;
        phrase = cdolist_list_var.first();
        while (rkf_assisted_reader.NIL != cdolist_list_var) {
            final SubLObject item_var = ar_phrase_sentence(phrase);
            if (rkf_assisted_reader.NIL == conses_high.member(item_var, sentences, Symbols.symbol_function((SubLObject)rkf_assisted_reader.EQL), Symbols.symbol_function((SubLObject)rkf_assisted_reader.IDENTITY))) {
                sentences = (SubLObject)ConsesLow.cons(item_var, sentences);
            }
            cdolist_list_var = cdolist_list_var.rest();
            phrase = cdolist_list_var.first();
        }
        cdolist_list_var = ar_concept_parts(concept);
        SubLObject part = (SubLObject)rkf_assisted_reader.NIL;
        part = cdolist_list_var.first();
        while (rkf_assisted_reader.NIL != cdolist_list_var) {
            sentences = ar_determine_concept_sentences_recursive(part, sentences);
            cdolist_list_var = cdolist_list_var.rest();
            part = cdolist_list_var.first();
        }
        return sentences;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 32397L)
    public static SubLObject ar_sentence_assumed_phrase_count(final SubLObject state, final SubLObject sentence) {
        return Sequences.count(sentence, ar_state_assumed_phrases(state), Symbols.symbol_function((SubLObject)rkf_assisted_reader.EQL), Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym79$AR_PHRASE_SENTENCE), (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 32557L)
    public static SubLObject ar_state_next_assumed_phrase(final SubLObject state) {
        final SubLObject sentence = ar_state_focus_sentence(state);
        if (rkf_assisted_reader.NIL != sentence) {
            final SubLObject phrases = ar_sentence_phrases(sentence);
            if (rkf_assisted_reader.NIL != Sequences.find((SubLObject)rkf_assisted_reader.$kw247$ASSUMED, phrases, Symbols.symbol_function((SubLObject)rkf_assisted_reader.EQL), Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym75$AR_PHRASE_STATUS), (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED)) {
                return list_utilities.extremal(Sequences.remove((SubLObject)rkf_assisted_reader.$kw247$ASSUMED, phrases, Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym248$NOT_EQL), Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym75$AR_PHRASE_STATUS), (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED), Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym246$_), Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym73$AR_PHRASE_ID));
            }
        }
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 32898L)
    public static SubLObject ar_state_next_unknown_phrase(final SubLObject state) {
        final SubLObject sentence = ar_state_focus_sentence(state);
        if (rkf_assisted_reader.NIL != sentence) {
            final SubLObject phrases = ar_sentence_phrases(sentence);
            if (rkf_assisted_reader.NIL != Sequences.find((SubLObject)rkf_assisted_reader.$kw249$UNKNOWN, phrases, Symbols.symbol_function((SubLObject)rkf_assisted_reader.EQL), Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym75$AR_PHRASE_STATUS), (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED)) {
                return list_utilities.extremal(Sequences.remove((SubLObject)rkf_assisted_reader.$kw249$UNKNOWN, phrases, Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym248$NOT_EQL), Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym75$AR_PHRASE_STATUS), (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED), Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym246$_), Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym73$AR_PHRASE_ID));
            }
        }
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 33239L)
    public static SubLObject ar_state_select_most_promising_unknown_phrase(final SubLObject state) {
        final SubLObject sentence = ar_state_focus_sentence(state);
        if (rkf_assisted_reader.NIL != sentence) {
            final SubLObject phrases = ar_sentence_phrases(sentence);
            if (rkf_assisted_reader.NIL != Sequences.find((SubLObject)rkf_assisted_reader.$kw249$UNKNOWN, phrases, Symbols.symbol_function((SubLObject)rkf_assisted_reader.EQL), Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym75$AR_PHRASE_STATUS), (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED)) {
                final SubLObject unknown_phrases = Sequences.remove((SubLObject)rkf_assisted_reader.$kw249$UNKNOWN, phrases, Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym248$NOT_EQL), Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym75$AR_PHRASE_STATUS), (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED);
                final SubLObject pending_concepts = ar_state_pending_concepts(state);
                SubLObject choices = (SubLObject)rkf_assisted_reader.NIL;
                SubLObject cdolist_list_var = unknown_phrases;
                SubLObject unknown_phrase = (SubLObject)rkf_assisted_reader.NIL;
                unknown_phrase = cdolist_list_var.first();
                while (rkf_assisted_reader.NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$1;
                    final SubLObject surrogates = cdolist_list_var_$1 = ar_phrase_surrogate(unknown_phrase);
                    SubLObject surrogate = (SubLObject)rkf_assisted_reader.NIL;
                    surrogate = cdolist_list_var_$1.first();
                    while (rkf_assisted_reader.NIL != cdolist_list_var_$1) {
                        SubLObject cdolist_list_var_$2 = pending_concepts;
                        SubLObject pending_concept = (SubLObject)rkf_assisted_reader.NIL;
                        pending_concept = cdolist_list_var_$2.first();
                        while (rkf_assisted_reader.NIL != cdolist_list_var_$2) {
                            if (rkf_assisted_reader.NIL != subl_promotions.memberP(pending_concept, ar_concept_agglomerations(surrogate), (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED)) {
                                final SubLObject item_var = unknown_phrase;
                                if (rkf_assisted_reader.NIL == conses_high.member(item_var, choices, Symbols.symbol_function((SubLObject)rkf_assisted_reader.EQL), Symbols.symbol_function((SubLObject)rkf_assisted_reader.IDENTITY))) {
                                    choices = (SubLObject)ConsesLow.cons(item_var, choices);
                                }
                            }
                            cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                            pending_concept = cdolist_list_var_$2.first();
                        }
                        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                        surrogate = cdolist_list_var_$1.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    unknown_phrase = cdolist_list_var.first();
                }
                if (rkf_assisted_reader.NIL == choices) {
                    return ar_state_next_unknown_phrase(state);
                }
                return choices.first();
            }
        }
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 34391L)
    public static SubLObject ar_state_pending_implied_indexicals(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sentence = ar_state_focus_sentence(state);
        final SubLObject discourse_context = rkf_discourse_tracking.$rkf_discourse_context$.getDynamicValue(thread);
        if (rkf_assisted_reader.NIL == discourse_context) {
            Errors.warn((SubLObject)rkf_assisted_reader.$str250$no_discourse_context);
        }
        if (rkf_assisted_reader.NIL == sentence || rkf_assisted_reader.NIL == discourse_context) {
            return (SubLObject)rkf_assisted_reader.NIL;
        }
        final SubLObject phrases = ar_sentence_phrases(sentence);
        if (rkf_assisted_reader.NIL != Sequences.find((SubLObject)rkf_assisted_reader.$kw251$PENDING, phrases, (SubLObject)rkf_assisted_reader.EQL, (SubLObject)rkf_assisted_reader.$sym75$AR_PHRASE_STATUS, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED)) {
            final SubLObject pending_phrases = Sequences.remove((SubLObject)rkf_assisted_reader.$kw251$PENDING, phrases, (SubLObject)rkf_assisted_reader.$sym248$NOT_EQL, (SubLObject)rkf_assisted_reader.$sym75$AR_PHRASE_STATUS, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED);
            SubLObject choices = (SubLObject)rkf_assisted_reader.NIL;
            SubLObject cdolist_list_var = pending_phrases;
            SubLObject phrase = (SubLObject)rkf_assisted_reader.NIL;
            phrase = cdolist_list_var.first();
            while (rkf_assisted_reader.NIL != cdolist_list_var) {
                final SubLObject concept = ar_phrase_disambiguated_concept(phrase);
                final SubLObject cycl = ar_concept_cycl(concept);
                final SubLObject entity = cycl_utilities.expression_find_if((SubLObject)rkf_assisted_reader.$sym252$RKF_DISC_IMPLIED_INDEXICALS_FORMULA_, cycl, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED);
                if (rkf_assisted_reader.NIL != entity && !entity.equal(cycl) && rkf_assisted_reader.NIL != rkf_discourse_tracking.rkf_disc_potentially_resolvable_entityP(entity, discourse_context)) {
                    choices = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(concept, entity, rkf_discourse_tracking.rkf_disc_resolve_entity(entity, cycl, discourse_context)), choices);
                }
                cdolist_list_var = cdolist_list_var.rest();
                phrase = cdolist_list_var.first();
            }
            return choices;
        }
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 35423L)
    public static SubLObject ar_state_next_implied_indexical(final SubLObject state) {
        return ar_state_pending_implied_indexicals(state).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 35590L)
    public static SubLObject ar_sentence_ambiguous_phrase_count(final SubLObject state, final SubLObject sentence) {
        return Sequences.count(sentence, ar_state_ambiguous_phrases(state), Symbols.symbol_function((SubLObject)rkf_assisted_reader.EQL), Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym79$AR_PHRASE_SENTENCE), (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 35754L)
    public static SubLObject ar_state_next_ambiguous_phrase(final SubLObject state) {
        final SubLObject sentence = ar_state_focus_sentence(state);
        if (rkf_assisted_reader.NIL != sentence) {
            final SubLObject phrases = ar_sentence_phrases(sentence);
            if (rkf_assisted_reader.NIL != Sequences.find((SubLObject)rkf_assisted_reader.$kw253$AMBIGUOUS, phrases, Symbols.symbol_function((SubLObject)rkf_assisted_reader.EQL), Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym75$AR_PHRASE_STATUS), (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED)) {
                return list_utilities.extremal(Sequences.remove((SubLObject)rkf_assisted_reader.$kw253$AMBIGUOUS, phrases, Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym248$NOT_EQL), Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym75$AR_PHRASE_STATUS), (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED), Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym246$_), Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym73$AR_PHRASE_ID));
            }
        }
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 36102L)
    public static SubLObject ar_sentence_candidate_assertion_count(final SubLObject state, final SubLObject sentence) {
        return Sequences.count(sentence, ar_state_candidate_assertions(state), Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym254$MEMBER), Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym255$AR_DETERMINE_CONCEPT_SENTENCES), (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 36288L)
    public static SubLObject ar_sentence_candidate_query_count(final SubLObject state, final SubLObject sentence) {
        return Sequences.count(sentence, ar_state_candidate_queries(state), Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym254$MEMBER), Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym255$AR_DETERMINE_CONCEPT_SENTENCES), (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 36465L)
    public static SubLObject ar_sentence_asserted_assertion_count(final SubLObject state, final SubLObject sentence) {
        return Sequences.count(sentence, ar_state_asserted_assertions(state), Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym254$MEMBER), Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym255$AR_DETERMINE_CONCEPT_SENTENCES), (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 36688L)
    public static SubLObject ar_state_determine_focus_sentence(final SubLObject state) {
        final SubLObject current_focus = ar_state_focus_sentence(state);
        SubLObject cdolist_list_var = Sequences.reverse(ar_state_source_sentences(state));
        SubLObject sentence = (SubLObject)rkf_assisted_reader.NIL;
        sentence = cdolist_list_var.first();
        while (rkf_assisted_reader.NIL != cdolist_list_var) {
            if (!sentence.eql(current_focus) && rkf_assisted_reader.NIL == ar_sentence_completed_p(state, sentence)) {
                return sentence;
            }
            SubLObject cdolist_list_var_$3 = Sequences.reverse(ar_sentence_clarifications(sentence));
            SubLObject clarification = (SubLObject)rkf_assisted_reader.NIL;
            clarification = cdolist_list_var_$3.first();
            while (rkf_assisted_reader.NIL != cdolist_list_var_$3) {
                if (!clarification.eql(current_focus) && rkf_assisted_reader.NIL == ar_sentence_completed_p(state, clarification)) {
                    return clarification;
                }
                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                clarification = cdolist_list_var_$3.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        }
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 37301L)
    public static SubLObject ar_surrogate_concept_p(final SubLObject concept) {
        if (rkf_assisted_reader.NIL != ar_concept_p(concept)) {
            final SubLObject cycl = ar_concept_cycl(concept);
            return rkf_concept_harvester.rkf_ch_parsing_surrogate_p(cycl);
        }
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 37746L)
    public static SubLObject ar_concept_dependent_on_surrogate_p(final SubLObject concept, SubLObject depth) {
        if (depth == rkf_assisted_reader.UNPROVIDED) {
            depth = (SubLObject)rkf_assisted_reader.ZERO_INTEGER;
        }
        if (rkf_assisted_reader.NIL != ar_surrogate_concept_p(concept)) {
            return (SubLObject)rkf_assisted_reader.T;
        }
        if (depth.numG(rkf_assisted_reader.$max_surrogate_chain_length$.getGlobalValue())) {
            return (SubLObject)rkf_assisted_reader.NIL;
        }
        SubLObject cdolist_list_var = ar_concept_parts(concept);
        SubLObject part = (SubLObject)rkf_assisted_reader.NIL;
        part = cdolist_list_var.first();
        while (rkf_assisted_reader.NIL != cdolist_list_var) {
            if (rkf_assisted_reader.NIL != ar_concept_dependent_on_surrogate_p(part, Numbers.add((SubLObject)rkf_assisted_reader.ONE_INTEGER, depth))) {
                return (SubLObject)rkf_assisted_reader.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            part = cdolist_list_var.first();
        }
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 38226L)
    public static SubLObject current_ar_concept_grounding_map() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return rkf_assisted_reader.$ar_concept_grounding_map$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 38315L)
    public static SubLObject ensure_ar_concept_grounding_map() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rkf_assisted_reader.NIL == dictionary.dictionary_p(rkf_assisted_reader.$ar_concept_grounding_map$.getDynamicValue(thread))) {
            rkf_assisted_reader.$ar_concept_grounding_map$.setDynamicValue(dictionary.new_dictionary((SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED), thread);
        }
        return current_ar_concept_grounding_map();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 38521L)
    public static SubLObject with_new_ar_concept_grounding_map(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)rkf_assisted_reader.$sym256$CLET, (SubLObject)rkf_assisted_reader.$list257, (SubLObject)rkf_assisted_reader.$list258, reader.bq_cons((SubLObject)rkf_assisted_reader.$sym259$PROGN, ConsesLow.append(body, (SubLObject)rkf_assisted_reader.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 38720L)
    public static SubLObject ar_concept_grounding_computedP(final SubLObject map, final SubLObject concept) {
        final SubLObject mark = dictionary.dictionary_lookup(map, concept, (SubLObject)rkf_assisted_reader.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_assisted_reader.$kw260$GROUNDED == mark || rkf_assisted_reader.$kw261$UNGROUNDED == mark);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 38905L)
    public static SubLObject ar_concept_grounding_groundedP(final SubLObject map, final SubLObject concept) {
        return Equality.eq((SubLObject)rkf_assisted_reader.$kw260$GROUNDED, dictionary.dictionary_lookup(map, concept, (SubLObject)rkf_assisted_reader.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 39023L)
    public static SubLObject ar_concept_grounding_ungroundedP(final SubLObject map, final SubLObject concept) {
        return Equality.eq((SubLObject)rkf_assisted_reader.$kw261$UNGROUNDED, dictionary.dictionary_lookup(map, concept, (SubLObject)rkf_assisted_reader.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 39145L)
    public static SubLObject ar_concept_grounding_in_progressP(final SubLObject map, final SubLObject concept) {
        return Equality.eq((SubLObject)rkf_assisted_reader.$kw262$IN_PROGRESS, dictionary.dictionary_lookup(map, concept, (SubLObject)rkf_assisted_reader.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 39269L)
    public static SubLObject ar_concept_grounding_map_mark(final SubLObject map, final SubLObject concept, final SubLObject mark) {
        return dictionary.dictionary_enter(map, concept, mark);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 39380L)
    public static SubLObject ar_concept_dependent_on_ungrounded_surrogate_p(final SubLObject concept) {
        return (SubLObject)SubLObjectFactory.makeBoolean(!ar_concept_dependent_on_ungrounded_surrogate_count(concept).isZero());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 39594L)
    public static SubLObject ar_concept_dependent_on_ungrounded_surrogate_count(final SubLObject concept) {
        assert rkf_assisted_reader.NIL != ar_concept_p(concept) : concept;
        ensure_ar_concept_grounding_map();
        final SubLObject map = current_ar_concept_grounding_map();
        final SubLObject cycl = ar_concept_cycl(concept);
        if (rkf_assisted_reader.NIL == cycl_utilities.expression_find(rkf_assisted_reader.$const264$TheResultOfParsing, cycl, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED)) {
            ar_concept_grounding_map_mark(map, concept, (SubLObject)rkf_assisted_reader.$kw260$GROUNDED);
            return (SubLObject)rkf_assisted_reader.ZERO_INTEGER;
        }
        if (rkf_assisted_reader.NIL != ar_concept_grounding_computedP(map, concept)) {
            return (SubLObject)((rkf_assisted_reader.NIL != ar_concept_grounding_ungroundedP(map, concept)) ? rkf_assisted_reader.ONE_INTEGER : rkf_assisted_reader.ZERO_INTEGER);
        }
        if (rkf_assisted_reader.NIL != ar_concept_grounding_in_progressP(map, concept)) {
            ar_concept_grounding_map_mark(map, concept, (SubLObject)rkf_assisted_reader.$kw261$UNGROUNDED);
            return rkf_assisted_reader.$ar_concept_cycle_count$.getGlobalValue();
        }
        ar_concept_grounding_map_mark(map, concept, (SubLObject)rkf_assisted_reader.$kw262$IN_PROGRESS);
        if (rkf_assisted_reader.NIL != parsing_utilities.result_of_parsing_formulaP(cycl)) {
            SubLObject groundedP = (SubLObject)rkf_assisted_reader.NIL;
            if (rkf_assisted_reader.NIL == groundedP) {
                SubLObject csome_list_var;
                SubLObject phrase;
                for (csome_list_var = ar_concept_phrases(concept), phrase = (SubLObject)rkf_assisted_reader.NIL, phrase = csome_list_var.first(); rkf_assisted_reader.NIL == groundedP && rkf_assisted_reader.NIL != csome_list_var; groundedP = (SubLObject)SubLObjectFactory.makeBoolean(rkf_assisted_reader.NIL == ar_phrase_dependent_on_ungrounded_surrogate_p(phrase)), csome_list_var = csome_list_var.rest(), phrase = csome_list_var.first()) {}
            }
            final SubLObject value = (SubLObject)((rkf_assisted_reader.NIL != groundedP) ? rkf_assisted_reader.ZERO_INTEGER : rkf_assisted_reader.ONE_INTEGER);
            final SubLObject mark = (SubLObject)((rkf_assisted_reader.NIL != groundedP) ? rkf_assisted_reader.$kw260$GROUNDED : rkf_assisted_reader.$kw261$UNGROUNDED);
            ar_concept_grounding_map_mark(map, concept, mark);
            return value;
        }
        SubLObject ungrounded_part_count = (SubLObject)rkf_assisted_reader.ZERO_INTEGER;
        SubLObject cdolist_list_var = ar_concept_parts(concept);
        SubLObject part = (SubLObject)rkf_assisted_reader.NIL;
        part = cdolist_list_var.first();
        while (rkf_assisted_reader.NIL != cdolist_list_var) {
            if (rkf_assisted_reader.NIL != ar_concept_dependent_on_ungrounded_surrogate_p(part)) {
                ungrounded_part_count = Numbers.add(ungrounded_part_count, (SubLObject)rkf_assisted_reader.ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            part = cdolist_list_var.first();
        }
        ar_concept_grounding_map_mark(map, concept, (SubLObject)(ungrounded_part_count.isZero() ? rkf_assisted_reader.$kw260$GROUNDED : rkf_assisted_reader.$kw261$UNGROUNDED));
        return ungrounded_part_count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 41340L)
    public static SubLObject ar_phrase_dependent_on_ungrounded_surrogate_p(final SubLObject phrase) {
        SubLObject groundedP = (SubLObject)rkf_assisted_reader.NIL;
        if (rkf_assisted_reader.NIL == groundedP) {
            SubLObject csome_list_var;
            SubLObject concept;
            for (csome_list_var = Sequences.cconcatenate(ar_phrase_rejected_concepts(phrase), ar_phrase_concepts(phrase)), concept = (SubLObject)rkf_assisted_reader.NIL, concept = csome_list_var.first(); rkf_assisted_reader.NIL == groundedP && rkf_assisted_reader.NIL != csome_list_var; groundedP = ar_concept_dependent_on_ungrounded_surrogate_p(concept), groundedP = (SubLObject)SubLObjectFactory.makeBoolean(rkf_assisted_reader.NIL == groundedP), csome_list_var = csome_list_var.rest(), concept = csome_list_var.first()) {}
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_assisted_reader.NIL == groundedP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 42027L)
    public static SubLObject ar_phrase_divide_eq_best_lambda_substitute(final SubLObject num) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Equality.eq(num, rkf_assisted_reader.$ar_divide_best$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 42128L)
    public static SubLObject ar_phrase_divide_concepts(final SubLObject phrase, final SubLObject indexicals) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject likely = (SubLObject)rkf_assisted_reader.NIL;
        SubLObject unlikely = (SubLObject)rkf_assisted_reader.NIL;
        SubLObject sorted = (SubLObject)rkf_assisted_reader.NIL;
        SubLObject nthfn_terms = (SubLObject)rkf_assisted_reader.NIL;
        if (rkf_assisted_reader.NIL == ar_phrase_concepts(phrase)) {
            return Values.values((SubLObject)rkf_assisted_reader.NIL, (SubLObject)rkf_assisted_reader.NIL);
        }
        sorted = Sort.stable_sort(conses_high.copy_list(ar_phrase_concepts(phrase)), (SubLObject)rkf_assisted_reader.$sym246$_, (SubLObject)rkf_assisted_reader.$sym136$AR_CONCEPT_CONFIDENCE);
        sorted = Sort.stable_sort(sorted, (SubLObject)rkf_assisted_reader.$sym265$_, (SubLObject)rkf_assisted_reader.$sym266$AR_CONCEPT_COMPLEXITY);
        sorted = Sort.stable_sort(sorted, (SubLObject)rkf_assisted_reader.$sym246$_, (SubLObject)rkf_assisted_reader.$sym138$AR_CONCEPT_OPEN_TERM_SCORE);
        if (rkf_assisted_reader.NIL != indexicals) {
            SubLObject temp_rest = (SubLObject)rkf_assisted_reader.NIL;
            SubLObject cdolist_list_var = sorted;
            SubLObject concept = (SubLObject)rkf_assisted_reader.NIL;
            concept = cdolist_list_var.first();
            while (rkf_assisted_reader.NIL != cdolist_list_var) {
                if (rkf_assisted_reader.NIL != rkf_ar_concept_is_nthfn_termP(concept)) {
                    nthfn_terms = (SubLObject)ConsesLow.cons(concept, nthfn_terms);
                }
                else {
                    temp_rest = (SubLObject)ConsesLow.cons(concept, temp_rest);
                }
                cdolist_list_var = cdolist_list_var.rest();
                concept = cdolist_list_var.first();
            }
            if (rkf_assisted_reader.NIL != nthfn_terms) {
                likely = Sequences.nreverse(nthfn_terms);
                unlikely = Sequences.nreverse(temp_rest);
            }
        }
        if (rkf_assisted_reader.NIL == likely) {
            final SubLObject _prev_bind_0 = rkf_assisted_reader.$ar_divide_best$.currentBinding(thread);
            try {
                rkf_assisted_reader.$ar_divide_best$.bind(ar_concept_open_term_score(sorted.first()), thread);
                final SubLObject best_index = list_utilities.position_if_not((SubLObject)rkf_assisted_reader.$sym267$AR_PHRASE_DIVIDE_EQ_BEST_LAMBDA_SUBSTITUTE, sorted, (SubLObject)rkf_assisted_reader.$sym138$AR_CONCEPT_OPEN_TERM_SCORE, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED);
                if (rkf_assisted_reader.NIL != best_index) {
                    likely = Sequences.subseq(sorted, (SubLObject)rkf_assisted_reader.ZERO_INTEGER, best_index);
                    unlikely = Sequences.subseq(sorted, best_index, (SubLObject)rkf_assisted_reader.UNPROVIDED);
                }
                else {
                    likely = sorted;
                    unlikely = (SubLObject)rkf_assisted_reader.NIL;
                }
                thread.resetMultipleValues();
                final SubLObject v_forts = ar_concept_separate_out_forts(likely);
                final SubLObject others = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (rkf_assisted_reader.NIL != others) {
                    likely = v_forts;
                    unlikely = Sequences.cconcatenate(others, unlikely);
                }
            }
            finally {
                rkf_assisted_reader.$ar_divide_best$.rebind(_prev_bind_0, thread);
            }
        }
        return Values.values(likely, unlikely);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 43842L)
    public static SubLObject ar_concept_separate_out_forts(final SubLObject terms) {
        SubLObject v_forts = (SubLObject)rkf_assisted_reader.NIL;
        SubLObject others = (SubLObject)rkf_assisted_reader.NIL;
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = (SubLObject)rkf_assisted_reader.NIL;
        v_term = cdolist_list_var.first();
        while (rkf_assisted_reader.NIL != cdolist_list_var) {
            final SubLObject term_cycl = parsing_utilities.strip_nl_tags(ar_concept_cycl(v_term), (SubLObject)rkf_assisted_reader.UNPROVIDED);
            if (rkf_assisted_reader.NIL != forts.fort_p(term_cycl) || term_cycl.isNumber() || (rkf_assisted_reader.NIL != function_terms.nat_formula_p(term_cycl) && rkf_assisted_reader.NIL != narts_high.find_nart(term_cycl))) {
                v_forts = (SubLObject)ConsesLow.cons(v_term, v_forts);
            }
            else {
                others = (SubLObject)ConsesLow.cons(v_term, others);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        if (rkf_assisted_reader.NIL != v_forts) {
            return Values.values(Sequences.nreverse(v_forts), Sequences.nreverse(others));
        }
        return Values.values(Sequences.nreverse(others), (SubLObject)rkf_assisted_reader.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 44563L)
    public static SubLObject ar_concept_complexity(final SubLObject concept) {
        return ar_formula_complexity(ar_concept_cycl(concept));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 44765L)
    public static SubLObject ar_formula_complexity(final SubLObject formula) {
        if (rkf_assisted_reader.NIL != forts.fort_p(formula)) {
            return (SubLObject)rkf_assisted_reader.ONE_INTEGER;
        }
        SubLObject highest_complexity = (SubLObject)rkf_assisted_reader.ZERO_INTEGER;
        SubLObject term_complexity = (SubLObject)rkf_assisted_reader.NIL;
        SubLObject cdolist_list_var = cycl_utilities.formula_terms(formula, (SubLObject)rkf_assisted_reader.UNPROVIDED);
        SubLObject v_term = (SubLObject)rkf_assisted_reader.NIL;
        v_term = cdolist_list_var.first();
        while (rkf_assisted_reader.NIL != cdolist_list_var) {
            term_complexity = ar_formula_complexity(v_term);
            if (term_complexity.numG(highest_complexity)) {
                highest_complexity = term_complexity;
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        return number_utilities.f_1X(highest_complexity);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 45236L)
    public static SubLObject ar_phrase_constraints_for_unknown(final SubLObject state, final SubLObject unknown_phrase, final SubLObject domain_mt) {
        final SubLObject surrogates = ar_phrase_surrogate(unknown_phrase);
        SubLObject isas = (SubLObject)rkf_assisted_reader.NIL;
        SubLObject v_genls = (SubLObject)rkf_assisted_reader.NIL;
        SubLObject cdolist_list_var = surrogates;
        SubLObject surrogate = (SubLObject)rkf_assisted_reader.NIL;
        surrogate = cdolist_list_var.first();
        while (rkf_assisted_reader.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$4 = ar_concept_agglomerations(surrogate);
            SubLObject agglomerated = (SubLObject)rkf_assisted_reader.NIL;
            agglomerated = cdolist_list_var_$4.first();
            while (rkf_assisted_reader.NIL != cdolist_list_var_$4) {
                if (rkf_assisted_reader.NIL != subl_promotions.memberP(agglomerated, ar_state_pending_concepts(state), (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED)) {
                    final SubLObject formula = ar_concept_cycl(agglomerated);
                    final SubLObject v_term = ar_concept_cycl(surrogate);
                    SubLObject constrained_by = rkf_tools.rkf_type_constraints(v_term, formula, domain_mt);
                    if (rkf_assisted_reader.NIL == el_utilities.el_conjunction_p(constrained_by)) {
                        constrained_by = simplifier.nconjoin((SubLObject)ConsesLow.list(constrained_by), (SubLObject)rkf_assisted_reader.UNPROVIDED);
                    }
                    SubLObject cdolist_list_var_$5;
                    final SubLObject args = cdolist_list_var_$5 = cycl_utilities.formula_args(constrained_by, (SubLObject)rkf_assisted_reader.$kw268$IGNORE);
                    SubLObject conjunct = (SubLObject)rkf_assisted_reader.NIL;
                    conjunct = cdolist_list_var_$5.first();
                    while (rkf_assisted_reader.NIL != cdolist_list_var_$5) {
                        if (rkf_assisted_reader.$const269$isa.equal(cycl_utilities.formula_arg0(conjunct))) {
                            final SubLObject collection = cycl_utilities.formula_arg2(conjunct, (SubLObject)rkf_assisted_reader.UNPROVIDED);
                            if (rkf_assisted_reader.NIL == rkf_relevance_utilities.rkf_irrelevant_arg_constraint(collection, domain_mt)) {
                                final SubLObject item_var = collection;
                                if (rkf_assisted_reader.NIL == conses_high.member(item_var, isas, Symbols.symbol_function((SubLObject)rkf_assisted_reader.EQL), Symbols.symbol_function((SubLObject)rkf_assisted_reader.IDENTITY))) {
                                    isas = (SubLObject)ConsesLow.cons(item_var, isas);
                                }
                            }
                        }
                        else if (rkf_assisted_reader.$const270$genls.equal(cycl_utilities.formula_arg0(conjunct))) {
                            final SubLObject collection = cycl_utilities.formula_arg2(conjunct, (SubLObject)rkf_assisted_reader.UNPROVIDED);
                            if (rkf_assisted_reader.NIL == rkf_relevance_utilities.rkf_irrelevant_arg_constraint(collection, domain_mt)) {
                                final SubLObject item_var = collection;
                                if (rkf_assisted_reader.NIL == conses_high.member(item_var, v_genls, Symbols.symbol_function((SubLObject)rkf_assisted_reader.EQL), Symbols.symbol_function((SubLObject)rkf_assisted_reader.IDENTITY))) {
                                    v_genls = (SubLObject)ConsesLow.cons(item_var, v_genls);
                                }
                            }
                        }
                        cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                        conjunct = cdolist_list_var_$5.first();
                    }
                }
                cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                agglomerated = cdolist_list_var_$4.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            surrogate = cdolist_list_var.first();
        }
        return Values.values(isas, v_genls);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 47147L)
    public static SubLObject rkf_ar_act_add_source_texts_background(final SubLObject state, final SubLObject texts) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        subl_promotions.make_process_with_args((SubLObject)rkf_assisted_reader.$str271$Assisted_Reader_reading_texts, Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym272$RKF_AR_ACT_ADD_SOURCE_TEXTS_BACKGROUND_INTERNAL), (SubLObject)ConsesLow.list(state, texts, rkf_assisted_reader.$rkf_ar_parsing_mt$.getDynamicValue(thread)));
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 47430L)
    public static SubLObject rkf_ar_act_add_source_texts_background_internal(final SubLObject state, final SubLObject texts, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ignore_errors_tag = (SubLObject)rkf_assisted_reader.NIL;
        try {
            thread.throwStack.push(rkf_assisted_reader.$kw273$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym274$IGNORE_ERRORS_HANDLER), thread);
                try {
                    assert rkf_assisted_reader.NIL != hlmt.hlmt_p(mt) : mt;
                    final SubLObject _prev_bind_0_$6 = rkf_assisted_reader.$rkf_ar_parsing_mt$.currentBinding(thread);
                    try {
                        rkf_assisted_reader.$rkf_ar_parsing_mt$.bind(mt, thread);
                        rkf_ar_act_add_source_texts(state, texts);
                    }
                    finally {
                        rkf_assisted_reader.$rkf_ar_parsing_mt$.rebind(_prev_bind_0_$6, thread);
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)rkf_assisted_reader.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)rkf_assisted_reader.$kw273$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 47656L)
    public static SubLObject rkf_ar_act_add_source_texts(final SubLObject state, final SubLObject texts) {
        assert rkf_assisted_reader.NIL != ar_state_p(state) : state;
        assert rkf_assisted_reader.NIL != Types.listp(texts) : texts;
        SubLObject cdolist_list_var = texts;
        SubLObject text = (SubLObject)rkf_assisted_reader.NIL;
        text = cdolist_list_var.first();
        while (rkf_assisted_reader.NIL != cdolist_list_var) {
            rkf_ar_act_add_source_text(state, text, (SubLObject)rkf_assisted_reader.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            text = cdolist_list_var.first();
        }
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 47855L)
    public static SubLObject rkf_ar_act_add_rewrite_texts_background(final SubLObject state, final SubLObject sentence, final SubLObject texts) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rkf_assisted_reader.NIL != texts) {
            final SubLObject first_text = texts.first();
            final SubLObject rest_texts = texts.rest();
            final SubLObject rewrite = rkf_ar_act_add_rewrite_text(state, first_text, sentence);
            rkf_ar_act_focus_sentence(state, rewrite);
            if (rkf_assisted_reader.NIL != rest_texts) {
                subl_promotions.make_process_with_args((SubLObject)rkf_assisted_reader.$str276$Assisted_Reader_rewriting_a_sente, Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym277$RKF_AR_ACT_ADD_REWRITE_TEXTS_BACKGROUND_INTERNAL), (SubLObject)ConsesLow.list(state, sentence, rest_texts, rkf_assisted_reader.$rkf_ar_parsing_mt$.getDynamicValue(thread)));
            }
        }
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 48436L)
    public static SubLObject rkf_ar_act_add_rewrite_texts_background_internal(final SubLObject state, final SubLObject sentence, final SubLObject texts, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ignore_errors_tag = (SubLObject)rkf_assisted_reader.NIL;
        try {
            thread.throwStack.push(rkf_assisted_reader.$kw273$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym274$IGNORE_ERRORS_HANDLER), thread);
                try {
                    assert rkf_assisted_reader.NIL != hlmt.hlmt_p(mt) : mt;
                    final SubLObject _prev_bind_0_$7 = rkf_assisted_reader.$rkf_ar_parsing_mt$.currentBinding(thread);
                    try {
                        rkf_assisted_reader.$rkf_ar_parsing_mt$.bind(mt, thread);
                        rkf_ar_act_add_rewrite_texts(state, sentence, texts);
                    }
                    finally {
                        rkf_assisted_reader.$rkf_ar_parsing_mt$.rebind(_prev_bind_0_$7, thread);
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)rkf_assisted_reader.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)rkf_assisted_reader.$kw273$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 48682L)
    public static SubLObject rkf_ar_act_add_rewrite_texts(final SubLObject state, final SubLObject sentence, final SubLObject texts) {
        assert rkf_assisted_reader.NIL != ar_state_p(state) : state;
        assert rkf_assisted_reader.NIL != ar_sentence_p(sentence) : sentence;
        assert rkf_assisted_reader.NIL != Types.listp(texts) : texts;
        SubLObject cdolist_list_var = texts;
        SubLObject text = (SubLObject)rkf_assisted_reader.NIL;
        text = cdolist_list_var.first();
        while (rkf_assisted_reader.NIL != cdolist_list_var) {
            rkf_ar_act_add_rewrite_text(state, text, sentence);
            cdolist_list_var = cdolist_list_var.rest();
            text = cdolist_list_var.first();
        }
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 48939L)
    public static SubLObject rkf_ar_act_add_source_text(final SubLObject state, final SubLObject text, SubLObject v_parse_tree) {
        if (v_parse_tree == rkf_assisted_reader.UNPROVIDED) {
            v_parse_tree = (SubLObject)rkf_assisted_reader.NIL;
        }
        return rkf_ar_act_add_text(state, text, (SubLObject)rkf_assisted_reader.NIL, v_parse_tree);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 49128L)
    public static SubLObject rkf_ar_act_add_rewrite_text(final SubLObject state, final SubLObject text, final SubLObject sentence) {
        return rkf_ar_act_add_text(state, text, sentence, (SubLObject)rkf_assisted_reader.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 49286L)
    public static SubLObject rkf_ar_act_add_clarification(final SubLObject state, final SubLObject text, final SubLObject sentence) {
        final SubLObject clarification = rkf_ar_act_add_text(state, text, sentence, (SubLObject)rkf_assisted_reader.UNPROVIDED);
        rkf_ar_act_focus_sentence(state, clarification);
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 50076L)
    public static SubLObject rkf_ar_select_processing_method() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = rkf_assisted_reader.$rkf_ar_processing_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw282$TEXT_PROCESSING)) {
            return Values.values(rkf_assisted_reader.$rkf_ar_text_processor$.getGlobalValue(), (SubLObject)ConsesLow.list(rkf_assisted_reader.$rkf_ar_parsing_mt$.getDynamicValue(thread), rkf_assisted_reader.$rkf_ar_semantics_mt$.getDynamicValue(thread)));
        }
        if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw283$QUESTION_PROCESSING)) {
            return Values.values(rkf_assisted_reader.$rkf_ar_question_processor$.getGlobalValue(), (SubLObject)ConsesLow.list(rkf_assisted_reader.$rkf_ar_parsing_mt$.getDynamicValue(thread), rkf_assisted_reader.$rkf_ar_semantics_mt$.getDynamicValue(thread)));
        }
        return Values.values(rkf_assisted_reader.$rkf_ar_concept_harvester$.getGlobalValue(), (SubLObject)rkf_assisted_reader.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 50510L)
    public static SubLObject rkf_ar_act_process_input_sentence(final SubLObject text) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject function = rkf_ar_select_processing_method();
        final SubLObject args = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Values.values(Functions.apply(function, (SubLObject)ConsesLow.cons(text, args)), rkf_ar_template_category_for_processor(function));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 50757L)
    public static SubLObject rkf_ar_template_category_for_processor(final SubLObject function) {
        final SubLObject alist = rkf_assisted_reader.$rfk_ar_template_category_map$.getGlobalValue();
        return conses_high.second(conses_high.assoc(function, alist, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 50975L)
    public static SubLObject rkf_ar_act_add_text(final SubLObject state, final SubLObject text, SubLObject source_sentence, SubLObject v_parse_tree) {
        if (source_sentence == rkf_assisted_reader.UNPROVIDED) {
            source_sentence = (SubLObject)rkf_assisted_reader.NIL;
        }
        if (v_parse_tree == rkf_assisted_reader.UNPROVIDED) {
            v_parse_tree = (SubLObject)rkf_assisted_reader.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert rkf_assisted_reader.NIL != ar_state_p(state) : state;
        assert rkf_assisted_reader.NIL != Types.stringp(text) : text;
        assert rkf_assisted_reader.NIL != Types.listp(v_parse_tree) : v_parse_tree;
        final SubLObject sentence = new_ar_sentence(state, text);
        SubLObject new_phrases = (SubLObject)rkf_assisted_reader.NIL;
        SubLObject new_concepts = (SubLObject)rkf_assisted_reader.NIL;
        final SubLObject token_strings = rkf_concept_harvester.rkf_ch_string_tokenize(text);
        SubLObject token_list = (SubLObject)rkf_assisted_reader.NIL;
        SubLObject token_number = (SubLObject)rkf_assisted_reader.ZERO_INTEGER;
        SubLObject cdolist_list_var = token_strings;
        SubLObject token_string = (SubLObject)rkf_assisted_reader.NIL;
        token_string = cdolist_list_var.first();
        while (rkf_assisted_reader.NIL != cdolist_list_var) {
            final SubLObject token = new_ar_token(state, token_string, sentence, token_number);
            token_list = (SubLObject)ConsesLow.cons(token, token_list);
            token_number = Numbers.add(token_number, (SubLObject)rkf_assisted_reader.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            token_string = cdolist_list_var.first();
        }
        token_list = Sequences.nreverse(token_list);
        final SubLObject token_vector = Functions.apply(Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym284$VECTOR), token_list);
        note_ar_sentence_token_vector(sentence, token_vector);
        thread.resetMultipleValues();
        final SubLObject phrases = rkf_ar_harvest_for_phrases_and_concepts(state, sentence, text, v_parse_tree);
        final SubLObject concepts = thread.secondMultipleValue();
        thread.resetMultipleValues();
        new_phrases = phrases;
        new_concepts = concepts;
        rkf_ar_add_any_surrogates(state, sentence, new_concepts, new_phrases);
        new_phrases = Sequences.nreverse(new_phrases);
        if (rkf_assisted_reader.NIL != source_sentence) {
            add_ar_sentence_clarification(source_sentence, sentence);
            note_ar_sentence_source_sentence(sentence, source_sentence);
        }
        else {
            add_ar_state_source_sentence(state, sentence);
        }
        SubLObject cdolist_list_var2 = new_phrases;
        SubLObject phrase = (SubLObject)rkf_assisted_reader.NIL;
        phrase = cdolist_list_var2.first();
        while (rkf_assisted_reader.NIL != cdolist_list_var2) {
            rkf_ar_act_add_phrase(state, phrase);
            cdolist_list_var2 = cdolist_list_var2.rest();
            phrase = cdolist_list_var2.first();
        }
        if (rkf_assisted_reader.NIL != new_phrases) {
            rkf_ar_ensure_focus_sentence(state, sentence);
            rkf_ar_set_open_term_scores(state);
        }
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 52719L)
    public static SubLObject rkf_ar_set_open_term_scores(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject focus = ar_state_focus_sentence(state);
        if (rkf_assisted_reader.NIL != ar_sentence_p(focus)) {
            rkf_ar_reset_open_term_counts_for_sentence(focus);
            SubLObject cdolist_list_var;
            final SubLObject all_phrases = cdolist_list_var = ar_sentence_phrases(focus);
            SubLObject phrase = (SubLObject)rkf_assisted_reader.NIL;
            phrase = cdolist_list_var.first();
            while (rkf_assisted_reader.NIL != cdolist_list_var) {
                final SubLObject all_concepts = Sequences.cconcatenate(ar_phrase_surrogate(phrase), new SubLObject[] { ar_phrase_concepts(phrase), ar_phrase_rejected_concepts(phrase) });
                SubLObject already_seen_cycls = (SubLObject)rkf_assisted_reader.NIL;
                final SubLObject _prev_bind_0 = rkf_assisted_reader.$ar_concept_grounding_map$.currentBinding(thread);
                try {
                    rkf_assisted_reader.$ar_concept_grounding_map$.bind((SubLObject)rkf_assisted_reader.NIL, thread);
                    ensure_ar_concept_grounding_map();
                    SubLObject cdolist_list_var_$8 = all_concepts;
                    SubLObject concept = (SubLObject)rkf_assisted_reader.NIL;
                    concept = cdolist_list_var_$8.first();
                    while (rkf_assisted_reader.NIL != cdolist_list_var_$8) {
                        final SubLObject ungrounded_count = ar_concept_dependent_on_ungrounded_surrogate_count(concept);
                        if (rkf_assisted_reader.NIL != ungrounded_count) {
                            note_ar_concept_open_term_score(concept, Numbers.add(ungrounded_count, ar_concept_open_term_score(concept)));
                        }
                        already_seen_cycls = rkf_ar_concept_check_trivial_differences(already_seen_cycls, concept);
                        cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                        concept = cdolist_list_var_$8.first();
                    }
                }
                finally {
                    rkf_assisted_reader.$ar_concept_grounding_map$.rebind(_prev_bind_0, thread);
                }
                cdolist_list_var = cdolist_list_var.rest();
                phrase = cdolist_list_var.first();
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 54145L)
    public static SubLObject rkf_ar_reset_open_term_counts_for_sentence(final SubLObject sentence) {
        SubLObject cdolist_list_var;
        final SubLObject all_phrases = cdolist_list_var = ar_sentence_phrases(sentence);
        SubLObject phrase = (SubLObject)rkf_assisted_reader.NIL;
        phrase = cdolist_list_var.first();
        while (rkf_assisted_reader.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$9 = ar_phrase_surrogate(phrase);
            SubLObject concept = (SubLObject)rkf_assisted_reader.NIL;
            concept = cdolist_list_var_$9.first();
            while (rkf_assisted_reader.NIL != cdolist_list_var_$9) {
                note_ar_concept_open_term_score(concept, (SubLObject)rkf_assisted_reader.ZERO_INTEGER);
                cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                concept = cdolist_list_var_$9.first();
            }
            SubLObject cdolist_list_var_$10 = ar_phrase_concepts(phrase);
            concept = (SubLObject)rkf_assisted_reader.NIL;
            concept = cdolist_list_var_$10.first();
            while (rkf_assisted_reader.NIL != cdolist_list_var_$10) {
                note_ar_concept_open_term_score(concept, (SubLObject)rkf_assisted_reader.ZERO_INTEGER);
                cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                concept = cdolist_list_var_$10.first();
            }
            SubLObject cdolist_list_var_$11 = ar_phrase_rejected_concepts(phrase);
            concept = (SubLObject)rkf_assisted_reader.NIL;
            concept = cdolist_list_var_$11.first();
            while (rkf_assisted_reader.NIL != cdolist_list_var_$11) {
                note_ar_concept_open_term_score(concept, (SubLObject)rkf_assisted_reader.ZERO_INTEGER);
                cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                concept = cdolist_list_var_$11.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            phrase = cdolist_list_var.first();
        }
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 54661L)
    public static SubLObject rkf_ar_concept_check_trivial_differences(SubLObject alist, final SubLObject concept) {
        final SubLObject cleaned_concept = rkf_ar_mask_trivial_differences(ar_concept_cycl(concept));
        final SubLObject associate = conses_high.assoc(cleaned_concept, alist, (SubLObject)rkf_assisted_reader.EQUALP, (SubLObject)rkf_assisted_reader.UNPROVIDED);
        if (rkf_assisted_reader.NIL != associate) {
            if (ar_concept_confidence(conses_high.second(associate)).numG(ar_concept_confidence(concept))) {
                note_ar_concept_open_term_score(concept, number_utilities.f_1X(ar_concept_open_term_score(concept)));
            }
            else {
                note_ar_concept_open_term_score(conses_high.second(associate), number_utilities.f_1X(ar_concept_open_term_score(concept)));
                ConsesLow.rplacd(associate, (SubLObject)ConsesLow.list(concept));
            }
        }
        else {
            alist = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(cleaned_concept, concept), alist);
        }
        return alist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 55717L)
    public static SubLObject rkf_ar_mask_trivial_differences(final SubLObject cycl) {
        return conses_high.subst_if((SubLObject)rkf_assisted_reader.$kw285$UNINTERESTING, (SubLObject)rkf_assisted_reader.$sym286$RTP_TEMPLATE_CATEGORY_, cycl, (SubLObject)rkf_assisted_reader.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 56053L)
    public static SubLObject rkf_ar_harvest_for_phrases_and_concepts(final SubLObject state, final SubLObject sentence, final SubLObject text, final SubLObject v_parse_tree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_phrases = (SubLObject)rkf_assisted_reader.NIL;
        SubLObject new_concepts = (SubLObject)rkf_assisted_reader.NIL;
        SubLObject parses = (SubLObject)rkf_assisted_reader.NIL;
        SubLObject category = (SubLObject)rkf_assisted_reader.NIL;
        if (rkf_assisted_reader.NIL != v_parse_tree) {
            parses = v_parse_tree;
            category = rkf_assisted_reader.$const287$STemplate;
        }
        else {
            thread.resetMultipleValues();
            final SubLObject parses_$12 = rkf_ar_act_process_input_sentence(text);
            final SubLObject category_$13 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            parses = parses_$12;
            category = category_$13;
        }
        parses = rkf_ar_transform_unknown_instances(parses);
        rkf_ar_log_parsing_event(text, parses, category);
        final SubLObject ranked_parses = rkf_ar_rank_parses(text, parses);
        final SubLObject result_iterator = rtp_iterators.new_itp_result_iterator(ranked_parses, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED);
        final SubLObject visited = set.new_set(Symbols.symbol_function((SubLObject)rkf_assisted_reader.EQUALP), (SubLObject)rkf_assisted_reader.UNPROVIDED);
        SubLObject iterator_stack = (SubLObject)ConsesLow.list(rtp_iterators.new_itp_root_children_iterator(result_iterator));
        while (rkf_assisted_reader.NIL != iterator_stack) {
            final SubLObject child_iterator = iterator_stack.first();
            iterator_stack = iterator_stack.rest();
            if (rkf_assisted_reader.NIL == rtp_iterators.itp_child_iterator_doneP(child_iterator)) {
                final SubLObject token_index_list = rtp_iterators.itp_child_iterator_curr_span(child_iterator);
                final SubLObject token_list = ar_sentence_tokens_from_index_list(sentence, token_index_list);
                final SubLObject phrase = new_ar_phrase(state, sentence, token_list);
                final SubLObject top_level_parseP = rtp_iterators.is_itp_root_children_iteratorP(child_iterator);
                new_phrases = (SubLObject)ConsesLow.cons(phrase, new_phrases);
                add_ar_sentence_phrase(sentence, phrase);
                while (rkf_assisted_reader.NIL == rtp_iterators.itp_child_iterator_doneP(child_iterator)) {
                    final SubLObject candidate_cycl_item = rtp_iterators.itp_child_iterator_curr_cycl(child_iterator);
                    final SubLObject rop_formulas = parsing_utilities.formulas_containing_results_of_parsing(candidate_cycl_item);
                    final SubLObject candidate_cycl_confidence = rtp_iterators.itp_child_iterator_curr_confidence(child_iterator);
                    SubLObject cdolist_list_var = rop_formulas;
                    SubLObject rop_formula = (SubLObject)rkf_assisted_reader.NIL;
                    rop_formula = cdolist_list_var.first();
                    while (rkf_assisted_reader.NIL != cdolist_list_var) {
                        if (rkf_assisted_reader.NIL != rop_formula && rkf_assisted_reader.NIL == set.set_memberP(rop_formula, visited)) {
                            iterator_stack = (SubLObject)ConsesLow.cons(rtp_iterators.new_itp_child_iterator(result_iterator, rop_formula), iterator_stack);
                            set.set_add(rop_formula, visited);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        rop_formula = cdolist_list_var.first();
                    }
                    final SubLObject concept = new_ar_concept(state, candidate_cycl_item);
                    note_ar_concept_confidence(concept, candidate_cycl_confidence);
                    new_concepts = (SubLObject)ConsesLow.cons(concept, new_concepts);
                    add_ar_concept_phrase(concept, phrase);
                    if (rkf_assisted_reader.NIL != ar_concept_is_surrogateP(concept)) {
                        note_ar_phrase_surrogate(phrase, concept);
                    }
                    else {
                        add_ar_phrase_concept(phrase, concept);
                    }
                    note_ar_phrase_status(phrase, (SubLObject)rkf_assisted_reader.$kw113$NONE);
                    note_ar_phrase_force(phrase, compute_ar_phrase_force(phrase, top_level_parseP, (SubLObject)rkf_assisted_reader.UNPROVIDED));
                    rtp_iterators.itp_child_iterator_next(child_iterator);
                }
            }
        }
        return Values.values(new_phrases, new_concepts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 59055L)
    public static SubLObject rkf_ar_transform_unknown_instances(final SubLObject cycl) {
        return transform_list_utilities.transform(cycl, (SubLObject)rkf_assisted_reader.$sym288$UNKNOWN_INSTANCE_INDEXED_EXPRESSION_, (SubLObject)rkf_assisted_reader.$sym289$ROP_FROM_UNKNOWN_INSTANCE_INDEXED_FN, (SubLObject)rkf_assisted_reader.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 59420L)
    public static SubLObject rkf_ar_log_parsing_event(final SubLObject text, final SubLObject parses, final SubLObject category) {
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 59929L)
    public static SubLObject rkf_ar_rank_parses(final SubLObject text, final SubLObject parses) {
        return rtp_constituent_weeders.rtp_rank_parses(text, parses);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 60084L)
    public static SubLObject ar_concept_is_surrogateP(final SubLObject concept) {
        return rkf_concept_harvester.rkf_ch_parsing_surrogate_p(ar_concept_cycl(concept));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 60201L)
    public static SubLObject rkf_ar_add_any_surrogates(final SubLObject state, final SubLObject sentence, final SubLObject new_concepts, final SubLObject new_phrases) {
        SubLObject new_surrogates = (SubLObject)rkf_assisted_reader.NIL;
        SubLObject cdolist_list_var = new_concepts;
        SubLObject concept = (SubLObject)rkf_assisted_reader.NIL;
        concept = cdolist_list_var.first();
        while (rkf_assisted_reader.NIL != cdolist_list_var) {
            final SubLObject cycl = ar_concept_cycl(concept);
            final SubLObject surrogate_cycl_terms = rkf_concept_harvester.rkf_ch_gather_parsing_surrogates(cycl);
            if (rkf_assisted_reader.NIL != surrogate_cycl_terms) {
                SubLObject cdolist_list_var_$14 = surrogate_cycl_terms;
                SubLObject surrogate_cycl = (SubLObject)rkf_assisted_reader.NIL;
                surrogate_cycl = cdolist_list_var_$14.first();
                while (rkf_assisted_reader.NIL != cdolist_list_var_$14) {
                    SubLObject surrogate = rkf_ar_check_for_existing_surrogate(surrogate_cycl, new_surrogates);
                    if (rkf_assisted_reader.NIL == surrogate) {
                        final SubLObject token_index_list = rkf_concept_harvester.rkf_ch_parsing_surrogate_token_index_list(surrogate_cycl);
                        final SubLObject surrogate_tokens = ar_sentence_tokens_from_index_list(sentence, token_index_list);
                        final SubLObject phrase = rkf_ar_locate_appropriate_phrase(surrogate_tokens, new_phrases);
                        surrogate = new_ar_concept(state, surrogate_cycl);
                        new_surrogates = (SubLObject)ConsesLow.cons(surrogate, new_surrogates);
                        if (rkf_assisted_reader.NIL != phrase && rkf_assisted_reader.NIL != ar_phrase_has_non_surrogate_conceptsP(phrase)) {
                            rkf_ar_update_surrogates(surrogate, phrase);
                        }
                        else {
                            rkf_ar_add_surrogate_sans_children(state, sentence, surrogate_tokens, surrogate);
                        }
                    }
                    add_ar_concept_part(concept, surrogate);
                    add_ar_concept_agglomeration(surrogate, concept);
                    cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                    surrogate_cycl = cdolist_list_var_$14.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            concept = cdolist_list_var.first();
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 61982L)
    public static SubLObject rkf_ar_locate_appropriate_phrase(final SubLObject tokens, final SubLObject new_phrases) {
        return Sequences.find(tokens, new_phrases, Symbols.symbol_function((SubLObject)rkf_assisted_reader.EQUAL), Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym77$AR_PHRASE_TOKEN_LIST), (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 62123L)
    public static SubLObject rkf_ar_check_for_existing_surrogate(final SubLObject surrogate_cycl, final SubLObject new_surrogates) {
        return Sequences.find(surrogate_cycl, new_surrogates, Symbols.symbol_function((SubLObject)rkf_assisted_reader.EQUALP), Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym124$AR_CONCEPT_CYCL), (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 62282L)
    public static SubLObject rkf_ar_update_surrogates(final SubLObject surrogate, final SubLObject phrase) {
        SubLObject fake_concept = (SubLObject)rkf_assisted_reader.NIL;
        SubLObject foundP = (SubLObject)rkf_assisted_reader.NIL;
        add_ar_concept_phrase(surrogate, phrase);
        note_ar_phrase_surrogate(phrase, surrogate);
        if (rkf_assisted_reader.NIL != rkf_concept_harvester.rkf_ch_gather_parsing_surrogates(ar_concept_cycl(surrogate))) {
            if (rkf_assisted_reader.NIL == foundP) {
                SubLObject csome_list_var;
                SubLObject concept;
                for (csome_list_var = ar_phrase_concepts(phrase), concept = (SubLObject)rkf_assisted_reader.NIL, concept = csome_list_var.first(); rkf_assisted_reader.NIL == foundP && rkf_assisted_reader.NIL != csome_list_var; foundP = Equality.equalp(ar_concept_cycl(surrogate), ar_concept_cycl(concept)), csome_list_var = csome_list_var.rest(), concept = csome_list_var.first()) {
                    fake_concept = concept;
                }
            }
            if (rkf_assisted_reader.NIL != foundP) {
                remove_ar_phrase_concept(phrase, fake_concept);
            }
        }
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 62994L)
    public static SubLObject rkf_ar_add_surrogate_sans_children(final SubLObject state, final SubLObject sentence, final SubLObject surrogate_tokens, final SubLObject surrogate) {
        final SubLObject unknown_phrase = new_ar_phrase(state, sentence, surrogate_tokens);
        note_ar_phrase_status(unknown_phrase, (SubLObject)rkf_assisted_reader.$kw249$UNKNOWN);
        add_ar_concept_phrase(surrogate, unknown_phrase);
        note_ar_phrase_surrogate(unknown_phrase, surrogate);
        add_ar_sentence_phrase(sentence, unknown_phrase);
        add_ar_state_unknown_phrase(state, unknown_phrase);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 63624L)
    public static SubLObject rkf_ar_act_focus_sentence(final SubLObject state, final SubLObject sentence) {
        note_ar_state_focus_sentence(state, sentence);
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 63745L)
    public static SubLObject rkf_ar_ensure_focus_sentence(final SubLObject state, final SubLObject sentence) {
        final SubLObject focus = ar_state_focus_sentence(state);
        if (rkf_assisted_reader.NIL == focus) {
            rkf_ar_act_focus_sentence(state, sentence);
        }
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 63940L)
    public static SubLObject rkf_ar_act_augment_sentence(final SubLObject state, final SubLObject string, final SubLObject interpretation) {
        final SubLObject sentence = ar_state_focus_sentence(state);
        if (rkf_assisted_reader.NIL != ar_sentence_p(sentence)) {
            SubLObject cdolist_list_var = ar_sentence_phrases(sentence);
            SubLObject phrase = (SubLObject)rkf_assisted_reader.NIL;
            phrase = cdolist_list_var.first();
            while (rkf_assisted_reader.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$15;
                final SubLObject surrogates = cdolist_list_var_$15 = ar_phrase_surrogate(phrase);
                SubLObject surrogate = (SubLObject)rkf_assisted_reader.NIL;
                surrogate = cdolist_list_var_$15.first();
                while (rkf_assisted_reader.NIL != cdolist_list_var_$15) {
                    if (rkf_assisted_reader.NIL != surrogate && rkf_assisted_reader.NIL != rkf_concept_harvester.rkf_ch_parsing_surrogate_p(ar_concept_cycl(surrogate))) {
                        final SubLObject utterance = cycl_utilities.formula_arg1(ar_concept_cycl(surrogate), (SubLObject)rkf_assisted_reader.UNPROVIDED);
                        if (rkf_assisted_reader.NIL != Strings.string_equal(utterance, string, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED)) {
                            final SubLObject src_concept = ar_phrase_concepts(phrase).first();
                            final SubLObject existing_concept = rkf_ar_act_find_concept(state, interpretation);
                            SubLObject concept = (SubLObject)rkf_assisted_reader.NIL;
                            if (rkf_assisted_reader.NIL != existing_concept) {
                                concept = existing_concept;
                            }
                            else if (rkf_assisted_reader.NIL != src_concept) {
                                concept = rkf_ar_act_clone_augment_concept(state, src_concept, interpretation);
                            }
                            else {
                                concept = new_ar_concept(state, interpretation);
                                add_ar_concept_phrase(concept, phrase);
                            }
                            add_ar_phrase_concept(phrase, concept);
                            if (rkf_assisted_reader.$kw249$UNKNOWN == ar_phrase_status(phrase)) {
                                rem_ar_state_unknown_phrase(state, phrase);
                                note_ar_phrase_disambiguated_concept(phrase, concept);
                                rkf_ar_act_note_accepted_phrase(state, phrase);
                            }
                        }
                    }
                    cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                    surrogate = cdolist_list_var_$15.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                phrase = cdolist_list_var.first();
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 65580L)
    public static SubLObject rkf_ar_act_complete_augmentation(final SubLObject state) {
        rkf_ar_set_open_term_scores(state);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 65732L)
    public static SubLObject rkf_ar_act_find_concept(final SubLObject state, final SubLObject cycl) {
        final SubLObject sentence = ar_state_focus_sentence(state);
        SubLObject cdolist_list_var;
        final SubLObject phrases = cdolist_list_var = ar_sentence_phrases(sentence);
        SubLObject phrase = (SubLObject)rkf_assisted_reader.NIL;
        phrase = cdolist_list_var.first();
        while (rkf_assisted_reader.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$16 = Sequences.cconcatenate(ar_phrase_concepts(phrase), new SubLObject[] { ar_phrase_rejected_concepts(phrase), ar_phrase_surrogate(phrase) });
            SubLObject concept = (SubLObject)rkf_assisted_reader.NIL;
            concept = cdolist_list_var_$16.first();
            while (rkf_assisted_reader.NIL != cdolist_list_var_$16) {
                if (ar_concept_cycl(concept).equal(cycl)) {
                    return concept;
                }
                cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                concept = cdolist_list_var_$16.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            phrase = cdolist_list_var.first();
        }
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 66127L)
    public static SubLObject rkf_ar_act_augment_phrase(final SubLObject state, final SubLObject phrase, final SubLObject interpretation) {
        if (ar_phrase_status(phrase) == rkf_assisted_reader.$kw247$ASSUMED) {
            rem_ar_state_assumed_phrase(state, phrase);
            rkf_ar_act_note_ambiguous(state, phrase);
        }
        if (ar_phrase_status(phrase) == rkf_assisted_reader.$kw253$AMBIGUOUS) {
            final SubLObject concept = ar_phrase_concepts(phrase).first();
            final SubLObject existing_concept = rkf_ar_act_find_concept(phrase, interpretation);
            final SubLObject new_concept = (rkf_assisted_reader.NIL != existing_concept) ? existing_concept : rkf_ar_act_clone_augment_concept(state, concept, interpretation);
            add_ar_phrase_concept(phrase, new_concept);
            rkf_ar_act_note_disambiguation(state, phrase, new_concept);
        }
        if (ar_phrase_status(phrase) == rkf_assisted_reader.$kw249$UNKNOWN) {
            rem_ar_state_unknown_phrase(state, phrase);
            add_ar_state_assumed_phrase(state, phrase);
            final SubLObject existing_concept2 = rkf_ar_act_find_concept(state, interpretation);
            final SubLObject new_concept2 = (rkf_assisted_reader.NIL != existing_concept2) ? existing_concept2 : new_ar_concept(state, interpretation);
            add_ar_phrase_concept(phrase, new_concept2);
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 67356L)
    public static SubLObject rkf_ar_act_add_phrase(final SubLObject state, final SubLObject phrase) {
        if (rkf_assisted_reader.NIL != rkf_ar_some_subsuming_phrase(phrase, ar_state_accepted_phrases(state)) || rkf_assisted_reader.NIL != rkf_ar_some_subsuming_phrase(phrase, ar_state_assumed_phrases(state)) || rkf_assisted_reader.NIL != rkf_ar_some_subsuming_phrase(phrase, ar_state_ambiguous_phrases(state)) || rkf_assisted_reader.NIL != rkf_ar_some_subsuming_phrase(phrase, ar_state_irrelevant_phrases(state)) || rkf_assisted_reader.NIL != rkf_ar_some_subsuming_phrase(phrase, ar_state_pending_phrases(state))) {
            rkf_ar_act_note_irrelevant(state, phrase);
            return state;
        }
        return rkf_ar_act_add_relevant_phrase(state, phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 68041L)
    public static SubLObject rkf_ar_act_add_relevant_phrase(final SubLObject state, final SubLObject phrase) {
        final SubLObject concepts = ar_phrase_concepts(phrase);
        if (rkf_assisted_reader.NIL != list_utilities.singletonP(concepts)) {
            rkf_ar_act_note_assumed(state, phrase, concepts.first());
            return state;
        }
        rkf_ar_act_note_ambiguous(state, phrase);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 68391L)
    public static SubLObject rkf_ar_act_note_irrelevant(final SubLObject state, final SubLObject phrase) {
        note_ar_phrase_status(phrase, (SubLObject)rkf_assisted_reader.$kw293$IRRELEVANT);
        add_ar_state_irrelevant_phrase(state, phrase);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 68557L)
    public static SubLObject rkf_ar_act_note_assumed(final SubLObject state, final SubLObject phrase, final SubLObject concept) {
        note_ar_phrase_disambiguated_concept(phrase, concept);
        note_ar_phrase_status(phrase, (SubLObject)rkf_assisted_reader.$kw247$ASSUMED);
        add_ar_state_assumed_phrase(state, phrase);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 68778L)
    public static SubLObject rkf_ar_act_note_ambiguous(final SubLObject state, final SubLObject phrase) {
        clear_ar_phrase_disambiguated_concept(phrase);
        note_ar_phrase_status(phrase, (SubLObject)rkf_assisted_reader.$kw253$AMBIGUOUS);
        add_ar_state_ambiguous_phrase(state, phrase);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 68990L)
    public static SubLObject rkf_ar_act_note_disambiguation(final SubLObject state, final SubLObject phrase, final SubLObject concept) {
        rem_ar_state_ambiguous_phrase(state, phrase);
        note_ar_phrase_disambiguated_concept(phrase, concept);
        rkf_ar_act_note_accepted_phrase(state, phrase);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 69227L)
    public static SubLObject rkf_ar_act_note_accept_assumed(final SubLObject state, final SubLObject phrase) {
        rem_ar_state_assumed_phrase(state, phrase);
        rkf_ar_act_note_accepted_phrase(state, phrase);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 69398L)
    public static SubLObject rkf_ar_act_handle_accept_assumed(final SubLObject state, final SubLObject phrase, final SubLObject v_term) {
        final SubLObject assumed_concept = ar_phrase_concepts(phrase).first();
        if (v_term.eql(ar_concept_cycl(assumed_concept))) {
            rkf_ar_act_note_accept_assumed(state, phrase);
        }
        else {
            rkf_ar_act_augment_phrase(state, phrase, v_term);
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 69715L)
    public static SubLObject rkf_ar_act_note_accepted_phrase(final SubLObject state, final SubLObject phrase) {
        final SubLObject concept = ar_phrase_disambiguated_concept(phrase);
        if (rkf_assisted_reader.NIL != ar_sentence_rewrite_cycl_p(ar_concept_cycl(concept))) {
            final SubLObject sentence = ar_phrase_sentence(phrase);
            rkf_ar_act_note_rewrite_sentence(state, sentence, concept);
        }
        else if (rkf_assisted_reader.NIL != ar_concept_dependent_on_surrogate_p(concept, (SubLObject)rkf_assisted_reader.UNPROVIDED)) {
            add_ar_state_pending_phrase(state, phrase);
            rkf_ar_act_note_pending_concept(state, concept);
            rkf_ar_act_reconsider_irrelevant(state, phrase);
            note_ar_phrase_status(phrase, (SubLObject)rkf_assisted_reader.$kw251$PENDING);
            if (rkf_assisted_reader.NIL != ar_phrase_surrogate(phrase)) {
                rkf_ar_act_note_surrogate_replacement(state, phrase, concept);
            }
        }
        else {
            note_ar_phrase_status(phrase, (SubLObject)rkf_assisted_reader.$kw294$ACCEPTED);
            add_ar_state_accepted_phrase(state, phrase);
            rkf_ar_act_note_accepted_concept(state, concept, phrase);
            if (rkf_assisted_reader.NIL != ar_phrase_surrogate(phrase)) {
                rkf_ar_act_note_surrogate_replacement(state, phrase, concept);
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 70687L)
    public static SubLObject rkf_ar_act_note_rejected_phrase(final SubLObject state, final SubLObject phrase) {
        if (rkf_assisted_reader.$kw247$ASSUMED == ar_phrase_status(phrase)) {
            rem_ar_state_assumed_phrase(state, phrase);
            final SubLObject concepts = ar_phrase_concepts(phrase);
            if (rkf_assisted_reader.NIL != list_utilities.singletonP(concepts)) {
                clear_ar_phrase_disambiguated_concept(phrase);
                note_ar_phrase_status(phrase, (SubLObject)rkf_assisted_reader.$kw295$REJECTED);
                add_ar_state_rejected_phrase(state, phrase);
                rkf_ar_act_reconsider_irrelevant(state, phrase);
            }
            else {
                rkf_ar_act_note_ambiguous(state, phrase);
            }
        }
        else if (rkf_assisted_reader.$kw253$AMBIGUOUS == ar_phrase_status(phrase)) {
            rem_ar_state_ambiguous_phrase(state, phrase);
            note_ar_phrase_status(phrase, (SubLObject)rkf_assisted_reader.$kw295$REJECTED);
            add_ar_state_rejected_phrase(state, phrase);
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 71525L)
    public static SubLObject rkf_ar_act_reconsider_irrelevant(final SubLObject state, final SubLObject phrase) {
        final SubLObject irrelevant_phrases = ar_state_irrelevant_phrases(state);
        SubLObject reconsider_phrases = (SubLObject)rkf_assisted_reader.NIL;
        SubLObject cdolist_list_var = irrelevant_phrases;
        SubLObject irrelevant_phrase = (SubLObject)rkf_assisted_reader.NIL;
        irrelevant_phrase = cdolist_list_var.first();
        while (rkf_assisted_reader.NIL != cdolist_list_var) {
            if (rkf_assisted_reader.NIL != rkf_ar_phrase_subsumed(irrelevant_phrase, phrase)) {
                reconsider_phrases = (SubLObject)ConsesLow.cons(irrelevant_phrase, reconsider_phrases);
            }
            cdolist_list_var = cdolist_list_var.rest();
            irrelevant_phrase = cdolist_list_var.first();
        }
        cdolist_list_var = reconsider_phrases;
        SubLObject reconsider_phrase = (SubLObject)rkf_assisted_reader.NIL;
        reconsider_phrase = cdolist_list_var.first();
        while (rkf_assisted_reader.NIL != cdolist_list_var) {
            rem_ar_state_irrelevant_phrase(state, reconsider_phrase);
            note_ar_phrase_status(phrase, (SubLObject)rkf_assisted_reader.$kw113$NONE);
            cdolist_list_var = cdolist_list_var.rest();
            reconsider_phrase = cdolist_list_var.first();
        }
        cdolist_list_var = reconsider_phrases;
        reconsider_phrase = (SubLObject)rkf_assisted_reader.NIL;
        reconsider_phrase = cdolist_list_var.first();
        while (rkf_assisted_reader.NIL != cdolist_list_var) {
            rkf_ar_act_add_phrase(state, reconsider_phrase);
            cdolist_list_var = cdolist_list_var.rest();
            reconsider_phrase = cdolist_list_var.first();
        }
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 72266L)
    public static SubLObject rkf_ar_act_understand_unknown_phrase(final SubLObject state, final SubLObject phrase, final SubLObject v_term) {
        final SubLObject concept = new_ar_concept(state, v_term);
        add_ar_concept_phrase(concept, phrase);
        add_ar_phrase_concept(phrase, concept);
        rem_ar_state_unknown_phrase(state, phrase);
        note_ar_phrase_status(phrase, (SubLObject)rkf_assisted_reader.$kw294$ACCEPTED);
        add_ar_state_accepted_phrase(state, phrase);
        if (rkf_assisted_reader.NIL != ar_phrase_surrogate(phrase)) {
            rkf_ar_act_note_surrogate_replacement(state, phrase, concept);
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 72959L)
    public static SubLObject rkf_ar_act_reject_unknown_phrase(final SubLObject state, final SubLObject phrase) {
        rem_ar_state_unknown_phrase(state, phrase);
        note_ar_phrase_status(phrase, (SubLObject)rkf_assisted_reader.$kw295$REJECTED);
        add_ar_state_rejected_phrase(state, phrase);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 73173L)
    public static SubLObject rkf_ar_act_note_rewrite_sentence(final SubLObject state, final SubLObject old_sentence, final SubLObject concept) {
        rkf_ar_act_note_sentence_completed(state, old_sentence);
        final SubLObject source_sentence = ar_determine_source_sentence(old_sentence);
        final SubLObject rewrite_cycl = ar_concept_cycl(concept);
        final SubLObject new_texts = ar_compute_sentence_rewrites(rewrite_cycl);
        rkf_ar_act_add_rewrite_texts_background(state, source_sentence, new_texts);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 73680L)
    public static SubLObject ar_sentence_rewrite_cycl_p(final SubLObject cycl) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl.isCons() && rkf_assisted_reader.$const296$RewriteSequenceFn.eql(cycl_utilities.formula_operator(cycl)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 73815L)
    public static SubLObject ar_compute_sentence_rewrites(final SubLObject rewrite_cycl) {
        final SubLObject phrase_texts = cycl_utilities.formula_args(rewrite_cycl, (SubLObject)rkf_assisted_reader.UNPROVIDED);
        return conses_high.copy_list(phrase_texts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 74032L)
    public static SubLObject rkf_ar_act_note_sentence_completed(final SubLObject state, final SubLObject sentence) {
        SubLObject cdolist_list_var;
        final SubLObject clarifications = cdolist_list_var = ar_sentence_clarifications(sentence);
        SubLObject clarification = (SubLObject)rkf_assisted_reader.NIL;
        clarification = cdolist_list_var.first();
        while (rkf_assisted_reader.NIL != cdolist_list_var) {
            rkf_ar_act_note_sentence_completed(state, clarification);
            cdolist_list_var = cdolist_list_var.rest();
            clarification = cdolist_list_var.first();
        }
        final SubLObject phrases = cdolist_list_var = ar_sentence_phrases(sentence);
        SubLObject phrase = (SubLObject)rkf_assisted_reader.NIL;
        phrase = cdolist_list_var.first();
        while (rkf_assisted_reader.NIL != cdolist_list_var) {
            rkf_ar_act_note_phrase_completed(state, phrase);
            cdolist_list_var = cdolist_list_var.rest();
            phrase = cdolist_list_var.first();
        }
        add_ar_state_completed_sentence(state, sentence);
        clear_ar_state_focus_sentence(state);
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 74640L)
    public static SubLObject rkf_ar_act_note_sentence_completed_and_refocus(final SubLObject state) {
        final SubLObject sentence = ar_state_focus_sentence(state);
        final SubLObject next_sentence = ar_state_determine_focus_sentence(state);
        if (rkf_assisted_reader.NIL != sentence) {
            rkf_ar_act_note_sentence_completed(state, sentence);
        }
        if (rkf_assisted_reader.NIL != next_sentence) {
            rkf_ar_act_focus_sentence(state, next_sentence);
        }
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 75032L)
    public static SubLObject rkf_ar_act_note_phrase_completed(final SubLObject state, final SubLObject phrase) {
        final SubLObject concept = ar_phrase_disambiguated_concept(phrase);
        if (rkf_assisted_reader.NIL != concept) {
            rkf_ar_act_note_concept_completed(state, concept);
        }
        final SubLObject pcase_var = ar_phrase_status(phrase);
        if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw249$UNKNOWN)) {
            rem_ar_state_unknown_phrase(state, phrase);
        }
        else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw295$REJECTED)) {
            rem_ar_state_rejected_phrase(state, phrase);
        }
        else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw293$IRRELEVANT)) {
            rem_ar_state_irrelevant_phrase(state, phrase);
        }
        else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw253$AMBIGUOUS)) {
            rem_ar_state_ambiguous_phrase(state, phrase);
        }
        else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw247$ASSUMED)) {
            rem_ar_state_assumed_phrase(state, phrase);
        }
        else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw251$PENDING)) {
            rem_ar_state_pending_phrase(state, phrase);
        }
        else if (pcase_var.eql((SubLObject)rkf_assisted_reader.$kw294$ACCEPTED)) {
            rem_ar_state_accepted_phrase(state, phrase);
        }
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 75796L)
    public static SubLObject rkf_ar_act_note_concept_completed(final SubLObject state, final SubLObject concept) {
        SubLObject cdolist_list_var;
        final SubLObject agglomerations = cdolist_list_var = ar_concept_agglomerations(concept);
        SubLObject agglomeration = (SubLObject)rkf_assisted_reader.NIL;
        agglomeration = cdolist_list_var.first();
        while (rkf_assisted_reader.NIL != cdolist_list_var) {
            rkf_ar_act_note_concept_completed(state, agglomeration);
            cdolist_list_var = cdolist_list_var.rest();
            agglomeration = cdolist_list_var.first();
        }
        rem_ar_state_pending_concept(state, concept);
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 76349L)
    public static SubLObject rkf_ar_act_note_pending_concept(final SubLObject state, final SubLObject concept) {
        add_ar_state_pending_concept(state, concept);
        SubLObject cdolist_list_var = ar_concept_parts(concept);
        SubLObject part = (SubLObject)rkf_assisted_reader.NIL;
        part = cdolist_list_var.first();
        while (rkf_assisted_reader.NIL != cdolist_list_var) {
            if (rkf_assisted_reader.NIL != ar_surrogate_concept_p(part)) {
                final SubLObject surrogate_phrase = ar_concept_phrases(part).first();
                if (rkf_assisted_reader.NIL != ar_phrase_p(surrogate_phrase) && rkf_assisted_reader.$kw293$IRRELEVANT == ar_phrase_status(surrogate_phrase)) {
                    rem_ar_state_irrelevant_phrase(state, surrogate_phrase);
                    rkf_ar_act_add_relevant_phrase(state, surrogate_phrase);
                    rkf_ar_act_propagate_surrogate_constraint(state, surrogate_phrase, concept);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            part = cdolist_list_var.first();
        }
        final SubLObject cycl = ar_concept_cycl(concept);
        if (cycl.isCons()) {
            final SubLObject relation = cycl_utilities.formula_operator(cycl);
            if (rkf_assisted_reader.NIL != rkf_ar_ensure_relation_is_goodP(relation)) {
                final SubLObject relation_concept = new_ar_concept(state, relation);
                add_ar_concept_part(concept, relation_concept);
                add_ar_concept_agglomeration(relation_concept, concept);
                rkf_ar_act_note_accepted_concept(state, relation_concept, (SubLObject)rkf_assisted_reader.UNPROVIDED);
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 77631L)
    public static SubLObject rkf_ar_ensure_relation_is_goodP(final SubLObject relation) {
        return (SubLObject)SubLObjectFactory.makeBoolean((rkf_assisted_reader.NIL != fort_types_interface.predicateP(relation) || rkf_assisted_reader.NIL != fort_types_interface.functionP(relation)) && rkf_assisted_reader.NIL == ar_pragmatic_relation_p(relation));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 77830L)
    public static SubLObject rkf_ar_act_propagate_surrogate_constraint(final SubLObject state, final SubLObject phrase, final SubLObject agglomeration) {
        SubLObject cdolist_list_var = ar_phrase_surrogate(phrase);
        SubLObject surrogate = (SubLObject)rkf_assisted_reader.NIL;
        surrogate = cdolist_list_var.first();
        while (rkf_assisted_reader.NIL != cdolist_list_var) {
            rkf_ar_act_propagate_one_surrogate_constraint(state, phrase, agglomeration, surrogate);
            cdolist_list_var = cdolist_list_var.rest();
            surrogate = cdolist_list_var.first();
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 78082L)
    public static SubLObject rkf_ar_act_propagate_one_surrogate_constraint(final SubLObject state, final SubLObject phrase, final SubLObject agglomeration, final SubLObject surrogate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject surrogate_cycl = ar_concept_cycl(surrogate);
        final SubLObject agglomeration_cycl = ar_concept_cycl(agglomeration);
        final SubLObject constraint = rkf_tools.rkf_type_constraint_set(surrogate_cycl, agglomeration_cycl, (SubLObject)rkf_assisted_reader.UNPROVIDED);
        note_ar_phrase_constraint(phrase, constraint);
        if (rkf_assisted_reader.$kw253$AMBIGUOUS == ar_phrase_status(phrase)) {
            SubLObject rejected_concepts = (SubLObject)rkf_assisted_reader.NIL;
            SubLObject cdolist_list_var = ar_phrase_concepts(phrase);
            SubLObject concept = (SubLObject)rkf_assisted_reader.NIL;
            concept = cdolist_list_var.first();
            while (rkf_assisted_reader.NIL != cdolist_list_var) {
                final SubLObject concept_cycl = ar_concept_cycl(concept);
                if (rkf_assisted_reader.NIL == rkf_ar_nthfn_termP(concept_cycl) && rkf_assisted_reader.NIL == rkf_ar_unfailable_constraintP(constraint) && rkf_assisted_reader.NIL == rkf_ar_possibly_reformulatableP(concept_cycl) && rkf_assisted_reader.NIL == rkf_ar_possibly_reformulatableP(agglomeration_cycl) && rkf_assisted_reader.NIL == backward.removal_ask((SubLObject)ConsesLow.list(rkf_assisted_reader.$const297$elementOf, concept_cycl, constraint), rkf_assisted_reader.$rkf_ar_parsing_mt$.getDynamicValue(thread), (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED)) {
                    rejected_concepts = (SubLObject)ConsesLow.cons(concept, rejected_concepts);
                }
                cdolist_list_var = cdolist_list_var.rest();
                concept = cdolist_list_var.first();
            }
            if (rkf_assisted_reader.NIL != rejected_concepts) {
                rkf_ar_act_note_rejected_concepts(state, phrase, rejected_concepts);
            }
        }
        if (rkf_assisted_reader.NIL == ar_phrase_rejected_concepts(phrase) && rkf_assisted_reader.NIL == ar_phrase_concepts(phrase)) {
            note_ar_phrase_status(phrase, (SubLObject)rkf_assisted_reader.$kw298$NO_DISAMBIGS);
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 79586L)
    public static SubLObject rkf_ar_concept_is_nthfn_termP(final SubLObject concept) {
        return rkf_ar_nthfn_termP(ar_concept_cycl(concept));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 79839L)
    public static SubLObject rkf_ar_nthfn_termP(final SubLObject cycl) {
        final SubLObject stripped_cycl = parsing_utilities.strip_nl_tags(cycl, (SubLObject)rkf_assisted_reader.UNPROVIDED);
        final SubLObject formula = cycl_utilities.hl_term_to_el_term(stripped_cycl);
        return Equality.eq(cycl_utilities.formula_arg0(formula), rkf_assisted_reader.$const299$TheNthFn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 80032L)
    public static SubLObject rkf_ar_unfailable_constraintP(final SubLObject constraint) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_assisted_reader.NIL != el_utilities.formula_arityE(constraint, (SubLObject)rkf_assisted_reader.TWO_INTEGER, (SubLObject)rkf_assisted_reader.UNPROVIDED) && cycl_utilities.formula_arg0(constraint).eql(rkf_assisted_reader.$const300$TheSetOf) && cycl_utilities.formula_arg0(cycl_utilities.formula_arg2(constraint, (SubLObject)rkf_assisted_reader.UNPROVIDED)).eql(rkf_assisted_reader.$const269$isa) && cycl_utilities.formula_arg2(cycl_utilities.formula_arg2(constraint, (SubLObject)rkf_assisted_reader.UNPROVIDED), (SubLObject)rkf_assisted_reader.UNPROVIDED).eql(rkf_assisted_reader.$const301$Thing));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 80405L)
    public static SubLObject rkf_ar_possibly_reformulatableP(final SubLObject cycl) {
        return list_utilities.sublisp_boolean(list_utilities.tree_find_if((SubLObject)rkf_assisted_reader.$sym302$RKF_REFORMULATABLE_TERM_, cycl, (SubLObject)rkf_assisted_reader.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 80527L)
    public static SubLObject rkf_reformulatable_termP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rkf_assisted_reader.NIL == rkf_assisted_reader.$rkf_reformulatable_terms$.getDynamicValue(thread)) {
            initialize_rkf_reformulatable_terms();
        }
        return set.set_memberP(v_term, rkf_assisted_reader.$rkf_reformulatable_terms$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 80830L)
    public static SubLObject initialize_rkf_reformulatable_terms() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        rkf_assisted_reader.$rkf_reformulatable_terms$.setDynamicValue(set.new_set((SubLObject)rkf_assisted_reader.EQ, (SubLObject)rkf_assisted_reader.UNPROVIDED), thread);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rkf_assisted_reader.$sym303$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(rkf_assisted_reader.$rkf_ar_parsing_mt$.getDynamicValue(thread), thread);
            SubLObject cdolist_list_var;
            final SubLObject terms = cdolist_list_var = ConsesLow.nconc((SubLObject)rkf_assisted_reader.$list304, gt_methods.gt_all_inferiors(rkf_assisted_reader.$const305$genlFunctions, rkf_assisted_reader.$const306$NLTagFn, (SubLObject)rkf_assisted_reader.UNPROVIDED), isa.all_fort_instances(rkf_assisted_reader.$const307$NLUtteranceAttribute, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED));
            SubLObject v_term = (SubLObject)rkf_assisted_reader.NIL;
            v_term = cdolist_list_var.first();
            while (rkf_assisted_reader.NIL != cdolist_list_var) {
                set.set_add(v_term, rkf_assisted_reader.$rkf_reformulatable_terms$.getDynamicValue(thread));
                cdolist_list_var = cdolist_list_var.rest();
                v_term = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)rkf_assisted_reader.$kw308$INITIALIZED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 81275L)
    public static SubLObject rkf_ar_act_note_rejected_concepts(final SubLObject state, final SubLObject phrase, final SubLObject rejected_concepts) {
        SubLObject cdolist_list_var = rejected_concepts;
        SubLObject rejected_concept = (SubLObject)rkf_assisted_reader.NIL;
        rejected_concept = cdolist_list_var.first();
        while (rkf_assisted_reader.NIL != cdolist_list_var) {
            add_ar_phrase_rejected_concept(phrase, rejected_concept);
            remove_ar_phrase_concept(phrase, rejected_concept);
            cdolist_list_var = cdolist_list_var.rest();
            rejected_concept = cdolist_list_var.first();
        }
        final SubLObject concepts = ar_phrase_concepts(phrase);
        if (rkf_assisted_reader.NIL != list_utilities.singletonP(concepts)) {
            rem_ar_state_ambiguous_phrase(state, phrase);
            rkf_ar_act_note_assumed(state, phrase, concepts.first());
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 81914L)
    public static SubLObject rkf_ar_act_note_surrogate_replacement(final SubLObject state, final SubLObject phrase, final SubLObject replacement) {
        SubLObject cdolist_list_var = ar_phrase_surrogate(phrase);
        SubLObject surrogate = (SubLObject)rkf_assisted_reader.NIL;
        surrogate = cdolist_list_var.first();
        while (rkf_assisted_reader.NIL != cdolist_list_var) {
            rkf_ar_act_note_one_surrogate_replacement(state, phrase, replacement, surrogate);
            cdolist_list_var = cdolist_list_var.rest();
            surrogate = cdolist_list_var.first();
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 82231L)
    public static SubLObject rkf_ar_act_note_one_surrogate_replacement(final SubLObject state, final SubLObject phrase, final SubLObject replacement, final SubLObject surrogate) {
        final SubLObject surrogate_cycl = ar_concept_cycl(surrogate);
        final SubLObject replacement_cycl = ar_concept_cycl(replacement);
        SubLObject cdolist_list_var = ar_concept_agglomerations(surrogate);
        SubLObject agglomeration = (SubLObject)rkf_assisted_reader.NIL;
        agglomeration = cdolist_list_var.first();
        while (rkf_assisted_reader.NIL != cdolist_list_var) {
            rem_ar_concept_part(agglomeration, surrogate);
            rem_ar_concept_agglomeration(surrogate, agglomeration);
            add_ar_concept_part(agglomeration, replacement);
            add_ar_concept_agglomeration(replacement, agglomeration);
            rkf_ar_act_propagate_surrogate_replacement(state, replacement_cycl, surrogate_cycl, agglomeration);
            cdolist_list_var = cdolist_list_var.rest();
            agglomeration = cdolist_list_var.first();
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 82937L)
    public static SubLObject rkf_ar_act_propagate_surrogate_replacement(final SubLObject state, final SubLObject replacement_cycl, final SubLObject surrogate_cycl, final SubLObject agglomeration) {
        if (rkf_assisted_reader.NIL != list_utilities.tree_find(surrogate_cycl, replacement_cycl, (SubLObject)rkf_assisted_reader.EQUAL, (SubLObject)rkf_assisted_reader.UNPROVIDED)) {
            return state;
        }
        subst_ar_concept_cycl(agglomeration, replacement_cycl, surrogate_cycl);
        if (rkf_assisted_reader.NIL != subl_promotions.memberP(agglomeration, ar_state_pending_concepts(state), (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED) && rkf_assisted_reader.NIL == ar_concept_dependent_on_surrogate_p(agglomeration, (SubLObject)rkf_assisted_reader.UNPROVIDED)) {
            rem_ar_state_pending_concept(state, agglomeration);
            rkf_ar_act_note_accepted_concept(state, agglomeration, (SubLObject)rkf_assisted_reader.UNPROVIDED);
        }
        SubLObject cdolist_list_var = ar_concept_agglomerations(agglomeration);
        SubLObject super_agglomeration = (SubLObject)rkf_assisted_reader.NIL;
        super_agglomeration = cdolist_list_var.first();
        while (rkf_assisted_reader.NIL != cdolist_list_var) {
            rkf_ar_act_propagate_surrogate_replacement(state, replacement_cycl, surrogate_cycl, super_agglomeration);
            cdolist_list_var = cdolist_list_var.rest();
            super_agglomeration = cdolist_list_var.first();
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 83932L)
    public static SubLObject rkf_ar_with_additional_constraints(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_assisted_reader.$list309);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject constraints = (SubLObject)rkf_assisted_reader.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_assisted_reader.$list309);
        constraints = current.first();
        current = current.rest();
        if (rkf_assisted_reader.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)rkf_assisted_reader.$sym256$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)rkf_assisted_reader.$sym310$_RKF_AR_ADDITIONAL_CONSTRAINTS_, constraints)), ConsesLow.append(body, (SubLObject)rkf_assisted_reader.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_assisted_reader.$list309);
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 84096L)
    public static SubLObject rkf_ar_has_additional_constraintsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return rkf_assisted_reader.$rkf_ar_additional_constraints$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 84192L)
    public static SubLObject rkf_ar_act_note_accepted_concept(final SubLObject state, final SubLObject concept, SubLObject phrase) {
        if (phrase == rkf_assisted_reader.UNPROVIDED) {
            phrase = (SubLObject)rkf_assisted_reader.NIL;
        }
        final SubLObject force = (rkf_assisted_reader.NIL != phrase) ? ar_phrase_force(phrase) : ar_state_force(state);
        if (rkf_assisted_reader.NIL != rkf_ar_assertible_concept(concept, (SubLObject)rkf_assisted_reader.UNPROVIDED)) {
            note_ar_concept_force(concept, force);
        }
        final SubLObject concepts = rkf_ar_act_optimize_concept_cycl(state, concept);
        if (rkf_assisted_reader.NIL != list_utilities.singletonP(concepts)) {
            final SubLObject concept_$17 = concepts.first();
            final SubLObject cycl = ar_concept_cycl(concept_$17);
            final SubLObject existing = Sequences.find(cycl, ar_state_accepted_concepts(state), Symbols.symbol_function((SubLObject)rkf_assisted_reader.EQUAL), Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym124$AR_CONCEPT_CYCL), (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED);
            if (rkf_assisted_reader.NIL == existing) {
                add_ar_state_accepted_concept(state, concept_$17);
                note_ar_concept_force(concept_$17, force);
                final SubLObject cycl_$18 = ar_concept_cycl(concept_$17);
                if (rkf_assisted_reader.NIL != forts.fort_p(cycl_$18) && rkf_assisted_reader.NIL != kb_accessors.relationP(cycl_$18)) {
                    rkf_ar_act_add_template(state, concept_$17);
                }
                else {
                    rkf_ar_act_update_templates(state, concept_$17);
                }
                if (rkf_assisted_reader.NIL != rkf_ar_assertible_concept(concept_$17, (SubLObject)rkf_assisted_reader.UNPROVIDED) && rkf_assisted_reader.NIL != rkf_ar_concept_covers_entire_phraseP(state, concept_$17)) {
                    rkf_ar_act_note_candidate_cycl(state, concept_$17);
                }
            }
            return state;
        }
        final SubLObject phrase_$19 = ar_concept_phrases(concept).first();
        SubLObject cdolist_list_var = concepts;
        SubLObject newbie = (SubLObject)rkf_assisted_reader.NIL;
        newbie = cdolist_list_var.first();
        while (rkf_assisted_reader.NIL != cdolist_list_var) {
            if (!concept.eql(newbie)) {
                add_ar_phrase_concept(phrase_$19, newbie);
            }
            if (rkf_assisted_reader.NIL != rkf_ar_assertible_concept(newbie, (SubLObject)rkf_assisted_reader.UNPROVIDED)) {
                rkf_ar_act_note_candidate_cycl(state, newbie);
            }
            cdolist_list_var = cdolist_list_var.rest();
            newbie = cdolist_list_var.first();
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 86723L)
    public static SubLObject rkf_ar_concept_covers_entire_phraseP(final SubLObject state, final SubLObject concept) {
        final SubLObject first_phrase = ar_concept_phrases(concept).first();
        final SubLObject focus_sentence = ar_state_focus_sentence(state);
        if (rkf_assisted_reader.NIL == ar_phrase_p(first_phrase) || rkf_assisted_reader.NIL == ar_sentence_p(focus_sentence)) {
            return (SubLObject)rkf_assisted_reader.NIL;
        }
        return Equality.eq(Sequences.length(ar_phrase_token_list(first_phrase)), Sequences.length(ar_sentence_token_vector(focus_sentence)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 87246L)
    public static SubLObject rkf_ar_act_resolve_context_references(final SubLObject state, final SubLObject concept) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject resolved_cycl;
        final SubLObject original_cycl = resolved_cycl = ar_concept_cycl(concept);
        if (rkf_assisted_reader.NIL != el_utilities.el_formula_p(original_cycl)) {
            resolved_cycl = rkf_ar_resolve_context_references(state, resolved_cycl, rkf_assisted_reader.$rkf_ar_parsing_mt$.getDynamicValue(thread));
        }
        if (!resolved_cycl.equal(original_cycl)) {
            replace_ar_concept_cycl(concept, resolved_cycl);
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 87700L)
    public static SubLObject rkf_ar_act_optimize_concept_cycl(final SubLObject state, final SubLObject concept) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject optimized_cycl;
        final SubLObject original_cycl = optimized_cycl = ar_concept_cycl(concept);
        SubLObject concepts = (SubLObject)ConsesLow.list(concept);
        final SubLObject force = ar_concept_force(concept);
        if (rkf_assisted_reader.NIL != el_utilities.el_formula_p(original_cycl)) {
            if (rkf_assisted_reader.NIL != fort_types_interface.predicateP(cycl_utilities.formula_arg0(original_cycl))) {
                SubLObject optimizations = (force == rkf_assisted_reader.$kw110$QUESTION) ? rkf_formula_optimizer.rkf_reformulate_query_formula(optimized_cycl, rkf_assisted_reader.$rkf_ar_parsing_mt$.getDynamicValue(thread), rkf_assisted_reader.$rkf_ar_additional_constraints$.getDynamicValue(thread)) : rkf_formula_optimizer.rkf_reformulate_assert_formula(optimized_cycl, rkf_assisted_reader.$rkf_ar_parsing_mt$.getDynamicValue(thread), rkf_assisted_reader.$rkf_ar_additional_constraints$.getDynamicValue(thread));
                SubLObject doneP = (SubLObject)rkf_assisted_reader.NIL;
                while (rkf_assisted_reader.NIL == doneP) {
                    final SubLObject optimization = optimizations.first();
                    optimizations = optimizations.rest();
                    if (!optimization.equal(original_cycl)) {
                        replace_ar_concept_cycl(concept, optimization);
                        doneP = (SubLObject)rkf_assisted_reader.T;
                    }
                    else {
                        doneP = Types.sublisp_null(optimizations);
                    }
                }
                SubLObject cdolist_list_var = optimizations;
                SubLObject optimized = (SubLObject)rkf_assisted_reader.NIL;
                optimized = cdolist_list_var.first();
                while (rkf_assisted_reader.NIL != cdolist_list_var) {
                    final SubLObject new_concept = rkf_ar_act_clone_augment_concept(state, concept, optimized);
                    concepts = (SubLObject)ConsesLow.cons(new_concept, concepts);
                    cdolist_list_var = cdolist_list_var.rest();
                    optimized = cdolist_list_var.first();
                }
            }
            else {
                optimized_cycl = rkf_formula_optimizer.rkf_optimize_assert_formula(optimized_cycl, rkf_assisted_reader.$rkf_ar_parsing_mt$.getDynamicValue(thread));
                if (!optimized_cycl.equal(original_cycl)) {
                    replace_ar_concept_cycl(concept, optimized_cycl);
                }
            }
        }
        return concepts;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 89345L)
    public static SubLObject rkf_ar_act_instantiate_template(final SubLObject state, final SubLObject template, final SubLObject formula, final SubLObject parts) {
        final SubLObject agglomeration = new_ar_concept(state, formula);
        SubLObject cdolist_list_var = parts;
        SubLObject part = (SubLObject)rkf_assisted_reader.NIL;
        part = cdolist_list_var.first();
        while (rkf_assisted_reader.NIL != cdolist_list_var) {
            add_ar_concept_agglomeration(part, agglomeration);
            add_ar_concept_part(agglomeration, part);
            cdolist_list_var = cdolist_list_var.rest();
            part = cdolist_list_var.first();
        }
        add_ar_template_agglomeration(template, agglomeration);
        rkf_ar_act_note_accepted_concept(state, agglomeration, (SubLObject)rkf_assisted_reader.UNPROVIDED);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 89759L)
    public static SubLObject rkf_ar_act_add_template(final SubLObject state, final SubLObject concept) {
        final SubLObject template = new_ar_template(state, concept);
        final SubLObject relation = ar_concept_cycl(concept);
        if (arity.arity_min(relation).isInteger()) {
            final SubLObject formula = rkf_relation_template(relation);
            final SubLObject prompt = rkf_ar_formula_choice_template(formula);
            note_ar_template_formula(template, formula);
            note_ar_template_prompt(template, prompt);
            if (rkf_assisted_reader.NIL != fort_types_interface.functionP(relation)) {
                add_ar_state_term_template(state, template);
            }
            else {
                add_ar_state_assert_template(state, template);
            }
            rkf_ar_update_template_choices_for_template(state, template);
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 90460L)
    public static SubLObject rkf_ar_formula_choice_template(final SubLObject formula) {
        final SubLObject formatted_formula = rkf_concept_communicator.rkf_term_string(formula, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED);
        if (formatted_formula.isString()) {
            SubLObject choice_template = list_utilities.parse_to_list_of_strings(formatted_formula, (SubLObject)Characters.CHAR_colon, (SubLObject)Characters.CHAR_space);
            choice_template = transform_list_utilities.transform(choice_template, Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym311$KEYWORD_IMPOSTOR_P), Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym312$KEYWORD_FROM_IMPOSTOR), (SubLObject)rkf_assisted_reader.UNPROVIDED);
            return choice_template;
        }
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 90970L)
    public static SubLObject rkf_ar_act_update_templates(final SubLObject state, final SubLObject concept) {
        rkf_ar_update_template_choices_for_concept(state, concept);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 91225L)
    public static SubLObject rkf_ar_act_note_candidate_cycl(final SubLObject state, final SubLObject concept) {
        add_ar_state_candidate_cycl(state, concept);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 91374L)
    public static SubLObject rkf_ar_act_note_candidate_assertion(final SubLObject state, final SubLObject concept) {
        add_ar_state_candidate_assertion(state, concept);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 91508L)
    public static SubLObject rkf_ar_act_note_candidate_query(final SubLObject state, final SubLObject concept) {
        add_ar_state_candidate_query(state, concept);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 91634L)
    public static SubLObject rkf_ar_act_assert_concept(final SubLObject state, final SubLObject concept) {
        add_ar_state_asserted_assertion(state, concept);
        rem_ar_state_candidate_assertion(state, concept);
        rkf_ar_act_note_sentence_completed_and_refocus(state);
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 92011L)
    public static SubLObject rkf_ar_act_reject_assert_concept(final SubLObject state, final SubLObject concept) {
        rem_ar_state_candidate_assertion(state, concept);
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 92317L)
    public static SubLObject ar_pragmatic_relation_p(final SubLObject relation) {
        return subl_promotions.memberP(relation, rkf_assisted_reader.$ar_pragmatic_relations$.getGlobalValue(), (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 92421L)
    public static SubLObject ar_sentence_tokens_from_index_list(final SubLObject sentence, final SubLObject token_index_list) {
        final SubLObject token_vector = ar_sentence_token_vector(sentence);
        SubLObject token_list = (SubLObject)rkf_assisted_reader.NIL;
        SubLObject cdolist_list_var = token_index_list;
        SubLObject token_index = (SubLObject)rkf_assisted_reader.NIL;
        token_index = cdolist_list_var.first();
        while (rkf_assisted_reader.NIL != cdolist_list_var) {
            final SubLObject token = Vectors.aref(token_vector, token_index);
            token_list = (SubLObject)ConsesLow.cons(token, token_list);
            cdolist_list_var = cdolist_list_var.rest();
            token_index = cdolist_list_var.first();
        }
        token_list = Sequences.nreverse(token_list);
        return token_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 92776L)
    public static SubLObject rkf_ar_some_subsuming_phrase(final SubLObject phrase, final SubLObject other_phrases) {
        return Sequences.find(phrase, other_phrases, Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym314$RKF_AR_PHRASE_SUBSUMED), (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 92907L)
    public static SubLObject rkf_ar_phrase_subsumed(final SubLObject phrase, final SubLObject other_phrase) {
        final SubLObject phrase_token_list = ar_phrase_token_list(phrase);
        if (rkf_assisted_reader.NIL != phrase_token_list) {
            final SubLObject other_phrase_token_list = ar_phrase_token_list(other_phrase);
            if (rkf_assisted_reader.NIL != other_phrase_token_list) {
                return conses_high.subsetp(phrase_token_list, other_phrase_token_list, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED);
            }
        }
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 93232L)
    public static SubLObject rkf_ar_assertible_concept(final SubLObject concept, SubLObject mt) {
        if (mt == rkf_assisted_reader.UNPROVIDED) {
            mt = rkf_assisted_reader.$rkf_ar_parsing_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)rkf_assisted_reader.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            v_answer = rkf_ar_assertible_cycl(ar_concept_cycl(concept), mt);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 93455L)
    public static SubLObject rkf_ar_assertible_cycl(final SubLObject v_term, final SubLObject mt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_assisted_reader.NIL != el_utilities.el_formula_p(v_term) && rkf_assisted_reader.NIL != isa.isaP(cycl_utilities.formula_arg0(v_term), rkf_assisted_reader.$const315$TruthFunction, mt, (SubLObject)rkf_assisted_reader.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 93593L)
    public static SubLObject rkf_relation_template(final SubLObject relation) {
        return rkf_predicate_creator.generic_relation_template(relation);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 93689L)
    public static SubLObject rkf_ar_update_all_template_choices(final SubLObject state) {
        SubLObject cdolist_list_var = ar_state_term_templates(state);
        SubLObject template = (SubLObject)rkf_assisted_reader.NIL;
        template = cdolist_list_var.first();
        while (rkf_assisted_reader.NIL != cdolist_list_var) {
            rkf_ar_update_template_choices_for_template(state, template);
            cdolist_list_var = cdolist_list_var.rest();
            template = cdolist_list_var.first();
        }
        cdolist_list_var = ar_state_assert_templates(state);
        template = (SubLObject)rkf_assisted_reader.NIL;
        template = cdolist_list_var.first();
        while (rkf_assisted_reader.NIL != cdolist_list_var) {
            rkf_ar_update_template_choices_for_template(state, template);
            cdolist_list_var = cdolist_list_var.rest();
            template = cdolist_list_var.first();
        }
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 94170L)
    public static SubLObject rkf_ar_update_template_choices_for_template(final SubLObject state, final SubLObject template) {
        SubLObject cdolist_list_var = ar_state_accepted_concepts(state);
        SubLObject concept = (SubLObject)rkf_assisted_reader.NIL;
        concept = cdolist_list_var.first();
        while (rkf_assisted_reader.NIL != cdolist_list_var) {
            rkf_ar_update_template_choices_for_template_and_concept(state, template, concept);
            cdolist_list_var = cdolist_list_var.rest();
            concept = cdolist_list_var.first();
        }
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 94403L)
    public static SubLObject rkf_ar_update_template_choices_for_concept(final SubLObject state, final SubLObject concept) {
        SubLObject cdolist_list_var = ar_state_term_templates(state);
        SubLObject template = (SubLObject)rkf_assisted_reader.NIL;
        template = cdolist_list_var.first();
        while (rkf_assisted_reader.NIL != cdolist_list_var) {
            rkf_ar_update_template_choices_for_template_and_concept(state, template, concept);
            cdolist_list_var = cdolist_list_var.rest();
            template = cdolist_list_var.first();
        }
        cdolist_list_var = ar_state_assert_templates(state);
        template = (SubLObject)rkf_assisted_reader.NIL;
        template = cdolist_list_var.first();
        while (rkf_assisted_reader.NIL != cdolist_list_var) {
            rkf_ar_update_template_choices_for_template_and_concept(state, template, concept);
            cdolist_list_var = cdolist_list_var.rest();
            template = cdolist_list_var.first();
        }
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 94774L)
    public static SubLObject rkf_ar_update_template_choices_for_template_and_concept(final SubLObject state, final SubLObject template, final SubLObject concept) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject template_concept = ar_template_concept(template);
        final SubLObject relation = ar_concept_cycl(template_concept);
        final SubLObject v_arity = arity.min_arity(relation);
        final SubLObject old_choice_table = ar_template_choice_table(template);
        SubLObject new_choice_table = (SubLObject)rkf_assisted_reader.NIL;
        final SubLObject v_term = ar_concept_cycl(concept);
        SubLObject i;
        SubLObject arg;
        SubLObject arg_keyword;
        SubLObject assoc_list_for_arg;
        SubLObject choice_table_list_for_arg;
        for (i = (SubLObject)rkf_assisted_reader.NIL, i = (SubLObject)rkf_assisted_reader.ZERO_INTEGER; i.numL(v_arity); i = Numbers.add(i, (SubLObject)rkf_assisted_reader.ONE_INTEGER)) {
            arg = Numbers.add(i, (SubLObject)rkf_assisted_reader.ONE_INTEGER);
            arg_keyword = rkf_predicate_creator.generic_keyword_arg(arg);
            assoc_list_for_arg = conses_high.assoc(arg_keyword, old_choice_table, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED);
            choice_table_list_for_arg = (SubLObject)rkf_assisted_reader.NIL;
            if (assoc_list_for_arg.isCons()) {
                choice_table_list_for_arg = conses_high.second(assoc_list_for_arg);
            }
            if (rkf_assisted_reader.NIL != rkf_ar_ta_admitted_argument(v_term, arg, relation, rkf_assisted_reader.$rkf_ar_parsing_mt$.getDynamicValue(thread)) && rkf_assisted_reader.NIL == conses_high.member(concept, choice_table_list_for_arg, Symbols.symbol_function((SubLObject)rkf_assisted_reader.EQL), Symbols.symbol_function((SubLObject)rkf_assisted_reader.IDENTITY))) {
                choice_table_list_for_arg = (SubLObject)ConsesLow.cons(concept, choice_table_list_for_arg);
            }
            new_choice_table = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(arg_keyword, choice_table_list_for_arg), new_choice_table);
        }
        new_choice_table = Sequences.nreverse(new_choice_table);
        note_ar_template_choice_table(template, new_choice_table);
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 95862L)
    public static SubLObject rkf_ar_resolve_context_references(final SubLObject state, SubLObject cycl, SubLObject mt) {
        if (mt == rkf_assisted_reader.UNPROVIDED) {
            mt = rkf_assisted_reader.$rkf_ar_parsing_mt$.getDynamicValue();
        }
        SubLObject cdolist_list_var;
        final SubLObject context_references = cdolist_list_var = rkf_ar_gather_context_references(cycl);
        SubLObject context_reference = (SubLObject)rkf_assisted_reader.NIL;
        context_reference = cdolist_list_var.first();
        while (rkf_assisted_reader.NIL != cdolist_list_var) {
            final SubLObject referent = rkf_ar_resolve_one_context_reference(state, context_reference, mt);
            if (rkf_assisted_reader.NIL != referent) {
                cycl = conses_high.subst(referent, context_reference, cycl, Symbols.symbol_function((SubLObject)rkf_assisted_reader.EQUAL), (SubLObject)rkf_assisted_reader.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            context_reference = cdolist_list_var.first();
        }
        return cycl;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 96529L)
    public static SubLObject rkf_ar_context_reference_p(final SubLObject obj) {
        if (rkf_assisted_reader.NIL != el_utilities.el_formula_p(obj)) {
            final SubLObject operator = cycl_utilities.formula_operator(obj);
            if (rkf_assisted_reader.NIL != subl_promotions.memberP(operator, (SubLObject)rkf_assisted_reader.$list316, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED)) {
                final SubLObject constraint = cycl_utilities.formula_arg1(obj, (SubLObject)rkf_assisted_reader.UNPROVIDED);
                return (SubLObject)SubLObjectFactory.makeBoolean(rkf_assisted_reader.NIL == rkf_ar_contains_context_references(constraint));
            }
        }
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 97019L)
    public static SubLObject rkf_ar_contains_context_references(final SubLObject obj) {
        return list_utilities.tree_find_if(Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym317$RKF_AR_CONTEXT_REFERENCE_P), obj, (SubLObject)rkf_assisted_reader.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 97187L)
    public static SubLObject rkf_ar_gather_context_references(final SubLObject obj) {
        return list_utilities.tree_gather(obj, Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym317$RKF_AR_CONTEXT_REFERENCE_P), Symbols.symbol_function((SubLObject)rkf_assisted_reader.EQUAL), (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 97362L)
    public static SubLObject rkf_ar_resolve_one_context_reference(final SubLObject state, final SubLObject context_reference, SubLObject mt) {
        if (mt == rkf_assisted_reader.UNPROVIDED) {
            mt = rkf_assisted_reader.$rkf_ar_parsing_mt$.getDynamicValue();
        }
        final SubLObject pcase_var;
        final SubLObject operator = pcase_var = cycl_utilities.formula_operator(context_reference);
        if (pcase_var.eql(rkf_assisted_reader.$const318$TheSpec)) {
            return rkf_ar_resolve_the_spec_reference(state, context_reference, mt);
        }
        if (pcase_var.eql(rkf_assisted_reader.$const319$TheInstance)) {
            return rkf_ar_resolve_the_instance_reference(state, context_reference, mt);
        }
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 97825L)
    public static SubLObject rkf_ar_resolve_the_spec_reference(final SubLObject state, final SubLObject context_reference, SubLObject mt) {
        if (mt == rkf_assisted_reader.UNPROVIDED) {
            mt = rkf_assisted_reader.$rkf_ar_parsing_mt$.getDynamicValue();
        }
        final SubLObject col = cycl_utilities.formula_arg1(context_reference, (SubLObject)rkf_assisted_reader.UNPROVIDED);
        if (rkf_assisted_reader.NIL != forts.fort_p(col)) {
            SubLObject cdolist_list_var;
            final SubLObject accepted_concepts = cdolist_list_var = ar_state_accepted_concepts(state);
            SubLObject accepted_concept = (SubLObject)rkf_assisted_reader.NIL;
            accepted_concept = cdolist_list_var.first();
            while (rkf_assisted_reader.NIL != cdolist_list_var) {
                final SubLObject accepted_cycl = ar_concept_cycl(accepted_concept);
                if (rkf_assisted_reader.NIL != term.el_fort_p(accepted_cycl) && !accepted_cycl.equal(context_reference) && !accepted_cycl.equal(col) && rkf_assisted_reader.NIL != genls.genlsP(accepted_cycl, col, mt, (SubLObject)rkf_assisted_reader.UNPROVIDED)) {
                    return accepted_cycl;
                }
                cdolist_list_var = cdolist_list_var.rest();
                accepted_concept = cdolist_list_var.first();
            }
        }
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 98600L)
    public static SubLObject rkf_ar_resolve_the_instance_reference(final SubLObject state, final SubLObject context_reference, SubLObject mt) {
        if (mt == rkf_assisted_reader.UNPROVIDED) {
            mt = rkf_assisted_reader.$rkf_ar_parsing_mt$.getDynamicValue();
        }
        final SubLObject col = cycl_utilities.formula_arg1(context_reference, (SubLObject)rkf_assisted_reader.UNPROVIDED);
        if (rkf_assisted_reader.NIL != forts.fort_p(col)) {
            SubLObject cdolist_list_var;
            final SubLObject accepted_concepts = cdolist_list_var = ar_state_accepted_concepts(state);
            SubLObject accepted_concept = (SubLObject)rkf_assisted_reader.NIL;
            accepted_concept = cdolist_list_var.first();
            while (rkf_assisted_reader.NIL != cdolist_list_var) {
                final SubLObject accepted_cycl = ar_concept_cycl(accepted_concept);
                if (rkf_assisted_reader.NIL != term.el_fort_p(accepted_cycl) && !accepted_cycl.equal(context_reference) && rkf_assisted_reader.NIL != isa.isaP(accepted_cycl, col, mt, (SubLObject)rkf_assisted_reader.UNPROVIDED)) {
                    return accepted_cycl;
                }
                cdolist_list_var = cdolist_list_var.rest();
                accepted_concept = cdolist_list_var.first();
            }
        }
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 99329L)
    public static SubLObject rkf_ar_term_agglomerator(final SubLObject new_term, SubLObject old_terms, SubLObject mt) {
        if (old_terms == rkf_assisted_reader.UNPROVIDED) {
            old_terms = (SubLObject)rkf_assisted_reader.NIL;
        }
        if (mt == rkf_assisted_reader.UNPROVIDED) {
            mt = rkf_assisted_reader.$rkf_ar_parsing_mt$.getDynamicValue();
        }
        return rkf_ar_ta_internal(new_term, old_terms, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 99710L)
    public static SubLObject rkf_ar_ta_internal(final SubLObject new_term, final SubLObject old_terms, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject agglomerations = (SubLObject)rkf_assisted_reader.NIL;
        final SubLObject _prev_bind_0 = control_vars.$mapping_answer$.currentBinding(thread);
        try {
            control_vars.$mapping_answer$.bind((SubLObject)rkf_assisted_reader.NIL, thread);
            final SubLObject _prev_bind_0_$20 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
                if (rkf_assisted_reader.NIL == rkf_ar_assertible_cycl(new_term, mt) || rkf_assisted_reader.NIL == rkf_ar_ta_admitted_formula(new_term, mt)) {
                    if (rkf_assisted_reader.NIL != forts.fort_p(new_term) && rkf_assisted_reader.NIL != kb_accessors.relationP(new_term)) {
                        rkf_ar_ta_new_relation(new_term, old_terms, mt);
                    }
                    else {
                        SubLObject cdolist_list_var = old_terms;
                        SubLObject relation = (SubLObject)rkf_assisted_reader.NIL;
                        relation = cdolist_list_var.first();
                        while (rkf_assisted_reader.NIL != cdolist_list_var) {
                            if (rkf_assisted_reader.NIL != forts.fort_p(relation) && rkf_assisted_reader.NIL != kb_accessors.relationP(relation)) {
                                final SubLObject other_terms = Sequences.remove(relation, old_terms, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED);
                                rkf_ar_ta_new_term(relation, new_term, other_terms, mt);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            relation = cdolist_list_var.first();
                        }
                    }
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$20, thread);
            }
            agglomerations = Sequences.nreverse(conses_high.copy_tree(control_vars.$mapping_answer$.getDynamicValue(thread)));
        }
        finally {
            control_vars.$mapping_answer$.rebind(_prev_bind_0, thread);
        }
        return agglomerations;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 100754L)
    public static SubLObject rkf_ar_ta_new_relation(final SubLObject relation, final SubLObject old_terms, final SubLObject mt) {
        final SubLObject arg = relationship_generality_estimates.relation_most_restricted_arg(relation);
        if (rkf_assisted_reader.NIL != arg) {
            SubLObject cdolist_list_var = old_terms;
            SubLObject old_term = (SubLObject)rkf_assisted_reader.NIL;
            old_term = cdolist_list_var.first();
            while (rkf_assisted_reader.NIL != cdolist_list_var) {
                if (rkf_assisted_reader.NIL != rkf_ar_ta_admitted_argument(old_term, arg, relation, mt)) {
                    final SubLObject other_terms = Sequences.remove(old_term, old_terms, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED);
                    rkf_ar_ta_new_relation_arg(relation, arg, old_term, other_terms, mt);
                }
                cdolist_list_var = cdolist_list_var.rest();
                old_term = cdolist_list_var.first();
            }
        }
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 101194L)
    public static SubLObject rkf_ar_ta_new_term(final SubLObject relation, final SubLObject new_term, final SubLObject old_terms, final SubLObject mt) {
        SubLObject v_arity = arity.arity(relation);
        if (rkf_assisted_reader.NIL == v_arity) {
            v_arity = arity.min_arity(relation);
        }
        if (rkf_assisted_reader.NIL != v_arity) {
            SubLObject index;
            SubLObject arg;
            for (index = (SubLObject)rkf_assisted_reader.NIL, index = (SubLObject)rkf_assisted_reader.ZERO_INTEGER; index.numL(v_arity); index = Numbers.add(index, (SubLObject)rkf_assisted_reader.ONE_INTEGER)) {
                arg = Numbers.add(index, (SubLObject)rkf_assisted_reader.ONE_INTEGER);
                if (rkf_assisted_reader.NIL != rkf_ar_ta_admitted_argument(new_term, arg, relation, mt)) {
                    rkf_ar_ta_new_relation_arg(relation, arg, new_term, old_terms, mt);
                }
            }
        }
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 101660L)
    public static SubLObject rkf_ar_ta_new_relation_arg(final SubLObject relation, final SubLObject arg, final SubLObject v_term, final SubLObject other_terms, final SubLObject mt) {
        final SubLObject relation_arguments = relation_args_sorted_by_restriction(relation);
        final SubLObject other_args = Sequences.remove(arg, relation_arguments, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED);
        final SubLObject initial_assignments = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons(v_term, arg));
        rkf_ar_ta_assign_args_recursive(relation, other_terms, other_args, initial_assignments, mt);
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 102113L)
    public static SubLObject rkf_ar_ta_assign_args_recursive(final SubLObject relation, final SubLObject terms, final SubLObject args, final SubLObject assignments, final SubLObject mt) {
        if (rkf_assisted_reader.NIL == args) {
            rkf_ar_ta_answer(relation, assignments, mt);
        }
        else if (rkf_assisted_reader.NIL != terms) {
            final SubLObject next_arg = args.first();
            final SubLObject other_args = args.rest();
            SubLObject cdolist_list_var = terms;
            SubLObject v_term = (SubLObject)rkf_assisted_reader.NIL;
            v_term = cdolist_list_var.first();
            while (rkf_assisted_reader.NIL != cdolist_list_var) {
                if (rkf_assisted_reader.NIL != rkf_ar_ta_admitted_argument(v_term, next_arg, relation, mt)) {
                    final SubLObject assignment = (SubLObject)ConsesLow.cons(v_term, next_arg);
                    final SubLObject other_terms = Sequences.remove(v_term, terms, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED);
                    final SubLObject new_assignments = (SubLObject)ConsesLow.cons(assignment, assignments);
                    rkf_ar_ta_assign_args_recursive(relation, other_terms, other_args, new_assignments, mt);
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_term = cdolist_list_var.first();
            }
        }
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 103035L)
    public static SubLObject rkf_ar_ta_answer(final SubLObject relation, SubLObject assignments, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assignments = conses_high.copy_list(assignments);
        assignments = Sort.sort(assignments, Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym246$_), Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym320$CDR));
        final SubLObject formula_args = Mapping.mapcar(Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym321$CAR), assignments);
        final SubLObject formula = el_utilities.make_el_formula(relation, formula_args, (SubLObject)rkf_assisted_reader.UNPROVIDED);
        if (rkf_assisted_reader.NIL == list_utilities.tree_find(relation, formula_args, Symbols.symbol_function((SubLObject)rkf_assisted_reader.EQUAL), (SubLObject)rkf_assisted_reader.UNPROVIDED) && rkf_assisted_reader.NIL != rkf_ar_ta_admitted_formula(formula, mt)) {
            control_vars.$mapping_answer$.setDynamicValue((SubLObject)ConsesLow.cons(formula, control_vars.$mapping_answer$.getDynamicValue(thread)), thread);
        }
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 103653L)
    public static SubLObject rkf_ar_ta_admitted_argument(final SubLObject v_term, final SubLObject arg, final SubLObject relation, final SubLObject mt) {
        return removal_modules_admitted_formula.inference_admitted_argument(v_term, arg, relation, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 103884L)
    public static SubLObject rkf_ar_ta_admitted_formula(final SubLObject formula, final SubLObject mt) {
        return removal_modules_admitted_formula.inference_admitted_formula(formula, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 104061L)
    public static SubLObject clear_relation_args_sorted_by_restriction() {
        final SubLObject cs = rkf_assisted_reader.$relation_args_sorted_by_restriction_caching_state$.getGlobalValue();
        if (rkf_assisted_reader.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 104061L)
    public static SubLObject remove_relation_args_sorted_by_restriction(final SubLObject relation) {
        return memoization_state.caching_state_remove_function_results_with_args(rkf_assisted_reader.$relation_args_sorted_by_restriction_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(relation), (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 104061L)
    public static SubLObject relation_args_sorted_by_restriction_internal(final SubLObject relation) {
        final SubLObject args = all_relation_args(relation);
        SubLObject arg_pairs = (SubLObject)rkf_assisted_reader.NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = (SubLObject)rkf_assisted_reader.NIL;
        arg = cdolist_list_var.first();
        while (rkf_assisted_reader.NIL != cdolist_list_var) {
            final SubLObject arg_generality = relationship_generality_estimates.relation_arg_cardinality(relation, arg, (SubLObject)rkf_assisted_reader.UNPROVIDED);
            arg_pairs = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(arg, arg_generality), arg_pairs);
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        arg_pairs = Sort.sort(arg_pairs, Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym246$_), Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym323$SECOND));
        SubLObject rest_arg_pairs;
        for (rest_arg_pairs = (SubLObject)rkf_assisted_reader.NIL, rest_arg_pairs = arg_pairs; !rest_arg_pairs.isAtom(); rest_arg_pairs = rest_arg_pairs.rest()) {
            ConsesLow.rplaca(rest_arg_pairs, conses_high.caar(rest_arg_pairs));
        }
        return arg_pairs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 104061L)
    public static SubLObject relation_args_sorted_by_restriction(final SubLObject relation) {
        SubLObject caching_state = rkf_assisted_reader.$relation_args_sorted_by_restriction_caching_state$.getGlobalValue();
        if (rkf_assisted_reader.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rkf_assisted_reader.$sym322$RELATION_ARGS_SORTED_BY_RESTRICTION, (SubLObject)rkf_assisted_reader.$sym324$_RELATION_ARGS_SORTED_BY_RESTRICTION_CACHING_STATE_, (SubLObject)rkf_assisted_reader.$int325$64, (SubLObject)rkf_assisted_reader.EQL, (SubLObject)rkf_assisted_reader.ONE_INTEGER, (SubLObject)rkf_assisted_reader.TEN_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, relation, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(relation_args_sorted_by_restriction_internal(relation)));
            memoization_state.caching_state_put(caching_state, relation, results, (SubLObject)rkf_assisted_reader.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 104624L)
    public static SubLObject clear_all_relation_args() {
        final SubLObject cs = rkf_assisted_reader.$all_relation_args_caching_state$.getGlobalValue();
        if (rkf_assisted_reader.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 104624L)
    public static SubLObject remove_all_relation_args(final SubLObject relation) {
        return memoization_state.caching_state_remove_function_results_with_args(rkf_assisted_reader.$all_relation_args_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(relation), (SubLObject)rkf_assisted_reader.UNPROVIDED, (SubLObject)rkf_assisted_reader.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 104624L)
    public static SubLObject all_relation_args_internal(final SubLObject relation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)rkf_assisted_reader.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rkf_assisted_reader.$sym327$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(rkf_assisted_reader.$const328$EverythingPSC, thread);
            SubLObject v_arity = arity.arity(relation);
            if (rkf_assisted_reader.NIL == v_arity) {
                v_arity = arity.min_arity(relation);
            }
            if (rkf_assisted_reader.NIL != v_arity) {
                SubLObject i;
                for (i = (SubLObject)rkf_assisted_reader.NIL, i = (SubLObject)rkf_assisted_reader.ZERO_INTEGER; i.numL(v_arity); i = Numbers.add(i, (SubLObject)rkf_assisted_reader.ONE_INTEGER)) {
                    v_answer = (SubLObject)ConsesLow.cons(Numbers.add(i, (SubLObject)rkf_assisted_reader.ONE_INTEGER), v_answer);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(v_answer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-assisted-reader.lisp", position = 104624L)
    public static SubLObject all_relation_args(final SubLObject relation) {
        SubLObject caching_state = rkf_assisted_reader.$all_relation_args_caching_state$.getGlobalValue();
        if (rkf_assisted_reader.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rkf_assisted_reader.$sym326$ALL_RELATION_ARGS, (SubLObject)rkf_assisted_reader.$sym329$_ALL_RELATION_ARGS_CACHING_STATE_, (SubLObject)rkf_assisted_reader.$int325$64, (SubLObject)rkf_assisted_reader.EQL, (SubLObject)rkf_assisted_reader.ONE_INTEGER, (SubLObject)rkf_assisted_reader.TEN_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, relation, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(all_relation_args_internal(relation)));
            memoization_state.caching_state_put(caching_state, relation, results, (SubLObject)rkf_assisted_reader.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    public static SubLObject declare_rkf_assisted_reader_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.rkf_assisted_reader", "with_ar_lock", "WITH-AR-LOCK");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_sentence_print_function_trampoline", "AR-SENTENCE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_sentence_p", "AR-SENTENCE-P", 1, 0, false);
        new $ar_sentence_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_sentence_id", "AR-SENTENCE-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_sentence_plaintext", "AR-SENTENCE-PLAINTEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_sentence_token_vector", "AR-SENTENCE-TOKEN-VECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_sentence_clarifications", "AR-SENTENCE-CLARIFICATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_sentence_source_sentence", "AR-SENTENCE-SOURCE-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_sentence_phrases", "AR-SENTENCE-PHRASES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_sentence_id", "_CSETF-AR-SENTENCE-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_sentence_plaintext", "_CSETF-AR-SENTENCE-PLAINTEXT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_sentence_token_vector", "_CSETF-AR-SENTENCE-TOKEN-VECTOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_sentence_clarifications", "_CSETF-AR-SENTENCE-CLARIFICATIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_sentence_source_sentence", "_CSETF-AR-SENTENCE-SOURCE-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_sentence_phrases", "_CSETF-AR-SENTENCE-PHRASES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "make_ar_sentence", "MAKE-AR-SENTENCE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "visit_defstruct_ar_sentence", "VISIT-DEFSTRUCT-AR-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "visit_defstruct_object_ar_sentence_method", "VISIT-DEFSTRUCT-OBJECT-AR-SENTENCE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "sxhash_ar_sentence_method", "SXHASH-AR-SENTENCE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "new_ar_sentence", "NEW-AR-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "note_ar_sentence_token_vector", "NOTE-AR-SENTENCE-TOKEN-VECTOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "add_ar_sentence_phrase", "ADD-AR-SENTENCE-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "add_ar_sentence_clarification", "ADD-AR-SENTENCE-CLARIFICATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "note_ar_sentence_source_sentence", "NOTE-AR-SENTENCE-SOURCE-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_token_print_function_trampoline", "AR-TOKEN-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_token_p", "AR-TOKEN-P", 1, 0, false);
        new $ar_token_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_token_id", "AR-TOKEN-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_token_text", "AR-TOKEN-TEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_token_sentence", "AR-TOKEN-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_token_number", "AR-TOKEN-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_token_phrases", "AR-TOKEN-PHRASES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_token_id", "_CSETF-AR-TOKEN-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_token_text", "_CSETF-AR-TOKEN-TEXT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_token_sentence", "_CSETF-AR-TOKEN-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_token_number", "_CSETF-AR-TOKEN-NUMBER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_token_phrases", "_CSETF-AR-TOKEN-PHRASES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "make_ar_token", "MAKE-AR-TOKEN", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "visit_defstruct_ar_token", "VISIT-DEFSTRUCT-AR-TOKEN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "visit_defstruct_object_ar_token_method", "VISIT-DEFSTRUCT-OBJECT-AR-TOKEN-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "print_ar_token", "PRINT-AR-TOKEN", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "sxhash_ar_token_method", "SXHASH-AR-TOKEN-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "new_ar_token", "NEW-AR-TOKEN", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "add_ar_token_phrase", "ADD-AR-TOKEN-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_phrase_print_function_trampoline", "AR-PHRASE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_phrase_p", "AR-PHRASE-P", 1, 0, false);
        new $ar_phrase_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_phrase_id", "AR-PHRASE-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_phrase_status", "AR-PHRASE-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_phrase_token_list", "AR-PHRASE-TOKEN-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_phrase_sentence", "AR-PHRASE-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_phrase_concepts", "AR-PHRASE-CONCEPTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_phrase_rejected_concepts", "AR-PHRASE-REJECTED-CONCEPTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_phrase_disambiguated_concept", "AR-PHRASE-DISAMBIGUATED-CONCEPT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_phrase_surrogate", "AR-PHRASE-SURROGATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_phrase_constraint", "AR-PHRASE-CONSTRAINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_phrase_force", "AR-PHRASE-FORCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_phrase_id", "_CSETF-AR-PHRASE-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_phrase_status", "_CSETF-AR-PHRASE-STATUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_phrase_token_list", "_CSETF-AR-PHRASE-TOKEN-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_phrase_sentence", "_CSETF-AR-PHRASE-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_phrase_concepts", "_CSETF-AR-PHRASE-CONCEPTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_phrase_rejected_concepts", "_CSETF-AR-PHRASE-REJECTED-CONCEPTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_phrase_disambiguated_concept", "_CSETF-AR-PHRASE-DISAMBIGUATED-CONCEPT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_phrase_surrogate", "_CSETF-AR-PHRASE-SURROGATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_phrase_constraint", "_CSETF-AR-PHRASE-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_phrase_force", "_CSETF-AR-PHRASE-FORCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "make_ar_phrase", "MAKE-AR-PHRASE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "visit_defstruct_ar_phrase", "VISIT-DEFSTRUCT-AR-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "visit_defstruct_object_ar_phrase_method", "VISIT-DEFSTRUCT-OBJECT-AR-PHRASE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "print_ar_phrase", "PRINT-AR-PHRASE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "sxhash_ar_phrase_method", "SXHASH-AR-PHRASE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "new_ar_phrase", "NEW-AR-PHRASE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "add_ar_phrase_concept", "ADD-AR-PHRASE-CONCEPT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "remove_ar_phrase_concept", "REMOVE-AR-PHRASE-CONCEPT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "add_ar_phrase_rejected_concept", "ADD-AR-PHRASE-REJECTED-CONCEPT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "clear_ar_phrase_disambiguated_concept", "CLEAR-AR-PHRASE-DISAMBIGUATED-CONCEPT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "note_ar_phrase_disambiguated_concept", "NOTE-AR-PHRASE-DISAMBIGUATED-CONCEPT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "note_ar_phrase_status", "NOTE-AR-PHRASE-STATUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "note_ar_phrase_force", "NOTE-AR-PHRASE-FORCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "note_ar_phrase_surrogate", "NOTE-AR-PHRASE-SURROGATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "note_ar_phrase_constraint", "NOTE-AR-PHRASE-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "compute_ar_phrase_force", "COMPUTE-AR-PHRASE-FORCE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_phrase_has_non_surrogate_conceptsP", "AR-PHRASE-HAS-NON-SURROGATE-CONCEPTS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_phrase_token_count", "AR-PHRASE-TOKEN-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_concept_print_function_trampoline", "AR-CONCEPT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_concept_p", "AR-CONCEPT-P", 1, 0, false);
        new $ar_concept_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_concept_id", "AR-CONCEPT-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_concept_cycl", "AR-CONCEPT-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_concept_disambiguation_text", "AR-CONCEPT-DISAMBIGUATION-TEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_concept_phrases", "AR-CONCEPT-PHRASES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_concept_parts", "AR-CONCEPT-PARTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_concept_agglomerations", "AR-CONCEPT-AGGLOMERATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_concept_force", "AR-CONCEPT-FORCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_concept_confidence", "AR-CONCEPT-CONFIDENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_concept_open_term_score", "AR-CONCEPT-OPEN-TERM-SCORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_concept_id", "_CSETF-AR-CONCEPT-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_concept_cycl", "_CSETF-AR-CONCEPT-CYCL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_concept_disambiguation_text", "_CSETF-AR-CONCEPT-DISAMBIGUATION-TEXT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_concept_phrases", "_CSETF-AR-CONCEPT-PHRASES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_concept_parts", "_CSETF-AR-CONCEPT-PARTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_concept_agglomerations", "_CSETF-AR-CONCEPT-AGGLOMERATIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_concept_force", "_CSETF-AR-CONCEPT-FORCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_concept_confidence", "_CSETF-AR-CONCEPT-CONFIDENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_concept_open_term_score", "_CSETF-AR-CONCEPT-OPEN-TERM-SCORE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "make_ar_concept", "MAKE-AR-CONCEPT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "visit_defstruct_ar_concept", "VISIT-DEFSTRUCT-AR-CONCEPT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "visit_defstruct_object_ar_concept_method", "VISIT-DEFSTRUCT-OBJECT-AR-CONCEPT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "print_ar_concept", "PRINT-AR-CONCEPT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "sxhash_ar_concept_method", "SXHASH-AR-CONCEPT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "new_ar_concept", "NEW-AR-CONCEPT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "clone_ar_concept", "CLONE-AR-CONCEPT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_clone_augment_concept", "RKF-AR-ACT-CLONE-AUGMENT-CONCEPT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "add_ar_concept_phrase", "ADD-AR-CONCEPT-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "add_ar_concept_part", "ADD-AR-CONCEPT-PART", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rem_ar_concept_part", "REM-AR-CONCEPT-PART", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "add_ar_concept_agglomeration", "ADD-AR-CONCEPT-AGGLOMERATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rem_ar_concept_agglomeration", "REM-AR-CONCEPT-AGGLOMERATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "note_ar_concept_disambiguation_text", "NOTE-AR-CONCEPT-DISAMBIGUATION-TEXT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "replace_ar_concept_cycl", "REPLACE-AR-CONCEPT-CYCL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "subst_ar_concept_cycl", "SUBST-AR-CONCEPT-CYCL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "note_ar_concept_force", "NOTE-AR-CONCEPT-FORCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_concept_queryP", "AR-CONCEPT-QUERY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_concept_assertionP", "AR-CONCEPT-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "note_ar_concept_confidence", "NOTE-AR-CONCEPT-CONFIDENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "note_ar_concept_open_term_score", "NOTE-AR-CONCEPT-OPEN-TERM-SCORE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_template_print_function_trampoline", "AR-TEMPLATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_template_p", "AR-TEMPLATE-P", 1, 0, false);
        new $ar_template_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_template_id", "AR-TEMPLATE-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_template_concept", "AR-TEMPLATE-CONCEPT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_template_formula", "AR-TEMPLATE-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_template_prompt", "AR-TEMPLATE-PROMPT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_template_choice_table", "AR-TEMPLATE-CHOICE-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_template_agglomerations", "AR-TEMPLATE-AGGLOMERATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_template_id", "_CSETF-AR-TEMPLATE-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_template_concept", "_CSETF-AR-TEMPLATE-CONCEPT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_template_formula", "_CSETF-AR-TEMPLATE-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_template_prompt", "_CSETF-AR-TEMPLATE-PROMPT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_template_choice_table", "_CSETF-AR-TEMPLATE-CHOICE-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_template_agglomerations", "_CSETF-AR-TEMPLATE-AGGLOMERATIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "make_ar_template", "MAKE-AR-TEMPLATE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "visit_defstruct_ar_template", "VISIT-DEFSTRUCT-AR-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "visit_defstruct_object_ar_template_method", "VISIT-DEFSTRUCT-OBJECT-AR-TEMPLATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "sxhash_ar_template_method", "SXHASH-AR-TEMPLATE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "new_ar_template", "NEW-AR-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "note_ar_template_formula", "NOTE-AR-TEMPLATE-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "note_ar_template_prompt", "NOTE-AR-TEMPLATE-PROMPT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "note_ar_template_choice_table", "NOTE-AR-TEMPLATE-CHOICE-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "add_ar_template_agglomeration", "ADD-AR-TEMPLATE-AGGLOMERATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_state_print_function_trampoline", "AR-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_state_p", "AR-STATE-P", 1, 0, false);
        new $ar_state_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_state_isg", "AR-STATE-ISG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_state_index", "AR-STATE-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_state_source_sentences", "AR-STATE-SOURCE-SENTENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_state_focus_sentence", "AR-STATE-FOCUS-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_state_completed_sentences", "AR-STATE-COMPLETED-SENTENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_state_unknown_phrases", "AR-STATE-UNKNOWN-PHRASES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_state_rejected_phrases", "AR-STATE-REJECTED-PHRASES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_state_irrelevant_phrases", "AR-STATE-IRRELEVANT-PHRASES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_state_ambiguous_phrases", "AR-STATE-AMBIGUOUS-PHRASES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_state_assumed_phrases", "AR-STATE-ASSUMED-PHRASES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_state_pending_phrases", "AR-STATE-PENDING-PHRASES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_state_accepted_phrases", "AR-STATE-ACCEPTED-PHRASES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_state_pending_concepts", "AR-STATE-PENDING-CONCEPTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_state_accepted_concepts", "AR-STATE-ACCEPTED-CONCEPTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_state_candidate_cycls", "AR-STATE-CANDIDATE-CYCLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_state_asserted_assertions", "AR-STATE-ASSERTED-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_state_term_templates", "AR-STATE-TERM-TEMPLATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_state_assert_templates", "AR-STATE-ASSERT-TEMPLATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_state_isg", "_CSETF-AR-STATE-ISG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_state_index", "_CSETF-AR-STATE-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_state_source_sentences", "_CSETF-AR-STATE-SOURCE-SENTENCES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_state_focus_sentence", "_CSETF-AR-STATE-FOCUS-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_state_completed_sentences", "_CSETF-AR-STATE-COMPLETED-SENTENCES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_state_unknown_phrases", "_CSETF-AR-STATE-UNKNOWN-PHRASES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_state_rejected_phrases", "_CSETF-AR-STATE-REJECTED-PHRASES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_state_irrelevant_phrases", "_CSETF-AR-STATE-IRRELEVANT-PHRASES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_state_ambiguous_phrases", "_CSETF-AR-STATE-AMBIGUOUS-PHRASES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_state_assumed_phrases", "_CSETF-AR-STATE-ASSUMED-PHRASES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_state_pending_phrases", "_CSETF-AR-STATE-PENDING-PHRASES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_state_accepted_phrases", "_CSETF-AR-STATE-ACCEPTED-PHRASES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_state_pending_concepts", "_CSETF-AR-STATE-PENDING-CONCEPTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_state_accepted_concepts", "_CSETF-AR-STATE-ACCEPTED-CONCEPTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_state_candidate_cycls", "_CSETF-AR-STATE-CANDIDATE-CYCLS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_state_asserted_assertions", "_CSETF-AR-STATE-ASSERTED-ASSERTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_state_term_templates", "_CSETF-AR-STATE-TERM-TEMPLATES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "_csetf_ar_state_assert_templates", "_CSETF-AR-STATE-ASSERT-TEMPLATES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "make_ar_state", "MAKE-AR-STATE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "visit_defstruct_ar_state", "VISIT-DEFSTRUCT-AR-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "visit_defstruct_object_ar_state_method", "VISIT-DEFSTRUCT-OBJECT-AR-STATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "new_ar_state", "NEW-AR-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_reset", "AR-RESET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "next_ar_state_id", "NEXT-AR-STATE-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "add_ar_object_index", "ADD-AR-OBJECT-INDEX", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "find_ar_object", "FIND-AR-OBJECT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "find_ar_sentence", "FIND-AR-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "find_ar_token", "FIND-AR-TOKEN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "find_ar_phrase", "FIND-AR-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "find_ar_concept", "FIND-AR-CONCEPT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "find_ar_template", "FIND-AR-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "add_ar_state_source_sentence", "ADD-AR-STATE-SOURCE-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "clear_ar_state_focus_sentence", "CLEAR-AR-STATE-FOCUS-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "note_ar_state_focus_sentence", "NOTE-AR-STATE-FOCUS-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_state_force", "AR-STATE-FORCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_phrase_span_lengthG", "AR-PHRASE-SPAN-LENGTH>", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "add_ar_state_completed_sentence", "ADD-AR-STATE-COMPLETED-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "add_ar_state_unknown_phrase", "ADD-AR-STATE-UNKNOWN-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rem_ar_state_unknown_phrase", "REM-AR-STATE-UNKNOWN-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "add_ar_state_rejected_phrase", "ADD-AR-STATE-REJECTED-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rem_ar_state_rejected_phrase", "REM-AR-STATE-REJECTED-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "add_ar_state_irrelevant_phrase", "ADD-AR-STATE-IRRELEVANT-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rem_ar_state_irrelevant_phrase", "REM-AR-STATE-IRRELEVANT-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "add_ar_state_ambiguous_phrase", "ADD-AR-STATE-AMBIGUOUS-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rem_ar_state_ambiguous_phrase", "REM-AR-STATE-AMBIGUOUS-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "add_ar_state_assumed_phrase", "ADD-AR-STATE-ASSUMED-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rem_ar_state_assumed_phrase", "REM-AR-STATE-ASSUMED-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "add_ar_state_pending_phrase", "ADD-AR-STATE-PENDING-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rem_ar_state_pending_phrase", "REM-AR-STATE-PENDING-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "add_ar_state_accepted_phrase", "ADD-AR-STATE-ACCEPTED-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rem_ar_state_accepted_phrase", "REM-AR-STATE-ACCEPTED-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "add_ar_state_accepted_concept", "ADD-AR-STATE-ACCEPTED-CONCEPT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rem_ar_state_accepted_concept", "REM-AR-STATE-ACCEPTED-CONCEPT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "add_ar_state_pending_concept", "ADD-AR-STATE-PENDING-CONCEPT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rem_ar_state_pending_concept", "REM-AR-STATE-PENDING-CONCEPT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_state_candidate_assertions", "AR-STATE-CANDIDATE-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_state_candidate_queries", "AR-STATE-CANDIDATE-QUERIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "add_ar_state_candidate_cycl", "ADD-AR-STATE-CANDIDATE-CYCL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "add_ar_state_candidate_assertion", "ADD-AR-STATE-CANDIDATE-ASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "add_ar_state_candidate_query", "ADD-AR-STATE-CANDIDATE-QUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rem_ar_state_candidate_assertion", "REM-AR-STATE-CANDIDATE-ASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rem_ar_state_candidate_query", "REM-AR-STATE-CANDIDATE-QUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "add_ar_state_asserted_assertion", "ADD-AR-STATE-ASSERTED-ASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rem_ar_state_asserted_assertion", "REM-AR-STATE-ASSERTED-ASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "add_ar_state_term_template", "ADD-AR-STATE-TERM-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rem_ar_state_term_template", "REM-AR-STATE-TERM-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "add_ar_state_assert_template", "ADD-AR-STATE-ASSERT-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rem_ar_state_assert_template", "REM-AR-STATE-ASSERT-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_state_top_level_parsesP", "AR-STATE-TOP-LEVEL-PARSES?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_sentence_completed_p", "AR-SENTENCE-COMPLETED-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_source_sentence_p", "AR-SOURCE-SENTENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_clarification_sentence_p", "AR-CLARIFICATION-SENTENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_source_sentence_number", "AR-SOURCE-SENTENCE-NUMBER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_clarification_sentence_number", "AR-CLARIFICATION-SENTENCE-NUMBER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_determine_source_sentence", "AR-DETERMINE-SOURCE-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_determine_concept_sentences", "AR-DETERMINE-CONCEPT-SENTENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_determine_concept_sentences_recursive", "AR-DETERMINE-CONCEPT-SENTENCES-RECURSIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_sentence_assumed_phrase_count", "AR-SENTENCE-ASSUMED-PHRASE-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_state_next_assumed_phrase", "AR-STATE-NEXT-ASSUMED-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_state_next_unknown_phrase", "AR-STATE-NEXT-UNKNOWN-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_state_select_most_promising_unknown_phrase", "AR-STATE-SELECT-MOST-PROMISING-UNKNOWN-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_state_pending_implied_indexicals", "AR-STATE-PENDING-IMPLIED-INDEXICALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_state_next_implied_indexical", "AR-STATE-NEXT-IMPLIED-INDEXICAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_sentence_ambiguous_phrase_count", "AR-SENTENCE-AMBIGUOUS-PHRASE-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_state_next_ambiguous_phrase", "AR-STATE-NEXT-AMBIGUOUS-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_sentence_candidate_assertion_count", "AR-SENTENCE-CANDIDATE-ASSERTION-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_sentence_candidate_query_count", "AR-SENTENCE-CANDIDATE-QUERY-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_sentence_asserted_assertion_count", "AR-SENTENCE-ASSERTED-ASSERTION-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_state_determine_focus_sentence", "AR-STATE-DETERMINE-FOCUS-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_surrogate_concept_p", "AR-SURROGATE-CONCEPT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_concept_dependent_on_surrogate_p", "AR-CONCEPT-DEPENDENT-ON-SURROGATE-P", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "current_ar_concept_grounding_map", "CURRENT-AR-CONCEPT-GROUNDING-MAP", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ensure_ar_concept_grounding_map", "ENSURE-AR-CONCEPT-GROUNDING-MAP", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.rkf_assisted_reader", "with_new_ar_concept_grounding_map", "WITH-NEW-AR-CONCEPT-GROUNDING-MAP");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_concept_grounding_computedP", "AR-CONCEPT-GROUNDING-COMPUTED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_concept_grounding_groundedP", "AR-CONCEPT-GROUNDING-GROUNDED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_concept_grounding_ungroundedP", "AR-CONCEPT-GROUNDING-UNGROUNDED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_concept_grounding_in_progressP", "AR-CONCEPT-GROUNDING-IN-PROGRESS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_concept_grounding_map_mark", "AR-CONCEPT-GROUNDING-MAP-MARK", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_concept_dependent_on_ungrounded_surrogate_p", "AR-CONCEPT-DEPENDENT-ON-UNGROUNDED-SURROGATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_concept_dependent_on_ungrounded_surrogate_count", "AR-CONCEPT-DEPENDENT-ON-UNGROUNDED-SURROGATE-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_phrase_dependent_on_ungrounded_surrogate_p", "AR-PHRASE-DEPENDENT-ON-UNGROUNDED-SURROGATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_phrase_divide_eq_best_lambda_substitute", "AR-PHRASE-DIVIDE-EQ-BEST-LAMBDA-SUBSTITUTE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_phrase_divide_concepts", "AR-PHRASE-DIVIDE-CONCEPTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_concept_separate_out_forts", "AR-CONCEPT-SEPARATE-OUT-FORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_concept_complexity", "AR-CONCEPT-COMPLEXITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_formula_complexity", "AR-FORMULA-COMPLEXITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_phrase_constraints_for_unknown", "AR-PHRASE-CONSTRAINTS-FOR-UNKNOWN", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_add_source_texts_background", "RKF-AR-ACT-ADD-SOURCE-TEXTS-BACKGROUND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_add_source_texts_background_internal", "RKF-AR-ACT-ADD-SOURCE-TEXTS-BACKGROUND-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_add_source_texts", "RKF-AR-ACT-ADD-SOURCE-TEXTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_add_rewrite_texts_background", "RKF-AR-ACT-ADD-REWRITE-TEXTS-BACKGROUND", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_add_rewrite_texts_background_internal", "RKF-AR-ACT-ADD-REWRITE-TEXTS-BACKGROUND-INTERNAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_add_rewrite_texts", "RKF-AR-ACT-ADD-REWRITE-TEXTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_add_source_text", "RKF-AR-ACT-ADD-SOURCE-TEXT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_add_rewrite_text", "RKF-AR-ACT-ADD-REWRITE-TEXT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_add_clarification", "RKF-AR-ACT-ADD-CLARIFICATION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_select_processing_method", "RKF-AR-SELECT-PROCESSING-METHOD", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_process_input_sentence", "RKF-AR-ACT-PROCESS-INPUT-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_template_category_for_processor", "RKF-AR-TEMPLATE-CATEGORY-FOR-PROCESSOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_add_text", "RKF-AR-ACT-ADD-TEXT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_set_open_term_scores", "RKF-AR-SET-OPEN-TERM-SCORES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_reset_open_term_counts_for_sentence", "RKF-AR-RESET-OPEN-TERM-COUNTS-FOR-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_concept_check_trivial_differences", "RKF-AR-CONCEPT-CHECK-TRIVIAL-DIFFERENCES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_mask_trivial_differences", "RKF-AR-MASK-TRIVIAL-DIFFERENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_harvest_for_phrases_and_concepts", "RKF-AR-HARVEST-FOR-PHRASES-AND-CONCEPTS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_transform_unknown_instances", "RKF-AR-TRANSFORM-UNKNOWN-INSTANCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_log_parsing_event", "RKF-AR-LOG-PARSING-EVENT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_rank_parses", "RKF-AR-RANK-PARSES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_concept_is_surrogateP", "AR-CONCEPT-IS-SURROGATE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_add_any_surrogates", "RKF-AR-ADD-ANY-SURROGATES", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_locate_appropriate_phrase", "RKF-AR-LOCATE-APPROPRIATE-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_check_for_existing_surrogate", "RKF-AR-CHECK-FOR-EXISTING-SURROGATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_update_surrogates", "RKF-AR-UPDATE-SURROGATES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_add_surrogate_sans_children", "RKF-AR-ADD-SURROGATE-SANS-CHILDREN", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_focus_sentence", "RKF-AR-ACT-FOCUS-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_ensure_focus_sentence", "RKF-AR-ENSURE-FOCUS-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_augment_sentence", "RKF-AR-ACT-AUGMENT-SENTENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_complete_augmentation", "RKF-AR-ACT-COMPLETE-AUGMENTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_find_concept", "RKF-AR-ACT-FIND-CONCEPT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_augment_phrase", "RKF-AR-ACT-AUGMENT-PHRASE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_add_phrase", "RKF-AR-ACT-ADD-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_add_relevant_phrase", "RKF-AR-ACT-ADD-RELEVANT-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_note_irrelevant", "RKF-AR-ACT-NOTE-IRRELEVANT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_note_assumed", "RKF-AR-ACT-NOTE-ASSUMED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_note_ambiguous", "RKF-AR-ACT-NOTE-AMBIGUOUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_note_disambiguation", "RKF-AR-ACT-NOTE-DISAMBIGUATION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_note_accept_assumed", "RKF-AR-ACT-NOTE-ACCEPT-ASSUMED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_handle_accept_assumed", "RKF-AR-ACT-HANDLE-ACCEPT-ASSUMED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_note_accepted_phrase", "RKF-AR-ACT-NOTE-ACCEPTED-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_note_rejected_phrase", "RKF-AR-ACT-NOTE-REJECTED-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_reconsider_irrelevant", "RKF-AR-ACT-RECONSIDER-IRRELEVANT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_understand_unknown_phrase", "RKF-AR-ACT-UNDERSTAND-UNKNOWN-PHRASE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_reject_unknown_phrase", "RKF-AR-ACT-REJECT-UNKNOWN-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_note_rewrite_sentence", "RKF-AR-ACT-NOTE-REWRITE-SENTENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_sentence_rewrite_cycl_p", "AR-SENTENCE-REWRITE-CYCL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_compute_sentence_rewrites", "AR-COMPUTE-SENTENCE-REWRITES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_note_sentence_completed", "RKF-AR-ACT-NOTE-SENTENCE-COMPLETED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_note_sentence_completed_and_refocus", "RKF-AR-ACT-NOTE-SENTENCE-COMPLETED-AND-REFOCUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_note_phrase_completed", "RKF-AR-ACT-NOTE-PHRASE-COMPLETED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_note_concept_completed", "RKF-AR-ACT-NOTE-CONCEPT-COMPLETED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_note_pending_concept", "RKF-AR-ACT-NOTE-PENDING-CONCEPT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_ensure_relation_is_goodP", "RKF-AR-ENSURE-RELATION-IS-GOOD?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_propagate_surrogate_constraint", "RKF-AR-ACT-PROPAGATE-SURROGATE-CONSTRAINT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_propagate_one_surrogate_constraint", "RKF-AR-ACT-PROPAGATE-ONE-SURROGATE-CONSTRAINT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_concept_is_nthfn_termP", "RKF-AR-CONCEPT-IS-NTHFN-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_nthfn_termP", "RKF-AR-NTHFN-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_unfailable_constraintP", "RKF-AR-UNFAILABLE-CONSTRAINT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_possibly_reformulatableP", "RKF-AR-POSSIBLY-REFORMULATABLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_reformulatable_termP", "RKF-REFORMULATABLE-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "initialize_rkf_reformulatable_terms", "INITIALIZE-RKF-REFORMULATABLE-TERMS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_note_rejected_concepts", "RKF-AR-ACT-NOTE-REJECTED-CONCEPTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_note_surrogate_replacement", "RKF-AR-ACT-NOTE-SURROGATE-REPLACEMENT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_note_one_surrogate_replacement", "RKF-AR-ACT-NOTE-ONE-SURROGATE-REPLACEMENT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_propagate_surrogate_replacement", "RKF-AR-ACT-PROPAGATE-SURROGATE-REPLACEMENT", 4, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_with_additional_constraints", "RKF-AR-WITH-ADDITIONAL-CONSTRAINTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_has_additional_constraintsP", "RKF-AR-HAS-ADDITIONAL-CONSTRAINTS?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_note_accepted_concept", "RKF-AR-ACT-NOTE-ACCEPTED-CONCEPT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_concept_covers_entire_phraseP", "RKF-AR-CONCEPT-COVERS-ENTIRE-PHRASE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_resolve_context_references", "RKF-AR-ACT-RESOLVE-CONTEXT-REFERENCES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_optimize_concept_cycl", "RKF-AR-ACT-OPTIMIZE-CONCEPT-CYCL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_instantiate_template", "RKF-AR-ACT-INSTANTIATE-TEMPLATE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_add_template", "RKF-AR-ACT-ADD-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_formula_choice_template", "RKF-AR-FORMULA-CHOICE-TEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_update_templates", "RKF-AR-ACT-UPDATE-TEMPLATES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_note_candidate_cycl", "RKF-AR-ACT-NOTE-CANDIDATE-CYCL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_note_candidate_assertion", "RKF-AR-ACT-NOTE-CANDIDATE-ASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_note_candidate_query", "RKF-AR-ACT-NOTE-CANDIDATE-QUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_assert_concept", "RKF-AR-ACT-ASSERT-CONCEPT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_act_reject_assert_concept", "RKF-AR-ACT-REJECT-ASSERT-CONCEPT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_pragmatic_relation_p", "AR-PRAGMATIC-RELATION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "ar_sentence_tokens_from_index_list", "AR-SENTENCE-TOKENS-FROM-INDEX-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_some_subsuming_phrase", "RKF-AR-SOME-SUBSUMING-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_phrase_subsumed", "RKF-AR-PHRASE-SUBSUMED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_assertible_concept", "RKF-AR-ASSERTIBLE-CONCEPT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_assertible_cycl", "RKF-AR-ASSERTIBLE-CYCL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_relation_template", "RKF-RELATION-TEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_update_all_template_choices", "RKF-AR-UPDATE-ALL-TEMPLATE-CHOICES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_update_template_choices_for_template", "RKF-AR-UPDATE-TEMPLATE-CHOICES-FOR-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_update_template_choices_for_concept", "RKF-AR-UPDATE-TEMPLATE-CHOICES-FOR-CONCEPT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_update_template_choices_for_template_and_concept", "RKF-AR-UPDATE-TEMPLATE-CHOICES-FOR-TEMPLATE-AND-CONCEPT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_resolve_context_references", "RKF-AR-RESOLVE-CONTEXT-REFERENCES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_context_reference_p", "RKF-AR-CONTEXT-REFERENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_contains_context_references", "RKF-AR-CONTAINS-CONTEXT-REFERENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_gather_context_references", "RKF-AR-GATHER-CONTEXT-REFERENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_resolve_one_context_reference", "RKF-AR-RESOLVE-ONE-CONTEXT-REFERENCE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_resolve_the_spec_reference", "RKF-AR-RESOLVE-THE-SPEC-REFERENCE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_resolve_the_instance_reference", "RKF-AR-RESOLVE-THE-INSTANCE-REFERENCE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_term_agglomerator", "RKF-AR-TERM-AGGLOMERATOR", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_ta_internal", "RKF-AR-TA-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_ta_new_relation", "RKF-AR-TA-NEW-RELATION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_ta_new_term", "RKF-AR-TA-NEW-TERM", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_ta_new_relation_arg", "RKF-AR-TA-NEW-RELATION-ARG", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_ta_assign_args_recursive", "RKF-AR-TA-ASSIGN-ARGS-RECURSIVE", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_ta_answer", "RKF-AR-TA-ANSWER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_ta_admitted_argument", "RKF-AR-TA-ADMITTED-ARGUMENT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "rkf_ar_ta_admitted_formula", "RKF-AR-TA-ADMITTED-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "clear_relation_args_sorted_by_restriction", "CLEAR-RELATION-ARGS-SORTED-BY-RESTRICTION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "remove_relation_args_sorted_by_restriction", "REMOVE-RELATION-ARGS-SORTED-BY-RESTRICTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "relation_args_sorted_by_restriction_internal", "RELATION-ARGS-SORTED-BY-RESTRICTION-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "relation_args_sorted_by_restriction", "RELATION-ARGS-SORTED-BY-RESTRICTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "clear_all_relation_args", "CLEAR-ALL-RELATION-ARGS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "remove_all_relation_args", "REMOVE-ALL-RELATION-ARGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "all_relation_args_internal", "ALL-RELATION-ARGS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_assisted_reader", "all_relation_args", "ALL-RELATION-ARGS", 1, 0, false);
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    public static SubLObject init_rkf_assisted_reader_file() {
        rkf_assisted_reader.$ar_lock$ = SubLFiles.deflexical("*AR-LOCK*", Locks.make_lock((SubLObject)rkf_assisted_reader.$str0$Assisted_Reader_lock));
        rkf_assisted_reader.$dtp_ar_sentence$ = SubLFiles.defconstant("*DTP-AR-SENTENCE*", (SubLObject)rkf_assisted_reader.$sym3$AR_SENTENCE);
        rkf_assisted_reader.$dtp_ar_token$ = SubLFiles.defconstant("*DTP-AR-TOKEN*", (SubLObject)rkf_assisted_reader.$sym39$AR_TOKEN);
        rkf_assisted_reader.$dtp_ar_phrase$ = SubLFiles.defconstant("*DTP-AR-PHRASE*", (SubLObject)rkf_assisted_reader.$sym65$AR_PHRASE);
        rkf_assisted_reader.$dtp_ar_concept$ = SubLFiles.defconstant("*DTP-AR-CONCEPT*", (SubLObject)rkf_assisted_reader.$sym114$AR_CONCEPT);
        rkf_assisted_reader.$dtp_ar_template$ = SubLFiles.defconstant("*DTP-AR-TEMPLATE*", (SubLObject)rkf_assisted_reader.$sym151$AR_TEMPLATE);
        rkf_assisted_reader.$dtp_ar_state$ = SubLFiles.defconstant("*DTP-AR-STATE*", (SubLObject)rkf_assisted_reader.$sym179$AR_STATE);
        rkf_assisted_reader.$max_surrogate_chain_length$ = SubLFiles.defconstant("*MAX-SURROGATE-CHAIN-LENGTH*", (SubLObject)rkf_assisted_reader.FIVE_INTEGER);
        rkf_assisted_reader.$ar_concept_grounding_map$ = SubLFiles.defparameter("*AR-CONCEPT-GROUNDING-MAP*", (SubLObject)rkf_assisted_reader.NIL);
        rkf_assisted_reader.$ar_concept_cycle_count$ = SubLFiles.deflexical("*AR-CONCEPT-CYCLE-COUNT*", (SubLObject)rkf_assisted_reader.$int263$10000);
        rkf_assisted_reader.$ar_divide_best$ = SubLFiles.defvar("*AR-DIVIDE-BEST*", (SubLObject)rkf_assisted_reader.NIL);
        rkf_assisted_reader.$rkf_ar_parsing_mt$ = SubLFiles.defparameter("*RKF-AR-PARSING-MT*", (SubLObject)rkf_assisted_reader.NIL);
        rkf_assisted_reader.$rkf_ar_semantics_mt$ = SubLFiles.defparameter("*RKF-AR-SEMANTICS-MT*", (SubLObject)rkf_assisted_reader.NIL);
        rkf_assisted_reader.$rkf_user$ = SubLFiles.defparameter("*RKF-USER*", (SubLObject)rkf_assisted_reader.NIL);
        rkf_assisted_reader.$rkf_ar_text_processor$ = SubLFiles.deflexical("*RKF-AR-TEXT-PROCESSOR*", (SubLObject)rkf_assisted_reader.$sym278$RKF_SENTENCE_READER);
        rkf_assisted_reader.$rkf_ar_question_processor$ = SubLFiles.deflexical("*RKF-AR-QUESTION-PROCESSOR*", (SubLObject)rkf_assisted_reader.$sym279$RKF_QUESTION_READER);
        rkf_assisted_reader.$rkf_ar_concept_harvester$ = SubLFiles.deflexical("*RKF-AR-CONCEPT-HARVESTER*", (SubLObject)rkf_assisted_reader.$sym280$RKF_CONCEPT_HARVESTER);
        rkf_assisted_reader.$rfk_ar_template_category_map$ = SubLFiles.deflexical("*RFK-AR-TEMPLATE-CATEGORY-MAP*", (SubLObject)rkf_assisted_reader.$list281);
        rkf_assisted_reader.$rkf_ar_processing_mode$ = SubLFiles.defparameter("*RKF-AR-PROCESSING-MODE*", (SubLObject)rkf_assisted_reader.$kw282$TEXT_PROCESSING);
        rkf_assisted_reader.$rkf_ar_logging_default_parser$ = SubLFiles.defparameter("*RKF-AR-LOGGING-DEFAULT-PARSER*", (SubLObject)rkf_assisted_reader.$sym290$ITP_SEQUEL);
        rkf_assisted_reader.$rkf_ar_logging_default_project$ = SubLFiles.defparameter("*RKF-AR-LOGGING-DEFAULT-PROJECT*", (SubLObject)rkf_assisted_reader.$str291$UIA_use);
        rkf_assisted_reader.$rkf_ar_logging_default_priority$ = SubLFiles.defparameter("*RKF-AR-LOGGING-DEFAULT-PRIORITY*", (SubLObject)rkf_assisted_reader.$str292$Medium);
        rkf_assisted_reader.$rkf_reformulatable_terms$ = SubLFiles.defparameter("*RKF-REFORMULATABLE-TERMS*", (SubLObject)rkf_assisted_reader.NIL);
        rkf_assisted_reader.$rkf_ar_additional_constraints$ = SubLFiles.defparameter("*RKF-AR-ADDITIONAL-CONSTRAINTS*", (SubLObject)rkf_assisted_reader.NIL);
        rkf_assisted_reader.$ar_pragmatic_relations$ = SubLFiles.deflexical("*AR-PRAGMATIC-RELATIONS*", (SubLObject)rkf_assisted_reader.$list313);
        rkf_assisted_reader.$relation_args_sorted_by_restriction_caching_state$ = SubLFiles.deflexical("*RELATION-ARGS-SORTED-BY-RESTRICTION-CACHING-STATE*", (SubLObject)rkf_assisted_reader.NIL);
        rkf_assisted_reader.$all_relation_args_caching_state$ = SubLFiles.deflexical("*ALL-RELATION-ARGS-CACHING-STATE*", (SubLObject)rkf_assisted_reader.NIL);
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    public static SubLObject setup_rkf_assisted_reader_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), rkf_assisted_reader.$dtp_ar_sentence$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym10$AR_SENTENCE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)rkf_assisted_reader.$list11);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym12$AR_SENTENCE_ID, (SubLObject)rkf_assisted_reader.$sym13$_CSETF_AR_SENTENCE_ID);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym14$AR_SENTENCE_PLAINTEXT, (SubLObject)rkf_assisted_reader.$sym15$_CSETF_AR_SENTENCE_PLAINTEXT);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym16$AR_SENTENCE_TOKEN_VECTOR, (SubLObject)rkf_assisted_reader.$sym17$_CSETF_AR_SENTENCE_TOKEN_VECTOR);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym18$AR_SENTENCE_CLARIFICATIONS, (SubLObject)rkf_assisted_reader.$sym19$_CSETF_AR_SENTENCE_CLARIFICATIONS);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym20$AR_SENTENCE_SOURCE_SENTENCE, (SubLObject)rkf_assisted_reader.$sym21$_CSETF_AR_SENTENCE_SOURCE_SENTENCE);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym22$AR_SENTENCE_PHRASES, (SubLObject)rkf_assisted_reader.$sym23$_CSETF_AR_SENTENCE_PHRASES);
        Equality.identity((SubLObject)rkf_assisted_reader.$sym3$AR_SENTENCE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rkf_assisted_reader.$dtp_ar_sentence$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym35$VISIT_DEFSTRUCT_OBJECT_AR_SENTENCE_METHOD));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), rkf_assisted_reader.$dtp_ar_sentence$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym36$SXHASH_AR_SENTENCE_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), rkf_assisted_reader.$dtp_ar_token$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym46$AR_TOKEN_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)rkf_assisted_reader.$list47);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym48$AR_TOKEN_ID, (SubLObject)rkf_assisted_reader.$sym49$_CSETF_AR_TOKEN_ID);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym50$AR_TOKEN_TEXT, (SubLObject)rkf_assisted_reader.$sym51$_CSETF_AR_TOKEN_TEXT);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym52$AR_TOKEN_SENTENCE, (SubLObject)rkf_assisted_reader.$sym53$_CSETF_AR_TOKEN_SENTENCE);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym54$AR_TOKEN_NUMBER, (SubLObject)rkf_assisted_reader.$sym55$_CSETF_AR_TOKEN_NUMBER);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym56$AR_TOKEN_PHRASES, (SubLObject)rkf_assisted_reader.$sym57$_CSETF_AR_TOKEN_PHRASES);
        Equality.identity((SubLObject)rkf_assisted_reader.$sym39$AR_TOKEN);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rkf_assisted_reader.$dtp_ar_token$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym62$VISIT_DEFSTRUCT_OBJECT_AR_TOKEN_METHOD));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), rkf_assisted_reader.$dtp_ar_token$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym64$SXHASH_AR_TOKEN_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), rkf_assisted_reader.$dtp_ar_phrase$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym71$AR_PHRASE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)rkf_assisted_reader.$list72);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym73$AR_PHRASE_ID, (SubLObject)rkf_assisted_reader.$sym74$_CSETF_AR_PHRASE_ID);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym75$AR_PHRASE_STATUS, (SubLObject)rkf_assisted_reader.$sym76$_CSETF_AR_PHRASE_STATUS);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym77$AR_PHRASE_TOKEN_LIST, (SubLObject)rkf_assisted_reader.$sym78$_CSETF_AR_PHRASE_TOKEN_LIST);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym79$AR_PHRASE_SENTENCE, (SubLObject)rkf_assisted_reader.$sym80$_CSETF_AR_PHRASE_SENTENCE);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym81$AR_PHRASE_CONCEPTS, (SubLObject)rkf_assisted_reader.$sym82$_CSETF_AR_PHRASE_CONCEPTS);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym83$AR_PHRASE_REJECTED_CONCEPTS, (SubLObject)rkf_assisted_reader.$sym84$_CSETF_AR_PHRASE_REJECTED_CONCEPTS);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym85$AR_PHRASE_DISAMBIGUATED_CONCEPT, (SubLObject)rkf_assisted_reader.$sym86$_CSETF_AR_PHRASE_DISAMBIGUATED_CONCEPT);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym87$AR_PHRASE_SURROGATE, (SubLObject)rkf_assisted_reader.$sym88$_CSETF_AR_PHRASE_SURROGATE);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym89$AR_PHRASE_CONSTRAINT, (SubLObject)rkf_assisted_reader.$sym90$_CSETF_AR_PHRASE_CONSTRAINT);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym91$AR_PHRASE_FORCE, (SubLObject)rkf_assisted_reader.$sym92$_CSETF_AR_PHRASE_FORCE);
        Equality.identity((SubLObject)rkf_assisted_reader.$sym65$AR_PHRASE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rkf_assisted_reader.$dtp_ar_phrase$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym102$VISIT_DEFSTRUCT_OBJECT_AR_PHRASE_METHOD));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), rkf_assisted_reader.$dtp_ar_phrase$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym105$SXHASH_AR_PHRASE_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), rkf_assisted_reader.$dtp_ar_concept$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym120$AR_CONCEPT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)rkf_assisted_reader.$list121);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym122$AR_CONCEPT_ID, (SubLObject)rkf_assisted_reader.$sym123$_CSETF_AR_CONCEPT_ID);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym124$AR_CONCEPT_CYCL, (SubLObject)rkf_assisted_reader.$sym125$_CSETF_AR_CONCEPT_CYCL);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym126$AR_CONCEPT_DISAMBIGUATION_TEXT, (SubLObject)rkf_assisted_reader.$sym127$_CSETF_AR_CONCEPT_DISAMBIGUATION_TEXT);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym128$AR_CONCEPT_PHRASES, (SubLObject)rkf_assisted_reader.$sym129$_CSETF_AR_CONCEPT_PHRASES);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym130$AR_CONCEPT_PARTS, (SubLObject)rkf_assisted_reader.$sym131$_CSETF_AR_CONCEPT_PARTS);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym132$AR_CONCEPT_AGGLOMERATIONS, (SubLObject)rkf_assisted_reader.$sym133$_CSETF_AR_CONCEPT_AGGLOMERATIONS);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym134$AR_CONCEPT_FORCE, (SubLObject)rkf_assisted_reader.$sym135$_CSETF_AR_CONCEPT_FORCE);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym136$AR_CONCEPT_CONFIDENCE, (SubLObject)rkf_assisted_reader.$sym137$_CSETF_AR_CONCEPT_CONFIDENCE);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym138$AR_CONCEPT_OPEN_TERM_SCORE, (SubLObject)rkf_assisted_reader.$sym139$_CSETF_AR_CONCEPT_OPEN_TERM_SCORE);
        Equality.identity((SubLObject)rkf_assisted_reader.$sym114$AR_CONCEPT);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rkf_assisted_reader.$dtp_ar_concept$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym147$VISIT_DEFSTRUCT_OBJECT_AR_CONCEPT_METHOD));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), rkf_assisted_reader.$dtp_ar_concept$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym149$SXHASH_AR_CONCEPT_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), rkf_assisted_reader.$dtp_ar_template$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym157$AR_TEMPLATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)rkf_assisted_reader.$list158);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym159$AR_TEMPLATE_ID, (SubLObject)rkf_assisted_reader.$sym160$_CSETF_AR_TEMPLATE_ID);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym161$AR_TEMPLATE_CONCEPT, (SubLObject)rkf_assisted_reader.$sym162$_CSETF_AR_TEMPLATE_CONCEPT);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym163$AR_TEMPLATE_FORMULA, (SubLObject)rkf_assisted_reader.$sym164$_CSETF_AR_TEMPLATE_FORMULA);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym165$AR_TEMPLATE_PROMPT, (SubLObject)rkf_assisted_reader.$sym166$_CSETF_AR_TEMPLATE_PROMPT);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym167$AR_TEMPLATE_CHOICE_TABLE, (SubLObject)rkf_assisted_reader.$sym168$_CSETF_AR_TEMPLATE_CHOICE_TABLE);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym169$AR_TEMPLATE_AGGLOMERATIONS, (SubLObject)rkf_assisted_reader.$sym170$_CSETF_AR_TEMPLATE_AGGLOMERATIONS);
        Equality.identity((SubLObject)rkf_assisted_reader.$sym151$AR_TEMPLATE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rkf_assisted_reader.$dtp_ar_template$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym176$VISIT_DEFSTRUCT_OBJECT_AR_TEMPLATE_METHOD));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), rkf_assisted_reader.$dtp_ar_template$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym177$SXHASH_AR_TEMPLATE_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), rkf_assisted_reader.$dtp_ar_state$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym185$AR_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)rkf_assisted_reader.$list186);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym187$AR_STATE_ISG, (SubLObject)rkf_assisted_reader.$sym188$_CSETF_AR_STATE_ISG);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym189$AR_STATE_INDEX, (SubLObject)rkf_assisted_reader.$sym190$_CSETF_AR_STATE_INDEX);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym191$AR_STATE_SOURCE_SENTENCES, (SubLObject)rkf_assisted_reader.$sym192$_CSETF_AR_STATE_SOURCE_SENTENCES);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym193$AR_STATE_FOCUS_SENTENCE, (SubLObject)rkf_assisted_reader.$sym194$_CSETF_AR_STATE_FOCUS_SENTENCE);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym195$AR_STATE_COMPLETED_SENTENCES, (SubLObject)rkf_assisted_reader.$sym196$_CSETF_AR_STATE_COMPLETED_SENTENCES);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym197$AR_STATE_UNKNOWN_PHRASES, (SubLObject)rkf_assisted_reader.$sym198$_CSETF_AR_STATE_UNKNOWN_PHRASES);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym199$AR_STATE_REJECTED_PHRASES, (SubLObject)rkf_assisted_reader.$sym200$_CSETF_AR_STATE_REJECTED_PHRASES);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym201$AR_STATE_IRRELEVANT_PHRASES, (SubLObject)rkf_assisted_reader.$sym202$_CSETF_AR_STATE_IRRELEVANT_PHRASES);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym203$AR_STATE_AMBIGUOUS_PHRASES, (SubLObject)rkf_assisted_reader.$sym204$_CSETF_AR_STATE_AMBIGUOUS_PHRASES);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym205$AR_STATE_ASSUMED_PHRASES, (SubLObject)rkf_assisted_reader.$sym206$_CSETF_AR_STATE_ASSUMED_PHRASES);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym207$AR_STATE_PENDING_PHRASES, (SubLObject)rkf_assisted_reader.$sym208$_CSETF_AR_STATE_PENDING_PHRASES);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym209$AR_STATE_ACCEPTED_PHRASES, (SubLObject)rkf_assisted_reader.$sym210$_CSETF_AR_STATE_ACCEPTED_PHRASES);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym211$AR_STATE_PENDING_CONCEPTS, (SubLObject)rkf_assisted_reader.$sym212$_CSETF_AR_STATE_PENDING_CONCEPTS);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym213$AR_STATE_ACCEPTED_CONCEPTS, (SubLObject)rkf_assisted_reader.$sym214$_CSETF_AR_STATE_ACCEPTED_CONCEPTS);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym215$AR_STATE_CANDIDATE_CYCLS, (SubLObject)rkf_assisted_reader.$sym216$_CSETF_AR_STATE_CANDIDATE_CYCLS);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym217$AR_STATE_ASSERTED_ASSERTIONS, (SubLObject)rkf_assisted_reader.$sym218$_CSETF_AR_STATE_ASSERTED_ASSERTIONS);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym219$AR_STATE_TERM_TEMPLATES, (SubLObject)rkf_assisted_reader.$sym220$_CSETF_AR_STATE_TERM_TEMPLATES);
        Structures.def_csetf((SubLObject)rkf_assisted_reader.$sym221$AR_STATE_ASSERT_TEMPLATES, (SubLObject)rkf_assisted_reader.$sym222$_CSETF_AR_STATE_ASSERT_TEMPLATES);
        Equality.identity((SubLObject)rkf_assisted_reader.$sym179$AR_STATE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rkf_assisted_reader.$dtp_ar_state$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_assisted_reader.$sym242$VISIT_DEFSTRUCT_OBJECT_AR_STATE_METHOD));
        memoization_state.note_globally_cached_function((SubLObject)rkf_assisted_reader.$sym322$RELATION_ARGS_SORTED_BY_RESTRICTION);
        memoization_state.note_globally_cached_function((SubLObject)rkf_assisted_reader.$sym326$ALL_RELATION_ARGS);
        return (SubLObject)rkf_assisted_reader.NIL;
    }
    
    public void declareFunctions() {
        declare_rkf_assisted_reader_file();
    }
    
    public void initializeVariables() {
        init_rkf_assisted_reader_file();
    }
    
    public void runTopLevelForms() {
        setup_rkf_assisted_reader_file();
    }
    
    static {
        me = (SubLFile)new rkf_assisted_reader();
        rkf_assisted_reader.$ar_lock$ = null;
        rkf_assisted_reader.$dtp_ar_sentence$ = null;
        rkf_assisted_reader.$dtp_ar_token$ = null;
        rkf_assisted_reader.$dtp_ar_phrase$ = null;
        rkf_assisted_reader.$dtp_ar_concept$ = null;
        rkf_assisted_reader.$dtp_ar_template$ = null;
        rkf_assisted_reader.$dtp_ar_state$ = null;
        rkf_assisted_reader.$max_surrogate_chain_length$ = null;
        rkf_assisted_reader.$ar_concept_grounding_map$ = null;
        rkf_assisted_reader.$ar_concept_cycle_count$ = null;
        rkf_assisted_reader.$ar_divide_best$ = null;
        rkf_assisted_reader.$rkf_ar_parsing_mt$ = null;
        rkf_assisted_reader.$rkf_ar_semantics_mt$ = null;
        rkf_assisted_reader.$rkf_user$ = null;
        rkf_assisted_reader.$rkf_ar_text_processor$ = null;
        rkf_assisted_reader.$rkf_ar_question_processor$ = null;
        rkf_assisted_reader.$rkf_ar_concept_harvester$ = null;
        rkf_assisted_reader.$rfk_ar_template_category_map$ = null;
        rkf_assisted_reader.$rkf_ar_processing_mode$ = null;
        rkf_assisted_reader.$rkf_ar_logging_default_parser$ = null;
        rkf_assisted_reader.$rkf_ar_logging_default_project$ = null;
        rkf_assisted_reader.$rkf_ar_logging_default_priority$ = null;
        rkf_assisted_reader.$rkf_reformulatable_terms$ = null;
        rkf_assisted_reader.$rkf_ar_additional_constraints$ = null;
        rkf_assisted_reader.$ar_pragmatic_relations$ = null;
        rkf_assisted_reader.$relation_args_sorted_by_restriction_caching_state$ = null;
        rkf_assisted_reader.$all_relation_args_caching_state$ = null;
        $str0$Assisted_Reader_lock = SubLObjectFactory.makeString("Assisted Reader lock");
        $sym1$WITH_LOCK_HELD = SubLObjectFactory.makeSymbol("WITH-LOCK-HELD");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*AR-LOCK*"));
        $sym3$AR_SENTENCE = SubLObjectFactory.makeSymbol("AR-SENTENCE");
        $sym4$AR_SENTENCE_P = SubLObjectFactory.makeSymbol("AR-SENTENCE-P");
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("PLAINTEXT"), (SubLObject)SubLObjectFactory.makeSymbol("TOKEN-VECTOR"), (SubLObject)SubLObjectFactory.makeSymbol("CLARIFICATIONS"), (SubLObject)SubLObjectFactory.makeSymbol("SOURCE-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("PHRASES"));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ID"), (SubLObject)SubLObjectFactory.makeKeyword("PLAINTEXT"), (SubLObject)SubLObjectFactory.makeKeyword("TOKEN-VECTOR"), (SubLObject)SubLObjectFactory.makeKeyword("CLARIFICATIONS"), (SubLObject)SubLObjectFactory.makeKeyword("SOURCE-SENTENCE"), (SubLObject)SubLObjectFactory.makeKeyword("PHRASES"));
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AR-SENTENCE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("AR-SENTENCE-PLAINTEXT"), (SubLObject)SubLObjectFactory.makeSymbol("AR-SENTENCE-TOKEN-VECTOR"), (SubLObject)SubLObjectFactory.makeSymbol("AR-SENTENCE-CLARIFICATIONS"), (SubLObject)SubLObjectFactory.makeSymbol("AR-SENTENCE-SOURCE-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("AR-SENTENCE-PHRASES"));
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-AR-SENTENCE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-AR-SENTENCE-PLAINTEXT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-AR-SENTENCE-TOKEN-VECTOR"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-AR-SENTENCE-CLARIFICATIONS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-AR-SENTENCE-SOURCE-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-AR-SENTENCE-PHRASES"));
        $sym9$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym10$AR_SENTENCE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("AR-SENTENCE-PRINT-FUNCTION-TRAMPOLINE");
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("AR-SENTENCE-P"));
        $sym12$AR_SENTENCE_ID = SubLObjectFactory.makeSymbol("AR-SENTENCE-ID");
        $sym13$_CSETF_AR_SENTENCE_ID = SubLObjectFactory.makeSymbol("_CSETF-AR-SENTENCE-ID");
        $sym14$AR_SENTENCE_PLAINTEXT = SubLObjectFactory.makeSymbol("AR-SENTENCE-PLAINTEXT");
        $sym15$_CSETF_AR_SENTENCE_PLAINTEXT = SubLObjectFactory.makeSymbol("_CSETF-AR-SENTENCE-PLAINTEXT");
        $sym16$AR_SENTENCE_TOKEN_VECTOR = SubLObjectFactory.makeSymbol("AR-SENTENCE-TOKEN-VECTOR");
        $sym17$_CSETF_AR_SENTENCE_TOKEN_VECTOR = SubLObjectFactory.makeSymbol("_CSETF-AR-SENTENCE-TOKEN-VECTOR");
        $sym18$AR_SENTENCE_CLARIFICATIONS = SubLObjectFactory.makeSymbol("AR-SENTENCE-CLARIFICATIONS");
        $sym19$_CSETF_AR_SENTENCE_CLARIFICATIONS = SubLObjectFactory.makeSymbol("_CSETF-AR-SENTENCE-CLARIFICATIONS");
        $sym20$AR_SENTENCE_SOURCE_SENTENCE = SubLObjectFactory.makeSymbol("AR-SENTENCE-SOURCE-SENTENCE");
        $sym21$_CSETF_AR_SENTENCE_SOURCE_SENTENCE = SubLObjectFactory.makeSymbol("_CSETF-AR-SENTENCE-SOURCE-SENTENCE");
        $sym22$AR_SENTENCE_PHRASES = SubLObjectFactory.makeSymbol("AR-SENTENCE-PHRASES");
        $sym23$_CSETF_AR_SENTENCE_PHRASES = SubLObjectFactory.makeSymbol("_CSETF-AR-SENTENCE-PHRASES");
        $kw24$ID = SubLObjectFactory.makeKeyword("ID");
        $kw25$PLAINTEXT = SubLObjectFactory.makeKeyword("PLAINTEXT");
        $kw26$TOKEN_VECTOR = SubLObjectFactory.makeKeyword("TOKEN-VECTOR");
        $kw27$CLARIFICATIONS = SubLObjectFactory.makeKeyword("CLARIFICATIONS");
        $kw28$SOURCE_SENTENCE = SubLObjectFactory.makeKeyword("SOURCE-SENTENCE");
        $kw29$PHRASES = SubLObjectFactory.makeKeyword("PHRASES");
        $str30$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw31$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym32$MAKE_AR_SENTENCE = SubLObjectFactory.makeSymbol("MAKE-AR-SENTENCE");
        $kw33$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw34$END = SubLObjectFactory.makeKeyword("END");
        $sym35$VISIT_DEFSTRUCT_OBJECT_AR_SENTENCE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-AR-SENTENCE-METHOD");
        $sym36$SXHASH_AR_SENTENCE_METHOD = SubLObjectFactory.makeSymbol("SXHASH-AR-SENTENCE-METHOD");
        $sym37$VECTORP = SubLObjectFactory.makeSymbol("VECTORP");
        $sym38$AR_PHRASE_P = SubLObjectFactory.makeSymbol("AR-PHRASE-P");
        $sym39$AR_TOKEN = SubLObjectFactory.makeSymbol("AR-TOKEN");
        $sym40$AR_TOKEN_P = SubLObjectFactory.makeSymbol("AR-TOKEN-P");
        $list41 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("PHRASES"));
        $list42 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ID"), (SubLObject)SubLObjectFactory.makeKeyword("TEXT"), (SubLObject)SubLObjectFactory.makeKeyword("SENTENCE"), (SubLObject)SubLObjectFactory.makeKeyword("NUMBER"), (SubLObject)SubLObjectFactory.makeKeyword("PHRASES"));
        $list43 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AR-TOKEN-ID"), (SubLObject)SubLObjectFactory.makeSymbol("AR-TOKEN-TEXT"), (SubLObject)SubLObjectFactory.makeSymbol("AR-TOKEN-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("AR-TOKEN-NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("AR-TOKEN-PHRASES"));
        $list44 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-AR-TOKEN-ID"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-AR-TOKEN-TEXT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-AR-TOKEN-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-AR-TOKEN-NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-AR-TOKEN-PHRASES"));
        $sym45$PRINT_AR_TOKEN = SubLObjectFactory.makeSymbol("PRINT-AR-TOKEN");
        $sym46$AR_TOKEN_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("AR-TOKEN-PRINT-FUNCTION-TRAMPOLINE");
        $list47 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("AR-TOKEN-P"));
        $sym48$AR_TOKEN_ID = SubLObjectFactory.makeSymbol("AR-TOKEN-ID");
        $sym49$_CSETF_AR_TOKEN_ID = SubLObjectFactory.makeSymbol("_CSETF-AR-TOKEN-ID");
        $sym50$AR_TOKEN_TEXT = SubLObjectFactory.makeSymbol("AR-TOKEN-TEXT");
        $sym51$_CSETF_AR_TOKEN_TEXT = SubLObjectFactory.makeSymbol("_CSETF-AR-TOKEN-TEXT");
        $sym52$AR_TOKEN_SENTENCE = SubLObjectFactory.makeSymbol("AR-TOKEN-SENTENCE");
        $sym53$_CSETF_AR_TOKEN_SENTENCE = SubLObjectFactory.makeSymbol("_CSETF-AR-TOKEN-SENTENCE");
        $sym54$AR_TOKEN_NUMBER = SubLObjectFactory.makeSymbol("AR-TOKEN-NUMBER");
        $sym55$_CSETF_AR_TOKEN_NUMBER = SubLObjectFactory.makeSymbol("_CSETF-AR-TOKEN-NUMBER");
        $sym56$AR_TOKEN_PHRASES = SubLObjectFactory.makeSymbol("AR-TOKEN-PHRASES");
        $sym57$_CSETF_AR_TOKEN_PHRASES = SubLObjectFactory.makeSymbol("_CSETF-AR-TOKEN-PHRASES");
        $kw58$TEXT = SubLObjectFactory.makeKeyword("TEXT");
        $kw59$SENTENCE = SubLObjectFactory.makeKeyword("SENTENCE");
        $kw60$NUMBER = SubLObjectFactory.makeKeyword("NUMBER");
        $sym61$MAKE_AR_TOKEN = SubLObjectFactory.makeSymbol("MAKE-AR-TOKEN");
        $sym62$VISIT_DEFSTRUCT_OBJECT_AR_TOKEN_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-AR-TOKEN-METHOD");
        $str63$_A_ = SubLObjectFactory.makeString("~A ");
        $sym64$SXHASH_AR_TOKEN_METHOD = SubLObjectFactory.makeSymbol("SXHASH-AR-TOKEN-METHOD");
        $sym65$AR_PHRASE = SubLObjectFactory.makeSymbol("AR-PHRASE");
        $list66 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("ID"), SubLObjectFactory.makeSymbol("STATUS"), SubLObjectFactory.makeSymbol("TOKEN-LIST"), SubLObjectFactory.makeSymbol("SENTENCE"), SubLObjectFactory.makeSymbol("CONCEPTS"), SubLObjectFactory.makeSymbol("REJECTED-CONCEPTS"), SubLObjectFactory.makeSymbol("DISAMBIGUATED-CONCEPT"), SubLObjectFactory.makeSymbol("SURROGATE"), SubLObjectFactory.makeSymbol("CONSTRAINT"), SubLObjectFactory.makeSymbol("FORCE") });
        $list67 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("ID"), SubLObjectFactory.makeKeyword("STATUS"), SubLObjectFactory.makeKeyword("TOKEN-LIST"), SubLObjectFactory.makeKeyword("SENTENCE"), SubLObjectFactory.makeKeyword("CONCEPTS"), SubLObjectFactory.makeKeyword("REJECTED-CONCEPTS"), SubLObjectFactory.makeKeyword("DISAMBIGUATED-CONCEPT"), SubLObjectFactory.makeKeyword("SURROGATE"), SubLObjectFactory.makeKeyword("CONSTRAINT"), SubLObjectFactory.makeKeyword("FORCE") });
        $list68 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("AR-PHRASE-ID"), SubLObjectFactory.makeSymbol("AR-PHRASE-STATUS"), SubLObjectFactory.makeSymbol("AR-PHRASE-TOKEN-LIST"), SubLObjectFactory.makeSymbol("AR-PHRASE-SENTENCE"), SubLObjectFactory.makeSymbol("AR-PHRASE-CONCEPTS"), SubLObjectFactory.makeSymbol("AR-PHRASE-REJECTED-CONCEPTS"), SubLObjectFactory.makeSymbol("AR-PHRASE-DISAMBIGUATED-CONCEPT"), SubLObjectFactory.makeSymbol("AR-PHRASE-SURROGATE"), SubLObjectFactory.makeSymbol("AR-PHRASE-CONSTRAINT"), SubLObjectFactory.makeSymbol("AR-PHRASE-FORCE") });
        $list69 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-AR-PHRASE-ID"), SubLObjectFactory.makeSymbol("_CSETF-AR-PHRASE-STATUS"), SubLObjectFactory.makeSymbol("_CSETF-AR-PHRASE-TOKEN-LIST"), SubLObjectFactory.makeSymbol("_CSETF-AR-PHRASE-SENTENCE"), SubLObjectFactory.makeSymbol("_CSETF-AR-PHRASE-CONCEPTS"), SubLObjectFactory.makeSymbol("_CSETF-AR-PHRASE-REJECTED-CONCEPTS"), SubLObjectFactory.makeSymbol("_CSETF-AR-PHRASE-DISAMBIGUATED-CONCEPT"), SubLObjectFactory.makeSymbol("_CSETF-AR-PHRASE-SURROGATE"), SubLObjectFactory.makeSymbol("_CSETF-AR-PHRASE-CONSTRAINT"), SubLObjectFactory.makeSymbol("_CSETF-AR-PHRASE-FORCE") });
        $sym70$PRINT_AR_PHRASE = SubLObjectFactory.makeSymbol("PRINT-AR-PHRASE");
        $sym71$AR_PHRASE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("AR-PHRASE-PRINT-FUNCTION-TRAMPOLINE");
        $list72 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("AR-PHRASE-P"));
        $sym73$AR_PHRASE_ID = SubLObjectFactory.makeSymbol("AR-PHRASE-ID");
        $sym74$_CSETF_AR_PHRASE_ID = SubLObjectFactory.makeSymbol("_CSETF-AR-PHRASE-ID");
        $sym75$AR_PHRASE_STATUS = SubLObjectFactory.makeSymbol("AR-PHRASE-STATUS");
        $sym76$_CSETF_AR_PHRASE_STATUS = SubLObjectFactory.makeSymbol("_CSETF-AR-PHRASE-STATUS");
        $sym77$AR_PHRASE_TOKEN_LIST = SubLObjectFactory.makeSymbol("AR-PHRASE-TOKEN-LIST");
        $sym78$_CSETF_AR_PHRASE_TOKEN_LIST = SubLObjectFactory.makeSymbol("_CSETF-AR-PHRASE-TOKEN-LIST");
        $sym79$AR_PHRASE_SENTENCE = SubLObjectFactory.makeSymbol("AR-PHRASE-SENTENCE");
        $sym80$_CSETF_AR_PHRASE_SENTENCE = SubLObjectFactory.makeSymbol("_CSETF-AR-PHRASE-SENTENCE");
        $sym81$AR_PHRASE_CONCEPTS = SubLObjectFactory.makeSymbol("AR-PHRASE-CONCEPTS");
        $sym82$_CSETF_AR_PHRASE_CONCEPTS = SubLObjectFactory.makeSymbol("_CSETF-AR-PHRASE-CONCEPTS");
        $sym83$AR_PHRASE_REJECTED_CONCEPTS = SubLObjectFactory.makeSymbol("AR-PHRASE-REJECTED-CONCEPTS");
        $sym84$_CSETF_AR_PHRASE_REJECTED_CONCEPTS = SubLObjectFactory.makeSymbol("_CSETF-AR-PHRASE-REJECTED-CONCEPTS");
        $sym85$AR_PHRASE_DISAMBIGUATED_CONCEPT = SubLObjectFactory.makeSymbol("AR-PHRASE-DISAMBIGUATED-CONCEPT");
        $sym86$_CSETF_AR_PHRASE_DISAMBIGUATED_CONCEPT = SubLObjectFactory.makeSymbol("_CSETF-AR-PHRASE-DISAMBIGUATED-CONCEPT");
        $sym87$AR_PHRASE_SURROGATE = SubLObjectFactory.makeSymbol("AR-PHRASE-SURROGATE");
        $sym88$_CSETF_AR_PHRASE_SURROGATE = SubLObjectFactory.makeSymbol("_CSETF-AR-PHRASE-SURROGATE");
        $sym89$AR_PHRASE_CONSTRAINT = SubLObjectFactory.makeSymbol("AR-PHRASE-CONSTRAINT");
        $sym90$_CSETF_AR_PHRASE_CONSTRAINT = SubLObjectFactory.makeSymbol("_CSETF-AR-PHRASE-CONSTRAINT");
        $sym91$AR_PHRASE_FORCE = SubLObjectFactory.makeSymbol("AR-PHRASE-FORCE");
        $sym92$_CSETF_AR_PHRASE_FORCE = SubLObjectFactory.makeSymbol("_CSETF-AR-PHRASE-FORCE");
        $kw93$STATUS = SubLObjectFactory.makeKeyword("STATUS");
        $kw94$TOKEN_LIST = SubLObjectFactory.makeKeyword("TOKEN-LIST");
        $kw95$CONCEPTS = SubLObjectFactory.makeKeyword("CONCEPTS");
        $kw96$REJECTED_CONCEPTS = SubLObjectFactory.makeKeyword("REJECTED-CONCEPTS");
        $kw97$DISAMBIGUATED_CONCEPT = SubLObjectFactory.makeKeyword("DISAMBIGUATED-CONCEPT");
        $kw98$SURROGATE = SubLObjectFactory.makeKeyword("SURROGATE");
        $kw99$CONSTRAINT = SubLObjectFactory.makeKeyword("CONSTRAINT");
        $kw100$FORCE = SubLObjectFactory.makeKeyword("FORCE");
        $sym101$MAKE_AR_PHRASE = SubLObjectFactory.makeSymbol("MAKE-AR-PHRASE");
        $sym102$VISIT_DEFSTRUCT_OBJECT_AR_PHRASE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-AR-PHRASE-METHOD");
        $str103$_AR_PHRASE__D_ = SubLObjectFactory.makeString("<AR-PHRASE ~D ");
        $str104$_ = SubLObjectFactory.makeString(">");
        $sym105$SXHASH_AR_PHRASE_METHOD = SubLObjectFactory.makeSymbol("SXHASH-AR-PHRASE-METHOD");
        $sym106$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym107$AR_CONCEPT_P = SubLObjectFactory.makeSymbol("AR-CONCEPT-P");
        $sym108$KEYWORDP = SubLObjectFactory.makeSymbol("KEYWORDP");
        $str109$_ = SubLObjectFactory.makeString("?");
        $kw110$QUESTION = SubLObjectFactory.makeKeyword("QUESTION");
        $str111$_ = SubLObjectFactory.makeString(".");
        $kw112$DECLARATIVE = SubLObjectFactory.makeKeyword("DECLARATIVE");
        $kw113$NONE = SubLObjectFactory.makeKeyword("NONE");
        $sym114$AR_CONCEPT = SubLObjectFactory.makeSymbol("AR-CONCEPT");
        $list115 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("ID"), SubLObjectFactory.makeSymbol("CYCL"), SubLObjectFactory.makeSymbol("DISAMBIGUATION-TEXT"), SubLObjectFactory.makeSymbol("PHRASES"), SubLObjectFactory.makeSymbol("PARTS"), SubLObjectFactory.makeSymbol("AGGLOMERATIONS"), SubLObjectFactory.makeSymbol("FORCE"), SubLObjectFactory.makeSymbol("CONFIDENCE"), SubLObjectFactory.makeSymbol("OPEN-TERM-SCORE") });
        $list116 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("ID"), SubLObjectFactory.makeKeyword("CYCL"), SubLObjectFactory.makeKeyword("DISAMBIGUATION-TEXT"), SubLObjectFactory.makeKeyword("PHRASES"), SubLObjectFactory.makeKeyword("PARTS"), SubLObjectFactory.makeKeyword("AGGLOMERATIONS"), SubLObjectFactory.makeKeyword("FORCE"), SubLObjectFactory.makeKeyword("CONFIDENCE"), SubLObjectFactory.makeKeyword("OPEN-TERM-SCORE") });
        $list117 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("AR-CONCEPT-ID"), SubLObjectFactory.makeSymbol("AR-CONCEPT-CYCL"), SubLObjectFactory.makeSymbol("AR-CONCEPT-DISAMBIGUATION-TEXT"), SubLObjectFactory.makeSymbol("AR-CONCEPT-PHRASES"), SubLObjectFactory.makeSymbol("AR-CONCEPT-PARTS"), SubLObjectFactory.makeSymbol("AR-CONCEPT-AGGLOMERATIONS"), SubLObjectFactory.makeSymbol("AR-CONCEPT-FORCE"), SubLObjectFactory.makeSymbol("AR-CONCEPT-CONFIDENCE"), SubLObjectFactory.makeSymbol("AR-CONCEPT-OPEN-TERM-SCORE") });
        $list118 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-AR-CONCEPT-ID"), SubLObjectFactory.makeSymbol("_CSETF-AR-CONCEPT-CYCL"), SubLObjectFactory.makeSymbol("_CSETF-AR-CONCEPT-DISAMBIGUATION-TEXT"), SubLObjectFactory.makeSymbol("_CSETF-AR-CONCEPT-PHRASES"), SubLObjectFactory.makeSymbol("_CSETF-AR-CONCEPT-PARTS"), SubLObjectFactory.makeSymbol("_CSETF-AR-CONCEPT-AGGLOMERATIONS"), SubLObjectFactory.makeSymbol("_CSETF-AR-CONCEPT-FORCE"), SubLObjectFactory.makeSymbol("_CSETF-AR-CONCEPT-CONFIDENCE"), SubLObjectFactory.makeSymbol("_CSETF-AR-CONCEPT-OPEN-TERM-SCORE") });
        $sym119$PRINT_AR_CONCEPT = SubLObjectFactory.makeSymbol("PRINT-AR-CONCEPT");
        $sym120$AR_CONCEPT_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("AR-CONCEPT-PRINT-FUNCTION-TRAMPOLINE");
        $list121 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("AR-CONCEPT-P"));
        $sym122$AR_CONCEPT_ID = SubLObjectFactory.makeSymbol("AR-CONCEPT-ID");
        $sym123$_CSETF_AR_CONCEPT_ID = SubLObjectFactory.makeSymbol("_CSETF-AR-CONCEPT-ID");
        $sym124$AR_CONCEPT_CYCL = SubLObjectFactory.makeSymbol("AR-CONCEPT-CYCL");
        $sym125$_CSETF_AR_CONCEPT_CYCL = SubLObjectFactory.makeSymbol("_CSETF-AR-CONCEPT-CYCL");
        $sym126$AR_CONCEPT_DISAMBIGUATION_TEXT = SubLObjectFactory.makeSymbol("AR-CONCEPT-DISAMBIGUATION-TEXT");
        $sym127$_CSETF_AR_CONCEPT_DISAMBIGUATION_TEXT = SubLObjectFactory.makeSymbol("_CSETF-AR-CONCEPT-DISAMBIGUATION-TEXT");
        $sym128$AR_CONCEPT_PHRASES = SubLObjectFactory.makeSymbol("AR-CONCEPT-PHRASES");
        $sym129$_CSETF_AR_CONCEPT_PHRASES = SubLObjectFactory.makeSymbol("_CSETF-AR-CONCEPT-PHRASES");
        $sym130$AR_CONCEPT_PARTS = SubLObjectFactory.makeSymbol("AR-CONCEPT-PARTS");
        $sym131$_CSETF_AR_CONCEPT_PARTS = SubLObjectFactory.makeSymbol("_CSETF-AR-CONCEPT-PARTS");
        $sym132$AR_CONCEPT_AGGLOMERATIONS = SubLObjectFactory.makeSymbol("AR-CONCEPT-AGGLOMERATIONS");
        $sym133$_CSETF_AR_CONCEPT_AGGLOMERATIONS = SubLObjectFactory.makeSymbol("_CSETF-AR-CONCEPT-AGGLOMERATIONS");
        $sym134$AR_CONCEPT_FORCE = SubLObjectFactory.makeSymbol("AR-CONCEPT-FORCE");
        $sym135$_CSETF_AR_CONCEPT_FORCE = SubLObjectFactory.makeSymbol("_CSETF-AR-CONCEPT-FORCE");
        $sym136$AR_CONCEPT_CONFIDENCE = SubLObjectFactory.makeSymbol("AR-CONCEPT-CONFIDENCE");
        $sym137$_CSETF_AR_CONCEPT_CONFIDENCE = SubLObjectFactory.makeSymbol("_CSETF-AR-CONCEPT-CONFIDENCE");
        $sym138$AR_CONCEPT_OPEN_TERM_SCORE = SubLObjectFactory.makeSymbol("AR-CONCEPT-OPEN-TERM-SCORE");
        $sym139$_CSETF_AR_CONCEPT_OPEN_TERM_SCORE = SubLObjectFactory.makeSymbol("_CSETF-AR-CONCEPT-OPEN-TERM-SCORE");
        $kw140$CYCL = SubLObjectFactory.makeKeyword("CYCL");
        $kw141$DISAMBIGUATION_TEXT = SubLObjectFactory.makeKeyword("DISAMBIGUATION-TEXT");
        $kw142$PARTS = SubLObjectFactory.makeKeyword("PARTS");
        $kw143$AGGLOMERATIONS = SubLObjectFactory.makeKeyword("AGGLOMERATIONS");
        $kw144$CONFIDENCE = SubLObjectFactory.makeKeyword("CONFIDENCE");
        $kw145$OPEN_TERM_SCORE = SubLObjectFactory.makeKeyword("OPEN-TERM-SCORE");
        $sym146$MAKE_AR_CONCEPT = SubLObjectFactory.makeSymbol("MAKE-AR-CONCEPT");
        $sym147$VISIT_DEFSTRUCT_OBJECT_AR_CONCEPT_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-AR-CONCEPT-METHOD");
        $str148$__AR_CONCEPT__S__S_ = SubLObjectFactory.makeString("#<AR-CONCEPT ~S ~S>");
        $sym149$SXHASH_AR_CONCEPT_METHOD = SubLObjectFactory.makeSymbol("SXHASH-AR-CONCEPT-METHOD");
        $sym150$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym151$AR_TEMPLATE = SubLObjectFactory.makeSymbol("AR-TEMPLATE");
        $sym152$AR_TEMPLATE_P = SubLObjectFactory.makeSymbol("AR-TEMPLATE-P");
        $list153 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("CONCEPT"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("PROMPT"), (SubLObject)SubLObjectFactory.makeSymbol("CHOICE-TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("AGGLOMERATIONS"));
        $list154 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ID"), (SubLObject)SubLObjectFactory.makeKeyword("CONCEPT"), (SubLObject)SubLObjectFactory.makeKeyword("FORMULA"), (SubLObject)SubLObjectFactory.makeKeyword("PROMPT"), (SubLObject)SubLObjectFactory.makeKeyword("CHOICE-TABLE"), (SubLObject)SubLObjectFactory.makeKeyword("AGGLOMERATIONS"));
        $list155 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AR-TEMPLATE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("AR-TEMPLATE-CONCEPT"), (SubLObject)SubLObjectFactory.makeSymbol("AR-TEMPLATE-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("AR-TEMPLATE-PROMPT"), (SubLObject)SubLObjectFactory.makeSymbol("AR-TEMPLATE-CHOICE-TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("AR-TEMPLATE-AGGLOMERATIONS"));
        $list156 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-AR-TEMPLATE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-AR-TEMPLATE-CONCEPT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-AR-TEMPLATE-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-AR-TEMPLATE-PROMPT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-AR-TEMPLATE-CHOICE-TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-AR-TEMPLATE-AGGLOMERATIONS"));
        $sym157$AR_TEMPLATE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("AR-TEMPLATE-PRINT-FUNCTION-TRAMPOLINE");
        $list158 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("AR-TEMPLATE-P"));
        $sym159$AR_TEMPLATE_ID = SubLObjectFactory.makeSymbol("AR-TEMPLATE-ID");
        $sym160$_CSETF_AR_TEMPLATE_ID = SubLObjectFactory.makeSymbol("_CSETF-AR-TEMPLATE-ID");
        $sym161$AR_TEMPLATE_CONCEPT = SubLObjectFactory.makeSymbol("AR-TEMPLATE-CONCEPT");
        $sym162$_CSETF_AR_TEMPLATE_CONCEPT = SubLObjectFactory.makeSymbol("_CSETF-AR-TEMPLATE-CONCEPT");
        $sym163$AR_TEMPLATE_FORMULA = SubLObjectFactory.makeSymbol("AR-TEMPLATE-FORMULA");
        $sym164$_CSETF_AR_TEMPLATE_FORMULA = SubLObjectFactory.makeSymbol("_CSETF-AR-TEMPLATE-FORMULA");
        $sym165$AR_TEMPLATE_PROMPT = SubLObjectFactory.makeSymbol("AR-TEMPLATE-PROMPT");
        $sym166$_CSETF_AR_TEMPLATE_PROMPT = SubLObjectFactory.makeSymbol("_CSETF-AR-TEMPLATE-PROMPT");
        $sym167$AR_TEMPLATE_CHOICE_TABLE = SubLObjectFactory.makeSymbol("AR-TEMPLATE-CHOICE-TABLE");
        $sym168$_CSETF_AR_TEMPLATE_CHOICE_TABLE = SubLObjectFactory.makeSymbol("_CSETF-AR-TEMPLATE-CHOICE-TABLE");
        $sym169$AR_TEMPLATE_AGGLOMERATIONS = SubLObjectFactory.makeSymbol("AR-TEMPLATE-AGGLOMERATIONS");
        $sym170$_CSETF_AR_TEMPLATE_AGGLOMERATIONS = SubLObjectFactory.makeSymbol("_CSETF-AR-TEMPLATE-AGGLOMERATIONS");
        $kw171$CONCEPT = SubLObjectFactory.makeKeyword("CONCEPT");
        $kw172$FORMULA = SubLObjectFactory.makeKeyword("FORMULA");
        $kw173$PROMPT = SubLObjectFactory.makeKeyword("PROMPT");
        $kw174$CHOICE_TABLE = SubLObjectFactory.makeKeyword("CHOICE-TABLE");
        $sym175$MAKE_AR_TEMPLATE = SubLObjectFactory.makeSymbol("MAKE-AR-TEMPLATE");
        $sym176$VISIT_DEFSTRUCT_OBJECT_AR_TEMPLATE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-AR-TEMPLATE-METHOD");
        $sym177$SXHASH_AR_TEMPLATE_METHOD = SubLObjectFactory.makeSymbol("SXHASH-AR-TEMPLATE-METHOD");
        $sym178$CONSP = SubLObjectFactory.makeSymbol("CONSP");
        $sym179$AR_STATE = SubLObjectFactory.makeSymbol("AR-STATE");
        $sym180$AR_STATE_P = SubLObjectFactory.makeSymbol("AR-STATE-P");
        $list181 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("ISG"), SubLObjectFactory.makeSymbol("INDEX"), SubLObjectFactory.makeSymbol("SOURCE-SENTENCES"), SubLObjectFactory.makeSymbol("FOCUS-SENTENCE"), SubLObjectFactory.makeSymbol("COMPLETED-SENTENCES"), SubLObjectFactory.makeSymbol("UNKNOWN-PHRASES"), SubLObjectFactory.makeSymbol("REJECTED-PHRASES"), SubLObjectFactory.makeSymbol("IRRELEVANT-PHRASES"), SubLObjectFactory.makeSymbol("AMBIGUOUS-PHRASES"), SubLObjectFactory.makeSymbol("ASSUMED-PHRASES"), SubLObjectFactory.makeSymbol("PENDING-PHRASES"), SubLObjectFactory.makeSymbol("ACCEPTED-PHRASES"), SubLObjectFactory.makeSymbol("PENDING-CONCEPTS"), SubLObjectFactory.makeSymbol("ACCEPTED-CONCEPTS"), SubLObjectFactory.makeSymbol("CANDIDATE-CYCLS"), SubLObjectFactory.makeSymbol("ASSERTED-ASSERTIONS"), SubLObjectFactory.makeSymbol("TERM-TEMPLATES"), SubLObjectFactory.makeSymbol("ASSERT-TEMPLATES") });
        $list182 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("ISG"), SubLObjectFactory.makeKeyword("INDEX"), SubLObjectFactory.makeKeyword("SOURCE-SENTENCES"), SubLObjectFactory.makeKeyword("FOCUS-SENTENCE"), SubLObjectFactory.makeKeyword("COMPLETED-SENTENCES"), SubLObjectFactory.makeKeyword("UNKNOWN-PHRASES"), SubLObjectFactory.makeKeyword("REJECTED-PHRASES"), SubLObjectFactory.makeKeyword("IRRELEVANT-PHRASES"), SubLObjectFactory.makeKeyword("AMBIGUOUS-PHRASES"), SubLObjectFactory.makeKeyword("ASSUMED-PHRASES"), SubLObjectFactory.makeKeyword("PENDING-PHRASES"), SubLObjectFactory.makeKeyword("ACCEPTED-PHRASES"), SubLObjectFactory.makeKeyword("PENDING-CONCEPTS"), SubLObjectFactory.makeKeyword("ACCEPTED-CONCEPTS"), SubLObjectFactory.makeKeyword("CANDIDATE-CYCLS"), SubLObjectFactory.makeKeyword("ASSERTED-ASSERTIONS"), SubLObjectFactory.makeKeyword("TERM-TEMPLATES"), SubLObjectFactory.makeKeyword("ASSERT-TEMPLATES") });
        $list183 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("AR-STATE-ISG"), SubLObjectFactory.makeSymbol("AR-STATE-INDEX"), SubLObjectFactory.makeSymbol("AR-STATE-SOURCE-SENTENCES"), SubLObjectFactory.makeSymbol("AR-STATE-FOCUS-SENTENCE"), SubLObjectFactory.makeSymbol("AR-STATE-COMPLETED-SENTENCES"), SubLObjectFactory.makeSymbol("AR-STATE-UNKNOWN-PHRASES"), SubLObjectFactory.makeSymbol("AR-STATE-REJECTED-PHRASES"), SubLObjectFactory.makeSymbol("AR-STATE-IRRELEVANT-PHRASES"), SubLObjectFactory.makeSymbol("AR-STATE-AMBIGUOUS-PHRASES"), SubLObjectFactory.makeSymbol("AR-STATE-ASSUMED-PHRASES"), SubLObjectFactory.makeSymbol("AR-STATE-PENDING-PHRASES"), SubLObjectFactory.makeSymbol("AR-STATE-ACCEPTED-PHRASES"), SubLObjectFactory.makeSymbol("AR-STATE-PENDING-CONCEPTS"), SubLObjectFactory.makeSymbol("AR-STATE-ACCEPTED-CONCEPTS"), SubLObjectFactory.makeSymbol("AR-STATE-CANDIDATE-CYCLS"), SubLObjectFactory.makeSymbol("AR-STATE-ASSERTED-ASSERTIONS"), SubLObjectFactory.makeSymbol("AR-STATE-TERM-TEMPLATES"), SubLObjectFactory.makeSymbol("AR-STATE-ASSERT-TEMPLATES") });
        $list184 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-AR-STATE-ISG"), SubLObjectFactory.makeSymbol("_CSETF-AR-STATE-INDEX"), SubLObjectFactory.makeSymbol("_CSETF-AR-STATE-SOURCE-SENTENCES"), SubLObjectFactory.makeSymbol("_CSETF-AR-STATE-FOCUS-SENTENCE"), SubLObjectFactory.makeSymbol("_CSETF-AR-STATE-COMPLETED-SENTENCES"), SubLObjectFactory.makeSymbol("_CSETF-AR-STATE-UNKNOWN-PHRASES"), SubLObjectFactory.makeSymbol("_CSETF-AR-STATE-REJECTED-PHRASES"), SubLObjectFactory.makeSymbol("_CSETF-AR-STATE-IRRELEVANT-PHRASES"), SubLObjectFactory.makeSymbol("_CSETF-AR-STATE-AMBIGUOUS-PHRASES"), SubLObjectFactory.makeSymbol("_CSETF-AR-STATE-ASSUMED-PHRASES"), SubLObjectFactory.makeSymbol("_CSETF-AR-STATE-PENDING-PHRASES"), SubLObjectFactory.makeSymbol("_CSETF-AR-STATE-ACCEPTED-PHRASES"), SubLObjectFactory.makeSymbol("_CSETF-AR-STATE-PENDING-CONCEPTS"), SubLObjectFactory.makeSymbol("_CSETF-AR-STATE-ACCEPTED-CONCEPTS"), SubLObjectFactory.makeSymbol("_CSETF-AR-STATE-CANDIDATE-CYCLS"), SubLObjectFactory.makeSymbol("_CSETF-AR-STATE-ASSERTED-ASSERTIONS"), SubLObjectFactory.makeSymbol("_CSETF-AR-STATE-TERM-TEMPLATES"), SubLObjectFactory.makeSymbol("_CSETF-AR-STATE-ASSERT-TEMPLATES") });
        $sym185$AR_STATE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("AR-STATE-PRINT-FUNCTION-TRAMPOLINE");
        $list186 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("AR-STATE-P"));
        $sym187$AR_STATE_ISG = SubLObjectFactory.makeSymbol("AR-STATE-ISG");
        $sym188$_CSETF_AR_STATE_ISG = SubLObjectFactory.makeSymbol("_CSETF-AR-STATE-ISG");
        $sym189$AR_STATE_INDEX = SubLObjectFactory.makeSymbol("AR-STATE-INDEX");
        $sym190$_CSETF_AR_STATE_INDEX = SubLObjectFactory.makeSymbol("_CSETF-AR-STATE-INDEX");
        $sym191$AR_STATE_SOURCE_SENTENCES = SubLObjectFactory.makeSymbol("AR-STATE-SOURCE-SENTENCES");
        $sym192$_CSETF_AR_STATE_SOURCE_SENTENCES = SubLObjectFactory.makeSymbol("_CSETF-AR-STATE-SOURCE-SENTENCES");
        $sym193$AR_STATE_FOCUS_SENTENCE = SubLObjectFactory.makeSymbol("AR-STATE-FOCUS-SENTENCE");
        $sym194$_CSETF_AR_STATE_FOCUS_SENTENCE = SubLObjectFactory.makeSymbol("_CSETF-AR-STATE-FOCUS-SENTENCE");
        $sym195$AR_STATE_COMPLETED_SENTENCES = SubLObjectFactory.makeSymbol("AR-STATE-COMPLETED-SENTENCES");
        $sym196$_CSETF_AR_STATE_COMPLETED_SENTENCES = SubLObjectFactory.makeSymbol("_CSETF-AR-STATE-COMPLETED-SENTENCES");
        $sym197$AR_STATE_UNKNOWN_PHRASES = SubLObjectFactory.makeSymbol("AR-STATE-UNKNOWN-PHRASES");
        $sym198$_CSETF_AR_STATE_UNKNOWN_PHRASES = SubLObjectFactory.makeSymbol("_CSETF-AR-STATE-UNKNOWN-PHRASES");
        $sym199$AR_STATE_REJECTED_PHRASES = SubLObjectFactory.makeSymbol("AR-STATE-REJECTED-PHRASES");
        $sym200$_CSETF_AR_STATE_REJECTED_PHRASES = SubLObjectFactory.makeSymbol("_CSETF-AR-STATE-REJECTED-PHRASES");
        $sym201$AR_STATE_IRRELEVANT_PHRASES = SubLObjectFactory.makeSymbol("AR-STATE-IRRELEVANT-PHRASES");
        $sym202$_CSETF_AR_STATE_IRRELEVANT_PHRASES = SubLObjectFactory.makeSymbol("_CSETF-AR-STATE-IRRELEVANT-PHRASES");
        $sym203$AR_STATE_AMBIGUOUS_PHRASES = SubLObjectFactory.makeSymbol("AR-STATE-AMBIGUOUS-PHRASES");
        $sym204$_CSETF_AR_STATE_AMBIGUOUS_PHRASES = SubLObjectFactory.makeSymbol("_CSETF-AR-STATE-AMBIGUOUS-PHRASES");
        $sym205$AR_STATE_ASSUMED_PHRASES = SubLObjectFactory.makeSymbol("AR-STATE-ASSUMED-PHRASES");
        $sym206$_CSETF_AR_STATE_ASSUMED_PHRASES = SubLObjectFactory.makeSymbol("_CSETF-AR-STATE-ASSUMED-PHRASES");
        $sym207$AR_STATE_PENDING_PHRASES = SubLObjectFactory.makeSymbol("AR-STATE-PENDING-PHRASES");
        $sym208$_CSETF_AR_STATE_PENDING_PHRASES = SubLObjectFactory.makeSymbol("_CSETF-AR-STATE-PENDING-PHRASES");
        $sym209$AR_STATE_ACCEPTED_PHRASES = SubLObjectFactory.makeSymbol("AR-STATE-ACCEPTED-PHRASES");
        $sym210$_CSETF_AR_STATE_ACCEPTED_PHRASES = SubLObjectFactory.makeSymbol("_CSETF-AR-STATE-ACCEPTED-PHRASES");
        $sym211$AR_STATE_PENDING_CONCEPTS = SubLObjectFactory.makeSymbol("AR-STATE-PENDING-CONCEPTS");
        $sym212$_CSETF_AR_STATE_PENDING_CONCEPTS = SubLObjectFactory.makeSymbol("_CSETF-AR-STATE-PENDING-CONCEPTS");
        $sym213$AR_STATE_ACCEPTED_CONCEPTS = SubLObjectFactory.makeSymbol("AR-STATE-ACCEPTED-CONCEPTS");
        $sym214$_CSETF_AR_STATE_ACCEPTED_CONCEPTS = SubLObjectFactory.makeSymbol("_CSETF-AR-STATE-ACCEPTED-CONCEPTS");
        $sym215$AR_STATE_CANDIDATE_CYCLS = SubLObjectFactory.makeSymbol("AR-STATE-CANDIDATE-CYCLS");
        $sym216$_CSETF_AR_STATE_CANDIDATE_CYCLS = SubLObjectFactory.makeSymbol("_CSETF-AR-STATE-CANDIDATE-CYCLS");
        $sym217$AR_STATE_ASSERTED_ASSERTIONS = SubLObjectFactory.makeSymbol("AR-STATE-ASSERTED-ASSERTIONS");
        $sym218$_CSETF_AR_STATE_ASSERTED_ASSERTIONS = SubLObjectFactory.makeSymbol("_CSETF-AR-STATE-ASSERTED-ASSERTIONS");
        $sym219$AR_STATE_TERM_TEMPLATES = SubLObjectFactory.makeSymbol("AR-STATE-TERM-TEMPLATES");
        $sym220$_CSETF_AR_STATE_TERM_TEMPLATES = SubLObjectFactory.makeSymbol("_CSETF-AR-STATE-TERM-TEMPLATES");
        $sym221$AR_STATE_ASSERT_TEMPLATES = SubLObjectFactory.makeSymbol("AR-STATE-ASSERT-TEMPLATES");
        $sym222$_CSETF_AR_STATE_ASSERT_TEMPLATES = SubLObjectFactory.makeSymbol("_CSETF-AR-STATE-ASSERT-TEMPLATES");
        $kw223$ISG = SubLObjectFactory.makeKeyword("ISG");
        $kw224$INDEX = SubLObjectFactory.makeKeyword("INDEX");
        $kw225$SOURCE_SENTENCES = SubLObjectFactory.makeKeyword("SOURCE-SENTENCES");
        $kw226$FOCUS_SENTENCE = SubLObjectFactory.makeKeyword("FOCUS-SENTENCE");
        $kw227$COMPLETED_SENTENCES = SubLObjectFactory.makeKeyword("COMPLETED-SENTENCES");
        $kw228$UNKNOWN_PHRASES = SubLObjectFactory.makeKeyword("UNKNOWN-PHRASES");
        $kw229$REJECTED_PHRASES = SubLObjectFactory.makeKeyword("REJECTED-PHRASES");
        $kw230$IRRELEVANT_PHRASES = SubLObjectFactory.makeKeyword("IRRELEVANT-PHRASES");
        $kw231$AMBIGUOUS_PHRASES = SubLObjectFactory.makeKeyword("AMBIGUOUS-PHRASES");
        $kw232$ASSUMED_PHRASES = SubLObjectFactory.makeKeyword("ASSUMED-PHRASES");
        $kw233$PENDING_PHRASES = SubLObjectFactory.makeKeyword("PENDING-PHRASES");
        $kw234$ACCEPTED_PHRASES = SubLObjectFactory.makeKeyword("ACCEPTED-PHRASES");
        $kw235$PENDING_CONCEPTS = SubLObjectFactory.makeKeyword("PENDING-CONCEPTS");
        $kw236$ACCEPTED_CONCEPTS = SubLObjectFactory.makeKeyword("ACCEPTED-CONCEPTS");
        $kw237$CANDIDATE_CYCLS = SubLObjectFactory.makeKeyword("CANDIDATE-CYCLS");
        $kw238$ASSERTED_ASSERTIONS = SubLObjectFactory.makeKeyword("ASSERTED-ASSERTIONS");
        $kw239$TERM_TEMPLATES = SubLObjectFactory.makeKeyword("TERM-TEMPLATES");
        $kw240$ASSERT_TEMPLATES = SubLObjectFactory.makeKeyword("ASSERT-TEMPLATES");
        $sym241$MAKE_AR_STATE = SubLObjectFactory.makeSymbol("MAKE-AR-STATE");
        $sym242$VISIT_DEFSTRUCT_OBJECT_AR_STATE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-AR-STATE-METHOD");
        $sym243$AR_PHRASE_SPAN_LENGTH_ = SubLObjectFactory.makeSymbol("AR-PHRASE-SPAN-LENGTH>");
        $sym244$AR_CONCEPT_ASSERTION_ = SubLObjectFactory.makeSymbol("AR-CONCEPT-ASSERTION?");
        $sym245$AR_CONCEPT_QUERY_ = SubLObjectFactory.makeSymbol("AR-CONCEPT-QUERY?");
        $sym246$_ = SubLObjectFactory.makeSymbol("<");
        $kw247$ASSUMED = SubLObjectFactory.makeKeyword("ASSUMED");
        $sym248$NOT_EQL = SubLObjectFactory.makeSymbol("NOT-EQL");
        $kw249$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $str250$no_discourse_context = SubLObjectFactory.makeString("no discourse-context");
        $kw251$PENDING = SubLObjectFactory.makeKeyword("PENDING");
        $sym252$RKF_DISC_IMPLIED_INDEXICALS_FORMULA_ = SubLObjectFactory.makeSymbol("RKF-DISC-IMPLIED-INDEXICALS-FORMULA?");
        $kw253$AMBIGUOUS = SubLObjectFactory.makeKeyword("AMBIGUOUS");
        $sym254$MEMBER = SubLObjectFactory.makeSymbol("MEMBER");
        $sym255$AR_DETERMINE_CONCEPT_SENTENCES = SubLObjectFactory.makeSymbol("AR-DETERMINE-CONCEPT-SENTENCES");
        $sym256$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list257 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*AR-CONCEPT-GROUNDING-MAP*"), (SubLObject)rkf_assisted_reader.NIL));
        $list258 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENSURE-AR-CONCEPT-GROUNDING-MAP"));
        $sym259$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $kw260$GROUNDED = SubLObjectFactory.makeKeyword("GROUNDED");
        $kw261$UNGROUNDED = SubLObjectFactory.makeKeyword("UNGROUNDED");
        $kw262$IN_PROGRESS = SubLObjectFactory.makeKeyword("IN-PROGRESS");
        $int263$10000 = SubLObjectFactory.makeInteger(10000);
        $const264$TheResultOfParsing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheResultOfParsing"));
        $sym265$_ = SubLObjectFactory.makeSymbol(">");
        $sym266$AR_CONCEPT_COMPLEXITY = SubLObjectFactory.makeSymbol("AR-CONCEPT-COMPLEXITY");
        $sym267$AR_PHRASE_DIVIDE_EQ_BEST_LAMBDA_SUBSTITUTE = SubLObjectFactory.makeSymbol("AR-PHRASE-DIVIDE-EQ-BEST-LAMBDA-SUBSTITUTE");
        $kw268$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $const269$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $const270$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $str271$Assisted_Reader_reading_texts = SubLObjectFactory.makeString("Assisted Reader reading texts");
        $sym272$RKF_AR_ACT_ADD_SOURCE_TEXTS_BACKGROUND_INTERNAL = SubLObjectFactory.makeSymbol("RKF-AR-ACT-ADD-SOURCE-TEXTS-BACKGROUND-INTERNAL");
        $kw273$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym274$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $sym275$HLMT_P = SubLObjectFactory.makeSymbol("HLMT-P");
        $str276$Assisted_Reader_rewriting_a_sente = SubLObjectFactory.makeString("Assisted Reader rewriting a sentence");
        $sym277$RKF_AR_ACT_ADD_REWRITE_TEXTS_BACKGROUND_INTERNAL = SubLObjectFactory.makeSymbol("RKF-AR-ACT-ADD-REWRITE-TEXTS-BACKGROUND-INTERNAL");
        $sym278$RKF_SENTENCE_READER = SubLObjectFactory.makeSymbol("RKF-SENTENCE-READER");
        $sym279$RKF_QUESTION_READER = SubLObjectFactory.makeSymbol("RKF-QUESTION-READER");
        $sym280$RKF_CONCEPT_HARVESTER = SubLObjectFactory.makeSymbol("RKF-CONCEPT-HARVESTER");
        $list281 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RKF-QUESTION-READER"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuestionTemplate"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RKF-SENTENCE-READER"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("STemplate"))));
        $kw282$TEXT_PROCESSING = SubLObjectFactory.makeKeyword("TEXT-PROCESSING");
        $kw283$QUESTION_PROCESSING = SubLObjectFactory.makeKeyword("QUESTION-PROCESSING");
        $sym284$VECTOR = SubLObjectFactory.makeSymbol("VECTOR");
        $kw285$UNINTERESTING = SubLObjectFactory.makeKeyword("UNINTERESTING");
        $sym286$RTP_TEMPLATE_CATEGORY_ = SubLObjectFactory.makeSymbol("RTP-TEMPLATE-CATEGORY?");
        $const287$STemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("STemplate"));
        $sym288$UNKNOWN_INSTANCE_INDEXED_EXPRESSION_ = SubLObjectFactory.makeSymbol("UNKNOWN-INSTANCE-INDEXED-EXPRESSION?");
        $sym289$ROP_FROM_UNKNOWN_INSTANCE_INDEXED_FN = SubLObjectFactory.makeSymbol("ROP-FROM-UNKNOWN-INSTANCE-INDEXED-FN");
        $sym290$ITP_SEQUEL = SubLObjectFactory.makeSymbol("ITP-SEQUEL");
        $str291$UIA_use = SubLObjectFactory.makeString("UIA-use");
        $str292$Medium = SubLObjectFactory.makeString("Medium");
        $kw293$IRRELEVANT = SubLObjectFactory.makeKeyword("IRRELEVANT");
        $kw294$ACCEPTED = SubLObjectFactory.makeKeyword("ACCEPTED");
        $kw295$REJECTED = SubLObjectFactory.makeKeyword("REJECTED");
        $const296$RewriteSequenceFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RewriteSequenceFn"));
        $const297$elementOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("elementOf"));
        $kw298$NO_DISAMBIGS = SubLObjectFactory.makeKeyword("NO-DISAMBIGS");
        $const299$TheNthFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheNthFn"));
        $const300$TheSetOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf"));
        $const301$Thing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"));
        $sym302$RKF_REFORMULATABLE_TERM_ = SubLObjectFactory.makeSymbol("RKF-REFORMULATABLE-TERM?");
        $sym303$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $list304 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VariableFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheVPParse")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheActiveSubject")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheResultOfParsing")));
        $const305$genlFunctions = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlFunctions"));
        $const306$NLTagFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLTagFn"));
        $const307$NLUtteranceAttribute = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLUtteranceAttribute"));
        $kw308$INITIALIZED = SubLObjectFactory.makeKeyword("INITIALIZED");
        $list309 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTRAINTS")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym310$_RKF_AR_ADDITIONAL_CONSTRAINTS_ = SubLObjectFactory.makeSymbol("*RKF-AR-ADDITIONAL-CONSTRAINTS*");
        $sym311$KEYWORD_IMPOSTOR_P = SubLObjectFactory.makeSymbol("KEYWORD-IMPOSTOR-P");
        $sym312$KEYWORD_FROM_IMPOSTOR = SubLObjectFactory.makeSymbol("KEYWORD-FROM-IMPOSTOR");
        $list313 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheResultOfParsing")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheCoordinationSet")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RewriteSequenceFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSpec")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheInstance")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("The")));
        $sym314$RKF_AR_PHRASE_SUBSUMED = SubLObjectFactory.makeSymbol("RKF-AR-PHRASE-SUBSUMED");
        $const315$TruthFunction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TruthFunction"));
        $list316 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSpec")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheInstance")));
        $sym317$RKF_AR_CONTEXT_REFERENCE_P = SubLObjectFactory.makeSymbol("RKF-AR-CONTEXT-REFERENCE-P");
        $const318$TheSpec = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSpec"));
        $const319$TheInstance = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheInstance"));
        $sym320$CDR = SubLObjectFactory.makeSymbol("CDR");
        $sym321$CAR = SubLObjectFactory.makeSymbol("CAR");
        $sym322$RELATION_ARGS_SORTED_BY_RESTRICTION = SubLObjectFactory.makeSymbol("RELATION-ARGS-SORTED-BY-RESTRICTION");
        $sym323$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $sym324$_RELATION_ARGS_SORTED_BY_RESTRICTION_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*RELATION-ARGS-SORTED-BY-RESTRICTION-CACHING-STATE*");
        $int325$64 = SubLObjectFactory.makeInteger(64);
        $sym326$ALL_RELATION_ARGS = SubLObjectFactory.makeSymbol("ALL-RELATION-ARGS");
        $sym327$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const328$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $sym329$_ALL_RELATION_ARGS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*ALL-RELATION-ARGS-CACHING-STATE*");
    }
    
    public static final class $ar_sentence_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $plaintext;
        public SubLObject $token_vector;
        public SubLObject $clarifications;
        public SubLObject $source_sentence;
        public SubLObject $phrases;
        private static final SubLStructDeclNative structDecl;
        
        public $ar_sentence_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$plaintext = (SubLObject)CommonSymbols.NIL;
            this.$token_vector = (SubLObject)CommonSymbols.NIL;
            this.$clarifications = (SubLObject)CommonSymbols.NIL;
            this.$source_sentence = (SubLObject)CommonSymbols.NIL;
            this.$phrases = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$ar_sentence_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$id;
        }
        
        public SubLObject getField3() {
            return this.$plaintext;
        }
        
        public SubLObject getField4() {
            return this.$token_vector;
        }
        
        public SubLObject getField5() {
            return this.$clarifications;
        }
        
        public SubLObject getField6() {
            return this.$source_sentence;
        }
        
        public SubLObject getField7() {
            return this.$phrases;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$plaintext = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$token_vector = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$clarifications = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$source_sentence = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$phrases = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$ar_sentence_native.class, rkf_assisted_reader.$sym3$AR_SENTENCE, rkf_assisted_reader.$sym4$AR_SENTENCE_P, rkf_assisted_reader.$list5, rkf_assisted_reader.$list6, new String[] { "$id", "$plaintext", "$token_vector", "$clarifications", "$source_sentence", "$phrases" }, rkf_assisted_reader.$list7, rkf_assisted_reader.$list8, rkf_assisted_reader.$sym9$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $ar_sentence_p$UnaryFunction extends UnaryFunction
    {
        public $ar_sentence_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("AR-SENTENCE-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return rkf_assisted_reader.ar_sentence_p(arg1);
        }
    }
    
    public static final class $ar_token_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $text;
        public SubLObject $sentence;
        public SubLObject $number;
        public SubLObject $phrases;
        private static final SubLStructDeclNative structDecl;
        
        public $ar_token_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$text = (SubLObject)CommonSymbols.NIL;
            this.$sentence = (SubLObject)CommonSymbols.NIL;
            this.$number = (SubLObject)CommonSymbols.NIL;
            this.$phrases = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$ar_token_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$id;
        }
        
        public SubLObject getField3() {
            return this.$text;
        }
        
        public SubLObject getField4() {
            return this.$sentence;
        }
        
        public SubLObject getField5() {
            return this.$number;
        }
        
        public SubLObject getField6() {
            return this.$phrases;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$text = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$sentence = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$number = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$phrases = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$ar_token_native.class, rkf_assisted_reader.$sym39$AR_TOKEN, rkf_assisted_reader.$sym40$AR_TOKEN_P, rkf_assisted_reader.$list41, rkf_assisted_reader.$list42, new String[] { "$id", "$text", "$sentence", "$number", "$phrases" }, rkf_assisted_reader.$list43, rkf_assisted_reader.$list44, rkf_assisted_reader.$sym45$PRINT_AR_TOKEN);
        }
    }
    
    public static final class $ar_token_p$UnaryFunction extends UnaryFunction
    {
        public $ar_token_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("AR-TOKEN-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return rkf_assisted_reader.ar_token_p(arg1);
        }
    }
    
    public static final class $ar_phrase_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $status;
        public SubLObject $token_list;
        public SubLObject $sentence;
        public SubLObject $concepts;
        public SubLObject $rejected_concepts;
        public SubLObject $disambiguated_concept;
        public SubLObject $surrogate;
        public SubLObject $constraint;
        public SubLObject $force;
        private static final SubLStructDeclNative structDecl;
        
        public $ar_phrase_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$status = (SubLObject)CommonSymbols.NIL;
            this.$token_list = (SubLObject)CommonSymbols.NIL;
            this.$sentence = (SubLObject)CommonSymbols.NIL;
            this.$concepts = (SubLObject)CommonSymbols.NIL;
            this.$rejected_concepts = (SubLObject)CommonSymbols.NIL;
            this.$disambiguated_concept = (SubLObject)CommonSymbols.NIL;
            this.$surrogate = (SubLObject)CommonSymbols.NIL;
            this.$constraint = (SubLObject)CommonSymbols.NIL;
            this.$force = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$ar_phrase_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$id;
        }
        
        public SubLObject getField3() {
            return this.$status;
        }
        
        public SubLObject getField4() {
            return this.$token_list;
        }
        
        public SubLObject getField5() {
            return this.$sentence;
        }
        
        public SubLObject getField6() {
            return this.$concepts;
        }
        
        public SubLObject getField7() {
            return this.$rejected_concepts;
        }
        
        public SubLObject getField8() {
            return this.$disambiguated_concept;
        }
        
        public SubLObject getField9() {
            return this.$surrogate;
        }
        
        public SubLObject getField10() {
            return this.$constraint;
        }
        
        public SubLObject getField11() {
            return this.$force;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$status = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$token_list = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$sentence = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$concepts = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$rejected_concepts = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$disambiguated_concept = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$surrogate = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$constraint = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$force = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$ar_phrase_native.class, rkf_assisted_reader.$sym65$AR_PHRASE, rkf_assisted_reader.$sym38$AR_PHRASE_P, rkf_assisted_reader.$list66, rkf_assisted_reader.$list67, new String[] { "$id", "$status", "$token_list", "$sentence", "$concepts", "$rejected_concepts", "$disambiguated_concept", "$surrogate", "$constraint", "$force" }, rkf_assisted_reader.$list68, rkf_assisted_reader.$list69, rkf_assisted_reader.$sym70$PRINT_AR_PHRASE);
        }
    }
    
    public static final class $ar_phrase_p$UnaryFunction extends UnaryFunction
    {
        public $ar_phrase_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("AR-PHRASE-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return rkf_assisted_reader.ar_phrase_p(arg1);
        }
    }
    
    public static final class $ar_concept_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $cycl;
        public SubLObject $disambiguation_text;
        public SubLObject $phrases;
        public SubLObject $parts;
        public SubLObject $agglomerations;
        public SubLObject $force;
        public SubLObject $confidence;
        public SubLObject $open_term_score;
        private static final SubLStructDeclNative structDecl;
        
        public $ar_concept_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$cycl = (SubLObject)CommonSymbols.NIL;
            this.$disambiguation_text = (SubLObject)CommonSymbols.NIL;
            this.$phrases = (SubLObject)CommonSymbols.NIL;
            this.$parts = (SubLObject)CommonSymbols.NIL;
            this.$agglomerations = (SubLObject)CommonSymbols.NIL;
            this.$force = (SubLObject)CommonSymbols.NIL;
            this.$confidence = (SubLObject)CommonSymbols.NIL;
            this.$open_term_score = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$ar_concept_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$id;
        }
        
        public SubLObject getField3() {
            return this.$cycl;
        }
        
        public SubLObject getField4() {
            return this.$disambiguation_text;
        }
        
        public SubLObject getField5() {
            return this.$phrases;
        }
        
        public SubLObject getField6() {
            return this.$parts;
        }
        
        public SubLObject getField7() {
            return this.$agglomerations;
        }
        
        public SubLObject getField8() {
            return this.$force;
        }
        
        public SubLObject getField9() {
            return this.$confidence;
        }
        
        public SubLObject getField10() {
            return this.$open_term_score;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$cycl = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$disambiguation_text = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$phrases = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$parts = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$agglomerations = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$force = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$confidence = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$open_term_score = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$ar_concept_native.class, rkf_assisted_reader.$sym114$AR_CONCEPT, rkf_assisted_reader.$sym107$AR_CONCEPT_P, rkf_assisted_reader.$list115, rkf_assisted_reader.$list116, new String[] { "$id", "$cycl", "$disambiguation_text", "$phrases", "$parts", "$agglomerations", "$force", "$confidence", "$open_term_score" }, rkf_assisted_reader.$list117, rkf_assisted_reader.$list118, rkf_assisted_reader.$sym119$PRINT_AR_CONCEPT);
        }
    }
    
    public static final class $ar_concept_p$UnaryFunction extends UnaryFunction
    {
        public $ar_concept_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("AR-CONCEPT-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return rkf_assisted_reader.ar_concept_p(arg1);
        }
    }
    
    public static final class $ar_template_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $concept;
        public SubLObject $formula;
        public SubLObject $prompt;
        public SubLObject $choice_table;
        public SubLObject $agglomerations;
        private static final SubLStructDeclNative structDecl;
        
        public $ar_template_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$concept = (SubLObject)CommonSymbols.NIL;
            this.$formula = (SubLObject)CommonSymbols.NIL;
            this.$prompt = (SubLObject)CommonSymbols.NIL;
            this.$choice_table = (SubLObject)CommonSymbols.NIL;
            this.$agglomerations = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$ar_template_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$id;
        }
        
        public SubLObject getField3() {
            return this.$concept;
        }
        
        public SubLObject getField4() {
            return this.$formula;
        }
        
        public SubLObject getField5() {
            return this.$prompt;
        }
        
        public SubLObject getField6() {
            return this.$choice_table;
        }
        
        public SubLObject getField7() {
            return this.$agglomerations;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$concept = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$formula = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$prompt = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$choice_table = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$agglomerations = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$ar_template_native.class, rkf_assisted_reader.$sym151$AR_TEMPLATE, 
            		rkf_assisted_reader.$sym152$AR_TEMPLATE_P, rkf_assisted_reader.$list153, rkf_assisted_reader.$list154, new String[] { 
            				"$id", "$concept", "$formula", "$prompt", "$choice_table", "$agglomerations" }, rkf_assisted_reader.$list155,
            		rkf_assisted_reader.$list156, rkf_assisted_reader.$sym9$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $ar_template_p$UnaryFunction extends UnaryFunction
    {
        public $ar_template_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("AR-TEMPLATE-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return rkf_assisted_reader.ar_template_p(arg1);
        }
    }
    
    public static final class $ar_state_native extends SubLStructNative
    {
        public SubLObject $isg;
        public SubLObject $index;
        public SubLObject $source_sentences;
        public SubLObject $focus_sentence;
        public SubLObject $completed_sentences;
        public SubLObject $unknown_phrases;
        public SubLObject $rejected_phrases;
        public SubLObject $irrelevant_phrases;
        public SubLObject $ambiguous_phrases;
        public SubLObject $assumed_phrases;
        public SubLObject $pending_phrases;
        public SubLObject $accepted_phrases;
        public SubLObject $pending_concepts;
        public SubLObject $accepted_concepts;
        public SubLObject $candidate_cycls;
        public SubLObject $asserted_assertions;
        public SubLObject $term_templates;
        public SubLObject $assert_templates;
        private static final SubLStructDeclNative structDecl;
        
        public $ar_state_native() {
            this.$isg = (SubLObject)CommonSymbols.NIL;
            this.$index = (SubLObject)CommonSymbols.NIL;
            this.$source_sentences = (SubLObject)CommonSymbols.NIL;
            this.$focus_sentence = (SubLObject)CommonSymbols.NIL;
            this.$completed_sentences = (SubLObject)CommonSymbols.NIL;
            this.$unknown_phrases = (SubLObject)CommonSymbols.NIL;
            this.$rejected_phrases = (SubLObject)CommonSymbols.NIL;
            this.$irrelevant_phrases = (SubLObject)CommonSymbols.NIL;
            this.$ambiguous_phrases = (SubLObject)CommonSymbols.NIL;
            this.$assumed_phrases = (SubLObject)CommonSymbols.NIL;
            this.$pending_phrases = (SubLObject)CommonSymbols.NIL;
            this.$accepted_phrases = (SubLObject)CommonSymbols.NIL;
            this.$pending_concepts = (SubLObject)CommonSymbols.NIL;
            this.$accepted_concepts = (SubLObject)CommonSymbols.NIL;
            this.$candidate_cycls = (SubLObject)CommonSymbols.NIL;
            this.$asserted_assertions = (SubLObject)CommonSymbols.NIL;
            this.$term_templates = (SubLObject)CommonSymbols.NIL;
            this.$assert_templates = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$ar_state_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$isg;
        }
        
        public SubLObject getField3() {
            return this.$index;
        }
        
        public SubLObject getField4() {
            return this.$source_sentences;
        }
        
        public SubLObject getField5() {
            return this.$focus_sentence;
        }
        
        public SubLObject getField6() {
            return this.$completed_sentences;
        }
        
        public SubLObject getField7() {
            return this.$unknown_phrases;
        }
        
        public SubLObject getField8() {
            return this.$rejected_phrases;
        }
        
        public SubLObject getField9() {
            return this.$irrelevant_phrases;
        }
        
        public SubLObject getField10() {
            return this.$ambiguous_phrases;
        }
        
        public SubLObject getField11() {
            return this.$assumed_phrases;
        }
        
        public SubLObject getField12() {
            return this.$pending_phrases;
        }
        
        public SubLObject getField13() {
            return this.$accepted_phrases;
        }
        
        public SubLObject getField14() {
            return this.$pending_concepts;
        }
        
        public SubLObject getField15() {
            return this.$accepted_concepts;
        }
        
        public SubLObject getField16() {
            return this.$candidate_cycls;
        }
        
        public SubLObject getField17() {
            return this.$asserted_assertions;
        }
        
        public SubLObject getField18() {
            return this.$term_templates;
        }
        
        public SubLObject getField19() {
            return this.$assert_templates;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$isg = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$index = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$source_sentences = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$focus_sentence = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$completed_sentences = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$unknown_phrases = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$rejected_phrases = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$irrelevant_phrases = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$ambiguous_phrases = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$assumed_phrases = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$pending_phrases = value;
        }
        
        public SubLObject setField13(final SubLObject value) {
            return this.$accepted_phrases = value;
        }
        
        public SubLObject setField14(final SubLObject value) {
            return this.$pending_concepts = value;
        }
        
        public SubLObject setField15(final SubLObject value) {
            return this.$accepted_concepts = value;
        }
        
        public SubLObject setField16(final SubLObject value) {
            return this.$candidate_cycls = value;
        }
        
        public SubLObject setField17(final SubLObject value) {
            return this.$asserted_assertions = value;
        }
        
        public SubLObject setField18(final SubLObject value) {
            return this.$term_templates = value;
        }
        
        public SubLObject setField19(final SubLObject value) {
            return this.$assert_templates = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$ar_state_native.class, rkf_assisted_reader.$sym179$AR_STATE, rkf_assisted_reader.$sym180$AR_STATE_P, rkf_assisted_reader.$list181, rkf_assisted_reader.$list182, new String[] { "$isg", "$index", "$source_sentences", "$focus_sentence", "$completed_sentences", "$unknown_phrases", "$rejected_phrases", "$irrelevant_phrases", "$ambiguous_phrases", "$assumed_phrases", "$pending_phrases", "$accepted_phrases", "$pending_concepts", "$accepted_concepts", "$candidate_cycls", "$asserted_assertions", "$term_templates", "$assert_templates" }, rkf_assisted_reader.$list183, rkf_assisted_reader.$list184, rkf_assisted_reader.$sym9$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $ar_state_p$UnaryFunction extends UnaryFunction
    {
        public $ar_state_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("AR-STATE-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return rkf_assisted_reader.ar_state_p(arg1);
        }
    }
}

/*

	Total time: 1772 ms
	
*/