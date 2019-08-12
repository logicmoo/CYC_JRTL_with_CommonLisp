/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.inference.harness.forward;
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


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      UTILITIES-MACROS
 * source file: /cyc/top/cycl/utilities-macros.lisp
 * created:     2019/07/03 17:37:06
 */
public final class utilities_macros extends SubLTranslatedFile implements V12 {
    public static final SubLObject unquoted_symbol_in_tree_p(SubLObject symbol, SubLObject tree) {
        if (NIL == tree) {
            return NIL;
        } else {
            if (tree.isSymbol()) {
                return eq(symbol, tree);
            } else {
                if (tree.isCons()) {
                    if (NIL != member(tree.first(), $list_alt366, UNPROVIDED, UNPROVIDED)) {
                        if ((tree.rest().isCons() && cadr(tree).isCons()) && cddr(tree).isList()) {
                            {
                                SubLObject cdolist_list_var = cddr(tree);
                                SubLObject arg = NIL;
                                for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                                    if (NIL != unquoted_symbol_in_tree_p(symbol, arg)) {
                                        return T;
                                    }
                                }
                                return NIL;
                            }
                        } else {
                            return makeBoolean((NIL != symbol_in_tree_p(symbol, tree.first())) || (NIL != symbol_in_tree_p(symbol, tree.rest())));
                        }
                    } else {
                        return makeBoolean((NIL != symbol_in_tree_p(symbol, tree.first())) || (NIL != symbol_in_tree_p(symbol, tree.rest())));
                    }
                } else {
                    return NIL;
                }
            }
        }
    }

    /**
     * Expand an API argument type declaration form into a check-type expression.
     */
    @LispMethod(comment = "Expand an API argument type declaration form into a check-type expression.")
    public static final SubLObject expand_into_check_type(SubLObject argument_type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject argument = argument_type.first();
                SubLObject predicate_expression = second(argument_type);
                SubLObject predicate = NIL;
                if (predicate_expression.isAtom()) {
                    if (NIL == member(predicate_expression, $api_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
                        $api_types$.setGlobalValue(cons(predicate_expression, $api_types$.getGlobalValue()));
                    }
                    return list(CHECK_TYPE, argument, predicate_expression);
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (predicate_expression.first() != NIL_OR) {
                        Errors.error($str_alt40$Invalid_argument_type_expression_, argument_type);
                    }
                }
                predicate = second(predicate_expression);
                return list(PWHEN, argument, list(CHECK_TYPE, argument, predicate));
            }
        }
    }

    static private final SubLString $str_alt245$ = makeString("");

    public static final SubLFile me = new utilities_macros();

 public static final String myName = "com.cyc.cycjava.cycl.utilities_macros";


    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $cfasl_stream$ = makeSymbol("*CFASL-STREAM*");

    // defparameter
    // The current problem store in use for forward inference.
    /**
     * The current problem store in use for forward inference.
     */
    @LispMethod(comment = "The current problem store in use for forward inference.\ndefparameter")
    public static final SubLSymbol $current_forward_problem_store$ = makeSymbol("*CURRENT-FORWARD-PROBLEM-STORE*");

    // defparameter
    /**
     * An alist of things to trace and the level at which they should be traced.
     * Current items are :CYCL, :PLANNER, and :EXECUTOR. A level of NIL or 0 means
     * don't print out any tracing information. Higher numbers mean do more tracing.
     */
    @LispMethod(comment = "An alist of things to trace and the level at which they should be traced.\r\nCurrent items are :CYCL, :PLANNER, and :EXECUTOR. A level of NIL or 0 means\r\ndon\'t print out any tracing information. Higher numbers mean do more tracing.\ndefparameter\nAn alist of things to trace and the level at which they should be traced.\nCurrent items are :CYCL, :PLANNER, and :EXECUTOR. A level of NIL or 0 means\ndon\'t print out any tracing information. Higher numbers mean do more tracing.")
    public static final SubLSymbol $tracing_level$ = makeSymbol("*TRACING-LEVEL*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $progress_last_pacification_time$ = makeSymbol("*PROGRESS-LAST-PACIFICATION-TIME*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $progress_pacifications_since_last_nl$ = makeSymbol("*PROGRESS-PACIFICATIONS-SINCE-LAST-NL*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $progress_elapsed_seconds_for_notification$ = makeSymbol("*PROGRESS-ELAPSED-SECONDS-FOR-NOTIFICATION*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $progress_notification_count$ = makeSymbol("*PROGRESS-NOTIFICATION-COUNT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $progress_count$ = makeSymbol("*PROGRESS-COUNT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $is_noting_progressP$ = makeSymbol("*IS-NOTING-PROGRESS?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $professional_progress_modeP$ = makeSymbol("*PROFESSIONAL-PROGRESS-MODE?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $suppress_all_progress_faster_than_seconds$ = makeSymbol("*SUPPRESS-ALL-PROGRESS-FASTER-THAN-SECONDS*");



    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $noting_progress_start_time$ = makeSymbol("*NOTING-PROGRESS-START-TIME*");

    // defvar
    @LispMethod(comment = "defvar")
    public static final SubLSymbol $last_percent_progress_index$ = makeSymbol("*LAST-PERCENT-PROGRESS-INDEX*");

    // defparameter
    /**
     * Bound to the latest prediction we made about how long the process will take,
     * or NIL if we haven't made such a prediction.
     */
    @LispMethod(comment = "Bound to the latest prediction we made about how long the process will take,\r\nor NIL if we haven\'t made such a prediction.\ndefparameter\nBound to the latest prediction we made about how long the process will take,\nor NIL if we haven\'t made such a prediction.")
    public static final SubLSymbol $last_percent_progress_prediction$ = makeSymbol("*LAST-PERCENT-PROGRESS-PREDICTION*");

    // defvar
    @LispMethod(comment = "defvar")
    public static final SubLSymbol $within_noting_percent_progress$ = makeSymbol("*WITHIN-NOTING-PERCENT-PROGRESS*");

    // defvar
    @LispMethod(comment = "defvar")
    public static final SubLSymbol $percent_progress_start_time$ = makeSymbol("*PERCENT-PROGRESS-START-TIME*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $progress_start_time$ = makeSymbol("*PROGRESS-START-TIME*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $progress_sofar$ = makeSymbol("*PROGRESS-SOFAR*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $util_var_error_format_string$ = makeSymbol("*UTIL-VAR-ERROR-FORMAT-STRING*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $util_func_error_format_string$ = makeSymbol("*UTIL-FUNC-ERROR-FORMAT-STRING*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $util_search_type_error_format_string$ = makeSymbol("*UTIL-SEARCH-TYPE-ERROR-FORMAT-STRING*");

    // deflexical
    // Properties whose values are expressed in 100s of nanoseconds
    /**
     * Properties whose values are expressed in 100s of nanoseconds
     */
    @LispMethod(comment = "Properties whose values are expressed in 100s of nanoseconds\ndeflexical")
    private static final SubLSymbol $process_resource_tracking_100s_of_nanoseconds_properties$ = makeSymbol("*PROCESS-RESOURCE-TRACKING-100S-OF-NANOSECONDS-PROPERTIES*");

    // defparameter
    // Partial results can be accumulated here.
    /**
     * Partial results can be accumulated here.
     */
    @LispMethod(comment = "Partial results can be accumulated here.\ndefparameter")
    public static final SubLSymbol $partial_results_accumulator$ = makeSymbol("*PARTIAL-RESULTS-ACCUMULATOR*");

    // defparameter
    // How many partial results have stacked up.
    /**
     * How many partial results have stacked up.
     */
    @LispMethod(comment = "How many partial results have stacked up.\ndefparameter")
    public static final SubLSymbol $partial_results_size$ = makeSymbol("*PARTIAL-RESULTS-SIZE*");

    // defparameter
    // How many results have been computed altogeher up.
    /**
     * How many results have been computed altogeher up.
     */
    @LispMethod(comment = "How many results have been computed altogeher up.\ndefparameter")
    public static final SubLSymbol $partial_results_total_size$ = makeSymbol("*PARTIAL-RESULTS-TOTAL-SIZE*");

    // defparameter
    // Once the partial results have been notified, they can be added to here.
    /**
     * Once the partial results have been notified, they can be added to here.
     */
    @LispMethod(comment = "Once the partial results have been notified, they can be added to here.\ndefparameter")
    public static final SubLSymbol $partial_results_total_accumulator$ = makeSymbol("*PARTIAL-RESULTS-TOTAL-ACCUMULATOR*");

    // defparameter
    // How the partial results have to be setup.
    /**
     * How the partial results have to be setup.
     */
    @LispMethod(comment = "How the partial results have to be setup.\ndefparameter")
    public static final SubLSymbol $partial_results_initialization_fn$ = makeSymbol("*PARTIAL-RESULTS-INITIALIZATION-FN*");

    // defparameter
    // Who adds a new result to the partial results we already have.
    /**
     * Who adds a new result to the partial results we already have.
     */
    @LispMethod(comment = "Who adds a new result to the partial results we already have.\ndefparameter")
    public static final SubLSymbol $partial_results_accumulation_fn$ = makeSymbol("*PARTIAL-RESULTS-ACCUMULATION-FN*");

    // defparameter
    // Who adds the partial results in the accumulator to the total result set.
    /**
     * Who adds the partial results in the accumulator to the total result set.
     */
    @LispMethod(comment = "Who adds the partial results in the accumulator to the total result set.\ndefparameter")
    public static final SubLSymbol $partial_results_consolidation_fn$ = makeSymbol("*PARTIAL-RESULTS-CONSOLIDATION-FN*");

    // defparameter
    // Who gets the partial results as they become available.
    /**
     * Who gets the partial results as they become available.
     */
    @LispMethod(comment = "Who gets the partial results as they become available.\ndefparameter")
    public static final SubLSymbol $partial_results_notification_fn$ = makeSymbol("*PARTIAL-RESULTS-NOTIFICATION-FN*");

    // defparameter
    // How the partial results will be processed for  usage.
    @LispMethod(comment = "How the partial results will be processed for final usage.\ndefparameter\nHow the partial results will be processed for  usage.")
    /**
     * How the partial results will be processed for final usage.
     */
    public static final SubLSymbol $partial_results_final_result_fn$ = makeSymbol("*PARTIAL-RESULTS-FINAL-RESULT-FN*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $accumulating_partial_resultsP$ = makeSymbol("*ACCUMULATING-PARTIAL-RESULTS?*");

    // defconstant
    /**
     * The number of bits used in the internal integer computations done by
     * sxhash-external.
     */
    @LispMethod(comment = "The number of bits used in the internal integer computations done by\r\nsxhash-external.\ndefconstant\nThe number of bits used in the internal integer computations done by\nsxhash-external.")
    public static final SubLSymbol $sxhash_bit_limit$ = makeSymbol("*SXHASH-BIT-LIMIT*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $sxhash_update_state_vector$ = makeSymbol("*SXHASH-UPDATE-STATE-VECTOR*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $sxhash_composite_state$ = makeSymbol("*SXHASH-COMPOSITE-STATE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeSymbol("NAME"), makeSymbol("ARGLIST"), makeSymbol("DOCUMENTATION-STRING"), makeSymbol("TYPE-DECLARATIONS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol REGISTER_CYC_API_FUNCTION = makeSymbol("REGISTER-CYC-API-FUNCTION");

    static private final SubLList $list7 = list(makeSymbol("NAME"), makeSymbol("ARGLIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list8 = list(makeSymbol("DOCUMENTATION-STRING"), makeSymbol("TYPE-DECLARATIONS"));

    static private final SubLList $list9 = list(makeSymbol("NAME"), makeSymbol("PATTERN"), makeSymbol("DOCUMENTATION-STRING"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol DEFMACRO_PUBLIC = makeSymbol("DEFMACRO-PUBLIC");

    private static final SubLSymbol REGISTER_CYC_API_MACRO = makeSymbol("REGISTER-CYC-API-MACRO");

    private static final SubLSymbol DEFINE_EXTERNAL = makeSymbol("DEFINE-EXTERNAL");

    static private final SubLList $list13 = list(makeSymbol("NAME"), makeSymbol("PATTERN"), makeSymbol("DOCUMENTATION-STRING"), makeSymbol("TYPE-DECLARATIONS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol REGISTER_EXTERNAL_SYMBOL = makeSymbol("REGISTER-EXTERNAL-SYMBOL");

    public static final SubLSymbol $api_special_table$ = makeSymbol("*API-SPECIAL-TABLE*");

    static private final SubLString $str16$Registering__A_as_special_even_th = makeString("Registering ~A as special even though it's already predefined!");

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

    static private final SubLList $list52 = list(makeSymbol("OBJECT"));

    private static final SubLList $list53 = list(makeSymbol("SUBL-ESCAPE-P"), makeSymbol("OBJECT"));

    static private final SubLList $list55 = list(list(makeSymbol("SUBL-ESCAPE-SUBL"), makeSymbol("OBJECT")));

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

    static private final SubLList $list82 = list(makeSymbol("LOCK"), makeSymbol("ACTION"), makeSymbol("&OPTIONAL"), makeSymbol("ELSE-ACTION"));

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

    static private final SubLList $list149 = list(list(makeSymbol("*NODES-ACCESSOR-FN*"), list(makeSymbol("FIF"), list(makeSymbol("FUNCTION-SPEC-P"), makeSymbol("*NODES-ACCESSOR-FN*")), makeSymbol("*NODES-ACCESSOR-FN*"), list(makeSymbol("FUNCTION"), makeSymbol("ALL-ASSERTION-TERMS")))), list(makeSymbol("*PATH-LINK-OP*"), list(makeSymbol("FIF"), list(makeSymbol("FUNCTION-SPEC-P"), makeSymbol("*PATH-LINK-OP*")), makeSymbol("*PATH-LINK-OP*"), list(makeSymbol("FUNCTION"), makeSymbol("DEFAULT-LINK-OP")))), list(makeSymbol("*PATH-NODE-OP*"), list(makeSymbol("FIF"), list(makeSymbol("FUNCTION-SPEC-P"), makeSymbol("*PATH-NODE-OP*")), makeSymbol("*PATH-NODE-OP*"), list(makeSymbol("FUNCTION"), makeSymbol("DEFAULT-NODE-OP")))), list(makeSymbol("*RELEVANT-LINK?*"), list(makeSymbol("FIF"), list(makeSymbol("FUNCTION-SPEC-P"), makeSymbol("*RELEVANT-LINK?*")), makeSymbol("*RELEVANT-LINK?*"), list(makeSymbol("FUNCTION"), makeSymbol("DEFAULT-RELEVANT-LINK?")))), list(makeSymbol("*RELEVANT-NODE?*"), list(makeSymbol("FIF"), list(makeSymbol("FUNCTION-SPEC-P"), makeSymbol("*RELEVANT-NODE?*")), makeSymbol("*RELEVANT-NODE?*"), list(makeSymbol("FUNCTION"), makeSymbol("DEFAULT-RELEVANT-NODE?")))), list(makeSymbol("*RELEVANT-LINK-TREE?*"), list(makeSymbol("FIF"), list(makeSymbol("FUNCTION-SPEC-P"), makeSymbol("*RELEVANT-LINK-TREE?*")), makeSymbol("*RELEVANT-LINK-TREE?*"), list(makeSymbol("FUNCTION"), makeSymbol("DEFAULT-RELEVANT-LINK-TREE?")))));

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

    static private final SubLList $list166 = list(list(makeSymbol("*WITHIN-ASSERTION-FORWARD-PROPAGATION?*"), NIL), list(makeSymbol("*PREFER-FORWARD-SKOLEMIZATION*"), NIL));

    private static final SubLSymbol WITH_NORMAL_FORWARD_INFERENCE_PARAMETERS = makeSymbol("WITH-NORMAL-FORWARD-INFERENCE-PARAMETERS");

    private static final SubLSymbol WITH_CLEAN_FORWARD_INFERENCE_ENVIRONMENT = makeSymbol("WITH-CLEAN-FORWARD-INFERENCE-ENVIRONMENT");

    private static final SubLSymbol WITH_CLEAN_FORWARD_PROBLEM_STORE_ENVIRONMENT = makeSymbol("WITH-CLEAN-FORWARD-PROBLEM-STORE-ENVIRONMENT");

    private static final SubLSymbol $sym170$ERROR = makeUninternedSymbol("ERROR");

    private static final SubLList $list172 = list(list(makeSymbol("THROW-UNEVALUATABLE")));

    static private final SubLList $list173 = list(list(makeSymbol("TRACEE"), makeSymbol("LEVEL")), makeSymbol("&BODY"), makeSymbol("BODY"));

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

    private static final SubLList $list199 = list(list(RET, makeSymbol("OBJECT")));

    private static final SubLList $list201 = list($FREE);

    public static final SubLSymbol $structure_resourcing_enabled$ = makeSymbol("*STRUCTURE-RESOURCING-ENABLED*");

    private static final SubLList $list205 = list(list(RET, T));

    static private final SubLList $list206 = list(list(RET, NIL));

    static private final SubLList $list207 = list(makeSymbol("OBJECT"), makeSymbol("FOUND"));

    private static final SubLList $list209 = list(list(makeSymbol("COR"), makeSymbol("FOUND"), list(makeSymbol("NULL"), makeSymbol("OBJECT"))));

    static private final SubLList $list210 = list(list(makeSymbol("CSETQ"), makeSymbol("FOUND"), T));

    private static final SubLList $list212 = list(NIL);

    static private final SubLList $list213 = list(list(makeSymbol("*READ-EVAL*"), NIL));

    static private final SubLList $list214 = list(makeSymbol("STRING"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym215$STR = makeUninternedSymbol("STR");

    private static final SubLList $list216 = list(makeSymbol("*PROGRESS-START-TIME*"), list(makeSymbol("GET-UNIVERSAL-TIME")));

    static private final SubLList $list217 = list(makeSymbol("*PROGRESS-LAST-PACIFICATION-TIME*"), makeSymbol("*PROGRESS-START-TIME*"));

    private static final SubLList $list218 = list(makeSymbol("*PROGRESS-ELAPSED-SECONDS-FOR-NOTIFICATION*"), makeSymbol("*SUPPRESS-ALL-PROGRESS-FASTER-THAN-SECONDS*"));

    private static final SubLList $list219 = list(makeSymbol("*PROGRESS-NOTIFICATION-COUNT*"), ZERO_INTEGER);

    private static final SubLList $list220 = list(makeSymbol("*PROGRESS-PACIFICATIONS-SINCE-LAST-NL*"), ZERO_INTEGER);

    private static final SubLList $list221 = list(makeSymbol("*PROGRESS-COUNT*"), ZERO_INTEGER);

    private static final SubLList $list222 = list(makeSymbol("*IS-NOTING-PROGRESS?*"), T);

    public static final SubLSymbol $silent_progressP$ = makeSymbol("*SILENT-PROGRESS?*");

    static private final SubLList $list225 = list(makeSymbol("*SILENT-PROGRESS?*"), T);

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





    private static final SubLString $str246$__A_ = makeString("(~A)");

    private static final SubLString $str247$_ = makeString(".");

    private static final SubLList $list249 = list(list(makeSymbol("*LAST-PERCENT-PROGRESS-INDEX*"), ZERO_INTEGER), list(makeSymbol("*LAST-PERCENT-PROGRESS-PREDICTION*"), NIL), list(makeSymbol("*WITHIN-NOTING-PERCENT-PROGRESS*"), T), list(makeSymbol("*PERCENT-PROGRESS-START-TIME*"), list(makeSymbol("GET-UNIVERSAL-TIME"))));

    private static final SubLSymbol NOTING_PERCENT_PROGRESS_PREAMBLE = makeSymbol("NOTING-PERCENT-PROGRESS-PREAMBLE");

    static private final SubLList $list251 = list(list(makeSymbol("NOTING-PERCENT-PROGRESS-POSTAMBLE")));

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

    static private final SubLList $list279 = list(list(makeSymbol("*PROGRESS-SOFAR*"), ZERO_INTEGER));

    private static final SubLList $list281 = list(makeSymbol("*PROGRESS-TOTAL*"));

    private static final SubLList $list282 = list(list(makeSymbol("CINC"), makeSymbol("*PROGRESS-SOFAR*")), list(makeSymbol("NOTE-PERCENT-PROGRESS"), makeSymbol("*PROGRESS-SOFAR*"), makeSymbol("*PROGRESS-TOTAL*")));

    private static final SubLList $list283 = list(list(makeSymbol("VAR"), makeSymbol("LIST"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("cdolist")), makeSymbol("ENDVAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLSymbol $sym285$LIST_VAR = makeUninternedSymbol("LIST-VAR");

    private static final SubLList $list286 = list(makeString("cdolist"));

    private static final SubLSymbol PROGRESS_CDOLIST = makeSymbol("PROGRESS-CDOLIST");

    static private final SubLList $list290 = list(list(makeSymbol("VAR"), makeSymbol("LIST"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("cdolist"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol PROGRESS_CSOME = makeSymbol("PROGRESS-CSOME");

    static private final SubLList $list292 = list(list(makeSymbol("VAR"), makeSymbol("LIST"), makeSymbol("&OPTIONAL"), makeSymbol("MESSAGE")), makeSymbol("&BODY"), makeSymbol("BODY"));

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

    private static final SubLList $list316 = list(list(makeSymbol("*PACKAGE*"), list(makeSymbol("FIND-PACKAGE"), makeString("CYC"))), list(makeSymbol("*READ-DEFAULT-FLOAT-FORMAT*"), list(QUOTE, makeSymbol("DOUBLE-FLOAT"))), list(makeSymbol("*PRINT-READABLY*"), NIL), list(makeSymbol("*READ-EVAL*"), NIL), list(makeSymbol("OLD-PRIORITY"), list(makeSymbol("PROCESS-PRIORITY"), list(makeSymbol("CURRENT-PROCESS")))));

    static private final SubLList $list317 = list(makeSymbol("SET-PROCESS-PRIORITY"), list(makeSymbol("CURRENT-PROCESS")), makeSymbol("*PROCESS-NORMAL-PRIORITY*"));

    private static final SubLList $list318 = list(list(makeSymbol("SET-PROCESS-PRIORITY"), list(makeSymbol("CURRENT-PROCESS")), makeSymbol("OLD-PRIORITY")));

    private static final SubLList $list319 = list(list(makeSymbol("*PACKAGE*"), list(makeSymbol("FIND-PACKAGE"), makeString("CYC"))), list(makeSymbol("*PRINT-READABLY*"), NIL), list(makeSymbol("*READ-EVAL*"), NIL));

    private static final SubLSymbol WITH_CYC_SERVER_HANDLING = makeSymbol("WITH-CYC-SERVER-HANDLING");

    private static final SubLSymbol WITH_CYC_IO_SYNTAX = makeSymbol("WITH-CYC-IO-SYNTAX");

    private static final SubLList $list322 = list(list(makeSymbol("*READ-DEFAULT-FLOAT-FORMAT*"), list(QUOTE, makeSymbol("DOUBLE-FLOAT"))));

    private static final SubLList $list323 = list(list(makeSymbol("CYCLIST")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym324$OLD_CYCLIST = makeUninternedSymbol("OLD-CYCLIST");

    static private final SubLList $list325 = list(list(makeSymbol("THE-CYCLIST")));

    private static final SubLSymbol SET_THE_CYCLIST = makeSymbol("SET-THE-CYCLIST");

    private static final SubLList $list327 = list(list(makeSymbol("*THE-CYCLIST*"), NIL));

    static private final SubLList $list328 = list(makeSymbol("EL-VARIABLES"), makeSymbol("BINDINGS"), makeSymbol("&BODY"), makeSymbol("BODY"));

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

    static private final SubLList $list354 = list(list(makeSymbol("VAR"), makeSymbol("TREE"), makeSymbol("&OPTIONAL"), list(makeSymbol("SEARCH-TYPE"), makeKeyword("DEPTH-FIRST")), list(makeSymbol("VISIT-NILS"), NIL)), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol CDOTREE = makeSymbol("CDOTREE");

    private static final SubLString $str358$tree_var = makeString("tree-var");

    private static final SubLString $str359$cells_var = makeString("cells-var");

    private static final SubLString $str360$tail_of_cells = makeString("tail-of-cells");

    static private final SubLList $list365 = list(list(makeSymbol("VAR"), makeSymbol("TREE"), makeSymbol("&OPTIONAL"), list(makeSymbol("SEARCH-TYPE"), makeKeyword("DEPTH-FIRST"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol CDOTREE_CONSES = makeSymbol("CDOTREE-CONSES");

    private static final SubLString $str367$tail_of_cells_var = makeString("tail-of-cells-var");

    static private final SubLList $list368 = list(list(makeSymbol("PARAMETER"), makeSymbol("VALUE"), makeSymbol("PLIST")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol DO_PLIST = makeSymbol("DO-PLIST");

    private static final SubLList $list374 = list(makeSymbol("PATTERN"), makeSymbol("DATUM"));

    private static final SubLString $str375$datum_evaluated_var = makeString("datum-evaluated-var");

    private static final SubLString $str377$FAST_FUNCALL_NO_VALUE__contains_e = makeString("FAST-FUNCALL-NO-VALUE: contains erroneous function name it its function name list.");

    private static final SubLString $str378$FAST_FUNCALL_NO_VALUE__cannot_acc = makeString("FAST-FUNCALL-NO-VALUE: cannot accept dotted list for its function name list.");

    private static final SubLString $str379$FAST_FUNCALL_NO_VALUE__function_n = makeString("FAST-FUNCALL-NO-VALUE: function name list must be a list.");

    private static final SubLList $list380 = list(makeSymbol("FUNCTION-FORM"), makeSymbol("FUNCTION-NAME-LIST"), makeSymbol("&REST"), makeSymbol("ARGS"));

    private static final SubLString $str382$function_form_evaluated_var = makeString("function-form-evaluated-var");

    private static final SubLList $list385 = list(makeSymbol("VAR-TO-SET"), makeSymbol("FUNCTION-FORM"), makeSymbol("FUNCTION-NAME-LIST"), makeSymbol("&REST"), makeSymbol("ARGS"));

    static private final SubLList $list386 = list(makeSymbol("VARS-TO-BIND"), listS(makeSymbol("FUNCTION-FORM"), makeSymbol("FUNCTION-NAME-LIST"), makeSymbol("ARGS")), makeSymbol("&BODY"), makeSymbol("BODY"));

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

    private static final SubLList $list407 = list(makeSymbol("PUNLESS"), list(makeSymbol("LISTP"), makeSymbol("LIST")), list(RET, NIL));

    private static final SubLSymbol $NOT_EMPTY_ALL = makeKeyword("NOT-EMPTY-ALL");

    private static final SubLList $list409 = list(makeSymbol("PUNLESS"), list(makeSymbol("CONSP"), makeSymbol("LIST")), list(RET, NIL));

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

    static private final SubLList $list423 = list(makeSymbol("VALUE"), makeSymbol("&BODY"), makeSymbol("CLAUSES"));

    private static final SubLString $str425$Invalid_version_code__A_ = makeString("Invalid version code ~A.");

    private static final SubLList $list426 = list(list(makeSymbol("VERSION")), makeSymbol("VERSION-BODIES"), makeSymbol("&KEY"), makeSymbol("ERROR-CLAUSE"));

    private static final SubLList $list427 = list(makeKeyword("ERROR-CLAUSE"));

    private static final SubLList $list429 = list(makeSymbol("VERSION"), makeSymbol("FORM"));

    static private final SubLList $list430 = list(list(makeSymbol("MAJOR"), makeSymbol("MINOR")), makeSymbol("VERSION-BODIES"), makeSymbol("&KEY"), makeSymbol("ERROR-CLAUSE"));

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

    static private final SubLList $list455 = list(makeSymbol("VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));

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

    static private final SubLList $list483 = list(makeSymbol("PLIST"), makeSymbol("PRED"));

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

    static private final SubLList $list500 = list(makeSymbol("PLACE1"), makeSymbol("PLACE2"));

    private static final SubLSymbol $sym501$SWAP_VAR = makeUninternedSymbol("SWAP-VAR");

    private static final SubLList $list502 = list(makeSymbol("VARIABLE"), list(makeSymbol("&KEY"), makeSymbol("DOCUMENTATION"), makeSymbol("DEFINER"), makeSymbol("ACCESS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list503 = list(makeKeyword("DOCUMENTATION"), makeKeyword("DEFINER"), makeKeyword("ACCESS"));

    private static final SubLString $str506$_A_INITIALIZER = makeString("~A-INITIALIZER");

    private static final SubLSymbol REGISTER_KB_VARIABLE_INITIALIZATION = makeSymbol("REGISTER-KB-VARIABLE-INITIALIZATION");

    private static final SubLSymbol $kb_var_initializations$ = makeSymbol("*KB-VAR-INITIALIZATIONS*");

    private static final SubLSymbol DEF_KB_VARIABLE = makeSymbol("DEF-KB-VARIABLE");

    private static final SubLString $$$Initializing_KB_variables = makeString("Initializing KB variables");

    static private final SubLList $list513 = cons(makeSymbol("VAR-SYMBOL"), makeSymbol("FUNC"));

    static private final SubLList $list514 = list(makeSymbol("GETTER"), makeSymbol("INITIALIZATION-FORM"), makeSymbol("&KEY"), makeSymbol("VAR"), list(makeSymbol("VACCESS"), list(QUOTE, makeSymbol("PRIVATE"))), list(makeSymbol("FACCESS"), list(QUOTE, makeSymbol("PRIVATE"))), makeSymbol("DOCUMENTATION"));

    static private final SubLList $list515 = list(makeKeyword("VAR"), makeKeyword("VACCESS"), makeKeyword("FACCESS"), makeKeyword("DOCUMENTATION"));

    private static final SubLString $str519$_ = makeString("*");

    private static final SubLString $str520$Invalid_function_name__A___The_fi = makeString("Invalid function-name ~A.  The first arg of DEFPARAMETER-LAZY is the getter function, not the variable name.");

    private static final SubLSymbol $sym521$INIT_VALUE = makeUninternedSymbol("INIT-VALUE");

    static private final SubLList $list523 = list(makeKeyword("UNINITIALIZED"));

    private static final SubLString $str524$Unable_to_initialize__A__ = makeString("Unable to initialize ~A~%");

    private static final SubLString $str525$Invalid_function_name__A___The_fi = makeString("Invalid function-name ~A.  The first arg of DEFVAR-LAZY is the getter function, not the variable name.");

    private static final SubLSymbol $sym526$INIT_VALUE = makeUninternedSymbol("INIT-VALUE");

    private static final SubLString $str527$Invalid_function_name__A___The_fi = makeString("Invalid function-name ~A.  The first arg of DEFGLOBAL-LAZY is the getter function, not the variable name.");

    private static final SubLSymbol $sym528$INIT_VALUE = makeUninternedSymbol("INIT-VALUE");

    private static final SubLString $str529$Invalid_function_name__A___The_fi = makeString("Invalid function-name ~A.  The first arg of DEFLEXICAL-LAZY is the getter function, not the variable name.");

    private static final SubLSymbol $sym530$INIT_VALUE = makeUninternedSymbol("INIT-VALUE");

    static private final SubLList $list531 = list(makeSymbol("NAME"), makeSymbol("ARGLIST"), makeSymbol("DOCUMENTATION-STRING"), makeSymbol("DECLARATIONS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol REGISTER_OBSOLETE_CYC_API_FUNCTION = makeSymbol("REGISTER-OBSOLETE-CYC-API-FUNCTION");

    private static final SubLSymbol $OBSOLETE_CYC_API_REPLACEMENTS = makeKeyword("OBSOLETE-CYC-API-REPLACEMENTS");



    private static final SubLSymbol INITIALIZATION_FOR_PARTIAL_LIST_RESULTS = makeSymbol("INITIALIZATION-FOR-PARTIAL-LIST-RESULTS");

    private static final SubLSymbol ACCUMULATION_FOR_PARTIAL_LIST_RESULTS = makeSymbol("ACCUMULATION-FOR-PARTIAL-LIST-RESULTS");

    private static final SubLSymbol CONSOLIDATION_FOR_PARTIAL_LIST_RESULTS = makeSymbol("CONSOLIDATION-FOR-PARTIAL-LIST-RESULTS");

    private static final SubLSymbol NOTIFICATION_FOR_PARTIAL_LIST_RESULTS = makeSymbol("NOTIFICATION-FOR-PARTIAL-LIST-RESULTS");

    private static final SubLSymbol FINAL_RESULTS_FOR_PARTIAL_LIST_RESULTS = makeSymbol("FINAL-RESULTS-FOR-PARTIAL-LIST-RESULTS");

    private static final SubLList $list540 = list(list(makeSymbol("FINAL-RESULT-VAR"), makeSymbol("THRESHOLD")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list541 = list(makeSymbol("*PARTIAL-RESULTS-ACCUMULATOR*"), list(makeSymbol("FUNCALL"), makeSymbol("*PARTIAL-RESULTS-INITIALIZATION-FN*")));

    private static final SubLList $list542 = list(makeSymbol("*PARTIAL-RESULTS-TOTAL-ACCUMULATOR*"), list(makeSymbol("FUNCALL"), makeSymbol("*PARTIAL-RESULTS-INITIALIZATION-FN*")));

    public static final SubLSymbol $partial_results_threshold$ = makeSymbol("*PARTIAL-RESULTS-THRESHOLD*");

    static private final SubLList $list544 = list(list(makeSymbol("*PARTIAL-RESULTS-SIZE*"), ZERO_INTEGER), list(makeSymbol("*PARTIAL-RESULTS-TOTAL-SIZE*"), ZERO_INTEGER), list(makeSymbol("*ACCUMULATING-PARTIAL-RESULTS?*"), T));

    private static final SubLList $list545 = list(makeSymbol("FUNCALL"), makeSymbol("*PARTIAL-RESULTS-CONSOLIDATION-FN*"), makeSymbol("*PARTIAL-RESULTS-ACCUMULATOR*"));

    static private final SubLList $list546 = list(list(makeSymbol("FUNCALL"), makeSymbol("*PARTIAL-RESULTS-FINAL-RESULT-FN*"), makeSymbol("*PARTIAL-RESULTS-TOTAL-ACCUMULATOR*")));

    private static final SubLSymbol WITH_SPACE_PROFILING_TO_STRING = makeSymbol("WITH-SPACE-PROFILING-TO-STRING");

    private static final SubLList $list548 = list(list(makeSymbol("STRING-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym549$STREAM = makeUninternedSymbol("STREAM");

    private static final SubLSymbol WITH_SPACE_PROFILING = makeSymbol("WITH-SPACE-PROFILING");

    private static final SubLList $list553 = list(list(makeSymbol("RESULT-VAR"), makeSymbol("&KEY"), list(makeSymbol("INITIAL-VALUE"), ZERO_INTEGER)), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list554 = list(makeKeyword("INITIAL-VALUE"));

    static private final SubLList $list556 = list(makeSymbol("*SXHASH-COMPOSITE-STATE*"), FOUR_INTEGER);

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



    private static final SubLObject $ic569 = vector(new SubLObject[]{ SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER, ELEVEN_INTEGER, TWELVE_INTEGER, THIRTEEN_INTEGER, FOURTEEN_INTEGER, FIFTEEN_INTEGER, SIXTEEN_INTEGER, SEVENTEEN_INTEGER, EIGHTEEN_INTEGER, NINETEEN_INTEGER, TWENTY_INTEGER, makeInteger(21), makeInteger(22), makeInteger(23), makeInteger(24), makeInteger(25), makeInteger(26), makeInteger(27), makeInteger(28), makeInteger(29), makeInteger(30), makeInteger(31), ZERO_INTEGER, ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER });

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

    // Definitions
    /**
     * define NAME as a (public) Cyc API function.
     * Cyc API functions provide the external interface to Cyc, and can
     * be called by the Cyc API server.
     * The DOCUMENTATION-STRING is required, and is used in generating
     * the Cyc API documentation.
     * TYPE-DECLARATIONS is a form having :argument-types and :return-types as keywords:
     * ((:argument-types
     * (arg-name-1 type-predicate)
     * ...
     * (arg-name-n type-predicate))
     * (:return-types type-predicate))
     *
     * :return-types can declare multiple values as well as compositions:
     * (:return-types (list assertion-p) fixnump)
     * which declares the function returns two values, the first value is a list
     * of assertions, and the second value satisfies the fixnump predicate.
     */
    @LispMethod(comment = "define NAME as a (public) Cyc API function.\r\nCyc API functions provide the external interface to Cyc, and can\r\nbe called by the Cyc API server.\r\nThe DOCUMENTATION-STRING is required, and is used in generating\r\nthe Cyc API documentation.\r\nTYPE-DECLARATIONS is a form having :argument-types and :return-types as keywords:\r\n((:argument-types\r\n(arg-name-1 type-predicate)\r\n...\r\n(arg-name-n type-predicate))\r\n(:return-types type-predicate))\r\n\r\n:return-types can declare multiple values as well as compositions:\r\n(:return-types (list assertion-p) fixnump)\r\nwhich declares the function returns two values, the first value is a list\r\nof assertions, and the second value satisfies the fixnump predicate.\ndefine NAME as a (public) Cyc API function.\nCyc API functions provide the external interface to Cyc, and can\nbe called by the Cyc API server.\nThe DOCUMENTATION-STRING is required, and is used in generating\nthe Cyc API documentation.\nTYPE-DECLARATIONS is a form having :argument-types and :return-types as keywords:\n((:argument-types\n(arg-name-1 type-predicate)\n...\n(arg-name-n type-predicate))\n(:return-types type-predicate))\n\n:return-types can declare multiple values as well as compositions:\n(:return-types (list assertion-p) fixnump)\nwhich declares the function returns two values, the first value is a list\nof assertions, and the second value satisfies the fixnump predicate.")
    public static final SubLObject define_api_alt(SubLObject macroform, SubLObject environment) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = macroform.rest();
                SubLObject current = datum;
                SubLObject name = NIL;
                SubLObject arglist = NIL;
                SubLObject documentation_string = NIL;
                SubLObject type_declarations = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt0);
                name = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt0);
                arglist = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt0);
                documentation_string = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt0);
                type_declarations = current.first();
                current = current.rest();
                {
                    SubLObject body = current;
                    SubLTrampolineFile.checkType(documentation_string, STRINGP);
                    SubLTrampolineFile.checkType(type_declarations, LISTP);
                    thread.resetMultipleValues();
                    {
                        SubLObject argument_types = parse_api_type_declarations(type_declarations);
                        SubLObject body_preamble = thread.secondMultipleValue();
                        SubLObject return_types = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        return list(PROGN, listS(DEFINE_PUBLIC, name, arglist, documentation_string, append(body_preamble, body, NIL)), list(REGISTER_CYC_API_FUNCTION, list(QUOTE, name), list(QUOTE, arglist), documentation_string, list(QUOTE, argument_types), list(QUOTE, return_types)));
                    }
                }
            }
        }
    }

    // Definitions
    /**
     * define NAME as a (public) Cyc API function.
     * Cyc API functions provide the external interface to Cyc, and can
     * be called by the Cyc API server.
     * The DOCUMENTATION-STRING is required, and is used in generating
     * the Cyc API documentation.
     * TYPE-DECLARATIONS is a form having :argument-types and :return-types as keywords:
     * ((:argument-types
     * (arg-name-1 type-predicate)
     * ...
     * (arg-name-n type-predicate))
     * (:return-types type-predicate))
     *
     * :return-types can declare multiple values as well as compositions:
     * (:return-types (list assertion-p) fixnump)
     * which declares the function returns two values, the first value is a list
     * of assertions, and the second value satisfies the fixnump predicate.
     */
    @LispMethod(comment = "define NAME as a (public) Cyc API function.\r\nCyc API functions provide the external interface to Cyc, and can\r\nbe called by the Cyc API server.\r\nThe DOCUMENTATION-STRING is required, and is used in generating\r\nthe Cyc API documentation.\r\nTYPE-DECLARATIONS is a form having :argument-types and :return-types as keywords:\r\n((:argument-types\r\n(arg-name-1 type-predicate)\r\n...\r\n(arg-name-n type-predicate))\r\n(:return-types type-predicate))\r\n\r\n:return-types can declare multiple values as well as compositions:\r\n(:return-types (list assertion-p) fixnump)\r\nwhich declares the function returns two values, the first value is a list\r\nof assertions, and the second value satisfies the fixnump predicate.\ndefine NAME as a (public) Cyc API function.\nCyc API functions provide the external interface to Cyc, and can\nbe called by the Cyc API server.\nThe DOCUMENTATION-STRING is required, and is used in generating\nthe Cyc API documentation.\nTYPE-DECLARATIONS is a form having :argument-types and :return-types as keywords:\n((:argument-types\n(arg-name-1 type-predicate)\n...\n(arg-name-n type-predicate))\n(:return-types type-predicate))\n\n:return-types can declare multiple values as well as compositions:\n(:return-types (list assertion-p) fixnump)\nwhich declares the function returns two values, the first value is a list\nof assertions, and the second value satisfies the fixnump predicate.")
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
        assert NIL != stringp(documentation_string) : "! stringp(documentation_string) " + ("Types.stringp(documentation_string) " + "CommonSymbols.NIL != Types.stringp(documentation_string) ") + documentation_string;
        assert NIL != listp(type_declarations) : "! listp(type_declarations) " + ("Types.listp(type_declarations) " + "CommonSymbols.NIL != Types.listp(type_declarations) ") + type_declarations;
        thread.resetMultipleValues();
        final SubLObject argument_types = parse_api_type_declarations(type_declarations);
        final SubLObject body_preamble = thread.secondMultipleValue();
        final SubLObject return_types = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return list(PROGN, listS(DEFINE_PUBLIC, name, arglist, documentation_string, append(body_preamble, body, NIL)), list(REGISTER_CYC_API_FUNCTION, list(QUOTE, name), list(QUOTE, arglist), documentation_string, list(QUOTE, argument_types), list(QUOTE, return_types)));
    }

    /**
     * Like DEFINE-API for functions defined through other means.
     */
    @LispMethod(comment = "Like DEFINE-API for functions defined through other means.")
    public static final SubLObject declare_api_function_alt(SubLObject macroform, SubLObject environment) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = macroform.rest();
                SubLObject current = datum;
                SubLObject name = NIL;
                SubLObject arglist = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt7);
                name = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt7);
                arglist = current.first();
                current = current.rest();
                {
                    SubLObject body = current;
                    SubLObject datum_1 = body;
                    SubLObject current_2 = datum_1;
                    SubLObject documentation_string = NIL;
                    SubLObject type_declarations = NIL;
                    destructuring_bind_must_consp(current_2, datum_1, $list_alt8);
                    documentation_string = current_2.first();
                    current_2 = current_2.rest();
                    destructuring_bind_must_consp(current_2, datum_1, $list_alt8);
                    type_declarations = current_2.first();
                    current_2 = current_2.rest();
                    if (NIL == current_2) {
                        SubLTrampolineFile.checkType(documentation_string, STRINGP);
                        SubLTrampolineFile.checkType(type_declarations, LISTP);
                        thread.resetMultipleValues();
                        {
                            SubLObject argument_types = parse_api_type_declarations(type_declarations);
                            SubLObject body_preamble = thread.secondMultipleValue();
                            SubLObject return_types = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            return list(REGISTER_CYC_API_FUNCTION, list(QUOTE, name), list(QUOTE, arglist), documentation_string, list(QUOTE, argument_types), list(QUOTE, return_types));
                        }
                    } else {
                        cdestructuring_bind_error(datum_1, $list_alt8);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Like DEFINE-API for functions defined through other means.
     */
    @LispMethod(comment = "Like DEFINE-API for functions defined through other means.")
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
        assert NIL != stringp(documentation_string) : "! stringp(documentation_string) " + ("Types.stringp(documentation_string) " + "CommonSymbols.NIL != Types.stringp(documentation_string) ") + documentation_string;
        assert NIL != listp(type_declarations) : "! listp(type_declarations) " + ("Types.listp(type_declarations) " + "CommonSymbols.NIL != Types.listp(type_declarations) ") + type_declarations;
        thread.resetMultipleValues();
        final SubLObject argument_types = parse_api_type_declarations(type_declarations);
        final SubLObject body_preamble = thread.secondMultipleValue();
        final SubLObject return_types = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return list(REGISTER_CYC_API_FUNCTION, list(QUOTE, name), list(QUOTE, arglist), documentation_string, list(QUOTE, argument_types), list(QUOTE, return_types));
    }

    /**
     * define NAME as a (public) Cyc API macro.
     * Cyc API macros are part of the external interface to Cyc, and can
     * be called by the Cyc API server.
     * The DOCUMENTATION-STRING is required, and is used in generating
     * the Cyc API documentation.
     */
    @LispMethod(comment = "define NAME as a (public) Cyc API macro.\r\nCyc API macros are part of the external interface to Cyc, and can\r\nbe called by the Cyc API server.\r\nThe DOCUMENTATION-STRING is required, and is used in generating\r\nthe Cyc API documentation.\ndefine NAME as a (public) Cyc API macro.\nCyc API macros are part of the external interface to Cyc, and can\nbe called by the Cyc API server.\nThe DOCUMENTATION-STRING is required, and is used in generating\nthe Cyc API documentation.")
    public static final SubLObject defmacro_api_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            SubLObject pattern = NIL;
            SubLObject documentation_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt9);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt9);
            pattern = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt9);
            documentation_string = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLTrampolineFile.checkType(documentation_string, STRINGP);
                return list(PROGN, listS(DEFMACRO_PUBLIC, name, pattern, documentation_string, append(body, NIL)), list(REGISTER_CYC_API_MACRO, list(QUOTE, name), list(QUOTE, pattern), documentation_string));
            }
        }
    }

    /**
     * define NAME as a (public) Cyc API macro.
     * Cyc API macros are part of the external interface to Cyc, and can
     * be called by the Cyc API server.
     * The DOCUMENTATION-STRING is required, and is used in generating
     * the Cyc API documentation.
     */
    @LispMethod(comment = "define NAME as a (public) Cyc API macro.\r\nCyc API macros are part of the external interface to Cyc, and can\r\nbe called by the Cyc API server.\r\nThe DOCUMENTATION-STRING is required, and is used in generating\r\nthe Cyc API documentation.\ndefine NAME as a (public) Cyc API macro.\nCyc API macros are part of the external interface to Cyc, and can\nbe called by the Cyc API server.\nThe DOCUMENTATION-STRING is required, and is used in generating\nthe Cyc API documentation.")
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
        assert NIL != stringp(documentation_string) : "! stringp(documentation_string) " + ("Types.stringp(documentation_string) " + "CommonSymbols.NIL != Types.stringp(documentation_string) ") + documentation_string;
        return list(PROGN, listS(DEFMACRO_PUBLIC, name, pattern, documentation_string, append(body, NIL)), list(REGISTER_CYC_API_MACRO, list(QUOTE, name), list(QUOTE, pattern), documentation_string));
    }

    /**
     * define NAME as a public function that can be called by NAME from code outside
     * of the SubL code base but is not yet part of the formal API (use define-api for that)
     *
     * @unknown currently just a marker interface
     */
    @LispMethod(comment = "define NAME as a public function that can be called by NAME from code outside\r\nof the SubL code base but is not yet part of the formal API (use define-api for that)\r\n\r\n@unknown currently just a marker interface\ndefine NAME as a public function that can be called by NAME from code outside\nof the SubL code base but is not yet part of the formal API (use define-api for that)")
    public static final SubLObject define_api_provisional_alt(SubLObject macroform, SubLObject environment) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = macroform.rest();
                SubLObject current = datum;
                SubLObject name = NIL;
                SubLObject arglist = NIL;
                SubLObject documentation_string = NIL;
                SubLObject type_declarations = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt0);
                name = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt0);
                arglist = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt0);
                documentation_string = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt0);
                type_declarations = current.first();
                current = current.rest();
                {
                    SubLObject body = current;
                    SubLTrampolineFile.checkType(documentation_string, STRINGP);
                    SubLTrampolineFile.checkType(type_declarations, LISTP);
                    thread.resetMultipleValues();
                    {
                        SubLObject argument_types = parse_api_type_declarations(type_declarations);
                        SubLObject body_preamble = thread.secondMultipleValue();
                        SubLObject return_types = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        return list(PROGN, listS(DEFINE_EXTERNAL, name, arglist, documentation_string, append(body_preamble, body, NIL)));
                    }
                }
            }
        }
    }

    /**
     * define NAME as a public function that can be called by NAME from code outside
     * of the SubL code base but is not yet part of the formal API (use define-api for that)
     *
     * @unknown currently just a marker interface
     */
    @LispMethod(comment = "define NAME as a public function that can be called by NAME from code outside\r\nof the SubL code base but is not yet part of the formal API (use define-api for that)\r\n\r\n@unknown currently just a marker interface\ndefine NAME as a public function that can be called by NAME from code outside\nof the SubL code base but is not yet part of the formal API (use define-api for that)")
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
        assert NIL != stringp(documentation_string) : "! stringp(documentation_string) " + ("Types.stringp(documentation_string) " + "CommonSymbols.NIL != Types.stringp(documentation_string) ") + documentation_string;
        assert NIL != listp(type_declarations) : "! listp(type_declarations) " + ("Types.listp(type_declarations) " + "CommonSymbols.NIL != Types.listp(type_declarations) ") + type_declarations;
        thread.resetMultipleValues();
        final SubLObject argument_types = parse_api_type_declarations(type_declarations);
        final SubLObject body_preamble = thread.secondMultipleValue();
        final SubLObject return_types = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return list(PROGN, listS(DEFINE_EXTERNAL, name, arglist, documentation_string, append(body_preamble, body, NIL)));
    }

    /**
     * define NAME as a public macro that will be called by NAME from code outside
     * of the SubL code base but is not part of the formal API (use define-api for that)
     *
     * @unknown currently just a marker interface
     */
    @LispMethod(comment = "define NAME as a public macro that will be called by NAME from code outside\r\nof the SubL code base but is not part of the formal API (use define-api for that)\r\n\r\n@unknown currently just a marker interface\ndefine NAME as a public macro that will be called by NAME from code outside\nof the SubL code base but is not part of the formal API (use define-api for that)")
    public static final SubLObject defmacro_api_provisional_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            SubLObject pattern = NIL;
            SubLObject documentation_string = NIL;
            SubLObject type_declarations = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt13);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt13);
            pattern = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt13);
            documentation_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt13);
            type_declarations = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLTrampolineFile.checkType(documentation_string, STRINGP);
                SubLTrampolineFile.checkType(type_declarations, LISTP);
                return list(PROGN, list(REGISTER_EXTERNAL_SYMBOL, list(QUOTE, name)), listS(DEFMACRO_PUBLIC, name, pattern, documentation_string, append(body, NIL)));
            }
        }
    }

    /**
     * define NAME as a public macro that will be called by NAME from code outside
     * of the SubL code base but is not part of the formal API (use define-api for that)
     *
     * @unknown currently just a marker interface
     */
    @LispMethod(comment = "define NAME as a public macro that will be called by NAME from code outside\r\nof the SubL code base but is not part of the formal API (use define-api for that)\r\n\r\n@unknown currently just a marker interface\ndefine NAME as a public macro that will be called by NAME from code outside\nof the SubL code base but is not part of the formal API (use define-api for that)")
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
        assert NIL != stringp(documentation_string) : "! stringp(documentation_string) " + ("Types.stringp(documentation_string) " + "CommonSymbols.NIL != Types.stringp(documentation_string) ") + documentation_string;
        assert NIL != listp(type_declarations) : "! listp(type_declarations) " + ("Types.listp(type_declarations) " + "CommonSymbols.NIL != Types.listp(type_declarations) ") + type_declarations;
        return list(PROGN, list(REGISTER_EXTERNAL_SYMBOL, list(QUOTE, name)), listS(DEFMACRO_PUBLIC, name, pattern, documentation_string, append(body, NIL)));
    }

    /**
     * Register NAME as a (public) Cyc API function.
     * Note its ARGLIST, DOC-STRING, ARGUMENT-TYPEs and RETURN-TYPES.
     */
    @LispMethod(comment = "Register NAME as a (public) Cyc API function.\r\nNote its ARGLIST, DOC-STRING, ARGUMENT-TYPEs and RETURN-TYPES.\nRegister NAME as a (public) Cyc API function.\nNote its ARGLIST, DOC-STRING, ARGUMENT-TYPEs and RETURN-TYPES.")
    public static final SubLObject register_cyc_api_function_alt(SubLObject name, SubLObject arglist, SubLObject doc_string, SubLObject argument_types, SubLObject return_types) {
        register_api_predefined_function(name);
        register_cyc_api_symbol(name);
        register_cyc_api_args(name, arglist);
        register_cyc_api_function_documentation(name, doc_string);
        register_cyc_api_arg_types(name, argument_types);
        register_cyc_api_return_types(name, return_types);
        return NIL;
    }

    /**
     * Register NAME as a (public) Cyc API function.
     * Note its ARGLIST, DOC-STRING, ARGUMENT-TYPEs and RETURN-TYPES.
     */
    @LispMethod(comment = "Register NAME as a (public) Cyc API function.\r\nNote its ARGLIST, DOC-STRING, ARGUMENT-TYPEs and RETURN-TYPES.\nRegister NAME as a (public) Cyc API function.\nNote its ARGLIST, DOC-STRING, ARGUMENT-TYPEs and RETURN-TYPES.")
    public static SubLObject register_cyc_api_function(final SubLObject name, final SubLObject arglist, final SubLObject doc_string, final SubLObject argument_types, final SubLObject return_types) {
        register_api_predefined_function(name);
        register_cyc_api_symbol(name);
        register_cyc_api_args(name, arglist);
        register_cyc_api_function_documentation(name, doc_string);
        register_cyc_api_arg_types(name, argument_types);
        register_cyc_api_return_types(name, return_types);
        return NIL;
    }

    /**
     * Register NAME as a (public) Cyc API macro.
     * Note its PATTERN and DOC-STRING.
     */
    @LispMethod(comment = "Register NAME as a (public) Cyc API macro.\r\nNote its PATTERN and DOC-STRING.\nRegister NAME as a (public) Cyc API macro.\nNote its PATTERN and DOC-STRING.")
    public static final SubLObject register_cyc_api_macro_alt(SubLObject name, SubLObject pattern, SubLObject doc_string) {
        register_api_predefined_macro(name);
        register_cyc_api_symbol(name);
        register_cyc_api_args(name, pattern);
        register_cyc_api_function_documentation(name, doc_string);
        return NIL;
    }

    /**
     * Register NAME as a (public) Cyc API macro.
     * Note its PATTERN and DOC-STRING.
     */
    @LispMethod(comment = "Register NAME as a (public) Cyc API macro.\r\nNote its PATTERN and DOC-STRING.\nRegister NAME as a (public) Cyc API macro.\nNote its PATTERN and DOC-STRING.")
    public static SubLObject register_cyc_api_macro(final SubLObject name, final SubLObject pattern, final SubLObject doc_string) {
        register_api_predefined_macro(name);
        register_cyc_api_symbol(name);
        register_cyc_api_args(name, pattern);
        register_cyc_api_function_documentation(name, doc_string);
        return NIL;
    }

    public static final SubLObject api_special_p_alt(SubLObject operator) {
        return list_utilities.sublisp_boolean(gethash(operator, $api_special_table$.getGlobalValue(), NIL));
    }

    public static SubLObject api_special_p(final SubLObject operator) {
        return list_utilities.sublisp_boolean(gethash(operator, $api_special_table$.getGlobalValue(), NIL));
    }

    public static final SubLObject api_special_handler_alt(SubLObject operator) {
        return gethash(operator, $api_special_table$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject api_special_handler(final SubLObject operator) {
        return gethash(operator, $api_special_table$.getGlobalValue(), UNPROVIDED);
    }

    public static final SubLObject register_api_special_alt(SubLObject operator, SubLObject handler) {
        if ((NIL != api_predefined_function_p(operator)) || (NIL != api_predefined_macro_p(operator))) {
            Errors.warn($str_alt16$Registering__A_as_special_even_th, operator);
        } else {
            sethash(operator, $api_special_table$.getGlobalValue(), handler);
        }
        return operator;
    }

    public static SubLObject register_api_special(final SubLObject operator, final SubLObject handler) {
        if ((NIL != api_predefined_function_p(operator)) || (NIL != api_predefined_macro_p(operator))) {
            Errors.warn($str16$Registering__A_as_special_even_th, operator);
        } else {
            sethash(operator, $api_special_table$.getGlobalValue(), handler);
        }
        return operator;
    }

    public static final SubLObject api_predefined_function_p_alt(SubLObject operator) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != api_predefined_host_function_p(operator)) {
                return system_parameters.$permit_api_host_access$.getDynamicValue(thread);
            } else {
                return gethash(operator, $api_predefined_function_table$.getGlobalValue(), NIL);
            }
        }
    }

    public static SubLObject api_predefined_function_p(final SubLObject operator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != api_predefined_host_function_p(operator)) {
            return system_parameters.$permit_api_host_access$.getDynamicValue(thread);
        }
        return gethash(operator, $api_predefined_function_table$.getGlobalValue(), NIL);
    }

    /**
     * Permit the use of the OPERATOR function in the CYC api
     */
    @LispMethod(comment = "Permit the use of the OPERATOR function in the CYC api")
    public static final SubLObject register_api_predefined_function_alt(SubLObject operator) {
        if (NIL != api_special_p(operator)) {
            Errors.warn($str_alt19$Cannot_register__A_as_API_predefi, operator);
        } else {
            sethash(operator, $api_predefined_function_table$.getGlobalValue(), T);
        }
        return operator;
    }

    /**
     * Permit the use of the OPERATOR function in the CYC api
     */
    @LispMethod(comment = "Permit the use of the OPERATOR function in the CYC api")
    public static SubLObject register_api_predefined_function(final SubLObject operator) {
        if (NIL == api_special_p(operator)) {
            sethash(operator, $api_predefined_function_table$.getGlobalValue(), T);
        }
        return operator;
    }

    public static final SubLObject unregister_api_predefined_function_alt(SubLObject operator) {
        return remhash(operator, $api_predefined_function_table$.getGlobalValue());
    }

    public static SubLObject unregister_api_predefined_function(final SubLObject operator) {
        return remhash(operator, $api_predefined_function_table$.getGlobalValue());
    }

    public static final SubLObject api_predefined_host_function_p_alt(SubLObject operator) {
        return gethash(operator, $api_predefined_host_function_table$.getGlobalValue(), NIL);
    }

    public static SubLObject api_predefined_host_function_p(final SubLObject operator) {
        return gethash(operator, $api_predefined_host_function_table$.getGlobalValue(), NIL);
    }

    /**
     * Permit the use of the OPERATOR host function in the CYC api
     */
    @LispMethod(comment = "Permit the use of the OPERATOR host function in the CYC api")
    public static final SubLObject register_api_predefined_host_function_alt(SubLObject operator) {
        if (NIL != api_special_p(operator)) {
            Errors.warn($str_alt22$Cannot_register__A_as_API_host_fu, operator);
        } else {
            sethash(operator, $api_predefined_host_function_table$.getGlobalValue(), T);
        }
        return operator;
    }

    /**
     * Permit the use of the OPERATOR host function in the CYC api
     */
    @LispMethod(comment = "Permit the use of the OPERATOR host function in the CYC api")
    public static SubLObject register_api_predefined_host_function(final SubLObject operator) {
        if (NIL == api_special_p(operator)) {
            sethash(operator, $api_predefined_host_function_table$.getGlobalValue(), T);
        }
        return operator;
    }

    public static final SubLObject unregister_api_predefined_host_function_alt(SubLObject operator) {
        return remhash(operator, $api_predefined_host_function_table$.getGlobalValue());
    }

    public static SubLObject unregister_api_predefined_host_function(final SubLObject operator) {
        return remhash(operator, $api_predefined_host_function_table$.getGlobalValue());
    }

    public static final SubLObject api_predefined_macro_p_alt(SubLObject operator) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != api_predefined_host_macro_p(operator)) {
                return system_parameters.$permit_api_host_access$.getDynamicValue(thread);
            } else {
                return gethash(operator, $api_predefined_macro_table$.getGlobalValue(), NIL);
            }
        }
    }

    public static SubLObject api_predefined_macro_p(final SubLObject operator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != api_predefined_host_macro_p(operator)) {
            return system_parameters.$permit_api_host_access$.getDynamicValue(thread);
        }
        return gethash(operator, $api_predefined_macro_table$.getGlobalValue(), NIL);
    }

    /**
     * Permit the use of the OPERATOR macro in the CYC api
     */
    @LispMethod(comment = "Permit the use of the OPERATOR macro in the CYC api")
    public static final SubLObject register_api_predefined_macro_alt(SubLObject operator) {
        if (NIL != api_special_p(operator)) {
            Errors.warn($str_alt24$Cannot_register__A_as_API_macro_a, operator);
        } else {
            sethash(operator, $api_predefined_macro_table$.getGlobalValue(), T);
        }
        return operator;
    }

    /**
     * Permit the use of the OPERATOR macro in the CYC api
     */
    @LispMethod(comment = "Permit the use of the OPERATOR macro in the CYC api")
    public static SubLObject register_api_predefined_macro(final SubLObject operator) {
        if (NIL == api_special_p(operator)) {
            sethash(operator, $api_predefined_macro_table$.getGlobalValue(), T);
        }
        return operator;
    }

    public static final SubLObject unregister_api_predefined_macro_alt(SubLObject operator) {
        return remhash(operator, $api_predefined_macro_table$.getGlobalValue());
    }

    public static SubLObject unregister_api_predefined_macro(final SubLObject operator) {
        return remhash(operator, $api_predefined_macro_table$.getGlobalValue());
    }

    public static final SubLObject api_predefined_host_macro_p_alt(SubLObject operator) {
        return gethash(operator, $api_predefined_host_macro_table$.getGlobalValue(), NIL);
    }

    public static SubLObject api_predefined_host_macro_p(final SubLObject operator) {
        return gethash(operator, $api_predefined_host_macro_table$.getGlobalValue(), NIL);
    }

    /**
     * Permit the use of the OPERATOR host-access macro in the CYC api
     */
    @LispMethod(comment = "Permit the use of the OPERATOR host-access macro in the CYC api")
    public static final SubLObject register_api_predefined_host_macro_alt(SubLObject operator) {
        if (NIL != api_special_p(operator)) {
            Errors.warn($str_alt26$Cannot_register__A_as_API_predefi, operator);
        } else {
            sethash(operator, $api_predefined_host_macro_table$.getGlobalValue(), T);
        }
        return operator;
    }

    /**
     * Permit the use of the OPERATOR host-access macro in the CYC api
     */
    @LispMethod(comment = "Permit the use of the OPERATOR host-access macro in the CYC api")
    public static SubLObject register_api_predefined_host_macro(final SubLObject operator) {
        if (NIL == api_special_p(operator)) {
            sethash(operator, $api_predefined_host_macro_table$.getGlobalValue(), T);
        }
        return operator;
    }

    public static final SubLObject unregister_api_predefined_host_macro_alt(SubLObject operator) {
        return remhash(operator, $api_predefined_host_macro_table$.getGlobalValue());
    }

    public static SubLObject unregister_api_predefined_host_macro(final SubLObject operator) {
        return remhash(operator, $api_predefined_host_macro_table$.getGlobalValue());
    }

    /**
     * Return T iff the OBJ is a symbol defined as a Cyc API function or macro.
     */
    @LispMethod(comment = "Return T iff the OBJ is a symbol defined as a Cyc API function or macro.")
    public static final SubLObject cyc_api_symbol_p_alt(SubLObject obj) {
        return makeBoolean(obj.isSymbol() && (NIL != get(obj, $CYC_API_SYMBOL, NIL)));
    }

    /**
     * Return T iff the OBJ is a symbol defined as a Cyc API function or macro.
     */
    @LispMethod(comment = "Return T iff the OBJ is a symbol defined as a Cyc API function or macro.")
    public static SubLObject cyc_api_symbol_p(final SubLObject obj) {
        return makeBoolean(obj.isSymbol() && (NIL != get(obj, $CYC_API_SYMBOL, NIL)));
    }

    /**
     * Register the symbol NAME as a defined Cyc API function or macro. Return the NAME.
     */
    @LispMethod(comment = "Register the symbol NAME as a defined Cyc API function or macro. Return the NAME.")
    public static final SubLObject register_cyc_api_symbol_alt(SubLObject name) {
        SubLTrampolineFile.checkType(name, SYMBOLP);
        put(name, $CYC_API_SYMBOL, T);
        if (NIL == member(name, $api_symbols$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
            $api_symbols$.setGlobalValue(cons(name, $api_symbols$.getGlobalValue()));
        }
        return name;
    }

    /**
     * Register the symbol NAME as a defined Cyc API function or macro. Return the NAME.
     */
    @LispMethod(comment = "Register the symbol NAME as a defined Cyc API function or macro. Return the NAME.")
    public static SubLObject register_cyc_api_symbol(final SubLObject name) {
        assert NIL != symbolp(name) : "! symbolp(name) " + ("Types.symbolp(name) " + "CommonSymbols.NIL != Types.symbolp(name) ") + name;
        put(name, $CYC_API_SYMBOL, T);
        if (NIL == member(name, $api_symbols$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
            $api_symbols$.setGlobalValue(cons(name, $api_symbols$.getGlobalValue()));
        }
        return name;
    }

    /**
     * De-register the symbol NAME as a defined Cyc API function or macro. Return T iff
     * the symbol was previously registered.
     */
    @LispMethod(comment = "De-register the symbol NAME as a defined Cyc API function or macro. Return T iff\r\nthe symbol was previously registered.\nDe-register the symbol NAME as a defined Cyc API function or macro. Return T iff\nthe symbol was previously registered.")
    public static final SubLObject deregister_cyc_api_symbol_alt(SubLObject name) {
        SubLTrampolineFile.checkType(name, SYMBOLP);
        remove(name, $api_symbols$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return remprop(name, $CYC_API_SYMBOL);
    }

    /**
     * De-register the symbol NAME as a defined Cyc API function or macro. Return T iff
     * the symbol was previously registered.
     */
    @LispMethod(comment = "De-register the symbol NAME as a defined Cyc API function or macro. Return T iff\r\nthe symbol was previously registered.\nDe-register the symbol NAME as a defined Cyc API function or macro. Return T iff\nthe symbol was previously registered.")
    public static SubLObject deregister_cyc_api_symbol(final SubLObject name) {
        assert NIL != symbolp(name) : "! symbolp(name) " + ("Types.symbolp(name) " + "CommonSymbols.NIL != Types.symbolp(name) ") + name;
        remove(name, $api_symbols$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return remprop(name, $CYC_API_SYMBOL);
    }

    /**
     * Return the argument list defined for the macro NAME.
     */
    @LispMethod(comment = "Return the argument list defined for the macro NAME.")
    public static final SubLObject cyc_api_args_alt(SubLObject name) {
        return get(name, $CYC_API_ARGS, UNPROVIDED);
    }

    /**
     * Return the argument list defined for the macro NAME.
     */
    @LispMethod(comment = "Return the argument list defined for the macro NAME.")
    public static SubLObject cyc_api_args(final SubLObject name) {
        return get(name, $CYC_API_ARGS, UNPROVIDED);
    }

    /**
     * For the symbol NAME, register the Cyc API ARGLIST since CMUCL does not
     * record the macro argument list.  Return the NAME.
     */
    @LispMethod(comment = "For the symbol NAME, register the Cyc API ARGLIST since CMUCL does not\r\nrecord the macro argument list.  Return the NAME.\nFor the symbol NAME, register the Cyc API ARGLIST since CMUCL does not\nrecord the macro argument list.  Return the NAME.")
    public static final SubLObject register_cyc_api_args_alt(SubLObject name, SubLObject arglist) {
        SubLTrampolineFile.checkType(name, SYMBOLP);
        SubLTrampolineFile.checkType(arglist, LISTP);
        put(name, $CYC_API_ARGS, arglist);
        return name;
    }

    /**
     * For the symbol NAME, register the Cyc API ARGLIST since CMUCL does not
     * record the macro argument list.  Return the NAME.
     */
    @LispMethod(comment = "For the symbol NAME, register the Cyc API ARGLIST since CMUCL does not\r\nrecord the macro argument list.  Return the NAME.\nFor the symbol NAME, register the Cyc API ARGLIST since CMUCL does not\nrecord the macro argument list.  Return the NAME.")
    public static SubLObject register_cyc_api_args(final SubLObject name, final SubLObject arglist) {
        assert NIL != symbolp(name) : "! symbolp(name) " + ("Types.symbolp(name) " + "CommonSymbols.NIL != Types.symbolp(name) ") + name;
        assert NIL != listp(arglist) : "! listp(arglist) " + ("Types.listp(arglist) " + "CommonSymbols.NIL != Types.listp(arglist) ") + arglist;
        put(name, $CYC_API_ARGS, arglist);
        return name;
    }

    /**
     * De-register the symbol NAME's Cyc API argument list.  Return T iff the
     * argument list was previously registered.
     */
    @LispMethod(comment = "De-register the symbol NAME\'s Cyc API argument list.  Return T iff the\r\nargument list was previously registered.\nDe-register the symbol NAME\'s Cyc API argument list.  Return T iff the\nargument list was previously registered.")
    public static final SubLObject deregister_cyc_api_args_alt(SubLObject name) {
        SubLTrampolineFile.checkType(name, SYMBOLP);
        return remprop(name, $CYC_API_ARGS);
    }

    /**
     * De-register the symbol NAME's Cyc API argument list.  Return T iff the
     * argument list was previously registered.
     */
    @LispMethod(comment = "De-register the symbol NAME\'s Cyc API argument list.  Return T iff the\r\nargument list was previously registered.\nDe-register the symbol NAME\'s Cyc API argument list.  Return T iff the\nargument list was previously registered.")
    public static SubLObject deregister_cyc_api_args(final SubLObject name) {
        assert NIL != symbolp(name) : "! symbolp(name) " + ("Types.symbolp(name) " + "CommonSymbols.NIL != Types.symbolp(name) ") + name;
        return remprop(name, $CYC_API_ARGS);
    }

    /**
     * Register DOCUMENTATION-STRING as the function documentation for NAME.
     */
    @LispMethod(comment = "Register DOCUMENTATION-STRING as the function documentation for NAME.")
    public static final SubLObject register_cyc_api_function_documentation_alt(SubLObject name, SubLObject documentation_string) {
        SubLTrampolineFile.checkType(name, SYMBOLP);
        SubLTrampolineFile.checkType(documentation_string, STRINGP);
        return NIL;
    }

    /**
     * Register DOCUMENTATION-STRING as the function documentation for NAME.
     */
    @LispMethod(comment = "Register DOCUMENTATION-STRING as the function documentation for NAME.")
    public static SubLObject register_cyc_api_function_documentation(final SubLObject name, final SubLObject documentation_string) {
        assert NIL != symbolp(name) : "! symbolp(name) " + ("Types.symbolp(name) " + "CommonSymbols.NIL != Types.symbolp(name) ") + name;
        assert NIL != stringp(documentation_string) : "! stringp(documentation_string) " + ("Types.stringp(documentation_string) " + "CommonSymbols.NIL != Types.stringp(documentation_string) ") + documentation_string;
        return NIL;
    }

    /**
     * Return a list of argument type expressions which describe the types of arguments
     * that this Cyc API function NAME requires.
     */
    @LispMethod(comment = "Return a list of argument type expressions which describe the types of arguments\r\nthat this Cyc API function NAME requires.\nReturn a list of argument type expressions which describe the types of arguments\nthat this Cyc API function NAME requires.")
    public static final SubLObject get_api_arg_types_alt(SubLObject name) {
        return get(name, $CYC_API_ARG_TYPES, UNPROVIDED);
    }

    /**
     * Return a list of argument type expressions which describe the types of arguments
     * that this Cyc API function NAME requires.
     */
    @LispMethod(comment = "Return a list of argument type expressions which describe the types of arguments\r\nthat this Cyc API function NAME requires.\nReturn a list of argument type expressions which describe the types of arguments\nthat this Cyc API function NAME requires.")
    public static SubLObject get_api_arg_types(final SubLObject name) {
        return get(name, $CYC_API_ARG_TYPES, UNPROVIDED);
    }

    /**
     * For the symbol NAME, register the Cyc API function argument types, which take the form
     * of a list of argument type expressions. Return the NAME.
     */
    @LispMethod(comment = "For the symbol NAME, register the Cyc API function argument types, which take the form\r\nof a list of argument type expressions. Return the NAME.\nFor the symbol NAME, register the Cyc API function argument types, which take the form\nof a list of argument type expressions. Return the NAME.")
    public static final SubLObject register_cyc_api_arg_types_alt(SubLObject name, SubLObject argument_type_list) {
        SubLTrampolineFile.checkType(name, SYMBOLP);
        SubLTrampolineFile.checkType(argument_type_list, LISTP);
        put(name, $CYC_API_ARG_TYPES, argument_type_list);
        return name;
    }

    /**
     * For the symbol NAME, register the Cyc API function argument types, which take the form
     * of a list of argument type expressions. Return the NAME.
     */
    @LispMethod(comment = "For the symbol NAME, register the Cyc API function argument types, which take the form\r\nof a list of argument type expressions. Return the NAME.\nFor the symbol NAME, register the Cyc API function argument types, which take the form\nof a list of argument type expressions. Return the NAME.")
    public static SubLObject register_cyc_api_arg_types(final SubLObject name, final SubLObject argument_type_list) {
        assert NIL != symbolp(name) : "! symbolp(name) " + ("Types.symbolp(name) " + "CommonSymbols.NIL != Types.symbolp(name) ") + name;
        assert NIL != listp(argument_type_list) : "! listp(argument_type_list) " + ("Types.listp(argument_type_list) " + "CommonSymbols.NIL != Types.listp(argument_type_list) ") + argument_type_list;
        put(name, $CYC_API_ARG_TYPES, argument_type_list);
        return name;
    }

    /**
     * De-register the symbol NAME's Cyc API function argument types.  Return T iff the
     * argument types were previously registered.
     */
    @LispMethod(comment = "De-register the symbol NAME\'s Cyc API function argument types.  Return T iff the\r\nargument types were previously registered.\nDe-register the symbol NAME\'s Cyc API function argument types.  Return T iff the\nargument types were previously registered.")
    public static final SubLObject deregister_cyc_api_arg_types_alt(SubLObject name) {
        SubLTrampolineFile.checkType(name, SYMBOLP);
        return remprop(name, $CYC_API_ARG_TYPES);
    }

    /**
     * De-register the symbol NAME's Cyc API function argument types.  Return T iff the
     * argument types were previously registered.
     */
    @LispMethod(comment = "De-register the symbol NAME\'s Cyc API function argument types.  Return T iff the\r\nargument types were previously registered.\nDe-register the symbol NAME\'s Cyc API function argument types.  Return T iff the\nargument types were previously registered.")
    public static SubLObject deregister_cyc_api_arg_types(final SubLObject name) {
        assert NIL != symbolp(name) : "! symbolp(name) " + ("Types.symbolp(name) " + "CommonSymbols.NIL != Types.symbolp(name) ") + name;
        return remprop(name, $CYC_API_ARG_TYPES);
    }

    /**
     * Return a list of return type expressions which describe the types of objects
     * that this Cyc API function NAME returns.
     */
    @LispMethod(comment = "Return a list of return type expressions which describe the types of objects\r\nthat this Cyc API function NAME returns.\nReturn a list of return type expressions which describe the types of objects\nthat this Cyc API function NAME returns.")
    public static final SubLObject get_api_return_types_alt(SubLObject name) {
        return get(name, $CYC_API_RETURN_TYPES, UNPROVIDED);
    }

    /**
     * Return a list of return type expressions which describe the types of objects
     * that this Cyc API function NAME returns.
     */
    @LispMethod(comment = "Return a list of return type expressions which describe the types of objects\r\nthat this Cyc API function NAME returns.\nReturn a list of return type expressions which describe the types of objects\nthat this Cyc API function NAME returns.")
    public static SubLObject get_api_return_types(final SubLObject name) {
        return get(name, $CYC_API_RETURN_TYPES, UNPROVIDED);
    }

    /**
     * For the symbol NAME, register the Cyc API function return types. Return the
     * NAME.
     */
    @LispMethod(comment = "For the symbol NAME, register the Cyc API function return types. Return the\r\nNAME.\nFor the symbol NAME, register the Cyc API function return types. Return the\nNAME.")
    public static final SubLObject register_cyc_api_return_types_alt(SubLObject name, SubLObject return_types) {
        SubLTrampolineFile.checkType(name, SYMBOLP);
        SubLTrampolineFile.checkType(return_types, LISTP);
        {
            SubLObject cdolist_list_var = return_types;
            SubLObject return_type = NIL;
            for (return_type = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , return_type = cdolist_list_var.first()) {
                validate_return_type(return_type);
            }
        }
        put(name, $CYC_API_RETURN_TYPES, return_types);
        return name;
    }

    /**
     * For the symbol NAME, register the Cyc API function return types. Return the
     * NAME.
     */
    @LispMethod(comment = "For the symbol NAME, register the Cyc API function return types. Return the\r\nNAME.\nFor the symbol NAME, register the Cyc API function return types. Return the\nNAME.")
    public static SubLObject register_cyc_api_return_types(final SubLObject name, final SubLObject return_types) {
        assert NIL != symbolp(name) : "! symbolp(name) " + ("Types.symbolp(name) " + "CommonSymbols.NIL != Types.symbolp(name) ") + name;
        assert NIL != listp(return_types) : "! listp(return_types) " + ("Types.listp(return_types) " + "CommonSymbols.NIL != Types.listp(return_types) ") + return_types;
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

    /**
     * De-register the symbol NAME's Cyc API function return types.  Return T iff the
     * return types were previously registered.
     */
    @LispMethod(comment = "De-register the symbol NAME\'s Cyc API function return types.  Return T iff the\r\nreturn types were previously registered.\nDe-register the symbol NAME\'s Cyc API function return types.  Return T iff the\nreturn types were previously registered.")
    public static final SubLObject deregister_cyc_api_return_types_alt(SubLObject name) {
        SubLTrampolineFile.checkType(name, SYMBOLP);
        return remprop(name, $CYC_API_RETURN_TYPES);
    }

    /**
     * De-register the symbol NAME's Cyc API function return types.  Return T iff the
     * return types were previously registered.
     */
    @LispMethod(comment = "De-register the symbol NAME\'s Cyc API function return types.  Return T iff the\r\nreturn types were previously registered.\nDe-register the symbol NAME\'s Cyc API function return types.  Return T iff the\nreturn types were previously registered.")
    public static SubLObject deregister_cyc_api_return_types(final SubLObject name) {
        assert NIL != symbolp(name) : "! symbolp(name) " + ("Types.symbolp(name) " + "CommonSymbols.NIL != Types.symbolp(name) ") + name;
        return remprop(name, $CYC_API_RETURN_TYPES);
    }

    /**
     * Parse the Cyc API function type declaration form and return argument-types,
     * body-preamble (check-type expressions), and return-types, as multiple-values.
     */
    @LispMethod(comment = "Parse the Cyc API function type declaration form and return argument-types,\r\nbody-preamble (check-type expressions), and return-types, as multiple-values.\nParse the Cyc API function type declaration form and return argument-types,\nbody-preamble (check-type expressions), and return-types, as multiple-values.")
    public static final SubLObject parse_api_type_declarations_alt(SubLObject type_declarations) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject argument_types = parse_api_declarations_int(type_declarations, NIL);
                SubLObject body_preamble = thread.secondMultipleValue();
                SubLObject return_types = thread.thirdMultipleValue();
                SubLObject replacements = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                return values(argument_types, body_preamble, return_types);
            }
        }
    }

    /**
     * Parse the Cyc API function type declaration form and return argument-types,
     * body-preamble (check-type expressions), and return-types, as multiple-values.
     */
    @LispMethod(comment = "Parse the Cyc API function type declaration form and return argument-types,\r\nbody-preamble (check-type expressions), and return-types, as multiple-values.\nParse the Cyc API function type declaration form and return argument-types,\nbody-preamble (check-type expressions), and return-types, as multiple-values.")
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

    /**
     * Parse the deprecated Cyc API function declaration form and return argument-types,
     * body-preamble (check-type expressions), return-types, and replacements, as multiple-values.
     */
    @LispMethod(comment = "Parse the deprecated Cyc API function declaration form and return argument-types,\r\nbody-preamble (check-type expressions), return-types, and replacements, as multiple-values.\nParse the deprecated Cyc API function declaration form and return argument-types,\nbody-preamble (check-type expressions), return-types, and replacements, as multiple-values.")
    public static final SubLObject parse_obsolete_api_declarations_alt(SubLObject declarations) {
        return parse_api_declarations_int(declarations, T);
    }

    /**
     * Parse the deprecated Cyc API function declaration form and return argument-types,
     * body-preamble (check-type expressions), return-types, and replacements, as multiple-values.
     */
    @LispMethod(comment = "Parse the deprecated Cyc API function declaration form and return argument-types,\r\nbody-preamble (check-type expressions), return-types, and replacements, as multiple-values.\nParse the deprecated Cyc API function declaration form and return argument-types,\nbody-preamble (check-type expressions), return-types, and replacements, as multiple-values.")
    public static SubLObject parse_obsolete_api_declarations(final SubLObject declarations) {
        return parse_api_declarations_int(declarations, T);
    }

    /**
     * Parse the Cyc API function declaration form and return argument-types,
     * body-preamble (check-type expressions), return-types, and replacements, as multiple-values.
     * ALLOW-REPLACEMENTS? controls whether replacements are allowed in the declaration form.
     */
    @LispMethod(comment = "Parse the Cyc API function declaration form and return argument-types,\r\nbody-preamble (check-type expressions), return-types, and replacements, as multiple-values.\r\nALLOW-REPLACEMENTS? controls whether replacements are allowed in the declaration form.\nParse the Cyc API function declaration form and return argument-types,\nbody-preamble (check-type expressions), return-types, and replacements, as multiple-values.\nALLOW-REPLACEMENTS? controls whether replacements are allowed in the declaration form.")
    public static final SubLObject parse_api_declarations_int_alt(SubLObject declarations, SubLObject allow_replacementsP) {
        {
            SubLObject replacements = NIL;
            SubLObject argument_types = NIL;
            SubLObject body_preamble = NIL;
            SubLObject return_types = NIL;
            SubLObject cdolist_list_var = declarations;
            SubLObject declaration = NIL;
            for (declaration = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , declaration = cdolist_list_var.first()) {
                {
                    SubLObject pcase_var = declaration.first();
                    if (pcase_var.eql($REPLACEMENTS)) {
                        if (NIL == allow_replacementsP) {
                            Errors.error($str_alt35$_replacements_not_allowed_in_the_);
                        }
                        replacements = declaration.rest();
                    } else {
                        if (pcase_var.eql($ARGUMENT_TYPES)) {
                            argument_types = declaration.rest();
                            {
                                SubLObject cdolist_list_var_3 = argument_types;
                                SubLObject argument_type = NIL;
                                for (argument_type = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest() , argument_type = cdolist_list_var_3.first()) {
                                    body_preamble = append(body_preamble, list(expand_into_check_type(argument_type)));
                                }
                            }
                        } else {
                            if (pcase_var.eql($RETURN_TYPES)) {
                                return_types = declaration.rest();
                            }
                        }
                    }
                }
            }
            return values(argument_types, body_preamble, return_types, replacements);
        }
    }

    /**
     * Parse the Cyc API function declaration form and return argument-types,
     * body-preamble (check-type expressions), return-types, and replacements, as multiple-values.
     * ALLOW-REPLACEMENTS? controls whether replacements are allowed in the declaration form.
     */
    @LispMethod(comment = "Parse the Cyc API function declaration form and return argument-types,\r\nbody-preamble (check-type expressions), return-types, and replacements, as multiple-values.\r\nALLOW-REPLACEMENTS? controls whether replacements are allowed in the declaration form.\nParse the Cyc API function declaration form and return argument-types,\nbody-preamble (check-type expressions), return-types, and replacements, as multiple-values.\nALLOW-REPLACEMENTS? controls whether replacements are allowed in the declaration form.")
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
            } else
                if (pcase_var.eql($ARGUMENT_TYPES)) {
                    SubLObject cdolist_list_var_$3;
                    argument_types = cdolist_list_var_$3 = declaration.rest();
                    SubLObject argument_type = NIL;
                    argument_type = cdolist_list_var_$3.first();
                    while (NIL != cdolist_list_var_$3) {
                        body_preamble = append(body_preamble, list(expand_into_enforce_type(argument_type)));
                        cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                        argument_type = cdolist_list_var_$3.first();
                    } 
                } else
                    if (pcase_var.eql($RETURN_TYPES)) {
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

    /**
     * Ensure that each symbol denoting a predicate in the RETURN-TYPE expression
     * is recorded as an api type function. Return T if OK, otherwise signal an error.
     */
    @LispMethod(comment = "Ensure that each symbol denoting a predicate in the RETURN-TYPE expression\r\nis recorded as an api type function. Return T if OK, otherwise signal an error.\nEnsure that each symbol denoting a predicate in the RETURN-TYPE expression\nis recorded as an api type function. Return T if OK, otherwise signal an error.")
    public static final SubLObject validate_return_type_alt(SubLObject return_type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (return_type.isAtom()) {
                if (NIL == member(return_type, $api_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
                    $api_types$.setGlobalValue(cons(return_type, $api_types$.getGlobalValue()));
                }
                return T;
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!length(return_type).eql(TWO_INTEGER)) {
                    Errors.error($str_alt42$_S_return_type_expression_not_lis, return_type);
                }
            }
            if (NIL != member(return_type.first(), $list_alt43, UNPROVIDED, UNPROVIDED)) {
                return validate_return_type(second(return_type));
            }
            Errors.error($str_alt44$_S_complex_return_type_expression, return_type);
            return T;
        }
    }

    /**
     * Ensure that each symbol denoting a predicate in the RETURN-TYPE expression
     * is recorded as an api type function. Return T if OK, otherwise signal an error.
     */
    @LispMethod(comment = "Ensure that each symbol denoting a predicate in the RETURN-TYPE expression\r\nis recorded as an api type function. Return T if OK, otherwise signal an error.\nEnsure that each symbol denoting a predicate in the RETURN-TYPE expression\nis recorded as an api type function. Return T if OK, otherwise signal an error.")
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

    /**
     * define the function NAME, which is intended to be an #$afterAdding in the KB.
     */
    @LispMethod(comment = "define the function NAME, which is intended to be an #$afterAdding in the KB.")
    public static final SubLObject define_after_adding_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            SubLObject arglist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt7);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt7);
            arglist = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(DEFINE_KB, name, arglist, append(body, NIL));
            }
        }
    }

    /**
     * define the function NAME, which is intended to be an #$afterAdding in the KB.
     */
    @LispMethod(comment = "define the function NAME, which is intended to be an #$afterAdding in the KB.")
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

    /**
     * define the function NAME, which is intended to be an #$afterRemoving in the KB.
     */
    @LispMethod(comment = "define the function NAME, which is intended to be an #$afterRemoving in the KB.")
    public static final SubLObject define_after_removing_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            SubLObject arglist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt7);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt7);
            arglist = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(DEFINE_KB, name, arglist, append(body, NIL));
            }
        }
    }

    /**
     * define the function NAME, which is intended to be an #$afterRemoving in the KB.
     */
    @LispMethod(comment = "define the function NAME, which is intended to be an #$afterRemoving in the KB.")
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

    /**
     * define the function NAME, which is intended to be an #$ruleAfterAdding in the KB.
     */
    @LispMethod(comment = "define the function NAME, which is intended to be an #$ruleAfterAdding in the KB.")
    public static final SubLObject define_rule_after_adding_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            SubLObject arglist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt7);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt7);
            arglist = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(DEFINE_KB, name, arglist, append(body, NIL));
            }
        }
    }

    /**
     * define the function NAME, which is intended to be an #$ruleAfterAdding in the KB.
     */
    @LispMethod(comment = "define the function NAME, which is intended to be an #$ruleAfterAdding in the KB.")
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

    /**
     * define the function NAME, which is intended to be an #$ruleAfterRemoving in the KB.
     */
    @LispMethod(comment = "define the function NAME, which is intended to be an #$ruleAfterRemoving in the KB.")
    public static final SubLObject define_rule_after_removing_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            SubLObject arglist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt7);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt7);
            arglist = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(DEFINE_KB, name, arglist, append(body, NIL));
            }
        }
    }

    /**
     * define the function NAME, which is intended to be an #$ruleAfterRemoving in the KB.
     */
    @LispMethod(comment = "define the function NAME, which is intended to be an #$ruleAfterRemoving in the KB.")
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

    public static final SubLObject define_collection_defn_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            SubLObject arglist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt7);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt7);
            arglist = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(DEFINE_KB, name, arglist, append(body, NIL));
            }
        }
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

    public static final SubLObject define_evaluation_defn_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            SubLObject pattern = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt52);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt52);
            pattern = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(DEFINE_KB, name, pattern, append(body, NIL));
            }
        }
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

    public static final SubLObject define_expansion_defn_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            SubLObject pattern = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt52);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt52);
            pattern = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(DEFINE_KB, name, pattern, append(body, NIL));
            }
        }
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

    /**
     * Defines a function named FUNCTION-SYMBOL which takes a single argument that
     * it assumes is a SUBL-ESCAPE-P, and returns the value that BASIS-FUNCTION
     * returns when called on the SubL part of its argument.  The intended use of
     * this macro is to define KB defns which admit SubL entities which appear in
     * #$ExpandSubLFn or #$SubLQuoteFn form in the KB.
     */
    @LispMethod(comment = "Defines a function named FUNCTION-SYMBOL which takes a single argument that\r\nit assumes is a SUBL-ESCAPE-P, and returns the value that BASIS-FUNCTION\r\nreturns when called on the SubL part of its argument.  The intended use of\r\nthis macro is to define KB defns which admit SubL entities which appear in\r\n#$ExpandSubLFn or #$SubLQuoteFn form in the KB.\nDefines a function named FUNCTION-SYMBOL which takes a single argument that\nit assumes is a SUBL-ESCAPE-P, and returns the value that BASIS-FUNCTION\nreturns when called on the SubL part of its argument.  The intended use of\nthis macro is to define KB defns which admit SubL entities which appear in\n#$ExpandSubLFn or #$SubLQuoteFn form in the KB.")
    public static final SubLObject define_cyc_subl_defn_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject function_symbol = NIL;
            SubLObject basis_function = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt55);
            function_symbol = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt55);
            basis_function = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject arglist = $list_alt56;
                    SubLObject body = list(PWHEN, $list_alt57, list(RET, bq_cons(basis_function, $list_alt59)));
                    return list(DEFINE_KB, function_symbol, arglist, body);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt55);
            }
        }
        return NIL;
    }

    /**
     * Defines a function named FUNCTION-SYMBOL which takes a single argument that
     * it assumes is a SUBL-ESCAPE-P, and returns the value that BASIS-FUNCTION
     * returns when called on the SubL part of its argument.  The intended use of
     * this macro is to define KB defns which admit SubL entities which appear in
     * #$ExpandSubLFn or #$SubLQuoteFn form in the KB.
     */
    @LispMethod(comment = "Defines a function named FUNCTION-SYMBOL which takes a single argument that\r\nit assumes is a SUBL-ESCAPE-P, and returns the value that BASIS-FUNCTION\r\nreturns when called on the SubL part of its argument.  The intended use of\r\nthis macro is to define KB defns which admit SubL entities which appear in\r\n#$ExpandSubLFn or #$SubLQuoteFn form in the KB.\nDefines a function named FUNCTION-SYMBOL which takes a single argument that\nit assumes is a SUBL-ESCAPE-P, and returns the value that BASIS-FUNCTION\nreturns when called on the SubL part of its argument.  The intended use of\nthis macro is to define KB defns which admit SubL entities which appear in\n#$ExpandSubLFn or #$SubLQuoteFn form in the KB.")
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

    /**
     * define the function NAME, which is expected to be referenced by the KB.
     */
    @LispMethod(comment = "define the function NAME, which is expected to be referenced by the KB.")
    public static final SubLObject define_kb_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            SubLObject arglist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt7);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt7);
            arglist = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PROGN, listS(DEFINE, name, arglist, append(body, NIL)), list(REGISTER_KB_FUNCTION, list(QUOTE, name)));
            }
        }
    }

    /**
     * define the function NAME, which is expected to be referenced by the KB.
     */
    @LispMethod(comment = "define the function NAME, which is expected to be referenced by the KB.")
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

    public static final SubLObject kb_function_p_alt(SubLObject symbol) {
        return gethash_without_values(symbol, $kb_function_table$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject kb_function_p(final SubLObject symbol) {
        return gethash_without_values(symbol, $kb_function_table$.getGlobalValue(), UNPROVIDED);
    }

    /**
     * Note that SYMBOL is expected to be a symbol referenced by the KB.
     */
    @LispMethod(comment = "Note that SYMBOL is expected to be a symbol referenced by the KB.")
    public static final SubLObject register_kb_symbol_alt(SubLObject symbol) {
        SubLTrampolineFile.checkType(symbol, SYMBOLP);
        sethash(symbol, $kb_function_table$.getGlobalValue(), T);
        return symbol;
    }

    /**
     * Note that SYMBOL is expected to be a symbol referenced by the KB.
     */
    @LispMethod(comment = "Note that SYMBOL is expected to be a symbol referenced by the KB.")
    public static SubLObject register_kb_symbol(final SubLObject symbol) {
        assert NIL != symbolp(symbol) : "! symbolp(symbol) " + ("Types.symbolp(symbol) " + "CommonSymbols.NIL != Types.symbolp(symbol) ") + symbol;
        sethash(symbol, $kb_function_table$.getGlobalValue(), T);
        return symbol;
    }

    public static final SubLObject deregister_kb_symbol_alt(SubLObject symbol) {
        SubLTrampolineFile.checkType(symbol, SYMBOLP);
        return remhash(symbol, $kb_function_table$.getGlobalValue());
    }

    public static SubLObject deregister_kb_symbol(final SubLObject symbol) {
        assert NIL != symbolp(symbol) : "! symbolp(symbol) " + ("Types.symbolp(symbol) " + "CommonSymbols.NIL != Types.symbolp(symbol) ") + symbol;
        return remhash(symbol, $kb_function_table$.getGlobalValue());
    }

    public static final SubLObject deregister_all_kb_functions_alt() {
        clrhash($kb_function_table$.getGlobalValue());
        return T;
    }

    public static SubLObject deregister_all_kb_functions() {
        clrhash($kb_function_table$.getGlobalValue());
        return T;
    }

    public static final SubLObject all_kb_functions_alt() {
        {
            SubLObject kb_functions = NIL;
            SubLObject symbol = NIL;
            SubLObject value = NIL;
            {
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
            }
            kb_functions = Sort.sort(kb_functions, symbol_function(STRING_LESSP), symbol_function(SYMBOL_NAME));
            return kb_functions;
        }
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

    /**
     * Note that SYMBOL is expected to be a function symbol referenced by the KB.
     */
    @LispMethod(comment = "Note that SYMBOL is expected to be a function symbol referenced by the KB.")
    public static final SubLObject register_kb_function_alt(SubLObject function_symbol) {
        return register_kb_symbol(function_symbol);
    }

    /**
     * Note that SYMBOL is expected to be a function symbol referenced by the KB.
     */
    @LispMethod(comment = "Note that SYMBOL is expected to be a function symbol referenced by the KB.")
    public static SubLObject register_kb_function(final SubLObject function_symbol) {
        return register_kb_symbol(function_symbol);
    }

    public static final SubLObject deregister_kb_function_alt(SubLObject function_symbol) {
        return deregister_kb_symbol(function_symbol);
    }

    public static SubLObject deregister_kb_function(final SubLObject function_symbol) {
        return deregister_kb_symbol(function_symbol);
    }

    /**
     * Just like define-private, except intended to be funcalled.
     */
    @LispMethod(comment = "Just like define-private, except intended to be funcalled.")
    public static final SubLObject define_private_funcall_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            SubLObject arglist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt7);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt7);
            arglist = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PROGN, listS(DEFINE_PRIVATE, name, arglist, append(body, NIL)), list(NOTE_FUNCALL_HELPER_FUNCTION, list(QUOTE, name)));
            }
        }
    }

    /**
     * Just like define-private, except intended to be funcalled.
     */
    @LispMethod(comment = "Just like define-private, except intended to be funcalled.")
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

    /**
     * Note that SYMBOL has been defined via DEFINE-PRIVATE-FUNCALL
     */
    @LispMethod(comment = "Note that SYMBOL has been defined via DEFINE-PRIVATE-FUNCALL")
    public static final SubLObject note_funcall_helper_function_alt(SubLObject symbol) {
        put(symbol, $funcall_helper_property$.getGlobalValue(), T);
        return T;
    }

    /**
     * Note that SYMBOL has been defined via DEFINE-PRIVATE-FUNCALL
     */
    @LispMethod(comment = "Note that SYMBOL has been defined via DEFINE-PRIVATE-FUNCALL")
    public static SubLObject note_funcall_helper_function(final SubLObject symbol) {
        put(symbol, $funcall_helper_property$.getGlobalValue(), T);
        return T;
    }

    /**
     * Return T IFF SYMBOL has been defined via DEFINE-PRIVATE-FUNCALL
     */
    @LispMethod(comment = "Return T IFF SYMBOL has been defined via DEFINE-PRIVATE-FUNCALL")
    public static final SubLObject funcall_helper_functionP_alt(SubLObject symbol) {
        return get(symbol, $funcall_helper_property$.getGlobalValue(), NIL);
    }

    /**
     * Return T IFF SYMBOL has been defined via DEFINE-PRIVATE-FUNCALL
     */
    @LispMethod(comment = "Return T IFF SYMBOL has been defined via DEFINE-PRIVATE-FUNCALL")
    public static SubLObject funcall_helper_functionP(final SubLObject symbol) {
        return get(symbol, $funcall_helper_property$.getGlobalValue(), NIL);
    }

    /**
     * Return T iff ARG indicates that it wsa an unprovided argument to a function call.
     */
    @LispMethod(comment = "Return T iff ARG indicates that it wsa an unprovided argument to a function call.")
    public static final SubLObject unprovided_argumentP_alt(SubLObject arg) {
        return eq(arg, $unprovided$.getGlobalValue());
    }

    /**
     * Return T iff ARG indicates that it wsa an unprovided argument to a function call.
     */
    @LispMethod(comment = "Return T iff ARG indicates that it wsa an unprovided argument to a function call.")
    public static SubLObject unprovided_argumentP(final SubLObject arg) {
        return eq(arg, $unprovided$.getGlobalValue());
    }

    /**
     * declare that VARIABLE is a control parameter of some kind.
     * FANCY-NAME is a readable name for the parameter.
     * DESCRIPTION, if non-nil is a more detailed documentation string.
     * SETTTINGS-SPEC is a list of possible settings for the parameter.
     */
    @LispMethod(comment = "declare that VARIABLE is a control parameter of some kind.\r\nFANCY-NAME is a readable name for the parameter.\r\nDESCRIPTION, if non-nil is a more detailed documentation string.\r\nSETTTINGS-SPEC is a list of possible settings for the parameter.\ndeclare that VARIABLE is a control parameter of some kind.\nFANCY-NAME is a readable name for the parameter.\nDESCRIPTION, if non-nil is a more detailed documentation string.\nSETTTINGS-SPEC is a list of possible settings for the parameter.")
    public static final SubLObject declare_control_parameter_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject variable = NIL;
            SubLObject fancy_name = NIL;
            SubLObject description = NIL;
            SubLObject settings_spec = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt74);
            variable = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt74);
            fancy_name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt74);
            description = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt74);
            settings_spec = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(DECLARE_CONTROL_PARAMETER_INTERNAL, list(QUOTE, variable), fancy_name, description, list(QUOTE, settings_spec));
            } else {
                cdestructuring_bind_error(datum, $list_alt74);
            }
        }
        return NIL;
    }

    /**
     * declare that VARIABLE is a control parameter of some kind.
     * FANCY-NAME is a readable name for the parameter.
     * DESCRIPTION, if non-nil is a more detailed documentation string.
     * SETTTINGS-SPEC is a list of possible settings for the parameter.
     */
    @LispMethod(comment = "declare that VARIABLE is a control parameter of some kind.\r\nFANCY-NAME is a readable name for the parameter.\r\nDESCRIPTION, if non-nil is a more detailed documentation string.\r\nSETTTINGS-SPEC is a list of possible settings for the parameter.\ndeclare that VARIABLE is a control parameter of some kind.\nFANCY-NAME is a readable name for the parameter.\nDESCRIPTION, if non-nil is a more detailed documentation string.\nSETTTINGS-SPEC is a list of possible settings for the parameter.")
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

    public static final SubLObject declare_control_parameter_internal_alt(SubLObject variable, SubLObject fancy_name, SubLObject description, SubLObject settings_spec) {
        SubLTrampolineFile.checkType(variable, SYMBOLP);
        SubLTrampolineFile.checkType(fancy_name, STRINGP);
        SubLTrampolineFile.checkType(description, STRINGP);
        put(variable, $FANCY_NAME, fancy_name);
        put(variable, $DESCRIPTION, description);
        put(variable, $SETTINGS_SPEC, settings_spec);
        return variable;
    }

    public static SubLObject declare_control_parameter_internal(final SubLObject variable, final SubLObject fancy_name, final SubLObject description, final SubLObject settings_spec) {
        assert NIL != symbolp(variable) : "! symbolp(variable) " + ("Types.symbolp(variable) " + "CommonSymbols.NIL != Types.symbolp(variable) ") + variable;
        assert NIL != stringp(fancy_name) : "! stringp(fancy_name) " + ("Types.stringp(fancy_name) " + "CommonSymbols.NIL != Types.stringp(fancy_name) ") + fancy_name;
        assert NIL != stringp(description) : "! stringp(description) " + ("Types.stringp(description) " + "CommonSymbols.NIL != Types.stringp(description) ") + description;
        put(variable, $FANCY_NAME, fancy_name);
        put(variable, $DESCRIPTION, description);
        put(variable, $SETTINGS_SPEC, settings_spec);
        return variable;
    }

    public static final SubLObject until_mapping_finished_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CCATCH_IGNORE, $MAPPING_DONE, append(body, NIL));
        }
    }

    public static SubLObject until_mapping_finished(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CCATCH_IGNORE, $MAPPING_DONE, append(body, NIL));
    }

    public static final SubLObject mapping_finished_alt() {
        sublisp_throw($MAPPING_DONE, NIL);
        return NIL;
    }

    public static SubLObject mapping_finished() {
        sublisp_throw($MAPPING_DONE, NIL);
        return NIL;
    }

    public static final SubLObject until_sbhl_mapping_finished_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CCATCH_IGNORE, $SBHL_MAPPING_DONE, append(body, NIL));
        }
    }

    public static SubLObject until_sbhl_mapping_finished(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CCATCH_IGNORE, $SBHL_MAPPING_DONE, append(body, NIL));
    }

    public static final SubLObject sbhl_mapping_finished_alt() {
        sublisp_throw($SBHL_MAPPING_DONE, NIL);
        return NIL;
    }

    public static SubLObject sbhl_mapping_finished() {
        sublisp_throw($SBHL_MAPPING_DONE, NIL);
        return NIL;
    }

    public static final SubLObject cfasl_write_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject obj = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt82);
            obj = current.first();
            current = current.rest();
            if (NIL == current) {
                return listS(WRITE_BYTE, obj, $list_alt84);
            } else {
                cdestructuring_bind_error(datum, $list_alt82);
            }
        }
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

    public static final SubLObject cfasl_read_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            if (NIL != datum) {
                cdestructuring_bind_error(datum, NIL);
            }
            return $list_alt85;
        }
    }

    public static SubLObject cfasl_read(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        if (NIL != datum) {
            cdestructuring_bind_error(datum, NIL);
        }
        return $list81;
    }

    /**
     * Execute ACTION if LOCK is idle, else execute ELSE-ACTION (if any)
     */
    @LispMethod(comment = "Execute ACTION if LOCK is idle, else execute ELSE-ACTION (if any)")
    public static final SubLObject if_lock_idle_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject lock = NIL;
            SubLObject action = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt86);
            lock = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt86);
            action = current.first();
            current = current.rest();
            {
                SubLObject else_action = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt86);
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject lock_var = $sym87$LOCK_VAR;
                        if (NIL != else_action) {
                            return list(CLET, list(list(lock_var, lock)), list(PIF, list(LOCK_IDLE_P, lock_var), list(WITH_LOCK_HELD, list(lock_var), action), else_action));
                        } else {
                            return list(CLET, list(list(lock_var, lock)), list(PWHEN, list(LOCK_IDLE_P, lock_var), list(WITH_LOCK_HELD, list(lock_var), action)));
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt86);
                }
            }
        }
        return NIL;
    }

    /**
     * Execute ACTION if LOCK is idle, else execute ELSE-ACTION (if any)
     */
    @LispMethod(comment = "Execute ACTION if LOCK is idle, else execute ELSE-ACTION (if any)")
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

    public static final SubLObject possibly_with_lock_held_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject lock = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt92);
            lock = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(PIF, lock, listS(WITH_LOCK_HELD, list(lock), append(body, NIL)), append(body, NIL));
            }
        }
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

    public static final SubLObject defglobal_lock_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject variable = NIL;
            SubLObject name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt93);
            variable = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt93);
            name = current.first();
            current = current.rest();
            {
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_4 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt93);
                    current_4 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt93);
                    if (NIL == member(current_4, $list_alt94, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_4 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt93);
                }
                {
                    SubLObject vaccess_tail = property_list_member($VACCESS, current);
                    SubLObject vaccess = (NIL != vaccess_tail) ? ((SubLObject) (cadr(vaccess_tail))) : NIL;
                    SubLObject documentation_tail = property_list_member($DOCUMENTATION, current);
                    SubLObject documentation = (NIL != documentation_tail) ? ((SubLObject) (cadr(documentation_tail))) : NIL;
                    SubLObject init_form = global_lock_initialization_form(name);
                    return bq_cons(PROGN, append(NIL != vaccess ? ((SubLObject) (list(list(DECLAIM, list(VACCESS, vaccess, variable))))) : NIL, list(listS(DEFGLOBAL, variable, init_form, append(NIL != documentation ? ((SubLObject) (list(documentation))) : NIL, NIL)), list(REGISTER_GLOBAL_LOCK, list(QUOTE, variable), name))));
                }
            }
        }
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

    /**
     * Initialize all global locks
     */
    @LispMethod(comment = "Initialize all global locks")
    public static final SubLObject initialize_global_locks_alt() {
        {
            SubLObject cdolist_list_var = $global_locks$.getGlobalValue();
            SubLObject pair = NIL;
            for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                {
                    SubLObject datum = pair;
                    SubLObject current = datum;
                    SubLObject global = NIL;
                    SubLObject name = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt103);
                    global = current.first();
                    current = current.rest();
                    name = current;
                    initialize_global_lock_internal(global, name);
                }
            }
        }
        return NIL;
    }

    /**
     * Initialize all global locks
     */
    @LispMethod(comment = "Initialize all global locks")
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

    public static final SubLObject register_global_lock_alt(SubLObject global, SubLObject name) {
        SubLTrampolineFile.checkType(global, SYMBOLP);
        SubLTrampolineFile.checkType(name, STRINGP);
        $global_locks$.setGlobalValue(delete(global, $global_locks$.getGlobalValue(), symbol_function(EQL), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED));
        $global_locks$.setGlobalValue(cons(cons(global, name), $global_locks$.getGlobalValue()));
        return $global_locks$.getGlobalValue();
    }

    public static SubLObject register_global_lock(final SubLObject global, final SubLObject name) {
        assert NIL != symbolp(global) : "! symbolp(global) " + ("Types.symbolp(global) " + "CommonSymbols.NIL != Types.symbolp(global) ") + global;
        assert NIL != stringp(name) : "! stringp(name) " + ("Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) ") + name;
        $global_locks$.setGlobalValue(delete(global, $global_locks$.getGlobalValue(), symbol_function(EQL), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED));
        $global_locks$.setGlobalValue(cons(cons(global, name), $global_locks$.getGlobalValue()));
        return $global_locks$.getGlobalValue();
    }

    public static final SubLObject global_lock_p_alt(SubLObject v_object) {
        return list_utilities.sublisp_boolean(assoc(v_object, $global_locks$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject global_lock_p(final SubLObject v_object) {
        return list_utilities.sublisp_boolean(assoc(v_object, $global_locks$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject global_lock_initialization_form_alt(SubLObject name) {
        SubLTrampolineFile.checkType(name, STRINGP);
        return list(MAKE_LOCK, name);
    }

    public static SubLObject global_lock_initialization_form(final SubLObject name) {
        assert NIL != stringp(name) : "! stringp(name) " + ("Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) ") + name;
        return list(MAKE_LOCK, name);
    }

    public static final SubLObject initialize_global_lock_alt(SubLObject global) {
        SubLTrampolineFile.checkType(global, GLOBAL_LOCK_P);
        {
            SubLObject name = assoc(global, $global_locks$.getGlobalValue(), UNPROVIDED, UNPROVIDED).rest();
            if (name.isString()) {
                initialize_global_lock_internal(global, name);
            }
        }
        return symbol_value(global);
    }

    public static SubLObject initialize_global_lock(final SubLObject global) {
        assert NIL != global_lock_p(global) : "! utilities_macros.global_lock_p(global) " + ("utilities_macros.global_lock_p(global) " + "CommonSymbols.NIL != utilities_macros.global_lock_p(global) ") + global;
        final SubLObject name = assoc(global, $global_locks$.getGlobalValue(), UNPROVIDED, UNPROVIDED).rest();
        if (name.isString()) {
            initialize_global_lock_internal(global, name);
        }
        return symbol_value(global);
    }

    public static final SubLObject initialize_global_lock_internal_alt(SubLObject global, SubLObject name) {
        {
            SubLObject init_form = global_lock_initialization_form(name);
            eval(list(CSETQ, global, init_form));
        }
        return symbol_value(global);
    }

    public static SubLObject initialize_global_lock_internal(final SubLObject global, final SubLObject name) {
        final SubLObject init_form = global_lock_initialization_form(name);
        eval(list(CSETQ, global, init_form));
        return symbol_value(global);
    }

    public static final SubLObject defparameter_fi_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject variable = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt111);
            variable = current.first();
            current = current.rest();
            {
                SubLObject initialization = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt111);
                current = current.rest();
                {
                    SubLObject documentation = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt111);
                    current = current.rest();
                    if (NIL == current) {
                        return list(PROGN, list(DEFPARAMETER_HTML, variable, initialization, documentation), listS(CPUSHNEW, list(QUOTE, variable), $list_alt114));
                    } else {
                        cdestructuring_bind_error(datum, $list_alt111);
                    }
                }
            }
        }
        return NIL;
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

    public static final SubLObject with_clean_fi_state_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CPROGV, $fi_state_variables$, $list_alt116, append(body, NIL));
        }
    }

    public static SubLObject with_clean_fi_state(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CPROGV, $fi_state_variables$, $list112, append(body, NIL));
    }

    public static final SubLObject register_html_state_variable_alt(SubLObject variable) {
        {
            SubLObject item_var = variable;
            if (NIL == member(item_var, $html_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $html_state_variables$.setGlobalValue(cons(item_var, $html_state_variables$.getGlobalValue()));
            }
        }
        return NIL;
    }

    public static SubLObject register_html_state_variable(final SubLObject variable) {
        if (NIL == member(variable, $html_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $html_state_variables$.setGlobalValue(cons(variable, $html_state_variables$.getGlobalValue()));
        }
        return NIL;
    }

    public static final SubLObject defparameter_html_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject variable = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt111);
            variable = current.first();
            current = current.rest();
            {
                SubLObject initialization = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt111);
                current = current.rest();
                {
                    SubLObject documentation = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt111);
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL != system_info.cyc_html_feature()) {
                            return list(PROGN, list(DEFPARAMETER, variable, initialization, documentation), list(REGISTER_HTML_STATE_VARIABLE, list(QUOTE, variable)));
                        } else {
                            return list(DEFPARAMETER, variable, initialization, documentation);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt111);
                    }
                }
            }
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

    public static final SubLObject defvar_html_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject variable = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt111);
            variable = current.first();
            current = current.rest();
            {
                SubLObject initialization = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt111);
                current = current.rest();
                {
                    SubLObject documentation = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt111);
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL != system_info.cyc_html_feature()) {
                            return list(PROGN, list(DEFVAR, variable, initialization, documentation), list(REGISTER_HTML_STATE_VARIABLE, list(QUOTE, variable)));
                        } else {
                            return list(DEFVAR, variable, initialization, documentation);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt111);
                    }
                }
            }
        }
        return NIL;
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

    public static final SubLObject register_html_interface_variable_alt(SubLObject variable) {
        {
            SubLObject item_var = variable;
            if (NIL == member(item_var, $html_interface_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $html_interface_variables$.setGlobalValue(cons(item_var, $html_interface_variables$.getGlobalValue()));
            }
        }
        return NIL;
    }

    public static SubLObject register_html_interface_variable(final SubLObject variable) {
        if (NIL == member(variable, $html_interface_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $html_interface_variables$.setGlobalValue(cons(variable, $html_interface_variables$.getGlobalValue()));
        }
        return NIL;
    }

    public static final SubLObject defparameter_html_interface_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject variable = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt111);
            variable = current.first();
            current = current.rest();
            {
                SubLObject initialization = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt111);
                current = current.rest();
                {
                    SubLObject documentation = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt111);
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL != system_info.cyc_html_feature()) {
                            return list(PROGN, list(DEFPARAMETER, variable, initialization, documentation), list(REGISTER_HTML_STATE_VARIABLE, list(QUOTE, variable)), list(REGISTER_HTML_INTERFACE_VARIABLE, list(QUOTE, variable)));
                        } else {
                            return list(DEFPARAMETER, variable, initialization, documentation);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt111);
                    }
                }
            }
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

    public static final SubLObject defvar_html_interface_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject variable = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt111);
            variable = current.first();
            current = current.rest();
            {
                SubLObject initialization = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt111);
                current = current.rest();
                {
                    SubLObject documentation = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt111);
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL != system_info.cyc_html_feature()) {
                            return list(PROGN, list(DEFVAR, variable, initialization, documentation), list(REGISTER_HTML_STATE_VARIABLE, list(QUOTE, variable)), list(REGISTER_HTML_INTERFACE_VARIABLE, list(QUOTE, variable)));
                        } else {
                            return list(DEFVAR, variable, initialization, documentation);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt111);
                    }
                }
            }
        }
        return NIL;
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

    public static final SubLObject def_state_variable_alt(SubLObject macroform, SubLObject environment) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = macroform.rest();
                SubLObject current = datum;
                SubLObject variable = NIL;
                SubLObject state_variables = NIL;
                SubLObject initialization = NIL;
                SubLObject documentation = NIL;
                SubLObject type = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt123);
                variable = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt123);
                state_variables = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt123);
                initialization = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt123);
                documentation = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt123);
                type = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject defop = define_operator_for_variable_type(type);
                        if ((NIL != member($CYC_OPENCYC, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) || (NIL != member($CYC_RESEARCHCYC, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED))) {
                            return list(PROGN, listS(defop, variable, initialization, append(NIL != documentation ? ((SubLObject) (list(documentation))) : NIL, NIL)), list(CPUSHNEW, list(QUOTE, variable), state_variables));
                        } else {
                            return list(PROGN, list(defop, variable, initialization), list(CPUSHNEW, list(QUOTE, variable), state_variables), list(NOTE_STATE_VARIABLE_DOCUMENTATION, list(QUOTE, variable), documentation));
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt123);
                }
            }
            return NIL;
        }
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

    public static final SubLObject note_state_variable_documentation_alt(SubLObject variable, SubLObject documentation) {
        put(variable, $VARIABLE_DOC, documentation);
        return variable;
    }

    public static SubLObject note_state_variable_documentation(final SubLObject variable, final SubLObject documentation) {
        put(variable, $VARIABLE_DOC, documentation);
        return variable;
    }

    public static final SubLObject define_operator_for_variable_type_alt(SubLObject variable_type) {
        {
            SubLObject defop = NIL;
            SubLObject pcase_var = variable_type;
            if (pcase_var.eql($VARIABLE)) {
                defop = DEFVAR;
            } else {
                if (pcase_var.eql($PARAMETER)) {
                    defop = DEFPARAMETER;
                } else {
                    if (pcase_var.eql($GLOBAL)) {
                        defop = DEFGLOBAL;
                    } else {
                        if (pcase_var.eql($LEXICAL)) {
                            defop = DEFLEXICAL;
                        } else {
                            if (pcase_var.eql($CONSTANT)) {
                                defop = DEFCONSTANT;
                            } else {
                                if (pcase_var.eql($PARAMETER_PRIVATE)) {
                                    defop = DEFPARAMETER_PRIVATE;
                                } else {
                                    if (pcase_var.eql($PARAMETER_PUBLIC)) {
                                        defop = DEFPARAMETER_PUBLIC;
                                    } else {
                                        if (pcase_var.eql($PARAMETER_PROTECTECD)) {
                                            defop = DEFPARAMETER_PUBLIC;
                                        } else {
                                            Errors.error($str_alt141$unknown_variable_type__s__, variable_type);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return defop;
        }
    }

    public static SubLObject define_operator_for_variable_type(final SubLObject variable_type) {
        SubLObject defop = NIL;
        if (variable_type.eql($VARIABLE)) {
            defop = DEFVAR;
        } else
            if (variable_type.eql($PARAMETER)) {
                defop = DEFPARAMETER;
            } else
                if (variable_type.eql($GLOBAL)) {
                    defop = DEFGLOBAL;
                } else
                    if (variable_type.eql($LEXICAL)) {
                        defop = DEFLEXICAL;
                    } else
                        if (variable_type.eql($CONSTANT)) {
                            defop = DEFCONSTANT;
                        } else
                            if (variable_type.eql($PARAMETER_PRIVATE)) {
                                defop = DEFPARAMETER_PRIVATE;
                            } else
                                if (variable_type.eql($PARAMETER_PUBLIC)) {
                                    defop = DEFPARAMETER_PUBLIC;
                                } else
                                    if (variable_type.eql($PARAMETER_PROTECTECD)) {
                                        defop = DEFPARAMETER_PUBLIC;
                                    } else {
                                        Errors.error($str135$unknown_variable_type__s__, variable_type);
                                    }







        return defop;
    }

    public static final SubLObject documentation_alt(SubLObject symbol, SubLObject type) {
        if (type == UNPROVIDED) {
            type = $VARIABLE;
        }
        {
            SubLObject pcase_var = type;
            if (pcase_var.eql($VARIABLE)) {
                return get(symbol, $VARIABLE_DOC, UNPROVIDED);
            } else {
                if (pcase_var.eql($FUNCTION)) {
                    return get(symbol, $FUNCTION_DOC, UNPROVIDED);
                } else {
                    if (pcase_var.eql($STRUCTURE)) {
                        return get(symbol, $STRUCTURE_DOC, UNPROVIDED);
                    } else {
                        if (pcase_var.eql($TYPE)) {
                            return get(symbol, $TYPE_DOC, UNPROVIDED);
                        }
                    }
                }
            }
        }
        return NIL;
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

    public static final SubLObject defvar_gt_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject variable = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt149);
            variable = current.first();
            current = current.rest();
            {
                SubLObject initialization = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt149);
                current = current.rest();
                {
                    SubLObject documentation = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt149);
                    current = current.rest();
                    {
                        SubLObject type = (current.isCons()) ? ((SubLObject) (current.first())) : $PARAMETER;
                        destructuring_bind_must_listp(current, datum, $list_alt149);
                        current = current.rest();
                        if (NIL == current) {
                            return list(DEF_STATE_VARIABLE, variable, $gt_state_variables$, initialization, documentation, type);
                        } else {
                            cdestructuring_bind_error(datum, $list_alt149);
                        }
                    }
                }
            }
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

    public static final SubLObject defvar_at_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject variable = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt149);
            variable = current.first();
            current = current.rest();
            {
                SubLObject initialization = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt149);
                current = current.rest();
                {
                    SubLObject documentation = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt149);
                    current = current.rest();
                    {
                        SubLObject type = (current.isCons()) ? ((SubLObject) (current.first())) : $PARAMETER;
                        destructuring_bind_must_listp(current, datum, $list_alt149);
                        current = current.rest();
                        if (NIL == current) {
                            return list(DEF_STATE_VARIABLE, variable, $at_state_variables$, initialization, documentation, type);
                        } else {
                            cdestructuring_bind_error(datum, $list_alt149);
                        }
                    }
                }
            }
        }
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

    public static final SubLObject defvar_defn_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject variable = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt149);
            variable = current.first();
            current = current.rest();
            {
                SubLObject initialization = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt149);
                current = current.rest();
                {
                    SubLObject documentation = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt149);
                    current = current.rest();
                    {
                        SubLObject type = (current.isCons()) ? ((SubLObject) (current.first())) : $PARAMETER;
                        destructuring_bind_must_listp(current, datum, $list_alt149);
                        current = current.rest();
                        if (NIL == current) {
                            return list(DEF_STATE_VARIABLE, variable, $defn_state_variables$, initialization, documentation, type);
                        } else {
                            cdestructuring_bind_error(datum, $list_alt149);
                        }
                    }
                }
            }
        }
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

    public static final SubLObject defvar_kbi_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject variable = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt153);
            variable = current.first();
            current = current.rest();
            {
                SubLObject initialization = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt153);
                current = current.rest();
                {
                    SubLObject documentation = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt153);
                    current = current.rest();
                    {
                        SubLObject type = (current.isCons()) ? ((SubLObject) (current.first())) : $PARAMETER_PROTECTECD;
                        destructuring_bind_must_listp(current, datum, $list_alt153);
                        current = current.rest();
                        if (NIL == current) {
                            return list(DEF_STATE_VARIABLE, variable, $kbi_state_variables$, initialization, documentation, type);
                        } else {
                            cdestructuring_bind_error(datum, $list_alt153);
                        }
                    }
                }
            }
        }
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

    public static final SubLObject defvar_kbp_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject variable = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt149);
            variable = current.first();
            current = current.rest();
            {
                SubLObject initialization = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt149);
                current = current.rest();
                {
                    SubLObject documentation = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt149);
                    current = current.rest();
                    {
                        SubLObject type = (current.isCons()) ? ((SubLObject) (current.first())) : $PARAMETER;
                        destructuring_bind_must_listp(current, datum, $list_alt149);
                        current = current.rest();
                        if (NIL == current) {
                            return list(DEF_STATE_VARIABLE, variable, $kbp_state_variables$, initialization, documentation, type);
                        } else {
                            cdestructuring_bind_error(datum, $list_alt149);
                        }
                    }
                }
            }
        }
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

    public static final SubLObject with_kbp_defaults_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt155, append(body, NIL));
        }
    }

    public static SubLObject with_kbp_defaults(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list149, append(body, NIL));
    }

    /**
     * Evaluate BODY as a form via the Cyc-API on MACHINE at PORT
     */
    @LispMethod(comment = "Evaluate BODY as a form via the Cyc-API on MACHINE at PORT")
    public static final SubLObject progn_cyc_api_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt156);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject machine = NIL;
                    SubLObject port = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt156);
                    machine = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt156);
                    port = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(CYC_API_REMOTE_EVAL, list(QUOTE, bq_cons(PROGN, append(body, NIL))), machine, port);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt156);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Evaluate BODY as a form via the Cyc-API on MACHINE at PORT
     */
    @LispMethod(comment = "Evaluate BODY as a form via the Cyc-API on MACHINE at PORT")
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

    public static final SubLObject with_forward_inference_environment_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt158);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject environment_5 = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt158);
                    environment_5 = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(PROGN, listS(CHECK_TYPE, environment_5, $list_alt159), listS(CLET, list(list($forward_inference_environment$, environment_5)), append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt158);
                    }
                }
            }
        }
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

    public static final SubLObject with_clean_forward_inference_environment_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            SubLObject environment_6 = $sym161$ENVIRONMENT;
            return list(CLET, list(bq_cons(environment_6, $list_alt162)), listS(WITH_FORWARD_INFERENCE_ENVIRONMENT, list(environment_6), append(body, NIL)));
        }
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

    /**
     * Rebind the current forward inference problem store to nil so that a new one will be created.  After performing BODY, clear the last inference store that was created.
     */
    @LispMethod(comment = "Rebind the current forward inference problem store to nil so that a new one will be created.  After performing BODY, clear the last inference store that was created.")
    public static final SubLObject with_clean_forward_problem_store_environment_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(CLET, $list_alt164, listS(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), $list_alt166));
        }
    }

    /**
     * Rebind the current forward inference problem store to nil so that a new one will be created.  After performing BODY, clear the last inference store that was created.
     */
    @LispMethod(comment = "Rebind the current forward inference problem store to nil so that a new one will be created.  After performing BODY, clear the last inference store that was created.")
    public static SubLObject with_clean_forward_problem_store_environment(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(CLET, $list163, listS(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), $list165));
    }

    /**
     * Bind the forward inference behavior modifying parameters to their default values.
     */
    @LispMethod(comment = "Bind the forward inference behavior modifying parameters to their default values.")
    public static final SubLObject with_normal_forward_inference_parameters_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt167, append(body, NIL));
        }
    }

    /**
     * Bind the forward inference behavior modifying parameters to their default values.
     */
    @LispMethod(comment = "Bind the forward inference behavior modifying parameters to their default values.")
    public static SubLObject with_normal_forward_inference_parameters(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list166, append(body, NIL));
    }

    /**
     * Seup up the forward inference environment, store, and behavior modifying parameters to fresh default values.  This is called from cyc-create-nart.
     */
    @LispMethod(comment = "Seup up the forward inference environment, store, and behavior modifying parameters to fresh default values.  This is called from cyc-create-nart.")
    public static final SubLObject with_normal_forward_inference_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(WITH_NORMAL_FORWARD_INFERENCE_PARAMETERS, list(WITH_CLEAN_FORWARD_INFERENCE_ENVIRONMENT, bq_cons(WITH_CLEAN_FORWARD_PROBLEM_STORE_ENVIRONMENT, append(body, NIL))));
        }
    }

    /**
     * Seup up the forward inference environment, store, and behavior modifying parameters to fresh default values.  This is called from cyc-create-nart.
     */
    @LispMethod(comment = "Seup up the forward inference environment, store, and behavior modifying parameters to fresh default values.  This is called from cyc-create-nart.")
    public static SubLObject with_normal_forward_inference(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(WITH_NORMAL_FORWARD_INFERENCE_PARAMETERS, list(WITH_CLEAN_FORWARD_INFERENCE_ENVIRONMENT, bq_cons(WITH_CLEAN_FORWARD_PROBLEM_STORE_ENVIRONMENT, append(body, NIL))));
    }

    /**
     * A more strict version of (within-forward-inference?) that returns NIL when we're in a special forward inference mode.
     */
    @LispMethod(comment = "A more strict version of (within-forward-inference?) that returns NIL when we\'re in a special forward inference mode.")
    public static final SubLObject within_normal_forward_inferenceP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean(((NIL != kb_control_vars.within_forward_inferenceP()) && (NIL == kb_control_vars.$within_assertion_forward_propagationP$.getDynamicValue(thread))) && (NIL == $prefer_forward_skolemization$.getDynamicValue(thread)));
        }
    }

    /**
     * A more strict version of (within-forward-inference?) that returns NIL when we're in a special forward inference mode.
     */
    @LispMethod(comment = "A more strict version of (within-forward-inference?) that returns NIL when we\'re in a special forward inference mode.")
    public static SubLObject within_normal_forward_inferenceP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((NIL != kb_control_vars.within_forward_inferenceP()) && (NIL == kb_control_vars.$within_assertion_forward_propagationP$.getDynamicValue(thread))) && (NIL == $prefer_forward_skolemization$.getDynamicValue(thread)));
    }

    /**
     * Evaluate BODY.  Any error results in calling (throw-unevaluatable).
     */
    @LispMethod(comment = "Evaluate BODY.  Any error results in calling (throw-unevaluatable).")
    public static final SubLObject throw_unevaluatable_on_error_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            SubLObject error = $sym171$ERROR;
            return list(CLET, list(error), listS(CATCH_ERROR_MESSAGE, list(error), append(body, NIL)), listS(PWHEN, error, $list_alt173));
        }
    }

    /**
     * Evaluate BODY.  Any error results in calling (throw-unevaluatable).
     */
    @LispMethod(comment = "Evaluate BODY.  Any error results in calling (throw-unevaluatable).")
    public static SubLObject throw_unevaluatable_on_error(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject error = $sym170$ERROR;
        return list(CLET, list(error), listS(CATCH_ERROR_MESSAGE, list(error), append(body, NIL)), listS(PWHEN, error, $list172));
    }

    public static final SubLObject tracing_at_level_alt(SubLObject tracee, SubLObject level) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject set_level = assoc(tracee, $tracing_level$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest();
                return makeBoolean(((level.isNumber() && set_level.isNumber()) && set_level.isPositive()) && set_level.numGE(level));
            }
        }
    }

    public static SubLObject tracing_at_level(final SubLObject tracee, final SubLObject level) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject set_level = assoc(tracee, $tracing_level$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest();
        return makeBoolean(((level.isNumber() && set_level.isNumber()) && set_level.isPositive()) && set_level.numGE(level));
    }

    public static final SubLObject if_tracing_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt174);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject tracee = NIL;
                    SubLObject level = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt174);
                    tracee = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt174);
                    level = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(PWHEN, list(TRACING_AT_LEVEL, tracee, level), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt174);
                    }
                }
            }
        }
        return NIL;
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

    public static final SubLObject with_static_structure_resourcing_alt(SubLObject macroform, SubLObject environment) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = macroform.rest();
                SubLObject current = datum;
                SubLObject resourceP = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt176);
                resourceP = current.first();
                current = current.rest();
                {
                    SubLObject body = current;
                    if (NIL != find($SL2JAVA, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        return bq_cons(PROGN, append(body, NIL));
                    }
                    return listS(CLET, list(list($structure_resourcing_make_static$, resourceP)), append(body, NIL));
                }
            }
        }
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

    public static final SubLObject possibly_with_static_structure_resourcing_alt(SubLObject macroform, SubLObject environment) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = macroform.rest();
                SubLObject current = datum;
                SubLObject body = current;
                if (NIL != find($SL2JAVA, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    return bq_cons(PROGN, append(body, NIL));
                }
                return list(PIF, $structure_resourcing_make_static$, bq_cons(WITH_STATIC_AREA, append(body, NIL)), bq_cons(PROGN, append(body, NIL)));
            }
        }
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

    public static final SubLObject define_structure_resource_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject structure = NIL;
            SubLObject link_slot = NIL;
            SubLObject mark_slot = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt180);
            structure = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt180);
            link_slot = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt180);
            mark_slot = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt180);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject v_object = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt180);
                    v_object = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject struct_name = symbol_name(structure);
                            SubLObject free_var = intern(format(NIL, $str_alt181$__A_FREE_LIST_, struct_name), UNPROVIDED);
                            SubLObject free_var_doc = format(NIL, $str_alt182$Free_list_for__A_objects, struct_name);
                            SubLObject lock_var = intern(format(NIL, $str_alt183$__A_FREE_LOCK_, struct_name), UNPROVIDED);
                            SubLObject lock_var_doc = format(NIL, $str_alt184$Lock_for__A_object_free_list, struct_name);
                            SubLObject lock_name = format(NIL, $str_alt185$_A_resource_lock, struct_name);
                            SubLObject make_static_func = intern(format(NIL, $str_alt186$MAKE_STATIC__A, struct_name), UNPROVIDED);
                            SubLObject make_static_func_doc = format(NIL, $str_alt187$Make_a_new__A_in_the_static_area, struct_name);
                            SubLObject init_func = intern(format(NIL, $str_alt188$INIT__A, struct_name), UNPROVIDED);
                            SubLObject init_func_doc = format(NIL, $str_alt189$Initialize_a__A_for_use, struct_name);
                            SubLObject get_func = intern(format(NIL, $str_alt190$GET__A, struct_name), UNPROVIDED);
                            SubLObject get_func_doc = format(NIL, $str_alt191$Get_a__A_from_the_free_list__or_m, struct_name);
                            SubLObject free_pred = intern(format(NIL, $str_alt192$FREE__A_P, struct_name), UNPROVIDED);
                            SubLObject free_pred_doc = format(NIL, $str_alt193$Check_if_OBJECT_is_a__A_that_has_, struct_name);
                            SubLObject free_func = intern(format(NIL, $str_alt194$FREE__A, struct_name), UNPROVIDED);
                            SubLObject free_func_doc = format(NIL, $str_alt195$Place_a__A_onto_the_free_list, struct_name);
                            SubLObject make_func = intern(format(NIL, $str_alt196$MAKE__A, struct_name), UNPROVIDED);
                            SubLObject test_func = intern(format(NIL, $str_alt197$_A_P, struct_name), UNPROVIDED);
                            return list(PROGN, list(DEFLEXICAL_PRIVATE, free_var, NIL, free_var_doc), list(DEFLEXICAL_PRIVATE, lock_var, list(MAKE_LOCK, lock_name), lock_var_doc), list(DEFINE_PRIVATE, make_static_func, NIL, make_static_func_doc, listS(CLET, $list_alt56, list(WITH_STATIC_AREA, list(CSETQ, OBJECT, list(make_func))), $list_alt200)), listS(DEFINE_PRIVATE, init_func, list(v_object), init_func_doc, append(body, NIL)), list(DEFINE, free_pred, $list_alt56, free_pred_doc, list(RET, list(CAND, bq_cons(test_func, $list_alt56), listS(EQ, bq_cons(mark_slot, $list_alt56), $list_alt202)))), listS(DEFINE, new SubLObject[]{ free_func, $list_alt56, free_func_doc, list(CHECK_TYPE, OBJECT, test_func), listS(PUNLESS, bq_cons(free_pred, $list_alt56), list(CSETQ, OBJECT, bq_cons(init_func, $list_alt56)), listS(CSETF, bq_cons(mark_slot, $list_alt56), $list_alt202), list(PWHEN, $structure_resourcing_enabled$, list(WITH_LOCK_HELD, list(lock_var), list(CSETF, bq_cons(link_slot, $list_alt56), free_var), listS(CSETQ, free_var, $list_alt56))), $list_alt206), $list_alt207 }), list(DEFINE, get_func, NIL, get_func_doc, list(PUNLESS, $structure_resourcing_enabled$, list(PIF, $structure_resourcing_make_static$, list(RET, list(init_func, list(make_static_func))), list(RET, list(init_func, list(make_func))))), list(CLET, $list_alt208, list(WITH_LOCK_HELD, list(lock_var), list(CSETQ, OBJECT, free_var), list(CDO, NIL, $list_alt210, list(PIF, bq_cons(free_pred, $list_alt56), listS(PROGN, list(CSETQ, free_var, bq_cons(link_slot, $list_alt56)), $list_alt211), list(CSETQ, OBJECT, bq_cons(link_slot, $list_alt56)))), list(PUNLESS, FOUND, list(PIF, $structure_resourcing_make_static$, list(CSETQ, OBJECT, list(make_static_func)), list(CSETQ, OBJECT, list(make_func))), listS(CSETQ, free_var, $list_alt213))), list(RET, bq_cons(init_func, $list_alt56)))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt180);
                    }
                }
            }
        }
        return NIL;
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
            return list(PROGN, list(DEFLEXICAL_PRIVATE, free_var, NIL, free_var_doc), list(DEFLEXICAL_PRIVATE, lock_var, list(MAKE_LOCK, lock_name), lock_var_doc), list(DEFINE_PRIVATE, make_static_func, NIL, make_static_func_doc, listS(CLET, $list52, list(WITH_STATIC_AREA, list(CSETQ, OBJECT, list(make_func))), $list199)), listS(DEFINE_PRIVATE, init_func, list(v_object), init_func_doc, append(body, NIL)), list(DEFINE, free_pred, $list52, free_pred_doc, list(RET, list(CAND, bq_cons(test_func, $list52), listS(EQ, bq_cons(mark_slot, $list52), $list201)))), listS(DEFINE, new SubLObject[]{ free_func, $list52, free_func_doc, list(CHECK_TYPE, OBJECT, test_func), listS(PUNLESS, bq_cons(free_pred, $list52), list(CSETQ, OBJECT, bq_cons(init_func, $list52)), listS(CSETF, bq_cons(mark_slot, $list52), $list201), list(PWHEN, $structure_resourcing_enabled$, list(WITH_LOCK_HELD, list(lock_var), list(CSETF, bq_cons(link_slot, $list52), free_var), listS(CSETQ, free_var, $list52))), $list205), $list206 }), list(DEFINE, get_func, NIL, get_func_doc, list(PUNLESS, $structure_resourcing_enabled$, list(PIF, $structure_resourcing_make_static$, list(RET, list(init_func, list(make_static_func))), list(RET, list(init_func, list(make_func))))), list(CLET, $list207, list(WITH_LOCK_HELD, list(lock_var), list(CSETQ, OBJECT, free_var), list(CDO, NIL, $list209, list(PIF, bq_cons(free_pred, $list52), listS(PROGN, list(CSETQ, free_var, bq_cons(link_slot, $list52)), $list210), list(CSETQ, OBJECT, bq_cons(link_slot, $list52)))), list(PUNLESS, FOUND, list(PIF, $structure_resourcing_make_static$, list(CSETQ, OBJECT, list(make_static_func)), list(CSETQ, OBJECT, list(make_func))), listS(CSETQ, free_var, $list212))), list(RET, bq_cons(init_func, $list52)))));
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

    public static final SubLObject noting_progress_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt214);
            string = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, $list_alt215, list(NOTING_PROGRESS_PREAMBLE, string), append(body, $list_alt217));
            }
        }
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
        return listS(CLET, list(new SubLObject[]{ list(str, string), $list216, $list217, $list218, $list219, $list220, $list221, $list222, list($silent_progressP$, listS(FIF, str, $list225)) }), list(NOTING_PROGRESS_PREAMBLE, str), append(body, $list227));
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

    public static final SubLObject noting_progress_preamble_alt(SubLObject string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $silent_progressP$.getDynamicValue(thread)) {
                format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt219$___A, string);
                force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
            }
            return NIL;
        }
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

    public static final SubLObject noting_progress_postamble_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $silent_progressP$.getDynamicValue(thread)) {
                {
                    SubLObject elapsed = subl_promotions.elapsed_universal_time($noting_progress_start_time$.getDynamicValue(thread), UNPROVIDED);
                    write_string($str_alt221$_DONE__, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    write_string(numeric_date_utilities.elapsed_time_abbreviation_string(elapsed), StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    write_string($str_alt222$_, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    terpri(StreamsLow.$standard_output$.getDynamicValue(thread));
                    force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
                }
            }
            return NIL;
        }
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
                } else
                    if ($int$100.eql($progress_notification_count$.getDynamicValue(thread))) {
                        $progress_elapsed_seconds_for_notification$.setDynamicValue(FIFTEEN_INTEGER, thread);
                    } else
                        if ($int$200.eql($progress_notification_count$.getDynamicValue(thread))) {
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

    public static final SubLObject noting_activity_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt214);
            string = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return bq_cons(PROGN, append(body, NIL));
            }
        }
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

    public static final SubLObject noting_percent_progress_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt214);
            string = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, $list_alt223, list(NOTING_PERCENT_PROGRESS_PREAMBLE, string), append(body, $list_alt225));
            }
        }
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

    public static final SubLObject noting_percent_progress_preamble_alt(SubLObject string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $silent_progressP$.getDynamicValue(thread)) {
                format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt227$___A____, string);
                force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
            }
            return NIL;
        }
    }

    public static SubLObject noting_percent_progress_preamble(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == $silent_progressP$.getDynamicValue(thread)) && (NIL == $percent_progress_delayed_mode_seconds$.getDynamicValue(thread))) {
            format(StreamsLow.$standard_output$.getDynamicValue(thread), $str232$___A, Strings.string_trim($list233, string));
            force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
        }
        return NIL;
    }

    public static final SubLObject noting_percent_progress_postamble_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $silent_progressP$.getDynamicValue(thread)) {
                {
                    SubLObject elapsed = subl_promotions.elapsed_universal_time($percent_progress_start_time$.getDynamicValue(thread), UNPROVIDED);
                    write_string($str_alt221$_DONE__, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    write_string(numeric_date_utilities.elapsed_time_abbreviation_string(elapsed), StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    if (elapsed.numG($int$600)) {
                        format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt230$__ended__A, numeric_date_utilities.time_abbreviation_string(UNPROVIDED));
                    }
                    write_string($str_alt231$___, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    terpri(StreamsLow.$standard_output$.getDynamicValue(thread));
                    force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
                }
            }
            return NIL;
        }
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

    public static final SubLObject note_percent_progress_alt(SubLObject index, SubLObject max) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != $silent_progressP$.getDynamicValue(thread)) || (NIL == $within_noting_percent_progress$.getDynamicValue(thread)))) {
                if (NIL != index) {
                    {
                        SubLObject percent = compute_percent_progress(index, max);
                        if (percent.numG($last_percent_progress_index$.getDynamicValue(thread))) {
                            {
                                SubLObject elapsed = subl_promotions.elapsed_universal_time($percent_progress_start_time$.getDynamicValue(thread), UNPROVIDED);
                                SubLObject predicted_total_seconds = truncate(multiply(elapsed, $int$100), percent);
                                if ((percent.numE(ONE_INTEGER) || index.numE(ONE_INTEGER)) && predicted_total_seconds.numGE(multiply(FIVE_INTEGER, numeric_date_utilities.$seconds_in_a_minute$.getGlobalValue()))) {
                                    write_string($str_alt233$_, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                    possibly_note_percent_progress_prediction(elapsed, predicted_total_seconds, $int$300, $int$600);
                                } else {
                                    if ((percent.numE(TWO_INTEGER) || index.numE(TWO_INTEGER)) && predicted_total_seconds.numGE(multiply(TEN_INTEGER, numeric_date_utilities.$seconds_in_a_minute$.getGlobalValue()))) {
                                        write_string($str_alt233$_, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                        possibly_note_percent_progress_prediction(elapsed, predicted_total_seconds, $int$300, $int$600);
                                    } else {
                                        if (predicted_total_seconds.numLE(FIVE_INTEGER)) {
                                        } else {
                                            if (mod(percent, TEN_INTEGER).numE(ZERO_INTEGER)) {
                                                print_progress_percent(percent);
                                                possibly_note_percent_progress_prediction(elapsed, predicted_total_seconds, $int$600, $int$1200);
                                            } else {
                                                if (max.numL($int$60)) {
                                                    write_string($str_alt233$_, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                                } else {
                                                    if (predicted_total_seconds.numLE(TWENTY_INTEGER)) {
                                                    } else {
                                                        if (mod(percent, TWO_INTEGER).numE(ZERO_INTEGER)) {
                                                            write_string($str_alt233$_, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                                        }
                                                        if ($last_percent_progress_prediction$.getDynamicValue(thread).isNumber()) {
                                                            {
                                                                SubLObject threshold = add($last_percent_progress_prediction$.getDynamicValue(thread), integerDivide($last_percent_progress_prediction$.getDynamicValue(thread), TEN_INTEGER));
                                                                if (predicted_total_seconds.numG(threshold)) {
                                                                    print_progress_percent(percent);
                                                                    possibly_note_percent_progress_prediction(elapsed, predicted_total_seconds, threshold, $int$1200);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
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
                        } else
                            if ((percent.numE(TWO_INTEGER) || index.numE(TWO_INTEGER)) && predicted_total_seconds.numGE(multiply(TEN_INTEGER, numeric_date_utilities.$seconds_in_a_minute$.getGlobalValue()))) {
                                write_string($str263$02_, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                possibly_note_percent_progress_prediction(elapsed, predicted_total_seconds, $int$300, $int$600);
                            } else
                                if (!predicted_total_seconds.numLE(TWO_INTEGER)) {
                                    if (max.numL(TEN_INTEGER)) {
                                        print_progress_percent(percent);
                                    } else
                                        if (!predicted_total_seconds.numLE(FIVE_INTEGER)) {
                                            if (mod(percent, TEN_INTEGER).numE(ZERO_INTEGER)) {
                                                print_progress_percent(percent);
                                                possibly_note_percent_progress_prediction(elapsed, predicted_total_seconds, $int$600, $int$1200);
                                            } else
                                                if (max.numL($int$30)) {
                                                    if (mod(index, ash(max, $int$_2)).numE(ZERO_INTEGER)) {
                                                        print_progress_percent(percent);
                                                    } else {
                                                        write_string($str247$_, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                                    }
                                                } else
                                                    if (!predicted_total_seconds.numLE(TWENTY_INTEGER)) {
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

    public static final SubLObject print_progress_percent_alt(SubLObject percent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            write_string($str_alt237$_, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
            print_2_digit_nonnegative_integer(percent, StreamsLow.$standard_output$.getDynamicValue(thread));
            write_string($str_alt238$_, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
            return NIL;
        }
    }

    public static SubLObject print_progress_percent(final SubLObject percent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        write_string($$$_, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        print_2_digit_nonnegative_integer(percent, StreamsLow.$standard_output$.getDynamicValue(thread));
        write_string($str267$_, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject print_2_digit_nonnegative_integer_alt(SubLObject integer, SubLObject stream) {
        if (integer.numL(TEN_INTEGER)) {
            write_string($$$0, stream, UNPROVIDED, UNPROVIDED);
        }
        write_string(princ_to_string(integer), stream, UNPROVIDED, UNPROVIDED);
        return integer;
    }

    public static SubLObject print_2_digit_nonnegative_integer(final SubLObject integer, final SubLObject stream) {
        if (integer.numL(TEN_INTEGER)) {
            write_string($$$0, stream, UNPROVIDED, UNPROVIDED);
        }
        write_string(princ_to_string(integer), stream, UNPROVIDED, UNPROVIDED);
        return integer;
    }

    public static final SubLObject possibly_note_percent_progress_prediction_alt(SubLObject elapsed, SubLObject predicted_total_seconds, SubLObject threshhold, SubLObject show_ending_threshold) {
        if (show_ending_threshold == UNPROVIDED) {
            show_ending_threshold = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (predicted_total_seconds.numG(threshhold) && predicted_total_seconds.numG(elapsed)) {
                {
                    SubLObject note_string = cconcatenate($str_alt240$__, new SubLObject[]{ format_nil.format_nil_a_no_copy(numeric_date_utilities.elapsed_time_abbreviation_string(elapsed)), $str_alt241$_of_, format_nil.$format_nil_tilde$.getGlobalValue(), format_nil.format_nil_a_no_copy(numeric_date_utilities.elapsed_time_abbreviation_string(predicted_total_seconds)) });
                    write_string(note_string, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                }
                if (show_ending_threshold.isInteger() && predicted_total_seconds.numG(show_ending_threshold)) {
                    write_string($str_alt242$__ending__, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    write_string(numeric_date_utilities.time_abbreviation_string(add($percent_progress_start_time$.getDynamicValue(thread), predicted_total_seconds)), StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                }
                write_string($str_alt222$_, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                terpri(StreamsLow.$standard_output$.getDynamicValue(thread));
                write_string($str_alt243$__, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                $last_percent_progress_prediction$.setDynamicValue(predicted_total_seconds, thread);
                return T;
            }
            return NIL;
        }
    }

    public static SubLObject possibly_note_percent_progress_prediction(final SubLObject elapsed, final SubLObject predicted_total_seconds, final SubLObject threshhold, SubLObject show_ending_threshold) {
        if (show_ending_threshold == UNPROVIDED) {
            show_ending_threshold = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (predicted_total_seconds.numG(threshhold) && predicted_total_seconds.numG(elapsed)) {
            final SubLObject note_string = cconcatenate($str236$__, new SubLObject[]{ format_nil.format_nil_a_no_copy(numeric_date_utilities.elapsed_time_abbreviation_string(elapsed)), $$$_of_, format_nil.$format_nil_tilde$.getGlobalValue(), format_nil.format_nil_a_no_copy(numeric_date_utilities.elapsed_time_abbreviation_string(predicted_total_seconds)) });
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

    public static final SubLObject compute_percent_progress_alt(SubLObject index, SubLObject max) {
        if (max.numLE(ZERO_INTEGER) || index.numLE(ZERO_INTEGER)) {
            return ZERO_INTEGER;
        } else {
            if (index.numGE(max)) {
                return $int$100;
            } else {
                {
                    SubLObject target_length = TEN_INTEGER;
                    SubLObject current_length = integer_length(max);
                    SubLObject scale_factor = subtract(target_length, current_length);
                    if (scale_factor.isNegative()) {
                        index = ash(index, scale_factor);
                        max = ash(max, scale_factor);
                    }
                }
                return min($int$99, integerDivide(multiply($int$100, index), max));
            }
        }
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

    public static final SubLObject progress_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject current = get_universal_time();
                format(T, $str_alt246$___A____D_of__D___02D___Done_at__, new SubLObject[]{ $progress_note$.getDynamicValue(thread), $progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread), integerDivide(multiply($progress_sofar$.getDynamicValue(thread), $int$100), $progress_total$.getDynamicValue(thread)), $progress_sofar$.getDynamicValue(thread).numE(ZERO_INTEGER) ? ((SubLObject) ($$$whenever)) : numeric_date_utilities.timestring(add($progress_start_time$.getDynamicValue(thread), integerDivide(multiply($progress_total$.getDynamicValue(thread), subtract(current, $progress_start_time$.getDynamicValue(thread))), $progress_sofar$.getDynamicValue(thread)))) });
                return NIL;
            }
        }
    }

    public static SubLObject progress() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject current = get_universal_time();
        format(T, $str273$___A____D_of__D___02D___Done_at__, new SubLObject[]{ $progress_note$.getDynamicValue(thread), $progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread), integerDivide(multiply($progress_sofar$.getDynamicValue(thread), $int$100), $progress_total$.getDynamicValue(thread)), $progress_sofar$.getDynamicValue(thread).numE(ZERO_INTEGER) ? $$$whenever : numeric_date_utilities.timestring(add($progress_start_time$.getDynamicValue(thread), integerDivide(multiply($progress_total$.getDynamicValue(thread), subtract(current, $progress_start_time$.getDynamicValue(thread))), $progress_sofar$.getDynamicValue(thread)))) });
        return NIL;
    }

    public static final SubLObject progress_cdotimes_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt248);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    SubLObject total = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt248);
                    var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt248);
                    total = current.first();
                    current = current.rest();
                    {
                        SubLObject message = (current.isCons()) ? ((SubLObject) (current.first())) : $$$cdotimes;
                        destructuring_bind_must_listp(current, datum, $list_alt248);
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                return list(PROGN, list(CSETQ, $progress_note$, message), $list_alt251, list(CSETQ, $progress_total$, total), $list_alt253, list(NOTING_PERCENT_PROGRESS, $progress_note$, listS(CDOTIMES, bq_cons(var, $list_alt255), $list_alt256, $list_alt257, append(body, NIL))));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt248);
                        }
                    }
                }
            }
        }
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

    public static final SubLObject progress_csome_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt258);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    SubLObject list = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt258);
                    var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt258);
                    list = current.first();
                    current = current.rest();
                    {
                        SubLObject message = (current.isCons()) ? ((SubLObject) (current.first())) : $$$cdolist;
                        destructuring_bind_must_listp(current, datum, $list_alt258);
                        current = current.rest();
                        {
                            SubLObject endvar = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                            destructuring_bind_must_listp(current, datum, $list_alt258);
                            current = current.rest();
                            if (NIL == current) {
                                current = temp;
                                {
                                    SubLObject body = current;
                                    SubLObject list_var = $sym260$LIST_VAR;
                                    return list(CLET, list(list(list_var, list)), list(CSETQ, $progress_note$, message), $list_alt251, list(CSETQ, $progress_total$, list(LENGTH, list_var)), $list_alt253, list(NOTING_PERCENT_PROGRESS, $progress_note$, listS(CSOME, list(var, list_var, endvar), $list_alt256, $list_alt257, append(body, NIL))));
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt258);
                            }
                        }
                    }
                }
            }
        }
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

    public static final SubLObject progress_cdolist_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt264);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    SubLObject list = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt264);
                    var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt264);
                    list = current.first();
                    current = current.rest();
                    {
                        SubLObject message = (current.isCons()) ? ((SubLObject) (current.first())) : $$$cdolist;
                        destructuring_bind_must_listp(current, datum, $list_alt264);
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(PROGRESS_CSOME, list(var, list, message), append(body, NIL));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt264);
                        }
                    }
                }
            }
        }
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

    /**
     * If MESSAGE is specified, will print a progress indicator, otherwise will be silent.
     */
    @LispMethod(comment = "If MESSAGE is specified, will print a progress indicator, otherwise will be silent.")
    public static final SubLObject possibly_progress_cdolist_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt266);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    SubLObject list = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt266);
                    var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt266);
                    list = current.first();
                    current = current.rest();
                    {
                        SubLObject message = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt266);
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject message_var = $sym267$MESSAGE_VAR;
                                return list(CLET, list(list(message_var, message)), list(PIF, message_var, listS(PROGRESS_CDOLIST, list(var, list, message), append(body, NIL)), listS(CDOLIST, list(var, list), append(body, NIL))));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt266);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * If MESSAGE is specified, will print a progress indicator, otherwise will be silent.
     */
    @LispMethod(comment = "If MESSAGE is specified, will print a progress indicator, otherwise will be silent.")
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

    public static final SubLObject progress_cdohash_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt269);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject key = NIL;
                    SubLObject val = NIL;
                    SubLObject table = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt269);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt269);
                    val = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt269);
                    table = current.first();
                    current = current.rest();
                    {
                        SubLObject message = (current.isCons()) ? ((SubLObject) (current.first())) : $$$cdohash;
                        destructuring_bind_must_listp(current, datum, $list_alt269);
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject table_var = $sym271$TABLE_VAR;
                                return list(CLET, list(list(table_var, table)), list(CSETQ, $progress_note$, message), $list_alt251, list(CSETQ, $progress_total$, list(HASH_TABLE_COUNT, table_var)), $list_alt253, list(NOTING_PERCENT_PROGRESS, $progress_note$, listS(CDOHASH, list(key, val, table_var), $list_alt256, $list_alt257, append(body, NIL))));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt269);
                        }
                    }
                }
            }
        }
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

    public static final SubLObject progress_do_set_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt274);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject elem = NIL;
                    SubLObject v_set = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt274);
                    elem = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt274);
                    v_set = current.first();
                    current = current.rest();
                    {
                        SubLObject message = (current.isCons()) ? ((SubLObject) (current.first())) : $str_alt275$do_set;
                        destructuring_bind_must_listp(current, datum, $list_alt274);
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject set_var = $sym276$SET_VAR;
                                return list(CLET, list(list(set_var, v_set)), list(CSETQ, $progress_note$, message), $list_alt251, list(CSETQ, $progress_total$, list(SET_SIZE, set_var)), $list_alt253, list(NOTING_PERCENT_PROGRESS, $progress_note$, listS(DO_SET, list(elem, set_var), $list_alt256, $list_alt257, append(body, NIL))));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt274);
                        }
                    }
                }
            }
        }
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

    public static final SubLObject noting_elapsed_time_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt279);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject allow_other_keys_p = NIL;
                    SubLObject rest = current;
                    SubLObject bad = NIL;
                    SubLObject current_7 = NIL;
                    for (; NIL != rest;) {
                        destructuring_bind_must_consp(rest, datum, $list_alt279);
                        current_7 = rest.first();
                        rest = rest.rest();
                        destructuring_bind_must_consp(rest, datum, $list_alt279);
                        if (NIL == member(current_7, $list_alt280, UNPROVIDED, UNPROVIDED)) {
                            bad = T;
                        }
                        if (current_7 == $ALLOW_OTHER_KEYS) {
                            allow_other_keys_p = rest.first();
                        }
                        rest = rest.rest();
                    }
                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                        cdestructuring_bind_error(datum, $list_alt279);
                    }
                    {
                        SubLObject message_tail = property_list_member($MESSAGE, current);
                        SubLObject message = (NIL != message_tail) ? ((SubLObject) (cadr(message_tail))) : NIL;
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject message_var = $sym282$MESSAGE_VAR;
                            SubLObject start_time = $sym283$START_TIME;
                            return listS(CLET, list(list(message_var, message), list(start_time, list(NOTING_ELAPSED_TIME_PREAMBLE, message_var))), append(body, list(list(NOTING_ELAPSED_TIME_POSTAMBLE, message_var, start_time))));
                        }
                    }
                }
            }
        }
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

    public static final SubLObject noting_elapsed_time_preamble_alt(SubLObject message) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $silent_progressP$.getDynamicValue(thread)) {
                if (NIL != message) {
                    {
                        SubLObject start_time = get_universal_time();
                        format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt287$___A_started__at__A, message, numeric_date_utilities.timestring(start_time));
                        force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
                        return start_time;
                    }
                }
            }
            return NIL;
        }
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

    public static final SubLObject noting_elapsed_time_postamble_alt(SubLObject message, SubLObject start_time) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $silent_progressP$.getDynamicValue(thread)) {
                if (NIL != message) {
                    {
                        SubLObject end_time = get_universal_time();
                        format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt288$___A_finished_at__A_after_A, new SubLObject[]{ message, numeric_date_utilities.timestring(end_time), numeric_date_utilities.elapsed_seconds_string(subtract(end_time, start_time)) });
                        force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject noting_elapsed_time_postamble(final SubLObject message, final SubLObject start_time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == $silent_progressP$.getDynamicValue(thread)) && (NIL != message)) {
            final SubLObject end_time = get_universal_time();
            format(StreamsLow.$standard_output$.getDynamicValue(thread), $str314$___A_finished_at__A_after_A, new SubLObject[]{ message, numeric_date_utilities.timestring(end_time), numeric_date_utilities.elapsed_seconds_string(subtract(end_time, start_time)) });
            force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
        }
        return NIL;
    }

    /**
     * Evaluate BODY within the context assumed by a Cyc server
     */
    @LispMethod(comment = "Evaluate BODY within the context assumed by a Cyc server")
    public static final SubLObject with_cyc_server_handling_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(WITH_SUBLISP_ERROR_HANDLING, list(CLET, $list_alt290, listS(CUNWIND_PROTECT, list(PROGN, $list_alt291, bq_cons(PROGN, append(body, NIL))), $list_alt292)));
        }
    }

    /**
     * Evaluate BODY within the context assumed by a Cyc server
     */
    @LispMethod(comment = "Evaluate BODY within the context assumed by a Cyc server")
    public static SubLObject with_cyc_server_handling(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(WITH_SUBLISP_ERROR_HANDLING, list(CLET, $list316, listS(CUNWIND_PROTECT, list(PROGN, $list317, bq_cons(PROGN, append(body, NIL))), $list318)));
    }

    public static final SubLObject with_cyc_io_syntax_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return with_cyc_io_syntax_internal(body);
        }
    }

    public static SubLObject with_cyc_io_syntax(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return with_cyc_io_syntax_internal(body);
    }

    public static final SubLObject with_cyc_io_syntax_internal_alt(SubLObject body) {
        return listS(CLET, $list_alt293, append(body, NIL));
    }

    public static SubLObject with_cyc_io_syntax_internal(final SubLObject body) {
        return listS(CLET, $list319, append(body, NIL));
    }

    public static final SubLObject with_sublisp_runtime_assumptions_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(WITH_CYC_SERVER_HANDLING, list(WITH_CYC_IO_SYNTAX, listS(CLET, $list_alt296, append(body, NIL))));
        }
    }

    public static SubLObject with_sublisp_runtime_assumptions(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(WITH_CYC_SERVER_HANDLING, list(WITH_CYC_IO_SYNTAX, listS(CLET, $list322, append(body, NIL))));
    }

    /**
     * Execute BODY within a scope where CYCLIST is treated as the current cyclist.
     *
     * @unknown *THE-CYCLIST* is *not* shadowed, so operations performed by other threads may also be
    attributed to CYCLIST.
     */
    @LispMethod(comment = "Execute BODY within a scope where CYCLIST is treated as the current cyclist.\r\n\r\n@unknown *THE-CYCLIST* is *not* shadowed, so operations performed by other threads may also be\r\nattributed to CYCLIST.")
    public static final SubLObject with_the_cyclist_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt297);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject cyclist = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt297);
                    cyclist = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject old_cyclist = $sym298$OLD_CYCLIST;
                            return list(CLET, list(bq_cons(old_cyclist, $list_alt299)), list(CUNWIND_PROTECT, listS(PROGN, list(SET_THE_CYCLIST, cyclist), append(body, NIL)), list(SET_THE_CYCLIST, old_cyclist)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt297);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Execute BODY within a scope where CYCLIST is treated as the current cyclist.
     *
     * @unknown *THE-CYCLIST* is *not* shadowed, so operations performed by other threads may also be
    attributed to CYCLIST.
     */
    @LispMethod(comment = "Execute BODY within a scope where CYCLIST is treated as the current cyclist.\r\n\r\n@unknown *THE-CYCLIST* is *not* shadowed, so operations performed by other threads may also be\r\nattributed to CYCLIST.")
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

    /**
     * Execute BODY within a scope where CYCLIST is treated as the current cyclist.
     *
     * @unknown *THE-CYCLIST* is shadowed, so other threads will not be affected.
     */
    @LispMethod(comment = "Execute BODY within a scope where CYCLIST is treated as the current cyclist.\r\n\r\n@unknown *THE-CYCLIST* is shadowed, so other threads will not be affected.")
    public static final SubLObject with_different_cyclist_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt297);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject cyclist = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt297);
                    cyclist = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CLET, $list_alt301, list(SET_THE_CYCLIST, cyclist), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt297);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Execute BODY within a scope where CYCLIST is treated as the current cyclist.
     *
     * @unknown *THE-CYCLIST* is shadowed, so other threads will not be affected.
     */
    @LispMethod(comment = "Execute BODY within a scope where CYCLIST is treated as the current cyclist.\r\n\r\n@unknown *THE-CYCLIST* is shadowed, so other threads will not be affected.")
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

    /**
     * Iterate BODY over each element of BINDINGS within the scope of EL-VARIABLES being
     * bound from the BINDINGS.
     *
     * @unknown goolsbey
     */
    @LispMethod(comment = "Iterate BODY over each element of BINDINGS within the scope of EL-VARIABLES being\r\nbound from the BINDINGS.\r\n\r\n@unknown goolsbey\nIterate BODY over each element of BINDINGS within the scope of EL-VARIABLES being\nbound from the BINDINGS.")
    public static final SubLObject do_bindings_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject el_variables = NIL;
            SubLObject v_bindings = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt302);
            el_variables = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt302);
            v_bindings = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject binding = $sym303$BINDING;
                SubLObject var_specs = do_bindings_var_specs(el_variables, binding);
                return list(CDOLIST, list(binding, v_bindings), listS(CLET, append(var_specs, NIL), append(body, NIL)));
            }
        }
    }

    /**
     * Iterate BODY over each element of BINDINGS within the scope of EL-VARIABLES being
     * bound from the BINDINGS.
     *
     * @unknown goolsbey
     */
    @LispMethod(comment = "Iterate BODY over each element of BINDINGS within the scope of EL-VARIABLES being\r\nbound from the BINDINGS.\r\n\r\n@unknown goolsbey\nIterate BODY over each element of BINDINGS within the scope of EL-VARIABLES being\nbound from the BINDINGS.")
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

    public static final SubLObject do_bindings_var_specs_alt(SubLObject el_variables, SubLObject iteration_var) {
        {
            SubLObject var_specs = NIL;
            SubLObject cdolist_list_var = el_variables;
            SubLObject el_variable = NIL;
            for (el_variable = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , el_variable = cdolist_list_var.first()) {
                {
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
                }
            }
            return nreverse(var_specs);
        }
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

    /**
     * Expands into code that evaluates to T if list is a list of one and only one element,
     * otherwise, returns NIL.
     * ;;{{{
     * Note that this macro does no checking to verify that list
     * is a cons  It should only be used when it is known that list is a cons.  Thus,
     * fast-singleton-macro-p should not be used on the empty list.
     * ;;}}}
     */
    @LispMethod(comment = "Expands into code that evaluates to T if list is a list of one and only one element,\r\notherwise, returns NIL.\r\n;;{{{\r\nNote that this macro does no checking to verify that list\r\nis a cons  It should only be used when it is known that list is a cons.  Thus,\r\nfast-singleton-macro-p should not be used on the empty list.\r\n;;}}}\nExpands into code that evaluates to T if list is a list of one and only one element,\notherwise, returns NIL.\n;;{{{\nNote that this macro does no checking to verify that list\nis a cons  It should only be used when it is known that list is a cons.  Thus,\nfast-singleton-macro-p should not be used on the empty list.\n;;}}}")
    public static final SubLObject fast_singleton_macro_p_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject list = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt308);
            list = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(NULL, list(CDR, list));
            } else {
                cdestructuring_bind_error(datum, $list_alt308);
            }
        }
        return NIL;
    }

    /**
     * Expands into code that evaluates to T if list is a list of one and only one element,
     * otherwise, returns NIL.
     * ;;{{{
     * Note that this macro does no checking to verify that list
     * is a cons  It should only be used when it is known that list is a cons.  Thus,
     * fast-singleton-macro-p should not be used on the empty list.
     * ;;}}}
     */
    @LispMethod(comment = "Expands into code that evaluates to T if list is a list of one and only one element,\r\notherwise, returns NIL.\r\n;;{{{\r\nNote that this macro does no checking to verify that list\r\nis a cons  It should only be used when it is known that list is a cons.  Thus,\r\nfast-singleton-macro-p should not be used on the empty list.\r\n;;}}}\nExpands into code that evaluates to T if list is a list of one and only one element,\notherwise, returns NIL.\n;;{{{\nNote that this macro does no checking to verify that list\nis a cons  It should only be used when it is known that list is a cons.  Thus,\nfast-singleton-macro-p should not be used on the empty list.\n;;}}}")
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

    /**
     * Returns T iff list is a list of more than one element, otherwise returns NIL.
     * ;;{{{
     * This function works on all lists.  It assumes that the car of any sublist is a list.
     * ;;}}}
     */
    @LispMethod(comment = "Returns T iff list is a list of more than one element, otherwise returns NIL.\r\n;;{{{\r\nThis function works on all lists.  It assumes that the car of any sublist is a list.\r\n;;}}}\nReturns T iff list is a list of more than one element, otherwise returns NIL.\n;;{{{\nThis function works on all lists.  It assumes that the car of any sublist is a list.\n;;}}}")
    public static final SubLObject pluralityP_alt(SubLObject list) {
        return makeBoolean(list.isCons() && list.rest().isCons());
    }

    /**
     * Returns T iff list is a list of more than one element, otherwise returns NIL.
     * ;;{{{
     * This function works on all lists.  It assumes that the car of any sublist is a list.
     * ;;}}}
     */
    @LispMethod(comment = "Returns T iff list is a list of more than one element, otherwise returns NIL.\r\n;;{{{\r\nThis function works on all lists.  It assumes that the car of any sublist is a list.\r\n;;}}}\nReturns T iff list is a list of more than one element, otherwise returns NIL.\n;;{{{\nThis function works on all lists.  It assumes that the car of any sublist is a list.\n;;}}}")
    public static SubLObject pluralityP(final SubLObject list) {
        return makeBoolean(list.isCons() && list.rest().isCons());
    }

    /**
     * Expands into code that evaluates to T if list is a list of more than one element,
     * otherwise, it returns NIL.
     * ;;{{{
     * Note that this macro does no checking to verify that list
     * is a cons.  It should only be used when it is known that list is a cons.
     * ;;}}}
     */
    @LispMethod(comment = "Expands into code that evaluates to T if list is a list of more than one element,\r\notherwise, it returns NIL.\r\n;;{{{\r\nNote that this macro does no checking to verify that list\r\nis a cons.  It should only be used when it is known that list is a cons.\r\n;;}}}\nExpands into code that evaluates to T if list is a list of more than one element,\notherwise, it returns NIL.\n;;{{{\nNote that this macro does no checking to verify that list\nis a cons.  It should only be used when it is known that list is a cons.\n;;}}}")
    public static final SubLObject fast_plurality_macro_p_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject list = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt308);
            list = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(CONSP, list(CDR, list));
            } else {
                cdestructuring_bind_error(datum, $list_alt308);
            }
        }
        return NIL;
    }

    /**
     * Expands into code that evaluates to T if list is a list of more than one element,
     * otherwise, it returns NIL.
     * ;;{{{
     * Note that this macro does no checking to verify that list
     * is a cons.  It should only be used when it is known that list is a cons.
     * ;;}}}
     */
    @LispMethod(comment = "Expands into code that evaluates to T if list is a list of more than one element,\r\notherwise, it returns NIL.\r\n;;{{{\r\nNote that this macro does no checking to verify that list\r\nis a cons.  It should only be used when it is known that list is a cons.\r\n;;}}}\nExpands into code that evaluates to T if list is a list of more than one element,\notherwise, it returns NIL.\n;;{{{\nNote that this macro does no checking to verify that list\nis a cons.  It should only be used when it is known that list is a cons.\n;;}}}")
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

    /**
     * Expands into a form that evaluates body for every sublist of list-expression with
     * var bound to each sublist iteratively.
     * ;;{{{
     * Note that unlike dolist, dosublist binds the variable passed to var to subsequent
     * sublists rather than subsequent elements.
     * ;;}}}
     */
    @LispMethod(comment = "Expands into a form that evaluates body for every sublist of list-expression with\r\nvar bound to each sublist iteratively.\r\n;;{{{\r\nNote that unlike dolist, dosublist binds the variable passed to var to subsequent\r\nsublists rather than subsequent elements.\r\n;;}}}\nExpands into a form that evaluates body for every sublist of list-expression with\nvar bound to each sublist iteratively.\n;;{{{\nNote that unlike dolist, dosublist binds the variable passed to var to subsequent\nsublists rather than subsequent elements.\n;;}}}")
    public static final SubLObject cdosublists_alt(SubLObject macroform, SubLObject environment) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = macroform.rest();
                SubLObject current = datum;
                destructuring_bind_must_consp(current, datum, $list_alt312);
                {
                    SubLObject temp = current.rest();
                    current = current.first();
                    {
                        SubLObject var = NIL;
                        SubLObject list_expression = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt312);
                        var = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt312);
                        list_expression = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                if (!var.isSymbol()) {
                                    Errors.error($util_var_error_format_string$.getDynamicValue(thread), CDOSUBLISTS, var);
                                }
                                return listS(CDO, list(list(var, list_expression, list(CDR, var))), list(list(NULL, var)), body);
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt312);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Expands into a form that evaluates body for every sublist of list-expression with
     * var bound to each sublist iteratively.
     * ;;{{{
     * Note that unlike dolist, dosublist binds the variable passed to var to subsequent
     * sublists rather than subsequent elements.
     * ;;}}}
     */
    @LispMethod(comment = "Expands into a form that evaluates body for every sublist of list-expression with\r\nvar bound to each sublist iteratively.\r\n;;{{{\r\nNote that unlike dolist, dosublist binds the variable passed to var to subsequent\r\nsublists rather than subsequent elements.\r\n;;}}}\nExpands into a form that evaluates body for every sublist of list-expression with\nvar bound to each sublist iteratively.\n;;{{{\nNote that unlike dolist, dosublist binds the variable passed to var to subsequent\nsublists rather than subsequent elements.\n;;}}}")
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

    /**
     * Expands into a form that evaluates body for every sublist of list-expression with
     * sublist-var bound to each sublist iteratively and element-var bound to the
     * car of each sublist.  Thus, this form behaves like cdolist and cdosublists
     * simultaneously.
     * ;;{{{
     * Note that unlike cdolist, this control structure binds two variables.
     * the first variable is iteratively bound to elements of list-expression evaluated
     * and the second variable is iteratively bound to sublists of list-expression
     * evaluated.
     * ;;}}}
     */
    @LispMethod(comment = "Expands into a form that evaluates body for every sublist of list-expression with\r\nsublist-var bound to each sublist iteratively and element-var bound to the\r\ncar of each sublist.  Thus, this form behaves like cdolist and cdosublists\r\nsimultaneously.\r\n;;{{{\r\nNote that unlike cdolist, this control structure binds two variables.\r\nthe first variable is iteratively bound to elements of list-expression evaluated\r\nand the second variable is iteratively bound to sublists of list-expression\r\nevaluated.\r\n;;}}}\nExpands into a form that evaluates body for every sublist of list-expression with\nsublist-var bound to each sublist iteratively and element-var bound to the\ncar of each sublist.  Thus, this form behaves like cdolist and cdosublists\nsimultaneously.\n;;{{{\nNote that unlike cdolist, this control structure binds two variables.\nthe first variable is iteratively bound to elements of list-expression evaluated\nand the second variable is iteratively bound to sublists of list-expression\nevaluated.\n;;}}}")
    public static final SubLObject cdolist_and_sublists_alt(SubLObject macroform, SubLObject environment) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = macroform.rest();
                SubLObject current = datum;
                destructuring_bind_must_consp(current, datum, $list_alt314);
                {
                    SubLObject temp = current.rest();
                    current = current.first();
                    {
                        SubLObject element_var = NIL;
                        SubLObject sublist_var = NIL;
                        SubLObject list_expression = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt314);
                        element_var = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt314);
                        sublist_var = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt314);
                        list_expression = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                if (!element_var.isSymbol()) {
                                    Errors.error($util_var_error_format_string$.getDynamicValue(thread), CDOLIST_AND_SUBLISTS, element_var);
                                }
                                if (!sublist_var.isSymbol()) {
                                    Errors.error($util_var_error_format_string$.getDynamicValue(thread), CDOLIST_AND_SUBLISTS, sublist_var);
                                }
                                return listS(CDO, list(list(sublist_var, list_expression, list(CDR, sublist_var)), list(element_var, list(CAR, sublist_var), list(CAR, sublist_var))), list(list(NULL, sublist_var)), body);
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt314);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Expands into a form that evaluates body for every sublist of list-expression with
     * sublist-var bound to each sublist iteratively and element-var bound to the
     * car of each sublist.  Thus, this form behaves like cdolist and cdosublists
     * simultaneously.
     * ;;{{{
     * Note that unlike cdolist, this control structure binds two variables.
     * the first variable is iteratively bound to elements of list-expression evaluated
     * and the second variable is iteratively bound to sublists of list-expression
     * evaluated.
     * ;;}}}
     */
    @LispMethod(comment = "Expands into a form that evaluates body for every sublist of list-expression with\r\nsublist-var bound to each sublist iteratively and element-var bound to the\r\ncar of each sublist.  Thus, this form behaves like cdolist and cdosublists\r\nsimultaneously.\r\n;;{{{\r\nNote that unlike cdolist, this control structure binds two variables.\r\nthe first variable is iteratively bound to elements of list-expression evaluated\r\nand the second variable is iteratively bound to sublists of list-expression\r\nevaluated.\r\n;;}}}\nExpands into a form that evaluates body for every sublist of list-expression with\nsublist-var bound to each sublist iteratively and element-var bound to the\ncar of each sublist.  Thus, this form behaves like cdolist and cdosublists\nsimultaneously.\n;;{{{\nNote that unlike cdolist, this control structure binds two variables.\nthe first variable is iteratively bound to elements of list-expression evaluated\nand the second variable is iteratively bound to sublists of list-expression\nevaluated.\n;;}}}")
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

    /**
     * Expands into a form that evaluates body for every sublist of list-expression with
     * sublist-var bound to each sublist iteratively and element-var bound to the
     * car of each sublist.  Thus, this form behaves like cdolist and cdosublists
     * simultaneously.  This form differs from cdolist-and-sublists in that one can
     * change the value of the sublist variable within the body without affecting
     * iteration.
     * ;;{{{
     * Note that unlike cdolist, this control structure binds two variables.
     * the first variable is iteratively bound to elements of list-expression evaluated
     * and the second variable is iteratively bound to sublists of list-expression
     * evaluated.
     * ;;}}}
     */
    @LispMethod(comment = "Expands into a form that evaluates body for every sublist of list-expression with\r\nsublist-var bound to each sublist iteratively and element-var bound to the\r\ncar of each sublist.  Thus, this form behaves like cdolist and cdosublists\r\nsimultaneously.  This form differs from cdolist-and-sublists in that one can\r\nchange the value of the sublist variable within the body without affecting\r\niteration.\r\n;;{{{\r\nNote that unlike cdolist, this control structure binds two variables.\r\nthe first variable is iteratively bound to elements of list-expression evaluated\r\nand the second variable is iteratively bound to sublists of list-expression\r\nevaluated.\r\n;;}}}\nExpands into a form that evaluates body for every sublist of list-expression with\nsublist-var bound to each sublist iteratively and element-var bound to the\ncar of each sublist.  Thus, this form behaves like cdolist and cdosublists\nsimultaneously.  This form differs from cdolist-and-sublists in that one can\nchange the value of the sublist variable within the body without affecting\niteration.\n;;{{{\nNote that unlike cdolist, this control structure binds two variables.\nthe first variable is iteratively bound to elements of list-expression evaluated\nand the second variable is iteratively bound to sublists of list-expression\nevaluated.\n;;}}}")
    public static final SubLObject cdolist_and_sublists_carefully_alt(SubLObject macroform, SubLObject environment) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = macroform.rest();
                SubLObject current = datum;
                destructuring_bind_must_consp(current, datum, $list_alt314);
                {
                    SubLObject temp = current.rest();
                    current = current.first();
                    {
                        SubLObject element_var = NIL;
                        SubLObject sublist_var = NIL;
                        SubLObject list_expression = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt314);
                        element_var = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt314);
                        sublist_var = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt314);
                        list_expression = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                if (!element_var.isSymbol()) {
                                    Errors.error($util_var_error_format_string$.getDynamicValue(thread), CDOLIST_AND_SUBLISTS, element_var);
                                }
                                if (!sublist_var.isSymbol()) {
                                    Errors.error($util_var_error_format_string$.getDynamicValue(thread), CDOLIST_AND_SUBLISTS, sublist_var);
                                }
                                {
                                    SubLObject next_cons_var = make_symbol($str_alt316$next_cons_var);
                                    return list(CLET, list(next_cons_var), listS(CDO, list(list(sublist_var, list_expression, next_cons_var), list(element_var, list(CAR, sublist_var), list(CAR, sublist_var))), list(list(NULL, sublist_var)), list(CSETQ, next_cons_var, list(CDR, sublist_var)), body));
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt314);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Expands into a form that evaluates body for every sublist of list-expression with
     * sublist-var bound to each sublist iteratively and element-var bound to the
     * car of each sublist.  Thus, this form behaves like cdolist and cdosublists
     * simultaneously.  This form differs from cdolist-and-sublists in that one can
     * change the value of the sublist variable within the body without affecting
     * iteration.
     * ;;{{{
     * Note that unlike cdolist, this control structure binds two variables.
     * the first variable is iteratively bound to elements of list-expression evaluated
     * and the second variable is iteratively bound to sublists of list-expression
     * evaluated.
     * ;;}}}
     */
    @LispMethod(comment = "Expands into a form that evaluates body for every sublist of list-expression with\r\nsublist-var bound to each sublist iteratively and element-var bound to the\r\ncar of each sublist.  Thus, this form behaves like cdolist and cdosublists\r\nsimultaneously.  This form differs from cdolist-and-sublists in that one can\r\nchange the value of the sublist variable within the body without affecting\r\niteration.\r\n;;{{{\r\nNote that unlike cdolist, this control structure binds two variables.\r\nthe first variable is iteratively bound to elements of list-expression evaluated\r\nand the second variable is iteratively bound to sublists of list-expression\r\nevaluated.\r\n;;}}}\nExpands into a form that evaluates body for every sublist of list-expression with\nsublist-var bound to each sublist iteratively and element-var bound to the\ncar of each sublist.  Thus, this form behaves like cdolist and cdosublists\nsimultaneously.  This form differs from cdolist-and-sublists in that one can\nchange the value of the sublist variable within the body without affecting\niteration.\n;;{{{\nNote that unlike cdolist, this control structure binds two variables.\nthe first variable is iteratively bound to elements of list-expression evaluated\nand the second variable is iteratively bound to sublists of list-expression\nevaluated.\n;;}}}")
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

    public static final SubLObject cdo_possibly_dotted_list_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt317);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject element_var = NIL;
                    SubLObject list_expression = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt317);
                    element_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt317);
                    list_expression = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject sublist_var = make_symbol($$$sublist);
                            return list(CLET, list(bq_cons(element_var, $list_alt213), list(sublist_var, list_expression)), listS(WHILE, list(CONSP, sublist_var), list(CSETQ, element_var, list(CAR, sublist_var)), append(body, list(list(CSETQ, sublist_var, list(CDR, sublist_var))))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt317);
                    }
                }
            }
        }
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

    /**
     * Expands into a form that evaluates body for every element of list-expression
     * such that predicate applied to the element is T.  During each iteration,
     * var is bound to the current element of list-expression.
     */
    @LispMethod(comment = "Expands into a form that evaluates body for every element of list-expression\r\nsuch that predicate applied to the element is T.  During each iteration,\r\nvar is bound to the current element of list-expression.\nExpands into a form that evaluates body for every element of list-expression\nsuch that predicate applied to the element is T.  During each iteration,\nvar is bound to the current element of list-expression.")
    public static final SubLObject cdolist_if_alt(SubLObject macroform, SubLObject environment) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = macroform.rest();
                SubLObject current = datum;
                destructuring_bind_must_consp(current, datum, $list_alt320);
                {
                    SubLObject temp = current.rest();
                    current = current.first();
                    {
                        SubLObject var = NIL;
                        SubLObject predicate = NIL;
                        SubLObject list_expression = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt320);
                        var = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt320);
                        predicate = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt320);
                        list_expression = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                if (!var.isSymbol()) {
                                    Errors.error($util_var_error_format_string$.getDynamicValue(thread), CDOLIST_IF, var);
                                }
                                if (!var.isSymbol()) {
                                    Errors.error($util_func_error_format_string$.getDynamicValue(thread), CDOLIST_IF, predicate);
                                }
                                return list(CDOLIST, list(var, list_expression), listS(PWHEN, list(predicate, var), body));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt320);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Expands into a form that evaluates body for every element of list-expression
     * such that predicate applied to the element is T.  During each iteration,
     * var is bound to the current element of list-expression.
     */
    @LispMethod(comment = "Expands into a form that evaluates body for every element of list-expression\r\nsuch that predicate applied to the element is T.  During each iteration,\r\nvar is bound to the current element of list-expression.\nExpands into a form that evaluates body for every element of list-expression\nsuch that predicate applied to the element is T.  During each iteration,\nvar is bound to the current element of list-expression.")
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

    /**
     * Expands into a form that evaluates body for every sublist of list-expression
     * such that the predicate applied to the sublist is T.  During each iteration,
     * var is bound to the current sublist of list-expression.
     * ;;{{{
     * Note that cdosublists-if binds the var to subsequent sublists of list-expression
     * evaluated. See the documentation of cdolists for an explanation of these differences.
     * ;;}}}
     */
    @LispMethod(comment = "Expands into a form that evaluates body for every sublist of list-expression\r\nsuch that the predicate applied to the sublist is T.  During each iteration,\r\nvar is bound to the current sublist of list-expression.\r\n;;{{{\r\nNote that cdosublists-if binds the var to subsequent sublists of list-expression\r\nevaluated. See the documentation of cdolists for an explanation of these differences.\r\n;;}}}\nExpands into a form that evaluates body for every sublist of list-expression\nsuch that the predicate applied to the sublist is T.  During each iteration,\nvar is bound to the current sublist of list-expression.\n;;{{{\nNote that cdosublists-if binds the var to subsequent sublists of list-expression\nevaluated. See the documentation of cdolists for an explanation of these differences.\n;;}}}")
    public static final SubLObject cdosublists_if_alt(SubLObject macroform, SubLObject environment) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = macroform.rest();
                SubLObject current = datum;
                destructuring_bind_must_consp(current, datum, $list_alt320);
                {
                    SubLObject temp = current.rest();
                    current = current.first();
                    {
                        SubLObject var = NIL;
                        SubLObject predicate = NIL;
                        SubLObject list_expression = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt320);
                        var = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt320);
                        predicate = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt320);
                        list_expression = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                if (!var.isSymbol()) {
                                    Errors.error($util_var_error_format_string$.getDynamicValue(thread), CDOSUBLISTS_IF, var);
                                }
                                if (!var.isSymbol()) {
                                    Errors.error($util_func_error_format_string$.getDynamicValue(thread), CDOSUBLISTS_IF, predicate);
                                }
                                return list(CDO, list(list(var, list_expression, list(CDR, var))), list(list(NULL, var)), listS(PWHEN, list(predicate, var), body));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt320);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Expands into a form that evaluates body for every sublist of list-expression
     * such that the predicate applied to the sublist is T.  During each iteration,
     * var is bound to the current sublist of list-expression.
     * ;;{{{
     * Note that cdosublists-if binds the var to subsequent sublists of list-expression
     * evaluated. See the documentation of cdolists for an explanation of these differences.
     * ;;}}}
     */
    @LispMethod(comment = "Expands into a form that evaluates body for every sublist of list-expression\r\nsuch that the predicate applied to the sublist is T.  During each iteration,\r\nvar is bound to the current sublist of list-expression.\r\n;;{{{\r\nNote that cdosublists-if binds the var to subsequent sublists of list-expression\r\nevaluated. See the documentation of cdolists for an explanation of these differences.\r\n;;}}}\nExpands into a form that evaluates body for every sublist of list-expression\nsuch that the predicate applied to the sublist is T.  During each iteration,\nvar is bound to the current sublist of list-expression.\n;;{{{\nNote that cdosublists-if binds the var to subsequent sublists of list-expression\nevaluated. See the documentation of cdolists for an explanation of these differences.\n;;}}}")
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

    /**
     * Expands into a form that evaluates body for every element of list-expression
     * such that predicate applied to the element is NIL.  During each iteration,
     * var is bound to the current element of list-expression.
     */
    @LispMethod(comment = "Expands into a form that evaluates body for every element of list-expression\r\nsuch that predicate applied to the element is NIL.  During each iteration,\r\nvar is bound to the current element of list-expression.\nExpands into a form that evaluates body for every element of list-expression\nsuch that predicate applied to the element is NIL.  During each iteration,\nvar is bound to the current element of list-expression.")
    public static final SubLObject cdolist_if_not_alt(SubLObject macroform, SubLObject environment) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = macroform.rest();
                SubLObject current = datum;
                destructuring_bind_must_consp(current, datum, $list_alt320);
                {
                    SubLObject temp = current.rest();
                    current = current.first();
                    {
                        SubLObject var = NIL;
                        SubLObject predicate = NIL;
                        SubLObject list_expression = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt320);
                        var = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt320);
                        predicate = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt320);
                        list_expression = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                if (!var.isSymbol()) {
                                    Errors.error($util_var_error_format_string$.getDynamicValue(thread), CDOLIST_IF_NOT, var);
                                }
                                if (!var.isSymbol()) {
                                    Errors.error($util_func_error_format_string$.getDynamicValue(thread), CDOLIST_IF_NOT, predicate);
                                }
                                return list(CDOLIST, list(var, list_expression), listS(PUNLESS, list(predicate, var), body));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt320);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Expands into a form that evaluates body for every element of list-expression
     * such that predicate applied to the element is NIL.  During each iteration,
     * var is bound to the current element of list-expression.
     */
    @LispMethod(comment = "Expands into a form that evaluates body for every element of list-expression\r\nsuch that predicate applied to the element is NIL.  During each iteration,\r\nvar is bound to the current element of list-expression.\nExpands into a form that evaluates body for every element of list-expression\nsuch that predicate applied to the element is NIL.  During each iteration,\nvar is bound to the current element of list-expression.")
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

    /**
     * Expands into a form that evaluates body for every sublist of list-expression
     * such that the predicate applied to the sublist is NIL.  During each iteration,
     * var is bound to the current sublist of list-expression.
     */
    @LispMethod(comment = "Expands into a form that evaluates body for every sublist of list-expression\r\nsuch that the predicate applied to the sublist is NIL.  During each iteration,\r\nvar is bound to the current sublist of list-expression.\nExpands into a form that evaluates body for every sublist of list-expression\nsuch that the predicate applied to the sublist is NIL.  During each iteration,\nvar is bound to the current sublist of list-expression.")
    public static final SubLObject cdosublists_if_not_alt(SubLObject macroform, SubLObject environment) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = macroform.rest();
                SubLObject current = datum;
                destructuring_bind_must_consp(current, datum, $list_alt320);
                {
                    SubLObject temp = current.rest();
                    current = current.first();
                    {
                        SubLObject var = NIL;
                        SubLObject predicate = NIL;
                        SubLObject list_expression = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt320);
                        var = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt320);
                        predicate = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt320);
                        list_expression = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                if (!var.isSymbol()) {
                                    Errors.error($util_var_error_format_string$.getDynamicValue(thread), CDOSUBLISTS_IF_NOT, var);
                                }
                                if (!var.isSymbol()) {
                                    Errors.error($util_func_error_format_string$.getDynamicValue(thread), CDOSUBLISTS_IF_NOT, predicate);
                                }
                                return list(CDO, list(list(var, list_expression, list(CDR, var))), list(list(NULL, var)), listS(PUNLESS, list(predicate, var), body));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt320);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Expands into a form that evaluates body for every sublist of list-expression
     * such that the predicate applied to the sublist is NIL.  During each iteration,
     * var is bound to the current sublist of list-expression.
     */
    @LispMethod(comment = "Expands into a form that evaluates body for every sublist of list-expression\r\nsuch that the predicate applied to the sublist is NIL.  During each iteration,\r\nvar is bound to the current sublist of list-expression.\nExpands into a form that evaluates body for every sublist of list-expression\nsuch that the predicate applied to the sublist is NIL.  During each iteration,\nvar is bound to the current sublist of list-expression.")
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

    public static final SubLObject cdo2lists_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt325);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var1 = NIL;
                    SubLObject list1 = NIL;
                    SubLObject var2 = NIL;
                    SubLObject list2 = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt325);
                    var1 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt325);
                    list1 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt325);
                    var2 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt325);
                    list2 = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject sublist1_var = make_symbol($$$sublist1);
                            SubLObject sublist2_var = make_symbol($$$sublist2);
                            return list(CLET, list(list(sublist1_var, list1), list(sublist2_var, list2), var1, var2), listS(WHILE, list(CAND, sublist1_var, sublist2_var), list(CSETQ, var1, list(CAR, sublist1_var), var2, list(CAR, sublist2_var)), append(body, list(list(CSETQ, sublist1_var, list(CDR, sublist1_var), sublist2_var, list(CDR, sublist2_var))))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt325);
                    }
                }
            }
        }
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

    /**
     * This macro expands into a form that evaluates body once for every atom
     * in tree with var bound to said atom.
     * ;;{{{
     * The default behavior is to visit
     * each atom in depth-first order.  Search order may be specified by
     * providing either :depth-first or :breadth-first as the value for
     * the optional arg search-type.  The search is conducted without the
     * use of recursion.  Atoms eq to NIL, by default, are not visited.
     * However, optionally, one may pass a boolean value as the forth element
     * of the binding clause to override this behavior.  Passing a non-nil
     * value as this fourth element causes var to be bound to all atoms,
     * without regard to identity with NIL.
     * ;;}}}
     */
    @LispMethod(comment = "This macro expands into a form that evaluates body once for every atom\r\nin tree with var bound to said atom.\r\n;;{{{\r\nThe default behavior is to visit\r\neach atom in depth-first order.  Search order may be specified by\r\nproviding either :depth-first or :breadth-first as the value for\r\nthe optional arg search-type.  The search is conducted without the\r\nuse of recursion.  Atoms eq to NIL, by default, are not visited.\r\nHowever, optionally, one may pass a boolean value as the forth element\r\nof the binding clause to override this behavior.  Passing a non-nil\r\nvalue as this fourth element causes var to be bound to all atoms,\r\nwithout regard to identity with NIL.\r\n;;}}}\nThis macro expands into a form that evaluates body once for every atom\nin tree with var bound to said atom.\n;;{{{\nThe default behavior is to visit\neach atom in depth-first order.  Search order may be specified by\nproviding either :depth-first or :breadth-first as the value for\nthe optional arg search-type.  The search is conducted without the\nuse of recursion.  Atoms eq to NIL, by default, are not visited.\nHowever, optionally, one may pass a boolean value as the forth element\nof the binding clause to override this behavior.  Passing a non-nil\nvalue as this fourth element causes var to be bound to all atoms,\nwithout regard to identity with NIL.\n;;}}}")
    public static final SubLObject cdotree_alt(SubLObject macroform, SubLObject environment) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = macroform.rest();
                SubLObject current = datum;
                destructuring_bind_must_consp(current, datum, $list_alt328);
                {
                    SubLObject temp = current.rest();
                    current = current.first();
                    {
                        SubLObject var = NIL;
                        SubLObject tree = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt328);
                        var = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt328);
                        tree = current.first();
                        current = current.rest();
                        {
                            SubLObject search_type = (current.isCons()) ? ((SubLObject) (current.first())) : $DEPTH_FIRST;
                            destructuring_bind_must_listp(current, datum, $list_alt328);
                            current = current.rest();
                            {
                                SubLObject visit_nils = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                                destructuring_bind_must_listp(current, datum, $list_alt328);
                                current = current.rest();
                                if (NIL == current) {
                                    current = temp;
                                    {
                                        SubLObject body = current;
                                        if (!var.isSymbol()) {
                                            Errors.error($util_var_error_format_string$.getDynamicValue(thread), CDOTREE, var);
                                        }
                                        if (!((search_type == $DEPTH_FIRST) || (search_type == $BREADTH_FIRST))) {
                                            Errors.error($util_search_type_error_format_string$.getDynamicValue(thread), CDOTREE, search_type);
                                        }
                                        {
                                            SubLObject tree_var = make_symbol($str_alt332$tree_var);
                                            SubLObject cells_var = make_symbol($str_alt333$cells_var);
                                            if (search_type == $BREADTH_FIRST) {
                                                {
                                                    SubLObject tail_of_cells_var = make_symbol($str_alt334$tail_of_cells);
                                                    return list(CLET, list(list(tree_var, tree)), list(PWHEN, tree_var, list(CLET, list(list(cells_var, list(LIST, tree_var)), list(tail_of_cells_var, list(LAST, cells_var))), list(CDO, list(list(var, list(CAR, cells_var), list(CAR, cells_var))), list(list(NULL, cells_var)), list(PIF, list(CONSP, var), list(PROGN, list(RPLACD, tail_of_cells_var, list(LIST, list(CAR, var), list(CDR, var))), list(CSETQ, tail_of_cells_var, list(LAST, tail_of_cells_var))), NIL != visit_nils ? ((SubLObject) (bq_cons(PROGN, body))) : listS(PWHEN, var, body)), list(CSETQ, cells_var, list(CDR, cells_var))))));
                                                }
                                            } else {
                                                return list(CLET, list(list(tree_var, tree)), list(PWHEN, tree_var, list(CLET, list(list(cells_var, list(LIST, tree_var))), list(CDO, list(list(var, list(CAR, cells_var), list(CAR, cells_var))), list(list(NULL, cells_var)), list(CSETQ, cells_var, list(CDR, cells_var)), list(PIF, list(CONSP, var), list(PROGN, list(CPUSH, list(CDR, var), cells_var), list(CPUSH, list(CAR, var), cells_var)), NIL != visit_nils ? ((SubLObject) (bq_cons(PROGN, body))) : listS(PWHEN, var, body))))));
                                            }
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt328);
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * This macro expands into a form that evaluates body once for every atom
     * in tree with var bound to said atom.
     * ;;{{{
     * The default behavior is to visit
     * each atom in depth-first order.  Search order may be specified by
     * providing either :depth-first or :breadth-first as the value for
     * the optional arg search-type.  The search is conducted without the
     * use of recursion.  Atoms eq to NIL, by default, are not visited.
     * However, optionally, one may pass a boolean value as the forth element
     * of the binding clause to override this behavior.  Passing a non-nil
     * value as this fourth element causes var to be bound to all atoms,
     * without regard to identity with NIL.
     * ;;}}}
     */
    @LispMethod(comment = "This macro expands into a form that evaluates body once for every atom\r\nin tree with var bound to said atom.\r\n;;{{{\r\nThe default behavior is to visit\r\neach atom in depth-first order.  Search order may be specified by\r\nproviding either :depth-first or :breadth-first as the value for\r\nthe optional arg search-type.  The search is conducted without the\r\nuse of recursion.  Atoms eq to NIL, by default, are not visited.\r\nHowever, optionally, one may pass a boolean value as the forth element\r\nof the binding clause to override this behavior.  Passing a non-nil\r\nvalue as this fourth element causes var to be bound to all atoms,\r\nwithout regard to identity with NIL.\r\n;;}}}\nThis macro expands into a form that evaluates body once for every atom\nin tree with var bound to said atom.\n;;{{{\nThe default behavior is to visit\neach atom in depth-first order.  Search order may be specified by\nproviding either :depth-first or :breadth-first as the value for\nthe optional arg search-type.  The search is conducted without the\nuse of recursion.  Atoms eq to NIL, by default, are not visited.\nHowever, optionally, one may pass a boolean value as the forth element\nof the binding clause to override this behavior.  Passing a non-nil\nvalue as this fourth element causes var to be bound to all atoms,\nwithout regard to identity with NIL.\n;;}}}")
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
            return list(CLET, list(list(tree_var, tree)), list(PWHEN, tree_var, list(CLET, list(list(cells_var, list(LIST, tree_var)), list(tail_of_cells_var, list(LAST, cells_var))), list(CDO, list(list(var, list(CAR, cells_var), list(CAR, cells_var))), list(list(NULL, cells_var)), list(PIF, list(CONSP, var), list(PROGN, list(RPLACD, tail_of_cells_var, list(LIST, list(CAR, var), list(CDR, var))), list(CSETQ, tail_of_cells_var, list(LAST, tail_of_cells_var))), NIL != visit_nils ? bq_cons(PROGN, body) : listS(PWHEN, var, body)), list(CSETQ, cells_var, list(CDR, cells_var))))));
        }
        return list(CLET, list(list(tree_var, tree)), list(PWHEN, tree_var, list(CLET, list(list(cells_var, list(LIST, tree_var))), list(CDO, list(list(var, list(CAR, cells_var), list(CAR, cells_var))), list(list(NULL, cells_var)), list(CSETQ, cells_var, list(CDR, cells_var)), list(PIF, list(CONSP, var), list(PROGN, list(CPUSH, list(CDR, var), cells_var), list(CPUSH, list(CAR, var), cells_var)), NIL != visit_nils ? bq_cons(PROGN, body) : listS(PWHEN, var, body))))));
    }

    /**
     * This macro expands into a form that evaluates body once for every cons
     * in tree with var bound to said cons.
     * ;;{{{
     * The default behavior is to visit
     * each atom in depth-first order.  Search order may be specified by
     * providing either :depth-first or :breadth-first as the value for
     * the optional arg search-type.  The search is conducted without the
     * use of recursion.
     * ;;}}}
     */
    @LispMethod(comment = "This macro expands into a form that evaluates body once for every cons\r\nin tree with var bound to said cons.\r\n;;{{{\r\nThe default behavior is to visit\r\neach atom in depth-first order.  Search order may be specified by\r\nproviding either :depth-first or :breadth-first as the value for\r\nthe optional arg search-type.  The search is conducted without the\r\nuse of recursion.\r\n;;}}}\nThis macro expands into a form that evaluates body once for every cons\nin tree with var bound to said cons.\n;;{{{\nThe default behavior is to visit\neach atom in depth-first order.  Search order may be specified by\nproviding either :depth-first or :breadth-first as the value for\nthe optional arg search-type.  The search is conducted without the\nuse of recursion.\n;;}}}")
    public static final SubLObject cdotree_conses_alt(SubLObject macroform, SubLObject environment) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = macroform.rest();
                SubLObject current = datum;
                destructuring_bind_must_consp(current, datum, $list_alt339);
                {
                    SubLObject temp = current.rest();
                    current = current.first();
                    {
                        SubLObject var = NIL;
                        SubLObject tree = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt339);
                        var = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt339);
                        tree = current.first();
                        current = current.rest();
                        {
                            SubLObject search_type = (current.isCons()) ? ((SubLObject) (current.first())) : $DEPTH_FIRST;
                            destructuring_bind_must_listp(current, datum, $list_alt339);
                            current = current.rest();
                            if (NIL == current) {
                                current = temp;
                                {
                                    SubLObject body = current;
                                    if (!var.isSymbol()) {
                                        Errors.error($util_var_error_format_string$.getDynamicValue(thread), CDOTREE_CONSES, var);
                                    }
                                    if (!((search_type == $DEPTH_FIRST) || (search_type == $BREADTH_FIRST))) {
                                        Errors.error($util_search_type_error_format_string$.getDynamicValue(thread), CDOTREE_CONSES, search_type);
                                    }
                                    {
                                        SubLObject tree_var = make_symbol($str_alt332$tree_var);
                                        SubLObject cells_var = make_symbol($str_alt333$cells_var);
                                        if (search_type == $BREADTH_FIRST) {
                                            {
                                                SubLObject tail_of_cells_var = make_symbol($str_alt341$tail_of_cells_var);
                                                return list(CLET, list(list(tree_var, tree)), list(PWHEN, tree_var, list(CLET, list(list(cells_var, list(LIST, tree_var)), list(tail_of_cells_var, list(LAST, cells_var))), list(CDO, list(list(var, list(CAR, cells_var), list(CAR, cells_var))), list(list(NULL, cells_var)), listS(PWHEN, list(CONSP, var), list(RPLACD, tail_of_cells_var, list(LIST, list(CAR, var), list(CDR, var))), list(CSETQ, tail_of_cells_var, list(LAST, tail_of_cells_var)), body), list(CSETQ, cells_var, list(CDR, cells_var))))));
                                            }
                                        } else {
                                            return list(CLET, list(list(tree_var, tree)), list(PWHEN, tree_var, list(CLET, list(list(cells_var, list(LIST, tree_var))), list(CDO, list(list(var, list(CAR, cells_var), list(CAR, cells_var))), list(list(NULL, cells_var)), list(CSETQ, cells_var, list(CDR, cells_var)), listS(PWHEN, list(CONSP, var), list(CPUSH, list(CDR, var), cells_var), list(CPUSH, list(CAR, var), cells_var), body)))));
                                        }
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt339);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * This macro expands into a form that evaluates body once for every cons
     * in tree with var bound to said cons.
     * ;;{{{
     * The default behavior is to visit
     * each atom in depth-first order.  Search order may be specified by
     * providing either :depth-first or :breadth-first as the value for
     * the optional arg search-type.  The search is conducted without the
     * use of recursion.
     * ;;}}}
     */
    @LispMethod(comment = "This macro expands into a form that evaluates body once for every cons\r\nin tree with var bound to said cons.\r\n;;{{{\r\nThe default behavior is to visit\r\neach atom in depth-first order.  Search order may be specified by\r\nproviding either :depth-first or :breadth-first as the value for\r\nthe optional arg search-type.  The search is conducted without the\r\nuse of recursion.\r\n;;}}}\nThis macro expands into a form that evaluates body once for every cons\nin tree with var bound to said cons.\n;;{{{\nThe default behavior is to visit\neach atom in depth-first order.  Search order may be specified by\nproviding either :depth-first or :breadth-first as the value for\nthe optional arg search-type.  The search is conducted without the\nuse of recursion.\n;;}}}")
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
            return list(CLET, list(list(tree_var, tree)), list(PWHEN, tree_var, list(CLET, list(list(cells_var, list(LIST, tree_var)), list(tail_of_cells_var, list(LAST, cells_var))), list(CDO, list(list(var, list(CAR, cells_var), list(CAR, cells_var))), list(list(NULL, cells_var)), listS(PWHEN, list(CONSP, var), list(RPLACD, tail_of_cells_var, list(LIST, list(CAR, var), list(CDR, var))), list(CSETQ, tail_of_cells_var, list(LAST, tail_of_cells_var)), body), list(CSETQ, cells_var, list(CDR, cells_var))))));
        }
        return list(CLET, list(list(tree_var, tree)), list(PWHEN, tree_var, list(CLET, list(list(cells_var, list(LIST, tree_var))), list(CDO, list(list(var, list(CAR, cells_var), list(CAR, cells_var))), list(list(NULL, cells_var)), list(CSETQ, cells_var, list(CDR, cells_var)), listS(PWHEN, list(CONSP, var), list(CPUSH, list(CDR, var), cells_var), list(CPUSH, list(CAR, var), cells_var), body)))));
    }

    /**
     *
     *
     * @unknown - Use @see DO-PLIST.
     */
    @LispMethod(comment = "@unknown - Use @see DO-PLIST.")
    public static final SubLObject cdoplist_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt342);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject parameter = NIL;
                    SubLObject value = NIL;
                    SubLObject plist = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt342);
                    parameter = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt342);
                    value = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt342);
                    plist = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(DO_PLIST, list(parameter, value, plist), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt342);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @unknown - Use @see DO-PLIST.
     */
    @LispMethod(comment = "@unknown - Use @see DO-PLIST.")
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

    /**
     * ;;{{{
     * Given a list of car and cdr symbols and a var, this form generates a sequence
     * of car and cdr calls on the var.  If the optional var 'cars-and-cdrs-only' is
     * bound to a non-nil value, it is assumed that the sequence consists of only
     * cars and cdrs.  Where possible, car and cdr sequences are optimized.  For example,
     * '(car cdr)' is taken to be '(cadr)'.  Thus, given '(car car cdr)', 'a' and 't';
     * this function returns '(car (cadr a))'.  Given '(foo bar baz)' and 'a'; this
     * function returns '(foo (bar (baz a)))'.
     * ;;}}}
     */
    @LispMethod(comment = ";;{{{\r\nGiven a list of car and cdr symbols and a var, this form generates a sequence\r\nof car and cdr calls on the var.  If the optional var \'cars-and-cdrs-only\' is\r\nbound to a non-nil value, it is assumed that the sequence consists of only\r\ncars and cdrs.  Where possible, car and cdr sequences are optimized.  For example,\r\n\'(car cdr)\' is taken to be \'(cadr)\'.  Thus, given \'(car car cdr)\', \'a\' and \'t\';\r\nthis function returns \'(car (cadr a))\'.  Given \'(foo bar baz)\' and \'a\'; this\r\nfunction returns \'(foo (bar (baz a)))\'.\r\n;;}}}\n;;{{{\nGiven a list of car and cdr symbols and a var, this form generates a sequence\nof car and cdr calls on the var.  If the optional var \'cars-and-cdrs-only\' is\nbound to a non-nil value, it is assumed that the sequence consists of only\ncars and cdrs.  Where possible, car and cdr sequences are optimized.  For example,\n\'(car cdr)\' is taken to be \'(cadr)\'.  Thus, given \'(car car cdr)\', \'a\' and \'t\';\nthis function returns \'(car (cadr a))\'.  Given \'(foo bar baz)\' and \'a\'; this\nfunction returns \'(foo (bar (baz a)))\'.\n;;}}}")
    public static final SubLObject compositize_function_call_alt(SubLObject path, SubLObject var, SubLObject cars_and_cdrs_only) {
        if (cars_and_cdrs_only == UNPROVIDED) {
            cars_and_cdrs_only = NIL;
        }
        {
            SubLObject result = var;
            SubLObject cdolist_list_var = (NIL != cars_and_cdrs_only) ? ((SubLObject) (simplify_car_and_cdr_path(reverse(path)))) : reverse(path);
            SubLObject function_symbol = NIL;
            for (function_symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , function_symbol = cdolist_list_var.first()) {
                result = list(function_symbol, result);
            }
            return result;
        }
    }

    /**
     * ;;{{{
     * Given a list of car and cdr symbols and a var, this form generates a sequence
     * of car and cdr calls on the var.  If the optional var 'cars-and-cdrs-only' is
     * bound to a non-nil value, it is assumed that the sequence consists of only
     * cars and cdrs.  Where possible, car and cdr sequences are optimized.  For example,
     * '(car cdr)' is taken to be '(cadr)'.  Thus, given '(car car cdr)', 'a' and 't';
     * this function returns '(car (cadr a))'.  Given '(foo bar baz)' and 'a'; this
     * function returns '(foo (bar (baz a)))'.
     * ;;}}}
     */
    @LispMethod(comment = ";;{{{\r\nGiven a list of car and cdr symbols and a var, this form generates a sequence\r\nof car and cdr calls on the var.  If the optional var \'cars-and-cdrs-only\' is\r\nbound to a non-nil value, it is assumed that the sequence consists of only\r\ncars and cdrs.  Where possible, car and cdr sequences are optimized.  For example,\r\n\'(car cdr)\' is taken to be \'(cadr)\'.  Thus, given \'(car car cdr)\', \'a\' and \'t\';\r\nthis function returns \'(car (cadr a))\'.  Given \'(foo bar baz)\' and \'a\'; this\r\nfunction returns \'(foo (bar (baz a)))\'.\r\n;;}}}\n;;{{{\nGiven a list of car and cdr symbols and a var, this form generates a sequence\nof car and cdr calls on the var.  If the optional var \'cars-and-cdrs-only\' is\nbound to a non-nil value, it is assumed that the sequence consists of only\ncars and cdrs.  Where possible, car and cdr sequences are optimized.  For example,\n\'(car cdr)\' is taken to be \'(cadr)\'.  Thus, given \'(car car cdr)\', \'a\' and \'t\';\nthis function returns \'(car (cadr a))\'.  Given \'(foo bar baz)\' and \'a\'; this\nfunction returns \'(foo (bar (baz a)))\'.\n;;}}}")
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

    /**
     * ;;{{{
     * Given a list of 'car' and 'cdr' symbols, this function optimizes the sequence
     * by reducing any two 'car' and 'cdr' pairs into a single call of the form
     * 'cxyr' where 'x' is second char of the second symbol and 'y' is the second
     * char of the first symbol.  Thus, '(car cdr cdr)' reduces to '(car cddr)'.
     * Note that this may seem to be the reverse of what is expected, but path is
     * assumed to be evaluated in reverse order.
     * ;;}}}
     */
    @LispMethod(comment = ";;{{{\r\nGiven a list of \'car\' and \'cdr\' symbols, this function optimizes the sequence\r\nby reducing any two \'car\' and \'cdr\' pairs into a single call of the form\r\n\'cxyr\' where \'x\' is second char of the second symbol and \'y\' is the second\r\nchar of the first symbol.  Thus, \'(car cdr cdr)\' reduces to \'(car cddr)\'.\r\nNote that this may seem to be the reverse of what is expected, but path is\r\nassumed to be evaluated in reverse order.\r\n;;}}}\n;;{{{\nGiven a list of \'car\' and \'cdr\' symbols, this function optimizes the sequence\nby reducing any two \'car\' and \'cdr\' pairs into a single call of the form\n\'cxyr\' where \'x\' is second char of the second symbol and \'y\' is the second\nchar of the first symbol.  Thus, \'(car cdr cdr)\' reduces to \'(car cddr)\'.\nNote that this may seem to be the reverse of what is expected, but path is\nassumed to be evaluated in reverse order.\n;;}}}")
    public static final SubLObject simplify_car_and_cdr_path_alt(SubLObject path) {
        if (NIL == path) {
            return NIL;
        } else {
            if (NIL == path.rest()) {
                return cons(path.first(), NIL);
            } else {
                {
                    SubLObject first_op = path.first();
                    SubLObject second_op = cadr(path);
                    SubLObject pcase_var = first_op;
                    if (pcase_var.eql(CAR)) {
                        {
                            SubLObject pcase_var_8 = second_op;
                            if (pcase_var_8.eql(CAR)) {
                                return cons(CAAR, simplify_car_and_cdr_path(cddr(path)));
                            } else {
                                if (pcase_var_8.eql(CDR)) {
                                    return cons(CDAR, simplify_car_and_cdr_path(cddr(path)));
                                } else {
                                    return listS(first_op, second_op, simplify_car_and_cdr_path(cddr(path)));
                                }
                            }
                        }
                    } else {
                        if (pcase_var.eql(CDR)) {
                            {
                                SubLObject pcase_var_9 = second_op;
                                if (pcase_var_9.eql(CAR)) {
                                    return cons(CADR, simplify_car_and_cdr_path(cddr(path)));
                                } else {
                                    if (pcase_var_9.eql(CDR)) {
                                        return cons(CDDR, simplify_car_and_cdr_path(cddr(path)));
                                    } else {
                                        return listS(first_op, second_op, simplify_car_and_cdr_path(cddr(path)));
                                    }
                                }
                            }
                        } else {
                            return listS(first_op, second_op, simplify_car_and_cdr_path(cddr(path)));
                        }
                    }
                }
            }
        }
    }

    /**
     * ;;{{{
     * Given a list of 'car' and 'cdr' symbols, this function optimizes the sequence
     * by reducing any two 'car' and 'cdr' pairs into a single call of the form
     * 'cxyr' where 'x' is second char of the second symbol and 'y' is the second
     * char of the first symbol.  Thus, '(car cdr cdr)' reduces to '(car cddr)'.
     * Note that this may seem to be the reverse of what is expected, but path is
     * assumed to be evaluated in reverse order.
     * ;;}}}
     */
    @LispMethod(comment = ";;{{{\r\nGiven a list of \'car\' and \'cdr\' symbols, this function optimizes the sequence\r\nby reducing any two \'car\' and \'cdr\' pairs into a single call of the form\r\n\'cxyr\' where \'x\' is second char of the second symbol and \'y\' is the second\r\nchar of the first symbol.  Thus, \'(car cdr cdr)\' reduces to \'(car cddr)\'.\r\nNote that this may seem to be the reverse of what is expected, but path is\r\nassumed to be evaluated in reverse order.\r\n;;}}}\n;;{{{\nGiven a list of \'car\' and \'cdr\' symbols, this function optimizes the sequence\nby reducing any two \'car\' and \'cdr\' pairs into a single call of the form\n\'cxyr\' where \'x\' is second char of the second symbol and \'y\' is the second\nchar of the first symbol.  Thus, \'(car cdr cdr)\' reduces to \'(car cddr)\'.\nNote that this may seem to be the reverse of what is expected, but path is\nassumed to be evaluated in reverse order.\n;;}}}")
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

    /**
     * ;;{{{
     * Given a cons tree of vars, a variable that will be bound to a cons structure and
     * the path to the cons tree of vars (usually NIL when called by the user), this
     * function returns a list of of alternating composite function calls on the var
     * and the variable found at each location in the tree.
     * ;;}}}
     */
    @LispMethod(comment = ";;{{{\r\nGiven a cons tree of vars, a variable that will be bound to a cons structure and\r\nthe path to the cons tree of vars (usually NIL when called by the user), this\r\nfunction returns a list of of alternating composite function calls on the var\r\nand the variable found at each location in the tree.\r\n;;}}}\n;;{{{\nGiven a cons tree of vars, a variable that will be bound to a cons structure and\nthe path to the cons tree of vars (usually NIL when called by the user), this\nfunction returns a list of of alternating composite function calls on the var\nand the variable found at each location in the tree.\n;;}}}")
    public static final SubLObject map_symbols_to_accessors_alt(SubLObject tree, SubLObject var, SubLObject path) {
        if (NIL == tree) {
            return NIL;
        } else {
            if (tree.isSymbol()) {
                return list(NIL == path ? ((SubLObject) (list(tree, var))) : list(tree, compositize_function_call(path, var, T)));
            } else {
                if (tree.isCons()) {
                    return nconc(map_symbols_to_accessors(tree.first(), var, cons(CAR, path)), map_symbols_to_accessors(tree.rest(), var, cons(CDR, path)));
                } else {
                    return NIL;
                }
            }
        }
    }

    /**
     * ;;{{{
     * Given a cons tree of vars, a variable that will be bound to a cons structure and
     * the path to the cons tree of vars (usually NIL when called by the user), this
     * function returns a list of of alternating composite function calls on the var
     * and the variable found at each location in the tree.
     * ;;}}}
     */
    @LispMethod(comment = ";;{{{\r\nGiven a cons tree of vars, a variable that will be bound to a cons structure and\r\nthe path to the cons tree of vars (usually NIL when called by the user), this\r\nfunction returns a list of of alternating composite function calls on the var\r\nand the variable found at each location in the tree.\r\n;;}}}\n;;{{{\nGiven a cons tree of vars, a variable that will be bound to a cons structure and\nthe path to the cons tree of vars (usually NIL when called by the user), this\nfunction returns a list of of alternating composite function calls on the var\nand the variable found at each location in the tree.\n;;}}}")
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

    /**
     * Sets the variables in pattern to the substructures of datum accessible by the
     * same sequence of car and cdr operations by which the corresponding variables
     * may be accessed.
     * ;;{{{
     * Thus, if pattern is (a b c) and datum is (1 (2 3) 4), 'a' will be set to '1',
     * 'b' will be set to '(2 3)', and 'c' will be set to '4'.
     * ;;}}}
     */
    @LispMethod(comment = "Sets the variables in pattern to the substructures of datum accessible by the\r\nsame sequence of car and cdr operations by which the corresponding variables\r\nmay be accessed.\r\n;;{{{\r\nThus, if pattern is (a b c) and datum is (1 (2 3) 4), \'a\' will be set to \'1\',\r\n\'b\' will be set to \'(2 3)\', and \'c\' will be set to \'4\'.\r\n;;}}}\nSets the variables in pattern to the substructures of datum accessible by the\nsame sequence of car and cdr operations by which the corresponding variables\nmay be accessed.\n;;{{{\nThus, if pattern is (a b c) and datum is (1 (2 3) 4), \'a\' will be set to \'1\',\n\'b\' will be set to \'(2 3)\', and \'c\' will be set to \'4\'.\n;;}}}")
    public static final SubLObject cdestructuring_setq_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject pattern = NIL;
            SubLObject datum_10 = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt348);
            pattern = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt348);
            datum_10 = current.first();
            current = current.rest();
            if (NIL == current) {
                if (pattern.isCons() || (pattern.isSymbol() && (NIL != pattern))) {
                    {
                        SubLObject datum_evaluated_var = make_symbol($str_alt349$datum_evaluated_var);
                        return list(CLET, list(list(datum_evaluated_var, datum_10)), bq_cons(CSETQ, apply(symbol_function(NCONC), map_symbols_to_accessors(pattern, datum_evaluated_var, NIL))));
                    }
                } else {
                    return datum_10;
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt348);
            }
        }
        return NIL;
    }

    /**
     * Sets the variables in pattern to the substructures of datum accessible by the
     * same sequence of car and cdr operations by which the corresponding variables
     * may be accessed.
     * ;;{{{
     * Thus, if pattern is (a b c) and datum is (1 (2 3) 4), 'a' will be set to '1',
     * 'b' will be set to '(2 3)', and 'c' will be set to '4'.
     * ;;}}}
     */
    @LispMethod(comment = "Sets the variables in pattern to the substructures of datum accessible by the\r\nsame sequence of car and cdr operations by which the corresponding variables\r\nmay be accessed.\r\n;;{{{\r\nThus, if pattern is (a b c) and datum is (1 (2 3) 4), \'a\' will be set to \'1\',\r\n\'b\' will be set to \'(2 3)\', and \'c\' will be set to \'4\'.\r\n;;}}}\nSets the variables in pattern to the substructures of datum accessible by the\nsame sequence of car and cdr operations by which the corresponding variables\nmay be accessed.\n;;{{{\nThus, if pattern is (a b c) and datum is (1 (2 3) 4), \'a\' will be set to \'1\',\n\'b\' will be set to \'(2 3)\', and \'c\' will be set to \'4\'.\n;;}}}")
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

    /**
     * Function to check the args to a fast-funcall form.
     * ;;{{{
     * Signals an error during expansion
     * time if the args do not conform.  Usually, macros are expanded at compile time, thus
     * compile time errors can be thrown if these forms are used.
     * ;;}}}
     */
    @LispMethod(comment = "Function to check the args to a fast-funcall form.\r\n;;{{{\r\nSignals an error during expansion\r\ntime if the args do not conform.  Usually, macros are expanded at compile time, thus\r\ncompile time errors can be thrown if these forms are used.\r\n;;}}}\nFunction to check the args to a fast-funcall form.\n;;{{{\nSignals an error during expansion\ntime if the args do not conform.  Usually, macros are expanded at compile time, thus\ncompile time errors can be thrown if these forms are used.\n;;}}}")
    public static final SubLObject fast_funcall_no_value_check_args_alt(SubLObject function_form, SubLObject function_name_list, SubLObject args) {
        if (function_name_list.isList()) {
            {
                SubLObject sublist = NIL;
                SubLObject element = NIL;
                for (sublist = function_name_list, element = sublist.first(); sublist.isCons(); sublist = sublist.rest() , element = sublist.first()) {
                    if (!element.isSymbol()) {
                        Errors.error($str_alt351$FAST_FUNCALL_NO_VALUE__contains_e);
                    }
                    if (!(sublist.rest().isCons() || (NIL == sublist.rest()))) {
                        Errors.error($str_alt352$FAST_FUNCALL_NO_VALUE__cannot_acc);
                    }
                }
            }
        } else {
            Errors.error($str_alt353$FAST_FUNCALL_NO_VALUE__function_n);
        }
        return NIL;
    }

    /**
     * Function to check the args to a fast-funcall form.
     * ;;{{{
     * Signals an error during expansion
     * time if the args do not conform.  Usually, macros are expanded at compile time, thus
     * compile time errors can be thrown if these forms are used.
     * ;;}}}
     */
    @LispMethod(comment = "Function to check the args to a fast-funcall form.\r\n;;{{{\r\nSignals an error during expansion\r\ntime if the args do not conform.  Usually, macros are expanded at compile time, thus\r\ncompile time errors can be thrown if these forms are used.\r\n;;}}}\nFunction to check the args to a fast-funcall form.\n;;{{{\nSignals an error during expansion\ntime if the args do not conform.  Usually, macros are expanded at compile time, thus\ncompile time errors can be thrown if these forms are used.\n;;}}}")
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

    /**
     * Equal to (funcall function-form . args), except that the return value is undefined.
     * ;;{{{
     * This function is intended as a higher perfomance funcall under SUBL's C
     * based version.  The function name list is not evaluated and should
     * consist of a list of function symbols that are possible or frequent values
     * for function-form.  The macro expands into a case statement where values
     * for function form which are a member of the function-name list are called
     * directly without funcall.  Thus resulting in more efficient code.
     * ;;}}}
     */
    @LispMethod(comment = "Equal to (funcall function-form . args), except that the return value is undefined.\r\n;;{{{\r\nThis function is intended as a higher perfomance funcall under SUBL\'s C\r\nbased version.  The function name list is not evaluated and should\r\nconsist of a list of function symbols that are possible or frequent values\r\nfor function-form.  The macro expands into a case statement where values\r\nfor function form which are a member of the function-name list are called\r\ndirectly without funcall.  Thus resulting in more efficient code.\r\n;;}}}\nEqual to (funcall function-form . args), except that the return value is undefined.\n;;{{{\nThis function is intended as a higher perfomance funcall under SUBL\'s C\nbased version.  The function name list is not evaluated and should\nconsist of a list of function symbols that are possible or frequent values\nfor function-form.  The macro expands into a case statement where values\nfor function form which are a member of the function-name list are called\ndirectly without funcall.  Thus resulting in more efficient code.\n;;}}}")
    public static final SubLObject fast_funcall_no_value_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject function_form = NIL;
            SubLObject function_name_list = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt354);
            function_form = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt354);
            function_name_list = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                fast_funcall_no_value_check_args(function_form, function_name_list, args);
                if (NIL == function_name_list) {
                    return listS(FUNCALL, function_form, args);
                } else {
                    {
                        SubLObject function_form_evaluated_var = (function_form.isSymbol()) ? ((SubLObject) (function_form)) : make_symbol($str_alt356$function_form_evaluated_var);
                        SubLObject case_list = NIL;
                        SubLObject cdolist_list_var = function_name_list;
                        SubLObject function_name = NIL;
                        for (function_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , function_name = cdolist_list_var.first()) {
                            if (function_name.isSymbol()) {
                                case_list = cons(list(function_name, bq_cons(function_name, copy_tree(args))), case_list);
                            }
                        }
                        if (NIL == case_list) {
                            return listS(FUNCALL, function_form, args);
                        } else {
                            {
                                SubLObject body = listS(PCASE, function_form_evaluated_var, nreverse(cons(list(OTHERWISE, listS(FUNCALL, function_form_evaluated_var, copy_tree(args))), case_list)));
                                if (function_form == function_form_evaluated_var) {
                                    return body;
                                } else {
                                    return list(CLET, list(list(function_form_evaluated_var, function_form)), body);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Equal to (funcall function-form . args), except that the return value is undefined.
     * ;;{{{
     * This function is intended as a higher perfomance funcall under SUBL's C
     * based version.  The function name list is not evaluated and should
     * consist of a list of function symbols that are possible or frequent values
     * for function-form.  The macro expands into a case statement where values
     * for function form which are a member of the function-name list are called
     * directly without funcall.  Thus resulting in more efficient code.
     * ;;}}}
     */
    @LispMethod(comment = "Equal to (funcall function-form . args), except that the return value is undefined.\r\n;;{{{\r\nThis function is intended as a higher perfomance funcall under SUBL\'s C\r\nbased version.  The function name list is not evaluated and should\r\nconsist of a list of function symbols that are possible or frequent values\r\nfor function-form.  The macro expands into a case statement where values\r\nfor function form which are a member of the function-name list are called\r\ndirectly without funcall.  Thus resulting in more efficient code.\r\n;;}}}\nEqual to (funcall function-form . args), except that the return value is undefined.\n;;{{{\nThis function is intended as a higher perfomance funcall under SUBL\'s C\nbased version.  The function name list is not evaluated and should\nconsist of a list of function symbols that are possible or frequent values\nfor function-form.  The macro expands into a case statement where values\nfor function form which are a member of the function-name list are called\ndirectly without funcall.  Thus resulting in more efficient code.\n;;}}}")
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

    /**
     * Equal to (csetq var-to-set (funcall function-form . args)), except that the
     * return value is undefined.
     * ;;{{{
     * This function is intended as a higher prefomance
     * funcall under SUBL's C based version.  The function name list is not evaluated
     * and should consist of a list of function symbols that are possible or frequent
     * values for function-form.  The macro expands into a case statement where values
     * for function form which are a member of the function-name list are called
     * directly without funcall.  Thus resulting in more efficient code.
     * ;;}}}
     */
    @LispMethod(comment = "Equal to (csetq var-to-set (funcall function-form . args)), except that the\r\nreturn value is undefined.\r\n;;{{{\r\nThis function is intended as a higher prefomance\r\nfuncall under SUBL\'s C based version.  The function name list is not evaluated\r\nand should consist of a list of function symbols that are possible or frequent\r\nvalues for function-form.  The macro expands into a case statement where values\r\nfor function form which are a member of the function-name list are called\r\ndirectly without funcall.  Thus resulting in more efficient code.\r\n;;}}}\nEqual to (csetq var-to-set (funcall function-form . args)), except that the\nreturn value is undefined.\n;;{{{\nThis function is intended as a higher prefomance\nfuncall under SUBL\'s C based version.  The function name list is not evaluated\nand should consist of a list of function symbols that are possible or frequent\nvalues for function-form.  The macro expands into a case statement where values\nfor function form which are a member of the function-name list are called\ndirectly without funcall.  Thus resulting in more efficient code.\n;;}}}")
    public static final SubLObject fast_funcall_setq_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject var_to_set = NIL;
            SubLObject function_form = NIL;
            SubLObject function_name_list = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt359);
            var_to_set = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt359);
            function_form = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt359);
            function_name_list = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                if (NIL == function_name_list) {
                    return list(CSETQ, var_to_set, listS(FUNCALL, function_form, args));
                } else {
                    {
                        SubLObject function_form_evaluated_var = (function_form.isSymbol()) ? ((SubLObject) (function_form)) : make_symbol($str_alt356$function_form_evaluated_var);
                        SubLObject case_list = NIL;
                        SubLObject cdolist_list_var = function_name_list;
                        SubLObject function_name = NIL;
                        for (function_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , function_name = cdolist_list_var.first()) {
                            if (function_name.isSymbol()) {
                                case_list = cons(list(function_name, list(CSETQ, var_to_set, bq_cons(function_name, copy_tree(args)))), case_list);
                            }
                        }
                        if (NIL == case_list) {
                            return listS(FUNCALL, function_form, args);
                        } else {
                            {
                                SubLObject body = listS(PCASE, function_form_evaluated_var, nreverse(cons(list(OTHERWISE, list(CSETQ, var_to_set, listS(FUNCALL, function_form_evaluated_var, copy_tree(args)))), case_list)));
                                if (function_form == function_form_evaluated_var) {
                                    return body;
                                } else {
                                    return list(CLET, list(list(function_form_evaluated_var, function_form)), body);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Equal to (csetq var-to-set (funcall function-form . args)), except that the
     * return value is undefined.
     * ;;{{{
     * This function is intended as a higher prefomance
     * funcall under SUBL's C based version.  The function name list is not evaluated
     * and should consist of a list of function symbols that are possible or frequent
     * values for function-form.  The macro expands into a case statement where values
     * for function form which are a member of the function-name list are called
     * directly without funcall.  Thus resulting in more efficient code.
     * ;;}}}
     */
    @LispMethod(comment = "Equal to (csetq var-to-set (funcall function-form . args)), except that the\r\nreturn value is undefined.\r\n;;{{{\r\nThis function is intended as a higher prefomance\r\nfuncall under SUBL\'s C based version.  The function name list is not evaluated\r\nand should consist of a list of function symbols that are possible or frequent\r\nvalues for function-form.  The macro expands into a case statement where values\r\nfor function form which are a member of the function-name list are called\r\ndirectly without funcall.  Thus resulting in more efficient code.\r\n;;}}}\nEqual to (csetq var-to-set (funcall function-form . args)), except that the\nreturn value is undefined.\n;;{{{\nThis function is intended as a higher prefomance\nfuncall under SUBL\'s C based version.  The function name list is not evaluated\nand should consist of a list of function symbols that are possible or frequent\nvalues for function-form.  The macro expands into a case statement where values\nfor function form which are a member of the function-name list are called\ndirectly without funcall.  Thus resulting in more efficient code.\n;;}}}")
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

    /**
     * Given a list of vars (symbols), this function returns a list of uninterned symbols
     * with the same names and ordering of the orginal list.
     */
    @LispMethod(comment = "Given a list of vars (symbols), this function returns a list of uninterned symbols\r\nwith the same names and ordering of the orginal list.\nGiven a list of vars (symbols), this function returns a list of uninterned symbols\nwith the same names and ordering of the orginal list.")
    public static final SubLObject generate_parallel_var_list_alt(SubLObject var_list) {
        {
            SubLObject new_var_list = NIL;
            SubLObject cdolist_list_var = var_list;
            SubLObject var = NIL;
            for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                new_var_list = cons(make_symbol(symbol_name(var)), new_var_list);
            }
            return nreverse(new_var_list);
        }
    }

    /**
     * Given a list of vars (symbols), this function returns a list of uninterned symbols
     * with the same names and ordering of the orginal list.
     */
    @LispMethod(comment = "Given a list of vars (symbols), this function returns a list of uninterned symbols\r\nwith the same names and ordering of the orginal list.\nGiven a list of vars (symbols), this function returns a list of uninterned symbols\nwith the same names and ordering of the orginal list.")
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

    /**
     * Given a list of destination variables and a list of source variables,
     * this function returns a 'csetq' form that, when evaluated, sets all
     * of the destination values to the values denoted by the source values.
     * ;;{{{
     * Thus, given the lists '(a b c)' and '(x y z)' this function returns
     * the form '(csetq a x b y c z)'.
     * ;;}}}
     */
    @LispMethod(comment = "Given a list of destination variables and a list of source variables,\r\nthis function returns a \'csetq\' form that, when evaluated, sets all\r\nof the destination values to the values denoted by the source values.\r\n;;{{{\r\nThus, given the lists \'(a b c)\' and \'(x y z)\' this function returns\r\nthe form \'(csetq a x b y c z)\'.\r\n;;}}}\nGiven a list of destination variables and a list of source variables,\nthis function returns a \'csetq\' form that, when evaluated, sets all\nof the destination values to the values denoted by the source values.\n;;{{{\nThus, given the lists \'(a b c)\' and \'(x y z)\' this function returns\nthe form \'(csetq a x b y c z)\'.\n;;}}}")
    public static final SubLObject generate_multiple_csetq_alt(SubLObject new_var_list, SubLObject old_var_list) {
        {
            SubLObject body_of_setq = NIL;
            SubLObject sub_new_var_list = NIL;
            SubLObject new_var = NIL;
            SubLObject sub_old_var_list = NIL;
            SubLObject old_var = NIL;
            for (sub_new_var_list = new_var_list, new_var = sub_new_var_list.first(), sub_old_var_list = old_var_list, old_var = sub_old_var_list.first(); !((NIL == sub_new_var_list) || (NIL == sub_old_var_list)); sub_new_var_list = sub_new_var_list.rest() , new_var = sub_new_var_list.first() , sub_old_var_list = sub_old_var_list.rest() , old_var = sub_old_var_list.first()) {
                body_of_setq = cons(new_var, body_of_setq);
                body_of_setq = cons(old_var, body_of_setq);
            }
            return NIL != body_of_setq ? ((SubLObject) (cons(CSETQ, nreverse(body_of_setq)))) : NIL;
        }
    }

    /**
     * Given a list of destination variables and a list of source variables,
     * this function returns a 'csetq' form that, when evaluated, sets all
     * of the destination values to the values denoted by the source values.
     * ;;{{{
     * Thus, given the lists '(a b c)' and '(x y z)' this function returns
     * the form '(csetq a x b y c z)'.
     * ;;}}}
     */
    @LispMethod(comment = "Given a list of destination variables and a list of source variables,\r\nthis function returns a \'csetq\' form that, when evaluated, sets all\r\nof the destination values to the values denoted by the source values.\r\n;;{{{\r\nThus, given the lists \'(a b c)\' and \'(x y z)\' this function returns\r\nthe form \'(csetq a x b y c z)\'.\r\n;;}}}\nGiven a list of destination variables and a list of source variables,\nthis function returns a \'csetq\' form that, when evaluated, sets all\nof the destination values to the values denoted by the source values.\n;;{{{\nThus, given the lists \'(a b c)\' and \'(x y z)\' this function returns\nthe form \'(csetq a x b y c z)\'.\n;;}}}")
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

    /**
     * Optimized for SUBL's C version.  Logically,
     * (cmultiple-value-bind <varlist> <form> . <body>) is equal to
     * (fast-funcall-multiple-value-bind <varlist> (<form> <list> . <args>) . <body>).
     * Where list is an unevaluated list of symbols naming functions that are likely
     * values for <form>.
     */
    @LispMethod(comment = "Optimized for SUBL\'s C version.  Logically,\r\n(cmultiple-value-bind <varlist> <form> . <body>) is equal to\r\n(fast-funcall-multiple-value-bind <varlist> (<form> <list> . <args>) . <body>).\r\nWhere list is an unevaluated list of symbols naming functions that are likely\r\nvalues for <form>.\nOptimized for SUBL\'s C version.  Logically,\n(cmultiple-value-bind <varlist> <form> . <body>) is equal to\n(fast-funcall-multiple-value-bind <varlist> (<form> <list> . <args>) . <body>).\nWhere list is an unevaluated list of symbols naming functions that are likely\nvalues for <form>.")
    public static final SubLObject fast_funcall_multiple_value_bind_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject vars_to_bind = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt360);
            vars_to_bind = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt360);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject function_form = NIL;
                    SubLObject function_name_list = NIL;
                    SubLObject args = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt360);
                    function_form = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt360);
                    function_name_list = current.first();
                    current = current.rest();
                    args = current;
                    current = temp;
                    {
                        SubLObject body = current;
                        if (NIL == function_name_list) {
                            return listS(CMULTIPLE_VALUE_BIND, vars_to_bind, listS(FUNCALL, function_form, args), body);
                        } else {
                            {
                                SubLObject function_form_evaluated_var = (function_form.isSymbol()) ? ((SubLObject) (function_form)) : make_symbol($str_alt356$function_form_evaluated_var);
                                SubLObject case_list = NIL;
                                SubLObject cdolist_list_var = function_name_list;
                                SubLObject function_name = NIL;
                                for (function_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , function_name = cdolist_list_var.first()) {
                                    if (function_name.isSymbol()) {
                                        case_list = cons(list(function_name, listS(CMULTIPLE_VALUE_BIND, vars_to_bind, bq_cons(function_name, copy_tree(args)), body)), case_list);
                                    }
                                }
                                if (NIL == case_list) {
                                    return listS(FUNCALL, function_form, args);
                                } else {
                                    {
                                        SubLObject v_answer = listS(PCASE, function_form_evaluated_var, nreverse(cons(list(OTHERWISE, listS(CMULTIPLE_VALUE_BIND, vars_to_bind, listS(FUNCALL, function_form_evaluated_var, copy_tree(args)), body)), case_list)));
                                        if (function_form == function_form_evaluated_var) {
                                            return v_answer;
                                        } else {
                                            return list(CLET, list(list(function_form_evaluated_var, function_form)), v_answer);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Optimized for SUBL's C version.  Logically,
     * (cmultiple-value-bind <varlist> <form> . <body>) is equal to
     * (fast-funcall-multiple-value-bind <varlist> (<form> <list> . <args>) . <body>).
     * Where list is an unevaluated list of symbols naming functions that are likely
     * values for <form>.
     */
    @LispMethod(comment = "Optimized for SUBL\'s C version.  Logically,\r\n(cmultiple-value-bind <varlist> <form> . <body>) is equal to\r\n(fast-funcall-multiple-value-bind <varlist> (<form> <list> . <args>) . <body>).\r\nWhere list is an unevaluated list of symbols naming functions that are likely\r\nvalues for <form>.\nOptimized for SUBL\'s C version.  Logically,\n(cmultiple-value-bind <varlist> <form> . <body>) is equal to\n(fast-funcall-multiple-value-bind <varlist> (<form> <list> . <args>) . <body>).\nWhere list is an unevaluated list of symbols naming functions that are likely\nvalues for <form>.")
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

    /**
     * Logically,
     * (fast-funcall-multiple-value-setq
     * (x y)
     * 'func1 (f1 f2)
     * 1 2 3) is equivalent to
     * (cmultiple-value-setq
     * (x y)
     * (funcall 'func1 1 2 3)).
     * The return value is undefined.  This macro expands into a code that is
     * optimized for SubL's C version.  If function-form evaluates to a symbol
     * value in the list function-name-list, then that call is made directly
     * without funcall.
     */
    @LispMethod(comment = "Logically,\r\n(fast-funcall-multiple-value-setq\r\n(x y)\r\n\'func1 (f1 f2)\r\n1 2 3) is equivalent to\r\n(cmultiple-value-setq\r\n(x y)\r\n(funcall \'func1 1 2 3)).\r\nThe return value is undefined.  This macro expands into a code that is\r\noptimized for SubL\'s C version.  If function-form evaluates to a symbol\r\nvalue in the list function-name-list, then that call is made directly\r\nwithout funcall.\nLogically,\n(fast-funcall-multiple-value-setq\n(x y)\n\'func1 (f1 f2)\n1 2 3) is equivalent to\n(cmultiple-value-setq\n(x y)\n(funcall \'func1 1 2 3)).\nThe return value is undefined.  This macro expands into a code that is\noptimized for SubL\'s C version.  If function-form evaluates to a symbol\nvalue in the list function-name-list, then that call is made directly\nwithout funcall.")
    public static final SubLObject fast_funcall_multiple_value_setq_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject vars_to_set = NIL;
            SubLObject function_form = NIL;
            SubLObject function_name_list = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt362);
            vars_to_set = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt362);
            function_form = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt362);
            function_name_list = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                if (NIL == function_name_list) {
                    return list(CMULTIPLE_VALUE_SETQ, vars_to_set, listS(FUNCALL, function_form, args));
                } else {
                    {
                        SubLObject function_form_evaluated_var = (function_form.isSymbol()) ? ((SubLObject) (function_form)) : make_symbol($str_alt356$function_form_evaluated_var);
                        SubLObject case_list = NIL;
                        SubLObject cdolist_list_var = function_name_list;
                        SubLObject function_name = NIL;
                        for (function_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , function_name = cdolist_list_var.first()) {
                            if (function_name.isSymbol()) {
                                case_list = cons(list(function_name, list(CMULTIPLE_VALUE_SETQ, vars_to_set, bq_cons(function_name, copy_tree(args)))), case_list);
                            }
                        }
                        if (NIL == case_list) {
                            return listS(FUNCALL, function_form, args);
                        } else {
                            {
                                SubLObject body = listS(PCASE, function_form_evaluated_var, nreverse(cons(list(OTHERWISE, list(CMULTIPLE_VALUE_SETQ, vars_to_set, listS(FUNCALL, function_form_evaluated_var, copy_tree(args)))), case_list)));
                                if (function_form == function_form_evaluated_var) {
                                    return body;
                                } else {
                                    return list(CLET, list(list(function_form_evaluated_var, function_form)), body);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Logically,
     * (fast-funcall-multiple-value-setq
     * (x y)
     * 'func1 (f1 f2)
     * 1 2 3) is equivalent to
     * (cmultiple-value-setq
     * (x y)
     * (funcall 'func1 1 2 3)).
     * The return value is undefined.  This macro expands into a code that is
     * optimized for SubL's C version.  If function-form evaluates to a symbol
     * value in the list function-name-list, then that call is made directly
     * without funcall.
     */
    @LispMethod(comment = "Logically,\r\n(fast-funcall-multiple-value-setq\r\n(x y)\r\n\'func1 (f1 f2)\r\n1 2 3) is equivalent to\r\n(cmultiple-value-setq\r\n(x y)\r\n(funcall \'func1 1 2 3)).\r\nThe return value is undefined.  This macro expands into a code that is\r\noptimized for SubL\'s C version.  If function-form evaluates to a symbol\r\nvalue in the list function-name-list, then that call is made directly\r\nwithout funcall.\nLogically,\n(fast-funcall-multiple-value-setq\n(x y)\n\'func1 (f1 f2)\n1 2 3) is equivalent to\n(cmultiple-value-setq\n(x y)\n(funcall \'func1 1 2 3)).\nThe return value is undefined.  This macro expands into a code that is\noptimized for SubL\'s C version.  If function-form evaluates to a symbol\nvalue in the list function-name-list, then that call is made directly\nwithout funcall.")
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

    public static final SubLObject expand_destructuring_predication_generator_alt(SubLObject predication_structure, SubLObject operand) {
        if (NIL == predication_structure) {
            return list(NULL, operand);
        } else {
            if (predication_structure.isSymbol()) {
                return list(predication_structure, operand);
            } else {
                if (predication_structure.isAtom()) {
                    return T;
                } else {
                    return list(CAND, list(CONSP, operand), expand_destructuring_predication_generator(predication_structure.first(), list(CAR, operand)), expand_destructuring_predication_generator(predication_structure.rest(), list(CDR, operand)));
                }
            }
        }
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

    /**
     *
     *
     * @unknown goolsbey
     */
    @LispMethod(comment = "@unknown goolsbey")
    public static final SubLObject funcall_shortcut_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject function = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt364);
            function = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                if (function.isCons() && (QUOTE == function.first())) {
                    return bq_cons(second(function), append(args, NIL));
                } else {
                    return listS(FUNCALL, function, append(args, NIL));
                }
            }
        }
    }

    /**
     *
     *
     * @unknown goolsbey
     */
    @LispMethod(comment = "@unknown goolsbey")
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

    public static final SubLObject destructuring_predication_generator_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject predication_structure = NIL;
            SubLObject operand = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt365);
            predication_structure = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt365);
            operand = current.first();
            current = current.rest();
            if (NIL == current) {
                return expand_destructuring_predication_generator(predication_structure, operand);
            } else {
                cdestructuring_bind_error(datum, $list_alt365);
            }
        }
        return NIL;
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

    public static final SubLObject symbol_in_tree_p_alt(SubLObject symbol, SubLObject tree) {
        if (NIL == tree) {
            return NIL;
        } else {
            if (tree.isSymbol()) {
                return eq(symbol, tree);
            } else {
                if (tree.isCons()) {
                    return makeBoolean((NIL != symbol_in_tree_p(symbol, tree.first())) || (NIL != symbol_in_tree_p(symbol, tree.rest())));
                } else {
                    return NIL;
                }
            }
        }
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

    public static final SubLObject generate_instance_variable_bindings_for_structure_slots_alt(SubLObject var, SubLObject structure_expression, SubLObject conc_name, SubLObject instance_variables, SubLObject body, SubLObject read_only) {
        if (read_only == UNPROVIDED) {
            read_only = T;
        }
        {
            SubLObject var_bindings = NIL;
            SubLObject update_expressions = NIL;
            SubLObject preprocessed_conc_name = (conc_name.isSymbol()) ? ((SubLObject) (symbol_name(conc_name))) : conc_name;
            SubLObject variable = NIL;
            SubLObject accessor = NIL;
            SubLObject explicit_getter = NIL;
            SubLObject explicit_setter = NIL;
            SubLObject cdolist_list_var = instance_variables;
            SubLObject instance_variable_form = NIL;
            for (instance_variable_form = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , instance_variable_form = cdolist_list_var.first()) {
                if (instance_variable_form.isCons()) {
                    variable = instance_variable_form.first();
                    explicit_getter = cadr(instance_variable_form);
                    explicit_setter = cddr(instance_variable_form).first();
                    accessor = NIL;
                } else {
                    variable = instance_variable_form;
                    explicit_getter = NIL;
                    explicit_setter = NIL;
                    accessor = intern(format(NIL, $str_alt367$_A_S, preprocessed_conc_name, variable), UNPROVIDED);
                }
                if (NIL != symbol_in_tree_p(variable, body)) {
                    var_bindings = cons(list(variable, list(NIL != explicit_getter ? ((SubLObject) (explicit_getter)) : accessor, var)), var_bindings);
                    if (NIL == read_only) {
                        update_expressions = cons(NIL != explicit_setter ? ((SubLObject) (list(explicit_setter, var, variable))) : list(CSETF, list(accessor, var), variable), update_expressions);
                    }
                }
            }
            if (NIL != var_bindings) {
                if (NIL != read_only) {
                    return listS(CLET, bq_cons(list(var, structure_expression), reverse(var_bindings)), body);
                } else {
                    return list(CLET, bq_cons(list(var, structure_expression), reverse(var_bindings)), listS(CUNWIND_PROTECT, bq_cons(PROGN, body), reverse(update_expressions)));
                }
            } else {
                return bq_cons(PROGN, body);
            }
        }
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

    /**
     * Given VAR, a variable to be locally bound on each iteration; LIST-EXPRESSION,
     * an expression that evaluates to a list; COLLECTION-VAR a variable bound outside
     * of this form; iterates over each element of LIST-EXPRESSION, binding VAR to
     * successive elements.  ITERATED-EXPRESSION is evaluated once during each iteration
     * and the value returned is collected into COLLECTION-VAR.  COLLECTION-VAR maintains
     * the result values in the order that they were computed.  This is accomplished without
     * using NREVERSE by using a tail cons pointer to add directly to the end of the list.
     *
     * @unknown sdevoy
     */
    @LispMethod(comment = "Given VAR, a variable to be locally bound on each iteration; LIST-EXPRESSION,\r\nan expression that evaluates to a list; COLLECTION-VAR a variable bound outside\r\nof this form; iterates over each element of LIST-EXPRESSION, binding VAR to\r\nsuccessive elements.  ITERATED-EXPRESSION is evaluated once during each iteration\r\nand the value returned is collected into COLLECTION-VAR.  COLLECTION-VAR maintains\r\nthe result values in the order that they were computed.  This is accomplished without\r\nusing NREVERSE by using a tail cons pointer to add directly to the end of the list.\r\n\r\n@unknown sdevoy\nGiven VAR, a variable to be locally bound on each iteration; LIST-EXPRESSION,\nan expression that evaluates to a list; COLLECTION-VAR a variable bound outside\nof this form; iterates over each element of LIST-EXPRESSION, binding VAR to\nsuccessive elements.  ITERATED-EXPRESSION is evaluated once during each iteration\nand the value returned is collected into COLLECTION-VAR.  COLLECTION-VAR maintains\nthe result values in the order that they were computed.  This is accomplished without\nusing NREVERSE by using a tail cons pointer to add directly to the end of the list.")
    public static final SubLObject cdolist_collecting_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt368);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    SubLObject list_expression = NIL;
                    SubLObject collection_var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt368);
                    var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt368);
                    list_expression = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt368);
                    collection_var = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject iterated_expression = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt368);
                            iterated_expression = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject list_expression_var = make_symbol($str_alt369$LIST_EXPRESSION);
                                    SubLObject tail_cons_var = make_symbol($str_alt370$TAIL_CONS);
                                    SubLObject result_var = make_symbol($$$RESULT);
                                    return list(CLET, list(list(list_expression_var, list_expression)), list(PCOND, list(list(NULL, list_expression_var), listS(CSETQ, collection_var, $list_alt213)), list(list(ATOM, list_expression_var), list(CSETQ, collection_var, list(LIST, list_expression_var))), list(list(NULL, list(CDR, list_expression_var)), list(CLET, list(list(var, list(CAR, list_expression_var))), list(CSETQ, collection_var, list(LIST, iterated_expression)))), list(T, list(CLET, list(bq_cons(tail_cons_var, $list_alt213), bq_cons(result_var, $list_alt213)), list(CLET, list(list(var, list(CAR, list_expression_var))), list(CSETQ, collection_var, list(LIST, iterated_expression)), list(CSETQ, tail_cons_var, collection_var)), list(CDOLIST, list(var, list(CDR, list_expression_var)), list(CSETQ, result_var, list(LIST, iterated_expression)), list(RPLACD, tail_cons_var, result_var), list(CSETQ, tail_cons_var, result_var))))));
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt368);
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt368);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Given VAR, a variable to be locally bound on each iteration; LIST-EXPRESSION,
     * an expression that evaluates to a list; COLLECTION-VAR a variable bound outside
     * of this form; iterates over each element of LIST-EXPRESSION, binding VAR to
     * successive elements.  ITERATED-EXPRESSION is evaluated once during each iteration
     * and the value returned is collected into COLLECTION-VAR.  COLLECTION-VAR maintains
     * the result values in the order that they were computed.  This is accomplished without
     * using NREVERSE by using a tail cons pointer to add directly to the end of the list.
     *
     * @unknown sdevoy
     */
    @LispMethod(comment = "Given VAR, a variable to be locally bound on each iteration; LIST-EXPRESSION,\r\nan expression that evaluates to a list; COLLECTION-VAR a variable bound outside\r\nof this form; iterates over each element of LIST-EXPRESSION, binding VAR to\r\nsuccessive elements.  ITERATED-EXPRESSION is evaluated once during each iteration\r\nand the value returned is collected into COLLECTION-VAR.  COLLECTION-VAR maintains\r\nthe result values in the order that they were computed.  This is accomplished without\r\nusing NREVERSE by using a tail cons pointer to add directly to the end of the list.\r\n\r\n@unknown sdevoy\nGiven VAR, a variable to be locally bound on each iteration; LIST-EXPRESSION,\nan expression that evaluates to a list; COLLECTION-VAR a variable bound outside\nof this form; iterates over each element of LIST-EXPRESSION, binding VAR to\nsuccessive elements.  ITERATED-EXPRESSION is evaluated once during each iteration\nand the value returned is collected into COLLECTION-VAR.  COLLECTION-VAR maintains\nthe result values in the order that they were computed.  This is accomplished without\nusing NREVERSE by using a tail cons pointer to add directly to the end of the list.")
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
                return list(CLET, list(list(list_expression_var, list_expression)), list(PCOND, list(list(NULL, list_expression_var), listS(CSETQ, collection_var, $list212)), list(list(ATOM, list_expression_var), list(CSETQ, collection_var, list(LIST, list_expression_var))), list(list(NULL, list(CDR, list_expression_var)), list(CLET, list(list(var, list(CAR, list_expression_var))), list(CSETQ, collection_var, list(LIST, iterated_expression)))), list(T, list(CLET, list(bq_cons(tail_cons_var, $list212), bq_cons(result_var, $list212)), list(CLET, list(list(var, list(CAR, list_expression_var))), list(CSETQ, collection_var, list(LIST, iterated_expression)), list(CSETQ, tail_cons_var, collection_var)), list(CDOLIST, list(var, list(CDR, list_expression_var)), list(CSETQ, result_var, list(LIST, iterated_expression)), list(RPLACD, tail_cons_var, result_var), list(CSETQ, tail_cons_var, result_var))))));
            }
            cdestructuring_bind_error(datum, $list394);
        } else {
            cdestructuring_bind_error(datum, $list394);
        }
        return NIL;
    }

    /**
     * Given VAR, a variable to be locally bound on each iteration; LIST-EXPRESSION,
     * an expression that evaluates to a list; COLLECTION-VAR a variable bound outside
     * of this form; iterates over each element of LIST-EXPRESSION, binding VAR to
     * successive elements.  ITERATED-EXPRESSION is evaluated once during each iteration
     * and the value returned is collected appended to the end of COLLECTION-VAR.
     * COLLECTION-VAR maintains the result values in the order that they were computed.
     * A tail pointer is used to point at the last cons after each iteration so that
     * the next result can be spliced into place.
     *
     * @unknown sdevoy
     */
    @LispMethod(comment = "Given VAR, a variable to be locally bound on each iteration; LIST-EXPRESSION,\r\nan expression that evaluates to a list; COLLECTION-VAR a variable bound outside\r\nof this form; iterates over each element of LIST-EXPRESSION, binding VAR to\r\nsuccessive elements.  ITERATED-EXPRESSION is evaluated once during each iteration\r\nand the value returned is collected appended to the end of COLLECTION-VAR.\r\nCOLLECTION-VAR maintains the result values in the order that they were computed.\r\nA tail pointer is used to point at the last cons after each iteration so that\r\nthe next result can be spliced into place.\r\n\r\n@unknown sdevoy\nGiven VAR, a variable to be locally bound on each iteration; LIST-EXPRESSION,\nan expression that evaluates to a list; COLLECTION-VAR a variable bound outside\nof this form; iterates over each element of LIST-EXPRESSION, binding VAR to\nsuccessive elements.  ITERATED-EXPRESSION is evaluated once during each iteration\nand the value returned is collected appended to the end of COLLECTION-VAR.\nCOLLECTION-VAR maintains the result values in the order that they were computed.\nA tail pointer is used to point at the last cons after each iteration so that\nthe next result can be spliced into place.")
    public static final SubLObject cdolist_appending_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt368);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    SubLObject list_expression = NIL;
                    SubLObject collection_var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt368);
                    var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt368);
                    list_expression = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt368);
                    collection_var = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject iterated_expression = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt368);
                            iterated_expression = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject list_expression_var = make_symbol($str_alt369$LIST_EXPRESSION);
                                    SubLObject tail_cons_var = make_symbol($str_alt370$TAIL_CONS);
                                    SubLObject result_var = make_symbol($$$RESULT);
                                    return list(CLET, list(list(list_expression_var, list_expression)), list(PCOND, list(list(NULL, list_expression_var), listS(CSETQ, collection_var, $list_alt213)), list(list(ATOM, list_expression_var), list(CSETQ, collection_var, list(LIST, list_expression_var))), list(list(NULL, list(CDR, list_expression_var)), list(CLET, list(list(var, list(CAR, list_expression_var))), list(CSETQ, collection_var, iterated_expression))), list(T, list(CLET, list(bq_cons(tail_cons_var, $list_alt213), bq_cons(result_var, $list_alt213)), listS(CSETQ, collection_var, $list_alt213), list(CDOLIST, list(var, list_expression_var), list(CSETQ, result_var, iterated_expression), list(PWHEN, result_var, list(PIF, tail_cons_var, list(PROGN, list(RPLACD, tail_cons_var, result_var), list(CSETQ, tail_cons_var, list(LAST, result_var))), list(PROGN, list(CSETQ, collection_var, iterated_expression), list(CSETQ, tail_cons_var, list(LAST, collection_var))))))))));
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt368);
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt368);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Given VAR, a variable to be locally bound on each iteration; LIST-EXPRESSION,
     * an expression that evaluates to a list; COLLECTION-VAR a variable bound outside
     * of this form; iterates over each element of LIST-EXPRESSION, binding VAR to
     * successive elements.  ITERATED-EXPRESSION is evaluated once during each iteration
     * and the value returned is collected appended to the end of COLLECTION-VAR.
     * COLLECTION-VAR maintains the result values in the order that they were computed.
     * A tail pointer is used to point at the last cons after each iteration so that
     * the next result can be spliced into place.
     *
     * @unknown sdevoy
     */
    @LispMethod(comment = "Given VAR, a variable to be locally bound on each iteration; LIST-EXPRESSION,\r\nan expression that evaluates to a list; COLLECTION-VAR a variable bound outside\r\nof this form; iterates over each element of LIST-EXPRESSION, binding VAR to\r\nsuccessive elements.  ITERATED-EXPRESSION is evaluated once during each iteration\r\nand the value returned is collected appended to the end of COLLECTION-VAR.\r\nCOLLECTION-VAR maintains the result values in the order that they were computed.\r\nA tail pointer is used to point at the last cons after each iteration so that\r\nthe next result can be spliced into place.\r\n\r\n@unknown sdevoy\nGiven VAR, a variable to be locally bound on each iteration; LIST-EXPRESSION,\nan expression that evaluates to a list; COLLECTION-VAR a variable bound outside\nof this form; iterates over each element of LIST-EXPRESSION, binding VAR to\nsuccessive elements.  ITERATED-EXPRESSION is evaluated once during each iteration\nand the value returned is collected appended to the end of COLLECTION-VAR.\nCOLLECTION-VAR maintains the result values in the order that they were computed.\nA tail pointer is used to point at the last cons after each iteration so that\nthe next result can be spliced into place.")
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
                return list(CLET, list(list(list_expression_var, list_expression)), list(PCOND, list(list(NULL, list_expression_var), listS(CSETQ, collection_var, $list212)), list(list(ATOM, list_expression_var), list(CSETQ, collection_var, list(LIST, list_expression_var))), list(list(NULL, list(CDR, list_expression_var)), list(CLET, list(list(var, list(CAR, list_expression_var))), list(CSETQ, collection_var, iterated_expression))), list(T, list(CLET, list(bq_cons(tail_cons_var, $list212), bq_cons(result_var, $list212)), listS(CSETQ, collection_var, $list212), list(CDOLIST, list(var, list_expression_var), list(CSETQ, result_var, iterated_expression), list(PWHEN, result_var, list(PIF, tail_cons_var, list(PROGN, list(RPLACD, tail_cons_var, result_var), list(CSETQ, tail_cons_var, list(LAST, result_var))), list(PROGN, list(CSETQ, collection_var, iterated_expression), list(CSETQ, tail_cons_var, list(LAST, collection_var))))))))));
            }
            cdestructuring_bind_error(datum, $list394);
        } else {
            cdestructuring_bind_error(datum, $list394);
        }
        return NIL;
    }

    public static final SubLObject expand_define_list_element_predicator_alt(SubLObject function_name, SubLObject function_scope, SubLObject element_var, SubLObject type, SubLObject body) {
        {
            SubLObject defining_form = NIL;
            SubLObject definition = NIL;
            {
                SubLObject pcase_var = function_scope;
                if (pcase_var.eql($API)) {
                    defining_form = DEFINE_API;
                } else {
                    if (pcase_var.eql($PUBLIC)) {
                        defining_form = DEFINE_PUBLIC;
                    } else {
                        if (pcase_var.eql($PROTECTED)) {
                            defining_form = DEFINE_PROTECTED;
                        } else {
                            if (pcase_var.eql($PRIVATE)) {
                                defining_form = DEFINE_PRIVATE;
                            } else {
                                defining_form = DEFINE_PUBLIC;
                            }
                        }
                    }
                }
            }
            {
                SubLObject pcase_var = type;
                if (pcase_var.eql($ALL)) {
                    definition = listS(defining_form, function_name, $list_alt308, $list_alt381, list(CDOLIST, bq_cons(element_var, $list_alt308), listS(PUNLESS, body, $list_alt207)), $list_alt206);
                } else {
                    if (pcase_var.eql($NOT_EMPTY_ALL)) {
                        definition = listS(defining_form, function_name, $list_alt308, $list_alt383, list(CDOLIST, bq_cons(element_var, $list_alt308), listS(PUNLESS, body, $list_alt207)), $list_alt206);
                    } else {
                        if (pcase_var.eql($ANY)) {
                            definition = listS(defining_form, function_name, $list_alt308, $list_alt381, list(CDOLIST, bq_cons(element_var, $list_alt308), listS(PWHEN, body, $list_alt206)), $list_alt207);
                        } else {
                            Errors.error($str_alt385$DEFINE_LIST_ELEMENT_PREDICATOR___, type);
                        }
                    }
                }
            }
            return definition;
        }
    }

    public static SubLObject expand_define_list_element_predicator(final SubLObject function_name, final SubLObject function_scope, final SubLObject element_var, final SubLObject type, final SubLObject body) {
        SubLObject defining_form = NIL;
        SubLObject definition = NIL;
        if (function_scope.eql($API)) {
            defining_form = DEFINE_API;
        } else
            if (function_scope.eql($PUBLIC)) {
                defining_form = DEFINE_PUBLIC;
            } else
                if (function_scope.eql($PROTECTED)) {
                    defining_form = DEFINE_PROTECTED;
                } else
                    if (function_scope.eql($PRIVATE)) {
                        defining_form = DEFINE_PRIVATE;
                    } else {
                        defining_form = DEFINE_PUBLIC;
                    }



        if (type.eql($ALL)) {
            definition = listS(defining_form, function_name, $list334, $list407, list(CDOLIST, bq_cons(element_var, $list334), listS(PUNLESS, body, $list206)), $list205);
        } else
            if (type.eql($NOT_EMPTY_ALL)) {
                definition = listS(defining_form, function_name, $list334, $list409, list(CDOLIST, bq_cons(element_var, $list334), listS(PUNLESS, body, $list206)), $list205);
            } else
                if (type.eql($ANY)) {
                    definition = listS(defining_form, function_name, $list334, $list407, list(CDOLIST, bq_cons(element_var, $list334), listS(PWHEN, body, $list205)), $list206);
                } else {
                    Errors.error($str411$DEFINE_LIST_ELEMENT_PREDICATOR___, type);
                }


        return definition;
    }

    public static final SubLObject define_api_list_element_predicator_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject function_name = NIL;
            SubLObject type = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt386);
            function_name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt386);
            type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt386);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject element_var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt386);
                    element_var = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject expression = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt386);
                            expression = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                return expand_define_list_element_predicator(function_name, $API, element_var, type, expression);
                            } else {
                                cdestructuring_bind_error(datum, $list_alt386);
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt386);
                    }
                }
            }
        }
        return NIL;
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

    public static final SubLObject define_public_list_element_predicator_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject function_name = NIL;
            SubLObject type = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt386);
            function_name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt386);
            type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt386);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject element_var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt386);
                    element_var = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject expression = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt386);
                            expression = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                return expand_define_list_element_predicator(function_name, $PUBLIC, element_var, type, expression);
                            } else {
                                cdestructuring_bind_error(datum, $list_alt386);
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt386);
                    }
                }
            }
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

    public static final SubLObject define_protected_list_element_predicator_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject function_name = NIL;
            SubLObject type = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt386);
            function_name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt386);
            type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt386);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject element_var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt386);
                    element_var = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject expression = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt386);
                            expression = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                return expand_define_list_element_predicator(function_name, $PROTECTED, element_var, type, expression);
                            } else {
                                cdestructuring_bind_error(datum, $list_alt386);
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt386);
                    }
                }
            }
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

    public static final SubLObject define_private_list_element_predicator_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject function_name = NIL;
            SubLObject type = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt386);
            function_name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt386);
            type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt386);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject element_var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt386);
                    element_var = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject expression = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt386);
                            expression = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                return expand_define_list_element_predicator(function_name, $PRIVATE, element_var, type, expression);
                            } else {
                                cdestructuring_bind_error(datum, $list_alt386);
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt386);
                    }
                }
            }
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

    /**
     * potentially usefull for other macro hackers... gets a signature you can call
     * a given function from the signature of its definition.
     */
    @LispMethod(comment = "potentially usefull for other macro hackers... gets a signature you can call\r\na given function from the signature of its definition.\npotentially usefull for other macro hackers... gets a signature you can call\na given function from the signature of its definition.")
    public static final SubLObject argnames_from_arglist_alt(SubLObject arg_list) {
        return remove($sym387$_OPTIONAL, Mapping.mapcar(CAR_IF_LIST, arg_list), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * potentially usefull for other macro hackers... gets a signature you can call
     * a given function from the signature of its definition.
     */
    @LispMethod(comment = "potentially usefull for other macro hackers... gets a signature you can call\r\na given function from the signature of its definition.\npotentially usefull for other macro hackers... gets a signature you can call\na given function from the signature of its definition.")
    public static SubLObject argnames_from_arglist(final SubLObject arg_list) {
        return remove($sym413$_OPTIONAL, Mapping.mapcar(CAR_IF_LIST, arg_list), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject car_if_list_alt(SubLObject arg) {
        return arg.isCons() ? ((SubLObject) (arg.first())) : arg;
    }

    public static SubLObject car_if_list(final SubLObject arg) {
        return arg.isCons() ? arg.first() : arg;
    }

    public static SubLObject car_if_list_or_nil(final SubLObject arg) {
        return arg.isCons() ? arg.first() : NIL;
    }

    public static final SubLObject expand_fcond_alt(SubLObject v_clauses) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!v_clauses.isList()) {
                    Errors.error($str_alt389$FCOND___S_is_not_a_valid_clause_l, v_clauses);
                }
            }
            if (v_clauses.first().isAtom()) {
                Errors.error($str_alt390$FCOND___S_is_not_a_valid_clause_, v_clauses.first());
            } else {
                if (NIL != v_clauses.rest()) {
                    {
                        SubLObject first_clause = v_clauses.first();
                        SubLObject rest_of_clauses = v_clauses.rest();
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((first_clause.isCons() && first_clause.rest().isCons()) && (NIL == cddr(first_clause)))) {
                                Errors.error($str_alt390$FCOND___S_is_not_a_valid_clause_, first_clause);
                            }
                        }
                        return list(FIF, first_clause.first(), cadr(first_clause), expand_fcond(rest_of_clauses));
                    }
                } else {
                    return listS(FIF, caar(v_clauses), cadr(v_clauses.first()), $list_alt213);
                }
            }
            return NIL;
        }
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

    public static final SubLObject fcond_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject v_clauses = current;
            return expand_fcond(v_clauses);
        }
    }

    public static SubLObject fcond(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject v_clauses;
        final SubLObject current = v_clauses = datum;
        return expand_fcond(v_clauses);
    }

    public static final SubLObject check_p_range_case_clauses_alt(SubLObject v_clauses) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!v_clauses.isList()) {
                    Errors.error($str_alt392$P_RANGE_CASE__Ill_formed_clauses_, v_clauses);
                }
            }
            {
                SubLObject cdolist_list_var = v_clauses;
                SubLObject clause = NIL;
                for (clause = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , clause = cdolist_list_var.first()) {
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (!clause.isCons()) {
                            Errors.error($str_alt393$P_RANGE_CASE___S_is_not_a_valid_c, clause);
                        }
                    }
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (!(((clause.first() == OTHERWISE) || clause.first().isInteger()) || (((clause.first().isCons() && caar(clause).isInteger()) && cdar(clause).isCons()) && cadr(clause.first()).isInteger()))) {
                            Errors.error($str_alt393$P_RANGE_CASE___S_is_not_a_valid_c, clause);
                        }
                    }
                }
            }
            return T;
        }
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

    public static final SubLObject utilities_macros_car_eq_alt(SubLObject item, SubLObject cons) {
        return eq(item, cons.first());
    }

    public static SubLObject utilities_macros_car_eq(final SubLObject item, final SubLObject cons) {
        return eq(item, cons.first());
    }

    public static final SubLObject expand_p_range_case_alt(SubLObject value, SubLObject v_clauses) {
        {
            SubLObject value_var = make_symbol($$$value);
            SubLObject processed_clauses = NIL;
            SubLObject otherwise_clause = assoc(OTHERWISE, v_clauses, UNPROVIDED, UNPROVIDED);
            if (NIL != otherwise_clause) {
                otherwise_clause = list(bq_cons(T, append(otherwise_clause.rest(), NIL)));
                v_clauses = remove(OTHERWISE, v_clauses, symbol_function(EQ), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            {
                SubLObject list_expression = v_clauses;
                if (NIL == list_expression) {
                    processed_clauses = NIL;
                } else {
                    if (list_expression.isAtom()) {
                        processed_clauses = list(list_expression);
                    } else {
                        if (NIL == list_expression.rest()) {
                            {
                                SubLObject clause = list_expression.first();
                                processed_clauses = list(clause.first().isCons() ? ((SubLObject) (bq_cons(list(CAND, list($sym395$__, value_var, caar(clause)), list($sym396$__, value_var, cadr(clause.first()))), clause.rest()))) : bq_cons(list($sym397$_, value_var, clause.first()), clause.rest()));
                            }
                        } else {
                            {
                                SubLObject tail_cons = NIL;
                                SubLObject result = NIL;
                                {
                                    SubLObject clause = list_expression.first();
                                    processed_clauses = list(clause.first().isCons() ? ((SubLObject) (bq_cons(list(CAND, list($sym395$__, value_var, caar(clause)), list($sym396$__, value_var, cadr(clause.first()))), clause.rest()))) : bq_cons(list($sym397$_, value_var, clause.first()), clause.rest()));
                                    tail_cons = processed_clauses;
                                }
                                {
                                    SubLObject cdolist_list_var = list_expression.rest();
                                    SubLObject clause = NIL;
                                    for (clause = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , clause = cdolist_list_var.first()) {
                                        result = list(clause.first().isCons() ? ((SubLObject) (bq_cons(list(CAND, list($sym395$__, value_var, caar(clause)), list($sym396$__, value_var, cadr(clause.first()))), clause.rest()))) : bq_cons(list($sym397$_, value_var, clause.first()), clause.rest()));
                                        rplacd(tail_cons, result);
                                        tail_cons = result;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return list(CLET, list(list(value_var, value)), bq_cons(PCOND, append(processed_clauses, otherwise_clause, NIL)));
        }
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
        } else
            if (list_expression.isAtom()) {
                processed_clauses = list(list_expression);
            } else
                if (NIL == list_expression.rest()) {
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

    public static final SubLObject p_range_case_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt398);
            value = current.first();
            current = current.rest();
            {
                SubLObject v_clauses = current;
                check_p_range_case_clauses(v_clauses);
                return expand_p_range_case(value, v_clauses);
            }
        }
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

    public static final SubLObject default_code_branch_error_clause_alt(SubLObject version) {
        return list(ERROR, $str_alt400$Invalid_version_code__A_, version);
    }

    public static SubLObject default_code_branch_error_clause(final SubLObject version) {
        return list(ERROR, $str425$Invalid_version_code__A_, version);
    }

    /**
     * A glorified pcase statement that dispatches to code sections based on the
     * value of a version variable.
     */
    @LispMethod(comment = "A glorified pcase statement that dispatches to code sections based on the\r\nvalue of a version variable.\nA glorified pcase statement that dispatches to code sections based on the\nvalue of a version variable.")
    public static final SubLObject code_branch_by_version_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt401);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject version = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt401);
                    version = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject version_bodies = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt401);
                            version_bodies = current.first();
                            current = current.rest();
                            {
                                SubLObject allow_other_keys_p = NIL;
                                SubLObject rest = current;
                                SubLObject bad = NIL;
                                SubLObject current_11 = NIL;
                                for (; NIL != rest;) {
                                    destructuring_bind_must_consp(rest, datum, $list_alt401);
                                    current_11 = rest.first();
                                    rest = rest.rest();
                                    destructuring_bind_must_consp(rest, datum, $list_alt401);
                                    if (NIL == member(current_11, $list_alt402, UNPROVIDED, UNPROVIDED)) {
                                        bad = T;
                                    }
                                    if (current_11 == $ALLOW_OTHER_KEYS) {
                                        allow_other_keys_p = rest.first();
                                    }
                                    rest = rest.rest();
                                }
                                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                    cdestructuring_bind_error(datum, $list_alt401);
                                }
                                {
                                    SubLObject error_clause_tail = property_list_member($ERROR_CLAUSE, current);
                                    SubLObject error_clause = (NIL != error_clause_tail) ? ((SubLObject) (cadr(error_clause_tail))) : NIL;
                                    SubLObject v_clauses = NIL;
                                    v_clauses = cons(list(OTHERWISE, NIL != error_clause ? ((SubLObject) (error_clause)) : default_code_branch_error_clause(version)), v_clauses);
                                    {
                                        SubLObject cdolist_list_var = version_bodies;
                                        SubLObject version_body = NIL;
                                        for (version_body = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , version_body = cdolist_list_var.first()) {
                                            {
                                                SubLObject datum_12 = version_body;
                                                SubLObject current_13 = datum_12;
                                                SubLObject version_14 = NIL;
                                                SubLObject form = NIL;
                                                destructuring_bind_must_consp(current_13, datum_12, $list_alt404);
                                                version_14 = current_13.first();
                                                current_13 = current_13.rest();
                                                destructuring_bind_must_consp(current_13, datum_12, $list_alt404);
                                                form = current_13.first();
                                                current_13 = current_13.rest();
                                                if (NIL == current_13) {
                                                    v_clauses = cons(list(version_14, form), v_clauses);
                                                } else {
                                                    cdestructuring_bind_error(datum_12, $list_alt404);
                                                }
                                            }
                                        }
                                    }
                                    return listS(PCASE, version, append(v_clauses, NIL));
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt401);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * A glorified pcase statement that dispatches to code sections based on the
     * value of a version variable.
     */
    @LispMethod(comment = "A glorified pcase statement that dispatches to code sections based on the\r\nvalue of a version variable.\nA glorified pcase statement that dispatches to code sections based on the\nvalue of a version variable.")
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

    public static final SubLObject code_branch_by_version_numbers_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt405);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject major = NIL;
                    SubLObject minor = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt405);
                    major = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt405);
                    minor = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject version_bodies = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt405);
                            version_bodies = current.first();
                            current = current.rest();
                            {
                                SubLObject allow_other_keys_p = NIL;
                                SubLObject rest = current;
                                SubLObject bad = NIL;
                                SubLObject current_15 = NIL;
                                for (; NIL != rest;) {
                                    destructuring_bind_must_consp(rest, datum, $list_alt405);
                                    current_15 = rest.first();
                                    rest = rest.rest();
                                    destructuring_bind_must_consp(rest, datum, $list_alt405);
                                    if (NIL == member(current_15, $list_alt402, UNPROVIDED, UNPROVIDED)) {
                                        bad = T;
                                    }
                                    if (current_15 == $ALLOW_OTHER_KEYS) {
                                        allow_other_keys_p = rest.first();
                                    }
                                    rest = rest.rest();
                                }
                                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                    cdestructuring_bind_error(datum, $list_alt405);
                                }
                                {
                                    SubLObject error_clause_tail = property_list_member($ERROR_CLAUSE, current);
                                    SubLObject error_clause = (NIL != error_clause_tail) ? ((SubLObject) (cadr(error_clause_tail))) : NIL;
                                    SubLObject v_clauses = NIL;
                                    v_clauses = cons(list(T, NIL != error_clause ? ((SubLObject) (error_clause)) : default_code_branch_error_clause(major)), v_clauses);
                                    {
                                        SubLObject cdolist_list_var = version_bodies;
                                        SubLObject version_body = NIL;
                                        for (version_body = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , version_body = cdolist_list_var.first()) {
                                            {
                                                SubLObject datum_16 = version_body;
                                                SubLObject current_17 = datum_16;
                                                SubLObject major_version = NIL;
                                                SubLObject minor_version = NIL;
                                                SubLObject form = NIL;
                                                destructuring_bind_must_consp(current_17, datum_16, $list_alt406);
                                                major_version = current_17.first();
                                                current_17 = current_17.rest();
                                                destructuring_bind_must_consp(current_17, datum_16, $list_alt406);
                                                minor_version = current_17.first();
                                                current_17 = current_17.rest();
                                                destructuring_bind_must_consp(current_17, datum_16, $list_alt406);
                                                form = current_17.first();
                                                current_17 = current_17.rest();
                                                if (NIL == current_17) {
                                                    v_clauses = cons(list(list(CAND, list(EQUAL, major_version, major), list(EQUAL, minor_version, minor)), form), v_clauses);
                                                } else {
                                                    cdestructuring_bind_error(datum_16, $list_alt406);
                                                }
                                            }
                                        }
                                    }
                                    return bq_cons(PCOND, append(v_clauses, NIL));
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt405);
                    }
                }
            }
        }
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

    /**
     * Given *foo-kb-loaded?*, returns the string "foo-kb-loaded"
     */
    @LispMethod(comment = "Given *foo-kb-loaded?*, returns the string \"foo-kb-loaded\"")
    public static final SubLObject sub_kb_loaded_root_string_alt(SubLObject sub_kb_symbol) {
        {
            SubLObject sub_kb_string = symbol_name(sub_kb_symbol);
            SubLObject len = length(sub_kb_string);
            SubLObject root_string = string_utilities.substring(sub_kb_string, ONE_INTEGER, subtract(len, TWO_INTEGER));
            return root_string;
        }
    }

    /**
     * Given *foo-kb-loaded?*, returns the string "foo-kb-loaded"
     */
    @LispMethod(comment = "Given *foo-kb-loaded?*, returns the string \"foo-kb-loaded\"")
    public static SubLObject sub_kb_loaded_root_string(final SubLObject sub_kb_symbol) {
        final SubLObject sub_kb_string = symbol_name(sub_kb_symbol);
        final SubLObject len = length(sub_kb_string);
        final SubLObject root_string = string_utilities.substring(sub_kb_string, ONE_INTEGER, subtract(len, TWO_INTEGER));
        return root_string;
    }

    public static final SubLObject sub_kb_loaded_p_symbol_alt(SubLObject sub_kb_symbol) {
        {
            SubLObject root_string = sub_kb_loaded_root_string(sub_kb_symbol);
            SubLObject loaded_p_string = cconcatenate(root_string, $str_alt409$_P);
            return intern(loaded_p_string, UNPROVIDED);
        }
    }

    public static SubLObject sub_kb_loaded_p_symbol(final SubLObject sub_kb_symbol) {
        final SubLObject root_string = sub_kb_loaded_root_string(sub_kb_symbol);
        final SubLObject loaded_p_string = cconcatenate(root_string, $str434$_P);
        return intern(loaded_p_string, UNPROVIDED);
    }

    public static final SubLObject sub_kb_set_symbol_alt(SubLObject sub_kb_symbol) {
        {
            SubLObject root_string = sub_kb_loaded_root_string(sub_kb_symbol);
            SubLObject set_string = cconcatenate($str_alt411$SET_, root_string);
            return intern(set_string, UNPROVIDED);
        }
    }

    public static SubLObject sub_kb_set_symbol(final SubLObject sub_kb_symbol) {
        final SubLObject root_string = sub_kb_loaded_root_string(sub_kb_symbol);
        final SubLObject set_string = cconcatenate($str436$SET_, root_string);
        return intern(set_string, UNPROVIDED);
    }

    public static final SubLObject sub_kb_unset_symbol_alt(SubLObject sub_kb_symbol) {
        {
            SubLObject root_string = sub_kb_loaded_root_string(sub_kb_symbol);
            SubLObject unset_string = cconcatenate($str_alt413$UNSET_, root_string);
            return intern(unset_string, UNPROVIDED);
        }
    }

    public static SubLObject sub_kb_unset_symbol(final SubLObject sub_kb_symbol) {
        final SubLObject root_string = sub_kb_loaded_root_string(sub_kb_symbol);
        final SubLObject unset_string = cconcatenate($str438$UNSET_, root_string);
        return intern(unset_string, UNPROVIDED);
    }

    /**
     * Defines SUB-KB-SYMBOL as a private global, and defines three
     * functions whose names are based on frobbing the name of SUB-KB-SYMBOL:
     * a boolean testing function, a setter function, and an unsetter function.
     * LOADED-DOC-STRING is the doc string for the boolean testing function.
     */
    @LispMethod(comment = "Defines SUB-KB-SYMBOL as a private global, and defines three\r\nfunctions whose names are based on frobbing the name of SUB-KB-SYMBOL:\r\na boolean testing function, a setter function, and an unsetter function.\r\nLOADED-DOC-STRING is the doc string for the boolean testing function.\nDefines SUB-KB-SYMBOL as a private global, and defines three\nfunctions whose names are based on frobbing the name of SUB-KB-SYMBOL:\na boolean testing function, a setter function, and an unsetter function.\nLOADED-DOC-STRING is the doc string for the boolean testing function.")
    public static final SubLObject declare_kb_feature_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject sub_kb_symbol = NIL;
            SubLObject loaded_doc_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt414);
            sub_kb_symbol = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt414);
            loaded_doc_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject loaded_p_symbol = sub_kb_loaded_p_symbol(sub_kb_symbol);
                    SubLObject set_symbol = sub_kb_set_symbol(sub_kb_symbol);
                    SubLObject unset_symbol = sub_kb_unset_symbol(sub_kb_symbol);
                    return list(PROGN, listS(DEFGLOBAL_PRIVATE, sub_kb_symbol, $list_alt213), listS(CPUSHNEW, list(QUOTE, sub_kb_symbol), $list_alt416), list(DEFINE_PUBLIC, loaded_p_symbol, NIL, loaded_doc_string, list(RET, sub_kb_symbol)), listS(DEFINE_PROTECTED, set_symbol, NIL, listS(CSETQ, sub_kb_symbol, $list_alt417), $list_alt206), listS(DEFINE_PROTECTED, unset_symbol, NIL, listS(CSETQ, sub_kb_symbol, $list_alt213), $list_alt207));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt414);
            }
        }
        return NIL;
    }

    /**
     * Defines SUB-KB-SYMBOL as a private global, and defines three
     * functions whose names are based on frobbing the name of SUB-KB-SYMBOL:
     * a boolean testing function, a setter function, and an unsetter function.
     * LOADED-DOC-STRING is the doc string for the boolean testing function.
     */
    @LispMethod(comment = "Defines SUB-KB-SYMBOL as a private global, and defines three\r\nfunctions whose names are based on frobbing the name of SUB-KB-SYMBOL:\r\na boolean testing function, a setter function, and an unsetter function.\r\nLOADED-DOC-STRING is the doc string for the boolean testing function.\nDefines SUB-KB-SYMBOL as a private global, and defines three\nfunctions whose names are based on frobbing the name of SUB-KB-SYMBOL:\na boolean testing function, a setter function, and an unsetter function.\nLOADED-DOC-STRING is the doc string for the boolean testing function.")
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

    public static final SubLObject expand_format_to_string_alt(SubLObject args) {
        {
            SubLObject expressions = NIL;
            SubLObject sub_args = NIL;
            SubLObject control_arg = NIL;
            SubLObject value_arg = NIL;
            for (sub_args = args, control_arg = (NIL != sub_args) ? ((SubLObject) (sub_args.first())) : NIL, value_arg = (NIL != sub_args) ? ((SubLObject) (cadr(sub_args))) : NIL; NIL != sub_args; sub_args = cddr(sub_args) , control_arg = (NIL != sub_args) ? ((SubLObject) (sub_args.first())) : NIL , value_arg = (NIL != sub_args) ? ((SubLObject) (cadr(sub_args))) : NIL) {
                {
                    SubLObject pcase_var = control_arg;
                    if (pcase_var.eql($A)) {
                        expressions = cons(value_arg, expressions);
                    } else {
                        if (pcase_var.eql($S)) {
                            expressions = cons(list(SYMBOL_NAME, value_arg), expressions);
                        } else {
                            if (pcase_var.eql($D)) {
                                expressions = cons(list(TO_STRING, value_arg), expressions);
                            }
                        }
                    }
                }
            }
            return bq_cons(CCONCATENATE, append(nreverse(expressions), NIL));
        }
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
            } else
                if (pcase_var.eql($S)) {
                    expressions = cons(list(SYMBOL_NAME, value_arg), expressions);
                } else
                    if (pcase_var.eql($D)) {
                        expressions = cons(list(TO_STRING, value_arg), expressions);
                    }


            sub_args = cddr(sub_args);
            control_arg = (NIL != sub_args) ? sub_args.first() : NIL;
            value_arg = (NIL != sub_args) ? cadr(sub_args) : NIL;
        } 
        return bq_cons(CCONCATENATE, append(nreverse(expressions), NIL));
    }

    /**
     * Much like format.  Always produces a string.  Does not use 'format nil'.
     * Takes a list of alternating keyword, expression args.  Keywords indicate
     * the expected type of the expression to follow.  :A signifies string,
     * :S signifies symbol, and :D signifies number.
     * e.g. (format-to-string :a "FOO" :a "-" :s 'bar :a "-" :d 10)
     * -> "FOO-BAR-10"
     *
     * @unknown sdevoy
     */
    @LispMethod(comment = "Much like format.  Always produces a string.  Does not use \'format nil\'.\r\nTakes a list of alternating keyword, expression args.  Keywords indicate\r\nthe expected type of the expression to follow.  :A signifies string,\r\n:S signifies symbol, and :D signifies number.\r\ne.g. (format-to-string :a \"FOO\" :a \"-\" :s \'bar :a \"-\" :d 10)\r\n-> \"FOO-BAR-10\"\r\n\r\n@unknown sdevoy\nMuch like format.  Always produces a string.  Does not use \'format nil\'.\nTakes a list of alternating keyword, expression args.  Keywords indicate\nthe expected type of the expression to follow.  :A signifies string,\n:S signifies symbol, and :D signifies number.\ne.g. (format-to-string :a \"FOO\" :a \"-\" :s \'bar :a \"-\" :d 10)\n-> \"FOO-BAR-10\"")
    public static final SubLObject format_to_string_alt(SubLObject macroform, SubLObject environment) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = macroform.rest();
                SubLObject current = datum;
                SubLObject format_args = current;
                SubLObject key_expected = T;
                SubLObject cdolist_list_var = format_args;
                SubLObject arg = NIL;
                for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                    if (NIL != key_expected) {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == member(arg, $list_alt423, UNPROVIDED, UNPROVIDED)) {
                                Errors.error($str_alt424$FORMAT_TO_STRING___S_is_an_invali, arg);
                            }
                        }
                    }
                    key_expected = makeBoolean(NIL == key_expected);
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == key_expected) {
                        Errors.error($str_alt425$FORMAT_TO_STRING__Odd_number_of_a, format_args);
                    }
                }
                return expand_format_to_string(format_args);
            }
        }
    }

    /**
     * Much like format.  Always produces a string.  Does not use 'format nil'.
     * Takes a list of alternating keyword, expression args.  Keywords indicate
     * the expected type of the expression to follow.  :A signifies string,
     * :S signifies symbol, and :D signifies number.
     * e.g. (format-to-string :a "FOO" :a "-" :s 'bar :a "-" :d 10)
     * -> "FOO-BAR-10"
     *
     * @unknown sdevoy
     */
    @LispMethod(comment = "Much like format.  Always produces a string.  Does not use \'format nil\'.\r\nTakes a list of alternating keyword, expression args.  Keywords indicate\r\nthe expected type of the expression to follow.  :A signifies string,\r\n:S signifies symbol, and :D signifies number.\r\ne.g. (format-to-string :a \"FOO\" :a \"-\" :s \'bar :a \"-\" :d 10)\r\n-> \"FOO-BAR-10\"\r\n\r\n@unknown sdevoy\nMuch like format.  Always produces a string.  Does not use \'format nil\'.\nTakes a list of alternating keyword, expression args.  Keywords indicate\nthe expected type of the expression to follow.  :A signifies string,\n:S signifies symbol, and :D signifies number.\ne.g. (format-to-string :a \"FOO\" :a \"-\" :s \'bar :a \"-\" :d 10)\n-> \"FOO-BAR-10\"")
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

    /**
     * Evaluate BODY, display the time taken in seconds, and return it.
     */
    @LispMethod(comment = "Evaluate BODY, display the time taken in seconds, and return it.")
    public static final SubLObject time_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            SubLObject time = $sym426$TIME;
            return list(CLET, list(time), listS(CTIME, time, append(body, NIL)), list(FORMAT, T, $str_alt429$_____real_time__A_seconds__, time), list(IDENTITY, time));
        }
    }

    /**
     * Evaluate BODY, display the time taken in seconds, and return it.
     */
    @LispMethod(comment = "Evaluate BODY, display the time taken in seconds, and return it.")
    public static SubLObject time(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject time = $sym451$TIME;
        return list(CLET, list(time), listS(CTIME, time, append(body, NIL)), list(FORMAT, T, $str454$_____real_time__A_seconds__, time), list(IDENTITY, time));
    }

    public static final SubLObject with_process_resource_tracking_in_seconds_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject var = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt430);
            var = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject timing_info = $sym431$TIMING_INFO;
                SubLObject clock_time = $sym432$CLOCK_TIME;
                return list(CLET, list(timing_info, clock_time), list(CTIME, clock_time, listS(WITH_PROCESS_RESOURCE_TRACKING, timing_info, append(body, NIL))), list(CSETQ, var, list(CONVERT_PROCESS_RESOURCE_TRACKING_TIMING_INFO_TO_SECONDS, list(NADD_CLOCK_TIME_TO_PROCESS_RESOURCE_TIMING_INFO, clock_time, timing_info))));
            }
        }
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

    /**
     * Destructively divides the times in TIMING-INFO to convert them into seconds.
     * Assumes they were originally in 100s of nanoseconds.
     */
    @LispMethod(comment = "Destructively divides the times in TIMING-INFO to convert them into seconds.\r\nAssumes they were originally in 100s of nanoseconds.\nDestructively divides the times in TIMING-INFO to convert them into seconds.\nAssumes they were originally in 100s of nanoseconds.")
    public static final SubLObject convert_process_resource_tracking_timing_info_to_seconds_alt(SubLObject timing_info) {
        {
            SubLObject converted_timing_info = NIL;
            SubLObject remainder = NIL;
            for (remainder = timing_info; NIL != remainder; remainder = cddr(remainder)) {
                {
                    SubLObject property = remainder.first();
                    SubLObject value = cadr(remainder);
                    SubLObject new_value = (NIL != list_utilities.member_eqP(property, $process_resource_tracking_100s_of_nanoseconds_properties$.getGlobalValue())) ? ((SubLObject) (divide(value, $int$10000000))) : value;
                    converted_timing_info = putf(converted_timing_info, property, new_value);
                }
            }
            return converted_timing_info;
        }
    }

    /**
     * Destructively divides the times in TIMING-INFO to convert them into seconds.
     * Assumes they were originally in 100s of nanoseconds.
     */
    @LispMethod(comment = "Destructively divides the times in TIMING-INFO to convert them into seconds.\r\nAssumes they were originally in 100s of nanoseconds.\nDestructively divides the times in TIMING-INFO to convert them into seconds.\nAssumes they were originally in 100s of nanoseconds.")
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

    /**
     *
     *
     * @unknown until with-process-resource-tracking supports wall clock time
     */
    @LispMethod(comment = "@unknown until with-process-resource-tracking supports wall clock time")
    public static final SubLObject nadd_clock_time_to_process_resource_timing_info_alt(SubLObject clock_time, SubLObject timing_info) {
        return putf(timing_info, $WALL_CLOCK_TIME, clock_time);
    }

    /**
     *
     *
     * @unknown until with-process-resource-tracking supports wall clock time
     */
    @LispMethod(comment = "@unknown until with-process-resource-tracking supports wall clock time")
    public static SubLObject nadd_clock_time_to_process_resource_timing_info(final SubLObject clock_time, final SubLObject timing_info) {
        return putf(timing_info, $WALL_CLOCK_TIME, clock_time);
    }

    /**
     * To be called on the results of @xref with-process-resource-tracking
     */
    @LispMethod(comment = "To be called on the results of @xref with-process-resource-tracking")
    public static final SubLObject process_resource_tracking_user_time_alt(SubLObject timing_info) {
        return getf(timing_info, $USER_TIME, UNPROVIDED);
    }

    /**
     * To be called on the results of @xref with-process-resource-tracking
     */
    @LispMethod(comment = "To be called on the results of @xref with-process-resource-tracking")
    public static SubLObject process_resource_tracking_user_time(final SubLObject timing_info) {
        return getf(timing_info, $USER_TIME, UNPROVIDED);
    }

    /**
     * To be called on the results of @xref with-process-resource-tracking
     */
    @LispMethod(comment = "To be called on the results of @xref with-process-resource-tracking")
    public static final SubLObject process_resource_tracking_system_time_alt(SubLObject timing_info) {
        return getf(timing_info, $SYSTEM_TIME, UNPROVIDED);
    }

    /**
     * To be called on the results of @xref with-process-resource-tracking
     */
    @LispMethod(comment = "To be called on the results of @xref with-process-resource-tracking")
    public static SubLObject process_resource_tracking_system_time(final SubLObject timing_info) {
        return getf(timing_info, $SYSTEM_TIME, UNPROVIDED);
    }

    public static final SubLObject process_resource_tracking_wall_clock_time_alt(SubLObject timing_info) {
        return getf(timing_info, $WALL_CLOCK_TIME, UNPROVIDED);
    }

    public static SubLObject process_resource_tracking_wall_clock_time(final SubLObject timing_info) {
        return getf(timing_info, $WALL_CLOCK_TIME, UNPROVIDED);
    }

    /**
     * Evaluate BODY, display the timing info in seconds, and return it.
     * A simple wrapper around @xref with-process-resource-tracking.
     * Analogous to @xref time.
     *
     * @return property-list-p
     */
    @LispMethod(comment = "Evaluate BODY, display the timing info in seconds, and return it.\r\nA simple wrapper around @xref with-process-resource-tracking.\r\nAnalogous to @xref time.\r\n\r\n@return property-list-p\nEvaluate BODY, display the timing info in seconds, and return it.\nA simple wrapper around @xref with-process-resource-tracking.\nAnalogous to @xref time.")
    public static final SubLObject timing_info_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            SubLObject timing_info = $sym442$TIMING_INFO;
            return list(CLET, list(timing_info), listS(WITH_PROCESS_RESOURCE_TRACKING_IN_SECONDS, timing_info, append(body, NIL)), list(FORMAT, T, $str_alt443$______s__, timing_info), list(IDENTITY, timing_info));
        }
    }

    /**
     * Evaluate BODY, display the timing info in seconds, and return it.
     * A simple wrapper around @xref with-process-resource-tracking.
     * Analogous to @xref time.
     *
     * @return property-list-p
     */
    @LispMethod(comment = "Evaluate BODY, display the timing info in seconds, and return it.\r\nA simple wrapper around @xref with-process-resource-tracking.\r\nAnalogous to @xref time.\r\n\r\n@return property-list-p\nEvaluate BODY, display the timing info in seconds, and return it.\nA simple wrapper around @xref with-process-resource-tracking.\nAnalogous to @xref time.")
    public static SubLObject timing_info(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject timing_info = $sym467$TIMING_INFO;
        return list(CLET, list(timing_info), listS(WITH_PROCESS_RESOURCE_TRACKING_IN_SECONDS, timing_info, append(body, NIL)), list(FORMAT, T, $str468$______s__, timing_info), list(IDENTITY, timing_info));
    }

    /**
     * Set VAR to the user time in 100s of nanoseconds spent executing BODY.
     * User time is defined as the CPU time spent running all threads
     * minus GC time.
     * Analogous to @xref ctime.
     */
    @LispMethod(comment = "Set VAR to the user time in 100s of nanoseconds spent executing BODY.\r\nUser time is defined as the CPU time spent running all threads\r\nminus GC time.\r\nAnalogous to @xref ctime.\nSet VAR to the user time in 100s of nanoseconds spent executing BODY.\nUser time is defined as the CPU time spent running all threads\nminus GC time.\nAnalogous to @xref ctime.")
    public static final SubLObject user_time_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject var = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt430);
            var = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject timing_info = $sym444$TIMING_INFO;
                return list(CLET, list(timing_info), listS(WITH_PROCESS_RESOURCE_TRACKING_IN_SECONDS, timing_info, append(body, NIL)), list(CSETQ, var, list(PROCESS_RESOURCE_TRACKING_USER_TIME, timing_info)));
            }
        }
    }

    /**
     * Set VAR to the user time in 100s of nanoseconds spent executing BODY.
     * User time is defined as the CPU time spent running all threads
     * minus GC time.
     * Analogous to @xref ctime.
     */
    @LispMethod(comment = "Set VAR to the user time in 100s of nanoseconds spent executing BODY.\r\nUser time is defined as the CPU time spent running all threads\r\nminus GC time.\r\nAnalogous to @xref ctime.\nSet VAR to the user time in 100s of nanoseconds spent executing BODY.\nUser time is defined as the CPU time spent running all threads\nminus GC time.\nAnalogous to @xref ctime.")
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

    /**
     * Set VAR to the user time in seconds spent executing BODY.
     * User time is defined as the CPU time spent running all threads
     * minus GC time.
     * Analogous to @xref ctime.
     */
    @LispMethod(comment = "Set VAR to the user time in seconds spent executing BODY.\r\nUser time is defined as the CPU time spent running all threads\r\nminus GC time.\r\nAnalogous to @xref ctime.\nSet VAR to the user time in seconds spent executing BODY.\nUser time is defined as the CPU time spent running all threads\nminus GC time.\nAnalogous to @xref ctime.")
    public static final SubLObject user_time_in_seconds_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject var = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt430);
            var = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject timing_info = $sym446$TIMING_INFO;
                return list(CLET, list(timing_info), listS(WITH_PROCESS_RESOURCE_TRACKING_IN_SECONDS, timing_info, append(body, NIL)), list(CSETQ, var, list(PROCESS_RESOURCE_TRACKING_USER_TIME, timing_info)));
            }
        }
    }

    /**
     * Set VAR to the user time in seconds spent executing BODY.
     * User time is defined as the CPU time spent running all threads
     * minus GC time.
     * Analogous to @xref ctime.
     */
    @LispMethod(comment = "Set VAR to the user time in seconds spent executing BODY.\r\nUser time is defined as the CPU time spent running all threads\r\nminus GC time.\r\nAnalogous to @xref ctime.\nSet VAR to the user time in seconds spent executing BODY.\nUser time is defined as the CPU time spent running all threads\nminus GC time.\nAnalogous to @xref ctime.")
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

    /**
     * Set VAR to the system time in 100s of nanoseconds spent executing BODY.
     * System time is defined as the CPU time spent executing in kernel mode
     * plus GC time.
     * Analogous to @xref ctime.
     */
    @LispMethod(comment = "Set VAR to the system time in 100s of nanoseconds spent executing BODY.\r\nSystem time is defined as the CPU time spent executing in kernel mode\r\nplus GC time.\r\nAnalogous to @xref ctime.\nSet VAR to the system time in 100s of nanoseconds spent executing BODY.\nSystem time is defined as the CPU time spent executing in kernel mode\nplus GC time.\nAnalogous to @xref ctime.")
    public static final SubLObject system_time_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject var = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt430);
            var = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject timing_info = $sym447$TIMING_INFO;
                return list(CLET, list(timing_info), listS(WITH_PROCESS_RESOURCE_TRACKING_IN_SECONDS, timing_info, append(body, NIL)), list(CSETQ, var, list(PROCESS_RESOURCE_TRACKING_SYSTEM_TIME, timing_info)));
            }
        }
    }

    /**
     * Set VAR to the system time in 100s of nanoseconds spent executing BODY.
     * System time is defined as the CPU time spent executing in kernel mode
     * plus GC time.
     * Analogous to @xref ctime.
     */
    @LispMethod(comment = "Set VAR to the system time in 100s of nanoseconds spent executing BODY.\r\nSystem time is defined as the CPU time spent executing in kernel mode\r\nplus GC time.\r\nAnalogous to @xref ctime.\nSet VAR to the system time in 100s of nanoseconds spent executing BODY.\nSystem time is defined as the CPU time spent executing in kernel mode\nplus GC time.\nAnalogous to @xref ctime.")
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

    /**
     * Set VAR to the system time in seconds spent executing BODY.
     * System time is defined as the CPU time spent executing in kernel mode
     * plus GC time.
     * Analogous to @xref ctime.
     */
    @LispMethod(comment = "Set VAR to the system time in seconds spent executing BODY.\r\nSystem time is defined as the CPU time spent executing in kernel mode\r\nplus GC time.\r\nAnalogous to @xref ctime.\nSet VAR to the system time in seconds spent executing BODY.\nSystem time is defined as the CPU time spent executing in kernel mode\nplus GC time.\nAnalogous to @xref ctime.")
    public static final SubLObject system_time_in_seconds_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject var = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt430);
            var = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject timing_info = $sym449$TIMING_INFO;
                return list(CLET, list(timing_info), listS(WITH_PROCESS_RESOURCE_TRACKING_IN_SECONDS, timing_info, append(body, NIL)), list(CSETQ, var, list(PROCESS_RESOURCE_TRACKING_SYSTEM_TIME, timing_info)));
            }
        }
    }

    /**
     * Set VAR to the system time in seconds spent executing BODY.
     * System time is defined as the CPU time spent executing in kernel mode
     * plus GC time.
     * Analogous to @xref ctime.
     */
    @LispMethod(comment = "Set VAR to the system time in seconds spent executing BODY.\r\nSystem time is defined as the CPU time spent executing in kernel mode\r\nplus GC time.\r\nAnalogous to @xref ctime.\nSet VAR to the system time in seconds spent executing BODY.\nSystem time is defined as the CPU time spent executing in kernel mode\nplus GC time.\nAnalogous to @xref ctime.")
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

    /**
     *
     *
     * @param OBJECT;
     * 		the object to be type-checked
     * @param PRED;
     * 		the type-checking predicate
     * 		Performs type checking for OBJECT using PRED if OBJECT is non-nil. Useful
     * 		for validating optional function arguments.
     */
    @LispMethod(comment = "@param OBJECT;\r\n\t\tthe object to be type-checked\r\n@param PRED;\r\n\t\tthe type-checking predicate\r\n\t\tPerforms type checking for OBJECT using PRED if OBJECT is non-nil. Useful\r\n\t\tfor validating optional function arguments.")
    public static final SubLObject check_type_if_present_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject v_object = NIL;
            SubLObject pred = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt450);
            v_object = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt450);
            pred = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(PWHEN, v_object, list(CHECK_TYPE, v_object, pred));
            } else {
                cdestructuring_bind_error(datum, $list_alt450);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param OBJECT;
     * 		the object to be type-checked
     * @param PRED;
     * 		the type-checking predicate
     * 		Performs type checking for OBJECT using PRED if OBJECT is non-nil. Useful
     * 		for validating optional function arguments.
     */
    @LispMethod(comment = "@param OBJECT;\r\n\t\tthe object to be type-checked\r\n@param PRED;\r\n\t\tthe type-checking predicate\r\n\t\tPerforms type checking for OBJECT using PRED if OBJECT is non-nil. Useful\r\n\t\tfor validating optional function arguments.")
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

    /**
     * Checks that LIST is a non-dotted-list-p, then calls check-type on each element of LIST.
     */
    @LispMethod(comment = "Checks that LIST is a non-dotted-list-p, then calls check-type on each element of LIST.")
    public static final SubLObject check_list_type_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject list = NIL;
            SubLObject pred = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt451);
            list = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt451);
            pred = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject elem = $sym452$ELEM;
                    SubLObject list_var = $sym453$LIST_VAR;
                    return list(CLET, list(list(list_var, list)), listS(CHECK_TYPE, list_var, $list_alt454), list(CDOLIST, list(elem, list_var), list(CHECK_TYPE, elem, pred)));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt451);
            }
        }
        return NIL;
    }

    /**
     * Checks that LIST is a non-dotted-list-p, then calls check-type on each element of LIST.
     */
    @LispMethod(comment = "Checks that LIST is a non-dotted-list-p, then calls check-type on each element of LIST.")
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

    /**
     * Checks that PLIST is a property-list-p, then calls check-type on each property in PLIST.
     */
    @LispMethod(comment = "Checks that PLIST is a property-list-p, then calls check-type on each property in PLIST.")
    public static final SubLObject check_plist_type_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject plist = NIL;
            SubLObject pred = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt455);
            plist = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt455);
            pred = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject property = $sym456$PROPERTY;
                    SubLObject value = $sym457$VALUE;
                    SubLObject plist_var = $sym458$PLIST_VAR;
                    return list(CLET, list(list(plist_var, plist)), listS(CHECK_TYPE, plist_var, $list_alt459), list(DO_PLIST, list(property, value, plist_var), list(IGNORE, value), list(CHECK_TYPE, property, pred)));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt455);
            }
        }
        return NIL;
    }

    /**
     * Checks that PLIST is a property-list-p, then calls check-type on each property in PLIST.
     */
    @LispMethod(comment = "Checks that PLIST is a property-list-p, then calls check-type on each property in PLIST.")
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

    /**
     * Checks that PLIST is a property-list-p, then signals a warning for any property in PLIST that does not pass PRED.
     */
    @LispMethod(comment = "Checks that PLIST is a property-list-p, then signals a warning for any property in PLIST that does not pass PRED.")
    public static final SubLObject warn_unless_plist_of_type_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject plist = NIL;
            SubLObject pred = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt455);
            plist = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt455);
            pred = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject property = $sym461$PROPERTY;
                    SubLObject value = $sym462$VALUE;
                    SubLObject plist_var = $sym463$PLIST_VAR;
                    return list(CLET, list(list(plist_var, plist)), listS(CHECK_TYPE, plist_var, $list_alt459), list(DO_PLIST, list(property, value, plist_var), list(IGNORE, value), list(WARN_UNLESS, list(pred, property), $str_alt465$_s_is_not_a_known__a, property, list(QUOTE, pred))));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt455);
            }
        }
        return NIL;
    }

    /**
     * Checks that PLIST is a property-list-p, then signals a warning for any property in PLIST that does not pass PRED.
     */
    @LispMethod(comment = "Checks that PLIST is a property-list-p, then signals a warning for any property in PLIST that does not pass PRED.")
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

    /**
     * If OBJECT is non-nil, then error if FORM is nil, and display FORMAT-STRING as the
     * error message.  Useful for validating optional function arguments by means other
     * than type-checking.
     */
    @LispMethod(comment = "If OBJECT is non-nil, then error if FORM is nil, and display FORMAT-STRING as the\r\nerror message.  Useful for validating optional function arguments by means other\r\nthan type-checking.\nIf OBJECT is non-nil, then error if FORM is nil, and display FORMAT-STRING as the\nerror message.  Useful for validating optional function arguments by means other\nthan type-checking.")
    public static final SubLObject must_if_present_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject v_object = NIL;
            SubLObject form = NIL;
            SubLObject format_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt466);
            v_object = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt466);
            form = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt466);
            format_string = current.first();
            current = current.rest();
            {
                SubLObject format_arguments = current;
                return list(PWHEN, v_object, listS(MUST, form, format_string, append(format_arguments, NIL)));
            }
        }
    }

    /**
     * If OBJECT is non-nil, then error if FORM is nil, and display FORMAT-STRING as the
     * error message.  Useful for validating optional function arguments by means other
     * than type-checking.
     */
    @LispMethod(comment = "If OBJECT is non-nil, then error if FORM is nil, and display FORMAT-STRING as the\r\nerror message.  Useful for validating optional function arguments by means other\r\nthan type-checking.\nIf OBJECT is non-nil, then error if FORM is nil, and display FORMAT-STRING as the\nerror message.  Useful for validating optional function arguments by means other\nthan type-checking.")
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

    /**
     * swap the values of ARG1 and ARG2
     */
    @LispMethod(comment = "swap the values of ARG1 and ARG2")
    public static final SubLObject swap_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject arg1 = NIL;
            SubLObject arg2 = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt468);
            arg1 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt468);
            arg2 = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject swap_var = $sym469$SWAP_VAR;
                    return list(PROGN, list(CLET, list(list(swap_var, arg1)), list(CSETQ, arg1, arg2), list(CSETQ, arg2, swap_var)));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt468);
            }
        }
        return NIL;
    }

    /**
     * swap the values of ARG1 and ARG2
     */
    @LispMethod(comment = "swap the values of ARG1 and ARG2")
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

    /**
     * Define VARIABLE as a global variable using DEFINER (defvar by default).
     * BODY specifies code to compute the desired initialization for
     * VARIABLE, which gets run after the KB is loaded.
     * ACCESS, if provided, must be one of PRIVATE PROTECTED or PUBLIC,
     * and specifies the access restriction for VARIABLE.
     */
    @LispMethod(comment = "Define VARIABLE as a global variable using DEFINER (defvar by default).\r\nBODY specifies code to compute the desired initialization for\r\nVARIABLE, which gets run after the KB is loaded.\r\nACCESS, if provided, must be one of PRIVATE PROTECTED or PUBLIC,\r\nand specifies the access restriction for VARIABLE.\nDefine VARIABLE as a global variable using DEFINER (defvar by default).\nBODY specifies code to compute the desired initialization for\nVARIABLE, which gets run after the KB is loaded.\nACCESS, if provided, must be one of PRIVATE PROTECTED or PUBLIC,\nand specifies the access restriction for VARIABLE.")
    public static final SubLObject def_kb_variable_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject variable = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt470);
            variable = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt470);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject allow_other_keys_p = NIL;
                    SubLObject rest = current;
                    SubLObject bad = NIL;
                    SubLObject current_18 = NIL;
                    for (; NIL != rest;) {
                        destructuring_bind_must_consp(rest, datum, $list_alt470);
                        current_18 = rest.first();
                        rest = rest.rest();
                        destructuring_bind_must_consp(rest, datum, $list_alt470);
                        if (NIL == member(current_18, $list_alt471, UNPROVIDED, UNPROVIDED)) {
                            bad = T;
                        }
                        if (current_18 == $ALLOW_OTHER_KEYS) {
                            allow_other_keys_p = rest.first();
                        }
                        rest = rest.rest();
                    }
                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                        cdestructuring_bind_error(datum, $list_alt470);
                    }
                    {
                        SubLObject documentation_tail = property_list_member($DOCUMENTATION, current);
                        SubLObject documentation = (NIL != documentation_tail) ? ((SubLObject) (cadr(documentation_tail))) : NIL;
                        SubLObject definer_tail = property_list_member($DEFINER, current);
                        SubLObject definer = (NIL != definer_tail) ? ((SubLObject) (cadr(definer_tail))) : NIL;
                        SubLObject access_tail = property_list_member($ACCESS, current);
                        SubLObject access = (NIL != access_tail) ? ((SubLObject) (cadr(access_tail))) : NIL;
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLTrampolineFile.checkType(variable, SYMBOLP);
                            if (NIL != documentation) {
                                SubLTrampolineFile.checkType(documentation, STRINGP);
                            }
                            {
                                SubLObject v_package = symbol_package(variable);
                                SubLObject initializer_name = format(NIL, $str_alt474$_A_INITIALIZER, variable);
                                SubLObject initializer = intern(initializer_name, v_package);
                                return bq_cons(PROGN, append(NIL != access ? ((SubLObject) (list(list(PROCLAIM, list(QUOTE, list(VACCESS, access, variable)))))) : NIL, list(NIL != definer ? ((SubLObject) (list(definer, variable, $UNINITIALIZED, documentation))) : list(DEFVAR, variable, $UNINITIALIZED, documentation), list(REGISTER_KB_VARIABLE_INITIALIZATION, list(QUOTE, variable), list(QUOTE, initializer)), listS(DEFINE_PRIVATE, initializer, NIL, append(body, NIL)))));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Define VARIABLE as a global variable using DEFINER (defvar by default).
     * BODY specifies code to compute the desired initialization for
     * VARIABLE, which gets run after the KB is loaded.
     * ACCESS, if provided, must be one of PRIVATE PROTECTED or PUBLIC,
     * and specifies the access restriction for VARIABLE.
     */
    @LispMethod(comment = "Define VARIABLE as a global variable using DEFINER (defvar by default).\r\nBODY specifies code to compute the desired initialization for\r\nVARIABLE, which gets run after the KB is loaded.\r\nACCESS, if provided, must be one of PRIVATE PROTECTED or PUBLIC,\r\nand specifies the access restriction for VARIABLE.\nDefine VARIABLE as a global variable using DEFINER (defvar by default).\nBODY specifies code to compute the desired initialization for\nVARIABLE, which gets run after the KB is loaded.\nACCESS, if provided, must be one of PRIVATE PROTECTED or PUBLIC,\nand specifies the access restriction for VARIABLE.")
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
        assert NIL != symbolp(variable) : "! symbolp(variable) " + ("Types.symbolp(variable) " + "CommonSymbols.NIL != Types.symbolp(variable) ") + variable;
        if (((NIL != documentation) && (!assertionsDisabledSynth)) && (NIL == stringp(documentation))) {
            throw new AssertionError(documentation);
        }
        final SubLObject v_package = symbol_package(variable);
        final SubLObject initializer_name = format(NIL, $str506$_A_INITIALIZER, variable);
        final SubLObject initializer = intern(initializer_name, v_package);
        return bq_cons(PROGN, append(NIL != access ? list(list(PROCLAIM, list(QUOTE, list(VACCESS, access, variable)))) : NIL, list(NIL != definer ? list(definer, variable, $UNINITIALIZED, documentation) : list(DEFVAR, variable, $UNINITIALIZED, documentation), list(REGISTER_KB_VARIABLE_INITIALIZATION, list(QUOTE, variable), list(QUOTE, initializer)), listS(DEFINE_PRIVATE, initializer, NIL, append(body, NIL)))));
    }

    /**
     * Associates FUNC as the initialization function for VAR-SYMBOL in @xref *kb-var-initializations*
     */
    @LispMethod(comment = "Associates FUNC as the initialization function for VAR-SYMBOL in @xref *kb-var-initializations*")
    public static final SubLObject register_kb_variable_initialization_alt(SubLObject var_symbol, SubLObject func) {
        $kb_var_initializations$.setGlobalValue(list_utilities.alist_enter($kb_var_initializations$.getGlobalValue(), var_symbol, func, UNPROVIDED));
        return NIL;
    }

    /**
     * Associates FUNC as the initialization function for VAR-SYMBOL in @xref *kb-var-initializations*
     */
    @LispMethod(comment = "Associates FUNC as the initialization function for VAR-SYMBOL in @xref *kb-var-initializations*")
    public static SubLObject register_kb_variable_initialization(final SubLObject var_symbol, final SubLObject func) {
        $kb_var_initializations$.setGlobalValue(list_utilities.alist_enter($kb_var_initializations$.getGlobalValue(), var_symbol, func, UNPROVIDED));
        return NIL;
    }

    /**
     * Initializes all of the kb-vars with their initialization functions. @xref *kb-var-initializations*
     */
    @LispMethod(comment = "Initializes all of the kb-vars with their initialization functions. @xref *kb-var-initializations*")
    public static final SubLObject initialize_kb_variables_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $noting_progress_start_time$.currentBinding(thread);
                try {
                    $noting_progress_start_time$.bind(get_universal_time(), thread);
                    noting_progress_preamble($str_alt480$Initializing_KB_variables___);
                    {
                        SubLObject cdolist_list_var = $kb_var_initializations$.getGlobalValue();
                        SubLObject cons = NIL;
                        for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                            {
                                SubLObject datum = cons;
                                SubLObject current = datum;
                                SubLObject var_symbol = NIL;
                                SubLObject func = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt481);
                                var_symbol = current.first();
                                current = current.rest();
                                func = current;
                                set(var_symbol, funcall(func));
                            }
                        }
                    }
                    noting_progress_postamble();
                } finally {
                    $noting_progress_start_time$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    /**
     * Initializes all of the kb-vars with their initialization functions. @xref *kb-var-initializations*
     */
    @LispMethod(comment = "Initializes all of the kb-vars with their initialization functions. @xref *kb-var-initializations*")
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

    /**
     * define GETTER as a function that will set a variable to the value in INITIALIZATION-FORM the first time GETTER
     * is called.
     *
     * @param GETTER
     * 		
     * @param INITIALIZATION-FORM
     * 		the form that will be evaluated the first time GETTER is called
     * @param VAR
     * 		symbolp; the name for the defparameter that is GETTER retrieves
     * @param VACCESS
     * 		symbolp; The access-level for VAR.  Valid values are private, protected, public.
     * @param FACCESS
     * 		symbolp; The access-level for GETTER.  Valid values are private, protected, public.
     * @param DOCUMENTATION
    stringp
     * 		
     */
    @LispMethod(comment = "define GETTER as a function that will set a variable to the value in INITIALIZATION-FORM the first time GETTER\r\nis called.\r\n\r\n@param GETTER\r\n\t\t\r\n@param INITIALIZATION-FORM\r\n\t\tthe form that will be evaluated the first time GETTER is called\r\n@param VAR\r\n\t\tsymbolp; the name for the defparameter that is GETTER retrieves\r\n@param VACCESS\r\n\t\tsymbolp; The access-level for VAR.  Valid values are private, protected, public.\r\n@param FACCESS\r\n\t\tsymbolp; The access-level for GETTER.  Valid values are private, protected, public.\r\n@param DOCUMENTATION\nstringp\ndefine GETTER as a function that will set a variable to the value in INITIALIZATION-FORM the first time GETTER\nis called.")
    public static final SubLObject defparameter_lazy_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject getter = NIL;
            SubLObject initialization_form = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt482);
            getter = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt482);
            initialization_form = current.first();
            current = current.rest();
            {
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_19 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt482);
                    current_19 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt482);
                    if (NIL == member(current_19, $list_alt483, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_19 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt482);
                }
                {
                    SubLObject var_tail = property_list_member($VAR, current);
                    SubLObject var = (NIL != var_tail) ? ((SubLObject) (cadr(var_tail))) : NIL;
                    SubLObject vaccess_tail = property_list_member($VACCESS, current);
                    SubLObject vaccess = (NIL != vaccess_tail) ? ((SubLObject) (cadr(vaccess_tail))) : PRIVATE;
                    SubLObject faccess_tail = property_list_member($FACCESS, current);
                    SubLObject faccess = (NIL != faccess_tail) ? ((SubLObject) (cadr(faccess_tail))) : PRIVATE;
                    SubLObject documentation_tail = property_list_member($DOCUMENTATION, current);
                    SubLObject documentation = (NIL != documentation_tail) ? ((SubLObject) (cadr(documentation_tail))) : NIL;
                    if ((NIL != string_utilities.starts_with(symbol_name(getter), $str_alt487$_)) || (NIL != string_utilities.ends_with(symbol_name(getter), $str_alt487$_, UNPROVIDED))) {
                        Errors.error($str_alt488$Invalid_function_name__A___The_fi, getter);
                    }
                    if (NIL == var) {
                        {
                            SubLObject var_name = cconcatenate($str_alt487$_, new SubLObject[]{ format_nil.format_nil_a_no_copy(getter), $str_alt487$_ });
                            var = intern(var_name, UNPROVIDED);
                        }
                    }
                    {
                        SubLObject init_value = $sym489$INIT_VALUE;
                        return list(PROGN, list(DECLAIM, list(VACCESS, vaccess, var)), list(DECLAIM, list(FACCESS, faccess, getter)), listS(DEFPARAMETER, var, $UNINITIALIZED, append(NIL != documentation ? ((SubLObject) (list(documentation))) : NIL, NIL)), list(DEFINE, getter, NIL, list(PWHEN, listS(EQ, var, $list_alt491), list(CLET, list(list(init_value, list(EVAL, initialization_form))), list(PWHEN, listS(EQ, init_value, $list_alt491), list(ERROR, $str_alt493$Unable_to_initialize__A__, var)), list(CSETQ, var, list(EVAL, init_value)))), list(RET, var)));
                    }
                }
            }
        }
    }

    /**
     * define GETTER as a function that will set a variable to the value in INITIALIZATION-FORM the first time GETTER
     * is called.
     *
     * @param GETTER
     * 		
     * @param INITIALIZATION-FORM
     * 		the form that will be evaluated the first time GETTER is called
     * @param VAR
     * 		symbolp; the name for the defparameter that is GETTER retrieves
     * @param VACCESS
     * 		symbolp; The access-level for VAR.  Valid values are private, protected, public.
     * @param FACCESS
     * 		symbolp; The access-level for GETTER.  Valid values are private, protected, public.
     * @param DOCUMENTATION
    		stringp
     * 		
     */
    @LispMethod(comment = "define GETTER as a function that will set a variable to the value in INITIALIZATION-FORM the first time GETTER\r\nis called.\r\n\r\n@param GETTER\r\n\t\t\r\n@param INITIALIZATION-FORM\r\n\t\tthe form that will be evaluated the first time GETTER is called\r\n@param VAR\r\n\t\tsymbolp; the name for the defparameter that is GETTER retrieves\r\n@param VACCESS\r\n\t\tsymbolp; The access-level for VAR.  Valid values are private, protected, public.\r\n@param FACCESS\r\n\t\tsymbolp; The access-level for GETTER.  Valid values are private, protected, public.\r\n@param DOCUMENTATION\n\t\tstringp\ndefine GETTER as a function that will set a variable to the value in INITIALIZATION-FORM the first time GETTER\nis called.")
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
            final SubLObject var_name = cconcatenate($str519$_, new SubLObject[]{ format_nil.format_nil_a_no_copy(getter), $str519$_ });
            var = intern(var_name, UNPROVIDED);
        }
        final SubLObject init_value = $sym521$INIT_VALUE;
        return list(PROGN, list(DECLAIM, list(VACCESS, vaccess, var)), list(DECLAIM, list(FACCESS, faccess, getter)), listS(DEFPARAMETER, var, $UNINITIALIZED, append(NIL != documentation ? list(documentation) : NIL, NIL)), list(DEFINE, getter, NIL, list(PWHEN, listS(EQ, var, $list523), list(CLET, list(list(init_value, initialization_form)), list(PWHEN, listS(EQ, init_value, $list523), list(ERROR, $str524$Unable_to_initialize__A__, var)), list(CSETQ, var, init_value))), list(RET, var)));
    }

    /**
     * define GETTER as a function that will set a variable to the value in INITIALIZATION-FORM the first time GETTER
     * is called.
     *
     * @param GETTER
     * 		
     * @param INITIALIZATION-FORM
     * 		the form that will be evaluated the first time GETTER is called
     * @param VAR
     * 		symbolp; the name for the defvar that is GETTER retrieves
     * @param VACCESS
     * 		symbolp; The access-level for VAR.  Valid values are private, protected, public.
     * @param FACCESS
     * 		symbolp; The access-level for GETTER.  Valid values are private, protected, public.
     * @param DOCUMENTATION
    stringp
     * 		
     */
    @LispMethod(comment = "define GETTER as a function that will set a variable to the value in INITIALIZATION-FORM the first time GETTER\r\nis called.\r\n\r\n@param GETTER\r\n\t\t\r\n@param INITIALIZATION-FORM\r\n\t\tthe form that will be evaluated the first time GETTER is called\r\n@param VAR\r\n\t\tsymbolp; the name for the defvar that is GETTER retrieves\r\n@param VACCESS\r\n\t\tsymbolp; The access-level for VAR.  Valid values are private, protected, public.\r\n@param FACCESS\r\n\t\tsymbolp; The access-level for GETTER.  Valid values are private, protected, public.\r\n@param DOCUMENTATION\nstringp\ndefine GETTER as a function that will set a variable to the value in INITIALIZATION-FORM the first time GETTER\nis called.")
    public static final SubLObject defvar_lazy_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject getter = NIL;
            SubLObject initialization_form = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt482);
            getter = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt482);
            initialization_form = current.first();
            current = current.rest();
            {
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_20 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt482);
                    current_20 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt482);
                    if (NIL == member(current_20, $list_alt483, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_20 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt482);
                }
                {
                    SubLObject var_tail = property_list_member($VAR, current);
                    SubLObject var = (NIL != var_tail) ? ((SubLObject) (cadr(var_tail))) : NIL;
                    SubLObject vaccess_tail = property_list_member($VACCESS, current);
                    SubLObject vaccess = (NIL != vaccess_tail) ? ((SubLObject) (cadr(vaccess_tail))) : PRIVATE;
                    SubLObject faccess_tail = property_list_member($FACCESS, current);
                    SubLObject faccess = (NIL != faccess_tail) ? ((SubLObject) (cadr(faccess_tail))) : PRIVATE;
                    SubLObject documentation_tail = property_list_member($DOCUMENTATION, current);
                    SubLObject documentation = (NIL != documentation_tail) ? ((SubLObject) (cadr(documentation_tail))) : NIL;
                    if ((NIL != string_utilities.starts_with(symbol_name(getter), $str_alt487$_)) || (NIL != string_utilities.ends_with(symbol_name(getter), $str_alt487$_, UNPROVIDED))) {
                        Errors.error($str_alt494$Invalid_function_name__A___The_fi, getter);
                    }
                    if (NIL == var) {
                        {
                            SubLObject var_name = cconcatenate($str_alt487$_, new SubLObject[]{ format_nil.format_nil_a_no_copy(getter), $str_alt487$_ });
                            var = intern(var_name, UNPROVIDED);
                        }
                    }
                    {
                        SubLObject init_value = $sym495$INIT_VALUE;
                        return list(PROGN, list(DECLAIM, list(VACCESS, vaccess, var)), list(DECLAIM, list(FACCESS, faccess, getter)), listS(DEFVAR, var, $UNINITIALIZED, append(NIL != documentation ? ((SubLObject) (list(documentation))) : NIL, NIL)), list(DEFINE, getter, NIL, list(PWHEN, listS(EQ, var, $list_alt491), list(CLET, list(list(init_value, list(EVAL, initialization_form))), list(PWHEN, listS(EQ, init_value, $list_alt491), list(ERROR, $str_alt493$Unable_to_initialize__A__, var)), list(CSETQ, var, list(EVAL, init_value)))), list(RET, var)));
                    }
                }
            }
        }
    }

    /**
     * define GETTER as a function that will set a variable to the value in INITIALIZATION-FORM the first time GETTER
     * is called.
     *
     * @param GETTER
     * 		
     * @param INITIALIZATION-FORM
     * 		the form that will be evaluated the first time GETTER is called
     * @param VAR
     * 		symbolp; the name for the defvar that is GETTER retrieves
     * @param VACCESS
     * 		symbolp; The access-level for VAR.  Valid values are private, protected, public.
     * @param FACCESS
     * 		symbolp; The access-level for GETTER.  Valid values are private, protected, public.
     * @param DOCUMENTATION
    		stringp
     * 		
     */
    @LispMethod(comment = "define GETTER as a function that will set a variable to the value in INITIALIZATION-FORM the first time GETTER\r\nis called.\r\n\r\n@param GETTER\r\n\t\t\r\n@param INITIALIZATION-FORM\r\n\t\tthe form that will be evaluated the first time GETTER is called\r\n@param VAR\r\n\t\tsymbolp; the name for the defvar that is GETTER retrieves\r\n@param VACCESS\r\n\t\tsymbolp; The access-level for VAR.  Valid values are private, protected, public.\r\n@param FACCESS\r\n\t\tsymbolp; The access-level for GETTER.  Valid values are private, protected, public.\r\n@param DOCUMENTATION\n\t\tstringp\ndefine GETTER as a function that will set a variable to the value in INITIALIZATION-FORM the first time GETTER\nis called.")
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
            final SubLObject var_name = cconcatenate($str519$_, new SubLObject[]{ format_nil.format_nil_a_no_copy(getter), $str519$_ });
            var = intern(var_name, UNPROVIDED);
        }
        final SubLObject init_value = $sym526$INIT_VALUE;
        return list(PROGN, list(DECLAIM, list(VACCESS, vaccess, var)), list(DECLAIM, list(FACCESS, faccess, getter)), listS(DEFVAR, var, $UNINITIALIZED, append(NIL != documentation ? list(documentation) : NIL, NIL)), list(DEFINE, getter, NIL, list(PWHEN, listS(EQ, var, $list523), list(CLET, list(list(init_value, initialization_form)), list(PWHEN, listS(EQ, init_value, $list523), list(ERROR, $str524$Unable_to_initialize__A__, var)), list(CSETQ, var, init_value))), list(RET, var)));
    }

    /**
     * define GETTER as a function that will set a variable to the value in INITIALIZATION-FORM the first time GETTER
     * is called.
     *
     * @param GETTER
     * 		
     * @param INITIALIZATION-FORM
     * 		the form that will be evaluated the first time GETTER is called
     * @param VAR
     * 		symbolp; the name for the defglobal that is GETTER retrieves
     * @param VACCESS
     * 		symbolp; The access-level for VAR.  Valid values are private, protected, public.
     * @param FACCESS
     * 		symbolp; The access-level for GETTER.  Valid values are private, protected, public.
     * @param DOCUMENTATION
    stringp
     * 		
     */
    @LispMethod(comment = "define GETTER as a function that will set a variable to the value in INITIALIZATION-FORM the first time GETTER\r\nis called.\r\n\r\n@param GETTER\r\n\t\t\r\n@param INITIALIZATION-FORM\r\n\t\tthe form that will be evaluated the first time GETTER is called\r\n@param VAR\r\n\t\tsymbolp; the name for the defglobal that is GETTER retrieves\r\n@param VACCESS\r\n\t\tsymbolp; The access-level for VAR.  Valid values are private, protected, public.\r\n@param FACCESS\r\n\t\tsymbolp; The access-level for GETTER.  Valid values are private, protected, public.\r\n@param DOCUMENTATION\nstringp\ndefine GETTER as a function that will set a variable to the value in INITIALIZATION-FORM the first time GETTER\nis called.")
    public static final SubLObject defglobal_lazy_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject getter = NIL;
            SubLObject initialization_form = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt482);
            getter = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt482);
            initialization_form = current.first();
            current = current.rest();
            {
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_21 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt482);
                    current_21 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt482);
                    if (NIL == member(current_21, $list_alt483, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_21 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt482);
                }
                {
                    SubLObject var_tail = property_list_member($VAR, current);
                    SubLObject var = (NIL != var_tail) ? ((SubLObject) (cadr(var_tail))) : NIL;
                    SubLObject vaccess_tail = property_list_member($VACCESS, current);
                    SubLObject vaccess = (NIL != vaccess_tail) ? ((SubLObject) (cadr(vaccess_tail))) : PRIVATE;
                    SubLObject faccess_tail = property_list_member($FACCESS, current);
                    SubLObject faccess = (NIL != faccess_tail) ? ((SubLObject) (cadr(faccess_tail))) : PRIVATE;
                    SubLObject documentation_tail = property_list_member($DOCUMENTATION, current);
                    SubLObject documentation = (NIL != documentation_tail) ? ((SubLObject) (cadr(documentation_tail))) : NIL;
                    if ((NIL != string_utilities.starts_with(symbol_name(getter), $str_alt487$_)) || (NIL != string_utilities.ends_with(symbol_name(getter), $str_alt487$_, UNPROVIDED))) {
                        Errors.error($str_alt496$Invalid_function_name__A___The_fi, getter);
                    }
                    if (NIL == var) {
                        {
                            SubLObject var_name = cconcatenate($str_alt487$_, new SubLObject[]{ format_nil.format_nil_a_no_copy(getter), $str_alt487$_ });
                            var = intern(var_name, UNPROVIDED);
                        }
                    }
                    {
                        SubLObject init_value = $sym497$INIT_VALUE;
                        return list(PROGN, list(DECLAIM, list(VACCESS, vaccess, var)), list(DECLAIM, list(FACCESS, faccess, getter)), listS(DEFGLOBAL, var, $UNINITIALIZED, append(NIL != documentation ? ((SubLObject) (list(documentation))) : NIL, NIL)), list(DEFINE, getter, NIL, list(PWHEN, listS(EQ, var, $list_alt491), list(CLET, list(list(init_value, list(EVAL, initialization_form))), list(PWHEN, listS(EQ, init_value, $list_alt491), list(ERROR, $str_alt493$Unable_to_initialize__A__, var)), list(CSETQ, var, list(EVAL, init_value)))), list(RET, var)));
                    }
                }
            }
        }
    }

    /**
     * define GETTER as a function that will set a variable to the value in INITIALIZATION-FORM the first time GETTER
     * is called.
     *
     * @param GETTER
     * 		
     * @param INITIALIZATION-FORM
     * 		the form that will be evaluated the first time GETTER is called
     * @param VAR
     * 		symbolp; the name for the defglobal that is GETTER retrieves
     * @param VACCESS
     * 		symbolp; The access-level for VAR.  Valid values are private, protected, public.
     * @param FACCESS
     * 		symbolp; The access-level for GETTER.  Valid values are private, protected, public.
     * @param DOCUMENTATION
    		stringp
     * 		
     */
    @LispMethod(comment = "define GETTER as a function that will set a variable to the value in INITIALIZATION-FORM the first time GETTER\r\nis called.\r\n\r\n@param GETTER\r\n\t\t\r\n@param INITIALIZATION-FORM\r\n\t\tthe form that will be evaluated the first time GETTER is called\r\n@param VAR\r\n\t\tsymbolp; the name for the defglobal that is GETTER retrieves\r\n@param VACCESS\r\n\t\tsymbolp; The access-level for VAR.  Valid values are private, protected, public.\r\n@param FACCESS\r\n\t\tsymbolp; The access-level for GETTER.  Valid values are private, protected, public.\r\n@param DOCUMENTATION\n\t\tstringp\ndefine GETTER as a function that will set a variable to the value in INITIALIZATION-FORM the first time GETTER\nis called.")
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
            final SubLObject var_name = cconcatenate($str519$_, new SubLObject[]{ format_nil.format_nil_a_no_copy(getter), $str519$_ });
            var = intern(var_name, UNPROVIDED);
        }
        final SubLObject init_value = $sym528$INIT_VALUE;
        return list(PROGN, list(DECLAIM, list(VACCESS, vaccess, var)), list(DECLAIM, list(FACCESS, faccess, getter)), listS(DEFGLOBAL, var, $UNINITIALIZED, append(NIL != documentation ? list(documentation) : NIL, NIL)), list(DEFINE, getter, NIL, list(PWHEN, listS(EQ, var, $list523), list(CLET, list(list(init_value, initialization_form)), list(PWHEN, listS(EQ, init_value, $list523), list(ERROR, $str524$Unable_to_initialize__A__, var)), list(CSETQ, var, init_value))), list(RET, var)));
    }

    /**
     * define GETTER as a function that will set a variable to the value in INITIALIZATION-FORM the first time GETTER
     * is called.
     *
     * @param GETTER
     * 		
     * @param INITIALIZATION-FORM
     * 		the form that will be evaluated the first time GETTER is called
     * @param VAR
     * 		symbolp; the name for the deflexical that is GETTER retrieves
     * @param VACCESS
     * 		symbolp; The access-level for VAR.  Valid values are private, protected, public.
     * @param FACCESS
     * 		symbolp; The access-level for GETTER.  Valid values are private, protected, public.
     * @param DOCUMENTATION
    stringp
     * 		
     */
    @LispMethod(comment = "define GETTER as a function that will set a variable to the value in INITIALIZATION-FORM the first time GETTER\r\nis called.\r\n\r\n@param GETTER\r\n\t\t\r\n@param INITIALIZATION-FORM\r\n\t\tthe form that will be evaluated the first time GETTER is called\r\n@param VAR\r\n\t\tsymbolp; the name for the deflexical that is GETTER retrieves\r\n@param VACCESS\r\n\t\tsymbolp; The access-level for VAR.  Valid values are private, protected, public.\r\n@param FACCESS\r\n\t\tsymbolp; The access-level for GETTER.  Valid values are private, protected, public.\r\n@param DOCUMENTATION\nstringp\ndefine GETTER as a function that will set a variable to the value in INITIALIZATION-FORM the first time GETTER\nis called.")
    public static final SubLObject deflexical_lazy_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject getter = NIL;
            SubLObject initialization_form = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt482);
            getter = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt482);
            initialization_form = current.first();
            current = current.rest();
            {
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_22 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt482);
                    current_22 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt482);
                    if (NIL == member(current_22, $list_alt483, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_22 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt482);
                }
                {
                    SubLObject var_tail = property_list_member($VAR, current);
                    SubLObject var = (NIL != var_tail) ? ((SubLObject) (cadr(var_tail))) : NIL;
                    SubLObject vaccess_tail = property_list_member($VACCESS, current);
                    SubLObject vaccess = (NIL != vaccess_tail) ? ((SubLObject) (cadr(vaccess_tail))) : PRIVATE;
                    SubLObject faccess_tail = property_list_member($FACCESS, current);
                    SubLObject faccess = (NIL != faccess_tail) ? ((SubLObject) (cadr(faccess_tail))) : PRIVATE;
                    SubLObject documentation_tail = property_list_member($DOCUMENTATION, current);
                    SubLObject documentation = (NIL != documentation_tail) ? ((SubLObject) (cadr(documentation_tail))) : NIL;
                    if ((NIL != string_utilities.starts_with(symbol_name(getter), $str_alt487$_)) || (NIL != string_utilities.ends_with(symbol_name(getter), $str_alt487$_, UNPROVIDED))) {
                        Errors.error($str_alt498$Invalid_function_name__A___The_fi, getter);
                    }
                    if (NIL == var) {
                        {
                            SubLObject var_name = cconcatenate($str_alt487$_, new SubLObject[]{ format_nil.format_nil_a_no_copy(getter), $str_alt487$_ });
                            var = intern(var_name, UNPROVIDED);
                        }
                    }
                    {
                        SubLObject init_value = $sym499$INIT_VALUE;
                        return list(PROGN, list(DECLAIM, list(VACCESS, vaccess, var)), list(DECLAIM, list(FACCESS, faccess, getter)), listS(DEFLEXICAL, var, $UNINITIALIZED, append(NIL != documentation ? ((SubLObject) (list(documentation))) : NIL, NIL)), list(DEFINE, getter, NIL, list(PWHEN, listS(EQ, var, $list_alt491), list(CLET, list(list(init_value, list(EVAL, initialization_form))), list(PWHEN, listS(EQ, init_value, $list_alt491), list(ERROR, $str_alt493$Unable_to_initialize__A__, var)), list(CSETQ, var, list(EVAL, init_value)))), list(RET, var)));
                    }
                }
            }
        }
    }

    @LispMethod(comment = "define GETTER as a function that will set a variable to the value in INITIALIZATION-FORM the first time GETTER\r\nis called.\r\n\r\n@param GETTER\r\n\t\t\r\n@param INITIALIZATION-FORM\r\n\t\tthe form that will be evaluated the first time GETTER is called\r\n@param VAR\r\n\t\tsymbolp; the name for the deflexical that is GETTER retrieves\r\n@param VACCESS\r\n\t\tsymbolp; The access-level for VAR.  Valid values are private, protected, public.\r\n@param FACCESS\r\n\t\tsymbolp; The access-level for GETTER.  Valid values are private, protected, public.\r\n@param DOCUMENTATION\n\t\tstringp\ndefine GETTER as a function that will set a variable to the value in INITIALIZATION-FORM the first time GETTER\nis called.")
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
            final SubLObject var_name = cconcatenate($str519$_, new SubLObject[]{ format_nil.format_nil_a_no_copy(getter), $str519$_ });
            var = intern(var_name, UNPROVIDED);
        }
        final SubLObject init_value = $sym530$INIT_VALUE;
        return list(PROGN, list(DECLAIM, list(VACCESS, vaccess, var)), list(DECLAIM, list(FACCESS, faccess, getter)), listS(DEFLEXICAL, var, $UNINITIALIZED, append(NIL != documentation ? list(documentation) : NIL, NIL)), list(DEFINE, getter, NIL, list(PWHEN, listS(EQ, var, $list523), list(CLET, list(list(init_value, initialization_form)), list(PWHEN, listS(EQ, init_value, $list523), list(ERROR, $str524$Unable_to_initialize__A__, var)), list(CSETQ, var, init_value))), list(RET, var)));
    }

    /**
     * define NAME as an obsolete (public) Cyc API function.
     *
     * @see define-api
    The DOCUMENTATION-STRING is required, and is used in generating the Cyc API documentation.
    DECLARATIONS is a form having :replacements, :argument-types and :return-types as keywords:
    ((:replacements api-function)
    (:argument-types
    (arg-name-1 type-predicate)
    ...
    (arg-name-n type-predicate))
    (:return-types type-predicate))

    :replacements can declare the api function which is the replacement of the deprecated api NAME
    :return-types can declare multiple values as well as compositions:
    (:return-types (list assertion-p) fixnump)
    which declares the function returns two values, the first value is a list
    of assertions, and the second value satisfies the fixnump predicate.
     */
    @LispMethod(comment = "define NAME as an obsolete (public) Cyc API function.\r\n\r\n@see define-api\r\nThe DOCUMENTATION-STRING is required, and is used in generating the Cyc API documentation.\r\nDECLARATIONS is a form having :replacements, :argument-types and :return-types as keywords:\r\n((:replacements api-function)\r\n(:argument-types\r\n(arg-name-1 type-predicate)\r\n...\r\n(arg-name-n type-predicate))\r\n(:return-types type-predicate))\r\n\r\n:replacements can declare the api function which is the replacement of the deprecated api NAME\r\n:return-types can declare multiple values as well as compositions:\r\n(:return-types (list assertion-p) fixnump)\r\nwhich declares the function returns two values, the first value is a list\r\nof assertions, and the second value satisfies the fixnump predicate.")
    public static final SubLObject define_api_obsolete_alt(SubLObject macroform, SubLObject environment) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = macroform.rest();
                SubLObject current = datum;
                SubLObject name = NIL;
                SubLObject arglist = NIL;
                SubLObject documentation_string = NIL;
                SubLObject declarations = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt500);
                name = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt500);
                arglist = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt500);
                documentation_string = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt500);
                declarations = current.first();
                current = current.rest();
                {
                    SubLObject body = current;
                    SubLTrampolineFile.checkType(documentation_string, STRINGP);
                    SubLTrampolineFile.checkType(declarations, LISTP);
                    thread.resetMultipleValues();
                    {
                        SubLObject argument_types = parse_obsolete_api_declarations(declarations);
                        SubLObject body_preamble = thread.secondMultipleValue();
                        SubLObject return_types = thread.thirdMultipleValue();
                        SubLObject replacements = thread.fourthMultipleValue();
                        thread.resetMultipleValues();
                        return list(PROGN, listS(DEFINE_PUBLIC, name, arglist, documentation_string, append(body_preamble, body, NIL)), list(REGISTER_OBSOLETE_CYC_API_FUNCTION, list(QUOTE, name), list(QUOTE, replacements), list(QUOTE, arglist), documentation_string, list(QUOTE, argument_types), list(QUOTE, return_types)));
                    }
                }
            }
        }
    }

    @LispMethod(comment = "define NAME as an obsolete (public) Cyc API function.\r\n\r\n@see define-api\r\nThe DOCUMENTATION-STRING is required, and is used in generating the Cyc API documentation.\r\nDECLARATIONS is a form having :replacements, :argument-types and :return-types as keywords:\r\n((:replacements api-function)\r\n(:argument-types\r\n(arg-name-1 type-predicate)\r\n...\r\n(arg-name-n type-predicate))\r\n(:return-types type-predicate))\r\n\r\n:replacements can declare the api function which is the replacement of the deprecated api NAME\r\n:return-types can declare multiple values as well as compositions:\r\n(:return-types (list assertion-p) fixnump)\r\nwhich declares the function returns two values, the first value is a list\r\nof assertions, and the second value satisfies the fixnump predicate.")
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
        assert NIL != stringp(documentation_string) : "! stringp(documentation_string) " + ("Types.stringp(documentation_string) " + "CommonSymbols.NIL != Types.stringp(documentation_string) ") + documentation_string;
        assert NIL != listp(declarations) : "! listp(declarations) " + ("Types.listp(declarations) " + "CommonSymbols.NIL != Types.listp(declarations) ") + declarations;
        thread.resetMultipleValues();
        final SubLObject argument_types = parse_obsolete_api_declarations(declarations);
        final SubLObject body_preamble = thread.secondMultipleValue();
        final SubLObject return_types = thread.thirdMultipleValue();
        final SubLObject replacements = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        return list(PROGN, listS(DEFINE_PUBLIC, name, arglist, documentation_string, append(body_preamble, body, NIL)), list(REGISTER_OBSOLETE_CYC_API_FUNCTION, list(QUOTE, name), list(QUOTE, replacements), list(QUOTE, arglist), documentation_string, list(QUOTE, argument_types), list(QUOTE, return_types)));
    }

    /**
     * Register NAME as a deprecated (public) Cyc API function.
     * Note its REPLACEMENTS, ARGLIST, DOC-STRING, ARGUMENT-TYPEs and RETURN-TYPES.
     */
    @LispMethod(comment = "Register NAME as a deprecated (public) Cyc API function.\r\nNote its REPLACEMENTS, ARGLIST, DOC-STRING, ARGUMENT-TYPEs and RETURN-TYPES.\nRegister NAME as a deprecated (public) Cyc API function.\nNote its REPLACEMENTS, ARGLIST, DOC-STRING, ARGUMENT-TYPEs and RETURN-TYPES.")
    public static final SubLObject register_obsolete_cyc_api_function_alt(SubLObject name, SubLObject replacements, SubLObject arglist, SubLObject doc_string, SubLObject argument_types, SubLObject return_types) {
        register_cyc_api_function(name, arglist, doc_string, argument_types, return_types);
        register_obsolete_cyc_api_replacements(name, replacements);
        return NIL;
    }

    @LispMethod(comment = "Register NAME as a deprecated (public) Cyc API function.\r\nNote its REPLACEMENTS, ARGLIST, DOC-STRING, ARGUMENT-TYPEs and RETURN-TYPES.\nRegister NAME as a deprecated (public) Cyc API function.\nNote its REPLACEMENTS, ARGLIST, DOC-STRING, ARGUMENT-TYPEs and RETURN-TYPES.")
    public static SubLObject register_obsolete_cyc_api_function(final SubLObject name, final SubLObject replacements, final SubLObject arglist, final SubLObject doc_string, final SubLObject argument_types, final SubLObject return_types) {
        register_cyc_api_function(name, arglist, doc_string, argument_types, return_types);
        register_obsolete_cyc_api_replacements(name, replacements);
        return NIL;
    }

    /**
     * Return the list of replacements defined for the obsolete cyc api NAME.
     */
    @LispMethod(comment = "Return the list of replacements defined for the obsolete cyc api NAME.")
    public static final SubLObject obsolete_cyc_api_replacements_alt(SubLObject name) {
        return get(name, $OBSOLETE_CYC_API_REPLACEMENTS, UNPROVIDED);
    }

    @LispMethod(comment = "Return the list of replacements defined for the obsolete cyc api NAME.")
    public static SubLObject obsolete_cyc_api_replacements(final SubLObject name) {
        return get(name, $OBSOLETE_CYC_API_REPLACEMENTS, UNPROVIDED);
    }

    /**
     * For the symbol NAME, denoting an deprecated Cyc API register the Cyc API replacements.  Return the NAME.
     */
    @LispMethod(comment = "For the symbol NAME, denoting an deprecated Cyc API register the Cyc API replacements.  Return the NAME.")
    public static final SubLObject register_obsolete_cyc_api_replacements_alt(SubLObject name, SubLObject replacements) {
        SubLTrampolineFile.checkType(name, SYMBOLP);
        SubLTrampolineFile.checkType(replacements, LISTP);
        put(name, $OBSOLETE_CYC_API_REPLACEMENTS, replacements);
        return name;
    }

    @LispMethod(comment = "For the symbol NAME, denoting an deprecated Cyc API register the Cyc API replacements.  Return the NAME.")
    public static SubLObject register_obsolete_cyc_api_replacements(final SubLObject name, final SubLObject replacements) {
        assert NIL != symbolp(name) : "! symbolp(name) " + ("Types.symbolp(name) " + "CommonSymbols.NIL != Types.symbolp(name) ") + name;
        assert NIL != listp(replacements) : "! listp(replacements) " + ("Types.listp(replacements) " + "CommonSymbols.NIL != Types.listp(replacements) ") + replacements;
        put(name, $OBSOLETE_CYC_API_REPLACEMENTS, replacements);
        return name;
    }

    /**
     * De-register the symbol NAME's Cyc API replacements.  Return T iff the replacements were previously registered.
     */
    @LispMethod(comment = "De-register the symbol NAME\'s Cyc API replacements.  Return T iff the replacements were previously registered.")
    public static final SubLObject deregister_obsolete_cyc_api_replacements_alt(SubLObject name) {
        SubLTrampolineFile.checkType(name, SYMBOLP);
        return remprop(name, $OBSOLETE_CYC_API_REPLACEMENTS);
    }

    @LispMethod(comment = "De-register the symbol NAME\'s Cyc API replacements.  Return T iff the replacements were previously registered.")
    public static SubLObject deregister_obsolete_cyc_api_replacements(final SubLObject name) {
        assert NIL != symbolp(name) : "! symbolp(name) " + ("Types.symbolp(name) " + "CommonSymbols.NIL != Types.symbolp(name) ") + name;
        return remprop(name, $OBSOLETE_CYC_API_REPLACEMENTS);
    }

    /**
     * Generate an empty list.
     */
    @LispMethod(comment = "Generate an empty list.")
    public static final SubLObject initialization_for_partial_list_results_alt() {
        return NIL;
    }

    @LispMethod(comment = "Generate an empty list.")
    public static SubLObject initialization_for_partial_list_results() {
        return NIL;
    }/**
     * Generate an empty list.
     */


    public static final SubLObject accumulation_for_partial_list_results_alt(SubLObject result) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $partial_results_accumulator$.setDynamicValue(cons(result, $partial_results_accumulator$.getDynamicValue(thread)), thread);
            return result;
        }
    }

    public static SubLObject accumulation_for_partial_list_results(final SubLObject result) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $partial_results_accumulator$.setDynamicValue(cons(result, $partial_results_accumulator$.getDynamicValue(thread)), thread);
        return result;
    }

    public static final SubLObject consolidation_for_partial_list_results_alt(SubLObject accumulated_results) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = nreverse(accumulated_results);
                SubLObject result = NIL;
                for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                    $partial_results_total_accumulator$.setDynamicValue(cons(result, $partial_results_total_accumulator$.getDynamicValue(thread)), thread);
                }
            }
            return NIL;
        }
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

    public static final SubLObject notification_for_partial_list_results_alt(SubLObject accumulated_results, SubLObject size, SubLObject total_size) {
        return accumulated_results;
    }

    public static SubLObject notification_for_partial_list_results(final SubLObject accumulated_results, final SubLObject size, final SubLObject total_size) {
        return accumulated_results;
    }

    public static final SubLObject final_results_for_partial_list_results_alt(SubLObject total_results) {
        return nreverse(total_results);
    }

    public static SubLObject final_results_for_partial_list_results(final SubLObject total_results) {
        return nreverse(total_results);
    }

    public static final SubLObject add_result_to_partial_results_accumulator_alt(SubLObject result) {
        {
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

    public static final SubLObject with_partial_results_accumulation_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt509);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject final_result_var = NIL;
                    SubLObject threshold = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt509);
                    final_result_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt509);
                    threshold = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(CLET, listS($list_alt510, $list_alt511, list($partial_results_threshold$, threshold), $list_alt513), list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), $list_alt514, listS(CSETQ, final_result_var, $list_alt515)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt509);
                    }
                }
            }
        }
        return NIL;
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

    public static final SubLObject with_space_profiling_to_string_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt517);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject string_var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt517);
                    string_var = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject stream = $sym518$STREAM;
                            return list(CWITH_OUTPUT_TO_STRING, list(stream, string_var), listS(WITH_SPACE_PROFILING, list($STREAM, stream), append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt517);
                    }
                }
            }
        }
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

    /**
     * Begin computing a composite SXHASH and execute BODY.
     * INITIAL-VALUE states the starting value for the composite value.
     * The method SXHASH-COMPOSITE-UPDATE is used within BODY to merge
     * sub-hash values into the composite value.
     * After execution, the variable RESULT-VAR is set to the composite SXHASH that was computed.
     */
    @LispMethod(comment = "Begin computing a composite SXHASH and execute BODY.\r\nINITIAL-VALUE states the starting value for the composite value.\r\nThe method SXHASH-COMPOSITE-UPDATE is used within BODY to merge\r\nsub-hash values into the composite value.\r\nAfter execution, the variable RESULT-VAR is set to the composite SXHASH that was computed.\nBegin computing a composite SXHASH and execute BODY.\nINITIAL-VALUE states the starting value for the composite value.\nThe method SXHASH-COMPOSITE-UPDATE is used within BODY to merge\nsub-hash values into the composite value.\nAfter execution, the variable RESULT-VAR is set to the composite SXHASH that was computed.")
    public static final SubLObject with_sxhash_composite_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt522);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject result_var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt522);
                    result_var = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_23 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt522);
                            current_23 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt522);
                            if (NIL == member(current_23, $list_alt523, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_23 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt522);
                        }
                        {
                            SubLObject initial_value_tail = property_list_member($INITIAL_VALUE, current);
                            SubLObject initial_value = (NIL != initial_value_tail) ? ((SubLObject) (cadr(initial_value_tail))) : ZERO_INTEGER;
                            current = temp;
                            {
                                SubLObject body = current;
                                return list(CLET, list($list_alt525, list($sxhash_composite_hash$, initial_value)), bq_cons(PROGN, append(body, NIL)), listS(CSETQ, result_var, $list_alt527));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Begin computing a composite SXHASH and execute BODY.
     * INITIAL-VALUE states the starting value for the composite value.
     * The method SXHASH-COMPOSITE-UPDATE is used within BODY to merge
     * sub-hash values into the composite value.
     * After execution, the variable RESULT-VAR is set to the composite SXHASH that was computed.
     */
    @LispMethod(comment = "Begin computing a composite SXHASH and execute BODY.\r\nINITIAL-VALUE states the starting value for the composite value.\r\nThe method SXHASH-COMPOSITE-UPDATE is used within BODY to merge\r\nsub-hash values into the composite value.\r\nAfter execution, the variable RESULT-VAR is set to the composite SXHASH that was computed.\nBegin computing a composite SXHASH and execute BODY.\nINITIAL-VALUE states the starting value for the composite value.\nThe method SXHASH-COMPOSITE-UPDATE is used within BODY to merge\nsub-hash values into the composite value.\nAfter execution, the variable RESULT-VAR is set to the composite SXHASH that was computed.")
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

    /**
     * Begin computing a composite SXHASH and execute BODY.
     * INITIAL-VALUE states the starting value for the composite value.
     * The method SXHASH-COMPOSITE-UPDATE is used within BODY to merge
     * sub-hash values into the composite value.
     * After execution, the variable RESULT-VAR is set to the composite SXHASH that was computed.
     * Differs from non-fast version because it only uses local variables rather than dynamic variables.
     * Example:
     * (clet ((sxhash 0)) (with-sxhash-composite-fast (sxhash :initial-value 167) (sxhash-composite-update-fast 4) (sxhash-composite-update-fast 3)) sxhash)
     */
    @LispMethod(comment = "Begin computing a composite SXHASH and execute BODY.\r\nINITIAL-VALUE states the starting value for the composite value.\r\nThe method SXHASH-COMPOSITE-UPDATE is used within BODY to merge\r\nsub-hash values into the composite value.\r\nAfter execution, the variable RESULT-VAR is set to the composite SXHASH that was computed.\r\nDiffers from non-fast version because it only uses local variables rather than dynamic variables.\r\nExample:\r\n(clet ((sxhash 0)) (with-sxhash-composite-fast (sxhash :initial-value 167) (sxhash-composite-update-fast 4) (sxhash-composite-update-fast 3)) sxhash)\nBegin computing a composite SXHASH and execute BODY.\nINITIAL-VALUE states the starting value for the composite value.\nThe method SXHASH-COMPOSITE-UPDATE is used within BODY to merge\nsub-hash values into the composite value.\nAfter execution, the variable RESULT-VAR is set to the composite SXHASH that was computed.\nDiffers from non-fast version because it only uses local variables rather than dynamic variables.\nExample:\n(clet ((sxhash 0)) (with-sxhash-composite-fast (sxhash :initial-value 167) (sxhash-composite-update-fast 4) (sxhash-composite-update-fast 3)) sxhash)")
    public static final SubLObject with_sxhash_composite_fast_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt522);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject result_var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt522);
                    result_var = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_24 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt522);
                            current_24 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt522);
                            if (NIL == member(current_24, $list_alt523, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_24 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt522);
                        }
                        {
                            SubLObject initial_value_tail = property_list_member($INITIAL_VALUE, current);
                            SubLObject initial_value = (NIL != initial_value_tail) ? ((SubLObject) (cadr(initial_value_tail))) : ZERO_INTEGER;
                            current = temp;
                            {
                                SubLObject body = current;
                                return list(CLET, list($list_alt528, list(COMPOSITE_HASH, initial_value)), bq_cons(PROGN, append(body, NIL)), listS(CSETQ, result_var, $list_alt530));
                            }
                        }
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Begin computing a composite SXHASH and execute BODY.\r\nINITIAL-VALUE states the starting value for the composite value.\r\nThe method SXHASH-COMPOSITE-UPDATE is used within BODY to merge\r\nsub-hash values into the composite value.\r\nAfter execution, the variable RESULT-VAR is set to the composite SXHASH that was computed.\r\nDiffers from non-fast version because it only uses local variables rather than dynamic variables.\r\nExample:\r\n(clet ((sxhash 0)) (with-sxhash-composite-fast (sxhash :initial-value 167) (sxhash-composite-update-fast 4) (sxhash-composite-update-fast 3)) sxhash)\nBegin computing a composite SXHASH and execute BODY.\nINITIAL-VALUE states the starting value for the composite value.\nThe method SXHASH-COMPOSITE-UPDATE is used within BODY to merge\nsub-hash values into the composite value.\nAfter execution, the variable RESULT-VAR is set to the composite SXHASH that was computed.\nDiffers from non-fast version because it only uses local variables rather than dynamic variables.\nExample:\n(clet ((sxhash 0)) (with-sxhash-composite-fast (sxhash :initial-value 167) (sxhash-composite-update-fast 4) (sxhash-composite-update-fast 3)) sxhash)")
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
    }/**
     * Begin computing a composite SXHASH and execute BODY.
     * INITIAL-VALUE states the starting value for the composite value.
     * The method SXHASH-COMPOSITE-UPDATE is used within BODY to merge
     * sub-hash values into the composite value.
     * After execution, the variable RESULT-VAR is set to the composite SXHASH that was computed.
     * Differs from non-fast version because it only uses local variables rather than dynamic variables.
     * Example:
     * (clet ((sxhash 0)) (with-sxhash-composite-fast (sxhash :initial-value 167) (sxhash-composite-update-fast 4) (sxhash-composite-update-fast 3)) sxhash)
     */


    /**
     * Merge VALUE into the variable HASH which stores a composite hash code.
     * Differs from non-fast version because it only uses local variables rather than dynamic variables.
     * It must oly be used inside the with-sxhash-composite-fast macro.
     * Example:
     * (clet ((sxhash 0)) (with-sxhash-composite-fast (sxhash :initial-value 167) (sxhash-composite-update-fast 4) (sxhash-composite-update-fast 3)) sxhash)
     */
    @LispMethod(comment = "Merge VALUE into the variable HASH which stores a composite hash code.\r\nDiffers from non-fast version because it only uses local variables rather than dynamic variables.\r\nIt must oly be used inside the with-sxhash-composite-fast macro.\r\nExample:\r\n(clet ((sxhash 0)) (with-sxhash-composite-fast (sxhash :initial-value 167) (sxhash-composite-update-fast 4) (sxhash-composite-update-fast 3)) sxhash)\nMerge VALUE into the variable HASH which stores a composite hash code.\nDiffers from non-fast version because it only uses local variables rather than dynamic variables.\nIt must oly be used inside the with-sxhash-composite-fast macro.\nExample:\n(clet ((sxhash 0)) (with-sxhash-composite-fast (sxhash :initial-value 167) (sxhash-composite-update-fast 4) (sxhash-composite-update-fast 3)) sxhash)")
    public static final SubLObject sxhash_composite_update_fast_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt531);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(PROGN, $list_alt532, list(CSETQ, COMPOSITE_HASH, listS(LOGXOR, listS(SXHASH_ROT, list(SXHASH, value), $list_alt536), $list_alt530)));
            } else {
                cdestructuring_bind_error(datum, $list_alt531);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Merge VALUE into the variable HASH which stores a composite hash code.\r\nDiffers from non-fast version because it only uses local variables rather than dynamic variables.\r\nIt must oly be used inside the with-sxhash-composite-fast macro.\r\nExample:\r\n(clet ((sxhash 0)) (with-sxhash-composite-fast (sxhash :initial-value 167) (sxhash-composite-update-fast 4) (sxhash-composite-update-fast 3)) sxhash)\nMerge VALUE into the variable HASH which stores a composite hash code.\nDiffers from non-fast version because it only uses local variables rather than dynamic variables.\nIt must oly be used inside the with-sxhash-composite-fast macro.\nExample:\n(clet ((sxhash 0)) (with-sxhash-composite-fast (sxhash :initial-value 167) (sxhash-composite-update-fast 4) (sxhash-composite-update-fast 3)) sxhash)")
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
    }/**
     * Merge VALUE into the variable HASH which stores a composite hash code.
     * Differs from non-fast version because it only uses local variables rather than dynamic variables.
     * It must oly be used inside the with-sxhash-composite-fast macro.
     * Example:
     * (clet ((sxhash 0)) (with-sxhash-composite-fast (sxhash :initial-value 167) (sxhash-composite-update-fast 4) (sxhash-composite-update-fast 3)) sxhash)
     */


    /**
     * Update the composite hash STATE
     */
    @LispMethod(comment = "Update the composite hash STATE")
    public static final SubLObject sxhash_update_state_alt(SubLObject state) {
        return aref($sxhash_update_state_vector$.getGlobalValue(), state);
    }

    @LispMethod(comment = "Update the composite hash STATE")
    public static SubLObject sxhash_update_state(final SubLObject state) {
        return aref($sxhash_update_state_vector$.getGlobalValue(), state);
    }/**
     * Update the composite hash STATE
     */


    /**
     * Merge VALUE into the variable HASH which stores a composite hash code.
     */
    @LispMethod(comment = "Merge VALUE into the variable HASH which stores a composite hash code.")
    public static final SubLObject sxhash_composite_update_alt(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $sxhash_composite_state$.setDynamicValue(sxhash_update_state($sxhash_composite_state$.getDynamicValue(thread)), thread);
            $sxhash_composite_hash$.setDynamicValue(logxor(Sxhash.sxhash_rot(value, $sxhash_composite_state$.getDynamicValue(thread)), $sxhash_composite_hash$.getDynamicValue(thread)), thread);
            return NIL;
        }
    }

    @LispMethod(comment = "Merge VALUE into the variable HASH which stores a composite hash code.")
    public static SubLObject sxhash_composite_update(final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $sxhash_composite_state$.setDynamicValue(sxhash_update_state($sxhash_composite_state$.getDynamicValue(thread)), thread);
        $sxhash_composite_hash$.setDynamicValue(logxor(Sxhash.sxhash_rot(value, $sxhash_composite_state$.getDynamicValue(thread)), $sxhash_composite_hash$.getDynamicValue(thread)), thread);
        return NIL;
    }/**
     * Merge VALUE into the variable HASH which stores a composite hash code.
     */


    public static final SubLObject slow_hash_test_alt(SubLObject iterations) {
        if (iterations == UNPROVIDED) {
            iterations = $int$1000000;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(iterations); i = add(i, ONE_INTEGER)) {
                    {
                        SubLObject sxhash = ZERO_INTEGER;
                        {
                            SubLObject _prev_bind_0 = $sxhash_composite_state$.currentBinding(thread);
                            SubLObject _prev_bind_1 = $sxhash_composite_hash$.currentBinding(thread);
                            try {
                                $sxhash_composite_state$.bind(FOUR_INTEGER, thread);
                                $sxhash_composite_hash$.bind($int$167, thread);
                                sxhash_composite_update(FOUR_INTEGER);
                                sxhash_composite_update(THREE_INTEGER);
                                sxhash = $sxhash_composite_hash$.getDynamicValue(thread);
                            } finally {
                                $sxhash_composite_hash$.rebind(_prev_bind_1, thread);
                                $sxhash_composite_state$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
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

    public static final SubLObject fast_hash_test_alt(SubLObject iterations) {
        if (iterations == UNPROVIDED) {
            iterations = $int$1000000;
        }
        {
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(iterations); i = add(i, ONE_INTEGER)) {
                {
                    SubLObject sxhash = ZERO_INTEGER;
                    SubLObject composite_state = FOUR_INTEGER;
                    SubLObject composite_hash = $int$167;
                    composite_state = sxhash_update_state(composite_state);
                    composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(FOUR_INTEGER), composite_state), composite_hash);
                    composite_state = sxhash_update_state(composite_state);
                    composite_hash = logxor(Sxhash.sxhash_rot(Sxhash.sxhash(THREE_INTEGER), composite_state), composite_hash);
                    sxhash = composite_hash;
                }
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

    public static final SubLObject possibly_catch_error_message_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt543);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    SubLObject catchP = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt543);
                    var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt543);
                    catchP = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(PIF, catchP, listS(CATCH_ERROR_MESSAGE, list(var), append(body, NIL)), bq_cons(PROGN, append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt543);
                    }
                }
            }
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

    public static final SubLObject possibly_ccatch_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt544);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject tag = NIL;
                    SubLObject ans_var = NIL;
                    SubLObject catchP = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt544);
                    tag = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt544);
                    ans_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt544);
                    catchP = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(PIF, catchP, listS(CCATCH, tag, ans_var, append(body, NIL)), bq_cons(PROGN, append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt544);
                    }
                }
            }
        }
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

    public static final SubLObject run_benchmark_compensating_for_paging_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt546);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject pre_n = NIL;
                    SubLObject n = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt546);
                    pre_n = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt546);
                    n = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject timings = $sym547$TIMINGS;
                            SubLObject time = $sym548$TIME;
                            SubLObject i = $sym549$I;
                            return list(CLET, list(bq_cons(timings, $list_alt213)), $list_alt550, list(CDOTIMES, list(i, list($sym551$_, pre_n, n)), list(CLET, list(time), listS(CTIME, time, append(body, $list_alt552)), list(PWHEN, list($sym395$__, i, pre_n), list(CPUSH, time, timings)))), listS(PERFORM_STANDARD_STATISTICAL_ANALYSIS, timings, $list_alt417));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt546);
                    }
                }
            }
        }
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

    public static final SubLObject benchmark_gc_alt() {
        return Storage.gc(UNPROVIDED);
    }

    public static SubLObject benchmark_gc() {
        return Storage.gc(UNPROVIDED);
    }

    public static final SubLObject without_pretty_printing_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt556, append(body, NIL));
        }
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

    public static final SubLObject declare_utilities_macros_file_alt() {
        declareMacro("define_api", "DEFINE-API");
        declareMacro("declare_api_function", "DECLARE-API-FUNCTION");
        declareMacro("defmacro_api", "DEFMACRO-API");
        declareMacro("define_api_provisional", "DEFINE-API-PROVISIONAL");
        declareMacro("defmacro_api_provisional", "DEFMACRO-API-PROVISIONAL");
        declareFunction("register_cyc_api_function", "REGISTER-CYC-API-FUNCTION", 5, 0, false);
        declareFunction("register_cyc_api_macro", "REGISTER-CYC-API-MACRO", 3, 0, false);
        declareFunction("api_special_p", "API-SPECIAL-P", 1, 0, false);
        declareFunction("api_special_handler", "API-SPECIAL-HANDLER", 1, 0, false);
        declareFunction("register_api_special", "REGISTER-API-SPECIAL", 2, 0, false);
        declareFunction("api_predefined_function_p", "API-PREDEFINED-FUNCTION-P", 1, 0, false);
        declareFunction("register_api_predefined_function", "REGISTER-API-PREDEFINED-FUNCTION", 1, 0, false);
        declareFunction("unregister_api_predefined_function", "UNREGISTER-API-PREDEFINED-FUNCTION", 1, 0, false);
        declareFunction("api_predefined_host_function_p", "API-PREDEFINED-HOST-FUNCTION-P", 1, 0, false);
        declareFunction("register_api_predefined_host_function", "REGISTER-API-PREDEFINED-HOST-FUNCTION", 1, 0, false);
        declareFunction("unregister_api_predefined_host_function", "UNREGISTER-API-PREDEFINED-HOST-FUNCTION", 1, 0, false);
        declareFunction("api_predefined_macro_p", "API-PREDEFINED-MACRO-P", 1, 0, false);
        declareFunction("register_api_predefined_macro", "REGISTER-API-PREDEFINED-MACRO", 1, 0, false);
        declareFunction("unregister_api_predefined_macro", "UNREGISTER-API-PREDEFINED-MACRO", 1, 0, false);
        declareFunction("api_predefined_host_macro_p", "API-PREDEFINED-HOST-MACRO-P", 1, 0, false);
        declareFunction("register_api_predefined_host_macro", "REGISTER-API-PREDEFINED-HOST-MACRO", 1, 0, false);
        declareFunction("unregister_api_predefined_host_macro", "UNREGISTER-API-PREDEFINED-HOST-MACRO", 1, 0, false);
        declareFunction("cyc_api_symbol_p", "CYC-API-SYMBOL-P", 1, 0, false);
        declareFunction("register_cyc_api_symbol", "REGISTER-CYC-API-SYMBOL", 1, 0, false);
        declareFunction("deregister_cyc_api_symbol", "DEREGISTER-CYC-API-SYMBOL", 1, 0, false);
        declareFunction("cyc_api_args", "CYC-API-ARGS", 1, 0, false);
        declareFunction("register_cyc_api_args", "REGISTER-CYC-API-ARGS", 2, 0, false);
        declareFunction("deregister_cyc_api_args", "DEREGISTER-CYC-API-ARGS", 1, 0, false);
        declareFunction("register_cyc_api_function_documentation", "REGISTER-CYC-API-FUNCTION-DOCUMENTATION", 2, 0, false);
        declareFunction("get_api_arg_types", "GET-API-ARG-TYPES", 1, 0, false);
        declareFunction("register_cyc_api_arg_types", "REGISTER-CYC-API-ARG-TYPES", 2, 0, false);
        declareFunction("deregister_cyc_api_arg_types", "DEREGISTER-CYC-API-ARG-TYPES", 1, 0, false);
        declareFunction("get_api_return_types", "GET-API-RETURN-TYPES", 1, 0, false);
        declareFunction("register_cyc_api_return_types", "REGISTER-CYC-API-RETURN-TYPES", 2, 0, false);
        declareFunction("deregister_cyc_api_return_types", "DEREGISTER-CYC-API-RETURN-TYPES", 1, 0, false);
        declareFunction("parse_api_type_declarations", "PARSE-API-TYPE-DECLARATIONS", 1, 0, false);
        declareFunction("parse_obsolete_api_declarations", "PARSE-OBSOLETE-API-DECLARATIONS", 1, 0, false);
        declareFunction("parse_api_declarations_int", "PARSE-API-DECLARATIONS-INT", 2, 0, false);
        declareFunction("expand_into_check_type", "EXPAND-INTO-CHECK-TYPE", 1, 0, false);
        declareFunction("validate_return_type", "VALIDATE-RETURN-TYPE", 1, 0, false);
        declareMacro("define_after_adding", "DEFINE-AFTER-ADDING");
        declareMacro("define_after_removing", "DEFINE-AFTER-REMOVING");
        declareMacro("define_rule_after_adding", "DEFINE-RULE-AFTER-ADDING");
        declareMacro("define_rule_after_removing", "DEFINE-RULE-AFTER-REMOVING");
        declareMacro("define_collection_defn", "DEFINE-COLLECTION-DEFN");
        declareMacro("define_evaluation_defn", "DEFINE-EVALUATION-DEFN");
        declareMacro("define_expansion_defn", "DEFINE-EXPANSION-DEFN");
        declareMacro("define_cyc_subl_defn", "DEFINE-CYC-SUBL-DEFN");
        declareMacro("define_kb", "DEFINE-KB");
        declareFunction("kb_function_p", "KB-FUNCTION-P", 1, 0, false);
        declareFunction("register_kb_symbol", "REGISTER-KB-SYMBOL", 1, 0, false);
        declareFunction("deregister_kb_symbol", "DEREGISTER-KB-SYMBOL", 1, 0, false);
        declareFunction("deregister_all_kb_functions", "DEREGISTER-ALL-KB-FUNCTIONS", 0, 0, false);
        declareFunction("all_kb_functions", "ALL-KB-FUNCTIONS", 0, 0, false);
        declareFunction("register_kb_function", "REGISTER-KB-FUNCTION", 1, 0, false);
        declareFunction("deregister_kb_function", "DEREGISTER-KB-FUNCTION", 1, 0, false);
        declareMacro("define_private_funcall", "DEFINE-PRIVATE-FUNCALL");
        declareFunction("note_funcall_helper_function", "NOTE-FUNCALL-HELPER-FUNCTION", 1, 0, false);
        declareFunction("funcall_helper_functionP", "FUNCALL-HELPER-FUNCTION?", 1, 0, false);
        declareFunction("unprovided_argumentP", "UNPROVIDED-ARGUMENT?", 1, 0, false);
        declareMacro("declare_control_parameter", "DECLARE-CONTROL-PARAMETER");
        declareFunction("declare_control_parameter_internal", "DECLARE-CONTROL-PARAMETER-INTERNAL", 4, 0, false);
        declareMacro("until_mapping_finished", "UNTIL-MAPPING-FINISHED");
        declareFunction("mapping_finished", "MAPPING-FINISHED", 0, 0, false);
        declareMacro("until_sbhl_mapping_finished", "UNTIL-SBHL-MAPPING-FINISHED");
        declareFunction("sbhl_mapping_finished", "SBHL-MAPPING-FINISHED", 0, 0, false);
        declareMacro("cfasl_write", "CFASL-WRITE");
        declareMacro("cfasl_read", "CFASL-READ");
        declareMacro("if_lock_idle", "IF-LOCK-IDLE");
        declareMacro("possibly_with_lock_held", "POSSIBLY-WITH-LOCK-HELD");
        declareMacro("defglobal_lock", "DEFGLOBAL-LOCK");
        declareFunction("initialize_global_locks", "INITIALIZE-GLOBAL-LOCKS", 0, 0, false);
        declareFunction("register_global_lock", "REGISTER-GLOBAL-LOCK", 2, 0, false);
        declareFunction("global_lock_p", "GLOBAL-LOCK-P", 1, 0, false);
        declareFunction("global_lock_initialization_form", "GLOBAL-LOCK-INITIALIZATION-FORM", 1, 0, false);
        declareFunction("initialize_global_lock", "INITIALIZE-GLOBAL-LOCK", 1, 0, false);
        declareFunction("initialize_global_lock_internal", "INITIALIZE-GLOBAL-LOCK-INTERNAL", 2, 0, false);
        declareMacro("defparameter_fi", "DEFPARAMETER-FI");
        declareMacro("with_clean_fi_state", "WITH-CLEAN-FI-STATE");
        declareFunction("register_html_state_variable", "REGISTER-HTML-STATE-VARIABLE", 1, 0, false);
        declareMacro("defparameter_html", "DEFPARAMETER-HTML");
        declareMacro("defvar_html", "DEFVAR-HTML");
        declareFunction("register_html_interface_variable", "REGISTER-HTML-INTERFACE-VARIABLE", 1, 0, false);
        declareMacro("defparameter_html_interface", "DEFPARAMETER-HTML-INTERFACE");
        declareMacro("defvar_html_interface", "DEFVAR-HTML-INTERFACE");
        declareMacro("def_state_variable", "DEF-STATE-VARIABLE");
        declareFunction("note_state_variable_documentation", "NOTE-STATE-VARIABLE-DOCUMENTATION", 2, 0, false);
        declareFunction("define_operator_for_variable_type", "DEFINE-OPERATOR-FOR-VARIABLE-TYPE", 1, 0, false);
        declareFunction("documentation", "DOCUMENTATION", 1, 1, false);
        declareMacro("defvar_gt", "DEFVAR-GT");
        declareMacro("defvar_at", "DEFVAR-AT");
        declareMacro("defvar_defn", "DEFVAR-DEFN");
        declareMacro("defvar_kbi", "DEFVAR-KBI");
        declareMacro("defvar_kbp", "DEFVAR-KBP");
        declareMacro("with_kbp_defaults", "WITH-KBP-DEFAULTS");
        declareMacro("progn_cyc_api", "PROGN-CYC-API");
        declareMacro("with_forward_inference_environment", "WITH-FORWARD-INFERENCE-ENVIRONMENT");
        declareMacro("with_clean_forward_inference_environment", "WITH-CLEAN-FORWARD-INFERENCE-ENVIRONMENT");
        declareMacro("with_clean_forward_problem_store_environment", "WITH-CLEAN-FORWARD-PROBLEM-STORE-ENVIRONMENT");
        declareMacro("with_normal_forward_inference_parameters", "WITH-NORMAL-FORWARD-INFERENCE-PARAMETERS");
        declareMacro("with_normal_forward_inference", "WITH-NORMAL-FORWARD-INFERENCE");
        declareFunction("within_normal_forward_inferenceP", "WITHIN-NORMAL-FORWARD-INFERENCE?", 0, 0, false);
        declareMacro("throw_unevaluatable_on_error", "THROW-UNEVALUATABLE-ON-ERROR");
        declareFunction("tracing_at_level", "TRACING-AT-LEVEL", 2, 0, false);
        declareMacro("if_tracing", "IF-TRACING");
        declareMacro("with_static_structure_resourcing", "WITH-STATIC-STRUCTURE-RESOURCING");
        declareMacro("possibly_with_static_structure_resourcing", "POSSIBLY-WITH-STATIC-STRUCTURE-RESOURCING");
        declareMacro("define_structure_resource", "DEFINE-STRUCTURE-RESOURCE");
        declareMacro("noting_activity", "NOTING-ACTIVITY");
        declareMacro("noting_progress", "NOTING-PROGRESS");
        declareFunction("noting_progress_preamble", "NOTING-PROGRESS-PREAMBLE", 1, 0, false);
        declareFunction("noting_progress_postamble", "NOTING-PROGRESS-POSTAMBLE", 0, 0, false);
        declareMacro("noting_percent_progress", "NOTING-PERCENT-PROGRESS");
        declareFunction("noting_percent_progress_preamble", "NOTING-PERCENT-PROGRESS-PREAMBLE", 1, 0, false);
        declareFunction("noting_percent_progress_postamble", "NOTING-PERCENT-PROGRESS-POSTAMBLE", 0, 0, false);
        declareFunction("note_percent_progress", "NOTE-PERCENT-PROGRESS", 2, 0, false);
        declareFunction("print_progress_percent", "PRINT-PROGRESS-PERCENT", 1, 0, false);
        declareFunction("print_2_digit_nonnegative_integer", "PRINT-2-DIGIT-NONNEGATIVE-INTEGER", 2, 0, false);
        declareFunction("possibly_note_percent_progress_prediction", "POSSIBLY-NOTE-PERCENT-PROGRESS-PREDICTION", 3, 1, false);
        declareFunction("compute_percent_progress", "COMPUTE-PERCENT-PROGRESS", 2, 0, false);
        declareFunction("progress", "PROGRESS", 0, 0, false);
        declareMacro("progress_cdotimes", "PROGRESS-CDOTIMES");
        declareMacro("progress_csome", "PROGRESS-CSOME");
        declareMacro("progress_cdolist", "PROGRESS-CDOLIST");
        declareMacro("possibly_progress_cdolist", "POSSIBLY-PROGRESS-CDOLIST");
        declareMacro("progress_cdohash", "PROGRESS-CDOHASH");
        declareMacro("progress_do_set", "PROGRESS-DO-SET");
        declareMacro("noting_elapsed_time", "NOTING-ELAPSED-TIME");
        declareFunction("noting_elapsed_time_preamble", "NOTING-ELAPSED-TIME-PREAMBLE", 1, 0, false);
        declareFunction("noting_elapsed_time_postamble", "NOTING-ELAPSED-TIME-POSTAMBLE", 2, 0, false);
        declareMacro("with_cyc_server_handling", "WITH-CYC-SERVER-HANDLING");
        declareMacro("with_cyc_io_syntax", "WITH-CYC-IO-SYNTAX");
        declareFunction("with_cyc_io_syntax_internal", "WITH-CYC-IO-SYNTAX-INTERNAL", 1, 0, false);
        declareMacro("with_sublisp_runtime_assumptions", "WITH-SUBLISP-RUNTIME-ASSUMPTIONS");
        declareMacro("with_the_cyclist", "WITH-THE-CYCLIST");
        declareMacro("with_different_cyclist", "WITH-DIFFERENT-CYCLIST");
        declareMacro("do_bindings", "DO-BINDINGS");
        declareFunction("do_bindings_var_specs", "DO-BINDINGS-VAR-SPECS", 2, 0, false);
        declareMacro("fast_singleton_macro_p", "FAST-SINGLETON-MACRO-P");
        declareFunction("pluralityP", "PLURALITY?", 1, 0, false);
        declareMacro("fast_plurality_macro_p", "FAST-PLURALITY-MACRO-P");
        declareMacro("cdosublists", "CDOSUBLISTS");
        declareMacro("cdolist_and_sublists", "CDOLIST-AND-SUBLISTS");
        declareMacro("cdolist_and_sublists_carefully", "CDOLIST-AND-SUBLISTS-CAREFULLY");
        declareMacro("cdo_possibly_dotted_list", "CDO-POSSIBLY-DOTTED-LIST");
        declareMacro("cdolist_if", "CDOLIST-IF");
        declareMacro("cdosublists_if", "CDOSUBLISTS-IF");
        declareMacro("cdolist_if_not", "CDOLIST-IF-NOT");
        declareMacro("cdosublists_if_not", "CDOSUBLISTS-IF-NOT");
        declareMacro("cdo2lists", "CDO2LISTS");
        declareMacro("cdotree", "CDOTREE");
        declareMacro("cdotree_conses", "CDOTREE-CONSES");
        declareMacro("cdoplist", "CDOPLIST");
        declareFunction("compositize_function_call", "COMPOSITIZE-FUNCTION-CALL", 2, 1, false);
        declareFunction("simplify_car_and_cdr_path", "SIMPLIFY-CAR-AND-CDR-PATH", 1, 0, false);
        declareFunction("map_symbols_to_accessors", "MAP-SYMBOLS-TO-ACCESSORS", 3, 0, false);
        declareMacro("cdestructuring_setq", "CDESTRUCTURING-SETQ");
        declareFunction("fast_funcall_no_value_check_args", "FAST-FUNCALL-NO-VALUE-CHECK-ARGS", 3, 0, false);
        declareMacro("fast_funcall_no_value", "FAST-FUNCALL-NO-VALUE");
        declareMacro("fast_funcall_setq", "FAST-FUNCALL-SETQ");
        declareFunction("generate_parallel_var_list", "GENERATE-PARALLEL-VAR-LIST", 1, 0, false);
        declareFunction("generate_multiple_csetq", "GENERATE-MULTIPLE-CSETQ", 2, 0, false);
        declareMacro("fast_funcall_multiple_value_bind", "FAST-FUNCALL-MULTIPLE-VALUE-BIND");
        declareMacro("fast_funcall_multiple_value_setq", "FAST-FUNCALL-MULTIPLE-VALUE-SETQ");
        declareFunction("expand_destructuring_predication_generator", "EXPAND-DESTRUCTURING-PREDICATION-GENERATOR", 2, 0, false);
        declareMacro("funcall_shortcut", "FUNCALL-SHORTCUT");
        declareMacro("destructuring_predication_generator", "DESTRUCTURING-PREDICATION-GENERATOR");
        declareFunction("symbol_in_tree_p", "SYMBOL-IN-TREE-P", 2, 0, false);
        declareFunction("unquoted_symbol_in_tree_p", "UNQUOTED-SYMBOL-IN-TREE-P", 2, 0, false);
        declareFunction("generate_instance_variable_bindings_for_structure_slots", "GENERATE-INSTANCE-VARIABLE-BINDINGS-FOR-STRUCTURE-SLOTS", 5, 1, false);
        declareMacro("cdolist_collecting", "CDOLIST-COLLECTING");
        declareMacro("cdolist_appending", "CDOLIST-APPENDING");
        declareFunction("expand_define_list_element_predicator", "EXPAND-DEFINE-LIST-ELEMENT-PREDICATOR", 5, 0, false);
        declareMacro("define_api_list_element_predicator", "DEFINE-API-LIST-ELEMENT-PREDICATOR");
        declareMacro("define_public_list_element_predicator", "DEFINE-PUBLIC-LIST-ELEMENT-PREDICATOR");
        declareMacro("define_protected_list_element_predicator", "DEFINE-PROTECTED-LIST-ELEMENT-PREDICATOR");
        declareMacro("define_private_list_element_predicator", "DEFINE-PRIVATE-LIST-ELEMENT-PREDICATOR");
        declareFunction("argnames_from_arglist", "ARGNAMES-FROM-ARGLIST", 1, 0, false);
        declareFunction("car_if_list", "CAR-IF-LIST", 1, 0, false);
        declareFunction("expand_fcond", "EXPAND-FCOND", 1, 0, false);
        declareMacro("fcond", "FCOND");
        declareFunction("check_p_range_case_clauses", "CHECK-P-RANGE-CASE-CLAUSES", 1, 0, false);
        declareFunction("utilities_macros_car_eq", "UTILITIES-MACROS-CAR-EQ", 2, 0, false);
        declareFunction("expand_p_range_case", "EXPAND-P-RANGE-CASE", 2, 0, false);
        declareMacro("p_range_case", "P-RANGE-CASE");
        declareFunction("default_code_branch_error_clause", "DEFAULT-CODE-BRANCH-ERROR-CLAUSE", 1, 0, false);
        declareMacro("code_branch_by_version", "CODE-BRANCH-BY-VERSION");
        declareMacro("code_branch_by_version_numbers", "CODE-BRANCH-BY-VERSION-NUMBERS");
        declareFunction("sub_kb_loaded_root_string", "SUB-KB-LOADED-ROOT-STRING", 1, 0, false);
        declareFunction("sub_kb_loaded_p_symbol", "SUB-KB-LOADED-P-SYMBOL", 1, 0, false);
        declareFunction("sub_kb_set_symbol", "SUB-KB-SET-SYMBOL", 1, 0, false);
        declareFunction("sub_kb_unset_symbol", "SUB-KB-UNSET-SYMBOL", 1, 0, false);
        declareMacro("declare_kb_feature", "DECLARE-KB-FEATURE");
        declareFunction("expand_format_to_string", "EXPAND-FORMAT-TO-STRING", 1, 0, false);
        declareMacro("format_to_string", "FORMAT-TO-STRING");
        declareMacro("time", "TIME");
        declareMacro("with_process_resource_tracking_in_seconds", "WITH-PROCESS-RESOURCE-TRACKING-IN-SECONDS");
        declareFunction("convert_process_resource_tracking_timing_info_to_seconds", "CONVERT-PROCESS-RESOURCE-TRACKING-TIMING-INFO-TO-SECONDS", 1, 0, false);
        declareFunction("nadd_clock_time_to_process_resource_timing_info", "NADD-CLOCK-TIME-TO-PROCESS-RESOURCE-TIMING-INFO", 2, 0, false);
        declareFunction("process_resource_tracking_user_time", "PROCESS-RESOURCE-TRACKING-USER-TIME", 1, 0, false);
        declareFunction("process_resource_tracking_system_time", "PROCESS-RESOURCE-TRACKING-SYSTEM-TIME", 1, 0, false);
        declareFunction("process_resource_tracking_wall_clock_time", "PROCESS-RESOURCE-TRACKING-WALL-CLOCK-TIME", 1, 0, false);
        declareMacro("timing_info", "TIMING-INFO");
        declareMacro("user_time", "USER-TIME");
        declareMacro("user_time_in_seconds", "USER-TIME-IN-SECONDS");
        declareMacro("system_time", "SYSTEM-TIME");
        declareMacro("system_time_in_seconds", "SYSTEM-TIME-IN-SECONDS");
        declareMacro("check_type_if_present", "CHECK-TYPE-IF-PRESENT");
        declareMacro("check_list_type", "CHECK-LIST-TYPE");
        declareMacro("check_plist_type", "CHECK-PLIST-TYPE");
        declareMacro("warn_unless_plist_of_type", "WARN-UNLESS-PLIST-OF-TYPE");
        declareMacro("must_if_present", "MUST-IF-PRESENT");
        declareMacro("swap", "SWAP");
        declareMacro("def_kb_variable", "DEF-KB-VARIABLE");
        declareFunction("register_kb_variable_initialization", "REGISTER-KB-VARIABLE-INITIALIZATION", 2, 0, false);
        declareFunction("initialize_kb_variables", "INITIALIZE-KB-VARIABLES", 0, 0, false);
        declareMacro("defparameter_lazy", "DEFPARAMETER-LAZY");
        declareMacro("defvar_lazy", "DEFVAR-LAZY");
        declareMacro("defglobal_lazy", "DEFGLOBAL-LAZY");
        declareMacro("deflexical_lazy", "DEFLEXICAL-LAZY");
        declareMacro("define_api_obsolete", "DEFINE-API-OBSOLETE");
        declareFunction("register_obsolete_cyc_api_function", "REGISTER-OBSOLETE-CYC-API-FUNCTION", 6, 0, false);
        declareFunction("obsolete_cyc_api_replacements", "OBSOLETE-CYC-API-REPLACEMENTS", 1, 0, false);
        declareFunction("register_obsolete_cyc_api_replacements", "REGISTER-OBSOLETE-CYC-API-REPLACEMENTS", 2, 0, false);
        declareFunction("deregister_obsolete_cyc_api_replacements", "DEREGISTER-OBSOLETE-CYC-API-REPLACEMENTS", 1, 0, false);
        declareFunction("initialization_for_partial_list_results", "INITIALIZATION-FOR-PARTIAL-LIST-RESULTS", 0, 0, false);
        declareFunction("accumulation_for_partial_list_results", "ACCUMULATION-FOR-PARTIAL-LIST-RESULTS", 1, 0, false);
        declareFunction("consolidation_for_partial_list_results", "CONSOLIDATION-FOR-PARTIAL-LIST-RESULTS", 1, 0, false);
        declareFunction("notification_for_partial_list_results", "NOTIFICATION-FOR-PARTIAL-LIST-RESULTS", 3, 0, false);
        declareFunction("final_results_for_partial_list_results", "FINAL-RESULTS-FOR-PARTIAL-LIST-RESULTS", 1, 0, false);
        declareFunction("add_result_to_partial_results_accumulator", "ADD-RESULT-TO-PARTIAL-RESULTS-ACCUMULATOR", 1, 0, false);
        declareMacro("with_partial_results_accumulation", "WITH-PARTIAL-RESULTS-ACCUMULATION");
        declareMacro("with_space_profiling_to_string", "WITH-SPACE-PROFILING-TO-STRING");
        declareMacro("with_sxhash_composite", "WITH-SXHASH-COMPOSITE");
        declareMacro("with_sxhash_composite_fast", "WITH-SXHASH-COMPOSITE-FAST");
        declareMacro("sxhash_composite_update_fast", "SXHASH-COMPOSITE-UPDATE-FAST");
        declareFunction("sxhash_update_state", "SXHASH-UPDATE-STATE", 1, 0, false);
        declareFunction("sxhash_composite_update", "SXHASH-COMPOSITE-UPDATE", 1, 0, false);
        declareFunction("slow_hash_test", "SLOW-HASH-TEST", 0, 1, false);
        declareFunction("fast_hash_test", "FAST-HASH-TEST", 0, 1, false);
        declareMacro("possibly_catch_error_message", "POSSIBLY-CATCH-ERROR-MESSAGE");
        declareMacro("possibly_ccatch", "POSSIBLY-CCATCH");
        declareMacro("run_benchmark_compensating_for_paging", "RUN-BENCHMARK-COMPENSATING-FOR-PAGING");
        declareFunction("benchmark_gc", "BENCHMARK-GC", 0, 0, false);
        declareMacro("without_pretty_printing", "WITHOUT-PRETTY-PRINTING");
        return NIL;
    }

    public static SubLObject declare_utilities_macros_file() {
        if (SubLFiles.USE_V1) {
            declareMacro("define_api", "DEFINE-API");
            declareMacro("declare_api_function", "DECLARE-API-FUNCTION");
            declareMacro("defmacro_api", "DEFMACRO-API");
            declareMacro("define_api_provisional", "DEFINE-API-PROVISIONAL");
            declareMacro("defmacro_api_provisional", "DEFMACRO-API-PROVISIONAL");
            declareFunction("register_cyc_api_function", "REGISTER-CYC-API-FUNCTION", 5, 0, false);
            declareFunction("register_cyc_api_macro", "REGISTER-CYC-API-MACRO", 3, 0, false);
            declareFunction("api_special_p", "API-SPECIAL-P", 1, 0, false);
            declareFunction("api_special_handler", "API-SPECIAL-HANDLER", 1, 0, false);
            declareFunction("register_api_special", "REGISTER-API-SPECIAL", 2, 0, false);
            declareFunction("api_predefined_function_p", "API-PREDEFINED-FUNCTION-P", 1, 0, false);
            declareFunction("register_api_predefined_function", "REGISTER-API-PREDEFINED-FUNCTION", 1, 0, false);
            declareFunction("unregister_api_predefined_function", "UNREGISTER-API-PREDEFINED-FUNCTION", 1, 0, false);
            declareFunction("api_predefined_host_function_p", "API-PREDEFINED-HOST-FUNCTION-P", 1, 0, false);
            declareFunction("register_api_predefined_host_function", "REGISTER-API-PREDEFINED-HOST-FUNCTION", 1, 0, false);
            declareFunction("unregister_api_predefined_host_function", "UNREGISTER-API-PREDEFINED-HOST-FUNCTION", 1, 0, false);
            declareFunction("api_predefined_macro_p", "API-PREDEFINED-MACRO-P", 1, 0, false);
            declareFunction("register_api_predefined_macro", "REGISTER-API-PREDEFINED-MACRO", 1, 0, false);
            declareFunction("unregister_api_predefined_macro", "UNREGISTER-API-PREDEFINED-MACRO", 1, 0, false);
            declareFunction("api_predefined_host_macro_p", "API-PREDEFINED-HOST-MACRO-P", 1, 0, false);
            declareFunction("register_api_predefined_host_macro", "REGISTER-API-PREDEFINED-HOST-MACRO", 1, 0, false);
            declareFunction("unregister_api_predefined_host_macro", "UNREGISTER-API-PREDEFINED-HOST-MACRO", 1, 0, false);
            declareFunction("cyc_api_symbol_p", "CYC-API-SYMBOL-P", 1, 0, false);
            declareFunction("register_cyc_api_symbol", "REGISTER-CYC-API-SYMBOL", 1, 0, false);
            declareFunction("deregister_cyc_api_symbol", "DEREGISTER-CYC-API-SYMBOL", 1, 0, false);
            declareFunction("cyc_api_args", "CYC-API-ARGS", 1, 0, false);
            declareFunction("register_cyc_api_args", "REGISTER-CYC-API-ARGS", 2, 0, false);
            declareFunction("deregister_cyc_api_args", "DEREGISTER-CYC-API-ARGS", 1, 0, false);
            declareFunction("register_cyc_api_function_documentation", "REGISTER-CYC-API-FUNCTION-DOCUMENTATION", 2, 0, false);
            declareFunction("get_api_arg_types", "GET-API-ARG-TYPES", 1, 0, false);
            declareFunction("register_cyc_api_arg_types", "REGISTER-CYC-API-ARG-TYPES", 2, 0, false);
            declareFunction("deregister_cyc_api_arg_types", "DEREGISTER-CYC-API-ARG-TYPES", 1, 0, false);
            declareFunction("get_api_return_types", "GET-API-RETURN-TYPES", 1, 0, false);
            declareFunction("register_cyc_api_return_types", "REGISTER-CYC-API-RETURN-TYPES", 2, 0, false);
            declareFunction("deregister_cyc_api_return_types", "DEREGISTER-CYC-API-RETURN-TYPES", 1, 0, false);
            declareFunction("parse_api_type_declarations", "PARSE-API-TYPE-DECLARATIONS", 1, 0, false);
            declareFunction("parse_obsolete_api_declarations", "PARSE-OBSOLETE-API-DECLARATIONS", 1, 0, false);
            declareFunction("parse_api_declarations_int", "PARSE-API-DECLARATIONS-INT", 2, 0, false);
            declareFunction("expand_into_enforce_type", "EXPAND-INTO-ENFORCE-TYPE", 1, 0, false);
            declareFunction("validate_return_type", "VALIDATE-RETURN-TYPE", 1, 0, false);
            declareMacro("define_after_adding", "DEFINE-AFTER-ADDING");
            declareMacro("define_after_removing", "DEFINE-AFTER-REMOVING");
            declareMacro("define_rule_after_adding", "DEFINE-RULE-AFTER-ADDING");
            declareMacro("define_rule_after_removing", "DEFINE-RULE-AFTER-REMOVING");
            declareMacro("define_collection_defn", "DEFINE-COLLECTION-DEFN");
            declareMacro("define_evaluation_defn", "DEFINE-EVALUATION-DEFN");
            declareMacro("define_expansion_defn", "DEFINE-EXPANSION-DEFN");
            declareMacro("define_cyc_subl_defn", "DEFINE-CYC-SUBL-DEFN");
            declareMacro("define_kb", "DEFINE-KB");
            declareFunction("kb_function_p", "KB-FUNCTION-P", 1, 0, false);
            declareFunction("register_kb_symbol", "REGISTER-KB-SYMBOL", 1, 0, false);
            declareFunction("deregister_kb_symbol", "DEREGISTER-KB-SYMBOL", 1, 0, false);
            declareFunction("deregister_all_kb_functions", "DEREGISTER-ALL-KB-FUNCTIONS", 0, 0, false);
            declareFunction("all_kb_functions", "ALL-KB-FUNCTIONS", 0, 0, false);
            declareFunction("register_kb_function", "REGISTER-KB-FUNCTION", 1, 0, false);
            declareFunction("deregister_kb_function", "DEREGISTER-KB-FUNCTION", 1, 0, false);
            declareMacro("define_private_funcall", "DEFINE-PRIVATE-FUNCALL");
            declareFunction("note_funcall_helper_function", "NOTE-FUNCALL-HELPER-FUNCTION", 1, 0, false);
            declareFunction("funcall_helper_functionP", "FUNCALL-HELPER-FUNCTION?", 1, 0, false);
            declareFunction("unprovided_argumentP", "UNPROVIDED-ARGUMENT?", 1, 0, false);
            declareMacro("declare_control_parameter", "DECLARE-CONTROL-PARAMETER");
            declareFunction("declare_control_parameter_internal", "DECLARE-CONTROL-PARAMETER-INTERNAL", 4, 0, false);
            declareMacro("until_mapping_finished", "UNTIL-MAPPING-FINISHED");
            declareFunction("mapping_finished", "MAPPING-FINISHED", 0, 0, false);
            declareMacro("until_sbhl_mapping_finished", "UNTIL-SBHL-MAPPING-FINISHED");
            declareFunction("sbhl_mapping_finished", "SBHL-MAPPING-FINISHED", 0, 0, false);
            declareMacro("cfasl_write", "CFASL-WRITE");
            declareMacro("cfasl_read", "CFASL-READ");
            declareMacro("if_lock_idle", "IF-LOCK-IDLE");
            declareMacro("possibly_with_lock_held", "POSSIBLY-WITH-LOCK-HELD");
            declareMacro("defglobal_lock", "DEFGLOBAL-LOCK");
            declareFunction("initialize_global_locks", "INITIALIZE-GLOBAL-LOCKS", 0, 0, false);
            declareFunction("register_global_lock", "REGISTER-GLOBAL-LOCK", 2, 0, false);
            declareFunction("global_lock_p", "GLOBAL-LOCK-P", 1, 0, false);
            declareFunction("global_lock_initialization_form", "GLOBAL-LOCK-INITIALIZATION-FORM", 1, 0, false);
            declareFunction("initialize_global_lock", "INITIALIZE-GLOBAL-LOCK", 1, 0, false);
            declareFunction("initialize_global_lock_internal", "INITIALIZE-GLOBAL-LOCK-INTERNAL", 2, 0, false);
            declareMacro("defparameter_fi", "DEFPARAMETER-FI");
            declareMacro("with_clean_fi_state", "WITH-CLEAN-FI-STATE");
            declareFunction("register_html_state_variable", "REGISTER-HTML-STATE-VARIABLE", 1, 0, false);
            declareMacro("defparameter_html", "DEFPARAMETER-HTML");
            declareMacro("defvar_html", "DEFVAR-HTML");
            declareFunction("register_html_interface_variable", "REGISTER-HTML-INTERFACE-VARIABLE", 1, 0, false);
            declareMacro("defparameter_html_interface", "DEFPARAMETER-HTML-INTERFACE");
            declareMacro("defvar_html_interface", "DEFVAR-HTML-INTERFACE");
            declareMacro("def_state_variable", "DEF-STATE-VARIABLE");
            declareFunction("note_state_variable_documentation", "NOTE-STATE-VARIABLE-DOCUMENTATION", 2, 0, false);
            declareFunction("define_operator_for_variable_type", "DEFINE-OPERATOR-FOR-VARIABLE-TYPE", 1, 0, false);
            declareFunction("documentation", "DOCUMENTATION", 1, 1, false);
            declareMacro("defvar_gt", "DEFVAR-GT");
            declareMacro("defvar_at", "DEFVAR-AT");
            declareMacro("defvar_defn", "DEFVAR-DEFN");
            declareMacro("defvar_kbi", "DEFVAR-KBI");
            declareMacro("defvar_kbp", "DEFVAR-KBP");
            declareMacro("with_kbp_defaults", "WITH-KBP-DEFAULTS");
            declareMacro("progn_cyc_api", "PROGN-CYC-API");
            declareMacro("with_forward_inference_environment", "WITH-FORWARD-INFERENCE-ENVIRONMENT");
            declareMacro("with_clean_forward_inference_environment", "WITH-CLEAN-FORWARD-INFERENCE-ENVIRONMENT");
            declareMacro("with_possibly_clean_forward_inference_environment", "WITH-POSSIBLY-CLEAN-FORWARD-INFERENCE-ENVIRONMENT");
            declareFunction("possibly_get_forward_inference_environment", "POSSIBLY-GET-FORWARD-INFERENCE-ENVIRONMENT", 0, 0, false);
            declareMacro("with_clean_forward_problem_store_environment", "WITH-CLEAN-FORWARD-PROBLEM-STORE-ENVIRONMENT");
            declareMacro("with_normal_forward_inference_parameters", "WITH-NORMAL-FORWARD-INFERENCE-PARAMETERS");
            declareMacro("with_normal_forward_inference", "WITH-NORMAL-FORWARD-INFERENCE");
            declareFunction("within_normal_forward_inferenceP", "WITHIN-NORMAL-FORWARD-INFERENCE?", 0, 0, false);
            declareMacro("throw_unevaluatable_on_error", "THROW-UNEVALUATABLE-ON-ERROR");
            declareFunction("tracing_at_level", "TRACING-AT-LEVEL", 2, 0, false);
            declareMacro("if_tracing", "IF-TRACING");
            declareMacro("with_static_structure_resourcing", "WITH-STATIC-STRUCTURE-RESOURCING");
            declareMacro("possibly_with_static_structure_resourcing", "POSSIBLY-WITH-STATIC-STRUCTURE-RESOURCING");
            declareMacro("define_structure_resource", "DEFINE-STRUCTURE-RESOURCE");
            declareMacro("with_readtime_eval_disabled", "WITH-READTIME-EVAL-DISABLED");
            declareMacro("noting_progress", "NOTING-PROGRESS");
            declareMacro("noting_progress_delayed", "NOTING-PROGRESS-DELAYED");
            declareFunction("noting_progress_preamble", "NOTING-PROGRESS-PREAMBLE", 1, 0, false);
            declareFunction("noting_progress_postamble", "NOTING-PROGRESS-POSTAMBLE", 0, 0, false);
            declareFunction("note_progress", "NOTE-PROGRESS", 0, 0, false);
            declareMacro("noting_activity", "NOTING-ACTIVITY");
            declareMacro("noting_percent_progress", "NOTING-PERCENT-PROGRESS");
            declareMacro("noting_percent_progress_delayed", "NOTING-PERCENT-PROGRESS-DELAYED");
            declareFunction("noting_percent_progress_preamble", "NOTING-PERCENT-PROGRESS-PREAMBLE", 1, 0, false);
            declareFunction("noting_percent_progress_postamble", "NOTING-PERCENT-PROGRESS-POSTAMBLE", 0, 0, false);
            declareFunction("note_percent_progress", "NOTE-PERCENT-PROGRESS", 2, 0, false);
            declareFunction("print_progress_percent", "PRINT-PROGRESS-PERCENT", 1, 0, false);
            declareFunction("print_2_digit_nonnegative_integer", "PRINT-2-DIGIT-NONNEGATIVE-INTEGER", 2, 0, false);
            declareFunction("possibly_note_percent_progress_prediction", "POSSIBLY-NOTE-PERCENT-PROGRESS-PREDICTION", 3, 1, false);
            declareFunction("compute_percent_progress", "COMPUTE-PERCENT-PROGRESS", 2, 0, false);
            declareFunction("progress", "PROGRESS", 0, 0, false);
            declareMacro("progress_cdotimes", "PROGRESS-CDOTIMES");
            declareMacro("progress_csome", "PROGRESS-CSOME");
            declareMacro("progress_cdolist", "PROGRESS-CDOLIST");
            declareMacro("possibly_progress_cdolist", "POSSIBLY-PROGRESS-CDOLIST");
            declareMacro("progress_cdohash", "PROGRESS-CDOHASH");
            declareMacro("progress_do_set", "PROGRESS-DO-SET");
            declareMacro("noting_elapsed_time", "NOTING-ELAPSED-TIME");
            declareFunction("noting_elapsed_time_preamble", "NOTING-ELAPSED-TIME-PREAMBLE", 1, 0, false);
            declareFunction("noting_elapsed_time_postamble", "NOTING-ELAPSED-TIME-POSTAMBLE", 2, 0, false);
            declareMacro("with_cyc_server_handling", "WITH-CYC-SERVER-HANDLING");
            declareMacro("with_cyc_io_syntax", "WITH-CYC-IO-SYNTAX");
            declareFunction("with_cyc_io_syntax_internal", "WITH-CYC-IO-SYNTAX-INTERNAL", 1, 0, false);
            declareMacro("with_sublisp_runtime_assumptions", "WITH-SUBLISP-RUNTIME-ASSUMPTIONS");
            declareMacro("with_the_cyclist", "WITH-THE-CYCLIST");
            declareMacro("with_different_cyclist", "WITH-DIFFERENT-CYCLIST");
            declareMacro("do_bindings", "DO-BINDINGS");
            declareFunction("do_bindings_var_specs", "DO-BINDINGS-VAR-SPECS", 2, 0, false);
            declareMacro("fast_singleton_macro_p", "FAST-SINGLETON-MACRO-P");
            declareFunction("pluralityP", "PLURALITY?", 1, 0, false);
            declareMacro("fast_plurality_macro_p", "FAST-PLURALITY-MACRO-P");
            declareMacro("cdosublists", "CDOSUBLISTS");
            declareMacro("cdolist_and_sublists", "CDOLIST-AND-SUBLISTS");
            declareMacro("cdolist_and_sublists_carefully", "CDOLIST-AND-SUBLISTS-CAREFULLY");
            declareMacro("cdo_possibly_dotted_list", "CDO-POSSIBLY-DOTTED-LIST");
            declareMacro("cdolist_if", "CDOLIST-IF");
            declareMacro("cdosublists_if", "CDOSUBLISTS-IF");
            declareMacro("cdolist_if_not", "CDOLIST-IF-NOT");
            declareMacro("cdosublists_if_not", "CDOSUBLISTS-IF-NOT");
            declareMacro("cdo2lists", "CDO2LISTS");
            declareMacro("cdotree", "CDOTREE");
            declareMacro("cdotree_conses", "CDOTREE-CONSES");
            declareMacro("cdoplist", "CDOPLIST");
            declareFunction("compositize_function_call", "COMPOSITIZE-FUNCTION-CALL", 2, 1, false);
            declareFunction("simplify_car_and_cdr_path", "SIMPLIFY-CAR-AND-CDR-PATH", 1, 0, false);
            declareFunction("map_symbols_to_accessors", "MAP-SYMBOLS-TO-ACCESSORS", 3, 0, false);
            declareMacro("cdestructuring_setq", "CDESTRUCTURING-SETQ");
            declareFunction("fast_funcall_no_value_check_args", "FAST-FUNCALL-NO-VALUE-CHECK-ARGS", 3, 0, false);
            declareMacro("fast_funcall_no_value", "FAST-FUNCALL-NO-VALUE");
            declareMacro("fast_funcall_setq", "FAST-FUNCALL-SETQ");
            declareFunction("generate_parallel_var_list", "GENERATE-PARALLEL-VAR-LIST", 1, 0, false);
            declareFunction("generate_multiple_csetq", "GENERATE-MULTIPLE-CSETQ", 2, 0, false);
            declareMacro("fast_funcall_multiple_value_bind", "FAST-FUNCALL-MULTIPLE-VALUE-BIND");
            declareMacro("fast_funcall_multiple_value_setq", "FAST-FUNCALL-MULTIPLE-VALUE-SETQ");
            declareFunction("expand_destructuring_predication_generator", "EXPAND-DESTRUCTURING-PREDICATION-GENERATOR", 2, 0, false);
            declareMacro("funcall_shortcut", "FUNCALL-SHORTCUT");
            declareMacro("destructuring_predication_generator", "DESTRUCTURING-PREDICATION-GENERATOR");
            declareFunction("symbol_in_tree_p", "SYMBOL-IN-TREE-P", 2, 0, false);
            // declareFunction("unquoted_symbol_in_tree_p", "UNQUOTED-SYMBOL-IN-TREE-P", 2, 0, false);
            declareFunction("generate_instance_variable_bindings_for_structure_slots", "GENERATE-INSTANCE-VARIABLE-BINDINGS-FOR-STRUCTURE-SLOTS", 5, 1, false);
            declareMacro("cdolist_collecting", "CDOLIST-COLLECTING");
            declareMacro("cdolist_appending", "CDOLIST-APPENDING");
            declareFunction("expand_define_list_element_predicator", "EXPAND-DEFINE-LIST-ELEMENT-PREDICATOR", 5, 0, false);
            declareMacro("define_api_list_element_predicator", "DEFINE-API-LIST-ELEMENT-PREDICATOR");
            declareMacro("define_public_list_element_predicator", "DEFINE-PUBLIC-LIST-ELEMENT-PREDICATOR");
            declareMacro("define_protected_list_element_predicator", "DEFINE-PROTECTED-LIST-ELEMENT-PREDICATOR");
            declareMacro("define_private_list_element_predicator", "DEFINE-PRIVATE-LIST-ELEMENT-PREDICATOR");
            declareFunction("argnames_from_arglist", "ARGNAMES-FROM-ARGLIST", 1, 0, false);
            declareFunction("car_if_list", "CAR-IF-LIST", 1, 0, false);
            declareFunction("car_if_list_or_nil", "CAR-IF-LIST-OR-NIL", 1, 0, false);
            declareFunction("expand_fcond", "EXPAND-FCOND", 1, 0, false);
            declareMacro("fcond", "FCOND");
            declareFunction("check_p_range_case_clauses", "CHECK-P-RANGE-CASE-CLAUSES", 1, 0, false);
            declareFunction("utilities_macros_car_eq", "UTILITIES-MACROS-CAR-EQ", 2, 0, false);
            declareFunction("expand_p_range_case", "EXPAND-P-RANGE-CASE", 2, 0, false);
            declareMacro("p_range_case", "P-RANGE-CASE");
            declareFunction("default_code_branch_error_clause", "DEFAULT-CODE-BRANCH-ERROR-CLAUSE", 1, 0, false);
            declareMacro("code_branch_by_version", "CODE-BRANCH-BY-VERSION");
            declareMacro("code_branch_by_version_numbers", "CODE-BRANCH-BY-VERSION-NUMBERS");
            declareFunction("sub_kb_loaded_root_string", "SUB-KB-LOADED-ROOT-STRING", 1, 0, false);
            declareFunction("sub_kb_loaded_p_symbol", "SUB-KB-LOADED-P-SYMBOL", 1, 0, false);
            declareFunction("sub_kb_set_symbol", "SUB-KB-SET-SYMBOL", 1, 0, false);
            declareFunction("sub_kb_unset_symbol", "SUB-KB-UNSET-SYMBOL", 1, 0, false);
            declareMacro("declare_kb_feature", "DECLARE-KB-FEATURE");
            declareFunction("expand_format_to_string", "EXPAND-FORMAT-TO-STRING", 1, 0, false);
            declareMacro("format_to_string", "FORMAT-TO-STRING");
            declareMacro("time", "TIME");
            declareMacro("with_process_resource_tracking_in_seconds", "WITH-PROCESS-RESOURCE-TRACKING-IN-SECONDS");
            declareFunction("convert_process_resource_tracking_timing_info_to_seconds", "CONVERT-PROCESS-RESOURCE-TRACKING-TIMING-INFO-TO-SECONDS", 1, 0, false);
            declareFunction("nadd_clock_time_to_process_resource_timing_info", "NADD-CLOCK-TIME-TO-PROCESS-RESOURCE-TIMING-INFO", 2, 0, false);
            declareFunction("process_resource_tracking_user_time", "PROCESS-RESOURCE-TRACKING-USER-TIME", 1, 0, false);
            declareFunction("process_resource_tracking_system_time", "PROCESS-RESOURCE-TRACKING-SYSTEM-TIME", 1, 0, false);
            declareFunction("process_resource_tracking_wall_clock_time", "PROCESS-RESOURCE-TRACKING-WALL-CLOCK-TIME", 1, 0, false);
            declareMacro("timing_info", "TIMING-INFO");
            declareMacro("user_time", "USER-TIME");
            declareMacro("user_time_in_seconds", "USER-TIME-IN-SECONDS");
            declareMacro("system_time", "SYSTEM-TIME");
            declareMacro("system_time_in_seconds", "SYSTEM-TIME-IN-SECONDS");
            declareMacro("check_type_if_present", "CHECK-TYPE-IF-PRESENT");
            declareMacro("enforce_type_if_present", "ENFORCE-TYPE-IF-PRESENT");
            declareMacro("check_list_type", "CHECK-LIST-TYPE");
            declareMacro("check_list_type_if_present", "CHECK-LIST-TYPE-IF-PRESENT");
            declareMacro("enforce_list_type", "ENFORCE-LIST-TYPE");
            declareMacro("enforce_list_type_if_present", "ENFORCE-LIST-TYPE-IF-PRESENT");
            declareMacro("check_plist_type", "CHECK-PLIST-TYPE");
            declareMacro("enforce_plist_type", "ENFORCE-PLIST-TYPE");
            declareMacro("warn_unless_plist_of_type", "WARN-UNLESS-PLIST-OF-TYPE");
            declareMacro("must_if_present", "MUST-IF-PRESENT");
            declareMacro("nil_or", "NIL-OR");
            declareMacro("swap", "SWAP");
            declareMacro("def_kb_variable", "DEF-KB-VARIABLE");
            declareFunction("register_kb_variable_initialization", "REGISTER-KB-VARIABLE-INITIALIZATION", 2, 0, false);
            declareFunction("initialize_kb_variables", "INITIALIZE-KB-VARIABLES", 0, 0, false);
            declareMacro("defparameter_lazy", "DEFPARAMETER-LAZY");
            declareMacro("defvar_lazy", "DEFVAR-LAZY");
            declareMacro("defglobal_lazy", "DEFGLOBAL-LAZY");
            declareMacro("deflexical_lazy", "DEFLEXICAL-LAZY");
            declareMacro("define_api_obsolete", "DEFINE-API-OBSOLETE");
            declareFunction("register_obsolete_cyc_api_function", "REGISTER-OBSOLETE-CYC-API-FUNCTION", 6, 0, false);
            declareFunction("obsolete_cyc_api_replacements", "OBSOLETE-CYC-API-REPLACEMENTS", 1, 0, false);
            declareFunction("register_obsolete_cyc_api_replacements", "REGISTER-OBSOLETE-CYC-API-REPLACEMENTS", 2, 0, false);
            declareFunction("deregister_obsolete_cyc_api_replacements", "DEREGISTER-OBSOLETE-CYC-API-REPLACEMENTS", 1, 0, false);
            declareFunction("initialization_for_partial_list_results", "INITIALIZATION-FOR-PARTIAL-LIST-RESULTS", 0, 0, false);
            declareFunction("accumulation_for_partial_list_results", "ACCUMULATION-FOR-PARTIAL-LIST-RESULTS", 1, 0, false);
            declareFunction("consolidation_for_partial_list_results", "CONSOLIDATION-FOR-PARTIAL-LIST-RESULTS", 1, 0, false);
            declareFunction("notification_for_partial_list_results", "NOTIFICATION-FOR-PARTIAL-LIST-RESULTS", 3, 0, false);
            declareFunction("final_results_for_partial_list_results", "FINAL-RESULTS-FOR-PARTIAL-LIST-RESULTS", 1, 0, false);
            declareFunction("add_result_to_partial_results_accumulator", "ADD-RESULT-TO-PARTIAL-RESULTS-ACCUMULATOR", 1, 0, false);
            declareMacro("with_partial_results_accumulation", "WITH-PARTIAL-RESULTS-ACCUMULATION");
            declareMacro("with_space_profiling_to_string", "WITH-SPACE-PROFILING-TO-STRING");
            declareMacro("with_sxhash_composite", "WITH-SXHASH-COMPOSITE");
            declareMacro("with_sxhash_composite_fast", "WITH-SXHASH-COMPOSITE-FAST");
            declareMacro("sxhash_composite_update_fast", "SXHASH-COMPOSITE-UPDATE-FAST");
            declareFunction("sxhash_update_state", "SXHASH-UPDATE-STATE", 1, 0, false);
            declareFunction("sxhash_composite_update", "SXHASH-COMPOSITE-UPDATE", 1, 0, false);
            declareFunction("slow_hash_test", "SLOW-HASH-TEST", 0, 1, false);
            declareFunction("fast_hash_test", "FAST-HASH-TEST", 0, 1, false);
            declareMacro("possibly_catch_error_message", "POSSIBLY-CATCH-ERROR-MESSAGE");
            declareMacro("possibly_ccatch", "POSSIBLY-CCATCH");
            declareMacro("run_benchmark_compensating_for_paging", "RUN-BENCHMARK-COMPENSATING-FOR-PAGING");
            declareFunction("benchmark_gc", "BENCHMARK-GC", 0, 0, false);
            declareMacro("without_pretty_printing", "WITHOUT-PRETTY-PRINTING");
            declareMacro("possibly_with_timeout", "POSSIBLY-WITH-TIMEOUT");
            declareMacro("with_retries", "WITH-RETRIES");
        }
        if (SubLFiles.USE_V2) {
            declareFunction("expand_into_check_type", "EXPAND-INTO-CHECK-TYPE", 1, 0, false);
            declareFunction("unquoted_symbol_in_tree_p", "UNQUOTED-SYMBOL-IN-TREE-P", 2, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_utilities_macros_file_Previous() {
        declareMacro("define_api", "DEFINE-API");
        declareMacro("declare_api_function", "DECLARE-API-FUNCTION");
        declareMacro("defmacro_api", "DEFMACRO-API");
        declareMacro("define_api_provisional", "DEFINE-API-PROVISIONAL");
        declareMacro("defmacro_api_provisional", "DEFMACRO-API-PROVISIONAL");
        declareFunction("register_cyc_api_function", "REGISTER-CYC-API-FUNCTION", 5, 0, false);
        declareFunction("register_cyc_api_macro", "REGISTER-CYC-API-MACRO", 3, 0, false);
        declareFunction("api_special_p", "API-SPECIAL-P", 1, 0, false);
        declareFunction("api_special_handler", "API-SPECIAL-HANDLER", 1, 0, false);
        declareFunction("register_api_special", "REGISTER-API-SPECIAL", 2, 0, false);
        declareFunction("api_predefined_function_p", "API-PREDEFINED-FUNCTION-P", 1, 0, false);
        declareFunction("register_api_predefined_function", "REGISTER-API-PREDEFINED-FUNCTION", 1, 0, false);
        declareFunction("unregister_api_predefined_function", "UNREGISTER-API-PREDEFINED-FUNCTION", 1, 0, false);
        declareFunction("api_predefined_host_function_p", "API-PREDEFINED-HOST-FUNCTION-P", 1, 0, false);
        declareFunction("register_api_predefined_host_function", "REGISTER-API-PREDEFINED-HOST-FUNCTION", 1, 0, false);
        declareFunction("unregister_api_predefined_host_function", "UNREGISTER-API-PREDEFINED-HOST-FUNCTION", 1, 0, false);
        declareFunction("api_predefined_macro_p", "API-PREDEFINED-MACRO-P", 1, 0, false);
        declareFunction("register_api_predefined_macro", "REGISTER-API-PREDEFINED-MACRO", 1, 0, false);
        declareFunction("unregister_api_predefined_macro", "UNREGISTER-API-PREDEFINED-MACRO", 1, 0, false);
        declareFunction("api_predefined_host_macro_p", "API-PREDEFINED-HOST-MACRO-P", 1, 0, false);
        declareFunction("register_api_predefined_host_macro", "REGISTER-API-PREDEFINED-HOST-MACRO", 1, 0, false);
        declareFunction("unregister_api_predefined_host_macro", "UNREGISTER-API-PREDEFINED-HOST-MACRO", 1, 0, false);
        declareFunction("cyc_api_symbol_p", "CYC-API-SYMBOL-P", 1, 0, false);
        declareFunction("register_cyc_api_symbol", "REGISTER-CYC-API-SYMBOL", 1, 0, false);
        declareFunction("deregister_cyc_api_symbol", "DEREGISTER-CYC-API-SYMBOL", 1, 0, false);
        declareFunction("cyc_api_args", "CYC-API-ARGS", 1, 0, false);
        declareFunction("register_cyc_api_args", "REGISTER-CYC-API-ARGS", 2, 0, false);
        declareFunction("deregister_cyc_api_args", "DEREGISTER-CYC-API-ARGS", 1, 0, false);
        declareFunction("register_cyc_api_function_documentation", "REGISTER-CYC-API-FUNCTION-DOCUMENTATION", 2, 0, false);
        declareFunction("get_api_arg_types", "GET-API-ARG-TYPES", 1, 0, false);
        declareFunction("register_cyc_api_arg_types", "REGISTER-CYC-API-ARG-TYPES", 2, 0, false);
        declareFunction("deregister_cyc_api_arg_types", "DEREGISTER-CYC-API-ARG-TYPES", 1, 0, false);
        declareFunction("get_api_return_types", "GET-API-RETURN-TYPES", 1, 0, false);
        declareFunction("register_cyc_api_return_types", "REGISTER-CYC-API-RETURN-TYPES", 2, 0, false);
        declareFunction("deregister_cyc_api_return_types", "DEREGISTER-CYC-API-RETURN-TYPES", 1, 0, false);
        declareFunction("parse_api_type_declarations", "PARSE-API-TYPE-DECLARATIONS", 1, 0, false);
        declareFunction("parse_obsolete_api_declarations", "PARSE-OBSOLETE-API-DECLARATIONS", 1, 0, false);
        declareFunction("parse_api_declarations_int", "PARSE-API-DECLARATIONS-INT", 2, 0, false);
        declareFunction("expand_into_enforce_type", "EXPAND-INTO-ENFORCE-TYPE", 1, 0, false);
        declareFunction("validate_return_type", "VALIDATE-RETURN-TYPE", 1, 0, false);
        declareMacro("define_after_adding", "DEFINE-AFTER-ADDING");
        declareMacro("define_after_removing", "DEFINE-AFTER-REMOVING");
        declareMacro("define_rule_after_adding", "DEFINE-RULE-AFTER-ADDING");
        declareMacro("define_rule_after_removing", "DEFINE-RULE-AFTER-REMOVING");
        declareMacro("define_collection_defn", "DEFINE-COLLECTION-DEFN");
        declareMacro("define_evaluation_defn", "DEFINE-EVALUATION-DEFN");
        declareMacro("define_expansion_defn", "DEFINE-EXPANSION-DEFN");
        declareMacro("define_cyc_subl_defn", "DEFINE-CYC-SUBL-DEFN");
        declareMacro("define_kb", "DEFINE-KB");
        declareFunction("kb_function_p", "KB-FUNCTION-P", 1, 0, false);
        declareFunction("register_kb_symbol", "REGISTER-KB-SYMBOL", 1, 0, false);
        declareFunction("deregister_kb_symbol", "DEREGISTER-KB-SYMBOL", 1, 0, false);
        declareFunction("deregister_all_kb_functions", "DEREGISTER-ALL-KB-FUNCTIONS", 0, 0, false);
        declareFunction("all_kb_functions", "ALL-KB-FUNCTIONS", 0, 0, false);
        declareFunction("register_kb_function", "REGISTER-KB-FUNCTION", 1, 0, false);
        declareFunction("deregister_kb_function", "DEREGISTER-KB-FUNCTION", 1, 0, false);
        declareMacro("define_private_funcall", "DEFINE-PRIVATE-FUNCALL");
        declareFunction("note_funcall_helper_function", "NOTE-FUNCALL-HELPER-FUNCTION", 1, 0, false);
        declareFunction("funcall_helper_functionP", "FUNCALL-HELPER-FUNCTION?", 1, 0, false);
        declareFunction("unprovided_argumentP", "UNPROVIDED-ARGUMENT?", 1, 0, false);
        declareMacro("declare_control_parameter", "DECLARE-CONTROL-PARAMETER");
        declareFunction("declare_control_parameter_internal", "DECLARE-CONTROL-PARAMETER-INTERNAL", 4, 0, false);
        declareMacro("until_mapping_finished", "UNTIL-MAPPING-FINISHED");
        declareFunction("mapping_finished", "MAPPING-FINISHED", 0, 0, false);
        declareMacro("until_sbhl_mapping_finished", "UNTIL-SBHL-MAPPING-FINISHED");
        declareFunction("sbhl_mapping_finished", "SBHL-MAPPING-FINISHED", 0, 0, false);
        declareMacro("cfasl_write", "CFASL-WRITE");
        declareMacro("cfasl_read", "CFASL-READ");
        declareMacro("if_lock_idle", "IF-LOCK-IDLE");
        declareMacro("possibly_with_lock_held", "POSSIBLY-WITH-LOCK-HELD");
        declareMacro("defglobal_lock", "DEFGLOBAL-LOCK");
        declareFunction("initialize_global_locks", "INITIALIZE-GLOBAL-LOCKS", 0, 0, false);
        declareFunction("register_global_lock", "REGISTER-GLOBAL-LOCK", 2, 0, false);
        declareFunction("global_lock_p", "GLOBAL-LOCK-P", 1, 0, false);
        declareFunction("global_lock_initialization_form", "GLOBAL-LOCK-INITIALIZATION-FORM", 1, 0, false);
        declareFunction("initialize_global_lock", "INITIALIZE-GLOBAL-LOCK", 1, 0, false);
        declareFunction("initialize_global_lock_internal", "INITIALIZE-GLOBAL-LOCK-INTERNAL", 2, 0, false);
        declareMacro("defparameter_fi", "DEFPARAMETER-FI");
        declareMacro("with_clean_fi_state", "WITH-CLEAN-FI-STATE");
        declareFunction("register_html_state_variable", "REGISTER-HTML-STATE-VARIABLE", 1, 0, false);
        declareMacro("defparameter_html", "DEFPARAMETER-HTML");
        declareMacro("defvar_html", "DEFVAR-HTML");
        declareFunction("register_html_interface_variable", "REGISTER-HTML-INTERFACE-VARIABLE", 1, 0, false);
        declareMacro("defparameter_html_interface", "DEFPARAMETER-HTML-INTERFACE");
        declareMacro("defvar_html_interface", "DEFVAR-HTML-INTERFACE");
        declareMacro("def_state_variable", "DEF-STATE-VARIABLE");
        declareFunction("note_state_variable_documentation", "NOTE-STATE-VARIABLE-DOCUMENTATION", 2, 0, false);
        declareFunction("define_operator_for_variable_type", "DEFINE-OPERATOR-FOR-VARIABLE-TYPE", 1, 0, false);
        declareFunction("documentation", "DOCUMENTATION", 1, 1, false);
        declareMacro("defvar_gt", "DEFVAR-GT");
        declareMacro("defvar_at", "DEFVAR-AT");
        declareMacro("defvar_defn", "DEFVAR-DEFN");
        declareMacro("defvar_kbi", "DEFVAR-KBI");
        declareMacro("defvar_kbp", "DEFVAR-KBP");
        declareMacro("with_kbp_defaults", "WITH-KBP-DEFAULTS");
        declareMacro("progn_cyc_api", "PROGN-CYC-API");
        declareMacro("with_forward_inference_environment", "WITH-FORWARD-INFERENCE-ENVIRONMENT");
        declareMacro("with_clean_forward_inference_environment", "WITH-CLEAN-FORWARD-INFERENCE-ENVIRONMENT");
        declareMacro("with_possibly_clean_forward_inference_environment", "WITH-POSSIBLY-CLEAN-FORWARD-INFERENCE-ENVIRONMENT");
        declareFunction("possibly_get_forward_inference_environment", "POSSIBLY-GET-FORWARD-INFERENCE-ENVIRONMENT", 0, 0, false);
        declareMacro("with_clean_forward_problem_store_environment", "WITH-CLEAN-FORWARD-PROBLEM-STORE-ENVIRONMENT");
        declareMacro("with_normal_forward_inference_parameters", "WITH-NORMAL-FORWARD-INFERENCE-PARAMETERS");
        declareMacro("with_normal_forward_inference", "WITH-NORMAL-FORWARD-INFERENCE");
        declareFunction("within_normal_forward_inferenceP", "WITHIN-NORMAL-FORWARD-INFERENCE?", 0, 0, false);
        declareMacro("throw_unevaluatable_on_error", "THROW-UNEVALUATABLE-ON-ERROR");
        declareFunction("tracing_at_level", "TRACING-AT-LEVEL", 2, 0, false);
        declareMacro("if_tracing", "IF-TRACING");
        declareMacro("with_static_structure_resourcing", "WITH-STATIC-STRUCTURE-RESOURCING");
        declareMacro("possibly_with_static_structure_resourcing", "POSSIBLY-WITH-STATIC-STRUCTURE-RESOURCING");
        declareMacro("define_structure_resource", "DEFINE-STRUCTURE-RESOURCE");
        declareMacro("with_readtime_eval_disabled", "WITH-READTIME-EVAL-DISABLED");
        declareMacro("noting_progress", "NOTING-PROGRESS");
        declareMacro("noting_progress_delayed", "NOTING-PROGRESS-DELAYED");
        declareFunction("noting_progress_preamble", "NOTING-PROGRESS-PREAMBLE", 1, 0, false);
        declareFunction("noting_progress_postamble", "NOTING-PROGRESS-POSTAMBLE", 0, 0, false);
        declareFunction("note_progress", "NOTE-PROGRESS", 0, 0, false);
        declareMacro("noting_activity", "NOTING-ACTIVITY");
        declareMacro("noting_percent_progress", "NOTING-PERCENT-PROGRESS");
        declareMacro("noting_percent_progress_delayed", "NOTING-PERCENT-PROGRESS-DELAYED");
        declareFunction("noting_percent_progress_preamble", "NOTING-PERCENT-PROGRESS-PREAMBLE", 1, 0, false);
        declareFunction("noting_percent_progress_postamble", "NOTING-PERCENT-PROGRESS-POSTAMBLE", 0, 0, false);
        declareFunction("note_percent_progress", "NOTE-PERCENT-PROGRESS", 2, 0, false);
        declareFunction("print_progress_percent", "PRINT-PROGRESS-PERCENT", 1, 0, false);
        declareFunction("print_2_digit_nonnegative_integer", "PRINT-2-DIGIT-NONNEGATIVE-INTEGER", 2, 0, false);
        declareFunction("possibly_note_percent_progress_prediction", "POSSIBLY-NOTE-PERCENT-PROGRESS-PREDICTION", 3, 1, false);
        declareFunction("compute_percent_progress", "COMPUTE-PERCENT-PROGRESS", 2, 0, false);
        declareFunction("progress", "PROGRESS", 0, 0, false);
        declareMacro("progress_cdotimes", "PROGRESS-CDOTIMES");
        declareMacro("progress_csome", "PROGRESS-CSOME");
        declareMacro("progress_cdolist", "PROGRESS-CDOLIST");
        declareMacro("possibly_progress_cdolist", "POSSIBLY-PROGRESS-CDOLIST");
        declareMacro("progress_cdohash", "PROGRESS-CDOHASH");
        declareMacro("progress_do_set", "PROGRESS-DO-SET");
        declareMacro("noting_elapsed_time", "NOTING-ELAPSED-TIME");
        declareFunction("noting_elapsed_time_preamble", "NOTING-ELAPSED-TIME-PREAMBLE", 1, 0, false);
        declareFunction("noting_elapsed_time_postamble", "NOTING-ELAPSED-TIME-POSTAMBLE", 2, 0, false);
        declareMacro("with_cyc_server_handling", "WITH-CYC-SERVER-HANDLING");
        declareMacro("with_cyc_io_syntax", "WITH-CYC-IO-SYNTAX");
        declareFunction("with_cyc_io_syntax_internal", "WITH-CYC-IO-SYNTAX-INTERNAL", 1, 0, false);
        declareMacro("with_sublisp_runtime_assumptions", "WITH-SUBLISP-RUNTIME-ASSUMPTIONS");
        declareMacro("with_the_cyclist", "WITH-THE-CYCLIST");
        declareMacro("with_different_cyclist", "WITH-DIFFERENT-CYCLIST");
        declareMacro("do_bindings", "DO-BINDINGS");
        declareFunction("do_bindings_var_specs", "DO-BINDINGS-VAR-SPECS", 2, 0, false);
        declareMacro("fast_singleton_macro_p", "FAST-SINGLETON-MACRO-P");
        declareFunction("pluralityP", "PLURALITY?", 1, 0, false);
        declareMacro("fast_plurality_macro_p", "FAST-PLURALITY-MACRO-P");
        declareMacro("cdosublists", "CDOSUBLISTS");
        declareMacro("cdolist_and_sublists", "CDOLIST-AND-SUBLISTS");
        declareMacro("cdolist_and_sublists_carefully", "CDOLIST-AND-SUBLISTS-CAREFULLY");
        declareMacro("cdo_possibly_dotted_list", "CDO-POSSIBLY-DOTTED-LIST");
        declareMacro("cdolist_if", "CDOLIST-IF");
        declareMacro("cdosublists_if", "CDOSUBLISTS-IF");
        declareMacro("cdolist_if_not", "CDOLIST-IF-NOT");
        declareMacro("cdosublists_if_not", "CDOSUBLISTS-IF-NOT");
        declareMacro("cdo2lists", "CDO2LISTS");
        declareMacro("cdotree", "CDOTREE");
        declareMacro("cdotree_conses", "CDOTREE-CONSES");
        declareMacro("cdoplist", "CDOPLIST");
        declareFunction("compositize_function_call", "COMPOSITIZE-FUNCTION-CALL", 2, 1, false);
        declareFunction("simplify_car_and_cdr_path", "SIMPLIFY-CAR-AND-CDR-PATH", 1, 0, false);
        declareFunction("map_symbols_to_accessors", "MAP-SYMBOLS-TO-ACCESSORS", 3, 0, false);
        declareMacro("cdestructuring_setq", "CDESTRUCTURING-SETQ");
        declareFunction("fast_funcall_no_value_check_args", "FAST-FUNCALL-NO-VALUE-CHECK-ARGS", 3, 0, false);
        declareMacro("fast_funcall_no_value", "FAST-FUNCALL-NO-VALUE");
        declareMacro("fast_funcall_setq", "FAST-FUNCALL-SETQ");
        declareFunction("generate_parallel_var_list", "GENERATE-PARALLEL-VAR-LIST", 1, 0, false);
        declareFunction("generate_multiple_csetq", "GENERATE-MULTIPLE-CSETQ", 2, 0, false);
        declareMacro("fast_funcall_multiple_value_bind", "FAST-FUNCALL-MULTIPLE-VALUE-BIND");
        declareMacro("fast_funcall_multiple_value_setq", "FAST-FUNCALL-MULTIPLE-VALUE-SETQ");
        declareFunction("expand_destructuring_predication_generator", "EXPAND-DESTRUCTURING-PREDICATION-GENERATOR", 2, 0, false);
        declareMacro("funcall_shortcut", "FUNCALL-SHORTCUT");
        declareMacro("destructuring_predication_generator", "DESTRUCTURING-PREDICATION-GENERATOR");
        declareFunction("symbol_in_tree_p", "SYMBOL-IN-TREE-P", 2, 0, false);
        // declareFunction("unquoted_symbol_in_tree_p", "UNQUOTED-SYMBOL-IN-TREE-P", 2, 0, false);
        declareFunction("generate_instance_variable_bindings_for_structure_slots", "GENERATE-INSTANCE-VARIABLE-BINDINGS-FOR-STRUCTURE-SLOTS", 5, 1, false);
        declareMacro("cdolist_collecting", "CDOLIST-COLLECTING");
        declareMacro("cdolist_appending", "CDOLIST-APPENDING");
        declareFunction("expand_define_list_element_predicator", "EXPAND-DEFINE-LIST-ELEMENT-PREDICATOR", 5, 0, false);
        declareMacro("define_api_list_element_predicator", "DEFINE-API-LIST-ELEMENT-PREDICATOR");
        declareMacro("define_public_list_element_predicator", "DEFINE-PUBLIC-LIST-ELEMENT-PREDICATOR");
        declareMacro("define_protected_list_element_predicator", "DEFINE-PROTECTED-LIST-ELEMENT-PREDICATOR");
        declareMacro("define_private_list_element_predicator", "DEFINE-PRIVATE-LIST-ELEMENT-PREDICATOR");
        declareFunction("argnames_from_arglist", "ARGNAMES-FROM-ARGLIST", 1, 0, false);
        declareFunction("car_if_list", "CAR-IF-LIST", 1, 0, false);
        declareFunction("car_if_list_or_nil", "CAR-IF-LIST-OR-NIL", 1, 0, false);
        declareFunction("expand_fcond", "EXPAND-FCOND", 1, 0, false);
        declareMacro("fcond", "FCOND");
        declareFunction("check_p_range_case_clauses", "CHECK-P-RANGE-CASE-CLAUSES", 1, 0, false);
        declareFunction("utilities_macros_car_eq", "UTILITIES-MACROS-CAR-EQ", 2, 0, false);
        declareFunction("expand_p_range_case", "EXPAND-P-RANGE-CASE", 2, 0, false);
        declareMacro("p_range_case", "P-RANGE-CASE");
        declareFunction("default_code_branch_error_clause", "DEFAULT-CODE-BRANCH-ERROR-CLAUSE", 1, 0, false);
        declareMacro("code_branch_by_version", "CODE-BRANCH-BY-VERSION");
        declareMacro("code_branch_by_version_numbers", "CODE-BRANCH-BY-VERSION-NUMBERS");
        declareFunction("sub_kb_loaded_root_string", "SUB-KB-LOADED-ROOT-STRING", 1, 0, false);
        declareFunction("sub_kb_loaded_p_symbol", "SUB-KB-LOADED-P-SYMBOL", 1, 0, false);
        declareFunction("sub_kb_set_symbol", "SUB-KB-SET-SYMBOL", 1, 0, false);
        declareFunction("sub_kb_unset_symbol", "SUB-KB-UNSET-SYMBOL", 1, 0, false);
        declareMacro("declare_kb_feature", "DECLARE-KB-FEATURE");
        declareFunction("expand_format_to_string", "EXPAND-FORMAT-TO-STRING", 1, 0, false);
        declareMacro("format_to_string", "FORMAT-TO-STRING");
        declareMacro("time", "TIME");
        declareMacro("with_process_resource_tracking_in_seconds", "WITH-PROCESS-RESOURCE-TRACKING-IN-SECONDS");
        declareFunction("convert_process_resource_tracking_timing_info_to_seconds", "CONVERT-PROCESS-RESOURCE-TRACKING-TIMING-INFO-TO-SECONDS", 1, 0, false);
        declareFunction("nadd_clock_time_to_process_resource_timing_info", "NADD-CLOCK-TIME-TO-PROCESS-RESOURCE-TIMING-INFO", 2, 0, false);
        declareFunction("process_resource_tracking_user_time", "PROCESS-RESOURCE-TRACKING-USER-TIME", 1, 0, false);
        declareFunction("process_resource_tracking_system_time", "PROCESS-RESOURCE-TRACKING-SYSTEM-TIME", 1, 0, false);
        declareFunction("process_resource_tracking_wall_clock_time", "PROCESS-RESOURCE-TRACKING-WALL-CLOCK-TIME", 1, 0, false);
        declareMacro("timing_info", "TIMING-INFO");
        declareMacro("user_time", "USER-TIME");
        declareMacro("user_time_in_seconds", "USER-TIME-IN-SECONDS");
        declareMacro("system_time", "SYSTEM-TIME");
        declareMacro("system_time_in_seconds", "SYSTEM-TIME-IN-SECONDS");
        declareMacro("check_type_if_present", "CHECK-TYPE-IF-PRESENT");
        declareMacro("enforce_type_if_present", "ENFORCE-TYPE-IF-PRESENT");
        declareMacro("check_list_type", "CHECK-LIST-TYPE");
        declareMacro("check_list_type_if_present", "CHECK-LIST-TYPE-IF-PRESENT");
        declareMacro("enforce_list_type", "ENFORCE-LIST-TYPE");
        declareMacro("enforce_list_type_if_present", "ENFORCE-LIST-TYPE-IF-PRESENT");
        declareMacro("check_plist_type", "CHECK-PLIST-TYPE");
        declareMacro("enforce_plist_type", "ENFORCE-PLIST-TYPE");
        declareMacro("warn_unless_plist_of_type", "WARN-UNLESS-PLIST-OF-TYPE");
        declareMacro("must_if_present", "MUST-IF-PRESENT");
        declareMacro("nil_or", "NIL-OR");
        declareMacro("swap", "SWAP");
        declareMacro("def_kb_variable", "DEF-KB-VARIABLE");
        declareFunction("register_kb_variable_initialization", "REGISTER-KB-VARIABLE-INITIALIZATION", 2, 0, false);
        declareFunction("initialize_kb_variables", "INITIALIZE-KB-VARIABLES", 0, 0, false);
        declareMacro("defparameter_lazy", "DEFPARAMETER-LAZY");
        declareMacro("defvar_lazy", "DEFVAR-LAZY");
        declareMacro("defglobal_lazy", "DEFGLOBAL-LAZY");
        declareMacro("deflexical_lazy", "DEFLEXICAL-LAZY");
        declareMacro("define_api_obsolete", "DEFINE-API-OBSOLETE");
        declareFunction("register_obsolete_cyc_api_function", "REGISTER-OBSOLETE-CYC-API-FUNCTION", 6, 0, false);
        declareFunction("obsolete_cyc_api_replacements", "OBSOLETE-CYC-API-REPLACEMENTS", 1, 0, false);
        declareFunction("register_obsolete_cyc_api_replacements", "REGISTER-OBSOLETE-CYC-API-REPLACEMENTS", 2, 0, false);
        declareFunction("deregister_obsolete_cyc_api_replacements", "DEREGISTER-OBSOLETE-CYC-API-REPLACEMENTS", 1, 0, false);
        declareFunction("initialization_for_partial_list_results", "INITIALIZATION-FOR-PARTIAL-LIST-RESULTS", 0, 0, false);
        declareFunction("accumulation_for_partial_list_results", "ACCUMULATION-FOR-PARTIAL-LIST-RESULTS", 1, 0, false);
        declareFunction("consolidation_for_partial_list_results", "CONSOLIDATION-FOR-PARTIAL-LIST-RESULTS", 1, 0, false);
        declareFunction("notification_for_partial_list_results", "NOTIFICATION-FOR-PARTIAL-LIST-RESULTS", 3, 0, false);
        declareFunction("final_results_for_partial_list_results", "FINAL-RESULTS-FOR-PARTIAL-LIST-RESULTS", 1, 0, false);
        declareFunction("add_result_to_partial_results_accumulator", "ADD-RESULT-TO-PARTIAL-RESULTS-ACCUMULATOR", 1, 0, false);
        declareMacro("with_partial_results_accumulation", "WITH-PARTIAL-RESULTS-ACCUMULATION");
        declareMacro("with_space_profiling_to_string", "WITH-SPACE-PROFILING-TO-STRING");
        declareMacro("with_sxhash_composite", "WITH-SXHASH-COMPOSITE");
        declareMacro("with_sxhash_composite_fast", "WITH-SXHASH-COMPOSITE-FAST");
        declareMacro("sxhash_composite_update_fast", "SXHASH-COMPOSITE-UPDATE-FAST");
        declareFunction("sxhash_update_state", "SXHASH-UPDATE-STATE", 1, 0, false);
        declareFunction("sxhash_composite_update", "SXHASH-COMPOSITE-UPDATE", 1, 0, false);
        declareFunction("slow_hash_test", "SLOW-HASH-TEST", 0, 1, false);
        declareFunction("fast_hash_test", "FAST-HASH-TEST", 0, 1, false);
        declareMacro("possibly_catch_error_message", "POSSIBLY-CATCH-ERROR-MESSAGE");
        declareMacro("possibly_ccatch", "POSSIBLY-CCATCH");
        declareMacro("run_benchmark_compensating_for_paging", "RUN-BENCHMARK-COMPENSATING-FOR-PAGING");
        declareFunction("benchmark_gc", "BENCHMARK-GC", 0, 0, false);
        declareMacro("without_pretty_printing", "WITHOUT-PRETTY-PRINTING");
        declareMacro("possibly_with_timeout", "POSSIBLY-WITH-TIMEOUT");
        declareMacro("with_retries", "WITH-RETRIES");
        return NIL;
    }

    public static final SubLObject init_utilities_macros_file_alt() {
        deflexical("*API-SPECIAL-TABLE*", NIL != boundp($api_special_table$) ? ((SubLObject) ($api_special_table$.getGlobalValue())) : make_hash_table(TEN_INTEGER, symbol_function(EQ), UNPROVIDED));
        deflexical("*API-PREDEFINED-FUNCTION-TABLE*", NIL != boundp($api_predefined_function_table$) ? ((SubLObject) ($api_predefined_function_table$.getGlobalValue())) : make_hash_table($int$1000, symbol_function(EQ), UNPROVIDED));
        deflexical("*API-PREDEFINED-HOST-FUNCTION-TABLE*", NIL != boundp($api_predefined_host_function_table$) ? ((SubLObject) ($api_predefined_host_function_table$.getGlobalValue())) : make_hash_table($int$100, symbol_function(EQ), UNPROVIDED));
        deflexical("*API-PREDEFINED-MACRO-TABLE*", NIL != boundp($api_predefined_macro_table$) ? ((SubLObject) ($api_predefined_macro_table$.getGlobalValue())) : make_hash_table($int$100, symbol_function(EQ), UNPROVIDED));
        deflexical("*API-PREDEFINED-HOST-MACRO-TABLE*", NIL != boundp($api_predefined_host_macro_table$) ? ((SubLObject) ($api_predefined_host_macro_table$.getGlobalValue())) : make_hash_table(TEN_INTEGER, symbol_function(EQ), UNPROVIDED));
        deflexical("*API-SYMBOLS*", NIL != boundp($api_symbols$) ? ((SubLObject) ($api_symbols$.getGlobalValue())) : NIL);
        deflexical("*API-TYPES*", NIL != boundp($api_types$) ? ((SubLObject) ($api_types$.getGlobalValue())) : NIL);
        deflexical("*KB-FUNCTION-TABLE*", NIL != boundp($kb_function_table$) ? ((SubLObject) ($kb_function_table$.getGlobalValue())) : make_hash_table($int$400, symbol_function(EQ), UNPROVIDED));
        deflexical("*FUNCALL-HELPER-PROPERTY*", NIL != boundp($funcall_helper_property$) ? ((SubLObject) ($funcall_helper_property$.getGlobalValue())) : $FUNCALL_HELPER);
        deflexical("*UNPROVIDED*", NIL != boundp($unprovided$) ? ((SubLObject) ($unprovided$.getGlobalValue())) : make_symbol($$$UNPROVIDED));
        defparameter("*CFASL-STREAM*", NIL);
        deflexical("*GLOBAL-LOCKS*", NIL != boundp($global_locks$) ? ((SubLObject) ($global_locks$.getGlobalValue())) : NIL);
        deflexical("*FI-STATE-VARIABLES*", NIL != boundp($fi_state_variables$) ? ((SubLObject) ($fi_state_variables$.getGlobalValue())) : NIL);
        deflexical("*HTML-STATE-VARIABLES*", NIL != boundp($html_state_variables$) ? ((SubLObject) ($html_state_variables$.getGlobalValue())) : NIL);
        deflexical("*HTML-INTERFACE-VARIABLES*", NIL != boundp($html_interface_variables$) ? ((SubLObject) ($html_interface_variables$.getGlobalValue())) : NIL);
        deflexical("*GT-STATE-VARIABLES*", NIL != boundp($gt_state_variables$) ? ((SubLObject) ($gt_state_variables$.getGlobalValue())) : NIL);
        deflexical("*AT-STATE-VARIABLES*", NIL != boundp($at_state_variables$) ? ((SubLObject) ($at_state_variables$.getGlobalValue())) : NIL);
        deflexical("*DEFN-STATE-VARIABLES*", NIL != boundp($defn_state_variables$) ? ((SubLObject) ($defn_state_variables$.getGlobalValue())) : NIL);
        deflexical("*KBI-STATE-VARIABLES*", NIL != boundp($kbi_state_variables$) ? ((SubLObject) ($kbi_state_variables$.getGlobalValue())) : NIL);
        deflexical("*KBP-STATE-VARIABLES*", NIL != boundp($kbp_state_variables$) ? ((SubLObject) ($kbp_state_variables$.getGlobalValue())) : NIL);
        defparameter("*CURRENT-FORWARD-PROBLEM-STORE*", NIL);
        defparameter("*TRACING-LEVEL*", NIL);
        deflexical("*STRUCTURE-RESOURCING-ENABLED*", NIL);
        defparameter("*STRUCTURE-RESOURCING-MAKE-STATIC*", NIL);
        defvar("*SILENT-PROGRESS?*", NIL);
        defparameter("*NOTING-PROGRESS-START-TIME*", NIL);
        defvar("*LAST-PERCENT-PROGRESS-INDEX*", NIL);
        defparameter("*LAST-PERCENT-PROGRESS-PREDICTION*", NIL);
        defvar("*WITHIN-NOTING-PERCENT-PROGRESS*", NIL);
        defvar("*PERCENT-PROGRESS-START-TIME*", NIL);
        defparameter("*PROGRESS-NOTE*", $str_alt245$);
        defparameter("*PROGRESS-START-TIME*", get_universal_time());
        defparameter("*PROGRESS-TOTAL*", ONE_INTEGER);
        defparameter("*PROGRESS-SOFAR*", ZERO_INTEGER);
        defparameter("*UTIL-VAR-ERROR-FORMAT-STRING*", $str_alt305$_S___var__S_is_not_a_symbol_);
        defparameter("*UTIL-FUNC-ERROR-FORMAT-STRING*", $str_alt306$_S___function__S_is_not_a_symbol_);
        defparameter("*UTIL-SEARCH-TYPE-ERROR-FORMAT-STRING*", $str_alt307$_S___search_type__S_is_not_one_of);
        deflexical("*PROCESS-RESOURCE-TRACKING-100S-OF-NANOSECONDS-PROPERTIES*", $list_alt436);
        deflexical("*KB-VAR-INITIALIZATIONS*", NIL != boundp($kb_var_initializations$) ? ((SubLObject) ($kb_var_initializations$.getGlobalValue())) : NIL);
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
        deflexical("*SXHASH-UPDATE-STATE-VECTOR*", $ic538);
        defparameter("*SXHASH-COMPOSITE-STATE*", NIL);
        defparameter("*SXHASH-COMPOSITE-HASH*", NIL);
        return NIL;
    }

    public static SubLObject init_utilities_macros_file() {
        if (SubLFiles.USE_V1) {
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
        }
        if (SubLFiles.USE_V2) {
            deflexical("*API-SPECIAL-TABLE*", NIL != boundp($api_special_table$) ? ((SubLObject) ($api_special_table$.getGlobalValue())) : make_hash_table(TEN_INTEGER, symbol_function(EQ), UNPROVIDED));
            deflexical("*API-PREDEFINED-FUNCTION-TABLE*", NIL != boundp($api_predefined_function_table$) ? ((SubLObject) ($api_predefined_function_table$.getGlobalValue())) : make_hash_table($int$1000, symbol_function(EQ), UNPROVIDED));
            deflexical("*API-PREDEFINED-HOST-FUNCTION-TABLE*", NIL != boundp($api_predefined_host_function_table$) ? ((SubLObject) ($api_predefined_host_function_table$.getGlobalValue())) : make_hash_table($int$100, symbol_function(EQ), UNPROVIDED));
            deflexical("*API-PREDEFINED-MACRO-TABLE*", NIL != boundp($api_predefined_macro_table$) ? ((SubLObject) ($api_predefined_macro_table$.getGlobalValue())) : make_hash_table($int$100, symbol_function(EQ), UNPROVIDED));
            deflexical("*API-PREDEFINED-HOST-MACRO-TABLE*", NIL != boundp($api_predefined_host_macro_table$) ? ((SubLObject) ($api_predefined_host_macro_table$.getGlobalValue())) : make_hash_table(TEN_INTEGER, symbol_function(EQ), UNPROVIDED));
            deflexical("*API-SYMBOLS*", NIL != boundp($api_symbols$) ? ((SubLObject) ($api_symbols$.getGlobalValue())) : NIL);
            deflexical("*API-TYPES*", NIL != boundp($api_types$) ? ((SubLObject) ($api_types$.getGlobalValue())) : NIL);
            deflexical("*KB-FUNCTION-TABLE*", NIL != boundp($kb_function_table$) ? ((SubLObject) ($kb_function_table$.getGlobalValue())) : make_hash_table($int$400, symbol_function(EQ), UNPROVIDED));
            deflexical("*FUNCALL-HELPER-PROPERTY*", NIL != boundp($funcall_helper_property$) ? ((SubLObject) ($funcall_helper_property$.getGlobalValue())) : $FUNCALL_HELPER);
            deflexical("*UNPROVIDED*", NIL != boundp($unprovided$) ? ((SubLObject) ($unprovided$.getGlobalValue())) : make_symbol($$$UNPROVIDED));
            deflexical("*GLOBAL-LOCKS*", NIL != boundp($global_locks$) ? ((SubLObject) ($global_locks$.getGlobalValue())) : NIL);
            deflexical("*FI-STATE-VARIABLES*", NIL != boundp($fi_state_variables$) ? ((SubLObject) ($fi_state_variables$.getGlobalValue())) : NIL);
            deflexical("*HTML-STATE-VARIABLES*", NIL != boundp($html_state_variables$) ? ((SubLObject) ($html_state_variables$.getGlobalValue())) : NIL);
            deflexical("*HTML-INTERFACE-VARIABLES*", NIL != boundp($html_interface_variables$) ? ((SubLObject) ($html_interface_variables$.getGlobalValue())) : NIL);
            deflexical("*GT-STATE-VARIABLES*", NIL != boundp($gt_state_variables$) ? ((SubLObject) ($gt_state_variables$.getGlobalValue())) : NIL);
            deflexical("*AT-STATE-VARIABLES*", NIL != boundp($at_state_variables$) ? ((SubLObject) ($at_state_variables$.getGlobalValue())) : NIL);
            deflexical("*DEFN-STATE-VARIABLES*", NIL != boundp($defn_state_variables$) ? ((SubLObject) ($defn_state_variables$.getGlobalValue())) : NIL);
            deflexical("*KBI-STATE-VARIABLES*", NIL != boundp($kbi_state_variables$) ? ((SubLObject) ($kbi_state_variables$.getGlobalValue())) : NIL);
            deflexical("*KBP-STATE-VARIABLES*", NIL != boundp($kbp_state_variables$) ? ((SubLObject) ($kbp_state_variables$.getGlobalValue())) : NIL);
            defparameter("*PROGRESS-NOTE*", $str_alt245$);
            defparameter("*UTIL-VAR-ERROR-FORMAT-STRING*", $str_alt305$_S___var__S_is_not_a_symbol_);
            defparameter("*UTIL-FUNC-ERROR-FORMAT-STRING*", $str_alt306$_S___function__S_is_not_a_symbol_);
            defparameter("*UTIL-SEARCH-TYPE-ERROR-FORMAT-STRING*", $str_alt307$_S___search_type__S_is_not_one_of);
            deflexical("*PROCESS-RESOURCE-TRACKING-100S-OF-NANOSECONDS-PROPERTIES*", $list_alt436);
            deflexical("*KB-VAR-INITIALIZATIONS*", NIL != boundp($kb_var_initializations$) ? ((SubLObject) ($kb_var_initializations$.getGlobalValue())) : NIL);
            deflexical("*SXHASH-UPDATE-STATE-VECTOR*", $ic538);
        }
        return NIL;
    }

    public static SubLObject init_utilities_macros_file_Previous() {
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

    public static final SubLObject setup_utilities_macros_file_alt() {
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
        declare_defglobal($kbi_state_variables$);
        declare_defglobal($kbp_state_variables$);
        register_macro_helper(NOTING_PROGRESS_PREAMBLE, NOTING_PROGRESS);
        register_macro_helper(NOTING_PROGRESS_POSTAMBLE, NOTING_PROGRESS);
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

    public static SubLObject setup_utilities_macros_file() {
        if (SubLFiles.USE_V1) {
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
        }
        if (SubLFiles.USE_V2) {
            declare_defglobal($kbi_state_variables$);
        }
        return NIL;
    }

    public static SubLObject setup_utilities_macros_file_Previous() {
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

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeSymbol("NAME"), makeSymbol("ARGLIST"), makeSymbol("DOCUMENTATION-STRING"), makeSymbol("TYPE-DECLARATIONS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt7 = list(makeSymbol("NAME"), makeSymbol("ARGLIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt8 = list(makeSymbol("DOCUMENTATION-STRING"), makeSymbol("TYPE-DECLARATIONS"));

    static private final SubLList $list_alt9 = list(makeSymbol("NAME"), makeSymbol("PATTERN"), makeSymbol("DOCUMENTATION-STRING"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt13 = list(makeSymbol("NAME"), makeSymbol("PATTERN"), makeSymbol("DOCUMENTATION-STRING"), makeSymbol("TYPE-DECLARATIONS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt16$Registering__A_as_special_even_th = makeString("Registering ~A as special even though it's already predefined!");

    static private final SubLString $str_alt19$Cannot_register__A_as_API_predefi = makeString("Cannot register ~A as API predefined function as it's already special!");

    static private final SubLString $str_alt22$Cannot_register__A_as_API_host_fu = makeString("Cannot register ~A as API host function as it's already special!");

    static private final SubLString $str_alt24$Cannot_register__A_as_API_macro_a = makeString("Cannot register ~A as API macro as it's already special!");

    static private final SubLString $str_alt26$Cannot_register__A_as_API_predefi = makeString("Cannot register ~A as API predefined host macro as it's already special!");

    static private final SubLString $str_alt35$_replacements_not_allowed_in_the_ = makeString(":replacements not allowed in the declaration of Cyc API function");

    static private final SubLString $str_alt40$Invalid_argument_type_expression_ = makeString("Invalid argument-type expression ~S");

    static private final SubLString $str_alt42$_S_return_type_expression_not_lis = makeString("~S return type expression not list length 2.");

    static private final SubLList $list_alt43 = list(makeSymbol("LIST"), makeSymbol("NIL-OR"));

    static private final SubLString $str_alt44$_S_complex_return_type_expression = makeString("~S complex return type expression not of form (nil-or X) or (list X).");

    static private final SubLList $list_alt52 = list(makeSymbol("NAME"), makeSymbol("PATTERN"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt55 = list(makeSymbol("FUNCTION-SYMBOL"), makeSymbol("BASIS-FUNCTION"));

    static private final SubLList $list_alt56 = list(makeSymbol("OBJECT"));

    static private final SubLList $list_alt57 = list(makeSymbol("SUBL-ESCAPE-P"), makeSymbol("OBJECT"));

    static private final SubLList $list_alt59 = list(list(makeSymbol("SUBL-ESCAPE-SUBL"), makeSymbol("OBJECT")));

    static private final SubLList $list_alt74 = list(makeSymbol("VARIABLE"), makeSymbol("FANCY-NAME"), makeSymbol("DESCRIPTION"), makeSymbol("SETTINGS-SPEC"));

    static private final SubLList $list_alt82 = list(makeSymbol("OBJ"));

    static private final SubLList $list_alt84 = list(makeSymbol("*CFASL-STREAM*"));

    static private final SubLList $list_alt85 = list(makeSymbol("READ-BYTE"), makeSymbol("*CFASL-STREAM*"), NIL, NIL);

    static private final SubLList $list_alt86 = list(makeSymbol("LOCK"), makeSymbol("ACTION"), makeSymbol("&OPTIONAL"), makeSymbol("ELSE-ACTION"));

    static private final SubLSymbol $sym87$LOCK_VAR = makeUninternedSymbol("LOCK-VAR");

    static private final SubLList $list_alt92 = list(makeSymbol("LOCK"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt93 = list(makeSymbol("VARIABLE"), makeSymbol("NAME"), makeSymbol("&KEY"), makeSymbol("VACCESS"), makeSymbol("DOCUMENTATION"));

    static private final SubLList $list_alt94 = list(makeKeyword("VACCESS"), makeKeyword("DOCUMENTATION"));

    static private final SubLList $list_alt103 = cons(makeSymbol("GLOBAL"), makeSymbol("NAME"));

    static private final SubLList $list_alt111 = list(makeSymbol("VARIABLE"), makeSymbol("&OPTIONAL"), makeSymbol("INITIALIZATION"), makeSymbol("DOCUMENTATION"));

    static private final SubLList $list_alt114 = list(makeSymbol("*FI-STATE-VARIABLES*"));

    static private final SubLList $list_alt116 = list(makeSymbol("MAKE-LIST"), list(makeSymbol("LENGTH"), makeSymbol("*FI-STATE-VARIABLES*")), NIL);

    static private final SubLList $list_alt123 = list(makeSymbol("VARIABLE"), makeSymbol("STATE-VARIABLES"), makeSymbol("INITIALIZATION"), makeSymbol("DOCUMENTATION"), makeSymbol("TYPE"));

    static private final SubLString $str_alt141$unknown_variable_type__s__ = makeString("unknown variable type ~s~%");

    static private final SubLList $list_alt149 = list(makeSymbol("VARIABLE"), makeSymbol("&OPTIONAL"), makeSymbol("INITIALIZATION"), makeSymbol("DOCUMENTATION"), list(makeSymbol("TYPE"), makeKeyword("PARAMETER")));

    static private final SubLList $list_alt153 = list(makeSymbol("VARIABLE"), makeSymbol("&OPTIONAL"), makeSymbol("INITIALIZATION"), makeSymbol("DOCUMENTATION"), list(makeSymbol("TYPE"), makeKeyword("PARAMETER-PROTECTECD")));

    static private final SubLList $list_alt155 = list(list(makeSymbol("*NODES-ACCESSOR-FN*"), list(makeSymbol("FIF"), list(makeSymbol("FUNCTION-SPEC-P"), makeSymbol("*NODES-ACCESSOR-FN*")), makeSymbol("*NODES-ACCESSOR-FN*"), list(makeSymbol("FUNCTION"), makeSymbol("ALL-ASSERTION-TERMS")))), list(makeSymbol("*PATH-LINK-OP*"), list(makeSymbol("FIF"), list(makeSymbol("FUNCTION-SPEC-P"), makeSymbol("*PATH-LINK-OP*")), makeSymbol("*PATH-LINK-OP*"), list(makeSymbol("FUNCTION"), makeSymbol("DEFAULT-LINK-OP")))), list(makeSymbol("*PATH-NODE-OP*"), list(makeSymbol("FIF"), list(makeSymbol("FUNCTION-SPEC-P"), makeSymbol("*PATH-NODE-OP*")), makeSymbol("*PATH-NODE-OP*"), list(makeSymbol("FUNCTION"), makeSymbol("DEFAULT-NODE-OP")))), list(makeSymbol("*RELEVANT-LINK?*"), list(makeSymbol("FIF"), list(makeSymbol("FUNCTION-SPEC-P"), makeSymbol("*RELEVANT-LINK?*")), makeSymbol("*RELEVANT-LINK?*"), list(makeSymbol("FUNCTION"), makeSymbol("DEFAULT-RELEVANT-LINK?")))), list(makeSymbol("*RELEVANT-NODE?*"), list(makeSymbol("FIF"), list(makeSymbol("FUNCTION-SPEC-P"), makeSymbol("*RELEVANT-NODE?*")), makeSymbol("*RELEVANT-NODE?*"), list(makeSymbol("FUNCTION"), makeSymbol("DEFAULT-RELEVANT-NODE?")))), list(makeSymbol("*RELEVANT-LINK-TREE?*"), list(makeSymbol("FIF"), list(makeSymbol("FUNCTION-SPEC-P"), makeSymbol("*RELEVANT-LINK-TREE?*")), makeSymbol("*RELEVANT-LINK-TREE?*"), list(makeSymbol("FUNCTION"), makeSymbol("DEFAULT-RELEVANT-LINK-TREE?")))));

    static private final SubLList $list_alt156 = list(list(makeSymbol("MACHINE"), makeSymbol("PORT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt158 = list(list(makeSymbol("ENVIRONMENT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt159 = list(makeSymbol("QUEUE-P"));

    static private final SubLSymbol $sym161$ENVIRONMENT = makeUninternedSymbol("ENVIRONMENT");

    static private final SubLList $list_alt162 = list(list(makeSymbol("GET-FORWARD-INFERENCE-ENVIRONMENT")));

    static private final SubLList $list_alt164 = list(list(makeSymbol("*CURRENT-FORWARD-PROBLEM-STORE*"), NIL));

    static private final SubLList $list_alt166 = list(list(makeSymbol("CLEAR-CURRENT-FORWARD-PROBLEM-STORE")));

    static private final SubLList $list_alt167 = list(list(makeSymbol("*WITHIN-ASSERTION-FORWARD-PROPAGATION?*"), NIL), list(makeSymbol("*PREFER-FORWARD-SKOLEMIZATION*"), NIL));

    static private final SubLSymbol $sym171$ERROR = makeUninternedSymbol("ERROR");

    static private final SubLList $list_alt173 = list(list(makeSymbol("THROW-UNEVALUATABLE")));

    static private final SubLList $list_alt174 = list(list(makeSymbol("TRACEE"), makeSymbol("LEVEL")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt176 = list(makeSymbol("RESOURCE?"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt180 = list(makeSymbol("STRUCTURE"), makeSymbol("LINK-SLOT"), makeSymbol("MARK-SLOT"), list(makeSymbol("OBJECT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt181$__A_FREE_LIST_ = makeString("*~A-FREE-LIST*");

    static private final SubLString $str_alt182$Free_list_for__A_objects = makeString("Free list for ~A objects");

    static private final SubLString $str_alt183$__A_FREE_LOCK_ = makeString("*~A-FREE-LOCK*");

    static private final SubLString $str_alt184$Lock_for__A_object_free_list = makeString("Lock for ~A object free list");

    static private final SubLString $str_alt185$_A_resource_lock = makeString("~A resource lock");

    static private final SubLString $str_alt186$MAKE_STATIC__A = makeString("MAKE-STATIC-~A");

    static private final SubLString $str_alt187$Make_a_new__A_in_the_static_area = makeString("Make a new ~A in the static area");

    static private final SubLString $str_alt188$INIT__A = makeString("INIT-~A");

    static private final SubLString $str_alt189$Initialize_a__A_for_use = makeString("Initialize a ~A for use");

    static private final SubLString $str_alt190$GET__A = makeString("GET-~A");

    static private final SubLString $str_alt191$Get_a__A_from_the_free_list__or_m = makeString("Get a ~A from the free list, or make a new one if needed");

    static private final SubLString $str_alt192$FREE__A_P = makeString("FREE-~A-P");

    static private final SubLString $str_alt193$Check_if_OBJECT_is_a__A_that_has_ = makeString("Check if OBJECT is a ~A that has been explicitly freed");

    static private final SubLString $str_alt194$FREE__A = makeString("FREE-~A");

    static private final SubLString $str_alt195$Place_a__A_onto_the_free_list = makeString("Place a ~A onto the free list");

    static private final SubLString $str_alt196$MAKE__A = makeString("MAKE-~A");

    static private final SubLString $str_alt197$_A_P = makeString("~A-P");

    static private final SubLList $list_alt200 = list(list(RET, makeSymbol("OBJECT")));

    static private final SubLList $list_alt202 = list($FREE);

    static private final SubLList $list_alt206 = list(list(RET, T));

    static private final SubLList $list_alt207 = list(list(RET, NIL));

    static private final SubLList $list_alt208 = list(makeSymbol("OBJECT"), makeSymbol("FOUND"));

    static private final SubLList $list_alt210 = list(list(makeSymbol("COR"), makeSymbol("FOUND"), list(makeSymbol("NULL"), makeSymbol("OBJECT"))));

    static private final SubLList $list_alt211 = list(list(makeSymbol("CSETQ"), makeSymbol("FOUND"), T));

    static private final SubLList $list_alt213 = list(NIL);

    static private final SubLList $list_alt214 = list(makeSymbol("STRING"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt215 = list(list(makeSymbol("*NOTING-PROGRESS-START-TIME*"), list(makeSymbol("GET-UNIVERSAL-TIME"))));

    static private final SubLList $list_alt217 = list(list(makeSymbol("NOTING-PROGRESS-POSTAMBLE")));

    static private final SubLString $str_alt219$___A = makeString("~&~A");

    static private final SubLString $str_alt221$_DONE__ = makeString(" DONE (");

    static private final SubLString $str_alt222$_ = makeString(")");

    static private final SubLList $list_alt223 = list(list(makeSymbol("*LAST-PERCENT-PROGRESS-INDEX*"), ZERO_INTEGER), list(makeSymbol("*LAST-PERCENT-PROGRESS-PREDICTION*"), NIL), list(makeSymbol("*WITHIN-NOTING-PERCENT-PROGRESS*"), T), list(makeSymbol("*PERCENT-PROGRESS-START-TIME*"), list(makeSymbol("GET-UNIVERSAL-TIME"))));

    static private final SubLList $list_alt225 = list(list(makeSymbol("NOTING-PERCENT-PROGRESS-POSTAMBLE")));

    static private final SubLString $str_alt227$___A____ = makeString("~&~A~% [");

    static private final SubLString $str_alt230$__ended__A = makeString(", ended ~A");

    static private final SubLString $str_alt231$___ = makeString(") ]");

    static private final SubLString $str_alt233$_ = makeString(".");

    public static final SubLInteger $int$60 = makeInteger(60);

    static private final SubLString $str_alt237$_ = makeString(" ");

    static private final SubLString $str_alt238$_ = makeString("%");

    static private final SubLString $str_alt240$__ = makeString(" (");

    static private final SubLString $str_alt241$_of_ = makeString(" of ");

    static private final SubLString $str_alt242$__ending__ = makeString(", ending ~");

    static private final SubLString $str_alt243$__ = makeString("  ");

    static private final SubLString $str_alt246$___A____D_of__D___02D___Done_at__ = makeString("~%~A : ~D of ~D (~02D%) Done at ~A");

    static private final SubLList $list_alt248 = list(list(makeSymbol("VAR"), makeSymbol("TOTAL"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("cdotimes"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt251 = list(makeSymbol("CSETQ"), makeSymbol("*PROGRESS-START-TIME*"), list(makeSymbol("GET-UNIVERSAL-TIME")));

    static private final SubLList $list_alt253 = list(makeSymbol("CSETQ"), makeSymbol("*PROGRESS-SOFAR*"), ZERO_INTEGER);

    static private final SubLList $list_alt255 = list(makeSymbol("*PROGRESS-TOTAL*"));

    static private final SubLList $list_alt256 = list(makeSymbol("NOTE-PERCENT-PROGRESS"), makeSymbol("*PROGRESS-SOFAR*"), makeSymbol("*PROGRESS-TOTAL*"));

    static private final SubLList $list_alt257 = list(makeSymbol("CINC"), makeSymbol("*PROGRESS-SOFAR*"));

    static private final SubLList $list_alt258 = list(list(makeSymbol("VAR"), makeSymbol("LIST"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("cdolist")), makeSymbol("ENDVAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym260$LIST_VAR = makeUninternedSymbol("LIST-VAR");

    static private final SubLList $list_alt264 = list(list(makeSymbol("VAR"), makeSymbol("LIST"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("cdolist"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt266 = list(list(makeSymbol("VAR"), makeSymbol("LIST"), makeSymbol("&OPTIONAL"), makeSymbol("MESSAGE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym267$MESSAGE_VAR = makeUninternedSymbol("MESSAGE-VAR");

    static private final SubLList $list_alt269 = list(list(makeSymbol("KEY"), makeSymbol("VAL"), makeSymbol("TABLE"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("cdohash"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym271$TABLE_VAR = makeUninternedSymbol("TABLE-VAR");

    static private final SubLList $list_alt274 = list(list(makeSymbol("ELEM"), makeSymbol("SET"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("do-set"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt275$do_set = makeString("do-set");

    static private final SubLSymbol $sym276$SET_VAR = makeUninternedSymbol("SET-VAR");

    static private final SubLList $list_alt279 = list(list(makeSymbol("&KEY"), makeSymbol("MESSAGE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt280 = list(makeKeyword("MESSAGE"));

    static private final SubLSymbol $sym282$MESSAGE_VAR = makeUninternedSymbol("MESSAGE-VAR");

    static private final SubLSymbol $sym283$START_TIME = makeUninternedSymbol("START-TIME");

    static private final SubLString $str_alt287$___A_started__at__A = makeString("~&~A started  at ~A");

    static private final SubLString $str_alt288$___A_finished_at__A_after_A = makeString("~&~A finished at ~A after~A");

    static private final SubLList $list_alt290 = list(list(makeSymbol("*PACKAGE*"), list(makeSymbol("FIND-PACKAGE"), makeString("CYC"))), list(makeSymbol("*READ-DEFAULT-FLOAT-FORMAT*"), list(QUOTE, makeSymbol("DOUBLE-FLOAT"))), list(makeSymbol("*PRINT-READABLY*"), NIL), list(makeSymbol("*READ-EVAL*"), NIL), list(makeSymbol("OLD-PRIORITY"), list(makeSymbol("PROCESS-PRIORITY"), list(makeSymbol("CURRENT-PROCESS")))));

    static private final SubLList $list_alt291 = list(makeSymbol("SET-PROCESS-PRIORITY"), list(makeSymbol("CURRENT-PROCESS")), makeSymbol("*PROCESS-NORMAL-PRIORITY*"));

    static private final SubLList $list_alt292 = list(list(makeSymbol("SET-PROCESS-PRIORITY"), list(makeSymbol("CURRENT-PROCESS")), makeSymbol("OLD-PRIORITY")));

    static private final SubLList $list_alt293 = list(list(makeSymbol("*PACKAGE*"), list(makeSymbol("FIND-PACKAGE"), makeString("CYC"))), list(makeSymbol("*PRINT-READABLY*"), NIL), list(makeSymbol("*READ-EVAL*"), NIL));

    static private final SubLList $list_alt296 = list(list(makeSymbol("*READ-DEFAULT-FLOAT-FORMAT*"), list(QUOTE, makeSymbol("DOUBLE-FLOAT"))));

    static private final SubLList $list_alt297 = list(list(makeSymbol("CYCLIST")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym298$OLD_CYCLIST = makeUninternedSymbol("OLD-CYCLIST");

    static private final SubLList $list_alt299 = list(list(makeSymbol("THE-CYCLIST")));

    static private final SubLList $list_alt301 = list(list(makeSymbol("*THE-CYCLIST*"), NIL));

    static private final SubLList $list_alt302 = list(makeSymbol("EL-VARIABLES"), makeSymbol("BINDINGS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym303$BINDING = makeUninternedSymbol("BINDING");

    static private final SubLString $str_alt305$_S___var__S_is_not_a_symbol_ = makeString("~S - var ~S is not a symbol.");

    static private final SubLString $str_alt306$_S___function__S_is_not_a_symbol_ = makeString("~S - function ~S is not a symbol.");

    static private final SubLString $str_alt307$_S___search_type__S_is_not_one_of = makeString("~S - search type ~S is not one of (:depth-first :breadth-first).");

    static private final SubLList $list_alt308 = list(makeSymbol("LIST"));

    static private final SubLList $list_alt312 = list(list(makeSymbol("VAR"), makeSymbol("LIST-EXPRESSION")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt314 = list(list(makeSymbol("ELEMENT-VAR"), makeSymbol("SUBLIST-VAR"), makeSymbol("LIST-EXPRESSION")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt316$next_cons_var = makeString("next-cons-var");

    static private final SubLList $list_alt317 = list(list(makeSymbol("ELEMENT-VAR"), makeSymbol("LIST-EXPRESSION")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt320 = list(list(makeSymbol("VAR"), makeSymbol("PREDICATE"), makeSymbol("LIST-EXPRESSION")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt325 = list(list(makeSymbol("VAR1"), makeSymbol("LIST1"), makeSymbol("VAR2"), makeSymbol("LIST2")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt328 = list(list(makeSymbol("VAR"), makeSymbol("TREE"), makeSymbol("&OPTIONAL"), list(makeSymbol("SEARCH-TYPE"), makeKeyword("DEPTH-FIRST")), list(makeSymbol("VISIT-NILS"), NIL)), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt332$tree_var = makeString("tree-var");

    static private final SubLString $str_alt333$cells_var = makeString("cells-var");

    static private final SubLString $str_alt334$tail_of_cells = makeString("tail-of-cells");

    static private final SubLList $list_alt339 = list(list(makeSymbol("VAR"), makeSymbol("TREE"), makeSymbol("&OPTIONAL"), list(makeSymbol("SEARCH-TYPE"), makeKeyword("DEPTH-FIRST"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt341$tail_of_cells_var = makeString("tail-of-cells-var");

    static private final SubLList $list_alt342 = list(list(makeSymbol("PARAMETER"), makeSymbol("VALUE"), makeSymbol("PLIST")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt348 = list(makeSymbol("PATTERN"), makeSymbol("DATUM"));

    static private final SubLString $str_alt349$datum_evaluated_var = makeString("datum-evaluated-var");

    static private final SubLString $str_alt351$FAST_FUNCALL_NO_VALUE__contains_e = makeString("FAST-FUNCALL-NO-VALUE: contains erroneous function name it its function name list.");

    static private final SubLString $str_alt352$FAST_FUNCALL_NO_VALUE__cannot_acc = makeString("FAST-FUNCALL-NO-VALUE: cannot accept dotted list for its function name list.");

    static private final SubLString $str_alt353$FAST_FUNCALL_NO_VALUE__function_n = makeString("FAST-FUNCALL-NO-VALUE: function name list must be a list.");

    static private final SubLList $list_alt354 = list(makeSymbol("FUNCTION-FORM"), makeSymbol("FUNCTION-NAME-LIST"), makeSymbol("&REST"), makeSymbol("ARGS"));

    static private final SubLString $str_alt356$function_form_evaluated_var = makeString("function-form-evaluated-var");

    static private final SubLList $list_alt359 = list(makeSymbol("VAR-TO-SET"), makeSymbol("FUNCTION-FORM"), makeSymbol("FUNCTION-NAME-LIST"), makeSymbol("&REST"), makeSymbol("ARGS"));

    static private final SubLList $list_alt360 = list(makeSymbol("VARS-TO-BIND"), listS(makeSymbol("FUNCTION-FORM"), makeSymbol("FUNCTION-NAME-LIST"), makeSymbol("ARGS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt362 = list(makeSymbol("VARS-TO-SET"), makeSymbol("FUNCTION-FORM"), makeSymbol("FUNCTION-NAME-LIST"), makeSymbol("&REST"), makeSymbol("ARGS"));

    static private final SubLList $list_alt364 = list(makeSymbol("FUNCTION"), makeSymbol("&REST"), makeSymbol("ARGS"));

    static private final SubLList $list_alt365 = list(makeSymbol("PREDICATION-STRUCTURE"), makeSymbol("OPERAND"));

    static private final SubLList $list_alt366 = list(makeSymbol("INLINE-SET-SYMBOL"), makeSymbol("INLINE-GET-SYMBOL"), makeSymbol("INLINE-METHOD"));

    static private final SubLString $str_alt367$_A_S = makeString("~A~S");

    static private final SubLList $list_alt368 = list(list(makeSymbol("VAR"), makeSymbol("LIST-EXPRESSION"), makeSymbol("COLLECTION-VAR")), makeSymbol("ITERATED-EXPRESSION"));

    static private final SubLString $str_alt369$LIST_EXPRESSION = makeString("LIST-EXPRESSION");

    static private final SubLString $str_alt370$TAIL_CONS = makeString("TAIL-CONS");

    static private final SubLList $list_alt381 = list(makeSymbol("PUNLESS"), list(makeSymbol("LISTP"), makeSymbol("LIST")), list(RET, NIL));

    static private final SubLList $list_alt383 = list(makeSymbol("PUNLESS"), list(makeSymbol("CONSP"), makeSymbol("LIST")), list(RET, NIL));

    static private final SubLString $str_alt385$DEFINE_LIST_ELEMENT_PREDICATOR___ = makeString("DEFINE-LIST-ELEMENT-PREDICATOR: ~S is not a valid type value.");

    static private final SubLList $list_alt386 = list(makeSymbol("FUNCTION-NAME"), makeSymbol("TYPE"), list(makeSymbol("ELEMENT-VAR")), makeSymbol("EXPRESSION"));

    static private final SubLSymbol $sym387$_OPTIONAL = makeSymbol("&OPTIONAL");

    static private final SubLString $str_alt389$FCOND___S_is_not_a_valid_clause_l = makeString("FCOND: ~S is not a valid clause list.");

    static private final SubLString $str_alt390$FCOND___S_is_not_a_valid_clause_ = makeString("FCOND: ~S is not a valid clause.");

    static private final SubLString $str_alt392$P_RANGE_CASE__Ill_formed_clauses_ = makeString("P-RANGE-CASE: Ill-formed clauses encountered -> ~S.");

    static private final SubLString $str_alt393$P_RANGE_CASE___S_is_not_a_valid_c = makeString("P-RANGE-CASE: ~S is not a valid clause.");

    static private final SubLSymbol $sym395$__ = makeSymbol(">=");

    static private final SubLSymbol $sym396$__ = makeSymbol("<=");

    static private final SubLSymbol $sym397$_ = makeSymbol("=");

    static private final SubLList $list_alt398 = list(makeSymbol("VALUE"), makeSymbol("&BODY"), makeSymbol("CLAUSES"));

    static private final SubLString $str_alt400$Invalid_version_code__A_ = makeString("Invalid version code ~A.");

    static private final SubLList $list_alt401 = list(list(makeSymbol("VERSION")), makeSymbol("VERSION-BODIES"), makeSymbol("&KEY"), makeSymbol("ERROR-CLAUSE"));

    static private final SubLList $list_alt402 = list(makeKeyword("ERROR-CLAUSE"));

    static private final SubLList $list_alt404 = list(makeSymbol("VERSION"), makeSymbol("FORM"));

    static private final SubLList $list_alt405 = list(list(makeSymbol("MAJOR"), makeSymbol("MINOR")), makeSymbol("VERSION-BODIES"), makeSymbol("&KEY"), makeSymbol("ERROR-CLAUSE"));

    static private final SubLList $list_alt406 = list(makeSymbol("MAJOR-VERSION"), makeSymbol("MINOR-VERSION"), makeSymbol("FORM"));

    static private final SubLString $str_alt409$_P = makeString("-P");

    static private final SubLString $str_alt411$SET_ = makeString("SET-");

    static private final SubLString $str_alt413$UNSET_ = makeString("UNSET-");

    static private final SubLList $list_alt414 = list(makeSymbol("SUB-KB-SYMBOL"), makeSymbol("LOADED-DOC-STRING"));

    static private final SubLList $list_alt416 = list(makeSymbol("*KB-FEATURES*"));

    static private final SubLList $list_alt417 = list(T);

    static private final SubLList $list_alt423 = list(makeKeyword("A"), makeKeyword("S"), makeKeyword("D"));

    static private final SubLString $str_alt424$FORMAT_TO_STRING___S_is_an_invali = makeString("FORMAT-TO-STRING: ~S is an invalid format arg.  ~\n           Format args must be a member of the set {:A, :S, :D}.");

    static private final SubLString $str_alt425$FORMAT_TO_STRING__Odd_number_of_a = makeString("FORMAT-TO-STRING: Odd number of args encountered: ~S");

    static private final SubLSymbol $sym426$TIME = makeUninternedSymbol("TIME");

    static private final SubLString $str_alt429$_____real_time__A_seconds__ = makeString("~&;; real time ~A seconds~%");

    static private final SubLList $list_alt430 = list(makeSymbol("VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym431$TIMING_INFO = makeUninternedSymbol("TIMING-INFO");

    static private final SubLSymbol $sym432$CLOCK_TIME = makeUninternedSymbol("CLOCK-TIME");

    static private final SubLList $list_alt436 = list(makeKeyword("USER-TIME"), makeKeyword("SYSTEM-TIME"));

    static private final SubLSymbol $sym442$TIMING_INFO = makeUninternedSymbol("TIMING-INFO");

    static private final SubLString $str_alt443$______s__ = makeString("~&;; ~s~%");

    static private final SubLSymbol $sym444$TIMING_INFO = makeUninternedSymbol("TIMING-INFO");

    static private final SubLSymbol $sym446$TIMING_INFO = makeUninternedSymbol("TIMING-INFO");

    static private final SubLSymbol $sym447$TIMING_INFO = makeUninternedSymbol("TIMING-INFO");

    static private final SubLSymbol $sym449$TIMING_INFO = makeUninternedSymbol("TIMING-INFO");

    static private final SubLList $list_alt450 = list(makeSymbol("OBJECT"), makeSymbol("PRED"));

    static private final SubLList $list_alt451 = list(makeSymbol("LIST"), makeSymbol("PRED"));

    static private final SubLSymbol $sym452$ELEM = makeUninternedSymbol("ELEM");

    static private final SubLSymbol $sym453$LIST_VAR = makeUninternedSymbol("LIST-VAR");

    static private final SubLList $list_alt454 = list(makeSymbol("NON-DOTTED-LIST-P"));

    static private final SubLList $list_alt455 = list(makeSymbol("PLIST"), makeSymbol("PRED"));

    static private final SubLSymbol $sym456$PROPERTY = makeUninternedSymbol("PROPERTY");

    static private final SubLSymbol $sym457$VALUE = makeUninternedSymbol("VALUE");

    static private final SubLSymbol $sym458$PLIST_VAR = makeUninternedSymbol("PLIST-VAR");

    static private final SubLList $list_alt459 = list(makeSymbol("PROPERTY-LIST-P"));

    static private final SubLSymbol $sym461$PROPERTY = makeUninternedSymbol("PROPERTY");

    static private final SubLSymbol $sym462$VALUE = makeUninternedSymbol("VALUE");

    static private final SubLSymbol $sym463$PLIST_VAR = makeUninternedSymbol("PLIST-VAR");

    static private final SubLString $str_alt465$_s_is_not_a_known__a = makeString("~s is not a known ~a");

    static private final SubLList $list_alt466 = list(makeSymbol("OBJECT"), makeSymbol("FORM"), makeSymbol("FORMAT-STRING"), makeSymbol("&REST"), makeSymbol("FORMAT-ARGUMENTS"));

    static private final SubLList $list_alt468 = list(makeSymbol("ARG1"), makeSymbol("ARG2"));

    static private final SubLSymbol $sym469$SWAP_VAR = makeUninternedSymbol("SWAP-VAR");

    static private final SubLList $list_alt470 = list(makeSymbol("VARIABLE"), list(makeSymbol("&KEY"), makeSymbol("DOCUMENTATION"), makeSymbol("DEFINER"), makeSymbol("ACCESS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt471 = list(makeKeyword("DOCUMENTATION"), makeKeyword("DEFINER"), makeKeyword("ACCESS"));

    static private final SubLString $str_alt474$_A_INITIALIZER = makeString("~A-INITIALIZER");

    static private final SubLString $str_alt480$Initializing_KB_variables___ = makeString("Initializing KB variables...");

    static private final SubLList $list_alt481 = cons(makeSymbol("VAR-SYMBOL"), makeSymbol("FUNC"));

    static private final SubLList $list_alt482 = list(makeSymbol("GETTER"), makeSymbol("INITIALIZATION-FORM"), makeSymbol("&KEY"), makeSymbol("VAR"), list(makeSymbol("VACCESS"), list(QUOTE, makeSymbol("PRIVATE"))), list(makeSymbol("FACCESS"), list(QUOTE, makeSymbol("PRIVATE"))), makeSymbol("DOCUMENTATION"));

    static private final SubLList $list_alt483 = list(makeKeyword("VAR"), makeKeyword("VACCESS"), makeKeyword("FACCESS"), makeKeyword("DOCUMENTATION"));

    static private final SubLString $str_alt487$_ = makeString("*");

    static private final SubLString $str_alt488$Invalid_function_name__A___The_fi = makeString("Invalid function-name ~A.  The first arg of DEFPARAMETER-LAZY is the getter function, not the variable name.");

    static private final SubLSymbol $sym489$INIT_VALUE = makeUninternedSymbol("INIT-VALUE");

    static private final SubLList $list_alt491 = list(makeKeyword("UNINITIALIZED"));

    static private final SubLString $str_alt493$Unable_to_initialize__A__ = makeString("Unable to initialize ~A~%");

    static private final SubLString $str_alt494$Invalid_function_name__A___The_fi = makeString("Invalid function-name ~A.  The first arg of DEFVAR-LAZY is the getter function, not the variable name.");

    static private final SubLSymbol $sym495$INIT_VALUE = makeUninternedSymbol("INIT-VALUE");

    static private final SubLString $str_alt496$Invalid_function_name__A___The_fi = makeString("Invalid function-name ~A.  The first arg of DEFGLOBAL-LAZY is the getter function, not the variable name.");

    static private final SubLSymbol $sym497$INIT_VALUE = makeUninternedSymbol("INIT-VALUE");

    static private final SubLString $str_alt498$Invalid_function_name__A___The_fi = makeString("Invalid function-name ~A.  The first arg of DEFLEXICAL-LAZY is the getter function, not the variable name.");

    static private final SubLSymbol $sym499$INIT_VALUE = makeUninternedSymbol("INIT-VALUE");

    static private final SubLList $list_alt500 = list(makeSymbol("NAME"), makeSymbol("ARGLIST"), makeSymbol("DOCUMENTATION-STRING"), makeSymbol("DECLARATIONS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt509 = list(list(makeSymbol("FINAL-RESULT-VAR"), makeSymbol("THRESHOLD")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt510 = list(makeSymbol("*PARTIAL-RESULTS-ACCUMULATOR*"), list(makeSymbol("FUNCALL"), makeSymbol("*PARTIAL-RESULTS-INITIALIZATION-FN*")));

    static private final SubLList $list_alt511 = list(makeSymbol("*PARTIAL-RESULTS-TOTAL-ACCUMULATOR*"), list(makeSymbol("FUNCALL"), makeSymbol("*PARTIAL-RESULTS-INITIALIZATION-FN*")));

    static private final SubLList $list_alt513 = list(list(makeSymbol("*PARTIAL-RESULTS-SIZE*"), ZERO_INTEGER), list(makeSymbol("*PARTIAL-RESULTS-TOTAL-SIZE*"), ZERO_INTEGER), list(makeSymbol("*ACCUMULATING-PARTIAL-RESULTS?*"), T));

    static private final SubLList $list_alt514 = list(makeSymbol("FUNCALL"), makeSymbol("*PARTIAL-RESULTS-CONSOLIDATION-FN*"), makeSymbol("*PARTIAL-RESULTS-ACCUMULATOR*"));

    static private final SubLList $list_alt515 = list(list(makeSymbol("FUNCALL"), makeSymbol("*PARTIAL-RESULTS-FINAL-RESULT-FN*"), makeSymbol("*PARTIAL-RESULTS-TOTAL-ACCUMULATOR*")));

    static private final SubLList $list_alt517 = list(list(makeSymbol("STRING-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym518$STREAM = makeUninternedSymbol("STREAM");

    static private final SubLList $list_alt522 = list(list(makeSymbol("RESULT-VAR"), makeSymbol("&KEY"), list(makeSymbol("INITIAL-VALUE"), ZERO_INTEGER)), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt523 = list(makeKeyword("INITIAL-VALUE"));

    static private final SubLList $list_alt525 = list(makeSymbol("*SXHASH-COMPOSITE-STATE*"), FOUR_INTEGER);

    static private final SubLList $list_alt527 = list(makeSymbol("*SXHASH-COMPOSITE-HASH*"));

    static private final SubLList $list_alt528 = list(makeSymbol("COMPOSITE-STATE"), FOUR_INTEGER);

    static private final SubLList $list_alt530 = list(makeSymbol("COMPOSITE-HASH"));

    static private final SubLList $list_alt531 = list(makeSymbol("VALUE"));

    static private final SubLList $list_alt532 = list(makeSymbol("CSETQ"), makeSymbol("COMPOSITE-STATE"), list(makeSymbol("SXHASH-UPDATE-STATE"), makeSymbol("COMPOSITE-STATE")));

    static private final SubLList $list_alt536 = list(makeSymbol("COMPOSITE-STATE"));

    public static final SubLObject $ic538 = vector(new SubLObject[]{ SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER, ELEVEN_INTEGER, TWELVE_INTEGER, THIRTEEN_INTEGER, FOURTEEN_INTEGER, FIFTEEN_INTEGER, SIXTEEN_INTEGER, SEVENTEEN_INTEGER, EIGHTEEN_INTEGER, NINETEEN_INTEGER, TWENTY_INTEGER, makeInteger(21), makeInteger(22), makeInteger(23), makeInteger(24), makeInteger(25), makeInteger(26), makeInteger(27), makeInteger(28), makeInteger(29), makeInteger(30), makeInteger(31), ZERO_INTEGER, ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER });

    static private final SubLList $list_alt543 = list(list(makeSymbol("VAR"), makeSymbol("CATCH?")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt544 = list(list(makeSymbol("TAG"), makeSymbol("ANS-VAR"), makeSymbol("CATCH?")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt546 = list(list(makeSymbol("PRE-N"), makeSymbol("N")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym547$TIMINGS = makeUninternedSymbol("TIMINGS");

    static private final SubLSymbol $sym548$TIME = makeUninternedSymbol("TIME");

    static private final SubLSymbol $sym549$I = makeUninternedSymbol("I");

    static private final SubLList $list_alt550 = list(makeSymbol("BENCHMARK-GC"));

    static private final SubLSymbol $sym551$_ = makeSymbol("+");

    static private final SubLList $list_alt552 = list(list(makeSymbol("BENCHMARK-GC")));

    static private final SubLList $list_alt556 = list(list(makeSymbol("*PRINT-PRETTY*"), NIL), list(makeSymbol("*PRINT-LENGTH*"), NIL), list(makeSymbol("*PRINT-LEVEL*"), NIL));
}

/**
 * Total time: 2202 ms synthetic
 */
