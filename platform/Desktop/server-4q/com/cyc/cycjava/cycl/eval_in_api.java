package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class eval_in_api extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.eval_in_api";
    public static final String myFingerPrint = "8b4fb00339833e3e087f0f1161586477d713808fead63961b6157ba1e0d8afe8";
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 962L)
    public static SubLSymbol $eval_in_apiP$;
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 3969L)
    private static SubLSymbol $eval_in_api_mutable_globals$;
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 4615L)
    private static SubLSymbol $eval_in_api_immutable_globals$;
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 4983L)
    public static SubLSymbol $eval_in_api_env$;
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 5566L)
    private static SubLSymbol $api_special_verify_table$;
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 6045L)
    private static SubLSymbol $api_function_table$;
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 6468L)
    private static SubLSymbol $api_macro_table$;
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 7664L)
    private static SubLSymbol $subl_eval_method$;
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 9639L)
    public static SubLSymbol $eval_in_api_traced_fns$;
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 9777L)
    public static SubLSymbol $eval_in_api_trace_log$;
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 10188L)
    private static SubLSymbol $eval_in_api_level$;
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 10291L)
    private static SubLSymbol $eval_in_api_function_level$;
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 10404L)
    private static SubLSymbol $eval_in_api_macro_stack$;
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 25838L)
    private static SubLSymbol $verify_in_api_verbose_modeP$;
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 26298L)
    private static SubLSymbol $verify_in_api_bound_symbols$;
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 26421L)
    private static SubLSymbol $verify_in_api_fbound_symbols$;
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 26554L)
    private static SubLSymbol $verify_in_api_macro_stack$;
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 38111L)
    public static SubLSymbol $api_user_variables$;
    private static final SubLSymbol $sym0$QUOTIFY;
    private static final SubLSymbol $sym1$_EVAL_IN_API_MUTABLE_GLOBALS_;
    private static final SubLSymbol $sym2$_EVAL_IN_API_IMMUTABLE_GLOBALS_;
    private static final SubLSymbol $sym3$_API_SPECIAL_VERIFY_TABLE_;
    private static final SubLSymbol $sym4$_API_FUNCTION_TABLE_;
    private static final SubLInteger $int5$100;
    private static final SubLSymbol $sym6$_API_MACRO_TABLE_;
    private static final SubLList $list7;
    private static final SubLSymbol $sym8$FORM;
    private static final SubLString $str9$API_SPECIAL__A;
    private static final SubLSymbol $sym10$PROGN;
    private static final SubLSymbol $sym11$DEFINE_PRIVATE;
    private static final SubLSymbol $sym12$CDESTRUCTURING_BIND;
    private static final SubLSymbol $sym13$CDR;
    private static final SubLSymbol $sym14$REGISTER_API_SPECIAL;
    private static final SubLSymbol $sym15$QUOTE;
    private static final SubLSymbol $sym16$FORM;
    private static final SubLString $str17$API_SPECIAL__A_VERIFY;
    private static final SubLSymbol $sym18$REGISTER_API_SPECIAL_VERIFY;
    private static final SubLSymbol $sym19$_SUBL_EVAL_METHOD_;
    private static final SubLSymbol $sym20$EVAL;
    private static final SubLSymbol $sym21$CLET;
    private static final SubLList $list22;
    private static final SubLList $list23;
    private static final SubLSymbol $sym24$INITIALIZE_EVAL_IN_API_ENV;
    private static final SubLSymbol $sym25$WITH_EVAL_IN_API_ENVIRONMENT;
    private static final SubLSymbol $sym26$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $sym27$SYMBOLP;
    private static final SubLSymbol $sym28$VALID_API_OPERATOR_P;
    private static final SubLList $list29;
    private static final SubLString $str30$_return_boolean_T_if_APPLY_or_FUN;
    private static final SubLList $list31;
    private static final SubLList $list32;
    private static final SubLSymbol $sym33$VALID_API_FUNCTION_P;
    private static final SubLString $str34$_return_boolean_T_if_APPLY_or_FUN;
    private static final SubLSymbol $sym35$VALID_API_MACRO_P;
    private static final SubLString $str36$_return_boolean_T_iff_macro_expan;
    private static final SubLSymbol $kw37$TEST;
    private static final SubLSymbol $kw38$OWNER;
    private static final SubLSymbol $kw39$CLASSES;
    private static final SubLSymbol $kw40$KB;
    private static final SubLSymbol $kw41$TINY;
    private static final SubLSymbol $kw42$WORKING_;
    private static final SubLList $list43;
    private static final SubLList $list44;
    private static final SubLString $str45$Operator__S_was_not_a_symbol;
    private static final SubLString $str46$Operator__S_is_not_defined_in_the;
    private static final SubLString $str47$Variable__S_is_unbound;
    private static final SubLString $str48$API_ERROR;
    private static final SubLString $str49$Attempt_to_obtain_the_value_of_sy;
    private static final SubLList $list50;
    private static final SubLSymbol $sym51$CSETQ;
    private static final SubLSymbol $sym52$FUNCTION_RESULTS;
    private static final SubLSymbol $sym53$MULTIPLE_VALUE_LIST;
    private static final SubLSymbol $sym54$EVAL_IN_API_UPDATE_ENV;
    private static final SubLSymbol $sym55$VALUES_LIST;
    private static final SubLList $list56;
    private static final SubLSymbol $sym57$MACRO_RESULT;
    private static final SubLSymbol $sym58$MACROEXPAND_1;
    private static final SubLSymbol $kw59$EVAL_IN_API_RET;
    private static final SubLSymbol $sym60$WITH_EVAL_IN_API_ENV_INT;
    private static final SubLList $list61;
    private static final SubLSymbol $sym62$BODY_RESULTS;
    private static final SubLSymbol $sym63$EVAL_IN_API_PROGN_BODY;
    private static final SubLString $str64$with_eval_in_api_env_int;
    private static final SubLSymbol $sym65$VERIFY_IN_API;
    private static final SubLString $str66$don_t_know_how_to_handle_special_;
    private static final SubLList $list67;
    private static final SubLList $list68;
    private static final SubLSymbol $sym69$RET;
    private static final SubLSymbol $sym70$API_SPECIAL_RET;
    private static final SubLSymbol $sym71$API_SPECIAL_RET_VERIFY;
    private static final SubLSymbol $sym72$LAMBDA;
    private static final SubLSymbol $sym73$DEFINE;
    private static final SubLSymbol $sym74$API_SPECIAL_DEFINE;
    private static final SubLSymbol $sym75$API_SPECIAL_DEFINE_VERIFY;
    private static final SubLSymbol $sym76$DEFINE_PUBLIC;
    private static final SubLSymbol $sym77$API_SPECIAL_DEFINE_PUBLIC;
    private static final SubLSymbol $sym78$API_SPECIAL_DEFINE_PUBLIC_VERIFY;
    private static final SubLSymbol $sym79$DEFINE_PROTECTED;
    private static final SubLSymbol $sym80$API_SPECIAL_DEFINE_PROTECTED;
    private static final SubLSymbol $sym81$API_SPECIAL_DEFINE_PROTECTED_VERIFY;
    private static final SubLSymbol $sym82$API_SPECIAL_DEFINE_PRIVATE;
    private static final SubLSymbol $sym83$API_SPECIAL_DEFINE_PRIVATE_VERIFY;
    private static final SubLSymbol $sym84$FORM;
    private static final SubLSymbol $sym85$DEFMACRO;
    private static final SubLSymbol $sym86$API_SPECIAL_DEFMACRO;
    private static final SubLSymbol $sym87$API_SPECIAL_DEFMACRO_VERIFY;
    private static final SubLSymbol $sym88$FORM;
    private static final SubLSymbol $sym89$DEFMACRO_PUBLIC;
    private static final SubLSymbol $sym90$API_SPECIAL_DEFMACRO_PUBLIC;
    private static final SubLSymbol $sym91$API_SPECIAL_DEFMACRO_PUBLIC_VERIFY;
    private static final SubLSymbol $sym92$FORM;
    private static final SubLSymbol $sym93$DEFMACRO_PROTECTED;
    private static final SubLSymbol $sym94$API_SPECIAL_DEFMACRO_PROTECTED;
    private static final SubLSymbol $sym95$API_SPECIAL_DEFMACRO_PROTECTED_VERIFY;
    private static final SubLList $list96;
    private static final SubLSymbol $sym97$DEFSTRUCT;
    private static final SubLSymbol $sym98$API_SPECIAL_DEFSTRUCT;
    private static final SubLList $list99;
    private static final SubLSymbol $sym100$API_SPECIAL_DEFSTRUCT_VERIFY;
    private static final SubLSymbol $sym101$DEFSTRUCT_VECTOR;
    private static final SubLList $list102;
    private static final SubLSymbol $sym103$FI_GET_PARAMETER;
    private static final SubLSymbol $sym104$API_SPECIAL_FI_GET_PARAMETER;
    private static final SubLSymbol $sym105$API_SPECIAL_FI_GET_PARAMETER_VERIFY;
    private static final SubLList $list106;
    private static final SubLSymbol $sym107$DEFVAR;
    private static final SubLSymbol $sym108$API_SPECIAL_DEFVAR;
    private static final SubLSymbol $sym109$API_SPECIAL_DEFVAR_VERIFY;
    private static final SubLSymbol $sym110$DEFVAR_PRIVATE;
    private static final SubLSymbol $sym111$API_SPECIAL_DEFVAR_PRIVATE;
    private static final SubLSymbol $sym112$API_SPECIAL_DEFVAR_PRIVATE_VERIFY;
    private static final SubLSymbol $sym113$CLEAR_API_USER_VARIABLES;
    private static final SubLString $str114$Removes_all_user_variables_;
    private static final SubLList $list115;
    private static final SubLSymbol $sym116$PUT_API_USER_VARIABLE;
    private static final SubLList $list117;
    private static final SubLString $str118$Sets_the_value_of_a_the_user_vari;
    private static final SubLSymbol $sym119$GET_API_USER_VARIABLE;
    private static final SubLList $list120;
    private static final SubLString $str121$Gets_the_value_of_a_the_user_vari;
    private static final SubLSymbol $sym122$FI_SET_PARAMETER;
    private static final SubLSymbol $sym123$API_SPECIAL_FI_SET_PARAMETER;
    private static final SubLSymbol $sym124$API_SPECIAL_FI_SET_PARAMETER_VERIFY;
    private static final SubLList $list125;
    private static final SubLSymbol $sym126$API_SPECIAL_CSETQ;
    private static final SubLSymbol $sym127$API_SPECIAL_CSETQ_VERIFY;
    private static final SubLString $str128$_S_is_not_a_symbol;
    private static final SubLString $str129$_S_is_not_defined;
    private static final SubLList $list130;
    private static final SubLString $str131$_S_is_not_an_api_variable;
    private static final SubLSymbol $sym132$CINC;
    private static final SubLSymbol $sym133$API_SPECIAL_CINC;
    private static final SubLSymbol $sym134$API_SPECIAL_CINC_VERIFY;
    private static final SubLSymbol $sym135$CDEC;
    private static final SubLSymbol $sym136$API_SPECIAL_CDEC;
    private static final SubLSymbol $sym137$API_SPECIAL_CDEC_VERIFY;
    private static final SubLList $list138;
    private static final SubLSymbol $sym139$CPUSH;
    private static final SubLSymbol $sym140$API_SPECIAL_CPUSH;
    private static final SubLSymbol $sym141$API_SPECIAL_CPUSH_VERIFY;
    private static final SubLList $list142;
    private static final SubLSymbol $sym143$CPOP;
    private static final SubLSymbol $sym144$API_SPECIAL_CPOP;
    private static final SubLSymbol $sym145$API_SPECIAL_CPOP_VERIFY;
    private static final SubLList $list146;
    private static final SubLSymbol $sym147$API_SPECIAL_EVAL;
    private static final SubLSymbol $sym148$EVAL_IN_API;
    private static final SubLSymbol $sym149$API_SPECIAL_EVAL_IN_API_VERIFY;
    private static final SubLSymbol $sym150$FI_EVAL;
    private static final SubLSymbol $sym151$API_SPECIAL_FI_EVAL;
    private static final SubLSymbol $sym152$API_SPECIAL_FI_EVAL_VERIFY;
    private static final SubLSymbol $sym153$FI_LOCAL_EVAL;
    private static final SubLSymbol $sym154$API_SPECIAL_FI_LOCAL_EVAL;
    private static final SubLSymbol $sym155$API_SPECIAL_FI_LOCAL_EVAL_VERIFY;
    private static final SubLList $list156;
    private static final SubLSymbol $sym157$APPLY;
    private static final SubLSymbol $sym158$API_SPECIAL_APPLY;
    private static final SubLSymbol $sym159$API_SPECIAL_APPLY_VERIFY;
    private static final SubLList $list160;
    private static final SubLSymbol $sym161$FBOUNDP;
    private static final SubLSymbol $sym162$API_SPECIAL_FBOUNDP;
    private static final SubLSymbol $sym163$API_SPECIAL_FBOUNDP_VERIFY;
    private static final SubLList $list164;
    private static final SubLSymbol $sym165$FUNCALL;
    private static final SubLSymbol $sym166$API_SPECIAL_FUNCALL;
    private static final SubLSymbol $sym167$API_SPECIAL_FUNCALL_VERIFY;
    private static final SubLSymbol $sym168$API_SPECIAL_MULTIPLE_VALUE_LIST;
    private static final SubLSymbol $sym169$API_SPECIAL_MULTIPLE_VALUE_LIST_VERIFY;
    private static final SubLSymbol $sym170$TRACE;
    private static final SubLSymbol $sym171$API_SPECIAL_TRACE;
    private static final SubLSymbol $sym172$API_SPECIAL_TRACE_VERIFY;
    private static final SubLSymbol $sym173$UNTRACE;
    private static final SubLSymbol $sym174$API_SPECIAL_UNTRACE;
    private static final SubLSymbol $sym175$API_SPECIAL_UNTRACE_VERIFY;
    private static final SubLString $str176$__;
    private static final SubLString $str177$_A_D___S__;
    private static final SubLString $str178$;
    private static final SubLString $str179$_S_;
    private static final SubLString $str180$_A_D__returned__A__;
    private static final SubLSymbol $sym181$GET_TRACE_LOG;
    private static final SubLSymbol $sym182$API_SPECIAL_GET_TRACE_LOG;
    private static final SubLSymbol $sym183$API_SPECIAL_GET_TRACE_LOG_VERIFY;
    private static final SubLSymbol $sym184$CLEAR_TRACE_LOG;
    private static final SubLSymbol $sym185$API_SPECIAL_CLEAR_TRACE_LOG;
    private static final SubLSymbol $sym186$API_SPECIAL_CLEAR_TRACE_LOG_VERIFY;
    private static final SubLSymbol $sym187$NUMBERP;
    private static final SubLSymbol $sym188$API_SPECIAL_PROGN;
    private static final SubLSymbol $sym189$API_SPECIAL_PROGN_VERIFY;
    private static final SubLList $list190;
    private static final SubLSymbol $sym191$API_SPECIAL_CLET;
    private static final SubLString $str192$clet_error;
    private static final SubLSymbol $sym193$API_SPECIAL_CLET_VERIFY;
    private static final SubLList $list194;
    private static final SubLList $list195;
    private static final SubLSymbol $sym196$CMULTIPLE_VALUE_BIND;
    private static final SubLSymbol $sym197$API_SPECIAL_CMULTIPLE_VALUE_BIND;
    private static final SubLSymbol $sym198$API_SPECIAL_CMULTIPLE_VALUE_BIND_VERIFY;
    private static final SubLSymbol $sym199$CAND;
    private static final SubLSymbol $sym200$API_SPECIAL_CAND;
    private static final SubLSymbol $sym201$API_SPECIAL_CAND_VERIFY;
    private static final SubLSymbol $sym202$COR;
    private static final SubLSymbol $sym203$API_SPECIAL_COR;
    private static final SubLSymbol $sym204$API_SPECIAL_COR_VERIFY;
    private static final SubLSymbol $sym205$CNOT;
    private static final SubLSymbol $sym206$API_SPECIAL_CNOT;
    private static final SubLSymbol $sym207$API_SPECIAL_CNOT_VERIFY;
    private static final SubLList $list208;
    private static final SubLSymbol $sym209$PCOND;
    private static final SubLSymbol $sym210$API_SPECIAL_PCOND;
    private static final SubLSymbol $sym211$API_SPECIAL_PCOND_VERIFY;
    private static final SubLList $list212;
    private static final SubLSymbol $sym213$PIF;
    private static final SubLSymbol $sym214$API_SPECIAL_PIF;
    private static final SubLSymbol $sym215$API_SPECIAL_PIF_VERIFY;
    private static final SubLSymbol $sym216$FIF;
    private static final SubLSymbol $sym217$API_SPECIAL_FIF;
    private static final SubLSymbol $sym218$API_SPECIAL_FIF_VERIFY;
    private static final SubLSymbol $sym219$PWHEN;
    private static final SubLSymbol $sym220$API_SPECIAL_PWHEN;
    private static final SubLSymbol $sym221$API_SPECIAL_PWHEN_VERIFY;
    private static final SubLList $list222;
    private static final SubLSymbol $sym223$WHEN;
    private static final SubLSymbol $sym224$API_SPECIAL_WHEN;
    private static final SubLSymbol $sym225$API_SPECIAL_WHEN_VERIFY;
    private static final SubLSymbol $sym226$FWHEN;
    private static final SubLSymbol $sym227$API_SPECIAL_FWHEN;
    private static final SubLSymbol $sym228$API_SPECIAL_FWHEN_VERIFY;
    private static final SubLSymbol $sym229$PUNLESS;
    private static final SubLSymbol $sym230$API_SPECIAL_PUNLESS;
    private static final SubLSymbol $sym231$API_SPECIAL_PUNLESS_VERIFY;
    private static final SubLSymbol $sym232$FUNLESS;
    private static final SubLSymbol $sym233$API_SPECIAL_FUNLESS;
    private static final SubLSymbol $sym234$API_SPECIAL_FUNLESS_VERIFY;
    private static final SubLSymbol $sym235$WHILE;
    private static final SubLSymbol $sym236$API_SPECIAL_WHILE;
    private static final SubLSymbol $sym237$API_SPECIAL_WHILE_VERIFY;
    private static final SubLSymbol $sym238$UNTIL;
    private static final SubLSymbol $sym239$API_SPECIAL_UNTIL;
    private static final SubLSymbol $sym240$API_SPECIAL_UNTIL_VERIFY;
    private static final SubLList $list241;
    private static final SubLString $str242$_S_is_not_a_valid_cdo_variable_sp;
    private static final SubLSymbol $sym243$CDO;
    private static final SubLSymbol $sym244$API_SPECIAL_CDO;
    private static final SubLSymbol $sym245$API_SPECIAL_CDO_VERIFY;
    private static final SubLList $list246;
    private static final SubLSymbol $sym247$CDOLIST;
    private static final SubLSymbol $sym248$API_SPECIAL_CDOLIST;
    private static final SubLSymbol $sym249$API_SPECIAL_CDOLIST_VERIFY;
    private static final SubLList $list250;
    private static final SubLSymbol $sym251$CDOTIMES;
    private static final SubLSymbol $sym252$API_SPECIAL_CDOTIMES;
    private static final SubLSymbol $sym253$API_SPECIAL_CDOTIMES_VERIFY;
    private static final SubLList $list254;
    private static final SubLSymbol $sym255$CDOHASH;
    private static final SubLSymbol $sym256$API_SPECIAL_CDOHASH;
    private static final SubLSymbol $sym257$API_SPECIAL_CDOHASH_VERIFY;
    private static final SubLList $list258;
    private static final SubLSymbol $sym259$MAPCAR;
    private static final SubLSymbol $sym260$API_SPECIAL_MAPCAR;
    private static final SubLSymbol $sym261$API_SPECIAL_MAPCAR_VERIFY;
    private static final SubLString $str262$_S_does_not_evaluate_to_an_api_fu;
    private static final SubLSymbol $sym263$FIRST;
    private static final SubLSymbol $sym264$EVAL_IN_API_MAPCAR;
    private static final SubLSymbol $sym265$REST;
    private static final SubLList $list266;
    private static final SubLSymbol $sym267$MAPDICTIONARY;
    private static final SubLSymbol $sym268$API_SPECIAL_MAPDICTIONARY;
    private static final SubLSymbol $sym269$API_SPECIAL_MAPDICTIONARY_VERIFY;
    private static final SubLSymbol $kw270$ALIST;
    private static final SubLSymbol $kw271$HASHTABLE;
    private static final SubLString $str272$Corrupted_dictionary__unsupported;
    private static final SubLList $list273;
    private static final SubLSymbol $sym274$MAPDICTIONARY_PARAMETERIZED;
    private static final SubLSymbol $sym275$API_SPECIAL_MAPDICTIONARY_PARAMETERIZED;
    private static final SubLSymbol $sym276$API_SPECIAL_MAPDICTIONARY_PARAMETERIZED_VERIFY;
    private static final SubLString $str277$evaluated_dict;
    private static final SubLString $str278$evaluated_func;
    private static final SubLString $str279$evaluated_args;
    private static final SubLList $list280;
    private static final SubLSymbol $sym281$CCATCH;
    private static final SubLSymbol $sym282$API_SPECIAL_CCATCH;
    private static final SubLSymbol $sym283$API_SPECIAL_CCATCH_VERIFY;
    private static final SubLList $list284;
    private static final SubLSymbol $sym285$ANSWER_VARIABLE;
    private static final SubLSymbol $sym286$EVAL_IN_API_CSETQ;
    private static final SubLList $list287;
    private static final SubLSymbol $sym288$THROW;
    private static final SubLSymbol $sym289$API_SPECIAL_THROW;
    private static final SubLSymbol $sym290$API_SPECIAL_THROW_VERIFY;
    private static final SubLSymbol $sym291$EVAL_IN_API_INTERNAL;
    private static final SubLSymbol $sym292$IGNORE_ERRORS;
    private static final SubLSymbol $sym293$API_SPECIAL_IGNORE_ERRORS;
    private static final SubLSymbol $sym294$API_SPECIAL_IGNORE_ERRORS_VERIFY;
    private static final SubLList $list295;
    private static final SubLSymbol $sym296$LOCAL_RESULTS;
    private static final SubLList $list297;
    private static final SubLSymbol $sym298$CUNWIND_PROTECT;
    private static final SubLSymbol $sym299$API_SPECIAL_CUNWIND_PROTECT;
    private static final SubLSymbol $sym300$API_SPECIAL_CUNWIND_PROTECT_VERIFY;
    private static final SubLSymbol $sym301$_;
    private static final SubLList $list302;
    private static final SubLList $list303;
    private static final SubLString $str304$eval_in_api_cunwind_protect;
    private static final SubLList $list305;
    private static final SubLSymbol $sym306$LOAD;
    private static final SubLSymbol $sym307$API_SPECIAL_LOAD;
    private static final SubLSymbol $sym308$API_SPECIAL_LOAD_VERIFY;
    private static final SubLSymbol $sym309$STRINGP;
    private static final SubLSymbol $kw310$DIRECTION;
    private static final SubLSymbol $kw311$INPUT;
    private static final SubLSymbol $kw312$IF_DOES_NOT_EXIST;
    private static final SubLString $str313$_S_does_not_exist__cannot_load;
    private static final SubLSymbol $kw314$EOF;
    private static final SubLSymbol $kw315$ERROR;
    private static final SubLString $str316$__Read_error_occured_at_position_;
    private static final SubLList $list317;
    private static final SubLString $str318$_A_is_not_a__A;
    private static final SubLSymbol $sym319$CHECK_TYPE;
    private static final SubLSymbol $sym320$API_SPECIAL_CHECK_TYPE;
    private static final SubLSymbol $sym321$API_SPECIAL_CHECK_TYPE_VERIFY;
    private static final SubLSymbol $sym322$API_SPECIAL_QUOTE;
    private static final SubLSymbol $sym323$API_SPECIAL_QUOTE_VERIFY;
    private static final SubLSymbol $sym324$BOUNDP;
    private static final SubLSymbol $sym325$API_SPECIAL_BOUNDP;
    private static final SubLSymbol $sym326$API_SPECIAL_BOUNDP_VERIFY;
    private static final SubLSymbol $sym327$SYMBOL_VALUE;
    private static final SubLSymbol $sym328$API_SPECIAL_SYMBOL_VALUE;
    private static final SubLSymbol $sym329$API_SPECIAL_SYMBOL_VALUE_VERIFY;
    private static final SubLList $list330;
    private static final SubLSymbol $sym331$FUNCTION;
    private static final SubLSymbol $sym332$API_SPECIAL_FUNCTION;
    private static final SubLSymbol $sym333$API_SPECIAL_FUNCTION_VERIFY;
    private static final SubLList $list334;
    private static final SubLSymbol $sym335$ERROR;
    private static final SubLSymbol $sym336$API_SPECIAL_ERROR;
    private static final SubLSymbol $sym337$API_SPECIAL_ERROR_VERIFY;
    private static final SubLString $str338$___S;
    private static final SubLSymbol $sym339$BREAK;
    private static final SubLSymbol $sym340$API_SPECIAL_BREAK;
    private static final SubLSymbol $sym341$API_SPECIAL_BREAK_VERIFY;
    private static final SubLString $str342$Can_only_clear_the_environment_fr;
    private static final SubLSymbol $sym343$CLEAR_ENVIRONMENT;
    private static final SubLSymbol $sym344$API_SPECIAL_CLEAR_ENVIRONMENT;
    private static final SubLSymbol $sym345$API_SPECIAL_CLEAR_ENVIRONMENT_VERIFY;
    private static final SubLSymbol $sym346$GET_ENVIRONMENT;
    private static final SubLSymbol $sym347$API_SPECIAL_GET_ENVIRONMENT;
    private static final SubLSymbol $sym348$API_SPECIAL_GET_ENVIRONMENT_VERIFY;
    private static final SubLList $list349;
    private static final SubLSymbol $sym350$IN_PACKAGE;
    private static final SubLSymbol $sym351$API_SPECIAL_IN_PACKAGE;
    private static final SubLSymbol $sym352$API_SPECIAL_IN_PACKAGE_VERIFY;
    private static final SubLList $list353;
    private static final SubLSymbol $sym354$CTIME;
    private static final SubLSymbol $sym355$API_SPECIAL_CTIME;
    private static final SubLSymbol $sym356$API_SPECIAL_CTIME_VERIFY;
    private static final SubLSymbol $sym357$WITH_TEMP_VARS;
    private static final SubLList $list358;
    private static final SubLSymbol $sym359$TEMP_VAR;
    private static final SubLSymbol $sym360$WITH_EVAL_IN_API_ENV;
    private static final SubLString $str361$eval_in_api_ctime;
    private static final SubLList $list362;
    private static final SubLSymbol $sym363$NOTING_PERCENT_PROGRESS;
    private static final SubLSymbol $sym364$API_SPECIAL_NOTING_PERCENT_PROGRESS;
    private static final SubLSymbol $sym365$API_SPECIAL_NOTING_PERCENT_PROGRESS_VERIFY;
    private static final SubLString $str366$eval_in_api_noting_percent_progre;
    private static final SubLSymbol $sym367$NOTING_ACTIVITY;
    private static final SubLSymbol $sym368$API_SPECIAL_NOTING_ACTIVITY;
    private static final SubLSymbol $sym369$API_SPECIAL_NOTING_ACTIVITY_VERIFY;
    private static final SubLString $str370$eval_in_api_noting_activity;
    private static final SubLSymbol $sym371$MUST;
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 1155L)
    public static SubLObject cyc_api_eval(final SubLObject api_request) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (eval_in_api.NIL != eval_in_api.$eval_in_apiP$.getDynamicValue(thread)) {
            return eval_in_api(api_request);
        }
        return eval_in_api_subl_eval(api_request);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 1466L)
    public static SubLObject possibly_cyc_api_eval(final SubLObject api_request) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (eval_in_api.NIL != eval_in_api.$eval_in_apiP$.getDynamicValue(thread)) {
            return eval_in_api(api_request);
        }
        return Eval.eval(api_request);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 1763L)
    public static SubLObject possibly_cyc_api_apply(final SubLObject func, final SubLObject args) {
        if (func.isFunctionSpec()) {
            return Functions.apply(func, args);
        }
        return cyc_api_eval(reader.bq_cons(func, ConsesLow.append(Mapping.mapcar(Symbols.symbol_function((SubLObject)eval_in_api.$sym0$QUOTIFY), args), (SubLObject)eval_in_api.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 2021L)
    public static SubLObject possibly_cyc_api_function_spec_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isFunctionSpec() || (v_object.isSymbol() && eval_in_api.NIL != api_function_p(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 2499L)
    public static SubLObject possibly_cyc_api_funcall_1(final SubLObject func, final SubLObject arg1) {
        if (func.isFunctionSpec()) {
            return subl_promotions.funcall_1(func, arg1);
        }
        return cyc_api_eval((SubLObject)ConsesLow.list(func, list_utilities.quotify(arg1)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 2820L)
    public static SubLObject possibly_cyc_api_funcall_2(final SubLObject func, final SubLObject arg1, final SubLObject arg2) {
        if (func.isFunctionSpec()) {
            return subl_promotions.funcall_2(func, arg1, arg2);
        }
        return cyc_api_eval((SubLObject)ConsesLow.list(func, list_utilities.quotify(arg1), list_utilities.quotify(arg2)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 3177L)
    public static SubLObject possibly_cyc_api_funcall_3(final SubLObject func, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3) {
        if (func.isFunctionSpec()) {
            return subl_promotions.funcall_3(func, arg1, arg2, arg3);
        }
        return cyc_api_eval((SubLObject)ConsesLow.list(func, list_utilities.quotify(arg1), list_utilities.quotify(arg2), list_utilities.quotify(arg3)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 3560L)
    public static SubLObject possibly_cyc_api_funcall_4(final SubLObject func, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4) {
        if (func.isFunctionSpec()) {
            return subl_promotions.funcall_4(func, arg1, arg2, arg3, arg4);
        }
        return cyc_api_eval((SubLObject)ConsesLow.list(func, list_utilities.quotify(arg1), list_utilities.quotify(arg2), list_utilities.quotify(arg3), list_utilities.quotify(arg4)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 4406L)
    public static SubLObject register_api_mutable_global(final SubLObject var) {
        eval_in_api.$eval_in_api_mutable_globals$.setGlobalValue((SubLObject)ConsesLow.cons(var, eval_in_api.$eval_in_api_mutable_globals$.getGlobalValue()));
        return var;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 4513L)
    public static SubLObject api_mutable_global_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, eval_in_api.$eval_in_api_mutable_globals$.getGlobalValue(), (SubLObject)eval_in_api.UNPROVIDED, (SubLObject)eval_in_api.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 4672L)
    public static SubLObject register_api_immutable_global(final SubLObject var) {
        eval_in_api.$eval_in_api_immutable_globals$.setGlobalValue((SubLObject)ConsesLow.cons(var, eval_in_api.$eval_in_api_immutable_globals$.getGlobalValue()));
        return var;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 4783L)
    public static SubLObject api_immutable_global_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, eval_in_api.$eval_in_api_immutable_globals$.getGlobalValue(), (SubLObject)eval_in_api.UNPROVIDED, (SubLObject)eval_in_api.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 5091L)
    public static SubLObject api_lexical_variable_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isSymbol() && eval_in_api.NIL != list_utilities.sublisp_boolean(conses_high.assoc(v_object, eval_in_api.$eval_in_api_env$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)eval_in_api.EQ), (SubLObject)eval_in_api.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 5307L)
    public static SubLObject api_dynamic_variable_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isSymbol() && eval_in_api.NIL == api_lexical_variable_p(v_object) && eval_in_api.NIL != api_mutable_global_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 5667L)
    public static SubLObject api_special_verify_p(final SubLObject operator) {
        return list_utilities.sublisp_boolean(Hashtables.gethash(operator, eval_in_api.$api_special_verify_table$.getGlobalValue(), (SubLObject)eval_in_api.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 5785L)
    public static SubLObject api_special_verify_handler(final SubLObject operator) {
        return Hashtables.gethash(operator, eval_in_api.$api_special_verify_table$.getGlobalValue(), (SubLObject)eval_in_api.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 5897L)
    public static SubLObject register_api_special_verify(final SubLObject operator, final SubLObject handler) {
        Hashtables.sethash(operator, eval_in_api.$api_special_verify_table$.getGlobalValue(), handler);
        return operator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 6130L)
    public static SubLObject api_function_p(final SubLObject operator) {
        return list_utilities.sublisp_boolean(Hashtables.gethash(operator, eval_in_api.$api_function_table$.getGlobalValue(), (SubLObject)eval_in_api.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 6236L)
    public static SubLObject api_function_handler(final SubLObject operator) {
        return Hashtables.gethash(operator, eval_in_api.$api_function_table$.getGlobalValue(), (SubLObject)eval_in_api.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 6334L)
    public static SubLObject register_api_function(final SubLObject operator, final SubLObject handler) {
        Hashtables.sethash(operator, eval_in_api.$api_function_table$.getGlobalValue(), handler);
        return operator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 6542L)
    public static SubLObject api_macro_p(final SubLObject operator) {
        return list_utilities.sublisp_boolean(Hashtables.gethash(operator, eval_in_api.$api_macro_table$.getGlobalValue(), (SubLObject)eval_in_api.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 6642L)
    public static SubLObject api_macro_expander(final SubLObject operator) {
        return Hashtables.gethash(operator, eval_in_api.$api_macro_table$.getGlobalValue(), (SubLObject)eval_in_api.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 6735L)
    public static SubLObject register_api_macro(final SubLObject operator, final SubLObject expander) {
        Hashtables.sethash(operator, eval_in_api.$api_macro_table$.getGlobalValue(), expander);
        return operator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 6865L)
    public static SubLObject defspecial_in_api(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)eval_in_api.NIL;
        SubLObject arglist = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list7);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list7);
        arglist = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject form = (SubLObject)eval_in_api.$sym8$FORM;
        final SubLObject special_handler = Packages.intern(PrintLow.format((SubLObject)eval_in_api.NIL, (SubLObject)eval_in_api.$str9$API_SPECIAL__A, name), (SubLObject)eval_in_api.UNPROVIDED);
        return (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym10$PROGN, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym11$DEFINE_PRIVATE, special_handler, (SubLObject)ConsesLow.list(form), (SubLObject)ConsesLow.listS((SubLObject)eval_in_api.$sym12$CDESTRUCTURING_BIND, arglist, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym13$CDR, form), ConsesLow.append(body, (SubLObject)eval_in_api.NIL))), (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym14$REGISTER_API_SPECIAL, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym15$QUOTE, name), (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym15$QUOTE, special_handler)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 7297L)
    public static SubLObject defspecial_in_api_verify(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)eval_in_api.NIL;
        SubLObject arglist = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list7);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list7);
        arglist = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject form = (SubLObject)eval_in_api.$sym16$FORM;
        final SubLObject special_handler = Packages.intern(PrintLow.format((SubLObject)eval_in_api.NIL, (SubLObject)eval_in_api.$str17$API_SPECIAL__A_VERIFY, name), (SubLObject)eval_in_api.UNPROVIDED);
        return (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym10$PROGN, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym11$DEFINE_PRIVATE, special_handler, (SubLObject)ConsesLow.list(form), (SubLObject)ConsesLow.listS((SubLObject)eval_in_api.$sym12$CDESTRUCTURING_BIND, arglist, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym13$CDR, form), ConsesLow.append(body, (SubLObject)eval_in_api.NIL))), (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym18$REGISTER_API_SPECIAL_VERIFY, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym15$QUOTE, name), (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym15$QUOTE, special_handler)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 7850L)
    public static SubLObject with_eval_in_api_subl_evaluation(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)eval_in_api.$sym21$CLET, (SubLObject)eval_in_api.$list22, ConsesLow.append(body, (SubLObject)eval_in_api.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 8319L)
    public static SubLObject eval_in_api_subl_eval(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)eval_in_api.NIL;
        final SubLObject _prev_bind_0 = Eval.$evaluator_method$.currentBinding(thread);
        try {
            Eval.$evaluator_method$.bind(eval_in_api.$subl_eval_method$.getGlobalValue(), thread);
            v_answer = Functions.funcall(eval_in_api.$subl_eval_method$.getGlobalValue(), form);
        }
        finally {
            Eval.$evaluator_method$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 8651L)
    public static SubLObject eval_in_api_subl_apply(final SubLObject function, final SubLObject v_arguments) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)eval_in_api.NIL;
        final SubLObject _prev_bind_0 = Eval.$evaluator_method$.currentBinding(thread);
        try {
            Eval.$evaluator_method$.bind(eval_in_api.$subl_eval_method$.getGlobalValue(), thread);
            v_answer = Functions.apply(function, v_arguments);
        }
        finally {
            Eval.$evaluator_method$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 8953L)
    public static SubLObject eval_in_api_subl_funcall(final SubLObject function, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4) {
        final SubLObject arg1_p = (SubLObject)SubLObjectFactory.makeBoolean(arg1 != eval_in_api.UNPROVIDED);
        final SubLObject arg2_p = (SubLObject)SubLObjectFactory.makeBoolean(arg2 != eval_in_api.UNPROVIDED);
        final SubLObject arg3_p = (SubLObject)SubLObjectFactory.makeBoolean(arg3 != eval_in_api.UNPROVIDED);
        final SubLObject arg4_p = (SubLObject)SubLObjectFactory.makeBoolean(arg4 != eval_in_api.UNPROVIDED);
        if (arg1 == eval_in_api.UNPROVIDED) {
            arg1 = (SubLObject)eval_in_api.NIL;
        }
        if (arg2 == eval_in_api.UNPROVIDED) {
            arg2 = (SubLObject)eval_in_api.NIL;
        }
        if (arg3 == eval_in_api.UNPROVIDED) {
            arg3 = (SubLObject)eval_in_api.NIL;
        }
        if (arg4 == eval_in_api.UNPROVIDED) {
            arg4 = (SubLObject)eval_in_api.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)eval_in_api.NIL;
        final SubLObject _prev_bind_0 = Eval.$evaluator_method$.currentBinding(thread);
        try {
            Eval.$evaluator_method$.bind(eval_in_api.$subl_eval_method$.getGlobalValue(), thread);
            if (eval_in_api.NIL != arg4_p) {
                v_answer = Functions.funcall(function, arg1, arg2, arg3, arg4);
            }
            else if (eval_in_api.NIL != arg3_p) {
                v_answer = Functions.funcall(function, arg1, arg2, arg3);
            }
            else if (eval_in_api.NIL != arg2_p) {
                v_answer = Functions.funcall(function, arg1, arg2);
            }
            else if (eval_in_api.NIL != arg1_p) {
                v_answer = Functions.funcall(function, arg1);
            }
            else {
                v_answer = Functions.funcall(function);
            }
        }
        finally {
            Eval.$evaluator_method$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 9860L)
    public static SubLObject with_clean_eval_in_api_environment(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)eval_in_api.$sym21$CLET, (SubLObject)eval_in_api.$list23, ConsesLow.append(body, (SubLObject)eval_in_api.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 10083L)
    public static SubLObject initialize_eval_in_api_env() {
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 10531L)
    public static SubLObject eval_in_api(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)eval_in_api.NIL;
        final SubLObject _prev_bind_0 = eval_in_api.$eval_in_api_level$.currentBinding(thread);
        final SubLObject _prev_bind_2 = eval_in_api.$eval_in_api_function_level$.currentBinding(thread);
        final SubLObject _prev_bind_3 = eval_in_api.$eval_in_api_macro_stack$.currentBinding(thread);
        try {
            eval_in_api.$eval_in_api_level$.bind((SubLObject)eval_in_api.MINUS_ONE_INTEGER, thread);
            eval_in_api.$eval_in_api_function_level$.bind((SubLObject)eval_in_api.MINUS_ONE_INTEGER, thread);
            eval_in_api.$eval_in_api_macro_stack$.bind((SubLObject)eval_in_api.NIL, thread);
            SubLObject error_message = (SubLObject)eval_in_api.NIL;
            final SubLObject env_depth_upon_entering = Sequences.length(eval_in_api.$eval_in_api_env$.getDynamicValue(thread));
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0_$1 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)eval_in_api.$sym26$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        result = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(eval_in_api_internal(form)));
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)eval_in_api.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0_$1, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            finally {
                thread.throwStack.pop();
            }
            if (eval_in_api.NIL != error_message) {
                while (Sequences.length(eval_in_api.$eval_in_api_env$.getDynamicValue(thread)).numG(env_depth_upon_entering)) {
                    eval_in_api.$eval_in_api_env$.setDynamicValue(eval_in_api.$eval_in_api_env$.getDynamicValue(thread).rest(), thread);
                }
                Errors.error(error_message);
            }
        }
        finally {
            eval_in_api.$eval_in_api_macro_stack$.rebind(_prev_bind_3, thread);
            eval_in_api.$eval_in_api_function_level$.rebind(_prev_bind_2, thread);
            eval_in_api.$eval_in_api_level$.rebind(_prev_bind_0, thread);
        }
        return subl_promotions.values_list(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 11126L)
    public static SubLObject valid_api_operator_p(final SubLObject operator) {
        enforceType(operator, eval_in_api.$sym27$SYMBOLP);
        return (SubLObject)SubLObjectFactory.makeBoolean(eval_in_api.NIL != valid_api_function_p(operator) || eval_in_api.NIL != valid_api_macro_p(operator) || eval_in_api.NIL != utilities_macros.api_special_p(operator));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 11968L)
    public static SubLObject valid_api_function_p(final SubLObject operator) {
        enforceType(operator, eval_in_api.$sym27$SYMBOLP);
        return (SubLObject)SubLObjectFactory.makeBoolean(eval_in_api.NIL != api_function_p(operator) || eval_in_api.NIL != utilities_macros.api_predefined_function_p(operator) || eval_in_api.NIL != access_macros.external_function_p(operator));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 12373L)
    public static SubLObject valid_api_macro_p(final SubLObject operator) {
        enforceType(operator, eval_in_api.$sym27$SYMBOLP);
        return (SubLObject)SubLObjectFactory.makeBoolean(eval_in_api.NIL != api_macro_p(operator) || eval_in_api.NIL != utilities_macros.api_predefined_macro_p(operator));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 13320L)
    public static SubLObject eval_in_api_internal(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)eval_in_api.NIL;
        final SubLObject _prev_bind_0 = eval_in_api.$eval_in_api_level$.currentBinding(thread);
        try {
            eval_in_api.$eval_in_api_level$.bind(number_utilities.f_1X(eval_in_api.$eval_in_api_level$.getDynamicValue(thread)), thread);
            if (form.isCons()) {
                SubLObject operator = (SubLObject)eval_in_api.NIL;
                SubLObject args = (SubLObject)eval_in_api.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)eval_in_api.$list44);
                operator = form.first();
                final SubLObject current = args = form.rest();
                if (!operator.isSymbol()) {
                    eval_in_api_error((SubLObject)eval_in_api.$str45$Operator__S_was_not_a_symbol, operator, (SubLObject)eval_in_api.UNPROVIDED);
                }
                else if (eval_in_api.NIL != utilities_macros.api_special_p(operator)) {
                    final SubLObject special_handler = utilities_macros.api_special_handler(operator);
                    result = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(api_funcall_special_handler(operator, special_handler, form)));
                }
                else if (eval_in_api.NIL != api_macro_p(operator)) {
                    final SubLObject macro_expander = api_macro_expander(operator);
                    final SubLObject expanded_form = api_funcall_macro_expander(macro_expander, form);
                    result = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(eval_in_api_internal(expanded_form)));
                }
                else if (eval_in_api.NIL != api_function_p(operator)) {
                    final SubLObject function_handler = api_function_handler(operator);
                    result = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(api_apply_function_handler(operator, function_handler, api_eval_args(args))));
                }
                else if (eval_in_api.NIL != utilities_macros.api_predefined_macro_p(operator)) {
                    final SubLObject _prev_bind_0_$2 = eval_in_api.$eval_in_api_macro_stack$.currentBinding(thread);
                    try {
                        eval_in_api.$eval_in_api_macro_stack$.bind((SubLObject)ConsesLow.cons(operator, eval_in_api.$eval_in_api_macro_stack$.getDynamicValue(thread)), thread);
                        final SubLObject expanded_form = api_expand_predefined_macro(form);
                        result = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(eval_in_api_internal(expanded_form)));
                    }
                    finally {
                        eval_in_api.$eval_in_api_macro_stack$.rebind(_prev_bind_0_$2, thread);
                    }
                }
                else if (eval_in_api.NIL != utilities_macros.api_predefined_function_p(operator) || eval_in_api.NIL != utilities_macros.kb_function_p(operator)) {
                    if (eval_in_api.NIL != list_utilities.singletonP(args)) {
                        result = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(api_apply_predefined_function_one_arg(operator, Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(eval_in_api_internal(args.first()))))));
                    }
                    else {
                        result = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(api_apply_predefined_function(operator, api_eval_args(args))));
                    }
                }
                else if (operator.isFunctionSpec() && !operator.isMacroOperator() && (eval_in_api.NIL != access_macros.external_symbol_p(operator) || eval_in_api.NIL != access_macros.macro_helper_for_any_of_macrosP(operator, eval_in_api.$eval_in_api_macro_stack$.getDynamicValue(thread)))) {
                    result = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(api_apply_predefined_function(operator, api_eval_args(args))));
                }
                else if (operator.isMacroOperator() && (eval_in_api.NIL != access_macros.external_symbol_p(operator) || eval_in_api.NIL != access_macros.macro_helper_for_any_of_macrosP(operator, eval_in_api.$eval_in_api_macro_stack$.getDynamicValue(thread)))) {
                    final SubLObject _prev_bind_0_$3 = eval_in_api.$eval_in_api_macro_stack$.currentBinding(thread);
                    try {
                        eval_in_api.$eval_in_api_macro_stack$.bind((SubLObject)ConsesLow.cons(operator, eval_in_api.$eval_in_api_macro_stack$.getDynamicValue(thread)), thread);
                        final SubLObject expanded_form = api_expand_predefined_macro(form);
                        result = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(eval_in_api_internal(expanded_form)));
                    }
                    finally {
                        eval_in_api.$eval_in_api_macro_stack$.rebind(_prev_bind_0_$3, thread);
                    }
                }
                else {
                    eval_in_api_error((SubLObject)eval_in_api.$str46$Operator__S_is_not_defined_in_the, operator, (SubLObject)eval_in_api.UNPROVIDED);
                }
            }
            else if (!form.isSymbol()) {
                result = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(api_self_evaluation(form)));
            }
            else if (eval_in_api.NIL != Eval.constantp(form, (SubLObject)eval_in_api.UNPROVIDED)) {
                result = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(api_self_evaluation(form)));
            }
            else if (eval_in_api.NIL != api_lexical_variable_p(form)) {
                result = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(api_lexical_variable_value(form)));
            }
            else if (eval_in_api.NIL != api_user_variable_p(form)) {
                result = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(get_api_user_variable(form)));
            }
            else if (eval_in_api.NIL != api_dynamic_variable_p(form) || eval_in_api.NIL != api_immutable_global_p(form)) {
                result = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(api_dynamic_variable_value(form)));
            }
            else {
                eval_in_api_error((SubLObject)eval_in_api.$str47$Variable__S_is_unbound, form, (SubLObject)eval_in_api.UNPROVIDED);
            }
        }
        finally {
            eval_in_api.$eval_in_api_level$.rebind(_prev_bind_0, thread);
        }
        return subl_promotions.values_list(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 17029L)
    public static SubLObject api_eval_args(final SubLObject args) {
        final SubLObject evalled_args = (SubLObject)ConsesLow.make_list(Sequences.length(args), (SubLObject)eval_in_api.UNPROVIDED);
        SubLObject rest_args;
        SubLObject rest_evalled_args;
        for (rest_args = (SubLObject)eval_in_api.NIL, rest_evalled_args = (SubLObject)eval_in_api.NIL, rest_args = args, rest_evalled_args = evalled_args; eval_in_api.NIL != rest_args; rest_args = rest_args.rest(), rest_evalled_args = rest_evalled_args.rest()) {
            ConsesLow.rplaca(rest_evalled_args, eval_in_api_internal(rest_args.first()));
        }
        return evalled_args;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 17354L)
    public static SubLObject eval_in_api_error(SubLObject format_string, SubLObject arg1, SubLObject arg2) {
        if (format_string == eval_in_api.UNPROVIDED) {
            format_string = (SubLObject)eval_in_api.$str48$API_ERROR;
        }
        if (arg1 == eval_in_api.UNPROVIDED) {
            arg1 = (SubLObject)eval_in_api.NIL;
        }
        if (arg2 == eval_in_api.UNPROVIDED) {
            arg2 = (SubLObject)eval_in_api.NIL;
        }
        return Errors.error(format_string, arg1, arg2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 17480L)
    public static SubLObject api_self_evaluation(final SubLObject v_object) {
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 17618L)
    public static SubLObject api_dynamic_variable_value(final SubLObject symbol) {
        if (eval_in_api.NIL != Symbols.boundp(symbol)) {
            return Symbols.symbol_value(symbol);
        }
        if (eval_in_api.NIL != Symbols.fboundp(symbol)) {
            return Symbols.symbol_function(symbol);
        }
        eval_in_api_error((SubLObject)eval_in_api.$str49$Attempt_to_obtain_the_value_of_sy, symbol, (SubLObject)eval_in_api.UNPROVIDED);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 17897L)
    public static SubLObject api_lexical_variable_value(final SubLObject symbol) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return conses_high.assoc(symbol, eval_in_api.$eval_in_api_env$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)eval_in_api.EQ), (SubLObject)eval_in_api.UNPROVIDED).rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 18003L)
    public static SubLObject api_apply_predefined_function(final SubLObject operator, final SubLObject evaluated_args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = (SubLObject)eval_in_api.NIL;
        SubLObject form_in_env = (SubLObject)eval_in_api.NIL;
        SubLObject clet_vars = (SubLObject)eval_in_api.NIL;
        SubLObject clet_var_values = (SubLObject)eval_in_api.NIL;
        SubLObject clet_var = (SubLObject)eval_in_api.NIL;
        SubLObject clet_value = (SubLObject)eval_in_api.NIL;
        SubLObject quoted_evaluated_args = (SubLObject)eval_in_api.NIL;
        final SubLObject _prev_bind_0 = eval_in_api.$eval_in_api_function_level$.currentBinding(thread);
        try {
            eval_in_api.$eval_in_api_function_level$.bind(number_utilities.f_1X(eval_in_api.$eval_in_api_function_level$.getDynamicValue(thread)), thread);
            if (eval_in_api.NIL != eval_in_api_traced_fnP(operator)) {
                eval_in_api_enter_trace_display(operator, evaluated_args);
            }
            SubLObject cdolist_list_var = eval_in_api.$eval_in_api_env$.getDynamicValue(thread);
            SubLObject binding = (SubLObject)eval_in_api.NIL;
            binding = cdolist_list_var.first();
            while (eval_in_api.NIL != cdolist_list_var) {
                clet_var = binding.first();
                clet_vars = (SubLObject)ConsesLow.cons(clet_var, clet_vars);
                clet_value = binding.rest();
                clet_var_values = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(clet_var, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym15$QUOTE, clet_value)), clet_var_values);
                cdolist_list_var = cdolist_list_var.rest();
                binding = cdolist_list_var.first();
            }
            cdolist_list_var = evaluated_args;
            SubLObject evaluated_arg = (SubLObject)eval_in_api.NIL;
            evaluated_arg = cdolist_list_var.first();
            while (eval_in_api.NIL != cdolist_list_var) {
                quoted_evaluated_args = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym15$QUOTE, evaluated_arg), quoted_evaluated_args);
                cdolist_list_var = cdolist_list_var.rest();
                evaluated_arg = cdolist_list_var.first();
            }
            quoted_evaluated_args = Sequences.nreverse(quoted_evaluated_args);
            form_in_env = (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym21$CLET, (SubLObject)eval_in_api.$list50, (SubLObject)ConsesLow.listS((SubLObject)eval_in_api.$sym21$CLET, clet_var_values, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym51$CSETQ, (SubLObject)eval_in_api.$sym52$FUNCTION_RESULTS, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym53$MULTIPLE_VALUE_LIST, reader.bq_cons(operator, ConsesLow.append(quoted_evaluated_args, (SubLObject)eval_in_api.NIL)))), (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym54$EVAL_IN_API_UPDATE_ENV, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym15$QUOTE, clet_vars)), (SubLObject)eval_in_api.$list50));
            results = eval_in_api_subl_eval(form_in_env);
            if (eval_in_api.NIL != eval_in_api_traced_fnP(operator)) {
                eval_in_api_exit_trace_display(results);
            }
        }
        finally {
            eval_in_api.$eval_in_api_function_level$.rebind(_prev_bind_0, thread);
        }
        return subl_promotions.values_list(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 19366L)
    public static SubLObject api_apply_predefined_function_one_arg(final SubLObject operator, final SubLObject evaluated_arg_value_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = (SubLObject)eval_in_api.NIL;
        SubLObject form_in_env = (SubLObject)eval_in_api.NIL;
        SubLObject clet_vars = (SubLObject)eval_in_api.NIL;
        SubLObject clet_var_values = (SubLObject)eval_in_api.NIL;
        SubLObject clet_var = (SubLObject)eval_in_api.NIL;
        SubLObject clet_value = (SubLObject)eval_in_api.NIL;
        SubLObject evaluated_arg = (SubLObject)eval_in_api.NIL;
        final SubLObject _prev_bind_0 = eval_in_api.$eval_in_api_function_level$.currentBinding(thread);
        try {
            eval_in_api.$eval_in_api_function_level$.bind(number_utilities.f_1X(eval_in_api.$eval_in_api_function_level$.getDynamicValue(thread)), thread);
            if (eval_in_api.NIL != eval_in_api_traced_fnP(operator)) {
                eval_in_api_enter_trace_display(operator, evaluated_arg_value_list);
            }
            SubLObject cdolist_list_var = eval_in_api.$eval_in_api_env$.getDynamicValue(thread);
            SubLObject binding = (SubLObject)eval_in_api.NIL;
            binding = cdolist_list_var.first();
            while (eval_in_api.NIL != cdolist_list_var) {
                clet_var = binding.first();
                clet_vars = (SubLObject)ConsesLow.cons(clet_var, clet_vars);
                clet_value = binding.rest();
                clet_var_values = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(clet_var, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym15$QUOTE, clet_value)), clet_var_values);
                cdolist_list_var = cdolist_list_var.rest();
                binding = cdolist_list_var.first();
            }
            evaluated_arg = (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym55$VALUES_LIST, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym15$QUOTE, evaluated_arg_value_list));
            form_in_env = (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym21$CLET, (SubLObject)eval_in_api.$list50, (SubLObject)ConsesLow.listS((SubLObject)eval_in_api.$sym21$CLET, clet_var_values, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym51$CSETQ, (SubLObject)eval_in_api.$sym52$FUNCTION_RESULTS, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym53$MULTIPLE_VALUE_LIST, (SubLObject)ConsesLow.list(operator, evaluated_arg))), (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym54$EVAL_IN_API_UPDATE_ENV, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym15$QUOTE, clet_vars)), (SubLObject)eval_in_api.$list50));
            results = eval_in_api_subl_eval(form_in_env);
            if (eval_in_api.NIL != eval_in_api_traced_fnP(operator)) {
                eval_in_api_exit_trace_display(results);
            }
        }
        finally {
            eval_in_api.$eval_in_api_function_level$.rebind(_prev_bind_0, thread);
        }
        return subl_promotions.values_list(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 20635L)
    public static SubLObject api_expand_predefined_macro(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject form_in_env = (SubLObject)eval_in_api.NIL;
        SubLObject result = (SubLObject)eval_in_api.NIL;
        SubLObject clet_vars = (SubLObject)eval_in_api.NIL;
        SubLObject clet_var_values = (SubLObject)eval_in_api.NIL;
        SubLObject clet_var = (SubLObject)eval_in_api.NIL;
        SubLObject clet_value = (SubLObject)eval_in_api.NIL;
        SubLObject cdolist_list_var = eval_in_api.$eval_in_api_env$.getDynamicValue(thread);
        SubLObject binding = (SubLObject)eval_in_api.NIL;
        binding = cdolist_list_var.first();
        while (eval_in_api.NIL != cdolist_list_var) {
            clet_var = binding.first();
            clet_var_values = (SubLObject)ConsesLow.cons(clet_var, clet_var_values);
            clet_value = binding.rest();
            clet_var_values = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(clet_var, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym15$QUOTE, clet_value)), clet_var_values);
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        clet_vars = Sequences.nreverse(clet_vars);
        clet_var_values = Sequences.nreverse(clet_var_values);
        form_in_env = (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym21$CLET, (SubLObject)eval_in_api.$list56, (SubLObject)ConsesLow.listS((SubLObject)eval_in_api.$sym21$CLET, clet_vars, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym51$CSETQ, (SubLObject)eval_in_api.$sym57$MACRO_RESULT, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym58$MACROEXPAND_1, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym15$QUOTE, form))), (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym54$EVAL_IN_API_UPDATE_ENV, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym15$QUOTE, clet_vars)), (SubLObject)eval_in_api.$list56));
        result = eval_in_api_subl_eval(form_in_env);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 21458L)
    public static SubLObject api_funcall_special_handler(final SubLObject operator, final SubLObject special_handler, final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)eval_in_api.NIL;
        final SubLObject _prev_bind_0 = eval_in_api.$eval_in_api_function_level$.currentBinding(thread);
        try {
            eval_in_api.$eval_in_api_function_level$.bind(eval_in_api.$eval_in_api_function_level$.getDynamicValue(thread), thread);
            if (eval_in_api.NIL != eval_in_api_traced_fnP(operator)) {
                eval_in_api.$eval_in_api_function_level$.setDynamicValue(Numbers.add(eval_in_api.$eval_in_api_function_level$.getDynamicValue(thread), (SubLObject)eval_in_api.ONE_INTEGER), thread);
                eval_in_api_enter_trace_display(form.first(), form.rest());
            }
            result = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(eval_in_api_subl_funcall(special_handler, form, (SubLObject)eval_in_api.UNPROVIDED, (SubLObject)eval_in_api.UNPROVIDED, (SubLObject)eval_in_api.UNPROVIDED)));
            if (eval_in_api.NIL != eval_in_api_traced_fnP(operator)) {
                eval_in_api_exit_trace_display(result);
            }
        }
        finally {
            eval_in_api.$eval_in_api_function_level$.rebind(_prev_bind_0, thread);
        }
        return subl_promotions.values_list(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 21997L)
    public static SubLObject api_funcall_special_verify_handler(final SubLObject operator, final SubLObject special_handler, final SubLObject form) {
        SubLObject result = (SubLObject)eval_in_api.NIL;
        result = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(eval_in_api_subl_funcall(special_handler, form, (SubLObject)eval_in_api.UNPROVIDED, (SubLObject)eval_in_api.UNPROVIDED, (SubLObject)eval_in_api.UNPROVIDED)));
        return subl_promotions.values_list(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 22240L)
    public static SubLObject api_apply_function_handler(final SubLObject operator, final SubLObject function_handler, final SubLObject evaluated_args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = (SubLObject)eval_in_api.NIL;
        final SubLObject env_depth_upon_entering = Sequences.length(eval_in_api.$eval_in_api_env$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = eval_in_api.$eval_in_api_function_level$.currentBinding(thread);
        try {
            eval_in_api.$eval_in_api_function_level$.bind(eval_in_api.$eval_in_api_function_level$.getDynamicValue(thread), thread);
            if (eval_in_api.NIL != eval_in_api_traced_fnP(operator)) {
                eval_in_api.$eval_in_api_function_level$.setDynamicValue(Numbers.add(eval_in_api.$eval_in_api_function_level$.getDynamicValue(thread), (SubLObject)eval_in_api.ONE_INTEGER), thread);
                eval_in_api_enter_trace_display(operator, evaluated_args);
            }
            try {
                thread.throwStack.push(eval_in_api.$kw59$EVAL_IN_API_RET);
                results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(function_handler.isCons() ? api_apply_lambda(function_handler, evaluated_args) : eval_in_api_subl_apply(function_handler, evaluated_args)));
            }
            catch (Throwable ccatch_env_var) {
                results = Errors.handleThrowable(ccatch_env_var, (SubLObject)eval_in_api.$kw59$EVAL_IN_API_RET);
            }
            finally {
                thread.throwStack.pop();
            }
            if (eval_in_api.NIL != eval_in_api_traced_fnP(operator)) {
                eval_in_api_exit_trace_display(results);
            }
            while (Sequences.length(eval_in_api.$eval_in_api_env$.getDynamicValue(thread)).numG(env_depth_upon_entering)) {
                eval_in_api.$eval_in_api_env$.setDynamicValue(eval_in_api.$eval_in_api_env$.getDynamicValue(thread).rest(), thread);
            }
        }
        finally {
            eval_in_api.$eval_in_api_function_level$.rebind(_prev_bind_0, thread);
        }
        return subl_promotions.values_list(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 23177L)
    public static SubLObject api_apply_lambda(final SubLObject lambda_expression, final SubLObject evaluated_args) {
        SubLObject results = (SubLObject)eval_in_api.NIL;
        final SubLObject lambda_list = conses_high.second(lambda_expression);
        final SubLObject body = lambda_expression.rest().rest();
        SubLObject form_to_eval = (SubLObject)eval_in_api.NIL;
        form_to_eval = Eval.macroexpand_1((SubLObject)ConsesLow.listS((SubLObject)eval_in_api.$sym12$CDESTRUCTURING_BIND, lambda_list, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym15$QUOTE, evaluated_args), ConsesLow.append(body, (SubLObject)eval_in_api.NIL)), (SubLObject)eval_in_api.UNPROVIDED);
        results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(eval_in_api_internal(form_to_eval)));
        return subl_promotions.values_list(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 23629L)
    public static SubLObject api_funcall_macro_expander(final SubLObject macro_expander, final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = (SubLObject)eval_in_api.NIL;
        final SubLObject env_depth_upon_entering = Sequences.length(eval_in_api.$eval_in_api_env$.getDynamicValue(thread));
        try {
            thread.throwStack.push(eval_in_api.$kw59$EVAL_IN_API_RET);
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(macro_expander.isCons() ? api_apply_lambda(macro_expander, (SubLObject)ConsesLow.list(form)) : eval_in_api_subl_funcall(macro_expander, form, (SubLObject)eval_in_api.UNPROVIDED, (SubLObject)eval_in_api.UNPROVIDED, (SubLObject)eval_in_api.UNPROVIDED)));
        }
        catch (Throwable ccatch_env_var) {
            results = Errors.handleThrowable(ccatch_env_var, (SubLObject)eval_in_api.$kw59$EVAL_IN_API_RET);
        }
        finally {
            thread.throwStack.pop();
        }
        while (Sequences.length(eval_in_api.$eval_in_api_env$.getDynamicValue(thread)).numG(env_depth_upon_entering)) {
            eval_in_api.$eval_in_api_env$.setDynamicValue(eval_in_api.$eval_in_api_env$.getDynamicValue(thread).rest(), thread);
        }
        return subl_promotions.values_list(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 24220L)
    public static SubLObject with_eval_in_api_env(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym60$WITH_EVAL_IN_API_ENV_INT, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym15$QUOTE, body));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 24384L)
    public static SubLObject with_eval_in_api_env_int(final SubLObject body) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = (SubLObject)eval_in_api.NIL;
        SubLObject form_to_eval = (SubLObject)eval_in_api.NIL;
        SubLObject clet_vars = (SubLObject)eval_in_api.NIL;
        SubLObject clet_var_values = (SubLObject)eval_in_api.NIL;
        SubLObject clet_var = (SubLObject)eval_in_api.NIL;
        SubLObject clet_value = (SubLObject)eval_in_api.NIL;
        SubLObject cdolist_list_var = eval_in_api.$eval_in_api_env$.getDynamicValue(thread);
        SubLObject binding = (SubLObject)eval_in_api.NIL;
        binding = cdolist_list_var.first();
        while (eval_in_api.NIL != cdolist_list_var) {
            clet_var = binding.first();
            clet_vars = (SubLObject)ConsesLow.cons(clet_var, clet_vars);
            clet_value = binding.rest();
            clet_var_values = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(clet_var, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym15$QUOTE, clet_value)), clet_var_values);
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        clet_vars = Sequences.nreverse(clet_vars);
        clet_var_values = Sequences.nreverse(clet_var_values);
        form_to_eval = (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym21$CLET, (SubLObject)eval_in_api.$list61, (SubLObject)ConsesLow.listS((SubLObject)eval_in_api.$sym21$CLET, clet_var_values, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym51$CSETQ, (SubLObject)eval_in_api.$sym62$BODY_RESULTS, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym53$MULTIPLE_VALUE_LIST, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym63$EVAL_IN_API_PROGN_BODY, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym15$QUOTE, body)))), (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym54$EVAL_IN_API_UPDATE_ENV, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym15$QUOTE, clet_vars)), (SubLObject)eval_in_api.$list61));
        trace_me((SubLObject)eval_in_api.$str64$with_eval_in_api_env_int, form_to_eval, (SubLObject)eval_in_api.UNPROVIDED, (SubLObject)eval_in_api.UNPROVIDED);
        results = eval_in_api_subl_eval(form_to_eval);
        return subl_promotions.values_list(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 25311L)
    public static SubLObject eval_in_api_update_env(final SubLObject clet_vars) {
        SubLObject cdolist_list_var = clet_vars;
        SubLObject clet_var = (SubLObject)eval_in_api.NIL;
        clet_var = cdolist_list_var.first();
        while (eval_in_api.NIL != cdolist_list_var) {
            if (eval_in_api.NIL != Symbols.boundp(clet_var)) {
                final SubLObject quoted_value = (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym15$QUOTE, Symbols.symbol_value(clet_var));
                eval_in_api_csetq(clet_var, quoted_value, (SubLObject)eval_in_api.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            clet_var = cdolist_list_var.first();
        }
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 26684L)
    public static SubLObject verify_in_api(final SubLObject form, SubLObject verboseP) {
        if (verboseP == eval_in_api.UNPROVIDED) {
            verboseP = (SubLObject)eval_in_api.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)eval_in_api.NIL;
        final SubLObject _prev_bind_0 = eval_in_api.$verify_in_api_bound_symbols$.currentBinding(thread);
        final SubLObject _prev_bind_2 = eval_in_api.$verify_in_api_fbound_symbols$.currentBinding(thread);
        final SubLObject _prev_bind_3 = eval_in_api.$verify_in_api_verbose_modeP$.currentBinding(thread);
        try {
            eval_in_api.$verify_in_api_bound_symbols$.bind((SubLObject)eval_in_api.NIL, thread);
            eval_in_api.$verify_in_api_fbound_symbols$.bind((SubLObject)eval_in_api.NIL, thread);
            eval_in_api.$verify_in_api_verbose_modeP$.bind(verboseP, thread);
            result = list_utilities.fast_delete_duplicates(verify_form_in_api_internal(form), Symbols.symbol_function((SubLObject)eval_in_api.EQ), (SubLObject)eval_in_api.UNPROVIDED, (SubLObject)eval_in_api.UNPROVIDED, (SubLObject)eval_in_api.UNPROVIDED, (SubLObject)eval_in_api.UNPROVIDED);
        }
        finally {
            eval_in_api.$verify_in_api_verbose_modeP$.rebind(_prev_bind_3, thread);
            eval_in_api.$verify_in_api_fbound_symbols$.rebind(_prev_bind_2, thread);
            eval_in_api.$verify_in_api_bound_symbols$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 26999L)
    public static SubLObject verify_args_in_api_internal(final SubLObject arglist) {
        SubLObject result = (SubLObject)eval_in_api.NIL;
        SubLObject cdolist_list_var = arglist;
        SubLObject form = (SubLObject)eval_in_api.NIL;
        form = cdolist_list_var.first();
        while (eval_in_api.NIL != cdolist_list_var) {
            result = ConsesLow.nconc(result, verify_form_in_api_internal(form));
            cdolist_list_var = cdolist_list_var.rest();
            form = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 27190L)
    public static SubLObject verify_form_in_api_internal(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)eval_in_api.NIL;
        if (form.isCons()) {
            SubLObject operator = (SubLObject)eval_in_api.NIL;
            SubLObject args = (SubLObject)eval_in_api.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)eval_in_api.$list44);
            operator = form.first();
            final SubLObject current = args = form.rest();
            if (!operator.isSymbol()) {
                if (eval_in_api.NIL != eval_in_api.$verify_in_api_verbose_modeP$.getDynamicValue(thread)) {
                    Errors.warn((SubLObject)eval_in_api.$str45$Operator__S_was_not_a_symbol, operator);
                }
                result = (SubLObject)ConsesLow.cons(operator, result);
            }
            else if (eval_in_api.NIL != utilities_macros.api_special_p(operator)) {
                final SubLObject special_handler = api_special_verify_handler(operator);
                if (eval_in_api.NIL != special_handler) {
                    result = ConsesLow.nconc(result, api_funcall_special_handler(operator, special_handler, form));
                }
                else {
                    result = (SubLObject)ConsesLow.cons(operator, result);
                    if (eval_in_api.NIL != eval_in_api.$verify_in_api_verbose_modeP$.getDynamicValue(thread)) {
                        Errors.warn((SubLObject)eval_in_api.$str66$don_t_know_how_to_handle_special_, operator);
                    }
                }
            }
            else if (eval_in_api.NIL != api_macro_p(operator)) {
                final SubLObject macro_expander = api_macro_expander(operator);
                final SubLObject expanded_form = api_funcall_macro_expander(macro_expander, form);
                result = ConsesLow.nconc(result, verify_form_in_api_internal(expanded_form));
            }
            else if (eval_in_api.NIL != api_function_p(operator)) {
                final SubLObject function_handler = api_function_handler(operator);
                result = ConsesLow.nconc(result, verify_form_in_api_internal(args));
            }
            else if (eval_in_api.NIL != utilities_macros.api_predefined_macro_p(operator)) {
                final SubLObject _prev_bind_0 = eval_in_api.$verify_in_api_macro_stack$.currentBinding(thread);
                try {
                    eval_in_api.$verify_in_api_macro_stack$.bind((SubLObject)ConsesLow.cons(operator, eval_in_api.$verify_in_api_macro_stack$.getDynamicValue(thread)), thread);
                    final SubLObject expanded_form = api_expand_predefined_macro(form);
                    result = ConsesLow.nconc(result, verify_form_in_api_internal(expanded_form));
                }
                finally {
                    eval_in_api.$verify_in_api_macro_stack$.rebind(_prev_bind_0, thread);
                }
            }
            else if (eval_in_api.NIL != utilities_macros.api_predefined_function_p(operator) || eval_in_api.NIL != utilities_macros.kb_function_p(operator)) {
                if (eval_in_api.NIL != list_utilities.singletonP(args)) {
                    result = ConsesLow.nconc(result, verify_form_in_api_internal(args.first()));
                }
                else {
                    result = ConsesLow.nconc(result, verify_args_in_api_internal(args));
                }
            }
            else if (operator.isFunctionSpec() && !operator.isMacroOperator() && (eval_in_api.NIL != access_macros.macro_helper_for_any_of_macrosP(operator, eval_in_api.$verify_in_api_macro_stack$.getDynamicValue(thread)) || eval_in_api.NIL != access_macros.external_symbol_p(operator))) {
                result = ConsesLow.nconc(result, verify_args_in_api_internal(args));
            }
            else if (operator.isMacroOperator() && (eval_in_api.NIL != access_macros.external_symbol_p(operator) || eval_in_api.NIL != access_macros.macro_helper_for_any_of_macrosP(operator, eval_in_api.$verify_in_api_macro_stack$.getDynamicValue(thread)))) {
                final SubLObject _prev_bind_0 = eval_in_api.$verify_in_api_macro_stack$.currentBinding(thread);
                try {
                    eval_in_api.$verify_in_api_macro_stack$.bind((SubLObject)ConsesLow.cons(operator, eval_in_api.$verify_in_api_macro_stack$.getDynamicValue(thread)), thread);
                    final SubLObject expanded_form = api_expand_predefined_macro(form);
                    result = ConsesLow.nconc(result, verify_form_in_api_internal(expanded_form));
                }
                finally {
                    eval_in_api.$verify_in_api_macro_stack$.rebind(_prev_bind_0, thread);
                }
            }
            else if (eval_in_api.NIL == subl_promotions.memberP(operator, eval_in_api.$verify_in_api_fbound_symbols$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)eval_in_api.EQL), (SubLObject)eval_in_api.UNPROVIDED)) {
                if (eval_in_api.NIL != eval_in_api.$verify_in_api_verbose_modeP$.getDynamicValue(thread)) {
                    Errors.warn((SubLObject)eval_in_api.$str46$Operator__S_is_not_defined_in_the, operator);
                }
                result = (SubLObject)ConsesLow.cons(operator, result);
            }
        }
        else {
            result = ConsesLow.nconc(result, verify_symbol_in_api_internal(form));
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 30098L)
    public static SubLObject verify_symbol_in_api_internal(final SubLObject symbol) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)eval_in_api.NIL;
        if (symbol.isSymbol()) {
            if (eval_in_api.NIL == Eval.constantp(symbol, (SubLObject)eval_in_api.UNPROVIDED)) {
                if (eval_in_api.NIL == api_lexical_variable_p(symbol)) {
                    if (eval_in_api.NIL == api_user_variable_p(symbol)) {
                        if (eval_in_api.NIL == api_dynamic_variable_p(symbol)) {
                            if (eval_in_api.NIL == api_immutable_global_p(symbol)) {
                                if (eval_in_api.NIL == subl_promotions.memberP(symbol, eval_in_api.$verify_in_api_bound_symbols$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)eval_in_api.EQL), (SubLObject)eval_in_api.UNPROVIDED)) {
                                    if (eval_in_api.NIL != eval_in_api.$verify_in_api_verbose_modeP$.getDynamicValue(thread)) {
                                        Errors.warn((SubLObject)eval_in_api.$str47$Variable__S_is_unbound, symbol);
                                    }
                                    result = (SubLObject)ConsesLow.cons(symbol, result);
                                }
                            }
                        }
                    }
                }
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 32305L)
    public static SubLObject api_special_ret(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject expression = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list68);
        expression = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            SubLObject results = (SubLObject)eval_in_api.NIL;
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(eval_in_api_internal(expression)));
            return Dynamic.sublisp_throw((SubLObject)eval_in_api.$kw59$EVAL_IN_API_RET, results);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list68);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 32550L)
    public static SubLObject api_special_ret_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject expression = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list68);
        expression = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            return verify_form_in_api_internal(expression);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list68);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 32643L)
    public static SubLObject api_special_define(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject name = (SubLObject)eval_in_api.NIL;
        SubLObject arglist = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list7);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list7);
        arglist = current.first();
        SubLObject body;
        current = (body = current.rest());
        if (body.first().isString()) {
            body = body.rest();
        }
        final SubLObject function_handler = (SubLObject)ConsesLow.listS((SubLObject)eval_in_api.$sym72$LAMBDA, arglist, ConsesLow.append(body, (SubLObject)eval_in_api.NIL));
        register_api_function(name, function_handler);
        return name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 32889L)
    public static SubLObject api_special_define_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject name = (SubLObject)eval_in_api.NIL;
        SubLObject arglist = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list7);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list7);
        arglist = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return api_special_define_verify_int(name, arglist, body);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 33023L)
    public static SubLObject api_special_define_public(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject name = (SubLObject)eval_in_api.NIL;
        SubLObject arglist = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list7);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list7);
        arglist = current.first();
        SubLObject body;
        current = (body = current.rest());
        if (body.first().isString()) {
            body = body.rest();
        }
        final SubLObject function_handler = (SubLObject)ConsesLow.listS((SubLObject)eval_in_api.$sym72$LAMBDA, arglist, ConsesLow.append(body, (SubLObject)eval_in_api.NIL));
        register_api_function(name, function_handler);
        return name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 33276L)
    public static SubLObject api_special_define_public_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject name = (SubLObject)eval_in_api.NIL;
        SubLObject arglist = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list7);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list7);
        arglist = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return api_special_define_verify_int(name, arglist, body);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 33417L)
    public static SubLObject api_special_define_protected(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject name = (SubLObject)eval_in_api.NIL;
        SubLObject arglist = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list7);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list7);
        arglist = current.first();
        SubLObject body;
        current = (body = current.rest());
        if (body.first().isString()) {
            body = body.rest();
        }
        final SubLObject function_handler = (SubLObject)ConsesLow.listS((SubLObject)eval_in_api.$sym72$LAMBDA, arglist, ConsesLow.append(body, (SubLObject)eval_in_api.NIL));
        register_api_function(name, function_handler);
        return name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 33673L)
    public static SubLObject api_special_define_protected_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject name = (SubLObject)eval_in_api.NIL;
        SubLObject arglist = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list7);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list7);
        arglist = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return api_special_define_verify_int(name, arglist, body);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 33817L)
    public static SubLObject api_special_define_private(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject name = (SubLObject)eval_in_api.NIL;
        SubLObject arglist = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list7);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list7);
        arglist = current.first();
        SubLObject body;
        current = (body = current.rest());
        if (body.first().isString()) {
            body = body.rest();
        }
        final SubLObject function_handler = (SubLObject)ConsesLow.listS((SubLObject)eval_in_api.$sym72$LAMBDA, arglist, ConsesLow.append(body, (SubLObject)eval_in_api.NIL));
        register_api_function(name, function_handler);
        return name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 34071L)
    public static SubLObject api_special_define_private_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject name = (SubLObject)eval_in_api.NIL;
        SubLObject arglist = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list7);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list7);
        arglist = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return api_special_define_verify_int(name, arglist, body);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 34213L)
    public static SubLObject api_special_defmacro(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject name = (SubLObject)eval_in_api.NIL;
        SubLObject arglist = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list7);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list7);
        arglist = current.first();
        SubLObject body;
        current = (body = current.rest());
        if (body.first().isString()) {
            body = body.rest();
        }
        final SubLObject form_$4 = (SubLObject)eval_in_api.$sym84$FORM;
        final SubLObject macro_expander = (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym72$LAMBDA, (SubLObject)ConsesLow.list(form_$4), (SubLObject)ConsesLow.listS((SubLObject)eval_in_api.$sym12$CDESTRUCTURING_BIND, arglist, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym13$CDR, form_$4), ConsesLow.append(body, (SubLObject)eval_in_api.NIL)));
        register_api_macro(name, macro_expander);
        return name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 34866L)
    public static SubLObject api_special_defmacro_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject name = (SubLObject)eval_in_api.NIL;
        SubLObject arglist = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list7);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list7);
        arglist = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return api_special_define_verify_int(name, arglist, body);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 35002L)
    public static SubLObject api_special_defmacro_public(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject name = (SubLObject)eval_in_api.NIL;
        SubLObject arglist = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list7);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list7);
        arglist = current.first();
        SubLObject body;
        current = (body = current.rest());
        if (body.first().isString()) {
            body = body.rest();
        }
        final SubLObject form_$5 = (SubLObject)eval_in_api.$sym88$FORM;
        final SubLObject macro_expander = (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym72$LAMBDA, (SubLObject)ConsesLow.list(form_$5), (SubLObject)ConsesLow.listS((SubLObject)eval_in_api.$sym12$CDESTRUCTURING_BIND, arglist, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym13$CDR, form_$5), ConsesLow.append(body, (SubLObject)eval_in_api.NIL)));
        register_api_macro(name, macro_expander);
        return name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 35333L)
    public static SubLObject api_special_defmacro_public_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject name = (SubLObject)eval_in_api.NIL;
        SubLObject arglist = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list7);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list7);
        arglist = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return api_special_define_verify_int(name, arglist, body);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 35476L)
    public static SubLObject api_special_defmacro_protected(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject name = (SubLObject)eval_in_api.NIL;
        SubLObject arglist = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list7);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list7);
        arglist = current.first();
        SubLObject body;
        current = (body = current.rest());
        if (body.first().isString()) {
            body = body.rest();
        }
        final SubLObject form_$6 = (SubLObject)eval_in_api.$sym92$FORM;
        final SubLObject macro_expander = (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym72$LAMBDA, (SubLObject)ConsesLow.list(form_$6), (SubLObject)ConsesLow.listS((SubLObject)eval_in_api.$sym12$CDESTRUCTURING_BIND, arglist, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym13$CDR, form_$6), ConsesLow.append(body, (SubLObject)eval_in_api.NIL)));
        register_api_macro(name, macro_expander);
        return name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 35810L)
    public static SubLObject api_special_defmacro_protected_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject name = (SubLObject)eval_in_api.NIL;
        SubLObject arglist = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list7);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list7);
        arglist = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return api_special_define_verify_int(name, arglist, body);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 35956L)
    public static SubLObject api_special_define_verify_int(final SubLObject name, final SubLObject arglist, final SubLObject body) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)eval_in_api.NIL;
        final SubLObject _prev_bind_0 = eval_in_api.$verify_in_api_bound_symbols$.currentBinding(thread);
        try {
            eval_in_api.$verify_in_api_bound_symbols$.bind(eval_in_api.$verify_in_api_bound_symbols$.getDynamicValue(thread), thread);
            eval_in_api.$verify_in_api_fbound_symbols$.setDynamicValue((SubLObject)ConsesLow.cons(name, eval_in_api.$verify_in_api_fbound_symbols$.getDynamicValue(thread)), thread);
            SubLObject cdolist_list_var = arglist;
            SubLObject arg = (SubLObject)eval_in_api.NIL;
            arg = cdolist_list_var.first();
            while (eval_in_api.NIL != cdolist_list_var) {
                if (arg.isSymbol()) {
                    eval_in_api.$verify_in_api_bound_symbols$.setDynamicValue((SubLObject)ConsesLow.cons(arg, eval_in_api.$verify_in_api_bound_symbols$.getDynamicValue(thread)), thread);
                }
                else if (arg.isCons()) {
                    eval_in_api.$verify_in_api_bound_symbols$.setDynamicValue((SubLObject)ConsesLow.cons(arg.first(), eval_in_api.$verify_in_api_bound_symbols$.getDynamicValue(thread)), thread);
                }
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            }
            result = ConsesLow.nconc(result, verify_args_in_api_internal(body));
        }
        finally {
            eval_in_api.$verify_in_api_bound_symbols$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 36427L)
    public static SubLObject api_special_defstruct(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list96);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject name = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list96);
        name = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            final SubLObject v_slots;
            current = (v_slots = temp);
            return eval_in_api_defstruct(name, v_slots);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list96);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 36843L)
    public static SubLObject api_special_defstruct_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list99);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject name = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list99);
        name = current.first();
        final SubLObject v_slots;
        current = (v_slots = current.rest());
        current = temp;
        if (eval_in_api.NIL == current) {
            return (SubLObject)eval_in_api.NIL;
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list99);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 36935L)
    public static SubLObject eval_in_api_defstruct(final SubLObject name, final SubLObject v_slots) {
        return eval_in_api_internal((SubLObject)ConsesLow.listS((SubLObject)eval_in_api.$sym101$DEFSTRUCT_VECTOR, (SubLObject)ConsesLow.list(name), ConsesLow.append(v_slots, (SubLObject)eval_in_api.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 37056L)
    public static SubLObject api_special_fi_get_parameter(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject symbol = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list102);
        symbol = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            return eval_in_api(eval_in_api(symbol));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list102);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 37164L)
    public static SubLObject api_special_fi_get_parameter_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject symbol = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list102);
        symbol = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            return verify_symbol_in_api_internal(symbol);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list102);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 37264L)
    public static SubLObject api_special_defvar(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject symbol = (SubLObject)eval_in_api.NIL;
        SubLObject value = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list106);
        symbol = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list106);
        value = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            return eval_in_api_defvar(symbol, value);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list106);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 37360L)
    public static SubLObject api_special_defvar_verify(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject symbol = (SubLObject)eval_in_api.NIL;
        SubLObject value = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list106);
        symbol = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list106);
        value = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            eval_in_api.$verify_in_api_fbound_symbols$.setDynamicValue((SubLObject)ConsesLow.cons(symbol, eval_in_api.$verify_in_api_fbound_symbols$.getDynamicValue(thread)), thread);
            return verify_form_in_api_internal(value);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list106);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 37501L)
    public static SubLObject api_special_defvar_private(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject symbol = (SubLObject)eval_in_api.NIL;
        SubLObject value = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list106);
        symbol = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list106);
        value = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            return eval_in_api_defvar(symbol, value);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list106);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 37594L)
    public static SubLObject api_special_defvar_private_verify(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject symbol = (SubLObject)eval_in_api.NIL;
        SubLObject value = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list106);
        symbol = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list106);
        value = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            eval_in_api.$verify_in_api_fbound_symbols$.setDynamicValue((SubLObject)ConsesLow.cons(symbol, eval_in_api.$verify_in_api_fbound_symbols$.getDynamicValue(thread)), thread);
            return verify_form_in_api_internal(value);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list106);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 37743L)
    public static SubLObject eval_in_api_defvar(final SubLObject symbol, final SubLObject value) {
        if (eval_in_api.NIL == api_user_variable_p(symbol)) {
            put_api_user_variable(symbol, value);
        }
        return symbol;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 38239L)
    public static SubLObject api_user_variable_p(final SubLObject var) {
        return (SubLObject)SubLObjectFactory.makeBoolean(eval_in_api.NIL != dictionary.dictionary_p(eval_in_api.$api_user_variables$.getGlobalValue()) && eval_in_api.NIL != dictionary_utilities.dictionary_has_keyP(eval_in_api.$api_user_variables$.getGlobalValue(), var));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 38394L)
    public static SubLObject clear_api_user_variables() {
        if (eval_in_api.NIL != eval_in_api.$api_user_variables$.getGlobalValue()) {
            dictionary.clear_dictionary(eval_in_api.$api_user_variables$.getGlobalValue());
        }
        else {
            eval_in_api.$api_user_variables$.setGlobalValue(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)eval_in_api.EQUAL), (SubLObject)eval_in_api.UNPROVIDED));
        }
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 38655L)
    public static SubLObject put_api_user_variable(final SubLObject var, final SubLObject value) {
        if (eval_in_api.NIL == eval_in_api.$api_user_variables$.getGlobalValue()) {
            eval_in_api.$api_user_variables$.setGlobalValue(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)eval_in_api.EQUAL), (SubLObject)eval_in_api.UNPROVIDED));
        }
        dictionary.dictionary_enter(eval_in_api.$api_user_variables$.getGlobalValue(), var, value);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 38948L)
    public static SubLObject get_api_user_variable(final SubLObject var) {
        if (eval_in_api.NIL == eval_in_api.$api_user_variables$.getGlobalValue()) {
            eval_in_api.$api_user_variables$.setGlobalValue(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)eval_in_api.EQUAL), (SubLObject)eval_in_api.UNPROVIDED));
        }
        return dictionary.dictionary_lookup(eval_in_api.$api_user_variables$.getGlobalValue(), var, (SubLObject)eval_in_api.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 39186L)
    public static SubLObject api_special_fi_set_parameter(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject symbol = (SubLObject)eval_in_api.NIL;
        SubLObject value = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list106);
        symbol = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list106);
        value = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            return eval_in_api_csetq(eval_in_api(symbol), value, (SubLObject)eval_in_api.UNPROVIDED);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list106);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 39294L)
    public static SubLObject api_special_fi_set_parameter_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject symbol = (SubLObject)eval_in_api.NIL;
        SubLObject value = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list106);
        symbol = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list106);
        value = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            return ConsesLow.nconc(verify_symbol_in_api_internal(symbol), verify_form_in_api_internal(value));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list106);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 39451L)
    public static SubLObject api_special_csetq(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject var = (SubLObject)eval_in_api.NIL;
        SubLObject value = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list125);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list125);
        value = current.first();
        final SubLObject var_value_pairs;
        current = (var_value_pairs = current.rest());
        return eval_in_api_csetq(var, value, var_value_pairs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 39566L)
    public static SubLObject api_special_csetq_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject var = (SubLObject)eval_in_api.NIL;
        SubLObject value = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list125);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list125);
        value = current.first();
        final SubLObject var_value_pairs;
        current = (var_value_pairs = current.rest());
        return ConsesLow.nconc(verify_symbol_in_api_internal(var), verify_form_in_api_internal(value), verify_args_in_api_internal(var_value_pairs));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 39781L)
    public static SubLObject eval_in_api_csetq(final SubLObject var, final SubLObject value, SubLObject var_value_pairs) {
        if (var_value_pairs == eval_in_api.UNPROVIDED) {
            var_value_pairs = (SubLObject)eval_in_api.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject evaluated_value = eval_in_api_internal(value);
        if (!var.isSymbol()) {
            eval_in_api_error((SubLObject)eval_in_api.$str128$_S_is_not_a_symbol, var, (SubLObject)eval_in_api.UNPROVIDED);
        }
        else {
            if (eval_in_api.NIL != api_dynamic_variable_p(var)) {
                Symbols.set(var, evaluated_value);
                return evaluated_value;
            }
            if (eval_in_api.NIL == api_lexical_variable_p(var)) {
                if (eval_in_api.NIL != api_user_variable_p(var)) {
                    put_api_user_variable(var, evaluated_value);
                    return evaluated_value;
                }
                if (eval_in_api.$eval_in_api_level$.getDynamicValue(thread).eql((SubLObject)eval_in_api.ZERO_INTEGER)) {
                    eval_in_api.$eval_in_api_env$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var), eval_in_api.$eval_in_api_env$.getDynamicValue(thread)), thread);
                }
                else {
                    eval_in_api_error((SubLObject)eval_in_api.$str129$_S_is_not_defined, var, (SubLObject)eval_in_api.UNPROVIDED);
                }
            }
        }
        ConsesLow.rplacd(conses_high.assoc(var, eval_in_api.$eval_in_api_env$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)eval_in_api.EQ), (SubLObject)eval_in_api.UNPROVIDED), evaluated_value);
        if (eval_in_api.NIL != var_value_pairs) {
            evaluated_value = eval_in_api_csetq(var_value_pairs.first(), conses_high.second(var_value_pairs), conses_high.cddr(var_value_pairs));
        }
        return evaluated_value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 40768L)
    public static SubLObject api_special_cinc(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject x = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list130);
        x = current.first();
        current = current.rest();
        final SubLObject delta = (SubLObject)(current.isCons() ? current.first() : eval_in_api.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)eval_in_api.$list130);
        current = current.rest();
        if (eval_in_api.NIL == current) {
            if (eval_in_api.NIL == api_lexical_variable_p(x)) {
                eval_in_api_error((SubLObject)eval_in_api.$str131$_S_is_not_an_api_variable, x, (SubLObject)eval_in_api.UNPROVIDED);
            }
            final SubLObject current_value = api_lexical_variable_value(x);
            final SubLObject new_value = Numbers.add(current_value, delta);
            ConsesLow.rplacd(conses_high.assoc(x, eval_in_api.$eval_in_api_env$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)eval_in_api.EQ), (SubLObject)eval_in_api.UNPROVIDED), new_value);
            return x;
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list130);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 41142L)
    public static SubLObject api_special_cinc_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject x = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list130);
        x = current.first();
        current = current.rest();
        final SubLObject delta = (SubLObject)(current.isCons() ? current.first() : eval_in_api.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)eval_in_api.$list130);
        current = current.rest();
        if (eval_in_api.NIL == current) {
            return ConsesLow.nconc(verify_form_in_api_internal(x), verify_form_in_api_internal(delta));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list130);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 41289L)
    public static SubLObject api_special_cdec(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject x = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list130);
        x = current.first();
        current = current.rest();
        final SubLObject delta = (SubLObject)(current.isCons() ? current.first() : eval_in_api.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)eval_in_api.$list130);
        current = current.rest();
        if (eval_in_api.NIL == current) {
            if (eval_in_api.NIL == api_lexical_variable_p(x)) {
                eval_in_api_error((SubLObject)eval_in_api.$str131$_S_is_not_an_api_variable, x, (SubLObject)eval_in_api.UNPROVIDED);
            }
            final SubLObject current_value = api_lexical_variable_value(x);
            final SubLObject new_value = Numbers.subtract(current_value, delta);
            ConsesLow.rplacd(conses_high.assoc(x, eval_in_api.$eval_in_api_env$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)eval_in_api.EQ), (SubLObject)eval_in_api.UNPROVIDED), new_value);
            return x;
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list130);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 41688L)
    public static SubLObject api_special_cdec_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject x = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list130);
        x = current.first();
        current = current.rest();
        final SubLObject delta = (SubLObject)(current.isCons() ? current.first() : eval_in_api.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)eval_in_api.$list130);
        current = current.rest();
        if (eval_in_api.NIL == current) {
            return ConsesLow.nconc(verify_form_in_api_internal(x), verify_form_in_api_internal(delta));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list130);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 41835L)
    public static SubLObject api_special_cpush(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject item = (SubLObject)eval_in_api.NIL;
        SubLObject place = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list138);
        item = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list138);
        place = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            if (eval_in_api.NIL == api_lexical_variable_p(place)) {
                eval_in_api_error((SubLObject)eval_in_api.$str131$_S_is_not_an_api_variable, place, (SubLObject)eval_in_api.UNPROVIDED);
            }
            final SubLObject current_value = api_lexical_variable_value(place);
            final SubLObject evaluated_item = eval_in_api_internal(item);
            final SubLObject new_value = ConsesLow.append((SubLObject)ConsesLow.list(evaluated_item), current_value);
            ConsesLow.rplacd(conses_high.assoc(place, eval_in_api.$eval_in_api_env$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)eval_in_api.EQ), (SubLObject)eval_in_api.UNPROVIDED), new_value);
            return place;
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list138);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 42313L)
    public static SubLObject api_special_cpush_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject item = (SubLObject)eval_in_api.NIL;
        SubLObject place = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list138);
        item = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list138);
        place = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            return ConsesLow.nconc(verify_form_in_api_internal(item), verify_form_in_api_internal(place));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list138);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 42453L)
    public static SubLObject api_special_cpop(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject place = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list142);
        place = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            if (eval_in_api.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && eval_in_api.NIL == api_lexical_variable_p(place)) {
                Errors.error((SubLObject)eval_in_api.$str131$_S_is_not_an_api_variable, place);
            }
            final SubLObject current_value = api_lexical_variable_value(place);
            final SubLObject new_value = current_value.rest();
            ConsesLow.rplacd(conses_high.assoc(place, eval_in_api.$eval_in_api_env$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)eval_in_api.EQ), (SubLObject)eval_in_api.UNPROVIDED), new_value);
            return new_value;
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list142);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 42789L)
    public static SubLObject api_special_cpop_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject place = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list142);
        place = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            return verify_form_in_api_internal(place);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list142);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 42873L)
    public static SubLObject api_special_eval(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject form_$7 = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list146);
        form_$7 = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            return eval_in_api(eval_in_api(form_$7));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list146);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 43051L)
    public static SubLObject api_special_eval_in_api_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject form_$8 = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list146);
        form_$8 = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            return verify_form_in_api_internal(form_$8);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list146);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 43140L)
    public static SubLObject api_special_fi_eval(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject form_$9 = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list146);
        form_$9 = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            return eval_in_api_internal(eval_in_api_internal(form_$9));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list146);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 43235L)
    public static SubLObject api_special_fi_eval_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject form_$10 = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list146);
        form_$10 = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            return verify_form_in_api_internal(form_$10);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list146);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 43320L)
    public static SubLObject api_special_fi_local_eval(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject form_$11 = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list146);
        form_$11 = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            return eval_in_api_internal(eval_in_api_internal(form_$11));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list146);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 43421L)
    public static SubLObject api_special_fi_local_eval_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject form_$12 = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list146);
        form_$12 = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            return verify_form_in_api_internal(form_$12);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list146);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 43512L)
    public static SubLObject api_special_apply(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject function = (SubLObject)eval_in_api.NIL;
        SubLObject argument = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list156);
        function = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list156);
        argument = current.first();
        final SubLObject v_arguments;
        current = (v_arguments = current.rest());
        return eval_in_api_apply(function, argument, v_arguments);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 43641L)
    public static SubLObject api_special_apply_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject function = (SubLObject)eval_in_api.NIL;
        SubLObject argument = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list156);
        function = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list156);
        argument = current.first();
        final SubLObject v_arguments;
        current = (v_arguments = current.rest());
        return ConsesLow.nconc(verify_form_in_api_internal(function), verify_form_in_api_internal(argument), verify_args_in_api_internal(v_arguments));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 43858L)
    public static SubLObject eval_in_api_apply(final SubLObject function, final SubLObject argument, final SubLObject v_arguments) {
        final SubLObject evaluated_function = eval_in_api_internal(function);
        if (eval_in_api.NIL != eval_in_api_predefined_fnP(evaluated_function)) {
            final SubLObject evaluated_argument = eval_in_api_internal(argument);
            final SubLObject evaluated_arguments = api_eval_args(v_arguments);
            final SubLObject apply_arguments = (SubLObject)ConsesLow.listS(evaluated_function, evaluated_argument, evaluated_arguments);
            return eval_in_api_subl_apply(Symbols.symbol_function((SubLObject)eval_in_api.$sym157$APPLY), apply_arguments);
        }
        if (eval_in_api.NIL != eval_in_api_user_lambda_fnP(evaluated_function)) {
            final SubLObject evaluated_argument = eval_in_api_internal(argument);
            final SubLObject evaluated_arguments = api_eval_args(v_arguments);
            SubLObject quoted_args = (SubLObject)eval_in_api.NIL;
            if (eval_in_api.NIL != evaluated_arguments) {
                quoted_args = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym15$QUOTE, evaluated_argument), quoted_args);
                SubLObject cdolist_list_var = evaluated_arguments;
                SubLObject arg = (SubLObject)eval_in_api.NIL;
                arg = cdolist_list_var.first();
                while (eval_in_api.NIL != cdolist_list_var) {
                    quoted_args = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym15$QUOTE, arg), quoted_args);
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                }
            }
            else {
                SubLObject cdolist_list_var = evaluated_argument;
                SubLObject arg = (SubLObject)eval_in_api.NIL;
                arg = cdolist_list_var.first();
                while (eval_in_api.NIL != cdolist_list_var) {
                    quoted_args = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym15$QUOTE, arg), quoted_args);
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                }
            }
            quoted_args = Sequences.nreverse(quoted_args);
            return eval_in_api_internal(reader.bq_cons(evaluated_function.first(), ConsesLow.append(quoted_args, (SubLObject)eval_in_api.NIL)));
        }
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 44943L)
    public static SubLObject eval_in_api_user_lambda_fnP(final SubLObject form) {
        return (SubLObject)SubLObjectFactory.makeBoolean(form.isCons() && form.first().isSymbol() && eval_in_api.NIL != eval_in_api_user_fnP(form.first()) && conses_high.second(form).isCons() && conses_high.second(form).first() == eval_in_api.$sym72$LAMBDA);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 45358L)
    public static SubLObject eval_in_api_user_fnP(final SubLObject function) {
        SubLObject v_answer = (SubLObject)eval_in_api.NIL;
        SubLObject function_symbol = (SubLObject)eval_in_api.NIL;
        SubLObject value = (SubLObject)eval_in_api.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(eval_in_api.$api_function_table$.getGlobalValue());
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                function_symbol = Hashtables.getEntryKey(cdohash_entry);
                value = Hashtables.getEntryValue(cdohash_entry);
                if (function.eql(function_symbol)) {
                    v_answer = (SubLObject)eval_in_api.T;
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 45687L)
    public static SubLObject eval_in_api_predefined_fnP(final SubLObject function) {
        SubLObject v_answer = (SubLObject)eval_in_api.NIL;
        SubLObject function_symbol = (SubLObject)eval_in_api.NIL;
        SubLObject value = (SubLObject)eval_in_api.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(utilities_macros.$api_predefined_function_table$.getGlobalValue());
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                function_symbol = Hashtables.getEntryKey(cdohash_entry);
                value = Hashtables.getEntryValue(cdohash_entry);
                if (eval_in_api.NIL != Symbols.fboundp(function_symbol) && function.eql(Symbols.symbol_function(function_symbol))) {
                    v_answer = (SubLObject)eval_in_api.T;
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 46088L)
    public static SubLObject eval_in_api_applicable_fnP(final SubLObject function) {
        return (SubLObject)SubLObjectFactory.makeBoolean(eval_in_api.NIL != eval_in_api_predefined_fnP(function) || eval_in_api.NIL != eval_in_api_user_fnP(function) || eval_in_api.NIL != eval_in_api_user_lambda_fnP(function) || eval_in_api.NIL != access_macros.external_function_p(function));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 46394L)
    public static SubLObject api_special_fboundp(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject function = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list160);
        function = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            return (SubLObject)SubLObjectFactory.makeBoolean(eval_in_api.NIL != eval_in_api_user_fnP(function) || eval_in_api.NIL != eval_in_api_predefined_fnP(function));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list160);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 46534L)
    public static SubLObject api_special_fboundp_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject function = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list160);
        function = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            return verify_form_in_api_internal(function);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list160);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 46627L)
    public static SubLObject api_special_funcall(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject function = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list164);
        function = current.first();
        final SubLObject v_arguments;
        current = (v_arguments = current.rest());
        return eval_in_api_apply(function, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym15$QUOTE, v_arguments), (SubLObject)eval_in_api.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 46760L)
    public static SubLObject api_special_funcall_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject function = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list164);
        function = current.first();
        final SubLObject v_arguments;
        current = (v_arguments = current.rest());
        return ConsesLow.nconc(verify_form_in_api_internal(function), verify_args_in_api_internal(v_arguments));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 46924L)
    public static SubLObject api_special_multiple_value_list(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject expression = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list68);
        expression = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            return Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(eval_in_api_internal(expression)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list68);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 47066L)
    public static SubLObject api_special_multiple_value_list_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject expression = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list68);
        expression = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            return verify_form_in_api_internal(expression);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list68);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 47175L)
    public static SubLObject api_special_trace(final SubLObject form) {
        final SubLObject datum = form.rest();
        final SubLObject fnames;
        final SubLObject current = fnames = datum;
        return eval_in_api_trace(fnames);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 47284L)
    public static SubLObject api_special_trace_verify(final SubLObject form) {
        final SubLObject datum = form.rest();
        final SubLObject fnames;
        final SubLObject current = fnames = datum;
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 47372L)
    public static SubLObject eval_in_api_trace(final SubLObject fnames) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (eval_in_api.NIL == fnames) {
            return eval_in_api.$eval_in_api_traced_fns$.getDynamicValue(thread);
        }
        SubLObject cdolist_list_var = fnames;
        SubLObject fname = (SubLObject)eval_in_api.NIL;
        fname = cdolist_list_var.first();
        while (eval_in_api.NIL != cdolist_list_var) {
            final SubLObject item_var = fname;
            if (eval_in_api.NIL == conses_high.member(item_var, eval_in_api.$eval_in_api_traced_fns$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)eval_in_api.EQL), Symbols.symbol_function((SubLObject)eval_in_api.IDENTITY))) {
                eval_in_api.$eval_in_api_traced_fns$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, eval_in_api.$eval_in_api_traced_fns$.getDynamicValue(thread)), thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            fname = cdolist_list_var.first();
        }
        return fnames;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 47559L)
    public static SubLObject api_special_untrace(final SubLObject form) {
        final SubLObject datum = form.rest();
        final SubLObject fnames;
        final SubLObject current = fnames = datum;
        return eval_in_api_untrace(fnames);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 47650L)
    public static SubLObject api_special_untrace_verify(final SubLObject form) {
        final SubLObject datum = form.rest();
        final SubLObject fnames;
        final SubLObject current = fnames = datum;
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 47740L)
    public static SubLObject eval_in_api_untrace(final SubLObject fnames) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (eval_in_api.NIL != fnames) {
            SubLObject cdolist_list_var = fnames;
            SubLObject fname = (SubLObject)eval_in_api.NIL;
            fname = cdolist_list_var.first();
            while (eval_in_api.NIL != cdolist_list_var) {
                eval_in_api.$eval_in_api_traced_fns$.setDynamicValue(Sequences.remove(fname, eval_in_api.$eval_in_api_traced_fns$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)eval_in_api.EQ), (SubLObject)eval_in_api.UNPROVIDED, (SubLObject)eval_in_api.UNPROVIDED, (SubLObject)eval_in_api.UNPROVIDED, (SubLObject)eval_in_api.UNPROVIDED), thread);
                cdolist_list_var = cdolist_list_var.rest();
                fname = cdolist_list_var.first();
            }
        }
        else {
            eval_in_api.$eval_in_api_traced_fns$.setDynamicValue((SubLObject)eval_in_api.NIL, thread);
        }
        return fnames;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 47990L)
    public static SubLObject eval_in_api_traced_fnP(final SubLObject fname) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(fname, eval_in_api.$eval_in_api_traced_fns$.getDynamicValue(thread), (SubLObject)eval_in_api.UNPROVIDED, (SubLObject)eval_in_api.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 48088L)
    public static SubLObject eval_in_api_enter_trace_display(final SubLObject fname, final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (eval_in_api.NIL == eval_in_api.$eval_in_api_trace_log$.getDynamicValue(thread)) {
            eval_in_api.$eval_in_api_trace_log$.setDynamicValue(PrintLow.format((SubLObject)eval_in_api.NIL, (SubLObject)eval_in_api.$str176$__), thread);
        }
        final SubLObject indent = Strings.make_string(Numbers.multiply((SubLObject)eval_in_api.TWO_INTEGER, number_utilities.f_1X(eval_in_api.$eval_in_api_function_level$.getDynamicValue(thread))), (SubLObject)eval_in_api.UNPROVIDED);
        final SubLObject form = (SubLObject)ConsesLow.cons(fname, args);
        eval_in_api.$eval_in_api_trace_log$.setDynamicValue(Sequences.cconcatenate(eval_in_api.$eval_in_api_trace_log$.getDynamicValue(thread), PrintLow.format((SubLObject)eval_in_api.NIL, (SubLObject)eval_in_api.$str177$_A_D___S__, new SubLObject[] { indent, eval_in_api.$eval_in_api_function_level$.getDynamicValue(thread), form })), thread);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 48591L)
    public static SubLObject eval_in_api_exit_trace_display(final SubLObject results) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject indent = Strings.make_string(Numbers.multiply((SubLObject)eval_in_api.TWO_INTEGER, number_utilities.f_1X(eval_in_api.$eval_in_api_function_level$.getDynamicValue(thread))), (SubLObject)eval_in_api.UNPROVIDED);
        SubLObject result_string = (SubLObject)eval_in_api.$str178$;
        SubLObject cdolist_list_var = results;
        SubLObject result = (SubLObject)eval_in_api.NIL;
        result = cdolist_list_var.first();
        while (eval_in_api.NIL != cdolist_list_var) {
            result_string = Sequences.cconcatenate(result_string, PrintLow.format((SubLObject)eval_in_api.NIL, (SubLObject)eval_in_api.$str179$_S_, result));
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        }
        eval_in_api.$eval_in_api_trace_log$.setDynamicValue(Sequences.cconcatenate(eval_in_api.$eval_in_api_trace_log$.getDynamicValue(thread), PrintLow.format((SubLObject)eval_in_api.NIL, (SubLObject)eval_in_api.$str180$_A_D__returned__A__, new SubLObject[] { indent, eval_in_api.$eval_in_api_function_level$.getDynamicValue(thread), result_string })), thread);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 49144L)
    public static SubLObject api_special_get_trace_log(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject datum = form.rest();
        if (eval_in_api.NIL != datum) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.NIL);
        }
        SubLObject trace_log = (SubLObject)eval_in_api.NIL;
        trace_log = ((eval_in_api.NIL != eval_in_api.$eval_in_api_trace_log$.getDynamicValue(thread)) ? eval_in_api.$eval_in_api_trace_log$.getDynamicValue(thread) : PrintLow.format((SubLObject)eval_in_api.NIL, (SubLObject)eval_in_api.$str176$__));
        eval_in_api_clear_trace_log();
        return trace_log;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 49369L)
    public static SubLObject api_special_get_trace_log_verify(final SubLObject form) {
        final SubLObject datum = form.rest();
        if (eval_in_api.NIL != datum) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.NIL);
        }
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 49425L)
    public static SubLObject api_special_clear_trace_log(final SubLObject form) {
        final SubLObject datum = form.rest();
        if (eval_in_api.NIL != datum) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.NIL);
        }
        return eval_in_api_clear_trace_log();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 49503L)
    public static SubLObject api_special_clear_trace_log_verify(final SubLObject form) {
        final SubLObject datum = form.rest();
        if (eval_in_api.NIL != datum) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.NIL);
        }
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 49561L)
    public static SubLObject eval_in_api_clear_trace_log() {
        eval_in_api.$eval_in_api_trace_log$.setDynamicValue((SubLObject)eval_in_api.NIL);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 49660L)
    public static SubLObject add1(final SubLObject x) {
        assert eval_in_api.NIL != Types.numberp(x) : x;
        return number_utilities.f_1X(x);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 49839L)
    public static SubLObject sub1(final SubLObject x) {
        assert eval_in_api.NIL != Types.numberp(x) : x;
        return number_utilities.f_1_(x);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 50004L)
    public static SubLObject api_special_progn(final SubLObject form) {
        final SubLObject datum = form.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return eval_in_api_progn_body(body);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 50097L)
    public static SubLObject api_special_progn_verify(final SubLObject form) {
        final SubLObject datum = form.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return verify_args_in_api_internal(body);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 50186L)
    public static SubLObject eval_in_api_progn_body(final SubLObject body) {
        SubLObject result = (SubLObject)eval_in_api.NIL;
        SubLObject cdolist_list_var = body;
        SubLObject form = (SubLObject)eval_in_api.NIL;
        form = cdolist_list_var.first();
        while (eval_in_api.NIL != cdolist_list_var) {
            result = eval_in_api_internal(form);
            cdolist_list_var = cdolist_list_var.rest();
            form = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 50350L)
    public static SubLObject api_special_clet(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject v_bindings = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list190);
        v_bindings = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return eval_in_api_clet(v_bindings, body);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 50459L)
    public static SubLObject api_special_clet_verify(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject v_bindings = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list190);
        v_bindings = current.first();
        final SubLObject body;
        current = (body = current.rest());
        SubLObject result = (SubLObject)eval_in_api.NIL;
        final SubLObject _prev_bind_0 = eval_in_api.$verify_in_api_bound_symbols$.currentBinding(thread);
        try {
            eval_in_api.$verify_in_api_bound_symbols$.bind(eval_in_api.$verify_in_api_bound_symbols$.getDynamicValue(thread), thread);
            SubLObject cdolist_list_var = v_bindings;
            SubLObject binding = (SubLObject)eval_in_api.NIL;
            binding = cdolist_list_var.first();
            while (eval_in_api.NIL != cdolist_list_var) {
                if (binding.isSymbol()) {
                    eval_in_api.$verify_in_api_bound_symbols$.setDynamicValue((SubLObject)ConsesLow.cons(binding, eval_in_api.$verify_in_api_bound_symbols$.getDynamicValue(thread)), thread);
                }
                else if (eval_in_api.NIL != list_utilities.singletonP(binding)) {
                    eval_in_api.$verify_in_api_bound_symbols$.setDynamicValue((SubLObject)ConsesLow.cons(binding.first(), eval_in_api.$verify_in_api_bound_symbols$.getDynamicValue(thread)), thread);
                }
                else if (eval_in_api.NIL != list_utilities.doubletonP(binding)) {
                    result = ConsesLow.nconc(result, verify_form_in_api_internal(conses_high.second(binding)));
                    eval_in_api.$verify_in_api_bound_symbols$.setDynamicValue((SubLObject)ConsesLow.cons(binding.first(), eval_in_api.$verify_in_api_bound_symbols$.getDynamicValue(thread)), thread);
                }
                else {
                    Errors.error((SubLObject)eval_in_api.$str192$clet_error);
                }
                cdolist_list_var = cdolist_list_var.rest();
                binding = cdolist_list_var.first();
            }
            result = ConsesLow.nconc(result, verify_args_in_api_internal(body));
        }
        finally {
            eval_in_api.$verify_in_api_bound_symbols$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 51085L)
    public static SubLObject eval_in_api_clet(final SubLObject v_bindings, final SubLObject body) {
        return eval_in_api_variable_bindings(v_bindings, body);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 51190L)
    public static SubLObject trace_me(SubLObject a1, SubLObject a2, SubLObject a3, SubLObject a4) {
        if (a1 == eval_in_api.UNPROVIDED) {
            a1 = (SubLObject)eval_in_api.NIL;
        }
        if (a2 == eval_in_api.UNPROVIDED) {
            a2 = (SubLObject)eval_in_api.NIL;
        }
        if (a3 == eval_in_api.UNPROVIDED) {
            a3 = (SubLObject)eval_in_api.NIL;
        }
        if (a4 == eval_in_api.UNPROVIDED) {
            a4 = (SubLObject)eval_in_api.NIL;
        }
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 51268L)
    public static SubLObject eval_in_api_variable_bindings(final SubLObject v_bindings, final SubLObject body) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (eval_in_api.NIL == v_bindings) {
            SubLObject result = (SubLObject)eval_in_api.NIL;
            result = eval_in_api_progn_body(body);
            return result;
        }
        SubLObject binding = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(v_bindings, v_bindings, (SubLObject)eval_in_api.$list194);
        binding = v_bindings.first();
        final SubLObject rest_bindings;
        final SubLObject current = rest_bindings = v_bindings.rest();
        SubLObject variable = (SubLObject)eval_in_api.NIL;
        SubLObject init_form = (SubLObject)eval_in_api.NIL;
        if (binding.isCons()) {
            variable = binding.first();
            init_form = conses_high.second(binding);
        }
        else {
            variable = binding;
            init_form = (SubLObject)eval_in_api.NIL;
        }
        final SubLObject variable_value = eval_in_api_internal(init_form);
        SubLObject result2 = (SubLObject)eval_in_api.NIL;
        eval_in_api.$eval_in_api_env$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(variable, variable_value), eval_in_api.$eval_in_api_env$.getDynamicValue(thread)), thread);
        result2 = eval_in_api_variable_bindings(rest_bindings, body);
        eval_in_api.$eval_in_api_env$.setDynamicValue(eval_in_api.$eval_in_api_env$.getDynamicValue(thread).rest(), thread);
        return result2;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 51989L)
    public static SubLObject api_special_cmultiple_value_bind(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject vars = (SubLObject)eval_in_api.NIL;
        SubLObject values_form = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list195);
        vars = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list195);
        values_form = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return eval_in_api_cmultiple_value_bind(vars, values_form, body);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 52175L)
    public static SubLObject api_special_cmultiple_value_bind_verify(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject vars = (SubLObject)eval_in_api.NIL;
        SubLObject values_form = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list195);
        vars = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list195);
        values_form = current.first();
        final SubLObject body;
        current = (body = current.rest());
        SubLObject result = (SubLObject)eval_in_api.NIL;
        final SubLObject _prev_bind_0 = eval_in_api.$verify_in_api_bound_symbols$.currentBinding(thread);
        try {
            eval_in_api.$verify_in_api_bound_symbols$.bind(eval_in_api.$verify_in_api_bound_symbols$.getDynamicValue(thread), thread);
            SubLObject cdolist_list_var = vars;
            SubLObject var = (SubLObject)eval_in_api.NIL;
            var = cdolist_list_var.first();
            while (eval_in_api.NIL != cdolist_list_var) {
                eval_in_api.$verify_in_api_bound_symbols$.setDynamicValue((SubLObject)ConsesLow.cons(var, eval_in_api.$verify_in_api_bound_symbols$.getDynamicValue(thread)), thread);
                cdolist_list_var = cdolist_list_var.rest();
                var = cdolist_list_var.first();
            }
            result = ConsesLow.nconc(verify_form_in_api_internal(values_form), verify_args_in_api_internal(body));
        }
        finally {
            eval_in_api.$verify_in_api_bound_symbols$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 52545L)
    public static SubLObject eval_in_api_cmultiple_value_bind(final SubLObject vars, final SubLObject values_form, final SubLObject body) {
        SubLObject values = (SubLObject)eval_in_api.NIL;
        SubLObject value = (SubLObject)eval_in_api.NIL;
        SubLObject binding = (SubLObject)eval_in_api.NIL;
        SubLObject v_bindings = (SubLObject)eval_in_api.NIL;
        values = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(eval_in_api_internal(values_form)));
        SubLObject cdolist_list_var = vars;
        SubLObject var = (SubLObject)eval_in_api.NIL;
        var = cdolist_list_var.first();
        while (eval_in_api.NIL != cdolist_list_var) {
            if (eval_in_api.NIL != values) {
                value = values.first();
                values = values.rest();
            }
            else {
                value = (SubLObject)eval_in_api.NIL;
            }
            binding = (SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym15$QUOTE, value));
            v_bindings = (SubLObject)ConsesLow.cons(binding, v_bindings);
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        }
        v_bindings = Sequences.nreverse(v_bindings);
        return eval_in_api_variable_bindings(v_bindings, body);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 53224L)
    public static SubLObject api_special_cand(final SubLObject form) {
        final SubLObject datum = form.rest();
        final SubLObject args;
        final SubLObject current = args = datum;
        SubLObject result = (SubLObject)eval_in_api.T;
        SubLObject cdolist_list_var = args;
        SubLObject arg = (SubLObject)eval_in_api.NIL;
        arg = cdolist_list_var.first();
        while (eval_in_api.NIL != cdolist_list_var) {
            result = eval_in_api_internal(arg);
            if (eval_in_api.NIL == result) {
                return (SubLObject)eval_in_api.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        return (SubLObject)eval_in_api.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 53501L)
    public static SubLObject api_special_cand_verify(final SubLObject form) {
        final SubLObject datum = form.rest();
        final SubLObject args;
        final SubLObject current = args = datum;
        return verify_args_in_api_internal(args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 53589L)
    public static SubLObject api_special_cor(final SubLObject form) {
        final SubLObject datum = form.rest();
        final SubLObject args;
        final SubLObject current = args = datum;
        SubLObject result = (SubLObject)eval_in_api.NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = (SubLObject)eval_in_api.NIL;
        arg = cdolist_list_var.first();
        while (eval_in_api.NIL != cdolist_list_var) {
            result = eval_in_api_internal(arg);
            if (eval_in_api.NIL != result) {
                return (SubLObject)eval_in_api.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 53767L)
    public static SubLObject api_special_cor_verify(final SubLObject form) {
        final SubLObject datum = form.rest();
        final SubLObject args;
        final SubLObject current = args = datum;
        return verify_args_in_api_internal(args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 53854L)
    public static SubLObject api_special_cnot(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject expression = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list68);
        expression = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            return (SubLObject)SubLObjectFactory.makeBoolean(eval_in_api.NIL == eval_in_api_internal(expression));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list68);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 53942L)
    public static SubLObject api_special_cnot_verify(final SubLObject form) {
        final SubLObject datum = form.rest();
        final SubLObject args;
        final SubLObject current = args = datum;
        return verify_form_in_api_internal(args.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 54038L)
    public static SubLObject api_special_pcond(final SubLObject form) {
        final SubLObject datum = form.rest();
        final SubLObject v_clauses;
        final SubLObject current = v_clauses = datum;
        final SubLObject result = (SubLObject)eval_in_api.NIL;
        SubLObject cdolist_list_var = v_clauses;
        SubLObject clause = (SubLObject)eval_in_api.NIL;
        clause = cdolist_list_var.first();
        while (eval_in_api.NIL != cdolist_list_var) {
            SubLObject current_$14;
            final SubLObject datum_$13 = current_$14 = clause;
            SubLObject condition = (SubLObject)eval_in_api.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$14, datum_$13, (SubLObject)eval_in_api.$list208);
            condition = current_$14.first();
            final SubLObject body;
            current_$14 = (body = current_$14.rest());
            if (eval_in_api.NIL != eval_in_api_internal(condition)) {
                return eval_in_api_progn_body(body);
            }
            cdolist_list_var = cdolist_list_var.rest();
            clause = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 54319L)
    public static SubLObject api_special_pcond_verify(final SubLObject form) {
        final SubLObject datum = form.rest();
        final SubLObject v_clauses;
        final SubLObject current = v_clauses = datum;
        SubLObject result = (SubLObject)eval_in_api.NIL;
        SubLObject cdolist_list_var = v_clauses;
        SubLObject clause = (SubLObject)eval_in_api.NIL;
        clause = cdolist_list_var.first();
        while (eval_in_api.NIL != cdolist_list_var) {
            SubLObject current_$16;
            final SubLObject datum_$15 = current_$16 = clause;
            SubLObject condition = (SubLObject)eval_in_api.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$16, datum_$15, (SubLObject)eval_in_api.$list208);
            condition = current_$16.first();
            final SubLObject body;
            current_$16 = (body = current_$16.rest());
            result = ConsesLow.nconc(result, verify_form_in_api_internal(condition), verify_args_in_api_internal(body));
            cdolist_list_var = cdolist_list_var.rest();
            clause = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 54615L)
    public static SubLObject api_special_pif(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject condition = (SubLObject)eval_in_api.NIL;
        SubLObject action = (SubLObject)eval_in_api.NIL;
        SubLObject else_action = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list212);
        condition = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list212);
        action = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list212);
        else_action = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            return eval_in_api_if(condition, action, else_action);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list212);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 54725L)
    public static SubLObject api_special_pif_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject condition = (SubLObject)eval_in_api.NIL;
        SubLObject action = (SubLObject)eval_in_api.NIL;
        SubLObject else_action = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list212);
        condition = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list212);
        action = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list212);
        else_action = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            return ConsesLow.nconc(verify_form_in_api_internal(condition), verify_form_in_api_internal(action), verify_form_in_api_internal(else_action));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list212);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 54936L)
    public static SubLObject eval_in_api_if(final SubLObject condition, final SubLObject action, final SubLObject else_action) {
        if (eval_in_api.NIL != eval_in_api_internal(condition)) {
            return eval_in_api_internal(action);
        }
        return eval_in_api_internal(else_action);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 55134L)
    public static SubLObject api_special_fif(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject condition = (SubLObject)eval_in_api.NIL;
        SubLObject action = (SubLObject)eval_in_api.NIL;
        SubLObject else_action = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list212);
        condition = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list212);
        action = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list212);
        else_action = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            return eval_in_api_if(condition, action, else_action);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list212);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 55244L)
    public static SubLObject api_special_fif_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject condition = (SubLObject)eval_in_api.NIL;
        SubLObject action = (SubLObject)eval_in_api.NIL;
        SubLObject else_action = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list212);
        condition = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list212);
        action = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list212);
        else_action = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            return ConsesLow.nconc(verify_form_in_api_internal(condition), verify_form_in_api_internal(action), verify_form_in_api_internal(else_action));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list212);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 55455L)
    public static SubLObject api_special_pwhen(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject condition = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list208);
        condition = current.first();
        final SubLObject body;
        current = (body = current.rest());
        if (eval_in_api.NIL != eval_in_api_internal(condition)) {
            return eval_in_api_progn_body(body);
        }
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 55621L)
    public static SubLObject api_special_pwhen_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject condition = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list208);
        condition = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return ConsesLow.nconc(verify_form_in_api_internal(condition), verify_args_in_api_internal(body));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 55775L)
    public static SubLObject api_special_when(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject condition = (SubLObject)eval_in_api.NIL;
        SubLObject action = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list222);
        condition = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list222);
        action = current.first();
        current = current.rest();
        if (eval_in_api.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list222);
            return (SubLObject)eval_in_api.NIL;
        }
        if (eval_in_api.NIL != eval_in_api_internal(condition)) {
            return eval_in_api_internal(action);
        }
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 55938L)
    public static SubLObject api_special_when_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject condition = (SubLObject)eval_in_api.NIL;
        SubLObject action = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list222);
        condition = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list222);
        action = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            return ConsesLow.nconc(verify_form_in_api_internal(condition), verify_form_in_api_internal(action));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list222);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 56089L)
    public static SubLObject api_special_fwhen(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject condition = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list208);
        condition = current.first();
        final SubLObject body;
        current = (body = current.rest());
        if (eval_in_api.NIL != eval_in_api_internal(condition)) {
            return eval_in_api_progn_body(body);
        }
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 56255L)
    public static SubLObject api_special_fwhen_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject condition = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list208);
        condition = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return ConsesLow.nconc(verify_form_in_api_internal(condition), verify_args_in_api_internal(body));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 56409L)
    public static SubLObject api_special_punless(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject condition = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list208);
        condition = current.first();
        final SubLObject body;
        current = (body = current.rest());
        if (eval_in_api.NIL != eval_in_api_internal(condition)) {
            return (SubLObject)eval_in_api.NIL;
        }
        return eval_in_api_progn_body(body);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 56579L)
    public static SubLObject api_special_punless_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject condition = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list208);
        condition = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return ConsesLow.nconc(verify_form_in_api_internal(condition), verify_args_in_api_internal(body));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 56735L)
    public static SubLObject api_special_funless(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject condition = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list208);
        condition = current.first();
        final SubLObject body;
        current = (body = current.rest());
        if (eval_in_api.NIL != eval_in_api_internal(condition)) {
            return (SubLObject)eval_in_api.NIL;
        }
        return eval_in_api_progn_body(body);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 56903L)
    public static SubLObject api_special_funless_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject condition = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list208);
        condition = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return ConsesLow.nconc(verify_form_in_api_internal(condition), verify_args_in_api_internal(body));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 57059L)
    public static SubLObject api_special_while(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject condition = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list208);
        condition = current.first();
        final SubLObject body;
        current = (body = current.rest());
        SubLObject result = (SubLObject)eval_in_api.NIL;
        while (eval_in_api.NIL != eval_in_api_internal(condition)) {
            result = eval_in_api_progn_body(body);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 57260L)
    public static SubLObject api_special_while_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject condition = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list208);
        condition = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return ConsesLow.nconc(verify_form_in_api_internal(condition), verify_args_in_api_internal(body));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 57414L)
    public static SubLObject api_special_until(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject condition = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list208);
        condition = current.first();
        final SubLObject body;
        current = (body = current.rest());
        SubLObject result = (SubLObject)eval_in_api.NIL;
        while (eval_in_api.NIL == eval_in_api_internal(condition)) {
            result = eval_in_api_progn_body(body);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 57601L)
    public static SubLObject api_special_until_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject condition = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list208);
        condition = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return ConsesLow.nconc(verify_form_in_api_internal(condition), verify_args_in_api_internal(body));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 57755L)
    public static SubLObject api_special_cdo(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject vars = (SubLObject)eval_in_api.NIL;
        SubLObject endtest = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list241);
        vars = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list241);
        endtest = current.first();
        final SubLObject body;
        current = (body = current.rest());
        SubLObject endtestP = (SubLObject)eval_in_api.NIL;
        SubLObject result = (SubLObject)eval_in_api.NIL;
        SubLObject cdolist_list_var = vars;
        SubLObject var = (SubLObject)eval_in_api.NIL;
        var = cdolist_list_var.first();
        while (eval_in_api.NIL != cdolist_list_var) {
            if (!var.isList() || !Sequences.length(var).numE((SubLObject)eval_in_api.THREE_INTEGER)) {
                eval_in_api_error((SubLObject)eval_in_api.$str242$_S_is_not_a_valid_cdo_variable_sp, var, (SubLObject)eval_in_api.UNPROVIDED);
            }
            eval_in_api.$eval_in_api_env$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var.first(), eval_in_api_internal(conses_high.second(var))), eval_in_api.$eval_in_api_env$.getDynamicValue(thread)), thread);
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        }
        if (eval_in_api.NIL == eval_in_api_internal(endtest.first())) {
            eval_in_api_progn_body(body);
            while (eval_in_api.NIL == endtestP) {
                cdolist_list_var = vars;
                var = (SubLObject)eval_in_api.NIL;
                var = cdolist_list_var.first();
                while (eval_in_api.NIL != cdolist_list_var) {
                    eval_in_api_csetq(var.first(), conses_high.third(var), (SubLObject)eval_in_api.UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    var = cdolist_list_var.first();
                }
                endtestP = eval_in_api_internal(endtest.first());
                if (eval_in_api.NIL == endtestP) {
                    eval_in_api_progn_body(body);
                }
            }
        }
        result = eval_in_api_progn_body(endtest.rest());
        cdolist_list_var = vars;
        var = (SubLObject)eval_in_api.NIL;
        var = cdolist_list_var.first();
        while (eval_in_api.NIL != cdolist_list_var) {
            eval_in_api.$eval_in_api_env$.setDynamicValue(eval_in_api.$eval_in_api_env$.getDynamicValue(thread).rest(), thread);
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 58602L)
    public static SubLObject api_special_cdo_verify(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject vars = (SubLObject)eval_in_api.NIL;
        SubLObject endtest = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list241);
        vars = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list241);
        endtest = current.first();
        final SubLObject body;
        current = (body = current.rest());
        SubLObject result = (SubLObject)eval_in_api.NIL;
        final SubLObject _prev_bind_0 = eval_in_api.$verify_in_api_bound_symbols$.currentBinding(thread);
        try {
            eval_in_api.$verify_in_api_bound_symbols$.bind(eval_in_api.$verify_in_api_bound_symbols$.getDynamicValue(thread), thread);
            SubLObject cdolist_list_var = vars;
            SubLObject var = (SubLObject)eval_in_api.NIL;
            var = cdolist_list_var.first();
            while (eval_in_api.NIL != cdolist_list_var) {
                if (var.isList() && Sequences.length(var).numE((SubLObject)eval_in_api.THREE_INTEGER)) {
                    eval_in_api.$verify_in_api_bound_symbols$.setDynamicValue((SubLObject)ConsesLow.cons(var.first(), eval_in_api.$verify_in_api_bound_symbols$.getDynamicValue(thread)), thread);
                    result = ConsesLow.nconc(result, verify_form_in_api_internal(conses_high.second(var)), verify_form_in_api_internal(conses_high.third(var)));
                }
                cdolist_list_var = cdolist_list_var.rest();
                var = cdolist_list_var.first();
            }
            result = ConsesLow.nconc(result, verify_args_in_api_internal(endtest), verify_args_in_api_internal(body));
        }
        finally {
            eval_in_api.$verify_in_api_bound_symbols$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 59156L)
    public static SubLObject api_special_cdolist(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list246);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject variable = (SubLObject)eval_in_api.NIL;
        SubLObject listform = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list246);
        variable = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list246);
        listform = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return eval_in_api_codolist(variable, listform, body);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list246);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 59490L)
    public static SubLObject api_special_cdolist_verify(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list246);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject variable = (SubLObject)eval_in_api.NIL;
        SubLObject listform = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list246);
        variable = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list246);
        listform = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            SubLObject result = (SubLObject)eval_in_api.NIL;
            final SubLObject _prev_bind_0 = eval_in_api.$verify_in_api_bound_symbols$.currentBinding(thread);
            try {
                eval_in_api.$verify_in_api_bound_symbols$.bind(eval_in_api.$verify_in_api_bound_symbols$.getDynamicValue(thread), thread);
                eval_in_api.$verify_in_api_bound_symbols$.setDynamicValue((SubLObject)ConsesLow.cons(variable, eval_in_api.$verify_in_api_bound_symbols$.getDynamicValue(thread)), thread);
                result = ConsesLow.nconc(verify_form_in_api_internal(listform), verify_args_in_api_internal(body));
            }
            finally {
                eval_in_api.$verify_in_api_bound_symbols$.rebind(_prev_bind_0, thread);
            }
            return result;
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list246);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 59830L)
    public static SubLObject eval_in_api_codolist(final SubLObject variable, final SubLObject listform, final SubLObject body) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = eval_in_api_internal(listform);
        SubLObject variable_value = (SubLObject)eval_in_api.NIL;
        variable_value = cdolist_list_var.first();
        while (eval_in_api.NIL != cdolist_list_var) {
            eval_in_api.$eval_in_api_env$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(variable, variable_value), eval_in_api.$eval_in_api_env$.getDynamicValue(thread)), thread);
            eval_in_api_progn_body(body);
            eval_in_api.$eval_in_api_env$.setDynamicValue(eval_in_api.$eval_in_api_env$.getDynamicValue(thread).rest(), thread);
            cdolist_list_var = cdolist_list_var.rest();
            variable_value = cdolist_list_var.first();
        }
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 60093L)
    public static SubLObject api_special_cdotimes(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list250);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject variable = (SubLObject)eval_in_api.NIL;
        SubLObject integer = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list250);
        variable = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list250);
        integer = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return eval_in_api_cdotimes(variable, integer, body);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list250);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 60310L)
    public static SubLObject api_special_cdotimes_verify(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list250);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject variable = (SubLObject)eval_in_api.NIL;
        SubLObject integer = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list250);
        variable = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list250);
        integer = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            SubLObject result = (SubLObject)eval_in_api.NIL;
            final SubLObject _prev_bind_0 = eval_in_api.$verify_in_api_bound_symbols$.currentBinding(thread);
            try {
                eval_in_api.$verify_in_api_bound_symbols$.bind(eval_in_api.$verify_in_api_bound_symbols$.getDynamicValue(thread), thread);
                eval_in_api.$verify_in_api_bound_symbols$.setDynamicValue((SubLObject)ConsesLow.cons(variable, eval_in_api.$verify_in_api_bound_symbols$.getDynamicValue(thread)), thread);
                result = verify_form_in_api_internal(integer);
                result = verify_args_in_api_internal(body);
            }
            finally {
                eval_in_api.$verify_in_api_bound_symbols$.rebind(_prev_bind_0, thread);
            }
            return result;
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list250);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 60656L)
    public static SubLObject eval_in_api_cdotimes(final SubLObject variable, final SubLObject integer, final SubLObject body) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = eval_in_api_internal(integer), i = (SubLObject)eval_in_api.NIL, i = (SubLObject)eval_in_api.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)eval_in_api.ONE_INTEGER)) {
            eval_in_api.$eval_in_api_env$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(variable, i), eval_in_api.$eval_in_api_env$.getDynamicValue(thread)), thread);
            eval_in_api_progn_body(body);
            eval_in_api.$eval_in_api_env$.setDynamicValue(eval_in_api.$eval_in_api_env$.getDynamicValue(thread).rest(), thread);
        }
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 60890L)
    public static SubLObject api_special_cdohash(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list254);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = (SubLObject)eval_in_api.NIL;
        SubLObject val = (SubLObject)eval_in_api.NIL;
        SubLObject table = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list254);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list254);
        val = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list254);
        table = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return eval_in_api_cdohash(key, val, table, body);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list254);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 61077L)
    public static SubLObject api_special_cdohash_verify(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list254);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = (SubLObject)eval_in_api.NIL;
        SubLObject val = (SubLObject)eval_in_api.NIL;
        SubLObject table = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list254);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list254);
        val = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list254);
        table = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            SubLObject result = (SubLObject)eval_in_api.NIL;
            final SubLObject _prev_bind_0 = eval_in_api.$verify_in_api_bound_symbols$.currentBinding(thread);
            try {
                eval_in_api.$verify_in_api_bound_symbols$.bind(eval_in_api.$verify_in_api_bound_symbols$.getDynamicValue(thread), thread);
                eval_in_api.$verify_in_api_bound_symbols$.setDynamicValue((SubLObject)ConsesLow.cons(key, eval_in_api.$verify_in_api_bound_symbols$.getDynamicValue(thread)), thread);
                eval_in_api.$verify_in_api_bound_symbols$.setDynamicValue((SubLObject)ConsesLow.cons(val, eval_in_api.$verify_in_api_bound_symbols$.getDynamicValue(thread)), thread);
                result = ConsesLow.nconc(verify_form_in_api_internal(table), verify_args_in_api_internal(body));
            }
            finally {
                eval_in_api.$verify_in_api_bound_symbols$.rebind(_prev_bind_0, thread);
            }
            return result;
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list254);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 61453L)
    public static SubLObject eval_in_api_cdohash(final SubLObject key, final SubLObject val, final SubLObject table, final SubLObject body) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cdohash_table = eval_in_api_internal(table);
        SubLObject k = (SubLObject)eval_in_api.NIL;
        SubLObject v = (SubLObject)eval_in_api.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                k = Hashtables.getEntryKey(cdohash_entry);
                v = Hashtables.getEntryValue(cdohash_entry);
                eval_in_api.$eval_in_api_env$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(key, k), eval_in_api.$eval_in_api_env$.getDynamicValue(thread)), thread);
                eval_in_api.$eval_in_api_env$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(val, v), eval_in_api.$eval_in_api_env$.getDynamicValue(thread)), thread);
                eval_in_api_progn_body(body);
                eval_in_api.$eval_in_api_env$.setDynamicValue(eval_in_api.$eval_in_api_env$.getDynamicValue(thread).rest(), thread);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 61720L)
    public static SubLObject api_special_mapcar(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject function = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list258);
        function = current.first();
        final SubLObject lists;
        current = (lists = current.rest());
        return eval_in_api_mapcar(function, lists);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 61827L)
    public static SubLObject api_special_mapcar_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject function = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list258);
        function = current.first();
        final SubLObject lists;
        current = (lists = current.rest());
        return ConsesLow.nconc(verify_form_in_api_internal(function), verify_args_in_api_internal(lists));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 61982L)
    public static SubLObject eval_in_api_mapcar(final SubLObject function, final SubLObject lists) {
        if (eval_in_api.NIL == eval_in_api_applicable_fnP(eval_in_api_internal(function))) {
            eval_in_api_error((SubLObject)eval_in_api.$str262$_S_does_not_evaluate_to_an_api_fu, function, (SubLObject)eval_in_api.UNPROVIDED);
        }
        final SubLObject evaluated_function = eval_in_api_internal(function);
        final SubLObject evaluated_lists = api_eval_args(lists);
        if (eval_in_api.NIL != conses_high.member((SubLObject)eval_in_api.NIL, evaluated_lists, (SubLObject)eval_in_api.UNPROVIDED, (SubLObject)eval_in_api.UNPROVIDED)) {
            return (SubLObject)eval_in_api.NIL;
        }
        if (eval_in_api.NIL == evaluated_lists.rest()) {
            final SubLObject lst = evaluated_lists.first();
            return (SubLObject)ConsesLow.cons(Functions.funcall(evaluated_function, lst.first()), eval_in_api_mapcar(function, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym15$QUOTE, lst.rest()))));
        }
        return (SubLObject)ConsesLow.cons(Functions.apply(evaluated_function, eval_in_api_mapcar(Symbols.symbol_function((SubLObject)eval_in_api.$sym263$FIRST), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym15$QUOTE, evaluated_lists)))), Functions.apply(Symbols.symbol_function((SubLObject)eval_in_api.$sym264$EVAL_IN_API_MAPCAR), function, (SubLObject)ConsesLow.list(eval_in_api_quoted_args(eval_in_api_mapcar(Symbols.symbol_function((SubLObject)eval_in_api.$sym265$REST), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym15$QUOTE, evaluated_lists)))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 63001L)
    public static SubLObject eval_in_api_quoted_args(final SubLObject args) {
        SubLObject quoted_args = (SubLObject)eval_in_api.NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = (SubLObject)eval_in_api.NIL;
        arg = cdolist_list_var.first();
        while (eval_in_api.NIL != cdolist_list_var) {
            quoted_args = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym15$QUOTE, arg), quoted_args);
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        return Sequences.nreverse(quoted_args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 63175L)
    public static SubLObject api_special_mapdictionary(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject dict = (SubLObject)eval_in_api.NIL;
        SubLObject func = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list266);
        dict = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list266);
        func = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            return eval_in_api_mapdictionary(dict, func);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list266);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 63441L)
    public static SubLObject api_special_mapdictionary_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject dict = (SubLObject)eval_in_api.NIL;
        SubLObject func = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list266);
        dict = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list266);
        func = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            return ConsesLow.nconc(verify_form_in_api_internal(dict), verify_form_in_api_internal(func));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list266);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 63587L)
    public static SubLObject eval_in_api_mapdictionary(final SubLObject dict, final SubLObject func) {
        final SubLObject evaluated_dict = eval_in_api_internal(dict);
        final SubLObject evaluated_func = eval_in_api_internal(func);
        if (eval_in_api.NIL == eval_in_api_applicable_fnP(evaluated_func)) {
            eval_in_api_error((SubLObject)eval_in_api.$str262$_S_does_not_evaluate_to_an_api_fu, func, (SubLObject)eval_in_api.UNPROVIDED);
        }
        final SubLObject style = dictionary.dictionary_style(evaluated_dict);
        if (style == eval_in_api.$kw270$ALIST) {
            eval_in_api_mapdictionary_alist_style(evaluated_dict, func);
        }
        else if (style == eval_in_api.$kw271$HASHTABLE) {
            eval_in_api_mapdictionary_hashtable_style(evaluated_dict, func);
        }
        else {
            Errors.error((SubLObject)eval_in_api.$str272$Corrupted_dictionary__unsupported, style);
        }
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 64362L)
    public static SubLObject eval_in_api_mapdictionary_alist_style(final SubLObject dict, final SubLObject func) {
        SubLObject cdolist_list_var = dictionary.dictionary_contents(dict);
        SubLObject pair = (SubLObject)eval_in_api.NIL;
        pair = cdolist_list_var.first();
        while (eval_in_api.NIL != cdolist_list_var) {
            eval_in_api_internal((SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym165$FUNCALL, func, pair.first(), pair.rest()));
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        }
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 64674L)
    public static SubLObject eval_in_api_mapdictionary_hashtable_style(final SubLObject dict, final SubLObject func) {
        final SubLObject cdohash_table = dictionary.dictionary_contents(dict);
        SubLObject key = (SubLObject)eval_in_api.NIL;
        SubLObject value = (SubLObject)eval_in_api.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                key = Hashtables.getEntryKey(cdohash_entry);
                value = Hashtables.getEntryValue(cdohash_entry);
                eval_in_api_internal((SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym165$FUNCALL, func, key, value));
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 64975L)
    public static SubLObject api_special_mapdictionary_parameterized(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject dict = (SubLObject)eval_in_api.NIL;
        SubLObject func = (SubLObject)eval_in_api.NIL;
        SubLObject args = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list273);
        dict = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list273);
        func = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list273);
        args = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            return eval_in_api_mapdictionary_parameterized(dict, func, args);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list273);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 65106L)
    public static SubLObject api_special_mapdictionary_parameterized_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject dict = (SubLObject)eval_in_api.NIL;
        SubLObject func = (SubLObject)eval_in_api.NIL;
        SubLObject args = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list273);
        dict = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list273);
        func = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list273);
        args = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            return ConsesLow.nconc(verify_form_in_api_internal(dict), verify_symbol_in_api_internal(func), verify_args_in_api_internal(args));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list273);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 65315L)
    public static SubLObject eval_in_api_mapdictionary_parameterized(final SubLObject dict, final SubLObject func, final SubLObject args) {
        final SubLObject evaluated_dict = eval_in_api_internal(dict);
        final SubLObject evaluated_func = eval_in_api_internal(func);
        final SubLObject evaluated_args = api_eval_args(eval_in_api_internal(args));
        if (eval_in_api.NIL == eval_in_api_applicable_fnP(evaluated_func)) {
            eval_in_api_error((SubLObject)eval_in_api.$str262$_S_does_not_evaluate_to_an_api_fu, func, (SubLObject)eval_in_api.UNPROVIDED);
        }
        trace_me((SubLObject)eval_in_api.$str277$evaluated_dict, evaluated_dict, (SubLObject)eval_in_api.UNPROVIDED, (SubLObject)eval_in_api.UNPROVIDED);
        trace_me((SubLObject)eval_in_api.$str278$evaluated_func, evaluated_func, (SubLObject)eval_in_api.UNPROVIDED, (SubLObject)eval_in_api.UNPROVIDED);
        trace_me((SubLObject)eval_in_api.$str279$evaluated_args, evaluated_args, (SubLObject)eval_in_api.UNPROVIDED, (SubLObject)eval_in_api.UNPROVIDED);
        final SubLObject style = dictionary.dictionary_style(evaluated_dict);
        if (style == eval_in_api.$kw270$ALIST) {
            eval_in_api_mapdictionary_parameterized_alist_style(evaluated_dict, func, evaluated_args);
        }
        else if (style == eval_in_api.$kw271$HASHTABLE) {
            eval_in_api_mapdictionary_parameterized_hashtable_style(evaluated_dict, func, evaluated_args);
        }
        else {
            Errors.error((SubLObject)eval_in_api.$str272$Corrupted_dictionary__unsupported, style);
        }
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 66466L)
    public static SubLObject eval_in_api_mapdictionary_parameterized_alist_style(final SubLObject dict, final SubLObject func, final SubLObject args) {
        SubLObject cdolist_list_var = dictionary.dictionary_contents(dict);
        SubLObject pair = (SubLObject)eval_in_api.NIL;
        pair = cdolist_list_var.first();
        while (eval_in_api.NIL != cdolist_list_var) {
            eval_in_api_internal((SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym165$FUNCALL, func, pair.first(), pair.rest(), args));
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        }
        return args;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 66869L)
    public static SubLObject eval_in_api_mapdictionary_parameterized_hashtable_style(final SubLObject dict, final SubLObject func, final SubLObject args) {
        final SubLObject cdohash_table = dictionary.dictionary_contents(dict);
        SubLObject key = (SubLObject)eval_in_api.NIL;
        SubLObject value = (SubLObject)eval_in_api.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                key = Hashtables.getEntryKey(cdohash_entry);
                value = Hashtables.getEntryValue(cdohash_entry);
                eval_in_api_internal((SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym165$FUNCALL, func, key, value, args));
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return args;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 67269L)
    public static SubLObject api_special_ccatch(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject tag = (SubLObject)eval_in_api.NIL;
        SubLObject ans_var = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list280);
        tag = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list280);
        ans_var = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return eval_in_api_ccatch(tag, ans_var, body);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 67389L)
    public static SubLObject api_special_ccatch_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject tag = (SubLObject)eval_in_api.NIL;
        SubLObject ans_var = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list280);
        tag = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list280);
        ans_var = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return ConsesLow.nconc(verify_form_in_api_internal(tag), verify_symbol_in_api_internal(ans_var), verify_args_in_api_internal(body));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 67587L)
    public static SubLObject eval_in_api_ccatch(final SubLObject tag, final SubLObject ans_var, final SubLObject body) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject env_depth_upon_entering = Sequences.length(eval_in_api.$eval_in_api_env$.getDynamicValue(thread));
        SubLObject form_to_eval = (SubLObject)eval_in_api.NIL;
        form_to_eval = (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym21$CLET, (SubLObject)eval_in_api.$list284, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym281$CCATCH, tag, (SubLObject)eval_in_api.$sym285$ANSWER_VARIABLE, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym63$EVAL_IN_API_PROGN_BODY, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym15$QUOTE, body))), (SubLObject)ConsesLow.listS((SubLObject)eval_in_api.$sym286$EVAL_IN_API_CSETQ, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym15$QUOTE, ans_var), (SubLObject)eval_in_api.$list284));
        eval_in_api_subl_eval(form_to_eval);
        while (Sequences.length(eval_in_api.$eval_in_api_env$.getDynamicValue(thread)).numG(env_depth_upon_entering)) {
            eval_in_api.$eval_in_api_env$.setDynamicValue(eval_in_api.$eval_in_api_env$.getDynamicValue(thread).rest(), thread);
        }
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 68126L)
    public static SubLObject api_special_throw(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject tag = (SubLObject)eval_in_api.NIL;
        SubLObject result = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list287);
        tag = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list287);
        result = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            return eval_in_api_throw(tag, result);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list287);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 68205L)
    public static SubLObject api_special_throw_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject tag = (SubLObject)eval_in_api.NIL;
        SubLObject result = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list287);
        tag = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list287);
        result = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            return ConsesLow.nconc(verify_form_in_api_internal(tag), verify_form_in_api_internal(result));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list287);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 68345L)
    public static SubLObject eval_in_api_throw(final SubLObject tag, final SubLObject result) {
        eval_in_api_subl_eval((SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym288$THROW, tag, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym291$EVAL_IN_API_INTERNAL, result)));
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 68477L)
    public static SubLObject api_special_ignore_errors(final SubLObject form) {
        final SubLObject datum = form.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return eval_in_api_ignore_errors(body);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 68816L)
    public static SubLObject api_special_ignore_errors_verify(final SubLObject form) {
        final SubLObject datum = form.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return verify_args_in_api_internal(body);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 68913L)
    public static SubLObject eval_in_api_ignore_errors(final SubLObject body) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = (SubLObject)eval_in_api.NIL;
        final SubLObject env_depth_upon_entering = Sequences.length(eval_in_api.$eval_in_api_env$.getDynamicValue(thread));
        SubLObject form_to_eval = (SubLObject)eval_in_api.NIL;
        form_to_eval = (SubLObject)ConsesLow.listS((SubLObject)eval_in_api.$sym21$CLET, (SubLObject)eval_in_api.$list295, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym292$IGNORE_ERRORS, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym51$CSETQ, (SubLObject)eval_in_api.$sym296$LOCAL_RESULTS, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym53$MULTIPLE_VALUE_LIST, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym63$EVAL_IN_API_PROGN_BODY, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym15$QUOTE, body))))), (SubLObject)eval_in_api.$list295);
        results = eval_in_api_subl_eval(form_to_eval);
        while (Sequences.length(eval_in_api.$eval_in_api_env$.getDynamicValue(thread)).numG(env_depth_upon_entering)) {
            eval_in_api.$eval_in_api_env$.setDynamicValue(eval_in_api.$eval_in_api_env$.getDynamicValue(thread).rest(), thread);
        }
        if (eval_in_api.NIL != results) {
            return subl_promotions.values_list(results);
        }
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 69553L)
    public static SubLObject api_special_cunwind_protect(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject protected_form = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list297);
        protected_form = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return eval_in_api_cunwind_protect(protected_form, body);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 69696L)
    public static SubLObject api_special_cunwind_protect_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject protected_form = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list297);
        protected_form = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return ConsesLow.nconc(verify_form_in_api_internal(protected_form), verify_args_in_api_internal(body));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 69870L)
    public static SubLObject eval_in_api_cunwind_protect(final SubLObject protected_form, final SubLObject body) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject env_depth_upon_entering = Sequences.length(eval_in_api.$eval_in_api_env$.getDynamicValue(thread));
        SubLObject form_to_eval = (SubLObject)eval_in_api.NIL;
        form_to_eval = (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym298$CUNWIND_PROTECT, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym291$EVAL_IN_API_INTERNAL, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym15$QUOTE, protected_form)), (SubLObject)ConsesLow.listS((SubLObject)eval_in_api.$sym235$WHILE, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym301$_, (SubLObject)eval_in_api.$list302, env_depth_upon_entering), (SubLObject)eval_in_api.$list303), (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym63$EVAL_IN_API_PROGN_BODY, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym15$QUOTE, body)));
        trace_me((SubLObject)eval_in_api.$str304$eval_in_api_cunwind_protect, form_to_eval, (SubLObject)eval_in_api.UNPROVIDED, (SubLObject)eval_in_api.UNPROVIDED);
        eval_in_api_subl_eval(form_to_eval);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 70424L)
    public static SubLObject api_special_load(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject filename = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list305);
        filename = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            return eval_in_api_load(filename);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list305);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 70620L)
    public static SubLObject api_special_load_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject filename = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list305);
        filename = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            return verify_form_in_api_internal(filename);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list305);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 70710L)
    public static SubLObject eval_in_api_load(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject evaluated_filename = eval_in_api_internal(filename);
        assert eval_in_api.NIL != Types.stringp(evaluated_filename) : evaluated_filename;
        SubLObject done = (SubLObject)eval_in_api.NIL;
        SubLObject stream_var = (SubLObject)eval_in_api.NIL;
        try {
            final SubLObject stream;
            stream_var = (stream = StreamsLow.open(evaluated_filename, new SubLObject[] { eval_in_api.$kw310$DIRECTION, eval_in_api.$kw311$INPUT, eval_in_api.$kw312$IF_DOES_NOT_EXIST, eval_in_api.NIL }));
            if (!stream.isStream()) {
                Errors.error((SubLObject)eval_in_api.$str313$_S_does_not_exist__cannot_load, evaluated_filename);
            }
            while (eval_in_api.NIL == done) {
                thread.resetMultipleValues();
                final SubLObject form = reader.read_ignoring_errors(stream, (SubLObject)eval_in_api.NIL, (SubLObject)eval_in_api.$kw314$EOF);
                final SubLObject error = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (error == eval_in_api.$kw315$ERROR) {
                    if (form != eval_in_api.$kw314$EOF) {
                        Errors.error((SubLObject)eval_in_api.$str316$__Read_error_occured_at_position_, streams_high.file_position(stream, (SubLObject)eval_in_api.UNPROVIDED), evaluated_filename);
                    }
                    done = (SubLObject)eval_in_api.T;
                }
                else {
                    eval_in_api(form);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)eval_in_api.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (eval_in_api.NIL != stream_var) {
                    streams_high.close(stream_var, (SubLObject)eval_in_api.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)eval_in_api.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 71499L)
    public static SubLObject api_special_check_type(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject v_object = (SubLObject)eval_in_api.NIL;
        SubLObject pred = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list317);
        v_object = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list317);
        pred = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            if (eval_in_api.NIL == Types.$suspend_type_checkingP$.getDynamicValue(thread) && eval_in_api.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && eval_in_api.NIL == eval_in_api((SubLObject)ConsesLow.list(pred, v_object))) {
                Errors.error((SubLObject)eval_in_api.$str318$_A_is_not_a__A, v_object, pred);
            }
            return (SubLObject)eval_in_api.NIL;
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list317);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 71682L)
    public static SubLObject api_special_check_type_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject v_object = (SubLObject)eval_in_api.NIL;
        SubLObject pred = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list317);
        v_object = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list317);
        pred = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            SubLObject result = (SubLObject)eval_in_api.NIL;
            result = ConsesLow.nconc(result, verify_form_in_api_internal(v_object));
            if (eval_in_api.NIL == valid_api_function_p(pred)) {
                final SubLObject item_var = pred;
                if (eval_in_api.NIL == conses_high.member(item_var, result, Symbols.symbol_function((SubLObject)eval_in_api.EQL), Symbols.symbol_function((SubLObject)eval_in_api.IDENTITY))) {
                    result = (SubLObject)ConsesLow.cons(item_var, result);
                }
            }
            return result;
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list317);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 71911L)
    public static SubLObject api_special_quote(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject expression = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list68);
        expression = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            return expression;
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list68);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 71970L)
    public static SubLObject api_special_quote_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject expression = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list68);
        expression = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            return (SubLObject)eval_in_api.NIL;
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list68);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 72050L)
    public static SubLObject api_special_boundp(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject symbol = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list102);
        symbol = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            return list_utilities.sublisp_boolean(conses_high.assoc(eval_in_api_internal(symbol), eval_in_api.$eval_in_api_env$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)eval_in_api.EQ), (SubLObject)eval_in_api.UNPROVIDED));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list102);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 72166L)
    public static SubLObject api_special_boundp_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject symbol = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list102);
        symbol = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            return verify_symbol_in_api_internal(symbol);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list102);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 72256L)
    public static SubLObject api_special_symbol_value(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject var = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list120);
        var = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            final SubLObject symbol = eval_in_api_internal(var);
            SubLObject value = (SubLObject)eval_in_api.NIL;
            value = eval_in_api_internal(symbol);
            return value;
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list120);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 72415L)
    public static SubLObject api_special_symbol_value_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject var = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list120);
        var = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            return verify_form_in_api_internal(var);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list120);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 72503L)
    public static SubLObject api_special_function(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject fname = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list330);
        fname = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            return eval_in_api_function(fname);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list330);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 72579L)
    public static SubLObject api_special_function_verify(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject fname = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list330);
        fname = current.first();
        current = current.rest();
        if (eval_in_api.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list330);
            return (SubLObject)eval_in_api.NIL;
        }
        if (eval_in_api.NIL != list_utilities.member_eqP(fname, eval_in_api.$verify_in_api_fbound_symbols$.getDynamicValue(thread)) || eval_in_api.NIL != valid_api_operator_p(fname)) {
            return (SubLObject)eval_in_api.NIL;
        }
        return (SubLObject)ConsesLow.list(fname);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 72764L)
    public static SubLObject eval_in_api_function(final SubLObject fname) {
        return (SubLObject)((eval_in_api.NIL != eval_in_api_user_fnP(fname)) ? ConsesLow.list(fname, api_function_handler(fname)) : eval_in_api_subl_eval((SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym331$FUNCTION, fname)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 72962L)
    public static SubLObject api_special_error(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject format_string = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list334);
        format_string = current.first();
        final SubLObject v_arguments;
        current = (v_arguments = current.rest());
        final SubLObject all_error_args = (SubLObject)ConsesLow.cons(format_string, api_eval_args(v_arguments));
        return eval_in_api_subl_apply(Symbols.symbol_function((SubLObject)eval_in_api.$sym335$ERROR), all_error_args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 73154L)
    public static SubLObject api_special_error_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject format_string = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list334);
        format_string = current.first();
        final SubLObject v_arguments;
        current = (v_arguments = current.rest());
        return ConsesLow.nconc(verify_form_in_api_internal(format_string), verify_args_in_api_internal(v_arguments));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 73326L)
    public static SubLObject api_special_break(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject format_string = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list334);
        format_string = current.first();
        final SubLObject v_arguments;
        current = (v_arguments = current.rest());
        SubLObject env_string = PrintLow.format((SubLObject)eval_in_api.NIL, (SubLObject)eval_in_api.$str176$__);
        SubLObject cdolist_list_var = eval_in_api.$eval_in_api_env$.getDynamicValue(thread);
        SubLObject binding = (SubLObject)eval_in_api.NIL;
        binding = cdolist_list_var.first();
        while (eval_in_api.NIL != cdolist_list_var) {
            env_string = Sequences.cconcatenate(env_string, PrintLow.format((SubLObject)eval_in_api.NIL, (SubLObject)eval_in_api.$str338$___S, binding));
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        final SubLObject env_format_string = Sequences.cconcatenate(env_string, new SubLObject[] { eval_in_api.$str176$__, format_string });
        final SubLObject all_break_args = (SubLObject)ConsesLow.cons(env_format_string, api_eval_args(v_arguments));
        return eval_in_api_subl_apply(Symbols.symbol_function((SubLObject)eval_in_api.$sym339$BREAK), all_break_args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 73766L)
    public static SubLObject api_special_break_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject format_string = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list334);
        format_string = current.first();
        final SubLObject v_arguments;
        current = (v_arguments = current.rest());
        return ConsesLow.nconc(verify_form_in_api_internal(format_string), verify_args_in_api_internal(v_arguments));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 73938L)
    public static SubLObject api_special_clear_environment(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject datum = form.rest();
        if (eval_in_api.NIL != datum) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.NIL);
        }
        if (eval_in_api.$eval_in_api_level$.getDynamicValue(thread).eql((SubLObject)eval_in_api.ZERO_INTEGER)) {
            eval_in_api.$eval_in_api_env$.setDynamicValue((SubLObject)eval_in_api.NIL, thread);
        }
        else {
            eval_in_api_error((SubLObject)eval_in_api.$str342$Can_only_clear_the_environment_fr, (SubLObject)eval_in_api.UNPROVIDED, (SubLObject)eval_in_api.UNPROVIDED);
        }
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 74158L)
    public static SubLObject api_special_clear_environment_verify(final SubLObject form) {
        final SubLObject datum = form.rest();
        if (eval_in_api.NIL != datum) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.NIL);
        }
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 74218L)
    public static SubLObject api_special_get_environment(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject datum = form.rest();
        if (eval_in_api.NIL != datum) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.NIL);
        }
        SubLObject result = PrintLow.format((SubLObject)eval_in_api.NIL, (SubLObject)eval_in_api.$str176$__);
        SubLObject cdolist_list_var = eval_in_api.$eval_in_api_env$.getDynamicValue(thread);
        SubLObject binding = (SubLObject)eval_in_api.NIL;
        binding = cdolist_list_var.first();
        while (eval_in_api.NIL != cdolist_list_var) {
            result = Sequences.cconcatenate(result, PrintLow.format((SubLObject)eval_in_api.NIL, (SubLObject)eval_in_api.$str338$___S, binding));
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 74432L)
    public static SubLObject api_special_get_environment_verify(final SubLObject form) {
        final SubLObject datum = form.rest();
        if (eval_in_api.NIL != datum) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.NIL);
        }
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 74490L)
    public static SubLObject api_special_in_package(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject v_package = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list349);
        v_package = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            return v_package;
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list349);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 74567L)
    public static SubLObject api_special_in_package_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject v_package = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list349);
        v_package = current.first();
        current = current.rest();
        if (eval_in_api.NIL == current) {
            return (SubLObject)eval_in_api.NIL;
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)eval_in_api.$list349);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 74646L)
    public static SubLObject api_special_ctime(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject var = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list353);
        var = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return eval_in_api_ctime(var, body);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 74727L)
    public static SubLObject api_special_ctime_verify(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject var = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list353);
        var = current.first();
        final SubLObject body;
        current = (body = current.rest());
        SubLObject result = (SubLObject)eval_in_api.NIL;
        final SubLObject _prev_bind_0 = eval_in_api.$verify_in_api_bound_symbols$.currentBinding(thread);
        try {
            eval_in_api.$verify_in_api_bound_symbols$.bind(eval_in_api.$verify_in_api_bound_symbols$.getDynamicValue(thread), thread);
            eval_in_api.$verify_in_api_bound_symbols$.setDynamicValue((SubLObject)ConsesLow.cons(var, eval_in_api.$verify_in_api_bound_symbols$.getDynamicValue(thread)), thread);
            result = verify_args_in_api_internal(body);
        }
        finally {
            eval_in_api.$verify_in_api_bound_symbols$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 74991L)
    public static SubLObject eval_in_api_ctime(final SubLObject var, final SubLObject body) {
        SubLObject form_to_eval = (SubLObject)eval_in_api.NIL;
        form_to_eval = (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym357$WITH_TEMP_VARS, (SubLObject)eval_in_api.$list358, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym354$CTIME, (SubLObject)eval_in_api.$sym359$TEMP_VAR, reader.bq_cons((SubLObject)eval_in_api.$sym360$WITH_EVAL_IN_API_ENV, ConsesLow.append(body, (SubLObject)eval_in_api.NIL))), (SubLObject)ConsesLow.listS((SubLObject)eval_in_api.$sym286$EVAL_IN_API_CSETQ, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym15$QUOTE, var), (SubLObject)eval_in_api.$list358));
        trace_me((SubLObject)eval_in_api.$str361$eval_in_api_ctime, form_to_eval, (SubLObject)eval_in_api.UNPROVIDED, (SubLObject)eval_in_api.UNPROVIDED);
        return eval_in_api_subl_eval(form_to_eval);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 75311L)
    public static SubLObject api_special_noting_percent_progress(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject string = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list362);
        string = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return eval_in_api_noting_percent_progress(string, body);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 75434L)
    public static SubLObject api_special_noting_percent_progress_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject string = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list362);
        string = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return ConsesLow.nconc(verify_form_in_api_internal(string), verify_args_in_api_internal(body));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 75600L)
    public static SubLObject eval_in_api_noting_percent_progress(final SubLObject string, final SubLObject body) {
        SubLObject form_to_eval = (SubLObject)eval_in_api.NIL;
        form_to_eval = (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym363$NOTING_PERCENT_PROGRESS, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym291$EVAL_IN_API_INTERNAL, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym15$QUOTE, string)), reader.bq_cons((SubLObject)eval_in_api.$sym360$WITH_EVAL_IN_API_ENV, ConsesLow.append(body, (SubLObject)eval_in_api.NIL)));
        trace_me((SubLObject)eval_in_api.$str366$eval_in_api_noting_percent_progre, form_to_eval, (SubLObject)eval_in_api.UNPROVIDED, (SubLObject)eval_in_api.UNPROVIDED);
        eval_in_api_subl_eval(form_to_eval);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 75940L)
    public static SubLObject api_special_noting_activity(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject string = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list362);
        string = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return eval_in_api_noting_activity(string, body);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 76047L)
    public static SubLObject api_special_noting_activity_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject string = (SubLObject)eval_in_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)eval_in_api.$list362);
        string = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return ConsesLow.nconc(verify_form_in_api_internal(string), verify_args_in_api_internal(body));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 76205L)
    public static SubLObject eval_in_api_noting_activity(final SubLObject string, final SubLObject body) {
        SubLObject form_to_eval = (SubLObject)eval_in_api.NIL;
        form_to_eval = (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym367$NOTING_ACTIVITY, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym291$EVAL_IN_API_INTERNAL, (SubLObject)ConsesLow.list((SubLObject)eval_in_api.$sym15$QUOTE, string)), reader.bq_cons((SubLObject)eval_in_api.$sym360$WITH_EVAL_IN_API_ENV, ConsesLow.append(body, (SubLObject)eval_in_api.NIL)));
        trace_me((SubLObject)eval_in_api.$str370$eval_in_api_noting_activity, form_to_eval, (SubLObject)eval_in_api.UNPROVIDED, (SubLObject)eval_in_api.UNPROVIDED);
        eval_in_api_subl_eval(form_to_eval);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/eval-in-api.lisp", position = 76522L)
    public static SubLObject eval_in_api_initialize() {
        eval_in_api.$eval_in_api_env$.setDynamicValue((SubLObject)eval_in_api.NIL);
        utilities_macros.unregister_api_predefined_macro((SubLObject)eval_in_api.$sym371$MUST);
        utilities_macros.register_api_predefined_function((SubLObject)eval_in_api.$sym371$MUST);
        utilities_macros.unregister_api_predefined_macro((SubLObject)eval_in_api.$sym319$CHECK_TYPE);
        return (SubLObject)eval_in_api.NIL;
    }
    
    public static SubLObject declare_eval_in_api_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "cyc_api_eval", "CYC-API-EVAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "possibly_cyc_api_eval", "POSSIBLY-CYC-API-EVAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "possibly_cyc_api_apply", "POSSIBLY-CYC-API-APPLY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "possibly_cyc_api_function_spec_p", "POSSIBLY-CYC-API-FUNCTION-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "possibly_cyc_api_funcall_1", "POSSIBLY-CYC-API-FUNCALL-1", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "possibly_cyc_api_funcall_2", "POSSIBLY-CYC-API-FUNCALL-2", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "possibly_cyc_api_funcall_3", "POSSIBLY-CYC-API-FUNCALL-3", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "possibly_cyc_api_funcall_4", "POSSIBLY-CYC-API-FUNCALL-4", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "register_api_mutable_global", "REGISTER-API-MUTABLE-GLOBAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_mutable_global_p", "API-MUTABLE-GLOBAL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "register_api_immutable_global", "REGISTER-API-IMMUTABLE-GLOBAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_immutable_global_p", "API-IMMUTABLE-GLOBAL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_lexical_variable_p", "API-LEXICAL-VARIABLE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_dynamic_variable_p", "API-DYNAMIC-VARIABLE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_verify_p", "API-SPECIAL-VERIFY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_verify_handler", "API-SPECIAL-VERIFY-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "register_api_special_verify", "REGISTER-API-SPECIAL-VERIFY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_function_p", "API-FUNCTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_function_handler", "API-FUNCTION-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "register_api_function", "REGISTER-API-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_macro_p", "API-MACRO-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_macro_expander", "API-MACRO-EXPANDER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "register_api_macro", "REGISTER-API-MACRO", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.eval_in_api", "defspecial_in_api", "DEFSPECIAL-IN-API");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.eval_in_api", "defspecial_in_api_verify", "DEFSPECIAL-IN-API-VERIFY");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.eval_in_api", "with_eval_in_api_subl_evaluation", "WITH-EVAL-IN-API-SUBL-EVALUATION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "eval_in_api_subl_eval", "EVAL-IN-API-SUBL-EVAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "eval_in_api_subl_apply", "EVAL-IN-API-SUBL-APPLY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "eval_in_api_subl_funcall", "EVAL-IN-API-SUBL-FUNCALL", 1, 4, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.eval_in_api", "with_clean_eval_in_api_environment", "WITH-CLEAN-EVAL-IN-API-ENVIRONMENT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "initialize_eval_in_api_env", "INITIALIZE-EVAL-IN-API-ENV", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "eval_in_api", "EVAL-IN-API", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "valid_api_operator_p", "VALID-API-OPERATOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "valid_api_function_p", "VALID-API-FUNCTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "valid_api_macro_p", "VALID-API-MACRO-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "eval_in_api_internal", "EVAL-IN-API-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_eval_args", "API-EVAL-ARGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "eval_in_api_error", "EVAL-IN-API-ERROR", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_self_evaluation", "API-SELF-EVALUATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_dynamic_variable_value", "API-DYNAMIC-VARIABLE-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_lexical_variable_value", "API-LEXICAL-VARIABLE-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_apply_predefined_function", "API-APPLY-PREDEFINED-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_apply_predefined_function_one_arg", "API-APPLY-PREDEFINED-FUNCTION-ONE-ARG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_expand_predefined_macro", "API-EXPAND-PREDEFINED-MACRO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_funcall_special_handler", "API-FUNCALL-SPECIAL-HANDLER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_funcall_special_verify_handler", "API-FUNCALL-SPECIAL-VERIFY-HANDLER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_apply_function_handler", "API-APPLY-FUNCTION-HANDLER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_apply_lambda", "API-APPLY-LAMBDA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_funcall_macro_expander", "API-FUNCALL-MACRO-EXPANDER", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.eval_in_api", "with_eval_in_api_env", "WITH-EVAL-IN-API-ENV");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "with_eval_in_api_env_int", "WITH-EVAL-IN-API-ENV-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "eval_in_api_update_env", "EVAL-IN-API-UPDATE-ENV", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "verify_in_api", "VERIFY-IN-API", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "verify_args_in_api_internal", "VERIFY-ARGS-IN-API-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "verify_form_in_api_internal", "VERIFY-FORM-IN-API-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "verify_symbol_in_api_internal", "VERIFY-SYMBOL-IN-API-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_ret", "API-SPECIAL-RET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_ret_verify", "API-SPECIAL-RET-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_define", "API-SPECIAL-DEFINE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_define_verify", "API-SPECIAL-DEFINE-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_define_public", "API-SPECIAL-DEFINE-PUBLIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_define_public_verify", "API-SPECIAL-DEFINE-PUBLIC-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_define_protected", "API-SPECIAL-DEFINE-PROTECTED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_define_protected_verify", "API-SPECIAL-DEFINE-PROTECTED-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_define_private", "API-SPECIAL-DEFINE-PRIVATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_define_private_verify", "API-SPECIAL-DEFINE-PRIVATE-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_defmacro", "API-SPECIAL-DEFMACRO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_defmacro_verify", "API-SPECIAL-DEFMACRO-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_defmacro_public", "API-SPECIAL-DEFMACRO-PUBLIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_defmacro_public_verify", "API-SPECIAL-DEFMACRO-PUBLIC-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_defmacro_protected", "API-SPECIAL-DEFMACRO-PROTECTED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_defmacro_protected_verify", "API-SPECIAL-DEFMACRO-PROTECTED-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_define_verify_int", "API-SPECIAL-DEFINE-VERIFY-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_defstruct", "API-SPECIAL-DEFSTRUCT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_defstruct_verify", "API-SPECIAL-DEFSTRUCT-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "eval_in_api_defstruct", "EVAL-IN-API-DEFSTRUCT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_fi_get_parameter", "API-SPECIAL-FI-GET-PARAMETER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_fi_get_parameter_verify", "API-SPECIAL-FI-GET-PARAMETER-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_defvar", "API-SPECIAL-DEFVAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_defvar_verify", "API-SPECIAL-DEFVAR-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_defvar_private", "API-SPECIAL-DEFVAR-PRIVATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_defvar_private_verify", "API-SPECIAL-DEFVAR-PRIVATE-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "eval_in_api_defvar", "EVAL-IN-API-DEFVAR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_user_variable_p", "API-USER-VARIABLE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "clear_api_user_variables", "CLEAR-API-USER-VARIABLES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "put_api_user_variable", "PUT-API-USER-VARIABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "get_api_user_variable", "GET-API-USER-VARIABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_fi_set_parameter", "API-SPECIAL-FI-SET-PARAMETER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_fi_set_parameter_verify", "API-SPECIAL-FI-SET-PARAMETER-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_csetq", "API-SPECIAL-CSETQ", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_csetq_verify", "API-SPECIAL-CSETQ-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "eval_in_api_csetq", "EVAL-IN-API-CSETQ", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_cinc", "API-SPECIAL-CINC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_cinc_verify", "API-SPECIAL-CINC-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_cdec", "API-SPECIAL-CDEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_cdec_verify", "API-SPECIAL-CDEC-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_cpush", "API-SPECIAL-CPUSH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_cpush_verify", "API-SPECIAL-CPUSH-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_cpop", "API-SPECIAL-CPOP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_cpop_verify", "API-SPECIAL-CPOP-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_eval", "API-SPECIAL-EVAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_eval_in_api_verify", "API-SPECIAL-EVAL-IN-API-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_fi_eval", "API-SPECIAL-FI-EVAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_fi_eval_verify", "API-SPECIAL-FI-EVAL-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_fi_local_eval", "API-SPECIAL-FI-LOCAL-EVAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_fi_local_eval_verify", "API-SPECIAL-FI-LOCAL-EVAL-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_apply", "API-SPECIAL-APPLY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_apply_verify", "API-SPECIAL-APPLY-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "eval_in_api_apply", "EVAL-IN-API-APPLY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "eval_in_api_user_lambda_fnP", "EVAL-IN-API-USER-LAMBDA-FN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "eval_in_api_user_fnP", "EVAL-IN-API-USER-FN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "eval_in_api_predefined_fnP", "EVAL-IN-API-PREDEFINED-FN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "eval_in_api_applicable_fnP", "EVAL-IN-API-APPLICABLE-FN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_fboundp", "API-SPECIAL-FBOUNDP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_fboundp_verify", "API-SPECIAL-FBOUNDP-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_funcall", "API-SPECIAL-FUNCALL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_funcall_verify", "API-SPECIAL-FUNCALL-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_multiple_value_list", "API-SPECIAL-MULTIPLE-VALUE-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_multiple_value_list_verify", "API-SPECIAL-MULTIPLE-VALUE-LIST-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_trace", "API-SPECIAL-TRACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_trace_verify", "API-SPECIAL-TRACE-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "eval_in_api_trace", "EVAL-IN-API-TRACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_untrace", "API-SPECIAL-UNTRACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_untrace_verify", "API-SPECIAL-UNTRACE-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "eval_in_api_untrace", "EVAL-IN-API-UNTRACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "eval_in_api_traced_fnP", "EVAL-IN-API-TRACED-FN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "eval_in_api_enter_trace_display", "EVAL-IN-API-ENTER-TRACE-DISPLAY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "eval_in_api_exit_trace_display", "EVAL-IN-API-EXIT-TRACE-DISPLAY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_get_trace_log", "API-SPECIAL-GET-TRACE-LOG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_get_trace_log_verify", "API-SPECIAL-GET-TRACE-LOG-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_clear_trace_log", "API-SPECIAL-CLEAR-TRACE-LOG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_clear_trace_log_verify", "API-SPECIAL-CLEAR-TRACE-LOG-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "eval_in_api_clear_trace_log", "EVAL-IN-API-CLEAR-TRACE-LOG", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "add1", "ADD1", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "sub1", "SUB1", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_progn", "API-SPECIAL-PROGN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_progn_verify", "API-SPECIAL-PROGN-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "eval_in_api_progn_body", "EVAL-IN-API-PROGN-BODY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_clet", "API-SPECIAL-CLET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_clet_verify", "API-SPECIAL-CLET-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "eval_in_api_clet", "EVAL-IN-API-CLET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "trace_me", "TRACE-ME", 0, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "eval_in_api_variable_bindings", "EVAL-IN-API-VARIABLE-BINDINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_cmultiple_value_bind", "API-SPECIAL-CMULTIPLE-VALUE-BIND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_cmultiple_value_bind_verify", "API-SPECIAL-CMULTIPLE-VALUE-BIND-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "eval_in_api_cmultiple_value_bind", "EVAL-IN-API-CMULTIPLE-VALUE-BIND", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_cand", "API-SPECIAL-CAND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_cand_verify", "API-SPECIAL-CAND-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_cor", "API-SPECIAL-COR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_cor_verify", "API-SPECIAL-COR-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_cnot", "API-SPECIAL-CNOT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_cnot_verify", "API-SPECIAL-CNOT-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_pcond", "API-SPECIAL-PCOND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_pcond_verify", "API-SPECIAL-PCOND-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_pif", "API-SPECIAL-PIF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_pif_verify", "API-SPECIAL-PIF-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "eval_in_api_if", "EVAL-IN-API-IF", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_fif", "API-SPECIAL-FIF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_fif_verify", "API-SPECIAL-FIF-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_pwhen", "API-SPECIAL-PWHEN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_pwhen_verify", "API-SPECIAL-PWHEN-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_when", "API-SPECIAL-WHEN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_when_verify", "API-SPECIAL-WHEN-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_fwhen", "API-SPECIAL-FWHEN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_fwhen_verify", "API-SPECIAL-FWHEN-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_punless", "API-SPECIAL-PUNLESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_punless_verify", "API-SPECIAL-PUNLESS-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_funless", "API-SPECIAL-FUNLESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_funless_verify", "API-SPECIAL-FUNLESS-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_while", "API-SPECIAL-WHILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_while_verify", "API-SPECIAL-WHILE-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_until", "API-SPECIAL-UNTIL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_until_verify", "API-SPECIAL-UNTIL-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_cdo", "API-SPECIAL-CDO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_cdo_verify", "API-SPECIAL-CDO-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_cdolist", "API-SPECIAL-CDOLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_cdolist_verify", "API-SPECIAL-CDOLIST-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "eval_in_api_codolist", "EVAL-IN-API-CODOLIST", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_cdotimes", "API-SPECIAL-CDOTIMES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_cdotimes_verify", "API-SPECIAL-CDOTIMES-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "eval_in_api_cdotimes", "EVAL-IN-API-CDOTIMES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_cdohash", "API-SPECIAL-CDOHASH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_cdohash_verify", "API-SPECIAL-CDOHASH-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "eval_in_api_cdohash", "EVAL-IN-API-CDOHASH", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_mapcar", "API-SPECIAL-MAPCAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_mapcar_verify", "API-SPECIAL-MAPCAR-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "eval_in_api_mapcar", "EVAL-IN-API-MAPCAR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "eval_in_api_quoted_args", "EVAL-IN-API-QUOTED-ARGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_mapdictionary", "API-SPECIAL-MAPDICTIONARY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_mapdictionary_verify", "API-SPECIAL-MAPDICTIONARY-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "eval_in_api_mapdictionary", "EVAL-IN-API-MAPDICTIONARY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "eval_in_api_mapdictionary_alist_style", "EVAL-IN-API-MAPDICTIONARY-ALIST-STYLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "eval_in_api_mapdictionary_hashtable_style", "EVAL-IN-API-MAPDICTIONARY-HASHTABLE-STYLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_mapdictionary_parameterized", "API-SPECIAL-MAPDICTIONARY-PARAMETERIZED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_mapdictionary_parameterized_verify", "API-SPECIAL-MAPDICTIONARY-PARAMETERIZED-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "eval_in_api_mapdictionary_parameterized", "EVAL-IN-API-MAPDICTIONARY-PARAMETERIZED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "eval_in_api_mapdictionary_parameterized_alist_style", "EVAL-IN-API-MAPDICTIONARY-PARAMETERIZED-ALIST-STYLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "eval_in_api_mapdictionary_parameterized_hashtable_style", "EVAL-IN-API-MAPDICTIONARY-PARAMETERIZED-HASHTABLE-STYLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_ccatch", "API-SPECIAL-CCATCH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_ccatch_verify", "API-SPECIAL-CCATCH-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "eval_in_api_ccatch", "EVAL-IN-API-CCATCH", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_throw", "API-SPECIAL-THROW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_throw_verify", "API-SPECIAL-THROW-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "eval_in_api_throw", "EVAL-IN-API-THROW", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_ignore_errors", "API-SPECIAL-IGNORE-ERRORS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_ignore_errors_verify", "API-SPECIAL-IGNORE-ERRORS-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "eval_in_api_ignore_errors", "EVAL-IN-API-IGNORE-ERRORS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_cunwind_protect", "API-SPECIAL-CUNWIND-PROTECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_cunwind_protect_verify", "API-SPECIAL-CUNWIND-PROTECT-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "eval_in_api_cunwind_protect", "EVAL-IN-API-CUNWIND-PROTECT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_load", "API-SPECIAL-LOAD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_load_verify", "API-SPECIAL-LOAD-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "eval_in_api_load", "EVAL-IN-API-LOAD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_check_type", "API-SPECIAL-CHECK-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_check_type_verify", "API-SPECIAL-CHECK-TYPE-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_quote", "API-SPECIAL-QUOTE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_quote_verify", "API-SPECIAL-QUOTE-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_boundp", "API-SPECIAL-BOUNDP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_boundp_verify", "API-SPECIAL-BOUNDP-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_symbol_value", "API-SPECIAL-SYMBOL-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_symbol_value_verify", "API-SPECIAL-SYMBOL-VALUE-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_function", "API-SPECIAL-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_function_verify", "API-SPECIAL-FUNCTION-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "eval_in_api_function", "EVAL-IN-API-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_error", "API-SPECIAL-ERROR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_error_verify", "API-SPECIAL-ERROR-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_break", "API-SPECIAL-BREAK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_break_verify", "API-SPECIAL-BREAK-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_clear_environment", "API-SPECIAL-CLEAR-ENVIRONMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_clear_environment_verify", "API-SPECIAL-CLEAR-ENVIRONMENT-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_get_environment", "API-SPECIAL-GET-ENVIRONMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_get_environment_verify", "API-SPECIAL-GET-ENVIRONMENT-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_in_package", "API-SPECIAL-IN-PACKAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_in_package_verify", "API-SPECIAL-IN-PACKAGE-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_ctime", "API-SPECIAL-CTIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_ctime_verify", "API-SPECIAL-CTIME-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "eval_in_api_ctime", "EVAL-IN-API-CTIME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_noting_percent_progress", "API-SPECIAL-NOTING-PERCENT-PROGRESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_noting_percent_progress_verify", "API-SPECIAL-NOTING-PERCENT-PROGRESS-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "eval_in_api_noting_percent_progress", "EVAL-IN-API-NOTING-PERCENT-PROGRESS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_noting_activity", "API-SPECIAL-NOTING-ACTIVITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "api_special_noting_activity_verify", "API-SPECIAL-NOTING-ACTIVITY-VERIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "eval_in_api_noting_activity", "EVAL-IN-API-NOTING-ACTIVITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.eval_in_api", "eval_in_api_initialize", "EVAL-IN-API-INITIALIZE", 0, 0, false);
        return (SubLObject)eval_in_api.NIL;
    }
    
    public static SubLObject init_eval_in_api_file() {
        eval_in_api.$eval_in_apiP$ = SubLFiles.defvar("*EVAL-IN-API?*", (SubLObject)eval_in_api.NIL);
        eval_in_api.$eval_in_api_mutable_globals$ = SubLFiles.deflexical("*EVAL-IN-API-MUTABLE-GLOBALS*", (SubLObject)((eval_in_api.NIL != Symbols.boundp((SubLObject)eval_in_api.$sym1$_EVAL_IN_API_MUTABLE_GLOBALS_)) ? eval_in_api.$eval_in_api_mutable_globals$.getGlobalValue() : eval_in_api.NIL));
        eval_in_api.$eval_in_api_immutable_globals$ = SubLFiles.deflexical("*EVAL-IN-API-IMMUTABLE-GLOBALS*", (SubLObject)((eval_in_api.NIL != Symbols.boundp((SubLObject)eval_in_api.$sym2$_EVAL_IN_API_IMMUTABLE_GLOBALS_)) ? eval_in_api.$eval_in_api_immutable_globals$.getGlobalValue() : eval_in_api.NIL));
        eval_in_api.$eval_in_api_env$ = SubLFiles.defparameter("*EVAL-IN-API-ENV*", (SubLObject)eval_in_api.NIL);
        eval_in_api.$api_special_verify_table$ = SubLFiles.deflexical("*API-SPECIAL-VERIFY-TABLE*", (eval_in_api.NIL != Symbols.boundp((SubLObject)eval_in_api.$sym3$_API_SPECIAL_VERIFY_TABLE_)) ? eval_in_api.$api_special_verify_table$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)eval_in_api.TEN_INTEGER, Symbols.symbol_function((SubLObject)eval_in_api.EQ), (SubLObject)eval_in_api.UNPROVIDED));
        eval_in_api.$api_function_table$ = SubLFiles.deflexical("*API-FUNCTION-TABLE*", (eval_in_api.NIL != Symbols.boundp((SubLObject)eval_in_api.$sym4$_API_FUNCTION_TABLE_)) ? eval_in_api.$api_function_table$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)eval_in_api.$int5$100, Symbols.symbol_function((SubLObject)eval_in_api.EQ), (SubLObject)eval_in_api.UNPROVIDED));
        eval_in_api.$api_macro_table$ = SubLFiles.deflexical("*API-MACRO-TABLE*", (eval_in_api.NIL != Symbols.boundp((SubLObject)eval_in_api.$sym6$_API_MACRO_TABLE_)) ? eval_in_api.$api_macro_table$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)eval_in_api.TEN_INTEGER, Symbols.symbol_function((SubLObject)eval_in_api.EQ), (SubLObject)eval_in_api.UNPROVIDED));
        eval_in_api.$subl_eval_method$ = SubLFiles.deflexical("*SUBL-EVAL-METHOD*", (SubLObject)((eval_in_api.NIL != Symbols.boundp((SubLObject)eval_in_api.$sym19$_SUBL_EVAL_METHOD_)) ? eval_in_api.$subl_eval_method$.getGlobalValue() : eval_in_api.$sym20$EVAL));
        eval_in_api.$eval_in_api_traced_fns$ = SubLFiles.defparameter("*EVAL-IN-API-TRACED-FNS*", (SubLObject)eval_in_api.NIL);
        eval_in_api.$eval_in_api_trace_log$ = SubLFiles.defparameter("*EVAL-IN-API-TRACE-LOG*", (SubLObject)eval_in_api.NIL);
        eval_in_api.$eval_in_api_level$ = SubLFiles.defparameter("*EVAL-IN-API-LEVEL*", (SubLObject)eval_in_api.MINUS_ONE_INTEGER);
        eval_in_api.$eval_in_api_function_level$ = SubLFiles.defparameter("*EVAL-IN-API-FUNCTION-LEVEL*", (SubLObject)eval_in_api.MINUS_ONE_INTEGER);
        eval_in_api.$eval_in_api_macro_stack$ = SubLFiles.defparameter("*EVAL-IN-API-MACRO-STACK*", (SubLObject)eval_in_api.NIL);
        eval_in_api.$verify_in_api_verbose_modeP$ = SubLFiles.defparameter("*VERIFY-IN-API-VERBOSE-MODE?*", (SubLObject)eval_in_api.NIL);
        eval_in_api.$verify_in_api_bound_symbols$ = SubLFiles.defparameter("*VERIFY-IN-API-BOUND-SYMBOLS*", (SubLObject)eval_in_api.NIL);
        eval_in_api.$verify_in_api_fbound_symbols$ = SubLFiles.defparameter("*VERIFY-IN-API-FBOUND-SYMBOLS*", (SubLObject)eval_in_api.NIL);
        eval_in_api.$verify_in_api_macro_stack$ = SubLFiles.defparameter("*VERIFY-IN-API-MACRO-STACK*", (SubLObject)eval_in_api.NIL);
        eval_in_api.$api_user_variables$ = SubLFiles.deflexical("*API-USER-VARIABLES*", (SubLObject)eval_in_api.NIL);
        return (SubLObject)eval_in_api.NIL;
    }
    
    public static SubLObject setup_eval_in_api_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)eval_in_api.$sym1$_EVAL_IN_API_MUTABLE_GLOBALS_);
        subl_macro_promotions.declare_defglobal((SubLObject)eval_in_api.$sym2$_EVAL_IN_API_IMMUTABLE_GLOBALS_);
        subl_macro_promotions.declare_defglobal((SubLObject)eval_in_api.$sym3$_API_SPECIAL_VERIFY_TABLE_);
        subl_macro_promotions.declare_defglobal((SubLObject)eval_in_api.$sym4$_API_FUNCTION_TABLE_);
        subl_macro_promotions.declare_defglobal((SubLObject)eval_in_api.$sym6$_API_MACRO_TABLE_);
        subl_macro_promotions.declare_defglobal((SubLObject)eval_in_api.$sym19$_SUBL_EVAL_METHOD_);
        access_macros.register_macro_helper((SubLObject)eval_in_api.$sym24$INITIALIZE_EVAL_IN_API_ENV, (SubLObject)eval_in_api.$sym25$WITH_EVAL_IN_API_ENVIRONMENT);
        utilities_macros.register_cyc_api_function((SubLObject)eval_in_api.$sym28$VALID_API_OPERATOR_P, (SubLObject)eval_in_api.$list29, (SubLObject)eval_in_api.$str30$_return_boolean_T_if_APPLY_or_FUN, (SubLObject)eval_in_api.$list31, (SubLObject)eval_in_api.$list32);
        utilities_macros.register_cyc_api_function((SubLObject)eval_in_api.$sym33$VALID_API_FUNCTION_P, (SubLObject)eval_in_api.$list29, (SubLObject)eval_in_api.$str34$_return_boolean_T_if_APPLY_or_FUN, (SubLObject)eval_in_api.$list31, (SubLObject)eval_in_api.$list32);
        utilities_macros.register_cyc_api_function((SubLObject)eval_in_api.$sym35$VALID_API_MACRO_P, (SubLObject)eval_in_api.$list29, (SubLObject)eval_in_api.$str36$_return_boolean_T_iff_macro_expan, (SubLObject)eval_in_api.$list31, (SubLObject)eval_in_api.$list32);
        generic_testing.define_test_case_table_int((SubLObject)eval_in_api.$sym28$VALID_API_OPERATOR_P, (SubLObject)ConsesLow.list(new SubLObject[] { eval_in_api.$kw37$TEST, Symbols.symbol_function((SubLObject)eval_in_api.EQ), eval_in_api.$kw38$OWNER, eval_in_api.NIL, eval_in_api.$kw39$CLASSES, eval_in_api.NIL, eval_in_api.$kw40$KB, eval_in_api.$kw41$TINY, eval_in_api.$kw42$WORKING_, eval_in_api.T }), (SubLObject)eval_in_api.$list43);
        access_macros.register_external_symbol((SubLObject)eval_in_api.$sym65$VERIFY_IN_API);
        generic_testing.define_test_case_table_int((SubLObject)eval_in_api.$sym65$VERIFY_IN_API, (SubLObject)ConsesLow.list(new SubLObject[] { eval_in_api.$kw37$TEST, Symbols.symbol_function((SubLObject)eval_in_api.EQUAL), eval_in_api.$kw38$OWNER, eval_in_api.NIL, eval_in_api.$kw39$CLASSES, eval_in_api.NIL, eval_in_api.$kw40$KB, eval_in_api.$kw41$TINY, eval_in_api.$kw42$WORKING_, eval_in_api.T }), (SubLObject)eval_in_api.$list67);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym69$RET, (SubLObject)eval_in_api.$sym70$API_SPECIAL_RET);
        register_api_special_verify((SubLObject)eval_in_api.$sym69$RET, (SubLObject)eval_in_api.$sym71$API_SPECIAL_RET_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym73$DEFINE, (SubLObject)eval_in_api.$sym74$API_SPECIAL_DEFINE);
        register_api_special_verify((SubLObject)eval_in_api.$sym73$DEFINE, (SubLObject)eval_in_api.$sym75$API_SPECIAL_DEFINE_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym76$DEFINE_PUBLIC, (SubLObject)eval_in_api.$sym77$API_SPECIAL_DEFINE_PUBLIC);
        register_api_special_verify((SubLObject)eval_in_api.$sym76$DEFINE_PUBLIC, (SubLObject)eval_in_api.$sym78$API_SPECIAL_DEFINE_PUBLIC_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym79$DEFINE_PROTECTED, (SubLObject)eval_in_api.$sym80$API_SPECIAL_DEFINE_PROTECTED);
        register_api_special_verify((SubLObject)eval_in_api.$sym79$DEFINE_PROTECTED, (SubLObject)eval_in_api.$sym81$API_SPECIAL_DEFINE_PROTECTED_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym11$DEFINE_PRIVATE, (SubLObject)eval_in_api.$sym82$API_SPECIAL_DEFINE_PRIVATE);
        register_api_special_verify((SubLObject)eval_in_api.$sym11$DEFINE_PRIVATE, (SubLObject)eval_in_api.$sym83$API_SPECIAL_DEFINE_PRIVATE_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym85$DEFMACRO, (SubLObject)eval_in_api.$sym86$API_SPECIAL_DEFMACRO);
        register_api_special_verify((SubLObject)eval_in_api.$sym85$DEFMACRO, (SubLObject)eval_in_api.$sym87$API_SPECIAL_DEFMACRO_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym89$DEFMACRO_PUBLIC, (SubLObject)eval_in_api.$sym90$API_SPECIAL_DEFMACRO_PUBLIC);
        register_api_special_verify((SubLObject)eval_in_api.$sym89$DEFMACRO_PUBLIC, (SubLObject)eval_in_api.$sym91$API_SPECIAL_DEFMACRO_PUBLIC_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym93$DEFMACRO_PROTECTED, (SubLObject)eval_in_api.$sym94$API_SPECIAL_DEFMACRO_PROTECTED);
        register_api_special_verify((SubLObject)eval_in_api.$sym93$DEFMACRO_PROTECTED, (SubLObject)eval_in_api.$sym95$API_SPECIAL_DEFMACRO_PROTECTED_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym97$DEFSTRUCT, (SubLObject)eval_in_api.$sym98$API_SPECIAL_DEFSTRUCT);
        register_api_special_verify((SubLObject)eval_in_api.$sym97$DEFSTRUCT, (SubLObject)eval_in_api.$sym100$API_SPECIAL_DEFSTRUCT_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym103$FI_GET_PARAMETER, (SubLObject)eval_in_api.$sym104$API_SPECIAL_FI_GET_PARAMETER);
        register_api_special_verify((SubLObject)eval_in_api.$sym103$FI_GET_PARAMETER, (SubLObject)eval_in_api.$sym105$API_SPECIAL_FI_GET_PARAMETER_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym107$DEFVAR, (SubLObject)eval_in_api.$sym108$API_SPECIAL_DEFVAR);
        register_api_special_verify((SubLObject)eval_in_api.$sym107$DEFVAR, (SubLObject)eval_in_api.$sym109$API_SPECIAL_DEFVAR_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym110$DEFVAR_PRIVATE, (SubLObject)eval_in_api.$sym111$API_SPECIAL_DEFVAR_PRIVATE);
        register_api_special_verify((SubLObject)eval_in_api.$sym110$DEFVAR_PRIVATE, (SubLObject)eval_in_api.$sym112$API_SPECIAL_DEFVAR_PRIVATE_VERIFY);
        utilities_macros.register_cyc_api_function((SubLObject)eval_in_api.$sym113$CLEAR_API_USER_VARIABLES, (SubLObject)eval_in_api.NIL, (SubLObject)eval_in_api.$str114$Removes_all_user_variables_, (SubLObject)eval_in_api.NIL, (SubLObject)eval_in_api.$list115);
        utilities_macros.register_cyc_api_function((SubLObject)eval_in_api.$sym116$PUT_API_USER_VARIABLE, (SubLObject)eval_in_api.$list117, (SubLObject)eval_in_api.$str118$Sets_the_value_of_a_the_user_vari, (SubLObject)eval_in_api.NIL, (SubLObject)eval_in_api.$list115);
        utilities_macros.register_cyc_api_function((SubLObject)eval_in_api.$sym119$GET_API_USER_VARIABLE, (SubLObject)eval_in_api.$list120, (SubLObject)eval_in_api.$str121$Gets_the_value_of_a_the_user_vari, (SubLObject)eval_in_api.NIL, (SubLObject)eval_in_api.NIL);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym122$FI_SET_PARAMETER, (SubLObject)eval_in_api.$sym123$API_SPECIAL_FI_SET_PARAMETER);
        register_api_special_verify((SubLObject)eval_in_api.$sym122$FI_SET_PARAMETER, (SubLObject)eval_in_api.$sym124$API_SPECIAL_FI_SET_PARAMETER_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym51$CSETQ, (SubLObject)eval_in_api.$sym126$API_SPECIAL_CSETQ);
        register_api_special_verify((SubLObject)eval_in_api.$sym51$CSETQ, (SubLObject)eval_in_api.$sym127$API_SPECIAL_CSETQ_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym132$CINC, (SubLObject)eval_in_api.$sym133$API_SPECIAL_CINC);
        register_api_special_verify((SubLObject)eval_in_api.$sym132$CINC, (SubLObject)eval_in_api.$sym134$API_SPECIAL_CINC_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym135$CDEC, (SubLObject)eval_in_api.$sym136$API_SPECIAL_CDEC);
        register_api_special_verify((SubLObject)eval_in_api.$sym135$CDEC, (SubLObject)eval_in_api.$sym137$API_SPECIAL_CDEC_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym139$CPUSH, (SubLObject)eval_in_api.$sym140$API_SPECIAL_CPUSH);
        register_api_special_verify((SubLObject)eval_in_api.$sym139$CPUSH, (SubLObject)eval_in_api.$sym141$API_SPECIAL_CPUSH_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym143$CPOP, (SubLObject)eval_in_api.$sym144$API_SPECIAL_CPOP);
        register_api_special_verify((SubLObject)eval_in_api.$sym143$CPOP, (SubLObject)eval_in_api.$sym145$API_SPECIAL_CPOP_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym20$EVAL, (SubLObject)eval_in_api.$sym147$API_SPECIAL_EVAL);
        register_api_special_verify((SubLObject)eval_in_api.$sym148$EVAL_IN_API, (SubLObject)eval_in_api.$sym149$API_SPECIAL_EVAL_IN_API_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym150$FI_EVAL, (SubLObject)eval_in_api.$sym151$API_SPECIAL_FI_EVAL);
        register_api_special_verify((SubLObject)eval_in_api.$sym150$FI_EVAL, (SubLObject)eval_in_api.$sym152$API_SPECIAL_FI_EVAL_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym153$FI_LOCAL_EVAL, (SubLObject)eval_in_api.$sym154$API_SPECIAL_FI_LOCAL_EVAL);
        register_api_special_verify((SubLObject)eval_in_api.$sym153$FI_LOCAL_EVAL, (SubLObject)eval_in_api.$sym155$API_SPECIAL_FI_LOCAL_EVAL_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym157$APPLY, (SubLObject)eval_in_api.$sym158$API_SPECIAL_APPLY);
        register_api_special_verify((SubLObject)eval_in_api.$sym157$APPLY, (SubLObject)eval_in_api.$sym159$API_SPECIAL_APPLY_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym161$FBOUNDP, (SubLObject)eval_in_api.$sym162$API_SPECIAL_FBOUNDP);
        register_api_special_verify((SubLObject)eval_in_api.$sym161$FBOUNDP, (SubLObject)eval_in_api.$sym163$API_SPECIAL_FBOUNDP_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym165$FUNCALL, (SubLObject)eval_in_api.$sym166$API_SPECIAL_FUNCALL);
        register_api_special_verify((SubLObject)eval_in_api.$sym165$FUNCALL, (SubLObject)eval_in_api.$sym167$API_SPECIAL_FUNCALL_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym53$MULTIPLE_VALUE_LIST, (SubLObject)eval_in_api.$sym168$API_SPECIAL_MULTIPLE_VALUE_LIST);
        register_api_special_verify((SubLObject)eval_in_api.$sym53$MULTIPLE_VALUE_LIST, (SubLObject)eval_in_api.$sym169$API_SPECIAL_MULTIPLE_VALUE_LIST_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym170$TRACE, (SubLObject)eval_in_api.$sym171$API_SPECIAL_TRACE);
        register_api_special_verify((SubLObject)eval_in_api.$sym170$TRACE, (SubLObject)eval_in_api.$sym172$API_SPECIAL_TRACE_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym173$UNTRACE, (SubLObject)eval_in_api.$sym174$API_SPECIAL_UNTRACE);
        register_api_special_verify((SubLObject)eval_in_api.$sym173$UNTRACE, (SubLObject)eval_in_api.$sym175$API_SPECIAL_UNTRACE_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym181$GET_TRACE_LOG, (SubLObject)eval_in_api.$sym182$API_SPECIAL_GET_TRACE_LOG);
        register_api_special_verify((SubLObject)eval_in_api.$sym181$GET_TRACE_LOG, (SubLObject)eval_in_api.$sym183$API_SPECIAL_GET_TRACE_LOG_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym184$CLEAR_TRACE_LOG, (SubLObject)eval_in_api.$sym185$API_SPECIAL_CLEAR_TRACE_LOG);
        register_api_special_verify((SubLObject)eval_in_api.$sym184$CLEAR_TRACE_LOG, (SubLObject)eval_in_api.$sym186$API_SPECIAL_CLEAR_TRACE_LOG_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym10$PROGN, (SubLObject)eval_in_api.$sym188$API_SPECIAL_PROGN);
        register_api_special_verify((SubLObject)eval_in_api.$sym10$PROGN, (SubLObject)eval_in_api.$sym189$API_SPECIAL_PROGN_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym21$CLET, (SubLObject)eval_in_api.$sym191$API_SPECIAL_CLET);
        register_api_special_verify((SubLObject)eval_in_api.$sym21$CLET, (SubLObject)eval_in_api.$sym193$API_SPECIAL_CLET_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym196$CMULTIPLE_VALUE_BIND, (SubLObject)eval_in_api.$sym197$API_SPECIAL_CMULTIPLE_VALUE_BIND);
        register_api_special_verify((SubLObject)eval_in_api.$sym196$CMULTIPLE_VALUE_BIND, (SubLObject)eval_in_api.$sym198$API_SPECIAL_CMULTIPLE_VALUE_BIND_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym199$CAND, (SubLObject)eval_in_api.$sym200$API_SPECIAL_CAND);
        register_api_special_verify((SubLObject)eval_in_api.$sym199$CAND, (SubLObject)eval_in_api.$sym201$API_SPECIAL_CAND_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym202$COR, (SubLObject)eval_in_api.$sym203$API_SPECIAL_COR);
        register_api_special_verify((SubLObject)eval_in_api.$sym202$COR, (SubLObject)eval_in_api.$sym204$API_SPECIAL_COR_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym205$CNOT, (SubLObject)eval_in_api.$sym206$API_SPECIAL_CNOT);
        register_api_special_verify((SubLObject)eval_in_api.$sym205$CNOT, (SubLObject)eval_in_api.$sym207$API_SPECIAL_CNOT_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym209$PCOND, (SubLObject)eval_in_api.$sym210$API_SPECIAL_PCOND);
        register_api_special_verify((SubLObject)eval_in_api.$sym209$PCOND, (SubLObject)eval_in_api.$sym211$API_SPECIAL_PCOND_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym213$PIF, (SubLObject)eval_in_api.$sym214$API_SPECIAL_PIF);
        register_api_special_verify((SubLObject)eval_in_api.$sym213$PIF, (SubLObject)eval_in_api.$sym215$API_SPECIAL_PIF_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym216$FIF, (SubLObject)eval_in_api.$sym217$API_SPECIAL_FIF);
        register_api_special_verify((SubLObject)eval_in_api.$sym216$FIF, (SubLObject)eval_in_api.$sym218$API_SPECIAL_FIF_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym219$PWHEN, (SubLObject)eval_in_api.$sym220$API_SPECIAL_PWHEN);
        register_api_special_verify((SubLObject)eval_in_api.$sym219$PWHEN, (SubLObject)eval_in_api.$sym221$API_SPECIAL_PWHEN_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym223$WHEN, (SubLObject)eval_in_api.$sym224$API_SPECIAL_WHEN);
        register_api_special_verify((SubLObject)eval_in_api.$sym223$WHEN, (SubLObject)eval_in_api.$sym225$API_SPECIAL_WHEN_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym226$FWHEN, (SubLObject)eval_in_api.$sym227$API_SPECIAL_FWHEN);
        register_api_special_verify((SubLObject)eval_in_api.$sym226$FWHEN, (SubLObject)eval_in_api.$sym228$API_SPECIAL_FWHEN_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym229$PUNLESS, (SubLObject)eval_in_api.$sym230$API_SPECIAL_PUNLESS);
        register_api_special_verify((SubLObject)eval_in_api.$sym229$PUNLESS, (SubLObject)eval_in_api.$sym231$API_SPECIAL_PUNLESS_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym232$FUNLESS, (SubLObject)eval_in_api.$sym233$API_SPECIAL_FUNLESS);
        register_api_special_verify((SubLObject)eval_in_api.$sym232$FUNLESS, (SubLObject)eval_in_api.$sym234$API_SPECIAL_FUNLESS_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym235$WHILE, (SubLObject)eval_in_api.$sym236$API_SPECIAL_WHILE);
        register_api_special_verify((SubLObject)eval_in_api.$sym235$WHILE, (SubLObject)eval_in_api.$sym237$API_SPECIAL_WHILE_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym238$UNTIL, (SubLObject)eval_in_api.$sym239$API_SPECIAL_UNTIL);
        register_api_special_verify((SubLObject)eval_in_api.$sym238$UNTIL, (SubLObject)eval_in_api.$sym240$API_SPECIAL_UNTIL_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym243$CDO, (SubLObject)eval_in_api.$sym244$API_SPECIAL_CDO);
        register_api_special_verify((SubLObject)eval_in_api.$sym243$CDO, (SubLObject)eval_in_api.$sym245$API_SPECIAL_CDO_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym247$CDOLIST, (SubLObject)eval_in_api.$sym248$API_SPECIAL_CDOLIST);
        register_api_special_verify((SubLObject)eval_in_api.$sym247$CDOLIST, (SubLObject)eval_in_api.$sym249$API_SPECIAL_CDOLIST_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym251$CDOTIMES, (SubLObject)eval_in_api.$sym252$API_SPECIAL_CDOTIMES);
        register_api_special_verify((SubLObject)eval_in_api.$sym251$CDOTIMES, (SubLObject)eval_in_api.$sym253$API_SPECIAL_CDOTIMES_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym255$CDOHASH, (SubLObject)eval_in_api.$sym256$API_SPECIAL_CDOHASH);
        register_api_special_verify((SubLObject)eval_in_api.$sym255$CDOHASH, (SubLObject)eval_in_api.$sym257$API_SPECIAL_CDOHASH_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym259$MAPCAR, (SubLObject)eval_in_api.$sym260$API_SPECIAL_MAPCAR);
        register_api_special_verify((SubLObject)eval_in_api.$sym259$MAPCAR, (SubLObject)eval_in_api.$sym261$API_SPECIAL_MAPCAR_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym267$MAPDICTIONARY, (SubLObject)eval_in_api.$sym268$API_SPECIAL_MAPDICTIONARY);
        register_api_special_verify((SubLObject)eval_in_api.$sym267$MAPDICTIONARY, (SubLObject)eval_in_api.$sym269$API_SPECIAL_MAPDICTIONARY_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym274$MAPDICTIONARY_PARAMETERIZED, (SubLObject)eval_in_api.$sym275$API_SPECIAL_MAPDICTIONARY_PARAMETERIZED);
        register_api_special_verify((SubLObject)eval_in_api.$sym274$MAPDICTIONARY_PARAMETERIZED, (SubLObject)eval_in_api.$sym276$API_SPECIAL_MAPDICTIONARY_PARAMETERIZED_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym281$CCATCH, (SubLObject)eval_in_api.$sym282$API_SPECIAL_CCATCH);
        register_api_special_verify((SubLObject)eval_in_api.$sym281$CCATCH, (SubLObject)eval_in_api.$sym283$API_SPECIAL_CCATCH_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym288$THROW, (SubLObject)eval_in_api.$sym289$API_SPECIAL_THROW);
        register_api_special_verify((SubLObject)eval_in_api.$sym288$THROW, (SubLObject)eval_in_api.$sym290$API_SPECIAL_THROW_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym292$IGNORE_ERRORS, (SubLObject)eval_in_api.$sym293$API_SPECIAL_IGNORE_ERRORS);
        register_api_special_verify((SubLObject)eval_in_api.$sym292$IGNORE_ERRORS, (SubLObject)eval_in_api.$sym294$API_SPECIAL_IGNORE_ERRORS_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym298$CUNWIND_PROTECT, (SubLObject)eval_in_api.$sym299$API_SPECIAL_CUNWIND_PROTECT);
        register_api_special_verify((SubLObject)eval_in_api.$sym298$CUNWIND_PROTECT, (SubLObject)eval_in_api.$sym300$API_SPECIAL_CUNWIND_PROTECT_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym306$LOAD, (SubLObject)eval_in_api.$sym307$API_SPECIAL_LOAD);
        register_api_special_verify((SubLObject)eval_in_api.$sym306$LOAD, (SubLObject)eval_in_api.$sym308$API_SPECIAL_LOAD_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym319$CHECK_TYPE, (SubLObject)eval_in_api.$sym320$API_SPECIAL_CHECK_TYPE);
        register_api_special_verify((SubLObject)eval_in_api.$sym319$CHECK_TYPE, (SubLObject)eval_in_api.$sym321$API_SPECIAL_CHECK_TYPE_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym15$QUOTE, (SubLObject)eval_in_api.$sym322$API_SPECIAL_QUOTE);
        register_api_special_verify((SubLObject)eval_in_api.$sym15$QUOTE, (SubLObject)eval_in_api.$sym323$API_SPECIAL_QUOTE_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym324$BOUNDP, (SubLObject)eval_in_api.$sym325$API_SPECIAL_BOUNDP);
        register_api_special_verify((SubLObject)eval_in_api.$sym324$BOUNDP, (SubLObject)eval_in_api.$sym326$API_SPECIAL_BOUNDP_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym327$SYMBOL_VALUE, (SubLObject)eval_in_api.$sym328$API_SPECIAL_SYMBOL_VALUE);
        register_api_special_verify((SubLObject)eval_in_api.$sym327$SYMBOL_VALUE, (SubLObject)eval_in_api.$sym329$API_SPECIAL_SYMBOL_VALUE_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym331$FUNCTION, (SubLObject)eval_in_api.$sym332$API_SPECIAL_FUNCTION);
        register_api_special_verify((SubLObject)eval_in_api.$sym331$FUNCTION, (SubLObject)eval_in_api.$sym333$API_SPECIAL_FUNCTION_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym335$ERROR, (SubLObject)eval_in_api.$sym336$API_SPECIAL_ERROR);
        register_api_special_verify((SubLObject)eval_in_api.$sym335$ERROR, (SubLObject)eval_in_api.$sym337$API_SPECIAL_ERROR_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym339$BREAK, (SubLObject)eval_in_api.$sym340$API_SPECIAL_BREAK);
        register_api_special_verify((SubLObject)eval_in_api.$sym339$BREAK, (SubLObject)eval_in_api.$sym341$API_SPECIAL_BREAK_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym343$CLEAR_ENVIRONMENT, (SubLObject)eval_in_api.$sym344$API_SPECIAL_CLEAR_ENVIRONMENT);
        register_api_special_verify((SubLObject)eval_in_api.$sym343$CLEAR_ENVIRONMENT, (SubLObject)eval_in_api.$sym345$API_SPECIAL_CLEAR_ENVIRONMENT_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym346$GET_ENVIRONMENT, (SubLObject)eval_in_api.$sym347$API_SPECIAL_GET_ENVIRONMENT);
        register_api_special_verify((SubLObject)eval_in_api.$sym346$GET_ENVIRONMENT, (SubLObject)eval_in_api.$sym348$API_SPECIAL_GET_ENVIRONMENT_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym350$IN_PACKAGE, (SubLObject)eval_in_api.$sym351$API_SPECIAL_IN_PACKAGE);
        register_api_special_verify((SubLObject)eval_in_api.$sym350$IN_PACKAGE, (SubLObject)eval_in_api.$sym352$API_SPECIAL_IN_PACKAGE_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym354$CTIME, (SubLObject)eval_in_api.$sym355$API_SPECIAL_CTIME);
        register_api_special_verify((SubLObject)eval_in_api.$sym354$CTIME, (SubLObject)eval_in_api.$sym356$API_SPECIAL_CTIME_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym363$NOTING_PERCENT_PROGRESS, (SubLObject)eval_in_api.$sym364$API_SPECIAL_NOTING_PERCENT_PROGRESS);
        register_api_special_verify((SubLObject)eval_in_api.$sym363$NOTING_PERCENT_PROGRESS, (SubLObject)eval_in_api.$sym365$API_SPECIAL_NOTING_PERCENT_PROGRESS_VERIFY);
        utilities_macros.register_api_special((SubLObject)eval_in_api.$sym367$NOTING_ACTIVITY, (SubLObject)eval_in_api.$sym368$API_SPECIAL_NOTING_ACTIVITY);
        register_api_special_verify((SubLObject)eval_in_api.$sym367$NOTING_ACTIVITY, (SubLObject)eval_in_api.$sym369$API_SPECIAL_NOTING_ACTIVITY_VERIFY);
        return (SubLObject)eval_in_api.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_eval_in_api_file();
    }
    
    @Override
	public void initializeVariables() {
        init_eval_in_api_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_eval_in_api_file();
    }
    
    static {
        me = (SubLFile)new eval_in_api();
        eval_in_api.$eval_in_apiP$ = null;
        eval_in_api.$eval_in_api_mutable_globals$ = null;
        eval_in_api.$eval_in_api_immutable_globals$ = null;
        eval_in_api.$eval_in_api_env$ = null;
        eval_in_api.$api_special_verify_table$ = null;
        eval_in_api.$api_function_table$ = null;
        eval_in_api.$api_macro_table$ = null;
        eval_in_api.$subl_eval_method$ = null;
        eval_in_api.$eval_in_api_traced_fns$ = null;
        eval_in_api.$eval_in_api_trace_log$ = null;
        eval_in_api.$eval_in_api_level$ = null;
        eval_in_api.$eval_in_api_function_level$ = null;
        eval_in_api.$eval_in_api_macro_stack$ = null;
        eval_in_api.$verify_in_api_verbose_modeP$ = null;
        eval_in_api.$verify_in_api_bound_symbols$ = null;
        eval_in_api.$verify_in_api_fbound_symbols$ = null;
        eval_in_api.$verify_in_api_macro_stack$ = null;
        eval_in_api.$api_user_variables$ = null;
        $sym0$QUOTIFY = SubLObjectFactory.makeSymbol("QUOTIFY");
        $sym1$_EVAL_IN_API_MUTABLE_GLOBALS_ = SubLObjectFactory.makeSymbol("*EVAL-IN-API-MUTABLE-GLOBALS*");
        $sym2$_EVAL_IN_API_IMMUTABLE_GLOBALS_ = SubLObjectFactory.makeSymbol("*EVAL-IN-API-IMMUTABLE-GLOBALS*");
        $sym3$_API_SPECIAL_VERIFY_TABLE_ = SubLObjectFactory.makeSymbol("*API-SPECIAL-VERIFY-TABLE*");
        $sym4$_API_FUNCTION_TABLE_ = SubLObjectFactory.makeSymbol("*API-FUNCTION-TABLE*");
        $int5$100 = SubLObjectFactory.makeInteger(100);
        $sym6$_API_MACRO_TABLE_ = SubLObjectFactory.makeSymbol("*API-MACRO-TABLE*");
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("ARGLIST"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym8$FORM = SubLObjectFactory.makeUninternedSymbol("FORM");
        $str9$API_SPECIAL__A = SubLObjectFactory.makeString("API-SPECIAL-~A");
        $sym10$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym11$DEFINE_PRIVATE = SubLObjectFactory.makeSymbol("DEFINE-PRIVATE");
        $sym12$CDESTRUCTURING_BIND = SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND");
        $sym13$CDR = SubLObjectFactory.makeSymbol("CDR");
        $sym14$REGISTER_API_SPECIAL = SubLObjectFactory.makeSymbol("REGISTER-API-SPECIAL");
        $sym15$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $sym16$FORM = SubLObjectFactory.makeUninternedSymbol("FORM");
        $str17$API_SPECIAL__A_VERIFY = SubLObjectFactory.makeString("API-SPECIAL-~A-VERIFY");
        $sym18$REGISTER_API_SPECIAL_VERIFY = SubLObjectFactory.makeSymbol("REGISTER-API-SPECIAL-VERIFY");
        $sym19$_SUBL_EVAL_METHOD_ = SubLObjectFactory.makeSymbol("*SUBL-EVAL-METHOD*");
        $sym20$EVAL = SubLObjectFactory.makeSymbol("EVAL");
        $sym21$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list22 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*%EVALUATOR-METHOD*", "SUBLISP"), (SubLObject)SubLObjectFactory.makeSymbol("*SUBL-EVAL-METHOD*")));
        $list23 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*EVAL-IN-API-ENV*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE-EVAL-IN-API-ENV"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*EVAL-IN-API-TRACED-FNS*"), (SubLObject)eval_in_api.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*EVAL-IN-API-TRACE-LOG*"), (SubLObject)SubLObjectFactory.makeString("")));
        $sym24$INITIALIZE_EVAL_IN_API_ENV = SubLObjectFactory.makeSymbol("INITIALIZE-EVAL-IN-API-ENV");
        $sym25$WITH_EVAL_IN_API_ENVIRONMENT = SubLObjectFactory.makeSymbol("WITH-EVAL-IN-API-ENVIRONMENT");
        $sym26$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $sym27$SYMBOLP = SubLObjectFactory.makeSymbol("SYMBOLP");
        $sym28$VALID_API_OPERATOR_P = SubLObjectFactory.makeSymbol("VALID-API-OPERATOR-P");
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"));
        $str30$_return_boolean_T_if_APPLY_or_FUN = SubLObjectFactory.makeString("@return boolean T if APPLY or FUNCALL of that OPERATOR or use\nas a MACRO would success in the most restricted version of the API");
        $list31 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("SYMBOLP")));
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $sym33$VALID_API_FUNCTION_P = SubLObjectFactory.makeSymbol("VALID-API-FUNCTION-P");
        $str34$_return_boolean_T_if_APPLY_or_FUN = SubLObjectFactory.makeString("@return boolean T if APPLY or FUNCALL of that OPERATOR\nwould succeed in the most restricted version of the API. \n@note does NOT check API-SPECIAL-P");
        $sym35$VALID_API_MACRO_P = SubLObjectFactory.makeSymbol("VALID-API-MACRO-P");
        $str36$_return_boolean_T_iff_macro_expan = SubLObjectFactory.makeString("@return boolean T iff macro expansion of that OPERATOR\nwould succeed in the most restricted version of the API. \n@note does NOT check API-SPECIAL-P");
        $kw37$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw38$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw39$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw40$KB = SubLObjectFactory.makeKeyword("KB");
        $kw41$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw42$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list43 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALID-API-OPERATOR-P")), (SubLObject)eval_in_api.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-ALL-MTS")), (SubLObject)eval_in_api.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+")), (SubLObject)eval_in_api.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND")), (SubLObject)eval_in_api.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH")), (SubLObject)eval_in_api.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION-FIND-IF")), (SubLObject)eval_in_api.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOL-PACKAGE")), (SubLObject)eval_in_api.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EVAL-IN-API-INTERNAL")), (SubLObject)eval_in_api.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-EVAL-IN-API-ENV")), (SubLObject)eval_in_api.NIL) });
        $list44 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"));
        $str45$Operator__S_was_not_a_symbol = SubLObjectFactory.makeString("Operator ~S was not a symbol");
        $str46$Operator__S_is_not_defined_in_the = SubLObjectFactory.makeString("Operator ~S is not defined in the API");
        $str47$Variable__S_is_unbound = SubLObjectFactory.makeString("Variable ~S is unbound");
        $str48$API_ERROR = SubLObjectFactory.makeString("API ERROR");
        $str49$Attempt_to_obtain_the_value_of_sy = SubLObjectFactory.makeString("Attempt to obtain the value of symbol ~S which is unbound");
        $list50 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION-RESULTS"));
        $sym51$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym52$FUNCTION_RESULTS = SubLObjectFactory.makeSymbol("FUNCTION-RESULTS");
        $sym53$MULTIPLE_VALUE_LIST = SubLObjectFactory.makeSymbol("MULTIPLE-VALUE-LIST");
        $sym54$EVAL_IN_API_UPDATE_ENV = SubLObjectFactory.makeSymbol("EVAL-IN-API-UPDATE-ENV");
        $sym55$VALUES_LIST = SubLObjectFactory.makeSymbol("VALUES-LIST");
        $list56 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MACRO-RESULT"));
        $sym57$MACRO_RESULT = SubLObjectFactory.makeSymbol("MACRO-RESULT");
        $sym58$MACROEXPAND_1 = SubLObjectFactory.makeSymbol("MACROEXPAND-1");
        $kw59$EVAL_IN_API_RET = SubLObjectFactory.makeKeyword("EVAL-IN-API-RET");
        $sym60$WITH_EVAL_IN_API_ENV_INT = SubLObjectFactory.makeSymbol("WITH-EVAL-IN-API-ENV-INT");
        $list61 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BODY-RESULTS"));
        $sym62$BODY_RESULTS = SubLObjectFactory.makeSymbol("BODY-RESULTS");
        $sym63$EVAL_IN_API_PROGN_BODY = SubLObjectFactory.makeSymbol("EVAL-IN-API-PROGN-BODY");
        $str64$with_eval_in_api_env_int = SubLObjectFactory.makeString("with-eval-in-api-env-int");
        $sym65$VERIFY_IN_API = SubLObjectFactory.makeSymbol("VERIFY-IN-API");
        $str66$don_t_know_how_to_handle_special_ = SubLObjectFactory.makeString("don't know how to handle special ~A");
        $list67 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)eval_in_api.ONE_INTEGER, (SubLObject)eval_in_api.ONE_INTEGER))))), (SubLObject)eval_in_api.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFINE"), (SubLObject)SubLObjectFactory.makeSymbol("FOO"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FOO")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)SubLObjectFactory.makeSymbol("FOO"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FOO"), (SubLObject)eval_in_api.ONE_INTEGER))))), (SubLObject)eval_in_api.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFINE-PUBLIC"), (SubLObject)SubLObjectFactory.makeSymbol("FIBONACCI"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("N")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIB")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("FIB"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIBONACCI"), (SubLObject)SubLObjectFactory.makeSymbol("N"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("FIB"))))), (SubLObject)eval_in_api.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)eval_in_api.NIL, (SubLObject)eval_in_api.T, (SubLObject)eval_in_api.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)eval_in_api.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)eval_in_api.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)eval_in_api.NIL))), (SubLObject)ConsesLow.list((SubLObject)eval_in_api.T, (SubLObject)SubLObjectFactory.makeSymbol("*THE-CYCLIST*")))), (SubLObject)eval_in_api.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFVAR"), (SubLObject)SubLObjectFactory.makeSymbol("*FOO*"), (SubLObject)eval_in_api.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFMACRO"), (SubLObject)SubLObjectFactory.makeSymbol("WITH-FOO"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BAR"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*FOO*"), (SubLObject)SubLObjectFactory.makeSymbol("BAR"))), (SubLObject)SubLObjectFactory.makeSymbol("BODY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFINE"), (SubLObject)SubLObjectFactory.makeSymbol("DO-FOO"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BAR"), (SubLObject)SubLObjectFactory.makeSymbol("BAZ")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-FOO"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BAR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FOO"), (SubLObject)SubLObjectFactory.makeSymbol("BAR")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFINE"), (SubLObject)SubLObjectFactory.makeSymbol("FOO"), (SubLObject)eval_in_api.NIL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)eval_in_api.NIL)))), (SubLObject)eval_in_api.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("FBOUNDP"))), (SubLObject)eval_in_api.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MULTIPLE-VALUE-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUES"), (SubLObject)eval_in_api.ONE_INTEGER, (SubLObject)eval_in_api.TWO_INTEGER, (SubLObject)eval_in_api.THREE_INTEGER))), (SubLObject)eval_in_api.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOTIMES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)eval_in_api.FIVE_INTEGER, (SubLObject)eval_in_api.ONE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINT"), (SubLObject)SubLObjectFactory.makeString("a")))), (SubLObject)eval_in_api.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEC"), (SubLObject)SubLObjectFactory.makeSymbol("MIN"), (SubLObject)SubLObjectFactory.makeSymbol("HOUR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-DECODED-TIME")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)eval_in_api.T, (SubLObject)SubLObjectFactory.makeString("~A:~A"), (SubLObject)SubLObjectFactory.makeSymbol("HOUR"), (SubLObject)SubLObjectFactory.makeSymbol("MIN")))), (SubLObject)eval_in_api.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)eval_in_api.ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHILE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("<"), (SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)eval_in_api.TEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CINC"), (SubLObject)SubLObjectFactory.makeSymbol("N")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINT"), (SubLObject)SubLObjectFactory.makeString("a"))))), (SubLObject)eval_in_api.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDO"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("X"), (SubLObject)eval_in_api.ZERO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)eval_in_api.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("X"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("Y"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)eval_in_api.ZERO_INTEGER, (SubLObject)eval_in_api.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)SubLObjectFactory.makeSymbol("Y"), (SubLObject)eval_in_api.TWO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("Z"), (SubLObject)SubLObjectFactory.makeInteger(-10), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("-"), (SubLObject)SubLObjectFactory.makeSymbol("Z"), (SubLObject)eval_in_api.ONE_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">"), (SubLObject)SubLObjectFactory.makeSymbol("X"), (SubLObject)eval_in_api.THREE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)eval_in_api.T, (SubLObject)SubLObjectFactory.makeString("~%x=~S y=~S z=~S"), (SubLObject)SubLObjectFactory.makeSymbol("X"), (SubLObject)SubLObjectFactory.makeSymbol("Y"), (SubLObject)SubLObjectFactory.makeSymbol("Z")))), (SubLObject)eval_in_api.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FOO")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CCATCH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-KEYWORD"), (SubLObject)SubLObjectFactory.makeString("a")), (SubLObject)SubLObjectFactory.makeSymbol("FOO"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("THROW"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-KEYWORD"), (SubLObject)SubLObjectFactory.makeString("a")), (SubLObject)SubLObjectFactory.makeString("b"))), (SubLObject)SubLObjectFactory.makeSymbol("FOO"))), (SubLObject)eval_in_api.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-CONSTANTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("C")))), (SubLObject)eval_in_api.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-NARTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("N")))), (SubLObject)eval_in_api.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-FORTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("F")))), (SubLObject)eval_in_api.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-ASSERTIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("A")))), (SubLObject)eval_in_api.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-DEDUCTIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("D")))), (SubLObject)eval_in_api.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-INFERENCE-MT-RELEVANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DUMMY-MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-GAF-ARG-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("A"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DUMMY-TERM")), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DUMMY-PRED")), (SubLObject)SubLObjectFactory.makeKeyword("INDEX"), (SubLObject)eval_in_api.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINT"), (SubLObject)SubLObjectFactory.makeSymbol("A"))))), (SubLObject)eval_in_api.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-ALL-MTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-GAF-ARG-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("A"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DUMMY-TERM")), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DUMMY-PRED")), (SubLObject)SubLObjectFactory.makeKeyword("INDEX"), (SubLObject)eval_in_api.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINT"), (SubLObject)SubLObjectFactory.makeSymbol("A"))))), (SubLObject)eval_in_api.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFINE-EVALUATION-DEFN"), (SubLObject)SubLObjectFactory.makeSymbol("TEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("THROW-UNEVALUATABLE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")))), (SubLObject)eval_in_api.NIL) });
        $list68 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION"));
        $sym69$RET = SubLObjectFactory.makeSymbol("RET");
        $sym70$API_SPECIAL_RET = SubLObjectFactory.makeSymbol("API-SPECIAL-RET");
        $sym71$API_SPECIAL_RET_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-RET-VERIFY");
        $sym72$LAMBDA = SubLObjectFactory.makeSymbol("LAMBDA");
        $sym73$DEFINE = SubLObjectFactory.makeSymbol("DEFINE");
        $sym74$API_SPECIAL_DEFINE = SubLObjectFactory.makeSymbol("API-SPECIAL-DEFINE");
        $sym75$API_SPECIAL_DEFINE_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-DEFINE-VERIFY");
        $sym76$DEFINE_PUBLIC = SubLObjectFactory.makeSymbol("DEFINE-PUBLIC");
        $sym77$API_SPECIAL_DEFINE_PUBLIC = SubLObjectFactory.makeSymbol("API-SPECIAL-DEFINE-PUBLIC");
        $sym78$API_SPECIAL_DEFINE_PUBLIC_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-DEFINE-PUBLIC-VERIFY");
        $sym79$DEFINE_PROTECTED = SubLObjectFactory.makeSymbol("DEFINE-PROTECTED");
        $sym80$API_SPECIAL_DEFINE_PROTECTED = SubLObjectFactory.makeSymbol("API-SPECIAL-DEFINE-PROTECTED");
        $sym81$API_SPECIAL_DEFINE_PROTECTED_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-DEFINE-PROTECTED-VERIFY");
        $sym82$API_SPECIAL_DEFINE_PRIVATE = SubLObjectFactory.makeSymbol("API-SPECIAL-DEFINE-PRIVATE");
        $sym83$API_SPECIAL_DEFINE_PRIVATE_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-DEFINE-PRIVATE-VERIFY");
        $sym84$FORM = SubLObjectFactory.makeUninternedSymbol("FORM");
        $sym85$DEFMACRO = SubLObjectFactory.makeSymbol("DEFMACRO");
        $sym86$API_SPECIAL_DEFMACRO = SubLObjectFactory.makeSymbol("API-SPECIAL-DEFMACRO");
        $sym87$API_SPECIAL_DEFMACRO_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-DEFMACRO-VERIFY");
        $sym88$FORM = SubLObjectFactory.makeUninternedSymbol("FORM");
        $sym89$DEFMACRO_PUBLIC = SubLObjectFactory.makeSymbol("DEFMACRO-PUBLIC");
        $sym90$API_SPECIAL_DEFMACRO_PUBLIC = SubLObjectFactory.makeSymbol("API-SPECIAL-DEFMACRO-PUBLIC");
        $sym91$API_SPECIAL_DEFMACRO_PUBLIC_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-DEFMACRO-PUBLIC-VERIFY");
        $sym92$FORM = SubLObjectFactory.makeUninternedSymbol("FORM");
        $sym93$DEFMACRO_PROTECTED = SubLObjectFactory.makeSymbol("DEFMACRO-PROTECTED");
        $sym94$API_SPECIAL_DEFMACRO_PROTECTED = SubLObjectFactory.makeSymbol("API-SPECIAL-DEFMACRO-PROTECTED");
        $sym95$API_SPECIAL_DEFMACRO_PROTECTED_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-DEFMACRO-PROTECTED-VERIFY");
        $list96 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("SLOTS"));
        $sym97$DEFSTRUCT = SubLObjectFactory.makeSymbol("DEFSTRUCT");
        $sym98$API_SPECIAL_DEFSTRUCT = SubLObjectFactory.makeSymbol("API-SPECIAL-DEFSTRUCT");
        $list99 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("SLOTS")));
        $sym100$API_SPECIAL_DEFSTRUCT_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-DEFSTRUCT-VERIFY");
        $sym101$DEFSTRUCT_VECTOR = SubLObjectFactory.makeSymbol("DEFSTRUCT-VECTOR");
        $list102 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOL"));
        $sym103$FI_GET_PARAMETER = SubLObjectFactory.makeSymbol("FI-GET-PARAMETER");
        $sym104$API_SPECIAL_FI_GET_PARAMETER = SubLObjectFactory.makeSymbol("API-SPECIAL-FI-GET-PARAMETER");
        $sym105$API_SPECIAL_FI_GET_PARAMETER_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-FI-GET-PARAMETER-VERIFY");
        $list106 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOL"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $sym107$DEFVAR = SubLObjectFactory.makeSymbol("DEFVAR");
        $sym108$API_SPECIAL_DEFVAR = SubLObjectFactory.makeSymbol("API-SPECIAL-DEFVAR");
        $sym109$API_SPECIAL_DEFVAR_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-DEFVAR-VERIFY");
        $sym110$DEFVAR_PRIVATE = SubLObjectFactory.makeSymbol("DEFVAR-PRIVATE");
        $sym111$API_SPECIAL_DEFVAR_PRIVATE = SubLObjectFactory.makeSymbol("API-SPECIAL-DEFVAR-PRIVATE");
        $sym112$API_SPECIAL_DEFVAR_PRIVATE_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-DEFVAR-PRIVATE-VERIFY");
        $sym113$CLEAR_API_USER_VARIABLES = SubLObjectFactory.makeSymbol("CLEAR-API-USER-VARIABLES");
        $str114$Removes_all_user_variables_ = SubLObjectFactory.makeString("Removes all user variables.");
        $list115 = ConsesLow.list((SubLObject)eval_in_api.NIL);
        $sym116$PUT_API_USER_VARIABLE = SubLObjectFactory.makeSymbol("PUT-API-USER-VARIABLE");
        $list117 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $str118$Sets_the_value_of_a_the_user_vari = SubLObjectFactory.makeString("Sets the value of a the user variable VAR to the given VALUE.");
        $sym119$GET_API_USER_VARIABLE = SubLObjectFactory.makeSymbol("GET-API-USER-VARIABLE");
        $list120 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"));
        $str121$Gets_the_value_of_a_the_user_vari = SubLObjectFactory.makeString("Gets the value of a the user variable VAR.");
        $sym122$FI_SET_PARAMETER = SubLObjectFactory.makeSymbol("FI-SET-PARAMETER");
        $sym123$API_SPECIAL_FI_SET_PARAMETER = SubLObjectFactory.makeSymbol("API-SPECIAL-FI-SET-PARAMETER");
        $sym124$API_SPECIAL_FI_SET_PARAMETER_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-FI-SET-PARAMETER-VERIFY");
        $list125 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("VAR-VALUE-PAIRS"));
        $sym126$API_SPECIAL_CSETQ = SubLObjectFactory.makeSymbol("API-SPECIAL-CSETQ");
        $sym127$API_SPECIAL_CSETQ_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-CSETQ-VERIFY");
        $str128$_S_is_not_a_symbol = SubLObjectFactory.makeString("~S is not a symbol");
        $str129$_S_is_not_defined = SubLObjectFactory.makeString("~S is not defined");
        $list130 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("X"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DELTA"), (SubLObject)eval_in_api.ONE_INTEGER));
        $str131$_S_is_not_an_api_variable = SubLObjectFactory.makeString("~S is not an api variable");
        $sym132$CINC = SubLObjectFactory.makeSymbol("CINC");
        $sym133$API_SPECIAL_CINC = SubLObjectFactory.makeSymbol("API-SPECIAL-CINC");
        $sym134$API_SPECIAL_CINC_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-CINC-VERIFY");
        $sym135$CDEC = SubLObjectFactory.makeSymbol("CDEC");
        $sym136$API_SPECIAL_CDEC = SubLObjectFactory.makeSymbol("API-SPECIAL-CDEC");
        $sym137$API_SPECIAL_CDEC_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-CDEC-VERIFY");
        $list138 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITEM"), (SubLObject)SubLObjectFactory.makeSymbol("PLACE"));
        $sym139$CPUSH = SubLObjectFactory.makeSymbol("CPUSH");
        $sym140$API_SPECIAL_CPUSH = SubLObjectFactory.makeSymbol("API-SPECIAL-CPUSH");
        $sym141$API_SPECIAL_CPUSH_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-CPUSH-VERIFY");
        $list142 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLACE"));
        $sym143$CPOP = SubLObjectFactory.makeSymbol("CPOP");
        $sym144$API_SPECIAL_CPOP = SubLObjectFactory.makeSymbol("API-SPECIAL-CPOP");
        $sym145$API_SPECIAL_CPOP_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-CPOP-VERIFY");
        $list146 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORM"));
        $sym147$API_SPECIAL_EVAL = SubLObjectFactory.makeSymbol("API-SPECIAL-EVAL");
        $sym148$EVAL_IN_API = SubLObjectFactory.makeSymbol("EVAL-IN-API");
        $sym149$API_SPECIAL_EVAL_IN_API_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-EVAL-IN-API-VERIFY");
        $sym150$FI_EVAL = SubLObjectFactory.makeSymbol("FI-EVAL");
        $sym151$API_SPECIAL_FI_EVAL = SubLObjectFactory.makeSymbol("API-SPECIAL-FI-EVAL");
        $sym152$API_SPECIAL_FI_EVAL_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-FI-EVAL-VERIFY");
        $sym153$FI_LOCAL_EVAL = SubLObjectFactory.makeSymbol("FI-LOCAL-EVAL");
        $sym154$API_SPECIAL_FI_LOCAL_EVAL = SubLObjectFactory.makeSymbol("API-SPECIAL-FI-LOCAL-EVAL");
        $sym155$API_SPECIAL_FI_LOCAL_EVAL_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-FI-LOCAL-EVAL-VERIFY");
        $list156 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("ARGUMENT"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGUMENTS"));
        $sym157$APPLY = SubLObjectFactory.makeSymbol("APPLY");
        $sym158$API_SPECIAL_APPLY = SubLObjectFactory.makeSymbol("API-SPECIAL-APPLY");
        $sym159$API_SPECIAL_APPLY_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-APPLY-VERIFY");
        $list160 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"));
        $sym161$FBOUNDP = SubLObjectFactory.makeSymbol("FBOUNDP");
        $sym162$API_SPECIAL_FBOUNDP = SubLObjectFactory.makeSymbol("API-SPECIAL-FBOUNDP");
        $sym163$API_SPECIAL_FBOUNDP_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-FBOUNDP-VERIFY");
        $list164 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGUMENTS"));
        $sym165$FUNCALL = SubLObjectFactory.makeSymbol("FUNCALL");
        $sym166$API_SPECIAL_FUNCALL = SubLObjectFactory.makeSymbol("API-SPECIAL-FUNCALL");
        $sym167$API_SPECIAL_FUNCALL_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-FUNCALL-VERIFY");
        $sym168$API_SPECIAL_MULTIPLE_VALUE_LIST = SubLObjectFactory.makeSymbol("API-SPECIAL-MULTIPLE-VALUE-LIST");
        $sym169$API_SPECIAL_MULTIPLE_VALUE_LIST_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-MULTIPLE-VALUE-LIST-VERIFY");
        $sym170$TRACE = SubLObjectFactory.makeSymbol("TRACE");
        $sym171$API_SPECIAL_TRACE = SubLObjectFactory.makeSymbol("API-SPECIAL-TRACE");
        $sym172$API_SPECIAL_TRACE_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-TRACE-VERIFY");
        $sym173$UNTRACE = SubLObjectFactory.makeSymbol("UNTRACE");
        $sym174$API_SPECIAL_UNTRACE = SubLObjectFactory.makeSymbol("API-SPECIAL-UNTRACE");
        $sym175$API_SPECIAL_UNTRACE_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-UNTRACE-VERIFY");
        $str176$__ = SubLObjectFactory.makeString("~%");
        $str177$_A_D___S__ = SubLObjectFactory.makeString("~A~D: ~S~%");
        $str178$ = SubLObjectFactory.makeString("");
        $str179$_S_ = SubLObjectFactory.makeString("~S ");
        $str180$_A_D__returned__A__ = SubLObjectFactory.makeString("~A~D: returned ~A~%");
        $sym181$GET_TRACE_LOG = SubLObjectFactory.makeSymbol("GET-TRACE-LOG");
        $sym182$API_SPECIAL_GET_TRACE_LOG = SubLObjectFactory.makeSymbol("API-SPECIAL-GET-TRACE-LOG");
        $sym183$API_SPECIAL_GET_TRACE_LOG_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-GET-TRACE-LOG-VERIFY");
        $sym184$CLEAR_TRACE_LOG = SubLObjectFactory.makeSymbol("CLEAR-TRACE-LOG");
        $sym185$API_SPECIAL_CLEAR_TRACE_LOG = SubLObjectFactory.makeSymbol("API-SPECIAL-CLEAR-TRACE-LOG");
        $sym186$API_SPECIAL_CLEAR_TRACE_LOG_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-CLEAR-TRACE-LOG-VERIFY");
        $sym187$NUMBERP = SubLObjectFactory.makeSymbol("NUMBERP");
        $sym188$API_SPECIAL_PROGN = SubLObjectFactory.makeSymbol("API-SPECIAL-PROGN");
        $sym189$API_SPECIAL_PROGN_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-PROGN-VERIFY");
        $list190 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym191$API_SPECIAL_CLET = SubLObjectFactory.makeSymbol("API-SPECIAL-CLET");
        $str192$clet_error = SubLObjectFactory.makeString("clet error");
        $sym193$API_SPECIAL_CLET_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-CLET-VERIFY");
        $list194 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BINDING"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("REST-BINDINGS"));
        $list195 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARS"), (SubLObject)SubLObjectFactory.makeSymbol("VALUES-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym196$CMULTIPLE_VALUE_BIND = SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND");
        $sym197$API_SPECIAL_CMULTIPLE_VALUE_BIND = SubLObjectFactory.makeSymbol("API-SPECIAL-CMULTIPLE-VALUE-BIND");
        $sym198$API_SPECIAL_CMULTIPLE_VALUE_BIND_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-CMULTIPLE-VALUE-BIND-VERIFY");
        $sym199$CAND = SubLObjectFactory.makeSymbol("CAND");
        $sym200$API_SPECIAL_CAND = SubLObjectFactory.makeSymbol("API-SPECIAL-CAND");
        $sym201$API_SPECIAL_CAND_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-CAND-VERIFY");
        $sym202$COR = SubLObjectFactory.makeSymbol("COR");
        $sym203$API_SPECIAL_COR = SubLObjectFactory.makeSymbol("API-SPECIAL-COR");
        $sym204$API_SPECIAL_COR_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-COR-VERIFY");
        $sym205$CNOT = SubLObjectFactory.makeSymbol("CNOT");
        $sym206$API_SPECIAL_CNOT = SubLObjectFactory.makeSymbol("API-SPECIAL-CNOT");
        $sym207$API_SPECIAL_CNOT_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-CNOT-VERIFY");
        $list208 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONDITION"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym209$PCOND = SubLObjectFactory.makeSymbol("PCOND");
        $sym210$API_SPECIAL_PCOND = SubLObjectFactory.makeSymbol("API-SPECIAL-PCOND");
        $sym211$API_SPECIAL_PCOND_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-PCOND-VERIFY");
        $list212 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONDITION"), (SubLObject)SubLObjectFactory.makeSymbol("ACTION"), (SubLObject)SubLObjectFactory.makeSymbol("ELSE-ACTION"));
        $sym213$PIF = SubLObjectFactory.makeSymbol("PIF");
        $sym214$API_SPECIAL_PIF = SubLObjectFactory.makeSymbol("API-SPECIAL-PIF");
        $sym215$API_SPECIAL_PIF_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-PIF-VERIFY");
        $sym216$FIF = SubLObjectFactory.makeSymbol("FIF");
        $sym217$API_SPECIAL_FIF = SubLObjectFactory.makeSymbol("API-SPECIAL-FIF");
        $sym218$API_SPECIAL_FIF_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-FIF-VERIFY");
        $sym219$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym220$API_SPECIAL_PWHEN = SubLObjectFactory.makeSymbol("API-SPECIAL-PWHEN");
        $sym221$API_SPECIAL_PWHEN_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-PWHEN-VERIFY");
        $list222 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONDITION"), (SubLObject)SubLObjectFactory.makeSymbol("ACTION"));
        $sym223$WHEN = SubLObjectFactory.makeSymbol("WHEN");
        $sym224$API_SPECIAL_WHEN = SubLObjectFactory.makeSymbol("API-SPECIAL-WHEN");
        $sym225$API_SPECIAL_WHEN_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-WHEN-VERIFY");
        $sym226$FWHEN = SubLObjectFactory.makeSymbol("FWHEN");
        $sym227$API_SPECIAL_FWHEN = SubLObjectFactory.makeSymbol("API-SPECIAL-FWHEN");
        $sym228$API_SPECIAL_FWHEN_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-FWHEN-VERIFY");
        $sym229$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $sym230$API_SPECIAL_PUNLESS = SubLObjectFactory.makeSymbol("API-SPECIAL-PUNLESS");
        $sym231$API_SPECIAL_PUNLESS_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-PUNLESS-VERIFY");
        $sym232$FUNLESS = SubLObjectFactory.makeSymbol("FUNLESS");
        $sym233$API_SPECIAL_FUNLESS = SubLObjectFactory.makeSymbol("API-SPECIAL-FUNLESS");
        $sym234$API_SPECIAL_FUNLESS_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-FUNLESS-VERIFY");
        $sym235$WHILE = SubLObjectFactory.makeSymbol("WHILE");
        $sym236$API_SPECIAL_WHILE = SubLObjectFactory.makeSymbol("API-SPECIAL-WHILE");
        $sym237$API_SPECIAL_WHILE_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-WHILE-VERIFY");
        $sym238$UNTIL = SubLObjectFactory.makeSymbol("UNTIL");
        $sym239$API_SPECIAL_UNTIL = SubLObjectFactory.makeSymbol("API-SPECIAL-UNTIL");
        $sym240$API_SPECIAL_UNTIL_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-UNTIL-VERIFY");
        $list241 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARS"), (SubLObject)SubLObjectFactory.makeSymbol("ENDTEST"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $str242$_S_is_not_a_valid_cdo_variable_sp = SubLObjectFactory.makeString("~S is not a valid cdo variable specification in SubL");
        $sym243$CDO = SubLObjectFactory.makeSymbol("CDO");
        $sym244$API_SPECIAL_CDO = SubLObjectFactory.makeSymbol("API-SPECIAL-CDO");
        $sym245$API_SPECIAL_CDO_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-CDO-VERIFY");
        $list246 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("LISTFORM")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym247$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $sym248$API_SPECIAL_CDOLIST = SubLObjectFactory.makeSymbol("API-SPECIAL-CDOLIST");
        $sym249$API_SPECIAL_CDOLIST_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-CDOLIST-VERIFY");
        $list250 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGER")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym251$CDOTIMES = SubLObjectFactory.makeSymbol("CDOTIMES");
        $sym252$API_SPECIAL_CDOTIMES = SubLObjectFactory.makeSymbol("API-SPECIAL-CDOTIMES");
        $sym253$API_SPECIAL_CDOTIMES_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-CDOTIMES-VERIFY");
        $list254 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VAL"), (SubLObject)SubLObjectFactory.makeSymbol("TABLE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym255$CDOHASH = SubLObjectFactory.makeSymbol("CDOHASH");
        $sym256$API_SPECIAL_CDOHASH = SubLObjectFactory.makeSymbol("API-SPECIAL-CDOHASH");
        $sym257$API_SPECIAL_CDOHASH_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-CDOHASH-VERIFY");
        $list258 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("LISTS"));
        $sym259$MAPCAR = SubLObjectFactory.makeSymbol("MAPCAR");
        $sym260$API_SPECIAL_MAPCAR = SubLObjectFactory.makeSymbol("API-SPECIAL-MAPCAR");
        $sym261$API_SPECIAL_MAPCAR_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-MAPCAR-VERIFY");
        $str262$_S_does_not_evaluate_to_an_api_fu = SubLObjectFactory.makeString("~S does not evaluate to an api function object");
        $sym263$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym264$EVAL_IN_API_MAPCAR = SubLObjectFactory.makeSymbol("EVAL-IN-API-MAPCAR");
        $sym265$REST = SubLObjectFactory.makeSymbol("REST");
        $list266 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICT"), (SubLObject)SubLObjectFactory.makeSymbol("FUNC"));
        $sym267$MAPDICTIONARY = SubLObjectFactory.makeSymbol("MAPDICTIONARY");
        $sym268$API_SPECIAL_MAPDICTIONARY = SubLObjectFactory.makeSymbol("API-SPECIAL-MAPDICTIONARY");
        $sym269$API_SPECIAL_MAPDICTIONARY_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-MAPDICTIONARY-VERIFY");
        $kw270$ALIST = SubLObjectFactory.makeKeyword("ALIST");
        $kw271$HASHTABLE = SubLObjectFactory.makeKeyword("HASHTABLE");
        $str272$Corrupted_dictionary__unsupported = SubLObjectFactory.makeString("Corrupted dictionary; unsupported style ~S.~%");
        $list273 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICT"), (SubLObject)SubLObjectFactory.makeSymbol("FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"));
        $sym274$MAPDICTIONARY_PARAMETERIZED = SubLObjectFactory.makeSymbol("MAPDICTIONARY-PARAMETERIZED");
        $sym275$API_SPECIAL_MAPDICTIONARY_PARAMETERIZED = SubLObjectFactory.makeSymbol("API-SPECIAL-MAPDICTIONARY-PARAMETERIZED");
        $sym276$API_SPECIAL_MAPDICTIONARY_PARAMETERIZED_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-MAPDICTIONARY-PARAMETERIZED-VERIFY");
        $str277$evaluated_dict = SubLObjectFactory.makeString("evaluated-dict");
        $str278$evaluated_func = SubLObjectFactory.makeString("evaluated-func");
        $str279$evaluated_args = SubLObjectFactory.makeString("evaluated-args");
        $list280 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TAG"), (SubLObject)SubLObjectFactory.makeSymbol("ANS-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym281$CCATCH = SubLObjectFactory.makeSymbol("CCATCH");
        $sym282$API_SPECIAL_CCATCH = SubLObjectFactory.makeSymbol("API-SPECIAL-CCATCH");
        $sym283$API_SPECIAL_CCATCH_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-CCATCH-VERIFY");
        $list284 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWER-VARIABLE"));
        $sym285$ANSWER_VARIABLE = SubLObjectFactory.makeSymbol("ANSWER-VARIABLE");
        $sym286$EVAL_IN_API_CSETQ = SubLObjectFactory.makeSymbol("EVAL-IN-API-CSETQ");
        $list287 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TAG"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"));
        $sym288$THROW = SubLObjectFactory.makeSymbol("THROW");
        $sym289$API_SPECIAL_THROW = SubLObjectFactory.makeSymbol("API-SPECIAL-THROW");
        $sym290$API_SPECIAL_THROW_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-THROW-VERIFY");
        $sym291$EVAL_IN_API_INTERNAL = SubLObjectFactory.makeSymbol("EVAL-IN-API-INTERNAL");
        $sym292$IGNORE_ERRORS = SubLObjectFactory.makeSymbol("IGNORE-ERRORS");
        $sym293$API_SPECIAL_IGNORE_ERRORS = SubLObjectFactory.makeSymbol("API-SPECIAL-IGNORE-ERRORS");
        $sym294$API_SPECIAL_IGNORE_ERRORS_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-IGNORE-ERRORS-VERIFY");
        $list295 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCAL-RESULTS"));
        $sym296$LOCAL_RESULTS = SubLObjectFactory.makeSymbol("LOCAL-RESULTS");
        $list297 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROTECTED-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym298$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $sym299$API_SPECIAL_CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("API-SPECIAL-CUNWIND-PROTECT");
        $sym300$API_SPECIAL_CUNWIND_PROTECT_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-CUNWIND-PROTECT-VERIFY");
        $sym301$_ = SubLObjectFactory.makeSymbol(">");
        $list302 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("*EVAL-IN-API-ENV*"));
        $list303 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPOP"), (SubLObject)SubLObjectFactory.makeSymbol("*EVAL-IN-API-ENV*")));
        $str304$eval_in_api_cunwind_protect = SubLObjectFactory.makeString("eval-in-api-cunwind-protect");
        $list305 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FILENAME"));
        $sym306$LOAD = SubLObjectFactory.makeSymbol("LOAD");
        $sym307$API_SPECIAL_LOAD = SubLObjectFactory.makeSymbol("API-SPECIAL-LOAD");
        $sym308$API_SPECIAL_LOAD_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-LOAD-VERIFY");
        $sym309$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw310$DIRECTION = SubLObjectFactory.makeKeyword("DIRECTION");
        $kw311$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $kw312$IF_DOES_NOT_EXIST = SubLObjectFactory.makeKeyword("IF-DOES-NOT-EXIST");
        $str313$_S_does_not_exist__cannot_load = SubLObjectFactory.makeString("~S does not exist, cannot load");
        $kw314$EOF = SubLObjectFactory.makeKeyword("EOF");
        $kw315$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str316$__Read_error_occured_at_position_ = SubLObjectFactory.makeString("~%Read error occured at position ~A of file ~A");
        $list317 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"));
        $str318$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym319$CHECK_TYPE = SubLObjectFactory.makeSymbol("CHECK-TYPE");
        $sym320$API_SPECIAL_CHECK_TYPE = SubLObjectFactory.makeSymbol("API-SPECIAL-CHECK-TYPE");
        $sym321$API_SPECIAL_CHECK_TYPE_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-CHECK-TYPE-VERIFY");
        $sym322$API_SPECIAL_QUOTE = SubLObjectFactory.makeSymbol("API-SPECIAL-QUOTE");
        $sym323$API_SPECIAL_QUOTE_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-QUOTE-VERIFY");
        $sym324$BOUNDP = SubLObjectFactory.makeSymbol("BOUNDP");
        $sym325$API_SPECIAL_BOUNDP = SubLObjectFactory.makeSymbol("API-SPECIAL-BOUNDP");
        $sym326$API_SPECIAL_BOUNDP_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-BOUNDP-VERIFY");
        $sym327$SYMBOL_VALUE = SubLObjectFactory.makeSymbol("SYMBOL-VALUE");
        $sym328$API_SPECIAL_SYMBOL_VALUE = SubLObjectFactory.makeSymbol("API-SPECIAL-SYMBOL-VALUE");
        $sym329$API_SPECIAL_SYMBOL_VALUE_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-SYMBOL-VALUE-VERIFY");
        $list330 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FNAME"));
        $sym331$FUNCTION = SubLObjectFactory.makeSymbol("FUNCTION");
        $sym332$API_SPECIAL_FUNCTION = SubLObjectFactory.makeSymbol("API-SPECIAL-FUNCTION");
        $sym333$API_SPECIAL_FUNCTION_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-FUNCTION-VERIFY");
        $list334 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGUMENTS"));
        $sym335$ERROR = SubLObjectFactory.makeSymbol("ERROR");
        $sym336$API_SPECIAL_ERROR = SubLObjectFactory.makeSymbol("API-SPECIAL-ERROR");
        $sym337$API_SPECIAL_ERROR_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-ERROR-VERIFY");
        $str338$___S = SubLObjectFactory.makeString("~%~S");
        $sym339$BREAK = SubLObjectFactory.makeSymbol("BREAK");
        $sym340$API_SPECIAL_BREAK = SubLObjectFactory.makeSymbol("API-SPECIAL-BREAK");
        $sym341$API_SPECIAL_BREAK_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-BREAK-VERIFY");
        $str342$Can_only_clear_the_environment_fr = SubLObjectFactory.makeString("Can only clear the environment from the top level");
        $sym343$CLEAR_ENVIRONMENT = SubLObjectFactory.makeSymbol("CLEAR-ENVIRONMENT");
        $sym344$API_SPECIAL_CLEAR_ENVIRONMENT = SubLObjectFactory.makeSymbol("API-SPECIAL-CLEAR-ENVIRONMENT");
        $sym345$API_SPECIAL_CLEAR_ENVIRONMENT_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-CLEAR-ENVIRONMENT-VERIFY");
        $sym346$GET_ENVIRONMENT = SubLObjectFactory.makeSymbol("GET-ENVIRONMENT");
        $sym347$API_SPECIAL_GET_ENVIRONMENT = SubLObjectFactory.makeSymbol("API-SPECIAL-GET-ENVIRONMENT");
        $sym348$API_SPECIAL_GET_ENVIRONMENT_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-GET-ENVIRONMENT-VERIFY");
        $list349 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PACKAGE"));
        $sym350$IN_PACKAGE = SubLObjectFactory.makeSymbol("IN-PACKAGE");
        $sym351$API_SPECIAL_IN_PACKAGE = SubLObjectFactory.makeSymbol("API-SPECIAL-IN-PACKAGE");
        $sym352$API_SPECIAL_IN_PACKAGE_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-IN-PACKAGE-VERIFY");
        $list353 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym354$CTIME = SubLObjectFactory.makeSymbol("CTIME");
        $sym355$API_SPECIAL_CTIME = SubLObjectFactory.makeSymbol("API-SPECIAL-CTIME");
        $sym356$API_SPECIAL_CTIME_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-CTIME-VERIFY");
        $sym357$WITH_TEMP_VARS = SubLObjectFactory.makeSymbol("WITH-TEMP-VARS");
        $list358 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMP-VAR"));
        $sym359$TEMP_VAR = SubLObjectFactory.makeSymbol("TEMP-VAR");
        $sym360$WITH_EVAL_IN_API_ENV = SubLObjectFactory.makeSymbol("WITH-EVAL-IN-API-ENV");
        $str361$eval_in_api_ctime = SubLObjectFactory.makeString("eval-in-api-ctime");
        $list362 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym363$NOTING_PERCENT_PROGRESS = SubLObjectFactory.makeSymbol("NOTING-PERCENT-PROGRESS");
        $sym364$API_SPECIAL_NOTING_PERCENT_PROGRESS = SubLObjectFactory.makeSymbol("API-SPECIAL-NOTING-PERCENT-PROGRESS");
        $sym365$API_SPECIAL_NOTING_PERCENT_PROGRESS_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-NOTING-PERCENT-PROGRESS-VERIFY");
        $str366$eval_in_api_noting_percent_progre = SubLObjectFactory.makeString("eval-in-api-noting-percent-progress");
        $sym367$NOTING_ACTIVITY = SubLObjectFactory.makeSymbol("NOTING-ACTIVITY");
        $sym368$API_SPECIAL_NOTING_ACTIVITY = SubLObjectFactory.makeSymbol("API-SPECIAL-NOTING-ACTIVITY");
        $sym369$API_SPECIAL_NOTING_ACTIVITY_VERIFY = SubLObjectFactory.makeSymbol("API-SPECIAL-NOTING-ACTIVITY-VERIFY");
        $str370$eval_in_api_noting_activity = SubLObjectFactory.makeString("eval-in-api-noting-activity");
        $sym371$MUST = SubLObjectFactory.makeSymbol("MUST");
    }
}

/*

	Total time: 1266 ms
	
*/