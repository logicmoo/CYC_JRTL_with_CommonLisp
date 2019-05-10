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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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

public final class utilities_macros
    extends
      SubLTranslatedFile
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
  static boolean assertionsDisabledSynth = true;

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 944L)
  public static SubLObject define_api(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    SubLObject arglist = NIL;
    SubLObject documentation_string = NIL;
    SubLObject type_declarations = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    arglist = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    documentation_string = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    type_declarations = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    assert NIL != Types.stringp( documentation_string ) : documentation_string;
    assert NIL != Types.listp( type_declarations ) : type_declarations;
    thread.resetMultipleValues();
    final SubLObject argument_types = parse_api_type_declarations( type_declarations );
    final SubLObject body_preamble = thread.secondMultipleValue();
    final SubLObject return_types = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    return ConsesLow.list( $sym3$PROGN, ConsesLow.listS( $sym4$DEFINE_PUBLIC, name, arglist, documentation_string, ConsesLow.append( body_preamble, body, NIL ) ), ConsesLow.list( $sym5$REGISTER_CYC_API_FUNCTION,
        ConsesLow.list( $sym6$QUOTE, name ), ConsesLow.list( $sym6$QUOTE, arglist ), documentation_string, ConsesLow.list( $sym6$QUOTE, argument_types ), ConsesLow.list( $sym6$QUOTE, return_types ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 2323L)
  public static SubLObject declare_api_function(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    SubLObject arglist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    arglist = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    SubLObject current_$2;
    final SubLObject datum_$1 = current_$2 = body;
    SubLObject documentation_string = NIL;
    SubLObject type_declarations = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current_$2, datum_$1, $list8 );
    documentation_string = current_$2.first();
    current_$2 = current_$2.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current_$2, datum_$1, $list8 );
    type_declarations = current_$2.first();
    current_$2 = current_$2.rest();
    if( NIL != current_$2 )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum_$1, $list8 );
      return NIL;
    }
    assert NIL != Types.stringp( documentation_string ) : documentation_string;
    assert NIL != Types.listp( type_declarations ) : type_declarations;
    thread.resetMultipleValues();
    final SubLObject argument_types = parse_api_type_declarations( type_declarations );
    final SubLObject body_preamble = thread.secondMultipleValue();
    final SubLObject return_types = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    return ConsesLow.list( $sym5$REGISTER_CYC_API_FUNCTION, ConsesLow.list( $sym6$QUOTE, name ), ConsesLow.list( $sym6$QUOTE, arglist ), documentation_string, ConsesLow.list( $sym6$QUOTE, argument_types ), ConsesLow
        .list( $sym6$QUOTE, return_types ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 2888L)
  public static SubLObject defmacro_api(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    SubLObject pattern = NIL;
    SubLObject documentation_string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    pattern = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    documentation_string = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    assert NIL != Types.stringp( documentation_string ) : documentation_string;
    return ConsesLow.list( $sym3$PROGN, ConsesLow.listS( $sym10$DEFMACRO_PUBLIC, name, pattern, documentation_string, ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym11$REGISTER_CYC_API_MACRO, ConsesLow.list(
        $sym6$QUOTE, name ), ConsesLow.list( $sym6$QUOTE, pattern ), documentation_string ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 3414L)
  public static SubLObject define_api_provisional(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    SubLObject arglist = NIL;
    SubLObject documentation_string = NIL;
    SubLObject type_declarations = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    arglist = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    documentation_string = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    type_declarations = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    assert NIL != Types.stringp( documentation_string ) : documentation_string;
    assert NIL != Types.listp( type_declarations ) : type_declarations;
    thread.resetMultipleValues();
    final SubLObject argument_types = parse_api_type_declarations( type_declarations );
    final SubLObject body_preamble = thread.secondMultipleValue();
    final SubLObject return_types = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    return ConsesLow.list( $sym3$PROGN, ConsesLow.listS( $sym12$DEFINE_EXTERNAL, name, arglist, documentation_string, ConsesLow.append( body_preamble, body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 4105L)
  public static SubLObject defmacro_api_provisional(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    SubLObject pattern = NIL;
    SubLObject documentation_string = NIL;
    SubLObject type_declarations = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
    pattern = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
    documentation_string = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
    type_declarations = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    assert NIL != Types.stringp( documentation_string ) : documentation_string;
    assert NIL != Types.listp( type_declarations ) : type_declarations;
    return ConsesLow.list( $sym3$PROGN, ConsesLow.list( $sym14$REGISTER_EXTERNAL_SYMBOL, ConsesLow.list( $sym6$QUOTE, name ) ), ConsesLow.listS( $sym10$DEFMACRO_PUBLIC, name, pattern, documentation_string, ConsesLow
        .append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 4611L)
  public static SubLObject register_cyc_api_function(final SubLObject name, final SubLObject arglist, final SubLObject doc_string, final SubLObject argument_types, final SubLObject return_types)
  {
    register_api_predefined_function( name );
    register_cyc_api_symbol( name );
    register_cyc_api_args( name, arglist );
    register_cyc_api_function_documentation( name, doc_string );
    register_cyc_api_arg_types( name, argument_types );
    register_cyc_api_return_types( name, return_types );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 5131L)
  public static SubLObject register_cyc_api_macro(final SubLObject name, final SubLObject pattern, final SubLObject doc_string)
  {
    register_api_predefined_macro( name );
    register_cyc_api_symbol( name );
    register_cyc_api_args( name, pattern );
    register_cyc_api_function_documentation( name, doc_string );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 5747L)
  public static SubLObject api_special_p(final SubLObject operator)
  {
    return list_utilities.sublisp_boolean( Hashtables.gethash( operator, $api_special_table$.getGlobalValue(), NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 5853L)
  public static SubLObject api_special_handler(final SubLObject operator)
  {
    return Hashtables.gethash( operator, $api_special_table$.getGlobalValue(), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 5951L)
  public static SubLObject register_api_special(final SubLObject operator, final SubLObject handler)
  {
    if( NIL != api_predefined_function_p( operator ) || NIL != api_predefined_macro_p( operator ) )
    {
      Errors.warn( $str16$Registering__A_as_special_even_th, operator );
    }
    else
    {
      Hashtables.sethash( operator, $api_special_table$.getGlobalValue(), handler );
    }
    return operator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 6359L)
  public static SubLObject api_predefined_function_p(final SubLObject operator)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != api_predefined_host_function_p( operator ) )
    {
      return system_parameters.$permit_api_host_access$.getDynamicValue( thread );
    }
    return Hashtables.gethash( operator, $api_predefined_function_table$.getGlobalValue(), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 6586L)
  public static SubLObject register_api_predefined_function(final SubLObject operator)
  {
    if( NIL == api_special_p( operator ) )
    {
      Hashtables.sethash( operator, $api_predefined_function_table$.getGlobalValue(), T );
    }
    return operator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 6952L)
  public static SubLObject unregister_api_predefined_function(final SubLObject operator)
  {
    return Hashtables.remhash( operator, $api_predefined_function_table$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 7170L)
  public static SubLObject api_predefined_host_function_p(final SubLObject operator)
  {
    return Hashtables.gethash( operator, $api_predefined_host_function_table$.getGlobalValue(), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 7300L)
  public static SubLObject register_api_predefined_host_function(final SubLObject operator)
  {
    if( NIL == api_special_p( operator ) )
    {
      Hashtables.sethash( operator, $api_predefined_host_function_table$.getGlobalValue(), T );
    }
    return operator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 7675L)
  public static SubLObject unregister_api_predefined_host_function(final SubLObject operator)
  {
    return Hashtables.remhash( operator, $api_predefined_host_function_table$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 7897L)
  public static SubLObject api_predefined_macro_p(final SubLObject operator)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != api_predefined_host_macro_p( operator ) )
    {
      return system_parameters.$permit_api_host_access$.getDynamicValue( thread );
    }
    return Hashtables.gethash( operator, $api_predefined_macro_table$.getGlobalValue(), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 8115L)
  public static SubLObject register_api_predefined_macro(final SubLObject operator)
  {
    if( NIL == api_special_p( operator ) )
    {
      Hashtables.sethash( operator, $api_predefined_macro_table$.getGlobalValue(), T );
    }
    return operator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 8458L)
  public static SubLObject unregister_api_predefined_macro(final SubLObject operator)
  {
    return Hashtables.remhash( operator, $api_predefined_macro_table$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 8666L)
  public static SubLObject api_predefined_host_macro_p(final SubLObject operator)
  {
    return Hashtables.gethash( operator, $api_predefined_host_macro_table$.getGlobalValue(), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 8790L)
  public static SubLObject register_api_predefined_host_macro(final SubLObject operator)
  {
    if( NIL == api_special_p( operator ) )
    {
      Hashtables.sethash( operator, $api_predefined_host_macro_table$.getGlobalValue(), T );
    }
    return operator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 9171L)
  public static SubLObject unregister_api_predefined_host_macro(final SubLObject operator)
  {
    return Hashtables.remhash( operator, $api_predefined_host_macro_table$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 9374L)
  public static SubLObject cyc_api_symbol_p(final SubLObject obj)
  {
    return makeBoolean( obj.isSymbol() && NIL != Symbols.get( obj, $kw24$CYC_API_SYMBOL, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 9549L)
  public static SubLObject register_cyc_api_symbol(final SubLObject name)
  {
    assert NIL != Types.symbolp( name ) : name;
    Symbols.put( name, $kw24$CYC_API_SYMBOL, T );
    if( NIL == conses_high.member( name, $api_symbols$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) )
    {
      $api_symbols$.setGlobalValue( ConsesLow.cons( name, $api_symbols$.getGlobalValue() ) );
    }
    return name;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 9827L)
  public static SubLObject deregister_cyc_api_symbol(final SubLObject name)
  {
    assert NIL != Types.symbolp( name ) : name;
    Sequences.remove( name, $api_symbols$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return Symbols.remprop( name, $kw24$CYC_API_SYMBOL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 10099L)
  public static SubLObject cyc_api_args(final SubLObject name)
  {
    return Symbols.get( name, $kw26$CYC_API_ARGS, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 10220L)
  public static SubLObject register_cyc_api_args(final SubLObject name, final SubLObject arglist)
  {
    assert NIL != Types.symbolp( name ) : name;
    assert NIL != Types.listp( arglist ) : arglist;
    Symbols.put( name, $kw26$CYC_API_ARGS, arglist );
    return name;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 10505L)
  public static SubLObject deregister_cyc_api_args(final SubLObject name)
  {
    assert NIL != Types.symbolp( name ) : name;
    return Symbols.remprop( name, $kw26$CYC_API_ARGS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 10727L)
  public static SubLObject register_cyc_api_function_documentation(final SubLObject name, final SubLObject documentation_string)
  {
    assert NIL != Types.symbolp( name ) : name;
    assert NIL != Types.stringp( documentation_string ) : documentation_string;
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 11049L)
  public static SubLObject get_api_arg_types(final SubLObject name)
  {
    return Symbols.get( name, $kw27$CYC_API_ARG_TYPES, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 11250L)
  public static SubLObject register_cyc_api_arg_types(final SubLObject name, final SubLObject argument_type_list)
  {
    assert NIL != Types.symbolp( name ) : name;
    assert NIL != Types.listp( argument_type_list ) : argument_type_list;
    Symbols.put( name, $kw27$CYC_API_ARG_TYPES, argument_type_list );
    return name;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 11601L)
  public static SubLObject deregister_cyc_api_arg_types(final SubLObject name)
  {
    assert NIL != Types.symbolp( name ) : name;
    return Symbols.remprop( name, $kw27$CYC_API_ARG_TYPES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 11845L)
  public static SubLObject get_api_return_types(final SubLObject name)
  {
    return Symbols.get( name, $kw28$CYC_API_RETURN_TYPES, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 12047L)
  public static SubLObject register_cyc_api_return_types(final SubLObject name, final SubLObject return_types)
  {
    assert NIL != Types.symbolp( name ) : name;
    assert NIL != Types.listp( return_types ) : return_types;
    SubLObject cdolist_list_var = return_types;
    SubLObject return_type = NIL;
    return_type = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      validate_return_type( return_type );
      cdolist_list_var = cdolist_list_var.rest();
      return_type = cdolist_list_var.first();
    }
    Symbols.put( name, $kw28$CYC_API_RETURN_TYPES, return_types );
    return name;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 12402L)
  public static SubLObject deregister_cyc_api_return_types(final SubLObject name)
  {
    assert NIL != Types.symbolp( name ) : name;
    return Symbols.remprop( name, $kw28$CYC_API_RETURN_TYPES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 12678L)
  public static SubLObject parse_api_type_declarations(final SubLObject type_declarations)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject argument_types = parse_api_declarations_int( type_declarations, NIL );
    final SubLObject body_preamble = thread.secondMultipleValue();
    final SubLObject return_types = thread.thirdMultipleValue();
    final SubLObject replacements = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    return Values.values( argument_types, body_preamble, return_types );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 13130L)
  public static SubLObject parse_obsolete_api_declarations(final SubLObject declarations)
  {
    return parse_api_declarations_int( declarations, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 13428L)
  public static SubLObject parse_api_declarations_int(final SubLObject declarations, final SubLObject allow_replacementsP)
  {
    SubLObject replacements = NIL;
    SubLObject argument_types = NIL;
    SubLObject body_preamble = NIL;
    SubLObject return_types = NIL;
    SubLObject cdolist_list_var = declarations;
    SubLObject declaration = NIL;
    declaration = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject pcase_var = declaration.first();
      if( pcase_var.eql( $kw30$REPLACEMENTS ) )
      {
        if( NIL == allow_replacementsP )
        {
          Errors.error( $str31$_replacements_not_allowed_in_the_ );
        }
        replacements = declaration.rest();
      }
      else if( pcase_var.eql( $kw32$ARGUMENT_TYPES ) )
      {
        SubLObject cdolist_list_var_$3;
        argument_types = ( cdolist_list_var_$3 = declaration.rest() );
        SubLObject argument_type = NIL;
        argument_type = cdolist_list_var_$3.first();
        while ( NIL != cdolist_list_var_$3)
        {
          body_preamble = ConsesLow.append( body_preamble, ConsesLow.list( expand_into_enforce_type( argument_type ) ) );
          cdolist_list_var_$3 = cdolist_list_var_$3.rest();
          argument_type = cdolist_list_var_$3.first();
        }
      }
      else if( pcase_var.eql( $kw33$RETURN_TYPES ) )
      {
        return_types = declaration.rest();
      }
      cdolist_list_var = cdolist_list_var.rest();
      declaration = cdolist_list_var.first();
    }
    return Values.values( argument_types, body_preamble, return_types, replacements );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 14529L)
  public static SubLObject expand_into_enforce_type(final SubLObject argument_type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject argument = argument_type.first();
    final SubLObject predicate_expression = conses_high.second( argument_type );
    SubLObject predicate = NIL;
    if( predicate_expression.isAtom() )
    {
      if( NIL == conses_high.member( predicate_expression, $api_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) )
      {
        $api_types$.setGlobalValue( ConsesLow.cons( predicate_expression, $api_types$.getGlobalValue() ) );
      }
      return ConsesLow.list( $sym34$ENFORCE_TYPE, argument, predicate_expression );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && predicate_expression.first() != $sym35$NIL_OR )
    {
      Errors.error( $str36$Invalid_argument_type_expression_, argument_type );
    }
    predicate = conses_high.second( predicate_expression );
    return ConsesLow.list( $sym37$PWHEN, argument, ConsesLow.list( $sym34$ENFORCE_TYPE, argument, predicate ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 15347L)
  public static SubLObject validate_return_type(final SubLObject return_type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( return_type.isAtom() )
    {
      if( NIL == conses_high.member( return_type, $api_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) )
      {
        $api_types$.setGlobalValue( ConsesLow.cons( return_type, $api_types$.getGlobalValue() ) );
      }
      return T;
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !Sequences.length( return_type ).eql( TWO_INTEGER ) )
    {
      Errors.error( $str38$_S_return_type_expression_not_lis, return_type );
    }
    if( NIL != conses_high.member( return_type.first(), $list39, UNPROVIDED, UNPROVIDED ) )
    {
      return validate_return_type( conses_high.second( return_type ) );
    }
    Errors.error( $str40$_S_complex_return_type_expression, return_type );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 16006L)
  public static SubLObject define_after_adding(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    SubLObject arglist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    arglist = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym42$DEFINE_KB, name, arglist, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 16296L)
  public static SubLObject define_after_removing(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    SubLObject arglist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    arglist = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym42$DEFINE_KB, name, arglist, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 16531L)
  public static SubLObject define_rule_after_adding(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    SubLObject arglist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    arglist = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym42$DEFINE_KB, name, arglist, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 16769L)
  public static SubLObject define_rule_after_removing(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    SubLObject arglist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    arglist = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym42$DEFINE_KB, name, arglist, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 17013L)
  public static SubLObject define_collection_defn(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    SubLObject arglist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    arglist = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym42$DEFINE_KB, name, arglist, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 17167L)
  public static SubLObject define_evaluation_defn(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    SubLObject pattern = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list48 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list48 );
    pattern = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym42$DEFINE_KB, name, pattern, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 17320L)
  public static SubLObject define_expansion_defn(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    SubLObject pattern = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list48 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list48 );
    pattern = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym42$DEFINE_KB, name, pattern, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 17471L)
  public static SubLObject define_cyc_subl_defn(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject function_symbol = NIL;
    SubLObject basis_function = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list51 );
    function_symbol = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list51 );
    basis_function = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject arglist = $list52;
      final SubLObject body = ConsesLow.list( $sym37$PWHEN, $list53, ConsesLow.list( $sym54$RET, reader.bq_cons( basis_function, $list55 ) ) );
      return ConsesLow.list( $sym42$DEFINE_KB, function_symbol, arglist, body );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list51 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 18132L)
  public static SubLObject define_kb(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    SubLObject arglist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    arglist = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym3$PROGN, ConsesLow.listS( $sym56$DEFINE, name, arglist, ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym57$REGISTER_KB_FUNCTION, ConsesLow.list( $sym6$QUOTE, name ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 18467L)
  public static SubLObject kb_function_p(final SubLObject symbol)
  {
    return Hashtables.gethash_without_values( symbol, $kb_function_table$.getGlobalValue(), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 18570L)
  public static SubLObject register_kb_symbol(final SubLObject symbol)
  {
    assert NIL != Types.symbolp( symbol ) : symbol;
    Hashtables.sethash( symbol, $kb_function_table$.getGlobalValue(), T );
    return symbol;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 18782L)
  public static SubLObject deregister_kb_symbol(final SubLObject symbol)
  {
    assert NIL != Types.symbolp( symbol ) : symbol;
    return Hashtables.remhash( symbol, $kb_function_table$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 18907L)
  public static SubLObject deregister_all_kb_functions()
  {
    Hashtables.clrhash( $kb_function_table$.getGlobalValue() );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 19047L)
  public static SubLObject all_kb_functions()
  {
    SubLObject kb_functions = NIL;
    SubLObject symbol = NIL;
    SubLObject value = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( $kb_function_table$.getGlobalValue() );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        symbol = Hashtables.getEntryKey( cdohash_entry );
        value = Hashtables.getEntryValue( cdohash_entry );
        kb_functions = ConsesLow.cons( symbol, kb_functions );
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    kb_functions = Sort.sort( kb_functions, Symbols.symbol_function( $sym60$STRING_LESSP ), Symbols.symbol_function( $sym61$SYMBOL_NAME ) );
    return kb_functions;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 19353L)
  public static SubLObject register_kb_function(final SubLObject function_symbol)
  {
    return register_kb_symbol( function_symbol );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 19561L)
  public static SubLObject deregister_kb_function(final SubLObject function_symbol)
  {
    return deregister_kb_symbol( function_symbol );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 19668L)
  public static SubLObject define_private_funcall(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    SubLObject arglist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    arglist = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym3$PROGN, ConsesLow.listS( $sym63$DEFINE_PRIVATE, name, arglist, ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym64$NOTE_FUNCALL_HELPER_FUNCTION, ConsesLow.list( $sym6$QUOTE,
        name ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 21543L)
  public static SubLObject note_funcall_helper_function(final SubLObject symbol)
  {
    Symbols.put( symbol, $funcall_helper_property$.getGlobalValue(), T );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 21765L)
  public static SubLObject funcall_helper_functionP(final SubLObject symbol)
  {
    return Symbols.get( symbol, $funcall_helper_property$.getGlobalValue(), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 22429L)
  public static SubLObject unprovided_argumentP(final SubLObject arg)
  {
    return Equality.eq( arg, $unprovided$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 22582L)
  public static SubLObject declare_control_parameter(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject variable = NIL;
    SubLObject fancy_name = NIL;
    SubLObject description = NIL;
    SubLObject settings_spec = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list70 );
    variable = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list70 );
    fancy_name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list70 );
    description = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list70 );
    settings_spec = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym71$DECLARE_CONTROL_PARAMETER_INTERNAL, ConsesLow.list( $sym6$QUOTE, variable ), fancy_name, description, ConsesLow.list( $sym6$QUOTE, settings_spec ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list70 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 23462L)
  public static SubLObject declare_control_parameter_internal(final SubLObject variable, final SubLObject fancy_name, final SubLObject description, final SubLObject settings_spec)
  {
    assert NIL != Types.symbolp( variable ) : variable;
    assert NIL != Types.stringp( fancy_name ) : fancy_name;
    assert NIL != Types.stringp( description ) : description;
    Symbols.put( variable, $kw72$FANCY_NAME, fancy_name );
    Symbols.put( variable, $kw73$DESCRIPTION, description );
    Symbols.put( variable, $kw74$SETTINGS_SPEC, settings_spec );
    return variable;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 23801L)
  public static SubLObject until_mapping_finished(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym75$CCATCH_IGNORE, $kw76$MAPPING_DONE, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 23956L)
  public static SubLObject mapping_finished()
  {
    Dynamic.sublisp_throw( $kw76$MAPPING_DONE, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 24026L)
  public static SubLObject until_sbhl_mapping_finished(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym75$CCATCH_IGNORE, $kw77$SBHL_MAPPING_DONE, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 24133L)
  public static SubLObject sbhl_mapping_finished()
  {
    Dynamic.sublisp_throw( $kw77$SBHL_MAPPING_DONE, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 24318L)
  public static SubLObject cfasl_write(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject obj = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list78 );
    obj = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.listS( $sym79$WRITE_BYTE, obj, $list80 );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list78 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 24389L)
  public static SubLObject cfasl_read(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    if( NIL != datum )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, NIL );
    }
    return $list81;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 24458L)
  public static SubLObject if_lock_idle(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject lock = NIL;
    SubLObject action = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list82 );
    lock = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list82 );
    action = current.first();
    current = current.rest();
    final SubLObject else_action = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list82 );
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list82 );
      return NIL;
    }
    final SubLObject lock_var = $sym83$LOCK_VAR;
    if( NIL != else_action )
    {
      return ConsesLow.list( $sym84$CLET, ConsesLow.list( ConsesLow.list( lock_var, lock ) ), ConsesLow.list( $sym85$PIF, ConsesLow.list( $sym86$LOCK_IDLE_P, lock_var ), ConsesLow.list( $sym87$WITH_LOCK_HELD, ConsesLow
          .list( lock_var ), action ), else_action ) );
    }
    return ConsesLow.list( $sym84$CLET, ConsesLow.list( ConsesLow.list( lock_var, lock ) ), ConsesLow.list( $sym37$PWHEN, ConsesLow.list( $sym86$LOCK_IDLE_P, lock_var ), ConsesLow.list( $sym87$WITH_LOCK_HELD, ConsesLow
        .list( lock_var ), action ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 25065L)
  public static SubLObject possibly_with_lock_held(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject lock = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list88 );
    lock = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym85$PIF, lock, ConsesLow.listS( $sym87$WITH_LOCK_HELD, ConsesLow.list( lock ), ConsesLow.append( body, NIL ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 25251L)
  public static SubLObject defglobal_lock(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject variable = NIL;
    SubLObject name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list89 );
    variable = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list89 );
    name = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$4 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list89 );
      current_$4 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list89 );
      if( NIL == conses_high.member( current_$4, $list90, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$4 == $kw91$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list89 );
    }
    final SubLObject vaccess_tail = cdestructuring_bind.property_list_member( $kw92$VACCESS, current );
    final SubLObject vaccess = ( NIL != vaccess_tail ) ? conses_high.cadr( vaccess_tail ) : NIL;
    final SubLObject documentation_tail = cdestructuring_bind.property_list_member( $kw93$DOCUMENTATION, current );
    final SubLObject documentation = ( NIL != documentation_tail ) ? conses_high.cadr( documentation_tail ) : NIL;
    final SubLObject init_form = global_lock_initialization_form( name );
    return reader.bq_cons( $sym3$PROGN, ConsesLow.append( ( NIL != vaccess ) ? ConsesLow.list( ConsesLow.list( $sym94$DECLAIM, ConsesLow.list( $sym95$VACCESS, vaccess, variable ) ) ) : NIL, ConsesLow.list( ConsesLow
        .listS( $sym96$DEFGLOBAL, variable, init_form, ConsesLow.append( ( NIL != documentation ) ? ConsesLow.list( documentation ) : NIL, NIL ) ), ConsesLow.list( $sym97$REGISTER_GLOBAL_LOCK, ConsesLow.list(
            $sym6$QUOTE, variable ), name ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 25641L)
  public static SubLObject initialize_global_locks()
  {
    SubLObject cdolist_list_var = $global_locks$.getGlobalValue();
    SubLObject pair = NIL;
    pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = pair;
      SubLObject global = NIL;
      SubLObject name = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list99 );
      global = current.first();
      current = ( name = current.rest() );
      initialize_global_lock_internal( global, name );
      cdolist_list_var = cdolist_list_var.rest();
      pair = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 25865L)
  public static SubLObject register_global_lock(final SubLObject global, final SubLObject name)
  {
    assert NIL != Types.symbolp( global ) : global;
    assert NIL != Types.stringp( name ) : name;
    $global_locks$.setGlobalValue( Sequences.delete( global, $global_locks$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( $sym100$CAR ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    $global_locks$.setGlobalValue( ConsesLow.cons( ConsesLow.cons( global, name ), $global_locks$.getGlobalValue() ) );
    return $global_locks$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 26223L)
  public static SubLObject global_lock_p(final SubLObject v_object)
  {
    return list_utilities.sublisp_boolean( conses_high.assoc( v_object, $global_locks$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 26311L)
  public static SubLObject global_lock_initialization_form(final SubLObject name)
  {
    assert NIL != Types.stringp( name ) : name;
    return ConsesLow.list( $sym101$MAKE_LOCK, name );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 26423L)
  public static SubLObject initialize_global_lock(final SubLObject global)
  {
    assert NIL != global_lock_p( global ) : global;
    final SubLObject name = conses_high.assoc( global, $global_locks$.getGlobalValue(), UNPROVIDED, UNPROVIDED ).rest();
    if( name.isString() )
    {
      initialize_global_lock_internal( global, name );
    }
    return Symbols.symbol_value( global );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 26671L)
  public static SubLObject initialize_global_lock_internal(final SubLObject global, final SubLObject name)
  {
    final SubLObject init_form = global_lock_initialization_form( name );
    Eval.eval( ConsesLow.list( $sym105$CSETQ, global, init_form ) );
    return Symbols.symbol_value( global );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 27019L)
  public static SubLObject defparameter_fi(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject variable = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list107 );
    variable = current.first();
    current = current.rest();
    final SubLObject initialization = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list107 );
    current = current.rest();
    final SubLObject documentation = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list107 );
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym3$PROGN, ConsesLow.list( $sym108$DEFPARAMETER_HTML, variable, initialization, documentation ), ConsesLow.listS( $sym109$CPUSHNEW, ConsesLow.list( $sym6$QUOTE, variable ), $list110 ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list107 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 27223L)
  public static SubLObject with_clean_fi_state(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym111$CPROGV, $sym106$_FI_STATE_VARIABLES_, $list112, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 27416L)
  public static SubLObject register_html_state_variable(final SubLObject variable)
  {
    if( NIL == conses_high.member( variable, $html_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      $html_state_variables$.setGlobalValue( ConsesLow.cons( variable, $html_state_variables$.getGlobalValue() ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 27534L)
  public static SubLObject defparameter_html(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject variable = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list107 );
    variable = current.first();
    current = current.rest();
    final SubLObject initialization = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list107 );
    current = current.rest();
    final SubLObject documentation = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list107 );
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list107 );
      return NIL;
    }
    if( NIL != system_info.cyc_html_feature() )
    {
      return ConsesLow.list( $sym3$PROGN, ConsesLow.list( $sym114$DEFPARAMETER, variable, initialization, documentation ), ConsesLow.list( $sym115$REGISTER_HTML_STATE_VARIABLE, ConsesLow.list( $sym6$QUOTE,
          variable ) ) );
    }
    return ConsesLow.list( $sym114$DEFPARAMETER, variable, initialization, documentation );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 27849L)
  public static SubLObject defvar_html(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject variable = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list107 );
    variable = current.first();
    current = current.rest();
    final SubLObject initialization = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list107 );
    current = current.rest();
    final SubLObject documentation = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list107 );
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list107 );
      return NIL;
    }
    if( NIL != system_info.cyc_html_feature() )
    {
      return ConsesLow.list( $sym3$PROGN, ConsesLow.list( $sym116$DEFVAR, variable, initialization, documentation ), ConsesLow.list( $sym115$REGISTER_HTML_STATE_VARIABLE, ConsesLow.list( $sym6$QUOTE, variable ) ) );
    }
    return ConsesLow.list( $sym116$DEFVAR, variable, initialization, documentation );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 28198L)
  public static SubLObject register_html_interface_variable(final SubLObject variable)
  {
    if( NIL == conses_high.member( variable, $html_interface_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      $html_interface_variables$.setGlobalValue( ConsesLow.cons( variable, $html_interface_variables$.getGlobalValue() ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 28324L)
  public static SubLObject defparameter_html_interface(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject variable = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list107 );
    variable = current.first();
    current = current.rest();
    final SubLObject initialization = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list107 );
    current = current.rest();
    final SubLObject documentation = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list107 );
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list107 );
      return NIL;
    }
    if( NIL != system_info.cyc_html_feature() )
    {
      return ConsesLow.list( $sym3$PROGN, ConsesLow.list( $sym114$DEFPARAMETER, variable, initialization, documentation ), ConsesLow.list( $sym115$REGISTER_HTML_STATE_VARIABLE, ConsesLow.list( $sym6$QUOTE, variable ) ),
          ConsesLow.list( $sym118$REGISTER_HTML_INTERFACE_VARIABLE, ConsesLow.list( $sym6$QUOTE, variable ) ) );
    }
    return ConsesLow.list( $sym114$DEFPARAMETER, variable, initialization, documentation );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 28703L)
  public static SubLObject defvar_html_interface(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject variable = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list107 );
    variable = current.first();
    current = current.rest();
    final SubLObject initialization = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list107 );
    current = current.rest();
    final SubLObject documentation = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list107 );
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list107 );
      return NIL;
    }
    if( NIL != system_info.cyc_html_feature() )
    {
      return ConsesLow.list( $sym3$PROGN, ConsesLow.list( $sym116$DEFVAR, variable, initialization, documentation ), ConsesLow.list( $sym115$REGISTER_HTML_STATE_VARIABLE, ConsesLow.list( $sym6$QUOTE, variable ) ),
          ConsesLow.list( $sym118$REGISTER_HTML_INTERFACE_VARIABLE, ConsesLow.list( $sym6$QUOTE, variable ) ) );
    }
    return ConsesLow.list( $sym116$DEFVAR, variable, initialization, documentation );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 29062L)
  public static SubLObject def_state_variable(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject variable = NIL;
    SubLObject state_variables = NIL;
    SubLObject initialization = NIL;
    SubLObject documentation = NIL;
    SubLObject type = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list119 );
    variable = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list119 );
    state_variables = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list119 );
    initialization = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list119 );
    documentation = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list119 );
    type = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject defop = define_operator_for_variable_type( type );
      return ConsesLow.list( $sym3$PROGN, ConsesLow.listS( defop, variable, initialization, ConsesLow.append( ( NIL != documentation ) ? ConsesLow.list( documentation ) : NIL, NIL ) ), ConsesLow.list( $sym109$CPUSHNEW,
          ConsesLow.list( $sym6$QUOTE, variable ), state_variables ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list119 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 29896L)
  public static SubLObject note_state_variable_documentation(final SubLObject variable, final SubLObject documentation)
  {
    Symbols.put( variable, $kw122$VARIABLE_DOC, documentation );
    return variable;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 30078L)
  public static SubLObject define_operator_for_variable_type(final SubLObject variable_type)
  {
    SubLObject defop = NIL;
    if( variable_type.eql( $kw123$VARIABLE ) )
    {
      defop = $sym116$DEFVAR;
    }
    else if( variable_type.eql( $kw124$PARAMETER ) )
    {
      defop = $sym114$DEFPARAMETER;
    }
    else if( variable_type.eql( $kw125$GLOBAL ) )
    {
      defop = $sym96$DEFGLOBAL;
    }
    else if( variable_type.eql( $kw126$LEXICAL ) )
    {
      defop = $sym127$DEFLEXICAL;
    }
    else if( variable_type.eql( $kw128$CONSTANT ) )
    {
      defop = $sym129$DEFCONSTANT;
    }
    else if( variable_type.eql( $kw130$PARAMETER_PRIVATE ) )
    {
      defop = $sym131$DEFPARAMETER_PRIVATE;
    }
    else if( variable_type.eql( $kw132$PARAMETER_PUBLIC ) )
    {
      defop = $sym133$DEFPARAMETER_PUBLIC;
    }
    else if( variable_type.eql( $kw134$PARAMETER_PROTECTECD ) )
    {
      defop = $sym133$DEFPARAMETER_PUBLIC;
    }
    else
    {
      Errors.error( $str135$unknown_variable_type__s__, variable_type );
    }
    return defop;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 30693L)
  public static SubLObject documentation(final SubLObject symbol, SubLObject type)
  {
    if( type == UNPROVIDED )
    {
      type = $kw123$VARIABLE;
    }
    final SubLObject pcase_var = type;
    if( pcase_var.eql( $kw123$VARIABLE ) )
    {
      return Symbols.get( symbol, $kw122$VARIABLE_DOC, UNPROVIDED );
    }
    if( pcase_var.eql( $kw136$FUNCTION ) )
    {
      return Symbols.get( symbol, $kw137$FUNCTION_DOC, UNPROVIDED );
    }
    if( pcase_var.eql( $kw138$STRUCTURE ) )
    {
      return Symbols.get( symbol, $kw139$STRUCTURE_DOC, UNPROVIDED );
    }
    if( pcase_var.eql( $kw140$TYPE ) )
    {
      return Symbols.get( symbol, $kw141$TYPE_DOC, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 31011L)
  public static SubLObject defvar_gt(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject variable = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list143 );
    variable = current.first();
    current = current.rest();
    final SubLObject initialization = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list143 );
    current = current.rest();
    final SubLObject documentation = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list143 );
    current = current.rest();
    final SubLObject type = current.isCons() ? current.first() : $kw124$PARAMETER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list143 );
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym121$DEF_STATE_VARIABLE, variable, $sym142$_GT_STATE_VARIABLES_, initialization, documentation, type );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list143 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 31238L)
  public static SubLObject defvar_at(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject variable = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list143 );
    variable = current.first();
    current = current.rest();
    final SubLObject initialization = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list143 );
    current = current.rest();
    final SubLObject documentation = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list143 );
    current = current.rest();
    final SubLObject type = current.isCons() ? current.first() : $kw124$PARAMETER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list143 );
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym121$DEF_STATE_VARIABLE, variable, $sym144$_AT_STATE_VARIABLES_, initialization, documentation, type );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list143 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 31468L)
  public static SubLObject defvar_defn(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject variable = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list143 );
    variable = current.first();
    current = current.rest();
    final SubLObject initialization = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list143 );
    current = current.rest();
    final SubLObject documentation = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list143 );
    current = current.rest();
    final SubLObject type = current.isCons() ? current.first() : $kw124$PARAMETER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list143 );
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym121$DEF_STATE_VARIABLE, variable, $sym145$_DEFN_STATE_VARIABLES_, initialization, documentation, type );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list143 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 31662L)
  public static SubLObject defvar_kbi(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject variable = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list146 );
    variable = current.first();
    current = current.rest();
    final SubLObject initialization = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list146 );
    current = current.rest();
    final SubLObject documentation = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list146 );
    current = current.rest();
    final SubLObject type = current.isCons() ? current.first() : $kw134$PARAMETER_PROTECTECD;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list146 );
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym121$DEF_STATE_VARIABLE, variable, $sym147$_KBI_STATE_VARIABLES_, initialization, documentation, type );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list146 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 31953L)
  public static SubLObject defvar_kbp(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject variable = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list143 );
    variable = current.first();
    current = current.rest();
    final SubLObject initialization = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list143 );
    current = current.rest();
    final SubLObject documentation = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list143 );
    current = current.rest();
    final SubLObject type = current.isCons() ? current.first() : $kw124$PARAMETER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list143 );
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym121$DEF_STATE_VARIABLE, variable, $sym148$_KBP_STATE_VARIABLES_, initialization, documentation, type );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list143 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 32145L)
  public static SubLObject with_kbp_defaults(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym84$CLET, $list149, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 32894L)
  public static SubLObject progn_cyc_api(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list150 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject machine = NIL;
    SubLObject port = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list150 );
    machine = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list150 );
    port = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym151$CYC_API_REMOTE_EVAL, ConsesLow.list( $sym6$QUOTE, reader.bq_cons( $sym3$PROGN, ConsesLow.append( body, NIL ) ) ), machine, port );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list150 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 33125L)
  public static SubLObject with_forward_inference_environment(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list152 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject environment_$5 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list152 );
    environment_$5 = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym3$PROGN, ConsesLow.listS( $sym153$CHECK_TYPE, environment_$5, $list154 ), ConsesLow.listS( $sym84$CLET, ConsesLow.list( ConsesLow.list( $sym155$_FORWARD_INFERENCE_ENVIRONMENT_,
          environment_$5 ) ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list152 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 33434L)
  public static SubLObject with_clean_forward_inference_environment(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    final SubLObject environment_$6 = $sym156$ENVIRONMENT;
    return ConsesLow.list( $sym84$CLET, ConsesLow.list( reader.bq_cons( environment_$6, $list157 ) ), ConsesLow.listS( $sym158$WITH_FORWARD_INFERENCE_ENVIRONMENT, ConsesLow.list( environment_$6 ), ConsesLow.append( body,
        NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 33675L)
  public static SubLObject with_possibly_clean_forward_inference_environment(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    final SubLObject environment_$7 = $sym159$ENVIRONMENT;
    return ConsesLow.list( $sym84$CLET, ConsesLow.list( reader.bq_cons( environment_$7, $list160 ) ), ConsesLow.listS( $sym158$WITH_FORWARD_INFERENCE_ENVIRONMENT, ConsesLow.list( environment_$7 ), ConsesLow.append( body,
        NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 33934L)
  public static SubLObject possibly_get_forward_inference_environment()
  {
    final SubLObject existing_environment = forward.current_forward_inference_environment();
    return ( NIL != misc_utilities.initialized_p( existing_environment ) ) ? existing_environment : forward.get_forward_inference_environment();
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 34378L)
  public static SubLObject with_clean_forward_problem_store_environment(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym84$CLET, $list163, ConsesLow.listS( $sym164$CUNWIND_PROTECT, reader.bq_cons( $sym3$PROGN, ConsesLow.append( body, NIL ) ), $list165 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 34809L)
  public static SubLObject with_normal_forward_inference_parameters(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym84$CLET, $list166, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 35099L)
  public static SubLObject with_normal_forward_inference(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym167$WITH_NORMAL_FORWARD_INFERENCE_PARAMETERS, ConsesLow.list( $sym168$WITH_CLEAN_FORWARD_INFERENCE_ENVIRONMENT, reader.bq_cons( $sym169$WITH_CLEAN_FORWARD_PROBLEM_STORE_ENVIRONMENT,
        ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 35479L)
  public static SubLObject within_normal_forward_inferenceP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != kb_control_vars.within_forward_inferenceP() && NIL == kb_control_vars.$within_assertion_forward_propagationP$.getDynamicValue( thread ) && NIL == control_vars.$prefer_forward_skolemization$
        .getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 35797L)
  public static SubLObject throw_unevaluatable_on_error(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    final SubLObject error = $sym170$ERROR;
    return ConsesLow.list( $sym84$CLET, ConsesLow.list( error ), ConsesLow.listS( $sym171$CATCH_ERROR_MESSAGE, ConsesLow.list( error ), ConsesLow.append( body, NIL ) ), ConsesLow.listS( $sym37$PWHEN, error, $list172 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 36559L)
  public static SubLObject tracing_at_level(final SubLObject tracee, final SubLObject level)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject set_level = conses_high.assoc( tracee, $tracing_level$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ).rest();
    return makeBoolean( level.isNumber() && set_level.isNumber() && set_level.isPositive() && set_level.numGE( level ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 36777L)
  public static SubLObject if_tracing(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list173 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject tracee = NIL;
    SubLObject level = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list173 );
    tracee = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list173 );
    level = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym37$PWHEN, ConsesLow.list( $sym174$TRACING_AT_LEVEL, tracee, level ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list173 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 37343L)
  public static SubLObject with_static_structure_resourcing(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject resourceP = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list175 );
    resourceP = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    if( NIL != Sequences.find( $kw176$SL2JAVA, reader.$features$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return reader.bq_cons( $sym3$PROGN, ConsesLow.append( body, NIL ) );
    }
    return ConsesLow.listS( $sym84$CLET, ConsesLow.list( ConsesLow.list( $sym177$_STRUCTURE_RESOURCING_MAKE_STATIC_, resourceP ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 37555L)
  public static SubLObject possibly_with_static_structure_resourcing(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    if( NIL != Sequences.find( $kw176$SL2JAVA, reader.$features$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return reader.bq_cons( $sym3$PROGN, ConsesLow.append( body, NIL ) );
    }
    return ConsesLow.list( $sym85$PIF, $sym177$_STRUCTURE_RESOURCING_MAKE_STATIC_, reader.bq_cons( $sym178$WITH_STATIC_AREA, ConsesLow.append( body, NIL ) ), reader.bq_cons( $sym3$PROGN, ConsesLow.append( body,
        NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 37809L)
  public static SubLObject define_structure_resource(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject structure = NIL;
    SubLObject link_slot = NIL;
    SubLObject mark_slot = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list179 );
    structure = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list179 );
    link_slot = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list179 );
    mark_slot = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list179 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject v_object = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list179 );
    v_object = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject struct_name = Symbols.symbol_name( structure );
      final SubLObject free_var = Packages.intern( PrintLow.format( NIL, $str180$__A_FREE_LIST_, struct_name ), UNPROVIDED );
      final SubLObject free_var_doc = PrintLow.format( NIL, $str181$Free_list_for__A_objects, struct_name );
      final SubLObject lock_var = Packages.intern( PrintLow.format( NIL, $str182$__A_FREE_LOCK_, struct_name ), UNPROVIDED );
      final SubLObject lock_var_doc = PrintLow.format( NIL, $str183$Lock_for__A_object_free_list, struct_name );
      final SubLObject lock_name = PrintLow.format( NIL, $str184$_A_resource_lock, struct_name );
      final SubLObject make_static_func = Packages.intern( PrintLow.format( NIL, $str185$MAKE_STATIC__A, struct_name ), UNPROVIDED );
      final SubLObject make_static_func_doc = PrintLow.format( NIL, $str186$Make_a_new__A_in_the_static_area, struct_name );
      final SubLObject init_func = Packages.intern( PrintLow.format( NIL, $str187$INIT__A, struct_name ), UNPROVIDED );
      final SubLObject init_func_doc = PrintLow.format( NIL, $str188$Initialize_a__A_for_use, struct_name );
      final SubLObject get_func = Packages.intern( PrintLow.format( NIL, $str189$GET__A, struct_name ), UNPROVIDED );
      final SubLObject get_func_doc = PrintLow.format( NIL, $str190$Get_a__A_from_the_free_list__or_m, struct_name );
      final SubLObject free_pred = Packages.intern( PrintLow.format( NIL, $str191$FREE__A_P, struct_name ), UNPROVIDED );
      final SubLObject free_pred_doc = PrintLow.format( NIL, $str192$Check_if_OBJECT_is_a__A_that_has_, struct_name );
      final SubLObject free_func = Packages.intern( PrintLow.format( NIL, $str193$FREE__A, struct_name ), UNPROVIDED );
      final SubLObject free_func_doc = PrintLow.format( NIL, $str194$Place_a__A_onto_the_free_list, struct_name );
      final SubLObject make_func = Packages.intern( PrintLow.format( NIL, $str195$MAKE__A, struct_name ), UNPROVIDED );
      final SubLObject test_func = Packages.intern( PrintLow.format( NIL, $str196$_A_P, struct_name ), UNPROVIDED );
      return ConsesLow.list( $sym3$PROGN, ConsesLow.list( $sym197$DEFLEXICAL_PRIVATE, free_var, NIL, free_var_doc ), ConsesLow.list( $sym197$DEFLEXICAL_PRIVATE, lock_var, ConsesLow.list( $sym101$MAKE_LOCK, lock_name ),
          lock_var_doc ), ConsesLow.list( $sym63$DEFINE_PRIVATE, make_static_func, NIL, make_static_func_doc, ConsesLow.listS( $sym84$CLET, $list52, ConsesLow.list( $sym178$WITH_STATIC_AREA, ConsesLow.list(
              $sym105$CSETQ, $sym198$OBJECT, ConsesLow.list( make_func ) ) ), $list199 ) ), ConsesLow.listS( $sym63$DEFINE_PRIVATE, init_func, ConsesLow.list( v_object ), init_func_doc, ConsesLow.append( body, NIL ) ),
          ConsesLow.list( $sym56$DEFINE, free_pred, $list52, free_pred_doc, ConsesLow.list( $sym54$RET, ConsesLow.list( $sym200$CAND, reader.bq_cons( test_func, $list52 ), ConsesLow.listS( EQ, reader.bq_cons( mark_slot,
              $list52 ), $list201 ) ) ) ), ConsesLow.listS( $sym56$DEFINE, new SubLObject[]
              { free_func, $list52, free_func_doc, ConsesLow.list( $sym153$CHECK_TYPE, $sym198$OBJECT, test_func ), ConsesLow.listS( $sym202$PUNLESS, reader.bq_cons( free_pred, $list52 ), ConsesLow.list( $sym105$CSETQ,
                  $sym198$OBJECT, reader.bq_cons( init_func, $list52 ) ), ConsesLow.listS( $sym203$CSETF, reader.bq_cons( mark_slot, $list52 ), $list201 ), ConsesLow.list( $sym37$PWHEN,
                      $sym204$_STRUCTURE_RESOURCING_ENABLED_, ConsesLow.list( $sym87$WITH_LOCK_HELD, ConsesLow.list( lock_var ), ConsesLow.list( $sym203$CSETF, reader.bq_cons( link_slot, $list52 ), free_var ), ConsesLow
                          .listS( $sym105$CSETQ, free_var, $list52 ) ) ), $list205 ), $list206
          } ), ConsesLow.list( $sym56$DEFINE, get_func, NIL, get_func_doc, ConsesLow.list( $sym202$PUNLESS, $sym204$_STRUCTURE_RESOURCING_ENABLED_, ConsesLow.list( $sym85$PIF, $sym177$_STRUCTURE_RESOURCING_MAKE_STATIC_,
              ConsesLow.list( $sym54$RET, ConsesLow.list( init_func, ConsesLow.list( make_static_func ) ) ), ConsesLow.list( $sym54$RET, ConsesLow.list( init_func, ConsesLow.list( make_func ) ) ) ) ), ConsesLow.list(
                  $sym84$CLET, $list207, ConsesLow.list( $sym87$WITH_LOCK_HELD, ConsesLow.list( lock_var ), ConsesLow.list( $sym105$CSETQ, $sym198$OBJECT, free_var ), ConsesLow.list( $sym208$CDO, NIL, $list209, ConsesLow
                      .list( $sym85$PIF, reader.bq_cons( free_pred, $list52 ), ConsesLow.listS( $sym3$PROGN, ConsesLow.list( $sym105$CSETQ, free_var, reader.bq_cons( link_slot, $list52 ) ), $list210 ), ConsesLow.list(
                          $sym105$CSETQ, $sym198$OBJECT, reader.bq_cons( link_slot, $list52 ) ) ) ), ConsesLow.list( $sym202$PUNLESS, $sym211$FOUND, ConsesLow.list( $sym85$PIF, $sym177$_STRUCTURE_RESOURCING_MAKE_STATIC_,
                              ConsesLow.list( $sym105$CSETQ, $sym198$OBJECT, ConsesLow.list( make_static_func ) ), ConsesLow.list( $sym105$CSETQ, $sym198$OBJECT, ConsesLow.list( make_func ) ) ), ConsesLow.listS(
                                  $sym105$CSETQ, free_var, $list212 ) ) ), ConsesLow.list( $sym54$RET, reader.bq_cons( init_func, $list52 ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list179 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 41550L)
  public static SubLObject with_readtime_eval_disabled(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym84$CLET, $list213, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 42748L)
  public static SubLObject noting_progress(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list214 );
    string = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject str = $sym215$STR;
    return ConsesLow.listS( $sym84$CLET, ConsesLow.list( new SubLObject[] { ConsesLow.list( str, string ), $list216, $list217, $list218, $list219, $list220, $list221, $list222, ConsesLow.list( $sym223$_SILENT_PROGRESS__,
        ConsesLow.listS( $sym224$FIF, str, $list225 ) )
    } ), ConsesLow.list( $sym226$NOTING_PROGRESS_PREAMBLE, str ), ConsesLow.append( body, $list227 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 43465L)
  public static SubLObject noting_progress_delayed(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject delayed_mode_seconds = NIL;
    SubLObject string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list228 );
    delayed_mode_seconds = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list228 );
    string = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym84$CLET, ConsesLow.list( ConsesLow.list( $sym229$_NOTING_PROGRESS_DELAYED_MODE_SECONDS_, delayed_mode_seconds ), ConsesLow.list( $sym230$_NOTING_PROGRESS_DELAYED_MODE_STRING_, string ) ),
        ConsesLow.listS( $sym231$NOTING_PROGRESS, string, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 43720L)
  public static SubLObject noting_progress_preamble(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $silent_progressP$.getDynamicValue( thread ) && NIL == $noting_progress_delayed_mode_seconds$.getDynamicValue( thread ) )
    {
      if( NIL != $professional_progress_modeP$.getDynamicValue( thread ) )
      {
        PrintLow.format( StreamsLow.$standard_output$.getDynamicValue( thread ), $str232$___A, Strings.string_trim( $list233, string ) );
      }
      else
      {
        PrintLow.format( StreamsLow.$standard_output$.getDynamicValue( thread ), $str234$___A____, Strings.string_trim( $list233, string ) );
      }
      streams_high.force_output( StreamsLow.$standard_output$.getDynamicValue( thread ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 44119L)
  public static SubLObject noting_progress_postamble()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $silent_progressP$.getDynamicValue( thread ) )
    {
      final SubLObject elapsed = subl_promotions.elapsed_universal_time( $progress_start_time$.getDynamicValue( thread ), UNPROVIDED );
      if( NIL != $noting_progress_delayed_mode_seconds$.getDynamicValue( thread ) )
      {
        if( !subl_promotions.elapsed_universal_time( $progress_last_pacification_time$.getDynamicValue( thread ), UNPROVIDED ).numGE( $noting_progress_delayed_mode_seconds$.getDynamicValue( thread ) ) )
        {
          return NIL;
        }
        $noting_progress_delayed_mode_seconds$.setDynamicValue( NIL, thread );
        noting_progress_preamble( $noting_progress_delayed_mode_string$.getDynamicValue( thread ) );
      }
      if( NIL != $professional_progress_modeP$.getDynamicValue( thread ) )
      {
        streams_high.write_string( $str236$__, StreamsLow.$standard_output$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
      }
      else
      {
        streams_high.write_string( $str237$_DONE__, StreamsLow.$standard_output$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
      }
      streams_high.write_string( numeric_date_utilities.elapsed_time_abbreviation_string( elapsed ), StreamsLow.$standard_output$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
      if( elapsed.numG( $int238$600 ) )
      {
        PrintLow.format( StreamsLow.$standard_output$.getDynamicValue( thread ), $str239$__ended__A, numeric_date_utilities.time_abbreviation_string( UNPROVIDED ) );
      }
      streams_high.write_string( $str240$_, StreamsLow.$standard_output$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
      streams_high.terpri( StreamsLow.$standard_output$.getDynamicValue( thread ) );
      streams_high.force_output( StreamsLow.$standard_output$.getDynamicValue( thread ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 45061L)
  public static SubLObject note_progress()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $is_noting_progressP$.getDynamicValue( thread ) && NIL == $silent_progressP$.getDynamicValue( thread ) )
    {
      $progress_count$.setDynamicValue( Numbers.add( $progress_count$.getDynamicValue( thread ), ONE_INTEGER ), thread );
      final SubLObject elapsed = subl_promotions.elapsed_universal_time( $progress_last_pacification_time$.getDynamicValue( thread ), UNPROVIDED );
      if( !elapsed.numLE( $progress_elapsed_seconds_for_notification$.getDynamicValue( thread ) ) && ( !$noting_progress_delayed_mode_seconds$.getDynamicValue( thread ).isNumber() || !elapsed.numLE(
          $noting_progress_delayed_mode_seconds$.getDynamicValue( thread ) ) || NIL != $silent_progressP$.getDynamicValue( thread ) ) )
      {
        if( NIL != $noting_progress_delayed_mode_seconds$.getDynamicValue( thread ) )
        {
          $noting_progress_delayed_mode_seconds$.setDynamicValue( NIL, thread );
          noting_progress_preamble( $noting_progress_delayed_mode_string$.getDynamicValue( thread ) );
        }
        $progress_notification_count$.setDynamicValue( Numbers.add( $progress_notification_count$.getDynamicValue( thread ), ONE_INTEGER ), thread );
        if( $int242$50.eql( $progress_notification_count$.getDynamicValue( thread ) ) )
        {
          $progress_elapsed_seconds_for_notification$.setDynamicValue( FIVE_INTEGER, thread );
        }
        else if( $int20$100.eql( $progress_notification_count$.getDynamicValue( thread ) ) )
        {
          $progress_elapsed_seconds_for_notification$.setDynamicValue( FIFTEEN_INTEGER, thread );
        }
        else if( $int243$200.eql( $progress_notification_count$.getDynamicValue( thread ) ) )
        {
          $progress_elapsed_seconds_for_notification$.setDynamicValue( $int244$30, thread );
        }
        $progress_pacifications_since_last_nl$.setDynamicValue( Numbers.add( $progress_pacifications_since_last_nl$.getDynamicValue( thread ), ONE_INTEGER ), thread );
        if( $progress_pacifications_since_last_nl$.getDynamicValue( thread ).numG( $int245$25 ) )
        {
          $progress_pacifications_since_last_nl$.setDynamicValue( ZERO_INTEGER, thread );
          PrintLow.format( StreamsLow.$standard_output$.getDynamicValue( thread ), $str246$__A_, $progress_count$.getDynamicValue( thread ) );
          streams_high.terpri( StreamsLow.$standard_output$.getDynamicValue( thread ) );
        }
        else
        {
          PrintLow.format( StreamsLow.$standard_output$.getDynamicValue( thread ), $str247$_ );
        }
        streams_high.force_output( StreamsLow.$standard_output$.getDynamicValue( thread ) );
        $progress_last_pacification_time$.setDynamicValue( Time.get_universal_time(), thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 46679L)
  public static SubLObject noting_activity(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list214 );
    string = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym3$PROGN, ConsesLow.list( $sym248$IGNORE, string ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 47408L)
  public static SubLObject noting_percent_progress(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list214 );
    string = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym84$CLET, $list249, ConsesLow.listS( $sym164$CUNWIND_PROTECT, ConsesLow.listS( $sym3$PROGN, ConsesLow.list( $sym250$NOTING_PERCENT_PROGRESS_PREAMBLE, string ), ConsesLow.append( body,
        NIL ) ), $list251 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 47809L)
  public static SubLObject noting_percent_progress_delayed(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject delayed_mode_seconds = NIL;
    SubLObject string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list228 );
    delayed_mode_seconds = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list228 );
    string = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym84$CLET, ConsesLow.list( ConsesLow.list( $sym252$_PERCENT_PROGRESS_DELAYED_MODE_SECONDS_, delayed_mode_seconds ), ConsesLow.list( $sym253$_PERCENT_PROGRESS_DELAYED_MODE_STRING_, string ) ),
        ConsesLow.listS( $sym254$NOTING_PERCENT_PROGRESS, string, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 48089L)
  public static SubLObject noting_percent_progress_preamble(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $silent_progressP$.getDynamicValue( thread ) && NIL == $percent_progress_delayed_mode_seconds$.getDynamicValue( thread ) )
    {
      PrintLow.format( StreamsLow.$standard_output$.getDynamicValue( thread ), $str232$___A, Strings.string_trim( $list233, string ) );
      streams_high.force_output( StreamsLow.$standard_output$.getDynamicValue( thread ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 48389L)
  public static SubLObject noting_percent_progress_postamble()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $silent_progressP$.getDynamicValue( thread ) && NIL == $percent_progress_delayed_mode_seconds$.getDynamicValue( thread ) )
    {
      final SubLObject elapsed = subl_promotions.elapsed_universal_time( $percent_progress_start_time$.getDynamicValue( thread ), UNPROVIDED );
      if( ZERO_INTEGER.eql( $last_percent_progress_index$.getDynamicValue( thread ) ) && NIL == $professional_progress_modeP$.getDynamicValue( thread ) )
      {
        streams_high.write_string( $str256$____, StreamsLow.$standard_output$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
      }
      if( NIL != $professional_progress_modeP$.getDynamicValue( thread ) )
      {
        streams_high.write_string( $str236$__, StreamsLow.$standard_output$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
      }
      else
      {
        streams_high.write_string( $str237$_DONE__, StreamsLow.$standard_output$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
      }
      streams_high.write_string( numeric_date_utilities.elapsed_time_abbreviation_string( elapsed ), StreamsLow.$standard_output$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
      if( elapsed.numG( $int238$600 ) )
      {
        PrintLow.format( StreamsLow.$standard_output$.getDynamicValue( thread ), $str239$__ended__A, numeric_date_utilities.time_abbreviation_string( UNPROVIDED ) );
      }
      streams_high.write_string( $str240$_, StreamsLow.$standard_output$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
      if( !ZERO_INTEGER.eql( $last_percent_progress_index$.getDynamicValue( thread ) ) )
      {
        streams_high.write_string( $str257$__, StreamsLow.$standard_output$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
      }
      streams_high.terpri( StreamsLow.$standard_output$.getDynamicValue( thread ) );
      streams_high.force_output( StreamsLow.$standard_output$.getDynamicValue( thread ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 49578L)
  public static SubLObject note_percent_progress(final SubLObject index, final SubLObject max)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $silent_progressP$.getDynamicValue( thread ) && NIL != $within_noting_percent_progress$.getDynamicValue( thread ) && NIL != index )
    {
      SubLObject elapsed = NIL;
      if( $percent_progress_delayed_mode_seconds$.getDynamicValue( thread ).isNumber() )
      {
        if( NIL == elapsed )
        {
          elapsed = subl_promotions.elapsed_universal_time( $percent_progress_start_time$.getDynamicValue( thread ), UNPROVIDED );
        }
        if( elapsed.numGE( $percent_progress_delayed_mode_seconds$.getDynamicValue( thread ) ) )
        {
          $percent_progress_delayed_mode_seconds$.setDynamicValue( NIL, thread );
          noting_percent_progress_preamble( $percent_progress_delayed_mode_string$.getDynamicValue( thread ) );
        }
      }
      if( !$percent_progress_delayed_mode_seconds$.getDynamicValue( thread ).isNumber() )
      {
        final SubLObject percent = compute_percent_progress( index, max );
        if( percent.numG( $last_percent_progress_index$.getDynamicValue( thread ) ) )
        {
          if( NIL == elapsed )
          {
            elapsed = subl_promotions.elapsed_universal_time( $percent_progress_start_time$.getDynamicValue( thread ), UNPROVIDED );
          }
          if( !elapsed.numLE( $suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ) ) )
          {
            if( ZERO_INTEGER.eql( $last_percent_progress_index$.getDynamicValue( thread ) ) )
            {
              if( NIL == $professional_progress_modeP$.getDynamicValue( thread ) )
              {
                streams_high.terpri( StreamsLow.$standard_output$.getDynamicValue( thread ) );
              }
              streams_high.write_string( $str259$__, StreamsLow.$standard_output$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
              streams_high.force_output( StreamsLow.$standard_output$.getDynamicValue( thread ) );
            }
            final SubLObject predicted_total_seconds = Numbers.truncate( Numbers.multiply( elapsed, $int20$100 ), percent );
            if( ( percent.numE( ONE_INTEGER ) || index.numE( ONE_INTEGER ) ) && predicted_total_seconds.numGE( Numbers.multiply( FIVE_INTEGER, numeric_date_utilities.$seconds_in_a_minute$.getGlobalValue() ) ) )
            {
              if( NIL != $professional_progress_modeP$.getDynamicValue( thread ) )
              {
                streams_high.terpri( StreamsLow.$standard_output$.getDynamicValue( thread ) );
                streams_high.write_string( $str260$__, StreamsLow.$standard_output$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
              }
              streams_high.write_string( $str261$01_, StreamsLow.$standard_output$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
              possibly_note_percent_progress_prediction( elapsed, predicted_total_seconds, $int262$300, $int238$600 );
            }
            else if( ( percent.numE( TWO_INTEGER ) || index.numE( TWO_INTEGER ) ) && predicted_total_seconds.numGE( Numbers.multiply( TEN_INTEGER, numeric_date_utilities.$seconds_in_a_minute$.getGlobalValue() ) ) )
            {
              streams_high.write_string( $str263$02_, StreamsLow.$standard_output$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
              possibly_note_percent_progress_prediction( elapsed, predicted_total_seconds, $int262$300, $int238$600 );
            }
            else if( !predicted_total_seconds.numLE( TWO_INTEGER ) )
            {
              if( max.numL( TEN_INTEGER ) )
              {
                print_progress_percent( percent );
              }
              else if( !predicted_total_seconds.numLE( FIVE_INTEGER ) )
              {
                if( Numbers.mod( percent, TEN_INTEGER ).numE( ZERO_INTEGER ) )
                {
                  print_progress_percent( percent );
                  possibly_note_percent_progress_prediction( elapsed, predicted_total_seconds, $int238$600, $int264$1200 );
                }
                else if( max.numL( $int244$30 ) )
                {
                  if( Numbers.mod( index, Numbers.ash( max, $int265$_2 ) ).numE( ZERO_INTEGER ) )
                  {
                    print_progress_percent( percent );
                  }
                  else
                  {
                    streams_high.write_string( $str247$_, StreamsLow.$standard_output$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
                  }
                }
                else if( !predicted_total_seconds.numLE( TWENTY_INTEGER ) )
                {
                  if( Numbers.mod( percent, TWO_INTEGER ).numE( ZERO_INTEGER ) )
                  {
                    streams_high.write_string( $str247$_, StreamsLow.$standard_output$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
                  }
                  if( $last_percent_progress_prediction$.getDynamicValue( thread ).isNumber() )
                  {
                    final SubLObject threshold = Numbers.add( $last_percent_progress_prediction$.getDynamicValue( thread ), Numbers.integerDivide( $last_percent_progress_prediction$.getDynamicValue( thread ),
                        TEN_INTEGER ) );
                    if( predicted_total_seconds.numG( threshold ) )
                    {
                      print_progress_percent( percent );
                      possibly_note_percent_progress_prediction( elapsed, predicted_total_seconds, threshold, $int264$1200 );
                    }
                  }
                }
              }
            }
            streams_high.force_output( StreamsLow.$standard_output$.getDynamicValue( thread ) );
            $last_percent_progress_index$.setDynamicValue( percent, thread );
          }
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 52968L)
  public static SubLObject print_progress_percent(final SubLObject percent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    streams_high.write_string( $str266$_, StreamsLow.$standard_output$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
    print_2_digit_nonnegative_integer( percent, StreamsLow.$standard_output$.getDynamicValue( thread ) );
    streams_high.write_string( $str267$_, StreamsLow.$standard_output$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 53285L)
  public static SubLObject print_2_digit_nonnegative_integer(final SubLObject integer, final SubLObject stream)
  {
    if( integer.numL( TEN_INTEGER ) )
    {
      streams_high.write_string( $str268$0, stream, UNPROVIDED, UNPROVIDED );
    }
    streams_high.write_string( print_high.princ_to_string( integer ), stream, UNPROVIDED, UNPROVIDED );
    return integer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 53477L)
  public static SubLObject possibly_note_percent_progress_prediction(final SubLObject elapsed, final SubLObject predicted_total_seconds, final SubLObject threshhold, SubLObject show_ending_threshold)
  {
    if( show_ending_threshold == UNPROVIDED )
    {
      show_ending_threshold = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( predicted_total_seconds.numG( threshhold ) && predicted_total_seconds.numG( elapsed ) )
    {
      final SubLObject note_string = Sequences.cconcatenate( $str236$__, new SubLObject[] { format_nil.format_nil_a_no_copy( numeric_date_utilities.elapsed_time_abbreviation_string( elapsed ) ), $str269$_of_,
        format_nil.$format_nil_tilde$.getGlobalValue(), format_nil.format_nil_a_no_copy( numeric_date_utilities.elapsed_time_abbreviation_string( predicted_total_seconds ) )
      } );
      streams_high.write_string( note_string, StreamsLow.$standard_output$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
      if( show_ending_threshold.isInteger() && predicted_total_seconds.numG( show_ending_threshold ) )
      {
        streams_high.write_string( $str270$__ending__, StreamsLow.$standard_output$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
        streams_high.write_string( numeric_date_utilities.time_abbreviation_string( Numbers.add( $percent_progress_start_time$.getDynamicValue( thread ), predicted_total_seconds ) ), StreamsLow.$standard_output$
            .getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
      }
      streams_high.write_string( $str240$_, StreamsLow.$standard_output$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
      streams_high.terpri( StreamsLow.$standard_output$.getDynamicValue( thread ) );
      streams_high.write_string( $str260$__, StreamsLow.$standard_output$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
      $last_percent_progress_prediction$.setDynamicValue( predicted_total_seconds, thread );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 54454L)
  public static SubLObject compute_percent_progress(SubLObject index, SubLObject max)
  {
    if( max.numLE( ZERO_INTEGER ) || index.numLE( ZERO_INTEGER ) )
    {
      return ZERO_INTEGER;
    }
    if( index.numGE( max ) )
    {
      return $int20$100;
    }
    final SubLObject target_length = TEN_INTEGER;
    final SubLObject current_length = Numbers.integer_length( max );
    final SubLObject scale_factor = Numbers.subtract( target_length, current_length );
    if( scale_factor.isNegative() )
    {
      index = Numbers.ash( index, scale_factor );
      max = Numbers.ash( max, scale_factor );
    }
    return Numbers.min( $int271$99, Numbers.integerDivide( Numbers.multiply( $int20$100, index ), max ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 55382L)
  public static SubLObject progress()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject current = Time.get_universal_time();
    PrintLow.format( T, $str273$___A____D_of__D___02D___Done_at__, new SubLObject[] { $progress_note$.getDynamicValue( thread ), $progress_sofar$.getDynamicValue( thread ), $progress_total$.getDynamicValue( thread ),
      Numbers.integerDivide( Numbers.multiply( $progress_sofar$.getDynamicValue( thread ), $int20$100 ), $progress_total$.getDynamicValue( thread ) ), $progress_sofar$.getDynamicValue( thread ).numE( ZERO_INTEGER )
          ? $str274$whenever
          : numeric_date_utilities.timestring( Numbers.add( $progress_start_time$.getDynamicValue( thread ), Numbers.integerDivide( Numbers.multiply( $progress_total$.getDynamicValue( thread ), Numbers.subtract( current,
              $progress_start_time$.getDynamicValue( thread ) ) ), $progress_sofar$.getDynamicValue( thread ) ) ) )
    } );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 55820L)
  public static SubLObject progress_cdotimes(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list275 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject total = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list275 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list275 );
    total = current.first();
    current = current.rest();
    final SubLObject message = current.isCons() ? current.first() : $str276$cdotimes;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list275 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym3$PROGN, ConsesLow.list( $sym84$CLET, ConsesLow.listS( ConsesLow.list( $sym277$_PROGRESS_NOTE_, message ), $list216, ConsesLow.list( $sym278$_PROGRESS_TOTAL_, total ), $list279 ),
          ConsesLow.list( $sym254$NOTING_PERCENT_PROGRESS, $sym277$_PROGRESS_NOTE_, ConsesLow.listS( $sym280$CDOTIMES, reader.bq_cons( var, $list281 ), ConsesLow.append( body, $list282 ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list275 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 56247L)
  public static SubLObject progress_csome(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list283 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject list = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list283 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list283 );
    list = current.first();
    current = current.rest();
    final SubLObject message = current.isCons() ? current.first() : $str284$cdolist;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list283 );
    current = current.rest();
    final SubLObject endvar = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list283 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject list_var = $sym285$LIST_VAR;
      return ConsesLow.list( $sym84$CLET, ConsesLow.listS( ConsesLow.list( list_var, list ), ConsesLow.list( $sym277$_PROGRESS_NOTE_, ConsesLow.listS( $sym224$FIF, message, message, $list286 ) ), $list216, ConsesLow
          .list( $sym278$_PROGRESS_TOTAL_, ConsesLow.list( $sym287$LENGTH, list_var ) ), $list279 ), ConsesLow.list( $sym254$NOTING_PERCENT_PROGRESS, $sym277$_PROGRESS_NOTE_, ConsesLow.listS( $sym288$CSOME, ConsesLow
              .list( var, list_var, endvar ), ConsesLow.append( body, $list282 ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list283 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 56760L)
  public static SubLObject progress_cdolist(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list290 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject list = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list290 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list290 );
    list = current.first();
    current = current.rest();
    final SubLObject message = current.isCons() ? current.first() : $str284$cdolist;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list290 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym291$PROGRESS_CSOME, ConsesLow.list( var, list, message ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list290 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 56910L)
  public static SubLObject possibly_progress_cdolist(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list292 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject list = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list292 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list292 );
    list = current.first();
    current = current.rest();
    final SubLObject message = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list292 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject message_var = $sym293$MESSAGE_VAR;
      return ConsesLow.list( $sym84$CLET, ConsesLow.list( ConsesLow.list( message_var, message ) ), ConsesLow.list( $sym85$PIF, message_var, ConsesLow.listS( $sym289$PROGRESS_CDOLIST, ConsesLow.list( var, list,
          message ), ConsesLow.append( body, NIL ) ), ConsesLow.listS( $sym294$CDOLIST, ConsesLow.list( var, list ), ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list292 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 57282L)
  public static SubLObject progress_cdohash(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list295 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject key = NIL;
    SubLObject val = NIL;
    SubLObject table = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list295 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list295 );
    val = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list295 );
    table = current.first();
    current = current.rest();
    final SubLObject message = current.isCons() ? current.first() : $str296$cdohash;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list295 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject table_var = $sym297$TABLE_VAR;
      return ConsesLow.list( $sym84$CLET, ConsesLow.listS( ConsesLow.list( table_var, table ), ConsesLow.list( $sym277$_PROGRESS_NOTE_, message ), $list216, ConsesLow.list( $sym278$_PROGRESS_TOTAL_, ConsesLow.list(
          $sym298$HASH_TABLE_COUNT, table_var ) ), $list279 ), ConsesLow.list( $sym254$NOTING_PERCENT_PROGRESS, $sym277$_PROGRESS_NOTE_, ConsesLow.listS( $sym299$CDOHASH, ConsesLow.list( key, val, table_var ), ConsesLow
              .append( body, $list282 ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list295 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 57777L)
  public static SubLObject progress_do_set(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list300 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject elem = NIL;
    SubLObject v_set = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list300 );
    elem = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list300 );
    v_set = current.first();
    current = current.rest();
    final SubLObject message = current.isCons() ? current.first() : $str301$do_set;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list300 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject set_var = $sym302$SET_VAR;
      return ConsesLow.list( $sym84$CLET, ConsesLow.listS( ConsesLow.list( set_var, v_set ), ConsesLow.list( $sym277$_PROGRESS_NOTE_, message ), $list216, ConsesLow.list( $sym278$_PROGRESS_TOTAL_, ConsesLow.list(
          $sym303$SET_SIZE, set_var ) ), $list279 ), ConsesLow.list( $sym254$NOTING_PERCENT_PROGRESS, $sym277$_PROGRESS_NOTE_, ConsesLow.listS( $sym304$DO_SET, ConsesLow.list( elem, set_var ), ConsesLow.append( body,
              $list282 ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list300 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 58242L)
  public static SubLObject noting_elapsed_time(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list305 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$8 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list305 );
      current_$8 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list305 );
      if( NIL == conses_high.member( current_$8, $list306, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$8 == $kw91$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list305 );
    }
    final SubLObject message_tail = cdestructuring_bind.property_list_member( $kw307$MESSAGE, current );
    final SubLObject message = ( NIL != message_tail ) ? conses_high.cadr( message_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject message_var = $sym308$MESSAGE_VAR;
    final SubLObject start_time = $sym309$START_TIME;
    return ConsesLow.listS( $sym84$CLET, ConsesLow.list( ConsesLow.list( message_var, message ), ConsesLow.list( start_time, ConsesLow.list( $sym310$NOTING_ELAPSED_TIME_PREAMBLE, message_var ) ) ), ConsesLow.append(
        body, ConsesLow.list( ConsesLow.list( $sym311$NOTING_ELAPSED_TIME_POSTAMBLE, message_var, start_time ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 58595L)
  public static SubLObject noting_elapsed_time_preamble(final SubLObject message)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $silent_progressP$.getDynamicValue( thread ) && NIL != message )
    {
      final SubLObject start_time = Time.get_universal_time();
      PrintLow.format( StreamsLow.$standard_output$.getDynamicValue( thread ), $str313$___A_started__at__A, message, numeric_date_utilities.timestring( start_time ) );
      streams_high.force_output( StreamsLow.$standard_output$.getDynamicValue( thread ) );
      return start_time;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 58938L)
  public static SubLObject noting_elapsed_time_postamble(final SubLObject message, final SubLObject start_time)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $silent_progressP$.getDynamicValue( thread ) && NIL != message )
    {
      final SubLObject end_time = Time.get_universal_time();
      PrintLow.format( StreamsLow.$standard_output$.getDynamicValue( thread ), $str314$___A_finished_at__A_after_A, new SubLObject[] { message, numeric_date_utilities.timestring( end_time ), numeric_date_utilities
          .elapsed_seconds_string( Numbers.subtract( end_time, start_time ) )
      } );
      streams_high.force_output( StreamsLow.$standard_output$.getDynamicValue( thread ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 59330L)
  public static SubLObject with_cyc_server_handling(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym315$WITH_SUBLISP_ERROR_HANDLING, ConsesLow.list( $sym84$CLET, $list316, ConsesLow.listS( $sym164$CUNWIND_PROTECT, ConsesLow.list( $sym3$PROGN, $list317, reader.bq_cons( $sym3$PROGN,
        ConsesLow.append( body, NIL ) ) ), $list318 ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 60042L)
  public static SubLObject with_cyc_io_syntax(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return with_cyc_io_syntax_internal( body );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 60415L)
  public static SubLObject with_cyc_io_syntax_internal(final SubLObject body)
  {
    return ConsesLow.listS( $sym84$CLET, $list319, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 60598L)
  public static SubLObject with_sublisp_runtime_assumptions(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym320$WITH_CYC_SERVER_HANDLING, ConsesLow.list( $sym321$WITH_CYC_IO_SYNTAX, ConsesLow.listS( $sym84$CLET, $list322, ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 60981L)
  public static SubLObject with_the_cyclist(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list323 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject cyclist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list323 );
    cyclist = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject old_cyclist = $sym324$OLD_CYCLIST;
      return ConsesLow.list( $sym84$CLET, ConsesLow.list( reader.bq_cons( old_cyclist, $list325 ) ), ConsesLow.list( $sym164$CUNWIND_PROTECT, ConsesLow.listS( $sym3$PROGN, ConsesLow.list( $sym326$SET_THE_CYCLIST,
          cyclist ), ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym326$SET_THE_CYCLIST, old_cyclist ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list323 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 61556L)
  public static SubLObject with_different_cyclist(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list323 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject cyclist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list323 );
    cyclist = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym84$CLET, $list327, ConsesLow.list( $sym326$SET_THE_CYCLIST, cyclist ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list323 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 61852L)
  public static SubLObject do_bindings(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject el_variables = NIL;
    SubLObject v_bindings = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list328 );
    el_variables = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list328 );
    v_bindings = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject binding = $sym329$BINDING;
    final SubLObject var_specs = do_bindings_var_specs( el_variables, binding );
    return ConsesLow.list( $sym294$CDOLIST, ConsesLow.list( binding, v_bindings ), ConsesLow.listS( $sym84$CLET, ConsesLow.append( var_specs, NIL ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 62271L)
  public static SubLObject do_bindings_var_specs(final SubLObject el_variables, final SubLObject iteration_var)
  {
    SubLObject var_specs = NIL;
    SubLObject cdolist_list_var = el_variables;
    SubLObject el_variable = NIL;
    el_variable = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject local_var = NIL;
      SubLObject binding_var = NIL;
      if( el_variable.isCons() )
      {
        local_var = el_variable.first();
        binding_var = conses_high.second( el_variable );
      }
      else
      {
        local_var = el_variable;
        binding_var = el_variable;
      }
      var_specs = ConsesLow.cons( ConsesLow.list( local_var, ConsesLow.list( $sym330$SUBLIS, iteration_var, ConsesLow.list( $sym6$QUOTE, binding_var ) ) ), var_specs );
      cdolist_list_var = cdolist_list_var.rest();
      el_variable = cdolist_list_var.first();
    }
    return Sequences.nreverse( var_specs );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 63271L)
  public static SubLObject fast_singleton_macro_p(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject list = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list334 );
    list = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym335$NULL, ConsesLow.list( $sym336$CDR, list ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list334 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 64477L)
  public static SubLObject pluralityP(final SubLObject list)
  {
    return makeBoolean( list.isCons() && list.rest().isCons() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 64916L)
  public static SubLObject fast_plurality_macro_p(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject list = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list334 );
    list = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym337$CONSP, ConsesLow.list( $sym336$CDR, list ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list334 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 65482L)
  public static SubLObject cdosublists(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list338 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject list_expression = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list338 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list338 );
    list_expression = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      if( !var.isSymbol() )
      {
        Errors.error( $util_var_error_format_string$.getDynamicValue( thread ), $sym339$CDOSUBLISTS, var );
      }
      return ConsesLow.listS( $sym208$CDO, ConsesLow.list( ConsesLow.list( var, list_expression, ConsesLow.list( $sym336$CDR, var ) ) ), ConsesLow.list( ConsesLow.list( $sym335$NULL, var ) ), body );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list338 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 66384L)
  public static SubLObject cdolist_and_sublists(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list340 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject element_var = NIL;
    SubLObject sublist_var = NIL;
    SubLObject list_expression = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list340 );
    element_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list340 );
    sublist_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list340 );
    list_expression = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      if( !element_var.isSymbol() )
      {
        Errors.error( $util_var_error_format_string$.getDynamicValue( thread ), $sym341$CDOLIST_AND_SUBLISTS, element_var );
      }
      if( !sublist_var.isSymbol() )
      {
        Errors.error( $util_var_error_format_string$.getDynamicValue( thread ), $sym341$CDOLIST_AND_SUBLISTS, sublist_var );
      }
      return ConsesLow.listS( $sym208$CDO, ConsesLow.list( ConsesLow.list( sublist_var, list_expression, ConsesLow.list( $sym336$CDR, sublist_var ) ), ConsesLow.list( element_var, ConsesLow.list( $sym100$CAR,
          sublist_var ), ConsesLow.list( $sym100$CAR, sublist_var ) ) ), ConsesLow.list( ConsesLow.list( $sym335$NULL, sublist_var ) ), body );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list340 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 67834L)
  public static SubLObject cdolist_and_sublists_carefully(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list340 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject element_var = NIL;
    SubLObject sublist_var = NIL;
    SubLObject list_expression = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list340 );
    element_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list340 );
    sublist_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list340 );
    list_expression = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      if( !element_var.isSymbol() )
      {
        Errors.error( $util_var_error_format_string$.getDynamicValue( thread ), $sym341$CDOLIST_AND_SUBLISTS, element_var );
      }
      if( !sublist_var.isSymbol() )
      {
        Errors.error( $util_var_error_format_string$.getDynamicValue( thread ), $sym341$CDOLIST_AND_SUBLISTS, sublist_var );
      }
      final SubLObject next_cons_var = Symbols.make_symbol( $str342$next_cons_var );
      return ConsesLow.list( $sym84$CLET, ConsesLow.list( next_cons_var ), ConsesLow.listS( $sym208$CDO, ConsesLow.list( ConsesLow.list( sublist_var, list_expression, next_cons_var ), ConsesLow.list( element_var,
          ConsesLow.list( $sym100$CAR, sublist_var ), ConsesLow.list( $sym100$CAR, sublist_var ) ) ), ConsesLow.list( ConsesLow.list( $sym335$NULL, sublist_var ) ), ConsesLow.list( $sym105$CSETQ, next_cons_var, ConsesLow
              .list( $sym336$CDR, sublist_var ) ), body ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list340 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 69114L)
  public static SubLObject cdo_possibly_dotted_list(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list343 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject element_var = NIL;
    SubLObject list_expression = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list343 );
    element_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list343 );
    list_expression = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject sublist_var = Symbols.make_symbol( $str344$sublist );
      return ConsesLow.list( $sym84$CLET, ConsesLow.list( reader.bq_cons( element_var, $list212 ), ConsesLow.list( sublist_var, list_expression ) ), ConsesLow.listS( $sym345$WHILE, ConsesLow.list( $sym337$CONSP,
          sublist_var ), ConsesLow.list( $sym105$CSETQ, element_var, ConsesLow.list( $sym100$CAR, sublist_var ) ), ConsesLow.append( body, ConsesLow.list( ConsesLow.list( $sym105$CSETQ, sublist_var, ConsesLow.list(
              $sym336$CDR, sublist_var ) ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list343 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 69865L)
  public static SubLObject cdolist_if(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list346 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject predicate = NIL;
    SubLObject list_expression = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list346 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list346 );
    predicate = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list346 );
    list_expression = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      if( !var.isSymbol() )
      {
        Errors.error( $util_var_error_format_string$.getDynamicValue( thread ), $sym347$CDOLIST_IF, var );
      }
      if( !var.isSymbol() )
      {
        Errors.error( $util_func_error_format_string$.getDynamicValue( thread ), $sym347$CDOLIST_IF, predicate );
      }
      return ConsesLow.list( $sym294$CDOLIST, ConsesLow.list( var, list_expression ), ConsesLow.listS( $sym37$PWHEN, ConsesLow.list( predicate, var ), body ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list346 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 70873L)
  public static SubLObject cdosublists_if(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list346 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject predicate = NIL;
    SubLObject list_expression = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list346 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list346 );
    predicate = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list346 );
    list_expression = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      if( !var.isSymbol() )
      {
        Errors.error( $util_var_error_format_string$.getDynamicValue( thread ), $sym348$CDOSUBLISTS_IF, var );
      }
      if( !var.isSymbol() )
      {
        Errors.error( $util_func_error_format_string$.getDynamicValue( thread ), $sym348$CDOSUBLISTS_IF, predicate );
      }
      return ConsesLow.list( $sym208$CDO, ConsesLow.list( ConsesLow.list( var, list_expression, ConsesLow.list( $sym336$CDR, var ) ) ), ConsesLow.list( ConsesLow.list( $sym335$NULL, var ) ), ConsesLow.listS(
          $sym37$PWHEN, ConsesLow.list( predicate, var ), body ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list346 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 72143L)
  public static SubLObject cdolist_if_not(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list346 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject predicate = NIL;
    SubLObject list_expression = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list346 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list346 );
    predicate = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list346 );
    list_expression = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      if( !var.isSymbol() )
      {
        Errors.error( $util_var_error_format_string$.getDynamicValue( thread ), $sym349$CDOLIST_IF_NOT, var );
      }
      if( !var.isSymbol() )
      {
        Errors.error( $util_func_error_format_string$.getDynamicValue( thread ), $sym349$CDOLIST_IF_NOT, predicate );
      }
      return ConsesLow.list( $sym294$CDOLIST, ConsesLow.list( var, list_expression ), ConsesLow.listS( $sym202$PUNLESS, ConsesLow.list( predicate, var ), body ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list346 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 73173L)
  public static SubLObject cdosublists_if_not(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list346 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject predicate = NIL;
    SubLObject list_expression = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list346 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list346 );
    predicate = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list346 );
    list_expression = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      if( !var.isSymbol() )
      {
        Errors.error( $util_var_error_format_string$.getDynamicValue( thread ), $sym350$CDOSUBLISTS_IF_NOT, var );
      }
      if( !var.isSymbol() )
      {
        Errors.error( $util_func_error_format_string$.getDynamicValue( thread ), $sym350$CDOSUBLISTS_IF_NOT, predicate );
      }
      return ConsesLow.list( $sym208$CDO, ConsesLow.list( ConsesLow.list( var, list_expression, ConsesLow.list( $sym336$CDR, var ) ) ), ConsesLow.list( ConsesLow.list( $sym335$NULL, var ) ), ConsesLow.listS(
          $sym202$PUNLESS, ConsesLow.list( predicate, var ), body ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list346 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 74286L)
  public static SubLObject cdo2lists(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list351 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var1 = NIL;
    SubLObject list1 = NIL;
    SubLObject var2 = NIL;
    SubLObject list2 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list351 );
    var1 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list351 );
    list1 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list351 );
    var2 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list351 );
    list2 = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject sublist1_var = Symbols.make_symbol( $str352$sublist1 );
      final SubLObject sublist2_var = Symbols.make_symbol( $str353$sublist2 );
      return ConsesLow.list( $sym84$CLET, ConsesLow.list( ConsesLow.list( sublist1_var, list1 ), ConsesLow.list( sublist2_var, list2 ), var1, var2 ), ConsesLow.listS( $sym345$WHILE, ConsesLow.list( $sym200$CAND,
          sublist1_var, sublist2_var ), ConsesLow.list( $sym105$CSETQ, var1, ConsesLow.list( $sym100$CAR, sublist1_var ), var2, ConsesLow.list( $sym100$CAR, sublist2_var ) ), ConsesLow.append( body, ConsesLow.list(
              ConsesLow.list( $sym105$CSETQ, sublist1_var, ConsesLow.list( $sym336$CDR, sublist1_var ), sublist2_var, ConsesLow.list( $sym336$CDR, sublist2_var ) ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list351 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 74748L)
  public static SubLObject cdotree(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list354 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject tree = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list354 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list354 );
    tree = current.first();
    current = current.rest();
    final SubLObject search_type = current.isCons() ? current.first() : $kw355$DEPTH_FIRST;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list354 );
    current = current.rest();
    final SubLObject visit_nils = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list354 );
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list354 );
      return NIL;
    }
    final SubLObject body;
    current = ( body = temp );
    if( !var.isSymbol() )
    {
      Errors.error( $util_var_error_format_string$.getDynamicValue( thread ), $sym356$CDOTREE, var );
    }
    if( search_type != $kw355$DEPTH_FIRST && search_type != $kw357$BREADTH_FIRST )
    {
      Errors.error( $util_search_type_error_format_string$.getDynamicValue( thread ), $sym356$CDOTREE, search_type );
    }
    final SubLObject tree_var = Symbols.make_symbol( $str358$tree_var );
    final SubLObject cells_var = Symbols.make_symbol( $str359$cells_var );
    if( search_type == $kw357$BREADTH_FIRST )
    {
      final SubLObject tail_of_cells_var = Symbols.make_symbol( $str360$tail_of_cells );
      return ConsesLow.list( $sym84$CLET, ConsesLow.list( ConsesLow.list( tree_var, tree ) ), ConsesLow.list( $sym37$PWHEN, tree_var, ConsesLow.list( $sym84$CLET, ConsesLow.list( ConsesLow.list( cells_var, ConsesLow
          .list( $sym361$LIST, tree_var ) ), ConsesLow.list( tail_of_cells_var, ConsesLow.list( $sym362$LAST, cells_var ) ) ), ConsesLow.list( $sym208$CDO, ConsesLow.list( ConsesLow.list( var, ConsesLow.list(
              $sym100$CAR, cells_var ), ConsesLow.list( $sym100$CAR, cells_var ) ) ), ConsesLow.list( ConsesLow.list( $sym335$NULL, cells_var ) ), ConsesLow.list( $sym85$PIF, ConsesLow.list( $sym337$CONSP, var ),
                  ConsesLow.list( $sym3$PROGN, ConsesLow.list( $sym363$RPLACD, tail_of_cells_var, ConsesLow.list( $sym361$LIST, ConsesLow.list( $sym100$CAR, var ), ConsesLow.list( $sym336$CDR, var ) ) ), ConsesLow.list(
                      $sym105$CSETQ, tail_of_cells_var, ConsesLow.list( $sym362$LAST, tail_of_cells_var ) ) ), ( NIL != visit_nils ) ? reader.bq_cons( $sym3$PROGN, body ) : ConsesLow.listS( $sym37$PWHEN, var, body ) ),
              ConsesLow.list( $sym105$CSETQ, cells_var, ConsesLow.list( $sym336$CDR, cells_var ) ) ) ) ) );
    }
    return ConsesLow.list( $sym84$CLET, ConsesLow.list( ConsesLow.list( tree_var, tree ) ), ConsesLow.list( $sym37$PWHEN, tree_var, ConsesLow.list( $sym84$CLET, ConsesLow.list( ConsesLow.list( cells_var, ConsesLow.list(
        $sym361$LIST, tree_var ) ) ), ConsesLow.list( $sym208$CDO, ConsesLow.list( ConsesLow.list( var, ConsesLow.list( $sym100$CAR, cells_var ), ConsesLow.list( $sym100$CAR, cells_var ) ) ), ConsesLow.list( ConsesLow
            .list( $sym335$NULL, cells_var ) ), ConsesLow.list( $sym105$CSETQ, cells_var, ConsesLow.list( $sym336$CDR, cells_var ) ), ConsesLow.list( $sym85$PIF, ConsesLow.list( $sym337$CONSP, var ), ConsesLow.list(
                $sym3$PROGN, ConsesLow.list( $sym364$CPUSH, ConsesLow.list( $sym336$CDR, var ), cells_var ), ConsesLow.list( $sym364$CPUSH, ConsesLow.list( $sym100$CAR, var ), cells_var ) ), ( NIL != visit_nils )
                    ? reader.bq_cons( $sym3$PROGN, body )
                    : ConsesLow.listS( $sym37$PWHEN, var, body ) ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 77493L)
  public static SubLObject cdotree_conses(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list365 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject tree = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list365 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list365 );
    tree = current.first();
    current = current.rest();
    final SubLObject search_type = current.isCons() ? current.first() : $kw355$DEPTH_FIRST;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list365 );
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list365 );
      return NIL;
    }
    final SubLObject body;
    current = ( body = temp );
    if( !var.isSymbol() )
    {
      Errors.error( $util_var_error_format_string$.getDynamicValue( thread ), $sym366$CDOTREE_CONSES, var );
    }
    if( search_type != $kw355$DEPTH_FIRST && search_type != $kw357$BREADTH_FIRST )
    {
      Errors.error( $util_search_type_error_format_string$.getDynamicValue( thread ), $sym366$CDOTREE_CONSES, search_type );
    }
    final SubLObject tree_var = Symbols.make_symbol( $str358$tree_var );
    final SubLObject cells_var = Symbols.make_symbol( $str359$cells_var );
    if( search_type == $kw357$BREADTH_FIRST )
    {
      final SubLObject tail_of_cells_var = Symbols.make_symbol( $str367$tail_of_cells_var );
      return ConsesLow.list( $sym84$CLET, ConsesLow.list( ConsesLow.list( tree_var, tree ) ), ConsesLow.list( $sym37$PWHEN, tree_var, ConsesLow.list( $sym84$CLET, ConsesLow.list( ConsesLow.list( cells_var, ConsesLow
          .list( $sym361$LIST, tree_var ) ), ConsesLow.list( tail_of_cells_var, ConsesLow.list( $sym362$LAST, cells_var ) ) ), ConsesLow.list( $sym208$CDO, ConsesLow.list( ConsesLow.list( var, ConsesLow.list(
              $sym100$CAR, cells_var ), ConsesLow.list( $sym100$CAR, cells_var ) ) ), ConsesLow.list( ConsesLow.list( $sym335$NULL, cells_var ) ), ConsesLow.listS( $sym37$PWHEN, ConsesLow.list( $sym337$CONSP, var ),
                  ConsesLow.list( $sym363$RPLACD, tail_of_cells_var, ConsesLow.list( $sym361$LIST, ConsesLow.list( $sym100$CAR, var ), ConsesLow.list( $sym336$CDR, var ) ) ), ConsesLow.list( $sym105$CSETQ,
                      tail_of_cells_var, ConsesLow.list( $sym362$LAST, tail_of_cells_var ) ), body ), ConsesLow.list( $sym105$CSETQ, cells_var, ConsesLow.list( $sym336$CDR, cells_var ) ) ) ) ) );
    }
    return ConsesLow.list( $sym84$CLET, ConsesLow.list( ConsesLow.list( tree_var, tree ) ), ConsesLow.list( $sym37$PWHEN, tree_var, ConsesLow.list( $sym84$CLET, ConsesLow.list( ConsesLow.list( cells_var, ConsesLow.list(
        $sym361$LIST, tree_var ) ) ), ConsesLow.list( $sym208$CDO, ConsesLow.list( ConsesLow.list( var, ConsesLow.list( $sym100$CAR, cells_var ), ConsesLow.list( $sym100$CAR, cells_var ) ) ), ConsesLow.list( ConsesLow
            .list( $sym335$NULL, cells_var ) ), ConsesLow.list( $sym105$CSETQ, cells_var, ConsesLow.list( $sym336$CDR, cells_var ) ), ConsesLow.listS( $sym37$PWHEN, ConsesLow.list( $sym337$CONSP, var ), ConsesLow.list(
                $sym364$CPUSH, ConsesLow.list( $sym336$CDR, var ), cells_var ), ConsesLow.list( $sym364$CPUSH, ConsesLow.list( $sym100$CAR, var ), cells_var ), body ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 79760L)
  public static SubLObject cdoplist(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list368 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject parameter = NIL;
    SubLObject value = NIL;
    SubLObject plist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list368 );
    parameter = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list368 );
    value = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list368 );
    plist = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym369$DO_PLIST, ConsesLow.list( parameter, value, plist ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list368 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 80439L)
  public static SubLObject compositize_function_call(final SubLObject path, final SubLObject var, SubLObject cars_and_cdrs_only)
  {
    if( cars_and_cdrs_only == UNPROVIDED )
    {
      cars_and_cdrs_only = NIL;
    }
    SubLObject result = var;
    SubLObject cdolist_list_var = ( NIL != cars_and_cdrs_only ) ? simplify_car_and_cdr_path( Sequences.reverse( path ) ) : Sequences.reverse( path );
    SubLObject function_symbol = NIL;
    function_symbol = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result = ConsesLow.list( function_symbol, result );
      cdolist_list_var = cdolist_list_var.rest();
      function_symbol = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 81283L)
  public static SubLObject simplify_car_and_cdr_path(final SubLObject path)
  {
    if( NIL == path )
    {
      return NIL;
    }
    if( NIL == path.rest() )
    {
      return ConsesLow.cons( path.first(), NIL );
    }
    final SubLObject first_op = path.first();
    final SubLObject second_op = conses_high.cadr( path );
    final SubLObject pcase_var = first_op;
    if( pcase_var.eql( $sym100$CAR ) )
    {
      final SubLObject pcase_var_$9 = second_op;
      if( pcase_var_$9.eql( $sym100$CAR ) )
      {
        return ConsesLow.cons( $sym370$CAAR, simplify_car_and_cdr_path( conses_high.cddr( path ) ) );
      }
      if( pcase_var_$9.eql( $sym336$CDR ) )
      {
        return ConsesLow.cons( $sym371$CDAR, simplify_car_and_cdr_path( conses_high.cddr( path ) ) );
      }
      return ConsesLow.listS( first_op, second_op, simplify_car_and_cdr_path( conses_high.cddr( path ) ) );
    }
    else
    {
      if( !pcase_var.eql( $sym336$CDR ) )
      {
        return ConsesLow.listS( first_op, second_op, simplify_car_and_cdr_path( conses_high.cddr( path ) ) );
      }
      final SubLObject pcase_var_$10 = second_op;
      if( pcase_var_$10.eql( $sym100$CAR ) )
      {
        return ConsesLow.cons( $sym372$CADR, simplify_car_and_cdr_path( conses_high.cddr( path ) ) );
      }
      if( pcase_var_$10.eql( $sym336$CDR ) )
      {
        return ConsesLow.cons( $sym373$CDDR, simplify_car_and_cdr_path( conses_high.cddr( path ) ) );
      }
      return ConsesLow.listS( first_op, second_op, simplify_car_and_cdr_path( conses_high.cddr( path ) ) );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 82565L)
  public static SubLObject map_symbols_to_accessors(final SubLObject tree, final SubLObject var, final SubLObject path)
  {
    if( NIL == tree )
    {
      return NIL;
    }
    if( tree.isSymbol() )
    {
      return ConsesLow.list( ( NIL == path ) ? ConsesLow.list( tree, var ) : ConsesLow.list( tree, compositize_function_call( path, var, T ) ) );
    }
    if( tree.isCons() )
    {
      return ConsesLow.nconc( map_symbols_to_accessors( tree.first(), var, ConsesLow.cons( $sym100$CAR, path ) ), map_symbols_to_accessors( tree.rest(), var, ConsesLow.cons( $sym336$CDR, path ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 83274L)
  public static SubLObject cdestructuring_setq(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject pattern = NIL;
    SubLObject datum_$11 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list374 );
    pattern = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list374 );
    datum_$11 = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list374 );
      return NIL;
    }
    if( pattern.isCons() || ( pattern.isSymbol() && NIL != pattern ) )
    {
      final SubLObject datum_evaluated_var = Symbols.make_symbol( $str375$datum_evaluated_var );
      return ConsesLow.list( $sym84$CLET, ConsesLow.list( ConsesLow.list( datum_evaluated_var, datum_$11 ) ), reader.bq_cons( $sym105$CSETQ, Functions.apply( Symbols.symbol_function( $sym376$NCONC ),
          map_symbols_to_accessors( pattern, datum_evaluated_var, NIL ) ) ) );
    }
    return datum_$11;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 83957L)
  public static SubLObject fast_funcall_no_value_check_args(final SubLObject function_form, final SubLObject function_name_list, final SubLObject args)
  {
    if( function_name_list.isList() )
    {
      SubLObject sublist = NIL;
      SubLObject element = NIL;
      sublist = function_name_list;
      element = sublist.first();
      while ( sublist.isCons())
      {
        if( !element.isSymbol() )
        {
          Errors.error( $str377$FAST_FUNCALL_NO_VALUE__contains_e );
        }
        if( !sublist.rest().isCons() && NIL != sublist.rest() )
        {
          Errors.error( $str378$FAST_FUNCALL_NO_VALUE__cannot_acc );
        }
        sublist = sublist.rest();
        element = sublist.first();
      }
    }
    else
    {
      Errors.error( $str379$FAST_FUNCALL_NO_VALUE__function_n );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 91607L)
  public static SubLObject fast_funcall_no_value(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject function_form = NIL;
    SubLObject function_name_list = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list380 );
    function_form = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list380 );
    function_name_list = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    fast_funcall_no_value_check_args( function_form, function_name_list, args );
    if( NIL == function_name_list )
    {
      return ConsesLow.listS( $sym381$FUNCALL, function_form, args );
    }
    final SubLObject function_form_evaluated_var = function_form.isSymbol() ? function_form : Symbols.make_symbol( $str382$function_form_evaluated_var );
    SubLObject case_list = NIL;
    SubLObject cdolist_list_var = function_name_list;
    SubLObject function_name = NIL;
    function_name = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( function_name.isSymbol() )
      {
        case_list = ConsesLow.cons( ConsesLow.list( function_name, reader.bq_cons( function_name, conses_high.copy_tree( args ) ) ), case_list );
      }
      cdolist_list_var = cdolist_list_var.rest();
      function_name = cdolist_list_var.first();
    }
    if( NIL == case_list )
    {
      return ConsesLow.listS( $sym381$FUNCALL, function_form, args );
    }
    final SubLObject body = ConsesLow.listS( $sym383$PCASE, function_form_evaluated_var, Sequences.nreverse( ConsesLow.cons( ConsesLow.list( $sym384$OTHERWISE, ConsesLow.listS( $sym381$FUNCALL,
        function_form_evaluated_var, conses_high.copy_tree( args ) ) ), case_list ) ) );
    if( function_form.eql( function_form_evaluated_var ) )
    {
      return body;
    }
    return ConsesLow.list( $sym84$CLET, ConsesLow.list( ConsesLow.list( function_form_evaluated_var, function_form ) ), body );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 93535L)
  public static SubLObject fast_funcall_setq(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject var_to_set = NIL;
    SubLObject function_form = NIL;
    SubLObject function_name_list = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list385 );
    var_to_set = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list385 );
    function_form = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list385 );
    function_name_list = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    if( NIL == function_name_list )
    {
      return ConsesLow.list( $sym105$CSETQ, var_to_set, ConsesLow.listS( $sym381$FUNCALL, function_form, args ) );
    }
    final SubLObject function_form_evaluated_var = function_form.isSymbol() ? function_form : Symbols.make_symbol( $str382$function_form_evaluated_var );
    SubLObject case_list = NIL;
    SubLObject cdolist_list_var = function_name_list;
    SubLObject function_name = NIL;
    function_name = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( function_name.isSymbol() )
      {
        case_list = ConsesLow.cons( ConsesLow.list( function_name, ConsesLow.list( $sym105$CSETQ, var_to_set, reader.bq_cons( function_name, conses_high.copy_tree( args ) ) ) ), case_list );
      }
      cdolist_list_var = cdolist_list_var.rest();
      function_name = cdolist_list_var.first();
    }
    if( NIL == case_list )
    {
      return ConsesLow.listS( $sym381$FUNCALL, function_form, args );
    }
    final SubLObject body = ConsesLow.listS( $sym383$PCASE, function_form_evaluated_var, Sequences.nreverse( ConsesLow.cons( ConsesLow.list( $sym384$OTHERWISE, ConsesLow.list( $sym105$CSETQ, var_to_set, ConsesLow.listS(
        $sym381$FUNCALL, function_form_evaluated_var, conses_high.copy_tree( args ) ) ) ), case_list ) ) );
    if( function_form.eql( function_form_evaluated_var ) )
    {
      return body;
    }
    return ConsesLow.list( $sym84$CLET, ConsesLow.list( ConsesLow.list( function_form_evaluated_var, function_form ) ), body );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 95542L)
  public static SubLObject generate_parallel_var_list(final SubLObject var_list)
  {
    SubLObject new_var_list = NIL;
    SubLObject cdolist_list_var = var_list;
    SubLObject var = NIL;
    var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      new_var_list = ConsesLow.cons( Symbols.make_symbol( Symbols.symbol_name( var ) ), new_var_list );
      cdolist_list_var = cdolist_list_var.rest();
      var = cdolist_list_var.first();
    }
    return Sequences.nreverse( new_var_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 95900L)
  public static SubLObject generate_multiple_csetq(final SubLObject new_var_list, final SubLObject old_var_list)
  {
    SubLObject body_of_setq = NIL;
    SubLObject sub_new_var_list = NIL;
    SubLObject new_var = NIL;
    SubLObject sub_old_var_list = NIL;
    SubLObject old_var = NIL;
    sub_new_var_list = new_var_list;
    new_var = sub_new_var_list.first();
    sub_old_var_list = old_var_list;
    old_var = sub_old_var_list.first();
    while ( NIL != sub_new_var_list && NIL != sub_old_var_list)
    {
      body_of_setq = ConsesLow.cons( new_var, body_of_setq );
      body_of_setq = ConsesLow.cons( old_var, body_of_setq );
      sub_new_var_list = sub_new_var_list.rest();
      new_var = sub_new_var_list.first();
      sub_old_var_list = sub_old_var_list.rest();
      old_var = sub_old_var_list.first();
    }
    return ( NIL != body_of_setq ) ? ConsesLow.cons( $sym105$CSETQ, Sequences.nreverse( body_of_setq ) ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 96785L)
  public static SubLObject fast_funcall_multiple_value_bind(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject vars_to_bind = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list386 );
    vars_to_bind = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list386 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject function_form = NIL;
    SubLObject function_name_list = NIL;
    SubLObject args = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list386 );
    function_form = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list386 );
    function_name_list = current.first();
    current = ( args = current.rest() );
    final SubLObject body;
    current = ( body = temp );
    if( NIL == function_name_list )
    {
      return ConsesLow.listS( $sym387$CMULTIPLE_VALUE_BIND, vars_to_bind, ConsesLow.listS( $sym381$FUNCALL, function_form, args ), body );
    }
    final SubLObject function_form_evaluated_var = function_form.isSymbol() ? function_form : Symbols.make_symbol( $str382$function_form_evaluated_var );
    SubLObject case_list = NIL;
    SubLObject cdolist_list_var = function_name_list;
    SubLObject function_name = NIL;
    function_name = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( function_name.isSymbol() )
      {
        case_list = ConsesLow.cons( ConsesLow.list( function_name, ConsesLow.listS( $sym387$CMULTIPLE_VALUE_BIND, vars_to_bind, reader.bq_cons( function_name, conses_high.copy_tree( args ) ), body ) ), case_list );
      }
      cdolist_list_var = cdolist_list_var.rest();
      function_name = cdolist_list_var.first();
    }
    if( NIL == case_list )
    {
      return ConsesLow.listS( $sym381$FUNCALL, function_form, args );
    }
    final SubLObject v_answer = ConsesLow.listS( $sym383$PCASE, function_form_evaluated_var, Sequences.nreverse( ConsesLow.cons( ConsesLow.list( $sym384$OTHERWISE, ConsesLow.listS( $sym387$CMULTIPLE_VALUE_BIND,
        vars_to_bind, ConsesLow.listS( $sym381$FUNCALL, function_form_evaluated_var, conses_high.copy_tree( args ) ), body ) ), case_list ) ) );
    if( function_form.eql( function_form_evaluated_var ) )
    {
      return v_answer;
    }
    return ConsesLow.list( $sym84$CLET, ConsesLow.list( ConsesLow.list( function_form_evaluated_var, function_form ) ), v_answer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 98709L)
  public static SubLObject fast_funcall_multiple_value_setq(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject vars_to_set = NIL;
    SubLObject function_form = NIL;
    SubLObject function_name_list = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list388 );
    vars_to_set = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list388 );
    function_form = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list388 );
    function_name_list = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    if( NIL == function_name_list )
    {
      return ConsesLow.list( $sym389$CMULTIPLE_VALUE_SETQ, vars_to_set, ConsesLow.listS( $sym381$FUNCALL, function_form, args ) );
    }
    final SubLObject function_form_evaluated_var = function_form.isSymbol() ? function_form : Symbols.make_symbol( $str382$function_form_evaluated_var );
    SubLObject case_list = NIL;
    SubLObject cdolist_list_var = function_name_list;
    SubLObject function_name = NIL;
    function_name = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( function_name.isSymbol() )
      {
        case_list = ConsesLow.cons( ConsesLow.list( function_name, ConsesLow.list( $sym389$CMULTIPLE_VALUE_SETQ, vars_to_set, reader.bq_cons( function_name, conses_high.copy_tree( args ) ) ) ), case_list );
      }
      cdolist_list_var = cdolist_list_var.rest();
      function_name = cdolist_list_var.first();
    }
    if( NIL == case_list )
    {
      return ConsesLow.listS( $sym381$FUNCALL, function_form, args );
    }
    final SubLObject body = ConsesLow.listS( $sym383$PCASE, function_form_evaluated_var, Sequences.nreverse( ConsesLow.cons( ConsesLow.list( $sym384$OTHERWISE, ConsesLow.list( $sym389$CMULTIPLE_VALUE_SETQ, vars_to_set,
        ConsesLow.listS( $sym381$FUNCALL, function_form_evaluated_var, conses_high.copy_tree( args ) ) ) ), case_list ) ) );
    if( function_form.eql( function_form_evaluated_var ) )
    {
      return body;
    }
    return ConsesLow.list( $sym84$CLET, ConsesLow.list( ConsesLow.list( function_form_evaluated_var, function_form ) ), body );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 100728L)
  public static SubLObject expand_destructuring_predication_generator(final SubLObject predication_structure, final SubLObject operand)
  {
    if( NIL == predication_structure )
    {
      return ConsesLow.list( $sym335$NULL, operand );
    }
    if( predication_structure.isSymbol() )
    {
      return ConsesLow.list( predication_structure, operand );
    }
    if( predication_structure.isAtom() )
    {
      return T;
    }
    return ConsesLow.list( $sym200$CAND, ConsesLow.list( $sym337$CONSP, operand ), expand_destructuring_predication_generator( predication_structure.first(), ConsesLow.list( $sym100$CAR, operand ) ),
        expand_destructuring_predication_generator( predication_structure.rest(), ConsesLow.list( $sym336$CDR, operand ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 101236L)
  public static SubLObject funcall_shortcut(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject function = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list390 );
    function = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    if( function.isCons() && $sym6$QUOTE == function.first() )
    {
      return reader.bq_cons( conses_high.second( function ), ConsesLow.append( args, NIL ) );
    }
    return ConsesLow.listS( $sym381$FUNCALL, function, ConsesLow.append( args, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 101566L)
  public static SubLObject destructuring_predication_generator(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject predication_structure = NIL;
    SubLObject operand = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list391 );
    predication_structure = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list391 );
    operand = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return expand_destructuring_predication_generator( predication_structure, operand );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list391 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 102726L)
  public static SubLObject symbol_in_tree_p(final SubLObject symbol, final SubLObject tree)
  {
    if( NIL == tree )
    {
      return NIL;
    }
    if( tree.isSymbol() )
    {
      return Equality.eq( symbol, tree );
    }
    if( tree.isCons() )
    {
      return makeBoolean( NIL != symbol_in_tree_p( symbol, tree.first() ) || NIL != symbol_in_tree_p( symbol, tree.rest() ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 102977L)
  public static SubLObject unquoted_symbol_in_tree_p(final SubLObject symbol, final SubLObject tree)
  {
    if( NIL == tree )
    {
      return NIL;
    }
    if( tree.isSymbol() )
    {
      return Equality.eq( symbol, tree );
    }
    if( !tree.isCons() )
    {
      return NIL;
    }
    if( NIL == conses_high.member( tree.first(), $list392, UNPROVIDED, UNPROVIDED ) )
    {
      return makeBoolean( NIL != symbol_in_tree_p( symbol, tree.first() ) || NIL != symbol_in_tree_p( symbol, tree.rest() ) );
    }
    if( tree.rest().isCons() && conses_high.cadr( tree ).isCons() && conses_high.cddr( tree ).isList() )
    {
      SubLObject cdolist_list_var = conses_high.cddr( tree );
      SubLObject arg = NIL;
      arg = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != unquoted_symbol_in_tree_p( symbol, arg ) )
        {
          return T;
        }
        cdolist_list_var = cdolist_list_var.rest();
        arg = cdolist_list_var.first();
      }
      return NIL;
    }
    return makeBoolean( NIL != symbol_in_tree_p( symbol, tree.first() ) || NIL != symbol_in_tree_p( symbol, tree.rest() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 103657L)
  public static SubLObject generate_instance_variable_bindings_for_structure_slots(final SubLObject var, final SubLObject structure_expression, final SubLObject conc_name, final SubLObject instance_variables,
      final SubLObject body, SubLObject read_only)
  {
    if( read_only == UNPROVIDED )
    {
      read_only = T;
    }
    SubLObject var_bindings = NIL;
    SubLObject update_expressions = NIL;
    final SubLObject preprocessed_conc_name = conc_name.isSymbol() ? Symbols.symbol_name( conc_name ) : conc_name;
    SubLObject variable = NIL;
    SubLObject accessor = NIL;
    SubLObject explicit_getter = NIL;
    SubLObject explicit_setter = NIL;
    SubLObject cdolist_list_var = instance_variables;
    SubLObject instance_variable_form = NIL;
    instance_variable_form = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( instance_variable_form.isCons() )
      {
        variable = instance_variable_form.first();
        explicit_getter = conses_high.cadr( instance_variable_form );
        explicit_setter = conses_high.cddr( instance_variable_form ).first();
        accessor = NIL;
      }
      else
      {
        variable = instance_variable_form;
        explicit_getter = NIL;
        explicit_setter = NIL;
        accessor = Packages.intern( PrintLow.format( NIL, $str393$_A_S, preprocessed_conc_name, variable ), UNPROVIDED );
      }
      if( NIL != symbol_in_tree_p( variable, body ) )
      {
        var_bindings = ConsesLow.cons( ConsesLow.list( variable, ConsesLow.list( ( NIL != explicit_getter ) ? explicit_getter : accessor, var ) ), var_bindings );
        if( NIL == read_only )
        {
          update_expressions = ConsesLow.cons( ( NIL != explicit_setter ) ? ConsesLow.list( explicit_setter, var, variable ) : ConsesLow.list( $sym203$CSETF, ConsesLow.list( accessor, var ), variable ),
              update_expressions );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      instance_variable_form = cdolist_list_var.first();
    }
    if( NIL == var_bindings )
    {
      return reader.bq_cons( $sym3$PROGN, body );
    }
    if( NIL != read_only )
    {
      return ConsesLow.listS( $sym84$CLET, reader.bq_cons( ConsesLow.list( var, structure_expression ), Sequences.reverse( var_bindings ) ), body );
    }
    return ConsesLow.list( $sym84$CLET, reader.bq_cons( ConsesLow.list( var, structure_expression ), Sequences.reverse( var_bindings ) ), ConsesLow.listS( $sym164$CUNWIND_PROTECT, reader.bq_cons( $sym3$PROGN, body ),
        Sequences.reverse( update_expressions ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 105092L)
  public static SubLObject cdolist_collecting(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list394 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject list_expression = NIL;
    SubLObject collection_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list394 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list394 );
    list_expression = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list394 );
    collection_var = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      SubLObject iterated_expression = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list394 );
      iterated_expression = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject list_expression_var = Symbols.make_symbol( $str395$LIST_EXPRESSION );
        final SubLObject tail_cons_var = Symbols.make_symbol( $str396$TAIL_CONS );
        final SubLObject result_var = Symbols.make_symbol( $str397$RESULT );
        return ConsesLow.list( $sym84$CLET, ConsesLow.list( ConsesLow.list( list_expression_var, list_expression ) ), ConsesLow.list( $sym398$PCOND, ConsesLow.list( ConsesLow.list( $sym335$NULL, list_expression_var ),
            ConsesLow.listS( $sym105$CSETQ, collection_var, $list212 ) ), ConsesLow.list( ConsesLow.list( $sym399$ATOM, list_expression_var ), ConsesLow.list( $sym105$CSETQ, collection_var, ConsesLow.list( $sym361$LIST,
                list_expression_var ) ) ), ConsesLow.list( ConsesLow.list( $sym335$NULL, ConsesLow.list( $sym336$CDR, list_expression_var ) ), ConsesLow.list( $sym84$CLET, ConsesLow.list( ConsesLow.list( var, ConsesLow
                    .list( $sym100$CAR, list_expression_var ) ) ), ConsesLow.list( $sym105$CSETQ, collection_var, ConsesLow.list( $sym361$LIST, iterated_expression ) ) ) ), ConsesLow.list( T, ConsesLow.list( $sym84$CLET,
                        ConsesLow.list( reader.bq_cons( tail_cons_var, $list212 ), reader.bq_cons( result_var, $list212 ) ), ConsesLow.list( $sym84$CLET, ConsesLow.list( ConsesLow.list( var, ConsesLow.list( $sym100$CAR,
                            list_expression_var ) ) ), ConsesLow.list( $sym105$CSETQ, collection_var, ConsesLow.list( $sym361$LIST, iterated_expression ) ), ConsesLow.list( $sym105$CSETQ, tail_cons_var,
                                collection_var ) ), ConsesLow.list( $sym294$CDOLIST, ConsesLow.list( var, ConsesLow.list( $sym336$CDR, list_expression_var ) ), ConsesLow.list( $sym105$CSETQ, result_var, ConsesLow.list(
                                    $sym361$LIST, iterated_expression ) ), ConsesLow.list( $sym363$RPLACD, tail_cons_var, result_var ), ConsesLow.list( $sym105$CSETQ, tail_cons_var, result_var ) ) ) ) ) );
      }
      cdestructuring_bind.cdestructuring_bind_error( datum, $list394 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list394 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 106783L)
  public static SubLObject cdolist_appending(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list394 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject list_expression = NIL;
    SubLObject collection_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list394 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list394 );
    list_expression = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list394 );
    collection_var = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      SubLObject iterated_expression = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list394 );
      iterated_expression = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject list_expression_var = Symbols.make_symbol( $str395$LIST_EXPRESSION );
        final SubLObject tail_cons_var = Symbols.make_symbol( $str396$TAIL_CONS );
        final SubLObject result_var = Symbols.make_symbol( $str397$RESULT );
        return ConsesLow.list( $sym84$CLET, ConsesLow.list( ConsesLow.list( list_expression_var, list_expression ) ), ConsesLow.list( $sym398$PCOND, ConsesLow.list( ConsesLow.list( $sym335$NULL, list_expression_var ),
            ConsesLow.listS( $sym105$CSETQ, collection_var, $list212 ) ), ConsesLow.list( ConsesLow.list( $sym399$ATOM, list_expression_var ), ConsesLow.list( $sym105$CSETQ, collection_var, ConsesLow.list( $sym361$LIST,
                list_expression_var ) ) ), ConsesLow.list( ConsesLow.list( $sym335$NULL, ConsesLow.list( $sym336$CDR, list_expression_var ) ), ConsesLow.list( $sym84$CLET, ConsesLow.list( ConsesLow.list( var, ConsesLow
                    .list( $sym100$CAR, list_expression_var ) ) ), ConsesLow.list( $sym105$CSETQ, collection_var, iterated_expression ) ) ), ConsesLow.list( T, ConsesLow.list( $sym84$CLET, ConsesLow.list( reader.bq_cons(
                        tail_cons_var, $list212 ), reader.bq_cons( result_var, $list212 ) ), ConsesLow.listS( $sym105$CSETQ, collection_var, $list212 ), ConsesLow.list( $sym294$CDOLIST, ConsesLow.list( var,
                            list_expression_var ), ConsesLow.list( $sym105$CSETQ, result_var, iterated_expression ), ConsesLow.list( $sym37$PWHEN, result_var, ConsesLow.list( $sym85$PIF, tail_cons_var, ConsesLow.list(
                                $sym3$PROGN, ConsesLow.list( $sym363$RPLACD, tail_cons_var, result_var ), ConsesLow.list( $sym105$CSETQ, tail_cons_var, ConsesLow.list( $sym362$LAST, result_var ) ) ), ConsesLow.list(
                                    $sym3$PROGN, ConsesLow.list( $sym105$CSETQ, collection_var, iterated_expression ), ConsesLow.list( $sym105$CSETQ, tail_cons_var, ConsesLow.list( $sym362$LAST,
                                        collection_var ) ) ) ) ) ) ) ) ) );
      }
      cdestructuring_bind.cdestructuring_bind_error( datum, $list394 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list394 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 108486L)
  public static SubLObject expand_define_list_element_predicator(final SubLObject function_name, final SubLObject function_scope, final SubLObject element_var, final SubLObject type, final SubLObject body)
  {
    SubLObject defining_form = NIL;
    SubLObject definition = NIL;
    if( function_scope.eql( $kw400$API ) )
    {
      defining_form = $sym401$DEFINE_API;
    }
    else if( function_scope.eql( $kw402$PUBLIC ) )
    {
      defining_form = $sym4$DEFINE_PUBLIC;
    }
    else if( function_scope.eql( $kw403$PROTECTED ) )
    {
      defining_form = $sym404$DEFINE_PROTECTED;
    }
    else if( function_scope.eql( $kw405$PRIVATE ) )
    {
      defining_form = $sym63$DEFINE_PRIVATE;
    }
    else
    {
      defining_form = $sym4$DEFINE_PUBLIC;
    }
    if( type.eql( $kw406$ALL ) )
    {
      definition = ConsesLow.listS( defining_form, function_name, $list334, $list407, ConsesLow.list( $sym294$CDOLIST, reader.bq_cons( element_var, $list334 ), ConsesLow.listS( $sym202$PUNLESS, body, $list206 ) ),
          $list205 );
    }
    else if( type.eql( $kw408$NOT_EMPTY_ALL ) )
    {
      definition = ConsesLow.listS( defining_form, function_name, $list334, $list409, ConsesLow.list( $sym294$CDOLIST, reader.bq_cons( element_var, $list334 ), ConsesLow.listS( $sym202$PUNLESS, body, $list206 ) ),
          $list205 );
    }
    else if( type.eql( $kw410$ANY ) )
    {
      definition = ConsesLow.listS( defining_form, function_name, $list334, $list407, ConsesLow.list( $sym294$CDOLIST, reader.bq_cons( element_var, $list334 ), ConsesLow.listS( $sym37$PWHEN, body, $list205 ) ),
          $list206 );
    }
    else
    {
      Errors.error( $str411$DEFINE_LIST_ELEMENT_PREDICATOR___, type );
    }
    return definition;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 109709L)
  public static SubLObject define_api_list_element_predicator(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject function_name = NIL;
    SubLObject type = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list412 );
    function_name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list412 );
    type = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list412 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject element_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list412 );
    element_var = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      SubLObject expression = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list412 );
      expression = current.first();
      current = current.rest();
      if( NIL == current )
      {
        return expand_define_list_element_predicator( function_name, $kw400$API, element_var, type, expression );
      }
      cdestructuring_bind.cdestructuring_bind_error( datum, $list412 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list412 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 109897L)
  public static SubLObject define_public_list_element_predicator(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject function_name = NIL;
    SubLObject type = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list412 );
    function_name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list412 );
    type = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list412 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject element_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list412 );
    element_var = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      SubLObject expression = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list412 );
      expression = current.first();
      current = current.rest();
      if( NIL == current )
      {
        return expand_define_list_element_predicator( function_name, $kw402$PUBLIC, element_var, type, expression );
      }
      cdestructuring_bind.cdestructuring_bind_error( datum, $list412 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list412 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 110091L)
  public static SubLObject define_protected_list_element_predicator(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject function_name = NIL;
    SubLObject type = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list412 );
    function_name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list412 );
    type = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list412 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject element_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list412 );
    element_var = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      SubLObject expression = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list412 );
      expression = current.first();
      current = current.rest();
      if( NIL == current )
      {
        return expand_define_list_element_predicator( function_name, $kw403$PROTECTED, element_var, type, expression );
      }
      cdestructuring_bind.cdestructuring_bind_error( datum, $list412 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list412 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 110291L)
  public static SubLObject define_private_list_element_predicator(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject function_name = NIL;
    SubLObject type = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list412 );
    function_name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list412 );
    type = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list412 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject element_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list412 );
    element_var = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      SubLObject expression = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list412 );
      expression = current.first();
      current = current.rest();
      if( NIL == current )
      {
        return expand_define_list_element_predicator( function_name, $kw405$PRIVATE, element_var, type, expression );
      }
      cdestructuring_bind.cdestructuring_bind_error( datum, $list412 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list412 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 110487L)
  public static SubLObject argnames_from_arglist(final SubLObject arg_list)
  {
    return Sequences.remove( $sym413$_OPTIONAL, Mapping.mapcar( $sym414$CAR_IF_LIST, arg_list ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 110854L)
  public static SubLObject car_if_list(final SubLObject arg)
  {
    return arg.isCons() ? arg.first() : arg;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 110940L)
  public static SubLObject car_if_list_or_nil(final SubLObject arg)
  {
    return arg.isCons() ? arg.first() : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 111033L)
  public static SubLObject expand_fcond(final SubLObject v_clauses)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !v_clauses.isList() )
    {
      Errors.error( $str415$FCOND___S_is_not_a_valid_clause_l, v_clauses );
    }
    if( v_clauses.first().isAtom() )
    {
      Errors.error( $str416$FCOND___S_is_not_a_valid_clause_, v_clauses.first() );
      return NIL;
    }
    if( NIL != v_clauses.rest() )
    {
      final SubLObject first_clause = v_clauses.first();
      final SubLObject rest_of_clauses = v_clauses.rest();
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( !first_clause.isCons() || !first_clause.rest().isCons() || NIL != conses_high.cddr( first_clause ) ) )
      {
        Errors.error( $str416$FCOND___S_is_not_a_valid_clause_, first_clause );
      }
      return ConsesLow.list( $sym224$FIF, first_clause.first(), conses_high.cadr( first_clause ), expand_fcond( rest_of_clauses ) );
    }
    return ConsesLow.listS( $sym224$FIF, conses_high.caar( v_clauses ), conses_high.cadr( v_clauses.first() ), $list212 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 111662L)
  public static SubLObject fcond(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject v_clauses;
    final SubLObject current = v_clauses = datum;
    return expand_fcond( v_clauses );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 111727L)
  public static SubLObject check_p_range_case_clauses(final SubLObject v_clauses)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !v_clauses.isList() )
    {
      Errors.error( $str417$P_RANGE_CASE__Ill_formed_clauses_, v_clauses );
    }
    SubLObject cdolist_list_var = v_clauses;
    SubLObject clause = NIL;
    clause = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !clause.isCons() )
      {
        Errors.error( $str418$P_RANGE_CASE___S_is_not_a_valid_c, clause );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && clause.first() != $sym384$OTHERWISE && !clause.first().isInteger() && ( !clause.first().isCons() || !conses_high.caar( clause ).isInteger()
          || !conses_high.cdar( clause ).isCons() || !conses_high.cadr( clause.first() ).isInteger() ) )
      {
        Errors.error( $str418$P_RANGE_CASE___S_is_not_a_valid_c, clause );
      }
      cdolist_list_var = cdolist_list_var.rest();
      clause = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 112260L)
  public static SubLObject utilities_macros_car_eq(final SubLObject item, final SubLObject cons)
  {
    return Equality.eq( item, cons.first() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 112343L)
  public static SubLObject expand_p_range_case(final SubLObject value, SubLObject v_clauses)
  {
    final SubLObject value_var = Symbols.make_symbol( $str419$value );
    SubLObject processed_clauses = NIL;
    SubLObject otherwise_clause = conses_high.assoc( $sym384$OTHERWISE, v_clauses, UNPROVIDED, UNPROVIDED );
    if( NIL != otherwise_clause )
    {
      otherwise_clause = ConsesLow.list( reader.bq_cons( T, ConsesLow.append( otherwise_clause.rest(), NIL ) ) );
      v_clauses = Sequences.remove( $sym384$OTHERWISE, v_clauses, Symbols.symbol_function( EQ ), Symbols.symbol_function( $sym100$CAR ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    final SubLObject list_expression = v_clauses;
    if( NIL == list_expression )
    {
      processed_clauses = NIL;
    }
    else if( list_expression.isAtom() )
    {
      processed_clauses = ConsesLow.list( list_expression );
    }
    else if( NIL == list_expression.rest() )
    {
      final SubLObject clause = list_expression.first();
      processed_clauses = ConsesLow.list( clause.first().isCons() ? reader.bq_cons( ConsesLow.list( $sym200$CAND, ConsesLow.list( $sym420$__, value_var, conses_high.caar( clause ) ), ConsesLow.list( $sym421$__,
          value_var, conses_high.cadr( clause.first() ) ) ), clause.rest() ) : reader.bq_cons( ConsesLow.list( $sym422$_, value_var, clause.first() ), clause.rest() ) );
    }
    else
    {
      SubLObject tail_cons = NIL;
      SubLObject result = NIL;
      final SubLObject clause2 = list_expression.first();
      processed_clauses = ( tail_cons = ConsesLow.list( clause2.first().isCons() ? reader.bq_cons( ConsesLow.list( $sym200$CAND, ConsesLow.list( $sym420$__, value_var, conses_high.caar( clause2 ) ), ConsesLow.list(
          $sym421$__, value_var, conses_high.cadr( clause2.first() ) ) ), clause2.rest() ) : reader.bq_cons( ConsesLow.list( $sym422$_, value_var, clause2.first() ), clause2.rest() ) ) );
      SubLObject cdolist_list_var = list_expression.rest();
      SubLObject clause3 = NIL;
      clause3 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        result = ConsesLow.list( clause3.first().isCons() ? reader.bq_cons( ConsesLow.list( $sym200$CAND, ConsesLow.list( $sym420$__, value_var, conses_high.caar( clause3 ) ), ConsesLow.list( $sym421$__, value_var,
            conses_high.cadr( clause3.first() ) ) ), clause3.rest() ) : reader.bq_cons( ConsesLow.list( $sym422$_, value_var, clause3.first() ), clause3.rest() ) );
        ConsesLow.rplacd( tail_cons, result );
        tail_cons = result;
        cdolist_list_var = cdolist_list_var.rest();
        clause3 = cdolist_list_var.first();
      }
    }
    return ConsesLow.list( $sym84$CLET, ConsesLow.list( ConsesLow.list( value_var, value ) ), reader.bq_cons( $sym398$PCOND, ConsesLow.append( processed_clauses, otherwise_clause, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 113022L)
  public static SubLObject p_range_case(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list423 );
    value = current.first();
    final SubLObject v_clauses;
    current = ( v_clauses = current.rest() );
    check_p_range_case_clauses( v_clauses );
    return expand_p_range_case( value, v_clauses );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 113152L)
  public static SubLObject default_code_branch_error_clause(final SubLObject version)
  {
    return ConsesLow.list( $sym424$ERROR, $str425$Invalid_version_code__A_, version );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 113682L)
  public static SubLObject code_branch_by_version(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list426 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject version = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list426 );
    version = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      SubLObject version_bodies = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list426 );
      version_bodies = current.first();
      current = current.rest();
      SubLObject allow_other_keys_p = NIL;
      SubLObject rest = current;
      SubLObject bad = NIL;
      SubLObject current_$12 = NIL;
      while ( NIL != rest)
      {
        cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list426 );
        current_$12 = rest.first();
        rest = rest.rest();
        cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list426 );
        if( NIL == conses_high.member( current_$12, $list427, UNPROVIDED, UNPROVIDED ) )
        {
          bad = T;
        }
        if( current_$12 == $kw91$ALLOW_OTHER_KEYS )
        {
          allow_other_keys_p = rest.first();
        }
        rest = rest.rest();
      }
      if( NIL != bad && NIL == allow_other_keys_p )
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list426 );
      }
      final SubLObject error_clause_tail = cdestructuring_bind.property_list_member( $kw428$ERROR_CLAUSE, current );
      final SubLObject error_clause = ( NIL != error_clause_tail ) ? conses_high.cadr( error_clause_tail ) : NIL;
      SubLObject v_clauses = NIL;
      v_clauses = ConsesLow.cons( ConsesLow.list( $sym384$OTHERWISE, ( NIL != error_clause ) ? error_clause : default_code_branch_error_clause( version ) ), v_clauses );
      SubLObject cdolist_list_var = version_bodies;
      SubLObject version_body = NIL;
      version_body = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current_$13;
        final SubLObject datum_$13 = current_$13 = version_body;
        SubLObject version_$15 = NIL;
        SubLObject form = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current_$13, datum_$13, $list429 );
        version_$15 = current_$13.first();
        current_$13 = current_$13.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current_$13, datum_$13, $list429 );
        form = current_$13.first();
        current_$13 = current_$13.rest();
        if( NIL == current_$13 )
        {
          v_clauses = ConsesLow.cons( ConsesLow.list( version_$15, form ), v_clauses );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum_$13, $list429 );
        }
        cdolist_list_var = cdolist_list_var.rest();
        version_body = cdolist_list_var.first();
      }
      return ConsesLow.listS( $sym383$PCASE, version, ConsesLow.append( v_clauses, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list426 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 114228L)
  public static SubLObject code_branch_by_version_numbers(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list430 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject major = NIL;
    SubLObject minor = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list430 );
    major = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list430 );
    minor = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      SubLObject version_bodies = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list430 );
      version_bodies = current.first();
      current = current.rest();
      SubLObject allow_other_keys_p = NIL;
      SubLObject rest = current;
      SubLObject bad = NIL;
      SubLObject current_$16 = NIL;
      while ( NIL != rest)
      {
        cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list430 );
        current_$16 = rest.first();
        rest = rest.rest();
        cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list430 );
        if( NIL == conses_high.member( current_$16, $list427, UNPROVIDED, UNPROVIDED ) )
        {
          bad = T;
        }
        if( current_$16 == $kw91$ALLOW_OTHER_KEYS )
        {
          allow_other_keys_p = rest.first();
        }
        rest = rest.rest();
      }
      if( NIL != bad && NIL == allow_other_keys_p )
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list430 );
      }
      final SubLObject error_clause_tail = cdestructuring_bind.property_list_member( $kw428$ERROR_CLAUSE, current );
      final SubLObject error_clause = ( NIL != error_clause_tail ) ? conses_high.cadr( error_clause_tail ) : NIL;
      SubLObject v_clauses = NIL;
      v_clauses = ConsesLow.cons( ConsesLow.list( T, ( NIL != error_clause ) ? error_clause : default_code_branch_error_clause( major ) ), v_clauses );
      SubLObject cdolist_list_var = version_bodies;
      SubLObject version_body = NIL;
      version_body = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current_$17;
        final SubLObject datum_$17 = current_$17 = version_body;
        SubLObject major_version = NIL;
        SubLObject minor_version = NIL;
        SubLObject form = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current_$17, datum_$17, $list431 );
        major_version = current_$17.first();
        current_$17 = current_$17.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current_$17, datum_$17, $list431 );
        minor_version = current_$17.first();
        current_$17 = current_$17.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current_$17, datum_$17, $list431 );
        form = current_$17.first();
        current_$17 = current_$17.rest();
        if( NIL == current_$17 )
        {
          v_clauses = ConsesLow.cons( ConsesLow.list( ConsesLow.list( $sym200$CAND, ConsesLow.list( EQUAL, major_version, major ), ConsesLow.list( EQUAL, minor_version, minor ) ), form ), v_clauses );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum_$17, $list431 );
        }
        cdolist_list_var = cdolist_list_var.rest();
        version_body = cdolist_list_var.first();
      }
      return reader.bq_cons( $sym398$PCOND, ConsesLow.append( v_clauses, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list430 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 115281L)
  public static SubLObject sub_kb_loaded_root_string(final SubLObject sub_kb_symbol)
  {
    final SubLObject sub_kb_string = Symbols.symbol_name( sub_kb_symbol );
    final SubLObject len = Sequences.length( sub_kb_string );
    final SubLObject root_string = string_utilities.substring( sub_kb_string, ONE_INTEGER, Numbers.subtract( len, TWO_INTEGER ) );
    return root_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 115608L)
  public static SubLObject sub_kb_loaded_p_symbol(final SubLObject sub_kb_symbol)
  {
    final SubLObject root_string = sub_kb_loaded_root_string( sub_kb_symbol );
    final SubLObject loaded_p_string = Sequences.cconcatenate( root_string, $str434$_P );
    return Packages.intern( loaded_p_string, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 115854L)
  public static SubLObject sub_kb_set_symbol(final SubLObject sub_kb_symbol)
  {
    final SubLObject root_string = sub_kb_loaded_root_string( sub_kb_symbol );
    final SubLObject set_string = Sequences.cconcatenate( $str436$SET_, root_string );
    return Packages.intern( set_string, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 116089L)
  public static SubLObject sub_kb_unset_symbol(final SubLObject sub_kb_symbol)
  {
    final SubLObject root_string = sub_kb_loaded_root_string( sub_kb_symbol );
    final SubLObject unset_string = Sequences.cconcatenate( $str438$UNSET_, root_string );
    return Packages.intern( unset_string, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 116332L)
  public static SubLObject declare_kb_feature(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject sub_kb_symbol = NIL;
    SubLObject loaded_doc_string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list439 );
    sub_kb_symbol = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list439 );
    loaded_doc_string = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject loaded_p_symbol = sub_kb_loaded_p_symbol( sub_kb_symbol );
      final SubLObject set_symbol = sub_kb_set_symbol( sub_kb_symbol );
      final SubLObject unset_symbol = sub_kb_unset_symbol( sub_kb_symbol );
      return ConsesLow.list( $sym3$PROGN, ConsesLow.listS( $sym440$DEFGLOBAL_PRIVATE, sub_kb_symbol, $list212 ), ConsesLow.listS( $sym109$CPUSHNEW, ConsesLow.list( $sym6$QUOTE, sub_kb_symbol ), $list441 ), ConsesLow
          .list( $sym4$DEFINE_PUBLIC, loaded_p_symbol, NIL, loaded_doc_string, ConsesLow.list( $sym54$RET, sub_kb_symbol ) ), ConsesLow.listS( $sym404$DEFINE_PROTECTED, set_symbol, NIL, ConsesLow.listS( $sym105$CSETQ,
              sub_kb_symbol, $list442 ), $list205 ), ConsesLow.listS( $sym404$DEFINE_PROTECTED, unset_symbol, NIL, ConsesLow.listS( $sym105$CSETQ, sub_kb_symbol, $list212 ), $list206 ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list439 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 117249L)
  public static SubLObject expand_format_to_string(final SubLObject args)
  {
    SubLObject expressions = NIL;
    SubLObject sub_args = NIL;
    SubLObject control_arg = NIL;
    SubLObject value_arg = NIL;
    sub_args = args;
    control_arg = ( NIL != sub_args ) ? sub_args.first() : NIL;
    value_arg = ( NIL != sub_args ) ? conses_high.cadr( sub_args ) : NIL;
    while ( NIL != sub_args)
    {
      final SubLObject pcase_var = control_arg;
      if( pcase_var.eql( $kw443$A ) )
      {
        expressions = ConsesLow.cons( value_arg, expressions );
      }
      else if( pcase_var.eql( $kw444$S ) )
      {
        expressions = ConsesLow.cons( ConsesLow.list( $sym61$SYMBOL_NAME, value_arg ), expressions );
      }
      else if( pcase_var.eql( $kw445$D ) )
      {
        expressions = ConsesLow.cons( ConsesLow.list( $sym446$TO_STRING, value_arg ), expressions );
      }
      sub_args = conses_high.cddr( sub_args );
      control_arg = ( NIL != sub_args ) ? sub_args.first() : NIL;
      value_arg = ( NIL != sub_args ) ? conses_high.cadr( sub_args ) : NIL;
    }
    return reader.bq_cons( $sym447$CCONCATENATE, ConsesLow.append( Sequences.nreverse( expressions ), NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 117797L)
  public static SubLObject format_to_string(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject datum = macroform.rest();
    final SubLObject format_args;
    final SubLObject current = format_args = datum;
    SubLObject key_expected = T;
    SubLObject cdolist_list_var = format_args;
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != key_expected && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == conses_high.member( arg, $list448, UNPROVIDED, UNPROVIDED ) )
      {
        Errors.error( $str449$FORMAT_TO_STRING___S_is_an_invali, arg );
      }
      key_expected = makeBoolean( NIL == key_expected );
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == key_expected )
    {
      Errors.error( $str450$FORMAT_TO_STRING__Odd_number_of_a, format_args );
    }
    return expand_format_to_string( format_args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 118683L)
  public static SubLObject time(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    final SubLObject time = $sym451$TIME;
    return ConsesLow.list( $sym84$CLET, ConsesLow.list( time ), ConsesLow.listS( $sym452$CTIME, time, ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym453$FORMAT, T, $str454$_____real_time__A_seconds__, time ),
        ConsesLow.list( IDENTITY, time ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 119011L)
  public static SubLObject with_process_resource_tracking_in_seconds(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list455 );
    var = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject timing_info = $sym456$TIMING_INFO;
    final SubLObject clock_time = $sym457$CLOCK_TIME;
    return ConsesLow.list( $sym84$CLET, ConsesLow.list( timing_info, clock_time ), ConsesLow.list( $sym452$CTIME, clock_time, ConsesLow.listS( $sym458$WITH_PROCESS_RESOURCE_TRACKING, timing_info, ConsesLow.append( body,
        NIL ) ) ), ConsesLow.list( $sym105$CSETQ, var, ConsesLow.list( $sym459$CONVERT_PROCESS_RESOURCE_TRACKING_TIMING_INFO_TO_SECONDS, ConsesLow.list( $sym460$NADD_CLOCK_TIME_TO_PROCESS_RESOURCE_TIMING_INFO,
            clock_time, timing_info ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 120198L)
  public static SubLObject convert_process_resource_tracking_timing_info_to_seconds(final SubLObject timing_info)
  {
    SubLObject converted_timing_info = NIL;
    SubLObject remainder;
    SubLObject property;
    SubLObject value;
    SubLObject new_value;
    for( remainder = NIL, remainder = timing_info; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      property = remainder.first();
      value = conses_high.cadr( remainder );
      new_value = ( ( NIL != list_utilities.member_eqP( property, $process_resource_tracking_100s_of_nanoseconds_properties$.getGlobalValue() ) ) ? Numbers.divide( value, $int463$10000000 ) : value );
      converted_timing_info = conses_high.putf( converted_timing_info, property, new_value );
    }
    return converted_timing_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 120830L)
  public static SubLObject nadd_clock_time_to_process_resource_timing_info(final SubLObject clock_time, final SubLObject timing_info)
  {
    return conses_high.putf( timing_info, $kw464$WALL_CLOCK_TIME, clock_time );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 121106L)
  public static SubLObject process_resource_tracking_user_time(final SubLObject timing_info)
  {
    return conses_high.getf( timing_info, $kw465$USER_TIME, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 121283L)
  public static SubLObject process_resource_tracking_system_time(final SubLObject timing_info)
  {
    return conses_high.getf( timing_info, $kw466$SYSTEM_TIME, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 121464L)
  public static SubLObject process_resource_tracking_wall_clock_time(final SubLObject timing_info)
  {
    return conses_high.getf( timing_info, $kw464$WALL_CLOCK_TIME, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 121581L)
  public static SubLObject timing_info(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    final SubLObject timing_info = $sym467$TIMING_INFO;
    return ConsesLow.list( $sym84$CLET, ConsesLow.list( timing_info ), ConsesLow.listS( $sym462$WITH_PROCESS_RESOURCE_TRACKING_IN_SECONDS, timing_info, ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym453$FORMAT, T,
        $str468$______s__, timing_info ), ConsesLow.list( IDENTITY, timing_info ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 122073L)
  public static SubLObject user_time(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list455 );
    var = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject timing_info = $sym469$TIMING_INFO;
    return ConsesLow.list( $sym84$CLET, ConsesLow.list( timing_info ), ConsesLow.listS( $sym462$WITH_PROCESS_RESOURCE_TRACKING_IN_SECONDS, timing_info, ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym105$CSETQ, var,
        ConsesLow.list( $sym470$PROCESS_RESOURCE_TRACKING_USER_TIME, timing_info ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 122557L)
  public static SubLObject user_time_in_seconds(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list455 );
    var = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject timing_info = $sym471$TIMING_INFO;
    return ConsesLow.list( $sym84$CLET, ConsesLow.list( timing_info ), ConsesLow.listS( $sym462$WITH_PROCESS_RESOURCE_TRACKING_IN_SECONDS, timing_info, ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym105$CSETQ, var,
        ConsesLow.list( $sym470$PROCESS_RESOURCE_TRACKING_USER_TIME, timing_info ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 123000L)
  public static SubLObject system_time(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list455 );
    var = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject timing_info = $sym472$TIMING_INFO;
    return ConsesLow.list( $sym84$CLET, ConsesLow.list( timing_info ), ConsesLow.listS( $sym462$WITH_PROCESS_RESOURCE_TRACKING_IN_SECONDS, timing_info, ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym105$CSETQ, var,
        ConsesLow.list( $sym473$PROCESS_RESOURCE_TRACKING_SYSTEM_TIME, timing_info ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 123502L)
  public static SubLObject system_time_in_seconds(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list455 );
    var = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject timing_info = $sym474$TIMING_INFO;
    return ConsesLow.list( $sym84$CLET, ConsesLow.list( timing_info ), ConsesLow.listS( $sym462$WITH_PROCESS_RESOURCE_TRACKING_IN_SECONDS, timing_info, ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym105$CSETQ, var,
        ConsesLow.list( $sym473$PROCESS_RESOURCE_TRACKING_SYSTEM_TIME, timing_info ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 123957L)
  public static SubLObject check_type_if_present(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject v_object = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list475 );
    v_object = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list475 );
    pred = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym37$PWHEN, v_object, ConsesLow.list( $sym153$CHECK_TYPE, v_object, pred ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list475 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 124359L)
  public static SubLObject enforce_type_if_present(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject v_object = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list475 );
    v_object = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list475 );
    pred = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym37$PWHEN, v_object, ConsesLow.list( $sym34$ENFORCE_TYPE, v_object, pred ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list475 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 124693L)
  public static SubLObject check_list_type(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject list = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list476 );
    list = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list476 );
    pred = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject elem = $sym477$ELEM;
      final SubLObject list_var = $sym478$LIST_VAR;
      return ConsesLow.list( $sym84$CLET, ConsesLow.list( ConsesLow.list( list_var, list ) ), ConsesLow.listS( $sym153$CHECK_TYPE, list_var, $list479 ), ConsesLow.list( $sym294$CDOLIST, ConsesLow.list( elem, list_var ),
          ConsesLow.list( $sym153$CHECK_TYPE, elem, pred ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list476 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 125074L)
  public static SubLObject check_list_type_if_present(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject list = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list476 );
    list = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list476 );
    pred = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym37$PWHEN, list, ConsesLow.list( $sym480$CHECK_LIST_TYPE, list, pred ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list476 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 125187L)
  public static SubLObject enforce_list_type(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject list = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list476 );
    list = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list476 );
    pred = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject elem = $sym481$ELEM;
      final SubLObject list_var = $sym482$LIST_VAR;
      return ConsesLow.list( $sym84$CLET, ConsesLow.list( ConsesLow.list( list_var, list ) ), ConsesLow.listS( $sym34$ENFORCE_TYPE, list_var, $list479 ), ConsesLow.list( $sym294$CDOLIST, ConsesLow.list( elem, list_var ),
          ConsesLow.list( $sym34$ENFORCE_TYPE, elem, pred ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list476 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 125520L)
  public static SubLObject enforce_list_type_if_present(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject list = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list476 );
    list = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list476 );
    pred = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym37$PWHEN, list, ConsesLow.list( $sym480$CHECK_LIST_TYPE, list, pred ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list476 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 125635L)
  public static SubLObject check_plist_type(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject plist = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list483 );
    plist = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list483 );
    pred = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject property = $sym484$PROPERTY;
      final SubLObject value = $sym485$VALUE;
      final SubLObject plist_var = $sym486$PLIST_VAR;
      return ConsesLow.list( $sym84$CLET, ConsesLow.list( ConsesLow.list( plist_var, plist ) ), ConsesLow.listS( $sym153$CHECK_TYPE, plist_var, $list487 ), ConsesLow.list( $sym369$DO_PLIST, ConsesLow.list( property,
          value, plist_var ), ConsesLow.list( $sym248$IGNORE, value ), ConsesLow.list( $sym153$CHECK_TYPE, property, pred ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list483 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 126074L)
  public static SubLObject enforce_plist_type(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject plist = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list483 );
    plist = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list483 );
    pred = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject property = $sym488$PROPERTY;
      final SubLObject value = $sym489$VALUE;
      final SubLObject plist_var = $sym490$PLIST_VAR;
      return ConsesLow.list( $sym84$CLET, ConsesLow.list( ConsesLow.list( plist_var, plist ) ), ConsesLow.listS( $sym34$ENFORCE_TYPE, plist_var, $list487 ), ConsesLow.list( $sym369$DO_PLIST, ConsesLow.list( property,
          value, plist_var ), ConsesLow.list( $sym248$IGNORE, value ), ConsesLow.list( $sym34$ENFORCE_TYPE, property, pred ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list483 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 126462L)
  public static SubLObject warn_unless_plist_of_type(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject plist = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list483 );
    plist = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list483 );
    pred = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject property = $sym491$PROPERTY;
      final SubLObject value = $sym492$VALUE;
      final SubLObject plist_var = $sym493$PLIST_VAR;
      return ConsesLow.list( $sym84$CLET, ConsesLow.list( ConsesLow.list( plist_var, plist ) ), ConsesLow.listS( $sym153$CHECK_TYPE, plist_var, $list487 ), ConsesLow.list( $sym369$DO_PLIST, ConsesLow.list( property,
          value, plist_var ), ConsesLow.list( $sym248$IGNORE, value ), ConsesLow.list( $sym494$WARN_UNLESS, ConsesLow.list( pred, property ), $str495$_s_is_not_a_known__a, property, ConsesLow.list( $sym6$QUOTE,
              pred ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list483 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 127005L)
  public static SubLObject must_if_present(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject v_object = NIL;
    SubLObject form = NIL;
    SubLObject format_string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list496 );
    v_object = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list496 );
    form = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list496 );
    format_string = current.first();
    final SubLObject format_arguments;
    current = ( format_arguments = current.rest() );
    return ConsesLow.list( $sym37$PWHEN, v_object, ConsesLow.listS( $sym497$MUST, form, format_string, ConsesLow.append( format_arguments, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 127417L)
  public static SubLObject nil_or(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject function_spec = NIL;
    SubLObject v_object = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list498 );
    function_spec = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list498 );
    v_object = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym499$COR, ConsesLow.list( $sym335$NULL, v_object ), ConsesLow.list( function_spec, v_object ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list498 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 127631L)
  public static SubLObject swap(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject place1 = NIL;
    SubLObject place2 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list500 );
    place1 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list500 );
    place2 = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject swap_var = $sym501$SWAP_VAR;
      return ConsesLow.list( $sym84$CLET, ConsesLow.list( ConsesLow.list( swap_var, place1 ) ), ConsesLow.list( $sym203$CSETF, place1, place2 ), ConsesLow.list( $sym203$CSETF, place2, swap_var ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list500 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 127922L)
  public static SubLObject def_kb_variable(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject variable = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list502 );
    variable = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list502 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$19 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list502 );
      current_$19 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list502 );
      if( NIL == conses_high.member( current_$19, $list503, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$19 == $kw91$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list502 );
    }
    final SubLObject documentation_tail = cdestructuring_bind.property_list_member( $kw93$DOCUMENTATION, current );
    final SubLObject documentation = ( NIL != documentation_tail ) ? conses_high.cadr( documentation_tail ) : NIL;
    final SubLObject definer_tail = cdestructuring_bind.property_list_member( $kw504$DEFINER, current );
    final SubLObject definer = ( NIL != definer_tail ) ? conses_high.cadr( definer_tail ) : NIL;
    final SubLObject access_tail = cdestructuring_bind.property_list_member( $kw505$ACCESS, current );
    final SubLObject access = ( NIL != access_tail ) ? conses_high.cadr( access_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    assert NIL != Types.symbolp( variable ) : variable;
    if( NIL != documentation && !assertionsDisabledSynth && NIL == Types.stringp( documentation ) )
    {
      throw new AssertionError( documentation );
    }
    final SubLObject v_package = Symbols.symbol_package( variable );
    final SubLObject initializer_name = PrintLow.format( NIL, $str506$_A_INITIALIZER, variable );
    final SubLObject initializer = Packages.intern( initializer_name, v_package );
    return reader.bq_cons( $sym3$PROGN, ConsesLow.append( ( NIL != access ) ? ConsesLow.list( ConsesLow.list( $sym507$PROCLAIM, ConsesLow.list( $sym6$QUOTE, ConsesLow.list( $sym95$VACCESS, access, variable ) ) ) ) : NIL,
        ConsesLow.list( ( NIL != definer ) ? ConsesLow.list( definer, variable, $kw508$UNINITIALIZED, documentation ) : ConsesLow.list( $sym116$DEFVAR, variable, $kw508$UNINITIALIZED, documentation ), ConsesLow.list(
            $sym509$REGISTER_KB_VARIABLE_INITIALIZATION, ConsesLow.list( $sym6$QUOTE, variable ), ConsesLow.list( $sym6$QUOTE, initializer ) ), ConsesLow.listS( $sym63$DEFINE_PRIVATE, initializer, NIL, ConsesLow.append(
                body, NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 129221L)
  public static SubLObject register_kb_variable_initialization(final SubLObject var_symbol, final SubLObject func)
  {
    $kb_var_initializations$.setGlobalValue( list_utilities.alist_enter( $kb_var_initializations$.getGlobalValue(), var_symbol, func, UNPROVIDED ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 129527L)
  public static SubLObject initialize_kb_variables()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject str = $str512$Initializing_KB_variables;
    final SubLObject _prev_bind_0 = $progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $progress_last_pacification_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding( thread );
    final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding( thread );
    final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding( thread );
    final SubLObject _prev_bind_6 = $progress_count$.currentBinding( thread );
    final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding( thread );
    final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding( thread );
    try
    {
      $progress_start_time$.bind( Time.get_universal_time(), thread );
      $progress_last_pacification_time$.bind( $progress_start_time$.getDynamicValue( thread ), thread );
      $progress_elapsed_seconds_for_notification$.bind( $suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
      $progress_notification_count$.bind( ZERO_INTEGER, thread );
      $progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
      $progress_count$.bind( ZERO_INTEGER, thread );
      $is_noting_progressP$.bind( T, thread );
      $silent_progressP$.bind( ( NIL != str ) ? $silent_progressP$.getDynamicValue( thread ) : T, thread );
      noting_progress_preamble( str );
      SubLObject cdolist_list_var = $kb_var_initializations$.getGlobalValue();
      SubLObject cons = NIL;
      cons = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = cons;
        SubLObject var_symbol = NIL;
        SubLObject func = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list513 );
        var_symbol = current.first();
        current = ( func = current.rest() );
        Symbols.set( var_symbol, Functions.funcall( func ) );
        cdolist_list_var = cdolist_list_var.rest();
        cons = cdolist_list_var.first();
      }
      noting_progress_postamble();
    }
    finally
    {
      $silent_progressP$.rebind( _prev_bind_8, thread );
      $is_noting_progressP$.rebind( _prev_bind_7, thread );
      $progress_count$.rebind( _prev_bind_6, thread );
      $progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
      $progress_notification_count$.rebind( _prev_bind_4, thread );
      $progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
      $progress_last_pacification_time$.rebind( _prev_bind_2, thread );
      $progress_start_time$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 129850L)
  public static SubLObject defparameter_lazy(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject getter = NIL;
    SubLObject initialization_form = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list514 );
    getter = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list514 );
    initialization_form = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$20 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list514 );
      current_$20 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list514 );
      if( NIL == conses_high.member( current_$20, $list515, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$20 == $kw91$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list514 );
    }
    final SubLObject var_tail = cdestructuring_bind.property_list_member( $kw516$VAR, current );
    SubLObject var = ( NIL != var_tail ) ? conses_high.cadr( var_tail ) : NIL;
    final SubLObject vaccess_tail = cdestructuring_bind.property_list_member( $kw92$VACCESS, current );
    final SubLObject vaccess = ( NIL != vaccess_tail ) ? conses_high.cadr( vaccess_tail ) : $sym517$PRIVATE;
    final SubLObject faccess_tail = cdestructuring_bind.property_list_member( $kw518$FACCESS, current );
    final SubLObject faccess = ( NIL != faccess_tail ) ? conses_high.cadr( faccess_tail ) : $sym517$PRIVATE;
    final SubLObject documentation_tail = cdestructuring_bind.property_list_member( $kw93$DOCUMENTATION, current );
    final SubLObject documentation = ( NIL != documentation_tail ) ? conses_high.cadr( documentation_tail ) : NIL;
    if( NIL != string_utilities.starts_with( Symbols.symbol_name( getter ), $str519$_ ) || NIL != string_utilities.ends_with( Symbols.symbol_name( getter ), $str519$_, UNPROVIDED ) )
    {
      Errors.error( $str520$Invalid_function_name__A___The_fi, getter );
    }
    if( NIL == var )
    {
      final SubLObject var_name = Sequences.cconcatenate( $str519$_, new SubLObject[] { format_nil.format_nil_a_no_copy( getter ), $str519$_
      } );
      var = Packages.intern( var_name, UNPROVIDED );
    }
    final SubLObject init_value = $sym521$INIT_VALUE;
    return ConsesLow.list( $sym3$PROGN, ConsesLow.list( $sym94$DECLAIM, ConsesLow.list( $sym95$VACCESS, vaccess, var ) ), ConsesLow.list( $sym94$DECLAIM, ConsesLow.list( $sym522$FACCESS, faccess, getter ) ), ConsesLow
        .listS( $sym114$DEFPARAMETER, var, $kw508$UNINITIALIZED, ConsesLow.append( ( NIL != documentation ) ? ConsesLow.list( documentation ) : NIL, NIL ) ), ConsesLow.list( $sym56$DEFINE, getter, NIL, ConsesLow.list(
            $sym37$PWHEN, ConsesLow.listS( EQ, var, $list523 ), ConsesLow.list( $sym84$CLET, ConsesLow.list( ConsesLow.list( init_value, initialization_form ) ), ConsesLow.list( $sym37$PWHEN, ConsesLow.listS( EQ,
                init_value, $list523 ), ConsesLow.list( $sym424$ERROR, $str524$Unable_to_initialize__A__, var ) ), ConsesLow.list( $sym105$CSETQ, var, init_value ) ) ), ConsesLow.list( $sym54$RET, var ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 131439L)
  public static SubLObject defvar_lazy(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject getter = NIL;
    SubLObject initialization_form = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list514 );
    getter = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list514 );
    initialization_form = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$21 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list514 );
      current_$21 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list514 );
      if( NIL == conses_high.member( current_$21, $list515, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$21 == $kw91$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list514 );
    }
    final SubLObject var_tail = cdestructuring_bind.property_list_member( $kw516$VAR, current );
    SubLObject var = ( NIL != var_tail ) ? conses_high.cadr( var_tail ) : NIL;
    final SubLObject vaccess_tail = cdestructuring_bind.property_list_member( $kw92$VACCESS, current );
    final SubLObject vaccess = ( NIL != vaccess_tail ) ? conses_high.cadr( vaccess_tail ) : $sym517$PRIVATE;
    final SubLObject faccess_tail = cdestructuring_bind.property_list_member( $kw518$FACCESS, current );
    final SubLObject faccess = ( NIL != faccess_tail ) ? conses_high.cadr( faccess_tail ) : $sym517$PRIVATE;
    final SubLObject documentation_tail = cdestructuring_bind.property_list_member( $kw93$DOCUMENTATION, current );
    final SubLObject documentation = ( NIL != documentation_tail ) ? conses_high.cadr( documentation_tail ) : NIL;
    if( NIL != string_utilities.starts_with( Symbols.symbol_name( getter ), $str519$_ ) || NIL != string_utilities.ends_with( Symbols.symbol_name( getter ), $str519$_, UNPROVIDED ) )
    {
      Errors.error( $str525$Invalid_function_name__A___The_fi, getter );
    }
    if( NIL == var )
    {
      final SubLObject var_name = Sequences.cconcatenate( $str519$_, new SubLObject[] { format_nil.format_nil_a_no_copy( getter ), $str519$_
      } );
      var = Packages.intern( var_name, UNPROVIDED );
    }
    final SubLObject init_value = $sym526$INIT_VALUE;
    return ConsesLow.list( $sym3$PROGN, ConsesLow.list( $sym94$DECLAIM, ConsesLow.list( $sym95$VACCESS, vaccess, var ) ), ConsesLow.list( $sym94$DECLAIM, ConsesLow.list( $sym522$FACCESS, faccess, getter ) ), ConsesLow
        .listS( $sym116$DEFVAR, var, $kw508$UNINITIALIZED, ConsesLow.append( ( NIL != documentation ) ? ConsesLow.list( documentation ) : NIL, NIL ) ), ConsesLow.list( $sym56$DEFINE, getter, NIL, ConsesLow.list(
            $sym37$PWHEN, ConsesLow.listS( EQ, var, $list523 ), ConsesLow.list( $sym84$CLET, ConsesLow.list( ConsesLow.list( init_value, initialization_form ) ), ConsesLow.list( $sym37$PWHEN, ConsesLow.listS( EQ,
                init_value, $list523 ), ConsesLow.list( $sym424$ERROR, $str524$Unable_to_initialize__A__, var ) ), ConsesLow.list( $sym105$CSETQ, var, init_value ) ) ), ConsesLow.list( $sym54$RET, var ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 132896L)
  public static SubLObject defglobal_lazy(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject getter = NIL;
    SubLObject initialization_form = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list514 );
    getter = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list514 );
    initialization_form = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$22 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list514 );
      current_$22 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list514 );
      if( NIL == conses_high.member( current_$22, $list515, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$22 == $kw91$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list514 );
    }
    final SubLObject var_tail = cdestructuring_bind.property_list_member( $kw516$VAR, current );
    SubLObject var = ( NIL != var_tail ) ? conses_high.cadr( var_tail ) : NIL;
    final SubLObject vaccess_tail = cdestructuring_bind.property_list_member( $kw92$VACCESS, current );
    final SubLObject vaccess = ( NIL != vaccess_tail ) ? conses_high.cadr( vaccess_tail ) : $sym517$PRIVATE;
    final SubLObject faccess_tail = cdestructuring_bind.property_list_member( $kw518$FACCESS, current );
    final SubLObject faccess = ( NIL != faccess_tail ) ? conses_high.cadr( faccess_tail ) : $sym517$PRIVATE;
    final SubLObject documentation_tail = cdestructuring_bind.property_list_member( $kw93$DOCUMENTATION, current );
    final SubLObject documentation = ( NIL != documentation_tail ) ? conses_high.cadr( documentation_tail ) : NIL;
    if( NIL != string_utilities.starts_with( Symbols.symbol_name( getter ), $str519$_ ) || NIL != string_utilities.ends_with( Symbols.symbol_name( getter ), $str519$_, UNPROVIDED ) )
    {
      Errors.error( $str527$Invalid_function_name__A___The_fi, getter );
    }
    if( NIL == var )
    {
      final SubLObject var_name = Sequences.cconcatenate( $str519$_, new SubLObject[] { format_nil.format_nil_a_no_copy( getter ), $str519$_
      } );
      var = Packages.intern( var_name, UNPROVIDED );
    }
    final SubLObject init_value = $sym528$INIT_VALUE;
    return ConsesLow.list( $sym3$PROGN, ConsesLow.list( $sym94$DECLAIM, ConsesLow.list( $sym95$VACCESS, vaccess, var ) ), ConsesLow.list( $sym94$DECLAIM, ConsesLow.list( $sym522$FACCESS, faccess, getter ) ), ConsesLow
        .listS( $sym96$DEFGLOBAL, var, $kw508$UNINITIALIZED, ConsesLow.append( ( NIL != documentation ) ? ConsesLow.list( documentation ) : NIL, NIL ) ), ConsesLow.list( $sym56$DEFINE, getter, NIL, ConsesLow.list(
            $sym37$PWHEN, ConsesLow.listS( EQ, var, $list523 ), ConsesLow.list( $sym84$CLET, ConsesLow.list( ConsesLow.list( init_value, initialization_form ) ), ConsesLow.list( $sym37$PWHEN, ConsesLow.listS( EQ,
                init_value, $list523 ), ConsesLow.list( $sym424$ERROR, $str524$Unable_to_initialize__A__, var ) ), ConsesLow.list( $sym105$CSETQ, var, init_value ) ) ), ConsesLow.list( $sym54$RET, var ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 134365L)
  public static SubLObject deflexical_lazy(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject getter = NIL;
    SubLObject initialization_form = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list514 );
    getter = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list514 );
    initialization_form = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$23 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list514 );
      current_$23 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list514 );
      if( NIL == conses_high.member( current_$23, $list515, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$23 == $kw91$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list514 );
    }
    final SubLObject var_tail = cdestructuring_bind.property_list_member( $kw516$VAR, current );
    SubLObject var = ( NIL != var_tail ) ? conses_high.cadr( var_tail ) : NIL;
    final SubLObject vaccess_tail = cdestructuring_bind.property_list_member( $kw92$VACCESS, current );
    final SubLObject vaccess = ( NIL != vaccess_tail ) ? conses_high.cadr( vaccess_tail ) : $sym517$PRIVATE;
    final SubLObject faccess_tail = cdestructuring_bind.property_list_member( $kw518$FACCESS, current );
    final SubLObject faccess = ( NIL != faccess_tail ) ? conses_high.cadr( faccess_tail ) : $sym517$PRIVATE;
    final SubLObject documentation_tail = cdestructuring_bind.property_list_member( $kw93$DOCUMENTATION, current );
    final SubLObject documentation = ( NIL != documentation_tail ) ? conses_high.cadr( documentation_tail ) : NIL;
    if( NIL != string_utilities.starts_with( Symbols.symbol_name( getter ), $str519$_ ) || NIL != string_utilities.ends_with( Symbols.symbol_name( getter ), $str519$_, UNPROVIDED ) )
    {
      Errors.error( $str529$Invalid_function_name__A___The_fi, getter );
    }
    if( NIL == var )
    {
      final SubLObject var_name = Sequences.cconcatenate( $str519$_, new SubLObject[] { format_nil.format_nil_a_no_copy( getter ), $str519$_
      } );
      var = Packages.intern( var_name, UNPROVIDED );
    }
    final SubLObject init_value = $sym530$INIT_VALUE;
    return ConsesLow.list( $sym3$PROGN, ConsesLow.list( $sym94$DECLAIM, ConsesLow.list( $sym95$VACCESS, vaccess, var ) ), ConsesLow.list( $sym94$DECLAIM, ConsesLow.list( $sym522$FACCESS, faccess, getter ) ), ConsesLow
        .listS( $sym127$DEFLEXICAL, var, $kw508$UNINITIALIZED, ConsesLow.append( ( NIL != documentation ) ? ConsesLow.list( documentation ) : NIL, NIL ) ), ConsesLow.list( $sym56$DEFINE, getter, NIL, ConsesLow.list(
            $sym37$PWHEN, ConsesLow.listS( EQ, var, $list523 ), ConsesLow.list( $sym84$CLET, ConsesLow.list( ConsesLow.list( init_value, initialization_form ) ), ConsesLow.list( $sym37$PWHEN, ConsesLow.listS( EQ,
                init_value, $list523 ), ConsesLow.list( $sym424$ERROR, $str524$Unable_to_initialize__A__, var ) ), ConsesLow.list( $sym105$CSETQ, var, init_value ) ) ), ConsesLow.list( $sym54$RET, var ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 135838L)
  public static SubLObject define_api_obsolete(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    SubLObject arglist = NIL;
    SubLObject documentation_string = NIL;
    SubLObject declarations = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list531 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list531 );
    arglist = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list531 );
    documentation_string = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list531 );
    declarations = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    assert NIL != Types.stringp( documentation_string ) : documentation_string;
    assert NIL != Types.listp( declarations ) : declarations;
    thread.resetMultipleValues();
    final SubLObject argument_types = parse_obsolete_api_declarations( declarations );
    final SubLObject body_preamble = thread.secondMultipleValue();
    final SubLObject return_types = thread.thirdMultipleValue();
    final SubLObject replacements = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    return ConsesLow.list( $sym3$PROGN, ConsesLow.listS( $sym4$DEFINE_PUBLIC, name, arglist, documentation_string, ConsesLow.append( body_preamble, body, NIL ) ), ConsesLow.list(
        $sym532$REGISTER_OBSOLETE_CYC_API_FUNCTION, ConsesLow.list( $sym6$QUOTE, name ), ConsesLow.list( $sym6$QUOTE, replacements ), ConsesLow.list( $sym6$QUOTE, arglist ), documentation_string, ConsesLow.list(
            $sym6$QUOTE, argument_types ), ConsesLow.list( $sym6$QUOTE, return_types ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 137359L)
  public static SubLObject register_obsolete_cyc_api_function(final SubLObject name, final SubLObject replacements, final SubLObject arglist, final SubLObject doc_string, final SubLObject argument_types,
      final SubLObject return_types)
  {
    register_cyc_api_function( name, arglist, doc_string, argument_types, return_types );
    register_obsolete_cyc_api_replacements( name, replacements );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 137827L)
  public static SubLObject obsolete_cyc_api_replacements(final SubLObject name)
  {
    return Symbols.get( name, $kw533$OBSOLETE_CYC_API_REPLACEMENTS, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 138006L)
  public static SubLObject register_obsolete_cyc_api_replacements(final SubLObject name, final SubLObject replacements)
  {
    assert NIL != Types.symbolp( name ) : name;
    assert NIL != Types.listp( replacements ) : replacements;
    Symbols.put( name, $kw533$OBSOLETE_CYC_API_REPLACEMENTS, replacements );
    return name;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 138334L)
  public static SubLObject deregister_obsolete_cyc_api_replacements(final SubLObject name)
  {
    assert NIL != Types.symbolp( name ) : name;
    return Symbols.remprop( name, $kw533$OBSOLETE_CYC_API_REPLACEMENTS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 140090L)
  public static SubLObject initialization_for_partial_list_results()
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 140358L)
  public static SubLObject accumulation_for_partial_list_results(final SubLObject result)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $partial_results_accumulator$.setDynamicValue( ConsesLow.cons( result, $partial_results_accumulator$.getDynamicValue( thread ) ), thread );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 140487L)
  public static SubLObject consolidation_for_partial_list_results(final SubLObject accumulated_results)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cdolist_list_var = Sequences.nreverse( accumulated_results );
    SubLObject result = NIL;
    result = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      $partial_results_total_accumulator$.setDynamicValue( ConsesLow.cons( result, $partial_results_total_accumulator$.getDynamicValue( thread ) ), thread );
      cdolist_list_var = cdolist_list_var.rest();
      result = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 140687L)
  public static SubLObject notification_for_partial_list_results(final SubLObject accumulated_results, final SubLObject size, final SubLObject total_size)
  {
    return accumulated_results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 140837L)
  public static SubLObject final_results_for_partial_list_results(final SubLObject total_results)
  {
    return Sequences.nreverse( total_results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 141008L)
  public static SubLObject add_result_to_partial_results_accumulator(final SubLObject result)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $accumulating_partial_resultsP$.getDynamicValue( thread ) )
    {
      Functions.funcall( $partial_results_accumulation_fn$.getDynamicValue( thread ), result );
      $partial_results_size$.setDynamicValue( Numbers.add( $partial_results_size$.getDynamicValue( thread ), ONE_INTEGER ), thread );
      if( !$partial_results_size$.getDynamicValue( thread ).numL( $partial_results_threshold$.getDynamicValue( thread ) ) )
      {
        Functions.funcall( $partial_results_notification_fn$.getDynamicValue( thread ), $partial_results_accumulator$.getDynamicValue( thread ), $partial_results_size$.getDynamicValue( thread ),
            $partial_results_total_size$.getDynamicValue( thread ) );
        $partial_results_total_size$.setDynamicValue( Numbers.add( $partial_results_total_size$.getDynamicValue( thread ), $partial_results_size$.getDynamicValue( thread ) ), thread );
        $partial_results_size$.setDynamicValue( ZERO_INTEGER, thread );
        Functions.funcall( $partial_results_consolidation_fn$.getDynamicValue( thread ), $partial_results_accumulator$.getDynamicValue( thread ) );
        $partial_results_accumulator$.setDynamicValue( Functions.funcall( $partial_results_initialization_fn$.getDynamicValue( thread ) ), thread );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 141728L)
  public static SubLObject with_partial_results_accumulation(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list540 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject final_result_var = NIL;
    SubLObject threshold = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list540 );
    final_result_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list540 );
    threshold = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym84$CLET, ConsesLow.listS( $list541, $list542, ConsesLow.list( $sym543$_PARTIAL_RESULTS_THRESHOLD_, threshold ), $list544 ), ConsesLow.list( $sym164$CUNWIND_PROTECT, reader.bq_cons(
          $sym3$PROGN, ConsesLow.append( body, NIL ) ), $list545, ConsesLow.listS( $sym105$CSETQ, final_result_var, $list546 ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list540 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 142592L)
  public static SubLObject with_space_profiling_to_string(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list548 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject string_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list548 );
    string_var = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject stream = $sym549$STREAM;
      return ConsesLow.list( $sym550$CWITH_OUTPUT_TO_STRING, ConsesLow.list( stream, string_var ), ConsesLow.listS( $sym551$WITH_SPACE_PROFILING, ConsesLow.list( $kw552$STREAM, stream ), ConsesLow.append( body,
          NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list548 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 143324L)
  public static SubLObject with_sxhash_composite(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list553 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject result_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list553 );
    result_var = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$24 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list553 );
      current_$24 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list553 );
      if( NIL == conses_high.member( current_$24, $list554, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$24 == $kw91$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list553 );
    }
    final SubLObject initial_value_tail = cdestructuring_bind.property_list_member( $kw555$INITIAL_VALUE, current );
    final SubLObject initial_value = ( NIL != initial_value_tail ) ? conses_high.cadr( initial_value_tail ) : ZERO_INTEGER;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym84$CLET, ConsesLow.list( $list556, ConsesLow.list( $sym557$_SXHASH_COMPOSITE_HASH_, initial_value ) ), reader.bq_cons( $sym3$PROGN, ConsesLow.append( body, NIL ) ), ConsesLow.listS(
        $sym105$CSETQ, result_var, $list558 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 144011L)
  public static SubLObject with_sxhash_composite_fast(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list553 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject result_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list553 );
    result_var = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$25 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list553 );
      current_$25 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list553 );
      if( NIL == conses_high.member( current_$25, $list554, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$25 == $kw91$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list553 );
    }
    final SubLObject initial_value_tail = cdestructuring_bind.property_list_member( $kw555$INITIAL_VALUE, current );
    final SubLObject initial_value = ( NIL != initial_value_tail ) ? conses_high.cadr( initial_value_tail ) : ZERO_INTEGER;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym84$CLET, ConsesLow.list( $list559, ConsesLow.list( $sym560$COMPOSITE_HASH, initial_value ) ), reader.bq_cons( $sym3$PROGN, ConsesLow.append( body, NIL ) ), ConsesLow.listS( $sym105$CSETQ,
        result_var, $list561 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 144844L)
  public static SubLObject sxhash_composite_update_fast(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list562 );
    value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym3$PROGN, $list563, ConsesLow.list( $sym105$CSETQ, $sym560$COMPOSITE_HASH, ConsesLow.listS( $sym564$LOGXOR, ConsesLow.listS( $sym565$SXHASH_ROT, ConsesLow.list( $sym566$SXHASH, value ),
          $list567 ), $list561 ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list562 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 146150L)
  public static SubLObject sxhash_update_state(final SubLObject state)
  {
    return Vectors.aref( $sxhash_update_state_vector$.getGlobalValue(), state );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 146566L)
  public static SubLObject sxhash_composite_update(final SubLObject value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $sxhash_composite_state$.setDynamicValue( sxhash_update_state( $sxhash_composite_state$.getDynamicValue( thread ) ), thread );
    $sxhash_composite_hash$.setDynamicValue( Numbers.logxor( Sxhash.sxhash_rot( value, $sxhash_composite_state$.getDynamicValue( thread ) ), $sxhash_composite_hash$.getDynamicValue( thread ) ), thread );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 146938L)
  public static SubLObject slow_hash_test(SubLObject iterations)
  {
    if( iterations == UNPROVIDED )
    {
      iterations = $int572$1000000;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject i;
    SubLObject sxhash;
    SubLObject _prev_bind_0;
    SubLObject _prev_bind_2;
    for( i = NIL, i = ZERO_INTEGER; i.numL( iterations ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      sxhash = ZERO_INTEGER;
      _prev_bind_0 = $sxhash_composite_state$.currentBinding( thread );
      _prev_bind_2 = $sxhash_composite_hash$.currentBinding( thread );
      try
      {
        $sxhash_composite_state$.bind( FOUR_INTEGER, thread );
        $sxhash_composite_hash$.bind( $int573$167, thread );
        sxhash_composite_update( FOUR_INTEGER );
        sxhash_composite_update( THREE_INTEGER );
        sxhash = $sxhash_composite_hash$.getDynamicValue( thread );
      }
      finally
      {
        $sxhash_composite_hash$.rebind( _prev_bind_2, thread );
        $sxhash_composite_state$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 147282L)
  public static SubLObject fast_hash_test(SubLObject iterations)
  {
    if( iterations == UNPROVIDED )
    {
      iterations = $int572$1000000;
    }
    SubLObject i;
    SubLObject sxhash;
    SubLObject composite_state;
    SubLObject composite_hash;
    for( i = NIL, i = ZERO_INTEGER; i.numL( iterations ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      sxhash = ZERO_INTEGER;
      composite_state = FOUR_INTEGER;
      composite_hash = $int573$167;
      composite_state = sxhash_update_state( composite_state );
      composite_hash = Numbers.logxor( Sxhash.sxhash_rot( Sxhash.sxhash( FOUR_INTEGER ), composite_state ), composite_hash );
      composite_state = sxhash_update_state( composite_state );
      composite_hash = ( sxhash = Numbers.logxor( Sxhash.sxhash_rot( Sxhash.sxhash( THREE_INTEGER ), composite_state ), composite_hash ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 147641L)
  public static SubLObject possibly_catch_error_message(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list574 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject catchP = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list574 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list574 );
    catchP = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym85$PIF, catchP, ConsesLow.listS( $sym171$CATCH_ERROR_MESSAGE, ConsesLow.list( var ), ConsesLow.append( body, NIL ) ), reader.bq_cons( $sym3$PROGN, ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list574 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 147914L)
  public static SubLObject possibly_ccatch(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list575 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject tag = NIL;
    SubLObject ans_var = NIL;
    SubLObject catchP = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list575 );
    tag = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list575 );
    ans_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list575 );
    catchP = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym85$PIF, catchP, ConsesLow.listS( $sym576$CCATCH, tag, ans_var, ConsesLow.append( body, NIL ) ), reader.bq_cons( $sym3$PROGN, ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list575 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 148079L)
  public static SubLObject run_benchmark_compensating_for_paging(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list577 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject pre_n = NIL;
    SubLObject n = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list577 );
    pre_n = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list577 );
    n = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject timings = $sym578$TIMINGS;
      final SubLObject time = $sym579$TIME;
      final SubLObject i = $sym580$I;
      return ConsesLow.list( $sym84$CLET, ConsesLow.list( reader.bq_cons( timings, $list212 ) ), $list581, ConsesLow.list( $sym280$CDOTIMES, ConsesLow.list( i, ConsesLow.list( $sym582$_, pre_n, n ) ), ConsesLow.list(
          $sym84$CLET, ConsesLow.list( time ), ConsesLow.listS( $sym452$CTIME, time, ConsesLow.append( body, $list583 ) ), ConsesLow.list( $sym37$PWHEN, ConsesLow.list( $sym420$__, i, pre_n ), ConsesLow.list(
              $sym364$CPUSH, time, timings ) ) ) ), ConsesLow.listS( $sym584$PERFORM_STANDARD_STATISTICAL_ANALYSIS, timings, $list442 ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list577 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 148639L)
  public static SubLObject benchmark_gc()
  {
    return Storage.gc( UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 148830L)
  public static SubLObject without_pretty_printing(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym84$CLET, $list587, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 149044L)
  public static SubLObject possibly_with_timeout(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list588 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject timeout = NIL;
    SubLObject timed_outP = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list588 );
    timeout = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list588 );
    timed_outP = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym85$PIF, timeout, ConsesLow.list( $sym589$WITH_TIMEOUT, ConsesLow.list( timeout, timed_outP ), reader.bq_cons( $sym3$PROGN, ConsesLow.append( body, NIL ) ) ), reader.bq_cons( $sym3$PROGN,
          ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list588 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/utilities-macros.lisp", position = 149265L)
  public static SubLObject with_retries(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list590 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject retries = NIL;
    SubLObject seconds_between = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list590 );
    retries = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list590 );
    seconds_between = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject error_msg = $sym591$ERROR_MSG;
      final SubLObject success = $sym592$SUCCESS;
      final SubLObject n = $sym593$N;
      return ConsesLow.list( $sym84$CLET, ConsesLow.list( error_msg, reader.bq_cons( success, $list212 ) ), ConsesLow.list( $sym280$CDOTIMES, ConsesLow.list( n, retries ), ConsesLow.list( $sym202$PUNLESS, success,
          ConsesLow.listS( $sym105$CSETQ, error_msg, $list212 ), ConsesLow.listS( $sym171$CATCH_ERROR_MESSAGE, ConsesLow.list( error_msg ), ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym85$PIF, error_msg,
              ConsesLow.list( $sym594$SLEEP, seconds_between ), ConsesLow.listS( $sym105$CSETQ, success, $list442 ) ) ) ), ConsesLow.list( $sym37$PWHEN, error_msg, ConsesLow.list( $sym424$ERROR, error_msg ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list590 );
    return NIL;
  }

  public static SubLObject declare_utilities_macros_file()
  {
    SubLFiles.declareMacro( me, "define_api", "DEFINE-API" );
    SubLFiles.declareMacro( me, "declare_api_function", "DECLARE-API-FUNCTION" );
    SubLFiles.declareMacro( me, "defmacro_api", "DEFMACRO-API" );
    SubLFiles.declareMacro( me, "define_api_provisional", "DEFINE-API-PROVISIONAL" );
    SubLFiles.declareMacro( me, "defmacro_api_provisional", "DEFMACRO-API-PROVISIONAL" );
    SubLFiles.declareFunction( me, "register_cyc_api_function", "REGISTER-CYC-API-FUNCTION", 5, 0, false );
    SubLFiles.declareFunction( me, "register_cyc_api_macro", "REGISTER-CYC-API-MACRO", 3, 0, false );
    SubLFiles.declareFunction( me, "api_special_p", "API-SPECIAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "api_special_handler", "API-SPECIAL-HANDLER", 1, 0, false );
    SubLFiles.declareFunction( me, "register_api_special", "REGISTER-API-SPECIAL", 2, 0, false );
    SubLFiles.declareFunction( me, "api_predefined_function_p", "API-PREDEFINED-FUNCTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "register_api_predefined_function", "REGISTER-API-PREDEFINED-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "unregister_api_predefined_function", "UNREGISTER-API-PREDEFINED-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "api_predefined_host_function_p", "API-PREDEFINED-HOST-FUNCTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "register_api_predefined_host_function", "REGISTER-API-PREDEFINED-HOST-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "unregister_api_predefined_host_function", "UNREGISTER-API-PREDEFINED-HOST-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "api_predefined_macro_p", "API-PREDEFINED-MACRO-P", 1, 0, false );
    SubLFiles.declareFunction( me, "register_api_predefined_macro", "REGISTER-API-PREDEFINED-MACRO", 1, 0, false );
    SubLFiles.declareFunction( me, "unregister_api_predefined_macro", "UNREGISTER-API-PREDEFINED-MACRO", 1, 0, false );
    SubLFiles.declareFunction( me, "api_predefined_host_macro_p", "API-PREDEFINED-HOST-MACRO-P", 1, 0, false );
    SubLFiles.declareFunction( me, "register_api_predefined_host_macro", "REGISTER-API-PREDEFINED-HOST-MACRO", 1, 0, false );
    SubLFiles.declareFunction( me, "unregister_api_predefined_host_macro", "UNREGISTER-API-PREDEFINED-HOST-MACRO", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_api_symbol_p", "CYC-API-SYMBOL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "register_cyc_api_symbol", "REGISTER-CYC-API-SYMBOL", 1, 0, false );
    SubLFiles.declareFunction( me, "deregister_cyc_api_symbol", "DEREGISTER-CYC-API-SYMBOL", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_api_args", "CYC-API-ARGS", 1, 0, false );
    SubLFiles.declareFunction( me, "register_cyc_api_args", "REGISTER-CYC-API-ARGS", 2, 0, false );
    SubLFiles.declareFunction( me, "deregister_cyc_api_args", "DEREGISTER-CYC-API-ARGS", 1, 0, false );
    SubLFiles.declareFunction( me, "register_cyc_api_function_documentation", "REGISTER-CYC-API-FUNCTION-DOCUMENTATION", 2, 0, false );
    SubLFiles.declareFunction( me, "get_api_arg_types", "GET-API-ARG-TYPES", 1, 0, false );
    SubLFiles.declareFunction( me, "register_cyc_api_arg_types", "REGISTER-CYC-API-ARG-TYPES", 2, 0, false );
    SubLFiles.declareFunction( me, "deregister_cyc_api_arg_types", "DEREGISTER-CYC-API-ARG-TYPES", 1, 0, false );
    SubLFiles.declareFunction( me, "get_api_return_types", "GET-API-RETURN-TYPES", 1, 0, false );
    SubLFiles.declareFunction( me, "register_cyc_api_return_types", "REGISTER-CYC-API-RETURN-TYPES", 2, 0, false );
    SubLFiles.declareFunction( me, "deregister_cyc_api_return_types", "DEREGISTER-CYC-API-RETURN-TYPES", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_api_type_declarations", "PARSE-API-TYPE-DECLARATIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_obsolete_api_declarations", "PARSE-OBSOLETE-API-DECLARATIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_api_declarations_int", "PARSE-API-DECLARATIONS-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "expand_into_enforce_type", "EXPAND-INTO-ENFORCE-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "validate_return_type", "VALIDATE-RETURN-TYPE", 1, 0, false );
    SubLFiles.declareMacro( me, "define_after_adding", "DEFINE-AFTER-ADDING" );
    SubLFiles.declareMacro( me, "define_after_removing", "DEFINE-AFTER-REMOVING" );
    SubLFiles.declareMacro( me, "define_rule_after_adding", "DEFINE-RULE-AFTER-ADDING" );
    SubLFiles.declareMacro( me, "define_rule_after_removing", "DEFINE-RULE-AFTER-REMOVING" );
    SubLFiles.declareMacro( me, "define_collection_defn", "DEFINE-COLLECTION-DEFN" );
    SubLFiles.declareMacro( me, "define_evaluation_defn", "DEFINE-EVALUATION-DEFN" );
    SubLFiles.declareMacro( me, "define_expansion_defn", "DEFINE-EXPANSION-DEFN" );
    SubLFiles.declareMacro( me, "define_cyc_subl_defn", "DEFINE-CYC-SUBL-DEFN" );
    SubLFiles.declareMacro( me, "define_kb", "DEFINE-KB" );
    SubLFiles.declareFunction( me, "kb_function_p", "KB-FUNCTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "register_kb_symbol", "REGISTER-KB-SYMBOL", 1, 0, false );
    SubLFiles.declareFunction( me, "deregister_kb_symbol", "DEREGISTER-KB-SYMBOL", 1, 0, false );
    SubLFiles.declareFunction( me, "deregister_all_kb_functions", "DEREGISTER-ALL-KB-FUNCTIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "all_kb_functions", "ALL-KB-FUNCTIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "register_kb_function", "REGISTER-KB-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "deregister_kb_function", "DEREGISTER-KB-FUNCTION", 1, 0, false );
    SubLFiles.declareMacro( me, "define_private_funcall", "DEFINE-PRIVATE-FUNCALL" );
    SubLFiles.declareFunction( me, "note_funcall_helper_function", "NOTE-FUNCALL-HELPER-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "funcall_helper_functionP", "FUNCALL-HELPER-FUNCTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "unprovided_argumentP", "UNPROVIDED-ARGUMENT?", 1, 0, false );
    SubLFiles.declareMacro( me, "declare_control_parameter", "DECLARE-CONTROL-PARAMETER" );
    SubLFiles.declareFunction( me, "declare_control_parameter_internal", "DECLARE-CONTROL-PARAMETER-INTERNAL", 4, 0, false );
    SubLFiles.declareMacro( me, "until_mapping_finished", "UNTIL-MAPPING-FINISHED" );
    SubLFiles.declareFunction( me, "mapping_finished", "MAPPING-FINISHED", 0, 0, false );
    SubLFiles.declareMacro( me, "until_sbhl_mapping_finished", "UNTIL-SBHL-MAPPING-FINISHED" );
    SubLFiles.declareFunction( me, "sbhl_mapping_finished", "SBHL-MAPPING-FINISHED", 0, 0, false );
    SubLFiles.declareMacro( me, "cfasl_write", "CFASL-WRITE" );
    SubLFiles.declareMacro( me, "cfasl_read", "CFASL-READ" );
    SubLFiles.declareMacro( me, "if_lock_idle", "IF-LOCK-IDLE" );
    SubLFiles.declareMacro( me, "possibly_with_lock_held", "POSSIBLY-WITH-LOCK-HELD" );
    SubLFiles.declareMacro( me, "defglobal_lock", "DEFGLOBAL-LOCK" );
    SubLFiles.declareFunction( me, "initialize_global_locks", "INITIALIZE-GLOBAL-LOCKS", 0, 0, false );
    SubLFiles.declareFunction( me, "register_global_lock", "REGISTER-GLOBAL-LOCK", 2, 0, false );
    SubLFiles.declareFunction( me, "global_lock_p", "GLOBAL-LOCK-P", 1, 0, false );
    SubLFiles.declareFunction( me, "global_lock_initialization_form", "GLOBAL-LOCK-INITIALIZATION-FORM", 1, 0, false );
    SubLFiles.declareFunction( me, "initialize_global_lock", "INITIALIZE-GLOBAL-LOCK", 1, 0, false );
    SubLFiles.declareFunction( me, "initialize_global_lock_internal", "INITIALIZE-GLOBAL-LOCK-INTERNAL", 2, 0, false );
    SubLFiles.declareMacro( me, "defparameter_fi", "DEFPARAMETER-FI" );
    SubLFiles.declareMacro( me, "with_clean_fi_state", "WITH-CLEAN-FI-STATE" );
    SubLFiles.declareFunction( me, "register_html_state_variable", "REGISTER-HTML-STATE-VARIABLE", 1, 0, false );
    SubLFiles.declareMacro( me, "defparameter_html", "DEFPARAMETER-HTML" );
    SubLFiles.declareMacro( me, "defvar_html", "DEFVAR-HTML" );
    SubLFiles.declareFunction( me, "register_html_interface_variable", "REGISTER-HTML-INTERFACE-VARIABLE", 1, 0, false );
    SubLFiles.declareMacro( me, "defparameter_html_interface", "DEFPARAMETER-HTML-INTERFACE" );
    SubLFiles.declareMacro( me, "defvar_html_interface", "DEFVAR-HTML-INTERFACE" );
    SubLFiles.declareMacro( me, "def_state_variable", "DEF-STATE-VARIABLE" );
    SubLFiles.declareFunction( me, "note_state_variable_documentation", "NOTE-STATE-VARIABLE-DOCUMENTATION", 2, 0, false );
    SubLFiles.declareFunction( me, "define_operator_for_variable_type", "DEFINE-OPERATOR-FOR-VARIABLE-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "documentation", "DOCUMENTATION", 1, 1, false );
    SubLFiles.declareMacro( me, "defvar_gt", "DEFVAR-GT" );
    SubLFiles.declareMacro( me, "defvar_at", "DEFVAR-AT" );
    SubLFiles.declareMacro( me, "defvar_defn", "DEFVAR-DEFN" );
    SubLFiles.declareMacro( me, "defvar_kbi", "DEFVAR-KBI" );
    SubLFiles.declareMacro( me, "defvar_kbp", "DEFVAR-KBP" );
    SubLFiles.declareMacro( me, "with_kbp_defaults", "WITH-KBP-DEFAULTS" );
    SubLFiles.declareMacro( me, "progn_cyc_api", "PROGN-CYC-API" );
    SubLFiles.declareMacro( me, "with_forward_inference_environment", "WITH-FORWARD-INFERENCE-ENVIRONMENT" );
    SubLFiles.declareMacro( me, "with_clean_forward_inference_environment", "WITH-CLEAN-FORWARD-INFERENCE-ENVIRONMENT" );
    SubLFiles.declareMacro( me, "with_possibly_clean_forward_inference_environment", "WITH-POSSIBLY-CLEAN-FORWARD-INFERENCE-ENVIRONMENT" );
    SubLFiles.declareFunction( me, "possibly_get_forward_inference_environment", "POSSIBLY-GET-FORWARD-INFERENCE-ENVIRONMENT", 0, 0, false );
    SubLFiles.declareMacro( me, "with_clean_forward_problem_store_environment", "WITH-CLEAN-FORWARD-PROBLEM-STORE-ENVIRONMENT" );
    SubLFiles.declareMacro( me, "with_normal_forward_inference_parameters", "WITH-NORMAL-FORWARD-INFERENCE-PARAMETERS" );
    SubLFiles.declareMacro( me, "with_normal_forward_inference", "WITH-NORMAL-FORWARD-INFERENCE" );
    SubLFiles.declareFunction( me, "within_normal_forward_inferenceP", "WITHIN-NORMAL-FORWARD-INFERENCE?", 0, 0, false );
    SubLFiles.declareMacro( me, "throw_unevaluatable_on_error", "THROW-UNEVALUATABLE-ON-ERROR" );
    SubLFiles.declareFunction( me, "tracing_at_level", "TRACING-AT-LEVEL", 2, 0, false );
    SubLFiles.declareMacro( me, "if_tracing", "IF-TRACING" );
    SubLFiles.declareMacro( me, "with_static_structure_resourcing", "WITH-STATIC-STRUCTURE-RESOURCING" );
    SubLFiles.declareMacro( me, "possibly_with_static_structure_resourcing", "POSSIBLY-WITH-STATIC-STRUCTURE-RESOURCING" );
    SubLFiles.declareMacro( me, "define_structure_resource", "DEFINE-STRUCTURE-RESOURCE" );
    SubLFiles.declareMacro( me, "with_readtime_eval_disabled", "WITH-READTIME-EVAL-DISABLED" );
    SubLFiles.declareMacro( me, "noting_progress", "NOTING-PROGRESS" );
    SubLFiles.declareMacro( me, "noting_progress_delayed", "NOTING-PROGRESS-DELAYED" );
    SubLFiles.declareFunction( me, "noting_progress_preamble", "NOTING-PROGRESS-PREAMBLE", 1, 0, false );
    SubLFiles.declareFunction( me, "noting_progress_postamble", "NOTING-PROGRESS-POSTAMBLE", 0, 0, false );
    SubLFiles.declareFunction( me, "note_progress", "NOTE-PROGRESS", 0, 0, false );
    SubLFiles.declareMacro( me, "noting_activity", "NOTING-ACTIVITY" );
    SubLFiles.declareMacro( me, "noting_percent_progress", "NOTING-PERCENT-PROGRESS" );
    SubLFiles.declareMacro( me, "noting_percent_progress_delayed", "NOTING-PERCENT-PROGRESS-DELAYED" );
    SubLFiles.declareFunction( me, "noting_percent_progress_preamble", "NOTING-PERCENT-PROGRESS-PREAMBLE", 1, 0, false );
    SubLFiles.declareFunction( me, "noting_percent_progress_postamble", "NOTING-PERCENT-PROGRESS-POSTAMBLE", 0, 0, false );
    SubLFiles.declareFunction( me, "note_percent_progress", "NOTE-PERCENT-PROGRESS", 2, 0, false );
    SubLFiles.declareFunction( me, "print_progress_percent", "PRINT-PROGRESS-PERCENT", 1, 0, false );
    SubLFiles.declareFunction( me, "print_2_digit_nonnegative_integer", "PRINT-2-DIGIT-NONNEGATIVE-INTEGER", 2, 0, false );
    SubLFiles.declareFunction( me, "possibly_note_percent_progress_prediction", "POSSIBLY-NOTE-PERCENT-PROGRESS-PREDICTION", 3, 1, false );
    SubLFiles.declareFunction( me, "compute_percent_progress", "COMPUTE-PERCENT-PROGRESS", 2, 0, false );
    SubLFiles.declareFunction( me, "progress", "PROGRESS", 0, 0, false );
    SubLFiles.declareMacro( me, "progress_cdotimes", "PROGRESS-CDOTIMES" );
    SubLFiles.declareMacro( me, "progress_csome", "PROGRESS-CSOME" );
    SubLFiles.declareMacro( me, "progress_cdolist", "PROGRESS-CDOLIST" );
    SubLFiles.declareMacro( me, "possibly_progress_cdolist", "POSSIBLY-PROGRESS-CDOLIST" );
    SubLFiles.declareMacro( me, "progress_cdohash", "PROGRESS-CDOHASH" );
    SubLFiles.declareMacro( me, "progress_do_set", "PROGRESS-DO-SET" );
    SubLFiles.declareMacro( me, "noting_elapsed_time", "NOTING-ELAPSED-TIME" );
    SubLFiles.declareFunction( me, "noting_elapsed_time_preamble", "NOTING-ELAPSED-TIME-PREAMBLE", 1, 0, false );
    SubLFiles.declareFunction( me, "noting_elapsed_time_postamble", "NOTING-ELAPSED-TIME-POSTAMBLE", 2, 0, false );
    SubLFiles.declareMacro( me, "with_cyc_server_handling", "WITH-CYC-SERVER-HANDLING" );
    SubLFiles.declareMacro( me, "with_cyc_io_syntax", "WITH-CYC-IO-SYNTAX" );
    SubLFiles.declareFunction( me, "with_cyc_io_syntax_internal", "WITH-CYC-IO-SYNTAX-INTERNAL", 1, 0, false );
    SubLFiles.declareMacro( me, "with_sublisp_runtime_assumptions", "WITH-SUBLISP-RUNTIME-ASSUMPTIONS" );
    SubLFiles.declareMacro( me, "with_the_cyclist", "WITH-THE-CYCLIST" );
    SubLFiles.declareMacro( me, "with_different_cyclist", "WITH-DIFFERENT-CYCLIST" );
    SubLFiles.declareMacro( me, "do_bindings", "DO-BINDINGS" );
    SubLFiles.declareFunction( me, "do_bindings_var_specs", "DO-BINDINGS-VAR-SPECS", 2, 0, false );
    SubLFiles.declareMacro( me, "fast_singleton_macro_p", "FAST-SINGLETON-MACRO-P" );
    SubLFiles.declareFunction( me, "pluralityP", "PLURALITY?", 1, 0, false );
    SubLFiles.declareMacro( me, "fast_plurality_macro_p", "FAST-PLURALITY-MACRO-P" );
    SubLFiles.declareMacro( me, "cdosublists", "CDOSUBLISTS" );
    SubLFiles.declareMacro( me, "cdolist_and_sublists", "CDOLIST-AND-SUBLISTS" );
    SubLFiles.declareMacro( me, "cdolist_and_sublists_carefully", "CDOLIST-AND-SUBLISTS-CAREFULLY" );
    SubLFiles.declareMacro( me, "cdo_possibly_dotted_list", "CDO-POSSIBLY-DOTTED-LIST" );
    SubLFiles.declareMacro( me, "cdolist_if", "CDOLIST-IF" );
    SubLFiles.declareMacro( me, "cdosublists_if", "CDOSUBLISTS-IF" );
    SubLFiles.declareMacro( me, "cdolist_if_not", "CDOLIST-IF-NOT" );
    SubLFiles.declareMacro( me, "cdosublists_if_not", "CDOSUBLISTS-IF-NOT" );
    SubLFiles.declareMacro( me, "cdo2lists", "CDO2LISTS" );
    SubLFiles.declareMacro( me, "cdotree", "CDOTREE" );
    SubLFiles.declareMacro( me, "cdotree_conses", "CDOTREE-CONSES" );
    SubLFiles.declareMacro( me, "cdoplist", "CDOPLIST" );
    SubLFiles.declareFunction( me, "compositize_function_call", "COMPOSITIZE-FUNCTION-CALL", 2, 1, false );
    SubLFiles.declareFunction( me, "simplify_car_and_cdr_path", "SIMPLIFY-CAR-AND-CDR-PATH", 1, 0, false );
    SubLFiles.declareFunction( me, "map_symbols_to_accessors", "MAP-SYMBOLS-TO-ACCESSORS", 3, 0, false );
    SubLFiles.declareMacro( me, "cdestructuring_setq", "CDESTRUCTURING-SETQ" );
    SubLFiles.declareFunction( me, "fast_funcall_no_value_check_args", "FAST-FUNCALL-NO-VALUE-CHECK-ARGS", 3, 0, false );
    SubLFiles.declareMacro( me, "fast_funcall_no_value", "FAST-FUNCALL-NO-VALUE" );
    SubLFiles.declareMacro( me, "fast_funcall_setq", "FAST-FUNCALL-SETQ" );
    SubLFiles.declareFunction( me, "generate_parallel_var_list", "GENERATE-PARALLEL-VAR-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_multiple_csetq", "GENERATE-MULTIPLE-CSETQ", 2, 0, false );
    SubLFiles.declareMacro( me, "fast_funcall_multiple_value_bind", "FAST-FUNCALL-MULTIPLE-VALUE-BIND" );
    SubLFiles.declareMacro( me, "fast_funcall_multiple_value_setq", "FAST-FUNCALL-MULTIPLE-VALUE-SETQ" );
    SubLFiles.declareFunction( me, "expand_destructuring_predication_generator", "EXPAND-DESTRUCTURING-PREDICATION-GENERATOR", 2, 0, false );
    SubLFiles.declareMacro( me, "funcall_shortcut", "FUNCALL-SHORTCUT" );
    SubLFiles.declareMacro( me, "destructuring_predication_generator", "DESTRUCTURING-PREDICATION-GENERATOR" );
    SubLFiles.declareFunction( me, "symbol_in_tree_p", "SYMBOL-IN-TREE-P", 2, 0, false );
    SubLFiles.declareFunction( me, "unquoted_symbol_in_tree_p", "UNQUOTED-SYMBOL-IN-TREE-P", 2, 0, false );
    SubLFiles.declareFunction( me, "generate_instance_variable_bindings_for_structure_slots", "GENERATE-INSTANCE-VARIABLE-BINDINGS-FOR-STRUCTURE-SLOTS", 5, 1, false );
    SubLFiles.declareMacro( me, "cdolist_collecting", "CDOLIST-COLLECTING" );
    SubLFiles.declareMacro( me, "cdolist_appending", "CDOLIST-APPENDING" );
    SubLFiles.declareFunction( me, "expand_define_list_element_predicator", "EXPAND-DEFINE-LIST-ELEMENT-PREDICATOR", 5, 0, false );
    SubLFiles.declareMacro( me, "define_api_list_element_predicator", "DEFINE-API-LIST-ELEMENT-PREDICATOR" );
    SubLFiles.declareMacro( me, "define_public_list_element_predicator", "DEFINE-PUBLIC-LIST-ELEMENT-PREDICATOR" );
    SubLFiles.declareMacro( me, "define_protected_list_element_predicator", "DEFINE-PROTECTED-LIST-ELEMENT-PREDICATOR" );
    SubLFiles.declareMacro( me, "define_private_list_element_predicator", "DEFINE-PRIVATE-LIST-ELEMENT-PREDICATOR" );
    SubLFiles.declareFunction( me, "argnames_from_arglist", "ARGNAMES-FROM-ARGLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "car_if_list", "CAR-IF-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "car_if_list_or_nil", "CAR-IF-LIST-OR-NIL", 1, 0, false );
    SubLFiles.declareFunction( me, "expand_fcond", "EXPAND-FCOND", 1, 0, false );
    SubLFiles.declareMacro( me, "fcond", "FCOND" );
    SubLFiles.declareFunction( me, "check_p_range_case_clauses", "CHECK-P-RANGE-CASE-CLAUSES", 1, 0, false );
    SubLFiles.declareFunction( me, "utilities_macros_car_eq", "UTILITIES-MACROS-CAR-EQ", 2, 0, false );
    SubLFiles.declareFunction( me, "expand_p_range_case", "EXPAND-P-RANGE-CASE", 2, 0, false );
    SubLFiles.declareMacro( me, "p_range_case", "P-RANGE-CASE" );
    SubLFiles.declareFunction( me, "default_code_branch_error_clause", "DEFAULT-CODE-BRANCH-ERROR-CLAUSE", 1, 0, false );
    SubLFiles.declareMacro( me, "code_branch_by_version", "CODE-BRANCH-BY-VERSION" );
    SubLFiles.declareMacro( me, "code_branch_by_version_numbers", "CODE-BRANCH-BY-VERSION-NUMBERS" );
    SubLFiles.declareFunction( me, "sub_kb_loaded_root_string", "SUB-KB-LOADED-ROOT-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "sub_kb_loaded_p_symbol", "SUB-KB-LOADED-P-SYMBOL", 1, 0, false );
    SubLFiles.declareFunction( me, "sub_kb_set_symbol", "SUB-KB-SET-SYMBOL", 1, 0, false );
    SubLFiles.declareFunction( me, "sub_kb_unset_symbol", "SUB-KB-UNSET-SYMBOL", 1, 0, false );
    SubLFiles.declareMacro( me, "declare_kb_feature", "DECLARE-KB-FEATURE" );
    SubLFiles.declareFunction( me, "expand_format_to_string", "EXPAND-FORMAT-TO-STRING", 1, 0, false );
    SubLFiles.declareMacro( me, "format_to_string", "FORMAT-TO-STRING" );
    SubLFiles.declareMacro( me, "time", "TIME" );
    SubLFiles.declareMacro( me, "with_process_resource_tracking_in_seconds", "WITH-PROCESS-RESOURCE-TRACKING-IN-SECONDS" );
    SubLFiles.declareFunction( me, "convert_process_resource_tracking_timing_info_to_seconds", "CONVERT-PROCESS-RESOURCE-TRACKING-TIMING-INFO-TO-SECONDS", 1, 0, false );
    SubLFiles.declareFunction( me, "nadd_clock_time_to_process_resource_timing_info", "NADD-CLOCK-TIME-TO-PROCESS-RESOURCE-TIMING-INFO", 2, 0, false );
    SubLFiles.declareFunction( me, "process_resource_tracking_user_time", "PROCESS-RESOURCE-TRACKING-USER-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "process_resource_tracking_system_time", "PROCESS-RESOURCE-TRACKING-SYSTEM-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "process_resource_tracking_wall_clock_time", "PROCESS-RESOURCE-TRACKING-WALL-CLOCK-TIME", 1, 0, false );
    SubLFiles.declareMacro( me, "timing_info", "TIMING-INFO" );
    SubLFiles.declareMacro( me, "user_time", "USER-TIME" );
    SubLFiles.declareMacro( me, "user_time_in_seconds", "USER-TIME-IN-SECONDS" );
    SubLFiles.declareMacro( me, "system_time", "SYSTEM-TIME" );
    SubLFiles.declareMacro( me, "system_time_in_seconds", "SYSTEM-TIME-IN-SECONDS" );
    SubLFiles.declareMacro( me, "check_type_if_present", "CHECK-TYPE-IF-PRESENT" );
    SubLFiles.declareMacro( me, "enforce_type_if_present", "ENFORCE-TYPE-IF-PRESENT" );
    SubLFiles.declareMacro( me, "check_list_type", "CHECK-LIST-TYPE" );
    SubLFiles.declareMacro( me, "check_list_type_if_present", "CHECK-LIST-TYPE-IF-PRESENT" );
    SubLFiles.declareMacro( me, "enforce_list_type", "ENFORCE-LIST-TYPE" );
    SubLFiles.declareMacro( me, "enforce_list_type_if_present", "ENFORCE-LIST-TYPE-IF-PRESENT" );
    SubLFiles.declareMacro( me, "check_plist_type", "CHECK-PLIST-TYPE" );
    SubLFiles.declareMacro( me, "enforce_plist_type", "ENFORCE-PLIST-TYPE" );
    SubLFiles.declareMacro( me, "warn_unless_plist_of_type", "WARN-UNLESS-PLIST-OF-TYPE" );
    SubLFiles.declareMacro( me, "must_if_present", "MUST-IF-PRESENT" );
    SubLFiles.declareMacro( me, "nil_or", "NIL-OR" );
    SubLFiles.declareMacro( me, "swap", "SWAP" );
    SubLFiles.declareMacro( me, "def_kb_variable", "DEF-KB-VARIABLE" );
    SubLFiles.declareFunction( me, "register_kb_variable_initialization", "REGISTER-KB-VARIABLE-INITIALIZATION", 2, 0, false );
    SubLFiles.declareFunction( me, "initialize_kb_variables", "INITIALIZE-KB-VARIABLES", 0, 0, false );
    SubLFiles.declareMacro( me, "defparameter_lazy", "DEFPARAMETER-LAZY" );
    SubLFiles.declareMacro( me, "defvar_lazy", "DEFVAR-LAZY" );
    SubLFiles.declareMacro( me, "defglobal_lazy", "DEFGLOBAL-LAZY" );
    SubLFiles.declareMacro( me, "deflexical_lazy", "DEFLEXICAL-LAZY" );
    SubLFiles.declareMacro( me, "define_api_obsolete", "DEFINE-API-OBSOLETE" );
    SubLFiles.declareFunction( me, "register_obsolete_cyc_api_function", "REGISTER-OBSOLETE-CYC-API-FUNCTION", 6, 0, false );
    SubLFiles.declareFunction( me, "obsolete_cyc_api_replacements", "OBSOLETE-CYC-API-REPLACEMENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "register_obsolete_cyc_api_replacements", "REGISTER-OBSOLETE-CYC-API-REPLACEMENTS", 2, 0, false );
    SubLFiles.declareFunction( me, "deregister_obsolete_cyc_api_replacements", "DEREGISTER-OBSOLETE-CYC-API-REPLACEMENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "initialization_for_partial_list_results", "INITIALIZATION-FOR-PARTIAL-LIST-RESULTS", 0, 0, false );
    SubLFiles.declareFunction( me, "accumulation_for_partial_list_results", "ACCUMULATION-FOR-PARTIAL-LIST-RESULTS", 1, 0, false );
    SubLFiles.declareFunction( me, "consolidation_for_partial_list_results", "CONSOLIDATION-FOR-PARTIAL-LIST-RESULTS", 1, 0, false );
    SubLFiles.declareFunction( me, "notification_for_partial_list_results", "NOTIFICATION-FOR-PARTIAL-LIST-RESULTS", 3, 0, false );
    SubLFiles.declareFunction( me, "final_results_for_partial_list_results", "FINAL-RESULTS-FOR-PARTIAL-LIST-RESULTS", 1, 0, false );
    SubLFiles.declareFunction( me, "add_result_to_partial_results_accumulator", "ADD-RESULT-TO-PARTIAL-RESULTS-ACCUMULATOR", 1, 0, false );
    SubLFiles.declareMacro( me, "with_partial_results_accumulation", "WITH-PARTIAL-RESULTS-ACCUMULATION" );
    SubLFiles.declareMacro( me, "with_space_profiling_to_string", "WITH-SPACE-PROFILING-TO-STRING" );
    SubLFiles.declareMacro( me, "with_sxhash_composite", "WITH-SXHASH-COMPOSITE" );
    SubLFiles.declareMacro( me, "with_sxhash_composite_fast", "WITH-SXHASH-COMPOSITE-FAST" );
    SubLFiles.declareMacro( me, "sxhash_composite_update_fast", "SXHASH-COMPOSITE-UPDATE-FAST" );
    SubLFiles.declareFunction( me, "sxhash_update_state", "SXHASH-UPDATE-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "sxhash_composite_update", "SXHASH-COMPOSITE-UPDATE", 1, 0, false );
    SubLFiles.declareFunction( me, "slow_hash_test", "SLOW-HASH-TEST", 0, 1, false );
    SubLFiles.declareFunction( me, "fast_hash_test", "FAST-HASH-TEST", 0, 1, false );
    SubLFiles.declareMacro( me, "possibly_catch_error_message", "POSSIBLY-CATCH-ERROR-MESSAGE" );
    SubLFiles.declareMacro( me, "possibly_ccatch", "POSSIBLY-CCATCH" );
    SubLFiles.declareMacro( me, "run_benchmark_compensating_for_paging", "RUN-BENCHMARK-COMPENSATING-FOR-PAGING" );
    SubLFiles.declareFunction( me, "benchmark_gc", "BENCHMARK-GC", 0, 0, false );
    SubLFiles.declareMacro( me, "without_pretty_printing", "WITHOUT-PRETTY-PRINTING" );
    SubLFiles.declareMacro( me, "possibly_with_timeout", "POSSIBLY-WITH-TIMEOUT" );
    SubLFiles.declareMacro( me, "with_retries", "WITH-RETRIES" );
    return NIL;
  }

  public static SubLObject init_utilities_macros_file()
  {
    $api_special_table$ = SubLFiles.deflexical( "*API-SPECIAL-TABLE*", maybeDefault( $sym15$_API_SPECIAL_TABLE_, $api_special_table$, () -> ( Hashtables.make_hash_table( TEN_INTEGER, Symbols.symbol_function( EQ ),
        UNPROVIDED ) ) ) );
    $api_predefined_function_table$ = SubLFiles.deflexical( "*API-PREDEFINED-FUNCTION-TABLE*", maybeDefault( $sym17$_API_PREDEFINED_FUNCTION_TABLE_, $api_predefined_function_table$, () -> ( Hashtables.make_hash_table(
        $int18$1000, Symbols.symbol_function( EQ ), UNPROVIDED ) ) ) );
    $api_predefined_host_function_table$ = SubLFiles.deflexical( "*API-PREDEFINED-HOST-FUNCTION-TABLE*", maybeDefault( $sym19$_API_PREDEFINED_HOST_FUNCTION_TABLE_, $api_predefined_host_function_table$, () -> ( Hashtables
        .make_hash_table( $int20$100, Symbols.symbol_function( EQ ), UNPROVIDED ) ) ) );
    $api_predefined_macro_table$ = SubLFiles.deflexical( "*API-PREDEFINED-MACRO-TABLE*", maybeDefault( $sym21$_API_PREDEFINED_MACRO_TABLE_, $api_predefined_macro_table$, () -> ( Hashtables.make_hash_table( $int20$100,
        Symbols.symbol_function( EQ ), UNPROVIDED ) ) ) );
    $api_predefined_host_macro_table$ = SubLFiles.deflexical( "*API-PREDEFINED-HOST-MACRO-TABLE*", maybeDefault( $sym22$_API_PREDEFINED_HOST_MACRO_TABLE_, $api_predefined_host_macro_table$, () -> ( Hashtables
        .make_hash_table( TEN_INTEGER, Symbols.symbol_function( EQ ), UNPROVIDED ) ) ) );
    $api_symbols$ = SubLFiles.deflexical( "*API-SYMBOLS*", ( maybeDefault( $sym23$_API_SYMBOLS_, $api_symbols$, NIL ) ) );
    $api_types$ = SubLFiles.deflexical( "*API-TYPES*", ( maybeDefault( $sym29$_API_TYPES_, $api_types$, NIL ) ) );
    $kb_function_table$ = SubLFiles.deflexical( "*KB-FUNCTION-TABLE*", maybeDefault( $sym58$_KB_FUNCTION_TABLE_, $kb_function_table$, () -> ( Hashtables.make_hash_table( $int59$400, Symbols.symbol_function( EQ ),
        UNPROVIDED ) ) ) );
    $funcall_helper_property$ = SubLFiles.deflexical( "*FUNCALL-HELPER-PROPERTY*", ( maybeDefault( $sym65$_FUNCALL_HELPER_PROPERTY_, $funcall_helper_property$, $kw66$FUNCALL_HELPER ) ) );
    $unprovided$ = SubLFiles.deflexical( "*UNPROVIDED*", maybeDefault( $sym68$_UNPROVIDED_, $unprovided$, () -> ( Symbols.make_symbol( $str69$UNPROVIDED ) ) ) );
    $cfasl_stream$ = SubLFiles.defparameter( "*CFASL-STREAM*", NIL );
    $global_locks$ = SubLFiles.deflexical( "*GLOBAL-LOCKS*", ( maybeDefault( $sym98$_GLOBAL_LOCKS_, $global_locks$, NIL ) ) );
    $fi_state_variables$ = SubLFiles.deflexical( "*FI-STATE-VARIABLES*", ( maybeDefault( $sym106$_FI_STATE_VARIABLES_, $fi_state_variables$, NIL ) ) );
    $html_state_variables$ = SubLFiles.deflexical( "*HTML-STATE-VARIABLES*", ( maybeDefault( $sym113$_HTML_STATE_VARIABLES_, $html_state_variables$, NIL ) ) );
    $html_interface_variables$ = SubLFiles.deflexical( "*HTML-INTERFACE-VARIABLES*", ( maybeDefault( $sym117$_HTML_INTERFACE_VARIABLES_, $html_interface_variables$, NIL ) ) );
    $gt_state_variables$ = SubLFiles.deflexical( "*GT-STATE-VARIABLES*", ( maybeDefault( $sym142$_GT_STATE_VARIABLES_, $gt_state_variables$, NIL ) ) );
    $at_state_variables$ = SubLFiles.deflexical( "*AT-STATE-VARIABLES*", ( maybeDefault( $sym144$_AT_STATE_VARIABLES_, $at_state_variables$, NIL ) ) );
    $defn_state_variables$ = SubLFiles.deflexical( "*DEFN-STATE-VARIABLES*", ( maybeDefault( $sym145$_DEFN_STATE_VARIABLES_, $defn_state_variables$, NIL ) ) );
    $kbp_state_variables$ = SubLFiles.deflexical( "*KBP-STATE-VARIABLES*", ( maybeDefault( $sym148$_KBP_STATE_VARIABLES_, $kbp_state_variables$, NIL ) ) );
    $current_forward_problem_store$ = SubLFiles.defparameter( "*CURRENT-FORWARD-PROBLEM-STORE*", NIL );
    $tracing_level$ = SubLFiles.defparameter( "*TRACING-LEVEL*", NIL );
    $structure_resourcing_enabled$ = SubLFiles.deflexical( "*STRUCTURE-RESOURCING-ENABLED*", NIL );
    $structure_resourcing_make_static$ = SubLFiles.defparameter( "*STRUCTURE-RESOURCING-MAKE-STATIC*", NIL );
    $progress_last_pacification_time$ = SubLFiles.defparameter( "*PROGRESS-LAST-PACIFICATION-TIME*", NIL );
    $progress_pacifications_since_last_nl$ = SubLFiles.defparameter( "*PROGRESS-PACIFICATIONS-SINCE-LAST-NL*", NIL );
    $progress_elapsed_seconds_for_notification$ = SubLFiles.defparameter( "*PROGRESS-ELAPSED-SECONDS-FOR-NOTIFICATION*", NIL );
    $progress_notification_count$ = SubLFiles.defparameter( "*PROGRESS-NOTIFICATION-COUNT*", NIL );
    $progress_count$ = SubLFiles.defparameter( "*PROGRESS-COUNT*", NIL );
    $is_noting_progressP$ = SubLFiles.defparameter( "*IS-NOTING-PROGRESS?*", NIL );
    $noting_progress_delayed_mode_seconds$ = SubLFiles.defparameter( "*NOTING-PROGRESS-DELAYED-MODE-SECONDS*", NIL );
    $noting_progress_delayed_mode_string$ = SubLFiles.defparameter( "*NOTING-PROGRESS-DELAYED-MODE-STRING*", NIL );
    $professional_progress_modeP$ = SubLFiles.defparameter( "*PROFESSIONAL-PROGRESS-MODE?*", NIL );
    $suppress_all_progress_faster_than_seconds$ = SubLFiles.defparameter( "*SUPPRESS-ALL-PROGRESS-FASTER-THAN-SECONDS*", ONE_INTEGER );
    $silent_progressP$ = SubLFiles.defvar( "*SILENT-PROGRESS?*", NIL );
    $noting_progress_start_time$ = SubLFiles.defparameter( "*NOTING-PROGRESS-START-TIME*", NIL );
    $last_percent_progress_index$ = SubLFiles.defvar( "*LAST-PERCENT-PROGRESS-INDEX*", NIL );
    $last_percent_progress_prediction$ = SubLFiles.defparameter( "*LAST-PERCENT-PROGRESS-PREDICTION*", NIL );
    $within_noting_percent_progress$ = SubLFiles.defvar( "*WITHIN-NOTING-PERCENT-PROGRESS*", NIL );
    $percent_progress_start_time$ = SubLFiles.defvar( "*PERCENT-PROGRESS-START-TIME*", NIL );
    $percent_progress_delayed_mode_seconds$ = SubLFiles.defvar( "*PERCENT-PROGRESS-DELAYED-MODE-SECONDS*", NIL );
    $percent_progress_delayed_mode_string$ = SubLFiles.defvar( "*PERCENT-PROGRESS-DELAYED-MODE-STRING*", NIL );
    $progress_note$ = SubLFiles.defparameter( "*PROGRESS-NOTE*", $str272$ );
    $progress_start_time$ = SubLFiles.defparameter( "*PROGRESS-START-TIME*", Time.get_universal_time() );
    $progress_total$ = SubLFiles.defparameter( "*PROGRESS-TOTAL*", ONE_INTEGER );
    $progress_sofar$ = SubLFiles.defparameter( "*PROGRESS-SOFAR*", ZERO_INTEGER );
    $util_var_error_format_string$ = SubLFiles.defparameter( "*UTIL-VAR-ERROR-FORMAT-STRING*", $str331$_S___var__S_is_not_a_symbol_ );
    $util_func_error_format_string$ = SubLFiles.defparameter( "*UTIL-FUNC-ERROR-FORMAT-STRING*", $str332$_S___function__S_is_not_a_symbol_ );
    $util_search_type_error_format_string$ = SubLFiles.defparameter( "*UTIL-SEARCH-TYPE-ERROR-FORMAT-STRING*", $str333$_S___search_type__S_is_not_one_of );
    $process_resource_tracking_100s_of_nanoseconds_properties$ = SubLFiles.deflexical( "*PROCESS-RESOURCE-TRACKING-100S-OF-NANOSECONDS-PROPERTIES*", $list461 );
    $kb_var_initializations$ = SubLFiles.deflexical( "*KB-VAR-INITIALIZATIONS*", ( maybeDefault( $sym510$_KB_VAR_INITIALIZATIONS_, $kb_var_initializations$, NIL ) ) );
    $partial_results_accumulator$ = SubLFiles.defparameter( "*PARTIAL-RESULTS-ACCUMULATOR*", NIL );
    $partial_results_size$ = SubLFiles.defparameter( "*PARTIAL-RESULTS-SIZE*", NIL );
    $partial_results_threshold$ = SubLFiles.defparameter( "*PARTIAL-RESULTS-THRESHOLD*", $int534$40 );
    $partial_results_total_size$ = SubLFiles.defparameter( "*PARTIAL-RESULTS-TOTAL-SIZE*", NIL );
    $partial_results_total_accumulator$ = SubLFiles.defparameter( "*PARTIAL-RESULTS-TOTAL-ACCUMULATOR*", NIL );
    $partial_results_initialization_fn$ = SubLFiles.defparameter( "*PARTIAL-RESULTS-INITIALIZATION-FN*", $sym535$INITIALIZATION_FOR_PARTIAL_LIST_RESULTS );
    $partial_results_accumulation_fn$ = SubLFiles.defparameter( "*PARTIAL-RESULTS-ACCUMULATION-FN*", $sym536$ACCUMULATION_FOR_PARTIAL_LIST_RESULTS );
    $partial_results_consolidation_fn$ = SubLFiles.defparameter( "*PARTIAL-RESULTS-CONSOLIDATION-FN*", $sym537$CONSOLIDATION_FOR_PARTIAL_LIST_RESULTS );
    $partial_results_notification_fn$ = SubLFiles.defparameter( "*PARTIAL-RESULTS-NOTIFICATION-FN*", $sym538$NOTIFICATION_FOR_PARTIAL_LIST_RESULTS );
    $partial_results_final_result_fn$ = SubLFiles.defparameter( "*PARTIAL-RESULTS-FINAL-RESULT-FN*", $sym539$FINAL_RESULTS_FOR_PARTIAL_LIST_RESULTS );
    $accumulating_partial_resultsP$ = SubLFiles.defparameter( "*ACCUMULATING-PARTIAL-RESULTS?*", NIL );
    $sxhash_bit_limit$ = SubLFiles.defconstant( "*SXHASH-BIT-LIMIT*", $int568$27 );
    $sxhash_update_state_vector$ = SubLFiles.deflexical( "*SXHASH-UPDATE-STATE-VECTOR*", $ic569 );
    $sxhash_composite_state$ = SubLFiles.defparameter( "*SXHASH-COMPOSITE-STATE*", NIL );
    $sxhash_composite_hash$ = SubLFiles.defparameter( "*SXHASH-COMPOSITE-HASH*", NIL );
    return NIL;
  }

  public static SubLObject setup_utilities_macros_file()
  {
    subl_macro_promotions.declare_defglobal( $sym15$_API_SPECIAL_TABLE_ );
    subl_macro_promotions.declare_defglobal( $sym17$_API_PREDEFINED_FUNCTION_TABLE_ );
    subl_macro_promotions.declare_defglobal( $sym19$_API_PREDEFINED_HOST_FUNCTION_TABLE_ );
    subl_macro_promotions.declare_defglobal( $sym21$_API_PREDEFINED_MACRO_TABLE_ );
    subl_macro_promotions.declare_defglobal( $sym22$_API_PREDEFINED_HOST_MACRO_TABLE_ );
    subl_macro_promotions.declare_defglobal( $sym23$_API_SYMBOLS_ );
    subl_macro_promotions.declare_defglobal( $sym29$_API_TYPES_ );
    access_macros.register_external_symbol( $sym41$DEFINE_AFTER_ADDING );
    access_macros.register_external_symbol( $sym43$DEFINE_AFTER_REMOVING );
    access_macros.register_external_symbol( $sym44$DEFINE_RULE_AFTER_ADDING );
    access_macros.register_external_symbol( $sym45$DEFINE_RULE_AFTER_REMOVING );
    access_macros.register_external_symbol( $sym46$DEFINE_COLLECTION_DEFN );
    access_macros.register_external_symbol( $sym47$DEFINE_EVALUATION_DEFN );
    access_macros.register_external_symbol( $sym49$DEFINE_EXPANSION_DEFN );
    access_macros.register_external_symbol( $sym50$DEFINE_CYC_SUBL_DEFN );
    access_macros.register_external_symbol( $sym42$DEFINE_KB );
    subl_macro_promotions.declare_defglobal( $sym58$_KB_FUNCTION_TABLE_ );
    access_macros.register_macro_helper( $sym57$REGISTER_KB_FUNCTION, $sym42$DEFINE_KB );
    access_macros.register_external_symbol( $sym62$DEREGISTER_KB_FUNCTION );
    subl_macro_promotions.declare_defglobal( $sym65$_FUNCALL_HELPER_PROPERTY_ );
    access_macros.register_macro_helper( $sym64$NOTE_FUNCALL_HELPER_FUNCTION, $sym67$DEFINE_PRIVATE_FUNCALL );
    subl_macro_promotions.declare_defglobal( $sym68$_UNPROVIDED_ );
    subl_macro_promotions.declare_defglobal( $sym98$_GLOBAL_LOCKS_ );
    access_macros.register_macro_helper( $sym97$REGISTER_GLOBAL_LOCK, $sym97$REGISTER_GLOBAL_LOCK );
    access_macros.register_macro_helper( $sym103$INITIALIZE_GLOBAL_LOCK_INTERNAL, $sym104$INITIALIZE_GLOBAL_LOCKS );
    subl_macro_promotions.declare_defglobal( $sym106$_FI_STATE_VARIABLES_ );
    subl_macro_promotions.declare_defglobal( $sym113$_HTML_STATE_VARIABLES_ );
    subl_macro_promotions.declare_defglobal( $sym117$_HTML_INTERFACE_VARIABLES_ );
    access_macros.register_macro_helper( $sym120$NOTE_STATE_VARIABLE_DOCUMENTATION, $sym121$DEF_STATE_VARIABLE );
    subl_macro_promotions.declare_defglobal( $sym142$_GT_STATE_VARIABLES_ );
    subl_macro_promotions.declare_defglobal( $sym144$_AT_STATE_VARIABLES_ );
    subl_macro_promotions.declare_defglobal( $sym145$_DEFN_STATE_VARIABLES_ );
    subl_macro_promotions.declare_defglobal( $sym148$_KBP_STATE_VARIABLES_ );
    access_macros.register_macro_helper( $sym161$POSSIBLY_GET_FORWARD_INFERENCE_ENVIRONMENT, $sym162$WITH_POSSIBLY_CLEAN_FORWARD_INFERENCE_ENVIRONMENT );
    access_macros.register_macro_helper( $sym226$NOTING_PROGRESS_PREAMBLE, $sym231$NOTING_PROGRESS );
    access_macros.register_macro_helper( $sym235$NOTING_PROGRESS_POSTAMBLE, $sym231$NOTING_PROGRESS );
    access_macros.register_macro_helper( $sym241$NOTE_PROGRESS, $sym231$NOTING_PROGRESS );
    access_macros.register_macro_helper( $sym250$NOTING_PERCENT_PROGRESS_PREAMBLE, $sym254$NOTING_PERCENT_PROGRESS );
    access_macros.register_macro_helper( $sym255$NOTING_PERCENT_PROGRESS_POSTAMBLE, $sym254$NOTING_PERCENT_PROGRESS );
    access_macros.register_macro_helper( $sym258$NOTE_PERCENT_PROGRESS, $sym254$NOTING_PERCENT_PROGRESS );
    access_macros.register_external_symbol( $sym289$PROGRESS_CDOLIST );
    access_macros.register_macro_helper( $sym310$NOTING_ELAPSED_TIME_PREAMBLE, $sym312$NOTING_ELAPSED_TIME );
    access_macros.register_macro_helper( $sym311$NOTING_ELAPSED_TIME_POSTAMBLE, $sym312$NOTING_ELAPSED_TIME );
    access_macros.register_macro_helper( $sym432$SUB_KB_LOADED_P_SYMBOL, $sym433$DECLARE_KB_FEATURE );
    access_macros.register_macro_helper( $sym435$SUB_KB_SET_SYMBOL, $sym433$DECLARE_KB_FEATURE );
    access_macros.register_macro_helper( $sym437$SUB_KB_UNSET_SYMBOL, $sym433$DECLARE_KB_FEATURE );
    access_macros.register_macro_helper( $sym459$CONVERT_PROCESS_RESOURCE_TRACKING_TIMING_INFO_TO_SECONDS, $sym462$WITH_PROCESS_RESOURCE_TRACKING_IN_SECONDS );
    access_macros.register_macro_helper( $sym460$NADD_CLOCK_TIME_TO_PROCESS_RESOURCE_TIMING_INFO, $sym462$WITH_PROCESS_RESOURCE_TRACKING_IN_SECONDS );
    subl_macro_promotions.declare_defglobal( $sym510$_KB_VAR_INITIALIZATIONS_ );
    access_macros.register_macro_helper( $sym509$REGISTER_KB_VARIABLE_INITIALIZATION, $sym511$DEF_KB_VARIABLE );
    access_macros.register_external_symbol( $sym547$WITH_SPACE_PROFILING_TO_STRING );
    access_macros.register_macro_helper( $sym570$SXHASH_COMPOSITE_UPDATE, $sym571$COMPUTE_SXHASH_COMPOSITE );
    access_macros.register_macro_helper( $sym585$BENCHMARK_GC, $sym586$RUN_BENCHMARK_COMPENSATING_FOR_PAGING );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_utilities_macros_file();
  }

  @Override
  public void initializeVariables()
  {
    init_utilities_macros_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_utilities_macros_file();
  }
  static
  {
    me = new utilities_macros();
    $api_special_table$ = null;
    $api_predefined_function_table$ = null;
    $api_predefined_host_function_table$ = null;
    $api_predefined_macro_table$ = null;
    $api_predefined_host_macro_table$ = null;
    $api_symbols$ = null;
    $api_types$ = null;
    $kb_function_table$ = null;
    $funcall_helper_property$ = null;
    $unprovided$ = null;
    $cfasl_stream$ = null;
    $global_locks$ = null;
    $fi_state_variables$ = null;
    $html_state_variables$ = null;
    $html_interface_variables$ = null;
    $gt_state_variables$ = null;
    $at_state_variables$ = null;
    $defn_state_variables$ = null;
    $kbp_state_variables$ = null;
    $current_forward_problem_store$ = null;
    $tracing_level$ = null;
    $structure_resourcing_enabled$ = null;
    $structure_resourcing_make_static$ = null;
    $progress_last_pacification_time$ = null;
    $progress_pacifications_since_last_nl$ = null;
    $progress_elapsed_seconds_for_notification$ = null;
    $progress_notification_count$ = null;
    $progress_count$ = null;
    $is_noting_progressP$ = null;
    $noting_progress_delayed_mode_seconds$ = null;
    $noting_progress_delayed_mode_string$ = null;
    $professional_progress_modeP$ = null;
    $suppress_all_progress_faster_than_seconds$ = null;
    $silent_progressP$ = null;
    $noting_progress_start_time$ = null;
    $last_percent_progress_index$ = null;
    $last_percent_progress_prediction$ = null;
    $within_noting_percent_progress$ = null;
    $percent_progress_start_time$ = null;
    $percent_progress_delayed_mode_seconds$ = null;
    $percent_progress_delayed_mode_string$ = null;
    $progress_note$ = null;
    $progress_start_time$ = null;
    $progress_total$ = null;
    $progress_sofar$ = null;
    $util_var_error_format_string$ = null;
    $util_func_error_format_string$ = null;
    $util_search_type_error_format_string$ = null;
    $process_resource_tracking_100s_of_nanoseconds_properties$ = null;
    $kb_var_initializations$ = null;
    $partial_results_accumulator$ = null;
    $partial_results_size$ = null;
    $partial_results_threshold$ = null;
    $partial_results_total_size$ = null;
    $partial_results_total_accumulator$ = null;
    $partial_results_initialization_fn$ = null;
    $partial_results_accumulation_fn$ = null;
    $partial_results_consolidation_fn$ = null;
    $partial_results_notification_fn$ = null;
    $partial_results_final_result_fn$ = null;
    $accumulating_partial_resultsP$ = null;
    $sxhash_bit_limit$ = null;
    $sxhash_update_state_vector$ = null;
    $sxhash_composite_state$ = null;
    $sxhash_composite_hash$ = null;
    $list0 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "ARGLIST" ), makeSymbol( "DOCUMENTATION-STRING" ), makeSymbol( "TYPE-DECLARATIONS" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym1$STRINGP = makeSymbol( "STRINGP" );
    $sym2$LISTP = makeSymbol( "LISTP" );
    $sym3$PROGN = makeSymbol( "PROGN" );
    $sym4$DEFINE_PUBLIC = makeSymbol( "DEFINE-PUBLIC" );
    $sym5$REGISTER_CYC_API_FUNCTION = makeSymbol( "REGISTER-CYC-API-FUNCTION" );
    $sym6$QUOTE = makeSymbol( "QUOTE" );
    $list7 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "ARGLIST" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list8 = ConsesLow.list( makeSymbol( "DOCUMENTATION-STRING" ), makeSymbol( "TYPE-DECLARATIONS" ) );
    $list9 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "PATTERN" ), makeSymbol( "DOCUMENTATION-STRING" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym10$DEFMACRO_PUBLIC = makeSymbol( "DEFMACRO-PUBLIC" );
    $sym11$REGISTER_CYC_API_MACRO = makeSymbol( "REGISTER-CYC-API-MACRO" );
    $sym12$DEFINE_EXTERNAL = makeSymbol( "DEFINE-EXTERNAL" );
    $list13 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "PATTERN" ), makeSymbol( "DOCUMENTATION-STRING" ), makeSymbol( "TYPE-DECLARATIONS" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym14$REGISTER_EXTERNAL_SYMBOL = makeSymbol( "REGISTER-EXTERNAL-SYMBOL" );
    $sym15$_API_SPECIAL_TABLE_ = makeSymbol( "*API-SPECIAL-TABLE*" );
    $str16$Registering__A_as_special_even_th = makeString( "Registering ~A as special even though it's already predefined!" );
    $sym17$_API_PREDEFINED_FUNCTION_TABLE_ = makeSymbol( "*API-PREDEFINED-FUNCTION-TABLE*" );
    $int18$1000 = makeInteger( 1000 );
    $sym19$_API_PREDEFINED_HOST_FUNCTION_TABLE_ = makeSymbol( "*API-PREDEFINED-HOST-FUNCTION-TABLE*" );
    $int20$100 = makeInteger( 100 );
    $sym21$_API_PREDEFINED_MACRO_TABLE_ = makeSymbol( "*API-PREDEFINED-MACRO-TABLE*" );
    $sym22$_API_PREDEFINED_HOST_MACRO_TABLE_ = makeSymbol( "*API-PREDEFINED-HOST-MACRO-TABLE*" );
    $sym23$_API_SYMBOLS_ = makeSymbol( "*API-SYMBOLS*" );
    $kw24$CYC_API_SYMBOL = makeKeyword( "CYC-API-SYMBOL" );
    $sym25$SYMBOLP = makeSymbol( "SYMBOLP" );
    $kw26$CYC_API_ARGS = makeKeyword( "CYC-API-ARGS" );
    $kw27$CYC_API_ARG_TYPES = makeKeyword( "CYC-API-ARG-TYPES" );
    $kw28$CYC_API_RETURN_TYPES = makeKeyword( "CYC-API-RETURN-TYPES" );
    $sym29$_API_TYPES_ = makeSymbol( "*API-TYPES*" );
    $kw30$REPLACEMENTS = makeKeyword( "REPLACEMENTS" );
    $str31$_replacements_not_allowed_in_the_ = makeString( ":replacements not allowed in the declaration of Cyc API function" );
    $kw32$ARGUMENT_TYPES = makeKeyword( "ARGUMENT-TYPES" );
    $kw33$RETURN_TYPES = makeKeyword( "RETURN-TYPES" );
    $sym34$ENFORCE_TYPE = makeSymbol( "ENFORCE-TYPE" );
    $sym35$NIL_OR = makeSymbol( "NIL-OR" );
    $str36$Invalid_argument_type_expression_ = makeString( "Invalid argument-type expression ~S" );
    $sym37$PWHEN = makeSymbol( "PWHEN" );
    $str38$_S_return_type_expression_not_lis = makeString( "~S return type expression not list length 2." );
    $list39 = ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "NIL-OR" ) );
    $str40$_S_complex_return_type_expression = makeString( "~S complex return type expression not of form (nil-or X) or (list X)." );
    $sym41$DEFINE_AFTER_ADDING = makeSymbol( "DEFINE-AFTER-ADDING" );
    $sym42$DEFINE_KB = makeSymbol( "DEFINE-KB" );
    $sym43$DEFINE_AFTER_REMOVING = makeSymbol( "DEFINE-AFTER-REMOVING" );
    $sym44$DEFINE_RULE_AFTER_ADDING = makeSymbol( "DEFINE-RULE-AFTER-ADDING" );
    $sym45$DEFINE_RULE_AFTER_REMOVING = makeSymbol( "DEFINE-RULE-AFTER-REMOVING" );
    $sym46$DEFINE_COLLECTION_DEFN = makeSymbol( "DEFINE-COLLECTION-DEFN" );
    $sym47$DEFINE_EVALUATION_DEFN = makeSymbol( "DEFINE-EVALUATION-DEFN" );
    $list48 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "PATTERN" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym49$DEFINE_EXPANSION_DEFN = makeSymbol( "DEFINE-EXPANSION-DEFN" );
    $sym50$DEFINE_CYC_SUBL_DEFN = makeSymbol( "DEFINE-CYC-SUBL-DEFN" );
    $list51 = ConsesLow.list( makeSymbol( "FUNCTION-SYMBOL" ), makeSymbol( "BASIS-FUNCTION" ) );
    $list52 = ConsesLow.list( makeSymbol( "OBJECT" ) );
    $list53 = ConsesLow.list( makeSymbol( "SUBL-ESCAPE-P" ), makeSymbol( "OBJECT" ) );
    $sym54$RET = makeSymbol( "RET" );
    $list55 = ConsesLow.list( ConsesLow.list( makeSymbol( "SUBL-ESCAPE-SUBL" ), makeSymbol( "OBJECT" ) ) );
    $sym56$DEFINE = makeSymbol( "DEFINE" );
    $sym57$REGISTER_KB_FUNCTION = makeSymbol( "REGISTER-KB-FUNCTION" );
    $sym58$_KB_FUNCTION_TABLE_ = makeSymbol( "*KB-FUNCTION-TABLE*" );
    $int59$400 = makeInteger( 400 );
    $sym60$STRING_LESSP = makeSymbol( "STRING-LESSP" );
    $sym61$SYMBOL_NAME = makeSymbol( "SYMBOL-NAME" );
    $sym62$DEREGISTER_KB_FUNCTION = makeSymbol( "DEREGISTER-KB-FUNCTION" );
    $sym63$DEFINE_PRIVATE = makeSymbol( "DEFINE-PRIVATE" );
    $sym64$NOTE_FUNCALL_HELPER_FUNCTION = makeSymbol( "NOTE-FUNCALL-HELPER-FUNCTION" );
    $sym65$_FUNCALL_HELPER_PROPERTY_ = makeSymbol( "*FUNCALL-HELPER-PROPERTY*" );
    $kw66$FUNCALL_HELPER = makeKeyword( "FUNCALL-HELPER" );
    $sym67$DEFINE_PRIVATE_FUNCALL = makeSymbol( "DEFINE-PRIVATE-FUNCALL" );
    $sym68$_UNPROVIDED_ = makeSymbol( "*UNPROVIDED*" );
    $str69$UNPROVIDED = makeString( "UNPROVIDED" );
    $list70 = ConsesLow.list( makeSymbol( "VARIABLE" ), makeSymbol( "FANCY-NAME" ), makeSymbol( "DESCRIPTION" ), makeSymbol( "SETTINGS-SPEC" ) );
    $sym71$DECLARE_CONTROL_PARAMETER_INTERNAL = makeSymbol( "DECLARE-CONTROL-PARAMETER-INTERNAL" );
    $kw72$FANCY_NAME = makeKeyword( "FANCY-NAME" );
    $kw73$DESCRIPTION = makeKeyword( "DESCRIPTION" );
    $kw74$SETTINGS_SPEC = makeKeyword( "SETTINGS-SPEC" );
    $sym75$CCATCH_IGNORE = makeSymbol( "CCATCH-IGNORE" );
    $kw76$MAPPING_DONE = makeKeyword( "MAPPING-DONE" );
    $kw77$SBHL_MAPPING_DONE = makeKeyword( "SBHL-MAPPING-DONE" );
    $list78 = ConsesLow.list( makeSymbol( "OBJ" ) );
    $sym79$WRITE_BYTE = makeSymbol( "WRITE-BYTE" );
    $list80 = ConsesLow.list( makeSymbol( "*CFASL-STREAM*" ) );
    $list81 = ConsesLow.list( makeSymbol( "READ-BYTE" ), makeSymbol( "*CFASL-STREAM*" ), NIL, NIL );
    $list82 = ConsesLow.list( makeSymbol( "LOCK" ), makeSymbol( "ACTION" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "ELSE-ACTION" ) );
    $sym83$LOCK_VAR = makeUninternedSymbol( "LOCK-VAR" );
    $sym84$CLET = makeSymbol( "CLET" );
    $sym85$PIF = makeSymbol( "PIF" );
    $sym86$LOCK_IDLE_P = makeSymbol( "LOCK-IDLE-P" );
    $sym87$WITH_LOCK_HELD = makeSymbol( "WITH-LOCK-HELD" );
    $list88 = ConsesLow.list( makeSymbol( "LOCK" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list89 = ConsesLow.list( makeSymbol( "VARIABLE" ), makeSymbol( "NAME" ), makeSymbol( "&KEY" ), makeSymbol( "VACCESS" ), makeSymbol( "DOCUMENTATION" ) );
    $list90 = ConsesLow.list( makeKeyword( "VACCESS" ), makeKeyword( "DOCUMENTATION" ) );
    $kw91$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw92$VACCESS = makeKeyword( "VACCESS" );
    $kw93$DOCUMENTATION = makeKeyword( "DOCUMENTATION" );
    $sym94$DECLAIM = makeSymbol( "DECLAIM" );
    $sym95$VACCESS = makeSymbol( "VACCESS" );
    $sym96$DEFGLOBAL = makeSymbol( "DEFGLOBAL" );
    $sym97$REGISTER_GLOBAL_LOCK = makeSymbol( "REGISTER-GLOBAL-LOCK" );
    $sym98$_GLOBAL_LOCKS_ = makeSymbol( "*GLOBAL-LOCKS*" );
    $list99 = ConsesLow.cons( makeSymbol( "GLOBAL" ), makeSymbol( "NAME" ) );
    $sym100$CAR = makeSymbol( "CAR" );
    $sym101$MAKE_LOCK = makeSymbol( "MAKE-LOCK" );
    $sym102$GLOBAL_LOCK_P = makeSymbol( "GLOBAL-LOCK-P" );
    $sym103$INITIALIZE_GLOBAL_LOCK_INTERNAL = makeSymbol( "INITIALIZE-GLOBAL-LOCK-INTERNAL" );
    $sym104$INITIALIZE_GLOBAL_LOCKS = makeSymbol( "INITIALIZE-GLOBAL-LOCKS" );
    $sym105$CSETQ = makeSymbol( "CSETQ" );
    $sym106$_FI_STATE_VARIABLES_ = makeSymbol( "*FI-STATE-VARIABLES*" );
    $list107 = ConsesLow.list( makeSymbol( "VARIABLE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "INITIALIZATION" ), makeSymbol( "DOCUMENTATION" ) );
    $sym108$DEFPARAMETER_HTML = makeSymbol( "DEFPARAMETER-HTML" );
    $sym109$CPUSHNEW = makeSymbol( "CPUSHNEW" );
    $list110 = ConsesLow.list( makeSymbol( "*FI-STATE-VARIABLES*" ) );
    $sym111$CPROGV = makeSymbol( "CPROGV" );
    $list112 = ConsesLow.list( makeSymbol( "MAKE-LIST" ), ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "*FI-STATE-VARIABLES*" ) ), NIL );
    $sym113$_HTML_STATE_VARIABLES_ = makeSymbol( "*HTML-STATE-VARIABLES*" );
    $sym114$DEFPARAMETER = makeSymbol( "DEFPARAMETER" );
    $sym115$REGISTER_HTML_STATE_VARIABLE = makeSymbol( "REGISTER-HTML-STATE-VARIABLE" );
    $sym116$DEFVAR = makeSymbol( "DEFVAR" );
    $sym117$_HTML_INTERFACE_VARIABLES_ = makeSymbol( "*HTML-INTERFACE-VARIABLES*" );
    $sym118$REGISTER_HTML_INTERFACE_VARIABLE = makeSymbol( "REGISTER-HTML-INTERFACE-VARIABLE" );
    $list119 = ConsesLow.list( makeSymbol( "VARIABLE" ), makeSymbol( "STATE-VARIABLES" ), makeSymbol( "INITIALIZATION" ), makeSymbol( "DOCUMENTATION" ), makeSymbol( "TYPE" ) );
    $sym120$NOTE_STATE_VARIABLE_DOCUMENTATION = makeSymbol( "NOTE-STATE-VARIABLE-DOCUMENTATION" );
    $sym121$DEF_STATE_VARIABLE = makeSymbol( "DEF-STATE-VARIABLE" );
    $kw122$VARIABLE_DOC = makeKeyword( "VARIABLE-DOC" );
    $kw123$VARIABLE = makeKeyword( "VARIABLE" );
    $kw124$PARAMETER = makeKeyword( "PARAMETER" );
    $kw125$GLOBAL = makeKeyword( "GLOBAL" );
    $kw126$LEXICAL = makeKeyword( "LEXICAL" );
    $sym127$DEFLEXICAL = makeSymbol( "DEFLEXICAL" );
    $kw128$CONSTANT = makeKeyword( "CONSTANT" );
    $sym129$DEFCONSTANT = makeSymbol( "DEFCONSTANT" );
    $kw130$PARAMETER_PRIVATE = makeKeyword( "PARAMETER-PRIVATE" );
    $sym131$DEFPARAMETER_PRIVATE = makeSymbol( "DEFPARAMETER-PRIVATE" );
    $kw132$PARAMETER_PUBLIC = makeKeyword( "PARAMETER-PUBLIC" );
    $sym133$DEFPARAMETER_PUBLIC = makeSymbol( "DEFPARAMETER-PUBLIC" );
    $kw134$PARAMETER_PROTECTECD = makeKeyword( "PARAMETER-PROTECTECD" );
    $str135$unknown_variable_type__s__ = makeString( "unknown variable type ~s~%" );
    $kw136$FUNCTION = makeKeyword( "FUNCTION" );
    $kw137$FUNCTION_DOC = makeKeyword( "FUNCTION-DOC" );
    $kw138$STRUCTURE = makeKeyword( "STRUCTURE" );
    $kw139$STRUCTURE_DOC = makeKeyword( "STRUCTURE-DOC" );
    $kw140$TYPE = makeKeyword( "TYPE" );
    $kw141$TYPE_DOC = makeKeyword( "TYPE-DOC" );
    $sym142$_GT_STATE_VARIABLES_ = makeSymbol( "*GT-STATE-VARIABLES*" );
    $list143 = ConsesLow.list( makeSymbol( "VARIABLE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "INITIALIZATION" ), makeSymbol( "DOCUMENTATION" ), ConsesLow.list( makeSymbol( "TYPE" ), makeKeyword( "PARAMETER" ) ) );
    $sym144$_AT_STATE_VARIABLES_ = makeSymbol( "*AT-STATE-VARIABLES*" );
    $sym145$_DEFN_STATE_VARIABLES_ = makeSymbol( "*DEFN-STATE-VARIABLES*" );
    $list146 = ConsesLow.list( makeSymbol( "VARIABLE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "INITIALIZATION" ), makeSymbol( "DOCUMENTATION" ), ConsesLow.list( makeSymbol( "TYPE" ), makeKeyword(
        "PARAMETER-PROTECTECD" ) ) );
    $sym147$_KBI_STATE_VARIABLES_ = makeSymbol( "*KBI-STATE-VARIABLES*" );
    $sym148$_KBP_STATE_VARIABLES_ = makeSymbol( "*KBP-STATE-VARIABLES*" );
    $list149 = ConsesLow.list( ConsesLow.list( makeSymbol( "*NODES-ACCESSOR-FN*" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "FUNCTION-SPEC-P" ), makeSymbol( "*NODES-ACCESSOR-FN*" ) ), makeSymbol(
        "*NODES-ACCESSOR-FN*" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "ALL-ASSERTION-TERMS" ) ) ) ), ConsesLow.list( makeSymbol( "*PATH-LINK-OP*" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list(
            makeSymbol( "FUNCTION-SPEC-P" ), makeSymbol( "*PATH-LINK-OP*" ) ), makeSymbol( "*PATH-LINK-OP*" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "DEFAULT-LINK-OP" ) ) ) ), ConsesLow.list( makeSymbol(
                "*PATH-NODE-OP*" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "FUNCTION-SPEC-P" ), makeSymbol( "*PATH-NODE-OP*" ) ), makeSymbol( "*PATH-NODE-OP*" ), ConsesLow.list( makeSymbol(
                    "FUNCTION" ), makeSymbol( "DEFAULT-NODE-OP" ) ) ) ), ConsesLow.list( makeSymbol( "*RELEVANT-LINK?*" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "FUNCTION-SPEC-P" ), makeSymbol(
                        "*RELEVANT-LINK?*" ) ), makeSymbol( "*RELEVANT-LINK?*" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "DEFAULT-RELEVANT-LINK?" ) ) ) ), ConsesLow.list( makeSymbol( "*RELEVANT-NODE?*" ),
                            ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "FUNCTION-SPEC-P" ), makeSymbol( "*RELEVANT-NODE?*" ) ), makeSymbol( "*RELEVANT-NODE?*" ), ConsesLow.list( makeSymbol(
                                "FUNCTION" ), makeSymbol( "DEFAULT-RELEVANT-NODE?" ) ) ) ), ConsesLow.list( makeSymbol( "*RELEVANT-LINK-TREE?*" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol(
                                    "FUNCTION-SPEC-P" ), makeSymbol( "*RELEVANT-LINK-TREE?*" ) ), makeSymbol( "*RELEVANT-LINK-TREE?*" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol(
                                        "DEFAULT-RELEVANT-LINK-TREE?" ) ) ) ) );
    $list150 = ConsesLow.list( ConsesLow.list( makeSymbol( "MACHINE" ), makeSymbol( "PORT" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym151$CYC_API_REMOTE_EVAL = makeSymbol( "CYC-API-REMOTE-EVAL" );
    $list152 = ConsesLow.list( ConsesLow.list( makeSymbol( "ENVIRONMENT" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym153$CHECK_TYPE = makeSymbol( "CHECK-TYPE" );
    $list154 = ConsesLow.list( makeSymbol( "QUEUE-P" ) );
    $sym155$_FORWARD_INFERENCE_ENVIRONMENT_ = makeSymbol( "*FORWARD-INFERENCE-ENVIRONMENT*" );
    $sym156$ENVIRONMENT = makeUninternedSymbol( "ENVIRONMENT" );
    $list157 = ConsesLow.list( ConsesLow.list( makeSymbol( "GET-FORWARD-INFERENCE-ENVIRONMENT" ) ) );
    $sym158$WITH_FORWARD_INFERENCE_ENVIRONMENT = makeSymbol( "WITH-FORWARD-INFERENCE-ENVIRONMENT" );
    $sym159$ENVIRONMENT = makeUninternedSymbol( "ENVIRONMENT" );
    $list160 = ConsesLow.list( ConsesLow.list( makeSymbol( "POSSIBLY-GET-FORWARD-INFERENCE-ENVIRONMENT" ) ) );
    $sym161$POSSIBLY_GET_FORWARD_INFERENCE_ENVIRONMENT = makeSymbol( "POSSIBLY-GET-FORWARD-INFERENCE-ENVIRONMENT" );
    $sym162$WITH_POSSIBLY_CLEAN_FORWARD_INFERENCE_ENVIRONMENT = makeSymbol( "WITH-POSSIBLY-CLEAN-FORWARD-INFERENCE-ENVIRONMENT" );
    $list163 = ConsesLow.list( ConsesLow.list( makeSymbol( "*CURRENT-FORWARD-PROBLEM-STORE*" ), NIL ) );
    $sym164$CUNWIND_PROTECT = makeSymbol( "CUNWIND-PROTECT" );
    $list165 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLEAR-CURRENT-FORWARD-PROBLEM-STORE" ) ) );
    $list166 = ConsesLow.list( ConsesLow.list( makeSymbol( "*WITHIN-ASSERTION-FORWARD-PROPAGATION?*" ), NIL ), ConsesLow.list( makeSymbol( "*PREFER-FORWARD-SKOLEMIZATION*" ), NIL ) );
    $sym167$WITH_NORMAL_FORWARD_INFERENCE_PARAMETERS = makeSymbol( "WITH-NORMAL-FORWARD-INFERENCE-PARAMETERS" );
    $sym168$WITH_CLEAN_FORWARD_INFERENCE_ENVIRONMENT = makeSymbol( "WITH-CLEAN-FORWARD-INFERENCE-ENVIRONMENT" );
    $sym169$WITH_CLEAN_FORWARD_PROBLEM_STORE_ENVIRONMENT = makeSymbol( "WITH-CLEAN-FORWARD-PROBLEM-STORE-ENVIRONMENT" );
    $sym170$ERROR = makeUninternedSymbol( "ERROR" );
    $sym171$CATCH_ERROR_MESSAGE = makeSymbol( "CATCH-ERROR-MESSAGE" );
    $list172 = ConsesLow.list( ConsesLow.list( makeSymbol( "THROW-UNEVALUATABLE" ) ) );
    $list173 = ConsesLow.list( ConsesLow.list( makeSymbol( "TRACEE" ), makeSymbol( "LEVEL" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym174$TRACING_AT_LEVEL = makeSymbol( "TRACING-AT-LEVEL" );
    $list175 = ConsesLow.list( makeSymbol( "RESOURCE?" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $kw176$SL2JAVA = makeKeyword( "SL2JAVA" );
    $sym177$_STRUCTURE_RESOURCING_MAKE_STATIC_ = makeSymbol( "*STRUCTURE-RESOURCING-MAKE-STATIC*" );
    $sym178$WITH_STATIC_AREA = makeSymbol( "WITH-STATIC-AREA" );
    $list179 = ConsesLow.list( makeSymbol( "STRUCTURE" ), makeSymbol( "LINK-SLOT" ), makeSymbol( "MARK-SLOT" ), ConsesLow.list( makeSymbol( "OBJECT" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $str180$__A_FREE_LIST_ = makeString( "*~A-FREE-LIST*" );
    $str181$Free_list_for__A_objects = makeString( "Free list for ~A objects" );
    $str182$__A_FREE_LOCK_ = makeString( "*~A-FREE-LOCK*" );
    $str183$Lock_for__A_object_free_list = makeString( "Lock for ~A object free list" );
    $str184$_A_resource_lock = makeString( "~A resource lock" );
    $str185$MAKE_STATIC__A = makeString( "MAKE-STATIC-~A" );
    $str186$Make_a_new__A_in_the_static_area = makeString( "Make a new ~A in the static area" );
    $str187$INIT__A = makeString( "INIT-~A" );
    $str188$Initialize_a__A_for_use = makeString( "Initialize a ~A for use" );
    $str189$GET__A = makeString( "GET-~A" );
    $str190$Get_a__A_from_the_free_list__or_m = makeString( "Get a ~A from the free list, or make a new one if needed" );
    $str191$FREE__A_P = makeString( "FREE-~A-P" );
    $str192$Check_if_OBJECT_is_a__A_that_has_ = makeString( "Check if OBJECT is a ~A that has been explicitly freed" );
    $str193$FREE__A = makeString( "FREE-~A" );
    $str194$Place_a__A_onto_the_free_list = makeString( "Place a ~A onto the free list" );
    $str195$MAKE__A = makeString( "MAKE-~A" );
    $str196$_A_P = makeString( "~A-P" );
    $sym197$DEFLEXICAL_PRIVATE = makeSymbol( "DEFLEXICAL-PRIVATE" );
    $sym198$OBJECT = makeSymbol( "OBJECT" );
    $list199 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "OBJECT" ) ) );
    $sym200$CAND = makeSymbol( "CAND" );
    $list201 = ConsesLow.list( makeKeyword( "FREE" ) );
    $sym202$PUNLESS = makeSymbol( "PUNLESS" );
    $sym203$CSETF = makeSymbol( "CSETF" );
    $sym204$_STRUCTURE_RESOURCING_ENABLED_ = makeSymbol( "*STRUCTURE-RESOURCING-ENABLED*" );
    $list205 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), T ) );
    $list206 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $list207 = ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "FOUND" ) );
    $sym208$CDO = makeSymbol( "CDO" );
    $list209 = ConsesLow.list( ConsesLow.list( makeSymbol( "COR" ), makeSymbol( "FOUND" ), ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "OBJECT" ) ) ) );
    $list210 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "FOUND" ), T ) );
    $sym211$FOUND = makeSymbol( "FOUND" );
    $list212 = ConsesLow.list( NIL );
    $list213 = ConsesLow.list( ConsesLow.list( makeSymbol( "*READ-EVAL*" ), NIL ) );
    $list214 = ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym215$STR = makeUninternedSymbol( "STR" );
    $list216 = ConsesLow.list( makeSymbol( "*PROGRESS-START-TIME*" ), ConsesLow.list( makeSymbol( "GET-UNIVERSAL-TIME" ) ) );
    $list217 = ConsesLow.list( makeSymbol( "*PROGRESS-LAST-PACIFICATION-TIME*" ), makeSymbol( "*PROGRESS-START-TIME*" ) );
    $list218 = ConsesLow.list( makeSymbol( "*PROGRESS-ELAPSED-SECONDS-FOR-NOTIFICATION*" ), makeSymbol( "*SUPPRESS-ALL-PROGRESS-FASTER-THAN-SECONDS*" ) );
    $list219 = ConsesLow.list( makeSymbol( "*PROGRESS-NOTIFICATION-COUNT*" ), ZERO_INTEGER );
    $list220 = ConsesLow.list( makeSymbol( "*PROGRESS-PACIFICATIONS-SINCE-LAST-NL*" ), ZERO_INTEGER );
    $list221 = ConsesLow.list( makeSymbol( "*PROGRESS-COUNT*" ), ZERO_INTEGER );
    $list222 = ConsesLow.list( makeSymbol( "*IS-NOTING-PROGRESS?*" ), T );
    $sym223$_SILENT_PROGRESS__ = makeSymbol( "*SILENT-PROGRESS?*" );
    $sym224$FIF = makeSymbol( "FIF" );
    $list225 = ConsesLow.list( makeSymbol( "*SILENT-PROGRESS?*" ), T );
    $sym226$NOTING_PROGRESS_PREAMBLE = makeSymbol( "NOTING-PROGRESS-PREAMBLE" );
    $list227 = ConsesLow.list( ConsesLow.list( makeSymbol( "NOTING-PROGRESS-POSTAMBLE" ) ) );
    $list228 = ConsesLow.list( makeSymbol( "DELAYED-MODE-SECONDS" ), makeSymbol( "STRING" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym229$_NOTING_PROGRESS_DELAYED_MODE_SECONDS_ = makeSymbol( "*NOTING-PROGRESS-DELAYED-MODE-SECONDS*" );
    $sym230$_NOTING_PROGRESS_DELAYED_MODE_STRING_ = makeSymbol( "*NOTING-PROGRESS-DELAYED-MODE-STRING*" );
    $sym231$NOTING_PROGRESS = makeSymbol( "NOTING-PROGRESS" );
    $str232$___A = makeString( "~&~A" );
    $list233 = ConsesLow.list( Characters.CHAR_period, Characters.CHAR_space );
    $str234$___A____ = makeString( "~&~A ..." );
    $sym235$NOTING_PROGRESS_POSTAMBLE = makeSymbol( "NOTING-PROGRESS-POSTAMBLE" );
    $str236$__ = makeString( " (" );
    $str237$_DONE__ = makeString( " DONE (" );
    $int238$600 = makeInteger( 600 );
    $str239$__ended__A = makeString( ", ended ~A" );
    $str240$_ = makeString( ")" );
    $sym241$NOTE_PROGRESS = makeSymbol( "NOTE-PROGRESS" );
    $int242$50 = makeInteger( 50 );
    $int243$200 = makeInteger( 200 );
    $int244$30 = makeInteger( 30 );
    $int245$25 = makeInteger( 25 );
    $str246$__A_ = makeString( "(~A)" );
    $str247$_ = makeString( "." );
    $sym248$IGNORE = makeSymbol( "IGNORE" );
    $list249 = ConsesLow.list( ConsesLow.list( makeSymbol( "*LAST-PERCENT-PROGRESS-INDEX*" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "*LAST-PERCENT-PROGRESS-PREDICTION*" ), NIL ), ConsesLow.list( makeSymbol(
        "*WITHIN-NOTING-PERCENT-PROGRESS*" ), T ), ConsesLow.list( makeSymbol( "*PERCENT-PROGRESS-START-TIME*" ), ConsesLow.list( makeSymbol( "GET-UNIVERSAL-TIME" ) ) ) );
    $sym250$NOTING_PERCENT_PROGRESS_PREAMBLE = makeSymbol( "NOTING-PERCENT-PROGRESS-PREAMBLE" );
    $list251 = ConsesLow.list( ConsesLow.list( makeSymbol( "NOTING-PERCENT-PROGRESS-POSTAMBLE" ) ) );
    $sym252$_PERCENT_PROGRESS_DELAYED_MODE_SECONDS_ = makeSymbol( "*PERCENT-PROGRESS-DELAYED-MODE-SECONDS*" );
    $sym253$_PERCENT_PROGRESS_DELAYED_MODE_STRING_ = makeSymbol( "*PERCENT-PROGRESS-DELAYED-MODE-STRING*" );
    $sym254$NOTING_PERCENT_PROGRESS = makeSymbol( "NOTING-PERCENT-PROGRESS" );
    $sym255$NOTING_PERCENT_PROGRESS_POSTAMBLE = makeSymbol( "NOTING-PERCENT-PROGRESS-POSTAMBLE" );
    $str256$____ = makeString( " ..." );
    $str257$__ = makeString( " ]" );
    $sym258$NOTE_PERCENT_PROGRESS = makeSymbol( "NOTE-PERCENT-PROGRESS" );
    $str259$__ = makeString( " [" );
    $str260$__ = makeString( "  " );
    $str261$01_ = makeString( "01%" );
    $int262$300 = makeInteger( 300 );
    $str263$02_ = makeString( "02%" );
    $int264$1200 = makeInteger( 1200 );
    $int265$_2 = makeInteger( -2 );
    $str266$_ = makeString( " " );
    $str267$_ = makeString( "%" );
    $str268$0 = makeString( "0" );
    $str269$_of_ = makeString( " of " );
    $str270$__ending__ = makeString( ", ending ~" );
    $int271$99 = makeInteger( 99 );
    $str272$ = makeString( "" );
    $str273$___A____D_of__D___02D___Done_at__ = makeString( "~%~A : ~D of ~D (~02D%) Done at ~A" );
    $str274$whenever = makeString( "whenever" );
    $list275 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "TOTAL" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "MESSAGE" ), makeString( "cdotimes" ) ) ), makeSymbol( "&BODY" ),
        makeSymbol( "BODY" ) );
    $str276$cdotimes = makeString( "cdotimes" );
    $sym277$_PROGRESS_NOTE_ = makeSymbol( "*PROGRESS-NOTE*" );
    $sym278$_PROGRESS_TOTAL_ = makeSymbol( "*PROGRESS-TOTAL*" );
    $list279 = ConsesLow.list( ConsesLow.list( makeSymbol( "*PROGRESS-SOFAR*" ), ZERO_INTEGER ) );
    $sym280$CDOTIMES = makeSymbol( "CDOTIMES" );
    $list281 = ConsesLow.list( makeSymbol( "*PROGRESS-TOTAL*" ) );
    $list282 = ConsesLow.list( ConsesLow.list( makeSymbol( "CINC" ), makeSymbol( "*PROGRESS-SOFAR*" ) ), ConsesLow.list( makeSymbol( "NOTE-PERCENT-PROGRESS" ), makeSymbol( "*PROGRESS-SOFAR*" ), makeSymbol(
        "*PROGRESS-TOTAL*" ) ) );
    $list283 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "LIST" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "MESSAGE" ), makeString( "cdolist" ) ), makeSymbol( "ENDVAR" ) ),
        makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $str284$cdolist = makeString( "cdolist" );
    $sym285$LIST_VAR = makeUninternedSymbol( "LIST-VAR" );
    $list286 = ConsesLow.list( makeString( "cdolist" ) );
    $sym287$LENGTH = makeSymbol( "LENGTH" );
    $sym288$CSOME = makeSymbol( "CSOME" );
    $sym289$PROGRESS_CDOLIST = makeSymbol( "PROGRESS-CDOLIST" );
    $list290 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "LIST" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "MESSAGE" ), makeString( "cdolist" ) ) ), makeSymbol( "&BODY" ),
        makeSymbol( "BODY" ) );
    $sym291$PROGRESS_CSOME = makeSymbol( "PROGRESS-CSOME" );
    $list292 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "LIST" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MESSAGE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym293$MESSAGE_VAR = makeUninternedSymbol( "MESSAGE-VAR" );
    $sym294$CDOLIST = makeSymbol( "CDOLIST" );
    $list295 = ConsesLow.list( ConsesLow.list( makeSymbol( "KEY" ), makeSymbol( "VAL" ), makeSymbol( "TABLE" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "MESSAGE" ), makeString( "cdohash" ) ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $str296$cdohash = makeString( "cdohash" );
    $sym297$TABLE_VAR = makeUninternedSymbol( "TABLE-VAR" );
    $sym298$HASH_TABLE_COUNT = makeSymbol( "HASH-TABLE-COUNT" );
    $sym299$CDOHASH = makeSymbol( "CDOHASH" );
    $list300 = ConsesLow.list( ConsesLow.list( makeSymbol( "ELEM" ), makeSymbol( "SET" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "MESSAGE" ), makeString( "do-set" ) ) ), makeSymbol( "&BODY" ), makeSymbol(
        "BODY" ) );
    $str301$do_set = makeString( "do-set" );
    $sym302$SET_VAR = makeUninternedSymbol( "SET-VAR" );
    $sym303$SET_SIZE = makeSymbol( "SET-SIZE" );
    $sym304$DO_SET = makeSymbol( "DO-SET" );
    $list305 = ConsesLow.list( ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "MESSAGE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list306 = ConsesLow.list( makeKeyword( "MESSAGE" ) );
    $kw307$MESSAGE = makeKeyword( "MESSAGE" );
    $sym308$MESSAGE_VAR = makeUninternedSymbol( "MESSAGE-VAR" );
    $sym309$START_TIME = makeUninternedSymbol( "START-TIME" );
    $sym310$NOTING_ELAPSED_TIME_PREAMBLE = makeSymbol( "NOTING-ELAPSED-TIME-PREAMBLE" );
    $sym311$NOTING_ELAPSED_TIME_POSTAMBLE = makeSymbol( "NOTING-ELAPSED-TIME-POSTAMBLE" );
    $sym312$NOTING_ELAPSED_TIME = makeSymbol( "NOTING-ELAPSED-TIME" );
    $str313$___A_started__at__A = makeString( "~&~A started  at ~A" );
    $str314$___A_finished_at__A_after_A = makeString( "~&~A finished at ~A after~A" );
    $sym315$WITH_SUBLISP_ERROR_HANDLING = makeSymbol( "WITH-SUBLISP-ERROR-HANDLING" );
    $list316 = ConsesLow.list( ConsesLow.list( makeSymbol( "*PACKAGE*" ), ConsesLow.list( makeSymbol( "FIND-PACKAGE" ), makeString( "CYC" ) ) ), ConsesLow.list( makeSymbol( "*READ-DEFAULT-FLOAT-FORMAT*" ), ConsesLow
        .list( makeSymbol( "QUOTE" ), makeSymbol( "DOUBLE-FLOAT" ) ) ), ConsesLow.list( makeSymbol( "*PRINT-READABLY*" ), NIL ), ConsesLow.list( makeSymbol( "*READ-EVAL*" ), NIL ), ConsesLow.list( makeSymbol(
            "OLD-PRIORITY" ), ConsesLow.list( makeSymbol( "PROCESS-PRIORITY" ), ConsesLow.list( makeSymbol( "CURRENT-PROCESS" ) ) ) ) );
    $list317 = ConsesLow.list( makeSymbol( "SET-PROCESS-PRIORITY" ), ConsesLow.list( makeSymbol( "CURRENT-PROCESS" ) ), makeSymbol( "*PROCESS-NORMAL-PRIORITY*" ) );
    $list318 = ConsesLow.list( ConsesLow.list( makeSymbol( "SET-PROCESS-PRIORITY" ), ConsesLow.list( makeSymbol( "CURRENT-PROCESS" ) ), makeSymbol( "OLD-PRIORITY" ) ) );
    $list319 = ConsesLow.list( ConsesLow.list( makeSymbol( "*PACKAGE*" ), ConsesLow.list( makeSymbol( "FIND-PACKAGE" ), makeString( "CYC" ) ) ), ConsesLow.list( makeSymbol( "*PRINT-READABLY*" ), NIL ), ConsesLow.list(
        makeSymbol( "*READ-EVAL*" ), NIL ) );
    $sym320$WITH_CYC_SERVER_HANDLING = makeSymbol( "WITH-CYC-SERVER-HANDLING" );
    $sym321$WITH_CYC_IO_SYNTAX = makeSymbol( "WITH-CYC-IO-SYNTAX" );
    $list322 = ConsesLow.list( ConsesLow.list( makeSymbol( "*READ-DEFAULT-FLOAT-FORMAT*" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DOUBLE-FLOAT" ) ) ) );
    $list323 = ConsesLow.list( ConsesLow.list( makeSymbol( "CYCLIST" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym324$OLD_CYCLIST = makeUninternedSymbol( "OLD-CYCLIST" );
    $list325 = ConsesLow.list( ConsesLow.list( makeSymbol( "THE-CYCLIST" ) ) );
    $sym326$SET_THE_CYCLIST = makeSymbol( "SET-THE-CYCLIST" );
    $list327 = ConsesLow.list( ConsesLow.list( makeSymbol( "*THE-CYCLIST*" ), NIL ) );
    $list328 = ConsesLow.list( makeSymbol( "EL-VARIABLES" ), makeSymbol( "BINDINGS" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym329$BINDING = makeUninternedSymbol( "BINDING" );
    $sym330$SUBLIS = makeSymbol( "SUBLIS" );
    $str331$_S___var__S_is_not_a_symbol_ = makeString( "~S - var ~S is not a symbol." );
    $str332$_S___function__S_is_not_a_symbol_ = makeString( "~S - function ~S is not a symbol." );
    $str333$_S___search_type__S_is_not_one_of = makeString( "~S - search type ~S is not one of (:depth-first :breadth-first)." );
    $list334 = ConsesLow.list( makeSymbol( "LIST" ) );
    $sym335$NULL = makeSymbol( "NULL" );
    $sym336$CDR = makeSymbol( "CDR" );
    $sym337$CONSP = makeSymbol( "CONSP" );
    $list338 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "LIST-EXPRESSION" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym339$CDOSUBLISTS = makeSymbol( "CDOSUBLISTS" );
    $list340 = ConsesLow.list( ConsesLow.list( makeSymbol( "ELEMENT-VAR" ), makeSymbol( "SUBLIST-VAR" ), makeSymbol( "LIST-EXPRESSION" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym341$CDOLIST_AND_SUBLISTS = makeSymbol( "CDOLIST-AND-SUBLISTS" );
    $str342$next_cons_var = makeString( "next-cons-var" );
    $list343 = ConsesLow.list( ConsesLow.list( makeSymbol( "ELEMENT-VAR" ), makeSymbol( "LIST-EXPRESSION" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $str344$sublist = makeString( "sublist" );
    $sym345$WHILE = makeSymbol( "WHILE" );
    $list346 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "PREDICATE" ), makeSymbol( "LIST-EXPRESSION" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym347$CDOLIST_IF = makeSymbol( "CDOLIST-IF" );
    $sym348$CDOSUBLISTS_IF = makeSymbol( "CDOSUBLISTS-IF" );
    $sym349$CDOLIST_IF_NOT = makeSymbol( "CDOLIST-IF-NOT" );
    $sym350$CDOSUBLISTS_IF_NOT = makeSymbol( "CDOSUBLISTS-IF-NOT" );
    $list351 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR1" ), makeSymbol( "LIST1" ), makeSymbol( "VAR2" ), makeSymbol( "LIST2" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $str352$sublist1 = makeString( "sublist1" );
    $str353$sublist2 = makeString( "sublist2" );
    $list354 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "TREE" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "SEARCH-TYPE" ), makeKeyword( "DEPTH-FIRST" ) ), ConsesLow.list(
        makeSymbol( "VISIT-NILS" ), NIL ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $kw355$DEPTH_FIRST = makeKeyword( "DEPTH-FIRST" );
    $sym356$CDOTREE = makeSymbol( "CDOTREE" );
    $kw357$BREADTH_FIRST = makeKeyword( "BREADTH-FIRST" );
    $str358$tree_var = makeString( "tree-var" );
    $str359$cells_var = makeString( "cells-var" );
    $str360$tail_of_cells = makeString( "tail-of-cells" );
    $sym361$LIST = makeSymbol( "LIST" );
    $sym362$LAST = makeSymbol( "LAST" );
    $sym363$RPLACD = makeSymbol( "RPLACD" );
    $sym364$CPUSH = makeSymbol( "CPUSH" );
    $list365 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "TREE" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "SEARCH-TYPE" ), makeKeyword( "DEPTH-FIRST" ) ) ), makeSymbol( "&BODY" ),
        makeSymbol( "BODY" ) );
    $sym366$CDOTREE_CONSES = makeSymbol( "CDOTREE-CONSES" );
    $str367$tail_of_cells_var = makeString( "tail-of-cells-var" );
    $list368 = ConsesLow.list( ConsesLow.list( makeSymbol( "PARAMETER" ), makeSymbol( "VALUE" ), makeSymbol( "PLIST" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym369$DO_PLIST = makeSymbol( "DO-PLIST" );
    $sym370$CAAR = makeSymbol( "CAAR" );
    $sym371$CDAR = makeSymbol( "CDAR" );
    $sym372$CADR = makeSymbol( "CADR" );
    $sym373$CDDR = makeSymbol( "CDDR" );
    $list374 = ConsesLow.list( makeSymbol( "PATTERN" ), makeSymbol( "DATUM" ) );
    $str375$datum_evaluated_var = makeString( "datum-evaluated-var" );
    $sym376$NCONC = makeSymbol( "NCONC" );
    $str377$FAST_FUNCALL_NO_VALUE__contains_e = makeString( "FAST-FUNCALL-NO-VALUE: contains erroneous function name it its function name list." );
    $str378$FAST_FUNCALL_NO_VALUE__cannot_acc = makeString( "FAST-FUNCALL-NO-VALUE: cannot accept dotted list for its function name list." );
    $str379$FAST_FUNCALL_NO_VALUE__function_n = makeString( "FAST-FUNCALL-NO-VALUE: function name list must be a list." );
    $list380 = ConsesLow.list( makeSymbol( "FUNCTION-FORM" ), makeSymbol( "FUNCTION-NAME-LIST" ), makeSymbol( "&REST" ), makeSymbol( "ARGS" ) );
    $sym381$FUNCALL = makeSymbol( "FUNCALL" );
    $str382$function_form_evaluated_var = makeString( "function-form-evaluated-var" );
    $sym383$PCASE = makeSymbol( "PCASE" );
    $sym384$OTHERWISE = makeSymbol( "OTHERWISE" );
    $list385 = ConsesLow.list( makeSymbol( "VAR-TO-SET" ), makeSymbol( "FUNCTION-FORM" ), makeSymbol( "FUNCTION-NAME-LIST" ), makeSymbol( "&REST" ), makeSymbol( "ARGS" ) );
    $list386 = ConsesLow.list( makeSymbol( "VARS-TO-BIND" ), ConsesLow.listS( makeSymbol( "FUNCTION-FORM" ), makeSymbol( "FUNCTION-NAME-LIST" ), makeSymbol( "ARGS" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym387$CMULTIPLE_VALUE_BIND = makeSymbol( "CMULTIPLE-VALUE-BIND" );
    $list388 = ConsesLow.list( makeSymbol( "VARS-TO-SET" ), makeSymbol( "FUNCTION-FORM" ), makeSymbol( "FUNCTION-NAME-LIST" ), makeSymbol( "&REST" ), makeSymbol( "ARGS" ) );
    $sym389$CMULTIPLE_VALUE_SETQ = makeSymbol( "CMULTIPLE-VALUE-SETQ" );
    $list390 = ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "&REST" ), makeSymbol( "ARGS" ) );
    $list391 = ConsesLow.list( makeSymbol( "PREDICATION-STRUCTURE" ), makeSymbol( "OPERAND" ) );
    $list392 = ConsesLow.list( makeSymbol( "INLINE-SET-SYMBOL" ), makeSymbol( "INLINE-GET-SYMBOL" ), makeSymbol( "INLINE-METHOD" ) );
    $str393$_A_S = makeString( "~A~S" );
    $list394 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "LIST-EXPRESSION" ), makeSymbol( "COLLECTION-VAR" ) ), makeSymbol( "ITERATED-EXPRESSION" ) );
    $str395$LIST_EXPRESSION = makeString( "LIST-EXPRESSION" );
    $str396$TAIL_CONS = makeString( "TAIL-CONS" );
    $str397$RESULT = makeString( "RESULT" );
    $sym398$PCOND = makeSymbol( "PCOND" );
    $sym399$ATOM = makeSymbol( "ATOM" );
    $kw400$API = makeKeyword( "API" );
    $sym401$DEFINE_API = makeSymbol( "DEFINE-API" );
    $kw402$PUBLIC = makeKeyword( "PUBLIC" );
    $kw403$PROTECTED = makeKeyword( "PROTECTED" );
    $sym404$DEFINE_PROTECTED = makeSymbol( "DEFINE-PROTECTED" );
    $kw405$PRIVATE = makeKeyword( "PRIVATE" );
    $kw406$ALL = makeKeyword( "ALL" );
    $list407 = ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "LISTP" ), makeSymbol( "LIST" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $kw408$NOT_EMPTY_ALL = makeKeyword( "NOT-EMPTY-ALL" );
    $list409 = ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "CONSP" ), makeSymbol( "LIST" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $kw410$ANY = makeKeyword( "ANY" );
    $str411$DEFINE_LIST_ELEMENT_PREDICATOR___ = makeString( "DEFINE-LIST-ELEMENT-PREDICATOR: ~S is not a valid type value." );
    $list412 = ConsesLow.list( makeSymbol( "FUNCTION-NAME" ), makeSymbol( "TYPE" ), ConsesLow.list( makeSymbol( "ELEMENT-VAR" ) ), makeSymbol( "EXPRESSION" ) );
    $sym413$_OPTIONAL = makeSymbol( "&OPTIONAL" );
    $sym414$CAR_IF_LIST = makeSymbol( "CAR-IF-LIST" );
    $str415$FCOND___S_is_not_a_valid_clause_l = makeString( "FCOND: ~S is not a valid clause list." );
    $str416$FCOND___S_is_not_a_valid_clause_ = makeString( "FCOND: ~S is not a valid clause." );
    $str417$P_RANGE_CASE__Ill_formed_clauses_ = makeString( "P-RANGE-CASE: Ill-formed clauses encountered -> ~S." );
    $str418$P_RANGE_CASE___S_is_not_a_valid_c = makeString( "P-RANGE-CASE: ~S is not a valid clause." );
    $str419$value = makeString( "value" );
    $sym420$__ = makeSymbol( ">=" );
    $sym421$__ = makeSymbol( "<=" );
    $sym422$_ = makeSymbol( "=" );
    $list423 = ConsesLow.list( makeSymbol( "VALUE" ), makeSymbol( "&BODY" ), makeSymbol( "CLAUSES" ) );
    $sym424$ERROR = makeSymbol( "ERROR" );
    $str425$Invalid_version_code__A_ = makeString( "Invalid version code ~A." );
    $list426 = ConsesLow.list( ConsesLow.list( makeSymbol( "VERSION" ) ), makeSymbol( "VERSION-BODIES" ), makeSymbol( "&KEY" ), makeSymbol( "ERROR-CLAUSE" ) );
    $list427 = ConsesLow.list( makeKeyword( "ERROR-CLAUSE" ) );
    $kw428$ERROR_CLAUSE = makeKeyword( "ERROR-CLAUSE" );
    $list429 = ConsesLow.list( makeSymbol( "VERSION" ), makeSymbol( "FORM" ) );
    $list430 = ConsesLow.list( ConsesLow.list( makeSymbol( "MAJOR" ), makeSymbol( "MINOR" ) ), makeSymbol( "VERSION-BODIES" ), makeSymbol( "&KEY" ), makeSymbol( "ERROR-CLAUSE" ) );
    $list431 = ConsesLow.list( makeSymbol( "MAJOR-VERSION" ), makeSymbol( "MINOR-VERSION" ), makeSymbol( "FORM" ) );
    $sym432$SUB_KB_LOADED_P_SYMBOL = makeSymbol( "SUB-KB-LOADED-P-SYMBOL" );
    $sym433$DECLARE_KB_FEATURE = makeSymbol( "DECLARE-KB-FEATURE" );
    $str434$_P = makeString( "-P" );
    $sym435$SUB_KB_SET_SYMBOL = makeSymbol( "SUB-KB-SET-SYMBOL" );
    $str436$SET_ = makeString( "SET-" );
    $sym437$SUB_KB_UNSET_SYMBOL = makeSymbol( "SUB-KB-UNSET-SYMBOL" );
    $str438$UNSET_ = makeString( "UNSET-" );
    $list439 = ConsesLow.list( makeSymbol( "SUB-KB-SYMBOL" ), makeSymbol( "LOADED-DOC-STRING" ) );
    $sym440$DEFGLOBAL_PRIVATE = makeSymbol( "DEFGLOBAL-PRIVATE" );
    $list441 = ConsesLow.list( makeSymbol( "*KB-FEATURES*" ) );
    $list442 = ConsesLow.list( T );
    $kw443$A = makeKeyword( "A" );
    $kw444$S = makeKeyword( "S" );
    $kw445$D = makeKeyword( "D" );
    $sym446$TO_STRING = makeSymbol( "TO-STRING" );
    $sym447$CCONCATENATE = makeSymbol( "CCONCATENATE" );
    $list448 = ConsesLow.list( makeKeyword( "A" ), makeKeyword( "S" ), makeKeyword( "D" ) );
    $str449$FORMAT_TO_STRING___S_is_an_invali = makeString( "FORMAT-TO-STRING: ~S is an invalid format arg.  ~\n           Format args must be a member of the set {:A, :S, :D}." );
    $str450$FORMAT_TO_STRING__Odd_number_of_a = makeString( "FORMAT-TO-STRING: Odd number of args encountered: ~S" );
    $sym451$TIME = makeUninternedSymbol( "TIME" );
    $sym452$CTIME = makeSymbol( "CTIME" );
    $sym453$FORMAT = makeSymbol( "FORMAT" );
    $str454$_____real_time__A_seconds__ = makeString( "~&;; real time ~A seconds~%" );
    $list455 = ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym456$TIMING_INFO = makeUninternedSymbol( "TIMING-INFO" );
    $sym457$CLOCK_TIME = makeUninternedSymbol( "CLOCK-TIME" );
    $sym458$WITH_PROCESS_RESOURCE_TRACKING = makeSymbol( "WITH-PROCESS-RESOURCE-TRACKING" );
    $sym459$CONVERT_PROCESS_RESOURCE_TRACKING_TIMING_INFO_TO_SECONDS = makeSymbol( "CONVERT-PROCESS-RESOURCE-TRACKING-TIMING-INFO-TO-SECONDS" );
    $sym460$NADD_CLOCK_TIME_TO_PROCESS_RESOURCE_TIMING_INFO = makeSymbol( "NADD-CLOCK-TIME-TO-PROCESS-RESOURCE-TIMING-INFO" );
    $list461 = ConsesLow.list( makeKeyword( "USER-TIME" ), makeKeyword( "SYSTEM-TIME" ) );
    $sym462$WITH_PROCESS_RESOURCE_TRACKING_IN_SECONDS = makeSymbol( "WITH-PROCESS-RESOURCE-TRACKING-IN-SECONDS" );
    $int463$10000000 = makeInteger( 10000000 );
    $kw464$WALL_CLOCK_TIME = makeKeyword( "WALL-CLOCK-TIME" );
    $kw465$USER_TIME = makeKeyword( "USER-TIME" );
    $kw466$SYSTEM_TIME = makeKeyword( "SYSTEM-TIME" );
    $sym467$TIMING_INFO = makeUninternedSymbol( "TIMING-INFO" );
    $str468$______s__ = makeString( "~&;; ~s~%" );
    $sym469$TIMING_INFO = makeUninternedSymbol( "TIMING-INFO" );
    $sym470$PROCESS_RESOURCE_TRACKING_USER_TIME = makeSymbol( "PROCESS-RESOURCE-TRACKING-USER-TIME" );
    $sym471$TIMING_INFO = makeUninternedSymbol( "TIMING-INFO" );
    $sym472$TIMING_INFO = makeUninternedSymbol( "TIMING-INFO" );
    $sym473$PROCESS_RESOURCE_TRACKING_SYSTEM_TIME = makeSymbol( "PROCESS-RESOURCE-TRACKING-SYSTEM-TIME" );
    $sym474$TIMING_INFO = makeUninternedSymbol( "TIMING-INFO" );
    $list475 = ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "PRED" ) );
    $list476 = ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "PRED" ) );
    $sym477$ELEM = makeUninternedSymbol( "ELEM" );
    $sym478$LIST_VAR = makeUninternedSymbol( "LIST-VAR" );
    $list479 = ConsesLow.list( makeSymbol( "NON-DOTTED-LIST-P" ) );
    $sym480$CHECK_LIST_TYPE = makeSymbol( "CHECK-LIST-TYPE" );
    $sym481$ELEM = makeUninternedSymbol( "ELEM" );
    $sym482$LIST_VAR = makeUninternedSymbol( "LIST-VAR" );
    $list483 = ConsesLow.list( makeSymbol( "PLIST" ), makeSymbol( "PRED" ) );
    $sym484$PROPERTY = makeUninternedSymbol( "PROPERTY" );
    $sym485$VALUE = makeUninternedSymbol( "VALUE" );
    $sym486$PLIST_VAR = makeUninternedSymbol( "PLIST-VAR" );
    $list487 = ConsesLow.list( makeSymbol( "PROPERTY-LIST-P" ) );
    $sym488$PROPERTY = makeUninternedSymbol( "PROPERTY" );
    $sym489$VALUE = makeUninternedSymbol( "VALUE" );
    $sym490$PLIST_VAR = makeUninternedSymbol( "PLIST-VAR" );
    $sym491$PROPERTY = makeUninternedSymbol( "PROPERTY" );
    $sym492$VALUE = makeUninternedSymbol( "VALUE" );
    $sym493$PLIST_VAR = makeUninternedSymbol( "PLIST-VAR" );
    $sym494$WARN_UNLESS = makeSymbol( "WARN-UNLESS" );
    $str495$_s_is_not_a_known__a = makeString( "~s is not a known ~a" );
    $list496 = ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "FORM" ), makeSymbol( "FORMAT-STRING" ), makeSymbol( "&REST" ), makeSymbol( "FORMAT-ARGUMENTS" ) );
    $sym497$MUST = makeSymbol( "MUST" );
    $list498 = ConsesLow.list( makeSymbol( "FUNCTION-SPEC" ), makeSymbol( "OBJECT" ) );
    $sym499$COR = makeSymbol( "COR" );
    $list500 = ConsesLow.list( makeSymbol( "PLACE1" ), makeSymbol( "PLACE2" ) );
    $sym501$SWAP_VAR = makeUninternedSymbol( "SWAP-VAR" );
    $list502 = ConsesLow.list( makeSymbol( "VARIABLE" ), ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "DOCUMENTATION" ), makeSymbol( "DEFINER" ), makeSymbol( "ACCESS" ) ), makeSymbol( "&BODY" ), makeSymbol(
        "BODY" ) );
    $list503 = ConsesLow.list( makeKeyword( "DOCUMENTATION" ), makeKeyword( "DEFINER" ), makeKeyword( "ACCESS" ) );
    $kw504$DEFINER = makeKeyword( "DEFINER" );
    $kw505$ACCESS = makeKeyword( "ACCESS" );
    $str506$_A_INITIALIZER = makeString( "~A-INITIALIZER" );
    $sym507$PROCLAIM = makeSymbol( "PROCLAIM" );
    $kw508$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $sym509$REGISTER_KB_VARIABLE_INITIALIZATION = makeSymbol( "REGISTER-KB-VARIABLE-INITIALIZATION" );
    $sym510$_KB_VAR_INITIALIZATIONS_ = makeSymbol( "*KB-VAR-INITIALIZATIONS*" );
    $sym511$DEF_KB_VARIABLE = makeSymbol( "DEF-KB-VARIABLE" );
    $str512$Initializing_KB_variables = makeString( "Initializing KB variables" );
    $list513 = ConsesLow.cons( makeSymbol( "VAR-SYMBOL" ), makeSymbol( "FUNC" ) );
    $list514 = ConsesLow.list( makeSymbol( "GETTER" ), makeSymbol( "INITIALIZATION-FORM" ), makeSymbol( "&KEY" ), makeSymbol( "VAR" ), ConsesLow.list( makeSymbol( "VACCESS" ), ConsesLow.list( makeSymbol( "QUOTE" ),
        makeSymbol( "PRIVATE" ) ) ), ConsesLow.list( makeSymbol( "FACCESS" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PRIVATE" ) ) ), makeSymbol( "DOCUMENTATION" ) );
    $list515 = ConsesLow.list( makeKeyword( "VAR" ), makeKeyword( "VACCESS" ), makeKeyword( "FACCESS" ), makeKeyword( "DOCUMENTATION" ) );
    $kw516$VAR = makeKeyword( "VAR" );
    $sym517$PRIVATE = makeSymbol( "PRIVATE" );
    $kw518$FACCESS = makeKeyword( "FACCESS" );
    $str519$_ = makeString( "*" );
    $str520$Invalid_function_name__A___The_fi = makeString( "Invalid function-name ~A.  The first arg of DEFPARAMETER-LAZY is the getter function, not the variable name." );
    $sym521$INIT_VALUE = makeUninternedSymbol( "INIT-VALUE" );
    $sym522$FACCESS = makeSymbol( "FACCESS" );
    $list523 = ConsesLow.list( makeKeyword( "UNINITIALIZED" ) );
    $str524$Unable_to_initialize__A__ = makeString( "Unable to initialize ~A~%" );
    $str525$Invalid_function_name__A___The_fi = makeString( "Invalid function-name ~A.  The first arg of DEFVAR-LAZY is the getter function, not the variable name." );
    $sym526$INIT_VALUE = makeUninternedSymbol( "INIT-VALUE" );
    $str527$Invalid_function_name__A___The_fi = makeString( "Invalid function-name ~A.  The first arg of DEFGLOBAL-LAZY is the getter function, not the variable name." );
    $sym528$INIT_VALUE = makeUninternedSymbol( "INIT-VALUE" );
    $str529$Invalid_function_name__A___The_fi = makeString( "Invalid function-name ~A.  The first arg of DEFLEXICAL-LAZY is the getter function, not the variable name." );
    $sym530$INIT_VALUE = makeUninternedSymbol( "INIT-VALUE" );
    $list531 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "ARGLIST" ), makeSymbol( "DOCUMENTATION-STRING" ), makeSymbol( "DECLARATIONS" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym532$REGISTER_OBSOLETE_CYC_API_FUNCTION = makeSymbol( "REGISTER-OBSOLETE-CYC-API-FUNCTION" );
    $kw533$OBSOLETE_CYC_API_REPLACEMENTS = makeKeyword( "OBSOLETE-CYC-API-REPLACEMENTS" );
    $int534$40 = makeInteger( 40 );
    $sym535$INITIALIZATION_FOR_PARTIAL_LIST_RESULTS = makeSymbol( "INITIALIZATION-FOR-PARTIAL-LIST-RESULTS" );
    $sym536$ACCUMULATION_FOR_PARTIAL_LIST_RESULTS = makeSymbol( "ACCUMULATION-FOR-PARTIAL-LIST-RESULTS" );
    $sym537$CONSOLIDATION_FOR_PARTIAL_LIST_RESULTS = makeSymbol( "CONSOLIDATION-FOR-PARTIAL-LIST-RESULTS" );
    $sym538$NOTIFICATION_FOR_PARTIAL_LIST_RESULTS = makeSymbol( "NOTIFICATION-FOR-PARTIAL-LIST-RESULTS" );
    $sym539$FINAL_RESULTS_FOR_PARTIAL_LIST_RESULTS = makeSymbol( "FINAL-RESULTS-FOR-PARTIAL-LIST-RESULTS" );
    $list540 = ConsesLow.list( ConsesLow.list( makeSymbol( "FINAL-RESULT-VAR" ), makeSymbol( "THRESHOLD" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list541 = ConsesLow.list( makeSymbol( "*PARTIAL-RESULTS-ACCUMULATOR*" ), ConsesLow.list( makeSymbol( "FUNCALL" ), makeSymbol( "*PARTIAL-RESULTS-INITIALIZATION-FN*" ) ) );
    $list542 = ConsesLow.list( makeSymbol( "*PARTIAL-RESULTS-TOTAL-ACCUMULATOR*" ), ConsesLow.list( makeSymbol( "FUNCALL" ), makeSymbol( "*PARTIAL-RESULTS-INITIALIZATION-FN*" ) ) );
    $sym543$_PARTIAL_RESULTS_THRESHOLD_ = makeSymbol( "*PARTIAL-RESULTS-THRESHOLD*" );
    $list544 = ConsesLow.list( ConsesLow.list( makeSymbol( "*PARTIAL-RESULTS-SIZE*" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "*PARTIAL-RESULTS-TOTAL-SIZE*" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol(
        "*ACCUMULATING-PARTIAL-RESULTS?*" ), T ) );
    $list545 = ConsesLow.list( makeSymbol( "FUNCALL" ), makeSymbol( "*PARTIAL-RESULTS-CONSOLIDATION-FN*" ), makeSymbol( "*PARTIAL-RESULTS-ACCUMULATOR*" ) );
    $list546 = ConsesLow.list( ConsesLow.list( makeSymbol( "FUNCALL" ), makeSymbol( "*PARTIAL-RESULTS-FINAL-RESULT-FN*" ), makeSymbol( "*PARTIAL-RESULTS-TOTAL-ACCUMULATOR*" ) ) );
    $sym547$WITH_SPACE_PROFILING_TO_STRING = makeSymbol( "WITH-SPACE-PROFILING-TO-STRING" );
    $list548 = ConsesLow.list( ConsesLow.list( makeSymbol( "STRING-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym549$STREAM = makeUninternedSymbol( "STREAM" );
    $sym550$CWITH_OUTPUT_TO_STRING = makeSymbol( "CWITH-OUTPUT-TO-STRING" );
    $sym551$WITH_SPACE_PROFILING = makeSymbol( "WITH-SPACE-PROFILING" );
    $kw552$STREAM = makeKeyword( "STREAM" );
    $list553 = ConsesLow.list( ConsesLow.list( makeSymbol( "RESULT-VAR" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "INITIAL-VALUE" ), ZERO_INTEGER ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list554 = ConsesLow.list( makeKeyword( "INITIAL-VALUE" ) );
    $kw555$INITIAL_VALUE = makeKeyword( "INITIAL-VALUE" );
    $list556 = ConsesLow.list( makeSymbol( "*SXHASH-COMPOSITE-STATE*" ), FOUR_INTEGER );
    $sym557$_SXHASH_COMPOSITE_HASH_ = makeSymbol( "*SXHASH-COMPOSITE-HASH*" );
    $list558 = ConsesLow.list( makeSymbol( "*SXHASH-COMPOSITE-HASH*" ) );
    $list559 = ConsesLow.list( makeSymbol( "COMPOSITE-STATE" ), FOUR_INTEGER );
    $sym560$COMPOSITE_HASH = makeSymbol( "COMPOSITE-HASH" );
    $list561 = ConsesLow.list( makeSymbol( "COMPOSITE-HASH" ) );
    $list562 = ConsesLow.list( makeSymbol( "VALUE" ) );
    $list563 = ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "COMPOSITE-STATE" ), ConsesLow.list( makeSymbol( "SXHASH-UPDATE-STATE" ), makeSymbol( "COMPOSITE-STATE" ) ) );
    $sym564$LOGXOR = makeSymbol( "LOGXOR" );
    $sym565$SXHASH_ROT = makeSymbol( "SXHASH-ROT" );
    $sym566$SXHASH = makeSymbol( "SXHASH" );
    $list567 = ConsesLow.list( makeSymbol( "COMPOSITE-STATE" ) );
    $int568$27 = makeInteger( 27 );
    $ic569 = Vectors.vector( new SubLObject[] { SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER, ELEVEN_INTEGER, TWELVE_INTEGER, THIRTEEN_INTEGER, FOURTEEN_INTEGER, FIFTEEN_INTEGER, SIXTEEN_INTEGER,
      SEVENTEEN_INTEGER, EIGHTEEN_INTEGER, NINETEEN_INTEGER, TWENTY_INTEGER, makeInteger( 21 ), makeInteger( 22 ), makeInteger( 23 ), makeInteger( 24 ), makeInteger( 25 ), makeInteger( 26 ), makeInteger( 27 ),
      makeInteger( 28 ), makeInteger( 29 ), makeInteger( 30 ), makeInteger( 31 ), ZERO_INTEGER, ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER
    } );
    $sym570$SXHASH_COMPOSITE_UPDATE = makeSymbol( "SXHASH-COMPOSITE-UPDATE" );
    $sym571$COMPUTE_SXHASH_COMPOSITE = makeSymbol( "COMPUTE-SXHASH-COMPOSITE" );
    $int572$1000000 = makeInteger( 1000000 );
    $int573$167 = makeInteger( 167 );
    $list574 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "CATCH?" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list575 = ConsesLow.list( ConsesLow.list( makeSymbol( "TAG" ), makeSymbol( "ANS-VAR" ), makeSymbol( "CATCH?" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym576$CCATCH = makeSymbol( "CCATCH" );
    $list577 = ConsesLow.list( ConsesLow.list( makeSymbol( "PRE-N" ), makeSymbol( "N" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym578$TIMINGS = makeUninternedSymbol( "TIMINGS" );
    $sym579$TIME = makeUninternedSymbol( "TIME" );
    $sym580$I = makeUninternedSymbol( "I" );
    $list581 = ConsesLow.list( makeSymbol( "BENCHMARK-GC" ) );
    $sym582$_ = makeSymbol( "+" );
    $list583 = ConsesLow.list( ConsesLow.list( makeSymbol( "BENCHMARK-GC" ) ) );
    $sym584$PERFORM_STANDARD_STATISTICAL_ANALYSIS = makeSymbol( "PERFORM-STANDARD-STATISTICAL-ANALYSIS" );
    $sym585$BENCHMARK_GC = makeSymbol( "BENCHMARK-GC" );
    $sym586$RUN_BENCHMARK_COMPENSATING_FOR_PAGING = makeSymbol( "RUN-BENCHMARK-COMPENSATING-FOR-PAGING" );
    $list587 = ConsesLow.list( ConsesLow.list( makeSymbol( "*PRINT-PRETTY*" ), NIL ), ConsesLow.list( makeSymbol( "*PRINT-LENGTH*" ), NIL ), ConsesLow.list( makeSymbol( "*PRINT-LEVEL*" ), NIL ) );
    $list588 = ConsesLow.list( ConsesLow.list( makeSymbol( "TIMEOUT" ), makeSymbol( "TIMED-OUT?" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym589$WITH_TIMEOUT = makeSymbol( "WITH-TIMEOUT" );
    $list590 = ConsesLow.list( ConsesLow.list( makeSymbol( "RETRIES" ), makeSymbol( "SECONDS-BETWEEN" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym591$ERROR_MSG = makeUninternedSymbol( "ERROR-MSG" );
    $sym592$SUCCESS = makeUninternedSymbol( "SUCCESS" );
    $sym593$N = makeUninternedSymbol( "N" );
    $sym594$SLEEP = makeSymbol( "SLEEP" );
  }
}
/*
 * 
 * Total time: 2202 ms synthetic
 */