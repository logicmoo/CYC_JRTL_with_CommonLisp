/**
 * Copyright (c) 1995 - 2009 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;

import static com.cyc.cycjava.cycl.access_macros.external_function_p;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

/**
 * Copyright (c) 1995 - 2009 Cycorp, Inc.  All rights reserved.
 * module:      JAVA-BACKEND
 * source file: /cyc/top/cycl/java-backend.lisp
 * created:     2009/12/24 17:39:08
 */
public final class java_backend extends SubLTranslatedFile {
	public static final SubLString $str_alt281$ = makeString("");

	public static final SubLFile me = new java_backend();

	public static final String myName = "com.cyc.cycjava.cycl.java_backend";

	public static final String myFingerPrint = "c4a2eff9f04a144a84238f7e25a2105038dafa78d9594c8ed83e07415238b981";

	// deflexical
	@LispMethod(comment = "deflexical")
	public static final SubLSymbol $all_java_backend_logging_levels$ = makeSymbol("*ALL-JAVA-BACKEND-LOGGING-LEVELS*");

	// deflexical
	@LispMethod(comment = "deflexical")
	public static final SubLSymbol $java_backend_logging_blacklist_patterns$ = makeSymbol("*JAVA-BACKEND-LOGGING-BLACKLIST-PATTERNS*");

	// defparameter
	@LispMethod(comment = "defparameter")
	private static final SubLSymbol $java_backend_new_array_items_on_separate_linesP$ = makeSymbol("*JAVA-BACKEND-NEW-ARRAY-ITEMS-ON-SEPARATE-LINES?*");

	// defparameter
	@LispMethod(comment = "defparameter")
	// Definitions
	private static final SubLSymbol $java_backend_current_local_variable_scope$ = makeSymbol("*JAVA-BACKEND-CURRENT-LOCAL-VARIABLE-SCOPE*");

	// defparameter
	@LispMethod(comment = "defparameter")
	private static final SubLSymbol $java_backend_previous_local_variable_scope$ = makeSymbol("*JAVA-BACKEND-PREVIOUS-LOCAL-VARIABLE-SCOPE*");

	// defparameter
	@LispMethod(comment = "defparameter")
	private static final SubLSymbol $java_backend_current_class$ = makeSymbol("*JAVA-BACKEND-CURRENT-CLASS*");

	// defparameter
	@LispMethod(comment = "A list of additional initializer methods that are abstracted out so as to sidestep the\r\n\'code too large\' limitation of Java.\ndefparameter\nA list of additional initializer methods that are abstracted out so as to sidestep the\n\'code too large\' limitation of Java.")
	/**
	 * A list of additional initializer methods that are abstracted out so as to sidestep the
	 * 'code too large' limitation of Java.
	 */
	private static final SubLSymbol $java_backend_initializer_methods$ = makeSymbol("*JAVA-BACKEND-INITIALIZER-METHODS*");

	// deflexical
	@LispMethod(comment = "deflexical")
	private static final SubLSymbol $java_backend_writers$ = makeSymbol("*JAVA-BACKEND-WRITERS*");

	// deflexical
	@LispMethod(comment = "deflexical")
	private static final SubLSymbol $java_backend_uninterruptible_methods$ = makeSymbol("*JAVA-BACKEND-UNINTERRUPTIBLE-METHODS*");

	// defvar
	@LispMethod(comment = "Temporary control variable.  Eventually should stay NIL.\ndefvar")
	/**
	 * Temporary control variable.  Eventually should stay NIL.
	 */
	private static final SubLSymbol $java_backend_funcall_optimization_enabledP$ = makeSymbol("*JAVA-BACKEND-FUNCALL-OPTIMIZATION-ENABLED?*");

	// deflexical
	@LispMethod(comment = "deflexical")
	private static final SubLSymbol $java_backend_object_data_type$ = makeSymbol("*JAVA-BACKEND-OBJECT-DATA-TYPE*");

	// deflexical
	@LispMethod(comment = "deflexical")
	private static final SubLSymbol $java_backend_defstruct_override_limit$ = makeSymbol("*JAVA-BACKEND-DEFSTRUCT-OVERRIDE-LIMIT*");

	// deflexical
	@LispMethod(comment = "deflexical")
	private static final SubLSymbol $java_backend_initializer_size_threshold$ = makeSymbol("*JAVA-BACKEND-INITIALIZER-SIZE-THRESHOLD*");

	// deflexical
	@LispMethod(comment = "deflexical")
	private static final SubLSymbol $target_most_positive_int$ = makeSymbol("*TARGET-MOST-POSITIVE-INT*");

	// deflexical
	@LispMethod(comment = "deflexical")
	private static final SubLSymbol $target_most_negative_int$ = makeSymbol("*TARGET-MOST-NEGATIVE-INT*");

	// defparameter
	@LispMethod(comment = "defparameter")
	private static final SubLSymbol $java_backend_current_thread_variable$ = makeSymbol("*JAVA-BACKEND-CURRENT-THREAD-VARIABLE*");

	// deflexical
	@LispMethod(comment = "deflexical")
	private static final SubLSymbol $java_backend_unary_function_class_template$ = makeSymbol("*JAVA-BACKEND-UNARY-FUNCTION-CLASS-TEMPLATE*");

	// deflexical
	@LispMethod(comment = "deflexical")
	private static final SubLSymbol $java_backend_unary_function_class_initializer_template$ = makeSymbol("*JAVA-BACKEND-UNARY-FUNCTION-CLASS-INITIALIZER-TEMPLATE*");

	// deflexical
	@LispMethod(comment = "deflexical")
	private static final SubLSymbol $java_backend_binary_function_class_template$ = makeSymbol("*JAVA-BACKEND-BINARY-FUNCTION-CLASS-TEMPLATE*");

	// deflexical
	@LispMethod(comment = "deflexical")
	private static final SubLSymbol $java_backend_binary_function_class_initializer_template$ = makeSymbol("*JAVA-BACKEND-BINARY-FUNCTION-CLASS-INITIALIZER-TEMPLATE*");

	// deflexical
	@LispMethod(comment = "deflexical")
	private static final SubLSymbol $java_backend_zero_arity_function_class_template$ = makeSymbol("*JAVA-BACKEND-ZERO-ARITY-FUNCTION-CLASS-TEMPLATE*");

	// deflexical
	@LispMethod(comment = "deflexical")
	private static final SubLSymbol $java_backend_zero_arity_function_class_initializer_template$ = makeSymbol("*JAVA-BACKEND-ZERO-ARITY-FUNCTION-CLASS-INITIALIZER-TEMPLATE*");

	// deflexical
	@LispMethod(comment = "deflexical")
	private static final SubLSymbol $java_backend_write_system_init_file_preamble$ = makeSymbol("*JAVA-BACKEND-WRITE-SYSTEM-INIT-FILE-PREAMBLE*");

	// deflexical
	@LispMethod(comment = "deflexical")
	private static final SubLSymbol $java_backend_write_system_init_file_postamble$ = makeSymbol("*JAVA-BACKEND-WRITE-SYSTEM-INIT-FILE-POSTAMBLE*");

	// deflexical
	@LispMethod(comment = "deflexical")
	private static final SubLSymbol $patcher_template$ = makeSymbol("*PATCHER-TEMPLATE*");

	// defvar
	@LispMethod(comment = "NIL or a dictionary mapping OPERATOR -> alist of (ARITY . COUNT) tuples\ndefvar")
	/**
	 * NIL or a dictionary mapping OPERATOR -> alist of (ARITY . COUNT) tuples
	 */
	private static final SubLSymbol $java_backend_rest_arity_table$ = makeSymbol("*JAVA-BACKEND-REST-ARITY-TABLE*");

	private static final SubLList $list0 = list(makeKeyword("API"), makeKeyword("EXTERNAL"), makeKeyword("PUBLIC"), $NONE);

	private static final SubLList $list2 = list(list(makeSymbol("LEVEL")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol $sym5$MEMBER_ = makeSymbol("MEMBER?");

	private static final SubLList $list6 = list(makeSymbol("*ALL-JAVA-BACKEND-LOGGING-LEVELS*"));

	private static final SubLString $str7$Invalid_logging_level__A__not_a_m = makeString("Invalid logging level ~A, not a member of ~A.");

	public static final SubLSymbol $java_backend_logging_detail$ = makeSymbol("*JAVA-BACKEND-LOGGING-DETAIL*");

	private static final SubLList $list10 = list(list(makeSymbol("FLAG-P"), makeSymbol("METHOD")), makeSymbol("&BODY"), makeSymbol("BODY"));

	public static final SubLSymbol $java_backend_logging_for_current_method$ = makeSymbol("*JAVA-BACKEND-LOGGING-FOR-CURRENT-METHOD*");

	private static final SubLList $list13 = list(NIL);

	private static final SubLList $list14 = list(list(makeKeyword("ENDS-WITH"), makeString("-P")), list(makeKeyword("ENDS-WITH"), makeString("?")));

	private static final SubLList $list15 = list(makeSymbol("OPERATOR"), makeSymbol("DATA"));

	private static final SubLString $str17$Unimplemented_black_listing_opera = makeString("Unimplemented black-listing operator ~A.");

	private static final SubLSymbol PUBLIC = makeSymbol("PUBLIC");

	private static final SubLString $str22$__import_org_slf4j_Logger_ = makeString("~&import org.slf4j.Logger;");

	private static final SubLString $str23$__import_org_slf4j_LoggerFactory_ = makeString("~&import org.slf4j.LoggerFactory;");

	private static final SubLString $str24$final_static_private_Logger_myLog = makeString("final static private Logger myLogger = LoggerFactory.getLogger(myName);");

	private static final SubLString $str25$myLogger_trace__Enter___ = makeString("myLogger.trace(\"Enter {}");

	private static final SubLString $str26$_ = makeString(":");

	private static final SubLSymbol $sym27$_OPTIONAL = makeSymbol("&OPTIONAL");

	private static final SubLString $str28$___ = makeString(" {}");

	private static final SubLString $str29$___new_Object____ = makeString("\", new Object[] {");

	private static final SubLString $str30$__ = makeString(", ");

	private static final SubLString $str31$____ = makeString("}); ");

	private static final SubLString $str32$myLogger_trace__Leave__________ = makeString("myLogger.trace(\"Leave {}: {}\", ");

	private static final SubLString $str33$___ = makeString("); ");

	@LispMethod(comment = "Internal Constants")
	// Internal Constants
	private static final SubLSymbol TRANS_SUBL_FILE_P = makeSymbol("TRANS-SUBL-FILE-P");

	private static final SubLInteger $int$1048576 = makeInteger(0x100000);

	private static final SubLString $str38$Unable_to_open__S = makeString("Unable to open ~S");

	private static final SubLString $str40$____ = makeString("/*~%");

	private static final SubLString $str41$_____A__ = makeString(" *  ~A~%");

	private static final SubLString $str42$___ = makeString(" */");

	private static final SubLString $str43$____package__A_ = makeString("~%~%package ~A;");

	private static final SubLString $$$SUBLISP = makeString("SUBLISP");

	private static final SubLString $str45$com_cyc_tool_subl_jrtl_translated = makeString("com.cyc.tool.subl.jrtl.translatedCode");

	private static final SubLString $$$CYCL = makeString("CYCL");

	private static final SubLString $str47$com_cyc_cycjava = makeString("com.cyc.cycjava");

	private static final SubLString $str48$time_to_implement_multiple_system = makeString("time to implement multiple system translation");

	private static final SubLString $str49$_ = makeString(".");

	private static final SubLString $str51$package_ = makeString("package_");

	private static final SubLList $list52 = list(CHAR_slash);

	private static final SubLString $str53$__import_java_util_Iterator_ = makeString("~%import java.util.Iterator;");

	private static final SubLString $str54$__import_java_util_Map_Entry_ = makeString("~%import java.util.Map.Entry;");

	private static final SubLString $str55$__import_java_util_ArrayList_ = makeString("~%import java.util.ArrayList;");

	private static final SubLString $str56$__import_com_cyc_tool_subl_jrtl_n = makeString("~%import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;");

	private static final SubLString $str57$__import_com_cyc_tool_subl_jrtl_n = makeString("~%import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;");

	private static final SubLString $str58$__import_com_cyc_tool_subl_jrtl_n = makeString("~%import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;");

	private static final SubLString $str59$__import_com_cyc_tool_subl_jrtl_n = makeString("~%import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;");

	private static final SubLString $str60$__import_com_cyc_tool_subl_jrtl_t = makeString("~%import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;");

	private static final SubLString $str61$__import_com_cyc_tool_subl_util__ = makeString("~%import com.cyc.tool.subl.util.*;");

	private static final SubLString $str62$__import_static_com_cyc_tool_subl = makeString("~%import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.~A;");

	private static final SubLList $list63 = list(new SubLObject[] { makeString("makeBoolean"), makeString("makeInteger"), makeString("makeDouble"), makeString("makeChar"), makeString("makeString"), makeString("makeSymbol"), makeString("makeKeyword"), makeString("makeUninternedSymbol"), makeString("makeGuid") });

	private static final SubLString $str64$__import_static_com_cyc_tool_subl = makeString("~%import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.~A;");

	private static final SubLList $list65 = list(makeString("cons"), makeString("list"), makeString("listS"));

	private static final SubLString $str66$__import_static_com_cyc_tool_subl = makeString("~%import static com.cyc.tool.subl.util.SubLFiles.~A;");

	private static final SubLList $list67 = list(makeString("defconstant"), makeString("deflexical"), makeString("defparameter"), makeString("defvar"), makeString("declareFunction("), makeString("declareMacro"));

	private static final SubLString $str68$CONSTANT_HANDLES = makeString("CONSTANT-HANDLES");

	private static final SubLString $str69$____ = makeString("~%~%");

	private static final SubLString $str70$__import__A_ = makeString("~%import ~A;");

	private static final SubLSymbol $java_backend_eliminate_uninteresting_variance$ = makeSymbol("*JAVA-BACKEND-ELIMINATE-UNINTERESTING-VARIANCE*");

	private static final SubLString $str72$_____ = makeString("/**~%");

	private static final SubLList $list73 = list($NONE, makeKeyword("MEDIUM"));

	private static final SubLString $str74$____module________A__ = makeString(" *  module:      ~A~%");

	private static final SubLString $str75$____source_file___A__ = makeString(" *  source file: ~A~%");

	private static final SubLString $str77$____created_______4__0D__2__0D__2 = makeString(" *  created:     ~4,'0D/~2,'0D/~2,'0D ~2,'0D:~2,'0D:~2,'0D~%");

	private static final SubLString $$$public_final_class_ = makeString("public final class ");

	private static final SubLString $$$_extends_SubLTranslatedFile_ = makeString(" extends SubLTranslatedFile ");

	private static final SubLString $str80$_ = makeString("{");

	private static final SubLString $str81$_ = makeString("}");

	private static final SubLSymbol JAVA_BACKEND_MODULE_CLASS_NAME = makeSymbol("JAVA-BACKEND-MODULE-CLASS-NAME");

	private static final SubLList $list83 = list(makeKeyword("LOW"), $HIGH);

	private static final SubLString $str84$module_4__0D = makeString("module~4,'0D");

	private static final SubLString $str85$_____Constructor = makeString("//// Constructor");

	private static final SubLString $str86$private__A_____ = makeString("private ~A() {}");

	private static final SubLString $str87$public_static_final_SubLFile_me__ = makeString("public static final SubLFile me = new ~A();");

	private static final SubLString $str88$public_static_final_String_myName = makeString("public static final String myName = ~S;");

	private static final SubLString $str89$public_static_final_String_myFing = makeString("public static final String myFingerPrint = ~S;");

	private static final SubLList $list90 = list(list(makeSymbol("*JAVA-BACKEND-INITIALIZER-METHODS*"), NIL));

	private static final SubLString $str92$_____Definitions = makeString("//// Definitions");

	private static final SubLString $str93$_____Internal_Constants = makeString("//// Internal Constants");

	private static final SubLString $str94$_____Internal_Constant_Initialize = makeString("//// Internal Constant Initializer Methods");

	private static final SubLSymbol $sym96$_INTERNAL_CONSTANT = makeSymbol("%INTERNAL-CONSTANT");

	private static final SubLList $list97 = list(makeSymbol("OPERATOR"), makeSymbol("ARGLIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol TRANSLATOR_INTERNAL_CONSTANT_FORM_P = makeSymbol("TRANSLATOR-INTERNAL-CONSTANT-FORM-P");

	private static final SubLString $str99$_____Initializers = makeString("//// Initializers");

	private static final SubLString $str100$_Override_public_void_declareFunc = makeString("@Override public void declareFunctions() {");

	private static final SubLString $str101$_Override_public_void_initializeV = makeString("@Override public void initializeVariables() {");

	private static final SubLString $str102$_Override_public_void_runTopLevel = makeString("@Override public void runTopLevelForms() {");

	private static final SubLString $str103$_ = makeString(";");

	private static final SubLString $$$__ = makeString("  ");

	private static final SubLString $str105$Unexpected_C_backend_atom____S = makeString("Unexpected C backend atom : ~S");

	private static final SubLList $list106 = list(makeSymbol("OPERATOR"), makeSymbol("CONSTANT"));

	private static final SubLSymbol $sym107$_PC = makeSymbol("%PC");

	private static final SubLString $str108$Time_to_implement_a_C_backend_tra = makeString("Time to implement a C backend translation for predefined constant ~S");

	private static final SubLString $str114$unexpected_variable_binding_type_ = makeString("unexpected variable binding type ~S for ~S");

	private static final SubLList $list115 = list(list(makeSymbol("*JAVA-BACKEND-PREVIOUS-LOCAL-VARIABLE-SCOPE*"), makeSymbol("*JAVA-BACKEND-CURRENT-LOCAL-VARIABLE-SCOPE*")), list(makeSymbol("*JAVA-BACKEND-CURRENT-LOCAL-VARIABLE-SCOPE*"), makeSymbol("*JAVA-BACKEND-CURRENT-LOCAL-VARIABLE-SCOPE*")));

	private static final SubLString $str117$_s_is_an_undeclared_variable__can = makeString("~s is an undeclared variable; cannot translate");

	private static final SubLString $str118$v_ = makeString("v_");

	private static final SubLString $str119$__ = makeString("_$");

	private static final SubLList $list120 = cons(makeSymbol("CURRENT-LOCAL-FROM-SCOPE"), makeSymbol("ITS-NAME"));

	private static final SubLString $$$var = makeString("var");

	private static final SubLSymbol JAVA_BACKEND_SECURE_LOCAL_ID = makeSymbol("JAVA-BACKEND-SECURE-LOCAL-ID");

	private static final SubLList $list123 = list(makeSymbol("OPERATOR"), makeSymbol("&REST"), makeSymbol("ARGS"));

	private static final SubLString $str125$translating__S_call_as_funcall = makeString("translating ~S call as funcall");

	private static final SubLSymbol $sym127$_LF = makeSymbol("%LF");

	private static final SubLString $str128$_S_called_with__S_missing_require = makeString("~S called with ~S missing required arguments");

	private static final SubLString $str129$_S_called_with__S_excess_argument = makeString("~S called with ~S excess arguments");

	private static final SubLString $str130$_ = makeString("(");

	private static final SubLList $list131 = cons(makeSymbol("ARG"), makeSymbol("REST-ARGS"));

	private static final SubLString $str132$_ = makeString(")");

	private static final SubLList $list134 = list(makeSymbol("%NC"), makeSymbol("%EMPTY-ARRAY"));

	private static final SubLSymbol $sym135$_NEW_ARRAY = makeSymbol("%NEW-ARRAY");

	private static final SubLString $$$SubLObject = makeString("SubLObject");

	private static final SubLString $str137$_CSETF_ = makeString("_CSETF-");

	private static final SubLList $list138 = list(makeSymbol("OBJECT"), makeSymbol("VALUE"));

	private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

	private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

	private static final SubLString $str141$unable_to_introspect_on__S = makeString("unable to introspect on ~S");

	private static final SubLString $str142$Unexpected_function__S = makeString("Unexpected function ~S");

	private static final SubLString $$$UNPROVIDED = makeString("UNPROVIDED");

	private static final SubLList $list144 = list(new SubLObject[] { cons(makeSymbol("%AND"), makeSymbol("JAVA-BACKEND-WRITE-%AND")), cons(makeSymbol("%CCATCH"), makeSymbol("JAVA-BACKEND-WRITE-%CCATCH")), cons(makeSymbol("%CDO-SYMBOLS"), makeSymbol("JAVA-BACKEND-WRITE-%CDO-SYMBOLS")), cons(makeSymbol("%CDOHASH"), makeSymbol("JAVA-BACKEND-WRITE-%CDOHASH")),
			cons(makeSymbol("CLET-BIND"), makeSymbol("JAVA-BACKEND-WRITE-CLET-BIND")), cons(makeSymbol("CLET-LOCAL"), makeSymbol("JAVA-BACKEND-WRITE-CLET-LOCAL")), cons(makeSymbol("CODE-COMMENT"), makeSymbol("JAVA-BACKEND-WRITE-CODE-COMMENT")), cons(makeSymbol("%CPROGV"), makeSymbol("JAVA-BACKEND-WRITE-%CPROGV")), cons(makeSymbol("CSETQ"), makeSymbol("JAVA-BACKEND-WRITE-CSETQ")),
			cons(makeSymbol("CSETQ-DYNAMIC"), makeSymbol("JAVA-BACKEND-WRITE-CSETQ-DYNAMIC")), cons(makeSymbol("CSETQ-LEXICAL"), makeSymbol("JAVA-BACKEND-WRITE-CSETQ-LEXICAL")), cons(makeSymbol("CSETQ-LOCAL"), makeSymbol("JAVA-BACKEND-WRITE-CSETQ-LOCAL")), cons(makeSymbol("%CUNWIND-PROTECT"), makeSymbol("JAVA-BACKEND-WRITE-%CUNWIND-PROTECT")), cons(makeSymbol("CVS-ID"), makeSymbol("JAVA-BACKEND-WRITE-CVS-ID")),
			cons(makeSymbol("DEFCONSTANT"), makeSymbol("JAVA-BACKEND-WRITE-DEFCONSTANT")), cons(makeSymbol("DEFINE"), makeSymbol("JAVA-BACKEND-WRITE-DEFINE")), cons(makeSymbol("DEFINE-MACROEXPANDER"), makeSymbol("JAVA-BACKEND-WRITE-DEFINE-MACROEXPANDER")), cons(makeSymbol("DEFLEXICAL"), makeSymbol("JAVA-BACKEND-WRITE-DEFLEXICAL")), cons(makeSymbol("DEFPARAMETER"), makeSymbol("JAVA-BACKEND-WRITE-DEFPARAMETER")),
			cons(makeSymbol("%DEFSTRUCT-CLASS"), makeSymbol("JAVA-BACKEND-WRITE-%DEFSTRUCT-CLASS")), cons(makeSymbol("_DEFSTRUCT-CONSTRUCT", "SUBLISP"), makeSymbol("JAVA-BACKEND-WRITE-DEFSTRUCT-CONSTRUCT")), cons(makeSymbol("_DEFSTRUCT-GET-SLOT", "SUBLISP"), makeSymbol("JAVA-BACKEND-WRITE-DEFSTRUCT-GET-SLOT")), cons(makeSymbol("_DEFSTRUCT-OBJECT-P", "SUBLISP"), makeSymbol("JAVA-BACKEND-WRITE-DEFSTRUCT-OBJECT-P")),
			cons(makeSymbol("_DEFSTRUCT-SET-SLOT", "SUBLISP"), makeSymbol("JAVA-BACKEND-WRITE-DEFSTRUCT-SET-SLOT")), cons(makeSymbol("DEFVAR"), makeSymbol("JAVA-BACKEND-WRITE-DEFVAR")), cons(makeSymbol("%DP-CHECK-TYPE"), makeSymbol("JAVA-BACKEND-WRITE-%DP-CHECK-TYPE")), cons(makeSymbol("%DP-ENFORCE-TYPE"), makeSymbol("JAVA-BACKEND-WRITE-%DP-ENFORCE-TYPE")),
			cons(makeSymbol("%ENTER"), makeSymbol("JAVA-BACKEND-WRITE-%ENTER")), cons(makeSymbol("FIF"), makeSymbol("JAVA-BACKEND-WRITE-FIF")), cons(makeSymbol("%FOR"), makeSymbol("JAVA-BACKEND-WRITE-%FOR")), cons(makeSymbol("%IC"), makeSymbol("JAVA-BACKEND-WRITE-%IC")), cons(makeSymbol("%INTERNAL-CONSTANT"), makeSymbol("JAVA-BACKEND-WRITE-%INTERNAL-CONSTANT")),
			cons(makeSymbol("%LF"), makeSymbol("JAVA-BACKEND-WRITE-%LF")), cons(makeSymbol("%LOCAL"), makeSymbol("JAVA-BACKEND-WRITE-%LOCAL")), cons(makeSymbol("MULTIPLE-VALUE-LIST"), makeSymbol("JAVA-BACKEND-WRITE-MULTIPLE-VALUE-LIST")), cons(makeSymbol("%NC"), makeSymbol("JAVA-BACKEND-WRITE-%NC")), cons(makeSymbol("%NOT"), makeSymbol("JAVA-BACKEND-WRITE-%NOT")),
			cons(makeSymbol("NTH-VALUE"), makeSymbol("JAVA-BACKEND-WRITE-NTH-VALUE")), cons(makeSymbol("%OR"), makeSymbol("JAVA-BACKEND-WRITE-%OR")), cons(makeSymbol("%PC"), makeSymbol("JAVA-BACKEND-WRITE-%PC")), cons(makeSymbol("PCOND"), makeSymbol("JAVA-BACKEND-WRITE-PCOND")), cons(makeSymbol("PROGN"), makeSymbol("JAVA-BACKEND-WRITE-PROGN")),
			cons(makeSymbol("%PROCLAIM"), makeSymbol("JAVA-BACKEND-WRITE-%PROCLAIM")), cons(makeSymbol("%REGISTER-FUNCTION"), makeSymbol("JAVA-BACKEND-WRITE-%REGISTER-FUNCTION")), cons(makeSymbol("%REGISTER-GLOBAL"), makeSymbol("JAVA-BACKEND-WRITE-%REGISTER-GLOBAL")), cons(makeSymbol("%REGISTER-MACRO"), makeSymbol("JAVA-BACKEND-WRITE-%REGISTER-MACRO")), cons(RET, makeSymbol("JAVA-BACKEND-WRITE-RET")),
			cons(makeSymbol("WHILE"), makeSymbol("JAVA-BACKEND-WRITE-WHILE")), cons(makeSymbol("%WITH-CURRENT-THREAD"), makeSymbol("JAVA-BACKEND-WRITE-%WITH-CURRENT-THREAD")), cons(makeSymbol("%WITH-ERROR-HANDLER"), makeSymbol("JAVA-BACKEND-WRITE-%WITH-ERROR-HANDLER")), cons(makeSymbol("%WITH-PROCESS-RESOURCE-TRACKING"), makeSymbol("JAVA-BACKEND-WRITE-%WITH-PROCESS-RESOURCE-TRACKING")),
			cons(makeSymbol("%="), makeSymbol("JAVA-BACKEND-WRITE-%=")), cons(makeSymbol("%=="), makeSymbol("JAVA-BACKEND-WRITE-%==")), cons(makeSymbol("%NOT-%=="), makeSymbol("JAVA-BACKEND-WRITE-%NOT-%==")), cons(makeSymbol("%ANNOTATION"), makeSymbol("JAVA-BACKEND-WRITE-%ANNOTATION")), cons(makeSymbol("%ASSERT"), makeSymbol("JAVA-BACKEND-WRITE-%ASSERT")),
			cons(makeSymbol("%BIND"), makeSymbol("JAVA-BACKEND-WRITE-%BIND")), cons(makeSymbol("%CAST"), makeSymbol("JAVA-BACKEND-WRITE-%CAST")), cons(makeSymbol("%CURRENT-BINDING"), makeSymbol("JAVA-BACKEND-WRITE-%CURRENT-BINDING")), cons(makeSymbol("%FIELD"), makeSymbol("JAVA-BACKEND-WRITE-%FIELD")), cons(makeSymbol("%IDENTIFIER"), makeSymbol("JAVA-BACKEND-WRITE-%IDENTIFIER")),
			cons(makeSymbol("%INIT-OPT-ARG"), makeSymbol("JAVA-BACKEND-WRITE-%INIT-OPT-ARG")), cons(makeSymbol("%INSTANCEOF"), makeSymbol("JAVA-BACKEND-WRITE-%INSTANCEOF")), cons(makeSymbol("%DYN"), makeSymbol("JAVA-BACKEND-WRITE-%DYN")), cons(makeSymbol("%LEX"), makeSymbol("JAVA-BACKEND-WRITE-%LEX")), cons(makeSymbol("%SET-DYN"), makeSymbol("JAVA-BACKEND-WRITE-%SET-DYN")),
			cons(makeSymbol("%SET-LEX"), makeSymbol("JAVA-BACKEND-WRITE-%SET-LEX")), cons(makeSymbol("%METHOD"), makeSymbol("JAVA-BACKEND-WRITE-%METHOD")), cons(makeSymbol("%MVAL"), makeSymbol("JAVA-BACKEND-WRITE-%MVAL")), cons(makeSymbol("%NEW"), makeSymbol("JAVA-BACKEND-WRITE-%NEW")), cons(makeSymbol("%NEW-ARRAY"), makeSymbol("JAVA-BACKEND-WRITE-%NEW-ARRAY")),
			cons(makeSymbol("%NOTE-SUPPLIED"), makeSymbol("JAVA-BACKEND-WRITE-%NOTE-SUPPLIED")), cons(makeSymbol("%REBIND"), makeSymbol("JAVA-BACKEND-WRITE-%REBIND")), cons(makeSymbol("%RESET-MVAL"), makeSymbol("JAVA-BACKEND-WRITE-%RESET-MVAL")), cons(makeSymbol("%THROW"), makeSymbol("JAVA-BACKEND-WRITE-%THROW")), cons(makeSymbol("%TRY"), makeSymbol("JAVA-BACKEND-WRITE-%TRY")),
			cons(makeSymbol("%LOG-ENTER"), makeSymbol("JAVA-BACKEND-WRITE-%LOG-ENTER")) });

	private static final SubLString $str145$Time_to_implement_the_writer_for_ = makeString("Time to implement the writer for ~S");

	private static final SubLList $list146 = list(makeSymbol("OPERATOR"), makeSymbol("OBJECT"), makeSymbol("PRED"));

	private static final SubLSymbol $sym147$_DP_CHECK_TYPE = makeSymbol("%DP-CHECK-TYPE");

	private static final SubLSymbol $sym148$_ASSERT = makeSymbol("%ASSERT");

	private static final SubLSymbol $sym149$_NOT____ = makeSymbol("%NOT-%==");

	private static final SubLList $list150 = list(makeSymbol("%PC"), NIL);

	private static final SubLSymbol $sym151$_DP_ENFORCE_TYPE = makeSymbol("%DP-ENFORCE-TYPE");

	private static final SubLSymbol $sym153$_IC = makeSymbol("%IC");

	private static final SubLSymbol $sym154$_CAST = makeSymbol("%CAST");

	private static final SubLString $$$SubLSymbol = makeString("SubLSymbol");

	private static final SubLString $$$checkType = makeString("checkType");

	private static final SubLString $$$enforceType = makeString("enforceType");

	private static final SubLString $str158$unexpected_checker____S = makeString("unexpected checker : ~S");

	private static final SubLSymbol $sym159$_METHOD = makeSymbol("%METHOD");

	private static final SubLList $list160 = list(makeSymbol("OPERATOR"), list(makeSymbol("TAG"), makeSymbol("ANS-VAR"), makeSymbol("ENV-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol $sym161$_CCATCH = makeSymbol("%CCATCH");

	private static final SubLSymbol $sym162$_TRY = makeSymbol("%TRY");

	private static final SubLString $str163$throwStack_push = makeString("throwStack.push");

	private static final SubLString $$$Throwable = makeString("Throwable");

	private static final SubLSymbol $sym166$_HANDLE_THROWABLE = makeSymbol("%HANDLE-THROWABLE");

	private static final SubLList $list167 = list(makeString("throwStack.pop"));

	private static final SubLSymbol $sym168$THREAD = makeUninternedSymbol("THREAD");

	private static final SubLSymbol $sym169$_WITH_CURRENT_THREAD = makeSymbol("%WITH-CURRENT-THREAD");

	private static final SubLList $list170 = list(makeSymbol("OPERATOR"), list(makeSymbol("SYM"), makeSymbol("PACKAGE-VAR"), makeSymbol("ITERATOR-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol $sym171$_CDO_SYMBOLS = makeSymbol("%CDO-SYMBOLS");

	private static final SubLSymbol $sym172$_LOCAL = makeSymbol("%LOCAL");

	private static final SubLSymbol $sym173$_CDO_SYMBOLS_MAKE_ITERATOR = makeSymbol("%CDO-SYMBOLS-MAKE-ITERATOR");

	private static final SubLList $list174 = list(makeString("Iterator"), makeKeyword("FINAL"));

	private static final SubLSymbol $sym176$_CDO_SYMBOLS_ITERATOR_HAS_NEXT = makeSymbol("%CDO-SYMBOLS-ITERATOR-HAS-NEXT");

	private static final SubLSymbol $sym177$_CDO_SYMBOLS_ITERATOR_NEXT_VALUE = makeSymbol("%CDO-SYMBOLS-ITERATOR-NEXT-VALUE");

	private static final SubLList $list178 = list(makeSymbol("OPERATOR"), makeSymbol("BINDINGS"), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLList $list180 = list(makeSymbol("VARIABLE"), makeSymbol("INITIALIZATION"));

	private static final SubLSymbol $sym181$_CURRENT_BINDING = makeSymbol("%CURRENT-BINDING");

	private static final SubLSymbol $sym182$_BIND = makeSymbol("%BIND");

	private static final SubLSymbol $sym183$_REBIND = makeSymbol("%REBIND");

	private static final SubLSymbol CLET_LOCAL = makeSymbol("CLET-LOCAL");

	private static final SubLSymbol JAVA_BACKEND_CLET_BIND_LOCAL_VARIABLE = makeSymbol("JAVA-BACKEND-CLET-BIND-LOCAL-VARIABLE");

	private static final SubLString $str186$_PREV_BIND_ = makeString("_PREV_BIND_");

	private static final SubLSymbol $java_backend_clet_bind_local_variable_caching_state$ = makeSymbol("*JAVA-BACKEND-CLET-BIND-LOCAL-VARIABLE-CACHING-STATE*");

	private static final SubLList $list188 = list(makeSymbol("OPERATOR"), list(makeSymbol("DYNAMIC-VARS"), makeSymbol("BINDINGS"), makeSymbol("INTERNAL-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol $sym189$_CPROGV = makeSymbol("%CPROGV");

	private static final SubLSymbol $sym190$OLD_VALUES = makeUninternedSymbol("OLD-VALUES");

	private static final SubLSymbol $sym191$_EXTRACT_DYNAMIC_VALUES = makeSymbol("%EXTRACT-DYNAMIC-VALUES");

	private static final SubLList $list192 = list(makeString("ArrayList"), makeKeyword("FINAL"));

	private static final SubLSymbol $sym193$_BIND_DYNAMIC_VARS = makeSymbol("%BIND-DYNAMIC-VARS");

	private static final SubLSymbol $sym194$_REBIND_DYNAMIC_VARS = makeSymbol("%REBIND-DYNAMIC-VARS");

	private static final SubLList $list195 = list(makeSymbol("OPERATOR"), makeSymbol("VARIABLE"), makeSymbol("VALUE"));

	private static final SubLSymbol CSETQ_LOCAL = makeSymbol("CSETQ-LOCAL");

	private static final SubLSymbol CSETQ_DYNAMIC = makeSymbol("CSETQ-DYNAMIC");

	private static final SubLSymbol CSETQ_LEXICAL = makeSymbol("CSETQ-LEXICAL");

	private static final SubLString $str199$The_constant_variable__S_cannot_b = makeString("The constant variable ~S cannot be set");

	private static final SubLString $str200$Unexpected_variable__S = makeString("Unexpected variable ~S");

	private static final SubLSymbol $sym201$_SET_DYN = makeSymbol("%SET-DYN");

	private static final SubLSymbol $sym202$_SET_LEX = makeSymbol("%SET-LEX");

	private static final SubLList $list203 = list(makeSymbol("OPERATOR"), makeSymbol("ENV-VAR"), makeSymbol("PROTECTED-FORM"), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol $sym204$_CUNWIND_PROTECT = makeSymbol("%CUNWIND-PROTECT");

	private static final SubLList $list205 = list(list(makeSymbol("PCOND"), list(list(makeSymbol("%DTB"), makeKeyword("ANYTHING")), list(list($TEST, makeSymbol("JAVA-BACKEND-UNINTERRUPTIBLE-METHOD-P")), makeKeyword("ANYTHING"))), list(list(makeSymbol("%NC"), makeSymbol("%TRUE")))));

	private static final SubLList $list206 = list(list(makeSymbol("%RESTORE-VALUES-FROM-VECTOR"), makeSymbol("_VALUES")));

	private static final SubLList $list207 = list(list(makeSymbol("_VALUES"), list(makeSymbol("%VALUES-AS-VECTOR"))));

	private static final SubLList $list208 = list(list(makeSymbol("*IS-THREAD-PERFORMING-CLEANUP?*", "SUBLISP"), list(makeSymbol("%PC"), T)));

	private static final SubLList $list209 = list(makeSymbol("RELEASE-LOCK", "SUBLISP"), makeSymbol("RW-LOCK-RELEASE-READ-LOCK"), makeSymbol("RW-LOCK-RELEASE-WRITE-LOCK"));

	private static final SubLList $list210 = list(makeSymbol("OPERATOR"), makeSymbol("ID-STRING"));

	private static final SubLString $str212$___CVS_ID_ = makeString("// CVS_ID(");

	private static final SubLList $list214 = list(makeSymbol("OPERATOR"), makeSymbol("VARIABLE"), makeSymbol("INITIALIZATION"), makeSymbol("&OPTIONAL"), makeSymbol("DOCUMENTATION"));

	private static final SubLString $$$private_ = makeString("private ");

	private static final SubLString $$$public_ = makeString("public ");

	private static final SubLString $$$_ = makeString(" ");

	private static final SubLList $list218 = list(makeSymbol("%NC"), makeSymbol("%NULL"));

	private static final SubLList $list219 = list(makeSymbol("OPERATOR"), makeSymbol("NAME"), makeSymbol("ARGLIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLString $str220$_S_was_not_a_top_level_define = makeString("~S was not a top-level define");

	private static final SubLSymbol SKIP_FUNCTION = makeSymbol("SKIP-FUNCTION");

	private static final SubLString $str222$Skip_function__S = makeString("Skip function ~S");

	private static final SubLList $list223 = list(makeSymbol("DOCUMENTATION"), makeSymbol("&BODY"), makeSymbol("REAL-BODY"));

	private static final SubLSymbol $sym224$_LOG_ENTER = makeSymbol("%LOG-ENTER");

	private static final SubLString $str225$Method__S_does_not_return = makeString("Method ~S does not return");

	private static final SubLString $str226$____ = makeString("/** ");

	private static final SubLSymbol $sym227$_ANNOTATION = makeSymbol("%ANNOTATION");

	private static final SubLString $$$SubL = makeString("SubL");

	private static final SubLString $$$source = makeString("source");

	private static final SubLString $$$position = makeString("position");

	private static final SubLString $$$static_ = makeString("static ");

	private static final SubLString $$$final_ = makeString("final ");

	private static final SubLString $str233$__ = makeString("()");

	private static final SubLSymbol DEFINE_MACROEXPANDER = makeSymbol("DEFINE-MACROEXPANDER");

	private static final SubLList $list237 = list(makeSymbol("OPERATOR"), makeSymbol("&REST"), makeSymbol("ANALYSIS"));

	private static final SubLSymbol $sym238$_DEFSTRUCT_CLASS = makeSymbol("%DEFSTRUCT-CLASS");

	private static final SubLString $str241$public_static_final_class__A_exte = makeString("public static final class ~A extends SubLStructNative {~%");

	private static final SubLString $str242$_Override_public_SubLStructDecl_g = makeString("@Override public SubLStructDecl getStructDecl() { return structDecl; }~%");

	private static final SubLString $str243$_Override_ = makeString("@Override ");

	private static final SubLString $str244$public_SubLObject_getField_A_____ = makeString("public SubLObject getField~A() { return ~A; }~%");

	private static final SubLString $str245$public_SubLObject_setField_A_SubL = makeString("public SubLObject setField~A(SubLObject value) { return ~A = value; }~%");

	private static final SubLString $str246$public_SubLObject__A___NIL___ = makeString("public SubLObject ~A = NIL;~%");

	private static final SubLString $str247$private_static_final_SubLStructDe = makeString("private static final SubLStructDeclNative structDecl =~%");

	private static final SubLString $str248$___ = makeString(";~%");

	private static final SubLSymbol JAVA_BACKEND_DEFSTRUCT_CLASS_NAME = makeSymbol("JAVA-BACKEND-DEFSTRUCT-CLASS-NAME");

	private static final SubLString $str250$_ = makeString("$");

	private static final SubLString $str251$_native = makeString("_native");

	private static final SubLSymbol JAVA_BACKEND_DEFSTRUCT_SLOT_NAME = makeSymbol("JAVA-BACKEND-DEFSTRUCT-SLOT-NAME");

	private static final SubLSymbol $sym259$_FIELD = makeSymbol("%FIELD");

	private static final SubLSymbol $sym260$_IDENTIFIER = makeSymbol("%IDENTIFIER");

	private static final SubLList $list261 = list(makeString("class"));

	private static final SubLString $$$String = makeString("String");

	private static final SubLSymbol $sym263$_MAKE_STRUCT_DECL_NATIVE = makeSymbol("%MAKE-STRUCT-DECL-NATIVE");

	private static final SubLList $list264 = list(makeSymbol("OPERATOR"), makeSymbol("C-STRUCTURE-TAG"), makeSymbol("SIZE"), makeSymbol("TYPE-VAR"), makeSymbol("TYPE"));

	private static final SubLSymbol _DEFSTRUCT_CONSTRUCT = makeSymbol("_DEFSTRUCT-CONSTRUCT", "SUBLISP");

	private static final SubLSymbol $sym266$_NEW = makeSymbol("%NEW");

	private static final SubLList $list267 = list(makeSymbol("OPERATOR"), makeSymbol("OBJECT"), makeSymbol("INDEX"), makeSymbol("TYPE"), makeSymbol("SLOT"));

	private static final SubLSymbol _DEFSTRUCT_GET_SLOT = makeSymbol("_DEFSTRUCT-GET-SLOT", "SUBLISP");

	private static final SubLString $$$getField = makeString("getField");

	private static final SubLList $list271 = list(makeSymbol("OPERATOR"), makeSymbol("OBJECT"), makeSymbol("C-STRUCTURE-TAG"), makeSymbol("TYPE-VAR"), makeSymbol("TYPE"));

	private static final SubLSymbol _DEFSTRUCT_OBJECT_P = makeSymbol("_DEFSTRUCT-OBJECT-P", "SUBLISP");

	private static final SubLSymbol $sym273$___ = makeSymbol("%==");

	private static final SubLList $list274 = list(makeString("getClass"));

	private static final SubLList $list275 = list(T);

	private static final SubLList $list276 = list(list(makeSymbol("%PC"), T), list(makeSymbol("%PC"), NIL));

	private static final SubLList $list277 = list(makeSymbol("OPERATOR"), makeSymbol("OBJECT"), makeSymbol("INDEX"), makeSymbol("VALUE"), makeSymbol("TYPE"), makeSymbol("SLOT"));

	private static final SubLSymbol _DEFSTRUCT_SET_SLOT = makeSymbol("_DEFSTRUCT-SET-SLOT", "SUBLISP");

	private static final SubLString $$$setField = makeString("setField");

	private static final SubLSymbol $sym280$__ = makeSymbol("%=");

	private static final SubLList $list282 = list(makeSymbol("OPERATOR"), makeSymbol("CONDITION"), makeSymbol("TRUE-VALUE"), makeSymbol("FALSE-VALUE"));

	private static final SubLString $str283$___ = makeString(" ? ");

	private static final SubLString $str284$___ = makeString(" : ");

	private static final SubLList $list285 = list(makeSymbol("OPERATOR"), makeSymbol("&REST"), makeSymbol("PCOND-CLAUSES"));

	private static final SubLList $list287 = list(makeSymbol("PROGN"));

	private static final SubLList $list288 = list(makeSymbol("FIRST-CLAUSE"), makeSymbol("&REST"), makeSymbol("REST-CLAUSES"));

	private static final SubLList $list289 = list(makeSymbol("TEST"), makeSymbol("&BODY"), makeSymbol("ACTIONS"));

	private static final SubLString $str290$if__ = makeString("if (");

	private static final SubLString $str291$__ = makeString(") ");

	private static final SubLList $list292 = list(makeSymbol("%NC"), makeSymbol("%TRUE"));

	private static final SubLString $$$_else_ = makeString(" else ");

	private static final SubLString $str294$_else_if__ = makeString(" else if (");

	private static final SubLList $list295 = list(makeSymbol("OPERATOR"), makeSymbol("ARGLIST"));

	private static final SubLSymbol $sym296$_PROCLAIM = makeSymbol("%PROCLAIM");

	private static final SubLString $str297$SubLSpecialOperatorDeclarations_p = makeString("SubLSpecialOperatorDeclarations.proclaim(");

	private static final SubLString $str298$__ = makeString(");");

	private static final SubLList $list299 = list(makeSymbol("OPERATOR"), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLList $list300 = list(makeSymbol("OPERATOR"), makeSymbol("NAME"), makeSymbol("FORMAL-ARG-LIST"));

	private static final SubLList $list301 = list(makeSymbol("OPERATOR"), makeSymbol("RESULT"));

	private static final SubLString $str303$final_SubLObject__currRetval___ = makeString("final SubLObject $currRetval = ");

	private static final SubLString $str304$_currRetval = makeString("$currRetval");

	private static final SubLString $str305$return__currRetval_ = makeString("return $currRetval;");

	private static final SubLString $$$return_ = makeString("return ");

	private static final SubLList $list307 = list(makeSymbol("OPERATOR"), makeSymbol("TEST"), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLString $str308$while__ = makeString("while (");

	private static final SubLList $list309 = list(makeSymbol("OPERATOR"), makeSymbol("&REST"), makeSymbol("EXPRESSIONS"));

	private static final SubLSymbol $sym310$_AND = makeSymbol("%AND");

	private static final SubLString $str311$____ = makeString(" && ");

	private static final SubLList $list312 = list(makeSymbol("OPERATOR"), list(makeSymbol("KEY"), makeSymbol("VAL"), makeSymbol("TABLE-VAR"), makeSymbol("ITERATOR-VAR"), makeSymbol("ENTRY-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol $sym313$_CDOHASH = makeSymbol("%CDOHASH");

	private static final SubLSymbol $sym314$_CDOHASH_GET_ENTRY_SET_ITERATOR = makeSymbol("%CDOHASH-GET-ENTRY-SET-ITERATOR");

	private static final SubLSymbol $sym315$_CDOHASH_ITERATOR_HAS_NEXT = makeSymbol("%CDOHASH-ITERATOR-HAS-NEXT");

	private static final SubLSymbol $sym316$_CDOHASH_ITERATOR_NEXT_ENTRY = makeSymbol("%CDOHASH-ITERATOR-NEXT-ENTRY");

	private static final SubLList $list317 = list(makeString("Entry"), makeKeyword("FINAL"));

	private static final SubLSymbol $sym318$_CDOHASH_GET_ENTRY_KEY = makeSymbol("%CDOHASH-GET-ENTRY-KEY");

	private static final SubLSymbol $sym319$_CDOHASH_GET_ENTRY_VALUE = makeSymbol("%CDOHASH-GET-ENTRY-VALUE");

	private static final SubLSymbol $sym320$_CDOHASH_RELEASE_ENTRY_SET_ITERATOR = makeSymbol("%CDOHASH-RELEASE-ENTRY-SET-ITERATOR");

	private static final SubLList $list321 = list(makeSymbol("OPERATOR"));

	private static final SubLSymbol $sym322$_ENTER = makeSymbol("%ENTER");

	private static final SubLString $str323$___ENTER__ = makeString("// ENTER()");

	private static final SubLList $list324 = list(makeSymbol("OPERATOR"), list(makeSymbol("INITIALIZATIONS"), makeSymbol("TEST"), makeSymbol("UPDATES")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol $sym325$_FOR = makeSymbol("%FOR");

	private static final SubLString $str326$for__ = makeString("for (");

	private static final SubLList $list327 = cons(makeSymbol("FIRST-INITIALIZATION"), makeSymbol("REST-INITIALIATIONS"));

	private static final SubLString $str328$__ = makeString("; ");

	private static final SubLList $list329 = cons(makeSymbol("FIRST-UPDATE"), makeSymbol("REST-UPDATES"));

	private static final SubLList $list330 = list(makeSymbol("OPERATOR"), makeSymbol("CONSTANT-ID"), makeSymbol("CONSTANT-FORM"));

	private static final SubLString $str332$_ic_S_ = makeString("$ic~S$");

	private static final SubLString $str333$ = makeString("");

	private static final SubLString $str334$_str = makeString("$str");

	private static final SubLString $str335$_kw = makeString("$kw");

	private static final SubLString $str337$_sym = makeString("$sym");

	private static final SubLString $str338$_int = makeString("$int");

	private static final SubLString $str339$_float = makeString("$float");

	private static final SubLString $str340$_list = makeString("$list");

	private static final SubLString $str341$_char = makeString("$char");

	private static final SubLString $str342$_const = makeString("$const");

	private static final SubLString $str343$_ic = makeString("$ic");

	private static final SubLList $list344 = list(makeSymbol("OPERATOR"), makeSymbol("CONSTANT-ID"), makeSymbol("CONSTANT-FORM"), makeSymbol("LOAD-FORM"));

	private static final SubLString $$$private_static_final_ = makeString("private static final ");

	private static final SubLList $list346 = cons(makeSymbol("OPERATOR"), makeSymbol("ARGS"));

	private static final SubLList $list347 = list(makeSymbol("LIST"), makeSymbol("CONS"), makeSymbol("LIST*"));

	private static final SubLString $$$SubLList = makeString("SubLList");

	private static final SubLList $list349 = list(makeSymbol("ARG"));

	private static final SubLString $$$SubLString = makeString("SubLString");

	private static final SubLString $$$SubLInteger = makeString("SubLInteger");

	private static final SubLString $$$SubLFloat = makeString("SubLFloat");

	private static final SubLString $$$SubLCharacter = makeString("SubLCharacter");

	private static final SubLString $$$SubLPackage = makeString("SubLPackage");

	private static final SubLString $str356$_CONSTANT_ = makeString("_CONSTANT-");

	private static final SubLString $str357$_INITIALIZER = makeString("-INITIALIZER");

	private static final SubLList $list358 = list(makeSymbol("OPERATOR"), makeSymbol("OBJECT"));

	private static final SubLSymbol $sym359$_CSTRING = makeSymbol("%CSTRING");

	private static final SubLSymbol $sym360$_CFIX = makeSymbol("%CFIX");

	private static final SubLSymbol $sym361$_CBIG = makeSymbol("%CBIG");

	private static final SubLSymbol $sym362$_CFLOAT = makeSymbol("%CFLOAT");

	private static final SubLSymbol $sym363$_CCHAR = makeSymbol("%CCHAR");

	private static final SubLSymbol $sym364$_CPACKAGE = makeSymbol("%CPACKAGE");

	private static final SubLSymbol $sym365$_CGUID = makeSymbol("%CGUID");

	private static final SubLString $str366$Time_to_add__LF_support_for__S = makeString("Time to add %LF support for ~S");

	private static final SubLList $list368 = list(makeSymbol("OPERATOR"), makeSymbol("VARIABLE"), makeSymbol("&OPTIONAL"), list(makeSymbol("INITIALIZATION"), NIL, makeSymbol("INITIALIZED?")), makeSymbol("TYPE"), makeSymbol("FINAL?"));

	private static final SubLList $list369 = list(makeSymbol("OPERATOR"), makeSymbol("EXPRESSION"));

	private static final SubLSymbol $sym371$_ARG2 = makeSymbol("%ARG2");

	private static final SubLList $list372 = list(makeSymbol("%RESET-MVAL"));

	private static final SubLSymbol $sym373$_MULTIPLE_VALUE_LIST = makeSymbol("%MULTIPLE-VALUE-LIST");

	private static final SubLSymbol $sym374$_NC = makeSymbol("%NC");

	private static final SubLSymbol $sym375$_TRUE = makeSymbol("%TRUE");

	private static final SubLString $$$true = makeString("true");

	private static final SubLSymbol $sym377$_FALSE = makeSymbol("%FALSE");

	private static final SubLString $$$false = makeString("false");

	private static final SubLSymbol $sym379$_NULL = makeSymbol("%NULL");

	private static final SubLString $$$null = makeString("null");

	private static final SubLSymbol $sym381$_UNPROVIDED = makeSymbol("%UNPROVIDED");

	private static final SubLSymbol $sym382$_EMPTY_ARRAY = makeSymbol("%EMPTY-ARRAY");

	private static final SubLString $str383$EMPTY_SUBL_OBJECT_ARRAY = makeString("EMPTY_SUBL_OBJECT_ARRAY");

	private static final SubLString $str384$Unexpected_native_constant__S = makeString("Unexpected native constant ~S");

	private static final SubLSymbol $sym385$_NOT = makeSymbol("%NOT");

	private static final SubLString $str386$___ = makeString("(!(");

	private static final SubLString $str387$__ = makeString("))");

	private static final SubLSymbol $sym388$_DTB = makeSymbol("%DTB");

	private static final SubLList $list389 = list(makeSymbol("OPERATOR"), makeSymbol("N"), makeSymbol("EXPRESSION"));

	private static final SubLSymbol $sym391$_NTH_VALUE_STEP_2 = makeSymbol("%NTH-VALUE-STEP-2");

	private static final SubLSymbol $sym392$_NTH_VALUE_STEP_1 = makeSymbol("%NTH-VALUE-STEP-1");

	private static final SubLSymbol $sym393$_OR = makeSymbol("%OR");

	private static final SubLList $list394 = list(makeSymbol("%NC"), makeSymbol("%FALSE"));

	private static final SubLString $str395$___ = makeString("|| ");

	private static final SubLList $list396 = list(makeSymbol("OPERATOR"), makeSymbol("FUNCTION"), makeSymbol("REQUIRED-COUNT"), makeSymbol("OPTIONAL-COUNT"), makeSymbol("REST?"));

	private static final SubLSymbol $sym397$_REGISTER_FUNCTION = makeSymbol("%REGISTER-FUNCTION");

	private static final SubLString $$$declareFunction = makeString("declareFunction(");

	private static final SubLString $$$me = makeString("me");

	private static final SubLList $list400 = list(makeSymbol("OPERATOR"), makeSymbol("DEFINER"), makeSymbol("GLOBAL"), makeSymbol("INITIALIZATION"));

	private static final SubLSymbol $sym401$_REGISTER_GLOBAL = makeSymbol("%REGISTER-GLOBAL");

	private static final SubLString $$$defvar = makeString("defvar");

	private static final SubLString $$$defparameter = makeString("defparameter");

	private static final SubLString $$$deflexical = makeString("deflexical");

	private static final SubLString $$$defconstant = makeString("defconstant");

	private static final SubLString $str406$Unexpected_definer__S = makeString("Unexpected definer ~S");

	private static final SubLList $list407 = list(makeSymbol("OPERATOR"), makeSymbol("FUNCTION"));

	private static final SubLSymbol $sym408$_REGISTER_MACRO = makeSymbol("%REGISTER-MACRO");

	private static final SubLString $$$declareMacro = makeString("declareMacro");

	private static final SubLList $list410 = list(makeSymbol("OPERATOR"), makeSymbol("THREAD-VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLList $list411 = list(list(makeSymbol("%CURRENT-THREAD")), makeString("SubLThread"), makeKeyword("FINAL"));

	private static final SubLList $list412 = list(makeSymbol("OPERATOR"), list(makeSymbol("HANDLER"), makeSymbol("CATCH-VAR"), makeSymbol("ERROR-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol $sym413$_WITH_ERROR_HANDLER = makeSymbol("%WITH-ERROR-HANDLER");

	private static final SubLSymbol $error_handler$ = makeSymbol("*ERROR-HANDLER*");

	private static final SubLList $list415 = list(list(makeSymbol("%PC"), NIL));

	private static final SubLList $list416 = list(makeSymbol("OPERATOR"), makeSymbol("ENV-VAR"), makeSymbol("RESULT-VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol $sym417$_WITH_PROCESS_RESOURCE_TRACKING = makeSymbol("%WITH-PROCESS-RESOURCE-TRACKING");

	private static final SubLList $list418 = list(list(makeSymbol("GET-INTERNAL-REAL-TIME")));

	private static final SubLSymbol $sym419$_COMPUTE_WITH_PROCESS_RESOURCE_TRACKING_RESULTS = makeSymbol("%COMPUTE-WITH-PROCESS-RESOURCE-TRACKING-RESULTS");

	private static final SubLList $list420 = list(makeSymbol("OPERATOR"), makeSymbol("PLACE"), makeSymbol("EXPRESSION"));

	private static final SubLSymbol $translate_eq_as_eql$ = makeSymbol("*TRANSLATE-EQ-AS-EQL*");

	private static final SubLList $list422 = list(makeSymbol("OPERATOR"), makeSymbol("EXPRESSION1"), makeSymbol("EXPRESSION2"), makeSymbol("&OPTIONAL"), makeSymbol("FORCE-NATIVE"));

	private static final SubLString $str424$____ = makeString(" == ");

	private static final SubLString $str425$_eql_ = makeString(".eql(");

	private static final SubLString $str426$____ = makeString(" != ");

	private static final SubLString $str427$_ = makeString("!");

	private static final SubLList $list428 = list(makeSymbol("OPERATOR"), makeSymbol("INTERFACE"), makeSymbol("&OPTIONAL"), makeSymbol("SLOT-VALUE-TUPLES"));

	private static final SubLString $str429$_ = makeString("@");

	private static final SubLList $list430 = list(makeSymbol("SLOT"), makeSymbol("VALUE"));

	private static final SubLList $list431 = list(makeSymbol("OPERATOR"), makeSymbol("CONDITION"), makeSymbol("&OPTIONAL"), makeSymbol("ERROR-OBJECT"));

	private static final SubLString $$$assert_ = makeString("assert ");

	private static final SubLList $list433 = list(makeSymbol("OPERATOR"), makeSymbol("SYMBOL"), makeSymbol("EXPRESSION"));

	private static final SubLString $$$bind = makeString("bind");

	private static final SubLList $list435 = list(makeSymbol("OPERATOR"), makeSymbol("TYPE"), makeSymbol("EXPRESSION"));

	private static final SubLString $str436$__ = makeString("((");

	private static final SubLList $list437 = list(makeSymbol("OPERATOR"), makeSymbol("SYMBOL"));

	private static final SubLString $$$currentBinding = makeString("currentBinding");

	private static final SubLList $list439 = list(makeSymbol("OPERATOR"), makeSymbol("OBJECT"), makeSymbol("FIELD"));

	private static final SubLList $list440 = list(makeSymbol("OPERATOR"), makeSymbol("NAME"));

	private static final SubLList $list441 = list(makeSymbol("OPERATOR"), makeSymbol("VARIABLE"), makeSymbol("DEFAULT"));

	private static final SubLSymbol $sym442$_INIT_OPT_ARG = makeSymbol("%INIT-OPT-ARG");

	private static final SubLList $list443 = list(list(makeSymbol("%NC"), makeSymbol("%UNPROVIDED")));

	private static final SubLList $list444 = list(list(list(makeSymbol("%NC"), makeSymbol("%TRUE"))));

	private static final SubLList $list445 = list(makeSymbol("OPERATOR"), makeSymbol("OBJECT"), makeSymbol("CLASS-NAME"));

	private static final SubLSymbol $sym446$_INSTANCEOF = makeSymbol("%INSTANCEOF");

	private static final SubLString $$$_instanceof_ = makeString(" instanceof ");

	private static final SubLList $list448 = list(makeSymbol("OPERATOR"), makeSymbol("GLOBAL"));

	private static final SubLSymbol $sym449$_DYN = makeSymbol("%DYN");

	private static final SubLString $$$getDynamicValue = makeString("getDynamicValue");

	private static final SubLList $list451 = list(makeString("getDynamicValue"));

	private static final SubLSymbol $sym452$_LEX = makeSymbol("%LEX");

	private static final SubLList $list453 = list(makeString("getGlobalValue"));

	private static final SubLList $list454 = list(makeSymbol("OPERATOR"), makeSymbol("GLOBAL"), makeSymbol("VALUE"));

	private static final SubLString $$$setDynamicValue = makeString("setDynamicValue");

	private static final SubLString $$$setGlobalValue = makeString("setGlobalValue");

	private static final SubLList $list457 = list(makeSymbol("OPERATOR"), makeSymbol("OBJECT"), makeSymbol("METHOD"), makeSymbol("&REST"), makeSymbol("ARGS"));

	private static final SubLList $list458 = list(makeSymbol("OPERATOR"), makeSymbol("N"));

	private static final SubLSymbol $sym459$_MVAL = makeSymbol("%MVAL");

	private static final SubLList $list460 = list(makeSymbol("%PC"), ZERO_INTEGER);

	private static final SubLList $list461 = list(makeString("firstMultipleValue"));

	private static final SubLList $list462 = list(makeSymbol("%PC"), ONE_INTEGER);

	private static final SubLList $list463 = list(makeString("secondMultipleValue"));

	private static final SubLList $list464 = list(makeSymbol("%PC"), TWO_INTEGER);

	private static final SubLList $list465 = list(makeString("thirdMultipleValue"));

	private static final SubLList $list466 = list(makeSymbol("%PC"), THREE_INTEGER);

	private static final SubLList $list467 = list(makeString("fourthMultipleValue"));

	private static final SubLList $list468 = list(makeSymbol("%PC"), FOUR_INTEGER);

	private static final SubLList $list469 = list(makeString("fifthMultipleValue"));

	private static final SubLList $list470 = list(makeSymbol("%PC"), FIVE_INTEGER);

	private static final SubLList $list471 = list(makeString("sixthMultipleValue"));

	private static final SubLList $list472 = list(makeSymbol("%PC"), SIX_INTEGER);

	private static final SubLList $list473 = list(makeString("seventhMultipleValue"));

	private static final SubLList $list474 = list(makeSymbol("%PC"), SEVEN_INTEGER);

	private static final SubLList $list475 = list(makeString("eighthMultipleValue"));

	private static final SubLList $list476 = list(makeSymbol("OPERATOR"), makeSymbol("CLASS-NAME"), makeSymbol("&REST"), makeSymbol("ARGS"));

	private static final SubLString $$$new_ = makeString("new ");

	private static final SubLList $list478 = list(makeSymbol("OPERATOR"), makeSymbol("CLASS-NAME"), makeSymbol("&OPTIONAL"), makeSymbol("ELEMENTS"));

	private static final SubLString $str479$____ = makeString("[] {");

	private static final SubLList $list480 = list(makeSymbol("OPERATOR"), makeSymbol("VARIABLE"));

	private static final SubLSymbol $sym481$_NOTE_SUPPLIED = makeSymbol("%NOTE-SUPPLIED");

	private static final SubLSymbol $sym482$_BTD = makeSymbol("%BTD");

	private static final SubLList $list483 = list(makeSymbol("OPERATOR"), makeSymbol("SYMBOL"), makeSymbol("OLD-VALUE"));

	private static final SubLString $$$rebind = makeString("rebind");

	private static final SubLSymbol $sym485$_RESET_MVAL = makeSymbol("%RESET-MVAL");

	private static final SubLList $list486 = list(makeString("resetMultipleValues"));

	private static final SubLSymbol $sym487$_THROW = makeSymbol("%THROW");

	private static final SubLString $$$throw_ = makeString("throw ");

	private static final SubLList $list489 = list(makeSymbol("OPERATOR"), makeSymbol("TRY-FORM"), makeSymbol("CATCH-CLAUSES"), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLString $$$try_ = makeString("try ");

	private static final SubLString $$$_finally_ = makeString(" finally ");

	private static final SubLList $list492 = list(list(makeSymbol("TYPE"), makeSymbol("VARIABLE")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLString $str493$_catch__ = makeString(" catch (");

	private static final SubLList $list494 = list(makeSymbol("TRY-FORM"), makeSymbol("CATCH-CLAUSES"), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLString $str495$Time_to_support_non_null_catch_cl = makeString("Time to support non-null catch-clauses");

	private static final SubLString $str497$___public_static_final_class__A_e = makeString("\n  public static final class ~A extends UnaryFunction {\n    public ~A() { super(extractFunctionNamed(~S)); }\n    @Override public SubLObject processItem(SubLObject ~A) { return ~A; }\n  }");

	private static final SubLString $str500$__new__A__ = makeString("; new ~A()");

	private static final SubLSymbol JAVA_BACKEND_UNARY_FUNCTION_CLASS_NAME = makeSymbol("JAVA-BACKEND-UNARY-FUNCTION-CLASS-NAME");

	private static final SubLString $str502$_UnaryFunction = makeString("$UnaryFunction");

	private static final SubLList $list503 = list(makeSymbol("ARG1"));

	private static final SubLString $str504$___public_static_final_class__A_e = makeString("\n  public static final class ~A extends BinaryFunction {\n    public ~A() { super(extractFunctionNamed(~S)); }\n    @Override public SubLObject processItem(SubLObject ~A, SubLObject ~A) { return ~A; }\n  }");

	private static final SubLString $str506$______new__A__ = makeString(";\n    new ~A()");

	private static final SubLSymbol JAVA_BACKEND_BINARY_FUNCTION_CLASS_NAME = makeSymbol("JAVA-BACKEND-BINARY-FUNCTION-CLASS-NAME");

	private static final SubLString $str508$_BinaryFunction = makeString("$BinaryFunction");

	private static final SubLList $list509 = list(makeSymbol("ARG1"), makeSymbol("ARG2"));

	private static final SubLString $str510$___public_static_final_class__A_e = makeString("\n  public static final class ~A extends ZeroArityFunction {\n    public ~A() { super(extractFunctionNamed(~S)); }\n    @Override public SubLObject processItem() { return ~A; }\n  }");

	private static final SubLString $str511$_______new__A__ = makeString("; \n    new ~A()");

	private static final SubLSymbol JAVA_BACKEND_ZERO_ARITY_FUNCTION_CLASS_NAME = makeSymbol("JAVA-BACKEND-ZERO-ARITY-FUNCTION-CLASS-NAME");

	private static final SubLString $str513$_ZeroArityFunction = makeString("$ZeroArityFunction");

	private static final SubLString $str514$_dev_null = makeString("/dev/null");

	private static final SubLString $$$java = makeString("java");

	private static final SubLString $str516$______preparePercentProgress__A__ = makeString("~%    preparePercentProgress(~A);~%");

	private static final SubLString $str517$______initializeClass___A___ = makeString("~%    initializeClass(\"~A\");");

	private static final SubLString $str518$________finishPercentProgress____ = makeString("~%~%    finishPercentProgress();~%");

	private static final SubLString $$$filelist = makeString("filelist");

	private static final SubLString $$$text = makeString("text");

	private static final SubLString $str521$com_cyc_cycjava_cycl_cycl = makeString("com.cyc.cycjava.cycl.cycl");

	private static final SubLString $str522$_java = makeString(".java");

	private static final SubLString $str523$__package_com_cyc_cycjava_cycl___ = makeString(
			"\n\npackage com.cyc.cycjava.cycl;\n\nimport com.cyc.tool.subl.util.InitializingSubLFile;\nimport com.cyc.tool.subl.util.SubLFile;\nimport com.cyc.tool.subl.util.SubLFiles;\n\npublic class cycl extends InitializingSubLFile {\n  \n  //// Constructors\n  \n  /** Creates a new instance of cycl. */\n  public cycl() {}\n  \n  public static final SubLFile me = new cycl();\n  \n  //// Initializers\n  \n  public void declareFunctions() {\n  }\n  \n  public void initializeVariables() {\n  }\n  \n  public void runTopLevelForms() {\n    try {\n     SubLFiles.initialize(\"eu.cyc.sparql.server.Sparql\");\n     SubLFiles.initialize(\"com.cyc.tool.subl.webserver.ServletContainer\");\n    } catch (Exception e) {\n    }\n");

	private static final SubLString $str524$________ = makeString("\n  }  \n}");

	private static final SubLList $list525 = list(makeSymbol("EXPRESSION1"), makeSymbol("EXPRESSION2"));

	private static final SubLString $str528$import_com_cyc_tool_subl_util____ = makeString(
			"import com.cyc.tool.subl.util.*;\n\npublic class ~A extends AbstractSubLPatcher {\n  private static final long SEQUENCE = ~A;\n  private static final String[] patchedClasses = {\n    ~A\n  };\n\n  public final long getPatchOrdering() { return SEQUENCE; }\n  public final String[] getPatchedClasses() { return patchedClasses; }\n}\n");

	private static final SubLString $$$patcher = makeString("patcher");

	private static final SubLString $str530$_______ = makeString(",~%    ");

	private static final SubLList $list531 = list(makeString("patches"));

	private static final SubLSymbol JAVA_BACKEND_MODULE_FULL_CLASS_NAME = makeSymbol("JAVA-BACKEND-MODULE-FULL-CLASS-NAME");

	private static final SubLList $list533 = cons(makeSymbol("ARITY"), makeSymbol("COUNT"));

	private static final SubLSymbol $sym534$_ = makeSymbol(">");

	static {
	}

	public static SubLObject is_java_backend_logging_activeP() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return makeBoolean($NONE != $java_backend_logging_detail$.getDynamicValue(thread));
	}

	public static SubLObject with_java_backend_logging_level(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list2);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject level = NIL;
		destructuring_bind_must_consp(current, datum, $list2);
		level = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			return list(PROGN, listS(MUST, listS($sym5$MEMBER_, level, $list6), $str7$Invalid_logging_level__A__not_a_m, level, $list6), listS(CLET, list(list($java_backend_logging_detail$, level)), append(body, NIL)));
		}
		cdestructuring_bind_error(datum, $list2);
		return NIL;
	}

	public static SubLObject java_backend_logging_for_current_method(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list10);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject flag_p = NIL;
		SubLObject method = NIL;
		destructuring_bind_must_consp(current, datum, $list10);
		flag_p = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list10);
		method = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			return listS(CLET, list(list($java_backend_logging_for_current_method$, listS(FIF, flag_p, method, $list13))), append(body, NIL));
		}
		cdestructuring_bind_error(datum, $list10);
		return NIL;
	}

	public static SubLObject java_backend_current_method_needs_logging_p() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return list_utilities.sublisp_boolean($java_backend_logging_for_current_method$.getDynamicValue(thread));
	}

	public static SubLObject java_backend_get_current_method_needing_logging() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return $java_backend_logging_for_current_method$.getDynamicValue(thread);
	}

	public static SubLObject java_backend_function_symbol_is_blacklistedP(final SubLObject function_symbol) {
		SubLObject cdolist_list_var = $java_backend_logging_blacklist_patterns$.getGlobalValue();
		SubLObject pattern = NIL;
		pattern = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject current;
			final SubLObject datum = current = pattern;
			SubLObject operator = NIL;
			SubLObject data = NIL;
			destructuring_bind_must_consp(current, datum, $list15);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list15);
			data = current.first();
			current = current.rest();
			if (NIL == current) {
				final SubLObject pcase_var = operator;
				if (pcase_var.eql($ENDS_WITH)) {
					final SubLObject name = symbol_name(function_symbol);
					if (NIL != string_utilities.ends_with(name, data, UNPROVIDED)) {
						return T;
					}
				} else {
					Errors.error($str17$Unimplemented_black_listing_opera, operator);
				}
			} else {
				cdestructuring_bind_error(datum, $list15);
			}
			cdolist_list_var = cdolist_list_var.rest();
			pattern = cdolist_list_var.first();
		}
		return NIL;
	}

	public static SubLObject is_java_backend_method_covered_by_logging_levelP(final SubLObject function_symbol) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if ((NIL != is_java_backend_logging_activeP()) && (!function_symbol.isMacroOperator())) {
			final SubLObject symbol_access = get(function_symbol, FACCESS, UNPROVIDED);
			if ((PUBLIC == symbol_access) && (NIL == java_backend_function_symbol_is_blacklistedP(function_symbol))) {
				if ($PUBLIC == $java_backend_logging_detail$.getDynamicValue(thread)) {
					return T;
				}
				if (NIL != cyc_api_symbol_p(function_symbol)) {
					return T;
				}
				if ($EXTERNAL == $java_backend_logging_detail$.getDynamicValue(thread)) {
					return external_function_p(function_symbol);
				}
				return NIL;
			}
		}
		return NIL;
	}

	public static SubLObject java_backend_write_logger_import(final SubLObject stream) {
		format(stream, $str22$__import_org_slf4j_Logger_);
		format(stream, $str23$__import_org_slf4j_LoggerFactory_);
		return terpri(stream);
	}

	public static SubLObject java_backend_write_logger_class_level_declaration(final SubLObject stream, final SubLObject depth) {
		terpri(stream);
		java_backend_indent(stream, depth);
		format(stream, $str24$final_static_private_Logger_myLog);
		return stream;
	}

	public static SubLObject java_backend_write_method_entry(final SubLObject stream, final SubLObject depth, final SubLObject name, final SubLObject formal_arg_list) {
		terpri(stream);
		java_backend_indent(stream, depth);
		write_string($str25$myLogger_trace__Enter___, stream, UNPROVIDED, UNPROVIDED);
		if (NIL != formal_arg_list) {
			write_string($str26$_, stream, UNPROVIDED, UNPROVIDED);
			SubLObject size = length(formal_arg_list);
			if (NIL != subl_promotions.memberP($sym27$_OPTIONAL, formal_arg_list, UNPROVIDED, UNPROVIDED)) {
				size = subtract(size, ONE_INTEGER);
			}
			SubLObject i;
			for (i = NIL, i = ZERO_INTEGER; i.numL(size); i = add(i, ONE_INTEGER)) {
				write_string($str28$___, stream, UNPROVIDED, UNPROVIDED);
			}
		}
		write_string($str29$___new_Object____, stream, UNPROVIDED, UNPROVIDED);
		write_string(prin1_to_string(symbol_name(name)), stream, UNPROVIDED, UNPROVIDED);
		SubLObject cdolist_list_var = formal_arg_list;
		SubLObject arg = NIL;
		arg = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if ($sym27$_OPTIONAL != arg) {
				write_string($str30$__, stream, UNPROVIDED, UNPROVIDED);
				java_backend_write_form(c_backend.translator_arglist_arg_variable(arg), stream, UNPROVIDED);
			}
			cdolist_list_var = cdolist_list_var.rest();
			arg = cdolist_list_var.first();
		}
		write_string($str31$____, stream, UNPROVIDED, UNPROVIDED);
		return stream;
	}

	public static SubLObject java_backend_write_method_exit(final SubLObject stream, final SubLObject depth, final SubLObject result_var) {
		terpri(stream);
		java_backend_indent(stream, depth);
		write_string($str32$myLogger_trace__Leave__________, stream, UNPROVIDED, UNPROVIDED);
		write_string(prin1_to_string(symbol_name(java_backend_get_current_method_needing_logging())), stream, UNPROVIDED, UNPROVIDED);
		write_string($str30$__, stream, UNPROVIDED, UNPROVIDED);
		write_string(result_var, stream, UNPROVIDED, UNPROVIDED);
		write_string($str33$___, stream, UNPROVIDED, UNPROVIDED);
		return stream;
	}

	public static SubLObject java_backend_possibly_write_logger_import(final SubLObject stream) {
		if (NIL != is_java_backend_logging_activeP()) {
			return java_backend_write_logger_import(stream);
		}
		return stream;
	}

	public static SubLObject java_backend_possibly_write_logger_class_level_declaration(final SubLObject stream, final SubLObject depth) {
		if (NIL != is_java_backend_logging_activeP()) {
			java_backend_write_logger_class_level_declaration(stream, depth);
		}
		return stream;
	}

	public static final SubLObject java_backend_output_file_alt(SubLObject ts_file, SubLObject output_filename, SubLObject finger_print) {
		if (finger_print == UNPROVIDED) {
			finger_print = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			SubLTrampolineFile.checkType(ts_file, TRANS_SUBL_FILE_P);
			SubLTrampolineFile.checkType(output_filename, STRINGP);
			if (NIL != finger_print) {
				SubLTrampolineFile.checkType(finger_print, STRINGP);
			}
			{
				SubLObject result = NIL;
				SubLObject filename_var = output_filename;
				SubLObject stream = NIL;
				try {
					{
						SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
						try {
							stream_macros.$stream_requires_locking$.bind(NIL, thread);
							stream = compatibility.open_text(filename_var, $OUTPUT, NIL);
						} finally {
							stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
						}
					}
					if (!stream.isStream()) {
						Errors.error($str_alt3$Unable_to_open__S, filename_var);
					}
					{
						SubLObject stream_1 = stream;
						print(output_filename, UNPROVIDED);
						result = com.cyc.cycjava.cycl.java_backend.java_backend_output_to_stream(ts_file, stream_1, finger_print);
					}
				} finally {
					{
						SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
						try {
							$is_thread_performing_cleanupP$.bind(T, thread);
							if (stream.isStream()) {
								close(stream, UNPROVIDED);
							}
						} finally {
							$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
						}
					}
				}
				return result;
			}
		}
	}

	public static SubLObject java_backend_output_file(final SubLObject ts_file, final SubLObject output_filename, SubLObject finger_print) {
		if (finger_print == UNPROVIDED) {
			finger_print = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != file_translation.trans_subl_file_p(ts_file) : "! file_translation.trans_subl_file_p(ts_file) " + ("file_translation.trans_subl_file_p(ts_file) " + "CommonSymbols.NIL != file_translation.trans_subl_file_p(ts_file) ") + ts_file;
		assert NIL != stringp(output_filename) : "! stringp(output_filename) " + ("Types.stringp(output_filename) " + "CommonSymbols.NIL != Types.stringp(output_filename) ") + output_filename;
		if (((NIL != finger_print) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(finger_print))) {
			throw new AssertionError(finger_print);
		}
		SubLObject result = NIL;
		file_utilities.ensure_directories_exist(output_filename);
		final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
		final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
		try {
			StreamsLow.$stream_initial_input_buffer_size$.bind($int$1048576, thread);
			StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
			SubLObject stream = NIL;
			try {
				final SubLObject _prev_bind_0_$1 = stream_macros.$stream_requires_locking$.currentBinding(thread);
				try {
					stream_macros.$stream_requires_locking$.bind(NIL, thread);
					stream = compatibility.open_text(output_filename, $OUTPUT);
				} finally {
					stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$1, thread);
				}
				if (!stream.isStream()) {
					Errors.error($str38$Unable_to_open__S, output_filename);
				}
				final SubLObject stream_$2 = stream;
				result = java_backend_output_to_stream(ts_file, stream_$2, finger_print);
			} finally {
				final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					if (stream.isStream()) {
						close(stream, UNPROVIDED);
					}
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
				}
			}
		} finally {
			StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_2, thread);
			StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0, thread);
		}
		return result;
	}

	public static final SubLObject java_backend_output_to_stream_alt(SubLObject ts_file, SubLObject stream, SubLObject finger_print) {
		if (stream == UNPROVIDED) {
			stream = StreamsLow.$standard_output$.getDynamicValue();
		}
		if (finger_print == UNPROVIDED) {
			finger_print = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			SubLTrampolineFile.checkType(ts_file, TRANS_SUBL_FILE_P);
			{
				SubLObject _prev_bind_0 = $read_default_float_format$.currentBinding(thread);
				SubLObject _prev_bind_1 = c_backend.$anonymous_variable_counter$.currentBinding(thread);
				SubLObject _prev_bind_2 = $java_backend_previous_local_variable_scope$.currentBinding(thread);
				SubLObject _prev_bind_3 = $java_backend_current_local_variable_scope$.currentBinding(thread);
				SubLObject _prev_bind_4 = file_translation.$current_ts_file$.currentBinding(thread);
				try {
					$read_default_float_format$.bind(DOUBLE_FLOAT, thread);
					c_backend.$anonymous_variable_counter$.bind(ZERO_INTEGER, thread);
					$java_backend_previous_local_variable_scope$.bind(NIL, thread);
					$java_backend_current_local_variable_scope$.bind(NIL, thread);
					file_translation.$current_ts_file$.bind(ts_file, thread);
					{
						SubLObject state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
						SubLObject local_state = state;
						{
							SubLObject _prev_bind_0_2 = memoization_state.$memoization_state$.currentBinding(thread);
							try {
								memoization_state.$memoization_state$.bind(local_state, thread);
								{
									final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
									try {
										com.cyc.cycjava.cycl.java_backend.java_backend_output_header_section(ts_file, stream);
									} finally {
										{
											SubLObject _prev_bind_0_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
											try {
												$is_thread_performing_cleanupP$.bind(T, thread);
												com.cyc.cycjava.cycl.java_backend.java_backend_output_class(ts_file, stream, ZERO_INTEGER, finger_print);
												if ((NIL != local_state) && (NIL == original_memoization_process)) {
													memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
												}
											} finally {
												$is_thread_performing_cleanupP$.rebind(_prev_bind_0_3, thread);
											}
										}
									}
								}
							} finally {
								memoization_state.$memoization_state$.rebind(_prev_bind_0_2, thread);
							}
						}
					}
				} finally {
					file_translation.$current_ts_file$.rebind(_prev_bind_4, thread);
					$java_backend_current_local_variable_scope$.rebind(_prev_bind_3, thread);
					$java_backend_previous_local_variable_scope$.rebind(_prev_bind_2, thread);
					c_backend.$anonymous_variable_counter$.rebind(_prev_bind_1, thread);
					$read_default_float_format$.rebind(_prev_bind_0, thread);
				}
			}
			return ts_file;
		}
	}

	public static SubLObject java_backend_output_to_stream(final SubLObject ts_file, SubLObject stream, SubLObject finger_print) {
		if (stream == UNPROVIDED) {
			stream = StreamsLow.$standard_output$.getDynamicValue();
		}
		if (finger_print == UNPROVIDED) {
			finger_print = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != file_translation.trans_subl_file_p(ts_file) : "! file_translation.trans_subl_file_p(ts_file) " + ("file_translation.trans_subl_file_p(ts_file) " + "CommonSymbols.NIL != file_translation.trans_subl_file_p(ts_file) ") + ts_file;
		final SubLObject _prev_bind_0 = $read_default_float_format$.currentBinding(thread);
		final SubLObject _prev_bind_2 = c_backend.$anonymous_variable_counter$.currentBinding(thread);
		final SubLObject _prev_bind_3 = $java_backend_previous_local_variable_scope$.currentBinding(thread);
		final SubLObject _prev_bind_4 = $java_backend_current_local_variable_scope$.currentBinding(thread);
		final SubLObject _prev_bind_5 = file_translation.$current_ts_file$.currentBinding(thread);
		try {
			$read_default_float_format$.bind(DOUBLE_FLOAT, thread);
			c_backend.$anonymous_variable_counter$.bind(ZERO_INTEGER, thread);
			$java_backend_previous_local_variable_scope$.bind(NIL, thread);
			$java_backend_current_local_variable_scope$.bind(NIL, thread);
			file_translation.$current_ts_file$.bind(ts_file, thread);
			final SubLObject local_state;
			final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			final SubLObject _prev_bind_0_$4 = memoization_state.$memoization_state$.currentBinding(thread);
			try {
				memoization_state.$memoization_state$.bind(local_state, thread);
				final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
				try {
					java_backend_output_header_section(ts_file, stream);
					java_backend_output_class(ts_file, stream, ZERO_INTEGER, finger_print);
				} finally {
					final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
					try {
						$is_thread_performing_cleanupP$.bind(T, thread);
						final SubLObject _values = getValuesAsVector();
						memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
						restoreValuesFromVector(_values);
					} finally {
						$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
					}
				}
			} finally {
				memoization_state.$memoization_state$.rebind(_prev_bind_0_$4, thread);
			}
		} finally {
			file_translation.$current_ts_file$.rebind(_prev_bind_5, thread);
			$java_backend_current_local_variable_scope$.rebind(_prev_bind_4, thread);
			$java_backend_previous_local_variable_scope$.rebind(_prev_bind_3, thread);
			c_backend.$anonymous_variable_counter$.rebind(_prev_bind_2, thread);
			$read_default_float_format$.rebind(_prev_bind_0, thread);
		}
		return ts_file;
	}

	public static final SubLObject java_backend_output_header_section_alt(SubLObject ts_file, SubLObject stream) {
		com.cyc.cycjava.cycl.java_backend.java_backend_write_preamble(stream);
		com.cyc.cycjava.cycl.java_backend.java_backend_write_package(ts_file, stream);
		com.cyc.cycjava.cycl.java_backend.java_backend_write_imports(ts_file, stream);
		com.cyc.cycjava.cycl.java_backend.java_backend_write_class_comment(ts_file, stream);
		return NIL;
	}

	public static SubLObject java_backend_output_header_section(final SubLObject ts_file, final SubLObject stream) {
		java_backend_write_preamble(stream);
		java_backend_write_package(ts_file, stream);
		java_backend_write_imports(ts_file, stream);
		java_backend_write_class_comment(ts_file, stream);
		return NIL;
	}

	public static final SubLObject java_backend_write_preamble_alt(SubLObject stream) {
		format(stream, $str_alt6$____);
		format(stream, $str_alt7$_____A__, c_backend.translation_copyright_string());
		format(stream, $str_alt8$___);
		return NIL;
	}

	public static SubLObject java_backend_write_preamble(final SubLObject stream) {
		format(stream, $str40$____);
		format(stream, $str41$_____A__, c_backend.translation_copyright_string());
		format(stream, $str42$___);
		return NIL;
	}

	public static final SubLObject java_backend_write_package_alt(SubLObject ts_file, SubLObject stream) {
		{
			SubLObject module = file_translation.ts_file_module_name(ts_file);
			SubLObject v_package = com.cyc.cycjava.cycl.java_backend.java_backend_compute_module_package(module);
			format(stream, $str_alt9$____package__A_, v_package);
			return NIL;
		}
	}

	public static SubLObject java_backend_write_package(final SubLObject ts_file, final SubLObject stream) {
		final SubLObject module = file_translation.ts_file_module_name(ts_file);
		final SubLObject v_package = java_backend_compute_module_package(module);
		format(stream, $str43$____package__A_, v_package);
		return NIL;
	}

	public static final SubLObject java_backend_compute_module_package_alt(SubLObject module) {
		{
			SubLObject java_package_prefix = com.cyc.cycjava.cycl.java_backend.java_backend_compute_package_prefix();
			SubLObject java_package_postfix = com.cyc.cycjava.cycl.java_backend.java_backend_compute_package_postfix(module);
			return cconcatenate(format_nil.format_nil_a_no_copy(java_package_prefix), format_nil.format_nil_a_no_copy(java_package_postfix));
		}
	}

	public static SubLObject java_backend_compute_module_package(final SubLObject module) {
		final SubLObject java_package_prefix = java_backend_compute_package_prefix();
		final SubLObject java_package_postfix = java_backend_compute_package_postfix(module);
		return cconcatenate(format_nil.format_nil_a_no_copy(java_package_prefix), format_nil.format_nil_a_no_copy(java_package_postfix));
	}

	public static final SubLObject java_backend_compute_package_prefix_alt() {
		{
			SubLObject system = com.cyc.cycjava.cycl.java_backend.current_system_translation_system();
			if (system.equal($$$SUBLISP)) {
				return $str_alt11$com_cyc_tool_subl_jrtl_translated;
			} else {
				if ($$$CYCL.equal(system)) {
					return $str_alt13$com_cyc_cycjava;
				} else {
					return Errors.error($str_alt14$time_to_implement_multiple_system);
				}
			}
		}
	}

	public static SubLObject java_backend_compute_package_prefix() {
		final SubLObject system = current_system_translation_system();
		if (system.equal($$$SUBLISP)) {
			return $str45$com_cyc_tool_subl_jrtl_translated;
		}
		if ($$$CYCL.equal(system)) {
			return $str47$com_cyc_cycjava;
		}
		return Errors.error($str48$time_to_implement_multiple_system);
	}

	public static final SubLObject java_backend_compute_package_postfix_alt(SubLObject module) {
		{
			SubLObject subdirs = com.cyc.cycjava.cycl.java_backend.current_system_translation_module_subdirs(module);
			SubLObject postfix_strings = NIL;
			SubLObject cdolist_list_var = subdirs;
			SubLObject subdir = NIL;
			for (subdir = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), subdir = cdolist_list_var.first()) {
				{
					SubLObject package_string = com.cyc.cycjava.cycl.java_backend.java_backend_package_name_for_subdir(subdir);
					postfix_strings = cons($str_alt15$_, postfix_strings);
					postfix_strings = cons(package_string, postfix_strings);
				}
			}
			return apply(symbol_function(CCONCATENATE), nreverse(postfix_strings));
		}
	}

	public static SubLObject java_backend_compute_package_postfix(final SubLObject module) {
		final SubLObject subdirs = current_system_translation_module_subdirs(module);
		SubLObject postfix_strings = NIL;
		SubLObject cdolist_list_var = subdirs;
		SubLObject subdir = NIL;
		subdir = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			final SubLObject package_string = java_backend_package_name_for_subdir(subdir);
			postfix_strings = cons($str49$_, postfix_strings);
			postfix_strings = cons(package_string, postfix_strings);
			cdolist_list_var = cdolist_list_var.rest();
			subdir = cdolist_list_var.first();
		}
		return apply(symbol_function(CCONCATENATE), nreverse(postfix_strings));
	}

	public static final SubLObject java_backend_package_name_for_subdir_alt(SubLObject subdir) {
		{
			SubLObject package_name = com.cyc.cycjava.cycl.java_backend.java_backend_canonicalize_identifier_name(subdir);
			if (NIL != java_name_translation.java_backend_reserved_word_p(package_name)) {
				package_name = cconcatenate($str_alt17$package_, format_nil.format_nil_a_no_copy(package_name));
			}
			return package_name;
		}
	}

	public static SubLObject java_backend_package_name_for_subdir(final SubLObject subdir) {
		SubLObject package_name = java_backend_canonicalize_identifier_name(subdir);
		if (NIL != java_name_translation.java_backend_reserved_word_p(package_name)) {
			package_name = cconcatenate($str51$package_, format_nil.format_nil_a_no_copy(package_name));
		}
		return package_name;
	}

	public static final SubLObject java_backend_canonicalize_identifier_name_alt(SubLObject name) {
		return nsubstitute(CHAR_underbar, CHAR_hyphen, Strings.string_downcase(name, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject java_backend_canonicalize_identifier_name(final SubLObject name) {
		return nsubstitute(CHAR_underbar, CHAR_hyphen, Strings.string_downcase(name, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}

	public static final SubLObject java_backend_uncanonicalize_identifier_name_alt(SubLObject name) {
		return nsubstitute(CHAR_hyphen, CHAR_underbar, Strings.string_upcase(name, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject java_backend_uncanonicalize_identifier_name(final SubLObject name) {
		return nsubstitute(CHAR_hyphen, CHAR_underbar, Strings.string_upcase(name, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}

	public static final SubLObject current_system_translation_module_subdirs_alt(SubLObject module) {
		SubLTrampolineFile.checkType(module, STRINGP);
		{
			SubLObject system_prefix = com.cyc.cycjava.cycl.java_backend.current_system_translation_system_subdir_prefix();
			SubLObject strings = string_utilities.split_string(system_translation.sys_tran_module_output_filename(system_translation.current_system_translation(), module), $list_alt18);
			SubLObject position = position(system_prefix, strings, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
			SubLObject relative_strings = nthcdr(position, strings);
			SubLObject subdirs = butlast(relative_strings, ONE_INTEGER);
			return subdirs;
		}
	}

	public static SubLObject current_system_translation_module_subdirs(final SubLObject module) {
		assert NIL != stringp(module) : "! stringp(module) " + ("Types.stringp(module) " + "CommonSymbols.NIL != Types.stringp(module) ") + module;
		final SubLObject system_prefix = current_system_translation_system_subdir_prefix();
		final SubLObject strings = string_utilities.split_string(system_translation.sys_tran_module_output_filename(system_translation.current_system_translation(), module), $list52);
		final SubLObject position = position(system_prefix, strings, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
		final SubLObject relative_strings = nthcdr(position, strings);
		final SubLObject subdirs = butlast(relative_strings, ONE_INTEGER);
		return subdirs;
	}

	public static final SubLObject current_system_translation_system_subdir_prefix_alt() {
		return com.cyc.cycjava.cycl.java_backend.java_backend_canonicalize_identifier_name(com.cyc.cycjava.cycl.java_backend.current_system_translation_system());
	}

	public static SubLObject current_system_translation_system_subdir_prefix() {
		return java_backend_canonicalize_identifier_name(current_system_translation_system());
	}

	public static final SubLObject current_system_translation_system_alt() {
		{
			SubLObject sys_tran = system_translation.current_system_translation();
			if (NIL != sys_tran) {
				return system_translation.sys_tran_system(sys_tran);
			}
		}
		return NIL;
	}

	public static SubLObject current_system_translation_system() {
		final SubLObject sys_tran = system_translation.current_system_translation();
		if (NIL != sys_tran) {
			return system_translation.sys_tran_system(sys_tran);
		}
		return NIL;
	}

	public static final SubLObject java_backend_write_imports_alt(SubLObject ts_file, SubLObject stream) {
		terpri(stream);
		format(stream, $str_alt19$__import_java_util_Iterator_);
		format(stream, $str_alt20$__import_java_util_Map_Entry_);
		format(stream, $str_alt21$__import_java_util_ArrayList_);
		format(stream, $str_alt22$__import_com_cyc_tool_subl_jrtl_n);
		format(stream, $str_alt23$__import_com_cyc_tool_subl_jrtl_n);
		format(stream, $str_alt24$__import_com_cyc_tool_subl_jrtl_n);
		format(stream, $str_alt25$__import_com_cyc_tool_subl_jrtl_n);
		format(stream, $str_alt26$__import_com_cyc_tool_subl_jrtl_t);
		format(stream, $str_alt27$__import_com_cyc_tool_subl_util__);
		{
			SubLObject cdolist_list_var = $list_alt29;
			SubLObject method_name = NIL;
			for (method_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), method_name = cdolist_list_var.first()) {
				format(stream, $str_alt28$__import_static_com_cyc_tool_subl, method_name);
			}
		}
		{
			SubLObject cdolist_list_var = $list_alt31;
			SubLObject method_name = NIL;
			for (method_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), method_name = cdolist_list_var.first()) {
				format(stream, $str_alt30$__import_static_com_cyc_tool_subl, method_name);
			}
		}
		{
			SubLObject cdolist_list_var = $list_alt33;
			SubLObject method_name = NIL;
			for (method_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), method_name = cdolist_list_var.first()) {
				format(stream, $str_alt32$__import_static_com_cyc_tool_subl, method_name);
			}
		}
		if (!$$$SUBLISP.equal(com.cyc.cycjava.cycl.java_backend.current_system_translation_system())) {
			{
				SubLObject module = file_translation.ts_file_module_name(ts_file);
				SubLObject accessed_modules = xref_database.xref_modules_accessed_anywhere_by_module(module);
				SubLObject item_var = $str_alt34$CONSTANT_HANDLES;
				if (NIL == member(item_var, accessed_modules, symbol_function(EQUAL), symbol_function(IDENTITY))) {
					accessed_modules = cons(item_var, accessed_modules);
				}
				if (NIL != accessed_modules) {
					accessed_modules = xref_database.xref_sort_referenced_modules(accessed_modules);
					format(stream, $str_alt35$____);
					{
						SubLObject cdolist_list_var = accessed_modules;
						SubLObject accessed_module = NIL;
						for (accessed_module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), accessed_module = cdolist_list_var.first()) {
							if (!accessed_module.equal(module)) {
								{
									SubLObject full_classname = com.cyc.cycjava.cycl.java_backend.java_backend_module_full_class_name(accessed_module);
									format(stream, $str_alt36$__import__A_, full_classname);
								}
							}
						}
					}
				}
			}
		}
		return NIL;
	}

	public static SubLObject java_backend_write_imports(final SubLObject ts_file, final SubLObject stream) {
		terpri(stream);
		format(stream, $str53$__import_java_util_Iterator_);
		format(stream, $str54$__import_java_util_Map_Entry_);
		format(stream, $str55$__import_java_util_ArrayList_);
		java_backend_possibly_write_logger_import(stream);
		format(stream, $str56$__import_com_cyc_tool_subl_jrtl_n);
		format(stream, $str57$__import_com_cyc_tool_subl_jrtl_n);
		format(stream, $str58$__import_com_cyc_tool_subl_jrtl_n);
		format(stream, $str59$__import_com_cyc_tool_subl_jrtl_n);
		format(stream, $str60$__import_com_cyc_tool_subl_jrtl_t);
		format(stream, $str61$__import_com_cyc_tool_subl_util__);
		SubLObject cdolist_list_var = $list63;
		SubLObject method_name = NIL;
		method_name = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			format(stream, $str62$__import_static_com_cyc_tool_subl, method_name);
			cdolist_list_var = cdolist_list_var.rest();
			method_name = cdolist_list_var.first();
		}
		cdolist_list_var = $list65;
		method_name = NIL;
		method_name = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			format(stream, $str64$__import_static_com_cyc_tool_subl, method_name);
			cdolist_list_var = cdolist_list_var.rest();
			method_name = cdolist_list_var.first();
		}
		cdolist_list_var = $list67;
		method_name = NIL;
		method_name = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			format(stream, $str66$__import_static_com_cyc_tool_subl, method_name);
			cdolist_list_var = cdolist_list_var.rest();
			method_name = cdolist_list_var.first();
		}
		if (!$$$SUBLISP.equal(current_system_translation_system())) {
			final SubLObject module = file_translation.ts_file_module_name(ts_file);
			SubLObject accessed_modules = xref_database.xref_modules_accessed_anywhere_by_module(module);
			final SubLObject item_var = $str68$CONSTANT_HANDLES;
			if (NIL == member(item_var, accessed_modules, symbol_function(EQUAL), symbol_function(IDENTITY))) {
				accessed_modules = cons(item_var, accessed_modules);
			}
			if (NIL != accessed_modules) {
				accessed_modules = xref_database.xref_sort_referenced_modules(accessed_modules);
				format(stream, $str69$____);
				SubLObject cdolist_list_var2 = accessed_modules;
				SubLObject accessed_module = NIL;
				accessed_module = cdolist_list_var2.first();
				while (NIL != cdolist_list_var2) {
					if (!accessed_module.equal(module)) {
						final SubLObject full_classname = java_backend_module_full_class_name(accessed_module);
						format(stream, $str70$__import__A_, full_classname);
					}
					cdolist_list_var2 = cdolist_list_var2.rest();
					accessed_module = cdolist_list_var2.first();
				}
			}
		}
		return NIL;
	}

	public static final SubLObject java_backend_module_full_class_name_alt(SubLObject module) {
		{
			SubLObject v_package = com.cyc.cycjava.cycl.java_backend.java_backend_compute_module_package(module);
			SubLObject class_name = com.cyc.cycjava.cycl.java_backend.java_backend_module_class_name(module);
			return cconcatenate(format_nil.format_nil_a_no_copy(v_package), new SubLObject[] { $str_alt15$_, format_nil.format_nil_a_no_copy(class_name) });
		}
	}

	public static SubLObject java_backend_module_full_class_name(final SubLObject module) {
		final SubLObject v_package = java_backend_compute_module_package(module);
		final SubLObject class_name = java_backend_module_class_name(module);
		return cconcatenate(format_nil.format_nil_a_no_copy(v_package), new SubLObject[] { $str49$_, format_nil.format_nil_a_no_copy(class_name) });
	}

	public static final SubLObject java_backend_write_class_comment_alt(SubLObject ts_file, SubLObject stream) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			terpri(stream);
			terpri(stream);
			format(stream, $str_alt37$_____);
			format(stream, $str_alt7$_____A__, c_backend.translation_copyright_string());
			if (NIL != list_utilities.member_eqP(system_translation.current_system_translation_security_level(), $list_alt38)) {
				{
					SubLObject module_name = file_translation.ts_file_module_name(ts_file);
					format(stream, $str_alt39$____module________A__, module_name);
				}
			}
			if (!$$$SUBLISP.equal(com.cyc.cycjava.cycl.java_backend.current_system_translation_system())) {
				if (NIL != list_utilities.member_eqP(system_translation.current_system_translation_security_level(), $list_alt38)) {
					{
						SubLObject input_filename = file_translation.ts_file_filename(ts_file);
						format(stream, $str_alt40$____source_file___A__, input_filename);
					}
				}
				thread.resetMultipleValues();
				{
					SubLObject second = get_decoded_time();
					SubLObject minute = thread.secondMultipleValue();
					SubLObject hour = thread.thirdMultipleValue();
					SubLObject date = thread.fourthMultipleValue();
					SubLObject month = thread.fifthMultipleValue();
					SubLObject year = thread.sixthMultipleValue();
					thread.resetMultipleValues();
					format(stream, $str_alt41$____created_______4__0D__2__0D__2, new SubLObject[] { year, month, date, hour, minute, second });
				}
			}
			format(stream, $str_alt8$___);
			return NIL;
		}
	}

	public static SubLObject java_backend_write_class_comment(final SubLObject ts_file, final SubLObject stream) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		terpri(stream);
		terpri(stream);
		format(stream, $str72$_____);
		format(stream, $str41$_____A__, c_backend.translation_copyright_string());
		if (NIL != list_utilities.member_eqP(system_translation.current_system_translation_security_level(), $list73)) {
			final SubLObject module_name = file_translation.ts_file_module_name(ts_file);
			format(stream, $str74$____module________A__, module_name);
		}
		if (!$$$SUBLISP.equal(current_system_translation_system())) {
			if (NIL != list_utilities.member_eqP(system_translation.current_system_translation_security_level(), $list73)) {
				final SubLObject input_filename = file_translation.ts_file_filename(ts_file);
				format(stream, $str75$____source_file___A__, input_filename);
			}
			if ((NIL == $java_backend_eliminate_uninteresting_variance$.getGlobalValue()) && (!$HIGH.equal(system_translation.current_system_translation_security_level()))) {
				thread.resetMultipleValues();
				final SubLObject second = get_decoded_time();
				final SubLObject minute = thread.secondMultipleValue();
				final SubLObject hour = thread.thirdMultipleValue();
				final SubLObject date = thread.fourthMultipleValue();
				final SubLObject month = thread.fifthMultipleValue();
				final SubLObject year = thread.sixthMultipleValue();
				thread.resetMultipleValues();
				format(stream, $str77$____created_______4__0D__2__0D__2, new SubLObject[] { year, month, date, hour, minute, second });
			}
		}
		format(stream, $str42$___);
		return NIL;
	}

	public static final SubLObject java_backend_current_class_alt() {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			return $java_backend_current_class$.getDynamicValue(thread);
		}
	}

	public static SubLObject java_backend_current_class() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return $java_backend_current_class$.getDynamicValue(thread);
	}

	public static final SubLObject java_backend_output_class_alt(SubLObject ts_file, SubLObject stream, SubLObject depth, SubLObject finger_print) {
		if (finger_print == UNPROVIDED) {
			finger_print = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject module = file_translation.ts_file_module_name(ts_file);
				SubLObject class_name = com.cyc.cycjava.cycl.java_backend.java_backend_module_class_name(module);
				SubLObject full_class_name = com.cyc.cycjava.cycl.java_backend.java_backend_module_full_class_name(module);
				terpri(stream);
				write_string($str_alt42$public_final_class_, stream, UNPROVIDED, UNPROVIDED);
				write_string(class_name, stream, UNPROVIDED, UNPROVIDED);
				write_string($str_alt43$_extends_SubLTranslatedFile_, stream, UNPROVIDED, UNPROVIDED);
				write_string($str_alt44$_, stream, UNPROVIDED, UNPROVIDED);
				{
					SubLObject _prev_bind_0 = $java_backend_current_class$.currentBinding(thread);
					try {
						$java_backend_current_class$.bind(class_name, thread);
						com.cyc.cycjava.cycl.java_backend.java_backend_output_constructor_section(class_name, full_class_name, stream, number_utilities.f_1X(depth), finger_print);
						com.cyc.cycjava.cycl.java_backend.java_backend_output_definitions(ts_file, stream, number_utilities.f_1X(depth));
						com.cyc.cycjava.cycl.java_backend.java_backend_output_initilizers(ts_file, stream, number_utilities.f_1X(depth));
						terpri(stream);
						terpri(stream);
					} finally {
						$java_backend_current_class$.rebind(_prev_bind_0, thread);
					}
				}
				write_string($str_alt45$_, stream, UNPROVIDED, UNPROVIDED);
				terpri(stream);
			}
			return ts_file;
		}
	}

	public static SubLObject java_backend_output_class(final SubLObject ts_file, final SubLObject stream, final SubLObject depth, SubLObject finger_print) {
		if (finger_print == UNPROVIDED) {
			finger_print = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject module = file_translation.ts_file_module_name(ts_file);
		final SubLObject class_name = java_backend_module_class_name(module);
		final SubLObject full_class_name = java_backend_module_full_class_name(module);
		terpri(stream);
		write_string($$$public_final_class_, stream, UNPROVIDED, UNPROVIDED);
		write_string(class_name, stream, UNPROVIDED, UNPROVIDED);
		write_string($$$_extends_SubLTranslatedFile_, stream, UNPROVIDED, UNPROVIDED);
		write_string($str80$_, stream, UNPROVIDED, UNPROVIDED);
		final SubLObject _prev_bind_0 = $java_backend_current_class$.currentBinding(thread);
		try {
			$java_backend_current_class$.bind(class_name, thread);
			java_backend_output_constructor_section(class_name, full_class_name, stream, number_utilities.f_1X(depth), finger_print);
			java_backend_output_definitions(ts_file, stream, number_utilities.f_1X(depth));
			java_backend_output_initilizers(ts_file, stream, number_utilities.f_1X(depth));
			terpri(stream);
			terpri(stream);
		} finally {
			$java_backend_current_class$.rebind(_prev_bind_0, thread);
		}
		write_string($str81$_, stream, UNPROVIDED, UNPROVIDED);
		terpri(stream);
		return ts_file;
	}

	public static final SubLObject java_backend_module_class_name_internal_alt(SubLObject module) {
		if (NIL != list_utilities.member_eqP(system_translation.current_system_translation_security_level(), $list_alt47)) {
			{
				SubLObject sys_tran = system_translation.current_system_translation();
				SubLObject secure_module_id = system_translation.sys_tran_secure_module_id(sys_tran, module);
				return format(NIL, $str_alt48$module_4__0D, secure_module_id);
			}
		}
		return com.cyc.cycjava.cycl.java_backend.java_backend_class_name_from_string(module);
	}

	public static SubLObject java_backend_module_class_name_internal(final SubLObject module) {
		if (NIL != list_utilities.member_eqP(system_translation.current_system_translation_security_level(), $list83)) {
			final SubLObject sys_tran = system_translation.current_system_translation();
			final SubLObject secure_module_id = system_translation.sys_tran_secure_module_id(sys_tran, module);
			return format(NIL, $str84$module_4__0D, secure_module_id);
		}
		return java_backend_class_name_from_string(module);
	}

	public static final SubLObject java_backend_module_class_name_alt(SubLObject module) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return com.cyc.cycjava.cycl.java_backend.java_backend_module_class_name_internal(module);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, JAVA_BACKEND_MODULE_CLASS_NAME, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), JAVA_BACKEND_MODULE_CLASS_NAME, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, JAVA_BACKEND_MODULE_CLASS_NAME, caching_state);
				}
				{
					SubLObject results = memoization_state.caching_state_lookup(caching_state, module, $kw49$_MEMOIZED_ITEM_NOT_FOUND_);
					if (results == $kw49$_MEMOIZED_ITEM_NOT_FOUND_) {
						results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.java_backend.java_backend_module_class_name_internal(module)));
						memoization_state.caching_state_put(caching_state, module, results, UNPROVIDED);
					}
					return memoization_state.caching_results(results);
				}
			}
		}
	}

	public static SubLObject java_backend_module_class_name(final SubLObject module) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return java_backend_module_class_name_internal(module);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, JAVA_BACKEND_MODULE_CLASS_NAME, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), JAVA_BACKEND_MODULE_CLASS_NAME, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, JAVA_BACKEND_MODULE_CLASS_NAME, caching_state);
		}
		SubLObject results = memoization_state.caching_state_lookup(caching_state, module, memoization_state.$memoized_item_not_found$.getGlobalValue());
		if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			results = arg2(thread.resetMultipleValues(), multiple_value_list(java_backend_module_class_name_internal(module)));
			memoization_state.caching_state_put(caching_state, module, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	}

	public static final SubLObject java_backend_system_class_name_alt(SubLObject system) {
		return com.cyc.cycjava.cycl.java_backend.java_backend_class_name_from_string(system);
	}

	public static SubLObject java_backend_system_class_name(final SubLObject system) {
		return java_backend_class_name_from_string(system);
	}

	public static final SubLObject java_backend_class_name_from_string_alt(SubLObject string) {
		return nsubstitute(CHAR_underbar, CHAR_hyphen, Strings.string_downcase(string, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject java_backend_class_name_from_string(final SubLObject string) {
		return nsubstitute(CHAR_underbar, CHAR_hyphen, Strings.string_downcase(string, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}

	public static final SubLObject java_backend_output_constructor_section_alt(SubLObject class_name, SubLObject full_class_name, SubLObject stream, SubLObject depth, SubLObject finger_print) {
		if (finger_print == UNPROVIDED) {
			finger_print = NIL;
		}
		terpri(stream);
		terpri(stream);
		com.cyc.cycjava.cycl.java_backend.java_backend_indent(stream, depth);
		write_string($str_alt50$_____Constructor, stream, UNPROVIDED, UNPROVIDED);
		terpri(stream);
		terpri(stream);
		com.cyc.cycjava.cycl.java_backend.java_backend_indent(stream, depth);
		format(stream, $str_alt51$private__A_____, class_name);
		terpri(stream);
		com.cyc.cycjava.cycl.java_backend.java_backend_indent(stream, depth);
		format(stream, $str_alt52$public_static_final_SubLFile_me__, class_name);
		terpri(stream);
		com.cyc.cycjava.cycl.java_backend.java_backend_indent(stream, depth);
		format(stream, $str_alt53$public_static_final_String_myName, full_class_name);
		if (NIL != finger_print) {
			terpri(stream);
			com.cyc.cycjava.cycl.java_backend.java_backend_indent(stream, depth);
			format(stream, $str_alt54$public_static_final_String_myFing, finger_print);
		}
		return NIL;
	}

	public static SubLObject java_backend_output_constructor_section(final SubLObject class_name, final SubLObject full_class_name, final SubLObject stream, final SubLObject depth, SubLObject finger_print) {
		if (finger_print == UNPROVIDED) {
			finger_print = NIL;
		}
		terpri(stream);
		terpri(stream);
		java_backend_indent(stream, depth);
		write_string($str85$_____Constructor, stream, UNPROVIDED, UNPROVIDED);
		terpri(stream);
		terpri(stream);
		java_backend_indent(stream, depth);
		format(stream, $str86$private__A_____, class_name);
		terpri(stream);
		java_backend_indent(stream, depth);
		format(stream, $str87$public_static_final_SubLFile_me__, class_name);
		terpri(stream);
		java_backend_indent(stream, depth);
		format(stream, $str88$public_static_final_String_myName, full_class_name);
		java_backend_possibly_write_logger_class_level_declaration(stream, depth);
		if (NIL != finger_print) {
			terpri(stream);
			java_backend_indent(stream, depth);
			format(stream, $str89$public_static_final_String_myFing, finger_print);
		}
		return NIL;
	}

	public static final SubLObject java_backend_gather_initializer_methods_alt(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject body = current;
			return listS(CLET, $list_alt56, append(body, NIL));
		}
	}

	public static SubLObject java_backend_gather_initializer_methods(final SubLObject macroform, final SubLObject environment) {
		final SubLObject datum = macroform.rest();
		final SubLObject body;
		final SubLObject current = body = datum;
		return listS(CLET, $list90, append(body, NIL));
	}

	public static final SubLObject java_backend_note_initializer_method_alt(SubLObject initializer_method) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			$java_backend_initializer_methods$.setDynamicValue(cons(initializer_method, $java_backend_initializer_methods$.getDynamicValue(thread)), thread);
			return initializer_method;
		}
	}

	public static SubLObject java_backend_note_initializer_method(final SubLObject initializer_method) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		$java_backend_initializer_methods$.setDynamicValue(cons(initializer_method, $java_backend_initializer_methods$.getDynamicValue(thread)), thread);
		return initializer_method;
	}

	public static final SubLObject java_backend_initializer_method_p_alt(SubLObject method) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			return subl_promotions.memberP(method, $java_backend_initializer_methods$.getDynamicValue(thread), symbol_function(EQ), symbol_function(SECOND));
		}
	}

	public static SubLObject java_backend_initializer_method_p(final SubLObject method) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return subl_promotions.memberP(method, $java_backend_initializer_methods$.getDynamicValue(thread), symbol_function(EQ), symbol_function(SECOND));
	}

	public static final SubLObject java_backend_initializer_methods_alt() {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			return reverse($java_backend_initializer_methods$.getDynamicValue(thread));
		}
	}

	public static SubLObject java_backend_initializer_methods() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return reverse($java_backend_initializer_methods$.getDynamicValue(thread));
	}

	public static final SubLObject java_backend_output_definitions_alt(SubLObject ts_file, SubLObject stream, SubLObject depth) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject raw_definitions = file_translation.ts_file_definitions(ts_file);
				thread.resetMultipleValues();
				{
					SubLObject definitions = com.cyc.cycjava.cycl.java_backend.java_backend_gather_internal_constant_definitions(raw_definitions);
					SubLObject internal_constant_definitions = thread.secondMultipleValue();
					thread.resetMultipleValues();
					terpri(stream);
					terpri(stream);
					com.cyc.cycjava.cycl.java_backend.java_backend_indent(stream, depth);
					write_string($str_alt58$_____Definitions, stream, UNPROVIDED, UNPROVIDED);
					{
						SubLObject cdolist_list_var = definitions;
						SubLObject definition = NIL;
						for (definition = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), definition = cdolist_list_var.first()) {
							terpri(stream);
							com.cyc.cycjava.cycl.java_backend.java_backend_write_statement(definition, stream, depth);
						}
					}
					if (NIL != internal_constant_definitions) {
						terpri(stream);
						terpri(stream);
						com.cyc.cycjava.cycl.java_backend.java_backend_indent(stream, depth);
						write_string($str_alt59$_____Internal_Constants, stream, UNPROVIDED, UNPROVIDED);
						{
							SubLObject _prev_bind_0 = $java_backend_initializer_methods$.currentBinding(thread);
							try {
								$java_backend_initializer_methods$.bind(NIL, thread);
								terpri(stream);
								{
									SubLObject cdolist_list_var = internal_constant_definitions;
									SubLObject internal_constant_definition = NIL;
									for (internal_constant_definition = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), internal_constant_definition = cdolist_list_var.first()) {
										com.cyc.cycjava.cycl.java_backend.java_backend_write_statement(internal_constant_definition, stream, depth);
									}
								}
								{
									SubLObject additional_methods = com.cyc.cycjava.cycl.java_backend.java_backend_initializer_methods();
									if (NIL != additional_methods) {
										terpri(stream);
										terpri(stream);
										com.cyc.cycjava.cycl.java_backend.java_backend_indent(stream, depth);
										write_string($str_alt60$_____Internal_Constant_Initialize, stream, UNPROVIDED, UNPROVIDED);
										{
											SubLObject cdolist_list_var = additional_methods;
											SubLObject additional_method = NIL;
											for (additional_method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), additional_method = cdolist_list_var.first()) {
												terpri(stream);
												com.cyc.cycjava.cycl.java_backend.java_backend_write_statement(additional_method, stream, depth);
											}
										}
									}
								}
							} finally {
								$java_backend_initializer_methods$.rebind(_prev_bind_0, thread);
							}
						}
					}
				}
			}
			return NIL;
		}
	}

	public static SubLObject java_backend_output_definitions(final SubLObject ts_file, final SubLObject stream, final SubLObject depth) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject raw_definitions = file_translation.ts_file_definitions(ts_file);
		thread.resetMultipleValues();
		final SubLObject definitions = java_backend_gather_internal_constant_definitions(raw_definitions);
		final SubLObject internal_constant_definitions = thread.secondMultipleValue();
		thread.resetMultipleValues();
		terpri(stream);
		terpri(stream);
		java_backend_indent(stream, depth);
		write_string($str92$_____Definitions, stream, UNPROVIDED, UNPROVIDED);
		SubLObject cdolist_list_var = definitions;
		SubLObject definition = NIL;
		definition = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			terpri(stream);
			java_backend_write_statement(definition, stream, depth);
			cdolist_list_var = cdolist_list_var.rest();
			definition = cdolist_list_var.first();
		}
		if (NIL != internal_constant_definitions) {
			final SubLObject _prev_bind_0 = $java_backend_new_array_items_on_separate_linesP$.currentBinding(thread);
			try {
				$java_backend_new_array_items_on_separate_linesP$.bind(T, thread);
				terpri(stream);
				terpri(stream);
				java_backend_indent(stream, depth);
				write_string($str93$_____Internal_Constants, stream, UNPROVIDED, UNPROVIDED);
				final SubLObject _prev_bind_0_$6 = $java_backend_initializer_methods$.currentBinding(thread);
				try {
					$java_backend_initializer_methods$.bind(NIL, thread);
					terpri(stream);
					SubLObject cdolist_list_var2 = internal_constant_definitions;
					SubLObject internal_constant_definition = NIL;
					internal_constant_definition = cdolist_list_var2.first();
					while (NIL != cdolist_list_var2) {
						java_backend_write_statement(internal_constant_definition, stream, depth);
						cdolist_list_var2 = cdolist_list_var2.rest();
						internal_constant_definition = cdolist_list_var2.first();
					}
					final SubLObject additional_methods = java_backend_initializer_methods();
					if (NIL != additional_methods) {
						terpri(stream);
						terpri(stream);
						java_backend_indent(stream, depth);
						write_string($str94$_____Internal_Constant_Initialize, stream, UNPROVIDED, UNPROVIDED);
						SubLObject cdolist_list_var3 = additional_methods;
						SubLObject additional_method = NIL;
						additional_method = cdolist_list_var3.first();
						while (NIL != cdolist_list_var3) {
							terpri(stream);
							java_backend_write_statement(additional_method, stream, depth);
							cdolist_list_var3 = cdolist_list_var3.rest();
							additional_method = cdolist_list_var3.first();
						}
					}
				} finally {
					$java_backend_initializer_methods$.rebind(_prev_bind_0_$6, thread);
				}
			} finally {
				$java_backend_new_array_items_on_separate_linesP$.rebind(_prev_bind_0, thread);
			}
		}
		return NIL;
	}

	public static final SubLObject java_backend_gather_internal_constant_definitions_alt(SubLObject raw_definitions) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject definitions = NIL;
				SubLObject internal_constant_definitions = NIL;
				SubLObject cdolist_list_var = raw_definitions;
				SubLObject raw_definition = NIL;
				for (raw_definition = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), raw_definition = cdolist_list_var.first()) {
					if ((NIL != list_utilities.form_with_operator_p(raw_definition, DEFINE)) && (NIL != list_utilities.simple_tree_findP($sym62$_INTERNAL_CONSTANT, raw_definition))) {
						{
							SubLObject datum = raw_definition;
							SubLObject current = datum;
							SubLObject operator = NIL;
							SubLObject arglist = NIL;
							destructuring_bind_must_consp(current, datum, $list_alt63);
							operator = current.first();
							current = current.rest();
							destructuring_bind_must_consp(current, datum, $list_alt63);
							arglist = current.first();
							current = current.rest();
							{
								SubLObject body = current;
								list_utilities.verify_operator(operator, DEFINE);
								thread.resetMultipleValues();
								{
									SubLObject internal_constant_definitions_4 = list_utilities.partition_list(body, symbol_function(TRANSLATOR_INTERNAL_CONSTANT_FORM_P));
									SubLObject body_5 = thread.secondMultipleValue();
									thread.resetMultipleValues();
									internal_constant_definitions = internal_constant_definitions_4;
									body = body_5;
								}
								definitions = cons(listS(operator, arglist, append(body, NIL)), definitions);
							}
						}
					} else {
						definitions = cons(raw_definition, definitions);
					}
				}
				return values(nreverse(definitions), internal_constant_definitions);
			}
		}
	}

	public static SubLObject java_backend_gather_internal_constant_definitions(final SubLObject raw_definitions) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject definitions = NIL;
		SubLObject internal_constant_definitions = NIL;
		SubLObject cdolist_list_var = raw_definitions;
		SubLObject raw_definition = NIL;
		raw_definition = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if ((NIL != list_utilities.form_with_operator_p(raw_definition, DEFINE)) && (NIL != list_utilities.simple_tree_findP($sym96$_INTERNAL_CONSTANT, raw_definition))) {
				SubLObject current;
				final SubLObject datum = current = raw_definition;
				SubLObject operator = NIL;
				SubLObject arglist = NIL;
				destructuring_bind_must_consp(current, datum, $list97);
				operator = current.first();
				current = current.rest();
				destructuring_bind_must_consp(current, datum, $list97);
				arglist = current.first();
				SubLObject body;
				current = body = current.rest();
				list_utilities.verify_operator(operator, DEFINE);
				thread.resetMultipleValues();
				final SubLObject internal_constant_definitions_$7 = list_utilities.partition_list(body, symbol_function(TRANSLATOR_INTERNAL_CONSTANT_FORM_P));
				final SubLObject body_$8 = thread.secondMultipleValue();
				thread.resetMultipleValues();
				internal_constant_definitions = internal_constant_definitions_$7;
				body = body_$8;
				definitions = cons(listS(operator, arglist, append(body, NIL)), definitions);
			} else {
				definitions = cons(raw_definition, definitions);
			}
			cdolist_list_var = cdolist_list_var.rest();
			raw_definition = cdolist_list_var.first();
		}
		return values(nreverse(definitions), internal_constant_definitions);
	}

	public static final SubLObject translator_internal_constant_form_p_alt(SubLObject v_object) {
		return list_utilities.form_with_operator_p(v_object, $sym62$_INTERNAL_CONSTANT);
	}

	public static SubLObject translator_internal_constant_form_p(final SubLObject v_object) {
		return list_utilities.form_with_operator_p(v_object, $sym96$_INTERNAL_CONSTANT);
	}

	public static final SubLObject java_backend_output_initilizers_alt(SubLObject ts_file, SubLObject stream, SubLObject depth) {
		terpri(stream);
		terpri(stream);
		com.cyc.cycjava.cycl.java_backend.java_backend_indent(stream, depth);
		write_string($str_alt65$_____Initializers, stream, UNPROVIDED, UNPROVIDED);
		{
			SubLObject declare_method = file_translation.ts_file_declare_method(ts_file);
			terpri(stream);
			terpri(stream);
			com.cyc.cycjava.cycl.java_backend.java_backend_indent(stream, depth);
			write_string($str_alt66$public_void_declareFunctions____, stream, UNPROVIDED, UNPROVIDED);
			com.cyc.cycjava.cycl.java_backend.java_backend_write_statement(list(declare_method), stream, number_utilities.f_1X(depth));
			terpri(stream);
			com.cyc.cycjava.cycl.java_backend.java_backend_indent(stream, depth);
			write_string($str_alt45$_, stream, UNPROVIDED, UNPROVIDED);
		}
		{
			SubLObject init_method = file_translation.ts_file_init_method(ts_file);
			terpri(stream);
			terpri(stream);
			com.cyc.cycjava.cycl.java_backend.java_backend_indent(stream, depth);
			write_string($str_alt67$public_void_initializeVariables__, stream, UNPROVIDED, UNPROVIDED);
			com.cyc.cycjava.cycl.java_backend.java_backend_write_statement(list(init_method), stream, number_utilities.f_1X(depth));
			terpri(stream);
			com.cyc.cycjava.cycl.java_backend.java_backend_indent(stream, depth);
			write_string($str_alt45$_, stream, UNPROVIDED, UNPROVIDED);
		}
		{
			SubLObject setup_method = file_translation.ts_file_setup_method(ts_file);
			terpri(stream);
			terpri(stream);
			com.cyc.cycjava.cycl.java_backend.java_backend_indent(stream, depth);
			write_string($str_alt68$public_void_runTopLevelForms____, stream, UNPROVIDED, UNPROVIDED);
			com.cyc.cycjava.cycl.java_backend.java_backend_write_statement(list(setup_method), stream, number_utilities.f_1X(depth));
			terpri(stream);
			com.cyc.cycjava.cycl.java_backend.java_backend_indent(stream, depth);
			write_string($str_alt45$_, stream, UNPROVIDED, UNPROVIDED);
		}
		return NIL;
	}

	public static SubLObject java_backend_output_initilizers(final SubLObject ts_file, final SubLObject stream, final SubLObject depth) {
		terpri(stream);
		terpri(stream);
		java_backend_indent(stream, depth);
		write_string($str99$_____Initializers, stream, UNPROVIDED, UNPROVIDED);
		final SubLObject declare_method = file_translation.ts_file_declare_method(ts_file);
		terpri(stream);
		terpri(stream);
		java_backend_indent(stream, depth);
		write_string($str100$_Override_public_void_declareFunc, stream, UNPROVIDED, UNPROVIDED);
		java_backend_write_statement(list(declare_method), stream, number_utilities.f_1X(depth));
		terpri(stream);
		java_backend_indent(stream, depth);
		write_string($str81$_, stream, UNPROVIDED, UNPROVIDED);
		final SubLObject init_method = file_translation.ts_file_init_method(ts_file);
		terpri(stream);
		terpri(stream);
		java_backend_indent(stream, depth);
		write_string($str101$_Override_public_void_initializeV, stream, UNPROVIDED, UNPROVIDED);
		java_backend_write_statement(list(init_method), stream, number_utilities.f_1X(depth));
		terpri(stream);
		java_backend_indent(stream, depth);
		write_string($str81$_, stream, UNPROVIDED, UNPROVIDED);
		final SubLObject setup_method = file_translation.ts_file_setup_method(ts_file);
		terpri(stream);
		terpri(stream);
		java_backend_indent(stream, depth);
		write_string($str102$_Override_public_void_runTopLevel, stream, UNPROVIDED, UNPROVIDED);
		java_backend_write_statement(list(setup_method), stream, number_utilities.f_1X(depth));
		terpri(stream);
		java_backend_indent(stream, depth);
		write_string($str81$_, stream, UNPROVIDED, UNPROVIDED);
		return NIL;
	}

	public static final SubLObject java_backend_write_statement_alt(SubLObject statement_form, SubLObject stream, SubLObject depth) {
		if (depth == UNPROVIDED) {
			depth = ZERO_INTEGER;
		}
		terpri(stream);
		com.cyc.cycjava.cycl.java_backend.java_backend_indent(stream, depth);
		if (NIL != com.cyc.cycjava.cycl.java_backend.java_backend_write_form(statement_form, stream, depth)) {
			write_string($str_alt69$_, stream, UNPROVIDED, UNPROVIDED);
		}
		return NIL;
	}

	public static SubLObject java_backend_write_statement(final SubLObject statement_form, final SubLObject stream, SubLObject depth) {
		if (depth == UNPROVIDED) {
			depth = ZERO_INTEGER;
		}
		terpri(stream);
		java_backend_indent(stream, depth);
		if (NIL != java_backend_write_form(statement_form, stream, depth)) {
			write_string($str103$_, stream, UNPROVIDED, UNPROVIDED);
		}
		return NIL;
	}

	public static final SubLObject java_backend_write_form_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		if (depth == UNPROVIDED) {
			depth = ZERO_INTEGER;
		}
		form = com.cyc.cycjava.cycl.java_backend.java_backend_optimize_function_call_form(form);
		if (form.isAtom()) {
			return com.cyc.cycjava.cycl.java_backend.java_backend_print_atom(form, stream, depth);
		} else {
			{
				SubLObject operator = form.first();
				SubLObject writer = com.cyc.cycjava.cycl.java_backend.java_backend_writer(operator);
				if (NIL != writer) {
					return com.cyc.cycjava.cycl.java_backend.java_backend_write_via_writer(writer, form, stream, depth);
				} else {
					return com.cyc.cycjava.cycl.java_backend.java_backend_write_function_call(form, stream, depth);
				}
			}
		}
	}

	public static SubLObject java_backend_write_form(SubLObject form, final SubLObject stream, SubLObject depth) {
		if (depth == UNPROVIDED) {
			depth = ZERO_INTEGER;
		}
		form = java_backend_optimize_function_call_form(form);
		if (form.isAtom()) {
			return java_backend_print_atom(form, stream, depth);
		}
		final SubLObject operator = form.first();
		final SubLObject writer = java_backend_writer(operator);
		if (NIL != writer) {
			return java_backend_write_via_writer(writer, form, stream, depth);
		}
		return java_backend_write_function_call(form, stream, depth);
	}

	public static final SubLObject java_backend_test_translate_write_form_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		if (depth == UNPROVIDED) {
			depth = ZERO_INTEGER;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject _prev_bind_0 = $read_default_float_format$.currentBinding(thread);
				SubLObject _prev_bind_1 = c_backend.$anonymous_variable_counter$.currentBinding(thread);
				SubLObject _prev_bind_2 = $java_backend_previous_local_variable_scope$.currentBinding(thread);
				SubLObject _prev_bind_3 = $java_backend_current_local_variable_scope$.currentBinding(thread);
				try {
					$read_default_float_format$.bind(DOUBLE_FLOAT, thread);
					c_backend.$anonymous_variable_counter$.bind(ZERO_INTEGER, thread);
					$java_backend_previous_local_variable_scope$.bind(NIL, thread);
					$java_backend_current_local_variable_scope$.bind(NIL, thread);
					{
						SubLObject state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
						SubLObject local_state = state;
						{
							SubLObject _prev_bind_0_6 = memoization_state.$memoization_state$.currentBinding(thread);
							try {
								memoization_state.$memoization_state$.bind(local_state, thread);
								{
									final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
									try {
										com.cyc.cycjava.cycl.java_backend.java_backend_write_form(form, stream, depth);
									} finally {
										{
											SubLObject _prev_bind_0_7 = $is_thread_performing_cleanupP$.currentBinding(thread);
											try {
												$is_thread_performing_cleanupP$.bind(T, thread);
												if ((NIL != local_state) && (NIL == original_memoization_process)) {
													memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
												}
											} finally {
												$is_thread_performing_cleanupP$.rebind(_prev_bind_0_7, thread);
											}
										}
									}
								}
							} finally {
								memoization_state.$memoization_state$.rebind(_prev_bind_0_6, thread);
							}
						}
					}
				} finally {
					$java_backend_current_local_variable_scope$.rebind(_prev_bind_3, thread);
					$java_backend_previous_local_variable_scope$.rebind(_prev_bind_2, thread);
					c_backend.$anonymous_variable_counter$.rebind(_prev_bind_1, thread);
					$read_default_float_format$.rebind(_prev_bind_0, thread);
				}
			}
			return form;
		}
	}

	public static SubLObject java_backend_test_translate_write_form(final SubLObject form, final SubLObject stream, SubLObject depth) {
		if (depth == UNPROVIDED) {
			depth = ZERO_INTEGER;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject _prev_bind_0 = $read_default_float_format$.currentBinding(thread);
		final SubLObject _prev_bind_2 = c_backend.$anonymous_variable_counter$.currentBinding(thread);
		final SubLObject _prev_bind_3 = $java_backend_previous_local_variable_scope$.currentBinding(thread);
		final SubLObject _prev_bind_4 = $java_backend_current_local_variable_scope$.currentBinding(thread);
		try {
			$read_default_float_format$.bind(DOUBLE_FLOAT, thread);
			c_backend.$anonymous_variable_counter$.bind(ZERO_INTEGER, thread);
			$java_backend_previous_local_variable_scope$.bind(NIL, thread);
			$java_backend_current_local_variable_scope$.bind(NIL, thread);
			final SubLObject local_state;
			final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			final SubLObject _prev_bind_0_$9 = memoization_state.$memoization_state$.currentBinding(thread);
			try {
				memoization_state.$memoization_state$.bind(local_state, thread);
				final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
				try {
					java_backend_write_form(form, stream, depth);
				} finally {
					final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
					try {
						$is_thread_performing_cleanupP$.bind(T, thread);
						final SubLObject _values = getValuesAsVector();
						memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
						restoreValuesFromVector(_values);
					} finally {
						$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
					}
				}
			} finally {
				memoization_state.$memoization_state$.rebind(_prev_bind_0_$9, thread);
			}
		} finally {
			$java_backend_current_local_variable_scope$.rebind(_prev_bind_4, thread);
			$java_backend_previous_local_variable_scope$.rebind(_prev_bind_3, thread);
			c_backend.$anonymous_variable_counter$.rebind(_prev_bind_2, thread);
			$read_default_float_format$.rebind(_prev_bind_0, thread);
		}
		return form;
	}

	public static final SubLObject java_backend_indent_alt(SubLObject stream, SubLObject depth) {
		{
			SubLObject i = NIL;
			for (i = ZERO_INTEGER; i.numL(depth); i = add(i, ONE_INTEGER)) {
				write_string($str_alt70$__, stream, UNPROVIDED, UNPROVIDED);
			}
		}
		return NIL;
	}

	public static SubLObject java_backend_indent(final SubLObject stream, final SubLObject depth) {
		SubLObject i;
		for (i = NIL, i = ZERO_INTEGER; i.numL(depth); i = add(i, ONE_INTEGER)) {
			write_string($$$__, stream, UNPROVIDED, UNPROVIDED);
		}
		return NIL;
	}

	public static final SubLObject java_backend_print_atom_alt(SubLObject atom, SubLObject stream, SubLObject depth) {
		if (atom.isSymbol()) {
			com.cyc.cycjava.cycl.java_backend.java_backend_print_variable(atom, stream);
		} else {
			if (NIL != com.cyc.cycjava.cycl.java_backend.java_backend_native_constant_p(atom)) {
				com.cyc.cycjava.cycl.java_backend.java_backend_write_native_constant(atom, stream);
			} else {
				return Errors.error($str_alt71$Unexpected_C_backend_atom____S, atom);
			}
		}
		return NIL;
	}

	public static SubLObject java_backend_print_atom(final SubLObject atom, final SubLObject stream, final SubLObject depth) {
		if (atom.isSymbol()) {
			java_backend_print_variable(atom, stream);
		} else {
			if (NIL == java_backend_native_constant_p(atom)) {
				return Errors.error($str105$Unexpected_C_backend_atom____S, atom);
			}
			java_backend_write_native_constant(atom, stream);
		}
		return NIL;
	}

	public static final SubLObject java_backend_native_constant_p_alt(SubLObject v_object) {
		return c_backend.c_backend_native_constant_p(v_object);
	}

	public static SubLObject java_backend_native_constant_p(final SubLObject v_object) {
		return c_backend.c_backend_native_constant_p(v_object);
	}

	public static final SubLObject java_backend_write_native_constant_alt(SubLObject atom, SubLObject stream) {
		return c_backend.c_backend_write_native_constant(atom, stream);
	}

	public static SubLObject java_backend_write_native_constant(final SubLObject atom, final SubLObject stream) {
		return c_backend.c_backend_write_native_constant(atom, stream);
	}

	public static final SubLObject java_backend_write_Xpc_alt(SubLObject pc_form, SubLObject stream, SubLObject depth) {
		if (depth == UNPROVIDED) {
			depth = NIL;
		}
		{
			SubLObject datum = pc_form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			SubLObject constant = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt72);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt72);
			constant = current.first();
			current = current.rest();
			if (NIL == current) {
				list_utilities.verify_operator(operator, $sym73$_PC);
				{
					SubLObject pc_string = java_name_translation.java_backend_predefined_constant_name(constant);
					if (NIL == pc_string) {
						return Errors.error($str_alt74$Time_to_implement_a_C_backend_tra, constant);
					}
					return write_string(pc_string, stream, UNPROVIDED, UNPROVIDED);
				}
			} else {
				cdestructuring_bind_error(datum, $list_alt72);
			}
		}
		return NIL;
	}

	public static SubLObject java_backend_write_Xpc(final SubLObject pc_form, final SubLObject stream, SubLObject depth) {
		if (depth == UNPROVIDED) {
			depth = NIL;
		}
		SubLObject operator = NIL;
		SubLObject constant = NIL;
		destructuring_bind_must_consp(pc_form, pc_form, $list106);
		operator = pc_form.first();
		SubLObject current = pc_form.rest();
		destructuring_bind_must_consp(current, pc_form, $list106);
		constant = current.first();
		current = current.rest();
		if (NIL != current) {
			cdestructuring_bind_error(pc_form, $list106);
			return NIL;
		}
		list_utilities.verify_operator(operator, $sym107$_PC);
		final SubLObject pc_string = java_name_translation.java_backend_predefined_constant_name(constant);
		if (NIL == pc_string) {
			return Errors.error($str108$Time_to_implement_a_C_backend_tra, constant);
		}
		return write_string(pc_string, stream, UNPROVIDED, UNPROVIDED);
	}

	public static final SubLObject java_backend_print_variable_alt(SubLObject variable, SubLObject stream) {
		{
			SubLObject binding_type = com.cyc.cycjava.cycl.java_backend.java_backend_variable_binding_type(variable);
			SubLObject pcase_var = binding_type;
			if ((pcase_var.eql($DYNAMIC) || pcase_var.eql($LEXICAL)) || pcase_var.eql($CONSTANT)) {
				{
					SubLObject class_name = java_name_translation.java_backend_global_class(variable);
					if (!(class_name.equal(com.cyc.cycjava.cycl.java_backend.java_backend_current_class()) || ($UNSPECIFIED == class_name))) {
						write_string(class_name, stream, UNPROVIDED, UNPROVIDED);
						write_string($str_alt15$_, stream, UNPROVIDED, UNPROVIDED);
					}
					com.cyc.cycjava.cycl.java_backend.java_backend_write_global_name(variable, stream);
				}
			} else {
				if (pcase_var.eql($LOCAL)) {
					{
						SubLObject local_name = com.cyc.cycjava.cycl.java_backend.java_backend_local_variable_name(variable);
						write_string(local_name, stream, UNPROVIDED, UNPROVIDED);
					}
				} else {
					return Errors.error($str_alt80$unexpected_variable_binding_type_, binding_type, variable);
				}
			}
		}
		return NIL;
	}

	public static SubLObject java_backend_print_variable(final SubLObject variable, final SubLObject stream) {
		final SubLObject pcase_var;
		final SubLObject binding_type = pcase_var = java_backend_variable_binding_type(variable);
		if ((pcase_var.eql($DYNAMIC) || pcase_var.eql($LEXICAL)) || pcase_var.eql($CONSTANT)) {
			final SubLObject class_name = java_name_translation.java_backend_global_class(variable);
			if ((!class_name.equal(java_backend_current_class())) && ($UNSPECIFIED != class_name)) {
				write_string(class_name, stream, UNPROVIDED, UNPROVIDED);
				write_string($str49$_, stream, UNPROVIDED, UNPROVIDED);
			}
			java_backend_write_global_name(variable, stream);
		} else {
			if (!pcase_var.eql($LOCAL)) {
				return Errors.error($str114$unexpected_variable_binding_type_, binding_type, variable);
			}
			final SubLObject local_name = java_backend_local_variable_name(variable);
			write_string(local_name, stream, UNPROVIDED, UNPROVIDED);
		}
		return NIL;
	}

	public static final SubLObject java_backend_write_global_name_alt(SubLObject variable, SubLObject stream) {
		{
			SubLObject global_name = java_name_translation.java_backend_global_name(variable);
			write_string(global_name, stream, UNPROVIDED, UNPROVIDED);
		}
		return variable;
	}

	public static SubLObject java_backend_write_global_name(final SubLObject variable, final SubLObject stream) {
		final SubLObject global_name = java_name_translation.java_backend_global_name(variable);
		write_string(global_name, stream, UNPROVIDED, UNPROVIDED);
		return variable;
	}

	public static final SubLObject java_backend_variable_binding_type_alt(SubLObject variable) {
		{
			SubLObject binding_type = java_name_translation.java_backend_undefined_variable_binding_type_lookup(variable);
			if (NIL != binding_type) {
				return binding_type;
			}
		}
		return form_translation.translator_variable_binding_type(variable);
	}

	public static SubLObject java_backend_variable_binding_type(final SubLObject variable) {
		final SubLObject binding_type = java_name_translation.java_backend_undefined_variable_binding_type_lookup(variable);
		if (NIL != binding_type) {
			return binding_type;
		}
		return form_translation.translator_variable_binding_type(variable);
	}

	public static final SubLObject java_backend_new_local_variable_scope_alt(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject body = current;
			return listS(CLET, $list_alt81, append(body, NIL));
		}
	}

	public static SubLObject java_backend_new_local_variable_scope(final SubLObject macroform, final SubLObject environment) {
		final SubLObject datum = macroform.rest();
		final SubLObject body;
		final SubLObject current = body = datum;
		return listS(CLET, $list115, append(body, NIL));
	}

	public static final SubLObject java_backend_add_local_variable_to_scope_alt(SubLObject variable) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject name = com.cyc.cycjava.cycl.java_backend.java_backend_compute_local_variable_name(variable);
				$java_backend_current_local_variable_scope$.setDynamicValue(cons(cons(variable, name), $java_backend_current_local_variable_scope$.getDynamicValue(thread)), thread);
			}
			return NIL;
		}
	}

	public static SubLObject java_backend_add_local_variable_to_scope(final SubLObject variable) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject name = java_backend_compute_local_variable_name(variable);
		$java_backend_current_local_variable_scope$.setDynamicValue(cons(cons(variable, name), $java_backend_current_local_variable_scope$.getDynamicValue(thread)), thread);
		return NIL;
	}

	public static final SubLObject java_backend_local_variable_name_alt(SubLObject variable) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject name = list_utilities.alist_lookup_without_values($java_backend_current_local_variable_scope$.getDynamicValue(thread), variable, symbol_function(EQ), $ERROR);
				if (name == $ERROR) {
					if (NIL == file_translation.current_ts_file()) {
						name = com.cyc.cycjava.cycl.java_backend.java_backend_compute_local_variable_name(variable);
					}
				}
				SubLTrampolineFile.checkType(name, STRINGP);
				return name;
			}
		}
	}

	public static SubLObject java_backend_local_variable_name(final SubLObject variable) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject name = list_utilities.alist_lookup_without_values($java_backend_current_local_variable_scope$.getDynamicValue(thread), variable, symbol_function(EQ), $ERROR);
		if ((name == $ERROR) && (NIL == file_translation.current_ts_file())) {
			name = java_backend_compute_local_variable_name(variable);
		}
		if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!name.isString())) {
			Errors.error($str117$_s_is_an_undeclared_variable__can, variable);
		}
		return name;
	}

	public static final SubLObject java_backend_compute_local_variable_name_alt(SubLObject variable) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject local_name = com.cyc.cycjava.cycl.java_backend.java_backend_local_variable_name_basis(variable);
				if (NIL != java_name_translation.java_backend_reserved_word_p(local_name)) {
					local_name = cconcatenate($str_alt83$v_, format_nil.format_nil_a_no_copy(local_name));
				} else {
					if (NIL != digit_char_p(Strings.sublisp_char(local_name, ZERO_INTEGER), UNPROVIDED)) {
						local_name = cconcatenate($str_alt83$v_, format_nil.format_nil_a_no_copy(local_name));
					} else {
						if (NIL != xref_database.current_xref_module_p(com.cyc.cycjava.cycl.java_backend.java_backend_uncanonicalize_identifier_name(local_name))) {
							local_name = cconcatenate($str_alt83$v_, format_nil.format_nil_a_no_copy(local_name));
						}
					}
				}
				{
					SubLObject uniquifier = com.cyc.cycjava.cycl.java_backend.java_backend_local_uniquifier(variable);
					if (uniquifier.numG(ZERO_INTEGER)) {
						c_backend.$anonymous_variable_counter$.setDynamicValue(add(c_backend.$anonymous_variable_counter$.getDynamicValue(thread), ONE_INTEGER), thread);
						local_name = cconcatenate(format_nil.format_nil_a_no_copy(local_name), new SubLObject[] { $str_alt84$_, format_nil.format_nil_a_no_copy(c_backend.$anonymous_variable_counter$.getDynamicValue(thread)) });
					}
				}
				return local_name;
			}
		}
	}

	public static SubLObject java_backend_compute_local_variable_name(final SubLObject variable) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject local_name = java_backend_local_variable_name_basis(variable);
		if (NIL != java_name_translation.java_backend_reserved_word_p(local_name)) {
			local_name = cconcatenate($str118$v_, format_nil.format_nil_a_no_copy(local_name));
		} else if (NIL != digit_char_p(Strings.sublisp_char(local_name, ZERO_INTEGER), UNPROVIDED)) {
			local_name = cconcatenate($str118$v_, format_nil.format_nil_a_no_copy(local_name));
		} else if (NIL != xref_database.current_xref_module_p(java_backend_uncanonicalize_identifier_name(local_name))) {
			local_name = cconcatenate($str118$v_, format_nil.format_nil_a_no_copy(local_name));
		}

		final SubLObject uniquifier = java_backend_local_uniquifier(variable);
		if (uniquifier.numG(ZERO_INTEGER)) {
			c_backend.$anonymous_variable_counter$.setDynamicValue(add(c_backend.$anonymous_variable_counter$.getDynamicValue(thread), ONE_INTEGER), thread);
			local_name = cconcatenate(format_nil.format_nil_a_no_copy(local_name), new SubLObject[] { $str119$__, format_nil.format_nil_a_no_copy(c_backend.$anonymous_variable_counter$.getDynamicValue(thread)) });
		}
		return local_name;
	}

	public static final SubLObject java_backend_local_uniquifier_alt(SubLObject local) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject local_name = symbol_name(local);
				SubLObject count = ZERO_INTEGER;
				SubLObject cdolist_list_var = $java_backend_current_local_variable_scope$.getDynamicValue(thread);
				SubLObject cons = NIL;
				for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), cons = cdolist_list_var.first()) {
					{
						SubLObject datum = cons;
						SubLObject current = datum;
						SubLObject current_local_from_scope = NIL;
						SubLObject its_name = NIL;
						destructuring_bind_must_consp(current, datum, $list_alt85);
						current_local_from_scope = current.first();
						current = current.rest();
						its_name = current;
						if (local_name.equalp(symbol_name(current_local_from_scope))) {
							count = add(count, ONE_INTEGER);
						}
					}
				}
				return count;
			}
		}
	}

	public static SubLObject java_backend_local_uniquifier(final SubLObject local) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject local_name = symbol_name(local);
		SubLObject count = ZERO_INTEGER;
		SubLObject cdolist_list_var = $java_backend_current_local_variable_scope$.getDynamicValue(thread);
		SubLObject cons = NIL;
		cons = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject current;
			final SubLObject datum = current = cons;
			SubLObject current_local_from_scope = NIL;
			SubLObject its_name = NIL;
			destructuring_bind_must_consp(current, datum, $list120);
			current_local_from_scope = current.first();
			current = its_name = current.rest();
			if (local_name.equalp(symbol_name(current_local_from_scope))) {
				count = add(count, ONE_INTEGER);
			}
			cdolist_list_var = cdolist_list_var.rest();
			cons = cdolist_list_var.first();
		}
		return count;
	}

	public static final SubLObject java_backend_local_variable_name_basis_alt(SubLObject local) {
		if (NIL != list_utilities.member_eqP(system_translation.current_system_translation_security_level(), $list_alt47)) {
			{
				SubLObject secure_local_id = com.cyc.cycjava.cycl.java_backend.java_backend_secure_local_id(local);
				return cconcatenate($$$var, format_nil.format_nil_s_no_copy(secure_local_id));
			}
		}
		return java_name_translation.java_backend_symbol_name_basis(local);
	}

	public static SubLObject java_backend_local_variable_name_basis(final SubLObject local) {
		if (NIL != list_utilities.member_eqP(system_translation.current_system_translation_security_level(), $list83)) {
			final SubLObject secure_local_id = java_backend_secure_local_id(local);
			return cconcatenate($$$var, format_nil.format_nil_s_no_copy(secure_local_id));
		}
		return java_name_translation.java_backend_symbol_name_basis(local);
	}

	public static final SubLObject java_backend_secure_local_id_internal_alt(SubLObject local) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			c_backend.$anonymous_variable_counter$.setDynamicValue(add(c_backend.$anonymous_variable_counter$.getDynamicValue(thread), ONE_INTEGER), thread);
			return c_backend.$anonymous_variable_counter$.getDynamicValue(thread);
		}
	}

	public static SubLObject java_backend_secure_local_id_internal(final SubLObject local) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		c_backend.$anonymous_variable_counter$.setDynamicValue(add(c_backend.$anonymous_variable_counter$.getDynamicValue(thread), ONE_INTEGER), thread);
		return c_backend.$anonymous_variable_counter$.getDynamicValue(thread);
	}

	public static final SubLObject java_backend_secure_local_id_alt(SubLObject local) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return com.cyc.cycjava.cycl.java_backend.java_backend_secure_local_id_internal(local);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, JAVA_BACKEND_SECURE_LOCAL_ID, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), JAVA_BACKEND_SECURE_LOCAL_ID, ONE_INTEGER, NIL, EQ, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, JAVA_BACKEND_SECURE_LOCAL_ID, caching_state);
				}
				{
					SubLObject results = memoization_state.caching_state_lookup(caching_state, local, $kw49$_MEMOIZED_ITEM_NOT_FOUND_);
					if (results == $kw49$_MEMOIZED_ITEM_NOT_FOUND_) {
						results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.java_backend.java_backend_secure_local_id_internal(local)));
						memoization_state.caching_state_put(caching_state, local, results, UNPROVIDED);
					}
					return memoization_state.caching_results(results);
				}
			}
		}
	}

	public static SubLObject java_backend_secure_local_id(final SubLObject local) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return java_backend_secure_local_id_internal(local);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, JAVA_BACKEND_SECURE_LOCAL_ID, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), JAVA_BACKEND_SECURE_LOCAL_ID, ONE_INTEGER, NIL, EQ, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, JAVA_BACKEND_SECURE_LOCAL_ID, caching_state);
		}
		SubLObject results = memoization_state.caching_state_lookup(caching_state, local, memoization_state.$memoized_item_not_found$.getGlobalValue());
		if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			results = arg2(thread.resetMultipleValues(), multiple_value_list(java_backend_secure_local_id_internal(local)));
			memoization_state.caching_state_put(caching_state, local, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	}

	public static final SubLObject java_backend_write_function_call_alt(SubLObject function_call_form, SubLObject stream, SubLObject depth) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject datum = function_call_form;
				SubLObject current = datum;
				SubLObject operator = NIL;
				destructuring_bind_must_consp(current, datum, $list_alt88);
				operator = current.first();
				current = current.rest();
				{
					SubLObject args = current;
					thread.resetMultipleValues();
					{
						SubLObject required_count = com.cyc.cycjava.cycl.java_backend.java_backend_function_signature_info(operator);
						SubLObject optional_count = thread.secondMultipleValue();
						SubLObject restP = thread.thirdMultipleValue();
						thread.resetMultipleValues();
						if ($UNKNOWN == required_count) {
							Errors.warn($str_alt90$translating__S_call_as_funcall, operator);
							return com.cyc.cycjava.cycl.java_backend.java_backend_write_form(listS(FUNCALL, list($sym92$_LF, operator), append(args, NIL)), stream, depth);
						}
						{
							SubLObject call_arity = length(args);
							SubLObject non_rest_count = add(required_count, optional_count);
							SubLObject defaulted_optional_count = max(ZERO_INTEGER, subtract(non_rest_count, call_arity));
							SubLObject provided_optional_count = subtract(optional_count, defaulted_optional_count);
							SubLObject provided_non_rest_count = add(required_count, provided_optional_count);
							com.cyc.cycjava.cycl.java_backend.java_backend_write_function_invocation_name(operator, stream);
							write_string($str_alt93$_, stream, UNPROVIDED, UNPROVIDED);
							{
								SubLObject processed_args = ZERO_INTEGER;
								{
									SubLObject i = NIL;
									for (i = ZERO_INTEGER; i.numL(provided_non_rest_count); i = add(i, ONE_INTEGER)) {
										{
											SubLObject datum_8 = args;
											SubLObject current_9 = datum_8;
											SubLObject arg = NIL;
											SubLObject rest_args = NIL;
											destructuring_bind_must_consp(current_9, datum_8, $list_alt94);
											arg = current_9.first();
											current_9 = current_9.rest();
											rest_args = current_9;
											args = rest_args;
											if (!processed_args.isZero()) {
												com.cyc.cycjava.cycl.java_backend.java_backend_write_function_call_argument_separator(stream);
											}
											com.cyc.cycjava.cycl.java_backend.java_backend_write_form(arg, stream, number_utilities.f_1X(depth));
											processed_args = add(processed_args, ONE_INTEGER);
										}
									}
								}
								{
									SubLObject i = NIL;
									for (i = ZERO_INTEGER; i.numL(defaulted_optional_count); i = add(i, ONE_INTEGER)) {
										if (!processed_args.isZero()) {
											com.cyc.cycjava.cycl.java_backend.java_backend_write_function_call_argument_separator(stream);
										}
										com.cyc.cycjava.cycl.java_backend.java_backend_write_function_call_unprovided_argument(stream);
										processed_args = add(processed_args, ONE_INTEGER);
									}
								}
								if (NIL != restP) {
									if (!processed_args.isZero()) {
										com.cyc.cycjava.cycl.java_backend.java_backend_write_function_call_argument_separator(stream);
									}
									com.cyc.cycjava.cycl.java_backend.java_backend_note_function_call_rest_arity(operator, length(args));
									com.cyc.cycjava.cycl.java_backend.java_backend_write_function_call_rest_args(args, stream, number_utilities.f_1X(depth));
								}
							}
							write_string($str_alt95$_, stream, UNPROVIDED, UNPROVIDED);
						}
					}
				}
			}
			return T;
		}
	}

	public static SubLObject java_backend_write_function_call(final SubLObject function_call_form, final SubLObject stream, final SubLObject depth) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject operator = NIL;
		destructuring_bind_must_consp(function_call_form, function_call_form, $list123);
		operator = function_call_form.first();
		SubLObject args;
		final SubLObject current = args = function_call_form.rest();
		thread.resetMultipleValues();
		final SubLObject required_count = java_backend_function_signature_info(operator);
		final SubLObject optional_count = thread.secondMultipleValue();
		final SubLObject restP = thread.thirdMultipleValue();
		thread.resetMultipleValues();
		if ($UNKNOWN == required_count) {
			Errors.warn($str125$translating__S_call_as_funcall, operator);
			return java_backend_write_form(listS(FUNCALL, list($sym127$_LF, operator), append(args, NIL)), stream, depth);
		}
		final SubLObject call_arity = length(args);
		final SubLObject non_rest_count = add(required_count, optional_count);
		final SubLObject rest_count = max(ZERO_INTEGER, subtract(call_arity, non_rest_count));
		final SubLObject defaulted_optional_count = min(optional_count, max(ZERO_INTEGER, subtract(non_rest_count, call_arity)));
		final SubLObject missing_required_count = max(ZERO_INTEGER, subtract(required_count, call_arity));
		final SubLObject excess_provided_count = (NIL != restP) ? ZERO_INTEGER : rest_count;
		final SubLObject provided_optional_count = max(ZERO_INTEGER, subtract(optional_count, defaulted_optional_count));
		final SubLObject provided_non_rest_count = min(call_arity, add(required_count, provided_optional_count));
		if (missing_required_count.isPositive()) {
			Errors.warn($str128$_S_called_with__S_missing_require, operator, missing_required_count);
		}
		if (excess_provided_count.isPositive()) {
			Errors.warn($str129$_S_called_with__S_excess_argument, operator, excess_provided_count);
		}
		java_backend_write_function_invocation_name(operator, stream);
		write_string($str130$_, stream, UNPROVIDED, UNPROVIDED);
		SubLObject processed_args = ZERO_INTEGER;
		SubLObject i;
		SubLObject current_$12;
		SubLObject datum_$11;
		SubLObject arg;
		SubLObject rest_args;
		for (i = NIL, i = ZERO_INTEGER; i.numL(provided_non_rest_count); i = add(i, ONE_INTEGER)) {
			datum_$11 = current_$12 = args;
			arg = NIL;
			rest_args = NIL;
			destructuring_bind_must_consp(current_$12, datum_$11, $list131);
			arg = current_$12.first();
			current_$12 = current_$12.rest();
			rest_args = args = current_$12;
			if (!processed_args.isZero()) {
				java_backend_write_function_call_argument_separator(stream);
			}
			java_backend_write_form(arg, stream, number_utilities.f_1X(depth));
			processed_args = add(processed_args, ONE_INTEGER);
		}
		for (i = NIL, i = ZERO_INTEGER; i.numL(defaulted_optional_count); i = add(i, ONE_INTEGER)) {
			if (!processed_args.isZero()) {
				java_backend_write_function_call_argument_separator(stream);
			}
			java_backend_write_function_call_unprovided_argument(stream);
			processed_args = add(processed_args, ONE_INTEGER);
		}
		if (NIL != restP) {
			if (!processed_args.isZero()) {
				java_backend_write_function_call_argument_separator(stream);
			}
			java_backend_note_function_call_rest_arity(operator, length(args));
			java_backend_write_function_call_rest_args(args, stream, number_utilities.f_1X(depth));
		}
		write_string($str132$_, stream, UNPROVIDED, UNPROVIDED);
		return T;
	}

	public static final SubLObject java_backend_write_function_definition_name_alt(SubLObject function, SubLObject stream) {
		{
			SubLObject method_name = java_name_translation.java_backend_function_name(function);
			write_string(method_name, stream, UNPROVIDED, UNPROVIDED);
			return NIL;
		}
	}

	public static SubLObject java_backend_write_function_definition_name(final SubLObject function, final SubLObject stream) {
		final SubLObject method_name = java_name_translation.java_backend_function_name(function);
		write_string(method_name, stream, UNPROVIDED, UNPROVIDED);
		return NIL;
	}

	public static final SubLObject java_backend_write_function_invocation_name_alt(SubLObject function, SubLObject stream) {
		{
			SubLObject class_name = java_name_translation.java_backend_function_class(function);
			if (!((($IMPORTED == class_name) || class_name.equal(com.cyc.cycjava.cycl.java_backend.java_backend_current_class())) || ($UNSPECIFIED == class_name))) {
				write_string(class_name, stream, UNPROVIDED, UNPROVIDED);
				write_string($str_alt15$_, stream, UNPROVIDED, UNPROVIDED);
			}
			return com.cyc.cycjava.cycl.java_backend.java_backend_write_function_definition_name(function, stream);
		}
	}

	public static SubLObject java_backend_write_function_invocation_name(final SubLObject function, final SubLObject stream) {
		final SubLObject class_name = java_name_translation.java_backend_function_class(function);
		if ((($IMPORTED != class_name) && (!class_name.equal(java_backend_current_class()))) && ($UNSPECIFIED != class_name)) {
			write_string(class_name, stream, UNPROVIDED, UNPROVIDED);
			write_string($str49$_, stream, UNPROVIDED, UNPROVIDED);
		}
		return java_backend_write_function_definition_name(function, stream);
	}

	public static final SubLObject java_backend_write_function_call_rest_args_alt(SubLObject rest_args, SubLObject stream, SubLObject depth) {
		if (NIL == rest_args) {
			com.cyc.cycjava.cycl.java_backend.java_backend_write_form($list_alt97, stream, number_utilities.f_1X(depth));
		} else {
			write_string($str_alt98$new_, stream, UNPROVIDED, UNPROVIDED);
			com.cyc.cycjava.cycl.java_backend.java_backend_write_object_data_type(stream);
			write_string($str_alt99$___, stream, UNPROVIDED, UNPROVIDED);
			write_string($str_alt44$_, stream, UNPROVIDED, UNPROVIDED);
			{
				SubLObject list_var = NIL;
				SubLObject rest_arg = NIL;
				SubLObject index = NIL;
				for (list_var = rest_args, rest_arg = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), rest_arg = list_var.first(), index = add(ONE_INTEGER, index)) {
					if (!index.isZero()) {
						com.cyc.cycjava.cycl.java_backend.java_backend_write_function_call_argument_separator(stream);
					}
					com.cyc.cycjava.cycl.java_backend.java_backend_write_form(rest_arg, stream, number_utilities.f_1X(depth));
				}
			}
			write_string($str_alt45$_, stream, UNPROVIDED, UNPROVIDED);
		}
		return NIL;
	}

	public static SubLObject java_backend_write_function_call_rest_args(final SubLObject rest_args, final SubLObject stream, final SubLObject depth) {
		if (NIL == rest_args) {
			java_backend_write_form($list134, stream, number_utilities.f_1X(depth));
		} else {
			java_backend_write_form(list($sym135$_NEW_ARRAY, $$$SubLObject, rest_args), stream, number_utilities.f_1X(depth));
		}
		return NIL;
	}

	public static final SubLObject java_backend_function_signature_info_alt(SubLObject function) {
		{
			SubLObject specified_arglist = com.cyc.cycjava.cycl.java_backend.java_backend_function_arglist(function);
			if (specified_arglist == $UNKNOWN) {
				return values($UNKNOWN, $UNKNOWN, $UNKNOWN);
			} else {
				if (specified_arglist == $UNSPECIFIED) {
					return file_translation.function_signature_info(function);
				} else {
					return file_translation.function_arglist_signature_info(specified_arglist);
				}
			}
		}
	}

	public static SubLObject java_backend_function_signature_info(final SubLObject function) {
		final SubLObject specified_arglist = java_backend_function_arglist(function);
		if (specified_arglist == $UNKNOWN) {
			return values($UNKNOWN, $UNKNOWN, $UNKNOWN);
		}
		if (specified_arglist == $UNSPECIFIED) {
			return file_translation.function_signature_info(function);
		}
		return file_translation.function_arglist_signature_info(specified_arglist);
	}

	public static final SubLObject java_backend_function_arglist_alt(SubLObject function) {
		{
			SubLObject arglist = java_name_translation.java_backend_function_arglist_lookup(function);
			if (arglist != $UNSPECIFIED) {
				return arglist;
			}
		}
		{
			SubLObject arglist = file_translation.current_ts_file_defined_function_arglist(function);
			if (arglist != $UNSPECIFIED) {
				return arglist;
			}
		}
		{
			SubLObject arglist = xref_database.xref_method_formal_arglist(function);
			if (arglist != $UNSPECIFIED) {
				return arglist;
			}
		}
		if (NIL != com.cyc.cycjava.cycl.java_backend.java_backend_initializer_method_p(function)) {
			return NIL;
		}
		{
			SubLObject name = symbol_name(function);
			if (NIL != string_utilities.starts_with(name, $str_alt100$_CSETF_)) {
				return $list_alt101;
			}
		}
		if (NIL == file_translation.current_ts_file()) {
			if (NIL != fboundp(function)) {
				{
					SubLObject arglist = $UNSPECIFIED;
					SubLObject ignore_errors_tag = NIL;
					try {
						{
							SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
							try {
								bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
								try {
									arglist = subl_promotions.function_symbol_arglist(function);
								} catch (Throwable catch_var) {
									Errors.handleThrowable(catch_var, NIL);
								}
							} finally {
								rebind(Errors.$error_handler$, _prev_bind_0);
							}
						}
					} catch (Throwable ccatch_env_var) {
						ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
					}
					if (arglist != $UNSPECIFIED) {
						return arglist;
					}
					Errors.warn($str_alt104$unable_to_introspect_on__S, function);
				}
			}
		}
		Errors.warn($str_alt105$Unexpected_function__S, function);
		return $UNKNOWN;
	}

	public static SubLObject java_backend_function_arglist(final SubLObject function) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject arglist = java_name_translation.java_backend_function_arglist_lookup(function);
		if (arglist != $UNSPECIFIED) {
			return arglist;
		}
		arglist = file_translation.current_ts_file_defined_function_arglist(function);
		if (arglist != $UNSPECIFIED) {
			return arglist;
		}
		arglist = xref_database.xref_method_formal_arglist(function);
		if (arglist != $UNSPECIFIED) {
			return arglist;
		}
		if (NIL != java_backend_initializer_method_p(function)) {
			return NIL;
		}
		final SubLObject name = symbol_name(function);
		if (NIL != string_utilities.starts_with(name, $str137$_CSETF_)) {
			return $list138;
		}
		if ((NIL == file_translation.current_ts_file()) && (NIL != fboundp(function))) {
			arglist = $UNSPECIFIED;
			SubLObject ignore_errors_tag = NIL;
			try {
				thread.throwStack.push($IGNORE_ERRORS_TARGET);
				final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
				try {
					Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
					try {
						arglist = subl_promotions.function_symbol_arglist(function);
					} catch (final Throwable catch_var) {
						Errors.handleThrowable(catch_var, NIL);
					}
				} finally {
					Errors.$error_handler$.rebind(_prev_bind_0, thread);
				}
			} catch (final Throwable ccatch_env_var) {
				ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
			} finally {
				thread.throwStack.pop();
			}
			if (arglist != $UNSPECIFIED) {
				return arglist;
			}
			Errors.warn($str141$unable_to_introspect_on__S, function);
		}
		Errors.warn($str142$Unexpected_function__S, function);
		return $UNKNOWN;
	}

	public static final SubLObject java_backend_write_function_call_argument_separator_alt(SubLObject stream) {
		return c_backend.c_backend_write_function_call_argument_separator(stream);
	}

	public static SubLObject java_backend_write_function_call_argument_separator(final SubLObject stream) {
		return c_backend.c_backend_write_function_call_argument_separator(stream);
	}

	public static final SubLObject java_backend_write_function_call_unprovided_argument_alt(SubLObject stream) {
		return write_string($$$UNPROVIDED, stream, UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject java_backend_write_function_call_unprovided_argument(final SubLObject stream) {
		return write_string($$$UNPROVIDED, stream, UNPROVIDED, UNPROVIDED);
	}

	public static final SubLObject java_backend_writer_alt(SubLObject operator) {
		return list_utilities.alist_lookup_without_values($java_backend_writers$.getGlobalValue(), operator, symbol_function(EQ), UNPROVIDED);
	}

	public static SubLObject java_backend_writer(final SubLObject operator) {
		return list_utilities.alist_lookup_without_values($java_backend_writers$.getGlobalValue(), operator, symbol_function(EQ), UNPROVIDED);
	}

	public static final SubLObject java_backend_write_via_writer_alt(SubLObject writer, SubLObject form, SubLObject stream, SubLObject depth) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
				if (NIL == subl_promotions.function_symbol_p(writer)) {
					Errors.error($str_alt108$Time_to_implement_the_writer_for_, writer);
				}
			}
			return funcall(writer, form, stream, depth);
		}
	}

	public static SubLObject java_backend_write_via_writer(final SubLObject writer, final SubLObject form, final SubLObject stream, final SubLObject depth) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subl_promotions.function_symbol_p(writer))) {
			Errors.error($str145$Time_to_implement_the_writer_for_, writer);
		}
		return funcall(writer, form, stream, depth);
	}

	public static final SubLObject java_backend_write_Xdp_check_type_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		return com.cyc.cycjava.cycl.java_backend.java_backend_write_checker($sym109$_DP_CHECK_TYPE, form, stream, depth);
	}

	public static SubLObject java_backend_write_Xdp_check_type(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		SubLObject v_object = NIL;
		SubLObject pred = NIL;
		destructuring_bind_must_consp(form, form, $list146);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list146);
		v_object = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list146);
		pred = current.first();
		current = current.rest();
		if (NIL == current) {
			list_utilities.verify_operator(operator, $sym147$_DP_CHECK_TYPE);
			final SubLObject expanded_form = list($sym148$_ASSERT, list($sym149$_NOT____, $list150, list(pred, v_object)), v_object);
			return java_backend_write_form(expanded_form, stream, depth);
		}
		cdestructuring_bind_error(form, $list146);
		return NIL;
	}

	public static final SubLObject java_backend_write_Xdp_enforce_type_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		return com.cyc.cycjava.cycl.java_backend.java_backend_write_checker($sym116$_DP_ENFORCE_TYPE, form, stream, depth);
	}

	public static SubLObject java_backend_write_Xdp_enforce_type(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		return java_backend_write_checker($sym151$_DP_ENFORCE_TYPE, form, stream, depth);
	}

	public static final SubLObject java_backend_write_checker_alt(SubLObject checker, SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			SubLObject v_object = NIL;
			SubLObject pred = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt110);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt110);
			v_object = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt110);
			pred = current.first();
			current = current.rest();
			if (NIL == current) {
				list_utilities.verify_operator(operator, checker);
				{
					SubLObject translated_pred = form_translation.translate_form(list(QUOTE, pred));
					SubLObject method = NIL;
					if (!(((NIL != list_utilities.form_with_operator_p(translated_pred, $sym73$_PC)) || (NIL != list_utilities.form_with_operator_p(translated_pred, $sym92$_LF))) || (NIL != list_utilities.form_with_operator_p(translated_pred, $sym112$_IC)))) {
						translated_pred = list($sym113$_CAST, $$$SubLSymbol, translated_pred);
					}
					{
						SubLObject pcase_var = checker;
						if (pcase_var.eql(QUOTE) || pcase_var.eql($sym109$_DP_CHECK_TYPE)) {
							method = $$$checkType;
						} else {
							if (pcase_var.eql(QUOTE) || pcase_var.eql($sym116$_DP_ENFORCE_TYPE)) {
								method = $$$enforceType;
							} else {
								Errors.error($str_alt118$unexpected_checker____S, checker);
							}
						}
					}
					{
						SubLObject expanded_form = list($sym119$_METHOD, NIL, method, v_object, translated_pred);
						com.cyc.cycjava.cycl.java_backend.java_backend_write_form(expanded_form, stream, depth);
						return T;
					}
				}
			} else {
				cdestructuring_bind_error(datum, $list_alt110);
			}
		}
		return NIL;
	}

	public static SubLObject java_backend_write_checker(final SubLObject checker, final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		SubLObject v_object = NIL;
		SubLObject pred = NIL;
		destructuring_bind_must_consp(form, form, $list146);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list146);
		v_object = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list146);
		pred = current.first();
		current = current.rest();
		if (NIL == current) {
			list_utilities.verify_operator(operator, checker);
			SubLObject translated_pred = form_translation.translate_form(list(QUOTE, pred));
			SubLObject method = NIL;
			if (((NIL == list_utilities.form_with_operator_p(translated_pred, $sym107$_PC)) && (NIL == list_utilities.form_with_operator_p(translated_pred, $sym127$_LF))) && (NIL == list_utilities.form_with_operator_p(translated_pred, $sym153$_IC))) {
				translated_pred = list($sym154$_CAST, $$$SubLSymbol, translated_pred);
			}
			if (checker.eql(QUOTE) || checker.eql($sym147$_DP_CHECK_TYPE)) {
				method = $$$checkType;
			} else if (checker.eql(QUOTE) || checker.eql($sym151$_DP_ENFORCE_TYPE)) {
				method = $$$enforceType;
			} else {
				Errors.error($str158$unexpected_checker____S, checker);
			}

			final SubLObject expanded_form = list($sym159$_METHOD, NIL, method, v_object, translated_pred);
			java_backend_write_form(expanded_form, stream, depth);
			return T;
		}
		cdestructuring_bind_error(form, $list146);
		return NIL;
	}

	public static final SubLObject java_backend_write_Xccatch_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt120);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt120);
			{
				SubLObject temp = current.rest();
				current = current.first();
				{
					SubLObject tag = NIL;
					SubLObject ans_var = NIL;
					SubLObject env_var = NIL;
					destructuring_bind_must_consp(current, datum, $list_alt120);
					tag = current.first();
					current = current.rest();
					destructuring_bind_must_consp(current, datum, $list_alt120);
					ans_var = current.first();
					current = current.rest();
					destructuring_bind_must_consp(current, datum, $list_alt120);
					env_var = current.first();
					current = current.rest();
					if (NIL == current) {
						current = temp;
						{
							SubLObject body = current;
							list_utilities.verify_operator(operator, $sym121$_CCATCH);
							{
								SubLObject expanded_form = list($sym122$_TRY, bq_cons(PROGN, append(body, NIL)), list(list(list($$$Throwable, env_var), list(CSETQ, ans_var, list($sym126$_HANDLE_THROWABLE, env_var, tag)))));
								return com.cyc.cycjava.cycl.java_backend.java_backend_write_Xtry(expanded_form, stream, depth);
							}
						}
					} else {
						cdestructuring_bind_error(datum, $list_alt120);
					}
				}
			}
		}
		return NIL;
	}

	public static SubLObject java_backend_write_Xccatch(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject operator = NIL;
		destructuring_bind_must_consp(form, form, $list160);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list160);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject tag = NIL;
		SubLObject ans_var = NIL;
		SubLObject env_var = NIL;
		destructuring_bind_must_consp(current, form, $list160);
		tag = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list160);
		ans_var = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list160);
		env_var = current.first();
		current = current.rest();
		if (NIL != current) {
			cdestructuring_bind_error(form, $list160);
			return NIL;
		}
		final SubLObject body;
		current = body = temp;
		list_utilities.verify_operator(operator, $sym161$_CCATCH);
		final SubLObject thread_var = java_backend_current_thread_variable();
		if (NIL != thread_var) {
			final SubLObject expanded_form = list($sym162$_TRY, listS(PROGN, list($sym159$_METHOD, thread_var, $str163$throwStack_push, tag), append(body, NIL)), list(list(list($$$Throwable, env_var), list(CSETQ, ans_var, list($sym166$_HANDLE_THROWABLE, env_var, tag)))), listS($sym159$_METHOD, thread_var, $list167));
			return java_backend_write_Xtry(expanded_form, stream, depth);
		}
		final SubLObject thread_$13 = $sym168$THREAD;
		return java_backend_write_Xwith_current_thread(list($sym169$_WITH_CURRENT_THREAD, thread_$13, form), stream, depth);
	}

	public static final SubLObject java_backend_write_Xcdo_symbols_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt127);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt127);
			{
				SubLObject temp = current.rest();
				current = current.first();
				{
					SubLObject sym = NIL;
					SubLObject package_var = NIL;
					SubLObject iterator_var = NIL;
					destructuring_bind_must_consp(current, datum, $list_alt127);
					sym = current.first();
					current = current.rest();
					destructuring_bind_must_consp(current, datum, $list_alt127);
					package_var = current.first();
					current = current.rest();
					destructuring_bind_must_consp(current, datum, $list_alt127);
					iterator_var = current.first();
					current = current.rest();
					if (NIL == current) {
						current = temp;
						{
							SubLObject body = current;
							list_utilities.verify_operator(operator, $sym128$_CDO_SYMBOLS);
							{
								SubLObject expanded_form = list(PROGN, listS($sym129$_LOCAL, iterator_var, list($sym130$_CDO_SYMBOLS_MAKE_ITERATOR, package_var), $list_alt131), listS(WHILE, list($sym133$_CDO_SYMBOLS_ITERATOR_HAS_NEXT, iterator_var), list(CSETQ, sym, list($sym134$_CDO_SYMBOLS_ITERATOR_NEXT_VALUE, iterator_var)), append(body, NIL)));
								return com.cyc.cycjava.cycl.java_backend.java_backend_write_form(expanded_form, stream, depth);
							}
						}
					} else {
						cdestructuring_bind_error(datum, $list_alt127);
					}
				}
			}
		}
		return NIL;
	}

	public static SubLObject java_backend_write_Xcdo_symbols(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		destructuring_bind_must_consp(form, form, $list170);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list170);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject sym = NIL;
		SubLObject package_var = NIL;
		SubLObject iterator_var = NIL;
		destructuring_bind_must_consp(current, form, $list170);
		sym = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list170);
		package_var = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list170);
		iterator_var = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			list_utilities.verify_operator(operator, $sym171$_CDO_SYMBOLS);
			final SubLObject expanded_form = list(PROGN, listS($sym172$_LOCAL, iterator_var, list($sym173$_CDO_SYMBOLS_MAKE_ITERATOR, package_var), $list174), listS(WHILE, list($sym176$_CDO_SYMBOLS_ITERATOR_HAS_NEXT, iterator_var), list(CSETQ, sym, list($sym177$_CDO_SYMBOLS_ITERATOR_NEXT_VALUE, iterator_var)), append(body, NIL)));
			return java_backend_write_form(expanded_form, stream, depth);
		}
		cdestructuring_bind_error(form, $list170);
		return NIL;
	}

	public static final SubLObject java_backend_write_clet_bind_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject datum = form;
				SubLObject current = datum;
				SubLObject operator = NIL;
				SubLObject v_bindings = NIL;
				destructuring_bind_must_consp(current, datum, $list_alt135);
				operator = current.first();
				current = current.rest();
				destructuring_bind_must_consp(current, datum, $list_alt135);
				v_bindings = current.first();
				current = current.rest();
				{
					SubLObject body = current;
					list_utilities.verify_operator(operator, CLET_BIND);
					{
						SubLObject locals = NIL;
						SubLObject binders = NIL;
						SubLObject rebinders = NIL;
						SubLObject list_var = NIL;
						SubLObject binding = NIL;
						SubLObject index = NIL;
						for (list_var = v_bindings, binding = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), binding = list_var.first(), index = add(ONE_INTEGER, index)) {
							{
								SubLObject local = com.cyc.cycjava.cycl.java_backend.java_backend_clet_bind_local_variable(index);
								SubLObject datum_10 = binding;
								SubLObject current_11 = datum_10;
								SubLObject variable = NIL;
								SubLObject initialization = NIL;
								destructuring_bind_must_consp(current_11, datum_10, $list_alt137);
								variable = current_11.first();
								current_11 = current_11.rest();
								destructuring_bind_must_consp(current_11, datum_10, $list_alt137);
								initialization = current_11.first();
								current_11 = current_11.rest();
								if (NIL == current_11) {
									locals = cons(list(local, list($sym138$_CURRENT_BINDING, variable)), locals);
									binders = cons(list($sym139$_BIND, variable, initialization), binders);
									rebinders = cons(list($sym140$_REBIND, variable, local), rebinders);
								} else {
									cdestructuring_bind_error(datum_10, $list_alt137);
								}
							}
						}
						return com.cyc.cycjava.cycl.java_backend.java_backend_write_clet_local(list(CLET_LOCAL, nreverse(locals), listS($sym122$_TRY, bq_cons(PROGN, append(nreverse(binders), body, NIL)), NIL, append(rebinders, NIL))), stream, depth);
					}
				}
			}
		}
	}

	public static SubLObject java_backend_write_clet_bind(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject operator = NIL;
		SubLObject v_bindings = NIL;
		destructuring_bind_must_consp(form, form, $list178);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list178);
		v_bindings = current.first();
		final SubLObject body;
		current = body = current.rest();
		list_utilities.verify_operator(operator, CLET_BIND);
		SubLObject locals = NIL;
		SubLObject binders = NIL;
		SubLObject rebinders = NIL;
		SubLObject list_var = NIL;
		SubLObject binding = NIL;
		SubLObject index = NIL;
		list_var = v_bindings;
		binding = list_var.first();
		for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), binding = list_var.first(), index = add(ONE_INTEGER, index)) {
			final SubLObject local = java_backend_clet_bind_local_variable(index);
			SubLObject current_$15;
			final SubLObject datum_$14 = current_$15 = binding;
			SubLObject variable = NIL;
			SubLObject initialization = NIL;
			destructuring_bind_must_consp(current_$15, datum_$14, $list180);
			variable = current_$15.first();
			current_$15 = current_$15.rest();
			destructuring_bind_must_consp(current_$15, datum_$14, $list180);
			initialization = current_$15.first();
			current_$15 = current_$15.rest();
			if (NIL == current_$15) {
				locals = cons(list(local, list($sym181$_CURRENT_BINDING, variable)), locals);
				binders = cons(list($sym182$_BIND, variable, initialization), binders);
				rebinders = cons(list($sym183$_REBIND, variable, local), rebinders);
			} else {
				cdestructuring_bind_error(datum_$14, $list180);
			}
		}
		return java_backend_write_clet_local(list(CLET_LOCAL, nreverse(locals), listS($sym162$_TRY, bq_cons(PROGN, append(nreverse(binders), body, NIL)), NIL, append(rebinders, NIL))), stream, depth);
	}

	public static final SubLObject clear_java_backend_clet_bind_local_variable_alt() {
		{
			SubLObject cs = $java_backend_clet_bind_local_variable_caching_state$.getGlobalValue();
			if (NIL != cs) {
				memoization_state.caching_state_clear(cs);
			}
		}
		return NIL;
	}

	public static SubLObject clear_java_backend_clet_bind_local_variable() {
		final SubLObject cs = $java_backend_clet_bind_local_variable_caching_state$.getGlobalValue();
		if (NIL != cs) {
			memoization_state.caching_state_clear(cs);
		}
		return NIL;
	}

	public static final SubLObject remove_java_backend_clet_bind_local_variable_alt(SubLObject index) {
		return memoization_state.caching_state_remove_function_results_with_args($java_backend_clet_bind_local_variable_caching_state$.getGlobalValue(), list(index), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject remove_java_backend_clet_bind_local_variable(final SubLObject index) {
		return memoization_state.caching_state_remove_function_results_with_args($java_backend_clet_bind_local_variable_caching_state$.getGlobalValue(), list(index), UNPROVIDED, UNPROVIDED);
	}

	public static final SubLObject java_backend_clet_bind_local_variable_internal_alt(SubLObject index) {
		return make_symbol(cconcatenate($str_alt143$_PREV_BIND_, format_nil.format_nil_s_no_copy(index)));
	}

	public static SubLObject java_backend_clet_bind_local_variable_internal(final SubLObject index) {
		return make_symbol(cconcatenate($str186$_PREV_BIND_, format_nil.format_nil_s_no_copy(index)));
	}

	public static final SubLObject java_backend_clet_bind_local_variable_alt(SubLObject index) {
		{
			SubLObject caching_state = $java_backend_clet_bind_local_variable_caching_state$.getGlobalValue();
			if (NIL == caching_state) {
				caching_state = memoization_state.create_global_caching_state_for_name(JAVA_BACKEND_CLET_BIND_LOCAL_VARIABLE, $java_backend_clet_bind_local_variable_caching_state$, NIL, EQ, ONE_INTEGER, ZERO_INTEGER);
			}
			{
				SubLObject results = memoization_state.caching_state_lookup(caching_state, index, $kw49$_MEMOIZED_ITEM_NOT_FOUND_);
				if (results == $kw49$_MEMOIZED_ITEM_NOT_FOUND_) {
					results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.java_backend.java_backend_clet_bind_local_variable_internal(index)));
					memoization_state.caching_state_put(caching_state, index, results, UNPROVIDED);
				}
				return memoization_state.caching_results(results);
			}
		}
	}

	public static SubLObject java_backend_clet_bind_local_variable(final SubLObject index) {
		SubLObject caching_state = $java_backend_clet_bind_local_variable_caching_state$.getGlobalValue();
		if (NIL == caching_state) {
			caching_state = memoization_state.create_global_caching_state_for_name(JAVA_BACKEND_CLET_BIND_LOCAL_VARIABLE, $java_backend_clet_bind_local_variable_caching_state$, NIL, EQ, ONE_INTEGER, ZERO_INTEGER);
		}
		SubLObject results = memoization_state.caching_state_lookup(caching_state, index, memoization_state.$memoized_item_not_found$.getGlobalValue());
		if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			results = arg2(resetMultipleValues(), multiple_value_list(java_backend_clet_bind_local_variable_internal(index)));
			memoization_state.caching_state_put(caching_state, index, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	}

	public static final SubLObject java_backend_write_clet_local_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject datum = form;
				SubLObject current = datum;
				SubLObject operator = NIL;
				SubLObject v_bindings = NIL;
				destructuring_bind_must_consp(current, datum, $list_alt135);
				operator = current.first();
				current = current.rest();
				destructuring_bind_must_consp(current, datum, $list_alt135);
				v_bindings = current.first();
				current = current.rest();
				{
					SubLObject body = current;
					list_utilities.verify_operator(operator, CLET_LOCAL);
					{
						SubLObject locals = NIL;
						SubLObject cdolist_list_var = v_bindings;
						SubLObject binding = NIL;
						for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), binding = cdolist_list_var.first()) {
							{
								SubLObject datum_12 = binding;
								SubLObject current_13 = datum_12;
								SubLObject variable = NIL;
								SubLObject initialization = NIL;
								destructuring_bind_must_consp(current_13, datum_12, $list_alt137);
								variable = current_13.first();
								current_13 = current_13.rest();
								destructuring_bind_must_consp(current_13, datum_12, $list_alt137);
								initialization = current_13.first();
								current_13 = current_13.rest();
								if (NIL == current_13) {
									locals = cons(list($sym129$_LOCAL, variable, initialization), locals);
								} else {
									cdestructuring_bind_error(datum_12, $list_alt137);
								}
							}
						}
						{
							SubLObject _prev_bind_0 = $java_backend_previous_local_variable_scope$.currentBinding(thread);
							SubLObject _prev_bind_1 = $java_backend_current_local_variable_scope$.currentBinding(thread);
							try {
								$java_backend_previous_local_variable_scope$.bind($java_backend_current_local_variable_scope$.getDynamicValue(thread), thread);
								$java_backend_current_local_variable_scope$.bind($java_backend_current_local_variable_scope$.getDynamicValue(thread), thread);
								com.cyc.cycjava.cycl.java_backend.java_backend_write_progn(bq_cons(PROGN, append(nreverse(locals), body, NIL)), stream, depth);
							} finally {
								$java_backend_current_local_variable_scope$.rebind(_prev_bind_1, thread);
								$java_backend_previous_local_variable_scope$.rebind(_prev_bind_0, thread);
							}
						}
						return NIL;
					}
				}
			}
		}
	}

	public static SubLObject java_backend_write_clet_local(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject operator = NIL;
		SubLObject v_bindings = NIL;
		destructuring_bind_must_consp(form, form, $list178);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list178);
		v_bindings = current.first();
		final SubLObject body;
		current = body = current.rest();
		list_utilities.verify_operator(operator, CLET_LOCAL);
		SubLObject locals = NIL;
		SubLObject cdolist_list_var = v_bindings;
		SubLObject binding = NIL;
		binding = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject current_$17;
			final SubLObject datum_$16 = current_$17 = binding;
			SubLObject variable = NIL;
			SubLObject initialization = NIL;
			destructuring_bind_must_consp(current_$17, datum_$16, $list180);
			variable = current_$17.first();
			current_$17 = current_$17.rest();
			destructuring_bind_must_consp(current_$17, datum_$16, $list180);
			initialization = current_$17.first();
			current_$17 = current_$17.rest();
			if (NIL == current_$17) {
				locals = cons(list($sym172$_LOCAL, variable, initialization), locals);
			} else {
				cdestructuring_bind_error(datum_$16, $list180);
			}
			cdolist_list_var = cdolist_list_var.rest();
			binding = cdolist_list_var.first();
		}
		final SubLObject _prev_bind_0 = $java_backend_previous_local_variable_scope$.currentBinding(thread);
		final SubLObject _prev_bind_2 = $java_backend_current_local_variable_scope$.currentBinding(thread);
		try {
			$java_backend_previous_local_variable_scope$.bind($java_backend_current_local_variable_scope$.getDynamicValue(thread), thread);
			$java_backend_current_local_variable_scope$.bind($java_backend_current_local_variable_scope$.getDynamicValue(thread), thread);
			java_backend_write_progn(bq_cons(PROGN, append(nreverse(locals), body, NIL)), stream, depth);
		} finally {
			$java_backend_current_local_variable_scope$.rebind(_prev_bind_2, thread);
			$java_backend_previous_local_variable_scope$.rebind(_prev_bind_0, thread);
		}
		return NIL;
	}

	public static final SubLObject java_backend_write_code_comment_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		return c_backend.c_backend_write_code_comment(form, stream, depth);
	}

	public static SubLObject java_backend_write_code_comment(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		return c_backend.c_backend_write_code_comment(form, stream, depth);
	}

	public static final SubLObject java_backend_write_Xcprogv_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt145);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt145);
			{
				SubLObject temp = current.rest();
				current = current.first();
				{
					SubLObject dynamic_vars = NIL;
					SubLObject v_bindings = NIL;
					SubLObject internal_var = NIL;
					destructuring_bind_must_consp(current, datum, $list_alt145);
					dynamic_vars = current.first();
					current = current.rest();
					destructuring_bind_must_consp(current, datum, $list_alt145);
					v_bindings = current.first();
					current = current.rest();
					destructuring_bind_must_consp(current, datum, $list_alt145);
					internal_var = current.first();
					current = current.rest();
					if (NIL == current) {
						current = temp;
						{
							SubLObject body = current;
							list_utilities.verify_operator(operator, $sym146$_CPROGV);
							{
								SubLObject old_values = $sym147$OLD_VALUES;
								return com.cyc.cycjava.cycl.java_backend.java_backend_write_clet_local(
										list(CLET_LOCAL, list(list(internal_var, dynamic_vars)), listS($sym129$_LOCAL, old_values, list($sym148$_EXTRACT_DYNAMIC_VALUES, internal_var), $list_alt149), list($sym122$_TRY, listS(PROGN, list($sym150$_BIND_DYNAMIC_VARS, internal_var, v_bindings), append(body, NIL)), NIL, list($sym151$_REBIND_DYNAMIC_VARS, internal_var, old_values))), stream, depth);
							}
						}
					} else {
						cdestructuring_bind_error(datum, $list_alt145);
					}
				}
			}
		}
		return NIL;
	}

	public static SubLObject java_backend_write_Xcprogv(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		destructuring_bind_must_consp(form, form, $list188);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list188);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject dynamic_vars = NIL;
		SubLObject v_bindings = NIL;
		SubLObject internal_var = NIL;
		destructuring_bind_must_consp(current, form, $list188);
		dynamic_vars = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list188);
		v_bindings = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list188);
		internal_var = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			list_utilities.verify_operator(operator, $sym189$_CPROGV);
			final SubLObject old_values = $sym190$OLD_VALUES;
			return java_backend_write_clet_local(list(CLET_LOCAL, list(list(internal_var, dynamic_vars)), listS($sym172$_LOCAL, old_values, list($sym191$_EXTRACT_DYNAMIC_VALUES, internal_var), $list192), list($sym162$_TRY, listS(PROGN, list($sym193$_BIND_DYNAMIC_VARS, internal_var, v_bindings), append(body, NIL)), NIL, list($sym194$_REBIND_DYNAMIC_VARS, internal_var, old_values))), stream, depth);
		}
		cdestructuring_bind_error(form, $list188);
		return NIL;
	}

	public static final SubLObject java_backend_write_csetq_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			SubLObject variable = NIL;
			SubLObject value = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt152);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt152);
			variable = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt152);
			value = current.first();
			current = current.rest();
			if (NIL == current) {
				list_utilities.verify_operator(operator, CSETQ);
				{
					SubLObject pcase_var = com.cyc.cycjava.cycl.java_backend.java_backend_variable_binding_type(variable);
					if (pcase_var.eql($LOCAL)) {
						return com.cyc.cycjava.cycl.java_backend.java_backend_write_csetq_local(list(CSETQ_LOCAL, variable, value), stream, depth);
					} else {
						if (pcase_var.eql($DYNAMIC)) {
							return com.cyc.cycjava.cycl.java_backend.java_backend_write_csetq_dynamic(list(CSETQ_DYNAMIC, variable, value), stream, depth);
						} else {
							if (pcase_var.eql($LEXICAL)) {
								return com.cyc.cycjava.cycl.java_backend.java_backend_write_csetq_lexical(list(CSETQ_LEXICAL, variable, value), stream, depth);
							} else {
								if (pcase_var.eql($CONSTANT)) {
									return Errors.error($str_alt156$The_constant_variable__S_cannot_b, variable);
								} else {
									return Errors.error($str_alt157$Unexpected_variable__S, variable);
								}
							}
						}
					}
				}
			} else {
				cdestructuring_bind_error(datum, $list_alt152);
			}
		}
		return NIL;
	}

	public static SubLObject java_backend_write_csetq(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		SubLObject variable = NIL;
		SubLObject value = NIL;
		destructuring_bind_must_consp(form, form, $list195);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list195);
		variable = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list195);
		value = current.first();
		current = current.rest();
		if (NIL != current) {
			cdestructuring_bind_error(form, $list195);
			return NIL;
		}
		list_utilities.verify_operator(operator, CSETQ);
		final SubLObject pcase_var = java_backend_variable_binding_type(variable);
		if (pcase_var.eql($LOCAL)) {
			return java_backend_write_csetq_local(list(CSETQ_LOCAL, variable, value), stream, depth);
		}
		if (pcase_var.eql($DYNAMIC)) {
			return java_backend_write_csetq_dynamic(list(CSETQ_DYNAMIC, variable, value), stream, depth);
		}
		if (pcase_var.eql($LEXICAL)) {
			return java_backend_write_csetq_lexical(list(CSETQ_LEXICAL, variable, value), stream, depth);
		}
		if (pcase_var.eql($CONSTANT)) {
			return Errors.error($str199$The_constant_variable__S_cannot_b, variable);
		}
		return Errors.error($str200$Unexpected_variable__S, variable);
	}

	public static final SubLObject java_backend_write_csetq_dynamic_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			SubLObject variable = NIL;
			SubLObject value = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt152);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt152);
			variable = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt152);
			value = current.first();
			current = current.rest();
			if (NIL == current) {
				list_utilities.verify_operator(operator, CSETQ_DYNAMIC);
				com.cyc.cycjava.cycl.java_backend.java_backend_write_form(list($sym158$_SET_DYN, variable, value), stream, depth);
			} else {
				cdestructuring_bind_error(datum, $list_alt152);
			}
		}
		return T;
	}

	public static SubLObject java_backend_write_csetq_dynamic(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		SubLObject variable = NIL;
		SubLObject value = NIL;
		destructuring_bind_must_consp(form, form, $list195);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list195);
		variable = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list195);
		value = current.first();
		current = current.rest();
		if (NIL == current) {
			list_utilities.verify_operator(operator, CSETQ_DYNAMIC);
			java_backend_write_form(list($sym201$_SET_DYN, variable, value), stream, depth);
		} else {
			cdestructuring_bind_error(form, $list195);
		}
		return T;
	}

	public static final SubLObject java_backend_write_csetq_lexical_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			SubLObject variable = NIL;
			SubLObject value = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt152);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt152);
			variable = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt152);
			value = current.first();
			current = current.rest();
			if (NIL == current) {
				list_utilities.verify_operator(operator, CSETQ_LEXICAL);
				com.cyc.cycjava.cycl.java_backend.java_backend_write_form(list($sym159$_SET_LEX, variable, value), stream, depth);
			} else {
				cdestructuring_bind_error(datum, $list_alt152);
			}
		}
		return T;
	}

	public static SubLObject java_backend_write_csetq_lexical(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		SubLObject variable = NIL;
		SubLObject value = NIL;
		destructuring_bind_must_consp(form, form, $list195);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list195);
		variable = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list195);
		value = current.first();
		current = current.rest();
		if (NIL == current) {
			list_utilities.verify_operator(operator, CSETQ_LEXICAL);
			java_backend_write_form(list($sym202$_SET_LEX, variable, value), stream, depth);
		} else {
			cdestructuring_bind_error(form, $list195);
		}
		return T;
	}

	public static final SubLObject java_backend_write_csetq_local_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			SubLObject variable = NIL;
			SubLObject value = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt152);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt152);
			variable = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt152);
			value = current.first();
			current = current.rest();
			if (NIL == current) {
				list_utilities.verify_operator(operator, CSETQ_LOCAL);
				com.cyc.cycjava.cycl.java_backend.java_backend_write_form(variable, stream, number_utilities.f_1X(depth));
				com.cyc.cycjava.cycl.java_backend.java_backend_write_assignment_operator(stream);
				com.cyc.cycjava.cycl.java_backend.java_backend_write_form(value, stream, number_utilities.f_1X(depth));
			} else {
				cdestructuring_bind_error(datum, $list_alt152);
			}
		}
		return T;
	}

	public static SubLObject java_backend_write_csetq_local(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		SubLObject variable = NIL;
		SubLObject value = NIL;
		destructuring_bind_must_consp(form, form, $list195);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list195);
		variable = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list195);
		value = current.first();
		current = current.rest();
		if (NIL == current) {
			list_utilities.verify_operator(operator, CSETQ_LOCAL);
			java_backend_write_form(variable, stream, number_utilities.f_1X(depth));
			java_backend_write_assignment_operator(stream);
			java_backend_write_form(value, stream, number_utilities.f_1X(depth));
		} else {
			cdestructuring_bind_error(form, $list195);
		}
		return T;
	}

	public static final SubLObject java_backend_write_assignment_operator_alt(SubLObject stream) {
		return c_backend.c_backend_write_assignment_operator(stream);
	}

	public static SubLObject java_backend_write_assignment_operator(final SubLObject stream) {
		return c_backend.c_backend_write_assignment_operator(stream);
	}

	public static final SubLObject java_backend_write_Xcunwind_protect_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			SubLObject env_var = NIL;
			SubLObject protected_form = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt160);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt160);
			env_var = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt160);
			protected_form = current.first();
			current = current.rest();
			{
				SubLObject body = current;
				list_utilities.verify_operator(operator, $sym161$_CUNWIND_PROTECT);
				{
					SubLObject finally_body = com.cyc.cycjava.cycl.java_backend.java_backend_compute_finally_body(body);
					return com.cyc.cycjava.cycl.java_backend.java_backend_write_Xtry(listS($sym122$_TRY, protected_form, NIL, append(finally_body, NIL)), stream, depth);
				}
			}
		}
	}

	public static SubLObject java_backend_write_Xcunwind_protect(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		SubLObject env_var = NIL;
		SubLObject protected_form = NIL;
		destructuring_bind_must_consp(form, form, $list203);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list203);
		env_var = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list203);
		protected_form = current.first();
		final SubLObject body;
		current = body = current.rest();
		list_utilities.verify_operator(operator, $sym204$_CUNWIND_PROTECT);
		final SubLObject finally_body = java_backend_compute_finally_body(body);
		return java_backend_write_Xtry(listS($sym162$_TRY, protected_form, NIL, append(finally_body, NIL)), stream, depth);
	}

	public static final SubLObject java_backend_compute_finally_body_alt(SubLObject body) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL != pattern_match.tree_matches_pattern(body, $list_alt162)) {
				return body;
			}
			return list(listS(CLET_BIND, $list_alt163, append(body, NIL)));
		}
	}

	public static SubLObject java_backend_compute_finally_body(final SubLObject body) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != pattern_match.tree_matches_pattern(body, $list205)) {
			return body;
		}
		final SubLObject extended_body = append(body, $list206);
		thread.resetMultipleValues();
		SubLObject optimized_extended_body = common_optimization.translator_unreachable_optimize_body(extended_body);
		final SubLObject returnP = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL == returnP) {
			optimized_extended_body = list(listS(CLET_LOCAL, $list207, append(optimized_extended_body, NIL)));
		}
		final SubLObject finally_body = list(listS(CLET_BIND, $list208, append(optimized_extended_body, NIL)));
		return finally_body;
	}

	public static final SubLObject java_backend_uninterruptible_method_p_alt(SubLObject operator) {
		return list_utilities.member_eqP(operator, $java_backend_uninterruptible_methods$.getGlobalValue());
	}

	public static SubLObject java_backend_uninterruptible_method_p(final SubLObject operator) {
		return list_utilities.member_eqP(operator, $java_backend_uninterruptible_methods$.getGlobalValue());
	}

	public static final SubLObject java_backend_write_cvs_id_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			SubLObject id_string = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt165);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt165);
			id_string = current.first();
			current = current.rest();
			if (NIL == current) {
				list_utilities.verify_operator(operator, CVS_ID);
				write_string($str_alt167$___CVS_ID_, stream, UNPROVIDED, UNPROVIDED);
				if (NIL == system_translation.current_system_translation_secureP()) {
					com.cyc.cycjava.cycl.java_backend.java_backend_write_form(string_utilities.substring(id_string, ONE_INTEGER, number_utilities.f_1_(length(id_string))), stream, number_utilities.f_1X(depth));
				}
				write_string($str_alt95$_, stream, UNPROVIDED, UNPROVIDED);
			} else {
				cdestructuring_bind_error(datum, $list_alt165);
			}
		}
		return T;
	}

	public static SubLObject java_backend_write_cvs_id(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		SubLObject id_string = NIL;
		destructuring_bind_must_consp(form, form, $list210);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list210);
		id_string = current.first();
		current = current.rest();
		if (NIL == current) {
			list_utilities.verify_operator(operator, CVS_ID);
			write_string($str212$___CVS_ID_, stream, UNPROVIDED, UNPROVIDED);
			if (NIL == system_translation.current_system_translation_secureP()) {
				java_backend_write_form(string_utilities.substring(id_string, ONE_INTEGER, number_utilities.f_1_(length(id_string))), stream, number_utilities.f_1X(depth));
			}
			write_string($str132$_, stream, UNPROVIDED, UNPROVIDED);
		} else {
			cdestructuring_bind_error(form, $list210);
		}
		return T;
	}

	public static final SubLObject java_backend_write_defconstant_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		if (depth == UNPROVIDED) {
			depth = NIL;
		}
		{
			SubLObject operator = form.first();
			list_utilities.verify_operator(operator, DEFCONSTANT);
			return com.cyc.cycjava.cycl.java_backend.java_backend_write_global(form, stream, depth);
		}
	}

	public static SubLObject java_backend_write_defconstant(final SubLObject form, final SubLObject stream, SubLObject depth) {
		if (depth == UNPROVIDED) {
			depth = NIL;
		}
		final SubLObject operator = form.first();
		list_utilities.verify_operator(operator, DEFCONSTANT);
		return java_backend_write_global(form, stream, depth);
	}

	public static final SubLObject java_backend_write_global_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			SubLObject variable = NIL;
			SubLObject initialization = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt169);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt169);
			variable = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt169);
			initialization = current.first();
			current = current.rest();
			{
				SubLObject documentation = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
				destructuring_bind_must_listp(current, datum, $list_alt169);
				current = current.rest();
				if (NIL == current) {
					if (NIL != documentation) {
						com.cyc.cycjava.cycl.java_backend.java_backend_write_definer_comment(documentation, stream, depth);
					}
					com.cyc.cycjava.cycl.java_backend.java_backend_write_global_source_definition_annotation(variable, stream, depth);
					if (NIL != file_translation.current_ts_file_defined_private_global_p(variable)) {
						write_string($str_alt170$private_, stream, UNPROVIDED, UNPROVIDED);
					} else {
						write_string($str_alt171$public_, stream, UNPROVIDED, UNPROVIDED);
					}
					com.cyc.cycjava.cycl.java_backend.java_backend_write_static_member_type(stream);
					com.cyc.cycjava.cycl.java_backend.java_backend_write_global_data_type(stream);
					write_string($str_alt172$_, stream, UNPROVIDED, UNPROVIDED);
					com.cyc.cycjava.cycl.java_backend.java_backend_write_global_name(variable, stream);
					com.cyc.cycjava.cycl.java_backend.java_backend_write_assignment_operator(stream);
					com.cyc.cycjava.cycl.java_backend.java_backend_write_form($list_alt173, stream, number_utilities.f_1X(depth));
				} else {
					cdestructuring_bind_error(datum, $list_alt169);
				}
			}
		}
		return T;
	}

	public static SubLObject java_backend_write_global(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		SubLObject variable = NIL;
		SubLObject initialization = NIL;
		destructuring_bind_must_consp(form, form, $list214);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list214);
		variable = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list214);
		initialization = current.first();
		current = current.rest();
		final SubLObject documentation = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, form, $list214);
		current = current.rest();
		if (NIL == current) {
			if (NIL != documentation) {
				java_backend_write_definer_comment(documentation, stream, depth);
			}
			java_backend_write_global_source_definition_annotation(variable, stream, depth);
			if (NIL != file_translation.current_ts_file_defined_private_global_p(variable)) {
				write_string($$$private_, stream, UNPROVIDED, UNPROVIDED);
			} else {
				write_string($$$public_, stream, UNPROVIDED, UNPROVIDED);
			}
			java_backend_write_static_member_type(stream);
			java_backend_write_global_data_type(stream);
			write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
			java_backend_write_global_name(variable, stream);
			java_backend_write_assignment_operator(stream);
			java_backend_write_form($list218, stream, number_utilities.f_1X(depth));
		} else {
			cdestructuring_bind_error(form, $list214);
		}
		return T;
	}

	public static final SubLObject java_backend_write_define_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject datum = form;
				SubLObject current = datum;
				SubLObject operator = NIL;
				SubLObject name = NIL;
				SubLObject arglist = NIL;
				destructuring_bind_must_consp(current, datum, $list_alt174);
				operator = current.first();
				current = current.rest();
				destructuring_bind_must_consp(current, datum, $list_alt174);
				name = current.first();
				current = current.rest();
				destructuring_bind_must_consp(current, datum, $list_alt174);
				arglist = current.first();
				current = current.rest();
				{
					SubLObject body = current;
					list_utilities.verify_operator(operator, DEFINE);
					if (NIL != file_translation.current_ts_file()) {
						if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
							if (!depth.numE(ONE_INTEGER)) {
								Errors.error($str_alt175$_S_was_not_a_top_level_define, operator);
							}
						}
					}
					{
						SubLObject restart_tag = SKIP_FUNCTION;
						SubLObject dummy = NIL;
						{
							SubLObject _prev_bind_0 = Errors.$restarts$.currentBinding(thread);
							try {
								Errors.$restarts$.bind(cons(list(restart_tag, $str_alt177$Skip_function__S, name), Errors.$restarts$.getDynamicValue(thread)), thread);
								try {
									{
										SubLObject documentation = com.cyc.cycjava.cycl.java_backend.translator_extract_function_documentation(body);
										SubLObject body_statement = com.cyc.cycjava.cycl.java_backend.java_backend_compute_function_body_statement(name, arglist, body);
										if (NIL != documentation) {
											com.cyc.cycjava.cycl.java_backend.java_backend_write_definer_comment(documentation, stream, depth);
										}
										com.cyc.cycjava.cycl.java_backend.java_backend_write_method_source_definition_annotation(name, stream, depth);
										if (NIL != com.cyc.cycjava.cycl.java_backend.java_backend_initializer_method_p(name)) {
											write_string($str_alt170$private_, stream, UNPROVIDED, UNPROVIDED);
										} else {
											write_string($str_alt171$public_, stream, UNPROVIDED, UNPROVIDED);
										}
										com.cyc.cycjava.cycl.java_backend.java_backend_write_static_member_type(stream);
										com.cyc.cycjava.cycl.java_backend.java_backend_write_final_member_type(stream);
										{
											SubLObject _prev_bind_0_14 = $java_backend_previous_local_variable_scope$.currentBinding(thread);
											SubLObject _prev_bind_1 = $java_backend_current_local_variable_scope$.currentBinding(thread);
											try {
												$java_backend_previous_local_variable_scope$.bind($java_backend_current_local_variable_scope$.getDynamicValue(thread), thread);
												$java_backend_current_local_variable_scope$.bind($java_backend_current_local_variable_scope$.getDynamicValue(thread), thread);
												com.cyc.cycjava.cycl.java_backend.java_backend_write_function_declaration(stream, name, arglist, depth);
												write_string($str_alt172$_, stream, UNPROVIDED, UNPROVIDED);
												com.cyc.cycjava.cycl.java_backend.java_backend_write_form(body_statement, stream, depth);
											} finally {
												$java_backend_current_local_variable_scope$.rebind(_prev_bind_1, thread);
												$java_backend_previous_local_variable_scope$.rebind(_prev_bind_0_14, thread);
											}
										}
										if (NIL != $java_backend_funcall_optimization_enabledP$.getDynamicValue(thread)) {
											if (NIL != com.cyc.cycjava.cycl.java_backend.java_backend_likely_zero_arity_funcall_function_p(name)) {
												terpri(stream);
												com.cyc.cycjava.cycl.java_backend.java_backend_write_zero_arity_function_class(name, stream);
											}
											if (NIL != com.cyc.cycjava.cycl.java_backend.java_backend_likely_unary_funcall_function_p(name)) {
												terpri(stream);
												com.cyc.cycjava.cycl.java_backend.java_backend_write_unary_function_class(name, stream);
											}
											if (NIL != com.cyc.cycjava.cycl.java_backend.java_backend_likely_binary_funcall_function_p(name)) {
												terpri(stream);
												com.cyc.cycjava.cycl.java_backend.java_backend_write_binary_function_class(name, stream);
											}
										}
									}
								} catch (Throwable ccatch_env_var) {
									dummy = Errors.handleThrowable(ccatch_env_var, restart_tag);
								}
							} finally {
								Errors.$restarts$.rebind(_prev_bind_0, thread);
							}
						}
					}
				}
			}
			return NIL;
		}
	}

	public static SubLObject java_backend_write_define(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject operator = NIL;
		SubLObject name = NIL;
		SubLObject arglist = NIL;
		destructuring_bind_must_consp(form, form, $list219);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list219);
		name = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list219);
		arglist = current.first();
		final SubLObject body;
		current = body = current.rest();
		list_utilities.verify_operator(operator, DEFINE);
		if (((NIL != file_translation.current_ts_file()) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) && (!depth.numE(ONE_INTEGER))) {
			Errors.error($str220$_S_was_not_a_top_level_define, operator);
		}
		final SubLObject logging_flag = is_java_backend_method_covered_by_logging_levelP(name);
		final SubLObject _prev_bind_0 = $java_backend_logging_for_current_method$.currentBinding(thread);
		try {
			$java_backend_logging_for_current_method$.bind(NIL != logging_flag ? name : NIL, thread);
			final SubLObject restart_tag = SKIP_FUNCTION;
			SubLObject dummy = NIL;
			final SubLObject _prev_bind_0_$18 = Errors.$restarts$.currentBinding(thread);
			try {
				Errors.$restarts$.bind(cons(list(restart_tag, $str222$Skip_function__S, name), Errors.$restarts$.getDynamicValue(thread)), thread);
				try {
					thread.throwStack.push(restart_tag);
					final SubLObject documentation = translator_extract_function_documentation(body);
					final SubLObject body_statement = java_backend_compute_function_body_statement(name, arglist, body);
					if (NIL != documentation) {
						java_backend_write_definer_comment(documentation, stream, depth);
					}
					java_backend_write_method_source_definition_annotation(name, stream, depth);
					if (NIL != java_backend_initializer_method_p(name)) {
						write_string($$$private_, stream, UNPROVIDED, UNPROVIDED);
					} else {
						write_string($$$public_, stream, UNPROVIDED, UNPROVIDED);
					}
					java_backend_write_static_member_type(stream);
					final SubLObject _prev_bind_0_$19 = $java_backend_previous_local_variable_scope$.currentBinding(thread);
					final SubLObject _prev_bind_2 = $java_backend_current_local_variable_scope$.currentBinding(thread);
					try {
						$java_backend_previous_local_variable_scope$.bind($java_backend_current_local_variable_scope$.getDynamicValue(thread), thread);
						$java_backend_current_local_variable_scope$.bind($java_backend_current_local_variable_scope$.getDynamicValue(thread), thread);
						java_backend_write_function_declaration(stream, name, arglist, depth);
						write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
						java_backend_write_form(body_statement, stream, depth);
					} finally {
						$java_backend_current_local_variable_scope$.rebind(_prev_bind_2, thread);
						$java_backend_previous_local_variable_scope$.rebind(_prev_bind_0_$19, thread);
					}
					if (NIL != $java_backend_funcall_optimization_enabledP$.getDynamicValue(thread)) {
						if (NIL != java_backend_likely_zero_arity_funcall_function_p(name)) {
							terpri(stream);
							java_backend_write_zero_arity_function_class(name, stream);
						}
						if (NIL != java_backend_likely_unary_funcall_function_p(name)) {
							terpri(stream);
							java_backend_write_unary_function_class(name, stream);
						}
						if (NIL != java_backend_likely_binary_funcall_function_p(name)) {
							terpri(stream);
							java_backend_write_binary_function_class(name, stream);
						}
					}
				} catch (final Throwable ccatch_env_var) {
					dummy = Errors.handleThrowable(ccatch_env_var, restart_tag);
				} finally {
					thread.throwStack.pop();
				}
			} finally {
				Errors.$restarts$.rebind(_prev_bind_0_$18, thread);
			}
		} finally {
			$java_backend_logging_for_current_method$.rebind(_prev_bind_0, thread);
		}
		return NIL;
	}

	public static final SubLObject translator_extract_function_documentation_alt(SubLObject body) {
		{
			SubLObject datum = body;
			SubLObject current = datum;
			SubLObject documentation = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt178);
			documentation = current.first();
			current = current.rest();
			{
				SubLObject real_body = current;
				if (documentation.isString()) {
					return documentation;
				}
			}
		}
		return NIL;
	}

	public static SubLObject translator_extract_function_documentation(final SubLObject body) {
		SubLObject documentation = NIL;
		destructuring_bind_must_consp(body, body, $list223);
		documentation = body.first();
		final SubLObject real_body;
		final SubLObject current = real_body = body.rest();
		if (documentation.isString()) {
			return documentation;
		}
		return NIL;
	}

	public static final SubLObject java_backend_compute_function_body_statement_alt(SubLObject name, SubLObject arglist, SubLObject body) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject datum = body;
				SubLObject current = datum;
				SubLObject documentation = NIL;
				destructuring_bind_must_consp(current, datum, $list_alt178);
				documentation = current.first();
				current = current.rest();
				{
					SubLObject real_body = current;
					if (documentation.isString()) {
						body = real_body;
					}
				}
			}
			thread.resetMultipleValues();
			{
				SubLObject optimized_body = common_optimization.translator_unreachable_optimize_body(body);
				SubLObject returnP = thread.secondMultipleValue();
				thread.resetMultipleValues();
				if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
					if (NIL == returnP) {
						Errors.error($str_alt179$Method__S_does_not_return, name);
					}
				}
				thread.resetMultipleValues();
				{
					SubLObject optional_argument_initializations = com.cyc.cycjava.cycl.java_backend.java_backend_optional_argument_initializations(arglist);
					SubLObject provided_bindings = thread.secondMultipleValue();
					thread.resetMultipleValues();
					if (NIL != provided_bindings) {
						return listS(CLET_LOCAL, provided_bindings, append(optional_argument_initializations, optimized_body, NIL));
					} else {
						return bq_cons(PROGN, append(optional_argument_initializations, optimized_body, NIL));
					}
				}
			}
		}
	}

	public static SubLObject java_backend_compute_function_body_statement(final SubLObject name, final SubLObject arglist, SubLObject body) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject logging = (NIL != java_backend_current_method_needs_logging_p()) ? list(list($sym224$_LOG_ENTER, name, arglist)) : NIL;
		SubLObject current;
		final SubLObject datum = current = body;
		SubLObject documentation = NIL;
		destructuring_bind_must_consp(current, datum, $list223);
		documentation = current.first();
		final SubLObject real_body;
		current = real_body = current.rest();
		if (documentation.isString()) {
			body = real_body;
		}
		thread.resetMultipleValues();
		final SubLObject optimized_body = common_optimization.translator_unreachable_optimize_body(body);
		final SubLObject returnP = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == returnP)) {
			Errors.error($str225$Method__S_does_not_return, name);
		}
		thread.resetMultipleValues();
		final SubLObject optional_argument_initializations = java_backend_optional_argument_initializations(arglist);
		final SubLObject provided_bindings = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL != provided_bindings) {
			return listS(CLET_LOCAL, provided_bindings, append(optional_argument_initializations, logging, optimized_body, NIL));
		}
		return bq_cons(PROGN, append(optional_argument_initializations, logging, optimized_body, NIL));
	}

	public static final SubLObject java_backend_write_definer_comment_alt(SubLObject documentation, SubLObject stream, SubLObject depth) {
		if (NIL == system_translation.current_system_translation_secureP()) {
			write_string($str_alt180$____, stream, UNPROVIDED, UNPROVIDED);
			write_string(documentation, stream, UNPROVIDED, UNPROVIDED);
			write_string($str_alt8$___, stream, UNPROVIDED, UNPROVIDED);
			terpri(stream);
			com.cyc.cycjava.cycl.java_backend.java_backend_indent(stream, depth);
		}
		return NIL;
	}

	public static SubLObject java_backend_write_definer_comment(final SubLObject documentation, final SubLObject stream, final SubLObject depth) {
		if (NIL == system_translation.current_system_translation_secureP()) {
			write_string($str226$____, stream, UNPROVIDED, UNPROVIDED);
			write_string(documentation, stream, UNPROVIDED, UNPROVIDED);
			write_string($str42$___, stream, UNPROVIDED, UNPROVIDED);
			terpri(stream);
			java_backend_indent(stream, depth);
		}
		return NIL;
	}

	public static final SubLObject java_backend_write_method_source_definition_annotation_alt(SubLObject method, SubLObject stream, SubLObject depth) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == system_translation.current_system_translation_secureP()) {
				thread.resetMultipleValues();
				{
					SubLObject filename = xref_database.xref_method_source_definition_info(method);
					SubLObject position = thread.secondMultipleValue();
					thread.resetMultipleValues();
					if ((NIL != filename) && (NIL != position)) {
						return com.cyc.cycjava.cycl.java_backend.java_backend_write_source_definition_annotation(filename, position, stream, depth);
					}
				}
			}
			return NIL;
		}
	}

	public static SubLObject java_backend_write_method_source_definition_annotation(final SubLObject method, final SubLObject stream, final SubLObject depth) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL == system_translation.current_system_translation_secureP()) {
			thread.resetMultipleValues();
			final SubLObject filename = xref_database.xref_method_source_definition_info(method);
			final SubLObject position = thread.secondMultipleValue();
			thread.resetMultipleValues();
			if ((NIL != filename) && (NIL != position)) {
				return java_backend_write_source_definition_annotation(filename, position, stream, depth);
			}
		}
		return NIL;
	}

	public static final SubLObject java_backend_write_global_source_definition_annotation_alt(SubLObject global, SubLObject stream, SubLObject depth) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL == system_translation.current_system_translation_secureP()) {
				thread.resetMultipleValues();
				{
					SubLObject filename = xref_database.xref_global_source_definition_info(global);
					SubLObject position = thread.secondMultipleValue();
					thread.resetMultipleValues();
					if ((NIL != filename) && (NIL != position)) {
						return com.cyc.cycjava.cycl.java_backend.java_backend_write_source_definition_annotation(filename, position, stream, depth);
					}
				}
			}
			return NIL;
		}
	}

	public static SubLObject java_backend_write_global_source_definition_annotation(final SubLObject global, final SubLObject stream, final SubLObject depth) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL == system_translation.current_system_translation_secureP()) {
			thread.resetMultipleValues();
			final SubLObject filename = xref_database.xref_global_source_definition_info(global);
			final SubLObject position = thread.secondMultipleValue();
			thread.resetMultipleValues();
			if ((NIL != filename) && (NIL != position)) {
				return java_backend_write_source_definition_annotation(filename, position, stream, depth);
			}
		}
		return NIL;
	}

	public static final SubLObject java_backend_write_source_definition_annotation_alt(SubLObject filename, SubLObject position, SubLObject stream, SubLObject depth) {
		{
			SubLObject source_annotation = list($sym181$_ANNOTATION, $$$SubL, list(list($$$source, filename), list($$$position, position)));
			com.cyc.cycjava.cycl.java_backend.java_backend_write_form(source_annotation, stream, depth);
			terpri(stream);
			com.cyc.cycjava.cycl.java_backend.java_backend_indent(stream, depth);
		}
		return NIL;
	}

	public static SubLObject java_backend_write_source_definition_annotation(final SubLObject filename, SubLObject position, final SubLObject stream, final SubLObject depth) {
		final SubLObject source_annotation = list($sym227$_ANNOTATION, $$$SubL, list(list($$$source, filename), list($$$position, position)));
		java_backend_write_form(source_annotation, stream, depth);
		terpri(stream);
		java_backend_indent(stream, depth);
		return NIL;
	}

	public static final SubLObject java_backend_optional_argument_initializations_alt(SubLObject arglist) {
		return c_backend.c_backend_optional_argument_initializations(arglist);
	}

	public static SubLObject java_backend_optional_argument_initializations(final SubLObject arglist) {
		return c_backend.c_backend_optional_argument_initializations(arglist);
	}

	public static final SubLObject java_backend_private_method_p_alt(SubLObject method) {
		return makeBoolean(method.isSymbol() && ((NIL != file_translation.current_ts_file_defined_private_method_p(method)) || (NIL != file_translation.current_ts_file_initializerP(method))));
	}

	public static SubLObject java_backend_private_method_p(final SubLObject method) {
		return makeBoolean(method.isSymbol() && ((NIL != file_translation.current_ts_file_defined_private_method_p(method)) || (NIL != file_translation.current_ts_file_initializerP(method))));
	}

	public static final SubLObject java_backend_write_function_declaration_alt(SubLObject stream, SubLObject function, SubLObject arglist, SubLObject depth) {
		if (depth == UNPROVIDED) {
			depth = ZERO_INTEGER;
		}
		com.cyc.cycjava.cycl.java_backend.java_backend_write_object_data_type(stream);
		write_string($str_alt172$_, stream, UNPROVIDED, UNPROVIDED);
		com.cyc.cycjava.cycl.java_backend.java_backend_write_function_definition_name(function, stream);
		com.cyc.cycjava.cycl.java_backend.java_backend_write_function_arglist(arglist, stream, number_utilities.f_1X(depth));
		return NIL;
	}

	public static SubLObject java_backend_write_function_declaration(final SubLObject stream, final SubLObject function, final SubLObject arglist, SubLObject depth) {
		if (depth == UNPROVIDED) {
			depth = ZERO_INTEGER;
		}
		java_backend_write_object_data_type(stream);
		write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
		java_backend_write_function_definition_name(function, stream);
		java_backend_write_function_arglist(arglist, stream, number_utilities.f_1X(depth));
		return NIL;
	}

	public static final SubLObject java_backend_write_static_member_type_alt(SubLObject stream) {
		return write_string($str_alt185$static_, stream, UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject java_backend_write_static_member_type(final SubLObject stream) {
		return write_string($$$static_, stream, UNPROVIDED, UNPROVIDED);
	}

	public static final SubLObject java_backend_write_final_member_type_alt(SubLObject stream) {
		return write_string($str_alt186$final_, stream, UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject java_backend_write_final_member_type(final SubLObject stream) {
		return write_string($$$final_, stream, UNPROVIDED, UNPROVIDED);
	}

	public static final SubLObject java_backend_write_object_data_type_alt(SubLObject stream) {
		return write_string($java_backend_object_data_type$.getGlobalValue(), stream, UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject java_backend_write_object_data_type(final SubLObject stream) {
		return write_string($java_backend_object_data_type$.getGlobalValue(), stream, UNPROVIDED, UNPROVIDED);
	}

	public static final SubLObject java_backend_write_global_data_type_alt(SubLObject stream) {
		return write_string($$$SubLSymbol, stream, UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject java_backend_write_global_data_type(final SubLObject stream) {
		return write_string($$$SubLSymbol, stream, UNPROVIDED, UNPROVIDED);
	}

	public static final SubLObject java_backend_write_function_arglist_alt(SubLObject arglist, SubLObject stream, SubLObject depth) {
		if (NIL == arglist) {
			write_string($str_alt188$__, stream, UNPROVIDED, UNPROVIDED);
			return NIL;
		}
		write_string($str_alt93$_, stream, UNPROVIDED, UNPROVIDED);
		{
			SubLObject processed_args = ZERO_INTEGER;
			SubLObject list_var = NIL;
			SubLObject arg = NIL;
			SubLObject argnum = NIL;
			for (list_var = arglist, arg = list_var.first(), argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), arg = list_var.first(), argnum = add(ONE_INTEGER, argnum)) {
				if (arg != $sym189$_OPTIONAL) {
					if (!processed_args.isZero()) {
						com.cyc.cycjava.cycl.java_backend.java_backend_write_function_argument_separator(stream);
					}
					com.cyc.cycjava.cycl.java_backend.java_backend_write_object_data_type(stream);
					write_string($str_alt172$_, stream, UNPROVIDED, UNPROVIDED);
					com.cyc.cycjava.cycl.java_backend.java_backend_write_function_arglist_arg(arg, stream);
					processed_args = add(processed_args, ONE_INTEGER);
				}
			}
		}
		write_string($str_alt95$_, stream, UNPROVIDED, UNPROVIDED);
		return NIL;
	}

	public static SubLObject java_backend_write_function_arglist(final SubLObject arglist, final SubLObject stream, final SubLObject depth) {
		if (NIL == arglist) {
			write_string($str233$__, stream, UNPROVIDED, UNPROVIDED);
			return NIL;
		}
		write_string($str130$_, stream, UNPROVIDED, UNPROVIDED);
		SubLObject processed_args = ZERO_INTEGER;
		SubLObject list_var = NIL;
		SubLObject arg = NIL;
		SubLObject argnum = NIL;
		list_var = arglist;
		arg = list_var.first();
		for (argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), arg = list_var.first(), argnum = add(ONE_INTEGER, argnum)) {
			if (arg != $sym27$_OPTIONAL) {
				if (!processed_args.isZero()) {
					java_backend_write_function_argument_separator(stream);
				}
				java_backend_write_object_data_type(stream);
				write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
				java_backend_write_function_arglist_arg(arg, stream);
				processed_args = add(processed_args, ONE_INTEGER);
			}
		}
		write_string($str132$_, stream, UNPROVIDED, UNPROVIDED);
		return NIL;
	}

	public static final SubLObject java_backend_write_function_argument_separator_alt(SubLObject stream) {
		return c_backend.c_backend_write_function_argument_separator(stream);
	}

	public static SubLObject java_backend_write_function_argument_separator(final SubLObject stream) {
		return c_backend.c_backend_write_function_argument_separator(stream);
	}

	public static final SubLObject java_backend_write_function_arglist_arg_alt(SubLObject arg, SubLObject stream) {
		{
			SubLObject variable = c_backend.translator_arglist_arg_variable(arg);
			com.cyc.cycjava.cycl.java_backend.java_backend_add_local_variable_to_scope(variable);
			return com.cyc.cycjava.cycl.java_backend.java_backend_write_form(variable, stream, UNPROVIDED);
		}
	}

	public static SubLObject java_backend_write_function_arglist_arg(final SubLObject arg, final SubLObject stream) {
		final SubLObject variable = c_backend.translator_arglist_arg_variable(arg);
		java_backend_add_local_variable_to_scope(variable);
		return java_backend_write_form(variable, stream, UNPROVIDED);
	}

	public static final SubLObject java_backend_write_define_macroexpander_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			SubLObject name = NIL;
			SubLObject arglist = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt174);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt174);
			name = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt174);
			arglist = current.first();
			current = current.rest();
			{
				SubLObject body = current;
				list_utilities.verify_operator(operator, DEFINE_MACROEXPANDER);
				return com.cyc.cycjava.cycl.java_backend.java_backend_write_define(listS(DEFINE, name, arglist, append(body, NIL)), stream, depth);
			}
		}
	}

	public static SubLObject java_backend_write_define_macroexpander(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		SubLObject name = NIL;
		SubLObject arglist = NIL;
		destructuring_bind_must_consp(form, form, $list219);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list219);
		name = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list219);
		arglist = current.first();
		final SubLObject body;
		current = body = current.rest();
		list_utilities.verify_operator(operator, DEFINE_MACROEXPANDER);
		return java_backend_write_define(listS(DEFINE, name, arglist, append(body, NIL)), stream, depth);
	}

	public static final SubLObject java_backend_write_deflexical_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject operator = form.first();
			list_utilities.verify_operator(operator, DEFLEXICAL);
			return com.cyc.cycjava.cycl.java_backend.java_backend_write_global(form, stream, depth);
		}
	}

	public static SubLObject java_backend_write_deflexical(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		final SubLObject operator = form.first();
		list_utilities.verify_operator(operator, DEFLEXICAL);
		return java_backend_write_global(form, stream, depth);
	}

	public static final SubLObject java_backend_write_defparameter_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject operator = form.first();
			list_utilities.verify_operator(operator, DEFPARAMETER);
			return com.cyc.cycjava.cycl.java_backend.java_backend_write_global(form, stream, depth);
		}
	}

	public static SubLObject java_backend_write_defparameter(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		final SubLObject operator = form.first();
		list_utilities.verify_operator(operator, DEFPARAMETER);
		return java_backend_write_global(form, stream, depth);
	}

	public static final SubLObject java_backend_write_Xdefstruct_class_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt193);
			operator = current.first();
			current = current.rest();
			{
				SubLObject analysis = current;
				list_utilities.verify_operator(operator, $sym194$_DEFSTRUCT_CLASS);
				{
					SubLObject datum_15 = analysis;
					SubLObject current_16 = datum_15;
					SubLObject name_tail = property_list_member($NAME, current_16);
					SubLObject name = (NIL != name_tail) ? ((SubLObject) (cadr(name_tail))) : NIL;
					SubLObject slots_tail = property_list_member($SLOTS, current_16);
					SubLObject v_slots = (NIL != slots_tail) ? ((SubLObject) (cadr(slots_tail))) : NIL;
					SubLObject defstruct_class_name = com.cyc.cycjava.cycl.java_backend.java_backend_defstruct_class_name(name);
					format(stream, $str_alt197$public_static_final_class__A_exte, defstruct_class_name);
					com.cyc.cycjava.cycl.java_backend.java_backend_indent(stream, number_utilities.f_1X(depth));
					format(stream, $str_alt198$public_SubLStructDecl_getStructDe);
					{
						SubLObject index = TWO_INTEGER;
						SubLObject cdolist_list_var = v_slots;
						SubLObject slot = NIL;
						for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), slot = cdolist_list_var.first()) {
							{
								SubLObject defstruct_slot_name = com.cyc.cycjava.cycl.java_backend.java_backend_defstruct_slot_name(slot);
								com.cyc.cycjava.cycl.java_backend.java_backend_indent(stream, number_utilities.f_1X(depth));
								format(stream, $str_alt199$public_SubLObject_getField_A_____, index, defstruct_slot_name);
								index = add(index, ONE_INTEGER);
							}
						}
					}
					{
						SubLObject index = TWO_INTEGER;
						SubLObject cdolist_list_var = v_slots;
						SubLObject slot = NIL;
						for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), slot = cdolist_list_var.first()) {
							{
								SubLObject defstruct_slot_name = com.cyc.cycjava.cycl.java_backend.java_backend_defstruct_slot_name(slot);
								com.cyc.cycjava.cycl.java_backend.java_backend_indent(stream, number_utilities.f_1X(depth));
								format(stream, $str_alt200$public_SubLObject_setField_A_SubL, index, defstruct_slot_name);
								index = add(index, ONE_INTEGER);
							}
						}
					}
					{
						SubLObject cdolist_list_var = v_slots;
						SubLObject slot = NIL;
						for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), slot = cdolist_list_var.first()) {
							{
								SubLObject defstruct_slot_name = com.cyc.cycjava.cycl.java_backend.java_backend_defstruct_slot_name(slot);
								com.cyc.cycjava.cycl.java_backend.java_backend_indent(stream, number_utilities.f_1X(depth));
								format(stream, $str_alt201$public_SubLObject__A___NIL___, defstruct_slot_name);
							}
						}
					}
					com.cyc.cycjava.cycl.java_backend.java_backend_indent(stream, number_utilities.f_1X(depth));
					format(stream, $str_alt202$private_static_final_SubLStructDe);
					com.cyc.cycjava.cycl.java_backend.java_backend_write_struct_decl_initializer(analysis, stream, number_utilities.f_1X(depth));
					format(stream, $str_alt203$___);
					com.cyc.cycjava.cycl.java_backend.java_backend_indent(stream, depth);
					write_string($str_alt45$_, stream, UNPROVIDED, UNPROVIDED);
				}
			}
		}
		return NIL;
	}

	public static SubLObject java_backend_write_Xdefstruct_class(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		destructuring_bind_must_consp(form, form, $list237);
		operator = form.first();
		final SubLObject analysis;
		final SubLObject current = analysis = form.rest();
		list_utilities.verify_operator(operator, $sym238$_DEFSTRUCT_CLASS);
		final SubLObject current_$21;
		final SubLObject datum_$20 = current_$21 = analysis;
		final SubLObject name_tail = property_list_member($NAME, current_$21);
		final SubLObject name = (NIL != name_tail) ? cadr(name_tail) : NIL;
		final SubLObject slots_tail = property_list_member($SLOTS, current_$21);
		final SubLObject v_slots = (NIL != slots_tail) ? cadr(slots_tail) : NIL;
		final SubLObject defstruct_class_name = java_backend_defstruct_class_name(name);
		format(stream, $str241$public_static_final_class__A_exte, defstruct_class_name);
		java_backend_indent(stream, number_utilities.f_1X(depth));
		format(stream, $str242$_Override_public_SubLStructDecl_g);
		SubLObject index = TWO_INTEGER;
		SubLObject cdolist_list_var = v_slots;
		SubLObject slot = NIL;
		slot = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			final SubLObject defstruct_slot_name = java_backend_defstruct_slot_name(slot);
			java_backend_indent(stream, number_utilities.f_1X(depth));
			if (index.numL($java_backend_defstruct_override_limit$.getGlobalValue())) {
				write_string($str243$_Override_, stream, UNPROVIDED, UNPROVIDED);
			}
			format(stream, $str244$public_SubLObject_getField_A_____, index, defstruct_slot_name);
			index = add(index, ONE_INTEGER);
			cdolist_list_var = cdolist_list_var.rest();
			slot = cdolist_list_var.first();
		}
		index = TWO_INTEGER;
		cdolist_list_var = v_slots;
		slot = NIL;
		slot = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			final SubLObject defstruct_slot_name = java_backend_defstruct_slot_name(slot);
			java_backend_indent(stream, number_utilities.f_1X(depth));
			if (index.numL($java_backend_defstruct_override_limit$.getGlobalValue())) {
				write_string($str243$_Override_, stream, UNPROVIDED, UNPROVIDED);
			}
			format(stream, $str245$public_SubLObject_setField_A_SubL, index, defstruct_slot_name);
			index = add(index, ONE_INTEGER);
			cdolist_list_var = cdolist_list_var.rest();
			slot = cdolist_list_var.first();
		}
		SubLObject cdolist_list_var2 = v_slots;
		SubLObject slot2 = NIL;
		slot2 = cdolist_list_var2.first();
		while (NIL != cdolist_list_var2) {
			final SubLObject defstruct_slot_name2 = java_backend_defstruct_slot_name(slot2);
			java_backend_indent(stream, number_utilities.f_1X(depth));
			format(stream, $str246$public_SubLObject__A___NIL___, defstruct_slot_name2);
			cdolist_list_var2 = cdolist_list_var2.rest();
			slot2 = cdolist_list_var2.first();
		}
		java_backend_indent(stream, number_utilities.f_1X(depth));
		format(stream, $str247$private_static_final_SubLStructDe);
		java_backend_write_struct_decl_initializer(analysis, stream, number_utilities.f_1X(depth));
		format(stream, $str248$___);
		java_backend_indent(stream, depth);
		write_string($str81$_, stream, UNPROVIDED, UNPROVIDED);
		return NIL;
	}

	public static final SubLObject java_backend_defstruct_class_name_internal_alt(SubLObject defstruct_class) {
		{
			SubLObject name = system_translation.current_system_translation_secure_symbol_name(defstruct_class);
			SubLObject basis = java_name_translation.java_backend_convert_identifier_name(name);
			return cconcatenate($str_alt205$_, new SubLObject[] { format_nil.format_nil_a_no_copy(basis), $str_alt206$_native });
		}
	}

	public static SubLObject java_backend_defstruct_class_name_internal(final SubLObject defstruct_class) {
		final SubLObject name = system_translation.current_system_translation_secure_symbol_name(defstruct_class);
		final SubLObject basis = java_name_translation.java_backend_convert_identifier_name(name);
		return cconcatenate($str250$_, new SubLObject[] { format_nil.format_nil_a_no_copy(basis), $str251$_native });
	}

	public static final SubLObject java_backend_defstruct_class_name_alt(SubLObject defstruct_class) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return com.cyc.cycjava.cycl.java_backend.java_backend_defstruct_class_name_internal(defstruct_class);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, JAVA_BACKEND_DEFSTRUCT_CLASS_NAME, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), JAVA_BACKEND_DEFSTRUCT_CLASS_NAME, ONE_INTEGER, NIL, EQ, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, JAVA_BACKEND_DEFSTRUCT_CLASS_NAME, caching_state);
				}
				{
					SubLObject results = memoization_state.caching_state_lookup(caching_state, defstruct_class, $kw49$_MEMOIZED_ITEM_NOT_FOUND_);
					if (results == $kw49$_MEMOIZED_ITEM_NOT_FOUND_) {
						results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.java_backend.java_backend_defstruct_class_name_internal(defstruct_class)));
						memoization_state.caching_state_put(caching_state, defstruct_class, results, UNPROVIDED);
					}
					return memoization_state.caching_results(results);
				}
			}
		}
	}

	public static SubLObject java_backend_defstruct_class_name(final SubLObject defstruct_class) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return java_backend_defstruct_class_name_internal(defstruct_class);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, JAVA_BACKEND_DEFSTRUCT_CLASS_NAME, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), JAVA_BACKEND_DEFSTRUCT_CLASS_NAME, ONE_INTEGER, NIL, EQ, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, JAVA_BACKEND_DEFSTRUCT_CLASS_NAME, caching_state);
		}
		SubLObject results = memoization_state.caching_state_lookup(caching_state, defstruct_class, memoization_state.$memoized_item_not_found$.getGlobalValue());
		if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			results = arg2(thread.resetMultipleValues(), multiple_value_list(java_backend_defstruct_class_name_internal(defstruct_class)));
			memoization_state.caching_state_put(caching_state, defstruct_class, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	}

	public static final SubLObject java_backend_defstruct_slot_name_internal_alt(SubLObject slot) {
		{
			SubLObject basis = java_name_translation.java_backend_symbol_name_basis(slot);
			return cconcatenate($str_alt205$_, format_nil.format_nil_a_no_copy(basis));
		}
	}

	public static SubLObject java_backend_defstruct_slot_name_internal(final SubLObject slot) {
		final SubLObject basis = java_name_translation.java_backend_symbol_name_basis(slot);
		return cconcatenate($str250$_, format_nil.format_nil_a_no_copy(basis));
	}

	public static final SubLObject java_backend_defstruct_slot_name_alt(SubLObject slot) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return com.cyc.cycjava.cycl.java_backend.java_backend_defstruct_slot_name_internal(slot);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, JAVA_BACKEND_DEFSTRUCT_SLOT_NAME, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), JAVA_BACKEND_DEFSTRUCT_SLOT_NAME, ONE_INTEGER, NIL, EQ, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, JAVA_BACKEND_DEFSTRUCT_SLOT_NAME, caching_state);
				}
				{
					SubLObject results = memoization_state.caching_state_lookup(caching_state, slot, $kw49$_MEMOIZED_ITEM_NOT_FOUND_);
					if (results == $kw49$_MEMOIZED_ITEM_NOT_FOUND_) {
						results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.java_backend.java_backend_defstruct_slot_name_internal(slot)));
						memoization_state.caching_state_put(caching_state, slot, results, UNPROVIDED);
					}
					return memoization_state.caching_results(results);
				}
			}
		}
	}

	public static SubLObject java_backend_defstruct_slot_name(final SubLObject slot) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return java_backend_defstruct_slot_name_internal(slot);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, JAVA_BACKEND_DEFSTRUCT_SLOT_NAME, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), JAVA_BACKEND_DEFSTRUCT_SLOT_NAME, ONE_INTEGER, NIL, EQ, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, JAVA_BACKEND_DEFSTRUCT_SLOT_NAME, caching_state);
		}
		SubLObject results = memoization_state.caching_state_lookup(caching_state, slot, memoization_state.$memoized_item_not_found$.getGlobalValue());
		if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			results = arg2(thread.resetMultipleValues(), multiple_value_list(java_backend_defstruct_slot_name_internal(slot)));
			memoization_state.caching_state_put(caching_state, slot, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	}

	public static final SubLObject java_backend_write_struct_decl_initializer_alt(SubLObject analysis, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = analysis;
			SubLObject current = datum;
			SubLObject name_tail = property_list_member($NAME, current);
			SubLObject name = (NIL != name_tail) ? ((SubLObject) (cadr(name_tail))) : NIL;
			SubLObject predicate_tail = property_list_member($PREDICATE, current);
			SubLObject predicate = (NIL != predicate_tail) ? ((SubLObject) (cadr(predicate_tail))) : NIL;
			SubLObject slots_tail = property_list_member($SLOTS, current);
			SubLObject v_slots = (NIL != slots_tail) ? ((SubLObject) (cadr(slots_tail))) : NIL;
			SubLObject slot_keywords_tail = property_list_member($SLOT_KEYWORDS, current);
			SubLObject slot_keywords = (NIL != slot_keywords_tail) ? ((SubLObject) (cadr(slot_keywords_tail))) : NIL;
			SubLObject getters_tail = property_list_member($GETTERS, current);
			SubLObject getters = (NIL != getters_tail) ? ((SubLObject) (cadr(getters_tail))) : NIL;
			SubLObject setters_tail = property_list_member($SETTERS, current);
			SubLObject setters = (NIL != setters_tail) ? ((SubLObject) (cadr(setters_tail))) : NIL;
			SubLObject print_function_tail = property_list_member($PRINT_FUNCTION, current);
			SubLObject print_function = (NIL != print_function_tail) ? ((SubLObject) (cadr(print_function_tail))) : DEFAULT_STRUCT_PRINT_FUNCTION;
			SubLObject class_name = com.cyc.cycjava.cycl.java_backend.java_backend_defstruct_class_name(name);
			SubLObject class_form = listS($sym214$_FIELD, list($sym215$_IDENTIFIER, class_name), $list_alt216);
			SubLObject type_form = form_translation.translate_form(list(QUOTE, name));
			SubLObject predicate_form = form_translation.translate_form(list(QUOTE, predicate));
			SubLObject slots_form = form_translation.translate_form(list(QUOTE, v_slots));
			SubLObject slot_keywords_form = form_translation.translate_form(list(QUOTE, slot_keywords));
			SubLObject getters_form = form_translation.translate_form(list(QUOTE, getters));
			SubLObject setters_form = form_translation.translate_form(list(QUOTE, setters));
			SubLObject print_function_form = form_translation.translate_form(list(QUOTE, print_function));
			SubLObject field_name_forms = NIL;
			SubLObject cdolist_list_var = v_slots;
			SubLObject slot = NIL;
			for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), slot = cdolist_list_var.first()) {
				{
					SubLObject field_name = com.cyc.cycjava.cycl.java_backend.java_backend_defstruct_slot_name(slot);
					field_name_forms = cons(field_name, field_name_forms);
				}
			}
			field_name_forms = nreverse(field_name_forms);
			{
				SubLObject field_names_array = list($sym217$_NEW_ARRAY, $$$String, field_name_forms);
				SubLObject expanded_form = list(new SubLObject[] { $sym219$_MAKE_STRUCT_DECL_NATIVE, class_form, type_form, predicate_form, slots_form, slot_keywords_form, field_names_array, getters_form, setters_form, print_function_form });
				com.cyc.cycjava.cycl.java_backend.java_backend_indent(stream, depth);
				com.cyc.cycjava.cycl.java_backend.java_backend_write_form(expanded_form, stream, depth);
			}
		}
		return T;
	}

	public static SubLObject java_backend_write_struct_decl_initializer(final SubLObject analysis, final SubLObject stream, final SubLObject depth) {
		final SubLObject name_tail = property_list_member($NAME, analysis);
		final SubLObject name = (NIL != name_tail) ? cadr(name_tail) : NIL;
		final SubLObject predicate_tail = property_list_member($PREDICATE, analysis);
		final SubLObject predicate = (NIL != predicate_tail) ? cadr(predicate_tail) : NIL;
		final SubLObject slots_tail = property_list_member($SLOTS, analysis);
		final SubLObject v_slots = (NIL != slots_tail) ? cadr(slots_tail) : NIL;
		final SubLObject slot_keywords_tail = property_list_member($SLOT_KEYWORDS, analysis);
		final SubLObject slot_keywords = (NIL != slot_keywords_tail) ? cadr(slot_keywords_tail) : NIL;
		final SubLObject getters_tail = property_list_member($GETTERS, analysis);
		final SubLObject getters = (NIL != getters_tail) ? cadr(getters_tail) : NIL;
		final SubLObject setters_tail = property_list_member($SETTERS, analysis);
		final SubLObject setters = (NIL != setters_tail) ? cadr(setters_tail) : NIL;
		final SubLObject print_function_tail = property_list_member($PRINT_FUNCTION, analysis);
		final SubLObject print_function = (NIL != print_function_tail) ? cadr(print_function_tail) : DEFAULT_STRUCT_PRINT_FUNCTION;
		final SubLObject class_name = java_backend_defstruct_class_name(name);
		final SubLObject class_form = listS($sym259$_FIELD, list($sym260$_IDENTIFIER, class_name), $list261);
		final SubLObject type_form = form_translation.translate_form(list(QUOTE, name));
		final SubLObject predicate_form = form_translation.translate_form(list(QUOTE, predicate));
		final SubLObject slots_form = form_translation.translate_form(list(QUOTE, v_slots));
		final SubLObject slot_keywords_form = form_translation.translate_form(list(QUOTE, slot_keywords));
		final SubLObject getters_form = form_translation.translate_form(list(QUOTE, getters));
		final SubLObject setters_form = form_translation.translate_form(list(QUOTE, setters));
		final SubLObject print_function_form = form_translation.translate_form(list(QUOTE, print_function));
		SubLObject field_name_forms = NIL;
		SubLObject cdolist_list_var = v_slots;
		SubLObject slot = NIL;
		slot = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			final SubLObject field_name = java_backend_defstruct_slot_name(slot);
			field_name_forms = cons(field_name, field_name_forms);
			cdolist_list_var = cdolist_list_var.rest();
			slot = cdolist_list_var.first();
		}
		field_name_forms = nreverse(field_name_forms);
		final SubLObject field_names_array = list($sym135$_NEW_ARRAY, $$$String, field_name_forms);
		final SubLObject expanded_form = list(new SubLObject[] { $sym263$_MAKE_STRUCT_DECL_NATIVE, class_form, type_form, predicate_form, slots_form, slot_keywords_form, field_names_array, getters_form, setters_form, print_function_form });
		java_backend_indent(stream, depth);
		java_backend_write_form(expanded_form, stream, depth);
		return T;
	}

	public static final SubLObject java_backend_write_defstruct_construct_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			SubLObject c_structure_tag = NIL;
			SubLObject size = NIL;
			SubLObject type_var = NIL;
			SubLObject type = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt220);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt220);
			c_structure_tag = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt220);
			size = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt220);
			type_var = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt220);
			type = current.first();
			current = current.rest();
			if (NIL == current) {
				list_utilities.verify_operator(operator, _DEFSTRUCT_CONSTRUCT);
				{
					SubLObject class_name = com.cyc.cycjava.cycl.java_backend.java_backend_defstruct_class_name(type);
					SubLObject expanded_form = list($sym222$_NEW, class_name);
					return com.cyc.cycjava.cycl.java_backend.java_backend_write_form(expanded_form, stream, depth);
				}
			} else {
				cdestructuring_bind_error(datum, $list_alt220);
			}
		}
		return NIL;
	}

	public static SubLObject java_backend_write_defstruct_construct(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		SubLObject c_structure_tag = NIL;
		SubLObject size = NIL;
		SubLObject type_var = NIL;
		SubLObject type = NIL;
		destructuring_bind_must_consp(form, form, $list264);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list264);
		c_structure_tag = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list264);
		size = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list264);
		type_var = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list264);
		type = current.first();
		current = current.rest();
		if (NIL == current) {
			list_utilities.verify_operator(operator, _DEFSTRUCT_CONSTRUCT);
			final SubLObject class_name = java_backend_defstruct_class_name(type);
			final SubLObject expanded_form = list($sym266$_NEW, class_name);
			return java_backend_write_form(expanded_form, stream, depth);
		}
		cdestructuring_bind_error(form, $list264);
		return NIL;
	}

	public static final SubLObject java_backend_write_defstruct_get_slot_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			SubLObject v_object = NIL;
			SubLObject index = NIL;
			SubLObject type = NIL;
			SubLObject slot = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt223);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt223);
			v_object = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt223);
			index = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt223);
			type = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt223);
			slot = current.first();
			current = current.rest();
			if (NIL == current) {
				list_utilities.verify_operator(operator, _DEFSTRUCT_GET_SLOT);
				{
					SubLObject class_name = com.cyc.cycjava.cycl.java_backend.java_backend_defstruct_class_name(type);
					SubLObject slot_name = com.cyc.cycjava.cycl.java_backend.java_backend_defstruct_slot_name(slot);
					SubLObject expanded_form = (index.numL($int$21)) ? ((SubLObject) (list($sym119$_METHOD, v_object, cconcatenate($$$getField, string_utilities.to_string(index))))) : list($sym214$_FIELD, list($sym113$_CAST, class_name, v_object), slot_name);
					return com.cyc.cycjava.cycl.java_backend.java_backend_write_form(expanded_form, stream, depth);
				}
			} else {
				cdestructuring_bind_error(datum, $list_alt223);
			}
		}
		return NIL;
	}

	public static SubLObject java_backend_write_defstruct_get_slot(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		SubLObject v_object = NIL;
		SubLObject index = NIL;
		SubLObject type = NIL;
		SubLObject slot = NIL;
		destructuring_bind_must_consp(form, form, $list267);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list267);
		v_object = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list267);
		index = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list267);
		type = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list267);
		slot = current.first();
		current = current.rest();
		if (NIL == current) {
			list_utilities.verify_operator(operator, _DEFSTRUCT_GET_SLOT);
			final SubLObject class_name = java_backend_defstruct_class_name(type);
			final SubLObject slot_name = java_backend_defstruct_slot_name(slot);
			final SubLObject expanded_form = (index.numL($int$21)) ? list($sym159$_METHOD, v_object, cconcatenate($$$getField, string_utilities.to_string(index))) : list($sym259$_FIELD, list($sym154$_CAST, class_name, v_object), slot_name);
			return java_backend_write_form(expanded_form, stream, depth);
		}
		cdestructuring_bind_error(form, $list267);
		return NIL;
	}

	public static final SubLObject java_backend_write_defstruct_object_p_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			SubLObject v_object = NIL;
			SubLObject c_structure_tag = NIL;
			SubLObject type_var = NIL;
			SubLObject type = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt227);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt227);
			v_object = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt227);
			c_structure_tag = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt227);
			type_var = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt227);
			type = current.first();
			current = current.rest();
			if (NIL == current) {
				list_utilities.verify_operator(operator, _DEFSTRUCT_OBJECT_P);
				{
					SubLObject class_name = com.cyc.cycjava.cycl.java_backend.java_backend_defstruct_class_name(type);
					SubLObject expanded_form = listS(FIF, list($sym230$___, listS($sym119$_METHOD, v_object, $list_alt231), listS($sym214$_FIELD, list($sym215$_IDENTIFIER, class_name), $list_alt216)), $list_alt232);
					return com.cyc.cycjava.cycl.java_backend.java_backend_write_form(expanded_form, stream, depth);
				}
			} else {
				cdestructuring_bind_error(datum, $list_alt227);
			}
		}
		return NIL;
	}

	public static SubLObject java_backend_write_defstruct_object_p(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		SubLObject v_object = NIL;
		SubLObject c_structure_tag = NIL;
		SubLObject type_var = NIL;
		SubLObject type = NIL;
		destructuring_bind_must_consp(form, form, $list271);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list271);
		v_object = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list271);
		c_structure_tag = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list271);
		type_var = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list271);
		type = current.first();
		current = current.rest();
		if (NIL == current) {
			list_utilities.verify_operator(operator, _DEFSTRUCT_OBJECT_P);
			final SubLObject class_name = java_backend_defstruct_class_name(type);
			final SubLObject expanded_form = listS(FIF, listS($sym273$___, listS($sym159$_METHOD, v_object, $list274), listS($sym259$_FIELD, list($sym260$_IDENTIFIER, class_name), $list261), $list275), $list276);
			return java_backend_write_form(expanded_form, stream, depth);
		}
		cdestructuring_bind_error(form, $list271);
		return NIL;
	}

	public static final SubLObject java_backend_write_defstruct_set_slot_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			SubLObject v_object = NIL;
			SubLObject index = NIL;
			SubLObject value = NIL;
			SubLObject type = NIL;
			SubLObject slot = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt233);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt233);
			v_object = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt233);
			index = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt233);
			value = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt233);
			type = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt233);
			slot = current.first();
			current = current.rest();
			if (NIL == current) {
				list_utilities.verify_operator(operator, _DEFSTRUCT_SET_SLOT);
				{
					SubLObject class_name = com.cyc.cycjava.cycl.java_backend.java_backend_defstruct_class_name(type);
					SubLObject slot_name = com.cyc.cycjava.cycl.java_backend.java_backend_defstruct_slot_name(slot);
					SubLObject expanded_form = (index.numL($int$21)) ? ((SubLObject) (list($sym119$_METHOD, v_object, cconcatenate($$$setField, string_utilities.to_string(index)), value))) : list($sym236$__, list($sym214$_FIELD, list($sym113$_CAST, class_name, v_object), slot_name), value);
					return com.cyc.cycjava.cycl.java_backend.java_backend_write_form(expanded_form, stream, depth);
				}
			} else {
				cdestructuring_bind_error(datum, $list_alt233);
			}
		}
		return NIL;
	}

	public static SubLObject java_backend_write_defstruct_set_slot(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		SubLObject v_object = NIL;
		SubLObject index = NIL;
		SubLObject value = NIL;
		SubLObject type = NIL;
		SubLObject slot = NIL;
		destructuring_bind_must_consp(form, form, $list277);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list277);
		v_object = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list277);
		index = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list277);
		value = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list277);
		type = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list277);
		slot = current.first();
		current = current.rest();
		if (NIL == current) {
			list_utilities.verify_operator(operator, _DEFSTRUCT_SET_SLOT);
			final SubLObject class_name = java_backend_defstruct_class_name(type);
			final SubLObject slot_name = java_backend_defstruct_slot_name(slot);
			final SubLObject expanded_form = (index.numL($int$21)) ? list($sym159$_METHOD, v_object, cconcatenate($$$setField, string_utilities.to_string(index)), value) : list($sym280$__, list($sym259$_FIELD, list($sym154$_CAST, class_name, v_object), slot_name), value);
			return java_backend_write_form(expanded_form, stream, depth);
		}
		cdestructuring_bind_error(form, $list277);
		return NIL;
	}

	public static final SubLObject java_backend_write_defvar_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject operator = form.first();
			list_utilities.verify_operator(operator, DEFVAR);
			return com.cyc.cycjava.cycl.java_backend.java_backend_write_global(form, stream, depth);
		}
	}

	public static SubLObject java_backend_write_defvar(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		final SubLObject operator = form.first();
		list_utilities.verify_operator(operator, DEFVAR);
		return java_backend_write_global(form, stream, depth);
	}

	public static final SubLObject java_backend_write_fif_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			SubLObject condition = NIL;
			SubLObject true_value = NIL;
			SubLObject false_value = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt238);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt238);
			condition = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt238);
			true_value = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt238);
			false_value = current.first();
			current = current.rest();
			if (NIL == current) {
				list_utilities.verify_operator(operator, FIF);
				true_value = list($sym113$_CAST, $java_backend_object_data_type$.getGlobalValue(), true_value);
				write_string($str_alt93$_, stream, UNPROVIDED, UNPROVIDED);
				com.cyc.cycjava.cycl.java_backend.java_backend_write_form(condition, stream, number_utilities.f_1X(depth));
				write_string($str_alt239$___, stream, UNPROVIDED, UNPROVIDED);
				com.cyc.cycjava.cycl.java_backend.java_backend_write_form(true_value, stream, number_utilities.f_1X(depth));
				write_string($str_alt240$___, stream, UNPROVIDED, UNPROVIDED);
				com.cyc.cycjava.cycl.java_backend.java_backend_write_form(false_value, stream, number_utilities.f_1X(depth));
				write_string($str_alt95$_, stream, UNPROVIDED, UNPROVIDED);
			} else {
				cdestructuring_bind_error(datum, $list_alt238);
			}
		}
		return NIL;
	}

	public static SubLObject java_backend_write_fif(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		SubLObject condition = NIL;
		SubLObject true_value = NIL;
		SubLObject false_value = NIL;
		destructuring_bind_must_consp(form, form, $list282);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list282);
		condition = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list282);
		true_value = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list282);
		false_value = current.first();
		current = current.rest();
		if (NIL == current) {
			list_utilities.verify_operator(operator, FIF);
			true_value = list($sym154$_CAST, $java_backend_object_data_type$.getGlobalValue(), true_value);
			write_string($str130$_, stream, UNPROVIDED, UNPROVIDED);
			java_backend_write_form(condition, stream, number_utilities.f_1X(depth));
			write_string($str283$___, stream, UNPROVIDED, UNPROVIDED);
			java_backend_write_form(true_value, stream, number_utilities.f_1X(depth));
			write_string($str284$___, stream, UNPROVIDED, UNPROVIDED);
			java_backend_write_form(false_value, stream, number_utilities.f_1X(depth));
			write_string($str132$_, stream, UNPROVIDED, UNPROVIDED);
		} else {
			cdestructuring_bind_error(form, $list282);
		}
		return NIL;
	}

	public static final SubLObject java_backend_write_pcond_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt241);
			operator = current.first();
			current = current.rest();
			{
				SubLObject pcond_clauses = current;
				list_utilities.verify_operator(operator, PCOND);
				if (NIL == pcond_clauses) {
					return com.cyc.cycjava.cycl.java_backend.java_backend_write_progn($list_alt243, stream, depth);
				}
				{
					SubLObject datum_17 = pcond_clauses;
					SubLObject current_18 = datum_17;
					SubLObject first_clause = NIL;
					destructuring_bind_must_consp(current_18, datum_17, $list_alt244);
					first_clause = current_18.first();
					current_18 = current_18.rest();
					{
						SubLObject rest_clauses = current_18;
						SubLObject datum_19 = first_clause;
						SubLObject current_20 = datum_19;
						SubLObject test = NIL;
						destructuring_bind_must_consp(current_20, datum_19, $list_alt245);
						test = current_20.first();
						current_20 = current_20.rest();
						{
							SubLObject actions = current_20;
							write_string($str_alt246$if__, stream, UNPROVIDED, UNPROVIDED);
							com.cyc.cycjava.cycl.java_backend.java_backend_write_form(test, stream, number_utilities.f_1X(depth));
							write_string($str_alt247$__, stream, UNPROVIDED, UNPROVIDED);
							com.cyc.cycjava.cycl.java_backend.java_backend_write_progn(bq_cons(PROGN, append(actions, NIL)), stream, depth);
							{
								SubLObject cdolist_list_var = rest_clauses;
								SubLObject rest_clause = NIL;
								for (rest_clause = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), rest_clause = cdolist_list_var.first()) {
									{
										SubLObject datum_21 = rest_clause;
										SubLObject current_22 = datum_21;
										SubLObject test_23 = NIL;
										destructuring_bind_must_consp(current_22, datum_21, $list_alt245);
										test_23 = current_22.first();
										current_22 = current_22.rest();
										{
											SubLObject actions_24 = current_22;
											if (test_23.equal($list_alt248)) {
												if (NIL != actions_24) {
													write_string($str_alt249$_else_, stream, UNPROVIDED, UNPROVIDED);
													com.cyc.cycjava.cycl.java_backend.java_backend_write_progn(bq_cons(PROGN, append(actions_24, NIL)), stream, depth);
												}
											} else {
												write_string($str_alt250$_else_if__, stream, UNPROVIDED, UNPROVIDED);
												com.cyc.cycjava.cycl.java_backend.java_backend_write_form(test_23, stream, number_utilities.f_1X(depth));
												write_string($str_alt247$__, stream, UNPROVIDED, UNPROVIDED);
												com.cyc.cycjava.cycl.java_backend.java_backend_write_progn(bq_cons(PROGN, append(actions_24, NIL)), stream, depth);
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
		return NIL;
	}

	public static SubLObject java_backend_write_pcond(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		destructuring_bind_must_consp(form, form, $list285);
		operator = form.first();
		final SubLObject pcond_clauses;
		final SubLObject current = pcond_clauses = form.rest();
		list_utilities.verify_operator(operator, PCOND);
		if (NIL == pcond_clauses) {
			return java_backend_write_progn($list287, stream, depth);
		}
		SubLObject current_$23;
		final SubLObject datum_$22 = current_$23 = pcond_clauses;
		SubLObject first_clause = NIL;
		destructuring_bind_must_consp(current_$23, datum_$22, $list288);
		first_clause = current_$23.first();
		final SubLObject rest_clauses;
		current_$23 = rest_clauses = current_$23.rest();
		SubLObject current_$24;
		final SubLObject datum_$23 = current_$24 = first_clause;
		SubLObject test = NIL;
		destructuring_bind_must_consp(current_$24, datum_$23, $list289);
		test = current_$24.first();
		final SubLObject actions;
		current_$24 = actions = current_$24.rest();
		write_string($str290$if__, stream, UNPROVIDED, UNPROVIDED);
		java_backend_write_form(test, stream, number_utilities.f_1X(depth));
		write_string($str291$__, stream, UNPROVIDED, UNPROVIDED);
		java_backend_write_progn(bq_cons(PROGN, append(actions, NIL)), stream, depth);
		SubLObject cdolist_list_var = rest_clauses;
		SubLObject rest_clause = NIL;
		rest_clause = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject current_$25;
			final SubLObject datum_$24 = current_$25 = rest_clause;
			SubLObject test_$28 = NIL;
			destructuring_bind_must_consp(current_$25, datum_$24, $list289);
			test_$28 = current_$25.first();
			final SubLObject actions_$29;
			current_$25 = actions_$29 = current_$25.rest();
			if (test_$28.equal($list292)) {
				if (NIL != actions_$29) {
					write_string($$$_else_, stream, UNPROVIDED, UNPROVIDED);
					java_backend_write_progn(bq_cons(PROGN, append(actions_$29, NIL)), stream, depth);
				}
			} else {
				write_string($str294$_else_if__, stream, UNPROVIDED, UNPROVIDED);
				java_backend_write_form(test_$28, stream, number_utilities.f_1X(depth));
				write_string($str291$__, stream, UNPROVIDED, UNPROVIDED);
				java_backend_write_progn(bq_cons(PROGN, append(actions_$29, NIL)), stream, depth);
			}
			cdolist_list_var = cdolist_list_var.rest();
			rest_clause = cdolist_list_var.first();
		}
		return NIL;
	}

	public static SubLObject java_backend_write_Xproclaim(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		SubLObject arglist = NIL;
		destructuring_bind_must_consp(form, form, $list295);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list295);
		arglist = current.first();
		current = current.rest();
		if (NIL == current) {
			list_utilities.verify_operator(operator, $sym296$_PROCLAIM);
			write_string($str297$SubLSpecialOperatorDeclarations_p, stream, UNPROVIDED, UNPROVIDED);
			java_backend_write_form(arglist, stream, depth);
			write_string($str298$__, stream, UNPROVIDED, UNPROVIDED);
			terpri(stream);
			java_backend_indent(stream, depth);
		} else {
			cdestructuring_bind_error(form, $list295);
		}
		return NIL;
	}

	public static final SubLObject java_backend_write_progn_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt251);
			operator = current.first();
			current = current.rest();
			{
				SubLObject body = current;
				list_utilities.verify_operator(operator, PROGN);
				write_string($str_alt44$_, stream, UNPROVIDED, UNPROVIDED);
				{
					SubLObject cdolist_list_var = body;
					SubLObject statement = NIL;
					for (statement = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), statement = cdolist_list_var.first()) {
						com.cyc.cycjava.cycl.java_backend.java_backend_write_statement(statement, stream, number_utilities.f_1X(depth));
					}
				}
				terpri(stream);
				com.cyc.cycjava.cycl.java_backend.java_backend_indent(stream, depth);
				write_string($str_alt45$_, stream, UNPROVIDED, UNPROVIDED);
			}
		}
		return NIL;
	}

	public static SubLObject java_backend_write_progn(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		destructuring_bind_must_consp(form, form, $list299);
		operator = form.first();
		final SubLObject body;
		final SubLObject current = body = form.rest();
		list_utilities.verify_operator(operator, PROGN);
		write_string($str80$_, stream, UNPROVIDED, UNPROVIDED);
		SubLObject cdolist_list_var = body;
		SubLObject statement = NIL;
		statement = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			java_backend_write_statement(statement, stream, number_utilities.f_1X(depth));
			cdolist_list_var = cdolist_list_var.rest();
			statement = cdolist_list_var.first();
		}
		terpri(stream);
		java_backend_indent(stream, depth);
		write_string($str81$_, stream, UNPROVIDED, UNPROVIDED);
		return NIL;
	}

	public static SubLObject java_backend_write_Xlog_enter(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		SubLObject name = NIL;
		SubLObject formal_arg_list = NIL;
		destructuring_bind_must_consp(form, form, $list300);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list300);
		name = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list300);
		formal_arg_list = current.first();
		current = current.rest();
		if (NIL == current) {
			list_utilities.verify_operator(operator, $sym224$_LOG_ENTER);
			java_backend_write_method_entry(stream, depth, name, formal_arg_list);
		} else {
			cdestructuring_bind_error(form, $list300);
		}
		return NIL;
	}

	public static final SubLObject java_backend_write_ret_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			SubLObject result = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt252);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt252);
			result = current.first();
			current = current.rest();
			if (NIL == current) {
				list_utilities.verify_operator(operator, RET);
				write_string($str_alt254$return_, stream, UNPROVIDED, UNPROVIDED);
				com.cyc.cycjava.cycl.java_backend.java_backend_write_form(result, stream, number_utilities.f_1X(depth));
			} else {
				cdestructuring_bind_error(datum, $list_alt252);
			}
		}
		return T;
	}

	public static SubLObject java_backend_write_ret(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		SubLObject result = NIL;
		destructuring_bind_must_consp(form, form, $list301);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list301);
		result = current.first();
		current = current.rest();
		if (NIL != current) {
			cdestructuring_bind_error(form, $list301);
			return NIL;
		}
		list_utilities.verify_operator(operator, RET);
		if (NIL != java_backend_current_method_needs_logging_p()) {
			write_string($str80$_, stream, UNPROVIDED, UNPROVIDED);
			final SubLObject sub_depth = number_utilities.f_1X(depth);
			terpri(stream);
			java_backend_indent(stream, sub_depth);
			write_string($str303$final_SubLObject__currRetval___, stream, UNPROVIDED, UNPROVIDED);
			java_backend_write_form(result, stream, number_utilities.f_1X(sub_depth));
			write_string($str103$_, stream, UNPROVIDED, UNPROVIDED);
			java_backend_write_method_exit(stream, sub_depth, $str304$_currRetval);
			terpri(stream);
			java_backend_indent(stream, sub_depth);
			write_string($str305$return__currRetval_, stream, UNPROVIDED, UNPROVIDED);
			terpri(stream);
			java_backend_indent(stream, depth);
			write_string($str81$_, stream, UNPROVIDED, UNPROVIDED);
			return NIL;
		}
		write_string($$$return_, stream, UNPROVIDED, UNPROVIDED);
		java_backend_write_form(result, stream, number_utilities.f_1X(depth));
		return T;
	}

	public static final SubLObject java_backend_write_while_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			SubLObject test = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt255);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt255);
			test = current.first();
			current = current.rest();
			{
				SubLObject body = current;
				list_utilities.verify_operator(operator, WHILE);
				write_string($str_alt256$while__, stream, UNPROVIDED, UNPROVIDED);
				com.cyc.cycjava.cycl.java_backend.java_backend_write_form(test, stream, number_utilities.f_1X(depth));
				write_string($str_alt247$__, stream, UNPROVIDED, UNPROVIDED);
				com.cyc.cycjava.cycl.java_backend.java_backend_write_progn(bq_cons(PROGN, append(body, NIL)), stream, depth);
			}
		}
		return NIL;
	}

	public static SubLObject java_backend_write_while(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		SubLObject test = NIL;
		destructuring_bind_must_consp(form, form, $list307);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list307);
		test = current.first();
		final SubLObject body;
		current = body = current.rest();
		list_utilities.verify_operator(operator, WHILE);
		write_string($str308$while__, stream, UNPROVIDED, UNPROVIDED);
		java_backend_write_form(test, stream, number_utilities.f_1X(depth));
		write_string($str291$__, stream, UNPROVIDED, UNPROVIDED);
		java_backend_write_progn(bq_cons(PROGN, append(body, NIL)), stream, depth);
		return NIL;
	}

	public static final SubLObject java_backend_write_Xand_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt257);
			operator = current.first();
			current = current.rest();
			{
				SubLObject expressions = current;
				list_utilities.verify_operator(operator, $sym258$_AND);
				if (NIL == expressions) {
					com.cyc.cycjava.cycl.java_backend.java_backend_write_Xnc($list_alt248, stream, number_utilities.f_1X(depth));
				} else {
					if (NIL != list_utilities.singletonP(expressions)) {
						com.cyc.cycjava.cycl.java_backend.java_backend_write_form(expressions.first(), stream, number_utilities.f_1X(depth));
					} else {
						write_string($str_alt93$_, stream, UNPROVIDED, UNPROVIDED);
						com.cyc.cycjava.cycl.java_backend.java_backend_write_form(expressions.first(), stream, number_utilities.f_1X(depth));
						{
							SubLObject cdolist_list_var = expressions.rest();
							SubLObject expression = NIL;
							for (expression = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), expression = cdolist_list_var.first()) {
								terpri(stream);
								com.cyc.cycjava.cycl.java_backend.java_backend_indent(stream, number_utilities.f_1X(depth));
								write_string($str_alt259$____, stream, UNPROVIDED, UNPROVIDED);
								com.cyc.cycjava.cycl.java_backend.java_backend_write_form(expression, stream, number_utilities.f_1X(depth));
							}
						}
						write_string($str_alt95$_, stream, UNPROVIDED, UNPROVIDED);
					}
				}
			}
		}
		return NIL;
	}

	public static SubLObject java_backend_write_Xand(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		destructuring_bind_must_consp(form, form, $list309);
		operator = form.first();
		final SubLObject expressions;
		final SubLObject current = expressions = form.rest();
		list_utilities.verify_operator(operator, $sym310$_AND);
		if (NIL == expressions) {
			java_backend_write_Xnc($list292, stream, number_utilities.f_1X(depth));
		} else if (NIL != list_utilities.singletonP(expressions)) {
			java_backend_write_form(expressions.first(), stream, number_utilities.f_1X(depth));
		} else {
			write_string($str130$_, stream, UNPROVIDED, UNPROVIDED);
			java_backend_write_form(expressions.first(), stream, number_utilities.f_1X(depth));
			SubLObject cdolist_list_var = expressions.rest();
			SubLObject expression = NIL;
			expression = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				terpri(stream);
				java_backend_indent(stream, number_utilities.f_1X(depth));
				write_string($str311$____, stream, UNPROVIDED, UNPROVIDED);
				java_backend_write_form(expression, stream, number_utilities.f_1X(depth));
				cdolist_list_var = cdolist_list_var.rest();
				expression = cdolist_list_var.first();
			}
			write_string($str132$_, stream, UNPROVIDED, UNPROVIDED);
		}

		return NIL;
	}

	public static final SubLObject java_backend_write_Xcdohash_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt260);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt260);
			{
				SubLObject temp = current.rest();
				current = current.first();
				{
					SubLObject key = NIL;
					SubLObject val = NIL;
					SubLObject table_var = NIL;
					SubLObject iterator_var = NIL;
					SubLObject entry_var = NIL;
					destructuring_bind_must_consp(current, datum, $list_alt260);
					key = current.first();
					current = current.rest();
					destructuring_bind_must_consp(current, datum, $list_alt260);
					val = current.first();
					current = current.rest();
					destructuring_bind_must_consp(current, datum, $list_alt260);
					table_var = current.first();
					current = current.rest();
					destructuring_bind_must_consp(current, datum, $list_alt260);
					iterator_var = current.first();
					current = current.rest();
					destructuring_bind_must_consp(current, datum, $list_alt260);
					entry_var = current.first();
					current = current.rest();
					if (NIL == current) {
						current = temp;
						{
							SubLObject body = current;
							list_utilities.verify_operator(operator, $sym261$_CDOHASH);
							return com.cyc.cycjava.cycl.java_backend.java_backend_write_progn(list(PROGN, listS($sym129$_LOCAL, iterator_var, list($sym262$_CDOHASH_GET_ENTRY_SET_ITERATOR, table_var), $list_alt131),
									list($sym122$_TRY, listS(WHILE, list($sym263$_CDOHASH_ITERATOR_HAS_NEXT, iterator_var), listS($sym129$_LOCAL, entry_var, list($sym264$_CDOHASH_ITERATOR_NEXT_ENTRY, iterator_var), $list_alt265), list(CSETQ, key, list($sym266$_CDOHASH_GET_ENTRY_KEY, entry_var)), list(CSETQ, val, list($sym267$_CDOHASH_GET_ENTRY_VALUE, entry_var)), append(body, NIL)), NIL,
											list($sym268$_CDOHASH_RELEASE_ENTRY_SET_ITERATOR, iterator_var))),
									stream, depth);
						}
					} else {
						cdestructuring_bind_error(datum, $list_alt260);
					}
				}
			}
		}
		return NIL;
	}

	public static SubLObject java_backend_write_Xcdohash(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		destructuring_bind_must_consp(form, form, $list312);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list312);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject key = NIL;
		SubLObject val = NIL;
		SubLObject table_var = NIL;
		SubLObject iterator_var = NIL;
		SubLObject entry_var = NIL;
		destructuring_bind_must_consp(current, form, $list312);
		key = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list312);
		val = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list312);
		table_var = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list312);
		iterator_var = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list312);
		entry_var = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			list_utilities.verify_operator(operator, $sym313$_CDOHASH);
			return java_backend_write_progn(list(PROGN, listS($sym172$_LOCAL, iterator_var, list($sym314$_CDOHASH_GET_ENTRY_SET_ITERATOR, table_var), $list174), list($sym162$_TRY,
					listS(WHILE, list($sym315$_CDOHASH_ITERATOR_HAS_NEXT, iterator_var), listS($sym172$_LOCAL, entry_var, list($sym316$_CDOHASH_ITERATOR_NEXT_ENTRY, iterator_var), $list317), list(CSETQ, key, list($sym318$_CDOHASH_GET_ENTRY_KEY, entry_var)), list(CSETQ, val, list($sym319$_CDOHASH_GET_ENTRY_VALUE, entry_var)), append(body, NIL)), NIL, list($sym320$_CDOHASH_RELEASE_ENTRY_SET_ITERATOR, iterator_var))),
					stream, depth);
		}
		cdestructuring_bind_error(form, $list312);
		return NIL;
	}

	public static final SubLObject java_backend_write_Xenter_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt269);
			operator = current.first();
			current = current.rest();
			if (NIL == current) {
				list_utilities.verify_operator(operator, $sym270$_ENTER);
				write_string($str_alt271$___ENTER__, stream, UNPROVIDED, UNPROVIDED);
			} else {
				cdestructuring_bind_error(datum, $list_alt269);
			}
		}
		return T;
	}

	public static SubLObject java_backend_write_Xenter(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		destructuring_bind_must_consp(form, form, $list321);
		operator = form.first();
		final SubLObject current = form.rest();
		if (NIL == current) {
			list_utilities.verify_operator(operator, $sym322$_ENTER);
			write_string($str323$___ENTER__, stream, UNPROVIDED, UNPROVIDED);
		} else {
			cdestructuring_bind_error(form, $list321);
		}
		return T;
	}

	public static final SubLObject java_backend_write_Xfor_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt272);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt272);
			{
				SubLObject temp = current.rest();
				current = current.first();
				{
					SubLObject initializations = NIL;
					SubLObject test = NIL;
					SubLObject updates = NIL;
					destructuring_bind_must_consp(current, datum, $list_alt272);
					initializations = current.first();
					current = current.rest();
					destructuring_bind_must_consp(current, datum, $list_alt272);
					test = current.first();
					current = current.rest();
					destructuring_bind_must_consp(current, datum, $list_alt272);
					updates = current.first();
					current = current.rest();
					if (NIL == current) {
						current = temp;
						{
							SubLObject body = current;
							list_utilities.verify_operator(operator, $sym273$_FOR);
							write_string($str_alt274$for__, stream, UNPROVIDED, UNPROVIDED);
							if (NIL != initializations) {
								{
									SubLObject datum_25 = initializations;
									SubLObject current_26 = datum_25;
									SubLObject first_initialization = NIL;
									SubLObject rest_initialiations = NIL;
									destructuring_bind_must_consp(current_26, datum_25, $list_alt275);
									first_initialization = current_26.first();
									current_26 = current_26.rest();
									rest_initialiations = current_26;
									com.cyc.cycjava.cycl.java_backend.java_backend_write_form(first_initialization, stream, number_utilities.f_1X(depth));
									{
										SubLObject cdolist_list_var = rest_initialiations;
										SubLObject rest_initialiation = NIL;
										for (rest_initialiation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), rest_initialiation = cdolist_list_var.first()) {
											com.cyc.cycjava.cycl.java_backend.java_backend_write_function_call_argument_separator(stream);
											com.cyc.cycjava.cycl.java_backend.java_backend_write_form(rest_initialiation, stream, number_utilities.f_1X(depth));
										}
									}
								}
							}
							write_string($str_alt276$__, stream, UNPROVIDED, UNPROVIDED);
							com.cyc.cycjava.cycl.java_backend.java_backend_write_form(test, stream, number_utilities.f_1X(depth));
							write_string($str_alt276$__, stream, UNPROVIDED, UNPROVIDED);
							if (NIL != updates) {
								{
									SubLObject datum_27 = updates;
									SubLObject current_28 = datum_27;
									SubLObject first_update = NIL;
									SubLObject rest_updates = NIL;
									destructuring_bind_must_consp(current_28, datum_27, $list_alt277);
									first_update = current_28.first();
									current_28 = current_28.rest();
									rest_updates = current_28;
									com.cyc.cycjava.cycl.java_backend.java_backend_write_form(first_update, stream, number_utilities.f_1X(depth));
									{
										SubLObject cdolist_list_var = rest_updates;
										SubLObject rest_update = NIL;
										for (rest_update = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), rest_update = cdolist_list_var.first()) {
											com.cyc.cycjava.cycl.java_backend.java_backend_write_function_call_argument_separator(stream);
											com.cyc.cycjava.cycl.java_backend.java_backend_write_form(rest_update, stream, number_utilities.f_1X(depth));
										}
									}
								}
							}
							write_string($str_alt247$__, stream, UNPROVIDED, UNPROVIDED);
							com.cyc.cycjava.cycl.java_backend.java_backend_write_progn(bq_cons(PROGN, append(body, NIL)), stream, depth);
						}
					} else {
						cdestructuring_bind_error(datum, $list_alt272);
					}
				}
			}
		}
		return NIL;
	}

	public static SubLObject java_backend_write_Xfor(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		destructuring_bind_must_consp(form, form, $list324);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list324);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject initializations = NIL;
		SubLObject test = NIL;
		SubLObject updates = NIL;
		destructuring_bind_must_consp(current, form, $list324);
		initializations = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list324);
		test = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list324);
		updates = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			list_utilities.verify_operator(operator, $sym325$_FOR);
			write_string($str326$for__, stream, UNPROVIDED, UNPROVIDED);
			if (NIL != initializations) {
				SubLObject current_$31;
				final SubLObject datum_$30 = current_$31 = initializations;
				SubLObject first_initialization = NIL;
				SubLObject rest_initialiations = NIL;
				destructuring_bind_must_consp(current_$31, datum_$30, $list327);
				first_initialization = current_$31.first();
				current_$31 = rest_initialiations = current_$31.rest();
				java_backend_write_form(first_initialization, stream, number_utilities.f_1X(depth));
				SubLObject cdolist_list_var = rest_initialiations;
				SubLObject rest_initialiation = NIL;
				rest_initialiation = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					java_backend_write_function_call_argument_separator(stream);
					java_backend_write_form(rest_initialiation, stream, number_utilities.f_1X(depth));
					cdolist_list_var = cdolist_list_var.rest();
					rest_initialiation = cdolist_list_var.first();
				}
			}
			write_string($str328$__, stream, UNPROVIDED, UNPROVIDED);
			java_backend_write_form(test, stream, number_utilities.f_1X(depth));
			write_string($str328$__, stream, UNPROVIDED, UNPROVIDED);
			if (NIL != updates) {
				SubLObject current_$32;
				final SubLObject datum_$31 = current_$32 = updates;
				SubLObject first_update = NIL;
				SubLObject rest_updates = NIL;
				destructuring_bind_must_consp(current_$32, datum_$31, $list329);
				first_update = current_$32.first();
				current_$32 = rest_updates = current_$32.rest();
				java_backend_write_form(first_update, stream, number_utilities.f_1X(depth));
				SubLObject cdolist_list_var = rest_updates;
				SubLObject rest_update = NIL;
				rest_update = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					java_backend_write_function_call_argument_separator(stream);
					java_backend_write_form(rest_update, stream, number_utilities.f_1X(depth));
					cdolist_list_var = cdolist_list_var.rest();
					rest_update = cdolist_list_var.first();
				}
			}
			write_string($str291$__, stream, UNPROVIDED, UNPROVIDED);
			java_backend_write_progn(bq_cons(PROGN, append(body, NIL)), stream, depth);
		} else {
			cdestructuring_bind_error(form, $list324);
		}
		return NIL;
	}

	public static final SubLObject java_backend_write_Xic_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			SubLObject constant_id = NIL;
			SubLObject constant_form = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt278);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt278);
			constant_id = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt278);
			constant_form = current.first();
			current = current.rest();
			if (NIL == current) {
				list_utilities.verify_operator(operator, $sym112$_IC);
				com.cyc.cycjava.cycl.java_backend.java_backend_write_internal_constant_reference(constant_id, constant_form, stream);
			} else {
				cdestructuring_bind_error(datum, $list_alt278);
			}
		}
		return NIL;
	}

	public static SubLObject java_backend_write_Xic(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		SubLObject constant_id = NIL;
		SubLObject constant_form = NIL;
		destructuring_bind_must_consp(form, form, $list330);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list330);
		constant_id = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list330);
		constant_form = current.first();
		current = current.rest();
		if (NIL == current) {
			list_utilities.verify_operator(operator, $sym153$_IC);
			java_backend_write_internal_constant_reference(constant_id, constant_form, stream);
		} else {
			cdestructuring_bind_error(form, $list330);
		}
		return NIL;
	}

	public static final SubLObject canonicalize_string_to_variable_name_alt(SubLObject str, SubLObject max_chars) {
		if (max_chars == UNPROVIDED) {
			max_chars = $int$32;
		}
		{
			SubLObject name = str;
			SubLObject counter = ZERO_INTEGER;
			SubLObject done = NIL;
			SubLObject java_name = NIL;
			SubLObject stream = NIL;
			try {
				stream = make_private_string_output_stream();
				{
					SubLObject string_var = name;
					SubLObject end_var = length(string_var);
					if (NIL == done) {
						{
							SubLObject end_var_29 = end_var;
							SubLObject char_num = NIL;
							for (char_num = ZERO_INTEGER; !((NIL != done) || char_num.numGE(end_var_29)); char_num = number_utilities.f_1X(char_num)) {
								{
									SubLObject v_char = Strings.sublisp_char(string_var, char_num);
									if ((NIL != unicode_strings.ascii_char_p(v_char)) && (NIL != alphanumericp(v_char))) {
										write_char(v_char, stream);
									} else {
										write_char(CHAR_underbar, stream);
									}
									counter = add(counter, ONE_INTEGER);
									done = numG(counter, max_chars);
								}
							}
						}
					}
				}
				java_name = get_output_stream_string(stream);
			} finally {
				{
					SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
					try {
						bind($is_thread_performing_cleanupP$, T);
						close(stream, UNPROVIDED);
					} finally {
						rebind($is_thread_performing_cleanupP$, _prev_bind_0);
					}
				}
			}
			return java_name;
		}
	}

	public static SubLObject canonicalize_string_to_variable_name(final SubLObject str, SubLObject max_chars) {
		if (max_chars == UNPROVIDED) {
			max_chars = $int$32;
		}
		SubLObject counter = ZERO_INTEGER;
		SubLObject done = NIL;
		SubLObject java_name = NIL;
		SubLObject stream = NIL;
		try {
			stream = make_private_string_output_stream();
			final SubLObject end_var = length(str);
			if (NIL == done) {
				SubLObject end_var_$34;
				SubLObject char_num;
				SubLObject v_char;
				for (end_var_$34 = end_var, char_num = NIL, char_num = ZERO_INTEGER; (NIL == done) && (!char_num.numGE(end_var_$34)); done = numG(counter, max_chars), char_num = number_utilities.f_1X(char_num)) {
					v_char = Strings.sublisp_char(str, char_num);
					if ((NIL != unicode_strings.ascii_char_p(v_char)) && (NIL != alphanumericp(v_char))) {
						write_char(v_char, stream);
					} else {
						write_char(CHAR_underbar, stream);
					}
					counter = add(counter, ONE_INTEGER);
				}
			}
			java_name = get_output_stream_string(stream);
		} finally {
			final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
				bind($is_thread_performing_cleanupP$, T);
				final SubLObject _values = getValuesAsVector();
				close(stream, UNPROVIDED);
				restoreValuesFromVector(_values);
			} finally {
				rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		}
		return java_name;
	}

	public static final SubLObject java_backend_write_internal_constant_reference_alt(SubLObject constant_id, SubLObject constant_form, SubLObject stream) {
		if (NIL != system_translation.current_system_translation_secureP()) {
			format(stream, $str_alt280$_ic_S_, constant_id);
			return NIL;
		}
		{
			SubLObject ending = $str_alt281$;
			if (constant_form.isString()) {
				write_string($str_alt282$_str, stream, UNPROVIDED, UNPROVIDED);
				ending = cconcatenate($str_alt205$_, com.cyc.cycjava.cycl.java_backend.canonicalize_string_to_variable_name(constant_form, UNPROVIDED));
			} else {
				if (constant_form.isKeyword()) {
					write_string($str_alt283$_kw, stream, UNPROVIDED, UNPROVIDED);
					ending = cconcatenate($str_alt205$_, com.cyc.cycjava.cycl.java_backend.canonicalize_string_to_variable_name(string_utilities.to_string(constant_form), $int$64));
				} else {
					if (constant_form.isSymbol()) {
						write_string($str_alt285$_sym, stream, UNPROVIDED, UNPROVIDED);
						ending = cconcatenate($str_alt205$_, com.cyc.cycjava.cycl.java_backend.canonicalize_string_to_variable_name(string_utilities.to_string(constant_form), $int$64));
					} else {
						if (constant_form.isInteger()) {
							write_string($str_alt286$_int, stream, UNPROVIDED, UNPROVIDED);
							ending = cconcatenate($str_alt205$_, com.cyc.cycjava.cycl.java_backend.canonicalize_string_to_variable_name(string_utilities.to_string(constant_form), UNPROVIDED));
						} else {
							if (constant_form.isDouble()) {
								write_string($str_alt287$_float, stream, UNPROVIDED, UNPROVIDED);
								ending = cconcatenate($str_alt205$_, com.cyc.cycjava.cycl.java_backend.canonicalize_string_to_variable_name(string_utilities.to_string(constant_form), UNPROVIDED));
							} else {
								if (constant_form.isList()) {
									write_string($str_alt288$_list, stream, UNPROVIDED, UNPROVIDED);
								} else {
									if (constant_form.isChar()) {
										write_string($str_alt289$_char, stream, UNPROVIDED, UNPROVIDED);
										ending = cconcatenate($str_alt205$_, com.cyc.cycjava.cycl.java_backend.canonicalize_string_to_variable_name(string_utilities.to_string(constant_form), UNPROVIDED));
									} else {
										if (NIL != constant_p(constant_form)) {
											write_string($str_alt290$_const, stream, UNPROVIDED, UNPROVIDED);
											ending = cconcatenate($str_alt205$_, com.cyc.cycjava.cycl.java_backend.canonicalize_string_to_variable_name(constants_high.constant_name(constant_form), UNPROVIDED));
										} else {
											write_string($str_alt291$_ic, stream, UNPROVIDED, UNPROVIDED);
										}
									}
								}
							}
						}
					}
				}
			}
			com.cyc.cycjava.cycl.java_backend.java_backend_write_native_constant(constant_id, stream);
			write_string(ending, stream, UNPROVIDED, UNPROVIDED);
		}
		return NIL;
	}

	public static SubLObject java_backend_write_internal_constant_reference(final SubLObject constant_id, final SubLObject constant_form, final SubLObject stream) {
		if (NIL != system_translation.current_system_translation_secureP()) {
			format(stream, $str332$_ic_S_, constant_id);
			return NIL;
		}
		SubLObject ending = $str333$;
		if (constant_form.isString()) {
			write_string($str334$_str, stream, UNPROVIDED, UNPROVIDED);
			ending = cconcatenate($str250$_, canonicalize_string_to_variable_name(constant_form, UNPROVIDED));
		} else if (constant_form.isKeyword()) {
			write_string($str335$_kw, stream, UNPROVIDED, UNPROVIDED);
			ending = cconcatenate($str250$_, canonicalize_string_to_variable_name(symbol_name(constant_form), $int$64));
		} else if (constant_form.isSymbol()) {
			write_string($str337$_sym, stream, UNPROVIDED, UNPROVIDED);
			ending = cconcatenate($str250$_, canonicalize_string_to_variable_name(symbol_name(constant_form), $int$64));
		} else if (constant_form.isInteger()) {
			write_string($str338$_int, stream, UNPROVIDED, UNPROVIDED);
			ending = cconcatenate($str250$_, canonicalize_string_to_variable_name(string_utilities.to_string(constant_form), UNPROVIDED));
		} else if (constant_form.isDouble()) {
			write_string($str339$_float, stream, UNPROVIDED, UNPROVIDED);
			final SubLObject base_float = string_utilities.to_string(constant_form);
			final SubLObject fixed = Strings.string_downcase(remove(CHAR_plus, base_float, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
			ending = cconcatenate($str250$_, canonicalize_string_to_variable_name(fixed, UNPROVIDED));
		} else if (constant_form.isList()) {
			write_string($str340$_list, stream, UNPROVIDED, UNPROVIDED);
		} else if (constant_form.isChar()) {
			write_string($str341$_char, stream, UNPROVIDED, UNPROVIDED);
			ending = cconcatenate($str250$_, canonicalize_string_to_variable_name(string_utilities.to_string(constant_form), UNPROVIDED));
		} else if (NIL != constant_p(constant_form)) {
			write_string($str342$_const, stream, UNPROVIDED, UNPROVIDED);
			ending = cconcatenate($str250$_, canonicalize_string_to_variable_name(constants_high.constant_name(constant_form), UNPROVIDED));
		} else {
			write_string($str343$_ic, stream, UNPROVIDED, UNPROVIDED);
		}

		java_backend_write_native_constant(constant_id, stream);
		write_string(ending, stream, UNPROVIDED, UNPROVIDED);
		return NIL;
	}

	public static final SubLObject java_backend_write_Xinternal_constant_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			SubLObject constant_id = NIL;
			SubLObject constant_form = NIL;
			SubLObject load_form = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt292);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt292);
			constant_id = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt292);
			constant_form = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt292);
			load_form = current.first();
			current = current.rest();
			if (NIL == current) {
				list_utilities.verify_operator(operator, $sym62$_INTERNAL_CONSTANT);
				{
					SubLObject final_load_form = com.cyc.cycjava.cycl.java_backend.java_backend_possibly_create_initializer_method(constant_id, load_form);
					SubLObject type = com.cyc.cycjava.cycl.java_backend.java_backend_Xinternal_constant_type(final_load_form);
					write_string($str_alt293$public_static_final_, stream, UNPROVIDED, UNPROVIDED);
					write_string(type, stream, UNPROVIDED, UNPROVIDED);
					write_string($str_alt172$_, stream, UNPROVIDED, UNPROVIDED);
					com.cyc.cycjava.cycl.java_backend.java_backend_write_internal_constant_reference(constant_id, constant_form, stream);
					com.cyc.cycjava.cycl.java_backend.java_backend_write_assignment_operator(stream);
					com.cyc.cycjava.cycl.java_backend.java_backend_write_form(final_load_form, stream, number_utilities.f_1X(depth));
				}
			} else {
				cdestructuring_bind_error(datum, $list_alt292);
			}
		}
		return T;
	}

	public static SubLObject java_backend_write_Xinternal_constant(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		SubLObject constant_id = NIL;
		SubLObject constant_form = NIL;
		SubLObject load_form = NIL;
		destructuring_bind_must_consp(form, form, $list344);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list344);
		constant_id = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list344);
		constant_form = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list344);
		load_form = current.first();
		current = current.rest();
		if (NIL == current) {
			list_utilities.verify_operator(operator, $sym96$_INTERNAL_CONSTANT);
			final SubLObject final_load_form = java_backend_possibly_create_initializer_method(constant_id, load_form);
			final SubLObject type = java_backend_Xinternal_constant_type(final_load_form);
			write_string($$$private_static_final_, stream, UNPROVIDED, UNPROVIDED);
			write_string(type, stream, UNPROVIDED, UNPROVIDED);
			write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
			java_backend_write_internal_constant_reference(constant_id, constant_form, stream);
			java_backend_write_assignment_operator(stream);
			java_backend_write_form(final_load_form, stream, number_utilities.f_1X(depth));
		} else {
			cdestructuring_bind_error(form, $list344);
		}
		return T;
	}

	public static final SubLObject java_backend_Xinternal_constant_type_alt(SubLObject load_form) {
		{
			SubLObject datum = load_form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			SubLObject args = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt294);
			operator = current.first();
			current = current.rest();
			args = current;
			if (NIL != list_utilities.member_eqP(operator, $list_alt295)) {
				return $$$SubLList;
			}
			if (operator != $sym92$_LF) {
				return $$$SubLObject;
			}
			{
				SubLObject datum_30 = args;
				SubLObject current_31 = datum_30;
				SubLObject arg = NIL;
				destructuring_bind_must_consp(current_31, datum_30, $list_alt297);
				arg = current_31.first();
				current_31 = current_31.rest();
				if (NIL == current_31) {
					if (arg.isString()) {
						return $$$SubLString;
					} else {
						if (arg.isSymbol()) {
							return $$$SubLSymbol;
						} else {
							if (arg.isInteger()) {
								return $$$SubLInteger;
							} else {
								if (arg.isDouble()) {
									return $$$SubLFloat;
								} else {
									if (arg.isChar()) {
										return $$$SubLCharacter;
									} else {
										if (arg.isPackage()) {
											return $$$SubLPackage;
										} else {
											return $$$SubLObject;
										}
									}
								}
							}
						}
					}
				} else {
					cdestructuring_bind_error(datum_30, $list_alt297);
				}
			}
		}
		return NIL;
	}

	public static SubLObject java_backend_Xinternal_constant_type(final SubLObject load_form) {
		SubLObject operator = NIL;
		SubLObject args = NIL;
		destructuring_bind_must_consp(load_form, load_form, $list346);
		operator = load_form.first();
		final SubLObject current = args = load_form.rest();
		if (NIL != list_utilities.member_eqP(operator, $list347)) {
			return $$$SubLList;
		}
		if (operator != $sym127$_LF) {
			return $$$SubLObject;
		}
		SubLObject current_$36;
		final SubLObject datum_$35 = current_$36 = args;
		SubLObject arg = NIL;
		destructuring_bind_must_consp(current_$36, datum_$35, $list349);
		arg = current_$36.first();
		current_$36 = current_$36.rest();
		if (NIL != current_$36) {
			cdestructuring_bind_error(datum_$35, $list349);
			return NIL;
		}
		if (arg.isString()) {
			return $$$SubLString;
		}
		if (arg.isSymbol()) {
			return $$$SubLSymbol;
		}
		if (arg.isInteger()) {
			return $$$SubLInteger;
		}
		if (arg.isDouble()) {
			return $$$SubLFloat;
		}
		if (arg.isChar()) {
			return $$$SubLCharacter;
		}
		if (arg.isPackage()) {
			return $$$SubLPackage;
		}
		return $$$SubLObject;
	}

	public static final SubLObject java_backend_possibly_create_initializer_method_alt(SubLObject constant_id, SubLObject load_form) {
		{
			SubLObject form_size = list_utilities.cons_count(load_form);
			if (form_size.numG($java_backend_initializer_size_threshold$.getGlobalValue())) {
				{
					SubLObject initializer_name = cconcatenate($str_alt304$_CONSTANT_, new SubLObject[] { format_nil.format_nil_s_no_copy(constant_id), $str_alt305$_INITIALIZER });
					SubLObject initializer = make_symbol(initializer_name);
					SubLObject initializer_method = list(DEFINE, initializer, NIL, list(RET, load_form));
					com.cyc.cycjava.cycl.java_backend.java_backend_note_initializer_method(initializer_method);
					return list(initializer);
				}
			}
		}
		return load_form;
	}

	public static SubLObject java_backend_possibly_create_initializer_method(final SubLObject constant_id, final SubLObject load_form) {
		final SubLObject form_size = list_utilities.cons_count(load_form);
		if (form_size.numG($java_backend_initializer_size_threshold$.getGlobalValue())) {
			final SubLObject initializer_name = cconcatenate($str356$_CONSTANT_, new SubLObject[] { format_nil.format_nil_s_no_copy(constant_id), $str357$_INITIALIZER });
			final SubLObject initializer = make_symbol(initializer_name);
			final SubLObject initializer_method = list(DEFINE, initializer, NIL, list(RET, load_form));
			java_backend_note_initializer_method(initializer_method);
			return list(initializer);
		}
		return load_form;
	}

	public static final SubLObject java_backend_write_Xlf_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject datum = form;
				SubLObject current = datum;
				SubLObject operator = NIL;
				SubLObject v_object = NIL;
				destructuring_bind_must_consp(current, datum, $list_alt306);
				operator = current.first();
				current = current.rest();
				destructuring_bind_must_consp(current, datum, $list_alt306);
				v_object = current.first();
				current = current.rest();
				if (NIL == current) {
					list_utilities.verify_operator(operator, $sym92$_LF);
					{
						SubLObject load_form = NIL;
						if (v_object.isString()) {
							load_form = list($sym307$_CSTRING, v_object);
						} else {
							if (v_object.isSymbol()) {
								{
									SubLObject name = system_translation.current_system_translation_secure_symbol_name(v_object);
									SubLObject v_package = symbol_package(v_object);
									if (v_object.isKeyword()) {
										load_form = list($sym308$_CKEYWORD, name);
									} else {
										if (v_object == find_symbol(name, $package$.getDynamicValue(thread))) {
											load_form = list($sym309$_CINTERN, name);
										} else {
											if (NIL == v_package) {
												load_form = list($sym310$_CMAKE_SYMBOL, name);
											} else {
												load_form = list($sym311$_CSYMBOL, name, package_name(v_package));
											}
										}
									}
								}
							} else {
								if (v_object.isFixnum()) {
									load_form = list($sym312$_CFIX, v_object);
								} else {
									if (v_object.isBignum()) {
										load_form = list($sym313$_CBIG, princ_to_string(v_object));
									} else {
										if (v_object.isDouble()) {
											load_form = list($sym314$_CFLOAT, v_object);
										} else {
											if (v_object.isChar()) {
												load_form = list($sym315$_CCHAR, char_code(v_object));
											} else {
												if (v_object.isPackage()) {
													load_form = list($sym316$_CPACKAGE, package_name(v_object));
												} else {
													if (NIL != Guids.guid_p(v_object)) {
														load_form = list($sym317$_CGUID, Guids.guid_to_string(v_object));
													} else {
														Errors.error($str_alt318$Time_to_add__LF_support_for__S, v_object);
													}
												}
											}
										}
									}
								}
							}
						}
						com.cyc.cycjava.cycl.java_backend.java_backend_write_form(load_form, stream, depth);
					}
				} else {
					cdestructuring_bind_error(datum, $list_alt306);
				}
			}
			return NIL;
		}
	}

	public static SubLObject java_backend_write_Xlf(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		SubLObject v_object = NIL;
		destructuring_bind_must_consp(form, form, $list358);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list358);
		v_object = current.first();
		current = current.rest();
		if (NIL == current) {
			list_utilities.verify_operator(operator, $sym127$_LF);
			SubLObject load_form = NIL;
			if (v_object.isString()) {
				load_form = list($sym359$_CSTRING, v_object);
			} else if (v_object.isSymbol()) {
				load_form = java_backend_symbol_load_form(v_object);
			} else if (NIL != target_fixnum_p(v_object)) {
				load_form = list($sym360$_CFIX, v_object);
			} else if (v_object.isBignum()) {
				load_form = list($sym361$_CBIG, princ_to_string(v_object));
			} else if (v_object.isDouble()) {
				load_form = list($sym362$_CFLOAT, v_object);
			} else if (v_object.isChar()) {
				load_form = list($sym363$_CCHAR, char_code(v_object));
			} else if (v_object.isPackage()) {
				load_form = list($sym364$_CPACKAGE, package_name(v_object));
			} else if (NIL != Guids.guid_p(v_object)) {
				load_form = list($sym365$_CGUID, Guids.guid_to_string(v_object));
			} else {
				Errors.error($str366$Time_to_add__LF_support_for__S, v_object);
			}

			java_backend_write_form(load_form, stream, depth);
		} else {
			cdestructuring_bind_error(form, $list358);
		}
		return NIL;
	}

	public static SubLObject target_fixnum_p(final SubLObject v_object) {
		return makeBoolean((v_object.isInteger() && v_object.numLE($target_most_positive_int$.getGlobalValue())) && $target_most_negative_int$.getGlobalValue().numLE(v_object));
	}

	public static SubLObject java_backend_symbol_load_form(final SubLObject symbol) {
		return c_backend.c_backend_symbol_load_form(symbol);
	}

	public static final SubLObject java_backend_write_Xlocal_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			SubLObject variable = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt319);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt319);
			variable = current.first();
			current = current.rest();
			{
				SubLObject initialization = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
				SubLObject initializedP = consp(current);
				destructuring_bind_must_listp(current, datum, $list_alt319);
				current = current.rest();
				{
					SubLObject type = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
					destructuring_bind_must_listp(current, datum, $list_alt319);
					current = current.rest();
					{
						SubLObject finalP = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
						destructuring_bind_must_listp(current, datum, $list_alt319);
						current = current.rest();
						if (NIL == current) {
							list_utilities.verify_operator(operator, $sym129$_LOCAL);
							com.cyc.cycjava.cycl.java_backend.java_backend_add_local_variable_to_scope(variable);
							if (NIL != finalP) {
								write_string($str_alt186$final_, stream, UNPROVIDED, UNPROVIDED);
							}
							if (NIL != type) {
								write_string(type, stream, UNPROVIDED, UNPROVIDED);
							} else {
								com.cyc.cycjava.cycl.java_backend.java_backend_write_object_data_type(stream);
							}
							write_string($str_alt172$_, stream, UNPROVIDED, UNPROVIDED);
							com.cyc.cycjava.cycl.java_backend.java_backend_write_form(variable, stream, depth);
							if (NIL != initializedP) {
								com.cyc.cycjava.cycl.java_backend.java_backend_write_assignment_operator(stream);
								com.cyc.cycjava.cycl.java_backend.java_backend_write_form(initialization, stream, depth);
							}
						} else {
							cdestructuring_bind_error(datum, $list_alt319);
						}
					}
				}
			}
		}
		return T;
	}

	public static SubLObject java_backend_write_Xlocal(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		SubLObject variable = NIL;
		destructuring_bind_must_consp(form, form, $list368);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list368);
		variable = current.first();
		current = current.rest();
		final SubLObject initialization = (current.isCons()) ? current.first() : NIL;
		final SubLObject initializedP = consp(current);
		destructuring_bind_must_listp(current, form, $list368);
		current = current.rest();
		final SubLObject type = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, form, $list368);
		current = current.rest();
		final SubLObject finalP = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, form, $list368);
		current = current.rest();
		if (NIL == current) {
			list_utilities.verify_operator(operator, $sym172$_LOCAL);
			java_backend_add_local_variable_to_scope(variable);
			if (NIL != finalP) {
				write_string($$$final_, stream, UNPROVIDED, UNPROVIDED);
			}
			if (NIL != type) {
				write_string(type, stream, UNPROVIDED, UNPROVIDED);
			} else {
				java_backend_write_object_data_type(stream);
			}
			write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
			java_backend_write_form(variable, stream, depth);
			if (NIL != initializedP) {
				java_backend_write_assignment_operator(stream);
				java_backend_write_form(initialization, stream, depth);
			}
		} else {
			cdestructuring_bind_error(form, $list368);
		}
		return T;
	}

	public static final SubLObject java_backend_write_multiple_value_list_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject datum = form;
				SubLObject current = datum;
				SubLObject operator = NIL;
				SubLObject expression = NIL;
				destructuring_bind_must_consp(current, datum, $list_alt320);
				operator = current.first();
				current = current.rest();
				destructuring_bind_must_consp(current, datum, $list_alt320);
				expression = current.first();
				current = current.rest();
				if (NIL == current) {
					list_utilities.verify_operator(operator, MULTIPLE_VALUE_LIST);
					return com.cyc.cycjava.cycl.java_backend.java_backend_write_form(list($sym322$_ARG2, $list_alt323, list($sym324$_MULTIPLE_VALUE_LIST, expression)), stream, depth);
				} else {
					cdestructuring_bind_error(datum, $list_alt320);
				}
			}
			return NIL;
		}
	}

	public static SubLObject java_backend_write_multiple_value_list(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject operator = NIL;
		SubLObject expression = NIL;
		destructuring_bind_must_consp(form, form, $list369);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list369);
		expression = current.first();
		current = current.rest();
		if (NIL == current) {
			list_utilities.verify_operator(operator, MULTIPLE_VALUE_LIST);
			return java_backend_write_form(list($sym371$_ARG2, $list372, list($sym373$_MULTIPLE_VALUE_LIST, expression)), stream, depth);
		}
		cdestructuring_bind_error(form, $list369);
		return NIL;
	}

	public static final SubLObject java_backend_write_Xnc_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			SubLObject constant = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt72);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt72);
			constant = current.first();
			current = current.rest();
			if (NIL == current) {
				list_utilities.verify_operator(operator, $sym325$_NC);
				{
					SubLObject pcase_var = constant;
					if (pcase_var.eql($sym326$_TRUE)) {
						write_string($$$true, stream, UNPROVIDED, UNPROVIDED);
					} else {
						if (pcase_var.eql($sym328$_FALSE)) {
							write_string($$$false, stream, UNPROVIDED, UNPROVIDED);
						} else {
							if (pcase_var.eql($sym330$_NULL)) {
								write_string($$$null, stream, UNPROVIDED, UNPROVIDED);
							} else {
								if (pcase_var.eql($sym332$_UNPROVIDED)) {
									com.cyc.cycjava.cycl.java_backend.java_backend_write_function_call_unprovided_argument(stream);
								} else {
									if (pcase_var.eql($sym333$_EMPTY_ARRAY)) {
										write_string($str_alt334$EMPTY_SUBL_OBJECT_ARRAY, stream, UNPROVIDED, UNPROVIDED);
									} else {
										Errors.error($str_alt335$Unexpected_native_constant__S, constant);
									}
								}
							}
						}
					}
				}
			} else {
				cdestructuring_bind_error(datum, $list_alt72);
			}
		}
		return NIL;
	}

	public static SubLObject java_backend_write_Xnc(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		SubLObject constant = NIL;
		destructuring_bind_must_consp(form, form, $list106);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list106);
		constant = current.first();
		current = current.rest();
		if (NIL == current) {
			list_utilities.verify_operator(operator, $sym374$_NC);
			final SubLObject pcase_var = constant;
			if (pcase_var.eql($sym375$_TRUE)) {
				write_string($$$true, stream, UNPROVIDED, UNPROVIDED);
			} else if (pcase_var.eql($sym377$_FALSE)) {
				write_string($$$false, stream, UNPROVIDED, UNPROVIDED);
			} else if (pcase_var.eql($sym379$_NULL)) {
				write_string($$$null, stream, UNPROVIDED, UNPROVIDED);
			} else if (pcase_var.eql($sym381$_UNPROVIDED)) {
				java_backend_write_function_call_unprovided_argument(stream);
			} else if (pcase_var.eql($sym382$_EMPTY_ARRAY)) {
				write_string($str383$EMPTY_SUBL_OBJECT_ARRAY, stream, UNPROVIDED, UNPROVIDED);
			} else {
				Errors.error($str384$Unexpected_native_constant__S, constant);
			}

		} else {
			cdestructuring_bind_error(form, $list106);
		}
		return NIL;
	}

	public static final SubLObject java_backend_write_Xnot_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		list_utilities.verify_form_with_operator(form, $sym336$_NOT);
		form = com.cyc.cycjava.cycl.java_backend.java_backend_possibly_optimize_Xnot(form);
		if (NIL == list_utilities.form_with_operator_p(form, $sym336$_NOT)) {
			return com.cyc.cycjava.cycl.java_backend.java_backend_write_form(form, stream, depth);
		}
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			SubLObject expression = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt320);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt320);
			expression = current.first();
			current = current.rest();
			if (NIL == current) {
				list_utilities.verify_operator(operator, $sym336$_NOT);
				write_string($str_alt337$___, stream, UNPROVIDED, UNPROVIDED);
				com.cyc.cycjava.cycl.java_backend.java_backend_write_form(expression, stream, number_utilities.f_1X(depth));
				write_string($str_alt338$__, stream, UNPROVIDED, UNPROVIDED);
				return NIL;
			} else {
				cdestructuring_bind_error(datum, $list_alt320);
			}
		}
		return NIL;
	}

	public static SubLObject java_backend_write_Xnot(SubLObject form, final SubLObject stream, final SubLObject depth) {
		list_utilities.verify_form_with_operator(form, $sym385$_NOT);
		form = java_backend_possibly_optimize_Xnot(form);
		if (NIL == list_utilities.form_with_operator_p(form, $sym385$_NOT)) {
			return java_backend_write_form(form, stream, depth);
		}
		SubLObject current;
		final SubLObject datum = current = form;
		SubLObject operator = NIL;
		SubLObject expression = NIL;
		destructuring_bind_must_consp(current, datum, $list369);
		operator = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list369);
		expression = current.first();
		current = current.rest();
		if (NIL == current) {
			list_utilities.verify_operator(operator, $sym385$_NOT);
			write_string($str386$___, stream, UNPROVIDED, UNPROVIDED);
			java_backend_write_form(expression, stream, number_utilities.f_1X(depth));
			write_string($str387$__, stream, UNPROVIDED, UNPROVIDED);
			return NIL;
		}
		cdestructuring_bind_error(datum, $list369);
		return NIL;
	}

	public static final SubLObject java_backend_possibly_optimize_Xnot_alt(SubLObject form) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			SubLObject expression = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt320);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt320);
			expression = current.first();
			current = current.rest();
			if (NIL == current) {
				list_utilities.verify_operator(operator, $sym336$_NOT);
				if (NIL != list_utilities.form_with_operator_p(expression, $sym339$_DTB)) {
					expression = com.cyc.cycjava.cycl.java_backend.java_backend_optimize_function_call_form(expression);
					if (NIL == list_utilities.form_with_operator_p(expression, $sym339$_DTB)) {
						return com.cyc.cycjava.cycl.java_backend.java_backend_possibly_optimize_Xnot(list($sym336$_NOT, expression));
					}
					{
						SubLObject sub_expression = second(expression);
						if (sub_expression.isCons() && (NIL != list_utilities.form_with_operator_p(sub_expression, EQ))) {
							{
								SubLObject sub_args = sub_expression.rest();
								return bq_cons($sym340$_NOT____, append(sub_args, NIL));
							}
						} else {
							return list($sym230$___, $list_alt341, sub_expression);
						}
					}
				} else {
					if (NIL != list_utilities.form_with_operator_p(expression, $sym336$_NOT)) {
						{
							SubLObject arg = second(expression);
							return arg;
						}
					} else {
						if (NIL != list_utilities.form_with_operator_p(expression, $sym230$___)) {
							{
								SubLObject args = expression.rest();
								return bq_cons($sym340$_NOT____, append(args, NIL));
							}
						} else {
							if (NIL != list_utilities.form_with_operator_p(expression, $sym340$_NOT____)) {
								{
									SubLObject args = expression.rest();
									return bq_cons($sym230$___, append(args, NIL));
								}
							} else {
								return form;
							}
						}
					}
				}
			} else {
				cdestructuring_bind_error(datum, $list_alt320);
			}
		}
		return NIL;
	}

	public static SubLObject java_backend_possibly_optimize_Xnot(final SubLObject form) {
		SubLObject operator = NIL;
		SubLObject expression = NIL;
		destructuring_bind_must_consp(form, form, $list369);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list369);
		expression = current.first();
		current = current.rest();
		if (NIL != current) {
			cdestructuring_bind_error(form, $list369);
			return NIL;
		}
		list_utilities.verify_operator(operator, $sym385$_NOT);
		if (NIL != list_utilities.form_with_operator_p(expression, $sym388$_DTB)) {
			expression = java_backend_optimize_function_call_form(expression);
			if (NIL == list_utilities.form_with_operator_p(expression, $sym388$_DTB)) {
				return java_backend_possibly_optimize_Xnot(list($sym385$_NOT, expression));
			}
			final SubLObject sub_expression = second(expression);
			if (sub_expression.isCons() && (NIL != list_utilities.form_with_operator_p(sub_expression, EQ))) {
				final SubLObject sub_args = sub_expression.rest();
				return bq_cons($sym149$_NOT____, append(sub_args, NIL));
			}
			return list($sym273$___, $list150, sub_expression);
		} else {
			if (NIL != list_utilities.form_with_operator_p(expression, $sym385$_NOT)) {
				final SubLObject arg = second(expression);
				return arg;
			}
			if (NIL != list_utilities.form_with_operator_p(expression, $sym273$___)) {
				final SubLObject args = expression.rest();
				return bq_cons($sym149$_NOT____, append(args, NIL));
			}
			if (NIL != list_utilities.form_with_operator_p(expression, $sym149$_NOT____)) {
				final SubLObject args = expression.rest();
				return bq_cons($sym273$___, append(args, NIL));
			}
			return form;
		}
	}

	public static final SubLObject java_backend_write_nth_value_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			SubLObject n = NIL;
			SubLObject expression = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt342);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt342);
			n = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt342);
			expression = current.first();
			current = current.rest();
			if (NIL == current) {
				list_utilities.verify_operator(operator, NTH_VALUE);
				return com.cyc.cycjava.cycl.java_backend.java_backend_write_form(list($sym344$_NTH_VALUE_STEP_2, list($sym345$_NTH_VALUE_STEP_1, n), expression), stream, depth);
			} else {
				cdestructuring_bind_error(datum, $list_alt342);
			}
		}
		return NIL;
	}

	public static SubLObject java_backend_write_nth_value(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		SubLObject n = NIL;
		SubLObject expression = NIL;
		destructuring_bind_must_consp(form, form, $list389);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list389);
		n = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list389);
		expression = current.first();
		current = current.rest();
		if (NIL == current) {
			list_utilities.verify_operator(operator, NTH_VALUE);
			return java_backend_write_form(list($sym391$_NTH_VALUE_STEP_2, list($sym392$_NTH_VALUE_STEP_1, n), expression), stream, depth);
		}
		cdestructuring_bind_error(form, $list389);
		return NIL;
	}

	public static final SubLObject java_backend_write_Xor_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt257);
			operator = current.first();
			current = current.rest();
			{
				SubLObject expressions = current;
				list_utilities.verify_operator(operator, $sym346$_OR);
				if (NIL == expressions) {
					com.cyc.cycjava.cycl.java_backend.java_backend_write_Xnc($list_alt347, stream, number_utilities.f_1X(depth));
				} else {
					if (NIL != list_utilities.singletonP(expressions)) {
						com.cyc.cycjava.cycl.java_backend.java_backend_write_form(expressions.first(), stream, number_utilities.f_1X(depth));
					} else {
						write_string($str_alt93$_, stream, UNPROVIDED, UNPROVIDED);
						com.cyc.cycjava.cycl.java_backend.java_backend_write_form(expressions.first(), stream, number_utilities.f_1X(depth));
						{
							SubLObject cdolist_list_var = expressions.rest();
							SubLObject expression = NIL;
							for (expression = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), expression = cdolist_list_var.first()) {
								terpri(stream);
								com.cyc.cycjava.cycl.java_backend.java_backend_indent(stream, number_utilities.f_1X(depth));
								write_string($str_alt348$___, stream, UNPROVIDED, UNPROVIDED);
								com.cyc.cycjava.cycl.java_backend.java_backend_write_form(expression, stream, number_utilities.f_1X(depth));
							}
						}
						write_string($str_alt95$_, stream, UNPROVIDED, UNPROVIDED);
					}
				}
			}
		}
		return NIL;
	}

	public static SubLObject java_backend_write_Xor(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		destructuring_bind_must_consp(form, form, $list309);
		operator = form.first();
		final SubLObject expressions;
		final SubLObject current = expressions = form.rest();
		list_utilities.verify_operator(operator, $sym393$_OR);
		if (NIL == expressions) {
			java_backend_write_Xnc($list394, stream, number_utilities.f_1X(depth));
		} else if (NIL != list_utilities.singletonP(expressions)) {
			java_backend_write_form(expressions.first(), stream, number_utilities.f_1X(depth));
		} else {
			write_string($str130$_, stream, UNPROVIDED, UNPROVIDED);
			java_backend_write_form(expressions.first(), stream, number_utilities.f_1X(depth));
			SubLObject cdolist_list_var = expressions.rest();
			SubLObject expression = NIL;
			expression = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				terpri(stream);
				java_backend_indent(stream, number_utilities.f_1X(depth));
				write_string($str395$___, stream, UNPROVIDED, UNPROVIDED);
				java_backend_write_form(expression, stream, number_utilities.f_1X(depth));
				cdolist_list_var = cdolist_list_var.rest();
				expression = cdolist_list_var.first();
			}
			write_string($str132$_, stream, UNPROVIDED, UNPROVIDED);
		}

		return NIL;
	}

	public static final SubLObject java_backend_write_Xregister_function_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject datum = form;
				SubLObject current = datum;
				SubLObject operator = NIL;
				SubLObject function = NIL;
				SubLObject required_count = NIL;
				SubLObject optional_count = NIL;
				SubLObject restP = NIL;
				destructuring_bind_must_consp(current, datum, $list_alt349);
				operator = current.first();
				current = current.rest();
				destructuring_bind_must_consp(current, datum, $list_alt349);
				function = current.first();
				current = current.rest();
				destructuring_bind_must_consp(current, datum, $list_alt349);
				required_count = current.first();
				current = current.rest();
				destructuring_bind_must_consp(current, datum, $list_alt349);
				optional_count = current.first();
				current = current.rest();
				destructuring_bind_must_consp(current, datum, $list_alt349);
				restP = current.first();
				current = current.rest();
				if (NIL == current) {
					{
						SubLObject name = system_translation.current_system_translation_secure_symbol_name(function);
						list_utilities.verify_operator(operator, $sym350$_REGISTER_FUNCTION);
						write_string($$$declareFunction, stream, UNPROVIDED, UNPROVIDED);
						write_string($str_alt93$_, stream, UNPROVIDED, UNPROVIDED);
						write_string($$$me, stream, UNPROVIDED, UNPROVIDED);
						com.cyc.cycjava.cycl.java_backend.java_backend_write_function_argument_separator(stream);
						com.cyc.cycjava.cycl.java_backend.java_backend_write_form(java_name_translation.java_backend_function_name(function), stream, number_utilities.f_1X(depth));
						com.cyc.cycjava.cycl.java_backend.java_backend_write_function_argument_separator(stream);
						com.cyc.cycjava.cycl.java_backend.java_backend_write_form(name, stream, number_utilities.f_1X(depth));
						com.cyc.cycjava.cycl.java_backend.java_backend_write_function_argument_separator(stream);
						com.cyc.cycjava.cycl.java_backend.java_backend_write_form(required_count, stream, number_utilities.f_1X(depth));
						com.cyc.cycjava.cycl.java_backend.java_backend_write_function_argument_separator(stream);
						com.cyc.cycjava.cycl.java_backend.java_backend_write_form(optional_count, stream, number_utilities.f_1X(depth));
						com.cyc.cycjava.cycl.java_backend.java_backend_write_function_argument_separator(stream);
						com.cyc.cycjava.cycl.java_backend.java_backend_write_Xnc(NIL != restP ? ((SubLObject) ($list_alt248)) : $list_alt347, stream, number_utilities.f_1X(depth));
						write_string($str_alt95$_, stream, UNPROVIDED, UNPROVIDED);
						if (NIL != $java_backend_funcall_optimization_enabledP$.getDynamicValue(thread)) {
							if (NIL != com.cyc.cycjava.cycl.java_backend.java_backend_likely_zero_arity_funcall_function_p(function)) {
								com.cyc.cycjava.cycl.java_backend.java_backend_write_zero_arity_function_class_initializer(function, stream);
							}
							if (NIL != com.cyc.cycjava.cycl.java_backend.java_backend_likely_unary_funcall_function_p(function)) {
								com.cyc.cycjava.cycl.java_backend.java_backend_write_unary_function_class_initializer(function, stream);
							}
							if (NIL != com.cyc.cycjava.cycl.java_backend.java_backend_likely_binary_funcall_function_p(function)) {
								com.cyc.cycjava.cycl.java_backend.java_backend_write_binary_function_class_initializer(function, stream);
							}
						}
					}
				} else {
					cdestructuring_bind_error(datum, $list_alt349);
				}
			}
			return T;
		}
	}

	public static SubLObject java_backend_write_Xregister_function(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject operator = NIL;
		SubLObject function = NIL;
		SubLObject required_count = NIL;
		SubLObject optional_count = NIL;
		SubLObject restP = NIL;
		destructuring_bind_must_consp(form, form, $list396);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list396);
		function = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list396);
		required_count = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list396);
		optional_count = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list396);
		restP = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject name = system_translation.current_system_translation_secure_symbol_name(function);
			list_utilities.verify_operator(operator, $sym397$_REGISTER_FUNCTION);
			write_string($$$declareFunction, stream, UNPROVIDED, UNPROVIDED);
			write_string($str130$_, stream, UNPROVIDED, UNPROVIDED);
			write_string(makeString("me"), stream, UNPROVIDED, UNPROVIDED);
			java_backend_write_function_argument_separator(stream);
			java_backend_write_form(java_name_translation.java_backend_function_name(function), stream, number_utilities.f_1X(depth));
			java_backend_write_function_argument_separator(stream);
			java_backend_write_form(name, stream, number_utilities.f_1X(depth));
			java_backend_write_function_argument_separator(stream);
			java_backend_write_form(required_count, stream, number_utilities.f_1X(depth));
			java_backend_write_function_argument_separator(stream);
			java_backend_write_form(optional_count, stream, number_utilities.f_1X(depth));
			java_backend_write_function_argument_separator(stream);
			java_backend_write_Xnc(NIL != restP ? $list292 : $list394, stream, number_utilities.f_1X(depth));
			write_string($str132$_, stream, UNPROVIDED, UNPROVIDED);
			if (NIL != $java_backend_funcall_optimization_enabledP$.getDynamicValue(thread)) {
				if (NIL != java_backend_likely_zero_arity_funcall_function_p(function)) {
					java_backend_write_zero_arity_function_class_initializer(function, stream);
				}
				if (NIL != java_backend_likely_unary_funcall_function_p(function)) {
					java_backend_write_unary_function_class_initializer(function, stream);
				}
				if (NIL != java_backend_likely_binary_funcall_function_p(function)) {
					java_backend_write_binary_function_class_initializer(function, stream);
				}
			}
		} else {
			cdestructuring_bind_error(form, $list396);
		}
		return T;
	}

	public static final SubLObject java_backend_write_Xregister_global_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			SubLObject definer = NIL;
			SubLObject global = NIL;
			SubLObject initialization = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt353);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt353);
			definer = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt353);
			global = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt353);
			initialization = current.first();
			current = current.rest();
			if (NIL == current) {
				{
					SubLObject name = system_translation.current_system_translation_secure_symbol_name(global);
					list_utilities.verify_operator(operator, $sym354$_REGISTER_GLOBAL);
					com.cyc.cycjava.cycl.java_backend.java_backend_write_form(global, stream, number_utilities.f_1X(depth));
					com.cyc.cycjava.cycl.java_backend.java_backend_write_assignment_operator(stream);
					com.cyc.cycjava.cycl.java_backend.java_backend_write_global_definer(definer, stream);
					write_string($str_alt93$_, stream, UNPROVIDED, UNPROVIDED);
					com.cyc.cycjava.cycl.java_backend.java_backend_write_form(name, stream, number_utilities.f_1X(depth));
					com.cyc.cycjava.cycl.java_backend.java_backend_write_function_argument_separator(stream);
					com.cyc.cycjava.cycl.java_backend.java_backend_write_form(initialization, stream, number_utilities.f_1X(depth));
					write_string($str_alt95$_, stream, UNPROVIDED, UNPROVIDED);
				}
			} else {
				cdestructuring_bind_error(datum, $list_alt353);
			}
		}
		return T;
	}

	public static SubLObject java_backend_write_Xregister_global(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		SubLObject definer = NIL;
		SubLObject global = NIL;
		SubLObject initialization = NIL;
		destructuring_bind_must_consp(form, form, $list400);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list400);
		definer = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list400);
		global = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list400);
		initialization = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject name = system_translation.current_system_translation_secure_symbol_name(global);
			list_utilities.verify_operator(operator, $sym401$_REGISTER_GLOBAL);
			java_backend_write_form(global, stream, number_utilities.f_1X(depth));
			java_backend_write_assignment_operator(stream);
			java_backend_write_global_definer(definer, stream);
			write_string($str130$_, stream, UNPROVIDED, UNPROVIDED);
			java_backend_write_form(name, stream, number_utilities.f_1X(depth));
			java_backend_write_function_argument_separator(stream);
			java_backend_write_form(initialization, stream, number_utilities.f_1X(depth));
			write_string($str132$_, stream, UNPROVIDED, UNPROVIDED);
		} else {
			cdestructuring_bind_error(form, $list400);
		}
		return T;
	}

	public static final SubLObject java_backend_write_global_definer_alt(SubLObject definer, SubLObject stream) {
		if (definer == DEFVAR) {
			write_string($$$defvar, stream, UNPROVIDED, UNPROVIDED);
		} else {
			if (definer == DEFPARAMETER) {
				write_string($$$defparameter, stream, UNPROVIDED, UNPROVIDED);
			} else {
				if (definer == DEFLEXICAL) {
					write_string($$$deflexical, stream, UNPROVIDED, UNPROVIDED);
				} else {
					if (definer == DEFCONSTANT) {
						write_string($$$defconstant, stream, UNPROVIDED, UNPROVIDED);
					} else {
						Errors.error($str_alt359$Unexpected_definer__S, definer);
					}
				}
			}
		}
		return NIL;
	}

	public static SubLObject java_backend_write_global_definer(final SubLObject definer, final SubLObject stream) {
		if (definer == DEFVAR) {
			write_string($$$defvar, stream, UNPROVIDED, UNPROVIDED);
		} else if (definer == DEFPARAMETER) {
			write_string($$$defparameter, stream, UNPROVIDED, UNPROVIDED);
		} else if (definer == DEFLEXICAL) {
			write_string($$$deflexical, stream, UNPROVIDED, UNPROVIDED);
		} else if (definer == DEFCONSTANT) {
			write_string($$$defconstant, stream, UNPROVIDED, UNPROVIDED);
		} else {
			Errors.error($str406$Unexpected_definer__S, definer);
		}

		return NIL;
	}

	public static final SubLObject java_backend_write_Xregister_macro_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			SubLObject function = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt360);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt360);
			function = current.first();
			current = current.rest();
			if (NIL == current) {
				{
					SubLObject name = system_translation.current_system_translation_secure_symbol_name(function);
					list_utilities.verify_operator(operator, $sym361$_REGISTER_MACRO);
					write_string($$$declareMacro, stream, UNPROVIDED, UNPROVIDED);
					write_string($str_alt93$_, stream, UNPROVIDED, UNPROVIDED);
					write_string($$$me, stream, UNPROVIDED, UNPROVIDED);
					com.cyc.cycjava.cycl.java_backend.java_backend_write_function_argument_separator(stream);
					com.cyc.cycjava.cycl.java_backend.java_backend_write_form(java_name_translation.java_backend_function_name(function), stream, number_utilities.f_1X(depth));
					com.cyc.cycjava.cycl.java_backend.java_backend_write_function_argument_separator(stream);
					com.cyc.cycjava.cycl.java_backend.java_backend_write_form(name, stream, number_utilities.f_1X(depth));
					write_string($str_alt95$_, stream, UNPROVIDED, UNPROVIDED);
				}
			} else {
				cdestructuring_bind_error(datum, $list_alt360);
			}
		}
		return T;
	}

	public static SubLObject java_backend_write_Xregister_macro(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		SubLObject function = NIL;
		destructuring_bind_must_consp(form, form, $list407);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list407);
		function = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject name = system_translation.current_system_translation_secure_symbol_name(function);
			list_utilities.verify_operator(operator, $sym408$_REGISTER_MACRO);
			write_string($$$declareMacro, stream, UNPROVIDED, UNPROVIDED);
			write_string($str130$_, stream, UNPROVIDED, UNPROVIDED);
			write_string($$$me, stream, UNPROVIDED, UNPROVIDED);
			java_backend_write_function_argument_separator(stream);
			java_backend_write_form(java_name_translation.java_backend_function_name(function), stream, number_utilities.f_1X(depth));
			java_backend_write_function_argument_separator(stream);
			java_backend_write_form(name, stream, number_utilities.f_1X(depth));
			write_string($str132$_, stream, UNPROVIDED, UNPROVIDED);
		} else {
			cdestructuring_bind_error(form, $list407);
		}
		return T;
	}

	public static final SubLObject java_backend_current_thread_variable_alt() {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			return $java_backend_current_thread_variable$.getDynamicValue(thread);
		}
	}

	public static SubLObject java_backend_current_thread_variable() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return $java_backend_current_thread_variable$.getDynamicValue(thread);
	}

	public static final SubLObject java_backend_write_Xwith_current_thread_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject datum = form;
				SubLObject current = datum;
				SubLObject operator = NIL;
				SubLObject thread_var = NIL;
				destructuring_bind_must_consp(current, datum, $list_alt363);
				operator = current.first();
				current = current.rest();
				destructuring_bind_must_consp(current, datum, $list_alt363);
				thread_var = current.first();
				current = current.rest();
				{
					SubLObject body = current;
					list_utilities.verify_operator(operator, $sym364$_WITH_CURRENT_THREAD);
					{
						SubLObject expanded_form = listS(PROGN, listS($sym129$_LOCAL, thread_var, $list_alt365), append(body, NIL));
						SubLObject result = NIL;
						{
							SubLObject _prev_bind_0 = $java_backend_current_thread_variable$.currentBinding(thread);
							try {
								$java_backend_current_thread_variable$.bind(thread_var, thread);
								result = com.cyc.cycjava.cycl.java_backend.java_backend_write_form(expanded_form, stream, depth);
							} finally {
								$java_backend_current_thread_variable$.rebind(_prev_bind_0, thread);
							}
						}
						return result;
					}
				}
			}
		}
	}

	public static SubLObject java_backend_write_Xwith_current_thread(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject operator = NIL;
		SubLObject thread_var = NIL;
		destructuring_bind_must_consp(form, form, $list410);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list410);
		thread_var = current.first();
		final SubLObject body;
		current = body = current.rest();
		list_utilities.verify_operator(operator, $sym169$_WITH_CURRENT_THREAD);
		final SubLObject expanded_form = listS(PROGN, listS($sym172$_LOCAL, thread_var, $list411), append(body, NIL));
		SubLObject result = NIL;
		final SubLObject _prev_bind_0 = $java_backend_current_thread_variable$.currentBinding(thread);
		try {
			$java_backend_current_thread_variable$.bind(thread_var, thread);
			result = java_backend_write_form(expanded_form, stream, depth);
		} finally {
			$java_backend_current_thread_variable$.rebind(_prev_bind_0, thread);
		}
		return result;
	}

	public static final SubLObject java_backend_write_Xwith_error_handler_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject datum = form;
				SubLObject current = datum;
				SubLObject operator = NIL;
				destructuring_bind_must_consp(current, datum, $list_alt366);
				operator = current.first();
				current = current.rest();
				destructuring_bind_must_consp(current, datum, $list_alt366);
				{
					SubLObject temp = current.rest();
					current = current.first();
					{
						SubLObject handler = NIL;
						SubLObject catch_var = NIL;
						SubLObject error_var = NIL;
						destructuring_bind_must_consp(current, datum, $list_alt366);
						handler = current.first();
						current = current.rest();
						destructuring_bind_must_consp(current, datum, $list_alt366);
						catch_var = current.first();
						current = current.rest();
						destructuring_bind_must_consp(current, datum, $list_alt366);
						error_var = current.first();
						current = current.rest();
						if (NIL == current) {
							current = temp;
							{
								SubLObject body = current;
								list_utilities.verify_operator(operator, $sym367$_WITH_ERROR_HANDLER);
								{
									SubLObject expanded_form = list(CLET_BIND, list(list($error_handler$, handler)), list($sym122$_TRY, bq_cons(PROGN, append(body, NIL)), list(list(list($$$Throwable, catch_var), listS($sym126$_HANDLE_THROWABLE, catch_var, $list_alt369)))));
									return com.cyc.cycjava.cycl.java_backend.java_backend_write_form(expanded_form, stream, depth);
								}
							}
						} else {
							cdestructuring_bind_error(datum, $list_alt366);
						}
					}
				}
			}
			return NIL;
		}
	}

	public static SubLObject java_backend_write_Xwith_error_handler(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject operator = NIL;
		destructuring_bind_must_consp(form, form, $list412);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list412);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject handler = NIL;
		SubLObject catch_var = NIL;
		SubLObject error_var = NIL;
		destructuring_bind_must_consp(current, form, $list412);
		handler = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list412);
		catch_var = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list412);
		error_var = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			list_utilities.verify_operator(operator, $sym413$_WITH_ERROR_HANDLER);
			final SubLObject expanded_form = list(CLET_BIND, list(list($error_handler$, handler)), list($sym162$_TRY, bq_cons(PROGN, append(body, NIL)), list(list(list($$$Throwable, catch_var), listS($sym166$_HANDLE_THROWABLE, catch_var, $list415)))));
			return java_backend_write_form(expanded_form, stream, depth);
		}
		cdestructuring_bind_error(form, $list412);
		return NIL;
	}

	public static final SubLObject java_backend_write_Xwith_process_resource_tracking_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			SubLObject env_var = NIL;
			SubLObject result_var = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt370);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt370);
			env_var = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt370);
			result_var = current.first();
			current = current.rest();
			{
				SubLObject body = current;
				list_utilities.verify_operator(operator, $sym371$_WITH_PROCESS_RESOURCE_TRACKING);
				return com.cyc.cycjava.cycl.java_backend.java_backend_write_clet_local(listS(CLET_LOCAL, list(bq_cons(env_var, $list_alt372)), append(body, list(list(CSETQ, result_var, list($sym373$_COMPUTE_WITH_PROCESS_RESOURCE_TRACKING_RESULTS, env_var))))), stream, depth);
			}
		}
	}

	public static SubLObject java_backend_write_Xwith_process_resource_tracking(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		SubLObject env_var = NIL;
		SubLObject result_var = NIL;
		destructuring_bind_must_consp(form, form, $list416);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list416);
		env_var = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list416);
		result_var = current.first();
		final SubLObject body;
		current = body = current.rest();
		list_utilities.verify_operator(operator, $sym417$_WITH_PROCESS_RESOURCE_TRACKING);
		return java_backend_write_clet_local(listS(CLET_LOCAL, list(bq_cons(env_var, $list418)), append(body, list(list(CSETQ, result_var, list($sym419$_COMPUTE_WITH_PROCESS_RESOURCE_TRACKING_RESULTS, env_var))))), stream, depth);
	}

	public static final SubLObject java_backend_write_XE_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			SubLObject place = NIL;
			SubLObject expression = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt374);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt374);
			place = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt374);
			expression = current.first();
			current = current.rest();
			if (NIL == current) {
				list_utilities.verify_operator(operator, $sym236$__);
				com.cyc.cycjava.cycl.java_backend.java_backend_write_form(place, stream, number_utilities.f_1X(depth));
				com.cyc.cycjava.cycl.java_backend.java_backend_write_assignment_operator(stream);
				com.cyc.cycjava.cycl.java_backend.java_backend_write_form(expression, stream, number_utilities.f_1X(depth));
				return T;
			} else {
				cdestructuring_bind_error(datum, $list_alt374);
			}
		}
		return NIL;
	}

	public static SubLObject java_backend_write_XE(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		SubLObject place = NIL;
		SubLObject expression = NIL;
		destructuring_bind_must_consp(form, form, $list420);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list420);
		place = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list420);
		expression = current.first();
		current = current.rest();
		if (NIL == current) {
			list_utilities.verify_operator(operator, $sym280$__);
			java_backend_write_form(place, stream, number_utilities.f_1X(depth));
			java_backend_write_assignment_operator(stream);
			java_backend_write_form(expression, stream, number_utilities.f_1X(depth));
			return T;
		}
		cdestructuring_bind_error(form, $list420);
		return NIL;
	}

	public static SubLObject java_backend_Xic_symbol_p(final SubLObject v_object) {
		return makeBoolean(((NIL != list_utilities.form_with_operator_p(v_object, $sym153$_IC)) && (NIL != list_utilities.lengthE(v_object, THREE_INTEGER, UNPROVIDED))) && third(v_object).isSymbol());
	}

	public static SubLObject java_backend_Xpc_symbol_p(final SubLObject v_object) {
		return makeBoolean(((NIL != list_utilities.form_with_operator_p(v_object, $sym107$_PC)) && (NIL != list_utilities.lengthE(v_object, TWO_INTEGER, UNPROVIDED))) && second(v_object).isSymbol());
	}

	public static SubLObject java_backend_Xlf_symbol_p(final SubLObject v_object) {
		return makeBoolean(((NIL != list_utilities.form_with_operator_p(v_object, $sym127$_LF)) && (NIL != list_utilities.lengthE(v_object, TWO_INTEGER, UNPROVIDED))) && second(v_object).isSymbol());
	}

	public static SubLObject java_backend_Xnc_object_p(final SubLObject v_object) {
		return makeBoolean((NIL != list_utilities.form_with_operator_p(v_object, $sym374$_NC)) && (NIL != list_utilities.lengthE(v_object, TWO_INTEGER, UNPROVIDED)));
	}

	public static final SubLObject java_backend_write_XEE_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			SubLObject expression1 = NIL;
			SubLObject expression2 = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt375);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt375);
			expression1 = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt375);
			expression2 = current.first();
			current = current.rest();
			if (NIL == current) {
				list_utilities.verify_operator(operator, $sym230$___);
				if (expression1.equal($list_alt341) && expression2.equal($list_alt341)) {
					com.cyc.cycjava.cycl.java_backend.java_backend_write_form($list_alt248, stream, depth);
				} else {
					if (expression1.equal($list_alt341) && ((NIL != list_utilities.form_with_operator_p(expression2, $sym73$_PC)) || (NIL != list_utilities.form_with_operator_p(expression2, $sym112$_IC)))) {
						com.cyc.cycjava.cycl.java_backend.java_backend_write_form($list_alt347, stream, depth);
					} else {
						if (expression1.equal($list_alt341) && (NIL != list_utilities.form_with_operator_p(expression2, NULL))) {
							com.cyc.cycjava.cycl.java_backend.java_backend_write_form(list($sym340$_NOT____, $list_alt341, second(expression2)), stream, depth);
						} else {
							write_string($str_alt93$_, stream, UNPROVIDED, UNPROVIDED);
							com.cyc.cycjava.cycl.java_backend.java_backend_write_form(expression1, stream, number_utilities.f_1X(depth));
							write_string($str_alt377$____, stream, UNPROVIDED, UNPROVIDED);
							com.cyc.cycjava.cycl.java_backend.java_backend_write_form(expression2, stream, number_utilities.f_1X(depth));
							write_string($str_alt95$_, stream, UNPROVIDED, UNPROVIDED);
						}
					}
				}
			} else {
				cdestructuring_bind_error(datum, $list_alt375);
			}
		}
		return NIL;
	}

	public static SubLObject java_backend_write_XEE(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		SubLObject expression1 = NIL;
		SubLObject expression2 = NIL;
		destructuring_bind_must_consp(form, form, $list422);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list422);
		expression1 = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list422);
		expression2 = current.first();
		current = current.rest();
		final SubLObject force_native = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, form, $list422);
		current = current.rest();
		if (NIL == current) {
			list_utilities.verify_operator(operator, $sym273$___);
			if (expression1.equal($list150) && expression2.equal($list150)) {
				java_backend_write_form($list292, stream, depth);
			} else if (expression1.equal($list150) && ((NIL != list_utilities.form_with_operator_p(expression2, $sym107$_PC)) || (NIL != list_utilities.form_with_operator_p(expression2, $sym153$_IC)))) {
				java_backend_write_form($list394, stream, depth);
			} else if (expression1.equal($list150) && (NIL != list_utilities.form_with_operator_p(expression2, NULL))) {
				java_backend_write_form(list($sym149$_NOT____, $list150, second(expression2)), stream, depth);
			} else if ((((((((((NIL != force_native) || (NIL == $translate_eq_as_eql$.getGlobalValue())) || (NIL != java_backend_Xic_symbol_p(expression1))) || (NIL != java_backend_Xic_symbol_p(expression2))) || (NIL != java_backend_Xlf_symbol_p(expression1))) || (NIL != java_backend_Xlf_symbol_p(expression2))) || (NIL != java_backend_Xnc_object_p(expression1))) || (NIL != java_backend_Xnc_object_p(expression2)))
					|| (NIL != java_backend_Xpc_symbol_p(expression1))) || (NIL != java_backend_Xpc_symbol_p(expression2))) {
				write_string($str130$_, stream, UNPROVIDED, UNPROVIDED);
				java_backend_write_form(expression1, stream, number_utilities.f_1X(depth));
				write_string($str424$____, stream, UNPROVIDED, UNPROVIDED);
				java_backend_write_form(expression2, stream, number_utilities.f_1X(depth));
				write_string($str132$_, stream, UNPROVIDED, UNPROVIDED);
			} else {
				java_backend_write_form(expression1, stream, number_utilities.f_1X(depth));
				write_string($str425$_eql_, stream, UNPROVIDED, UNPROVIDED);
				java_backend_write_form(expression2, stream, number_utilities.f_1X(depth));
				write_string($str132$_, stream, UNPROVIDED, UNPROVIDED);
			}

		} else {
			cdestructuring_bind_error(form, $list422);
		}
		return NIL;
	}

	public static final SubLObject java_backend_write_Xnot_XEE_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			SubLObject expression1 = NIL;
			SubLObject expression2 = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt375);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt375);
			expression1 = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt375);
			expression2 = current.first();
			current = current.rest();
			if (NIL == current) {
				list_utilities.verify_operator(operator, $sym340$_NOT____);
				if (expression1.equal($list_alt341) && expression2.equal($list_alt341)) {
					com.cyc.cycjava.cycl.java_backend.java_backend_write_form($list_alt347, stream, depth);
				} else {
					if (expression1.equal($list_alt341) && ((NIL != list_utilities.form_with_operator_p(expression2, $sym73$_PC)) || (NIL != list_utilities.form_with_operator_p(expression2, $sym112$_IC)))) {
						com.cyc.cycjava.cycl.java_backend.java_backend_write_form($list_alt248, stream, depth);
					} else {
						write_string($str_alt93$_, stream, UNPROVIDED, UNPROVIDED);
						com.cyc.cycjava.cycl.java_backend.java_backend_write_form(expression1, stream, number_utilities.f_1X(depth));
						write_string($str_alt378$____, stream, UNPROVIDED, UNPROVIDED);
						com.cyc.cycjava.cycl.java_backend.java_backend_write_form(expression2, stream, number_utilities.f_1X(depth));
						write_string($str_alt95$_, stream, UNPROVIDED, UNPROVIDED);
					}
				}
			} else {
				cdestructuring_bind_error(datum, $list_alt375);
			}
		}
		return NIL;
	}

	public static SubLObject java_backend_write_Xnot_XEE(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		SubLObject expression1 = NIL;
		SubLObject expression2 = NIL;
		destructuring_bind_must_consp(form, form, $list422);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list422);
		expression1 = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list422);
		expression2 = current.first();
		current = current.rest();
		final SubLObject force_native = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, form, $list422);
		current = current.rest();
		if (NIL == current) {
			list_utilities.verify_operator(operator, $sym149$_NOT____);
			if (expression1.equal($list150) && expression2.equal($list150)) {
				java_backend_write_form($list394, stream, depth);
			} else if (expression1.equal($list150) && ((NIL != list_utilities.form_with_operator_p(expression2, $sym107$_PC)) || (NIL != list_utilities.form_with_operator_p(expression2, $sym153$_IC)))) {
				java_backend_write_form($list292, stream, depth);
			} else if ((((((((((NIL != force_native) || (NIL == $translate_eq_as_eql$.getGlobalValue())) || (NIL != java_backend_Xic_symbol_p(expression1))) || (NIL != java_backend_Xic_symbol_p(expression2))) || (NIL != java_backend_Xlf_symbol_p(expression1))) || (NIL != java_backend_Xlf_symbol_p(expression2))) || (NIL != java_backend_Xnc_object_p(expression1))) || (NIL != java_backend_Xnc_object_p(expression2)))
					|| (NIL != java_backend_Xpc_symbol_p(expression1))) || (NIL != java_backend_Xpc_symbol_p(expression2))) {
				write_string($str130$_, stream, UNPROVIDED, UNPROVIDED);
				java_backend_write_form(expression1, stream, number_utilities.f_1X(depth));
				write_string($str426$____, stream, UNPROVIDED, UNPROVIDED);
				java_backend_write_form(expression2, stream, number_utilities.f_1X(depth));
				write_string($str132$_, stream, UNPROVIDED, UNPROVIDED);
			} else {
				write_string($str427$_, stream, UNPROVIDED, UNPROVIDED);
				java_backend_write_form(expression1, stream, number_utilities.f_1X(depth));
				write_string($str425$_eql_, stream, UNPROVIDED, UNPROVIDED);
				java_backend_write_form(expression2, stream, number_utilities.f_1X(depth));
				write_string($str132$_, stream, UNPROVIDED, UNPROVIDED);
			}

		} else {
			cdestructuring_bind_error(form, $list422);
		}
		return NIL;
	}

	public static final SubLObject java_backend_write_Xannotation_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			SubLObject v_interface = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt379);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt379);
			v_interface = current.first();
			current = current.rest();
			{
				SubLObject slot_value_tuples = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
				destructuring_bind_must_listp(current, datum, $list_alt379);
				current = current.rest();
				if (NIL == current) {
					list_utilities.verify_operator(operator, $sym181$_ANNOTATION);
					write_string($str_alt380$_, stream, UNPROVIDED, UNPROVIDED);
					write_string(v_interface, stream, UNPROVIDED, UNPROVIDED);
					if (NIL != slot_value_tuples) {
						write_string($str_alt93$_, stream, UNPROVIDED, UNPROVIDED);
						{
							SubLObject list_var = NIL;
							SubLObject tuple = NIL;
							SubLObject index = NIL;
							for (list_var = slot_value_tuples, tuple = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), tuple = list_var.first(), index = add(ONE_INTEGER, index)) {
								if (!index.isZero()) {
									com.cyc.cycjava.cycl.java_backend.java_backend_write_function_argument_separator(stream);
								}
								{
									SubLObject datum_32 = tuple;
									SubLObject current_33 = datum_32;
									SubLObject slot = NIL;
									SubLObject value = NIL;
									destructuring_bind_must_consp(current_33, datum_32, $list_alt381);
									slot = current_33.first();
									current_33 = current_33.rest();
									destructuring_bind_must_consp(current_33, datum_32, $list_alt381);
									value = current_33.first();
									current_33 = current_33.rest();
									if (NIL == current_33) {
										write_string(slot, stream, UNPROVIDED, UNPROVIDED);
										com.cyc.cycjava.cycl.java_backend.java_backend_write_assignment_operator(stream);
										com.cyc.cycjava.cycl.java_backend.java_backend_write_form(value, stream, number_utilities.f_1X(depth));
									} else {
										cdestructuring_bind_error(datum_32, $list_alt381);
									}
								}
							}
						}
						write_string($str_alt95$_, stream, UNPROVIDED, UNPROVIDED);
					}
					write_string($str_alt172$_, stream, UNPROVIDED, UNPROVIDED);
				} else {
					cdestructuring_bind_error(datum, $list_alt379);
				}
			}
		}
		return NIL;
	}

	public static SubLObject java_backend_write_Xannotation(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		SubLObject v_interface = NIL;
		destructuring_bind_must_consp(form, form, $list428);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list428);
		v_interface = current.first();
		current = current.rest();
		final SubLObject slot_value_tuples = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, form, $list428);
		current = current.rest();
		if (NIL == current) {
			list_utilities.verify_operator(operator, $sym227$_ANNOTATION);
			write_string($str429$_, stream, UNPROVIDED, UNPROVIDED);
			write_string(v_interface, stream, UNPROVIDED, UNPROVIDED);
			if (NIL != slot_value_tuples) {
				write_string($str130$_, stream, UNPROVIDED, UNPROVIDED);
				SubLObject list_var = NIL;
				SubLObject tuple = NIL;
				SubLObject index = NIL;
				list_var = slot_value_tuples;
				tuple = list_var.first();
				for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), tuple = list_var.first(), index = add(ONE_INTEGER, index)) {
					if (!index.isZero()) {
						java_backend_write_function_argument_separator(stream);
					}
					SubLObject current_$38;
					final SubLObject datum_$37 = current_$38 = tuple;
					SubLObject slot = NIL;
					SubLObject value = NIL;
					destructuring_bind_must_consp(current_$38, datum_$37, $list430);
					slot = current_$38.first();
					current_$38 = current_$38.rest();
					destructuring_bind_must_consp(current_$38, datum_$37, $list430);
					value = current_$38.first();
					current_$38 = current_$38.rest();
					if (NIL == current_$38) {
						write_string(slot, stream, UNPROVIDED, UNPROVIDED);
						java_backend_write_assignment_operator(stream);
						java_backend_write_form(value, stream, number_utilities.f_1X(depth));
					} else {
						cdestructuring_bind_error(datum_$37, $list430);
					}
				}
				write_string($str132$_, stream, UNPROVIDED, UNPROVIDED);
			}
			write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
		} else {
			cdestructuring_bind_error(form, $list428);
		}
		return NIL;
	}

	public static SubLObject java_backend_write_Xassert(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		SubLObject condition = NIL;
		destructuring_bind_must_consp(form, form, $list431);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list431);
		condition = current.first();
		current = current.rest();
		final SubLObject error_object = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, form, $list431);
		current = current.rest();
		if (NIL == current) {
			list_utilities.verify_operator(operator, $sym148$_ASSERT);
			write_string($$$assert_, stream, UNPROVIDED, UNPROVIDED);
			java_backend_write_form(condition, stream, number_utilities.f_1X(depth));
			if (NIL != error_object) {
				write_string($str284$___, stream, UNPROVIDED, UNPROVIDED);
				java_backend_write_form(error_object, stream, number_utilities.f_1X(depth));
			}
			return T;
		}
		cdestructuring_bind_error(form, $list431);
		return NIL;
	}

	public static final SubLObject java_backend_write_Xbind_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			SubLObject symbol = NIL;
			SubLObject expression = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt382);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt382);
			symbol = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt382);
			expression = current.first();
			current = current.rest();
			if (NIL == current) {
				list_utilities.verify_operator(operator, $sym139$_BIND);
				{
					SubLObject thread = com.cyc.cycjava.cycl.java_backend.java_backend_current_thread_variable();
					if (NIL != thread) {
						return com.cyc.cycjava.cycl.java_backend.java_backend_write_form(list($sym119$_METHOD, symbol, $$$bind, expression, thread), stream, depth);
					}
				}
				return com.cyc.cycjava.cycl.java_backend.java_backend_write_function_call(form, stream, depth);
			} else {
				cdestructuring_bind_error(datum, $list_alt382);
			}
		}
		return NIL;
	}

	public static SubLObject java_backend_write_Xbind(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		SubLObject symbol = NIL;
		SubLObject expression = NIL;
		destructuring_bind_must_consp(form, form, $list433);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list433);
		symbol = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list433);
		expression = current.first();
		current = current.rest();
		if (NIL != current) {
			cdestructuring_bind_error(form, $list433);
			return NIL;
		}
		list_utilities.verify_operator(operator, $sym182$_BIND);
		final SubLObject thread = java_backend_current_thread_variable();
		if (NIL != thread) {
			return java_backend_write_form(list($sym159$_METHOD, symbol, $$$bind, expression, thread), stream, depth);
		}
		return java_backend_write_function_call(form, stream, depth);
	}

	public static final SubLObject java_backend_write_Xcast_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			SubLObject type = NIL;
			SubLObject expression = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt384);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt384);
			type = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt384);
			expression = current.first();
			current = current.rest();
			if (NIL == current) {
				list_utilities.verify_operator(operator, $sym113$_CAST);
				write_string($str_alt385$__, stream, UNPROVIDED, UNPROVIDED);
				write_string(type, stream, UNPROVIDED, UNPROVIDED);
				write_string($str_alt247$__, stream, UNPROVIDED, UNPROVIDED);
				com.cyc.cycjava.cycl.java_backend.java_backend_write_form(expression, stream, number_utilities.f_1X(depth));
				write_string($str_alt95$_, stream, UNPROVIDED, UNPROVIDED);
			} else {
				cdestructuring_bind_error(datum, $list_alt384);
			}
		}
		return NIL;
	}

	public static SubLObject java_backend_write_Xcast(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		SubLObject type = NIL;
		SubLObject expression = NIL;
		destructuring_bind_must_consp(form, form, $list435);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list435);
		type = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list435);
		expression = current.first();
		current = current.rest();
		if (NIL == current) {
			list_utilities.verify_operator(operator, $sym154$_CAST);
			write_string($str436$__, stream, UNPROVIDED, UNPROVIDED);
			write_string(type, stream, UNPROVIDED, UNPROVIDED);
			write_string($str291$__, stream, UNPROVIDED, UNPROVIDED);
			java_backend_write_form(expression, stream, number_utilities.f_1X(depth));
			write_string($str132$_, stream, UNPROVIDED, UNPROVIDED);
		} else {
			cdestructuring_bind_error(form, $list435);
		}
		return NIL;
	}

	public static final SubLObject java_backend_write_Xcurrent_binding_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			SubLObject symbol = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt386);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt386);
			symbol = current.first();
			current = current.rest();
			if (NIL == current) {
				list_utilities.verify_operator(operator, $sym138$_CURRENT_BINDING);
				{
					SubLObject thread = com.cyc.cycjava.cycl.java_backend.java_backend_current_thread_variable();
					if (NIL != thread) {
						return com.cyc.cycjava.cycl.java_backend.java_backend_write_form(list($sym119$_METHOD, symbol, $$$currentBinding, thread), stream, depth);
					}
				}
				return com.cyc.cycjava.cycl.java_backend.java_backend_write_function_call(form, stream, depth);
			} else {
				cdestructuring_bind_error(datum, $list_alt386);
			}
		}
		return NIL;
	}

	public static SubLObject java_backend_write_Xcurrent_binding(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		SubLObject symbol = NIL;
		destructuring_bind_must_consp(form, form, $list437);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list437);
		symbol = current.first();
		current = current.rest();
		if (NIL != current) {
			cdestructuring_bind_error(form, $list437);
			return NIL;
		}
		list_utilities.verify_operator(operator, $sym181$_CURRENT_BINDING);
		final SubLObject thread = java_backend_current_thread_variable();
		if (NIL != thread) {
			return java_backend_write_form(list($sym159$_METHOD, symbol, $$$currentBinding, thread), stream, depth);
		}
		return java_backend_write_function_call(form, stream, depth);
	}

	public static final SubLObject java_backend_write_Xfield_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			SubLObject v_object = NIL;
			SubLObject field = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt388);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt388);
			v_object = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt388);
			field = current.first();
			current = current.rest();
			if (NIL == current) {
				list_utilities.verify_operator(operator, $sym214$_FIELD);
				com.cyc.cycjava.cycl.java_backend.java_backend_write_form(v_object, stream, number_utilities.f_1X(depth));
				write_string($str_alt15$_, stream, UNPROVIDED, UNPROVIDED);
				write_string(field, stream, UNPROVIDED, UNPROVIDED);
			} else {
				cdestructuring_bind_error(datum, $list_alt388);
			}
		}
		return T;
	}

	public static SubLObject java_backend_write_Xfield(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		SubLObject v_object = NIL;
		SubLObject field = NIL;
		destructuring_bind_must_consp(form, form, $list439);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list439);
		v_object = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list439);
		field = current.first();
		current = current.rest();
		if (NIL == current) {
			list_utilities.verify_operator(operator, $sym259$_FIELD);
			java_backend_write_form(v_object, stream, number_utilities.f_1X(depth));
			write_string($str49$_, stream, UNPROVIDED, UNPROVIDED);
			write_string(field, stream, UNPROVIDED, UNPROVIDED);
		} else {
			cdestructuring_bind_error(form, $list439);
		}
		return T;
	}

	public static final SubLObject java_backend_write_Xidentifier_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			SubLObject name = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt389);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt389);
			name = current.first();
			current = current.rest();
			if (NIL == current) {
				list_utilities.verify_operator(operator, $sym215$_IDENTIFIER);
				write_string(name, stream, UNPROVIDED, UNPROVIDED);
			} else {
				cdestructuring_bind_error(datum, $list_alt389);
			}
		}
		return T;
	}

	public static SubLObject java_backend_write_Xidentifier(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		SubLObject name = NIL;
		destructuring_bind_must_consp(form, form, $list440);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list440);
		name = current.first();
		current = current.rest();
		if (NIL == current) {
			list_utilities.verify_operator(operator, $sym260$_IDENTIFIER);
			write_string(name, stream, UNPROVIDED, UNPROVIDED);
		} else {
			cdestructuring_bind_error(form, $list440);
		}
		return T;
	}

	public static final SubLObject java_backend_write_Xinit_opt_arg_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			SubLObject variable = NIL;
			SubLObject v_default = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt390);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt390);
			variable = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt390);
			v_default = current.first();
			current = current.rest();
			if (NIL == current) {
				list_utilities.verify_operator(operator, $sym391$_INIT_OPT_ARG);
				return com.cyc.cycjava.cycl.java_backend.java_backend_write_pcond(listS(PCOND, list(listS($sym230$___, variable, $list_alt392), list(CSETQ, variable, v_default)), $list_alt393), stream, depth);
			} else {
				cdestructuring_bind_error(datum, $list_alt390);
			}
		}
		return NIL;
	}

	public static SubLObject java_backend_write_Xinit_opt_arg(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		SubLObject variable = NIL;
		SubLObject v_default = NIL;
		destructuring_bind_must_consp(form, form, $list441);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list441);
		variable = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list441);
		v_default = current.first();
		current = current.rest();
		if (NIL == current) {
			list_utilities.verify_operator(operator, $sym442$_INIT_OPT_ARG);
			return java_backend_write_pcond(listS(PCOND, list(listS($sym273$___, variable, $list443), list(CSETQ, variable, v_default)), $list444), stream, depth);
		}
		cdestructuring_bind_error(form, $list441);
		return NIL;
	}

	public static final SubLObject java_backend_write_Xinstanceof_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			SubLObject v_object = NIL;
			SubLObject class_name = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt394);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt394);
			v_object = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt394);
			class_name = current.first();
			current = current.rest();
			if (NIL == current) {
				list_utilities.verify_operator(operator, $sym395$_INSTANCEOF);
				write_string($str_alt93$_, stream, UNPROVIDED, UNPROVIDED);
				com.cyc.cycjava.cycl.java_backend.java_backend_write_form(v_object, stream, number_utilities.f_1X(depth));
				write_string($str_alt396$_instanceof_, stream, UNPROVIDED, UNPROVIDED);
				write_string(class_name, stream, UNPROVIDED, UNPROVIDED);
				write_string($str_alt95$_, stream, UNPROVIDED, UNPROVIDED);
			} else {
				cdestructuring_bind_error(datum, $list_alt394);
			}
		}
		return T;
	}

	public static SubLObject java_backend_write_Xinstanceof(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		SubLObject v_object = NIL;
		SubLObject class_name = NIL;
		destructuring_bind_must_consp(form, form, $list445);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list445);
		v_object = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list445);
		class_name = current.first();
		current = current.rest();
		if (NIL == current) {
			list_utilities.verify_operator(operator, $sym446$_INSTANCEOF);
			write_string($str130$_, stream, UNPROVIDED, UNPROVIDED);
			java_backend_write_form(v_object, stream, number_utilities.f_1X(depth));
			write_string($$$_instanceof_, stream, UNPROVIDED, UNPROVIDED);
			write_string(class_name, stream, UNPROVIDED, UNPROVIDED);
			write_string($str132$_, stream, UNPROVIDED, UNPROVIDED);
		} else {
			cdestructuring_bind_error(form, $list445);
		}
		return T;
	}

	public static final SubLObject java_backend_write_Xdyn_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject datum = form;
				SubLObject current = datum;
				SubLObject operator = NIL;
				SubLObject global = NIL;
				destructuring_bind_must_consp(current, datum, $list_alt397);
				operator = current.first();
				current = current.rest();
				destructuring_bind_must_consp(current, datum, $list_alt397);
				global = current.first();
				current = current.rest();
				if (NIL == current) {
					list_utilities.verify_operator(operator, $sym398$_DYN);
					{
						SubLObject thread_34 = com.cyc.cycjava.cycl.java_backend.java_backend_current_thread_variable();
						SubLObject expanded_form = (NIL != thread_34) ? ((SubLObject) (list($sym119$_METHOD, global, $$$getDynamicValue, thread_34))) : listS($sym119$_METHOD, global, $list_alt400);
						return com.cyc.cycjava.cycl.java_backend.java_backend_write_form(expanded_form, stream, depth);
					}
				} else {
					cdestructuring_bind_error(datum, $list_alt397);
				}
			}
			return NIL;
		}
	}

	public static SubLObject java_backend_write_Xdyn(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject operator = NIL;
		SubLObject global = NIL;
		destructuring_bind_must_consp(form, form, $list448);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list448);
		global = current.first();
		current = current.rest();
		if (NIL == current) {
			list_utilities.verify_operator(operator, $sym449$_DYN);
			final SubLObject thread_$39 = java_backend_current_thread_variable();
			final SubLObject expanded_form = (NIL != thread_$39) ? list($sym159$_METHOD, global, $$$getDynamicValue, thread_$39) : listS($sym159$_METHOD, global, $list451);
			return java_backend_write_form(expanded_form, stream, depth);
		}
		cdestructuring_bind_error(form, $list448);
		return NIL;
	}

	public static final SubLObject java_backend_write_Xlex_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			SubLObject global = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt397);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt397);
			global = current.first();
			current = current.rest();
			if (NIL == current) {
				list_utilities.verify_operator(operator, $sym401$_LEX);
				{
					SubLObject expanded_form = listS($sym119$_METHOD, global, $list_alt402);
					return com.cyc.cycjava.cycl.java_backend.java_backend_write_form(expanded_form, stream, depth);
				}
			} else {
				cdestructuring_bind_error(datum, $list_alt397);
			}
		}
		return NIL;
	}

	public static SubLObject java_backend_write_Xlex(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		SubLObject global = NIL;
		destructuring_bind_must_consp(form, form, $list448);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list448);
		global = current.first();
		current = current.rest();
		if (NIL == current) {
			list_utilities.verify_operator(operator, $sym452$_LEX);
			final SubLObject expanded_form = listS($sym159$_METHOD, global, $list453);
			return java_backend_write_form(expanded_form, stream, depth);
		}
		cdestructuring_bind_error(form, $list448);
		return NIL;
	}

	public static final SubLObject java_backend_write_Xset_dyn_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			SubLObject global = NIL;
			SubLObject value = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt403);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt403);
			global = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt403);
			value = current.first();
			current = current.rest();
			if (NIL == current) {
				list_utilities.verify_operator(operator, $sym158$_SET_DYN);
				{
					SubLObject thread = com.cyc.cycjava.cycl.java_backend.java_backend_current_thread_variable();
					SubLObject expanded_form = (NIL != thread) ? ((SubLObject) (list($sym119$_METHOD, global, $$$setDynamicValue, value, thread))) : list($sym119$_METHOD, global, $$$setDynamicValue, value);
					return com.cyc.cycjava.cycl.java_backend.java_backend_write_form(expanded_form, stream, depth);
				}
			} else {
				cdestructuring_bind_error(datum, $list_alt403);
			}
		}
		return NIL;
	}

	public static SubLObject java_backend_write_Xset_dyn(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		SubLObject global = NIL;
		SubLObject value = NIL;
		destructuring_bind_must_consp(form, form, $list454);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list454);
		global = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list454);
		value = current.first();
		current = current.rest();
		if (NIL == current) {
			list_utilities.verify_operator(operator, $sym201$_SET_DYN);
			final SubLObject thread = java_backend_current_thread_variable();
			final SubLObject expanded_form = (NIL != thread) ? list($sym159$_METHOD, global, $$$setDynamicValue, value, thread) : list($sym159$_METHOD, global, $$$setDynamicValue, value);
			return java_backend_write_form(expanded_form, stream, depth);
		}
		cdestructuring_bind_error(form, $list454);
		return NIL;
	}

	public static final SubLObject java_backend_write_Xset_lex_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			SubLObject global = NIL;
			SubLObject value = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt403);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt403);
			global = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt403);
			value = current.first();
			current = current.rest();
			if (NIL == current) {
				list_utilities.verify_operator(operator, $sym159$_SET_LEX);
				{
					SubLObject expanded_form = list($sym119$_METHOD, global, $$$setGlobalValue, value);
					return com.cyc.cycjava.cycl.java_backend.java_backend_write_form(expanded_form, stream, depth);
				}
			} else {
				cdestructuring_bind_error(datum, $list_alt403);
			}
		}
		return NIL;
	}

	public static SubLObject java_backend_write_Xset_lex(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		SubLObject global = NIL;
		SubLObject value = NIL;
		destructuring_bind_must_consp(form, form, $list454);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list454);
		global = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list454);
		value = current.first();
		current = current.rest();
		if (NIL == current) {
			list_utilities.verify_operator(operator, $sym202$_SET_LEX);
			final SubLObject expanded_form = list($sym159$_METHOD, global, $$$setGlobalValue, value);
			return java_backend_write_form(expanded_form, stream, depth);
		}
		cdestructuring_bind_error(form, $list454);
		return NIL;
	}

	public static final SubLObject java_backend_write_Xmethod_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			SubLObject v_object = NIL;
			SubLObject method = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt406);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt406);
			v_object = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt406);
			method = current.first();
			current = current.rest();
			{
				SubLObject args = current;
				list_utilities.verify_operator(operator, $sym119$_METHOD);
				if (NIL != v_object) {
					com.cyc.cycjava.cycl.java_backend.java_backend_write_form(v_object, stream, number_utilities.f_1X(depth));
					write_string($str_alt15$_, stream, UNPROVIDED, UNPROVIDED);
				}
				write_string(method, stream, UNPROVIDED, UNPROVIDED);
				write_string($str_alt93$_, stream, UNPROVIDED, UNPROVIDED);
				{
					SubLObject list_var = NIL;
					SubLObject arg = NIL;
					SubLObject index = NIL;
					for (list_var = args, arg = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), arg = list_var.first(), index = add(ONE_INTEGER, index)) {
						if (!index.isZero()) {
							com.cyc.cycjava.cycl.java_backend.java_backend_write_function_call_argument_separator(stream);
						}
						com.cyc.cycjava.cycl.java_backend.java_backend_write_form(arg, stream, number_utilities.f_1X(depth));
					}
				}
				write_string($str_alt95$_, stream, UNPROVIDED, UNPROVIDED);
			}
		}
		return T;
	}

	public static SubLObject java_backend_write_Xmethod(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		SubLObject v_object = NIL;
		SubLObject method = NIL;
		destructuring_bind_must_consp(form, form, $list457);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list457);
		v_object = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list457);
		method = current.first();
		final SubLObject args;
		current = args = current.rest();
		list_utilities.verify_operator(operator, $sym159$_METHOD);
		if (NIL != v_object) {
			java_backend_write_form(v_object, stream, number_utilities.f_1X(depth));
			write_string($str49$_, stream, UNPROVIDED, UNPROVIDED);
		}
		write_string(method, stream, UNPROVIDED, UNPROVIDED);
		write_string($str130$_, stream, UNPROVIDED, UNPROVIDED);
		SubLObject list_var = NIL;
		SubLObject arg = NIL;
		SubLObject index = NIL;
		list_var = args;
		arg = list_var.first();
		for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), arg = list_var.first(), index = add(ONE_INTEGER, index)) {
			if (!index.isZero()) {
				java_backend_write_function_call_argument_separator(stream);
			}
			java_backend_write_form(arg, stream, number_utilities.f_1X(depth));
		}
		write_string($str132$_, stream, UNPROVIDED, UNPROVIDED);
		return T;
	}

	public static final SubLObject java_backend_write_Xmval_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject datum = form;
				SubLObject current = datum;
				SubLObject operator = NIL;
				SubLObject n = NIL;
				destructuring_bind_must_consp(current, datum, $list_alt407);
				operator = current.first();
				current = current.rest();
				destructuring_bind_must_consp(current, datum, $list_alt407);
				n = current.first();
				current = current.rest();
				if (NIL == current) {
					list_utilities.verify_operator(operator, $sym408$_MVAL);
					{
						SubLObject thread_35 = com.cyc.cycjava.cycl.java_backend.java_backend_current_thread_variable();
						if (NIL == thread_35) {
							return com.cyc.cycjava.cycl.java_backend.java_backend_write_function_call(form, stream, depth);
						}
						if (n.equal($list_alt409)) {
							return com.cyc.cycjava.cycl.java_backend.java_backend_write_form(listS($sym119$_METHOD, thread_35, $list_alt410), stream, depth);
						} else {
							if (n.equal($list_alt411)) {
								return com.cyc.cycjava.cycl.java_backend.java_backend_write_form(listS($sym119$_METHOD, thread_35, $list_alt412), stream, depth);
							} else {
								if (n.equal($list_alt413)) {
									return com.cyc.cycjava.cycl.java_backend.java_backend_write_form(listS($sym119$_METHOD, thread_35, $list_alt414), stream, depth);
								} else {
									if (n.equal($list_alt415)) {
										return com.cyc.cycjava.cycl.java_backend.java_backend_write_form(listS($sym119$_METHOD, thread_35, $list_alt416), stream, depth);
									} else {
										if (n.equal($list_alt417)) {
											return com.cyc.cycjava.cycl.java_backend.java_backend_write_form(listS($sym119$_METHOD, thread_35, $list_alt418), stream, depth);
										} else {
											if (n.equal($list_alt419)) {
												return com.cyc.cycjava.cycl.java_backend.java_backend_write_form(listS($sym119$_METHOD, thread_35, $list_alt420), stream, depth);
											} else {
												if (n.equal($list_alt421)) {
													return com.cyc.cycjava.cycl.java_backend.java_backend_write_form(listS($sym119$_METHOD, thread_35, $list_alt422), stream, depth);
												} else {
													if (n.equal($list_alt423)) {
														return com.cyc.cycjava.cycl.java_backend.java_backend_write_form(listS($sym119$_METHOD, thread_35, $list_alt424), stream, depth);
													} else {
														return com.cyc.cycjava.cycl.java_backend.java_backend_write_function_call(form, stream, depth);
													}
												}
											}
										}
									}
								}
							}
						}
					}
				} else {
					cdestructuring_bind_error(datum, $list_alt407);
				}
			}
			return NIL;
		}
	}

	public static SubLObject java_backend_write_Xmval(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject operator = NIL;
		SubLObject n = NIL;
		destructuring_bind_must_consp(form, form, $list458);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list458);
		n = current.first();
		current = current.rest();
		if (NIL != current) {
			cdestructuring_bind_error(form, $list458);
			return NIL;
		}
		list_utilities.verify_operator(operator, $sym459$_MVAL);
		final SubLObject thread_$40 = java_backend_current_thread_variable();
		if (NIL == thread_$40) {
			return java_backend_write_function_call(form, stream, depth);
		}
		if (n.equal($list460)) {
			return java_backend_write_form(listS($sym159$_METHOD, thread_$40, $list461), stream, depth);
		}
		if (n.equal($list462)) {
			return java_backend_write_form(listS($sym159$_METHOD, thread_$40, $list463), stream, depth);
		}
		if (n.equal($list464)) {
			return java_backend_write_form(listS($sym159$_METHOD, thread_$40, $list465), stream, depth);
		}
		if (n.equal($list466)) {
			return java_backend_write_form(listS($sym159$_METHOD, thread_$40, $list467), stream, depth);
		}
		if (n.equal($list468)) {
			return java_backend_write_form(listS($sym159$_METHOD, thread_$40, $list469), stream, depth);
		}
		if (n.equal($list470)) {
			return java_backend_write_form(listS($sym159$_METHOD, thread_$40, $list471), stream, depth);
		}
		if (n.equal($list472)) {
			return java_backend_write_form(listS($sym159$_METHOD, thread_$40, $list473), stream, depth);
		}
		if (n.equal($list474)) {
			return java_backend_write_form(listS($sym159$_METHOD, thread_$40, $list475), stream, depth);
		}
		return java_backend_write_function_call(form, stream, depth);
	}

	public static final SubLObject java_backend_write_Xnew_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			SubLObject class_name = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt425);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt425);
			class_name = current.first();
			current = current.rest();
			{
				SubLObject args = current;
				list_utilities.verify_operator(operator, $sym222$_NEW);
				write_string($str_alt98$new_, stream, UNPROVIDED, UNPROVIDED);
				write_string(class_name, stream, UNPROVIDED, UNPROVIDED);
				write_string($str_alt93$_, stream, UNPROVIDED, UNPROVIDED);
				{
					SubLObject list_var = NIL;
					SubLObject arg = NIL;
					SubLObject index = NIL;
					for (list_var = args, arg = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), arg = list_var.first(), index = add(ONE_INTEGER, index)) {
						if (!index.isZero()) {
							com.cyc.cycjava.cycl.java_backend.java_backend_write_function_call_argument_separator(stream);
						}
						com.cyc.cycjava.cycl.java_backend.java_backend_write_form(arg, stream, number_utilities.f_1X(depth));
					}
				}
				write_string($str_alt95$_, stream, UNPROVIDED, UNPROVIDED);
			}
		}
		return T;
	}

	public static SubLObject java_backend_write_Xnew(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		SubLObject class_name = NIL;
		destructuring_bind_must_consp(form, form, $list476);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list476);
		class_name = current.first();
		final SubLObject args;
		current = args = current.rest();
		list_utilities.verify_operator(operator, $sym266$_NEW);
		write_string($$$new_, stream, UNPROVIDED, UNPROVIDED);
		write_string(class_name, stream, UNPROVIDED, UNPROVIDED);
		write_string($str130$_, stream, UNPROVIDED, UNPROVIDED);
		SubLObject list_var = NIL;
		SubLObject arg = NIL;
		SubLObject index = NIL;
		list_var = args;
		arg = list_var.first();
		for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), arg = list_var.first(), index = add(ONE_INTEGER, index)) {
			if (!index.isZero()) {
				java_backend_write_function_call_argument_separator(stream);
			}
			java_backend_write_form(arg, stream, number_utilities.f_1X(depth));
		}
		write_string($str132$_, stream, UNPROVIDED, UNPROVIDED);
		return T;
	}

	public static final SubLObject java_backend_write_Xnew_array_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			SubLObject class_name = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt426);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt426);
			class_name = current.first();
			current = current.rest();
			{
				SubLObject elements = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
				destructuring_bind_must_listp(current, datum, $list_alt426);
				current = current.rest();
				if (NIL == current) {
					list_utilities.verify_operator(operator, $sym217$_NEW_ARRAY);
					write_string($str_alt98$new_, stream, UNPROVIDED, UNPROVIDED);
					write_string(class_name, stream, UNPROVIDED, UNPROVIDED);
					write_string($str_alt427$____, stream, UNPROVIDED, UNPROVIDED);
					{
						SubLObject list_var = NIL;
						SubLObject element = NIL;
						SubLObject index = NIL;
						for (list_var = elements, element = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), element = list_var.first(), index = add(ONE_INTEGER, index)) {
							if (!index.isZero()) {
								com.cyc.cycjava.cycl.java_backend.java_backend_write_function_call_argument_separator(stream);
							}
							com.cyc.cycjava.cycl.java_backend.java_backend_write_form(element, stream, number_utilities.f_1X(depth));
						}
					}
					write_string($str_alt45$_, stream, UNPROVIDED, UNPROVIDED);
				} else {
					cdestructuring_bind_error(datum, $list_alt426);
				}
			}
		}
		return T;
	}

	public static SubLObject java_backend_write_Xnew_array(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject operator = NIL;
		SubLObject class_name = NIL;
		destructuring_bind_must_consp(form, form, $list478);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list478);
		class_name = current.first();
		current = current.rest();
		final SubLObject elements = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, form, $list478);
		current = current.rest();
		if (NIL == current) {
			list_utilities.verify_operator(operator, $sym135$_NEW_ARRAY);
			write_string($$$new_, stream, UNPROVIDED, UNPROVIDED);
			write_string(class_name, stream, UNPROVIDED, UNPROVIDED);
			write_string($str479$____, stream, UNPROVIDED, UNPROVIDED);
			SubLObject list_var = NIL;
			SubLObject element = NIL;
			SubLObject index = NIL;
			list_var = elements;
			element = list_var.first();
			for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), element = list_var.first(), index = add(ONE_INTEGER, index)) {
				if (!index.isZero()) {
					java_backend_write_function_call_argument_separator(stream);
				}
				if (NIL != $java_backend_new_array_items_on_separate_linesP$.getDynamicValue(thread)) {
					terpri(stream);
					java_backend_indent(stream, number_utilities.f_1X(depth));
				}
				java_backend_write_form(element, stream, number_utilities.f_1X(depth));
			}
			write_string($str81$_, stream, UNPROVIDED, UNPROVIDED);
		} else {
			cdestructuring_bind_error(form, $list478);
		}
		return T;
	}

	public static final SubLObject java_backend_write_Xnote_supplied_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			SubLObject variable = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt428);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt428);
			variable = current.first();
			current = current.rest();
			if (NIL == current) {
				list_utilities.verify_operator(operator, $sym429$_NOTE_SUPPLIED);
				return com.cyc.cycjava.cycl.java_backend.java_backend_write_form(list($sym430$_BTD, listS($sym340$_NOT____, variable, $list_alt392)), stream, depth);
			} else {
				cdestructuring_bind_error(datum, $list_alt428);
			}
		}
		return NIL;
	}

	public static SubLObject java_backend_write_Xnote_supplied(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		SubLObject variable = NIL;
		destructuring_bind_must_consp(form, form, $list480);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list480);
		variable = current.first();
		current = current.rest();
		if (NIL == current) {
			list_utilities.verify_operator(operator, $sym481$_NOTE_SUPPLIED);
			return java_backend_write_form(list($sym482$_BTD, listS($sym149$_NOT____, variable, $list443)), stream, depth);
		}
		cdestructuring_bind_error(form, $list480);
		return NIL;
	}

	public static final SubLObject java_backend_write_Xrebind_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			SubLObject symbol = NIL;
			SubLObject old_value = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt431);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt431);
			symbol = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt431);
			old_value = current.first();
			current = current.rest();
			if (NIL == current) {
				list_utilities.verify_operator(operator, $sym140$_REBIND);
				{
					SubLObject thread = com.cyc.cycjava.cycl.java_backend.java_backend_current_thread_variable();
					if (NIL != thread) {
						return com.cyc.cycjava.cycl.java_backend.java_backend_write_form(list($sym119$_METHOD, symbol, $$$rebind, old_value, thread), stream, depth);
					}
				}
				return com.cyc.cycjava.cycl.java_backend.java_backend_write_function_call(form, stream, depth);
			} else {
				cdestructuring_bind_error(datum, $list_alt431);
			}
		}
		return NIL;
	}

	public static SubLObject java_backend_write_Xrebind(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		SubLObject symbol = NIL;
		SubLObject old_value = NIL;
		destructuring_bind_must_consp(form, form, $list483);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list483);
		symbol = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list483);
		old_value = current.first();
		current = current.rest();
		if (NIL != current) {
			cdestructuring_bind_error(form, $list483);
			return NIL;
		}
		list_utilities.verify_operator(operator, $sym183$_REBIND);
		final SubLObject thread = java_backend_current_thread_variable();
		if (NIL != thread) {
			return java_backend_write_form(list($sym159$_METHOD, symbol, $$$rebind, old_value, thread), stream, depth);
		}
		return java_backend_write_function_call(form, stream, depth);
	}

	public static final SubLObject java_backend_write_Xreset_mval_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject datum = form;
				SubLObject current = datum;
				SubLObject operator = NIL;
				destructuring_bind_must_consp(current, datum, $list_alt269);
				operator = current.first();
				current = current.rest();
				if (NIL == current) {
					list_utilities.verify_operator(operator, $sym433$_RESET_MVAL);
					{
						SubLObject thread_36 = com.cyc.cycjava.cycl.java_backend.java_backend_current_thread_variable();
						if (NIL == thread_36) {
							return com.cyc.cycjava.cycl.java_backend.java_backend_write_function_call(form, stream, depth);
						}
						return com.cyc.cycjava.cycl.java_backend.java_backend_write_form(listS($sym119$_METHOD, thread_36, $list_alt434), stream, depth);
					}
				} else {
					cdestructuring_bind_error(datum, $list_alt269);
				}
			}
			return NIL;
		}
	}

	public static SubLObject java_backend_write_Xreset_mval(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject operator = NIL;
		destructuring_bind_must_consp(form, form, $list321);
		operator = form.first();
		final SubLObject current = form.rest();
		if (NIL != current) {
			cdestructuring_bind_error(form, $list321);
			return NIL;
		}
		list_utilities.verify_operator(operator, $sym485$_RESET_MVAL);
		final SubLObject thread_$41 = java_backend_current_thread_variable();
		if (NIL == thread_$41) {
			return java_backend_write_function_call(form, stream, depth);
		}
		return java_backend_write_form(listS($sym159$_METHOD, thread_$41, $list486), stream, depth);
	}

	public static final SubLObject java_backend_write_Xthrow_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			SubLObject expression = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt320);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt320);
			expression = current.first();
			current = current.rest();
			if (NIL == current) {
				list_utilities.verify_operator(operator, $sym435$_THROW);
				write_string($str_alt436$throw_, stream, UNPROVIDED, UNPROVIDED);
				com.cyc.cycjava.cycl.java_backend.java_backend_write_form(expression, stream, number_utilities.f_1X(depth));
			} else {
				cdestructuring_bind_error(datum, $list_alt320);
			}
		}
		return T;
	}

	public static SubLObject java_backend_write_Xthrow(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		SubLObject expression = NIL;
		destructuring_bind_must_consp(form, form, $list369);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list369);
		expression = current.first();
		current = current.rest();
		if (NIL == current) {
			list_utilities.verify_operator(operator, $sym487$_THROW);
			write_string($$$throw_, stream, UNPROVIDED, UNPROVIDED);
			java_backend_write_form(expression, stream, number_utilities.f_1X(depth));
		} else {
			cdestructuring_bind_error(form, $list369);
		}
		return T;
	}

	public static final SubLObject java_backend_write_Xtry_alt(SubLObject form, SubLObject stream, SubLObject depth) {
		{
			SubLObject datum = form;
			SubLObject current = datum;
			SubLObject operator = NIL;
			SubLObject try_form = NIL;
			SubLObject catch_clauses = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt437);
			operator = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt437);
			try_form = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt437);
			catch_clauses = current.first();
			current = current.rest();
			{
				SubLObject body = current;
				list_utilities.verify_operator(operator, $sym122$_TRY);
				if (NIL == list_utilities.form_with_operator_p(try_form, PROGN)) {
					try_form = list(PROGN, try_form);
				}
				write_string($str_alt438$try_, stream, UNPROVIDED, UNPROVIDED);
				com.cyc.cycjava.cycl.java_backend.java_backend_write_progn(try_form, stream, depth);
				{
					SubLObject cdolist_list_var = catch_clauses;
					SubLObject catch_clause = NIL;
					for (catch_clause = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), catch_clause = cdolist_list_var.first()) {
						com.cyc.cycjava.cycl.java_backend.java_backend_write_catch_clause(catch_clause, stream, depth);
					}
				}
				if (NIL != body) {
					write_string($str_alt439$_finally_, stream, UNPROVIDED, UNPROVIDED);
					com.cyc.cycjava.cycl.java_backend.java_backend_write_progn(bq_cons(PROGN, append(body, NIL)), stream, depth);
				}
			}
		}
		return NIL;
	}

	public static SubLObject java_backend_write_Xtry(final SubLObject form, final SubLObject stream, final SubLObject depth) {
		SubLObject operator = NIL;
		SubLObject try_form = NIL;
		SubLObject catch_clauses = NIL;
		destructuring_bind_must_consp(form, form, $list489);
		operator = form.first();
		SubLObject current = form.rest();
		destructuring_bind_must_consp(current, form, $list489);
		try_form = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, form, $list489);
		catch_clauses = current.first();
		final SubLObject body;
		current = body = current.rest();
		list_utilities.verify_operator(operator, $sym162$_TRY);
		if (NIL == list_utilities.form_with_operator_p(try_form, PROGN)) {
			try_form = list(PROGN, try_form);
		}
		write_string($$$try_, stream, UNPROVIDED, UNPROVIDED);
		java_backend_write_progn(try_form, stream, depth);
		SubLObject cdolist_list_var = catch_clauses;
		SubLObject catch_clause = NIL;
		catch_clause = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			java_backend_write_catch_clause(catch_clause, stream, depth);
			cdolist_list_var = cdolist_list_var.rest();
			catch_clause = cdolist_list_var.first();
		}
		if (NIL != body) {
			write_string($$$_finally_, stream, UNPROVIDED, UNPROVIDED);
			java_backend_write_progn(bq_cons(PROGN, append(body, NIL)), stream, depth);
		}
		return NIL;
	}

	public static final SubLObject java_backend_write_catch_clause_alt(SubLObject catch_clause, SubLObject stream, SubLObject depth) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject datum = catch_clause;
				SubLObject current = datum;
				destructuring_bind_must_consp(current, datum, $list_alt440);
				{
					SubLObject temp = current.rest();
					current = current.first();
					{
						SubLObject type = NIL;
						SubLObject variable = NIL;
						destructuring_bind_must_consp(current, datum, $list_alt440);
						type = current.first();
						current = current.rest();
						destructuring_bind_must_consp(current, datum, $list_alt440);
						variable = current.first();
						current = current.rest();
						if (NIL == current) {
							current = temp;
							{
								SubLObject body = current;
								SubLTrampolineFile.checkType(type, STRINGP);
								{
									SubLObject _prev_bind_0 = $java_backend_previous_local_variable_scope$.currentBinding(thread);
									SubLObject _prev_bind_1 = $java_backend_current_local_variable_scope$.currentBinding(thread);
									try {
										$java_backend_previous_local_variable_scope$.bind($java_backend_current_local_variable_scope$.getDynamicValue(thread), thread);
										$java_backend_current_local_variable_scope$.bind($java_backend_current_local_variable_scope$.getDynamicValue(thread), thread);
										com.cyc.cycjava.cycl.java_backend.java_backend_add_local_variable_to_scope(variable);
										write_string($str_alt441$_catch__, stream, UNPROVIDED, UNPROVIDED);
										write_string(type, stream, UNPROVIDED, UNPROVIDED);
										write_string($str_alt172$_, stream, UNPROVIDED, UNPROVIDED);
										com.cyc.cycjava.cycl.java_backend.java_backend_write_form(variable, stream, number_utilities.f_1X(depth));
										write_string($str_alt247$__, stream, UNPROVIDED, UNPROVIDED);
										com.cyc.cycjava.cycl.java_backend.java_backend_write_progn(bq_cons(PROGN, append(body, NIL)), stream, depth);
									} finally {
										$java_backend_current_local_variable_scope$.rebind(_prev_bind_1, thread);
										$java_backend_previous_local_variable_scope$.rebind(_prev_bind_0, thread);
									}
								}
							}
						} else {
							cdestructuring_bind_error(datum, $list_alt440);
						}
					}
				}
			}
			return NIL;
		}
	}

	public static SubLObject java_backend_write_catch_clause(final SubLObject catch_clause, final SubLObject stream, final SubLObject depth) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		destructuring_bind_must_consp(catch_clause, catch_clause, $list492);
		final SubLObject temp = catch_clause.rest();
		SubLObject current = catch_clause.first();
		SubLObject type = NIL;
		SubLObject variable = NIL;
		destructuring_bind_must_consp(current, catch_clause, $list492);
		type = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, catch_clause, $list492);
		variable = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			assert NIL != stringp(type) : "! stringp(type) " + ("Types.stringp(type) " + "CommonSymbols.NIL != Types.stringp(type) ") + type;
			final SubLObject _prev_bind_0 = $java_backend_previous_local_variable_scope$.currentBinding(thread);
			final SubLObject _prev_bind_2 = $java_backend_current_local_variable_scope$.currentBinding(thread);
			try {
				$java_backend_previous_local_variable_scope$.bind($java_backend_current_local_variable_scope$.getDynamicValue(thread), thread);
				$java_backend_current_local_variable_scope$.bind($java_backend_current_local_variable_scope$.getDynamicValue(thread), thread);
				java_backend_add_local_variable_to_scope(variable);
				write_string($str493$_catch__, stream, UNPROVIDED, UNPROVIDED);
				write_string(type, stream, UNPROVIDED, UNPROVIDED);
				write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
				java_backend_write_form(variable, stream, number_utilities.f_1X(depth));
				write_string($str291$__, stream, UNPROVIDED, UNPROVIDED);
				java_backend_write_progn(bq_cons(PROGN, append(body, NIL)), stream, depth);
			} finally {
				$java_backend_current_local_variable_scope$.rebind(_prev_bind_2, thread);
				$java_backend_previous_local_variable_scope$.rebind(_prev_bind_0, thread);
			}
		} else {
			cdestructuring_bind_error(catch_clause, $list492);
		}
		return NIL;
	}

	public static final SubLObject Xtry_alt(SubLObject macroform, SubLObject environment) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject datum = macroform.rest();
				SubLObject current = datum;
				SubLObject try_form = NIL;
				SubLObject catch_clauses = NIL;
				destructuring_bind_must_consp(current, datum, $list_alt442);
				try_form = current.first();
				current = current.rest();
				destructuring_bind_must_consp(current, datum, $list_alt442);
				catch_clauses = current.first();
				current = current.rest();
				{
					SubLObject body = current;
					if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
						if (NIL != catch_clauses) {
							Errors.error($str_alt443$Time_to_support_non_null_catch_cl);
						}
					}
					return listS(CUNWIND_PROTECT, try_form, append(body, NIL));
				}
			}
		}
	}

	public static SubLObject Xtry(final SubLObject macroform, final SubLObject environment) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject try_form = NIL;
		SubLObject catch_clauses = NIL;
		destructuring_bind_must_consp(current, datum, $list494);
		try_form = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list494);
		catch_clauses = current.first();
		final SubLObject body;
		current = body = current.rest();
		if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != catch_clauses)) {
			Errors.error($str495$Time_to_support_non_null_catch_cl);
		}
		return listS(CUNWIND_PROTECT, try_form, append(body, NIL));
	}

	public static final SubLObject java_backend_likely_unary_funcall_function_p_alt(SubLObject function) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (!function.isMacroOperator()) {
				if (NIL != form_translation.optimize_funcall_p(function)) {
					thread.resetMultipleValues();
					{
						SubLObject required_count = com.cyc.cycjava.cycl.java_backend.java_backend_function_signature_info(function);
						SubLObject optional_count = thread.secondMultipleValue();
						SubLObject restP = thread.thirdMultipleValue();
						thread.resetMultipleValues();
						if (optional_count.isNumber() && required_count.isNumber()) {
							{
								SubLObject min_arity = required_count;
								SubLObject max_arity = (NIL != restP) ? ((SubLObject) ($int$1000)) : add(required_count, optional_count);
								return makeBoolean(ONE_INTEGER.numGE(min_arity) && ONE_INTEGER.numLE(max_arity));
							}
						}
					}
				}
			}
			return NIL;
		}
	}

	public static SubLObject java_backend_likely_unary_funcall_function_p(final SubLObject function) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if ((!function.isMacroOperator()) && (NIL != form_translation.optimize_funcall_p(function))) {
			thread.resetMultipleValues();
			final SubLObject required_count = java_backend_function_signature_info(function);
			final SubLObject optional_count = thread.secondMultipleValue();
			final SubLObject restP = thread.thirdMultipleValue();
			thread.resetMultipleValues();
			if (optional_count.isNumber() && required_count.isNumber()) {
				final SubLObject min_arity = required_count;
				final SubLObject max_arity = (NIL != restP) ? $int$1000 : add(required_count, optional_count);
				return makeBoolean(ONE_INTEGER.numGE(min_arity) && ONE_INTEGER.numLE(max_arity));
			}
		}
		return NIL;
	}

	public static final SubLObject java_backend_write_unary_function_class_alt(SubLObject function, SubLObject stream) {
		SubLTrampolineFile.checkType(function, SYMBOLP);
		{
			SubLObject class_name = com.cyc.cycjava.cycl.java_backend.java_backend_unary_function_class_name(function);
			SubLObject function_name = system_translation.current_system_translation_secure_symbol_name(function);
			SubLObject arg_name = com.cyc.cycjava.cycl.java_backend.java_backend_method_formal_parameter_name(ARG1);
			SubLObject invocation_string = com.cyc.cycjava.cycl.java_backend.java_backend_unary_function_invocation_string(function);
			format(stream, $java_backend_unary_function_class_template$.getGlobalValue(), new SubLObject[] { class_name, class_name, function_name, arg_name, invocation_string });
		}
		return NIL;
	}

	public static SubLObject java_backend_write_unary_function_class(final SubLObject function, final SubLObject stream) {
		assert NIL != symbolp(function) : "! symbolp(function) " + ("Types.symbolp(function) " + "CommonSymbols.NIL != Types.symbolp(function) ") + function;
		final SubLObject class_name = java_backend_unary_function_class_name(function);
		final SubLObject function_name = system_translation.current_system_translation_secure_symbol_name(function);
		final SubLObject arg_name = java_backend_method_formal_parameter_name(ARG1);
		final SubLObject invocation_string = java_backend_unary_function_invocation_string(function);
		format(stream, $java_backend_unary_function_class_template$.getGlobalValue(), new SubLObject[] { class_name, class_name, function_name, arg_name, invocation_string });
		return NIL;
	}

	public static final SubLObject java_backend_write_unary_function_class_initializer_alt(SubLObject function, SubLObject stream) {
		SubLTrampolineFile.checkType(function, SYMBOLP);
		{
			SubLObject class_name = com.cyc.cycjava.cycl.java_backend.java_backend_unary_function_class_name(function);
			format(stream, $java_backend_unary_function_class_initializer_template$.getGlobalValue(), class_name);
		}
		return NIL;
	}

	public static SubLObject java_backend_write_unary_function_class_initializer(final SubLObject function, final SubLObject stream) {
		assert NIL != symbolp(function) : "! symbolp(function) " + ("Types.symbolp(function) " + "CommonSymbols.NIL != Types.symbolp(function) ") + function;
		final SubLObject class_name = java_backend_unary_function_class_name(function);
		format(stream, $java_backend_unary_function_class_initializer_template$.getGlobalValue(), class_name);
		return NIL;
	}

	public static final SubLObject java_backend_unary_function_class_name_internal_alt(SubLObject function) {
		{
			SubLObject class_prefix = java_name_translation.java_backend_function_name(function);
			return cconcatenate($str_alt205$_, new SubLObject[] { format_nil.format_nil_a_no_copy(class_prefix), $str_alt450$_UnaryFunction });
		}
	}

	public static SubLObject java_backend_unary_function_class_name_internal(final SubLObject function) {
		final SubLObject class_prefix = java_name_translation.java_backend_function_name(function);
		return cconcatenate($str250$_, new SubLObject[] { format_nil.format_nil_a_no_copy(class_prefix), $str502$_UnaryFunction });
	}

	public static final SubLObject java_backend_unary_function_class_name_alt(SubLObject function) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return com.cyc.cycjava.cycl.java_backend.java_backend_unary_function_class_name_internal(function);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, JAVA_BACKEND_UNARY_FUNCTION_CLASS_NAME, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), JAVA_BACKEND_UNARY_FUNCTION_CLASS_NAME, ONE_INTEGER, NIL, EQ, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, JAVA_BACKEND_UNARY_FUNCTION_CLASS_NAME, caching_state);
				}
				{
					SubLObject results = memoization_state.caching_state_lookup(caching_state, function, $kw49$_MEMOIZED_ITEM_NOT_FOUND_);
					if (results == $kw49$_MEMOIZED_ITEM_NOT_FOUND_) {
						results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.java_backend.java_backend_unary_function_class_name_internal(function)));
						memoization_state.caching_state_put(caching_state, function, results, UNPROVIDED);
					}
					return memoization_state.caching_results(results);
				}
			}
		}
	}

	public static SubLObject java_backend_unary_function_class_name(final SubLObject function) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return java_backend_unary_function_class_name_internal(function);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, JAVA_BACKEND_UNARY_FUNCTION_CLASS_NAME, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), JAVA_BACKEND_UNARY_FUNCTION_CLASS_NAME, ONE_INTEGER, NIL, EQ, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, JAVA_BACKEND_UNARY_FUNCTION_CLASS_NAME, caching_state);
		}
		SubLObject results = memoization_state.caching_state_lookup(caching_state, function, memoization_state.$memoized_item_not_found$.getGlobalValue());
		if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			results = arg2(thread.resetMultipleValues(), multiple_value_list(java_backend_unary_function_class_name_internal(function)));
			memoization_state.caching_state_put(caching_state, function, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	}

	public static final SubLObject java_backend_method_formal_parameter_name_alt(SubLObject variable) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject parameter_name = NIL;
				{
					SubLObject _prev_bind_0 = $java_backend_previous_local_variable_scope$.currentBinding(thread);
					SubLObject _prev_bind_1 = $java_backend_current_local_variable_scope$.currentBinding(thread);
					try {
						$java_backend_previous_local_variable_scope$.bind($java_backend_current_local_variable_scope$.getDynamicValue(thread), thread);
						$java_backend_current_local_variable_scope$.bind($java_backend_current_local_variable_scope$.getDynamicValue(thread), thread);
						com.cyc.cycjava.cycl.java_backend.java_backend_add_local_variable_to_scope(variable);
						parameter_name = com.cyc.cycjava.cycl.java_backend.java_backend_local_variable_name(variable);
					} finally {
						$java_backend_current_local_variable_scope$.rebind(_prev_bind_1, thread);
						$java_backend_previous_local_variable_scope$.rebind(_prev_bind_0, thread);
					}
				}
				return parameter_name;
			}
		}
	}

	public static SubLObject java_backend_method_formal_parameter_name(final SubLObject variable) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject parameter_name = NIL;
		final SubLObject _prev_bind_0 = $java_backend_previous_local_variable_scope$.currentBinding(thread);
		final SubLObject _prev_bind_2 = $java_backend_current_local_variable_scope$.currentBinding(thread);
		try {
			$java_backend_previous_local_variable_scope$.bind($java_backend_current_local_variable_scope$.getDynamicValue(thread), thread);
			$java_backend_current_local_variable_scope$.bind($java_backend_current_local_variable_scope$.getDynamicValue(thread), thread);
			java_backend_add_local_variable_to_scope(variable);
			parameter_name = java_backend_local_variable_name(variable);
		} finally {
			$java_backend_current_local_variable_scope$.rebind(_prev_bind_2, thread);
			$java_backend_previous_local_variable_scope$.rebind(_prev_bind_0, thread);
		}
		return parameter_name;
	}

	public static final SubLObject java_backend_unary_function_invocation_string_alt(SubLObject function) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject invocation_form = bq_cons(function, $list_alt451);
				SubLObject invocation_string = NIL;
				{
					SubLObject _prev_bind_0 = $java_backend_previous_local_variable_scope$.currentBinding(thread);
					SubLObject _prev_bind_1 = $java_backend_current_local_variable_scope$.currentBinding(thread);
					try {
						$java_backend_previous_local_variable_scope$.bind($java_backend_current_local_variable_scope$.getDynamicValue(thread), thread);
						$java_backend_current_local_variable_scope$.bind($java_backend_current_local_variable_scope$.getDynamicValue(thread), thread);
						com.cyc.cycjava.cycl.java_backend.java_backend_add_local_variable_to_scope(ARG1);
						{
							SubLObject stream = NIL;
							try {
								stream = make_private_string_output_stream();
								com.cyc.cycjava.cycl.java_backend.java_backend_write_form(invocation_form, stream, ZERO_INTEGER);
								invocation_string = get_output_stream_string(stream);
							} finally {
								{
									SubLObject _prev_bind_0_37 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										close(stream, UNPROVIDED);
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_37, thread);
									}
								}
							}
						}
					} finally {
						$java_backend_current_local_variable_scope$.rebind(_prev_bind_1, thread);
						$java_backend_previous_local_variable_scope$.rebind(_prev_bind_0, thread);
					}
				}
				return invocation_string;
			}
		}
	}

	public static SubLObject java_backend_unary_function_invocation_string(final SubLObject function) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject invocation_form = bq_cons(function, $list503);
		SubLObject invocation_string = NIL;
		final SubLObject _prev_bind_0 = $java_backend_previous_local_variable_scope$.currentBinding(thread);
		final SubLObject _prev_bind_2 = $java_backend_current_local_variable_scope$.currentBinding(thread);
		try {
			$java_backend_previous_local_variable_scope$.bind($java_backend_current_local_variable_scope$.getDynamicValue(thread), thread);
			$java_backend_current_local_variable_scope$.bind($java_backend_current_local_variable_scope$.getDynamicValue(thread), thread);
			java_backend_add_local_variable_to_scope(ARG1);
			SubLObject stream = NIL;
			try {
				stream = make_private_string_output_stream();
				java_backend_write_form(invocation_form, stream, ZERO_INTEGER);
				invocation_string = get_output_stream_string(stream);
			} finally {
				final SubLObject _prev_bind_0_$42 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					close(stream, UNPROVIDED);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$42, thread);
				}
			}
		} finally {
			$java_backend_current_local_variable_scope$.rebind(_prev_bind_2, thread);
			$java_backend_previous_local_variable_scope$.rebind(_prev_bind_0, thread);
		}
		return invocation_string;
	}

	public static final SubLObject java_backend_likely_binary_funcall_function_p_alt(SubLObject function) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (!function.isMacroOperator()) {
				if (NIL != form_translation.optimize_funcall_p(function)) {
					thread.resetMultipleValues();
					{
						SubLObject required_count = com.cyc.cycjava.cycl.java_backend.java_backend_function_signature_info(function);
						SubLObject optional_count = thread.secondMultipleValue();
						SubLObject restP = thread.thirdMultipleValue();
						thread.resetMultipleValues();
						if (optional_count.isNumber() && required_count.isNumber()) {
							{
								SubLObject min_arity = required_count;
								SubLObject max_arity = (NIL != restP) ? ((SubLObject) ($int$1000)) : add(required_count, optional_count);
								return makeBoolean(TWO_INTEGER.numGE(min_arity) && TWO_INTEGER.numLE(max_arity));
							}
						}
					}
				}
			}
			return NIL;
		}
	}

	public static SubLObject java_backend_likely_binary_funcall_function_p(final SubLObject function) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if ((!function.isMacroOperator()) && (NIL != form_translation.optimize_funcall_p(function))) {
			thread.resetMultipleValues();
			final SubLObject required_count = java_backend_function_signature_info(function);
			final SubLObject optional_count = thread.secondMultipleValue();
			final SubLObject restP = thread.thirdMultipleValue();
			thread.resetMultipleValues();
			if (optional_count.isNumber() && required_count.isNumber()) {
				final SubLObject min_arity = required_count;
				final SubLObject max_arity = (NIL != restP) ? $int$1000 : add(required_count, optional_count);
				return makeBoolean(TWO_INTEGER.numGE(min_arity) && TWO_INTEGER.numLE(max_arity));
			}
		}
		return NIL;
	}

	public static final SubLObject java_backend_write_binary_function_class_alt(SubLObject function, SubLObject stream) {
		SubLTrampolineFile.checkType(function, SYMBOLP);
		{
			SubLObject class_name = com.cyc.cycjava.cycl.java_backend.java_backend_binary_function_class_name(function);
			SubLObject function_name = system_translation.current_system_translation_secure_symbol_name(function);
			SubLObject arg1_name = com.cyc.cycjava.cycl.java_backend.java_backend_method_formal_parameter_name(ARG1);
			SubLObject arg2_name = com.cyc.cycjava.cycl.java_backend.java_backend_method_formal_parameter_name(ARG2);
			SubLObject invocation_string = com.cyc.cycjava.cycl.java_backend.java_backend_binary_function_invocation_string(function);
			format(stream, $java_backend_binary_function_class_template$.getGlobalValue(), new SubLObject[] { class_name, class_name, function_name, arg1_name, arg2_name, invocation_string });
		}
		return NIL;
	}

	public static SubLObject java_backend_write_binary_function_class(final SubLObject function, final SubLObject stream) {
		assert NIL != symbolp(function) : "! symbolp(function) " + ("Types.symbolp(function) " + "CommonSymbols.NIL != Types.symbolp(function) ") + function;
		final SubLObject class_name = java_backend_binary_function_class_name(function);
		final SubLObject function_name = system_translation.current_system_translation_secure_symbol_name(function);
		final SubLObject arg1_name = java_backend_method_formal_parameter_name(ARG1);
		final SubLObject arg2_name = java_backend_method_formal_parameter_name(ARG2);
		final SubLObject invocation_string = java_backend_binary_function_invocation_string(function);
		format(stream, $java_backend_binary_function_class_template$.getGlobalValue(), new SubLObject[] { class_name, class_name, function_name, arg1_name, arg2_name, invocation_string });
		return NIL;
	}

	public static final SubLObject java_backend_write_binary_function_class_initializer_alt(SubLObject function, SubLObject stream) {
		SubLTrampolineFile.checkType(function, SYMBOLP);
		{
			SubLObject class_name = com.cyc.cycjava.cycl.java_backend.java_backend_binary_function_class_name(function);
			format(stream, $java_backend_binary_function_class_initializer_template$.getGlobalValue(), class_name);
		}
		return NIL;
	}

	public static SubLObject java_backend_write_binary_function_class_initializer(final SubLObject function, final SubLObject stream) {
		assert NIL != symbolp(function) : "! symbolp(function) " + ("Types.symbolp(function) " + "CommonSymbols.NIL != Types.symbolp(function) ") + function;
		final SubLObject class_name = java_backend_binary_function_class_name(function);
		format(stream, $java_backend_binary_function_class_initializer_template$.getGlobalValue(), class_name);
		return NIL;
	}

	public static final SubLObject java_backend_binary_function_class_name_internal_alt(SubLObject function) {
		{
			SubLObject class_prefix = java_name_translation.java_backend_function_name(function);
			return cconcatenate($str_alt205$_, new SubLObject[] { format_nil.format_nil_a_no_copy(class_prefix), $str_alt455$_BinaryFunction });
		}
	}

	public static SubLObject java_backend_binary_function_class_name_internal(final SubLObject function) {
		final SubLObject class_prefix = java_name_translation.java_backend_function_name(function);
		return cconcatenate($str250$_, new SubLObject[] { format_nil.format_nil_a_no_copy(class_prefix), $str508$_BinaryFunction });
	}

	public static final SubLObject java_backend_binary_function_class_name_alt(SubLObject function) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return com.cyc.cycjava.cycl.java_backend.java_backend_binary_function_class_name_internal(function);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, JAVA_BACKEND_BINARY_FUNCTION_CLASS_NAME, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), JAVA_BACKEND_BINARY_FUNCTION_CLASS_NAME, ONE_INTEGER, NIL, EQ, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, JAVA_BACKEND_BINARY_FUNCTION_CLASS_NAME, caching_state);
				}
				{
					SubLObject results = memoization_state.caching_state_lookup(caching_state, function, $kw49$_MEMOIZED_ITEM_NOT_FOUND_);
					if (results == $kw49$_MEMOIZED_ITEM_NOT_FOUND_) {
						results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.java_backend.java_backend_binary_function_class_name_internal(function)));
						memoization_state.caching_state_put(caching_state, function, results, UNPROVIDED);
					}
					return memoization_state.caching_results(results);
				}
			}
		}
	}

	public static SubLObject java_backend_binary_function_class_name(final SubLObject function) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return java_backend_binary_function_class_name_internal(function);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, JAVA_BACKEND_BINARY_FUNCTION_CLASS_NAME, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), JAVA_BACKEND_BINARY_FUNCTION_CLASS_NAME, ONE_INTEGER, NIL, EQ, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, JAVA_BACKEND_BINARY_FUNCTION_CLASS_NAME, caching_state);
		}
		SubLObject results = memoization_state.caching_state_lookup(caching_state, function, memoization_state.$memoized_item_not_found$.getGlobalValue());
		if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			results = arg2(thread.resetMultipleValues(), multiple_value_list(java_backend_binary_function_class_name_internal(function)));
			memoization_state.caching_state_put(caching_state, function, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	}

	public static final SubLObject java_backend_binary_function_invocation_string_alt(SubLObject function) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject invocation_form = bq_cons(function, $list_alt456);
				SubLObject invocation_string = NIL;
				{
					SubLObject _prev_bind_0 = $java_backend_previous_local_variable_scope$.currentBinding(thread);
					SubLObject _prev_bind_1 = $java_backend_current_local_variable_scope$.currentBinding(thread);
					try {
						$java_backend_previous_local_variable_scope$.bind($java_backend_current_local_variable_scope$.getDynamicValue(thread), thread);
						$java_backend_current_local_variable_scope$.bind($java_backend_current_local_variable_scope$.getDynamicValue(thread), thread);
						com.cyc.cycjava.cycl.java_backend.java_backend_add_local_variable_to_scope(ARG1);
						com.cyc.cycjava.cycl.java_backend.java_backend_add_local_variable_to_scope(ARG2);
						{
							SubLObject stream = NIL;
							try {
								stream = make_private_string_output_stream();
								com.cyc.cycjava.cycl.java_backend.java_backend_write_form(invocation_form, stream, ZERO_INTEGER);
								invocation_string = get_output_stream_string(stream);
							} finally {
								{
									SubLObject _prev_bind_0_38 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										close(stream, UNPROVIDED);
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_38, thread);
									}
								}
							}
						}
					} finally {
						$java_backend_current_local_variable_scope$.rebind(_prev_bind_1, thread);
						$java_backend_previous_local_variable_scope$.rebind(_prev_bind_0, thread);
					}
				}
				return invocation_string;
			}
		}
	}

	public static SubLObject java_backend_binary_function_invocation_string(final SubLObject function) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject invocation_form = bq_cons(function, $list509);
		SubLObject invocation_string = NIL;
		final SubLObject _prev_bind_0 = $java_backend_previous_local_variable_scope$.currentBinding(thread);
		final SubLObject _prev_bind_2 = $java_backend_current_local_variable_scope$.currentBinding(thread);
		try {
			$java_backend_previous_local_variable_scope$.bind($java_backend_current_local_variable_scope$.getDynamicValue(thread), thread);
			$java_backend_current_local_variable_scope$.bind($java_backend_current_local_variable_scope$.getDynamicValue(thread), thread);
			java_backend_add_local_variable_to_scope(ARG1);
			java_backend_add_local_variable_to_scope(ARG2);
			SubLObject stream = NIL;
			try {
				stream = make_private_string_output_stream();
				java_backend_write_form(invocation_form, stream, ZERO_INTEGER);
				invocation_string = get_output_stream_string(stream);
			} finally {
				final SubLObject _prev_bind_0_$43 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					close(stream, UNPROVIDED);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$43, thread);
				}
			}
		} finally {
			$java_backend_current_local_variable_scope$.rebind(_prev_bind_2, thread);
			$java_backend_previous_local_variable_scope$.rebind(_prev_bind_0, thread);
		}
		return invocation_string;
	}

	public static final SubLObject java_backend_likely_zero_arity_funcall_function_p_alt(SubLObject function) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (!function.isMacroOperator()) {
				if (NIL != form_translation.optimize_funcall_p(function)) {
					thread.resetMultipleValues();
					{
						SubLObject required_count = com.cyc.cycjava.cycl.java_backend.java_backend_function_signature_info(function);
						SubLObject optional_count = thread.secondMultipleValue();
						SubLObject restP = thread.thirdMultipleValue();
						thread.resetMultipleValues();
						if (optional_count.isNumber() && required_count.isNumber()) {
							{
								SubLObject min_arity = required_count;
								SubLObject max_arity = (NIL != restP) ? ((SubLObject) ($int$1000)) : add(required_count, optional_count);
								return makeBoolean(ZERO_INTEGER.numGE(min_arity) && ZERO_INTEGER.numLE(max_arity));
							}
						}
					}
				}
			}
			return NIL;
		}
	}

	public static SubLObject java_backend_likely_zero_arity_funcall_function_p(final SubLObject function) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if ((!function.isMacroOperator()) && (NIL != form_translation.optimize_funcall_p(function))) {
			thread.resetMultipleValues();
			final SubLObject required_count = java_backend_function_signature_info(function);
			final SubLObject optional_count = thread.secondMultipleValue();
			final SubLObject restP = thread.thirdMultipleValue();
			thread.resetMultipleValues();
			if (optional_count.isNumber() && required_count.isNumber()) {
				final SubLObject min_arity = required_count;
				final SubLObject max_arity = (NIL != restP) ? $int$1000 : add(required_count, optional_count);
				return makeBoolean(ZERO_INTEGER.numGE(min_arity) && ZERO_INTEGER.numLE(max_arity));
			}
		}
		return NIL;
	}

	public static final SubLObject java_backend_write_zero_arity_function_class_alt(SubLObject function, SubLObject stream) {
		SubLTrampolineFile.checkType(function, SYMBOLP);
		{
			SubLObject class_name = com.cyc.cycjava.cycl.java_backend.java_backend_zero_arity_function_class_name(function);
			SubLObject function_name = system_translation.current_system_translation_secure_symbol_name(function);
			SubLObject invocation_string = com.cyc.cycjava.cycl.java_backend.java_backend_zero_arity_function_invocation_string(function);
			format(stream, $java_backend_zero_arity_function_class_template$.getGlobalValue(), new SubLObject[] { class_name, class_name, function_name, invocation_string });
		}
		return NIL;
	}

	public static SubLObject java_backend_write_zero_arity_function_class(final SubLObject function, final SubLObject stream) {
		assert NIL != symbolp(function) : "! symbolp(function) " + ("Types.symbolp(function) " + "CommonSymbols.NIL != Types.symbolp(function) ") + function;
		final SubLObject class_name = java_backend_zero_arity_function_class_name(function);
		final SubLObject function_name = system_translation.current_system_translation_secure_symbol_name(function);
		final SubLObject invocation_string = java_backend_zero_arity_function_invocation_string(function);
		format(stream, $java_backend_zero_arity_function_class_template$.getGlobalValue(), new SubLObject[] { class_name, class_name, function_name, invocation_string });
		return NIL;
	}

	public static final SubLObject java_backend_write_zero_arity_function_class_initializer_alt(SubLObject function, SubLObject stream) {
		SubLTrampolineFile.checkType(function, SYMBOLP);
		{
			SubLObject class_name = com.cyc.cycjava.cycl.java_backend.java_backend_zero_arity_function_class_name(function);
			format(stream, $java_backend_zero_arity_function_class_initializer_template$.getGlobalValue(), class_name);
		}
		return NIL;
	}

	public static SubLObject java_backend_write_zero_arity_function_class_initializer(final SubLObject function, final SubLObject stream) {
		assert NIL != symbolp(function) : "! symbolp(function) " + ("Types.symbolp(function) " + "CommonSymbols.NIL != Types.symbolp(function) ") + function;
		final SubLObject class_name = java_backend_zero_arity_function_class_name(function);
		format(stream, $java_backend_zero_arity_function_class_initializer_template$.getGlobalValue(), class_name);
		return NIL;
	}

	public static final SubLObject java_backend_zero_arity_function_class_name_internal_alt(SubLObject function) {
		{
			SubLObject class_prefix = java_name_translation.java_backend_function_name(function);
			return cconcatenate($str_alt205$_, new SubLObject[] { format_nil.format_nil_a_no_copy(class_prefix), $str_alt459$_ZeroArityFunction });
		}
	}

	public static SubLObject java_backend_zero_arity_function_class_name_internal(final SubLObject function) {
		final SubLObject class_prefix = java_name_translation.java_backend_function_name(function);
		return cconcatenate($str250$_, new SubLObject[] { format_nil.format_nil_a_no_copy(class_prefix), $str513$_ZeroArityFunction });
	}

	public static final SubLObject java_backend_zero_arity_function_class_name_alt(SubLObject function) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
				SubLObject caching_state = NIL;
				if (NIL == v_memoization_state) {
					return com.cyc.cycjava.cycl.java_backend.java_backend_zero_arity_function_class_name_internal(function);
				}
				caching_state = memoization_state.memoization_state_lookup(v_memoization_state, JAVA_BACKEND_ZERO_ARITY_FUNCTION_CLASS_NAME, UNPROVIDED);
				if (NIL == caching_state) {
					caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), JAVA_BACKEND_ZERO_ARITY_FUNCTION_CLASS_NAME, ONE_INTEGER, NIL, EQ, UNPROVIDED);
					memoization_state.memoization_state_put(v_memoization_state, JAVA_BACKEND_ZERO_ARITY_FUNCTION_CLASS_NAME, caching_state);
				}
				{
					SubLObject results = memoization_state.caching_state_lookup(caching_state, function, $kw49$_MEMOIZED_ITEM_NOT_FOUND_);
					if (results == $kw49$_MEMOIZED_ITEM_NOT_FOUND_) {
						results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.java_backend.java_backend_zero_arity_function_class_name_internal(function)));
						memoization_state.caching_state_put(caching_state, function, results, UNPROVIDED);
					}
					return memoization_state.caching_results(results);
				}
			}
		}
	}

	public static SubLObject java_backend_zero_arity_function_class_name(final SubLObject function) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return java_backend_zero_arity_function_class_name_internal(function);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, JAVA_BACKEND_ZERO_ARITY_FUNCTION_CLASS_NAME, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), JAVA_BACKEND_ZERO_ARITY_FUNCTION_CLASS_NAME, ONE_INTEGER, NIL, EQ, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, JAVA_BACKEND_ZERO_ARITY_FUNCTION_CLASS_NAME, caching_state);
		}
		SubLObject results = memoization_state.caching_state_lookup(caching_state, function, memoization_state.$memoized_item_not_found$.getGlobalValue());
		if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			results = arg2(thread.resetMultipleValues(), multiple_value_list(java_backend_zero_arity_function_class_name_internal(function)));
			memoization_state.caching_state_put(caching_state, function, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	}

	public static final SubLObject java_backend_zero_arity_function_invocation_string_alt(SubLObject function) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject invocation_form = list(function);
				SubLObject invocation_string = NIL;
				{
					SubLObject _prev_bind_0 = $java_backend_previous_local_variable_scope$.currentBinding(thread);
					SubLObject _prev_bind_1 = $java_backend_current_local_variable_scope$.currentBinding(thread);
					try {
						$java_backend_previous_local_variable_scope$.bind($java_backend_current_local_variable_scope$.getDynamicValue(thread), thread);
						$java_backend_current_local_variable_scope$.bind($java_backend_current_local_variable_scope$.getDynamicValue(thread), thread);
						{
							SubLObject stream = NIL;
							try {
								stream = make_private_string_output_stream();
								com.cyc.cycjava.cycl.java_backend.java_backend_write_form(invocation_form, stream, ZERO_INTEGER);
								invocation_string = get_output_stream_string(stream);
							} finally {
								{
									SubLObject _prev_bind_0_39 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										close(stream, UNPROVIDED);
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_39, thread);
									}
								}
							}
						}
					} finally {
						$java_backend_current_local_variable_scope$.rebind(_prev_bind_1, thread);
						$java_backend_previous_local_variable_scope$.rebind(_prev_bind_0, thread);
					}
				}
				return invocation_string;
			}
		}
	}

	public static SubLObject java_backend_zero_arity_function_invocation_string(final SubLObject function) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject invocation_form = list(function);
		SubLObject invocation_string = NIL;
		final SubLObject _prev_bind_0 = $java_backend_previous_local_variable_scope$.currentBinding(thread);
		final SubLObject _prev_bind_2 = $java_backend_current_local_variable_scope$.currentBinding(thread);
		try {
			$java_backend_previous_local_variable_scope$.bind($java_backend_current_local_variable_scope$.getDynamicValue(thread), thread);
			$java_backend_current_local_variable_scope$.bind($java_backend_current_local_variable_scope$.getDynamicValue(thread), thread);
			SubLObject stream = NIL;
			try {
				stream = make_private_string_output_stream();
				java_backend_write_form(invocation_form, stream, ZERO_INTEGER);
				invocation_string = get_output_stream_string(stream);
			} finally {
				final SubLObject _prev_bind_0_$44 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					close(stream, UNPROVIDED);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$44, thread);
				}
			}
		} finally {
			$java_backend_current_local_variable_scope$.rebind(_prev_bind_2, thread);
			$java_backend_previous_local_variable_scope$.rebind(_prev_bind_0, thread);
		}
		return invocation_string;
	}

	public static final SubLObject java_backend_optimize_function_call_form_alt(SubLObject function_call_form) {
		function_call_form = java_name_translation.java_backend_function_call_arity_transform(function_call_form);
		function_call_form = java_name_translation.java_backend_simplify_Xdtb_transform(function_call_form);
		function_call_form = java_name_translation.java_backend_function_to_method_transform(function_call_form);
		return function_call_form;
	}

	public static SubLObject java_backend_optimize_function_call_form(SubLObject function_call_form) {
		function_call_form = java_name_translation.java_backend_function_call_arity_transform(function_call_form);
		function_call_form = java_name_translation.java_backend_simplify_Xdtb_transform(function_call_form);
		function_call_form = java_name_translation.java_backend_function_to_method_transform(function_call_form);
		return function_call_form;
	}

	public static final SubLObject java_backend_output_system_level_files_alt(SubLObject sys_tran, SubLObject v_modules) {
		if (v_modules == UNPROVIDED) {
			v_modules = system_translation.sys_tran_modules(sys_tran);
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject system = system_translation.sys_tran_system(sys_tran);
				if (!system.equal($$$SUBLISP)) {
					{
						SubLObject output_directory = system_translation.sys_tran_output_directory(sys_tran);
						SubLObject system_default_path = system_translation.sys_tran_system_default_path(sys_tran);
						SubLObject system_class_name = com.cyc.cycjava.cycl.java_backend.java_backend_system_class_name(system);
						SubLObject system_init_filename = system_translation.translator_compute_full_filename(output_directory, system_default_path, system_class_name, $$$java);
						if (NIL == system_translation.translator_output_enabled_p()) {
							system_init_filename = $str_alt461$_dev_null;
						}
						{
							SubLObject filename_var = system_init_filename;
							SubLObject stream = NIL;
							try {
								{
									SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
									try {
										stream_macros.$stream_requires_locking$.bind(NIL, thread);
										stream = compatibility.open_text(filename_var, $OUTPUT, NIL);
									} finally {
										stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
									}
								}
								if (!stream.isStream()) {
									Errors.error($str_alt3$Unable_to_open__S, filename_var);
								}
								{
									SubLObject stream_40 = stream;
									com.cyc.cycjava.cycl.java_backend.java_backend_write_preamble(stream_40);
									com.cyc.cycjava.cycl.java_backend.java_backend_write_system_init_file_preamble(stream_40);
									{
										SubLObject cdolist_list_var = v_modules;
										SubLObject module = NIL;
										for (module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), module = cdolist_list_var.first()) {
											{
												SubLObject full_classname = com.cyc.cycjava.cycl.java_backend.java_backend_module_full_class_name(module);
												format(stream_40, $str_alt462$______SubLFiles_initialize___A___, full_classname);
											}
										}
									}
									com.cyc.cycjava.cycl.java_backend.java_backend_write_system_init_file_postamble(stream_40);
								}
							} finally {
								{
									SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if (stream.isStream()) {
											close(stream, UNPROVIDED);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
									}
								}
							}
						}
						return system_init_filename;
					}
				}
			}
			return NIL;
		}
	}

	public static SubLObject java_backend_output_system_level_files(final SubLObject sys_tran, SubLObject v_modules) {
		if (v_modules == UNPROVIDED) {
			v_modules = system_translation.sys_tran_modules(sys_tran);
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject system = system_translation.sys_tran_system(sys_tran);
		SubLObject system_init_filename = $str514$_dev_null;
		if (!system.equal($$$SUBLISP)) {
			final SubLObject output_directory = system_translation.sys_tran_output_directory(sys_tran);
			final SubLObject system_default_path = system_translation.sys_tran_system_default_path(sys_tran);
			final SubLObject system_class_name = java_backend_system_class_name(system);
			if (NIL != system_translation.translator_output_enabled_p()) {
				system_init_filename = system_translation.translator_compute_full_filename(output_directory, system_default_path, system_class_name, $$$java);
			}
			final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
			final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
			try {
				StreamsLow.$stream_initial_input_buffer_size$.bind($int$1048576, thread);
				StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
				final SubLObject filename_var = system_init_filename;
				SubLObject stream = NIL;
				try {
					final SubLObject _prev_bind_0_$45 = stream_macros.$stream_requires_locking$.currentBinding(thread);
					try {
						stream_macros.$stream_requires_locking$.bind(NIL, thread);
						stream = compatibility.open_text(filename_var, $OUTPUT);
					} finally {
						stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$45, thread);
					}
					if (!stream.isStream()) {
						Errors.error($str38$Unable_to_open__S, filename_var);
					}
					final SubLObject stream_$46 = stream;
					java_backend_write_preamble(stream_$46);
					java_backend_write_system_init_file_preamble(stream_$46);
					format(stream_$46, $str516$______preparePercentProgress__A__, length(v_modules));
					SubLObject cdolist_list_var = v_modules;
					SubLObject module = NIL;
					module = cdolist_list_var.first();
					while (NIL != cdolist_list_var) {
						final SubLObject full_classname = java_backend_module_full_class_name(module);
						format(stream_$46, $str517$______initializeClass___A___, full_classname);
						cdolist_list_var = cdolist_list_var.rest();
						module = cdolist_list_var.first();
					}
					format(stream_$46, $str518$________finishPercentProgress____);
					java_backend_write_system_init_file_postamble(stream_$46);
				} finally {
					final SubLObject _prev_bind_0_$46 = $is_thread_performing_cleanupP$.currentBinding(thread);
					try {
						$is_thread_performing_cleanupP$.bind(T, thread);
						final SubLObject _values = getValuesAsVector();
						if (stream.isStream()) {
							close(stream, UNPROVIDED);
						}
						restoreValuesFromVector(_values);
					} finally {
						$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$46, thread);
					}
				}
			} finally {
				StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_2, thread);
				StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0, thread);
			}
			final SubLObject filelist = system_translation.translator_compute_full_filename(output_directory, NIL, $$$filelist, $$$text);
			final SubLObject _prev_bind_3 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
			final SubLObject _prev_bind_4 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
			try {
				StreamsLow.$stream_initial_input_buffer_size$.bind($int$1048576, thread);
				StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
				final SubLObject filename_var2 = filelist;
				SubLObject stream2 = NIL;
				try {
					final SubLObject _prev_bind_0_$47 = stream_macros.$stream_requires_locking$.currentBinding(thread);
					try {
						stream_macros.$stream_requires_locking$.bind(NIL, thread);
						stream2 = compatibility.open_text(filename_var2, $OUTPUT);
					} finally {
						stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$47, thread);
					}
					if (!stream2.isStream()) {
						Errors.error($str38$Unable_to_open__S, filename_var2);
					}
					final SubLObject stream_$47 = stream2;
					SubLObject cdolist_list_var2 = v_modules;
					SubLObject module2 = NIL;
					module2 = cdolist_list_var2.first();
					while (NIL != cdolist_list_var2) {
						final SubLObject full_classname2 = java_backend_module_full_class_name(module2);
						generate_java_classname_include_file_entry(full_classname2, stream_$47);
						cdolist_list_var2 = cdolist_list_var2.rest();
						module2 = cdolist_list_var2.first();
					}
					generate_java_classname_include_file_entry($str521$com_cyc_cycjava_cycl_cycl, stream_$47);
				} finally {
					final SubLObject _prev_bind_0_$48 = $is_thread_performing_cleanupP$.currentBinding(thread);
					try {
						$is_thread_performing_cleanupP$.bind(T, thread);
						final SubLObject _values2 = getValuesAsVector();
						if (stream2.isStream()) {
							close(stream2, UNPROVIDED);
						}
						restoreValuesFromVector(_values2);
					} finally {
						$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$48, thread);
					}
				}
			} finally {
				StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_4, thread);
				StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_3, thread);
			}
			return system_init_filename;
		}
		return NIL;
	}

	public static SubLObject generate_java_classname_include_file_entry(final SubLObject full_classname, final SubLObject stream) {
		final SubLObject pathified_form = substitute(CHAR_slash, CHAR_period, full_classname, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		final SubLObject final_form = cconcatenate(pathified_form, $str522$_java);
		write_string(final_form, stream, UNPROVIDED, UNPROVIDED);
		terpri(stream);
		return full_classname;
	}

	public static final SubLObject java_backend_write_system_init_file_preamble_alt(SubLObject stream) {
		write_string($java_backend_write_system_init_file_preamble$.getGlobalValue(), stream, UNPROVIDED, UNPROVIDED);
		return NIL;
	}

	public static SubLObject java_backend_write_system_init_file_preamble(final SubLObject stream) {
		write_string($java_backend_write_system_init_file_preamble$.getGlobalValue(), stream, UNPROVIDED, UNPROVIDED);
		return NIL;
	}

	public static final SubLObject java_backend_write_system_init_file_postamble_alt(SubLObject stream) {
		write_string($java_backend_write_system_init_file_postamble$.getGlobalValue(), stream, UNPROVIDED, UNPROVIDED);
		return NIL;
	}

	public static SubLObject java_backend_write_system_init_file_postamble(final SubLObject stream) {
		write_string($java_backend_write_system_init_file_postamble$.getGlobalValue(), stream, UNPROVIDED, UNPROVIDED);
		return NIL;
	}

	public static final SubLObject fprog2_alt(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject expression1 = NIL;
			SubLObject expression2 = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt465);
			expression1 = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt465);
			expression2 = current.first();
			current = current.rest();
			if (NIL == current) {
				return list(FWHEN, list(TRUE, expression1), expression2);
			} else {
				cdestructuring_bind_error(datum, $list_alt465);
			}
		}
		return NIL;
	}

	public static SubLObject fprog2(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject expression1 = NIL;
		SubLObject expression2 = NIL;
		destructuring_bind_must_consp(current, datum, $list525);
		expression1 = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list525);
		expression2 = current.first();
		current = current.rest();
		if (NIL == current) {
			return list(FWHEN, list(TRUE, expression1), expression2);
		}
		cdestructuring_bind_error(datum, $list525);
		return NIL;
	}

	public static final SubLObject java_backend_write_patcher_for_classes_alt(SubLObject full_class_names, SubLObject patcher_id) {
		if (patcher_id == UNPROVIDED) {
			patcher_id = get_universal_time();
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject patcher_name = cconcatenate($$$patcher, format_nil.format_nil_a_no_copy(patcher_id));
				SubLObject patched_classes = NIL;
				{
					SubLObject stream = NIL;
					try {
						stream = make_private_string_output_stream();
						{
							SubLObject list_var = NIL;
							SubLObject full_class_name = NIL;
							SubLObject index = NIL;
							for (list_var = full_class_names, full_class_name = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), full_class_name = list_var.first(), index = add(ONE_INTEGER, index)) {
								if (!index.isZero()) {
									format(stream, $str_alt470$_______);
								}
								prin1(full_class_name, stream);
							}
						}
						patched_classes = get_output_stream_string(stream);
					} finally {
						{
							SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
							try {
								$is_thread_performing_cleanupP$.bind(T, thread);
								close(stream, UNPROVIDED);
							} finally {
								$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
							}
						}
					}
				}
				{
					SubLObject sys_tran = system_translation.current_system_translation();
					SubLObject output_directory = system_translation.sys_tran_output_directory(sys_tran);
					SubLObject patcher_filename = system_translation.translator_compute_full_filename(output_directory, $list_alt471, patcher_name, $$$java);
					SubLObject stream = NIL;
					try {
						{
							SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
							try {
								stream_macros.$stream_requires_locking$.bind(NIL, thread);
								stream = compatibility.open_text(patcher_filename, $OUTPUT, NIL);
							} finally {
								stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
							}
						}
						if (!stream.isStream()) {
							Errors.error($str_alt3$Unable_to_open__S, patcher_filename);
						}
						{
							SubLObject stream_41 = stream;
							format(stream_41, $patcher_template$.getGlobalValue(), new SubLObject[] { patcher_name, patcher_id, patched_classes });
						}
					} finally {
						{
							SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
							try {
								$is_thread_performing_cleanupP$.bind(T, thread);
								if (stream.isStream()) {
									close(stream, UNPROVIDED);
								}
							} finally {
								$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
							}
						}
					}
					return patcher_filename;
				}
			}
		}
	}

	public static SubLObject java_backend_write_patcher_for_classes(final SubLObject full_class_names, SubLObject patcher_id) {
		if (patcher_id == UNPROVIDED) {
			patcher_id = get_universal_time();
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject patcher_name = cconcatenate($$$patcher, format_nil.format_nil_a_no_copy(patcher_id));
		SubLObject patched_classes = NIL;
		SubLObject stream = NIL;
		try {
			stream = make_private_string_output_stream();
			SubLObject list_var = NIL;
			SubLObject full_class_name = NIL;
			SubLObject index = NIL;
			list_var = full_class_names;
			full_class_name = list_var.first();
			for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), full_class_name = list_var.first(), index = add(ONE_INTEGER, index)) {
				if (!index.isZero()) {
					format(stream, $str530$_______);
				}
				prin1(full_class_name, stream);
			}
			patched_classes = get_output_stream_string(stream);
		} finally {
			final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
			try {
				$is_thread_performing_cleanupP$.bind(T, thread);
				final SubLObject _values = getValuesAsVector();
				close(stream, UNPROVIDED);
				restoreValuesFromVector(_values);
			} finally {
				$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
			}
		}
		final SubLObject sys_tran = system_translation.current_system_translation();
		final SubLObject output_directory = system_translation.sys_tran_output_directory(sys_tran);
		final SubLObject patcher_filename = system_translation.translator_compute_full_filename(output_directory, $list531, patcher_name, $$$java);
		file_utilities.ensure_directories_exist(patcher_filename);
		SubLObject stream2 = NIL;
		try {
			final SubLObject _prev_bind_2 = stream_macros.$stream_requires_locking$.currentBinding(thread);
			try {
				stream_macros.$stream_requires_locking$.bind(NIL, thread);
				stream2 = compatibility.open_text(patcher_filename, $OUTPUT);
			} finally {
				stream_macros.$stream_requires_locking$.rebind(_prev_bind_2, thread);
			}
			if (!stream2.isStream()) {
				Errors.error($str38$Unable_to_open__S, patcher_filename);
			}
			final SubLObject stream_$51 = stream2;
			format(stream_$51, $patcher_template$.getGlobalValue(), new SubLObject[] { patcher_name, patcher_id, patched_classes });
		} finally {
			final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
			try {
				$is_thread_performing_cleanupP$.bind(T, thread);
				final SubLObject _values2 = getValuesAsVector();
				if (stream2.isStream()) {
					close(stream2, UNPROVIDED);
				}
				restoreValuesFromVector(_values2);
			} finally {
				$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
			}
		}
		return patcher_filename;
	}

	public static final SubLString $str_alt3$Unable_to_open__S = makeString("Unable to open ~S");

	public static final SubLString $str_alt5$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

	public static final SubLString $str_alt6$____ = makeString("/*~%");

	public static final SubLString $str_alt7$_____A__ = makeString(" *  ~A~%");

	public static final SubLString $str_alt8$___ = makeString(" */");

	public static final SubLString $str_alt9$____package__A_ = makeString("~%~%package ~A;");

	public static final SubLString $str_alt11$com_cyc_tool_subl_jrtl_translated = makeString("com.cyc.tool.subl.jrtl.translatedCode");

	public static final SubLString $str_alt13$com_cyc_cycjava = makeString("com.cyc.cycjava");

	public static final SubLString $str_alt14$time_to_implement_multiple_system = makeString("time to implement multiple system translation");

	public static final SubLString $str_alt15$_ = makeString(".");

	public static final SubLString $str_alt17$package_ = makeString("package_");

	public static final SubLList $list_alt18 = list(CHAR_slash);

	public static final SubLString $str_alt19$__import_java_util_Iterator_ = makeString("~%import java.util.Iterator;");

	public static final SubLString $str_alt20$__import_java_util_Map_Entry_ = makeString("~%import java.util.Map.Entry;");

	public static final SubLString $str_alt21$__import_java_util_ArrayList_ = makeString("~%import java.util.ArrayList;");

	public static final SubLString $str_alt22$__import_com_cyc_tool_subl_jrtl_n = makeString("~%import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;");

	public static final SubLString $str_alt23$__import_com_cyc_tool_subl_jrtl_n = makeString("~%import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;");

	public static final SubLString $str_alt24$__import_com_cyc_tool_subl_jrtl_n = makeString("~%import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;");

	public static final SubLString $str_alt25$__import_com_cyc_tool_subl_jrtl_n = makeString("~%import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;");

	public static final SubLString $str_alt26$__import_com_cyc_tool_subl_jrtl_t = makeString("~%import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;");

	public static final SubLString $str_alt27$__import_com_cyc_tool_subl_util__ = makeString("~%import com.cyc.tool.subl.util.*;");

	public static final SubLObject java_backend_write_patcher_for_modules_alt(SubLObject v_modules, SubLObject patcher_id) {
		if (patcher_id == UNPROVIDED) {
			patcher_id = get_universal_time();
		}
		{
			SubLObject full_class_names = Mapping.mapcar(symbol_function(JAVA_BACKEND_MODULE_FULL_CLASS_NAME), v_modules);
			SubLObject patcher_filename = com.cyc.cycjava.cycl.java_backend.java_backend_write_patcher_for_classes(full_class_names, patcher_id);
			SubLObject class_pathnames = NIL;
			return listS(patcher_filename, class_pathnames);
		}
	}

	public static SubLObject java_backend_write_patcher_for_modules(final SubLObject v_modules, SubLObject patcher_id) {
		if (patcher_id == UNPROVIDED) {
			patcher_id = get_universal_time();
		}
		final SubLObject full_class_names = Mapping.mapcar(symbol_function(JAVA_BACKEND_MODULE_FULL_CLASS_NAME), v_modules);
		final SubLObject patcher_filename = java_backend_write_patcher_for_classes(full_class_names, patcher_id);
		final SubLObject class_pathnames = NIL;
		return listS(patcher_filename, class_pathnames);
	}

	public static final SubLString $str_alt28$__import_static_com_cyc_tool_subl = makeString("~%import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.~A;");

	public static final SubLList $list_alt29 = list(new SubLObject[] { makeString("makeBoolean"), makeString("makeInteger"), makeString("makeDouble"), makeString("makeChar"), makeString("makeString"), makeString("makeSymbol"), makeString("makeKeyword"), makeString("makeUninternedSymbol"), makeString("makeGuid") });

	public static final SubLString $str_alt30$__import_static_com_cyc_tool_subl = makeString("~%import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.~A;");

	public static final SubLObject java_backend_note_function_call_rest_arity_alt(SubLObject operator, SubLObject rest_arity) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL != $java_backend_rest_arity_table$.getDynamicValue(thread)) {
				{
					SubLObject arity_alist = dictionary.dictionary_lookup_without_values($java_backend_rest_arity_table$.getDynamicValue(thread), operator, UNPROVIDED);
					SubLObject old_value = list_utilities.alist_lookup_without_values(arity_alist, rest_arity, symbol_function(EQL), ZERO_INTEGER);
					SubLObject new_value = number_utilities.f_1X(old_value);
					arity_alist = list_utilities.alist_enter_without_values(arity_alist, rest_arity, new_value, symbol_function(EQL));
					if (old_value.isZero()) {
						dictionary.dictionary_enter($java_backend_rest_arity_table$.getDynamicValue(thread), operator, arity_alist);
					}
					return new_value;
				}
			}
			return NIL;
		}
	}

	public static SubLObject java_backend_note_function_call_rest_arity(final SubLObject operator, final SubLObject rest_arity) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != $java_backend_rest_arity_table$.getDynamicValue(thread)) {
			SubLObject arity_alist = dictionary.dictionary_lookup_without_values($java_backend_rest_arity_table$.getDynamicValue(thread), operator, UNPROVIDED);
			final SubLObject old_value = list_utilities.alist_lookup_without_values(arity_alist, rest_arity, symbol_function(EQL), ZERO_INTEGER);
			final SubLObject new_value = number_utilities.f_1X(old_value);
			arity_alist = list_utilities.alist_enter_without_values(arity_alist, rest_arity, new_value, symbol_function(EQL));
			if (old_value.isZero()) {
				dictionary.dictionary_enter($java_backend_rest_arity_table$.getDynamicValue(thread), operator, arity_alist);
			}
			return new_value;
		}
		return NIL;
	}

	public static final SubLList $list_alt31 = list(makeString("cons"), makeString("list"), makeString("listS"));

	public static final SubLString $str_alt32$__import_static_com_cyc_tool_subl = makeString("~%import static com.cyc.tool.subl.util.SubLFiles.~A;");

	public static final SubLList $list_alt33 = list(makeString("defconstant"), makeString("deflexical"), makeString("defparameter"), makeString("defvar"), makeString("declareFunction("), makeString("declareMacro"));

	public static final SubLString $str_alt34$CONSTANT_HANDLES = makeString("CONSTANT-HANDLES");

	public static final SubLString $str_alt35$____ = makeString("~%~%");

	public static final SubLString $str_alt36$__import__A_ = makeString("~%import ~A;");

	public static final SubLString $str_alt37$_____ = makeString("/**~%");

	public static final SubLList $list_alt38 = list($NONE, makeKeyword("MEDIUM"));

	public static final SubLObject java_backend_function_call_rest_arity_stats_alt() {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject rest_arity_tuples = NIL;
				SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($java_backend_rest_arity_table$.getDynamicValue(thread)));
				while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
					thread.resetMultipleValues();
					{
						SubLObject operator = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
						SubLObject arity_alist = thread.secondMultipleValue();
						thread.resetMultipleValues();
						{
							SubLObject cdolist_list_var = arity_alist;
							SubLObject cons = NIL;
							for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), cons = cdolist_list_var.first()) {
								{
									SubLObject datum = cons;
									SubLObject current = datum;
									SubLObject v_arity = NIL;
									SubLObject count = NIL;
									destructuring_bind_must_consp(current, datum, $list_alt473);
									v_arity = current.first();
									current = current.rest();
									count = current;
									rest_arity_tuples = cons(list(operator, v_arity, count), rest_arity_tuples);
								}
							}
						}
						iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
					}
				}
				dictionary_contents.do_dictionary_contents_finalize(iteration_state);
				rest_arity_tuples = Sort.sort(rest_arity_tuples, symbol_function($sym474$_), symbol_function(THIRD));
				return rest_arity_tuples;
			}
		}
	}

	public static SubLObject java_backend_function_call_rest_arity_stats() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject rest_arity_tuples = NIL;
		SubLObject iteration_state;
		for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($java_backend_rest_arity_table$.getDynamicValue(thread))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
			thread.resetMultipleValues();
			final SubLObject operator = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
			final SubLObject arity_alist = thread.secondMultipleValue();
			thread.resetMultipleValues();
			SubLObject cdolist_list_var = arity_alist;
			SubLObject cons = NIL;
			cons = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject current;
				final SubLObject datum = current = cons;
				SubLObject v_arity = NIL;
				SubLObject count = NIL;
				destructuring_bind_must_consp(current, datum, $list533);
				v_arity = current.first();
				current = count = current.rest();
				rest_arity_tuples = cons(list(operator, v_arity, count), rest_arity_tuples);
				cdolist_list_var = cdolist_list_var.rest();
				cons = cdolist_list_var.first();
			}
		}
		dictionary_contents.do_dictionary_contents_finalize(iteration_state);
		rest_arity_tuples = Sort.sort(rest_arity_tuples, symbol_function($sym534$_), symbol_function(THIRD));
		return rest_arity_tuples;
	}

	public static final SubLString $str_alt39$____module________A__ = makeString(" *  module:      ~A~%");

	public static final SubLString $str_alt40$____source_file___A__ = makeString(" *  source file: ~A~%");

	public static final SubLString $str_alt41$____created_______4__0D__2__0D__2 = makeString(" *  created:     ~4,'0D/~2,'0D/~2,'0D ~2,'0D:~2,'0D:~2,'0D~%");

	public static final SubLString $str_alt42$public_final_class_ = makeString("public final class ");

	public static final SubLString $str_alt43$_extends_SubLTranslatedFile_ = makeString(" extends SubLTranslatedFile ");

	public static final SubLString $str_alt44$_ = makeString("{");

	public static final SubLString $str_alt45$_ = makeString("}");

	public static final SubLList $list_alt47 = list(makeKeyword("LOW"), $HIGH);

	public static final SubLString $str_alt48$module_4__0D = makeString("module~4,'0D");

	public static final SubLSymbol $kw49$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

	public static final SubLString $str_alt50$_____Constructor = makeString("//// Constructor");

	public static final SubLString $str_alt51$private__A_____ = makeString("private ~A() {}");

	public static final SubLString $str_alt52$public_static_final_SubLFile_me__ = makeString("public static final SubLFile me = new ~A();");

	public static final SubLString $str_alt53$public_static_final_String_myName = makeString("public static final String myName = ~S;");

	public static final SubLString $str_alt54$public_static_final_String_myFing = makeString("public static final String myFingerPrint = ~S;");

	public static SubLObject declare_java_backend_file() {
		declareFunction("is_java_backend_logging_activeP", "IS-JAVA-BACKEND-LOGGING-ACTIVE?", 0, 0, false);
		declareMacro("with_java_backend_logging_level", "WITH-JAVA-BACKEND-LOGGING-LEVEL");
		declareMacro("java_backend_logging_for_current_method", "JAVA-BACKEND-LOGGING-FOR-CURRENT-METHOD");
		declareFunction("java_backend_current_method_needs_logging_p", "JAVA-BACKEND-CURRENT-METHOD-NEEDS-LOGGING-P", 0, 0, false);
		declareFunction("java_backend_get_current_method_needing_logging", "JAVA-BACKEND-GET-CURRENT-METHOD-NEEDING-LOGGING", 0, 0, false);
		declareFunction("java_backend_function_symbol_is_blacklistedP", "JAVA-BACKEND-FUNCTION-SYMBOL-IS-BLACKLISTED?", 1, 0, false);
		declareFunction("is_java_backend_method_covered_by_logging_levelP", "IS-JAVA-BACKEND-METHOD-COVERED-BY-LOGGING-LEVEL?", 1, 0, false);
		declareFunction("java_backend_write_logger_import", "JAVA-BACKEND-WRITE-LOGGER-IMPORT", 1, 0, false);
		declareFunction("java_backend_write_logger_class_level_declaration", "JAVA-BACKEND-WRITE-LOGGER-CLASS-LEVEL-DECLARATION", 2, 0, false);
		declareFunction("java_backend_write_method_entry", "JAVA-BACKEND-WRITE-METHOD-ENTRY", 4, 0, false);
		declareFunction("java_backend_write_method_exit", "JAVA-BACKEND-WRITE-METHOD-EXIT", 3, 0, false);
		declareFunction("java_backend_possibly_write_logger_import", "JAVA-BACKEND-POSSIBLY-WRITE-LOGGER-IMPORT", 1, 0, false);
		declareFunction("java_backend_possibly_write_logger_class_level_declaration", "JAVA-BACKEND-POSSIBLY-WRITE-LOGGER-CLASS-LEVEL-DECLARATION", 2, 0, false);
		declareFunction("java_backend_output_file", "JAVA-BACKEND-OUTPUT-FILE", 2, 1, false);
		declareFunction("java_backend_output_to_stream", "JAVA-BACKEND-OUTPUT-TO-STREAM", 1, 2, false);
		declareFunction("java_backend_output_header_section", "JAVA-BACKEND-OUTPUT-HEADER-SECTION", 2, 0, false);
		declareFunction("java_backend_write_preamble", "JAVA-BACKEND-WRITE-PREAMBLE", 1, 0, false);
		declareFunction("java_backend_write_package", "JAVA-BACKEND-WRITE-PACKAGE", 2, 0, false);
		declareFunction("java_backend_compute_module_package", "JAVA-BACKEND-COMPUTE-MODULE-PACKAGE", 1, 0, false);
		declareFunction("java_backend_compute_package_prefix", "JAVA-BACKEND-COMPUTE-PACKAGE-PREFIX", 0, 0, false);
		declareFunction("java_backend_compute_package_postfix", "JAVA-BACKEND-COMPUTE-PACKAGE-POSTFIX", 1, 0, false);
		declareFunction("java_backend_package_name_for_subdir", "JAVA-BACKEND-PACKAGE-NAME-FOR-SUBDIR", 1, 0, false);
		declareFunction("java_backend_canonicalize_identifier_name", "JAVA-BACKEND-CANONICALIZE-IDENTIFIER-NAME", 1, 0, false);
		declareFunction("java_backend_uncanonicalize_identifier_name", "JAVA-BACKEND-UNCANONICALIZE-IDENTIFIER-NAME", 1, 0, false);
		declareFunction("current_system_translation_module_subdirs", "CURRENT-SYSTEM-TRANSLATION-MODULE-SUBDIRS", 1, 0, false);
		declareFunction("current_system_translation_system_subdir_prefix", "CURRENT-SYSTEM-TRANSLATION-SYSTEM-SUBDIR-PREFIX", 0, 0, false);
		declareFunction("current_system_translation_system", "CURRENT-SYSTEM-TRANSLATION-SYSTEM", 0, 0, false);
		declareFunction("java_backend_write_imports", "JAVA-BACKEND-WRITE-IMPORTS", 2, 0, false);
		declareFunction("java_backend_module_full_class_name", "JAVA-BACKEND-MODULE-FULL-CLASS-NAME", 1, 0, false);
		declareFunction("java_backend_write_class_comment", "JAVA-BACKEND-WRITE-CLASS-COMMENT", 2, 0, false);
		declareFunction("java_backend_current_class", "JAVA-BACKEND-CURRENT-CLASS", 0, 0, false);
		declareFunction("java_backend_output_class", "JAVA-BACKEND-OUTPUT-CLASS", 3, 1, false);
		declareFunction("java_backend_module_class_name_internal", "JAVA-BACKEND-MODULE-CLASS-NAME-INTERNAL", 1, 0, false);
		declareFunction("java_backend_module_class_name", "JAVA-BACKEND-MODULE-CLASS-NAME", 1, 0, false);
		declareFunction("java_backend_system_class_name", "JAVA-BACKEND-SYSTEM-CLASS-NAME", 1, 0, false);
		declareFunction("java_backend_class_name_from_string", "JAVA-BACKEND-CLASS-NAME-FROM-STRING", 1, 0, false);
		declareFunction("java_backend_output_constructor_section", "JAVA-BACKEND-OUTPUT-CONSTRUCTOR-SECTION", 4, 1, false);
		declareMacro("java_backend_gather_initializer_methods", "JAVA-BACKEND-GATHER-INITIALIZER-METHODS");
		declareFunction("java_backend_note_initializer_method", "JAVA-BACKEND-NOTE-INITIALIZER-METHOD", 1, 0, false);
		declareFunction("java_backend_initializer_method_p", "JAVA-BACKEND-INITIALIZER-METHOD-P", 1, 0, false);
		declareFunction("java_backend_initializer_methods", "JAVA-BACKEND-INITIALIZER-METHODS", 0, 0, false);
		declareFunction("java_backend_output_definitions", "JAVA-BACKEND-OUTPUT-DEFINITIONS", 3, 0, false);
		declareFunction("java_backend_gather_internal_constant_definitions", "JAVA-BACKEND-GATHER-INTERNAL-CONSTANT-DEFINITIONS", 1, 0, false);
		declareFunction("translator_internal_constant_form_p", "TRANSLATOR-INTERNAL-CONSTANT-FORM-P", 1, 0, false);
		declareFunction("java_backend_output_initilizers", "JAVA-BACKEND-OUTPUT-INITILIZERS", 3, 0, false);
		declareFunction("java_backend_write_statement", "JAVA-BACKEND-WRITE-STATEMENT", 2, 1, false);
		declareFunction("java_backend_write_form", "JAVA-BACKEND-WRITE-FORM", 2, 1, false);
		declareFunction("java_backend_test_translate_write_form", "JAVA-BACKEND-TEST-TRANSLATE-WRITE-FORM", 2, 1, false);
		declareFunction("java_backend_indent", "JAVA-BACKEND-INDENT", 2, 0, false);
		declareFunction("java_backend_print_atom", "JAVA-BACKEND-PRINT-ATOM", 3, 0, false);
		declareFunction("java_backend_native_constant_p", "JAVA-BACKEND-NATIVE-CONSTANT-P", 1, 0, false);
		declareFunction("java_backend_write_native_constant", "JAVA-BACKEND-WRITE-NATIVE-CONSTANT", 2, 0, false);
		declareFunction("java_backend_write_Xpc", "JAVA-BACKEND-WRITE-%PC", 2, 1, false);
		declareFunction("java_backend_print_variable", "JAVA-BACKEND-PRINT-VARIABLE", 2, 0, false);
		declareFunction("java_backend_write_global_name", "JAVA-BACKEND-WRITE-GLOBAL-NAME", 2, 0, false);
		declareFunction("java_backend_variable_binding_type", "JAVA-BACKEND-VARIABLE-BINDING-TYPE", 1, 0, false);
		declareMacro("java_backend_new_local_variable_scope", "JAVA-BACKEND-NEW-LOCAL-VARIABLE-SCOPE");
		declareFunction("java_backend_add_local_variable_to_scope", "JAVA-BACKEND-ADD-LOCAL-VARIABLE-TO-SCOPE", 1, 0, false);
		declareFunction("java_backend_local_variable_name", "JAVA-BACKEND-LOCAL-VARIABLE-NAME", 1, 0, false);
		declareFunction("java_backend_compute_local_variable_name", "JAVA-BACKEND-COMPUTE-LOCAL-VARIABLE-NAME", 1, 0, false);
		declareFunction("java_backend_local_uniquifier", "JAVA-BACKEND-LOCAL-UNIQUIFIER", 1, 0, false);
		declareFunction("java_backend_local_variable_name_basis", "JAVA-BACKEND-LOCAL-VARIABLE-NAME-BASIS", 1, 0, false);
		declareFunction("java_backend_secure_local_id_internal", "JAVA-BACKEND-SECURE-LOCAL-ID-INTERNAL", 1, 0, false);
		declareFunction("java_backend_secure_local_id", "JAVA-BACKEND-SECURE-LOCAL-ID", 1, 0, false);
		declareFunction("java_backend_write_function_call", "JAVA-BACKEND-WRITE-FUNCTION-CALL", 3, 0, false);
		declareFunction("java_backend_write_function_definition_name", "JAVA-BACKEND-WRITE-FUNCTION-DEFINITION-NAME", 2, 0, false);
		declareFunction("java_backend_write_function_invocation_name", "JAVA-BACKEND-WRITE-FUNCTION-INVOCATION-NAME", 2, 0, false);
		declareFunction("java_backend_write_function_call_rest_args", "JAVA-BACKEND-WRITE-FUNCTION-CALL-REST-ARGS", 3, 0, false);
		declareFunction("java_backend_function_signature_info", "JAVA-BACKEND-FUNCTION-SIGNATURE-INFO", 1, 0, false);
		declareFunction("java_backend_function_arglist", "JAVA-BACKEND-FUNCTION-ARGLIST", 1, 0, false);
		declareFunction("java_backend_write_function_call_argument_separator", "JAVA-BACKEND-WRITE-FUNCTION-CALL-ARGUMENT-SEPARATOR", 1, 0, false);
		declareFunction("java_backend_write_function_call_unprovided_argument", "JAVA-BACKEND-WRITE-FUNCTION-CALL-UNPROVIDED-ARGUMENT", 1, 0, false);
		declareFunction("java_backend_writer", "JAVA-BACKEND-WRITER", 1, 0, false);
		declareFunction("java_backend_write_via_writer", "JAVA-BACKEND-WRITE-VIA-WRITER", 4, 0, false);
		declareFunction("java_backend_write_Xdp_check_type", "JAVA-BACKEND-WRITE-%DP-CHECK-TYPE", 3, 0, false);
		declareFunction("java_backend_write_Xdp_enforce_type", "JAVA-BACKEND-WRITE-%DP-ENFORCE-TYPE", 3, 0, false);
		declareFunction("java_backend_write_checker", "JAVA-BACKEND-WRITE-CHECKER", 4, 0, false);
		declareFunction("java_backend_write_Xccatch", "JAVA-BACKEND-WRITE-%CCATCH", 3, 0, false);
		declareFunction("java_backend_write_Xcdo_symbols", "JAVA-BACKEND-WRITE-%CDO-SYMBOLS", 3, 0, false);
		declareFunction("java_backend_write_clet_bind", "JAVA-BACKEND-WRITE-CLET-BIND", 3, 0, false);
		declareFunction("clear_java_backend_clet_bind_local_variable", "CLEAR-JAVA-BACKEND-CLET-BIND-LOCAL-VARIABLE", 0, 0, false);
		declareFunction("remove_java_backend_clet_bind_local_variable", "REMOVE-JAVA-BACKEND-CLET-BIND-LOCAL-VARIABLE", 1, 0, false);
		declareFunction("java_backend_clet_bind_local_variable_internal", "JAVA-BACKEND-CLET-BIND-LOCAL-VARIABLE-INTERNAL", 1, 0, false);
		declareFunction("java_backend_clet_bind_local_variable", "JAVA-BACKEND-CLET-BIND-LOCAL-VARIABLE", 1, 0, false);
		declareFunction("java_backend_write_clet_local", "JAVA-BACKEND-WRITE-CLET-LOCAL", 3, 0, false);
		declareFunction("java_backend_write_code_comment", "JAVA-BACKEND-WRITE-CODE-COMMENT", 3, 0, false);
		declareFunction("java_backend_write_Xcprogv", "JAVA-BACKEND-WRITE-%CPROGV", 3, 0, false);
		declareFunction("java_backend_write_csetq", "JAVA-BACKEND-WRITE-CSETQ", 3, 0, false);
		declareFunction("java_backend_write_csetq_dynamic", "JAVA-BACKEND-WRITE-CSETQ-DYNAMIC", 3, 0, false);
		declareFunction("java_backend_write_csetq_lexical", "JAVA-BACKEND-WRITE-CSETQ-LEXICAL", 3, 0, false);
		declareFunction("java_backend_write_csetq_local", "JAVA-BACKEND-WRITE-CSETQ-LOCAL", 3, 0, false);
		declareFunction("java_backend_write_assignment_operator", "JAVA-BACKEND-WRITE-ASSIGNMENT-OPERATOR", 1, 0, false);
		declareFunction("java_backend_write_Xcunwind_protect", "JAVA-BACKEND-WRITE-%CUNWIND-PROTECT", 3, 0, false);
		declareFunction("java_backend_compute_finally_body", "JAVA-BACKEND-COMPUTE-FINALLY-BODY", 1, 0, false);
		declareFunction("java_backend_uninterruptible_method_p", "JAVA-BACKEND-UNINTERRUPTIBLE-METHOD-P", 1, 0, false);
		declareFunction("java_backend_write_cvs_id", "JAVA-BACKEND-WRITE-CVS-ID", 3, 0, false);
		declareFunction("java_backend_write_defconstant", "JAVA-BACKEND-WRITE-DEFCONSTANT", 2, 1, false);
		declareFunction("java_backend_write_global", "JAVA-BACKEND-WRITE-GLOBAL", 3, 0, false);
		declareFunction("java_backend_write_define", "JAVA-BACKEND-WRITE-DEFINE", 3, 0, false);
		declareFunction("translator_extract_function_documentation", "TRANSLATOR-EXTRACT-FUNCTION-DOCUMENTATION", 1, 0, false);
		declareFunction("java_backend_compute_function_body_statement", "JAVA-BACKEND-COMPUTE-FUNCTION-BODY-STATEMENT", 3, 0, false);
		declareFunction("java_backend_write_definer_comment", "JAVA-BACKEND-WRITE-DEFINER-COMMENT", 3, 0, false);
		declareFunction("java_backend_write_method_source_definition_annotation", "JAVA-BACKEND-WRITE-METHOD-SOURCE-DEFINITION-ANNOTATION", 3, 0, false);
		declareFunction("java_backend_write_global_source_definition_annotation", "JAVA-BACKEND-WRITE-GLOBAL-SOURCE-DEFINITION-ANNOTATION", 3, 0, false);
		declareFunction("java_backend_write_source_definition_annotation", "JAVA-BACKEND-WRITE-SOURCE-DEFINITION-ANNOTATION", 4, 0, false);
		declareFunction("java_backend_optional_argument_initializations", "JAVA-BACKEND-OPTIONAL-ARGUMENT-INITIALIZATIONS", 1, 0, false);
		declareFunction("java_backend_private_method_p", "JAVA-BACKEND-PRIVATE-METHOD-P", 1, 0, false);
		declareFunction("java_backend_write_function_declaration", "JAVA-BACKEND-WRITE-FUNCTION-DECLARATION", 3, 1, false);
		declareFunction("java_backend_write_static_member_type", "JAVA-BACKEND-WRITE-STATIC-MEMBER-TYPE", 1, 0, false);
		declareFunction("java_backend_write_final_member_type", "JAVA-BACKEND-WRITE-FINAL-MEMBER-TYPE", 1, 0, false);
		declareFunction("java_backend_write_object_data_type", "JAVA-BACKEND-WRITE-OBJECT-DATA-TYPE", 1, 0, false);
		declareFunction("java_backend_write_global_data_type", "JAVA-BACKEND-WRITE-GLOBAL-DATA-TYPE", 1, 0, false);
		declareFunction("java_backend_write_function_arglist", "JAVA-BACKEND-WRITE-FUNCTION-ARGLIST", 3, 0, false);
		declareFunction("java_backend_write_function_argument_separator", "JAVA-BACKEND-WRITE-FUNCTION-ARGUMENT-SEPARATOR", 1, 0, false);
		declareFunction("java_backend_write_function_arglist_arg", "JAVA-BACKEND-WRITE-FUNCTION-ARGLIST-ARG", 2, 0, false);
		declareFunction("java_backend_write_define_macroexpander", "JAVA-BACKEND-WRITE-DEFINE-MACROEXPANDER", 3, 0, false);
		declareFunction("java_backend_write_deflexical", "JAVA-BACKEND-WRITE-DEFLEXICAL", 3, 0, false);
		declareFunction("java_backend_write_defparameter", "JAVA-BACKEND-WRITE-DEFPARAMETER", 3, 0, false);
		declareFunction("java_backend_write_Xdefstruct_class", "JAVA-BACKEND-WRITE-%DEFSTRUCT-CLASS", 3, 0, false);
		declareFunction("java_backend_defstruct_class_name_internal", "JAVA-BACKEND-DEFSTRUCT-CLASS-NAME-INTERNAL", 1, 0, false);
		declareFunction("java_backend_defstruct_class_name", "JAVA-BACKEND-DEFSTRUCT-CLASS-NAME", 1, 0, false);
		declareFunction("java_backend_defstruct_slot_name_internal", "JAVA-BACKEND-DEFSTRUCT-SLOT-NAME-INTERNAL", 1, 0, false);
		declareFunction("java_backend_defstruct_slot_name", "JAVA-BACKEND-DEFSTRUCT-SLOT-NAME", 1, 0, false);
		declareFunction("java_backend_write_struct_decl_initializer", "JAVA-BACKEND-WRITE-STRUCT-DECL-INITIALIZER", 3, 0, false);
		declareFunction("java_backend_write_defstruct_construct", "JAVA-BACKEND-WRITE-DEFSTRUCT-CONSTRUCT", 3, 0, false);
		declareFunction("java_backend_write_defstruct_get_slot", "JAVA-BACKEND-WRITE-DEFSTRUCT-GET-SLOT", 3, 0, false);
		declareFunction("java_backend_write_defstruct_object_p", "JAVA-BACKEND-WRITE-DEFSTRUCT-OBJECT-P", 3, 0, false);
		declareFunction("java_backend_write_defstruct_set_slot", "JAVA-BACKEND-WRITE-DEFSTRUCT-SET-SLOT", 3, 0, false);
		declareFunction("java_backend_write_defvar", "JAVA-BACKEND-WRITE-DEFVAR", 3, 0, false);
		declareFunction("java_backend_write_fif", "JAVA-BACKEND-WRITE-FIF", 3, 0, false);
		declareFunction("java_backend_write_pcond", "JAVA-BACKEND-WRITE-PCOND", 3, 0, false);
		declareFunction("java_backend_write_Xproclaim", "JAVA-BACKEND-WRITE-%PROCLAIM", 3, 0, false);
		declareFunction("java_backend_write_progn", "JAVA-BACKEND-WRITE-PROGN", 3, 0, false);
		declareFunction("java_backend_write_Xlog_enter", "JAVA-BACKEND-WRITE-%LOG-ENTER", 3, 0, false);
		declareFunction("java_backend_write_ret", "JAVA-BACKEND-WRITE-RET", 3, 0, false);
		declareFunction("java_backend_write_while", "JAVA-BACKEND-WRITE-WHILE", 3, 0, false);
		declareFunction("java_backend_write_Xand", "JAVA-BACKEND-WRITE-%AND", 3, 0, false);
		declareFunction("java_backend_write_Xcdohash", "JAVA-BACKEND-WRITE-%CDOHASH", 3, 0, false);
		declareFunction("java_backend_write_Xenter", "JAVA-BACKEND-WRITE-%ENTER", 3, 0, false);
		declareFunction("java_backend_write_Xfor", "JAVA-BACKEND-WRITE-%FOR", 3, 0, false);
		declareFunction("java_backend_write_Xic", "JAVA-BACKEND-WRITE-%IC", 3, 0, false);
		declareFunction("canonicalize_string_to_variable_name", "CANONICALIZE-STRING-TO-VARIABLE-NAME", 1, 1, false);
		declareFunction("java_backend_write_internal_constant_reference", "JAVA-BACKEND-WRITE-INTERNAL-CONSTANT-REFERENCE", 3, 0, false);
		declareFunction("java_backend_write_Xinternal_constant", "JAVA-BACKEND-WRITE-%INTERNAL-CONSTANT", 3, 0, false);
		declareFunction("java_backend_Xinternal_constant_type", "JAVA-BACKEND-%INTERNAL-CONSTANT-TYPE", 1, 0, false);
		declareFunction("java_backend_possibly_create_initializer_method", "JAVA-BACKEND-POSSIBLY-CREATE-INITIALIZER-METHOD", 2, 0, false);
		declareFunction("java_backend_write_Xlf", "JAVA-BACKEND-WRITE-%LF", 3, 0, false);
		declareFunction("target_fixnum_p", "TARGET-FIXNUM-P", 1, 0, false);
		declareFunction("java_backend_symbol_load_form", "JAVA-BACKEND-SYMBOL-LOAD-FORM", 1, 0, false);
		declareFunction("java_backend_write_Xlocal", "JAVA-BACKEND-WRITE-%LOCAL", 3, 0, false);
		declareFunction("java_backend_write_multiple_value_list", "JAVA-BACKEND-WRITE-MULTIPLE-VALUE-LIST", 3, 0, false);
		declareFunction("java_backend_write_Xnc", "JAVA-BACKEND-WRITE-%NC", 3, 0, false);
		declareFunction("java_backend_write_Xnot", "JAVA-BACKEND-WRITE-%NOT", 3, 0, false);
		declareFunction("java_backend_possibly_optimize_Xnot", "JAVA-BACKEND-POSSIBLY-OPTIMIZE-%NOT", 1, 0, false);
		declareFunction("java_backend_write_nth_value", "JAVA-BACKEND-WRITE-NTH-VALUE", 3, 0, false);
		declareFunction("java_backend_write_Xor", "JAVA-BACKEND-WRITE-%OR", 3, 0, false);
		declareFunction("java_backend_write_Xregister_function", "JAVA-BACKEND-WRITE-%REGISTER-FUNCTION", 3, 0, false);
		declareFunction("java_backend_write_Xregister_global", "JAVA-BACKEND-WRITE-%REGISTER-GLOBAL", 3, 0, false);
		declareFunction("java_backend_write_global_definer", "JAVA-BACKEND-WRITE-GLOBAL-DEFINER", 2, 0, false);
		declareFunction("java_backend_write_Xregister_macro", "JAVA-BACKEND-WRITE-%REGISTER-MACRO", 3, 0, false);
		declareFunction("java_backend_current_thread_variable", "JAVA-BACKEND-CURRENT-THREAD-VARIABLE", 0, 0, false);
		declareFunction("java_backend_write_Xwith_current_thread", "JAVA-BACKEND-WRITE-%WITH-CURRENT-THREAD", 3, 0, false);
		declareFunction("java_backend_write_Xwith_error_handler", "JAVA-BACKEND-WRITE-%WITH-ERROR-HANDLER", 3, 0, false);
		declareFunction("java_backend_write_Xwith_process_resource_tracking", "JAVA-BACKEND-WRITE-%WITH-PROCESS-RESOURCE-TRACKING", 3, 0, false);
		declareFunction("java_backend_write_XE", "JAVA-BACKEND-WRITE-%=", 3, 0, false);
		declareFunction("java_backend_Xic_symbol_p", "JAVA-BACKEND-%IC-SYMBOL-P", 1, 0, false);
		declareFunction("java_backend_Xpc_symbol_p", "JAVA-BACKEND-%PC-SYMBOL-P", 1, 0, false);
		declareFunction("java_backend_Xlf_symbol_p", "JAVA-BACKEND-%LF-SYMBOL-P", 1, 0, false);
		declareFunction("java_backend_Xnc_object_p", "JAVA-BACKEND-%NC-OBJECT-P", 1, 0, false);
		declareFunction("java_backend_write_XEE", "JAVA-BACKEND-WRITE-%==", 3, 0, false);
		declareFunction("java_backend_write_Xnot_XEE", "JAVA-BACKEND-WRITE-%NOT-%==", 3, 0, false);
		declareFunction("java_backend_write_Xannotation", "JAVA-BACKEND-WRITE-%ANNOTATION", 3, 0, false);
		declareFunction("java_backend_write_Xassert", "JAVA-BACKEND-WRITE-%ASSERT", 3, 0, false);
		declareFunction("java_backend_write_Xbind", "JAVA-BACKEND-WRITE-%BIND", 3, 0, false);
		declareFunction("java_backend_write_Xcast", "JAVA-BACKEND-WRITE-%CAST", 3, 0, false);
		declareFunction("java_backend_write_Xcurrent_binding", "JAVA-BACKEND-WRITE-%CURRENT-BINDING", 3, 0, false);
		declareFunction("java_backend_write_Xfield", "JAVA-BACKEND-WRITE-%FIELD", 3, 0, false);
		declareFunction("java_backend_write_Xidentifier", "JAVA-BACKEND-WRITE-%IDENTIFIER", 3, 0, false);
		declareFunction("java_backend_write_Xinit_opt_arg", "JAVA-BACKEND-WRITE-%INIT-OPT-ARG", 3, 0, false);
		declareFunction("java_backend_write_Xinstanceof", "JAVA-BACKEND-WRITE-%INSTANCEOF", 3, 0, false);
		declareFunction("java_backend_write_Xdyn", "JAVA-BACKEND-WRITE-%DYN", 3, 0, false);
		declareFunction("java_backend_write_Xlex", "JAVA-BACKEND-WRITE-%LEX", 3, 0, false);
		declareFunction("java_backend_write_Xset_dyn", "JAVA-BACKEND-WRITE-%SET-DYN", 3, 0, false);
		declareFunction("java_backend_write_Xset_lex", "JAVA-BACKEND-WRITE-%SET-LEX", 3, 0, false);
		declareFunction("java_backend_write_Xmethod", "JAVA-BACKEND-WRITE-%METHOD", 3, 0, false);
		declareFunction("java_backend_write_Xmval", "JAVA-BACKEND-WRITE-%MVAL", 3, 0, false);
		declareFunction("java_backend_write_Xnew", "JAVA-BACKEND-WRITE-%NEW", 3, 0, false);
		declareFunction("java_backend_write_Xnew_array", "JAVA-BACKEND-WRITE-%NEW-ARRAY", 3, 0, false);
		declareFunction("java_backend_write_Xnote_supplied", "JAVA-BACKEND-WRITE-%NOTE-SUPPLIED", 3, 0, false);
		declareFunction("java_backend_write_Xrebind", "JAVA-BACKEND-WRITE-%REBIND", 3, 0, false);
		declareFunction("java_backend_write_Xreset_mval", "JAVA-BACKEND-WRITE-%RESET-MVAL", 3, 0, false);
		declareFunction("java_backend_write_Xthrow", "JAVA-BACKEND-WRITE-%THROW", 3, 0, false);
		declareFunction("java_backend_write_Xtry", "JAVA-BACKEND-WRITE-%TRY", 3, 0, false);
		declareFunction("java_backend_write_catch_clause", "JAVA-BACKEND-WRITE-CATCH-CLAUSE", 3, 0, false);
		declareMacro("Xtry", "%TRY");
		declareFunction("java_backend_likely_unary_funcall_function_p", "JAVA-BACKEND-LIKELY-UNARY-FUNCALL-FUNCTION-P", 1, 0, false);
		declareFunction("java_backend_write_unary_function_class", "JAVA-BACKEND-WRITE-UNARY-FUNCTION-CLASS", 2, 0, false);
		declareFunction("java_backend_write_unary_function_class_initializer", "JAVA-BACKEND-WRITE-UNARY-FUNCTION-CLASS-INITIALIZER", 2, 0, false);
		declareFunction("java_backend_unary_function_class_name_internal", "JAVA-BACKEND-UNARY-FUNCTION-CLASS-NAME-INTERNAL", 1, 0, false);
		declareFunction("java_backend_unary_function_class_name", "JAVA-BACKEND-UNARY-FUNCTION-CLASS-NAME", 1, 0, false);
		declareFunction("java_backend_method_formal_parameter_name", "JAVA-BACKEND-METHOD-FORMAL-PARAMETER-NAME", 1, 0, false);
		declareFunction("java_backend_unary_function_invocation_string", "JAVA-BACKEND-UNARY-FUNCTION-INVOCATION-STRING", 1, 0, false);
		declareFunction("java_backend_likely_binary_funcall_function_p", "JAVA-BACKEND-LIKELY-BINARY-FUNCALL-FUNCTION-P", 1, 0, false);
		declareFunction("java_backend_write_binary_function_class", "JAVA-BACKEND-WRITE-BINARY-FUNCTION-CLASS", 2, 0, false);
		declareFunction("java_backend_write_binary_function_class_initializer", "JAVA-BACKEND-WRITE-BINARY-FUNCTION-CLASS-INITIALIZER", 2, 0, false);
		declareFunction("java_backend_binary_function_class_name_internal", "JAVA-BACKEND-BINARY-FUNCTION-CLASS-NAME-INTERNAL", 1, 0, false);
		declareFunction("java_backend_binary_function_class_name", "JAVA-BACKEND-BINARY-FUNCTION-CLASS-NAME", 1, 0, false);
		declareFunction("java_backend_binary_function_invocation_string", "JAVA-BACKEND-BINARY-FUNCTION-INVOCATION-STRING", 1, 0, false);
		declareFunction("java_backend_likely_zero_arity_funcall_function_p", "JAVA-BACKEND-LIKELY-ZERO-ARITY-FUNCALL-FUNCTION-P", 1, 0, false);
		declareFunction("java_backend_write_zero_arity_function_class", "JAVA-BACKEND-WRITE-ZERO-ARITY-FUNCTION-CLASS", 2, 0, false);
		declareFunction("java_backend_write_zero_arity_function_class_initializer", "JAVA-BACKEND-WRITE-ZERO-ARITY-FUNCTION-CLASS-INITIALIZER", 2, 0, false);
		declareFunction("java_backend_zero_arity_function_class_name_internal", "JAVA-BACKEND-ZERO-ARITY-FUNCTION-CLASS-NAME-INTERNAL", 1, 0, false);
		declareFunction("java_backend_zero_arity_function_class_name", "JAVA-BACKEND-ZERO-ARITY-FUNCTION-CLASS-NAME", 1, 0, false);
		declareFunction("java_backend_zero_arity_function_invocation_string", "JAVA-BACKEND-ZERO-ARITY-FUNCTION-INVOCATION-STRING", 1, 0, false);
		declareFunction("java_backend_optimize_function_call_form", "JAVA-BACKEND-OPTIMIZE-FUNCTION-CALL-FORM", 1, 0, false);
		declareFunction("java_backend_output_system_level_files", "JAVA-BACKEND-OUTPUT-SYSTEM-LEVEL-FILES", 1, 1, false);
		declareFunction("generate_java_classname_include_file_entry", "GENERATE-JAVA-CLASSNAME-INCLUDE-FILE-ENTRY", 2, 0, false);
		declareFunction("java_backend_write_system_init_file_preamble", "JAVA-BACKEND-WRITE-SYSTEM-INIT-FILE-PREAMBLE", 1, 0, false);
		declareFunction("java_backend_write_system_init_file_postamble", "JAVA-BACKEND-WRITE-SYSTEM-INIT-FILE-POSTAMBLE", 1, 0, false);
		declareMacro("fprog2", "FPROG2");
		declareFunction("java_backend_write_patcher_for_classes", "JAVA-BACKEND-WRITE-PATCHER-FOR-CLASSES", 1, 1, false);
		declareFunction("java_backend_write_patcher_for_modules", "JAVA-BACKEND-WRITE-PATCHER-FOR-MODULES", 1, 1, false);
		declareFunction("java_backend_note_function_call_rest_arity", "JAVA-BACKEND-NOTE-FUNCTION-CALL-REST-ARITY", 2, 0, false);
		declareFunction("java_backend_function_call_rest_arity_stats", "JAVA-BACKEND-FUNCTION-CALL-REST-ARITY-STATS", 0, 0, false);
		return NIL;
	}

	public static final SubLList $list_alt56 = list(list(makeSymbol("*JAVA-BACKEND-INITIALIZER-METHODS*"), NIL));

	public static final SubLString $str_alt58$_____Definitions = makeString("//// Definitions");

	public static final SubLString $str_alt59$_____Internal_Constants = makeString("//// Internal Constants");

	public static final SubLString $str_alt60$_____Internal_Constant_Initialize = makeString("//// Internal Constant Initializer Methods");

	public static final SubLSymbol $sym62$_INTERNAL_CONSTANT = makeSymbol("%INTERNAL-CONSTANT");

	public static final SubLList $list_alt63 = list(makeSymbol("OPERATOR"), makeSymbol("ARGLIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

	public static final SubLString $str_alt65$_____Initializers = makeString("//// Initializers");

	public static final SubLString $str_alt66$public_void_declareFunctions____ = makeString("public void declareFunctions() {");

	public static final SubLString $str_alt67$public_void_initializeVariables__ = makeString("public void initializeVariables() {");

	public static final SubLString $str_alt68$public_void_runTopLevelForms____ = makeString("public void runTopLevelForms() {");

	public static final SubLString $str_alt69$_ = makeString(";");

	public static final SubLString $str_alt70$__ = makeString("  ");

	public static final SubLString $str_alt71$Unexpected_C_backend_atom____S = makeString("Unexpected C backend atom : ~S");

	public static final SubLList $list_alt72 = list(makeSymbol("OPERATOR"), makeSymbol("CONSTANT"));

	public static final SubLSymbol $sym73$_PC = makeSymbol("%PC");

	public static final SubLString $str_alt74$Time_to_implement_a_C_backend_tra = makeString("Time to implement a C backend translation for predefined constant ~S");

	public static final SubLString $str_alt80$unexpected_variable_binding_type_ = makeString("unexpected variable binding type ~S for ~S");

	public static final SubLList $list_alt81 = list(list(makeSymbol("*JAVA-BACKEND-PREVIOUS-LOCAL-VARIABLE-SCOPE*"), makeSymbol("*JAVA-BACKEND-CURRENT-LOCAL-VARIABLE-SCOPE*")), list(makeSymbol("*JAVA-BACKEND-CURRENT-LOCAL-VARIABLE-SCOPE*"), makeSymbol("*JAVA-BACKEND-CURRENT-LOCAL-VARIABLE-SCOPE*")));

	public static final SubLString $str_alt83$v_ = makeString("v_");

	public static final SubLString $str_alt84$_ = makeString("_");

	public static final SubLList $list_alt85 = cons(makeSymbol("CURRENT-LOCAL-FROM-SCOPE"), makeSymbol("ITS-NAME"));

	public static final SubLList $list_alt88 = list(makeSymbol("OPERATOR"), makeSymbol("&REST"), makeSymbol("ARGS"));

	public static final SubLString $str_alt90$translating__S_call_as_funcall = makeString("translating ~S call as funcall");

	public static final SubLSymbol $sym92$_LF = makeSymbol("%LF");

	public static final SubLString $str_alt93$_ = makeString("(");

	public static final SubLList $list_alt94 = cons(makeSymbol("ARG"), makeSymbol("REST-ARGS"));

	public static final SubLString $str_alt95$_ = makeString(")");

	public static final SubLList $list_alt97 = list(makeSymbol("%NC"), makeSymbol("%EMPTY-ARRAY"));

	public static final SubLString $str_alt98$new_ = makeString("new ");

	public static final SubLString $str_alt99$___ = makeString("[] ");

	public static final SubLString $str_alt100$_CSETF_ = makeString("_CSETF-");

	public static final SubLList $list_alt101 = list(makeSymbol("OBJECT"), makeSymbol("VALUE"));

	public static final SubLString $str_alt104$unable_to_introspect_on__S = makeString("unable to introspect on ~S");

	public static final SubLString $str_alt105$Unexpected_function__S = makeString("Unexpected function ~S");

	public static final SubLList $list_alt107 = list(new SubLObject[] { cons(makeSymbol("%AND"), makeSymbol("JAVA-BACKEND-WRITE-%AND")), cons(makeSymbol("%CCATCH"), makeSymbol("JAVA-BACKEND-WRITE-%CCATCH")), cons(makeSymbol("%CDO-SYMBOLS"), makeSymbol("JAVA-BACKEND-WRITE-%CDO-SYMBOLS")), cons(makeSymbol("%CDOHASH"), makeSymbol("JAVA-BACKEND-WRITE-%CDOHASH")),
			cons(makeSymbol("CLET-BIND"), makeSymbol("JAVA-BACKEND-WRITE-CLET-BIND")), cons(makeSymbol("CLET-LOCAL"), makeSymbol("JAVA-BACKEND-WRITE-CLET-LOCAL")), cons(makeSymbol("CODE-COMMENT"), makeSymbol("JAVA-BACKEND-WRITE-CODE-COMMENT")), cons(makeSymbol("%CPROGV"), makeSymbol("JAVA-BACKEND-WRITE-%CPROGV")), cons(makeSymbol("CSETQ"), makeSymbol("JAVA-BACKEND-WRITE-CSETQ")),
			cons(makeSymbol("CSETQ-DYNAMIC"), makeSymbol("JAVA-BACKEND-WRITE-CSETQ-DYNAMIC")), cons(makeSymbol("CSETQ-LEXICAL"), makeSymbol("JAVA-BACKEND-WRITE-CSETQ-LEXICAL")), cons(makeSymbol("CSETQ-LOCAL"), makeSymbol("JAVA-BACKEND-WRITE-CSETQ-LOCAL")), cons(makeSymbol("%CUNWIND-PROTECT"), makeSymbol("JAVA-BACKEND-WRITE-%CUNWIND-PROTECT")), cons(makeSymbol("CVS-ID"), makeSymbol("JAVA-BACKEND-WRITE-CVS-ID")),
			cons(makeSymbol("DEFCONSTANT"), makeSymbol("JAVA-BACKEND-WRITE-DEFCONSTANT")), cons(makeSymbol("DEFINE"), makeSymbol("JAVA-BACKEND-WRITE-DEFINE")), cons(makeSymbol("DEFINE-MACROEXPANDER"), makeSymbol("JAVA-BACKEND-WRITE-DEFINE-MACROEXPANDER")), cons(makeSymbol("DEFLEXICAL"), makeSymbol("JAVA-BACKEND-WRITE-DEFLEXICAL")), cons(makeSymbol("DEFPARAMETER"), makeSymbol("JAVA-BACKEND-WRITE-DEFPARAMETER")),
			cons(makeSymbol("%DEFSTRUCT-CLASS"), makeSymbol("JAVA-BACKEND-WRITE-%DEFSTRUCT-CLASS")), cons(makeSymbol("_DEFSTRUCT-CONSTRUCT", "SUBLISP"), makeSymbol("JAVA-BACKEND-WRITE-DEFSTRUCT-CONSTRUCT")), cons(makeSymbol("_DEFSTRUCT-GET-SLOT", "SUBLISP"), makeSymbol("JAVA-BACKEND-WRITE-DEFSTRUCT-GET-SLOT")), cons(makeSymbol("_DEFSTRUCT-OBJECT-P", "SUBLISP"), makeSymbol("JAVA-BACKEND-WRITE-DEFSTRUCT-OBJECT-P")),
			cons(makeSymbol("_DEFSTRUCT-SET-SLOT", "SUBLISP"), makeSymbol("JAVA-BACKEND-WRITE-DEFSTRUCT-SET-SLOT")), cons(makeSymbol("DEFVAR"), makeSymbol("JAVA-BACKEND-WRITE-DEFVAR")), cons(makeSymbol("%DP-CHECK-TYPE"), makeSymbol("JAVA-BACKEND-WRITE-%DP-CHECK-TYPE")), cons(makeSymbol("%DP-ENFORCE-TYPE"), makeSymbol("JAVA-BACKEND-WRITE-%DP-ENFORCE-TYPE")),
			cons(makeSymbol("%ENTER"), makeSymbol("JAVA-BACKEND-WRITE-%ENTER")), cons(makeSymbol("FIF"), makeSymbol("JAVA-BACKEND-WRITE-FIF")), cons(makeSymbol("%FOR"), makeSymbol("JAVA-BACKEND-WRITE-%FOR")), cons(makeSymbol("%IC"), makeSymbol("JAVA-BACKEND-WRITE-%IC")), cons(makeSymbol("%INTERNAL-CONSTANT"), makeSymbol("JAVA-BACKEND-WRITE-%INTERNAL-CONSTANT")),
			cons(makeSymbol("%LF"), makeSymbol("JAVA-BACKEND-WRITE-%LF")), cons(makeSymbol("%LOCAL"), makeSymbol("JAVA-BACKEND-WRITE-%LOCAL")), cons(makeSymbol("MULTIPLE-VALUE-LIST"), makeSymbol("JAVA-BACKEND-WRITE-MULTIPLE-VALUE-LIST")), cons(makeSymbol("%NC"), makeSymbol("JAVA-BACKEND-WRITE-%NC")), cons(makeSymbol("%NOT"), makeSymbol("JAVA-BACKEND-WRITE-%NOT")),
			cons(makeSymbol("NTH-VALUE"), makeSymbol("JAVA-BACKEND-WRITE-NTH-VALUE")), cons(makeSymbol("%OR"), makeSymbol("JAVA-BACKEND-WRITE-%OR")), cons(makeSymbol("%PC"), makeSymbol("JAVA-BACKEND-WRITE-%PC")), cons(makeSymbol("PCOND"), makeSymbol("JAVA-BACKEND-WRITE-PCOND")), cons(makeSymbol("PROGN"), makeSymbol("JAVA-BACKEND-WRITE-PROGN")),
			cons(makeSymbol("%REGISTER-FUNCTION"), makeSymbol("JAVA-BACKEND-WRITE-%REGISTER-FUNCTION")), cons(makeSymbol("%REGISTER-GLOBAL"), makeSymbol("JAVA-BACKEND-WRITE-%REGISTER-GLOBAL")), cons(makeSymbol("%REGISTER-MACRO"), makeSymbol("JAVA-BACKEND-WRITE-%REGISTER-MACRO")), cons(RET, makeSymbol("JAVA-BACKEND-WRITE-RET")), cons(makeSymbol("WHILE"), makeSymbol("JAVA-BACKEND-WRITE-WHILE")),
			cons(makeSymbol("%WITH-CURRENT-THREAD"), makeSymbol("JAVA-BACKEND-WRITE-%WITH-CURRENT-THREAD")), cons(makeSymbol("%WITH-ERROR-HANDLER"), makeSymbol("JAVA-BACKEND-WRITE-%WITH-ERROR-HANDLER")), cons(makeSymbol("%WITH-PROCESS-RESOURCE-TRACKING"), makeSymbol("JAVA-BACKEND-WRITE-%WITH-PROCESS-RESOURCE-TRACKING")), cons(makeSymbol("%="), makeSymbol("JAVA-BACKEND-WRITE-%=")),
			cons(makeSymbol("%=="), makeSymbol("JAVA-BACKEND-WRITE-%==")), cons(makeSymbol("%NOT-%=="), makeSymbol("JAVA-BACKEND-WRITE-%NOT-%==")), cons(makeSymbol("%ANNOTATION"), makeSymbol("JAVA-BACKEND-WRITE-%ANNOTATION")), cons(makeSymbol("%BIND"), makeSymbol("JAVA-BACKEND-WRITE-%BIND")), cons(makeSymbol("%CAST"), makeSymbol("JAVA-BACKEND-WRITE-%CAST")),
			cons(makeSymbol("%CURRENT-BINDING"), makeSymbol("JAVA-BACKEND-WRITE-%CURRENT-BINDING")), cons(makeSymbol("%FIELD"), makeSymbol("JAVA-BACKEND-WRITE-%FIELD")), cons(makeSymbol("%IDENTIFIER"), makeSymbol("JAVA-BACKEND-WRITE-%IDENTIFIER")), cons(makeSymbol("%INIT-OPT-ARG"), makeSymbol("JAVA-BACKEND-WRITE-%INIT-OPT-ARG")), cons(makeSymbol("%INSTANCEOF"), makeSymbol("JAVA-BACKEND-WRITE-%INSTANCEOF")),
			cons(makeSymbol("%DYN"), makeSymbol("JAVA-BACKEND-WRITE-%DYN")), cons(makeSymbol("%LEX"), makeSymbol("JAVA-BACKEND-WRITE-%LEX")), cons(makeSymbol("%SET-DYN"), makeSymbol("JAVA-BACKEND-WRITE-%SET-DYN")), cons(makeSymbol("%SET-LEX"), makeSymbol("JAVA-BACKEND-WRITE-%SET-LEX")), cons(makeSymbol("%METHOD"), makeSymbol("JAVA-BACKEND-WRITE-%METHOD")),
			cons(makeSymbol("%MVAL"), makeSymbol("JAVA-BACKEND-WRITE-%MVAL")), cons(makeSymbol("%NEW"), makeSymbol("JAVA-BACKEND-WRITE-%NEW")), cons(makeSymbol("%NEW-ARRAY"), makeSymbol("JAVA-BACKEND-WRITE-%NEW-ARRAY")), cons(makeSymbol("%NOTE-SUPPLIED"), makeSymbol("JAVA-BACKEND-WRITE-%NOTE-SUPPLIED")), cons(makeSymbol("%REBIND"), makeSymbol("JAVA-BACKEND-WRITE-%REBIND")),
			cons(makeSymbol("%RESET-MVAL"), makeSymbol("JAVA-BACKEND-WRITE-%RESET-MVAL")), cons(makeSymbol("%THROW"), makeSymbol("JAVA-BACKEND-WRITE-%THROW")), cons(makeSymbol("%TRY"), makeSymbol("JAVA-BACKEND-WRITE-%TRY")) });

	public static final SubLString $str_alt108$Time_to_implement_the_writer_for_ = makeString("Time to implement the writer for ~S");

	public static final SubLSymbol $sym109$_DP_CHECK_TYPE = makeSymbol("%DP-CHECK-TYPE");

	public static final SubLList $list_alt110 = list(makeSymbol("OPERATOR"), makeSymbol("OBJECT"), makeSymbol("PRED"));

	public static final SubLSymbol $sym112$_IC = makeSymbol("%IC");

	public static final SubLSymbol $sym113$_CAST = makeSymbol("%CAST");

	public static final SubLSymbol $sym116$_DP_ENFORCE_TYPE = makeSymbol("%DP-ENFORCE-TYPE");

	public static final SubLString $str_alt118$unexpected_checker____S = makeString("unexpected checker : ~S");

	public static final SubLSymbol $sym119$_METHOD = makeSymbol("%METHOD");

	public static final SubLList $list_alt120 = list(makeSymbol("OPERATOR"), list(makeSymbol("TAG"), makeSymbol("ANS-VAR"), makeSymbol("ENV-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

	public static final SubLSymbol $sym121$_CCATCH = makeSymbol("%CCATCH");

	public static final SubLSymbol $sym122$_TRY = makeSymbol("%TRY");

	public static final SubLSymbol $sym126$_HANDLE_THROWABLE = makeSymbol("%HANDLE-THROWABLE");

	public static final SubLList $list_alt127 = list(makeSymbol("OPERATOR"), list(makeSymbol("SYM"), makeSymbol("PACKAGE-VAR"), makeSymbol("ITERATOR-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

	public static final SubLSymbol $sym128$_CDO_SYMBOLS = makeSymbol("%CDO-SYMBOLS");

	public static final SubLSymbol $sym129$_LOCAL = makeSymbol("%LOCAL");

	public static final SubLSymbol $sym130$_CDO_SYMBOLS_MAKE_ITERATOR = makeSymbol("%CDO-SYMBOLS-MAKE-ITERATOR");

	public static final SubLList $list_alt131 = list(makeString("Iterator"), makeKeyword("FINAL"));

	public static final SubLSymbol $sym133$_CDO_SYMBOLS_ITERATOR_HAS_NEXT = makeSymbol("%CDO-SYMBOLS-ITERATOR-HAS-NEXT");

	public static final SubLSymbol $sym134$_CDO_SYMBOLS_ITERATOR_NEXT_VALUE = makeSymbol("%CDO-SYMBOLS-ITERATOR-NEXT-VALUE");

	public static final SubLList $list_alt135 = list(makeSymbol("OPERATOR"), makeSymbol("BINDINGS"), makeSymbol("&BODY"), makeSymbol("BODY"));

	public static final SubLList $list_alt137 = list(makeSymbol("VARIABLE"), makeSymbol("INITIALIZATION"));

	public static final SubLSymbol $sym138$_CURRENT_BINDING = makeSymbol("%CURRENT-BINDING");

	public static final SubLSymbol $sym139$_BIND = makeSymbol("%BIND");

	public static final SubLSymbol $sym140$_REBIND = makeSymbol("%REBIND");

	public static final SubLString $str_alt143$_PREV_BIND_ = makeString("_PREV_BIND_");

	public static final SubLList $list_alt145 = list(makeSymbol("OPERATOR"), list(makeSymbol("DYNAMIC-VARS"), makeSymbol("BINDINGS"), makeSymbol("INTERNAL-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

	public static final SubLSymbol $sym146$_CPROGV = makeSymbol("%CPROGV");

	public static final SubLSymbol $sym147$OLD_VALUES = makeUninternedSymbol("OLD-VALUES");

	public static final SubLSymbol $sym148$_EXTRACT_DYNAMIC_VALUES = makeSymbol("%EXTRACT-DYNAMIC-VALUES");

	public static final SubLList $list_alt149 = list(makeString("ArrayList"), makeKeyword("FINAL"));

	public static final SubLSymbol $sym150$_BIND_DYNAMIC_VARS = makeSymbol("%BIND-DYNAMIC-VARS");

	public static final SubLSymbol $sym151$_REBIND_DYNAMIC_VARS = makeSymbol("%REBIND-DYNAMIC-VARS");

	public static final SubLList $list_alt152 = list(makeSymbol("OPERATOR"), makeSymbol("VARIABLE"), makeSymbol("VALUE"));

	public static final SubLString $str_alt156$The_constant_variable__S_cannot_b = makeString("The constant variable ~S cannot be set");

	public static final SubLString $str_alt157$Unexpected_variable__S = makeString("Unexpected variable ~S");

	public static final SubLSymbol $sym158$_SET_DYN = makeSymbol("%SET-DYN");

	public static final SubLSymbol $sym159$_SET_LEX = makeSymbol("%SET-LEX");

	public static final SubLList $list_alt160 = list(makeSymbol("OPERATOR"), makeSymbol("ENV-VAR"), makeSymbol("PROTECTED-FORM"), makeSymbol("&BODY"), makeSymbol("BODY"));

	public static final SubLSymbol $sym161$_CUNWIND_PROTECT = makeSymbol("%CUNWIND-PROTECT");

	public static final SubLList $list_alt162 = list(list(makeSymbol("PCOND"), list(list(makeSymbol("%DTB"), makeKeyword("ANYTHING")), list(list($TEST, makeSymbol("JAVA-BACKEND-UNINTERRUPTIBLE-METHOD-P")), makeKeyword("ANYTHING"))), list(list(makeSymbol("%NC"), makeSymbol("%TRUE")))));

	public static final SubLList $list_alt163 = list(list(makeSymbol("*IS-THREAD-PERFORMING-CLEANUP?*", "SUBLISP"), list(makeSymbol("%PC"), T)));

	public static final SubLList $list_alt164 = list(makeSymbol("RELEASE-LOCK", "SUBLISP"), makeSymbol("RW-LOCK-RELEASE-READ-LOCK"), makeSymbol("RW-LOCK-RELEASE-WRITE-LOCK"));

	public static final SubLList $list_alt165 = list(makeSymbol("OPERATOR"), makeSymbol("ID-STRING"));

	public static final SubLString $str_alt167$___CVS_ID_ = makeString("// CVS_ID(");

	public static final SubLList $list_alt169 = list(makeSymbol("OPERATOR"), makeSymbol("VARIABLE"), makeSymbol("INITIALIZATION"), makeSymbol("&OPTIONAL"), makeSymbol("DOCUMENTATION"));

	public static final SubLString $str_alt170$private_ = makeString("private ");

	public static final SubLString $str_alt171$public_ = makeString("public ");

	public static final SubLString $str_alt172$_ = makeString(" ");

	public static final SubLList $list_alt173 = list(makeSymbol("%NC"), makeSymbol("%NULL"));

	public static final SubLList $list_alt174 = list(makeSymbol("OPERATOR"), makeSymbol("NAME"), makeSymbol("ARGLIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

	public static final SubLString $str_alt175$_S_was_not_a_top_level_define = makeString("~S was not a top-level define");

	public static final SubLString $str_alt177$Skip_function__S = makeString("Skip function ~S");

	public static final SubLList $list_alt178 = list(makeSymbol("DOCUMENTATION"), makeSymbol("&BODY"), makeSymbol("REAL-BODY"));

	public static final SubLString $str_alt179$Method__S_does_not_return = makeString("Method ~S does not return");

	public static final SubLString $str_alt180$____ = makeString("/** ");

	public static final SubLSymbol $sym181$_ANNOTATION = makeSymbol("%ANNOTATION");

	public static final SubLString $str_alt185$static_ = makeString("static ");

	public static final SubLString $str_alt186$final_ = makeString("final ");

	public static final SubLString $str_alt188$__ = makeString("()");

	public static final SubLSymbol $sym189$_OPTIONAL = makeSymbol("&OPTIONAL");

	public static final SubLList $list_alt193 = list(makeSymbol("OPERATOR"), makeSymbol("&REST"), makeSymbol("ANALYSIS"));

	public static final SubLSymbol $sym194$_DEFSTRUCT_CLASS = makeSymbol("%DEFSTRUCT-CLASS");

	public static final SubLString $str_alt197$public_static_final_class__A_exte = makeString("public static final class ~A extends SubLStructNative {~%");

	public static final SubLString $str_alt198$public_SubLStructDecl_getStructDe = makeString("public SubLStructDecl getStructDecl() { return structDecl; }~%");

	public static final SubLString $str_alt199$public_SubLObject_getField_A_____ = makeString("public SubLObject getField~A() { return ~A; }~%");

	public static final SubLString $str_alt200$public_SubLObject_setField_A_SubL = makeString("public SubLObject setField~A(SubLObject value) { return ~A = value; }~%");

	public static final SubLString $str_alt201$public_SubLObject__A___NIL___ = makeString("public SubLObject ~A = NIL;~%");

	public static final SubLString $str_alt202$private_static_final_SubLStructDe = makeString("private static final SubLStructDeclNative structDecl =~%");

	public static final SubLString $str_alt203$___ = makeString(";~%");

	public static final SubLString $str_alt205$_ = makeString("$");

	public static final SubLString $str_alt206$_native = makeString("_native");

	public static final SubLSymbol $sym214$_FIELD = makeSymbol("%FIELD");

	public static final SubLSymbol $sym215$_IDENTIFIER = makeSymbol("%IDENTIFIER");

	public static final SubLList $list_alt216 = list(makeString("class"));

	public static final SubLSymbol $sym217$_NEW_ARRAY = makeSymbol("%NEW-ARRAY");

	public static final SubLSymbol $sym219$_MAKE_STRUCT_DECL_NATIVE = makeSymbol("%MAKE-STRUCT-DECL-NATIVE");

	public static final SubLList $list_alt220 = list(makeSymbol("OPERATOR"), makeSymbol("C-STRUCTURE-TAG"), makeSymbol("SIZE"), makeSymbol("TYPE-VAR"), makeSymbol("TYPE"));

	public static final SubLSymbol $sym222$_NEW = makeSymbol("%NEW");

	public static final SubLList $list_alt223 = list(makeSymbol("OPERATOR"), makeSymbol("OBJECT"), makeSymbol("INDEX"), makeSymbol("TYPE"), makeSymbol("SLOT"));

	public static final SubLList $list_alt227 = list(makeSymbol("OPERATOR"), makeSymbol("OBJECT"), makeSymbol("C-STRUCTURE-TAG"), makeSymbol("TYPE-VAR"), makeSymbol("TYPE"));

	public static final SubLSymbol $sym230$___ = makeSymbol("%==");

	public static final SubLList $list_alt231 = list(makeString("getClass"));

	public static final SubLList $list_alt232 = list(list(makeSymbol("%PC"), T), list(makeSymbol("%PC"), NIL));

	public static final SubLList $list_alt233 = list(makeSymbol("OPERATOR"), makeSymbol("OBJECT"), makeSymbol("INDEX"), makeSymbol("VALUE"), makeSymbol("TYPE"), makeSymbol("SLOT"));

	public static final SubLSymbol $sym236$__ = makeSymbol("%=");

	public static final SubLList $list_alt238 = list(makeSymbol("OPERATOR"), makeSymbol("CONDITION"), makeSymbol("TRUE-VALUE"), makeSymbol("FALSE-VALUE"));

	public static final SubLString $str_alt239$___ = makeString(" ? ");

	public static final SubLString $str_alt240$___ = makeString(" : ");

	public static final SubLList $list_alt241 = list(makeSymbol("OPERATOR"), makeSymbol("&REST"), makeSymbol("PCOND-CLAUSES"));

	public static final SubLList $list_alt243 = list(makeSymbol("PROGN"));

	public static final SubLList $list_alt244 = list(makeSymbol("FIRST-CLAUSE"), makeSymbol("&REST"), makeSymbol("REST-CLAUSES"));

	public static final SubLList $list_alt245 = list(makeSymbol("TEST"), makeSymbol("&BODY"), makeSymbol("ACTIONS"));

	public static final SubLString $str_alt246$if__ = makeString("if (");

	public static final SubLString $str_alt247$__ = makeString(") ");

	public static final SubLList $list_alt248 = list(makeSymbol("%NC"), makeSymbol("%TRUE"));

	public static final SubLString $str_alt249$_else_ = makeString(" else ");

	public static final SubLString $str_alt250$_else_if__ = makeString(" else if (");

	public static final SubLList $list_alt251 = list(makeSymbol("OPERATOR"), makeSymbol("&BODY"), makeSymbol("BODY"));

	public static final SubLList $list_alt252 = list(makeSymbol("OPERATOR"), makeSymbol("RESULT"));

	public static final SubLString $str_alt254$return_ = makeString("return ");

	public static final SubLList $list_alt255 = list(makeSymbol("OPERATOR"), makeSymbol("TEST"), makeSymbol("&BODY"), makeSymbol("BODY"));

	public static final SubLString $str_alt256$while__ = makeString("while (");

	public static final SubLList $list_alt257 = list(makeSymbol("OPERATOR"), makeSymbol("&REST"), makeSymbol("EXPRESSIONS"));

	public static final SubLSymbol $sym258$_AND = makeSymbol("%AND");

	public static final SubLString $str_alt259$____ = makeString(" && ");

	public static final SubLList $list_alt260 = list(makeSymbol("OPERATOR"), list(makeSymbol("KEY"), makeSymbol("VAL"), makeSymbol("TABLE-VAR"), makeSymbol("ITERATOR-VAR"), makeSymbol("ENTRY-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

	public static final SubLSymbol $sym261$_CDOHASH = makeSymbol("%CDOHASH");

	public static final SubLSymbol $sym262$_CDOHASH_GET_ENTRY_SET_ITERATOR = makeSymbol("%CDOHASH-GET-ENTRY-SET-ITERATOR");

	public static final SubLSymbol $sym263$_CDOHASH_ITERATOR_HAS_NEXT = makeSymbol("%CDOHASH-ITERATOR-HAS-NEXT");

	public static final SubLSymbol $sym264$_CDOHASH_ITERATOR_NEXT_ENTRY = makeSymbol("%CDOHASH-ITERATOR-NEXT-ENTRY");

	public static final SubLList $list_alt265 = list(makeString("Entry"), makeKeyword("FINAL"));

	public static final SubLSymbol $sym266$_CDOHASH_GET_ENTRY_KEY = makeSymbol("%CDOHASH-GET-ENTRY-KEY");

	public static final SubLSymbol $sym267$_CDOHASH_GET_ENTRY_VALUE = makeSymbol("%CDOHASH-GET-ENTRY-VALUE");

	public static final SubLSymbol $sym268$_CDOHASH_RELEASE_ENTRY_SET_ITERATOR = makeSymbol("%CDOHASH-RELEASE-ENTRY-SET-ITERATOR");

	public static final SubLList $list_alt269 = list(makeSymbol("OPERATOR"));

	public static final SubLSymbol $sym270$_ENTER = makeSymbol("%ENTER");

	public static final SubLString $str_alt271$___ENTER__ = makeString("// ENTER()");

	public static final SubLList $list_alt272 = list(makeSymbol("OPERATOR"), list(makeSymbol("INITIALIZATIONS"), makeSymbol("TEST"), makeSymbol("UPDATES")), makeSymbol("&BODY"), makeSymbol("BODY"));

	public static final SubLObject init_java_backend_file_alt() {
		defparameter("*JAVA-BACKEND-CURRENT-LOCAL-VARIABLE-SCOPE*", NIL);
		defparameter("*JAVA-BACKEND-PREVIOUS-LOCAL-VARIABLE-SCOPE*", NIL);
		defparameter("*JAVA-BACKEND-CURRENT-CLASS*", NIL);
		defparameter("*JAVA-BACKEND-INITIALIZER-METHODS*", NIL);
		deflexical("*JAVA-BACKEND-WRITERS*", $list_alt107);
		deflexical("*JAVA-BACKEND-CLET-BIND-LOCAL-VARIABLE-CACHING-STATE*", NIL);
		deflexical("*JAVA-BACKEND-UNINTERRUPTIBLE-METHODS*", $list_alt164);
		defvar("*JAVA-BACKEND-FUNCALL-OPTIMIZATION-ENABLED?*", T);
		deflexical("*JAVA-BACKEND-OBJECT-DATA-TYPE*", $$$SubLObject);
		deflexical("*JAVA-BACKEND-INITIALIZER-SIZE-THRESHOLD*", $int$1000);
		defparameter("*JAVA-BACKEND-CURRENT-THREAD-VARIABLE*", NIL);
		deflexical("*JAVA-BACKEND-UNARY-FUNCTION-CLASS-TEMPLATE*", $str_alt445$___public_static_final_class__A_e);
		deflexical("*JAVA-BACKEND-UNARY-FUNCTION-CLASS-INITIALIZER-TEMPLATE*", $str_alt448$__new__A__);
		deflexical("*JAVA-BACKEND-BINARY-FUNCTION-CLASS-TEMPLATE*", $str_alt452$___public_static_final_class__A_e);
		deflexical("*JAVA-BACKEND-BINARY-FUNCTION-CLASS-INITIALIZER-TEMPLATE*", $str_alt448$__new__A__);
		deflexical("*JAVA-BACKEND-ZERO-ARITY-FUNCTION-CLASS-TEMPLATE*", $str_alt457$___public_static_final_class__A_e);
		deflexical("*JAVA-BACKEND-ZERO-ARITY-FUNCTION-CLASS-INITIALIZER-TEMPLATE*", $str_alt448$__new__A__);
		deflexical("*JAVA-BACKEND-WRITE-SYSTEM-INIT-FILE-PREAMBLE*", $str_alt463$__package_com_cyc_cycjava_cycl___);
		deflexical("*JAVA-BACKEND-WRITE-SYSTEM-INIT-FILE-POSTAMBLE*", $str_alt464$________);
		deflexical("*PATCHER-TEMPLATE*", $str_alt468$import_com_cyc_tool_subl_util____);
		defvar("*JAVA-BACKEND-REST-ARITY-TABLE*", NIL);
		return NIL;
	}

	public static SubLObject init_java_backend_file() {
		if (SubLFiles.USE_V1) {
			deflexical("*ALL-JAVA-BACKEND-LOGGING-LEVELS*", $list0);
			defvar("*JAVA-BACKEND-LOGGING-DETAIL*", $NONE);
			defvar("*JAVA-BACKEND-LOGGING-FOR-CURRENT-METHOD*", NIL);
			deflexical("*JAVA-BACKEND-LOGGING-BLACKLIST-PATTERNS*", $list14);
			defparameter("*JAVA-BACKEND-NEW-ARRAY-ITEMS-ON-SEPARATE-LINES?*", NIL);
			defparameter("*JAVA-BACKEND-CURRENT-LOCAL-VARIABLE-SCOPE*", NIL);
			defparameter("*JAVA-BACKEND-PREVIOUS-LOCAL-VARIABLE-SCOPE*", NIL);
			deflexical("*JAVA-BACKEND-ELIMINATE-UNINTERESTING-VARIANCE*", SubLTrampolineFile.maybeDefault($java_backend_eliminate_uninteresting_variance$, $java_backend_eliminate_uninteresting_variance$, NIL));
			defparameter("*JAVA-BACKEND-CURRENT-CLASS*", NIL);
			defparameter("*JAVA-BACKEND-INITIALIZER-METHODS*", NIL);
			deflexical("*JAVA-BACKEND-WRITERS*", $list144);
			deflexical("*JAVA-BACKEND-CLET-BIND-LOCAL-VARIABLE-CACHING-STATE*", NIL);
			deflexical("*JAVA-BACKEND-UNINTERRUPTIBLE-METHODS*", $list209);
			defvar("*JAVA-BACKEND-FUNCALL-OPTIMIZATION-ENABLED?*", T);
			deflexical("*JAVA-BACKEND-OBJECT-DATA-TYPE*", $$$SubLObject);
			deflexical("*JAVA-BACKEND-DEFSTRUCT-OVERRIDE-LIMIT*", TWENTY_INTEGER);
			deflexical("*JAVA-BACKEND-INITIALIZER-SIZE-THRESHOLD*", $int$1000);
			deflexical("*TARGET-MOST-POSITIVE-INT*", subtract(expt(TWO_INTEGER, $int$31), ONE_INTEGER));
			deflexical("*TARGET-MOST-NEGATIVE-INT*", minus(expt(TWO_INTEGER, $int$31)));
			defparameter("*JAVA-BACKEND-CURRENT-THREAD-VARIABLE*", NIL);
			deflexical("*TRANSLATE-EQ-AS-EQL*", SubLTrampolineFile.maybeDefault($translate_eq_as_eql$, $translate_eq_as_eql$, T));
			deflexical("*JAVA-BACKEND-UNARY-FUNCTION-CLASS-TEMPLATE*", $str497$___public_static_final_class__A_e);
			deflexical("*JAVA-BACKEND-UNARY-FUNCTION-CLASS-INITIALIZER-TEMPLATE*", $str500$__new__A__);
			deflexical("*JAVA-BACKEND-BINARY-FUNCTION-CLASS-TEMPLATE*", $str504$___public_static_final_class__A_e);
			deflexical("*JAVA-BACKEND-BINARY-FUNCTION-CLASS-INITIALIZER-TEMPLATE*", $str506$______new__A__);
			deflexical("*JAVA-BACKEND-ZERO-ARITY-FUNCTION-CLASS-TEMPLATE*", $str510$___public_static_final_class__A_e);
			deflexical("*JAVA-BACKEND-ZERO-ARITY-FUNCTION-CLASS-INITIALIZER-TEMPLATE*", $str511$_______new__A__);
			deflexical("*JAVA-BACKEND-WRITE-SYSTEM-INIT-FILE-PREAMBLE*", $str523$__package_com_cyc_cycjava_cycl___);
			deflexical("*JAVA-BACKEND-WRITE-SYSTEM-INIT-FILE-POSTAMBLE*", $str524$________);
			deflexical("*PATCHER-TEMPLATE*", $str528$import_com_cyc_tool_subl_util____);
			defvar("*JAVA-BACKEND-REST-ARITY-TABLE*", NIL);
		}
		if (SubLFiles.USE_V2) {
			deflexical("*JAVA-BACKEND-WRITERS*", $list_alt107);
			deflexical("*JAVA-BACKEND-UNINTERRUPTIBLE-METHODS*", $list_alt164);
			deflexical("*JAVA-BACKEND-UNARY-FUNCTION-CLASS-TEMPLATE*", $str_alt445$___public_static_final_class__A_e);
			deflexical("*JAVA-BACKEND-UNARY-FUNCTION-CLASS-INITIALIZER-TEMPLATE*", $str_alt448$__new__A__);
			deflexical("*JAVA-BACKEND-BINARY-FUNCTION-CLASS-TEMPLATE*", $str_alt452$___public_static_final_class__A_e);
			deflexical("*JAVA-BACKEND-BINARY-FUNCTION-CLASS-INITIALIZER-TEMPLATE*", $str_alt448$__new__A__);
			deflexical("*JAVA-BACKEND-ZERO-ARITY-FUNCTION-CLASS-TEMPLATE*", $str_alt457$___public_static_final_class__A_e);
			deflexical("*JAVA-BACKEND-ZERO-ARITY-FUNCTION-CLASS-INITIALIZER-TEMPLATE*", $str_alt448$__new__A__);
			deflexical("*JAVA-BACKEND-WRITE-SYSTEM-INIT-FILE-PREAMBLE*", $str_alt463$__package_com_cyc_cycjava_cycl___);
			deflexical("*JAVA-BACKEND-WRITE-SYSTEM-INIT-FILE-POSTAMBLE*", $str_alt464$________);
			deflexical("*PATCHER-TEMPLATE*", $str_alt468$import_com_cyc_tool_subl_util____);
		}
		return NIL;
	}

	public static SubLObject init_java_backend_file_Previous() {
		deflexical("*ALL-JAVA-BACKEND-LOGGING-LEVELS*", $list0);
		defvar("*JAVA-BACKEND-LOGGING-DETAIL*", $NONE);
		defvar("*JAVA-BACKEND-LOGGING-FOR-CURRENT-METHOD*", NIL);
		deflexical("*JAVA-BACKEND-LOGGING-BLACKLIST-PATTERNS*", $list14);
		defparameter("*JAVA-BACKEND-NEW-ARRAY-ITEMS-ON-SEPARATE-LINES?*", NIL);
		defparameter("*JAVA-BACKEND-CURRENT-LOCAL-VARIABLE-SCOPE*", NIL);
		defparameter("*JAVA-BACKEND-PREVIOUS-LOCAL-VARIABLE-SCOPE*", NIL);
		deflexical("*JAVA-BACKEND-ELIMINATE-UNINTERESTING-VARIANCE*", SubLTrampolineFile.maybeDefault($java_backend_eliminate_uninteresting_variance$, $java_backend_eliminate_uninteresting_variance$, NIL));
		defparameter("*JAVA-BACKEND-CURRENT-CLASS*", NIL);
		defparameter("*JAVA-BACKEND-INITIALIZER-METHODS*", NIL);
		deflexical("*JAVA-BACKEND-WRITERS*", $list144);
		deflexical("*JAVA-BACKEND-CLET-BIND-LOCAL-VARIABLE-CACHING-STATE*", NIL);
		deflexical("*JAVA-BACKEND-UNINTERRUPTIBLE-METHODS*", $list209);
		defvar("*JAVA-BACKEND-FUNCALL-OPTIMIZATION-ENABLED?*", T);
		deflexical("*JAVA-BACKEND-OBJECT-DATA-TYPE*", $$$SubLObject);
		deflexical("*JAVA-BACKEND-DEFSTRUCT-OVERRIDE-LIMIT*", TWENTY_INTEGER);
		deflexical("*JAVA-BACKEND-INITIALIZER-SIZE-THRESHOLD*", $int$1000);
		deflexical("*TARGET-MOST-POSITIVE-INT*", subtract(expt(TWO_INTEGER, $int$31), ONE_INTEGER));
		deflexical("*TARGET-MOST-NEGATIVE-INT*", minus(expt(TWO_INTEGER, $int$31)));
		defparameter("*JAVA-BACKEND-CURRENT-THREAD-VARIABLE*", NIL);
		deflexical("*TRANSLATE-EQ-AS-EQL*", SubLTrampolineFile.maybeDefault($translate_eq_as_eql$, $translate_eq_as_eql$, T));
		deflexical("*JAVA-BACKEND-UNARY-FUNCTION-CLASS-TEMPLATE*", $str497$___public_static_final_class__A_e);
		deflexical("*JAVA-BACKEND-UNARY-FUNCTION-CLASS-INITIALIZER-TEMPLATE*", $str500$__new__A__);
		deflexical("*JAVA-BACKEND-BINARY-FUNCTION-CLASS-TEMPLATE*", $str504$___public_static_final_class__A_e);
		deflexical("*JAVA-BACKEND-BINARY-FUNCTION-CLASS-INITIALIZER-TEMPLATE*", $str506$______new__A__);
		deflexical("*JAVA-BACKEND-ZERO-ARITY-FUNCTION-CLASS-TEMPLATE*", $str510$___public_static_final_class__A_e);
		deflexical("*JAVA-BACKEND-ZERO-ARITY-FUNCTION-CLASS-INITIALIZER-TEMPLATE*", $str511$_______new__A__);
		deflexical("*JAVA-BACKEND-WRITE-SYSTEM-INIT-FILE-PREAMBLE*", $str523$__package_com_cyc_cycjava_cycl___);
		deflexical("*JAVA-BACKEND-WRITE-SYSTEM-INIT-FILE-POSTAMBLE*", $str524$________);
		deflexical("*PATCHER-TEMPLATE*", $str528$import_com_cyc_tool_subl_util____);
		defvar("*JAVA-BACKEND-REST-ARITY-TABLE*", NIL);
		return NIL;
	}

	public static final SubLSymbol $sym273$_FOR = makeSymbol("%FOR");

	public static final SubLString $str_alt274$for__ = makeString("for (");

	public static final SubLList $list_alt275 = cons(makeSymbol("FIRST-INITIALIZATION"), makeSymbol("REST-INITIALIATIONS"));

	public static final SubLString $str_alt276$__ = makeString("; ");

	public static final SubLList $list_alt277 = cons(makeSymbol("FIRST-UPDATE"), makeSymbol("REST-UPDATES"));

	public static final SubLList $list_alt278 = list(makeSymbol("OPERATOR"), makeSymbol("CONSTANT-ID"), makeSymbol("CONSTANT-FORM"));

	public static final SubLString $str_alt280$_ic_S_ = makeString("$ic~S$");

	public static final SubLString $str_alt282$_str = makeString("$str");

	public static final SubLString $str_alt283$_kw = makeString("$kw");

	public static final SubLString $str_alt285$_sym = makeString("$sym");

	public static final SubLString $str_alt286$_int = makeString("$int");

	public static final SubLString $str_alt287$_float = makeString("$float");

	public static final SubLString $str_alt288$_list = makeString("$list");

	public static final SubLString $str_alt289$_char = makeString("$char");

	public static final SubLString $str_alt290$_const = makeString("$const");

	public static final SubLString $str_alt291$_ic = makeString("$ic");

	public static final SubLList $list_alt292 = list(makeSymbol("OPERATOR"), makeSymbol("CONSTANT-ID"), makeSymbol("CONSTANT-FORM"), makeSymbol("LOAD-FORM"));

	public static final SubLString $str_alt293$public_static_final_ = makeString("public static final ");

	public static final SubLList $list_alt294 = cons(makeSymbol("OPERATOR"), makeSymbol("ARGS"));

	public static final SubLList $list_alt295 = list(makeSymbol("LIST"), makeSymbol("CONS"), makeSymbol("LIST*"));

	public static final SubLList $list_alt297 = list(makeSymbol("ARG"));

	public static final SubLString $str_alt304$_CONSTANT_ = makeString("_CONSTANT-");

	public static final SubLString $str_alt305$_INITIALIZER = makeString("-INITIALIZER");

	public static SubLObject setup_java_backend_file() {
		declare_defglobal($java_backend_eliminate_uninteresting_variance$);
		memoization_state.note_memoized_function(JAVA_BACKEND_MODULE_CLASS_NAME);
		note_funcall_helper_function(TRANSLATOR_INTERNAL_CONSTANT_FORM_P);
		memoization_state.note_memoized_function(JAVA_BACKEND_SECURE_LOCAL_ID);
		memoization_state.note_globally_cached_function(JAVA_BACKEND_CLET_BIND_LOCAL_VARIABLE);
		memoization_state.note_memoized_function(JAVA_BACKEND_DEFSTRUCT_CLASS_NAME);
		memoization_state.note_memoized_function(JAVA_BACKEND_DEFSTRUCT_SLOT_NAME);
		declare_defglobal($translate_eq_as_eql$);
		memoization_state.note_memoized_function(JAVA_BACKEND_UNARY_FUNCTION_CLASS_NAME);
		memoization_state.note_memoized_function(JAVA_BACKEND_BINARY_FUNCTION_CLASS_NAME);
		memoization_state.note_memoized_function(JAVA_BACKEND_ZERO_ARITY_FUNCTION_CLASS_NAME);
		return NIL;
	}

	public static final SubLList $list_alt306 = list(makeSymbol("OPERATOR"), makeSymbol("OBJECT"));

	public static final SubLSymbol $sym307$_CSTRING = makeSymbol("%CSTRING");

	public static final SubLSymbol $sym308$_CKEYWORD = makeSymbol("%CKEYWORD");

	public static final SubLSymbol $sym309$_CINTERN = makeSymbol("%CINTERN");

	public static final SubLSymbol $sym310$_CMAKE_SYMBOL = makeSymbol("%CMAKE-SYMBOL");

	public static final SubLSymbol $sym311$_CSYMBOL = makeSymbol("%CSYMBOL");

	public static final SubLSymbol $sym312$_CFIX = makeSymbol("%CFIX");

	public static final SubLSymbol $sym313$_CBIG = makeSymbol("%CBIG");

	public static final SubLSymbol $sym314$_CFLOAT = makeSymbol("%CFLOAT");

	public static final SubLSymbol $sym315$_CCHAR = makeSymbol("%CCHAR");

	public static final SubLSymbol $sym316$_CPACKAGE = makeSymbol("%CPACKAGE");

	public static final SubLSymbol $sym317$_CGUID = makeSymbol("%CGUID");

	@Override
	public void declareFunctions() {
		declare_java_backend_file();
	}

	public static final SubLString $str_alt318$Time_to_add__LF_support_for__S = makeString("Time to add %LF support for ~S");

	@Override
	public void initializeVariables() {
		init_java_backend_file();
	}

	public static final SubLList $list_alt319 = list(makeSymbol("OPERATOR"), makeSymbol("VARIABLE"), makeSymbol("&OPTIONAL"), list(makeSymbol("INITIALIZATION"), NIL, makeSymbol("INITIALIZED?")), makeSymbol("TYPE"), makeSymbol("FINAL?"));

	@Override
	public void runTopLevelForms() {
		setup_java_backend_file();
	}

	public static final SubLList $list_alt320 = list(makeSymbol("OPERATOR"), makeSymbol("EXPRESSION"));

	public static final SubLSymbol $sym322$_ARG2 = makeSymbol("%ARG2");

	public static final SubLList $list_alt323 = list(makeSymbol("%RESET-MVAL"));

	public static final SubLSymbol $sym324$_MULTIPLE_VALUE_LIST = makeSymbol("%MULTIPLE-VALUE-LIST");

	public static final SubLSymbol $sym325$_NC = makeSymbol("%NC");

	public static final SubLSymbol $sym326$_TRUE = makeSymbol("%TRUE");

	public static final SubLSymbol $sym328$_FALSE = makeSymbol("%FALSE");

	public static final SubLSymbol $sym330$_NULL = makeSymbol("%NULL");

	public static final SubLSymbol $sym332$_UNPROVIDED = makeSymbol("%UNPROVIDED");

	public static final SubLSymbol $sym333$_EMPTY_ARRAY = makeSymbol("%EMPTY-ARRAY");

	public static final SubLString $str_alt334$EMPTY_SUBL_OBJECT_ARRAY = makeString("EMPTY_SUBL_OBJECT_ARRAY");

	public static final SubLString $str_alt335$Unexpected_native_constant__S = makeString("Unexpected native constant ~S");

	public static final SubLSymbol $sym336$_NOT = makeSymbol("%NOT");

	public static final SubLString $str_alt337$___ = makeString("(!(");

	public static final SubLString $str_alt338$__ = makeString("))");

	public static final SubLSymbol $sym339$_DTB = makeSymbol("%DTB");

	public static final SubLSymbol $sym340$_NOT____ = makeSymbol("%NOT-%==");

	public static final SubLList $list_alt341 = list(makeSymbol("%PC"), NIL);

	public static final SubLList $list_alt342 = list(makeSymbol("OPERATOR"), makeSymbol("N"), makeSymbol("EXPRESSION"));

	public static final SubLSymbol $sym344$_NTH_VALUE_STEP_2 = makeSymbol("%NTH-VALUE-STEP-2");

	public static final SubLSymbol $sym345$_NTH_VALUE_STEP_1 = makeSymbol("%NTH-VALUE-STEP-1");

	public static final SubLSymbol $sym346$_OR = makeSymbol("%OR");

	public static final SubLList $list_alt347 = list(makeSymbol("%NC"), makeSymbol("%FALSE"));

	public static final SubLString $str_alt348$___ = makeString("|| ");

	public static final SubLList $list_alt349 = list(makeSymbol("OPERATOR"), makeSymbol("FUNCTION"), makeSymbol("REQUIRED-COUNT"), makeSymbol("OPTIONAL-COUNT"), makeSymbol("REST?"));

	public static final SubLSymbol $sym350$_REGISTER_FUNCTION = makeSymbol("%REGISTER-FUNCTION");

	public static final SubLList $list_alt353 = list(makeSymbol("OPERATOR"), makeSymbol("DEFINER"), makeSymbol("GLOBAL"), makeSymbol("INITIALIZATION"));

	public static final SubLSymbol $sym354$_REGISTER_GLOBAL = makeSymbol("%REGISTER-GLOBAL");

	public static final SubLString $str_alt359$Unexpected_definer__S = makeString("Unexpected definer ~S");

	public static final SubLList $list_alt360 = list(makeSymbol("OPERATOR"), makeSymbol("FUNCTION"));

	public static final SubLSymbol $sym361$_REGISTER_MACRO = makeSymbol("%REGISTER-MACRO");

	public static final SubLList $list_alt363 = list(makeSymbol("OPERATOR"), makeSymbol("THREAD-VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));

	public static final SubLSymbol $sym364$_WITH_CURRENT_THREAD = makeSymbol("%WITH-CURRENT-THREAD");

	public static final SubLList $list_alt365 = list(list(makeSymbol("%CURRENT-THREAD")), makeString("SubLThread"), makeKeyword("FINAL"));

	public static final SubLList $list_alt366 = list(makeSymbol("OPERATOR"), list(makeSymbol("HANDLER"), makeSymbol("CATCH-VAR"), makeSymbol("ERROR-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

	public static final SubLSymbol $sym367$_WITH_ERROR_HANDLER = makeSymbol("%WITH-ERROR-HANDLER");

	public static final SubLList $list_alt369 = list(list(makeSymbol("%PC"), NIL));

	public static final SubLList $list_alt370 = list(makeSymbol("OPERATOR"), makeSymbol("ENV-VAR"), makeSymbol("RESULT-VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));

	public static final SubLSymbol $sym371$_WITH_PROCESS_RESOURCE_TRACKING = makeSymbol("%WITH-PROCESS-RESOURCE-TRACKING");

	public static final SubLList $list_alt372 = list(list(makeSymbol("GET-INTERNAL-REAL-TIME")));

	public static final SubLSymbol $sym373$_COMPUTE_WITH_PROCESS_RESOURCE_TRACKING_RESULTS = makeSymbol("%COMPUTE-WITH-PROCESS-RESOURCE-TRACKING-RESULTS");

	public static final SubLList $list_alt374 = list(makeSymbol("OPERATOR"), makeSymbol("PLACE"), makeSymbol("EXPRESSION"));

	public static final SubLList $list_alt375 = list(makeSymbol("OPERATOR"), makeSymbol("EXPRESSION1"), makeSymbol("EXPRESSION2"));

	public static final SubLString $str_alt377$____ = makeString(" == ");

	public static final SubLString $str_alt378$____ = makeString(" != ");

	public static final SubLList $list_alt379 = list(makeSymbol("OPERATOR"), makeSymbol("INTERFACE"), makeSymbol("&OPTIONAL"), makeSymbol("SLOT-VALUE-TUPLES"));

	public static final SubLString $str_alt380$_ = makeString("@");

	public static final SubLList $list_alt381 = list(makeSymbol("SLOT"), makeSymbol("VALUE"));

	public static final SubLList $list_alt382 = list(makeSymbol("OPERATOR"), makeSymbol("SYMBOL"), makeSymbol("EXPRESSION"));

	public static final SubLList $list_alt384 = list(makeSymbol("OPERATOR"), makeSymbol("TYPE"), makeSymbol("EXPRESSION"));

	public static final SubLString $str_alt385$__ = makeString("((");

	public static final SubLList $list_alt386 = list(makeSymbol("OPERATOR"), makeSymbol("SYMBOL"));

	public static final SubLList $list_alt388 = list(makeSymbol("OPERATOR"), makeSymbol("OBJECT"), makeSymbol("FIELD"));

	public static final SubLList $list_alt389 = list(makeSymbol("OPERATOR"), makeSymbol("NAME"));

	public static final SubLList $list_alt390 = list(makeSymbol("OPERATOR"), makeSymbol("VARIABLE"), makeSymbol("DEFAULT"));

	public static final SubLSymbol $sym391$_INIT_OPT_ARG = makeSymbol("%INIT-OPT-ARG");

	public static final SubLList $list_alt392 = list(list(makeSymbol("%NC"), makeSymbol("%UNPROVIDED")));

	public static final SubLList $list_alt393 = list(list(list(makeSymbol("%NC"), makeSymbol("%TRUE"))));

	public static final SubLList $list_alt394 = list(makeSymbol("OPERATOR"), makeSymbol("OBJECT"), makeSymbol("CLASS-NAME"));

	public static final SubLSymbol $sym395$_INSTANCEOF = makeSymbol("%INSTANCEOF");

	public static final SubLString $str_alt396$_instanceof_ = makeString(" instanceof ");

	public static final SubLList $list_alt397 = list(makeSymbol("OPERATOR"), makeSymbol("GLOBAL"));

	public static final SubLSymbol $sym398$_DYN = makeSymbol("%DYN");

	public static final SubLList $list_alt400 = list(makeString("getDynamicValue"));

	public static final SubLSymbol $sym401$_LEX = makeSymbol("%LEX");

	public static final SubLList $list_alt402 = list(makeString("getGlobalValue"));

	public static final SubLList $list_alt403 = list(makeSymbol("OPERATOR"), makeSymbol("GLOBAL"), makeSymbol("VALUE"));

	public static final SubLList $list_alt406 = list(makeSymbol("OPERATOR"), makeSymbol("OBJECT"), makeSymbol("METHOD"), makeSymbol("&REST"), makeSymbol("ARGS"));

	public static final SubLList $list_alt407 = list(makeSymbol("OPERATOR"), makeSymbol("N"));

	public static final SubLSymbol $sym408$_MVAL = makeSymbol("%MVAL");

	public static final SubLList $list_alt409 = list(makeSymbol("%PC"), ZERO_INTEGER);

	public static final SubLList $list_alt410 = list(makeString("firstMultipleValue"));

	public static final SubLList $list_alt411 = list(makeSymbol("%PC"), ONE_INTEGER);

	public static final SubLList $list_alt412 = list(makeString("secondMultipleValue"));

	public static final SubLList $list_alt413 = list(makeSymbol("%PC"), TWO_INTEGER);

	public static final SubLList $list_alt414 = list(makeString("thirdMultipleValue"));

	public static final SubLList $list_alt415 = list(makeSymbol("%PC"), THREE_INTEGER);

	public static final SubLList $list_alt416 = list(makeString("fourthMultipleValue"));

	public static final SubLList $list_alt417 = list(makeSymbol("%PC"), FOUR_INTEGER);

	public static final SubLList $list_alt418 = list(makeString("fifthMultipleValue"));

	public static final SubLList $list_alt419 = list(makeSymbol("%PC"), FIVE_INTEGER);

	public static final SubLList $list_alt420 = list(makeString("sixthMultipleValue"));

	public static final SubLList $list_alt421 = list(makeSymbol("%PC"), SIX_INTEGER);

	public static final SubLList $list_alt422 = list(makeString("seventhMultipleValue"));

	public static final SubLList $list_alt423 = list(makeSymbol("%PC"), SEVEN_INTEGER);

	public static final SubLList $list_alt424 = list(makeString("eighthMultipleValue"));

	public static final SubLList $list_alt425 = list(makeSymbol("OPERATOR"), makeSymbol("CLASS-NAME"), makeSymbol("&REST"), makeSymbol("ARGS"));

	public static final SubLList $list_alt426 = list(makeSymbol("OPERATOR"), makeSymbol("CLASS-NAME"), makeSymbol("&OPTIONAL"), makeSymbol("ELEMENTS"));

	public static final SubLString $str_alt427$____ = makeString("[] {");

	public static final SubLList $list_alt428 = list(makeSymbol("OPERATOR"), makeSymbol("VARIABLE"));

	public static final SubLSymbol $sym429$_NOTE_SUPPLIED = makeSymbol("%NOTE-SUPPLIED");

	public static final SubLSymbol $sym430$_BTD = makeSymbol("%BTD");

	public static final SubLList $list_alt431 = list(makeSymbol("OPERATOR"), makeSymbol("SYMBOL"), makeSymbol("OLD-VALUE"));

	public static final SubLSymbol $sym433$_RESET_MVAL = makeSymbol("%RESET-MVAL");

	public static final SubLList $list_alt434 = list(makeString("resetMultipleValues"));

	public static final SubLSymbol $sym435$_THROW = makeSymbol("%THROW");

	public static final SubLString $str_alt436$throw_ = makeString("throw ");

	public static final SubLList $list_alt437 = list(makeSymbol("OPERATOR"), makeSymbol("TRY-FORM"), makeSymbol("CATCH-CLAUSES"), makeSymbol("&BODY"), makeSymbol("BODY"));

	public static final SubLString $str_alt438$try_ = makeString("try ");

	public static final SubLString $str_alt439$_finally_ = makeString(" finally ");

	public static final SubLList $list_alt440 = list(list(makeSymbol("TYPE"), makeSymbol("VARIABLE")), makeSymbol("&BODY"), makeSymbol("BODY"));

	public static final SubLString $str_alt441$_catch__ = makeString(" catch (");

	public static final SubLList $list_alt442 = list(makeSymbol("TRY-FORM"), makeSymbol("CATCH-CLAUSES"), makeSymbol("&BODY"), makeSymbol("BODY"));

	public static final SubLString $str_alt443$Time_to_support_non_null_catch_cl = makeString("Time to support non-null catch-clauses");

	public static final SubLString $str_alt445$___public_static_final_class__A_e = makeString("\n  public static final class ~A extends UnaryFunction {\n    public ~A() { super(extractFunctionNamed(~S)); }\n    public SubLObject processItem(SubLObject ~A) { return ~A; }\n  }");

	public static final SubLString $str_alt448$__new__A__ = makeString("; new ~A()");

	public static final SubLString $str_alt450$_UnaryFunction = makeString("$UnaryFunction");

	public static final SubLList $list_alt451 = list(makeSymbol("ARG1"));

	public static final SubLString $str_alt452$___public_static_final_class__A_e = makeString("\n  public static final class ~A extends BinaryFunction {\n    public ~A() { super(extractFunctionNamed(~S)); }\n    public SubLObject processItem(SubLObject ~A, SubLObject ~A) { return ~A; }\n  }");

	public static final SubLString $str_alt455$_BinaryFunction = makeString("$BinaryFunction");

	public static final SubLList $list_alt456 = list(makeSymbol("ARG1"), makeSymbol("ARG2"));

	public static final SubLString $str_alt457$___public_static_final_class__A_e = makeString("\n  public static final class ~A extends ZeroArityFunction {\n    public ~A() { super(extractFunctionNamed(~S)); }\n    public SubLObject processItem() { return ~A; }\n  }");

	public static final SubLString $str_alt459$_ZeroArityFunction = makeString("$ZeroArityFunction");

	public static final SubLString $str_alt461$_dev_null = makeString("/dev/null");

	public static final SubLString $str_alt462$______SubLFiles_initialize___A___ = makeString("~%    SubLFiles.initialize(\"~A\");");

	public static final SubLString $str_alt463$__package_com_cyc_cycjava_cycl___ = makeString(
			"\n\npackage com.cyc.cycjava.cycl;\n\nimport com.cyc.tool.subl.util.SubLFile;\nimport com.cyc.tool.subl.util.SubLFiles;\n\npublic class cycl implements SubLFile {\n  \n  //// Constructors\n  \n  /** Creates a new instance of cycl. */\n  public cycl() {}\n  \n  public static final SubLFile me = new cycl();\n  \n  //// Initializers\n  \n  public void declareFunctions() {\n  }\n  \n  public void initializeVariables() {\n  }\n  \n  public void runTopLevelForms() {");

	public static final SubLString $str_alt464$________ = makeString("\n  }  \n}");

	public static final SubLList $list_alt465 = list(makeSymbol("EXPRESSION1"), makeSymbol("EXPRESSION2"));

	public static final SubLString $str_alt468$import_com_cyc_tool_subl_util____ = makeString(
			"import com.cyc.tool.subl.util.*;\n\npublic class ~A extends AbstractSubLPatcher {\n  private static final long SEQUENCE = ~A;\n  private static final String[] patchedClasses = {\n    ~A\n  };\n\n  public final long getPatchOrdering() { return SEQUENCE; }\n  public final String[] getPatchedClasses() { return patchedClasses; }\n}\n");

	public static final SubLString $str_alt470$_______ = makeString(",~%    ");

	public static final SubLList $list_alt471 = list(makeString("patches"));

	public static final SubLList $list_alt473 = cons(makeSymbol("ARITY"), makeSymbol("COUNT"));

	public static final SubLSymbol $sym474$_ = makeSymbol(">");
}

/**
 * Total time: 2288 ms synthetic ~%"); $str41$_____A__ = makeString("   ~A~%");
 * $str42$___ = makeString(" ~%"); $list73 =
 * ConsesLow.list((SubLObject)$NONE,
 * (SubLObject)makeKeyword("MEDIUM")); $str74$____module________A__ =
 * makeString("   module:      ~A~%"); $str75$____source_file___A__ =
 * makeString("   source file: ~A~%"); $kw76$HIGH = $HIGH;
 * $str77$____created_______4__0D__2__0D__2 =
 * makeString("   created:     ~4,'0D/~2,'0D/~2,'0D ~2,'0D:~2,'0D:~2,'0D~%");
 * $str78$public_final_class_ = makeString("public final class ");
 * $str79$_extends_SubLTranslatedFile_ =
 * makeString(" extends SubLTranslatedFile "); $str80$_ = makeString("{");
 * $str81$_ = makeString("}"); $sym82$JAVA_BACKEND_MODULE_CLASS_NAME =
 * makeSymbol("JAVA-BACKEND-MODULE-CLASS-NAME"); $list83 =
 * ConsesLow.list((SubLObject)makeKeyword("LOW"),
 * (SubLObject)$HIGH); $str84$module_4__0D =
 * makeString("module~4,'0D"); $str85$_____Constructor =
 * makeString("//// Constructor"); $str86$private__A_____ =
 * makeString("private ~A() {}"); $str87$public_static_final_SubLFile_me__ =
 * makeString("public static final SubLFile me = new ~A();");
 * $str88$public_static_final_String_myName =
 * makeString("public static final String myName = ~S;");
 * $str89$public_static_final_String_myFing =
 * makeString("public static final String myFingerPrint = ~S;"); $list90 =
 * ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol(
 * "JAVA-BACKEND-INITIALIZER-METHODS"), (SubLObject)NIL)); $sym91$SECOND =
 * makeSymbol("SECOND"); $str92$_____Definitions =
 * makeString("//// Definitions"); $str93$_____Internal_Constants =
 * makeString("//// Internal Constants");
 * $str94$_____Internal_Constant_Initialize =
 * makeString("//// Internal Constant Initializer Methods"); $sym95$DEFINE =
 * makeSymbol("DEFINE"); $sym96$_INTERNAL_CONSTANT =
 * makeSymbol("%INTERNAL-CONSTANT"); $list97 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("ARGLIST"), (SubLObject)makeSymbol("&BODY"),
 * (SubLObject)makeSymbol("BODY")); $sym98$TRANSLATOR_INTERNAL_CONSTANT_FORM_P =
 * makeSymbol("TRANSLATOR-INTERNAL-CONSTANT-FORM-P"); $str99$_____Initializers =
 * makeString("//// Initializers"); $str100$_Override_public_void_declareFunc =
 * makeString("@Override public void declareFunctions() {");
 * $str101$_Override_public_void_initializeV =
 * makeString("@Override public void initializeVariables() {");
 * $str102$_Override_public_void_runTopLevel =
 * makeString("@Override public void runTopLevelForms() {"); $str103$_ =
 * makeString(";"); $str104$__ = makeString("  ");
 * $str105$Unexpected_C_backend_atom____S =
 * makeString("Unexpected C backend atom : ~S"); $list106 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("CONSTANT")); $sym107$_PC = makeSymbol("%PC");
 * $str108$Time_to_implement_a_C_backend_tra =
 * makeString("Time to implement a C backend translation for predefined constant ~S"
 * ); $kw109$DYNAMIC = makeKeyword("DYNAMIC"); $kw110$LEXICAL =
 * makeKeyword("LEXICAL"); $kw111$CONSTANT = makeKeyword("CONSTANT");
 * $kw112$UNSPECIFIED = makeKeyword("UNSPECIFIED"); $kw113$LOCAL =
 * makeKeyword("LOCAL"); $str114$unexpected_variable_binding_type_ =
 * makeString("unexpected variable binding type ~S for ~S"); $list115 =
 * ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol(
 * "JAVA-BACKEND-PREVIOUS-LOCAL-VARIABLE-SCOPE"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-CURRENT-LOCAL-VARIABLE-SCOPE")),
 * (SubLObject)ConsesLow.list((SubLObject)makeSymbol(
 * "JAVA-BACKEND-CURRENT-LOCAL-VARIABLE-SCOPE"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-CURRENT-LOCAL-VARIABLE-SCOPE")));
 * $kw116$ERROR = makeKeyword("ERROR");
 * $str117$_s_is_an_undeclared_variable__can =
 * makeString("~s is an undeclared variable; cannot translate"); $str118$v_ =
 * makeString("v_"); $str119$__ = makeString("_$"); $list120 =
 * (SubLList)ConsesLow.cons((SubLObject)makeSymbol("CURRENT-LOCAL-FROM-SCOPE"),
 * (SubLObject)makeSymbol("ITS-NAME")); $str121$var = makeString("var");
 * $sym122$JAVA_BACKEND_SECURE_LOCAL_ID =
 * makeSymbol("JAVA-BACKEND-SECURE-LOCAL-ID"); $list123 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("ARGS"));
 * $kw124$UNKNOWN = makeKeyword("UNKNOWN");
 * $str125$translating__S_call_as_funcall =
 * makeString("translating ~S call as funcall"); $sym126$FUNCALL =
 * makeSymbol("FUNCALL"); $sym127$_LF = makeSymbol("%LF");
 * $str128$_S_called_with__S_missing_require =
 * makeString("~S called with ~S missing required arguments");
 * $str129$_S_called_with__S_excess_argument =
 * makeString("~S called with ~S excess arguments"); $str130$_ =
 * makeString("("); $list131 =
 * (SubLList)ConsesLow.cons((SubLObject)makeSymbol("ARG"),
 * (SubLObject)makeSymbol("REST-ARGS")); $str132$_ = makeString(")");
 * $kw133$IMPORTED = makeKeyword("IMPORTED"); $list134 =
 * ConsesLow.list((SubLObject)makeSymbol("%NC"),
 * (SubLObject)makeSymbol("%EMPTY-ARRAY")); $sym135$_NEW_ARRAY =
 * makeSymbol("%NEW-ARRAY"); $str136$SubLObject = makeString("SubLObject");
 * $str137$_CSETF_ = makeString("_CSETF-"); $list138 =
 * ConsesLow.list((SubLObject)makeSymbol("OBJECT"),
 * (SubLObject)makeSymbol("VALUE")); $kw139$IGNORE_ERRORS_TARGET =
 * makeKeyword("IGNORE-ERRORS-TARGET"); $sym140$IGNORE_ERRORS_HANDLER =
 * makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
 * $str141$unable_to_introspect_on__S =
 * makeString("unable to introspect on ~S"); $str142$Unexpected_function__S =
 * makeString("Unexpected function ~S"); $str143$UNPROVIDED =
 * makeString("UNPROVIDED"); $list144 = ConsesLow.list(new SubLObject[] {
 * ConsesLow.cons((SubLObject)makeSymbol("%AND"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%AND")),
 * ConsesLow.cons((SubLObject)makeSymbol("%CCATCH"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%CCATCH")),
 * ConsesLow.cons((SubLObject)makeSymbol("%CDO-SYMBOLS"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%CDO-SYMBOLS")),
 * ConsesLow.cons((SubLObject)makeSymbol("%CDOHASH"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%CDOHASH")),
 * ConsesLow.cons((SubLObject)makeSymbol("CLET-BIND"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-CLET-BIND")),
 * ConsesLow.cons((SubLObject)makeSymbol("CLET-LOCAL"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-CLET-LOCAL")),
 * ConsesLow.cons((SubLObject)makeSymbol("CODE-COMMENT"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-CODE-COMMENT")),
 * ConsesLow.cons((SubLObject)makeSymbol("%CPROGV"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%CPROGV")),
 * ConsesLow.cons((SubLObject)makeSymbol("CSETQ"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-CSETQ")),
 * ConsesLow.cons((SubLObject)makeSymbol("CSETQ-DYNAMIC"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-CSETQ-DYNAMIC")),
 * ConsesLow.cons((SubLObject)makeSymbol("CSETQ-LEXICAL"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-CSETQ-LEXICAL")),
 * ConsesLow.cons((SubLObject)makeSymbol("CSETQ-LOCAL"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-CSETQ-LOCAL")),
 * ConsesLow.cons((SubLObject)makeSymbol("%CUNWIND-PROTECT"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%CUNWIND-PROTECT")),
 * ConsesLow.cons((SubLObject)makeSymbol("CVS-ID"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-CVS-ID")),
 * ConsesLow.cons((SubLObject)makeSymbol("DEFCONSTANT"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-DEFCONSTANT")),
 * ConsesLow.cons((SubLObject)makeSymbol("DEFINE"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-DEFINE")),
 * ConsesLow.cons((SubLObject)makeSymbol("DEFINE-MACROEXPANDER"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-DEFINE-MACROEXPANDER")),
 * ConsesLow.cons((SubLObject)makeSymbol("DEFLEXICAL"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-DEFLEXICAL")),
 * ConsesLow.cons((SubLObject)makeSymbol("DEFPARAMETER"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-DEFPARAMETER")),
 * ConsesLow.cons((SubLObject)makeSymbol("%DEFSTRUCT-CLASS"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%DEFSTRUCT-CLASS")),
 * ConsesLow.cons((SubLObject)makeSymbol("_DEFSTRUCT-CONSTRUCT", "SUBLISP"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-DEFSTRUCT-CONSTRUCT")),
 * ConsesLow.cons((SubLObject)makeSymbol("_DEFSTRUCT-GET-SLOT", "SUBLISP"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-DEFSTRUCT-GET-SLOT")),
 * ConsesLow.cons((SubLObject)makeSymbol("_DEFSTRUCT-OBJECT-P", "SUBLISP"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-DEFSTRUCT-OBJECT-P")),
 * ConsesLow.cons((SubLObject)makeSymbol("_DEFSTRUCT-SET-SLOT", "SUBLISP"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-DEFSTRUCT-SET-SLOT")),
 * ConsesLow.cons((SubLObject)makeSymbol("DEFVAR"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-DEFVAR")),
 * ConsesLow.cons((SubLObject)makeSymbol("%DP-CHECK-TYPE"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%DP-CHECK-TYPE")),
 * ConsesLow.cons((SubLObject)makeSymbol("%DP-ENFORCE-TYPE"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%DP-ENFORCE-TYPE")),
 * ConsesLow.cons((SubLObject)makeSymbol("%ENTER"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%ENTER")),
 * ConsesLow.cons((SubLObject)makeSymbol("FIF"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-FIF")),
 * ConsesLow.cons((SubLObject)makeSymbol("%FOR"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%FOR")),
 * ConsesLow.cons((SubLObject)makeSymbol("%IC"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%IC")),
 * ConsesLow.cons((SubLObject)makeSymbol("%INTERNAL-CONSTANT"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%INTERNAL-CONSTANT")),
 * ConsesLow.cons((SubLObject)makeSymbol("%LF"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%LF")),
 * ConsesLow.cons((SubLObject)makeSymbol("%LOCAL"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%LOCAL")),
 * ConsesLow.cons((SubLObject)makeSymbol("MULTIPLE-VALUE-LIST"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-MULTIPLE-VALUE-LIST")),
 * ConsesLow.cons((SubLObject)makeSymbol("%NC"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%NC")),
 * ConsesLow.cons((SubLObject)makeSymbol("%NOT"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%NOT")),
 * ConsesLow.cons((SubLObject)makeSymbol("NTH-VALUE"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-NTH-VALUE")),
 * ConsesLow.cons((SubLObject)makeSymbol("%OR"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%OR")),
 * ConsesLow.cons((SubLObject)makeSymbol("%PC"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%PC")),
 * ConsesLow.cons((SubLObject)makeSymbol("PCOND"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-PCOND")),
 * ConsesLow.cons((SubLObject)makeSymbol("PROGN"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-PROGN")),
 * ConsesLow.cons((SubLObject)makeSymbol("%PROCLAIM"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%PROCLAIM")),
 * ConsesLow.cons((SubLObject)makeSymbol("%REGISTER-FUNCTION"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%REGISTER-FUNCTION")),
 * ConsesLow.cons((SubLObject)makeSymbol("%REGISTER-GLOBAL"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%REGISTER-GLOBAL")),
 * ConsesLow.cons((SubLObject)makeSymbol("%REGISTER-MACRO"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%REGISTER-MACRO")),
 * ConsesLow.cons((SubLObject)RET,
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-RET")),
 * ConsesLow.cons((SubLObject)makeSymbol("WHILE"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-WHILE")),
 * ConsesLow.cons((SubLObject)makeSymbol("%WITH-CURRENT-THREAD"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%WITH-CURRENT-THREAD")),
 * ConsesLow.cons((SubLObject)makeSymbol("%WITH-ERROR-HANDLER"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%WITH-ERROR-HANDLER")),
 * ConsesLow.cons((SubLObject)makeSymbol("%WITH-PROCESS-RESOURCE-TRACKING"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%WITH-PROCESS-RESOURCE-TRACKING"))
 * , ConsesLow.cons((SubLObject)makeSymbol("%="),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%=")),
 * ConsesLow.cons((SubLObject)makeSymbol("%=="),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%==")),
 * ConsesLow.cons((SubLObject)makeSymbol("%NOT-%=="),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%NOT-%==")),
 * ConsesLow.cons((SubLObject)makeSymbol("%ANNOTATION"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%ANNOTATION")),
 * ConsesLow.cons((SubLObject)makeSymbol("%ASSERT"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%ASSERT")),
 * ConsesLow.cons((SubLObject)makeSymbol("%BIND"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%BIND")),
 * ConsesLow.cons((SubLObject)makeSymbol("%CAST"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%CAST")),
 * ConsesLow.cons((SubLObject)makeSymbol("%CURRENT-BINDING"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%CURRENT-BINDING")),
 * ConsesLow.cons((SubLObject)makeSymbol("%FIELD"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%FIELD")),
 * ConsesLow.cons((SubLObject)makeSymbol("%IDENTIFIER"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%IDENTIFIER")),
 * ConsesLow.cons((SubLObject)makeSymbol("%INIT-OPT-ARG"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%INIT-OPT-ARG")),
 * ConsesLow.cons((SubLObject)makeSymbol("%INSTANCEOF"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%INSTANCEOF")),
 * ConsesLow.cons((SubLObject)makeSymbol("%DYN"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%DYN")),
 * ConsesLow.cons((SubLObject)makeSymbol("%LEX"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%LEX")),
 * ConsesLow.cons((SubLObject)makeSymbol("%SET-DYN"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%SET-DYN")),
 * ConsesLow.cons((SubLObject)makeSymbol("%SET-LEX"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%SET-LEX")),
 * ConsesLow.cons((SubLObject)makeSymbol("%METHOD"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%METHOD")),
 * ConsesLow.cons((SubLObject)makeSymbol("%MVAL"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%MVAL")),
 * ConsesLow.cons((SubLObject)makeSymbol("%NEW"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%NEW")),
 * ConsesLow.cons((SubLObject)makeSymbol("%NEW-ARRAY"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%NEW-ARRAY")),
 * ConsesLow.cons((SubLObject)makeSymbol("%NOTE-SUPPLIED"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%NOTE-SUPPLIED")),
 * ConsesLow.cons((SubLObject)makeSymbol("%REBIND"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%REBIND")),
 * ConsesLow.cons((SubLObject)makeSymbol("%RESET-MVAL"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%RESET-MVAL")),
 * ConsesLow.cons((SubLObject)makeSymbol("%THROW"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%THROW")),
 * ConsesLow.cons((SubLObject)makeSymbol("%TRY"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%TRY")),
 * ConsesLow.cons((SubLObject)makeSymbol("%LOG-ENTER"),
 * (SubLObject)makeSymbol("JAVA-BACKEND-WRITE-%LOG-ENTER")) });
 * $str145$Time_to_implement_the_writer_for_ =
 * makeString("Time to implement the writer for ~S"); $list146 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("OBJECT"), (SubLObject)makeSymbol("PRED"));
 * $sym147$_DP_CHECK_TYPE = makeSymbol("%DP-CHECK-TYPE"); $sym148$_ASSERT =
 * makeSymbol("%ASSERT"); $sym149$_NOT____ = makeSymbol("%NOT-%=="); $list150 =
 * ConsesLow.list((SubLObject)makeSymbol("%PC"), (SubLObject)NIL);
 * $sym151$_DP_ENFORCE_TYPE = makeSymbol("%DP-ENFORCE-TYPE"); $sym152$QUOTE =
 * QUOTE; $sym153$_IC = makeSymbol("%IC"); $sym154$_CAST =
 * makeSymbol("%CAST"); $str155$SubLSymbol = makeString("SubLSymbol");
 * $str156$checkType = makeString("checkType"); $str157$enforceType =
 * makeString("enforceType"); $str158$unexpected_checker____S =
 * makeString("unexpected checker : ~S"); $sym159$_METHOD =
 * makeSymbol("%METHOD"); $list160 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)ConsesLow.list((SubLObject)makeSymbol("TAG"),
 * (SubLObject)makeSymbol("ANS-VAR"), (SubLObject)makeSymbol("ENV-VAR")),
 * (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("BODY"));
 * $sym161$_CCATCH = makeSymbol("%CCATCH"); $sym162$_TRY = makeSymbol("%TRY");
 * $str163$throwStack_push = makeString("throwStack.push"); $str164$Throwable =
 * makeString("Throwable"); $sym165$CSETQ = makeSymbol("CSETQ");
 * $sym166$_HANDLE_THROWABLE = makeSymbol("%HANDLE-THROWABLE"); $list167 =
 * ConsesLow.list((SubLObject)makeString("throwStack.pop")); $sym168$THREAD =
 * makeUninternedSymbol("THREAD"); $sym169$_WITH_CURRENT_THREAD =
 * makeSymbol("%WITH-CURRENT-THREAD"); $list170 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)ConsesLow.list((SubLObject)makeSymbol("SYM"),
 * (SubLObject)makeSymbol("PACKAGE-VAR"),
 * (SubLObject)makeSymbol("ITERATOR-VAR")), (SubLObject)makeSymbol("&BODY"),
 * (SubLObject)makeSymbol("BODY")); $sym171$_CDO_SYMBOLS =
 * makeSymbol("%CDO-SYMBOLS"); $sym172$_LOCAL = makeSymbol("%LOCAL");
 * $sym173$_CDO_SYMBOLS_MAKE_ITERATOR =
 * makeSymbol("%CDO-SYMBOLS-MAKE-ITERATOR"); $list174 =
 * ConsesLow.list((SubLObject)makeString("Iterator"),
 * (SubLObject)makeKeyword("FINAL")); $sym175$WHILE = makeSymbol("WHILE");
 * $sym176$_CDO_SYMBOLS_ITERATOR_HAS_NEXT =
 * makeSymbol("%CDO-SYMBOLS-ITERATOR-HAS-NEXT");
 * $sym177$_CDO_SYMBOLS_ITERATOR_NEXT_VALUE =
 * makeSymbol("%CDO-SYMBOLS-ITERATOR-NEXT-VALUE"); $list178 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("BINDINGS"), (SubLObject)makeSymbol("&BODY"),
 * (SubLObject)makeSymbol("BODY")); $sym179$CLET_BIND = makeSymbol("CLET-BIND");
 * $list180 = ConsesLow.list((SubLObject)makeSymbol("VARIABLE"),
 * (SubLObject)makeSymbol("INITIALIZATION")); $sym181$_CURRENT_BINDING =
 * makeSymbol("%CURRENT-BINDING"); $sym182$_BIND = makeSymbol("%BIND");
 * $sym183$_REBIND = makeSymbol("%REBIND"); $sym184$CLET_LOCAL =
 * makeSymbol("CLET-LOCAL"); $sym185$JAVA_BACKEND_CLET_BIND_LOCAL_VARIABLE =
 * makeSymbol("JAVA-BACKEND-CLET-BIND-LOCAL-VARIABLE"); $str186$_PREV_BIND_ =
 * makeString("_PREV_BIND_");
 * $sym187$_JAVA_BACKEND_CLET_BIND_LOCAL_VARIABLE_CACHING_STATE_ =
 * makeSymbol("JAVA-BACKEND-CLET-BIND-LOCAL-VARIABLE-CACHING-STATE"); $list188 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)ConsesLow.list((SubLObject)makeSymbol("DYNAMIC-VARS"),
 * (SubLObject)makeSymbol("BINDINGS"), (SubLObject)makeSymbol("INTERNAL-VAR")),
 * (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("BODY"));
 * $sym189$_CPROGV = makeSymbol("%CPROGV"); $sym190$OLD_VALUES =
 * makeUninternedSymbol("OLD-VALUES"); $sym191$_EXTRACT_DYNAMIC_VALUES =
 * makeSymbol("%EXTRACT-DYNAMIC-VALUES"); $list192 =
 * ConsesLow.list((SubLObject)makeString("ArrayList"),
 * (SubLObject)makeKeyword("FINAL")); $sym193$_BIND_DYNAMIC_VARS =
 * makeSymbol("%BIND-DYNAMIC-VARS"); $sym194$_REBIND_DYNAMIC_VARS =
 * makeSymbol("%REBIND-DYNAMIC-VARS"); $list195 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("VARIABLE"), (SubLObject)makeSymbol("VALUE"));
 * $sym196$CSETQ_LOCAL = makeSymbol("CSETQ-LOCAL"); $sym197$CSETQ_DYNAMIC =
 * makeSymbol("CSETQ-DYNAMIC"); $sym198$CSETQ_LEXICAL =
 * makeSymbol("CSETQ-LEXICAL"); $str199$The_constant_variable__S_cannot_b =
 * makeString("The constant variable ~S cannot be set");
 * $str200$Unexpected_variable__S = makeString("Unexpected variable ~S");
 * $sym201$_SET_DYN = makeSymbol("%SET-DYN"); $sym202$_SET_LEX =
 * makeSymbol("%SET-LEX"); $list203 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("ENV-VAR"), (SubLObject)makeSymbol("PROTECTED-FORM"),
 * (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("BODY"));
 * $sym204$_CUNWIND_PROTECT = makeSymbol("%CUNWIND-PROTECT"); $list205 =
 * ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("PCOND"),
 * (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol(
 * "%DTB"), (SubLObject)makeKeyword("ANYTHING")),
 * (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword
 * ("TEST"), (SubLObject)makeSymbol("JAVA-BACKEND-UNINTERRUPTIBLE-METHOD-P")),
 * (SubLObject)makeKeyword("ANYTHING"))),
 * (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol(
 * "%NC"), (SubLObject)makeSymbol("%TRUE"))))); $list206 =
 * ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol(
 * "%RESTORE-VALUES-FROM-VECTOR"), (SubLObject)makeSymbol("_VALUES"))); $list207
 * =
 * ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("_VALUES"),
 * (SubLObject)ConsesLow.list((SubLObject)makeSymbol("%VALUES-AS-VECTOR"))));
 * $list208 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol(
 * "IS-THREAD-PERFORMING-CLEANUP?", "SUBLISP"),
 * (SubLObject)ConsesLow.list((SubLObject)makeSymbol("%PC"), (SubLObject)T)));
 * $list209 = ConsesLow.list((SubLObject)makeSymbol("RELEASE-LOCK", "SUBLISP"),
 * (SubLObject)makeSymbol("RW-LOCK-RELEASE-READ-LOCK"),
 * (SubLObject)makeSymbol("RW-LOCK-RELEASE-WRITE-LOCK")); $list210 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("ID-STRING")); $sym211$CVS_ID = makeSymbol("CVS-ID");
 * $str212$___CVS_ID_ = makeString(" * makeSymbol("DEFCONSTANT"); $list214 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("VARIABLE"), (SubLObject)makeSymbol("INITIALIZATION"),
 * (SubLObject)makeSymbol("&OPTIONAL"),
 * (SubLObject)makeSymbol("DOCUMENTATION")); $str215$private_ =
 * makeString("private "); $str216$public_ = makeString("public "); $str217$_ =
 * makeString(" "); $list218 = ConsesLow.list((SubLObject)makeSymbol("%NC"),
 * (SubLObject)makeSymbol("%NULL")); $list219 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("NAME"), (SubLObject)makeSymbol("ARGLIST"),
 * (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("BODY"));
 * $str220$_S_was_not_a_top_level_define =
 * makeString("~S was not a top-level define"); $sym221$SKIP_FUNCTION =
 * makeSymbol("SKIP-FUNCTION"); $str222$Skip_function__S =
 * makeString("Skip function ~S"); $list223 =
 * ConsesLow.list((SubLObject)makeSymbol("DOCUMENTATION"),
 * (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("REAL-BODY"));
 * $sym224$_LOG_ENTER = makeSymbol("%LOG-ENTER");
 * $str225$Method__S_does_not_return = makeString("Method ~S does not return");
 * $str226$____ = makeString(" "); $sym227$_ANNOTATION =
 * makeSymbol("%ANNOTATION"); $str228$SubL = makeString("SubL"); $str229$source
 * = makeString("source"); $str230$position = makeString("position");
 * $str231$static_ = makeString("static "); $str232$final_ =
 * makeString("final "); $str233$__ = makeString("()");
 * $sym234$DEFINE_MACROEXPANDER = makeSymbol("DEFINE-MACROEXPANDER");
 * $sym235$DEFLEXICAL = makeSymbol("DEFLEXICAL"); $sym236$DEFPARAMETER =
 * makeSymbol("DEFPARAMETER"); $list237 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("ANALYSIS"));
 * $sym238$_DEFSTRUCT_CLASS = makeSymbol("%DEFSTRUCT-CLASS"); $kw239$NAME =
 * $NAME; $kw240$SLOTS = makeKeyword("SLOTS");
 * $str241$public_static_final_class__A_exte =
 * makeString("public static final class ~A extends SubLStructNative {~%");
 * $str242$_Override_public_SubLStructDecl_g =
 * makeString("@Override public SubLStructDecl getStructDecl() { return structDecl; }~%"
 * ); $str243$_Override_ = makeString("@Override ");
 * $str244$public_SubLObject_getField_A_____ =
 * makeString("public SubLObject getField~A() { return ~A; }~%");
 * $str245$public_SubLObject_setField_A_SubL =
 * makeString("public SubLObject setField~A(SubLObject value) { return ~A = value; }~%"
 * ); $str246$public_SubLObject__A___NIL___ =
 * makeString("public SubLObject ~A = NIL;~%");
 * $str247$private_static_final_SubLStructDe =
 * makeString("private static final SubLStructDeclNative structDecl =~%");
 * $str248$___ = makeString(";~%"); $sym249$JAVA_BACKEND_DEFSTRUCT_CLASS_NAME =
 * makeSymbol("JAVA-BACKEND-DEFSTRUCT-CLASS-NAME"); $str250$_ = makeString("$");
 * $str251$_native = makeString("_native");
 * $sym252$JAVA_BACKEND_DEFSTRUCT_SLOT_NAME =
 * makeSymbol("JAVA-BACKEND-DEFSTRUCT-SLOT-NAME"); $kw253$PREDICATE =
 * makeKeyword("PREDICATE"); $kw254$SLOT_KEYWORDS =
 * makeKeyword("SLOT-KEYWORDS"); $kw255$GETTERS = makeKeyword("GETTERS");
 * $kw256$SETTERS = makeKeyword("SETTERS"); $kw257$PRINT_FUNCTION =
 * makeKeyword("PRINT-FUNCTION"); $sym258$DEFAULT_STRUCT_PRINT_FUNCTION =
 * makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION"); $sym259$_FIELD =
 * makeSymbol("%FIELD"); $sym260$_IDENTIFIER = makeSymbol("%IDENTIFIER");
 * $list261 = ConsesLow.list((SubLObject)makeString("class")); $str262$String =
 * makeString("String"); $sym263$_MAKE_STRUCT_DECL_NATIVE =
 * makeSymbol("%MAKE-STRUCT-DECL-NATIVE"); $list264 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("C-STRUCTURE-TAG"), (SubLObject)makeSymbol("SIZE"),
 * (SubLObject)makeSymbol("TYPE-VAR"), (SubLObject)makeSymbol("TYPE"));
 * $sym265$_DEFSTRUCT_CONSTRUCT = makeSymbol("_DEFSTRUCT-CONSTRUCT", "SUBLISP");
 * $sym266$_NEW = makeSymbol("%NEW"); $list267 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("OBJECT"), (SubLObject)makeSymbol("INDEX"),
 * (SubLObject)makeSymbol("TYPE"), (SubLObject)makeSymbol("SLOT"));
 * $sym268$_DEFSTRUCT_GET_SLOT = makeSymbol("_DEFSTRUCT-GET-SLOT", "SUBLISP");
 * $int269$21 = makeInteger(21); $str270$getField = makeString("getField");
 * $list271 = ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("OBJECT"), (SubLObject)makeSymbol("C-STRUCTURE-TAG"),
 * (SubLObject)makeSymbol("TYPE-VAR"), (SubLObject)makeSymbol("TYPE"));
 * $sym272$_DEFSTRUCT_OBJECT_P = makeSymbol("_DEFSTRUCT-OBJECT-P", "SUBLISP");
 * $sym273$___ = makeSymbol("%=="); $list274 =
 * ConsesLow.list((SubLObject)makeString("getClass")); $list275 =
 * ConsesLow.list((SubLObject)T); $list276 =
 * ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("%PC"),
 * (SubLObject)T), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("%PC"),
 * (SubLObject)NIL)); $list277 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("OBJECT"), (SubLObject)makeSymbol("INDEX"),
 * (SubLObject)makeSymbol("VALUE"), (SubLObject)makeSymbol("TYPE"),
 * (SubLObject)makeSymbol("SLOT")); $sym278$_DEFSTRUCT_SET_SLOT =
 * makeSymbol("_DEFSTRUCT-SET-SLOT", "SUBLISP"); $str279$setField =
 * makeString("setField"); $sym280$__ = makeSymbol("%="); $sym281$DEFVAR =
 * makeSymbol("DEFVAR"); $list282 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("CONDITION"), (SubLObject)makeSymbol("TRUE-VALUE"),
 * (SubLObject)makeSymbol("FALSE-VALUE")); $str283$___ = makeString(" ? ");
 * $str284$___ = makeString(" : "); $list285 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("PCOND-CLAUSES"));
 * $sym286$PCOND = makeSymbol("PCOND"); $list287 =
 * ConsesLow.list((SubLObject)makeSymbol("PROGN")); $list288 =
 * ConsesLow.list((SubLObject)makeSymbol("FIRST-CLAUSE"),
 * (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("REST-CLAUSES"));
 * $list289 = ConsesLow.list((SubLObject)makeSymbol("TEST"),
 * (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("ACTIONS"));
 * $str290$if__ = makeString("if ("); $str291$__ = makeString(") "); $list292 =
 * ConsesLow.list((SubLObject)makeSymbol("%NC"),
 * (SubLObject)makeSymbol("%TRUE")); $str293$_else_ = makeString(" else ");
 * $str294$_else_if__ = makeString(" else if ("); $list295 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("ARGLIST")); $sym296$_PROCLAIM =
 * makeSymbol("%PROCLAIM"); $str297$SubLSpecialOperatorDeclarations_p =
 * makeString("SubLSpecialOperatorDeclarations.proclaim("); $str298$__ =
 * makeString(");"); $list299 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("BODY")); $list300 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("NAME"), (SubLObject)makeSymbol("FORMAL-ARG-LIST"));
 * $list301 = ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("RESULT")); $sym302$RET = RET;
 * $str303$final_SubLObject__currRetval___ =
 * makeString("final SubLObject $currRetval = "); $str304$_currRetval =
 * makeString("$currRetval"); $str305$return__currRetval_ =
 * makeString("return $currRetval;"); $str306$return_ = makeString("return ");
 * $list307 = ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("TEST"), (SubLObject)makeSymbol("&BODY"),
 * (SubLObject)makeSymbol("BODY")); $str308$while__ = makeString("while (");
 * $list309 = ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("EXPRESSIONS"));
 * $sym310$_AND = makeSymbol("%AND"); $str311$____ = makeString(" && ");
 * $list312 = ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)ConsesLow.list((SubLObject)makeSymbol("KEY"),
 * (SubLObject)makeSymbol("VAL"), (SubLObject)makeSymbol("TABLE-VAR"),
 * (SubLObject)makeSymbol("ITERATOR-VAR"), (SubLObject)makeSymbol("ENTRY-VAR")),
 * (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("BODY"));
 * $sym313$_CDOHASH = makeSymbol("%CDOHASH");
 * $sym314$_CDOHASH_GET_ENTRY_SET_ITERATOR =
 * makeSymbol("%CDOHASH-GET-ENTRY-SET-ITERATOR");
 * $sym315$_CDOHASH_ITERATOR_HAS_NEXT =
 * makeSymbol("%CDOHASH-ITERATOR-HAS-NEXT");
 * $sym316$_CDOHASH_ITERATOR_NEXT_ENTRY =
 * makeSymbol("%CDOHASH-ITERATOR-NEXT-ENTRY"); $list317 =
 * ConsesLow.list((SubLObject)makeString("Entry"),
 * (SubLObject)makeKeyword("FINAL")); $sym318$_CDOHASH_GET_ENTRY_KEY =
 * makeSymbol("%CDOHASH-GET-ENTRY-KEY"); $sym319$_CDOHASH_GET_ENTRY_VALUE =
 * makeSymbol("%CDOHASH-GET-ENTRY-VALUE");
 * $sym320$_CDOHASH_RELEASE_ENTRY_SET_ITERATOR =
 * makeSymbol("%CDOHASH-RELEASE-ENTRY-SET-ITERATOR"); $list321 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR")); $sym322$_ENTER =
 * makeSymbol("%ENTER"); $str323$___ENTER__ = makeString("// ENTER()"); $list324
 * = ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)ConsesLow.list((SubLObject)makeSymbol("INITIALIZATIONS"),
 * (SubLObject)makeSymbol("TEST"), (SubLObject)makeSymbol("UPDATES")),
 * (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("BODY"));
 * $sym325$_FOR = makeSymbol("%FOR"); $str326$for__ = makeString("for (");
 * $list327 =
 * (SubLList)ConsesLow.cons((SubLObject)makeSymbol("FIRST-INITIALIZATION"),
 * (SubLObject)makeSymbol("REST-INITIALIATIONS")); $str328$__ =
 * makeString("; "); $list329 =
 * (SubLList)ConsesLow.cons((SubLObject)makeSymbol("FIRST-UPDATE"),
 * (SubLObject)makeSymbol("REST-UPDATES")); $list330 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("CONSTANT-ID"),
 * (SubLObject)makeSymbol("CONSTANT-FORM")); $int331$32 = makeInteger(32);
 * $str332$_ic_S_ = makeString("$ic~S$"); $str333$ = makeString("");
 * $str334$_str = makeString("$str"); $str335$_kw = makeString("$kw");
 * $int336$64 = makeInteger(64); $str337$_sym = makeString("$sym"); $str338$_int
 * = makeString("$int"); $str339$_float = makeString("$float"); $str340$_list =
 * makeString("$list"); $str341$_char = makeString("$char"); $str342$_const =
 * makeString("$const"); $str343$_ic = makeString("$ic"); $list344 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("CONSTANT-ID"),
 * (SubLObject)makeSymbol("CONSTANT-FORM"),
 * (SubLObject)makeSymbol("LOAD-FORM")); $str345$private_static_final_ =
 * makeString("private static final "); $list346 =
 * (SubLList)ConsesLow.cons((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("ARGS")); $list347 =
 * ConsesLow.list((SubLObject)makeSymbol("LIST"),
 * (SubLObject)makeSymbol("CONS"), (SubLObject)makeSymbol("LIST"));
 * $str348$SubLList = makeString("SubLList"); $list349 =
 * ConsesLow.list((SubLObject)makeSymbol("ARG")); $str350$SubLString =
 * makeString("SubLString"); $str351$SubLInteger = makeString("SubLInteger");
 * $str352$SubLFloat = makeString("SubLFloat"); $str353$SubLCharacter =
 * makeString("SubLCharacter"); $str354$SubLPackage = makeString("SubLPackage");
 * $int355$1000 = makeInteger(1000); $str356$_CONSTANT_ =
 * makeString("_CONSTANT-"); $str357$_INITIALIZER = makeString("-INITIALIZER");
 * $list358 = ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("OBJECT")); $sym359$_CSTRING = makeSymbol("%CSTRING");
 * $sym360$_CFIX = makeSymbol("%CFIX"); $sym361$_CBIG = makeSymbol("%CBIG");
 * $sym362$_CFLOAT = makeSymbol("%CFLOAT"); $sym363$_CCHAR =
 * makeSymbol("%CCHAR"); $sym364$_CPACKAGE = makeSymbol("%CPACKAGE");
 * $sym365$_CGUID = makeSymbol("%CGUID"); $str366$Time_to_add__LF_support_for__S
 * = makeString("Time to add %LF support for ~S"); $int367$31 = makeInteger(31);
 * $list368 = ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("VARIABLE"), (SubLObject)makeSymbol("&OPTIONAL"),
 * (SubLObject)ConsesLow.list((SubLObject)makeSymbol("INITIALIZATION"),
 * (SubLObject)NIL, (SubLObject)makeSymbol("INITIALIZED?")),
 * (SubLObject)makeSymbol("TYPE"), (SubLObject)makeSymbol("FINAL?")); $list369 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("EXPRESSION")); $sym370$MULTIPLE_VALUE_LIST =
 * makeSymbol("MULTIPLE-VALUE-LIST"); $sym371$_ARG2 = makeSymbol("%ARG2");
 * $list372 = ConsesLow.list((SubLObject)makeSymbol("%RESET-MVAL"));
 * $sym373$_MULTIPLE_VALUE_LIST = makeSymbol("%MULTIPLE-VALUE-LIST");
 * $sym374$_NC = makeSymbol("%NC"); $sym375$_TRUE = makeSymbol("%TRUE");
 * $str376$true = makeString("true"); $sym377$_FALSE = makeSymbol("%FALSE");
 * $str378$false = makeString("false"); $sym379$_NULL = makeSymbol("%NULL");
 * $str380$null = makeString("null"); $sym381$_UNPROVIDED =
 * makeSymbol("%UNPROVIDED"); $sym382$_EMPTY_ARRAY = makeSymbol("%EMPTY-ARRAY");
 * $str383$EMPTY_SUBL_OBJECT_ARRAY = makeString("EMPTY_SUBL_OBJECT_ARRAY");
 * $str384$Unexpected_native_constant__S =
 * makeString("Unexpected native constant ~S"); $sym385$_NOT =
 * makeSymbol("%NOT"); $str386$___ = makeString("(!("); $str387$__ =
 * makeString("))"); $sym388$_DTB = makeSymbol("%DTB"); $list389 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("N"), (SubLObject)makeSymbol("EXPRESSION"));
 * $sym390$NTH_VALUE = makeSymbol("NTH-VALUE"); $sym391$_NTH_VALUE_STEP_2 =
 * makeSymbol("%NTH-VALUE-STEP-2"); $sym392$_NTH_VALUE_STEP_1 =
 * makeSymbol("%NTH-VALUE-STEP-1"); $sym393$_OR = makeSymbol("%OR"); $list394 =
 * ConsesLow.list((SubLObject)makeSymbol("%NC"),
 * (SubLObject)makeSymbol("%FALSE")); $str395$___ = makeString("|| "); $list396
 * = ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("REQUIRED-COUNT"),
 * (SubLObject)makeSymbol("OPTIONAL-COUNT"), (SubLObject)makeSymbol("REST?"));
 * $sym397$_REGISTER_FUNCTION = makeSymbol("%REGISTER-FUNCTION");
 * $str398$declareFunction = makeString("declareFunction("); $str399$myName =
 * makeString("myName"); $list400 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("DEFINER"), (SubLObject)makeSymbol("GLOBAL"),
 * (SubLObject)makeSymbol("INITIALIZATION")); $sym401$_REGISTER_GLOBAL =
 * makeSymbol("%REGISTER-GLOBAL"); $str402$defvar = makeString("defvar");
 * $str403$defparameter = makeString("defparameter"); $str404$deflexical =
 * makeString("deflexical"); $str405$defconstant = makeString("defconstant");
 * $str406$Unexpected_definer__S = makeString("Unexpected definer ~S"); $list407
 * = ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("FUNCTION")); $sym408$_REGISTER_MACRO =
 * makeSymbol("%REGISTER-MACRO"); $str409$declareMacro =
 * makeString("declareMacro"); $list410 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("THREAD-VAR"), (SubLObject)makeSymbol("&BODY"),
 * (SubLObject)makeSymbol("BODY")); $list411 =
 * ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol(
 * "%CURRENT-THREAD")), (SubLObject)makeString("SubLThread"),
 * (SubLObject)makeKeyword("FINAL")); $list412 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)ConsesLow.list((SubLObject)makeSymbol("HANDLER"),
 * (SubLObject)makeSymbol("CATCH-VAR"), (SubLObject)makeSymbol("ERROR-VAR")),
 * (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("BODY"));
 * $sym413$_WITH_ERROR_HANDLER = makeSymbol("%WITH-ERROR-HANDLER");
 * $sym414$_ERROR_HANDLER_ = makeSymbol("ERROR-HANDLER"); $list415 =
 * ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("%PC"),
 * (SubLObject)NIL)); $list416 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("ENV-VAR"), (SubLObject)makeSymbol("RESULT-VAR"),
 * (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("BODY"));
 * $sym417$_WITH_PROCESS_RESOURCE_TRACKING =
 * makeSymbol("%WITH-PROCESS-RESOURCE-TRACKING"); $list418 =
 * ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol(
 * "GET-INTERNAL-REAL-TIME")));
 * $sym419$_COMPUTE_WITH_PROCESS_RESOURCE_TRACKING_RESULTS =
 * makeSymbol("%COMPUTE-WITH-PROCESS-RESOURCE-TRACKING-RESULTS"); $list420 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("PLACE"), (SubLObject)makeSymbol("EXPRESSION"));
 * $sym421$_TRANSLATE_EQ_AS_EQL_ = makeSymbol("TRANSLATE-EQ-AS-EQL"); $list422 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("EXPRESSION1"), (SubLObject)makeSymbol("EXPRESSION2"),
 * (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("FORCE-NATIVE"));
 * $sym423$NULL = makeSymbol("NULL"); $str424$____ = makeString(" == ");
 * $str425$_eql_ = makeString(".eql("); $str426$____ = makeString(" != ");
 * $str427$_ = makeString("!"); $list428 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("INTERFACE"), (SubLObject)makeSymbol("&OPTIONAL"),
 * (SubLObject)makeSymbol("SLOT-VALUE-TUPLES")); $str429$_ = makeString("@");
 * $list430 = ConsesLow.list((SubLObject)makeSymbol("SLOT"),
 * (SubLObject)makeSymbol("VALUE")); $list431 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("CONDITION"), (SubLObject)makeSymbol("&OPTIONAL"),
 * (SubLObject)makeSymbol("ERROR-OBJECT")); $str432$assert_ =
 * makeString("assert "); $list433 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("SYMBOL"), (SubLObject)makeSymbol("EXPRESSION"));
 * $str434$bind = makeString("bind"); $list435 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("TYPE"), (SubLObject)makeSymbol("EXPRESSION"));
 * $str436$__ = makeString("(("); $list437 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("SYMBOL")); $str438$currentBinding =
 * makeString("currentBinding"); $list439 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("OBJECT"), (SubLObject)makeSymbol("FIELD")); $list440
 * = ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("NAME")); $list441 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("VARIABLE"), (SubLObject)makeSymbol("DEFAULT"));
 * $sym442$_INIT_OPT_ARG = makeSymbol("%INIT-OPT-ARG"); $list443 =
 * ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("%NC"),
 * (SubLObject)makeSymbol("%UNPROVIDED"))); $list444 =
 * ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((
 * SubLObject)makeSymbol("%NC"), (SubLObject)makeSymbol("%TRUE")))); $list445 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("OBJECT"), (SubLObject)makeSymbol("CLASS-NAME"));
 * $sym446$_INSTANCEOF = makeSymbol("%INSTANCEOF"); $str447$_instanceof_ =
 * makeString(" instanceof "); $list448 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("GLOBAL")); $sym449$_DYN = makeSymbol("%DYN");
 * $str450$getDynamicValue = makeString("getDynamicValue"); $list451 =
 * ConsesLow.list((SubLObject)makeString("getDynamicValue")); $sym452$_LEX =
 * makeSymbol("%LEX"); $list453 =
 * ConsesLow.list((SubLObject)makeString("getGlobalValue")); $list454 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("GLOBAL"), (SubLObject)makeSymbol("VALUE"));
 * $str455$setDynamicValue = makeString("setDynamicValue");
 * $str456$setGlobalValue = makeString("setGlobalValue"); $list457 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("OBJECT"), (SubLObject)makeSymbol("METHOD"),
 * (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("ARGS")); $list458 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("N")); $sym459$_MVAL = makeSymbol("%MVAL"); $list460 =
 * ConsesLow.list((SubLObject)makeSymbol("%PC"), (SubLObject)ZERO_INTEGER);
 * $list461 = ConsesLow.list((SubLObject)makeString("firstMultipleValue"));
 * $list462 = ConsesLow.list((SubLObject)makeSymbol("%PC"),
 * (SubLObject)ONE_INTEGER); $list463 =
 * ConsesLow.list((SubLObject)makeString("secondMultipleValue")); $list464 =
 * ConsesLow.list((SubLObject)makeSymbol("%PC"), (SubLObject)TWO_INTEGER);
 * $list465 = ConsesLow.list((SubLObject)makeString("thirdMultipleValue"));
 * $list466 = ConsesLow.list((SubLObject)makeSymbol("%PC"),
 * (SubLObject)THREE_INTEGER); $list467 =
 * ConsesLow.list((SubLObject)makeString("fourthMultipleValue")); $list468 =
 * ConsesLow.list((SubLObject)makeSymbol("%PC"), (SubLObject)FOUR_INTEGER);
 * $list469 = ConsesLow.list((SubLObject)makeString("fifthMultipleValue"));
 * $list470 = ConsesLow.list((SubLObject)makeSymbol("%PC"),
 * (SubLObject)FIVE_INTEGER); $list471 =
 * ConsesLow.list((SubLObject)makeString("sixthMultipleValue")); $list472 =
 * ConsesLow.list((SubLObject)makeSymbol("%PC"), (SubLObject)SIX_INTEGER);
 * $list473 = ConsesLow.list((SubLObject)makeString("seventhMultipleValue"));
 * $list474 = ConsesLow.list((SubLObject)makeSymbol("%PC"),
 * (SubLObject)SEVEN_INTEGER); $list475 =
 * ConsesLow.list((SubLObject)makeString("eighthMultipleValue")); $list476 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("CLASS-NAME"), (SubLObject)makeSymbol("&REST"),
 * (SubLObject)makeSymbol("ARGS")); $str477$new_ = makeString("new "); $list478
 * = ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("CLASS-NAME"), (SubLObject)makeSymbol("&OPTIONAL"),
 * (SubLObject)makeSymbol("ELEMENTS")); $str479$____ = makeString("[] {");
 * $list480 = ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("VARIABLE")); $sym481$_NOTE_SUPPLIED =
 * makeSymbol("%NOTE-SUPPLIED"); $sym482$_BTD = makeSymbol("%BTD"); $list483 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("SYMBOL"), (SubLObject)makeSymbol("OLD-VALUE"));
 * $str484$rebind = makeString("rebind"); $sym485$_RESET_MVAL =
 * makeSymbol("%RESET-MVAL"); $list486 =
 * ConsesLow.list((SubLObject)makeString("resetMultipleValues")); $sym487$_THROW
 * = makeSymbol("%THROW"); $str488$throw_ = makeString("throw "); $list489 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("TRY-FORM"), (SubLObject)makeSymbol("CATCH-CLAUSES"),
 * (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("BODY"));
 * $str490$try_ = makeString("try "); $str491$_finally_ =
 * makeString(" finally "); $list492 =
 * ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("TYPE"),
 * (SubLObject)makeSymbol("VARIABLE")), (SubLObject)makeSymbol("&BODY"),
 * (SubLObject)makeSymbol("BODY")); $str493$_catch__ = makeString(" catch (");
 * $list494 = ConsesLow.list((SubLObject)makeSymbol("TRY-FORM"),
 * (SubLObject)makeSymbol("CATCH-CLAUSES"), (SubLObject)makeSymbol("&BODY"),
 * (SubLObject)makeSymbol("BODY")); $str495$Time_to_support_non_null_catch_cl =
 * makeString("Time to support non-null catch-clauses"); $sym496$CUNWIND_PROTECT
 * = makeSymbol("CUNWIND-PROTECT"); $str497$___public_static_final_class__A_e =
 * makeString("\n  public static final class ~A extends UnaryFunction {\n    public ~A() { super(extractFunctionNamed(~S)); }\n    @Override public SubLObject processItem(SubLObject ~A) { return ~A; }\n  }"
 * ); $sym498$SYMBOLP = makeSymbol("SYMBOLP"); $sym499$ARG1 =
 * makeSymbol("ARG1"); $str500$__new__A__ = makeString("; new ~A()");
 * $sym501$JAVA_BACKEND_UNARY_FUNCTION_CLASS_NAME =
 * makeSymbol("JAVA-BACKEND-UNARY-FUNCTION-CLASS-NAME"); $str502$_UnaryFunction
 * = makeString("$UnaryFunction"); $list503 =
 * ConsesLow.list((SubLObject)makeSymbol("ARG1"));
 * $str504$___public_static_final_class__A_e =
 * makeString("\n  public static final class ~A extends BinaryFunction {\n    public ~A() { super(extractFunctionNamed(~S)); }\n    @Override public SubLObject processItem(SubLObject ~A, SubLObject ~A) { return ~A; }\n  }"
 * ); $sym505$ARG2 = makeSymbol("ARG2"); $str506$______new__A__ =
 * makeString(";\n    new ~A()");
 * $sym507$JAVA_BACKEND_BINARY_FUNCTION_CLASS_NAME =
 * makeSymbol("JAVA-BACKEND-BINARY-FUNCTION-CLASS-NAME");
 * $str508$_BinaryFunction = makeString("$BinaryFunction"); $list509 =
 * ConsesLow.list((SubLObject)makeSymbol("ARG1"),
 * (SubLObject)makeSymbol("ARG2")); $str510$___public_static_final_class__A_e =
 * makeString("\n  public static final class ~A extends ZeroArityFunction {\n    public ~A() { super(extractFunctionNamed(~S)); }\n    @Override public SubLObject processItem() { return ~A; }\n  }"
 * ); $str511$_______new__A__ = makeString("; \n    new ~A()");
 * $sym512$JAVA_BACKEND_ZERO_ARITY_FUNCTION_CLASS_NAME =
 * makeSymbol("JAVA-BACKEND-ZERO-ARITY-FUNCTION-CLASS-NAME");
 * $str513$_ZeroArityFunction = makeString("$ZeroArityFunction");
 * $str514$_dev_null = makeString("/dev/null"); $str515$java =
 * makeString("java"); $str516$______preparePercentProgress__A__ =
 * makeString("~%    preparePercentProgress(~A);~%");
 * $str517$______initializeClass___A___ =
 * makeString("~%    initializeClass(\"~A\");");
 * $str518$________finishPercentProgress____ =
 * makeString("~%~%    finishPercentProgress();~%"); $str519$filelist =
 * makeString("filelist"); $str520$text = makeString("text");
 * $str521$com_cyc_cycjava_cycl_cycl = makeString("com.cyc.cycjava.cycl.cycl");
 * $str522$_java = makeString(".java");
 * $str523$__package_com_cyc_cycjava_cycl___ = makeString("\n\npackage
 * com.cyc.cycjava.cycl;\n\nimport
 * com.cyc.tool.subl.util.InitializingSubLFile;\nimport
 * com.cyc.tool.subl.util.SubLFile;\nimport
 * com.cyc.tool.subl.util.SubLFiles;\n\npublic class cycl extends
 * InitializingSubLFile {\n \n //// Constructors\n \n Creates a new instance of
 * cycl.
 */
