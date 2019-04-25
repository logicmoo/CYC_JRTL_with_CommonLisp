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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class pph_macros extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.pph_macros";
    public static final String myFingerPrint = "41a9f71297fd58a104a017f3349d5c6cc2b3cd65a6ffeb0f4c1c5884f78bbb17";
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 7642L)
    public static SubLSymbol $pph_memoization_state$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 7809L)
    public static SubLSymbol $pph_external_memoization_state$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 9902L)
    public static SubLSymbol $dtp_pph_problem_store_pointer$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 10215L)
    public static SubLSymbol $free_pph_problem_store_pointers$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 11977L)
    public static SubLSymbol $pph_problem_store_pointer$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 14137L)
    public static SubLSymbol $new_pph_phrases$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 14247L)
    public static SubLSymbol $destroy_new_pph_phrasesP$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 14303L)
    public static SubLSymbol $creating_permanent_pph_phraseP$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 14365L)
    public static SubLSymbol $new_pph_phrase_count$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 14915L)
    public static SubLSymbol $inside_destroy_new_pph_phrasesP$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 26100L)
    public static SubLSymbol $pph_disambiguation_mode_return_style$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 29595L)
    public static SubLSymbol $pph_timeout_time$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 29700L)
    public static SubLSymbol $pph_timeout_reachedP$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 29752L)
    public static SubLSymbol $pph_timeout_time_check_count$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 29810L)
    public static SubLSymbol $pph_default_timeout$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 39270L)
    public static SubLSymbol $pph_var_types_counter$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 44149L)
    private static SubLSymbol $max_suspended_method_depth$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 44336L)
    public static SubLSymbol $suspended_paraphrase_methods$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 44396L)
    public static SubLSymbol $allow_handling_of_pph_method_failuresP$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 44465L)
    public static SubLSymbol $handling_pph_method_failuresP$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$PROGN;
    private static final SubLSymbol $sym2$ENFORCE_TYPE;
    private static final SubLList $list3;
    private static final SubLSymbol $sym4$CLET;
    private static final SubLSymbol $sym5$_PPH_TERM_PARAPHRASE_MAP_;
    private static final SubLSymbol $sym6$CHECK_TYPE;
    private static final SubLList $list7;
    private static final SubLSymbol $sym8$_PPH_TERM_PARAPHRASE_BLACKLIST_;
    private static final SubLList $list9;
    private static final SubLList $list10;
    private static final SubLSymbol $sym11$CHECK_LIST_TYPE;
    private static final SubLList $list12;
    private static final SubLSymbol $sym13$_PPH_LEXICAL_ASSERTION_BLACKLIST_;
    private static final SubLList $list14;
    private static final SubLSymbol $sym15$DO_ALIST;
    private static final SubLList $list16;
    private static final SubLList $list17;
    private static final SubLList $list18;
    private static final SubLSymbol $sym19$_PARAPHRASE_PRECISION_;
    private static final SubLList $list20;
    private static final SubLSymbol $sym21$WITH_PARAPHRASE_PRECISION;
    private static final SubLSymbol $sym22$REMEMBERING_PPH_AMBIGUOUS_STRINGS;
    private static final SubLList $list23;
    private static final SubLList $list24;
    private static final SubLList $list25;
    private static final SubLSymbol $sym26$_DEFINITE_DESCRIPTION_LICENSED_TERMS_;
    private static final SubLSymbol $sym27$APPEND;
    private static final SubLList $list28;
    private static final SubLList $list29;
    private static final SubLSymbol $sym30$_PPH_CURRENT_ARG0_;
    private static final SubLSymbol $sym31$FIF;
    private static final SubLSymbol $sym32$PPH_OK_ARG0_FOR_LINKING_;
    private static final SubLList $list33;
    private static final SubLSymbol $sym34$PPH_POSSIBLY_BINDING_CURRENT_ARG0;
    private static final SubLList $list35;
    private static final SubLSymbol $sym36$_CONSTANT_LINK_FUNCTION_;
    private static final SubLSymbol $sym37$FIRST_OF;
    private static final SubLList $list38;
    private static final SubLSymbol $sym39$_HTML_GENERATION_TARGET_;
    private static final SubLList $list40;
    private static final SubLList $list41;
    private static final SubLSymbol $sym42$_HTML_GENERATION_TERM_ID_FUNCTION_;
    private static final SubLList $list43;
    private static final SubLList $list44;
    private static final SubLList $list45;
    private static final SubLSymbol $sym46$_PPH_LINK_UNLINKED_PHRASES_TO_MATRIX_ARG0__;
    private static final SubLSymbol $sym47$CAND;
    private static final SubLList $list48;
    private static final SubLSymbol $sym49$CNOT;
    private static final SubLSymbol $sym50$NEW_OR_REUSED;
    private static final SubLSymbol $sym51$WITH_PPH_PROBLEM_STORE;
    private static final SubLSymbol $sym52$CMULTIPLE_VALUE_BIND;
    private static final SubLSymbol $sym53$_PPH_MEMOIZATION_STATE_;
    private static final SubLList $list54;
    private static final SubLList $list55;
    private static final SubLSymbol $sym56$WITH_MEMOIZATION_STATE;
    private static final SubLList $list57;
    private static final SubLSymbol $sym58$PWHEN;
    private static final SubLList $list59;
    private static final SubLList $list60;
    private static final SubLList $list61;
    private static final SubLList $list62;
    private static final SubLSymbol $sym63$FIND_OR_CREATE_PPH_MEMOIZATION_STATE;
    private static final SubLSymbol $sym64$WITH_PPH_MEMOIZATION;
    private static final SubLSymbol $kw65$REUSED;
    private static final SubLSymbol $kw66$NEW;
    private static final SubLSymbol $sym67$FIND_OR_CREATE_PPH_EXTERNAL_MEMOIZATION_STATE;
    private static final SubLList $list68;
    private static final SubLSymbol $sym69$PPH_PROBLEM_STORE_POINTER;
    private static final SubLSymbol $sym70$PPH_PROBLEM_STORE_POINTER_P;
    private static final SubLList $list71;
    private static final SubLList $list72;
    private static final SubLList $list73;
    private static final SubLList $list74;
    private static final SubLSymbol $sym75$PPRINT_PPH_PROBLEM_STORE_POINTER;
    private static final SubLSymbol $sym76$PPH_PROBLEM_STORE_POINTER_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list77;
    private static final SubLSymbol $sym78$PPH_PROBLEM_STORE_POINTER_STORE;
    private static final SubLSymbol $sym79$_CSETF_PPH_PROBLEM_STORE_POINTER_STORE;
    private static final SubLSymbol $kw80$STORE;
    private static final SubLString $str81$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw82$BEGIN;
    private static final SubLSymbol $sym83$MAKE_PPH_PROBLEM_STORE_POINTER;
    private static final SubLSymbol $kw84$SLOT;
    private static final SubLSymbol $kw85$END;
    private static final SubLSymbol $sym86$VISIT_DEFSTRUCT_OBJECT_PPH_PROBLEM_STORE_POINTER_METHOD;
    private static final SubLString $str87$_PPH_PSP__S_;
    private static final SubLSymbol $kw88$SKIP;
    private static final SubLSymbol $sym89$FREE_PPH_PROBLEM_STORE_POINTER;
    private static final SubLSymbol $kw90$FREE;
    private static final SubLString $str91$__Initial_PPH_problem_store___S__;
    private static final SubLSymbol $sym92$REUSE_;
    private static final SubLList $list93;
    private static final SubLSymbol $sym94$_PPH_PROBLEM_STORE_POINTER_;
    private static final SubLList $list95;
    private static final SubLSymbol $sym96$CUNWIND_PROTECT;
    private static final SubLSymbol $sym97$PUNLESS;
    private static final SubLList $list98;
    private static final SubLSymbol $sym99$FIND_OR_CREATE_PPH_PROBLEM_STORE_POINTER;
    private static final SubLString $str100$Destroying_PPH_problem_store___S_;
    private static final SubLString $str101$_PPH_error_level_;
    private static final SubLString $str102$__;
    private static final SubLString $str103$New_PPH_problem_store_is_not_ok__;
    private static final SubLInteger $int104$100000;
    private static final SubLList $list105;
    private static final SubLSymbol $kw106$NOTED;
    private static final SubLSymbol $sym107$DESTROY_NEW_PPH_PHRASES;
    private static final SubLSymbol $sym108$DESTROYING_NEW_PPH_PHRASES_WHEN_DONE;
    private static final SubLSymbol $sym109$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str110$error_while_destroying_phrase___S;
    private static final SubLString $str111$Destroyed__S_PPH_phrases____New_o;
    private static final SubLList $list112;
    private static final SubLList $list113;
    private static final SubLSymbol $sym114$GET_NEW_PPH_PHRASE_COUNT;
    private static final SubLList $list115;
    private static final SubLSymbol $sym116$MATRIX_NEW_PPH_PHRASES;
    private static final SubLSymbol $sym117$PHRASE;
    private static final SubLList $list118;
    private static final SubLList $list119;
    private static final SubLList $list120;
    private static final SubLList $list121;
    private static final SubLSymbol $sym122$PIF;
    private static final SubLList $list123;
    private static final SubLSymbol $sym124$DO_STACK_ELEMENTS;
    private static final SubLSymbol $sym125$STACK_PUSH;
    private static final SubLList $list126;
    private static final SubLList $list127;
    private static final SubLSymbol $sym128$WITHIN_NEW_PPH_DISCOURSE_CONTEXT;
    private static final SubLSymbol $sym129$ENSURING_PPH_DISCOURSE_CONTEXT;
    private static final SubLList $list130;
    private static final SubLList $list131;
    private static final SubLList $list132;
    private static final SubLSymbol $sym133$HERALD_NEW_DISCOURSE_CONTEXT;
    private static final SubLString $str134$__Entering_WITHIN_NEW_PPH_DISCOUR;
    private static final SubLSymbol $sym135$HERALD_END_OF_DISCOURSE_CONTEXT;
    private static final SubLString $str136$__Leaving_WITHIN_NEW_PPH_DISCOURS;
    private static final SubLSymbol $sym137$PPH_DISCOURSE_CONTEXT_INITIALIZED_;
    private static final SubLSymbol $sym138$CLEAR_PPH_DISCOURSE_CONTEXT;
    private static final SubLList $list139;
    private static final SubLSymbol $kw140$CYC_LEXICON;
    private static final SubLSymbol $sym141$MATRIX_RMS;
    private static final SubLString $str142$NIL;
    private static final SubLSymbol $sym143$IGNORE;
    private static final SubLSymbol $sym144$CSETQ;
    private static final SubLSymbol $sym145$NOTE_LEAVING_SHADOWED_DISCOURSE_CONTEXT;
    private static final SubLSymbol $sym146$_PPH_DISCOURSE_CONTEXT_;
    private static final SubLList $list147;
    private static final SubLList $list148;
    private static final SubLList $list149;
    private static final SubLSymbol $sym150$WITH_SHADOWED_DISCOURSE_CONTEXT;
    private static final SubLString $str151$__Leaving__S;
    private static final SubLString $str152$New_RMS___S;
    private static final SubLList $list153;
    private static final SubLSymbol $sym154$_PPH_SPEAKER_;
    private static final SubLSymbol $sym155$_PPH_ADDRESSEE_;
    private static final SubLList $list156;
    private static final SubLList $list157;
    private static final SubLSymbol $kw158$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw159$PARANOID_ARG;
    private static final SubLSymbol $sym160$PARANOID_ARG;
    private static final SubLSymbol $kw161$OUTPUT_ITEM;
    private static final SubLSymbol $sym162$OUTPUT_ITEM;
    private static final SubLSymbol $kw163$ARG_POSITION;
    private static final SubLSymbol $sym164$ARG_POSITION;
    private static final SubLSymbol $kw165$HTML_OPEN_TAG;
    private static final SubLSymbol $sym166$HTML_OPEN_TAG;
    private static final SubLSymbol $kw167$HTML_CLOSE_TAG;
    private static final SubLSymbol $sym168$HTML_CLOSE_TAG;
    private static final SubLSymbol $kw169$START_CHAR_INDEX;
    private static final SubLSymbol $sym170$START_CHAR_INDEX;
    private static final SubLSymbol $kw171$WHOLE_STRING;
    private static final SubLSymbol $sym172$WHOLE_STRING;
    private static final SubLSymbol $sym173$ITEM;
    private static final SubLSymbol $sym174$WHOLE_HTML_STRING;
    private static final SubLSymbol $sym175$END_CHAR_INDEX;
    private static final SubLSymbol $sym176$ITERATOR;
    private static final SubLList $list177;
    private static final SubLList $list178;
    private static final SubLSymbol $sym179$PPH_PHRASE_OUTPUT_LIST_STRING;
    private static final SubLList $list180;
    private static final SubLSymbol $sym181$PPH_REMOVE_HTML_TAGS;
    private static final SubLSymbol $sym182$NEW_PPH_PHRASE_OUTPUT_LIST_ITERATOR;
    private static final SubLSymbol $sym183$UNTIL;
    private static final SubLSymbol $sym184$PPH_PHRASE_OUTPUT_LIST_ITERATOR_EMPTY_P;
    private static final SubLSymbol $sym185$PPH_PHRASE_OUTPUT_LIST_ITERATOR_NEXT;
    private static final SubLSymbol $sym186$DO_ONE_PPH_OUTPUT_LIST_ITEM;
    private static final SubLSymbol $sym187$DO_PPH_OUTPUT_LIST;
    private static final SubLList $list188;
    private static final SubLSymbol $sym189$PPH_MAYBE_DO_SPACE_ITEM;
    private static final SubLSymbol $sym190$WITH_PPH_REGULAR_OUTPUT_ITEM_BINDINGS;
    private static final SubLSymbol $sym191$RAW_ITEM_STRING;
    private static final SubLSymbol $sym192$PPH_PHRASE_OUTPUT_ITEM_GET_STRING;
    private static final SubLSymbol $sym193$PPH_OUTPUT_LIST_FIND_START_CHAR;
    private static final SubLSymbol $sym194$_;
    private static final SubLSymbol $sym195$PPH_MAKE_SPACE_STRING;
    private static final SubLList $list196;
    private static final SubLList $list197;
    private static final SubLSymbol $sym198$NEW_PPH_PHRASE_FILLER_ITEM;
    private static final SubLSymbol $sym199$PPH_UPDATE_END_CHAR_INDEX;
    private static final SubLString $str200$Adding_space_string_of_length__S;
    private static final SubLList $list201;
    private static final SubLSymbol $sym202$PPH_PHRASE_OUTPUT_ITEM_ARG_POSITION;
    private static final SubLSymbol $sym203$PPH_PHRASE_OUTPUT_ITEM_HTML_OPEN_TAG;
    private static final SubLSymbol $sym204$PPH_PHRASE_OUTPUT_ITEM_HTML_CLOSE_TAG;
    private static final SubLSymbol $sym205$PPH_PHRASE_OUTPUT_ITEM_CYCL;
    private static final SubLSymbol $sym206$PPH_STRING_P;
    private static final SubLSymbol $sym207$PPH_CHAR__;
    private static final SubLString $str208$Couldn_t_find__S_in__S___;
    private static final SubLList $list209;
    private static final SubLList $list210;
    private static final SubLSymbol $kw211$DONE;
    private static final SubLSymbol $sym212$CSOME;
    private static final SubLSymbol $sym213$PPH_NJAVALIST_ITEMS;
    private static final SubLSymbol $kw214$PAIRS;
    private static final SubLList $list215;
    private static final SubLList $list216;
    private static final SubLSymbol $kw217$RETURN_STYLE;
    private static final SubLSymbol $kw218$JAVALISTS;
    private static final SubLList $list219;
    private static final SubLList $list220;
    private static final SubLList $list221;
    private static final SubLSymbol $sym222$_PARTIAL_RESULTS_NOTIFICATION_FN_;
    private static final SubLList $list223;
    private static final SubLSymbol $sym224$_PPH_DISAMBIGUATION_MODE_RETURN_STYLE_;
    private static final SubLSymbol $sym225$WITH_PARTIAL_RESULTS_ACCUMULATION;
    private static final SubLSymbol $sym226$INCREMENTAL_PPH_DISAMBIGUATION_RESULT_P;
    private static final SubLString $str227$Don_t_know_how_to_accumulate__S_a;
    private static final SubLSymbol $sym228$_;
    private static final SubLList $list229;
    private static final SubLSymbol $sym230$MATRIX_PROBLEM_DICTIONARY;
    private static final SubLList $list231;
    private static final SubLList $list232;
    private static final SubLList $list233;
    private static final SubLSymbol $sym234$_PPH_PROBLEM_REPORTS_;
    private static final SubLSymbol $sym235$DICTIONARY_P;
    private static final SubLSymbol $sym236$PPH_MERGE_PROBLEM_DICTIONARY;
    private static final SubLList $list237;
    private static final SubLList $list238;
    private static final SubLSymbol $sym239$_PPH_TIMEOUT_TIME_;
    private static final SubLSymbol $sym240$PPH_COMPUTE_TIMEOUT_TIME;
    private static final SubLList $list241;
    private static final SubLList $list242;
    private static final SubLSymbol $sym243$_PPH_TIMEOUT_REACHED__;
    private static final SubLList $list244;
    private static final SubLString $str245$PPH_timeout_reached_;
    private static final SubLSymbol $sym246$WITH_PPH_TIMEOUT;
    private static final SubLSymbol $sym247$PPH_TIMEOUT;
    private static final SubLSymbol $sym248$ALREADY_INITIALIZED_;
    private static final SubLList $list249;
    private static final SubLSymbol $sym250$_PPH_UNEXPRESSED_NEGATIONS_;
    private static final SubLList $list251;
    private static final SubLSymbol $sym252$COR;
    private static final SubLList $list253;
    private static final SubLList $list254;
    private static final SubLList $list255;
    private static final SubLSymbol $sym256$_PPH_LANGUAGE_MT_;
    private static final SubLSymbol $sym257$PPH_CANONICALIZE_HLMT;
    private static final SubLList $list258;
    private static final SubLList $list259;
    private static final SubLSymbol $sym260$_PPH_DOMAIN_MT_;
    private static final SubLList $list261;
    private static final SubLList $list262;
    private static final SubLSymbol $sym263$POSSIBLY_WITH_PPH_LANGUAGE_MT;
    private static final SubLSymbol $sym264$POSSIBLY_WITH_PPH_DOMAIN_MT;
    private static final SubLList $list265;
    private static final SubLSymbol $sym266$WITH_INFERENCE_MT_RELEVANCE;
    private static final SubLSymbol $sym267$BROADENED_LANGUAGE_MT;
    private static final SubLSymbol $sym268$WITH_PPH_LANGUAGE_MT_RELEVANCE;
    private static final SubLList $list269;
    private static final SubLSymbol $sym270$HLMT_EQUAL_;
    private static final SubLList $list271;
    private static final SubLList $list272;
    private static final SubLList $list273;
    private static final SubLSymbol $sym274$DO_DICTIONARY;
    private static final SubLList $list275;
    private static final SubLList $list276;
    private static final SubLList $list277;
    private static final SubLSymbol $sym278$SUSPEND_;
    private static final SubLSymbol $sym279$_PPH_USE_BULLETED_LISTS__;
    private static final SubLSymbol $sym280$PPH_NOTE;
    private static final SubLString $str281$__Suspending_bullet_use_for____S_;
    private static final SubLList $list282;
    private static final SubLList $list283;
    private static final SubLSymbol $sym284$PPH_CHECK_TYPE;
    private static final SubLList $list285;
    private static final SubLSymbol $sym286$_PPH_DEMERIT_CUTOFF_;
    private static final SubLSymbol $sym287$COMPUTE_NEW_PPH_DEMERIT_CUTOFF;
    private static final SubLSymbol $sym288$WITH_MAXIMUM_PPH_DEMERIT_CUTOFF;
    private static final SubLSymbol $sym289$INTEGERP;
    private static final SubLList $list290;
    private static final SubLSymbol $sym291$OLD_GRACE_PERIOD;
    private static final SubLList $list292;
    private static final SubLSymbol $sym293$SET_PPH_PHRASE_DESTRUCTION_GRACE_PERIOD;
    private static final SubLSymbol $sym294$MAX;
    private static final SubLList $list295;
    private static final SubLList $list296;
    private static final SubLList $list297;
    private static final SubLSymbol $sym298$_PPH_INFERENCE_ANSWER_;
    private static final SubLSymbol $sym299$WITH_PPH_INFERENCE;
    private static final SubLSymbol $sym300$INFERENCE_ANSWER_INFERENCE;
    private static final SubLList $list301;
    private static final SubLSymbol $sym302$_PPH_HYPOTHETICAL_VARS_;
    private static final SubLSymbol $sym303$INFERENCE_HYPOTHETICAL_BINDINGS;
    private static final SubLList $list304;
    private static final SubLSymbol $sym305$PPH_ENHANCED_DOMAIN_MT;
    private static final SubLSymbol $sym306$PPH_GET_INFERENCE_MT;
    private static final SubLSymbol $sym307$WITH_PPH_INFERENCE_ANSWER;
    private static final SubLList $list308;
    private static final SubLSymbol $sym309$POSSIBLY_WITH_PPH_HTML_JUSTIFICATION_GENERATION_PARAMETERS;
    private static final SubLSymbol $sym310$LINK_FUNCTION;
    private static final SubLSymbol $sym311$HTML_TARGET;
    private static final SubLList $list312;
    private static final SubLSymbol $sym313$WITH_PPH_HTML_FUNCTION_AND_TARGET;
    private static final SubLSymbol $sym314$PPH_JUSTIFICATION_HTML_FUNCTION_AND_TARGET;
    private static final SubLSymbol $sym315$WITH_PPH_JUSTIFICATION_GENERATION_PARAMETERS;
    private static final SubLList $list316;
    private static final SubLSymbol $sym317$VAR_TYPES_SHADOW;
    private static final SubLList $list318;
    private static final SubLList $list319;
    private static final SubLList $list320;
    private static final SubLSymbol $sym321$_PPH_VAR_TYPES_;
    private static final SubLList $list322;
    private static final SubLSymbol $sym323$PPH_PHRASE_DONE_;
    private static final SubLList $list324;
    private static final SubLString $str325$___Setting__S_to____S;
    private static final SubLSymbol $sym326$DICTIONARY_VALUES;
    private static final SubLSymbol $sym327$PPH_RESET_VAR_TYPES;
    private static final SubLList $list328;
    private static final SubLSymbol $sym329$PPH_SETTING_VAR_TYPES_IF_SUCCESSFUL;
    private static final SubLSymbol $sym330$OLD_PPH_VARS;
    private static final SubLList $list331;
    private static final SubLList $list332;
    private static final SubLList $list333;
    private static final SubLList $list334;
    private static final SubLSymbol $sym335$LOCAL_VARS;
    private static final SubLSymbol $sym336$SET_DIFFERENCE;
    private static final SubLList $list337;
    private static final SubLList $list338;
    private static final SubLSymbol $sym339$PPH_HANDLE_LOCAL_VARS;
    private static final SubLSymbol $sym340$PPH_POSSIBLY_BINDING_VARIABLES;
    private static final SubLString $str341$__Deregistering__S__;
    private static final SubLList $list342;
    private static final SubLSymbol $sym343$CDESTRUCTURING_BIND;
    private static final SubLList $list344;
    private static final SubLSymbol $sym345$PPH_PHRASE_AGR;
    private static final SubLList $list346;
    private static final SubLList $list347;
    private static final SubLSymbol $kw348$RELN;
    private static final SubLSymbol $kw349$ARG_POSITION_MAP;
    private static final SubLSymbol $kw350$INVERSE_;
    private static final SubLSymbol $sym351$IGNORE_ME;
    private static final SubLSymbol $kw352$NL_PREDS;
    private static final SubLSymbol $kw353$ANY;
    private static final SubLSymbol $kw354$FOCUS_ARGNUM;
    private static final SubLSymbol $sym355$GENERATOR;
    private static final SubLSymbol $sym356$GET_PPH_PHRASE_TEMPLATE_GENERATOR;
    private static final SubLSymbol $sym357$PPH_PHRASE_TEMPLATE_GENERATOR_DONE_P;
    private static final SubLSymbol $sym358$PPH_PHRASE_TEMPLATE_GENERATOR_NEXT;
    private static final SubLSymbol $sym359$PPH_PHRASE_P;
    private static final SubLSymbol $sym360$FREE_PPH_PHRASE_TEMPLATE_GENERATOR;
    private static final SubLList $list361;
    private static final SubLList $list362;
    private static final SubLSymbol $kw363$FOCUS_ARG;
    private static final SubLSymbol $sym364$PHRASE_TEMPLATE;
    private static final SubLSymbol $sym365$DO_PPH_PHRASE_TEMPLATES_FOR_FORMULA;
    private static final SubLSymbol $sym366$PPH_CUSTOMIZE_TEMPLATE_MACRO_HELPER;
    private static final SubLInteger $int367$300;
    private static final SubLSymbol $sym368$MAX_SUSPENDED_METHOD_DEPTH;
    private static final SubLSymbol $sym369$HANDLING_PPH_METHOD_FAILURES;
    private static final SubLSymbol $sym370$FAILED_METHOD;
    private static final SubLSymbol $sym371$TRIED_ONE_;
    private static final SubLSymbol $sym372$TOP_LEVEL_;
    private static final SubLList $list373;
    private static final SubLSymbol $sym374$_SUSPENDED_PARAPHRASE_METHODS_;
    private static final SubLList $list375;
    private static final SubLList $list376;
    private static final SubLSymbol $sym377$WHILE;
    private static final SubLSymbol $sym378$NOTE_SUSPENDED_PARAPHRASE_METHOD_PLIST;
    private static final SubLSymbol $sym379$CCATCH;
    private static final SubLSymbol $kw380$PPH_METHOD_FAILURE;
    private static final SubLSymbol $sym381$HANDLING_PPH_METHOD_FAILURES_TOP_LEVEL_P;
    private static final SubLString $str382$Can_t_note_PPH_method_failure__no;
    private static final SubLString $str383$_S___is_already_suspended_;
    private static final SubLString $str384$Over__S_suspended_methods____Curr;
    private static final SubLSymbol $kw385$CYCL;
    private static final SubLString $str386$Cleared__S_suspended_methods_for_;
    private static final SubLList $list387;
    private static final SubLSymbol $sym388$INFO;
    private static final SubLSymbol $sym389$PPH_METHOD_INFO;
    private static final SubLSymbol $sym390$PPH_DEREGISTER_METHOD_INFO;
    private static final SubLSymbol $sym391$PPH_REGISTER_METHOD_INFO;
    private static final SubLList $list392;
    private static final SubLSymbol $sym393$_SELECT_STRING_METHODS_TO_OMIT_;
    private static final SubLSymbol $sym394$SAVE_CYCL;
    private static final SubLSymbol $sym395$PPH_PHRASE_RESTRICT_CYCL_TO_MT_SCOPE;
    private static final SubLSymbol $sym396$PPH_PHRASE_RESTORE_AND_REPHRASE_CYCL_IF_MT_SCOPED;
    private static final SubLSymbol $sym397$HANDLING_PPH_MT_SCOPE;
    private static final SubLString $str398$Removing_MT_scope_from__S;
    private static final SubLList $list399;
    private static final SubLString $str400$Updating_agr_preds_to__S_based_on;
    private static final SubLString $str401$New_agr_preds___S;
    private static final SubLString $str402$Adding_Mt_scope_paraphrases_to___;
    private static final SubLString $str403$Couldn_t_finish_temporal_phrase__;
    private static final SubLList $list404;
    private static final SubLString $str405$_;
    private static final SubLString $str406$___Top_level_CycL___S;
    private static final SubLSymbol $kw407$FAILED;
    private static final SubLString $str408$Result_of_adding_Mt_scope_paraphr;
    private static final SubLList $list409;
    private static final SubLObject $const410$TemporalMicrotheory;
    private static final SubLList $list411;
    private static final SubLString $str412$according_to;
    private static final SubLSymbol $kw413$PHRASE_CYCL;
    private static final SubLObject $const414$Now;
    private static final SubLString $str415$Ignoring__S___because_it_subsumes;
    private static final SubLList $list416;
    private static final SubLSymbol $sym417$ALREADY_MEMORY_MAPPED;
    private static final SubLList $list418;
    private static final SubLList $list419;
    private static final SubLList $list420;
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 793L)
    public static SubLObject pph_mapped_string_for_term(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.alist_lookup(pph_vars.$pph_term_paraphrase_map$.getDynamicValue(thread), v_term, Symbols.symbol_function((SubLObject)pph_macros.EQUAL), (SubLObject)pph_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 1031L)
    public static SubLObject with_paraphrase_mappings(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mappings = (SubLObject)pph_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list0);
        mappings = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym1$PROGN, (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym2$ENFORCE_TYPE, mappings, (SubLObject)pph_macros.$list3), (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym4$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym5$_PPH_TERM_PARAPHRASE_MAP_, mappings)), ConsesLow.append(body, (SubLObject)pph_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 1418L)
    public static SubLObject with_paraphrase_blacklist(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mappings = (SubLObject)pph_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list0);
        mappings = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym1$PROGN, (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym6$CHECK_TYPE, mappings, (SubLObject)pph_macros.$list7), (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym4$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym8$_PPH_TERM_PARAPHRASE_BLACKLIST_, mappings)), ConsesLow.append(body, (SubLObject)pph_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 1802L)
    public static SubLObject valid_pph_blacklistP(final SubLObject v_object) {
        SubLObject invalidP;
        SubLObject rest;
        SubLObject cons;
        SubLObject current;
        SubLObject datum;
        SubLObject v_term;
        SubLObject strings;
        for (invalidP = (SubLObject)SubLObjectFactory.makeBoolean(pph_macros.NIL == list_utilities.alist_p(v_object)), rest = (SubLObject)pph_macros.NIL, rest = v_object; pph_macros.NIL == invalidP && pph_macros.NIL != rest; invalidP = (SubLObject)SubLObjectFactory.makeBoolean(pph_macros.NIL == cycl_grammar.cycl_term_p(v_term) || pph_macros.NIL == string_utilities.list_of_string_p(strings)), rest = rest.rest()) {
            cons = rest.first();
            datum = (current = cons);
            v_term = (SubLObject)pph_macros.NIL;
            strings = (SubLObject)pph_macros.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list9);
            v_term = current.first();
            current = (strings = current.rest());
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_macros.NIL == invalidP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 2072L)
    public static SubLObject with_paraphrase_lexical_assertion_blacklist(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject lexical_assertions = (SubLObject)pph_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list10);
        lexical_assertions = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym1$PROGN, (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym11$CHECK_LIST_TYPE, lexical_assertions, (SubLObject)pph_macros.$list12), (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym4$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym13$_PPH_LEXICAL_ASSERTION_BLACKLIST_, lexical_assertions)), ConsesLow.append(body, (SubLObject)pph_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 2453L)
    public static SubLObject valid_pph_blacklist_assertionP(final SubLObject v_object) {
        return assertion_handles.assertion_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 2539L)
    public static SubLObject do_pph_arg_position_map(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list14);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject from_prefix = (SubLObject)pph_macros.NIL;
        SubLObject to_prefix = (SubLObject)pph_macros.NIL;
        SubLObject map = (SubLObject)pph_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list14);
        from_prefix = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list14);
        to_prefix = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list14);
        map = current.first();
        current = current.rest();
        if (pph_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym15$DO_ALIST, (SubLObject)ConsesLow.list(from_prefix, to_prefix, map), ConsesLow.append(body, (SubLObject)pph_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_macros.$list14);
        return (SubLObject)pph_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 2738L)
    public static SubLObject remembering_pph_ambiguous_strings(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym4$CLET, (SubLObject)pph_macros.$list16, ConsesLow.append(body, (SubLObject)pph_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 2974L)
    public static SubLObject with_paraphrase_precision(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject precision = (SubLObject)pph_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list17);
        precision = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym1$PROGN, (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym6$CHECK_TYPE, precision, (SubLObject)pph_macros.$list18), (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym4$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym19$_PARAPHRASE_PRECISION_, precision)), ConsesLow.append(body, (SubLObject)pph_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 3332L)
    public static SubLObject with_terse_paraphrase_on(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym4$CLET, (SubLObject)pph_macros.$list20, ConsesLow.append(body, (SubLObject)pph_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 3483L)
    public static SubLObject with_precise_paraphrase_on(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym21$WITH_PARAPHRASE_PRECISION, (SubLObject)pph_macros.T, reader.bq_cons((SubLObject)pph_macros.$sym22$REMEMBERING_PPH_AMBIGUOUS_STRINGS, ConsesLow.append(body, (SubLObject)pph_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 3678L)
    public static SubLObject with_precise_paraphrase_off(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym21$WITH_PARAPHRASE_PRECISION, (SubLObject)pph_macros.NIL, ConsesLow.append(body, (SubLObject)pph_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 3835L)
    public static SubLObject with_precise_paraphrase_for_args(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject nested_arg_list = (SubLObject)pph_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list23);
        nested_arg_list = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym1$PROGN, (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym6$CHECK_TYPE, nested_arg_list, (SubLObject)pph_macros.$list24), (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym21$WITH_PARAPHRASE_PRECISION, nested_arg_list, ConsesLow.append(body, (SubLObject)pph_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 4183L)
    public static SubLObject with_definite_descriptions_licensed_for_terms(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject terms = (SubLObject)pph_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list25);
        terms = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym4$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym26$_DEFINITE_DESCRIPTION_LICENSED_TERMS_, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym27$APPEND, (SubLObject)pph_macros.$sym26$_DEFINITE_DESCRIPTION_LICENSED_TERMS_, terms))), ConsesLow.append(body, (SubLObject)pph_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 4470L)
    public static SubLObject pph_nested_arg_list_p(final SubLObject obj) {
        if (pph_macros.NIL == obj) {
            return (SubLObject)pph_macros.T;
        }
        if (pph_macros.NIL == list_utilities.proper_list_p(obj)) {
            return (SubLObject)pph_macros.NIL;
        }
        if (pph_macros.NIL != subl_promotions.memberP((SubLObject)pph_macros.NIL, obj, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED)) {
            return (SubLObject)pph_macros.NIL;
        }
        SubLObject csome_list_var = obj;
        SubLObject item = (SubLObject)pph_macros.NIL;
        item = csome_list_var.first();
        while (pph_macros.NIL != csome_list_var) {
            if (item.isInteger() && item.isNegative()) {
                return (SubLObject)pph_macros.NIL;
            }
            if (!item.isInteger() && pph_macros.NIL == pph_nested_arg_list_p(item)) {
                return (SubLObject)pph_macros.NIL;
            }
            csome_list_var = csome_list_var.rest();
            item = csome_list_var.first();
        }
        return (SubLObject)pph_macros.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 4907L)
    public static SubLObject maximizing_pph_links(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym4$CLET, (SubLObject)pph_macros.$list28, ConsesLow.append(body, (SubLObject)pph_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 5236L)
    public static SubLObject pph_possibly_binding_current_arg0(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list29);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject arg0 = (SubLObject)pph_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list29);
        arg0 = current.first();
        current = current.rest();
        if (pph_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym4$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym30$_PPH_CURRENT_ARG0_, (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym31$FIF, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym32$PPH_OK_ARG0_FOR_LINKING_, arg0), arg0, (SubLObject)pph_macros.$list33))), ConsesLow.append(body, (SubLObject)pph_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_macros.$list29);
        return (SubLObject)pph_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 5419L)
    public static SubLObject pph_ok_arg0_for_linkingP(final SubLObject arg0) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_macros.NIL == fort_types_interface.logical_connective_p(arg0));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 5562L)
    public static SubLObject with_pph_html_function_and_target(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list35);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject function = (SubLObject)pph_macros.NIL;
        SubLObject target = (SubLObject)pph_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list35);
        function = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list35);
        target = current.first();
        current = current.rest();
        if (pph_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym4$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym36$_CONSTANT_LINK_FUNCTION_, (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym37$FIRST_OF, function, (SubLObject)pph_macros.$list38)), (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym39$_HTML_GENERATION_TARGET_, (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym37$FIRST_OF, target, (SubLObject)pph_macros.$list40))), ConsesLow.append(body, (SubLObject)pph_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_macros.$list35);
        return (SubLObject)pph_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 6036L)
    public static SubLObject with_pph_html_term_id_fn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list41);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject function_spec = (SubLObject)pph_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list41);
        function_spec = current.first();
        current = current.rest();
        if (pph_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym4$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym42$_HTML_GENERATION_TERM_ID_FUNCTION_, function_spec)), ConsesLow.append(body, (SubLObject)pph_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_macros.$list41);
        return (SubLObject)pph_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 6319L)
    public static SubLObject omitting_hyperlinks_in_pph_html_mode(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym4$CLET, (SubLObject)pph_macros.$list43, ConsesLow.append(body, (SubLObject)pph_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 7138L)
    public static SubLObject allowing_utf8_in_pph_text_mode(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym4$CLET, (SubLObject)pph_macros.$list44, ConsesLow.append(body, (SubLObject)pph_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 7317L)
    public static SubLObject dont_link_unlinked_phrases_to_matrix_arg_if(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject form = (SubLObject)pph_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list45);
        form = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym4$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym46$_PPH_LINK_UNLINKED_PHRASES_TO_MATRIX_ARG0__, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym47$CAND, (SubLObject)pph_macros.$list48, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym49$CNOT, form)))), ConsesLow.append(body, (SubLObject)pph_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 7965L)
    public static SubLObject with_pph_memoization(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject new_or_reused = (SubLObject)pph_macros.$sym50$NEW_OR_REUSED;
        return (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym51$WITH_PPH_PROBLEM_STORE, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym52$CMULTIPLE_VALUE_BIND, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym53$_PPH_MEMOIZATION_STATE_, new_or_reused), (SubLObject)pph_macros.$list54, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym4$CLET, (SubLObject)pph_macros.$list55, (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym56$WITH_MEMOIZATION_STATE, (SubLObject)pph_macros.$list57, ConsesLow.append(body, (SubLObject)pph_macros.NIL))), (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym58$PWHEN, (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym47$CAND, (SubLObject)ConsesLow.listS((SubLObject)pph_macros.EQ, new_or_reused, (SubLObject)pph_macros.$list59), (SubLObject)pph_macros.$list60), (SubLObject)pph_macros.$list61)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 8681L)
    public static SubLObject with_pph_external_memoization(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym56$WITH_MEMOIZATION_STATE, (SubLObject)pph_macros.$list62, ConsesLow.append(body, (SubLObject)pph_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 9133L)
    public static SubLObject find_or_create_pph_memoization_state() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_macros.NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread))) {
            return Values.values(pph_macros.$pph_memoization_state$.getDynamicValue(thread), (SubLObject)pph_macros.$kw65$REUSED);
        }
        return Values.values(memoization_state.new_memoization_state((SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED), (SubLObject)pph_macros.$kw66$NEW);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 9395L)
    public static SubLObject find_or_create_pph_external_memoization_state() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (pph_macros.NIL != misc_utilities.uninitialized_p(pph_macros.$pph_external_memoization_state$.getDynamicValue(thread))) ? Values.values(memoization_state.current_memoization_state(), (SubLObject)pph_macros.$kw66$NEW) : Values.values(pph_macros.$pph_external_memoization_state$.getDynamicValue(thread), (SubLObject)pph_macros.$kw65$REUSED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 9902L)
    public static SubLObject pph_problem_store_pointer_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        pprint_pph_problem_store_pointer(v_object, stream, (SubLObject)pph_macros.ZERO_INTEGER);
        return (SubLObject)pph_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 9902L)
    public static SubLObject pph_problem_store_pointer_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $pph_problem_store_pointer_native.class) ? pph_macros.T : pph_macros.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 9902L)
    public static SubLObject pph_problem_store_pointer_store(final SubLObject v_object) {
        assert pph_macros.NIL != pph_problem_store_pointer_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 9902L)
    public static SubLObject _csetf_pph_problem_store_pointer_store(final SubLObject v_object, final SubLObject value) {
        assert pph_macros.NIL != pph_problem_store_pointer_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 9902L)
    public static SubLObject make_pph_problem_store_pointer(SubLObject arglist) {
        if (arglist == pph_macros.UNPROVIDED) {
            arglist = (SubLObject)pph_macros.NIL;
        }
        final SubLObject v_new = (SubLObject)new $pph_problem_store_pointer_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)pph_macros.NIL, next = arglist; pph_macros.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)pph_macros.$kw80$STORE)) {
                _csetf_pph_problem_store_pointer_store(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)pph_macros.$str81$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 9902L)
    public static SubLObject visit_defstruct_pph_problem_store_pointer(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_macros.$kw82$BEGIN, (SubLObject)pph_macros.$sym83$MAKE_PPH_PROBLEM_STORE_POINTER, (SubLObject)pph_macros.ONE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_macros.$kw84$SLOT, (SubLObject)pph_macros.$kw80$STORE, pph_problem_store_pointer_store(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_macros.$kw85$END, (SubLObject)pph_macros.$sym83$MAKE_PPH_PROBLEM_STORE_POINTER, (SubLObject)pph_macros.ONE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 9902L)
    public static SubLObject visit_defstruct_object_pph_problem_store_pointer_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_pph_problem_store_pointer(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 10037L)
    public static SubLObject pprint_pph_problem_store_pointer(final SubLObject pointer, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)pph_macros.$str87$_PPH_PSP__S_, pph_problem_store_pointer_store(pointer));
        return (SubLObject)pph_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 10330L)
    public static SubLObject pph_maybe_destroy_problem_store(final SubLObject problem_store) {
        if (pph_macros.NIL != inference_datastructures_problem_store.valid_problem_store_p(problem_store)) {
            final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(problem_store);
            if (pph_macros.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)pph_macros.$kw88$SKIP)) {
                final SubLObject idx_$1 = idx;
                if (pph_macros.NIL == id_index.id_index_dense_objects_empty_p(idx_$1, (SubLObject)pph_macros.$kw88$SKIP)) {
                    final SubLObject vector_var = id_index.id_index_dense_objects(idx_$1);
                    final SubLObject backwardP_var = (SubLObject)pph_macros.NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject inference;
                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_macros.NIL, v_iteration = (SubLObject)pph_macros.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_macros.ONE_INTEGER)) {
                        id = ((pph_macros.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_macros.ONE_INTEGER) : v_iteration);
                        inference = Vectors.aref(vector_var, id);
                        if (pph_macros.NIL == id_index.id_index_tombstone_p(inference) || pph_macros.NIL == id_index.id_index_skip_tombstones_p((SubLObject)pph_macros.$kw88$SKIP)) {
                            if (pph_macros.NIL != id_index.id_index_tombstone_p(inference)) {
                                inference = (SubLObject)pph_macros.$kw88$SKIP;
                            }
                            if (pph_macros.NIL != inference_datastructures_inference.inference_browsableP(inference)) {
                                return (SubLObject)pph_macros.NIL;
                            }
                        }
                    }
                }
                final SubLObject idx_$2 = idx;
                if (pph_macros.NIL == id_index.id_index_sparse_objects_empty_p(idx_$2)) {
                    final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$2);
                    SubLObject id2 = (SubLObject)pph_macros.NIL;
                    SubLObject inference2 = (SubLObject)pph_macros.NIL;
                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            id2 = Hashtables.getEntryKey(cdohash_entry);
                            inference2 = Hashtables.getEntryValue(cdohash_entry);
                            if (pph_macros.NIL != inference_datastructures_inference.inference_browsableP(inference2)) {
                                return (SubLObject)pph_macros.NIL;
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
        }
        inference_datastructures_problem_store.destroy_problem_store(problem_store);
        return (SubLObject)pph_macros.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 10614L)
    public static SubLObject free_pph_problem_store_pointer(final SubLObject pointer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_macros.NIL != pph_problem_store_pointer_p(pointer)) {
            assert pph_macros.NIL != pph_problem_store_pointer_p(pointer) : pointer;
            if (pph_macros.NIL != inference_datastructures_problem_store.problem_store_p(pph_problem_store_pointer_store(pointer))) {
                pph_maybe_destroy_problem_store(pph_problem_store_pointer_store(pointer));
            }
            pph_problem_store_pointer_set_store(pointer, (SubLObject)pph_macros.$kw90$FREE);
            pph_macros.$free_pph_problem_store_pointers$.setDynamicValue((SubLObject)ConsesLow.cons(pointer, pph_macros.$free_pph_problem_store_pointers$.getDynamicValue(thread)), thread);
        }
        return (SubLObject)pph_macros.$kw90$FREE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 11091L)
    public static SubLObject pph_problem_store_pointer_set_store(final SubLObject pointer, final SubLObject store) {
        assert pph_macros.NIL != pph_problem_store_pointer_p(pointer) : pointer;
        _csetf_pph_problem_store_pointer_store(pointer, store);
        return store;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 11284L)
    public static SubLObject new_problem_store_pointer() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pointer = (SubLObject)pph_macros.NIL;
        if (pph_macros.NIL != list_utilities.non_empty_list_p(pph_macros.$free_pph_problem_store_pointers$.getDynamicValue(thread))) {
            final SubLObject datum_evaluated_var = pph_macros.$free_pph_problem_store_pointers$.getDynamicValue(thread);
            pointer = datum_evaluated_var.first();
            pph_macros.$free_pph_problem_store_pointers$.setDynamicValue(datum_evaluated_var.rest(), thread);
        }
        else {
            pointer = make_pph_problem_store_pointer((SubLObject)pph_macros.UNPROVIDED);
        }
        return pointer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 11603L)
    public static SubLObject replace_pph_problem_store_pointer_store(final SubLObject pointer) {
        assert pph_macros.NIL != pph_problem_store_pointer_p(pointer) : pointer;
        final SubLObject old_store = pph_problem_store_pointer_store(pointer);
        final SubLObject new_store = inference_datastructures_problem_store.new_problem_store((SubLObject)pph_macros.UNPROVIDED);
        if (pph_macros.NIL != inference_datastructures_problem_store.problem_store_p(old_store)) {
            inference_datastructures_problem_store.destroy_problem_store(old_store);
        }
        pph_problem_store_pointer_set_store(pointer, new_store);
        return pointer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 12035L)
    public static SubLObject pph_problem_store(SubLObject create_if_freeP) {
        if (create_if_freeP == pph_macros.UNPROVIDED) {
            create_if_freeP = (SubLObject)pph_macros.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pointer = pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread);
        SubLObject store = (SubLObject)pph_macros.NIL;
        if (pph_macros.NIL != pph_problem_store_pointer_p(pointer)) {
            store = pph_problem_store_pointer_store(pointer);
            if (pph_macros.$kw90$FREE == store && pph_macros.NIL != create_if_freeP) {
                replace_pph_problem_store_pointer_store(pointer);
                if (pph_macros.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_macros.ONE_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_macros.T, (SubLObject)pph_macros.$str91$__Initial_PPH_problem_store___S__, pph_problem_store_pointer_store(pointer), (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED);
                }
                store = pph_problem_store_pointer_store(pointer);
            }
        }
        return (SubLObject)((pph_macros.NIL != store) ? store : pph_macros.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 12565L)
    public static SubLObject with_pph_problem_store(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject reuseP = (SubLObject)pph_macros.$sym92$REUSE_;
        return (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym4$CLET, (SubLObject)pph_macros.$list93, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym52$CMULTIPLE_VALUE_BIND, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym94$_PPH_PROBLEM_STORE_POINTER_, reuseP), (SubLObject)pph_macros.$list95, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym96$CUNWIND_PROTECT, reader.bq_cons((SubLObject)pph_macros.$sym1$PROGN, ConsesLow.append(body, (SubLObject)pph_macros.NIL)), (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym97$PUNLESS, reuseP, (SubLObject)pph_macros.$list98))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 12947L)
    public static SubLObject find_or_create_pph_problem_store_pointer() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_macros.NIL == pph_problem_store_pointer_p(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread))) {
            final SubLObject new_problem_store_pointer = new_problem_store_pointer();
            return Values.values(new_problem_store_pointer, (SubLObject)pph_macros.NIL);
        }
        if (pph_macros.NIL == pph_problem_store_okP()) {
            if (pph_macros.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_macros.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_macros.T, (SubLObject)pph_macros.$str100$Destroying_PPH_problem_store___S_, pph_problem_store((SubLObject)pph_macros.UNPROVIDED), (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED);
            }
            replace_pph_problem_store_pointer_store(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
            if (pph_macros.NIL == pph_problem_store_okP()) {
                final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_macros.$str101$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_macros.ONE_INTEGER), pph_macros.$str102$__, format_nil.format_nil_a_no_copy((SubLObject)pph_macros.$str103$New_PPH_problem_store_is_not_ok__) });
                pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(pph_problem_store((SubLObject)pph_macros.UNPROVIDED)));
            }
            return Values.values(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread), (SubLObject)pph_macros.T);
        }
        return Values.values(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread), (SubLObject)pph_macros.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 13838L)
    public static SubLObject pph_problem_store_okP() {
        final SubLObject store = pph_problem_store((SubLObject)pph_macros.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_macros.$kw90$FREE == store || (pph_macros.NIL != inference_datastructures_problem_store.valid_problem_store_p(store) && pph_macros.NIL != pph_problem_store_size_okP(store)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 14038L)
    public static SubLObject pph_problem_store_size_okP(final SubLObject store) {
        return Numbers.numL(inference_datastructures_problem_store.problem_store_size(store), (SubLObject)pph_macros.$int104$100000);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 14429L)
    public static SubLObject creating_permanent_pph_phrases(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym4$CLET, (SubLObject)pph_macros.$list105, ConsesLow.append(body, (SubLObject)pph_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 14638L)
    public static SubLObject note_new_pph_phrase(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        stacks.stack_push(phrase, pph_macros.$new_pph_phrases$.getDynamicValue(thread));
        pph_macros.$new_pph_phrase_count$.setDynamicValue(Numbers.add(pph_macros.$new_pph_phrase_count$.getDynamicValue(thread), (SubLObject)pph_macros.ONE_INTEGER), thread);
        return (SubLObject)pph_macros.$kw106$NOTED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 14774L)
    public static SubLObject new_pph_phrase_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)((pph_macros.NIL != subl_promotions.non_negative_integer_p(pph_macros.$new_pph_phrase_count$.getDynamicValue(thread))) ? pph_macros.$new_pph_phrase_count$.getDynamicValue(thread) : pph_macros.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 15069L)
    public static SubLObject destroy_new_pph_phrases() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)pph_macros.ZERO_INTEGER;
        while (pph_macros.NIL == stacks.stack_empty_p(pph_macros.$new_pph_phrases$.getDynamicValue(thread))) {
            final SubLObject _prev_bind_0 = pph_macros.$inside_destroy_new_pph_phrasesP$.currentBinding(thread);
            try {
                pph_macros.$inside_destroy_new_pph_phrasesP$.bind((SubLObject)pph_macros.T, thread);
                final SubLObject phrase = stacks.stack_peek(pph_macros.$new_pph_phrases$.getDynamicValue(thread));
                if (pph_macros.NIL != pph_phrase.pph_phrase_p(phrase, (SubLObject)pph_macros.UNPROVIDED)) {
                    SubLObject err = (SubLObject)pph_macros.NIL;
                    try {
                        thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                        final SubLObject _prev_bind_0_$3 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind((SubLObject)pph_macros.$sym109$CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                pph_phrase.destroy_pph_phrase(phrase, (SubLObject)pph_macros.UNPROVIDED);
                                count = Numbers.add(count, (SubLObject)pph_macros.ONE_INTEGER);
                            }
                            catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, (SubLObject)pph_macros.NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(_prev_bind_0_$3, thread);
                        }
                    }
                    catch (Throwable ccatch_env_var) {
                        err = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    }
                    finally {
                        thread.throwStack.pop();
                    }
                    if (pph_macros.NIL != err && pph_macros.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_macros.ONE_INTEGER) && pph_macros.NIL == pph_error.suppress_pph_warningsP()) {
                        Errors.warn((SubLObject)pph_macros.$str110$error_while_destroying_phrase___S, err);
                        streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                    }
                }
                stacks.stack_pop(pph_macros.$new_pph_phrases$.getDynamicValue(thread));
            }
            finally {
                pph_macros.$inside_destroy_new_pph_phrasesP$.rebind(_prev_bind_0, thread);
            }
        }
        if (pph_macros.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_macros.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_macros.T, (SubLObject)pph_macros.$str111$Destroyed__S_PPH_phrases____New_o, count, pph_data_structures.pph_phrase_id_index_new_objects_count(), pph_data_structures.pph_phrase_id_index_new_objects_size(), (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED);
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 15769L)
    public static SubLObject destroying_new_pph_phrases_when_done(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym4$CLET, (SubLObject)pph_macros.$list112, (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym96$CUNWIND_PROTECT, reader.bq_cons((SubLObject)pph_macros.$sym1$PROGN, ConsesLow.append(body, (SubLObject)pph_macros.NIL)), (SubLObject)pph_macros.$list113));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 16145L)
    public static SubLObject get_new_pph_phrase_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)((pph_macros.NIL != misc_utilities.initialized_p(pph_macros.$new_pph_phrase_count$.getDynamicValue(thread))) ? pph_macros.$new_pph_phrase_count$.getDynamicValue(thread) : pph_macros.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 16322L)
    public static SubLObject possibly_destroying_new_pph_phrases_when_done(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list115);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject destroyP = (SubLObject)pph_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list115);
        destroyP = current.first();
        current = current.rest();
        if (pph_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject matrix_new_pph_phrases = (SubLObject)pph_macros.$sym116$MATRIX_NEW_PPH_PHRASES;
            final SubLObject phrase = (SubLObject)pph_macros.$sym117$PHRASE;
            return (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym4$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(matrix_new_pph_phrases, (SubLObject)pph_macros.$list118), (SubLObject)pph_macros.$list119, (SubLObject)pph_macros.$list120, reader.bq_cons(destroyP, (SubLObject)pph_macros.$list121)), (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym96$CUNWIND_PROTECT, reader.bq_cons((SubLObject)pph_macros.$sym1$PROGN, ConsesLow.append(body, (SubLObject)pph_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym122$PIF, destroyP, (SubLObject)pph_macros.$list123, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym124$DO_STACK_ELEMENTS, reader.bq_cons(phrase, (SubLObject)pph_macros.$list118), (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym125$STACK_PUSH, phrase, matrix_new_pph_phrases)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_macros.$list115);
        return (SubLObject)pph_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 16974L)
    public static SubLObject ensuring_pph_discourse_context(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym1$PROGN, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym122$PIF, (SubLObject)pph_macros.$list126, (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym1$PROGN, (SubLObject)pph_macros.$list127, ConsesLow.append(body, (SubLObject)pph_macros.NIL)), reader.bq_cons((SubLObject)pph_macros.$sym128$WITHIN_NEW_PPH_DISCOURSE_CONTEXT, ConsesLow.append(body, (SubLObject)pph_macros.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 17342L)
    public static SubLObject within_new_pph_discourse_context(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym4$CLET, (SubLObject)pph_macros.$list130, (SubLObject)pph_macros.$list131, (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym96$CUNWIND_PROTECT, (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym1$PROGN, (SubLObject)pph_macros.$list127, ConsesLow.append(body, (SubLObject)pph_macros.NIL)), (SubLObject)pph_macros.$list132));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 17857L)
    public static SubLObject herald_new_discourse_context() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_macros.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_macros.TWO_INTEGER)) {
            format_nil.force_format((SubLObject)pph_macros.T, (SubLObject)pph_macros.$str134$__Entering_WITHIN_NEW_PPH_DISCOUR, pph_vars.$pph_discourse_context$.getDynamicValue(thread), (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED);
        }
        return (SubLObject)pph_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 18094L)
    public static SubLObject herald_end_of_discourse_context() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_macros.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_macros.TWO_INTEGER)) {
            format_nil.force_format((SubLObject)pph_macros.T, (SubLObject)pph_macros.$str136$__Leaving_WITHIN_NEW_PPH_DISCOURS, pph_vars.$pph_discourse_context$.getDynamicValue(thread), (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED);
        }
        return (SubLObject)pph_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 18333L)
    public static SubLObject pph_discourse_context_initializedP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return pph_drs.pph_discourse_context_p(pph_vars.$pph_discourse_context$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 18494L)
    public static SubLObject clear_pph_discourse_context() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        pph_vars.$pph_discourse_context$.setDynamicValue((SubLObject)pph_macros.NIL, thread);
        return pph_vars.$pph_discourse_context$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 18662L)
    public static SubLObject with_shadowed_discourse_context(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list139);
        final SubLObject temp = current.rest();
        current = current.first();
        final SubLObject new_rms_var = (SubLObject)(current.isCons() ? current.first() : pph_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)pph_macros.$list139);
        current = current.rest();
        if (pph_macros.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_macros.$list139);
            return (SubLObject)pph_macros.NIL;
        }
        final SubLObject body;
        current = (body = temp);
        if (pph_macros.NIL != subl_promotions.memberP((SubLObject)pph_macros.$kw140$CYC_LEXICON, reader.$features$.getDynamicValue(thread), (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED)) {
            final SubLObject matrix_rms = (SubLObject)pph_macros.$sym141$MATRIX_RMS;
            final SubLObject last_clause = (SubLObject)(pph_macros.$str142$NIL.equal(Symbols.symbol_name(new_rms_var)) ? ConsesLow.list((SubLObject)pph_macros.$sym143$IGNORE, matrix_rms) : ConsesLow.list((SubLObject)pph_macros.$sym144$CSETQ, new_rms_var, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym145$NOTE_LEAVING_SHADOWED_DISCOURSE_CONTEXT, (SubLObject)pph_macros.$sym146$_PPH_DISCOURSE_CONTEXT_, matrix_rms)));
            return (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym4$CLET, reader.bq_cons(reader.bq_cons(matrix_rms, (SubLObject)pph_macros.$list147), (SubLObject)pph_macros.$list148), (SubLObject)pph_macros.$list149, ConsesLow.append(body, (SubLObject)ConsesLow.list(last_clause)));
        }
        return reader.bq_cons((SubLObject)pph_macros.$sym1$PROGN, ConsesLow.append(body, (SubLObject)pph_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 19344L)
    public static SubLObject note_leaving_shadowed_discourse_context(final SubLObject v_context, final SubLObject matrix_rms) {
        if (pph_macros.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_macros.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_macros.T, (SubLObject)pph_macros.$str151$__Leaving__S, v_context, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED);
        }
        SubLObject new_rms = (SubLObject)pph_macros.NIL;
        new_rms = conses_high.set_difference(pph_drs.pph_discourse_context_rms(v_context), matrix_rms, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED);
        if (pph_macros.NIL != new_rms && pph_macros.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_macros.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_macros.T, (SubLObject)pph_macros.$str152$New_RMS___S, new_rms, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED);
        }
        return new_rms;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 19784L)
    public static SubLObject with_pph_speaker_and_addressee(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list153);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject speaker = (SubLObject)pph_macros.NIL;
        SubLObject addressee = (SubLObject)pph_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list153);
        speaker = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list153);
        addressee = current.first();
        current = current.rest();
        if (pph_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym4$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym154$_PPH_SPEAKER_, speaker), (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym155$_PPH_ADDRESSEE_, addressee)), ConsesLow.append(body, (SubLObject)pph_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_macros.$list153);
        return (SubLObject)pph_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 20074L)
    public static SubLObject do_pph_output_list(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list156);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject string = (SubLObject)pph_macros.NIL;
        SubLObject output_list = (SubLObject)pph_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list156);
        string = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list156);
        output_list = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)pph_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)pph_macros.NIL;
        SubLObject current_$4 = (SubLObject)pph_macros.NIL;
        while (pph_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)pph_macros.$list156);
            current_$4 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)pph_macros.$list156);
            if (pph_macros.NIL == conses_high.member(current_$4, (SubLObject)pph_macros.$list157, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED)) {
                bad = (SubLObject)pph_macros.T;
            }
            if (current_$4 == pph_macros.$kw158$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (pph_macros.NIL != bad && pph_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_macros.$list156);
        }
        final SubLObject paranoid_arg_tail = cdestructuring_bind.property_list_member((SubLObject)pph_macros.$kw159$PARANOID_ARG, current);
        final SubLObject paranoid_arg = (SubLObject)((pph_macros.NIL != paranoid_arg_tail) ? conses_high.cadr(paranoid_arg_tail) : pph_macros.$sym160$PARANOID_ARG);
        final SubLObject output_item_tail = cdestructuring_bind.property_list_member((SubLObject)pph_macros.$kw161$OUTPUT_ITEM, current);
        final SubLObject output_item = (SubLObject)((pph_macros.NIL != output_item_tail) ? conses_high.cadr(output_item_tail) : pph_macros.$sym162$OUTPUT_ITEM);
        final SubLObject arg_position_tail = cdestructuring_bind.property_list_member((SubLObject)pph_macros.$kw163$ARG_POSITION, current);
        final SubLObject arg_position = (SubLObject)((pph_macros.NIL != arg_position_tail) ? conses_high.cadr(arg_position_tail) : pph_macros.$sym164$ARG_POSITION);
        final SubLObject html_open_tag_tail = cdestructuring_bind.property_list_member((SubLObject)pph_macros.$kw165$HTML_OPEN_TAG, current);
        final SubLObject html_open_tag = (SubLObject)((pph_macros.NIL != html_open_tag_tail) ? conses_high.cadr(html_open_tag_tail) : pph_macros.$sym166$HTML_OPEN_TAG);
        final SubLObject html_close_tag_tail = cdestructuring_bind.property_list_member((SubLObject)pph_macros.$kw167$HTML_CLOSE_TAG, current);
        final SubLObject html_close_tag = (SubLObject)((pph_macros.NIL != html_close_tag_tail) ? conses_high.cadr(html_close_tag_tail) : pph_macros.$sym168$HTML_CLOSE_TAG);
        final SubLObject start_char_index_tail = cdestructuring_bind.property_list_member((SubLObject)pph_macros.$kw169$START_CHAR_INDEX, current);
        final SubLObject start_char_index = (SubLObject)((pph_macros.NIL != start_char_index_tail) ? conses_high.cadr(start_char_index_tail) : pph_macros.$sym170$START_CHAR_INDEX);
        final SubLObject whole_string_tail = cdestructuring_bind.property_list_member((SubLObject)pph_macros.$kw171$WHOLE_STRING, current);
        final SubLObject whole_string = (SubLObject)((pph_macros.NIL != whole_string_tail) ? conses_high.cadr(whole_string_tail) : pph_macros.$sym172$WHOLE_STRING);
        final SubLObject body;
        current = (body = temp);
        final SubLObject item = (SubLObject)pph_macros.$sym173$ITEM;
        final SubLObject whole_html_string = (SubLObject)pph_macros.$sym174$WHOLE_HTML_STRING;
        final SubLObject end_char_index = (SubLObject)pph_macros.$sym175$END_CHAR_INDEX;
        final SubLObject iterator = (SubLObject)pph_macros.$sym176$ITERATOR;
        return (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym1$PROGN, (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym6$CHECK_TYPE, output_list, (SubLObject)pph_macros.$list177), (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym4$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(start_char_index, (SubLObject)pph_macros.$list178), reader.bq_cons(end_char_index, (SubLObject)pph_macros.$list178), (SubLObject)ConsesLow.list(whole_html_string, (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym179$PPH_PHRASE_OUTPUT_LIST_STRING, output_list, (SubLObject)pph_macros.$list180)), (SubLObject)ConsesLow.list(whole_string, (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym181$PPH_REMOVE_HTML_TAGS, whole_html_string, (SubLObject)pph_macros.$list121)), (SubLObject)ConsesLow.list(iterator, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym182$NEW_PPH_PHRASE_OUTPUT_LIST_ITERATOR, output_list))), (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym183$UNTIL, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym184$PPH_PHRASE_OUTPUT_LIST_ITERATOR_EMPTY_P, iterator), (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym4$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(item, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym185$PPH_PHRASE_OUTPUT_LIST_ITERATOR_NEXT, iterator))), (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym186$DO_ONE_PPH_OUTPUT_LIST_ITEM, (SubLObject)ConsesLow.list(new SubLObject[] { item, string, arg_position, html_open_tag, html_close_tag, paranoid_arg, output_item, whole_string, start_char_index, end_char_index }), ConsesLow.append(body, (SubLObject)pph_macros.NIL))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 21902L)
    public static SubLObject do_one_pph_output_list_item(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list188);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject item = (SubLObject)pph_macros.NIL;
        SubLObject string = (SubLObject)pph_macros.NIL;
        SubLObject arg_position = (SubLObject)pph_macros.NIL;
        SubLObject html_open_tag = (SubLObject)pph_macros.NIL;
        SubLObject html_close_tag = (SubLObject)pph_macros.NIL;
        SubLObject paranoid_arg = (SubLObject)pph_macros.NIL;
        SubLObject output_item = (SubLObject)pph_macros.NIL;
        SubLObject whole_string = (SubLObject)pph_macros.NIL;
        SubLObject start_char_index = (SubLObject)pph_macros.NIL;
        SubLObject end_char_index = (SubLObject)pph_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list188);
        item = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list188);
        string = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list188);
        arg_position = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list188);
        html_open_tag = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list188);
        html_close_tag = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list188);
        paranoid_arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list188);
        output_item = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list188);
        whole_string = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list188);
        start_char_index = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list188);
        end_char_index = current.first();
        current = current.rest();
        if (pph_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym1$PROGN, (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym189$PPH_MAYBE_DO_SPACE_ITEM, (SubLObject)ConsesLow.list(new SubLObject[] { item, string, arg_position, html_open_tag, html_close_tag, paranoid_arg, output_item, whole_string, start_char_index, end_char_index }), ConsesLow.append(body, (SubLObject)pph_macros.NIL)), (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym190$WITH_PPH_REGULAR_OUTPUT_ITEM_BINDINGS, (SubLObject)ConsesLow.list(item, string, arg_position, html_open_tag, html_close_tag, paranoid_arg, output_item), ConsesLow.append(body, (SubLObject)pph_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_macros.$list188);
        return (SubLObject)pph_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 22540L)
    public static SubLObject pph_maybe_do_space_item(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list188);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject item = (SubLObject)pph_macros.NIL;
        SubLObject string = (SubLObject)pph_macros.NIL;
        SubLObject arg_position = (SubLObject)pph_macros.NIL;
        SubLObject html_open_tag = (SubLObject)pph_macros.NIL;
        SubLObject html_close_tag = (SubLObject)pph_macros.NIL;
        SubLObject paranoid_arg = (SubLObject)pph_macros.NIL;
        SubLObject output_item = (SubLObject)pph_macros.NIL;
        SubLObject whole_string = (SubLObject)pph_macros.NIL;
        SubLObject start_char_index = (SubLObject)pph_macros.NIL;
        SubLObject end_char_index = (SubLObject)pph_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list188);
        item = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list188);
        string = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list188);
        arg_position = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list188);
        html_open_tag = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list188);
        html_close_tag = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list188);
        paranoid_arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list188);
        output_item = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list188);
        whole_string = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list188);
        start_char_index = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list188);
        end_char_index = current.first();
        current = current.rest();
        if (pph_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject raw_item_string = (SubLObject)pph_macros.$sym191$RAW_ITEM_STRING;
            return (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym4$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(raw_item_string, (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym192$PPH_PHRASE_OUTPUT_ITEM_GET_STRING, item, (SubLObject)pph_macros.$list121))), (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym144$CSETQ, start_char_index, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym193$PPH_OUTPUT_LIST_FIND_START_CHAR, raw_item_string, whole_string, end_char_index)), (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym58$PWHEN, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym194$_, start_char_index, end_char_index), (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym4$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(string, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym195$PPH_MAKE_SPACE_STRING, start_char_index, end_char_index)), reader.bq_cons(arg_position, (SubLObject)pph_macros.$list196), reader.bq_cons(html_open_tag, (SubLObject)pph_macros.$list121), reader.bq_cons(html_close_tag, (SubLObject)pph_macros.$list121), reader.bq_cons(paranoid_arg, (SubLObject)pph_macros.$list197), (SubLObject)ConsesLow.list(output_item, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym198$NEW_PPH_PHRASE_FILLER_ITEM, string)), (SubLObject)ConsesLow.list(start_char_index, end_char_index)), (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym143$IGNORE, paranoid_arg, output_item, arg_position, html_open_tag, html_close_tag, start_char_index), ConsesLow.append(body, (SubLObject)pph_macros.NIL))), (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym144$CSETQ, end_char_index, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym199$PPH_UPDATE_END_CHAR_INDEX, start_char_index, raw_item_string)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_macros.$list188);
        return (SubLObject)pph_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 23733L)
    public static SubLObject pph_update_end_char_index(final SubLObject start_char_index, final SubLObject raw_item_string) {
        return Numbers.add(start_char_index, Sequences.length(raw_item_string));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 23901L)
    public static SubLObject pph_make_space_string(final SubLObject start_char_index, final SubLObject end_char_index) {
        final SubLObject length = Numbers.subtract(start_char_index, end_char_index);
        if (length.numG((SubLObject)pph_macros.ONE_INTEGER)) {
            final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_macros.$str101$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_macros.ONE_INTEGER), pph_macros.$str102$__, format_nil.format_nil_a_no_copy((SubLObject)pph_macros.$str200$Adding_space_string_of_length__S) });
            pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(length));
        }
        return Strings.make_string(length, (SubLObject)Characters.CHAR_space);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 24197L)
    public static SubLObject with_pph_regular_output_item_bindings(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list201);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject item = (SubLObject)pph_macros.NIL;
        SubLObject string = (SubLObject)pph_macros.NIL;
        SubLObject arg_position = (SubLObject)pph_macros.NIL;
        SubLObject html_open_tag = (SubLObject)pph_macros.NIL;
        SubLObject html_close_tag = (SubLObject)pph_macros.NIL;
        SubLObject paranoid_arg = (SubLObject)pph_macros.NIL;
        SubLObject output_item = (SubLObject)pph_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list201);
        item = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list201);
        string = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list201);
        arg_position = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list201);
        html_open_tag = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list201);
        html_close_tag = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list201);
        paranoid_arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list201);
        output_item = current.first();
        current = current.rest();
        if (pph_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym4$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(string, (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym192$PPH_PHRASE_OUTPUT_ITEM_GET_STRING, item, (SubLObject)pph_macros.$list121)), (SubLObject)ConsesLow.list(arg_position, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym202$PPH_PHRASE_OUTPUT_ITEM_ARG_POSITION, item)), (SubLObject)ConsesLow.list(html_open_tag, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym203$PPH_PHRASE_OUTPUT_ITEM_HTML_OPEN_TAG, item)), (SubLObject)ConsesLow.list(html_close_tag, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym204$PPH_PHRASE_OUTPUT_ITEM_HTML_CLOSE_TAG, item)), (SubLObject)ConsesLow.list(paranoid_arg, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym205$PPH_PHRASE_OUTPUT_ITEM_CYCL, item)), (SubLObject)ConsesLow.list(output_item, item)), (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym143$IGNORE, paranoid_arg, output_item, arg_position, html_open_tag, html_close_tag), ConsesLow.append(body, (SubLObject)pph_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_macros.$list201);
        return (SubLObject)pph_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 24956L)
    public static SubLObject pph_output_list_find_start_char(final SubLObject string, final SubLObject whole_string, final SubLObject previous_end_char_index) {
        assert pph_macros.NIL != pph_string.pph_string_p(string) : string;
        final SubLObject tagless_string = pph_utilities.pph_remove_html_tags(string, (SubLObject)pph_macros.UNPROVIDED);
        final SubLObject ans = (pph_macros.NIL != list_utilities.lengthG(tagless_string, (SubLObject)pph_macros.ZERO_INTEGER, (SubLObject)pph_macros.UNPROVIDED)) ? pph_string.pph_string_position(pph_string.pph_string_char(tagless_string, (SubLObject)pph_macros.ZERO_INTEGER), whole_string, Symbols.symbol_function((SubLObject)pph_macros.$sym207$PPH_CHAR__), Symbols.symbol_function((SubLObject)pph_macros.IDENTITY), previous_end_char_index, (SubLObject)pph_macros.UNPROVIDED) : previous_end_char_index;
        if (!ans.isInteger()) {
            final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_macros.$str101$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_macros.ONE_INTEGER), pph_macros.$str102$__, format_nil.format_nil_a_no_copy((SubLObject)pph_macros.$str208$Couldn_t_find__S_in__S___) });
            pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(pph_string.pph_string_if_non_null_to_output_format(string, (SubLObject)pph_macros.UNPROVIDED), pph_string.pph_string_if_non_null_to_output_format(pph_string.pph_substring(whole_string, previous_end_char_index, (SubLObject)pph_macros.UNPROVIDED), (SubLObject)pph_macros.UNPROVIDED)));
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 25947L)
    public static SubLObject do_pph_javalist_items(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list209);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject item = (SubLObject)pph_macros.NIL;
        SubLObject javalist = (SubLObject)pph_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list209);
        item = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list209);
        javalist = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)pph_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)pph_macros.NIL;
        SubLObject current_$5 = (SubLObject)pph_macros.NIL;
        while (pph_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)pph_macros.$list209);
            current_$5 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)pph_macros.$list209);
            if (pph_macros.NIL == conses_high.member(current_$5, (SubLObject)pph_macros.$list210, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED)) {
                bad = (SubLObject)pph_macros.T;
            }
            if (current_$5 == pph_macros.$kw158$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (pph_macros.NIL != bad && pph_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_macros.$list209);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)pph_macros.$kw211$DONE, current);
        final SubLObject done = (SubLObject)((pph_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : pph_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym212$CSOME, (SubLObject)ConsesLow.list(item, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym213$PPH_NJAVALIST_ITEMS, javalist), done), ConsesLow.append(body, (SubLObject)pph_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 26248L)
    public static SubLObject with_pph_disambiguation_partial_results_accumulation(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list215);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject ans = (SubLObject)pph_macros.NIL;
        SubLObject threshold = (SubLObject)pph_macros.NIL;
        SubLObject notification_function_spec = (SubLObject)pph_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list215);
        ans = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list215);
        threshold = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list215);
        notification_function_spec = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)pph_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)pph_macros.NIL;
        SubLObject current_$6 = (SubLObject)pph_macros.NIL;
        while (pph_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)pph_macros.$list215);
            current_$6 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)pph_macros.$list215);
            if (pph_macros.NIL == conses_high.member(current_$6, (SubLObject)pph_macros.$list216, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED)) {
                bad = (SubLObject)pph_macros.T;
            }
            if (current_$6 == pph_macros.$kw158$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (pph_macros.NIL != bad && pph_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_macros.$list215);
        }
        final SubLObject return_style_tail = cdestructuring_bind.property_list_member((SubLObject)pph_macros.$kw217$RETURN_STYLE, current);
        final SubLObject return_style = (SubLObject)((pph_macros.NIL != return_style_tail) ? conses_high.cadr(return_style_tail) : pph_macros.$kw218$JAVALISTS);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym4$CLET, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$list219, (SubLObject)pph_macros.$list220, (SubLObject)pph_macros.$list221, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym222$_PARTIAL_RESULTS_NOTIFICATION_FN_, notification_function_spec), (SubLObject)pph_macros.$list223, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym224$_PPH_DISAMBIGUATION_MODE_RETURN_STYLE_, return_style)), (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym225$WITH_PARTIAL_RESULTS_ACCUMULATION, (SubLObject)ConsesLow.list(ans, threshold), ConsesLow.append(body, (SubLObject)pph_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 27155L)
    public static SubLObject initialize_disambiguation_phrases() {
        return dictionary.new_dictionary(Symbols.symbol_function((SubLObject)pph_macros.EQL), (SubLObject)pph_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 27364L)
    public static SubLObject accumulate_disambiguation_phrases(final SubLObject result) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert pph_macros.NIL != pph_disambiguation.incremental_pph_disambiguation_result_p(result) : result;
        final SubLObject index = pph_disambiguation.incremental_pph_disambiguation_result_index(result);
        final SubLObject output_list = pph_disambiguation.incremental_pph_disambiguation_result_output_list(result);
        SubLObject formatted_result_value = (SubLObject)pph_macros.NIL;
        final SubLObject pcase_var = pph_macros.$pph_disambiguation_mode_return_style$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)pph_macros.$kw218$JAVALISTS)) {
            formatted_result_value = pph_utilities.pph_output_list_to_javalist(output_list);
        }
        else {
            final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_macros.$str101$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_macros.$str227$Don_t_know_how_to_accumulate__S_a), pph_macros.$str102$__, format_nil.format_nil_a_no_copy(pph_macros.$pph_disambiguation_mode_return_style$.getDynamicValue(thread)) });
            pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(pph_macros.EMPTY_SUBL_OBJECT_ARRAY));
        }
        add_pph_disambiguation_result_to_accumulator(index, formatted_result_value, utilities_macros.$partial_results_accumulator$.getDynamicValue(thread));
        return utilities_macros.$partial_results_accumulator$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 28125L)
    public static SubLObject add_pph_disambiguation_result_to_accumulator(final SubLObject index, final SubLObject formatted_result_value, final SubLObject accumulator) {
        dictionary.dictionary_enter(accumulator, index, formatted_result_value);
        return accumulator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 28313L)
    public static SubLObject consolidate_disambiguation_phrases(final SubLObject accumulated_results) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(accumulated_results)); pph_macros.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject index = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject formatted_result_value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            add_pph_disambiguation_result_to_accumulator(index, formatted_result_value, utilities_macros.$partial_results_total_accumulator$.getDynamicValue(thread));
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return (SubLObject)pph_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 28657L)
    public static SubLObject final_results_for_disambiguation_phrases(final SubLObject total_results) {
        return list_utilities.alist_values(dictionary_utilities.sort_dictionary_by_keys(total_results, Symbols.symbol_function((SubLObject)pph_macros.$sym228$_)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 28870L)
    public static SubLObject gathering_pph_problems(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list229);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject problem_dictionary_var = (SubLObject)pph_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list229);
        problem_dictionary_var = current.first();
        current = current.rest();
        if (pph_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject matrix_problem_dictionary = (SubLObject)pph_macros.$sym230$MATRIX_PROBLEM_DICTIONARY;
            return (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym1$PROGN, (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym144$CSETQ, problem_dictionary_var, (SubLObject)pph_macros.$list231), (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym4$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(matrix_problem_dictionary, (SubLObject)pph_macros.$list232), (SubLObject)pph_macros.$list233, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym234$_PPH_PROBLEM_REPORTS_, problem_dictionary_var)), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym58$PWHEN, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym235$DICTIONARY_P, matrix_problem_dictionary), (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym236$PPH_MERGE_PROBLEM_DICTIONARY, (SubLObject)pph_macros.$sym234$_PPH_PROBLEM_REPORTS_, matrix_problem_dictionary))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_macros.$list229);
        return (SubLObject)pph_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 29946L)
    public static SubLObject with_pph_timeout(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list237);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject timed_outP = (SubLObject)pph_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list237);
        timed_outP = current.first();
        current = current.rest();
        final SubLObject delay_in_seconds = current.isCons() ? current.first() : pph_timeout();
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)pph_macros.$list237);
        current = current.rest();
        if (pph_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym4$CLET, (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$list238, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym239$_PPH_TIMEOUT_TIME_, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym240$PPH_COMPUTE_TIMEOUT_TIME, delay_in_seconds)), (SubLObject)pph_macros.$list241), (SubLObject)pph_macros.$list242, (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym97$PUNLESS, (SubLObject)pph_macros.$sym243$_PPH_TIMEOUT_REACHED__, ConsesLow.append(body, (SubLObject)pph_macros.NIL)), (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym144$CSETQ, timed_outP, (SubLObject)pph_macros.$list244));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_macros.$list237);
        return (SubLObject)pph_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 30780L)
    public static SubLObject pph_timeout_time_reachedP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!pph_macros.$pph_timeout_time$.getDynamicValue(thread).isNumber()) {
            return (SubLObject)pph_macros.NIL;
        }
        if (pph_macros.NIL != pph_macros.$pph_timeout_reachedP$.getDynamicValue(thread)) {
            return (SubLObject)pph_macros.T;
        }
        if (pph_timeout_current_time().numGE(pph_macros.$pph_timeout_time$.getDynamicValue(thread))) {
            pph_macros.$pph_timeout_reachedP$.setDynamicValue((SubLObject)pph_macros.T, thread);
            Errors.warn((SubLObject)pph_macros.$str245$PPH_timeout_reached_);
            return (SubLObject)pph_macros.T;
        }
        return (SubLObject)pph_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 31142L)
    public static SubLObject pph_timeout_current_time() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        pph_macros.$pph_timeout_time_check_count$.setDynamicValue(Numbers.add(pph_macros.$pph_timeout_time_check_count$.getDynamicValue(thread), (SubLObject)pph_macros.ONE_INTEGER), thread);
        return Time.get_internal_real_time();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 31263L)
    public static SubLObject pph_compute_timeout_time(final SubLObject delay_in_seconds) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!delay_in_seconds.isNumber()) {
            return pph_macros.$pph_timeout_time$.getDynamicValue(thread);
        }
        final SubLObject current_time = pph_timeout_current_time();
        final SubLObject offset = Numbers.floor(Numbers.multiply(delay_in_seconds, time_high.$internal_time_units_per_second$.getGlobalValue()), (SubLObject)pph_macros.UNPROVIDED);
        return number_utilities.minimum(Sequences.remove((SubLObject)pph_macros.NIL, (SubLObject)ConsesLow.list(pph_macros.$pph_timeout_time$.getDynamicValue(thread), Numbers.add(current_time, offset)), (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED), (SubLObject)pph_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 31635L)
    public static SubLObject pph_timeout() {
        final SubLObject allowable_time = pph_allowable_time();
        return (SubLObject)((pph_macros.NIL != number_utilities.positive_number_p(allowable_time)) ? allowable_time : pph_macros.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 31822L)
    public static SubLObject pph_allowable_time() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_macros.NIL != pph_vars.pph_failure_is_an_option_p()) {
            return pph_macros.$pph_default_timeout$.getDynamicValue(thread);
        }
        return number_utilities.positive_infinity();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 32068L)
    public static SubLObject noting_unexpressed_negations(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject already_initializedP = (SubLObject)pph_macros.$sym248$ALREADY_INITIALIZED_;
        return (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym4$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(already_initializedP, (SubLObject)pph_macros.$list249), (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym250$_PPH_UNEXPRESSED_NEGATIONS_, (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym31$FIF, already_initializedP, (SubLObject)pph_macros.$list251))), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym97$PUNLESS, (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym252$COR, already_initializedP, (SubLObject)pph_macros.$list253), (SubLObject)pph_macros.$list254))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 32608L)
    public static SubLObject possibly_with_pph_language_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject generation_mt = (SubLObject)pph_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list255);
        generation_mt = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym4$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym256$_PPH_LANGUAGE_MT_, (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym31$FIF, generation_mt, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym257$PPH_CANONICALIZE_HLMT, generation_mt), (SubLObject)pph_macros.$list258))), ConsesLow.append(body, (SubLObject)pph_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 32821L)
    public static SubLObject possibly_with_pph_domain_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject domain_mt = (SubLObject)pph_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list259);
        domain_mt = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym4$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym260$_PPH_DOMAIN_MT_, (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym31$FIF, domain_mt, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym257$PPH_CANONICALIZE_HLMT, domain_mt), (SubLObject)pph_macros.$list261))), ConsesLow.append(body, (SubLObject)pph_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 33016L)
    public static SubLObject with_language_and_domain_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list262);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject generation_mt = (SubLObject)pph_macros.NIL;
        SubLObject domain_mt = (SubLObject)pph_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list262);
        generation_mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list262);
        domain_mt = current.first();
        current = current.rest();
        if (pph_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym263$POSSIBLY_WITH_PPH_LANGUAGE_MT, generation_mt, (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym264$POSSIBLY_WITH_PPH_DOMAIN_MT, domain_mt, ConsesLow.append(body, (SubLObject)pph_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_macros.$list262);
        return (SubLObject)pph_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 33219L)
    public static SubLObject with_pph_language_mt_relevance(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list265);
        final SubLObject temp = current.rest();
        current = current.first();
        final SubLObject broadenP = (SubLObject)(current.isCons() ? current.first() : pph_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)pph_macros.$list265);
        current = current.rest();
        if (pph_macros.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_macros.$list265);
            return (SubLObject)pph_macros.NIL;
        }
        final SubLObject body;
        current = (body = temp);
        if (pph_macros.NIL == broadenP) {
            return (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym266$WITH_INFERENCE_MT_RELEVANCE, (SubLObject)pph_macros.$sym256$_PPH_LANGUAGE_MT_, ConsesLow.append(body, (SubLObject)pph_macros.NIL));
        }
        final SubLObject broadened_language_mt = (SubLObject)pph_macros.$sym267$BROADENED_LANGUAGE_MT;
        return (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym1$PROGN, (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym268$WITH_PPH_LANGUAGE_MT_RELEVANCE, (SubLObject)pph_macros.NIL, ConsesLow.append(body, (SubLObject)pph_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym58$PWHEN, broadenP, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym4$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(broadened_language_mt, (SubLObject)pph_macros.$list269)), (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym97$PUNLESS, (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym270$HLMT_EQUAL_, broadened_language_mt, (SubLObject)pph_macros.$list258), (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym4$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym256$_PPH_LANGUAGE_MT_, broadened_language_mt)), (SubLObject)pph_macros.$list271, (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym266$WITH_INFERENCE_MT_RELEVANCE, (SubLObject)pph_macros.$sym256$_PPH_LANGUAGE_MT_, ConsesLow.append(body, (SubLObject)pph_macros.NIL)))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 34070L)
    public static SubLObject with_pph_domain_and_language_mt_union_relevance(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym266$WITH_INFERENCE_MT_RELEVANCE, (SubLObject)pph_macros.$list272, ConsesLow.append(body, (SubLObject)pph_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 34340L)
    public static SubLObject do_pph_phrase_fns(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list273);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject fn = (SubLObject)pph_macros.NIL;
        SubLObject mt = (SubLObject)pph_macros.NIL;
        SubLObject done = (SubLObject)pph_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list273);
        fn = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list273);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list273);
        done = current.first();
        current = current.rest();
        if (pph_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym274$DO_DICTIONARY, (SubLObject)ConsesLow.listS(fn, mt, (SubLObject)pph_macros.$list275), (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym97$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym252$COR, done, (SubLObject)ConsesLow.listS((SubLObject)pph_macros.EQ, fn, (SubLObject)pph_macros.$list276)), ConsesLow.append(body, (SubLObject)pph_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_macros.$list273);
        return (SubLObject)pph_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 34516L)
    public static SubLObject possibly_suspending_pph_bullets(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list277);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject okP = (SubLObject)pph_macros.NIL;
        SubLObject v_object = (SubLObject)pph_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list277);
        okP = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list277);
        v_object = current.first();
        current = current.rest();
        if (pph_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject suspendP = (SubLObject)pph_macros.$sym278$SUSPEND_;
            return (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym4$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(suspendP, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym47$CAND, (SubLObject)pph_macros.$sym279$_PPH_USE_BULLETED_LISTS__, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym49$CNOT, okP))), (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym279$_PPH_USE_BULLETED_LISTS__, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym47$CAND, (SubLObject)pph_macros.$sym279$_PPH_USE_BULLETED_LISTS__, okP))), (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym58$PWHEN, suspendP, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym280$PPH_NOTE, (SubLObject)pph_macros.ONE_INTEGER, (SubLObject)pph_macros.$str281$__Suspending_bullet_use_for____S_, v_object)), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym58$PWHEN, suspendP, (SubLObject)pph_macros.$list282))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_macros.$list277);
        return (SubLObject)pph_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 34939L)
    public static SubLObject with_pph_demerit_cutoff(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list283);
        final SubLObject temp = current.rest();
        current = current.first();
        final SubLObject cutoff = current.isCons() ? current.first() : pph_vars.$pph_suggested_demerit_cutoff$.getGlobalValue();
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)pph_macros.$list283);
        current = current.rest();
        if (pph_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym1$PROGN, (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym284$PPH_CHECK_TYPE, cutoff, (SubLObject)pph_macros.$list285), (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym4$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym286$_PPH_DEMERIT_CUTOFF_, cutoff)), ConsesLow.append(body, (SubLObject)pph_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_macros.$list283);
        return (SubLObject)pph_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 35361L)
    public static SubLObject with_maximum_pph_demerit_cutoff(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list283);
        final SubLObject temp = current.rest();
        current = current.first();
        final SubLObject cutoff = current.isCons() ? current.first() : pph_vars.$pph_suggested_demerit_cutoff$.getGlobalValue();
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)pph_macros.$list283);
        current = current.rest();
        if (pph_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym1$PROGN, (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym284$PPH_CHECK_TYPE, cutoff, (SubLObject)pph_macros.$list285), (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym4$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym286$_PPH_DEMERIT_CUTOFF_, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym287$COMPUTE_NEW_PPH_DEMERIT_CUTOFF, cutoff))), ConsesLow.append(body, (SubLObject)pph_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_macros.$list283);
        return (SubLObject)pph_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 35880L)
    public static SubLObject valid_pph_demerit_cutoff_p(final SubLObject v_object) {
        return number_utilities.non_negative_potentially_infinite_number_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 35996L)
    public static SubLObject compute_new_pph_demerit_cutoff(final SubLObject maximum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cutoffs = list_utilities.remove_if_not(Symbols.symbol_function((SubLObject)pph_macros.$sym289$INTEGERP), (SubLObject)ConsesLow.list(maximum, pph_vars.$pph_demerit_cutoff$.getDynamicValue(thread)), (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED);
        return (pph_macros.NIL != cutoffs) ? number_utilities.minimum(cutoffs, (SubLObject)pph_macros.UNPROVIDED) : number_utilities.positive_infinity();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 36263L)
    public static SubLObject with_pph_phrase_destruction_grace_period(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list290);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject seconds = (SubLObject)pph_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list290);
        seconds = current.first();
        current = current.rest();
        if (pph_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject old_grace_period = (SubLObject)pph_macros.$sym291$OLD_GRACE_PERIOD;
            return (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym4$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(old_grace_period, (SubLObject)pph_macros.$list292)), (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym96$CUNWIND_PROTECT, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym1$PROGN, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym293$SET_PPH_PHRASE_DESTRUCTION_GRACE_PERIOD, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym294$MAX, old_grace_period, seconds)), (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym4$CLET, (SubLObject)pph_macros.$list295, ConsesLow.append(body, (SubLObject)pph_macros.NIL)))), (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym293$SET_PPH_PHRASE_DESTRUCTION_GRACE_PERIOD, old_grace_period));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_macros.$list290);
        return (SubLObject)pph_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 36839L)
    public static SubLObject remembering_pph_proofs(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym4$CLET, (SubLObject)pph_macros.$list296, ConsesLow.append(body, (SubLObject)pph_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 37185L)
    public static SubLObject with_pph_inference_answer(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list297);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject inference_answer = (SubLObject)pph_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list297);
        inference_answer = current.first();
        current = current.rest();
        if (pph_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym4$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym298$_PPH_INFERENCE_ANSWER_, inference_answer)), (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym299$WITH_PPH_INFERENCE, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym300$INFERENCE_ANSWER_INFERENCE, inference_answer)), ConsesLow.append(body, (SubLObject)pph_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_macros.$list297);
        return (SubLObject)pph_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 37414L)
    public static SubLObject with_pph_inference(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list301);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject inference = (SubLObject)pph_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list301);
        inference = current.first();
        current = current.rest();
        if (pph_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym4$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym302$_PPH_HYPOTHETICAL_VARS_, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym303$INFERENCE_HYPOTHETICAL_BINDINGS, inference)), (SubLObject)pph_macros.$list304, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym260$_PPH_DOMAIN_MT_, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym305$PPH_ENHANCED_DOMAIN_MT, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym306$PPH_GET_INFERENCE_MT, inference)))), ConsesLow.append(body, (SubLObject)pph_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_macros.$list301);
        return (SubLObject)pph_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 37711L)
    public static SubLObject with_pph_justification_generation_parameters(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list297);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject inference_answer = (SubLObject)pph_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list297);
        inference_answer = current.first();
        current = current.rest();
        if (pph_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym307$WITH_PPH_INFERENCE_ANSWER, (SubLObject)ConsesLow.list(inference_answer), (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym4$CLET, (SubLObject)pph_macros.$list308, reader.bq_cons((SubLObject)pph_macros.$sym309$POSSIBLY_WITH_PPH_HTML_JUSTIFICATION_GENERATION_PARAMETERS, ConsesLow.append(body, (SubLObject)pph_macros.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_macros.$list297);
        return (SubLObject)pph_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 38223L)
    public static SubLObject possibly_with_pph_html_justification_generation_parameters(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject link_function = (SubLObject)pph_macros.$sym310$LINK_FUNCTION;
        final SubLObject html_target = (SubLObject)pph_macros.$sym311$HTML_TARGET;
        return (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym52$CMULTIPLE_VALUE_BIND, (SubLObject)ConsesLow.list(link_function, html_target), (SubLObject)pph_macros.$list312, (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym313$WITH_PPH_HTML_FUNCTION_AND_TARGET, (SubLObject)ConsesLow.list(link_function, html_target), ConsesLow.append(body, (SubLObject)pph_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 38621L)
    public static SubLObject pph_possibly_enable_showXhide() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_macros.NIL != pph_vars.$pph_use_showXhideP$.getDynamicValue(thread)) {
            dhtml_macros.dhtml_with_dom_script();
            dhtml_macros.dhtml_with_toggle_visibility_support();
        }
        return (SubLObject)pph_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 38822L)
    public static SubLObject pph_justification_html_function_and_target() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject link_function = pph_vars.$constant_link_function$.getDynamicValue(thread);
        final SubLObject target = pph_vars.$html_generation_target$.getDynamicValue(thread);
        return Values.values(link_function, target);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 39307L)
    public static SubLObject pph_setting_var_types_if_successful(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list316);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject phrase = (SubLObject)pph_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list316);
        phrase = current.first();
        current = current.rest();
        if (pph_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject var_types_shadow = (SubLObject)pph_macros.$sym317$VAR_TYPES_SHADOW;
            return (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym4$CLET, reader.bq_cons(reader.bq_cons(var_types_shadow, (SubLObject)pph_macros.$list318), (SubLObject)pph_macros.$list319), (SubLObject)pph_macros.$list320, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym96$CUNWIND_PROTECT, (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym4$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym321$_PPH_VAR_TYPES_, var_types_shadow)), ConsesLow.append(body, (SubLObject)pph_macros.NIL)), (SubLObject)pph_macros.$list322, (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym122$PIF, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym323$PPH_PHRASE_DONE_, phrase), (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym1$PROGN, (SubLObject)pph_macros.$list324, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym280$PPH_NOTE, (SubLObject)pph_macros.ONE_INTEGER, (SubLObject)pph_macros.$str325$___Setting__S_to____S, (SubLObject)pph_macros.$sym321$_PPH_VAR_TYPES_, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym326$DICTIONARY_VALUES, var_types_shadow)), (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym327$PPH_RESET_VAR_TYPES, var_types_shadow)), (SubLObject)pph_macros.$list328)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_macros.$list316);
        return (SubLObject)pph_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 40618L)
    public static SubLObject pph_reset_var_types(final SubLObject var_types_shadow) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        pph_variable_handling.clear_pph_var_types();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(var_types_shadow)); pph_macros.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject var_entry = thread.secondMultipleValue();
            thread.resetMultipleValues();
            dictionary.dictionary_enter(pph_vars.$pph_var_types$.getDynamicValue(thread), var, var_entry);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return pph_vars.$pph_var_types$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 40879L)
    public static SubLObject pph_possibly_binding_variables(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject old_pph_vars = (SubLObject)pph_macros.$sym330$OLD_PPH_VARS;
        return (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym4$CLET, (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$list331, reader.bq_cons(old_pph_vars, (SubLObject)pph_macros.$list332), (SubLObject)pph_macros.$list333), (SubLObject)pph_macros.$list334, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym96$CUNWIND_PROTECT, reader.bq_cons((SubLObject)pph_macros.$sym1$PROGN, ConsesLow.append(body, (SubLObject)pph_macros.NIL)), (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym4$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym335$LOCAL_VARS, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym336$SET_DIFFERENCE, (SubLObject)pph_macros.$list337, old_pph_vars))), (SubLObject)pph_macros.$list338)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 42056L)
    public static SubLObject pph_handle_local_vars(final SubLObject local_vars) {
        SubLObject cdolist_list_var = local_vars;
        SubLObject var = (SubLObject)pph_macros.NIL;
        var = cdolist_list_var.first();
        while (pph_macros.NIL != cdolist_list_var) {
            if (pph_macros.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_macros.TWO_INTEGER)) {
                format_nil.force_format((SubLObject)pph_macros.T, (SubLObject)pph_macros.$str341$__Deregistering__S__, var, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED);
            }
            pph_variable_handling.pph_deregister_var(var);
            pph_drs.pph_remove_rm_with_cycl(var);
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        }
        return (SubLObject)pph_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 42304L)
    public static SubLObject destructure_pph_pronoun_agr(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list342);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject person = (SubLObject)pph_macros.NIL;
        SubLObject number = (SubLObject)pph_macros.NIL;
        SubLObject gender = (SubLObject)pph_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list342);
        person = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list342);
        number = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list342);
        gender = current.first();
        current = current.rest();
        if (pph_macros.NIL == current) {
            current = temp;
            SubLObject pronoun_agr = (SubLObject)pph_macros.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list342);
            pronoun_agr = current.first();
            final SubLObject body;
            current = (body = current.rest());
            return (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym343$CDESTRUCTURING_BIND, (SubLObject)ConsesLow.list(person, number, gender), pronoun_agr, ConsesLow.append(body, (SubLObject)pph_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_macros.$list342);
        return (SubLObject)pph_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 42482L)
    public static SubLObject pph_phrase_do_agr_constraints(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list344);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject agr_constraint = (SubLObject)pph_macros.NIL;
        SubLObject phrase = (SubLObject)pph_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list344);
        agr_constraint = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list344);
        phrase = current.first();
        current = current.rest();
        if (pph_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym4$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(agr_constraint, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym345$PPH_PHRASE_AGR, phrase))), ConsesLow.append(body, (SubLObject)pph_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_macros.$list344);
        return (SubLObject)pph_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 42642L)
    public static SubLObject do_pph_phrase_templates_for_formula(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list346);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject template = (SubLObject)pph_macros.NIL;
        SubLObject formula = (SubLObject)pph_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list346);
        template = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list346);
        formula = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)pph_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)pph_macros.NIL;
        SubLObject current_$7 = (SubLObject)pph_macros.NIL;
        while (pph_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)pph_macros.$list346);
            current_$7 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)pph_macros.$list346);
            if (pph_macros.NIL == conses_high.member(current_$7, (SubLObject)pph_macros.$list347, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED)) {
                bad = (SubLObject)pph_macros.T;
            }
            if (current_$7 == pph_macros.$kw158$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (pph_macros.NIL != bad && pph_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_macros.$list346);
        }
        final SubLObject reln_tail = cdestructuring_bind.property_list_member((SubLObject)pph_macros.$kw348$RELN, current);
        final SubLObject reln = (SubLObject)((pph_macros.NIL != reln_tail) ? conses_high.cadr(reln_tail) : pph_macros.NIL);
        final SubLObject arg_position_map_tail = cdestructuring_bind.property_list_member((SubLObject)pph_macros.$kw349$ARG_POSITION_MAP, current);
        final SubLObject arg_position_map = (pph_macros.NIL != arg_position_map_tail) ? conses_high.cadr(arg_position_map_tail) : pph_utilities.pph_new_empty_map();
        final SubLObject inverseP_tail = cdestructuring_bind.property_list_member((SubLObject)pph_macros.$kw350$INVERSE_, current);
        final SubLObject inverseP = (SubLObject)((pph_macros.NIL != inverseP_tail) ? conses_high.cadr(inverseP_tail) : pph_macros.$sym351$IGNORE_ME);
        final SubLObject nl_preds_tail = cdestructuring_bind.property_list_member((SubLObject)pph_macros.$kw352$NL_PREDS, current);
        final SubLObject nl_preds = (SubLObject)((pph_macros.NIL != nl_preds_tail) ? conses_high.cadr(nl_preds_tail) : pph_macros.$kw353$ANY);
        final SubLObject focus_argnum_tail = cdestructuring_bind.property_list_member((SubLObject)pph_macros.$kw354$FOCUS_ARGNUM, current);
        final SubLObject focus_argnum = (SubLObject)((pph_macros.NIL != focus_argnum_tail) ? conses_high.cadr(focus_argnum_tail) : pph_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)pph_macros.$kw211$DONE, current);
        final SubLObject done = (SubLObject)((pph_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : pph_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject generator = (SubLObject)pph_macros.$sym355$GENERATOR;
        return (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym4$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(generator, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym356$GET_PPH_PHRASE_TEMPLATE_GENERATOR, formula, focus_argnum, reln, nl_preds, arg_position_map))), (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym96$CUNWIND_PROTECT, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym183$UNTIL, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym252$COR, done, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym357$PPH_PHRASE_TEMPLATE_GENERATOR_DONE_P, generator)), (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym52$CMULTIPLE_VALUE_BIND, (SubLObject)ConsesLow.list(template, inverseP), (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym358$PPH_PHRASE_TEMPLATE_GENERATOR_NEXT, generator), (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym143$IGNORE, inverseP), (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym58$PWHEN, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym359$PPH_PHRASE_P, template), ConsesLow.append(body, (SubLObject)pph_macros.NIL))))), (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym360$FREE_PPH_PHRASE_TEMPLATE_GENERATOR, generator));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 43502L)
    public static SubLObject do_pph_phrases_for_formula(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list361);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_pph_phrase = (SubLObject)pph_macros.NIL;
        SubLObject formula = (SubLObject)pph_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list361);
        v_pph_phrase = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list361);
        formula = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)pph_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)pph_macros.NIL;
        SubLObject current_$8 = (SubLObject)pph_macros.NIL;
        while (pph_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)pph_macros.$list361);
            current_$8 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)pph_macros.$list361);
            if (pph_macros.NIL == conses_high.member(current_$8, (SubLObject)pph_macros.$list362, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED)) {
                bad = (SubLObject)pph_macros.T;
            }
            if (current_$8 == pph_macros.$kw158$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (pph_macros.NIL != bad && pph_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_macros.$list361);
        }
        final SubLObject focus_arg_tail = cdestructuring_bind.property_list_member((SubLObject)pph_macros.$kw363$FOCUS_ARG, current);
        final SubLObject focus_arg = (SubLObject)((pph_macros.NIL != focus_arg_tail) ? conses_high.cadr(focus_arg_tail) : pph_macros.NIL);
        final SubLObject arg_position_map_tail = cdestructuring_bind.property_list_member((SubLObject)pph_macros.$kw349$ARG_POSITION_MAP, current);
        final SubLObject arg_position_map = (SubLObject)((pph_macros.NIL != arg_position_map_tail) ? conses_high.cadr(arg_position_map_tail) : pph_macros.NIL);
        final SubLObject nl_preds_tail = cdestructuring_bind.property_list_member((SubLObject)pph_macros.$kw352$NL_PREDS, current);
        final SubLObject nl_preds = (SubLObject)((pph_macros.NIL != nl_preds_tail) ? conses_high.cadr(nl_preds_tail) : pph_macros.$kw353$ANY);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)pph_macros.$kw211$DONE, current);
        final SubLObject done = (SubLObject)((pph_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : pph_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject phrase_template = (SubLObject)pph_macros.$sym364$PHRASE_TEMPLATE;
        return (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym365$DO_PPH_PHRASE_TEMPLATES_FOR_FORMULA, (SubLObject)ConsesLow.list(new SubLObject[] { phrase_template, formula, pph_macros.$kw354$FOCUS_ARGNUM, focus_arg, pph_macros.$kw349$ARG_POSITION_MAP, arg_position_map, pph_macros.$kw352$NL_PREDS, nl_preds, pph_macros.$kw211$DONE, done }), (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym4$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(v_pph_phrase, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym366$PPH_CUSTOMIZE_TEMPLATE_MACRO_HELPER, phrase_template, formula, arg_position_map, nl_preds))), ConsesLow.append(body, (SubLObject)pph_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 44207L)
    public static SubLObject max_suspended_method_depth() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return pph_macros.$max_suspended_method_depth$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 44526L)
    public static SubLObject handling_pph_method_failures_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ans = (SubLObject)SubLObjectFactory.makeBoolean(pph_macros.NIL != pph_macros.$allow_handling_of_pph_method_failuresP$.getDynamicValue(thread) && pph_macros.NIL != pph_macros.$handling_pph_method_failuresP$.getDynamicValue(thread));
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 44696L)
    public static SubLObject handling_pph_method_failures(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject failed_method = (SubLObject)pph_macros.$sym370$FAILED_METHOD;
        final SubLObject tried_oneP = (SubLObject)pph_macros.$sym371$TRIED_ONE_;
        final SubLObject top_levelP = (SubLObject)pph_macros.$sym372$TOP_LEVEL_;
        return (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym4$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(top_levelP, (SubLObject)pph_macros.$list373), (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym374$_SUSPENDED_PARAPHRASE_METHODS_, (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym31$FIF, top_levelP, (SubLObject)pph_macros.$list375)), (SubLObject)pph_macros.$list376, reader.bq_cons(failed_method, (SubLObject)pph_macros.$list121), reader.bq_cons(tried_oneP, (SubLObject)pph_macros.$list121)), (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym377$WHILE, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym252$COR, failed_method, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym49$CNOT, tried_oneP)), (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym58$PWHEN, failed_method, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym378$NOTE_SUSPENDED_PARAPHRASE_METHOD_PLIST, failed_method), (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym144$CSETQ, failed_method, (SubLObject)pph_macros.$list121)), (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym379$CCATCH, (SubLObject)pph_macros.$kw380$PPH_METHOD_FAILURE, failed_method, ConsesLow.append(body, (SubLObject)pph_macros.NIL)), (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym144$CSETQ, tried_oneP, (SubLObject)pph_macros.$list180)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 45392L)
    public static SubLObject handling_pph_method_failures_top_level_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ans = (SubLObject)SubLObjectFactory.makeBoolean(pph_macros.NIL == pph_macros.$handling_pph_method_failuresP$.getDynamicValue(thread));
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 45569L)
    public static SubLObject throw_pph_method_failure(final SubLObject data) {
        Dynamic.sublisp_throw((SubLObject)pph_macros.$kw380$PPH_METHOD_FAILURE, data);
        return data;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 45669L)
    public static SubLObject note_suspended_paraphrase_method_plist(final SubLObject plist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_macros.NIL == handling_pph_method_failures_p()) {
            final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_macros.$str101$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_macros.ONE_INTEGER), pph_macros.$str102$__, format_nil.format_nil_a_no_copy((SubLObject)pph_macros.$str382$Can_t_note_PPH_method_failure__no) });
            pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(pph_macros.EMPTY_SUBL_OBJECT_ARRAY));
        }
        if (pph_macros.NIL != set.set_memberP(plist, pph_macros.$suspended_paraphrase_methods$.getDynamicValue(thread))) {
            final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_macros.$str101$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_macros.ONE_INTEGER), pph_macros.$str102$__, format_nil.format_nil_a_no_copy((SubLObject)pph_macros.$str383$_S___is_already_suspended_) });
            pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(plist));
        }
        set.set_add(plist, pph_macros.$suspended_paraphrase_methods$.getDynamicValue(thread));
        if (set.set_size(pph_macros.$suspended_paraphrase_methods$.getDynamicValue(thread)).numG(pph_macros.$max_suspended_method_depth$.getDynamicValue(thread))) {
            final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_macros.$str101$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_macros.TWO_INTEGER), pph_macros.$str102$__, format_nil.format_nil_a_no_copy((SubLObject)pph_macros.$str384$Over__S_suspended_methods____Curr) });
            pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(pph_macros.$max_suspended_method_depth$.getDynamicValue(thread), plist));
        }
        return pph_macros.$suspended_paraphrase_methods$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 46304L)
    public static SubLObject clear_pph_suspended_methods_for_cycl(final SubLObject cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)pph_macros.ZERO_INTEGER;
        if (pph_macros.NIL != pph_macros.$handling_pph_method_failuresP$.getDynamicValue(thread)) {
            SubLObject doomed = (SubLObject)pph_macros.NIL;
            final SubLObject set_contents_var = set.do_set_internal(pph_macros.$suspended_paraphrase_methods$.getDynamicValue(thread));
            SubLObject basis_object;
            SubLObject state;
            SubLObject method;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)pph_macros.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); pph_macros.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                method = set_contents.do_set_contents_next(basis_object, state);
                if (pph_macros.NIL != set_contents.do_set_contents_element_validP(state, method) && conses_high.getf(method, (SubLObject)pph_macros.$kw385$CYCL, (SubLObject)pph_macros.UNPROVIDED).equal(cycl)) {
                    doomed = (SubLObject)ConsesLow.cons(method, doomed);
                }
            }
            SubLObject cdolist_list_var = doomed;
            SubLObject method2 = (SubLObject)pph_macros.NIL;
            method2 = cdolist_list_var.first();
            while (pph_macros.NIL != cdolist_list_var) {
                count = Numbers.add(count, (SubLObject)pph_macros.ONE_INTEGER);
                set.set_remove(method2, pph_macros.$suspended_paraphrase_methods$.getDynamicValue(thread));
                cdolist_list_var = cdolist_list_var.rest();
                method2 = cdolist_list_var.first();
            }
            if (count.isPositive() && pph_macros.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_macros.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_macros.T, (SubLObject)pph_macros.$str386$Cleared__S_suspended_methods_for_, count, cycl, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED);
            }
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 46785L)
    public static SubLObject suspending_paraphrase_method(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list387);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject method_symbol = (SubLObject)pph_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list387);
        method_symbol = current.first();
        current = current.rest();
        final SubLObject object_type = (SubLObject)(current.isCons() ? current.first() : pph_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)pph_macros.$list387);
        current = current.rest();
        if (pph_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject info = (SubLObject)pph_macros.$sym388$INFO;
            return (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym4$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(info, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym389$PPH_METHOD_INFO, method_symbol, object_type))), (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym390$PPH_DEREGISTER_METHOD_INFO, method_symbol, info), reader.bq_cons((SubLObject)pph_macros.$sym96$CUNWIND_PROTECT, ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym391$PPH_REGISTER_METHOD_INFO, method_symbol, info)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_macros.$list387);
        return (SubLObject)pph_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 47351L)
    public static SubLObject omitting_pph_select_string_methods(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_methods = (SubLObject)pph_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list392);
        v_methods = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym4$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym393$_SELECT_STRING_METHODS_TO_OMIT_, v_methods)), ConsesLow.append(body, (SubLObject)pph_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 47566L)
    public static SubLObject handling_pph_mt_scope(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list316);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject phrase = (SubLObject)pph_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list316);
        phrase = current.first();
        current = current.rest();
        if (pph_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject save_cycl = (SubLObject)pph_macros.$sym394$SAVE_CYCL;
            return (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym4$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(save_cycl, (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym395$PPH_PHRASE_RESTRICT_CYCL_TO_MT_SCOPE, phrase))), (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym96$CUNWIND_PROTECT, reader.bq_cons((SubLObject)pph_macros.$sym1$PROGN, ConsesLow.append(body, (SubLObject)pph_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym396$PPH_PHRASE_RESTORE_AND_REPHRASE_CYCL_IF_MT_SCOPED, phrase, save_cycl)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_macros.$list316);
        return (SubLObject)pph_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 47882L)
    public static SubLObject pph_phrase_restrict_cycl_to_mt_scope(final SubLObject phrase) {
        SubLObject save_cycl = (SubLObject)pph_macros.NIL;
        if (pph_macros.NIL != pph_utilities.pph_formula_wXmt_scopeP(pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_macros.UNPROVIDED))) {
            save_cycl = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_macros.UNPROVIDED);
            if (pph_macros.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_macros.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_macros.T, (SubLObject)pph_macros.$str398$Removing_MT_scope_from__S, save_cycl, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED);
            }
            pph_phrase.pph_phrase_reset_cycl(phrase, pph_utilities.pph_cycl_template_from_arg_position((SubLObject)pph_macros.$list399));
            final SubLObject old_agr_preds = pph_phrase.pph_phrase_agr_preds(phrase, (SubLObject)pph_macros.UNPROVIDED);
            final SubLObject new_agr_preds = pph_utilities.pph_adjust_nl_preds_for_mt_scope(save_cycl, old_agr_preds);
            if (!old_agr_preds.equal(new_agr_preds)) {
                if (pph_macros.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_macros.ONE_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_macros.T, (SubLObject)pph_macros.$str400$Updating_agr_preds_to__S_based_on, new_agr_preds, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED);
                }
                pph_phrase.pph_phrase_set_agr_preds(phrase, new_agr_preds, (SubLObject)pph_macros.UNPROVIDED);
                if (pph_macros.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_macros.ONE_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_macros.T, (SubLObject)pph_macros.$str401$New_agr_preds___S, pph_phrase.pph_phrase_agr_preds(phrase, (SubLObject)pph_macros.UNPROVIDED), (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED);
                }
            }
        }
        return save_cycl;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 48741L)
    public static SubLObject pph_phrase_restore_and_rephrase_cycl_if_mt_scoped(final SubLObject phrase, final SubLObject cycl, SubLObject temporal_onlyP) {
        if (temporal_onlyP == pph_macros.UNPROVIDED) {
            temporal_onlyP = pph_vars.$pph_terse_mt_scopeP$.getDynamicValue();
        }
        if (pph_macros.NIL != pph_utilities.pph_formula_wXmt_scopeP(cycl)) {
            pph_phrase_restore_cycl(phrase, cycl);
            if (pph_macros.NIL != pph_phrase.pph_phrase_doneP(phrase)) {
                pph_phrase_add_mt_scope_paraphrases(phrase, pph_utilities.pph_mt_scope(cycl), temporal_onlyP);
                if (pph_macros.NIL != pph_phrase.pph_phrase_dtr_output_lists(phrase)) {
                    pph_phrase_resolution.pph_phrase_set_output_list_from_finished_dtrs(phrase);
                }
            }
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 49536L)
    public static SubLObject pph_phrase_add_mt_scope_paraphrases(final SubLObject phrase, final SubLObject mt_scope, SubLObject temporal_onlyP) {
        if (temporal_onlyP == pph_macros.UNPROVIDED) {
            temporal_onlyP = (SubLObject)pph_macros.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_macros.NIL != pph_utilities.pph_mt_scope_p(mt_scope)) {
            if (pph_macros.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_macros.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_macros.T, (SubLObject)pph_macros.$str402$Adding_Mt_scope_paraphrases_to___, pph_phrase.pph_phrase_output_list(phrase), (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED);
            }
            SubLObject failedP = (SubLObject)pph_macros.NIL;
            SubLObject error_message = (SubLObject)pph_macros.NIL;
            final SubLObject _prev_bind_0 = Errors.$continue_cerrorP$.currentBinding(thread);
            final SubLObject _prev_bind_2 = pph_error.$pph_error_handling_onP$.currentBinding(thread);
            try {
                Errors.$continue_cerrorP$.bind((SubLObject)pph_macros.NIL, thread);
                pph_error.$pph_error_handling_onP$.bind((SubLObject)pph_macros.T, thread);
                if (pph_macros.NIL != pph_error.pph_break_on_errorP()) {
                    final SubLObject top_levelP = handling_pph_method_failures_top_level_p();
                    final SubLObject _prev_bind_0_$9 = pph_macros.$suspended_paraphrase_methods$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$10 = pph_macros.$handling_pph_method_failuresP$.currentBinding(thread);
                    try {
                        pph_macros.$suspended_paraphrase_methods$.bind((pph_macros.NIL != top_levelP) ? set.new_set(Symbols.symbol_function((SubLObject)pph_macros.EQUAL), max_suspended_method_depth()) : pph_macros.$suspended_paraphrase_methods$.getDynamicValue(thread), thread);
                        pph_macros.$handling_pph_method_failuresP$.bind((SubLObject)pph_macros.T, thread);
                        for (SubLObject failed_method = (SubLObject)pph_macros.NIL, tried_oneP = (SubLObject)pph_macros.NIL; pph_macros.NIL != failed_method || pph_macros.NIL == tried_oneP; tried_oneP = (SubLObject)pph_macros.T) {
                            if (pph_macros.NIL != failed_method) {
                                note_suspended_paraphrase_method_plist(failed_method);
                                failed_method = (SubLObject)pph_macros.NIL;
                            }
                            try {
                                thread.throwStack.push(pph_macros.$kw380$PPH_METHOD_FAILURE);
                                if (pph_macros.NIL == failedP) {
                                    thread.resetMultipleValues();
                                    final SubLObject phrase_lists = pph_phrase_get_mt_scope_phrases(phrase, mt_scope, temporal_onlyP);
                                    final SubLObject failed_phrase = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (pph_macros.NIL != failed_phrase) {
                                        if (pph_macros.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_macros.ONE_INTEGER) && pph_macros.NIL == pph_error.suppress_pph_warningsP()) {
                                            Errors.warn((SubLObject)pph_macros.$str403$Couldn_t_finish_temporal_phrase__, failed_phrase);
                                            streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                                        }
                                        pph_phrase.pph_phrase_set_output_list(phrase, (SubLObject)pph_macros.NIL, (SubLObject)pph_macros.UNPROVIDED);
                                        failedP = (SubLObject)pph_macros.T;
                                    }
                                    else {
                                        final SubLObject temporals_at_endP = pph_temporals_at_endP(phrase);
                                        SubLObject current;
                                        final SubLObject datum = current = phrase_lists;
                                        SubLObject temporal = (SubLObject)pph_macros.NIL;
                                        SubLObject etc = (SubLObject)pph_macros.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list404);
                                        temporal = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_macros.$list404);
                                        etc = current.first();
                                        current = current.rest();
                                        if (pph_macros.NIL == current) {
                                            if (pph_macros.NIL != pph_phrase.pph_phrase_has_dtrsP(phrase)) {
                                                SubLObject cdolist_list_var = temporal;
                                                SubLObject mt_phrase = (SubLObject)pph_macros.NIL;
                                                mt_phrase = cdolist_list_var.first();
                                                while (pph_macros.NIL != cdolist_list_var) {
                                                    if (pph_macros.NIL != temporals_at_endP) {
                                                        pph_phrase.pph_phrase_append(mt_phrase, phrase);
                                                    }
                                                    else {
                                                        pph_phrase.pph_phrase_push(pph_data_structures.new_pph_phrase((SubLObject)pph_macros.$str405$_, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED), phrase);
                                                        pph_phrase.pph_phrase_push(mt_phrase, phrase);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    mt_phrase = cdolist_list_var.first();
                                                }
                                                cdolist_list_var = Sequences.reverse(etc);
                                                mt_phrase = (SubLObject)pph_macros.NIL;
                                                mt_phrase = cdolist_list_var.first();
                                                while (pph_macros.NIL != cdolist_list_var) {
                                                    pph_phrase.pph_phrase_push(mt_phrase, phrase);
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    mt_phrase = cdolist_list_var.first();
                                                }
                                            }
                                            else {
                                                SubLObject olist = pph_phrase.pph_phrase_output_list(phrase);
                                                SubLObject cdolist_list_var2 = temporal;
                                                SubLObject mt_phrase2 = (SubLObject)pph_macros.NIL;
                                                mt_phrase2 = cdolist_list_var2.first();
                                                while (pph_macros.NIL != cdolist_list_var2) {
                                                    olist = ((pph_macros.NIL != temporals_at_endP) ? ConsesLow.append(olist, pph_phrase.pph_phrase_output_list(mt_phrase2)) : ConsesLow.append(pph_phrase.pph_phrase_output_list(mt_phrase2), olist));
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    mt_phrase2 = cdolist_list_var2.first();
                                                }
                                                cdolist_list_var2 = Sequences.reverse(etc);
                                                mt_phrase2 = (SubLObject)pph_macros.NIL;
                                                mt_phrase2 = cdolist_list_var2.first();
                                                while (pph_macros.NIL != cdolist_list_var2) {
                                                    olist = ConsesLow.append(pph_phrase.pph_phrase_output_list(mt_phrase2), olist);
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    mt_phrase2 = cdolist_list_var2.first();
                                                }
                                                pph_phrase.pph_phrase_set_output_list(phrase, olist, (SubLObject)pph_macros.UNPROVIDED);
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_macros.$list404);
                                        }
                                    }
                                }
                            }
                            catch (Throwable ccatch_env_var) {
                                failed_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)pph_macros.$kw380$PPH_METHOD_FAILURE);
                            }
                            finally {
                                thread.throwStack.pop();
                            }
                        }
                    }
                    finally {
                        pph_macros.$handling_pph_method_failuresP$.rebind(_prev_bind_1_$10, thread);
                        pph_macros.$suspended_paraphrase_methods$.rebind(_prev_bind_0_$9, thread);
                    }
                }
                else {
                    try {
                        thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                        final SubLObject _prev_bind_0_$10 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind((SubLObject)pph_macros.$sym109$CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                final SubLObject top_levelP2 = handling_pph_method_failures_top_level_p();
                                final SubLObject _prev_bind_0_$11 = pph_macros.$suspended_paraphrase_methods$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$11 = pph_macros.$handling_pph_method_failuresP$.currentBinding(thread);
                                try {
                                    pph_macros.$suspended_paraphrase_methods$.bind((pph_macros.NIL != top_levelP2) ? set.new_set(Symbols.symbol_function((SubLObject)pph_macros.EQUAL), max_suspended_method_depth()) : pph_macros.$suspended_paraphrase_methods$.getDynamicValue(thread), thread);
                                    pph_macros.$handling_pph_method_failuresP$.bind((SubLObject)pph_macros.T, thread);
                                    for (SubLObject failed_method2 = (SubLObject)pph_macros.NIL, tried_oneP2 = (SubLObject)pph_macros.NIL; pph_macros.NIL != failed_method2 || pph_macros.NIL == tried_oneP2; tried_oneP2 = (SubLObject)pph_macros.T) {
                                        if (pph_macros.NIL != failed_method2) {
                                            note_suspended_paraphrase_method_plist(failed_method2);
                                            failed_method2 = (SubLObject)pph_macros.NIL;
                                        }
                                        try {
                                            thread.throwStack.push(pph_macros.$kw380$PPH_METHOD_FAILURE);
                                            if (pph_macros.NIL == failedP) {
                                                thread.resetMultipleValues();
                                                final SubLObject phrase_lists2 = pph_phrase_get_mt_scope_phrases(phrase, mt_scope, temporal_onlyP);
                                                final SubLObject failed_phrase2 = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                if (pph_macros.NIL != failed_phrase2) {
                                                    if (pph_macros.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_macros.ONE_INTEGER) && pph_macros.NIL == pph_error.suppress_pph_warningsP()) {
                                                        Errors.warn((SubLObject)pph_macros.$str403$Couldn_t_finish_temporal_phrase__, failed_phrase2);
                                                        streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                                                    }
                                                    pph_phrase.pph_phrase_set_output_list(phrase, (SubLObject)pph_macros.NIL, (SubLObject)pph_macros.UNPROVIDED);
                                                    failedP = (SubLObject)pph_macros.T;
                                                }
                                                else {
                                                    final SubLObject temporals_at_endP2 = pph_temporals_at_endP(phrase);
                                                    SubLObject current2;
                                                    final SubLObject datum2 = current2 = phrase_lists2;
                                                    SubLObject temporal2 = (SubLObject)pph_macros.NIL;
                                                    SubLObject etc2 = (SubLObject)pph_macros.NIL;
                                                    cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)pph_macros.$list404);
                                                    temporal2 = current2.first();
                                                    current2 = current2.rest();
                                                    cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)pph_macros.$list404);
                                                    etc2 = current2.first();
                                                    current2 = current2.rest();
                                                    if (pph_macros.NIL == current2) {
                                                        if (pph_macros.NIL != pph_phrase.pph_phrase_has_dtrsP(phrase)) {
                                                            SubLObject cdolist_list_var2 = temporal2;
                                                            SubLObject mt_phrase2 = (SubLObject)pph_macros.NIL;
                                                            mt_phrase2 = cdolist_list_var2.first();
                                                            while (pph_macros.NIL != cdolist_list_var2) {
                                                                if (pph_macros.NIL != temporals_at_endP2) {
                                                                    pph_phrase.pph_phrase_append(mt_phrase2, phrase);
                                                                }
                                                                else {
                                                                    pph_phrase.pph_phrase_push(pph_data_structures.new_pph_phrase((SubLObject)pph_macros.$str405$_, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED), phrase);
                                                                    pph_phrase.pph_phrase_push(mt_phrase2, phrase);
                                                                }
                                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                                mt_phrase2 = cdolist_list_var2.first();
                                                            }
                                                            cdolist_list_var2 = Sequences.reverse(etc2);
                                                            mt_phrase2 = (SubLObject)pph_macros.NIL;
                                                            mt_phrase2 = cdolist_list_var2.first();
                                                            while (pph_macros.NIL != cdolist_list_var2) {
                                                                pph_phrase.pph_phrase_push(mt_phrase2, phrase);
                                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                                mt_phrase2 = cdolist_list_var2.first();
                                                            }
                                                        }
                                                        else {
                                                            SubLObject olist2 = pph_phrase.pph_phrase_output_list(phrase);
                                                            SubLObject cdolist_list_var3 = temporal2;
                                                            SubLObject mt_phrase3 = (SubLObject)pph_macros.NIL;
                                                            mt_phrase3 = cdolist_list_var3.first();
                                                            while (pph_macros.NIL != cdolist_list_var3) {
                                                                olist2 = ((pph_macros.NIL != temporals_at_endP2) ? ConsesLow.append(olist2, pph_phrase.pph_phrase_output_list(mt_phrase3)) : ConsesLow.append(pph_phrase.pph_phrase_output_list(mt_phrase3), olist2));
                                                                cdolist_list_var3 = cdolist_list_var3.rest();
                                                                mt_phrase3 = cdolist_list_var3.first();
                                                            }
                                                            cdolist_list_var3 = Sequences.reverse(etc2);
                                                            mt_phrase3 = (SubLObject)pph_macros.NIL;
                                                            mt_phrase3 = cdolist_list_var3.first();
                                                            while (pph_macros.NIL != cdolist_list_var3) {
                                                                olist2 = ConsesLow.append(pph_phrase.pph_phrase_output_list(mt_phrase3), olist2);
                                                                cdolist_list_var3 = cdolist_list_var3.rest();
                                                                mt_phrase3 = cdolist_list_var3.first();
                                                            }
                                                            pph_phrase.pph_phrase_set_output_list(phrase, olist2, (SubLObject)pph_macros.UNPROVIDED);
                                                        }
                                                    }
                                                    else {
                                                        cdestructuring_bind.cdestructuring_bind_error(datum2, (SubLObject)pph_macros.$list404);
                                                    }
                                                }
                                            }
                                        }
                                        catch (Throwable ccatch_env_var2) {
                                            failed_method2 = Errors.handleThrowable(ccatch_env_var2, (SubLObject)pph_macros.$kw380$PPH_METHOD_FAILURE);
                                        }
                                        finally {
                                            thread.throwStack.pop();
                                        }
                                    }
                                }
                                finally {
                                    pph_macros.$handling_pph_method_failuresP$.rebind(_prev_bind_1_$11, thread);
                                    pph_macros.$suspended_paraphrase_methods$.rebind(_prev_bind_0_$11, thread);
                                }
                            }
                            catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, (SubLObject)pph_macros.NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(_prev_bind_0_$10, thread);
                        }
                    }
                    catch (Throwable ccatch_env_var3) {
                        error_message = Errors.handleThrowable(ccatch_env_var3, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    }
                    finally {
                        thread.throwStack.pop();
                    }
                    if (error_message.isString() && pph_macros.NIL == pph_error.suppress_pph_warningsP()) {
                        Errors.warn(Sequences.cconcatenate(pph_error_message_truncator.truncate_pph_error_message(error_message), (SubLObject)pph_macros.$str406$___Top_level_CycL___S), pph_vars.pph_top_level_cycl());
                    }
                }
            }
            finally {
                pph_error.$pph_error_handling_onP$.rebind(_prev_bind_2, thread);
                Errors.$continue_cerrorP$.rebind(_prev_bind_0, thread);
            }
            if (pph_macros.NIL != failedP) {
                return (SubLObject)pph_macros.$kw407$FAILED;
            }
            if (pph_macros.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_macros.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_macros.T, (SubLObject)pph_macros.$str408$Result_of_adding_Mt_scope_paraphr, pph_phrase.pph_phrase_output_list(phrase), (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED);
            }
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 51626L)
    public static SubLObject pph_temporals_at_endP(final SubLObject phrase) {
        if (pph_macros.NIL != pph_phrase.pph_phrase_has_multiple_verbsP(phrase)) {
            return (SubLObject)pph_macros.NIL;
        }
        return (SubLObject)pph_macros.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 51865L)
    public static SubLObject pph_phrase_get_mt_scope_phrases(final SubLObject phrase, final SubLObject mt_scope, SubLObject temporal_onlyP) {
        if (temporal_onlyP == pph_macros.UNPROVIDED) {
            temporal_onlyP = (SubLObject)pph_macros.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg_position_map = pph_utilities.pph_new_identity_map();
        SubLObject temporal_phrases = (SubLObject)pph_macros.NIL;
        SubLObject other_phrases = (SubLObject)pph_macros.NIL;
        SubLObject failed_phrase = (SubLObject)pph_macros.NIL;
        if (pph_macros.NIL != pph_utilities.pph_mt_scope_p(mt_scope)) {
            SubLObject list_var = (SubLObject)pph_macros.NIL;
            SubLObject mt_in_scope = (SubLObject)pph_macros.NIL;
            SubLObject argnum = (SubLObject)pph_macros.NIL;
            list_var = mt_scope;
            mt_in_scope = list_var.first();
            for (argnum = (SubLObject)pph_macros.ZERO_INTEGER; pph_macros.NIL == failed_phrase && pph_macros.NIL != list_var; list_var = list_var.rest(), mt_in_scope = list_var.first(), argnum = Numbers.add((SubLObject)pph_macros.ONE_INTEGER, argnum)) {
                if (!mt_in_scope.equal((SubLObject)pph_macros.$list409)) {
                    if (pph_macros.NIL == pph_utilities.pph_isaP(mt_in_scope, pph_macros.$const410$TemporalMicrotheory, (SubLObject)pph_macros.UNPROVIDED)) {
                        if (pph_macros.NIL == temporal_onlyP) {
                            final SubLObject mt_phrase = pph_mt_in_scope_phrase(mt_scope, argnum, arg_position_map, (SubLObject)pph_macros.$list411);
                            final SubLObject acc_to_phrase = pph_data_structures.new_pph_phrase((SubLObject)pph_macros.$str412$according_to, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED);
                            final SubLObject the_comma = pph_data_structures.new_pph_phrase((SubLObject)pph_macros.$str405$_, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED);
                            if (pph_macros.NIL == failed_phrase) {
                                SubLObject csome_list_var = (SubLObject)ConsesLow.list(the_comma, mt_phrase, acc_to_phrase);
                                SubLObject other_phrase = (SubLObject)pph_macros.NIL;
                                other_phrase = csome_list_var.first();
                                while (pph_macros.NIL == failed_phrase && pph_macros.NIL != csome_list_var) {
                                    pph_phrase_resolution.pph_phrase_get_string(other_phrase, (SubLObject)pph_macros.$kw413$PHRASE_CYCL, phrase);
                                    if (pph_macros.NIL != pph_phrase.pph_phrase_doneP(other_phrase)) {
                                        other_phrases = (SubLObject)ConsesLow.cons(other_phrase, other_phrases);
                                    }
                                    else {
                                        failed_phrase = other_phrase;
                                    }
                                    csome_list_var = csome_list_var.rest();
                                    other_phrase = csome_list_var.first();
                                }
                            }
                        }
                    }
                    else if (pph_macros.NIL == pph_vars.$pph_explicit_temporal_qualification_for_current_factsP$.getDynamicValue(thread) && pph_macros.NIL != pph_utilities.pph_time_interval_subsumesP(cycl_utilities.formula_arg1(mt_in_scope, (SubLObject)pph_macros.UNPROVIDED), pph_macros.$const414$Now)) {
                        if (pph_macros.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_macros.ONE_INTEGER)) {
                            format_nil.force_format((SubLObject)pph_macros.T, (SubLObject)pph_macros.$str415$Ignoring__S___because_it_subsumes, mt_in_scope, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED);
                        }
                    }
                    else {
                        final SubLObject mt_phrase = pph_mt_in_scope_phrase(mt_scope, argnum, arg_position_map, (SubLObject)pph_macros.UNPROVIDED);
                        pph_main.pph_phrase_generate(mt_phrase, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED, (SubLObject)pph_macros.UNPROVIDED);
                        if (pph_macros.NIL != pph_phrase.pph_phrase_doneP(mt_phrase)) {
                            temporal_phrases = (SubLObject)ConsesLow.cons(mt_phrase, temporal_phrases);
                        }
                        else {
                            failed_phrase = mt_phrase;
                        }
                    }
                }
            }
        }
        return Values.values((SubLObject)ConsesLow.list(temporal_phrases, other_phrases), failed_phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 53857L)
    public static SubLObject pph_mt_in_scope_phrase(final SubLObject mt_scope, final SubLObject argnum, final SubLObject base_arg_position_map, SubLObject nl_preds) {
        if (nl_preds == pph_macros.UNPROVIDED) {
            nl_preds = (SubLObject)pph_macros.$list416;
        }
        final SubLObject mt_in_scope = ConsesLow.nth(argnum, mt_scope);
        final SubLObject matrix_pos = pph_matrix_pos_from_mt_scope(mt_scope, argnum);
        final SubLObject matrix_pos_template = pph_utilities.pph_cycl_template_from_arg_position(matrix_pos);
        final SubLObject sub_arg_position_map = pph_utilities.pph_figure_new_arg_position_map(base_arg_position_map, matrix_pos_template);
        final SubLObject phrase = pph_phrase.new_pph_phrase_for_cycl(mt_in_scope, sub_arg_position_map, (SubLObject)pph_macros.UNPROVIDED);
        pph_phrase.pph_phrase_set_agr_preds(phrase, nl_preds, (SubLObject)pph_macros.UNPROVIDED);
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 54427L)
    public static SubLObject pph_matrix_pos_from_mt_scope(final SubLObject mt_scope, final SubLObject argnum) {
        return (SubLObject)((pph_macros.NIL != list_utilities.lengthG(mt_scope, (SubLObject)pph_macros.ONE_INTEGER, (SubLObject)pph_macros.UNPROVIDED)) ? ConsesLow.list((SubLObject)pph_macros.ONE_INTEGER, number_utilities.f_1X(argnum)) : ConsesLow.list((SubLObject)pph_macros.ONE_INTEGER));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 54557L)
    public static SubLObject pph_phrase_restore_cycl_if_mt_scoped(final SubLObject phrase, final SubLObject cycl) {
        if (pph_macros.NIL != pph_utilities.pph_formula_wXmt_scopeP(cycl)) {
            pph_phrase_restore_cycl(phrase, cycl);
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 54916L)
    public static SubLObject pph_phrase_restore_cycl(final SubLObject phrase, final SubLObject cycl) {
        return pph_phrase.pph_phrase_set_cycl(phrase, cycl);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-macros.lisp", position = 55014L)
    public static SubLObject with_nl_generation_fort_cache_memory_mapped(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject already_memory_mapped = (SubLObject)pph_macros.$sym417$ALREADY_MEMORY_MAPPED;
        return (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym4$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(already_memory_mapped, (SubLObject)pph_macros.$list418)), (SubLObject)ConsesLow.list((SubLObject)pph_macros.$sym96$CUNWIND_PROTECT, (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym1$PROGN, (SubLObject)pph_macros.$list419, ConsesLow.append(body, (SubLObject)pph_macros.NIL)), (SubLObject)ConsesLow.listS((SubLObject)pph_macros.$sym97$PUNLESS, already_memory_mapped, (SubLObject)pph_macros.$list420)));
    }
    
    public static SubLObject declare_pph_macros_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "pph_mapped_string_for_term", "PPH-MAPPED-STRING-FOR-TERM", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "with_paraphrase_mappings", "WITH-PARAPHRASE-MAPPINGS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "with_paraphrase_blacklist", "WITH-PARAPHRASE-BLACKLIST");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "valid_pph_blacklistP", "VALID-PPH-BLACKLIST?", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "with_paraphrase_lexical_assertion_blacklist", "WITH-PARAPHRASE-LEXICAL-ASSERTION-BLACKLIST");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "valid_pph_blacklist_assertionP", "VALID-PPH-BLACKLIST-ASSERTION?", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "do_pph_arg_position_map", "DO-PPH-ARG-POSITION-MAP");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "remembering_pph_ambiguous_strings", "REMEMBERING-PPH-AMBIGUOUS-STRINGS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "with_paraphrase_precision", "WITH-PARAPHRASE-PRECISION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "with_terse_paraphrase_on", "WITH-TERSE-PARAPHRASE-ON");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "with_precise_paraphrase_on", "WITH-PRECISE-PARAPHRASE-ON");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "with_precise_paraphrase_off", "WITH-PRECISE-PARAPHRASE-OFF");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "with_precise_paraphrase_for_args", "WITH-PRECISE-PARAPHRASE-FOR-ARGS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "with_definite_descriptions_licensed_for_terms", "WITH-DEFINITE-DESCRIPTIONS-LICENSED-FOR-TERMS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "pph_nested_arg_list_p", "PPH-NESTED-ARG-LIST-P", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "maximizing_pph_links", "MAXIMIZING-PPH-LINKS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "pph_possibly_binding_current_arg0", "PPH-POSSIBLY-BINDING-CURRENT-ARG0");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "pph_ok_arg0_for_linkingP", "PPH-OK-ARG0-FOR-LINKING?", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "with_pph_html_function_and_target", "WITH-PPH-HTML-FUNCTION-AND-TARGET");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "with_pph_html_term_id_fn", "WITH-PPH-HTML-TERM-ID-FN");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "omitting_hyperlinks_in_pph_html_mode", "OMITTING-HYPERLINKS-IN-PPH-HTML-MODE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "allowing_utf8_in_pph_text_mode", "ALLOWING-UTF8-IN-PPH-TEXT-MODE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "dont_link_unlinked_phrases_to_matrix_arg_if", "DONT-LINK-UNLINKED-PHRASES-TO-MATRIX-ARG-IF");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "with_pph_memoization", "WITH-PPH-MEMOIZATION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "with_pph_external_memoization", "WITH-PPH-EXTERNAL-MEMOIZATION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "find_or_create_pph_memoization_state", "FIND-OR-CREATE-PPH-MEMOIZATION-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "find_or_create_pph_external_memoization_state", "FIND-OR-CREATE-PPH-EXTERNAL-MEMOIZATION-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "pph_problem_store_pointer_print_function_trampoline", "PPH-PROBLEM-STORE-POINTER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "pph_problem_store_pointer_p", "PPH-PROBLEM-STORE-POINTER-P", 1, 0, false);
        new $pph_problem_store_pointer_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "pph_problem_store_pointer_store", "PPH-PROBLEM-STORE-POINTER-STORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "_csetf_pph_problem_store_pointer_store", "_CSETF-PPH-PROBLEM-STORE-POINTER-STORE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "make_pph_problem_store_pointer", "MAKE-PPH-PROBLEM-STORE-POINTER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "visit_defstruct_pph_problem_store_pointer", "VISIT-DEFSTRUCT-PPH-PROBLEM-STORE-POINTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "visit_defstruct_object_pph_problem_store_pointer_method", "VISIT-DEFSTRUCT-OBJECT-PPH-PROBLEM-STORE-POINTER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "pprint_pph_problem_store_pointer", "PPRINT-PPH-PROBLEM-STORE-POINTER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "pph_maybe_destroy_problem_store", "PPH-MAYBE-DESTROY-PROBLEM-STORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "free_pph_problem_store_pointer", "FREE-PPH-PROBLEM-STORE-POINTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "pph_problem_store_pointer_set_store", "PPH-PROBLEM-STORE-POINTER-SET-STORE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "new_problem_store_pointer", "NEW-PROBLEM-STORE-POINTER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "replace_pph_problem_store_pointer_store", "REPLACE-PPH-PROBLEM-STORE-POINTER-STORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "pph_problem_store", "PPH-PROBLEM-STORE", 0, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "with_pph_problem_store", "WITH-PPH-PROBLEM-STORE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "find_or_create_pph_problem_store_pointer", "FIND-OR-CREATE-PPH-PROBLEM-STORE-POINTER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "pph_problem_store_okP", "PPH-PROBLEM-STORE-OK?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "pph_problem_store_size_okP", "PPH-PROBLEM-STORE-SIZE-OK?", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "creating_permanent_pph_phrases", "CREATING-PERMANENT-PPH-PHRASES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "note_new_pph_phrase", "NOTE-NEW-PPH-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "new_pph_phrase_count", "NEW-PPH-PHRASE-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "destroy_new_pph_phrases", "DESTROY-NEW-PPH-PHRASES", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "destroying_new_pph_phrases_when_done", "DESTROYING-NEW-PPH-PHRASES-WHEN-DONE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "get_new_pph_phrase_count", "GET-NEW-PPH-PHRASE-COUNT", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "possibly_destroying_new_pph_phrases_when_done", "POSSIBLY-DESTROYING-NEW-PPH-PHRASES-WHEN-DONE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "ensuring_pph_discourse_context", "ENSURING-PPH-DISCOURSE-CONTEXT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "within_new_pph_discourse_context", "WITHIN-NEW-PPH-DISCOURSE-CONTEXT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "herald_new_discourse_context", "HERALD-NEW-DISCOURSE-CONTEXT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "herald_end_of_discourse_context", "HERALD-END-OF-DISCOURSE-CONTEXT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "pph_discourse_context_initializedP", "PPH-DISCOURSE-CONTEXT-INITIALIZED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "clear_pph_discourse_context", "CLEAR-PPH-DISCOURSE-CONTEXT", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "with_shadowed_discourse_context", "WITH-SHADOWED-DISCOURSE-CONTEXT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "note_leaving_shadowed_discourse_context", "NOTE-LEAVING-SHADOWED-DISCOURSE-CONTEXT", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "with_pph_speaker_and_addressee", "WITH-PPH-SPEAKER-AND-ADDRESSEE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "do_pph_output_list", "DO-PPH-OUTPUT-LIST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "do_one_pph_output_list_item", "DO-ONE-PPH-OUTPUT-LIST-ITEM");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "pph_maybe_do_space_item", "PPH-MAYBE-DO-SPACE-ITEM");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "pph_update_end_char_index", "PPH-UPDATE-END-CHAR-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "pph_make_space_string", "PPH-MAKE-SPACE-STRING", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "with_pph_regular_output_item_bindings", "WITH-PPH-REGULAR-OUTPUT-ITEM-BINDINGS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "pph_output_list_find_start_char", "PPH-OUTPUT-LIST-FIND-START-CHAR", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "do_pph_javalist_items", "DO-PPH-JAVALIST-ITEMS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "with_pph_disambiguation_partial_results_accumulation", "WITH-PPH-DISAMBIGUATION-PARTIAL-RESULTS-ACCUMULATION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "initialize_disambiguation_phrases", "INITIALIZE-DISAMBIGUATION-PHRASES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "accumulate_disambiguation_phrases", "ACCUMULATE-DISAMBIGUATION-PHRASES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "add_pph_disambiguation_result_to_accumulator", "ADD-PPH-DISAMBIGUATION-RESULT-TO-ACCUMULATOR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "consolidate_disambiguation_phrases", "CONSOLIDATE-DISAMBIGUATION-PHRASES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "final_results_for_disambiguation_phrases", "FINAL-RESULTS-FOR-DISAMBIGUATION-PHRASES", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "gathering_pph_problems", "GATHERING-PPH-PROBLEMS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "with_pph_timeout", "WITH-PPH-TIMEOUT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "pph_timeout_time_reachedP", "PPH-TIMEOUT-TIME-REACHED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "pph_timeout_current_time", "PPH-TIMEOUT-CURRENT-TIME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "pph_compute_timeout_time", "PPH-COMPUTE-TIMEOUT-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "pph_timeout", "PPH-TIMEOUT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "pph_allowable_time", "PPH-ALLOWABLE-TIME", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "noting_unexpressed_negations", "NOTING-UNEXPRESSED-NEGATIONS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "possibly_with_pph_language_mt", "POSSIBLY-WITH-PPH-LANGUAGE-MT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "possibly_with_pph_domain_mt", "POSSIBLY-WITH-PPH-DOMAIN-MT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "with_language_and_domain_mts", "WITH-LANGUAGE-AND-DOMAIN-MTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "with_pph_language_mt_relevance", "WITH-PPH-LANGUAGE-MT-RELEVANCE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "with_pph_domain_and_language_mt_union_relevance", "WITH-PPH-DOMAIN-AND-LANGUAGE-MT-UNION-RELEVANCE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "do_pph_phrase_fns", "DO-PPH-PHRASE-FNS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "possibly_suspending_pph_bullets", "POSSIBLY-SUSPENDING-PPH-BULLETS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "with_pph_demerit_cutoff", "WITH-PPH-DEMERIT-CUTOFF");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "with_maximum_pph_demerit_cutoff", "WITH-MAXIMUM-PPH-DEMERIT-CUTOFF");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "valid_pph_demerit_cutoff_p", "VALID-PPH-DEMERIT-CUTOFF-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "compute_new_pph_demerit_cutoff", "COMPUTE-NEW-PPH-DEMERIT-CUTOFF", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "with_pph_phrase_destruction_grace_period", "WITH-PPH-PHRASE-DESTRUCTION-GRACE-PERIOD");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "remembering_pph_proofs", "REMEMBERING-PPH-PROOFS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "with_pph_inference_answer", "WITH-PPH-INFERENCE-ANSWER");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "with_pph_inference", "WITH-PPH-INFERENCE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "with_pph_justification_generation_parameters", "WITH-PPH-JUSTIFICATION-GENERATION-PARAMETERS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "possibly_with_pph_html_justification_generation_parameters", "POSSIBLY-WITH-PPH-HTML-JUSTIFICATION-GENERATION-PARAMETERS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "pph_possibly_enable_showXhide", "PPH-POSSIBLY-ENABLE-SHOW/HIDE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "pph_justification_html_function_and_target", "PPH-JUSTIFICATION-HTML-FUNCTION-AND-TARGET", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "pph_setting_var_types_if_successful", "PPH-SETTING-VAR-TYPES-IF-SUCCESSFUL");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "pph_reset_var_types", "PPH-RESET-VAR-TYPES", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "pph_possibly_binding_variables", "PPH-POSSIBLY-BINDING-VARIABLES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "pph_handle_local_vars", "PPH-HANDLE-LOCAL-VARS", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "destructure_pph_pronoun_agr", "DESTRUCTURE-PPH-PRONOUN-AGR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "pph_phrase_do_agr_constraints", "PPH-PHRASE-DO-AGR-CONSTRAINTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "do_pph_phrase_templates_for_formula", "DO-PPH-PHRASE-TEMPLATES-FOR-FORMULA");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "do_pph_phrases_for_formula", "DO-PPH-PHRASES-FOR-FORMULA");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "max_suspended_method_depth", "MAX-SUSPENDED-METHOD-DEPTH", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "handling_pph_method_failures_p", "HANDLING-PPH-METHOD-FAILURES-P", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "handling_pph_method_failures", "HANDLING-PPH-METHOD-FAILURES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "handling_pph_method_failures_top_level_p", "HANDLING-PPH-METHOD-FAILURES-TOP-LEVEL-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "throw_pph_method_failure", "THROW-PPH-METHOD-FAILURE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "note_suspended_paraphrase_method_plist", "NOTE-SUSPENDED-PARAPHRASE-METHOD-PLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "clear_pph_suspended_methods_for_cycl", "CLEAR-PPH-SUSPENDED-METHODS-FOR-CYCL", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "suspending_paraphrase_method", "SUSPENDING-PARAPHRASE-METHOD");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "omitting_pph_select_string_methods", "OMITTING-PPH-SELECT-STRING-METHODS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "handling_pph_mt_scope", "HANDLING-PPH-MT-SCOPE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "pph_phrase_restrict_cycl_to_mt_scope", "PPH-PHRASE-RESTRICT-CYCL-TO-MT-SCOPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "pph_phrase_restore_and_rephrase_cycl_if_mt_scoped", "PPH-PHRASE-RESTORE-AND-REPHRASE-CYCL-IF-MT-SCOPED", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "pph_phrase_add_mt_scope_paraphrases", "PPH-PHRASE-ADD-MT-SCOPE-PARAPHRASES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "pph_temporals_at_endP", "PPH-TEMPORALS-AT-END?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "pph_phrase_get_mt_scope_phrases", "PPH-PHRASE-GET-MT-SCOPE-PHRASES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "pph_mt_in_scope_phrase", "PPH-MT-IN-SCOPE-PHRASE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "pph_matrix_pos_from_mt_scope", "PPH-MATRIX-POS-FROM-MT-SCOPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "pph_phrase_restore_cycl_if_mt_scoped", "PPH-PHRASE-RESTORE-CYCL-IF-MT-SCOPED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_macros", "pph_phrase_restore_cycl", "PPH-PHRASE-RESTORE-CYCL", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_macros", "with_nl_generation_fort_cache_memory_mapped", "WITH-NL-GENERATION-FORT-CACHE-MEMORY-MAPPED");
        return (SubLObject)pph_macros.NIL;
    }
    
    public static SubLObject init_pph_macros_file() {
        pph_macros.$pph_memoization_state$ = SubLFiles.defparameter("*PPH-MEMOIZATION-STATE*", misc_utilities.uninitialized());
        pph_macros.$pph_external_memoization_state$ = SubLFiles.defparameter("*PPH-EXTERNAL-MEMOIZATION-STATE*", misc_utilities.uninitialized());
        pph_macros.$dtp_pph_problem_store_pointer$ = SubLFiles.defconstant("*DTP-PPH-PROBLEM-STORE-POINTER*", (SubLObject)pph_macros.$sym69$PPH_PROBLEM_STORE_POINTER);
        pph_macros.$free_pph_problem_store_pointers$ = SubLFiles.defparameter("*FREE-PPH-PROBLEM-STORE-POINTERS*", misc_utilities.uninitialized());
        pph_macros.$pph_problem_store_pointer$ = SubLFiles.defparameter("*PPH-PROBLEM-STORE-POINTER*", (SubLObject)pph_macros.NIL);
        pph_macros.$new_pph_phrases$ = SubLFiles.defparameter("*NEW-PPH-PHRASES*", misc_utilities.uninitialized());
        pph_macros.$destroy_new_pph_phrasesP$ = SubLFiles.defparameter("*DESTROY-NEW-PPH-PHRASES?*", (SubLObject)pph_macros.NIL);
        pph_macros.$creating_permanent_pph_phraseP$ = SubLFiles.defparameter("*CREATING-PERMANENT-PPH-PHRASE?*", (SubLObject)pph_macros.NIL);
        pph_macros.$new_pph_phrase_count$ = SubLFiles.defparameter("*NEW-PPH-PHRASE-COUNT*", misc_utilities.uninitialized());
        pph_macros.$inside_destroy_new_pph_phrasesP$ = SubLFiles.defparameter("*INSIDE-DESTROY-NEW-PPH-PHRASES?*", (SubLObject)pph_macros.NIL);
        pph_macros.$pph_disambiguation_mode_return_style$ = SubLFiles.defparameter("*PPH-DISAMBIGUATION-MODE-RETURN-STYLE*", (SubLObject)pph_macros.$kw214$PAIRS);
        pph_macros.$pph_timeout_time$ = SubLFiles.defparameter("*PPH-TIMEOUT-TIME*", (SubLObject)pph_macros.NIL);
        pph_macros.$pph_timeout_reachedP$ = SubLFiles.defparameter("*PPH-TIMEOUT-REACHED?*", (SubLObject)pph_macros.NIL);
        pph_macros.$pph_timeout_time_check_count$ = SubLFiles.defparameter("*PPH-TIMEOUT-TIME-CHECK-COUNT*", (SubLObject)pph_macros.ZERO_INTEGER);
        pph_macros.$pph_default_timeout$ = SubLFiles.defparameter("*PPH-DEFAULT-TIMEOUT*", (SubLObject)pph_macros.FIVE_INTEGER);
        pph_macros.$pph_var_types_counter$ = SubLFiles.defvar("*PPH-VAR-TYPES-COUNTER*", (SubLObject)pph_macros.ZERO_INTEGER);
        pph_macros.$max_suspended_method_depth$ = SubLFiles.defparameter("*MAX-SUSPENDED-METHOD-DEPTH*", (SubLObject)pph_macros.$int367$300);
        pph_macros.$suspended_paraphrase_methods$ = SubLFiles.defparameter("*SUSPENDED-PARAPHRASE-METHODS*", (SubLObject)pph_macros.NIL);
        pph_macros.$allow_handling_of_pph_method_failuresP$ = SubLFiles.defparameter("*ALLOW-HANDLING-OF-PPH-METHOD-FAILURES?*", (SubLObject)pph_macros.T);
        pph_macros.$handling_pph_method_failuresP$ = SubLFiles.defparameter("*HANDLING-PPH-METHOD-FAILURES?*", (SubLObject)pph_macros.NIL);
        return (SubLObject)pph_macros.NIL;
    }
    
    public static SubLObject setup_pph_macros_file() {
        access_macros.register_macro_helper((SubLObject)pph_macros.$sym32$PPH_OK_ARG0_FOR_LINKING_, (SubLObject)pph_macros.$sym34$PPH_POSSIBLY_BINDING_CURRENT_ARG0);
        access_macros.register_macro_helper((SubLObject)pph_macros.$sym63$FIND_OR_CREATE_PPH_MEMOIZATION_STATE, (SubLObject)pph_macros.$sym64$WITH_PPH_MEMOIZATION);
        access_macros.register_macro_helper((SubLObject)pph_macros.$sym67$FIND_OR_CREATE_PPH_EXTERNAL_MEMOIZATION_STATE, (SubLObject)pph_macros.$list68);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), pph_macros.$dtp_pph_problem_store_pointer$.getGlobalValue(), Symbols.symbol_function((SubLObject)pph_macros.$sym76$PPH_PROBLEM_STORE_POINTER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)pph_macros.$list77);
        Structures.def_csetf((SubLObject)pph_macros.$sym78$PPH_PROBLEM_STORE_POINTER_STORE, (SubLObject)pph_macros.$sym79$_CSETF_PPH_PROBLEM_STORE_POINTER_STORE);
        Equality.identity((SubLObject)pph_macros.$sym69$PPH_PROBLEM_STORE_POINTER);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), pph_macros.$dtp_pph_problem_store_pointer$.getGlobalValue(), Symbols.symbol_function((SubLObject)pph_macros.$sym86$VISIT_DEFSTRUCT_OBJECT_PPH_PROBLEM_STORE_POINTER_METHOD));
        access_macros.register_macro_helper((SubLObject)pph_macros.$sym89$FREE_PPH_PROBLEM_STORE_POINTER, (SubLObject)pph_macros.$sym51$WITH_PPH_PROBLEM_STORE);
        access_macros.register_macro_helper((SubLObject)pph_macros.$sym99$FIND_OR_CREATE_PPH_PROBLEM_STORE_POINTER, (SubLObject)pph_macros.$sym51$WITH_PPH_PROBLEM_STORE);
        access_macros.register_macro_helper((SubLObject)pph_macros.$sym107$DESTROY_NEW_PPH_PHRASES, (SubLObject)pph_macros.$sym108$DESTROYING_NEW_PPH_PHRASES_WHEN_DONE);
        access_macros.register_macro_helper((SubLObject)pph_macros.$sym114$GET_NEW_PPH_PHRASE_COUNT, (SubLObject)pph_macros.$sym108$DESTROYING_NEW_PPH_PHRASES_WHEN_DONE);
        access_macros.register_macro_helper((SubLObject)pph_macros.$sym128$WITHIN_NEW_PPH_DISCOURSE_CONTEXT, (SubLObject)pph_macros.$sym129$ENSURING_PPH_DISCOURSE_CONTEXT);
        access_macros.register_macro_helper((SubLObject)pph_macros.$sym133$HERALD_NEW_DISCOURSE_CONTEXT, (SubLObject)pph_macros.$sym128$WITHIN_NEW_PPH_DISCOURSE_CONTEXT);
        access_macros.register_macro_helper((SubLObject)pph_macros.$sym135$HERALD_END_OF_DISCOURSE_CONTEXT, (SubLObject)pph_macros.$sym128$WITHIN_NEW_PPH_DISCOURSE_CONTEXT);
        access_macros.register_macro_helper((SubLObject)pph_macros.$sym137$PPH_DISCOURSE_CONTEXT_INITIALIZED_, (SubLObject)pph_macros.$sym129$ENSURING_PPH_DISCOURSE_CONTEXT);
        access_macros.register_macro_helper((SubLObject)pph_macros.$sym138$CLEAR_PPH_DISCOURSE_CONTEXT, (SubLObject)pph_macros.$sym128$WITHIN_NEW_PPH_DISCOURSE_CONTEXT);
        access_macros.register_macro_helper((SubLObject)pph_macros.$sym145$NOTE_LEAVING_SHADOWED_DISCOURSE_CONTEXT, (SubLObject)pph_macros.$sym150$WITH_SHADOWED_DISCOURSE_CONTEXT);
        access_macros.register_macro_helper((SubLObject)pph_macros.$sym186$DO_ONE_PPH_OUTPUT_LIST_ITEM, (SubLObject)pph_macros.$sym187$DO_PPH_OUTPUT_LIST);
        access_macros.register_macro_helper((SubLObject)pph_macros.$sym189$PPH_MAYBE_DO_SPACE_ITEM, (SubLObject)pph_macros.$sym187$DO_PPH_OUTPUT_LIST);
        access_macros.register_macro_helper((SubLObject)pph_macros.$sym199$PPH_UPDATE_END_CHAR_INDEX, (SubLObject)pph_macros.$sym187$DO_PPH_OUTPUT_LIST);
        access_macros.register_macro_helper((SubLObject)pph_macros.$sym195$PPH_MAKE_SPACE_STRING, (SubLObject)pph_macros.$sym189$PPH_MAYBE_DO_SPACE_ITEM);
        access_macros.register_macro_helper((SubLObject)pph_macros.$sym190$WITH_PPH_REGULAR_OUTPUT_ITEM_BINDINGS, (SubLObject)pph_macros.$sym187$DO_PPH_OUTPUT_LIST);
        access_macros.register_macro_helper((SubLObject)pph_macros.$sym193$PPH_OUTPUT_LIST_FIND_START_CHAR, (SubLObject)pph_macros.$sym187$DO_PPH_OUTPUT_LIST);
        access_macros.register_macro_helper((SubLObject)pph_macros.$sym240$PPH_COMPUTE_TIMEOUT_TIME, (SubLObject)pph_macros.$sym246$WITH_PPH_TIMEOUT);
        access_macros.register_macro_helper((SubLObject)pph_macros.$sym247$PPH_TIMEOUT, (SubLObject)pph_macros.$sym246$WITH_PPH_TIMEOUT);
        access_macros.register_macro_helper((SubLObject)pph_macros.$sym287$COMPUTE_NEW_PPH_DEMERIT_CUTOFF, (SubLObject)pph_macros.$sym288$WITH_MAXIMUM_PPH_DEMERIT_CUTOFF);
        access_macros.register_macro_helper((SubLObject)pph_macros.$sym314$PPH_JUSTIFICATION_HTML_FUNCTION_AND_TARGET, (SubLObject)pph_macros.$sym315$WITH_PPH_JUSTIFICATION_GENERATION_PARAMETERS);
        access_macros.register_macro_helper((SubLObject)pph_macros.$sym327$PPH_RESET_VAR_TYPES, (SubLObject)pph_macros.$sym329$PPH_SETTING_VAR_TYPES_IF_SUCCESSFUL);
        access_macros.register_macro_helper((SubLObject)pph_macros.$sym339$PPH_HANDLE_LOCAL_VARS, (SubLObject)pph_macros.$sym340$PPH_POSSIBLY_BINDING_VARIABLES);
        access_macros.register_macro_helper((SubLObject)pph_macros.$sym368$MAX_SUSPENDED_METHOD_DEPTH, (SubLObject)pph_macros.$sym369$HANDLING_PPH_METHOD_FAILURES);
        access_macros.register_macro_helper((SubLObject)pph_macros.$sym381$HANDLING_PPH_METHOD_FAILURES_TOP_LEVEL_P, (SubLObject)pph_macros.$sym369$HANDLING_PPH_METHOD_FAILURES);
        access_macros.register_macro_helper((SubLObject)pph_macros.$sym378$NOTE_SUSPENDED_PARAPHRASE_METHOD_PLIST, (SubLObject)pph_macros.$sym369$HANDLING_PPH_METHOD_FAILURES);
        access_macros.register_macro_helper((SubLObject)pph_macros.$sym395$PPH_PHRASE_RESTRICT_CYCL_TO_MT_SCOPE, (SubLObject)pph_macros.$sym397$HANDLING_PPH_MT_SCOPE);
        access_macros.register_macro_helper((SubLObject)pph_macros.$sym396$PPH_PHRASE_RESTORE_AND_REPHRASE_CYCL_IF_MT_SCOPED, (SubLObject)pph_macros.$sym397$HANDLING_PPH_MT_SCOPE);
        return (SubLObject)pph_macros.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_pph_macros_file();
    }
    
    @Override
	public void initializeVariables() {
        init_pph_macros_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_pph_macros_file();
    }
    
    static {
        me = (SubLFile)new pph_macros();
        pph_macros.$pph_memoization_state$ = null;
        pph_macros.$pph_external_memoization_state$ = null;
        pph_macros.$dtp_pph_problem_store_pointer$ = null;
        pph_macros.$free_pph_problem_store_pointers$ = null;
        pph_macros.$pph_problem_store_pointer$ = null;
        pph_macros.$new_pph_phrases$ = null;
        pph_macros.$destroy_new_pph_phrasesP$ = null;
        pph_macros.$creating_permanent_pph_phraseP$ = null;
        pph_macros.$new_pph_phrase_count$ = null;
        pph_macros.$inside_destroy_new_pph_phrasesP$ = null;
        pph_macros.$pph_disambiguation_mode_return_style$ = null;
        pph_macros.$pph_timeout_time$ = null;
        pph_macros.$pph_timeout_reachedP$ = null;
        pph_macros.$pph_timeout_time_check_count$ = null;
        pph_macros.$pph_default_timeout$ = null;
        pph_macros.$pph_var_types_counter$ = null;
        pph_macros.$max_suspended_method_depth$ = null;
        pph_macros.$suspended_paraphrase_methods$ = null;
        pph_macros.$allow_handling_of_pph_method_failuresP$ = null;
        pph_macros.$handling_pph_method_failuresP$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPPINGS"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym1$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym2$ENFORCE_TYPE = SubLObjectFactory.makeSymbol("ENFORCE-TYPE");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALIST-P"));
        $sym4$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym5$_PPH_TERM_PARAPHRASE_MAP_ = SubLObjectFactory.makeSymbol("*PPH-TERM-PARAPHRASE-MAP*");
        $sym6$CHECK_TYPE = SubLObjectFactory.makeSymbol("CHECK-TYPE");
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALID-PPH-BLACKLIST?"));
        $sym8$_PPH_TERM_PARAPHRASE_BLACKLIST_ = SubLObjectFactory.makeSymbol("*PPH-TERM-PARAPHRASE-BLACKLIST*");
        $list9 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGS"));
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXICAL-ASSERTIONS"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym11$CHECK_LIST_TYPE = SubLObjectFactory.makeSymbol("CHECK-LIST-TYPE");
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALID-PPH-BLACKLIST-ASSERTION?"));
        $sym13$_PPH_LEXICAL_ASSERTION_BLACKLIST_ = SubLObjectFactory.makeSymbol("*PPH-LEXICAL-ASSERTION-BLACKLIST*");
        $list14 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FROM-PREFIX"), (SubLObject)SubLObjectFactory.makeSymbol("TO-PREFIX"), (SubLObject)SubLObjectFactory.makeSymbol("MAP")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym15$DO_ALIST = SubLObjectFactory.makeSymbol("DO-ALIST");
        $list16 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-AMBIGUOUS-STRINGS*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST-OF"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-AMBIGUOUS-STRINGS*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DICTIONARY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)pph_macros.EQUALP)))));
        $list17 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRECISION"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-PRECISION-P"));
        $sym19$_PARAPHRASE_PRECISION_ = SubLObjectFactory.makeSymbol("*PARAPHRASE-PRECISION*");
        $list20 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-TERSE-MODE?*"), (SubLObject)pph_macros.T));
        $sym21$WITH_PARAPHRASE_PRECISION = SubLObjectFactory.makeSymbol("WITH-PARAPHRASE-PRECISION");
        $sym22$REMEMBERING_PPH_AMBIGUOUS_STRINGS = SubLObjectFactory.makeSymbol("REMEMBERING-PPH-AMBIGUOUS-STRINGS");
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NESTED-ARG-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list24 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-NESTED-ARG-LIST-P"));
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERMS"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym26$_DEFINITE_DESCRIPTION_LICENSED_TERMS_ = SubLObjectFactory.makeSymbol("*DEFINITE-DESCRIPTION-LICENSED-TERMS*");
        $sym27$APPEND = SubLObjectFactory.makeSymbol("APPEND");
        $list28 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-MAXIMIZE-LINKS?*"), (SubLObject)pph_macros.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-LINK-ARG0?*"), (SubLObject)pph_macros.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-USE-SMART-VARIABLE-REPLACEMENT?*"), (SubLObject)pph_macros.NIL));
        $list29 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG0")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym30$_PPH_CURRENT_ARG0_ = SubLObjectFactory.makeSymbol("*PPH-CURRENT-ARG0*");
        $sym31$FIF = SubLObjectFactory.makeSymbol("FIF");
        $sym32$PPH_OK_ARG0_FOR_LINKING_ = SubLObjectFactory.makeSymbol("PPH-OK-ARG0-FOR-LINKING?");
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("UNSPECIFIED"));
        $sym34$PPH_POSSIBLY_BINDING_CURRENT_ARG0 = SubLObjectFactory.makeSymbol("PPH-POSSIBLY-BINDING-CURRENT-ARG0");
        $list35 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym36$_CONSTANT_LINK_FUNCTION_ = SubLObjectFactory.makeSymbol("*CONSTANT-LINK-FUNCTION*");
        $sym37$FIRST_OF = SubLObjectFactory.makeSymbol("FIRST-OF");
        $list38 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CONSTANT-LINK-FUNCTION*"));
        $sym39$_HTML_GENERATION_TARGET_ = SubLObjectFactory.makeSymbol("*HTML-GENERATION-TARGET*");
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-GENERATION-TARGET*"));
        $list41 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION-SPEC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym42$_HTML_GENERATION_TERM_ID_FUNCTION_ = SubLObjectFactory.makeSymbol("*HTML-GENERATION-TERM-ID-FUNCTION*");
        $list43 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CONSTANT-LINK-FUNCTION*"), (SubLObject)SubLObjectFactory.makeKeyword("NONE")));
        $list44 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*ALLOW-UTF8-IN-PPH-TEXT-MODE*"), (SubLObject)pph_macros.T));
        $list45 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORM"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym46$_PPH_LINK_UNLINKED_PHRASES_TO_MATRIX_ARG0__ = SubLObjectFactory.makeSymbol("*PPH-LINK-UNLINKED-PHRASES-TO-MATRIX-ARG0?*");
        $sym47$CAND = SubLObjectFactory.makeSymbol("CAND");
        $list48 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-LINK-UNLINKED-PHRASES-TO-MATRIX-ARG0?"));
        $sym49$CNOT = SubLObjectFactory.makeSymbol("CNOT");
        $sym50$NEW_OR_REUSED = SubLObjectFactory.makeUninternedSymbol("NEW-OR-REUSED");
        $sym51$WITH_PPH_PROBLEM_STORE = SubLObjectFactory.makeSymbol("WITH-PPH-PROBLEM-STORE");
        $sym52$CMULTIPLE_VALUE_BIND = SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND");
        $sym53$_PPH_MEMOIZATION_STATE_ = SubLObjectFactory.makeSymbol("*PPH-MEMOIZATION-STATE*");
        $list54 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND-OR-CREATE-PPH-MEMOIZATION-STATE"));
        $list55 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-EXTERNAL-MEMOIZATION-STATE*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND-OR-CREATE-PPH-EXTERNAL-MEMOIZATION-STATE"))));
        $sym56$WITH_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("WITH-MEMOIZATION-STATE");
        $list57 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-MEMOIZATION-STATE*"));
        $sym58$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $list59 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NEW"));
        $list60 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMOIZATION-STATE-P"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-MEMOIZATION-STATE*")));
        $list61 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLEAR-ALL-MEMOIZATION"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-MEMOIZATION-STATE*")));
        $list62 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND-OR-CREATE-PPH-EXTERNAL-MEMOIZATION-STATE")));
        $sym63$FIND_OR_CREATE_PPH_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("FIND-OR-CREATE-PPH-MEMOIZATION-STATE");
        $sym64$WITH_PPH_MEMOIZATION = SubLObjectFactory.makeSymbol("WITH-PPH-MEMOIZATION");
        $kw65$REUSED = SubLObjectFactory.makeKeyword("REUSED");
        $kw66$NEW = SubLObjectFactory.makeKeyword("NEW");
        $sym67$FIND_OR_CREATE_PPH_EXTERNAL_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("FIND-OR-CREATE-PPH-EXTERNAL-MEMOIZATION-STATE");
        $list68 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-PPH-MEMOIZATION"), (SubLObject)SubLObjectFactory.makeSymbol("WITH-PPH-EXTERNAL-MEMOIZATION"));
        $sym69$PPH_PROBLEM_STORE_POINTER = SubLObjectFactory.makeSymbol("PPH-PROBLEM-STORE-POINTER");
        $sym70$PPH_PROBLEM_STORE_POINTER_P = SubLObjectFactory.makeSymbol("PPH-PROBLEM-STORE-POINTER-P");
        $list71 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STORE"));
        $list72 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STORE"));
        $list73 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-PROBLEM-STORE-POINTER-STORE"));
        $list74 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PPH-PROBLEM-STORE-POINTER-STORE"));
        $sym75$PPRINT_PPH_PROBLEM_STORE_POINTER = SubLObjectFactory.makeSymbol("PPRINT-PPH-PROBLEM-STORE-POINTER");
        $sym76$PPH_PROBLEM_STORE_POINTER_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("PPH-PROBLEM-STORE-POINTER-PRINT-FUNCTION-TRAMPOLINE");
        $list77 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-PROBLEM-STORE-POINTER-P"));
        $sym78$PPH_PROBLEM_STORE_POINTER_STORE = SubLObjectFactory.makeSymbol("PPH-PROBLEM-STORE-POINTER-STORE");
        $sym79$_CSETF_PPH_PROBLEM_STORE_POINTER_STORE = SubLObjectFactory.makeSymbol("_CSETF-PPH-PROBLEM-STORE-POINTER-STORE");
        $kw80$STORE = SubLObjectFactory.makeKeyword("STORE");
        $str81$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw82$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym83$MAKE_PPH_PROBLEM_STORE_POINTER = SubLObjectFactory.makeSymbol("MAKE-PPH-PROBLEM-STORE-POINTER");
        $kw84$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw85$END = SubLObjectFactory.makeKeyword("END");
        $sym86$VISIT_DEFSTRUCT_OBJECT_PPH_PROBLEM_STORE_POINTER_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-PPH-PROBLEM-STORE-POINTER-METHOD");
        $str87$_PPH_PSP__S_ = SubLObjectFactory.makeString("<PPH-PSP ~S>");
        $kw88$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $sym89$FREE_PPH_PROBLEM_STORE_POINTER = SubLObjectFactory.makeSymbol("FREE-PPH-PROBLEM-STORE-POINTER");
        $kw90$FREE = SubLObjectFactory.makeKeyword("FREE");
        $str91$__Initial_PPH_problem_store___S__ = SubLObjectFactory.makeString("~&Initial PPH problem store: ~S~%");
        $sym92$REUSE_ = SubLObjectFactory.makeUninternedSymbol("REUSE?");
        $list93 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*FREE-PPH-PROBLEM-STORE-POINTERS*"), (SubLObject)pph_macros.NIL));
        $sym94$_PPH_PROBLEM_STORE_POINTER_ = SubLObjectFactory.makeSymbol("*PPH-PROBLEM-STORE-POINTER*");
        $list95 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND-OR-CREATE-PPH-PROBLEM-STORE-POINTER"));
        $sym96$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $sym97$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $list98 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FREE-PPH-PROBLEM-STORE-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-PROBLEM-STORE-POINTER*")));
        $sym99$FIND_OR_CREATE_PPH_PROBLEM_STORE_POINTER = SubLObjectFactory.makeSymbol("FIND-OR-CREATE-PPH-PROBLEM-STORE-POINTER");
        $str100$Destroying_PPH_problem_store___S_ = SubLObjectFactory.makeString("Destroying PPH problem store: ~S~%");
        $str101$_PPH_error_level_ = SubLObjectFactory.makeString("(PPH error level ");
        $str102$__ = SubLObjectFactory.makeString(") ");
        $str103$New_PPH_problem_store_is_not_ok__ = SubLObjectFactory.makeString("New PPH problem store is not ok: ~S");
        $int104$100000 = SubLObjectFactory.makeInteger(100000);
        $list105 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*NEW-PPH-PHRASES*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CREATE-STACK"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*NEW-PPH-PHRASE-COUNT*"), (SubLObject)pph_macros.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CREATING-PERMANENT-PPH-PHRASE?*"), (SubLObject)pph_macros.T));
        $kw106$NOTED = SubLObjectFactory.makeKeyword("NOTED");
        $sym107$DESTROY_NEW_PPH_PHRASES = SubLObjectFactory.makeSymbol("DESTROY-NEW-PPH-PHRASES");
        $sym108$DESTROYING_NEW_PPH_PHRASES_WHEN_DONE = SubLObjectFactory.makeSymbol("DESTROYING-NEW-PPH-PHRASES-WHEN-DONE");
        $sym109$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str110$error_while_destroying_phrase___S = SubLObjectFactory.makeString("error while destroying phrase: ~S");
        $str111$Destroyed__S_PPH_phrases____New_o = SubLObjectFactory.makeString("Destroyed ~S PPH phrases.~% New object count: ~S size: ~S");
        $list112 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*NEW-PPH-PHRASES*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CREATE-STACK"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*NEW-PPH-PHRASE-COUNT*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-NEW-PPH-PHRASE-COUNT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*DESTROY-NEW-PPH-PHRASES?*"), (SubLObject)pph_macros.T));
        $list113 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DESTROY-NEW-PPH-PHRASES")));
        $sym114$GET_NEW_PPH_PHRASE_COUNT = SubLObjectFactory.makeSymbol("GET-NEW-PPH-PHRASE-COUNT");
        $list115 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DESTROY?")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym116$MATRIX_NEW_PPH_PHRASES = SubLObjectFactory.makeUninternedSymbol("MATRIX-NEW-PPH-PHRASES");
        $sym117$PHRASE = SubLObjectFactory.makeUninternedSymbol("PHRASE");
        $list118 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*NEW-PPH-PHRASES*"));
        $list119 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*NEW-PPH-PHRASE-COUNT*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-NEW-PPH-PHRASE-COUNT")));
        $list120 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*NEW-PPH-PHRASES*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CREATE-STACK")));
        $list121 = ConsesLow.list((SubLObject)pph_macros.NIL);
        $sym122$PIF = SubLObjectFactory.makeSymbol("PIF");
        $list123 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DESTROY-NEW-PPH-PHRASES"));
        $sym124$DO_STACK_ELEMENTS = SubLObjectFactory.makeSymbol("DO-STACK-ELEMENTS");
        $sym125$STACK_PUSH = SubLObjectFactory.makeSymbol("STACK-PUSH");
        $list126 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-DISCOURSE-CONTEXT-INITIALIZED?"));
        $list127 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-ENSURE-DISCOURSE-PARTICIPANT-RMS"));
        $sym128$WITHIN_NEW_PPH_DISCOURSE_CONTEXT = SubLObjectFactory.makeSymbol("WITHIN-NEW-PPH-DISCOURSE-CONTEXT");
        $sym129$ENSURING_PPH_DISCOURSE_CONTEXT = SubLObjectFactory.makeSymbol("ENSURING-PPH-DISCOURSE-CONTEXT");
        $list130 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-DISCOURSE-CONTEXT*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-PPH-DISCOURSE-CONTEXT"))));
        $list131 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HERALD-NEW-DISCOURSE-CONTEXT"));
        $list132 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HERALD-END-OF-DISCOURSE-CONTEXT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLEAR-PPH-DISCOURSE-CONTEXT")));
        $sym133$HERALD_NEW_DISCOURSE_CONTEXT = SubLObjectFactory.makeSymbol("HERALD-NEW-DISCOURSE-CONTEXT");
        $str134$__Entering_WITHIN_NEW_PPH_DISCOUR = SubLObjectFactory.makeString("~&Entering WITHIN-NEW-PPH-DISCOURSE-CONTEXT, *pph-discourse-context* is~% ~S~%");
        $sym135$HERALD_END_OF_DISCOURSE_CONTEXT = SubLObjectFactory.makeSymbol("HERALD-END-OF-DISCOURSE-CONTEXT");
        $str136$__Leaving_WITHIN_NEW_PPH_DISCOURS = SubLObjectFactory.makeString("~&Leaving WITHIN-NEW-PPH-DISCOURSE-CONTEXT, *pph-discourse-context* is~% ~S~%");
        $sym137$PPH_DISCOURSE_CONTEXT_INITIALIZED_ = SubLObjectFactory.makeSymbol("PPH-DISCOURSE-CONTEXT-INITIALIZED?");
        $sym138$CLEAR_PPH_DISCOURSE_CONTEXT = SubLObjectFactory.makeSymbol("CLEAR-PPH-DISCOURSE-CONTEXT");
        $list139 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-RMS-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $kw140$CYC_LEXICON = SubLObjectFactory.makeKeyword("CYC-LEXICON");
        $sym141$MATRIX_RMS = SubLObjectFactory.makeUninternedSymbol("MATRIX-RMS");
        $str142$NIL = SubLObjectFactory.makeString("NIL");
        $sym143$IGNORE = SubLObjectFactory.makeSymbol("IGNORE");
        $sym144$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym145$NOTE_LEAVING_SHADOWED_DISCOURSE_CONTEXT = SubLObjectFactory.makeSymbol("NOTE-LEAVING-SHADOWED-DISCOURSE-CONTEXT");
        $sym146$_PPH_DISCOURSE_CONTEXT_ = SubLObjectFactory.makeSymbol("*PPH-DISCOURSE-CONTEXT*");
        $list147 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-DISCOURSE-CONTEXT-RMS")));
        $list148 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-DISCOURSE-CONTEXT*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-DISCOURSE-CONTEXT-COPY"))));
        $list149 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-NOTE"), (SubLObject)pph_macros.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("~&Shadowing discourse context...~%"));
        $sym150$WITH_SHADOWED_DISCOURSE_CONTEXT = SubLObjectFactory.makeSymbol("WITH-SHADOWED-DISCOURSE-CONTEXT");
        $str151$__Leaving__S = SubLObjectFactory.makeString("~&Leaving ~S");
        $str152$New_RMS___S = SubLObjectFactory.makeString("New RMS: ~S");
        $list153 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEAKER"), (SubLObject)SubLObjectFactory.makeSymbol("ADDRESSEE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym154$_PPH_SPEAKER_ = SubLObjectFactory.makeSymbol("*PPH-SPEAKER*");
        $sym155$_PPH_ADDRESSEE_ = SubLObjectFactory.makeSymbol("*PPH-ADDRESSEE*");
        $list156 = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("STRING"), SubLObjectFactory.makeSymbol("OUTPUT-LIST"), SubLObjectFactory.makeSymbol("&KEY"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARANOID-ARG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PARANOID-ARG"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OUTPUT-ITEM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("OUTPUT-ITEM"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG-POSITION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-POSITION"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-OPEN-TAG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("HTML-OPEN-TAG"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-CLOSE-TAG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("HTML-CLOSE-TAG"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START-CHAR-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("START-CHAR-INDEX"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHOLE-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("WHOLE-STRING"))) }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list157 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PARANOID-ARG"), (SubLObject)SubLObjectFactory.makeKeyword("OUTPUT-ITEM"), (SubLObject)SubLObjectFactory.makeKeyword("ARG-POSITION"), (SubLObject)SubLObjectFactory.makeKeyword("HTML-OPEN-TAG"), (SubLObject)SubLObjectFactory.makeKeyword("HTML-CLOSE-TAG"), (SubLObject)SubLObjectFactory.makeKeyword("START-CHAR-INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("WHOLE-STRING"));
        $kw158$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw159$PARANOID_ARG = SubLObjectFactory.makeKeyword("PARANOID-ARG");
        $sym160$PARANOID_ARG = SubLObjectFactory.makeSymbol("PARANOID-ARG");
        $kw161$OUTPUT_ITEM = SubLObjectFactory.makeKeyword("OUTPUT-ITEM");
        $sym162$OUTPUT_ITEM = SubLObjectFactory.makeSymbol("OUTPUT-ITEM");
        $kw163$ARG_POSITION = SubLObjectFactory.makeKeyword("ARG-POSITION");
        $sym164$ARG_POSITION = SubLObjectFactory.makeSymbol("ARG-POSITION");
        $kw165$HTML_OPEN_TAG = SubLObjectFactory.makeKeyword("HTML-OPEN-TAG");
        $sym166$HTML_OPEN_TAG = SubLObjectFactory.makeSymbol("HTML-OPEN-TAG");
        $kw167$HTML_CLOSE_TAG = SubLObjectFactory.makeKeyword("HTML-CLOSE-TAG");
        $sym168$HTML_CLOSE_TAG = SubLObjectFactory.makeSymbol("HTML-CLOSE-TAG");
        $kw169$START_CHAR_INDEX = SubLObjectFactory.makeKeyword("START-CHAR-INDEX");
        $sym170$START_CHAR_INDEX = SubLObjectFactory.makeSymbol("START-CHAR-INDEX");
        $kw171$WHOLE_STRING = SubLObjectFactory.makeKeyword("WHOLE-STRING");
        $sym172$WHOLE_STRING = SubLObjectFactory.makeSymbol("WHOLE-STRING");
        $sym173$ITEM = SubLObjectFactory.makeUninternedSymbol("ITEM");
        $sym174$WHOLE_HTML_STRING = SubLObjectFactory.makeUninternedSymbol("WHOLE-HTML-STRING");
        $sym175$END_CHAR_INDEX = SubLObjectFactory.makeUninternedSymbol("END-CHAR-INDEX");
        $sym176$ITERATOR = SubLObjectFactory.makeUninternedSymbol("ITERATOR");
        $list177 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-PHRASE-OUTPUT-LIST-P"));
        $list178 = ConsesLow.list((SubLObject)pph_macros.ZERO_INTEGER);
        $sym179$PPH_PHRASE_OUTPUT_LIST_STRING = SubLObjectFactory.makeSymbol("PPH-PHRASE-OUTPUT-LIST-STRING");
        $list180 = ConsesLow.list((SubLObject)pph_macros.T);
        $sym181$PPH_REMOVE_HTML_TAGS = SubLObjectFactory.makeSymbol("PPH-REMOVE-HTML-TAGS");
        $sym182$NEW_PPH_PHRASE_OUTPUT_LIST_ITERATOR = SubLObjectFactory.makeSymbol("NEW-PPH-PHRASE-OUTPUT-LIST-ITERATOR");
        $sym183$UNTIL = SubLObjectFactory.makeSymbol("UNTIL");
        $sym184$PPH_PHRASE_OUTPUT_LIST_ITERATOR_EMPTY_P = SubLObjectFactory.makeSymbol("PPH-PHRASE-OUTPUT-LIST-ITERATOR-EMPTY-P");
        $sym185$PPH_PHRASE_OUTPUT_LIST_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("PPH-PHRASE-OUTPUT-LIST-ITERATOR-NEXT");
        $sym186$DO_ONE_PPH_OUTPUT_LIST_ITEM = SubLObjectFactory.makeSymbol("DO-ONE-PPH-OUTPUT-LIST-ITEM");
        $sym187$DO_PPH_OUTPUT_LIST = SubLObjectFactory.makeSymbol("DO-PPH-OUTPUT-LIST");
        $list188 = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("ITEM"), SubLObjectFactory.makeSymbol("STRING"), SubLObjectFactory.makeSymbol("ARG-POSITION"), SubLObjectFactory.makeSymbol("HTML-OPEN-TAG"), SubLObjectFactory.makeSymbol("HTML-CLOSE-TAG"), SubLObjectFactory.makeSymbol("PARANOID-ARG"), SubLObjectFactory.makeSymbol("OUTPUT-ITEM"), SubLObjectFactory.makeSymbol("WHOLE-STRING"), SubLObjectFactory.makeSymbol("START-CHAR-INDEX"), SubLObjectFactory.makeSymbol("END-CHAR-INDEX") }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym189$PPH_MAYBE_DO_SPACE_ITEM = SubLObjectFactory.makeSymbol("PPH-MAYBE-DO-SPACE-ITEM");
        $sym190$WITH_PPH_REGULAR_OUTPUT_ITEM_BINDINGS = SubLObjectFactory.makeSymbol("WITH-PPH-REGULAR-OUTPUT-ITEM-BINDINGS");
        $sym191$RAW_ITEM_STRING = SubLObjectFactory.makeUninternedSymbol("RAW-ITEM-STRING");
        $sym192$PPH_PHRASE_OUTPUT_ITEM_GET_STRING = SubLObjectFactory.makeSymbol("PPH-PHRASE-OUTPUT-ITEM-GET-STRING");
        $sym193$PPH_OUTPUT_LIST_FIND_START_CHAR = SubLObjectFactory.makeSymbol("PPH-OUTPUT-LIST-FIND-START-CHAR");
        $sym194$_ = SubLObjectFactory.makeSymbol(">");
        $sym195$PPH_MAKE_SPACE_STRING = SubLObjectFactory.makeSymbol("PPH-MAKE-SPACE-STRING");
        $list196 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-UNKNOWN-ARG-POSITION")));
        $list197 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-EMPTY-CYCL")));
        $sym198$NEW_PPH_PHRASE_FILLER_ITEM = SubLObjectFactory.makeSymbol("NEW-PPH-PHRASE-FILLER-ITEM");
        $sym199$PPH_UPDATE_END_CHAR_INDEX = SubLObjectFactory.makeSymbol("PPH-UPDATE-END-CHAR-INDEX");
        $str200$Adding_space_string_of_length__S = SubLObjectFactory.makeString("Adding space string of length ~S");
        $list201 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITEM"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-POSITION"), (SubLObject)SubLObjectFactory.makeSymbol("HTML-OPEN-TAG"), (SubLObject)SubLObjectFactory.makeSymbol("HTML-CLOSE-TAG"), (SubLObject)SubLObjectFactory.makeSymbol("PARANOID-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("OUTPUT-ITEM")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym202$PPH_PHRASE_OUTPUT_ITEM_ARG_POSITION = SubLObjectFactory.makeSymbol("PPH-PHRASE-OUTPUT-ITEM-ARG-POSITION");
        $sym203$PPH_PHRASE_OUTPUT_ITEM_HTML_OPEN_TAG = SubLObjectFactory.makeSymbol("PPH-PHRASE-OUTPUT-ITEM-HTML-OPEN-TAG");
        $sym204$PPH_PHRASE_OUTPUT_ITEM_HTML_CLOSE_TAG = SubLObjectFactory.makeSymbol("PPH-PHRASE-OUTPUT-ITEM-HTML-CLOSE-TAG");
        $sym205$PPH_PHRASE_OUTPUT_ITEM_CYCL = SubLObjectFactory.makeSymbol("PPH-PHRASE-OUTPUT-ITEM-CYCL");
        $sym206$PPH_STRING_P = SubLObjectFactory.makeSymbol("PPH-STRING-P");
        $sym207$PPH_CHAR__ = SubLObjectFactory.makeSymbol("PPH-CHAR-=");
        $str208$Couldn_t_find__S_in__S___ = SubLObjectFactory.makeString("Couldn't find ~S in ~S.~%");
        $list209 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITEM"), (SubLObject)SubLObjectFactory.makeSymbol("JAVALIST"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list210 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw211$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym212$CSOME = SubLObjectFactory.makeSymbol("CSOME");
        $sym213$PPH_NJAVALIST_ITEMS = SubLObjectFactory.makeSymbol("PPH-NJAVALIST-ITEMS");
        $kw214$PAIRS = SubLObjectFactory.makeKeyword("PAIRS");
        $list215 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANS"), (SubLObject)SubLObjectFactory.makeSymbol("THRESHOLD"), (SubLObject)SubLObjectFactory.makeSymbol("NOTIFICATION-FUNCTION-SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RETURN-STYLE"), (SubLObject)SubLObjectFactory.makeKeyword("JAVALISTS"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list216 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RETURN-STYLE"));
        $kw217$RETURN_STYLE = SubLObjectFactory.makeKeyword("RETURN-STYLE");
        $kw218$JAVALISTS = SubLObjectFactory.makeKeyword("JAVALISTS");
        $list219 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PARTIAL-RESULTS-INITIALIZATION-FN*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE-DISAMBIGUATION-PHRASES")));
        $list220 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PARTIAL-RESULTS-ACCUMULATION-FN*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ACCUMULATE-DISAMBIGUATION-PHRASES")));
        $list221 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PARTIAL-RESULTS-CONSOLIDATION-FN*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CONSOLIDATE-DISAMBIGUATION-PHRASES")));
        $sym222$_PARTIAL_RESULTS_NOTIFICATION_FN_ = SubLObjectFactory.makeSymbol("*PARTIAL-RESULTS-NOTIFICATION-FN*");
        $list223 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PARTIAL-RESULTS-FINAL-RESULT-FN*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FINAL-RESULTS-FOR-DISAMBIGUATION-PHRASES")));
        $sym224$_PPH_DISAMBIGUATION_MODE_RETURN_STYLE_ = SubLObjectFactory.makeSymbol("*PPH-DISAMBIGUATION-MODE-RETURN-STYLE*");
        $sym225$WITH_PARTIAL_RESULTS_ACCUMULATION = SubLObjectFactory.makeSymbol("WITH-PARTIAL-RESULTS-ACCUMULATION");
        $sym226$INCREMENTAL_PPH_DISAMBIGUATION_RESULT_P = SubLObjectFactory.makeSymbol("INCREMENTAL-PPH-DISAMBIGUATION-RESULT-P");
        $str227$Don_t_know_how_to_accumulate__S_a = SubLObjectFactory.makeString("Don't know how to accumulate ~S answers.");
        $sym228$_ = SubLObjectFactory.makeSymbol("<");
        $list229 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROBLEM-DICTIONARY-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym230$MATRIX_PROBLEM_DICTIONARY = SubLObjectFactory.makeUninternedSymbol("MATRIX-PROBLEM-DICTIONARY");
        $list231 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DICTIONARY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)pph_macros.EQL)));
        $list232 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-PROBLEM-REPORTS*"));
        $list233 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-PROBLEM-REPORTING-MODE*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-PROBLEM-REPORTING-ON-P")), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-PROBLEM-REPORTING-MODE*"), (SubLObject)SubLObjectFactory.makeKeyword("QUIET")));
        $sym234$_PPH_PROBLEM_REPORTS_ = SubLObjectFactory.makeSymbol("*PPH-PROBLEM-REPORTS*");
        $sym235$DICTIONARY_P = SubLObjectFactory.makeSymbol("DICTIONARY-P");
        $sym236$PPH_MERGE_PROBLEM_DICTIONARY = SubLObjectFactory.makeSymbol("PPH-MERGE-PROBLEM-DICTIONARY");
        $list237 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TIMED-OUT?"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DELAY-IN-SECONDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-TIMEOUT")))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list238 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-TIMEOUT-TIME-CHECK-COUNT*"), (SubLObject)pph_macros.ZERO_INTEGER);
        $sym239$_PPH_TIMEOUT_TIME_ = SubLObjectFactory.makeSymbol("*PPH-TIMEOUT-TIME*");
        $sym240$PPH_COMPUTE_TIMEOUT_TIME = SubLObjectFactory.makeSymbol("PPH-COMPUTE-TIMEOUT-TIME");
        $list241 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-TIMEOUT-REACHED?*"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-TIMEOUT-REACHED?*")));
        $list242 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-TIMEOUT-REACHED?*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-TIMEOUT-TIME-REACHED?")));
        $sym243$_PPH_TIMEOUT_REACHED__ = SubLObjectFactory.makeSymbol("*PPH-TIMEOUT-REACHED?*");
        $list244 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-TIMEOUT-TIME-REACHED?")));
        $str245$PPH_timeout_reached_ = SubLObjectFactory.makeString("PPH timeout reached.");
        $sym246$WITH_PPH_TIMEOUT = SubLObjectFactory.makeSymbol("WITH-PPH-TIMEOUT");
        $sym247$PPH_TIMEOUT = SubLObjectFactory.makeSymbol("PPH-TIMEOUT");
        $sym248$ALREADY_INITIALIZED_ = SubLObjectFactory.makeUninternedSymbol("ALREADY-INITIALIZED?");
        $list249 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZED-P"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-UNEXPRESSED-NEGATIONS*")));
        $sym250$_PPH_UNEXPRESSED_NEGATIONS_ = SubLObjectFactory.makeSymbol("*PPH-UNEXPRESSED-NEGATIONS*");
        $list251 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-UNEXPRESSED-NEGATIONS*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-SET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)pph_macros.EQUAL)));
        $sym252$COR = SubLObjectFactory.makeSymbol("COR");
        $list253 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-EMPTY?"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-UNEXPRESSED-NEGATIONS*")));
        $list254 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-ERROR"), (SubLObject)pph_macros.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("Abandoning unexpressed negations: ~S"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-UNEXPRESSED-NEGATIONS*")));
        $list255 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENERATION-MT"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym256$_PPH_LANGUAGE_MT_ = SubLObjectFactory.makeSymbol("*PPH-LANGUAGE-MT*");
        $sym257$PPH_CANONICALIZE_HLMT = SubLObjectFactory.makeSymbol("PPH-CANONICALIZE-HLMT");
        $list258 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-LANGUAGE-MT*"));
        $list259 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOMAIN-MT"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym260$_PPH_DOMAIN_MT_ = SubLObjectFactory.makeSymbol("*PPH-DOMAIN-MT*");
        $list261 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-DOMAIN-MT*"));
        $list262 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENERATION-MT"), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN-MT")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym263$POSSIBLY_WITH_PPH_LANGUAGE_MT = SubLObjectFactory.makeSymbol("POSSIBLY-WITH-PPH-LANGUAGE-MT");
        $sym264$POSSIBLY_WITH_PPH_DOMAIN_MT = SubLObjectFactory.makeSymbol("POSSIBLY-WITH-PPH-DOMAIN-MT");
        $list265 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BROADEN?"), (SubLObject)pph_macros.NIL)), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym266$WITH_INFERENCE_MT_RELEVANCE = SubLObjectFactory.makeSymbol("WITH-INFERENCE-MT-RELEVANCE");
        $sym267$BROADENED_LANGUAGE_MT = SubLObjectFactory.makeUninternedSymbol("BROADENED-LANGUAGE-MT");
        $sym268$WITH_PPH_LANGUAGE_MT_RELEVANCE = SubLObjectFactory.makeSymbol("WITH-PPH-LANGUAGE-MT-RELEVANCE");
        $list269 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-BROADEN-LANGUAGE-MT")));
        $sym270$HLMT_EQUAL_ = SubLObjectFactory.makeSymbol("HLMT-EQUAL?");
        $list271 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-WARN"), (SubLObject)pph_macros.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("Broadening *PPH-LANGUAGE-MT* to ~S"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-LANGUAGE-MT*"));
        $list272 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-ENHANCED-DOMAIN-MT"));
        $list273 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FN"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym274$DO_DICTIONARY = SubLObjectFactory.makeSymbol("DO-DICTIONARY");
        $list275 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-PHRASE-FNS*"));
        $list276 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INIT-STATE")));
        $list277 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OK?"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym278$SUSPEND_ = SubLObjectFactory.makeUninternedSymbol("SUSPEND?");
        $sym279$_PPH_USE_BULLETED_LISTS__ = SubLObjectFactory.makeSymbol("*PPH-USE-BULLETED-LISTS?*");
        $sym280$PPH_NOTE = SubLObjectFactory.makeSymbol("PPH-NOTE");
        $str281$__Suspending_bullet_use_for____S_ = SubLObjectFactory.makeString("~&Suspending bullet use for~% ~S~%");
        $list282 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-NOTE"), (SubLObject)pph_macros.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("~&Turning bullet use back on.~%")));
        $list283 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUTOFF"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-SUGGESTED-DEMERIT-CUTOFF*"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym284$PPH_CHECK_TYPE = SubLObjectFactory.makeSymbol("PPH-CHECK-TYPE");
        $list285 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALID-PPH-DEMERIT-CUTOFF-P"));
        $sym286$_PPH_DEMERIT_CUTOFF_ = SubLObjectFactory.makeSymbol("*PPH-DEMERIT-CUTOFF*");
        $sym287$COMPUTE_NEW_PPH_DEMERIT_CUTOFF = SubLObjectFactory.makeSymbol("COMPUTE-NEW-PPH-DEMERIT-CUTOFF");
        $sym288$WITH_MAXIMUM_PPH_DEMERIT_CUTOFF = SubLObjectFactory.makeSymbol("WITH-MAXIMUM-PPH-DEMERIT-CUTOFF");
        $sym289$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $list290 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SECONDS")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym291$OLD_GRACE_PERIOD = SubLObjectFactory.makeUninternedSymbol("OLD-GRACE-PERIOD");
        $list292 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DELAYED-PROCESSOR-GET-DELAY-SECONDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-PHRASE-DESTROYER"))));
        $sym293$SET_PPH_PHRASE_DESTRUCTION_GRACE_PERIOD = SubLObjectFactory.makeSymbol("SET-PPH-PHRASE-DESTRUCTION-GRACE-PERIOD");
        $sym294$MAX = SubLObjectFactory.makeSymbol("MAX");
        $list295 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*BYPASS-PPH-PHRASE-DESTROYER?*"), (SubLObject)pph_macros.NIL));
        $list296 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-DISPLAYED-PROOFS*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND-OR-CREATE-PPH-DISPLAYED-PROOF-STACK"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-JUSTIFIED-PROOFS*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND-OR-CREATE-PPH-JUSTIFIED-PROOF-SET"))));
        $list297 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-ANSWER")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym298$_PPH_INFERENCE_ANSWER_ = SubLObjectFactory.makeSymbol("*PPH-INFERENCE-ANSWER*");
        $sym299$WITH_PPH_INFERENCE = SubLObjectFactory.makeSymbol("WITH-PPH-INFERENCE");
        $sym300$INFERENCE_ANSWER_INFERENCE = SubLObjectFactory.makeSymbol("INFERENCE-ANSWER-INFERENCE");
        $list301 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFERENCE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym302$_PPH_HYPOTHETICAL_VARS_ = SubLObjectFactory.makeSymbol("*PPH-HYPOTHETICAL-VARS*");
        $sym303$INFERENCE_HYPOTHETICAL_BINDINGS = SubLObjectFactory.makeSymbol("INFERENCE-HYPOTHETICAL-BINDINGS");
        $list304 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-HANDLE-HYPOTHETICALS?*"), (SubLObject)pph_macros.T);
        $sym305$PPH_ENHANCED_DOMAIN_MT = SubLObjectFactory.makeSymbol("PPH-ENHANCED-DOMAIN-MT");
        $sym306$PPH_GET_INFERENCE_MT = SubLObjectFactory.makeSymbol("PPH-GET-INFERENCE-MT");
        $sym307$WITH_PPH_INFERENCE_ANSWER = SubLObjectFactory.makeSymbol("WITH-PPH-INFERENCE-ANSWER");
        $list308 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-USE-BULLETED-LISTS?*"), (SubLObject)pph_macros.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-REPOSITIONED-PROOFS*"), (SubLObject)pph_macros.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-DISPLAYED-PROOFS*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND-OR-CREATE-PPH-DISPLAYED-PROOF-STACK"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-JUSTIFIED-PROOFS*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND-OR-CREATE-PPH-JUSTIFIED-PROOF-SET"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-PROOF-DEPTH*"), (SubLObject)pph_macros.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-DISPLAYED-SUPPORTS*"), (SubLObject)pph_macros.NIL));
        $sym309$POSSIBLY_WITH_PPH_HTML_JUSTIFICATION_GENERATION_PARAMETERS = SubLObjectFactory.makeSymbol("POSSIBLY-WITH-PPH-HTML-JUSTIFICATION-GENERATION-PARAMETERS");
        $sym310$LINK_FUNCTION = SubLObjectFactory.makeUninternedSymbol("LINK-FUNCTION");
        $sym311$HTML_TARGET = SubLObjectFactory.makeUninternedSymbol("HTML-TARGET");
        $list312 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-JUSTIFICATION-HTML-FUNCTION-AND-TARGET"));
        $sym313$WITH_PPH_HTML_FUNCTION_AND_TARGET = SubLObjectFactory.makeSymbol("WITH-PPH-HTML-FUNCTION-AND-TARGET");
        $sym314$PPH_JUSTIFICATION_HTML_FUNCTION_AND_TARGET = SubLObjectFactory.makeSymbol("PPH-JUSTIFICATION-HTML-FUNCTION-AND-TARGET");
        $sym315$WITH_PPH_JUSTIFICATION_GENERATION_PARAMETERS = SubLObjectFactory.makeSymbol("WITH-PPH-JUSTIFICATION-GENERATION-PARAMETERS");
        $list316 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PHRASE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym317$VAR_TYPES_SHADOW = SubLObjectFactory.makeUninternedSymbol("VAR-TYPES-SHADOW");
        $list318 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COPY-DICTIONARY"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-VAR-TYPES*")));
        $list319 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-NOTED-VAR-TYPES*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-P"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-NOTED-VAR-TYPES*")), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-NOTED-VAR-TYPES*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DICTIONARY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)pph_macros.EQL), (SubLObject)pph_macros.SIXTEEN_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-VAR-TYPES-COUNTER*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("1+"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-VAR-TYPES-COUNTER*"))));
        $list320 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-NOTE"), (SubLObject)pph_macros.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("~&Entering PPH-SETTING-VAR-TYPES-IF-SUCCESSFUL(~S), *pph-var-types* are~% ~s~%"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-VAR-TYPES-COUNTER*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-VALUES"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-VAR-TYPES*")));
        $sym321$_PPH_VAR_TYPES_ = SubLObjectFactory.makeSymbol("*PPH-VAR-TYPES*");
        $list322 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-NOTE"), (SubLObject)pph_macros.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("~&Leaving PPH-SETTING-VAR-TYPES-IF-SUCCESSFUL(~S). "), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-VAR-TYPES-COUNTER*"));
        $sym323$PPH_PHRASE_DONE_ = SubLObjectFactory.makeSymbol("PPH-PHRASE-DONE?");
        $list324 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-NOTE"), (SubLObject)pph_macros.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("~& Output list: ~S~%"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-PHRASE-OUTPUT-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("PHRASE")));
        $str325$___Setting__S_to____S = SubLObjectFactory.makeString("~& Setting ~S to~% ~S");
        $sym326$DICTIONARY_VALUES = SubLObjectFactory.makeSymbol("DICTIONARY-VALUES");
        $sym327$PPH_RESET_VAR_TYPES = SubLObjectFactory.makeSymbol("PPH-RESET-VAR-TYPES");
        $list328 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-NOTE"), (SubLObject)pph_macros.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("~% Leaving *PPH-VAR-TYPES* ~S"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-VALUES"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-VAR-TYPES*"))));
        $sym329$PPH_SETTING_VAR_TYPES_IF_SUCCESSFUL = SubLObjectFactory.makeSymbol("PPH-SETTING-VAR-TYPES-IF-SUCCESSFUL");
        $sym330$OLD_PPH_VARS = SubLObjectFactory.makeUninternedSymbol("OLD-PPH-VARS");
        $list331 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-VAR-TYPES*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-P"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-VAR-TYPES*")), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-VAR-TYPES*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DICTIONARY"))));
        $list332 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-REGISTERED-VARS")));
        $list333 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-DIFFERENT-VARS*"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-DIFFERENT-VARS*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-NOTED-VAR-TYPES*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-P"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-NOTED-VAR-TYPES*")), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-NOTED-VAR-TYPES*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DICTIONARY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)pph_macros.EQL), (SubLObject)pph_macros.SIXTEEN_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-POSSIBLY-BINDING-VARIABLES-COUNTER*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("1+"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-POSSIBLY-BINDING-VARIABLES-COUNTER*"))));
        $list334 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-NOTE"), (SubLObject)pph_macros.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("~&Entering PPH-POSSIBLY-BINDING-VARIABLES(~S), *pph-var-types* are~% ~S~%"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-POSSIBLY-BINDING-VARIABLES-COUNTER*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-VALUES"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-VAR-TYPES*")));
        $sym335$LOCAL_VARS = SubLObjectFactory.makeSymbol("LOCAL-VARS");
        $sym336$SET_DIFFERENCE = SubLObjectFactory.makeSymbol("SET-DIFFERENCE");
        $list337 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-REGISTERED-VARS"));
        $list338 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-NOTE"), (SubLObject)pph_macros.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("~&Leaving PPH-POSSIBLY-BINDING-VARIABLES(~S), vars in local *pph-var-types* were ~s "), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-POSSIBLY-BINDING-VARIABLES-COUNTER*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-REGISTERED-VARS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-HANDLE-LOCAL-VARS"), (SubLObject)SubLObjectFactory.makeSymbol("LOCAL-VARS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-NOTE"), (SubLObject)pph_macros.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("~&... and *pph-var-types* are now ~S~%"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-REGISTERED-VARS"))));
        $sym339$PPH_HANDLE_LOCAL_VARS = SubLObjectFactory.makeSymbol("PPH-HANDLE-LOCAL-VARS");
        $sym340$PPH_POSSIBLY_BINDING_VARIABLES = SubLObjectFactory.makeSymbol("PPH-POSSIBLY-BINDING-VARIABLES");
        $str341$__Deregistering__S__ = SubLObjectFactory.makeString("~&Deregistering ~S~%");
        $list342 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PERSON"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("GENDER")), (SubLObject)SubLObjectFactory.makeSymbol("PRONOUN-AGR"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym343$CDESTRUCTURING_BIND = SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND");
        $list344 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AGR-CONSTRAINT"), (SubLObject)SubLObjectFactory.makeSymbol("PHRASE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym345$PPH_PHRASE_AGR = SubLObjectFactory.makeSymbol("PPH-PHRASE-AGR");
        $list346 = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("TEMPLATE"), SubLObjectFactory.makeSymbol("FORMULA"), SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("RELN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG-POSITION-MAP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-NEW-EMPTY-MAP"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INVERSE?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("IGNORE-ME"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-PREDS"), (SubLObject)SubLObjectFactory.makeKeyword("ANY")), SubLObjectFactory.makeSymbol("FOCUS-ARGNUM"), SubLObjectFactory.makeSymbol("DONE") }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list347 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RELN"), (SubLObject)SubLObjectFactory.makeKeyword("ARG-POSITION-MAP"), (SubLObject)SubLObjectFactory.makeKeyword("INVERSE?"), (SubLObject)SubLObjectFactory.makeKeyword("NL-PREDS"), (SubLObject)SubLObjectFactory.makeKeyword("FOCUS-ARGNUM"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw348$RELN = SubLObjectFactory.makeKeyword("RELN");
        $kw349$ARG_POSITION_MAP = SubLObjectFactory.makeKeyword("ARG-POSITION-MAP");
        $kw350$INVERSE_ = SubLObjectFactory.makeKeyword("INVERSE?");
        $sym351$IGNORE_ME = SubLObjectFactory.makeSymbol("IGNORE-ME");
        $kw352$NL_PREDS = SubLObjectFactory.makeKeyword("NL-PREDS");
        $kw353$ANY = SubLObjectFactory.makeKeyword("ANY");
        $kw354$FOCUS_ARGNUM = SubLObjectFactory.makeKeyword("FOCUS-ARGNUM");
        $sym355$GENERATOR = SubLObjectFactory.makeUninternedSymbol("GENERATOR");
        $sym356$GET_PPH_PHRASE_TEMPLATE_GENERATOR = SubLObjectFactory.makeSymbol("GET-PPH-PHRASE-TEMPLATE-GENERATOR");
        $sym357$PPH_PHRASE_TEMPLATE_GENERATOR_DONE_P = SubLObjectFactory.makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-DONE-P");
        $sym358$PPH_PHRASE_TEMPLATE_GENERATOR_NEXT = SubLObjectFactory.makeSymbol("PPH-PHRASE-TEMPLATE-GENERATOR-NEXT");
        $sym359$PPH_PHRASE_P = SubLObjectFactory.makeSymbol("PPH-PHRASE-P");
        $sym360$FREE_PPH_PHRASE_TEMPLATE_GENERATOR = SubLObjectFactory.makeSymbol("FREE-PPH-PHRASE-TEMPLATE-GENERATOR");
        $list361 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-PHRASE"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-POSITION-MAP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-PREDS"), (SubLObject)SubLObjectFactory.makeKeyword("ANY")), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list362 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FOCUS-ARG"), (SubLObject)SubLObjectFactory.makeKeyword("ARG-POSITION-MAP"), (SubLObject)SubLObjectFactory.makeKeyword("NL-PREDS"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw363$FOCUS_ARG = SubLObjectFactory.makeKeyword("FOCUS-ARG");
        $sym364$PHRASE_TEMPLATE = SubLObjectFactory.makeUninternedSymbol("PHRASE-TEMPLATE");
        $sym365$DO_PPH_PHRASE_TEMPLATES_FOR_FORMULA = SubLObjectFactory.makeSymbol("DO-PPH-PHRASE-TEMPLATES-FOR-FORMULA");
        $sym366$PPH_CUSTOMIZE_TEMPLATE_MACRO_HELPER = SubLObjectFactory.makeSymbol("PPH-CUSTOMIZE-TEMPLATE-MACRO-HELPER");
        $int367$300 = SubLObjectFactory.makeInteger(300);
        $sym368$MAX_SUSPENDED_METHOD_DEPTH = SubLObjectFactory.makeSymbol("MAX-SUSPENDED-METHOD-DEPTH");
        $sym369$HANDLING_PPH_METHOD_FAILURES = SubLObjectFactory.makeSymbol("HANDLING-PPH-METHOD-FAILURES");
        $sym370$FAILED_METHOD = SubLObjectFactory.makeUninternedSymbol("FAILED-METHOD");
        $sym371$TRIED_ONE_ = SubLObjectFactory.makeUninternedSymbol("TRIED-ONE?");
        $sym372$TOP_LEVEL_ = SubLObjectFactory.makeUninternedSymbol("TOP-LEVEL?");
        $list373 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HANDLING-PPH-METHOD-FAILURES-TOP-LEVEL-P")));
        $sym374$_SUSPENDED_PARAPHRASE_METHODS_ = SubLObjectFactory.makeSymbol("*SUSPENDED-PARAPHRASE-METHODS*");
        $list375 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-SET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)pph_macros.EQUAL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAX-SUSPENDED-METHOD-DEPTH"))), (SubLObject)SubLObjectFactory.makeSymbol("*SUSPENDED-PARAPHRASE-METHODS*"));
        $list376 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HANDLING-PPH-METHOD-FAILURES?*"), (SubLObject)pph_macros.T);
        $sym377$WHILE = SubLObjectFactory.makeSymbol("WHILE");
        $sym378$NOTE_SUSPENDED_PARAPHRASE_METHOD_PLIST = SubLObjectFactory.makeSymbol("NOTE-SUSPENDED-PARAPHRASE-METHOD-PLIST");
        $sym379$CCATCH = SubLObjectFactory.makeSymbol("CCATCH");
        $kw380$PPH_METHOD_FAILURE = SubLObjectFactory.makeKeyword("PPH-METHOD-FAILURE");
        $sym381$HANDLING_PPH_METHOD_FAILURES_TOP_LEVEL_P = SubLObjectFactory.makeSymbol("HANDLING-PPH-METHOD-FAILURES-TOP-LEVEL-P");
        $str382$Can_t_note_PPH_method_failure__no = SubLObjectFactory.makeString("Can't note PPH method failure; not in failure handling mode.");
        $str383$_S___is_already_suspended_ = SubLObjectFactory.makeString("~S~% is already suspended.");
        $str384$Over__S_suspended_methods____Curr = SubLObjectFactory.makeString("Over ~S suspended methods.~% Current plist:~% ~S");
        $kw385$CYCL = SubLObjectFactory.makeKeyword("CYCL");
        $str386$Cleared__S_suspended_methods_for_ = SubLObjectFactory.makeString("Cleared ~S suspended methods for ~S");
        $list387 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-SYMBOL"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT-TYPE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym388$INFO = SubLObjectFactory.makeUninternedSymbol("INFO");
        $sym389$PPH_METHOD_INFO = SubLObjectFactory.makeSymbol("PPH-METHOD-INFO");
        $sym390$PPH_DEREGISTER_METHOD_INFO = SubLObjectFactory.makeSymbol("PPH-DEREGISTER-METHOD-INFO");
        $sym391$PPH_REGISTER_METHOD_INFO = SubLObjectFactory.makeSymbol("PPH-REGISTER-METHOD-INFO");
        $list392 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHODS"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym393$_SELECT_STRING_METHODS_TO_OMIT_ = SubLObjectFactory.makeSymbol("*SELECT-STRING-METHODS-TO-OMIT*");
        $sym394$SAVE_CYCL = SubLObjectFactory.makeUninternedSymbol("SAVE-CYCL");
        $sym395$PPH_PHRASE_RESTRICT_CYCL_TO_MT_SCOPE = SubLObjectFactory.makeSymbol("PPH-PHRASE-RESTRICT-CYCL-TO-MT-SCOPE");
        $sym396$PPH_PHRASE_RESTORE_AND_REPHRASE_CYCL_IF_MT_SCOPED = SubLObjectFactory.makeSymbol("PPH-PHRASE-RESTORE-AND-REPHRASE-CYCL-IF-MT-SCOPED");
        $sym397$HANDLING_PPH_MT_SCOPE = SubLObjectFactory.makeSymbol("HANDLING-PPH-MT-SCOPE");
        $str398$Removing_MT_scope_from__S = SubLObjectFactory.makeString("Removing MT scope from ~S");
        $list399 = ConsesLow.list((SubLObject)pph_macros.TWO_INTEGER);
        $str400$Updating_agr_preds_to__S_based_on = SubLObjectFactory.makeString("Updating agr-preds to ~S based on mt scope.");
        $str401$New_agr_preds___S = SubLObjectFactory.makeString("New agr preds: ~S");
        $str402$Adding_Mt_scope_paraphrases_to___ = SubLObjectFactory.makeString("Adding Mt scope paraphrases to~% ~S");
        $str403$Couldn_t_finish_temporal_phrase__ = SubLObjectFactory.makeString("Couldn't finish temporal phrase:~% ~S~%");
        $list404 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPORAL"), (SubLObject)SubLObjectFactory.makeSymbol("ETC"));
        $str405$_ = SubLObjectFactory.makeString(",");
        $str406$___Top_level_CycL___S = SubLObjectFactory.makeString("~% Top-level CycL: ~S");
        $kw407$FAILED = SubLObjectFactory.makeKeyword("FAILED");
        $str408$Result_of_adding_Mt_scope_paraphr = SubLObjectFactory.makeString("Result of adding Mt scope paraphrases:~% ~S");
        $list409 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtTimeDimFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Now")));
        $const410$TemporalMicrotheory = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TemporalMicrotheory"));
        $list411 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nameString")));
        $str412$according_to = SubLObjectFactory.makeString("according to");
        $kw413$PHRASE_CYCL = SubLObjectFactory.makeKeyword("PHRASE-CYCL");
        $const414$Now = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Now"));
        $str415$Ignoring__S___because_it_subsumes = SubLObjectFactory.makeString("Ignoring ~S~% because it subsumes #$Now.");
        $list416 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("prepositionStrings")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("adverbStrings")));
        $sym417$ALREADY_MEMORY_MAPPED = SubLObjectFactory.makeUninternedSymbol("ALREADY-MEMORY-MAPPED");
        $list418 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-GENERATION-CACHE-MEMORY-MAPPED?")));
        $list419 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENABLE-NL-GENERATION-CACHE-MEMORY-MAPPING"));
        $list420 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DISABLE-NL-GENERATION-CACHE-MEMORY-MAPPING")));
    }
    
    public static final class $pph_problem_store_pointer_native extends SubLStructNative
    {
        public SubLObject $store;
        private static final SubLStructDeclNative structDecl;
        
        public $pph_problem_store_pointer_native() {
            this.$store = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$pph_problem_store_pointer_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$store;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$store = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$pph_problem_store_pointer_native.class, pph_macros.$sym69$PPH_PROBLEM_STORE_POINTER, pph_macros.$sym70$PPH_PROBLEM_STORE_POINTER_P, pph_macros.$list71, pph_macros.$list72, new String[] { "$store" }, pph_macros.$list73, pph_macros.$list74, pph_macros.$sym75$PPRINT_PPH_PROBLEM_STORE_POINTER);
        }
    }
    
    public static final class $pph_problem_store_pointer_p$UnaryFunction extends UnaryFunction
    {
        public $pph_problem_store_pointer_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PPH-PROBLEM-STORE-POINTER-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return pph_macros.pph_problem_store_pointer_p(arg1);
        }
    }
}

/*

	Total time: 1269 ms
	
*/