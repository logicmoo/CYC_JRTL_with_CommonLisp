package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Supplier;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_period;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EIGHTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EIGHT_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ELEVEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIFTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOURTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NINETEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NINE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SEVENTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SEVEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SIXTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SIX_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THIRTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWELVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWENTY_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$features$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;

public final class utilities_macros extends SubLTranslatedFile {
	public static final SubLFile me = new utilities_macros();

	public static final String myName = "com.cyc.cycjava.cycl.utilities_macros";

	public static final String myFingerPrint = "f2ea6b0840aa3e9cc9b291d5da9f9f0a915c749b7e201683ebaea25bb3658a33";

	// defparameter
	public static final SubLSymbol $cfasl_stream$ = makeSymbol("*CFASL-STREAM*");

	// defparameter
	// The current problem store in use for forward inference.
	public static final SubLSymbol $current_forward_problem_store$ = makeSymbol("*CURRENT-FORWARD-PROBLEM-STORE*");

	// defparameter
	/**
	 * An alist of things to trace and the level at which they should be traced.
	 * Current items are :CYCL, :PLANNER, and :EXECUTOR. A level of NIL or 0 means
	 * don't print out any tracing information. Higher numbers mean do more tracing.
	 */
	public static final SubLSymbol $tracing_level$ = makeSymbol("*TRACING-LEVEL*");

	// defparameter
	public static final SubLSymbol $progress_last_pacification_time$ = makeSymbol("*PROGRESS-LAST-PACIFICATION-TIME*");

	// defparameter
	public static final SubLSymbol $progress_pacifications_since_last_nl$ = makeSymbol("*PROGRESS-PACIFICATIONS-SINCE-LAST-NL*");

	// defparameter
	public static final SubLSymbol $progress_elapsed_seconds_for_notification$ = makeSymbol("*PROGRESS-ELAPSED-SECONDS-FOR-NOTIFICATION*");

	// defparameter
	public static final SubLSymbol $progress_notification_count$ = makeSymbol("*PROGRESS-NOTIFICATION-COUNT*");

	// defparameter
	public static final SubLSymbol $progress_count$ = makeSymbol("*PROGRESS-COUNT*");

	// defparameter
	public static final SubLSymbol $is_noting_progressP$ = makeSymbol("*IS-NOTING-PROGRESS?*");

	// defparameter
	public static final SubLSymbol $professional_progress_modeP$ = makeSymbol("*PROFESSIONAL-PROGRESS-MODE?*");

	// defparameter
	public static final SubLSymbol $suppress_all_progress_faster_than_seconds$ = makeSymbol("*SUPPRESS-ALL-PROGRESS-FASTER-THAN-SECONDS*");

	// defvar
	public static final SubLSymbol $silent_progressP$ = makeSymbol("*SILENT-PROGRESS?*");

	// defparameter
	public static final SubLSymbol $noting_progress_start_time$ = makeSymbol("*NOTING-PROGRESS-START-TIME*");

	// defvar
	public static final SubLSymbol $last_percent_progress_index$ = makeSymbol("*LAST-PERCENT-PROGRESS-INDEX*");

	// defparameter
	/**
	 * Bound to the latest prediction we made about how long the process will take,
	 * or NIL if we haven't made such a prediction.
	 */
	public static final SubLSymbol $last_percent_progress_prediction$ = makeSymbol("*LAST-PERCENT-PROGRESS-PREDICTION*");

	// defvar
	public static final SubLSymbol $within_noting_percent_progress$ = makeSymbol("*WITHIN-NOTING-PERCENT-PROGRESS*");

	// defvar
	public static final SubLSymbol $percent_progress_start_time$ = makeSymbol("*PERCENT-PROGRESS-START-TIME*");

	// defparameter
	public static final SubLSymbol $progress_start_time$ = makeSymbol("*PROGRESS-START-TIME*");

	// defparameter
	public static final SubLSymbol $progress_sofar$ = makeSymbol("*PROGRESS-SOFAR*");

	// defparameter
	private static final SubLSymbol $util_var_error_format_string$ = makeSymbol("*UTIL-VAR-ERROR-FORMAT-STRING*");

	// defparameter
	private static final SubLSymbol $util_func_error_format_string$ = makeSymbol("*UTIL-FUNC-ERROR-FORMAT-STRING*");

	// defparameter
	private static final SubLSymbol $util_search_type_error_format_string$ = makeSymbol("*UTIL-SEARCH-TYPE-ERROR-FORMAT-STRING*");

	// deflexical
	// Properties whose values are expressed in 100s of nanoseconds
	private static final SubLSymbol $process_resource_tracking_100s_of_nanoseconds_properties$ = makeSymbol("*PROCESS-RESOURCE-TRACKING-100S-OF-NANOSECONDS-PROPERTIES*");

	// defparameter
	// Partial results can be accumulated here.
	public static final SubLSymbol $partial_results_accumulator$ = makeSymbol("*PARTIAL-RESULTS-ACCUMULATOR*");

	// defparameter
	// How many partial results have stacked up.
	public static final SubLSymbol $partial_results_size$ = makeSymbol("*PARTIAL-RESULTS-SIZE*");

	// defparameter
	// How many results have been computed altogeher up.
	public static final SubLSymbol $partial_results_total_size$ = makeSymbol("*PARTIAL-RESULTS-TOTAL-SIZE*");

	// defparameter
	// Once the partial results have been notified, they can be added to here.
	public static final SubLSymbol $partial_results_total_accumulator$ = makeSymbol("*PARTIAL-RESULTS-TOTAL-ACCUMULATOR*");

	// defparameter
	// How the partial results have to be setup.
	public static final SubLSymbol $partial_results_initialization_fn$ = makeSymbol("*PARTIAL-RESULTS-INITIALIZATION-FN*");

	// defparameter
	// Who adds a new result to the partial results we already have.
	public static final SubLSymbol $partial_results_accumulation_fn$ = makeSymbol("*PARTIAL-RESULTS-ACCUMULATION-FN*");

	// defparameter
	// Who adds the partial results in the accumulator to the total result set.
	public static final SubLSymbol $partial_results_consolidation_fn$ = makeSymbol("*PARTIAL-RESULTS-CONSOLIDATION-FN*");

	// defparameter
	// Who gets the partial results as they become available.
	public static final SubLSymbol $partial_results_notification_fn$ = makeSymbol("*PARTIAL-RESULTS-NOTIFICATION-FN*");

	// defparameter
	// How the partial results will be processed for  usage.
	public static final SubLSymbol $partial_results_final_result_fn$ = makeSymbol("*PARTIAL-RESULTS-FINAL-RESULT-FN*");

	// defparameter
	public static final SubLSymbol $accumulating_partial_resultsP$ = makeSymbol("*ACCUMULATING-PARTIAL-RESULTS?*");

	// defconstant
	/**
	 * The number of bits used in the internal integer computations done by
	 * sxhash-external.
	 */
	public static final SubLSymbol $sxhash_bit_limit$ = makeSymbol("*SXHASH-BIT-LIMIT*");

	// deflexical
	private static final SubLSymbol $sxhash_update_state_vector$ = makeSymbol("*SXHASH-UPDATE-STATE-VECTOR*");

	// defparameter
	public static final SubLSymbol $sxhash_composite_state$ = makeSymbol("*SXHASH-COMPOSITE-STATE*");

	// Internal Constants
	public static final SubLList $list0 = list(makeSymbol("NAME"), makeSymbol("ARGLIST"), makeSymbol("DOCUMENTATION-STRING"), makeSymbol("TYPE-DECLARATIONS"), makeSymbol("&BODY"), makeSymbol("BODY"));

	public static final SubLSymbol REGISTER_CYC_API_FUNCTION = makeSymbol("REGISTER-CYC-API-FUNCTION");

	public static final SubLList $list7 = list(makeSymbol("NAME"), makeSymbol("ARGLIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

	public static final SubLList $list8 = list(makeSymbol("DOCUMENTATION-STRING"), makeSymbol("TYPE-DECLARATIONS"));

	public static final SubLList $list9 = list(makeSymbol("NAME"), makeSymbol("PATTERN"), makeSymbol("DOCUMENTATION-STRING"), makeSymbol("&BODY"), makeSymbol("BODY"));

	public static final SubLSymbol DEFMACRO_PUBLIC = makeSymbol("DEFMACRO-PUBLIC");

	public static final SubLSymbol REGISTER_CYC_API_MACRO = makeSymbol("REGISTER-CYC-API-MACRO");

	public static final SubLSymbol DEFINE_EXTERNAL = makeSymbol("DEFINE-EXTERNAL");

	public static final SubLList $list13 = list(makeSymbol("NAME"), makeSymbol("PATTERN"), makeSymbol("DOCUMENTATION-STRING"), makeSymbol("TYPE-DECLARATIONS"), makeSymbol("&BODY"), makeSymbol("BODY"));

	public static final SubLSymbol REGISTER_EXTERNAL_SYMBOL = makeSymbol("REGISTER-EXTERNAL-SYMBOL");

	public static final SubLSymbol $api_special_table$ = makeSymbol("*API-SPECIAL-TABLE*");

	public static final SubLString $str16$Registering__A_as_special_even_th = makeString("Registering ~A as special even though it's already predefined!");

	public static final SubLSymbol $api_predefined_function_table$ = makeSymbol("*API-PREDEFINED-FUNCTION-TABLE*");

	private static final SubLSymbol $api_predefined_host_function_table$ = makeSymbol("*API-PREDEFINED-HOST-FUNCTION-TABLE*");

	public static final SubLSymbol $api_predefined_macro_table$ = makeSymbol("*API-PREDEFINED-MACRO-TABLE*");

	private static final SubLSymbol $api_predefined_host_macro_table$ = makeSymbol("*API-PREDEFINED-HOST-MACRO-TABLE*");

	public static final SubLSymbol $api_symbols$ = makeSymbol("*API-SYMBOLS*");

	private static final SubLSymbol $CYC_API_SYMBOL = makeKeyword("CYC-API-SYMBOL");

	private static final SubLSymbol $CYC_API_ARGS = makeKeyword("CYC-API-ARGS");

	private static final SubLSymbol $CYC_API_ARG_TYPES = makeKeyword("CYC-API-ARG-TYPES");

	private static final SubLSymbol $CYC_API_RETURN_TYPES = makeKeyword("CYC-API-RETURN-TYPES");

	public static final SubLSymbol $api_types$ = makeSymbol("*API-TYPES*");

	private static final SubLString $str31$_replacements_not_allowed_in_the_ = makeString(":replacements not allowed in the declaration of Cyc API function");

	private static final SubLString $str36$Invalid_argument_type_expression_ = makeString("Invalid argument-type expression ~S");

	private static final SubLString $str38$_S_return_type_expression_not_lis = makeString("~S return type expression not list length 2.");

	private static final SubLList $list39 = list(makeSymbol("LIST"), makeSymbol("NIL-OR"));

	private static final SubLString $str40$_S_complex_return_type_expression = makeString("~S complex return type expression not of form (nil-or X) or (list X).");

	private static final SubLSymbol DEFINE_AFTER_ADDING = makeSymbol("DEFINE-AFTER-ADDING");

	private static final SubLSymbol DEFINE_KB = makeSymbol("DEFINE-KB");

	private static final SubLSymbol DEFINE_AFTER_REMOVING = makeSymbol("DEFINE-AFTER-REMOVING");

	private static final SubLSymbol DEFINE_RULE_AFTER_ADDING = makeSymbol("DEFINE-RULE-AFTER-ADDING");

	private static final SubLSymbol DEFINE_RULE_AFTER_REMOVING = makeSymbol("DEFINE-RULE-AFTER-REMOVING");

	private static final SubLSymbol DEFINE_COLLECTION_DEFN = makeSymbol("DEFINE-COLLECTION-DEFN");

	private static final SubLSymbol DEFINE_EVALUATION_DEFN = makeSymbol("DEFINE-EVALUATION-DEFN");

	private static final SubLList $list48 = list(makeSymbol("NAME"), makeSymbol("PATTERN"), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol DEFINE_EXPANSION_DEFN = makeSymbol("DEFINE-EXPANSION-DEFN");

	private static final SubLSymbol DEFINE_CYC_SUBL_DEFN = makeSymbol("DEFINE-CYC-SUBL-DEFN");

	private static final SubLList $list51 = list(makeSymbol("FUNCTION-SYMBOL"), makeSymbol("BASIS-FUNCTION"));

	public static final SubLList $list52 = list(makeSymbol("OBJECT"));

	private static final SubLList $list53 = list(makeSymbol("SUBL-ESCAPE-P"), makeSymbol("OBJECT"));

	public static final SubLList $list55 = list(list(makeSymbol("SUBL-ESCAPE-SUBL"), makeSymbol("OBJECT")));

	private static final SubLSymbol REGISTER_KB_FUNCTION = makeSymbol("REGISTER-KB-FUNCTION");

	private static final SubLSymbol $kb_function_table$ = makeSymbol("*KB-FUNCTION-TABLE*");

	private static final SubLInteger $int$400 = makeInteger(400);

	private static final SubLSymbol DEREGISTER_KB_FUNCTION = makeSymbol("DEREGISTER-KB-FUNCTION");

	private static final SubLSymbol NOTE_FUNCALL_HELPER_FUNCTION = makeSymbol("NOTE-FUNCALL-HELPER-FUNCTION");

	private static final SubLSymbol $funcall_helper_property$ = makeSymbol("*FUNCALL-HELPER-PROPERTY*");

	private static final SubLSymbol DEFINE_PRIVATE_FUNCALL = makeSymbol("DEFINE-PRIVATE-FUNCALL");

	public static final SubLSymbol $unprovided$ = makeSymbol("*UNPROVIDED*");

	private static final SubLString $$$UNPROVIDED = makeString("UNPROVIDED");

	private static final SubLList $list70 = list(makeSymbol("VARIABLE"), makeSymbol("FANCY-NAME"), makeSymbol("DESCRIPTION"), makeSymbol("SETTINGS-SPEC"));

	private static final SubLSymbol DECLARE_CONTROL_PARAMETER_INTERNAL = makeSymbol("DECLARE-CONTROL-PARAMETER-INTERNAL");

	private static final SubLSymbol CCATCH_IGNORE = makeSymbol("CCATCH-IGNORE");

	private static final SubLSymbol $SBHL_MAPPING_DONE = makeKeyword("SBHL-MAPPING-DONE");

	private static final SubLList $list78 = list(makeSymbol("OBJ"));

	private static final SubLSymbol WRITE_BYTE = makeSymbol("WRITE-BYTE");

	private static final SubLList $list80 = list(makeSymbol("*CFASL-STREAM*"));

	private static final SubLList $list81 = list(makeSymbol("READ-BYTE"), makeSymbol("*CFASL-STREAM*"), NIL, NIL);

	public static final SubLList $list82 = list(makeSymbol("LOCK"), makeSymbol("ACTION"), makeSymbol("&OPTIONAL"), makeSymbol("ELSE-ACTION"));

	private static final SubLSymbol $sym83$LOCK_VAR = makeUninternedSymbol("LOCK-VAR");

	private static final SubLSymbol LOCK_IDLE_P = makeSymbol("LOCK-IDLE-P");

	private static final SubLList $list88 = list(makeSymbol("LOCK"), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLList $list89 = list(makeSymbol("VARIABLE"), makeSymbol("NAME"), makeSymbol("&KEY"), makeSymbol("VACCESS"), makeSymbol("DOCUMENTATION"));

	private static final SubLList $list90 = list(makeKeyword("VACCESS"), makeKeyword("DOCUMENTATION"));

	private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

	private static final SubLSymbol VACCESS = makeSymbol("VACCESS");

	private static final SubLSymbol DEFGLOBAL = makeSymbol("DEFGLOBAL");

	private static final SubLSymbol REGISTER_GLOBAL_LOCK = makeSymbol("REGISTER-GLOBAL-LOCK");

	private static final SubLSymbol $global_locks$ = makeSymbol("*GLOBAL-LOCKS*");

	private static final SubLList $list99 = cons(makeSymbol("GLOBAL"), makeSymbol("NAME"));

	private static final SubLSymbol GLOBAL_LOCK_P = makeSymbol("GLOBAL-LOCK-P");

	private static final SubLSymbol INITIALIZE_GLOBAL_LOCK_INTERNAL = makeSymbol("INITIALIZE-GLOBAL-LOCK-INTERNAL");

	private static final SubLSymbol INITIALIZE_GLOBAL_LOCKS = makeSymbol("INITIALIZE-GLOBAL-LOCKS");

	public static final SubLSymbol $fi_state_variables$ = makeSymbol("*FI-STATE-VARIABLES*");

	private static final SubLList $list107 = list(makeSymbol("VARIABLE"), makeSymbol("&OPTIONAL"), makeSymbol("INITIALIZATION"), makeSymbol("DOCUMENTATION"));

	private static final SubLSymbol DEFPARAMETER_HTML = makeSymbol("DEFPARAMETER-HTML");

	private static final SubLList $list110 = list(makeSymbol("*FI-STATE-VARIABLES*"));

	private static final SubLList $list112 = list(makeSymbol("MAKE-LIST"), list(makeSymbol("LENGTH"), makeSymbol("*FI-STATE-VARIABLES*")), NIL);

	public static final SubLSymbol $html_state_variables$ = makeSymbol("*HTML-STATE-VARIABLES*");

	private static final SubLSymbol REGISTER_HTML_STATE_VARIABLE = makeSymbol("REGISTER-HTML-STATE-VARIABLE");

	public static final SubLSymbol $html_interface_variables$ = makeSymbol("*HTML-INTERFACE-VARIABLES*");

	private static final SubLSymbol REGISTER_HTML_INTERFACE_VARIABLE = makeSymbol("REGISTER-HTML-INTERFACE-VARIABLE");

	private static final SubLList $list119 = list(makeSymbol("VARIABLE"), makeSymbol("STATE-VARIABLES"), makeSymbol("INITIALIZATION"), makeSymbol("DOCUMENTATION"), makeSymbol("TYPE"));

	private static final SubLSymbol NOTE_STATE_VARIABLE_DOCUMENTATION = makeSymbol("NOTE-STATE-VARIABLE-DOCUMENTATION");

	private static final SubLSymbol DEF_STATE_VARIABLE = makeSymbol("DEF-STATE-VARIABLE");

	private static final SubLSymbol DEFPARAMETER_PRIVATE = makeSymbol("DEFPARAMETER-PRIVATE");

	private static final SubLSymbol DEFPARAMETER_PUBLIC = makeSymbol("DEFPARAMETER-PUBLIC");

	private static final SubLString $str135$unknown_variable_type__s__ = makeString("unknown variable type ~s~%");

	public static final SubLSymbol $gt_state_variables$ = makeSymbol("*GT-STATE-VARIABLES*");

	private static final SubLList $list143 = list(makeSymbol("VARIABLE"), makeSymbol("&OPTIONAL"), makeSymbol("INITIALIZATION"), makeSymbol("DOCUMENTATION"), list(makeSymbol("TYPE"), makeKeyword("PARAMETER")));

	public static final SubLSymbol $at_state_variables$ = makeSymbol("*AT-STATE-VARIABLES*");

	public static final SubLSymbol $defn_state_variables$ = makeSymbol("*DEFN-STATE-VARIABLES*");

	private static final SubLList $list146 = list(makeSymbol("VARIABLE"), makeSymbol("&OPTIONAL"), makeSymbol("INITIALIZATION"), makeSymbol("DOCUMENTATION"), list(makeSymbol("TYPE"), makeKeyword("PARAMETER-PROTECTECD")));

	public static final SubLSymbol $kbi_state_variables$ = makeSymbol("*KBI-STATE-VARIABLES*");

	public static final SubLSymbol $kbp_state_variables$ = makeSymbol("*KBP-STATE-VARIABLES*");

	public static final SubLList $list149 = list(list(makeSymbol("*NODES-ACCESSOR-FN*"), list(makeSymbol("FIF"), list(makeSymbol("FUNCTION-SPEC-P"), makeSymbol("*NODES-ACCESSOR-FN*")), makeSymbol("*NODES-ACCESSOR-FN*"), list(makeSymbol("FUNCTION"), makeSymbol("ALL-ASSERTION-TERMS")))),
			list(makeSymbol("*PATH-LINK-OP*"), list(makeSymbol("FIF"), list(makeSymbol("FUNCTION-SPEC-P"), makeSymbol("*PATH-LINK-OP*")), makeSymbol("*PATH-LINK-OP*"), list(makeSymbol("FUNCTION"), makeSymbol("DEFAULT-LINK-OP")))),
			list(makeSymbol("*PATH-NODE-OP*"), list(makeSymbol("FIF"), list(makeSymbol("FUNCTION-SPEC-P"), makeSymbol("*PATH-NODE-OP*")), makeSymbol("*PATH-NODE-OP*"), list(makeSymbol("FUNCTION"), makeSymbol("DEFAULT-NODE-OP")))),
			list(makeSymbol("*RELEVANT-LINK?*"), list(makeSymbol("FIF"), list(makeSymbol("FUNCTION-SPEC-P"), makeSymbol("*RELEVANT-LINK?*")), makeSymbol("*RELEVANT-LINK?*"), list(makeSymbol("FUNCTION"), makeSymbol("DEFAULT-RELEVANT-LINK?")))),
			list(makeSymbol("*RELEVANT-NODE?*"), list(makeSymbol("FIF"), list(makeSymbol("FUNCTION-SPEC-P"), makeSymbol("*RELEVANT-NODE?*")), makeSymbol("*RELEVANT-NODE?*"), list(makeSymbol("FUNCTION"), makeSymbol("DEFAULT-RELEVANT-NODE?")))),
			list(makeSymbol("*RELEVANT-LINK-TREE?*"), list(makeSymbol("FIF"), list(makeSymbol("FUNCTION-SPEC-P"), makeSymbol("*RELEVANT-LINK-TREE?*")), makeSymbol("*RELEVANT-LINK-TREE?*"), list(makeSymbol("FUNCTION"), makeSymbol("DEFAULT-RELEVANT-LINK-TREE?")))));

	private static final SubLList $list150 = list(list(makeSymbol("MACHINE"), makeSymbol("PORT")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol CYC_API_REMOTE_EVAL = makeSymbol("CYC-API-REMOTE-EVAL");

	private static final SubLList $list152 = list(list(makeSymbol("ENVIRONMENT")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLList $list154 = list(makeSymbol("QUEUE-P"));

	private static final SubLSymbol $forward_inference_environment$ = makeSymbol("*FORWARD-INFERENCE-ENVIRONMENT*");

	private static final SubLSymbol $sym156$ENVIRONMENT = makeUninternedSymbol("ENVIRONMENT");

	private static final SubLList $list157 = list(list(makeSymbol("GET-FORWARD-INFERENCE-ENVIRONMENT")));

	private static final SubLSymbol WITH_FORWARD_INFERENCE_ENVIRONMENT = makeSymbol("WITH-FORWARD-INFERENCE-ENVIRONMENT");

	private static final SubLSymbol $sym159$ENVIRONMENT = makeUninternedSymbol("ENVIRONMENT");

	private static final SubLList $list160 = list(list(makeSymbol("POSSIBLY-GET-FORWARD-INFERENCE-ENVIRONMENT")));

	private static final SubLSymbol POSSIBLY_GET_FORWARD_INFERENCE_ENVIRONMENT = makeSymbol("POSSIBLY-GET-FORWARD-INFERENCE-ENVIRONMENT");

	private static final SubLSymbol WITH_POSSIBLY_CLEAN_FORWARD_INFERENCE_ENVIRONMENT = makeSymbol("WITH-POSSIBLY-CLEAN-FORWARD-INFERENCE-ENVIRONMENT");

	private static final SubLList $list163 = list(list(makeSymbol("*CURRENT-FORWARD-PROBLEM-STORE*"), NIL));

	private static final SubLList $list165 = list(list(makeSymbol("CLEAR-CURRENT-FORWARD-PROBLEM-STORE")));

	public static final SubLList $list166 = list(list(makeSymbol("*WITHIN-ASSERTION-FORWARD-PROPAGATION?*"), NIL), list(makeSymbol("*PREFER-FORWARD-SKOLEMIZATION*"), NIL));

	private static final SubLSymbol WITH_NORMAL_FORWARD_INFERENCE_PARAMETERS = makeSymbol("WITH-NORMAL-FORWARD-INFERENCE-PARAMETERS");

	private static final SubLSymbol WITH_CLEAN_FORWARD_INFERENCE_ENVIRONMENT = makeSymbol("WITH-CLEAN-FORWARD-INFERENCE-ENVIRONMENT");

	private static final SubLSymbol WITH_CLEAN_FORWARD_PROBLEM_STORE_ENVIRONMENT = makeSymbol("WITH-CLEAN-FORWARD-PROBLEM-STORE-ENVIRONMENT");

	private static final SubLSymbol $sym170$ERROR = makeUninternedSymbol("ERROR");

	private static final SubLList $list172 = list(list(makeSymbol("THROW-UNEVALUATABLE")));

	public static final SubLList $list173 = list(list(makeSymbol("TRACEE"), makeSymbol("LEVEL")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol TRACING_AT_LEVEL = makeSymbol("TRACING-AT-LEVEL");

	private static final SubLList $list175 = list(makeSymbol("RESOURCE?"), makeSymbol("&BODY"), makeSymbol("BODY"));

	public static final SubLSymbol $structure_resourcing_make_static$ = makeSymbol("*STRUCTURE-RESOURCING-MAKE-STATIC*");

	private static final SubLList $list179 = list(makeSymbol("STRUCTURE"), makeSymbol("LINK-SLOT"), makeSymbol("MARK-SLOT"), list(makeSymbol("OBJECT")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLString $str180$__A_FREE_LIST_ = makeString("*~A-FREE-LIST*");

	private static final SubLString $str181$Free_list_for__A_objects = makeString("Free list for ~A objects");

	private static final SubLString $str182$__A_FREE_LOCK_ = makeString("*~A-FREE-LOCK*");

	private static final SubLString $str183$Lock_for__A_object_free_list = makeString("Lock for ~A object free list");

	private static final SubLString $str184$_A_resource_lock = makeString("~A resource lock");

	private static final SubLString $str185$MAKE_STATIC__A = makeString("MAKE-STATIC-~A");

	private static final SubLString $str186$Make_a_new__A_in_the_static_area = makeString("Make a new ~A in the static area");

	private static final SubLString $str187$INIT__A = makeString("INIT-~A");

	private static final SubLString $str188$Initialize_a__A_for_use = makeString("Initialize a ~A for use");

	private static final SubLString $str189$GET__A = makeString("GET-~A");

	private static final SubLString $str190$Get_a__A_from_the_free_list__or_m = makeString("Get a ~A from the free list, or make a new one if needed");

	private static final SubLString $str191$FREE__A_P = makeString("FREE-~A-P");

	private static final SubLString $str192$Check_if_OBJECT_is_a__A_that_has_ = makeString("Check if OBJECT is a ~A that has been explicitly freed");

	private static final SubLString $str193$FREE__A = makeString("FREE-~A");

	private static final SubLString $str194$Place_a__A_onto_the_free_list = makeString("Place a ~A onto the free list");

	private static final SubLString $str195$MAKE__A = makeString("MAKE-~A");

	private static final SubLString $str196$_A_P = makeString("~A-P");

	private static final SubLList $list199 = list(list(makeSymbol("RET"), makeSymbol("OBJECT")));

	private static final SubLList $list201 = list(makeKeyword("FREE"));

	public static final SubLSymbol $structure_resourcing_enabled$ = makeSymbol("*STRUCTURE-RESOURCING-ENABLED*");

	private static final SubLList $list205 = list(list(makeSymbol("RET"), T));

	public static final SubLList $list206 = list(list(makeSymbol("RET"), NIL));

	public static final SubLList $list207 = list(makeSymbol("OBJECT"), makeSymbol("FOUND"));

	private static final SubLList $list209 = list(list(makeSymbol("COR"), makeSymbol("FOUND"), list(makeSymbol("NULL"), makeSymbol("OBJECT"))));

	public static final SubLList $list210 = list(list(makeSymbol("CSETQ"), makeSymbol("FOUND"), T));

	private static final SubLList $list212 = list(NIL);

	public static final SubLList $list213 = list(list(makeSymbol("*READ-EVAL*"), NIL));

	public static final SubLList $list214 = list(makeSymbol("STRING"), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol $sym215$STR = makeUninternedSymbol("STR");

	private static final SubLList $list216 = list(makeSymbol("*PROGRESS-START-TIME*"), list(makeSymbol("GET-UNIVERSAL-TIME")));

	public static final SubLList $list217 = list(makeSymbol("*PROGRESS-LAST-PACIFICATION-TIME*"), makeSymbol("*PROGRESS-START-TIME*"));

	private static final SubLList $list218 = list(makeSymbol("*PROGRESS-ELAPSED-SECONDS-FOR-NOTIFICATION*"), makeSymbol("*SUPPRESS-ALL-PROGRESS-FASTER-THAN-SECONDS*"));

	private static final SubLList $list219 = list(makeSymbol("*PROGRESS-NOTIFICATION-COUNT*"), ZERO_INTEGER);

	private static final SubLList $list220 = list(makeSymbol("*PROGRESS-PACIFICATIONS-SINCE-LAST-NL*"), ZERO_INTEGER);

	private static final SubLList $list221 = list(makeSymbol("*PROGRESS-COUNT*"), ZERO_INTEGER);

	private static final SubLList $list222 = list(makeSymbol("*IS-NOTING-PROGRESS?*"), T);

	private static final SubLSymbol $sym223$_SILENT_PROGRESS__ = makeSymbol("*SILENT-PROGRESS?*");

	public static final SubLList $list225 = list(makeSymbol("*SILENT-PROGRESS?*"), T);

	private static final SubLSymbol NOTING_PROGRESS_PREAMBLE = makeSymbol("NOTING-PROGRESS-PREAMBLE");

	private static final SubLList $list227 = list(list(makeSymbol("NOTING-PROGRESS-POSTAMBLE")));

	private static final SubLList $list228 = list(makeSymbol("DELAYED-MODE-SECONDS"), makeSymbol("STRING"), makeSymbol("&BODY"), makeSymbol("BODY"));

	public static final SubLSymbol $noting_progress_delayed_mode_seconds$ = makeSymbol("*NOTING-PROGRESS-DELAYED-MODE-SECONDS*");

	public static final SubLSymbol $noting_progress_delayed_mode_string$ = makeSymbol("*NOTING-PROGRESS-DELAYED-MODE-STRING*");

	private static final SubLSymbol NOTING_PROGRESS = makeSymbol("NOTING-PROGRESS");

	private static final SubLString $str232$___A = makeString("~&~A");

	private static final SubLList $list233 = list(CHAR_period, CHAR_space);

	private static final SubLString $str234$___A____ = makeString("~&~A ...");

	private static final SubLSymbol NOTING_PROGRESS_POSTAMBLE = makeSymbol("NOTING-PROGRESS-POSTAMBLE");

	private static final SubLString $str236$__ = makeString(" (");

	private static final SubLString $str237$_DONE__ = makeString(" DONE (");

	private static final SubLInteger $int$600 = makeInteger(600);

	private static final SubLString $str239$__ended__A = makeString(", ended ~A");

	private static final SubLString $str240$_ = makeString(")");

	private static final SubLSymbol NOTE_PROGRESS = makeSymbol("NOTE-PROGRESS");

	private static final SubLInteger $int$50 = makeInteger(50);

	private static final SubLInteger $int$200 = makeInteger(200);

	private static final SubLInteger $int$30 = makeInteger(30);

	private static final SubLInteger $int$25 = makeInteger(25);

	private static final SubLString $str246$__A_ = makeString("(~A)");

	private static final SubLString $str247$_ = makeString(".");

	private static final SubLList $list249 = list(list(makeSymbol("*LAST-PERCENT-PROGRESS-INDEX*"), ZERO_INTEGER), list(makeSymbol("*LAST-PERCENT-PROGRESS-PREDICTION*"), NIL), list(makeSymbol("*WITHIN-NOTING-PERCENT-PROGRESS*"), T), list(makeSymbol("*PERCENT-PROGRESS-START-TIME*"), list(makeSymbol("GET-UNIVERSAL-TIME"))));

	private static final SubLSymbol NOTING_PERCENT_PROGRESS_PREAMBLE = makeSymbol("NOTING-PERCENT-PROGRESS-PREAMBLE");

	public static final SubLList $list251 = list(list(makeSymbol("NOTING-PERCENT-PROGRESS-POSTAMBLE")));

	public static final SubLSymbol $percent_progress_delayed_mode_seconds$ = makeSymbol("*PERCENT-PROGRESS-DELAYED-MODE-SECONDS*");

	public static final SubLSymbol $percent_progress_delayed_mode_string$ = makeSymbol("*PERCENT-PROGRESS-DELAYED-MODE-STRING*");

	private static final SubLSymbol NOTING_PERCENT_PROGRESS_POSTAMBLE = makeSymbol("NOTING-PERCENT-PROGRESS-POSTAMBLE");

	private static final SubLString $str256$____ = makeString(" ...");

	private static final SubLString $str257$__ = makeString(" ]");

	private static final SubLString $str259$__ = makeString(" [");

	private static final SubLString $$$__ = makeString("  ");

	private static final SubLString $str261$01_ = makeString("01%");

	private static final SubLInteger $int$300 = makeInteger(300);

	private static final SubLString $str263$02_ = makeString("02%");

	private static final SubLInteger $int$1200 = makeInteger(1200);

	private static final SubLString $$$_ = makeString(" ");

	private static final SubLString $str267$_ = makeString("%");

	private static final SubLString $$$0 = makeString("0");

	private static final SubLString $$$_of_ = makeString(" of ");

	private static final SubLString $str270$__ending__ = makeString(", ending ~");

	private static final SubLInteger $int$99 = makeInteger(99);

	private static final SubLString $str272$ = makeString("");

	private static final SubLString $str273$___A____D_of__D___02D___Done_at__ = makeString("~%~A : ~D of ~D (~02D%) Done at ~A");

	private static final SubLString $$$whenever = makeString("whenever");

	private static final SubLList $list275 = list(list(makeSymbol("VAR"), makeSymbol("TOTAL"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("cdotimes"))), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLString $$$cdotimes = makeString("cdotimes");

	public static final SubLSymbol $progress_note$ = makeSymbol("*PROGRESS-NOTE*");

	public static final SubLSymbol $progress_total$ = makeSymbol("*PROGRESS-TOTAL*");

	public static final SubLList $list279 = list(list(makeSymbol("*PROGRESS-SOFAR*"), ZERO_INTEGER));

	private static final SubLList $list281 = list(makeSymbol("*PROGRESS-TOTAL*"));

	private static final SubLList $list282 = list(list(makeSymbol("CINC"), makeSymbol("*PROGRESS-SOFAR*")), list(makeSymbol("NOTE-PERCENT-PROGRESS"), makeSymbol("*PROGRESS-SOFAR*"), makeSymbol("*PROGRESS-TOTAL*")));

	private static final SubLList $list283 = list(list(makeSymbol("VAR"), makeSymbol("LIST"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("cdolist")), makeSymbol("ENDVAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLString $$$cdolist = makeString("cdolist");

	private static final SubLSymbol $sym285$LIST_VAR = makeUninternedSymbol("LIST-VAR");

	private static final SubLList $list286 = list(makeString("cdolist"));

	private static final SubLSymbol PROGRESS_CDOLIST = makeSymbol("PROGRESS-CDOLIST");

	public static final SubLList $list290 = list(list(makeSymbol("VAR"), makeSymbol("LIST"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("cdolist"))), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol PROGRESS_CSOME = makeSymbol("PROGRESS-CSOME");

	public static final SubLList $list292 = list(list(makeSymbol("VAR"), makeSymbol("LIST"), makeSymbol("&OPTIONAL"), makeSymbol("MESSAGE")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol $sym293$MESSAGE_VAR = makeUninternedSymbol("MESSAGE-VAR");

	private static final SubLList $list295 = list(list(makeSymbol("KEY"), makeSymbol("VAL"), makeSymbol("TABLE"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("cdohash"))), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLString $$$cdohash = makeString("cdohash");

	private static final SubLSymbol $sym297$TABLE_VAR = makeUninternedSymbol("TABLE-VAR");

	private static final SubLSymbol HASH_TABLE_COUNT = makeSymbol("HASH-TABLE-COUNT");

	private static final SubLList $list300 = list(list(makeSymbol("ELEM"), makeSymbol("SET"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("do-set"))), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLString $str301$do_set = makeString("do-set");

	private static final SubLSymbol $sym302$SET_VAR = makeUninternedSymbol("SET-VAR");

	private static final SubLSymbol SET_SIZE = makeSymbol("SET-SIZE");

	private static final SubLList $list305 = list(list(makeSymbol("&KEY"), makeSymbol("MESSAGE")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLList $list306 = list(makeKeyword("MESSAGE"));

	private static final SubLSymbol $sym308$MESSAGE_VAR = makeUninternedSymbol("MESSAGE-VAR");

	private static final SubLSymbol $sym309$START_TIME = makeUninternedSymbol("START-TIME");

	private static final SubLSymbol NOTING_ELAPSED_TIME_PREAMBLE = makeSymbol("NOTING-ELAPSED-TIME-PREAMBLE");

	private static final SubLSymbol NOTING_ELAPSED_TIME_POSTAMBLE = makeSymbol("NOTING-ELAPSED-TIME-POSTAMBLE");

	private static final SubLSymbol NOTING_ELAPSED_TIME = makeSymbol("NOTING-ELAPSED-TIME");

	private static final SubLString $str313$___A_started__at__A = makeString("~&~A started  at ~A");

	private static final SubLString $str314$___A_finished_at__A_after_A = makeString("~&~A finished at ~A after~A");

	private static final SubLSymbol WITH_SUBLISP_ERROR_HANDLING = makeSymbol("WITH-SUBLISP-ERROR-HANDLING");

	private static final SubLList $list316 = list(list(makeSymbol("*PACKAGE*"), list(makeSymbol("FIND-PACKAGE"), makeString("CYC"))), list(makeSymbol("*READ-DEFAULT-FLOAT-FORMAT*"), list(makeSymbol("QUOTE"), makeSymbol("DOUBLE-FLOAT"))), list(makeSymbol("*PRINT-READABLY*"), NIL), list(makeSymbol("*READ-EVAL*"), NIL),
			list(makeSymbol("OLD-PRIORITY"), list(makeSymbol("PROCESS-PRIORITY"), list(makeSymbol("CURRENT-PROCESS")))));

	public static final SubLList $list317 = list(makeSymbol("SET-PROCESS-PRIORITY"), list(makeSymbol("CURRENT-PROCESS")), makeSymbol("*PROCESS-NORMAL-PRIORITY*"));

	private static final SubLList $list318 = list(list(makeSymbol("SET-PROCESS-PRIORITY"), list(makeSymbol("CURRENT-PROCESS")), makeSymbol("OLD-PRIORITY")));

	private static final SubLList $list319 = list(list(makeSymbol("*PACKAGE*"), list(makeSymbol("FIND-PACKAGE"), makeString("CYC"))), list(makeSymbol("*PRINT-READABLY*"), NIL), list(makeSymbol("*READ-EVAL*"), NIL));

	private static final SubLSymbol WITH_CYC_SERVER_HANDLING = makeSymbol("WITH-CYC-SERVER-HANDLING");

	private static final SubLSymbol WITH_CYC_IO_SYNTAX = makeSymbol("WITH-CYC-IO-SYNTAX");

	private static final SubLList $list322 = list(list(makeSymbol("*READ-DEFAULT-FLOAT-FORMAT*"), list(makeSymbol("QUOTE"), makeSymbol("DOUBLE-FLOAT"))));

	private static final SubLList $list323 = list(list(makeSymbol("CYCLIST")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol $sym324$OLD_CYCLIST = makeUninternedSymbol("OLD-CYCLIST");

	public static final SubLList $list325 = list(list(makeSymbol("THE-CYCLIST")));

	private static final SubLSymbol SET_THE_CYCLIST = makeSymbol("SET-THE-CYCLIST");

	private static final SubLList $list327 = list(list(makeSymbol("*THE-CYCLIST*"), NIL));

	public static final SubLList $list328 = list(makeSymbol("EL-VARIABLES"), makeSymbol("BINDINGS"), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol $sym329$BINDING = makeUninternedSymbol("BINDING");

	private static final SubLString $str331$_S___var__S_is_not_a_symbol_ = makeString("~S - var ~S is not a symbol.");

	private static final SubLString $str332$_S___function__S_is_not_a_symbol_ = makeString("~S - function ~S is not a symbol.");

	private static final SubLString $str333$_S___search_type__S_is_not_one_of = makeString("~S - search type ~S is not one of (:depth-first :breadth-first).");

	private static final SubLList $list334 = list(makeSymbol("LIST"));

	private static final SubLList $list338 = list(list(makeSymbol("VAR"), makeSymbol("LIST-EXPRESSION")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol CDOSUBLISTS = makeSymbol("CDOSUBLISTS");

	private static final SubLList $list340 = list(list(makeSymbol("ELEMENT-VAR"), makeSymbol("SUBLIST-VAR"), makeSymbol("LIST-EXPRESSION")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol CDOLIST_AND_SUBLISTS = makeSymbol("CDOLIST-AND-SUBLISTS");

	private static final SubLString $str342$next_cons_var = makeString("next-cons-var");

	private static final SubLList $list343 = list(list(makeSymbol("ELEMENT-VAR"), makeSymbol("LIST-EXPRESSION")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLString $$$sublist = makeString("sublist");

	private static final SubLList $list346 = list(list(makeSymbol("VAR"), makeSymbol("PREDICATE"), makeSymbol("LIST-EXPRESSION")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol CDOLIST_IF = makeSymbol("CDOLIST-IF");

	private static final SubLSymbol CDOSUBLISTS_IF = makeSymbol("CDOSUBLISTS-IF");

	private static final SubLSymbol CDOLIST_IF_NOT = makeSymbol("CDOLIST-IF-NOT");

	private static final SubLSymbol CDOSUBLISTS_IF_NOT = makeSymbol("CDOSUBLISTS-IF-NOT");

	private static final SubLList $list351 = list(list(makeSymbol("VAR1"), makeSymbol("LIST1"), makeSymbol("VAR2"), makeSymbol("LIST2")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLString $$$sublist1 = makeString("sublist1");

	private static final SubLString $$$sublist2 = makeString("sublist2");

	public static final SubLList $list354 = list(list(makeSymbol("VAR"), makeSymbol("TREE"), makeSymbol("&OPTIONAL"), list(makeSymbol("SEARCH-TYPE"), makeKeyword("DEPTH-FIRST")), list(makeSymbol("VISIT-NILS"), NIL)), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol CDOTREE = makeSymbol("CDOTREE");

	private static final SubLString $str358$tree_var = makeString("tree-var");

	private static final SubLString $str359$cells_var = makeString("cells-var");

	private static final SubLString $str360$tail_of_cells = makeString("tail-of-cells");

	public static final SubLList $list365 = list(list(makeSymbol("VAR"), makeSymbol("TREE"), makeSymbol("&OPTIONAL"), list(makeSymbol("SEARCH-TYPE"), makeKeyword("DEPTH-FIRST"))), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol CDOTREE_CONSES = makeSymbol("CDOTREE-CONSES");

	private static final SubLString $str367$tail_of_cells_var = makeString("tail-of-cells-var");

	public static final SubLList $list368 = list(list(makeSymbol("PARAMETER"), makeSymbol("VALUE"), makeSymbol("PLIST")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol DO_PLIST = makeSymbol("DO-PLIST");

	private static final SubLList $list374 = list(makeSymbol("PATTERN"), makeSymbol("DATUM"));

	private static final SubLString $str375$datum_evaluated_var = makeString("datum-evaluated-var");

	private static final SubLString $str377$FAST_FUNCALL_NO_VALUE__contains_e = makeString("FAST-FUNCALL-NO-VALUE: contains erroneous function name it its function name list.");

	private static final SubLString $str378$FAST_FUNCALL_NO_VALUE__cannot_acc = makeString("FAST-FUNCALL-NO-VALUE: cannot accept dotted list for its function name list.");

	private static final SubLString $str379$FAST_FUNCALL_NO_VALUE__function_n = makeString("FAST-FUNCALL-NO-VALUE: function name list must be a list.");

	private static final SubLList $list380 = list(makeSymbol("FUNCTION-FORM"), makeSymbol("FUNCTION-NAME-LIST"), makeSymbol("&REST"), makeSymbol("ARGS"));

	private static final SubLString $str382$function_form_evaluated_var = makeString("function-form-evaluated-var");

	private static final SubLList $list385 = list(makeSymbol("VAR-TO-SET"), makeSymbol("FUNCTION-FORM"), makeSymbol("FUNCTION-NAME-LIST"), makeSymbol("&REST"), makeSymbol("ARGS"));

	public static final SubLList $list386 = list(makeSymbol("VARS-TO-BIND"), listS(makeSymbol("FUNCTION-FORM"), makeSymbol("FUNCTION-NAME-LIST"), makeSymbol("ARGS")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLList $list388 = list(makeSymbol("VARS-TO-SET"), makeSymbol("FUNCTION-FORM"), makeSymbol("FUNCTION-NAME-LIST"), makeSymbol("&REST"), makeSymbol("ARGS"));

	private static final SubLList $list390 = list(makeSymbol("FUNCTION"), makeSymbol("&REST"), makeSymbol("ARGS"));

	private static final SubLList $list391 = list(makeSymbol("PREDICATION-STRUCTURE"), makeSymbol("OPERAND"));

	private static final SubLList $list392 = list(makeSymbol("INLINE-SET-SYMBOL"), makeSymbol("INLINE-GET-SYMBOL"), makeSymbol("INLINE-METHOD"));

	private static final SubLString $str393$_A_S = makeString("~A~S");

	private static final SubLList $list394 = list(list(makeSymbol("VAR"), makeSymbol("LIST-EXPRESSION"), makeSymbol("COLLECTION-VAR")), makeSymbol("ITERATED-EXPRESSION"));

	private static final SubLString $str395$LIST_EXPRESSION = makeString("LIST-EXPRESSION");

	private static final SubLString $str396$TAIL_CONS = makeString("TAIL-CONS");

	private static final SubLString $$$RESULT = makeString("RESULT");

	private static final SubLSymbol DEFINE_API = makeSymbol("DEFINE-API");

	private static final SubLList $list407 = list(makeSymbol("PUNLESS"), list(makeSymbol("LISTP"), makeSymbol("LIST")), list(makeSymbol("RET"), NIL));

	private static final SubLSymbol $NOT_EMPTY_ALL = makeKeyword("NOT-EMPTY-ALL");

	private static final SubLList $list409 = list(makeSymbol("PUNLESS"), list(makeSymbol("CONSP"), makeSymbol("LIST")), list(makeSymbol("RET"), NIL));

	private static final SubLString $str411$DEFINE_LIST_ELEMENT_PREDICATOR___ = makeString("DEFINE-LIST-ELEMENT-PREDICATOR: ~S is not a valid type value.");

	private static final SubLList $list412 = list(makeSymbol("FUNCTION-NAME"), makeSymbol("TYPE"), list(makeSymbol("ELEMENT-VAR")), makeSymbol("EXPRESSION"));

	private static final SubLSymbol $sym413$_OPTIONAL = makeSymbol("&OPTIONAL");

	private static final SubLSymbol CAR_IF_LIST = makeSymbol("CAR-IF-LIST");

	private static final SubLString $str415$FCOND___S_is_not_a_valid_clause_l = makeString("FCOND: ~S is not a valid clause list.");

	private static final SubLString $str416$FCOND___S_is_not_a_valid_clause_ = makeString("FCOND: ~S is not a valid clause.");

	private static final SubLString $str417$P_RANGE_CASE__Ill_formed_clauses_ = makeString("P-RANGE-CASE: Ill-formed clauses encountered -> ~S.");

	private static final SubLString $str418$P_RANGE_CASE___S_is_not_a_valid_c = makeString("P-RANGE-CASE: ~S is not a valid clause.");

	private static final SubLString $$$value = makeString("value");

	private static final SubLSymbol $sym420$__ = makeSymbol(">=");

	private static final SubLSymbol $sym421$__ = makeSymbol("<=");

	private static final SubLSymbol $sym422$_ = makeSymbol("=");

	public static final SubLList $list423 = list(makeSymbol("VALUE"), makeSymbol("&BODY"), makeSymbol("CLAUSES"));

	private static final SubLString $str425$Invalid_version_code__A_ = makeString("Invalid version code ~A.");

	private static final SubLList $list426 = list(list(makeSymbol("VERSION")), makeSymbol("VERSION-BODIES"), makeSymbol("&KEY"), makeSymbol("ERROR-CLAUSE"));

	private static final SubLList $list427 = list(makeKeyword("ERROR-CLAUSE"));

	private static final SubLList $list429 = list(makeSymbol("VERSION"), makeSymbol("FORM"));

	public static final SubLList $list430 = list(list(makeSymbol("MAJOR"), makeSymbol("MINOR")), makeSymbol("VERSION-BODIES"), makeSymbol("&KEY"), makeSymbol("ERROR-CLAUSE"));

	private static final SubLList $list431 = list(makeSymbol("MAJOR-VERSION"), makeSymbol("MINOR-VERSION"), makeSymbol("FORM"));

	private static final SubLSymbol SUB_KB_LOADED_P_SYMBOL = makeSymbol("SUB-KB-LOADED-P-SYMBOL");

	private static final SubLSymbol DECLARE_KB_FEATURE = makeSymbol("DECLARE-KB-FEATURE");

	private static final SubLString $str434$_P = makeString("-P");

	private static final SubLSymbol SUB_KB_SET_SYMBOL = makeSymbol("SUB-KB-SET-SYMBOL");

	private static final SubLString $str436$SET_ = makeString("SET-");

	private static final SubLSymbol SUB_KB_UNSET_SYMBOL = makeSymbol("SUB-KB-UNSET-SYMBOL");

	private static final SubLString $str438$UNSET_ = makeString("UNSET-");

	private static final SubLList $list439 = list(makeSymbol("SUB-KB-SYMBOL"), makeSymbol("LOADED-DOC-STRING"));

	private static final SubLSymbol DEFGLOBAL_PRIVATE = makeSymbol("DEFGLOBAL-PRIVATE");

	private static final SubLList $list441 = list(makeSymbol("*KB-FEATURES*"));

	private static final SubLList $list442 = list(T);

	private static final SubLList $list448 = list(makeKeyword("A"), makeKeyword("S"), makeKeyword("D"));

	private static final SubLString $str449$FORMAT_TO_STRING___S_is_an_invali = makeString("FORMAT-TO-STRING: ~S is an invalid format arg.  ~\n           Format args must be a member of the set {:A, :S, :D}.");

	private static final SubLString $str450$FORMAT_TO_STRING__Odd_number_of_a = makeString("FORMAT-TO-STRING: Odd number of args encountered: ~S");

	private static final SubLSymbol $sym451$TIME = makeUninternedSymbol("TIME");

	private static final SubLString $str454$_____real_time__A_seconds__ = makeString("~&;; real time ~A seconds~%");

	public static final SubLList $list455 = list(makeSymbol("VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol $sym456$TIMING_INFO = makeUninternedSymbol("TIMING-INFO");

	private static final SubLSymbol $sym457$CLOCK_TIME = makeUninternedSymbol("CLOCK-TIME");

	private static final SubLSymbol WITH_PROCESS_RESOURCE_TRACKING = makeSymbol("WITH-PROCESS-RESOURCE-TRACKING");

	private static final SubLSymbol CONVERT_PROCESS_RESOURCE_TRACKING_TIMING_INFO_TO_SECONDS = makeSymbol("CONVERT-PROCESS-RESOURCE-TRACKING-TIMING-INFO-TO-SECONDS");

	private static final SubLSymbol NADD_CLOCK_TIME_TO_PROCESS_RESOURCE_TIMING_INFO = makeSymbol("NADD-CLOCK-TIME-TO-PROCESS-RESOURCE-TIMING-INFO");

	private static final SubLList $list461 = list(makeKeyword("USER-TIME"), makeKeyword("SYSTEM-TIME"));

	private static final SubLSymbol WITH_PROCESS_RESOURCE_TRACKING_IN_SECONDS = makeSymbol("WITH-PROCESS-RESOURCE-TRACKING-IN-SECONDS");

	private static final SubLInteger $int$10000000 = makeInteger(10000000);

	private static final SubLSymbol $WALL_CLOCK_TIME = makeKeyword("WALL-CLOCK-TIME");

	private static final SubLSymbol $sym467$TIMING_INFO = makeUninternedSymbol("TIMING-INFO");

	private static final SubLString $str468$______s__ = makeString("~&;; ~s~%");

	private static final SubLSymbol $sym469$TIMING_INFO = makeUninternedSymbol("TIMING-INFO");

	private static final SubLSymbol PROCESS_RESOURCE_TRACKING_USER_TIME = makeSymbol("PROCESS-RESOURCE-TRACKING-USER-TIME");

	private static final SubLSymbol $sym471$TIMING_INFO = makeUninternedSymbol("TIMING-INFO");

	private static final SubLSymbol $sym472$TIMING_INFO = makeUninternedSymbol("TIMING-INFO");

	private static final SubLSymbol PROCESS_RESOURCE_TRACKING_SYSTEM_TIME = makeSymbol("PROCESS-RESOURCE-TRACKING-SYSTEM-TIME");

	private static final SubLSymbol $sym474$TIMING_INFO = makeUninternedSymbol("TIMING-INFO");

	private static final SubLList $list475 = list(makeSymbol("OBJECT"), makeSymbol("PRED"));

	private static final SubLList $list476 = list(makeSymbol("LIST"), makeSymbol("PRED"));

	private static final SubLSymbol $sym477$ELEM = makeUninternedSymbol("ELEM");

	private static final SubLSymbol $sym478$LIST_VAR = makeUninternedSymbol("LIST-VAR");

	private static final SubLList $list479 = list(makeSymbol("NON-DOTTED-LIST-P"));

	private static final SubLSymbol CHECK_LIST_TYPE = makeSymbol("CHECK-LIST-TYPE");

	private static final SubLSymbol $sym481$ELEM = makeUninternedSymbol("ELEM");

	private static final SubLSymbol $sym482$LIST_VAR = makeUninternedSymbol("LIST-VAR");

	public static final SubLList $list483 = list(makeSymbol("PLIST"), makeSymbol("PRED"));

	private static final SubLSymbol $sym484$PROPERTY = makeUninternedSymbol("PROPERTY");

	private static final SubLSymbol $sym485$VALUE = makeUninternedSymbol("VALUE");

	private static final SubLSymbol $sym486$PLIST_VAR = makeUninternedSymbol("PLIST-VAR");

	private static final SubLList $list487 = list(makeSymbol("PROPERTY-LIST-P"));

	private static final SubLSymbol $sym488$PROPERTY = makeUninternedSymbol("PROPERTY");

	private static final SubLSymbol $sym489$VALUE = makeUninternedSymbol("VALUE");

	private static final SubLSymbol $sym490$PLIST_VAR = makeUninternedSymbol("PLIST-VAR");

	private static final SubLSymbol $sym491$PROPERTY = makeUninternedSymbol("PROPERTY");

	private static final SubLSymbol $sym492$VALUE = makeUninternedSymbol("VALUE");

	private static final SubLSymbol $sym493$PLIST_VAR = makeUninternedSymbol("PLIST-VAR");

	private static final SubLSymbol WARN_UNLESS = makeSymbol("WARN-UNLESS");

	private static final SubLString $str495$_s_is_not_a_known__a = makeString("~s is not a known ~a");

	private static final SubLList $list496 = list(makeSymbol("OBJECT"), makeSymbol("FORM"), makeSymbol("FORMAT-STRING"), makeSymbol("&REST"), makeSymbol("FORMAT-ARGUMENTS"));

	private static final SubLList $list498 = list(makeSymbol("FUNCTION-SPEC"), makeSymbol("OBJECT"));

	public static final SubLList $list500 = list(makeSymbol("PLACE1"), makeSymbol("PLACE2"));

	private static final SubLSymbol $sym501$SWAP_VAR = makeUninternedSymbol("SWAP-VAR");

	private static final SubLList $list502 = list(makeSymbol("VARIABLE"), list(makeSymbol("&KEY"), makeSymbol("DOCUMENTATION"), makeSymbol("DEFINER"), makeSymbol("ACCESS")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLList $list503 = list(makeKeyword("DOCUMENTATION"), makeKeyword("DEFINER"), makeKeyword("ACCESS"));

	private static final SubLString $str506$_A_INITIALIZER = makeString("~A-INITIALIZER");

	private static final SubLSymbol REGISTER_KB_VARIABLE_INITIALIZATION = makeSymbol("REGISTER-KB-VARIABLE-INITIALIZATION");

	private static final SubLSymbol $kb_var_initializations$ = makeSymbol("*KB-VAR-INITIALIZATIONS*");

	private static final SubLSymbol DEF_KB_VARIABLE = makeSymbol("DEF-KB-VARIABLE");

	private static final SubLString $$$Initializing_KB_variables = makeString("Initializing KB variables");

	public static final SubLList $list513 = cons(makeSymbol("VAR-SYMBOL"), makeSymbol("FUNC"));

	public static final SubLList $list514 = list(makeSymbol("GETTER"), makeSymbol("INITIALIZATION-FORM"), makeSymbol("&KEY"), makeSymbol("VAR"), list(makeSymbol("VACCESS"), list(makeSymbol("QUOTE"), makeSymbol("PRIVATE"))), list(makeSymbol("FACCESS"), list(makeSymbol("QUOTE"), makeSymbol("PRIVATE"))), makeSymbol("DOCUMENTATION"));

	public static final SubLList $list515 = list(makeKeyword("VAR"), makeKeyword("VACCESS"), makeKeyword("FACCESS"), makeKeyword("DOCUMENTATION"));

	private static final SubLString $str519$_ = makeString("*");

	private static final SubLString $str520$Invalid_function_name__A___The_fi = makeString("Invalid function-name ~A.  The first arg of DEFPARAMETER-LAZY is the getter function, not the variable name.");

	private static final SubLSymbol $sym521$INIT_VALUE = makeUninternedSymbol("INIT-VALUE");

	public static final SubLList $list523 = list(makeKeyword("UNINITIALIZED"));

	private static final SubLString $str524$Unable_to_initialize__A__ = makeString("Unable to initialize ~A~%");

	private static final SubLString $str525$Invalid_function_name__A___The_fi = makeString("Invalid function-name ~A.  The first arg of DEFVAR-LAZY is the getter function, not the variable name.");

	private static final SubLSymbol $sym526$INIT_VALUE = makeUninternedSymbol("INIT-VALUE");

	private static final SubLString $str527$Invalid_function_name__A___The_fi = makeString("Invalid function-name ~A.  The first arg of DEFGLOBAL-LAZY is the getter function, not the variable name.");

	private static final SubLSymbol $sym528$INIT_VALUE = makeUninternedSymbol("INIT-VALUE");

	private static final SubLString $str529$Invalid_function_name__A___The_fi = makeString("Invalid function-name ~A.  The first arg of DEFLEXICAL-LAZY is the getter function, not the variable name.");

	private static final SubLSymbol $sym530$INIT_VALUE = makeUninternedSymbol("INIT-VALUE");

	public static final SubLList $list531 = list(makeSymbol("NAME"), makeSymbol("ARGLIST"), makeSymbol("DOCUMENTATION-STRING"), makeSymbol("DECLARATIONS"), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol REGISTER_OBSOLETE_CYC_API_FUNCTION = makeSymbol("REGISTER-OBSOLETE-CYC-API-FUNCTION");

	private static final SubLSymbol $OBSOLETE_CYC_API_REPLACEMENTS = makeKeyword("OBSOLETE-CYC-API-REPLACEMENTS");

	private static final SubLInteger $int$40 = makeInteger(40);

	private static final SubLSymbol INITIALIZATION_FOR_PARTIAL_LIST_RESULTS = makeSymbol("INITIALIZATION-FOR-PARTIAL-LIST-RESULTS");

	private static final SubLSymbol ACCUMULATION_FOR_PARTIAL_LIST_RESULTS = makeSymbol("ACCUMULATION-FOR-PARTIAL-LIST-RESULTS");

	private static final SubLSymbol CONSOLIDATION_FOR_PARTIAL_LIST_RESULTS = makeSymbol("CONSOLIDATION-FOR-PARTIAL-LIST-RESULTS");

	private static final SubLSymbol NOTIFICATION_FOR_PARTIAL_LIST_RESULTS = makeSymbol("NOTIFICATION-FOR-PARTIAL-LIST-RESULTS");

	private static final SubLSymbol FINAL_RESULTS_FOR_PARTIAL_LIST_RESULTS = makeSymbol("FINAL-RESULTS-FOR-PARTIAL-LIST-RESULTS");

	private static final SubLList $list540 = list(list(makeSymbol("FINAL-RESULT-VAR"), makeSymbol("THRESHOLD")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLList $list541 = list(makeSymbol("*PARTIAL-RESULTS-ACCUMULATOR*"), list(makeSymbol("FUNCALL"), makeSymbol("*PARTIAL-RESULTS-INITIALIZATION-FN*")));

	private static final SubLList $list542 = list(makeSymbol("*PARTIAL-RESULTS-TOTAL-ACCUMULATOR*"), list(makeSymbol("FUNCALL"), makeSymbol("*PARTIAL-RESULTS-INITIALIZATION-FN*")));

	public static final SubLSymbol $partial_results_threshold$ = makeSymbol("*PARTIAL-RESULTS-THRESHOLD*");

	public static final SubLList $list544 = list(list(makeSymbol("*PARTIAL-RESULTS-SIZE*"), ZERO_INTEGER), list(makeSymbol("*PARTIAL-RESULTS-TOTAL-SIZE*"), ZERO_INTEGER), list(makeSymbol("*ACCUMULATING-PARTIAL-RESULTS?*"), T));

	private static final SubLList $list545 = list(makeSymbol("FUNCALL"), makeSymbol("*PARTIAL-RESULTS-CONSOLIDATION-FN*"), makeSymbol("*PARTIAL-RESULTS-ACCUMULATOR*"));

	public static final SubLList $list546 = list(list(makeSymbol("FUNCALL"), makeSymbol("*PARTIAL-RESULTS-FINAL-RESULT-FN*"), makeSymbol("*PARTIAL-RESULTS-TOTAL-ACCUMULATOR*")));

	private static final SubLSymbol WITH_SPACE_PROFILING_TO_STRING = makeSymbol("WITH-SPACE-PROFILING-TO-STRING");

	private static final SubLList $list548 = list(list(makeSymbol("STRING-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol $sym549$STREAM = makeUninternedSymbol("STREAM");

	private static final SubLSymbol WITH_SPACE_PROFILING = makeSymbol("WITH-SPACE-PROFILING");

	private static final SubLList $list553 = list(list(makeSymbol("RESULT-VAR"), makeSymbol("&KEY"), list(makeSymbol("INITIAL-VALUE"), ZERO_INTEGER)), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLList $list554 = list(makeKeyword("INITIAL-VALUE"));

	public static final SubLList $list556 = list(makeSymbol("*SXHASH-COMPOSITE-STATE*"), FOUR_INTEGER);

	public static final SubLSymbol $sxhash_composite_hash$ = makeSymbol("*SXHASH-COMPOSITE-HASH*");

	private static final SubLList $list558 = list(makeSymbol("*SXHASH-COMPOSITE-HASH*"));

	private static final SubLList $list559 = list(makeSymbol("COMPOSITE-STATE"), FOUR_INTEGER);

	private static final SubLSymbol COMPOSITE_HASH = makeSymbol("COMPOSITE-HASH");

	private static final SubLList $list561 = list(makeSymbol("COMPOSITE-HASH"));

	private static final SubLList $list562 = list(makeSymbol("VALUE"));

	private static final SubLList $list563 = list(makeSymbol("CSETQ"), makeSymbol("COMPOSITE-STATE"), list(makeSymbol("SXHASH-UPDATE-STATE"), makeSymbol("COMPOSITE-STATE")));

	private static final SubLSymbol LOGXOR = makeSymbol("LOGXOR");

	private static final SubLSymbol SXHASH_ROT = makeSymbol("SXHASH-ROT");

	private static final SubLSymbol SXHASH = makeSymbol("SXHASH");

	private static final SubLList $list567 = list(makeSymbol("COMPOSITE-STATE"));

	private static final SubLInteger $int$27 = makeInteger(27);

	private static final SubLObject $ic569 = vector(new SubLObject[] { SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER, ELEVEN_INTEGER, TWELVE_INTEGER, THIRTEEN_INTEGER, FOURTEEN_INTEGER, FIFTEEN_INTEGER, SIXTEEN_INTEGER, SEVENTEEN_INTEGER, EIGHTEEN_INTEGER, NINETEEN_INTEGER, TWENTY_INTEGER, makeInteger(21), makeInteger(22), makeInteger(23), makeInteger(24), makeInteger(25), makeInteger(26), makeInteger(27),
			makeInteger(28), makeInteger(29), makeInteger(30), makeInteger(31), ZERO_INTEGER, ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER });

	private static final SubLSymbol SXHASH_COMPOSITE_UPDATE = makeSymbol("SXHASH-COMPOSITE-UPDATE");

	private static final SubLSymbol COMPUTE_SXHASH_COMPOSITE = makeSymbol("COMPUTE-SXHASH-COMPOSITE");

	private static final SubLInteger $int$1000000 = makeInteger(1000000);

	private static final SubLInteger $int$167 = makeInteger(167);

	private static final SubLList $list574 = list(list(makeSymbol("VAR"), makeSymbol("CATCH?")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLList $list575 = list(list(makeSymbol("TAG"), makeSymbol("ANS-VAR"), makeSymbol("CATCH?")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLList $list577 = list(list(makeSymbol("PRE-N"), makeSymbol("N")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol $sym578$TIMINGS = makeUninternedSymbol("TIMINGS");

	private static final SubLSymbol $sym579$TIME = makeUninternedSymbol("TIME");

	private static final SubLSymbol $sym580$I = makeUninternedSymbol("I");

	private static final SubLList $list581 = list(makeSymbol("BENCHMARK-GC"));

	private static final SubLSymbol $sym582$_ = makeSymbol("+");

	private static final SubLList $list583 = list(list(makeSymbol("BENCHMARK-GC")));

	private static final SubLSymbol PERFORM_STANDARD_STATISTICAL_ANALYSIS = makeSymbol("PERFORM-STANDARD-STATISTICAL-ANALYSIS");

	private static final SubLSymbol BENCHMARK_GC = makeSymbol("BENCHMARK-GC");

	private static final SubLSymbol RUN_BENCHMARK_COMPENSATING_FOR_PAGING = makeSymbol("RUN-BENCHMARK-COMPENSATING-FOR-PAGING");

	private static final SubLList $list587 = list(list(makeSymbol("*PRINT-PRETTY*"), NIL), list(makeSymbol("*PRINT-LENGTH*"), NIL), list(makeSymbol("*PRINT-LEVEL*"), NIL));

	private static final SubLList $list588 = list(list(makeSymbol("TIMEOUT"), makeSymbol("TIMED-OUT?")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLList $list590 = list(list(makeSymbol("RETRIES"), makeSymbol("SECONDS-BETWEEN")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol $sym591$ERROR_MSG = makeUninternedSymbol("ERROR-MSG");

	private static final SubLSymbol $sym592$SUCCESS = makeUninternedSymbol("SUCCESS");

	private static final SubLSymbol $sym593$N = makeUninternedSymbol("N");

	static final boolean assertionsDisabledSynth = true;

	public static SubLObject define_api(final SubLObject macroform, final SubLObject environment) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject name = NIL;
		SubLObject arglist = NIL;
		SubLObject documentation_string = NIL;
		SubLObject type_declarations = NIL;
		destructuring_bind_must_consp(current, datum, $list0);
		name = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list0);
		arglist = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list0);
		documentation_string = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list0);
		type_declarations = current.first();
		final SubLObject body;
		current = body = current.rest();
		assert NIL != stringp(documentation_string) : "Types.stringp(documentation_string) " + "CommonSymbols.NIL != Types.stringp(documentation_string) " + documentation_string;
		assert NIL != listp(type_declarations) : "Types.listp(type_declarations) " + "CommonSymbols.NIL != Types.listp(type_declarations) " + type_declarations;
		thread.resetMultipleValues();
		final SubLObject argument_types = parse_api_type_declarations(type_declarations);
		final SubLObject body_preamble = thread.secondMultipleValue();
		final SubLObject return_types = thread.thirdMultipleValue();
		thread.resetMultipleValues();
		return list(PROGN, listS(DEFINE_PUBLIC, name, arglist, documentation_string, append(body_preamble, body, NIL)), list(REGISTER_CYC_API_FUNCTION, list(QUOTE, name), list(QUOTE, arglist), documentation_string, list(QUOTE, argument_types), list(QUOTE, return_types)));
	}

	public static SubLObject declare_api_function(final SubLObject macroform, final SubLObject environment) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject name = NIL;
		SubLObject arglist = NIL;
		destructuring_bind_must_consp(current, datum, $list7);
		name = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list7);
		arglist = current.first();
		final SubLObject body;
		current = body = current.rest();
		SubLObject current_$2;
		final SubLObject datum_$1 = current_$2 = body;
		SubLObject documentation_string = NIL;
		SubLObject type_declarations = NIL;
		destructuring_bind_must_consp(current_$2, datum_$1, $list8);
		documentation_string = current_$2.first();
		current_$2 = current_$2.rest();
		destructuring_bind_must_consp(current_$2, datum_$1, $list8);
		type_declarations = current_$2.first();
		current_$2 = current_$2.rest();
		if (NIL != current_$2) {
			cdestructuring_bind_error(datum_$1, $list8);
			return NIL;
		}
		assert NIL != stringp(documentation_string) : "Types.stringp(documentation_string) " + "CommonSymbols.NIL != Types.stringp(documentation_string) " + documentation_string;
		assert NIL != listp(type_declarations) : "Types.listp(type_declarations) " + "CommonSymbols.NIL != Types.listp(type_declarations) " + type_declarations;
		thread.resetMultipleValues();
		final SubLObject argument_types = parse_api_type_declarations(type_declarations);
		final SubLObject body_preamble = thread.secondMultipleValue();
		final SubLObject return_types = thread.thirdMultipleValue();
		thread.resetMultipleValues();
		return list(REGISTER_CYC_API_FUNCTION, list(QUOTE, name), list(QUOTE, arglist), documentation_string, list(QUOTE, argument_types), list(QUOTE, return_types));
	}

	public static SubLObject defmacro_api(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject name = NIL;
		SubLObject pattern = NIL;
		SubLObject documentation_string = NIL;
		destructuring_bind_must_consp(current, datum, $list9);
		name = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list9);
		pattern = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list9);
		documentation_string = current.first();
		final SubLObject body;
		current = body = current.rest();
		assert NIL != stringp(documentation_string) : "Types.stringp(documentation_string) " + "CommonSymbols.NIL != Types.stringp(documentation_string) " + documentation_string;
		return list(PROGN, listS(DEFMACRO_PUBLIC, name, pattern, documentation_string, append(body, NIL)), list(REGISTER_CYC_API_MACRO, list(QUOTE, name), list(QUOTE, pattern), documentation_string));
	}

	public static SubLObject define_api_provisional(final SubLObject macroform, final SubLObject environment) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject name = NIL;
		SubLObject arglist = NIL;
		SubLObject documentation_string = NIL;
		SubLObject type_declarations = NIL;
		destructuring_bind_must_consp(current, datum, $list0);
		name = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list0);
		arglist = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list0);
		documentation_string = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list0);
		type_declarations = current.first();
		final SubLObject body;
		current = body = current.rest();
		assert NIL != stringp(documentation_string) : "Types.stringp(documentation_string) " + "CommonSymbols.NIL != Types.stringp(documentation_string) " + documentation_string;
		assert NIL != listp(type_declarations) : "Types.listp(type_declarations) " + "CommonSymbols.NIL != Types.listp(type_declarations) " + type_declarations;
		thread.resetMultipleValues();
		final SubLObject argument_types = parse_api_type_declarations(type_declarations);
		final SubLObject body_preamble = thread.secondMultipleValue();
		final SubLObject return_types = thread.thirdMultipleValue();
		thread.resetMultipleValues();
		return list(PROGN, listS(DEFINE_EXTERNAL, name, arglist, documentation_string, append(body_preamble, body, NIL)));
	}

	public static SubLObject defmacro_api_provisional(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject name = NIL;
		SubLObject pattern = NIL;
		SubLObject documentation_string = NIL;
		SubLObject type_declarations = NIL;
		destructuring_bind_must_consp(current, datum, $list13);
		name = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list13);
		pattern = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list13);
		documentation_string = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list13);
		type_declarations = current.first();
		final SubLObject body;
		current = body = current.rest();
		assert NIL != stringp(documentation_string) : "Types.stringp(documentation_string) " + "CommonSymbols.NIL != Types.stringp(documentation_string) " + documentation_string;
		assert NIL != listp(type_declarations) : "Types.listp(type_declarations) " + "CommonSymbols.NIL != Types.listp(type_declarations) " + type_declarations;
		return list(PROGN, list(REGISTER_EXTERNAL_SYMBOL, list(QUOTE, name)), listS(DEFMACRO_PUBLIC, name, pattern, documentation_string, append(body, NIL)));
	}

	public static SubLObject register_cyc_api_function(final SubLObject name, final SubLObject arglist, final SubLObject doc_string, final SubLObject argument_types, final SubLObject return_types) {
		register_api_predefined_function(name);
		register_cyc_api_symbol(name);
		register_cyc_api_args(name, arglist);
		register_cyc_api_function_documentation(name, doc_string);
		register_cyc_api_arg_types(name, argument_types);
		register_cyc_api_return_types(name, return_types);
		return NIL;
	}

	public static SubLObject register_cyc_api_macro(final SubLObject name, final SubLObject pattern, final SubLObject doc_string) {
		register_api_predefined_macro(name);
		register_cyc_api_symbol(name);
		register_cyc_api_args(name, pattern);
		register_cyc_api_function_documentation(name, doc_string);
		return NIL;
	}

	public static SubLObject api_special_p(final SubLObject operator) {
		return list_utilities.sublisp_boolean(gethash(operator, $api_special_table$.getGlobalValue(), NIL));
	}

	public static SubLObject api_special_handler(final SubLObject operator) {
		return gethash(operator, $api_special_table$.getGlobalValue(), UNPROVIDED);
	}

	public static SubLObject register_api_special(final SubLObject operator, final SubLObject handler) {
		if ((NIL != api_predefined_function_p(operator)) || (NIL != api_predefined_macro_p(operator))) {
			Errors.warn($str16$Registering__A_as_special_even_th, operator);
		} else {
			sethash(operator, $api_special_table$.getGlobalValue(), handler);
		}
		return operator;
	}

	public static SubLObject api_predefined_function_p(final SubLObject operator) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != api_predefined_host_function_p(operator)) {
			return system_parameters.$permit_api_host_access$.getDynamicValue(thread);
		}
		return gethash(operator, $api_predefined_function_table$.getGlobalValue(), NIL);
	}

	public static SubLObject register_api_predefined_function(final SubLObject operator) {
		if (NIL == api_special_p(operator)) {
			sethash(operator, $api_predefined_function_table$.getGlobalValue(), T);
		}
		return operator;
	}

	public static SubLObject unregister_api_predefined_function(final SubLObject operator) {
		return remhash(operator, $api_predefined_function_table$.getGlobalValue());
	}

	public static SubLObject api_predefined_host_function_p(final SubLObject operator) {
		return gethash(operator, $api_predefined_host_function_table$.getGlobalValue(), NIL);
	}

	public static SubLObject register_api_predefined_host_function(final SubLObject operator) {
		if (NIL == api_special_p(operator)) {
			sethash(operator, $api_predefined_host_function_table$.getGlobalValue(), T);
		}
		return operator;
	}

	public static SubLObject unregister_api_predefined_host_function(final SubLObject operator) {
		return remhash(operator, $api_predefined_host_function_table$.getGlobalValue());
	}

	public static SubLObject api_predefined_macro_p(final SubLObject operator) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != api_predefined_host_macro_p(operator)) {
			return system_parameters.$permit_api_host_access$.getDynamicValue(thread);
		}
		return gethash(operator, $api_predefined_macro_table$.getGlobalValue(), NIL);
	}

	public static SubLObject register_api_predefined_macro(final SubLObject operator) {
		if (NIL == api_special_p(operator)) {
			sethash(operator, $api_predefined_macro_table$.getGlobalValue(), T);
		}
		return operator;
	}

	public static SubLObject unregister_api_predefined_macro(final SubLObject operator) {
		return remhash(operator, $api_predefined_macro_table$.getGlobalValue());
	}

	public static SubLObject api_predefined_host_macro_p(final SubLObject operator) {
		return gethash(operator, $api_predefined_host_macro_table$.getGlobalValue(), NIL);
	}

	public static SubLObject register_api_predefined_host_macro(final SubLObject operator) {
		if (NIL == api_special_p(operator)) {
			sethash(operator, $api_predefined_host_macro_table$.getGlobalValue(), T);
		}
		return operator;
	}

	public static SubLObject unregister_api_predefined_host_macro(final SubLObject operator) {
		return remhash(operator, $api_predefined_host_macro_table$.getGlobalValue());
	}

	public static SubLObject cyc_api_symbol_p(final SubLObject obj) {
		return makeBoolean(obj.isSymbol() && (NIL != get(obj, $CYC_API_SYMBOL, NIL)));
	}

	public static SubLObject register_cyc_api_symbol(final SubLObject name) {
		assert NIL != symbolp(name) : "Types.symbolp(name) " + "CommonSymbols.NIL != Types.symbolp(name) " + name;
		put(name, $CYC_API_SYMBOL, T);
		if (NIL == member(name, $api_symbols$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
			$api_symbols$.setGlobalValue(cons(name, $api_symbols$.getGlobalValue()));
		}
		return name;
	}

	public static SubLObject deregister_cyc_api_symbol(final SubLObject name) {
		assert NIL != symbolp(name) : "Types.symbolp(name) " + "CommonSymbols.NIL != Types.symbolp(name) " + name;
		remove(name, $api_symbols$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		return remprop(name, $CYC_API_SYMBOL);
	}

	public static SubLObject cyc_api_args(final SubLObject name) {
		return get(name, $CYC_API_ARGS, UNPROVIDED);
	}

	public static SubLObject register_cyc_api_args(final SubLObject name, final SubLObject arglist) {
		assert NIL != symbolp(name) : "Types.symbolp(name) " + "CommonSymbols.NIL != Types.symbolp(name) " + name;
		assert NIL != listp(arglist) : "Types.listp(arglist) " + "CommonSymbols.NIL != Types.listp(arglist) " + arglist;
		put(name, $CYC_API_ARGS, arglist);
		return name;
	}

	public static SubLObject deregister_cyc_api_args(final SubLObject name) {
		assert NIL != symbolp(name) : "Types.symbolp(name) " + "CommonSymbols.NIL != Types.symbolp(name) " + name;
		return remprop(name, $CYC_API_ARGS);
	}

	public static SubLObject register_cyc_api_function_documentation(final SubLObject name, final SubLObject documentation_string) {
		assert NIL != symbolp(name) : "Types.symbolp(name) " + "CommonSymbols.NIL != Types.symbolp(name) " + name;
		assert NIL != stringp(documentation_string) : "Types.stringp(documentation_string) " + "CommonSymbols.NIL != Types.stringp(documentation_string) " + documentation_string;
		return NIL;
	}

	public static SubLObject get_api_arg_types(final SubLObject name) {
		return get(name, $CYC_API_ARG_TYPES, UNPROVIDED);
	}

	public static SubLObject register_cyc_api_arg_types(final SubLObject name, final SubLObject argument_type_list) {
		assert NIL != symbolp(name) : "Types.symbolp(name) " + "CommonSymbols.NIL != Types.symbolp(name) " + name;
		assert NIL != listp(argument_type_list) : "Types.listp(argument_type_list) " + "CommonSymbols.NIL != Types.listp(argument_type_list) " + argument_type_list;
		put(name, $CYC_API_ARG_TYPES, argument_type_list);
		return name;
	}

	public static SubLObject deregister_cyc_api_arg_types(final SubLObject name) {
		assert NIL != symbolp(name) : "Types.symbolp(name) " + "CommonSymbols.NIL != Types.symbolp(name) " + name;
		return remprop(name, $CYC_API_ARG_TYPES);
	}

	public static SubLObject get_api_return_types(final SubLObject name) {
		return get(name, $CYC_API_RETURN_TYPES, UNPROVIDED);
	}

	public static SubLObject register_cyc_api_return_types(final SubLObject name, final SubLObject return_types) {
		assert NIL != symbolp(name) : "Types.symbolp(name) " + "CommonSymbols.NIL != Types.symbolp(name) " + name;
		assert NIL != listp(return_types) : "Types.listp(return_types) " + "CommonSymbols.NIL != Types.listp(return_types) " + return_types;
		SubLObject cdolist_list_var = return_types;
		SubLObject return_type = NIL;
		return_type = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			validate_return_type(return_type);
			cdolist_list_var = cdolist_list_var.rest();
			return_type = cdolist_list_var.first();
		}
		put(name, $CYC_API_RETURN_TYPES, return_types);
		return name;
	}

	public static SubLObject deregister_cyc_api_return_types(final SubLObject name) {
		assert NIL != symbolp(name) : "Types.symbolp(name) " + "CommonSymbols.NIL != Types.symbolp(name) " + name;
		return remprop(name, $CYC_API_RETURN_TYPES);
	}

	public static SubLObject parse_api_type_declarations(final SubLObject type_declarations) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		final SubLObject argument_types = parse_api_declarations_int(type_declarations, NIL);
		final SubLObject body_preamble = thread.secondMultipleValue();
		final SubLObject return_types = thread.thirdMultipleValue();
		final SubLObject replacements = thread.fourthMultipleValue();
		thread.resetMultipleValues();
		return values(argument_types, body_preamble, return_types);
	}

	public static SubLObject parse_obsolete_api_declarations(final SubLObject declarations) {
		return parse_api_declarations_int(declarations, T);
	}

	public static SubLObject parse_api_declarations_int(final SubLObject declarations, final SubLObject allow_replacementsP) {
		SubLObject replacements = NIL;
		SubLObject argument_types = NIL;
		SubLObject body_preamble = NIL;
		SubLObject return_types = NIL;
		SubLObject cdolist_list_var = declarations;
		SubLObject declaration = NIL;
		declaration = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			final SubLObject pcase_var = declaration.first();
			if (pcase_var.eql($REPLACEMENTS)) {
				if (NIL == allow_replacementsP) {
					Errors.error($str31$_replacements_not_allowed_in_the_);
				}
				replacements = declaration.rest();
			} else if (pcase_var.eql($ARGUMENT_TYPES)) {
				SubLObject cdolist_list_var_$3;
				argument_types = cdolist_list_var_$3 = declaration.rest();
				SubLObject argument_type = NIL;
				argument_type = cdolist_list_var_$3.first();
				while (NIL != cdolist_list_var_$3) {
					body_preamble = append(body_preamble, list(expand_into_enforce_type(argument_type)));
					cdolist_list_var_$3 = cdolist_list_var_$3.rest();
					argument_type = cdolist_list_var_$3.first();
				}
			} else if (pcase_var.eql($RETURN_TYPES)) {
				return_types = declaration.rest();
			}

			cdolist_list_var = cdolist_list_var.rest();
			declaration = cdolist_list_var.first();
		}
		return values(argument_types, body_preamble, return_types, replacements);
	}

	public static SubLObject expand_into_enforce_type(final SubLObject argument_type) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject argument = argument_type.first();
		final SubLObject predicate_expression = second(argument_type);
		SubLObject predicate = NIL;
		if (predicate_expression.isAtom()) {
			if (NIL == member(predicate_expression, $api_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
				$api_types$.setGlobalValue(cons(predicate_expression, $api_types$.getGlobalValue()));
			}
			return list(ENFORCE_TYPE, argument, predicate_expression);
		}
		if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (predicate_expression.first() != NIL_OR)) {
			Errors.error($str36$Invalid_argument_type_expression_, argument_type);
		}
		predicate = second(predicate_expression);
		return list(PWHEN, argument, list(ENFORCE_TYPE, argument, predicate));
	}

	public static SubLObject validate_return_type(final SubLObject return_type) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (return_type.isAtom()) {
			if (NIL == member(return_type, $api_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
				$api_types$.setGlobalValue(cons(return_type, $api_types$.getGlobalValue()));
			}
			return T;
		}
		if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!length(return_type).eql(TWO_INTEGER))) {
			Errors.error($str38$_S_return_type_expression_not_lis, return_type);
		}
		if (NIL != member(return_type.first(), $list39, UNPROVIDED, UNPROVIDED)) {
			return validate_return_type(second(return_type));
		}
		Errors.error($str40$_S_complex_return_type_expression, return_type);
		return T;
	}

	public static SubLObject define_after_adding(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject name = NIL;
		SubLObject arglist = NIL;
		destructuring_bind_must_consp(current, datum, $list7);
		name = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list7);
		arglist = current.first();
		final SubLObject body;
		current = body = current.rest();
		return listS(DEFINE_KB, name, arglist, append(body, NIL));
	}

	public static SubLObject define_after_removing(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject name = NIL;
		SubLObject arglist = NIL;
		destructuring_bind_must_consp(current, datum, $list7);
		name = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list7);
		arglist = current.first();
		final SubLObject body;
		current = body = current.rest();
		return listS(DEFINE_KB, name, arglist, append(body, NIL));
	}

	public static SubLObject define_rule_after_adding(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject name = NIL;
		SubLObject arglist = NIL;
		destructuring_bind_must_consp(current, datum, $list7);
		name = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list7);
		arglist = current.first();
		final SubLObject body;
		current = body = current.rest();
		return listS(DEFINE_KB, name, arglist, append(body, NIL));
	}

	public static SubLObject define_rule_after_removing(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject name = NIL;
		SubLObject arglist = NIL;
		destructuring_bind_must_consp(current, datum, $list7);
		name = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list7);
		arglist = current.first();
		final SubLObject body;
		current = body = current.rest();
		return listS(DEFINE_KB, name, arglist, append(body, NIL));
	}

	public static SubLObject define_collection_defn(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject name = NIL;
		SubLObject arglist = NIL;
		destructuring_bind_must_consp(current, datum, $list7);
		name = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list7);
		arglist = current.first();
		final SubLObject body;
		current = body = current.rest();
		return listS(DEFINE_KB, name, arglist, append(body, NIL));
	}

	public static SubLObject define_evaluation_defn(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject name = NIL;
		SubLObject pattern = NIL;
		destructuring_bind_must_consp(current, datum, $list48);
		name = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list48);
		pattern = current.first();
		final SubLObject body;
		current = body = current.rest();
		return listS(DEFINE_KB, name, pattern, append(body, NIL));
	}

	public static SubLObject define_expansion_defn(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject name = NIL;
		SubLObject pattern = NIL;
		destructuring_bind_must_consp(current, datum, $list48);
		name = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list48);
		pattern = current.first();
		final SubLObject body;
		current = body = current.rest();
		return listS(DEFINE_KB, name, pattern, append(body, NIL));
	}

	public static SubLObject define_cyc_subl_defn(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject function_symbol = NIL;
		SubLObject basis_function = NIL;
		destructuring_bind_must_consp(current, datum, $list51);
		function_symbol = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list51);
		basis_function = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject arglist = $list52;
			final SubLObject body = list(PWHEN, $list53, list(RET, bq_cons(basis_function, $list55)));
			return list(DEFINE_KB, function_symbol, arglist, body);
		}
		cdestructuring_bind_error(datum, $list51);
		return NIL;
	}

	public static SubLObject define_kb(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject name = NIL;
		SubLObject arglist = NIL;
		destructuring_bind_must_consp(current, datum, $list7);
		name = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list7);
		arglist = current.first();
		final SubLObject body;
		current = body = current.rest();
		return list(PROGN, listS(DEFINE, name, arglist, append(body, NIL)), list(REGISTER_KB_FUNCTION, list(QUOTE, name)));
	}

	public static SubLObject kb_function_p(final SubLObject symbol) {
		return gethash_without_values(symbol, $kb_function_table$.getGlobalValue(), UNPROVIDED);
	}

	public static SubLObject register_kb_symbol(final SubLObject symbol) {
		assert NIL != symbolp(symbol) : "Types.symbolp(symbol) " + "CommonSymbols.NIL != Types.symbolp(symbol) " + symbol;
		sethash(symbol, $kb_function_table$.getGlobalValue(), T);
		return symbol;
	}

	public static SubLObject deregister_kb_symbol(final SubLObject symbol) {
		assert NIL != symbolp(symbol) : "Types.symbolp(symbol) " + "CommonSymbols.NIL != Types.symbolp(symbol) " + symbol;
		return remhash(symbol, $kb_function_table$.getGlobalValue());
	}

	public static SubLObject deregister_all_kb_functions() {
		clrhash($kb_function_table$.getGlobalValue());
		return T;
	}

	public static SubLObject all_kb_functions() {
		SubLObject kb_functions = NIL;
		SubLObject symbol = NIL;
		SubLObject value = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator($kb_function_table$.getGlobalValue());
		try {
			while (iteratorHasNext(cdohash_iterator)) {
				final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
				symbol = getEntryKey(cdohash_entry);
				value = getEntryValue(cdohash_entry);
				kb_functions = cons(symbol, kb_functions);
			}
		} finally {
			releaseEntrySetIterator(cdohash_iterator);
		}
		kb_functions = Sort.sort(kb_functions, symbol_function(STRING_LESSP), symbol_function(SYMBOL_NAME));
		return kb_functions;
	}

	public static SubLObject register_kb_function(final SubLObject function_symbol) {
		return register_kb_symbol(function_symbol);
	}

	public static SubLObject deregister_kb_function(final SubLObject function_symbol) {
		return deregister_kb_symbol(function_symbol);
	}

	public static SubLObject define_private_funcall(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject name = NIL;
		SubLObject arglist = NIL;
		destructuring_bind_must_consp(current, datum, $list7);
		name = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list7);
		arglist = current.first();
		final SubLObject body;
		current = body = current.rest();
		return list(PROGN, listS(DEFINE_PRIVATE, name, arglist, append(body, NIL)), list(NOTE_FUNCALL_HELPER_FUNCTION, list(QUOTE, name)));
	}

	public static SubLObject note_funcall_helper_function(final SubLObject symbol) {
		put(symbol, $funcall_helper_property$.getGlobalValue(), T);
		return T;
	}

	public static SubLObject funcall_helper_functionP(final SubLObject symbol) {
		return get(symbol, $funcall_helper_property$.getGlobalValue(), NIL);
	}

	public static SubLObject unprovided_argumentP(final SubLObject arg) {
		return eq(arg, $unprovided$.getGlobalValue());
	}

	public static SubLObject declare_control_parameter(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject variable = NIL;
		SubLObject fancy_name = NIL;
		SubLObject description = NIL;
		SubLObject settings_spec = NIL;
		destructuring_bind_must_consp(current, datum, $list70);
		variable = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list70);
		fancy_name = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list70);
		description = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list70);
		settings_spec = current.first();
		current = current.rest();
		if (NIL == current) {
			return list(DECLARE_CONTROL_PARAMETER_INTERNAL, list(QUOTE, variable), fancy_name, description, list(QUOTE, settings_spec));
		}
		cdestructuring_bind_error(datum, $list70);
		return NIL;
	}

	public static SubLObject declare_control_parameter_internal(final SubLObject variable, final SubLObject fancy_name, final SubLObject description, final SubLObject settings_spec) {
		assert NIL != symbolp(variable) : "Types.symbolp(variable) " + "CommonSymbols.NIL != Types.symbolp(variable) " + variable;
		assert NIL != stringp(fancy_name) : "Types.stringp(fancy_name) " + "CommonSymbols.NIL != Types.stringp(fancy_name) " + fancy_name;
		assert NIL != stringp(description) : "Types.stringp(description) " + "CommonSymbols.NIL != Types.stringp(description) " + description;
		put(variable, $FANCY_NAME, fancy_name);
		put(variable, $DESCRIPTION, description);
		put(variable, $SETTINGS_SPEC, settings_spec);
		return variable;
	}

	public static SubLObject until_mapping_finished(final SubLObject macroform, final SubLObject environment) {
		final SubLObject datum = macroform.rest();
		final SubLObject body;
		final SubLObject current = body = datum;
		return listS(CCATCH_IGNORE, $MAPPING_DONE, append(body, NIL));
	}

	public static SubLObject mapping_finished() {
		sublisp_throw($MAPPING_DONE, NIL);
		return NIL;
	}

	public static SubLObject until_sbhl_mapping_finished(final SubLObject macroform, final SubLObject environment) {
		final SubLObject datum = macroform.rest();
		final SubLObject body;
		final SubLObject current = body = datum;
		return listS(CCATCH_IGNORE, $SBHL_MAPPING_DONE, append(body, NIL));
	}

	public static SubLObject sbhl_mapping_finished() {
		sublisp_throw($SBHL_MAPPING_DONE, NIL);
		return NIL;
	}

	public static SubLObject cfasl_write(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject obj = NIL;
		destructuring_bind_must_consp(current, datum, $list78);
		obj = current.first();
		current = current.rest();
		if (NIL == current) {
			return listS(WRITE_BYTE, obj, $list80);
		}
		cdestructuring_bind_error(datum, $list78);
		return NIL;
	}

	public static SubLObject cfasl_read(final SubLObject macroform, final SubLObject environment) {
		final SubLObject datum = macroform.rest();
		if (NIL != datum) {
			cdestructuring_bind_error(datum, NIL);
		}
		return $list81;
	}

	public static SubLObject if_lock_idle(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject lock = NIL;
		SubLObject action = NIL;
		destructuring_bind_must_consp(current, datum, $list82);
		lock = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list82);
		action = current.first();
		current = current.rest();
		final SubLObject else_action = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, datum, $list82);
		current = current.rest();
		if (NIL != current) {
			cdestructuring_bind_error(datum, $list82);
			return NIL;
		}
		final SubLObject lock_var = $sym83$LOCK_VAR;
		if (NIL != else_action) {
			return list(CLET, list(list(lock_var, lock)), list(PIF, list(LOCK_IDLE_P, lock_var), list(WITH_LOCK_HELD, list(lock_var), action), else_action));
		}
		return list(CLET, list(list(lock_var, lock)), list(PWHEN, list(LOCK_IDLE_P, lock_var), list(WITH_LOCK_HELD, list(lock_var), action)));
	}

	public static SubLObject possibly_with_lock_held(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject lock = NIL;
		destructuring_bind_must_consp(current, datum, $list88);
		lock = current.first();
		final SubLObject body;
		current = body = current.rest();
		return listS(PIF, lock, listS(WITH_LOCK_HELD, list(lock), append(body, NIL)), append(body, NIL));
	}

	public static SubLObject defglobal_lock(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject variable = NIL;
		SubLObject name = NIL;
		destructuring_bind_must_consp(current, datum, $list89);
		variable = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list89);
		name = current.first();
		current = current.rest();
		SubLObject allow_other_keys_p = NIL;
		SubLObject rest = current;
		SubLObject bad = NIL;
		SubLObject current_$4 = NIL;
		while (NIL != rest) {
			destructuring_bind_must_consp(rest, datum, $list89);
			current_$4 = rest.first();
			rest = rest.rest();
			destructuring_bind_must_consp(rest, datum, $list89);
			if (NIL == member(current_$4, $list90, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			}
			if (current_$4 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			}
			rest = rest.rest();
		}
		if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			cdestructuring_bind_error(datum, $list89);
		}
		final SubLObject vaccess_tail = property_list_member($VACCESS, current);
		final SubLObject vaccess = (NIL != vaccess_tail) ? cadr(vaccess_tail) : NIL;
		final SubLObject documentation_tail = property_list_member($DOCUMENTATION, current);
		final SubLObject documentation = (NIL != documentation_tail) ? cadr(documentation_tail) : NIL;
		final SubLObject init_form = global_lock_initialization_form(name);
		return bq_cons(PROGN, append(NIL != vaccess ? list(list(DECLAIM, list(VACCESS, vaccess, variable))) : NIL, list(listS(DEFGLOBAL, variable, init_form, append(NIL != documentation ? list(documentation) : NIL, NIL)), list(REGISTER_GLOBAL_LOCK, list(QUOTE, variable), name))));
	}

	public static SubLObject initialize_global_locks() {
		SubLObject cdolist_list_var = $global_locks$.getGlobalValue();
		SubLObject pair = NIL;
		pair = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject current;
			final SubLObject datum = current = pair;
			SubLObject global = NIL;
			SubLObject name = NIL;
			destructuring_bind_must_consp(current, datum, $list99);
			global = current.first();
			current = name = current.rest();
			initialize_global_lock_internal(global, name);
			cdolist_list_var = cdolist_list_var.rest();
			pair = cdolist_list_var.first();
		}
		return NIL;
	}

	public static SubLObject register_global_lock(final SubLObject global, final SubLObject name) {
		assert NIL != symbolp(global) : "Types.symbolp(global) " + "CommonSymbols.NIL != Types.symbolp(global) " + global;
		assert NIL != stringp(name) : "Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) " + name;
		$global_locks$.setGlobalValue(delete(global, $global_locks$.getGlobalValue(), symbol_function(EQL), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED));
		$global_locks$.setGlobalValue(cons(cons(global, name), $global_locks$.getGlobalValue()));
		return $global_locks$.getGlobalValue();
	}

	public static SubLObject global_lock_p(final SubLObject v_object) {
		return list_utilities.sublisp_boolean(assoc(v_object, $global_locks$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
	}

	public static SubLObject global_lock_initialization_form(final SubLObject name) {
		assert NIL != stringp(name) : "Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) " + name;
		return list(MAKE_LOCK, name);
	}

	public static SubLObject initialize_global_lock(final SubLObject global) {
		assert NIL != global_lock_p(global) : "utilities_macros.global_lock_p(global) " + "CommonSymbols.NIL != utilities_macros.global_lock_p(global) " + global;
		final SubLObject name = assoc(global, $global_locks$.getGlobalValue(), UNPROVIDED, UNPROVIDED).rest();
		if (name.isString()) {
			initialize_global_lock_internal(global, name);
		}
		return symbol_value(global);
	}

	public static SubLObject initialize_global_lock_internal(final SubLObject global, final SubLObject name) {
		final SubLObject init_form = global_lock_initialization_form(name);
		eval(list(CSETQ, global, init_form));
		return symbol_value(global);
	}

	public static SubLObject defparameter_fi(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject variable = NIL;
		destructuring_bind_must_consp(current, datum, $list107);
		variable = current.first();
		current = current.rest();
		final SubLObject initialization = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, datum, $list107);
		current = current.rest();
		final SubLObject documentation = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, datum, $list107);
		current = current.rest();
		if (NIL == current) {
			return list(PROGN, list(DEFPARAMETER_HTML, variable, initialization, documentation), listS(CPUSHNEW, list(QUOTE, variable), $list110));
		}
		cdestructuring_bind_error(datum, $list107);
		return NIL;
	}

	public static SubLObject with_clean_fi_state(final SubLObject macroform, final SubLObject environment) {
		final SubLObject datum = macroform.rest();
		final SubLObject body;
		final SubLObject current = body = datum;
		return listS(CPROGV, $fi_state_variables$, $list112, append(body, NIL));
	}

	public static SubLObject register_html_state_variable(final SubLObject variable) {
		if (NIL == member(variable, $html_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
			$html_state_variables$.setGlobalValue(cons(variable, $html_state_variables$.getGlobalValue()));
		}
		return NIL;
	}

	public static SubLObject defparameter_html(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject variable = NIL;
		destructuring_bind_must_consp(current, datum, $list107);
		variable = current.first();
		current = current.rest();
		final SubLObject initialization = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, datum, $list107);
		current = current.rest();
		final SubLObject documentation = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, datum, $list107);
		current = current.rest();
		if (NIL != current) {
			cdestructuring_bind_error(datum, $list107);
			return NIL;
		}
		if (NIL != system_info.cyc_html_feature()) {
			return list(PROGN, list(DEFPARAMETER, variable, initialization, documentation), list(REGISTER_HTML_STATE_VARIABLE, list(QUOTE, variable)));
		}
		return list(DEFPARAMETER, variable, initialization, documentation);
	}

	public static SubLObject defvar_html(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject variable = NIL;
		destructuring_bind_must_consp(current, datum, $list107);
		variable = current.first();
		current = current.rest();
		final SubLObject initialization = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, datum, $list107);
		current = current.rest();
		final SubLObject documentation = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, datum, $list107);
		current = current.rest();
		if (NIL != current) {
			cdestructuring_bind_error(datum, $list107);
			return NIL;
		}
		if (NIL != system_info.cyc_html_feature()) {
			return list(PROGN, list(DEFVAR, variable, initialization, documentation), list(REGISTER_HTML_STATE_VARIABLE, list(QUOTE, variable)));
		}
		return list(DEFVAR, variable, initialization, documentation);
	}

	public static SubLObject register_html_interface_variable(final SubLObject variable) {
		if (NIL == member(variable, $html_interface_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
			$html_interface_variables$.setGlobalValue(cons(variable, $html_interface_variables$.getGlobalValue()));
		}
		return NIL;
	}

	public static SubLObject defparameter_html_interface(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject variable = NIL;
		destructuring_bind_must_consp(current, datum, $list107);
		variable = current.first();
		current = current.rest();
		final SubLObject initialization = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, datum, $list107);
		current = current.rest();
		final SubLObject documentation = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, datum, $list107);
		current = current.rest();
		if (NIL != current) {
			cdestructuring_bind_error(datum, $list107);
			return NIL;
		}
		if (NIL != system_info.cyc_html_feature()) {
			return list(PROGN, list(DEFPARAMETER, variable, initialization, documentation), list(REGISTER_HTML_STATE_VARIABLE, list(QUOTE, variable)), list(REGISTER_HTML_INTERFACE_VARIABLE, list(QUOTE, variable)));
		}
		return list(DEFPARAMETER, variable, initialization, documentation);
	}

	public static SubLObject defvar_html_interface(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject variable = NIL;
		destructuring_bind_must_consp(current, datum, $list107);
		variable = current.first();
		current = current.rest();
		final SubLObject initialization = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, datum, $list107);
		current = current.rest();
		final SubLObject documentation = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, datum, $list107);
		current = current.rest();
		if (NIL != current) {
			cdestructuring_bind_error(datum, $list107);
			return NIL;
		}
		if (NIL != system_info.cyc_html_feature()) {
			return list(PROGN, list(DEFVAR, variable, initialization, documentation), list(REGISTER_HTML_STATE_VARIABLE, list(QUOTE, variable)), list(REGISTER_HTML_INTERFACE_VARIABLE, list(QUOTE, variable)));
		}
		return list(DEFVAR, variable, initialization, documentation);
	}

	public static SubLObject def_state_variable(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject variable = NIL;
		SubLObject state_variables = NIL;
		SubLObject initialization = NIL;
		SubLObject documentation = NIL;
		SubLObject type = NIL;
		destructuring_bind_must_consp(current, datum, $list119);
		variable = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list119);
		state_variables = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list119);
		initialization = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list119);
		documentation = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list119);
		type = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject defop = define_operator_for_variable_type(type);
			return list(PROGN, listS(defop, variable, initialization, append(NIL != documentation ? list(documentation) : NIL, NIL)), list(CPUSHNEW, list(QUOTE, variable), state_variables));
		}
		cdestructuring_bind_error(datum, $list119);
		return NIL;
	}

	public static SubLObject note_state_variable_documentation(final SubLObject variable, final SubLObject documentation) {
		put(variable, $VARIABLE_DOC, documentation);
		return variable;
	}

	public static SubLObject define_operator_for_variable_type(final SubLObject variable_type) {
		SubLObject defop = NIL;
		if (variable_type.eql($VARIABLE)) {
			defop = DEFVAR;
		} else if (variable_type.eql($PARAMETER)) {
			defop = DEFPARAMETER;
		} else if (variable_type.eql($GLOBAL)) {
			defop = DEFGLOBAL;
		} else if (variable_type.eql($LEXICAL)) {
			defop = DEFLEXICAL;
		} else if (variable_type.eql($CONSTANT)) {
			defop = DEFCONSTANT;
		} else if (variable_type.eql($PARAMETER_PRIVATE)) {
			defop = DEFPARAMETER_PRIVATE;
		} else if (variable_type.eql($PARAMETER_PUBLIC)) {
			defop = DEFPARAMETER_PUBLIC;
		} else if (variable_type.eql($PARAMETER_PROTECTECD)) {
			defop = DEFPARAMETER_PUBLIC;
		} else {
			Errors.error($str135$unknown_variable_type__s__, variable_type);
		}

		return defop;
	}

	public static SubLObject documentation(final SubLObject symbol, SubLObject type) {
		if (type == UNPROVIDED) {
			type = $VARIABLE;
		}
		final SubLObject pcase_var = type;
		if (pcase_var.eql($VARIABLE)) {
			return get(symbol, $VARIABLE_DOC, UNPROVIDED);
		}
		if (pcase_var.eql($FUNCTION)) {
			return get(symbol, $FUNCTION_DOC, UNPROVIDED);
		}
		if (pcase_var.eql($STRUCTURE)) {
			return get(symbol, $STRUCTURE_DOC, UNPROVIDED);
		}
		if (pcase_var.eql($TYPE)) {
			return get(symbol, $TYPE_DOC, UNPROVIDED);
		}
		return NIL;
	}

	public static SubLObject defvar_gt(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject variable = NIL;
		destructuring_bind_must_consp(current, datum, $list143);
		variable = current.first();
		current = current.rest();
		final SubLObject initialization = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, datum, $list143);
		current = current.rest();
		final SubLObject documentation = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, datum, $list143);
		current = current.rest();
		final SubLObject type = (current.isCons()) ? current.first() : $PARAMETER;
		destructuring_bind_must_listp(current, datum, $list143);
		current = current.rest();
		if (NIL == current) {
			return list(DEF_STATE_VARIABLE, variable, $gt_state_variables$, initialization, documentation, type);
		}
		cdestructuring_bind_error(datum, $list143);
		return NIL;
	}

	public static SubLObject defvar_at(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject variable = NIL;
		destructuring_bind_must_consp(current, datum, $list143);
		variable = current.first();
		current = current.rest();
		final SubLObject initialization = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, datum, $list143);
		current = current.rest();
		final SubLObject documentation = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, datum, $list143);
		current = current.rest();
		final SubLObject type = (current.isCons()) ? current.first() : $PARAMETER;
		destructuring_bind_must_listp(current, datum, $list143);
		current = current.rest();
		if (NIL == current) {
			return list(DEF_STATE_VARIABLE, variable, $at_state_variables$, initialization, documentation, type);
		}
		cdestructuring_bind_error(datum, $list143);
		return NIL;
	}

	public static SubLObject defvar_defn(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject variable = NIL;
		destructuring_bind_must_consp(current, datum, $list143);
		variable = current.first();
		current = current.rest();
		final SubLObject initialization = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, datum, $list143);
		current = current.rest();
		final SubLObject documentation = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, datum, $list143);
		current = current.rest();
		final SubLObject type = (current.isCons()) ? current.first() : $PARAMETER;
		destructuring_bind_must_listp(current, datum, $list143);
		current = current.rest();
		if (NIL == current) {
			return list(DEF_STATE_VARIABLE, variable, $defn_state_variables$, initialization, documentation, type);
		}
		cdestructuring_bind_error(datum, $list143);
		return NIL;
	}

	public static SubLObject defvar_kbi(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject variable = NIL;
		destructuring_bind_must_consp(current, datum, $list146);
		variable = current.first();
		current = current.rest();
		final SubLObject initialization = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, datum, $list146);
		current = current.rest();
		final SubLObject documentation = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, datum, $list146);
		current = current.rest();
		final SubLObject type = (current.isCons()) ? current.first() : $PARAMETER_PROTECTECD;
		destructuring_bind_must_listp(current, datum, $list146);
		current = current.rest();
		if (NIL == current) {
			return list(DEF_STATE_VARIABLE, variable, $kbi_state_variables$, initialization, documentation, type);
		}
		cdestructuring_bind_error(datum, $list146);
		return NIL;
	}

	public static SubLObject defvar_kbp(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject variable = NIL;
		destructuring_bind_must_consp(current, datum, $list143);
		variable = current.first();
		current = current.rest();
		final SubLObject initialization = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, datum, $list143);
		current = current.rest();
		final SubLObject documentation = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, datum, $list143);
		current = current.rest();
		final SubLObject type = (current.isCons()) ? current.first() : $PARAMETER;
		destructuring_bind_must_listp(current, datum, $list143);
		current = current.rest();
		if (NIL == current) {
			return list(DEF_STATE_VARIABLE, variable, $kbp_state_variables$, initialization, documentation, type);
		}
		cdestructuring_bind_error(datum, $list143);
		return NIL;
	}

	public static SubLObject with_kbp_defaults(final SubLObject macroform, final SubLObject environment) {
		final SubLObject datum = macroform.rest();
		final SubLObject body;
		final SubLObject current = body = datum;
		return listS(CLET, $list149, append(body, NIL));
	}

	public static SubLObject progn_cyc_api(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list150);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject machine = NIL;
		SubLObject port = NIL;
		destructuring_bind_must_consp(current, datum, $list150);
		machine = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list150);
		port = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			return list(CYC_API_REMOTE_EVAL, list(QUOTE, bq_cons(PROGN, append(body, NIL))), machine, port);
		}
		cdestructuring_bind_error(datum, $list150);
		return NIL;
	}

	public static SubLObject with_forward_inference_environment(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list152);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject environment_$5 = NIL;
		destructuring_bind_must_consp(current, datum, $list152);
		environment_$5 = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			return list(PROGN, listS(CHECK_TYPE, environment_$5, $list154), listS(CLET, list(list($forward_inference_environment$, environment_$5)), append(body, NIL)));
		}
		cdestructuring_bind_error(datum, $list152);
		return NIL;
	}

	public static SubLObject with_clean_forward_inference_environment(final SubLObject macroform, final SubLObject environment) {
		final SubLObject datum = macroform.rest();
		final SubLObject body;
		final SubLObject current = body = datum;
		final SubLObject environment_$6 = $sym156$ENVIRONMENT;
		return list(CLET, list(bq_cons(environment_$6, $list157)), listS(WITH_FORWARD_INFERENCE_ENVIRONMENT, list(environment_$6), append(body, NIL)));
	}

	public static SubLObject with_possibly_clean_forward_inference_environment(final SubLObject macroform, final SubLObject environment) {
		final SubLObject datum = macroform.rest();
		final SubLObject body;
		final SubLObject current = body = datum;
		final SubLObject environment_$7 = $sym159$ENVIRONMENT;
		return list(CLET, list(bq_cons(environment_$7, $list160)), listS(WITH_FORWARD_INFERENCE_ENVIRONMENT, list(environment_$7), append(body, NIL)));
	}

	public static SubLObject possibly_get_forward_inference_environment() {
		final SubLObject existing_environment = forward.current_forward_inference_environment();
		return NIL != misc_utilities.initialized_p(existing_environment) ? existing_environment : forward.get_forward_inference_environment();
	}

	public static SubLObject with_clean_forward_problem_store_environment(final SubLObject macroform, final SubLObject environment) {
		final SubLObject datum = macroform.rest();
		final SubLObject body;
		final SubLObject current = body = datum;
		return list(CLET, $list163, listS(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), $list165));
	}

	public static SubLObject with_normal_forward_inference_parameters(final SubLObject macroform, final SubLObject environment) {
		final SubLObject datum = macroform.rest();
		final SubLObject body;
		final SubLObject current = body = datum;
		return listS(CLET, $list166, append(body, NIL));
	}

	public static SubLObject with_normal_forward_inference(final SubLObject macroform, final SubLObject environment) {
		final SubLObject datum = macroform.rest();
		final SubLObject body;
		final SubLObject current = body = datum;
		return list(WITH_NORMAL_FORWARD_INFERENCE_PARAMETERS, list(WITH_CLEAN_FORWARD_INFERENCE_ENVIRONMENT, bq_cons(WITH_CLEAN_FORWARD_PROBLEM_STORE_ENVIRONMENT, append(body, NIL))));
	}

	public static SubLObject within_normal_forward_inferenceP() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return makeBoolean(((NIL != kb_control_vars.within_forward_inferenceP()) && (NIL == kb_control_vars.$within_assertion_forward_propagationP$.getDynamicValue(thread))) && (NIL == $prefer_forward_skolemization$.getDynamicValue(thread)));
	}

	public static SubLObject throw_unevaluatable_on_error(final SubLObject macroform, final SubLObject environment) {
		final SubLObject datum = macroform.rest();
		final SubLObject body;
		final SubLObject current = body = datum;
		final SubLObject error = $sym170$ERROR;
		return list(CLET, list(error), listS(CATCH_ERROR_MESSAGE, list(error), append(body, NIL)), listS(PWHEN, error, $list172));
	}

	public static SubLObject tracing_at_level(final SubLObject tracee, final SubLObject level) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject set_level = assoc(tracee, $tracing_level$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest();
		return makeBoolean(((level.isNumber() && set_level.isNumber()) && set_level.isPositive()) && set_level.numGE(level));
	}

	public static SubLObject if_tracing(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list173);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject tracee = NIL;
		SubLObject level = NIL;
		destructuring_bind_must_consp(current, datum, $list173);
		tracee = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list173);
		level = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			return listS(PWHEN, list(TRACING_AT_LEVEL, tracee, level), append(body, NIL));
		}
		cdestructuring_bind_error(datum, $list173);
		return NIL;
	}

	public static SubLObject with_static_structure_resourcing(final SubLObject macroform, final SubLObject environment) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject resourceP = NIL;
		destructuring_bind_must_consp(current, datum, $list175);
		resourceP = current.first();
		final SubLObject body;
		current = body = current.rest();
		if (NIL != find($SL2JAVA, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
			return bq_cons(PROGN, append(body, NIL));
		}
		return listS(CLET, list(list($structure_resourcing_make_static$, resourceP)), append(body, NIL));
	}

	public static SubLObject possibly_with_static_structure_resourcing(final SubLObject macroform, final SubLObject environment) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject datum = macroform.rest();
		final SubLObject body;
		final SubLObject current = body = datum;
		if (NIL != find($SL2JAVA, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
			return bq_cons(PROGN, append(body, NIL));
		}
		return list(PIF, $structure_resourcing_make_static$, bq_cons(WITH_STATIC_AREA, append(body, NIL)), bq_cons(PROGN, append(body, NIL)));
	}

	public static SubLObject define_structure_resource(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject structure = NIL;
		SubLObject link_slot = NIL;
		SubLObject mark_slot = NIL;
		destructuring_bind_must_consp(current, datum, $list179);
		structure = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list179);
		link_slot = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list179);
		mark_slot = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list179);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject v_object = NIL;
		destructuring_bind_must_consp(current, datum, $list179);
		v_object = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			final SubLObject struct_name = symbol_name(structure);
			final SubLObject free_var = intern(format(NIL, $str180$__A_FREE_LIST_, struct_name), UNPROVIDED);
			final SubLObject free_var_doc = format(NIL, $str181$Free_list_for__A_objects, struct_name);
			final SubLObject lock_var = intern(format(NIL, $str182$__A_FREE_LOCK_, struct_name), UNPROVIDED);
			final SubLObject lock_var_doc = format(NIL, $str183$Lock_for__A_object_free_list, struct_name);
			final SubLObject lock_name = format(NIL, $str184$_A_resource_lock, struct_name);
			final SubLObject make_static_func = intern(format(NIL, $str185$MAKE_STATIC__A, struct_name), UNPROVIDED);
			final SubLObject make_static_func_doc = format(NIL, $str186$Make_a_new__A_in_the_static_area, struct_name);
			final SubLObject init_func = intern(format(NIL, $str187$INIT__A, struct_name), UNPROVIDED);
			final SubLObject init_func_doc = format(NIL, $str188$Initialize_a__A_for_use, struct_name);
			final SubLObject get_func = intern(format(NIL, $str189$GET__A, struct_name), UNPROVIDED);
			final SubLObject get_func_doc = format(NIL, $str190$Get_a__A_from_the_free_list__or_m, struct_name);
			final SubLObject free_pred = intern(format(NIL, $str191$FREE__A_P, struct_name), UNPROVIDED);
			final SubLObject free_pred_doc = format(NIL, $str192$Check_if_OBJECT_is_a__A_that_has_, struct_name);
			final SubLObject free_func = intern(format(NIL, $str193$FREE__A, struct_name), UNPROVIDED);
			final SubLObject free_func_doc = format(NIL, $str194$Place_a__A_onto_the_free_list, struct_name);
			final SubLObject make_func = intern(format(NIL, $str195$MAKE__A, struct_name), UNPROVIDED);
			final SubLObject test_func = intern(format(NIL, $str196$_A_P, struct_name), UNPROVIDED);
			return list(PROGN, list(DEFLEXICAL_PRIVATE, free_var, NIL, free_var_doc), list(DEFLEXICAL_PRIVATE, lock_var, list(MAKE_LOCK, lock_name), lock_var_doc), list(DEFINE_PRIVATE, make_static_func, NIL, make_static_func_doc, listS(CLET, $list52, list(WITH_STATIC_AREA, list(CSETQ, OBJECT, list(make_func))), $list199)), listS(DEFINE_PRIVATE, init_func, list(v_object), init_func_doc, append(body, NIL)),
					list(DEFINE, free_pred, $list52, free_pred_doc, list(RET, list(CAND, bq_cons(test_func, $list52), listS(EQ, bq_cons(mark_slot, $list52), $list201)))),
					listS(DEFINE,
							new SubLObject[] { free_func, $list52, free_func_doc, list(CHECK_TYPE, OBJECT, test_func),
									listS(PUNLESS, bq_cons(free_pred, $list52), list(CSETQ, OBJECT, bq_cons(init_func, $list52)), listS(CSETF, bq_cons(mark_slot, $list52), $list201), list(PWHEN, $structure_resourcing_enabled$, list(WITH_LOCK_HELD, list(lock_var), list(CSETF, bq_cons(link_slot, $list52), free_var), listS(CSETQ, free_var, $list52))), $list205), $list206 }),
					list(DEFINE, get_func, NIL, get_func_doc, list(PUNLESS, $structure_resourcing_enabled$, list(PIF, $structure_resourcing_make_static$, list(RET, list(init_func, list(make_static_func))), list(RET, list(init_func, list(make_func))))),
							list(CLET, $list207, list(WITH_LOCK_HELD, list(lock_var), list(CSETQ, OBJECT, free_var), list(CDO, NIL, $list209, list(PIF, bq_cons(free_pred, $list52), listS(PROGN, list(CSETQ, free_var, bq_cons(link_slot, $list52)), $list210), list(CSETQ, OBJECT, bq_cons(link_slot, $list52)))),
									list(PUNLESS, FOUND, list(PIF, $structure_resourcing_make_static$, list(CSETQ, OBJECT, list(make_static_func)), list(CSETQ, OBJECT, list(make_func))), listS(CSETQ, free_var, $list212))), list(RET, bq_cons(init_func, $list52)))));
		}
		cdestructuring_bind_error(datum, $list179);
		return NIL;
	}

	public static SubLObject with_readtime_eval_disabled(final SubLObject macroform, final SubLObject environment) {
		final SubLObject datum = macroform.rest();
		final SubLObject body;
		final SubLObject current = body = datum;
		return listS(CLET, $list213, append(body, NIL));
	}

	public static SubLObject noting_progress(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject string = NIL;
		destructuring_bind_must_consp(current, datum, $list214);
		string = current.first();
		final SubLObject body;
		current = body = current.rest();
		final SubLObject str = $sym215$STR;
		return listS(CLET, list(new SubLObject[] { list(str, string), $list216, $list217, $list218, $list219, $list220, $list221, $list222, list($sym223$_SILENT_PROGRESS__, listS(FIF, str, $list225)) }), list(NOTING_PROGRESS_PREAMBLE, str), append(body, $list227));
	}

	public static SubLObject noting_progress_delayed(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject delayed_mode_seconds = NIL;
		SubLObject string = NIL;
		destructuring_bind_must_consp(current, datum, $list228);
		delayed_mode_seconds = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list228);
		string = current.first();
		final SubLObject body;
		current = body = current.rest();
		return list(CLET, list(list($noting_progress_delayed_mode_seconds$, delayed_mode_seconds), list($noting_progress_delayed_mode_string$, string)), listS(NOTING_PROGRESS, string, append(body, NIL)));
	}

	public static SubLObject noting_progress_preamble(final SubLObject string) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if ((NIL == $silent_progressP$.getDynamicValue(thread)) && (NIL == $noting_progress_delayed_mode_seconds$.getDynamicValue(thread))) {
			if (NIL != $professional_progress_modeP$.getDynamicValue(thread)) {
				format(StreamsLow.$standard_output$.getDynamicValue(thread), $str232$___A, Strings.string_trim($list233, string));
			} else {
				format(StreamsLow.$standard_output$.getDynamicValue(thread), $str234$___A____, Strings.string_trim($list233, string));
			}
			force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
		}
		return NIL;
	}

	public static SubLObject noting_progress_postamble() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL == $silent_progressP$.getDynamicValue(thread)) {
			final SubLObject elapsed = subl_promotions.elapsed_universal_time($progress_start_time$.getDynamicValue(thread), UNPROVIDED);
			if (NIL != $noting_progress_delayed_mode_seconds$.getDynamicValue(thread)) {
				if (!subl_promotions.elapsed_universal_time($progress_last_pacification_time$.getDynamicValue(thread), UNPROVIDED).numGE($noting_progress_delayed_mode_seconds$.getDynamicValue(thread))) {
					return NIL;
				}
				$noting_progress_delayed_mode_seconds$.setDynamicValue(NIL, thread);
				noting_progress_preamble($noting_progress_delayed_mode_string$.getDynamicValue(thread));
			}
			if (NIL != $professional_progress_modeP$.getDynamicValue(thread)) {
				write_string($str236$__, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
			} else {
				write_string($str237$_DONE__, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
			}
			write_string(numeric_date_utilities.elapsed_time_abbreviation_string(elapsed), StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
			if (elapsed.numG($int$600)) {
				format(StreamsLow.$standard_output$.getDynamicValue(thread), $str239$__ended__A, numeric_date_utilities.time_abbreviation_string(UNPROVIDED));
			}
			write_string($str240$_, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
			terpri(StreamsLow.$standard_output$.getDynamicValue(thread));
			force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
		}
		return NIL;
	}

	public static SubLObject note_progress() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if ((NIL != $is_noting_progressP$.getDynamicValue(thread)) && (NIL == $silent_progressP$.getDynamicValue(thread))) {
			$progress_count$.setDynamicValue(add($progress_count$.getDynamicValue(thread), ONE_INTEGER), thread);
			final SubLObject elapsed = subl_promotions.elapsed_universal_time($progress_last_pacification_time$.getDynamicValue(thread), UNPROVIDED);
			if ((!elapsed.numLE($progress_elapsed_seconds_for_notification$.getDynamicValue(thread))) && (((!$noting_progress_delayed_mode_seconds$.getDynamicValue(thread).isNumber()) || (!elapsed.numLE($noting_progress_delayed_mode_seconds$.getDynamicValue(thread)))) || (NIL != $silent_progressP$.getDynamicValue(thread)))) {
				if (NIL != $noting_progress_delayed_mode_seconds$.getDynamicValue(thread)) {
					$noting_progress_delayed_mode_seconds$.setDynamicValue(NIL, thread);
					noting_progress_preamble($noting_progress_delayed_mode_string$.getDynamicValue(thread));
				}
				$progress_notification_count$.setDynamicValue(add($progress_notification_count$.getDynamicValue(thread), ONE_INTEGER), thread);
				if ($int$50.eql($progress_notification_count$.getDynamicValue(thread))) {
					$progress_elapsed_seconds_for_notification$.setDynamicValue(FIVE_INTEGER, thread);
				} else if ($int$100.eql($progress_notification_count$.getDynamicValue(thread))) {
					$progress_elapsed_seconds_for_notification$.setDynamicValue(FIFTEEN_INTEGER, thread);
				} else if ($int$200.eql($progress_notification_count$.getDynamicValue(thread))) {
					$progress_elapsed_seconds_for_notification$.setDynamicValue($int$30, thread);
				}

				$progress_pacifications_since_last_nl$.setDynamicValue(add($progress_pacifications_since_last_nl$.getDynamicValue(thread), ONE_INTEGER), thread);
				if ($progress_pacifications_since_last_nl$.getDynamicValue(thread).numG($int$25)) {
					$progress_pacifications_since_last_nl$.setDynamicValue(ZERO_INTEGER, thread);
					format(StreamsLow.$standard_output$.getDynamicValue(thread), $str246$__A_, $progress_count$.getDynamicValue(thread));
					terpri(StreamsLow.$standard_output$.getDynamicValue(thread));
				} else {
					format(StreamsLow.$standard_output$.getDynamicValue(thread), $str247$_);
				}
				force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
				$progress_last_pacification_time$.setDynamicValue(get_universal_time(), thread);
			}
		}
		return NIL;
	}

	public static SubLObject noting_activity(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject string = NIL;
		destructuring_bind_must_consp(current, datum, $list214);
		string = current.first();
		final SubLObject body;
		current = body = current.rest();
		return listS(PROGN, list(IGNORE, string), append(body, NIL));
	}

	public static SubLObject noting_percent_progress(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject string = NIL;
		destructuring_bind_must_consp(current, datum, $list214);
		string = current.first();
		final SubLObject body;
		current = body = current.rest();
		return list(CLET, $list249, listS(CUNWIND_PROTECT, listS(PROGN, list(NOTING_PERCENT_PROGRESS_PREAMBLE, string), append(body, NIL)), $list251));
	}

	public static SubLObject noting_percent_progress_delayed(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject delayed_mode_seconds = NIL;
		SubLObject string = NIL;
		destructuring_bind_must_consp(current, datum, $list228);
		delayed_mode_seconds = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list228);
		string = current.first();
		final SubLObject body;
		current = body = current.rest();
		return list(CLET, list(list($percent_progress_delayed_mode_seconds$, delayed_mode_seconds), list($percent_progress_delayed_mode_string$, string)), listS(NOTING_PERCENT_PROGRESS, string, append(body, NIL)));
	}

	public static SubLObject noting_percent_progress_preamble(final SubLObject string) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if ((NIL == $silent_progressP$.getDynamicValue(thread)) && (NIL == $percent_progress_delayed_mode_seconds$.getDynamicValue(thread))) {
			format(StreamsLow.$standard_output$.getDynamicValue(thread), $str232$___A, Strings.string_trim($list233, string));
			force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
		}
		return NIL;
	}

	public static SubLObject noting_percent_progress_postamble() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if ((NIL == $silent_progressP$.getDynamicValue(thread)) && (NIL == $percent_progress_delayed_mode_seconds$.getDynamicValue(thread))) {
			final SubLObject elapsed = subl_promotions.elapsed_universal_time($percent_progress_start_time$.getDynamicValue(thread), UNPROVIDED);
			if (ZERO_INTEGER.eql($last_percent_progress_index$.getDynamicValue(thread)) && (NIL == $professional_progress_modeP$.getDynamicValue(thread))) {
				write_string($str256$____, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
			}
			if (NIL != $professional_progress_modeP$.getDynamicValue(thread)) {
				write_string($str236$__, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
			} else {
				write_string($str237$_DONE__, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
			}
			write_string(numeric_date_utilities.elapsed_time_abbreviation_string(elapsed), StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
			if (elapsed.numG($int$600)) {
				format(StreamsLow.$standard_output$.getDynamicValue(thread), $str239$__ended__A, numeric_date_utilities.time_abbreviation_string(UNPROVIDED));
			}
			write_string($str240$_, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
			if (!ZERO_INTEGER.eql($last_percent_progress_index$.getDynamicValue(thread))) {
				write_string($str257$__, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
			}
			terpri(StreamsLow.$standard_output$.getDynamicValue(thread));
			force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
		}
		return NIL;
	}

	public static SubLObject note_percent_progress(final SubLObject index, final SubLObject max) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (((NIL == $silent_progressP$.getDynamicValue(thread)) && (NIL != $within_noting_percent_progress$.getDynamicValue(thread))) && (NIL != index)) {
			SubLObject elapsed = NIL;
			if ($percent_progress_delayed_mode_seconds$.getDynamicValue(thread).isNumber()) {
				if (NIL == elapsed) {
					elapsed = subl_promotions.elapsed_universal_time($percent_progress_start_time$.getDynamicValue(thread), UNPROVIDED);
				}
				if (elapsed.numGE($percent_progress_delayed_mode_seconds$.getDynamicValue(thread))) {
					$percent_progress_delayed_mode_seconds$.setDynamicValue(NIL, thread);
					noting_percent_progress_preamble($percent_progress_delayed_mode_string$.getDynamicValue(thread));
				}
			}
			if (!$percent_progress_delayed_mode_seconds$.getDynamicValue(thread).isNumber()) {
				final SubLObject percent = compute_percent_progress(index, max);
				if (percent.numG($last_percent_progress_index$.getDynamicValue(thread))) {
					if (NIL == elapsed) {
						elapsed = subl_promotions.elapsed_universal_time($percent_progress_start_time$.getDynamicValue(thread), UNPROVIDED);
					}
					if (!elapsed.numLE($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread))) {
						if (ZERO_INTEGER.eql($last_percent_progress_index$.getDynamicValue(thread))) {
							if (NIL == $professional_progress_modeP$.getDynamicValue(thread)) {
								terpri(StreamsLow.$standard_output$.getDynamicValue(thread));
							}
							write_string($str259$__, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
							force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
						}
						final SubLObject predicted_total_seconds = truncate(multiply(elapsed, $int$100), percent);
						if ((percent.numE(ONE_INTEGER) || index.numE(ONE_INTEGER)) && predicted_total_seconds.numGE(multiply(FIVE_INTEGER, numeric_date_utilities.$seconds_in_a_minute$.getGlobalValue()))) {
							if (NIL != $professional_progress_modeP$.getDynamicValue(thread)) {
								terpri(StreamsLow.$standard_output$.getDynamicValue(thread));
								write_string($$$__, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
							}
							write_string($str261$01_, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
							possibly_note_percent_progress_prediction(elapsed, predicted_total_seconds, $int$300, $int$600);
						} else if ((percent.numE(TWO_INTEGER) || index.numE(TWO_INTEGER)) && predicted_total_seconds.numGE(multiply(TEN_INTEGER, numeric_date_utilities.$seconds_in_a_minute$.getGlobalValue()))) {
							write_string($str263$02_, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
							possibly_note_percent_progress_prediction(elapsed, predicted_total_seconds, $int$300, $int$600);
						} else if (!predicted_total_seconds.numLE(TWO_INTEGER)) {
							if (max.numL(TEN_INTEGER)) {
								print_progress_percent(percent);
							} else if (!predicted_total_seconds.numLE(FIVE_INTEGER)) {
								if (mod(percent, TEN_INTEGER).numE(ZERO_INTEGER)) {
									print_progress_percent(percent);
									possibly_note_percent_progress_prediction(elapsed, predicted_total_seconds, $int$600, $int$1200);
								} else if (max.numL($int$30)) {
									if (mod(index, ash(max, $int$_2)).numE(ZERO_INTEGER)) {
										print_progress_percent(percent);
									} else {
										write_string($str247$_, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
									}
								} else if (!predicted_total_seconds.numLE(TWENTY_INTEGER)) {
									if (mod(percent, TWO_INTEGER).numE(ZERO_INTEGER)) {
										write_string($str247$_, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
									}
									if ($last_percent_progress_prediction$.getDynamicValue(thread).isNumber()) {
										final SubLObject threshold = add($last_percent_progress_prediction$.getDynamicValue(thread), integerDivide($last_percent_progress_prediction$.getDynamicValue(thread), TEN_INTEGER));
										if (predicted_total_seconds.numG(threshold)) {
											print_progress_percent(percent);
											possibly_note_percent_progress_prediction(elapsed, predicted_total_seconds, threshold, $int$1200);
										}
									}
								}

							}

						}

						force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
						$last_percent_progress_index$.setDynamicValue(percent, thread);
					}
				}
			}
		}
		return NIL;
	}

	public static SubLObject print_progress_percent(final SubLObject percent) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		write_string($$$_, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
		print_2_digit_nonnegative_integer(percent, StreamsLow.$standard_output$.getDynamicValue(thread));
		write_string($str267$_, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
		return NIL;
	}

	public static SubLObject print_2_digit_nonnegative_integer(final SubLObject integer, final SubLObject stream) {
		if (integer.numL(TEN_INTEGER)) {
			write_string($$$0, stream, UNPROVIDED, UNPROVIDED);
		}
		write_string(princ_to_string(integer), stream, UNPROVIDED, UNPROVIDED);
		return integer;
	}

	public static SubLObject possibly_note_percent_progress_prediction(final SubLObject elapsed, final SubLObject predicted_total_seconds, final SubLObject threshhold, SubLObject show_ending_threshold) {
		if (show_ending_threshold == UNPROVIDED) {
			show_ending_threshold = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (predicted_total_seconds.numG(threshhold) && predicted_total_seconds.numG(elapsed)) {
			final SubLObject note_string = cconcatenate($str236$__, new SubLObject[] { format_nil.format_nil_a_no_copy(numeric_date_utilities.elapsed_time_abbreviation_string(elapsed)), $$$_of_, format_nil.$format_nil_tilde$.getGlobalValue(), format_nil.format_nil_a_no_copy(numeric_date_utilities.elapsed_time_abbreviation_string(predicted_total_seconds)) });
			write_string(note_string, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
			if (show_ending_threshold.isInteger() && predicted_total_seconds.numG(show_ending_threshold)) {
				write_string($str270$__ending__, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
				write_string(numeric_date_utilities.time_abbreviation_string(add($percent_progress_start_time$.getDynamicValue(thread), predicted_total_seconds)), StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
			}
			write_string($str240$_, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
			terpri(StreamsLow.$standard_output$.getDynamicValue(thread));
			write_string($$$__, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
			$last_percent_progress_prediction$.setDynamicValue(predicted_total_seconds, thread);
			return T;
		}
		return NIL;
	}

	public static SubLObject compute_percent_progress(SubLObject index, SubLObject max) {
		if (max.numLE(ZERO_INTEGER) || index.numLE(ZERO_INTEGER)) {
			return ZERO_INTEGER;
		}
		if (index.numGE(max)) {
			return $int$100;
		}
		final SubLObject target_length = TEN_INTEGER;
		final SubLObject current_length = integer_length(max);
		final SubLObject scale_factor = subtract(target_length, current_length);
		if (scale_factor.isNegative()) {
			index = ash(index, scale_factor);
			max = ash(max, scale_factor);
		}
		return min($int$99, integerDivide(multiply($int$100, index), max));
	}

	public static SubLObject progress() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject current = get_universal_time();
		format(T, $str273$___A____D_of__D___02D___Done_at__, new SubLObject[] { $progress_note$.getDynamicValue(thread), $progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread), integerDivide(multiply($progress_sofar$.getDynamicValue(thread), $int$100), $progress_total$.getDynamicValue(thread)),
				$progress_sofar$.getDynamicValue(thread).numE(ZERO_INTEGER) ? $$$whenever : numeric_date_utilities.timestring(add($progress_start_time$.getDynamicValue(thread), integerDivide(multiply($progress_total$.getDynamicValue(thread), subtract(current, $progress_start_time$.getDynamicValue(thread))), $progress_sofar$.getDynamicValue(thread)))) });
		return NIL;
	}

	public static SubLObject progress_cdotimes(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list275);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject var = NIL;
		SubLObject total = NIL;
		destructuring_bind_must_consp(current, datum, $list275);
		var = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list275);
		total = current.first();
		current = current.rest();
		final SubLObject message = (current.isCons()) ? current.first() : $$$cdotimes;
		destructuring_bind_must_listp(current, datum, $list275);
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			return list(PROGN, list(CLET, listS(list($progress_note$, message), $list216, list($progress_total$, total), $list279), list(NOTING_PERCENT_PROGRESS, $progress_note$, listS(CDOTIMES, bq_cons(var, $list281), append(body, $list282)))));
		}
		cdestructuring_bind_error(datum, $list275);
		return NIL;
	}

	public static SubLObject progress_csome(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list283);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject var = NIL;
		SubLObject list = NIL;
		destructuring_bind_must_consp(current, datum, $list283);
		var = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list283);
		list = current.first();
		current = current.rest();
		final SubLObject message = (current.isCons()) ? current.first() : $$$cdolist;
		destructuring_bind_must_listp(current, datum, $list283);
		current = current.rest();
		final SubLObject endvar = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, datum, $list283);
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			final SubLObject list_var = $sym285$LIST_VAR;
			return list(CLET, listS(list(list_var, list), list($progress_note$, listS(FIF, message, message, $list286)), $list216, list($progress_total$, list(LENGTH, list_var)), $list279), list(NOTING_PERCENT_PROGRESS, $progress_note$, listS(CSOME, list(var, list_var, endvar), append(body, $list282))));
		}
		cdestructuring_bind_error(datum, $list283);
		return NIL;
	}

	public static SubLObject progress_cdolist(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list290);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject var = NIL;
		SubLObject list = NIL;
		destructuring_bind_must_consp(current, datum, $list290);
		var = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list290);
		list = current.first();
		current = current.rest();
		final SubLObject message = (current.isCons()) ? current.first() : $$$cdolist;
		destructuring_bind_must_listp(current, datum, $list290);
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			return listS(PROGRESS_CSOME, list(var, list, message), append(body, NIL));
		}
		cdestructuring_bind_error(datum, $list290);
		return NIL;
	}

	public static SubLObject possibly_progress_cdolist(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list292);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject var = NIL;
		SubLObject list = NIL;
		destructuring_bind_must_consp(current, datum, $list292);
		var = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list292);
		list = current.first();
		current = current.rest();
		final SubLObject message = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, datum, $list292);
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			final SubLObject message_var = $sym293$MESSAGE_VAR;
			return list(CLET, list(list(message_var, message)), list(PIF, message_var, listS(PROGRESS_CDOLIST, list(var, list, message), append(body, NIL)), listS(CDOLIST, list(var, list), append(body, NIL))));
		}
		cdestructuring_bind_error(datum, $list292);
		return NIL;
	}

	public static SubLObject progress_cdohash(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list295);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject key = NIL;
		SubLObject val = NIL;
		SubLObject table = NIL;
		destructuring_bind_must_consp(current, datum, $list295);
		key = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list295);
		val = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list295);
		table = current.first();
		current = current.rest();
		final SubLObject message = (current.isCons()) ? current.first() : $$$cdohash;
		destructuring_bind_must_listp(current, datum, $list295);
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			final SubLObject table_var = $sym297$TABLE_VAR;
			return list(CLET, listS(list(table_var, table), list($progress_note$, message), $list216, list($progress_total$, list(HASH_TABLE_COUNT, table_var)), $list279), list(NOTING_PERCENT_PROGRESS, $progress_note$, listS(CDOHASH, list(key, val, table_var), append(body, $list282))));
		}
		cdestructuring_bind_error(datum, $list295);
		return NIL;
	}

	public static SubLObject progress_do_set(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list300);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject elem = NIL;
		SubLObject v_set = NIL;
		destructuring_bind_must_consp(current, datum, $list300);
		elem = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list300);
		v_set = current.first();
		current = current.rest();
		final SubLObject message = (current.isCons()) ? current.first() : $str301$do_set;
		destructuring_bind_must_listp(current, datum, $list300);
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			final SubLObject set_var = $sym302$SET_VAR;
			return list(CLET, listS(list(set_var, v_set), list($progress_note$, message), $list216, list($progress_total$, list(SET_SIZE, set_var)), $list279), list(NOTING_PERCENT_PROGRESS, $progress_note$, listS(DO_SET, list(elem, set_var), append(body, $list282))));
		}
		cdestructuring_bind_error(datum, $list300);
		return NIL;
	}

	public static SubLObject noting_elapsed_time(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list305);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject allow_other_keys_p = NIL;
		SubLObject rest = current;
		SubLObject bad = NIL;
		SubLObject current_$8 = NIL;
		while (NIL != rest) {
			destructuring_bind_must_consp(rest, datum, $list305);
			current_$8 = rest.first();
			rest = rest.rest();
			destructuring_bind_must_consp(rest, datum, $list305);
			if (NIL == member(current_$8, $list306, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			}
			if (current_$8 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			}
			rest = rest.rest();
		}
		if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			cdestructuring_bind_error(datum, $list305);
		}
		final SubLObject message_tail = property_list_member($MESSAGE, current);
		final SubLObject message = (NIL != message_tail) ? cadr(message_tail) : NIL;
		final SubLObject body;
		current = body = temp;
		final SubLObject message_var = $sym308$MESSAGE_VAR;
		final SubLObject start_time = $sym309$START_TIME;
		return listS(CLET, list(list(message_var, message), list(start_time, list(NOTING_ELAPSED_TIME_PREAMBLE, message_var))), append(body, list(list(NOTING_ELAPSED_TIME_POSTAMBLE, message_var, start_time))));
	}

	public static SubLObject noting_elapsed_time_preamble(final SubLObject message) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if ((NIL == $silent_progressP$.getDynamicValue(thread)) && (NIL != message)) {
			final SubLObject start_time = get_universal_time();
			format(StreamsLow.$standard_output$.getDynamicValue(thread), $str313$___A_started__at__A, message, numeric_date_utilities.timestring(start_time));
			force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
			return start_time;
		}
		return NIL;
	}

	public static SubLObject noting_elapsed_time_postamble(final SubLObject message, final SubLObject start_time) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if ((NIL == $silent_progressP$.getDynamicValue(thread)) && (NIL != message)) {
			final SubLObject end_time = get_universal_time();
			format(StreamsLow.$standard_output$.getDynamicValue(thread), $str314$___A_finished_at__A_after_A, new SubLObject[] { message, numeric_date_utilities.timestring(end_time), numeric_date_utilities.elapsed_seconds_string(subtract(end_time, start_time)) });
			force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
		}
		return NIL;
	}

	public static SubLObject with_cyc_server_handling(final SubLObject macroform, final SubLObject environment) {
		final SubLObject datum = macroform.rest();
		final SubLObject body;
		final SubLObject current = body = datum;
		return list(WITH_SUBLISP_ERROR_HANDLING, list(CLET, $list316, listS(CUNWIND_PROTECT, list(PROGN, $list317, bq_cons(PROGN, append(body, NIL))), $list318)));
	}

	public static SubLObject with_cyc_io_syntax(final SubLObject macroform, final SubLObject environment) {
		final SubLObject datum = macroform.rest();
		final SubLObject body;
		final SubLObject current = body = datum;
		return with_cyc_io_syntax_internal(body);
	}

	public static SubLObject with_cyc_io_syntax_internal(final SubLObject body) {
		return listS(CLET, $list319, append(body, NIL));
	}

	public static SubLObject with_sublisp_runtime_assumptions(final SubLObject macroform, final SubLObject environment) {
		final SubLObject datum = macroform.rest();
		final SubLObject body;
		final SubLObject current = body = datum;
		return list(WITH_CYC_SERVER_HANDLING, list(WITH_CYC_IO_SYNTAX, listS(CLET, $list322, append(body, NIL))));
	}

	public static SubLObject with_the_cyclist(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list323);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject cyclist = NIL;
		destructuring_bind_must_consp(current, datum, $list323);
		cyclist = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			final SubLObject old_cyclist = $sym324$OLD_CYCLIST;
			return list(CLET, list(bq_cons(old_cyclist, $list325)), list(CUNWIND_PROTECT, listS(PROGN, list(SET_THE_CYCLIST, cyclist), append(body, NIL)), list(SET_THE_CYCLIST, old_cyclist)));
		}
		cdestructuring_bind_error(datum, $list323);
		return NIL;
	}

	public static SubLObject with_different_cyclist(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list323);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject cyclist = NIL;
		destructuring_bind_must_consp(current, datum, $list323);
		cyclist = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			return listS(CLET, $list327, list(SET_THE_CYCLIST, cyclist), append(body, NIL));
		}
		cdestructuring_bind_error(datum, $list323);
		return NIL;
	}

	public static SubLObject do_bindings(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject el_variables = NIL;
		SubLObject v_bindings = NIL;
		destructuring_bind_must_consp(current, datum, $list328);
		el_variables = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list328);
		v_bindings = current.first();
		final SubLObject body;
		current = body = current.rest();
		final SubLObject binding = $sym329$BINDING;
		final SubLObject var_specs = do_bindings_var_specs(el_variables, binding);
		return list(CDOLIST, list(binding, v_bindings), listS(CLET, append(var_specs, NIL), append(body, NIL)));
	}

	public static SubLObject do_bindings_var_specs(final SubLObject el_variables, final SubLObject iteration_var) {
		SubLObject var_specs = NIL;
		SubLObject cdolist_list_var = el_variables;
		SubLObject el_variable = NIL;
		el_variable = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject local_var = NIL;
			SubLObject binding_var = NIL;
			if (el_variable.isCons()) {
				local_var = el_variable.first();
				binding_var = second(el_variable);
			} else {
				local_var = el_variable;
				binding_var = el_variable;
			}
			var_specs = cons(list(local_var, list(SUBLIS, iteration_var, list(QUOTE, binding_var))), var_specs);
			cdolist_list_var = cdolist_list_var.rest();
			el_variable = cdolist_list_var.first();
		}
		return nreverse(var_specs);
	}

	public static SubLObject fast_singleton_macro_p(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject list = NIL;
		destructuring_bind_must_consp(current, datum, $list334);
		list = current.first();
		current = current.rest();
		if (NIL == current) {
			return list(NULL, list(CDR, list));
		}
		cdestructuring_bind_error(datum, $list334);
		return NIL;
	}

	public static SubLObject pluralityP(final SubLObject list) {
		return makeBoolean(list.isCons() && list.rest().isCons());
	}

	public static SubLObject fast_plurality_macro_p(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject list = NIL;
		destructuring_bind_must_consp(current, datum, $list334);
		list = current.first();
		current = current.rest();
		if (NIL == current) {
			return list(CONSP, list(CDR, list));
		}
		cdestructuring_bind_error(datum, $list334);
		return NIL;
	}

	public static SubLObject cdosublists(final SubLObject macroform, final SubLObject environment) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list338);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject var = NIL;
		SubLObject list_expression = NIL;
		destructuring_bind_must_consp(current, datum, $list338);
		var = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list338);
		list_expression = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			if (!var.isSymbol()) {
				Errors.error($util_var_error_format_string$.getDynamicValue(thread), CDOSUBLISTS, var);
			}
			return listS(CDO, list(list(var, list_expression, list(CDR, var))), list(list(NULL, var)), body);
		}
		cdestructuring_bind_error(datum, $list338);
		return NIL;
	}

	public static SubLObject cdolist_and_sublists(final SubLObject macroform, final SubLObject environment) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list340);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject element_var = NIL;
		SubLObject sublist_var = NIL;
		SubLObject list_expression = NIL;
		destructuring_bind_must_consp(current, datum, $list340);
		element_var = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list340);
		sublist_var = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list340);
		list_expression = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			if (!element_var.isSymbol()) {
				Errors.error($util_var_error_format_string$.getDynamicValue(thread), CDOLIST_AND_SUBLISTS, element_var);
			}
			if (!sublist_var.isSymbol()) {
				Errors.error($util_var_error_format_string$.getDynamicValue(thread), CDOLIST_AND_SUBLISTS, sublist_var);
			}
			return listS(CDO, list(list(sublist_var, list_expression, list(CDR, sublist_var)), list(element_var, list(CAR, sublist_var), list(CAR, sublist_var))), list(list(NULL, sublist_var)), body);
		}
		cdestructuring_bind_error(datum, $list340);
		return NIL;
	}

	public static SubLObject cdolist_and_sublists_carefully(final SubLObject macroform, final SubLObject environment) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list340);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject element_var = NIL;
		SubLObject sublist_var = NIL;
		SubLObject list_expression = NIL;
		destructuring_bind_must_consp(current, datum, $list340);
		element_var = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list340);
		sublist_var = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list340);
		list_expression = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			if (!element_var.isSymbol()) {
				Errors.error($util_var_error_format_string$.getDynamicValue(thread), CDOLIST_AND_SUBLISTS, element_var);
			}
			if (!sublist_var.isSymbol()) {
				Errors.error($util_var_error_format_string$.getDynamicValue(thread), CDOLIST_AND_SUBLISTS, sublist_var);
			}
			final SubLObject next_cons_var = make_symbol($str342$next_cons_var);
			return list(CLET, list(next_cons_var), listS(CDO, list(list(sublist_var, list_expression, next_cons_var), list(element_var, list(CAR, sublist_var), list(CAR, sublist_var))), list(list(NULL, sublist_var)), list(CSETQ, next_cons_var, list(CDR, sublist_var)), body));
		}
		cdestructuring_bind_error(datum, $list340);
		return NIL;
	}

	public static SubLObject cdo_possibly_dotted_list(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list343);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject element_var = NIL;
		SubLObject list_expression = NIL;
		destructuring_bind_must_consp(current, datum, $list343);
		element_var = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list343);
		list_expression = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			final SubLObject sublist_var = make_symbol($$$sublist);
			return list(CLET, list(bq_cons(element_var, $list212), list(sublist_var, list_expression)), listS(WHILE, list(CONSP, sublist_var), list(CSETQ, element_var, list(CAR, sublist_var)), append(body, list(list(CSETQ, sublist_var, list(CDR, sublist_var))))));
		}
		cdestructuring_bind_error(datum, $list343);
		return NIL;
	}

	public static SubLObject cdolist_if(final SubLObject macroform, final SubLObject environment) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list346);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject var = NIL;
		SubLObject predicate = NIL;
		SubLObject list_expression = NIL;
		destructuring_bind_must_consp(current, datum, $list346);
		var = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list346);
		predicate = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list346);
		list_expression = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			if (!var.isSymbol()) {
				Errors.error($util_var_error_format_string$.getDynamicValue(thread), CDOLIST_IF, var);
			}
			if (!var.isSymbol()) {
				Errors.error($util_func_error_format_string$.getDynamicValue(thread), CDOLIST_IF, predicate);
			}
			return list(CDOLIST, list(var, list_expression), listS(PWHEN, list(predicate, var), body));
		}
		cdestructuring_bind_error(datum, $list346);
		return NIL;
	}

	public static SubLObject cdosublists_if(final SubLObject macroform, final SubLObject environment) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list346);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject var = NIL;
		SubLObject predicate = NIL;
		SubLObject list_expression = NIL;
		destructuring_bind_must_consp(current, datum, $list346);
		var = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list346);
		predicate = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list346);
		list_expression = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			if (!var.isSymbol()) {
				Errors.error($util_var_error_format_string$.getDynamicValue(thread), CDOSUBLISTS_IF, var);
			}
			if (!var.isSymbol()) {
				Errors.error($util_func_error_format_string$.getDynamicValue(thread), CDOSUBLISTS_IF, predicate);
			}
			return list(CDO, list(list(var, list_expression, list(CDR, var))), list(list(NULL, var)), listS(PWHEN, list(predicate, var), body));
		}
		cdestructuring_bind_error(datum, $list346);
		return NIL;
	}

	public static SubLObject cdolist_if_not(final SubLObject macroform, final SubLObject environment) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list346);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject var = NIL;
		SubLObject predicate = NIL;
		SubLObject list_expression = NIL;
		destructuring_bind_must_consp(current, datum, $list346);
		var = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list346);
		predicate = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list346);
		list_expression = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			if (!var.isSymbol()) {
				Errors.error($util_var_error_format_string$.getDynamicValue(thread), CDOLIST_IF_NOT, var);
			}
			if (!var.isSymbol()) {
				Errors.error($util_func_error_format_string$.getDynamicValue(thread), CDOLIST_IF_NOT, predicate);
			}
			return list(CDOLIST, list(var, list_expression), listS(PUNLESS, list(predicate, var), body));
		}
		cdestructuring_bind_error(datum, $list346);
		return NIL;
	}

	public static SubLObject cdosublists_if_not(final SubLObject macroform, final SubLObject environment) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list346);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject var = NIL;
		SubLObject predicate = NIL;
		SubLObject list_expression = NIL;
		destructuring_bind_must_consp(current, datum, $list346);
		var = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list346);
		predicate = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list346);
		list_expression = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			if (!var.isSymbol()) {
				Errors.error($util_var_error_format_string$.getDynamicValue(thread), CDOSUBLISTS_IF_NOT, var);
			}
			if (!var.isSymbol()) {
				Errors.error($util_func_error_format_string$.getDynamicValue(thread), CDOSUBLISTS_IF_NOT, predicate);
			}
			return list(CDO, list(list(var, list_expression, list(CDR, var))), list(list(NULL, var)), listS(PUNLESS, list(predicate, var), body));
		}
		cdestructuring_bind_error(datum, $list346);
		return NIL;
	}

	public static SubLObject cdo2lists(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list351);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject var1 = NIL;
		SubLObject list1 = NIL;
		SubLObject var2 = NIL;
		SubLObject list2 = NIL;
		destructuring_bind_must_consp(current, datum, $list351);
		var1 = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list351);
		list1 = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list351);
		var2 = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list351);
		list2 = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			final SubLObject sublist1_var = make_symbol($$$sublist1);
			final SubLObject sublist2_var = make_symbol($$$sublist2);
			return list(CLET, list(list(sublist1_var, list1), list(sublist2_var, list2), var1, var2), listS(WHILE, list(CAND, sublist1_var, sublist2_var), list(CSETQ, var1, list(CAR, sublist1_var), var2, list(CAR, sublist2_var)), append(body, list(list(CSETQ, sublist1_var, list(CDR, sublist1_var), sublist2_var, list(CDR, sublist2_var))))));
		}
		cdestructuring_bind_error(datum, $list351);
		return NIL;
	}

	public static SubLObject cdotree(final SubLObject macroform, final SubLObject environment) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list354);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject var = NIL;
		SubLObject tree = NIL;
		destructuring_bind_must_consp(current, datum, $list354);
		var = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list354);
		tree = current.first();
		current = current.rest();
		final SubLObject search_type = (current.isCons()) ? current.first() : $DEPTH_FIRST;
		destructuring_bind_must_listp(current, datum, $list354);
		current = current.rest();
		final SubLObject visit_nils = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, datum, $list354);
		current = current.rest();
		if (NIL != current) {
			cdestructuring_bind_error(datum, $list354);
			return NIL;
		}
		final SubLObject body;
		current = body = temp;
		if (!var.isSymbol()) {
			Errors.error($util_var_error_format_string$.getDynamicValue(thread), CDOTREE, var);
		}
		if ((search_type != $DEPTH_FIRST) && (search_type != $BREADTH_FIRST)) {
			Errors.error($util_search_type_error_format_string$.getDynamicValue(thread), CDOTREE, search_type);
		}
		final SubLObject tree_var = make_symbol($str358$tree_var);
		final SubLObject cells_var = make_symbol($str359$cells_var);
		if (search_type == $BREADTH_FIRST) {
			final SubLObject tail_of_cells_var = make_symbol($str360$tail_of_cells);
			return list(CLET, list(list(tree_var, tree)), list(PWHEN, tree_var, list(CLET, list(list(cells_var, list(LIST, tree_var)), list(tail_of_cells_var, list(LAST, cells_var))),
					list(CDO, list(list(var, list(CAR, cells_var), list(CAR, cells_var))), list(list(NULL, cells_var)), list(PIF, list(CONSP, var), list(PROGN, list(RPLACD, tail_of_cells_var, list(LIST, list(CAR, var), list(CDR, var))), list(CSETQ, tail_of_cells_var, list(LAST, tail_of_cells_var))), NIL != visit_nils ? bq_cons(PROGN, body) : listS(PWHEN, var, body)), list(CSETQ, cells_var, list(CDR, cells_var))))));
		}
		return list(CLET, list(list(tree_var, tree)), list(PWHEN, tree_var,
				list(CLET, list(list(cells_var, list(LIST, tree_var))), list(CDO, list(list(var, list(CAR, cells_var), list(CAR, cells_var))), list(list(NULL, cells_var)), list(CSETQ, cells_var, list(CDR, cells_var)), list(PIF, list(CONSP, var), list(PROGN, list(CPUSH, list(CDR, var), cells_var), list(CPUSH, list(CAR, var), cells_var)), NIL != visit_nils ? bq_cons(PROGN, body) : listS(PWHEN, var, body))))));
	}

	public static SubLObject cdotree_conses(final SubLObject macroform, final SubLObject environment) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list365);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject var = NIL;
		SubLObject tree = NIL;
		destructuring_bind_must_consp(current, datum, $list365);
		var = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list365);
		tree = current.first();
		current = current.rest();
		final SubLObject search_type = (current.isCons()) ? current.first() : $DEPTH_FIRST;
		destructuring_bind_must_listp(current, datum, $list365);
		current = current.rest();
		if (NIL != current) {
			cdestructuring_bind_error(datum, $list365);
			return NIL;
		}
		final SubLObject body;
		current = body = temp;
		if (!var.isSymbol()) {
			Errors.error($util_var_error_format_string$.getDynamicValue(thread), CDOTREE_CONSES, var);
		}
		if ((search_type != $DEPTH_FIRST) && (search_type != $BREADTH_FIRST)) {
			Errors.error($util_search_type_error_format_string$.getDynamicValue(thread), CDOTREE_CONSES, search_type);
		}
		final SubLObject tree_var = make_symbol($str358$tree_var);
		final SubLObject cells_var = make_symbol($str359$cells_var);
		if (search_type == $BREADTH_FIRST) {
			final SubLObject tail_of_cells_var = make_symbol($str367$tail_of_cells_var);
			return list(CLET, list(list(tree_var, tree)), list(PWHEN, tree_var, list(CLET, list(list(cells_var, list(LIST, tree_var)), list(tail_of_cells_var, list(LAST, cells_var))),
					list(CDO, list(list(var, list(CAR, cells_var), list(CAR, cells_var))), list(list(NULL, cells_var)), listS(PWHEN, list(CONSP, var), list(RPLACD, tail_of_cells_var, list(LIST, list(CAR, var), list(CDR, var))), list(CSETQ, tail_of_cells_var, list(LAST, tail_of_cells_var)), body), list(CSETQ, cells_var, list(CDR, cells_var))))));
		}
		return list(CLET, list(list(tree_var, tree)), list(PWHEN, tree_var, list(CLET, list(list(cells_var, list(LIST, tree_var))), list(CDO, list(list(var, list(CAR, cells_var), list(CAR, cells_var))), list(list(NULL, cells_var)), list(CSETQ, cells_var, list(CDR, cells_var)), listS(PWHEN, list(CONSP, var), list(CPUSH, list(CDR, var), cells_var), list(CPUSH, list(CAR, var), cells_var), body)))));
	}

	public static SubLObject cdoplist(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list368);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject parameter = NIL;
		SubLObject value = NIL;
		SubLObject plist = NIL;
		destructuring_bind_must_consp(current, datum, $list368);
		parameter = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list368);
		value = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list368);
		plist = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			return listS(DO_PLIST, list(parameter, value, plist), append(body, NIL));
		}
		cdestructuring_bind_error(datum, $list368);
		return NIL;
	}

	public static SubLObject compositize_function_call(final SubLObject path, final SubLObject var, SubLObject cars_and_cdrs_only) {
		if (cars_and_cdrs_only == UNPROVIDED) {
			cars_and_cdrs_only = NIL;
		}
		SubLObject result = var;
		SubLObject cdolist_list_var = (NIL != cars_and_cdrs_only) ? simplify_car_and_cdr_path(reverse(path)) : reverse(path);
		SubLObject function_symbol = NIL;
		function_symbol = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			result = list(function_symbol, result);
			cdolist_list_var = cdolist_list_var.rest();
			function_symbol = cdolist_list_var.first();
		}
		return result;
	}

	public static SubLObject simplify_car_and_cdr_path(final SubLObject path) {
		if (NIL == path) {
			return NIL;
		}
		if (NIL == path.rest()) {
			return cons(path.first(), NIL);
		}
		final SubLObject first_op = path.first();
		final SubLObject second_op = cadr(path);
		final SubLObject pcase_var = first_op;
		if (pcase_var.eql(CAR)) {
			final SubLObject pcase_var_$9 = second_op;
			if (pcase_var_$9.eql(CAR)) {
				return cons(CAAR, simplify_car_and_cdr_path(cddr(path)));
			}
			if (pcase_var_$9.eql(CDR)) {
				return cons(CDAR, simplify_car_and_cdr_path(cddr(path)));
			}
			return listS(first_op, second_op, simplify_car_and_cdr_path(cddr(path)));
		} else {
			if (!pcase_var.eql(CDR)) {
				return listS(first_op, second_op, simplify_car_and_cdr_path(cddr(path)));
			}
			final SubLObject pcase_var_$10 = second_op;
			if (pcase_var_$10.eql(CAR)) {
				return cons(CADR, simplify_car_and_cdr_path(cddr(path)));
			}
			if (pcase_var_$10.eql(CDR)) {
				return cons(CDDR, simplify_car_and_cdr_path(cddr(path)));
			}
			return listS(first_op, second_op, simplify_car_and_cdr_path(cddr(path)));
		}
	}

	public static SubLObject map_symbols_to_accessors(final SubLObject tree, final SubLObject var, final SubLObject path) {
		if (NIL == tree) {
			return NIL;
		}
		if (tree.isSymbol()) {
			return list(NIL == path ? list(tree, var) : list(tree, compositize_function_call(path, var, T)));
		}
		if (tree.isCons()) {
			return nconc(map_symbols_to_accessors(tree.first(), var, cons(CAR, path)), map_symbols_to_accessors(tree.rest(), var, cons(CDR, path)));
		}
		return NIL;
	}

	public static SubLObject cdestructuring_setq(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject pattern = NIL;
		SubLObject datum_$11 = NIL;
		destructuring_bind_must_consp(current, datum, $list374);
		pattern = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list374);
		datum_$11 = current.first();
		current = current.rest();
		if (NIL != current) {
			cdestructuring_bind_error(datum, $list374);
			return NIL;
		}
		if (pattern.isCons() || (pattern.isSymbol() && (NIL != pattern))) {
			final SubLObject datum_evaluated_var = make_symbol($str375$datum_evaluated_var);
			return list(CLET, list(list(datum_evaluated_var, datum_$11)), bq_cons(CSETQ, apply(symbol_function(NCONC), map_symbols_to_accessors(pattern, datum_evaluated_var, NIL))));
		}
		return datum_$11;
	}

	public static SubLObject fast_funcall_no_value_check_args(final SubLObject function_form, final SubLObject function_name_list, final SubLObject args) {
		if (function_name_list.isList()) {
			SubLObject sublist = NIL;
			SubLObject element = NIL;
			sublist = function_name_list;
			element = sublist.first();
			while (sublist.isCons()) {
				if (!element.isSymbol()) {
					Errors.error($str377$FAST_FUNCALL_NO_VALUE__contains_e);
				}
				if ((!sublist.rest().isCons()) && (NIL != sublist.rest())) {
					Errors.error($str378$FAST_FUNCALL_NO_VALUE__cannot_acc);
				}
				sublist = sublist.rest();
				element = sublist.first();
			}
		} else {
			Errors.error($str379$FAST_FUNCALL_NO_VALUE__function_n);
		}
		return NIL;
	}

	public static SubLObject fast_funcall_no_value(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject function_form = NIL;
		SubLObject function_name_list = NIL;
		destructuring_bind_must_consp(current, datum, $list380);
		function_form = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list380);
		function_name_list = current.first();
		final SubLObject args;
		current = args = current.rest();
		fast_funcall_no_value_check_args(function_form, function_name_list, args);
		if (NIL == function_name_list) {
			return listS(FUNCALL, function_form, args);
		}
		final SubLObject function_form_evaluated_var = (function_form.isSymbol()) ? function_form : make_symbol($str382$function_form_evaluated_var);
		SubLObject case_list = NIL;
		SubLObject cdolist_list_var = function_name_list;
		SubLObject function_name = NIL;
		function_name = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (function_name.isSymbol()) {
				case_list = cons(list(function_name, bq_cons(function_name, copy_tree(args))), case_list);
			}
			cdolist_list_var = cdolist_list_var.rest();
			function_name = cdolist_list_var.first();
		}
		if (NIL == case_list) {
			return listS(FUNCALL, function_form, args);
		}
		final SubLObject body = listS(PCASE, function_form_evaluated_var, nreverse(cons(list(OTHERWISE, listS(FUNCALL, function_form_evaluated_var, copy_tree(args))), case_list)));
		if (function_form.eql(function_form_evaluated_var)) {
			return body;
		}
		return list(CLET, list(list(function_form_evaluated_var, function_form)), body);
	}

	public static SubLObject fast_funcall_setq(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject var_to_set = NIL;
		SubLObject function_form = NIL;
		SubLObject function_name_list = NIL;
		destructuring_bind_must_consp(current, datum, $list385);
		var_to_set = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list385);
		function_form = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list385);
		function_name_list = current.first();
		final SubLObject args;
		current = args = current.rest();
		if (NIL == function_name_list) {
			return list(CSETQ, var_to_set, listS(FUNCALL, function_form, args));
		}
		final SubLObject function_form_evaluated_var = (function_form.isSymbol()) ? function_form : make_symbol($str382$function_form_evaluated_var);
		SubLObject case_list = NIL;
		SubLObject cdolist_list_var = function_name_list;
		SubLObject function_name = NIL;
		function_name = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (function_name.isSymbol()) {
				case_list = cons(list(function_name, list(CSETQ, var_to_set, bq_cons(function_name, copy_tree(args)))), case_list);
			}
			cdolist_list_var = cdolist_list_var.rest();
			function_name = cdolist_list_var.first();
		}
		if (NIL == case_list) {
			return listS(FUNCALL, function_form, args);
		}
		final SubLObject body = listS(PCASE, function_form_evaluated_var, nreverse(cons(list(OTHERWISE, list(CSETQ, var_to_set, listS(FUNCALL, function_form_evaluated_var, copy_tree(args)))), case_list)));
		if (function_form.eql(function_form_evaluated_var)) {
			return body;
		}
		return list(CLET, list(list(function_form_evaluated_var, function_form)), body);
	}

	public static SubLObject generate_parallel_var_list(final SubLObject var_list) {
		SubLObject new_var_list = NIL;
		SubLObject cdolist_list_var = var_list;
		SubLObject var = NIL;
		var = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			new_var_list = cons(make_symbol(symbol_name(var)), new_var_list);
			cdolist_list_var = cdolist_list_var.rest();
			var = cdolist_list_var.first();
		}
		return nreverse(new_var_list);
	}

	public static SubLObject generate_multiple_csetq(final SubLObject new_var_list, final SubLObject old_var_list) {
		SubLObject body_of_setq = NIL;
		SubLObject sub_new_var_list = NIL;
		SubLObject new_var = NIL;
		SubLObject sub_old_var_list = NIL;
		SubLObject old_var = NIL;
		sub_new_var_list = new_var_list;
		new_var = sub_new_var_list.first();
		sub_old_var_list = old_var_list;
		old_var = sub_old_var_list.first();
		while ((NIL != sub_new_var_list) && (NIL != sub_old_var_list)) {
			body_of_setq = cons(new_var, body_of_setq);
			body_of_setq = cons(old_var, body_of_setq);
			sub_new_var_list = sub_new_var_list.rest();
			new_var = sub_new_var_list.first();
			sub_old_var_list = sub_old_var_list.rest();
			old_var = sub_old_var_list.first();
		}
		return NIL != body_of_setq ? cons(CSETQ, nreverse(body_of_setq)) : NIL;
	}

	public static SubLObject fast_funcall_multiple_value_bind(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject vars_to_bind = NIL;
		destructuring_bind_must_consp(current, datum, $list386);
		vars_to_bind = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list386);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject function_form = NIL;
		SubLObject function_name_list = NIL;
		SubLObject args = NIL;
		destructuring_bind_must_consp(current, datum, $list386);
		function_form = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list386);
		function_name_list = current.first();
		current = args = current.rest();
		final SubLObject body;
		current = body = temp;
		if (NIL == function_name_list) {
			return listS(CMULTIPLE_VALUE_BIND, vars_to_bind, listS(FUNCALL, function_form, args), body);
		}
		final SubLObject function_form_evaluated_var = (function_form.isSymbol()) ? function_form : make_symbol($str382$function_form_evaluated_var);
		SubLObject case_list = NIL;
		SubLObject cdolist_list_var = function_name_list;
		SubLObject function_name = NIL;
		function_name = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (function_name.isSymbol()) {
				case_list = cons(list(function_name, listS(CMULTIPLE_VALUE_BIND, vars_to_bind, bq_cons(function_name, copy_tree(args)), body)), case_list);
			}
			cdolist_list_var = cdolist_list_var.rest();
			function_name = cdolist_list_var.first();
		}
		if (NIL == case_list) {
			return listS(FUNCALL, function_form, args);
		}
		final SubLObject v_answer = listS(PCASE, function_form_evaluated_var, nreverse(cons(list(OTHERWISE, listS(CMULTIPLE_VALUE_BIND, vars_to_bind, listS(FUNCALL, function_form_evaluated_var, copy_tree(args)), body)), case_list)));
		if (function_form.eql(function_form_evaluated_var)) {
			return v_answer;
		}
		return list(CLET, list(list(function_form_evaluated_var, function_form)), v_answer);
	}

	public static SubLObject fast_funcall_multiple_value_setq(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject vars_to_set = NIL;
		SubLObject function_form = NIL;
		SubLObject function_name_list = NIL;
		destructuring_bind_must_consp(current, datum, $list388);
		vars_to_set = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list388);
		function_form = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list388);
		function_name_list = current.first();
		final SubLObject args;
		current = args = current.rest();
		if (NIL == function_name_list) {
			return list(CMULTIPLE_VALUE_SETQ, vars_to_set, listS(FUNCALL, function_form, args));
		}
		final SubLObject function_form_evaluated_var = (function_form.isSymbol()) ? function_form : make_symbol($str382$function_form_evaluated_var);
		SubLObject case_list = NIL;
		SubLObject cdolist_list_var = function_name_list;
		SubLObject function_name = NIL;
		function_name = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (function_name.isSymbol()) {
				case_list = cons(list(function_name, list(CMULTIPLE_VALUE_SETQ, vars_to_set, bq_cons(function_name, copy_tree(args)))), case_list);
			}
			cdolist_list_var = cdolist_list_var.rest();
			function_name = cdolist_list_var.first();
		}
		if (NIL == case_list) {
			return listS(FUNCALL, function_form, args);
		}
		final SubLObject body = listS(PCASE, function_form_evaluated_var, nreverse(cons(list(OTHERWISE, list(CMULTIPLE_VALUE_SETQ, vars_to_set, listS(FUNCALL, function_form_evaluated_var, copy_tree(args)))), case_list)));
		if (function_form.eql(function_form_evaluated_var)) {
			return body;
		}
		return list(CLET, list(list(function_form_evaluated_var, function_form)), body);
	}

	public static SubLObject expand_destructuring_predication_generator(final SubLObject predication_structure, final SubLObject operand) {
		if (NIL == predication_structure) {
			return list(NULL, operand);
		}
		if (predication_structure.isSymbol()) {
			return list(predication_structure, operand);
		}
		if (predication_structure.isAtom()) {
			return T;
		}
		return list(CAND, list(CONSP, operand), expand_destructuring_predication_generator(predication_structure.first(), list(CAR, operand)), expand_destructuring_predication_generator(predication_structure.rest(), list(CDR, operand)));
	}

	public static SubLObject funcall_shortcut(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject function = NIL;
		destructuring_bind_must_consp(current, datum, $list390);
		function = current.first();
		final SubLObject args;
		current = args = current.rest();
		if (function.isCons() && (QUOTE == function.first())) {
			return bq_cons(second(function), append(args, NIL));
		}
		return listS(FUNCALL, function, append(args, NIL));
	}

	public static SubLObject destructuring_predication_generator(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject predication_structure = NIL;
		SubLObject operand = NIL;
		destructuring_bind_must_consp(current, datum, $list391);
		predication_structure = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list391);
		operand = current.first();
		current = current.rest();
		if (NIL == current) {
			return expand_destructuring_predication_generator(predication_structure, operand);
		}
		cdestructuring_bind_error(datum, $list391);
		return NIL;
	}

	public static SubLObject symbol_in_tree_p(final SubLObject symbol, final SubLObject tree) {
		if (NIL == tree) {
			return NIL;
		}
		if (tree.isSymbol()) {
			return eq(symbol, tree);
		}
		if (tree.isCons()) {
			return makeBoolean((NIL != symbol_in_tree_p(symbol, tree.first())) || (NIL != symbol_in_tree_p(symbol, tree.rest())));
		}
		return NIL;
	}

	public static SubLObject unquoted_symbol_in_tree_p_UM(final SubLObject symbol, final SubLObject tree) {
		if (NIL == tree) {
			return NIL;
		}
		if (tree.isSymbol()) {
			return eq(symbol, tree);
		}
		if (!tree.isCons()) {
			return NIL;
		}
		if (NIL == member(tree.first(), $list392, UNPROVIDED, UNPROVIDED)) {
			return makeBoolean((NIL != symbol_in_tree_p(symbol, tree.first())) || (NIL != symbol_in_tree_p(symbol, tree.rest())));
		}
		if ((tree.rest().isCons() && cadr(tree).isCons()) && cddr(tree).isList()) {
			SubLObject cdolist_list_var = cddr(tree);
			SubLObject arg = NIL;
			arg = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				if (NIL != unquoted_symbol_in_tree_p(symbol, arg)) {
					return T;
				}
				cdolist_list_var = cdolist_list_var.rest();
				arg = cdolist_list_var.first();
			}
			return NIL;
		}
		return makeBoolean((NIL != symbol_in_tree_p(symbol, tree.first())) || (NIL != symbol_in_tree_p(symbol, tree.rest())));
	}

	public static SubLObject generate_instance_variable_bindings_for_structure_slots(final SubLObject var, final SubLObject structure_expression, final SubLObject conc_name, final SubLObject instance_variables, final SubLObject body, SubLObject read_only) {
		if (read_only == UNPROVIDED) {
			read_only = T;
		}
		SubLObject var_bindings = NIL;
		SubLObject update_expressions = NIL;
		final SubLObject preprocessed_conc_name = (conc_name.isSymbol()) ? symbol_name(conc_name) : conc_name;
		SubLObject variable = NIL;
		SubLObject accessor = NIL;
		SubLObject explicit_getter = NIL;
		SubLObject explicit_setter = NIL;
		SubLObject cdolist_list_var = instance_variables;
		SubLObject instance_variable_form = NIL;
		instance_variable_form = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (instance_variable_form.isCons()) {
				variable = instance_variable_form.first();
				explicit_getter = cadr(instance_variable_form);
				explicit_setter = cddr(instance_variable_form).first();
				accessor = NIL;
			} else {
				variable = instance_variable_form;
				explicit_getter = NIL;
				explicit_setter = NIL;
				accessor = intern(format(NIL, $str393$_A_S, preprocessed_conc_name, variable), UNPROVIDED);
			}
			if (NIL != symbol_in_tree_p(variable, body)) {
				var_bindings = cons(list(variable, list(NIL != explicit_getter ? explicit_getter : accessor, var)), var_bindings);
				if (NIL == read_only) {
					update_expressions = cons(NIL != explicit_setter ? list(explicit_setter, var, variable) : list(CSETF, list(accessor, var), variable), update_expressions);
				}
			}
			cdolist_list_var = cdolist_list_var.rest();
			instance_variable_form = cdolist_list_var.first();
		}
		if (NIL == var_bindings) {
			return bq_cons(PROGN, body);
		}
		if (NIL != read_only) {
			return listS(CLET, bq_cons(list(var, structure_expression), reverse(var_bindings)), body);
		}
		return list(CLET, bq_cons(list(var, structure_expression), reverse(var_bindings)), listS(CUNWIND_PROTECT, bq_cons(PROGN, body), reverse(update_expressions)));
	}

	public static SubLObject cdolist_collecting(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list394);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject var = NIL;
		SubLObject list_expression = NIL;
		SubLObject collection_var = NIL;
		destructuring_bind_must_consp(current, datum, $list394);
		var = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list394);
		list_expression = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list394);
		collection_var = current.first();
		current = current.rest();
		if (NIL == current) {
			current = temp;
			SubLObject iterated_expression = NIL;
			destructuring_bind_must_consp(current, datum, $list394);
			iterated_expression = current.first();
			current = current.rest();
			if (NIL == current) {
				final SubLObject list_expression_var = make_symbol($str395$LIST_EXPRESSION);
				final SubLObject tail_cons_var = make_symbol($str396$TAIL_CONS);
				final SubLObject result_var = make_symbol($$$RESULT);
				return list(CLET, list(list(list_expression_var, list_expression)),
						list(PCOND, list(list(NULL, list_expression_var), listS(CSETQ, collection_var, $list212)), list(list(ATOM, list_expression_var), list(CSETQ, collection_var, list(LIST, list_expression_var))), list(list(NULL, list(CDR, list_expression_var)), list(CLET, list(list(var, list(CAR, list_expression_var))), list(CSETQ, collection_var, list(LIST, iterated_expression)))),
								list(T, list(CLET, list(bq_cons(tail_cons_var, $list212), bq_cons(result_var, $list212)), list(CLET, list(list(var, list(CAR, list_expression_var))), list(CSETQ, collection_var, list(LIST, iterated_expression)), list(CSETQ, tail_cons_var, collection_var)),
										list(CDOLIST, list(var, list(CDR, list_expression_var)), list(CSETQ, result_var, list(LIST, iterated_expression)), list(RPLACD, tail_cons_var, result_var), list(CSETQ, tail_cons_var, result_var))))));
			}
			cdestructuring_bind_error(datum, $list394);
		} else {
			cdestructuring_bind_error(datum, $list394);
		}
		return NIL;
	}

	public static SubLObject cdolist_appending(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list394);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject var = NIL;
		SubLObject list_expression = NIL;
		SubLObject collection_var = NIL;
		destructuring_bind_must_consp(current, datum, $list394);
		var = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list394);
		list_expression = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list394);
		collection_var = current.first();
		current = current.rest();
		if (NIL == current) {
			current = temp;
			SubLObject iterated_expression = NIL;
			destructuring_bind_must_consp(current, datum, $list394);
			iterated_expression = current.first();
			current = current.rest();
			if (NIL == current) {
				final SubLObject list_expression_var = make_symbol($str395$LIST_EXPRESSION);
				final SubLObject tail_cons_var = make_symbol($str396$TAIL_CONS);
				final SubLObject result_var = make_symbol($$$RESULT);
				return list(CLET, list(list(list_expression_var, list_expression)),
						list(PCOND, list(list(NULL, list_expression_var), listS(CSETQ, collection_var, $list212)), list(list(ATOM, list_expression_var), list(CSETQ, collection_var, list(LIST, list_expression_var))), list(list(NULL, list(CDR, list_expression_var)), list(CLET, list(list(var, list(CAR, list_expression_var))), list(CSETQ, collection_var, iterated_expression))),
								list(T, list(CLET, list(bq_cons(tail_cons_var, $list212), bq_cons(result_var, $list212)), listS(CSETQ, collection_var, $list212),
										list(CDOLIST, list(var, list_expression_var), list(CSETQ, result_var, iterated_expression), list(PWHEN, result_var, list(PIF, tail_cons_var, list(PROGN, list(RPLACD, tail_cons_var, result_var), list(CSETQ, tail_cons_var, list(LAST, result_var))), list(PROGN, list(CSETQ, collection_var, iterated_expression), list(CSETQ, tail_cons_var, list(LAST, collection_var))))))))));
			}
			cdestructuring_bind_error(datum, $list394);
		} else {
			cdestructuring_bind_error(datum, $list394);
		}
		return NIL;
	}

	public static SubLObject expand_define_list_element_predicator(final SubLObject function_name, final SubLObject function_scope, final SubLObject element_var, final SubLObject type, final SubLObject body) {
		SubLObject defining_form = NIL;
		SubLObject definition = NIL;
		if (function_scope.eql($API)) {
			defining_form = DEFINE_API;
		} else if (function_scope.eql($PUBLIC)) {
			defining_form = DEFINE_PUBLIC;
		} else if (function_scope.eql($PROTECTED)) {
			defining_form = DEFINE_PROTECTED;
		} else if (function_scope.eql($PRIVATE)) {
			defining_form = DEFINE_PRIVATE;
		} else {
			defining_form = DEFINE_PUBLIC;
		}

		if (type.eql($ALL)) {
			definition = listS(defining_form, function_name, $list334, $list407, list(CDOLIST, bq_cons(element_var, $list334), listS(PUNLESS, body, $list206)), $list205);
		} else if (type.eql($NOT_EMPTY_ALL)) {
			definition = listS(defining_form, function_name, $list334, $list409, list(CDOLIST, bq_cons(element_var, $list334), listS(PUNLESS, body, $list206)), $list205);
		} else if (type.eql($ANY)) {
			definition = listS(defining_form, function_name, $list334, $list407, list(CDOLIST, bq_cons(element_var, $list334), listS(PWHEN, body, $list205)), $list206);
		} else {
			Errors.error($str411$DEFINE_LIST_ELEMENT_PREDICATOR___, type);
		}

		return definition;
	}

	public static SubLObject define_api_list_element_predicator(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject function_name = NIL;
		SubLObject type = NIL;
		destructuring_bind_must_consp(current, datum, $list412);
		function_name = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list412);
		type = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list412);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject element_var = NIL;
		destructuring_bind_must_consp(current, datum, $list412);
		element_var = current.first();
		current = current.rest();
		if (NIL == current) {
			current = temp;
			SubLObject expression = NIL;
			destructuring_bind_must_consp(current, datum, $list412);
			expression = current.first();
			current = current.rest();
			if (NIL == current) {
				return expand_define_list_element_predicator(function_name, $API, element_var, type, expression);
			}
			cdestructuring_bind_error(datum, $list412);
		} else {
			cdestructuring_bind_error(datum, $list412);
		}
		return NIL;
	}

	public static SubLObject define_public_list_element_predicator(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject function_name = NIL;
		SubLObject type = NIL;
		destructuring_bind_must_consp(current, datum, $list412);
		function_name = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list412);
		type = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list412);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject element_var = NIL;
		destructuring_bind_must_consp(current, datum, $list412);
		element_var = current.first();
		current = current.rest();
		if (NIL == current) {
			current = temp;
			SubLObject expression = NIL;
			destructuring_bind_must_consp(current, datum, $list412);
			expression = current.first();
			current = current.rest();
			if (NIL == current) {
				return expand_define_list_element_predicator(function_name, $PUBLIC, element_var, type, expression);
			}
			cdestructuring_bind_error(datum, $list412);
		} else {
			cdestructuring_bind_error(datum, $list412);
		}
		return NIL;
	}

	public static SubLObject define_protected_list_element_predicator(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject function_name = NIL;
		SubLObject type = NIL;
		destructuring_bind_must_consp(current, datum, $list412);
		function_name = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list412);
		type = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list412);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject element_var = NIL;
		destructuring_bind_must_consp(current, datum, $list412);
		element_var = current.first();
		current = current.rest();
		if (NIL == current) {
			current = temp;
			SubLObject expression = NIL;
			destructuring_bind_must_consp(current, datum, $list412);
			expression = current.first();
			current = current.rest();
			if (NIL == current) {
				return expand_define_list_element_predicator(function_name, $PROTECTED, element_var, type, expression);
			}
			cdestructuring_bind_error(datum, $list412);
		} else {
			cdestructuring_bind_error(datum, $list412);
		}
		return NIL;
	}

	public static SubLObject define_private_list_element_predicator(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject function_name = NIL;
		SubLObject type = NIL;
		destructuring_bind_must_consp(current, datum, $list412);
		function_name = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list412);
		type = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list412);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject element_var = NIL;
		destructuring_bind_must_consp(current, datum, $list412);
		element_var = current.first();
		current = current.rest();
		if (NIL == current) {
			current = temp;
			SubLObject expression = NIL;
			destructuring_bind_must_consp(current, datum, $list412);
			expression = current.first();
			current = current.rest();
			if (NIL == current) {
				return expand_define_list_element_predicator(function_name, $PRIVATE, element_var, type, expression);
			}
			cdestructuring_bind_error(datum, $list412);
		} else {
			cdestructuring_bind_error(datum, $list412);
		}
		return NIL;
	}

	public static SubLObject argnames_from_arglist(final SubLObject arg_list) {
		return remove($sym413$_OPTIONAL, Mapping.mapcar(CAR_IF_LIST, arg_list), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject car_if_list(final SubLObject arg) {
		return arg.isCons() ? arg.first() : arg;
	}

	public static SubLObject car_if_list_or_nil(final SubLObject arg) {
		return arg.isCons() ? arg.first() : NIL;
	}

	public static SubLObject expand_fcond(final SubLObject v_clauses) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!v_clauses.isList())) {
			Errors.error($str415$FCOND___S_is_not_a_valid_clause_l, v_clauses);
		}
		if (v_clauses.first().isAtom()) {
			Errors.error($str416$FCOND___S_is_not_a_valid_clause_, v_clauses.first());
			return NIL;
		}
		if (NIL != v_clauses.rest()) {
			final SubLObject first_clause = v_clauses.first();
			final SubLObject rest_of_clauses = v_clauses.rest();
			if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (((!first_clause.isCons()) || (!first_clause.rest().isCons())) || (NIL != cddr(first_clause)))) {
				Errors.error($str416$FCOND___S_is_not_a_valid_clause_, first_clause);
			}
			return list(FIF, first_clause.first(), cadr(first_clause), expand_fcond(rest_of_clauses));
		}
		return listS(FIF, caar(v_clauses), cadr(v_clauses.first()), $list212);
	}

	public static SubLObject fcond(final SubLObject macroform, final SubLObject environment) {
		final SubLObject datum = macroform.rest();
		final SubLObject v_clauses;
		final SubLObject current = v_clauses = datum;
		return expand_fcond(v_clauses);
	}

	public static SubLObject check_p_range_case_clauses(final SubLObject v_clauses) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!v_clauses.isList())) {
			Errors.error($str417$P_RANGE_CASE__Ill_formed_clauses_, v_clauses);
		}
		SubLObject cdolist_list_var = v_clauses;
		SubLObject clause = NIL;
		clause = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!clause.isCons())) {
				Errors.error($str418$P_RANGE_CASE___S_is_not_a_valid_c, clause);
			}
			if ((((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (clause.first() != OTHERWISE)) && (!clause.first().isInteger())) && ((((!clause.first().isCons()) || (!caar(clause).isInteger())) || (!cdar(clause).isCons())) || (!cadr(clause.first()).isInteger()))) {
				Errors.error($str418$P_RANGE_CASE___S_is_not_a_valid_c, clause);
			}
			cdolist_list_var = cdolist_list_var.rest();
			clause = cdolist_list_var.first();
		}
		return T;
	}

	public static SubLObject utilities_macros_car_eq(final SubLObject item, final SubLObject cons) {
		return eq(item, cons.first());
	}

	public static SubLObject expand_p_range_case(final SubLObject value, SubLObject v_clauses) {
		final SubLObject value_var = make_symbol($$$value);
		SubLObject processed_clauses = NIL;
		SubLObject otherwise_clause = assoc(OTHERWISE, v_clauses, UNPROVIDED, UNPROVIDED);
		if (NIL != otherwise_clause) {
			otherwise_clause = list(bq_cons(T, append(otherwise_clause.rest(), NIL)));
			v_clauses = remove(OTHERWISE, v_clauses, symbol_function(EQ), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		final SubLObject list_expression = v_clauses;
		if (NIL == list_expression) {
			processed_clauses = NIL;
		} else if (list_expression.isAtom()) {
			processed_clauses = list(list_expression);
		} else if (NIL == list_expression.rest()) {
			final SubLObject clause = list_expression.first();
			processed_clauses = list(clause.first().isCons() ? bq_cons(list(CAND, list($sym420$__, value_var, caar(clause)), list($sym421$__, value_var, cadr(clause.first()))), clause.rest()) : bq_cons(list($sym422$_, value_var, clause.first()), clause.rest()));
		} else {
			SubLObject tail_cons = NIL;
			SubLObject result = NIL;
			final SubLObject clause2 = list_expression.first();
			processed_clauses = tail_cons = list(clause2.first().isCons() ? bq_cons(list(CAND, list($sym420$__, value_var, caar(clause2)), list($sym421$__, value_var, cadr(clause2.first()))), clause2.rest()) : bq_cons(list($sym422$_, value_var, clause2.first()), clause2.rest()));
			SubLObject cdolist_list_var = list_expression.rest();
			SubLObject clause3 = NIL;
			clause3 = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				result = list(clause3.first().isCons() ? bq_cons(list(CAND, list($sym420$__, value_var, caar(clause3)), list($sym421$__, value_var, cadr(clause3.first()))), clause3.rest()) : bq_cons(list($sym422$_, value_var, clause3.first()), clause3.rest()));
				rplacd(tail_cons, result);
				tail_cons = result;
				cdolist_list_var = cdolist_list_var.rest();
				clause3 = cdolist_list_var.first();
			}
		}

		return list(CLET, list(list(value_var, value)), bq_cons(PCOND, append(processed_clauses, otherwise_clause, NIL)));
	}

	public static SubLObject p_range_case(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject value = NIL;
		destructuring_bind_must_consp(current, datum, $list423);
		value = current.first();
		final SubLObject v_clauses;
		current = v_clauses = current.rest();
		check_p_range_case_clauses(v_clauses);
		return expand_p_range_case(value, v_clauses);
	}

	public static SubLObject default_code_branch_error_clause(final SubLObject version) {
		return list(ERROR, $str425$Invalid_version_code__A_, version);
	}

	public static SubLObject code_branch_by_version(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list426);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject version = NIL;
		destructuring_bind_must_consp(current, datum, $list426);
		version = current.first();
		current = current.rest();
		if (NIL == current) {
			current = temp;
			SubLObject version_bodies = NIL;
			destructuring_bind_must_consp(current, datum, $list426);
			version_bodies = current.first();
			current = current.rest();
			SubLObject allow_other_keys_p = NIL;
			SubLObject rest = current;
			SubLObject bad = NIL;
			SubLObject current_$12 = NIL;
			while (NIL != rest) {
				destructuring_bind_must_consp(rest, datum, $list426);
				current_$12 = rest.first();
				rest = rest.rest();
				destructuring_bind_must_consp(rest, datum, $list426);
				if (NIL == member(current_$12, $list427, UNPROVIDED, UNPROVIDED)) {
					bad = T;
				}
				if (current_$12 == $ALLOW_OTHER_KEYS) {
					allow_other_keys_p = rest.first();
				}
				rest = rest.rest();
			}
			if ((NIL != bad) && (NIL == allow_other_keys_p)) {
				cdestructuring_bind_error(datum, $list426);
			}
			final SubLObject error_clause_tail = property_list_member($ERROR_CLAUSE, current);
			final SubLObject error_clause = (NIL != error_clause_tail) ? cadr(error_clause_tail) : NIL;
			SubLObject v_clauses = NIL;
			v_clauses = cons(list(OTHERWISE, NIL != error_clause ? error_clause : default_code_branch_error_clause(version)), v_clauses);
			SubLObject cdolist_list_var = version_bodies;
			SubLObject version_body = NIL;
			version_body = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject current_$13;
				final SubLObject datum_$13 = current_$13 = version_body;
				SubLObject version_$15 = NIL;
				SubLObject form = NIL;
				destructuring_bind_must_consp(current_$13, datum_$13, $list429);
				version_$15 = current_$13.first();
				current_$13 = current_$13.rest();
				destructuring_bind_must_consp(current_$13, datum_$13, $list429);
				form = current_$13.first();
				current_$13 = current_$13.rest();
				if (NIL == current_$13) {
					v_clauses = cons(list(version_$15, form), v_clauses);
				} else {
					cdestructuring_bind_error(datum_$13, $list429);
				}
				cdolist_list_var = cdolist_list_var.rest();
				version_body = cdolist_list_var.first();
			}
			return listS(PCASE, version, append(v_clauses, NIL));
		}
		cdestructuring_bind_error(datum, $list426);
		return NIL;
	}

	public static SubLObject code_branch_by_version_numbers(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list430);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject major = NIL;
		SubLObject minor = NIL;
		destructuring_bind_must_consp(current, datum, $list430);
		major = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list430);
		minor = current.first();
		current = current.rest();
		if (NIL == current) {
			current = temp;
			SubLObject version_bodies = NIL;
			destructuring_bind_must_consp(current, datum, $list430);
			version_bodies = current.first();
			current = current.rest();
			SubLObject allow_other_keys_p = NIL;
			SubLObject rest = current;
			SubLObject bad = NIL;
			SubLObject current_$16 = NIL;
			while (NIL != rest) {
				destructuring_bind_must_consp(rest, datum, $list430);
				current_$16 = rest.first();
				rest = rest.rest();
				destructuring_bind_must_consp(rest, datum, $list430);
				if (NIL == member(current_$16, $list427, UNPROVIDED, UNPROVIDED)) {
					bad = T;
				}
				if (current_$16 == $ALLOW_OTHER_KEYS) {
					allow_other_keys_p = rest.first();
				}
				rest = rest.rest();
			}
			if ((NIL != bad) && (NIL == allow_other_keys_p)) {
				cdestructuring_bind_error(datum, $list430);
			}
			final SubLObject error_clause_tail = property_list_member($ERROR_CLAUSE, current);
			final SubLObject error_clause = (NIL != error_clause_tail) ? cadr(error_clause_tail) : NIL;
			SubLObject v_clauses = NIL;
			v_clauses = cons(list(T, NIL != error_clause ? error_clause : default_code_branch_error_clause(major)), v_clauses);
			SubLObject cdolist_list_var = version_bodies;
			SubLObject version_body = NIL;
			version_body = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject current_$17;
				final SubLObject datum_$17 = current_$17 = version_body;
				SubLObject major_version = NIL;
				SubLObject minor_version = NIL;
				SubLObject form = NIL;
				destructuring_bind_must_consp(current_$17, datum_$17, $list431);
				major_version = current_$17.first();
				current_$17 = current_$17.rest();
				destructuring_bind_must_consp(current_$17, datum_$17, $list431);
				minor_version = current_$17.first();
				current_$17 = current_$17.rest();
				destructuring_bind_must_consp(current_$17, datum_$17, $list431);
				form = current_$17.first();
				current_$17 = current_$17.rest();
				if (NIL == current_$17) {
					v_clauses = cons(list(list(CAND, list(EQUAL, major_version, major), list(EQUAL, minor_version, minor)), form), v_clauses);
				} else {
					cdestructuring_bind_error(datum_$17, $list431);
				}
				cdolist_list_var = cdolist_list_var.rest();
				version_body = cdolist_list_var.first();
			}
			return bq_cons(PCOND, append(v_clauses, NIL));
		}
		cdestructuring_bind_error(datum, $list430);
		return NIL;
	}

	public static SubLObject sub_kb_loaded_root_string(final SubLObject sub_kb_symbol) {
		final SubLObject sub_kb_string = symbol_name(sub_kb_symbol);
		final SubLObject len = length(sub_kb_string);
		final SubLObject root_string = string_utilities.substring(sub_kb_string, ONE_INTEGER, subtract(len, TWO_INTEGER));
		return root_string;
	}

	public static SubLObject sub_kb_loaded_p_symbol(final SubLObject sub_kb_symbol) {
		final SubLObject root_string = sub_kb_loaded_root_string(sub_kb_symbol);
		final SubLObject loaded_p_string = cconcatenate(root_string, $str434$_P);
		return intern(loaded_p_string, UNPROVIDED);
	}

	public static SubLObject sub_kb_set_symbol(final SubLObject sub_kb_symbol) {
		final SubLObject root_string = sub_kb_loaded_root_string(sub_kb_symbol);
		final SubLObject set_string = cconcatenate($str436$SET_, root_string);
		return intern(set_string, UNPROVIDED);
	}

	public static SubLObject sub_kb_unset_symbol(final SubLObject sub_kb_symbol) {
		final SubLObject root_string = sub_kb_loaded_root_string(sub_kb_symbol);
		final SubLObject unset_string = cconcatenate($str438$UNSET_, root_string);
		return intern(unset_string, UNPROVIDED);
	}

	public static SubLObject declare_kb_feature(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject sub_kb_symbol = NIL;
		SubLObject loaded_doc_string = NIL;
		destructuring_bind_must_consp(current, datum, $list439);
		sub_kb_symbol = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list439);
		loaded_doc_string = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject loaded_p_symbol = sub_kb_loaded_p_symbol(sub_kb_symbol);
			final SubLObject set_symbol = sub_kb_set_symbol(sub_kb_symbol);
			final SubLObject unset_symbol = sub_kb_unset_symbol(sub_kb_symbol);
			return list(PROGN, listS(DEFGLOBAL_PRIVATE, sub_kb_symbol, $list212), listS(CPUSHNEW, list(QUOTE, sub_kb_symbol), $list441), list(DEFINE_PUBLIC, loaded_p_symbol, NIL, loaded_doc_string, list(RET, sub_kb_symbol)), listS(DEFINE_PROTECTED, set_symbol, NIL, listS(CSETQ, sub_kb_symbol, $list442), $list205), listS(DEFINE_PROTECTED, unset_symbol, NIL, listS(CSETQ, sub_kb_symbol, $list212), $list206));
		}
		cdestructuring_bind_error(datum, $list439);
		return NIL;
	}

	public static SubLObject expand_format_to_string(final SubLObject args) {
		SubLObject expressions = NIL;
		SubLObject sub_args = NIL;
		SubLObject control_arg = NIL;
		SubLObject value_arg = NIL;
		sub_args = args;
		control_arg = (NIL != sub_args) ? sub_args.first() : NIL;
		value_arg = (NIL != sub_args) ? cadr(sub_args) : NIL;
		while (NIL != sub_args) {
			final SubLObject pcase_var = control_arg;
			if (pcase_var.eql($A)) {
				expressions = cons(value_arg, expressions);
			} else if (pcase_var.eql($S)) {
				expressions = cons(list(SYMBOL_NAME, value_arg), expressions);
			} else if (pcase_var.eql($D)) {
				expressions = cons(list(TO_STRING, value_arg), expressions);
			}

			sub_args = cddr(sub_args);
			control_arg = (NIL != sub_args) ? sub_args.first() : NIL;
			value_arg = (NIL != sub_args) ? cadr(sub_args) : NIL;
		}
		return bq_cons(CCONCATENATE, append(nreverse(expressions), NIL));
	}

	public static SubLObject format_to_string(final SubLObject macroform, final SubLObject environment) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject datum = macroform.rest();
		final SubLObject format_args;
		final SubLObject current = format_args = datum;
		SubLObject key_expected = T;
		SubLObject cdolist_list_var = format_args;
		SubLObject arg = NIL;
		arg = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (((NIL != key_expected) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) && (NIL == member(arg, $list448, UNPROVIDED, UNPROVIDED))) {
				Errors.error($str449$FORMAT_TO_STRING___S_is_an_invali, arg);
			}
			key_expected = makeBoolean(NIL == key_expected);
			cdolist_list_var = cdolist_list_var.rest();
			arg = cdolist_list_var.first();
		}
		if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == key_expected)) {
			Errors.error($str450$FORMAT_TO_STRING__Odd_number_of_a, format_args);
		}
		return expand_format_to_string(format_args);
	}

	public static SubLObject time(final SubLObject macroform, final SubLObject environment) {
		final SubLObject datum = macroform.rest();
		final SubLObject body;
		final SubLObject current = body = datum;
		final SubLObject time = $sym451$TIME;
		return list(CLET, list(time), listS(CTIME, time, append(body, NIL)), list(FORMAT, T, $str454$_____real_time__A_seconds__, time), list(IDENTITY, time));
	}

	public static SubLObject with_process_resource_tracking_in_seconds(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject var = NIL;
		destructuring_bind_must_consp(current, datum, $list455);
		var = current.first();
		final SubLObject body;
		current = body = current.rest();
		final SubLObject timing_info = $sym456$TIMING_INFO;
		final SubLObject clock_time = $sym457$CLOCK_TIME;
		return list(CLET, list(timing_info, clock_time), list(CTIME, clock_time, listS(WITH_PROCESS_RESOURCE_TRACKING, timing_info, append(body, NIL))), list(CSETQ, var, list(CONVERT_PROCESS_RESOURCE_TRACKING_TIMING_INFO_TO_SECONDS, list(NADD_CLOCK_TIME_TO_PROCESS_RESOURCE_TIMING_INFO, clock_time, timing_info))));
	}

	public static SubLObject convert_process_resource_tracking_timing_info_to_seconds(final SubLObject timing_info) {
		SubLObject converted_timing_info = NIL;
		SubLObject remainder;
		SubLObject property;
		SubLObject value;
		SubLObject new_value;
		for (remainder = NIL, remainder = timing_info; NIL != remainder; remainder = cddr(remainder)) {
			property = remainder.first();
			value = cadr(remainder);
			new_value = (NIL != list_utilities.member_eqP(property, $process_resource_tracking_100s_of_nanoseconds_properties$.getGlobalValue())) ? divide(value, $int$10000000) : value;
			converted_timing_info = putf(converted_timing_info, property, new_value);
		}
		return converted_timing_info;
	}

	public static SubLObject nadd_clock_time_to_process_resource_timing_info(final SubLObject clock_time, final SubLObject timing_info) {
		return putf(timing_info, $WALL_CLOCK_TIME, clock_time);
	}

	public static SubLObject process_resource_tracking_user_time(final SubLObject timing_info) {
		return getf(timing_info, $USER_TIME, UNPROVIDED);
	}

	public static SubLObject process_resource_tracking_system_time(final SubLObject timing_info) {
		return getf(timing_info, $SYSTEM_TIME, UNPROVIDED);
	}

	public static SubLObject process_resource_tracking_wall_clock_time(final SubLObject timing_info) {
		return getf(timing_info, $WALL_CLOCK_TIME, UNPROVIDED);
	}

	public static SubLObject timing_info(final SubLObject macroform, final SubLObject environment) {
		final SubLObject datum = macroform.rest();
		final SubLObject body;
		final SubLObject current = body = datum;
		final SubLObject timing_info = $sym467$TIMING_INFO;
		return list(CLET, list(timing_info), listS(WITH_PROCESS_RESOURCE_TRACKING_IN_SECONDS, timing_info, append(body, NIL)), list(FORMAT, T, $str468$______s__, timing_info), list(IDENTITY, timing_info));
	}

	public static SubLObject user_time(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject var = NIL;
		destructuring_bind_must_consp(current, datum, $list455);
		var = current.first();
		final SubLObject body;
		current = body = current.rest();
		final SubLObject timing_info = $sym469$TIMING_INFO;
		return list(CLET, list(timing_info), listS(WITH_PROCESS_RESOURCE_TRACKING_IN_SECONDS, timing_info, append(body, NIL)), list(CSETQ, var, list(PROCESS_RESOURCE_TRACKING_USER_TIME, timing_info)));
	}

	public static SubLObject user_time_in_seconds(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject var = NIL;
		destructuring_bind_must_consp(current, datum, $list455);
		var = current.first();
		final SubLObject body;
		current = body = current.rest();
		final SubLObject timing_info = $sym471$TIMING_INFO;
		return list(CLET, list(timing_info), listS(WITH_PROCESS_RESOURCE_TRACKING_IN_SECONDS, timing_info, append(body, NIL)), list(CSETQ, var, list(PROCESS_RESOURCE_TRACKING_USER_TIME, timing_info)));
	}

	public static SubLObject system_time(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject var = NIL;
		destructuring_bind_must_consp(current, datum, $list455);
		var = current.first();
		final SubLObject body;
		current = body = current.rest();
		final SubLObject timing_info = $sym472$TIMING_INFO;
		return list(CLET, list(timing_info), listS(WITH_PROCESS_RESOURCE_TRACKING_IN_SECONDS, timing_info, append(body, NIL)), list(CSETQ, var, list(PROCESS_RESOURCE_TRACKING_SYSTEM_TIME, timing_info)));
	}

	public static SubLObject system_time_in_seconds(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject var = NIL;
		destructuring_bind_must_consp(current, datum, $list455);
		var = current.first();
		final SubLObject body;
		current = body = current.rest();
		final SubLObject timing_info = $sym474$TIMING_INFO;
		return list(CLET, list(timing_info), listS(WITH_PROCESS_RESOURCE_TRACKING_IN_SECONDS, timing_info, append(body, NIL)), list(CSETQ, var, list(PROCESS_RESOURCE_TRACKING_SYSTEM_TIME, timing_info)));
	}

	public static SubLObject check_type_if_present(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject v_object = NIL;
		SubLObject pred = NIL;
		destructuring_bind_must_consp(current, datum, $list475);
		v_object = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list475);
		pred = current.first();
		current = current.rest();
		if (NIL == current) {
			return list(PWHEN, v_object, list(CHECK_TYPE, v_object, pred));
		}
		cdestructuring_bind_error(datum, $list475);
		return NIL;
	}

	public static SubLObject enforce_type_if_present(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject v_object = NIL;
		SubLObject pred = NIL;
		destructuring_bind_must_consp(current, datum, $list475);
		v_object = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list475);
		pred = current.first();
		current = current.rest();
		if (NIL == current) {
			return list(PWHEN, v_object, list(ENFORCE_TYPE, v_object, pred));
		}
		cdestructuring_bind_error(datum, $list475);
		return NIL;
	}

	public static SubLObject check_list_type(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject list = NIL;
		SubLObject pred = NIL;
		destructuring_bind_must_consp(current, datum, $list476);
		list = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list476);
		pred = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject elem = $sym477$ELEM;
			final SubLObject list_var = $sym478$LIST_VAR;
			return list(CLET, list(list(list_var, list)), listS(CHECK_TYPE, list_var, $list479), list(CDOLIST, list(elem, list_var), list(CHECK_TYPE, elem, pred)));
		}
		cdestructuring_bind_error(datum, $list476);
		return NIL;
	}

	public static SubLObject check_list_type_if_present(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject list = NIL;
		SubLObject pred = NIL;
		destructuring_bind_must_consp(current, datum, $list476);
		list = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list476);
		pred = current.first();
		current = current.rest();
		if (NIL == current) {
			return list(PWHEN, list, list(CHECK_LIST_TYPE, list, pred));
		}
		cdestructuring_bind_error(datum, $list476);
		return NIL;
	}

	public static SubLObject enforce_list_type(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject list = NIL;
		SubLObject pred = NIL;
		destructuring_bind_must_consp(current, datum, $list476);
		list = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list476);
		pred = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject elem = $sym481$ELEM;
			final SubLObject list_var = $sym482$LIST_VAR;
			return list(CLET, list(list(list_var, list)), listS(ENFORCE_TYPE, list_var, $list479), list(CDOLIST, list(elem, list_var), list(ENFORCE_TYPE, elem, pred)));
		}
		cdestructuring_bind_error(datum, $list476);
		return NIL;
	}

	public static SubLObject enforce_list_type_if_present(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject list = NIL;
		SubLObject pred = NIL;
		destructuring_bind_must_consp(current, datum, $list476);
		list = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list476);
		pred = current.first();
		current = current.rest();
		if (NIL == current) {
			return list(PWHEN, list, list(CHECK_LIST_TYPE, list, pred));
		}
		cdestructuring_bind_error(datum, $list476);
		return NIL;
	}

	public static SubLObject check_plist_type(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject plist = NIL;
		SubLObject pred = NIL;
		destructuring_bind_must_consp(current, datum, $list483);
		plist = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list483);
		pred = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject property = $sym484$PROPERTY;
			final SubLObject value = $sym485$VALUE;
			final SubLObject plist_var = $sym486$PLIST_VAR;
			return list(CLET, list(list(plist_var, plist)), listS(CHECK_TYPE, plist_var, $list487), list(DO_PLIST, list(property, value, plist_var), list(IGNORE, value), list(CHECK_TYPE, property, pred)));
		}
		cdestructuring_bind_error(datum, $list483);
		return NIL;
	}

	public static SubLObject enforce_plist_type(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject plist = NIL;
		SubLObject pred = NIL;
		destructuring_bind_must_consp(current, datum, $list483);
		plist = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list483);
		pred = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject property = $sym488$PROPERTY;
			final SubLObject value = $sym489$VALUE;
			final SubLObject plist_var = $sym490$PLIST_VAR;
			return list(CLET, list(list(plist_var, plist)), listS(ENFORCE_TYPE, plist_var, $list487), list(DO_PLIST, list(property, value, plist_var), list(IGNORE, value), list(ENFORCE_TYPE, property, pred)));
		}
		cdestructuring_bind_error(datum, $list483);
		return NIL;
	}

	public static SubLObject warn_unless_plist_of_type(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject plist = NIL;
		SubLObject pred = NIL;
		destructuring_bind_must_consp(current, datum, $list483);
		plist = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list483);
		pred = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject property = $sym491$PROPERTY;
			final SubLObject value = $sym492$VALUE;
			final SubLObject plist_var = $sym493$PLIST_VAR;
			return list(CLET, list(list(plist_var, plist)), listS(CHECK_TYPE, plist_var, $list487), list(DO_PLIST, list(property, value, plist_var), list(IGNORE, value), list(WARN_UNLESS, list(pred, property), $str495$_s_is_not_a_known__a, property, list(QUOTE, pred))));
		}
		cdestructuring_bind_error(datum, $list483);
		return NIL;
	}

	public static SubLObject must_if_present(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject v_object = NIL;
		SubLObject form = NIL;
		SubLObject format_string = NIL;
		destructuring_bind_must_consp(current, datum, $list496);
		v_object = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list496);
		form = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list496);
		format_string = current.first();
		final SubLObject format_arguments;
		current = format_arguments = current.rest();
		return list(PWHEN, v_object, listS(MUST, form, format_string, append(format_arguments, NIL)));
	}

	public static SubLObject nil_or(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject function_spec = NIL;
		SubLObject v_object = NIL;
		destructuring_bind_must_consp(current, datum, $list498);
		function_spec = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list498);
		v_object = current.first();
		current = current.rest();
		if (NIL == current) {
			return list(COR, list(NULL, v_object), list(function_spec, v_object));
		}
		cdestructuring_bind_error(datum, $list498);
		return NIL;
	}

	public static SubLObject swap(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject place1 = NIL;
		SubLObject place2 = NIL;
		destructuring_bind_must_consp(current, datum, $list500);
		place1 = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list500);
		place2 = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject swap_var = $sym501$SWAP_VAR;
			return list(CLET, list(list(swap_var, place1)), list(CSETF, place1, place2), list(CSETF, place2, swap_var));
		}
		cdestructuring_bind_error(datum, $list500);
		return NIL;
	}

	public static SubLObject def_kb_variable(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject variable = NIL;
		destructuring_bind_must_consp(current, datum, $list502);
		variable = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list502);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject allow_other_keys_p = NIL;
		SubLObject rest = current;
		SubLObject bad = NIL;
		SubLObject current_$19 = NIL;
		while (NIL != rest) {
			destructuring_bind_must_consp(rest, datum, $list502);
			current_$19 = rest.first();
			rest = rest.rest();
			destructuring_bind_must_consp(rest, datum, $list502);
			if (NIL == member(current_$19, $list503, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			}
			if (current_$19 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			}
			rest = rest.rest();
		}
		if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			cdestructuring_bind_error(datum, $list502);
		}
		final SubLObject documentation_tail = property_list_member($DOCUMENTATION, current);
		final SubLObject documentation = (NIL != documentation_tail) ? cadr(documentation_tail) : NIL;
		final SubLObject definer_tail = property_list_member($DEFINER, current);
		final SubLObject definer = (NIL != definer_tail) ? cadr(definer_tail) : NIL;
		final SubLObject access_tail = property_list_member($ACCESS, current);
		final SubLObject access = (NIL != access_tail) ? cadr(access_tail) : NIL;
		final SubLObject body;
		current = body = temp;
		assert NIL != symbolp(variable) : "Types.symbolp(variable) " + "CommonSymbols.NIL != Types.symbolp(variable) " + variable;
		if (((NIL != documentation) && (!assertionsDisabledSynth)) && (NIL == stringp(documentation))) {
			throw new AssertionError(documentation);
		}
		final SubLObject v_package = symbol_package(variable);
		final SubLObject initializer_name = format(NIL, $str506$_A_INITIALIZER, variable);
		final SubLObject initializer = intern(initializer_name, v_package);
		return bq_cons(PROGN, append(NIL != access ? list(list(PROCLAIM, list(QUOTE, list(VACCESS, access, variable)))) : NIL, list(NIL != definer ? list(definer, variable, $UNINITIALIZED, documentation) : list(DEFVAR, variable, $UNINITIALIZED, documentation), list(REGISTER_KB_VARIABLE_INITIALIZATION, list(QUOTE, variable), list(QUOTE, initializer)), listS(DEFINE_PRIVATE, initializer, NIL, append(body, NIL)))));
	}

	public static SubLObject register_kb_variable_initialization(final SubLObject var_symbol, final SubLObject func) {
		$kb_var_initializations$.setGlobalValue(list_utilities.alist_enter($kb_var_initializations$.getGlobalValue(), var_symbol, func, UNPROVIDED));
		return NIL;
	}

	public static SubLObject initialize_kb_variables() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject str = $$$Initializing_KB_variables;
		final SubLObject _prev_bind_0 = $progress_start_time$.currentBinding(thread);
		final SubLObject _prev_bind_2 = $progress_last_pacification_time$.currentBinding(thread);
		final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
		final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
		final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
		final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
		final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
		final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
		try {
			$progress_start_time$.bind(get_universal_time(), thread);
			$progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
			$progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
			$progress_notification_count$.bind(ZERO_INTEGER, thread);
			$progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
			$progress_count$.bind(ZERO_INTEGER, thread);
			$is_noting_progressP$.bind(T, thread);
			$silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
			noting_progress_preamble(str);
			SubLObject cdolist_list_var = $kb_var_initializations$.getGlobalValue();
			SubLObject cons = NIL;
			cons = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject current;
				final SubLObject datum = current = cons;
				SubLObject var_symbol = NIL;
				SubLObject func = NIL;
				destructuring_bind_must_consp(current, datum, $list513);
				var_symbol = current.first();
				current = func = current.rest();
				set(var_symbol, funcall(func));
				cdolist_list_var = cdolist_list_var.rest();
				cons = cdolist_list_var.first();
			}
			noting_progress_postamble();
		} finally {
			$silent_progressP$.rebind(_prev_bind_8, thread);
			$is_noting_progressP$.rebind(_prev_bind_7, thread);
			$progress_count$.rebind(_prev_bind_6, thread);
			$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
			$progress_notification_count$.rebind(_prev_bind_4, thread);
			$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
			$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
			$progress_start_time$.rebind(_prev_bind_0, thread);
		}
		return NIL;
	}

	public static SubLObject defparameter_lazy(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject getter = NIL;
		SubLObject initialization_form = NIL;
		destructuring_bind_must_consp(current, datum, $list514);
		getter = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list514);
		initialization_form = current.first();
		current = current.rest();
		SubLObject allow_other_keys_p = NIL;
		SubLObject rest = current;
		SubLObject bad = NIL;
		SubLObject current_$20 = NIL;
		while (NIL != rest) {
			destructuring_bind_must_consp(rest, datum, $list514);
			current_$20 = rest.first();
			rest = rest.rest();
			destructuring_bind_must_consp(rest, datum, $list514);
			if (NIL == member(current_$20, $list515, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			}
			if (current_$20 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			}
			rest = rest.rest();
		}
		if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			cdestructuring_bind_error(datum, $list514);
		}
		final SubLObject var_tail = property_list_member($VAR, current);
		SubLObject var = (NIL != var_tail) ? cadr(var_tail) : NIL;
		final SubLObject vaccess_tail = property_list_member($VACCESS, current);
		final SubLObject vaccess = (NIL != vaccess_tail) ? cadr(vaccess_tail) : PRIVATE;
		final SubLObject faccess_tail = property_list_member($FACCESS, current);
		final SubLObject faccess = (NIL != faccess_tail) ? cadr(faccess_tail) : PRIVATE;
		final SubLObject documentation_tail = property_list_member($DOCUMENTATION, current);
		final SubLObject documentation = (NIL != documentation_tail) ? cadr(documentation_tail) : NIL;
		if ((NIL != string_utilities.starts_with(symbol_name(getter), $str519$_)) || (NIL != string_utilities.ends_with(symbol_name(getter), $str519$_, UNPROVIDED))) {
			Errors.error($str520$Invalid_function_name__A___The_fi, getter);
		}
		if (NIL == var) {
			final SubLObject var_name = cconcatenate($str519$_, new SubLObject[] { format_nil.format_nil_a_no_copy(getter), $str519$_ });
			var = intern(var_name, UNPROVIDED);
		}
		final SubLObject init_value = $sym521$INIT_VALUE;
		return list(PROGN, list(DECLAIM, list(VACCESS, vaccess, var)), list(DECLAIM, list(FACCESS, faccess, getter)), listS(DEFPARAMETER, var, $UNINITIALIZED, append(NIL != documentation ? list(documentation) : NIL, NIL)),
				list(DEFINE, getter, NIL, list(PWHEN, listS(EQ, var, $list523), list(CLET, list(list(init_value, initialization_form)), list(PWHEN, listS(EQ, init_value, $list523), list(ERROR, $str524$Unable_to_initialize__A__, var)), list(CSETQ, var, init_value))), list(RET, var)));
	}

	public static SubLObject defvar_lazy(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject getter = NIL;
		SubLObject initialization_form = NIL;
		destructuring_bind_must_consp(current, datum, $list514);
		getter = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list514);
		initialization_form = current.first();
		current = current.rest();
		SubLObject allow_other_keys_p = NIL;
		SubLObject rest = current;
		SubLObject bad = NIL;
		SubLObject current_$21 = NIL;
		while (NIL != rest) {
			destructuring_bind_must_consp(rest, datum, $list514);
			current_$21 = rest.first();
			rest = rest.rest();
			destructuring_bind_must_consp(rest, datum, $list514);
			if (NIL == member(current_$21, $list515, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			}
			if (current_$21 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			}
			rest = rest.rest();
		}
		if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			cdestructuring_bind_error(datum, $list514);
		}
		final SubLObject var_tail = property_list_member($VAR, current);
		SubLObject var = (NIL != var_tail) ? cadr(var_tail) : NIL;
		final SubLObject vaccess_tail = property_list_member($VACCESS, current);
		final SubLObject vaccess = (NIL != vaccess_tail) ? cadr(vaccess_tail) : PRIVATE;
		final SubLObject faccess_tail = property_list_member($FACCESS, current);
		final SubLObject faccess = (NIL != faccess_tail) ? cadr(faccess_tail) : PRIVATE;
		final SubLObject documentation_tail = property_list_member($DOCUMENTATION, current);
		final SubLObject documentation = (NIL != documentation_tail) ? cadr(documentation_tail) : NIL;
		if ((NIL != string_utilities.starts_with(symbol_name(getter), $str519$_)) || (NIL != string_utilities.ends_with(symbol_name(getter), $str519$_, UNPROVIDED))) {
			Errors.error($str525$Invalid_function_name__A___The_fi, getter);
		}
		if (NIL == var) {
			final SubLObject var_name = cconcatenate($str519$_, new SubLObject[] { format_nil.format_nil_a_no_copy(getter), $str519$_ });
			var = intern(var_name, UNPROVIDED);
		}
		final SubLObject init_value = $sym526$INIT_VALUE;
		return list(PROGN, list(DECLAIM, list(VACCESS, vaccess, var)), list(DECLAIM, list(FACCESS, faccess, getter)), listS(DEFVAR, var, $UNINITIALIZED, append(NIL != documentation ? list(documentation) : NIL, NIL)),
				list(DEFINE, getter, NIL, list(PWHEN, listS(EQ, var, $list523), list(CLET, list(list(init_value, initialization_form)), list(PWHEN, listS(EQ, init_value, $list523), list(ERROR, $str524$Unable_to_initialize__A__, var)), list(CSETQ, var, init_value))), list(RET, var)));
	}

	public static SubLObject defglobal_lazy(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject getter = NIL;
		SubLObject initialization_form = NIL;
		destructuring_bind_must_consp(current, datum, $list514);
		getter = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list514);
		initialization_form = current.first();
		current = current.rest();
		SubLObject allow_other_keys_p = NIL;
		SubLObject rest = current;
		SubLObject bad = NIL;
		SubLObject current_$22 = NIL;
		while (NIL != rest) {
			destructuring_bind_must_consp(rest, datum, $list514);
			current_$22 = rest.first();
			rest = rest.rest();
			destructuring_bind_must_consp(rest, datum, $list514);
			if (NIL == member(current_$22, $list515, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			}
			if (current_$22 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			}
			rest = rest.rest();
		}
		if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			cdestructuring_bind_error(datum, $list514);
		}
		final SubLObject var_tail = property_list_member($VAR, current);
		SubLObject var = (NIL != var_tail) ? cadr(var_tail) : NIL;
		final SubLObject vaccess_tail = property_list_member($VACCESS, current);
		final SubLObject vaccess = (NIL != vaccess_tail) ? cadr(vaccess_tail) : PRIVATE;
		final SubLObject faccess_tail = property_list_member($FACCESS, current);
		final SubLObject faccess = (NIL != faccess_tail) ? cadr(faccess_tail) : PRIVATE;
		final SubLObject documentation_tail = property_list_member($DOCUMENTATION, current);
		final SubLObject documentation = (NIL != documentation_tail) ? cadr(documentation_tail) : NIL;
		if ((NIL != string_utilities.starts_with(symbol_name(getter), $str519$_)) || (NIL != string_utilities.ends_with(symbol_name(getter), $str519$_, UNPROVIDED))) {
			Errors.error($str527$Invalid_function_name__A___The_fi, getter);
		}
		if (NIL == var) {
			final SubLObject var_name = cconcatenate($str519$_, new SubLObject[] { format_nil.format_nil_a_no_copy(getter), $str519$_ });
			var = intern(var_name, UNPROVIDED);
		}
		final SubLObject init_value = $sym528$INIT_VALUE;
		return list(PROGN, list(DECLAIM, list(VACCESS, vaccess, var)), list(DECLAIM, list(FACCESS, faccess, getter)), listS(DEFGLOBAL, var, $UNINITIALIZED, append(NIL != documentation ? list(documentation) : NIL, NIL)),
				list(DEFINE, getter, NIL, list(PWHEN, listS(EQ, var, $list523), list(CLET, list(list(init_value, initialization_form)), list(PWHEN, listS(EQ, init_value, $list523), list(ERROR, $str524$Unable_to_initialize__A__, var)), list(CSETQ, var, init_value))), list(RET, var)));
	}

	public static SubLObject deflexical_lazy(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject getter = NIL;
		SubLObject initialization_form = NIL;
		destructuring_bind_must_consp(current, datum, $list514);
		getter = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list514);
		initialization_form = current.first();
		current = current.rest();
		SubLObject allow_other_keys_p = NIL;
		SubLObject rest = current;
		SubLObject bad = NIL;
		SubLObject current_$23 = NIL;
		while (NIL != rest) {
			destructuring_bind_must_consp(rest, datum, $list514);
			current_$23 = rest.first();
			rest = rest.rest();
			destructuring_bind_must_consp(rest, datum, $list514);
			if (NIL == member(current_$23, $list515, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			}
			if (current_$23 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			}
			rest = rest.rest();
		}
		if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			cdestructuring_bind_error(datum, $list514);
		}
		final SubLObject var_tail = property_list_member($VAR, current);
		SubLObject var = (NIL != var_tail) ? cadr(var_tail) : NIL;
		final SubLObject vaccess_tail = property_list_member($VACCESS, current);
		final SubLObject vaccess = (NIL != vaccess_tail) ? cadr(vaccess_tail) : PRIVATE;
		final SubLObject faccess_tail = property_list_member($FACCESS, current);
		final SubLObject faccess = (NIL != faccess_tail) ? cadr(faccess_tail) : PRIVATE;
		final SubLObject documentation_tail = property_list_member($DOCUMENTATION, current);
		final SubLObject documentation = (NIL != documentation_tail) ? cadr(documentation_tail) : NIL;
		if ((NIL != string_utilities.starts_with(symbol_name(getter), $str519$_)) || (NIL != string_utilities.ends_with(symbol_name(getter), $str519$_, UNPROVIDED))) {
			Errors.error($str529$Invalid_function_name__A___The_fi, getter);
		}
		if (NIL == var) {
			final SubLObject var_name = cconcatenate($str519$_, new SubLObject[] { format_nil.format_nil_a_no_copy(getter), $str519$_ });
			var = intern(var_name, UNPROVIDED);
		}
		final SubLObject init_value = $sym530$INIT_VALUE;
		return list(PROGN, list(DECLAIM, list(VACCESS, vaccess, var)), list(DECLAIM, list(FACCESS, faccess, getter)), listS(DEFLEXICAL, var, $UNINITIALIZED, append(NIL != documentation ? list(documentation) : NIL, NIL)),
				list(DEFINE, getter, NIL, list(PWHEN, listS(EQ, var, $list523), list(CLET, list(list(init_value, initialization_form)), list(PWHEN, listS(EQ, init_value, $list523), list(ERROR, $str524$Unable_to_initialize__A__, var)), list(CSETQ, var, init_value))), list(RET, var)));
	}

	public static SubLObject define_api_obsolete(final SubLObject macroform, final SubLObject environment) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject name = NIL;
		SubLObject arglist = NIL;
		SubLObject documentation_string = NIL;
		SubLObject declarations = NIL;
		destructuring_bind_must_consp(current, datum, $list531);
		name = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list531);
		arglist = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list531);
		documentation_string = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list531);
		declarations = current.first();
		final SubLObject body;
		current = body = current.rest();
		assert NIL != stringp(documentation_string) : "Types.stringp(documentation_string) " + "CommonSymbols.NIL != Types.stringp(documentation_string) " + documentation_string;
		assert NIL != listp(declarations) : "Types.listp(declarations) " + "CommonSymbols.NIL != Types.listp(declarations) " + declarations;
		thread.resetMultipleValues();
		final SubLObject argument_types = parse_obsolete_api_declarations(declarations);
		final SubLObject body_preamble = thread.secondMultipleValue();
		final SubLObject return_types = thread.thirdMultipleValue();
		final SubLObject replacements = thread.fourthMultipleValue();
		thread.resetMultipleValues();
		return list(PROGN, listS(DEFINE_PUBLIC, name, arglist, documentation_string, append(body_preamble, body, NIL)), list(REGISTER_OBSOLETE_CYC_API_FUNCTION, list(QUOTE, name), list(QUOTE, replacements), list(QUOTE, arglist), documentation_string, list(QUOTE, argument_types), list(QUOTE, return_types)));
	}

	public static SubLObject register_obsolete_cyc_api_function(final SubLObject name, final SubLObject replacements, final SubLObject arglist, final SubLObject doc_string, final SubLObject argument_types, final SubLObject return_types) {
		register_cyc_api_function(name, arglist, doc_string, argument_types, return_types);
		register_obsolete_cyc_api_replacements(name, replacements);
		return NIL;
	}

	public static SubLObject obsolete_cyc_api_replacements(final SubLObject name) {
		return get(name, $OBSOLETE_CYC_API_REPLACEMENTS, UNPROVIDED);
	}

	public static SubLObject register_obsolete_cyc_api_replacements(final SubLObject name, final SubLObject replacements) {
		assert NIL != symbolp(name) : "Types.symbolp(name) " + "CommonSymbols.NIL != Types.symbolp(name) " + name;
		assert NIL != listp(replacements) : "Types.listp(replacements) " + "CommonSymbols.NIL != Types.listp(replacements) " + replacements;
		put(name, $OBSOLETE_CYC_API_REPLACEMENTS, replacements);
		return name;
	}

	public static SubLObject deregister_obsolete_cyc_api_replacements(final SubLObject name) {
		assert NIL != symbolp(name) : "Types.symbolp(name) " + "CommonSymbols.NIL != Types.symbolp(name) " + name;
		return remprop(name, $OBSOLETE_CYC_API_REPLACEMENTS);
	}

	public static SubLObject initialization_for_partial_list_results() {
		return NIL;
	}

	public static SubLObject accumulation_for_partial_list_results(final SubLObject result) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		$partial_results_accumulator$.setDynamicValue(cons(result, $partial_results_accumulator$.getDynamicValue(thread)), thread);
		return result;
	}

	public static SubLObject consolidation_for_partial_list_results(final SubLObject accumulated_results) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject cdolist_list_var = nreverse(accumulated_results);
		SubLObject result = NIL;
		result = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			$partial_results_total_accumulator$.setDynamicValue(cons(result, $partial_results_total_accumulator$.getDynamicValue(thread)), thread);
			cdolist_list_var = cdolist_list_var.rest();
			result = cdolist_list_var.first();
		}
		return NIL;
	}

	public static SubLObject notification_for_partial_list_results(final SubLObject accumulated_results, final SubLObject size, final SubLObject total_size) {
		return accumulated_results;
	}

	public static SubLObject final_results_for_partial_list_results(final SubLObject total_results) {
		return nreverse(total_results);
	}

	public static SubLObject add_result_to_partial_results_accumulator(final SubLObject result) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != $accumulating_partial_resultsP$.getDynamicValue(thread)) {
			funcall($partial_results_accumulation_fn$.getDynamicValue(thread), result);
			$partial_results_size$.setDynamicValue(add($partial_results_size$.getDynamicValue(thread), ONE_INTEGER), thread);
			if (!$partial_results_size$.getDynamicValue(thread).numL($partial_results_threshold$.getDynamicValue(thread))) {
				funcall($partial_results_notification_fn$.getDynamicValue(thread), $partial_results_accumulator$.getDynamicValue(thread), $partial_results_size$.getDynamicValue(thread), $partial_results_total_size$.getDynamicValue(thread));
				$partial_results_total_size$.setDynamicValue(add($partial_results_total_size$.getDynamicValue(thread), $partial_results_size$.getDynamicValue(thread)), thread);
				$partial_results_size$.setDynamicValue(ZERO_INTEGER, thread);
				funcall($partial_results_consolidation_fn$.getDynamicValue(thread), $partial_results_accumulator$.getDynamicValue(thread));
				$partial_results_accumulator$.setDynamicValue(funcall($partial_results_initialization_fn$.getDynamicValue(thread)), thread);
			}
		}
		return result;
	}

	public static SubLObject with_partial_results_accumulation(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list540);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject final_result_var = NIL;
		SubLObject threshold = NIL;
		destructuring_bind_must_consp(current, datum, $list540);
		final_result_var = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list540);
		threshold = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			return list(CLET, listS($list541, $list542, list($partial_results_threshold$, threshold), $list544), list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), $list545, listS(CSETQ, final_result_var, $list546)));
		}
		cdestructuring_bind_error(datum, $list540);
		return NIL;
	}

	public static SubLObject with_space_profiling_to_string(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list548);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject string_var = NIL;
		destructuring_bind_must_consp(current, datum, $list548);
		string_var = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			final SubLObject stream = $sym549$STREAM;
			return list(CWITH_OUTPUT_TO_STRING, list(stream, string_var), listS(WITH_SPACE_PROFILING, list($STREAM, stream), append(body, NIL)));
		}
		cdestructuring_bind_error(datum, $list548);
		return NIL;
	}

	public static SubLObject with_sxhash_composite(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list553);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject result_var = NIL;
		destructuring_bind_must_consp(current, datum, $list553);
		result_var = current.first();
		current = current.rest();
		SubLObject allow_other_keys_p = NIL;
		SubLObject rest = current;
		SubLObject bad = NIL;
		SubLObject current_$24 = NIL;
		while (NIL != rest) {
			destructuring_bind_must_consp(rest, datum, $list553);
			current_$24 = rest.first();
			rest = rest.rest();
			destructuring_bind_must_consp(rest, datum, $list553);
			if (NIL == member(current_$24, $list554, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			}
			if (current_$24 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			}
			rest = rest.rest();
		}
		if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			cdestructuring_bind_error(datum, $list553);
		}
		final SubLObject initial_value_tail = property_list_member($INITIAL_VALUE, current);
		final SubLObject initial_value = (NIL != initial_value_tail) ? cadr(initial_value_tail) : ZERO_INTEGER;
		final SubLObject body;
		current = body = temp;
		return list(CLET, list($list556, list($sxhash_composite_hash$, initial_value)), bq_cons(PROGN, append(body, NIL)), listS(CSETQ, result_var, $list558));
	}

	public static SubLObject with_sxhash_composite_fast(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list553);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject result_var = NIL;
		destructuring_bind_must_consp(current, datum, $list553);
		result_var = current.first();
		current = current.rest();
		SubLObject allow_other_keys_p = NIL;
		SubLObject rest = current;
		SubLObject bad = NIL;
		SubLObject current_$25 = NIL;
		while (NIL != rest) {
			destructuring_bind_must_consp(rest, datum, $list553);
			current_$25 = rest.first();
			rest = rest.rest();
			destructuring_bind_must_consp(rest, datum, $list553);
			if (NIL == member(current_$25, $list554, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			}
			if (current_$25 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			}
			rest = rest.rest();
		}
		if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			cdestructuring_bind_error(datum, $list553);
		}
		final SubLObject initial_value_tail = property_list_member($INITIAL_VALUE, current);
		final SubLObject initial_value = (NIL != initial_value_tail) ? cadr(initial_value_tail) : ZERO_INTEGER;
		final SubLObject body;
		current = body = temp;
		return list(CLET, list($list559, list(COMPOSITE_HASH, initial_value)), bq_cons(PROGN, append(body, NIL)), listS(CSETQ, result_var, $list561));
	}

	public static SubLObject sxhash_composite_update_fast(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject value = NIL;
		destructuring_bind_must_consp(current, datum, $list562);
		value = current.first();
		current = current.rest();
		if (NIL == current) {
			return list(PROGN, $list563, list(CSETQ, COMPOSITE_HASH, listS(LOGXOR, listS(SXHASH_ROT, list(SXHASH, value), $list567), $list561)));
		}
		cdestructuring_bind_error(datum, $list562);
		return NIL;
	}

	public static SubLObject sxhash_update_state(final SubLObject state) {
		return aref($sxhash_update_state_vector$.getGlobalValue(), state);
	}

	public static SubLObject sxhash_composite_update(final SubLObject value) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		$sxhash_composite_state$.setDynamicValue(sxhash_update_state($sxhash_composite_state$.getDynamicValue(thread)), thread);
		$sxhash_composite_hash$.setDynamicValue(logxor(Sxhash.sxhash_rot(value, $sxhash_composite_state$.getDynamicValue(thread)), $sxhash_composite_hash$.getDynamicValue(thread)), thread);
		return NIL;
	}

	public static SubLObject slow_hash_test(SubLObject iterations) {
		if (iterations == UNPROVIDED) {
			iterations = $int$1000000;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject i;
		SubLObject sxhash;
		SubLObject _prev_bind_0;
		SubLObject _prev_bind_2;
		for (i = NIL, i = ZERO_INTEGER; i.numL(iterations); i = add(i, ONE_INTEGER)) {
			sxhash = ZERO_INTEGER;
			_prev_bind_0 = $sxhash_composite_state$.currentBinding(thread);
			_prev_bind_2 = $sxhash_composite_hash$.currentBinding(thread);
			try {
				$sxhash_composite_state$.bind(FOUR_INTEGER, thread);
				$sxhash_composite_hash$.bind($int$167, thread);
				sxhash_composite_update(FOUR_INTEGER);
				sxhash_composite_update(THREE_INTEGER);
				sxhash = $sxhash_composite_hash$.getDynamicValue(thread);
			} finally {
				$sxhash_composite_hash$.rebind(_prev_bind_2, thread);
				$sxhash_composite_state$.rebind(_prev_bind_0, thread);
			}
		}
		return NIL;
	}

	public static SubLObject fast_hash_test(SubLObject iterations) {
		if (iterations == UNPROVIDED) {
			iterations = $int$1000000;
		}
		SubLObject i;
		SubLObject sxhash;
		SubLObject composite_state;
		SubLObject composite_hash;
		for (i = NIL, i = ZERO_INTEGER; i.numL(iterations); i = add(i, ONE_INTEGER)) {
			sxhash = ZERO_INTEGER;
			composite_state = FOUR_INTEGER;
			composite_hash = $int$167;
			composite_state = sxhash_update_state(composite_state);
			composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(FOUR_INTEGER), composite_state), composite_hash);
			composite_state = sxhash_update_state(composite_state);
			composite_hash = sxhash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(THREE_INTEGER), composite_state), composite_hash);
		}
		return NIL;
	}

	public static SubLObject possibly_catch_error_message(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list574);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject var = NIL;
		SubLObject catchP = NIL;
		destructuring_bind_must_consp(current, datum, $list574);
		var = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list574);
		catchP = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			return list(PIF, catchP, listS(CATCH_ERROR_MESSAGE, list(var), append(body, NIL)), bq_cons(PROGN, append(body, NIL)));
		}
		cdestructuring_bind_error(datum, $list574);
		return NIL;
	}

	public static SubLObject possibly_ccatch(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list575);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject tag = NIL;
		SubLObject ans_var = NIL;
		SubLObject catchP = NIL;
		destructuring_bind_must_consp(current, datum, $list575);
		tag = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list575);
		ans_var = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list575);
		catchP = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			return list(PIF, catchP, listS(CCATCH, tag, ans_var, append(body, NIL)), bq_cons(PROGN, append(body, NIL)));
		}
		cdestructuring_bind_error(datum, $list575);
		return NIL;
	}

	public static SubLObject run_benchmark_compensating_for_paging(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list577);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject pre_n = NIL;
		SubLObject n = NIL;
		destructuring_bind_must_consp(current, datum, $list577);
		pre_n = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list577);
		n = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			final SubLObject timings = $sym578$TIMINGS;
			final SubLObject time = $sym579$TIME;
			final SubLObject i = $sym580$I;
			return list(CLET, list(bq_cons(timings, $list212)), $list581, list(CDOTIMES, list(i, list($sym582$_, pre_n, n)), list(CLET, list(time), listS(CTIME, time, append(body, $list583)), list(PWHEN, list($sym420$__, i, pre_n), list(CPUSH, time, timings)))), listS(PERFORM_STANDARD_STATISTICAL_ANALYSIS, timings, $list442));
		}
		cdestructuring_bind_error(datum, $list577);
		return NIL;
	}

	public static SubLObject benchmark_gc() {
		return Storage.gc(UNPROVIDED);
	}

	public static SubLObject without_pretty_printing(final SubLObject macroform, final SubLObject environment) {
		final SubLObject datum = macroform.rest();
		final SubLObject body;
		final SubLObject current = body = datum;
		return listS(CLET, $list587, append(body, NIL));
	}

	public static SubLObject possibly_with_timeout(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list588);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject timeout = NIL;
		SubLObject timed_outP = NIL;
		destructuring_bind_must_consp(current, datum, $list588);
		timeout = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list588);
		timed_outP = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			return list(PIF, timeout, list(WITH_TIMEOUT, list(timeout, timed_outP), bq_cons(PROGN, append(body, NIL))), bq_cons(PROGN, append(body, NIL)));
		}
		cdestructuring_bind_error(datum, $list588);
		return NIL;
	}

	public static SubLObject with_retries(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list590);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject retries = NIL;
		SubLObject seconds_between = NIL;
		destructuring_bind_must_consp(current, datum, $list590);
		retries = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list590);
		seconds_between = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			final SubLObject error_msg = $sym591$ERROR_MSG;
			final SubLObject success = $sym592$SUCCESS;
			final SubLObject n = $sym593$N;
			return list(CLET, list(error_msg, bq_cons(success, $list212)), list(CDOTIMES, list(n, retries), list(PUNLESS, success, listS(CSETQ, error_msg, $list212), listS(CATCH_ERROR_MESSAGE, list(error_msg), append(body, NIL)), list(PIF, error_msg, list(SLEEP, seconds_between), listS(CSETQ, success, $list442)))), list(PWHEN, error_msg, list(ERROR, error_msg)));
		}
		cdestructuring_bind_error(datum, $list590);
		return NIL;
	}

	public static SubLObject declare_utilities_macros_file() {
		declareMacro(me, "define_api", "DEFINE-API");
		declareMacro(me, "declare_api_function", "DECLARE-API-FUNCTION");
		declareMacro(me, "defmacro_api", "DEFMACRO-API");
		declareMacro(me, "define_api_provisional", "DEFINE-API-PROVISIONAL");
		declareMacro(me, "defmacro_api_provisional", "DEFMACRO-API-PROVISIONAL");
		declareFunction(me, "register_cyc_api_function", "REGISTER-CYC-API-FUNCTION", 5, 0, false);
		declareFunction(me, "register_cyc_api_macro", "REGISTER-CYC-API-MACRO", 3, 0, false);
		declareFunction(me, "api_special_p", "API-SPECIAL-P", 1, 0, false);
		declareFunction(me, "api_special_handler", "API-SPECIAL-HANDLER", 1, 0, false);
		declareFunction(me, "register_api_special", "REGISTER-API-SPECIAL", 2, 0, false);
		declareFunction(me, "api_predefined_function_p", "API-PREDEFINED-FUNCTION-P", 1, 0, false);
		declareFunction(me, "register_api_predefined_function", "REGISTER-API-PREDEFINED-FUNCTION", 1, 0, false);
		declareFunction(me, "unregister_api_predefined_function", "UNREGISTER-API-PREDEFINED-FUNCTION", 1, 0, false);
		declareFunction(me, "api_predefined_host_function_p", "API-PREDEFINED-HOST-FUNCTION-P", 1, 0, false);
		declareFunction(me, "register_api_predefined_host_function", "REGISTER-API-PREDEFINED-HOST-FUNCTION", 1, 0, false);
		declareFunction(me, "unregister_api_predefined_host_function", "UNREGISTER-API-PREDEFINED-HOST-FUNCTION", 1, 0, false);
		declareFunction(me, "api_predefined_macro_p", "API-PREDEFINED-MACRO-P", 1, 0, false);
		declareFunction(me, "register_api_predefined_macro", "REGISTER-API-PREDEFINED-MACRO", 1, 0, false);
		declareFunction(me, "unregister_api_predefined_macro", "UNREGISTER-API-PREDEFINED-MACRO", 1, 0, false);
		declareFunction(me, "api_predefined_host_macro_p", "API-PREDEFINED-HOST-MACRO-P", 1, 0, false);
		declareFunction(me, "register_api_predefined_host_macro", "REGISTER-API-PREDEFINED-HOST-MACRO", 1, 0, false);
		declareFunction(me, "unregister_api_predefined_host_macro", "UNREGISTER-API-PREDEFINED-HOST-MACRO", 1, 0, false);
		declareFunction(me, "cyc_api_symbol_p", "CYC-API-SYMBOL-P", 1, 0, false);
		declareFunction(me, "register_cyc_api_symbol", "REGISTER-CYC-API-SYMBOL", 1, 0, false);
		declareFunction(me, "deregister_cyc_api_symbol", "DEREGISTER-CYC-API-SYMBOL", 1, 0, false);
		declareFunction(me, "cyc_api_args", "CYC-API-ARGS", 1, 0, false);
		declareFunction(me, "register_cyc_api_args", "REGISTER-CYC-API-ARGS", 2, 0, false);
		declareFunction(me, "deregister_cyc_api_args", "DEREGISTER-CYC-API-ARGS", 1, 0, false);
		declareFunction(me, "register_cyc_api_function_documentation", "REGISTER-CYC-API-FUNCTION-DOCUMENTATION", 2, 0, false);
		declareFunction(me, "get_api_arg_types", "GET-API-ARG-TYPES", 1, 0, false);
		declareFunction(me, "register_cyc_api_arg_types", "REGISTER-CYC-API-ARG-TYPES", 2, 0, false);
		declareFunction(me, "deregister_cyc_api_arg_types", "DEREGISTER-CYC-API-ARG-TYPES", 1, 0, false);
		declareFunction(me, "get_api_return_types", "GET-API-RETURN-TYPES", 1, 0, false);
		declareFunction(me, "register_cyc_api_return_types", "REGISTER-CYC-API-RETURN-TYPES", 2, 0, false);
		declareFunction(me, "deregister_cyc_api_return_types", "DEREGISTER-CYC-API-RETURN-TYPES", 1, 0, false);
		declareFunction(me, "parse_api_type_declarations", "PARSE-API-TYPE-DECLARATIONS", 1, 0, false);
		declareFunction(me, "parse_obsolete_api_declarations", "PARSE-OBSOLETE-API-DECLARATIONS", 1, 0, false);
		declareFunction(me, "parse_api_declarations_int", "PARSE-API-DECLARATIONS-INT", 2, 0, false);
		declareFunction(me, "expand_into_enforce_type", "EXPAND-INTO-ENFORCE-TYPE", 1, 0, false);
		declareFunction(me, "validate_return_type", "VALIDATE-RETURN-TYPE", 1, 0, false);
		declareMacro(me, "define_after_adding", "DEFINE-AFTER-ADDING");
		declareMacro(me, "define_after_removing", "DEFINE-AFTER-REMOVING");
		declareMacro(me, "define_rule_after_adding", "DEFINE-RULE-AFTER-ADDING");
		declareMacro(me, "define_rule_after_removing", "DEFINE-RULE-AFTER-REMOVING");
		declareMacro(me, "define_collection_defn", "DEFINE-COLLECTION-DEFN");
		declareMacro(me, "define_evaluation_defn", "DEFINE-EVALUATION-DEFN");
		declareMacro(me, "define_expansion_defn", "DEFINE-EXPANSION-DEFN");
		declareMacro(me, "define_cyc_subl_defn", "DEFINE-CYC-SUBL-DEFN");
		declareMacro(me, "define_kb", "DEFINE-KB");
		declareFunction(me, "kb_function_p", "KB-FUNCTION-P", 1, 0, false);
		declareFunction(me, "register_kb_symbol", "REGISTER-KB-SYMBOL", 1, 0, false);
		declareFunction(me, "deregister_kb_symbol", "DEREGISTER-KB-SYMBOL", 1, 0, false);
		declareFunction(me, "deregister_all_kb_functions", "DEREGISTER-ALL-KB-FUNCTIONS", 0, 0, false);
		declareFunction(me, "all_kb_functions", "ALL-KB-FUNCTIONS", 0, 0, false);
		declareFunction(me, "register_kb_function", "REGISTER-KB-FUNCTION", 1, 0, false);
		declareFunction(me, "deregister_kb_function", "DEREGISTER-KB-FUNCTION", 1, 0, false);
		declareMacro(me, "define_private_funcall", "DEFINE-PRIVATE-FUNCALL");
		declareFunction(me, "note_funcall_helper_function", "NOTE-FUNCALL-HELPER-FUNCTION", 1, 0, false);
		declareFunction(me, "funcall_helper_functionP", "FUNCALL-HELPER-FUNCTION?", 1, 0, false);
		declareFunction(me, "unprovided_argumentP", "UNPROVIDED-ARGUMENT?", 1, 0, false);
		declareMacro(me, "declare_control_parameter", "DECLARE-CONTROL-PARAMETER");
		declareFunction(me, "declare_control_parameter_internal", "DECLARE-CONTROL-PARAMETER-INTERNAL", 4, 0, false);
		declareMacro(me, "until_mapping_finished", "UNTIL-MAPPING-FINISHED");
		declareFunction(me, "mapping_finished", "MAPPING-FINISHED", 0, 0, false);
		declareMacro(me, "until_sbhl_mapping_finished", "UNTIL-SBHL-MAPPING-FINISHED");
		declareFunction(me, "sbhl_mapping_finished", "SBHL-MAPPING-FINISHED", 0, 0, false);
		declareMacro(me, "cfasl_write", "CFASL-WRITE");
		declareMacro(me, "cfasl_read", "CFASL-READ");
		declareMacro(me, "if_lock_idle", "IF-LOCK-IDLE");
		declareMacro(me, "possibly_with_lock_held", "POSSIBLY-WITH-LOCK-HELD");
		declareMacro(me, "defglobal_lock", "DEFGLOBAL-LOCK");
		declareFunction(me, "initialize_global_locks", "INITIALIZE-GLOBAL-LOCKS", 0, 0, false);
		declareFunction(me, "register_global_lock", "REGISTER-GLOBAL-LOCK", 2, 0, false);
		declareFunction(me, "global_lock_p", "GLOBAL-LOCK-P", 1, 0, false);
		declareFunction(me, "global_lock_initialization_form", "GLOBAL-LOCK-INITIALIZATION-FORM", 1, 0, false);
		declareFunction(me, "initialize_global_lock", "INITIALIZE-GLOBAL-LOCK", 1, 0, false);
		declareFunction(me, "initialize_global_lock_internal", "INITIALIZE-GLOBAL-LOCK-INTERNAL", 2, 0, false);
		declareMacro(me, "defparameter_fi", "DEFPARAMETER-FI");
		declareMacro(me, "with_clean_fi_state", "WITH-CLEAN-FI-STATE");
		declareFunction(me, "register_html_state_variable", "REGISTER-HTML-STATE-VARIABLE", 1, 0, false);
		declareMacro(me, "defparameter_html", "DEFPARAMETER-HTML");
		declareMacro(me, "defvar_html", "DEFVAR-HTML");
		declareFunction(me, "register_html_interface_variable", "REGISTER-HTML-INTERFACE-VARIABLE", 1, 0, false);
		declareMacro(me, "defparameter_html_interface", "DEFPARAMETER-HTML-INTERFACE");
		declareMacro(me, "defvar_html_interface", "DEFVAR-HTML-INTERFACE");
		declareMacro(me, "def_state_variable", "DEF-STATE-VARIABLE");
		declareFunction(me, "note_state_variable_documentation", "NOTE-STATE-VARIABLE-DOCUMENTATION", 2, 0, false);
		declareFunction(me, "define_operator_for_variable_type", "DEFINE-OPERATOR-FOR-VARIABLE-TYPE", 1, 0, false);
		declareFunction(me, "documentation", "DOCUMENTATION", 1, 1, false);
		declareMacro(me, "defvar_gt", "DEFVAR-GT");
		declareMacro(me, "defvar_at", "DEFVAR-AT");
		declareMacro(me, "defvar_defn", "DEFVAR-DEFN");
		declareMacro(me, "defvar_kbi", "DEFVAR-KBI");
		declareMacro(me, "defvar_kbp", "DEFVAR-KBP");
		declareMacro(me, "with_kbp_defaults", "WITH-KBP-DEFAULTS");
		declareMacro(me, "progn_cyc_api", "PROGN-CYC-API");
		declareMacro(me, "with_forward_inference_environment", "WITH-FORWARD-INFERENCE-ENVIRONMENT");
		declareMacro(me, "with_clean_forward_inference_environment", "WITH-CLEAN-FORWARD-INFERENCE-ENVIRONMENT");
		declareMacro(me, "with_possibly_clean_forward_inference_environment", "WITH-POSSIBLY-CLEAN-FORWARD-INFERENCE-ENVIRONMENT");
		declareFunction(me, "possibly_get_forward_inference_environment", "POSSIBLY-GET-FORWARD-INFERENCE-ENVIRONMENT", 0, 0, false);
		declareMacro(me, "with_clean_forward_problem_store_environment", "WITH-CLEAN-FORWARD-PROBLEM-STORE-ENVIRONMENT");
		declareMacro(me, "with_normal_forward_inference_parameters", "WITH-NORMAL-FORWARD-INFERENCE-PARAMETERS");
		declareMacro(me, "with_normal_forward_inference", "WITH-NORMAL-FORWARD-INFERENCE");
		declareFunction(me, "within_normal_forward_inferenceP", "WITHIN-NORMAL-FORWARD-INFERENCE?", 0, 0, false);
		declareMacro(me, "throw_unevaluatable_on_error", "THROW-UNEVALUATABLE-ON-ERROR");
		declareFunction(me, "tracing_at_level", "TRACING-AT-LEVEL", 2, 0, false);
		declareMacro(me, "if_tracing", "IF-TRACING");
		declareMacro(me, "with_static_structure_resourcing", "WITH-STATIC-STRUCTURE-RESOURCING");
		declareMacro(me, "possibly_with_static_structure_resourcing", "POSSIBLY-WITH-STATIC-STRUCTURE-RESOURCING");
		declareMacro(me, "define_structure_resource", "DEFINE-STRUCTURE-RESOURCE");
		declareMacro(me, "with_readtime_eval_disabled", "WITH-READTIME-EVAL-DISABLED");
		declareMacro(me, "noting_progress", "NOTING-PROGRESS");
		declareMacro(me, "noting_progress_delayed", "NOTING-PROGRESS-DELAYED");
		declareFunction(me, "noting_progress_preamble", "NOTING-PROGRESS-PREAMBLE", 1, 0, false);
		declareFunction(me, "noting_progress_postamble", "NOTING-PROGRESS-POSTAMBLE", 0, 0, false);
		declareFunction(me, "note_progress", "NOTE-PROGRESS", 0, 0, false);
		declareMacro(me, "noting_activity", "NOTING-ACTIVITY");
		declareMacro(me, "noting_percent_progress", "NOTING-PERCENT-PROGRESS");
		declareMacro(me, "noting_percent_progress_delayed", "NOTING-PERCENT-PROGRESS-DELAYED");
		declareFunction(me, "noting_percent_progress_preamble", "NOTING-PERCENT-PROGRESS-PREAMBLE", 1, 0, false);
		declareFunction(me, "noting_percent_progress_postamble", "NOTING-PERCENT-PROGRESS-POSTAMBLE", 0, 0, false);
		declareFunction(me, "note_percent_progress", "NOTE-PERCENT-PROGRESS", 2, 0, false);
		declareFunction(me, "print_progress_percent", "PRINT-PROGRESS-PERCENT", 1, 0, false);
		declareFunction(me, "print_2_digit_nonnegative_integer", "PRINT-2-DIGIT-NONNEGATIVE-INTEGER", 2, 0, false);
		declareFunction(me, "possibly_note_percent_progress_prediction", "POSSIBLY-NOTE-PERCENT-PROGRESS-PREDICTION", 3, 1, false);
		declareFunction(me, "compute_percent_progress", "COMPUTE-PERCENT-PROGRESS", 2, 0, false);
		declareFunction(me, "progress", "PROGRESS", 0, 0, false);
		declareMacro(me, "progress_cdotimes", "PROGRESS-CDOTIMES");
		declareMacro(me, "progress_csome", "PROGRESS-CSOME");
		declareMacro(me, "progress_cdolist", "PROGRESS-CDOLIST");
		declareMacro(me, "possibly_progress_cdolist", "POSSIBLY-PROGRESS-CDOLIST");
		declareMacro(me, "progress_cdohash", "PROGRESS-CDOHASH");
		declareMacro(me, "progress_do_set", "PROGRESS-DO-SET");
		declareMacro(me, "noting_elapsed_time", "NOTING-ELAPSED-TIME");
		declareFunction(me, "noting_elapsed_time_preamble", "NOTING-ELAPSED-TIME-PREAMBLE", 1, 0, false);
		declareFunction(me, "noting_elapsed_time_postamble", "NOTING-ELAPSED-TIME-POSTAMBLE", 2, 0, false);
		declareMacro(me, "with_cyc_server_handling", "WITH-CYC-SERVER-HANDLING");
		declareMacro(me, "with_cyc_io_syntax", "WITH-CYC-IO-SYNTAX");
		declareFunction(me, "with_cyc_io_syntax_internal", "WITH-CYC-IO-SYNTAX-INTERNAL", 1, 0, false);
		declareMacro(me, "with_sublisp_runtime_assumptions", "WITH-SUBLISP-RUNTIME-ASSUMPTIONS");
		declareMacro(me, "with_the_cyclist", "WITH-THE-CYCLIST");
		declareMacro(me, "with_different_cyclist", "WITH-DIFFERENT-CYCLIST");
		declareMacro(me, "do_bindings", "DO-BINDINGS");
		declareFunction(me, "do_bindings_var_specs", "DO-BINDINGS-VAR-SPECS", 2, 0, false);
		declareMacro(me, "fast_singleton_macro_p", "FAST-SINGLETON-MACRO-P");
		declareFunction(me, "pluralityP", "PLURALITY?", 1, 0, false);
		declareMacro(me, "fast_plurality_macro_p", "FAST-PLURALITY-MACRO-P");
		declareMacro(me, "cdosublists", "CDOSUBLISTS");
		declareMacro(me, "cdolist_and_sublists", "CDOLIST-AND-SUBLISTS");
		declareMacro(me, "cdolist_and_sublists_carefully", "CDOLIST-AND-SUBLISTS-CAREFULLY");
		declareMacro(me, "cdo_possibly_dotted_list", "CDO-POSSIBLY-DOTTED-LIST");
		declareMacro(me, "cdolist_if", "CDOLIST-IF");
		declareMacro(me, "cdosublists_if", "CDOSUBLISTS-IF");
		declareMacro(me, "cdolist_if_not", "CDOLIST-IF-NOT");
		declareMacro(me, "cdosublists_if_not", "CDOSUBLISTS-IF-NOT");
		declareMacro(me, "cdo2lists", "CDO2LISTS");
		declareMacro(me, "cdotree", "CDOTREE");
		declareMacro(me, "cdotree_conses", "CDOTREE-CONSES");
		declareMacro(me, "cdoplist", "CDOPLIST");
		declareFunction(me, "compositize_function_call", "COMPOSITIZE-FUNCTION-CALL", 2, 1, false);
		declareFunction(me, "simplify_car_and_cdr_path", "SIMPLIFY-CAR-AND-CDR-PATH", 1, 0, false);
		declareFunction(me, "map_symbols_to_accessors", "MAP-SYMBOLS-TO-ACCESSORS", 3, 0, false);
		declareMacro(me, "cdestructuring_setq", "CDESTRUCTURING-SETQ");
		declareFunction(me, "fast_funcall_no_value_check_args", "FAST-FUNCALL-NO-VALUE-CHECK-ARGS", 3, 0, false);
		declareMacro(me, "fast_funcall_no_value", "FAST-FUNCALL-NO-VALUE");
		declareMacro(me, "fast_funcall_setq", "FAST-FUNCALL-SETQ");
		declareFunction(me, "generate_parallel_var_list", "GENERATE-PARALLEL-VAR-LIST", 1, 0, false);
		declareFunction(me, "generate_multiple_csetq", "GENERATE-MULTIPLE-CSETQ", 2, 0, false);
		declareMacro(me, "fast_funcall_multiple_value_bind", "FAST-FUNCALL-MULTIPLE-VALUE-BIND");
		declareMacro(me, "fast_funcall_multiple_value_setq", "FAST-FUNCALL-MULTIPLE-VALUE-SETQ");
		declareFunction(me, "expand_destructuring_predication_generator", "EXPAND-DESTRUCTURING-PREDICATION-GENERATOR", 2, 0, false);
		declareMacro(me, "funcall_shortcut", "FUNCALL-SHORTCUT");
		declareMacro(me, "destructuring_predication_generator", "DESTRUCTURING-PREDICATION-GENERATOR");
		declareFunction(me, "symbol_in_tree_p", "SYMBOL-IN-TREE-P", 2, 0, false);
		// declareFunction(me, "unquoted_symbol_in_tree_p", "UNQUOTED-SYMBOL-IN-TREE-P", 2, 0, false);
		declareFunction(me, "generate_instance_variable_bindings_for_structure_slots", "GENERATE-INSTANCE-VARIABLE-BINDINGS-FOR-STRUCTURE-SLOTS", 5, 1, false);
		declareMacro(me, "cdolist_collecting", "CDOLIST-COLLECTING");
		declareMacro(me, "cdolist_appending", "CDOLIST-APPENDING");
		declareFunction(me, "expand_define_list_element_predicator", "EXPAND-DEFINE-LIST-ELEMENT-PREDICATOR", 5, 0, false);
		declareMacro(me, "define_api_list_element_predicator", "DEFINE-API-LIST-ELEMENT-PREDICATOR");
		declareMacro(me, "define_public_list_element_predicator", "DEFINE-PUBLIC-LIST-ELEMENT-PREDICATOR");
		declareMacro(me, "define_protected_list_element_predicator", "DEFINE-PROTECTED-LIST-ELEMENT-PREDICATOR");
		declareMacro(me, "define_private_list_element_predicator", "DEFINE-PRIVATE-LIST-ELEMENT-PREDICATOR");
		declareFunction(me, "argnames_from_arglist", "ARGNAMES-FROM-ARGLIST", 1, 0, false);
		declareFunction(me, "car_if_list", "CAR-IF-LIST", 1, 0, false);
		declareFunction(me, "car_if_list_or_nil", "CAR-IF-LIST-OR-NIL", 1, 0, false);
		declareFunction(me, "expand_fcond", "EXPAND-FCOND", 1, 0, false);
		declareMacro(me, "fcond", "FCOND");
		declareFunction(me, "check_p_range_case_clauses", "CHECK-P-RANGE-CASE-CLAUSES", 1, 0, false);
		declareFunction(me, "utilities_macros_car_eq", "UTILITIES-MACROS-CAR-EQ", 2, 0, false);
		declareFunction(me, "expand_p_range_case", "EXPAND-P-RANGE-CASE", 2, 0, false);
		declareMacro(me, "p_range_case", "P-RANGE-CASE");
		declareFunction(me, "default_code_branch_error_clause", "DEFAULT-CODE-BRANCH-ERROR-CLAUSE", 1, 0, false);
		declareMacro(me, "code_branch_by_version", "CODE-BRANCH-BY-VERSION");
		declareMacro(me, "code_branch_by_version_numbers", "CODE-BRANCH-BY-VERSION-NUMBERS");
		declareFunction(me, "sub_kb_loaded_root_string", "SUB-KB-LOADED-ROOT-STRING", 1, 0, false);
		declareFunction(me, "sub_kb_loaded_p_symbol", "SUB-KB-LOADED-P-SYMBOL", 1, 0, false);
		declareFunction(me, "sub_kb_set_symbol", "SUB-KB-SET-SYMBOL", 1, 0, false);
		declareFunction(me, "sub_kb_unset_symbol", "SUB-KB-UNSET-SYMBOL", 1, 0, false);
		declareMacro(me, "declare_kb_feature", "DECLARE-KB-FEATURE");
		declareFunction(me, "expand_format_to_string", "EXPAND-FORMAT-TO-STRING", 1, 0, false);
		declareMacro(me, "format_to_string", "FORMAT-TO-STRING");
		declareMacro(me, "time", "TIME");
		declareMacro(me, "with_process_resource_tracking_in_seconds", "WITH-PROCESS-RESOURCE-TRACKING-IN-SECONDS");
		declareFunction(me, "convert_process_resource_tracking_timing_info_to_seconds", "CONVERT-PROCESS-RESOURCE-TRACKING-TIMING-INFO-TO-SECONDS", 1, 0, false);
		declareFunction(me, "nadd_clock_time_to_process_resource_timing_info", "NADD-CLOCK-TIME-TO-PROCESS-RESOURCE-TIMING-INFO", 2, 0, false);
		declareFunction(me, "process_resource_tracking_user_time", "PROCESS-RESOURCE-TRACKING-USER-TIME", 1, 0, false);
		declareFunction(me, "process_resource_tracking_system_time", "PROCESS-RESOURCE-TRACKING-SYSTEM-TIME", 1, 0, false);
		declareFunction(me, "process_resource_tracking_wall_clock_time", "PROCESS-RESOURCE-TRACKING-WALL-CLOCK-TIME", 1, 0, false);
		declareMacro(me, "timing_info", "TIMING-INFO");
		declareMacro(me, "user_time", "USER-TIME");
		declareMacro(me, "user_time_in_seconds", "USER-TIME-IN-SECONDS");
		declareMacro(me, "system_time", "SYSTEM-TIME");
		declareMacro(me, "system_time_in_seconds", "SYSTEM-TIME-IN-SECONDS");
		declareMacro(me, "check_type_if_present", "CHECK-TYPE-IF-PRESENT");
		declareMacro(me, "enforce_type_if_present", "ENFORCE-TYPE-IF-PRESENT");
		declareMacro(me, "check_list_type", "CHECK-LIST-TYPE");
		declareMacro(me, "check_list_type_if_present", "CHECK-LIST-TYPE-IF-PRESENT");
		declareMacro(me, "enforce_list_type", "ENFORCE-LIST-TYPE");
		declareMacro(me, "enforce_list_type_if_present", "ENFORCE-LIST-TYPE-IF-PRESENT");
		declareMacro(me, "check_plist_type", "CHECK-PLIST-TYPE");
		declareMacro(me, "enforce_plist_type", "ENFORCE-PLIST-TYPE");
		declareMacro(me, "warn_unless_plist_of_type", "WARN-UNLESS-PLIST-OF-TYPE");
		declareMacro(me, "must_if_present", "MUST-IF-PRESENT");
		declareMacro(me, "nil_or", "NIL-OR");
		declareMacro(me, "swap", "SWAP");
		declareMacro(me, "def_kb_variable", "DEF-KB-VARIABLE");
		declareFunction(me, "register_kb_variable_initialization", "REGISTER-KB-VARIABLE-INITIALIZATION", 2, 0, false);
		declareFunction(me, "initialize_kb_variables", "INITIALIZE-KB-VARIABLES", 0, 0, false);
		declareMacro(me, "defparameter_lazy", "DEFPARAMETER-LAZY");
		declareMacro(me, "defvar_lazy", "DEFVAR-LAZY");
		declareMacro(me, "defglobal_lazy", "DEFGLOBAL-LAZY");
		declareMacro(me, "deflexical_lazy", "DEFLEXICAL-LAZY");
		declareMacro(me, "define_api_obsolete", "DEFINE-API-OBSOLETE");
		declareFunction(me, "register_obsolete_cyc_api_function", "REGISTER-OBSOLETE-CYC-API-FUNCTION", 6, 0, false);
		declareFunction(me, "obsolete_cyc_api_replacements", "OBSOLETE-CYC-API-REPLACEMENTS", 1, 0, false);
		declareFunction(me, "register_obsolete_cyc_api_replacements", "REGISTER-OBSOLETE-CYC-API-REPLACEMENTS", 2, 0, false);
		declareFunction(me, "deregister_obsolete_cyc_api_replacements", "DEREGISTER-OBSOLETE-CYC-API-REPLACEMENTS", 1, 0, false);
		declareFunction(me, "initialization_for_partial_list_results", "INITIALIZATION-FOR-PARTIAL-LIST-RESULTS", 0, 0, false);
		declareFunction(me, "accumulation_for_partial_list_results", "ACCUMULATION-FOR-PARTIAL-LIST-RESULTS", 1, 0, false);
		declareFunction(me, "consolidation_for_partial_list_results", "CONSOLIDATION-FOR-PARTIAL-LIST-RESULTS", 1, 0, false);
		declareFunction(me, "notification_for_partial_list_results", "NOTIFICATION-FOR-PARTIAL-LIST-RESULTS", 3, 0, false);
		declareFunction(me, "final_results_for_partial_list_results", "FINAL-RESULTS-FOR-PARTIAL-LIST-RESULTS", 1, 0, false);
		declareFunction(me, "add_result_to_partial_results_accumulator", "ADD-RESULT-TO-PARTIAL-RESULTS-ACCUMULATOR", 1, 0, false);
		declareMacro(me, "with_partial_results_accumulation", "WITH-PARTIAL-RESULTS-ACCUMULATION");
		declareMacro(me, "with_space_profiling_to_string", "WITH-SPACE-PROFILING-TO-STRING");
		declareMacro(me, "with_sxhash_composite", "WITH-SXHASH-COMPOSITE");
		declareMacro(me, "with_sxhash_composite_fast", "WITH-SXHASH-COMPOSITE-FAST");
		declareMacro(me, "sxhash_composite_update_fast", "SXHASH-COMPOSITE-UPDATE-FAST");
		declareFunction(me, "sxhash_update_state", "SXHASH-UPDATE-STATE", 1, 0, false);
		declareFunction(me, "sxhash_composite_update", "SXHASH-COMPOSITE-UPDATE", 1, 0, false);
		declareFunction(me, "slow_hash_test", "SLOW-HASH-TEST", 0, 1, false);
		declareFunction(me, "fast_hash_test", "FAST-HASH-TEST", 0, 1, false);
		declareMacro(me, "possibly_catch_error_message", "POSSIBLY-CATCH-ERROR-MESSAGE");
		declareMacro(me, "possibly_ccatch", "POSSIBLY-CCATCH");
		declareMacro(me, "run_benchmark_compensating_for_paging", "RUN-BENCHMARK-COMPENSATING-FOR-PAGING");
		declareFunction(me, "benchmark_gc", "BENCHMARK-GC", 0, 0, false);
		declareMacro(me, "without_pretty_printing", "WITHOUT-PRETTY-PRINTING");
		declareMacro(me, "possibly_with_timeout", "POSSIBLY-WITH-TIMEOUT");
		declareMacro(me, "with_retries", "WITH-RETRIES");
		return NIL;
	}

	public static SubLObject init_utilities_macros_file() {
		deflexical("*API-SPECIAL-TABLE*", SubLTrampolineFile.maybeDefault($api_special_table$, $api_special_table$, () -> make_hash_table(TEN_INTEGER, symbol_function(EQ), UNPROVIDED)));
		deflexical("*API-PREDEFINED-FUNCTION-TABLE*", SubLTrampolineFile.maybeDefault($api_predefined_function_table$, $api_predefined_function_table$, () -> make_hash_table($int$1000, symbol_function(EQ), UNPROVIDED)));
		deflexical("*API-PREDEFINED-HOST-FUNCTION-TABLE*", SubLTrampolineFile.maybeDefault($api_predefined_host_function_table$, $api_predefined_host_function_table$, () -> make_hash_table($int$100, symbol_function(EQ), UNPROVIDED)));
		deflexical("*API-PREDEFINED-MACRO-TABLE*", SubLTrampolineFile.maybeDefault($api_predefined_macro_table$, $api_predefined_macro_table$, () -> make_hash_table($int$100, symbol_function(EQ), UNPROVIDED)));
		deflexical("*API-PREDEFINED-HOST-MACRO-TABLE*", SubLTrampolineFile.maybeDefault($api_predefined_host_macro_table$, $api_predefined_host_macro_table$, () -> make_hash_table(TEN_INTEGER, symbol_function(EQ), UNPROVIDED)));
		deflexical("*API-SYMBOLS*", SubLTrampolineFile.maybeDefault($api_symbols$, $api_symbols$, NIL));
		deflexical("*API-TYPES*", SubLTrampolineFile.maybeDefault($api_types$, $api_types$, NIL));
		deflexical("*KB-FUNCTION-TABLE*", SubLTrampolineFile.maybeDefault($kb_function_table$, $kb_function_table$, () -> make_hash_table($int$400, symbol_function(EQ), UNPROVIDED)));
		deflexical("*FUNCALL-HELPER-PROPERTY*", SubLTrampolineFile.maybeDefault($funcall_helper_property$, $funcall_helper_property$, $FUNCALL_HELPER));
		deflexical("*UNPROVIDED*", SubLTrampolineFile.maybeDefault($unprovided$, $unprovided$, () -> make_symbol($$$UNPROVIDED)));
		defparameter("*CFASL-STREAM*", NIL);
		deflexical("*GLOBAL-LOCKS*", SubLTrampolineFile.maybeDefault($global_locks$, $global_locks$, NIL));
		deflexical("*FI-STATE-VARIABLES*", SubLTrampolineFile.maybeDefault($fi_state_variables$, $fi_state_variables$, NIL));
		deflexical("*HTML-STATE-VARIABLES*", SubLTrampolineFile.maybeDefault($html_state_variables$, $html_state_variables$, NIL));
		deflexical("*HTML-INTERFACE-VARIABLES*", SubLTrampolineFile.maybeDefault($html_interface_variables$, $html_interface_variables$, NIL));
		deflexical("*GT-STATE-VARIABLES*", SubLTrampolineFile.maybeDefault($gt_state_variables$, $gt_state_variables$, NIL));
		deflexical("*AT-STATE-VARIABLES*", SubLTrampolineFile.maybeDefault($at_state_variables$, $at_state_variables$, NIL));
		deflexical("*DEFN-STATE-VARIABLES*", SubLTrampolineFile.maybeDefault($defn_state_variables$, $defn_state_variables$, NIL));
		deflexical("*KBP-STATE-VARIABLES*", SubLTrampolineFile.maybeDefault($kbp_state_variables$, $kbp_state_variables$, NIL));
		deflexical("*KBI-STATE-VARIABLES*", SubLTrampolineFile.maybeDefault($kbi_state_variables$, $kbi_state_variables$, NIL));
		defparameter("*CURRENT-FORWARD-PROBLEM-STORE*", NIL);
		defparameter("*TRACING-LEVEL*", NIL);
		deflexical("*STRUCTURE-RESOURCING-ENABLED*", NIL);
		defparameter("*STRUCTURE-RESOURCING-MAKE-STATIC*", NIL);
		defparameter("*PROGRESS-LAST-PACIFICATION-TIME*", NIL);
		defparameter("*PROGRESS-PACIFICATIONS-SINCE-LAST-NL*", NIL);
		defparameter("*PROGRESS-ELAPSED-SECONDS-FOR-NOTIFICATION*", NIL);
		defparameter("*PROGRESS-NOTIFICATION-COUNT*", NIL);
		defparameter("*PROGRESS-COUNT*", NIL);
		defparameter("*IS-NOTING-PROGRESS?*", NIL);
		defparameter("*NOTING-PROGRESS-DELAYED-MODE-SECONDS*", NIL);
		defparameter("*NOTING-PROGRESS-DELAYED-MODE-STRING*", NIL);
		defparameter("*PROFESSIONAL-PROGRESS-MODE?*", NIL);
		defparameter("*SUPPRESS-ALL-PROGRESS-FASTER-THAN-SECONDS*", ONE_INTEGER);
		defvar("*SILENT-PROGRESS?*", NIL);
		defparameter("*NOTING-PROGRESS-START-TIME*", NIL);
		defvar("*LAST-PERCENT-PROGRESS-INDEX*", NIL);
		defparameter("*LAST-PERCENT-PROGRESS-PREDICTION*", NIL);
		defvar("*WITHIN-NOTING-PERCENT-PROGRESS*", NIL);
		defvar("*PERCENT-PROGRESS-START-TIME*", NIL);
		defvar("*PERCENT-PROGRESS-DELAYED-MODE-SECONDS*", NIL);
		defvar("*PERCENT-PROGRESS-DELAYED-MODE-STRING*", NIL);
		defparameter("*PROGRESS-NOTE*", $str272$);
		defparameter("*PROGRESS-START-TIME*", get_universal_time());
		defparameter("*PROGRESS-TOTAL*", ONE_INTEGER);
		defparameter("*PROGRESS-SOFAR*", ZERO_INTEGER);
		defparameter("*UTIL-VAR-ERROR-FORMAT-STRING*", $str331$_S___var__S_is_not_a_symbol_);
		defparameter("*UTIL-FUNC-ERROR-FORMAT-STRING*", $str332$_S___function__S_is_not_a_symbol_);
		defparameter("*UTIL-SEARCH-TYPE-ERROR-FORMAT-STRING*", $str333$_S___search_type__S_is_not_one_of);
		deflexical("*PROCESS-RESOURCE-TRACKING-100S-OF-NANOSECONDS-PROPERTIES*", $list461);
		deflexical("*KB-VAR-INITIALIZATIONS*", SubLTrampolineFile.maybeDefault($kb_var_initializations$, $kb_var_initializations$, NIL));
		defparameter("*PARTIAL-RESULTS-ACCUMULATOR*", NIL);
		defparameter("*PARTIAL-RESULTS-SIZE*", NIL);
		defparameter("*PARTIAL-RESULTS-THRESHOLD*", $int$40);
		defparameter("*PARTIAL-RESULTS-TOTAL-SIZE*", NIL);
		defparameter("*PARTIAL-RESULTS-TOTAL-ACCUMULATOR*", NIL);
		defparameter("*PARTIAL-RESULTS-INITIALIZATION-FN*", INITIALIZATION_FOR_PARTIAL_LIST_RESULTS);
		defparameter("*PARTIAL-RESULTS-ACCUMULATION-FN*", ACCUMULATION_FOR_PARTIAL_LIST_RESULTS);
		defparameter("*PARTIAL-RESULTS-CONSOLIDATION-FN*", CONSOLIDATION_FOR_PARTIAL_LIST_RESULTS);
		defparameter("*PARTIAL-RESULTS-NOTIFICATION-FN*", NOTIFICATION_FOR_PARTIAL_LIST_RESULTS);
		defparameter("*PARTIAL-RESULTS-FINAL-RESULT-FN*", FINAL_RESULTS_FOR_PARTIAL_LIST_RESULTS);
		defparameter("*ACCUMULATING-PARTIAL-RESULTS?*", NIL);
		defconstant("*SXHASH-BIT-LIMIT*", $int$27);
		deflexical("*SXHASH-UPDATE-STATE-VECTOR*", $ic569);
		defparameter("*SXHASH-COMPOSITE-STATE*", NIL);
		defparameter("*SXHASH-COMPOSITE-HASH*", NIL);
		return NIL;
	}

	public static SubLObject setup_utilities_macros_file() {
		declare_defglobal($api_special_table$);
		declare_defglobal($api_predefined_function_table$);
		declare_defglobal($api_predefined_host_function_table$);
		declare_defglobal($api_predefined_macro_table$);
		declare_defglobal($api_predefined_host_macro_table$);
		declare_defglobal($api_symbols$);
		declare_defglobal($api_types$);
		register_external_symbol(DEFINE_AFTER_ADDING);
		register_external_symbol(DEFINE_AFTER_REMOVING);
		register_external_symbol(DEFINE_RULE_AFTER_ADDING);
		register_external_symbol(DEFINE_RULE_AFTER_REMOVING);
		register_external_symbol(DEFINE_COLLECTION_DEFN);
		register_external_symbol(DEFINE_EVALUATION_DEFN);
		register_external_symbol(DEFINE_EXPANSION_DEFN);
		register_external_symbol(DEFINE_CYC_SUBL_DEFN);
		register_external_symbol(DEFINE_KB);
		declare_defglobal($kb_function_table$);
		register_macro_helper(REGISTER_KB_FUNCTION, DEFINE_KB);
		register_external_symbol(DEREGISTER_KB_FUNCTION);
		declare_defglobal($funcall_helper_property$);
		register_macro_helper(NOTE_FUNCALL_HELPER_FUNCTION, DEFINE_PRIVATE_FUNCALL);
		declare_defglobal($unprovided$);
		declare_defglobal($global_locks$);
		register_macro_helper(REGISTER_GLOBAL_LOCK, REGISTER_GLOBAL_LOCK);
		register_macro_helper(INITIALIZE_GLOBAL_LOCK_INTERNAL, INITIALIZE_GLOBAL_LOCKS);
		declare_defglobal($fi_state_variables$);
		declare_defglobal($html_state_variables$);
		declare_defglobal($html_interface_variables$);
		register_macro_helper(NOTE_STATE_VARIABLE_DOCUMENTATION, DEF_STATE_VARIABLE);
		declare_defglobal($gt_state_variables$);
		declare_defglobal($at_state_variables$);
		declare_defglobal($defn_state_variables$);
		declare_defglobal($kbp_state_variables$);
		register_macro_helper(POSSIBLY_GET_FORWARD_INFERENCE_ENVIRONMENT, WITH_POSSIBLY_CLEAN_FORWARD_INFERENCE_ENVIRONMENT);
		register_macro_helper(NOTING_PROGRESS_PREAMBLE, NOTING_PROGRESS);
		register_macro_helper(NOTING_PROGRESS_POSTAMBLE, NOTING_PROGRESS);
		register_macro_helper(NOTE_PROGRESS, NOTING_PROGRESS);
		register_macro_helper(NOTING_PERCENT_PROGRESS_PREAMBLE, NOTING_PERCENT_PROGRESS);
		register_macro_helper(NOTING_PERCENT_PROGRESS_POSTAMBLE, NOTING_PERCENT_PROGRESS);
		register_macro_helper(NOTE_PERCENT_PROGRESS, NOTING_PERCENT_PROGRESS);
		register_external_symbol(PROGRESS_CDOLIST);
		register_macro_helper(NOTING_ELAPSED_TIME_PREAMBLE, NOTING_ELAPSED_TIME);
		register_macro_helper(NOTING_ELAPSED_TIME_POSTAMBLE, NOTING_ELAPSED_TIME);
		register_macro_helper(SUB_KB_LOADED_P_SYMBOL, DECLARE_KB_FEATURE);
		register_macro_helper(SUB_KB_SET_SYMBOL, DECLARE_KB_FEATURE);
		register_macro_helper(SUB_KB_UNSET_SYMBOL, DECLARE_KB_FEATURE);
		register_macro_helper(CONVERT_PROCESS_RESOURCE_TRACKING_TIMING_INFO_TO_SECONDS, WITH_PROCESS_RESOURCE_TRACKING_IN_SECONDS);
		register_macro_helper(NADD_CLOCK_TIME_TO_PROCESS_RESOURCE_TIMING_INFO, WITH_PROCESS_RESOURCE_TRACKING_IN_SECONDS);
		declare_defglobal($kb_var_initializations$);
		register_macro_helper(REGISTER_KB_VARIABLE_INITIALIZATION, DEF_KB_VARIABLE);
		register_external_symbol(WITH_SPACE_PROFILING_TO_STRING);
		register_macro_helper(SXHASH_COMPOSITE_UPDATE, COMPUTE_SXHASH_COMPOSITE);
		register_macro_helper(BENCHMARK_GC, RUN_BENCHMARK_COMPENSATING_FOR_PAGING);
		return NIL;
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

	}
}

/**
 * Total time: 2202 ms synthetic
 */
