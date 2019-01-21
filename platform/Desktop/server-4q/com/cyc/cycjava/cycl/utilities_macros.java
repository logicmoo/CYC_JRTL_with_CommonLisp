package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class utilities_macros extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.utilities_macros";
    public static final String myFingerPrint = "f2ea6b0840aa3e9cc9b291d5da9f9f0a915c749b7e201683ebaea25bb3658a33";
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 5463L)
    private static SubLSymbol $api_special_table$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 6268L)
    public static SubLSymbol $api_predefined_function_table$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 7077L)
    private static SubLSymbol $api_predefined_host_function_table$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 7810L)
    public static SubLSymbol $api_predefined_macro_table$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 8577L)
    private static SubLSymbol $api_predefined_host_macro_table$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 9300L)
    public static SubLSymbol $api_symbols$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 12648L)
    public static SubLSymbol $api_types$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 18349L)
    private static SubLSymbol $kb_function_table$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 21480L)
    private static SubLSymbol $funcall_helper_property$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 21938L)
    public static SubLSymbol $unprovided$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 24213L)
    public static SubLSymbol $cfasl_stream$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 25602L)
    private static SubLSymbol $global_locks$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 26912L)
    public static SubLSymbol $fi_state_variables$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 27365L)
    public static SubLSymbol $html_state_variables$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 28144L)
    public static SubLSymbol $html_interface_variables$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 30965L)
    public static SubLSymbol $gt_state_variables$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 31201L)
    public static SubLSymbol $at_state_variables$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 31429L)
    public static SubLSymbol $defn_state_variables$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 31915L)
    public static SubLSymbol $kbp_state_variables$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 34248L)
    public static SubLSymbol $current_forward_problem_store$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 36259L)
    public static SubLSymbol $tracing_level$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 36889L)
    public static SubLSymbol $structure_resourcing_enabled$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 37146L)
    public static SubLSymbol $structure_resourcing_make_static$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 41853L)
    public static SubLSymbol $progress_last_pacification_time$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 41981L)
    public static SubLSymbol $progress_pacifications_since_last_nl$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 42046L)
    public static SubLSymbol $progress_elapsed_seconds_for_notification$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 42116L)
    public static SubLSymbol $progress_notification_count$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 42172L)
    public static SubLSymbol $progress_count$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 42215L)
    public static SubLSymbol $is_noting_progressP$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 42263L)
    public static SubLSymbol $noting_progress_delayed_mode_seconds$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 42405L)
    public static SubLSymbol $noting_progress_delayed_mode_string$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 42469L)
    public static SubLSymbol $professional_progress_modeP$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 42591L)
    public static SubLSymbol $suppress_all_progress_faster_than_seconds$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 46579L)
    public static SubLSymbol $silent_progressP$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 46774L)
    public static SubLSymbol $noting_progress_start_time$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 46864L)
    public static SubLSymbol $last_percent_progress_index$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 46908L)
    public static SubLSymbol $last_percent_progress_prediction$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 47137L)
    public static SubLSymbol $within_noting_percent_progress$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 47183L)
    public static SubLSymbol $percent_progress_start_time$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 47226L)
    public static SubLSymbol $percent_progress_delayed_mode_seconds$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 47356L)
    public static SubLSymbol $percent_progress_delayed_mode_string$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 55136L)
    public static SubLSymbol $progress_note$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 55256L)
    public static SubLSymbol $progress_start_time$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 55314L)
    public static SubLSymbol $progress_total$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 55348L)
    public static SubLSymbol $progress_sofar$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 62898L)
    private static SubLSymbol $util_var_error_format_string$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 63043L)
    private static SubLSymbol $util_func_error_format_string$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 63138L)
    private static SubLSymbol $util_search_type_error_format_string$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 120008L)
    private static SubLSymbol $process_resource_tracking_100s_of_nanoseconds_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 129068L)
    private static SubLSymbol $kb_var_initializations$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 138599L)
    public static SubLSymbol $partial_results_accumulator$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 138783L)
    public static SubLSymbol $partial_results_size$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 138881L)
    public static SubLSymbol $partial_results_threshold$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 139003L)
    public static SubLSymbol $partial_results_total_size$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 139115L)
    public static SubLSymbol $partial_results_total_accumulator$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 139256L)
    public static SubLSymbol $partial_results_initialization_fn$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 139410L)
    public static SubLSymbol $partial_results_accumulation_fn$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 139579L)
    public static SubLSymbol $partial_results_consolidation_fn$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 139761L)
    public static SubLSymbol $partial_results_notification_fn$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 139923L)
    public static SubLSymbol $partial_results_final_result_fn$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 140945L)
    public static SubLSymbol $accumulating_partial_resultsP$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 145503L)
    public static SubLSymbol $sxhash_bit_limit$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 145690L)
    private static SubLSymbol $sxhash_update_state_vector$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 146355L)
    public static SubLSymbol $sxhash_composite_state$;
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 146470L)
    public static SubLSymbol $sxhash_composite_hash$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$STRINGP;
    private static final SubLSymbol $sym2$LISTP;
    private static final SubLSymbol $sym3$PROGN;
    private static final SubLSymbol $sym4$DEFINE_PUBLIC;
    private static final SubLSymbol $sym5$REGISTER_CYC_API_FUNCTION;
    private static final SubLSymbol $sym6$QUOTE;
    private static final SubLList $list7;
    private static final SubLList $list8;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$DEFMACRO_PUBLIC;
    private static final SubLSymbol $sym11$REGISTER_CYC_API_MACRO;
    private static final SubLSymbol $sym12$DEFINE_EXTERNAL;
    private static final SubLList $list13;
    private static final SubLSymbol $sym14$REGISTER_EXTERNAL_SYMBOL;
    private static final SubLSymbol $sym15$_API_SPECIAL_TABLE_;
    private static final SubLString $str16$Registering__A_as_special_even_th;
    private static final SubLSymbol $sym17$_API_PREDEFINED_FUNCTION_TABLE_;
    private static final SubLInteger $int18$1000;
    private static final SubLSymbol $sym19$_API_PREDEFINED_HOST_FUNCTION_TABLE_;
    private static final SubLInteger $int20$100;
    private static final SubLSymbol $sym21$_API_PREDEFINED_MACRO_TABLE_;
    private static final SubLSymbol $sym22$_API_PREDEFINED_HOST_MACRO_TABLE_;
    private static final SubLSymbol $sym23$_API_SYMBOLS_;
    private static final SubLSymbol $kw24$CYC_API_SYMBOL;
    private static final SubLSymbol $sym25$SYMBOLP;
    private static final SubLSymbol $kw26$CYC_API_ARGS;
    private static final SubLSymbol $kw27$CYC_API_ARG_TYPES;
    private static final SubLSymbol $kw28$CYC_API_RETURN_TYPES;
    private static final SubLSymbol $sym29$_API_TYPES_;
    private static final SubLSymbol $kw30$REPLACEMENTS;
    private static final SubLString $str31$_replacements_not_allowed_in_the_;
    private static final SubLSymbol $kw32$ARGUMENT_TYPES;
    private static final SubLSymbol $kw33$RETURN_TYPES;
    private static final SubLSymbol $sym34$ENFORCE_TYPE;
    private static final SubLSymbol $sym35$NIL_OR;
    private static final SubLString $str36$Invalid_argument_type_expression_;
    private static final SubLSymbol $sym37$PWHEN;
    private static final SubLString $str38$_S_return_type_expression_not_lis;
    private static final SubLList $list39;
    private static final SubLString $str40$_S_complex_return_type_expression;
    private static final SubLSymbol $sym41$DEFINE_AFTER_ADDING;
    private static final SubLSymbol $sym42$DEFINE_KB;
    private static final SubLSymbol $sym43$DEFINE_AFTER_REMOVING;
    private static final SubLSymbol $sym44$DEFINE_RULE_AFTER_ADDING;
    private static final SubLSymbol $sym45$DEFINE_RULE_AFTER_REMOVING;
    private static final SubLSymbol $sym46$DEFINE_COLLECTION_DEFN;
    private static final SubLSymbol $sym47$DEFINE_EVALUATION_DEFN;
    private static final SubLList $list48;
    private static final SubLSymbol $sym49$DEFINE_EXPANSION_DEFN;
    private static final SubLSymbol $sym50$DEFINE_CYC_SUBL_DEFN;
    private static final SubLList $list51;
    private static final SubLList $list52;
    private static final SubLList $list53;
    private static final SubLSymbol $sym54$RET;
    private static final SubLList $list55;
    private static final SubLSymbol $sym56$DEFINE;
    private static final SubLSymbol $sym57$REGISTER_KB_FUNCTION;
    private static final SubLSymbol $sym58$_KB_FUNCTION_TABLE_;
    private static final SubLInteger $int59$400;
    private static final SubLSymbol $sym60$STRING_LESSP;
    private static final SubLSymbol $sym61$SYMBOL_NAME;
    private static final SubLSymbol $sym62$DEREGISTER_KB_FUNCTION;
    private static final SubLSymbol $sym63$DEFINE_PRIVATE;
    private static final SubLSymbol $sym64$NOTE_FUNCALL_HELPER_FUNCTION;
    private static final SubLSymbol $sym65$_FUNCALL_HELPER_PROPERTY_;
    private static final SubLSymbol $kw66$FUNCALL_HELPER;
    private static final SubLSymbol $sym67$DEFINE_PRIVATE_FUNCALL;
    private static final SubLSymbol $sym68$_UNPROVIDED_;
    private static final SubLString $str69$UNPROVIDED;
    private static final SubLList $list70;
    private static final SubLSymbol $sym71$DECLARE_CONTROL_PARAMETER_INTERNAL;
    private static final SubLSymbol $kw72$FANCY_NAME;
    private static final SubLSymbol $kw73$DESCRIPTION;
    private static final SubLSymbol $kw74$SETTINGS_SPEC;
    private static final SubLSymbol $sym75$CCATCH_IGNORE;
    private static final SubLSymbol $kw76$MAPPING_DONE;
    private static final SubLSymbol $kw77$SBHL_MAPPING_DONE;
    private static final SubLList $list78;
    private static final SubLSymbol $sym79$WRITE_BYTE;
    private static final SubLList $list80;
    private static final SubLList $list81;
    private static final SubLList $list82;
    private static final SubLSymbol $sym83$LOCK_VAR;
    private static final SubLSymbol $sym84$CLET;
    private static final SubLSymbol $sym85$PIF;
    private static final SubLSymbol $sym86$LOCK_IDLE_P;
    private static final SubLSymbol $sym87$WITH_LOCK_HELD;
    private static final SubLList $list88;
    private static final SubLList $list89;
    private static final SubLList $list90;
    private static final SubLSymbol $kw91$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw92$VACCESS;
    private static final SubLSymbol $kw93$DOCUMENTATION;
    private static final SubLSymbol $sym94$DECLAIM;
    private static final SubLSymbol $sym95$VACCESS;
    private static final SubLSymbol $sym96$DEFGLOBAL;
    private static final SubLSymbol $sym97$REGISTER_GLOBAL_LOCK;
    private static final SubLSymbol $sym98$_GLOBAL_LOCKS_;
    private static final SubLList $list99;
    private static final SubLSymbol $sym100$CAR;
    private static final SubLSymbol $sym101$MAKE_LOCK;
    private static final SubLSymbol $sym102$GLOBAL_LOCK_P;
    private static final SubLSymbol $sym103$INITIALIZE_GLOBAL_LOCK_INTERNAL;
    private static final SubLSymbol $sym104$INITIALIZE_GLOBAL_LOCKS;
    private static final SubLSymbol $sym105$CSETQ;
    private static final SubLSymbol $sym106$_FI_STATE_VARIABLES_;
    private static final SubLList $list107;
    private static final SubLSymbol $sym108$DEFPARAMETER_HTML;
    private static final SubLSymbol $sym109$CPUSHNEW;
    private static final SubLList $list110;
    private static final SubLSymbol $sym111$CPROGV;
    private static final SubLList $list112;
    private static final SubLSymbol $sym113$_HTML_STATE_VARIABLES_;
    private static final SubLSymbol $sym114$DEFPARAMETER;
    private static final SubLSymbol $sym115$REGISTER_HTML_STATE_VARIABLE;
    private static final SubLSymbol $sym116$DEFVAR;
    private static final SubLSymbol $sym117$_HTML_INTERFACE_VARIABLES_;
    private static final SubLSymbol $sym118$REGISTER_HTML_INTERFACE_VARIABLE;
    private static final SubLList $list119;
    private static final SubLSymbol $sym120$NOTE_STATE_VARIABLE_DOCUMENTATION;
    private static final SubLSymbol $sym121$DEF_STATE_VARIABLE;
    private static final SubLSymbol $kw122$VARIABLE_DOC;
    private static final SubLSymbol $kw123$VARIABLE;
    private static final SubLSymbol $kw124$PARAMETER;
    private static final SubLSymbol $kw125$GLOBAL;
    private static final SubLSymbol $kw126$LEXICAL;
    private static final SubLSymbol $sym127$DEFLEXICAL;
    private static final SubLSymbol $kw128$CONSTANT;
    private static final SubLSymbol $sym129$DEFCONSTANT;
    private static final SubLSymbol $kw130$PARAMETER_PRIVATE;
    private static final SubLSymbol $sym131$DEFPARAMETER_PRIVATE;
    private static final SubLSymbol $kw132$PARAMETER_PUBLIC;
    private static final SubLSymbol $sym133$DEFPARAMETER_PUBLIC;
    private static final SubLSymbol $kw134$PARAMETER_PROTECTECD;
    private static final SubLString $str135$unknown_variable_type__s__;
    private static final SubLSymbol $kw136$FUNCTION;
    private static final SubLSymbol $kw137$FUNCTION_DOC;
    private static final SubLSymbol $kw138$STRUCTURE;
    private static final SubLSymbol $kw139$STRUCTURE_DOC;
    private static final SubLSymbol $kw140$TYPE;
    private static final SubLSymbol $kw141$TYPE_DOC;
    private static final SubLSymbol $sym142$_GT_STATE_VARIABLES_;
    private static final SubLList $list143;
    private static final SubLSymbol $sym144$_AT_STATE_VARIABLES_;
    private static final SubLSymbol $sym145$_DEFN_STATE_VARIABLES_;
    private static final SubLList $list146;
    private static final SubLSymbol $sym147$_KBI_STATE_VARIABLES_;
    private static final SubLSymbol $sym148$_KBP_STATE_VARIABLES_;
    private static final SubLList $list149;
    private static final SubLList $list150;
    private static final SubLSymbol $sym151$CYC_API_REMOTE_EVAL;
    private static final SubLList $list152;
    private static final SubLSymbol $sym153$CHECK_TYPE;
    private static final SubLList $list154;
    private static final SubLSymbol $sym155$_FORWARD_INFERENCE_ENVIRONMENT_;
    private static final SubLSymbol $sym156$ENVIRONMENT;
    private static final SubLList $list157;
    private static final SubLSymbol $sym158$WITH_FORWARD_INFERENCE_ENVIRONMENT;
    private static final SubLSymbol $sym159$ENVIRONMENT;
    private static final SubLList $list160;
    private static final SubLSymbol $sym161$POSSIBLY_GET_FORWARD_INFERENCE_ENVIRONMENT;
    private static final SubLSymbol $sym162$WITH_POSSIBLY_CLEAN_FORWARD_INFERENCE_ENVIRONMENT;
    private static final SubLList $list163;
    private static final SubLSymbol $sym164$CUNWIND_PROTECT;
    private static final SubLList $list165;
    private static final SubLList $list166;
    private static final SubLSymbol $sym167$WITH_NORMAL_FORWARD_INFERENCE_PARAMETERS;
    private static final SubLSymbol $sym168$WITH_CLEAN_FORWARD_INFERENCE_ENVIRONMENT;
    private static final SubLSymbol $sym169$WITH_CLEAN_FORWARD_PROBLEM_STORE_ENVIRONMENT;
    private static final SubLSymbol $sym170$ERROR;
    private static final SubLSymbol $sym171$CATCH_ERROR_MESSAGE;
    private static final SubLList $list172;
    private static final SubLList $list173;
    private static final SubLSymbol $sym174$TRACING_AT_LEVEL;
    private static final SubLList $list175;
    private static final SubLSymbol $kw176$SL2JAVA;
    private static final SubLSymbol $sym177$_STRUCTURE_RESOURCING_MAKE_STATIC_;
    private static final SubLSymbol $sym178$WITH_STATIC_AREA;
    private static final SubLList $list179;
    private static final SubLString $str180$__A_FREE_LIST_;
    private static final SubLString $str181$Free_list_for__A_objects;
    private static final SubLString $str182$__A_FREE_LOCK_;
    private static final SubLString $str183$Lock_for__A_object_free_list;
    private static final SubLString $str184$_A_resource_lock;
    private static final SubLString $str185$MAKE_STATIC__A;
    private static final SubLString $str186$Make_a_new__A_in_the_static_area;
    private static final SubLString $str187$INIT__A;
    private static final SubLString $str188$Initialize_a__A_for_use;
    private static final SubLString $str189$GET__A;
    private static final SubLString $str190$Get_a__A_from_the_free_list__or_m;
    private static final SubLString $str191$FREE__A_P;
    private static final SubLString $str192$Check_if_OBJECT_is_a__A_that_has_;
    private static final SubLString $str193$FREE__A;
    private static final SubLString $str194$Place_a__A_onto_the_free_list;
    private static final SubLString $str195$MAKE__A;
    private static final SubLString $str196$_A_P;
    private static final SubLSymbol $sym197$DEFLEXICAL_PRIVATE;
    private static final SubLSymbol $sym198$OBJECT;
    private static final SubLList $list199;
    private static final SubLSymbol $sym200$CAND;
    private static final SubLList $list201;
    private static final SubLSymbol $sym202$PUNLESS;
    private static final SubLSymbol $sym203$CSETF;
    private static final SubLSymbol $sym204$_STRUCTURE_RESOURCING_ENABLED_;
    private static final SubLList $list205;
    private static final SubLList $list206;
    private static final SubLList $list207;
    private static final SubLSymbol $sym208$CDO;
    private static final SubLList $list209;
    private static final SubLList $list210;
    private static final SubLSymbol $sym211$FOUND;
    private static final SubLList $list212;
    private static final SubLList $list213;
    private static final SubLList $list214;
    private static final SubLSymbol $sym215$STR;
    private static final SubLList $list216;
    private static final SubLList $list217;
    private static final SubLList $list218;
    private static final SubLList $list219;
    private static final SubLList $list220;
    private static final SubLList $list221;
    private static final SubLList $list222;
    private static final SubLSymbol $sym223$_SILENT_PROGRESS__;
    private static final SubLSymbol $sym224$FIF;
    private static final SubLList $list225;
    private static final SubLSymbol $sym226$NOTING_PROGRESS_PREAMBLE;
    private static final SubLList $list227;
    private static final SubLList $list228;
    private static final SubLSymbol $sym229$_NOTING_PROGRESS_DELAYED_MODE_SECONDS_;
    private static final SubLSymbol $sym230$_NOTING_PROGRESS_DELAYED_MODE_STRING_;
    private static final SubLSymbol $sym231$NOTING_PROGRESS;
    private static final SubLString $str232$___A;
    private static final SubLList $list233;
    private static final SubLString $str234$___A____;
    private static final SubLSymbol $sym235$NOTING_PROGRESS_POSTAMBLE;
    private static final SubLString $str236$__;
    private static final SubLString $str237$_DONE__;
    private static final SubLInteger $int238$600;
    private static final SubLString $str239$__ended__A;
    private static final SubLString $str240$_;
    private static final SubLSymbol $sym241$NOTE_PROGRESS;
    private static final SubLInteger $int242$50;
    private static final SubLInteger $int243$200;
    private static final SubLInteger $int244$30;
    private static final SubLInteger $int245$25;
    private static final SubLString $str246$__A_;
    private static final SubLString $str247$_;
    private static final SubLSymbol $sym248$IGNORE;
    private static final SubLList $list249;
    private static final SubLSymbol $sym250$NOTING_PERCENT_PROGRESS_PREAMBLE;
    private static final SubLList $list251;
    private static final SubLSymbol $sym252$_PERCENT_PROGRESS_DELAYED_MODE_SECONDS_;
    private static final SubLSymbol $sym253$_PERCENT_PROGRESS_DELAYED_MODE_STRING_;
    private static final SubLSymbol $sym254$NOTING_PERCENT_PROGRESS;
    private static final SubLSymbol $sym255$NOTING_PERCENT_PROGRESS_POSTAMBLE;
    private static final SubLString $str256$____;
    private static final SubLString $str257$__;
    private static final SubLSymbol $sym258$NOTE_PERCENT_PROGRESS;
    private static final SubLString $str259$__;
    private static final SubLString $str260$__;
    private static final SubLString $str261$01_;
    private static final SubLInteger $int262$300;
    private static final SubLString $str263$02_;
    private static final SubLInteger $int264$1200;
    private static final SubLInteger $int265$_2;
    private static final SubLString $str266$_;
    private static final SubLString $str267$_;
    private static final SubLString $str268$0;
    private static final SubLString $str269$_of_;
    private static final SubLString $str270$__ending__;
    private static final SubLInteger $int271$99;
    private static final SubLString $str272$;
    private static final SubLString $str273$___A____D_of__D___02D___Done_at__;
    private static final SubLString $str274$whenever;
    private static final SubLList $list275;
    private static final SubLString $str276$cdotimes;
    private static final SubLSymbol $sym277$_PROGRESS_NOTE_;
    private static final SubLSymbol $sym278$_PROGRESS_TOTAL_;
    private static final SubLList $list279;
    private static final SubLSymbol $sym280$CDOTIMES;
    private static final SubLList $list281;
    private static final SubLList $list282;
    private static final SubLList $list283;
    private static final SubLString $str284$cdolist;
    private static final SubLSymbol $sym285$LIST_VAR;
    private static final SubLList $list286;
    private static final SubLSymbol $sym287$LENGTH;
    private static final SubLSymbol $sym288$CSOME;
    private static final SubLSymbol $sym289$PROGRESS_CDOLIST;
    private static final SubLList $list290;
    private static final SubLSymbol $sym291$PROGRESS_CSOME;
    private static final SubLList $list292;
    private static final SubLSymbol $sym293$MESSAGE_VAR;
    private static final SubLSymbol $sym294$CDOLIST;
    private static final SubLList $list295;
    private static final SubLString $str296$cdohash;
    private static final SubLSymbol $sym297$TABLE_VAR;
    private static final SubLSymbol $sym298$HASH_TABLE_COUNT;
    private static final SubLSymbol $sym299$CDOHASH;
    private static final SubLList $list300;
    private static final SubLString $str301$do_set;
    private static final SubLSymbol $sym302$SET_VAR;
    private static final SubLSymbol $sym303$SET_SIZE;
    private static final SubLSymbol $sym304$DO_SET;
    private static final SubLList $list305;
    private static final SubLList $list306;
    private static final SubLSymbol $kw307$MESSAGE;
    private static final SubLSymbol $sym308$MESSAGE_VAR;
    private static final SubLSymbol $sym309$START_TIME;
    private static final SubLSymbol $sym310$NOTING_ELAPSED_TIME_PREAMBLE;
    private static final SubLSymbol $sym311$NOTING_ELAPSED_TIME_POSTAMBLE;
    private static final SubLSymbol $sym312$NOTING_ELAPSED_TIME;
    private static final SubLString $str313$___A_started__at__A;
    private static final SubLString $str314$___A_finished_at__A_after_A;
    private static final SubLSymbol $sym315$WITH_SUBLISP_ERROR_HANDLING;
    private static final SubLList $list316;
    private static final SubLList $list317;
    private static final SubLList $list318;
    private static final SubLList $list319;
    private static final SubLSymbol $sym320$WITH_CYC_SERVER_HANDLING;
    private static final SubLSymbol $sym321$WITH_CYC_IO_SYNTAX;
    private static final SubLList $list322;
    private static final SubLList $list323;
    private static final SubLSymbol $sym324$OLD_CYCLIST;
    private static final SubLList $list325;
    private static final SubLSymbol $sym326$SET_THE_CYCLIST;
    private static final SubLList $list327;
    private static final SubLList $list328;
    private static final SubLSymbol $sym329$BINDING;
    private static final SubLSymbol $sym330$SUBLIS;
    private static final SubLString $str331$_S___var__S_is_not_a_symbol_;
    private static final SubLString $str332$_S___function__S_is_not_a_symbol_;
    private static final SubLString $str333$_S___search_type__S_is_not_one_of;
    private static final SubLList $list334;
    private static final SubLSymbol $sym335$NULL;
    private static final SubLSymbol $sym336$CDR;
    private static final SubLSymbol $sym337$CONSP;
    private static final SubLList $list338;
    private static final SubLSymbol $sym339$CDOSUBLISTS;
    private static final SubLList $list340;
    private static final SubLSymbol $sym341$CDOLIST_AND_SUBLISTS;
    private static final SubLString $str342$next_cons_var;
    private static final SubLList $list343;
    private static final SubLString $str344$sublist;
    private static final SubLSymbol $sym345$WHILE;
    private static final SubLList $list346;
    private static final SubLSymbol $sym347$CDOLIST_IF;
    private static final SubLSymbol $sym348$CDOSUBLISTS_IF;
    private static final SubLSymbol $sym349$CDOLIST_IF_NOT;
    private static final SubLSymbol $sym350$CDOSUBLISTS_IF_NOT;
    private static final SubLList $list351;
    private static final SubLString $str352$sublist1;
    private static final SubLString $str353$sublist2;
    private static final SubLList $list354;
    private static final SubLSymbol $kw355$DEPTH_FIRST;
    private static final SubLSymbol $sym356$CDOTREE;
    private static final SubLSymbol $kw357$BREADTH_FIRST;
    private static final SubLString $str358$tree_var;
    private static final SubLString $str359$cells_var;
    private static final SubLString $str360$tail_of_cells;
    private static final SubLSymbol $sym361$LIST;
    private static final SubLSymbol $sym362$LAST;
    private static final SubLSymbol $sym363$RPLACD;
    private static final SubLSymbol $sym364$CPUSH;
    private static final SubLList $list365;
    private static final SubLSymbol $sym366$CDOTREE_CONSES;
    private static final SubLString $str367$tail_of_cells_var;
    private static final SubLList $list368;
    private static final SubLSymbol $sym369$DO_PLIST;
    private static final SubLSymbol $sym370$CAAR;
    private static final SubLSymbol $sym371$CDAR;
    private static final SubLSymbol $sym372$CADR;
    private static final SubLSymbol $sym373$CDDR;
    private static final SubLList $list374;
    private static final SubLString $str375$datum_evaluated_var;
    private static final SubLSymbol $sym376$NCONC;
    private static final SubLString $str377$FAST_FUNCALL_NO_VALUE__contains_e;
    private static final SubLString $str378$FAST_FUNCALL_NO_VALUE__cannot_acc;
    private static final SubLString $str379$FAST_FUNCALL_NO_VALUE__function_n;
    private static final SubLList $list380;
    private static final SubLSymbol $sym381$FUNCALL;
    private static final SubLString $str382$function_form_evaluated_var;
    private static final SubLSymbol $sym383$PCASE;
    private static final SubLSymbol $sym384$OTHERWISE;
    private static final SubLList $list385;
    private static final SubLList $list386;
    private static final SubLSymbol $sym387$CMULTIPLE_VALUE_BIND;
    private static final SubLList $list388;
    private static final SubLSymbol $sym389$CMULTIPLE_VALUE_SETQ;
    private static final SubLList $list390;
    private static final SubLList $list391;
    private static final SubLList $list392;
    private static final SubLString $str393$_A_S;
    private static final SubLList $list394;
    private static final SubLString $str395$LIST_EXPRESSION;
    private static final SubLString $str396$TAIL_CONS;
    private static final SubLString $str397$RESULT;
    private static final SubLSymbol $sym398$PCOND;
    private static final SubLSymbol $sym399$ATOM;
    private static final SubLSymbol $kw400$API;
    private static final SubLSymbol $sym401$DEFINE_API;
    private static final SubLSymbol $kw402$PUBLIC;
    private static final SubLSymbol $kw403$PROTECTED;
    private static final SubLSymbol $sym404$DEFINE_PROTECTED;
    private static final SubLSymbol $kw405$PRIVATE;
    private static final SubLSymbol $kw406$ALL;
    private static final SubLList $list407;
    private static final SubLSymbol $kw408$NOT_EMPTY_ALL;
    private static final SubLList $list409;
    private static final SubLSymbol $kw410$ANY;
    private static final SubLString $str411$DEFINE_LIST_ELEMENT_PREDICATOR___;
    private static final SubLList $list412;
    private static final SubLSymbol $sym413$_OPTIONAL;
    private static final SubLSymbol $sym414$CAR_IF_LIST;
    private static final SubLString $str415$FCOND___S_is_not_a_valid_clause_l;
    private static final SubLString $str416$FCOND___S_is_not_a_valid_clause_;
    private static final SubLString $str417$P_RANGE_CASE__Ill_formed_clauses_;
    private static final SubLString $str418$P_RANGE_CASE___S_is_not_a_valid_c;
    private static final SubLString $str419$value;
    private static final SubLSymbol $sym420$__;
    private static final SubLSymbol $sym421$__;
    private static final SubLSymbol $sym422$_;
    private static final SubLList $list423;
    private static final SubLSymbol $sym424$ERROR;
    private static final SubLString $str425$Invalid_version_code__A_;
    private static final SubLList $list426;
    private static final SubLList $list427;
    private static final SubLSymbol $kw428$ERROR_CLAUSE;
    private static final SubLList $list429;
    private static final SubLList $list430;
    private static final SubLList $list431;
    private static final SubLSymbol $sym432$SUB_KB_LOADED_P_SYMBOL;
    private static final SubLSymbol $sym433$DECLARE_KB_FEATURE;
    private static final SubLString $str434$_P;
    private static final SubLSymbol $sym435$SUB_KB_SET_SYMBOL;
    private static final SubLString $str436$SET_;
    private static final SubLSymbol $sym437$SUB_KB_UNSET_SYMBOL;
    private static final SubLString $str438$UNSET_;
    private static final SubLList $list439;
    private static final SubLSymbol $sym440$DEFGLOBAL_PRIVATE;
    private static final SubLList $list441;
    private static final SubLList $list442;
    private static final SubLSymbol $kw443$A;
    private static final SubLSymbol $kw444$S;
    private static final SubLSymbol $kw445$D;
    private static final SubLSymbol $sym446$TO_STRING;
    private static final SubLSymbol $sym447$CCONCATENATE;
    private static final SubLList $list448;
    private static final SubLString $str449$FORMAT_TO_STRING___S_is_an_invali;
    private static final SubLString $str450$FORMAT_TO_STRING__Odd_number_of_a;
    private static final SubLSymbol $sym451$TIME;
    private static final SubLSymbol $sym452$CTIME;
    private static final SubLSymbol $sym453$FORMAT;
    private static final SubLString $str454$_____real_time__A_seconds__;
    private static final SubLList $list455;
    private static final SubLSymbol $sym456$TIMING_INFO;
    private static final SubLSymbol $sym457$CLOCK_TIME;
    private static final SubLSymbol $sym458$WITH_PROCESS_RESOURCE_TRACKING;
    private static final SubLSymbol $sym459$CONVERT_PROCESS_RESOURCE_TRACKING_TIMING_INFO_TO_SECONDS;
    private static final SubLSymbol $sym460$NADD_CLOCK_TIME_TO_PROCESS_RESOURCE_TIMING_INFO;
    private static final SubLList $list461;
    private static final SubLSymbol $sym462$WITH_PROCESS_RESOURCE_TRACKING_IN_SECONDS;
    private static final SubLInteger $int463$10000000;
    private static final SubLSymbol $kw464$WALL_CLOCK_TIME;
    private static final SubLSymbol $kw465$USER_TIME;
    private static final SubLSymbol $kw466$SYSTEM_TIME;
    private static final SubLSymbol $sym467$TIMING_INFO;
    private static final SubLString $str468$______s__;
    private static final SubLSymbol $sym469$TIMING_INFO;
    private static final SubLSymbol $sym470$PROCESS_RESOURCE_TRACKING_USER_TIME;
    private static final SubLSymbol $sym471$TIMING_INFO;
    private static final SubLSymbol $sym472$TIMING_INFO;
    private static final SubLSymbol $sym473$PROCESS_RESOURCE_TRACKING_SYSTEM_TIME;
    private static final SubLSymbol $sym474$TIMING_INFO;
    private static final SubLList $list475;
    private static final SubLList $list476;
    private static final SubLSymbol $sym477$ELEM;
    private static final SubLSymbol $sym478$LIST_VAR;
    private static final SubLList $list479;
    private static final SubLSymbol $sym480$CHECK_LIST_TYPE;
    private static final SubLSymbol $sym481$ELEM;
    private static final SubLSymbol $sym482$LIST_VAR;
    private static final SubLList $list483;
    private static final SubLSymbol $sym484$PROPERTY;
    private static final SubLSymbol $sym485$VALUE;
    private static final SubLSymbol $sym486$PLIST_VAR;
    private static final SubLList $list487;
    private static final SubLSymbol $sym488$PROPERTY;
    private static final SubLSymbol $sym489$VALUE;
    private static final SubLSymbol $sym490$PLIST_VAR;
    private static final SubLSymbol $sym491$PROPERTY;
    private static final SubLSymbol $sym492$VALUE;
    private static final SubLSymbol $sym493$PLIST_VAR;
    private static final SubLSymbol $sym494$WARN_UNLESS;
    private static final SubLString $str495$_s_is_not_a_known__a;
    private static final SubLList $list496;
    private static final SubLSymbol $sym497$MUST;
    private static final SubLList $list498;
    private static final SubLSymbol $sym499$COR;
    private static final SubLList $list500;
    private static final SubLSymbol $sym501$SWAP_VAR;
    private static final SubLList $list502;
    private static final SubLList $list503;
    private static final SubLSymbol $kw504$DEFINER;
    private static final SubLSymbol $kw505$ACCESS;
    private static final SubLString $str506$_A_INITIALIZER;
    private static final SubLSymbol $sym507$PROCLAIM;
    private static final SubLSymbol $kw508$UNINITIALIZED;
    private static final SubLSymbol $sym509$REGISTER_KB_VARIABLE_INITIALIZATION;
    private static final SubLSymbol $sym510$_KB_VAR_INITIALIZATIONS_;
    private static final SubLSymbol $sym511$DEF_KB_VARIABLE;
    private static final SubLString $str512$Initializing_KB_variables;
    private static final SubLList $list513;
    private static final SubLList $list514;
    private static final SubLList $list515;
    private static final SubLSymbol $kw516$VAR;
    private static final SubLSymbol $sym517$PRIVATE;
    private static final SubLSymbol $kw518$FACCESS;
    private static final SubLString $str519$_;
    private static final SubLString $str520$Invalid_function_name__A___The_fi;
    private static final SubLSymbol $sym521$INIT_VALUE;
    private static final SubLSymbol $sym522$FACCESS;
    private static final SubLList $list523;
    private static final SubLString $str524$Unable_to_initialize__A__;
    private static final SubLString $str525$Invalid_function_name__A___The_fi;
    private static final SubLSymbol $sym526$INIT_VALUE;
    private static final SubLString $str527$Invalid_function_name__A___The_fi;
    private static final SubLSymbol $sym528$INIT_VALUE;
    private static final SubLString $str529$Invalid_function_name__A___The_fi;
    private static final SubLSymbol $sym530$INIT_VALUE;
    private static final SubLList $list531;
    private static final SubLSymbol $sym532$REGISTER_OBSOLETE_CYC_API_FUNCTION;
    private static final SubLSymbol $kw533$OBSOLETE_CYC_API_REPLACEMENTS;
    private static final SubLInteger $int534$40;
    private static final SubLSymbol $sym535$INITIALIZATION_FOR_PARTIAL_LIST_RESULTS;
    private static final SubLSymbol $sym536$ACCUMULATION_FOR_PARTIAL_LIST_RESULTS;
    private static final SubLSymbol $sym537$CONSOLIDATION_FOR_PARTIAL_LIST_RESULTS;
    private static final SubLSymbol $sym538$NOTIFICATION_FOR_PARTIAL_LIST_RESULTS;
    private static final SubLSymbol $sym539$FINAL_RESULTS_FOR_PARTIAL_LIST_RESULTS;
    private static final SubLList $list540;
    private static final SubLList $list541;
    private static final SubLList $list542;
    private static final SubLSymbol $sym543$_PARTIAL_RESULTS_THRESHOLD_;
    private static final SubLList $list544;
    private static final SubLList $list545;
    private static final SubLList $list546;
    private static final SubLSymbol $sym547$WITH_SPACE_PROFILING_TO_STRING;
    private static final SubLList $list548;
    private static final SubLSymbol $sym549$STREAM;
    private static final SubLSymbol $sym550$CWITH_OUTPUT_TO_STRING;
    private static final SubLSymbol $sym551$WITH_SPACE_PROFILING;
    private static final SubLSymbol $kw552$STREAM;
    private static final SubLList $list553;
    private static final SubLList $list554;
    private static final SubLSymbol $kw555$INITIAL_VALUE;
    private static final SubLList $list556;
    private static final SubLSymbol $sym557$_SXHASH_COMPOSITE_HASH_;
    private static final SubLList $list558;
    private static final SubLList $list559;
    private static final SubLSymbol $sym560$COMPOSITE_HASH;
    private static final SubLList $list561;
    private static final SubLList $list562;
    private static final SubLList $list563;
    private static final SubLSymbol $sym564$LOGXOR;
    private static final SubLSymbol $sym565$SXHASH_ROT;
    private static final SubLSymbol $sym566$SXHASH;
    private static final SubLList $list567;
    private static final SubLInteger $int568$27;
    private static final SubLObject $ic569;
    private static final SubLSymbol $sym570$SXHASH_COMPOSITE_UPDATE;
    private static final SubLSymbol $sym571$COMPUTE_SXHASH_COMPOSITE;
    private static final SubLInteger $int572$1000000;
    private static final SubLInteger $int573$167;
    private static final SubLList $list574;
    private static final SubLList $list575;
    private static final SubLSymbol $sym576$CCATCH;
    private static final SubLList $list577;
    private static final SubLSymbol $sym578$TIMINGS;
    private static final SubLSymbol $sym579$TIME;
    private static final SubLSymbol $sym580$I;
    private static final SubLList $list581;
    private static final SubLSymbol $sym582$_;
    private static final SubLList $list583;
    private static final SubLSymbol $sym584$PERFORM_STANDARD_STATISTICAL_ANALYSIS;
    private static final SubLSymbol $sym585$BENCHMARK_GC;
    private static final SubLSymbol $sym586$RUN_BENCHMARK_COMPENSATING_FOR_PAGING;
    private static final SubLList $list587;
    private static final SubLList $list588;
    private static final SubLSymbol $sym589$WITH_TIMEOUT;
    private static final SubLList $list590;
    private static final SubLSymbol $sym591$ERROR_MSG;
    private static final SubLSymbol $sym592$SUCCESS;
    private static final SubLSymbol $sym593$N;
    private static final SubLSymbol $sym594$SLEEP;
    static  boolean assertionsDisabledSynth = true;
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 944L)
    public static SubLObject define_api(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)utilities_macros.NIL;
        SubLObject arglist = (SubLObject)utilities_macros.NIL;
        SubLObject documentation_string = (SubLObject)utilities_macros.NIL;
        SubLObject type_declarations = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list0);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list0);
        arglist = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list0);
        documentation_string = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list0);
        type_declarations = current.first();
        final SubLObject body;
        current = (body = current.rest());
        assert utilities_macros.NIL != Types.stringp(documentation_string) : documentation_string;
        assert utilities_macros.NIL != Types.listp(type_declarations) : type_declarations;
        thread.resetMultipleValues();
        final SubLObject argument_types = parse_api_type_declarations(type_declarations);
        final SubLObject body_preamble = thread.secondMultipleValue();
        final SubLObject return_types = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym3$PROGN, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym4$DEFINE_PUBLIC, name, arglist, documentation_string, ConsesLow.append(body_preamble, body, (SubLObject)utilities_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym5$REGISTER_CYC_API_FUNCTION, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym6$QUOTE, name), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym6$QUOTE, arglist), documentation_string, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym6$QUOTE, argument_types), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym6$QUOTE, return_types)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 2323L)
    public static SubLObject declare_api_function(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)utilities_macros.NIL;
        SubLObject arglist = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list7);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list7);
        arglist = current.first();
        final SubLObject body;
        current = (body = current.rest());
        SubLObject current_$2;
        final SubLObject datum_$1 = current_$2 = body;
        SubLObject documentation_string = (SubLObject)utilities_macros.NIL;
        SubLObject type_declarations = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current_$2, datum_$1, (SubLObject)utilities_macros.$list8);
        documentation_string = current_$2.first();
        current_$2 = current_$2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current_$2, datum_$1, (SubLObject)utilities_macros.$list8);
        type_declarations = current_$2.first();
        current_$2 = current_$2.rest();
        if (utilities_macros.NIL != current_$2) {
            cdestructuring_bind.cdestructuring_bind_error(datum_$1, (SubLObject)utilities_macros.$list8);
            return (SubLObject)utilities_macros.NIL;
        }
        assert utilities_macros.NIL != Types.stringp(documentation_string) : documentation_string;
        assert utilities_macros.NIL != Types.listp(type_declarations) : type_declarations;
        thread.resetMultipleValues();
        final SubLObject argument_types = parse_api_type_declarations(type_declarations);
        final SubLObject body_preamble = thread.secondMultipleValue();
        final SubLObject return_types = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym5$REGISTER_CYC_API_FUNCTION, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym6$QUOTE, name), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym6$QUOTE, arglist), documentation_string, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym6$QUOTE, argument_types), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym6$QUOTE, return_types));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 2888L)
    public static SubLObject defmacro_api(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)utilities_macros.NIL;
        SubLObject pattern = (SubLObject)utilities_macros.NIL;
        SubLObject documentation_string = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list9);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list9);
        pattern = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list9);
        documentation_string = current.first();
        final SubLObject body;
        current = (body = current.rest());
        assert utilities_macros.NIL != Types.stringp(documentation_string) : documentation_string;
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym3$PROGN, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym10$DEFMACRO_PUBLIC, name, pattern, documentation_string, ConsesLow.append(body, (SubLObject)utilities_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym11$REGISTER_CYC_API_MACRO, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym6$QUOTE, name), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym6$QUOTE, pattern), documentation_string));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 3414L)
    public static SubLObject define_api_provisional(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)utilities_macros.NIL;
        SubLObject arglist = (SubLObject)utilities_macros.NIL;
        SubLObject documentation_string = (SubLObject)utilities_macros.NIL;
        SubLObject type_declarations = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list0);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list0);
        arglist = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list0);
        documentation_string = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list0);
        type_declarations = current.first();
        final SubLObject body;
        current = (body = current.rest());
        assert utilities_macros.NIL != Types.stringp(documentation_string) : documentation_string;
        assert utilities_macros.NIL != Types.listp(type_declarations) : type_declarations;
        thread.resetMultipleValues();
        final SubLObject argument_types = parse_api_type_declarations(type_declarations);
        final SubLObject body_preamble = thread.secondMultipleValue();
        final SubLObject return_types = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym3$PROGN, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym12$DEFINE_EXTERNAL, name, arglist, documentation_string, ConsesLow.append(body_preamble, body, (SubLObject)utilities_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 4105L)
    public static SubLObject defmacro_api_provisional(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)utilities_macros.NIL;
        SubLObject pattern = (SubLObject)utilities_macros.NIL;
        SubLObject documentation_string = (SubLObject)utilities_macros.NIL;
        SubLObject type_declarations = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list13);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list13);
        pattern = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list13);
        documentation_string = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list13);
        type_declarations = current.first();
        final SubLObject body;
        current = (body = current.rest());
        assert utilities_macros.NIL != Types.stringp(documentation_string) : documentation_string;
        assert utilities_macros.NIL != Types.listp(type_declarations) : type_declarations;
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym3$PROGN, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym14$REGISTER_EXTERNAL_SYMBOL, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym6$QUOTE, name)), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym10$DEFMACRO_PUBLIC, name, pattern, documentation_string, ConsesLow.append(body, (SubLObject)utilities_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 4611L)
    public static SubLObject register_cyc_api_function(final SubLObject name, final SubLObject arglist, final SubLObject doc_string, final SubLObject argument_types, final SubLObject return_types) {
        register_api_predefined_function(name);
        register_cyc_api_symbol(name);
        register_cyc_api_args(name, arglist);
        register_cyc_api_function_documentation(name, doc_string);
        register_cyc_api_arg_types(name, argument_types);
        register_cyc_api_return_types(name, return_types);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 5131L)
    public static SubLObject register_cyc_api_macro(final SubLObject name, final SubLObject pattern, final SubLObject doc_string) {
        register_api_predefined_macro(name);
        register_cyc_api_symbol(name);
        register_cyc_api_args(name, pattern);
        register_cyc_api_function_documentation(name, doc_string);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 5747L)
    public static SubLObject api_special_p(final SubLObject operator) {
        return list_utilities.sublisp_boolean(Hashtables.gethash(operator, utilities_macros.$api_special_table$.getGlobalValue(), (SubLObject)utilities_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 5853L)
    public static SubLObject api_special_handler(final SubLObject operator) {
        return Hashtables.gethash(operator, utilities_macros.$api_special_table$.getGlobalValue(), (SubLObject)utilities_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 5951L)
    public static SubLObject register_api_special(final SubLObject operator, final SubLObject handler) {
        if (utilities_macros.NIL != api_predefined_function_p(operator) || utilities_macros.NIL != api_predefined_macro_p(operator)) {
            Errors.warn((SubLObject)utilities_macros.$str16$Registering__A_as_special_even_th, operator);
        }
        else {
            Hashtables.sethash(operator, utilities_macros.$api_special_table$.getGlobalValue(), handler);
        }
        return operator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 6359L)
    public static SubLObject api_predefined_function_p(final SubLObject operator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (utilities_macros.NIL != api_predefined_host_function_p(operator)) {
            return system_parameters.$permit_api_host_access$.getDynamicValue(thread);
        }
        return Hashtables.gethash(operator, utilities_macros.$api_predefined_function_table$.getGlobalValue(), (SubLObject)utilities_macros.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 6586L)
    public static SubLObject register_api_predefined_function(final SubLObject operator) {
        if (utilities_macros.NIL == api_special_p(operator)) {
            Hashtables.sethash(operator, utilities_macros.$api_predefined_function_table$.getGlobalValue(), (SubLObject)utilities_macros.T);
        }
        return operator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 6952L)
    public static SubLObject unregister_api_predefined_function(final SubLObject operator) {
        return Hashtables.remhash(operator, utilities_macros.$api_predefined_function_table$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 7170L)
    public static SubLObject api_predefined_host_function_p(final SubLObject operator) {
        return Hashtables.gethash(operator, utilities_macros.$api_predefined_host_function_table$.getGlobalValue(), (SubLObject)utilities_macros.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 7300L)
    public static SubLObject register_api_predefined_host_function(final SubLObject operator) {
        if (utilities_macros.NIL == api_special_p(operator)) {
            Hashtables.sethash(operator, utilities_macros.$api_predefined_host_function_table$.getGlobalValue(), (SubLObject)utilities_macros.T);
        }
        return operator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 7675L)
    public static SubLObject unregister_api_predefined_host_function(final SubLObject operator) {
        return Hashtables.remhash(operator, utilities_macros.$api_predefined_host_function_table$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 7897L)
    public static SubLObject api_predefined_macro_p(final SubLObject operator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (utilities_macros.NIL != api_predefined_host_macro_p(operator)) {
            return system_parameters.$permit_api_host_access$.getDynamicValue(thread);
        }
        return Hashtables.gethash(operator, utilities_macros.$api_predefined_macro_table$.getGlobalValue(), (SubLObject)utilities_macros.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 8115L)
    public static SubLObject register_api_predefined_macro(final SubLObject operator) {
        if (utilities_macros.NIL == api_special_p(operator)) {
            Hashtables.sethash(operator, utilities_macros.$api_predefined_macro_table$.getGlobalValue(), (SubLObject)utilities_macros.T);
        }
        return operator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 8458L)
    public static SubLObject unregister_api_predefined_macro(final SubLObject operator) {
        return Hashtables.remhash(operator, utilities_macros.$api_predefined_macro_table$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 8666L)
    public static SubLObject api_predefined_host_macro_p(final SubLObject operator) {
        return Hashtables.gethash(operator, utilities_macros.$api_predefined_host_macro_table$.getGlobalValue(), (SubLObject)utilities_macros.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 8790L)
    public static SubLObject register_api_predefined_host_macro(final SubLObject operator) {
        if (utilities_macros.NIL == api_special_p(operator)) {
            Hashtables.sethash(operator, utilities_macros.$api_predefined_host_macro_table$.getGlobalValue(), (SubLObject)utilities_macros.T);
        }
        return operator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 9171L)
    public static SubLObject unregister_api_predefined_host_macro(final SubLObject operator) {
        return Hashtables.remhash(operator, utilities_macros.$api_predefined_host_macro_table$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 9374L)
    public static SubLObject cyc_api_symbol_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(obj.isSymbol() && utilities_macros.NIL != Symbols.get(obj, (SubLObject)utilities_macros.$kw24$CYC_API_SYMBOL, (SubLObject)utilities_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 9549L)
    public static SubLObject register_cyc_api_symbol(final SubLObject name) {
        assert utilities_macros.NIL != Types.symbolp(name) : name;
        Symbols.put(name, (SubLObject)utilities_macros.$kw24$CYC_API_SYMBOL, (SubLObject)utilities_macros.T);
        if (utilities_macros.NIL == conses_high.member(name, utilities_macros.$api_symbols$.getGlobalValue(), (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED)) {
            utilities_macros.$api_symbols$.setGlobalValue((SubLObject)ConsesLow.cons(name, utilities_macros.$api_symbols$.getGlobalValue()));
        }
        return name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 9827L)
    public static SubLObject deregister_cyc_api_symbol(final SubLObject name) {
        assert utilities_macros.NIL != Types.symbolp(name) : name;
        Sequences.remove(name, utilities_macros.$api_symbols$.getGlobalValue(), (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED);
        return Symbols.remprop(name, (SubLObject)utilities_macros.$kw24$CYC_API_SYMBOL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 10099L)
    public static SubLObject cyc_api_args(final SubLObject name) {
        return Symbols.get(name, (SubLObject)utilities_macros.$kw26$CYC_API_ARGS, (SubLObject)utilities_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 10220L)
    public static SubLObject register_cyc_api_args(final SubLObject name, final SubLObject arglist) {
        assert utilities_macros.NIL != Types.symbolp(name) : name;
        assert utilities_macros.NIL != Types.listp(arglist) : arglist;
        Symbols.put(name, (SubLObject)utilities_macros.$kw26$CYC_API_ARGS, arglist);
        return name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 10505L)
    public static SubLObject deregister_cyc_api_args(final SubLObject name) {
        assert utilities_macros.NIL != Types.symbolp(name) : name;
        return Symbols.remprop(name, (SubLObject)utilities_macros.$kw26$CYC_API_ARGS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 10727L)
    public static SubLObject register_cyc_api_function_documentation(final SubLObject name, final SubLObject documentation_string) {
        assert utilities_macros.NIL != Types.symbolp(name) : name;
        assert utilities_macros.NIL != Types.stringp(documentation_string) : documentation_string;
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 11049L)
    public static SubLObject get_api_arg_types(final SubLObject name) {
        return Symbols.get(name, (SubLObject)utilities_macros.$kw27$CYC_API_ARG_TYPES, (SubLObject)utilities_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 11250L)
    public static SubLObject register_cyc_api_arg_types(final SubLObject name, final SubLObject argument_type_list) {
        assert utilities_macros.NIL != Types.symbolp(name) : name;
        assert utilities_macros.NIL != Types.listp(argument_type_list) : argument_type_list;
        Symbols.put(name, (SubLObject)utilities_macros.$kw27$CYC_API_ARG_TYPES, argument_type_list);
        return name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 11601L)
    public static SubLObject deregister_cyc_api_arg_types(final SubLObject name) {
        assert utilities_macros.NIL != Types.symbolp(name) : name;
        return Symbols.remprop(name, (SubLObject)utilities_macros.$kw27$CYC_API_ARG_TYPES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 11845L)
    public static SubLObject get_api_return_types(final SubLObject name) {
        return Symbols.get(name, (SubLObject)utilities_macros.$kw28$CYC_API_RETURN_TYPES, (SubLObject)utilities_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 12047L)
    public static SubLObject register_cyc_api_return_types(final SubLObject name, final SubLObject return_types) {
        assert utilities_macros.NIL != Types.symbolp(name) : name;
        assert utilities_macros.NIL != Types.listp(return_types) : return_types;
        SubLObject cdolist_list_var = return_types;
        SubLObject return_type = (SubLObject)utilities_macros.NIL;
        return_type = cdolist_list_var.first();
        while (utilities_macros.NIL != cdolist_list_var) {
            validate_return_type(return_type);
            cdolist_list_var = cdolist_list_var.rest();
            return_type = cdolist_list_var.first();
        }
        Symbols.put(name, (SubLObject)utilities_macros.$kw28$CYC_API_RETURN_TYPES, return_types);
        return name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 12402L)
    public static SubLObject deregister_cyc_api_return_types(final SubLObject name) {
        assert utilities_macros.NIL != Types.symbolp(name) : name;
        return Symbols.remprop(name, (SubLObject)utilities_macros.$kw28$CYC_API_RETURN_TYPES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 12678L)
    public static SubLObject parse_api_type_declarations(final SubLObject type_declarations) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject argument_types = parse_api_declarations_int(type_declarations, (SubLObject)utilities_macros.NIL);
        final SubLObject body_preamble = thread.secondMultipleValue();
        final SubLObject return_types = thread.thirdMultipleValue();
        final SubLObject replacements = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        return Values.values(argument_types, body_preamble, return_types);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 13130L)
    public static SubLObject parse_obsolete_api_declarations(final SubLObject declarations) {
        return parse_api_declarations_int(declarations, (SubLObject)utilities_macros.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 13428L)
    public static SubLObject parse_api_declarations_int(final SubLObject declarations, final SubLObject allow_replacementsP) {
        SubLObject replacements = (SubLObject)utilities_macros.NIL;
        SubLObject argument_types = (SubLObject)utilities_macros.NIL;
        SubLObject body_preamble = (SubLObject)utilities_macros.NIL;
        SubLObject return_types = (SubLObject)utilities_macros.NIL;
        SubLObject cdolist_list_var = declarations;
        SubLObject declaration = (SubLObject)utilities_macros.NIL;
        declaration = cdolist_list_var.first();
        while (utilities_macros.NIL != cdolist_list_var) {
            final SubLObject pcase_var = declaration.first();
            if (pcase_var.eql((SubLObject)utilities_macros.$kw30$REPLACEMENTS)) {
                if (utilities_macros.NIL == allow_replacementsP) {
                    Errors.error((SubLObject)utilities_macros.$str31$_replacements_not_allowed_in_the_);
                }
                replacements = declaration.rest();
            }
            else if (pcase_var.eql((SubLObject)utilities_macros.$kw32$ARGUMENT_TYPES)) {
                SubLObject cdolist_list_var_$3;
                argument_types = (cdolist_list_var_$3 = declaration.rest());
                SubLObject argument_type = (SubLObject)utilities_macros.NIL;
                argument_type = cdolist_list_var_$3.first();
                while (utilities_macros.NIL != cdolist_list_var_$3) {
                    body_preamble = ConsesLow.append(body_preamble, (SubLObject)ConsesLow.list(expand_into_enforce_type(argument_type)));
                    cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                    argument_type = cdolist_list_var_$3.first();
                }
            }
            else if (pcase_var.eql((SubLObject)utilities_macros.$kw33$RETURN_TYPES)) {
                return_types = declaration.rest();
            }
            cdolist_list_var = cdolist_list_var.rest();
            declaration = cdolist_list_var.first();
        }
        return Values.values(argument_types, body_preamble, return_types, replacements);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 14529L)
    public static SubLObject expand_into_enforce_type(final SubLObject argument_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject argument = argument_type.first();
        final SubLObject predicate_expression = conses_high.second(argument_type);
        SubLObject predicate = (SubLObject)utilities_macros.NIL;
        if (predicate_expression.isAtom()) {
            if (utilities_macros.NIL == conses_high.member(predicate_expression, utilities_macros.$api_types$.getGlobalValue(), (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED)) {
                utilities_macros.$api_types$.setGlobalValue((SubLObject)ConsesLow.cons(predicate_expression, utilities_macros.$api_types$.getGlobalValue()));
            }
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym34$ENFORCE_TYPE, argument, predicate_expression);
        }
        if (utilities_macros.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && predicate_expression.first() != utilities_macros.$sym35$NIL_OR) {
            Errors.error((SubLObject)utilities_macros.$str36$Invalid_argument_type_expression_, argument_type);
        }
        predicate = conses_high.second(predicate_expression);
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym37$PWHEN, argument, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym34$ENFORCE_TYPE, argument, predicate));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 15347L)
    public static SubLObject validate_return_type(final SubLObject return_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (return_type.isAtom()) {
            if (utilities_macros.NIL == conses_high.member(return_type, utilities_macros.$api_types$.getGlobalValue(), (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED)) {
                utilities_macros.$api_types$.setGlobalValue((SubLObject)ConsesLow.cons(return_type, utilities_macros.$api_types$.getGlobalValue()));
            }
            return (SubLObject)utilities_macros.T;
        }
        if (utilities_macros.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !Sequences.length(return_type).eql((SubLObject)utilities_macros.TWO_INTEGER)) {
            Errors.error((SubLObject)utilities_macros.$str38$_S_return_type_expression_not_lis, return_type);
        }
        if (utilities_macros.NIL != conses_high.member(return_type.first(), (SubLObject)utilities_macros.$list39, (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED)) {
            return validate_return_type(conses_high.second(return_type));
        }
        Errors.error((SubLObject)utilities_macros.$str40$_S_complex_return_type_expression, return_type);
        return (SubLObject)utilities_macros.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 16006L)
    public static SubLObject define_after_adding(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)utilities_macros.NIL;
        SubLObject arglist = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list7);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list7);
        arglist = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym42$DEFINE_KB, name, arglist, ConsesLow.append(body, (SubLObject)utilities_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 16296L)
    public static SubLObject define_after_removing(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)utilities_macros.NIL;
        SubLObject arglist = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list7);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list7);
        arglist = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym42$DEFINE_KB, name, arglist, ConsesLow.append(body, (SubLObject)utilities_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 16531L)
    public static SubLObject define_rule_after_adding(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)utilities_macros.NIL;
        SubLObject arglist = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list7);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list7);
        arglist = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym42$DEFINE_KB, name, arglist, ConsesLow.append(body, (SubLObject)utilities_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 16769L)
    public static SubLObject define_rule_after_removing(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)utilities_macros.NIL;
        SubLObject arglist = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list7);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list7);
        arglist = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym42$DEFINE_KB, name, arglist, ConsesLow.append(body, (SubLObject)utilities_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 17013L)
    public static SubLObject define_collection_defn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)utilities_macros.NIL;
        SubLObject arglist = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list7);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list7);
        arglist = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym42$DEFINE_KB, name, arglist, ConsesLow.append(body, (SubLObject)utilities_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 17167L)
    public static SubLObject define_evaluation_defn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)utilities_macros.NIL;
        SubLObject pattern = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list48);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list48);
        pattern = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym42$DEFINE_KB, name, pattern, ConsesLow.append(body, (SubLObject)utilities_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 17320L)
    public static SubLObject define_expansion_defn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)utilities_macros.NIL;
        SubLObject pattern = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list48);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list48);
        pattern = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym42$DEFINE_KB, name, pattern, ConsesLow.append(body, (SubLObject)utilities_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 17471L)
    public static SubLObject define_cyc_subl_defn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject function_symbol = (SubLObject)utilities_macros.NIL;
        SubLObject basis_function = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list51);
        function_symbol = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list51);
        basis_function = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            final SubLObject arglist = (SubLObject)utilities_macros.$list52;
            final SubLObject body = (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym37$PWHEN, (SubLObject)utilities_macros.$list53, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym54$RET, reader.bq_cons(basis_function, (SubLObject)utilities_macros.$list55)));
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym42$DEFINE_KB, function_symbol, arglist, body);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list51);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 18132L)
    public static SubLObject define_kb(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)utilities_macros.NIL;
        SubLObject arglist = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list7);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list7);
        arglist = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym3$PROGN, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym56$DEFINE, name, arglist, ConsesLow.append(body, (SubLObject)utilities_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym57$REGISTER_KB_FUNCTION, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym6$QUOTE, name)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 18467L)
    public static SubLObject kb_function_p(final SubLObject symbol) {
        return Hashtables.gethash_without_values(symbol, utilities_macros.$kb_function_table$.getGlobalValue(), (SubLObject)utilities_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 18570L)
    public static SubLObject register_kb_symbol(final SubLObject symbol) {
        assert utilities_macros.NIL != Types.symbolp(symbol) : symbol;
        Hashtables.sethash(symbol, utilities_macros.$kb_function_table$.getGlobalValue(), (SubLObject)utilities_macros.T);
        return symbol;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 18782L)
    public static SubLObject deregister_kb_symbol(final SubLObject symbol) {
        assert utilities_macros.NIL != Types.symbolp(symbol) : symbol;
        return Hashtables.remhash(symbol, utilities_macros.$kb_function_table$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 18907L)
    public static SubLObject deregister_all_kb_functions() {
        Hashtables.clrhash(utilities_macros.$kb_function_table$.getGlobalValue());
        return (SubLObject)utilities_macros.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 19047L)
    public static SubLObject all_kb_functions() {
        SubLObject kb_functions = (SubLObject)utilities_macros.NIL;
        SubLObject symbol = (SubLObject)utilities_macros.NIL;
        SubLObject value = (SubLObject)utilities_macros.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(utilities_macros.$kb_function_table$.getGlobalValue());
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                symbol = Hashtables.getEntryKey(cdohash_entry);
                value = Hashtables.getEntryValue(cdohash_entry);
                kb_functions = (SubLObject)ConsesLow.cons(symbol, kb_functions);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        kb_functions = Sort.sort(kb_functions, Symbols.symbol_function((SubLObject)utilities_macros.$sym60$STRING_LESSP), Symbols.symbol_function((SubLObject)utilities_macros.$sym61$SYMBOL_NAME));
        return kb_functions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 19353L)
    public static SubLObject register_kb_function(final SubLObject function_symbol) {
        return register_kb_symbol(function_symbol);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 19561L)
    public static SubLObject deregister_kb_function(final SubLObject function_symbol) {
        return deregister_kb_symbol(function_symbol);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 19668L)
    public static SubLObject define_private_funcall(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)utilities_macros.NIL;
        SubLObject arglist = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list7);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list7);
        arglist = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym3$PROGN, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym63$DEFINE_PRIVATE, name, arglist, ConsesLow.append(body, (SubLObject)utilities_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym64$NOTE_FUNCALL_HELPER_FUNCTION, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym6$QUOTE, name)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 21543L)
    public static SubLObject note_funcall_helper_function(final SubLObject symbol) {
        Symbols.put(symbol, utilities_macros.$funcall_helper_property$.getGlobalValue(), (SubLObject)utilities_macros.T);
        return (SubLObject)utilities_macros.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 21765L)
    public static SubLObject funcall_helper_functionP(final SubLObject symbol) {
        return Symbols.get(symbol, utilities_macros.$funcall_helper_property$.getGlobalValue(), (SubLObject)utilities_macros.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 22429L)
    public static SubLObject unprovided_argumentP(final SubLObject arg) {
        return Equality.eq(arg, utilities_macros.$unprovided$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 22582L)
    public static SubLObject declare_control_parameter(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = (SubLObject)utilities_macros.NIL;
        SubLObject fancy_name = (SubLObject)utilities_macros.NIL;
        SubLObject description = (SubLObject)utilities_macros.NIL;
        SubLObject settings_spec = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list70);
        variable = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list70);
        fancy_name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list70);
        description = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list70);
        settings_spec = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym71$DECLARE_CONTROL_PARAMETER_INTERNAL, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym6$QUOTE, variable), fancy_name, description, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym6$QUOTE, settings_spec));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list70);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 23462L)
    public static SubLObject declare_control_parameter_internal(final SubLObject variable, final SubLObject fancy_name, final SubLObject description, final SubLObject settings_spec) {
        assert utilities_macros.NIL != Types.symbolp(variable) : variable;
        assert utilities_macros.NIL != Types.stringp(fancy_name) : fancy_name;
        assert utilities_macros.NIL != Types.stringp(description) : description;
        Symbols.put(variable, (SubLObject)utilities_macros.$kw72$FANCY_NAME, fancy_name);
        Symbols.put(variable, (SubLObject)utilities_macros.$kw73$DESCRIPTION, description);
        Symbols.put(variable, (SubLObject)utilities_macros.$kw74$SETTINGS_SPEC, settings_spec);
        return variable;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 23801L)
    public static SubLObject until_mapping_finished(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym75$CCATCH_IGNORE, (SubLObject)utilities_macros.$kw76$MAPPING_DONE, ConsesLow.append(body, (SubLObject)utilities_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 23956L)
    public static SubLObject mapping_finished() {
        Dynamic.sublisp_throw((SubLObject)utilities_macros.$kw76$MAPPING_DONE, (SubLObject)utilities_macros.NIL);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 24026L)
    public static SubLObject until_sbhl_mapping_finished(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym75$CCATCH_IGNORE, (SubLObject)utilities_macros.$kw77$SBHL_MAPPING_DONE, ConsesLow.append(body, (SubLObject)utilities_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 24133L)
    public static SubLObject sbhl_mapping_finished() {
        Dynamic.sublisp_throw((SubLObject)utilities_macros.$kw77$SBHL_MAPPING_DONE, (SubLObject)utilities_macros.NIL);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 24318L)
    public static SubLObject cfasl_write(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject obj = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list78);
        obj = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            return (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym79$WRITE_BYTE, obj, (SubLObject)utilities_macros.$list80);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list78);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 24389L)
    public static SubLObject cfasl_read(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        if (utilities_macros.NIL != datum) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.NIL);
        }
        return (SubLObject)utilities_macros.$list81;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 24458L)
    public static SubLObject if_lock_idle(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject lock = (SubLObject)utilities_macros.NIL;
        SubLObject action = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list82);
        lock = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list82);
        action = current.first();
        current = current.rest();
        final SubLObject else_action = (SubLObject)(current.isCons() ? current.first() : utilities_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)utilities_macros.$list82);
        current = current.rest();
        if (utilities_macros.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list82);
            return (SubLObject)utilities_macros.NIL;
        }
        final SubLObject lock_var = (SubLObject)utilities_macros.$sym83$LOCK_VAR;
        if (utilities_macros.NIL != else_action) {
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(lock_var, lock)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym85$PIF, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym86$LOCK_IDLE_P, lock_var), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym87$WITH_LOCK_HELD, (SubLObject)ConsesLow.list(lock_var), action), else_action));
        }
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(lock_var, lock)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym37$PWHEN, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym86$LOCK_IDLE_P, lock_var), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym87$WITH_LOCK_HELD, (SubLObject)ConsesLow.list(lock_var), action)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 25065L)
    public static SubLObject possibly_with_lock_held(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject lock = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list88);
        lock = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym85$PIF, lock, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym87$WITH_LOCK_HELD, (SubLObject)ConsesLow.list(lock), ConsesLow.append(body, (SubLObject)utilities_macros.NIL)), ConsesLow.append(body, (SubLObject)utilities_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 25251L)
    public static SubLObject defglobal_lock(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = (SubLObject)utilities_macros.NIL;
        SubLObject name = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list89);
        variable = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list89);
        name = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)utilities_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)utilities_macros.NIL;
        SubLObject current_$4 = (SubLObject)utilities_macros.NIL;
        while (utilities_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)utilities_macros.$list89);
            current_$4 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)utilities_macros.$list89);
            if (utilities_macros.NIL == conses_high.member(current_$4, (SubLObject)utilities_macros.$list90, (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED)) {
                bad = (SubLObject)utilities_macros.T;
            }
            if (current_$4 == utilities_macros.$kw91$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (utilities_macros.NIL != bad && utilities_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list89);
        }
        final SubLObject vaccess_tail = cdestructuring_bind.property_list_member((SubLObject)utilities_macros.$kw92$VACCESS, current);
        final SubLObject vaccess = (SubLObject)((utilities_macros.NIL != vaccess_tail) ? conses_high.cadr(vaccess_tail) : utilities_macros.NIL);
        final SubLObject documentation_tail = cdestructuring_bind.property_list_member((SubLObject)utilities_macros.$kw93$DOCUMENTATION, current);
        final SubLObject documentation = (SubLObject)((utilities_macros.NIL != documentation_tail) ? conses_high.cadr(documentation_tail) : utilities_macros.NIL);
        final SubLObject init_form = global_lock_initialization_form(name);
        return reader.bq_cons((SubLObject)utilities_macros.$sym3$PROGN, ConsesLow.append((SubLObject)((utilities_macros.NIL != vaccess) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym94$DECLAIM, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym95$VACCESS, vaccess, variable))) : utilities_macros.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym96$DEFGLOBAL, variable, init_form, ConsesLow.append((SubLObject)((utilities_macros.NIL != documentation) ? ConsesLow.list(documentation) : utilities_macros.NIL), (SubLObject)utilities_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym97$REGISTER_GLOBAL_LOCK, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym6$QUOTE, variable), name))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 25641L)
    public static SubLObject initialize_global_locks() {
        SubLObject cdolist_list_var = utilities_macros.$global_locks$.getGlobalValue();
        SubLObject pair = (SubLObject)utilities_macros.NIL;
        pair = cdolist_list_var.first();
        while (utilities_macros.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject global = (SubLObject)utilities_macros.NIL;
            SubLObject name = (SubLObject)utilities_macros.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list99);
            global = current.first();
            current = (name = current.rest());
            initialize_global_lock_internal(global, name);
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        }
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 25865L)
    public static SubLObject register_global_lock(final SubLObject global, final SubLObject name) {
        assert utilities_macros.NIL != Types.symbolp(global) : global;
        assert utilities_macros.NIL != Types.stringp(name) : name;
        utilities_macros.$global_locks$.setGlobalValue(Sequences.delete(global, utilities_macros.$global_locks$.getGlobalValue(), Symbols.symbol_function((SubLObject)utilities_macros.EQL), Symbols.symbol_function((SubLObject)utilities_macros.$sym100$CAR), (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED));
        utilities_macros.$global_locks$.setGlobalValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(global, name), utilities_macros.$global_locks$.getGlobalValue()));
        return utilities_macros.$global_locks$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 26223L)
    public static SubLObject global_lock_p(final SubLObject v_object) {
        return list_utilities.sublisp_boolean(conses_high.assoc(v_object, utilities_macros.$global_locks$.getGlobalValue(), (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 26311L)
    public static SubLObject global_lock_initialization_form(final SubLObject name) {
        assert utilities_macros.NIL != Types.stringp(name) : name;
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym101$MAKE_LOCK, name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 26423L)
    public static SubLObject initialize_global_lock(final SubLObject global) {
        assert utilities_macros.NIL != global_lock_p(global) : global;
        final SubLObject name = conses_high.assoc(global, utilities_macros.$global_locks$.getGlobalValue(), (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED).rest();
        if (name.isString()) {
            initialize_global_lock_internal(global, name);
        }
        return Symbols.symbol_value(global);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 26671L)
    public static SubLObject initialize_global_lock_internal(final SubLObject global, final SubLObject name) {
        final SubLObject init_form = global_lock_initialization_form(name);
        Eval.eval((SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym105$CSETQ, global, init_form));
        return Symbols.symbol_value(global);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 27019L)
    public static SubLObject defparameter_fi(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list107);
        variable = current.first();
        current = current.rest();
        final SubLObject initialization = (SubLObject)(current.isCons() ? current.first() : utilities_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)utilities_macros.$list107);
        current = current.rest();
        final SubLObject documentation = (SubLObject)(current.isCons() ? current.first() : utilities_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)utilities_macros.$list107);
        current = current.rest();
        if (utilities_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym3$PROGN, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym108$DEFPARAMETER_HTML, variable, initialization, documentation), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym109$CPUSHNEW, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym6$QUOTE, variable), (SubLObject)utilities_macros.$list110));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list107);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 27223L)
    public static SubLObject with_clean_fi_state(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym111$CPROGV, (SubLObject)utilities_macros.$sym106$_FI_STATE_VARIABLES_, (SubLObject)utilities_macros.$list112, ConsesLow.append(body, (SubLObject)utilities_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 27416L)
    public static SubLObject register_html_state_variable(final SubLObject variable) {
        if (utilities_macros.NIL == conses_high.member(variable, utilities_macros.$html_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)utilities_macros.EQL), Symbols.symbol_function((SubLObject)utilities_macros.IDENTITY))) {
            utilities_macros.$html_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(variable, utilities_macros.$html_state_variables$.getGlobalValue()));
        }
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 27534L)
    public static SubLObject defparameter_html(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list107);
        variable = current.first();
        current = current.rest();
        final SubLObject initialization = (SubLObject)(current.isCons() ? current.first() : utilities_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)utilities_macros.$list107);
        current = current.rest();
        final SubLObject documentation = (SubLObject)(current.isCons() ? current.first() : utilities_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)utilities_macros.$list107);
        current = current.rest();
        if (utilities_macros.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list107);
            return (SubLObject)utilities_macros.NIL;
        }
        if (utilities_macros.NIL != system_info.cyc_html_feature()) {
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym3$PROGN, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym114$DEFPARAMETER, variable, initialization, documentation), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym115$REGISTER_HTML_STATE_VARIABLE, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym6$QUOTE, variable)));
        }
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym114$DEFPARAMETER, variable, initialization, documentation);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 27849L)
    public static SubLObject defvar_html(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list107);
        variable = current.first();
        current = current.rest();
        final SubLObject initialization = (SubLObject)(current.isCons() ? current.first() : utilities_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)utilities_macros.$list107);
        current = current.rest();
        final SubLObject documentation = (SubLObject)(current.isCons() ? current.first() : utilities_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)utilities_macros.$list107);
        current = current.rest();
        if (utilities_macros.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list107);
            return (SubLObject)utilities_macros.NIL;
        }
        if (utilities_macros.NIL != system_info.cyc_html_feature()) {
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym3$PROGN, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym116$DEFVAR, variable, initialization, documentation), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym115$REGISTER_HTML_STATE_VARIABLE, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym6$QUOTE, variable)));
        }
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym116$DEFVAR, variable, initialization, documentation);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 28198L)
    public static SubLObject register_html_interface_variable(final SubLObject variable) {
        if (utilities_macros.NIL == conses_high.member(variable, utilities_macros.$html_interface_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)utilities_macros.EQL), Symbols.symbol_function((SubLObject)utilities_macros.IDENTITY))) {
            utilities_macros.$html_interface_variables$.setGlobalValue((SubLObject)ConsesLow.cons(variable, utilities_macros.$html_interface_variables$.getGlobalValue()));
        }
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 28324L)
    public static SubLObject defparameter_html_interface(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list107);
        variable = current.first();
        current = current.rest();
        final SubLObject initialization = (SubLObject)(current.isCons() ? current.first() : utilities_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)utilities_macros.$list107);
        current = current.rest();
        final SubLObject documentation = (SubLObject)(current.isCons() ? current.first() : utilities_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)utilities_macros.$list107);
        current = current.rest();
        if (utilities_macros.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list107);
            return (SubLObject)utilities_macros.NIL;
        }
        if (utilities_macros.NIL != system_info.cyc_html_feature()) {
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym3$PROGN, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym114$DEFPARAMETER, variable, initialization, documentation), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym115$REGISTER_HTML_STATE_VARIABLE, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym6$QUOTE, variable)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym118$REGISTER_HTML_INTERFACE_VARIABLE, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym6$QUOTE, variable)));
        }
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym114$DEFPARAMETER, variable, initialization, documentation);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 28703L)
    public static SubLObject defvar_html_interface(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list107);
        variable = current.first();
        current = current.rest();
        final SubLObject initialization = (SubLObject)(current.isCons() ? current.first() : utilities_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)utilities_macros.$list107);
        current = current.rest();
        final SubLObject documentation = (SubLObject)(current.isCons() ? current.first() : utilities_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)utilities_macros.$list107);
        current = current.rest();
        if (utilities_macros.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list107);
            return (SubLObject)utilities_macros.NIL;
        }
        if (utilities_macros.NIL != system_info.cyc_html_feature()) {
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym3$PROGN, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym116$DEFVAR, variable, initialization, documentation), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym115$REGISTER_HTML_STATE_VARIABLE, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym6$QUOTE, variable)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym118$REGISTER_HTML_INTERFACE_VARIABLE, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym6$QUOTE, variable)));
        }
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym116$DEFVAR, variable, initialization, documentation);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 29062L)
    public static SubLObject def_state_variable(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = (SubLObject)utilities_macros.NIL;
        SubLObject state_variables = (SubLObject)utilities_macros.NIL;
        SubLObject initialization = (SubLObject)utilities_macros.NIL;
        SubLObject documentation = (SubLObject)utilities_macros.NIL;
        SubLObject type = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list119);
        variable = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list119);
        state_variables = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list119);
        initialization = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list119);
        documentation = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list119);
        type = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            final SubLObject defop = define_operator_for_variable_type(type);
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym3$PROGN, (SubLObject)ConsesLow.listS(defop, variable, initialization, ConsesLow.append((SubLObject)((utilities_macros.NIL != documentation) ? ConsesLow.list(documentation) : utilities_macros.NIL), (SubLObject)utilities_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym109$CPUSHNEW, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym6$QUOTE, variable), state_variables));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list119);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 29896L)
    public static SubLObject note_state_variable_documentation(final SubLObject variable, final SubLObject documentation) {
        Symbols.put(variable, (SubLObject)utilities_macros.$kw122$VARIABLE_DOC, documentation);
        return variable;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 30078L)
    public static SubLObject define_operator_for_variable_type(final SubLObject variable_type) {
        SubLObject defop = (SubLObject)utilities_macros.NIL;
        if (variable_type.eql((SubLObject)utilities_macros.$kw123$VARIABLE)) {
            defop = (SubLObject)utilities_macros.$sym116$DEFVAR;
        }
        else if (variable_type.eql((SubLObject)utilities_macros.$kw124$PARAMETER)) {
            defop = (SubLObject)utilities_macros.$sym114$DEFPARAMETER;
        }
        else if (variable_type.eql((SubLObject)utilities_macros.$kw125$GLOBAL)) {
            defop = (SubLObject)utilities_macros.$sym96$DEFGLOBAL;
        }
        else if (variable_type.eql((SubLObject)utilities_macros.$kw126$LEXICAL)) {
            defop = (SubLObject)utilities_macros.$sym127$DEFLEXICAL;
        }
        else if (variable_type.eql((SubLObject)utilities_macros.$kw128$CONSTANT)) {
            defop = (SubLObject)utilities_macros.$sym129$DEFCONSTANT;
        }
        else if (variable_type.eql((SubLObject)utilities_macros.$kw130$PARAMETER_PRIVATE)) {
            defop = (SubLObject)utilities_macros.$sym131$DEFPARAMETER_PRIVATE;
        }
        else if (variable_type.eql((SubLObject)utilities_macros.$kw132$PARAMETER_PUBLIC)) {
            defop = (SubLObject)utilities_macros.$sym133$DEFPARAMETER_PUBLIC;
        }
        else if (variable_type.eql((SubLObject)utilities_macros.$kw134$PARAMETER_PROTECTECD)) {
            defop = (SubLObject)utilities_macros.$sym133$DEFPARAMETER_PUBLIC;
        }
        else {
            Errors.error((SubLObject)utilities_macros.$str135$unknown_variable_type__s__, variable_type);
        }
        return defop;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 30693L)
    public static SubLObject documentation(final SubLObject symbol, SubLObject type) {
        if (type == utilities_macros.UNPROVIDED) {
            type = (SubLObject)utilities_macros.$kw123$VARIABLE;
        }
        final SubLObject pcase_var = type;
        if (pcase_var.eql((SubLObject)utilities_macros.$kw123$VARIABLE)) {
            return Symbols.get(symbol, (SubLObject)utilities_macros.$kw122$VARIABLE_DOC, (SubLObject)utilities_macros.UNPROVIDED);
        }
        if (pcase_var.eql((SubLObject)utilities_macros.$kw136$FUNCTION)) {
            return Symbols.get(symbol, (SubLObject)utilities_macros.$kw137$FUNCTION_DOC, (SubLObject)utilities_macros.UNPROVIDED);
        }
        if (pcase_var.eql((SubLObject)utilities_macros.$kw138$STRUCTURE)) {
            return Symbols.get(symbol, (SubLObject)utilities_macros.$kw139$STRUCTURE_DOC, (SubLObject)utilities_macros.UNPROVIDED);
        }
        if (pcase_var.eql((SubLObject)utilities_macros.$kw140$TYPE)) {
            return Symbols.get(symbol, (SubLObject)utilities_macros.$kw141$TYPE_DOC, (SubLObject)utilities_macros.UNPROVIDED);
        }
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 31011L)
    public static SubLObject defvar_gt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list143);
        variable = current.first();
        current = current.rest();
        final SubLObject initialization = (SubLObject)(current.isCons() ? current.first() : utilities_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)utilities_macros.$list143);
        current = current.rest();
        final SubLObject documentation = (SubLObject)(current.isCons() ? current.first() : utilities_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)utilities_macros.$list143);
        current = current.rest();
        final SubLObject type = (SubLObject)(current.isCons() ? current.first() : utilities_macros.$kw124$PARAMETER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)utilities_macros.$list143);
        current = current.rest();
        if (utilities_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym121$DEF_STATE_VARIABLE, variable, (SubLObject)utilities_macros.$sym142$_GT_STATE_VARIABLES_, initialization, documentation, type);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list143);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 31238L)
    public static SubLObject defvar_at(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list143);
        variable = current.first();
        current = current.rest();
        final SubLObject initialization = (SubLObject)(current.isCons() ? current.first() : utilities_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)utilities_macros.$list143);
        current = current.rest();
        final SubLObject documentation = (SubLObject)(current.isCons() ? current.first() : utilities_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)utilities_macros.$list143);
        current = current.rest();
        final SubLObject type = (SubLObject)(current.isCons() ? current.first() : utilities_macros.$kw124$PARAMETER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)utilities_macros.$list143);
        current = current.rest();
        if (utilities_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym121$DEF_STATE_VARIABLE, variable, (SubLObject)utilities_macros.$sym144$_AT_STATE_VARIABLES_, initialization, documentation, type);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list143);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 31468L)
    public static SubLObject defvar_defn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list143);
        variable = current.first();
        current = current.rest();
        final SubLObject initialization = (SubLObject)(current.isCons() ? current.first() : utilities_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)utilities_macros.$list143);
        current = current.rest();
        final SubLObject documentation = (SubLObject)(current.isCons() ? current.first() : utilities_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)utilities_macros.$list143);
        current = current.rest();
        final SubLObject type = (SubLObject)(current.isCons() ? current.first() : utilities_macros.$kw124$PARAMETER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)utilities_macros.$list143);
        current = current.rest();
        if (utilities_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym121$DEF_STATE_VARIABLE, variable, (SubLObject)utilities_macros.$sym145$_DEFN_STATE_VARIABLES_, initialization, documentation, type);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list143);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 31662L)
    public static SubLObject defvar_kbi(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list146);
        variable = current.first();
        current = current.rest();
        final SubLObject initialization = (SubLObject)(current.isCons() ? current.first() : utilities_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)utilities_macros.$list146);
        current = current.rest();
        final SubLObject documentation = (SubLObject)(current.isCons() ? current.first() : utilities_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)utilities_macros.$list146);
        current = current.rest();
        final SubLObject type = (SubLObject)(current.isCons() ? current.first() : utilities_macros.$kw134$PARAMETER_PROTECTECD);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)utilities_macros.$list146);
        current = current.rest();
        if (utilities_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym121$DEF_STATE_VARIABLE, variable, (SubLObject)utilities_macros.$sym147$_KBI_STATE_VARIABLES_, initialization, documentation, type);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list146);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 31953L)
    public static SubLObject defvar_kbp(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list143);
        variable = current.first();
        current = current.rest();
        final SubLObject initialization = (SubLObject)(current.isCons() ? current.first() : utilities_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)utilities_macros.$list143);
        current = current.rest();
        final SubLObject documentation = (SubLObject)(current.isCons() ? current.first() : utilities_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)utilities_macros.$list143);
        current = current.rest();
        final SubLObject type = (SubLObject)(current.isCons() ? current.first() : utilities_macros.$kw124$PARAMETER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)utilities_macros.$list143);
        current = current.rest();
        if (utilities_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym121$DEF_STATE_VARIABLE, variable, (SubLObject)utilities_macros.$sym148$_KBP_STATE_VARIABLES_, initialization, documentation, type);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list143);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 32145L)
    public static SubLObject with_kbp_defaults(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)utilities_macros.$list149, ConsesLow.append(body, (SubLObject)utilities_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 32894L)
    public static SubLObject progn_cyc_api(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list150);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject machine = (SubLObject)utilities_macros.NIL;
        SubLObject port = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list150);
        machine = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list150);
        port = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym151$CYC_API_REMOTE_EVAL, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym6$QUOTE, reader.bq_cons((SubLObject)utilities_macros.$sym3$PROGN, ConsesLow.append(body, (SubLObject)utilities_macros.NIL))), machine, port);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list150);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 33125L)
    public static SubLObject with_forward_inference_environment(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list152);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject environment_$5 = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list152);
        environment_$5 = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym3$PROGN, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym153$CHECK_TYPE, environment_$5, (SubLObject)utilities_macros.$list154), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym155$_FORWARD_INFERENCE_ENVIRONMENT_, environment_$5)), ConsesLow.append(body, (SubLObject)utilities_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list152);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 33434L)
    public static SubLObject with_clean_forward_inference_environment(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject environment_$6 = (SubLObject)utilities_macros.$sym156$ENVIRONMENT;
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(environment_$6, (SubLObject)utilities_macros.$list157)), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym158$WITH_FORWARD_INFERENCE_ENVIRONMENT, (SubLObject)ConsesLow.list(environment_$6), ConsesLow.append(body, (SubLObject)utilities_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 33675L)
    public static SubLObject with_possibly_clean_forward_inference_environment(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject environment_$7 = (SubLObject)utilities_macros.$sym159$ENVIRONMENT;
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(environment_$7, (SubLObject)utilities_macros.$list160)), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym158$WITH_FORWARD_INFERENCE_ENVIRONMENT, (SubLObject)ConsesLow.list(environment_$7), ConsesLow.append(body, (SubLObject)utilities_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 33934L)
    public static SubLObject possibly_get_forward_inference_environment() {
        final SubLObject existing_environment = forward.current_forward_inference_environment();
        return (utilities_macros.NIL != misc_utilities.initialized_p(existing_environment)) ? existing_environment : forward.get_forward_inference_environment();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 34378L)
    public static SubLObject with_clean_forward_problem_store_environment(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)utilities_macros.$list163, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym164$CUNWIND_PROTECT, reader.bq_cons((SubLObject)utilities_macros.$sym3$PROGN, ConsesLow.append(body, (SubLObject)utilities_macros.NIL)), (SubLObject)utilities_macros.$list165));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 34809L)
    public static SubLObject with_normal_forward_inference_parameters(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)utilities_macros.$list166, ConsesLow.append(body, (SubLObject)utilities_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 35099L)
    public static SubLObject with_normal_forward_inference(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym167$WITH_NORMAL_FORWARD_INFERENCE_PARAMETERS, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym168$WITH_CLEAN_FORWARD_INFERENCE_ENVIRONMENT, reader.bq_cons((SubLObject)utilities_macros.$sym169$WITH_CLEAN_FORWARD_PROBLEM_STORE_ENVIRONMENT, ConsesLow.append(body, (SubLObject)utilities_macros.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 35479L)
    public static SubLObject within_normal_forward_inferenceP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(utilities_macros.NIL != kb_control_vars.within_forward_inferenceP() && utilities_macros.NIL == kb_control_vars.$within_assertion_forward_propagationP$.getDynamicValue(thread) && utilities_macros.NIL == control_vars.$prefer_forward_skolemization$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 35797L)
    public static SubLObject throw_unevaluatable_on_error(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject error = (SubLObject)utilities_macros.$sym170$ERROR;
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list(error), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym171$CATCH_ERROR_MESSAGE, (SubLObject)ConsesLow.list(error), ConsesLow.append(body, (SubLObject)utilities_macros.NIL)), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym37$PWHEN, error, (SubLObject)utilities_macros.$list172));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 36559L)
    public static SubLObject tracing_at_level(final SubLObject tracee, final SubLObject level) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject set_level = conses_high.assoc(tracee, utilities_macros.$tracing_level$.getDynamicValue(thread), (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED).rest();
        return (SubLObject)SubLObjectFactory.makeBoolean(level.isNumber() && set_level.isNumber() && set_level.isPositive() && set_level.numGE(level));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 36777L)
    public static SubLObject if_tracing(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list173);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject tracee = (SubLObject)utilities_macros.NIL;
        SubLObject level = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list173);
        tracee = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list173);
        level = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym37$PWHEN, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym174$TRACING_AT_LEVEL, tracee, level), ConsesLow.append(body, (SubLObject)utilities_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list173);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 37343L)
    public static SubLObject with_static_structure_resourcing(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject resourceP = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list175);
        resourceP = current.first();
        final SubLObject body;
        current = (body = current.rest());
        if (utilities_macros.NIL != Sequences.find((SubLObject)utilities_macros.$kw176$SL2JAVA, reader.$features$.getDynamicValue(thread), (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED)) {
            return reader.bq_cons((SubLObject)utilities_macros.$sym3$PROGN, ConsesLow.append(body, (SubLObject)utilities_macros.NIL));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym177$_STRUCTURE_RESOURCING_MAKE_STATIC_, resourceP)), ConsesLow.append(body, (SubLObject)utilities_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 37555L)
    public static SubLObject possibly_with_static_structure_resourcing(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        if (utilities_macros.NIL != Sequences.find((SubLObject)utilities_macros.$kw176$SL2JAVA, reader.$features$.getDynamicValue(thread), (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED)) {
            return reader.bq_cons((SubLObject)utilities_macros.$sym3$PROGN, ConsesLow.append(body, (SubLObject)utilities_macros.NIL));
        }
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym85$PIF, (SubLObject)utilities_macros.$sym177$_STRUCTURE_RESOURCING_MAKE_STATIC_, reader.bq_cons((SubLObject)utilities_macros.$sym178$WITH_STATIC_AREA, ConsesLow.append(body, (SubLObject)utilities_macros.NIL)), reader.bq_cons((SubLObject)utilities_macros.$sym3$PROGN, ConsesLow.append(body, (SubLObject)utilities_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 37809L)
    public static SubLObject define_structure_resource(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject structure = (SubLObject)utilities_macros.NIL;
        SubLObject link_slot = (SubLObject)utilities_macros.NIL;
        SubLObject mark_slot = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list179);
        structure = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list179);
        link_slot = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list179);
        mark_slot = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list179);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_object = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list179);
        v_object = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject struct_name = Symbols.symbol_name(structure);
            final SubLObject free_var = Packages.intern(PrintLow.format((SubLObject)utilities_macros.NIL, (SubLObject)utilities_macros.$str180$__A_FREE_LIST_, struct_name), (SubLObject)utilities_macros.UNPROVIDED);
            final SubLObject free_var_doc = PrintLow.format((SubLObject)utilities_macros.NIL, (SubLObject)utilities_macros.$str181$Free_list_for__A_objects, struct_name);
            final SubLObject lock_var = Packages.intern(PrintLow.format((SubLObject)utilities_macros.NIL, (SubLObject)utilities_macros.$str182$__A_FREE_LOCK_, struct_name), (SubLObject)utilities_macros.UNPROVIDED);
            final SubLObject lock_var_doc = PrintLow.format((SubLObject)utilities_macros.NIL, (SubLObject)utilities_macros.$str183$Lock_for__A_object_free_list, struct_name);
            final SubLObject lock_name = PrintLow.format((SubLObject)utilities_macros.NIL, (SubLObject)utilities_macros.$str184$_A_resource_lock, struct_name);
            final SubLObject make_static_func = Packages.intern(PrintLow.format((SubLObject)utilities_macros.NIL, (SubLObject)utilities_macros.$str185$MAKE_STATIC__A, struct_name), (SubLObject)utilities_macros.UNPROVIDED);
            final SubLObject make_static_func_doc = PrintLow.format((SubLObject)utilities_macros.NIL, (SubLObject)utilities_macros.$str186$Make_a_new__A_in_the_static_area, struct_name);
            final SubLObject init_func = Packages.intern(PrintLow.format((SubLObject)utilities_macros.NIL, (SubLObject)utilities_macros.$str187$INIT__A, struct_name), (SubLObject)utilities_macros.UNPROVIDED);
            final SubLObject init_func_doc = PrintLow.format((SubLObject)utilities_macros.NIL, (SubLObject)utilities_macros.$str188$Initialize_a__A_for_use, struct_name);
            final SubLObject get_func = Packages.intern(PrintLow.format((SubLObject)utilities_macros.NIL, (SubLObject)utilities_macros.$str189$GET__A, struct_name), (SubLObject)utilities_macros.UNPROVIDED);
            final SubLObject get_func_doc = PrintLow.format((SubLObject)utilities_macros.NIL, (SubLObject)utilities_macros.$str190$Get_a__A_from_the_free_list__or_m, struct_name);
            final SubLObject free_pred = Packages.intern(PrintLow.format((SubLObject)utilities_macros.NIL, (SubLObject)utilities_macros.$str191$FREE__A_P, struct_name), (SubLObject)utilities_macros.UNPROVIDED);
            final SubLObject free_pred_doc = PrintLow.format((SubLObject)utilities_macros.NIL, (SubLObject)utilities_macros.$str192$Check_if_OBJECT_is_a__A_that_has_, struct_name);
            final SubLObject free_func = Packages.intern(PrintLow.format((SubLObject)utilities_macros.NIL, (SubLObject)utilities_macros.$str193$FREE__A, struct_name), (SubLObject)utilities_macros.UNPROVIDED);
            final SubLObject free_func_doc = PrintLow.format((SubLObject)utilities_macros.NIL, (SubLObject)utilities_macros.$str194$Place_a__A_onto_the_free_list, struct_name);
            final SubLObject make_func = Packages.intern(PrintLow.format((SubLObject)utilities_macros.NIL, (SubLObject)utilities_macros.$str195$MAKE__A, struct_name), (SubLObject)utilities_macros.UNPROVIDED);
            final SubLObject test_func = Packages.intern(PrintLow.format((SubLObject)utilities_macros.NIL, (SubLObject)utilities_macros.$str196$_A_P, struct_name), (SubLObject)utilities_macros.UNPROVIDED);
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym3$PROGN, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym197$DEFLEXICAL_PRIVATE, free_var, (SubLObject)utilities_macros.NIL, free_var_doc), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym197$DEFLEXICAL_PRIVATE, lock_var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym101$MAKE_LOCK, lock_name), lock_var_doc), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym63$DEFINE_PRIVATE, make_static_func, (SubLObject)utilities_macros.NIL, make_static_func_doc, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)utilities_macros.$list52, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym178$WITH_STATIC_AREA, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym105$CSETQ, (SubLObject)utilities_macros.$sym198$OBJECT, (SubLObject)ConsesLow.list(make_func))), (SubLObject)utilities_macros.$list199)), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym63$DEFINE_PRIVATE, init_func, (SubLObject)ConsesLow.list(v_object), init_func_doc, ConsesLow.append(body, (SubLObject)utilities_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym56$DEFINE, free_pred, (SubLObject)utilities_macros.$list52, free_pred_doc, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym54$RET, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym200$CAND, reader.bq_cons(test_func, (SubLObject)utilities_macros.$list52), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.EQ, reader.bq_cons(mark_slot, (SubLObject)utilities_macros.$list52), (SubLObject)utilities_macros.$list201)))), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym56$DEFINE, new SubLObject[] { free_func, utilities_macros.$list52, free_func_doc, ConsesLow.list((SubLObject)utilities_macros.$sym153$CHECK_TYPE, (SubLObject)utilities_macros.$sym198$OBJECT, test_func), ConsesLow.listS((SubLObject)utilities_macros.$sym202$PUNLESS, reader.bq_cons(free_pred, (SubLObject)utilities_macros.$list52), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym105$CSETQ, (SubLObject)utilities_macros.$sym198$OBJECT, reader.bq_cons(init_func, (SubLObject)utilities_macros.$list52)), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym203$CSETF, reader.bq_cons(mark_slot, (SubLObject)utilities_macros.$list52), (SubLObject)utilities_macros.$list201), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym37$PWHEN, (SubLObject)utilities_macros.$sym204$_STRUCTURE_RESOURCING_ENABLED_, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym87$WITH_LOCK_HELD, (SubLObject)ConsesLow.list(lock_var), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym203$CSETF, reader.bq_cons(link_slot, (SubLObject)utilities_macros.$list52), free_var), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym105$CSETQ, free_var, (SubLObject)utilities_macros.$list52))), (SubLObject)utilities_macros.$list205), utilities_macros.$list206 }), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym56$DEFINE, get_func, (SubLObject)utilities_macros.NIL, get_func_doc, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym202$PUNLESS, (SubLObject)utilities_macros.$sym204$_STRUCTURE_RESOURCING_ENABLED_, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym85$PIF, (SubLObject)utilities_macros.$sym177$_STRUCTURE_RESOURCING_MAKE_STATIC_, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym54$RET, (SubLObject)ConsesLow.list(init_func, (SubLObject)ConsesLow.list(make_static_func))), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym54$RET, (SubLObject)ConsesLow.list(init_func, (SubLObject)ConsesLow.list(make_func))))), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)utilities_macros.$list207, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym87$WITH_LOCK_HELD, (SubLObject)ConsesLow.list(lock_var), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym105$CSETQ, (SubLObject)utilities_macros.$sym198$OBJECT, free_var), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym208$CDO, (SubLObject)utilities_macros.NIL, (SubLObject)utilities_macros.$list209, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym85$PIF, reader.bq_cons(free_pred, (SubLObject)utilities_macros.$list52), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym3$PROGN, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym105$CSETQ, free_var, reader.bq_cons(link_slot, (SubLObject)utilities_macros.$list52)), (SubLObject)utilities_macros.$list210), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym105$CSETQ, (SubLObject)utilities_macros.$sym198$OBJECT, reader.bq_cons(link_slot, (SubLObject)utilities_macros.$list52)))), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym202$PUNLESS, (SubLObject)utilities_macros.$sym211$FOUND, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym85$PIF, (SubLObject)utilities_macros.$sym177$_STRUCTURE_RESOURCING_MAKE_STATIC_, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym105$CSETQ, (SubLObject)utilities_macros.$sym198$OBJECT, (SubLObject)ConsesLow.list(make_static_func)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym105$CSETQ, (SubLObject)utilities_macros.$sym198$OBJECT, (SubLObject)ConsesLow.list(make_func))), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym105$CSETQ, free_var, (SubLObject)utilities_macros.$list212))), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym54$RET, reader.bq_cons(init_func, (SubLObject)utilities_macros.$list52)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list179);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 41550L)
    public static SubLObject with_readtime_eval_disabled(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)utilities_macros.$list213, ConsesLow.append(body, (SubLObject)utilities_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 42748L)
    public static SubLObject noting_progress(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject string = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list214);
        string = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject str = (SubLObject)utilities_macros.$sym215$STR;
        return (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list(str, string), utilities_macros.$list216, utilities_macros.$list217, utilities_macros.$list218, utilities_macros.$list219, utilities_macros.$list220, utilities_macros.$list221, utilities_macros.$list222, ConsesLow.list((SubLObject)utilities_macros.$sym223$_SILENT_PROGRESS__, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym224$FIF, str, (SubLObject)utilities_macros.$list225)) }), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym226$NOTING_PROGRESS_PREAMBLE, str), ConsesLow.append(body, (SubLObject)utilities_macros.$list227));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 43465L)
    public static SubLObject noting_progress_delayed(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject delayed_mode_seconds = (SubLObject)utilities_macros.NIL;
        SubLObject string = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list228);
        delayed_mode_seconds = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list228);
        string = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym229$_NOTING_PROGRESS_DELAYED_MODE_SECONDS_, delayed_mode_seconds), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym230$_NOTING_PROGRESS_DELAYED_MODE_STRING_, string)), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym231$NOTING_PROGRESS, string, ConsesLow.append(body, (SubLObject)utilities_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 43720L)
    public static SubLObject noting_progress_preamble(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (utilities_macros.NIL == utilities_macros.$silent_progressP$.getDynamicValue(thread) && utilities_macros.NIL == utilities_macros.$noting_progress_delayed_mode_seconds$.getDynamicValue(thread)) {
            if (utilities_macros.NIL != utilities_macros.$professional_progress_modeP$.getDynamicValue(thread)) {
                PrintLow.format(StreamsLow.$standard_output$.getDynamicValue(thread), (SubLObject)utilities_macros.$str232$___A, Strings.string_trim((SubLObject)utilities_macros.$list233, string));
            }
            else {
                PrintLow.format(StreamsLow.$standard_output$.getDynamicValue(thread), (SubLObject)utilities_macros.$str234$___A____, Strings.string_trim((SubLObject)utilities_macros.$list233, string));
            }
            streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
        }
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 44119L)
    public static SubLObject noting_progress_postamble() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (utilities_macros.NIL == utilities_macros.$silent_progressP$.getDynamicValue(thread)) {
            final SubLObject elapsed = subl_promotions.elapsed_universal_time(utilities_macros.$progress_start_time$.getDynamicValue(thread), (SubLObject)utilities_macros.UNPROVIDED);
            if (utilities_macros.NIL != utilities_macros.$noting_progress_delayed_mode_seconds$.getDynamicValue(thread)) {
                if (!subl_promotions.elapsed_universal_time(utilities_macros.$progress_last_pacification_time$.getDynamicValue(thread), (SubLObject)utilities_macros.UNPROVIDED).numGE(utilities_macros.$noting_progress_delayed_mode_seconds$.getDynamicValue(thread))) {
                    return (SubLObject)utilities_macros.NIL;
                }
                utilities_macros.$noting_progress_delayed_mode_seconds$.setDynamicValue((SubLObject)utilities_macros.NIL, thread);
                noting_progress_preamble(utilities_macros.$noting_progress_delayed_mode_string$.getDynamicValue(thread));
            }
            if (utilities_macros.NIL != utilities_macros.$professional_progress_modeP$.getDynamicValue(thread)) {
                streams_high.write_string((SubLObject)utilities_macros.$str236$__, StreamsLow.$standard_output$.getDynamicValue(thread), (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED);
            }
            else {
                streams_high.write_string((SubLObject)utilities_macros.$str237$_DONE__, StreamsLow.$standard_output$.getDynamicValue(thread), (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED);
            }
            streams_high.write_string(numeric_date_utilities.elapsed_time_abbreviation_string(elapsed), StreamsLow.$standard_output$.getDynamicValue(thread), (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED);
            if (elapsed.numG((SubLObject)utilities_macros.$int238$600)) {
                PrintLow.format(StreamsLow.$standard_output$.getDynamicValue(thread), (SubLObject)utilities_macros.$str239$__ended__A, numeric_date_utilities.time_abbreviation_string((SubLObject)utilities_macros.UNPROVIDED));
            }
            streams_high.write_string((SubLObject)utilities_macros.$str240$_, StreamsLow.$standard_output$.getDynamicValue(thread), (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED);
            streams_high.terpri(StreamsLow.$standard_output$.getDynamicValue(thread));
            streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
        }
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 45061L)
    public static SubLObject note_progress() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (utilities_macros.NIL != utilities_macros.$is_noting_progressP$.getDynamicValue(thread) && utilities_macros.NIL == utilities_macros.$silent_progressP$.getDynamicValue(thread)) {
            utilities_macros.$progress_count$.setDynamicValue(Numbers.add(utilities_macros.$progress_count$.getDynamicValue(thread), (SubLObject)utilities_macros.ONE_INTEGER), thread);
            final SubLObject elapsed = subl_promotions.elapsed_universal_time(utilities_macros.$progress_last_pacification_time$.getDynamicValue(thread), (SubLObject)utilities_macros.UNPROVIDED);
            if (!elapsed.numLE(utilities_macros.$progress_elapsed_seconds_for_notification$.getDynamicValue(thread)) && (!utilities_macros.$noting_progress_delayed_mode_seconds$.getDynamicValue(thread).isNumber() || !elapsed.numLE(utilities_macros.$noting_progress_delayed_mode_seconds$.getDynamicValue(thread)) || utilities_macros.NIL != utilities_macros.$silent_progressP$.getDynamicValue(thread))) {
                if (utilities_macros.NIL != utilities_macros.$noting_progress_delayed_mode_seconds$.getDynamicValue(thread)) {
                    utilities_macros.$noting_progress_delayed_mode_seconds$.setDynamicValue((SubLObject)utilities_macros.NIL, thread);
                    noting_progress_preamble(utilities_macros.$noting_progress_delayed_mode_string$.getDynamicValue(thread));
                }
                utilities_macros.$progress_notification_count$.setDynamicValue(Numbers.add(utilities_macros.$progress_notification_count$.getDynamicValue(thread), (SubLObject)utilities_macros.ONE_INTEGER), thread);
                if (utilities_macros.$int242$50.eql(utilities_macros.$progress_notification_count$.getDynamicValue(thread))) {
                    utilities_macros.$progress_elapsed_seconds_for_notification$.setDynamicValue((SubLObject)utilities_macros.FIVE_INTEGER, thread);
                }
                else if (utilities_macros.$int20$100.eql(utilities_macros.$progress_notification_count$.getDynamicValue(thread))) {
                    utilities_macros.$progress_elapsed_seconds_for_notification$.setDynamicValue((SubLObject)utilities_macros.FIFTEEN_INTEGER, thread);
                }
                else if (utilities_macros.$int243$200.eql(utilities_macros.$progress_notification_count$.getDynamicValue(thread))) {
                    utilities_macros.$progress_elapsed_seconds_for_notification$.setDynamicValue((SubLObject)utilities_macros.$int244$30, thread);
                }
                utilities_macros.$progress_pacifications_since_last_nl$.setDynamicValue(Numbers.add(utilities_macros.$progress_pacifications_since_last_nl$.getDynamicValue(thread), (SubLObject)utilities_macros.ONE_INTEGER), thread);
                if (utilities_macros.$progress_pacifications_since_last_nl$.getDynamicValue(thread).numG((SubLObject)utilities_macros.$int245$25)) {
                    utilities_macros.$progress_pacifications_since_last_nl$.setDynamicValue((SubLObject)utilities_macros.ZERO_INTEGER, thread);
                    PrintLow.format(StreamsLow.$standard_output$.getDynamicValue(thread), (SubLObject)utilities_macros.$str246$__A_, utilities_macros.$progress_count$.getDynamicValue(thread));
                    streams_high.terpri(StreamsLow.$standard_output$.getDynamicValue(thread));
                }
                else {
                    PrintLow.format(StreamsLow.$standard_output$.getDynamicValue(thread), (SubLObject)utilities_macros.$str247$_);
                }
                streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
                utilities_macros.$progress_last_pacification_time$.setDynamicValue(Time.get_universal_time(), thread);
            }
        }
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 46679L)
    public static SubLObject noting_activity(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject string = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list214);
        string = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym3$PROGN, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym248$IGNORE, string), ConsesLow.append(body, (SubLObject)utilities_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 47408L)
    public static SubLObject noting_percent_progress(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject string = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list214);
        string = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)utilities_macros.$list249, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym164$CUNWIND_PROTECT, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym3$PROGN, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym250$NOTING_PERCENT_PROGRESS_PREAMBLE, string), ConsesLow.append(body, (SubLObject)utilities_macros.NIL)), (SubLObject)utilities_macros.$list251));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 47809L)
    public static SubLObject noting_percent_progress_delayed(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject delayed_mode_seconds = (SubLObject)utilities_macros.NIL;
        SubLObject string = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list228);
        delayed_mode_seconds = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list228);
        string = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym252$_PERCENT_PROGRESS_DELAYED_MODE_SECONDS_, delayed_mode_seconds), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym253$_PERCENT_PROGRESS_DELAYED_MODE_STRING_, string)), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym254$NOTING_PERCENT_PROGRESS, string, ConsesLow.append(body, (SubLObject)utilities_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 48089L)
    public static SubLObject noting_percent_progress_preamble(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (utilities_macros.NIL == utilities_macros.$silent_progressP$.getDynamicValue(thread) && utilities_macros.NIL == utilities_macros.$percent_progress_delayed_mode_seconds$.getDynamicValue(thread)) {
            PrintLow.format(StreamsLow.$standard_output$.getDynamicValue(thread), (SubLObject)utilities_macros.$str232$___A, Strings.string_trim((SubLObject)utilities_macros.$list233, string));
            streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
        }
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 48389L)
    public static SubLObject noting_percent_progress_postamble() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (utilities_macros.NIL == utilities_macros.$silent_progressP$.getDynamicValue(thread) && utilities_macros.NIL == utilities_macros.$percent_progress_delayed_mode_seconds$.getDynamicValue(thread)) {
            final SubLObject elapsed = subl_promotions.elapsed_universal_time(utilities_macros.$percent_progress_start_time$.getDynamicValue(thread), (SubLObject)utilities_macros.UNPROVIDED);
            if (utilities_macros.ZERO_INTEGER.eql(utilities_macros.$last_percent_progress_index$.getDynamicValue(thread)) && utilities_macros.NIL == utilities_macros.$professional_progress_modeP$.getDynamicValue(thread)) {
                streams_high.write_string((SubLObject)utilities_macros.$str256$____, StreamsLow.$standard_output$.getDynamicValue(thread), (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED);
            }
            if (utilities_macros.NIL != utilities_macros.$professional_progress_modeP$.getDynamicValue(thread)) {
                streams_high.write_string((SubLObject)utilities_macros.$str236$__, StreamsLow.$standard_output$.getDynamicValue(thread), (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED);
            }
            else {
                streams_high.write_string((SubLObject)utilities_macros.$str237$_DONE__, StreamsLow.$standard_output$.getDynamicValue(thread), (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED);
            }
            streams_high.write_string(numeric_date_utilities.elapsed_time_abbreviation_string(elapsed), StreamsLow.$standard_output$.getDynamicValue(thread), (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED);
            if (elapsed.numG((SubLObject)utilities_macros.$int238$600)) {
                PrintLow.format(StreamsLow.$standard_output$.getDynamicValue(thread), (SubLObject)utilities_macros.$str239$__ended__A, numeric_date_utilities.time_abbreviation_string((SubLObject)utilities_macros.UNPROVIDED));
            }
            streams_high.write_string((SubLObject)utilities_macros.$str240$_, StreamsLow.$standard_output$.getDynamicValue(thread), (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED);
            if (!utilities_macros.ZERO_INTEGER.eql(utilities_macros.$last_percent_progress_index$.getDynamicValue(thread))) {
                streams_high.write_string((SubLObject)utilities_macros.$str257$__, StreamsLow.$standard_output$.getDynamicValue(thread), (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED);
            }
            streams_high.terpri(StreamsLow.$standard_output$.getDynamicValue(thread));
            streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
        }
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 49578L)
    public static SubLObject note_percent_progress(final SubLObject index, final SubLObject max) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (utilities_macros.NIL == utilities_macros.$silent_progressP$.getDynamicValue(thread) && utilities_macros.NIL != utilities_macros.$within_noting_percent_progress$.getDynamicValue(thread) && utilities_macros.NIL != index) {
            SubLObject elapsed = (SubLObject)utilities_macros.NIL;
            if (utilities_macros.$percent_progress_delayed_mode_seconds$.getDynamicValue(thread).isNumber()) {
                if (utilities_macros.NIL == elapsed) {
                    elapsed = subl_promotions.elapsed_universal_time(utilities_macros.$percent_progress_start_time$.getDynamicValue(thread), (SubLObject)utilities_macros.UNPROVIDED);
                }
                if (elapsed.numGE(utilities_macros.$percent_progress_delayed_mode_seconds$.getDynamicValue(thread))) {
                    utilities_macros.$percent_progress_delayed_mode_seconds$.setDynamicValue((SubLObject)utilities_macros.NIL, thread);
                    noting_percent_progress_preamble(utilities_macros.$percent_progress_delayed_mode_string$.getDynamicValue(thread));
                }
            }
            if (!utilities_macros.$percent_progress_delayed_mode_seconds$.getDynamicValue(thread).isNumber()) {
                final SubLObject percent = compute_percent_progress(index, max);
                if (percent.numG(utilities_macros.$last_percent_progress_index$.getDynamicValue(thread))) {
                    if (utilities_macros.NIL == elapsed) {
                        elapsed = subl_promotions.elapsed_universal_time(utilities_macros.$percent_progress_start_time$.getDynamicValue(thread), (SubLObject)utilities_macros.UNPROVIDED);
                    }
                    if (!elapsed.numLE(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread))) {
                        if (utilities_macros.ZERO_INTEGER.eql(utilities_macros.$last_percent_progress_index$.getDynamicValue(thread))) {
                            if (utilities_macros.NIL == utilities_macros.$professional_progress_modeP$.getDynamicValue(thread)) {
                                streams_high.terpri(StreamsLow.$standard_output$.getDynamicValue(thread));
                            }
                            streams_high.write_string((SubLObject)utilities_macros.$str259$__, StreamsLow.$standard_output$.getDynamicValue(thread), (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED);
                            streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
                        }
                        final SubLObject predicted_total_seconds = Numbers.truncate(Numbers.multiply(elapsed, (SubLObject)utilities_macros.$int20$100), percent);
                        if ((percent.numE((SubLObject)utilities_macros.ONE_INTEGER) || index.numE((SubLObject)utilities_macros.ONE_INTEGER)) && predicted_total_seconds.numGE(Numbers.multiply((SubLObject)utilities_macros.FIVE_INTEGER, numeric_date_utilities.$seconds_in_a_minute$.getGlobalValue()))) {
                            if (utilities_macros.NIL != utilities_macros.$professional_progress_modeP$.getDynamicValue(thread)) {
                                streams_high.terpri(StreamsLow.$standard_output$.getDynamicValue(thread));
                                streams_high.write_string((SubLObject)utilities_macros.$str260$__, StreamsLow.$standard_output$.getDynamicValue(thread), (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED);
                            }
                            streams_high.write_string((SubLObject)utilities_macros.$str261$01_, StreamsLow.$standard_output$.getDynamicValue(thread), (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED);
                            possibly_note_percent_progress_prediction(elapsed, predicted_total_seconds, (SubLObject)utilities_macros.$int262$300, (SubLObject)utilities_macros.$int238$600);
                        }
                        else if ((percent.numE((SubLObject)utilities_macros.TWO_INTEGER) || index.numE((SubLObject)utilities_macros.TWO_INTEGER)) && predicted_total_seconds.numGE(Numbers.multiply((SubLObject)utilities_macros.TEN_INTEGER, numeric_date_utilities.$seconds_in_a_minute$.getGlobalValue()))) {
                            streams_high.write_string((SubLObject)utilities_macros.$str263$02_, StreamsLow.$standard_output$.getDynamicValue(thread), (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED);
                            possibly_note_percent_progress_prediction(elapsed, predicted_total_seconds, (SubLObject)utilities_macros.$int262$300, (SubLObject)utilities_macros.$int238$600);
                        }
                        else if (!predicted_total_seconds.numLE((SubLObject)utilities_macros.TWO_INTEGER)) {
                            if (max.numL((SubLObject)utilities_macros.TEN_INTEGER)) {
                                print_progress_percent(percent);
                            }
                            else if (!predicted_total_seconds.numLE((SubLObject)utilities_macros.FIVE_INTEGER)) {
                                if (Numbers.mod(percent, (SubLObject)utilities_macros.TEN_INTEGER).numE((SubLObject)utilities_macros.ZERO_INTEGER)) {
                                    print_progress_percent(percent);
                                    possibly_note_percent_progress_prediction(elapsed, predicted_total_seconds, (SubLObject)utilities_macros.$int238$600, (SubLObject)utilities_macros.$int264$1200);
                                }
                                else if (max.numL((SubLObject)utilities_macros.$int244$30)) {
                                    if (Numbers.mod(index, Numbers.ash(max, (SubLObject)utilities_macros.$int265$_2)).numE((SubLObject)utilities_macros.ZERO_INTEGER)) {
                                        print_progress_percent(percent);
                                    }
                                    else {
                                        streams_high.write_string((SubLObject)utilities_macros.$str247$_, StreamsLow.$standard_output$.getDynamicValue(thread), (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED);
                                    }
                                }
                                else if (!predicted_total_seconds.numLE((SubLObject)utilities_macros.TWENTY_INTEGER)) {
                                    if (Numbers.mod(percent, (SubLObject)utilities_macros.TWO_INTEGER).numE((SubLObject)utilities_macros.ZERO_INTEGER)) {
                                        streams_high.write_string((SubLObject)utilities_macros.$str247$_, StreamsLow.$standard_output$.getDynamicValue(thread), (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED);
                                    }
                                    if (utilities_macros.$last_percent_progress_prediction$.getDynamicValue(thread).isNumber()) {
                                        final SubLObject threshold = Numbers.add(utilities_macros.$last_percent_progress_prediction$.getDynamicValue(thread), Numbers.integerDivide(utilities_macros.$last_percent_progress_prediction$.getDynamicValue(thread), (SubLObject)utilities_macros.TEN_INTEGER));
                                        if (predicted_total_seconds.numG(threshold)) {
                                            print_progress_percent(percent);
                                            possibly_note_percent_progress_prediction(elapsed, predicted_total_seconds, threshold, (SubLObject)utilities_macros.$int264$1200);
                                        }
                                    }
                                }
                            }
                        }
                        streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
                        utilities_macros.$last_percent_progress_index$.setDynamicValue(percent, thread);
                    }
                }
            }
        }
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 52968L)
    public static SubLObject print_progress_percent(final SubLObject percent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        streams_high.write_string((SubLObject)utilities_macros.$str266$_, StreamsLow.$standard_output$.getDynamicValue(thread), (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED);
        print_2_digit_nonnegative_integer(percent, StreamsLow.$standard_output$.getDynamicValue(thread));
        streams_high.write_string((SubLObject)utilities_macros.$str267$_, StreamsLow.$standard_output$.getDynamicValue(thread), (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 53285L)
    public static SubLObject print_2_digit_nonnegative_integer(final SubLObject integer, final SubLObject stream) {
        if (integer.numL((SubLObject)utilities_macros.TEN_INTEGER)) {
            streams_high.write_string((SubLObject)utilities_macros.$str268$0, stream, (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED);
        }
        streams_high.write_string(print_high.princ_to_string(integer), stream, (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED);
        return integer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 53477L)
    public static SubLObject possibly_note_percent_progress_prediction(final SubLObject elapsed, final SubLObject predicted_total_seconds, final SubLObject threshhold, SubLObject show_ending_threshold) {
        if (show_ending_threshold == utilities_macros.UNPROVIDED) {
            show_ending_threshold = (SubLObject)utilities_macros.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (predicted_total_seconds.numG(threshhold) && predicted_total_seconds.numG(elapsed)) {
            final SubLObject note_string = Sequences.cconcatenate((SubLObject)utilities_macros.$str236$__, new SubLObject[] { format_nil.format_nil_a_no_copy(numeric_date_utilities.elapsed_time_abbreviation_string(elapsed)), utilities_macros.$str269$_of_, format_nil.$format_nil_tilde$.getGlobalValue(), format_nil.format_nil_a_no_copy(numeric_date_utilities.elapsed_time_abbreviation_string(predicted_total_seconds)) });
            streams_high.write_string(note_string, StreamsLow.$standard_output$.getDynamicValue(thread), (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED);
            if (show_ending_threshold.isInteger() && predicted_total_seconds.numG(show_ending_threshold)) {
                streams_high.write_string((SubLObject)utilities_macros.$str270$__ending__, StreamsLow.$standard_output$.getDynamicValue(thread), (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED);
                streams_high.write_string(numeric_date_utilities.time_abbreviation_string(Numbers.add(utilities_macros.$percent_progress_start_time$.getDynamicValue(thread), predicted_total_seconds)), StreamsLow.$standard_output$.getDynamicValue(thread), (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED);
            }
            streams_high.write_string((SubLObject)utilities_macros.$str240$_, StreamsLow.$standard_output$.getDynamicValue(thread), (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED);
            streams_high.terpri(StreamsLow.$standard_output$.getDynamicValue(thread));
            streams_high.write_string((SubLObject)utilities_macros.$str260$__, StreamsLow.$standard_output$.getDynamicValue(thread), (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED);
            utilities_macros.$last_percent_progress_prediction$.setDynamicValue(predicted_total_seconds, thread);
            return (SubLObject)utilities_macros.T;
        }
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 54454L)
    public static SubLObject compute_percent_progress(SubLObject index, SubLObject max) {
        if (max.numLE((SubLObject)utilities_macros.ZERO_INTEGER) || index.numLE((SubLObject)utilities_macros.ZERO_INTEGER)) {
            return (SubLObject)utilities_macros.ZERO_INTEGER;
        }
        if (index.numGE(max)) {
            return (SubLObject)utilities_macros.$int20$100;
        }
        final SubLObject target_length = (SubLObject)utilities_macros.TEN_INTEGER;
        final SubLObject current_length = Numbers.integer_length(max);
        final SubLObject scale_factor = Numbers.subtract(target_length, current_length);
        if (scale_factor.isNegative()) {
            index = Numbers.ash(index, scale_factor);
            max = Numbers.ash(max, scale_factor);
        }
        return Numbers.min((SubLObject)utilities_macros.$int271$99, Numbers.integerDivide(Numbers.multiply((SubLObject)utilities_macros.$int20$100, index), max));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 55382L)
    public static SubLObject progress() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject current = Time.get_universal_time();
        PrintLow.format((SubLObject)utilities_macros.T, (SubLObject)utilities_macros.$str273$___A____D_of__D___02D___Done_at__, new SubLObject[] { utilities_macros.$progress_note$.getDynamicValue(thread), utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread), Numbers.integerDivide(Numbers.multiply(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)utilities_macros.$int20$100), utilities_macros.$progress_total$.getDynamicValue(thread)), utilities_macros.$progress_sofar$.getDynamicValue(thread).numE((SubLObject)utilities_macros.ZERO_INTEGER) ? utilities_macros.$str274$whenever : numeric_date_utilities.timestring(Numbers.add(utilities_macros.$progress_start_time$.getDynamicValue(thread), Numbers.integerDivide(Numbers.multiply(utilities_macros.$progress_total$.getDynamicValue(thread), Numbers.subtract(current, utilities_macros.$progress_start_time$.getDynamicValue(thread))), utilities_macros.$progress_sofar$.getDynamicValue(thread)))) });
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 55820L)
    public static SubLObject progress_cdotimes(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list275);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)utilities_macros.NIL;
        SubLObject total = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list275);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list275);
        total = current.first();
        current = current.rest();
        final SubLObject message = (SubLObject)(current.isCons() ? current.first() : utilities_macros.$str276$cdotimes);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)utilities_macros.$list275);
        current = current.rest();
        if (utilities_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym3$PROGN, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.listS((SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym277$_PROGRESS_NOTE_, message), (SubLObject)utilities_macros.$list216, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym278$_PROGRESS_TOTAL_, total), (SubLObject)utilities_macros.$list279), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym254$NOTING_PERCENT_PROGRESS, (SubLObject)utilities_macros.$sym277$_PROGRESS_NOTE_, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym280$CDOTIMES, reader.bq_cons(var, (SubLObject)utilities_macros.$list281), ConsesLow.append(body, (SubLObject)utilities_macros.$list282)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list275);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 56247L)
    public static SubLObject progress_csome(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list283);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)utilities_macros.NIL;
        SubLObject list = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list283);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list283);
        list = current.first();
        current = current.rest();
        final SubLObject message = (SubLObject)(current.isCons() ? current.first() : utilities_macros.$str284$cdolist);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)utilities_macros.$list283);
        current = current.rest();
        final SubLObject endvar = (SubLObject)(current.isCons() ? current.first() : utilities_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)utilities_macros.$list283);
        current = current.rest();
        if (utilities_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject list_var = (SubLObject)utilities_macros.$sym285$LIST_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.listS((SubLObject)ConsesLow.list(list_var, list), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym277$_PROGRESS_NOTE_, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym224$FIF, message, message, (SubLObject)utilities_macros.$list286)), (SubLObject)utilities_macros.$list216, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym278$_PROGRESS_TOTAL_, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym287$LENGTH, list_var)), (SubLObject)utilities_macros.$list279), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym254$NOTING_PERCENT_PROGRESS, (SubLObject)utilities_macros.$sym277$_PROGRESS_NOTE_, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym288$CSOME, (SubLObject)ConsesLow.list(var, list_var, endvar), ConsesLow.append(body, (SubLObject)utilities_macros.$list282))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list283);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 56760L)
    public static SubLObject progress_cdolist(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list290);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)utilities_macros.NIL;
        SubLObject list = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list290);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list290);
        list = current.first();
        current = current.rest();
        final SubLObject message = (SubLObject)(current.isCons() ? current.first() : utilities_macros.$str284$cdolist);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)utilities_macros.$list290);
        current = current.rest();
        if (utilities_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym291$PROGRESS_CSOME, (SubLObject)ConsesLow.list(var, list, message), ConsesLow.append(body, (SubLObject)utilities_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list290);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 56910L)
    public static SubLObject possibly_progress_cdolist(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list292);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)utilities_macros.NIL;
        SubLObject list = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list292);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list292);
        list = current.first();
        current = current.rest();
        final SubLObject message = (SubLObject)(current.isCons() ? current.first() : utilities_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)utilities_macros.$list292);
        current = current.rest();
        if (utilities_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject message_var = (SubLObject)utilities_macros.$sym293$MESSAGE_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(message_var, message)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym85$PIF, message_var, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym289$PROGRESS_CDOLIST, (SubLObject)ConsesLow.list(var, list, message), ConsesLow.append(body, (SubLObject)utilities_macros.NIL)), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym294$CDOLIST, (SubLObject)ConsesLow.list(var, list), ConsesLow.append(body, (SubLObject)utilities_macros.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list292);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 57282L)
    public static SubLObject progress_cdohash(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list295);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = (SubLObject)utilities_macros.NIL;
        SubLObject val = (SubLObject)utilities_macros.NIL;
        SubLObject table = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list295);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list295);
        val = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list295);
        table = current.first();
        current = current.rest();
        final SubLObject message = (SubLObject)(current.isCons() ? current.first() : utilities_macros.$str296$cdohash);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)utilities_macros.$list295);
        current = current.rest();
        if (utilities_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject table_var = (SubLObject)utilities_macros.$sym297$TABLE_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.listS((SubLObject)ConsesLow.list(table_var, table), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym277$_PROGRESS_NOTE_, message), (SubLObject)utilities_macros.$list216, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym278$_PROGRESS_TOTAL_, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym298$HASH_TABLE_COUNT, table_var)), (SubLObject)utilities_macros.$list279), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym254$NOTING_PERCENT_PROGRESS, (SubLObject)utilities_macros.$sym277$_PROGRESS_NOTE_, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym299$CDOHASH, (SubLObject)ConsesLow.list(key, val, table_var), ConsesLow.append(body, (SubLObject)utilities_macros.$list282))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list295);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 57777L)
    public static SubLObject progress_do_set(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list300);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject elem = (SubLObject)utilities_macros.NIL;
        SubLObject v_set = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list300);
        elem = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list300);
        v_set = current.first();
        current = current.rest();
        final SubLObject message = (SubLObject)(current.isCons() ? current.first() : utilities_macros.$str301$do_set);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)utilities_macros.$list300);
        current = current.rest();
        if (utilities_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject set_var = (SubLObject)utilities_macros.$sym302$SET_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.listS((SubLObject)ConsesLow.list(set_var, v_set), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym277$_PROGRESS_NOTE_, message), (SubLObject)utilities_macros.$list216, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym278$_PROGRESS_TOTAL_, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym303$SET_SIZE, set_var)), (SubLObject)utilities_macros.$list279), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym254$NOTING_PERCENT_PROGRESS, (SubLObject)utilities_macros.$sym277$_PROGRESS_NOTE_, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym304$DO_SET, (SubLObject)ConsesLow.list(elem, set_var), ConsesLow.append(body, (SubLObject)utilities_macros.$list282))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list300);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 58242L)
    public static SubLObject noting_elapsed_time(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list305);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)utilities_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)utilities_macros.NIL;
        SubLObject current_$8 = (SubLObject)utilities_macros.NIL;
        while (utilities_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)utilities_macros.$list305);
            current_$8 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)utilities_macros.$list305);
            if (utilities_macros.NIL == conses_high.member(current_$8, (SubLObject)utilities_macros.$list306, (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED)) {
                bad = (SubLObject)utilities_macros.T;
            }
            if (current_$8 == utilities_macros.$kw91$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (utilities_macros.NIL != bad && utilities_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list305);
        }
        final SubLObject message_tail = cdestructuring_bind.property_list_member((SubLObject)utilities_macros.$kw307$MESSAGE, current);
        final SubLObject message = (SubLObject)((utilities_macros.NIL != message_tail) ? conses_high.cadr(message_tail) : utilities_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject message_var = (SubLObject)utilities_macros.$sym308$MESSAGE_VAR;
        final SubLObject start_time = (SubLObject)utilities_macros.$sym309$START_TIME;
        return (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(message_var, message), (SubLObject)ConsesLow.list(start_time, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym310$NOTING_ELAPSED_TIME_PREAMBLE, message_var))), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym311$NOTING_ELAPSED_TIME_POSTAMBLE, message_var, start_time))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 58595L)
    public static SubLObject noting_elapsed_time_preamble(final SubLObject message) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (utilities_macros.NIL == utilities_macros.$silent_progressP$.getDynamicValue(thread) && utilities_macros.NIL != message) {
            final SubLObject start_time = Time.get_universal_time();
            PrintLow.format(StreamsLow.$standard_output$.getDynamicValue(thread), (SubLObject)utilities_macros.$str313$___A_started__at__A, message, numeric_date_utilities.timestring(start_time));
            streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
            return start_time;
        }
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 58938L)
    public static SubLObject noting_elapsed_time_postamble(final SubLObject message, final SubLObject start_time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (utilities_macros.NIL == utilities_macros.$silent_progressP$.getDynamicValue(thread) && utilities_macros.NIL != message) {
            final SubLObject end_time = Time.get_universal_time();
            PrintLow.format(StreamsLow.$standard_output$.getDynamicValue(thread), (SubLObject)utilities_macros.$str314$___A_finished_at__A_after_A, new SubLObject[] { message, numeric_date_utilities.timestring(end_time), numeric_date_utilities.elapsed_seconds_string(Numbers.subtract(end_time, start_time)) });
            streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
        }
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 59330L)
    public static SubLObject with_cyc_server_handling(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym315$WITH_SUBLISP_ERROR_HANDLING, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)utilities_macros.$list316, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym164$CUNWIND_PROTECT, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym3$PROGN, (SubLObject)utilities_macros.$list317, reader.bq_cons((SubLObject)utilities_macros.$sym3$PROGN, ConsesLow.append(body, (SubLObject)utilities_macros.NIL))), (SubLObject)utilities_macros.$list318)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 60042L)
    public static SubLObject with_cyc_io_syntax(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return with_cyc_io_syntax_internal(body);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 60415L)
    public static SubLObject with_cyc_io_syntax_internal(final SubLObject body) {
        return (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)utilities_macros.$list319, ConsesLow.append(body, (SubLObject)utilities_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 60598L)
    public static SubLObject with_sublisp_runtime_assumptions(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym320$WITH_CYC_SERVER_HANDLING, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym321$WITH_CYC_IO_SYNTAX, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)utilities_macros.$list322, ConsesLow.append(body, (SubLObject)utilities_macros.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 60981L)
    public static SubLObject with_the_cyclist(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list323);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject cyclist = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list323);
        cyclist = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject old_cyclist = (SubLObject)utilities_macros.$sym324$OLD_CYCLIST;
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(old_cyclist, (SubLObject)utilities_macros.$list325)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym164$CUNWIND_PROTECT, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym3$PROGN, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym326$SET_THE_CYCLIST, cyclist), ConsesLow.append(body, (SubLObject)utilities_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym326$SET_THE_CYCLIST, old_cyclist)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list323);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 61556L)
    public static SubLObject with_different_cyclist(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list323);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject cyclist = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list323);
        cyclist = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)utilities_macros.$list327, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym326$SET_THE_CYCLIST, cyclist), ConsesLow.append(body, (SubLObject)utilities_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list323);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 61852L)
    public static SubLObject do_bindings(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject el_variables = (SubLObject)utilities_macros.NIL;
        SubLObject v_bindings = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list328);
        el_variables = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list328);
        v_bindings = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject binding = (SubLObject)utilities_macros.$sym329$BINDING;
        final SubLObject var_specs = do_bindings_var_specs(el_variables, binding);
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym294$CDOLIST, (SubLObject)ConsesLow.list(binding, v_bindings), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym84$CLET, ConsesLow.append(var_specs, (SubLObject)utilities_macros.NIL), ConsesLow.append(body, (SubLObject)utilities_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 62271L)
    public static SubLObject do_bindings_var_specs(final SubLObject el_variables, final SubLObject iteration_var) {
        SubLObject var_specs = (SubLObject)utilities_macros.NIL;
        SubLObject cdolist_list_var = el_variables;
        SubLObject el_variable = (SubLObject)utilities_macros.NIL;
        el_variable = cdolist_list_var.first();
        while (utilities_macros.NIL != cdolist_list_var) {
            SubLObject local_var = (SubLObject)utilities_macros.NIL;
            SubLObject binding_var = (SubLObject)utilities_macros.NIL;
            if (el_variable.isCons()) {
                local_var = el_variable.first();
                binding_var = conses_high.second(el_variable);
            }
            else {
                local_var = el_variable;
                binding_var = el_variable;
            }
            var_specs = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(local_var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym330$SUBLIS, iteration_var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym6$QUOTE, binding_var))), var_specs);
            cdolist_list_var = cdolist_list_var.rest();
            el_variable = cdolist_list_var.first();
        }
        return Sequences.nreverse(var_specs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 63271L)
    public static SubLObject fast_singleton_macro_p(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject list = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list334);
        list = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym335$NULL, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym336$CDR, list));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list334);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 64477L)
    public static SubLObject pluralityP(final SubLObject list) {
        return (SubLObject)SubLObjectFactory.makeBoolean(list.isCons() && list.rest().isCons());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 64916L)
    public static SubLObject fast_plurality_macro_p(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject list = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list334);
        list = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym337$CONSP, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym336$CDR, list));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list334);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 65482L)
    public static SubLObject cdosublists(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list338);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)utilities_macros.NIL;
        SubLObject list_expression = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list338);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list338);
        list_expression = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            if (!var.isSymbol()) {
                Errors.error(utilities_macros.$util_var_error_format_string$.getDynamicValue(thread), (SubLObject)utilities_macros.$sym339$CDOSUBLISTS, var);
            }
            return (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym208$CDO, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var, list_expression, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym336$CDR, var))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym335$NULL, var)), body);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list338);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 66384L)
    public static SubLObject cdolist_and_sublists(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list340);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject element_var = (SubLObject)utilities_macros.NIL;
        SubLObject sublist_var = (SubLObject)utilities_macros.NIL;
        SubLObject list_expression = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list340);
        element_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list340);
        sublist_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list340);
        list_expression = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            if (!element_var.isSymbol()) {
                Errors.error(utilities_macros.$util_var_error_format_string$.getDynamicValue(thread), (SubLObject)utilities_macros.$sym341$CDOLIST_AND_SUBLISTS, element_var);
            }
            if (!sublist_var.isSymbol()) {
                Errors.error(utilities_macros.$util_var_error_format_string$.getDynamicValue(thread), (SubLObject)utilities_macros.$sym341$CDOLIST_AND_SUBLISTS, sublist_var);
            }
            return (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym208$CDO, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(sublist_var, list_expression, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym336$CDR, sublist_var)), (SubLObject)ConsesLow.list(element_var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym100$CAR, sublist_var), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym100$CAR, sublist_var))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym335$NULL, sublist_var)), body);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list340);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 67834L)
    public static SubLObject cdolist_and_sublists_carefully(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list340);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject element_var = (SubLObject)utilities_macros.NIL;
        SubLObject sublist_var = (SubLObject)utilities_macros.NIL;
        SubLObject list_expression = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list340);
        element_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list340);
        sublist_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list340);
        list_expression = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            if (!element_var.isSymbol()) {
                Errors.error(utilities_macros.$util_var_error_format_string$.getDynamicValue(thread), (SubLObject)utilities_macros.$sym341$CDOLIST_AND_SUBLISTS, element_var);
            }
            if (!sublist_var.isSymbol()) {
                Errors.error(utilities_macros.$util_var_error_format_string$.getDynamicValue(thread), (SubLObject)utilities_macros.$sym341$CDOLIST_AND_SUBLISTS, sublist_var);
            }
            final SubLObject next_cons_var = Symbols.make_symbol((SubLObject)utilities_macros.$str342$next_cons_var);
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list(next_cons_var), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym208$CDO, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(sublist_var, list_expression, next_cons_var), (SubLObject)ConsesLow.list(element_var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym100$CAR, sublist_var), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym100$CAR, sublist_var))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym335$NULL, sublist_var)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym105$CSETQ, next_cons_var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym336$CDR, sublist_var)), body));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list340);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 69114L)
    public static SubLObject cdo_possibly_dotted_list(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list343);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject element_var = (SubLObject)utilities_macros.NIL;
        SubLObject list_expression = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list343);
        element_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list343);
        list_expression = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject sublist_var = Symbols.make_symbol((SubLObject)utilities_macros.$str344$sublist);
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(element_var, (SubLObject)utilities_macros.$list212), (SubLObject)ConsesLow.list(sublist_var, list_expression)), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym345$WHILE, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym337$CONSP, sublist_var), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym105$CSETQ, element_var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym100$CAR, sublist_var)), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym105$CSETQ, sublist_var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym336$CDR, sublist_var))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list343);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 69865L)
    public static SubLObject cdolist_if(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list346);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)utilities_macros.NIL;
        SubLObject predicate = (SubLObject)utilities_macros.NIL;
        SubLObject list_expression = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list346);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list346);
        predicate = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list346);
        list_expression = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            if (!var.isSymbol()) {
                Errors.error(utilities_macros.$util_var_error_format_string$.getDynamicValue(thread), (SubLObject)utilities_macros.$sym347$CDOLIST_IF, var);
            }
            if (!var.isSymbol()) {
                Errors.error(utilities_macros.$util_func_error_format_string$.getDynamicValue(thread), (SubLObject)utilities_macros.$sym347$CDOLIST_IF, predicate);
            }
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym294$CDOLIST, (SubLObject)ConsesLow.list(var, list_expression), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym37$PWHEN, (SubLObject)ConsesLow.list(predicate, var), body));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list346);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 70873L)
    public static SubLObject cdosublists_if(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list346);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)utilities_macros.NIL;
        SubLObject predicate = (SubLObject)utilities_macros.NIL;
        SubLObject list_expression = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list346);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list346);
        predicate = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list346);
        list_expression = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            if (!var.isSymbol()) {
                Errors.error(utilities_macros.$util_var_error_format_string$.getDynamicValue(thread), (SubLObject)utilities_macros.$sym348$CDOSUBLISTS_IF, var);
            }
            if (!var.isSymbol()) {
                Errors.error(utilities_macros.$util_func_error_format_string$.getDynamicValue(thread), (SubLObject)utilities_macros.$sym348$CDOSUBLISTS_IF, predicate);
            }
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym208$CDO, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var, list_expression, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym336$CDR, var))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym335$NULL, var)), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym37$PWHEN, (SubLObject)ConsesLow.list(predicate, var), body));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list346);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 72143L)
    public static SubLObject cdolist_if_not(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list346);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)utilities_macros.NIL;
        SubLObject predicate = (SubLObject)utilities_macros.NIL;
        SubLObject list_expression = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list346);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list346);
        predicate = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list346);
        list_expression = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            if (!var.isSymbol()) {
                Errors.error(utilities_macros.$util_var_error_format_string$.getDynamicValue(thread), (SubLObject)utilities_macros.$sym349$CDOLIST_IF_NOT, var);
            }
            if (!var.isSymbol()) {
                Errors.error(utilities_macros.$util_func_error_format_string$.getDynamicValue(thread), (SubLObject)utilities_macros.$sym349$CDOLIST_IF_NOT, predicate);
            }
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym294$CDOLIST, (SubLObject)ConsesLow.list(var, list_expression), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym202$PUNLESS, (SubLObject)ConsesLow.list(predicate, var), body));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list346);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 73173L)
    public static SubLObject cdosublists_if_not(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list346);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)utilities_macros.NIL;
        SubLObject predicate = (SubLObject)utilities_macros.NIL;
        SubLObject list_expression = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list346);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list346);
        predicate = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list346);
        list_expression = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            if (!var.isSymbol()) {
                Errors.error(utilities_macros.$util_var_error_format_string$.getDynamicValue(thread), (SubLObject)utilities_macros.$sym350$CDOSUBLISTS_IF_NOT, var);
            }
            if (!var.isSymbol()) {
                Errors.error(utilities_macros.$util_func_error_format_string$.getDynamicValue(thread), (SubLObject)utilities_macros.$sym350$CDOSUBLISTS_IF_NOT, predicate);
            }
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym208$CDO, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var, list_expression, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym336$CDR, var))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym335$NULL, var)), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym202$PUNLESS, (SubLObject)ConsesLow.list(predicate, var), body));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list346);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 74286L)
    public static SubLObject cdo2lists(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list351);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var1 = (SubLObject)utilities_macros.NIL;
        SubLObject list1 = (SubLObject)utilities_macros.NIL;
        SubLObject var2 = (SubLObject)utilities_macros.NIL;
        SubLObject list2 = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list351);
        var1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list351);
        list1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list351);
        var2 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list351);
        list2 = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject sublist1_var = Symbols.make_symbol((SubLObject)utilities_macros.$str352$sublist1);
            final SubLObject sublist2_var = Symbols.make_symbol((SubLObject)utilities_macros.$str353$sublist2);
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(sublist1_var, list1), (SubLObject)ConsesLow.list(sublist2_var, list2), var1, var2), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym345$WHILE, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym200$CAND, sublist1_var, sublist2_var), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym105$CSETQ, var1, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym100$CAR, sublist1_var), var2, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym100$CAR, sublist2_var)), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym105$CSETQ, sublist1_var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym336$CDR, sublist1_var), sublist2_var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym336$CDR, sublist2_var))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list351);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 74748L)
    public static SubLObject cdotree(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list354);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)utilities_macros.NIL;
        SubLObject tree = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list354);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list354);
        tree = current.first();
        current = current.rest();
        final SubLObject search_type = (SubLObject)(current.isCons() ? current.first() : utilities_macros.$kw355$DEPTH_FIRST);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)utilities_macros.$list354);
        current = current.rest();
        final SubLObject visit_nils = (SubLObject)(current.isCons() ? current.first() : utilities_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)utilities_macros.$list354);
        current = current.rest();
        if (utilities_macros.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list354);
            return (SubLObject)utilities_macros.NIL;
        }
        final SubLObject body;
        current = (body = temp);
        if (!var.isSymbol()) {
            Errors.error(utilities_macros.$util_var_error_format_string$.getDynamicValue(thread), (SubLObject)utilities_macros.$sym356$CDOTREE, var);
        }
        if (search_type != utilities_macros.$kw355$DEPTH_FIRST && search_type != utilities_macros.$kw357$BREADTH_FIRST) {
            Errors.error(utilities_macros.$util_search_type_error_format_string$.getDynamicValue(thread), (SubLObject)utilities_macros.$sym356$CDOTREE, search_type);
        }
        final SubLObject tree_var = Symbols.make_symbol((SubLObject)utilities_macros.$str358$tree_var);
        final SubLObject cells_var = Symbols.make_symbol((SubLObject)utilities_macros.$str359$cells_var);
        if (search_type == utilities_macros.$kw357$BREADTH_FIRST) {
            final SubLObject tail_of_cells_var = Symbols.make_symbol((SubLObject)utilities_macros.$str360$tail_of_cells);
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(tree_var, tree)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym37$PWHEN, tree_var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(cells_var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym361$LIST, tree_var)), (SubLObject)ConsesLow.list(tail_of_cells_var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym362$LAST, cells_var))), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym208$CDO, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym100$CAR, cells_var), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym100$CAR, cells_var))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym335$NULL, cells_var)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym85$PIF, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym337$CONSP, var), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym3$PROGN, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym363$RPLACD, tail_of_cells_var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym361$LIST, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym100$CAR, var), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym336$CDR, var))), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym105$CSETQ, tail_of_cells_var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym362$LAST, tail_of_cells_var))), (SubLObject)((utilities_macros.NIL != visit_nils) ? reader.bq_cons((SubLObject)utilities_macros.$sym3$PROGN, body) : ConsesLow.listS((SubLObject)utilities_macros.$sym37$PWHEN, var, body))), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym105$CSETQ, cells_var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym336$CDR, cells_var))))));
        }
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(tree_var, tree)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym37$PWHEN, tree_var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(cells_var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym361$LIST, tree_var))), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym208$CDO, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym100$CAR, cells_var), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym100$CAR, cells_var))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym335$NULL, cells_var)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym105$CSETQ, cells_var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym336$CDR, cells_var)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym85$PIF, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym337$CONSP, var), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym3$PROGN, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym364$CPUSH, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym336$CDR, var), cells_var), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym364$CPUSH, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym100$CAR, var), cells_var)), (SubLObject)((utilities_macros.NIL != visit_nils) ? reader.bq_cons((SubLObject)utilities_macros.$sym3$PROGN, body) : ConsesLow.listS((SubLObject)utilities_macros.$sym37$PWHEN, var, body)))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 77493L)
    public static SubLObject cdotree_conses(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list365);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)utilities_macros.NIL;
        SubLObject tree = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list365);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list365);
        tree = current.first();
        current = current.rest();
        final SubLObject search_type = (SubLObject)(current.isCons() ? current.first() : utilities_macros.$kw355$DEPTH_FIRST);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)utilities_macros.$list365);
        current = current.rest();
        if (utilities_macros.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list365);
            return (SubLObject)utilities_macros.NIL;
        }
        final SubLObject body;
        current = (body = temp);
        if (!var.isSymbol()) {
            Errors.error(utilities_macros.$util_var_error_format_string$.getDynamicValue(thread), (SubLObject)utilities_macros.$sym366$CDOTREE_CONSES, var);
        }
        if (search_type != utilities_macros.$kw355$DEPTH_FIRST && search_type != utilities_macros.$kw357$BREADTH_FIRST) {
            Errors.error(utilities_macros.$util_search_type_error_format_string$.getDynamicValue(thread), (SubLObject)utilities_macros.$sym366$CDOTREE_CONSES, search_type);
        }
        final SubLObject tree_var = Symbols.make_symbol((SubLObject)utilities_macros.$str358$tree_var);
        final SubLObject cells_var = Symbols.make_symbol((SubLObject)utilities_macros.$str359$cells_var);
        if (search_type == utilities_macros.$kw357$BREADTH_FIRST) {
            final SubLObject tail_of_cells_var = Symbols.make_symbol((SubLObject)utilities_macros.$str367$tail_of_cells_var);
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(tree_var, tree)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym37$PWHEN, tree_var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(cells_var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym361$LIST, tree_var)), (SubLObject)ConsesLow.list(tail_of_cells_var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym362$LAST, cells_var))), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym208$CDO, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym100$CAR, cells_var), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym100$CAR, cells_var))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym335$NULL, cells_var)), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym37$PWHEN, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym337$CONSP, var), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym363$RPLACD, tail_of_cells_var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym361$LIST, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym100$CAR, var), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym336$CDR, var))), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym105$CSETQ, tail_of_cells_var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym362$LAST, tail_of_cells_var)), body), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym105$CSETQ, cells_var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym336$CDR, cells_var))))));
        }
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(tree_var, tree)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym37$PWHEN, tree_var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(cells_var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym361$LIST, tree_var))), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym208$CDO, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym100$CAR, cells_var), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym100$CAR, cells_var))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym335$NULL, cells_var)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym105$CSETQ, cells_var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym336$CDR, cells_var)), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym37$PWHEN, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym337$CONSP, var), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym364$CPUSH, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym336$CDR, var), cells_var), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym364$CPUSH, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym100$CAR, var), cells_var), body)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 79760L)
    public static SubLObject cdoplist(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list368);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject parameter = (SubLObject)utilities_macros.NIL;
        SubLObject value = (SubLObject)utilities_macros.NIL;
        SubLObject plist = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list368);
        parameter = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list368);
        value = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list368);
        plist = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym369$DO_PLIST, (SubLObject)ConsesLow.list(parameter, value, plist), ConsesLow.append(body, (SubLObject)utilities_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list368);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 80439L)
    public static SubLObject compositize_function_call(final SubLObject path, final SubLObject var, SubLObject cars_and_cdrs_only) {
        if (cars_and_cdrs_only == utilities_macros.UNPROVIDED) {
            cars_and_cdrs_only = (SubLObject)utilities_macros.NIL;
        }
        SubLObject result = var;
        SubLObject cdolist_list_var = (utilities_macros.NIL != cars_and_cdrs_only) ? simplify_car_and_cdr_path(Sequences.reverse(path)) : Sequences.reverse(path);
        SubLObject function_symbol = (SubLObject)utilities_macros.NIL;
        function_symbol = cdolist_list_var.first();
        while (utilities_macros.NIL != cdolist_list_var) {
            result = (SubLObject)ConsesLow.list(function_symbol, result);
            cdolist_list_var = cdolist_list_var.rest();
            function_symbol = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 81283L)
    public static SubLObject simplify_car_and_cdr_path(final SubLObject path) {
        if (utilities_macros.NIL == path) {
            return (SubLObject)utilities_macros.NIL;
        }
        if (utilities_macros.NIL == path.rest()) {
            return (SubLObject)ConsesLow.cons(path.first(), (SubLObject)utilities_macros.NIL);
        }
        final SubLObject first_op = path.first();
        final SubLObject second_op = conses_high.cadr(path);
        final SubLObject pcase_var = first_op;
        if (pcase_var.eql((SubLObject)utilities_macros.$sym100$CAR)) {
            final SubLObject pcase_var_$9 = second_op;
            if (pcase_var_$9.eql((SubLObject)utilities_macros.$sym100$CAR)) {
                return (SubLObject)ConsesLow.cons((SubLObject)utilities_macros.$sym370$CAAR, simplify_car_and_cdr_path(conses_high.cddr(path)));
            }
            if (pcase_var_$9.eql((SubLObject)utilities_macros.$sym336$CDR)) {
                return (SubLObject)ConsesLow.cons((SubLObject)utilities_macros.$sym371$CDAR, simplify_car_and_cdr_path(conses_high.cddr(path)));
            }
            return (SubLObject)ConsesLow.listS(first_op, second_op, simplify_car_and_cdr_path(conses_high.cddr(path)));
        }
        else {
            if (!pcase_var.eql((SubLObject)utilities_macros.$sym336$CDR)) {
                return (SubLObject)ConsesLow.listS(first_op, second_op, simplify_car_and_cdr_path(conses_high.cddr(path)));
            }
            final SubLObject pcase_var_$10 = second_op;
            if (pcase_var_$10.eql((SubLObject)utilities_macros.$sym100$CAR)) {
                return (SubLObject)ConsesLow.cons((SubLObject)utilities_macros.$sym372$CADR, simplify_car_and_cdr_path(conses_high.cddr(path)));
            }
            if (pcase_var_$10.eql((SubLObject)utilities_macros.$sym336$CDR)) {
                return (SubLObject)ConsesLow.cons((SubLObject)utilities_macros.$sym373$CDDR, simplify_car_and_cdr_path(conses_high.cddr(path)));
            }
            return (SubLObject)ConsesLow.listS(first_op, second_op, simplify_car_and_cdr_path(conses_high.cddr(path)));
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 82565L)
    public static SubLObject map_symbols_to_accessors(final SubLObject tree, final SubLObject var, final SubLObject path) {
        if (utilities_macros.NIL == tree) {
            return (SubLObject)utilities_macros.NIL;
        }
        if (tree.isSymbol()) {
            return (SubLObject)ConsesLow.list((SubLObject)((utilities_macros.NIL == path) ? ConsesLow.list(tree, var) : ConsesLow.list(tree, compositize_function_call(path, var, (SubLObject)utilities_macros.T))));
        }
        if (tree.isCons()) {
            return ConsesLow.nconc(map_symbols_to_accessors(tree.first(), var, (SubLObject)ConsesLow.cons((SubLObject)utilities_macros.$sym100$CAR, path)), map_symbols_to_accessors(tree.rest(), var, (SubLObject)ConsesLow.cons((SubLObject)utilities_macros.$sym336$CDR, path)));
        }
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 83274L)
    public static SubLObject cdestructuring_setq(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject pattern = (SubLObject)utilities_macros.NIL;
        SubLObject datum_$11 = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list374);
        pattern = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list374);
        datum_$11 = current.first();
        current = current.rest();
        if (utilities_macros.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list374);
            return (SubLObject)utilities_macros.NIL;
        }
        if (pattern.isCons() || (pattern.isSymbol() && utilities_macros.NIL != pattern)) {
            final SubLObject datum_evaluated_var = Symbols.make_symbol((SubLObject)utilities_macros.$str375$datum_evaluated_var);
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(datum_evaluated_var, datum_$11)), reader.bq_cons((SubLObject)utilities_macros.$sym105$CSETQ, Functions.apply(Symbols.symbol_function((SubLObject)utilities_macros.$sym376$NCONC), map_symbols_to_accessors(pattern, datum_evaluated_var, (SubLObject)utilities_macros.NIL))));
        }
        return datum_$11;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 83957L)
    public static SubLObject fast_funcall_no_value_check_args(final SubLObject function_form, final SubLObject function_name_list, final SubLObject args) {
        if (function_name_list.isList()) {
            SubLObject sublist = (SubLObject)utilities_macros.NIL;
            SubLObject element = (SubLObject)utilities_macros.NIL;
            sublist = function_name_list;
            element = sublist.first();
            while (sublist.isCons()) {
                if (!element.isSymbol()) {
                    Errors.error((SubLObject)utilities_macros.$str377$FAST_FUNCALL_NO_VALUE__contains_e);
                }
                if (!sublist.rest().isCons() && utilities_macros.NIL != sublist.rest()) {
                    Errors.error((SubLObject)utilities_macros.$str378$FAST_FUNCALL_NO_VALUE__cannot_acc);
                }
                sublist = sublist.rest();
                element = sublist.first();
            }
        }
        else {
            Errors.error((SubLObject)utilities_macros.$str379$FAST_FUNCALL_NO_VALUE__function_n);
        }
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 91607L)
    public static SubLObject fast_funcall_no_value(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject function_form = (SubLObject)utilities_macros.NIL;
        SubLObject function_name_list = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list380);
        function_form = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list380);
        function_name_list = current.first();
        final SubLObject args;
        current = (args = current.rest());
        fast_funcall_no_value_check_args(function_form, function_name_list, args);
        if (utilities_macros.NIL == function_name_list) {
            return (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym381$FUNCALL, function_form, args);
        }
        final SubLObject function_form_evaluated_var = function_form.isSymbol() ? function_form : Symbols.make_symbol((SubLObject)utilities_macros.$str382$function_form_evaluated_var);
        SubLObject case_list = (SubLObject)utilities_macros.NIL;
        SubLObject cdolist_list_var = function_name_list;
        SubLObject function_name = (SubLObject)utilities_macros.NIL;
        function_name = cdolist_list_var.first();
        while (utilities_macros.NIL != cdolist_list_var) {
            if (function_name.isSymbol()) {
                case_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(function_name, reader.bq_cons(function_name, conses_high.copy_tree(args))), case_list);
            }
            cdolist_list_var = cdolist_list_var.rest();
            function_name = cdolist_list_var.first();
        }
        if (utilities_macros.NIL == case_list) {
            return (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym381$FUNCALL, function_form, args);
        }
        final SubLObject body = (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym383$PCASE, function_form_evaluated_var, Sequences.nreverse((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym384$OTHERWISE, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym381$FUNCALL, function_form_evaluated_var, conses_high.copy_tree(args))), case_list)));
        if (function_form.eql(function_form_evaluated_var)) {
            return body;
        }
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(function_form_evaluated_var, function_form)), body);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 93535L)
    public static SubLObject fast_funcall_setq(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject var_to_set = (SubLObject)utilities_macros.NIL;
        SubLObject function_form = (SubLObject)utilities_macros.NIL;
        SubLObject function_name_list = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list385);
        var_to_set = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list385);
        function_form = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list385);
        function_name_list = current.first();
        final SubLObject args;
        current = (args = current.rest());
        if (utilities_macros.NIL == function_name_list) {
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym105$CSETQ, var_to_set, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym381$FUNCALL, function_form, args));
        }
        final SubLObject function_form_evaluated_var = function_form.isSymbol() ? function_form : Symbols.make_symbol((SubLObject)utilities_macros.$str382$function_form_evaluated_var);
        SubLObject case_list = (SubLObject)utilities_macros.NIL;
        SubLObject cdolist_list_var = function_name_list;
        SubLObject function_name = (SubLObject)utilities_macros.NIL;
        function_name = cdolist_list_var.first();
        while (utilities_macros.NIL != cdolist_list_var) {
            if (function_name.isSymbol()) {
                case_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(function_name, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym105$CSETQ, var_to_set, reader.bq_cons(function_name, conses_high.copy_tree(args)))), case_list);
            }
            cdolist_list_var = cdolist_list_var.rest();
            function_name = cdolist_list_var.first();
        }
        if (utilities_macros.NIL == case_list) {
            return (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym381$FUNCALL, function_form, args);
        }
        final SubLObject body = (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym383$PCASE, function_form_evaluated_var, Sequences.nreverse((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym384$OTHERWISE, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym105$CSETQ, var_to_set, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym381$FUNCALL, function_form_evaluated_var, conses_high.copy_tree(args)))), case_list)));
        if (function_form.eql(function_form_evaluated_var)) {
            return body;
        }
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(function_form_evaluated_var, function_form)), body);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 95542L)
    public static SubLObject generate_parallel_var_list(final SubLObject var_list) {
        SubLObject new_var_list = (SubLObject)utilities_macros.NIL;
        SubLObject cdolist_list_var = var_list;
        SubLObject var = (SubLObject)utilities_macros.NIL;
        var = cdolist_list_var.first();
        while (utilities_macros.NIL != cdolist_list_var) {
            new_var_list = (SubLObject)ConsesLow.cons(Symbols.make_symbol(Symbols.symbol_name(var)), new_var_list);
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        }
        return Sequences.nreverse(new_var_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 95900L)
    public static SubLObject generate_multiple_csetq(final SubLObject new_var_list, final SubLObject old_var_list) {
        SubLObject body_of_setq = (SubLObject)utilities_macros.NIL;
        SubLObject sub_new_var_list = (SubLObject)utilities_macros.NIL;
        SubLObject new_var = (SubLObject)utilities_macros.NIL;
        SubLObject sub_old_var_list = (SubLObject)utilities_macros.NIL;
        SubLObject old_var = (SubLObject)utilities_macros.NIL;
        sub_new_var_list = new_var_list;
        new_var = sub_new_var_list.first();
        sub_old_var_list = old_var_list;
        old_var = sub_old_var_list.first();
        while (utilities_macros.NIL != sub_new_var_list && utilities_macros.NIL != sub_old_var_list) {
            body_of_setq = (SubLObject)ConsesLow.cons(new_var, body_of_setq);
            body_of_setq = (SubLObject)ConsesLow.cons(old_var, body_of_setq);
            sub_new_var_list = sub_new_var_list.rest();
            new_var = sub_new_var_list.first();
            sub_old_var_list = sub_old_var_list.rest();
            old_var = sub_old_var_list.first();
        }
        return (SubLObject)((utilities_macros.NIL != body_of_setq) ? ConsesLow.cons((SubLObject)utilities_macros.$sym105$CSETQ, Sequences.nreverse(body_of_setq)) : utilities_macros.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 96785L)
    public static SubLObject fast_funcall_multiple_value_bind(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject vars_to_bind = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list386);
        vars_to_bind = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list386);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject function_form = (SubLObject)utilities_macros.NIL;
        SubLObject function_name_list = (SubLObject)utilities_macros.NIL;
        SubLObject args = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list386);
        function_form = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list386);
        function_name_list = current.first();
        current = (args = current.rest());
        final SubLObject body;
        current = (body = temp);
        if (utilities_macros.NIL == function_name_list) {
            return (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym387$CMULTIPLE_VALUE_BIND, vars_to_bind, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym381$FUNCALL, function_form, args), body);
        }
        final SubLObject function_form_evaluated_var = function_form.isSymbol() ? function_form : Symbols.make_symbol((SubLObject)utilities_macros.$str382$function_form_evaluated_var);
        SubLObject case_list = (SubLObject)utilities_macros.NIL;
        SubLObject cdolist_list_var = function_name_list;
        SubLObject function_name = (SubLObject)utilities_macros.NIL;
        function_name = cdolist_list_var.first();
        while (utilities_macros.NIL != cdolist_list_var) {
            if (function_name.isSymbol()) {
                case_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(function_name, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym387$CMULTIPLE_VALUE_BIND, vars_to_bind, reader.bq_cons(function_name, conses_high.copy_tree(args)), body)), case_list);
            }
            cdolist_list_var = cdolist_list_var.rest();
            function_name = cdolist_list_var.first();
        }
        if (utilities_macros.NIL == case_list) {
            return (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym381$FUNCALL, function_form, args);
        }
        final SubLObject v_answer = (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym383$PCASE, function_form_evaluated_var, Sequences.nreverse((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym384$OTHERWISE, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym387$CMULTIPLE_VALUE_BIND, vars_to_bind, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym381$FUNCALL, function_form_evaluated_var, conses_high.copy_tree(args)), body)), case_list)));
        if (function_form.eql(function_form_evaluated_var)) {
            return v_answer;
        }
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(function_form_evaluated_var, function_form)), v_answer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 98709L)
    public static SubLObject fast_funcall_multiple_value_setq(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject vars_to_set = (SubLObject)utilities_macros.NIL;
        SubLObject function_form = (SubLObject)utilities_macros.NIL;
        SubLObject function_name_list = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list388);
        vars_to_set = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list388);
        function_form = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list388);
        function_name_list = current.first();
        final SubLObject args;
        current = (args = current.rest());
        if (utilities_macros.NIL == function_name_list) {
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym389$CMULTIPLE_VALUE_SETQ, vars_to_set, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym381$FUNCALL, function_form, args));
        }
        final SubLObject function_form_evaluated_var = function_form.isSymbol() ? function_form : Symbols.make_symbol((SubLObject)utilities_macros.$str382$function_form_evaluated_var);
        SubLObject case_list = (SubLObject)utilities_macros.NIL;
        SubLObject cdolist_list_var = function_name_list;
        SubLObject function_name = (SubLObject)utilities_macros.NIL;
        function_name = cdolist_list_var.first();
        while (utilities_macros.NIL != cdolist_list_var) {
            if (function_name.isSymbol()) {
                case_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(function_name, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym389$CMULTIPLE_VALUE_SETQ, vars_to_set, reader.bq_cons(function_name, conses_high.copy_tree(args)))), case_list);
            }
            cdolist_list_var = cdolist_list_var.rest();
            function_name = cdolist_list_var.first();
        }
        if (utilities_macros.NIL == case_list) {
            return (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym381$FUNCALL, function_form, args);
        }
        final SubLObject body = (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym383$PCASE, function_form_evaluated_var, Sequences.nreverse((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym384$OTHERWISE, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym389$CMULTIPLE_VALUE_SETQ, vars_to_set, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym381$FUNCALL, function_form_evaluated_var, conses_high.copy_tree(args)))), case_list)));
        if (function_form.eql(function_form_evaluated_var)) {
            return body;
        }
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(function_form_evaluated_var, function_form)), body);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 100728L)
    public static SubLObject expand_destructuring_predication_generator(final SubLObject predication_structure, final SubLObject operand) {
        if (utilities_macros.NIL == predication_structure) {
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym335$NULL, operand);
        }
        if (predication_structure.isSymbol()) {
            return (SubLObject)ConsesLow.list(predication_structure, operand);
        }
        if (predication_structure.isAtom()) {
            return (SubLObject)utilities_macros.T;
        }
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym200$CAND, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym337$CONSP, operand), expand_destructuring_predication_generator(predication_structure.first(), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym100$CAR, operand)), expand_destructuring_predication_generator(predication_structure.rest(), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym336$CDR, operand)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 101236L)
    public static SubLObject funcall_shortcut(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject function = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list390);
        function = current.first();
        final SubLObject args;
        current = (args = current.rest());
        if (function.isCons() && utilities_macros.$sym6$QUOTE == function.first()) {
            return reader.bq_cons(conses_high.second(function), ConsesLow.append(args, (SubLObject)utilities_macros.NIL));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym381$FUNCALL, function, ConsesLow.append(args, (SubLObject)utilities_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 101566L)
    public static SubLObject destructuring_predication_generator(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject predication_structure = (SubLObject)utilities_macros.NIL;
        SubLObject operand = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list391);
        predication_structure = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list391);
        operand = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            return expand_destructuring_predication_generator(predication_structure, operand);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list391);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 102726L)
    public static SubLObject symbol_in_tree_p(final SubLObject symbol, final SubLObject tree) {
        if (utilities_macros.NIL == tree) {
            return (SubLObject)utilities_macros.NIL;
        }
        if (tree.isSymbol()) {
            return Equality.eq(symbol, tree);
        }
        if (tree.isCons()) {
            return (SubLObject)SubLObjectFactory.makeBoolean(utilities_macros.NIL != symbol_in_tree_p(symbol, tree.first()) || utilities_macros.NIL != symbol_in_tree_p(symbol, tree.rest()));
        }
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 102977L)
    public static SubLObject unquoted_symbol_in_tree_p(final SubLObject symbol, final SubLObject tree) {
        if (utilities_macros.NIL == tree) {
            return (SubLObject)utilities_macros.NIL;
        }
        if (tree.isSymbol()) {
            return Equality.eq(symbol, tree);
        }
        if (!tree.isCons()) {
            return (SubLObject)utilities_macros.NIL;
        }
        if (utilities_macros.NIL == conses_high.member(tree.first(), (SubLObject)utilities_macros.$list392, (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(utilities_macros.NIL != symbol_in_tree_p(symbol, tree.first()) || utilities_macros.NIL != symbol_in_tree_p(symbol, tree.rest()));
        }
        if (tree.rest().isCons() && conses_high.cadr(tree).isCons() && conses_high.cddr(tree).isList()) {
            SubLObject cdolist_list_var = conses_high.cddr(tree);
            SubLObject arg = (SubLObject)utilities_macros.NIL;
            arg = cdolist_list_var.first();
            while (utilities_macros.NIL != cdolist_list_var) {
                if (utilities_macros.NIL != unquoted_symbol_in_tree_p(symbol, arg)) {
                    return (SubLObject)utilities_macros.T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            }
            return (SubLObject)utilities_macros.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(utilities_macros.NIL != symbol_in_tree_p(symbol, tree.first()) || utilities_macros.NIL != symbol_in_tree_p(symbol, tree.rest()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 103657L)
    public static SubLObject generate_instance_variable_bindings_for_structure_slots(final SubLObject var, final SubLObject structure_expression, final SubLObject conc_name, final SubLObject instance_variables, final SubLObject body, SubLObject read_only) {
        if (read_only == utilities_macros.UNPROVIDED) {
            read_only = (SubLObject)utilities_macros.T;
        }
        SubLObject var_bindings = (SubLObject)utilities_macros.NIL;
        SubLObject update_expressions = (SubLObject)utilities_macros.NIL;
        final SubLObject preprocessed_conc_name = conc_name.isSymbol() ? Symbols.symbol_name(conc_name) : conc_name;
        SubLObject variable = (SubLObject)utilities_macros.NIL;
        SubLObject accessor = (SubLObject)utilities_macros.NIL;
        SubLObject explicit_getter = (SubLObject)utilities_macros.NIL;
        SubLObject explicit_setter = (SubLObject)utilities_macros.NIL;
        SubLObject cdolist_list_var = instance_variables;
        SubLObject instance_variable_form = (SubLObject)utilities_macros.NIL;
        instance_variable_form = cdolist_list_var.first();
        while (utilities_macros.NIL != cdolist_list_var) {
            if (instance_variable_form.isCons()) {
                variable = instance_variable_form.first();
                explicit_getter = conses_high.cadr(instance_variable_form);
                explicit_setter = conses_high.cddr(instance_variable_form).first();
                accessor = (SubLObject)utilities_macros.NIL;
            }
            else {
                variable = instance_variable_form;
                explicit_getter = (SubLObject)utilities_macros.NIL;
                explicit_setter = (SubLObject)utilities_macros.NIL;
                accessor = Packages.intern(PrintLow.format((SubLObject)utilities_macros.NIL, (SubLObject)utilities_macros.$str393$_A_S, preprocessed_conc_name, variable), (SubLObject)utilities_macros.UNPROVIDED);
            }
            if (utilities_macros.NIL != symbol_in_tree_p(variable, body)) {
                var_bindings = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(variable, (SubLObject)ConsesLow.list((utilities_macros.NIL != explicit_getter) ? explicit_getter : accessor, var)), var_bindings);
                if (utilities_macros.NIL == read_only) {
                    update_expressions = (SubLObject)ConsesLow.cons((SubLObject)((utilities_macros.NIL != explicit_setter) ? ConsesLow.list(explicit_setter, var, variable) : ConsesLow.list((SubLObject)utilities_macros.$sym203$CSETF, (SubLObject)ConsesLow.list(accessor, var), variable)), update_expressions);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            instance_variable_form = cdolist_list_var.first();
        }
        if (utilities_macros.NIL == var_bindings) {
            return reader.bq_cons((SubLObject)utilities_macros.$sym3$PROGN, body);
        }
        if (utilities_macros.NIL != read_only) {
            return (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym84$CLET, reader.bq_cons((SubLObject)ConsesLow.list(var, structure_expression), Sequences.reverse(var_bindings)), body);
        }
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, reader.bq_cons((SubLObject)ConsesLow.list(var, structure_expression), Sequences.reverse(var_bindings)), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym164$CUNWIND_PROTECT, reader.bq_cons((SubLObject)utilities_macros.$sym3$PROGN, body), Sequences.reverse(update_expressions)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 105092L)
    public static SubLObject cdolist_collecting(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list394);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)utilities_macros.NIL;
        SubLObject list_expression = (SubLObject)utilities_macros.NIL;
        SubLObject collection_var = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list394);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list394);
        list_expression = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list394);
        collection_var = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            current = temp;
            SubLObject iterated_expression = (SubLObject)utilities_macros.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list394);
            iterated_expression = current.first();
            current = current.rest();
            if (utilities_macros.NIL == current) {
                final SubLObject list_expression_var = Symbols.make_symbol((SubLObject)utilities_macros.$str395$LIST_EXPRESSION);
                final SubLObject tail_cons_var = Symbols.make_symbol((SubLObject)utilities_macros.$str396$TAIL_CONS);
                final SubLObject result_var = Symbols.make_symbol((SubLObject)utilities_macros.$str397$RESULT);
                return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(list_expression_var, list_expression)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym398$PCOND, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym335$NULL, list_expression_var), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym105$CSETQ, collection_var, (SubLObject)utilities_macros.$list212)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym399$ATOM, list_expression_var), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym105$CSETQ, collection_var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym361$LIST, list_expression_var))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym335$NULL, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym336$CDR, list_expression_var)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym100$CAR, list_expression_var))), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym105$CSETQ, collection_var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym361$LIST, iterated_expression)))), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.T, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(tail_cons_var, (SubLObject)utilities_macros.$list212), reader.bq_cons(result_var, (SubLObject)utilities_macros.$list212)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym100$CAR, list_expression_var))), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym105$CSETQ, collection_var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym361$LIST, iterated_expression)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym105$CSETQ, tail_cons_var, collection_var)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym294$CDOLIST, (SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym336$CDR, list_expression_var)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym105$CSETQ, result_var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym361$LIST, iterated_expression)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym363$RPLACD, tail_cons_var, result_var), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym105$CSETQ, tail_cons_var, result_var))))));
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list394);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list394);
        }
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 106783L)
    public static SubLObject cdolist_appending(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list394);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)utilities_macros.NIL;
        SubLObject list_expression = (SubLObject)utilities_macros.NIL;
        SubLObject collection_var = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list394);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list394);
        list_expression = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list394);
        collection_var = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            current = temp;
            SubLObject iterated_expression = (SubLObject)utilities_macros.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list394);
            iterated_expression = current.first();
            current = current.rest();
            if (utilities_macros.NIL == current) {
                final SubLObject list_expression_var = Symbols.make_symbol((SubLObject)utilities_macros.$str395$LIST_EXPRESSION);
                final SubLObject tail_cons_var = Symbols.make_symbol((SubLObject)utilities_macros.$str396$TAIL_CONS);
                final SubLObject result_var = Symbols.make_symbol((SubLObject)utilities_macros.$str397$RESULT);
                return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(list_expression_var, list_expression)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym398$PCOND, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym335$NULL, list_expression_var), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym105$CSETQ, collection_var, (SubLObject)utilities_macros.$list212)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym399$ATOM, list_expression_var), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym105$CSETQ, collection_var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym361$LIST, list_expression_var))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym335$NULL, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym336$CDR, list_expression_var)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym100$CAR, list_expression_var))), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym105$CSETQ, collection_var, iterated_expression))), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.T, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(tail_cons_var, (SubLObject)utilities_macros.$list212), reader.bq_cons(result_var, (SubLObject)utilities_macros.$list212)), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym105$CSETQ, collection_var, (SubLObject)utilities_macros.$list212), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym294$CDOLIST, (SubLObject)ConsesLow.list(var, list_expression_var), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym105$CSETQ, result_var, iterated_expression), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym37$PWHEN, result_var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym85$PIF, tail_cons_var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym3$PROGN, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym363$RPLACD, tail_cons_var, result_var), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym105$CSETQ, tail_cons_var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym362$LAST, result_var))), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym3$PROGN, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym105$CSETQ, collection_var, iterated_expression), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym105$CSETQ, tail_cons_var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym362$LAST, collection_var))))))))));
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list394);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list394);
        }
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 108486L)
    public static SubLObject expand_define_list_element_predicator(final SubLObject function_name, final SubLObject function_scope, final SubLObject element_var, final SubLObject type, final SubLObject body) {
        SubLObject defining_form = (SubLObject)utilities_macros.NIL;
        SubLObject definition = (SubLObject)utilities_macros.NIL;
        if (function_scope.eql((SubLObject)utilities_macros.$kw400$API)) {
            defining_form = (SubLObject)utilities_macros.$sym401$DEFINE_API;
        }
        else if (function_scope.eql((SubLObject)utilities_macros.$kw402$PUBLIC)) {
            defining_form = (SubLObject)utilities_macros.$sym4$DEFINE_PUBLIC;
        }
        else if (function_scope.eql((SubLObject)utilities_macros.$kw403$PROTECTED)) {
            defining_form = (SubLObject)utilities_macros.$sym404$DEFINE_PROTECTED;
        }
        else if (function_scope.eql((SubLObject)utilities_macros.$kw405$PRIVATE)) {
            defining_form = (SubLObject)utilities_macros.$sym63$DEFINE_PRIVATE;
        }
        else {
            defining_form = (SubLObject)utilities_macros.$sym4$DEFINE_PUBLIC;
        }
        if (type.eql((SubLObject)utilities_macros.$kw406$ALL)) {
            definition = (SubLObject)ConsesLow.listS(defining_form, function_name, (SubLObject)utilities_macros.$list334, (SubLObject)utilities_macros.$list407, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym294$CDOLIST, reader.bq_cons(element_var, (SubLObject)utilities_macros.$list334), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym202$PUNLESS, body, (SubLObject)utilities_macros.$list206)), (SubLObject)utilities_macros.$list205);
        }
        else if (type.eql((SubLObject)utilities_macros.$kw408$NOT_EMPTY_ALL)) {
            definition = (SubLObject)ConsesLow.listS(defining_form, function_name, (SubLObject)utilities_macros.$list334, (SubLObject)utilities_macros.$list409, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym294$CDOLIST, reader.bq_cons(element_var, (SubLObject)utilities_macros.$list334), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym202$PUNLESS, body, (SubLObject)utilities_macros.$list206)), (SubLObject)utilities_macros.$list205);
        }
        else if (type.eql((SubLObject)utilities_macros.$kw410$ANY)) {
            definition = (SubLObject)ConsesLow.listS(defining_form, function_name, (SubLObject)utilities_macros.$list334, (SubLObject)utilities_macros.$list407, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym294$CDOLIST, reader.bq_cons(element_var, (SubLObject)utilities_macros.$list334), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym37$PWHEN, body, (SubLObject)utilities_macros.$list205)), (SubLObject)utilities_macros.$list206);
        }
        else {
            Errors.error((SubLObject)utilities_macros.$str411$DEFINE_LIST_ELEMENT_PREDICATOR___, type);
        }
        return definition;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 109709L)
    public static SubLObject define_api_list_element_predicator(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject function_name = (SubLObject)utilities_macros.NIL;
        SubLObject type = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list412);
        function_name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list412);
        type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list412);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject element_var = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list412);
        element_var = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            current = temp;
            SubLObject expression = (SubLObject)utilities_macros.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list412);
            expression = current.first();
            current = current.rest();
            if (utilities_macros.NIL == current) {
                return expand_define_list_element_predicator(function_name, (SubLObject)utilities_macros.$kw400$API, element_var, type, expression);
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list412);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list412);
        }
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 109897L)
    public static SubLObject define_public_list_element_predicator(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject function_name = (SubLObject)utilities_macros.NIL;
        SubLObject type = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list412);
        function_name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list412);
        type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list412);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject element_var = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list412);
        element_var = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            current = temp;
            SubLObject expression = (SubLObject)utilities_macros.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list412);
            expression = current.first();
            current = current.rest();
            if (utilities_macros.NIL == current) {
                return expand_define_list_element_predicator(function_name, (SubLObject)utilities_macros.$kw402$PUBLIC, element_var, type, expression);
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list412);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list412);
        }
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 110091L)
    public static SubLObject define_protected_list_element_predicator(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject function_name = (SubLObject)utilities_macros.NIL;
        SubLObject type = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list412);
        function_name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list412);
        type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list412);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject element_var = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list412);
        element_var = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            current = temp;
            SubLObject expression = (SubLObject)utilities_macros.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list412);
            expression = current.first();
            current = current.rest();
            if (utilities_macros.NIL == current) {
                return expand_define_list_element_predicator(function_name, (SubLObject)utilities_macros.$kw403$PROTECTED, element_var, type, expression);
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list412);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list412);
        }
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 110291L)
    public static SubLObject define_private_list_element_predicator(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject function_name = (SubLObject)utilities_macros.NIL;
        SubLObject type = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list412);
        function_name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list412);
        type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list412);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject element_var = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list412);
        element_var = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            current = temp;
            SubLObject expression = (SubLObject)utilities_macros.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list412);
            expression = current.first();
            current = current.rest();
            if (utilities_macros.NIL == current) {
                return expand_define_list_element_predicator(function_name, (SubLObject)utilities_macros.$kw405$PRIVATE, element_var, type, expression);
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list412);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list412);
        }
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 110487L)
    public static SubLObject argnames_from_arglist(final SubLObject arg_list) {
        return Sequences.remove((SubLObject)utilities_macros.$sym413$_OPTIONAL, Mapping.mapcar((SubLObject)utilities_macros.$sym414$CAR_IF_LIST, arg_list), (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 110854L)
    public static SubLObject car_if_list(final SubLObject arg) {
        return arg.isCons() ? arg.first() : arg;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 110940L)
    public static SubLObject car_if_list_or_nil(final SubLObject arg) {
        return (SubLObject)(arg.isCons() ? arg.first() : utilities_macros.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 111033L)
    public static SubLObject expand_fcond(final SubLObject v_clauses) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (utilities_macros.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !v_clauses.isList()) {
            Errors.error((SubLObject)utilities_macros.$str415$FCOND___S_is_not_a_valid_clause_l, v_clauses);
        }
        if (v_clauses.first().isAtom()) {
            Errors.error((SubLObject)utilities_macros.$str416$FCOND___S_is_not_a_valid_clause_, v_clauses.first());
            return (SubLObject)utilities_macros.NIL;
        }
        if (utilities_macros.NIL != v_clauses.rest()) {
            final SubLObject first_clause = v_clauses.first();
            final SubLObject rest_of_clauses = v_clauses.rest();
            if (utilities_macros.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (!first_clause.isCons() || !first_clause.rest().isCons() || utilities_macros.NIL != conses_high.cddr(first_clause))) {
                Errors.error((SubLObject)utilities_macros.$str416$FCOND___S_is_not_a_valid_clause_, first_clause);
            }
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym224$FIF, first_clause.first(), conses_high.cadr(first_clause), expand_fcond(rest_of_clauses));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym224$FIF, conses_high.caar(v_clauses), conses_high.cadr(v_clauses.first()), (SubLObject)utilities_macros.$list212);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 111662L)
    public static SubLObject fcond(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject v_clauses;
        final SubLObject current = v_clauses = datum;
        return expand_fcond(v_clauses);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 111727L)
    public static SubLObject check_p_range_case_clauses(final SubLObject v_clauses) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (utilities_macros.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !v_clauses.isList()) {
            Errors.error((SubLObject)utilities_macros.$str417$P_RANGE_CASE__Ill_formed_clauses_, v_clauses);
        }
        SubLObject cdolist_list_var = v_clauses;
        SubLObject clause = (SubLObject)utilities_macros.NIL;
        clause = cdolist_list_var.first();
        while (utilities_macros.NIL != cdolist_list_var) {
            if (utilities_macros.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !clause.isCons()) {
                Errors.error((SubLObject)utilities_macros.$str418$P_RANGE_CASE___S_is_not_a_valid_c, clause);
            }
            if (utilities_macros.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && clause.first() != utilities_macros.$sym384$OTHERWISE && !clause.first().isInteger() && (!clause.first().isCons() || !conses_high.caar(clause).isInteger() || !conses_high.cdar(clause).isCons() || !conses_high.cadr(clause.first()).isInteger())) {
                Errors.error((SubLObject)utilities_macros.$str418$P_RANGE_CASE___S_is_not_a_valid_c, clause);
            }
            cdolist_list_var = cdolist_list_var.rest();
            clause = cdolist_list_var.first();
        }
        return (SubLObject)utilities_macros.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 112260L)
    public static SubLObject utilities_macros_car_eq(final SubLObject item, final SubLObject cons) {
        return Equality.eq(item, cons.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 112343L)
    public static SubLObject expand_p_range_case(final SubLObject value, SubLObject v_clauses) {
        final SubLObject value_var = Symbols.make_symbol((SubLObject)utilities_macros.$str419$value);
        SubLObject processed_clauses = (SubLObject)utilities_macros.NIL;
        SubLObject otherwise_clause = conses_high.assoc((SubLObject)utilities_macros.$sym384$OTHERWISE, v_clauses, (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED);
        if (utilities_macros.NIL != otherwise_clause) {
            otherwise_clause = (SubLObject)ConsesLow.list(reader.bq_cons((SubLObject)utilities_macros.T, ConsesLow.append(otherwise_clause.rest(), (SubLObject)utilities_macros.NIL)));
            v_clauses = Sequences.remove((SubLObject)utilities_macros.$sym384$OTHERWISE, v_clauses, Symbols.symbol_function((SubLObject)utilities_macros.EQ), Symbols.symbol_function((SubLObject)utilities_macros.$sym100$CAR), (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED);
        }
        final SubLObject list_expression = v_clauses;
        if (utilities_macros.NIL == list_expression) {
            processed_clauses = (SubLObject)utilities_macros.NIL;
        }
        else if (list_expression.isAtom()) {
            processed_clauses = (SubLObject)ConsesLow.list(list_expression);
        }
        else if (utilities_macros.NIL == list_expression.rest()) {
            final SubLObject clause = list_expression.first();
            processed_clauses = (SubLObject)ConsesLow.list(clause.first().isCons() ? reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym200$CAND, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym420$__, value_var, conses_high.caar(clause)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym421$__, value_var, conses_high.cadr(clause.first()))), clause.rest()) : reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym422$_, value_var, clause.first()), clause.rest()));
        }
        else {
            SubLObject tail_cons = (SubLObject)utilities_macros.NIL;
            SubLObject result = (SubLObject)utilities_macros.NIL;
            final SubLObject clause2 = list_expression.first();
            processed_clauses = (tail_cons = (SubLObject)ConsesLow.list(clause2.first().isCons() ? reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym200$CAND, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym420$__, value_var, conses_high.caar(clause2)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym421$__, value_var, conses_high.cadr(clause2.first()))), clause2.rest()) : reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym422$_, value_var, clause2.first()), clause2.rest())));
            SubLObject cdolist_list_var = list_expression.rest();
            SubLObject clause3 = (SubLObject)utilities_macros.NIL;
            clause3 = cdolist_list_var.first();
            while (utilities_macros.NIL != cdolist_list_var) {
                result = (SubLObject)ConsesLow.list(clause3.first().isCons() ? reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym200$CAND, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym420$__, value_var, conses_high.caar(clause3)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym421$__, value_var, conses_high.cadr(clause3.first()))), clause3.rest()) : reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym422$_, value_var, clause3.first()), clause3.rest()));
                ConsesLow.rplacd(tail_cons, result);
                tail_cons = result;
                cdolist_list_var = cdolist_list_var.rest();
                clause3 = cdolist_list_var.first();
            }
        }
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(value_var, value)), reader.bq_cons((SubLObject)utilities_macros.$sym398$PCOND, ConsesLow.append(processed_clauses, otherwise_clause, (SubLObject)utilities_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 113022L)
    public static SubLObject p_range_case(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject value = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list423);
        value = current.first();
        final SubLObject v_clauses;
        current = (v_clauses = current.rest());
        check_p_range_case_clauses(v_clauses);
        return expand_p_range_case(value, v_clauses);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 113152L)
    public static SubLObject default_code_branch_error_clause(final SubLObject version) {
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym424$ERROR, (SubLObject)utilities_macros.$str425$Invalid_version_code__A_, version);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 113682L)
    public static SubLObject code_branch_by_version(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list426);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject version = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list426);
        version = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            current = temp;
            SubLObject version_bodies = (SubLObject)utilities_macros.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list426);
            version_bodies = current.first();
            current = current.rest();
            SubLObject allow_other_keys_p = (SubLObject)utilities_macros.NIL;
            SubLObject rest = current;
            SubLObject bad = (SubLObject)utilities_macros.NIL;
            SubLObject current_$12 = (SubLObject)utilities_macros.NIL;
            while (utilities_macros.NIL != rest) {
                cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)utilities_macros.$list426);
                current_$12 = rest.first();
                rest = rest.rest();
                cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)utilities_macros.$list426);
                if (utilities_macros.NIL == conses_high.member(current_$12, (SubLObject)utilities_macros.$list427, (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED)) {
                    bad = (SubLObject)utilities_macros.T;
                }
                if (current_$12 == utilities_macros.$kw91$ALLOW_OTHER_KEYS) {
                    allow_other_keys_p = rest.first();
                }
                rest = rest.rest();
            }
            if (utilities_macros.NIL != bad && utilities_macros.NIL == allow_other_keys_p) {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list426);
            }
            final SubLObject error_clause_tail = cdestructuring_bind.property_list_member((SubLObject)utilities_macros.$kw428$ERROR_CLAUSE, current);
            final SubLObject error_clause = (SubLObject)((utilities_macros.NIL != error_clause_tail) ? conses_high.cadr(error_clause_tail) : utilities_macros.NIL);
            SubLObject v_clauses = (SubLObject)utilities_macros.NIL;
            v_clauses = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym384$OTHERWISE, (utilities_macros.NIL != error_clause) ? error_clause : default_code_branch_error_clause(version)), v_clauses);
            SubLObject cdolist_list_var = version_bodies;
            SubLObject version_body = (SubLObject)utilities_macros.NIL;
            version_body = cdolist_list_var.first();
            while (utilities_macros.NIL != cdolist_list_var) {
                SubLObject current_$13;
                final SubLObject datum_$13 = current_$13 = version_body;
                SubLObject version_$15 = (SubLObject)utilities_macros.NIL;
                SubLObject form = (SubLObject)utilities_macros.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$13, datum_$13, (SubLObject)utilities_macros.$list429);
                version_$15 = current_$13.first();
                current_$13 = current_$13.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$13, datum_$13, (SubLObject)utilities_macros.$list429);
                form = current_$13.first();
                current_$13 = current_$13.rest();
                if (utilities_macros.NIL == current_$13) {
                    v_clauses = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(version_$15, form), v_clauses);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$13, (SubLObject)utilities_macros.$list429);
                }
                cdolist_list_var = cdolist_list_var.rest();
                version_body = cdolist_list_var.first();
            }
            return (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym383$PCASE, version, ConsesLow.append(v_clauses, (SubLObject)utilities_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list426);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 114228L)
    public static SubLObject code_branch_by_version_numbers(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list430);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject major = (SubLObject)utilities_macros.NIL;
        SubLObject minor = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list430);
        major = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list430);
        minor = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            current = temp;
            SubLObject version_bodies = (SubLObject)utilities_macros.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list430);
            version_bodies = current.first();
            current = current.rest();
            SubLObject allow_other_keys_p = (SubLObject)utilities_macros.NIL;
            SubLObject rest = current;
            SubLObject bad = (SubLObject)utilities_macros.NIL;
            SubLObject current_$16 = (SubLObject)utilities_macros.NIL;
            while (utilities_macros.NIL != rest) {
                cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)utilities_macros.$list430);
                current_$16 = rest.first();
                rest = rest.rest();
                cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)utilities_macros.$list430);
                if (utilities_macros.NIL == conses_high.member(current_$16, (SubLObject)utilities_macros.$list427, (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED)) {
                    bad = (SubLObject)utilities_macros.T;
                }
                if (current_$16 == utilities_macros.$kw91$ALLOW_OTHER_KEYS) {
                    allow_other_keys_p = rest.first();
                }
                rest = rest.rest();
            }
            if (utilities_macros.NIL != bad && utilities_macros.NIL == allow_other_keys_p) {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list430);
            }
            final SubLObject error_clause_tail = cdestructuring_bind.property_list_member((SubLObject)utilities_macros.$kw428$ERROR_CLAUSE, current);
            final SubLObject error_clause = (SubLObject)((utilities_macros.NIL != error_clause_tail) ? conses_high.cadr(error_clause_tail) : utilities_macros.NIL);
            SubLObject v_clauses = (SubLObject)utilities_macros.NIL;
            v_clauses = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)utilities_macros.T, (utilities_macros.NIL != error_clause) ? error_clause : default_code_branch_error_clause(major)), v_clauses);
            SubLObject cdolist_list_var = version_bodies;
            SubLObject version_body = (SubLObject)utilities_macros.NIL;
            version_body = cdolist_list_var.first();
            while (utilities_macros.NIL != cdolist_list_var) {
                SubLObject current_$17;
                final SubLObject datum_$17 = current_$17 = version_body;
                SubLObject major_version = (SubLObject)utilities_macros.NIL;
                SubLObject minor_version = (SubLObject)utilities_macros.NIL;
                SubLObject form = (SubLObject)utilities_macros.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$17, datum_$17, (SubLObject)utilities_macros.$list431);
                major_version = current_$17.first();
                current_$17 = current_$17.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$17, datum_$17, (SubLObject)utilities_macros.$list431);
                minor_version = current_$17.first();
                current_$17 = current_$17.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$17, datum_$17, (SubLObject)utilities_macros.$list431);
                form = current_$17.first();
                current_$17 = current_$17.rest();
                if (utilities_macros.NIL == current_$17) {
                    v_clauses = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym200$CAND, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.EQUAL, major_version, major), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.EQUAL, minor_version, minor)), form), v_clauses);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$17, (SubLObject)utilities_macros.$list431);
                }
                cdolist_list_var = cdolist_list_var.rest();
                version_body = cdolist_list_var.first();
            }
            return reader.bq_cons((SubLObject)utilities_macros.$sym398$PCOND, ConsesLow.append(v_clauses, (SubLObject)utilities_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list430);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 115281L)
    public static SubLObject sub_kb_loaded_root_string(final SubLObject sub_kb_symbol) {
        final SubLObject sub_kb_string = Symbols.symbol_name(sub_kb_symbol);
        final SubLObject len = Sequences.length(sub_kb_string);
        final SubLObject root_string = string_utilities.substring(sub_kb_string, (SubLObject)utilities_macros.ONE_INTEGER, Numbers.subtract(len, (SubLObject)utilities_macros.TWO_INTEGER));
        return root_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 115608L)
    public static SubLObject sub_kb_loaded_p_symbol(final SubLObject sub_kb_symbol) {
        final SubLObject root_string = sub_kb_loaded_root_string(sub_kb_symbol);
        final SubLObject loaded_p_string = Sequences.cconcatenate(root_string, (SubLObject)utilities_macros.$str434$_P);
        return Packages.intern(loaded_p_string, (SubLObject)utilities_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 115854L)
    public static SubLObject sub_kb_set_symbol(final SubLObject sub_kb_symbol) {
        final SubLObject root_string = sub_kb_loaded_root_string(sub_kb_symbol);
        final SubLObject set_string = Sequences.cconcatenate((SubLObject)utilities_macros.$str436$SET_, root_string);
        return Packages.intern(set_string, (SubLObject)utilities_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 116089L)
    public static SubLObject sub_kb_unset_symbol(final SubLObject sub_kb_symbol) {
        final SubLObject root_string = sub_kb_loaded_root_string(sub_kb_symbol);
        final SubLObject unset_string = Sequences.cconcatenate((SubLObject)utilities_macros.$str438$UNSET_, root_string);
        return Packages.intern(unset_string, (SubLObject)utilities_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 116332L)
    public static SubLObject declare_kb_feature(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject sub_kb_symbol = (SubLObject)utilities_macros.NIL;
        SubLObject loaded_doc_string = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list439);
        sub_kb_symbol = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list439);
        loaded_doc_string = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            final SubLObject loaded_p_symbol = sub_kb_loaded_p_symbol(sub_kb_symbol);
            final SubLObject set_symbol = sub_kb_set_symbol(sub_kb_symbol);
            final SubLObject unset_symbol = sub_kb_unset_symbol(sub_kb_symbol);
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym3$PROGN, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym440$DEFGLOBAL_PRIVATE, sub_kb_symbol, (SubLObject)utilities_macros.$list212), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym109$CPUSHNEW, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym6$QUOTE, sub_kb_symbol), (SubLObject)utilities_macros.$list441), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym4$DEFINE_PUBLIC, loaded_p_symbol, (SubLObject)utilities_macros.NIL, loaded_doc_string, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym54$RET, sub_kb_symbol)), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym404$DEFINE_PROTECTED, set_symbol, (SubLObject)utilities_macros.NIL, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym105$CSETQ, sub_kb_symbol, (SubLObject)utilities_macros.$list442), (SubLObject)utilities_macros.$list205), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym404$DEFINE_PROTECTED, unset_symbol, (SubLObject)utilities_macros.NIL, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym105$CSETQ, sub_kb_symbol, (SubLObject)utilities_macros.$list212), (SubLObject)utilities_macros.$list206));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list439);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 117249L)
    public static SubLObject expand_format_to_string(final SubLObject args) {
        SubLObject expressions = (SubLObject)utilities_macros.NIL;
        SubLObject sub_args = (SubLObject)utilities_macros.NIL;
        SubLObject control_arg = (SubLObject)utilities_macros.NIL;
        SubLObject value_arg = (SubLObject)utilities_macros.NIL;
        sub_args = args;
        control_arg = (SubLObject)((utilities_macros.NIL != sub_args) ? sub_args.first() : utilities_macros.NIL);
        value_arg = (SubLObject)((utilities_macros.NIL != sub_args) ? conses_high.cadr(sub_args) : utilities_macros.NIL);
        while (utilities_macros.NIL != sub_args) {
            final SubLObject pcase_var = control_arg;
            if (pcase_var.eql((SubLObject)utilities_macros.$kw443$A)) {
                expressions = (SubLObject)ConsesLow.cons(value_arg, expressions);
            }
            else if (pcase_var.eql((SubLObject)utilities_macros.$kw444$S)) {
                expressions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym61$SYMBOL_NAME, value_arg), expressions);
            }
            else if (pcase_var.eql((SubLObject)utilities_macros.$kw445$D)) {
                expressions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym446$TO_STRING, value_arg), expressions);
            }
            sub_args = conses_high.cddr(sub_args);
            control_arg = (SubLObject)((utilities_macros.NIL != sub_args) ? sub_args.first() : utilities_macros.NIL);
            value_arg = (SubLObject)((utilities_macros.NIL != sub_args) ? conses_high.cadr(sub_args) : utilities_macros.NIL);
        }
        return reader.bq_cons((SubLObject)utilities_macros.$sym447$CCONCATENATE, ConsesLow.append(Sequences.nreverse(expressions), (SubLObject)utilities_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 117797L)
    public static SubLObject format_to_string(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject datum = macroform.rest();
        final SubLObject format_args;
        final SubLObject current = format_args = datum;
        SubLObject key_expected = (SubLObject)utilities_macros.T;
        SubLObject cdolist_list_var = format_args;
        SubLObject arg = (SubLObject)utilities_macros.NIL;
        arg = cdolist_list_var.first();
        while (utilities_macros.NIL != cdolist_list_var) {
            if (utilities_macros.NIL != key_expected && utilities_macros.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && utilities_macros.NIL == conses_high.member(arg, (SubLObject)utilities_macros.$list448, (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED)) {
                Errors.error((SubLObject)utilities_macros.$str449$FORMAT_TO_STRING___S_is_an_invali, arg);
            }
            key_expected = (SubLObject)SubLObjectFactory.makeBoolean(utilities_macros.NIL == key_expected);
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        if (utilities_macros.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && utilities_macros.NIL == key_expected) {
            Errors.error((SubLObject)utilities_macros.$str450$FORMAT_TO_STRING__Odd_number_of_a, format_args);
        }
        return expand_format_to_string(format_args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 118683L)
    public static SubLObject time(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject time = (SubLObject)utilities_macros.$sym451$TIME;
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list(time), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym452$CTIME, time, ConsesLow.append(body, (SubLObject)utilities_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym453$FORMAT, (SubLObject)utilities_macros.T, (SubLObject)utilities_macros.$str454$_____real_time__A_seconds__, time), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.IDENTITY, time));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 119011L)
    public static SubLObject with_process_resource_tracking_in_seconds(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject var = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list455);
        var = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject timing_info = (SubLObject)utilities_macros.$sym456$TIMING_INFO;
        final SubLObject clock_time = (SubLObject)utilities_macros.$sym457$CLOCK_TIME;
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list(timing_info, clock_time), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym452$CTIME, clock_time, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym458$WITH_PROCESS_RESOURCE_TRACKING, timing_info, ConsesLow.append(body, (SubLObject)utilities_macros.NIL))), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym105$CSETQ, var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym459$CONVERT_PROCESS_RESOURCE_TRACKING_TIMING_INFO_TO_SECONDS, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym460$NADD_CLOCK_TIME_TO_PROCESS_RESOURCE_TIMING_INFO, clock_time, timing_info))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 120198L)
    public static SubLObject convert_process_resource_tracking_timing_info_to_seconds(final SubLObject timing_info) {
        SubLObject converted_timing_info = (SubLObject)utilities_macros.NIL;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        SubLObject new_value;
        for (remainder = (SubLObject)utilities_macros.NIL, remainder = timing_info; utilities_macros.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value = conses_high.cadr(remainder);
            new_value = ((utilities_macros.NIL != list_utilities.member_eqP(property, utilities_macros.$process_resource_tracking_100s_of_nanoseconds_properties$.getGlobalValue())) ? Numbers.divide(value, (SubLObject)utilities_macros.$int463$10000000) : value);
            converted_timing_info = conses_high.putf(converted_timing_info, property, new_value);
        }
        return converted_timing_info;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 120830L)
    public static SubLObject nadd_clock_time_to_process_resource_timing_info(final SubLObject clock_time, final SubLObject timing_info) {
        return conses_high.putf(timing_info, (SubLObject)utilities_macros.$kw464$WALL_CLOCK_TIME, clock_time);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 121106L)
    public static SubLObject process_resource_tracking_user_time(final SubLObject timing_info) {
        return conses_high.getf(timing_info, (SubLObject)utilities_macros.$kw465$USER_TIME, (SubLObject)utilities_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 121283L)
    public static SubLObject process_resource_tracking_system_time(final SubLObject timing_info) {
        return conses_high.getf(timing_info, (SubLObject)utilities_macros.$kw466$SYSTEM_TIME, (SubLObject)utilities_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 121464L)
    public static SubLObject process_resource_tracking_wall_clock_time(final SubLObject timing_info) {
        return conses_high.getf(timing_info, (SubLObject)utilities_macros.$kw464$WALL_CLOCK_TIME, (SubLObject)utilities_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 121581L)
    public static SubLObject timing_info(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject timing_info = (SubLObject)utilities_macros.$sym467$TIMING_INFO;
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list(timing_info), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym462$WITH_PROCESS_RESOURCE_TRACKING_IN_SECONDS, timing_info, ConsesLow.append(body, (SubLObject)utilities_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym453$FORMAT, (SubLObject)utilities_macros.T, (SubLObject)utilities_macros.$str468$______s__, timing_info), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.IDENTITY, timing_info));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 122073L)
    public static SubLObject user_time(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject var = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list455);
        var = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject timing_info = (SubLObject)utilities_macros.$sym469$TIMING_INFO;
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list(timing_info), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym462$WITH_PROCESS_RESOURCE_TRACKING_IN_SECONDS, timing_info, ConsesLow.append(body, (SubLObject)utilities_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym105$CSETQ, var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym470$PROCESS_RESOURCE_TRACKING_USER_TIME, timing_info)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 122557L)
    public static SubLObject user_time_in_seconds(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject var = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list455);
        var = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject timing_info = (SubLObject)utilities_macros.$sym471$TIMING_INFO;
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list(timing_info), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym462$WITH_PROCESS_RESOURCE_TRACKING_IN_SECONDS, timing_info, ConsesLow.append(body, (SubLObject)utilities_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym105$CSETQ, var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym470$PROCESS_RESOURCE_TRACKING_USER_TIME, timing_info)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 123000L)
    public static SubLObject system_time(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject var = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list455);
        var = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject timing_info = (SubLObject)utilities_macros.$sym472$TIMING_INFO;
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list(timing_info), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym462$WITH_PROCESS_RESOURCE_TRACKING_IN_SECONDS, timing_info, ConsesLow.append(body, (SubLObject)utilities_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym105$CSETQ, var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym473$PROCESS_RESOURCE_TRACKING_SYSTEM_TIME, timing_info)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 123502L)
    public static SubLObject system_time_in_seconds(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject var = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list455);
        var = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject timing_info = (SubLObject)utilities_macros.$sym474$TIMING_INFO;
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list(timing_info), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym462$WITH_PROCESS_RESOURCE_TRACKING_IN_SECONDS, timing_info, ConsesLow.append(body, (SubLObject)utilities_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym105$CSETQ, var, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym473$PROCESS_RESOURCE_TRACKING_SYSTEM_TIME, timing_info)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 123957L)
    public static SubLObject check_type_if_present(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_object = (SubLObject)utilities_macros.NIL;
        SubLObject pred = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list475);
        v_object = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list475);
        pred = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym37$PWHEN, v_object, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym153$CHECK_TYPE, v_object, pred));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list475);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 124359L)
    public static SubLObject enforce_type_if_present(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_object = (SubLObject)utilities_macros.NIL;
        SubLObject pred = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list475);
        v_object = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list475);
        pred = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym37$PWHEN, v_object, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym34$ENFORCE_TYPE, v_object, pred));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list475);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 124693L)
    public static SubLObject check_list_type(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject list = (SubLObject)utilities_macros.NIL;
        SubLObject pred = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list476);
        list = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list476);
        pred = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            final SubLObject elem = (SubLObject)utilities_macros.$sym477$ELEM;
            final SubLObject list_var = (SubLObject)utilities_macros.$sym478$LIST_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(list_var, list)), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym153$CHECK_TYPE, list_var, (SubLObject)utilities_macros.$list479), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym294$CDOLIST, (SubLObject)ConsesLow.list(elem, list_var), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym153$CHECK_TYPE, elem, pred)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list476);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 125074L)
    public static SubLObject check_list_type_if_present(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject list = (SubLObject)utilities_macros.NIL;
        SubLObject pred = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list476);
        list = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list476);
        pred = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym37$PWHEN, list, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym480$CHECK_LIST_TYPE, list, pred));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list476);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 125187L)
    public static SubLObject enforce_list_type(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject list = (SubLObject)utilities_macros.NIL;
        SubLObject pred = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list476);
        list = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list476);
        pred = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            final SubLObject elem = (SubLObject)utilities_macros.$sym481$ELEM;
            final SubLObject list_var = (SubLObject)utilities_macros.$sym482$LIST_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(list_var, list)), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym34$ENFORCE_TYPE, list_var, (SubLObject)utilities_macros.$list479), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym294$CDOLIST, (SubLObject)ConsesLow.list(elem, list_var), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym34$ENFORCE_TYPE, elem, pred)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list476);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 125520L)
    public static SubLObject enforce_list_type_if_present(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject list = (SubLObject)utilities_macros.NIL;
        SubLObject pred = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list476);
        list = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list476);
        pred = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym37$PWHEN, list, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym480$CHECK_LIST_TYPE, list, pred));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list476);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 125635L)
    public static SubLObject check_plist_type(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject plist = (SubLObject)utilities_macros.NIL;
        SubLObject pred = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list483);
        plist = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list483);
        pred = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            final SubLObject property = (SubLObject)utilities_macros.$sym484$PROPERTY;
            final SubLObject value = (SubLObject)utilities_macros.$sym485$VALUE;
            final SubLObject plist_var = (SubLObject)utilities_macros.$sym486$PLIST_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(plist_var, plist)), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym153$CHECK_TYPE, plist_var, (SubLObject)utilities_macros.$list487), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym369$DO_PLIST, (SubLObject)ConsesLow.list(property, value, plist_var), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym248$IGNORE, value), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym153$CHECK_TYPE, property, pred)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list483);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 126074L)
    public static SubLObject enforce_plist_type(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject plist = (SubLObject)utilities_macros.NIL;
        SubLObject pred = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list483);
        plist = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list483);
        pred = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            final SubLObject property = (SubLObject)utilities_macros.$sym488$PROPERTY;
            final SubLObject value = (SubLObject)utilities_macros.$sym489$VALUE;
            final SubLObject plist_var = (SubLObject)utilities_macros.$sym490$PLIST_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(plist_var, plist)), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym34$ENFORCE_TYPE, plist_var, (SubLObject)utilities_macros.$list487), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym369$DO_PLIST, (SubLObject)ConsesLow.list(property, value, plist_var), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym248$IGNORE, value), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym34$ENFORCE_TYPE, property, pred)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list483);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 126462L)
    public static SubLObject warn_unless_plist_of_type(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject plist = (SubLObject)utilities_macros.NIL;
        SubLObject pred = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list483);
        plist = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list483);
        pred = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            final SubLObject property = (SubLObject)utilities_macros.$sym491$PROPERTY;
            final SubLObject value = (SubLObject)utilities_macros.$sym492$VALUE;
            final SubLObject plist_var = (SubLObject)utilities_macros.$sym493$PLIST_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(plist_var, plist)), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym153$CHECK_TYPE, plist_var, (SubLObject)utilities_macros.$list487), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym369$DO_PLIST, (SubLObject)ConsesLow.list(property, value, plist_var), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym248$IGNORE, value), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym494$WARN_UNLESS, (SubLObject)ConsesLow.list(pred, property), (SubLObject)utilities_macros.$str495$_s_is_not_a_known__a, property, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym6$QUOTE, pred))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list483);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 127005L)
    public static SubLObject must_if_present(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_object = (SubLObject)utilities_macros.NIL;
        SubLObject form = (SubLObject)utilities_macros.NIL;
        SubLObject format_string = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list496);
        v_object = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list496);
        form = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list496);
        format_string = current.first();
        final SubLObject format_arguments;
        current = (format_arguments = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym37$PWHEN, v_object, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym497$MUST, form, format_string, ConsesLow.append(format_arguments, (SubLObject)utilities_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 127417L)
    public static SubLObject nil_or(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject function_spec = (SubLObject)utilities_macros.NIL;
        SubLObject v_object = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list498);
        function_spec = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list498);
        v_object = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym499$COR, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym335$NULL, v_object), (SubLObject)ConsesLow.list(function_spec, v_object));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list498);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 127631L)
    public static SubLObject swap(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject place1 = (SubLObject)utilities_macros.NIL;
        SubLObject place2 = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list500);
        place1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list500);
        place2 = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            final SubLObject swap_var = (SubLObject)utilities_macros.$sym501$SWAP_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(swap_var, place1)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym203$CSETF, place1, place2), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym203$CSETF, place2, swap_var));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list500);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 127922L)
    public static SubLObject def_kb_variable(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list502);
        variable = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list502);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)utilities_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)utilities_macros.NIL;
        SubLObject current_$19 = (SubLObject)utilities_macros.NIL;
        while (utilities_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)utilities_macros.$list502);
            current_$19 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)utilities_macros.$list502);
            if (utilities_macros.NIL == conses_high.member(current_$19, (SubLObject)utilities_macros.$list503, (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED)) {
                bad = (SubLObject)utilities_macros.T;
            }
            if (current_$19 == utilities_macros.$kw91$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (utilities_macros.NIL != bad && utilities_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list502);
        }
        final SubLObject documentation_tail = cdestructuring_bind.property_list_member((SubLObject)utilities_macros.$kw93$DOCUMENTATION, current);
        final SubLObject documentation = (SubLObject)((utilities_macros.NIL != documentation_tail) ? conses_high.cadr(documentation_tail) : utilities_macros.NIL);
        final SubLObject definer_tail = cdestructuring_bind.property_list_member((SubLObject)utilities_macros.$kw504$DEFINER, current);
        final SubLObject definer = (SubLObject)((utilities_macros.NIL != definer_tail) ? conses_high.cadr(definer_tail) : utilities_macros.NIL);
        final SubLObject access_tail = cdestructuring_bind.property_list_member((SubLObject)utilities_macros.$kw505$ACCESS, current);
        final SubLObject access = (SubLObject)((utilities_macros.NIL != access_tail) ? conses_high.cadr(access_tail) : utilities_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        assert utilities_macros.NIL != Types.symbolp(variable) : variable;
        if (utilities_macros.NIL != documentation && !utilities_macros.assertionsDisabledSynth && utilities_macros.NIL == Types.stringp(documentation)) {
            throw new AssertionError(documentation);
        }
        final SubLObject v_package = Symbols.symbol_package(variable);
        final SubLObject initializer_name = PrintLow.format((SubLObject)utilities_macros.NIL, (SubLObject)utilities_macros.$str506$_A_INITIALIZER, variable);
        final SubLObject initializer = Packages.intern(initializer_name, v_package);
        return reader.bq_cons((SubLObject)utilities_macros.$sym3$PROGN, ConsesLow.append((SubLObject)((utilities_macros.NIL != access) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym507$PROCLAIM, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym6$QUOTE, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym95$VACCESS, access, variable)))) : utilities_macros.NIL), (SubLObject)ConsesLow.list((SubLObject)((utilities_macros.NIL != definer) ? ConsesLow.list(definer, variable, (SubLObject)utilities_macros.$kw508$UNINITIALIZED, documentation) : ConsesLow.list((SubLObject)utilities_macros.$sym116$DEFVAR, variable, (SubLObject)utilities_macros.$kw508$UNINITIALIZED, documentation)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym509$REGISTER_KB_VARIABLE_INITIALIZATION, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym6$QUOTE, variable), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym6$QUOTE, initializer)), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym63$DEFINE_PRIVATE, initializer, (SubLObject)utilities_macros.NIL, ConsesLow.append(body, (SubLObject)utilities_macros.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 129221L)
    public static SubLObject register_kb_variable_initialization(final SubLObject var_symbol, final SubLObject func) {
        utilities_macros.$kb_var_initializations$.setGlobalValue(list_utilities.alist_enter(utilities_macros.$kb_var_initializations$.getGlobalValue(), var_symbol, func, (SubLObject)utilities_macros.UNPROVIDED));
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 129527L)
    public static SubLObject initialize_kb_variables() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject str = (SubLObject)utilities_macros.$str512$Initializing_KB_variables;
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
            utilities_macros.$progress_notification_count$.bind((SubLObject)utilities_macros.ZERO_INTEGER, thread);
            utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)utilities_macros.ZERO_INTEGER, thread);
            utilities_macros.$progress_count$.bind((SubLObject)utilities_macros.ZERO_INTEGER, thread);
            utilities_macros.$is_noting_progressP$.bind((SubLObject)utilities_macros.T, thread);
            utilities_macros.$silent_progressP$.bind((SubLObject)((utilities_macros.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : utilities_macros.T), thread);
            noting_progress_preamble(str);
            SubLObject cdolist_list_var = utilities_macros.$kb_var_initializations$.getGlobalValue();
            SubLObject cons = (SubLObject)utilities_macros.NIL;
            cons = cdolist_list_var.first();
            while (utilities_macros.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = cons;
                SubLObject var_symbol = (SubLObject)utilities_macros.NIL;
                SubLObject func = (SubLObject)utilities_macros.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list513);
                var_symbol = current.first();
                current = (func = current.rest());
                Symbols.set(var_symbol, Functions.funcall(func));
                cdolist_list_var = cdolist_list_var.rest();
                cons = cdolist_list_var.first();
            }
            noting_progress_postamble();
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
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 129850L)
    public static SubLObject defparameter_lazy(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject getter = (SubLObject)utilities_macros.NIL;
        SubLObject initialization_form = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list514);
        getter = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list514);
        initialization_form = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)utilities_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)utilities_macros.NIL;
        SubLObject current_$20 = (SubLObject)utilities_macros.NIL;
        while (utilities_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)utilities_macros.$list514);
            current_$20 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)utilities_macros.$list514);
            if (utilities_macros.NIL == conses_high.member(current_$20, (SubLObject)utilities_macros.$list515, (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED)) {
                bad = (SubLObject)utilities_macros.T;
            }
            if (current_$20 == utilities_macros.$kw91$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (utilities_macros.NIL != bad && utilities_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list514);
        }
        final SubLObject var_tail = cdestructuring_bind.property_list_member((SubLObject)utilities_macros.$kw516$VAR, current);
        SubLObject var = (SubLObject)((utilities_macros.NIL != var_tail) ? conses_high.cadr(var_tail) : utilities_macros.NIL);
        final SubLObject vaccess_tail = cdestructuring_bind.property_list_member((SubLObject)utilities_macros.$kw92$VACCESS, current);
        final SubLObject vaccess = (SubLObject)((utilities_macros.NIL != vaccess_tail) ? conses_high.cadr(vaccess_tail) : utilities_macros.$sym517$PRIVATE);
        final SubLObject faccess_tail = cdestructuring_bind.property_list_member((SubLObject)utilities_macros.$kw518$FACCESS, current);
        final SubLObject faccess = (SubLObject)((utilities_macros.NIL != faccess_tail) ? conses_high.cadr(faccess_tail) : utilities_macros.$sym517$PRIVATE);
        final SubLObject documentation_tail = cdestructuring_bind.property_list_member((SubLObject)utilities_macros.$kw93$DOCUMENTATION, current);
        final SubLObject documentation = (SubLObject)((utilities_macros.NIL != documentation_tail) ? conses_high.cadr(documentation_tail) : utilities_macros.NIL);
        if (utilities_macros.NIL != string_utilities.starts_with(Symbols.symbol_name(getter), (SubLObject)utilities_macros.$str519$_) || utilities_macros.NIL != string_utilities.ends_with(Symbols.symbol_name(getter), (SubLObject)utilities_macros.$str519$_, (SubLObject)utilities_macros.UNPROVIDED)) {
            Errors.error((SubLObject)utilities_macros.$str520$Invalid_function_name__A___The_fi, getter);
        }
        if (utilities_macros.NIL == var) {
            final SubLObject var_name = Sequences.cconcatenate((SubLObject)utilities_macros.$str519$_, new SubLObject[] { format_nil.format_nil_a_no_copy(getter), utilities_macros.$str519$_ });
            var = Packages.intern(var_name, (SubLObject)utilities_macros.UNPROVIDED);
        }
        final SubLObject init_value = (SubLObject)utilities_macros.$sym521$INIT_VALUE;
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym3$PROGN, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym94$DECLAIM, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym95$VACCESS, vaccess, var)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym94$DECLAIM, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym522$FACCESS, faccess, getter)), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym114$DEFPARAMETER, var, (SubLObject)utilities_macros.$kw508$UNINITIALIZED, ConsesLow.append((SubLObject)((utilities_macros.NIL != documentation) ? ConsesLow.list(documentation) : utilities_macros.NIL), (SubLObject)utilities_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym56$DEFINE, getter, (SubLObject)utilities_macros.NIL, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym37$PWHEN, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.EQ, var, (SubLObject)utilities_macros.$list523), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(init_value, initialization_form)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym37$PWHEN, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.EQ, init_value, (SubLObject)utilities_macros.$list523), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym424$ERROR, (SubLObject)utilities_macros.$str524$Unable_to_initialize__A__, var)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym105$CSETQ, var, init_value))), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym54$RET, var)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 131439L)
    public static SubLObject defvar_lazy(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject getter = (SubLObject)utilities_macros.NIL;
        SubLObject initialization_form = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list514);
        getter = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list514);
        initialization_form = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)utilities_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)utilities_macros.NIL;
        SubLObject current_$21 = (SubLObject)utilities_macros.NIL;
        while (utilities_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)utilities_macros.$list514);
            current_$21 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)utilities_macros.$list514);
            if (utilities_macros.NIL == conses_high.member(current_$21, (SubLObject)utilities_macros.$list515, (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED)) {
                bad = (SubLObject)utilities_macros.T;
            }
            if (current_$21 == utilities_macros.$kw91$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (utilities_macros.NIL != bad && utilities_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list514);
        }
        final SubLObject var_tail = cdestructuring_bind.property_list_member((SubLObject)utilities_macros.$kw516$VAR, current);
        SubLObject var = (SubLObject)((utilities_macros.NIL != var_tail) ? conses_high.cadr(var_tail) : utilities_macros.NIL);
        final SubLObject vaccess_tail = cdestructuring_bind.property_list_member((SubLObject)utilities_macros.$kw92$VACCESS, current);
        final SubLObject vaccess = (SubLObject)((utilities_macros.NIL != vaccess_tail) ? conses_high.cadr(vaccess_tail) : utilities_macros.$sym517$PRIVATE);
        final SubLObject faccess_tail = cdestructuring_bind.property_list_member((SubLObject)utilities_macros.$kw518$FACCESS, current);
        final SubLObject faccess = (SubLObject)((utilities_macros.NIL != faccess_tail) ? conses_high.cadr(faccess_tail) : utilities_macros.$sym517$PRIVATE);
        final SubLObject documentation_tail = cdestructuring_bind.property_list_member((SubLObject)utilities_macros.$kw93$DOCUMENTATION, current);
        final SubLObject documentation = (SubLObject)((utilities_macros.NIL != documentation_tail) ? conses_high.cadr(documentation_tail) : utilities_macros.NIL);
        if (utilities_macros.NIL != string_utilities.starts_with(Symbols.symbol_name(getter), (SubLObject)utilities_macros.$str519$_) || utilities_macros.NIL != string_utilities.ends_with(Symbols.symbol_name(getter), (SubLObject)utilities_macros.$str519$_, (SubLObject)utilities_macros.UNPROVIDED)) {
            Errors.error((SubLObject)utilities_macros.$str525$Invalid_function_name__A___The_fi, getter);
        }
        if (utilities_macros.NIL == var) {
            final SubLObject var_name = Sequences.cconcatenate((SubLObject)utilities_macros.$str519$_, new SubLObject[] { format_nil.format_nil_a_no_copy(getter), utilities_macros.$str519$_ });
            var = Packages.intern(var_name, (SubLObject)utilities_macros.UNPROVIDED);
        }
        final SubLObject init_value = (SubLObject)utilities_macros.$sym526$INIT_VALUE;
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym3$PROGN, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym94$DECLAIM, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym95$VACCESS, vaccess, var)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym94$DECLAIM, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym522$FACCESS, faccess, getter)), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym116$DEFVAR, var, (SubLObject)utilities_macros.$kw508$UNINITIALIZED, ConsesLow.append((SubLObject)((utilities_macros.NIL != documentation) ? ConsesLow.list(documentation) : utilities_macros.NIL), (SubLObject)utilities_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym56$DEFINE, getter, (SubLObject)utilities_macros.NIL, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym37$PWHEN, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.EQ, var, (SubLObject)utilities_macros.$list523), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(init_value, initialization_form)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym37$PWHEN, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.EQ, init_value, (SubLObject)utilities_macros.$list523), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym424$ERROR, (SubLObject)utilities_macros.$str524$Unable_to_initialize__A__, var)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym105$CSETQ, var, init_value))), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym54$RET, var)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 132896L)
    public static SubLObject defglobal_lazy(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject getter = (SubLObject)utilities_macros.NIL;
        SubLObject initialization_form = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list514);
        getter = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list514);
        initialization_form = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)utilities_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)utilities_macros.NIL;
        SubLObject current_$22 = (SubLObject)utilities_macros.NIL;
        while (utilities_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)utilities_macros.$list514);
            current_$22 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)utilities_macros.$list514);
            if (utilities_macros.NIL == conses_high.member(current_$22, (SubLObject)utilities_macros.$list515, (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED)) {
                bad = (SubLObject)utilities_macros.T;
            }
            if (current_$22 == utilities_macros.$kw91$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (utilities_macros.NIL != bad && utilities_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list514);
        }
        final SubLObject var_tail = cdestructuring_bind.property_list_member((SubLObject)utilities_macros.$kw516$VAR, current);
        SubLObject var = (SubLObject)((utilities_macros.NIL != var_tail) ? conses_high.cadr(var_tail) : utilities_macros.NIL);
        final SubLObject vaccess_tail = cdestructuring_bind.property_list_member((SubLObject)utilities_macros.$kw92$VACCESS, current);
        final SubLObject vaccess = (SubLObject)((utilities_macros.NIL != vaccess_tail) ? conses_high.cadr(vaccess_tail) : utilities_macros.$sym517$PRIVATE);
        final SubLObject faccess_tail = cdestructuring_bind.property_list_member((SubLObject)utilities_macros.$kw518$FACCESS, current);
        final SubLObject faccess = (SubLObject)((utilities_macros.NIL != faccess_tail) ? conses_high.cadr(faccess_tail) : utilities_macros.$sym517$PRIVATE);
        final SubLObject documentation_tail = cdestructuring_bind.property_list_member((SubLObject)utilities_macros.$kw93$DOCUMENTATION, current);
        final SubLObject documentation = (SubLObject)((utilities_macros.NIL != documentation_tail) ? conses_high.cadr(documentation_tail) : utilities_macros.NIL);
        if (utilities_macros.NIL != string_utilities.starts_with(Symbols.symbol_name(getter), (SubLObject)utilities_macros.$str519$_) || utilities_macros.NIL != string_utilities.ends_with(Symbols.symbol_name(getter), (SubLObject)utilities_macros.$str519$_, (SubLObject)utilities_macros.UNPROVIDED)) {
            Errors.error((SubLObject)utilities_macros.$str527$Invalid_function_name__A___The_fi, getter);
        }
        if (utilities_macros.NIL == var) {
            final SubLObject var_name = Sequences.cconcatenate((SubLObject)utilities_macros.$str519$_, new SubLObject[] { format_nil.format_nil_a_no_copy(getter), utilities_macros.$str519$_ });
            var = Packages.intern(var_name, (SubLObject)utilities_macros.UNPROVIDED);
        }
        final SubLObject init_value = (SubLObject)utilities_macros.$sym528$INIT_VALUE;
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym3$PROGN, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym94$DECLAIM, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym95$VACCESS, vaccess, var)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym94$DECLAIM, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym522$FACCESS, faccess, getter)), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym96$DEFGLOBAL, var, (SubLObject)utilities_macros.$kw508$UNINITIALIZED, ConsesLow.append((SubLObject)((utilities_macros.NIL != documentation) ? ConsesLow.list(documentation) : utilities_macros.NIL), (SubLObject)utilities_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym56$DEFINE, getter, (SubLObject)utilities_macros.NIL, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym37$PWHEN, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.EQ, var, (SubLObject)utilities_macros.$list523), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(init_value, initialization_form)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym37$PWHEN, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.EQ, init_value, (SubLObject)utilities_macros.$list523), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym424$ERROR, (SubLObject)utilities_macros.$str524$Unable_to_initialize__A__, var)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym105$CSETQ, var, init_value))), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym54$RET, var)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 134365L)
    public static SubLObject deflexical_lazy(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject getter = (SubLObject)utilities_macros.NIL;
        SubLObject initialization_form = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list514);
        getter = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list514);
        initialization_form = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)utilities_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)utilities_macros.NIL;
        SubLObject current_$23 = (SubLObject)utilities_macros.NIL;
        while (utilities_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)utilities_macros.$list514);
            current_$23 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)utilities_macros.$list514);
            if (utilities_macros.NIL == conses_high.member(current_$23, (SubLObject)utilities_macros.$list515, (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED)) {
                bad = (SubLObject)utilities_macros.T;
            }
            if (current_$23 == utilities_macros.$kw91$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (utilities_macros.NIL != bad && utilities_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list514);
        }
        final SubLObject var_tail = cdestructuring_bind.property_list_member((SubLObject)utilities_macros.$kw516$VAR, current);
        SubLObject var = (SubLObject)((utilities_macros.NIL != var_tail) ? conses_high.cadr(var_tail) : utilities_macros.NIL);
        final SubLObject vaccess_tail = cdestructuring_bind.property_list_member((SubLObject)utilities_macros.$kw92$VACCESS, current);
        final SubLObject vaccess = (SubLObject)((utilities_macros.NIL != vaccess_tail) ? conses_high.cadr(vaccess_tail) : utilities_macros.$sym517$PRIVATE);
        final SubLObject faccess_tail = cdestructuring_bind.property_list_member((SubLObject)utilities_macros.$kw518$FACCESS, current);
        final SubLObject faccess = (SubLObject)((utilities_macros.NIL != faccess_tail) ? conses_high.cadr(faccess_tail) : utilities_macros.$sym517$PRIVATE);
        final SubLObject documentation_tail = cdestructuring_bind.property_list_member((SubLObject)utilities_macros.$kw93$DOCUMENTATION, current);
        final SubLObject documentation = (SubLObject)((utilities_macros.NIL != documentation_tail) ? conses_high.cadr(documentation_tail) : utilities_macros.NIL);
        if (utilities_macros.NIL != string_utilities.starts_with(Symbols.symbol_name(getter), (SubLObject)utilities_macros.$str519$_) || utilities_macros.NIL != string_utilities.ends_with(Symbols.symbol_name(getter), (SubLObject)utilities_macros.$str519$_, (SubLObject)utilities_macros.UNPROVIDED)) {
            Errors.error((SubLObject)utilities_macros.$str529$Invalid_function_name__A___The_fi, getter);
        }
        if (utilities_macros.NIL == var) {
            final SubLObject var_name = Sequences.cconcatenate((SubLObject)utilities_macros.$str519$_, new SubLObject[] { format_nil.format_nil_a_no_copy(getter), utilities_macros.$str519$_ });
            var = Packages.intern(var_name, (SubLObject)utilities_macros.UNPROVIDED);
        }
        final SubLObject init_value = (SubLObject)utilities_macros.$sym530$INIT_VALUE;
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym3$PROGN, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym94$DECLAIM, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym95$VACCESS, vaccess, var)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym94$DECLAIM, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym522$FACCESS, faccess, getter)), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym127$DEFLEXICAL, var, (SubLObject)utilities_macros.$kw508$UNINITIALIZED, ConsesLow.append((SubLObject)((utilities_macros.NIL != documentation) ? ConsesLow.list(documentation) : utilities_macros.NIL), (SubLObject)utilities_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym56$DEFINE, getter, (SubLObject)utilities_macros.NIL, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym37$PWHEN, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.EQ, var, (SubLObject)utilities_macros.$list523), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(init_value, initialization_form)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym37$PWHEN, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.EQ, init_value, (SubLObject)utilities_macros.$list523), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym424$ERROR, (SubLObject)utilities_macros.$str524$Unable_to_initialize__A__, var)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym105$CSETQ, var, init_value))), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym54$RET, var)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 135838L)
    public static SubLObject define_api_obsolete(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)utilities_macros.NIL;
        SubLObject arglist = (SubLObject)utilities_macros.NIL;
        SubLObject documentation_string = (SubLObject)utilities_macros.NIL;
        SubLObject declarations = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list531);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list531);
        arglist = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list531);
        documentation_string = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list531);
        declarations = current.first();
        final SubLObject body;
        current = (body = current.rest());
        assert utilities_macros.NIL != Types.stringp(documentation_string) : documentation_string;
        assert utilities_macros.NIL != Types.listp(declarations) : declarations;
        thread.resetMultipleValues();
        final SubLObject argument_types = parse_obsolete_api_declarations(declarations);
        final SubLObject body_preamble = thread.secondMultipleValue();
        final SubLObject return_types = thread.thirdMultipleValue();
        final SubLObject replacements = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym3$PROGN, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym4$DEFINE_PUBLIC, name, arglist, documentation_string, ConsesLow.append(body_preamble, body, (SubLObject)utilities_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym532$REGISTER_OBSOLETE_CYC_API_FUNCTION, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym6$QUOTE, name), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym6$QUOTE, replacements), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym6$QUOTE, arglist), documentation_string, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym6$QUOTE, argument_types), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym6$QUOTE, return_types)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 137359L)
    public static SubLObject register_obsolete_cyc_api_function(final SubLObject name, final SubLObject replacements, final SubLObject arglist, final SubLObject doc_string, final SubLObject argument_types, final SubLObject return_types) {
        register_cyc_api_function(name, arglist, doc_string, argument_types, return_types);
        register_obsolete_cyc_api_replacements(name, replacements);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 137827L)
    public static SubLObject obsolete_cyc_api_replacements(final SubLObject name) {
        return Symbols.get(name, (SubLObject)utilities_macros.$kw533$OBSOLETE_CYC_API_REPLACEMENTS, (SubLObject)utilities_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 138006L)
    public static SubLObject register_obsolete_cyc_api_replacements(final SubLObject name, final SubLObject replacements) {
        assert utilities_macros.NIL != Types.symbolp(name) : name;
        assert utilities_macros.NIL != Types.listp(replacements) : replacements;
        Symbols.put(name, (SubLObject)utilities_macros.$kw533$OBSOLETE_CYC_API_REPLACEMENTS, replacements);
        return name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 138334L)
    public static SubLObject deregister_obsolete_cyc_api_replacements(final SubLObject name) {
        assert utilities_macros.NIL != Types.symbolp(name) : name;
        return Symbols.remprop(name, (SubLObject)utilities_macros.$kw533$OBSOLETE_CYC_API_REPLACEMENTS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 140090L)
    public static SubLObject initialization_for_partial_list_results() {
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 140358L)
    public static SubLObject accumulation_for_partial_list_results(final SubLObject result) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        utilities_macros.$partial_results_accumulator$.setDynamicValue((SubLObject)ConsesLow.cons(result, utilities_macros.$partial_results_accumulator$.getDynamicValue(thread)), thread);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 140487L)
    public static SubLObject consolidation_for_partial_list_results(final SubLObject accumulated_results) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = Sequences.nreverse(accumulated_results);
        SubLObject result = (SubLObject)utilities_macros.NIL;
        result = cdolist_list_var.first();
        while (utilities_macros.NIL != cdolist_list_var) {
            utilities_macros.$partial_results_total_accumulator$.setDynamicValue((SubLObject)ConsesLow.cons(result, utilities_macros.$partial_results_total_accumulator$.getDynamicValue(thread)), thread);
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        }
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 140687L)
    public static SubLObject notification_for_partial_list_results(final SubLObject accumulated_results, final SubLObject size, final SubLObject total_size) {
        return accumulated_results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 140837L)
    public static SubLObject final_results_for_partial_list_results(final SubLObject total_results) {
        return Sequences.nreverse(total_results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 141008L)
    public static SubLObject add_result_to_partial_results_accumulator(final SubLObject result) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (utilities_macros.NIL != utilities_macros.$accumulating_partial_resultsP$.getDynamicValue(thread)) {
            Functions.funcall(utilities_macros.$partial_results_accumulation_fn$.getDynamicValue(thread), result);
            utilities_macros.$partial_results_size$.setDynamicValue(Numbers.add(utilities_macros.$partial_results_size$.getDynamicValue(thread), (SubLObject)utilities_macros.ONE_INTEGER), thread);
            if (!utilities_macros.$partial_results_size$.getDynamicValue(thread).numL(utilities_macros.$partial_results_threshold$.getDynamicValue(thread))) {
                Functions.funcall(utilities_macros.$partial_results_notification_fn$.getDynamicValue(thread), utilities_macros.$partial_results_accumulator$.getDynamicValue(thread), utilities_macros.$partial_results_size$.getDynamicValue(thread), utilities_macros.$partial_results_total_size$.getDynamicValue(thread));
                utilities_macros.$partial_results_total_size$.setDynamicValue(Numbers.add(utilities_macros.$partial_results_total_size$.getDynamicValue(thread), utilities_macros.$partial_results_size$.getDynamicValue(thread)), thread);
                utilities_macros.$partial_results_size$.setDynamicValue((SubLObject)utilities_macros.ZERO_INTEGER, thread);
                Functions.funcall(utilities_macros.$partial_results_consolidation_fn$.getDynamicValue(thread), utilities_macros.$partial_results_accumulator$.getDynamicValue(thread));
                utilities_macros.$partial_results_accumulator$.setDynamicValue(Functions.funcall(utilities_macros.$partial_results_initialization_fn$.getDynamicValue(thread)), thread);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 141728L)
    public static SubLObject with_partial_results_accumulation(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list540);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject final_result_var = (SubLObject)utilities_macros.NIL;
        SubLObject threshold = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list540);
        final_result_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list540);
        threshold = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$list541, (SubLObject)utilities_macros.$list542, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym543$_PARTIAL_RESULTS_THRESHOLD_, threshold), (SubLObject)utilities_macros.$list544), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym164$CUNWIND_PROTECT, reader.bq_cons((SubLObject)utilities_macros.$sym3$PROGN, ConsesLow.append(body, (SubLObject)utilities_macros.NIL)), (SubLObject)utilities_macros.$list545, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym105$CSETQ, final_result_var, (SubLObject)utilities_macros.$list546)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list540);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 142592L)
    public static SubLObject with_space_profiling_to_string(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list548);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject string_var = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list548);
        string_var = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject stream = (SubLObject)utilities_macros.$sym549$STREAM;
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym550$CWITH_OUTPUT_TO_STRING, (SubLObject)ConsesLow.list(stream, string_var), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym551$WITH_SPACE_PROFILING, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$kw552$STREAM, stream), ConsesLow.append(body, (SubLObject)utilities_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list548);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 143324L)
    public static SubLObject with_sxhash_composite(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list553);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject result_var = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list553);
        result_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)utilities_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)utilities_macros.NIL;
        SubLObject current_$24 = (SubLObject)utilities_macros.NIL;
        while (utilities_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)utilities_macros.$list553);
            current_$24 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)utilities_macros.$list553);
            if (utilities_macros.NIL == conses_high.member(current_$24, (SubLObject)utilities_macros.$list554, (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED)) {
                bad = (SubLObject)utilities_macros.T;
            }
            if (current_$24 == utilities_macros.$kw91$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (utilities_macros.NIL != bad && utilities_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list553);
        }
        final SubLObject initial_value_tail = cdestructuring_bind.property_list_member((SubLObject)utilities_macros.$kw555$INITIAL_VALUE, current);
        final SubLObject initial_value = (SubLObject)((utilities_macros.NIL != initial_value_tail) ? conses_high.cadr(initial_value_tail) : utilities_macros.ZERO_INTEGER);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$list556, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym557$_SXHASH_COMPOSITE_HASH_, initial_value)), reader.bq_cons((SubLObject)utilities_macros.$sym3$PROGN, ConsesLow.append(body, (SubLObject)utilities_macros.NIL)), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym105$CSETQ, result_var, (SubLObject)utilities_macros.$list558));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 144011L)
    public static SubLObject with_sxhash_composite_fast(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list553);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject result_var = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list553);
        result_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)utilities_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)utilities_macros.NIL;
        SubLObject current_$25 = (SubLObject)utilities_macros.NIL;
        while (utilities_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)utilities_macros.$list553);
            current_$25 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)utilities_macros.$list553);
            if (utilities_macros.NIL == conses_high.member(current_$25, (SubLObject)utilities_macros.$list554, (SubLObject)utilities_macros.UNPROVIDED, (SubLObject)utilities_macros.UNPROVIDED)) {
                bad = (SubLObject)utilities_macros.T;
            }
            if (current_$25 == utilities_macros.$kw91$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (utilities_macros.NIL != bad && utilities_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list553);
        }
        final SubLObject initial_value_tail = cdestructuring_bind.property_list_member((SubLObject)utilities_macros.$kw555$INITIAL_VALUE, current);
        final SubLObject initial_value = (SubLObject)((utilities_macros.NIL != initial_value_tail) ? conses_high.cadr(initial_value_tail) : utilities_macros.ZERO_INTEGER);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$list559, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym560$COMPOSITE_HASH, initial_value)), reader.bq_cons((SubLObject)utilities_macros.$sym3$PROGN, ConsesLow.append(body, (SubLObject)utilities_macros.NIL)), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym105$CSETQ, result_var, (SubLObject)utilities_macros.$list561));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 144844L)
    public static SubLObject sxhash_composite_update_fast(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject value = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list562);
        value = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym3$PROGN, (SubLObject)utilities_macros.$list563, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym105$CSETQ, (SubLObject)utilities_macros.$sym560$COMPOSITE_HASH, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym564$LOGXOR, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym565$SXHASH_ROT, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym566$SXHASH, value), (SubLObject)utilities_macros.$list567), (SubLObject)utilities_macros.$list561)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list562);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 146150L)
    public static SubLObject sxhash_update_state(final SubLObject state) {
        return Vectors.aref(utilities_macros.$sxhash_update_state_vector$.getGlobalValue(), state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 146566L)
    public static SubLObject sxhash_composite_update(final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        utilities_macros.$sxhash_composite_state$.setDynamicValue(sxhash_update_state(utilities_macros.$sxhash_composite_state$.getDynamicValue(thread)), thread);
        utilities_macros.$sxhash_composite_hash$.setDynamicValue(Numbers.logxor(Sxhash.sxhash_rot(value, utilities_macros.$sxhash_composite_state$.getDynamicValue(thread)), utilities_macros.$sxhash_composite_hash$.getDynamicValue(thread)), thread);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 146938L)
    public static SubLObject slow_hash_test(SubLObject iterations) {
        if (iterations == utilities_macros.UNPROVIDED) {
            iterations = (SubLObject)utilities_macros.$int572$1000000;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject i;
        SubLObject sxhash;
        SubLObject _prev_bind_0;
        SubLObject _prev_bind_2;
        for (i = (SubLObject)utilities_macros.NIL, i = (SubLObject)utilities_macros.ZERO_INTEGER; i.numL(iterations); i = Numbers.add(i, (SubLObject)utilities_macros.ONE_INTEGER)) {
            sxhash = (SubLObject)utilities_macros.ZERO_INTEGER;
            _prev_bind_0 = utilities_macros.$sxhash_composite_state$.currentBinding(thread);
            _prev_bind_2 = utilities_macros.$sxhash_composite_hash$.currentBinding(thread);
            try {
                utilities_macros.$sxhash_composite_state$.bind((SubLObject)utilities_macros.FOUR_INTEGER, thread);
                utilities_macros.$sxhash_composite_hash$.bind((SubLObject)utilities_macros.$int573$167, thread);
                sxhash_composite_update((SubLObject)utilities_macros.FOUR_INTEGER);
                sxhash_composite_update((SubLObject)utilities_macros.THREE_INTEGER);
                sxhash = utilities_macros.$sxhash_composite_hash$.getDynamicValue(thread);
            }
            finally {
                utilities_macros.$sxhash_composite_hash$.rebind(_prev_bind_2, thread);
                utilities_macros.$sxhash_composite_state$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 147282L)
    public static SubLObject fast_hash_test(SubLObject iterations) {
        if (iterations == utilities_macros.UNPROVIDED) {
            iterations = (SubLObject)utilities_macros.$int572$1000000;
        }
        SubLObject i;
        SubLObject sxhash;
        SubLObject composite_state;
        SubLObject composite_hash;
        for (i = (SubLObject)utilities_macros.NIL, i = (SubLObject)utilities_macros.ZERO_INTEGER; i.numL(iterations); i = Numbers.add(i, (SubLObject)utilities_macros.ONE_INTEGER)) {
            sxhash = (SubLObject)utilities_macros.ZERO_INTEGER;
            composite_state = (SubLObject)utilities_macros.FOUR_INTEGER;
            composite_hash = (SubLObject)utilities_macros.$int573$167;
            composite_state = sxhash_update_state(composite_state);
            composite_hash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash((SubLObject)utilities_macros.FOUR_INTEGER), composite_state), composite_hash);
            composite_state = sxhash_update_state(composite_state);
            composite_hash = (sxhash = Numbers.logxor(Sxhash.sxhash_rot(Sxhash.sxhash((SubLObject)utilities_macros.THREE_INTEGER), composite_state), composite_hash));
        }
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 147641L)
    public static SubLObject possibly_catch_error_message(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list574);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)utilities_macros.NIL;
        SubLObject catchP = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list574);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list574);
        catchP = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym85$PIF, catchP, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym171$CATCH_ERROR_MESSAGE, (SubLObject)ConsesLow.list(var), ConsesLow.append(body, (SubLObject)utilities_macros.NIL)), reader.bq_cons((SubLObject)utilities_macros.$sym3$PROGN, ConsesLow.append(body, (SubLObject)utilities_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list574);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 147914L)
    public static SubLObject possibly_ccatch(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list575);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject tag = (SubLObject)utilities_macros.NIL;
        SubLObject ans_var = (SubLObject)utilities_macros.NIL;
        SubLObject catchP = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list575);
        tag = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list575);
        ans_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list575);
        catchP = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym85$PIF, catchP, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym576$CCATCH, tag, ans_var, ConsesLow.append(body, (SubLObject)utilities_macros.NIL)), reader.bq_cons((SubLObject)utilities_macros.$sym3$PROGN, ConsesLow.append(body, (SubLObject)utilities_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list575);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 148079L)
    public static SubLObject run_benchmark_compensating_for_paging(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list577);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject pre_n = (SubLObject)utilities_macros.NIL;
        SubLObject n = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list577);
        pre_n = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list577);
        n = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject timings = (SubLObject)utilities_macros.$sym578$TIMINGS;
            final SubLObject time = (SubLObject)utilities_macros.$sym579$TIME;
            final SubLObject i = (SubLObject)utilities_macros.$sym580$I;
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(timings, (SubLObject)utilities_macros.$list212)), (SubLObject)utilities_macros.$list581, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym280$CDOTIMES, (SubLObject)ConsesLow.list(i, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym582$_, pre_n, n)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list(time), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym452$CTIME, time, ConsesLow.append(body, (SubLObject)utilities_macros.$list583)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym37$PWHEN, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym420$__, i, pre_n), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym364$CPUSH, time, timings)))), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym584$PERFORM_STANDARD_STATISTICAL_ANALYSIS, timings, (SubLObject)utilities_macros.$list442));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list577);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 148639L)
    public static SubLObject benchmark_gc() {
        return Storage.gc((SubLObject)utilities_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 148830L)
    public static SubLObject without_pretty_printing(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)utilities_macros.$list587, ConsesLow.append(body, (SubLObject)utilities_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 149044L)
    public static SubLObject possibly_with_timeout(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list588);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject timeout = (SubLObject)utilities_macros.NIL;
        SubLObject timed_outP = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list588);
        timeout = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list588);
        timed_outP = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym85$PIF, timeout, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym589$WITH_TIMEOUT, (SubLObject)ConsesLow.list(timeout, timed_outP), reader.bq_cons((SubLObject)utilities_macros.$sym3$PROGN, ConsesLow.append(body, (SubLObject)utilities_macros.NIL))), reader.bq_cons((SubLObject)utilities_macros.$sym3$PROGN, ConsesLow.append(body, (SubLObject)utilities_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list588);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 149265L)
    public static SubLObject with_retries(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list590);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject retries = (SubLObject)utilities_macros.NIL;
        SubLObject seconds_between = (SubLObject)utilities_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list590);
        retries = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)utilities_macros.$list590);
        seconds_between = current.first();
        current = current.rest();
        if (utilities_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject error_msg = (SubLObject)utilities_macros.$sym591$ERROR_MSG;
            final SubLObject success = (SubLObject)utilities_macros.$sym592$SUCCESS;
            final SubLObject n = (SubLObject)utilities_macros.$sym593$N;
            return (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym84$CLET, (SubLObject)ConsesLow.list(error_msg, reader.bq_cons(success, (SubLObject)utilities_macros.$list212)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym280$CDOTIMES, (SubLObject)ConsesLow.list(n, retries), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym202$PUNLESS, success, (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym105$CSETQ, error_msg, (SubLObject)utilities_macros.$list212), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym171$CATCH_ERROR_MESSAGE, (SubLObject)ConsesLow.list(error_msg), ConsesLow.append(body, (SubLObject)utilities_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym85$PIF, error_msg, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym594$SLEEP, seconds_between), (SubLObject)ConsesLow.listS((SubLObject)utilities_macros.$sym105$CSETQ, success, (SubLObject)utilities_macros.$list442)))), (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym37$PWHEN, error_msg, (SubLObject)ConsesLow.list((SubLObject)utilities_macros.$sym424$ERROR, error_msg)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)utilities_macros.$list590);
        return (SubLObject)utilities_macros.NIL;
    }
    
    public static SubLObject declare_utilities_macros_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "define_api", "DEFINE-API");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "declare_api_function", "DECLARE-API-FUNCTION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "defmacro_api", "DEFMACRO-API");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "define_api_provisional", "DEFINE-API-PROVISIONAL");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "defmacro_api_provisional", "DEFMACRO-API-PROVISIONAL");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "register_cyc_api_function", "REGISTER-CYC-API-FUNCTION", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "register_cyc_api_macro", "REGISTER-CYC-API-MACRO", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "api_special_p", "API-SPECIAL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "api_special_handler", "API-SPECIAL-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "register_api_special", "REGISTER-API-SPECIAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "api_predefined_function_p", "API-PREDEFINED-FUNCTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "register_api_predefined_function", "REGISTER-API-PREDEFINED-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "unregister_api_predefined_function", "UNREGISTER-API-PREDEFINED-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "api_predefined_host_function_p", "API-PREDEFINED-HOST-FUNCTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "register_api_predefined_host_function", "REGISTER-API-PREDEFINED-HOST-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "unregister_api_predefined_host_function", "UNREGISTER-API-PREDEFINED-HOST-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "api_predefined_macro_p", "API-PREDEFINED-MACRO-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "register_api_predefined_macro", "REGISTER-API-PREDEFINED-MACRO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "unregister_api_predefined_macro", "UNREGISTER-API-PREDEFINED-MACRO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "api_predefined_host_macro_p", "API-PREDEFINED-HOST-MACRO-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "register_api_predefined_host_macro", "REGISTER-API-PREDEFINED-HOST-MACRO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "unregister_api_predefined_host_macro", "UNREGISTER-API-PREDEFINED-HOST-MACRO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "cyc_api_symbol_p", "CYC-API-SYMBOL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "register_cyc_api_symbol", "REGISTER-CYC-API-SYMBOL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "deregister_cyc_api_symbol", "DEREGISTER-CYC-API-SYMBOL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "cyc_api_args", "CYC-API-ARGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "register_cyc_api_args", "REGISTER-CYC-API-ARGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "deregister_cyc_api_args", "DEREGISTER-CYC-API-ARGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "register_cyc_api_function_documentation", "REGISTER-CYC-API-FUNCTION-DOCUMENTATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "get_api_arg_types", "GET-API-ARG-TYPES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "register_cyc_api_arg_types", "REGISTER-CYC-API-ARG-TYPES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "deregister_cyc_api_arg_types", "DEREGISTER-CYC-API-ARG-TYPES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "get_api_return_types", "GET-API-RETURN-TYPES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "register_cyc_api_return_types", "REGISTER-CYC-API-RETURN-TYPES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "deregister_cyc_api_return_types", "DEREGISTER-CYC-API-RETURN-TYPES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "parse_api_type_declarations", "PARSE-API-TYPE-DECLARATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "parse_obsolete_api_declarations", "PARSE-OBSOLETE-API-DECLARATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "parse_api_declarations_int", "PARSE-API-DECLARATIONS-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "expand_into_enforce_type", "EXPAND-INTO-ENFORCE-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "validate_return_type", "VALIDATE-RETURN-TYPE", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "define_after_adding", "DEFINE-AFTER-ADDING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "define_after_removing", "DEFINE-AFTER-REMOVING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "define_rule_after_adding", "DEFINE-RULE-AFTER-ADDING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "define_rule_after_removing", "DEFINE-RULE-AFTER-REMOVING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "define_collection_defn", "DEFINE-COLLECTION-DEFN");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "define_evaluation_defn", "DEFINE-EVALUATION-DEFN");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "define_expansion_defn", "DEFINE-EXPANSION-DEFN");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "define_cyc_subl_defn", "DEFINE-CYC-SUBL-DEFN");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "define_kb", "DEFINE-KB");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "kb_function_p", "KB-FUNCTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "register_kb_symbol", "REGISTER-KB-SYMBOL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "deregister_kb_symbol", "DEREGISTER-KB-SYMBOL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "deregister_all_kb_functions", "DEREGISTER-ALL-KB-FUNCTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "all_kb_functions", "ALL-KB-FUNCTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "register_kb_function", "REGISTER-KB-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "deregister_kb_function", "DEREGISTER-KB-FUNCTION", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "define_private_funcall", "DEFINE-PRIVATE-FUNCALL");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "note_funcall_helper_function", "NOTE-FUNCALL-HELPER-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "funcall_helper_functionP", "FUNCALL-HELPER-FUNCTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "unprovided_argumentP", "UNPROVIDED-ARGUMENT?", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "declare_control_parameter", "DECLARE-CONTROL-PARAMETER");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "declare_control_parameter_internal", "DECLARE-CONTROL-PARAMETER-INTERNAL", 4, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "until_mapping_finished", "UNTIL-MAPPING-FINISHED");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "mapping_finished", "MAPPING-FINISHED", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "until_sbhl_mapping_finished", "UNTIL-SBHL-MAPPING-FINISHED");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "sbhl_mapping_finished", "SBHL-MAPPING-FINISHED", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "cfasl_write", "CFASL-WRITE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "cfasl_read", "CFASL-READ");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "if_lock_idle", "IF-LOCK-IDLE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "possibly_with_lock_held", "POSSIBLY-WITH-LOCK-HELD");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "defglobal_lock", "DEFGLOBAL-LOCK");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "initialize_global_locks", "INITIALIZE-GLOBAL-LOCKS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "register_global_lock", "REGISTER-GLOBAL-LOCK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "global_lock_p", "GLOBAL-LOCK-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "global_lock_initialization_form", "GLOBAL-LOCK-INITIALIZATION-FORM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "initialize_global_lock", "INITIALIZE-GLOBAL-LOCK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "initialize_global_lock_internal", "INITIALIZE-GLOBAL-LOCK-INTERNAL", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "defparameter_fi", "DEFPARAMETER-FI");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "with_clean_fi_state", "WITH-CLEAN-FI-STATE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "register_html_state_variable", "REGISTER-HTML-STATE-VARIABLE", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "defparameter_html", "DEFPARAMETER-HTML");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "defvar_html", "DEFVAR-HTML");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "register_html_interface_variable", "REGISTER-HTML-INTERFACE-VARIABLE", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "defparameter_html_interface", "DEFPARAMETER-HTML-INTERFACE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "defvar_html_interface", "DEFVAR-HTML-INTERFACE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "def_state_variable", "DEF-STATE-VARIABLE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "note_state_variable_documentation", "NOTE-STATE-VARIABLE-DOCUMENTATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "define_operator_for_variable_type", "DEFINE-OPERATOR-FOR-VARIABLE-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "documentation", "DOCUMENTATION", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "defvar_gt", "DEFVAR-GT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "defvar_at", "DEFVAR-AT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "defvar_defn", "DEFVAR-DEFN");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "defvar_kbi", "DEFVAR-KBI");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "defvar_kbp", "DEFVAR-KBP");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "with_kbp_defaults", "WITH-KBP-DEFAULTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "progn_cyc_api", "PROGN-CYC-API");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "with_forward_inference_environment", "WITH-FORWARD-INFERENCE-ENVIRONMENT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "with_clean_forward_inference_environment", "WITH-CLEAN-FORWARD-INFERENCE-ENVIRONMENT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "with_possibly_clean_forward_inference_environment", "WITH-POSSIBLY-CLEAN-FORWARD-INFERENCE-ENVIRONMENT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "possibly_get_forward_inference_environment", "POSSIBLY-GET-FORWARD-INFERENCE-ENVIRONMENT", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "with_clean_forward_problem_store_environment", "WITH-CLEAN-FORWARD-PROBLEM-STORE-ENVIRONMENT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "with_normal_forward_inference_parameters", "WITH-NORMAL-FORWARD-INFERENCE-PARAMETERS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "with_normal_forward_inference", "WITH-NORMAL-FORWARD-INFERENCE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "within_normal_forward_inferenceP", "WITHIN-NORMAL-FORWARD-INFERENCE?", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "throw_unevaluatable_on_error", "THROW-UNEVALUATABLE-ON-ERROR");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "tracing_at_level", "TRACING-AT-LEVEL", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "if_tracing", "IF-TRACING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "with_static_structure_resourcing", "WITH-STATIC-STRUCTURE-RESOURCING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "possibly_with_static_structure_resourcing", "POSSIBLY-WITH-STATIC-STRUCTURE-RESOURCING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "define_structure_resource", "DEFINE-STRUCTURE-RESOURCE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "with_readtime_eval_disabled", "WITH-READTIME-EVAL-DISABLED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "noting_progress", "NOTING-PROGRESS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "noting_progress_delayed", "NOTING-PROGRESS-DELAYED");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "noting_progress_preamble", "NOTING-PROGRESS-PREAMBLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "noting_progress_postamble", "NOTING-PROGRESS-POSTAMBLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "note_progress", "NOTE-PROGRESS", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "noting_activity", "NOTING-ACTIVITY");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "noting_percent_progress", "NOTING-PERCENT-PROGRESS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "noting_percent_progress_delayed", "NOTING-PERCENT-PROGRESS-DELAYED");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "noting_percent_progress_preamble", "NOTING-PERCENT-PROGRESS-PREAMBLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "noting_percent_progress_postamble", "NOTING-PERCENT-PROGRESS-POSTAMBLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "note_percent_progress", "NOTE-PERCENT-PROGRESS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "print_progress_percent", "PRINT-PROGRESS-PERCENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "print_2_digit_nonnegative_integer", "PRINT-2-DIGIT-NONNEGATIVE-INTEGER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "possibly_note_percent_progress_prediction", "POSSIBLY-NOTE-PERCENT-PROGRESS-PREDICTION", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "compute_percent_progress", "COMPUTE-PERCENT-PROGRESS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "progress", "PROGRESS", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "progress_cdotimes", "PROGRESS-CDOTIMES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "progress_csome", "PROGRESS-CSOME");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "progress_cdolist", "PROGRESS-CDOLIST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "possibly_progress_cdolist", "POSSIBLY-PROGRESS-CDOLIST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "progress_cdohash", "PROGRESS-CDOHASH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "progress_do_set", "PROGRESS-DO-SET");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "noting_elapsed_time", "NOTING-ELAPSED-TIME");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "noting_elapsed_time_preamble", "NOTING-ELAPSED-TIME-PREAMBLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "noting_elapsed_time_postamble", "NOTING-ELAPSED-TIME-POSTAMBLE", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "with_cyc_server_handling", "WITH-CYC-SERVER-HANDLING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "with_cyc_io_syntax", "WITH-CYC-IO-SYNTAX");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "with_cyc_io_syntax_internal", "WITH-CYC-IO-SYNTAX-INTERNAL", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "with_sublisp_runtime_assumptions", "WITH-SUBLISP-RUNTIME-ASSUMPTIONS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "with_the_cyclist", "WITH-THE-CYCLIST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "with_different_cyclist", "WITH-DIFFERENT-CYCLIST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "do_bindings", "DO-BINDINGS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "do_bindings_var_specs", "DO-BINDINGS-VAR-SPECS", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "fast_singleton_macro_p", "FAST-SINGLETON-MACRO-P");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "pluralityP", "PLURALITY?", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "fast_plurality_macro_p", "FAST-PLURALITY-MACRO-P");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "cdosublists", "CDOSUBLISTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "cdolist_and_sublists", "CDOLIST-AND-SUBLISTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "cdolist_and_sublists_carefully", "CDOLIST-AND-SUBLISTS-CAREFULLY");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "cdo_possibly_dotted_list", "CDO-POSSIBLY-DOTTED-LIST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "cdolist_if", "CDOLIST-IF");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "cdosublists_if", "CDOSUBLISTS-IF");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "cdolist_if_not", "CDOLIST-IF-NOT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "cdosublists_if_not", "CDOSUBLISTS-IF-NOT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "cdo2lists", "CDO2LISTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "cdotree", "CDOTREE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "cdotree_conses", "CDOTREE-CONSES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "cdoplist", "CDOPLIST");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "compositize_function_call", "COMPOSITIZE-FUNCTION-CALL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "simplify_car_and_cdr_path", "SIMPLIFY-CAR-AND-CDR-PATH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "map_symbols_to_accessors", "MAP-SYMBOLS-TO-ACCESSORS", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "cdestructuring_setq", "CDESTRUCTURING-SETQ");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "fast_funcall_no_value_check_args", "FAST-FUNCALL-NO-VALUE-CHECK-ARGS", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "fast_funcall_no_value", "FAST-FUNCALL-NO-VALUE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "fast_funcall_setq", "FAST-FUNCALL-SETQ");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "generate_parallel_var_list", "GENERATE-PARALLEL-VAR-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "generate_multiple_csetq", "GENERATE-MULTIPLE-CSETQ", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "fast_funcall_multiple_value_bind", "FAST-FUNCALL-MULTIPLE-VALUE-BIND");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "fast_funcall_multiple_value_setq", "FAST-FUNCALL-MULTIPLE-VALUE-SETQ");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "expand_destructuring_predication_generator", "EXPAND-DESTRUCTURING-PREDICATION-GENERATOR", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "funcall_shortcut", "FUNCALL-SHORTCUT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "destructuring_predication_generator", "DESTRUCTURING-PREDICATION-GENERATOR");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "symbol_in_tree_p", "SYMBOL-IN-TREE-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "unquoted_symbol_in_tree_p", "UNQUOTED-SYMBOL-IN-TREE-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "generate_instance_variable_bindings_for_structure_slots", "GENERATE-INSTANCE-VARIABLE-BINDINGS-FOR-STRUCTURE-SLOTS", 5, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "cdolist_collecting", "CDOLIST-COLLECTING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "cdolist_appending", "CDOLIST-APPENDING");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "expand_define_list_element_predicator", "EXPAND-DEFINE-LIST-ELEMENT-PREDICATOR", 5, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "define_api_list_element_predicator", "DEFINE-API-LIST-ELEMENT-PREDICATOR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "define_public_list_element_predicator", "DEFINE-PUBLIC-LIST-ELEMENT-PREDICATOR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "define_protected_list_element_predicator", "DEFINE-PROTECTED-LIST-ELEMENT-PREDICATOR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "define_private_list_element_predicator", "DEFINE-PRIVATE-LIST-ELEMENT-PREDICATOR");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "argnames_from_arglist", "ARGNAMES-FROM-ARGLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "car_if_list", "CAR-IF-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "car_if_list_or_nil", "CAR-IF-LIST-OR-NIL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "expand_fcond", "EXPAND-FCOND", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "fcond", "FCOND");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "check_p_range_case_clauses", "CHECK-P-RANGE-CASE-CLAUSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "utilities_macros_car_eq", "UTILITIES-MACROS-CAR-EQ", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "expand_p_range_case", "EXPAND-P-RANGE-CASE", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "p_range_case", "P-RANGE-CASE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "default_code_branch_error_clause", "DEFAULT-CODE-BRANCH-ERROR-CLAUSE", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "code_branch_by_version", "CODE-BRANCH-BY-VERSION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "code_branch_by_version_numbers", "CODE-BRANCH-BY-VERSION-NUMBERS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "sub_kb_loaded_root_string", "SUB-KB-LOADED-ROOT-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "sub_kb_loaded_p_symbol", "SUB-KB-LOADED-P-SYMBOL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "sub_kb_set_symbol", "SUB-KB-SET-SYMBOL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "sub_kb_unset_symbol", "SUB-KB-UNSET-SYMBOL", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "declare_kb_feature", "DECLARE-KB-FEATURE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "expand_format_to_string", "EXPAND-FORMAT-TO-STRING", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "format_to_string", "FORMAT-TO-STRING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "time", "TIME");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "with_process_resource_tracking_in_seconds", "WITH-PROCESS-RESOURCE-TRACKING-IN-SECONDS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "convert_process_resource_tracking_timing_info_to_seconds", "CONVERT-PROCESS-RESOURCE-TRACKING-TIMING-INFO-TO-SECONDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "nadd_clock_time_to_process_resource_timing_info", "NADD-CLOCK-TIME-TO-PROCESS-RESOURCE-TIMING-INFO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "process_resource_tracking_user_time", "PROCESS-RESOURCE-TRACKING-USER-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "process_resource_tracking_system_time", "PROCESS-RESOURCE-TRACKING-SYSTEM-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "process_resource_tracking_wall_clock_time", "PROCESS-RESOURCE-TRACKING-WALL-CLOCK-TIME", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "timing_info", "TIMING-INFO");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "user_time", "USER-TIME");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "user_time_in_seconds", "USER-TIME-IN-SECONDS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "system_time", "SYSTEM-TIME");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "system_time_in_seconds", "SYSTEM-TIME-IN-SECONDS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "check_type_if_present", "CHECK-TYPE-IF-PRESENT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "enforce_type_if_present", "ENFORCE-TYPE-IF-PRESENT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "check_list_type", "CHECK-LIST-TYPE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "check_list_type_if_present", "CHECK-LIST-TYPE-IF-PRESENT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "enforce_list_type", "ENFORCE-LIST-TYPE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "enforce_list_type_if_present", "ENFORCE-LIST-TYPE-IF-PRESENT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "check_plist_type", "CHECK-PLIST-TYPE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "enforce_plist_type", "ENFORCE-PLIST-TYPE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "warn_unless_plist_of_type", "WARN-UNLESS-PLIST-OF-TYPE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "must_if_present", "MUST-IF-PRESENT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "nil_or", "NIL-OR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "swap", "SWAP");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "def_kb_variable", "DEF-KB-VARIABLE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "register_kb_variable_initialization", "REGISTER-KB-VARIABLE-INITIALIZATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "initialize_kb_variables", "INITIALIZE-KB-VARIABLES", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "defparameter_lazy", "DEFPARAMETER-LAZY");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "defvar_lazy", "DEFVAR-LAZY");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "defglobal_lazy", "DEFGLOBAL-LAZY");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "deflexical_lazy", "DEFLEXICAL-LAZY");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "define_api_obsolete", "DEFINE-API-OBSOLETE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "register_obsolete_cyc_api_function", "REGISTER-OBSOLETE-CYC-API-FUNCTION", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "obsolete_cyc_api_replacements", "OBSOLETE-CYC-API-REPLACEMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "register_obsolete_cyc_api_replacements", "REGISTER-OBSOLETE-CYC-API-REPLACEMENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "deregister_obsolete_cyc_api_replacements", "DEREGISTER-OBSOLETE-CYC-API-REPLACEMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "initialization_for_partial_list_results", "INITIALIZATION-FOR-PARTIAL-LIST-RESULTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "accumulation_for_partial_list_results", "ACCUMULATION-FOR-PARTIAL-LIST-RESULTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "consolidation_for_partial_list_results", "CONSOLIDATION-FOR-PARTIAL-LIST-RESULTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "notification_for_partial_list_results", "NOTIFICATION-FOR-PARTIAL-LIST-RESULTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "final_results_for_partial_list_results", "FINAL-RESULTS-FOR-PARTIAL-LIST-RESULTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "add_result_to_partial_results_accumulator", "ADD-RESULT-TO-PARTIAL-RESULTS-ACCUMULATOR", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "with_partial_results_accumulation", "WITH-PARTIAL-RESULTS-ACCUMULATION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "with_space_profiling_to_string", "WITH-SPACE-PROFILING-TO-STRING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "with_sxhash_composite", "WITH-SXHASH-COMPOSITE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "with_sxhash_composite_fast", "WITH-SXHASH-COMPOSITE-FAST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "sxhash_composite_update_fast", "SXHASH-COMPOSITE-UPDATE-FAST");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "sxhash_update_state", "SXHASH-UPDATE-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "sxhash_composite_update", "SXHASH-COMPOSITE-UPDATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "slow_hash_test", "SLOW-HASH-TEST", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "fast_hash_test", "FAST-HASH-TEST", 0, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "possibly_catch_error_message", "POSSIBLY-CATCH-ERROR-MESSAGE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "possibly_ccatch", "POSSIBLY-CCATCH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "run_benchmark_compensating_for_paging", "RUN-BENCHMARK-COMPENSATING-FOR-PAGING");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.utilities_macros", "benchmark_gc", "BENCHMARK-GC", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "without_pretty_printing", "WITHOUT-PRETTY-PRINTING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "possibly_with_timeout", "POSSIBLY-WITH-TIMEOUT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.utilities_macros", "with_retries", "WITH-RETRIES");
        return (SubLObject)utilities_macros.NIL;
    }
    
    public static SubLObject init_utilities_macros_file() {
        utilities_macros.$api_special_table$ = SubLFiles.deflexical("*API-SPECIAL-TABLE*", (utilities_macros.NIL != Symbols.boundp((SubLObject)utilities_macros.$sym15$_API_SPECIAL_TABLE_)) ? utilities_macros.$api_special_table$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)utilities_macros.TEN_INTEGER, Symbols.symbol_function((SubLObject)utilities_macros.EQ), (SubLObject)utilities_macros.UNPROVIDED));
        utilities_macros.$api_predefined_function_table$ = SubLFiles.deflexical("*API-PREDEFINED-FUNCTION-TABLE*", (utilities_macros.NIL != Symbols.boundp((SubLObject)utilities_macros.$sym17$_API_PREDEFINED_FUNCTION_TABLE_)) ? utilities_macros.$api_predefined_function_table$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)utilities_macros.$int18$1000, Symbols.symbol_function((SubLObject)utilities_macros.EQ), (SubLObject)utilities_macros.UNPROVIDED));
        utilities_macros.$api_predefined_host_function_table$ = SubLFiles.deflexical("*API-PREDEFINED-HOST-FUNCTION-TABLE*", (utilities_macros.NIL != Symbols.boundp((SubLObject)utilities_macros.$sym19$_API_PREDEFINED_HOST_FUNCTION_TABLE_)) ? utilities_macros.$api_predefined_host_function_table$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)utilities_macros.$int20$100, Symbols.symbol_function((SubLObject)utilities_macros.EQ), (SubLObject)utilities_macros.UNPROVIDED));
        utilities_macros.$api_predefined_macro_table$ = SubLFiles.deflexical("*API-PREDEFINED-MACRO-TABLE*", (utilities_macros.NIL != Symbols.boundp((SubLObject)utilities_macros.$sym21$_API_PREDEFINED_MACRO_TABLE_)) ? utilities_macros.$api_predefined_macro_table$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)utilities_macros.$int20$100, Symbols.symbol_function((SubLObject)utilities_macros.EQ), (SubLObject)utilities_macros.UNPROVIDED));
        utilities_macros.$api_predefined_host_macro_table$ = SubLFiles.deflexical("*API-PREDEFINED-HOST-MACRO-TABLE*", (utilities_macros.NIL != Symbols.boundp((SubLObject)utilities_macros.$sym22$_API_PREDEFINED_HOST_MACRO_TABLE_)) ? utilities_macros.$api_predefined_host_macro_table$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)utilities_macros.TEN_INTEGER, Symbols.symbol_function((SubLObject)utilities_macros.EQ), (SubLObject)utilities_macros.UNPROVIDED));
        utilities_macros.$api_symbols$ = SubLFiles.deflexical("*API-SYMBOLS*", (SubLObject)((utilities_macros.NIL != Symbols.boundp((SubLObject)utilities_macros.$sym23$_API_SYMBOLS_)) ? utilities_macros.$api_symbols$.getGlobalValue() : utilities_macros.NIL));
        utilities_macros.$api_types$ = SubLFiles.deflexical("*API-TYPES*", (SubLObject)((utilities_macros.NIL != Symbols.boundp((SubLObject)utilities_macros.$sym29$_API_TYPES_)) ? utilities_macros.$api_types$.getGlobalValue() : utilities_macros.NIL));
        utilities_macros.$kb_function_table$ = SubLFiles.deflexical("*KB-FUNCTION-TABLE*", (utilities_macros.NIL != Symbols.boundp((SubLObject)utilities_macros.$sym58$_KB_FUNCTION_TABLE_)) ? utilities_macros.$kb_function_table$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)utilities_macros.$int59$400, Symbols.symbol_function((SubLObject)utilities_macros.EQ), (SubLObject)utilities_macros.UNPROVIDED));
        utilities_macros.$funcall_helper_property$ = SubLFiles.deflexical("*FUNCALL-HELPER-PROPERTY*", (SubLObject)((utilities_macros.NIL != Symbols.boundp((SubLObject)utilities_macros.$sym65$_FUNCALL_HELPER_PROPERTY_)) ? utilities_macros.$funcall_helper_property$.getGlobalValue() : utilities_macros.$kw66$FUNCALL_HELPER));
        utilities_macros.$unprovided$ = SubLFiles.deflexical("*UNPROVIDED*", (utilities_macros.NIL != Symbols.boundp((SubLObject)utilities_macros.$sym68$_UNPROVIDED_)) ? utilities_macros.$unprovided$.getGlobalValue() : Symbols.make_symbol((SubLObject)utilities_macros.$str69$UNPROVIDED));
        utilities_macros.$cfasl_stream$ = SubLFiles.defparameter("*CFASL-STREAM*", (SubLObject)utilities_macros.NIL);
        utilities_macros.$global_locks$ = SubLFiles.deflexical("*GLOBAL-LOCKS*", (SubLObject)((utilities_macros.NIL != Symbols.boundp((SubLObject)utilities_macros.$sym98$_GLOBAL_LOCKS_)) ? utilities_macros.$global_locks$.getGlobalValue() : utilities_macros.NIL));
        utilities_macros.$fi_state_variables$ = SubLFiles.deflexical("*FI-STATE-VARIABLES*", (SubLObject)((utilities_macros.NIL != Symbols.boundp((SubLObject)utilities_macros.$sym106$_FI_STATE_VARIABLES_)) ? utilities_macros.$fi_state_variables$.getGlobalValue() : utilities_macros.NIL));
        utilities_macros.$html_state_variables$ = SubLFiles.deflexical("*HTML-STATE-VARIABLES*", (SubLObject)((utilities_macros.NIL != Symbols.boundp((SubLObject)utilities_macros.$sym113$_HTML_STATE_VARIABLES_)) ? utilities_macros.$html_state_variables$.getGlobalValue() : utilities_macros.NIL));
        utilities_macros.$html_interface_variables$ = SubLFiles.deflexical("*HTML-INTERFACE-VARIABLES*", (SubLObject)((utilities_macros.NIL != Symbols.boundp((SubLObject)utilities_macros.$sym117$_HTML_INTERFACE_VARIABLES_)) ? utilities_macros.$html_interface_variables$.getGlobalValue() : utilities_macros.NIL));
        utilities_macros.$gt_state_variables$ = SubLFiles.deflexical("*GT-STATE-VARIABLES*", (SubLObject)((utilities_macros.NIL != Symbols.boundp((SubLObject)utilities_macros.$sym142$_GT_STATE_VARIABLES_)) ? utilities_macros.$gt_state_variables$.getGlobalValue() : utilities_macros.NIL));
        utilities_macros.$at_state_variables$ = SubLFiles.deflexical("*AT-STATE-VARIABLES*", (SubLObject)((utilities_macros.NIL != Symbols.boundp((SubLObject)utilities_macros.$sym144$_AT_STATE_VARIABLES_)) ? utilities_macros.$at_state_variables$.getGlobalValue() : utilities_macros.NIL));
        utilities_macros.$defn_state_variables$ = SubLFiles.deflexical("*DEFN-STATE-VARIABLES*", (SubLObject)((utilities_macros.NIL != Symbols.boundp((SubLObject)utilities_macros.$sym145$_DEFN_STATE_VARIABLES_)) ? utilities_macros.$defn_state_variables$.getGlobalValue() : utilities_macros.NIL));
        utilities_macros.$kbp_state_variables$ = SubLFiles.deflexical("*KBP-STATE-VARIABLES*", (SubLObject)((utilities_macros.NIL != Symbols.boundp((SubLObject)utilities_macros.$sym148$_KBP_STATE_VARIABLES_)) ? utilities_macros.$kbp_state_variables$.getGlobalValue() : utilities_macros.NIL));
        utilities_macros.$current_forward_problem_store$ = SubLFiles.defparameter("*CURRENT-FORWARD-PROBLEM-STORE*", (SubLObject)utilities_macros.NIL);
        utilities_macros.$tracing_level$ = SubLFiles.defparameter("*TRACING-LEVEL*", (SubLObject)utilities_macros.NIL);
        utilities_macros.$structure_resourcing_enabled$ = SubLFiles.deflexical("*STRUCTURE-RESOURCING-ENABLED*", (SubLObject)utilities_macros.NIL);
        utilities_macros.$structure_resourcing_make_static$ = SubLFiles.defparameter("*STRUCTURE-RESOURCING-MAKE-STATIC*", (SubLObject)utilities_macros.NIL);
        utilities_macros.$progress_last_pacification_time$ = SubLFiles.defparameter("*PROGRESS-LAST-PACIFICATION-TIME*", (SubLObject)utilities_macros.NIL);
        utilities_macros.$progress_pacifications_since_last_nl$ = SubLFiles.defparameter("*PROGRESS-PACIFICATIONS-SINCE-LAST-NL*", (SubLObject)utilities_macros.NIL);
        utilities_macros.$progress_elapsed_seconds_for_notification$ = SubLFiles.defparameter("*PROGRESS-ELAPSED-SECONDS-FOR-NOTIFICATION*", (SubLObject)utilities_macros.NIL);
        utilities_macros.$progress_notification_count$ = SubLFiles.defparameter("*PROGRESS-NOTIFICATION-COUNT*", (SubLObject)utilities_macros.NIL);
        utilities_macros.$progress_count$ = SubLFiles.defparameter("*PROGRESS-COUNT*", (SubLObject)utilities_macros.NIL);
        utilities_macros.$is_noting_progressP$ = SubLFiles.defparameter("*IS-NOTING-PROGRESS?*", (SubLObject)utilities_macros.NIL);
        utilities_macros.$noting_progress_delayed_mode_seconds$ = SubLFiles.defparameter("*NOTING-PROGRESS-DELAYED-MODE-SECONDS*", (SubLObject)utilities_macros.NIL);
        utilities_macros.$noting_progress_delayed_mode_string$ = SubLFiles.defparameter("*NOTING-PROGRESS-DELAYED-MODE-STRING*", (SubLObject)utilities_macros.NIL);
        utilities_macros.$professional_progress_modeP$ = SubLFiles.defparameter("*PROFESSIONAL-PROGRESS-MODE?*", (SubLObject)utilities_macros.NIL);
        utilities_macros.$suppress_all_progress_faster_than_seconds$ = SubLFiles.defparameter("*SUPPRESS-ALL-PROGRESS-FASTER-THAN-SECONDS*", (SubLObject)utilities_macros.ONE_INTEGER);
        utilities_macros.$silent_progressP$ = SubLFiles.defvar("*SILENT-PROGRESS?*", (SubLObject)utilities_macros.NIL);
        utilities_macros.$noting_progress_start_time$ = SubLFiles.defparameter("*NOTING-PROGRESS-START-TIME*", (SubLObject)utilities_macros.NIL);
        utilities_macros.$last_percent_progress_index$ = SubLFiles.defvar("*LAST-PERCENT-PROGRESS-INDEX*", (SubLObject)utilities_macros.NIL);
        utilities_macros.$last_percent_progress_prediction$ = SubLFiles.defparameter("*LAST-PERCENT-PROGRESS-PREDICTION*", (SubLObject)utilities_macros.NIL);
        utilities_macros.$within_noting_percent_progress$ = SubLFiles.defvar("*WITHIN-NOTING-PERCENT-PROGRESS*", (SubLObject)utilities_macros.NIL);
        utilities_macros.$percent_progress_start_time$ = SubLFiles.defvar("*PERCENT-PROGRESS-START-TIME*", (SubLObject)utilities_macros.NIL);
        utilities_macros.$percent_progress_delayed_mode_seconds$ = SubLFiles.defvar("*PERCENT-PROGRESS-DELAYED-MODE-SECONDS*", (SubLObject)utilities_macros.NIL);
        utilities_macros.$percent_progress_delayed_mode_string$ = SubLFiles.defvar("*PERCENT-PROGRESS-DELAYED-MODE-STRING*", (SubLObject)utilities_macros.NIL);
        utilities_macros.$progress_note$ = SubLFiles.defparameter("*PROGRESS-NOTE*", (SubLObject)utilities_macros.$str272$);
        utilities_macros.$progress_start_time$ = SubLFiles.defparameter("*PROGRESS-START-TIME*", Time.get_universal_time());
        utilities_macros.$progress_total$ = SubLFiles.defparameter("*PROGRESS-TOTAL*", (SubLObject)utilities_macros.ONE_INTEGER);
        utilities_macros.$progress_sofar$ = SubLFiles.defparameter("*PROGRESS-SOFAR*", (SubLObject)utilities_macros.ZERO_INTEGER);
        utilities_macros.$util_var_error_format_string$ = SubLFiles.defparameter("*UTIL-VAR-ERROR-FORMAT-STRING*", (SubLObject)utilities_macros.$str331$_S___var__S_is_not_a_symbol_);
        utilities_macros.$util_func_error_format_string$ = SubLFiles.defparameter("*UTIL-FUNC-ERROR-FORMAT-STRING*", (SubLObject)utilities_macros.$str332$_S___function__S_is_not_a_symbol_);
        utilities_macros.$util_search_type_error_format_string$ = SubLFiles.defparameter("*UTIL-SEARCH-TYPE-ERROR-FORMAT-STRING*", (SubLObject)utilities_macros.$str333$_S___search_type__S_is_not_one_of);
        utilities_macros.$process_resource_tracking_100s_of_nanoseconds_properties$ = SubLFiles.deflexical("*PROCESS-RESOURCE-TRACKING-100S-OF-NANOSECONDS-PROPERTIES*", (SubLObject)utilities_macros.$list461);
        utilities_macros.$kb_var_initializations$ = SubLFiles.deflexical("*KB-VAR-INITIALIZATIONS*", (SubLObject)((utilities_macros.NIL != Symbols.boundp((SubLObject)utilities_macros.$sym510$_KB_VAR_INITIALIZATIONS_)) ? utilities_macros.$kb_var_initializations$.getGlobalValue() : utilities_macros.NIL));
        utilities_macros.$partial_results_accumulator$ = SubLFiles.defparameter("*PARTIAL-RESULTS-ACCUMULATOR*", (SubLObject)utilities_macros.NIL);
        utilities_macros.$partial_results_size$ = SubLFiles.defparameter("*PARTIAL-RESULTS-SIZE*", (SubLObject)utilities_macros.NIL);
        utilities_macros.$partial_results_threshold$ = SubLFiles.defparameter("*PARTIAL-RESULTS-THRESHOLD*", (SubLObject)utilities_macros.$int534$40);
        utilities_macros.$partial_results_total_size$ = SubLFiles.defparameter("*PARTIAL-RESULTS-TOTAL-SIZE*", (SubLObject)utilities_macros.NIL);
        utilities_macros.$partial_results_total_accumulator$ = SubLFiles.defparameter("*PARTIAL-RESULTS-TOTAL-ACCUMULATOR*", (SubLObject)utilities_macros.NIL);
        utilities_macros.$partial_results_initialization_fn$ = SubLFiles.defparameter("*PARTIAL-RESULTS-INITIALIZATION-FN*", (SubLObject)utilities_macros.$sym535$INITIALIZATION_FOR_PARTIAL_LIST_RESULTS);
        utilities_macros.$partial_results_accumulation_fn$ = SubLFiles.defparameter("*PARTIAL-RESULTS-ACCUMULATION-FN*", (SubLObject)utilities_macros.$sym536$ACCUMULATION_FOR_PARTIAL_LIST_RESULTS);
        utilities_macros.$partial_results_consolidation_fn$ = SubLFiles.defparameter("*PARTIAL-RESULTS-CONSOLIDATION-FN*", (SubLObject)utilities_macros.$sym537$CONSOLIDATION_FOR_PARTIAL_LIST_RESULTS);
        utilities_macros.$partial_results_notification_fn$ = SubLFiles.defparameter("*PARTIAL-RESULTS-NOTIFICATION-FN*", (SubLObject)utilities_macros.$sym538$NOTIFICATION_FOR_PARTIAL_LIST_RESULTS);
        utilities_macros.$partial_results_final_result_fn$ = SubLFiles.defparameter("*PARTIAL-RESULTS-FINAL-RESULT-FN*", (SubLObject)utilities_macros.$sym539$FINAL_RESULTS_FOR_PARTIAL_LIST_RESULTS);
        utilities_macros.$accumulating_partial_resultsP$ = SubLFiles.defparameter("*ACCUMULATING-PARTIAL-RESULTS?*", (SubLObject)utilities_macros.NIL);
        utilities_macros.$sxhash_bit_limit$ = SubLFiles.defconstant("*SXHASH-BIT-LIMIT*", (SubLObject)utilities_macros.$int568$27);
        utilities_macros.$sxhash_update_state_vector$ = SubLFiles.deflexical("*SXHASH-UPDATE-STATE-VECTOR*", utilities_macros.$ic569);
        utilities_macros.$sxhash_composite_state$ = SubLFiles.defparameter("*SXHASH-COMPOSITE-STATE*", (SubLObject)utilities_macros.NIL);
        utilities_macros.$sxhash_composite_hash$ = SubLFiles.defparameter("*SXHASH-COMPOSITE-HASH*", (SubLObject)utilities_macros.NIL);
        return (SubLObject)utilities_macros.NIL;
    }
    
    public static SubLObject setup_utilities_macros_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)utilities_macros.$sym15$_API_SPECIAL_TABLE_);
        subl_macro_promotions.declare_defglobal((SubLObject)utilities_macros.$sym17$_API_PREDEFINED_FUNCTION_TABLE_);
        subl_macro_promotions.declare_defglobal((SubLObject)utilities_macros.$sym19$_API_PREDEFINED_HOST_FUNCTION_TABLE_);
        subl_macro_promotions.declare_defglobal((SubLObject)utilities_macros.$sym21$_API_PREDEFINED_MACRO_TABLE_);
        subl_macro_promotions.declare_defglobal((SubLObject)utilities_macros.$sym22$_API_PREDEFINED_HOST_MACRO_TABLE_);
        subl_macro_promotions.declare_defglobal((SubLObject)utilities_macros.$sym23$_API_SYMBOLS_);
        subl_macro_promotions.declare_defglobal((SubLObject)utilities_macros.$sym29$_API_TYPES_);
        access_macros.register_external_symbol((SubLObject)utilities_macros.$sym41$DEFINE_AFTER_ADDING);
        access_macros.register_external_symbol((SubLObject)utilities_macros.$sym43$DEFINE_AFTER_REMOVING);
        access_macros.register_external_symbol((SubLObject)utilities_macros.$sym44$DEFINE_RULE_AFTER_ADDING);
        access_macros.register_external_symbol((SubLObject)utilities_macros.$sym45$DEFINE_RULE_AFTER_REMOVING);
        access_macros.register_external_symbol((SubLObject)utilities_macros.$sym46$DEFINE_COLLECTION_DEFN);
        access_macros.register_external_symbol((SubLObject)utilities_macros.$sym47$DEFINE_EVALUATION_DEFN);
        access_macros.register_external_symbol((SubLObject)utilities_macros.$sym49$DEFINE_EXPANSION_DEFN);
        access_macros.register_external_symbol((SubLObject)utilities_macros.$sym50$DEFINE_CYC_SUBL_DEFN);
        access_macros.register_external_symbol((SubLObject)utilities_macros.$sym42$DEFINE_KB);
        subl_macro_promotions.declare_defglobal((SubLObject)utilities_macros.$sym58$_KB_FUNCTION_TABLE_);
        access_macros.register_macro_helper((SubLObject)utilities_macros.$sym57$REGISTER_KB_FUNCTION, (SubLObject)utilities_macros.$sym42$DEFINE_KB);
        access_macros.register_external_symbol((SubLObject)utilities_macros.$sym62$DEREGISTER_KB_FUNCTION);
        subl_macro_promotions.declare_defglobal((SubLObject)utilities_macros.$sym65$_FUNCALL_HELPER_PROPERTY_);
        access_macros.register_macro_helper((SubLObject)utilities_macros.$sym64$NOTE_FUNCALL_HELPER_FUNCTION, (SubLObject)utilities_macros.$sym67$DEFINE_PRIVATE_FUNCALL);
        subl_macro_promotions.declare_defglobal((SubLObject)utilities_macros.$sym68$_UNPROVIDED_);
        subl_macro_promotions.declare_defglobal((SubLObject)utilities_macros.$sym98$_GLOBAL_LOCKS_);
        access_macros.register_macro_helper((SubLObject)utilities_macros.$sym97$REGISTER_GLOBAL_LOCK, (SubLObject)utilities_macros.$sym97$REGISTER_GLOBAL_LOCK);
        access_macros.register_macro_helper((SubLObject)utilities_macros.$sym103$INITIALIZE_GLOBAL_LOCK_INTERNAL, (SubLObject)utilities_macros.$sym104$INITIALIZE_GLOBAL_LOCKS);
        subl_macro_promotions.declare_defglobal((SubLObject)utilities_macros.$sym106$_FI_STATE_VARIABLES_);
        subl_macro_promotions.declare_defglobal((SubLObject)utilities_macros.$sym113$_HTML_STATE_VARIABLES_);
        subl_macro_promotions.declare_defglobal((SubLObject)utilities_macros.$sym117$_HTML_INTERFACE_VARIABLES_);
        access_macros.register_macro_helper((SubLObject)utilities_macros.$sym120$NOTE_STATE_VARIABLE_DOCUMENTATION, (SubLObject)utilities_macros.$sym121$DEF_STATE_VARIABLE);
        subl_macro_promotions.declare_defglobal((SubLObject)utilities_macros.$sym142$_GT_STATE_VARIABLES_);
        subl_macro_promotions.declare_defglobal((SubLObject)utilities_macros.$sym144$_AT_STATE_VARIABLES_);
        subl_macro_promotions.declare_defglobal((SubLObject)utilities_macros.$sym145$_DEFN_STATE_VARIABLES_);
        subl_macro_promotions.declare_defglobal((SubLObject)utilities_macros.$sym148$_KBP_STATE_VARIABLES_);
        access_macros.register_macro_helper((SubLObject)utilities_macros.$sym161$POSSIBLY_GET_FORWARD_INFERENCE_ENVIRONMENT, (SubLObject)utilities_macros.$sym162$WITH_POSSIBLY_CLEAN_FORWARD_INFERENCE_ENVIRONMENT);
        access_macros.register_macro_helper((SubLObject)utilities_macros.$sym226$NOTING_PROGRESS_PREAMBLE, (SubLObject)utilities_macros.$sym231$NOTING_PROGRESS);
        access_macros.register_macro_helper((SubLObject)utilities_macros.$sym235$NOTING_PROGRESS_POSTAMBLE, (SubLObject)utilities_macros.$sym231$NOTING_PROGRESS);
        access_macros.register_macro_helper((SubLObject)utilities_macros.$sym241$NOTE_PROGRESS, (SubLObject)utilities_macros.$sym231$NOTING_PROGRESS);
        access_macros.register_macro_helper((SubLObject)utilities_macros.$sym250$NOTING_PERCENT_PROGRESS_PREAMBLE, (SubLObject)utilities_macros.$sym254$NOTING_PERCENT_PROGRESS);
        access_macros.register_macro_helper((SubLObject)utilities_macros.$sym255$NOTING_PERCENT_PROGRESS_POSTAMBLE, (SubLObject)utilities_macros.$sym254$NOTING_PERCENT_PROGRESS);
        access_macros.register_macro_helper((SubLObject)utilities_macros.$sym258$NOTE_PERCENT_PROGRESS, (SubLObject)utilities_macros.$sym254$NOTING_PERCENT_PROGRESS);
        access_macros.register_external_symbol((SubLObject)utilities_macros.$sym289$PROGRESS_CDOLIST);
        access_macros.register_macro_helper((SubLObject)utilities_macros.$sym310$NOTING_ELAPSED_TIME_PREAMBLE, (SubLObject)utilities_macros.$sym312$NOTING_ELAPSED_TIME);
        access_macros.register_macro_helper((SubLObject)utilities_macros.$sym311$NOTING_ELAPSED_TIME_POSTAMBLE, (SubLObject)utilities_macros.$sym312$NOTING_ELAPSED_TIME);
        access_macros.register_macro_helper((SubLObject)utilities_macros.$sym432$SUB_KB_LOADED_P_SYMBOL, (SubLObject)utilities_macros.$sym433$DECLARE_KB_FEATURE);
        access_macros.register_macro_helper((SubLObject)utilities_macros.$sym435$SUB_KB_SET_SYMBOL, (SubLObject)utilities_macros.$sym433$DECLARE_KB_FEATURE);
        access_macros.register_macro_helper((SubLObject)utilities_macros.$sym437$SUB_KB_UNSET_SYMBOL, (SubLObject)utilities_macros.$sym433$DECLARE_KB_FEATURE);
        access_macros.register_macro_helper((SubLObject)utilities_macros.$sym459$CONVERT_PROCESS_RESOURCE_TRACKING_TIMING_INFO_TO_SECONDS, (SubLObject)utilities_macros.$sym462$WITH_PROCESS_RESOURCE_TRACKING_IN_SECONDS);
        access_macros.register_macro_helper((SubLObject)utilities_macros.$sym460$NADD_CLOCK_TIME_TO_PROCESS_RESOURCE_TIMING_INFO, (SubLObject)utilities_macros.$sym462$WITH_PROCESS_RESOURCE_TRACKING_IN_SECONDS);
        subl_macro_promotions.declare_defglobal((SubLObject)utilities_macros.$sym510$_KB_VAR_INITIALIZATIONS_);
        access_macros.register_macro_helper((SubLObject)utilities_macros.$sym509$REGISTER_KB_VARIABLE_INITIALIZATION, (SubLObject)utilities_macros.$sym511$DEF_KB_VARIABLE);
        access_macros.register_external_symbol((SubLObject)utilities_macros.$sym547$WITH_SPACE_PROFILING_TO_STRING);
        access_macros.register_macro_helper((SubLObject)utilities_macros.$sym570$SXHASH_COMPOSITE_UPDATE, (SubLObject)utilities_macros.$sym571$COMPUTE_SXHASH_COMPOSITE);
        access_macros.register_macro_helper((SubLObject)utilities_macros.$sym585$BENCHMARK_GC, (SubLObject)utilities_macros.$sym586$RUN_BENCHMARK_COMPENSATING_FOR_PAGING);
        return (SubLObject)utilities_macros.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_utilities_macros_file();
    }
    
    @Override
	public void initializeVariables() {
        init_utilities_macros_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_utilities_macros_file();
    }
    
    static {
        me = (SubLFile)new utilities_macros();
        utilities_macros.$api_special_table$ = null;
        utilities_macros.$api_predefined_function_table$ = null;
        utilities_macros.$api_predefined_host_function_table$ = null;
        utilities_macros.$api_predefined_macro_table$ = null;
        utilities_macros.$api_predefined_host_macro_table$ = null;
        utilities_macros.$api_symbols$ = null;
        utilities_macros.$api_types$ = null;
        utilities_macros.$kb_function_table$ = null;
        utilities_macros.$funcall_helper_property$ = null;
        utilities_macros.$unprovided$ = null;
        utilities_macros.$cfasl_stream$ = null;
        utilities_macros.$global_locks$ = null;
        utilities_macros.$fi_state_variables$ = null;
        utilities_macros.$html_state_variables$ = null;
        utilities_macros.$html_interface_variables$ = null;
        utilities_macros.$gt_state_variables$ = null;
        utilities_macros.$at_state_variables$ = null;
        utilities_macros.$defn_state_variables$ = null;
        utilities_macros.$kbp_state_variables$ = null;
        utilities_macros.$current_forward_problem_store$ = null;
        utilities_macros.$tracing_level$ = null;
        utilities_macros.$structure_resourcing_enabled$ = null;
        utilities_macros.$structure_resourcing_make_static$ = null;
        utilities_macros.$progress_last_pacification_time$ = null;
        utilities_macros.$progress_pacifications_since_last_nl$ = null;
        utilities_macros.$progress_elapsed_seconds_for_notification$ = null;
        utilities_macros.$progress_notification_count$ = null;
        utilities_macros.$progress_count$ = null;
        utilities_macros.$is_noting_progressP$ = null;
        utilities_macros.$noting_progress_delayed_mode_seconds$ = null;
        utilities_macros.$noting_progress_delayed_mode_string$ = null;
        utilities_macros.$professional_progress_modeP$ = null;
        utilities_macros.$suppress_all_progress_faster_than_seconds$ = null;
        utilities_macros.$silent_progressP$ = null;
        utilities_macros.$noting_progress_start_time$ = null;
        utilities_macros.$last_percent_progress_index$ = null;
        utilities_macros.$last_percent_progress_prediction$ = null;
        utilities_macros.$within_noting_percent_progress$ = null;
        utilities_macros.$percent_progress_start_time$ = null;
        utilities_macros.$percent_progress_delayed_mode_seconds$ = null;
        utilities_macros.$percent_progress_delayed_mode_string$ = null;
        utilities_macros.$progress_note$ = null;
        utilities_macros.$progress_start_time$ = null;
        utilities_macros.$progress_total$ = null;
        utilities_macros.$progress_sofar$ = null;
        utilities_macros.$util_var_error_format_string$ = null;
        utilities_macros.$util_func_error_format_string$ = null;
        utilities_macros.$util_search_type_error_format_string$ = null;
        utilities_macros.$process_resource_tracking_100s_of_nanoseconds_properties$ = null;
        utilities_macros.$kb_var_initializations$ = null;
        utilities_macros.$partial_results_accumulator$ = null;
        utilities_macros.$partial_results_size$ = null;
        utilities_macros.$partial_results_threshold$ = null;
        utilities_macros.$partial_results_total_size$ = null;
        utilities_macros.$partial_results_total_accumulator$ = null;
        utilities_macros.$partial_results_initialization_fn$ = null;
        utilities_macros.$partial_results_accumulation_fn$ = null;
        utilities_macros.$partial_results_consolidation_fn$ = null;
        utilities_macros.$partial_results_notification_fn$ = null;
        utilities_macros.$partial_results_final_result_fn$ = null;
        utilities_macros.$accumulating_partial_resultsP$ = null;
        utilities_macros.$sxhash_bit_limit$ = null;
        utilities_macros.$sxhash_update_state_vector$ = null;
        utilities_macros.$sxhash_composite_state$ = null;
        utilities_macros.$sxhash_composite_hash$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("ARGLIST"), (SubLObject)SubLObjectFactory.makeSymbol("DOCUMENTATION-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE-DECLARATIONS"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym1$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym2$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym3$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym4$DEFINE_PUBLIC = SubLObjectFactory.makeSymbol("DEFINE-PUBLIC");
        $sym5$REGISTER_CYC_API_FUNCTION = SubLObjectFactory.makeSymbol("REGISTER-CYC-API-FUNCTION");
        $sym6$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("ARGLIST"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOCUMENTATION-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE-DECLARATIONS"));
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("PATTERN"), (SubLObject)SubLObjectFactory.makeSymbol("DOCUMENTATION-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym10$DEFMACRO_PUBLIC = SubLObjectFactory.makeSymbol("DEFMACRO-PUBLIC");
        $sym11$REGISTER_CYC_API_MACRO = SubLObjectFactory.makeSymbol("REGISTER-CYC-API-MACRO");
        $sym12$DEFINE_EXTERNAL = SubLObjectFactory.makeSymbol("DEFINE-EXTERNAL");
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("PATTERN"), (SubLObject)SubLObjectFactory.makeSymbol("DOCUMENTATION-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE-DECLARATIONS"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym14$REGISTER_EXTERNAL_SYMBOL = SubLObjectFactory.makeSymbol("REGISTER-EXTERNAL-SYMBOL");
        $sym15$_API_SPECIAL_TABLE_ = SubLObjectFactory.makeSymbol("*API-SPECIAL-TABLE*");
        $str16$Registering__A_as_special_even_th = SubLObjectFactory.makeString("Registering ~A as special even though it's already predefined!");
        $sym17$_API_PREDEFINED_FUNCTION_TABLE_ = SubLObjectFactory.makeSymbol("*API-PREDEFINED-FUNCTION-TABLE*");
        $int18$1000 = SubLObjectFactory.makeInteger(1000);
        $sym19$_API_PREDEFINED_HOST_FUNCTION_TABLE_ = SubLObjectFactory.makeSymbol("*API-PREDEFINED-HOST-FUNCTION-TABLE*");
        $int20$100 = SubLObjectFactory.makeInteger(100);
        $sym21$_API_PREDEFINED_MACRO_TABLE_ = SubLObjectFactory.makeSymbol("*API-PREDEFINED-MACRO-TABLE*");
        $sym22$_API_PREDEFINED_HOST_MACRO_TABLE_ = SubLObjectFactory.makeSymbol("*API-PREDEFINED-HOST-MACRO-TABLE*");
        $sym23$_API_SYMBOLS_ = SubLObjectFactory.makeSymbol("*API-SYMBOLS*");
        $kw24$CYC_API_SYMBOL = SubLObjectFactory.makeKeyword("CYC-API-SYMBOL");
        $sym25$SYMBOLP = SubLObjectFactory.makeSymbol("SYMBOLP");
        $kw26$CYC_API_ARGS = SubLObjectFactory.makeKeyword("CYC-API-ARGS");
        $kw27$CYC_API_ARG_TYPES = SubLObjectFactory.makeKeyword("CYC-API-ARG-TYPES");
        $kw28$CYC_API_RETURN_TYPES = SubLObjectFactory.makeKeyword("CYC-API-RETURN-TYPES");
        $sym29$_API_TYPES_ = SubLObjectFactory.makeSymbol("*API-TYPES*");
        $kw30$REPLACEMENTS = SubLObjectFactory.makeKeyword("REPLACEMENTS");
        $str31$_replacements_not_allowed_in_the_ = SubLObjectFactory.makeString(":replacements not allowed in the declaration of Cyc API function");
        $kw32$ARGUMENT_TYPES = SubLObjectFactory.makeKeyword("ARGUMENT-TYPES");
        $kw33$RETURN_TYPES = SubLObjectFactory.makeKeyword("RETURN-TYPES");
        $sym34$ENFORCE_TYPE = SubLObjectFactory.makeSymbol("ENFORCE-TYPE");
        $sym35$NIL_OR = SubLObjectFactory.makeSymbol("NIL-OR");
        $str36$Invalid_argument_type_expression_ = SubLObjectFactory.makeString("Invalid argument-type expression ~S");
        $sym37$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $str38$_S_return_type_expression_not_lis = SubLObjectFactory.makeString("~S return type expression not list length 2.");
        $list39 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("NIL-OR"));
        $str40$_S_complex_return_type_expression = SubLObjectFactory.makeString("~S complex return type expression not of form (nil-or X) or (list X).");
        $sym41$DEFINE_AFTER_ADDING = SubLObjectFactory.makeSymbol("DEFINE-AFTER-ADDING");
        $sym42$DEFINE_KB = SubLObjectFactory.makeSymbol("DEFINE-KB");
        $sym43$DEFINE_AFTER_REMOVING = SubLObjectFactory.makeSymbol("DEFINE-AFTER-REMOVING");
        $sym44$DEFINE_RULE_AFTER_ADDING = SubLObjectFactory.makeSymbol("DEFINE-RULE-AFTER-ADDING");
        $sym45$DEFINE_RULE_AFTER_REMOVING = SubLObjectFactory.makeSymbol("DEFINE-RULE-AFTER-REMOVING");
        $sym46$DEFINE_COLLECTION_DEFN = SubLObjectFactory.makeSymbol("DEFINE-COLLECTION-DEFN");
        $sym47$DEFINE_EVALUATION_DEFN = SubLObjectFactory.makeSymbol("DEFINE-EVALUATION-DEFN");
        $list48 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("PATTERN"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym49$DEFINE_EXPANSION_DEFN = SubLObjectFactory.makeSymbol("DEFINE-EXPANSION-DEFN");
        $sym50$DEFINE_CYC_SUBL_DEFN = SubLObjectFactory.makeSymbol("DEFINE-CYC-SUBL-DEFN");
        $list51 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION-SYMBOL"), (SubLObject)SubLObjectFactory.makeSymbol("BASIS-FUNCTION"));
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"));
        $list53 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBL-ESCAPE-P"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"));
        $sym54$RET = SubLObjectFactory.makeSymbol("RET");
        $list55 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBL-ESCAPE-SUBL"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")));
        $sym56$DEFINE = SubLObjectFactory.makeSymbol("DEFINE");
        $sym57$REGISTER_KB_FUNCTION = SubLObjectFactory.makeSymbol("REGISTER-KB-FUNCTION");
        $sym58$_KB_FUNCTION_TABLE_ = SubLObjectFactory.makeSymbol("*KB-FUNCTION-TABLE*");
        $int59$400 = SubLObjectFactory.makeInteger(400);
        $sym60$STRING_LESSP = SubLObjectFactory.makeSymbol("STRING-LESSP");
        $sym61$SYMBOL_NAME = SubLObjectFactory.makeSymbol("SYMBOL-NAME");
        $sym62$DEREGISTER_KB_FUNCTION = SubLObjectFactory.makeSymbol("DEREGISTER-KB-FUNCTION");
        $sym63$DEFINE_PRIVATE = SubLObjectFactory.makeSymbol("DEFINE-PRIVATE");
        $sym64$NOTE_FUNCALL_HELPER_FUNCTION = SubLObjectFactory.makeSymbol("NOTE-FUNCALL-HELPER-FUNCTION");
        $sym65$_FUNCALL_HELPER_PROPERTY_ = SubLObjectFactory.makeSymbol("*FUNCALL-HELPER-PROPERTY*");
        $kw66$FUNCALL_HELPER = SubLObjectFactory.makeKeyword("FUNCALL-HELPER");
        $sym67$DEFINE_PRIVATE_FUNCALL = SubLObjectFactory.makeSymbol("DEFINE-PRIVATE-FUNCALL");
        $sym68$_UNPROVIDED_ = SubLObjectFactory.makeSymbol("*UNPROVIDED*");
        $str69$UNPROVIDED = SubLObjectFactory.makeString("UNPROVIDED");
        $list70 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("FANCY-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("DESCRIPTION"), (SubLObject)SubLObjectFactory.makeSymbol("SETTINGS-SPEC"));
        $sym71$DECLARE_CONTROL_PARAMETER_INTERNAL = SubLObjectFactory.makeSymbol("DECLARE-CONTROL-PARAMETER-INTERNAL");
        $kw72$FANCY_NAME = SubLObjectFactory.makeKeyword("FANCY-NAME");
        $kw73$DESCRIPTION = SubLObjectFactory.makeKeyword("DESCRIPTION");
        $kw74$SETTINGS_SPEC = SubLObjectFactory.makeKeyword("SETTINGS-SPEC");
        $sym75$CCATCH_IGNORE = SubLObjectFactory.makeSymbol("CCATCH-IGNORE");
        $kw76$MAPPING_DONE = SubLObjectFactory.makeKeyword("MAPPING-DONE");
        $kw77$SBHL_MAPPING_DONE = SubLObjectFactory.makeKeyword("SBHL-MAPPING-DONE");
        $list78 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJ"));
        $sym79$WRITE_BYTE = SubLObjectFactory.makeSymbol("WRITE-BYTE");
        $list80 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CFASL-STREAM*"));
        $list81 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("READ-BYTE"), (SubLObject)SubLObjectFactory.makeSymbol("*CFASL-STREAM*"), (SubLObject)utilities_macros.NIL, (SubLObject)utilities_macros.NIL);
        $list82 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("ACTION"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("ELSE-ACTION"));
        $sym83$LOCK_VAR = SubLObjectFactory.makeUninternedSymbol("LOCK-VAR");
        $sym84$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym85$PIF = SubLObjectFactory.makeSymbol("PIF");
        $sym86$LOCK_IDLE_P = SubLObjectFactory.makeSymbol("LOCK-IDLE-P");
        $sym87$WITH_LOCK_HELD = SubLObjectFactory.makeSymbol("WITH-LOCK-HELD");
        $list88 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list89 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VACCESS"), (SubLObject)SubLObjectFactory.makeSymbol("DOCUMENTATION"));
        $list90 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VACCESS"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"));
        $kw91$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw92$VACCESS = SubLObjectFactory.makeKeyword("VACCESS");
        $kw93$DOCUMENTATION = SubLObjectFactory.makeKeyword("DOCUMENTATION");
        $sym94$DECLAIM = SubLObjectFactory.makeSymbol("DECLAIM");
        $sym95$VACCESS = SubLObjectFactory.makeSymbol("VACCESS");
        $sym96$DEFGLOBAL = SubLObjectFactory.makeSymbol("DEFGLOBAL");
        $sym97$REGISTER_GLOBAL_LOCK = SubLObjectFactory.makeSymbol("REGISTER-GLOBAL-LOCK");
        $sym98$_GLOBAL_LOCKS_ = SubLObjectFactory.makeSymbol("*GLOBAL-LOCKS*");
        $list99 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("GLOBAL"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"));
        $sym100$CAR = SubLObjectFactory.makeSymbol("CAR");
        $sym101$MAKE_LOCK = SubLObjectFactory.makeSymbol("MAKE-LOCK");
        $sym102$GLOBAL_LOCK_P = SubLObjectFactory.makeSymbol("GLOBAL-LOCK-P");
        $sym103$INITIALIZE_GLOBAL_LOCK_INTERNAL = SubLObjectFactory.makeSymbol("INITIALIZE-GLOBAL-LOCK-INTERNAL");
        $sym104$INITIALIZE_GLOBAL_LOCKS = SubLObjectFactory.makeSymbol("INITIALIZE-GLOBAL-LOCKS");
        $sym105$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym106$_FI_STATE_VARIABLES_ = SubLObjectFactory.makeSymbol("*FI-STATE-VARIABLES*");
        $list107 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZATION"), (SubLObject)SubLObjectFactory.makeSymbol("DOCUMENTATION"));
        $sym108$DEFPARAMETER_HTML = SubLObjectFactory.makeSymbol("DEFPARAMETER-HTML");
        $sym109$CPUSHNEW = SubLObjectFactory.makeSymbol("CPUSHNEW");
        $list110 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*FI-STATE-VARIABLES*"));
        $sym111$CPROGV = SubLObjectFactory.makeSymbol("CPROGV");
        $list112 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("*FI-STATE-VARIABLES*")), (SubLObject)utilities_macros.NIL);
        $sym113$_HTML_STATE_VARIABLES_ = SubLObjectFactory.makeSymbol("*HTML-STATE-VARIABLES*");
        $sym114$DEFPARAMETER = SubLObjectFactory.makeSymbol("DEFPARAMETER");
        $sym115$REGISTER_HTML_STATE_VARIABLE = SubLObjectFactory.makeSymbol("REGISTER-HTML-STATE-VARIABLE");
        $sym116$DEFVAR = SubLObjectFactory.makeSymbol("DEFVAR");
        $sym117$_HTML_INTERFACE_VARIABLES_ = SubLObjectFactory.makeSymbol("*HTML-INTERFACE-VARIABLES*");
        $sym118$REGISTER_HTML_INTERFACE_VARIABLE = SubLObjectFactory.makeSymbol("REGISTER-HTML-INTERFACE-VARIABLE");
        $list119 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("STATE-VARIABLES"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZATION"), (SubLObject)SubLObjectFactory.makeSymbol("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"));
        $sym120$NOTE_STATE_VARIABLE_DOCUMENTATION = SubLObjectFactory.makeSymbol("NOTE-STATE-VARIABLE-DOCUMENTATION");
        $sym121$DEF_STATE_VARIABLE = SubLObjectFactory.makeSymbol("DEF-STATE-VARIABLE");
        $kw122$VARIABLE_DOC = SubLObjectFactory.makeKeyword("VARIABLE-DOC");
        $kw123$VARIABLE = SubLObjectFactory.makeKeyword("VARIABLE");
        $kw124$PARAMETER = SubLObjectFactory.makeKeyword("PARAMETER");
        $kw125$GLOBAL = SubLObjectFactory.makeKeyword("GLOBAL");
        $kw126$LEXICAL = SubLObjectFactory.makeKeyword("LEXICAL");
        $sym127$DEFLEXICAL = SubLObjectFactory.makeSymbol("DEFLEXICAL");
        $kw128$CONSTANT = SubLObjectFactory.makeKeyword("CONSTANT");
        $sym129$DEFCONSTANT = SubLObjectFactory.makeSymbol("DEFCONSTANT");
        $kw130$PARAMETER_PRIVATE = SubLObjectFactory.makeKeyword("PARAMETER-PRIVATE");
        $sym131$DEFPARAMETER_PRIVATE = SubLObjectFactory.makeSymbol("DEFPARAMETER-PRIVATE");
        $kw132$PARAMETER_PUBLIC = SubLObjectFactory.makeKeyword("PARAMETER-PUBLIC");
        $sym133$DEFPARAMETER_PUBLIC = SubLObjectFactory.makeSymbol("DEFPARAMETER-PUBLIC");
        $kw134$PARAMETER_PROTECTECD = SubLObjectFactory.makeKeyword("PARAMETER-PROTECTECD");
        $str135$unknown_variable_type__s__ = SubLObjectFactory.makeString("unknown variable type ~s~%");
        $kw136$FUNCTION = SubLObjectFactory.makeKeyword("FUNCTION");
        $kw137$FUNCTION_DOC = SubLObjectFactory.makeKeyword("FUNCTION-DOC");
        $kw138$STRUCTURE = SubLObjectFactory.makeKeyword("STRUCTURE");
        $kw139$STRUCTURE_DOC = SubLObjectFactory.makeKeyword("STRUCTURE-DOC");
        $kw140$TYPE = SubLObjectFactory.makeKeyword("TYPE");
        $kw141$TYPE_DOC = SubLObjectFactory.makeKeyword("TYPE-DOC");
        $sym142$_GT_STATE_VARIABLES_ = SubLObjectFactory.makeSymbol("*GT-STATE-VARIABLES*");
        $list143 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZATION"), (SubLObject)SubLObjectFactory.makeSymbol("DOCUMENTATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("PARAMETER")));
        $sym144$_AT_STATE_VARIABLES_ = SubLObjectFactory.makeSymbol("*AT-STATE-VARIABLES*");
        $sym145$_DEFN_STATE_VARIABLES_ = SubLObjectFactory.makeSymbol("*DEFN-STATE-VARIABLES*");
        $list146 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZATION"), (SubLObject)SubLObjectFactory.makeSymbol("DOCUMENTATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("PARAMETER-PROTECTECD")));
        $sym147$_KBI_STATE_VARIABLES_ = SubLObjectFactory.makeSymbol("*KBI-STATE-VARIABLES*");
        $sym148$_KBP_STATE_VARIABLES_ = SubLObjectFactory.makeSymbol("*KBP-STATE-VARIABLES*");
        $list149 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*NODES-ACCESSOR-FN*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P"), (SubLObject)SubLObjectFactory.makeSymbol("*NODES-ACCESSOR-FN*")), (SubLObject)SubLObjectFactory.makeSymbol("*NODES-ACCESSOR-FN*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("ALL-ASSERTION-TERMS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PATH-LINK-OP*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P"), (SubLObject)SubLObjectFactory.makeSymbol("*PATH-LINK-OP*")), (SubLObject)SubLObjectFactory.makeSymbol("*PATH-LINK-OP*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("DEFAULT-LINK-OP")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PATH-NODE-OP*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P"), (SubLObject)SubLObjectFactory.makeSymbol("*PATH-NODE-OP*")), (SubLObject)SubLObjectFactory.makeSymbol("*PATH-NODE-OP*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("DEFAULT-NODE-OP")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*RELEVANT-LINK?*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P"), (SubLObject)SubLObjectFactory.makeSymbol("*RELEVANT-LINK?*")), (SubLObject)SubLObjectFactory.makeSymbol("*RELEVANT-LINK?*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("DEFAULT-RELEVANT-LINK?")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*RELEVANT-NODE?*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P"), (SubLObject)SubLObjectFactory.makeSymbol("*RELEVANT-NODE?*")), (SubLObject)SubLObjectFactory.makeSymbol("*RELEVANT-NODE?*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("DEFAULT-RELEVANT-NODE?")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*RELEVANT-LINK-TREE?*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P"), (SubLObject)SubLObjectFactory.makeSymbol("*RELEVANT-LINK-TREE?*")), (SubLObject)SubLObjectFactory.makeSymbol("*RELEVANT-LINK-TREE?*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("DEFAULT-RELEVANT-LINK-TREE?")))));
        $list150 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MACHINE"), (SubLObject)SubLObjectFactory.makeSymbol("PORT")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym151$CYC_API_REMOTE_EVAL = SubLObjectFactory.makeSymbol("CYC-API-REMOTE-EVAL");
        $list152 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENVIRONMENT")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym153$CHECK_TYPE = SubLObjectFactory.makeSymbol("CHECK-TYPE");
        $list154 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE-P"));
        $sym155$_FORWARD_INFERENCE_ENVIRONMENT_ = SubLObjectFactory.makeSymbol("*FORWARD-INFERENCE-ENVIRONMENT*");
        $sym156$ENVIRONMENT = SubLObjectFactory.makeUninternedSymbol("ENVIRONMENT");
        $list157 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-FORWARD-INFERENCE-ENVIRONMENT")));
        $sym158$WITH_FORWARD_INFERENCE_ENVIRONMENT = SubLObjectFactory.makeSymbol("WITH-FORWARD-INFERENCE-ENVIRONMENT");
        $sym159$ENVIRONMENT = SubLObjectFactory.makeUninternedSymbol("ENVIRONMENT");
        $list160 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-GET-FORWARD-INFERENCE-ENVIRONMENT")));
        $sym161$POSSIBLY_GET_FORWARD_INFERENCE_ENVIRONMENT = SubLObjectFactory.makeSymbol("POSSIBLY-GET-FORWARD-INFERENCE-ENVIRONMENT");
        $sym162$WITH_POSSIBLY_CLEAN_FORWARD_INFERENCE_ENVIRONMENT = SubLObjectFactory.makeSymbol("WITH-POSSIBLY-CLEAN-FORWARD-INFERENCE-ENVIRONMENT");
        $list163 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CURRENT-FORWARD-PROBLEM-STORE*"), (SubLObject)utilities_macros.NIL));
        $sym164$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $list165 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLEAR-CURRENT-FORWARD-PROBLEM-STORE")));
        $list166 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*WITHIN-ASSERTION-FORWARD-PROPAGATION?*"), (SubLObject)utilities_macros.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PREFER-FORWARD-SKOLEMIZATION*"), (SubLObject)utilities_macros.NIL));
        $sym167$WITH_NORMAL_FORWARD_INFERENCE_PARAMETERS = SubLObjectFactory.makeSymbol("WITH-NORMAL-FORWARD-INFERENCE-PARAMETERS");
        $sym168$WITH_CLEAN_FORWARD_INFERENCE_ENVIRONMENT = SubLObjectFactory.makeSymbol("WITH-CLEAN-FORWARD-INFERENCE-ENVIRONMENT");
        $sym169$WITH_CLEAN_FORWARD_PROBLEM_STORE_ENVIRONMENT = SubLObjectFactory.makeSymbol("WITH-CLEAN-FORWARD-PROBLEM-STORE-ENVIRONMENT");
        $sym170$ERROR = SubLObjectFactory.makeUninternedSymbol("ERROR");
        $sym171$CATCH_ERROR_MESSAGE = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE");
        $list172 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("THROW-UNEVALUATABLE")));
        $list173 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRACEE"), (SubLObject)SubLObjectFactory.makeSymbol("LEVEL")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym174$TRACING_AT_LEVEL = SubLObjectFactory.makeSymbol("TRACING-AT-LEVEL");
        $list175 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESOURCE?"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $kw176$SL2JAVA = SubLObjectFactory.makeKeyword("SL2JAVA");
        $sym177$_STRUCTURE_RESOURCING_MAKE_STATIC_ = SubLObjectFactory.makeSymbol("*STRUCTURE-RESOURCING-MAKE-STATIC*");
        $sym178$WITH_STATIC_AREA = SubLObjectFactory.makeSymbol("WITH-STATIC-AREA");
        $list179 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRUCTURE"), (SubLObject)SubLObjectFactory.makeSymbol("LINK-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("MARK-SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $str180$__A_FREE_LIST_ = SubLObjectFactory.makeString("*~A-FREE-LIST*");
        $str181$Free_list_for__A_objects = SubLObjectFactory.makeString("Free list for ~A objects");
        $str182$__A_FREE_LOCK_ = SubLObjectFactory.makeString("*~A-FREE-LOCK*");
        $str183$Lock_for__A_object_free_list = SubLObjectFactory.makeString("Lock for ~A object free list");
        $str184$_A_resource_lock = SubLObjectFactory.makeString("~A resource lock");
        $str185$MAKE_STATIC__A = SubLObjectFactory.makeString("MAKE-STATIC-~A");
        $str186$Make_a_new__A_in_the_static_area = SubLObjectFactory.makeString("Make a new ~A in the static area");
        $str187$INIT__A = SubLObjectFactory.makeString("INIT-~A");
        $str188$Initialize_a__A_for_use = SubLObjectFactory.makeString("Initialize a ~A for use");
        $str189$GET__A = SubLObjectFactory.makeString("GET-~A");
        $str190$Get_a__A_from_the_free_list__or_m = SubLObjectFactory.makeString("Get a ~A from the free list, or make a new one if needed");
        $str191$FREE__A_P = SubLObjectFactory.makeString("FREE-~A-P");
        $str192$Check_if_OBJECT_is_a__A_that_has_ = SubLObjectFactory.makeString("Check if OBJECT is a ~A that has been explicitly freed");
        $str193$FREE__A = SubLObjectFactory.makeString("FREE-~A");
        $str194$Place_a__A_onto_the_free_list = SubLObjectFactory.makeString("Place a ~A onto the free list");
        $str195$MAKE__A = SubLObjectFactory.makeString("MAKE-~A");
        $str196$_A_P = SubLObjectFactory.makeString("~A-P");
        $sym197$DEFLEXICAL_PRIVATE = SubLObjectFactory.makeSymbol("DEFLEXICAL-PRIVATE");
        $sym198$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $list199 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")));
        $sym200$CAND = SubLObjectFactory.makeSymbol("CAND");
        $list201 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FREE"));
        $sym202$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $sym203$CSETF = SubLObjectFactory.makeSymbol("CSETF");
        $sym204$_STRUCTURE_RESOURCING_ENABLED_ = SubLObjectFactory.makeSymbol("*STRUCTURE-RESOURCING-ENABLED*");
        $list205 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)utilities_macros.T));
        $list206 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)utilities_macros.NIL));
        $list207 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("FOUND"));
        $sym208$CDO = SubLObjectFactory.makeSymbol("CDO");
        $list209 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)SubLObjectFactory.makeSymbol("FOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"))));
        $list210 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("FOUND"), (SubLObject)utilities_macros.T));
        $sym211$FOUND = SubLObjectFactory.makeSymbol("FOUND");
        $list212 = ConsesLow.list((SubLObject)utilities_macros.NIL);
        $list213 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*READ-EVAL*"), (SubLObject)utilities_macros.NIL));
        $list214 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym215$STR = SubLObjectFactory.makeUninternedSymbol("STR");
        $list216 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PROGRESS-START-TIME*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-UNIVERSAL-TIME")));
        $list217 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PROGRESS-LAST-PACIFICATION-TIME*"), (SubLObject)SubLObjectFactory.makeSymbol("*PROGRESS-START-TIME*"));
        $list218 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PROGRESS-ELAPSED-SECONDS-FOR-NOTIFICATION*"), (SubLObject)SubLObjectFactory.makeSymbol("*SUPPRESS-ALL-PROGRESS-FASTER-THAN-SECONDS*"));
        $list219 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PROGRESS-NOTIFICATION-COUNT*"), (SubLObject)utilities_macros.ZERO_INTEGER);
        $list220 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PROGRESS-PACIFICATIONS-SINCE-LAST-NL*"), (SubLObject)utilities_macros.ZERO_INTEGER);
        $list221 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PROGRESS-COUNT*"), (SubLObject)utilities_macros.ZERO_INTEGER);
        $list222 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*IS-NOTING-PROGRESS?*"), (SubLObject)utilities_macros.T);
        $sym223$_SILENT_PROGRESS__ = SubLObjectFactory.makeSymbol("*SILENT-PROGRESS?*");
        $sym224$FIF = SubLObjectFactory.makeSymbol("FIF");
        $list225 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SILENT-PROGRESS?*"), (SubLObject)utilities_macros.T);
        $sym226$NOTING_PROGRESS_PREAMBLE = SubLObjectFactory.makeSymbol("NOTING-PROGRESS-PREAMBLE");
        $list227 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NOTING-PROGRESS-POSTAMBLE")));
        $list228 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DELAYED-MODE-SECONDS"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym229$_NOTING_PROGRESS_DELAYED_MODE_SECONDS_ = SubLObjectFactory.makeSymbol("*NOTING-PROGRESS-DELAYED-MODE-SECONDS*");
        $sym230$_NOTING_PROGRESS_DELAYED_MODE_STRING_ = SubLObjectFactory.makeSymbol("*NOTING-PROGRESS-DELAYED-MODE-STRING*");
        $sym231$NOTING_PROGRESS = SubLObjectFactory.makeSymbol("NOTING-PROGRESS");
        $str232$___A = SubLObjectFactory.makeString("~&~A");
        $list233 = ConsesLow.list((SubLObject)Characters.CHAR_period, (SubLObject)Characters.CHAR_space);
        $str234$___A____ = SubLObjectFactory.makeString("~&~A ...");
        $sym235$NOTING_PROGRESS_POSTAMBLE = SubLObjectFactory.makeSymbol("NOTING-PROGRESS-POSTAMBLE");
        $str236$__ = SubLObjectFactory.makeString(" (");
        $str237$_DONE__ = SubLObjectFactory.makeString(" DONE (");
        $int238$600 = SubLObjectFactory.makeInteger(600);
        $str239$__ended__A = SubLObjectFactory.makeString(", ended ~A");
        $str240$_ = SubLObjectFactory.makeString(")");
        $sym241$NOTE_PROGRESS = SubLObjectFactory.makeSymbol("NOTE-PROGRESS");
        $int242$50 = SubLObjectFactory.makeInteger(50);
        $int243$200 = SubLObjectFactory.makeInteger(200);
        $int244$30 = SubLObjectFactory.makeInteger(30);
        $int245$25 = SubLObjectFactory.makeInteger(25);
        $str246$__A_ = SubLObjectFactory.makeString("(~A)");
        $str247$_ = SubLObjectFactory.makeString(".");
        $sym248$IGNORE = SubLObjectFactory.makeSymbol("IGNORE");
        $list249 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*LAST-PERCENT-PROGRESS-INDEX*"), (SubLObject)utilities_macros.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*LAST-PERCENT-PROGRESS-PREDICTION*"), (SubLObject)utilities_macros.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*WITHIN-NOTING-PERCENT-PROGRESS*"), (SubLObject)utilities_macros.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PERCENT-PROGRESS-START-TIME*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-UNIVERSAL-TIME"))));
        $sym250$NOTING_PERCENT_PROGRESS_PREAMBLE = SubLObjectFactory.makeSymbol("NOTING-PERCENT-PROGRESS-PREAMBLE");
        $list251 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NOTING-PERCENT-PROGRESS-POSTAMBLE")));
        $sym252$_PERCENT_PROGRESS_DELAYED_MODE_SECONDS_ = SubLObjectFactory.makeSymbol("*PERCENT-PROGRESS-DELAYED-MODE-SECONDS*");
        $sym253$_PERCENT_PROGRESS_DELAYED_MODE_STRING_ = SubLObjectFactory.makeSymbol("*PERCENT-PROGRESS-DELAYED-MODE-STRING*");
        $sym254$NOTING_PERCENT_PROGRESS = SubLObjectFactory.makeSymbol("NOTING-PERCENT-PROGRESS");
        $sym255$NOTING_PERCENT_PROGRESS_POSTAMBLE = SubLObjectFactory.makeSymbol("NOTING-PERCENT-PROGRESS-POSTAMBLE");
        $str256$____ = SubLObjectFactory.makeString(" ...");
        $str257$__ = SubLObjectFactory.makeString(" ]");
        $sym258$NOTE_PERCENT_PROGRESS = SubLObjectFactory.makeSymbol("NOTE-PERCENT-PROGRESS");
        $str259$__ = SubLObjectFactory.makeString(" [");
        $str260$__ = SubLObjectFactory.makeString("  ");
        $str261$01_ = SubLObjectFactory.makeString("01%");
        $int262$300 = SubLObjectFactory.makeInteger(300);
        $str263$02_ = SubLObjectFactory.makeString("02%");
        $int264$1200 = SubLObjectFactory.makeInteger(1200);
        $int265$_2 = SubLObjectFactory.makeInteger(-2);
        $str266$_ = SubLObjectFactory.makeString(" ");
        $str267$_ = SubLObjectFactory.makeString("%");
        $str268$0 = SubLObjectFactory.makeString("0");
        $str269$_of_ = SubLObjectFactory.makeString(" of ");
        $str270$__ending__ = SubLObjectFactory.makeString(", ending ~");
        $int271$99 = SubLObjectFactory.makeInteger(99);
        $str272$ = SubLObjectFactory.makeString("");
        $str273$___A____D_of__D___02D___Done_at__ = SubLObjectFactory.makeString("~%~A : ~D of ~D (~02D%) Done at ~A");
        $str274$whenever = SubLObjectFactory.makeString("whenever");
        $list275 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TOTAL"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MESSAGE"), (SubLObject)SubLObjectFactory.makeString("cdotimes"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $str276$cdotimes = SubLObjectFactory.makeString("cdotimes");
        $sym277$_PROGRESS_NOTE_ = SubLObjectFactory.makeSymbol("*PROGRESS-NOTE*");
        $sym278$_PROGRESS_TOTAL_ = SubLObjectFactory.makeSymbol("*PROGRESS-TOTAL*");
        $list279 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PROGRESS-SOFAR*"), (SubLObject)utilities_macros.ZERO_INTEGER));
        $sym280$CDOTIMES = SubLObjectFactory.makeSymbol("CDOTIMES");
        $list281 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PROGRESS-TOTAL*"));
        $list282 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CINC"), (SubLObject)SubLObjectFactory.makeSymbol("*PROGRESS-SOFAR*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NOTE-PERCENT-PROGRESS"), (SubLObject)SubLObjectFactory.makeSymbol("*PROGRESS-SOFAR*"), (SubLObject)SubLObjectFactory.makeSymbol("*PROGRESS-TOTAL*")));
        $list283 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MESSAGE"), (SubLObject)SubLObjectFactory.makeString("cdolist")), (SubLObject)SubLObjectFactory.makeSymbol("ENDVAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $str284$cdolist = SubLObjectFactory.makeString("cdolist");
        $sym285$LIST_VAR = SubLObjectFactory.makeUninternedSymbol("LIST-VAR");
        $list286 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("cdolist"));
        $sym287$LENGTH = SubLObjectFactory.makeSymbol("LENGTH");
        $sym288$CSOME = SubLObjectFactory.makeSymbol("CSOME");
        $sym289$PROGRESS_CDOLIST = SubLObjectFactory.makeSymbol("PROGRESS-CDOLIST");
        $list290 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MESSAGE"), (SubLObject)SubLObjectFactory.makeString("cdolist"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym291$PROGRESS_CSOME = SubLObjectFactory.makeSymbol("PROGRESS-CSOME");
        $list292 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MESSAGE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym293$MESSAGE_VAR = SubLObjectFactory.makeUninternedSymbol("MESSAGE-VAR");
        $sym294$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $list295 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VAL"), (SubLObject)SubLObjectFactory.makeSymbol("TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MESSAGE"), (SubLObject)SubLObjectFactory.makeString("cdohash"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $str296$cdohash = SubLObjectFactory.makeString("cdohash");
        $sym297$TABLE_VAR = SubLObjectFactory.makeUninternedSymbol("TABLE-VAR");
        $sym298$HASH_TABLE_COUNT = SubLObjectFactory.makeSymbol("HASH-TABLE-COUNT");
        $sym299$CDOHASH = SubLObjectFactory.makeSymbol("CDOHASH");
        $list300 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEM"), (SubLObject)SubLObjectFactory.makeSymbol("SET"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MESSAGE"), (SubLObject)SubLObjectFactory.makeString("do-set"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $str301$do_set = SubLObjectFactory.makeString("do-set");
        $sym302$SET_VAR = SubLObjectFactory.makeUninternedSymbol("SET-VAR");
        $sym303$SET_SIZE = SubLObjectFactory.makeSymbol("SET-SIZE");
        $sym304$DO_SET = SubLObjectFactory.makeSymbol("DO-SET");
        $list305 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("MESSAGE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list306 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MESSAGE"));
        $kw307$MESSAGE = SubLObjectFactory.makeKeyword("MESSAGE");
        $sym308$MESSAGE_VAR = SubLObjectFactory.makeUninternedSymbol("MESSAGE-VAR");
        $sym309$START_TIME = SubLObjectFactory.makeUninternedSymbol("START-TIME");
        $sym310$NOTING_ELAPSED_TIME_PREAMBLE = SubLObjectFactory.makeSymbol("NOTING-ELAPSED-TIME-PREAMBLE");
        $sym311$NOTING_ELAPSED_TIME_POSTAMBLE = SubLObjectFactory.makeSymbol("NOTING-ELAPSED-TIME-POSTAMBLE");
        $sym312$NOTING_ELAPSED_TIME = SubLObjectFactory.makeSymbol("NOTING-ELAPSED-TIME");
        $str313$___A_started__at__A = SubLObjectFactory.makeString("~&~A started  at ~A");
        $str314$___A_finished_at__A_after_A = SubLObjectFactory.makeString("~&~A finished at ~A after~A");
        $sym315$WITH_SUBLISP_ERROR_HANDLING = SubLObjectFactory.makeSymbol("WITH-SUBLISP-ERROR-HANDLING");
        $list316 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PACKAGE*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND-PACKAGE"), (SubLObject)SubLObjectFactory.makeString("CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*READ-DEFAULT-FLOAT-FORMAT*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DOUBLE-FLOAT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PRINT-READABLY*"), (SubLObject)utilities_macros.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*READ-EVAL*"), (SubLObject)utilities_macros.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-PRIORITY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROCESS-PRIORITY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT-PROCESS")))));
        $list317 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-PROCESS-PRIORITY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT-PROCESS")), (SubLObject)SubLObjectFactory.makeSymbol("*PROCESS-NORMAL-PRIORITY*"));
        $list318 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-PROCESS-PRIORITY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT-PROCESS")), (SubLObject)SubLObjectFactory.makeSymbol("OLD-PRIORITY")));
        $list319 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PACKAGE*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND-PACKAGE"), (SubLObject)SubLObjectFactory.makeString("CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PRINT-READABLY*"), (SubLObject)utilities_macros.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*READ-EVAL*"), (SubLObject)utilities_macros.NIL));
        $sym320$WITH_CYC_SERVER_HANDLING = SubLObjectFactory.makeSymbol("WITH-CYC-SERVER-HANDLING");
        $sym321$WITH_CYC_IO_SYNTAX = SubLObjectFactory.makeSymbol("WITH-CYC-IO-SYNTAX");
        $list322 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*READ-DEFAULT-FLOAT-FORMAT*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DOUBLE-FLOAT"))));
        $list323 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCLIST")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym324$OLD_CYCLIST = SubLObjectFactory.makeUninternedSymbol("OLD-CYCLIST");
        $list325 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("THE-CYCLIST")));
        $sym326$SET_THE_CYCLIST = SubLObjectFactory.makeSymbol("SET-THE-CYCLIST");
        $list327 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*THE-CYCLIST*"), (SubLObject)utilities_macros.NIL));
        $list328 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EL-VARIABLES"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym329$BINDING = SubLObjectFactory.makeUninternedSymbol("BINDING");
        $sym330$SUBLIS = SubLObjectFactory.makeSymbol("SUBLIS");
        $str331$_S___var__S_is_not_a_symbol_ = SubLObjectFactory.makeString("~S - var ~S is not a symbol.");
        $str332$_S___function__S_is_not_a_symbol_ = SubLObjectFactory.makeString("~S - function ~S is not a symbol.");
        $str333$_S___search_type__S_is_not_one_of = SubLObjectFactory.makeString("~S - search type ~S is not one of (:depth-first :breadth-first).");
        $list334 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"));
        $sym335$NULL = SubLObjectFactory.makeSymbol("NULL");
        $sym336$CDR = SubLObjectFactory.makeSymbol("CDR");
        $sym337$CONSP = SubLObjectFactory.makeSymbol("CONSP");
        $list338 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("LIST-EXPRESSION")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym339$CDOSUBLISTS = SubLObjectFactory.makeSymbol("CDOSUBLISTS");
        $list340 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLIST-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("LIST-EXPRESSION")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym341$CDOLIST_AND_SUBLISTS = SubLObjectFactory.makeSymbol("CDOLIST-AND-SUBLISTS");
        $str342$next_cons_var = SubLObjectFactory.makeString("next-cons-var");
        $list343 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("LIST-EXPRESSION")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $str344$sublist = SubLObjectFactory.makeString("sublist");
        $sym345$WHILE = SubLObjectFactory.makeSymbol("WHILE");
        $list346 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("LIST-EXPRESSION")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym347$CDOLIST_IF = SubLObjectFactory.makeSymbol("CDOLIST-IF");
        $sym348$CDOSUBLISTS_IF = SubLObjectFactory.makeSymbol("CDOSUBLISTS-IF");
        $sym349$CDOLIST_IF_NOT = SubLObjectFactory.makeSymbol("CDOLIST-IF-NOT");
        $sym350$CDOSUBLISTS_IF_NOT = SubLObjectFactory.makeSymbol("CDOSUBLISTS-IF-NOT");
        $list351 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR1"), (SubLObject)SubLObjectFactory.makeSymbol("LIST1"), (SubLObject)SubLObjectFactory.makeSymbol("VAR2"), (SubLObject)SubLObjectFactory.makeSymbol("LIST2")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $str352$sublist1 = SubLObjectFactory.makeString("sublist1");
        $str353$sublist2 = SubLObjectFactory.makeString("sublist2");
        $list354 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEARCH-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("DEPTH-FIRST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VISIT-NILS"), (SubLObject)utilities_macros.NIL)), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $kw355$DEPTH_FIRST = SubLObjectFactory.makeKeyword("DEPTH-FIRST");
        $sym356$CDOTREE = SubLObjectFactory.makeSymbol("CDOTREE");
        $kw357$BREADTH_FIRST = SubLObjectFactory.makeKeyword("BREADTH-FIRST");
        $str358$tree_var = SubLObjectFactory.makeString("tree-var");
        $str359$cells_var = SubLObjectFactory.makeString("cells-var");
        $str360$tail_of_cells = SubLObjectFactory.makeString("tail-of-cells");
        $sym361$LIST = SubLObjectFactory.makeSymbol("LIST");
        $sym362$LAST = SubLObjectFactory.makeSymbol("LAST");
        $sym363$RPLACD = SubLObjectFactory.makeSymbol("RPLACD");
        $sym364$CPUSH = SubLObjectFactory.makeSymbol("CPUSH");
        $list365 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEARCH-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("DEPTH-FIRST"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym366$CDOTREE_CONSES = SubLObjectFactory.makeSymbol("CDOTREE-CONSES");
        $str367$tail_of_cells_var = SubLObjectFactory.makeString("tail-of-cells-var");
        $list368 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARAMETER"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("PLIST")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym369$DO_PLIST = SubLObjectFactory.makeSymbol("DO-PLIST");
        $sym370$CAAR = SubLObjectFactory.makeSymbol("CAAR");
        $sym371$CDAR = SubLObjectFactory.makeSymbol("CDAR");
        $sym372$CADR = SubLObjectFactory.makeSymbol("CADR");
        $sym373$CDDR = SubLObjectFactory.makeSymbol("CDDR");
        $list374 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PATTERN"), (SubLObject)SubLObjectFactory.makeSymbol("DATUM"));
        $str375$datum_evaluated_var = SubLObjectFactory.makeString("datum-evaluated-var");
        $sym376$NCONC = SubLObjectFactory.makeSymbol("NCONC");
        $str377$FAST_FUNCALL_NO_VALUE__contains_e = SubLObjectFactory.makeString("FAST-FUNCALL-NO-VALUE: contains erroneous function name it its function name list.");
        $str378$FAST_FUNCALL_NO_VALUE__cannot_acc = SubLObjectFactory.makeString("FAST-FUNCALL-NO-VALUE: cannot accept dotted list for its function name list.");
        $str379$FAST_FUNCALL_NO_VALUE__function_n = SubLObjectFactory.makeString("FAST-FUNCALL-NO-VALUE: function name list must be a list.");
        $list380 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION-NAME-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"));
        $sym381$FUNCALL = SubLObjectFactory.makeSymbol("FUNCALL");
        $str382$function_form_evaluated_var = SubLObjectFactory.makeString("function-form-evaluated-var");
        $sym383$PCASE = SubLObjectFactory.makeSymbol("PCASE");
        $sym384$OTHERWISE = SubLObjectFactory.makeSymbol("OTHERWISE");
        $list385 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR-TO-SET"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION-NAME-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"));
        $list386 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARS-TO-BIND"), (SubLObject)ConsesLow.listS((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION-NAME-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym387$CMULTIPLE_VALUE_BIND = SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND");
        $list388 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARS-TO-SET"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION-NAME-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"));
        $sym389$CMULTIPLE_VALUE_SETQ = SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-SETQ");
        $list390 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"));
        $list391 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATION-STRUCTURE"), (SubLObject)SubLObjectFactory.makeSymbol("OPERAND"));
        $list392 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-SET-SYMBOL"), (SubLObject)SubLObjectFactory.makeSymbol("INLINE-GET-SYMBOL"), (SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"));
        $str393$_A_S = SubLObjectFactory.makeString("~A~S");
        $list394 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("LIST-EXPRESSION"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("ITERATED-EXPRESSION"));
        $str395$LIST_EXPRESSION = SubLObjectFactory.makeString("LIST-EXPRESSION");
        $str396$TAIL_CONS = SubLObjectFactory.makeString("TAIL-CONS");
        $str397$RESULT = SubLObjectFactory.makeString("RESULT");
        $sym398$PCOND = SubLObjectFactory.makeSymbol("PCOND");
        $sym399$ATOM = SubLObjectFactory.makeSymbol("ATOM");
        $kw400$API = SubLObjectFactory.makeKeyword("API");
        $sym401$DEFINE_API = SubLObjectFactory.makeSymbol("DEFINE-API");
        $kw402$PUBLIC = SubLObjectFactory.makeKeyword("PUBLIC");
        $kw403$PROTECTED = SubLObjectFactory.makeKeyword("PROTECTED");
        $sym404$DEFINE_PROTECTED = SubLObjectFactory.makeSymbol("DEFINE-PROTECTED");
        $kw405$PRIVATE = SubLObjectFactory.makeKeyword("PRIVATE");
        $kw406$ALL = SubLObjectFactory.makeKeyword("ALL");
        $list407 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTP"), (SubLObject)SubLObjectFactory.makeSymbol("LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)utilities_macros.NIL));
        $kw408$NOT_EMPTY_ALL = SubLObjectFactory.makeKeyword("NOT-EMPTY-ALL");
        $list409 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSP"), (SubLObject)SubLObjectFactory.makeSymbol("LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)utilities_macros.NIL));
        $kw410$ANY = SubLObjectFactory.makeKeyword("ANY");
        $str411$DEFINE_LIST_ELEMENT_PREDICATOR___ = SubLObjectFactory.makeString("DEFINE-LIST-ELEMENT-PREDICATOR: ~S is not a valid type value.");
        $list412 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION"));
        $sym413$_OPTIONAL = SubLObjectFactory.makeSymbol("&OPTIONAL");
        $sym414$CAR_IF_LIST = SubLObjectFactory.makeSymbol("CAR-IF-LIST");
        $str415$FCOND___S_is_not_a_valid_clause_l = SubLObjectFactory.makeString("FCOND: ~S is not a valid clause list.");
        $str416$FCOND___S_is_not_a_valid_clause_ = SubLObjectFactory.makeString("FCOND: ~S is not a valid clause.");
        $str417$P_RANGE_CASE__Ill_formed_clauses_ = SubLObjectFactory.makeString("P-RANGE-CASE: Ill-formed clauses encountered -> ~S.");
        $str418$P_RANGE_CASE___S_is_not_a_valid_c = SubLObjectFactory.makeString("P-RANGE-CASE: ~S is not a valid clause.");
        $str419$value = SubLObjectFactory.makeString("value");
        $sym420$__ = SubLObjectFactory.makeSymbol(">=");
        $sym421$__ = SubLObjectFactory.makeSymbol("<=");
        $sym422$_ = SubLObjectFactory.makeSymbol("=");
        $list423 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("CLAUSES"));
        $sym424$ERROR = SubLObjectFactory.makeSymbol("ERROR");
        $str425$Invalid_version_code__A_ = SubLObjectFactory.makeString("Invalid version code ~A.");
        $list426 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VERSION")), (SubLObject)SubLObjectFactory.makeSymbol("VERSION-BODIES"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR-CLAUSE"));
        $list427 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ERROR-CLAUSE"));
        $kw428$ERROR_CLAUSE = SubLObjectFactory.makeKeyword("ERROR-CLAUSE");
        $list429 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VERSION"), (SubLObject)SubLObjectFactory.makeSymbol("FORM"));
        $list430 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAJOR"), (SubLObject)SubLObjectFactory.makeSymbol("MINOR")), (SubLObject)SubLObjectFactory.makeSymbol("VERSION-BODIES"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR-CLAUSE"));
        $list431 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAJOR-VERSION"), (SubLObject)SubLObjectFactory.makeSymbol("MINOR-VERSION"), (SubLObject)SubLObjectFactory.makeSymbol("FORM"));
        $sym432$SUB_KB_LOADED_P_SYMBOL = SubLObjectFactory.makeSymbol("SUB-KB-LOADED-P-SYMBOL");
        $sym433$DECLARE_KB_FEATURE = SubLObjectFactory.makeSymbol("DECLARE-KB-FEATURE");
        $str434$_P = SubLObjectFactory.makeString("-P");
        $sym435$SUB_KB_SET_SYMBOL = SubLObjectFactory.makeSymbol("SUB-KB-SET-SYMBOL");
        $str436$SET_ = SubLObjectFactory.makeString("SET-");
        $sym437$SUB_KB_UNSET_SYMBOL = SubLObjectFactory.makeSymbol("SUB-KB-UNSET-SYMBOL");
        $str438$UNSET_ = SubLObjectFactory.makeString("UNSET-");
        $list439 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUB-KB-SYMBOL"), (SubLObject)SubLObjectFactory.makeSymbol("LOADED-DOC-STRING"));
        $sym440$DEFGLOBAL_PRIVATE = SubLObjectFactory.makeSymbol("DEFGLOBAL-PRIVATE");
        $list441 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*KB-FEATURES*"));
        $list442 = ConsesLow.list((SubLObject)utilities_macros.T);
        $kw443$A = SubLObjectFactory.makeKeyword("A");
        $kw444$S = SubLObjectFactory.makeKeyword("S");
        $kw445$D = SubLObjectFactory.makeKeyword("D");
        $sym446$TO_STRING = SubLObjectFactory.makeSymbol("TO-STRING");
        $sym447$CCONCATENATE = SubLObjectFactory.makeSymbol("CCONCATENATE");
        $list448 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("A"), (SubLObject)SubLObjectFactory.makeKeyword("S"), (SubLObject)SubLObjectFactory.makeKeyword("D"));
        $str449$FORMAT_TO_STRING___S_is_an_invali = SubLObjectFactory.makeString("FORMAT-TO-STRING: ~S is an invalid format arg.  ~\n           Format args must be a member of the set {:A, :S, :D}.");
        $str450$FORMAT_TO_STRING__Odd_number_of_a = SubLObjectFactory.makeString("FORMAT-TO-STRING: Odd number of args encountered: ~S");
        $sym451$TIME = SubLObjectFactory.makeUninternedSymbol("TIME");
        $sym452$CTIME = SubLObjectFactory.makeSymbol("CTIME");
        $sym453$FORMAT = SubLObjectFactory.makeSymbol("FORMAT");
        $str454$_____real_time__A_seconds__ = SubLObjectFactory.makeString("~&;; real time ~A seconds~%");
        $list455 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym456$TIMING_INFO = SubLObjectFactory.makeUninternedSymbol("TIMING-INFO");
        $sym457$CLOCK_TIME = SubLObjectFactory.makeUninternedSymbol("CLOCK-TIME");
        $sym458$WITH_PROCESS_RESOURCE_TRACKING = SubLObjectFactory.makeSymbol("WITH-PROCESS-RESOURCE-TRACKING");
        $sym459$CONVERT_PROCESS_RESOURCE_TRACKING_TIMING_INFO_TO_SECONDS = SubLObjectFactory.makeSymbol("CONVERT-PROCESS-RESOURCE-TRACKING-TIMING-INFO-TO-SECONDS");
        $sym460$NADD_CLOCK_TIME_TO_PROCESS_RESOURCE_TIMING_INFO = SubLObjectFactory.makeSymbol("NADD-CLOCK-TIME-TO-PROCESS-RESOURCE-TIMING-INFO");
        $list461 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("USER-TIME"), (SubLObject)SubLObjectFactory.makeKeyword("SYSTEM-TIME"));
        $sym462$WITH_PROCESS_RESOURCE_TRACKING_IN_SECONDS = SubLObjectFactory.makeSymbol("WITH-PROCESS-RESOURCE-TRACKING-IN-SECONDS");
        $int463$10000000 = SubLObjectFactory.makeInteger(10000000);
        $kw464$WALL_CLOCK_TIME = SubLObjectFactory.makeKeyword("WALL-CLOCK-TIME");
        $kw465$USER_TIME = SubLObjectFactory.makeKeyword("USER-TIME");
        $kw466$SYSTEM_TIME = SubLObjectFactory.makeKeyword("SYSTEM-TIME");
        $sym467$TIMING_INFO = SubLObjectFactory.makeUninternedSymbol("TIMING-INFO");
        $str468$______s__ = SubLObjectFactory.makeString("~&;; ~s~%");
        $sym469$TIMING_INFO = SubLObjectFactory.makeUninternedSymbol("TIMING-INFO");
        $sym470$PROCESS_RESOURCE_TRACKING_USER_TIME = SubLObjectFactory.makeSymbol("PROCESS-RESOURCE-TRACKING-USER-TIME");
        $sym471$TIMING_INFO = SubLObjectFactory.makeUninternedSymbol("TIMING-INFO");
        $sym472$TIMING_INFO = SubLObjectFactory.makeUninternedSymbol("TIMING-INFO");
        $sym473$PROCESS_RESOURCE_TRACKING_SYSTEM_TIME = SubLObjectFactory.makeSymbol("PROCESS-RESOURCE-TRACKING-SYSTEM-TIME");
        $sym474$TIMING_INFO = SubLObjectFactory.makeUninternedSymbol("TIMING-INFO");
        $list475 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"));
        $list476 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"));
        $sym477$ELEM = SubLObjectFactory.makeUninternedSymbol("ELEM");
        $sym478$LIST_VAR = SubLObjectFactory.makeUninternedSymbol("LIST-VAR");
        $list479 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NON-DOTTED-LIST-P"));
        $sym480$CHECK_LIST_TYPE = SubLObjectFactory.makeSymbol("CHECK-LIST-TYPE");
        $sym481$ELEM = SubLObjectFactory.makeUninternedSymbol("ELEM");
        $sym482$LIST_VAR = SubLObjectFactory.makeUninternedSymbol("LIST-VAR");
        $list483 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLIST"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"));
        $sym484$PROPERTY = SubLObjectFactory.makeUninternedSymbol("PROPERTY");
        $sym485$VALUE = SubLObjectFactory.makeUninternedSymbol("VALUE");
        $sym486$PLIST_VAR = SubLObjectFactory.makeUninternedSymbol("PLIST-VAR");
        $list487 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROPERTY-LIST-P"));
        $sym488$PROPERTY = SubLObjectFactory.makeUninternedSymbol("PROPERTY");
        $sym489$VALUE = SubLObjectFactory.makeUninternedSymbol("VALUE");
        $sym490$PLIST_VAR = SubLObjectFactory.makeUninternedSymbol("PLIST-VAR");
        $sym491$PROPERTY = SubLObjectFactory.makeUninternedSymbol("PROPERTY");
        $sym492$VALUE = SubLObjectFactory.makeUninternedSymbol("VALUE");
        $sym493$PLIST_VAR = SubLObjectFactory.makeUninternedSymbol("PLIST-VAR");
        $sym494$WARN_UNLESS = SubLObjectFactory.makeSymbol("WARN-UNLESS");
        $str495$_s_is_not_a_known__a = SubLObjectFactory.makeString("~s is not a known ~a");
        $list496 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("FORM"), (SubLObject)SubLObjectFactory.makeSymbol("FORMAT-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("FORMAT-ARGUMENTS"));
        $sym497$MUST = SubLObjectFactory.makeSymbol("MUST");
        $list498 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION-SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"));
        $sym499$COR = SubLObjectFactory.makeSymbol("COR");
        $list500 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLACE1"), (SubLObject)SubLObjectFactory.makeSymbol("PLACE2"));
        $sym501$SWAP_VAR = SubLObjectFactory.makeUninternedSymbol("SWAP-VAR");
        $list502 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeSymbol("DEFINER"), (SubLObject)SubLObjectFactory.makeSymbol("ACCESS")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list503 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeKeyword("DEFINER"), (SubLObject)SubLObjectFactory.makeKeyword("ACCESS"));
        $kw504$DEFINER = SubLObjectFactory.makeKeyword("DEFINER");
        $kw505$ACCESS = SubLObjectFactory.makeKeyword("ACCESS");
        $str506$_A_INITIALIZER = SubLObjectFactory.makeString("~A-INITIALIZER");
        $sym507$PROCLAIM = SubLObjectFactory.makeSymbol("PROCLAIM");
        $kw508$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $sym509$REGISTER_KB_VARIABLE_INITIALIZATION = SubLObjectFactory.makeSymbol("REGISTER-KB-VARIABLE-INITIALIZATION");
        $sym510$_KB_VAR_INITIALIZATIONS_ = SubLObjectFactory.makeSymbol("*KB-VAR-INITIALIZATIONS*");
        $sym511$DEF_KB_VARIABLE = SubLObjectFactory.makeSymbol("DEF-KB-VARIABLE");
        $str512$Initializing_KB_variables = SubLObjectFactory.makeString("Initializing KB variables");
        $list513 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("VAR-SYMBOL"), (SubLObject)SubLObjectFactory.makeSymbol("FUNC"));
        $list514 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETTER"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZATION-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VACCESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PRIVATE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FACCESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PRIVATE"))), (SubLObject)SubLObjectFactory.makeSymbol("DOCUMENTATION"));
        $list515 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VAR"), (SubLObject)SubLObjectFactory.makeKeyword("VACCESS"), (SubLObject)SubLObjectFactory.makeKeyword("FACCESS"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"));
        $kw516$VAR = SubLObjectFactory.makeKeyword("VAR");
        $sym517$PRIVATE = SubLObjectFactory.makeSymbol("PRIVATE");
        $kw518$FACCESS = SubLObjectFactory.makeKeyword("FACCESS");
        $str519$_ = SubLObjectFactory.makeString("*");
        $str520$Invalid_function_name__A___The_fi = SubLObjectFactory.makeString("Invalid function-name ~A.  The first arg of DEFPARAMETER-LAZY is the getter function, not the variable name.");
        $sym521$INIT_VALUE = SubLObjectFactory.makeUninternedSymbol("INIT-VALUE");
        $sym522$FACCESS = SubLObjectFactory.makeSymbol("FACCESS");
        $list523 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("UNINITIALIZED"));
        $str524$Unable_to_initialize__A__ = SubLObjectFactory.makeString("Unable to initialize ~A~%");
        $str525$Invalid_function_name__A___The_fi = SubLObjectFactory.makeString("Invalid function-name ~A.  The first arg of DEFVAR-LAZY is the getter function, not the variable name.");
        $sym526$INIT_VALUE = SubLObjectFactory.makeUninternedSymbol("INIT-VALUE");
        $str527$Invalid_function_name__A___The_fi = SubLObjectFactory.makeString("Invalid function-name ~A.  The first arg of DEFGLOBAL-LAZY is the getter function, not the variable name.");
        $sym528$INIT_VALUE = SubLObjectFactory.makeUninternedSymbol("INIT-VALUE");
        $str529$Invalid_function_name__A___The_fi = SubLObjectFactory.makeString("Invalid function-name ~A.  The first arg of DEFLEXICAL-LAZY is the getter function, not the variable name.");
        $sym530$INIT_VALUE = SubLObjectFactory.makeUninternedSymbol("INIT-VALUE");
        $list531 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("ARGLIST"), (SubLObject)SubLObjectFactory.makeSymbol("DOCUMENTATION-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("DECLARATIONS"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym532$REGISTER_OBSOLETE_CYC_API_FUNCTION = SubLObjectFactory.makeSymbol("REGISTER-OBSOLETE-CYC-API-FUNCTION");
        $kw533$OBSOLETE_CYC_API_REPLACEMENTS = SubLObjectFactory.makeKeyword("OBSOLETE-CYC-API-REPLACEMENTS");
        $int534$40 = SubLObjectFactory.makeInteger(40);
        $sym535$INITIALIZATION_FOR_PARTIAL_LIST_RESULTS = SubLObjectFactory.makeSymbol("INITIALIZATION-FOR-PARTIAL-LIST-RESULTS");
        $sym536$ACCUMULATION_FOR_PARTIAL_LIST_RESULTS = SubLObjectFactory.makeSymbol("ACCUMULATION-FOR-PARTIAL-LIST-RESULTS");
        $sym537$CONSOLIDATION_FOR_PARTIAL_LIST_RESULTS = SubLObjectFactory.makeSymbol("CONSOLIDATION-FOR-PARTIAL-LIST-RESULTS");
        $sym538$NOTIFICATION_FOR_PARTIAL_LIST_RESULTS = SubLObjectFactory.makeSymbol("NOTIFICATION-FOR-PARTIAL-LIST-RESULTS");
        $sym539$FINAL_RESULTS_FOR_PARTIAL_LIST_RESULTS = SubLObjectFactory.makeSymbol("FINAL-RESULTS-FOR-PARTIAL-LIST-RESULTS");
        $list540 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FINAL-RESULT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("THRESHOLD")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list541 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PARTIAL-RESULTS-ACCUMULATOR*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("*PARTIAL-RESULTS-INITIALIZATION-FN*")));
        $list542 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PARTIAL-RESULTS-TOTAL-ACCUMULATOR*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("*PARTIAL-RESULTS-INITIALIZATION-FN*")));
        $sym543$_PARTIAL_RESULTS_THRESHOLD_ = SubLObjectFactory.makeSymbol("*PARTIAL-RESULTS-THRESHOLD*");
        $list544 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PARTIAL-RESULTS-SIZE*"), (SubLObject)utilities_macros.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PARTIAL-RESULTS-TOTAL-SIZE*"), (SubLObject)utilities_macros.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*ACCUMULATING-PARTIAL-RESULTS?*"), (SubLObject)utilities_macros.T));
        $list545 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("*PARTIAL-RESULTS-CONSOLIDATION-FN*"), (SubLObject)SubLObjectFactory.makeSymbol("*PARTIAL-RESULTS-ACCUMULATOR*"));
        $list546 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("*PARTIAL-RESULTS-FINAL-RESULT-FN*"), (SubLObject)SubLObjectFactory.makeSymbol("*PARTIAL-RESULTS-TOTAL-ACCUMULATOR*")));
        $sym547$WITH_SPACE_PROFILING_TO_STRING = SubLObjectFactory.makeSymbol("WITH-SPACE-PROFILING-TO-STRING");
        $list548 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym549$STREAM = SubLObjectFactory.makeUninternedSymbol("STREAM");
        $sym550$CWITH_OUTPUT_TO_STRING = SubLObjectFactory.makeSymbol("CWITH-OUTPUT-TO-STRING");
        $sym551$WITH_SPACE_PROFILING = SubLObjectFactory.makeSymbol("WITH-SPACE-PROFILING");
        $kw552$STREAM = SubLObjectFactory.makeKeyword("STREAM");
        $list553 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIAL-VALUE"), (SubLObject)utilities_macros.ZERO_INTEGER)), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list554 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INITIAL-VALUE"));
        $kw555$INITIAL_VALUE = SubLObjectFactory.makeKeyword("INITIAL-VALUE");
        $list556 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SXHASH-COMPOSITE-STATE*"), (SubLObject)utilities_macros.FOUR_INTEGER);
        $sym557$_SXHASH_COMPOSITE_HASH_ = SubLObjectFactory.makeSymbol("*SXHASH-COMPOSITE-HASH*");
        $list558 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SXHASH-COMPOSITE-HASH*"));
        $list559 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPOSITE-STATE"), (SubLObject)utilities_macros.FOUR_INTEGER);
        $sym560$COMPOSITE_HASH = SubLObjectFactory.makeSymbol("COMPOSITE-HASH");
        $list561 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPOSITE-HASH"));
        $list562 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $list563 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("COMPOSITE-STATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SXHASH-UPDATE-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("COMPOSITE-STATE")));
        $sym564$LOGXOR = SubLObjectFactory.makeSymbol("LOGXOR");
        $sym565$SXHASH_ROT = SubLObjectFactory.makeSymbol("SXHASH-ROT");
        $sym566$SXHASH = SubLObjectFactory.makeSymbol("SXHASH");
        $list567 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPOSITE-STATE"));
        $int568$27 = SubLObjectFactory.makeInteger(27);
        $ic569 = Vectors.vector(new SubLObject[] { utilities_macros.SEVEN_INTEGER, utilities_macros.EIGHT_INTEGER, utilities_macros.NINE_INTEGER, utilities_macros.TEN_INTEGER, utilities_macros.ELEVEN_INTEGER, utilities_macros.TWELVE_INTEGER, utilities_macros.THIRTEEN_INTEGER, utilities_macros.FOURTEEN_INTEGER, utilities_macros.FIFTEEN_INTEGER, utilities_macros.SIXTEEN_INTEGER, utilities_macros.SEVENTEEN_INTEGER, utilities_macros.EIGHTEEN_INTEGER, utilities_macros.NINETEEN_INTEGER, utilities_macros.TWENTY_INTEGER, SubLObjectFactory.makeInteger(21), SubLObjectFactory.makeInteger(22), SubLObjectFactory.makeInteger(23), SubLObjectFactory.makeInteger(24), SubLObjectFactory.makeInteger(25), SubLObjectFactory.makeInteger(26), SubLObjectFactory.makeInteger(27), SubLObjectFactory.makeInteger(28), SubLObjectFactory.makeInteger(29), SubLObjectFactory.makeInteger(30), SubLObjectFactory.makeInteger(31), utilities_macros.ZERO_INTEGER, utilities_macros.ONE_INTEGER, utilities_macros.TWO_INTEGER, utilities_macros.THREE_INTEGER, utilities_macros.FOUR_INTEGER, utilities_macros.FIVE_INTEGER, utilities_macros.SIX_INTEGER });
        $sym570$SXHASH_COMPOSITE_UPDATE = SubLObjectFactory.makeSymbol("SXHASH-COMPOSITE-UPDATE");
        $sym571$COMPUTE_SXHASH_COMPOSITE = SubLObjectFactory.makeSymbol("COMPUTE-SXHASH-COMPOSITE");
        $int572$1000000 = SubLObjectFactory.makeInteger(1000000);
        $int573$167 = SubLObjectFactory.makeInteger(167);
        $list574 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("CATCH?")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list575 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TAG"), (SubLObject)SubLObjectFactory.makeSymbol("ANS-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("CATCH?")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym576$CCATCH = SubLObjectFactory.makeSymbol("CCATCH");
        $list577 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRE-N"), (SubLObject)SubLObjectFactory.makeSymbol("N")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym578$TIMINGS = SubLObjectFactory.makeUninternedSymbol("TIMINGS");
        $sym579$TIME = SubLObjectFactory.makeUninternedSymbol("TIME");
        $sym580$I = SubLObjectFactory.makeUninternedSymbol("I");
        $list581 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BENCHMARK-GC"));
        $sym582$_ = SubLObjectFactory.makeSymbol("+");
        $list583 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BENCHMARK-GC")));
        $sym584$PERFORM_STANDARD_STATISTICAL_ANALYSIS = SubLObjectFactory.makeSymbol("PERFORM-STANDARD-STATISTICAL-ANALYSIS");
        $sym585$BENCHMARK_GC = SubLObjectFactory.makeSymbol("BENCHMARK-GC");
        $sym586$RUN_BENCHMARK_COMPENSATING_FOR_PAGING = SubLObjectFactory.makeSymbol("RUN-BENCHMARK-COMPENSATING-FOR-PAGING");
        $list587 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PRINT-PRETTY*"), (SubLObject)utilities_macros.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PRINT-LENGTH*"), (SubLObject)utilities_macros.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PRINT-LEVEL*"), (SubLObject)utilities_macros.NIL));
        $list588 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TIMEOUT"), (SubLObject)SubLObjectFactory.makeSymbol("TIMED-OUT?")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym589$WITH_TIMEOUT = SubLObjectFactory.makeSymbol("WITH-TIMEOUT");
        $list590 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RETRIES"), (SubLObject)SubLObjectFactory.makeSymbol("SECONDS-BETWEEN")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym591$ERROR_MSG = SubLObjectFactory.makeUninternedSymbol("ERROR-MSG");
        $sym592$SUCCESS = SubLObjectFactory.makeUninternedSymbol("SUCCESS");
        $sym593$N = SubLObjectFactory.makeUninternedSymbol("N");
        $sym594$SLEEP = SubLObjectFactory.makeSymbol("SLEEP");
    }
}

/*

	Total time: 2202 ms
	 synthetic 
*/