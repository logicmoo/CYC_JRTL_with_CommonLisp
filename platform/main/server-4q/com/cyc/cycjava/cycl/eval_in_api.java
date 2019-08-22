package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class eval_in_api extends SubLTranslatedFile {
    public static final SubLFile me = new eval_in_api();

    public static final String myName = "com.cyc.cycjava.cycl.eval_in_api";

    public static final String myFingerPrint = "8b4fb00339833e3e087f0f1161586477d713808fead63961b6157ba1e0d8afe8";

    // defvar
    public static final SubLSymbol $eval_in_apiP$ = makeSymbol("*EVAL-IN-API?*");





    // defparameter
    // The association list of api variables and bound values.
    public static final SubLSymbol $eval_in_api_env$ = makeSymbol("*EVAL-IN-API-ENV*");









    // defparameter
    // The list of functions to be traced.
    public static final SubLSymbol $eval_in_api_traced_fns$ = makeSymbol("*EVAL-IN-API-TRACED-FNS*");

    // defparameter
    // The log of trace events.
    public static final SubLSymbol $eval_in_api_trace_log$ = makeSymbol("*EVAL-IN-API-TRACE-LOG*");

    // defparameter
    // Indicates top level evaluation when value equals 0.
    private static final SubLSymbol $eval_in_api_level$ = makeSymbol("*EVAL-IN-API-LEVEL*");

    // defparameter
    // Indicates function level for diagnostic trace output.
    private static final SubLSymbol $eval_in_api_function_level$ = makeSymbol("*EVAL-IN-API-FUNCTION-LEVEL*");

    // defparameter
    // The stack of macros that we're currently evalling in the context of.
    private static final SubLSymbol $eval_in_api_macro_stack$ = makeSymbol("*EVAL-IN-API-MACRO-STACK*");

    // defparameter
    private static final SubLSymbol $verify_in_api_verbose_modeP$ = makeSymbol("*VERIFY-IN-API-VERBOSE-MODE?*");

    // defparameter
    // A list of the symbols introduced in the form being verified.
    private static final SubLSymbol $verify_in_api_bound_symbols$ = makeSymbol("*VERIFY-IN-API-BOUND-SYMBOLS*");

    // defparameter
    // A list of the function symbols introduced in the form being verified.
    private static final SubLSymbol $verify_in_api_fbound_symbols$ = makeSymbol("*VERIFY-IN-API-FBOUND-SYMBOLS*");

    // defparameter
    // The stack of macros that we're currently verifying in the context of.
    private static final SubLSymbol $verify_in_api_macro_stack$ = makeSymbol("*VERIFY-IN-API-MACRO-STACK*");

    // deflexical
    // The dictionary of persistent api user variables and values.
    public static final SubLSymbol $api_user_variables$ = makeSymbol("*API-USER-VARIABLES*");

    // Internal Constants
    public static final SubLSymbol QUOTIFY = makeSymbol("QUOTIFY");

    public static final SubLSymbol $eval_in_api_mutable_globals$ = makeSymbol("*EVAL-IN-API-MUTABLE-GLOBALS*");

    public static final SubLSymbol $eval_in_api_immutable_globals$ = makeSymbol("*EVAL-IN-API-IMMUTABLE-GLOBALS*");

    public static final SubLSymbol $api_special_verify_table$ = makeSymbol("*API-SPECIAL-VERIFY-TABLE*");

    public static final SubLSymbol $api_function_table$ = makeSymbol("*API-FUNCTION-TABLE*");



    public static final SubLSymbol $api_macro_table$ = makeSymbol("*API-MACRO-TABLE*");

    public static final SubLList $list7 = list(makeSymbol("NAME"), makeSymbol("ARGLIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym8$FORM = makeUninternedSymbol("FORM");

    public static final SubLString $str9$API_SPECIAL__A = makeString("API-SPECIAL-~A");









    public static final SubLSymbol REGISTER_API_SPECIAL = makeSymbol("REGISTER-API-SPECIAL");



    public static final SubLSymbol $sym16$FORM = makeUninternedSymbol("FORM");

    public static final SubLString $str17$API_SPECIAL__A_VERIFY = makeString("API-SPECIAL-~A-VERIFY");

    public static final SubLSymbol REGISTER_API_SPECIAL_VERIFY = makeSymbol("REGISTER-API-SPECIAL-VERIFY");

    public static final SubLSymbol $subl_eval_method$ = makeSymbol("*SUBL-EVAL-METHOD*");





    public static final SubLList $list22 = list(list(makeSymbol("*%EVALUATOR-METHOD*", "SUBLISP"), makeSymbol("*SUBL-EVAL-METHOD*")));

    public static final SubLList $list23 = list(list(makeSymbol("*EVAL-IN-API-ENV*"), list(makeSymbol("INITIALIZE-EVAL-IN-API-ENV"))), list(makeSymbol("*EVAL-IN-API-TRACED-FNS*"), NIL), list(makeSymbol("*EVAL-IN-API-TRACE-LOG*"), makeString("")));

    public static final SubLSymbol INITIALIZE_EVAL_IN_API_ENV = makeSymbol("INITIALIZE-EVAL-IN-API-ENV");

    public static final SubLSymbol WITH_EVAL_IN_API_ENVIRONMENT = makeSymbol("WITH-EVAL-IN-API-ENVIRONMENT");





    public static final SubLSymbol VALID_API_OPERATOR_P = makeSymbol("VALID-API-OPERATOR-P");

    public static final SubLList $list29 = list(makeSymbol("OPERATOR"));

    public static final SubLString $str30$_return_boolean_T_if_APPLY_or_FUN = makeString("@return boolean T if APPLY or FUNCALL of that OPERATOR or use\nas a MACRO would success in the most restricted version of the API");

    public static final SubLList $list31 = list(list(makeSymbol("OPERATOR"), makeSymbol("SYMBOLP")));

    public static final SubLList $list32 = list(makeSymbol("BOOLEANP"));

    public static final SubLSymbol VALID_API_FUNCTION_P = makeSymbol("VALID-API-FUNCTION-P");

    public static final SubLString $str34$_return_boolean_T_if_APPLY_or_FUN = makeString("@return boolean T if APPLY or FUNCALL of that OPERATOR\nwould succeed in the most restricted version of the API. \n@note does NOT check API-SPECIAL-P");

    public static final SubLSymbol VALID_API_MACRO_P = makeSymbol("VALID-API-MACRO-P");

    public static final SubLString $str36$_return_boolean_T_iff_macro_expan = makeString("@return boolean T iff macro expansion of that OPERATOR\nwould succeed in the most restricted version of the API. \n@note does NOT check API-SPECIAL-P");













    private static final SubLList $list43 = list(new SubLObject[]{ list(list(makeSymbol("VALID-API-OPERATOR-P")), T), list(list(makeSymbol("WITH-ALL-MTS")), T), list(list(makeSymbol("+")), T), list(list(makeSymbol("CDESTRUCTURING-BIND")), T), list(list(makeSymbol("CPUSH")), T), list(list(makeSymbol("EXPRESSION-FIND-IF")), T), list(list(makeSymbol("SYMBOL-PACKAGE")), NIL), list(list(makeSymbol("EVAL-IN-API-INTERNAL")), NIL), list(list(makeSymbol("WITH-EVAL-IN-API-ENV")), NIL) });

    public static final SubLList $list44 = cons(makeSymbol("OPERATOR"), makeSymbol("ARGS"));

    private static final SubLString $str45$Operator__S_was_not_a_symbol = makeString("Operator ~S was not a symbol");

    private static final SubLString $str46$Operator__S_is_not_defined_in_the = makeString("Operator ~S is not defined in the API");

    private static final SubLString $str47$Variable__S_is_unbound = makeString("Variable ~S is unbound");

    private static final SubLString $$$API_ERROR = makeString("API ERROR");

    private static final SubLString $str49$Attempt_to_obtain_the_value_of_sy = makeString("Attempt to obtain the value of symbol ~S which is unbound");

    private static final SubLList $list50 = list(makeSymbol("FUNCTION-RESULTS"));



    private static final SubLSymbol FUNCTION_RESULTS = makeSymbol("FUNCTION-RESULTS");



    private static final SubLSymbol EVAL_IN_API_UPDATE_ENV = makeSymbol("EVAL-IN-API-UPDATE-ENV");

    private static final SubLSymbol VALUES_LIST = makeSymbol("VALUES-LIST");

    private static final SubLList $list56 = list(makeSymbol("MACRO-RESULT"));

    private static final SubLSymbol MACRO_RESULT = makeSymbol("MACRO-RESULT");

    private static final SubLSymbol MACROEXPAND_1 = makeSymbol("MACROEXPAND-1");

    private static final SubLSymbol $EVAL_IN_API_RET = makeKeyword("EVAL-IN-API-RET");

    private static final SubLSymbol WITH_EVAL_IN_API_ENV_INT = makeSymbol("WITH-EVAL-IN-API-ENV-INT");

    private static final SubLList $list61 = list(makeSymbol("BODY-RESULTS"));

    private static final SubLSymbol BODY_RESULTS = makeSymbol("BODY-RESULTS");

    private static final SubLSymbol EVAL_IN_API_PROGN_BODY = makeSymbol("EVAL-IN-API-PROGN-BODY");

    private static final SubLString $str64$with_eval_in_api_env_int = makeString("with-eval-in-api-env-int");

    private static final SubLSymbol VERIFY_IN_API = makeSymbol("VERIFY-IN-API");

    private static final SubLString $str66$don_t_know_how_to_handle_special_ = makeString("don't know how to handle special ~A");

    private static final SubLList $list67 = list(new SubLObject[]{ list(list(list(makeSymbol("CAND"), list(makeSymbol("COR"), list(makeSymbol("CNOT"), list(makeSymbol("+"), ONE_INTEGER, ONE_INTEGER))))), NIL), list(list(list(makeSymbol("DEFINE"), makeSymbol("FOO"), list(makeSymbol("FOO")), list(makeSymbol("RET"), list(makeSymbol("+"), makeSymbol("FOO"), list(makeSymbol("FOO"), ONE_INTEGER))))), NIL), list(list(list(makeSymbol("DEFINE-PUBLIC"), makeSymbol("FIBONACCI"), list(makeSymbol("N")), list(makeSymbol("CHECK-TYPE"), makeSymbol("N"), makeSymbol("NON-NEGATIVE-INTEGER-P")), list(makeSymbol("CLET"), list(makeSymbol("FIB")), list(makeSymbol("CSETQ"), makeSymbol("FIB"), list(makeSymbol("FIBONACCI"), makeSymbol("N"))), list(makeSymbol("RET"), makeSymbol("FIB"))))), NIL), list(list(list(makeSymbol("PCOND"), list(list(makeSymbol("FIF"), NIL, T, NIL), list(makeSymbol("PIF"), T, list(makeSymbol("NULL"), T), list(makeSymbol("NULL"), NIL))), list(T, makeSymbol("*THE-CYCLIST*")))), NIL), list(list(list(makeSymbol("PROGN"), list(makeSymbol("DEFVAR"), makeSymbol("*FOO*"), NIL), list(makeSymbol("DEFMACRO"), makeSymbol("WITH-FOO"), list(makeSymbol("BAR"), makeSymbol("&BODY"), makeSymbol("BODY")), list(makeSymbol("CLET"), list(list(makeSymbol("*FOO*"), makeSymbol("BAR"))), makeSymbol("BODY"))), list(makeSymbol("DEFINE"), makeSymbol("DO-FOO"), list(makeSymbol("BAR"), makeSymbol("BAZ")), list(makeSymbol("WITH-FOO"), list(makeSymbol("BAR")), list(makeSymbol("FOO"), makeSymbol("BAR")))), list(makeSymbol("DEFINE"), makeSymbol("FOO"), NIL, list(makeSymbol("RET"), NIL)))), NIL), list(list(list(makeSymbol("FUNCTION"), makeSymbol("FBOUNDP"))), NIL), list(list(list(makeSymbol("MULTIPLE-VALUE-LIST"), list(makeSymbol("VALUES"), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER))), NIL), list(list(list(makeSymbol("CDOTIMES"), list(makeSymbol("N"), list(makeSymbol("+"), FIVE_INTEGER, ONE_INTEGER)), list(makeSymbol("PRINT"), makeString("a")))), NIL), list(list(list(makeSymbol("CMULTIPLE-VALUE-BIND"), list(makeSymbol("SEC"), makeSymbol("MIN"), makeSymbol("HOUR")), list(makeSymbol("GET-DECODED-TIME")), list(makeSymbol("FORMAT"), T, makeString("~A:~A"), makeSymbol("HOUR"), makeSymbol("MIN")))), NIL), list(list(list(makeSymbol("CLET"), list(list(makeSymbol("N"), ZERO_INTEGER)), list(makeSymbol("WHILE"), list(makeSymbol("<"), makeSymbol("N"), TEN_INTEGER), list(makeSymbol("CINC"), makeSymbol("N")), list(makeSymbol("PRINT"), makeString("a"))))), NIL), list(list(list(makeSymbol("CDO"), list(list(makeSymbol("X"), ZERO_INTEGER, list(makeSymbol("+"), ONE_INTEGER, makeSymbol("X"))), list(makeSymbol("Y"), list(makeSymbol("+"), ZERO_INTEGER, ONE_INTEGER), list(makeSymbol("+"), makeSymbol("Y"), TWO_INTEGER)), list(makeSymbol("Z"), makeInteger(-10), list(makeSymbol("-"), makeSymbol("Z"), ONE_INTEGER))), list(list(makeSymbol(">"), makeSymbol("X"), THREE_INTEGER)), list(makeSymbol("FORMAT"), T, makeString("~%x=~S y=~S z=~S"), makeSymbol("X"), makeSymbol("Y"), makeSymbol("Z")))), NIL), list(list(list(makeSymbol("CLET"), list(makeSymbol("FOO")), list(makeSymbol("CCATCH"), list(makeSymbol("MAKE-KEYWORD"), makeString("a")), makeSymbol("FOO"), list(makeSymbol("THROW"), list(makeSymbol("MAKE-KEYWORD"), makeString("a")), makeString("b"))), makeSymbol("FOO"))), NIL), list(list(list(makeSymbol("DO-CONSTANTS"), list(makeSymbol("C")))), NIL), list(list(list(makeSymbol("DO-NARTS"), list(makeSymbol("N")))), NIL), list(list(list(makeSymbol("DO-FORTS"), list(makeSymbol("F")))), NIL), list(list(list(makeSymbol("DO-ASSERTIONS"), list(makeSymbol("A")))), NIL), list(list(list(makeSymbol("DO-DEDUCTIONS"), list(makeSymbol("D")))), NIL), list(list(list(makeSymbol("WITH-INFERENCE-MT-RELEVANCE"), list(makeSymbol("QUOTE"), makeSymbol("DUMMY-MT")), list(makeSymbol("DO-GAF-ARG-INDEX"), list(makeSymbol("A"), list(makeSymbol("QUOTE"), makeSymbol("DUMMY-TERM")), makeKeyword("PREDICATE"), list(makeSymbol("QUOTE"), makeSymbol("DUMMY-PRED")), makeKeyword("INDEX"), ONE_INTEGER, makeKeyword("TRUTH"), makeKeyword("TRUE")), list(makeSymbol("PRINT"), makeSymbol("A"))))), NIL), list(list(list(makeSymbol("WITH-ALL-MTS"), list(makeSymbol("DO-GAF-ARG-INDEX"), list(makeSymbol("A"), list(makeSymbol("QUOTE"), makeSymbol("DUMMY-TERM")), makeKeyword("PREDICATE"), list(makeSymbol("QUOTE"), makeSymbol("DUMMY-PRED")), makeKeyword("INDEX"), ONE_INTEGER, makeKeyword("TRUTH"), makeKeyword("TRUE")), list(makeSymbol("PRINT"), makeSymbol("A"))))), NIL), list(list(list(makeSymbol("DEFINE-EVALUATION-DEFN"), makeSymbol("TEST"), list(makeSymbol("OBJECT")), list(makeSymbol("PWHEN"), list(makeSymbol("NULL"), makeSymbol("OBJECT")), list(makeSymbol("THROW-UNEVALUATABLE"))), list(makeSymbol("RET"), makeSymbol("OBJECT")))), NIL) });

    private static final SubLList $list68 = list(makeSymbol("EXPRESSION"));



    private static final SubLSymbol API_SPECIAL_RET = makeSymbol("API-SPECIAL-RET");

    private static final SubLSymbol API_SPECIAL_RET_VERIFY = makeSymbol("API-SPECIAL-RET-VERIFY");

    private static final SubLSymbol LAMBDA = makeSymbol("LAMBDA");



    private static final SubLSymbol API_SPECIAL_DEFINE = makeSymbol("API-SPECIAL-DEFINE");

    private static final SubLSymbol API_SPECIAL_DEFINE_VERIFY = makeSymbol("API-SPECIAL-DEFINE-VERIFY");



    private static final SubLSymbol API_SPECIAL_DEFINE_PUBLIC = makeSymbol("API-SPECIAL-DEFINE-PUBLIC");

    private static final SubLSymbol API_SPECIAL_DEFINE_PUBLIC_VERIFY = makeSymbol("API-SPECIAL-DEFINE-PUBLIC-VERIFY");



    private static final SubLSymbol API_SPECIAL_DEFINE_PROTECTED = makeSymbol("API-SPECIAL-DEFINE-PROTECTED");

    private static final SubLSymbol API_SPECIAL_DEFINE_PROTECTED_VERIFY = makeSymbol("API-SPECIAL-DEFINE-PROTECTED-VERIFY");

    private static final SubLSymbol API_SPECIAL_DEFINE_PRIVATE = makeSymbol("API-SPECIAL-DEFINE-PRIVATE");

    private static final SubLSymbol API_SPECIAL_DEFINE_PRIVATE_VERIFY = makeSymbol("API-SPECIAL-DEFINE-PRIVATE-VERIFY");

    private static final SubLSymbol $sym84$FORM = makeUninternedSymbol("FORM");



    private static final SubLSymbol API_SPECIAL_DEFMACRO = makeSymbol("API-SPECIAL-DEFMACRO");

    private static final SubLSymbol API_SPECIAL_DEFMACRO_VERIFY = makeSymbol("API-SPECIAL-DEFMACRO-VERIFY");

    private static final SubLSymbol $sym88$FORM = makeUninternedSymbol("FORM");

    private static final SubLSymbol DEFMACRO_PUBLIC = makeSymbol("DEFMACRO-PUBLIC");

    private static final SubLSymbol API_SPECIAL_DEFMACRO_PUBLIC = makeSymbol("API-SPECIAL-DEFMACRO-PUBLIC");

    private static final SubLSymbol API_SPECIAL_DEFMACRO_PUBLIC_VERIFY = makeSymbol("API-SPECIAL-DEFMACRO-PUBLIC-VERIFY");

    private static final SubLSymbol $sym92$FORM = makeUninternedSymbol("FORM");

    private static final SubLSymbol DEFMACRO_PROTECTED = makeSymbol("DEFMACRO-PROTECTED");

    private static final SubLSymbol API_SPECIAL_DEFMACRO_PROTECTED = makeSymbol("API-SPECIAL-DEFMACRO-PROTECTED");

    private static final SubLSymbol API_SPECIAL_DEFMACRO_PROTECTED_VERIFY = makeSymbol("API-SPECIAL-DEFMACRO-PROTECTED-VERIFY");

    private static final SubLList $list96 = list(list(makeSymbol("NAME")), makeSymbol("&BODY"), makeSymbol("SLOTS"));

    private static final SubLSymbol DEFSTRUCT = makeSymbol("DEFSTRUCT");

    private static final SubLSymbol API_SPECIAL_DEFSTRUCT = makeSymbol("API-SPECIAL-DEFSTRUCT");

    private static final SubLList $list99 = list(list(makeSymbol("NAME"), makeSymbol("&BODY"), makeSymbol("SLOTS")));

    private static final SubLSymbol API_SPECIAL_DEFSTRUCT_VERIFY = makeSymbol("API-SPECIAL-DEFSTRUCT-VERIFY");

    private static final SubLSymbol DEFSTRUCT_VECTOR = makeSymbol("DEFSTRUCT-VECTOR");

    private static final SubLList $list102 = list(makeSymbol("SYMBOL"));

    private static final SubLSymbol FI_GET_PARAMETER = makeSymbol("FI-GET-PARAMETER");

    private static final SubLSymbol API_SPECIAL_FI_GET_PARAMETER = makeSymbol("API-SPECIAL-FI-GET-PARAMETER");

    private static final SubLSymbol API_SPECIAL_FI_GET_PARAMETER_VERIFY = makeSymbol("API-SPECIAL-FI-GET-PARAMETER-VERIFY");

    private static final SubLList $list106 = list(makeSymbol("SYMBOL"), makeSymbol("VALUE"));



    private static final SubLSymbol API_SPECIAL_DEFVAR = makeSymbol("API-SPECIAL-DEFVAR");

    private static final SubLSymbol API_SPECIAL_DEFVAR_VERIFY = makeSymbol("API-SPECIAL-DEFVAR-VERIFY");

    private static final SubLSymbol DEFVAR_PRIVATE = makeSymbol("DEFVAR-PRIVATE");

    private static final SubLSymbol API_SPECIAL_DEFVAR_PRIVATE = makeSymbol("API-SPECIAL-DEFVAR-PRIVATE");

    private static final SubLSymbol API_SPECIAL_DEFVAR_PRIVATE_VERIFY = makeSymbol("API-SPECIAL-DEFVAR-PRIVATE-VERIFY");

    private static final SubLSymbol CLEAR_API_USER_VARIABLES = makeSymbol("CLEAR-API-USER-VARIABLES");

    private static final SubLString $str114$Removes_all_user_variables_ = makeString("Removes all user variables.");

    private static final SubLList $list115 = list(NIL);

    private static final SubLSymbol PUT_API_USER_VARIABLE = makeSymbol("PUT-API-USER-VARIABLE");

    public static final SubLList $list117 = list(makeSymbol("VAR"), makeSymbol("VALUE"));

    private static final SubLString $str118$Sets_the_value_of_a_the_user_vari = makeString("Sets the value of a the user variable VAR to the given VALUE.");

    private static final SubLSymbol GET_API_USER_VARIABLE = makeSymbol("GET-API-USER-VARIABLE");

    private static final SubLList $list120 = list(makeSymbol("VAR"));

    private static final SubLString $str121$Gets_the_value_of_a_the_user_vari = makeString("Gets the value of a the user variable VAR.");

    private static final SubLSymbol FI_SET_PARAMETER = makeSymbol("FI-SET-PARAMETER");

    private static final SubLSymbol API_SPECIAL_FI_SET_PARAMETER = makeSymbol("API-SPECIAL-FI-SET-PARAMETER");

    private static final SubLSymbol API_SPECIAL_FI_SET_PARAMETER_VERIFY = makeSymbol("API-SPECIAL-FI-SET-PARAMETER-VERIFY");

    private static final SubLList $list125 = list(makeSymbol("VAR"), makeSymbol("VALUE"), makeSymbol("&REST"), makeSymbol("VAR-VALUE-PAIRS"));

    private static final SubLSymbol API_SPECIAL_CSETQ = makeSymbol("API-SPECIAL-CSETQ");

    private static final SubLSymbol API_SPECIAL_CSETQ_VERIFY = makeSymbol("API-SPECIAL-CSETQ-VERIFY");

    private static final SubLString $str128$_S_is_not_a_symbol = makeString("~S is not a symbol");

    private static final SubLString $str129$_S_is_not_defined = makeString("~S is not defined");

    private static final SubLList $list130 = list(makeSymbol("X"), makeSymbol("&OPTIONAL"), list(makeSymbol("DELTA"), ONE_INTEGER));

    private static final SubLString $str131$_S_is_not_an_api_variable = makeString("~S is not an api variable");



    private static final SubLSymbol API_SPECIAL_CINC = makeSymbol("API-SPECIAL-CINC");

    private static final SubLSymbol API_SPECIAL_CINC_VERIFY = makeSymbol("API-SPECIAL-CINC-VERIFY");



    private static final SubLSymbol API_SPECIAL_CDEC = makeSymbol("API-SPECIAL-CDEC");

    private static final SubLSymbol API_SPECIAL_CDEC_VERIFY = makeSymbol("API-SPECIAL-CDEC-VERIFY");

    private static final SubLList $list138 = list(makeSymbol("ITEM"), makeSymbol("PLACE"));



    private static final SubLSymbol API_SPECIAL_CPUSH = makeSymbol("API-SPECIAL-CPUSH");

    private static final SubLSymbol API_SPECIAL_CPUSH_VERIFY = makeSymbol("API-SPECIAL-CPUSH-VERIFY");

    private static final SubLList $list142 = list(makeSymbol("PLACE"));



    private static final SubLSymbol API_SPECIAL_CPOP = makeSymbol("API-SPECIAL-CPOP");

    private static final SubLSymbol API_SPECIAL_CPOP_VERIFY = makeSymbol("API-SPECIAL-CPOP-VERIFY");

    private static final SubLList $list146 = list(makeSymbol("FORM"));

    private static final SubLSymbol API_SPECIAL_EVAL = makeSymbol("API-SPECIAL-EVAL");

    private static final SubLSymbol EVAL_IN_API = makeSymbol("EVAL-IN-API");

    private static final SubLSymbol API_SPECIAL_EVAL_IN_API_VERIFY = makeSymbol("API-SPECIAL-EVAL-IN-API-VERIFY");

    private static final SubLSymbol FI_EVAL = makeSymbol("FI-EVAL");

    private static final SubLSymbol API_SPECIAL_FI_EVAL = makeSymbol("API-SPECIAL-FI-EVAL");

    private static final SubLSymbol API_SPECIAL_FI_EVAL_VERIFY = makeSymbol("API-SPECIAL-FI-EVAL-VERIFY");

    private static final SubLSymbol FI_LOCAL_EVAL = makeSymbol("FI-LOCAL-EVAL");

    private static final SubLSymbol API_SPECIAL_FI_LOCAL_EVAL = makeSymbol("API-SPECIAL-FI-LOCAL-EVAL");

    private static final SubLSymbol API_SPECIAL_FI_LOCAL_EVAL_VERIFY = makeSymbol("API-SPECIAL-FI-LOCAL-EVAL-VERIFY");

    private static final SubLList $list156 = list(makeSymbol("FUNCTION"), makeSymbol("ARGUMENT"), makeSymbol("&REST"), makeSymbol("ARGUMENTS"));



    private static final SubLSymbol API_SPECIAL_APPLY = makeSymbol("API-SPECIAL-APPLY");

    private static final SubLSymbol API_SPECIAL_APPLY_VERIFY = makeSymbol("API-SPECIAL-APPLY-VERIFY");

    private static final SubLList $list160 = list(makeSymbol("FUNCTION"));



    private static final SubLSymbol API_SPECIAL_FBOUNDP = makeSymbol("API-SPECIAL-FBOUNDP");

    private static final SubLSymbol API_SPECIAL_FBOUNDP_VERIFY = makeSymbol("API-SPECIAL-FBOUNDP-VERIFY");

    private static final SubLList $list164 = list(makeSymbol("FUNCTION"), makeSymbol("&REST"), makeSymbol("ARGUMENTS"));



    private static final SubLSymbol API_SPECIAL_FUNCALL = makeSymbol("API-SPECIAL-FUNCALL");

    private static final SubLSymbol API_SPECIAL_FUNCALL_VERIFY = makeSymbol("API-SPECIAL-FUNCALL-VERIFY");

    private static final SubLSymbol API_SPECIAL_MULTIPLE_VALUE_LIST = makeSymbol("API-SPECIAL-MULTIPLE-VALUE-LIST");

    private static final SubLSymbol API_SPECIAL_MULTIPLE_VALUE_LIST_VERIFY = makeSymbol("API-SPECIAL-MULTIPLE-VALUE-LIST-VERIFY");

    private static final SubLSymbol TRACE = makeSymbol("TRACE");

    private static final SubLSymbol API_SPECIAL_TRACE = makeSymbol("API-SPECIAL-TRACE");

    private static final SubLSymbol API_SPECIAL_TRACE_VERIFY = makeSymbol("API-SPECIAL-TRACE-VERIFY");

    private static final SubLSymbol UNTRACE = makeSymbol("UNTRACE");

    private static final SubLSymbol API_SPECIAL_UNTRACE = makeSymbol("API-SPECIAL-UNTRACE");

    private static final SubLSymbol API_SPECIAL_UNTRACE_VERIFY = makeSymbol("API-SPECIAL-UNTRACE-VERIFY");

    private static final SubLString $str176$__ = makeString("~%");

    private static final SubLString $str177$_A_D___S__ = makeString("~A~D: ~S~%");

    private static final SubLString $str178$ = makeString("");

    private static final SubLString $str179$_S_ = makeString("~S ");

    private static final SubLString $str180$_A_D__returned__A__ = makeString("~A~D: returned ~A~%");

    private static final SubLSymbol GET_TRACE_LOG = makeSymbol("GET-TRACE-LOG");

    private static final SubLSymbol API_SPECIAL_GET_TRACE_LOG = makeSymbol("API-SPECIAL-GET-TRACE-LOG");

    private static final SubLSymbol API_SPECIAL_GET_TRACE_LOG_VERIFY = makeSymbol("API-SPECIAL-GET-TRACE-LOG-VERIFY");

    private static final SubLSymbol CLEAR_TRACE_LOG = makeSymbol("CLEAR-TRACE-LOG");

    private static final SubLSymbol API_SPECIAL_CLEAR_TRACE_LOG = makeSymbol("API-SPECIAL-CLEAR-TRACE-LOG");

    private static final SubLSymbol API_SPECIAL_CLEAR_TRACE_LOG_VERIFY = makeSymbol("API-SPECIAL-CLEAR-TRACE-LOG-VERIFY");



    private static final SubLSymbol API_SPECIAL_PROGN = makeSymbol("API-SPECIAL-PROGN");

    private static final SubLSymbol API_SPECIAL_PROGN_VERIFY = makeSymbol("API-SPECIAL-PROGN-VERIFY");

    private static final SubLList $list190 = list(makeSymbol("BINDINGS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol API_SPECIAL_CLET = makeSymbol("API-SPECIAL-CLET");

    private static final SubLString $$$clet_error = makeString("clet error");

    private static final SubLSymbol API_SPECIAL_CLET_VERIFY = makeSymbol("API-SPECIAL-CLET-VERIFY");

    private static final SubLList $list194 = list(makeSymbol("BINDING"), makeSymbol("&REST"), makeSymbol("REST-BINDINGS"));

    private static final SubLList $list195 = list(makeSymbol("VARS"), makeSymbol("VALUES-FORM"), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLSymbol API_SPECIAL_CMULTIPLE_VALUE_BIND = makeSymbol("API-SPECIAL-CMULTIPLE-VALUE-BIND");

    private static final SubLSymbol API_SPECIAL_CMULTIPLE_VALUE_BIND_VERIFY = makeSymbol("API-SPECIAL-CMULTIPLE-VALUE-BIND-VERIFY");



    private static final SubLSymbol API_SPECIAL_CAND = makeSymbol("API-SPECIAL-CAND");

    private static final SubLSymbol API_SPECIAL_CAND_VERIFY = makeSymbol("API-SPECIAL-CAND-VERIFY");



    private static final SubLSymbol API_SPECIAL_COR = makeSymbol("API-SPECIAL-COR");

    private static final SubLSymbol API_SPECIAL_COR_VERIFY = makeSymbol("API-SPECIAL-COR-VERIFY");



    private static final SubLSymbol API_SPECIAL_CNOT = makeSymbol("API-SPECIAL-CNOT");

    private static final SubLSymbol API_SPECIAL_CNOT_VERIFY = makeSymbol("API-SPECIAL-CNOT-VERIFY");

    private static final SubLList $list208 = list(makeSymbol("CONDITION"), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLSymbol API_SPECIAL_PCOND = makeSymbol("API-SPECIAL-PCOND");

    private static final SubLSymbol API_SPECIAL_PCOND_VERIFY = makeSymbol("API-SPECIAL-PCOND-VERIFY");

    private static final SubLList $list212 = list(makeSymbol("CONDITION"), makeSymbol("ACTION"), makeSymbol("ELSE-ACTION"));



    private static final SubLSymbol API_SPECIAL_PIF = makeSymbol("API-SPECIAL-PIF");

    private static final SubLSymbol API_SPECIAL_PIF_VERIFY = makeSymbol("API-SPECIAL-PIF-VERIFY");



    private static final SubLSymbol API_SPECIAL_FIF = makeSymbol("API-SPECIAL-FIF");

    private static final SubLSymbol API_SPECIAL_FIF_VERIFY = makeSymbol("API-SPECIAL-FIF-VERIFY");



    private static final SubLSymbol API_SPECIAL_PWHEN = makeSymbol("API-SPECIAL-PWHEN");

    private static final SubLSymbol API_SPECIAL_PWHEN_VERIFY = makeSymbol("API-SPECIAL-PWHEN-VERIFY");

    private static final SubLList $list222 = list(makeSymbol("CONDITION"), makeSymbol("ACTION"));



    private static final SubLSymbol API_SPECIAL_WHEN = makeSymbol("API-SPECIAL-WHEN");

    private static final SubLSymbol API_SPECIAL_WHEN_VERIFY = makeSymbol("API-SPECIAL-WHEN-VERIFY");



    private static final SubLSymbol API_SPECIAL_FWHEN = makeSymbol("API-SPECIAL-FWHEN");

    private static final SubLSymbol API_SPECIAL_FWHEN_VERIFY = makeSymbol("API-SPECIAL-FWHEN-VERIFY");



    private static final SubLSymbol API_SPECIAL_PUNLESS = makeSymbol("API-SPECIAL-PUNLESS");

    private static final SubLSymbol API_SPECIAL_PUNLESS_VERIFY = makeSymbol("API-SPECIAL-PUNLESS-VERIFY");



    private static final SubLSymbol API_SPECIAL_FUNLESS = makeSymbol("API-SPECIAL-FUNLESS");

    private static final SubLSymbol API_SPECIAL_FUNLESS_VERIFY = makeSymbol("API-SPECIAL-FUNLESS-VERIFY");



    private static final SubLSymbol API_SPECIAL_WHILE = makeSymbol("API-SPECIAL-WHILE");

    private static final SubLSymbol API_SPECIAL_WHILE_VERIFY = makeSymbol("API-SPECIAL-WHILE-VERIFY");



    private static final SubLSymbol API_SPECIAL_UNTIL = makeSymbol("API-SPECIAL-UNTIL");

    private static final SubLSymbol API_SPECIAL_UNTIL_VERIFY = makeSymbol("API-SPECIAL-UNTIL-VERIFY");

    private static final SubLList $list241 = list(makeSymbol("VARS"), makeSymbol("ENDTEST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLString $str242$_S_is_not_a_valid_cdo_variable_sp = makeString("~S is not a valid cdo variable specification in SubL");



    private static final SubLSymbol API_SPECIAL_CDO = makeSymbol("API-SPECIAL-CDO");

    private static final SubLSymbol API_SPECIAL_CDO_VERIFY = makeSymbol("API-SPECIAL-CDO-VERIFY");

    private static final SubLList $list246 = list(list(makeSymbol("VARIABLE"), makeSymbol("LISTFORM")), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLSymbol API_SPECIAL_CDOLIST = makeSymbol("API-SPECIAL-CDOLIST");

    private static final SubLSymbol API_SPECIAL_CDOLIST_VERIFY = makeSymbol("API-SPECIAL-CDOLIST-VERIFY");

    private static final SubLList $list250 = list(list(makeSymbol("VARIABLE"), makeSymbol("INTEGER")), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLSymbol API_SPECIAL_CDOTIMES = makeSymbol("API-SPECIAL-CDOTIMES");

    private static final SubLSymbol API_SPECIAL_CDOTIMES_VERIFY = makeSymbol("API-SPECIAL-CDOTIMES-VERIFY");

    private static final SubLList $list254 = list(list(makeSymbol("KEY"), makeSymbol("VAL"), makeSymbol("TABLE")), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLSymbol API_SPECIAL_CDOHASH = makeSymbol("API-SPECIAL-CDOHASH");

    private static final SubLSymbol API_SPECIAL_CDOHASH_VERIFY = makeSymbol("API-SPECIAL-CDOHASH-VERIFY");

    private static final SubLList $list258 = list(makeSymbol("FUNCTION"), makeSymbol("&REST"), makeSymbol("LISTS"));



    private static final SubLSymbol API_SPECIAL_MAPCAR = makeSymbol("API-SPECIAL-MAPCAR");

    private static final SubLSymbol API_SPECIAL_MAPCAR_VERIFY = makeSymbol("API-SPECIAL-MAPCAR-VERIFY");

    private static final SubLString $str262$_S_does_not_evaluate_to_an_api_fu = makeString("~S does not evaluate to an api function object");



    private static final SubLSymbol EVAL_IN_API_MAPCAR = makeSymbol("EVAL-IN-API-MAPCAR");



    private static final SubLList $list266 = list(makeSymbol("DICT"), makeSymbol("FUNC"));

    private static final SubLSymbol MAPDICTIONARY = makeSymbol("MAPDICTIONARY");

    private static final SubLSymbol API_SPECIAL_MAPDICTIONARY = makeSymbol("API-SPECIAL-MAPDICTIONARY");

    private static final SubLSymbol API_SPECIAL_MAPDICTIONARY_VERIFY = makeSymbol("API-SPECIAL-MAPDICTIONARY-VERIFY");





    private static final SubLString $str272$Corrupted_dictionary__unsupported = makeString("Corrupted dictionary; unsupported style ~S.~%");

    private static final SubLList $list273 = list(makeSymbol("DICT"), makeSymbol("FUNC"), makeSymbol("ARGS"));

    private static final SubLSymbol MAPDICTIONARY_PARAMETERIZED = makeSymbol("MAPDICTIONARY-PARAMETERIZED");

    private static final SubLSymbol API_SPECIAL_MAPDICTIONARY_PARAMETERIZED = makeSymbol("API-SPECIAL-MAPDICTIONARY-PARAMETERIZED");

    private static final SubLSymbol API_SPECIAL_MAPDICTIONARY_PARAMETERIZED_VERIFY = makeSymbol("API-SPECIAL-MAPDICTIONARY-PARAMETERIZED-VERIFY");

    private static final SubLString $str277$evaluated_dict = makeString("evaluated-dict");

    private static final SubLString $str278$evaluated_func = makeString("evaluated-func");

    private static final SubLString $str279$evaluated_args = makeString("evaluated-args");

    private static final SubLList $list280 = list(makeSymbol("TAG"), makeSymbol("ANS-VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLSymbol API_SPECIAL_CCATCH = makeSymbol("API-SPECIAL-CCATCH");

    private static final SubLSymbol API_SPECIAL_CCATCH_VERIFY = makeSymbol("API-SPECIAL-CCATCH-VERIFY");

    private static final SubLList $list284 = list(makeSymbol("ANSWER-VARIABLE"));

    private static final SubLSymbol ANSWER_VARIABLE = makeSymbol("ANSWER-VARIABLE");

    private static final SubLSymbol EVAL_IN_API_CSETQ = makeSymbol("EVAL-IN-API-CSETQ");

    private static final SubLList $list287 = list(makeSymbol("TAG"), makeSymbol("RESULT"));

    private static final SubLSymbol THROW = makeSymbol("THROW");

    private static final SubLSymbol API_SPECIAL_THROW = makeSymbol("API-SPECIAL-THROW");

    private static final SubLSymbol API_SPECIAL_THROW_VERIFY = makeSymbol("API-SPECIAL-THROW-VERIFY");

    private static final SubLSymbol EVAL_IN_API_INTERNAL = makeSymbol("EVAL-IN-API-INTERNAL");

    private static final SubLSymbol IGNORE_ERRORS = makeSymbol("IGNORE-ERRORS");

    private static final SubLSymbol API_SPECIAL_IGNORE_ERRORS = makeSymbol("API-SPECIAL-IGNORE-ERRORS");

    private static final SubLSymbol API_SPECIAL_IGNORE_ERRORS_VERIFY = makeSymbol("API-SPECIAL-IGNORE-ERRORS-VERIFY");

    private static final SubLList $list295 = list(makeSymbol("LOCAL-RESULTS"));

    private static final SubLSymbol LOCAL_RESULTS = makeSymbol("LOCAL-RESULTS");

    public static final SubLList $list297 = list(makeSymbol("PROTECTED-FORM"), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLSymbol API_SPECIAL_CUNWIND_PROTECT = makeSymbol("API-SPECIAL-CUNWIND-PROTECT");

    private static final SubLSymbol API_SPECIAL_CUNWIND_PROTECT_VERIFY = makeSymbol("API-SPECIAL-CUNWIND-PROTECT-VERIFY");

    private static final SubLSymbol $sym301$_ = makeSymbol(">");

    private static final SubLList $list302 = list(makeSymbol("LENGTH"), makeSymbol("*EVAL-IN-API-ENV*"));

    private static final SubLList $list303 = list(list(makeSymbol("CPOP"), makeSymbol("*EVAL-IN-API-ENV*")));

    private static final SubLString $str304$eval_in_api_cunwind_protect = makeString("eval-in-api-cunwind-protect");

    public static final SubLList $list305 = list(makeSymbol("FILENAME"));

    private static final SubLSymbol LOAD = makeSymbol("LOAD");

    private static final SubLSymbol API_SPECIAL_LOAD = makeSymbol("API-SPECIAL-LOAD");

    private static final SubLSymbol API_SPECIAL_LOAD_VERIFY = makeSymbol("API-SPECIAL-LOAD-VERIFY");







    private static final SubLSymbol $IF_DOES_NOT_EXIST = makeKeyword("IF-DOES-NOT-EXIST");

    private static final SubLString $str313$_S_does_not_exist__cannot_load = makeString("~S does not exist, cannot load");





    private static final SubLString $str316$__Read_error_occured_at_position_ = makeString("~%Read error occured at position ~A of file ~A");

    private static final SubLList $list317 = list(makeSymbol("OBJECT"), makeSymbol("PRED"));

    private static final SubLString $str318$_A_is_not_a__A = makeString("~A is not a ~A");



    private static final SubLSymbol API_SPECIAL_CHECK_TYPE = makeSymbol("API-SPECIAL-CHECK-TYPE");

    private static final SubLSymbol API_SPECIAL_CHECK_TYPE_VERIFY = makeSymbol("API-SPECIAL-CHECK-TYPE-VERIFY");

    private static final SubLSymbol API_SPECIAL_QUOTE = makeSymbol("API-SPECIAL-QUOTE");

    private static final SubLSymbol API_SPECIAL_QUOTE_VERIFY = makeSymbol("API-SPECIAL-QUOTE-VERIFY");



    private static final SubLSymbol API_SPECIAL_BOUNDP = makeSymbol("API-SPECIAL-BOUNDP");

    private static final SubLSymbol API_SPECIAL_BOUNDP_VERIFY = makeSymbol("API-SPECIAL-BOUNDP-VERIFY");



    private static final SubLSymbol API_SPECIAL_SYMBOL_VALUE = makeSymbol("API-SPECIAL-SYMBOL-VALUE");

    private static final SubLSymbol API_SPECIAL_SYMBOL_VALUE_VERIFY = makeSymbol("API-SPECIAL-SYMBOL-VALUE-VERIFY");

    private static final SubLList $list330 = list(makeSymbol("FNAME"));



    private static final SubLSymbol API_SPECIAL_FUNCTION = makeSymbol("API-SPECIAL-FUNCTION");

    private static final SubLSymbol API_SPECIAL_FUNCTION_VERIFY = makeSymbol("API-SPECIAL-FUNCTION-VERIFY");

    private static final SubLList $list334 = list(makeSymbol("FORMAT-STRING"), makeSymbol("&REST"), makeSymbol("ARGUMENTS"));



    private static final SubLSymbol API_SPECIAL_ERROR = makeSymbol("API-SPECIAL-ERROR");

    private static final SubLSymbol API_SPECIAL_ERROR_VERIFY = makeSymbol("API-SPECIAL-ERROR-VERIFY");

    private static final SubLString $str338$___S = makeString("~%~S");

    private static final SubLSymbol BREAK = makeSymbol("BREAK");

    private static final SubLSymbol API_SPECIAL_BREAK = makeSymbol("API-SPECIAL-BREAK");

    private static final SubLSymbol API_SPECIAL_BREAK_VERIFY = makeSymbol("API-SPECIAL-BREAK-VERIFY");

    private static final SubLString $str342$Can_only_clear_the_environment_fr = makeString("Can only clear the environment from the top level");

    private static final SubLSymbol CLEAR_ENVIRONMENT = makeSymbol("CLEAR-ENVIRONMENT");

    private static final SubLSymbol API_SPECIAL_CLEAR_ENVIRONMENT = makeSymbol("API-SPECIAL-CLEAR-ENVIRONMENT");

    private static final SubLSymbol API_SPECIAL_CLEAR_ENVIRONMENT_VERIFY = makeSymbol("API-SPECIAL-CLEAR-ENVIRONMENT-VERIFY");

    private static final SubLSymbol GET_ENVIRONMENT = makeSymbol("GET-ENVIRONMENT");

    private static final SubLSymbol API_SPECIAL_GET_ENVIRONMENT = makeSymbol("API-SPECIAL-GET-ENVIRONMENT");

    private static final SubLSymbol API_SPECIAL_GET_ENVIRONMENT_VERIFY = makeSymbol("API-SPECIAL-GET-ENVIRONMENT-VERIFY");

    private static final SubLList $list349 = list(makeSymbol("PACKAGE"));



    private static final SubLSymbol API_SPECIAL_IN_PACKAGE = makeSymbol("API-SPECIAL-IN-PACKAGE");

    private static final SubLSymbol API_SPECIAL_IN_PACKAGE_VERIFY = makeSymbol("API-SPECIAL-IN-PACKAGE-VERIFY");

    private static final SubLList $list353 = list(makeSymbol("VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLSymbol API_SPECIAL_CTIME = makeSymbol("API-SPECIAL-CTIME");

    private static final SubLSymbol API_SPECIAL_CTIME_VERIFY = makeSymbol("API-SPECIAL-CTIME-VERIFY");

    private static final SubLSymbol WITH_TEMP_VARS = makeSymbol("WITH-TEMP-VARS");

    private static final SubLList $list358 = list(makeSymbol("TEMP-VAR"));

    private static final SubLSymbol TEMP_VAR = makeSymbol("TEMP-VAR");

    private static final SubLSymbol WITH_EVAL_IN_API_ENV = makeSymbol("WITH-EVAL-IN-API-ENV");

    private static final SubLString $str361$eval_in_api_ctime = makeString("eval-in-api-ctime");

    private static final SubLList $list362 = list(makeSymbol("STRING"), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLSymbol API_SPECIAL_NOTING_PERCENT_PROGRESS = makeSymbol("API-SPECIAL-NOTING-PERCENT-PROGRESS");

    private static final SubLSymbol API_SPECIAL_NOTING_PERCENT_PROGRESS_VERIFY = makeSymbol("API-SPECIAL-NOTING-PERCENT-PROGRESS-VERIFY");

    private static final SubLString $str366$eval_in_api_noting_percent_progre = makeString("eval-in-api-noting-percent-progress");

    private static final SubLSymbol NOTING_ACTIVITY = makeSymbol("NOTING-ACTIVITY");

    private static final SubLSymbol API_SPECIAL_NOTING_ACTIVITY = makeSymbol("API-SPECIAL-NOTING-ACTIVITY");

    private static final SubLSymbol API_SPECIAL_NOTING_ACTIVITY_VERIFY = makeSymbol("API-SPECIAL-NOTING-ACTIVITY-VERIFY");

    private static final SubLString $str370$eval_in_api_noting_activity = makeString("eval-in-api-noting-activity");



    public static SubLObject cyc_api_eval(final SubLObject api_request) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $eval_in_apiP$.getDynamicValue(thread)) {
            return eval_in_api(api_request);
        }
        return eval_in_api_subl_eval(api_request);
    }

    public static SubLObject possibly_cyc_api_eval(final SubLObject api_request) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $eval_in_apiP$.getDynamicValue(thread)) {
            return eval_in_api(api_request);
        }
        return eval(api_request);
    }

    public static SubLObject possibly_cyc_api_apply(final SubLObject func, final SubLObject args) {
        if (func.isFunctionSpec()) {
            return apply(func, args);
        }
        return cyc_api_eval(bq_cons(func, append(Mapping.mapcar(symbol_function(QUOTIFY), args), NIL)));
    }

    public static SubLObject possibly_cyc_api_function_spec_p(final SubLObject v_object) {
        return makeBoolean(v_object.isFunctionSpec() || (v_object.isSymbol() && (NIL != api_function_p(v_object))));
    }

    public static SubLObject possibly_cyc_api_funcall_1(final SubLObject func, final SubLObject arg1) {
        if (func.isFunctionSpec()) {
            return subl_promotions.funcall_1(func, arg1);
        }
        return cyc_api_eval(list(func, list_utilities.quotify(arg1)));
    }

    public static SubLObject possibly_cyc_api_funcall_2(final SubLObject func, final SubLObject arg1, final SubLObject arg2) {
        if (func.isFunctionSpec()) {
            return subl_promotions.funcall_2(func, arg1, arg2);
        }
        return cyc_api_eval(list(func, list_utilities.quotify(arg1), list_utilities.quotify(arg2)));
    }

    public static SubLObject possibly_cyc_api_funcall_3(final SubLObject func, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3) {
        if (func.isFunctionSpec()) {
            return subl_promotions.funcall_3(func, arg1, arg2, arg3);
        }
        return cyc_api_eval(list(func, list_utilities.quotify(arg1), list_utilities.quotify(arg2), list_utilities.quotify(arg3)));
    }

    public static SubLObject possibly_cyc_api_funcall_4(final SubLObject func, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4) {
        if (func.isFunctionSpec()) {
            return subl_promotions.funcall_4(func, arg1, arg2, arg3, arg4);
        }
        return cyc_api_eval(list(func, list_utilities.quotify(arg1), list_utilities.quotify(arg2), list_utilities.quotify(arg3), list_utilities.quotify(arg4)));
    }

    public static SubLObject register_api_mutable_global(final SubLObject var) {
        $eval_in_api_mutable_globals$.setGlobalValue(cons(var, $eval_in_api_mutable_globals$.getGlobalValue()));
        return var;
    }

    public static SubLObject api_mutable_global_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $eval_in_api_mutable_globals$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject register_api_immutable_global(final SubLObject var) {
        $eval_in_api_immutable_globals$.setGlobalValue(cons(var, $eval_in_api_immutable_globals$.getGlobalValue()));
        return var;
    }

    public static SubLObject api_immutable_global_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $eval_in_api_immutable_globals$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject api_lexical_variable_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(v_object.isSymbol() && (NIL != list_utilities.sublisp_boolean(assoc(v_object, $eval_in_api_env$.getDynamicValue(thread), symbol_function(EQ), UNPROVIDED))));
    }

    public static SubLObject api_dynamic_variable_p(final SubLObject v_object) {
        return makeBoolean((v_object.isSymbol() && (NIL == api_lexical_variable_p(v_object))) && (NIL != api_mutable_global_p(v_object)));
    }

    public static SubLObject api_special_verify_p(final SubLObject operator) {
        return list_utilities.sublisp_boolean(gethash(operator, $api_special_verify_table$.getGlobalValue(), NIL));
    }

    public static SubLObject api_special_verify_handler(final SubLObject operator) {
        return gethash(operator, $api_special_verify_table$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject register_api_special_verify(final SubLObject operator, final SubLObject handler) {
        sethash(operator, $api_special_verify_table$.getGlobalValue(), handler);
        return operator;
    }

    public static SubLObject api_function_p(final SubLObject operator) {
        return list_utilities.sublisp_boolean(gethash(operator, $api_function_table$.getGlobalValue(), NIL));
    }

    public static SubLObject api_function_handler(final SubLObject operator) {
        return gethash(operator, $api_function_table$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject register_api_function(final SubLObject operator, final SubLObject handler) {
        sethash(operator, $api_function_table$.getGlobalValue(), handler);
        return operator;
    }

    public static SubLObject api_macro_p(final SubLObject operator) {
        return list_utilities.sublisp_boolean(gethash(operator, $api_macro_table$.getGlobalValue(), NIL));
    }

    public static SubLObject api_macro_expander(final SubLObject operator) {
        return gethash(operator, $api_macro_table$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject register_api_macro(final SubLObject operator, final SubLObject expander) {
        sethash(operator, $api_macro_table$.getGlobalValue(), expander);
        return operator;
    }

    public static SubLObject defspecial_in_api(final SubLObject macroform, final SubLObject environment) {
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
        final SubLObject form = $sym8$FORM;
        final SubLObject special_handler = intern(format(NIL, $str9$API_SPECIAL__A, name), UNPROVIDED);
        return list(PROGN, list(DEFINE_PRIVATE, special_handler, list(form), listS(CDESTRUCTURING_BIND, arglist, list(CDR, form), append(body, NIL))), list(REGISTER_API_SPECIAL, list(QUOTE, name), list(QUOTE, special_handler)));
    }

    public static SubLObject defspecial_in_api_verify(final SubLObject macroform, final SubLObject environment) {
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
        final SubLObject form = $sym16$FORM;
        final SubLObject special_handler = intern(format(NIL, $str17$API_SPECIAL__A_VERIFY, name), UNPROVIDED);
        return list(PROGN, list(DEFINE_PRIVATE, special_handler, list(form), listS(CDESTRUCTURING_BIND, arglist, list(CDR, form), append(body, NIL))), list(REGISTER_API_SPECIAL_VERIFY, list(QUOTE, name), list(QUOTE, special_handler)));
    }

    public static SubLObject with_eval_in_api_subl_evaluation(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list22, append(body, NIL));
    }

    public static SubLObject eval_in_api_subl_eval(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = $evaluator_method$.currentBinding(thread);
        try {
            $evaluator_method$.bind($subl_eval_method$.getGlobalValue(), thread);
            v_answer = funcall($subl_eval_method$.getGlobalValue(), form);
        } finally {
            $evaluator_method$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject eval_in_api_subl_apply(final SubLObject function, final SubLObject v_arguments) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = $evaluator_method$.currentBinding(thread);
        try {
            $evaluator_method$.bind($subl_eval_method$.getGlobalValue(), thread);
            v_answer = apply(function, v_arguments);
        } finally {
            $evaluator_method$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject eval_in_api_subl_funcall(final SubLObject function, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4) {
        final SubLObject arg1_p = makeBoolean(arg1 != UNPROVIDED);
        final SubLObject arg2_p = makeBoolean(arg2 != UNPROVIDED);
        final SubLObject arg3_p = makeBoolean(arg3 != UNPROVIDED);
        final SubLObject arg4_p = makeBoolean(arg4 != UNPROVIDED);
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = $evaluator_method$.currentBinding(thread);
        try {
            $evaluator_method$.bind($subl_eval_method$.getGlobalValue(), thread);
            if (NIL != arg4_p) {
                v_answer = funcall(function, arg1, arg2, arg3, arg4);
            } else
                if (NIL != arg3_p) {
                    v_answer = funcall(function, arg1, arg2, arg3);
                } else
                    if (NIL != arg2_p) {
                        v_answer = funcall(function, arg1, arg2);
                    } else
                        if (NIL != arg1_p) {
                            v_answer = funcall(function, arg1);
                        } else {
                            v_answer = funcall(function);
                        }



        } finally {
            $evaluator_method$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject with_clean_eval_in_api_environment(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list23, append(body, NIL));
    }

    public static SubLObject initialize_eval_in_api_env() {
        return NIL;
    }

    public static SubLObject eval_in_api(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $eval_in_api_level$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $eval_in_api_function_level$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $eval_in_api_macro_stack$.currentBinding(thread);
        try {
            $eval_in_api_level$.bind(MINUS_ONE_INTEGER, thread);
            $eval_in_api_function_level$.bind(MINUS_ONE_INTEGER, thread);
            $eval_in_api_macro_stack$.bind(NIL, thread);
            SubLObject error_message = NIL;
            final SubLObject env_depth_upon_entering = length($eval_in_api_env$.getDynamicValue(thread));
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0_$1 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        result = arg2(thread.resetMultipleValues(), multiple_value_list(eval_in_api_internal(form)));
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0_$1, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
            if (NIL != error_message) {
                while (length($eval_in_api_env$.getDynamicValue(thread)).numG(env_depth_upon_entering)) {
                    $eval_in_api_env$.setDynamicValue($eval_in_api_env$.getDynamicValue(thread).rest(), thread);
                } 
                Errors.error(error_message);
            }
        } finally {
            $eval_in_api_macro_stack$.rebind(_prev_bind_3, thread);
            $eval_in_api_function_level$.rebind(_prev_bind_2, thread);
            $eval_in_api_level$.rebind(_prev_bind_0, thread);
        }
        return subl_promotions.values_list(result);
    }

    public static SubLObject valid_api_operator_p(final SubLObject operator) {
        SubLTrampolineFile.enforceType(operator, SYMBOLP);
        return makeBoolean(((NIL != valid_api_function_p(operator)) || (NIL != valid_api_macro_p(operator))) || (NIL != api_special_p(operator)));
    }

    public static SubLObject valid_api_function_p(final SubLObject operator) {
        SubLTrampolineFile.enforceType(operator, SYMBOLP);
        return makeBoolean(((NIL != api_function_p(operator)) || (NIL != api_predefined_function_p(operator))) || (NIL != external_function_p(operator)));
    }

    public static SubLObject valid_api_macro_p(final SubLObject operator) {
        SubLTrampolineFile.enforceType(operator, SYMBOLP);
        return makeBoolean((NIL != api_macro_p(operator)) || (NIL != api_predefined_macro_p(operator)));
    }

    public static SubLObject eval_in_api_internal(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $eval_in_api_level$.currentBinding(thread);
        try {
            $eval_in_api_level$.bind(number_utilities.f_1X($eval_in_api_level$.getDynamicValue(thread)), thread);
            if (form.isCons()) {
                SubLObject operator = NIL;
                SubLObject args = NIL;
                destructuring_bind_must_consp(form, form, $list44);
                operator = form.first();
                final SubLObject current = args = form.rest();
                if (!operator.isSymbol()) {
                    eval_in_api_error($str45$Operator__S_was_not_a_symbol, operator, UNPROVIDED);
                } else
                    if (NIL != api_special_p(operator)) {
                        final SubLObject special_handler = api_special_handler(operator);
                        result = arg2(thread.resetMultipleValues(), multiple_value_list(api_funcall_special_handler(operator, special_handler, form)));
                    } else
                        if (NIL != api_macro_p(operator)) {
                            final SubLObject macro_expander = api_macro_expander(operator);
                            final SubLObject expanded_form = api_funcall_macro_expander(macro_expander, form);
                            result = arg2(thread.resetMultipleValues(), multiple_value_list(eval_in_api_internal(expanded_form)));
                        } else
                            if (NIL != api_function_p(operator)) {
                                final SubLObject function_handler = api_function_handler(operator);
                                result = arg2(thread.resetMultipleValues(), multiple_value_list(api_apply_function_handler(operator, function_handler, api_eval_args(args))));
                            } else
                                if (NIL != api_predefined_macro_p(operator)) {
                                    final SubLObject _prev_bind_0_$2 = $eval_in_api_macro_stack$.currentBinding(thread);
                                    try {
                                        $eval_in_api_macro_stack$.bind(cons(operator, $eval_in_api_macro_stack$.getDynamicValue(thread)), thread);
                                        final SubLObject expanded_form = api_expand_predefined_macro(form);
                                        result = arg2(thread.resetMultipleValues(), multiple_value_list(eval_in_api_internal(expanded_form)));
                                    } finally {
                                        $eval_in_api_macro_stack$.rebind(_prev_bind_0_$2, thread);
                                    }
                                } else
                                    if ((NIL != api_predefined_function_p(operator)) || (NIL != kb_function_p(operator))) {
                                        if (NIL != list_utilities.singletonP(args)) {
                                            result = arg2(thread.resetMultipleValues(), multiple_value_list(api_apply_predefined_function_one_arg(operator, arg2(thread.resetMultipleValues(), multiple_value_list(eval_in_api_internal(args.first()))))));
                                        } else {
                                            result = arg2(thread.resetMultipleValues(), multiple_value_list(api_apply_predefined_function(operator, api_eval_args(args))));
                                        }
                                    } else
                                        if ((operator.isFunctionSpec() && (!operator.isMacroOperator())) && ((NIL != external_symbol_p(operator)) || (NIL != macro_helper_for_any_of_macrosP(operator, $eval_in_api_macro_stack$.getDynamicValue(thread))))) {
                                            result = arg2(thread.resetMultipleValues(), multiple_value_list(api_apply_predefined_function(operator, api_eval_args(args))));
                                        } else
                                            if (operator.isMacroOperator() && ((NIL != external_symbol_p(operator)) || (NIL != macro_helper_for_any_of_macrosP(operator, $eval_in_api_macro_stack$.getDynamicValue(thread))))) {
                                                final SubLObject _prev_bind_0_$3 = $eval_in_api_macro_stack$.currentBinding(thread);
                                                try {
                                                    $eval_in_api_macro_stack$.bind(cons(operator, $eval_in_api_macro_stack$.getDynamicValue(thread)), thread);
                                                    final SubLObject expanded_form = api_expand_predefined_macro(form);
                                                    result = arg2(thread.resetMultipleValues(), multiple_value_list(eval_in_api_internal(expanded_form)));
                                                } finally {
                                                    $eval_in_api_macro_stack$.rebind(_prev_bind_0_$3, thread);
                                                }
                                            } else {
                                                eval_in_api_error($str46$Operator__S_is_not_defined_in_the, operator, UNPROVIDED);
                                            }







            } else
                if (!form.isSymbol()) {
                    result = arg2(thread.resetMultipleValues(), multiple_value_list(api_self_evaluation(form)));
                } else
                    if (NIL != constantp(form, UNPROVIDED)) {
                        result = arg2(thread.resetMultipleValues(), multiple_value_list(api_self_evaluation(form)));
                    } else
                        if (NIL != api_lexical_variable_p(form)) {
                            result = arg2(thread.resetMultipleValues(), multiple_value_list(api_lexical_variable_value(form)));
                        } else
                            if (NIL != api_user_variable_p(form)) {
                                result = arg2(thread.resetMultipleValues(), multiple_value_list(get_api_user_variable(form)));
                            } else
                                if ((NIL != api_dynamic_variable_p(form)) || (NIL != api_immutable_global_p(form))) {
                                    result = arg2(thread.resetMultipleValues(), multiple_value_list(api_dynamic_variable_value(form)));
                                } else {
                                    eval_in_api_error($str47$Variable__S_is_unbound, form, UNPROVIDED);
                                }





        } finally {
            $eval_in_api_level$.rebind(_prev_bind_0, thread);
        }
        return subl_promotions.values_list(result);
    }

    public static SubLObject api_eval_args(final SubLObject args) {
        final SubLObject evalled_args = make_list(length(args), UNPROVIDED);
        SubLObject rest_args;
        SubLObject rest_evalled_args;
        for (rest_args = NIL, rest_evalled_args = NIL, rest_args = args, rest_evalled_args = evalled_args; NIL != rest_args; rest_args = rest_args.rest() , rest_evalled_args = rest_evalled_args.rest()) {
            rplaca(rest_evalled_args, eval_in_api_internal(rest_args.first()));
        }
        return evalled_args;
    }

    public static SubLObject eval_in_api_error(SubLObject format_string, SubLObject arg1, SubLObject arg2) {
        if (format_string == UNPROVIDED) {
            format_string = $$$API_ERROR;
        }
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        return Errors.error(format_string, arg1, arg2);
    }

    public static SubLObject api_self_evaluation(final SubLObject v_object) {
        return v_object;
    }

    public static SubLObject api_dynamic_variable_value(final SubLObject symbol) {
        if (NIL != boundp(symbol)) {
            return symbol_value(symbol);
        }
        if (NIL != fboundp(symbol)) {
            return symbol_function(symbol);
        }
        eval_in_api_error($str49$Attempt_to_obtain_the_value_of_sy, symbol, UNPROVIDED);
        return NIL;
    }

    public static SubLObject api_lexical_variable_value(final SubLObject symbol) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return assoc(symbol, $eval_in_api_env$.getDynamicValue(thread), symbol_function(EQ), UNPROVIDED).rest();
    }

    public static SubLObject api_apply_predefined_function(final SubLObject operator, final SubLObject evaluated_args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = NIL;
        SubLObject form_in_env = NIL;
        SubLObject clet_vars = NIL;
        SubLObject clet_var_values = NIL;
        SubLObject clet_var = NIL;
        SubLObject clet_value = NIL;
        SubLObject quoted_evaluated_args = NIL;
        final SubLObject _prev_bind_0 = $eval_in_api_function_level$.currentBinding(thread);
        try {
            $eval_in_api_function_level$.bind(number_utilities.f_1X($eval_in_api_function_level$.getDynamicValue(thread)), thread);
            if (NIL != eval_in_api_traced_fnP(operator)) {
                eval_in_api_enter_trace_display(operator, evaluated_args);
            }
            SubLObject cdolist_list_var = $eval_in_api_env$.getDynamicValue(thread);
            SubLObject binding = NIL;
            binding = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                clet_var = binding.first();
                clet_vars = cons(clet_var, clet_vars);
                clet_value = binding.rest();
                clet_var_values = cons(list(clet_var, list(QUOTE, clet_value)), clet_var_values);
                cdolist_list_var = cdolist_list_var.rest();
                binding = cdolist_list_var.first();
            } 
            cdolist_list_var = evaluated_args;
            SubLObject evaluated_arg = NIL;
            evaluated_arg = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                quoted_evaluated_args = cons(list(QUOTE, evaluated_arg), quoted_evaluated_args);
                cdolist_list_var = cdolist_list_var.rest();
                evaluated_arg = cdolist_list_var.first();
            } 
            quoted_evaluated_args = nreverse(quoted_evaluated_args);
            form_in_env = list(CLET, $list50, listS(CLET, clet_var_values, list(CSETQ, FUNCTION_RESULTS, list(MULTIPLE_VALUE_LIST, bq_cons(operator, append(quoted_evaluated_args, NIL)))), list(EVAL_IN_API_UPDATE_ENV, list(QUOTE, clet_vars)), $list50));
            results = eval_in_api_subl_eval(form_in_env);
            if (NIL != eval_in_api_traced_fnP(operator)) {
                eval_in_api_exit_trace_display(results);
            }
        } finally {
            $eval_in_api_function_level$.rebind(_prev_bind_0, thread);
        }
        return subl_promotions.values_list(results);
    }

    public static SubLObject api_apply_predefined_function_one_arg(final SubLObject operator, final SubLObject evaluated_arg_value_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = NIL;
        SubLObject form_in_env = NIL;
        SubLObject clet_vars = NIL;
        SubLObject clet_var_values = NIL;
        SubLObject clet_var = NIL;
        SubLObject clet_value = NIL;
        SubLObject evaluated_arg = NIL;
        final SubLObject _prev_bind_0 = $eval_in_api_function_level$.currentBinding(thread);
        try {
            $eval_in_api_function_level$.bind(number_utilities.f_1X($eval_in_api_function_level$.getDynamicValue(thread)), thread);
            if (NIL != eval_in_api_traced_fnP(operator)) {
                eval_in_api_enter_trace_display(operator, evaluated_arg_value_list);
            }
            SubLObject cdolist_list_var = $eval_in_api_env$.getDynamicValue(thread);
            SubLObject binding = NIL;
            binding = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                clet_var = binding.first();
                clet_vars = cons(clet_var, clet_vars);
                clet_value = binding.rest();
                clet_var_values = cons(list(clet_var, list(QUOTE, clet_value)), clet_var_values);
                cdolist_list_var = cdolist_list_var.rest();
                binding = cdolist_list_var.first();
            } 
            evaluated_arg = list(VALUES_LIST, list(QUOTE, evaluated_arg_value_list));
            form_in_env = list(CLET, $list50, listS(CLET, clet_var_values, list(CSETQ, FUNCTION_RESULTS, list(MULTIPLE_VALUE_LIST, list(operator, evaluated_arg))), list(EVAL_IN_API_UPDATE_ENV, list(QUOTE, clet_vars)), $list50));
            results = eval_in_api_subl_eval(form_in_env);
            if (NIL != eval_in_api_traced_fnP(operator)) {
                eval_in_api_exit_trace_display(results);
            }
        } finally {
            $eval_in_api_function_level$.rebind(_prev_bind_0, thread);
        }
        return subl_promotions.values_list(results);
    }

    public static SubLObject api_expand_predefined_macro(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject form_in_env = NIL;
        SubLObject result = NIL;
        SubLObject clet_vars = NIL;
        SubLObject clet_var_values = NIL;
        SubLObject clet_var = NIL;
        SubLObject clet_value = NIL;
        SubLObject cdolist_list_var = $eval_in_api_env$.getDynamicValue(thread);
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            clet_var = binding.first();
            clet_var_values = cons(clet_var, clet_var_values);
            clet_value = binding.rest();
            clet_var_values = cons(list(clet_var, list(QUOTE, clet_value)), clet_var_values);
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        clet_vars = nreverse(clet_vars);
        clet_var_values = nreverse(clet_var_values);
        form_in_env = list(CLET, $list56, listS(CLET, clet_vars, list(CSETQ, MACRO_RESULT, list(MACROEXPAND_1, list(QUOTE, form))), list(EVAL_IN_API_UPDATE_ENV, list(QUOTE, clet_vars)), $list56));
        result = eval_in_api_subl_eval(form_in_env);
        return result;
    }

    public static SubLObject api_funcall_special_handler(final SubLObject operator, final SubLObject special_handler, final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $eval_in_api_function_level$.currentBinding(thread);
        try {
            $eval_in_api_function_level$.bind($eval_in_api_function_level$.getDynamicValue(thread), thread);
            if (NIL != eval_in_api_traced_fnP(operator)) {
                $eval_in_api_function_level$.setDynamicValue(add($eval_in_api_function_level$.getDynamicValue(thread), ONE_INTEGER), thread);
                eval_in_api_enter_trace_display(form.first(), form.rest());
            }
            result = arg2(thread.resetMultipleValues(), multiple_value_list(eval_in_api_subl_funcall(special_handler, form, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            if (NIL != eval_in_api_traced_fnP(operator)) {
                eval_in_api_exit_trace_display(result);
            }
        } finally {
            $eval_in_api_function_level$.rebind(_prev_bind_0, thread);
        }
        return subl_promotions.values_list(result);
    }

    public static SubLObject api_funcall_special_verify_handler(final SubLObject operator, final SubLObject special_handler, final SubLObject form) {
        SubLObject result = NIL;
        result = arg2(resetMultipleValues(), multiple_value_list(eval_in_api_subl_funcall(special_handler, form, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        return subl_promotions.values_list(result);
    }

    public static SubLObject api_apply_function_handler(final SubLObject operator, final SubLObject function_handler, final SubLObject evaluated_args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = NIL;
        final SubLObject env_depth_upon_entering = length($eval_in_api_env$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = $eval_in_api_function_level$.currentBinding(thread);
        try {
            $eval_in_api_function_level$.bind($eval_in_api_function_level$.getDynamicValue(thread), thread);
            if (NIL != eval_in_api_traced_fnP(operator)) {
                $eval_in_api_function_level$.setDynamicValue(add($eval_in_api_function_level$.getDynamicValue(thread), ONE_INTEGER), thread);
                eval_in_api_enter_trace_display(operator, evaluated_args);
            }
            try {
                thread.throwStack.push($EVAL_IN_API_RET);
                results = arg2(thread.resetMultipleValues(), multiple_value_list(function_handler.isCons() ? api_apply_lambda(function_handler, evaluated_args) : eval_in_api_subl_apply(function_handler, evaluated_args)));
            } catch (final Throwable ccatch_env_var) {
                results = Errors.handleThrowable(ccatch_env_var, $EVAL_IN_API_RET);
            } finally {
                thread.throwStack.pop();
            }
            if (NIL != eval_in_api_traced_fnP(operator)) {
                eval_in_api_exit_trace_display(results);
            }
            while (length($eval_in_api_env$.getDynamicValue(thread)).numG(env_depth_upon_entering)) {
                $eval_in_api_env$.setDynamicValue($eval_in_api_env$.getDynamicValue(thread).rest(), thread);
            } 
        } finally {
            $eval_in_api_function_level$.rebind(_prev_bind_0, thread);
        }
        return subl_promotions.values_list(results);
    }

    public static SubLObject api_apply_lambda(final SubLObject lambda_expression, final SubLObject evaluated_args) {
        SubLObject results = NIL;
        final SubLObject lambda_list = second(lambda_expression);
        final SubLObject body = lambda_expression.rest().rest();
        SubLObject form_to_eval = NIL;
        form_to_eval = macroexpand_1(listS(CDESTRUCTURING_BIND, lambda_list, list(QUOTE, evaluated_args), append(body, NIL)), UNPROVIDED);
        results = arg2(resetMultipleValues(), multiple_value_list(eval_in_api_internal(form_to_eval)));
        return subl_promotions.values_list(results);
    }

    public static SubLObject api_funcall_macro_expander(final SubLObject macro_expander, final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = NIL;
        final SubLObject env_depth_upon_entering = length($eval_in_api_env$.getDynamicValue(thread));
        try {
            thread.throwStack.push($EVAL_IN_API_RET);
            results = arg2(thread.resetMultipleValues(), multiple_value_list(macro_expander.isCons() ? api_apply_lambda(macro_expander, list(form)) : eval_in_api_subl_funcall(macro_expander, form, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        } catch (final Throwable ccatch_env_var) {
            results = Errors.handleThrowable(ccatch_env_var, $EVAL_IN_API_RET);
        } finally {
            thread.throwStack.pop();
        }
        while (length($eval_in_api_env$.getDynamicValue(thread)).numG(env_depth_upon_entering)) {
            $eval_in_api_env$.setDynamicValue($eval_in_api_env$.getDynamicValue(thread).rest(), thread);
        } 
        return subl_promotions.values_list(results);
    }

    public static SubLObject with_eval_in_api_env(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(WITH_EVAL_IN_API_ENV_INT, list(QUOTE, body));
    }

    public static SubLObject with_eval_in_api_env_int(final SubLObject body) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = NIL;
        SubLObject form_to_eval = NIL;
        SubLObject clet_vars = NIL;
        SubLObject clet_var_values = NIL;
        SubLObject clet_var = NIL;
        SubLObject clet_value = NIL;
        SubLObject cdolist_list_var = $eval_in_api_env$.getDynamicValue(thread);
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            clet_var = binding.first();
            clet_vars = cons(clet_var, clet_vars);
            clet_value = binding.rest();
            clet_var_values = cons(list(clet_var, list(QUOTE, clet_value)), clet_var_values);
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        clet_vars = nreverse(clet_vars);
        clet_var_values = nreverse(clet_var_values);
        form_to_eval = list(CLET, $list61, listS(CLET, clet_var_values, list(CSETQ, BODY_RESULTS, list(MULTIPLE_VALUE_LIST, list(EVAL_IN_API_PROGN_BODY, list(QUOTE, body)))), list(EVAL_IN_API_UPDATE_ENV, list(QUOTE, clet_vars)), $list61));
        trace_me($str64$with_eval_in_api_env_int, form_to_eval, UNPROVIDED, UNPROVIDED);
        results = eval_in_api_subl_eval(form_to_eval);
        return subl_promotions.values_list(results);
    }

    public static SubLObject eval_in_api_update_env(final SubLObject clet_vars) {
        SubLObject cdolist_list_var = clet_vars;
        SubLObject clet_var = NIL;
        clet_var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != boundp(clet_var)) {
                final SubLObject quoted_value = list(QUOTE, symbol_value(clet_var));
                eval_in_api_csetq(clet_var, quoted_value, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            clet_var = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject verify_in_api(final SubLObject form, SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $verify_in_api_bound_symbols$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $verify_in_api_fbound_symbols$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $verify_in_api_verbose_modeP$.currentBinding(thread);
        try {
            $verify_in_api_bound_symbols$.bind(NIL, thread);
            $verify_in_api_fbound_symbols$.bind(NIL, thread);
            $verify_in_api_verbose_modeP$.bind(verboseP, thread);
            result = list_utilities.fast_delete_duplicates(verify_form_in_api_internal(form), symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            $verify_in_api_verbose_modeP$.rebind(_prev_bind_3, thread);
            $verify_in_api_fbound_symbols$.rebind(_prev_bind_2, thread);
            $verify_in_api_bound_symbols$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject verify_args_in_api_internal(final SubLObject arglist) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = arglist;
        SubLObject form = NIL;
        form = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = nconc(result, verify_form_in_api_internal(form));
            cdolist_list_var = cdolist_list_var.rest();
            form = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject verify_form_in_api_internal(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        if (form.isCons()) {
            SubLObject operator = NIL;
            SubLObject args = NIL;
            destructuring_bind_must_consp(form, form, $list44);
            operator = form.first();
            final SubLObject current = args = form.rest();
            if (!operator.isSymbol()) {
                if (NIL != $verify_in_api_verbose_modeP$.getDynamicValue(thread)) {
                    Errors.warn($str45$Operator__S_was_not_a_symbol, operator);
                }
                result = cons(operator, result);
            } else
                if (NIL != api_special_p(operator)) {
                    final SubLObject special_handler = api_special_verify_handler(operator);
                    if (NIL != special_handler) {
                        result = nconc(result, api_funcall_special_handler(operator, special_handler, form));
                    } else {
                        result = cons(operator, result);
                        if (NIL != $verify_in_api_verbose_modeP$.getDynamicValue(thread)) {
                            Errors.warn($str66$don_t_know_how_to_handle_special_, operator);
                        }
                    }
                } else
                    if (NIL != api_macro_p(operator)) {
                        final SubLObject macro_expander = api_macro_expander(operator);
                        final SubLObject expanded_form = api_funcall_macro_expander(macro_expander, form);
                        result = nconc(result, verify_form_in_api_internal(expanded_form));
                    } else
                        if (NIL != api_function_p(operator)) {
                            final SubLObject function_handler = api_function_handler(operator);
                            result = nconc(result, verify_form_in_api_internal(args));
                        } else
                            if (NIL != api_predefined_macro_p(operator)) {
                                final SubLObject _prev_bind_0 = $verify_in_api_macro_stack$.currentBinding(thread);
                                try {
                                    $verify_in_api_macro_stack$.bind(cons(operator, $verify_in_api_macro_stack$.getDynamicValue(thread)), thread);
                                    final SubLObject expanded_form = api_expand_predefined_macro(form);
                                    result = nconc(result, verify_form_in_api_internal(expanded_form));
                                } finally {
                                    $verify_in_api_macro_stack$.rebind(_prev_bind_0, thread);
                                }
                            } else
                                if ((NIL != api_predefined_function_p(operator)) || (NIL != kb_function_p(operator))) {
                                    if (NIL != list_utilities.singletonP(args)) {
                                        result = nconc(result, verify_form_in_api_internal(args.first()));
                                    } else {
                                        result = nconc(result, verify_args_in_api_internal(args));
                                    }
                                } else
                                    if ((operator.isFunctionSpec() && (!operator.isMacroOperator())) && ((NIL != macro_helper_for_any_of_macrosP(operator, $verify_in_api_macro_stack$.getDynamicValue(thread))) || (NIL != external_symbol_p(operator)))) {
                                        result = nconc(result, verify_args_in_api_internal(args));
                                    } else
                                        if (operator.isMacroOperator() && ((NIL != external_symbol_p(operator)) || (NIL != macro_helper_for_any_of_macrosP(operator, $verify_in_api_macro_stack$.getDynamicValue(thread))))) {
                                            final SubLObject _prev_bind_0 = $verify_in_api_macro_stack$.currentBinding(thread);
                                            try {
                                                $verify_in_api_macro_stack$.bind(cons(operator, $verify_in_api_macro_stack$.getDynamicValue(thread)), thread);
                                                final SubLObject expanded_form = api_expand_predefined_macro(form);
                                                result = nconc(result, verify_form_in_api_internal(expanded_form));
                                            } finally {
                                                $verify_in_api_macro_stack$.rebind(_prev_bind_0, thread);
                                            }
                                        } else
                                            if (NIL == subl_promotions.memberP(operator, $verify_in_api_fbound_symbols$.getDynamicValue(thread), symbol_function(EQL), UNPROVIDED)) {
                                                if (NIL != $verify_in_api_verbose_modeP$.getDynamicValue(thread)) {
                                                    Errors.warn($str46$Operator__S_is_not_defined_in_the, operator);
                                                }
                                                result = cons(operator, result);
                                            }








        } else {
            result = nconc(result, verify_symbol_in_api_internal(form));
        }
        return result;
    }

    public static SubLObject verify_symbol_in_api_internal(final SubLObject symbol) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        if (symbol.isSymbol()) {
            if (NIL == constantp(symbol, UNPROVIDED)) {
                if (NIL == api_lexical_variable_p(symbol)) {
                    if (NIL == api_user_variable_p(symbol)) {
                        if (NIL == api_dynamic_variable_p(symbol)) {
                            if (NIL == api_immutable_global_p(symbol)) {
                                if (NIL == subl_promotions.memberP(symbol, $verify_in_api_bound_symbols$.getDynamicValue(thread), symbol_function(EQL), UNPROVIDED)) {
                                    if (NIL != $verify_in_api_verbose_modeP$.getDynamicValue(thread)) {
                                        Errors.warn($str47$Variable__S_is_unbound, symbol);
                                    }
                                    result = cons(symbol, result);
                                }
                            }
                        }
                    }
                }
            }
        }
        return result;
    }

    public static SubLObject api_special_ret(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject expression = NIL;
        destructuring_bind_must_consp(current, datum, $list68);
        expression = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject results = NIL;
            results = arg2(resetMultipleValues(), multiple_value_list(eval_in_api_internal(expression)));
            return sublisp_throw($EVAL_IN_API_RET, results);
        }
        cdestructuring_bind_error(datum, $list68);
        return NIL;
    }

    public static SubLObject api_special_ret_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject expression = NIL;
        destructuring_bind_must_consp(current, datum, $list68);
        expression = current.first();
        current = current.rest();
        if (NIL == current) {
            return verify_form_in_api_internal(expression);
        }
        cdestructuring_bind_error(datum, $list68);
        return NIL;
    }

    public static SubLObject api_special_define(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject name = NIL;
        SubLObject arglist = NIL;
        destructuring_bind_must_consp(current, datum, $list7);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        arglist = current.first();
        SubLObject body;
        current = body = current.rest();
        if (body.first().isString()) {
            body = body.rest();
        }
        final SubLObject function_handler = listS(LAMBDA, arglist, append(body, NIL));
        register_api_function(name, function_handler);
        return name;
    }

    public static SubLObject api_special_define_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject name = NIL;
        SubLObject arglist = NIL;
        destructuring_bind_must_consp(current, datum, $list7);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        arglist = current.first();
        final SubLObject body;
        current = body = current.rest();
        return api_special_define_verify_int(name, arglist, body);
    }

    public static SubLObject api_special_define_public(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject name = NIL;
        SubLObject arglist = NIL;
        destructuring_bind_must_consp(current, datum, $list7);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        arglist = current.first();
        SubLObject body;
        current = body = current.rest();
        if (body.first().isString()) {
            body = body.rest();
        }
        final SubLObject function_handler = listS(LAMBDA, arglist, append(body, NIL));
        register_api_function(name, function_handler);
        return name;
    }

    public static SubLObject api_special_define_public_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject name = NIL;
        SubLObject arglist = NIL;
        destructuring_bind_must_consp(current, datum, $list7);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        arglist = current.first();
        final SubLObject body;
        current = body = current.rest();
        return api_special_define_verify_int(name, arglist, body);
    }

    public static SubLObject api_special_define_protected(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject name = NIL;
        SubLObject arglist = NIL;
        destructuring_bind_must_consp(current, datum, $list7);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        arglist = current.first();
        SubLObject body;
        current = body = current.rest();
        if (body.first().isString()) {
            body = body.rest();
        }
        final SubLObject function_handler = listS(LAMBDA, arglist, append(body, NIL));
        register_api_function(name, function_handler);
        return name;
    }

    public static SubLObject api_special_define_protected_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject name = NIL;
        SubLObject arglist = NIL;
        destructuring_bind_must_consp(current, datum, $list7);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        arglist = current.first();
        final SubLObject body;
        current = body = current.rest();
        return api_special_define_verify_int(name, arglist, body);
    }

    public static SubLObject api_special_define_private(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject name = NIL;
        SubLObject arglist = NIL;
        destructuring_bind_must_consp(current, datum, $list7);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        arglist = current.first();
        SubLObject body;
        current = body = current.rest();
        if (body.first().isString()) {
            body = body.rest();
        }
        final SubLObject function_handler = listS(LAMBDA, arglist, append(body, NIL));
        register_api_function(name, function_handler);
        return name;
    }

    public static SubLObject api_special_define_private_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject name = NIL;
        SubLObject arglist = NIL;
        destructuring_bind_must_consp(current, datum, $list7);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        arglist = current.first();
        final SubLObject body;
        current = body = current.rest();
        return api_special_define_verify_int(name, arglist, body);
    }

    public static SubLObject api_special_defmacro(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject name = NIL;
        SubLObject arglist = NIL;
        destructuring_bind_must_consp(current, datum, $list7);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        arglist = current.first();
        SubLObject body;
        current = body = current.rest();
        if (body.first().isString()) {
            body = body.rest();
        }
        final SubLObject form_$4 = $sym84$FORM;
        final SubLObject macro_expander = list(LAMBDA, list(form_$4), listS(CDESTRUCTURING_BIND, arglist, list(CDR, form_$4), append(body, NIL)));
        register_api_macro(name, macro_expander);
        return name;
    }

    public static SubLObject api_special_defmacro_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject name = NIL;
        SubLObject arglist = NIL;
        destructuring_bind_must_consp(current, datum, $list7);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        arglist = current.first();
        final SubLObject body;
        current = body = current.rest();
        return api_special_define_verify_int(name, arglist, body);
    }

    public static SubLObject api_special_defmacro_public(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject name = NIL;
        SubLObject arglist = NIL;
        destructuring_bind_must_consp(current, datum, $list7);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        arglist = current.first();
        SubLObject body;
        current = body = current.rest();
        if (body.first().isString()) {
            body = body.rest();
        }
        final SubLObject form_$5 = $sym88$FORM;
        final SubLObject macro_expander = list(LAMBDA, list(form_$5), listS(CDESTRUCTURING_BIND, arglist, list(CDR, form_$5), append(body, NIL)));
        register_api_macro(name, macro_expander);
        return name;
    }

    public static SubLObject api_special_defmacro_public_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject name = NIL;
        SubLObject arglist = NIL;
        destructuring_bind_must_consp(current, datum, $list7);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        arglist = current.first();
        final SubLObject body;
        current = body = current.rest();
        return api_special_define_verify_int(name, arglist, body);
    }

    public static SubLObject api_special_defmacro_protected(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject name = NIL;
        SubLObject arglist = NIL;
        destructuring_bind_must_consp(current, datum, $list7);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        arglist = current.first();
        SubLObject body;
        current = body = current.rest();
        if (body.first().isString()) {
            body = body.rest();
        }
        final SubLObject form_$6 = $sym92$FORM;
        final SubLObject macro_expander = list(LAMBDA, list(form_$6), listS(CDESTRUCTURING_BIND, arglist, list(CDR, form_$6), append(body, NIL)));
        register_api_macro(name, macro_expander);
        return name;
    }

    public static SubLObject api_special_defmacro_protected_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject name = NIL;
        SubLObject arglist = NIL;
        destructuring_bind_must_consp(current, datum, $list7);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        arglist = current.first();
        final SubLObject body;
        current = body = current.rest();
        return api_special_define_verify_int(name, arglist, body);
    }

    public static SubLObject api_special_define_verify_int(final SubLObject name, final SubLObject arglist, final SubLObject body) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $verify_in_api_bound_symbols$.currentBinding(thread);
        try {
            $verify_in_api_bound_symbols$.bind($verify_in_api_bound_symbols$.getDynamicValue(thread), thread);
            $verify_in_api_fbound_symbols$.setDynamicValue(cons(name, $verify_in_api_fbound_symbols$.getDynamicValue(thread)), thread);
            SubLObject cdolist_list_var = arglist;
            SubLObject arg = NIL;
            arg = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (arg.isSymbol()) {
                    $verify_in_api_bound_symbols$.setDynamicValue(cons(arg, $verify_in_api_bound_symbols$.getDynamicValue(thread)), thread);
                } else
                    if (arg.isCons()) {
                        $verify_in_api_bound_symbols$.setDynamicValue(cons(arg.first(), $verify_in_api_bound_symbols$.getDynamicValue(thread)), thread);
                    }

                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            } 
            result = nconc(result, verify_args_in_api_internal(body));
        } finally {
            $verify_in_api_bound_symbols$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject api_special_defstruct(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        destructuring_bind_must_consp(current, datum, $list96);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject name = NIL;
        destructuring_bind_must_consp(current, datum, $list96);
        name = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject v_slots;
            current = v_slots = temp;
            return eval_in_api_defstruct(name, v_slots);
        }
        cdestructuring_bind_error(datum, $list96);
        return NIL;
    }

    public static SubLObject api_special_defstruct_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        destructuring_bind_must_consp(current, datum, $list99);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject name = NIL;
        destructuring_bind_must_consp(current, datum, $list99);
        name = current.first();
        final SubLObject v_slots;
        current = v_slots = current.rest();
        current = temp;
        if (NIL == current) {
            return NIL;
        }
        cdestructuring_bind_error(datum, $list99);
        return NIL;
    }

    public static SubLObject eval_in_api_defstruct(final SubLObject name, final SubLObject v_slots) {
        return eval_in_api_internal(listS(DEFSTRUCT_VECTOR, list(name), append(v_slots, NIL)));
    }

    public static SubLObject api_special_fi_get_parameter(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject symbol = NIL;
        destructuring_bind_must_consp(current, datum, $list102);
        symbol = current.first();
        current = current.rest();
        if (NIL == current) {
            return eval_in_api(eval_in_api(symbol));
        }
        cdestructuring_bind_error(datum, $list102);
        return NIL;
    }

    public static SubLObject api_special_fi_get_parameter_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject symbol = NIL;
        destructuring_bind_must_consp(current, datum, $list102);
        symbol = current.first();
        current = current.rest();
        if (NIL == current) {
            return verify_symbol_in_api_internal(symbol);
        }
        cdestructuring_bind_error(datum, $list102);
        return NIL;
    }

    public static SubLObject api_special_defvar(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject symbol = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(current, datum, $list106);
        symbol = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list106);
        value = current.first();
        current = current.rest();
        if (NIL == current) {
            return eval_in_api_defvar(symbol, value);
        }
        cdestructuring_bind_error(datum, $list106);
        return NIL;
    }

    public static SubLObject api_special_defvar_verify(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject symbol = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(current, datum, $list106);
        symbol = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list106);
        value = current.first();
        current = current.rest();
        if (NIL == current) {
            $verify_in_api_fbound_symbols$.setDynamicValue(cons(symbol, $verify_in_api_fbound_symbols$.getDynamicValue(thread)), thread);
            return verify_form_in_api_internal(value);
        }
        cdestructuring_bind_error(datum, $list106);
        return NIL;
    }

    public static SubLObject api_special_defvar_private(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject symbol = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(current, datum, $list106);
        symbol = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list106);
        value = current.first();
        current = current.rest();
        if (NIL == current) {
            return eval_in_api_defvar(symbol, value);
        }
        cdestructuring_bind_error(datum, $list106);
        return NIL;
    }

    public static SubLObject api_special_defvar_private_verify(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject symbol = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(current, datum, $list106);
        symbol = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list106);
        value = current.first();
        current = current.rest();
        if (NIL == current) {
            $verify_in_api_fbound_symbols$.setDynamicValue(cons(symbol, $verify_in_api_fbound_symbols$.getDynamicValue(thread)), thread);
            return verify_form_in_api_internal(value);
        }
        cdestructuring_bind_error(datum, $list106);
        return NIL;
    }

    public static SubLObject eval_in_api_defvar(final SubLObject symbol, final SubLObject value) {
        if (NIL == api_user_variable_p(symbol)) {
            put_api_user_variable(symbol, value);
        }
        return symbol;
    }

    public static SubLObject api_user_variable_p(final SubLObject var) {
        return makeBoolean((NIL != dictionary.dictionary_p($api_user_variables$.getGlobalValue())) && (NIL != dictionary_utilities.dictionary_has_keyP($api_user_variables$.getGlobalValue(), var)));
    }

    public static SubLObject clear_api_user_variables() {
        if (NIL != $api_user_variables$.getGlobalValue()) {
            dictionary.clear_dictionary($api_user_variables$.getGlobalValue());
        } else {
            $api_user_variables$.setGlobalValue(dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject put_api_user_variable(final SubLObject var, final SubLObject value) {
        if (NIL == $api_user_variables$.getGlobalValue()) {
            $api_user_variables$.setGlobalValue(dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
        }
        dictionary.dictionary_enter($api_user_variables$.getGlobalValue(), var, value);
        return NIL;
    }

    public static SubLObject get_api_user_variable(final SubLObject var) {
        if (NIL == $api_user_variables$.getGlobalValue()) {
            $api_user_variables$.setGlobalValue(dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
        }
        return dictionary.dictionary_lookup($api_user_variables$.getGlobalValue(), var, UNPROVIDED);
    }

    public static SubLObject api_special_fi_set_parameter(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject symbol = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(current, datum, $list106);
        symbol = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list106);
        value = current.first();
        current = current.rest();
        if (NIL == current) {
            return eval_in_api_csetq(eval_in_api(symbol), value, UNPROVIDED);
        }
        cdestructuring_bind_error(datum, $list106);
        return NIL;
    }

    public static SubLObject api_special_fi_set_parameter_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject symbol = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(current, datum, $list106);
        symbol = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list106);
        value = current.first();
        current = current.rest();
        if (NIL == current) {
            return nconc(verify_symbol_in_api_internal(symbol), verify_form_in_api_internal(value));
        }
        cdestructuring_bind_error(datum, $list106);
        return NIL;
    }

    public static SubLObject api_special_csetq(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject var = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(current, datum, $list125);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list125);
        value = current.first();
        final SubLObject var_value_pairs;
        current = var_value_pairs = current.rest();
        return eval_in_api_csetq(var, value, var_value_pairs);
    }

    public static SubLObject api_special_csetq_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject var = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(current, datum, $list125);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list125);
        value = current.first();
        final SubLObject var_value_pairs;
        current = var_value_pairs = current.rest();
        return nconc(verify_symbol_in_api_internal(var), verify_form_in_api_internal(value), verify_args_in_api_internal(var_value_pairs));
    }

    public static SubLObject eval_in_api_csetq(final SubLObject var, final SubLObject value, SubLObject var_value_pairs) {
        if (var_value_pairs == UNPROVIDED) {
            var_value_pairs = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject evaluated_value = eval_in_api_internal(value);
        if (!var.isSymbol()) {
            eval_in_api_error($str128$_S_is_not_a_symbol, var, UNPROVIDED);
        } else {
            if (NIL != api_dynamic_variable_p(var)) {
                set(var, evaluated_value);
                return evaluated_value;
            }
            if (NIL == api_lexical_variable_p(var)) {
                if (NIL != api_user_variable_p(var)) {
                    put_api_user_variable(var, evaluated_value);
                    return evaluated_value;
                }
                if ($eval_in_api_level$.getDynamicValue(thread).eql(ZERO_INTEGER)) {
                    $eval_in_api_env$.setDynamicValue(cons(list(var), $eval_in_api_env$.getDynamicValue(thread)), thread);
                } else {
                    eval_in_api_error($str129$_S_is_not_defined, var, UNPROVIDED);
                }
            }
        }
        rplacd(assoc(var, $eval_in_api_env$.getDynamicValue(thread), symbol_function(EQ), UNPROVIDED), evaluated_value);
        if (NIL != var_value_pairs) {
            evaluated_value = eval_in_api_csetq(var_value_pairs.first(), second(var_value_pairs), cddr(var_value_pairs));
        }
        return evaluated_value;
    }

    public static SubLObject api_special_cinc(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject x = NIL;
        destructuring_bind_must_consp(current, datum, $list130);
        x = current.first();
        current = current.rest();
        final SubLObject delta = (current.isCons()) ? current.first() : ONE_INTEGER;
        destructuring_bind_must_listp(current, datum, $list130);
        current = current.rest();
        if (NIL == current) {
            if (NIL == api_lexical_variable_p(x)) {
                eval_in_api_error($str131$_S_is_not_an_api_variable, x, UNPROVIDED);
            }
            final SubLObject current_value = api_lexical_variable_value(x);
            final SubLObject new_value = add(current_value, delta);
            rplacd(assoc(x, $eval_in_api_env$.getDynamicValue(thread), symbol_function(EQ), UNPROVIDED), new_value);
            return x;
        }
        cdestructuring_bind_error(datum, $list130);
        return NIL;
    }

    public static SubLObject api_special_cinc_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject x = NIL;
        destructuring_bind_must_consp(current, datum, $list130);
        x = current.first();
        current = current.rest();
        final SubLObject delta = (current.isCons()) ? current.first() : ONE_INTEGER;
        destructuring_bind_must_listp(current, datum, $list130);
        current = current.rest();
        if (NIL == current) {
            return nconc(verify_form_in_api_internal(x), verify_form_in_api_internal(delta));
        }
        cdestructuring_bind_error(datum, $list130);
        return NIL;
    }

    public static SubLObject api_special_cdec(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject x = NIL;
        destructuring_bind_must_consp(current, datum, $list130);
        x = current.first();
        current = current.rest();
        final SubLObject delta = (current.isCons()) ? current.first() : ONE_INTEGER;
        destructuring_bind_must_listp(current, datum, $list130);
        current = current.rest();
        if (NIL == current) {
            if (NIL == api_lexical_variable_p(x)) {
                eval_in_api_error($str131$_S_is_not_an_api_variable, x, UNPROVIDED);
            }
            final SubLObject current_value = api_lexical_variable_value(x);
            final SubLObject new_value = subtract(current_value, delta);
            rplacd(assoc(x, $eval_in_api_env$.getDynamicValue(thread), symbol_function(EQ), UNPROVIDED), new_value);
            return x;
        }
        cdestructuring_bind_error(datum, $list130);
        return NIL;
    }

    public static SubLObject api_special_cdec_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject x = NIL;
        destructuring_bind_must_consp(current, datum, $list130);
        x = current.first();
        current = current.rest();
        final SubLObject delta = (current.isCons()) ? current.first() : ONE_INTEGER;
        destructuring_bind_must_listp(current, datum, $list130);
        current = current.rest();
        if (NIL == current) {
            return nconc(verify_form_in_api_internal(x), verify_form_in_api_internal(delta));
        }
        cdestructuring_bind_error(datum, $list130);
        return NIL;
    }

    public static SubLObject api_special_cpush(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject item = NIL;
        SubLObject place = NIL;
        destructuring_bind_must_consp(current, datum, $list138);
        item = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list138);
        place = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL == api_lexical_variable_p(place)) {
                eval_in_api_error($str131$_S_is_not_an_api_variable, place, UNPROVIDED);
            }
            final SubLObject current_value = api_lexical_variable_value(place);
            final SubLObject evaluated_item = eval_in_api_internal(item);
            final SubLObject new_value = append(list(evaluated_item), current_value);
            rplacd(assoc(place, $eval_in_api_env$.getDynamicValue(thread), symbol_function(EQ), UNPROVIDED), new_value);
            return place;
        }
        cdestructuring_bind_error(datum, $list138);
        return NIL;
    }

    public static SubLObject api_special_cpush_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject item = NIL;
        SubLObject place = NIL;
        destructuring_bind_must_consp(current, datum, $list138);
        item = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list138);
        place = current.first();
        current = current.rest();
        if (NIL == current) {
            return nconc(verify_form_in_api_internal(item), verify_form_in_api_internal(place));
        }
        cdestructuring_bind_error(datum, $list138);
        return NIL;
    }

    public static SubLObject api_special_cpop(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject place = NIL;
        destructuring_bind_must_consp(current, datum, $list142);
        place = current.first();
        current = current.rest();
        if (NIL == current) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == api_lexical_variable_p(place))) {
                Errors.error($str131$_S_is_not_an_api_variable, place);
            }
            final SubLObject current_value = api_lexical_variable_value(place);
            final SubLObject new_value = current_value.rest();
            rplacd(assoc(place, $eval_in_api_env$.getDynamicValue(thread), symbol_function(EQ), UNPROVIDED), new_value);
            return new_value;
        }
        cdestructuring_bind_error(datum, $list142);
        return NIL;
    }

    public static SubLObject api_special_cpop_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject place = NIL;
        destructuring_bind_must_consp(current, datum, $list142);
        place = current.first();
        current = current.rest();
        if (NIL == current) {
            return verify_form_in_api_internal(place);
        }
        cdestructuring_bind_error(datum, $list142);
        return NIL;
    }

    public static SubLObject api_special_eval(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject form_$7 = NIL;
        destructuring_bind_must_consp(current, datum, $list146);
        form_$7 = current.first();
        current = current.rest();
        if (NIL == current) {
            return eval_in_api(eval_in_api(form_$7));
        }
        cdestructuring_bind_error(datum, $list146);
        return NIL;
    }

    public static SubLObject api_special_eval_in_api_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject form_$8 = NIL;
        destructuring_bind_must_consp(current, datum, $list146);
        form_$8 = current.first();
        current = current.rest();
        if (NIL == current) {
            return verify_form_in_api_internal(form_$8);
        }
        cdestructuring_bind_error(datum, $list146);
        return NIL;
    }

    public static SubLObject api_special_fi_eval(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject form_$9 = NIL;
        destructuring_bind_must_consp(current, datum, $list146);
        form_$9 = current.first();
        current = current.rest();
        if (NIL == current) {
            return eval_in_api_internal(eval_in_api_internal(form_$9));
        }
        cdestructuring_bind_error(datum, $list146);
        return NIL;
    }

    public static SubLObject api_special_fi_eval_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject form_$10 = NIL;
        destructuring_bind_must_consp(current, datum, $list146);
        form_$10 = current.first();
        current = current.rest();
        if (NIL == current) {
            return verify_form_in_api_internal(form_$10);
        }
        cdestructuring_bind_error(datum, $list146);
        return NIL;
    }

    public static SubLObject api_special_fi_local_eval(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject form_$11 = NIL;
        destructuring_bind_must_consp(current, datum, $list146);
        form_$11 = current.first();
        current = current.rest();
        if (NIL == current) {
            return eval_in_api_internal(eval_in_api_internal(form_$11));
        }
        cdestructuring_bind_error(datum, $list146);
        return NIL;
    }

    public static SubLObject api_special_fi_local_eval_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject form_$12 = NIL;
        destructuring_bind_must_consp(current, datum, $list146);
        form_$12 = current.first();
        current = current.rest();
        if (NIL == current) {
            return verify_form_in_api_internal(form_$12);
        }
        cdestructuring_bind_error(datum, $list146);
        return NIL;
    }

    public static SubLObject api_special_apply(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject function = NIL;
        SubLObject argument = NIL;
        destructuring_bind_must_consp(current, datum, $list156);
        function = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list156);
        argument = current.first();
        final SubLObject v_arguments;
        current = v_arguments = current.rest();
        return eval_in_api_apply(function, argument, v_arguments);
    }

    public static SubLObject api_special_apply_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject function = NIL;
        SubLObject argument = NIL;
        destructuring_bind_must_consp(current, datum, $list156);
        function = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list156);
        argument = current.first();
        final SubLObject v_arguments;
        current = v_arguments = current.rest();
        return nconc(verify_form_in_api_internal(function), verify_form_in_api_internal(argument), verify_args_in_api_internal(v_arguments));
    }

    public static SubLObject eval_in_api_apply(final SubLObject function, final SubLObject argument, final SubLObject v_arguments) {
        final SubLObject evaluated_function = eval_in_api_internal(function);
        if (NIL != eval_in_api_predefined_fnP(evaluated_function)) {
            final SubLObject evaluated_argument = eval_in_api_internal(argument);
            final SubLObject evaluated_arguments = api_eval_args(v_arguments);
            final SubLObject apply_arguments = listS(evaluated_function, evaluated_argument, evaluated_arguments);
            return eval_in_api_subl_apply(symbol_function(APPLY), apply_arguments);
        }
        if (NIL != eval_in_api_user_lambda_fnP(evaluated_function)) {
            final SubLObject evaluated_argument = eval_in_api_internal(argument);
            final SubLObject evaluated_arguments = api_eval_args(v_arguments);
            SubLObject quoted_args = NIL;
            if (NIL != evaluated_arguments) {
                quoted_args = cons(list(QUOTE, evaluated_argument), quoted_args);
                SubLObject cdolist_list_var = evaluated_arguments;
                SubLObject arg = NIL;
                arg = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    quoted_args = cons(list(QUOTE, arg), quoted_args);
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                } 
            } else {
                SubLObject cdolist_list_var = evaluated_argument;
                SubLObject arg = NIL;
                arg = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    quoted_args = cons(list(QUOTE, arg), quoted_args);
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                } 
            }
            quoted_args = nreverse(quoted_args);
            return eval_in_api_internal(bq_cons(evaluated_function.first(), append(quoted_args, NIL)));
        }
        return NIL;
    }

    public static SubLObject eval_in_api_user_lambda_fnP(final SubLObject form) {
        return makeBoolean((((form.isCons() && form.first().isSymbol()) && (NIL != eval_in_api_user_fnP(form.first()))) && second(form).isCons()) && (second(form).first() == LAMBDA));
    }

    public static SubLObject eval_in_api_user_fnP(final SubLObject function) {
        SubLObject v_answer = NIL;
        SubLObject function_symbol = NIL;
        SubLObject value = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator($api_function_table$.getGlobalValue());
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                function_symbol = getEntryKey(cdohash_entry);
                value = getEntryValue(cdohash_entry);
                if (function.eql(function_symbol)) {
                    v_answer = T;
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return v_answer;
    }

    public static SubLObject eval_in_api_predefined_fnP(final SubLObject function) {
        SubLObject v_answer = NIL;
        SubLObject function_symbol = NIL;
        SubLObject value = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator($api_predefined_function_table$.getGlobalValue());
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                function_symbol = getEntryKey(cdohash_entry);
                value = getEntryValue(cdohash_entry);
                if ((NIL != fboundp(function_symbol)) && function.eql(symbol_function(function_symbol))) {
                    v_answer = T;
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return v_answer;
    }

    public static SubLObject eval_in_api_applicable_fnP(final SubLObject function) {
        return makeBoolean((((NIL != eval_in_api_predefined_fnP(function)) || (NIL != eval_in_api_user_fnP(function))) || (NIL != eval_in_api_user_lambda_fnP(function))) || (NIL != external_function_p(function)));
    }

    public static SubLObject api_special_fboundp(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject function = NIL;
        destructuring_bind_must_consp(current, datum, $list160);
        function = current.first();
        current = current.rest();
        if (NIL == current) {
            return makeBoolean((NIL != eval_in_api_user_fnP(function)) || (NIL != eval_in_api_predefined_fnP(function)));
        }
        cdestructuring_bind_error(datum, $list160);
        return NIL;
    }

    public static SubLObject api_special_fboundp_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject function = NIL;
        destructuring_bind_must_consp(current, datum, $list160);
        function = current.first();
        current = current.rest();
        if (NIL == current) {
            return verify_form_in_api_internal(function);
        }
        cdestructuring_bind_error(datum, $list160);
        return NIL;
    }

    public static SubLObject api_special_funcall(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject function = NIL;
        destructuring_bind_must_consp(current, datum, $list164);
        function = current.first();
        final SubLObject v_arguments;
        current = v_arguments = current.rest();
        return eval_in_api_apply(function, list(QUOTE, v_arguments), NIL);
    }

    public static SubLObject api_special_funcall_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject function = NIL;
        destructuring_bind_must_consp(current, datum, $list164);
        function = current.first();
        final SubLObject v_arguments;
        current = v_arguments = current.rest();
        return nconc(verify_form_in_api_internal(function), verify_args_in_api_internal(v_arguments));
    }

    public static SubLObject api_special_multiple_value_list(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject expression = NIL;
        destructuring_bind_must_consp(current, datum, $list68);
        expression = current.first();
        current = current.rest();
        if (NIL == current) {
            return arg2(resetMultipleValues(), multiple_value_list(eval_in_api_internal(expression)));
        }
        cdestructuring_bind_error(datum, $list68);
        return NIL;
    }

    public static SubLObject api_special_multiple_value_list_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject expression = NIL;
        destructuring_bind_must_consp(current, datum, $list68);
        expression = current.first();
        current = current.rest();
        if (NIL == current) {
            return verify_form_in_api_internal(expression);
        }
        cdestructuring_bind_error(datum, $list68);
        return NIL;
    }

    public static SubLObject api_special_trace(final SubLObject form) {
        final SubLObject datum = form.rest();
        final SubLObject fnames;
        final SubLObject current = fnames = datum;
        return eval_in_api_trace(fnames);
    }

    public static SubLObject api_special_trace_verify(final SubLObject form) {
        final SubLObject datum = form.rest();
        final SubLObject fnames;
        final SubLObject current = fnames = datum;
        return NIL;
    }

    public static SubLObject eval_in_api_trace(final SubLObject fnames) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == fnames) {
            return $eval_in_api_traced_fns$.getDynamicValue(thread);
        }
        SubLObject cdolist_list_var = fnames;
        SubLObject fname = NIL;
        fname = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject item_var = fname;
            if (NIL == member(item_var, $eval_in_api_traced_fns$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                $eval_in_api_traced_fns$.setDynamicValue(cons(item_var, $eval_in_api_traced_fns$.getDynamicValue(thread)), thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            fname = cdolist_list_var.first();
        } 
        return fnames;
    }

    public static SubLObject api_special_untrace(final SubLObject form) {
        final SubLObject datum = form.rest();
        final SubLObject fnames;
        final SubLObject current = fnames = datum;
        return eval_in_api_untrace(fnames);
    }

    public static SubLObject api_special_untrace_verify(final SubLObject form) {
        final SubLObject datum = form.rest();
        final SubLObject fnames;
        final SubLObject current = fnames = datum;
        return NIL;
    }

    public static SubLObject eval_in_api_untrace(final SubLObject fnames) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != fnames) {
            SubLObject cdolist_list_var = fnames;
            SubLObject fname = NIL;
            fname = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                $eval_in_api_traced_fns$.setDynamicValue(remove(fname, $eval_in_api_traced_fns$.getDynamicValue(thread), symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                cdolist_list_var = cdolist_list_var.rest();
                fname = cdolist_list_var.first();
            } 
        } else {
            $eval_in_api_traced_fns$.setDynamicValue(NIL, thread);
        }
        return fnames;
    }

    public static SubLObject eval_in_api_traced_fnP(final SubLObject fname) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(fname, $eval_in_api_traced_fns$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject eval_in_api_enter_trace_display(final SubLObject fname, final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $eval_in_api_trace_log$.getDynamicValue(thread)) {
            $eval_in_api_trace_log$.setDynamicValue(format(NIL, $str176$__), thread);
        }
        final SubLObject indent = Strings.make_string(multiply(TWO_INTEGER, number_utilities.f_1X($eval_in_api_function_level$.getDynamicValue(thread))), UNPROVIDED);
        final SubLObject form = cons(fname, args);
        $eval_in_api_trace_log$.setDynamicValue(cconcatenate($eval_in_api_trace_log$.getDynamicValue(thread), format(NIL, $str177$_A_D___S__, new SubLObject[]{ indent, $eval_in_api_function_level$.getDynamicValue(thread), form })), thread);
        return NIL;
    }

    public static SubLObject eval_in_api_exit_trace_display(final SubLObject results) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject indent = Strings.make_string(multiply(TWO_INTEGER, number_utilities.f_1X($eval_in_api_function_level$.getDynamicValue(thread))), UNPROVIDED);
        SubLObject result_string = $str178$;
        SubLObject cdolist_list_var = results;
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result_string = cconcatenate(result_string, format(NIL, $str179$_S_, result));
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        $eval_in_api_trace_log$.setDynamicValue(cconcatenate($eval_in_api_trace_log$.getDynamicValue(thread), format(NIL, $str180$_A_D__returned__A__, new SubLObject[]{ indent, $eval_in_api_function_level$.getDynamicValue(thread), result_string })), thread);
        return NIL;
    }

    public static SubLObject api_special_get_trace_log(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject datum = form.rest();
        if (NIL != datum) {
            cdestructuring_bind_error(datum, NIL);
        }
        SubLObject trace_log = NIL;
        trace_log = (NIL != $eval_in_api_trace_log$.getDynamicValue(thread)) ? $eval_in_api_trace_log$.getDynamicValue(thread) : format(NIL, $str176$__);
        eval_in_api_clear_trace_log();
        return trace_log;
    }

    public static SubLObject api_special_get_trace_log_verify(final SubLObject form) {
        final SubLObject datum = form.rest();
        if (NIL != datum) {
            cdestructuring_bind_error(datum, NIL);
        }
        return NIL;
    }

    public static SubLObject api_special_clear_trace_log(final SubLObject form) {
        final SubLObject datum = form.rest();
        if (NIL != datum) {
            cdestructuring_bind_error(datum, NIL);
        }
        return eval_in_api_clear_trace_log();
    }

    public static SubLObject api_special_clear_trace_log_verify(final SubLObject form) {
        final SubLObject datum = form.rest();
        if (NIL != datum) {
            cdestructuring_bind_error(datum, NIL);
        }
        return NIL;
    }

    public static SubLObject eval_in_api_clear_trace_log() {
        $eval_in_api_trace_log$.setDynamicValue(NIL);
        return NIL;
    }

    public static SubLObject add1(final SubLObject x) {
        assert NIL != numberp(x) : "Types.numberp(x) " + "CommonSymbols.NIL != Types.numberp(x) " + x;
        return number_utilities.f_1X(x);
    }

    public static SubLObject sub1(final SubLObject x) {
        assert NIL != numberp(x) : "Types.numberp(x) " + "CommonSymbols.NIL != Types.numberp(x) " + x;
        return number_utilities.f_1_(x);
    }

    public static SubLObject api_special_progn(final SubLObject form) {
        final SubLObject datum = form.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return eval_in_api_progn_body(body);
    }

    public static SubLObject api_special_progn_verify(final SubLObject form) {
        final SubLObject datum = form.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return verify_args_in_api_internal(body);
    }

    public static SubLObject eval_in_api_progn_body(final SubLObject body) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = body;
        SubLObject form = NIL;
        form = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = eval_in_api_internal(form);
            cdolist_list_var = cdolist_list_var.rest();
            form = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject api_special_clet(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject v_bindings = NIL;
        destructuring_bind_must_consp(current, datum, $list190);
        v_bindings = current.first();
        final SubLObject body;
        current = body = current.rest();
        return eval_in_api_clet(v_bindings, body);
    }

    public static SubLObject api_special_clet_verify(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject v_bindings = NIL;
        destructuring_bind_must_consp(current, datum, $list190);
        v_bindings = current.first();
        final SubLObject body;
        current = body = current.rest();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $verify_in_api_bound_symbols$.currentBinding(thread);
        try {
            $verify_in_api_bound_symbols$.bind($verify_in_api_bound_symbols$.getDynamicValue(thread), thread);
            SubLObject cdolist_list_var = v_bindings;
            SubLObject binding = NIL;
            binding = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (binding.isSymbol()) {
                    $verify_in_api_bound_symbols$.setDynamicValue(cons(binding, $verify_in_api_bound_symbols$.getDynamicValue(thread)), thread);
                } else
                    if (NIL != list_utilities.singletonP(binding)) {
                        $verify_in_api_bound_symbols$.setDynamicValue(cons(binding.first(), $verify_in_api_bound_symbols$.getDynamicValue(thread)), thread);
                    } else
                        if (NIL != list_utilities.doubletonP(binding)) {
                            result = nconc(result, verify_form_in_api_internal(second(binding)));
                            $verify_in_api_bound_symbols$.setDynamicValue(cons(binding.first(), $verify_in_api_bound_symbols$.getDynamicValue(thread)), thread);
                        } else {
                            Errors.error($$$clet_error);
                        }


                cdolist_list_var = cdolist_list_var.rest();
                binding = cdolist_list_var.first();
            } 
            result = nconc(result, verify_args_in_api_internal(body));
        } finally {
            $verify_in_api_bound_symbols$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject eval_in_api_clet(final SubLObject v_bindings, final SubLObject body) {
        return eval_in_api_variable_bindings(v_bindings, body);
    }

    public static SubLObject trace_me(SubLObject a1, SubLObject a2, SubLObject a3, SubLObject a4) {
        if (a1 == UNPROVIDED) {
            a1 = NIL;
        }
        if (a2 == UNPROVIDED) {
            a2 = NIL;
        }
        if (a3 == UNPROVIDED) {
            a3 = NIL;
        }
        if (a4 == UNPROVIDED) {
            a4 = NIL;
        }
        return NIL;
    }

    public static SubLObject eval_in_api_variable_bindings(final SubLObject v_bindings, final SubLObject body) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == v_bindings) {
            SubLObject result = NIL;
            result = eval_in_api_progn_body(body);
            return result;
        }
        SubLObject binding = NIL;
        destructuring_bind_must_consp(v_bindings, v_bindings, $list194);
        binding = v_bindings.first();
        final SubLObject rest_bindings;
        final SubLObject current = rest_bindings = v_bindings.rest();
        SubLObject variable = NIL;
        SubLObject init_form = NIL;
        if (binding.isCons()) {
            variable = binding.first();
            init_form = second(binding);
        } else {
            variable = binding;
            init_form = NIL;
        }
        final SubLObject variable_value = eval_in_api_internal(init_form);
        SubLObject result2 = NIL;
        $eval_in_api_env$.setDynamicValue(cons(cons(variable, variable_value), $eval_in_api_env$.getDynamicValue(thread)), thread);
        result2 = eval_in_api_variable_bindings(rest_bindings, body);
        $eval_in_api_env$.setDynamicValue($eval_in_api_env$.getDynamicValue(thread).rest(), thread);
        return result2;
    }

    public static SubLObject api_special_cmultiple_value_bind(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject vars = NIL;
        SubLObject values_form = NIL;
        destructuring_bind_must_consp(current, datum, $list195);
        vars = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list195);
        values_form = current.first();
        final SubLObject body;
        current = body = current.rest();
        return eval_in_api_cmultiple_value_bind(vars, values_form, body);
    }

    public static SubLObject api_special_cmultiple_value_bind_verify(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject vars = NIL;
        SubLObject values_form = NIL;
        destructuring_bind_must_consp(current, datum, $list195);
        vars = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list195);
        values_form = current.first();
        final SubLObject body;
        current = body = current.rest();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $verify_in_api_bound_symbols$.currentBinding(thread);
        try {
            $verify_in_api_bound_symbols$.bind($verify_in_api_bound_symbols$.getDynamicValue(thread), thread);
            SubLObject cdolist_list_var = vars;
            SubLObject var = NIL;
            var = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                $verify_in_api_bound_symbols$.setDynamicValue(cons(var, $verify_in_api_bound_symbols$.getDynamicValue(thread)), thread);
                cdolist_list_var = cdolist_list_var.rest();
                var = cdolist_list_var.first();
            } 
            result = nconc(verify_form_in_api_internal(values_form), verify_args_in_api_internal(body));
        } finally {
            $verify_in_api_bound_symbols$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject eval_in_api_cmultiple_value_bind(final SubLObject vars, final SubLObject values_form, final SubLObject body) {
        SubLObject values = NIL;
        SubLObject value = NIL;
        SubLObject binding = NIL;
        SubLObject v_bindings = NIL;
        values = arg2(resetMultipleValues(), multiple_value_list(eval_in_api_internal(values_form)));
        SubLObject cdolist_list_var = vars;
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != values) {
                value = values.first();
                values = values.rest();
            } else {
                value = NIL;
            }
            binding = list(var, list(QUOTE, value));
            v_bindings = cons(binding, v_bindings);
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        v_bindings = nreverse(v_bindings);
        return eval_in_api_variable_bindings(v_bindings, body);
    }

    public static SubLObject api_special_cand(final SubLObject form) {
        final SubLObject datum = form.rest();
        final SubLObject args;
        final SubLObject current = args = datum;
        SubLObject result = T;
        SubLObject cdolist_list_var = args;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = eval_in_api_internal(arg);
            if (NIL == result) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject api_special_cand_verify(final SubLObject form) {
        final SubLObject datum = form.rest();
        final SubLObject args;
        final SubLObject current = args = datum;
        return verify_args_in_api_internal(args);
    }

    public static SubLObject api_special_cor(final SubLObject form) {
        final SubLObject datum = form.rest();
        final SubLObject args;
        final SubLObject current = args = datum;
        SubLObject result = NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = eval_in_api_internal(arg);
            if (NIL != result) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject api_special_cor_verify(final SubLObject form) {
        final SubLObject datum = form.rest();
        final SubLObject args;
        final SubLObject current = args = datum;
        return verify_args_in_api_internal(args);
    }

    public static SubLObject api_special_cnot(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject expression = NIL;
        destructuring_bind_must_consp(current, datum, $list68);
        expression = current.first();
        current = current.rest();
        if (NIL == current) {
            return makeBoolean(NIL == eval_in_api_internal(expression));
        }
        cdestructuring_bind_error(datum, $list68);
        return NIL;
    }

    public static SubLObject api_special_cnot_verify(final SubLObject form) {
        final SubLObject datum = form.rest();
        final SubLObject args;
        final SubLObject current = args = datum;
        return verify_form_in_api_internal(args.first());
    }

    public static SubLObject api_special_pcond(final SubLObject form) {
        final SubLObject datum = form.rest();
        final SubLObject v_clauses;
        final SubLObject current = v_clauses = datum;
        final SubLObject result = NIL;
        SubLObject cdolist_list_var = v_clauses;
        SubLObject clause = NIL;
        clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current_$14;
            final SubLObject datum_$13 = current_$14 = clause;
            SubLObject condition = NIL;
            destructuring_bind_must_consp(current_$14, datum_$13, $list208);
            condition = current_$14.first();
            final SubLObject body;
            current_$14 = body = current_$14.rest();
            if (NIL != eval_in_api_internal(condition)) {
                return eval_in_api_progn_body(body);
            }
            cdolist_list_var = cdolist_list_var.rest();
            clause = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject api_special_pcond_verify(final SubLObject form) {
        final SubLObject datum = form.rest();
        final SubLObject v_clauses;
        final SubLObject current = v_clauses = datum;
        SubLObject result = NIL;
        SubLObject cdolist_list_var = v_clauses;
        SubLObject clause = NIL;
        clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current_$16;
            final SubLObject datum_$15 = current_$16 = clause;
            SubLObject condition = NIL;
            destructuring_bind_must_consp(current_$16, datum_$15, $list208);
            condition = current_$16.first();
            final SubLObject body;
            current_$16 = body = current_$16.rest();
            result = nconc(result, verify_form_in_api_internal(condition), verify_args_in_api_internal(body));
            cdolist_list_var = cdolist_list_var.rest();
            clause = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject api_special_pif(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject condition = NIL;
        SubLObject action = NIL;
        SubLObject else_action = NIL;
        destructuring_bind_must_consp(current, datum, $list212);
        condition = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list212);
        action = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list212);
        else_action = current.first();
        current = current.rest();
        if (NIL == current) {
            return eval_in_api_if(condition, action, else_action);
        }
        cdestructuring_bind_error(datum, $list212);
        return NIL;
    }

    public static SubLObject api_special_pif_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject condition = NIL;
        SubLObject action = NIL;
        SubLObject else_action = NIL;
        destructuring_bind_must_consp(current, datum, $list212);
        condition = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list212);
        action = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list212);
        else_action = current.first();
        current = current.rest();
        if (NIL == current) {
            return nconc(verify_form_in_api_internal(condition), verify_form_in_api_internal(action), verify_form_in_api_internal(else_action));
        }
        cdestructuring_bind_error(datum, $list212);
        return NIL;
    }

    public static SubLObject eval_in_api_if(final SubLObject condition, final SubLObject action, final SubLObject else_action) {
        if (NIL != eval_in_api_internal(condition)) {
            return eval_in_api_internal(action);
        }
        return eval_in_api_internal(else_action);
    }

    public static SubLObject api_special_fif(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject condition = NIL;
        SubLObject action = NIL;
        SubLObject else_action = NIL;
        destructuring_bind_must_consp(current, datum, $list212);
        condition = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list212);
        action = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list212);
        else_action = current.first();
        current = current.rest();
        if (NIL == current) {
            return eval_in_api_if(condition, action, else_action);
        }
        cdestructuring_bind_error(datum, $list212);
        return NIL;
    }

    public static SubLObject api_special_fif_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject condition = NIL;
        SubLObject action = NIL;
        SubLObject else_action = NIL;
        destructuring_bind_must_consp(current, datum, $list212);
        condition = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list212);
        action = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list212);
        else_action = current.first();
        current = current.rest();
        if (NIL == current) {
            return nconc(verify_form_in_api_internal(condition), verify_form_in_api_internal(action), verify_form_in_api_internal(else_action));
        }
        cdestructuring_bind_error(datum, $list212);
        return NIL;
    }

    public static SubLObject api_special_pwhen(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject condition = NIL;
        destructuring_bind_must_consp(current, datum, $list208);
        condition = current.first();
        final SubLObject body;
        current = body = current.rest();
        if (NIL != eval_in_api_internal(condition)) {
            return eval_in_api_progn_body(body);
        }
        return NIL;
    }

    public static SubLObject api_special_pwhen_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject condition = NIL;
        destructuring_bind_must_consp(current, datum, $list208);
        condition = current.first();
        final SubLObject body;
        current = body = current.rest();
        return nconc(verify_form_in_api_internal(condition), verify_args_in_api_internal(body));
    }

    public static SubLObject api_special_when(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject condition = NIL;
        SubLObject action = NIL;
        destructuring_bind_must_consp(current, datum, $list222);
        condition = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list222);
        action = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list222);
            return NIL;
        }
        if (NIL != eval_in_api_internal(condition)) {
            return eval_in_api_internal(action);
        }
        return NIL;
    }

    public static SubLObject api_special_when_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject condition = NIL;
        SubLObject action = NIL;
        destructuring_bind_must_consp(current, datum, $list222);
        condition = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list222);
        action = current.first();
        current = current.rest();
        if (NIL == current) {
            return nconc(verify_form_in_api_internal(condition), verify_form_in_api_internal(action));
        }
        cdestructuring_bind_error(datum, $list222);
        return NIL;
    }

    public static SubLObject api_special_fwhen(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject condition = NIL;
        destructuring_bind_must_consp(current, datum, $list208);
        condition = current.first();
        final SubLObject body;
        current = body = current.rest();
        if (NIL != eval_in_api_internal(condition)) {
            return eval_in_api_progn_body(body);
        }
        return NIL;
    }

    public static SubLObject api_special_fwhen_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject condition = NIL;
        destructuring_bind_must_consp(current, datum, $list208);
        condition = current.first();
        final SubLObject body;
        current = body = current.rest();
        return nconc(verify_form_in_api_internal(condition), verify_args_in_api_internal(body));
    }

    public static SubLObject api_special_punless(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject condition = NIL;
        destructuring_bind_must_consp(current, datum, $list208);
        condition = current.first();
        final SubLObject body;
        current = body = current.rest();
        if (NIL != eval_in_api_internal(condition)) {
            return NIL;
        }
        return eval_in_api_progn_body(body);
    }

    public static SubLObject api_special_punless_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject condition = NIL;
        destructuring_bind_must_consp(current, datum, $list208);
        condition = current.first();
        final SubLObject body;
        current = body = current.rest();
        return nconc(verify_form_in_api_internal(condition), verify_args_in_api_internal(body));
    }

    public static SubLObject api_special_funless(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject condition = NIL;
        destructuring_bind_must_consp(current, datum, $list208);
        condition = current.first();
        final SubLObject body;
        current = body = current.rest();
        if (NIL != eval_in_api_internal(condition)) {
            return NIL;
        }
        return eval_in_api_progn_body(body);
    }

    public static SubLObject api_special_funless_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject condition = NIL;
        destructuring_bind_must_consp(current, datum, $list208);
        condition = current.first();
        final SubLObject body;
        current = body = current.rest();
        return nconc(verify_form_in_api_internal(condition), verify_args_in_api_internal(body));
    }

    public static SubLObject api_special_while(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject condition = NIL;
        destructuring_bind_must_consp(current, datum, $list208);
        condition = current.first();
        final SubLObject body;
        current = body = current.rest();
        SubLObject result = NIL;
        while (NIL != eval_in_api_internal(condition)) {
            result = eval_in_api_progn_body(body);
        } 
        return result;
    }

    public static SubLObject api_special_while_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject condition = NIL;
        destructuring_bind_must_consp(current, datum, $list208);
        condition = current.first();
        final SubLObject body;
        current = body = current.rest();
        return nconc(verify_form_in_api_internal(condition), verify_args_in_api_internal(body));
    }

    public static SubLObject api_special_until(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject condition = NIL;
        destructuring_bind_must_consp(current, datum, $list208);
        condition = current.first();
        final SubLObject body;
        current = body = current.rest();
        SubLObject result = NIL;
        while (NIL == eval_in_api_internal(condition)) {
            result = eval_in_api_progn_body(body);
        } 
        return result;
    }

    public static SubLObject api_special_until_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject condition = NIL;
        destructuring_bind_must_consp(current, datum, $list208);
        condition = current.first();
        final SubLObject body;
        current = body = current.rest();
        return nconc(verify_form_in_api_internal(condition), verify_args_in_api_internal(body));
    }

    public static SubLObject api_special_cdo(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject vars = NIL;
        SubLObject endtest = NIL;
        destructuring_bind_must_consp(current, datum, $list241);
        vars = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list241);
        endtest = current.first();
        final SubLObject body;
        current = body = current.rest();
        SubLObject endtestP = NIL;
        SubLObject result = NIL;
        SubLObject cdolist_list_var = vars;
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((!var.isList()) || (!length(var).numE(THREE_INTEGER))) {
                eval_in_api_error($str242$_S_is_not_a_valid_cdo_variable_sp, var, UNPROVIDED);
            }
            $eval_in_api_env$.setDynamicValue(cons(cons(var.first(), eval_in_api_internal(second(var))), $eval_in_api_env$.getDynamicValue(thread)), thread);
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        if (NIL == eval_in_api_internal(endtest.first())) {
            eval_in_api_progn_body(body);
            while (NIL == endtestP) {
                cdolist_list_var = vars;
                var = NIL;
                var = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    eval_in_api_csetq(var.first(), third(var), UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    var = cdolist_list_var.first();
                } 
                endtestP = eval_in_api_internal(endtest.first());
                if (NIL == endtestP) {
                    eval_in_api_progn_body(body);
                }
            } 
        }
        result = eval_in_api_progn_body(endtest.rest());
        cdolist_list_var = vars;
        var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            $eval_in_api_env$.setDynamicValue($eval_in_api_env$.getDynamicValue(thread).rest(), thread);
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject api_special_cdo_verify(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject vars = NIL;
        SubLObject endtest = NIL;
        destructuring_bind_must_consp(current, datum, $list241);
        vars = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list241);
        endtest = current.first();
        final SubLObject body;
        current = body = current.rest();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $verify_in_api_bound_symbols$.currentBinding(thread);
        try {
            $verify_in_api_bound_symbols$.bind($verify_in_api_bound_symbols$.getDynamicValue(thread), thread);
            SubLObject cdolist_list_var = vars;
            SubLObject var = NIL;
            var = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (var.isList() && length(var).numE(THREE_INTEGER)) {
                    $verify_in_api_bound_symbols$.setDynamicValue(cons(var.first(), $verify_in_api_bound_symbols$.getDynamicValue(thread)), thread);
                    result = nconc(result, verify_form_in_api_internal(second(var)), verify_form_in_api_internal(third(var)));
                }
                cdolist_list_var = cdolist_list_var.rest();
                var = cdolist_list_var.first();
            } 
            result = nconc(result, verify_args_in_api_internal(endtest), verify_args_in_api_internal(body));
        } finally {
            $verify_in_api_bound_symbols$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject api_special_cdolist(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        destructuring_bind_must_consp(current, datum, $list246);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject variable = NIL;
        SubLObject listform = NIL;
        destructuring_bind_must_consp(current, datum, $list246);
        variable = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list246);
        listform = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return eval_in_api_codolist(variable, listform, body);
        }
        cdestructuring_bind_error(datum, $list246);
        return NIL;
    }

    public static SubLObject api_special_cdolist_verify(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = form.rest();
        destructuring_bind_must_consp(current, datum, $list246);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject variable = NIL;
        SubLObject listform = NIL;
        destructuring_bind_must_consp(current, datum, $list246);
        variable = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list246);
        listform = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            SubLObject result = NIL;
            final SubLObject _prev_bind_0 = $verify_in_api_bound_symbols$.currentBinding(thread);
            try {
                $verify_in_api_bound_symbols$.bind($verify_in_api_bound_symbols$.getDynamicValue(thread), thread);
                $verify_in_api_bound_symbols$.setDynamicValue(cons(variable, $verify_in_api_bound_symbols$.getDynamicValue(thread)), thread);
                result = nconc(verify_form_in_api_internal(listform), verify_args_in_api_internal(body));
            } finally {
                $verify_in_api_bound_symbols$.rebind(_prev_bind_0, thread);
            }
            return result;
        }
        cdestructuring_bind_error(datum, $list246);
        return NIL;
    }

    public static SubLObject eval_in_api_codolist(final SubLObject variable, final SubLObject listform, final SubLObject body) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = eval_in_api_internal(listform);
        SubLObject variable_value = NIL;
        variable_value = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            $eval_in_api_env$.setDynamicValue(cons(cons(variable, variable_value), $eval_in_api_env$.getDynamicValue(thread)), thread);
            eval_in_api_progn_body(body);
            $eval_in_api_env$.setDynamicValue($eval_in_api_env$.getDynamicValue(thread).rest(), thread);
            cdolist_list_var = cdolist_list_var.rest();
            variable_value = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject api_special_cdotimes(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        destructuring_bind_must_consp(current, datum, $list250);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject variable = NIL;
        SubLObject integer = NIL;
        destructuring_bind_must_consp(current, datum, $list250);
        variable = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list250);
        integer = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return eval_in_api_cdotimes(variable, integer, body);
        }
        cdestructuring_bind_error(datum, $list250);
        return NIL;
    }

    public static SubLObject api_special_cdotimes_verify(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = form.rest();
        destructuring_bind_must_consp(current, datum, $list250);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject variable = NIL;
        SubLObject integer = NIL;
        destructuring_bind_must_consp(current, datum, $list250);
        variable = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list250);
        integer = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            SubLObject result = NIL;
            final SubLObject _prev_bind_0 = $verify_in_api_bound_symbols$.currentBinding(thread);
            try {
                $verify_in_api_bound_symbols$.bind($verify_in_api_bound_symbols$.getDynamicValue(thread), thread);
                $verify_in_api_bound_symbols$.setDynamicValue(cons(variable, $verify_in_api_bound_symbols$.getDynamicValue(thread)), thread);
                result = verify_form_in_api_internal(integer);
                result = verify_args_in_api_internal(body);
            } finally {
                $verify_in_api_bound_symbols$.rebind(_prev_bind_0, thread);
            }
            return result;
        }
        cdestructuring_bind_error(datum, $list250);
        return NIL;
    }

    public static SubLObject eval_in_api_cdotimes(final SubLObject variable, final SubLObject integer, final SubLObject body) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = eval_in_api_internal(integer), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            $eval_in_api_env$.setDynamicValue(cons(cons(variable, i), $eval_in_api_env$.getDynamicValue(thread)), thread);
            eval_in_api_progn_body(body);
            $eval_in_api_env$.setDynamicValue($eval_in_api_env$.getDynamicValue(thread).rest(), thread);
        }
        return NIL;
    }

    public static SubLObject api_special_cdohash(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        destructuring_bind_must_consp(current, datum, $list254);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = NIL;
        SubLObject val = NIL;
        SubLObject table = NIL;
        destructuring_bind_must_consp(current, datum, $list254);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list254);
        val = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list254);
        table = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return eval_in_api_cdohash(key, val, table, body);
        }
        cdestructuring_bind_error(datum, $list254);
        return NIL;
    }

    public static SubLObject api_special_cdohash_verify(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = form.rest();
        destructuring_bind_must_consp(current, datum, $list254);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = NIL;
        SubLObject val = NIL;
        SubLObject table = NIL;
        destructuring_bind_must_consp(current, datum, $list254);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list254);
        val = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list254);
        table = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            SubLObject result = NIL;
            final SubLObject _prev_bind_0 = $verify_in_api_bound_symbols$.currentBinding(thread);
            try {
                $verify_in_api_bound_symbols$.bind($verify_in_api_bound_symbols$.getDynamicValue(thread), thread);
                $verify_in_api_bound_symbols$.setDynamicValue(cons(key, $verify_in_api_bound_symbols$.getDynamicValue(thread)), thread);
                $verify_in_api_bound_symbols$.setDynamicValue(cons(val, $verify_in_api_bound_symbols$.getDynamicValue(thread)), thread);
                result = nconc(verify_form_in_api_internal(table), verify_args_in_api_internal(body));
            } finally {
                $verify_in_api_bound_symbols$.rebind(_prev_bind_0, thread);
            }
            return result;
        }
        cdestructuring_bind_error(datum, $list254);
        return NIL;
    }

    public static SubLObject eval_in_api_cdohash(final SubLObject key, final SubLObject val, final SubLObject table, final SubLObject body) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cdohash_table = eval_in_api_internal(table);
        SubLObject k = NIL;
        SubLObject v = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                k = getEntryKey(cdohash_entry);
                v = getEntryValue(cdohash_entry);
                $eval_in_api_env$.setDynamicValue(cons(cons(key, k), $eval_in_api_env$.getDynamicValue(thread)), thread);
                $eval_in_api_env$.setDynamicValue(cons(cons(val, v), $eval_in_api_env$.getDynamicValue(thread)), thread);
                eval_in_api_progn_body(body);
                $eval_in_api_env$.setDynamicValue($eval_in_api_env$.getDynamicValue(thread).rest(), thread);
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return NIL;
    }

    public static SubLObject api_special_mapcar(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject function = NIL;
        destructuring_bind_must_consp(current, datum, $list258);
        function = current.first();
        final SubLObject lists;
        current = lists = current.rest();
        return eval_in_api_mapcar(function, lists);
    }

    public static SubLObject api_special_mapcar_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject function = NIL;
        destructuring_bind_must_consp(current, datum, $list258);
        function = current.first();
        final SubLObject lists;
        current = lists = current.rest();
        return nconc(verify_form_in_api_internal(function), verify_args_in_api_internal(lists));
    }

    public static SubLObject eval_in_api_mapcar(final SubLObject function, final SubLObject lists) {
        if (NIL == eval_in_api_applicable_fnP(eval_in_api_internal(function))) {
            eval_in_api_error($str262$_S_does_not_evaluate_to_an_api_fu, function, UNPROVIDED);
        }
        final SubLObject evaluated_function = eval_in_api_internal(function);
        final SubLObject evaluated_lists = api_eval_args(lists);
        if (NIL != member(NIL, evaluated_lists, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        if (NIL == evaluated_lists.rest()) {
            final SubLObject lst = evaluated_lists.first();
            return cons(funcall(evaluated_function, lst.first()), eval_in_api_mapcar(function, list(list(QUOTE, lst.rest()))));
        }
        return cons(apply(evaluated_function, eval_in_api_mapcar(symbol_function(FIRST), list(list(QUOTE, evaluated_lists)))), apply(symbol_function(EVAL_IN_API_MAPCAR), function, list(eval_in_api_quoted_args(eval_in_api_mapcar(symbol_function(REST), list(list(QUOTE, evaluated_lists)))))));
    }

    public static SubLObject eval_in_api_quoted_args(final SubLObject args) {
        SubLObject quoted_args = NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            quoted_args = cons(list(QUOTE, arg), quoted_args);
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return nreverse(quoted_args);
    }

    public static SubLObject api_special_mapdictionary(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject dict = NIL;
        SubLObject func = NIL;
        destructuring_bind_must_consp(current, datum, $list266);
        dict = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list266);
        func = current.first();
        current = current.rest();
        if (NIL == current) {
            return eval_in_api_mapdictionary(dict, func);
        }
        cdestructuring_bind_error(datum, $list266);
        return NIL;
    }

    public static SubLObject api_special_mapdictionary_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject dict = NIL;
        SubLObject func = NIL;
        destructuring_bind_must_consp(current, datum, $list266);
        dict = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list266);
        func = current.first();
        current = current.rest();
        if (NIL == current) {
            return nconc(verify_form_in_api_internal(dict), verify_form_in_api_internal(func));
        }
        cdestructuring_bind_error(datum, $list266);
        return NIL;
    }

    public static SubLObject eval_in_api_mapdictionary(final SubLObject dict, final SubLObject func) {
        final SubLObject evaluated_dict = eval_in_api_internal(dict);
        final SubLObject evaluated_func = eval_in_api_internal(func);
        if (NIL == eval_in_api_applicable_fnP(evaluated_func)) {
            eval_in_api_error($str262$_S_does_not_evaluate_to_an_api_fu, func, UNPROVIDED);
        }
        final SubLObject style = dictionary.dictionary_style(evaluated_dict);
        if (style == $ALIST) {
            eval_in_api_mapdictionary_alist_style(evaluated_dict, func);
        } else
            if (style == $HASHTABLE) {
                eval_in_api_mapdictionary_hashtable_style(evaluated_dict, func);
            } else {
                Errors.error($str272$Corrupted_dictionary__unsupported, style);
            }

        return NIL;
    }

    public static SubLObject eval_in_api_mapdictionary_alist_style(final SubLObject dict, final SubLObject func) {
        SubLObject cdolist_list_var = dictionary.dictionary_contents(dict);
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            eval_in_api_internal(list(FUNCALL, func, pair.first(), pair.rest()));
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject eval_in_api_mapdictionary_hashtable_style(final SubLObject dict, final SubLObject func) {
        final SubLObject cdohash_table = dictionary.dictionary_contents(dict);
        SubLObject key = NIL;
        SubLObject value = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                value = getEntryValue(cdohash_entry);
                eval_in_api_internal(list(FUNCALL, func, key, value));
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return NIL;
    }

    public static SubLObject api_special_mapdictionary_parameterized(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject dict = NIL;
        SubLObject func = NIL;
        SubLObject args = NIL;
        destructuring_bind_must_consp(current, datum, $list273);
        dict = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list273);
        func = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list273);
        args = current.first();
        current = current.rest();
        if (NIL == current) {
            return eval_in_api_mapdictionary_parameterized(dict, func, args);
        }
        cdestructuring_bind_error(datum, $list273);
        return NIL;
    }

    public static SubLObject api_special_mapdictionary_parameterized_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject dict = NIL;
        SubLObject func = NIL;
        SubLObject args = NIL;
        destructuring_bind_must_consp(current, datum, $list273);
        dict = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list273);
        func = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list273);
        args = current.first();
        current = current.rest();
        if (NIL == current) {
            return nconc(verify_form_in_api_internal(dict), verify_symbol_in_api_internal(func), verify_args_in_api_internal(args));
        }
        cdestructuring_bind_error(datum, $list273);
        return NIL;
    }

    public static SubLObject eval_in_api_mapdictionary_parameterized(final SubLObject dict, final SubLObject func, final SubLObject args) {
        final SubLObject evaluated_dict = eval_in_api_internal(dict);
        final SubLObject evaluated_func = eval_in_api_internal(func);
        final SubLObject evaluated_args = api_eval_args(eval_in_api_internal(args));
        if (NIL == eval_in_api_applicable_fnP(evaluated_func)) {
            eval_in_api_error($str262$_S_does_not_evaluate_to_an_api_fu, func, UNPROVIDED);
        }
        trace_me($str277$evaluated_dict, evaluated_dict, UNPROVIDED, UNPROVIDED);
        trace_me($str278$evaluated_func, evaluated_func, UNPROVIDED, UNPROVIDED);
        trace_me($str279$evaluated_args, evaluated_args, UNPROVIDED, UNPROVIDED);
        final SubLObject style = dictionary.dictionary_style(evaluated_dict);
        if (style == $ALIST) {
            eval_in_api_mapdictionary_parameterized_alist_style(evaluated_dict, func, evaluated_args);
        } else
            if (style == $HASHTABLE) {
                eval_in_api_mapdictionary_parameterized_hashtable_style(evaluated_dict, func, evaluated_args);
            } else {
                Errors.error($str272$Corrupted_dictionary__unsupported, style);
            }

        return NIL;
    }

    public static SubLObject eval_in_api_mapdictionary_parameterized_alist_style(final SubLObject dict, final SubLObject func, final SubLObject args) {
        SubLObject cdolist_list_var = dictionary.dictionary_contents(dict);
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            eval_in_api_internal(list(FUNCALL, func, pair.first(), pair.rest(), args));
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        return args;
    }

    public static SubLObject eval_in_api_mapdictionary_parameterized_hashtable_style(final SubLObject dict, final SubLObject func, final SubLObject args) {
        final SubLObject cdohash_table = dictionary.dictionary_contents(dict);
        SubLObject key = NIL;
        SubLObject value = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                value = getEntryValue(cdohash_entry);
                eval_in_api_internal(list(FUNCALL, func, key, value, args));
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return args;
    }

    public static SubLObject api_special_ccatch(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject tag = NIL;
        SubLObject ans_var = NIL;
        destructuring_bind_must_consp(current, datum, $list280);
        tag = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list280);
        ans_var = current.first();
        final SubLObject body;
        current = body = current.rest();
        return eval_in_api_ccatch(tag, ans_var, body);
    }

    public static SubLObject api_special_ccatch_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject tag = NIL;
        SubLObject ans_var = NIL;
        destructuring_bind_must_consp(current, datum, $list280);
        tag = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list280);
        ans_var = current.first();
        final SubLObject body;
        current = body = current.rest();
        return nconc(verify_form_in_api_internal(tag), verify_symbol_in_api_internal(ans_var), verify_args_in_api_internal(body));
    }

    public static SubLObject eval_in_api_ccatch(final SubLObject tag, final SubLObject ans_var, final SubLObject body) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject env_depth_upon_entering = length($eval_in_api_env$.getDynamicValue(thread));
        SubLObject form_to_eval = NIL;
        form_to_eval = list(CLET, $list284, list(CCATCH, tag, ANSWER_VARIABLE, list(EVAL_IN_API_PROGN_BODY, list(QUOTE, body))), listS(EVAL_IN_API_CSETQ, list(QUOTE, ans_var), $list284));
        eval_in_api_subl_eval(form_to_eval);
        while (length($eval_in_api_env$.getDynamicValue(thread)).numG(env_depth_upon_entering)) {
            $eval_in_api_env$.setDynamicValue($eval_in_api_env$.getDynamicValue(thread).rest(), thread);
        } 
        return NIL;
    }

    public static SubLObject api_special_throw(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject tag = NIL;
        SubLObject result = NIL;
        destructuring_bind_must_consp(current, datum, $list287);
        tag = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list287);
        result = current.first();
        current = current.rest();
        if (NIL == current) {
            return eval_in_api_throw(tag, result);
        }
        cdestructuring_bind_error(datum, $list287);
        return NIL;
    }

    public static SubLObject api_special_throw_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject tag = NIL;
        SubLObject result = NIL;
        destructuring_bind_must_consp(current, datum, $list287);
        tag = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list287);
        result = current.first();
        current = current.rest();
        if (NIL == current) {
            return nconc(verify_form_in_api_internal(tag), verify_form_in_api_internal(result));
        }
        cdestructuring_bind_error(datum, $list287);
        return NIL;
    }

    public static SubLObject eval_in_api_throw(final SubLObject tag, final SubLObject result) {
        eval_in_api_subl_eval(list(THROW, tag, list(EVAL_IN_API_INTERNAL, result)));
        return NIL;
    }

    public static SubLObject api_special_ignore_errors(final SubLObject form) {
        final SubLObject datum = form.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return eval_in_api_ignore_errors(body);
    }

    public static SubLObject api_special_ignore_errors_verify(final SubLObject form) {
        final SubLObject datum = form.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return verify_args_in_api_internal(body);
    }

    public static SubLObject eval_in_api_ignore_errors(final SubLObject body) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = NIL;
        final SubLObject env_depth_upon_entering = length($eval_in_api_env$.getDynamicValue(thread));
        SubLObject form_to_eval = NIL;
        form_to_eval = listS(CLET, $list295, list(IGNORE_ERRORS, list(CSETQ, LOCAL_RESULTS, list(MULTIPLE_VALUE_LIST, list(EVAL_IN_API_PROGN_BODY, list(QUOTE, body))))), $list295);
        results = eval_in_api_subl_eval(form_to_eval);
        while (length($eval_in_api_env$.getDynamicValue(thread)).numG(env_depth_upon_entering)) {
            $eval_in_api_env$.setDynamicValue($eval_in_api_env$.getDynamicValue(thread).rest(), thread);
        } 
        if (NIL != results) {
            return subl_promotions.values_list(results);
        }
        return NIL;
    }

    public static SubLObject api_special_cunwind_protect(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject protected_form = NIL;
        destructuring_bind_must_consp(current, datum, $list297);
        protected_form = current.first();
        final SubLObject body;
        current = body = current.rest();
        return eval_in_api_cunwind_protect(protected_form, body);
    }

    public static SubLObject api_special_cunwind_protect_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject protected_form = NIL;
        destructuring_bind_must_consp(current, datum, $list297);
        protected_form = current.first();
        final SubLObject body;
        current = body = current.rest();
        return nconc(verify_form_in_api_internal(protected_form), verify_args_in_api_internal(body));
    }

    public static SubLObject eval_in_api_cunwind_protect(final SubLObject protected_form, final SubLObject body) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject env_depth_upon_entering = length($eval_in_api_env$.getDynamicValue(thread));
        SubLObject form_to_eval = NIL;
        form_to_eval = list(CUNWIND_PROTECT, list(EVAL_IN_API_INTERNAL, list(QUOTE, protected_form)), listS(WHILE, list($sym301$_, $list302, env_depth_upon_entering), $list303), list(EVAL_IN_API_PROGN_BODY, list(QUOTE, body)));
        trace_me($str304$eval_in_api_cunwind_protect, form_to_eval, UNPROVIDED, UNPROVIDED);
        eval_in_api_subl_eval(form_to_eval);
        return NIL;
    }

    public static SubLObject api_special_load(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject filename = NIL;
        destructuring_bind_must_consp(current, datum, $list305);
        filename = current.first();
        current = current.rest();
        if (NIL == current) {
            return eval_in_api_load(filename);
        }
        cdestructuring_bind_error(datum, $list305);
        return NIL;
    }

    public static SubLObject api_special_load_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject filename = NIL;
        destructuring_bind_must_consp(current, datum, $list305);
        filename = current.first();
        current = current.rest();
        if (NIL == current) {
            return verify_form_in_api_internal(filename);
        }
        cdestructuring_bind_error(datum, $list305);
        return NIL;
    }

    public static SubLObject eval_in_api_load(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject evaluated_filename = eval_in_api_internal(filename);
        assert NIL != stringp(evaluated_filename) : "Types.stringp(evaluated_filename) " + "CommonSymbols.NIL != Types.stringp(evaluated_filename) " + evaluated_filename;
        SubLObject done = NIL;
        SubLObject stream_var = NIL;
        try {
            final SubLObject stream;
            stream_var = stream = StreamsLow.open(evaluated_filename, new SubLObject[]{ $DIRECTION, $INPUT, $IF_DOES_NOT_EXIST, NIL });
            if (!stream.isStream()) {
                Errors.error($str313$_S_does_not_exist__cannot_load, evaluated_filename);
            }
            while (NIL == done) {
                thread.resetMultipleValues();
                final SubLObject form = read_ignoring_errors(stream, NIL, $EOF);
                final SubLObject error = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (error == $ERROR) {
                    if (form != $EOF) {
                        Errors.error($str316$__Read_error_occured_at_position_, file_position(stream, UNPROVIDED), evaluated_filename);
                    }
                    done = T;
                } else {
                    eval_in_api(form);
                }
            } 
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (NIL != stream_var) {
                    close(stream_var, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return T;
    }

    public static SubLObject api_special_check_type(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject v_object = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list317);
        v_object = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list317);
        pred = current.first();
        current = current.rest();
        if (NIL == current) {
            if (((NIL == $suspend_type_checkingP$.getDynamicValue(thread)) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) && (NIL == eval_in_api(list(pred, v_object)))) {
                Errors.error($str318$_A_is_not_a__A, v_object, pred);
            }
            return NIL;
        }
        cdestructuring_bind_error(datum, $list317);
        return NIL;
    }

    public static SubLObject api_special_check_type_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject v_object = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list317);
        v_object = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list317);
        pred = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject result = NIL;
            result = nconc(result, verify_form_in_api_internal(v_object));
            if (NIL == valid_api_function_p(pred)) {
                final SubLObject item_var = pred;
                if (NIL == member(item_var, result, symbol_function(EQL), symbol_function(IDENTITY))) {
                    result = cons(item_var, result);
                }
            }
            return result;
        }
        cdestructuring_bind_error(datum, $list317);
        return NIL;
    }

    public static SubLObject api_special_quote(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject expression = NIL;
        destructuring_bind_must_consp(current, datum, $list68);
        expression = current.first();
        current = current.rest();
        if (NIL == current) {
            return expression;
        }
        cdestructuring_bind_error(datum, $list68);
        return NIL;
    }

    public static SubLObject api_special_quote_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject expression = NIL;
        destructuring_bind_must_consp(current, datum, $list68);
        expression = current.first();
        current = current.rest();
        if (NIL == current) {
            return NIL;
        }
        cdestructuring_bind_error(datum, $list68);
        return NIL;
    }

    public static SubLObject api_special_boundp(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject symbol = NIL;
        destructuring_bind_must_consp(current, datum, $list102);
        symbol = current.first();
        current = current.rest();
        if (NIL == current) {
            return list_utilities.sublisp_boolean(assoc(eval_in_api_internal(symbol), $eval_in_api_env$.getDynamicValue(thread), symbol_function(EQ), UNPROVIDED));
        }
        cdestructuring_bind_error(datum, $list102);
        return NIL;
    }

    public static SubLObject api_special_boundp_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject symbol = NIL;
        destructuring_bind_must_consp(current, datum, $list102);
        symbol = current.first();
        current = current.rest();
        if (NIL == current) {
            return verify_symbol_in_api_internal(symbol);
        }
        cdestructuring_bind_error(datum, $list102);
        return NIL;
    }

    public static SubLObject api_special_symbol_value(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject var = NIL;
        destructuring_bind_must_consp(current, datum, $list120);
        var = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject symbol = eval_in_api_internal(var);
            SubLObject value = NIL;
            value = eval_in_api_internal(symbol);
            return value;
        }
        cdestructuring_bind_error(datum, $list120);
        return NIL;
    }

    public static SubLObject api_special_symbol_value_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject var = NIL;
        destructuring_bind_must_consp(current, datum, $list120);
        var = current.first();
        current = current.rest();
        if (NIL == current) {
            return verify_form_in_api_internal(var);
        }
        cdestructuring_bind_error(datum, $list120);
        return NIL;
    }

    public static SubLObject api_special_function(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject fname = NIL;
        destructuring_bind_must_consp(current, datum, $list330);
        fname = current.first();
        current = current.rest();
        if (NIL == current) {
            return eval_in_api_function(fname);
        }
        cdestructuring_bind_error(datum, $list330);
        return NIL;
    }

    public static SubLObject api_special_function_verify(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject fname = NIL;
        destructuring_bind_must_consp(current, datum, $list330);
        fname = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list330);
            return NIL;
        }
        if ((NIL != list_utilities.member_eqP(fname, $verify_in_api_fbound_symbols$.getDynamicValue(thread))) || (NIL != valid_api_operator_p(fname))) {
            return NIL;
        }
        return list(fname);
    }

    public static SubLObject eval_in_api_function(final SubLObject fname) {
        return NIL != eval_in_api_user_fnP(fname) ? list(fname, api_function_handler(fname)) : eval_in_api_subl_eval(list(FUNCTION, fname));
    }

    public static SubLObject api_special_error(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject format_string = NIL;
        destructuring_bind_must_consp(current, datum, $list334);
        format_string = current.first();
        final SubLObject v_arguments;
        current = v_arguments = current.rest();
        final SubLObject all_error_args = cons(format_string, api_eval_args(v_arguments));
        return eval_in_api_subl_apply(symbol_function(ERROR), all_error_args);
    }

    public static SubLObject api_special_error_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject format_string = NIL;
        destructuring_bind_must_consp(current, datum, $list334);
        format_string = current.first();
        final SubLObject v_arguments;
        current = v_arguments = current.rest();
        return nconc(verify_form_in_api_internal(format_string), verify_args_in_api_internal(v_arguments));
    }

    public static SubLObject api_special_break(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject format_string = NIL;
        destructuring_bind_must_consp(current, datum, $list334);
        format_string = current.first();
        final SubLObject v_arguments;
        current = v_arguments = current.rest();
        SubLObject env_string = format(NIL, $str176$__);
        SubLObject cdolist_list_var = $eval_in_api_env$.getDynamicValue(thread);
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            env_string = cconcatenate(env_string, format(NIL, $str338$___S, binding));
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        final SubLObject env_format_string = cconcatenate(env_string, new SubLObject[]{ $str176$__, format_string });
        final SubLObject all_break_args = cons(env_format_string, api_eval_args(v_arguments));
        return eval_in_api_subl_apply(symbol_function(BREAK), all_break_args);
    }

    public static SubLObject api_special_break_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject format_string = NIL;
        destructuring_bind_must_consp(current, datum, $list334);
        format_string = current.first();
        final SubLObject v_arguments;
        current = v_arguments = current.rest();
        return nconc(verify_form_in_api_internal(format_string), verify_args_in_api_internal(v_arguments));
    }

    public static SubLObject api_special_clear_environment(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject datum = form.rest();
        if (NIL != datum) {
            cdestructuring_bind_error(datum, NIL);
        }
        if ($eval_in_api_level$.getDynamicValue(thread).eql(ZERO_INTEGER)) {
            $eval_in_api_env$.setDynamicValue(NIL, thread);
        } else {
            eval_in_api_error($str342$Can_only_clear_the_environment_fr, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject api_special_clear_environment_verify(final SubLObject form) {
        final SubLObject datum = form.rest();
        if (NIL != datum) {
            cdestructuring_bind_error(datum, NIL);
        }
        return NIL;
    }

    public static SubLObject api_special_get_environment(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject datum = form.rest();
        if (NIL != datum) {
            cdestructuring_bind_error(datum, NIL);
        }
        SubLObject result = format(NIL, $str176$__);
        SubLObject cdolist_list_var = $eval_in_api_env$.getDynamicValue(thread);
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cconcatenate(result, format(NIL, $str338$___S, binding));
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject api_special_get_environment_verify(final SubLObject form) {
        final SubLObject datum = form.rest();
        if (NIL != datum) {
            cdestructuring_bind_error(datum, NIL);
        }
        return NIL;
    }

    public static SubLObject api_special_in_package(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject v_package = NIL;
        destructuring_bind_must_consp(current, datum, $list349);
        v_package = current.first();
        current = current.rest();
        if (NIL == current) {
            return v_package;
        }
        cdestructuring_bind_error(datum, $list349);
        return NIL;
    }

    public static SubLObject api_special_in_package_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject v_package = NIL;
        destructuring_bind_must_consp(current, datum, $list349);
        v_package = current.first();
        current = current.rest();
        if (NIL == current) {
            return NIL;
        }
        cdestructuring_bind_error(datum, $list349);
        return NIL;
    }

    public static SubLObject api_special_ctime(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject var = NIL;
        destructuring_bind_must_consp(current, datum, $list353);
        var = current.first();
        final SubLObject body;
        current = body = current.rest();
        return eval_in_api_ctime(var, body);
    }

    public static SubLObject api_special_ctime_verify(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject var = NIL;
        destructuring_bind_must_consp(current, datum, $list353);
        var = current.first();
        final SubLObject body;
        current = body = current.rest();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $verify_in_api_bound_symbols$.currentBinding(thread);
        try {
            $verify_in_api_bound_symbols$.bind($verify_in_api_bound_symbols$.getDynamicValue(thread), thread);
            $verify_in_api_bound_symbols$.setDynamicValue(cons(var, $verify_in_api_bound_symbols$.getDynamicValue(thread)), thread);
            result = verify_args_in_api_internal(body);
        } finally {
            $verify_in_api_bound_symbols$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject eval_in_api_ctime(final SubLObject var, final SubLObject body) {
        SubLObject form_to_eval = NIL;
        form_to_eval = list(WITH_TEMP_VARS, $list358, list(CTIME, TEMP_VAR, bq_cons(WITH_EVAL_IN_API_ENV, append(body, NIL))), listS(EVAL_IN_API_CSETQ, list(QUOTE, var), $list358));
        trace_me($str361$eval_in_api_ctime, form_to_eval, UNPROVIDED, UNPROVIDED);
        return eval_in_api_subl_eval(form_to_eval);
    }

    public static SubLObject api_special_noting_percent_progress(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject string = NIL;
        destructuring_bind_must_consp(current, datum, $list362);
        string = current.first();
        final SubLObject body;
        current = body = current.rest();
        return eval_in_api_noting_percent_progress(string, body);
    }

    public static SubLObject api_special_noting_percent_progress_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject string = NIL;
        destructuring_bind_must_consp(current, datum, $list362);
        string = current.first();
        final SubLObject body;
        current = body = current.rest();
        return nconc(verify_form_in_api_internal(string), verify_args_in_api_internal(body));
    }

    public static SubLObject eval_in_api_noting_percent_progress(final SubLObject string, final SubLObject body) {
        SubLObject form_to_eval = NIL;
        form_to_eval = list(NOTING_PERCENT_PROGRESS, list(EVAL_IN_API_INTERNAL, list(QUOTE, string)), bq_cons(WITH_EVAL_IN_API_ENV, append(body, NIL)));
        trace_me($str366$eval_in_api_noting_percent_progre, form_to_eval, UNPROVIDED, UNPROVIDED);
        eval_in_api_subl_eval(form_to_eval);
        return NIL;
    }

    public static SubLObject api_special_noting_activity(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject string = NIL;
        destructuring_bind_must_consp(current, datum, $list362);
        string = current.first();
        final SubLObject body;
        current = body = current.rest();
        return eval_in_api_noting_activity(string, body);
    }

    public static SubLObject api_special_noting_activity_verify(final SubLObject form) {
        SubLObject current;
        final SubLObject datum = current = form.rest();
        SubLObject string = NIL;
        destructuring_bind_must_consp(current, datum, $list362);
        string = current.first();
        final SubLObject body;
        current = body = current.rest();
        return nconc(verify_form_in_api_internal(string), verify_args_in_api_internal(body));
    }

    public static SubLObject eval_in_api_noting_activity(final SubLObject string, final SubLObject body) {
        SubLObject form_to_eval = NIL;
        form_to_eval = list(NOTING_ACTIVITY, list(EVAL_IN_API_INTERNAL, list(QUOTE, string)), bq_cons(WITH_EVAL_IN_API_ENV, append(body, NIL)));
        trace_me($str370$eval_in_api_noting_activity, form_to_eval, UNPROVIDED, UNPROVIDED);
        eval_in_api_subl_eval(form_to_eval);
        return NIL;
    }

    public static SubLObject eval_in_api_initialize() {
        $eval_in_api_env$.setDynamicValue(NIL);
        unregister_api_predefined_macro(MUST);
        register_api_predefined_function(MUST);
        unregister_api_predefined_macro(CHECK_TYPE);
        return NIL;
    }

    public static SubLObject declare_eval_in_api_file() {
        declareFunction(me, "cyc_api_eval", "CYC-API-EVAL", 1, 0, false);
        declareFunction(me, "possibly_cyc_api_eval", "POSSIBLY-CYC-API-EVAL", 1, 0, false);
        declareFunction(me, "possibly_cyc_api_apply", "POSSIBLY-CYC-API-APPLY", 2, 0, false);
        declareFunction(me, "possibly_cyc_api_function_spec_p", "POSSIBLY-CYC-API-FUNCTION-SPEC-P", 1, 0, false);
        declareFunction(me, "possibly_cyc_api_funcall_1", "POSSIBLY-CYC-API-FUNCALL-1", 2, 0, false);
        declareFunction(me, "possibly_cyc_api_funcall_2", "POSSIBLY-CYC-API-FUNCALL-2", 3, 0, false);
        declareFunction(me, "possibly_cyc_api_funcall_3", "POSSIBLY-CYC-API-FUNCALL-3", 4, 0, false);
        declareFunction(me, "possibly_cyc_api_funcall_4", "POSSIBLY-CYC-API-FUNCALL-4", 5, 0, false);
        declareFunction(me, "register_api_mutable_global", "REGISTER-API-MUTABLE-GLOBAL", 1, 0, false);
        declareFunction(me, "api_mutable_global_p", "API-MUTABLE-GLOBAL-P", 1, 0, false);
        declareFunction(me, "register_api_immutable_global", "REGISTER-API-IMMUTABLE-GLOBAL", 1, 0, false);
        declareFunction(me, "api_immutable_global_p", "API-IMMUTABLE-GLOBAL-P", 1, 0, false);
        declareFunction(me, "api_lexical_variable_p", "API-LEXICAL-VARIABLE-P", 1, 0, false);
        declareFunction(me, "api_dynamic_variable_p", "API-DYNAMIC-VARIABLE-P", 1, 0, false);
        declareFunction(me, "api_special_verify_p", "API-SPECIAL-VERIFY-P", 1, 0, false);
        declareFunction(me, "api_special_verify_handler", "API-SPECIAL-VERIFY-HANDLER", 1, 0, false);
        declareFunction(me, "register_api_special_verify", "REGISTER-API-SPECIAL-VERIFY", 2, 0, false);
        declareFunction(me, "api_function_p", "API-FUNCTION-P", 1, 0, false);
        declareFunction(me, "api_function_handler", "API-FUNCTION-HANDLER", 1, 0, false);
        declareFunction(me, "register_api_function", "REGISTER-API-FUNCTION", 2, 0, false);
        declareFunction(me, "api_macro_p", "API-MACRO-P", 1, 0, false);
        declareFunction(me, "api_macro_expander", "API-MACRO-EXPANDER", 1, 0, false);
        declareFunction(me, "register_api_macro", "REGISTER-API-MACRO", 2, 0, false);
        declareMacro(me, "defspecial_in_api", "DEFSPECIAL-IN-API");
        declareMacro(me, "defspecial_in_api_verify", "DEFSPECIAL-IN-API-VERIFY");
        declareMacro(me, "with_eval_in_api_subl_evaluation", "WITH-EVAL-IN-API-SUBL-EVALUATION");
        declareFunction(me, "eval_in_api_subl_eval", "EVAL-IN-API-SUBL-EVAL", 1, 0, false);
        declareFunction(me, "eval_in_api_subl_apply", "EVAL-IN-API-SUBL-APPLY", 2, 0, false);
        declareFunction(me, "eval_in_api_subl_funcall", "EVAL-IN-API-SUBL-FUNCALL", 1, 4, false);
        declareMacro(me, "with_clean_eval_in_api_environment", "WITH-CLEAN-EVAL-IN-API-ENVIRONMENT");
        declareFunction(me, "initialize_eval_in_api_env", "INITIALIZE-EVAL-IN-API-ENV", 0, 0, false);
        declareFunction(me, "eval_in_api", "EVAL-IN-API", 1, 0, false);
        declareFunction(me, "valid_api_operator_p", "VALID-API-OPERATOR-P", 1, 0, false);
        declareFunction(me, "valid_api_function_p", "VALID-API-FUNCTION-P", 1, 0, false);
        declareFunction(me, "valid_api_macro_p", "VALID-API-MACRO-P", 1, 0, false);
        declareFunction(me, "eval_in_api_internal", "EVAL-IN-API-INTERNAL", 1, 0, false);
        declareFunction(me, "api_eval_args", "API-EVAL-ARGS", 1, 0, false);
        declareFunction(me, "eval_in_api_error", "EVAL-IN-API-ERROR", 0, 3, false);
        declareFunction(me, "api_self_evaluation", "API-SELF-EVALUATION", 1, 0, false);
        declareFunction(me, "api_dynamic_variable_value", "API-DYNAMIC-VARIABLE-VALUE", 1, 0, false);
        declareFunction(me, "api_lexical_variable_value", "API-LEXICAL-VARIABLE-VALUE", 1, 0, false);
        declareFunction(me, "api_apply_predefined_function", "API-APPLY-PREDEFINED-FUNCTION", 2, 0, false);
        declareFunction(me, "api_apply_predefined_function_one_arg", "API-APPLY-PREDEFINED-FUNCTION-ONE-ARG", 2, 0, false);
        declareFunction(me, "api_expand_predefined_macro", "API-EXPAND-PREDEFINED-MACRO", 1, 0, false);
        declareFunction(me, "api_funcall_special_handler", "API-FUNCALL-SPECIAL-HANDLER", 3, 0, false);
        declareFunction(me, "api_funcall_special_verify_handler", "API-FUNCALL-SPECIAL-VERIFY-HANDLER", 3, 0, false);
        declareFunction(me, "api_apply_function_handler", "API-APPLY-FUNCTION-HANDLER", 3, 0, false);
        declareFunction(me, "api_apply_lambda", "API-APPLY-LAMBDA", 2, 0, false);
        declareFunction(me, "api_funcall_macro_expander", "API-FUNCALL-MACRO-EXPANDER", 2, 0, false);
        declareMacro(me, "with_eval_in_api_env", "WITH-EVAL-IN-API-ENV");
        declareFunction(me, "with_eval_in_api_env_int", "WITH-EVAL-IN-API-ENV-INT", 1, 0, false);
        declareFunction(me, "eval_in_api_update_env", "EVAL-IN-API-UPDATE-ENV", 1, 0, false);
        declareFunction(me, "verify_in_api", "VERIFY-IN-API", 1, 1, false);
        declareFunction(me, "verify_args_in_api_internal", "VERIFY-ARGS-IN-API-INTERNAL", 1, 0, false);
        declareFunction(me, "verify_form_in_api_internal", "VERIFY-FORM-IN-API-INTERNAL", 1, 0, false);
        declareFunction(me, "verify_symbol_in_api_internal", "VERIFY-SYMBOL-IN-API-INTERNAL", 1, 0, false);
        declareFunction(me, "api_special_ret", "API-SPECIAL-RET", 1, 0, false);
        declareFunction(me, "api_special_ret_verify", "API-SPECIAL-RET-VERIFY", 1, 0, false);
        declareFunction(me, "api_special_define", "API-SPECIAL-DEFINE", 1, 0, false);
        declareFunction(me, "api_special_define_verify", "API-SPECIAL-DEFINE-VERIFY", 1, 0, false);
        declareFunction(me, "api_special_define_public", "API-SPECIAL-DEFINE-PUBLIC", 1, 0, false);
        declareFunction(me, "api_special_define_public_verify", "API-SPECIAL-DEFINE-PUBLIC-VERIFY", 1, 0, false);
        declareFunction(me, "api_special_define_protected", "API-SPECIAL-DEFINE-PROTECTED", 1, 0, false);
        declareFunction(me, "api_special_define_protected_verify", "API-SPECIAL-DEFINE-PROTECTED-VERIFY", 1, 0, false);
        declareFunction(me, "api_special_define_private", "API-SPECIAL-DEFINE-PRIVATE", 1, 0, false);
        declareFunction(me, "api_special_define_private_verify", "API-SPECIAL-DEFINE-PRIVATE-VERIFY", 1, 0, false);
        declareFunction(me, "api_special_defmacro", "API-SPECIAL-DEFMACRO", 1, 0, false);
        declareFunction(me, "api_special_defmacro_verify", "API-SPECIAL-DEFMACRO-VERIFY", 1, 0, false);
        declareFunction(me, "api_special_defmacro_public", "API-SPECIAL-DEFMACRO-PUBLIC", 1, 0, false);
        declareFunction(me, "api_special_defmacro_public_verify", "API-SPECIAL-DEFMACRO-PUBLIC-VERIFY", 1, 0, false);
        declareFunction(me, "api_special_defmacro_protected", "API-SPECIAL-DEFMACRO-PROTECTED", 1, 0, false);
        declareFunction(me, "api_special_defmacro_protected_verify", "API-SPECIAL-DEFMACRO-PROTECTED-VERIFY", 1, 0, false);
        declareFunction(me, "api_special_define_verify_int", "API-SPECIAL-DEFINE-VERIFY-INT", 3, 0, false);
        declareFunction(me, "api_special_defstruct", "API-SPECIAL-DEFSTRUCT", 1, 0, false);
        declareFunction(me, "api_special_defstruct_verify", "API-SPECIAL-DEFSTRUCT-VERIFY", 1, 0, false);
        declareFunction(me, "eval_in_api_defstruct", "EVAL-IN-API-DEFSTRUCT", 2, 0, false);
        declareFunction(me, "api_special_fi_get_parameter", "API-SPECIAL-FI-GET-PARAMETER", 1, 0, false);
        declareFunction(me, "api_special_fi_get_parameter_verify", "API-SPECIAL-FI-GET-PARAMETER-VERIFY", 1, 0, false);
        declareFunction(me, "api_special_defvar", "API-SPECIAL-DEFVAR", 1, 0, false);
        declareFunction(me, "api_special_defvar_verify", "API-SPECIAL-DEFVAR-VERIFY", 1, 0, false);
        declareFunction(me, "api_special_defvar_private", "API-SPECIAL-DEFVAR-PRIVATE", 1, 0, false);
        declareFunction(me, "api_special_defvar_private_verify", "API-SPECIAL-DEFVAR-PRIVATE-VERIFY", 1, 0, false);
        declareFunction(me, "eval_in_api_defvar", "EVAL-IN-API-DEFVAR", 2, 0, false);
        declareFunction(me, "api_user_variable_p", "API-USER-VARIABLE-P", 1, 0, false);
        declareFunction(me, "clear_api_user_variables", "CLEAR-API-USER-VARIABLES", 0, 0, false);
        declareFunction(me, "put_api_user_variable", "PUT-API-USER-VARIABLE", 2, 0, false);
        declareFunction(me, "get_api_user_variable", "GET-API-USER-VARIABLE", 1, 0, false);
        declareFunction(me, "api_special_fi_set_parameter", "API-SPECIAL-FI-SET-PARAMETER", 1, 0, false);
        declareFunction(me, "api_special_fi_set_parameter_verify", "API-SPECIAL-FI-SET-PARAMETER-VERIFY", 1, 0, false);
        declareFunction(me, "api_special_csetq", "API-SPECIAL-CSETQ", 1, 0, false);
        declareFunction(me, "api_special_csetq_verify", "API-SPECIAL-CSETQ-VERIFY", 1, 0, false);
        declareFunction(me, "eval_in_api_csetq", "EVAL-IN-API-CSETQ", 2, 1, false);
        declareFunction(me, "api_special_cinc", "API-SPECIAL-CINC", 1, 0, false);
        declareFunction(me, "api_special_cinc_verify", "API-SPECIAL-CINC-VERIFY", 1, 0, false);
        declareFunction(me, "api_special_cdec", "API-SPECIAL-CDEC", 1, 0, false);
        declareFunction(me, "api_special_cdec_verify", "API-SPECIAL-CDEC-VERIFY", 1, 0, false);
        declareFunction(me, "api_special_cpush", "API-SPECIAL-CPUSH", 1, 0, false);
        declareFunction(me, "api_special_cpush_verify", "API-SPECIAL-CPUSH-VERIFY", 1, 0, false);
        declareFunction(me, "api_special_cpop", "API-SPECIAL-CPOP", 1, 0, false);
        declareFunction(me, "api_special_cpop_verify", "API-SPECIAL-CPOP-VERIFY", 1, 0, false);
        declareFunction(me, "api_special_eval", "API-SPECIAL-EVAL", 1, 0, false);
        declareFunction(me, "api_special_eval_in_api_verify", "API-SPECIAL-EVAL-IN-API-VERIFY", 1, 0, false);
        declareFunction(me, "api_special_fi_eval", "API-SPECIAL-FI-EVAL", 1, 0, false);
        declareFunction(me, "api_special_fi_eval_verify", "API-SPECIAL-FI-EVAL-VERIFY", 1, 0, false);
        declareFunction(me, "api_special_fi_local_eval", "API-SPECIAL-FI-LOCAL-EVAL", 1, 0, false);
        declareFunction(me, "api_special_fi_local_eval_verify", "API-SPECIAL-FI-LOCAL-EVAL-VERIFY", 1, 0, false);
        declareFunction(me, "api_special_apply", "API-SPECIAL-APPLY", 1, 0, false);
        declareFunction(me, "api_special_apply_verify", "API-SPECIAL-APPLY-VERIFY", 1, 0, false);
        declareFunction(me, "eval_in_api_apply", "EVAL-IN-API-APPLY", 3, 0, false);
        declareFunction(me, "eval_in_api_user_lambda_fnP", "EVAL-IN-API-USER-LAMBDA-FN?", 1, 0, false);
        declareFunction(me, "eval_in_api_user_fnP", "EVAL-IN-API-USER-FN?", 1, 0, false);
        declareFunction(me, "eval_in_api_predefined_fnP", "EVAL-IN-API-PREDEFINED-FN?", 1, 0, false);
        declareFunction(me, "eval_in_api_applicable_fnP", "EVAL-IN-API-APPLICABLE-FN?", 1, 0, false);
        declareFunction(me, "api_special_fboundp", "API-SPECIAL-FBOUNDP", 1, 0, false);
        declareFunction(me, "api_special_fboundp_verify", "API-SPECIAL-FBOUNDP-VERIFY", 1, 0, false);
        declareFunction(me, "api_special_funcall", "API-SPECIAL-FUNCALL", 1, 0, false);
        declareFunction(me, "api_special_funcall_verify", "API-SPECIAL-FUNCALL-VERIFY", 1, 0, false);
        declareFunction(me, "api_special_multiple_value_list", "API-SPECIAL-MULTIPLE-VALUE-LIST", 1, 0, false);
        declareFunction(me, "api_special_multiple_value_list_verify", "API-SPECIAL-MULTIPLE-VALUE-LIST-VERIFY", 1, 0, false);
        declareFunction(me, "api_special_trace", "API-SPECIAL-TRACE", 1, 0, false);
        declareFunction(me, "api_special_trace_verify", "API-SPECIAL-TRACE-VERIFY", 1, 0, false);
        declareFunction(me, "eval_in_api_trace", "EVAL-IN-API-TRACE", 1, 0, false);
        declareFunction(me, "api_special_untrace", "API-SPECIAL-UNTRACE", 1, 0, false);
        declareFunction(me, "api_special_untrace_verify", "API-SPECIAL-UNTRACE-VERIFY", 1, 0, false);
        declareFunction(me, "eval_in_api_untrace", "EVAL-IN-API-UNTRACE", 1, 0, false);
        declareFunction(me, "eval_in_api_traced_fnP", "EVAL-IN-API-TRACED-FN?", 1, 0, false);
        declareFunction(me, "eval_in_api_enter_trace_display", "EVAL-IN-API-ENTER-TRACE-DISPLAY", 2, 0, false);
        declareFunction(me, "eval_in_api_exit_trace_display", "EVAL-IN-API-EXIT-TRACE-DISPLAY", 1, 0, false);
        declareFunction(me, "api_special_get_trace_log", "API-SPECIAL-GET-TRACE-LOG", 1, 0, false);
        declareFunction(me, "api_special_get_trace_log_verify", "API-SPECIAL-GET-TRACE-LOG-VERIFY", 1, 0, false);
        declareFunction(me, "api_special_clear_trace_log", "API-SPECIAL-CLEAR-TRACE-LOG", 1, 0, false);
        declareFunction(me, "api_special_clear_trace_log_verify", "API-SPECIAL-CLEAR-TRACE-LOG-VERIFY", 1, 0, false);
        declareFunction(me, "eval_in_api_clear_trace_log", "EVAL-IN-API-CLEAR-TRACE-LOG", 0, 0, false);
        declareFunction(me, "add1", "ADD1", 1, 0, false);
        declareFunction(me, "sub1", "SUB1", 1, 0, false);
        declareFunction(me, "api_special_progn", "API-SPECIAL-PROGN", 1, 0, false);
        declareFunction(me, "api_special_progn_verify", "API-SPECIAL-PROGN-VERIFY", 1, 0, false);
        declareFunction(me, "eval_in_api_progn_body", "EVAL-IN-API-PROGN-BODY", 1, 0, false);
        declareFunction(me, "api_special_clet", "API-SPECIAL-CLET", 1, 0, false);
        declareFunction(me, "api_special_clet_verify", "API-SPECIAL-CLET-VERIFY", 1, 0, false);
        declareFunction(me, "eval_in_api_clet", "EVAL-IN-API-CLET", 2, 0, false);
        declareFunction(me, "trace_me", "TRACE-ME", 0, 4, false);
        declareFunction(me, "eval_in_api_variable_bindings", "EVAL-IN-API-VARIABLE-BINDINGS", 2, 0, false);
        declareFunction(me, "api_special_cmultiple_value_bind", "API-SPECIAL-CMULTIPLE-VALUE-BIND", 1, 0, false);
        declareFunction(me, "api_special_cmultiple_value_bind_verify", "API-SPECIAL-CMULTIPLE-VALUE-BIND-VERIFY", 1, 0, false);
        declareFunction(me, "eval_in_api_cmultiple_value_bind", "EVAL-IN-API-CMULTIPLE-VALUE-BIND", 3, 0, false);
        declareFunction(me, "api_special_cand", "API-SPECIAL-CAND", 1, 0, false);
        declareFunction(me, "api_special_cand_verify", "API-SPECIAL-CAND-VERIFY", 1, 0, false);
        declareFunction(me, "api_special_cor", "API-SPECIAL-COR", 1, 0, false);
        declareFunction(me, "api_special_cor_verify", "API-SPECIAL-COR-VERIFY", 1, 0, false);
        declareFunction(me, "api_special_cnot", "API-SPECIAL-CNOT", 1, 0, false);
        declareFunction(me, "api_special_cnot_verify", "API-SPECIAL-CNOT-VERIFY", 1, 0, false);
        declareFunction(me, "api_special_pcond", "API-SPECIAL-PCOND", 1, 0, false);
        declareFunction(me, "api_special_pcond_verify", "API-SPECIAL-PCOND-VERIFY", 1, 0, false);
        declareFunction(me, "api_special_pif", "API-SPECIAL-PIF", 1, 0, false);
        declareFunction(me, "api_special_pif_verify", "API-SPECIAL-PIF-VERIFY", 1, 0, false);
        declareFunction(me, "eval_in_api_if", "EVAL-IN-API-IF", 3, 0, false);
        declareFunction(me, "api_special_fif", "API-SPECIAL-FIF", 1, 0, false);
        declareFunction(me, "api_special_fif_verify", "API-SPECIAL-FIF-VERIFY", 1, 0, false);
        declareFunction(me, "api_special_pwhen", "API-SPECIAL-PWHEN", 1, 0, false);
        declareFunction(me, "api_special_pwhen_verify", "API-SPECIAL-PWHEN-VERIFY", 1, 0, false);
        declareFunction(me, "api_special_when", "API-SPECIAL-WHEN", 1, 0, false);
        declareFunction(me, "api_special_when_verify", "API-SPECIAL-WHEN-VERIFY", 1, 0, false);
        declareFunction(me, "api_special_fwhen", "API-SPECIAL-FWHEN", 1, 0, false);
        declareFunction(me, "api_special_fwhen_verify", "API-SPECIAL-FWHEN-VERIFY", 1, 0, false);
        declareFunction(me, "api_special_punless", "API-SPECIAL-PUNLESS", 1, 0, false);
        declareFunction(me, "api_special_punless_verify", "API-SPECIAL-PUNLESS-VERIFY", 1, 0, false);
        declareFunction(me, "api_special_funless", "API-SPECIAL-FUNLESS", 1, 0, false);
        declareFunction(me, "api_special_funless_verify", "API-SPECIAL-FUNLESS-VERIFY", 1, 0, false);
        declareFunction(me, "api_special_while", "API-SPECIAL-WHILE", 1, 0, false);
        declareFunction(me, "api_special_while_verify", "API-SPECIAL-WHILE-VERIFY", 1, 0, false);
        declareFunction(me, "api_special_until", "API-SPECIAL-UNTIL", 1, 0, false);
        declareFunction(me, "api_special_until_verify", "API-SPECIAL-UNTIL-VERIFY", 1, 0, false);
        declareFunction(me, "api_special_cdo", "API-SPECIAL-CDO", 1, 0, false);
        declareFunction(me, "api_special_cdo_verify", "API-SPECIAL-CDO-VERIFY", 1, 0, false);
        declareFunction(me, "api_special_cdolist", "API-SPECIAL-CDOLIST", 1, 0, false);
        declareFunction(me, "api_special_cdolist_verify", "API-SPECIAL-CDOLIST-VERIFY", 1, 0, false);
        declareFunction(me, "eval_in_api_codolist", "EVAL-IN-API-CODOLIST", 3, 0, false);
        declareFunction(me, "api_special_cdotimes", "API-SPECIAL-CDOTIMES", 1, 0, false);
        declareFunction(me, "api_special_cdotimes_verify", "API-SPECIAL-CDOTIMES-VERIFY", 1, 0, false);
        declareFunction(me, "eval_in_api_cdotimes", "EVAL-IN-API-CDOTIMES", 3, 0, false);
        declareFunction(me, "api_special_cdohash", "API-SPECIAL-CDOHASH", 1, 0, false);
        declareFunction(me, "api_special_cdohash_verify", "API-SPECIAL-CDOHASH-VERIFY", 1, 0, false);
        declareFunction(me, "eval_in_api_cdohash", "EVAL-IN-API-CDOHASH", 4, 0, false);
        declareFunction(me, "api_special_mapcar", "API-SPECIAL-MAPCAR", 1, 0, false);
        declareFunction(me, "api_special_mapcar_verify", "API-SPECIAL-MAPCAR-VERIFY", 1, 0, false);
        declareFunction(me, "eval_in_api_mapcar", "EVAL-IN-API-MAPCAR", 2, 0, false);
        declareFunction(me, "eval_in_api_quoted_args", "EVAL-IN-API-QUOTED-ARGS", 1, 0, false);
        declareFunction(me, "api_special_mapdictionary", "API-SPECIAL-MAPDICTIONARY", 1, 0, false);
        declareFunction(me, "api_special_mapdictionary_verify", "API-SPECIAL-MAPDICTIONARY-VERIFY", 1, 0, false);
        declareFunction(me, "eval_in_api_mapdictionary", "EVAL-IN-API-MAPDICTIONARY", 2, 0, false);
        declareFunction(me, "eval_in_api_mapdictionary_alist_style", "EVAL-IN-API-MAPDICTIONARY-ALIST-STYLE", 2, 0, false);
        declareFunction(me, "eval_in_api_mapdictionary_hashtable_style", "EVAL-IN-API-MAPDICTIONARY-HASHTABLE-STYLE", 2, 0, false);
        declareFunction(me, "api_special_mapdictionary_parameterized", "API-SPECIAL-MAPDICTIONARY-PARAMETERIZED", 1, 0, false);
        declareFunction(me, "api_special_mapdictionary_parameterized_verify", "API-SPECIAL-MAPDICTIONARY-PARAMETERIZED-VERIFY", 1, 0, false);
        declareFunction(me, "eval_in_api_mapdictionary_parameterized", "EVAL-IN-API-MAPDICTIONARY-PARAMETERIZED", 3, 0, false);
        declareFunction(me, "eval_in_api_mapdictionary_parameterized_alist_style", "EVAL-IN-API-MAPDICTIONARY-PARAMETERIZED-ALIST-STYLE", 3, 0, false);
        declareFunction(me, "eval_in_api_mapdictionary_parameterized_hashtable_style", "EVAL-IN-API-MAPDICTIONARY-PARAMETERIZED-HASHTABLE-STYLE", 3, 0, false);
        declareFunction(me, "api_special_ccatch", "API-SPECIAL-CCATCH", 1, 0, false);
        declareFunction(me, "api_special_ccatch_verify", "API-SPECIAL-CCATCH-VERIFY", 1, 0, false);
        declareFunction(me, "eval_in_api_ccatch", "EVAL-IN-API-CCATCH", 3, 0, false);
        declareFunction(me, "api_special_throw", "API-SPECIAL-THROW", 1, 0, false);
        declareFunction(me, "api_special_throw_verify", "API-SPECIAL-THROW-VERIFY", 1, 0, false);
        declareFunction(me, "eval_in_api_throw", "EVAL-IN-API-THROW", 2, 0, false);
        declareFunction(me, "api_special_ignore_errors", "API-SPECIAL-IGNORE-ERRORS", 1, 0, false);
        declareFunction(me, "api_special_ignore_errors_verify", "API-SPECIAL-IGNORE-ERRORS-VERIFY", 1, 0, false);
        declareFunction(me, "eval_in_api_ignore_errors", "EVAL-IN-API-IGNORE-ERRORS", 1, 0, false);
        declareFunction(me, "api_special_cunwind_protect", "API-SPECIAL-CUNWIND-PROTECT", 1, 0, false);
        declareFunction(me, "api_special_cunwind_protect_verify", "API-SPECIAL-CUNWIND-PROTECT-VERIFY", 1, 0, false);
        declareFunction(me, "eval_in_api_cunwind_protect", "EVAL-IN-API-CUNWIND-PROTECT", 2, 0, false);
        declareFunction(me, "api_special_load", "API-SPECIAL-LOAD", 1, 0, false);
        declareFunction(me, "api_special_load_verify", "API-SPECIAL-LOAD-VERIFY", 1, 0, false);
        declareFunction(me, "eval_in_api_load", "EVAL-IN-API-LOAD", 1, 0, false);
        declareFunction(me, "api_special_check_type", "API-SPECIAL-CHECK-TYPE", 1, 0, false);
        declareFunction(me, "api_special_check_type_verify", "API-SPECIAL-CHECK-TYPE-VERIFY", 1, 0, false);
        declareFunction(me, "api_special_quote", "API-SPECIAL-QUOTE", 1, 0, false);
        declareFunction(me, "api_special_quote_verify", "API-SPECIAL-QUOTE-VERIFY", 1, 0, false);
        declareFunction(me, "api_special_boundp", "API-SPECIAL-BOUNDP", 1, 0, false);
        declareFunction(me, "api_special_boundp_verify", "API-SPECIAL-BOUNDP-VERIFY", 1, 0, false);
        declareFunction(me, "api_special_symbol_value", "API-SPECIAL-SYMBOL-VALUE", 1, 0, false);
        declareFunction(me, "api_special_symbol_value_verify", "API-SPECIAL-SYMBOL-VALUE-VERIFY", 1, 0, false);
        declareFunction(me, "api_special_function", "API-SPECIAL-FUNCTION", 1, 0, false);
        declareFunction(me, "api_special_function_verify", "API-SPECIAL-FUNCTION-VERIFY", 1, 0, false);
        declareFunction(me, "eval_in_api_function", "EVAL-IN-API-FUNCTION", 1, 0, false);
        declareFunction(me, "api_special_error", "API-SPECIAL-ERROR", 1, 0, false);
        declareFunction(me, "api_special_error_verify", "API-SPECIAL-ERROR-VERIFY", 1, 0, false);
        declareFunction(me, "api_special_break", "API-SPECIAL-BREAK", 1, 0, false);
        declareFunction(me, "api_special_break_verify", "API-SPECIAL-BREAK-VERIFY", 1, 0, false);
        declareFunction(me, "api_special_clear_environment", "API-SPECIAL-CLEAR-ENVIRONMENT", 1, 0, false);
        declareFunction(me, "api_special_clear_environment_verify", "API-SPECIAL-CLEAR-ENVIRONMENT-VERIFY", 1, 0, false);
        declareFunction(me, "api_special_get_environment", "API-SPECIAL-GET-ENVIRONMENT", 1, 0, false);
        declareFunction(me, "api_special_get_environment_verify", "API-SPECIAL-GET-ENVIRONMENT-VERIFY", 1, 0, false);
        declareFunction(me, "api_special_in_package", "API-SPECIAL-IN-PACKAGE", 1, 0, false);
        declareFunction(me, "api_special_in_package_verify", "API-SPECIAL-IN-PACKAGE-VERIFY", 1, 0, false);
        declareFunction(me, "api_special_ctime", "API-SPECIAL-CTIME", 1, 0, false);
        declareFunction(me, "api_special_ctime_verify", "API-SPECIAL-CTIME-VERIFY", 1, 0, false);
        declareFunction(me, "eval_in_api_ctime", "EVAL-IN-API-CTIME", 2, 0, false);
        declareFunction(me, "api_special_noting_percent_progress", "API-SPECIAL-NOTING-PERCENT-PROGRESS", 1, 0, false);
        declareFunction(me, "api_special_noting_percent_progress_verify", "API-SPECIAL-NOTING-PERCENT-PROGRESS-VERIFY", 1, 0, false);
        declareFunction(me, "eval_in_api_noting_percent_progress", "EVAL-IN-API-NOTING-PERCENT-PROGRESS", 2, 0, false);
        declareFunction(me, "api_special_noting_activity", "API-SPECIAL-NOTING-ACTIVITY", 1, 0, false);
        declareFunction(me, "api_special_noting_activity_verify", "API-SPECIAL-NOTING-ACTIVITY-VERIFY", 1, 0, false);
        declareFunction(me, "eval_in_api_noting_activity", "EVAL-IN-API-NOTING-ACTIVITY", 2, 0, false);
        declareFunction(me, "eval_in_api_initialize", "EVAL-IN-API-INITIALIZE", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_eval_in_api_file() {
        defvar("*EVAL-IN-API?*", NIL);
        deflexical("*EVAL-IN-API-MUTABLE-GLOBALS*", SubLTrampolineFile.maybeDefault($eval_in_api_mutable_globals$, $eval_in_api_mutable_globals$, NIL));
        deflexical("*EVAL-IN-API-IMMUTABLE-GLOBALS*", SubLTrampolineFile.maybeDefault($eval_in_api_immutable_globals$, $eval_in_api_immutable_globals$, NIL));
        defparameter("*EVAL-IN-API-ENV*", NIL);
        deflexical("*API-SPECIAL-VERIFY-TABLE*", SubLTrampolineFile.maybeDefault($api_special_verify_table$, $api_special_verify_table$, () -> make_hash_table(TEN_INTEGER, symbol_function(EQ), UNPROVIDED)));
        deflexical("*API-FUNCTION-TABLE*", SubLTrampolineFile.maybeDefault($api_function_table$, $api_function_table$, () -> make_hash_table($int$100, symbol_function(EQ), UNPROVIDED)));
        deflexical("*API-MACRO-TABLE*", SubLTrampolineFile.maybeDefault($api_macro_table$, $api_macro_table$, () -> make_hash_table(TEN_INTEGER, symbol_function(EQ), UNPROVIDED)));
        deflexical("*SUBL-EVAL-METHOD*", SubLTrampolineFile.maybeDefault($subl_eval_method$, $subl_eval_method$, EVAL));
        defparameter("*EVAL-IN-API-TRACED-FNS*", NIL);
        defparameter("*EVAL-IN-API-TRACE-LOG*", NIL);
        defparameter("*EVAL-IN-API-LEVEL*", MINUS_ONE_INTEGER);
        defparameter("*EVAL-IN-API-FUNCTION-LEVEL*", MINUS_ONE_INTEGER);
        defparameter("*EVAL-IN-API-MACRO-STACK*", NIL);
        defparameter("*VERIFY-IN-API-VERBOSE-MODE?*", NIL);
        defparameter("*VERIFY-IN-API-BOUND-SYMBOLS*", NIL);
        defparameter("*VERIFY-IN-API-FBOUND-SYMBOLS*", NIL);
        defparameter("*VERIFY-IN-API-MACRO-STACK*", NIL);
        deflexical("*API-USER-VARIABLES*", NIL);
        return NIL;
    }

    public static SubLObject setup_eval_in_api_file() {
        declare_defglobal($eval_in_api_mutable_globals$);
        declare_defglobal($eval_in_api_immutable_globals$);
        declare_defglobal($api_special_verify_table$);
        declare_defglobal($api_function_table$);
        declare_defglobal($api_macro_table$);
        declare_defglobal($subl_eval_method$);
        register_macro_helper(INITIALIZE_EVAL_IN_API_ENV, WITH_EVAL_IN_API_ENVIRONMENT);
        register_cyc_api_function(VALID_API_OPERATOR_P, $list29, $str30$_return_boolean_T_if_APPLY_or_FUN, $list31, $list32);
        register_cyc_api_function(VALID_API_FUNCTION_P, $list29, $str34$_return_boolean_T_if_APPLY_or_FUN, $list31, $list32);
        register_cyc_api_function(VALID_API_MACRO_P, $list29, $str36$_return_boolean_T_iff_macro_expan, $list31, $list32);
        define_test_case_table_int(VALID_API_OPERATOR_P, list(new SubLObject[]{ $TEST, symbol_function(EQ), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list43);
        register_external_symbol(VERIFY_IN_API);
        define_test_case_table_int(VERIFY_IN_API, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list67);
        register_api_special(RET, API_SPECIAL_RET);
        register_api_special_verify(RET, API_SPECIAL_RET_VERIFY);
        register_api_special(DEFINE, API_SPECIAL_DEFINE);
        register_api_special_verify(DEFINE, API_SPECIAL_DEFINE_VERIFY);
        register_api_special(DEFINE_PUBLIC, API_SPECIAL_DEFINE_PUBLIC);
        register_api_special_verify(DEFINE_PUBLIC, API_SPECIAL_DEFINE_PUBLIC_VERIFY);
        register_api_special(DEFINE_PROTECTED, API_SPECIAL_DEFINE_PROTECTED);
        register_api_special_verify(DEFINE_PROTECTED, API_SPECIAL_DEFINE_PROTECTED_VERIFY);
        register_api_special(DEFINE_PRIVATE, API_SPECIAL_DEFINE_PRIVATE);
        register_api_special_verify(DEFINE_PRIVATE, API_SPECIAL_DEFINE_PRIVATE_VERIFY);
        register_api_special(DEFMACRO, API_SPECIAL_DEFMACRO);
        register_api_special_verify(DEFMACRO, API_SPECIAL_DEFMACRO_VERIFY);
        register_api_special(DEFMACRO_PUBLIC, API_SPECIAL_DEFMACRO_PUBLIC);
        register_api_special_verify(DEFMACRO_PUBLIC, API_SPECIAL_DEFMACRO_PUBLIC_VERIFY);
        register_api_special(DEFMACRO_PROTECTED, API_SPECIAL_DEFMACRO_PROTECTED);
        register_api_special_verify(DEFMACRO_PROTECTED, API_SPECIAL_DEFMACRO_PROTECTED_VERIFY);
        register_api_special(DEFSTRUCT, API_SPECIAL_DEFSTRUCT);
        register_api_special_verify(DEFSTRUCT, API_SPECIAL_DEFSTRUCT_VERIFY);
        register_api_special(FI_GET_PARAMETER, API_SPECIAL_FI_GET_PARAMETER);
        register_api_special_verify(FI_GET_PARAMETER, API_SPECIAL_FI_GET_PARAMETER_VERIFY);
        register_api_special(DEFVAR, API_SPECIAL_DEFVAR);
        register_api_special_verify(DEFVAR, API_SPECIAL_DEFVAR_VERIFY);
        register_api_special(DEFVAR_PRIVATE, API_SPECIAL_DEFVAR_PRIVATE);
        register_api_special_verify(DEFVAR_PRIVATE, API_SPECIAL_DEFVAR_PRIVATE_VERIFY);
        register_cyc_api_function(CLEAR_API_USER_VARIABLES, NIL, $str114$Removes_all_user_variables_, NIL, $list115);
        register_cyc_api_function(PUT_API_USER_VARIABLE, $list117, $str118$Sets_the_value_of_a_the_user_vari, NIL, $list115);
        register_cyc_api_function(GET_API_USER_VARIABLE, $list120, $str121$Gets_the_value_of_a_the_user_vari, NIL, NIL);
        register_api_special(FI_SET_PARAMETER, API_SPECIAL_FI_SET_PARAMETER);
        register_api_special_verify(FI_SET_PARAMETER, API_SPECIAL_FI_SET_PARAMETER_VERIFY);
        register_api_special(CSETQ, API_SPECIAL_CSETQ);
        register_api_special_verify(CSETQ, API_SPECIAL_CSETQ_VERIFY);
        register_api_special(CINC, API_SPECIAL_CINC);
        register_api_special_verify(CINC, API_SPECIAL_CINC_VERIFY);
        register_api_special(CDEC, API_SPECIAL_CDEC);
        register_api_special_verify(CDEC, API_SPECIAL_CDEC_VERIFY);
        register_api_special(CPUSH, API_SPECIAL_CPUSH);
        register_api_special_verify(CPUSH, API_SPECIAL_CPUSH_VERIFY);
        register_api_special(CPOP, API_SPECIAL_CPOP);
        register_api_special_verify(CPOP, API_SPECIAL_CPOP_VERIFY);
        register_api_special(EVAL, API_SPECIAL_EVAL);
        register_api_special_verify(EVAL_IN_API, API_SPECIAL_EVAL_IN_API_VERIFY);
        register_api_special(FI_EVAL, API_SPECIAL_FI_EVAL);
        register_api_special_verify(FI_EVAL, API_SPECIAL_FI_EVAL_VERIFY);
        register_api_special(FI_LOCAL_EVAL, API_SPECIAL_FI_LOCAL_EVAL);
        register_api_special_verify(FI_LOCAL_EVAL, API_SPECIAL_FI_LOCAL_EVAL_VERIFY);
        register_api_special(APPLY, API_SPECIAL_APPLY);
        register_api_special_verify(APPLY, API_SPECIAL_APPLY_VERIFY);
        register_api_special(FBOUNDP, API_SPECIAL_FBOUNDP);
        register_api_special_verify(FBOUNDP, API_SPECIAL_FBOUNDP_VERIFY);
        register_api_special(FUNCALL, API_SPECIAL_FUNCALL);
        register_api_special_verify(FUNCALL, API_SPECIAL_FUNCALL_VERIFY);
        register_api_special(MULTIPLE_VALUE_LIST, API_SPECIAL_MULTIPLE_VALUE_LIST);
        register_api_special_verify(MULTIPLE_VALUE_LIST, API_SPECIAL_MULTIPLE_VALUE_LIST_VERIFY);
        register_api_special(TRACE, API_SPECIAL_TRACE);
        register_api_special_verify(TRACE, API_SPECIAL_TRACE_VERIFY);
        register_api_special(UNTRACE, API_SPECIAL_UNTRACE);
        register_api_special_verify(UNTRACE, API_SPECIAL_UNTRACE_VERIFY);
        register_api_special(GET_TRACE_LOG, API_SPECIAL_GET_TRACE_LOG);
        register_api_special_verify(GET_TRACE_LOG, API_SPECIAL_GET_TRACE_LOG_VERIFY);
        register_api_special(CLEAR_TRACE_LOG, API_SPECIAL_CLEAR_TRACE_LOG);
        register_api_special_verify(CLEAR_TRACE_LOG, API_SPECIAL_CLEAR_TRACE_LOG_VERIFY);
        register_api_special(PROGN, API_SPECIAL_PROGN);
        register_api_special_verify(PROGN, API_SPECIAL_PROGN_VERIFY);
        register_api_special(CLET, API_SPECIAL_CLET);
        register_api_special_verify(CLET, API_SPECIAL_CLET_VERIFY);
        register_api_special(CMULTIPLE_VALUE_BIND, API_SPECIAL_CMULTIPLE_VALUE_BIND);
        register_api_special_verify(CMULTIPLE_VALUE_BIND, API_SPECIAL_CMULTIPLE_VALUE_BIND_VERIFY);
        register_api_special(CAND, API_SPECIAL_CAND);
        register_api_special_verify(CAND, API_SPECIAL_CAND_VERIFY);
        register_api_special(COR, API_SPECIAL_COR);
        register_api_special_verify(COR, API_SPECIAL_COR_VERIFY);
        register_api_special(CNOT, API_SPECIAL_CNOT);
        register_api_special_verify(CNOT, API_SPECIAL_CNOT_VERIFY);
        register_api_special(PCOND, API_SPECIAL_PCOND);
        register_api_special_verify(PCOND, API_SPECIAL_PCOND_VERIFY);
        register_api_special(PIF, API_SPECIAL_PIF);
        register_api_special_verify(PIF, API_SPECIAL_PIF_VERIFY);
        register_api_special(FIF, API_SPECIAL_FIF);
        register_api_special_verify(FIF, API_SPECIAL_FIF_VERIFY);
        register_api_special(PWHEN, API_SPECIAL_PWHEN);
        register_api_special_verify(PWHEN, API_SPECIAL_PWHEN_VERIFY);
        register_api_special(WHEN, API_SPECIAL_WHEN);
        register_api_special_verify(WHEN, API_SPECIAL_WHEN_VERIFY);
        register_api_special(FWHEN, API_SPECIAL_FWHEN);
        register_api_special_verify(FWHEN, API_SPECIAL_FWHEN_VERIFY);
        register_api_special(PUNLESS, API_SPECIAL_PUNLESS);
        register_api_special_verify(PUNLESS, API_SPECIAL_PUNLESS_VERIFY);
        register_api_special(FUNLESS, API_SPECIAL_FUNLESS);
        register_api_special_verify(FUNLESS, API_SPECIAL_FUNLESS_VERIFY);
        register_api_special(WHILE, API_SPECIAL_WHILE);
        register_api_special_verify(WHILE, API_SPECIAL_WHILE_VERIFY);
        register_api_special(UNTIL, API_SPECIAL_UNTIL);
        register_api_special_verify(UNTIL, API_SPECIAL_UNTIL_VERIFY);
        register_api_special(CDO, API_SPECIAL_CDO);
        register_api_special_verify(CDO, API_SPECIAL_CDO_VERIFY);
        register_api_special(CDOLIST, API_SPECIAL_CDOLIST);
        register_api_special_verify(CDOLIST, API_SPECIAL_CDOLIST_VERIFY);
        register_api_special(CDOTIMES, API_SPECIAL_CDOTIMES);
        register_api_special_verify(CDOTIMES, API_SPECIAL_CDOTIMES_VERIFY);
        register_api_special(CDOHASH, API_SPECIAL_CDOHASH);
        register_api_special_verify(CDOHASH, API_SPECIAL_CDOHASH_VERIFY);
        register_api_special(MAPCAR, API_SPECIAL_MAPCAR);
        register_api_special_verify(MAPCAR, API_SPECIAL_MAPCAR_VERIFY);
        register_api_special(MAPDICTIONARY, API_SPECIAL_MAPDICTIONARY);
        register_api_special_verify(MAPDICTIONARY, API_SPECIAL_MAPDICTIONARY_VERIFY);
        register_api_special(MAPDICTIONARY_PARAMETERIZED, API_SPECIAL_MAPDICTIONARY_PARAMETERIZED);
        register_api_special_verify(MAPDICTIONARY_PARAMETERIZED, API_SPECIAL_MAPDICTIONARY_PARAMETERIZED_VERIFY);
        register_api_special(CCATCH, API_SPECIAL_CCATCH);
        register_api_special_verify(CCATCH, API_SPECIAL_CCATCH_VERIFY);
        register_api_special(THROW, API_SPECIAL_THROW);
        register_api_special_verify(THROW, API_SPECIAL_THROW_VERIFY);
        register_api_special(IGNORE_ERRORS, API_SPECIAL_IGNORE_ERRORS);
        register_api_special_verify(IGNORE_ERRORS, API_SPECIAL_IGNORE_ERRORS_VERIFY);
        register_api_special(CUNWIND_PROTECT, API_SPECIAL_CUNWIND_PROTECT);
        register_api_special_verify(CUNWIND_PROTECT, API_SPECIAL_CUNWIND_PROTECT_VERIFY);
        register_api_special(LOAD, API_SPECIAL_LOAD);
        register_api_special_verify(LOAD, API_SPECIAL_LOAD_VERIFY);
        register_api_special(CHECK_TYPE, API_SPECIAL_CHECK_TYPE);
        register_api_special_verify(CHECK_TYPE, API_SPECIAL_CHECK_TYPE_VERIFY);
        register_api_special(QUOTE, API_SPECIAL_QUOTE);
        register_api_special_verify(QUOTE, API_SPECIAL_QUOTE_VERIFY);
        register_api_special(BOUNDP, API_SPECIAL_BOUNDP);
        register_api_special_verify(BOUNDP, API_SPECIAL_BOUNDP_VERIFY);
        register_api_special(SYMBOL_VALUE, API_SPECIAL_SYMBOL_VALUE);
        register_api_special_verify(SYMBOL_VALUE, API_SPECIAL_SYMBOL_VALUE_VERIFY);
        register_api_special(FUNCTION, API_SPECIAL_FUNCTION);
        register_api_special_verify(FUNCTION, API_SPECIAL_FUNCTION_VERIFY);
        register_api_special(ERROR, API_SPECIAL_ERROR);
        register_api_special_verify(ERROR, API_SPECIAL_ERROR_VERIFY);
        register_api_special(BREAK, API_SPECIAL_BREAK);
        register_api_special_verify(BREAK, API_SPECIAL_BREAK_VERIFY);
        register_api_special(CLEAR_ENVIRONMENT, API_SPECIAL_CLEAR_ENVIRONMENT);
        register_api_special_verify(CLEAR_ENVIRONMENT, API_SPECIAL_CLEAR_ENVIRONMENT_VERIFY);
        register_api_special(GET_ENVIRONMENT, API_SPECIAL_GET_ENVIRONMENT);
        register_api_special_verify(GET_ENVIRONMENT, API_SPECIAL_GET_ENVIRONMENT_VERIFY);
        register_api_special(IN_PACKAGE, API_SPECIAL_IN_PACKAGE);
        register_api_special_verify(IN_PACKAGE, API_SPECIAL_IN_PACKAGE_VERIFY);
        register_api_special(CTIME, API_SPECIAL_CTIME);
        register_api_special_verify(CTIME, API_SPECIAL_CTIME_VERIFY);
        register_api_special(NOTING_PERCENT_PROGRESS, API_SPECIAL_NOTING_PERCENT_PROGRESS);
        register_api_special_verify(NOTING_PERCENT_PROGRESS, API_SPECIAL_NOTING_PERCENT_PROGRESS_VERIFY);
        register_api_special(NOTING_ACTIVITY, API_SPECIAL_NOTING_ACTIVITY);
        register_api_special_verify(NOTING_ACTIVITY, API_SPECIAL_NOTING_ACTIVITY_VERIFY);
        return NIL;
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

    
}

/**
 * Total time: 1266 ms
 */
