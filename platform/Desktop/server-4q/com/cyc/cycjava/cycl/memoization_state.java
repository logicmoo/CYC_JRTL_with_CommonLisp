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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class memoization_state extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.memoization_state";
    public static final String myFingerPrint = "5411983168f7c71e8a63c00eb81a89c114a124298b1e09d968dc3be5f4d4f0bf";
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 3681L)
    public static SubLSymbol $global_caching_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 3764L)
    public static SubLSymbol $caching_mode_should_monitor$;
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 4084L)
    private static SubLSymbol $cache_monitor_hash$;
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 4193L)
    private static SubLSymbol $cache_monitor_failure_hash$;
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 5661L)
    private static SubLSymbol $allow_function_caching_to_be_disabled$;
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 6235L)
    public static SubLSymbol $caching_mode_enabled$;
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 6344L)
    public static SubLSymbol $caching_mode_disabled$;
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 6454L)
    public static SubLSymbol $function_caching_enabledP$;
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 15193L)
    public static SubLSymbol $memoized_item_not_found$;
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 15806L)
    public static SubLSymbol $dtp_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 30077L)
    public static SubLSymbol $dtp_memoization_state$;
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 40642L)
    public static SubLSymbol $memoization_state$;
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 49292L)
    private static SubLSymbol $memoized_functions$;
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 68844L)
    private static SubLSymbol $globally_cached_functions$;
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 72643L)
    private static SubLSymbol $cache_clear_triggers$;
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 84636L)
    public static SubLSymbol $hl_store_cache_clear_callbacks$;
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 85977L)
    public static SubLSymbol $mt_dependent_cache_clear_callbacks$;
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 86983L)
    public static SubLSymbol $suspend_clearing_mt_dependent_cachesP$;
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 87302L)
    public static SubLSymbol $genl_preds_dependent_cache_clear_callbacks$;
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 88357L)
    public static SubLSymbol $genls_dependent_cache_clear_callbacks$;
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 89366L)
    public static SubLSymbol $wff_constraint_dependent_cache_clear_callbacks$;
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 90506L)
    public static SubLSymbol $isa_dependent_cache_clear_callbacks$;
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 91495L)
    public static SubLSymbol $quoted_isa_dependent_cache_clear_callbacks$;
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 97553L)
    public static SubLSymbol $caching_n_sxhash_composite_value$;
    private static final SubLString $str0$global_caching_lock;
    private static final SubLSymbol $sym1$_CACHING_MODE_SHOULD_MONITOR_;
    private static final SubLSymbol $sym2$_CACHE_MONITOR_HASH_;
    private static final SubLSymbol $sym3$_CACHE_MONITOR_FAILURE_HASH_;
    private static final SubLSymbol $sym4$_;
    private static final SubLSymbol $sym5$CDR;
    private static final SubLString $str6$Cached_Function_Call___S__S___;
    private static final SubLString $str7$Missed_Cached_Function_Call___S__;
    private static final SubLSymbol $sym8$_ALLOW_FUNCTION_CACHING_TO_BE_DISABLED_;
    private static final SubLSymbol $kw9$ALL;
    private static final SubLList $list10;
    private static final SubLList $list11;
    private static final SubLSymbol $kw12$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw13$DISABLE;
    private static final SubLSymbol $kw14$ENABLE;
    private static final SubLString $str15$DISABLE_must_be__ALL;
    private static final SubLString $str16$ENABLE_must_be__ALL;
    private static final SubLSymbol $sym17$CLET;
    private static final SubLList $list18;
    private static final SubLSymbol $sym19$CACHING_MODE_ENABLE;
    private static final SubLSymbol $sym20$CACHING_MODE_DISABLE;
    private static final SubLInteger $int21$167;
    private static final SubLList $list22;
    private static final SubLSymbol $sym23$LOCK;
    private static final SubLSymbol $sym24$MEMOIZATION_STATE_LOCK;
    private static final SubLSymbol $sym25$PIF;
    private static final SubLList $list26;
    private static final SubLSymbol $sym27$WITH_WRITER_LOCK;
    private static final SubLList $list28;
    private static final SubLSymbol $sym29$CSETQ;
    private static final SubLSymbol $sym30$RESULT;
    private static final SubLList $list31;
    private static final SubLSymbol $sym32$RET;
    private static final SubLSymbol $sym33$WITH_READER_LOCK;
    private static final SubLList $list34;
    private static final SubLSymbol $kw35$_MEMOIZED_ITEM_NOT_FOUND_;
    private static final SubLSymbol $sym36$CACHING_STATE;
    private static final SubLSymbol $sym37$CACHING_STATE_P;
    private static final SubLList $list38;
    private static final SubLList $list39;
    private static final SubLList $list40;
    private static final SubLList $list41;
    private static final SubLSymbol $sym42$PRINT_CACHING_STATE;
    private static final SubLSymbol $sym43$CACHING_STATE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list44;
    private static final SubLSymbol $sym45$CACHING_STATE_STORE;
    private static final SubLSymbol $sym46$_CSETF_CACHING_STATE_STORE;
    private static final SubLSymbol $sym47$CACHING_STATE_ZERO_ARG_RESULTS;
    private static final SubLSymbol $sym48$_CSETF_CACHING_STATE_ZERO_ARG_RESULTS;
    private static final SubLSymbol $sym49$CACHING_STATE_LOCK;
    private static final SubLSymbol $sym50$_CSETF_CACHING_STATE_LOCK;
    private static final SubLSymbol $sym51$CACHING_STATE_CAPACITY;
    private static final SubLSymbol $sym52$_CSETF_CACHING_STATE_CAPACITY;
    private static final SubLSymbol $sym53$CACHING_STATE_FUNC_SYMBOL;
    private static final SubLSymbol $sym54$_CSETF_CACHING_STATE_FUNC_SYMBOL;
    private static final SubLSymbol $sym55$CACHING_STATE_TEST;
    private static final SubLSymbol $sym56$_CSETF_CACHING_STATE_TEST;
    private static final SubLSymbol $sym57$CACHING_STATE_ARGS_LENGTH;
    private static final SubLSymbol $sym58$_CSETF_CACHING_STATE_ARGS_LENGTH;
    private static final SubLSymbol $kw59$STORE;
    private static final SubLSymbol $kw60$ZERO_ARG_RESULTS;
    private static final SubLSymbol $kw61$LOCK;
    private static final SubLSymbol $kw62$CAPACITY;
    private static final SubLSymbol $kw63$FUNC_SYMBOL;
    private static final SubLSymbol $kw64$TEST;
    private static final SubLSymbol $kw65$ARGS_LENGTH;
    private static final SubLString $str66$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw67$BEGIN;
    private static final SubLSymbol $sym68$MAKE_CACHING_STATE;
    private static final SubLSymbol $kw69$SLOT;
    private static final SubLSymbol $kw70$END;
    private static final SubLSymbol $sym71$VISIT_DEFSTRUCT_OBJECT_CACHING_STATE_METHOD;
    private static final SubLSymbol $sym72$NON_NEGATIVE_INTEGER_P;
    private static final SubLSymbol $sym73$POSITIVE_INTEGER_P;
    private static final SubLSymbol $sym74$SYMBOLP;
    private static final SubLSymbol $sym75$FUNCTION_SPEC_P;
    private static final SubLString $str76$__caching_state_function___A_lock;
    private static final SubLString $str77$_;
    private static final SubLList $list78;
    private static final SubLSymbol $sym79$LISTP;
    private static final SubLSymbol $kw80$RECALC;
    private static final SubLList $list81;
    private static final SubLSymbol $sym82$MEMOIZATION_STATE;
    private static final SubLSymbol $sym83$MEMOIZATION_STATE_P;
    private static final SubLList $list84;
    private static final SubLList $list85;
    private static final SubLList $list86;
    private static final SubLList $list87;
    private static final SubLSymbol $sym88$PRINT_MEMOIZATION_STATE;
    private static final SubLSymbol $sym89$MEMOIZATION_STATE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list90;
    private static final SubLSymbol $sym91$MEMOIZATION_STATE_STORE;
    private static final SubLSymbol $sym92$_CSETF_MEMOIZATION_STATE_STORE;
    private static final SubLSymbol $sym93$MEMOIZATION_STATE_CURRENT_PROCESS;
    private static final SubLSymbol $sym94$_CSETF_MEMOIZATION_STATE_CURRENT_PROCESS;
    private static final SubLSymbol $sym95$_CSETF_MEMOIZATION_STATE_LOCK;
    private static final SubLSymbol $sym96$MEMOIZATION_STATE_NAME;
    private static final SubLSymbol $sym97$_CSETF_MEMOIZATION_STATE_NAME;
    private static final SubLSymbol $sym98$MEMOIZATION_STATE_SHOULD_CLONE;
    private static final SubLSymbol $sym99$_CSETF_MEMOIZATION_STATE_SHOULD_CLONE;
    private static final SubLSymbol $kw100$CURRENT_PROCESS;
    private static final SubLSymbol $kw101$NAME;
    private static final SubLSymbol $kw102$SHOULD_CLONE;
    private static final SubLSymbol $sym103$MAKE_MEMOIZATION_STATE;
    private static final SubLSymbol $sym104$VISIT_DEFSTRUCT_OBJECT_MEMOIZATION_STATE_METHOD;
    private static final SubLSymbol $sym105$STRINGP;
    private static final SubLSymbol $sym106$READER_WRITER_LOCK_P;
    private static final SubLSymbol $sym107$FUNCTIONP;
    private static final SubLString $str108$memoization_state_clone_lock;
    private static final SubLString $str109$__memoization_state_name____A__lo;
    private static final SubLString $str110$Clone__;
    private static final SubLString $str111$Need_to_implement_dictionary_copy;
    private static final SubLString $str112$implement_me_in__memoization_stat;
    private static final SubLSymbol $sym113$CACHING_STATE_RESULTS_HAS_ARGS_;
    private static final SubLSymbol $sym114$SECOND;
    private static final SubLString $str115$Dont_know_how_to_determine_size_a;
    private static final SubLSymbol $sym116$ORIGINAL_MEMOIZATION_PROCESS;
    private static final SubLSymbol $sym117$LOCAL_STATE;
    private static final SubLSymbol $sym118$_MEMOIZATION_STATE_;
    private static final SubLSymbol $sym119$MEMOIZATION_STATE_ORIGINAL_PROCESS;
    private static final SubLSymbol $sym120$CUNWIND_PROTECT;
    private static final SubLSymbol $sym121$PROGN;
    private static final SubLSymbol $sym122$MEMOIZATION_STATE_POSSIBLY_CLEAR_ORIGINAL_PROCESS;
    private static final SubLSymbol $sym123$WITH_MEMOIZATION_STATE;
    private static final SubLString $str124$Invalid_attempt_to_reuse_memoizat;
    private static final SubLSymbol $sym125$STATE;
    private static final SubLList $list126;
    private static final SubLList $list127;
    private static final SubLSymbol $sym128$STATE;
    private static final SubLSymbol $sym129$PRINT_ONE_PER_LINE;
    private static final SubLSymbol $sym130$GATHER_MEMOIZATION_STATE_STATISTICS;
    private static final SubLSymbol $sym131$STATE;
    private static final SubLList $list132;
    private static final SubLSymbol $sym133$POSSIBLY_NEW_MEMOIZATION_STATE;
    private static final SubLSymbol $sym134$WITH_POSSIBLY_NEW_MEMOIZATION_STATE;
    private static final SubLSymbol $sym135$_MEMOIZED_FUNCTIONS_;
    private static final SubLSymbol $sym136$FBOUNDP;
    private static final SubLSymbol $sym137$DEFINE_MEMOIZED;
    private static final SubLList $list138;
    private static final SubLList $list139;
    private static final SubLSymbol $kw140$FACCESS;
    private static final SubLSymbol $kw141$MEMOIZATION_STATE_FUNCTION;
    private static final SubLSymbol $kw142$MEMOIZATION_STATE_FUNCTION_ARG_POSITIONS;
    private static final SubLList $list143;
    private static final SubLString $str144$Got_a_test_expression_of_length__;
    private static final SubLSymbol $sym145$QUOTE;
    private static final SubLSymbol $sym146$FUNCTION;
    private static final SubLString $str147$Don_t_know_how_to_convert___S_to_;
    private static final SubLSymbol $sym148$MEMOIZATION_STATE;
    private static final SubLSymbol $sym149$CACHING_STATE;
    private static final SubLSymbol $sym150$RESULTS;
    private static final SubLSymbol $sym151$DECLAIM;
    private static final SubLSymbol $sym152$FACCESS;
    private static final SubLSymbol $sym153$DEFINE;
    private static final SubLSymbol $sym154$NOTE_CACHED_FUNCTION_CALLED;
    private static final SubLSymbol $sym155$PWHEN;
    private static final SubLSymbol $sym156$CACHING_DISABLED;
    private static final SubLList $list157;
    private static final SubLSymbol $sym158$PUNLESS;
    private static final SubLSymbol $sym159$MEMOIZATION_STATE_LOOKUP;
    private static final SubLSymbol $sym160$CREATE_CACHING_STATE;
    private static final SubLSymbol $sym161$MEMOIZATION_STATE_PUT;
    private static final SubLList $list162;
    private static final SubLSymbol $sym163$NOTE_CACHED_FUNCTION_CALLED_BUT_NOT_CACHED;
    private static final SubLSymbol $sym164$MULTIPLE_VALUE_LIST;
    private static final SubLSymbol $sym165$CACHING_STATE_SET_ZERO_ARG_RESULTS;
    private static final SubLSymbol $sym166$CACHING_STATE_PUT;
    private static final SubLSymbol $sym167$CACHING_RESULTS;
    private static final SubLSymbol $sym168$SXHASH;
    private static final SubLSymbol $sym169$MEMOIZATION_STATE;
    private static final SubLSymbol $sym170$CACHING_STATE;
    private static final SubLSymbol $sym171$RESULTS;
    private static final SubLSymbol $sym172$COLLISIONS;
    private static final SubLSymbol $sym173$CACHING_STATE_LOOKUP;
    private static final SubLSymbol $sym174$CNOT;
    private static final SubLSymbol $sym175$CACHING_STATE_ENTER_MULTI_KEY_N;
    private static final SubLSymbol $sym176$LIST;
    private static final SubLSymbol $sym177$SXHASH_CALC_2;
    private static final SubLSymbol $sym178$SXHASH_CALC_3;
    private static final SubLSymbol $sym179$SXHASH_CALC_4;
    private static final SubLSymbol $sym180$SXHASH_CALC_5;
    private static final SubLSymbol $sym181$SXHASH_CALC_6;
    private static final SubLSymbol $sym182$SXHASH_CALC_7;
    private static final SubLSymbol $sym183$SXHASH_CALC_8;
    private static final SubLSymbol $sym184$SXHASH_CALC_9;
    private static final SubLSymbol $sym185$SXHASH_CALC_10;
    private static final SubLSymbol $sym186$SXHASH_CALC_N;
    private static final SubLSymbol $sym187$CACHING_STATE_GET_ZERO_ARG_RESULTS;
    private static final SubLSymbol $sym188$CDOLIST;
    private static final SubLSymbol $sym189$COLLISION;
    private static final SubLList $list190;
    private static final SubLList $list191;
    private static final SubLList $list192;
    private static final SubLSymbol $sym193$CAND;
    private static final SubLSymbol $sym194$CACHED_ARGS;
    private static final SubLList $list195;
    private static final SubLList $list196;
    private static final SubLSymbol $sym197$CACHING_STATE_LOOKUP_MULTI_KEY_N;
    private static final SubLSymbol $sym198$MAKE_SYMBOL;
    private static final SubLSymbol $sym199$NOTE_MEMOIZED_FUNCTION;
    private static final SubLSymbol $sym200$_GLOBALLY_CACHED_FUNCTIONS_;
    private static final SubLSymbol $sym201$BOUNDP;
    private static final SubLSymbol $sym202$GLOBAL_CACHING_VARIABLE_NEW;
    private static final SubLSymbol $sym203$SYMBOL_VALUE;
    private static final SubLString $str204$Clearing_all_globally_cached_func;
    private static final SubLString $str205$cdolist;
    private static final SubLInteger $int206$1000;
    private static final SubLString $str207$____clearing_large_caching_state_;
    private static final SubLSymbol $sym208$DEFINE_CACHED_NEW;
    private static final SubLList $list209;
    private static final SubLList $list210;
    private static final SubLSymbol $kw211$SIZE;
    private static final SubLSymbol $kw212$CLEAR_WHEN;
    private static final SubLList $list213;
    private static final SubLList $list214;
    private static final SubLList $list215;
    private static final SubLSymbol $sym216$CACHE_CLEAR_TRIGGER_P;
    private static final SubLSymbol $sym217$RESULTS;
    private static final SubLSymbol $sym218$CACHING_STATE;
    private static final SubLSymbol $sym219$CREATE_GLOBAL_CACHING_STATE_FOR_NAME;
    private static final SubLSymbol $sym220$SXHASH;
    private static final SubLSymbol $sym221$RESULTS;
    private static final SubLSymbol $sym222$COLLISIONS;
    private static final SubLSymbol $sym223$CACHING_STATE;
    private static final SubLSymbol $sym224$HASH_TABLE_P;
    private static final SubLString $str225$global_caching_lock_for_;
    private static final SubLString $str226$__A_RW_LOCK_;
    private static final SubLString $str227$__A_CACHING_STATE_;
    private static final SubLSymbol $sym228$DEFLEXICAL_PRIVATE;
    private static final SubLString $str229$CLEAR__A;
    private static final SubLList $list230;
    private static final SubLSymbol $kw231$HL_STORE_MODIFIED;
    private static final SubLSymbol $sym232$REGISTER_HL_STORE_CACHE_CLEAR_CALLBACK;
    private static final SubLSymbol $kw233$GENL_MT_MODIFIED;
    private static final SubLSymbol $sym234$REGISTER_MT_DEPENDENT_CACHE_CLEAR_CALLBACK;
    private static final SubLSymbol $kw235$GENL_PREDS_MODIFIED;
    private static final SubLSymbol $sym236$REGISTER_GENL_PREDS_DEPENDENT_CACHE_CLEAR_CALLBACK;
    private static final SubLSymbol $kw237$GENLS_MODIFIED;
    private static final SubLSymbol $sym238$REGISTER_GENLS_DEPENDENT_CACHE_CLEAR_CALLBACK;
    private static final SubLSymbol $kw239$ISA_MODIFIED;
    private static final SubLSymbol $sym240$REGISTER_ISA_DEPENDENT_CACHE_CLEAR_CALLBACK;
    private static final SubLSymbol $kw241$QUOTED_ISA_MODIFIED;
    private static final SubLSymbol $sym242$REGISTER_QUOTED_ISA_DEPENDENT_CACHE_CLEAR_CALLBACK;
    private static final SubLSymbol $kw243$WFF_CONSTRAINT_MODIFIED;
    private static final SubLSymbol $sym244$REGISTER_WFF_CONSTRAINT_DEPENDENT_CACHE_CLEAR_CALLBACK;
    private static final SubLSymbol $sym245$CS;
    private static final SubLList $list246;
    private static final SubLList $list247;
    private static final SubLString $str248$REMOVE__A;
    private static final SubLSymbol $sym249$CACHING_STATE_REMOVE_FUNCTION_RESULTS_WITH_ARGS;
    private static final SubLSymbol $sym250$_HL_STORE_CACHE_CLEAR_CALLBACKS_;
    private static final SubLSymbol $sym251$_MT_DEPENDENT_CACHE_CLEAR_CALLBACKS_;
    private static final SubLList $list252;
    private static final SubLSymbol $sym253$_GENL_PREDS_DEPENDENT_CACHE_CLEAR_CALLBACKS_;
    private static final SubLSymbol $sym254$_GENLS_DEPENDENT_CACHE_CLEAR_CALLBACKS_;
    private static final SubLSymbol $sym255$_WFF_CONSTRAINT_DEPENDENT_CACHE_CLEAR_CALLBACKS_;
    private static final SubLSymbol $sym256$_ISA_DEPENDENT_CACHE_CLEAR_CALLBACKS_;
    private static final SubLSymbol $sym257$_QUOTED_ISA_DEPENDENT_CACHE_CLEAR_CALLBACKS_;
    private static final SubLList $list258;
    private static final SubLList $list259;
    private static final SubLList $list260;
    private static final SubLList $list261;
    private static final SubLSymbol $sym262$_OPTIONAL;
    private static final SubLList $list263;
    private static final SubLSymbol $sym264$NOTE_GLOBALLY_CACHED_FUNCTION;
    private static final SubLString $str265$_A_INTERNAL;
    private static final SubLSymbol $sym266$DEFINE_PROTECTED;
    private static final SubLList $list267;
    private static final SubLSymbol $sym268$REGISTER_EXTERNAL_SYMBOL;
    private static final SubLSymbol $sym269$PUBLIC;
    private static final SubLSymbol $sym270$API;
    private static final SubLSymbol $sym271$REGISTER_CYC_API_FUNCTION;
    private static final SubLList $list272;
    private static final SubLList $list273;
    private static final SubLString $str274$_A_is_not_a_known_FACCESS_visibil;
    static  boolean assertionsDisabledSynth = true;
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 4331L)
    public static SubLObject note_cached_function_called(final SubLObject name) {
        final SubLObject rw_lock_var = memoization_state.$global_caching_lock$.getGlobalValue();
        SubLObject needs_to_releaseP = (SubLObject)memoization_state.NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            SubLObject count = Hashtables.gethash_without_values(name, memoization_state.$cache_monitor_hash$.getGlobalValue(), (SubLObject)memoization_state.ZERO_INTEGER);
            count = Numbers.add((SubLObject)memoization_state.ONE_INTEGER, count);
            Hashtables.sethash(name, memoization_state.$cache_monitor_hash$.getGlobalValue(), count);
        }
        finally {
            if (memoization_state.NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
        return (SubLObject)memoization_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 4597L)
    public static SubLObject note_cached_function_called_but_not_cached(final SubLObject name) {
        final SubLObject rw_lock_var = memoization_state.$global_caching_lock$.getGlobalValue();
        SubLObject needs_to_releaseP = (SubLObject)memoization_state.NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            SubLObject count = Hashtables.gethash_without_values(name, memoization_state.$cache_monitor_failure_hash$.getGlobalValue(), (SubLObject)memoization_state.ZERO_INTEGER);
            count = Numbers.add((SubLObject)memoization_state.ONE_INTEGER, count);
            Hashtables.sethash(name, memoization_state.$cache_monitor_failure_hash$.getGlobalValue(), count);
        }
        finally {
            if (memoization_state.NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
        return (SubLObject)memoization_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 4894L)
    public static SubLObject show_function_caching_results() {
        final SubLObject rw_lock_var = memoization_state.$global_caching_lock$.getGlobalValue();
        SubLObject needs_to_releaseP = (SubLObject)memoization_state.NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
            SubLObject calls = hash_table_utilities.hash_table_to_alist(memoization_state.$cache_monitor_hash$.getGlobalValue());
            SubLObject uncached_calls = hash_table_utilities.hash_table_to_alist(memoization_state.$cache_monitor_failure_hash$.getGlobalValue());
            calls = Sort.sort(calls, Symbols.symbol_function((SubLObject)memoization_state.$sym4$_), Symbols.symbol_function((SubLObject)memoization_state.$sym5$CDR));
            uncached_calls = Sort.sort(uncached_calls, Symbols.symbol_function((SubLObject)memoization_state.$sym4$_), Symbols.symbol_function((SubLObject)memoization_state.$sym5$CDR));
            SubLObject cdolist_list_var = calls;
            SubLObject call = (SubLObject)memoization_state.NIL;
            call = cdolist_list_var.first();
            while (memoization_state.NIL != cdolist_list_var) {
                PrintLow.format((SubLObject)memoization_state.T, (SubLObject)memoization_state.$str6$Cached_Function_Call___S__S___, call.first(), call.rest());
                cdolist_list_var = cdolist_list_var.rest();
                call = cdolist_list_var.first();
            }
            cdolist_list_var = uncached_calls;
            call = (SubLObject)memoization_state.NIL;
            call = cdolist_list_var.first();
            while (memoization_state.NIL != cdolist_list_var) {
                PrintLow.format((SubLObject)memoization_state.T, (SubLObject)memoization_state.$str7$Missed_Cached_Function_Call___S__, call.first(), call.rest());
                cdolist_list_var = cdolist_list_var.rest();
                call = cdolist_list_var.first();
            }
        }
        finally {
            if (memoization_state.NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
            }
        }
        return (SubLObject)memoization_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 5474L)
    public static SubLObject clear_function_caching_results() {
        final SubLObject rw_lock_var = memoization_state.$global_caching_lock$.getGlobalValue();
        SubLObject needs_to_releaseP = (SubLObject)memoization_state.NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            Hashtables.clrhash(memoization_state.$cache_monitor_hash$.getGlobalValue());
            Hashtables.clrhash(memoization_state.$cache_monitor_failure_hash$.getGlobalValue());
        }
        finally {
            if (memoization_state.NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
        return (SubLObject)memoization_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 6590L)
    public static SubLObject with_caching_mode(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)memoization_state.$list10);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)memoization_state.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)memoization_state.NIL;
        SubLObject current_$1 = (SubLObject)memoization_state.NIL;
        while (memoization_state.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)memoization_state.$list10);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)memoization_state.$list10);
            if (memoization_state.NIL == conses_high.member(current_$1, (SubLObject)memoization_state.$list11, (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED)) {
                bad = (SubLObject)memoization_state.T;
            }
            if (current_$1 == memoization_state.$kw12$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (memoization_state.NIL != bad && memoization_state.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)memoization_state.$list10);
        }
        final SubLObject disable_tail = cdestructuring_bind.property_list_member((SubLObject)memoization_state.$kw13$DISABLE, current);
        final SubLObject disable = (SubLObject)((memoization_state.NIL != disable_tail) ? conses_high.cadr(disable_tail) : memoization_state.NIL);
        final SubLObject enable_tail = cdestructuring_bind.property_list_member((SubLObject)memoization_state.$kw14$ENABLE, current);
        final SubLObject enable = (SubLObject)((memoization_state.NIL != enable_tail) ? conses_high.cadr(enable_tail) : memoization_state.NIL);
        final SubLObject body;
        current = (body = temp);
        if (memoization_state.NIL != disable && memoization_state.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && memoization_state.$kw9$ALL != disable) {
            Errors.error((SubLObject)memoization_state.$str15$DISABLE_must_be__ALL);
        }
        if (memoization_state.NIL != enable && memoization_state.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && memoization_state.$kw9$ALL != enable) {
            Errors.error((SubLObject)memoization_state.$str16$ENABLE_must_be__ALL);
        }
        return (SubLObject)ConsesLow.listS((SubLObject)memoization_state.$sym17$CLET, (SubLObject)memoization_state.$list18, ConsesLow.append((SubLObject)((memoization_state.NIL != enable) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym19$CACHING_MODE_ENABLE, enable)) : memoization_state.NIL), (SubLObject)((memoization_state.NIL != disable) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym20$CACHING_MODE_DISABLE, disable)) : memoization_state.NIL), body, (SubLObject)memoization_state.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 7454L)
    public static SubLObject caching_mode_enable(SubLObject enable) {
        if (enable == memoization_state.UNPROVIDED) {
            enable = (SubLObject)memoization_state.$kw9$ALL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (memoization_state.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && memoization_state.$kw9$ALL != enable) {
            Errors.error((SubLObject)memoization_state.$str16$ENABLE_must_be__ALL);
        }
        memoization_state.$function_caching_enabledP$.setDynamicValue((SubLObject)memoization_state.T, thread);
        memoization_state.$caching_mode_enabled$.setDynamicValue(enable, thread);
        return memoization_state.$function_caching_enabledP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 7685L)
    public static SubLObject caching_mode_disable(SubLObject disable) {
        if (disable == memoization_state.UNPROVIDED) {
            disable = (SubLObject)memoization_state.$kw9$ALL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (memoization_state.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && memoization_state.$kw9$ALL != disable) {
            Errors.error((SubLObject)memoization_state.$str15$DISABLE_must_be__ALL);
        }
        memoization_state.$function_caching_enabledP$.setDynamicValue((SubLObject)memoization_state.NIL, thread);
        memoization_state.$caching_mode_disabled$.setDynamicValue(disable, thread);
        return memoization_state.$function_caching_enabledP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 7924L)
    public static SubLObject caching_disabled(final SubLObject function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (memoization_state.NIL == memoization_state.$function_caching_enabledP$.getDynamicValue(thread)) {
            return (SubLObject)memoization_state.T;
        }
        if (memoization_state.NIL == memoization_state.$caching_mode_disabled$.getDynamicValue(thread)) {
            return (SubLObject)memoization_state.NIL;
        }
        if (memoization_state.$kw9$ALL != memoization_state.$caching_mode_disabled$.getDynamicValue(thread)) {
            return subl_promotions.memberP(function, memoization_state.$caching_mode_disabled$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)memoization_state.EQ), (SubLObject)memoization_state.UNPROVIDED);
        }
        if (memoization_state.$kw9$ALL == memoization_state.$caching_mode_enabled$.getDynamicValue(thread)) {
            return (SubLObject)memoization_state.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(memoization_state.NIL == subl_promotions.memberP(function, memoization_state.$caching_mode_enabled$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)memoization_state.EQ), (SubLObject)memoization_state.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 8579L)
    public static SubLObject sxhash_calc_n(final SubLObject args_list) {
        SubLObject sxhash = (SubLObject)memoization_state.ZERO_INTEGER;
        SubLObject composite_state = (SubLObject)memoization_state.FOUR_INTEGER;
        SubLObject composite_hash = (SubLObject)memoization_state.$int21$167;
        SubLObject cdolist_list_var = args_list;
        SubLObject arg = (SubLObject)memoization_state.NIL;
        arg = cdolist_list_var.first();
        while (memoization_state.NIL != cdolist_list_var) {
            composite_state = utilities_macros.sxhash_update_state(composite_state);
            composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg), composite_state), composite_hash);
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        sxhash = composite_hash;
        return sxhash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 8982L)
    public static SubLObject sxhash_calc_10(final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10) {
        SubLObject sxhash = (SubLObject)memoization_state.ZERO_INTEGER;
        SubLObject composite_state = (SubLObject)memoization_state.FOUR_INTEGER;
        SubLObject composite_hash = (SubLObject)memoization_state.$int21$167;
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg1), composite_state), composite_hash);
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg2), composite_state), composite_hash);
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg3), composite_state), composite_hash);
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg4), composite_state), composite_hash);
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg5), composite_state), composite_hash);
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg6), composite_state), composite_hash);
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg7), composite_state), composite_hash);
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg8), composite_state), composite_hash);
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg9), composite_state), composite_hash);
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = (sxhash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg10), composite_state), composite_hash));
        return sxhash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 9628L)
    public static SubLObject sxhash_calc_9(final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9) {
        SubLObject sxhash = (SubLObject)memoization_state.ZERO_INTEGER;
        SubLObject composite_state = (SubLObject)memoization_state.FOUR_INTEGER;
        SubLObject composite_hash = (SubLObject)memoization_state.$int21$167;
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg1), composite_state), composite_hash);
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg2), composite_state), composite_hash);
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg3), composite_state), composite_hash);
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg4), composite_state), composite_hash);
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg5), composite_state), composite_hash);
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg6), composite_state), composite_hash);
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg7), composite_state), composite_hash);
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg8), composite_state), composite_hash);
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = (sxhash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg9), composite_state), composite_hash));
        return sxhash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 10225L)
    public static SubLObject sxhash_calc_8(final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8) {
        SubLObject sxhash = (SubLObject)memoization_state.ZERO_INTEGER;
        SubLObject composite_state = (SubLObject)memoization_state.FOUR_INTEGER;
        SubLObject composite_hash = (SubLObject)memoization_state.$int21$167;
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg1), composite_state), composite_hash);
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg2), composite_state), composite_hash);
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg3), composite_state), composite_hash);
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg4), composite_state), composite_hash);
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg5), composite_state), composite_hash);
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg6), composite_state), composite_hash);
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg7), composite_state), composite_hash);
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = (sxhash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg8), composite_state), composite_hash));
        return sxhash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 10775L)
    public static SubLObject sxhash_calc_7(final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7) {
        SubLObject sxhash = (SubLObject)memoization_state.ZERO_INTEGER;
        SubLObject composite_state = (SubLObject)memoization_state.FOUR_INTEGER;
        SubLObject composite_hash = (SubLObject)memoization_state.$int21$167;
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg1), composite_state), composite_hash);
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg2), composite_state), composite_hash);
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg3), composite_state), composite_hash);
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg4), composite_state), composite_hash);
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg5), composite_state), composite_hash);
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg6), composite_state), composite_hash);
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = (sxhash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg7), composite_state), composite_hash));
        return sxhash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 11278L)
    public static SubLObject sxhash_calc_6(final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6) {
        SubLObject sxhash = (SubLObject)memoization_state.ZERO_INTEGER;
        SubLObject composite_state = (SubLObject)memoization_state.FOUR_INTEGER;
        SubLObject composite_hash = (SubLObject)memoization_state.$int21$167;
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg1), composite_state), composite_hash);
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg2), composite_state), composite_hash);
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg3), composite_state), composite_hash);
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg4), composite_state), composite_hash);
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg5), composite_state), composite_hash);
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = (sxhash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg6), composite_state), composite_hash));
        return sxhash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 11734L)
    public static SubLObject sxhash_calc_5(final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5) {
        SubLObject sxhash = (SubLObject)memoization_state.ZERO_INTEGER;
        SubLObject composite_state = (SubLObject)memoization_state.FOUR_INTEGER;
        SubLObject composite_hash = (SubLObject)memoization_state.$int21$167;
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg1), composite_state), composite_hash);
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg2), composite_state), composite_hash);
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg3), composite_state), composite_hash);
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg4), composite_state), composite_hash);
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = (sxhash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg5), composite_state), composite_hash));
        return sxhash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 12143L)
    public static SubLObject sxhash_calc_4(final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4) {
        SubLObject sxhash = (SubLObject)memoization_state.ZERO_INTEGER;
        SubLObject composite_state = (SubLObject)memoization_state.FOUR_INTEGER;
        SubLObject composite_hash = (SubLObject)memoization_state.$int21$167;
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg1), composite_state), composite_hash);
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg2), composite_state), composite_hash);
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg3), composite_state), composite_hash);
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = (sxhash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg4), composite_state), composite_hash));
        return sxhash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 12505L)
    public static SubLObject sxhash_calc_3(final SubLObject arg1, final SubLObject arg2, final SubLObject arg3) {
        SubLObject sxhash = (SubLObject)memoization_state.ZERO_INTEGER;
        SubLObject composite_state = (SubLObject)memoization_state.FOUR_INTEGER;
        SubLObject composite_hash = (SubLObject)memoization_state.$int21$167;
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg1), composite_state), composite_hash);
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg2), composite_state), composite_hash);
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = (sxhash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg3), composite_state), composite_hash));
        return sxhash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 12820L)
    public static SubLObject sxhash_calc_2(final SubLObject arg1, final SubLObject arg2) {
        SubLObject sxhash = (SubLObject)memoization_state.ZERO_INTEGER;
        SubLObject composite_state = (SubLObject)memoization_state.FOUR_INTEGER;
        SubLObject composite_hash = (SubLObject)memoization_state.$int21$167;
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg1), composite_state), composite_hash);
        composite_state = utilities_macros.sxhash_update_state(composite_state);
        composite_hash = (sxhash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash(arg2), composite_state), composite_hash));
        return sxhash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 13088L)
    public static SubLObject possibly_with_memoization_state_writer_lock(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)memoization_state.$list22);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject state = (SubLObject)memoization_state.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)memoization_state.$list22);
        state = current.first();
        current = current.rest();
        if (memoization_state.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym17$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym23$LOCK, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym24$MEMOIZATION_STATE_LOCK, state))), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym25$PIF, (SubLObject)memoization_state.$sym23$LOCK, (SubLObject)ConsesLow.listS((SubLObject)memoization_state.$sym17$CLET, (SubLObject)memoization_state.$list26, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym27$WITH_WRITER_LOCK, (SubLObject)memoization_state.$list28, (SubLObject)ConsesLow.listS((SubLObject)memoization_state.$sym29$CSETQ, (SubLObject)memoization_state.$sym30$RESULT, ConsesLow.append(body, (SubLObject)memoization_state.NIL))), (SubLObject)memoization_state.$list31), reader.bq_cons((SubLObject)memoization_state.$sym32$RET, ConsesLow.append(body, (SubLObject)memoization_state.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)memoization_state.$list22);
        return (SubLObject)memoization_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 13649L)
    public static SubLObject possibly_with_memoization_state_reader_lock(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)memoization_state.$list22);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject state = (SubLObject)memoization_state.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)memoization_state.$list22);
        state = current.first();
        current = current.rest();
        if (memoization_state.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym17$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym23$LOCK, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym24$MEMOIZATION_STATE_LOCK, state))), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym25$PIF, (SubLObject)memoization_state.$sym23$LOCK, (SubLObject)ConsesLow.listS((SubLObject)memoization_state.$sym17$CLET, (SubLObject)memoization_state.$list26, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym33$WITH_READER_LOCK, (SubLObject)memoization_state.$list28, (SubLObject)ConsesLow.listS((SubLObject)memoization_state.$sym29$CSETQ, (SubLObject)memoization_state.$sym30$RESULT, ConsesLow.append(body, (SubLObject)memoization_state.NIL))), (SubLObject)memoization_state.$list31), reader.bq_cons((SubLObject)memoization_state.$sym32$RET, ConsesLow.append(body, (SubLObject)memoization_state.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)memoization_state.$list22);
        return (SubLObject)memoization_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 14211L)
    public static SubLObject possibly_with_caching_state_writer_lock(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)memoization_state.$list34);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject lock = (SubLObject)memoization_state.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)memoization_state.$list34);
        lock = current.first();
        current = current.rest();
        if (memoization_state.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym25$PIF, lock, (SubLObject)ConsesLow.listS((SubLObject)memoization_state.$sym17$CLET, (SubLObject)memoization_state.$list26, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym27$WITH_WRITER_LOCK, (SubLObject)ConsesLow.list(lock), (SubLObject)ConsesLow.listS((SubLObject)memoization_state.$sym29$CSETQ, (SubLObject)memoization_state.$sym30$RESULT, ConsesLow.append(body, (SubLObject)memoization_state.NIL))), (SubLObject)memoization_state.$list31), reader.bq_cons((SubLObject)memoization_state.$sym32$RET, ConsesLow.append(body, (SubLObject)memoization_state.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)memoization_state.$list34);
        return (SubLObject)memoization_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 14702L)
    public static SubLObject possibly_with_caching_state_reader_lock(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)memoization_state.$list34);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject lock = (SubLObject)memoization_state.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)memoization_state.$list34);
        lock = current.first();
        current = current.rest();
        if (memoization_state.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym25$PIF, lock, (SubLObject)ConsesLow.listS((SubLObject)memoization_state.$sym17$CLET, (SubLObject)memoization_state.$list26, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym33$WITH_READER_LOCK, (SubLObject)ConsesLow.list(lock), (SubLObject)ConsesLow.listS((SubLObject)memoization_state.$sym29$CSETQ, (SubLObject)memoization_state.$sym30$RESULT, ConsesLow.append(body, (SubLObject)memoization_state.NIL))), (SubLObject)memoization_state.$list31), reader.bq_cons((SubLObject)memoization_state.$sym32$RET, ConsesLow.append(body, (SubLObject)memoization_state.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)memoization_state.$list34);
        return (SubLObject)memoization_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 15806L)
    public static SubLObject caching_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_caching_state(v_object, stream, (SubLObject)memoization_state.ZERO_INTEGER);
        return (SubLObject)memoization_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 15806L)
    public static SubLObject caching_state_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $caching_state_native.class) ? memoization_state.T : memoization_state.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 15806L)
    public static SubLObject caching_state_store(final SubLObject v_object) {
        assert memoization_state.NIL != caching_state_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 15806L)
    public static SubLObject caching_state_zero_arg_results(final SubLObject v_object) {
        assert memoization_state.NIL != caching_state_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 15806L)
    public static SubLObject caching_state_lock(final SubLObject v_object) {
        assert memoization_state.NIL != caching_state_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 15806L)
    public static SubLObject caching_state_capacity(final SubLObject v_object) {
        assert memoization_state.NIL != caching_state_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 15806L)
    public static SubLObject caching_state_func_symbol(final SubLObject v_object) {
        assert memoization_state.NIL != caching_state_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 15806L)
    public static SubLObject caching_state_test(final SubLObject v_object) {
        assert memoization_state.NIL != caching_state_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 15806L)
    public static SubLObject caching_state_args_length(final SubLObject v_object) {
        assert memoization_state.NIL != caching_state_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 15806L)
    public static SubLObject _csetf_caching_state_store(final SubLObject v_object, final SubLObject value) {
        assert memoization_state.NIL != caching_state_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 15806L)
    public static SubLObject _csetf_caching_state_zero_arg_results(final SubLObject v_object, final SubLObject value) {
        assert memoization_state.NIL != caching_state_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 15806L)
    public static SubLObject _csetf_caching_state_lock(final SubLObject v_object, final SubLObject value) {
        assert memoization_state.NIL != caching_state_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 15806L)
    public static SubLObject _csetf_caching_state_capacity(final SubLObject v_object, final SubLObject value) {
        assert memoization_state.NIL != caching_state_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 15806L)
    public static SubLObject _csetf_caching_state_func_symbol(final SubLObject v_object, final SubLObject value) {
        assert memoization_state.NIL != caching_state_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 15806L)
    public static SubLObject _csetf_caching_state_test(final SubLObject v_object, final SubLObject value) {
        assert memoization_state.NIL != caching_state_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 15806L)
    public static SubLObject _csetf_caching_state_args_length(final SubLObject v_object, final SubLObject value) {
        assert memoization_state.NIL != caching_state_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 15806L)
    public static SubLObject make_caching_state(SubLObject arglist) {
        if (arglist == memoization_state.UNPROVIDED) {
            arglist = (SubLObject)memoization_state.NIL;
        }
        final SubLObject v_new = (SubLObject)new $caching_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)memoization_state.NIL, next = arglist; memoization_state.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)memoization_state.$kw59$STORE)) {
                _csetf_caching_state_store(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)memoization_state.$kw60$ZERO_ARG_RESULTS)) {
                _csetf_caching_state_zero_arg_results(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)memoization_state.$kw61$LOCK)) {
                _csetf_caching_state_lock(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)memoization_state.$kw62$CAPACITY)) {
                _csetf_caching_state_capacity(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)memoization_state.$kw63$FUNC_SYMBOL)) {
                _csetf_caching_state_func_symbol(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)memoization_state.$kw64$TEST)) {
                _csetf_caching_state_test(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)memoization_state.$kw65$ARGS_LENGTH)) {
                _csetf_caching_state_args_length(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)memoization_state.$str66$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 15806L)
    public static SubLObject visit_defstruct_caching_state(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)memoization_state.$kw67$BEGIN, (SubLObject)memoization_state.$sym68$MAKE_CACHING_STATE, (SubLObject)memoization_state.SEVEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)memoization_state.$kw69$SLOT, (SubLObject)memoization_state.$kw59$STORE, caching_state_store(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)memoization_state.$kw69$SLOT, (SubLObject)memoization_state.$kw60$ZERO_ARG_RESULTS, caching_state_zero_arg_results(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)memoization_state.$kw69$SLOT, (SubLObject)memoization_state.$kw61$LOCK, caching_state_lock(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)memoization_state.$kw69$SLOT, (SubLObject)memoization_state.$kw62$CAPACITY, caching_state_capacity(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)memoization_state.$kw69$SLOT, (SubLObject)memoization_state.$kw63$FUNC_SYMBOL, caching_state_func_symbol(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)memoization_state.$kw69$SLOT, (SubLObject)memoization_state.$kw64$TEST, caching_state_test(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)memoization_state.$kw69$SLOT, (SubLObject)memoization_state.$kw65$ARGS_LENGTH, caching_state_args_length(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)memoization_state.$kw70$END, (SubLObject)memoization_state.$sym68$MAKE_CACHING_STATE, (SubLObject)memoization_state.SEVEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 15806L)
    public static SubLObject visit_defstruct_object_caching_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_caching_state(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 16154L)
    public static SubLObject create_caching_state(final SubLObject lock, final SubLObject func_symbol, final SubLObject func_args_length, SubLObject capacity, SubLObject test, SubLObject initial_size) {
        if (capacity == memoization_state.UNPROVIDED) {
            capacity = (SubLObject)memoization_state.NIL;
        }
        if (test == memoization_state.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)memoization_state.EQL);
        }
        if (initial_size == memoization_state.UNPROVIDED) {
            initial_size = (SubLObject)memoization_state.ZERO_INTEGER;
        }
        final SubLObject cs = make_caching_state((SubLObject)memoization_state.UNPROVIDED);
        enforceType(initial_size, memoization_state.$sym72$NON_NEGATIVE_INTEGER_P);
        if (memoization_state.NIL != capacity) {
            enforceType(capacity, memoization_state.$sym73$POSITIVE_INTEGER_P);
        }
        enforceType(func_symbol, memoization_state.$sym74$SYMBOLP);
        if (test.isSymbol()) {
            test = Symbols.symbol_function(test);
        }
        enforceType(test, memoization_state.$sym75$FUNCTION_SPEC_P);
        if (memoization_state.NIL != capacity) {
            _csetf_caching_state_store(cs, cache.new_cache(capacity, func_args_length.eql((SubLObject)memoization_state.ONE_INTEGER) ? test : Symbols.symbol_function((SubLObject)memoization_state.EQL)));
        }
        else {
            _csetf_caching_state_store(cs, dictionary.new_dictionary(func_args_length.eql((SubLObject)memoization_state.ONE_INTEGER) ? test : Symbols.symbol_function((SubLObject)memoization_state.EQL), initial_size));
        }
        _csetf_caching_state_lock(cs, lock);
        _csetf_caching_state_capacity(cs, capacity);
        _csetf_caching_state_func_symbol(cs, func_symbol);
        _csetf_caching_state_test(cs, test);
        _csetf_caching_state_args_length(cs, func_args_length);
        _csetf_caching_state_zero_arg_results(cs, memoization_state.$memoized_item_not_found$.getGlobalValue());
        return cs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 17345L)
    public static SubLObject print_caching_state_internal(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)memoization_state.$str76$__caching_state_function___A_lock, new SubLObject[] { caching_state_func_symbol(v_object), caching_state_lock(v_object), caching_state_capacity(v_object), caching_state_test(v_object) });
        PrintLow.format(stream, (SubLObject)memoization_state.$str77$_);
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 18052L)
    public static SubLObject print_caching_state(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        enforceType(v_object, memoization_state.$sym37$CACHING_STATE_P);
        if (memoization_state.NIL != caching_state_lock(v_object)) {
            SubLObject result = (SubLObject)memoization_state.NIL;
            final SubLObject rw_lock_var = caching_state_lock(v_object);
            SubLObject needs_to_releaseP = (SubLObject)memoization_state.NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                result = print_caching_state_internal(v_object, stream, depth);
            }
            finally {
                if (memoization_state.NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                }
            }
            return result;
        }
        return print_caching_state_internal(v_object, stream, depth);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 18292L)
    public static SubLObject caching_state_get_zero_arg_results_internal(final SubLObject caching_state) {
        return caching_state_zero_arg_results(caching_state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 18427L)
    public static SubLObject caching_state_get_zero_arg_results(final SubLObject caching_state, SubLObject lock) {
        if (lock == memoization_state.UNPROVIDED) {
            lock = caching_state_lock(caching_state);
        }
        if (memoization_state.NIL != lock) {
            SubLObject result = (SubLObject)memoization_state.NIL;
            final SubLObject rw_lock_var = lock;
            SubLObject needs_to_releaseP = (SubLObject)memoization_state.NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                result = caching_state_zero_arg_results(caching_state);
            }
            finally {
                if (memoization_state.NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                }
            }
            return result;
        }
        return caching_state_zero_arg_results(caching_state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 18664L)
    public static SubLObject caching_state_set_zero_arg_results_internal(final SubLObject caching_state, final SubLObject val) {
        _csetf_caching_state_zero_arg_results(caching_state, val);
        return (SubLObject)memoization_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 18821L)
    public static SubLObject caching_state_set_zero_arg_results(final SubLObject caching_state, final SubLObject val, SubLObject lock) {
        if (lock == memoization_state.UNPROVIDED) {
            lock = caching_state_lock(caching_state);
        }
        if (memoization_state.NIL != lock) {
            SubLObject result = (SubLObject)memoization_state.NIL;
            final SubLObject rw_lock_var = lock;
            SubLObject needs_to_releaseP = (SubLObject)memoization_state.NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                result = caching_state_set_zero_arg_results_internal(caching_state, val);
            }
            finally {
                if (memoization_state.NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                }
            }
            return result;
        }
        return caching_state_set_zero_arg_results_internal(caching_state, val);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 19079L)
    public static SubLObject caching_state_lookup_internal(final SubLObject caching_state, final SubLObject key, SubLObject v_default) {
        if (v_default == memoization_state.UNPROVIDED) {
            v_default = memoization_state.$memoized_item_not_found$.getGlobalValue();
        }
        if (memoization_state.NIL != caching_state_capacity(caching_state)) {
            return cache.cache_get_without_values(caching_state_store(caching_state), key, v_default);
        }
        return dictionary.dictionary_lookup_without_values(caching_state_store(caching_state), key, v_default);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 19432L)
    public static SubLObject caching_state_lookup(final SubLObject caching_state, final SubLObject key, SubLObject v_default) {
        if (v_default == memoization_state.UNPROVIDED) {
            v_default = memoization_state.$memoized_item_not_found$.getGlobalValue();
        }
        if (memoization_state.NIL != caching_state_lock(caching_state)) {
            SubLObject result = (SubLObject)memoization_state.NIL;
            final SubLObject rw_lock_var = caching_state_lock(caching_state);
            SubLObject needs_to_releaseP = (SubLObject)memoization_state.NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                result = caching_state_lookup_internal(caching_state, key, v_default);
            }
            finally {
                if (memoization_state.NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                }
            }
            return result;
        }
        return caching_state_lookup_internal(caching_state, key, v_default);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 19694L)
    public static SubLObject caching_state_put_internal(final SubLObject caching_state, final SubLObject key, final SubLObject value) {
        if (memoization_state.NIL != caching_state_capacity(caching_state)) {
            return cache.cache_set(caching_state_store(caching_state), key, value);
        }
        return dictionary.dictionary_enter(caching_state_store(caching_state), key, value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 19963L)
    public static SubLObject caching_state_put(final SubLObject caching_state, final SubLObject key, final SubLObject value, SubLObject lock) {
        if (lock == memoization_state.UNPROVIDED) {
            lock = caching_state_lock(caching_state);
        }
        if (memoization_state.NIL != lock) {
            SubLObject result = (SubLObject)memoization_state.NIL;
            final SubLObject rw_lock_var = lock;
            SubLObject needs_to_releaseP = (SubLObject)memoization_state.NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                result = caching_state_put_internal(caching_state, key, value);
            }
            finally {
                if (memoization_state.NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                }
            }
            return result;
        }
        return caching_state_put_internal(caching_state, key, value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 20199L)
    public static SubLObject caching_state_clear_internal(final SubLObject caching_state) {
        if (memoization_state.NIL != caching_state_capacity(caching_state)) {
            cache.cache_clear(caching_state_store(caching_state));
        }
        else {
            dictionary.clear_dictionary(caching_state_store(caching_state));
        }
        _csetf_caching_state_zero_arg_results(caching_state, memoization_state.$memoized_item_not_found$.getGlobalValue());
        return (SubLObject)memoization_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 20525L)
    public static SubLObject caching_state_clear(final SubLObject caching_state) {
        if (memoization_state.NIL == caching_state) {
            return (SubLObject)memoization_state.NIL;
        }
        enforceType(caching_state, memoization_state.$sym37$CACHING_STATE_P);
        if (memoization_state.NIL != caching_state_lock(caching_state)) {
            SubLObject result = (SubLObject)memoization_state.NIL;
            final SubLObject rw_lock_var = caching_state_lock(caching_state);
            SubLObject needs_to_releaseP = (SubLObject)memoization_state.NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                result = caching_state_clear_internal(caching_state);
            }
            finally {
                if (memoization_state.NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                }
            }
            return result;
        }
        return caching_state_clear_internal(caching_state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 20807L)
    public static SubLObject caching_state_get_capacity(final SubLObject caching_state) {
        return caching_state_capacity(caching_state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 20955L)
    public static SubLObject caching_state_get_func_symbol(final SubLObject caching_state) {
        return caching_state_func_symbol(caching_state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 21109L)
    public static SubLObject caching_state_get_test(final SubLObject caching_state) {
        return caching_state_test(caching_state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 21249L)
    public static SubLObject caching_state_keys_internal(final SubLObject caching_state) {
        if (memoization_state.NIL != caching_state_capacity(caching_state)) {
            return cache.cache_keys(caching_state_store(caching_state));
        }
        return dictionary.dictionary_keys(caching_state_store(caching_state));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 21489L)
    public static SubLObject caching_state_keys(final SubLObject caching_state, SubLObject lock) {
        if (lock == memoization_state.UNPROVIDED) {
            lock = caching_state_lock(caching_state);
        }
        if (memoization_state.NIL != lock) {
            SubLObject result = (SubLObject)memoization_state.NIL;
            final SubLObject rw_lock_var = lock;
            SubLObject needs_to_releaseP = (SubLObject)memoization_state.NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                result = caching_state_keys_internal(caching_state);
            }
            finally {
                if (memoization_state.NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                }
            }
            return result;
        }
        return caching_state_keys_internal(caching_state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 21707L)
    public static SubLObject caching_state_size_internal(final SubLObject caching_state) {
        if (memoization_state.NIL != caching_state_capacity(caching_state)) {
            return cache.cache_size(caching_state_store(caching_state));
        }
        return dictionary.dictionary_length(caching_state_store(caching_state));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 21949L)
    public static SubLObject caching_state_size(final SubLObject caching_state, SubLObject lock) {
        if (lock == memoization_state.UNPROVIDED) {
            lock = caching_state_lock(caching_state);
        }
        if (memoization_state.NIL != lock) {
            SubLObject result = (SubLObject)memoization_state.NIL;
            final SubLObject rw_lock_var = lock;
            SubLObject needs_to_releaseP = (SubLObject)memoization_state.NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                result = caching_state_size_internal(caching_state);
            }
            finally {
                if (memoization_state.NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                }
            }
            return result;
        }
        return caching_state_size_internal(caching_state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 22167L)
    public static SubLObject caching_state_size_robust(final SubLObject caching_state, SubLObject lock) {
        if (lock == memoization_state.UNPROVIDED) {
            lock = (SubLObject)memoization_state.NIL;
        }
        if (memoization_state.NIL != caching_state) {
            return caching_state_size(caching_state, (memoization_state.NIL != lock) ? lock : caching_state_lock(caching_state));
        }
        return (SubLObject)memoization_state.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 22373L)
    public static SubLObject caching_state_remove_internal(final SubLObject caching_state, final SubLObject item) {
        if (memoization_state.NIL != caching_state_capacity(caching_state)) {
            return cache.cache_remove(caching_state_store(caching_state), item);
        }
        return dictionary.dictionary_remove(caching_state_store(caching_state), item);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 22635L)
    public static SubLObject caching_state_remove(final SubLObject caching_state, final SubLObject item, SubLObject lock) {
        if (lock == memoization_state.UNPROVIDED) {
            lock = caching_state_lock(caching_state);
        }
        if (memoization_state.NIL != lock) {
            SubLObject result = (SubLObject)memoization_state.NIL;
            final SubLObject rw_lock_var = lock;
            SubLObject needs_to_releaseP = (SubLObject)memoization_state.NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                result = caching_state_remove_internal(caching_state, item);
            }
            finally {
                if (memoization_state.NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                }
            }
            return result;
        }
        return caching_state_remove_internal(caching_state, item);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 22867L)
    public static SubLObject caching_state_remove_function_results_with_args_internal(final SubLObject caching_state, SubLObject args_list, SubLObject sxhash) {
        if (sxhash == memoization_state.UNPROVIDED) {
            sxhash = (SubLObject)memoization_state.NIL;
        }
        final SubLObject args_count = Sequences.length(args_list);
        if (args_count.eql((SubLObject)memoization_state.ZERO_INTEGER)) {
            _csetf_caching_state_zero_arg_results(caching_state, memoization_state.$memoized_item_not_found$.getGlobalValue());
            return (SubLObject)memoization_state.NIL;
        }
        if (args_count.eql((SubLObject)memoization_state.ONE_INTEGER)) {
            caching_state_remove_internal(caching_state, args_list.first());
            return (SubLObject)memoization_state.NIL;
        }
        if (memoization_state.NIL == sxhash) {
            sxhash = sxhash_calc_n(args_list);
        }
        SubLObject cur;
        final SubLObject collisions = cur = caching_state_lookup_internal(caching_state, sxhash, (SubLObject)memoization_state.UNPROVIDED);
        SubLObject prev = (SubLObject)memoization_state.NIL;
        final SubLObject args_length = Sequences.length(args_list);
        final SubLObject args_length_minus_one = Numbers.subtract(args_length, (SubLObject)memoization_state.ONE_INTEGER);
        final SubLObject test = caching_state_test(caching_state);
        if (collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            return (SubLObject)memoization_state.NIL;
        }
        while (memoization_state.NIL != cur) {
            SubLObject current;
            final SubLObject datum = current = cur.first();
            SubLObject cached_args = (SubLObject)memoization_state.NIL;
            SubLObject result = (SubLObject)memoization_state.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)memoization_state.$list78);
            cached_args = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)memoization_state.$list78);
            result = current.first();
            current = current.rest();
            if (memoization_state.NIL == current) {
                SubLObject i;
                for (i = (SubLObject)memoization_state.NIL, i = (SubLObject)memoization_state.ZERO_INTEGER; i.numL(args_length); i = Numbers.add(i, (SubLObject)memoization_state.ONE_INTEGER)) {
                    if (memoization_state.NIL != Functions.funcall(test, args_list.first(), cached_args.first())) {
                        if (i.eql(args_length_minus_one)) {
                            if (cached_args.rest() == memoization_state.NIL) {
                                if (memoization_state.NIL != prev) {
                                    return ConsesLow.rplacd(prev, cur.rest());
                                }
                                if (memoization_state.NIL != cur.rest()) {
                                    return caching_state_put_internal(caching_state, sxhash, cur.rest());
                                }
                                return caching_state_remove_internal(caching_state, sxhash);
                            }
                        }
                        else {
                            args_list = args_list.rest();
                            cached_args = cached_args.rest();
                        }
                    }
                    else {
                        i = args_length;
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)memoization_state.$list78);
            }
            prev = cur;
            cur = cur.rest();
        }
        return (SubLObject)memoization_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 24712L)
    public static SubLObject caching_state_remove_function_results_with_args(final SubLObject caching_state, final SubLObject args_list, SubLObject sxhash, SubLObject lock) {
        if (sxhash == memoization_state.UNPROVIDED) {
            sxhash = sxhash_calc_n(args_list);
        }
        if (lock == memoization_state.UNPROVIDED) {
            lock = (SubLObject)((memoization_state.NIL != caching_state) ? caching_state_lock(caching_state) : memoization_state.NIL);
        }
        if (memoization_state.NIL == caching_state) {
            return (SubLObject)memoization_state.NIL;
        }
        if (memoization_state.NIL != lock) {
            SubLObject result = (SubLObject)memoization_state.NIL;
            final SubLObject rw_lock_var = lock;
            SubLObject needs_to_releaseP = (SubLObject)memoization_state.NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                result = caching_state_remove_function_results_with_args_internal(caching_state, args_list, sxhash);
            }
            finally {
                if (memoization_state.NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                }
            }
            return result;
        }
        return caching_state_remove_function_results_with_args_internal(caching_state, args_list, sxhash);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 25115L)
    public static SubLObject caching_state_clone_internal(final SubLObject caching_state) {
        enforceType(caching_state, memoization_state.$sym37$CACHING_STATE_P);
        final SubLObject cloned_state = create_caching_state(caching_state_lock(caching_state), caching_state_func_symbol(caching_state), caching_state_args_length(caching_state), caching_state_get_test(caching_state), caching_state_capacity(caching_state), caching_state_size_internal(caching_state));
        if (memoization_state.NIL != caching_state_capacity(caching_state)) {
            _csetf_caching_state_store(cloned_state, cache.cache_copy(caching_state_store(caching_state)));
        }
        else {
            _csetf_caching_state_store(cloned_state, dictionary_utilities.copy_dictionary(caching_state_store(caching_state)));
        }
        _csetf_caching_state_zero_arg_results(cloned_state, caching_state_zero_arg_results(caching_state));
        SubLObject cdolist_list_var = caching_state_keys_internal(cloned_state);
        SubLObject key = (SubLObject)memoization_state.NIL;
        key = cdolist_list_var.first();
        while (memoization_state.NIL != cdolist_list_var) {
            final SubLObject value = caching_state_lookup_internal(cloned_state, key, (SubLObject)memoization_state.UNPROVIDED);
            final SubLObject new_value = conses_high.copy_list(value);
            caching_state_put_internal(cloned_state, key, new_value);
            cdolist_list_var = cdolist_list_var.rest();
            key = cdolist_list_var.first();
        }
        return cloned_state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 26410L)
    public static SubLObject caching_state_store_as_dictionary(final SubLObject caching_state) {
        enforceType(caching_state, memoization_state.$sym37$CACHING_STATE_P);
        if (memoization_state.NIL != caching_state_lock(caching_state)) {
            SubLObject result = (SubLObject)memoization_state.NIL;
            final SubLObject rw_lock_var = caching_state_lock(caching_state);
            SubLObject needs_to_releaseP = (SubLObject)memoization_state.NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                result = ((memoization_state.NIL != caching_state_capacity(caching_state)) ? cache_utilities.cache_to_dictionary(caching_state_store(caching_state)) : dictionary_utilities.copy_dictionary(caching_state_store(caching_state)));
            }
            finally {
                if (memoization_state.NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                }
            }
            return result;
        }
        return (memoization_state.NIL != caching_state_capacity(caching_state)) ? cache_utilities.cache_to_dictionary(caching_state_store(caching_state)) : dictionary_utilities.copy_dictionary(caching_state_store(caching_state));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 26890L)
    public static SubLObject caching_state_clone(final SubLObject caching_state, SubLObject lock) {
        if (lock == memoization_state.UNPROVIDED) {
            lock = caching_state_lock(caching_state);
        }
        if (memoization_state.NIL != lock) {
            SubLObject result = (SubLObject)memoization_state.NIL;
            final SubLObject rw_lock_var = lock;
            SubLObject needs_to_releaseP = (SubLObject)memoization_state.NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                result = caching_state_clone_internal(caching_state);
            }
            finally {
                if (memoization_state.NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                }
            }
            return result;
        }
        return caching_state_clone_internal(caching_state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 27110L)
    public static SubLObject caching_state_multi_key_n_is_cached(final SubLObject caching_state, final SubLObject args_list) {
        if (memoization_state.NIL == caching_state) {
            return (SubLObject)memoization_state.NIL;
        }
        assert memoization_state.NIL != caching_state_p(caching_state) : caching_state;
        assert memoization_state.NIL != Types.listp(args_list) : args_list;
        return (SubLObject)SubLObjectFactory.makeBoolean(!memoization_state.$memoized_item_not_found$.getGlobalValue().eql(caching_state_lookup_multi_key_n(caching_state, args_list, (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 27502L)
    public static SubLObject caching_state_lookup_multi_key_n(final SubLObject caching_state, SubLObject args_list, SubLObject sxhash, SubLObject collisions) {
        if (sxhash == memoization_state.UNPROVIDED) {
            sxhash = (SubLObject)memoization_state.$kw80$RECALC;
        }
        if (collisions == memoization_state.UNPROVIDED) {
            collisions = (SubLObject)memoization_state.$kw80$RECALC;
        }
        if (memoization_state.NIL == caching_state) {
            return Values.values(memoization_state.$memoized_item_not_found$.getGlobalValue(), (SubLObject)memoization_state.NIL, (SubLObject)memoization_state.NIL);
        }
        if (memoization_state.NIL == args_list) {
            return Values.values(caching_state_zero_arg_results(caching_state), (SubLObject)memoization_state.NIL, (SubLObject)memoization_state.NIL);
        }
        if (memoization_state.NIL == args_list.rest()) {
            return Values.values(caching_state_lookup(caching_state, args_list.first(), memoization_state.$memoized_item_not_found$.getGlobalValue()), (SubLObject)memoization_state.NIL, (SubLObject)memoization_state.NIL);
        }
        if (sxhash == memoization_state.$kw80$RECALC) {
            sxhash = sxhash_calc_n(args_list);
        }
        if (collisions == memoization_state.$kw80$RECALC) {
            collisions = caching_state_lookup(caching_state, sxhash, (SubLObject)memoization_state.UNPROVIDED);
        }
        final SubLObject test = caching_state_test(caching_state);
        final SubLObject args_length = Sequences.length(args_list);
        final SubLObject args_length_minus_one = Numbers.subtract(args_length, (SubLObject)memoization_state.ONE_INTEGER);
        if (!collisions.isList()) {
            return Values.values(memoization_state.$memoized_item_not_found$.getGlobalValue(), sxhash, (SubLObject)memoization_state.NIL);
        }
        SubLObject cdolist_list_var = collisions;
        SubLObject collision = (SubLObject)memoization_state.NIL;
        collision = cdolist_list_var.first();
        while (memoization_state.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = collision;
            SubLObject cached_args = (SubLObject)memoization_state.NIL;
            SubLObject results = (SubLObject)memoization_state.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)memoization_state.$list81);
            cached_args = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)memoization_state.$list81);
            results = current.first();
            current = current.rest();
            if (memoization_state.NIL == current) {
                SubLObject i;
                for (i = (SubLObject)memoization_state.NIL, i = (SubLObject)memoization_state.ZERO_INTEGER; i.numL(args_length); i = Numbers.add(i, (SubLObject)memoization_state.ONE_INTEGER)) {
                    if (memoization_state.NIL != Functions.funcall(test, args_list.first(), cached_args.first())) {
                        if (i.eql(args_length_minus_one)) {
                            if (cached_args.rest() == memoization_state.NIL) {
                                return Values.values(results, sxhash, collisions);
                            }
                        }
                        else {
                            args_list = args_list.rest();
                            cached_args = cached_args.rest();
                        }
                    }
                    else {
                        i = args_length;
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)memoization_state.$list81);
            }
            cdolist_list_var = cdolist_list_var.rest();
            collision = cdolist_list_var.first();
        }
        return Values.values(memoization_state.$memoized_item_not_found$.getGlobalValue(), sxhash, collisions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 29024L)
    public static SubLObject caching_state_lookup_multi_key_1(final SubLObject caching_state, final SubLObject arg1) {
        return caching_state_lookup(caching_state, arg1, (SubLObject)memoization_state.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 29148L)
    public static SubLObject caching_state_enter_multi_key_n(final SubLObject caching_state, final SubLObject sxhash, SubLObject collisions, final SubLObject results, final SubLObject args_list) {
        if (!collisions.isList()) {
            collisions = (SubLObject)memoization_state.NIL;
        }
        if (memoization_state.NIL == args_list) {
            _csetf_caching_state_zero_arg_results(caching_state, results);
            return (SubLObject)memoization_state.NIL;
        }
        collisions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(args_list, results), collisions);
        caching_state_put(caching_state, sxhash, collisions, (SubLObject)memoization_state.UNPROVIDED);
        return (SubLObject)memoization_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 30077L)
    public static SubLObject memoization_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_memoization_state(v_object, stream, (SubLObject)memoization_state.ZERO_INTEGER);
        return (SubLObject)memoization_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 30077L)
    public static SubLObject memoization_state_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $memoization_state_native.class) ? memoization_state.T : memoization_state.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 30077L)
    public static SubLObject memoization_state_store(final SubLObject v_object) {
        assert memoization_state.NIL != memoization_state_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 30077L)
    public static SubLObject memoization_state_current_process(final SubLObject v_object) {
        assert memoization_state.NIL != memoization_state_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 30077L)
    public static SubLObject memoization_state_lock(final SubLObject v_object) {
        assert memoization_state.NIL != memoization_state_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 30077L)
    public static SubLObject memoization_state_name(final SubLObject v_object) {
        assert memoization_state.NIL != memoization_state_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 30077L)
    public static SubLObject memoization_state_should_clone(final SubLObject v_object) {
        assert memoization_state.NIL != memoization_state_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 30077L)
    public static SubLObject _csetf_memoization_state_store(final SubLObject v_object, final SubLObject value) {
        assert memoization_state.NIL != memoization_state_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 30077L)
    public static SubLObject _csetf_memoization_state_current_process(final SubLObject v_object, final SubLObject value) {
        assert memoization_state.NIL != memoization_state_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 30077L)
    public static SubLObject _csetf_memoization_state_lock(final SubLObject v_object, final SubLObject value) {
        assert memoization_state.NIL != memoization_state_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 30077L)
    public static SubLObject _csetf_memoization_state_name(final SubLObject v_object, final SubLObject value) {
        assert memoization_state.NIL != memoization_state_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 30077L)
    public static SubLObject _csetf_memoization_state_should_clone(final SubLObject v_object, final SubLObject value) {
        assert memoization_state.NIL != memoization_state_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 30077L)
    public static SubLObject make_memoization_state(SubLObject arglist) {
        if (arglist == memoization_state.UNPROVIDED) {
            arglist = (SubLObject)memoization_state.NIL;
        }
        final SubLObject v_new = (SubLObject)new $memoization_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)memoization_state.NIL, next = arglist; memoization_state.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)memoization_state.$kw59$STORE)) {
                _csetf_memoization_state_store(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)memoization_state.$kw100$CURRENT_PROCESS)) {
                _csetf_memoization_state_current_process(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)memoization_state.$kw61$LOCK)) {
                _csetf_memoization_state_lock(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)memoization_state.$kw101$NAME)) {
                _csetf_memoization_state_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)memoization_state.$kw102$SHOULD_CLONE)) {
                _csetf_memoization_state_should_clone(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)memoization_state.$str66$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 30077L)
    public static SubLObject visit_defstruct_memoization_state(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)memoization_state.$kw67$BEGIN, (SubLObject)memoization_state.$sym103$MAKE_MEMOIZATION_STATE, (SubLObject)memoization_state.FIVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)memoization_state.$kw69$SLOT, (SubLObject)memoization_state.$kw59$STORE, memoization_state_store(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)memoization_state.$kw69$SLOT, (SubLObject)memoization_state.$kw100$CURRENT_PROCESS, memoization_state_current_process(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)memoization_state.$kw69$SLOT, (SubLObject)memoization_state.$kw61$LOCK, memoization_state_lock(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)memoization_state.$kw69$SLOT, (SubLObject)memoization_state.$kw101$NAME, memoization_state_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)memoization_state.$kw69$SLOT, (SubLObject)memoization_state.$kw102$SHOULD_CLONE, memoization_state_should_clone(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)memoization_state.$kw70$END, (SubLObject)memoization_state.$sym103$MAKE_MEMOIZATION_STATE, (SubLObject)memoization_state.FIVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 30077L)
    public static SubLObject visit_defstruct_object_memoization_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_memoization_state(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 30370L)
    public static SubLObject create_memoization_state(SubLObject name, SubLObject lock, SubLObject should_clone, SubLObject test) {
        if (name == memoization_state.UNPROVIDED) {
            name = (SubLObject)memoization_state.NIL;
        }
        if (lock == memoization_state.UNPROVIDED) {
            lock = (SubLObject)memoization_state.NIL;
        }
        if (should_clone == memoization_state.UNPROVIDED) {
            should_clone = (SubLObject)memoization_state.NIL;
        }
        if (test == memoization_state.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)memoization_state.EQL);
        }
        final SubLObject ms = make_memoization_state((SubLObject)memoization_state.UNPROVIDED);
        if (memoization_state.NIL != name) {
            enforceType(name, memoization_state.$sym105$STRINGP);
        }
        if (memoization_state.NIL != lock) {
            enforceType(lock, memoization_state.$sym106$READER_WRITER_LOCK_P);
        }
        if (test.isSymbol()) {
            test = Symbols.symbol_function(test);
        }
        enforceType(test, memoization_state.$sym107$FUNCTIONP);
        if (memoization_state.NIL != should_clone && memoization_state.NIL == lock) {
            lock = ReadWriteLocks.new_rw_lock((SubLObject)memoization_state.$str108$memoization_state_clone_lock);
        }
        _csetf_memoization_state_name(ms, name);
        _csetf_memoization_state_lock(ms, lock);
        _csetf_memoization_state_store(ms, dictionary.new_dictionary(test, (SubLObject)memoization_state.UNPROVIDED));
        _csetf_memoization_state_current_process(ms, (SubLObject)memoization_state.NIL);
        _csetf_memoization_state_should_clone(ms, should_clone);
        return ms;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 31183L)
    public static SubLObject new_memoization_state(SubLObject name, SubLObject lock, SubLObject should_clone, SubLObject test) {
        if (name == memoization_state.UNPROVIDED) {
            name = (SubLObject)memoization_state.NIL;
        }
        if (lock == memoization_state.UNPROVIDED) {
            lock = (SubLObject)memoization_state.NIL;
        }
        if (should_clone == memoization_state.UNPROVIDED) {
            should_clone = (SubLObject)memoization_state.NIL;
        }
        if (test == memoization_state.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)memoization_state.EQL);
        }
        return create_memoization_state(name, lock, should_clone, test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 31336L)
    public static SubLObject print_memoization_state_internal(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)memoization_state.$str109$__memoization_state_name____A__lo, new SubLObject[] { memoization_state_name(v_object), memoization_state_lock(v_object), memoization_state_should_clone(v_object), memoization_state_current_process(v_object), memoization_state_store(v_object) });
        PrintLow.format(stream, (SubLObject)memoization_state.$str77$_);
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 31935L)
    public static SubLObject print_memoization_state(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLObject lock = memoization_state_lock(v_object);
        if (memoization_state.NIL != lock) {
            SubLObject result = (SubLObject)memoization_state.NIL;
            final SubLObject rw_lock_var = lock;
            SubLObject needs_to_releaseP = (SubLObject)memoization_state.NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                result = print_memoization_state_internal(v_object, stream, depth);
            }
            finally {
                if (memoization_state.NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                }
            }
            return result;
        }
        return print_memoization_state_internal(v_object, stream, depth);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 32126L)
    public static SubLObject memoization_state_lookup_internal(final SubLObject v_memoization_state, final SubLObject key, SubLObject v_default) {
        if (v_default == memoization_state.UNPROVIDED) {
            v_default = (SubLObject)memoization_state.NIL;
        }
        return dictionary.dictionary_lookup_without_values(memoization_state_store(v_memoization_state), key, v_default);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 32325L)
    public static SubLObject memoization_state_lookup(final SubLObject v_memoization_state, final SubLObject key, SubLObject v_default) {
        if (v_default == memoization_state.UNPROVIDED) {
            v_default = (SubLObject)memoization_state.NIL;
        }
        final SubLObject lock = memoization_state_lock(v_memoization_state);
        if (memoization_state.NIL != lock) {
            SubLObject result = (SubLObject)memoization_state.NIL;
            final SubLObject rw_lock_var = lock;
            SubLObject needs_to_releaseP = (SubLObject)memoization_state.NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                result = memoization_state_lookup_internal(v_memoization_state, key, v_default);
            }
            finally {
                if (memoization_state.NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                }
            }
            return result;
        }
        return memoization_state_lookup_internal(v_memoization_state, key, v_default);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 32568L)
    public static SubLObject memoization_state_get_caching_state_for_function(final SubLObject v_memoization_state, final SubLObject func_symbol) {
        if (memoization_state.NIL == v_memoization_state) {
            return (SubLObject)memoization_state.NIL;
        }
        assert memoization_state.NIL != memoization_state_p(v_memoization_state) : v_memoization_state;
        assert memoization_state.NIL != Types.symbolp(func_symbol) : func_symbol;
        return memoization_state_lookup(v_memoization_state, func_symbol, (SubLObject)memoization_state.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 32863L)
    public static SubLObject memoization_state_put_internal(final SubLObject v_memoization_state, final SubLObject key, final SubLObject value) {
        return dictionary.dictionary_enter(memoization_state_store(v_memoization_state), key, value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 33025L)
    public static SubLObject memoization_state_put(final SubLObject v_memoization_state, final SubLObject key, final SubLObject value) {
        final SubLObject lock = memoization_state_lock(v_memoization_state);
        if (memoization_state.NIL != lock) {
            SubLObject result = (SubLObject)memoization_state.NIL;
            final SubLObject rw_lock_var = lock;
            SubLObject needs_to_releaseP = (SubLObject)memoization_state.NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                result = memoization_state_put_internal(v_memoization_state, key, value);
            }
            finally {
                if (memoization_state.NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                }
            }
            return result;
        }
        return memoization_state_put_internal(v_memoization_state, key, value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 33242L)
    public static SubLObject memoization_state_remove_internal(final SubLObject v_memoization_state, final SubLObject key) {
        return dictionary.dictionary_remove(memoization_state_store(v_memoization_state), key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 33396L)
    public static SubLObject memoization_state_remove(final SubLObject v_memoization_state, final SubLObject key) {
        final SubLObject lock = memoization_state_lock(v_memoization_state);
        if (memoization_state.NIL != lock) {
            SubLObject result = (SubLObject)memoization_state.NIL;
            final SubLObject rw_lock_var = lock;
            SubLObject needs_to_releaseP = (SubLObject)memoization_state.NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                result = memoization_state_remove_internal(v_memoization_state, key);
            }
            finally {
                if (memoization_state.NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                }
            }
            return result;
        }
        return memoization_state_remove_internal(v_memoization_state, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 33607L)
    public static SubLObject memoization_state_clear_internal(final SubLObject v_memoization_state) {
        return dictionary.clear_dictionary(memoization_state_store(v_memoization_state));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 33751L)
    public static SubLObject memoization_state_clear(final SubLObject v_memoization_state) {
        if (memoization_state.NIL == v_memoization_state) {
            return (SubLObject)memoization_state.NIL;
        }
        final SubLObject lock = memoization_state_lock(v_memoization_state);
        if (memoization_state.NIL != lock) {
            SubLObject result = (SubLObject)memoization_state.NIL;
            final SubLObject rw_lock_var = lock;
            SubLObject needs_to_releaseP = (SubLObject)memoization_state.NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                result = memoization_state_clear_internal(v_memoization_state);
            }
            finally {
                if (memoization_state.NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                }
            }
            return result;
        }
        return memoization_state_clear_internal(v_memoization_state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 33993L)
    public static SubLObject memoization_state_get_test(final SubLObject v_memoization_state) {
        return dictionary.dictionary_test(memoization_state_store(v_memoization_state));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 34168L)
    public static SubLObject memoization_state_get_lock(final SubLObject v_memoization_state) {
        return memoization_state_lock(v_memoization_state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 34326L)
    public static SubLObject memoization_state_get_name(final SubLObject v_memoization_state) {
        return memoization_state_name(v_memoization_state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 34482L)
    public static SubLObject memoization_state_get_should_clone(final SubLObject v_memoization_state) {
        return memoization_state_should_clone(v_memoization_state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 34654L)
    public static SubLObject memoization_state_get_current_process_internal(final SubLObject v_memoization_state) {
        return memoization_state_current_process(v_memoization_state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 34803L)
    public static SubLObject memoization_state_get_current_process(final SubLObject v_memoization_state) {
        final SubLObject lock = memoization_state_lock(v_memoization_state);
        if (memoization_state.NIL != lock) {
            SubLObject result = (SubLObject)memoization_state.NIL;
            final SubLObject rw_lock_var = lock;
            SubLObject needs_to_releaseP = (SubLObject)memoization_state.NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                result = memoization_state_get_current_process_internal(v_memoization_state);
            }
            finally {
                if (memoization_state.NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                }
            }
            return result;
        }
        return memoization_state_get_current_process_internal(v_memoization_state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 35032L)
    public static SubLObject memoization_state_keys_internal(final SubLObject v_memoization_state) {
        return dictionary.dictionary_keys(memoization_state_store(v_memoization_state));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 35174L)
    public static SubLObject memoization_state_keys(final SubLObject v_memoization_state) {
        final SubLObject lock = memoization_state_lock(v_memoization_state);
        if (memoization_state.NIL != lock) {
            SubLObject result = (SubLObject)memoization_state.NIL;
            final SubLObject rw_lock_var = lock;
            SubLObject needs_to_releaseP = (SubLObject)memoization_state.NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                result = memoization_state_keys_internal(v_memoization_state);
            }
            finally {
                if (memoization_state.NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                }
            }
            return result;
        }
        return memoization_state_keys_internal(v_memoization_state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 35373L)
    public static SubLObject memoization_state_set_current_process_internal(final SubLObject v_memoization_state, final SubLObject current_process) {
        _csetf_memoization_state_current_process(v_memoization_state, current_process);
        return v_memoization_state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 35582L)
    public static SubLObject memoization_state_set_current_process(final SubLObject v_memoization_state, final SubLObject current_process) {
        final SubLObject lock = memoization_state_lock(v_memoization_state);
        if (memoization_state.NIL != lock) {
            SubLObject result = (SubLObject)memoization_state.NIL;
            final SubLObject rw_lock_var = lock;
            SubLObject needs_to_releaseP = (SubLObject)memoization_state.NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                result = memoization_state_set_current_process_internal(v_memoization_state, current_process);
            }
            finally {
                if (memoization_state.NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                }
            }
            return result;
        }
        return memoization_state_set_current_process_internal(v_memoization_state, current_process);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 35843L)
    public static SubLObject memoization_state_clone(final SubLObject v_memoization_state) {
        enforceType(v_memoization_state, memoization_state.$sym83$MEMOIZATION_STATE_P);
        SubLObject cloned_state = (SubLObject)memoization_state.NIL;
        final SubLObject rw_lock_var = memoization_state_lock(v_memoization_state);
        SubLObject needs_to_releaseP = (SubLObject)memoization_state.NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
            cloned_state = create_memoization_state(Sequences.cconcatenate((SubLObject)memoization_state.$str110$Clone__, memoization_state_name(v_memoization_state)), (SubLObject)memoization_state.NIL, (SubLObject)memoization_state.NIL, Symbols.symbol_function((SubLObject)memoization_state.EQL));
        }
        finally {
            if (memoization_state.NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
            }
        }
        Errors.error((SubLObject)memoization_state.$str111$Need_to_implement_dictionary_copy);
        _csetf_memoization_state_store(cloned_state, (SubLObject)memoization_state.NIL);
        SubLObject cdolist_list_var = memoization_state_keys_internal(cloned_state);
        SubLObject key = (SubLObject)memoization_state.NIL;
        key = cdolist_list_var.first();
        while (memoization_state.NIL != cdolist_list_var) {
            final SubLObject value = memoization_state_lookup_internal(cloned_state, key, (SubLObject)memoization_state.UNPROVIDED);
            final SubLObject new_value = caching_state_clone(value, (SubLObject)memoization_state.UNPROVIDED);
            memoization_state_put_internal(cloned_state, key, new_value);
            cdolist_list_var = cdolist_list_var.rest();
            key = cdolist_list_var.first();
        }
        return cloned_state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 36778L)
    public static SubLObject memoization_state_merge_cloned_state(final SubLObject cloned_state, final SubLObject orig_state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(cloned_state, memoization_state.$sym83$MEMOIZATION_STATE_P);
        enforceType(orig_state, memoization_state.$sym83$MEMOIZATION_STATE_P);
        final SubLObject rw_lock_var = memoization_state_lock(orig_state);
        SubLObject needs_to_releaseP = (SubLObject)memoization_state.NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            SubLObject cdolist_list_var = memoization_state_keys_internal(cloned_state);
            SubLObject the_function_symbol = (SubLObject)memoization_state.NIL;
            the_function_symbol = cdolist_list_var.first();
            while (memoization_state.NIL != cdolist_list_var) {
                final SubLObject cloned_caching_state = memoization_state_lookup(cloned_state, the_function_symbol, (SubLObject)memoization_state.UNPROVIDED);
                final SubLObject orig_caching_state = memoization_state_lookup(orig_state, the_function_symbol, (SubLObject)memoization_state.UNPROVIDED);
                if (memoization_state.NIL != orig_caching_state) {
                    SubLObject cdolist_list_var_$2 = caching_state_keys_internal(cloned_state);
                    SubLObject sxhash = (SubLObject)memoization_state.NIL;
                    sxhash = cdolist_list_var_$2.first();
                    while (memoization_state.NIL != cdolist_list_var_$2) {
                        final SubLObject prev_cloned_results = caching_state_lookup_internal(cloned_caching_state, sxhash, (SubLObject)memoization_state.UNPROVIDED);
                        SubLObject orig_results = caching_state_lookup_internal(orig_caching_state, sxhash, (SubLObject)memoization_state.UNPROVIDED);
                        final SubLObject arg_list_cache = Hashtables.make_hash_table(Numbers.multiply((SubLObject)memoization_state.TWO_INTEGER, Sequences.length(prev_cloned_results)), Symbols.symbol_function((SubLObject)memoization_state.EQUAL), (SubLObject)memoization_state.UNPROVIDED);
                        if (orig_results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
                            caching_state_put_internal(orig_caching_state, sxhash, prev_cloned_results);
                        }
                        else {
                            SubLObject cdolist_list_var_$3 = orig_results;
                            SubLObject orig_result = (SubLObject)memoization_state.NIL;
                            orig_result = cdolist_list_var_$3.first();
                            while (memoization_state.NIL != cdolist_list_var_$3) {
                                thread.resetMultipleValues();
                                final SubLObject prev_args = orig_result;
                                final SubLObject prev_result = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                Hashtables.sethash(prev_args, arg_list_cache, prev_result);
                                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                                orig_result = cdolist_list_var_$3.first();
                            }
                            SubLObject cdolist_list_var_$4 = prev_cloned_results;
                            SubLObject prev_cloned_result = (SubLObject)memoization_state.NIL;
                            prev_cloned_result = cdolist_list_var_$4.first();
                            while (memoization_state.NIL != cdolist_list_var_$4) {
                                thread.resetMultipleValues();
                                final SubLObject prev_args = prev_cloned_result;
                                final SubLObject prev_result = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (memoization_state.NIL != Hashtables.gethash(arg_list_cache, prev_args, (SubLObject)memoization_state.UNPROVIDED)) {
                                    Errors.error((SubLObject)memoization_state.$str112$implement_me_in__memoization_stat);
                                    orig_results = Sequences.remove_if(Symbols.symbol_function((SubLObject)memoization_state.$sym113$CACHING_STATE_RESULTS_HAS_ARGS_), orig_results, (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED);
                                }
                                orig_results = (SubLObject)ConsesLow.cons(prev_cloned_result, orig_results);
                                cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                                prev_cloned_result = cdolist_list_var_$4.first();
                            }
                            caching_state_put_internal(orig_caching_state, sxhash, orig_results);
                        }
                        cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                        sxhash = cdolist_list_var_$2.first();
                    }
                }
                else {
                    memoization_state_put_internal(orig_state, the_function_symbol, caching_state_clone(cloned_caching_state, (SubLObject)memoization_state.UNPROVIDED));
                }
                cdolist_list_var = cdolist_list_var.rest();
                the_function_symbol = cdolist_list_var.first();
            }
        }
        finally {
            if (memoization_state.NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
        return (SubLObject)memoization_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 39120L)
    public static SubLObject caching_state_results_has_argsP(final SubLObject caching_state_results, final SubLObject args) {
        return Equality.equal(args, caching_state_results.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 39287L)
    public static SubLObject gather_memoization_state_statistics(final SubLObject v_memoization_state) {
        enforceType(v_memoization_state, memoization_state.$sym83$MEMOIZATION_STATE_P);
        final SubLObject lock = memoization_state_lock(v_memoization_state);
        if (memoization_state.NIL != lock) {
            SubLObject result = (SubLObject)memoization_state.NIL;
            final SubLObject rw_lock_var = lock;
            SubLObject needs_to_releaseP = (SubLObject)memoization_state.NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                result = gather_memoization_state_statistics_unlocked(v_memoization_state);
            }
            finally {
                if (memoization_state.NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                }
            }
            return result;
        }
        return gather_memoization_state_statistics_unlocked(v_memoization_state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 39704L)
    public static SubLObject gather_memoization_state_statistics_unlocked(final SubLObject v_memoization_state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stats = (SubLObject)memoization_state.NIL;
        SubLObject cdolist_list_var = memoization_state_keys_internal(v_memoization_state);
        SubLObject the_function_symbol = (SubLObject)memoization_state.NIL;
        the_function_symbol = cdolist_list_var.first();
        while (memoization_state.NIL != cdolist_list_var) {
            final SubLObject caching_state = memoization_state_lookup(v_memoization_state, the_function_symbol, (SubLObject)memoization_state.UNPROVIDED);
            final SubLObject store = caching_state_store(caching_state);
            thread.resetMultipleValues();
            final SubLObject size = gather_caching_state_store_statistics(store);
            final SubLObject capacity = thread.secondMultipleValue();
            thread.resetMultipleValues();
            stats = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(the_function_symbol, size, capacity), stats);
            cdolist_list_var = cdolist_list_var.rest();
            the_function_symbol = cdolist_list_var.first();
        }
        return Sort.sort(stats, (SubLObject)memoization_state.$sym4$_, (SubLObject)memoization_state.$sym114$SECOND);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 40249L)
    public static SubLObject gather_caching_state_store_statistics(final SubLObject store) {
        if (memoization_state.NIL != map_utilities.map_p(store)) {
            return Values.values(map_utilities.map_size(store), map_utilities.map_size(store));
        }
        if (memoization_state.NIL != cache.cache_p(store)) {
            return Values.values(cache.cache_size(store), cache.cache_capacity(store));
        }
        Errors.error((SubLObject)memoization_state.$str115$Dont_know_how_to_determine_size_a, (SubLObject)Types.type_of(store));
        return (SubLObject)memoization_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 40947L)
    public static SubLObject current_memoization_state() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return memoization_state.$memoization_state$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 41079L)
    public static SubLObject with_memoization_state(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)memoization_state.$list22);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject state = (SubLObject)memoization_state.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)memoization_state.$list22);
        state = current.first();
        current = current.rest();
        if (memoization_state.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject original_memoization_process = (SubLObject)memoization_state.$sym116$ORIGINAL_MEMOIZATION_PROCESS;
            final SubLObject local_state = (SubLObject)memoization_state.$sym117$LOCAL_STATE;
            return (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym17$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(local_state, state), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym118$_MEMOIZATION_STATE_, local_state), (SubLObject)ConsesLow.list(original_memoization_process, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym119$MEMOIZATION_STATE_ORIGINAL_PROCESS, local_state))), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym120$CUNWIND_PROTECT, reader.bq_cons((SubLObject)memoization_state.$sym121$PROGN, ConsesLow.append(body, (SubLObject)memoization_state.NIL)), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym122$MEMOIZATION_STATE_POSSIBLY_CLEAR_ORIGINAL_PROCESS, local_state, original_memoization_process)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)memoization_state.$list22);
        return (SubLObject)memoization_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 42114L)
    public static SubLObject memoization_state_original_process(final SubLObject local_state) {
        SubLObject original_process = (SubLObject)memoization_state.NIL;
        if (memoization_state.NIL != local_state && memoization_state.NIL == memoization_state_lock(local_state)) {
            original_process = memoization_state_get_current_process_internal(local_state);
            final SubLObject current_proc = Threads.current_process();
            if (memoization_state.NIL == original_process) {
                memoization_state_set_current_process_internal(local_state, current_proc);
            }
            else if (!original_process.eql(current_proc)) {
                Errors.warn((SubLObject)memoization_state.$str124$Invalid_attempt_to_reuse_memoizat);
            }
        }
        return original_process;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 42916L)
    public static SubLObject memoization_state_possibly_clear_original_process(final SubLObject local_state, final SubLObject original_process) {
        if (memoization_state.NIL != local_state && memoization_state.NIL == original_process) {
            memoization_state_set_current_process_internal(local_state, (SubLObject)memoization_state.NIL);
        }
        return (SubLObject)memoization_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 43188L)
    public static SubLObject possibly_clone_memoization_state(final SubLObject v_memoization_state) {
        return v_memoization_state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 45044L)
    public static SubLObject possibly_merge_back_memoization_state(final SubLObject cloned_state, final SubLObject orig_state, final SubLObject old_state) {
        return (SubLObject)memoization_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 45534L)
    public static SubLObject with_new_memoization_state(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject state = (SubLObject)memoization_state.$sym125$STATE;
        return (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym17$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(state, (SubLObject)memoization_state.$list126)), (SubLObject)ConsesLow.listS((SubLObject)memoization_state.$sym123$WITH_MEMOIZATION_STATE, (SubLObject)ConsesLow.list(state), ConsesLow.append(body, (SubLObject)memoization_state.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 45785L)
    public static SubLObject with_new_profiled_memoization_state(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)memoization_state.$list127);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream = (SubLObject)memoization_state.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)memoization_state.$list127);
        stream = current.first();
        current = current.rest();
        if (memoization_state.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject state = (SubLObject)memoization_state.$sym128$STATE;
            return (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym17$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(state, (SubLObject)memoization_state.$list126)), (SubLObject)ConsesLow.listS((SubLObject)memoization_state.$sym123$WITH_MEMOIZATION_STATE, (SubLObject)ConsesLow.list(state), ConsesLow.append(body, (SubLObject)memoization_state.NIL)), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym129$PRINT_ONE_PER_LINE, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym130$GATHER_MEMOIZATION_STATE_STATISTICS, state), stream));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)memoization_state.$list127);
        return (SubLObject)memoization_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 46095L)
    public static SubLObject with_possibly_new_memoization_state(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject state = (SubLObject)memoization_state.$sym131$STATE;
        return (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym17$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(state, (SubLObject)memoization_state.$list132)), (SubLObject)ConsesLow.listS((SubLObject)memoization_state.$sym123$WITH_MEMOIZATION_STATE, (SubLObject)ConsesLow.list(state), ConsesLow.append(body, (SubLObject)memoization_state.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 46416L)
    public static SubLObject possibly_new_memoization_state() {
        SubLObject current = current_memoization_state();
        if (memoization_state.NIL == memoization_state_p(current)) {
            current = create_memoization_state((SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED);
        }
        return current;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 46680L)
    public static SubLObject clear_memoization(final SubLObject state, final SubLObject function_symbol) {
        assert memoization_state.NIL != memoization_state_p(state) : state;
        assert memoization_state.NIL != Types.symbolp(function_symbol) : function_symbol;
        final SubLObject caching_state = memoization_state_lookup(state, function_symbol, (SubLObject)memoization_state.UNPROVIDED);
        if (memoization_state.NIL != caching_state) {
            caching_state_clear(caching_state);
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 47159L)
    public static SubLObject clear_current_memoization(final SubLObject function_symbol) {
        assert memoization_state.NIL != Types.symbolp(function_symbol) : function_symbol;
        final SubLObject state = current_memoization_state();
        return clear_memoization(state, function_symbol);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 47566L)
    public static SubLObject clear_all_memoization(final SubLObject state) {
        assert memoization_state.NIL != memoization_state_p(state) : state;
        memoization_state_clear(state);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 47819L)
    public static SubLObject clear_all_current_memoization() {
        final SubLObject state = current_memoization_state();
        if (memoization_state.NIL != state) {
            return clear_all_memoization(state);
        }
        return (SubLObject)memoization_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 48101L)
    public static SubLObject memoization_state_remove_function_results_with_args(final SubLObject state, final SubLObject function_symbol, final SubLObject args_list) {
        if (memoization_state.NIL != memoization_state_p(state) && function_symbol.isSymbol()) {
            final SubLObject caching_state = memoization_state_lookup(state, function_symbol, (SubLObject)memoization_state.UNPROVIDED);
            if (memoization_state.NIL != caching_state) {
                return caching_state_remove_function_results_with_args(caching_state, args_list, (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED);
            }
        }
        return (SubLObject)memoization_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 49022L)
    public static SubLObject current_memoization_state_remove_function_results_with_args(final SubLObject function_symbol, final SubLObject args_list) {
        final SubLObject state = current_memoization_state();
        if (memoization_state.NIL != state) {
            return memoization_state_remove_function_results_with_args(state, function_symbol, args_list);
        }
        return (SubLObject)memoization_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 49557L)
    public static SubLObject note_memoized_function(final SubLObject function_symbol) {
        if (memoization_state.NIL == conses_high.member(function_symbol, memoization_state.$memoized_functions$.getGlobalValue(), Symbols.symbol_function((SubLObject)memoization_state.EQL), Symbols.symbol_function((SubLObject)memoization_state.IDENTITY))) {
            memoization_state.$memoized_functions$.setGlobalValue((SubLObject)ConsesLow.cons(function_symbol, memoization_state.$memoized_functions$.getGlobalValue()));
        }
        return function_symbol;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 49811L)
    public static SubLObject memoized_functions() {
        return list_utilities.remove_if_not((SubLObject)memoization_state.$sym136$FBOUNDP, memoization_state.$memoized_functions$.getGlobalValue(), (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 49935L)
    public static SubLObject define_memoized(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)memoization_state.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)memoization_state.$list138);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)memoization_state.$list138);
        final SubLObject temp = current.rest();
        final SubLObject args;
        current = (args = current.first());
        current = temp;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)memoization_state.$list138);
        final SubLObject temp_$5 = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)memoization_state.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)memoization_state.NIL;
        SubLObject current_$6 = (SubLObject)memoization_state.NIL;
        while (memoization_state.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)memoization_state.$list138);
            current_$6 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)memoization_state.$list138);
            if (memoization_state.NIL == conses_high.member(current_$6, (SubLObject)memoization_state.$list139, (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED)) {
                bad = (SubLObject)memoization_state.T;
            }
            if (current_$6 == memoization_state.$kw12$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (memoization_state.NIL != bad && memoization_state.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)memoization_state.$list138);
        }
        final SubLObject test_tail = cdestructuring_bind.property_list_member((SubLObject)memoization_state.$kw64$TEST, current);
        final SubLObject test = (SubLObject)((memoization_state.NIL != test_tail) ? conses_high.cadr(test_tail) : memoization_state.NIL);
        final SubLObject capacity_tail = cdestructuring_bind.property_list_member((SubLObject)memoization_state.$kw62$CAPACITY, current);
        final SubLObject capacity = (SubLObject)((memoization_state.NIL != capacity_tail) ? conses_high.cadr(capacity_tail) : memoization_state.NIL);
        final SubLObject faccess_tail = cdestructuring_bind.property_list_member((SubLObject)memoization_state.$kw140$FACCESS, current);
        final SubLObject faccess = (SubLObject)((memoization_state.NIL != faccess_tail) ? conses_high.cadr(faccess_tail) : memoization_state.NIL);
        final SubLObject memoization_state_function_tail = cdestructuring_bind.property_list_member((SubLObject)memoization_state.$kw141$MEMOIZATION_STATE_FUNCTION, current);
        final SubLObject memoization_state_function = (SubLObject)((memoization_state.NIL != memoization_state_function_tail) ? conses_high.cadr(memoization_state_function_tail) : memoization_state.NIL);
        final SubLObject memoization_state_function_arg_positions_tail = cdestructuring_bind.property_list_member((SubLObject)memoization_state.$kw142$MEMOIZATION_STATE_FUNCTION_ARG_POSITIONS, current);
        final SubLObject memoization_state_function_arg_positions = (SubLObject)((memoization_state.NIL != memoization_state_function_arg_positions_tail) ? conses_high.cadr(memoization_state_function_arg_positions_tail) : memoization_state.NIL);
        final SubLObject body;
        current = (body = temp_$5);
        return define_memoized_internal(name, args, test, capacity, faccess, memoization_state_function, memoization_state_function_arg_positions, body);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 50949L)
    public static SubLObject macro_test_to_run_time_test(final SubLObject test) {
        if (memoization_state.NIL == test) {
            return (SubLObject)memoization_state.$list143;
        }
        if (test.isCons()) {
            if (Sequences.length(test).numG((SubLObject)memoization_state.TWO_INTEGER)) {
                Errors.error((SubLObject)memoization_state.$str144$Got_a_test_expression_of_length__, Sequences.length(test), test);
            }
            if (memoization_state.$sym145$QUOTE == test.first()) {
                return test;
            }
            if (memoization_state.$sym146$FUNCTION == test.first()) {
                return (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym145$QUOTE, hash_table_utilities.hash_test_to_symbol(Eval.eval(test)));
            }
            Errors.error((SubLObject)memoization_state.$str147$Don_t_know_how_to_convert___S_to_, test);
            return (SubLObject)memoization_state.NIL;
        }
        else {
            if (test.isFunction()) {
                return (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym145$QUOTE, hash_table_utilities.hash_test_to_symbol(Eval.eval(test)));
            }
            return (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym145$QUOTE, test);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 51612L)
    public static SubLObject define_memoized_internal(final SubLObject name, final SubLObject args, final SubLObject test, final SubLObject capacity, final SubLObject faccess, final SubLObject memoization_state_function, final SubLObject memoization_state_function_arg_positions, final SubLObject body) {
        final SubLObject formal_args = define_formal_args(args);
        final SubLObject pcase_var = Sequences.length(formal_args);
        if (pcase_var.eql((SubLObject)memoization_state.ZERO_INTEGER)) {
            return define_memoized_internal_0_or_1(name, args, test, capacity, faccess, memoization_state_function, memoization_state_function_arg_positions, body);
        }
        if (pcase_var.eql((SubLObject)memoization_state.ONE_INTEGER)) {
            return define_memoized_internal_0_or_1(name, args, test, capacity, faccess, memoization_state_function, memoization_state_function_arg_positions, body);
        }
        return define_memoized_internal_n(name, args, test, capacity, faccess, memoization_state_function, memoization_state_function_arg_positions, body);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 52337L)
    public static SubLObject define_memoized_internal_0_or_1(final SubLObject name, final SubLObject args, final SubLObject test, final SubLObject capacity, final SubLObject faccess, final SubLObject memoization_state_function, final SubLObject memoization_state_function_arg_positions, final SubLObject body) {
        final SubLObject v_memoization_state = (SubLObject)memoization_state.$sym148$MEMOIZATION_STATE;
        final SubLObject caching_state = (SubLObject)memoization_state.$sym149$CACHING_STATE;
        final SubLObject results = (SubLObject)memoization_state.$sym150$RESULTS;
        final SubLObject internal_function = caching_internal_function(name);
        final SubLObject internal_test = macro_test_to_run_time_test(test);
        final SubLObject formal_args = define_formal_args(args);
        return (SubLObject)ConsesLow.listS((SubLObject)memoization_state.$sym121$PROGN, note_memoized_function_code(name), caching_internal_function_code(internal_function, args, body), ConsesLow.append((SubLObject)((memoization_state.NIL != faccess) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym151$DECLAIM, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym152$FACCESS, faccess, name))) : memoization_state.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)memoization_state.$sym153$DEFINE, name, ConsesLow.append(args, (SubLObject)memoization_state.NIL), ConsesLow.append((SubLObject)((memoization_state.NIL != memoization_state.$caching_mode_should_monitor$.getGlobalValue()) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym154$NOTE_CACHED_FUNCTION_CALLED, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym145$QUOTE, name))) : memoization_state.NIL), (SubLObject)((memoization_state.NIL != memoization_state.$allow_function_caching_to_be_disabled$.getGlobalValue()) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym156$CACHING_DISABLED, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym145$QUOTE, name)), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym32$RET, reader.bq_cons(internal_function, ConsesLow.append(formal_args, (SubLObject)memoization_state.NIL))))) : memoization_state.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym17$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(v_memoization_state, lookup_memoization_state_code(memoization_state_function, name, memoization_state_function_arg_positions, formal_args)), reader.bq_cons(caching_state, (SubLObject)memoization_state.$list157)), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym158$PUNLESS, v_memoization_state, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym32$RET, reader.bq_cons(internal_function, ConsesLow.append(formal_args, (SubLObject)memoization_state.NIL)))), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym29$CSETQ, caching_state, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym159$MEMOIZATION_STATE_LOOKUP, v_memoization_state, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym145$QUOTE, name))), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym158$PUNLESS, caching_state, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym29$CSETQ, caching_state, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym160$CREATE_CACHING_STATE, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym24$MEMOIZATION_STATE_LOCK, v_memoization_state), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym145$QUOTE, name), Sequences.length(formal_args), capacity, internal_test)), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym161$MEMOIZATION_STATE_PUT, v_memoization_state, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym145$QUOTE, name), caching_state)), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym17$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(results, caching_lookup_code(caching_state, formal_args, (SubLObject)memoization_state.ZERO_INTEGER, (SubLObject)memoization_state.NIL, (SubLObject)memoization_state.NIL))), (SubLObject)ConsesLow.listS((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.listS((SubLObject)memoization_state.EQ, results, (SubLObject)memoization_state.$list162), ConsesLow.append((SubLObject)((memoization_state.NIL != memoization_state.$caching_mode_should_monitor$.getGlobalValue()) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym163$NOTE_CACHED_FUNCTION_CALLED_BUT_NOT_CACHED, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym145$QUOTE, name))) : memoization_state.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym29$CSETQ, results, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym164$MULTIPLE_VALUE_LIST, reader.bq_cons(internal_function, ConsesLow.append(formal_args, (SubLObject)memoization_state.NIL)))), (SubLObject)((memoization_state.NIL == formal_args) ? ConsesLow.list((SubLObject)memoization_state.$sym165$CACHING_STATE_SET_ZERO_ARG_RESULTS, caching_state, results) : ConsesLow.listS((SubLObject)memoization_state.$sym166$CACHING_STATE_PUT, caching_state, ConsesLow.append(formal_args, (SubLObject)ConsesLow.list(results))))))), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym32$RET, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym167$CACHING_RESULTS, results))))))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 54684L)
    public static SubLObject define_memoized_internal_n(final SubLObject name, final SubLObject args, final SubLObject test, final SubLObject capacity, final SubLObject faccess, final SubLObject memoization_state_function, final SubLObject memoization_state_function_arg_positions, final SubLObject body) {
        final SubLObject sxhash = (SubLObject)memoization_state.$sym168$SXHASH;
        final SubLObject v_memoization_state = (SubLObject)memoization_state.$sym169$MEMOIZATION_STATE;
        final SubLObject caching_state = (SubLObject)memoization_state.$sym170$CACHING_STATE;
        final SubLObject results = (SubLObject)memoization_state.$sym171$RESULTS;
        final SubLObject collisions = (SubLObject)memoization_state.$sym172$COLLISIONS;
        final SubLObject internal_function = caching_internal_function(name);
        final SubLObject internal_test = macro_test_to_run_time_test(test);
        final SubLObject formal_args = define_formal_args(args);
        return (SubLObject)ConsesLow.listS((SubLObject)memoization_state.$sym121$PROGN, note_memoized_function_code(name), caching_internal_function_code(internal_function, args, body), ConsesLow.append((SubLObject)((memoization_state.NIL != faccess) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym151$DECLAIM, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym152$FACCESS, faccess, name))) : memoization_state.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)memoization_state.$sym153$DEFINE, name, ConsesLow.append(args, (SubLObject)memoization_state.NIL), ConsesLow.append((SubLObject)((memoization_state.NIL != memoization_state.$caching_mode_should_monitor$.getGlobalValue()) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym154$NOTE_CACHED_FUNCTION_CALLED, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym145$QUOTE, name))) : memoization_state.NIL), (SubLObject)((memoization_state.NIL != memoization_state.$allow_function_caching_to_be_disabled$.getGlobalValue()) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym156$CACHING_DISABLED, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym145$QUOTE, name)), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym32$RET, reader.bq_cons(internal_function, ConsesLow.append(formal_args, (SubLObject)memoization_state.NIL))))) : memoization_state.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym17$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(v_memoization_state, lookup_memoization_state_code(memoization_state_function, name, memoization_state_function_arg_positions, formal_args)), reader.bq_cons(caching_state, (SubLObject)memoization_state.$list157)), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym158$PUNLESS, v_memoization_state, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym32$RET, reader.bq_cons(internal_function, ConsesLow.append(formal_args, (SubLObject)memoization_state.NIL)))), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym29$CSETQ, caching_state, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym159$MEMOIZATION_STATE_LOOKUP, v_memoization_state, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym145$QUOTE, name))), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym158$PUNLESS, caching_state, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym29$CSETQ, caching_state, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym160$CREATE_CACHING_STATE, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym24$MEMOIZATION_STATE_LOCK, v_memoization_state), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym145$QUOTE, name), Sequences.length(formal_args), capacity, internal_test)), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym161$MEMOIZATION_STATE_PUT, v_memoization_state, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym145$QUOTE, name), caching_state)), (SubLObject)ConsesLow.listS((SubLObject)memoization_state.$sym17$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(sxhash, caching_sxhash_code(formal_args)), (SubLObject)ConsesLow.list(collisions, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym173$CACHING_STATE_LOOKUP, caching_state, sxhash))), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym174$CNOT, (SubLObject)ConsesLow.listS((SubLObject)memoization_state.EQ, collisions, (SubLObject)memoization_state.$list162)), caching_lookup_code(caching_state, formal_args, sxhash, collisions, internal_test)), ConsesLow.append((SubLObject)((memoization_state.NIL != memoization_state.$caching_mode_should_monitor$.getGlobalValue()) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym163$NOTE_CACHED_FUNCTION_CALLED_BUT_NOT_CACHED, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym145$QUOTE, name))) : memoization_state.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym17$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(results, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym164$MULTIPLE_VALUE_LIST, reader.bq_cons(internal_function, ConsesLow.append(formal_args, (SubLObject)memoization_state.NIL))))), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym175$CACHING_STATE_ENTER_MULTI_KEY_N, caching_state, sxhash, collisions, results, reader.bq_cons((SubLObject)memoization_state.$sym176$LIST, ConsesLow.append(formal_args, (SubLObject)memoization_state.NIL))), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym32$RET, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym167$CACHING_RESULTS, results)))))))))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 57112L)
    public static SubLObject caching_sxhash_code(final SubLObject formal_args) {
        final SubLObject arg_list_length = Sequences.length(formal_args);
        SubLObject arg1 = (SubLObject)memoization_state.NIL;
        SubLObject arg2 = (SubLObject)memoization_state.NIL;
        SubLObject arg3 = (SubLObject)memoization_state.NIL;
        SubLObject arg4 = (SubLObject)memoization_state.NIL;
        SubLObject arg5 = (SubLObject)memoization_state.NIL;
        SubLObject arg6 = (SubLObject)memoization_state.NIL;
        SubLObject arg7 = (SubLObject)memoization_state.NIL;
        SubLObject arg8 = (SubLObject)memoization_state.NIL;
        SubLObject arg9 = (SubLObject)memoization_state.NIL;
        SubLObject arg10 = (SubLObject)memoization_state.NIL;
        if (arg_list_length.numL((SubLObject)memoization_state.ELEVEN_INTEGER)) {
            arg1 = formal_args.first();
            SubLObject tmp = formal_args.rest();
            arg2 = tmp.first();
            tmp = tmp.rest();
            arg3 = tmp.first();
            tmp = tmp.rest();
            arg4 = tmp.first();
            tmp = tmp.rest();
            arg5 = tmp.first();
            tmp = tmp.rest();
            arg6 = tmp.first();
            tmp = tmp.rest();
            arg7 = tmp.first();
            tmp = tmp.rest();
            arg8 = tmp.first();
            tmp = tmp.rest();
            arg9 = tmp.first();
            tmp = tmp.rest();
            arg10 = tmp.first();
        }
        if (memoization_state.TWO_INTEGER.eql(arg_list_length)) {
            return (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym177$SXHASH_CALC_2, arg1, arg2);
        }
        if (memoization_state.THREE_INTEGER.eql(arg_list_length)) {
            return (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym178$SXHASH_CALC_3, arg1, arg2, arg3);
        }
        if (memoization_state.FOUR_INTEGER.eql(arg_list_length)) {
            return (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym179$SXHASH_CALC_4, arg1, arg2, arg3, arg4);
        }
        if (memoization_state.FIVE_INTEGER.eql(arg_list_length)) {
            return (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym180$SXHASH_CALC_5, arg1, arg2, arg3, arg4, arg5);
        }
        if (memoization_state.SIX_INTEGER.eql(arg_list_length)) {
            return (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym181$SXHASH_CALC_6, arg1, arg2, arg3, arg4, arg5, arg6);
        }
        if (memoization_state.SEVEN_INTEGER.eql(arg_list_length)) {
            return (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym182$SXHASH_CALC_7, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
        }
        if (memoization_state.EIGHT_INTEGER.eql(arg_list_length)) {
            return (SubLObject)ConsesLow.list(new SubLObject[] { memoization_state.$sym183$SXHASH_CALC_8, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 });
        }
        if (memoization_state.NINE_INTEGER.eql(arg_list_length)) {
            return (SubLObject)ConsesLow.list(new SubLObject[] { memoization_state.$sym184$SXHASH_CALC_9, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9 });
        }
        if (memoization_state.TEN_INTEGER.eql(arg_list_length)) {
            return (SubLObject)ConsesLow.list(new SubLObject[] { memoization_state.$sym185$SXHASH_CALC_10, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10 });
        }
        return (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym186$SXHASH_CALC_N, reader.bq_cons((SubLObject)memoization_state.$sym176$LIST, ConsesLow.append(formal_args, (SubLObject)memoization_state.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 58938L)
    public static SubLObject caching_lookup_code(final SubLObject caching_state, final SubLObject formal_args, final SubLObject sxhash, final SubLObject collisions, SubLObject test) {
        final SubLObject arg_list_length = Sequences.length(formal_args);
        SubLObject arg1 = (SubLObject)memoization_state.NIL;
        SubLObject arg2 = (SubLObject)memoization_state.NIL;
        SubLObject arg3 = (SubLObject)memoization_state.NIL;
        SubLObject arg4 = (SubLObject)memoization_state.NIL;
        SubLObject arg5 = (SubLObject)memoization_state.NIL;
        SubLObject arg6 = (SubLObject)memoization_state.NIL;
        SubLObject arg7 = (SubLObject)memoization_state.NIL;
        SubLObject arg8 = (SubLObject)memoization_state.NIL;
        SubLObject arg9 = (SubLObject)memoization_state.NIL;
        SubLObject arg10 = (SubLObject)memoization_state.NIL;
        test = Eval.eval(test);
        if (arg_list_length.numL((SubLObject)memoization_state.ELEVEN_INTEGER)) {
            arg1 = formal_args.first();
            SubLObject tmp = formal_args.rest();
            arg2 = tmp.first();
            tmp = tmp.rest();
            arg3 = tmp.first();
            tmp = tmp.rest();
            arg4 = tmp.first();
            tmp = tmp.rest();
            arg5 = tmp.first();
            tmp = tmp.rest();
            arg6 = tmp.first();
            tmp = tmp.rest();
            arg7 = tmp.first();
            tmp = tmp.rest();
            arg8 = tmp.first();
            tmp = tmp.rest();
            arg9 = tmp.first();
            tmp = tmp.rest();
            arg10 = tmp.first();
        }
        if (memoization_state.ZERO_INTEGER.eql(arg_list_length)) {
            return (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym187$CACHING_STATE_GET_ZERO_ARG_RESULTS, caching_state);
        }
        if (memoization_state.ONE_INTEGER.eql(arg_list_length)) {
            return (SubLObject)ConsesLow.listS((SubLObject)memoization_state.$sym173$CACHING_STATE_LOOKUP, caching_state, arg1, (SubLObject)memoization_state.$list162);
        }
        if (memoization_state.TWO_INTEGER.eql(arg_list_length)) {
            return (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym188$CDOLIST, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym189$COLLISION, collisions), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym17$CLET, (SubLObject)memoization_state.$list190, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.listS(test, arg1, (SubLObject)memoization_state.$list191), (SubLObject)memoization_state.$list192, (SubLObject)ConsesLow.listS((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym193$CAND, (SubLObject)memoization_state.$sym194$CACHED_ARGS, (SubLObject)memoization_state.$list195, (SubLObject)ConsesLow.listS(test, arg2, (SubLObject)memoization_state.$list191)), (SubLObject)memoization_state.$list196))));
        }
        if (memoization_state.THREE_INTEGER.eql(arg_list_length)) {
            return (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym188$CDOLIST, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym189$COLLISION, collisions), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym17$CLET, (SubLObject)memoization_state.$list190, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.listS(test, arg1, (SubLObject)memoization_state.$list191), (SubLObject)memoization_state.$list192, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.listS(test, arg2, (SubLObject)memoization_state.$list191), (SubLObject)memoization_state.$list192, (SubLObject)ConsesLow.listS((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym193$CAND, (SubLObject)memoization_state.$sym194$CACHED_ARGS, (SubLObject)memoization_state.$list195, (SubLObject)ConsesLow.listS(test, arg3, (SubLObject)memoization_state.$list191)), (SubLObject)memoization_state.$list196)))));
        }
        if (memoization_state.FOUR_INTEGER.eql(arg_list_length)) {
            return (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym188$CDOLIST, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym189$COLLISION, collisions), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym17$CLET, (SubLObject)memoization_state.$list190, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.listS(test, arg1, (SubLObject)memoization_state.$list191), (SubLObject)memoization_state.$list192, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.listS(test, arg2, (SubLObject)memoization_state.$list191), (SubLObject)memoization_state.$list192, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.listS(test, arg3, (SubLObject)memoization_state.$list191), (SubLObject)memoization_state.$list192, (SubLObject)ConsesLow.listS((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym193$CAND, (SubLObject)memoization_state.$sym194$CACHED_ARGS, (SubLObject)memoization_state.$list195, (SubLObject)ConsesLow.listS(test, arg4, (SubLObject)memoization_state.$list191)), (SubLObject)memoization_state.$list196))))));
        }
        if (memoization_state.FIVE_INTEGER.eql(arg_list_length)) {
            return (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym188$CDOLIST, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym189$COLLISION, collisions), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym17$CLET, (SubLObject)memoization_state.$list190, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.listS(test, arg1, (SubLObject)memoization_state.$list191), (SubLObject)memoization_state.$list192, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.listS(test, arg2, (SubLObject)memoization_state.$list191), (SubLObject)memoization_state.$list192, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.listS(test, arg3, (SubLObject)memoization_state.$list191), (SubLObject)memoization_state.$list192, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.listS(test, arg4, (SubLObject)memoization_state.$list191), (SubLObject)memoization_state.$list192, (SubLObject)ConsesLow.listS((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym193$CAND, (SubLObject)memoization_state.$sym194$CACHED_ARGS, (SubLObject)memoization_state.$list195, (SubLObject)ConsesLow.listS(test, arg5, (SubLObject)memoization_state.$list191)), (SubLObject)memoization_state.$list196)))))));
        }
        if (memoization_state.SIX_INTEGER.eql(arg_list_length)) {
            return (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym188$CDOLIST, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym189$COLLISION, collisions), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym17$CLET, (SubLObject)memoization_state.$list190, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.listS(test, arg1, (SubLObject)memoization_state.$list191), (SubLObject)memoization_state.$list192, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.listS(test, arg2, (SubLObject)memoization_state.$list191), (SubLObject)memoization_state.$list192, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.listS(test, arg3, (SubLObject)memoization_state.$list191), (SubLObject)memoization_state.$list192, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.listS(test, arg4, (SubLObject)memoization_state.$list191), (SubLObject)memoization_state.$list192, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.listS(test, arg5, (SubLObject)memoization_state.$list191), (SubLObject)memoization_state.$list192, (SubLObject)ConsesLow.listS((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym193$CAND, (SubLObject)memoization_state.$sym194$CACHED_ARGS, (SubLObject)memoization_state.$list195, (SubLObject)ConsesLow.listS(test, arg6, (SubLObject)memoization_state.$list191)), (SubLObject)memoization_state.$list196))))))));
        }
        if (memoization_state.SEVEN_INTEGER.eql(arg_list_length)) {
            return (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym188$CDOLIST, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym189$COLLISION, collisions), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym17$CLET, (SubLObject)memoization_state.$list190, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.listS(test, arg1, (SubLObject)memoization_state.$list191), (SubLObject)memoization_state.$list192, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.listS(test, arg2, (SubLObject)memoization_state.$list191), (SubLObject)memoization_state.$list192, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.listS(test, arg3, (SubLObject)memoization_state.$list191), (SubLObject)memoization_state.$list192, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.listS(test, arg4, (SubLObject)memoization_state.$list191), (SubLObject)memoization_state.$list192, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.listS(test, arg5, (SubLObject)memoization_state.$list191), (SubLObject)memoization_state.$list192, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.listS(test, arg6, (SubLObject)memoization_state.$list191), (SubLObject)memoization_state.$list192, (SubLObject)ConsesLow.listS((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym193$CAND, (SubLObject)memoization_state.$sym194$CACHED_ARGS, (SubLObject)memoization_state.$list195, (SubLObject)ConsesLow.listS(test, arg7, (SubLObject)memoization_state.$list191)), (SubLObject)memoization_state.$list196)))))))));
        }
        if (memoization_state.EIGHT_INTEGER.eql(arg_list_length)) {
            return (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym188$CDOLIST, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym189$COLLISION, collisions), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym17$CLET, (SubLObject)memoization_state.$list190, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.listS(test, arg1, (SubLObject)memoization_state.$list191), (SubLObject)memoization_state.$list192, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.listS(test, arg2, (SubLObject)memoization_state.$list191), (SubLObject)memoization_state.$list192, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.listS(test, arg3, (SubLObject)memoization_state.$list191), (SubLObject)memoization_state.$list192, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.listS(test, arg4, (SubLObject)memoization_state.$list191), (SubLObject)memoization_state.$list192, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.listS(test, arg5, (SubLObject)memoization_state.$list191), (SubLObject)memoization_state.$list192, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.listS(test, arg6, (SubLObject)memoization_state.$list191), (SubLObject)memoization_state.$list192, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.listS(test, arg7, (SubLObject)memoization_state.$list191), (SubLObject)memoization_state.$list192, (SubLObject)ConsesLow.listS((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym193$CAND, (SubLObject)memoization_state.$sym194$CACHED_ARGS, (SubLObject)memoization_state.$list195, (SubLObject)ConsesLow.listS(test, arg8, (SubLObject)memoization_state.$list191)), (SubLObject)memoization_state.$list196))))))))));
        }
        if (memoization_state.NINE_INTEGER.eql(arg_list_length)) {
            return (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym188$CDOLIST, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym189$COLLISION, collisions), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym17$CLET, (SubLObject)memoization_state.$list190, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.listS(test, arg1, (SubLObject)memoization_state.$list191), (SubLObject)memoization_state.$list192, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.listS(test, arg2, (SubLObject)memoization_state.$list191), (SubLObject)memoization_state.$list192, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.listS(test, arg3, (SubLObject)memoization_state.$list191), (SubLObject)memoization_state.$list192, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.listS(test, arg4, (SubLObject)memoization_state.$list191), (SubLObject)memoization_state.$list192, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.listS(test, arg5, (SubLObject)memoization_state.$list191), (SubLObject)memoization_state.$list192, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.listS(test, arg6, (SubLObject)memoization_state.$list191), (SubLObject)memoization_state.$list192, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.listS(test, arg7, (SubLObject)memoization_state.$list191), (SubLObject)memoization_state.$list192, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.listS(test, arg8, (SubLObject)memoization_state.$list191), (SubLObject)memoization_state.$list192, (SubLObject)ConsesLow.listS((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym193$CAND, (SubLObject)memoization_state.$sym194$CACHED_ARGS, (SubLObject)memoization_state.$list195, (SubLObject)ConsesLow.listS(test, arg9, (SubLObject)memoization_state.$list191)), (SubLObject)memoization_state.$list196)))))))))));
        }
        if (memoization_state.TEN_INTEGER.eql(arg_list_length)) {
            return (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym188$CDOLIST, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym189$COLLISION, collisions), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym17$CLET, (SubLObject)memoization_state.$list190, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.listS(test, arg1, (SubLObject)memoization_state.$list191), (SubLObject)memoization_state.$list192, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.listS(test, arg2, (SubLObject)memoization_state.$list191), (SubLObject)memoization_state.$list192, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.listS(test, arg3, (SubLObject)memoization_state.$list191), (SubLObject)memoization_state.$list192, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.listS(test, arg4, (SubLObject)memoization_state.$list191), (SubLObject)memoization_state.$list192, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.listS(test, arg5, (SubLObject)memoization_state.$list191), (SubLObject)memoization_state.$list192, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.listS(test, arg6, (SubLObject)memoization_state.$list191), (SubLObject)memoization_state.$list192, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.listS(test, arg7, (SubLObject)memoization_state.$list191), (SubLObject)memoization_state.$list192, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.listS(test, arg8, (SubLObject)memoization_state.$list191), (SubLObject)memoization_state.$list192, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.listS(test, arg9, (SubLObject)memoization_state.$list191), (SubLObject)memoization_state.$list192, (SubLObject)ConsesLow.listS((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym193$CAND, (SubLObject)memoization_state.$sym194$CACHED_ARGS, (SubLObject)memoization_state.$list195, (SubLObject)ConsesLow.listS(test, arg10, (SubLObject)memoization_state.$list191)), (SubLObject)memoization_state.$list196))))))))))));
        }
        return (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym197$CACHING_STATE_LOOKUP_MULTI_KEY_N, caching_state, reader.bq_cons((SubLObject)memoization_state.$sym176$LIST, ConsesLow.append(formal_args, (SubLObject)memoization_state.NIL)), sxhash, collisions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 68121L)
    public static SubLObject lookup_memoization_state_code(final SubLObject memoization_state_function, final SubLObject name, final SubLObject memoization_state_function_arg_positions, final SubLObject args) {
        if (memoization_state.NIL != memoization_state_function) {
            SubLObject func = (SubLObject)memoization_state.NIL;
            func = (SubLObject)ConsesLow.cons(memoization_state_function, func);
            SubLObject cdolist_list_var = memoization_state_function_arg_positions;
            SubLObject arg_pos = (SubLObject)memoization_state.NIL;
            arg_pos = cdolist_list_var.first();
            while (memoization_state.NIL != cdolist_list_var) {
                enforceType(arg_pos, memoization_state.$sym72$NON_NEGATIVE_INTEGER_P);
                if (arg_pos.eql((SubLObject)memoization_state.ZERO_INTEGER)) {
                    func = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym198$MAKE_SYMBOL, Symbols.symbol_name(name)), func);
                }
                else {
                    func = (SubLObject)ConsesLow.cons(ConsesLow.nth(Numbers.subtract(arg_pos, (SubLObject)memoization_state.ONE_INTEGER), args), func);
                }
                cdolist_list_var = cdolist_list_var.rest();
                arg_pos = cdolist_list_var.first();
            }
            return Sequences.nreverse(func);
        }
        return (SubLObject)memoization_state.$sym118$_MEMOIZATION_STATE_;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 68704L)
    public static SubLObject note_memoized_function_code(final SubLObject internal_function) {
        return (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym199$NOTE_MEMOIZED_FUNCTION, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym145$QUOTE, internal_function));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 69133L)
    public static SubLObject note_globally_cached_function(final SubLObject function_symbol) {
        if (memoization_state.NIL == conses_high.member(function_symbol, memoization_state.$globally_cached_functions$.getGlobalValue(), Symbols.symbol_function((SubLObject)memoization_state.EQL), Symbols.symbol_function((SubLObject)memoization_state.IDENTITY))) {
            memoization_state.$globally_cached_functions$.setGlobalValue((SubLObject)ConsesLow.cons(function_symbol, memoization_state.$globally_cached_functions$.getGlobalValue()));
        }
        return function_symbol;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 69413L)
    public static SubLObject globally_cached_functions() {
        return list_utilities.remove_if_not((SubLObject)memoization_state.$sym136$FBOUNDP, memoization_state.$globally_cached_functions$.getGlobalValue(), (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 69573L)
    public static SubLObject global_cache_variables() {
        return list_utilities.remove_if_not((SubLObject)memoization_state.$sym201$BOUNDP, Mapping.mapcar((SubLObject)memoization_state.$sym202$GLOBAL_CACHING_VARIABLE_NEW, globally_cached_functions()), (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 69717L)
    public static SubLObject global_cache_variable_values() {
        return Mapping.mapcar((SubLObject)memoization_state.$sym203$SYMBOL_VALUE, global_cache_variables());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 69825L)
    public static SubLObject memoized_or_cached_functions() {
        return ConsesLow.append(memoization_state.$memoized_functions$.getGlobalValue(), memoization_state.$globally_cached_functions$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 69983L)
    public static SubLObject clear_all_globally_cached_functions(SubLObject verboseP) {
        if (verboseP == memoization_state.UNPROVIDED) {
            verboseP = (SubLObject)memoization_state.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject list_var = global_cache_variable_values();
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)memoization_state.$str204$Clearing_all_globally_cached_func, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)memoization_state.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)memoization_state.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)memoization_state.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)memoization_state.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject caching_state = (SubLObject)memoization_state.NIL;
                caching_state = csome_list_var.first();
                while (memoization_state.NIL != csome_list_var) {
                    if (memoization_state.NIL != caching_state_p(caching_state)) {
                        if (memoization_state.NIL != verboseP) {
                            final SubLObject caching_state_size = caching_state_size(caching_state, (SubLObject)memoization_state.UNPROVIDED);
                            if (caching_state_size.numG((SubLObject)memoization_state.$int206$1000)) {
                                format_nil.force_format((SubLObject)memoization_state.T, (SubLObject)memoization_state.$str207$____clearing_large_caching_state_, caching_state_size, caching_state_func_symbol(caching_state), (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED);
                            }
                        }
                        caching_state_clear(caching_state);
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)memoization_state.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    caching_state = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)memoization_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
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
        return (SubLObject)memoization_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 70529L)
    public static SubLObject define_cached_new(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)memoization_state.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)memoization_state.$list209);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)memoization_state.$list209);
        final SubLObject temp = current.rest();
        final SubLObject args;
        current = (args = current.first());
        current = temp;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)memoization_state.$list209);
        final SubLObject temp_$8 = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)memoization_state.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)memoization_state.NIL;
        SubLObject current_$9 = (SubLObject)memoization_state.NIL;
        while (memoization_state.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)memoization_state.$list209);
            current_$9 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)memoization_state.$list209);
            if (memoization_state.NIL == conses_high.member(current_$9, (SubLObject)memoization_state.$list210, (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED)) {
                bad = (SubLObject)memoization_state.T;
            }
            if (current_$9 == memoization_state.$kw12$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (memoization_state.NIL != bad && memoization_state.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)memoization_state.$list209);
        }
        final SubLObject test_tail = cdestructuring_bind.property_list_member((SubLObject)memoization_state.$kw64$TEST, current);
        final SubLObject test = (SubLObject)((memoization_state.NIL != test_tail) ? conses_high.cadr(test_tail) : memoization_state.NIL);
        final SubLObject capacity_tail = cdestructuring_bind.property_list_member((SubLObject)memoization_state.$kw62$CAPACITY, current);
        final SubLObject capacity = (SubLObject)((memoization_state.NIL != capacity_tail) ? conses_high.cadr(capacity_tail) : memoization_state.NIL);
        final SubLObject faccess_tail = cdestructuring_bind.property_list_member((SubLObject)memoization_state.$kw140$FACCESS, current);
        final SubLObject faccess = (SubLObject)((memoization_state.NIL != faccess_tail) ? conses_high.cadr(faccess_tail) : memoization_state.NIL);
        final SubLObject size_tail = cdestructuring_bind.property_list_member((SubLObject)memoization_state.$kw211$SIZE, current);
        final SubLObject size = (SubLObject)((memoization_state.NIL != size_tail) ? conses_high.cadr(size_tail) : memoization_state.NIL);
        final SubLObject clear_when_tail = cdestructuring_bind.property_list_member((SubLObject)memoization_state.$kw212$CLEAR_WHEN, current);
        final SubLObject clear_when = (SubLObject)((memoization_state.NIL != clear_when_tail) ? conses_high.cadr(clear_when_tail) : memoization_state.NIL);
        final SubLObject body;
        current = (body = temp_$8);
        return define_cached_internal(name, args, test, size, capacity, faccess, clear_when, body);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 72000L)
    public static SubLObject define_cached(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)memoization_state.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)memoization_state.$list213);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)memoization_state.$list213);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject arg = (SubLObject)memoization_state.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)memoization_state.$list213);
        arg = current.first();
        current = current.rest();
        if (memoization_state.NIL == current) {
            current = temp;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)memoization_state.$list213);
            final SubLObject temp_$10 = current.rest();
            current = current.first();
            SubLObject size = (SubLObject)memoization_state.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)memoization_state.$list213);
            size = current.first();
            current = current.rest();
            final SubLObject test = (SubLObject)(current.isCons() ? current.first() : memoization_state.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)memoization_state.$list213);
            current = current.rest();
            if (memoization_state.NIL == current) {
                final SubLObject body;
                current = (body = temp_$10);
                if (memoization_state.NIL != test) {
                    return (SubLObject)ConsesLow.listS((SubLObject)memoization_state.$sym208$DEFINE_CACHED_NEW, name, (SubLObject)ConsesLow.list(arg), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$kw211$SIZE, size, (SubLObject)memoization_state.$kw64$TEST, test), ConsesLow.append(body, (SubLObject)memoization_state.NIL));
                }
                return (SubLObject)ConsesLow.listS((SubLObject)memoization_state.$sym208$DEFINE_CACHED_NEW, name, (SubLObject)ConsesLow.list(arg), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$kw211$SIZE, size), ConsesLow.append(body, (SubLObject)memoization_state.NIL));
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)memoization_state.$list213);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)memoization_state.$list213);
        }
        return (SubLObject)memoization_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 72311L)
    public static SubLObject define_cached_multiarg(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)memoization_state.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)memoization_state.$list214);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)memoization_state.$list214);
        final SubLObject temp = current.rest();
        final SubLObject args;
        current = (args = current.first());
        current = temp;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)memoization_state.$list214);
        final SubLObject temp_$11 = current.rest();
        current = current.first();
        SubLObject size = (SubLObject)memoization_state.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)memoization_state.$list214);
        size = current.first();
        current = current.rest();
        final SubLObject test = (SubLObject)(current.isCons() ? current.first() : memoization_state.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)memoization_state.$list214);
        current = current.rest();
        if (memoization_state.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)memoization_state.$list214);
            return (SubLObject)memoization_state.NIL;
        }
        final SubLObject body;
        current = (body = temp_$11);
        if (memoization_state.NIL != test) {
            return (SubLObject)ConsesLow.listS((SubLObject)memoization_state.$sym208$DEFINE_CACHED_NEW, name, ConsesLow.append(args, (SubLObject)memoization_state.NIL), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$kw211$SIZE, size, (SubLObject)memoization_state.$kw64$TEST, test), ConsesLow.append(body, (SubLObject)memoization_state.NIL));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)memoization_state.$sym208$DEFINE_CACHED_NEW, name, ConsesLow.append(args, (SubLObject)memoization_state.NIL), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$kw211$SIZE, size), ConsesLow.append(body, (SubLObject)memoization_state.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 73014L)
    public static SubLObject cache_clear_trigger_p(final SubLObject v_object) {
        if (memoization_state.NIL != atomic_cache_clear_trigger_p(v_object)) {
            return (SubLObject)memoization_state.T;
        }
        if (memoization_state.NIL != list_utilities.proper_list_p(v_object)) {
            SubLObject cdolist_list_var = v_object;
            SubLObject obj = (SubLObject)memoization_state.NIL;
            obj = cdolist_list_var.first();
            while (memoization_state.NIL != cdolist_list_var) {
                if (memoization_state.NIL == atomic_cache_clear_trigger_p(obj)) {
                    return (SubLObject)memoization_state.NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                obj = cdolist_list_var.first();
            }
            return (SubLObject)memoization_state.T;
        }
        return (SubLObject)memoization_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 73276L)
    public static SubLObject atomic_cache_clear_trigger_p(final SubLObject v_object) {
        return conses_high.member(v_object, memoization_state.$cache_clear_triggers$.getGlobalValue(), Symbols.symbol_function((SubLObject)memoization_state.EQ), (SubLObject)memoization_state.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 73386L)
    public static SubLObject define_cached_internal(final SubLObject name, final SubLObject args, final SubLObject test, final SubLObject size, final SubLObject capacity, final SubLObject faccess, final SubLObject clear_when, final SubLObject body) {
        final SubLObject formal_args = define_formal_args(args);
        final SubLObject pcase_var = Sequences.length(formal_args);
        if (pcase_var.eql((SubLObject)memoization_state.ZERO_INTEGER)) {
            return define_cached_internal_0_or_1(name, args, test, size, capacity, faccess, clear_when, body);
        }
        if (pcase_var.eql((SubLObject)memoization_state.ONE_INTEGER)) {
            return define_cached_internal_0_or_1(name, args, test, size, capacity, faccess, clear_when, body);
        }
        return define_cached_internal_n(name, args, test, size, capacity, faccess, clear_when, body);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 73895L)
    public static SubLObject define_cached_internal_0_or_1(final SubLObject name, final SubLObject args, SubLObject test, SubLObject size, final SubLObject capacity, final SubLObject faccess, final SubLObject clear_when, final SubLObject body) {
        if (memoization_state.NIL == test) {
            test = Symbols.symbol_function((SubLObject)memoization_state.EQL);
        }
        if (memoization_state.NIL == size) {
            size = (SubLObject)memoization_state.ZERO_INTEGER;
        }
        if (memoization_state.NIL != clear_when && !memoization_state.assertionsDisabledSynth && memoization_state.NIL == cache_clear_trigger_p(clear_when)) {
            throw new AssertionError(clear_when);
        }
        final SubLObject results = (SubLObject)memoization_state.$sym217$RESULTS;
        final SubLObject caching_state = (SubLObject)memoization_state.$sym218$CACHING_STATE;
        final SubLObject formal_args = define_formal_args(args);
        final SubLObject caching_state_var = global_caching_variable_new(name);
        final SubLObject args_length = Sequences.length(formal_args);
        final SubLObject internal_function = caching_internal_function(name);
        final SubLObject internal_test = macro_test_to_run_time_test(test);
        return (SubLObject)ConsesLow.listS((SubLObject)memoization_state.$sym121$PROGN, new SubLObject[] { global_caching_variable_code(caching_state_var), global_caching_reset_code_new(name), global_caching_n_remove_code_new(name, args, caching_state_var), global_caching_note_function_code(name), caching_internal_function_code(internal_function, formal_args, body), ConsesLow.append((SubLObject)((memoization_state.NIL != faccess) ? caching_faccess_code(faccess, name, args) : memoization_state.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)memoization_state.$sym153$DEFINE, name, ConsesLow.append(args, (SubLObject)memoization_state.NIL), ConsesLow.append((SubLObject)((memoization_state.NIL != memoization_state.$caching_mode_should_monitor$.getGlobalValue()) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym154$NOTE_CACHED_FUNCTION_CALLED, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym145$QUOTE, name))) : memoization_state.NIL), (SubLObject)((memoization_state.NIL != memoization_state.$allow_function_caching_to_be_disabled$.getGlobalValue()) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym156$CACHING_DISABLED, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym145$QUOTE, name)), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym32$RET, reader.bq_cons(internal_function, ConsesLow.append(formal_args, (SubLObject)memoization_state.NIL))))) : memoization_state.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym17$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(caching_state, caching_state_var)), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym158$PUNLESS, caching_state, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym29$CSETQ, caching_state, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym219$CREATE_GLOBAL_CACHING_STATE_FOR_NAME, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym145$QUOTE, name), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym145$QUOTE, caching_state_var), capacity, internal_test, args_length, size)), global_caching_register_reset_code_new(name, clear_when)), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym17$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(results, caching_lookup_code(caching_state, formal_args, (SubLObject)memoization_state.ZERO_INTEGER, (SubLObject)memoization_state.NIL, (SubLObject)memoization_state.NIL))), (SubLObject)ConsesLow.listS((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.listS((SubLObject)memoization_state.EQ, results, (SubLObject)memoization_state.$list162), ConsesLow.append((SubLObject)((memoization_state.NIL != memoization_state.$caching_mode_should_monitor$.getGlobalValue()) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym163$NOTE_CACHED_FUNCTION_CALLED_BUT_NOT_CACHED, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym145$QUOTE, name))) : memoization_state.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym29$CSETQ, results, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym164$MULTIPLE_VALUE_LIST, reader.bq_cons(internal_function, ConsesLow.append(formal_args, (SubLObject)memoization_state.NIL)))), (SubLObject)((memoization_state.NIL == formal_args) ? ConsesLow.list((SubLObject)memoization_state.$sym165$CACHING_STATE_SET_ZERO_ARG_RESULTS, caching_state, results) : ConsesLow.listS((SubLObject)memoization_state.$sym166$CACHING_STATE_PUT, caching_state, ConsesLow.append(formal_args, (SubLObject)ConsesLow.list(results))))))), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym32$RET, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym167$CACHING_RESULTS, results))))))))) });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 76240L)
    public static SubLObject define_cached_internal_n(final SubLObject name, final SubLObject args, SubLObject test, SubLObject size, final SubLObject capacity, final SubLObject faccess, final SubLObject clear_when, final SubLObject body) {
        if (memoization_state.NIL == test) {
            test = Symbols.symbol_function((SubLObject)memoization_state.EQL);
        }
        if (memoization_state.NIL == size) {
            size = (SubLObject)memoization_state.ZERO_INTEGER;
        }
        if (memoization_state.NIL != clear_when && !memoization_state.assertionsDisabledSynth && memoization_state.NIL == cache_clear_trigger_p(clear_when)) {
            throw new AssertionError(clear_when);
        }
        final SubLObject sxhash = (SubLObject)memoization_state.$sym220$SXHASH;
        final SubLObject results = (SubLObject)memoization_state.$sym221$RESULTS;
        final SubLObject collisions = (SubLObject)memoization_state.$sym222$COLLISIONS;
        final SubLObject caching_state = (SubLObject)memoization_state.$sym223$CACHING_STATE;
        final SubLObject formal_args = define_formal_args(args);
        final SubLObject caching_state_var = global_caching_variable_new(name);
        final SubLObject args_length = Sequences.length(formal_args);
        final SubLObject internal_function = caching_internal_function(name);
        final SubLObject internal_test = macro_test_to_run_time_test(test);
        return (SubLObject)ConsesLow.listS((SubLObject)memoization_state.$sym121$PROGN, new SubLObject[] { global_caching_variable_code(caching_state_var), global_caching_reset_code_new(name), global_caching_n_remove_code_new(name, args, caching_state_var), global_caching_note_function_code(name), caching_internal_function_code(internal_function, formal_args, body), ConsesLow.append((SubLObject)((memoization_state.NIL != faccess) ? caching_faccess_code(faccess, name, args) : memoization_state.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)memoization_state.$sym153$DEFINE, name, ConsesLow.append(args, (SubLObject)memoization_state.NIL), ConsesLow.append((SubLObject)((memoization_state.NIL != memoization_state.$caching_mode_should_monitor$.getGlobalValue()) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym154$NOTE_CACHED_FUNCTION_CALLED, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym145$QUOTE, name))) : memoization_state.NIL), (SubLObject)((memoization_state.NIL != memoization_state.$allow_function_caching_to_be_disabled$.getGlobalValue()) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym156$CACHING_DISABLED, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym145$QUOTE, name)), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym32$RET, reader.bq_cons(internal_function, ConsesLow.append(formal_args, (SubLObject)memoization_state.NIL))))) : memoization_state.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym17$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(caching_state, caching_state_var)), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym158$PUNLESS, caching_state, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym29$CSETQ, caching_state, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym219$CREATE_GLOBAL_CACHING_STATE_FOR_NAME, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym145$QUOTE, name), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym145$QUOTE, caching_state_var), capacity, internal_test, args_length, size)), global_caching_register_reset_code_new(name, clear_when)), (SubLObject)ConsesLow.listS((SubLObject)memoization_state.$sym17$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(sxhash, caching_sxhash_code(formal_args)), (SubLObject)ConsesLow.list(collisions, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym173$CACHING_STATE_LOOKUP, caching_state, sxhash))), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym155$PWHEN, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym174$CNOT, (SubLObject)ConsesLow.listS((SubLObject)memoization_state.EQ, collisions, (SubLObject)memoization_state.$list162)), caching_lookup_code(caching_state, formal_args, sxhash, collisions, internal_test)), ConsesLow.append((SubLObject)((memoization_state.NIL != memoization_state.$caching_mode_should_monitor$.getGlobalValue()) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym163$NOTE_CACHED_FUNCTION_CALLED_BUT_NOT_CACHED, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym145$QUOTE, name))) : memoization_state.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym17$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(results, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym164$MULTIPLE_VALUE_LIST, reader.bq_cons(internal_function, ConsesLow.append(formal_args, (SubLObject)memoization_state.NIL))))), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym175$CACHING_STATE_ENTER_MULTI_KEY_N, caching_state, sxhash, collisions, results, reader.bq_cons((SubLObject)memoization_state.$sym176$LIST, ConsesLow.append(formal_args, (SubLObject)memoization_state.NIL))), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym32$RET, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym167$CACHING_RESULTS, results)))))))))))) });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 78660L)
    public static SubLObject load_caching_state_contents_from_hash_table(final SubLObject caching_state, final SubLObject hash_table) {
        assert memoization_state.NIL != caching_state_p(caching_state) : caching_state;
        assert memoization_state.NIL != Types.hash_table_p(hash_table) : hash_table;
        if (memoization_state.NIL != caching_state_lock(caching_state)) {
            SubLObject result = (SubLObject)memoization_state.NIL;
            final SubLObject rw_lock_var = caching_state_lock(caching_state);
            SubLObject needs_to_releaseP = (SubLObject)memoization_state.NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                result = load_caching_state_contents_from_hash_table_internal(caching_state, hash_table);
            }
            finally {
                if (memoization_state.NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                }
            }
            return result;
        }
        return load_caching_state_contents_from_hash_table_internal(caching_state, hash_table);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 79009L)
    public static SubLObject load_caching_state_contents_from_hash_table_internal(final SubLObject caching_state, final SubLObject hash_table) {
        caching_state_clear_internal(caching_state);
        SubLObject cdolist_list_var;
        final SubLObject keys = cdolist_list_var = hash_table_utilities.hash_table_keys(hash_table);
        SubLObject key = (SubLObject)memoization_state.NIL;
        key = cdolist_list_var.first();
        while (memoization_state.NIL != cdolist_list_var) {
            if (memoization_state.NIL != key) {
                caching_state_put_internal(caching_state, key, Hashtables.gethash(hash_table, key, (SubLObject)memoization_state.UNPROVIDED));
            }
            else {
                _csetf_caching_state_zero_arg_results(caching_state, Hashtables.gethash(hash_table, key, (SubLObject)memoization_state.UNPROVIDED));
            }
            cdolist_list_var = cdolist_list_var.rest();
            key = cdolist_list_var.first();
        }
        return (SubLObject)memoization_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 79428L)
    public static SubLObject get_caching_state_contents_as_hash_table(final SubLObject caching_state) {
        assert memoization_state.NIL != caching_state_p(caching_state) : caching_state;
        if (memoization_state.NIL != caching_state_lock(caching_state)) {
            SubLObject result = (SubLObject)memoization_state.NIL;
            final SubLObject rw_lock_var = caching_state_lock(caching_state);
            SubLObject needs_to_releaseP = (SubLObject)memoization_state.NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                result = get_caching_state_contents_as_hash_table_internal(caching_state);
            }
            finally {
                if (memoization_state.NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                }
            }
            return result;
        }
        return get_caching_state_contents_as_hash_table_internal(caching_state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 79714L)
    public static SubLObject get_caching_state_contents_as_hash_table_internal(final SubLObject caching_state) {
        SubLObject result = (SubLObject)memoization_state.NIL;
        result = Hashtables.make_hash_table(caching_state_size_internal(caching_state), Symbols.symbol_function((SubLObject)memoization_state.EQL), (SubLObject)memoization_state.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject keys = cdolist_list_var = caching_state_keys_internal(caching_state);
        SubLObject key = (SubLObject)memoization_state.NIL;
        key = cdolist_list_var.first();
        while (memoization_state.NIL != cdolist_list_var) {
            Hashtables.sethash(key, result, caching_state_lookup_internal(caching_state, key, (SubLObject)memoization_state.UNPROVIDED));
            cdolist_list_var = cdolist_list_var.rest();
            key = cdolist_list_var.first();
        }
        Hashtables.sethash((SubLObject)memoization_state.NIL, result, caching_state_zero_arg_results(caching_state));
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 80168L)
    public static SubLObject get_caching_state_for_globally_cached_function(final SubLObject name, SubLObject args_length, SubLObject capacity, SubLObject test, SubLObject size) {
        if (args_length == memoization_state.UNPROVIDED) {
            args_length = (SubLObject)memoization_state.NIL;
        }
        if (capacity == memoization_state.UNPROVIDED) {
            capacity = (SubLObject)memoization_state.NIL;
        }
        if (test == memoization_state.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)memoization_state.EQL);
        }
        if (size == memoization_state.UNPROVIDED) {
            size = (SubLObject)memoization_state.ZERO_INTEGER;
        }
        final SubLObject caching_state_var = global_caching_variable_new(name);
        SubLObject val = Symbols.symbol_value(caching_state_var);
        if (memoization_state.NIL == val) {
            val = create_global_caching_state_for_name(name, caching_state_var, capacity, test, args_length, size);
        }
        return val;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 80896L)
    public static SubLObject create_global_caching_state_for_name(final SubLObject name, final SubLObject cs_variable, final SubLObject capacity, SubLObject test, final SubLObject args_length, final SubLObject size) {
        if (memoization_state.NIL == test) {
            test = Symbols.symbol_function((SubLObject)memoization_state.EQL);
        }
        SubLObject caching_state = (SubLObject)memoization_state.NIL;
        final SubLObject rw_lock_var = memoization_state.$global_caching_lock$.getGlobalValue();
        SubLObject needs_to_releaseP = (SubLObject)memoization_state.NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            caching_state = Symbols.symbol_value(cs_variable);
            if (memoization_state.NIL == caching_state) {
                caching_state = create_caching_state(ReadWriteLocks.new_rw_lock(Sequences.cconcatenate((SubLObject)memoization_state.$str225$global_caching_lock_for_, Symbols.symbol_name(name))), name, args_length, capacity, test, size);
                Symbols.set(cs_variable, caching_state);
            }
        }
        finally {
            if (memoization_state.NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
        return caching_state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 81468L)
    public static SubLObject memoize_caching_state_for_function_new(final SubLObject v_memoization_state, final SubLObject function_symbol) {
        if (memoization_state.NIL != v_memoization_state) {
            return memoization_state_lookup(v_memoization_state, function_symbol, (SubLObject)memoization_state.NIL);
        }
        return (SubLObject)memoization_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 81759L)
    public static SubLObject global_caching_reset_from_function(final SubLObject function_symbol) {
        final SubLObject var = global_caching_variable_new(function_symbol);
        final SubLObject cs = (SubLObject)((memoization_state.NIL != Symbols.boundp(var)) ? Symbols.symbol_value(var) : memoization_state.NIL);
        if (memoization_state.NIL != cs) {
            caching_state_clear(cs);
        }
        return (SubLObject)memoization_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 82012L)
    public static SubLObject global_caching_lock(final SubLObject name) {
        return Packages.intern(PrintLow.format((SubLObject)memoization_state.NIL, (SubLObject)memoization_state.$str226$__A_RW_LOCK_, name), (SubLObject)memoization_state.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 82131L)
    public static SubLObject global_caching_variable_new(final SubLObject name) {
        return Packages.intern(PrintLow.format((SubLObject)memoization_state.NIL, (SubLObject)memoization_state.$str227$__A_CACHING_STATE_, name), (SubLObject)memoization_state.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 82242L)
    public static SubLObject global_caching_variable_code(final SubLObject caching_state) {
        return (SubLObject)ConsesLow.listS((SubLObject)memoization_state.$sym228$DEFLEXICAL_PRIVATE, caching_state, (SubLObject)memoization_state.$list157);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 82356L)
    public static SubLObject global_caching_reset_function(final SubLObject name) {
        return Packages.intern(PrintLow.format((SubLObject)memoization_state.NIL, (SubLObject)memoization_state.$str229$CLEAR__A, name), (SubLObject)memoization_state.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 82459L)
    public static SubLObject global_caching_register_reset_code_new(final SubLObject name, final SubLObject clear_when) {
        if (memoization_state.NIL != atomic_cache_clear_trigger_p(clear_when)) {
            return global_caching_register_reset_code_atomic(name, clear_when);
        }
        SubLObject forms = (SubLObject)memoization_state.NIL;
        SubLObject cdolist_list_var = clear_when;
        SubLObject clear = (SubLObject)memoization_state.NIL;
        clear = cdolist_list_var.first();
        while (memoization_state.NIL != cdolist_list_var) {
            forms = (SubLObject)ConsesLow.cons(global_caching_register_reset_code_atomic(name, clear), forms);
            cdolist_list_var = cdolist_list_var.rest();
            clear = cdolist_list_var.first();
        }
        return (SubLObject)((memoization_state.NIL != forms) ? ConsesLow.cons((SubLObject)memoization_state.$sym121$PROGN, forms) : memoization_state.$list230);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 82851L)
    public static SubLObject global_caching_register_reset_code_atomic(final SubLObject name, final SubLObject clear_when) {
        final SubLObject reset_function = global_caching_reset_function(name);
        if (clear_when.eql((SubLObject)memoization_state.$kw231$HL_STORE_MODIFIED)) {
            return (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym232$REGISTER_HL_STORE_CACHE_CLEAR_CALLBACK, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym145$QUOTE, reset_function));
        }
        if (clear_when.eql((SubLObject)memoization_state.$kw233$GENL_MT_MODIFIED)) {
            return (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym234$REGISTER_MT_DEPENDENT_CACHE_CLEAR_CALLBACK, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym145$QUOTE, reset_function));
        }
        if (clear_when.eql((SubLObject)memoization_state.$kw235$GENL_PREDS_MODIFIED)) {
            return (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym236$REGISTER_GENL_PREDS_DEPENDENT_CACHE_CLEAR_CALLBACK, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym145$QUOTE, reset_function));
        }
        if (clear_when.eql((SubLObject)memoization_state.$kw237$GENLS_MODIFIED)) {
            return (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym238$REGISTER_GENLS_DEPENDENT_CACHE_CLEAR_CALLBACK, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym145$QUOTE, reset_function));
        }
        if (clear_when.eql((SubLObject)memoization_state.$kw239$ISA_MODIFIED)) {
            return (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym240$REGISTER_ISA_DEPENDENT_CACHE_CLEAR_CALLBACK, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym145$QUOTE, reset_function));
        }
        if (clear_when.eql((SubLObject)memoization_state.$kw241$QUOTED_ISA_MODIFIED)) {
            return (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym242$REGISTER_QUOTED_ISA_DEPENDENT_CACHE_CLEAR_CALLBACK, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym145$QUOTE, reset_function));
        }
        if (clear_when.eql((SubLObject)memoization_state.$kw243$WFF_CONSTRAINT_MODIFIED)) {
            return (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym244$REGISTER_WFF_CONSTRAINT_DEPENDENT_CACHE_CLEAR_CALLBACK, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym145$QUOTE, reset_function));
        }
        return (SubLObject)memoization_state.$list230;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 83814L)
    public static SubLObject global_caching_reset_code_new(final SubLObject name) {
        final SubLObject reset_function = global_caching_reset_function(name);
        final SubLObject cs_var = global_caching_variable_new(name);
        return (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym121$PROGN, (SubLObject)ConsesLow.listS((SubLObject)memoization_state.$sym153$DEFINE, reset_function, (SubLObject)memoization_state.NIL, (SubLObject)ConsesLow.listS((SubLObject)memoization_state.$sym17$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym245$CS, cs_var)), (SubLObject)memoization_state.$list246), (SubLObject)memoization_state.$list247));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 84186L)
    public static SubLObject global_caching_remove_function(final SubLObject name) {
        return Packages.intern(PrintLow.format((SubLObject)memoization_state.NIL, (SubLObject)memoization_state.$str248$REMOVE__A, name), (SubLObject)memoization_state.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 84291L)
    public static SubLObject global_caching_n_remove_code_new(final SubLObject name, final SubLObject args, final SubLObject caching_state) {
        final SubLObject remove_function = global_caching_remove_function(name);
        final SubLObject formal_args = define_formal_args(args);
        return (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym153$DEFINE, remove_function, ConsesLow.append(args, (SubLObject)memoization_state.NIL), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym32$RET, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym249$CACHING_STATE_REMOVE_FUNCTION_RESULTS_WITH_ARGS, caching_state, reader.bq_cons((SubLObject)memoization_state.$sym176$LIST, ConsesLow.append(formal_args, (SubLObject)memoization_state.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 84940L)
    public static SubLObject register_hl_store_cache_clear_callback(final SubLObject callback) {
        assert memoization_state.NIL != Types.function_spec_p(callback) : callback;
        if (memoization_state.NIL == conses_high.member(callback, memoization_state.$hl_store_cache_clear_callbacks$.getGlobalValue(), Symbols.symbol_function((SubLObject)memoization_state.EQL), Symbols.symbol_function((SubLObject)memoization_state.IDENTITY))) {
            memoization_state.$hl_store_cache_clear_callbacks$.setGlobalValue((SubLObject)ConsesLow.cons(callback, memoization_state.$hl_store_cache_clear_callbacks$.getGlobalValue()));
        }
        return callback;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 85318L)
    public static SubLObject deregister_hl_store_cache_clear_callback(final SubLObject callback) {
        assert memoization_state.NIL != Types.function_spec_p(callback) : callback;
        memoization_state.$hl_store_cache_clear_callbacks$.setGlobalValue(Sequences.delete(callback, memoization_state.$hl_store_cache_clear_callbacks$.getGlobalValue(), (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED));
        return (SubLObject)memoization_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 85662L)
    public static SubLObject clear_hl_store_dependent_caches() {
        SubLObject cdolist_list_var = memoization_state.$hl_store_cache_clear_callbacks$.getGlobalValue();
        SubLObject callback = (SubLObject)memoization_state.NIL;
        callback = cdolist_list_var.first();
        while (memoization_state.NIL != cdolist_list_var) {
            if (memoization_state.NIL != Symbols.fboundp(callback)) {
                Functions.funcall(callback);
            }
            cdolist_list_var = cdolist_list_var.rest();
            callback = cdolist_list_var.first();
        }
        return (SubLObject)memoization_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 86215L)
    public static SubLObject register_mt_dependent_cache_clear_callback(final SubLObject callback) {
        assert memoization_state.NIL != Types.function_spec_p(callback) : callback;
        if (memoization_state.NIL == conses_high.member(callback, memoization_state.$mt_dependent_cache_clear_callbacks$.getGlobalValue(), Symbols.symbol_function((SubLObject)memoization_state.EQL), Symbols.symbol_function((SubLObject)memoization_state.IDENTITY))) {
            memoization_state.$mt_dependent_cache_clear_callbacks$.setGlobalValue((SubLObject)ConsesLow.cons(callback, memoization_state.$mt_dependent_cache_clear_callbacks$.getGlobalValue()));
        }
        return callback;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 86614L)
    public static SubLObject deregister_mt_dependent_cache_clear_callback(final SubLObject callback) {
        assert memoization_state.NIL != Types.function_spec_p(callback) : callback;
        memoization_state.$mt_dependent_cache_clear_callbacks$.setGlobalValue(Sequences.delete(callback, memoization_state.$mt_dependent_cache_clear_callbacks$.getGlobalValue(), (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED));
        return (SubLObject)memoization_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 87053L)
    public static SubLObject clear_mt_dependent_cachesP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(memoization_state.NIL == memoization_state.$suspend_clearing_mt_dependent_cachesP$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 87158L)
    public static SubLObject without_clearing_mt_dependent_caches(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)memoization_state.$sym17$CLET, (SubLObject)memoization_state.$list252, ConsesLow.append(body, (SubLObject)memoization_state.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 87553L)
    public static SubLObject register_genl_preds_dependent_cache_clear_callback(final SubLObject callback) {
        assert memoization_state.NIL != Types.function_spec_p(callback) : callback;
        if (memoization_state.NIL == conses_high.member(callback, memoization_state.$genl_preds_dependent_cache_clear_callbacks$.getGlobalValue(), Symbols.symbol_function((SubLObject)memoization_state.EQL), Symbols.symbol_function((SubLObject)memoization_state.IDENTITY))) {
            memoization_state.$genl_preds_dependent_cache_clear_callbacks$.setGlobalValue((SubLObject)ConsesLow.cons(callback, memoization_state.$genl_preds_dependent_cache_clear_callbacks$.getGlobalValue()));
        }
        return callback;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 87966L)
    public static SubLObject deregister_genl_preds_dependent_cache_clear_callback(final SubLObject callback) {
        assert memoization_state.NIL != Types.function_spec_p(callback) : callback;
        memoization_state.$genl_preds_dependent_cache_clear_callbacks$.setGlobalValue(Sequences.delete(callback, memoization_state.$genl_preds_dependent_cache_clear_callbacks$.getGlobalValue(), (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED));
        return (SubLObject)memoization_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 88595L)
    public static SubLObject register_genls_dependent_cache_clear_callback(final SubLObject callback) {
        assert memoization_state.NIL != Types.function_spec_p(callback) : callback;
        if (memoization_state.NIL == conses_high.member(callback, memoization_state.$genls_dependent_cache_clear_callbacks$.getGlobalValue(), Symbols.symbol_function((SubLObject)memoization_state.EQL), Symbols.symbol_function((SubLObject)memoization_state.IDENTITY))) {
            memoization_state.$genls_dependent_cache_clear_callbacks$.setGlobalValue((SubLObject)ConsesLow.cons(callback, memoization_state.$genls_dependent_cache_clear_callbacks$.getGlobalValue()));
        }
        return callback;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 88994L)
    public static SubLObject deregister_genls_dependent_cache_clear_callback(final SubLObject callback) {
        assert memoization_state.NIL != Types.function_spec_p(callback) : callback;
        memoization_state.$genls_dependent_cache_clear_callbacks$.setGlobalValue(Sequences.delete(callback, memoization_state.$genls_dependent_cache_clear_callbacks$.getGlobalValue(), (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED));
        return (SubLObject)memoization_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 89612L)
    public static SubLObject register_wff_constraint_dependent_cache_clear_callback(final SubLObject callback) {
        assert memoization_state.NIL != Types.function_spec_p(callback) : callback;
        if (memoization_state.NIL == conses_high.member(callback, memoization_state.$wff_constraint_dependent_cache_clear_callbacks$.getGlobalValue(), Symbols.symbol_function((SubLObject)memoization_state.EQL), Symbols.symbol_function((SubLObject)memoization_state.IDENTITY))) {
            memoization_state.$wff_constraint_dependent_cache_clear_callbacks$.setGlobalValue((SubLObject)ConsesLow.cons(callback, memoization_state.$wff_constraint_dependent_cache_clear_callbacks$.getGlobalValue()));
        }
        return callback;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 90068L)
    public static SubLObject deregister_wff_constraint_dependent_cache_clear_callback(final SubLObject callback) {
        assert memoization_state.NIL != Types.function_spec_p(callback) : callback;
        memoization_state.$wff_constraint_dependent_cache_clear_callbacks$.setGlobalValue(Sequences.delete(callback, memoization_state.$wff_constraint_dependent_cache_clear_callbacks$.getGlobalValue(), (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED));
        return (SubLObject)memoization_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 90738L)
    public static SubLObject register_isa_dependent_cache_clear_callback(final SubLObject callback) {
        assert memoization_state.NIL != Types.function_spec_p(callback) : callback;
        if (memoization_state.NIL == conses_high.member(callback, memoization_state.$isa_dependent_cache_clear_callbacks$.getGlobalValue(), Symbols.symbol_function((SubLObject)memoization_state.EQL), Symbols.symbol_function((SubLObject)memoization_state.IDENTITY))) {
            memoization_state.$isa_dependent_cache_clear_callbacks$.setGlobalValue((SubLObject)ConsesLow.cons(callback, memoization_state.$isa_dependent_cache_clear_callbacks$.getGlobalValue()));
        }
        return callback;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 91131L)
    public static SubLObject deregister_isa_dependent_cache_clear_callback(final SubLObject callback) {
        assert memoization_state.NIL != Types.function_spec_p(callback) : callback;
        memoization_state.$isa_dependent_cache_clear_callbacks$.setGlobalValue(Sequences.delete(callback, memoization_state.$isa_dependent_cache_clear_callbacks$.getGlobalValue(), (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED));
        return (SubLObject)memoization_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 91747L)
    public static SubLObject register_quoted_isa_dependent_cache_clear_callback(final SubLObject callback) {
        assert memoization_state.NIL != Types.function_spec_p(callback) : callback;
        if (memoization_state.NIL == conses_high.member(callback, memoization_state.$quoted_isa_dependent_cache_clear_callbacks$.getGlobalValue(), Symbols.symbol_function((SubLObject)memoization_state.EQL), Symbols.symbol_function((SubLObject)memoization_state.IDENTITY))) {
            memoization_state.$quoted_isa_dependent_cache_clear_callbacks$.setGlobalValue((SubLObject)ConsesLow.cons(callback, memoization_state.$quoted_isa_dependent_cache_clear_callbacks$.getGlobalValue()));
        }
        return callback;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 92160L)
    public static SubLObject deregister_quoted_isa_dependent_cache_clear_callback(final SubLObject callback) {
        assert memoization_state.NIL != Types.function_spec_p(callback) : callback;
        memoization_state.$quoted_isa_dependent_cache_clear_callbacks$.setGlobalValue(Sequences.delete(callback, memoization_state.$quoted_isa_dependent_cache_clear_callbacks$.getGlobalValue(), (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED));
        return (SubLObject)memoization_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 92551L)
    public static SubLObject memoized_already(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)memoization_state.$list258);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_answer = (SubLObject)memoization_state.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)memoization_state.$list258);
        v_answer = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)memoization_state.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)memoization_state.NIL;
        SubLObject current_$12 = (SubLObject)memoization_state.NIL;
        while (memoization_state.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)memoization_state.$list258);
            current_$12 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)memoization_state.$list258);
            if (memoization_state.NIL == conses_high.member(current_$12, (SubLObject)memoization_state.$list259, (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED)) {
                bad = (SubLObject)memoization_state.T;
            }
            if (current_$12 == memoization_state.$kw12$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (memoization_state.NIL != bad && memoization_state.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)memoization_state.$list258);
        }
        final SubLObject test_tail = cdestructuring_bind.property_list_member((SubLObject)memoization_state.$kw64$TEST, current);
        final SubLObject test = (SubLObject)((memoization_state.NIL != test_tail) ? conses_high.cadr(test_tail) : memoization_state.NIL);
        final SubLObject form;
        current = (form = temp);
        return (SubLObject)memoization_state.$list260;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 92974L)
    public static SubLObject cached_already(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)memoization_state.$list258);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_answer = (SubLObject)memoization_state.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)memoization_state.$list258);
        v_answer = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)memoization_state.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)memoization_state.NIL;
        SubLObject current_$13 = (SubLObject)memoization_state.NIL;
        while (memoization_state.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)memoization_state.$list258);
            current_$13 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)memoization_state.$list258);
            if (memoization_state.NIL == conses_high.member(current_$13, (SubLObject)memoization_state.$list259, (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED)) {
                bad = (SubLObject)memoization_state.T;
            }
            if (current_$13 == memoization_state.$kw12$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (memoization_state.NIL != bad && memoization_state.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)memoization_state.$list258);
        }
        final SubLObject test_tail = cdestructuring_bind.property_list_member((SubLObject)memoization_state.$kw64$TEST, current);
        final SubLObject test = (SubLObject)((memoization_state.NIL != test_tail) ? conses_high.cadr(test_tail) : memoization_state.NIL);
        final SubLObject form;
        current = (form = temp);
        return (SubLObject)memoization_state.$list261;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 94056L)
    public static SubLObject define_formal_args(final SubLObject args) {
        SubLObject formal_args = (SubLObject)memoization_state.NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = (SubLObject)memoization_state.NIL;
        arg = cdolist_list_var.first();
        while (memoization_state.NIL != cdolist_list_var) {
            if (arg != memoization_state.$sym262$_OPTIONAL) {
                if (arg.isCons()) {
                    formal_args = (SubLObject)ConsesLow.cons(arg.first(), formal_args);
                }
                else {
                    formal_args = (SubLObject)ConsesLow.cons(arg, formal_args);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        return Sequences.nreverse(formal_args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 96308L)
    public static SubLObject caching_results(final SubLObject results) {
        if (memoization_state.NIL != results.rest()) {
            return subl_promotions.values_list(results);
        }
        return results.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 96600L)
    public static SubLObject global_caching_note_function_code(final SubLObject internal_function) {
        return (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym264$NOTE_GLOBALLY_CACHED_FUNCTION, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym145$QUOTE, internal_function));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 96775L)
    public static SubLObject caching_internal_function(final SubLObject name) {
        return Packages.intern(PrintLow.format((SubLObject)memoization_state.NIL, (SubLObject)memoization_state.$str265$_A_INTERNAL, name), (SubLObject)memoization_state.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 96877L)
    public static SubLObject caching_internal_function_code(final SubLObject internal_function, final SubLObject args, final SubLObject body) {
        return (SubLObject)ConsesLow.listS((SubLObject)memoization_state.$sym266$DEFINE_PROTECTED, internal_function, ConsesLow.append(args, (SubLObject)memoization_state.NIL), ConsesLow.append(body, (SubLObject)memoization_state.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/memoization-state.lisp", position = 97024L)
    public static SubLObject caching_faccess_code(final SubLObject faccess, final SubLObject name, final SubLObject args) {
        if (memoization_state.NIL != conses_high.member(faccess, (SubLObject)memoization_state.$list267, (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED)) {
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym121$PROGN, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym268$REGISTER_EXTERNAL_SYMBOL, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym145$QUOTE, name)), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym151$DECLAIM, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym152$FACCESS, (SubLObject)memoization_state.$sym269$PUBLIC, name))));
        }
        if (faccess == memoization_state.$sym270$API) {
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym121$PROGN, (SubLObject)ConsesLow.listS((SubLObject)memoization_state.$sym271$REGISTER_CYC_API_FUNCTION, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym145$QUOTE, name), args, (SubLObject)memoization_state.$list272), (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym151$DECLAIM, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym152$FACCESS, (SubLObject)memoization_state.$sym269$PUBLIC, name))));
        }
        if (memoization_state.NIL != conses_high.member(faccess, (SubLObject)memoization_state.$list273, (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED)) {
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym151$DECLAIM, (SubLObject)ConsesLow.list((SubLObject)memoization_state.$sym152$FACCESS, faccess, name)));
        }
        Errors.warn((SubLObject)memoization_state.$str274$_A_is_not_a_known_FACCESS_visibil);
        return (SubLObject)memoization_state.NIL;
    }
    
    public static SubLObject declare_memoization_state_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "note_cached_function_called", "NOTE-CACHED-FUNCTION-CALLED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "note_cached_function_called_but_not_cached", "NOTE-CACHED-FUNCTION-CALLED-BUT-NOT-CACHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "show_function_caching_results", "SHOW-FUNCTION-CACHING-RESULTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "clear_function_caching_results", "CLEAR-FUNCTION-CACHING-RESULTS", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.memoization_state", "with_caching_mode", "WITH-CACHING-MODE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "caching_mode_enable", "CACHING-MODE-ENABLE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "caching_mode_disable", "CACHING-MODE-DISABLE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "caching_disabled", "CACHING-DISABLED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "sxhash_calc_n", "SXHASH-CALC-N", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "sxhash_calc_10", "SXHASH-CALC-10", 10, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "sxhash_calc_9", "SXHASH-CALC-9", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "sxhash_calc_8", "SXHASH-CALC-8", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "sxhash_calc_7", "SXHASH-CALC-7", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "sxhash_calc_6", "SXHASH-CALC-6", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "sxhash_calc_5", "SXHASH-CALC-5", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "sxhash_calc_4", "SXHASH-CALC-4", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "sxhash_calc_3", "SXHASH-CALC-3", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "sxhash_calc_2", "SXHASH-CALC-2", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.memoization_state", "possibly_with_memoization_state_writer_lock", "POSSIBLY-WITH-MEMOIZATION-STATE-WRITER-LOCK");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.memoization_state", "possibly_with_memoization_state_reader_lock", "POSSIBLY-WITH-MEMOIZATION-STATE-READER-LOCK");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.memoization_state", "possibly_with_caching_state_writer_lock", "POSSIBLY-WITH-CACHING-STATE-WRITER-LOCK");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.memoization_state", "possibly_with_caching_state_reader_lock", "POSSIBLY-WITH-CACHING-STATE-READER-LOCK");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "caching_state_print_function_trampoline", "CACHING-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "caching_state_p", "CACHING-STATE-P", 1, 0, false);
        new $caching_state_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "caching_state_store", "CACHING-STATE-STORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "caching_state_zero_arg_results", "CACHING-STATE-ZERO-ARG-RESULTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "caching_state_lock", "CACHING-STATE-LOCK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "caching_state_capacity", "CACHING-STATE-CAPACITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "caching_state_func_symbol", "CACHING-STATE-FUNC-SYMBOL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "caching_state_test", "CACHING-STATE-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "caching_state_args_length", "CACHING-STATE-ARGS-LENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "_csetf_caching_state_store", "_CSETF-CACHING-STATE-STORE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "_csetf_caching_state_zero_arg_results", "_CSETF-CACHING-STATE-ZERO-ARG-RESULTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "_csetf_caching_state_lock", "_CSETF-CACHING-STATE-LOCK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "_csetf_caching_state_capacity", "_CSETF-CACHING-STATE-CAPACITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "_csetf_caching_state_func_symbol", "_CSETF-CACHING-STATE-FUNC-SYMBOL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "_csetf_caching_state_test", "_CSETF-CACHING-STATE-TEST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "_csetf_caching_state_args_length", "_CSETF-CACHING-STATE-ARGS-LENGTH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "make_caching_state", "MAKE-CACHING-STATE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "visit_defstruct_caching_state", "VISIT-DEFSTRUCT-CACHING-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "visit_defstruct_object_caching_state_method", "VISIT-DEFSTRUCT-OBJECT-CACHING-STATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "create_caching_state", "CREATE-CACHING-STATE", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "print_caching_state_internal", "PRINT-CACHING-STATE-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "print_caching_state", "PRINT-CACHING-STATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "caching_state_get_zero_arg_results_internal", "CACHING-STATE-GET-ZERO-ARG-RESULTS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "caching_state_get_zero_arg_results", "CACHING-STATE-GET-ZERO-ARG-RESULTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "caching_state_set_zero_arg_results_internal", "CACHING-STATE-SET-ZERO-ARG-RESULTS-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "caching_state_set_zero_arg_results", "CACHING-STATE-SET-ZERO-ARG-RESULTS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "caching_state_lookup_internal", "CACHING-STATE-LOOKUP-INTERNAL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "caching_state_lookup", "CACHING-STATE-LOOKUP", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "caching_state_put_internal", "CACHING-STATE-PUT-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "caching_state_put", "CACHING-STATE-PUT", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "caching_state_clear_internal", "CACHING-STATE-CLEAR-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "caching_state_clear", "CACHING-STATE-CLEAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "caching_state_get_capacity", "CACHING-STATE-GET-CAPACITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "caching_state_get_func_symbol", "CACHING-STATE-GET-FUNC-SYMBOL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "caching_state_get_test", "CACHING-STATE-GET-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "caching_state_keys_internal", "CACHING-STATE-KEYS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "caching_state_keys", "CACHING-STATE-KEYS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "caching_state_size_internal", "CACHING-STATE-SIZE-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "caching_state_size", "CACHING-STATE-SIZE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "caching_state_size_robust", "CACHING-STATE-SIZE-ROBUST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "caching_state_remove_internal", "CACHING-STATE-REMOVE-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "caching_state_remove", "CACHING-STATE-REMOVE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "caching_state_remove_function_results_with_args_internal", "CACHING-STATE-REMOVE-FUNCTION-RESULTS-WITH-ARGS-INTERNAL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "caching_state_remove_function_results_with_args", "CACHING-STATE-REMOVE-FUNCTION-RESULTS-WITH-ARGS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "caching_state_clone_internal", "CACHING-STATE-CLONE-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "caching_state_store_as_dictionary", "CACHING-STATE-STORE-AS-DICTIONARY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "caching_state_clone", "CACHING-STATE-CLONE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "caching_state_multi_key_n_is_cached", "CACHING-STATE-MULTI-KEY-N-IS-CACHED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "caching_state_lookup_multi_key_n", "CACHING-STATE-LOOKUP-MULTI-KEY-N", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "caching_state_lookup_multi_key_1", "CACHING-STATE-LOOKUP-MULTI-KEY-1", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "caching_state_enter_multi_key_n", "CACHING-STATE-ENTER-MULTI-KEY-N", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "memoization_state_print_function_trampoline", "MEMOIZATION-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "memoization_state_p", "MEMOIZATION-STATE-P", 1, 0, false);
        new $memoization_state_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "memoization_state_store", "MEMOIZATION-STATE-STORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "memoization_state_current_process", "MEMOIZATION-STATE-CURRENT-PROCESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "memoization_state_lock", "MEMOIZATION-STATE-LOCK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "memoization_state_name", "MEMOIZATION-STATE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "memoization_state_should_clone", "MEMOIZATION-STATE-SHOULD-CLONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "_csetf_memoization_state_store", "_CSETF-MEMOIZATION-STATE-STORE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "_csetf_memoization_state_current_process", "_CSETF-MEMOIZATION-STATE-CURRENT-PROCESS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "_csetf_memoization_state_lock", "_CSETF-MEMOIZATION-STATE-LOCK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "_csetf_memoization_state_name", "_CSETF-MEMOIZATION-STATE-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "_csetf_memoization_state_should_clone", "_CSETF-MEMOIZATION-STATE-SHOULD-CLONE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "make_memoization_state", "MAKE-MEMOIZATION-STATE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "visit_defstruct_memoization_state", "VISIT-DEFSTRUCT-MEMOIZATION-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "visit_defstruct_object_memoization_state_method", "VISIT-DEFSTRUCT-OBJECT-MEMOIZATION-STATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "create_memoization_state", "CREATE-MEMOIZATION-STATE", 0, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "new_memoization_state", "NEW-MEMOIZATION-STATE", 0, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "print_memoization_state_internal", "PRINT-MEMOIZATION-STATE-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "print_memoization_state", "PRINT-MEMOIZATION-STATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "memoization_state_lookup_internal", "MEMOIZATION-STATE-LOOKUP-INTERNAL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "memoization_state_lookup", "MEMOIZATION-STATE-LOOKUP", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "memoization_state_get_caching_state_for_function", "MEMOIZATION-STATE-GET-CACHING-STATE-FOR-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "memoization_state_put_internal", "MEMOIZATION-STATE-PUT-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "memoization_state_put", "MEMOIZATION-STATE-PUT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "memoization_state_remove_internal", "MEMOIZATION-STATE-REMOVE-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "memoization_state_remove", "MEMOIZATION-STATE-REMOVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "memoization_state_clear_internal", "MEMOIZATION-STATE-CLEAR-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "memoization_state_clear", "MEMOIZATION-STATE-CLEAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "memoization_state_get_test", "MEMOIZATION-STATE-GET-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "memoization_state_get_lock", "MEMOIZATION-STATE-GET-LOCK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "memoization_state_get_name", "MEMOIZATION-STATE-GET-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "memoization_state_get_should_clone", "MEMOIZATION-STATE-GET-SHOULD-CLONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "memoization_state_get_current_process_internal", "MEMOIZATION-STATE-GET-CURRENT-PROCESS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "memoization_state_get_current_process", "MEMOIZATION-STATE-GET-CURRENT-PROCESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "memoization_state_keys_internal", "MEMOIZATION-STATE-KEYS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "memoization_state_keys", "MEMOIZATION-STATE-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "memoization_state_set_current_process_internal", "MEMOIZATION-STATE-SET-CURRENT-PROCESS-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "memoization_state_set_current_process", "MEMOIZATION-STATE-SET-CURRENT-PROCESS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "memoization_state_clone", "MEMOIZATION-STATE-CLONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "memoization_state_merge_cloned_state", "MEMOIZATION-STATE-MERGE-CLONED-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "caching_state_results_has_argsP", "CACHING-STATE-RESULTS-HAS-ARGS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "gather_memoization_state_statistics", "GATHER-MEMOIZATION-STATE-STATISTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "gather_memoization_state_statistics_unlocked", "GATHER-MEMOIZATION-STATE-STATISTICS-UNLOCKED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "gather_caching_state_store_statistics", "GATHER-CACHING-STATE-STORE-STATISTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "current_memoization_state", "CURRENT-MEMOIZATION-STATE", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.memoization_state", "with_memoization_state", "WITH-MEMOIZATION-STATE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "memoization_state_original_process", "MEMOIZATION-STATE-ORIGINAL-PROCESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "memoization_state_possibly_clear_original_process", "MEMOIZATION-STATE-POSSIBLY-CLEAR-ORIGINAL-PROCESS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "possibly_clone_memoization_state", "POSSIBLY-CLONE-MEMOIZATION-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "possibly_merge_back_memoization_state", "POSSIBLY-MERGE-BACK-MEMOIZATION-STATE", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.memoization_state", "with_new_memoization_state", "WITH-NEW-MEMOIZATION-STATE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.memoization_state", "with_new_profiled_memoization_state", "WITH-NEW-PROFILED-MEMOIZATION-STATE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.memoization_state", "with_possibly_new_memoization_state", "WITH-POSSIBLY-NEW-MEMOIZATION-STATE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "possibly_new_memoization_state", "POSSIBLY-NEW-MEMOIZATION-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "clear_memoization", "CLEAR-MEMOIZATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "clear_current_memoization", "CLEAR-CURRENT-MEMOIZATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "clear_all_memoization", "CLEAR-ALL-MEMOIZATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "clear_all_current_memoization", "CLEAR-ALL-CURRENT-MEMOIZATION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "memoization_state_remove_function_results_with_args", "MEMOIZATION-STATE-REMOVE-FUNCTION-RESULTS-WITH-ARGS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "current_memoization_state_remove_function_results_with_args", "CURRENT-MEMOIZATION-STATE-REMOVE-FUNCTION-RESULTS-WITH-ARGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "note_memoized_function", "NOTE-MEMOIZED-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "memoized_functions", "MEMOIZED-FUNCTIONS", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.memoization_state", "define_memoized", "DEFINE-MEMOIZED");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "macro_test_to_run_time_test", "MACRO-TEST-TO-RUN-TIME-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "define_memoized_internal", "DEFINE-MEMOIZED-INTERNAL", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "define_memoized_internal_0_or_1", "DEFINE-MEMOIZED-INTERNAL-0-OR-1", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "define_memoized_internal_n", "DEFINE-MEMOIZED-INTERNAL-N", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "caching_sxhash_code", "CACHING-SXHASH-CODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "caching_lookup_code", "CACHING-LOOKUP-CODE", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "lookup_memoization_state_code", "LOOKUP-MEMOIZATION-STATE-CODE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "note_memoized_function_code", "NOTE-MEMOIZED-FUNCTION-CODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "note_globally_cached_function", "NOTE-GLOBALLY-CACHED-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "globally_cached_functions", "GLOBALLY-CACHED-FUNCTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "global_cache_variables", "GLOBAL-CACHE-VARIABLES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "global_cache_variable_values", "GLOBAL-CACHE-VARIABLE-VALUES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "memoized_or_cached_functions", "MEMOIZED-OR-CACHED-FUNCTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "clear_all_globally_cached_functions", "CLEAR-ALL-GLOBALLY-CACHED-FUNCTIONS", 0, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.memoization_state", "define_cached_new", "DEFINE-CACHED-NEW");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.memoization_state", "define_cached", "DEFINE-CACHED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.memoization_state", "define_cached_multiarg", "DEFINE-CACHED-MULTIARG");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "cache_clear_trigger_p", "CACHE-CLEAR-TRIGGER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "atomic_cache_clear_trigger_p", "ATOMIC-CACHE-CLEAR-TRIGGER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "define_cached_internal", "DEFINE-CACHED-INTERNAL", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "define_cached_internal_0_or_1", "DEFINE-CACHED-INTERNAL-0-OR-1", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "define_cached_internal_n", "DEFINE-CACHED-INTERNAL-N", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "load_caching_state_contents_from_hash_table", "LOAD-CACHING-STATE-CONTENTS-FROM-HASH-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "load_caching_state_contents_from_hash_table_internal", "LOAD-CACHING-STATE-CONTENTS-FROM-HASH-TABLE-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "get_caching_state_contents_as_hash_table", "GET-CACHING-STATE-CONTENTS-AS-HASH-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "get_caching_state_contents_as_hash_table_internal", "GET-CACHING-STATE-CONTENTS-AS-HASH-TABLE-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "get_caching_state_for_globally_cached_function", "GET-CACHING-STATE-FOR-GLOBALLY-CACHED-FUNCTION", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "create_global_caching_state_for_name", "CREATE-GLOBAL-CACHING-STATE-FOR-NAME", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "memoize_caching_state_for_function_new", "MEMOIZE-CACHING-STATE-FOR-FUNCTION-NEW", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "global_caching_reset_from_function", "GLOBAL-CACHING-RESET-FROM-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "global_caching_lock", "GLOBAL-CACHING-LOCK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "global_caching_variable_new", "GLOBAL-CACHING-VARIABLE-NEW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "global_caching_variable_code", "GLOBAL-CACHING-VARIABLE-CODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "global_caching_reset_function", "GLOBAL-CACHING-RESET-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "global_caching_register_reset_code_new", "GLOBAL-CACHING-REGISTER-RESET-CODE-NEW", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "global_caching_register_reset_code_atomic", "GLOBAL-CACHING-REGISTER-RESET-CODE-ATOMIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "global_caching_reset_code_new", "GLOBAL-CACHING-RESET-CODE-NEW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "global_caching_remove_function", "GLOBAL-CACHING-REMOVE-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "global_caching_n_remove_code_new", "GLOBAL-CACHING-N-REMOVE-CODE-NEW", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "register_hl_store_cache_clear_callback", "REGISTER-HL-STORE-CACHE-CLEAR-CALLBACK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "deregister_hl_store_cache_clear_callback", "DEREGISTER-HL-STORE-CACHE-CLEAR-CALLBACK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "clear_hl_store_dependent_caches", "CLEAR-HL-STORE-DEPENDENT-CACHES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "register_mt_dependent_cache_clear_callback", "REGISTER-MT-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "deregister_mt_dependent_cache_clear_callback", "DEREGISTER-MT-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "clear_mt_dependent_cachesP", "CLEAR-MT-DEPENDENT-CACHES?", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.memoization_state", "without_clearing_mt_dependent_caches", "WITHOUT-CLEARING-MT-DEPENDENT-CACHES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "register_genl_preds_dependent_cache_clear_callback", "REGISTER-GENL-PREDS-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "deregister_genl_preds_dependent_cache_clear_callback", "DEREGISTER-GENL-PREDS-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "register_genls_dependent_cache_clear_callback", "REGISTER-GENLS-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "deregister_genls_dependent_cache_clear_callback", "DEREGISTER-GENLS-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "register_wff_constraint_dependent_cache_clear_callback", "REGISTER-WFF-CONSTRAINT-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "deregister_wff_constraint_dependent_cache_clear_callback", "DEREGISTER-WFF-CONSTRAINT-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "register_isa_dependent_cache_clear_callback", "REGISTER-ISA-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "deregister_isa_dependent_cache_clear_callback", "DEREGISTER-ISA-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "register_quoted_isa_dependent_cache_clear_callback", "REGISTER-QUOTED-ISA-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "deregister_quoted_isa_dependent_cache_clear_callback", "DEREGISTER-QUOTED-ISA-DEPENDENT-CACHE-CLEAR-CALLBACK", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.memoization_state", "memoized_already", "MEMOIZED-ALREADY");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.memoization_state", "cached_already", "CACHED-ALREADY");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "define_formal_args", "DEFINE-FORMAL-ARGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "caching_results", "CACHING-RESULTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "global_caching_note_function_code", "GLOBAL-CACHING-NOTE-FUNCTION-CODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "caching_internal_function", "CACHING-INTERNAL-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "caching_internal_function_code", "CACHING-INTERNAL-FUNCTION-CODE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.memoization_state", "caching_faccess_code", "CACHING-FACCESS-CODE", 3, 0, false);
        return (SubLObject)memoization_state.NIL;
    }
    
    public static SubLObject init_memoization_state_file() {
        memoization_state.$global_caching_lock$ = SubLFiles.deflexical("*GLOBAL-CACHING-LOCK*", ReadWriteLocks.new_rw_lock((SubLObject)memoization_state.$str0$global_caching_lock));
        memoization_state.$caching_mode_should_monitor$ = SubLFiles.deflexical("*CACHING-MODE-SHOULD-MONITOR*", (SubLObject)(maybeDefault((SubLObject)memoization_state.$sym1$_CACHING_MODE_SHOULD_MONITOR_, memoization_state.$caching_mode_should_monitor$, memoization_state.NIL)));
        memoization_state.$cache_monitor_hash$ = SubLFiles.deflexical("*CACHE-MONITOR-HASH*", maybeDefault((SubLObject)memoization_state.$sym2$_CACHE_MONITOR_HASH_, memoization_state.$cache_monitor_hash$, ()->(Hashtables.make_hash_table((SubLObject)memoization_state.SIXTEEN_INTEGER, (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED))));
        memoization_state.$cache_monitor_failure_hash$ = SubLFiles.deflexical("*CACHE-MONITOR-FAILURE-HASH*", maybeDefault((SubLObject)memoization_state.$sym3$_CACHE_MONITOR_FAILURE_HASH_, memoization_state.$cache_monitor_failure_hash$, ()->(Hashtables.make_hash_table((SubLObject)memoization_state.SIXTEEN_INTEGER, (SubLObject)memoization_state.UNPROVIDED, (SubLObject)memoization_state.UNPROVIDED))));
        memoization_state.$allow_function_caching_to_be_disabled$ = SubLFiles.deflexical("*ALLOW-FUNCTION-CACHING-TO-BE-DISABLED*", (SubLObject)(maybeDefault((SubLObject)memoization_state.$sym8$_ALLOW_FUNCTION_CACHING_TO_BE_DISABLED_, memoization_state.$allow_function_caching_to_be_disabled$, memoization_state.NIL)));
        memoization_state.$caching_mode_enabled$ = SubLFiles.defvar("*CACHING-MODE-ENABLED*", (SubLObject)memoization_state.$kw9$ALL);
        memoization_state.$caching_mode_disabled$ = SubLFiles.defvar("*CACHING-MODE-DISABLED*", (SubLObject)memoization_state.NIL);
        memoization_state.$function_caching_enabledP$ = SubLFiles.defparameter("*FUNCTION-CACHING-ENABLED?*", (SubLObject)memoization_state.T);
        memoization_state.$memoized_item_not_found$ = SubLFiles.defconstant("*MEMOIZED-ITEM-NOT-FOUND*", (SubLObject)memoization_state.$kw35$_MEMOIZED_ITEM_NOT_FOUND_);
        memoization_state.$dtp_caching_state$ = SubLFiles.defconstant("*DTP-CACHING-STATE*", (SubLObject)memoization_state.$sym36$CACHING_STATE);
        memoization_state.$dtp_memoization_state$ = SubLFiles.defconstant("*DTP-MEMOIZATION-STATE*", (SubLObject)memoization_state.$sym82$MEMOIZATION_STATE);
        memoization_state.$memoization_state$ = SubLFiles.defparameter("*MEMOIZATION-STATE*", (SubLObject)memoization_state.NIL);
        memoization_state.$memoized_functions$ = SubLFiles.deflexical("*MEMOIZED-FUNCTIONS*", (SubLObject)(maybeDefault((SubLObject)memoization_state.$sym135$_MEMOIZED_FUNCTIONS_, memoization_state.$memoized_functions$, memoization_state.NIL)));
        memoization_state.$globally_cached_functions$ = SubLFiles.deflexical("*GLOBALLY-CACHED-FUNCTIONS*", (SubLObject)(maybeDefault((SubLObject)memoization_state.$sym200$_GLOBALLY_CACHED_FUNCTIONS_, memoization_state.$globally_cached_functions$, memoization_state.NIL)));
        memoization_state.$cache_clear_triggers$ = SubLFiles.deflexical("*CACHE-CLEAR-TRIGGERS*", (SubLObject)memoization_state.$list215);
        memoization_state.$hl_store_cache_clear_callbacks$ = SubLFiles.deflexical("*HL-STORE-CACHE-CLEAR-CALLBACKS*", (SubLObject)(maybeDefault((SubLObject)memoization_state.$sym250$_HL_STORE_CACHE_CLEAR_CALLBACKS_, memoization_state.$hl_store_cache_clear_callbacks$, memoization_state.NIL)));
        memoization_state.$mt_dependent_cache_clear_callbacks$ = SubLFiles.deflexical("*MT-DEPENDENT-CACHE-CLEAR-CALLBACKS*", (SubLObject)(maybeDefault((SubLObject)memoization_state.$sym251$_MT_DEPENDENT_CACHE_CLEAR_CALLBACKS_, memoization_state.$mt_dependent_cache_clear_callbacks$, memoization_state.NIL)));
        memoization_state.$suspend_clearing_mt_dependent_cachesP$ = SubLFiles.defparameter("*SUSPEND-CLEARING-MT-DEPENDENT-CACHES?*", (SubLObject)memoization_state.NIL);
        memoization_state.$genl_preds_dependent_cache_clear_callbacks$ = SubLFiles.deflexical("*GENL-PREDS-DEPENDENT-CACHE-CLEAR-CALLBACKS*", (SubLObject)(maybeDefault((SubLObject)memoization_state.$sym253$_GENL_PREDS_DEPENDENT_CACHE_CLEAR_CALLBACKS_, memoization_state.$genl_preds_dependent_cache_clear_callbacks$, memoization_state.NIL)));
        memoization_state.$genls_dependent_cache_clear_callbacks$ = SubLFiles.deflexical("*GENLS-DEPENDENT-CACHE-CLEAR-CALLBACKS*", (SubLObject)(maybeDefault((SubLObject)memoization_state.$sym254$_GENLS_DEPENDENT_CACHE_CLEAR_CALLBACKS_, memoization_state.$genls_dependent_cache_clear_callbacks$, memoization_state.NIL)));
        memoization_state.$wff_constraint_dependent_cache_clear_callbacks$ = SubLFiles.deflexical("*WFF-CONSTRAINT-DEPENDENT-CACHE-CLEAR-CALLBACKS*", (SubLObject)(maybeDefault((SubLObject)memoization_state.$sym255$_WFF_CONSTRAINT_DEPENDENT_CACHE_CLEAR_CALLBACKS_, memoization_state.$wff_constraint_dependent_cache_clear_callbacks$, memoization_state.NIL)));
        memoization_state.$isa_dependent_cache_clear_callbacks$ = SubLFiles.deflexical("*ISA-DEPENDENT-CACHE-CLEAR-CALLBACKS*", (SubLObject)(maybeDefault((SubLObject)memoization_state.$sym256$_ISA_DEPENDENT_CACHE_CLEAR_CALLBACKS_, memoization_state.$isa_dependent_cache_clear_callbacks$, memoization_state.NIL)));
        memoization_state.$quoted_isa_dependent_cache_clear_callbacks$ = SubLFiles.deflexical("*QUOTED-ISA-DEPENDENT-CACHE-CLEAR-CALLBACKS*", (SubLObject)(maybeDefault((SubLObject)memoization_state.$sym257$_QUOTED_ISA_DEPENDENT_CACHE_CLEAR_CALLBACKS_, memoization_state.$quoted_isa_dependent_cache_clear_callbacks$, memoization_state.NIL)));
        memoization_state.$caching_n_sxhash_composite_value$ = SubLFiles.defconstant("*CACHING-N-SXHASH-COMPOSITE-VALUE*", (SubLObject)memoization_state.$int21$167);
        return (SubLObject)memoization_state.NIL;
    }
    
    public static SubLObject setup_memoization_state_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)memoization_state.$sym1$_CACHING_MODE_SHOULD_MONITOR_);
        subl_macro_promotions.declare_defglobal((SubLObject)memoization_state.$sym2$_CACHE_MONITOR_HASH_);
        subl_macro_promotions.declare_defglobal((SubLObject)memoization_state.$sym3$_CACHE_MONITOR_FAILURE_HASH_);
        subl_macro_promotions.declare_defglobal((SubLObject)memoization_state.$sym8$_ALLOW_FUNCTION_CACHING_TO_BE_DISABLED_);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), memoization_state.$dtp_caching_state$.getGlobalValue(), Symbols.symbol_function((SubLObject)memoization_state.$sym43$CACHING_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)memoization_state.$list44);
        Structures.def_csetf((SubLObject)memoization_state.$sym45$CACHING_STATE_STORE, (SubLObject)memoization_state.$sym46$_CSETF_CACHING_STATE_STORE);
        Structures.def_csetf((SubLObject)memoization_state.$sym47$CACHING_STATE_ZERO_ARG_RESULTS, (SubLObject)memoization_state.$sym48$_CSETF_CACHING_STATE_ZERO_ARG_RESULTS);
        Structures.def_csetf((SubLObject)memoization_state.$sym49$CACHING_STATE_LOCK, (SubLObject)memoization_state.$sym50$_CSETF_CACHING_STATE_LOCK);
        Structures.def_csetf((SubLObject)memoization_state.$sym51$CACHING_STATE_CAPACITY, (SubLObject)memoization_state.$sym52$_CSETF_CACHING_STATE_CAPACITY);
        Structures.def_csetf((SubLObject)memoization_state.$sym53$CACHING_STATE_FUNC_SYMBOL, (SubLObject)memoization_state.$sym54$_CSETF_CACHING_STATE_FUNC_SYMBOL);
        Structures.def_csetf((SubLObject)memoization_state.$sym55$CACHING_STATE_TEST, (SubLObject)memoization_state.$sym56$_CSETF_CACHING_STATE_TEST);
        Structures.def_csetf((SubLObject)memoization_state.$sym57$CACHING_STATE_ARGS_LENGTH, (SubLObject)memoization_state.$sym58$_CSETF_CACHING_STATE_ARGS_LENGTH);
        Equality.identity((SubLObject)memoization_state.$sym36$CACHING_STATE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), memoization_state.$dtp_caching_state$.getGlobalValue(), Symbols.symbol_function((SubLObject)memoization_state.$sym71$VISIT_DEFSTRUCT_OBJECT_CACHING_STATE_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), memoization_state.$dtp_memoization_state$.getGlobalValue(), Symbols.symbol_function((SubLObject)memoization_state.$sym89$MEMOIZATION_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)memoization_state.$list90);
        Structures.def_csetf((SubLObject)memoization_state.$sym91$MEMOIZATION_STATE_STORE, (SubLObject)memoization_state.$sym92$_CSETF_MEMOIZATION_STATE_STORE);
        Structures.def_csetf((SubLObject)memoization_state.$sym93$MEMOIZATION_STATE_CURRENT_PROCESS, (SubLObject)memoization_state.$sym94$_CSETF_MEMOIZATION_STATE_CURRENT_PROCESS);
        Structures.def_csetf((SubLObject)memoization_state.$sym24$MEMOIZATION_STATE_LOCK, (SubLObject)memoization_state.$sym95$_CSETF_MEMOIZATION_STATE_LOCK);
        Structures.def_csetf((SubLObject)memoization_state.$sym96$MEMOIZATION_STATE_NAME, (SubLObject)memoization_state.$sym97$_CSETF_MEMOIZATION_STATE_NAME);
        Structures.def_csetf((SubLObject)memoization_state.$sym98$MEMOIZATION_STATE_SHOULD_CLONE, (SubLObject)memoization_state.$sym99$_CSETF_MEMOIZATION_STATE_SHOULD_CLONE);
        Equality.identity((SubLObject)memoization_state.$sym82$MEMOIZATION_STATE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), memoization_state.$dtp_memoization_state$.getGlobalValue(), Symbols.symbol_function((SubLObject)memoization_state.$sym104$VISIT_DEFSTRUCT_OBJECT_MEMOIZATION_STATE_METHOD));
        access_macros.register_macro_helper((SubLObject)memoization_state.$sym119$MEMOIZATION_STATE_ORIGINAL_PROCESS, (SubLObject)memoization_state.$sym123$WITH_MEMOIZATION_STATE);
        access_macros.register_macro_helper((SubLObject)memoization_state.$sym122$MEMOIZATION_STATE_POSSIBLY_CLEAR_ORIGINAL_PROCESS, (SubLObject)memoization_state.$sym123$WITH_MEMOIZATION_STATE);
        access_macros.register_macro_helper((SubLObject)memoization_state.$sym133$POSSIBLY_NEW_MEMOIZATION_STATE, (SubLObject)memoization_state.$sym134$WITH_POSSIBLY_NEW_MEMOIZATION_STATE);
        subl_macro_promotions.declare_defglobal((SubLObject)memoization_state.$sym135$_MEMOIZED_FUNCTIONS_);
        access_macros.register_external_symbol((SubLObject)memoization_state.$sym137$DEFINE_MEMOIZED);
        subl_macro_promotions.declare_defglobal((SubLObject)memoization_state.$sym200$_GLOBALLY_CACHED_FUNCTIONS_);
        access_macros.register_external_symbol((SubLObject)memoization_state.$sym208$DEFINE_CACHED_NEW);
        subl_macro_promotions.declare_defglobal((SubLObject)memoization_state.$sym250$_HL_STORE_CACHE_CLEAR_CALLBACKS_);
        subl_macro_promotions.declare_defglobal((SubLObject)memoization_state.$sym251$_MT_DEPENDENT_CACHE_CLEAR_CALLBACKS_);
        subl_macro_promotions.declare_defglobal((SubLObject)memoization_state.$sym253$_GENL_PREDS_DEPENDENT_CACHE_CLEAR_CALLBACKS_);
        subl_macro_promotions.declare_defglobal((SubLObject)memoization_state.$sym254$_GENLS_DEPENDENT_CACHE_CLEAR_CALLBACKS_);
        subl_macro_promotions.declare_defglobal((SubLObject)memoization_state.$sym255$_WFF_CONSTRAINT_DEPENDENT_CACHE_CLEAR_CALLBACKS_);
        subl_macro_promotions.declare_defglobal((SubLObject)memoization_state.$sym256$_ISA_DEPENDENT_CACHE_CLEAR_CALLBACKS_);
        subl_macro_promotions.declare_defglobal((SubLObject)memoization_state.$sym257$_QUOTED_ISA_DEPENDENT_CACHE_CLEAR_CALLBACKS_);
        access_macros.register_macro_helper((SubLObject)memoization_state.$sym167$CACHING_RESULTS, (SubLObject)memoization_state.$list263);
        return (SubLObject)memoization_state.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_memoization_state_file();
    }
    
    @Override
	public void initializeVariables() {
        init_memoization_state_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_memoization_state_file();
    }
    
    static {
        me = (SubLFile)new memoization_state();
        memoization_state.$global_caching_lock$ = null;
        memoization_state.$caching_mode_should_monitor$ = null;
        memoization_state.$cache_monitor_hash$ = null;
        memoization_state.$cache_monitor_failure_hash$ = null;
        memoization_state.$allow_function_caching_to_be_disabled$ = null;
        memoization_state.$caching_mode_enabled$ = null;
        memoization_state.$caching_mode_disabled$ = null;
        memoization_state.$function_caching_enabledP$ = null;
        memoization_state.$memoized_item_not_found$ = null;
        memoization_state.$dtp_caching_state$ = null;
        memoization_state.$dtp_memoization_state$ = null;
        memoization_state.$memoization_state$ = null;
        memoization_state.$memoized_functions$ = null;
        memoization_state.$globally_cached_functions$ = null;
        memoization_state.$cache_clear_triggers$ = null;
        memoization_state.$hl_store_cache_clear_callbacks$ = null;
        memoization_state.$mt_dependent_cache_clear_callbacks$ = null;
        memoization_state.$suspend_clearing_mt_dependent_cachesP$ = null;
        memoization_state.$genl_preds_dependent_cache_clear_callbacks$ = null;
        memoization_state.$genls_dependent_cache_clear_callbacks$ = null;
        memoization_state.$wff_constraint_dependent_cache_clear_callbacks$ = null;
        memoization_state.$isa_dependent_cache_clear_callbacks$ = null;
        memoization_state.$quoted_isa_dependent_cache_clear_callbacks$ = null;
        memoization_state.$caching_n_sxhash_composite_value$ = null;
        $str0$global_caching_lock = SubLObjectFactory.makeString("global-caching-lock");
        $sym1$_CACHING_MODE_SHOULD_MONITOR_ = SubLObjectFactory.makeSymbol("*CACHING-MODE-SHOULD-MONITOR*");
        $sym2$_CACHE_MONITOR_HASH_ = SubLObjectFactory.makeSymbol("*CACHE-MONITOR-HASH*");
        $sym3$_CACHE_MONITOR_FAILURE_HASH_ = SubLObjectFactory.makeSymbol("*CACHE-MONITOR-FAILURE-HASH*");
        $sym4$_ = SubLObjectFactory.makeSymbol(">");
        $sym5$CDR = SubLObjectFactory.makeSymbol("CDR");
        $str6$Cached_Function_Call___S__S___ = SubLObjectFactory.makeString("Cached Function Call: ~S(~S)~%");
        $str7$Missed_Cached_Function_Call___S__ = SubLObjectFactory.makeString("Missed Cached Function Call: ~S(~S)~%");
        $sym8$_ALLOW_FUNCTION_CACHING_TO_BE_DISABLED_ = SubLObjectFactory.makeSymbol("*ALLOW-FUNCTION-CACHING-TO-BE-DISABLED*");
        $kw9$ALL = SubLObjectFactory.makeKeyword("ALL");
        $list10 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DISABLE"), (SubLObject)SubLObjectFactory.makeSymbol("ENABLE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DISABLE"), (SubLObject)SubLObjectFactory.makeKeyword("ENABLE"));
        $kw12$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw13$DISABLE = SubLObjectFactory.makeKeyword("DISABLE");
        $kw14$ENABLE = SubLObjectFactory.makeKeyword("ENABLE");
        $str15$DISABLE_must_be__ALL = SubLObjectFactory.makeString("DISABLE must be :ALL");
        $str16$ENABLE_must_be__ALL = SubLObjectFactory.makeString("ENABLE must be :ALL");
        $sym17$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list18 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CACHING-MODE-ENABLED*"), (SubLObject)SubLObjectFactory.makeSymbol("*CACHING-MODE-ENABLED*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CACHING-MODE-DISABLED*"), (SubLObject)SubLObjectFactory.makeSymbol("*CACHING-MODE-DISABLED*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*FUNCTION-CACHING-ENABLED?*"), (SubLObject)SubLObjectFactory.makeSymbol("*FUNCTION-CACHING-ENABLED?*")));
        $sym19$CACHING_MODE_ENABLE = SubLObjectFactory.makeSymbol("CACHING-MODE-ENABLE");
        $sym20$CACHING_MODE_DISABLE = SubLObjectFactory.makeSymbol("CACHING-MODE-DISABLE");
        $int21$167 = SubLObjectFactory.makeInteger(167);
        $list22 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STATE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym23$LOCK = SubLObjectFactory.makeSymbol("LOCK");
        $sym24$MEMOIZATION_STATE_LOCK = SubLObjectFactory.makeSymbol("MEMOIZATION-STATE-LOCK");
        $sym25$PIF = SubLObjectFactory.makeSymbol("PIF");
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT"));
        $sym27$WITH_WRITER_LOCK = SubLObjectFactory.makeSymbol("WITH-WRITER-LOCK");
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCK"));
        $sym29$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym30$RESULT = SubLObjectFactory.makeSymbol("RESULT");
        $list31 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT")));
        $sym32$RET = SubLObjectFactory.makeSymbol("RET");
        $sym33$WITH_READER_LOCK = SubLObjectFactory.makeSymbol("WITH-READER-LOCK");
        $list34 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCK")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $kw35$_MEMOIZED_ITEM_NOT_FOUND_ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $sym36$CACHING_STATE = SubLObjectFactory.makeSymbol("CACHING-STATE");
        $sym37$CACHING_STATE_P = SubLObjectFactory.makeSymbol("CACHING-STATE-P");
        $list38 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STORE"), (SubLObject)SubLObjectFactory.makeSymbol("ZERO-ARG-RESULTS"), (SubLObject)SubLObjectFactory.makeSymbol("LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("CAPACITY"), (SubLObject)SubLObjectFactory.makeSymbol("FUNC-SYMBOL"), (SubLObject)SubLObjectFactory.makeSymbol("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS-LENGTH"));
        $list39 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STORE"), (SubLObject)SubLObjectFactory.makeKeyword("ZERO-ARG-RESULTS"), (SubLObject)SubLObjectFactory.makeKeyword("LOCK"), (SubLObject)SubLObjectFactory.makeKeyword("CAPACITY"), (SubLObject)SubLObjectFactory.makeKeyword("FUNC-SYMBOL"), (SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeKeyword("ARGS-LENGTH"));
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CACHING-STATE-STORE"), (SubLObject)SubLObjectFactory.makeSymbol("CACHING-STATE-ZERO-ARG-RESULTS"), (SubLObject)SubLObjectFactory.makeSymbol("CACHING-STATE-LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("CACHING-STATE-CAPACITY"), (SubLObject)SubLObjectFactory.makeSymbol("CACHING-STATE-FUNC-SYMBOL"), (SubLObject)SubLObjectFactory.makeSymbol("CACHING-STATE-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("CACHING-STATE-ARGS-LENGTH"));
        $list41 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CACHING-STATE-STORE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CACHING-STATE-ZERO-ARG-RESULTS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CACHING-STATE-LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CACHING-STATE-CAPACITY"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CACHING-STATE-FUNC-SYMBOL"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CACHING-STATE-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CACHING-STATE-ARGS-LENGTH"));
        $sym42$PRINT_CACHING_STATE = SubLObjectFactory.makeSymbol("PRINT-CACHING-STATE");
        $sym43$CACHING_STATE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("CACHING-STATE-PRINT-FUNCTION-TRAMPOLINE");
        $list44 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("CACHING-STATE-P"));
        $sym45$CACHING_STATE_STORE = SubLObjectFactory.makeSymbol("CACHING-STATE-STORE");
        $sym46$_CSETF_CACHING_STATE_STORE = SubLObjectFactory.makeSymbol("_CSETF-CACHING-STATE-STORE");
        $sym47$CACHING_STATE_ZERO_ARG_RESULTS = SubLObjectFactory.makeSymbol("CACHING-STATE-ZERO-ARG-RESULTS");
        $sym48$_CSETF_CACHING_STATE_ZERO_ARG_RESULTS = SubLObjectFactory.makeSymbol("_CSETF-CACHING-STATE-ZERO-ARG-RESULTS");
        $sym49$CACHING_STATE_LOCK = SubLObjectFactory.makeSymbol("CACHING-STATE-LOCK");
        $sym50$_CSETF_CACHING_STATE_LOCK = SubLObjectFactory.makeSymbol("_CSETF-CACHING-STATE-LOCK");
        $sym51$CACHING_STATE_CAPACITY = SubLObjectFactory.makeSymbol("CACHING-STATE-CAPACITY");
        $sym52$_CSETF_CACHING_STATE_CAPACITY = SubLObjectFactory.makeSymbol("_CSETF-CACHING-STATE-CAPACITY");
        $sym53$CACHING_STATE_FUNC_SYMBOL = SubLObjectFactory.makeSymbol("CACHING-STATE-FUNC-SYMBOL");
        $sym54$_CSETF_CACHING_STATE_FUNC_SYMBOL = SubLObjectFactory.makeSymbol("_CSETF-CACHING-STATE-FUNC-SYMBOL");
        $sym55$CACHING_STATE_TEST = SubLObjectFactory.makeSymbol("CACHING-STATE-TEST");
        $sym56$_CSETF_CACHING_STATE_TEST = SubLObjectFactory.makeSymbol("_CSETF-CACHING-STATE-TEST");
        $sym57$CACHING_STATE_ARGS_LENGTH = SubLObjectFactory.makeSymbol("CACHING-STATE-ARGS-LENGTH");
        $sym58$_CSETF_CACHING_STATE_ARGS_LENGTH = SubLObjectFactory.makeSymbol("_CSETF-CACHING-STATE-ARGS-LENGTH");
        $kw59$STORE = SubLObjectFactory.makeKeyword("STORE");
        $kw60$ZERO_ARG_RESULTS = SubLObjectFactory.makeKeyword("ZERO-ARG-RESULTS");
        $kw61$LOCK = SubLObjectFactory.makeKeyword("LOCK");
        $kw62$CAPACITY = SubLObjectFactory.makeKeyword("CAPACITY");
        $kw63$FUNC_SYMBOL = SubLObjectFactory.makeKeyword("FUNC-SYMBOL");
        $kw64$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw65$ARGS_LENGTH = SubLObjectFactory.makeKeyword("ARGS-LENGTH");
        $str66$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw67$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym68$MAKE_CACHING_STATE = SubLObjectFactory.makeSymbol("MAKE-CACHING-STATE");
        $kw69$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw70$END = SubLObjectFactory.makeKeyword("END");
        $sym71$VISIT_DEFSTRUCT_OBJECT_CACHING_STATE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-CACHING-STATE-METHOD");
        $sym72$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $sym73$POSITIVE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $sym74$SYMBOLP = SubLObjectFactory.makeSymbol("SYMBOLP");
        $sym75$FUNCTION_SPEC_P = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $str76$__caching_state_function___A_lock = SubLObjectFactory.makeString("#<caching-state function: ~A lock: '~A' capacity: ~A test: ~S ~%    store: ");
        $str77$_ = SubLObjectFactory.makeString(">");
        $list78 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CACHED-ARGS"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"));
        $sym79$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $kw80$RECALC = SubLObjectFactory.makeKeyword("RECALC");
        $list81 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CACHED-ARGS"), (SubLObject)SubLObjectFactory.makeSymbol("RESULTS"));
        $sym82$MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("MEMOIZATION-STATE");
        $sym83$MEMOIZATION_STATE_P = SubLObjectFactory.makeSymbol("MEMOIZATION-STATE-P");
        $list84 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STORE"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-PROCESS"), (SubLObject)SubLObjectFactory.makeSymbol("LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("SHOULD-CLONE"));
        $list85 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STORE"), (SubLObject)SubLObjectFactory.makeKeyword("CURRENT-PROCESS"), (SubLObject)SubLObjectFactory.makeKeyword("LOCK"), (SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("SHOULD-CLONE"));
        $list86 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMOIZATION-STATE-STORE"), (SubLObject)SubLObjectFactory.makeSymbol("MEMOIZATION-STATE-CURRENT-PROCESS"), (SubLObject)SubLObjectFactory.makeSymbol("MEMOIZATION-STATE-LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("MEMOIZATION-STATE-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("MEMOIZATION-STATE-SHOULD-CLONE"));
        $list87 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-MEMOIZATION-STATE-STORE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-MEMOIZATION-STATE-CURRENT-PROCESS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-MEMOIZATION-STATE-LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-MEMOIZATION-STATE-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-MEMOIZATION-STATE-SHOULD-CLONE"));
        $sym88$PRINT_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("PRINT-MEMOIZATION-STATE");
        $sym89$MEMOIZATION_STATE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("MEMOIZATION-STATE-PRINT-FUNCTION-TRAMPOLINE");
        $list90 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("MEMOIZATION-STATE-P"));
        $sym91$MEMOIZATION_STATE_STORE = SubLObjectFactory.makeSymbol("MEMOIZATION-STATE-STORE");
        $sym92$_CSETF_MEMOIZATION_STATE_STORE = SubLObjectFactory.makeSymbol("_CSETF-MEMOIZATION-STATE-STORE");
        $sym93$MEMOIZATION_STATE_CURRENT_PROCESS = SubLObjectFactory.makeSymbol("MEMOIZATION-STATE-CURRENT-PROCESS");
        $sym94$_CSETF_MEMOIZATION_STATE_CURRENT_PROCESS = SubLObjectFactory.makeSymbol("_CSETF-MEMOIZATION-STATE-CURRENT-PROCESS");
        $sym95$_CSETF_MEMOIZATION_STATE_LOCK = SubLObjectFactory.makeSymbol("_CSETF-MEMOIZATION-STATE-LOCK");
        $sym96$MEMOIZATION_STATE_NAME = SubLObjectFactory.makeSymbol("MEMOIZATION-STATE-NAME");
        $sym97$_CSETF_MEMOIZATION_STATE_NAME = SubLObjectFactory.makeSymbol("_CSETF-MEMOIZATION-STATE-NAME");
        $sym98$MEMOIZATION_STATE_SHOULD_CLONE = SubLObjectFactory.makeSymbol("MEMOIZATION-STATE-SHOULD-CLONE");
        $sym99$_CSETF_MEMOIZATION_STATE_SHOULD_CLONE = SubLObjectFactory.makeSymbol("_CSETF-MEMOIZATION-STATE-SHOULD-CLONE");
        $kw100$CURRENT_PROCESS = SubLObjectFactory.makeKeyword("CURRENT-PROCESS");
        $kw101$NAME = SubLObjectFactory.makeKeyword("NAME");
        $kw102$SHOULD_CLONE = SubLObjectFactory.makeKeyword("SHOULD-CLONE");
        $sym103$MAKE_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("MAKE-MEMOIZATION-STATE");
        $sym104$VISIT_DEFSTRUCT_OBJECT_MEMOIZATION_STATE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-MEMOIZATION-STATE-METHOD");
        $sym105$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym106$READER_WRITER_LOCK_P = SubLObjectFactory.makeSymbol("READER-WRITER-LOCK-P");
        $sym107$FUNCTIONP = SubLObjectFactory.makeSymbol("FUNCTIONP");
        $str108$memoization_state_clone_lock = SubLObjectFactory.makeString("memoization-state-clone-lock");
        $str109$__memoization_state_name____A__lo = SubLObjectFactory.makeString("#<memoization-state name: '~A' lock: '~A' should-clone: ~A current-process: '~A' ~%    store: ~A ");
        $str110$Clone__ = SubLObjectFactory.makeString("Clone: ");
        $str111$Need_to_implement_dictionary_copy = SubLObjectFactory.makeString("Need to implement dictionary copy!");
        $str112$implement_me_in__memoization_stat = SubLObjectFactory.makeString("implement me in: memoization-state-merge-cloned-state");
        $sym113$CACHING_STATE_RESULTS_HAS_ARGS_ = SubLObjectFactory.makeSymbol("CACHING-STATE-RESULTS-HAS-ARGS?");
        $sym114$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $str115$Dont_know_how_to_determine_size_a = SubLObjectFactory.makeString("Dont know how to determine size and capacity for objects of type ~A.");
        $sym116$ORIGINAL_MEMOIZATION_PROCESS = SubLObjectFactory.makeUninternedSymbol("ORIGINAL-MEMOIZATION-PROCESS");
        $sym117$LOCAL_STATE = SubLObjectFactory.makeUninternedSymbol("LOCAL-STATE");
        $sym118$_MEMOIZATION_STATE_ = SubLObjectFactory.makeSymbol("*MEMOIZATION-STATE*");
        $sym119$MEMOIZATION_STATE_ORIGINAL_PROCESS = SubLObjectFactory.makeSymbol("MEMOIZATION-STATE-ORIGINAL-PROCESS");
        $sym120$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $sym121$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym122$MEMOIZATION_STATE_POSSIBLY_CLEAR_ORIGINAL_PROCESS = SubLObjectFactory.makeSymbol("MEMOIZATION-STATE-POSSIBLY-CLEAR-ORIGINAL-PROCESS");
        $sym123$WITH_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("WITH-MEMOIZATION-STATE");
        $str124$Invalid_attempt_to_reuse_memoizat = SubLObjectFactory.makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $sym125$STATE = SubLObjectFactory.makeUninternedSymbol("STATE");
        $list126 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-MEMOIZATION-STATE")));
        $list127 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym128$STATE = SubLObjectFactory.makeUninternedSymbol("STATE");
        $sym129$PRINT_ONE_PER_LINE = SubLObjectFactory.makeSymbol("PRINT-ONE-PER-LINE");
        $sym130$GATHER_MEMOIZATION_STATE_STATISTICS = SubLObjectFactory.makeSymbol("GATHER-MEMOIZATION-STATE-STATISTICS");
        $sym131$STATE = SubLObjectFactory.makeUninternedSymbol("STATE");
        $list132 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-NEW-MEMOIZATION-STATE")));
        $sym133$POSSIBLY_NEW_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("POSSIBLY-NEW-MEMOIZATION-STATE");
        $sym134$WITH_POSSIBLY_NEW_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("WITH-POSSIBLY-NEW-MEMOIZATION-STATE");
        $sym135$_MEMOIZED_FUNCTIONS_ = SubLObjectFactory.makeSymbol("*MEMOIZED-FUNCTIONS*");
        $sym136$FBOUNDP = SubLObjectFactory.makeSymbol("FBOUNDP");
        $sym137$DEFINE_MEMOIZED = SubLObjectFactory.makeSymbol("DEFINE-MEMOIZED");
        $list138 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("CAPACITY"), (SubLObject)SubLObjectFactory.makeSymbol("FACCESS"), (SubLObject)SubLObjectFactory.makeSymbol("MEMOIZATION-STATE-FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("MEMOIZATION-STATE-FUNCTION-ARG-POSITIONS")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list139 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeKeyword("CAPACITY"), (SubLObject)SubLObjectFactory.makeKeyword("FACCESS"), (SubLObject)SubLObjectFactory.makeKeyword("MEMOIZATION-STATE-FUNCTION"), (SubLObject)SubLObjectFactory.makeKeyword("MEMOIZATION-STATE-FUNCTION-ARG-POSITIONS"));
        $kw140$FACCESS = SubLObjectFactory.makeKeyword("FACCESS");
        $kw141$MEMOIZATION_STATE_FUNCTION = SubLObjectFactory.makeKeyword("MEMOIZATION-STATE-FUNCTION");
        $kw142$MEMOIZATION_STATE_FUNCTION_ARG_POSITIONS = SubLObjectFactory.makeKeyword("MEMOIZATION-STATE-FUNCTION-ARG-POSITIONS");
        $list143 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)memoization_state.EQL);
        $str144$Got_a_test_expression_of_length__ = SubLObjectFactory.makeString("Got a test expression of length: ~S for ~S~%");
        $sym145$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $sym146$FUNCTION = SubLObjectFactory.makeSymbol("FUNCTION");
        $str147$Don_t_know_how_to_convert___S_to_ = SubLObjectFactory.makeString("Don't know how to convert: ~S to a test~%");
        $sym148$MEMOIZATION_STATE = SubLObjectFactory.makeUninternedSymbol("MEMOIZATION-STATE");
        $sym149$CACHING_STATE = SubLObjectFactory.makeUninternedSymbol("CACHING-STATE");
        $sym150$RESULTS = SubLObjectFactory.makeUninternedSymbol("RESULTS");
        $sym151$DECLAIM = SubLObjectFactory.makeSymbol("DECLAIM");
        $sym152$FACCESS = SubLObjectFactory.makeSymbol("FACCESS");
        $sym153$DEFINE = SubLObjectFactory.makeSymbol("DEFINE");
        $sym154$NOTE_CACHED_FUNCTION_CALLED = SubLObjectFactory.makeSymbol("NOTE-CACHED-FUNCTION-CALLED");
        $sym155$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym156$CACHING_DISABLED = SubLObjectFactory.makeSymbol("CACHING-DISABLED");
        $list157 = ConsesLow.list((SubLObject)memoization_state.NIL);
        $sym158$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $sym159$MEMOIZATION_STATE_LOOKUP = SubLObjectFactory.makeSymbol("MEMOIZATION-STATE-LOOKUP");
        $sym160$CREATE_CACHING_STATE = SubLObjectFactory.makeSymbol("CREATE-CACHING-STATE");
        $sym161$MEMOIZATION_STATE_PUT = SubLObjectFactory.makeSymbol("MEMOIZATION-STATE-PUT");
        $list162 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*MEMOIZED-ITEM-NOT-FOUND*"));
        $sym163$NOTE_CACHED_FUNCTION_CALLED_BUT_NOT_CACHED = SubLObjectFactory.makeSymbol("NOTE-CACHED-FUNCTION-CALLED-BUT-NOT-CACHED");
        $sym164$MULTIPLE_VALUE_LIST = SubLObjectFactory.makeSymbol("MULTIPLE-VALUE-LIST");
        $sym165$CACHING_STATE_SET_ZERO_ARG_RESULTS = SubLObjectFactory.makeSymbol("CACHING-STATE-SET-ZERO-ARG-RESULTS");
        $sym166$CACHING_STATE_PUT = SubLObjectFactory.makeSymbol("CACHING-STATE-PUT");
        $sym167$CACHING_RESULTS = SubLObjectFactory.makeSymbol("CACHING-RESULTS");
        $sym168$SXHASH = SubLObjectFactory.makeUninternedSymbol("SXHASH");
        $sym169$MEMOIZATION_STATE = SubLObjectFactory.makeUninternedSymbol("MEMOIZATION-STATE");
        $sym170$CACHING_STATE = SubLObjectFactory.makeUninternedSymbol("CACHING-STATE");
        $sym171$RESULTS = SubLObjectFactory.makeUninternedSymbol("RESULTS");
        $sym172$COLLISIONS = SubLObjectFactory.makeUninternedSymbol("COLLISIONS");
        $sym173$CACHING_STATE_LOOKUP = SubLObjectFactory.makeSymbol("CACHING-STATE-LOOKUP");
        $sym174$CNOT = SubLObjectFactory.makeSymbol("CNOT");
        $sym175$CACHING_STATE_ENTER_MULTI_KEY_N = SubLObjectFactory.makeSymbol("CACHING-STATE-ENTER-MULTI-KEY-N");
        $sym176$LIST = SubLObjectFactory.makeSymbol("LIST");
        $sym177$SXHASH_CALC_2 = SubLObjectFactory.makeSymbol("SXHASH-CALC-2");
        $sym178$SXHASH_CALC_3 = SubLObjectFactory.makeSymbol("SXHASH-CALC-3");
        $sym179$SXHASH_CALC_4 = SubLObjectFactory.makeSymbol("SXHASH-CALC-4");
        $sym180$SXHASH_CALC_5 = SubLObjectFactory.makeSymbol("SXHASH-CALC-5");
        $sym181$SXHASH_CALC_6 = SubLObjectFactory.makeSymbol("SXHASH-CALC-6");
        $sym182$SXHASH_CALC_7 = SubLObjectFactory.makeSymbol("SXHASH-CALC-7");
        $sym183$SXHASH_CALC_8 = SubLObjectFactory.makeSymbol("SXHASH-CALC-8");
        $sym184$SXHASH_CALC_9 = SubLObjectFactory.makeSymbol("SXHASH-CALC-9");
        $sym185$SXHASH_CALC_10 = SubLObjectFactory.makeSymbol("SXHASH-CALC-10");
        $sym186$SXHASH_CALC_N = SubLObjectFactory.makeSymbol("SXHASH-CALC-N");
        $sym187$CACHING_STATE_GET_ZERO_ARG_RESULTS = SubLObjectFactory.makeSymbol("CACHING-STATE-GET-ZERO-ARG-RESULTS");
        $sym188$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $sym189$COLLISION = SubLObjectFactory.makeSymbol("COLLISION");
        $list190 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CACHED-ARGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("COLLISION"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULTS2"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("COLLISION"))));
        $list191 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("CACHED-ARGS")));
        $list192 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPOP"), (SubLObject)SubLObjectFactory.makeSymbol("CACHED-ARGS"));
        $sym193$CAND = SubLObjectFactory.makeSymbol("CAND");
        $sym194$CACHED_ARGS = SubLObjectFactory.makeSymbol("CACHED-ARGS");
        $list195 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REST"), (SubLObject)SubLObjectFactory.makeSymbol("CACHED-ARGS")));
        $list196 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CACHING-RESULTS"), (SubLObject)SubLObjectFactory.makeSymbol("RESULTS2"))));
        $sym197$CACHING_STATE_LOOKUP_MULTI_KEY_N = SubLObjectFactory.makeSymbol("CACHING-STATE-LOOKUP-MULTI-KEY-N");
        $sym198$MAKE_SYMBOL = SubLObjectFactory.makeSymbol("MAKE-SYMBOL");
        $sym199$NOTE_MEMOIZED_FUNCTION = SubLObjectFactory.makeSymbol("NOTE-MEMOIZED-FUNCTION");
        $sym200$_GLOBALLY_CACHED_FUNCTIONS_ = SubLObjectFactory.makeSymbol("*GLOBALLY-CACHED-FUNCTIONS*");
        $sym201$BOUNDP = SubLObjectFactory.makeSymbol("BOUNDP");
        $sym202$GLOBAL_CACHING_VARIABLE_NEW = SubLObjectFactory.makeSymbol("GLOBAL-CACHING-VARIABLE-NEW");
        $sym203$SYMBOL_VALUE = SubLObjectFactory.makeSymbol("SYMBOL-VALUE");
        $str204$Clearing_all_globally_cached_func = SubLObjectFactory.makeString("Clearing all globally cached functions");
        $str205$cdolist = SubLObjectFactory.makeString("cdolist");
        $int206$1000 = SubLObjectFactory.makeInteger(1000);
        $str207$____clearing_large_caching_state_ = SubLObjectFactory.makeString("~&  clearing large caching state: ~A (~A entries)~%");
        $sym208$DEFINE_CACHED_NEW = SubLObjectFactory.makeSymbol("DEFINE-CACHED-NEW");
        $list209 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("CAPACITY"), (SubLObject)SubLObjectFactory.makeSymbol("FACCESS"), (SubLObject)SubLObjectFactory.makeSymbol("SIZE"), (SubLObject)SubLObjectFactory.makeSymbol("CLEAR-WHEN")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list210 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeKeyword("CAPACITY"), (SubLObject)SubLObjectFactory.makeKeyword("FACCESS"), (SubLObject)SubLObjectFactory.makeKeyword("SIZE"), (SubLObject)SubLObjectFactory.makeKeyword("CLEAR-WHEN"));
        $kw211$SIZE = SubLObjectFactory.makeKeyword("SIZE");
        $kw212$CLEAR_WHEN = SubLObjectFactory.makeKeyword("CLEAR-WHEN");
        $list213 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SIZE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("TEST")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list214 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SIZE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("TEST")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list215 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HL-STORE-MODIFIED"), (SubLObject)SubLObjectFactory.makeKeyword("GENL-MT-MODIFIED"), (SubLObject)SubLObjectFactory.makeKeyword("GENL-PREDS-MODIFIED"), (SubLObject)SubLObjectFactory.makeKeyword("GENLS-MODIFIED"), (SubLObject)SubLObjectFactory.makeKeyword("ISA-MODIFIED"), (SubLObject)SubLObjectFactory.makeKeyword("QUOTED-ISA-MODIFIED"), (SubLObject)SubLObjectFactory.makeKeyword("WFF-CONSTRAINT-MODIFIED"));
        $sym216$CACHE_CLEAR_TRIGGER_P = SubLObjectFactory.makeSymbol("CACHE-CLEAR-TRIGGER-P");
        $sym217$RESULTS = SubLObjectFactory.makeUninternedSymbol("RESULTS");
        $sym218$CACHING_STATE = SubLObjectFactory.makeUninternedSymbol("CACHING-STATE");
        $sym219$CREATE_GLOBAL_CACHING_STATE_FOR_NAME = SubLObjectFactory.makeSymbol("CREATE-GLOBAL-CACHING-STATE-FOR-NAME");
        $sym220$SXHASH = SubLObjectFactory.makeUninternedSymbol("SXHASH");
        $sym221$RESULTS = SubLObjectFactory.makeUninternedSymbol("RESULTS");
        $sym222$COLLISIONS = SubLObjectFactory.makeUninternedSymbol("COLLISIONS");
        $sym223$CACHING_STATE = SubLObjectFactory.makeUninternedSymbol("CACHING-STATE");
        $sym224$HASH_TABLE_P = SubLObjectFactory.makeSymbol("HASH-TABLE-P");
        $str225$global_caching_lock_for_ = SubLObjectFactory.makeString("global caching lock for ");
        $str226$__A_RW_LOCK_ = SubLObjectFactory.makeString("*~A-RW-LOCK*");
        $str227$__A_CACHING_STATE_ = SubLObjectFactory.makeString("*~A-CACHING-STATE*");
        $sym228$DEFLEXICAL_PRIVATE = SubLObjectFactory.makeSymbol("DEFLEXICAL-PRIVATE");
        $str229$CLEAR__A = SubLObjectFactory.makeString("CLEAR-~A");
        $list230 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"));
        $kw231$HL_STORE_MODIFIED = SubLObjectFactory.makeKeyword("HL-STORE-MODIFIED");
        $sym232$REGISTER_HL_STORE_CACHE_CLEAR_CALLBACK = SubLObjectFactory.makeSymbol("REGISTER-HL-STORE-CACHE-CLEAR-CALLBACK");
        $kw233$GENL_MT_MODIFIED = SubLObjectFactory.makeKeyword("GENL-MT-MODIFIED");
        $sym234$REGISTER_MT_DEPENDENT_CACHE_CLEAR_CALLBACK = SubLObjectFactory.makeSymbol("REGISTER-MT-DEPENDENT-CACHE-CLEAR-CALLBACK");
        $kw235$GENL_PREDS_MODIFIED = SubLObjectFactory.makeKeyword("GENL-PREDS-MODIFIED");
        $sym236$REGISTER_GENL_PREDS_DEPENDENT_CACHE_CLEAR_CALLBACK = SubLObjectFactory.makeSymbol("REGISTER-GENL-PREDS-DEPENDENT-CACHE-CLEAR-CALLBACK");
        $kw237$GENLS_MODIFIED = SubLObjectFactory.makeKeyword("GENLS-MODIFIED");
        $sym238$REGISTER_GENLS_DEPENDENT_CACHE_CLEAR_CALLBACK = SubLObjectFactory.makeSymbol("REGISTER-GENLS-DEPENDENT-CACHE-CLEAR-CALLBACK");
        $kw239$ISA_MODIFIED = SubLObjectFactory.makeKeyword("ISA-MODIFIED");
        $sym240$REGISTER_ISA_DEPENDENT_CACHE_CLEAR_CALLBACK = SubLObjectFactory.makeSymbol("REGISTER-ISA-DEPENDENT-CACHE-CLEAR-CALLBACK");
        $kw241$QUOTED_ISA_MODIFIED = SubLObjectFactory.makeKeyword("QUOTED-ISA-MODIFIED");
        $sym242$REGISTER_QUOTED_ISA_DEPENDENT_CACHE_CLEAR_CALLBACK = SubLObjectFactory.makeSymbol("REGISTER-QUOTED-ISA-DEPENDENT-CACHE-CLEAR-CALLBACK");
        $kw243$WFF_CONSTRAINT_MODIFIED = SubLObjectFactory.makeKeyword("WFF-CONSTRAINT-MODIFIED");
        $sym244$REGISTER_WFF_CONSTRAINT_DEPENDENT_CACHE_CLEAR_CALLBACK = SubLObjectFactory.makeSymbol("REGISTER-WFF-CONSTRAINT-DEPENDENT-CACHE-CLEAR-CALLBACK");
        $sym245$CS = SubLObjectFactory.makeSymbol("CS");
        $list246 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("CS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CACHING-STATE-CLEAR"), (SubLObject)SubLObjectFactory.makeSymbol("CS"))));
        $list247 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)memoization_state.NIL));
        $str248$REMOVE__A = SubLObjectFactory.makeString("REMOVE-~A");
        $sym249$CACHING_STATE_REMOVE_FUNCTION_RESULTS_WITH_ARGS = SubLObjectFactory.makeSymbol("CACHING-STATE-REMOVE-FUNCTION-RESULTS-WITH-ARGS");
        $sym250$_HL_STORE_CACHE_CLEAR_CALLBACKS_ = SubLObjectFactory.makeSymbol("*HL-STORE-CACHE-CLEAR-CALLBACKS*");
        $sym251$_MT_DEPENDENT_CACHE_CLEAR_CALLBACKS_ = SubLObjectFactory.makeSymbol("*MT-DEPENDENT-CACHE-CLEAR-CALLBACKS*");
        $list252 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SUSPEND-CLEARING-MT-DEPENDENT-CACHES?*"), (SubLObject)memoization_state.T));
        $sym253$_GENL_PREDS_DEPENDENT_CACHE_CLEAR_CALLBACKS_ = SubLObjectFactory.makeSymbol("*GENL-PREDS-DEPENDENT-CACHE-CLEAR-CALLBACKS*");
        $sym254$_GENLS_DEPENDENT_CACHE_CLEAR_CALLBACKS_ = SubLObjectFactory.makeSymbol("*GENLS-DEPENDENT-CACHE-CLEAR-CALLBACKS*");
        $sym255$_WFF_CONSTRAINT_DEPENDENT_CACHE_CLEAR_CALLBACKS_ = SubLObjectFactory.makeSymbol("*WFF-CONSTRAINT-DEPENDENT-CACHE-CLEAR-CALLBACKS*");
        $sym256$_ISA_DEPENDENT_CACHE_CLEAR_CALLBACKS_ = SubLObjectFactory.makeSymbol("*ISA-DEPENDENT-CACHE-CLEAR-CALLBACKS*");
        $sym257$_QUOTED_ISA_DEPENDENT_CACHE_CLEAR_CALLBACKS_ = SubLObjectFactory.makeSymbol("*QUOTED-ISA-DEPENDENT-CACHE-CLEAR-CALLBACKS*");
        $list258 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("TEST")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("FORM"));
        $list259 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"));
        $list260 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)SubLObjectFactory.makeString("Unimplemented macro memoized-already."));
        $list261 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)SubLObjectFactory.makeString("Unimplemented macro cached-already."));
        $sym262$_OPTIONAL = SubLObjectFactory.makeSymbol("&OPTIONAL");
        $list263 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFINE-CACHED-NEW"), (SubLObject)SubLObjectFactory.makeSymbol("DEFINE-MEMOIZED"));
        $sym264$NOTE_GLOBALLY_CACHED_FUNCTION = SubLObjectFactory.makeSymbol("NOTE-GLOBALLY-CACHED-FUNCTION");
        $str265$_A_INTERNAL = SubLObjectFactory.makeString("~A-INTERNAL");
        $sym266$DEFINE_PROTECTED = SubLObjectFactory.makeSymbol("DEFINE-PROTECTED");
        $list267 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXTERNAL"), (SubLObject)SubLObjectFactory.makeSymbol("API-PROVISIONAL"));
        $sym268$REGISTER_EXTERNAL_SYMBOL = SubLObjectFactory.makeSymbol("REGISTER-EXTERNAL-SYMBOL");
        $sym269$PUBLIC = SubLObjectFactory.makeSymbol("PUBLIC");
        $sym270$API = SubLObjectFactory.makeSymbol("API");
        $sym271$REGISTER_CYC_API_FUNCTION = SubLObjectFactory.makeSymbol("REGISTER-CYC-API-FUNCTION");
        $list272 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString(""), (SubLObject)memoization_state.NIL, (SubLObject)memoization_state.NIL);
        $list273 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRIVATE"), (SubLObject)SubLObjectFactory.makeSymbol("PROTECTED"), (SubLObject)SubLObjectFactory.makeSymbol("PUBLIC"));
        $str274$_A_is_not_a_known_FACCESS_visibil = SubLObjectFactory.makeString("~A is not a known FACCESS visibility type for cached functions.");
    }
    
    public static final class $caching_state_native extends SubLStructNative
    {
        public SubLObject $store;
        public SubLObject $zero_arg_results;
        public SubLObject $lock;
        public SubLObject $capacity;
        public SubLObject $func_symbol;
        public SubLObject $test;
        public SubLObject $args_length;
        private static final SubLStructDeclNative structDecl;
        
        public $caching_state_native() {
            this.$store = (SubLObject)CommonSymbols.NIL;
            this.$zero_arg_results = (SubLObject)CommonSymbols.NIL;
            this.$lock = (SubLObject)CommonSymbols.NIL;
            this.$capacity = (SubLObject)CommonSymbols.NIL;
            this.$func_symbol = (SubLObject)CommonSymbols.NIL;
            this.$test = (SubLObject)CommonSymbols.NIL;
            this.$args_length = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$caching_state_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$store;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$zero_arg_results;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$lock;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$capacity;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$func_symbol;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$test;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$args_length;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$store = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$zero_arg_results = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$lock = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$capacity = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$func_symbol = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$test = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$args_length = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$caching_state_native.class, memoization_state.$sym36$CACHING_STATE, memoization_state.$sym37$CACHING_STATE_P, memoization_state.$list38, memoization_state.$list39, new String[] { "$store", "$zero_arg_results", "$lock", "$capacity", "$func_symbol", "$test", "$args_length" }, memoization_state.$list40, memoization_state.$list41, memoization_state.$sym42$PRINT_CACHING_STATE);
        }
    }
    
    public static final class $caching_state_p$UnaryFunction extends UnaryFunction
    {
        public $caching_state_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CACHING-STATE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return memoization_state.caching_state_p(arg1);
        }
    }
    
    public static final class $memoization_state_native extends SubLStructNative
    {
        public SubLObject $store;
        public SubLObject $current_process;
        public SubLObject $lock;
        public SubLObject $name;
        public SubLObject $should_clone;
        private static final SubLStructDeclNative structDecl;
        
        public $memoization_state_native() {
            this.$store = (SubLObject)CommonSymbols.NIL;
            this.$current_process = (SubLObject)CommonSymbols.NIL;
            this.$lock = (SubLObject)CommonSymbols.NIL;
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$should_clone = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$memoization_state_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$store;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$current_process;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$lock;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$name;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$should_clone;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$store = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$current_process = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$lock = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$name = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$should_clone = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$memoization_state_native.class, memoization_state.$sym82$MEMOIZATION_STATE, memoization_state.$sym83$MEMOIZATION_STATE_P, memoization_state.$list84, memoization_state.$list85, new String[] { "$store", "$current_process", "$lock", "$name", "$should_clone" }, memoization_state.$list86, memoization_state.$list87, memoization_state.$sym88$PRINT_MEMOIZATION_STATE);
        }
    }
    
    public static final class $memoization_state_p$UnaryFunction extends UnaryFunction
    {
        public $memoization_state_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("MEMOIZATION-STATE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return memoization_state.memoization_state_p(arg1);
        }
    }
}

/*

	Total time: 1105 ms
	 synthetic 
*/