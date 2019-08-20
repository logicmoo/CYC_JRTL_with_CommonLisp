/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.control_vars.$read_require_constant_exists$;
import static com.cyc.cycjava.cycl.control_vars.$sublisp_package$;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.pointer;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.$package$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.find_package;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.keywordp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.symbolp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.type_of;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_case$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print_not_readable;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$read_default_float_format$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.file_position;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      FILE-TRANSLATION
 * source file: /cyc/top/cycl/file-translation.lisp
 * created:     2019/07/03 17:39:07
 */
public final class file_translation extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new file_translation();



    // defparameter
    // Definitions
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $current_ts_file$ = makeSymbol("*CURRENT-TS-FILE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_trans_subl_file$ = makeSymbol("*DTP-TRANS-SUBL-FILE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $trans_subl_global_definers$ = makeSymbol("*TRANS-SUBL-GLOBAL-DEFINERS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $predefined_constants$ = makeSymbol("*PREDEFINED-CONSTANTS*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol TRANS_SUBL_FILE = makeSymbol("TRANS-SUBL-FILE");

    private static final SubLSymbol TRANS_SUBL_FILE_P = makeSymbol("TRANS-SUBL-FILE-P");

    static private final SubLList $list2 = list(new SubLObject[]{ makeSymbol("MODULE-NAME"), makeSymbol("FILENAME"), makeSymbol("INTERNAL-CONSTANTS"), makeSymbol("REFERENCED-GLOBALS"), makeSymbol("REFERENCED-FUNCTIONS"), makeSymbol("DEFINITIONS"), makeSymbol("TOP-LEVEL-FORMS"), makeSymbol("DEFINED-GLOBALS"), makeSymbol("DEFINED-FUNCTIONS"), makeSymbol("DEFINED-MACROS"), makeSymbol("ARGLIST-TABLE"), makeSymbol("BINDING-TYPE-TABLE"), makeSymbol("METHOD-VISIBILITY-TABLE"), makeSymbol("GLOBAL-VISIBILITY-TABLE"), makeSymbol("RWBC-METHODS") });

    static private final SubLList $list3 = list(new SubLObject[]{ makeKeyword("MODULE-NAME"), makeKeyword("FILENAME"), makeKeyword("INTERNAL-CONSTANTS"), makeKeyword("REFERENCED-GLOBALS"), makeKeyword("REFERENCED-FUNCTIONS"), makeKeyword("DEFINITIONS"), makeKeyword("TOP-LEVEL-FORMS"), makeKeyword("DEFINED-GLOBALS"), makeKeyword("DEFINED-FUNCTIONS"), makeKeyword("DEFINED-MACROS"), makeKeyword("ARGLIST-TABLE"), makeKeyword("BINDING-TYPE-TABLE"), makeKeyword("METHOD-VISIBILITY-TABLE"), makeKeyword("GLOBAL-VISIBILITY-TABLE"), makeKeyword("RWBC-METHODS") });

    static private final SubLList $list4 = list(new SubLObject[]{ makeSymbol("TSF-MODULE-NAME"), makeSymbol("TSF-FILENAME"), makeSymbol("TSF-INTERNAL-CONSTANTS"), makeSymbol("TSF-REFERENCED-GLOBALS"), makeSymbol("TSF-REFERENCED-FUNCTIONS"), makeSymbol("TSF-DEFINITIONS"), makeSymbol("TSF-TOP-LEVEL-FORMS"), makeSymbol("TSF-DEFINED-GLOBALS"), makeSymbol("TSF-DEFINED-FUNCTIONS"), makeSymbol("TSF-DEFINED-MACROS"), makeSymbol("TSF-ARGLIST-TABLE"), makeSymbol("TSF-BINDING-TYPE-TABLE"), makeSymbol("TSF-METHOD-VISIBILITY-TABLE"), makeSymbol("TSF-GLOBAL-VISIBILITY-TABLE"), makeSymbol("TSF-RWBC-METHODS") });

    static private final SubLList $list5 = list(new SubLObject[]{ makeSymbol("_CSETF-TSF-MODULE-NAME"), makeSymbol("_CSETF-TSF-FILENAME"), makeSymbol("_CSETF-TSF-INTERNAL-CONSTANTS"), makeSymbol("_CSETF-TSF-REFERENCED-GLOBALS"), makeSymbol("_CSETF-TSF-REFERENCED-FUNCTIONS"), makeSymbol("_CSETF-TSF-DEFINITIONS"), makeSymbol("_CSETF-TSF-TOP-LEVEL-FORMS"), makeSymbol("_CSETF-TSF-DEFINED-GLOBALS"), makeSymbol("_CSETF-TSF-DEFINED-FUNCTIONS"), makeSymbol("_CSETF-TSF-DEFINED-MACROS"), makeSymbol("_CSETF-TSF-ARGLIST-TABLE"), makeSymbol("_CSETF-TSF-BINDING-TYPE-TABLE"), makeSymbol("_CSETF-TSF-METHOD-VISIBILITY-TABLE"), makeSymbol("_CSETF-TSF-GLOBAL-VISIBILITY-TABLE"), makeSymbol("_CSETF-TSF-RWBC-METHODS") });

    private static final SubLSymbol PRINT_TRANS_SUBL_FILE = makeSymbol("PRINT-TRANS-SUBL-FILE");

    private static final SubLSymbol TRANS_SUBL_FILE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TRANS-SUBL-FILE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("TRANS-SUBL-FILE-P"));

    private static final SubLSymbol TSF_MODULE_NAME = makeSymbol("TSF-MODULE-NAME");

    private static final SubLSymbol _CSETF_TSF_MODULE_NAME = makeSymbol("_CSETF-TSF-MODULE-NAME");

    private static final SubLSymbol TSF_FILENAME = makeSymbol("TSF-FILENAME");

    private static final SubLSymbol _CSETF_TSF_FILENAME = makeSymbol("_CSETF-TSF-FILENAME");

    private static final SubLSymbol TSF_INTERNAL_CONSTANTS = makeSymbol("TSF-INTERNAL-CONSTANTS");

    private static final SubLSymbol _CSETF_TSF_INTERNAL_CONSTANTS = makeSymbol("_CSETF-TSF-INTERNAL-CONSTANTS");

    private static final SubLSymbol TSF_REFERENCED_GLOBALS = makeSymbol("TSF-REFERENCED-GLOBALS");

    private static final SubLSymbol _CSETF_TSF_REFERENCED_GLOBALS = makeSymbol("_CSETF-TSF-REFERENCED-GLOBALS");

    private static final SubLSymbol TSF_REFERENCED_FUNCTIONS = makeSymbol("TSF-REFERENCED-FUNCTIONS");

    private static final SubLSymbol _CSETF_TSF_REFERENCED_FUNCTIONS = makeSymbol("_CSETF-TSF-REFERENCED-FUNCTIONS");

    private static final SubLSymbol TSF_DEFINITIONS = makeSymbol("TSF-DEFINITIONS");

    private static final SubLSymbol _CSETF_TSF_DEFINITIONS = makeSymbol("_CSETF-TSF-DEFINITIONS");

    private static final SubLSymbol TSF_TOP_LEVEL_FORMS = makeSymbol("TSF-TOP-LEVEL-FORMS");

    private static final SubLSymbol _CSETF_TSF_TOP_LEVEL_FORMS = makeSymbol("_CSETF-TSF-TOP-LEVEL-FORMS");

    private static final SubLSymbol TSF_DEFINED_GLOBALS = makeSymbol("TSF-DEFINED-GLOBALS");

    private static final SubLSymbol _CSETF_TSF_DEFINED_GLOBALS = makeSymbol("_CSETF-TSF-DEFINED-GLOBALS");

    private static final SubLSymbol TSF_DEFINED_FUNCTIONS = makeSymbol("TSF-DEFINED-FUNCTIONS");

    private static final SubLSymbol _CSETF_TSF_DEFINED_FUNCTIONS = makeSymbol("_CSETF-TSF-DEFINED-FUNCTIONS");

    private static final SubLSymbol TSF_DEFINED_MACROS = makeSymbol("TSF-DEFINED-MACROS");

    private static final SubLSymbol _CSETF_TSF_DEFINED_MACROS = makeSymbol("_CSETF-TSF-DEFINED-MACROS");

    private static final SubLSymbol TSF_ARGLIST_TABLE = makeSymbol("TSF-ARGLIST-TABLE");

    private static final SubLSymbol _CSETF_TSF_ARGLIST_TABLE = makeSymbol("_CSETF-TSF-ARGLIST-TABLE");

    private static final SubLSymbol TSF_BINDING_TYPE_TABLE = makeSymbol("TSF-BINDING-TYPE-TABLE");

    private static final SubLSymbol _CSETF_TSF_BINDING_TYPE_TABLE = makeSymbol("_CSETF-TSF-BINDING-TYPE-TABLE");

    private static final SubLSymbol TSF_METHOD_VISIBILITY_TABLE = makeSymbol("TSF-METHOD-VISIBILITY-TABLE");

    private static final SubLSymbol _CSETF_TSF_METHOD_VISIBILITY_TABLE = makeSymbol("_CSETF-TSF-METHOD-VISIBILITY-TABLE");

    private static final SubLSymbol TSF_GLOBAL_VISIBILITY_TABLE = makeSymbol("TSF-GLOBAL-VISIBILITY-TABLE");

    private static final SubLSymbol _CSETF_TSF_GLOBAL_VISIBILITY_TABLE = makeSymbol("_CSETF-TSF-GLOBAL-VISIBILITY-TABLE");

    private static final SubLSymbol TSF_RWBC_METHODS = makeSymbol("TSF-RWBC-METHODS");

    private static final SubLSymbol _CSETF_TSF_RWBC_METHODS = makeSymbol("_CSETF-TSF-RWBC-METHODS");

    private static final SubLSymbol $TOP_LEVEL_FORMS = makeKeyword("TOP-LEVEL-FORMS");

    private static final SubLSymbol $BINDING_TYPE_TABLE = makeKeyword("BINDING-TYPE-TABLE");

    private static final SubLSymbol $METHOD_VISIBILITY_TABLE = makeKeyword("METHOD-VISIBILITY-TABLE");

    private static final SubLSymbol $GLOBAL_VISIBILITY_TABLE = makeKeyword("GLOBAL-VISIBILITY-TABLE");

    private static final SubLString $str54$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_TRANS_SUBL_FILE = makeSymbol("MAKE-TRANS-SUBL-FILE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_TRANS_SUBL_FILE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-TRANS-SUBL-FILE-METHOD");

    private static final SubLSymbol SXHASH_TRANS_SUBL_FILE_METHOD = makeSymbol("SXHASH-TRANS-SUBL-FILE-METHOD");

    private static final SubLSymbol $sym63$_ = makeSymbol("<");

    private static final SubLList $list70 = list(makeSymbol("DEFCONSTANT"), makeSymbol("DEFLEXICAL"), makeSymbol("DEFGLOBAL"), makeSymbol("DEFPARAMETER"), makeSymbol("DEFVAR"));

    private static final SubLList $list71 = list(makeSymbol("DEFINER"), makeSymbol("GLOBAL"), makeSymbol("&OPTIONAL"), makeSymbol("INIT-FORM"), makeSymbol("DOCUMENTATION"));

    private static final SubLList $list72 = list(list(makeSymbol("STREAM-VAR"), makeSymbol("FILENAME")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym73$FILENAME_VAR = makeUninternedSymbol("FILENAME-VAR");

    private static final SubLSymbol WITH_STREAM_BUFFER_SIZE = makeSymbol("WITH-STREAM-BUFFER-SIZE");

    private static final SubLList $list75 = list(makeInteger(1048576));

    private static final SubLList $list78 = list(makeKeyword("OUTPUT"));

    private static final SubLString $str79$_dev_null = makeString("/dev/null");

    private static final SubLString $str82$___Trans_SubL_File____S = makeString(";; Trans SubL File : ~S");

    private static final SubLString $str83$_____Location___________S = makeString("~%;; Location        : ~S");

    private static final SubLString $str84$_______Referenced_Globals__ = makeString("~%~%;; Referenced Globals :");

    private static final SubLString $str85$_______Referenced_Functions__ = makeString("~%~%;; Referenced Functions :");

    private static final SubLString $str86$_______Internal_Constants__ = makeString("~%~%;; Internal Constants :");

    private static final SubLList $list87 = cons(makeSymbol("CONSTANT"), makeSymbol("INTERNAL-ID"));

    private static final SubLString $str88$___S____S = makeString("~%~S : ~S");

    private static final SubLString $str89$_______Definitions__ = makeString("~%~%;; Definitions :");

    private static final SubLSymbol $sym90$_OPTIONAL = makeSymbol("&OPTIONAL");

    private static final SubLSymbol $sym91$_REST = makeSymbol("&REST");

    private static final SubLSymbol $sym92$_PC = makeSymbol("%PC");

    private static final SubLSymbol $sym93$_IC = makeSymbol("%IC");

    private static final SubLString $str98$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLSymbol DEFINE_MACROEXPANDER = makeSymbol("DEFINE-MACROEXPANDER");

    private static final SubLSymbol $sym108$_DEFSTRUCT_CLASS = makeSymbol("%DEFSTRUCT-CLASS");

    private static final SubLList $list111 = cons(makeSymbol("CONSTANT-FORM"), makeSymbol("INTERNAL-ID"));

    private static final SubLSymbol $sym112$_INTERNAL_CONSTANT = makeSymbol("%INTERNAL-CONSTANT");

    private static final SubLList $list113 = list(makeSymbol("OPERATOR"), makeSymbol("NAME"), makeSymbol("&REST"), makeSymbol("REST"));

    private static final SubLSymbol $sym114$_REGISTER_MACRO = makeSymbol("%REGISTER-MACRO");

    private static final SubLList $list115 = list(makeSymbol("ARGLIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym116$_REGISTER_FUNCTION = makeSymbol("%REGISTER-FUNCTION");

    private static final SubLList $list117 = list(makeSymbol("INITIALIZATION"), makeSymbol("&OPTIONAL"), makeSymbol("DOCUMENTATION"));

    private static final SubLSymbol $sym118$_REGISTER_GLOBAL = makeSymbol("%REGISTER-GLOBAL");

    private static final SubLString $str119$DECLARE_ = makeString("DECLARE-");

    private static final SubLString $str120$_FILE = makeString("-FILE");

    private static final SubLString $str122$INIT_ = makeString("INIT-");

    private static final SubLString $str123$SETUP_ = makeString("SETUP-");

    private static final SubLSymbol $sym127$LIST_ = makeSymbol("LIST*");

    private static final SubLSymbol READER_MAKE_CONSTANT_SHELL = makeSymbol("READER-MAKE-CONSTANT-SHELL");

    private static final SubLSymbol $sym130$_LF = makeSymbol("%LF");

    private static final SubLString $str131$Time_to_implement_function_consta = makeString("Time to implement function constant translation for ~S");

    private static final SubLList $list132 = list(new SubLObject[]{ T, NIL, EQ, EQL, EQUAL, EQUALP, IDENTITY, MINUS_ONE_INTEGER, ZERO_INTEGER, ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER, ELEVEN_INTEGER, TWELVE_INTEGER, THIRTEEN_INTEGER, FOURTEEN_INTEGER, FIFTEEN_INTEGER, SIXTEEN_INTEGER, SEVENTEEN_INTEGER, EIGHTEEN_INTEGER, NINETEEN_INTEGER, TWENTY_INTEGER, CHAR_null, CHAR_backspace, CHAR_tab, CHAR_newline, CHAR_return, CHAR_page, CHAR_escape, CHAR_space, CHAR_exclamation, CHAR_quotation, CHAR_hash, CHAR_dollar, CHAR_percent, CHAR_ampersand, CHAR_quote, CHAR_lparen, CHAR_rparen, CHAR_asterisk, CHAR_plus, CHAR_comma, CHAR_hyphen, CHAR_period, CHAR_slash, CHAR_0, CHAR_1, CHAR_2, CHAR_3, CHAR_4, CHAR_5, CHAR_6, CHAR_7, CHAR_8, CHAR_9, CHAR_colon, CHAR_semicolon, CHAR_less, CHAR_equal, CHAR_greater, CHAR_question, CHAR_at, CHAR_A, CHAR_B, CHAR_C, CHAR_D, CHAR_E, CHAR_F, CHAR_G, CHAR_H, CHAR_I, CHAR_J, CHAR_K, CHAR_L, CHAR_M, CHAR_N, CHAR_O, CHAR_P, CHAR_Q, CHAR_R, CHAR_S, CHAR_T, CHAR_U, CHAR_V, CHAR_W, CHAR_X, CHAR_Y, CHAR_Z, CHAR_lbracket, CHAR_backslash, CHAR_rbracket, CHAR_caret, CHAR_underbar, CHAR_backquote, CHAR_a, CHAR_b, CHAR_c, CHAR_d, CHAR_e, CHAR_f, CHAR_g, CHAR_h, CHAR_i, CHAR_j, CHAR_k, CHAR_l, CHAR_m, CHAR_n, CHAR_o, CHAR_p, CHAR_q, CHAR_r, CHAR_s, CHAR_t, CHAR_u, CHAR_v, CHAR_w, CHAR_x, CHAR_y, CHAR_z, CHAR_lbrace, CHAR_vertical, CHAR_rbrace, CHAR_tilde, CHAR_rubout });

    private static final SubLSymbol FUNCTION_ARGLIST_SIGNATURE_INFO = makeSymbol("FUNCTION-ARGLIST-SIGNATURE-INFO");

    private static final SubLList $list140 = list(new SubLObject[]{ list(list(NIL), ZERO_INTEGER, ZERO_INTEGER, NIL), list(list(list(makeSymbol("X"))), ONE_INTEGER, ZERO_INTEGER, NIL), list(list(list(makeSymbol("X"), makeSymbol("&OPTIONAL"), makeSymbol("Y"))), ONE_INTEGER, ONE_INTEGER, NIL), list(list(list(makeSymbol("X"), makeSymbol("&OPTIONAL"), makeSymbol("Y"), makeSymbol("&REST"), makeSymbol("REST"))), ONE_INTEGER, ONE_INTEGER, T), list(list(list(makeSymbol("X"), makeSymbol("&REST"), makeSymbol("REST"))), ONE_INTEGER, ZERO_INTEGER, T), list(list(list(makeSymbol("X"), makeSymbol("A"), makeSymbol("B"), makeSymbol("C"), makeSymbol("&REST"), makeSymbol("REST"))), FOUR_INTEGER, ZERO_INTEGER, T), list(list(list(new SubLObject[]{ makeSymbol("X"), makeSymbol("A"), makeSymbol("B"), makeSymbol("C"), makeSymbol("&OPTIONAL"), makeSymbol("J"), makeSymbol("K"), makeSymbol("L"), makeSymbol("&REST"), makeSymbol("REST") })), FOUR_INTEGER, THREE_INTEGER, T), list(list(list(makeSymbol("X"), makeSymbol("A"), makeSymbol("B"), makeSymbol("C"), makeSymbol("&OPTIONAL"), makeSymbol("J"), makeSymbol("K"), makeSymbol("L"))), FOUR_INTEGER, THREE_INTEGER, NIL), list(list(list(makeSymbol("&REST"), makeSymbol("REST"))), ZERO_INTEGER, ZERO_INTEGER, T) });

    private static final SubLSymbol TRANSLATE_CONSTANT_INITIALIZATION_FORM = makeSymbol("TRANSLATE-CONSTANT-INITIALIZATION-FORM");

    private static final SubLList $list142 = list(new SubLObject[]{ list(list(makeInteger(212)), list(makeSymbol("%LF"), makeInteger(212))), list(list(makeDouble(1.0)), list(makeSymbol("%LF"), makeDouble(1.0))), list(list($TEST), list(makeSymbol("%LF"), $TEST)), list(list(makeString("test")), list(makeSymbol("%LF"), makeString("test"))), list(list(makeSymbol("X")), list(makeSymbol("%LF"), makeSymbol("X"))), list(list(NIL), list(makeSymbol("%PC"), NIL)), list(list(list(ONE_INTEGER)), list(makeSymbol("LIST"), list(makeSymbol("%PC"), ONE_INTEGER))), list(list(list(ONE_INTEGER, TWO_INTEGER)), list(makeSymbol("LIST"), list(makeSymbol("%PC"), ONE_INTEGER), list(makeSymbol("%PC"), TWO_INTEGER))), list(list(cons(ONE_INTEGER, TWO_INTEGER)), list(makeSymbol("CONS"), list(makeSymbol("%PC"), ONE_INTEGER), list(makeSymbol("%PC"), TWO_INTEGER))), list(list(list(ONE_INTEGER, TWO_INTEGER, THREE_INTEGER)), list(makeSymbol("LIST"), list(makeSymbol("%PC"), ONE_INTEGER), list(makeSymbol("%PC"), TWO_INTEGER), list(makeSymbol("%PC"), THREE_INTEGER))), list(list(listS(ONE_INTEGER, TWO_INTEGER, THREE_INTEGER)), list(makeSymbol("LIST*"), list(makeSymbol("%PC"), ONE_INTEGER), list(makeSymbol("%PC"), TWO_INTEGER), list(makeSymbol("%PC"), THREE_INTEGER))) });

    public static final SubLObject current_ts_file_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $current_ts_file$.getDynamicValue(thread);
        }
    }

    public static SubLObject current_ts_file() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $current_ts_file$.getDynamicValue(thread);
    }

    public static final SubLObject trans_subl_file_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_trans_subl_file(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject trans_subl_file_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_trans_subl_file(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject trans_subl_file_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.file_translation.$trans_subl_file_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject trans_subl_file_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.file_translation.$trans_subl_file_native.class ? T : NIL;
    }

    public static final SubLObject tsf_module_name_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TRANS_SUBL_FILE_P);
        return v_object.getField2();
    }

    public static SubLObject tsf_module_name(final SubLObject v_object) {
        assert NIL != trans_subl_file_p(v_object) : "! file_translation.trans_subl_file_p(v_object) " + "file_translation.trans_subl_file_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject tsf_filename_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TRANS_SUBL_FILE_P);
        return v_object.getField3();
    }

    public static SubLObject tsf_filename(final SubLObject v_object) {
        assert NIL != trans_subl_file_p(v_object) : "! file_translation.trans_subl_file_p(v_object) " + "file_translation.trans_subl_file_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject tsf_internal_constants_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TRANS_SUBL_FILE_P);
        return v_object.getField4();
    }

    public static SubLObject tsf_internal_constants(final SubLObject v_object) {
        assert NIL != trans_subl_file_p(v_object) : "! file_translation.trans_subl_file_p(v_object) " + "file_translation.trans_subl_file_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject tsf_referenced_globals_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TRANS_SUBL_FILE_P);
        return v_object.getField5();
    }

    public static SubLObject tsf_referenced_globals(final SubLObject v_object) {
        assert NIL != trans_subl_file_p(v_object) : "! file_translation.trans_subl_file_p(v_object) " + "file_translation.trans_subl_file_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject tsf_referenced_functions_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TRANS_SUBL_FILE_P);
        return v_object.getField6();
    }

    public static SubLObject tsf_referenced_functions(final SubLObject v_object) {
        assert NIL != trans_subl_file_p(v_object) : "! file_translation.trans_subl_file_p(v_object) " + "file_translation.trans_subl_file_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject tsf_definitions_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TRANS_SUBL_FILE_P);
        return v_object.getField7();
    }

    public static SubLObject tsf_definitions(final SubLObject v_object) {
        assert NIL != trans_subl_file_p(v_object) : "! file_translation.trans_subl_file_p(v_object) " + "file_translation.trans_subl_file_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject tsf_top_level_forms_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TRANS_SUBL_FILE_P);
        return v_object.getField8();
    }

    public static SubLObject tsf_top_level_forms(final SubLObject v_object) {
        assert NIL != trans_subl_file_p(v_object) : "! file_translation.trans_subl_file_p(v_object) " + "file_translation.trans_subl_file_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject tsf_defined_globals_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TRANS_SUBL_FILE_P);
        return v_object.getField9();
    }

    public static SubLObject tsf_defined_globals(final SubLObject v_object) {
        assert NIL != trans_subl_file_p(v_object) : "! file_translation.trans_subl_file_p(v_object) " + "file_translation.trans_subl_file_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject tsf_defined_functions_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TRANS_SUBL_FILE_P);
        return v_object.getField10();
    }

    public static SubLObject tsf_defined_functions(final SubLObject v_object) {
        assert NIL != trans_subl_file_p(v_object) : "! file_translation.trans_subl_file_p(v_object) " + "file_translation.trans_subl_file_p error :" + v_object;
        return v_object.getField10();
    }

    public static final SubLObject tsf_defined_macros_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TRANS_SUBL_FILE_P);
        return v_object.getField11();
    }

    public static SubLObject tsf_defined_macros(final SubLObject v_object) {
        assert NIL != trans_subl_file_p(v_object) : "! file_translation.trans_subl_file_p(v_object) " + "file_translation.trans_subl_file_p error :" + v_object;
        return v_object.getField11();
    }

    public static final SubLObject tsf_arglist_table_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TRANS_SUBL_FILE_P);
        return v_object.getField12();
    }

    public static SubLObject tsf_arglist_table(final SubLObject v_object) {
        assert NIL != trans_subl_file_p(v_object) : "! file_translation.trans_subl_file_p(v_object) " + "file_translation.trans_subl_file_p error :" + v_object;
        return v_object.getField12();
    }

    public static final SubLObject tsf_binding_type_table_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TRANS_SUBL_FILE_P);
        return v_object.getField13();
    }

    public static SubLObject tsf_binding_type_table(final SubLObject v_object) {
        assert NIL != trans_subl_file_p(v_object) : "! file_translation.trans_subl_file_p(v_object) " + "file_translation.trans_subl_file_p error :" + v_object;
        return v_object.getField13();
    }

    public static final SubLObject tsf_method_visibility_table_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TRANS_SUBL_FILE_P);
        return v_object.getField14();
    }

    public static SubLObject tsf_method_visibility_table(final SubLObject v_object) {
        assert NIL != trans_subl_file_p(v_object) : "! file_translation.trans_subl_file_p(v_object) " + "file_translation.trans_subl_file_p error :" + v_object;
        return v_object.getField14();
    }

    public static final SubLObject tsf_global_visibility_table_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TRANS_SUBL_FILE_P);
        return v_object.getField15();
    }

    public static SubLObject tsf_global_visibility_table(final SubLObject v_object) {
        assert NIL != trans_subl_file_p(v_object) : "! file_translation.trans_subl_file_p(v_object) " + "file_translation.trans_subl_file_p error :" + v_object;
        return v_object.getField15();
    }

    public static final SubLObject tsf_rwbc_methods_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TRANS_SUBL_FILE_P);
        return v_object.getField16();
    }

    public static SubLObject tsf_rwbc_methods(final SubLObject v_object) {
        assert NIL != trans_subl_file_p(v_object) : "! file_translation.trans_subl_file_p(v_object) " + "file_translation.trans_subl_file_p error :" + v_object;
        return v_object.getField16();
    }

    public static final SubLObject _csetf_tsf_module_name_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TRANS_SUBL_FILE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_tsf_module_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != trans_subl_file_p(v_object) : "! file_translation.trans_subl_file_p(v_object) " + "file_translation.trans_subl_file_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_tsf_filename_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TRANS_SUBL_FILE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_tsf_filename(final SubLObject v_object, final SubLObject value) {
        assert NIL != trans_subl_file_p(v_object) : "! file_translation.trans_subl_file_p(v_object) " + "file_translation.trans_subl_file_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_tsf_internal_constants_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TRANS_SUBL_FILE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_tsf_internal_constants(final SubLObject v_object, final SubLObject value) {
        assert NIL != trans_subl_file_p(v_object) : "! file_translation.trans_subl_file_p(v_object) " + "file_translation.trans_subl_file_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_tsf_referenced_globals_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TRANS_SUBL_FILE_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_tsf_referenced_globals(final SubLObject v_object, final SubLObject value) {
        assert NIL != trans_subl_file_p(v_object) : "! file_translation.trans_subl_file_p(v_object) " + "file_translation.trans_subl_file_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_tsf_referenced_functions_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TRANS_SUBL_FILE_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_tsf_referenced_functions(final SubLObject v_object, final SubLObject value) {
        assert NIL != trans_subl_file_p(v_object) : "! file_translation.trans_subl_file_p(v_object) " + "file_translation.trans_subl_file_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_tsf_definitions_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TRANS_SUBL_FILE_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_tsf_definitions(final SubLObject v_object, final SubLObject value) {
        assert NIL != trans_subl_file_p(v_object) : "! file_translation.trans_subl_file_p(v_object) " + "file_translation.trans_subl_file_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_tsf_top_level_forms_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TRANS_SUBL_FILE_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_tsf_top_level_forms(final SubLObject v_object, final SubLObject value) {
        assert NIL != trans_subl_file_p(v_object) : "! file_translation.trans_subl_file_p(v_object) " + "file_translation.trans_subl_file_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_tsf_defined_globals_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TRANS_SUBL_FILE_P);
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_tsf_defined_globals(final SubLObject v_object, final SubLObject value) {
        assert NIL != trans_subl_file_p(v_object) : "! file_translation.trans_subl_file_p(v_object) " + "file_translation.trans_subl_file_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_tsf_defined_functions_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TRANS_SUBL_FILE_P);
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_tsf_defined_functions(final SubLObject v_object, final SubLObject value) {
        assert NIL != trans_subl_file_p(v_object) : "! file_translation.trans_subl_file_p(v_object) " + "file_translation.trans_subl_file_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static final SubLObject _csetf_tsf_defined_macros_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TRANS_SUBL_FILE_P);
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_tsf_defined_macros(final SubLObject v_object, final SubLObject value) {
        assert NIL != trans_subl_file_p(v_object) : "! file_translation.trans_subl_file_p(v_object) " + "file_translation.trans_subl_file_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static final SubLObject _csetf_tsf_arglist_table_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TRANS_SUBL_FILE_P);
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_tsf_arglist_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != trans_subl_file_p(v_object) : "! file_translation.trans_subl_file_p(v_object) " + "file_translation.trans_subl_file_p error :" + v_object;
        return v_object.setField12(value);
    }

    public static final SubLObject _csetf_tsf_binding_type_table_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TRANS_SUBL_FILE_P);
        return v_object.setField13(value);
    }

    public static SubLObject _csetf_tsf_binding_type_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != trans_subl_file_p(v_object) : "! file_translation.trans_subl_file_p(v_object) " + "file_translation.trans_subl_file_p error :" + v_object;
        return v_object.setField13(value);
    }

    public static final SubLObject _csetf_tsf_method_visibility_table_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TRANS_SUBL_FILE_P);
        return v_object.setField14(value);
    }

    public static SubLObject _csetf_tsf_method_visibility_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != trans_subl_file_p(v_object) : "! file_translation.trans_subl_file_p(v_object) " + "file_translation.trans_subl_file_p error :" + v_object;
        return v_object.setField14(value);
    }

    public static final SubLObject _csetf_tsf_global_visibility_table_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TRANS_SUBL_FILE_P);
        return v_object.setField15(value);
    }

    public static SubLObject _csetf_tsf_global_visibility_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != trans_subl_file_p(v_object) : "! file_translation.trans_subl_file_p(v_object) " + "file_translation.trans_subl_file_p error :" + v_object;
        return v_object.setField15(value);
    }

    public static final SubLObject _csetf_tsf_rwbc_methods_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TRANS_SUBL_FILE_P);
        return v_object.setField16(value);
    }

    public static SubLObject _csetf_tsf_rwbc_methods(final SubLObject v_object, final SubLObject value) {
        assert NIL != trans_subl_file_p(v_object) : "! file_translation.trans_subl_file_p(v_object) " + "file_translation.trans_subl_file_p error :" + v_object;
        return v_object.setField16(value);
    }

    public static final SubLObject make_trans_subl_file_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.file_translation.$trans_subl_file_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($MODULE_NAME)) {
                        _csetf_tsf_module_name(v_new, current_value);
                    } else {
                        if (pcase_var.eql($FILENAME)) {
                            _csetf_tsf_filename(v_new, current_value);
                        } else {
                            if (pcase_var.eql($INTERNAL_CONSTANTS)) {
                                _csetf_tsf_internal_constants(v_new, current_value);
                            } else {
                                if (pcase_var.eql($REFERENCED_GLOBALS)) {
                                    _csetf_tsf_referenced_globals(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($REFERENCED_FUNCTIONS)) {
                                        _csetf_tsf_referenced_functions(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($DEFINITIONS)) {
                                            _csetf_tsf_definitions(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($TOP_LEVEL_FORMS)) {
                                                _csetf_tsf_top_level_forms(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($DEFINED_GLOBALS)) {
                                                    _csetf_tsf_defined_globals(v_new, current_value);
                                                } else {
                                                    if (pcase_var.eql($DEFINED_FUNCTIONS)) {
                                                        _csetf_tsf_defined_functions(v_new, current_value);
                                                    } else {
                                                        if (pcase_var.eql($DEFINED_MACROS)) {
                                                            _csetf_tsf_defined_macros(v_new, current_value);
                                                        } else {
                                                            if (pcase_var.eql($ARGLIST_TABLE)) {
                                                                _csetf_tsf_arglist_table(v_new, current_value);
                                                            } else {
                                                                if (pcase_var.eql($BINDING_TYPE_TABLE)) {
                                                                    _csetf_tsf_binding_type_table(v_new, current_value);
                                                                } else {
                                                                    if (pcase_var.eql($METHOD_VISIBILITY_TABLE)) {
                                                                        _csetf_tsf_method_visibility_table(v_new, current_value);
                                                                    } else {
                                                                        if (pcase_var.eql($GLOBAL_VISIBILITY_TABLE)) {
                                                                            _csetf_tsf_global_visibility_table(v_new, current_value);
                                                                        } else {
                                                                            if (pcase_var.eql($RWBC_METHODS)) {
                                                                                _csetf_tsf_rwbc_methods(v_new, current_value);
                                                                            } else {
                                                                                Errors.error($str_alt53$Invalid_slot__S_for_construction_, current_arg);
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
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_trans_subl_file(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.file_translation.$trans_subl_file_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($MODULE_NAME)) {
                _csetf_tsf_module_name(v_new, current_value);
            } else
                if (pcase_var.eql($FILENAME)) {
                    _csetf_tsf_filename(v_new, current_value);
                } else
                    if (pcase_var.eql($INTERNAL_CONSTANTS)) {
                        _csetf_tsf_internal_constants(v_new, current_value);
                    } else
                        if (pcase_var.eql($REFERENCED_GLOBALS)) {
                            _csetf_tsf_referenced_globals(v_new, current_value);
                        } else
                            if (pcase_var.eql($REFERENCED_FUNCTIONS)) {
                                _csetf_tsf_referenced_functions(v_new, current_value);
                            } else
                                if (pcase_var.eql($DEFINITIONS)) {
                                    _csetf_tsf_definitions(v_new, current_value);
                                } else
                                    if (pcase_var.eql($TOP_LEVEL_FORMS)) {
                                        _csetf_tsf_top_level_forms(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($DEFINED_GLOBALS)) {
                                            _csetf_tsf_defined_globals(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($DEFINED_FUNCTIONS)) {
                                                _csetf_tsf_defined_functions(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($DEFINED_MACROS)) {
                                                    _csetf_tsf_defined_macros(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($ARGLIST_TABLE)) {
                                                        _csetf_tsf_arglist_table(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($BINDING_TYPE_TABLE)) {
                                                            _csetf_tsf_binding_type_table(v_new, current_value);
                                                        } else
                                                            if (pcase_var.eql($METHOD_VISIBILITY_TABLE)) {
                                                                _csetf_tsf_method_visibility_table(v_new, current_value);
                                                            } else
                                                                if (pcase_var.eql($GLOBAL_VISIBILITY_TABLE)) {
                                                                    _csetf_tsf_global_visibility_table(v_new, current_value);
                                                                } else
                                                                    if (pcase_var.eql($RWBC_METHODS)) {
                                                                        _csetf_tsf_rwbc_methods(v_new, current_value);
                                                                    } else {
                                                                        Errors.error($str54$Invalid_slot__S_for_construction_, current_arg);
                                                                    }














        }
        return v_new;
    }

    public static SubLObject visit_defstruct_trans_subl_file(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_TRANS_SUBL_FILE, FIFTEEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $MODULE_NAME, tsf_module_name(obj));
        funcall(visitor_fn, obj, $SLOT, $FILENAME, tsf_filename(obj));
        funcall(visitor_fn, obj, $SLOT, $INTERNAL_CONSTANTS, tsf_internal_constants(obj));
        funcall(visitor_fn, obj, $SLOT, $REFERENCED_GLOBALS, tsf_referenced_globals(obj));
        funcall(visitor_fn, obj, $SLOT, $REFERENCED_FUNCTIONS, tsf_referenced_functions(obj));
        funcall(visitor_fn, obj, $SLOT, $DEFINITIONS, tsf_definitions(obj));
        funcall(visitor_fn, obj, $SLOT, $TOP_LEVEL_FORMS, tsf_top_level_forms(obj));
        funcall(visitor_fn, obj, $SLOT, $DEFINED_GLOBALS, tsf_defined_globals(obj));
        funcall(visitor_fn, obj, $SLOT, $DEFINED_FUNCTIONS, tsf_defined_functions(obj));
        funcall(visitor_fn, obj, $SLOT, $DEFINED_MACROS, tsf_defined_macros(obj));
        funcall(visitor_fn, obj, $SLOT, $ARGLIST_TABLE, tsf_arglist_table(obj));
        funcall(visitor_fn, obj, $SLOT, $BINDING_TYPE_TABLE, tsf_binding_type_table(obj));
        funcall(visitor_fn, obj, $SLOT, $METHOD_VISIBILITY_TABLE, tsf_method_visibility_table(obj));
        funcall(visitor_fn, obj, $SLOT, $GLOBAL_VISIBILITY_TABLE, tsf_global_visibility_table(obj));
        funcall(visitor_fn, obj, $SLOT, $RWBC_METHODS, tsf_rwbc_methods(obj));
        funcall(visitor_fn, obj, $END, MAKE_TRANS_SUBL_FILE, FIFTEEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_trans_subl_file_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_trans_subl_file(obj, visitor_fn);
    }

    public static final SubLObject print_trans_subl_file_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(v_object, stream);
            } else {
                {
                    SubLObject v_object_1 = v_object;
                    SubLObject stream_2 = stream;
                    write_string($str_alt54$__, stream_2, UNPROVIDED, UNPROVIDED);
                    write(type_of(v_object_1), new SubLObject[]{ $STREAM, stream_2 });
                    write_char(CHAR_space, stream_2);
                    princ(tsf_module_name(v_object), stream);
                    write_char(CHAR_space, stream_2);
                    write(pointer(v_object_1), new SubLObject[]{ $STREAM, stream_2, $BASE, SIXTEEN_INTEGER });
                    write_char(CHAR_greater, stream_2);
                }
            }
            return v_object;
        }
    }

    public static SubLObject print_trans_subl_file(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(v_object, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, v_object, T, T);
            princ(tsf_module_name(v_object), stream);
            print_macros.print_unreadable_object_postamble(stream, v_object, T, T);
        }
        return v_object;
    }

    public static final SubLObject sxhash_trans_subl_file_method_alt(SubLObject v_object) {
        return Sxhash.sxhash(tsf_module_name(v_object));
    }

    public static SubLObject sxhash_trans_subl_file_method(final SubLObject v_object) {
        return Sxhash.sxhash(tsf_module_name(v_object));
    }

    public static final SubLObject new_ts_file_alt(SubLObject module_name, SubLObject filename) {
        SubLTrampolineFile.checkType(filename, STRINGP);
        {
            SubLObject ts_file = make_trans_subl_file(UNPROVIDED);
            _csetf_tsf_module_name(ts_file, module_name);
            _csetf_tsf_filename(ts_file, filename);
            _csetf_tsf_internal_constants(ts_file, dictionary.new_dictionary(symbol_function(EQUAL), ZERO_INTEGER));
            _csetf_tsf_referenced_globals(ts_file, set.new_set(symbol_function(EQ), ZERO_INTEGER));
            _csetf_tsf_referenced_functions(ts_file, set.new_set(symbol_function(EQ), ZERO_INTEGER));
            _csetf_tsf_definitions(ts_file, NIL);
            _csetf_tsf_top_level_forms(ts_file, NIL);
            _csetf_tsf_defined_globals(ts_file, NIL);
            _csetf_tsf_defined_functions(ts_file, NIL);
            _csetf_tsf_defined_macros(ts_file, NIL);
            _csetf_tsf_arglist_table(ts_file, dictionary.new_dictionary(symbol_function(EQ), ZERO_INTEGER));
            _csetf_tsf_binding_type_table(ts_file, dictionary.new_dictionary(symbol_function(EQ), ZERO_INTEGER));
            _csetf_tsf_method_visibility_table(ts_file, dictionary.new_dictionary(symbol_function(EQ), ZERO_INTEGER));
            _csetf_tsf_global_visibility_table(ts_file, dictionary.new_dictionary(symbol_function(EQ), ZERO_INTEGER));
            _csetf_tsf_rwbc_methods(ts_file, set.new_set(symbol_function(EQ), ZERO_INTEGER));
            return ts_file;
        }
    }

    public static SubLObject new_ts_file(final SubLObject module_name, final SubLObject filename) {
        assert NIL != stringp(filename) : "! stringp(filename) " + ("Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) ") + filename;
        final SubLObject ts_file = make_trans_subl_file(UNPROVIDED);
        _csetf_tsf_module_name(ts_file, module_name);
        _csetf_tsf_filename(ts_file, filename);
        _csetf_tsf_internal_constants(ts_file, dictionary.new_dictionary(symbol_function(EQUAL), ZERO_INTEGER));
        _csetf_tsf_referenced_globals(ts_file, set.new_set(symbol_function(EQ), ZERO_INTEGER));
        _csetf_tsf_referenced_functions(ts_file, set.new_set(symbol_function(EQ), ZERO_INTEGER));
        _csetf_tsf_definitions(ts_file, NIL);
        _csetf_tsf_top_level_forms(ts_file, NIL);
        _csetf_tsf_defined_globals(ts_file, NIL);
        _csetf_tsf_defined_functions(ts_file, NIL);
        _csetf_tsf_defined_macros(ts_file, NIL);
        _csetf_tsf_arglist_table(ts_file, dictionary.new_dictionary(symbol_function(EQ), ZERO_INTEGER));
        _csetf_tsf_binding_type_table(ts_file, dictionary.new_dictionary(symbol_function(EQ), ZERO_INTEGER));
        _csetf_tsf_method_visibility_table(ts_file, dictionary.new_dictionary(symbol_function(EQ), ZERO_INTEGER));
        _csetf_tsf_global_visibility_table(ts_file, dictionary.new_dictionary(symbol_function(EQ), ZERO_INTEGER));
        _csetf_tsf_rwbc_methods(ts_file, set.new_set(symbol_function(EQ), ZERO_INTEGER));
        return ts_file;
    }

    public static final SubLObject destroy_trans_subl_file_alt(SubLObject ts_file) {
        _csetf_tsf_filename(ts_file, $FREE);
        dictionary.clear_dictionary(tsf_internal_constants(ts_file));
        _csetf_tsf_internal_constants(ts_file, $FREE);
        set.clear_set(tsf_referenced_globals(ts_file));
        _csetf_tsf_referenced_globals(ts_file, $FREE);
        set.clear_set(tsf_referenced_functions(ts_file));
        _csetf_tsf_referenced_functions(ts_file, $FREE);
        _csetf_tsf_definitions(ts_file, $FREE);
        _csetf_tsf_top_level_forms(ts_file, $FREE);
        _csetf_tsf_defined_globals(ts_file, $FREE);
        _csetf_tsf_defined_functions(ts_file, $FREE);
        _csetf_tsf_defined_macros(ts_file, $FREE);
        dictionary.clear_dictionary(tsf_arglist_table(ts_file));
        _csetf_tsf_arglist_table(ts_file, $FREE);
        dictionary.clear_dictionary(tsf_binding_type_table(ts_file));
        _csetf_tsf_binding_type_table(ts_file, $FREE);
        dictionary.clear_dictionary(tsf_method_visibility_table(ts_file));
        _csetf_tsf_method_visibility_table(ts_file, $FREE);
        dictionary.clear_dictionary(tsf_global_visibility_table(ts_file));
        _csetf_tsf_global_visibility_table(ts_file, $FREE);
        set.clear_set(tsf_rwbc_methods(ts_file));
        _csetf_tsf_rwbc_methods(ts_file, $FREE);
        return ts_file;
    }

    public static SubLObject destroy_trans_subl_file(final SubLObject ts_file) {
        _csetf_tsf_filename(ts_file, $FREE);
        dictionary.clear_dictionary(tsf_internal_constants(ts_file));
        _csetf_tsf_internal_constants(ts_file, $FREE);
        set.clear_set(tsf_referenced_globals(ts_file));
        _csetf_tsf_referenced_globals(ts_file, $FREE);
        set.clear_set(tsf_referenced_functions(ts_file));
        _csetf_tsf_referenced_functions(ts_file, $FREE);
        _csetf_tsf_definitions(ts_file, $FREE);
        _csetf_tsf_top_level_forms(ts_file, $FREE);
        _csetf_tsf_defined_globals(ts_file, $FREE);
        _csetf_tsf_defined_functions(ts_file, $FREE);
        _csetf_tsf_defined_macros(ts_file, $FREE);
        dictionary.clear_dictionary(tsf_arglist_table(ts_file));
        _csetf_tsf_arglist_table(ts_file, $FREE);
        dictionary.clear_dictionary(tsf_binding_type_table(ts_file));
        _csetf_tsf_binding_type_table(ts_file, $FREE);
        dictionary.clear_dictionary(tsf_method_visibility_table(ts_file));
        _csetf_tsf_method_visibility_table(ts_file, $FREE);
        dictionary.clear_dictionary(tsf_global_visibility_table(ts_file));
        _csetf_tsf_global_visibility_table(ts_file, $FREE);
        set.clear_set(tsf_rwbc_methods(ts_file));
        _csetf_tsf_rwbc_methods(ts_file, $FREE);
        return ts_file;
    }

    public static final SubLObject ts_file_module_name_alt(SubLObject ts_file) {
        return tsf_module_name(ts_file);
    }

    public static SubLObject ts_file_module_name(final SubLObject ts_file) {
        return tsf_module_name(ts_file);
    }

    public static final SubLObject ts_file_filename_alt(SubLObject ts_file) {
        return tsf_filename(ts_file);
    }

    public static SubLObject ts_file_filename(final SubLObject ts_file) {
        return tsf_filename(ts_file);
    }

    public static final SubLObject ts_file_definitions_alt(SubLObject ts_file) {
        return tsf_definitions(ts_file);
    }

    public static SubLObject ts_file_definitions(final SubLObject ts_file) {
        return tsf_definitions(ts_file);
    }

    public static final SubLObject ts_file_internal_constant_count_alt(SubLObject ts_file) {
        return dictionary.dictionary_length(tsf_internal_constants(ts_file));
    }

    public static SubLObject ts_file_internal_constant_count(final SubLObject ts_file) {
        return dictionary.dictionary_length(tsf_internal_constants(ts_file));
    }

    public static final SubLObject ts_file_next_internal_constant_id_alt(SubLObject ts_file) {
        return ts_file_internal_constant_count(ts_file);
    }

    public static SubLObject ts_file_next_internal_constant_id(final SubLObject ts_file) {
        return ts_file_internal_constant_count(ts_file);
    }

    public static final SubLObject ts_file_internal_constants_info_alt(SubLObject ts_file) {
        return Sort.sort(dictionary_utilities.dictionary_to_alist(tsf_internal_constants(ts_file)), symbol_function($sym60$_), symbol_function(CDR));
    }

    public static SubLObject ts_file_internal_constants_info(final SubLObject ts_file) {
        return Sort.sort(dictionary_utilities.dictionary_to_alist(tsf_internal_constants(ts_file)), symbol_function($sym63$_), symbol_function(CDR));
    }

    public static final SubLObject ts_file_all_referenced_globals_alt(SubLObject ts_file) {
        return Sort.sort(set.set_element_list(tsf_referenced_globals(ts_file)), symbol_function(STRING_LESSP), symbol_function(SYMBOL_NAME));
    }

    public static SubLObject ts_file_all_referenced_globals(final SubLObject ts_file) {
        return Sort.sort(set.set_element_list(tsf_referenced_globals(ts_file)), symbol_function(STRING_LESSP), symbol_function(SYMBOL_NAME));
    }

    public static final SubLObject ts_file_all_defined_globals_alt(SubLObject ts_file) {
        return tsf_defined_globals(ts_file);
    }

    public static SubLObject ts_file_all_defined_globals(final SubLObject ts_file) {
        return tsf_defined_globals(ts_file);
    }

    public static final SubLObject ts_file_all_referenced_functions_alt(SubLObject ts_file) {
        return Sort.sort(set.set_element_list(tsf_referenced_functions(ts_file)), symbol_function(STRING_LESSP), symbol_function(SYMBOL_NAME));
    }

    public static SubLObject ts_file_all_referenced_functions(final SubLObject ts_file) {
        return Sort.sort(set.set_element_list(tsf_referenced_functions(ts_file)), symbol_function(STRING_LESSP), symbol_function(SYMBOL_NAME));
    }

    public static final SubLObject ts_file_all_defined_functions_alt(SubLObject ts_file) {
        return tsf_defined_functions(ts_file);
    }

    public static SubLObject ts_file_all_defined_functions(final SubLObject ts_file) {
        return tsf_defined_functions(ts_file);
    }

    public static final SubLObject ts_file_all_defined_private_functions_alt(SubLObject ts_file) {
        {
            SubLObject private_functions = NIL;
            SubLObject cdolist_list_var = ts_file_all_defined_functions(ts_file);
            SubLObject function = NIL;
            for (function = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , function = cdolist_list_var.first()) {
                if (NIL != ts_file_defined_private_method_p(ts_file, function)) {
                    private_functions = cons(function, private_functions);
                }
            }
            return nreverse(private_functions);
        }
    }

    public static SubLObject ts_file_all_defined_private_functions(final SubLObject ts_file) {
        SubLObject private_functions = NIL;
        SubLObject cdolist_list_var = ts_file_all_defined_functions(ts_file);
        SubLObject function = NIL;
        function = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != ts_file_defined_private_method_p(ts_file, function)) {
                private_functions = cons(function, private_functions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            function = cdolist_list_var.first();
        } 
        return nreverse(private_functions);
    }

    public static final SubLObject ts_file_function_arglist_alt(SubLObject ts_file, SubLObject function) {
        return dictionary.dictionary_lookup(tsf_arglist_table(ts_file), function, $UNSPECIFIED);
    }

    public static SubLObject ts_file_function_arglist(final SubLObject ts_file, final SubLObject function) {
        return dictionary.dictionary_lookup(tsf_arglist_table(ts_file), function, $UNSPECIFIED);
    }

    public static final SubLObject current_ts_file_defined_function_arglist_alt(SubLObject function) {
        {
            SubLObject ts_file = current_ts_file();
            return NIL != ts_file ? ((SubLObject) (ts_file_function_arglist(ts_file, function))) : $UNSPECIFIED;
        }
    }

    public static SubLObject current_ts_file_defined_function_arglist(final SubLObject function) {
        final SubLObject ts_file = current_ts_file();
        return NIL != ts_file ? ts_file_function_arglist(ts_file, function) : $UNSPECIFIED;
    }

    public static final SubLObject ts_file_defined_global_binding_type_alt(SubLObject ts_file, SubLObject global) {
        return dictionary.dictionary_lookup(tsf_binding_type_table(ts_file), global, $UNSPECIFIED);
    }

    public static SubLObject ts_file_defined_global_binding_type(final SubLObject ts_file, final SubLObject global) {
        return dictionary.dictionary_lookup(tsf_binding_type_table(ts_file), global, $UNSPECIFIED);
    }

    public static final SubLObject ts_file_global_binding_type_alt(SubLObject ts_file, SubLObject global) {
        {
            SubLObject binding_type = ts_file_defined_global_binding_type(ts_file, global);
            if (binding_type != $UNSPECIFIED) {
                return binding_type;
            }
        }
        return form_translation.global_binding_type(global);
    }

    public static SubLObject ts_file_global_binding_type(final SubLObject ts_file, final SubLObject global) {
        final SubLObject binding_type = ts_file_defined_global_binding_type(ts_file, global);
        if (binding_type != $UNSPECIFIED) {
            return binding_type;
        }
        return form_translation.global_binding_type(global);
    }

    public static final SubLObject current_ts_file_global_binding_type_alt(SubLObject global) {
        {
            SubLObject ts_file = current_ts_file();
            if (NIL != ts_file) {
                return ts_file_global_binding_type(ts_file, global);
            }
        }
        return form_translation.global_binding_type(global);
    }

    public static SubLObject current_ts_file_global_binding_type(final SubLObject global) {
        final SubLObject ts_file = current_ts_file();
        if (NIL != ts_file) {
            return ts_file_global_binding_type(ts_file, global);
        }
        return form_translation.global_binding_type(global);
    }

    public static final SubLObject ts_file_defined_method_visibility_alt(SubLObject ts_file, SubLObject method) {
        return dictionary.dictionary_lookup(tsf_method_visibility_table(ts_file), method, PROTECTED);
    }

    public static SubLObject ts_file_defined_method_visibility(final SubLObject ts_file, final SubLObject method) {
        return dictionary.dictionary_lookup(tsf_method_visibility_table(ts_file), method, PROTECTED);
    }

    public static final SubLObject ts_file_defined_private_method_p_alt(SubLObject ts_file, SubLObject method) {
        return eq(PRIVATE, ts_file_defined_method_visibility(ts_file, method));
    }

    public static SubLObject ts_file_defined_private_method_p(final SubLObject ts_file, final SubLObject method) {
        return eq(PRIVATE, ts_file_defined_method_visibility(ts_file, method));
    }

    public static final SubLObject current_ts_file_defined_private_method_p_alt(SubLObject method) {
        {
            SubLObject ts_file = current_ts_file();
            return NIL != ts_file ? ((SubLObject) (ts_file_defined_private_method_p(ts_file, method))) : NIL;
        }
    }

    public static SubLObject current_ts_file_defined_private_method_p(final SubLObject method) {
        final SubLObject ts_file = current_ts_file();
        return NIL != ts_file ? ts_file_defined_private_method_p(ts_file, method) : NIL;
    }

    public static final SubLObject ts_file_defined_global_visibility_alt(SubLObject ts_file, SubLObject global) {
        return dictionary.dictionary_lookup(tsf_global_visibility_table(ts_file), global, PROTECTED);
    }

    public static SubLObject ts_file_defined_global_visibility(final SubLObject ts_file, final SubLObject global) {
        return dictionary.dictionary_lookup(tsf_global_visibility_table(ts_file), global, PROTECTED);
    }

    public static final SubLObject ts_file_defined_private_global_p_alt(SubLObject ts_file, SubLObject global) {
        return eq(PRIVATE, ts_file_defined_global_visibility(ts_file, global));
    }

    public static SubLObject ts_file_defined_private_global_p(final SubLObject ts_file, final SubLObject global) {
        return eq(PRIVATE, ts_file_defined_global_visibility(ts_file, global));
    }

    public static final SubLObject current_ts_file_defined_private_global_p_alt(SubLObject global) {
        {
            SubLObject ts_file = current_ts_file();
            return NIL != ts_file ? ((SubLObject) (ts_file_defined_private_global_p(ts_file, global))) : NIL;
        }
    }

    public static SubLObject current_ts_file_defined_private_global_p(final SubLObject global) {
        final SubLObject ts_file = current_ts_file();
        return NIL != ts_file ? ts_file_defined_private_global_p(ts_file, global) : NIL;
    }

    public static final SubLObject ts_file_private_global_definition_p_alt(SubLObject ts_file, SubLObject definition) {
        if (definition.isCons()) {
            {
                SubLObject operator = definition.first();
                if (NIL != list_utilities.member_eqP(operator, $trans_subl_global_definers$.getGlobalValue())) {
                    {
                        SubLObject datum = definition;
                        SubLObject current = datum;
                        SubLObject definer = NIL;
                        SubLObject global = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt68);
                        definer = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt68);
                        global = current.first();
                        current = current.rest();
                        {
                            SubLObject init_form = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                            destructuring_bind_must_listp(current, datum, $list_alt68);
                            current = current.rest();
                            {
                                SubLObject documentation = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                                destructuring_bind_must_listp(current, datum, $list_alt68);
                                current = current.rest();
                                if (NIL == current) {
                                    return ts_file_defined_private_global_p(ts_file, global);
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt68);
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject ts_file_private_global_definition_p(final SubLObject ts_file, final SubLObject definition) {
        if (definition.isCons()) {
            final SubLObject operator = definition.first();
            if (NIL != list_utilities.member_eqP(operator, $trans_subl_global_definers$.getGlobalValue())) {
                SubLObject definer = NIL;
                SubLObject global = NIL;
                destructuring_bind_must_consp(definition, definition, $list71);
                definer = definition.first();
                SubLObject current = definition.rest();
                destructuring_bind_must_consp(current, definition, $list71);
                global = current.first();
                current = current.rest();
                final SubLObject init_form = (current.isCons()) ? current.first() : NIL;
                destructuring_bind_must_listp(current, definition, $list71);
                current = current.rest();
                final SubLObject documentation = (current.isCons()) ? current.first() : NIL;
                destructuring_bind_must_listp(current, definition, $list71);
                current = current.rest();
                if (NIL == current) {
                    return ts_file_defined_private_global_p(ts_file, global);
                }
                cdestructuring_bind_error(definition, $list71);
            }
        }
        return NIL;
    }

    public static final SubLObject ts_file_private_global_definitions_alt(SubLObject ts_file) {
        {
            SubLObject private_global_definitions = NIL;
            SubLObject cdolist_list_var = ts_file_definitions(ts_file);
            SubLObject definition = NIL;
            for (definition = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , definition = cdolist_list_var.first()) {
                if (NIL != ts_file_private_global_definition_p(ts_file, definition)) {
                    private_global_definitions = cons(definition, private_global_definitions);
                }
            }
            return nreverse(private_global_definitions);
        }
    }

    public static SubLObject ts_file_private_global_definitions(final SubLObject ts_file) {
        SubLObject private_global_definitions = NIL;
        SubLObject cdolist_list_var = ts_file_definitions(ts_file);
        SubLObject definition = NIL;
        definition = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != ts_file_private_global_definition_p(ts_file, definition)) {
                private_global_definitions = cons(definition, private_global_definitions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            definition = cdolist_list_var.first();
        } 
        return nreverse(private_global_definitions);
    }

    public static final SubLObject ts_file_method_returns_within_binding_constructP_alt(SubLObject ts_file, SubLObject method) {
        return set.set_memberP(method, tsf_rwbc_methods(ts_file));
    }

    public static SubLObject ts_file_method_returns_within_binding_constructP(final SubLObject ts_file, final SubLObject method) {
        return set.set_memberP(method, tsf_rwbc_methods(ts_file));
    }

    public static final SubLObject ts_file_internal_constant_id_lookup_alt(SubLObject ts_file, SubLObject constant_form) {
        {
            SubLObject internal_constant_id = dictionary.dictionary_lookup_without_values(tsf_internal_constants(ts_file), constant_form, UNPROVIDED);
            if (NIL == internal_constant_id) {
                internal_constant_id = ts_file_next_internal_constant_id(ts_file);
                dictionary.dictionary_enter(tsf_internal_constants(ts_file), constant_form, internal_constant_id);
            }
            return internal_constant_id;
        }
    }

    public static SubLObject ts_file_internal_constant_id_lookup(final SubLObject ts_file, final SubLObject constant_form) {
        SubLObject internal_constant_id = dictionary.dictionary_lookup_without_values(tsf_internal_constants(ts_file), constant_form, UNPROVIDED);
        if (NIL == internal_constant_id) {
            internal_constant_id = ts_file_next_internal_constant_id(ts_file);
            dictionary.dictionary_enter(tsf_internal_constants(ts_file), constant_form, internal_constant_id);
        }
        return internal_constant_id;
    }

    public static final SubLObject ts_file_note_function_definition_alt(SubLObject ts_file, SubLObject function_name, SubLObject translated_form) {
        _csetf_tsf_definitions(ts_file, cons(translated_form, tsf_definitions(ts_file)));
        _csetf_tsf_defined_functions(ts_file, cons(function_name, tsf_defined_functions(ts_file)));
        return translated_form;
    }

    public static SubLObject ts_file_note_function_definition(final SubLObject ts_file, final SubLObject function_name, final SubLObject translated_form) {
        _csetf_tsf_definitions(ts_file, cons(translated_form, tsf_definitions(ts_file)));
        _csetf_tsf_defined_functions(ts_file, cons(function_name, tsf_defined_functions(ts_file)));
        return translated_form;
    }

    public static final SubLObject ts_file_note_macro_definition_alt(SubLObject ts_file, SubLObject macro_name, SubLObject translated_form) {
        _csetf_tsf_definitions(ts_file, cons(translated_form, tsf_definitions(ts_file)));
        _csetf_tsf_defined_macros(ts_file, cons(macro_name, tsf_defined_macros(ts_file)));
        return translated_form;
    }

    public static SubLObject ts_file_note_macro_definition(final SubLObject ts_file, final SubLObject macro_name, final SubLObject translated_form) {
        _csetf_tsf_definitions(ts_file, cons(translated_form, tsf_definitions(ts_file)));
        _csetf_tsf_defined_macros(ts_file, cons(macro_name, tsf_defined_macros(ts_file)));
        return translated_form;
    }

    public static final SubLObject ts_file_note_global_definition_alt(SubLObject ts_file, SubLObject global_name, SubLObject translated_form) {
        _csetf_tsf_definitions(ts_file, cons(translated_form, tsf_definitions(ts_file)));
        _csetf_tsf_defined_globals(ts_file, cons(global_name, tsf_defined_globals(ts_file)));
        return translated_form;
    }

    public static SubLObject ts_file_note_global_definition(final SubLObject ts_file, final SubLObject global_name, final SubLObject translated_form) {
        _csetf_tsf_definitions(ts_file, cons(translated_form, tsf_definitions(ts_file)));
        _csetf_tsf_defined_globals(ts_file, cons(global_name, tsf_defined_globals(ts_file)));
        return translated_form;
    }

    public static final SubLObject ts_file_note_class_definition_alt(SubLObject ts_file, SubLObject class_name, SubLObject translated_form) {
        _csetf_tsf_definitions(ts_file, cons(translated_form, tsf_definitions(ts_file)));
        return translated_form;
    }

    public static SubLObject ts_file_note_class_definition(final SubLObject ts_file, final SubLObject class_name, final SubLObject translated_form) {
        _csetf_tsf_definitions(ts_file, cons(translated_form, tsf_definitions(ts_file)));
        return translated_form;
    }

    public static final SubLObject ts_file_note_top_level_form_alt(SubLObject ts_file, SubLObject translated_form) {
        _csetf_tsf_top_level_forms(ts_file, cons(translated_form, tsf_top_level_forms(ts_file)));
        return translated_form;
    }

    public static SubLObject ts_file_note_top_level_form(final SubLObject ts_file, final SubLObject translated_form) {
        _csetf_tsf_top_level_forms(ts_file, cons(translated_form, tsf_top_level_forms(ts_file)));
        return translated_form;
    }

    public static final SubLObject with_translator_output_file_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt69);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject stream_var = NIL;
                    SubLObject filename = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt69);
                    stream_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt69);
                    filename = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject filename_var = $sym70$FILENAME_VAR;
                            return list(CLET, list(list(filename_var, filename)), listS(WITH_PRIVATE_TEXT_FILE, listS(stream_var, filename_var, $list_alt73), append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt69);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject with_translator_output_file(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list72);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream_var = NIL;
        SubLObject filename = NIL;
        destructuring_bind_must_consp(current, datum, $list72);
        stream_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list72);
        filename = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject filename_var = $sym73$FILENAME_VAR;
            return list(WITH_STREAM_BUFFER_SIZE, $list75, list(CLET, list(list(filename_var, filename)), listS(WITH_PRIVATE_TEXT_FILE, listS(stream_var, filename_var, $list78), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list72);
        return NIL;
    }

    public static final SubLObject possibly_delete_file_alt(SubLObject filename) {
        if (!filename.equal($str_alt74$_dev_null)) {
            if (NIL != Filesys.probe_file(filename)) {
                Filesys.delete_file(filename);
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject possibly_delete_file(final SubLObject filename) {
        if ((!filename.equal($str79$_dev_null)) && (NIL != Filesys.probe_file(filename))) {
            Filesys.delete_file(filename);
            return T;
        }
        return NIL;
    }

    public static final SubLObject show_trans_subl_file_alt(SubLObject ts_file, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $print_case$.currentBinding(thread);
                SubLObject _prev_bind_1 = $read_default_float_format$.currentBinding(thread);
                try {
                    $print_case$.bind($DOWNCASE, thread);
                    $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
                    format(stream, $str_alt77$___Trans_SubL_File____S, tsf_module_name(ts_file));
                    format(stream, $str_alt78$_____Location___________S, tsf_filename(ts_file));
                    {
                        SubLObject referenced_globals = ts_file_all_referenced_globals(ts_file);
                        if (NIL != referenced_globals) {
                            format(stream, $str_alt79$_______Referenced_Globals__);
                            {
                                SubLObject cdolist_list_var = referenced_globals;
                                SubLObject global = NIL;
                                for (global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , global = cdolist_list_var.first()) {
                                    print(global, stream);
                                }
                            }
                        }
                    }
                    {
                        SubLObject referenced_functions = ts_file_all_referenced_functions(ts_file);
                        if (NIL != referenced_functions) {
                            format(stream, $str_alt80$_______Referenced_Functions__);
                            {
                                SubLObject cdolist_list_var = referenced_functions;
                                SubLObject function = NIL;
                                for (function = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , function = cdolist_list_var.first()) {
                                    print(function, stream);
                                }
                            }
                        }
                    }
                    {
                        SubLObject internal_constant_info = ts_file_internal_constants_info(ts_file);
                        if (NIL != internal_constant_info) {
                            format(stream, $str_alt81$_______Internal_Constants__);
                            {
                                SubLObject cdolist_list_var = internal_constant_info;
                                SubLObject cons = NIL;
                                for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                                    {
                                        SubLObject datum = cons;
                                        SubLObject current = datum;
                                        SubLObject constant = NIL;
                                        SubLObject internal_id = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt82);
                                        constant = current.first();
                                        current = current.rest();
                                        internal_id = current;
                                        format(stream, $str_alt83$___S____S, internal_id, constant);
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject definitions = tsf_definitions(ts_file);
                        if (NIL != definitions) {
                            format(stream, $str_alt84$_______Definitions__);
                        }
                        {
                            SubLObject cdolist_list_var = definitions;
                            SubLObject definition = NIL;
                            for (definition = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , definition = cdolist_list_var.first()) {
                                terpri(UNPROVIDED);
                                print_subl_expression(definition, stream, UNPROVIDED);
                            }
                        }
                    }
                } finally {
                    $read_default_float_format$.rebind(_prev_bind_1, thread);
                    $print_case$.rebind(_prev_bind_0, thread);
                }
            }
            return ts_file;
        }
    }

    public static SubLObject show_trans_subl_file(final SubLObject ts_file, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $print_case$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $read_default_float_format$.currentBinding(thread);
        try {
            $print_case$.bind($DOWNCASE, thread);
            $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
            format(stream, $str82$___Trans_SubL_File____S, tsf_module_name(ts_file));
            format(stream, $str83$_____Location___________S, tsf_filename(ts_file));
            final SubLObject referenced_globals = ts_file_all_referenced_globals(ts_file);
            if (NIL != referenced_globals) {
                format(stream, $str84$_______Referenced_Globals__);
                SubLObject cdolist_list_var = referenced_globals;
                SubLObject global = NIL;
                global = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    print(global, stream);
                    cdolist_list_var = cdolist_list_var.rest();
                    global = cdolist_list_var.first();
                } 
            }
            final SubLObject referenced_functions = ts_file_all_referenced_functions(ts_file);
            if (NIL != referenced_functions) {
                format(stream, $str85$_______Referenced_Functions__);
                SubLObject cdolist_list_var = referenced_functions;
                SubLObject function = NIL;
                function = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    print(function, stream);
                    cdolist_list_var = cdolist_list_var.rest();
                    function = cdolist_list_var.first();
                } 
            }
            final SubLObject internal_constant_info = ts_file_internal_constants_info(ts_file);
            if (NIL != internal_constant_info) {
                format(stream, $str86$_______Internal_Constants__);
                SubLObject cdolist_list_var = internal_constant_info;
                SubLObject cons = NIL;
                cons = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = cons;
                    SubLObject constant = NIL;
                    SubLObject internal_id = NIL;
                    destructuring_bind_must_consp(current, datum, $list87);
                    constant = current.first();
                    current = internal_id = current.rest();
                    format(stream, $str88$___S____S, internal_id, constant);
                    cdolist_list_var = cdolist_list_var.rest();
                    cons = cdolist_list_var.first();
                } 
            }
            final SubLObject definitions = tsf_definitions(ts_file);
            if (NIL != definitions) {
                format(stream, $str89$_______Definitions__);
            }
            SubLObject cdolist_list_var = definitions;
            SubLObject definition = NIL;
            definition = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                terpri(UNPROVIDED);
                print_subl_expression(definition, stream, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                definition = cdolist_list_var.first();
            } 
        } finally {
            $read_default_float_format$.rebind(_prev_bind_2, thread);
            $print_case$.rebind(_prev_bind_0, thread);
        }
        return ts_file;
    }

    public static final SubLObject print_subl_expression_alt(SubLObject form, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (depth == UNPROVIDED) {
            depth = ZERO_INTEGER;
        }
        return format_cycl_expression.format_cycl_expression(form, stream, depth);
    }

    public static SubLObject print_subl_expression(final SubLObject form, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (depth == UNPROVIDED) {
            depth = ZERO_INTEGER;
        }
        return format_cycl_expression.format_cycl_expression(form, stream, depth);
    }

    public static final SubLObject function_signature_info_alt(SubLObject function_symbol) {
        return function_arglist_signature_info(subl_promotions.function_symbol_arglist(function_symbol));
    }

    public static SubLObject function_signature_info(final SubLObject function_symbol) {
        return function_arglist_signature_info(subl_promotions.function_symbol_arglist(function_symbol));
    }

    public static final SubLObject function_arglist_signature_info_alt(SubLObject arglist) {
        {
            SubLObject optional_position = position($sym85$_OPTIONAL, arglist, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject rest_position = position($sym86$_REST, arglist, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != optional_position) {
                if (NIL != rest_position) {
                    return values(optional_position, subtract(rest_position, optional_position, ONE_INTEGER), T);
                } else {
                    return values(optional_position, subtract(length(arglist), optional_position, ONE_INTEGER), NIL);
                }
            } else {
                if (NIL != rest_position) {
                    return values(rest_position, ZERO_INTEGER, T);
                } else {
                    return values(length(arglist), ZERO_INTEGER, NIL);
                }
            }
        }
    }

    public static SubLObject function_arglist_signature_info(final SubLObject arglist) {
        final SubLObject optional_position = position($sym90$_OPTIONAL, arglist, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject rest_position = position($sym91$_REST, arglist, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != optional_position) {
            if (NIL != rest_position) {
                return values(optional_position, subtract(rest_position, optional_position, ONE_INTEGER), T);
            }
            return values(optional_position, subtract(length(arglist), optional_position, ONE_INTEGER), NIL);
        } else {
            if (NIL != rest_position) {
                return values(rest_position, ZERO_INTEGER, T);
            }
            return values(length(arglist), ZERO_INTEGER, NIL);
        }
    }

    public static final SubLObject tsf_possibly_convert_internal_constant_alt(SubLObject constant_form) {
        {
            SubLObject ts_file = current_ts_file();
            if (NIL != predefined_constant_p(constant_form)) {
                return list($sym87$_PC, constant_form);
            } else {
                if (NIL == ts_file) {
                    return translate_constant_initialization_form(constant_form);
                } else {
                    {
                        SubLObject internal_id = ts_file_internal_constant_id_lookup(ts_file, constant_form);
                        return list($sym88$_IC, internal_id, constant_form);
                    }
                }
            }
        }
    }

    public static SubLObject tsf_possibly_convert_internal_constant(final SubLObject constant_form) {
        final SubLObject ts_file = current_ts_file();
        if (NIL != predefined_constant_p(constant_form)) {
            return list($sym92$_PC, constant_form);
        }
        if (NIL == ts_file) {
            return translate_constant_initialization_form(constant_form);
        }
        final SubLObject internal_id = ts_file_internal_constant_id_lookup(ts_file, constant_form);
        return list($sym93$_IC, internal_id, constant_form);
    }

    public static final SubLObject tsf_possibly_note_referenced_global_alt(SubLObject global) {
        SubLTrampolineFile.checkType(global, SYMBOLP);
        {
            SubLObject ts_file = current_ts_file();
            if (NIL != ts_file) {
                set.set_add(global, tsf_referenced_globals(ts_file));
            }
        }
        return NIL;
    }

    public static SubLObject tsf_possibly_note_referenced_global(final SubLObject global) {
        assert NIL != symbolp(global) : "! symbolp(global) " + ("Types.symbolp(global) " + "CommonSymbols.NIL != Types.symbolp(global) ") + global;
        final SubLObject ts_file = current_ts_file();
        if (NIL != ts_file) {
            set.set_add(global, tsf_referenced_globals(ts_file));
        }
        return NIL;
    }

    public static final SubLObject tsf_possibly_note_referenced_function_alt(SubLObject function) {
        SubLTrampolineFile.checkType(function, SYMBOLP);
        {
            SubLObject ts_file = current_ts_file();
            if (NIL != ts_file) {
                set.set_add(function, tsf_referenced_functions(ts_file));
            }
        }
        return NIL;
    }

    public static SubLObject tsf_possibly_note_referenced_function(final SubLObject function) {
        assert NIL != symbolp(function) : "! symbolp(function) " + ("Types.symbolp(function) " + "CommonSymbols.NIL != Types.symbolp(function) ") + function;
        final SubLObject ts_file = current_ts_file();
        if (NIL != ts_file) {
            set.set_add(function, tsf_referenced_functions(ts_file));
        }
        return NIL;
    }

    public static final SubLObject tsf_possibly_note_defined_function_arglist_alt(SubLObject function, SubLObject arglist) {
        SubLTrampolineFile.checkType(function, SYMBOLP);
        SubLTrampolineFile.checkType(arglist, LISTP);
        {
            SubLObject ts_file = current_ts_file();
            if (NIL != ts_file) {
                dictionary.dictionary_enter(tsf_arglist_table(ts_file), function, arglist);
            }
        }
        return NIL;
    }

    public static SubLObject tsf_possibly_note_defined_function_arglist(final SubLObject function, final SubLObject arglist) {
        assert NIL != symbolp(function) : "! symbolp(function) " + ("Types.symbolp(function) " + "CommonSymbols.NIL != Types.symbolp(function) ") + function;
        assert NIL != listp(arglist) : "! listp(arglist) " + ("Types.listp(arglist) " + "CommonSymbols.NIL != Types.listp(arglist) ") + arglist;
        final SubLObject ts_file = current_ts_file();
        if (NIL != ts_file) {
            dictionary.dictionary_enter(tsf_arglist_table(ts_file), function, arglist);
        }
        return NIL;
    }

    public static final SubLObject tsf_possibly_note_defined_global_binding_type_alt(SubLObject global, SubLObject binding_type) {
        SubLTrampolineFile.checkType(global, SYMBOLP);
        SubLTrampolineFile.checkType(binding_type, KEYWORDP);
        {
            SubLObject ts_file = current_ts_file();
            if (NIL != ts_file) {
                dictionary.dictionary_enter(tsf_binding_type_table(ts_file), global, binding_type);
            }
        }
        return NIL;
    }

    public static SubLObject tsf_possibly_note_defined_global_binding_type(final SubLObject global, final SubLObject binding_type) {
        assert NIL != symbolp(global) : "! symbolp(global) " + ("Types.symbolp(global) " + "CommonSymbols.NIL != Types.symbolp(global) ") + global;
        assert NIL != keywordp(binding_type) : "! keywordp(binding_type) " + ("Types.keywordp(binding_type) " + "CommonSymbols.NIL != Types.keywordp(binding_type) ") + binding_type;
        final SubLObject ts_file = current_ts_file();
        if (NIL != ts_file) {
            dictionary.dictionary_enter(tsf_binding_type_table(ts_file), global, binding_type);
        }
        return NIL;
    }

    public static final SubLObject tsf_possibly_note_defined_method_visibility_alt(SubLObject method, SubLObject visibility) {
        SubLTrampolineFile.checkType(method, SYMBOLP);
        SubLTrampolineFile.checkType(visibility, SYMBOLP);
        {
            SubLObject ts_file = current_ts_file();
            if (NIL != ts_file) {
                dictionary.dictionary_enter(tsf_method_visibility_table(ts_file), method, visibility);
            }
        }
        return NIL;
    }

    public static SubLObject tsf_possibly_note_defined_method_visibility(final SubLObject method, final SubLObject visibility) {
        assert NIL != symbolp(method) : "! symbolp(method) " + ("Types.symbolp(method) " + "CommonSymbols.NIL != Types.symbolp(method) ") + method;
        assert NIL != symbolp(visibility) : "! symbolp(visibility) " + ("Types.symbolp(visibility) " + "CommonSymbols.NIL != Types.symbolp(visibility) ") + visibility;
        final SubLObject ts_file = current_ts_file();
        if (NIL != ts_file) {
            dictionary.dictionary_enter(tsf_method_visibility_table(ts_file), method, visibility);
        }
        return NIL;
    }

    public static final SubLObject tsf_possibly_note_defined_global_visibility_alt(SubLObject global, SubLObject visibility) {
        SubLTrampolineFile.checkType(global, SYMBOLP);
        SubLTrampolineFile.checkType(visibility, SYMBOLP);
        {
            SubLObject ts_file = current_ts_file();
            if (NIL != ts_file) {
                dictionary.dictionary_enter(tsf_global_visibility_table(ts_file), global, visibility);
            }
        }
        return NIL;
    }

    public static SubLObject tsf_possibly_note_defined_global_visibility(final SubLObject global, final SubLObject visibility) {
        assert NIL != symbolp(global) : "! symbolp(global) " + ("Types.symbolp(global) " + "CommonSymbols.NIL != Types.symbolp(global) ") + global;
        assert NIL != symbolp(visibility) : "! symbolp(visibility) " + ("Types.symbolp(visibility) " + "CommonSymbols.NIL != Types.symbolp(visibility) ") + visibility;
        final SubLObject ts_file = current_ts_file();
        if (NIL != ts_file) {
            dictionary.dictionary_enter(tsf_global_visibility_table(ts_file), global, visibility);
        }
        return NIL;
    }

    public static final SubLObject tsf_possibly_note_method_returns_within_binding_construct_alt(SubLObject method) {
        SubLTrampolineFile.checkType(method, SYMBOLP);
        {
            SubLObject ts_file = current_ts_file();
            if (NIL != ts_file) {
                set.set_add(method, tsf_rwbc_methods(ts_file));
            }
        }
        return NIL;
    }

    public static SubLObject tsf_possibly_note_method_returns_within_binding_construct(final SubLObject method) {
        assert NIL != symbolp(method) : "! symbolp(method) " + ("Types.symbolp(method) " + "CommonSymbols.NIL != Types.symbolp(method) ") + method;
        final SubLObject ts_file = current_ts_file();
        if (NIL != ts_file) {
            set.set_add(method, tsf_rwbc_methods(ts_file));
        }
        return NIL;
    }

    public static final SubLObject translate_file_alt(SubLObject module_name, SubLObject filename) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(module_name, STRINGP);
            SubLTrampolineFile.checkType(filename, STRINGP);
            {
                SubLObject ts_file = new_ts_file(module_name, filename);
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_text(filename, $INPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt93$Unable_to_open__S, filename);
                    }
                    {
                        SubLObject stream_3 = stream;
                        SubLObject features = NIL;
                        SubLObject system_var = xref_database.current_xref_system();
                        SubLObject module_var = (NIL != system_var) ? ((SubLObject) (xref_database.new_xref_module(system_var, module_name, features))) : NIL;
                        {
                            SubLObject _prev_bind_0 = xref_database.$current_xref_module$.currentBinding(thread);
                            try {
                                xref_database.$current_xref_module$.bind(module_var, thread);
                                {
                                    SubLObject name_var = module_name;
                                    SubLTrampolineFile.checkType(name_var, STRINGP);
                                    {
                                        SubLObject _prev_bind_0_4 = xref_database.$xref_module_scope$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = $current_ts_file$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = $package$.currentBinding(thread);
                                        SubLObject _prev_bind_3 = $read_default_float_format$.currentBinding(thread);
                                        SubLObject _prev_bind_4 = $read_require_constant_exists$.currentBinding(thread);
                                        try {
                                            xref_database.$xref_module_scope$.bind(name_var, thread);
                                            $current_ts_file$.bind(ts_file, thread);
                                            $package$.bind($sublisp_package$.getGlobalValue(), thread);
                                            $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
                                            $read_require_constant_exists$.bind(NIL, thread);
                                            {
                                                SubLObject position = NIL;
                                                SubLObject form = NIL;
                                                for (position = file_position(stream_3, UNPROVIDED), form = read(stream_3, NIL, $EOF, UNPROVIDED); form != $EOF; position = file_position(stream_3, UNPROVIDED) , form = read(stream_3, NIL, $EOF, UNPROVIDED)) {
                                                    {
                                                        SubLObject position_var = position;
                                                        SubLTrampolineFile.checkType(position_var, NON_NEGATIVE_INTEGER_P);
                                                        {
                                                            SubLObject _prev_bind_0_5 = xref_database.$xref_file_position_scope$.currentBinding(thread);
                                                            try {
                                                                xref_database.$xref_file_position_scope$.bind(position_var, thread);
                                                                ts_file_translate_form(ts_file, form);
                                                            } finally {
                                                                xref_database.$xref_file_position_scope$.rebind(_prev_bind_0_5, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                                ts_file = finalize_ts_file(ts_file);
                                            }
                                        } finally {
                                            $read_require_constant_exists$.rebind(_prev_bind_4, thread);
                                            $read_default_float_format$.rebind(_prev_bind_3, thread);
                                            $package$.rebind(_prev_bind_2, thread);
                                            $current_ts_file$.rebind(_prev_bind_1, thread);
                                            xref_database.$xref_module_scope$.rebind(_prev_bind_0_4, thread);
                                        }
                                    }
                                }
                            } finally {
                                xref_database.$current_xref_module$.rebind(_prev_bind_0, thread);
                            }
                        }
                        if (NIL != module_var) {
                            xref_database.xrs_merge_xref_module(system_var, module_var);
                        }
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
                return ts_file;
            }
        }
    }

    public static SubLObject translate_file(final SubLObject module_name, final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(module_name) : "! stringp(module_name) " + ("Types.stringp(module_name) " + "CommonSymbols.NIL != Types.stringp(module_name) ") + module_name;
        assert NIL != stringp(filename) : "! stringp(filename) " + ("Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) ") + filename;
        SubLObject ts_file = new_ts_file(module_name, filename);
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(filename, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str98$Unable_to_open__S, filename);
            }
            final SubLObject stream_$1 = stream;
            final SubLObject features = NIL;
            final SubLObject system_var = xref_database.current_xref_system();
            final SubLObject module_var = (NIL != system_var) ? xref_database.new_xref_module(system_var, module_name, features) : NIL;
            final SubLObject _prev_bind_2 = xref_database.$current_xref_module$.currentBinding(thread);
            try {
                xref_database.$current_xref_module$.bind(module_var, thread);
                assert NIL != stringp(module_name) : "! stringp(module_name) " + ("Types.stringp(module_name) " + "CommonSymbols.NIL != Types.stringp(module_name) ") + module_name;
                final SubLObject _prev_bind_0_$2 = xref_database.$xref_module_scope$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $current_ts_file$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $package$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $read_default_float_format$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $read_require_constant_exists$.currentBinding(thread);
                try {
                    xref_database.$xref_module_scope$.bind(module_name, thread);
                    $current_ts_file$.bind(ts_file, thread);
                    $package$.bind($sublisp_package$.getGlobalValue(), thread);
                    $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
                    $read_require_constant_exists$.bind(NIL, thread);
                    SubLObject position = NIL;
                    SubLObject form = NIL;
                    position = file_position(stream_$1, UNPROVIDED);
                    for (form = read(stream_$1, NIL, $EOF, UNPROVIDED); form != $EOF; form = read(stream_$1, NIL, $EOF, UNPROVIDED)) {
                        final SubLObject position_var = position;
                        assert NIL != subl_promotions.non_negative_integer_p(position_var) : "! subl_promotions.non_negative_integer_p(position_var) " + ("subl_promotions.non_negative_integer_p(position_var) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(position_var) ") + position_var;
                        final SubLObject _prev_bind_0_$3 = xref_database.$xref_file_position_scope$.currentBinding(thread);
                        try {
                            xref_database.$xref_file_position_scope$.bind(position_var, thread);
                            ts_file_translate_form(ts_file, form);
                        } finally {
                            xref_database.$xref_file_position_scope$.rebind(_prev_bind_0_$3, thread);
                        }
                        position = file_position(stream_$1, UNPROVIDED);
                    }
                    ts_file = finalize_ts_file(ts_file);
                } finally {
                    $read_require_constant_exists$.rebind(_prev_bind_6, thread);
                    $read_default_float_format$.rebind(_prev_bind_5, thread);
                    $package$.rebind(_prev_bind_4, thread);
                    $current_ts_file$.rebind(_prev_bind_3, thread);
                    xref_database.$xref_module_scope$.rebind(_prev_bind_0_$2, thread);
                }
            } finally {
                xref_database.$current_xref_module$.rebind(_prev_bind_2, thread);
            }
            if (NIL != module_var) {
                xref_database.xrs_merge_xref_module(system_var, module_var);
            }
        } finally {
            final SubLObject _prev_bind_7 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_7, thread);
            }
        }
        return ts_file;
    }

    public static final SubLObject ts_file_translate_form_alt(SubLObject ts_file, SubLObject form) {
        {
            SubLObject translated_form = form_translation.translate_form(form);
            handle_file_form(ts_file, translated_form);
            return translated_form;
        }
    }

    public static SubLObject ts_file_translate_form(final SubLObject ts_file, final SubLObject form) {
        final SubLObject translated_form = form_translation.translate_form(form);
        handle_file_form(ts_file, translated_form);
        return translated_form;
    }

    public static final SubLObject handle_file_form_alt(SubLObject ts_file, SubLObject translated_form) {
        if (translated_form.isCons()) {
            {
                SubLObject operator = translated_form.first();
                if (operator == PROGN) {
                    {
                        SubLObject cdolist_list_var = translated_form.rest();
                        SubLObject sub_form = NIL;
                        for (sub_form = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sub_form = cdolist_list_var.first()) {
                            handle_file_form(ts_file, sub_form);
                        }
                    }
                } else {
                    if (operator == DEFINE) {
                        {
                            SubLObject method_name = second(translated_form);
                            ts_file_note_function_definition(ts_file, method_name, translated_form);
                        }
                    } else {
                        if (operator == DEFINE_MACROEXPANDER) {
                            {
                                SubLObject method_name = second(translated_form);
                                ts_file_note_macro_definition(ts_file, method_name, translated_form);
                            }
                        } else {
                            if ((((operator == DEFVAR) || (operator == DEFPARAMETER)) || (operator == DEFLEXICAL)) || (operator == DEFCONSTANT)) {
                                {
                                    SubLObject global_name = second(translated_form);
                                    ts_file_note_global_definition(ts_file, global_name, translated_form);
                                }
                            } else {
                                if (operator == $sym103$_DEFSTRUCT_CLASS) {
                                    {
                                        SubLObject structure_name = getf(translated_form.rest(), $NAME, UNPROVIDED);
                                        ts_file_note_class_definition(ts_file, structure_name, translated_form);
                                    }
                                } else {
                                    if (operator == IN_PACKAGE) {
                                        {
                                            SubLObject package_name = second(translated_form);
                                            $package$.setDynamicValue(find_package(package_name));
                                        }
                                    } else {
                                        ts_file_note_top_level_form(ts_file, translated_form);
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

    public static SubLObject handle_file_form(final SubLObject ts_file, final SubLObject translated_form) {
        if (translated_form.isCons()) {
            final SubLObject operator = translated_form.first();
            if (operator == PROGN) {
                SubLObject cdolist_list_var = translated_form.rest();
                SubLObject sub_form = NIL;
                sub_form = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    handle_file_form(ts_file, sub_form);
                    cdolist_list_var = cdolist_list_var.rest();
                    sub_form = cdolist_list_var.first();
                } 
            } else
                if (operator == DEFINE) {
                    final SubLObject method_name = second(translated_form);
                    ts_file_note_function_definition(ts_file, method_name, translated_form);
                } else
                    if (operator == DEFINE_MACROEXPANDER) {
                        final SubLObject method_name = second(translated_form);
                        ts_file_note_macro_definition(ts_file, method_name, translated_form);
                    } else
                        if ((((operator == DEFVAR) || (operator == DEFPARAMETER)) || (operator == DEFLEXICAL)) || (operator == DEFCONSTANT)) {
                            final SubLObject global_name = second(translated_form);
                            ts_file_note_global_definition(ts_file, global_name, translated_form);
                        } else
                            if (operator == $sym108$_DEFSTRUCT_CLASS) {
                                final SubLObject structure_name = getf(translated_form.rest(), $NAME, UNPROVIDED);
                                ts_file_note_class_definition(ts_file, structure_name, translated_form);
                            } else
                                if (operator == IN_PACKAGE) {
                                    final SubLObject package_name = second(translated_form);
                                    $package$.setDynamicValue(find_package(package_name));
                                } else {
                                    ts_file_note_top_level_form(ts_file, translated_form);
                                }





        }
        return NIL;
    }

    public static final SubLObject finalize_ts_file_alt(SubLObject ts_file) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            _csetf_tsf_definitions(ts_file, nreverse(tsf_definitions(ts_file)));
            _csetf_tsf_top_level_forms(ts_file, nreverse(tsf_top_level_forms(ts_file)));
            _csetf_tsf_defined_globals(ts_file, nreverse(tsf_defined_globals(ts_file)));
            _csetf_tsf_defined_functions(ts_file, nreverse(tsf_defined_functions(ts_file)));
            _csetf_tsf_defined_macros(ts_file, nreverse(tsf_defined_macros(ts_file)));
            thread.resetMultipleValues();
            {
                SubLObject file_declare = ts_file_compute_initialization_methods(ts_file);
                SubLObject file_init = thread.secondMultipleValue();
                SubLObject file_setup = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject file_declare_function = second(file_declare);
                    SubLObject file_init_function = second(file_init);
                    SubLObject file_setup_function = second(file_setup);
                    _csetf_tsf_definitions(ts_file, nconc(tsf_definitions(ts_file), list(file_declare, file_init, file_setup)));
                    _csetf_tsf_defined_functions(ts_file, nconc(tsf_defined_functions(ts_file), list(file_declare_function, file_init_function, file_setup_function)));
                    system_translation.sys_tran_possibly_note_module_initialization_methods(tsf_module_name(ts_file), file_declare_function, file_init_function, file_setup_function);
                }
            }
            return ts_file;
        }
    }

    public static SubLObject finalize_ts_file(final SubLObject ts_file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        _csetf_tsf_definitions(ts_file, nreverse(tsf_definitions(ts_file)));
        _csetf_tsf_top_level_forms(ts_file, nreverse(tsf_top_level_forms(ts_file)));
        _csetf_tsf_defined_globals(ts_file, nreverse(tsf_defined_globals(ts_file)));
        _csetf_tsf_defined_functions(ts_file, nreverse(tsf_defined_functions(ts_file)));
        _csetf_tsf_defined_macros(ts_file, nreverse(tsf_defined_macros(ts_file)));
        thread.resetMultipleValues();
        final SubLObject file_declare = ts_file_compute_initialization_methods(ts_file);
        final SubLObject file_init = thread.secondMultipleValue();
        final SubLObject file_setup = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject file_declare_function = second(file_declare);
        final SubLObject file_init_function = second(file_init);
        final SubLObject file_setup_function = second(file_setup);
        _csetf_tsf_definitions(ts_file, nconc(tsf_definitions(ts_file), list(file_declare, file_init, file_setup)));
        _csetf_tsf_defined_functions(ts_file, nconc(tsf_defined_functions(ts_file), list(file_declare_function, file_init_function, file_setup_function)));
        system_translation.sys_tran_possibly_note_module_initialization_methods(tsf_module_name(ts_file), file_declare_function, file_init_function, file_setup_function);
        return ts_file;
    }

    public static final SubLObject ts_file_compute_initialization_methods_alt(SubLObject ts_file) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject file_declare = NIL;
                SubLObject file_init = NIL;
                SubLObject file_setup = NIL;
                SubLObject module_name = tsf_module_name(ts_file);
                SubLObject declare_forms = NIL;
                SubLObject init_forms = NIL;
                {
                    SubLObject cdolist_list_var = ts_file_internal_constants_info(ts_file);
                    SubLObject cons = NIL;
                    for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                        {
                            SubLObject datum = cons;
                            SubLObject current = datum;
                            SubLObject constant_form = NIL;
                            SubLObject internal_id = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt106);
                            constant_form = current.first();
                            current = current.rest();
                            internal_id = current;
                            {
                                SubLObject initialization_form = translate_constant_initialization_form(constant_form);
                                init_forms = cons(list($sym107$_INTERNAL_CONSTANT, internal_id, constant_form, initialization_form), init_forms);
                            }
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = tsf_definitions(ts_file);
                    SubLObject definition = NIL;
                    for (definition = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , definition = cdolist_list_var.first()) {
                        {
                            SubLObject datum = definition;
                            SubLObject current = datum;
                            SubLObject operator = NIL;
                            SubLObject name = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt108);
                            operator = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt108);
                            name = current.first();
                            current = current.rest();
                            {
                                SubLObject rest = current;
                                if (operator == DEFINE_MACROEXPANDER) {
                                    declare_forms = cons(list($sym109$_REGISTER_MACRO, name), declare_forms);
                                } else {
                                    if (operator == DEFINE) {
                                        {
                                            SubLObject datum_6 = rest;
                                            SubLObject current_7 = datum_6;
                                            SubLObject arglist = NIL;
                                            destructuring_bind_must_consp(current_7, datum_6, $list_alt110);
                                            arglist = current_7.first();
                                            current_7 = current_7.rest();
                                            {
                                                SubLObject body = current_7;
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject required_count = function_arglist_signature_info(arglist);
                                                    SubLObject optional_count = thread.secondMultipleValue();
                                                    SubLObject restP = thread.thirdMultipleValue();
                                                    thread.resetMultipleValues();
                                                    declare_forms = cons(list($sym111$_REGISTER_FUNCTION, name, required_count, optional_count, restP), declare_forms);
                                                }
                                            }
                                        }
                                    } else {
                                        if ((((operator == DEFVAR) || (operator == DEFPARAMETER)) || (operator == DEFLEXICAL)) || (operator == DEFCONSTANT)) {
                                            {
                                                SubLObject datum_8 = rest;
                                                SubLObject current_9 = datum_8;
                                                SubLObject initialization = NIL;
                                                destructuring_bind_must_consp(current_9, datum_8, $list_alt112);
                                                initialization = current_9.first();
                                                current_9 = current_9.rest();
                                                {
                                                    SubLObject documentation = (current_9.isCons()) ? ((SubLObject) (current_9.first())) : NIL;
                                                    destructuring_bind_must_listp(current_9, datum_8, $list_alt112);
                                                    current_9 = current_9.rest();
                                                    if (NIL == current_9) {
                                                        init_forms = cons(list($sym113$_REGISTER_GLOBAL, operator, name, initialization), init_forms);
                                                    } else {
                                                        cdestructuring_bind_error(datum_8, $list_alt112);
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
                {
                    SubLObject file_declare_name = cconcatenate($str_alt114$DECLARE_, new SubLObject[]{ format_nil.format_nil_a_no_copy(module_name), $str_alt115$_FILE });
                    SubLObject file_declare_function = intern(file_declare_name, $package$.getDynamicValue(thread));
                    tsf_possibly_note_defined_function_arglist(file_declare_function, NIL);
                    file_declare = listS(DEFINE, file_declare_function, NIL, append(nreverse(declare_forms), list(list(RET, form_translation.translate_form(NIL)))));
                }
                {
                    SubLObject file_init_name = cconcatenate($str_alt117$INIT_, new SubLObject[]{ format_nil.format_nil_a_no_copy(module_name), $str_alt115$_FILE });
                    SubLObject file_init_function = intern(file_init_name, $package$.getDynamicValue(thread));
                    tsf_possibly_note_defined_function_arglist(file_init_function, NIL);
                    file_init = listS(DEFINE, file_init_function, NIL, append(nreverse(init_forms), list(list(RET, form_translation.translate_form(NIL)))));
                }
                {
                    SubLObject file_setup_name = cconcatenate($str_alt118$SETUP_, new SubLObject[]{ format_nil.format_nil_a_no_copy(module_name), $str_alt115$_FILE });
                    SubLObject file_setup_function = intern(file_setup_name, $package$.getDynamicValue(thread));
                    tsf_possibly_note_defined_function_arglist(file_setup_function, NIL);
                    file_setup = listS(DEFINE, file_setup_function, NIL, append(tsf_top_level_forms(ts_file), list(list(RET, form_translation.translate_form(NIL)))));
                }
                return values(file_declare, file_init, file_setup);
            }
        }
    }

    public static SubLObject ts_file_compute_initialization_methods(final SubLObject ts_file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject file_declare = NIL;
        SubLObject file_init = NIL;
        SubLObject file_setup = NIL;
        final SubLObject module_name = tsf_module_name(ts_file);
        SubLObject declare_forms = NIL;
        SubLObject init_forms = NIL;
        SubLObject cdolist_list_var = ts_file_internal_constants_info(ts_file);
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject constant_form = NIL;
            SubLObject internal_id = NIL;
            destructuring_bind_must_consp(current, datum, $list111);
            constant_form = current.first();
            current = internal_id = current.rest();
            final SubLObject initialization_form = translate_constant_initialization_form(constant_form);
            init_forms = cons(list($sym112$_INTERNAL_CONSTANT, internal_id, constant_form, initialization_form), init_forms);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        cdolist_list_var = tsf_definitions(ts_file);
        SubLObject definition = NIL;
        definition = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = definition;
            SubLObject operator = NIL;
            SubLObject name = NIL;
            destructuring_bind_must_consp(current, datum, $list113);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list113);
            name = current.first();
            final SubLObject rest;
            current = rest = current.rest();
            if (operator == DEFINE_MACROEXPANDER) {
                declare_forms = cons(list($sym114$_REGISTER_MACRO, name), declare_forms);
            } else
                if (operator == DEFINE) {
                    SubLObject current_$5;
                    final SubLObject datum_$4 = current_$5 = rest;
                    SubLObject arglist = NIL;
                    destructuring_bind_must_consp(current_$5, datum_$4, $list115);
                    arglist = current_$5.first();
                    final SubLObject body;
                    current_$5 = body = current_$5.rest();
                    thread.resetMultipleValues();
                    final SubLObject required_count = function_arglist_signature_info(arglist);
                    final SubLObject optional_count = thread.secondMultipleValue();
                    final SubLObject restP = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    declare_forms = cons(list($sym116$_REGISTER_FUNCTION, name, required_count, optional_count, restP), declare_forms);
                } else
                    if ((((operator == DEFVAR) || (operator == DEFPARAMETER)) || (operator == DEFLEXICAL)) || (operator == DEFCONSTANT)) {
                        SubLObject current_$6;
                        final SubLObject datum_$5 = current_$6 = rest;
                        SubLObject initialization = NIL;
                        destructuring_bind_must_consp(current_$6, datum_$5, $list117);
                        initialization = current_$6.first();
                        current_$6 = current_$6.rest();
                        final SubLObject documentation = (current_$6.isCons()) ? current_$6.first() : NIL;
                        destructuring_bind_must_listp(current_$6, datum_$5, $list117);
                        current_$6 = current_$6.rest();
                        if (NIL == current_$6) {
                            init_forms = cons(list($sym118$_REGISTER_GLOBAL, operator, name, initialization), init_forms);
                        } else {
                            cdestructuring_bind_error(datum_$5, $list117);
                        }
                    }


            cdolist_list_var = cdolist_list_var.rest();
            definition = cdolist_list_var.first();
        } 
        final SubLObject file_declare_name = cconcatenate($str119$DECLARE_, new SubLObject[]{ format_nil.format_nil_a_no_copy(module_name), $str120$_FILE });
        final SubLObject file_declare_function = intern(file_declare_name, $package$.getDynamicValue(thread));
        tsf_possibly_note_defined_function_arglist(file_declare_function, NIL);
        file_declare = listS(DEFINE, file_declare_function, NIL, append(nreverse(declare_forms), list(list(RET, form_translation.translate_form(NIL)))));
        final SubLObject file_init_name = cconcatenate($str122$INIT_, new SubLObject[]{ format_nil.format_nil_a_no_copy(module_name), $str120$_FILE });
        final SubLObject file_init_function = intern(file_init_name, $package$.getDynamicValue(thread));
        tsf_possibly_note_defined_function_arglist(file_init_function, NIL);
        file_init = listS(DEFINE, file_init_function, NIL, append(nreverse(init_forms), list(list(RET, form_translation.translate_form(NIL)))));
        final SubLObject file_setup_name = cconcatenate($str123$SETUP_, new SubLObject[]{ format_nil.format_nil_a_no_copy(module_name), $str120$_FILE });
        final SubLObject file_setup_function = intern(file_setup_name, $package$.getDynamicValue(thread));
        tsf_possibly_note_defined_function_arglist(file_setup_function, NIL);
        file_setup = listS(DEFINE, file_setup_function, NIL, append(tsf_top_level_forms(ts_file), list(list(RET, form_translation.translate_form(NIL)))));
        return values(file_declare, file_init, file_setup);
    }

    public static final SubLObject ts_file_declare_method_alt(SubLObject ts_file) {
        {
            SubLObject sys_tran = system_translation.current_system_translation();
            if (NIL != sys_tran) {
                {
                    SubLObject module = ts_file_module_name(ts_file);
                    return system_translation.sys_tran_module_declare_function(sys_tran, module);
                }
            }
        }
        return NIL;
    }

    public static SubLObject ts_file_declare_method(final SubLObject ts_file) {
        final SubLObject sys_tran = system_translation.current_system_translation();
        if (NIL != sys_tran) {
            final SubLObject module = ts_file_module_name(ts_file);
            return system_translation.sys_tran_module_declare_function(sys_tran, module);
        }
        return NIL;
    }

    public static final SubLObject ts_file_init_method_alt(SubLObject ts_file) {
        {
            SubLObject sys_tran = system_translation.current_system_translation();
            if (NIL != sys_tran) {
                {
                    SubLObject module = ts_file_module_name(ts_file);
                    return system_translation.sys_tran_module_init_function(sys_tran, module);
                }
            }
        }
        return NIL;
    }

    public static SubLObject ts_file_init_method(final SubLObject ts_file) {
        final SubLObject sys_tran = system_translation.current_system_translation();
        if (NIL != sys_tran) {
            final SubLObject module = ts_file_module_name(ts_file);
            return system_translation.sys_tran_module_init_function(sys_tran, module);
        }
        return NIL;
    }

    public static final SubLObject ts_file_setup_method_alt(SubLObject ts_file) {
        {
            SubLObject sys_tran = system_translation.current_system_translation();
            if (NIL != sys_tran) {
                {
                    SubLObject module = ts_file_module_name(ts_file);
                    return system_translation.sys_tran_module_setup_function(sys_tran, module);
                }
            }
        }
        return NIL;
    }

    public static SubLObject ts_file_setup_method(final SubLObject ts_file) {
        final SubLObject sys_tran = system_translation.current_system_translation();
        if (NIL != sys_tran) {
            final SubLObject module = ts_file_module_name(ts_file);
            return system_translation.sys_tran_module_setup_function(sys_tran, module);
        }
        return NIL;
    }

    public static final SubLObject current_ts_file_initializerP_alt(SubLObject method) {
        if (method.isSymbol()) {
            {
                SubLObject ts_file = current_ts_file();
                return makeBoolean((NIL != ts_file) && (((method == ts_file_declare_method(ts_file)) || (method == ts_file_init_method(ts_file))) || (method == ts_file_setup_method(ts_file))));
            }
        }
        return NIL;
    }

    public static SubLObject current_ts_file_initializerP(final SubLObject method) {
        if (method.isSymbol()) {
            final SubLObject ts_file = current_ts_file();
            return makeBoolean((NIL != ts_file) && ((method.eql(ts_file_declare_method(ts_file)) || method.eql(ts_file_init_method(ts_file))) || method.eql(ts_file_setup_method(ts_file))));
        }
        return NIL;
    }

    public static final SubLObject translate_constant_initialization_form_alt(SubLObject v_object) {
        if (v_object.isVector()) {
            {
                SubLObject translated_items = NIL;
                SubLObject vector_var = v_object;
                SubLObject backwardP_var = NIL;
                SubLObject length = length(vector_var);
                SubLObject v_iteration = NIL;
                for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    {
                        SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                        SubLObject item = aref(vector_var, element_num);
                        translated_items = cons(translate_constant_initialization_form(item), translated_items);
                    }
                }
                return bq_cons(VECTOR, append(nreverse(translated_items), NIL));
            }
        } else {
            if (v_object.isCons()) {
                {
                    SubLObject translated_items = NIL;
                    SubLObject translated_final_cdr = NIL;
                    SubLObject pair = NIL;
                    for (pair = v_object; !pair.isAtom(); pair = pair.rest()) {
                        {
                            SubLObject item = pair.first();
                            translated_items = cons(translate_constant_initialization_form(item), translated_items);
                        }
                    }
                    if (NIL != list_utilities.dotted_list_p(v_object)) {
                        translated_final_cdr = translate_constant_initialization_form(last(v_object, UNPROVIDED).rest());
                    }
                    if (NIL == translated_final_cdr) {
                        return bq_cons(LIST, append(nreverse(translated_items), NIL));
                    } else {
                        if (NIL != list_utilities.singletonP(translated_items)) {
                            return list(CONS, translated_items.first(), translated_final_cdr);
                        } else {
                            return bq_cons($sym122$LIST_, append(nreverse(translated_items), list(translated_final_cdr)));
                        }
                    }
                }
            } else {
                if (NIL != predefined_constant_p(v_object)) {
                    return list($sym87$_PC, v_object);
                } else {
                    if (v_object.isFunction()) {
                        {
                            SubLObject symbol = translator_symbol_for_function(v_object);
                            SubLObject translated_symbol = translate_constant_initialization_form(symbol);
                            return list(SYMBOL_FUNCTION, translated_symbol);
                        }
                    } else {
                        if (NIL != constant_p(v_object)) {
                            {
                                SubLObject name = constants_high.constant_name(v_object);
                                tsf_possibly_note_referenced_function(READER_MAKE_CONSTANT_SHELL);
                                return list(READER_MAKE_CONSTANT_SHELL, translate_constant_initialization_form(name));
                            }
                        } else {
                            v_object = form_translation.possibly_translate_implementation_symbols(v_object);
                            return list($sym125$_LF, v_object);
                        }
                    }
                }
            }
        }
    }

    public static SubLObject translate_constant_initialization_form(SubLObject v_object) {
        if (v_object.isVector()) {
            SubLObject translated_items = NIL;
            final SubLObject vector_var = v_object;
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject item;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                item = aref(vector_var, element_num);
                translated_items = cons(translate_constant_initialization_form(item), translated_items);
            }
            return bq_cons(VECTOR, append(nreverse(translated_items), NIL));
        }
        if (v_object.isCons()) {
            SubLObject translated_items = NIL;
            SubLObject translated_final_cdr = NIL;
            SubLObject pair;
            SubLObject item2;
            for (pair = NIL, pair = v_object; !pair.isAtom(); pair = pair.rest()) {
                item2 = pair.first();
                translated_items = cons(translate_constant_initialization_form(item2), translated_items);
            }
            if (NIL != list_utilities.dotted_list_p(v_object)) {
                translated_final_cdr = translate_constant_initialization_form(last(v_object, UNPROVIDED).rest());
            }
            if (NIL == translated_final_cdr) {
                return bq_cons(LIST, append(nreverse(translated_items), NIL));
            }
            if (NIL != list_utilities.singletonP(translated_items)) {
                return list(CONS, translated_items.first(), translated_final_cdr);
            }
            return bq_cons($sym127$LIST_, append(nreverse(translated_items), list(translated_final_cdr)));
        } else {
            if (NIL != predefined_constant_p(v_object)) {
                return list($sym92$_PC, v_object);
            }
            if (v_object.isFunction()) {
                final SubLObject symbol = translator_symbol_for_function(v_object);
                final SubLObject translated_symbol = translate_constant_initialization_form(symbol);
                return list(SYMBOL_FUNCTION, translated_symbol);
            }
            if (NIL != constant_p(v_object)) {
                final SubLObject name = constants_high.constant_name(v_object);
                tsf_possibly_note_referenced_function(READER_MAKE_CONSTANT_SHELL);
                return list(READER_MAKE_CONSTANT_SHELL, translate_constant_initialization_form(name));
            }
            v_object = form_translation.possibly_translate_implementation_symbols(v_object);
            return list($sym130$_LF, v_object);
        }
    }

    public static final SubLObject translator_symbol_for_function_alt(SubLObject v_object) {
        if (v_object == symbol_function(EQ)) {
            return EQ;
        } else {
            if (v_object == symbol_function(EQL)) {
                return EQL;
            } else {
                if (v_object == symbol_function(EQUAL)) {
                    return EQUAL;
                } else {
                    if (v_object == symbol_function(EQUALP)) {
                        return EQUALP;
                    } else {
                        return Errors.error($str_alt126$Time_to_implement_function_consta, v_object);
                    }
                }
            }
        }
    }

    public static SubLObject translator_symbol_for_function(final SubLObject v_object) {
        if (v_object.eql(symbol_function(EQ))) {
            return EQ;
        }
        if (v_object.eql(symbol_function(EQL))) {
            return EQL;
        }
        if (v_object.eql(symbol_function(EQUAL))) {
            return EQUAL;
        }
        if (v_object.eql(symbol_function(EQUALP))) {
            return EQUALP;
        }
        return Errors.error($str131$Time_to_implement_function_consta, v_object);
    }

    public static final SubLObject predefined_constant_p_alt(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $predefined_constants$.getGlobalValue());
    }

    public static SubLObject predefined_constant_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $predefined_constants$.getGlobalValue());
    }

    public static SubLObject declare_file_translation_file() {
        declareFunction("current_ts_file", "CURRENT-TS-FILE", 0, 0, false);
        declareFunction("trans_subl_file_print_function_trampoline", "TRANS-SUBL-FILE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("trans_subl_file_p", "TRANS-SUBL-FILE-P", 1, 0, false);
        new file_translation.$trans_subl_file_p$UnaryFunction();
        declareFunction("tsf_module_name", "TSF-MODULE-NAME", 1, 0, false);
        declareFunction("tsf_filename", "TSF-FILENAME", 1, 0, false);
        declareFunction("tsf_internal_constants", "TSF-INTERNAL-CONSTANTS", 1, 0, false);
        declareFunction("tsf_referenced_globals", "TSF-REFERENCED-GLOBALS", 1, 0, false);
        declareFunction("tsf_referenced_functions", "TSF-REFERENCED-FUNCTIONS", 1, 0, false);
        declareFunction("tsf_definitions", "TSF-DEFINITIONS", 1, 0, false);
        declareFunction("tsf_top_level_forms", "TSF-TOP-LEVEL-FORMS", 1, 0, false);
        declareFunction("tsf_defined_globals", "TSF-DEFINED-GLOBALS", 1, 0, false);
        declareFunction("tsf_defined_functions", "TSF-DEFINED-FUNCTIONS", 1, 0, false);
        declareFunction("tsf_defined_macros", "TSF-DEFINED-MACROS", 1, 0, false);
        declareFunction("tsf_arglist_table", "TSF-ARGLIST-TABLE", 1, 0, false);
        declareFunction("tsf_binding_type_table", "TSF-BINDING-TYPE-TABLE", 1, 0, false);
        declareFunction("tsf_method_visibility_table", "TSF-METHOD-VISIBILITY-TABLE", 1, 0, false);
        declareFunction("tsf_global_visibility_table", "TSF-GLOBAL-VISIBILITY-TABLE", 1, 0, false);
        declareFunction("tsf_rwbc_methods", "TSF-RWBC-METHODS", 1, 0, false);
        declareFunction("_csetf_tsf_module_name", "_CSETF-TSF-MODULE-NAME", 2, 0, false);
        declareFunction("_csetf_tsf_filename", "_CSETF-TSF-FILENAME", 2, 0, false);
        declareFunction("_csetf_tsf_internal_constants", "_CSETF-TSF-INTERNAL-CONSTANTS", 2, 0, false);
        declareFunction("_csetf_tsf_referenced_globals", "_CSETF-TSF-REFERENCED-GLOBALS", 2, 0, false);
        declareFunction("_csetf_tsf_referenced_functions", "_CSETF-TSF-REFERENCED-FUNCTIONS", 2, 0, false);
        declareFunction("_csetf_tsf_definitions", "_CSETF-TSF-DEFINITIONS", 2, 0, false);
        declareFunction("_csetf_tsf_top_level_forms", "_CSETF-TSF-TOP-LEVEL-FORMS", 2, 0, false);
        declareFunction("_csetf_tsf_defined_globals", "_CSETF-TSF-DEFINED-GLOBALS", 2, 0, false);
        declareFunction("_csetf_tsf_defined_functions", "_CSETF-TSF-DEFINED-FUNCTIONS", 2, 0, false);
        declareFunction("_csetf_tsf_defined_macros", "_CSETF-TSF-DEFINED-MACROS", 2, 0, false);
        declareFunction("_csetf_tsf_arglist_table", "_CSETF-TSF-ARGLIST-TABLE", 2, 0, false);
        declareFunction("_csetf_tsf_binding_type_table", "_CSETF-TSF-BINDING-TYPE-TABLE", 2, 0, false);
        declareFunction("_csetf_tsf_method_visibility_table", "_CSETF-TSF-METHOD-VISIBILITY-TABLE", 2, 0, false);
        declareFunction("_csetf_tsf_global_visibility_table", "_CSETF-TSF-GLOBAL-VISIBILITY-TABLE", 2, 0, false);
        declareFunction("_csetf_tsf_rwbc_methods", "_CSETF-TSF-RWBC-METHODS", 2, 0, false);
        declareFunction("make_trans_subl_file", "MAKE-TRANS-SUBL-FILE", 0, 1, false);
        declareFunction("visit_defstruct_trans_subl_file", "VISIT-DEFSTRUCT-TRANS-SUBL-FILE", 2, 0, false);
        declareFunction("visit_defstruct_object_trans_subl_file_method", "VISIT-DEFSTRUCT-OBJECT-TRANS-SUBL-FILE-METHOD", 2, 0, false);
        declareFunction("print_trans_subl_file", "PRINT-TRANS-SUBL-FILE", 3, 0, false);
        declareFunction("sxhash_trans_subl_file_method", "SXHASH-TRANS-SUBL-FILE-METHOD", 1, 0, false);
        declareFunction("new_ts_file", "NEW-TS-FILE", 2, 0, false);
        declareFunction("destroy_trans_subl_file", "DESTROY-TRANS-SUBL-FILE", 1, 0, false);
        declareFunction("ts_file_module_name", "TS-FILE-MODULE-NAME", 1, 0, false);
        declareFunction("ts_file_filename", "TS-FILE-FILENAME", 1, 0, false);
        declareFunction("ts_file_definitions", "TS-FILE-DEFINITIONS", 1, 0, false);
        declareFunction("ts_file_internal_constant_count", "TS-FILE-INTERNAL-CONSTANT-COUNT", 1, 0, false);
        declareFunction("ts_file_next_internal_constant_id", "TS-FILE-NEXT-INTERNAL-CONSTANT-ID", 1, 0, false);
        declareFunction("ts_file_internal_constants_info", "TS-FILE-INTERNAL-CONSTANTS-INFO", 1, 0, false);
        declareFunction("ts_file_all_referenced_globals", "TS-FILE-ALL-REFERENCED-GLOBALS", 1, 0, false);
        declareFunction("ts_file_all_defined_globals", "TS-FILE-ALL-DEFINED-GLOBALS", 1, 0, false);
        declareFunction("ts_file_all_referenced_functions", "TS-FILE-ALL-REFERENCED-FUNCTIONS", 1, 0, false);
        declareFunction("ts_file_all_defined_functions", "TS-FILE-ALL-DEFINED-FUNCTIONS", 1, 0, false);
        declareFunction("ts_file_all_defined_private_functions", "TS-FILE-ALL-DEFINED-PRIVATE-FUNCTIONS", 1, 0, false);
        declareFunction("ts_file_function_arglist", "TS-FILE-FUNCTION-ARGLIST", 2, 0, false);
        declareFunction("current_ts_file_defined_function_arglist", "CURRENT-TS-FILE-DEFINED-FUNCTION-ARGLIST", 1, 0, false);
        declareFunction("ts_file_defined_global_binding_type", "TS-FILE-DEFINED-GLOBAL-BINDING-TYPE", 2, 0, false);
        declareFunction("ts_file_global_binding_type", "TS-FILE-GLOBAL-BINDING-TYPE", 2, 0, false);
        declareFunction("current_ts_file_global_binding_type", "CURRENT-TS-FILE-GLOBAL-BINDING-TYPE", 1, 0, false);
        declareFunction("ts_file_defined_method_visibility", "TS-FILE-DEFINED-METHOD-VISIBILITY", 2, 0, false);
        declareFunction("ts_file_defined_private_method_p", "TS-FILE-DEFINED-PRIVATE-METHOD-P", 2, 0, false);
        declareFunction("current_ts_file_defined_private_method_p", "CURRENT-TS-FILE-DEFINED-PRIVATE-METHOD-P", 1, 0, false);
        declareFunction("ts_file_defined_global_visibility", "TS-FILE-DEFINED-GLOBAL-VISIBILITY", 2, 0, false);
        declareFunction("ts_file_defined_private_global_p", "TS-FILE-DEFINED-PRIVATE-GLOBAL-P", 2, 0, false);
        declareFunction("current_ts_file_defined_private_global_p", "CURRENT-TS-FILE-DEFINED-PRIVATE-GLOBAL-P", 1, 0, false);
        declareFunction("ts_file_private_global_definition_p", "TS-FILE-PRIVATE-GLOBAL-DEFINITION-P", 2, 0, false);
        declareFunction("ts_file_private_global_definitions", "TS-FILE-PRIVATE-GLOBAL-DEFINITIONS", 1, 0, false);
        declareFunction("ts_file_method_returns_within_binding_constructP", "TS-FILE-METHOD-RETURNS-WITHIN-BINDING-CONSTRUCT?", 2, 0, false);
        declareFunction("ts_file_internal_constant_id_lookup", "TS-FILE-INTERNAL-CONSTANT-ID-LOOKUP", 2, 0, false);
        declareFunction("ts_file_note_function_definition", "TS-FILE-NOTE-FUNCTION-DEFINITION", 3, 0, false);
        declareFunction("ts_file_note_macro_definition", "TS-FILE-NOTE-MACRO-DEFINITION", 3, 0, false);
        declareFunction("ts_file_note_global_definition", "TS-FILE-NOTE-GLOBAL-DEFINITION", 3, 0, false);
        declareFunction("ts_file_note_class_definition", "TS-FILE-NOTE-CLASS-DEFINITION", 3, 0, false);
        declareFunction("ts_file_note_top_level_form", "TS-FILE-NOTE-TOP-LEVEL-FORM", 2, 0, false);
        declareMacro("with_translator_output_file", "WITH-TRANSLATOR-OUTPUT-FILE");
        declareFunction("possibly_delete_file", "POSSIBLY-DELETE-FILE", 1, 0, false);
        declareFunction("show_trans_subl_file", "SHOW-TRANS-SUBL-FILE", 1, 1, false);
        declareFunction("print_subl_expression", "PRINT-SUBL-EXPRESSION", 1, 2, false);
        declareFunction("function_signature_info", "FUNCTION-SIGNATURE-INFO", 1, 0, false);
        declareFunction("function_arglist_signature_info", "FUNCTION-ARGLIST-SIGNATURE-INFO", 1, 0, false);
        declareFunction("tsf_possibly_convert_internal_constant", "TSF-POSSIBLY-CONVERT-INTERNAL-CONSTANT", 1, 0, false);
        declareFunction("tsf_possibly_note_referenced_global", "TSF-POSSIBLY-NOTE-REFERENCED-GLOBAL", 1, 0, false);
        declareFunction("tsf_possibly_note_referenced_function", "TSF-POSSIBLY-NOTE-REFERENCED-FUNCTION", 1, 0, false);
        declareFunction("tsf_possibly_note_defined_function_arglist", "TSF-POSSIBLY-NOTE-DEFINED-FUNCTION-ARGLIST", 2, 0, false);
        declareFunction("tsf_possibly_note_defined_global_binding_type", "TSF-POSSIBLY-NOTE-DEFINED-GLOBAL-BINDING-TYPE", 2, 0, false);
        declareFunction("tsf_possibly_note_defined_method_visibility", "TSF-POSSIBLY-NOTE-DEFINED-METHOD-VISIBILITY", 2, 0, false);
        declareFunction("tsf_possibly_note_defined_global_visibility", "TSF-POSSIBLY-NOTE-DEFINED-GLOBAL-VISIBILITY", 2, 0, false);
        declareFunction("tsf_possibly_note_method_returns_within_binding_construct", "TSF-POSSIBLY-NOTE-METHOD-RETURNS-WITHIN-BINDING-CONSTRUCT", 1, 0, false);
        declareFunction("translate_file", "TRANSLATE-FILE", 2, 0, false);
        declareFunction("ts_file_translate_form", "TS-FILE-TRANSLATE-FORM", 2, 0, false);
        declareFunction("handle_file_form", "HANDLE-FILE-FORM", 2, 0, false);
        declareFunction("finalize_ts_file", "FINALIZE-TS-FILE", 1, 0, false);
        declareFunction("ts_file_compute_initialization_methods", "TS-FILE-COMPUTE-INITIALIZATION-METHODS", 1, 0, false);
        declareFunction("ts_file_declare_method", "TS-FILE-DECLARE-METHOD", 1, 0, false);
        declareFunction("ts_file_init_method", "TS-FILE-INIT-METHOD", 1, 0, false);
        declareFunction("ts_file_setup_method", "TS-FILE-SETUP-METHOD", 1, 0, false);
        declareFunction("current_ts_file_initializerP", "CURRENT-TS-FILE-INITIALIZER?", 1, 0, false);
        declareFunction("translate_constant_initialization_form", "TRANSLATE-CONSTANT-INITIALIZATION-FORM", 1, 0, false);
        declareFunction("translator_symbol_for_function", "TRANSLATOR-SYMBOL-FOR-FUNCTION", 1, 0, false);
        declareFunction("predefined_constant_p", "PREDEFINED-CONSTANT-P", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt2 = list(new SubLObject[]{ makeSymbol("MODULE-NAME"), makeSymbol("FILENAME"), makeSymbol("INTERNAL-CONSTANTS"), makeSymbol("REFERENCED-GLOBALS"), makeSymbol("REFERENCED-FUNCTIONS"), makeSymbol("DEFINITIONS"), makeSymbol("TOP-LEVEL-FORMS"), makeSymbol("DEFINED-GLOBALS"), makeSymbol("DEFINED-FUNCTIONS"), makeSymbol("DEFINED-MACROS"), makeSymbol("ARGLIST-TABLE"), makeSymbol("BINDING-TYPE-TABLE"), makeSymbol("METHOD-VISIBILITY-TABLE"), makeSymbol("GLOBAL-VISIBILITY-TABLE"), makeSymbol("RWBC-METHODS") });

    static private final SubLList $list_alt3 = list(new SubLObject[]{ makeKeyword("MODULE-NAME"), makeKeyword("FILENAME"), makeKeyword("INTERNAL-CONSTANTS"), makeKeyword("REFERENCED-GLOBALS"), makeKeyword("REFERENCED-FUNCTIONS"), makeKeyword("DEFINITIONS"), makeKeyword("TOP-LEVEL-FORMS"), makeKeyword("DEFINED-GLOBALS"), makeKeyword("DEFINED-FUNCTIONS"), makeKeyword("DEFINED-MACROS"), makeKeyword("ARGLIST-TABLE"), makeKeyword("BINDING-TYPE-TABLE"), makeKeyword("METHOD-VISIBILITY-TABLE"), makeKeyword("GLOBAL-VISIBILITY-TABLE"), makeKeyword("RWBC-METHODS") });

    static private final SubLList $list_alt4 = list(new SubLObject[]{ makeSymbol("TSF-MODULE-NAME"), makeSymbol("TSF-FILENAME"), makeSymbol("TSF-INTERNAL-CONSTANTS"), makeSymbol("TSF-REFERENCED-GLOBALS"), makeSymbol("TSF-REFERENCED-FUNCTIONS"), makeSymbol("TSF-DEFINITIONS"), makeSymbol("TSF-TOP-LEVEL-FORMS"), makeSymbol("TSF-DEFINED-GLOBALS"), makeSymbol("TSF-DEFINED-FUNCTIONS"), makeSymbol("TSF-DEFINED-MACROS"), makeSymbol("TSF-ARGLIST-TABLE"), makeSymbol("TSF-BINDING-TYPE-TABLE"), makeSymbol("TSF-METHOD-VISIBILITY-TABLE"), makeSymbol("TSF-GLOBAL-VISIBILITY-TABLE"), makeSymbol("TSF-RWBC-METHODS") });

    static private final SubLList $list_alt5 = list(new SubLObject[]{ makeSymbol("_CSETF-TSF-MODULE-NAME"), makeSymbol("_CSETF-TSF-FILENAME"), makeSymbol("_CSETF-TSF-INTERNAL-CONSTANTS"), makeSymbol("_CSETF-TSF-REFERENCED-GLOBALS"), makeSymbol("_CSETF-TSF-REFERENCED-FUNCTIONS"), makeSymbol("_CSETF-TSF-DEFINITIONS"), makeSymbol("_CSETF-TSF-TOP-LEVEL-FORMS"), makeSymbol("_CSETF-TSF-DEFINED-GLOBALS"), makeSymbol("_CSETF-TSF-DEFINED-FUNCTIONS"), makeSymbol("_CSETF-TSF-DEFINED-MACROS"), makeSymbol("_CSETF-TSF-ARGLIST-TABLE"), makeSymbol("_CSETF-TSF-BINDING-TYPE-TABLE"), makeSymbol("_CSETF-TSF-METHOD-VISIBILITY-TABLE"), makeSymbol("_CSETF-TSF-GLOBAL-VISIBILITY-TABLE"), makeSymbol("_CSETF-TSF-RWBC-METHODS") });

    public static final SubLObject init_file_translation_file_alt() {
        defparameter("*CURRENT-TS-FILE*", NIL);
        defconstant("*DTP-TRANS-SUBL-FILE*", TRANS_SUBL_FILE);
        deflexical("*TRANS-SUBL-GLOBAL-DEFINERS*", $list_alt67);
        deflexical("*PREDEFINED-CONSTANTS*", $list_alt127);
        return NIL;
    }

    public static SubLObject init_file_translation_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*CURRENT-TS-FILE*", NIL);
            defconstant("*DTP-TRANS-SUBL-FILE*", TRANS_SUBL_FILE);
            deflexical("*TRANS-SUBL-GLOBAL-DEFINERS*", $list70);
            deflexical("*PREDEFINED-CONSTANTS*", $list132);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*TRANS-SUBL-GLOBAL-DEFINERS*", $list_alt67);
            deflexical("*PREDEFINED-CONSTANTS*", $list_alt127);
        }
        return NIL;
    }

    public static SubLObject init_file_translation_file_Previous() {
        defparameter("*CURRENT-TS-FILE*", NIL);
        defconstant("*DTP-TRANS-SUBL-FILE*", TRANS_SUBL_FILE);
        deflexical("*TRANS-SUBL-GLOBAL-DEFINERS*", $list70);
        deflexical("*PREDEFINED-CONSTANTS*", $list132);
        return NIL;
    }

    public static final SubLObject setup_file_translation_file_alt() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_trans_subl_file$.getGlobalValue(), symbol_function(TRANS_SUBL_FILE_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(TSF_MODULE_NAME, _CSETF_TSF_MODULE_NAME);
        def_csetf(TSF_FILENAME, _CSETF_TSF_FILENAME);
        def_csetf(TSF_INTERNAL_CONSTANTS, _CSETF_TSF_INTERNAL_CONSTANTS);
        def_csetf(TSF_REFERENCED_GLOBALS, _CSETF_TSF_REFERENCED_GLOBALS);
        def_csetf(TSF_REFERENCED_FUNCTIONS, _CSETF_TSF_REFERENCED_FUNCTIONS);
        def_csetf(TSF_DEFINITIONS, _CSETF_TSF_DEFINITIONS);
        def_csetf(TSF_TOP_LEVEL_FORMS, _CSETF_TSF_TOP_LEVEL_FORMS);
        def_csetf(TSF_DEFINED_GLOBALS, _CSETF_TSF_DEFINED_GLOBALS);
        def_csetf(TSF_DEFINED_FUNCTIONS, _CSETF_TSF_DEFINED_FUNCTIONS);
        def_csetf(TSF_DEFINED_MACROS, _CSETF_TSF_DEFINED_MACROS);
        def_csetf(TSF_ARGLIST_TABLE, _CSETF_TSF_ARGLIST_TABLE);
        def_csetf(TSF_BINDING_TYPE_TABLE, _CSETF_TSF_BINDING_TYPE_TABLE);
        def_csetf(TSF_METHOD_VISIBILITY_TABLE, _CSETF_TSF_METHOD_VISIBILITY_TABLE);
        def_csetf(TSF_GLOBAL_VISIBILITY_TABLE, _CSETF_TSF_GLOBAL_VISIBILITY_TABLE);
        def_csetf(TSF_RWBC_METHODS, _CSETF_TSF_RWBC_METHODS);
        identity(TRANS_SUBL_FILE);
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_trans_subl_file$.getGlobalValue(), symbol_function(SXHASH_TRANS_SUBL_FILE_METHOD));
        define_test_case_table_int(FUNCTION_ARGLIST_SIGNATURE_INFO, list(new SubLObject[]{ $TEST, symbol_function(EQ), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt135);
        define_test_case_table_int(TRANSLATE_CONSTANT_INITIALIZATION_FORM, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt137);
        return NIL;
    }

    public static SubLObject setup_file_translation_file() {
        if (SubLFiles.USE_V1) {
            register_method($print_object_method_table$.getGlobalValue(), $dtp_trans_subl_file$.getGlobalValue(), symbol_function(TRANS_SUBL_FILE_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list8);
            def_csetf(TSF_MODULE_NAME, _CSETF_TSF_MODULE_NAME);
            def_csetf(TSF_FILENAME, _CSETF_TSF_FILENAME);
            def_csetf(TSF_INTERNAL_CONSTANTS, _CSETF_TSF_INTERNAL_CONSTANTS);
            def_csetf(TSF_REFERENCED_GLOBALS, _CSETF_TSF_REFERENCED_GLOBALS);
            def_csetf(TSF_REFERENCED_FUNCTIONS, _CSETF_TSF_REFERENCED_FUNCTIONS);
            def_csetf(TSF_DEFINITIONS, _CSETF_TSF_DEFINITIONS);
            def_csetf(TSF_TOP_LEVEL_FORMS, _CSETF_TSF_TOP_LEVEL_FORMS);
            def_csetf(TSF_DEFINED_GLOBALS, _CSETF_TSF_DEFINED_GLOBALS);
            def_csetf(TSF_DEFINED_FUNCTIONS, _CSETF_TSF_DEFINED_FUNCTIONS);
            def_csetf(TSF_DEFINED_MACROS, _CSETF_TSF_DEFINED_MACROS);
            def_csetf(TSF_ARGLIST_TABLE, _CSETF_TSF_ARGLIST_TABLE);
            def_csetf(TSF_BINDING_TYPE_TABLE, _CSETF_TSF_BINDING_TYPE_TABLE);
            def_csetf(TSF_METHOD_VISIBILITY_TABLE, _CSETF_TSF_METHOD_VISIBILITY_TABLE);
            def_csetf(TSF_GLOBAL_VISIBILITY_TABLE, _CSETF_TSF_GLOBAL_VISIBILITY_TABLE);
            def_csetf(TSF_RWBC_METHODS, _CSETF_TSF_RWBC_METHODS);
            identity(TRANS_SUBL_FILE);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_trans_subl_file$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_TRANS_SUBL_FILE_METHOD));
            register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_trans_subl_file$.getGlobalValue(), symbol_function(SXHASH_TRANS_SUBL_FILE_METHOD));
            define_test_case_table_int(FUNCTION_ARGLIST_SIGNATURE_INFO, list(new SubLObject[]{ $TEST, symbol_function(EQ), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list140);
            define_test_case_table_int(TRANSLATE_CONSTANT_INITIALIZATION_FORM, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list142);
        }
        if (SubLFiles.USE_V2) {
            define_test_case_table_int(FUNCTION_ARGLIST_SIGNATURE_INFO, list(new SubLObject[]{ $TEST, symbol_function(EQ), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt135);
            define_test_case_table_int(TRANSLATE_CONSTANT_INITIALIZATION_FORM, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt137);
        }
        return NIL;
    }

    public static SubLObject setup_file_translation_file_Previous() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_trans_subl_file$.getGlobalValue(), symbol_function(TRANS_SUBL_FILE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(TSF_MODULE_NAME, _CSETF_TSF_MODULE_NAME);
        def_csetf(TSF_FILENAME, _CSETF_TSF_FILENAME);
        def_csetf(TSF_INTERNAL_CONSTANTS, _CSETF_TSF_INTERNAL_CONSTANTS);
        def_csetf(TSF_REFERENCED_GLOBALS, _CSETF_TSF_REFERENCED_GLOBALS);
        def_csetf(TSF_REFERENCED_FUNCTIONS, _CSETF_TSF_REFERENCED_FUNCTIONS);
        def_csetf(TSF_DEFINITIONS, _CSETF_TSF_DEFINITIONS);
        def_csetf(TSF_TOP_LEVEL_FORMS, _CSETF_TSF_TOP_LEVEL_FORMS);
        def_csetf(TSF_DEFINED_GLOBALS, _CSETF_TSF_DEFINED_GLOBALS);
        def_csetf(TSF_DEFINED_FUNCTIONS, _CSETF_TSF_DEFINED_FUNCTIONS);
        def_csetf(TSF_DEFINED_MACROS, _CSETF_TSF_DEFINED_MACROS);
        def_csetf(TSF_ARGLIST_TABLE, _CSETF_TSF_ARGLIST_TABLE);
        def_csetf(TSF_BINDING_TYPE_TABLE, _CSETF_TSF_BINDING_TYPE_TABLE);
        def_csetf(TSF_METHOD_VISIBILITY_TABLE, _CSETF_TSF_METHOD_VISIBILITY_TABLE);
        def_csetf(TSF_GLOBAL_VISIBILITY_TABLE, _CSETF_TSF_GLOBAL_VISIBILITY_TABLE);
        def_csetf(TSF_RWBC_METHODS, _CSETF_TSF_RWBC_METHODS);
        identity(TRANS_SUBL_FILE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_trans_subl_file$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_TRANS_SUBL_FILE_METHOD));
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_trans_subl_file$.getGlobalValue(), symbol_function(SXHASH_TRANS_SUBL_FILE_METHOD));
        define_test_case_table_int(FUNCTION_ARGLIST_SIGNATURE_INFO, list(new SubLObject[]{ $TEST, symbol_function(EQ), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list140);
        define_test_case_table_int(TRANSLATE_CONSTANT_INITIALIZATION_FORM, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list142);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_file_translation_file();
    }

    @Override
    public void initializeVariables() {
        init_file_translation_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_file_translation_file();
    }

    static {
    }

    public static final class $trans_subl_file_native extends SubLStructNative {
        public SubLObject $module_name;

        public SubLObject $filename;

        public SubLObject $internal_constants;

        public SubLObject $referenced_globals;

        public SubLObject $referenced_functions;

        public SubLObject $definitions;

        public SubLObject $top_level_forms;

        public SubLObject $defined_globals;

        public SubLObject $defined_functions;

        public SubLObject $defined_macros;

        public SubLObject $arglist_table;

        public SubLObject $binding_type_table;

        public SubLObject $method_visibility_table;

        public SubLObject $global_visibility_table;

        public SubLObject $rwbc_methods;

        private static final SubLStructDeclNative structDecl;

        public $trans_subl_file_native() {
            file_translation.$trans_subl_file_native.this.$module_name = Lisp.NIL;
            file_translation.$trans_subl_file_native.this.$filename = Lisp.NIL;
            file_translation.$trans_subl_file_native.this.$internal_constants = Lisp.NIL;
            file_translation.$trans_subl_file_native.this.$referenced_globals = Lisp.NIL;
            file_translation.$trans_subl_file_native.this.$referenced_functions = Lisp.NIL;
            file_translation.$trans_subl_file_native.this.$definitions = Lisp.NIL;
            file_translation.$trans_subl_file_native.this.$top_level_forms = Lisp.NIL;
            file_translation.$trans_subl_file_native.this.$defined_globals = Lisp.NIL;
            file_translation.$trans_subl_file_native.this.$defined_functions = Lisp.NIL;
            file_translation.$trans_subl_file_native.this.$defined_macros = Lisp.NIL;
            file_translation.$trans_subl_file_native.this.$arglist_table = Lisp.NIL;
            file_translation.$trans_subl_file_native.this.$binding_type_table = Lisp.NIL;
            file_translation.$trans_subl_file_native.this.$method_visibility_table = Lisp.NIL;
            file_translation.$trans_subl_file_native.this.$global_visibility_table = Lisp.NIL;
            file_translation.$trans_subl_file_native.this.$rwbc_methods = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return file_translation.$trans_subl_file_native.this.$module_name;
        }

        @Override
        public SubLObject getField3() {
            return file_translation.$trans_subl_file_native.this.$filename;
        }

        @Override
        public SubLObject getField4() {
            return file_translation.$trans_subl_file_native.this.$internal_constants;
        }

        @Override
        public SubLObject getField5() {
            return file_translation.$trans_subl_file_native.this.$referenced_globals;
        }

        @Override
        public SubLObject getField6() {
            return file_translation.$trans_subl_file_native.this.$referenced_functions;
        }

        @Override
        public SubLObject getField7() {
            return file_translation.$trans_subl_file_native.this.$definitions;
        }

        @Override
        public SubLObject getField8() {
            return file_translation.$trans_subl_file_native.this.$top_level_forms;
        }

        @Override
        public SubLObject getField9() {
            return file_translation.$trans_subl_file_native.this.$defined_globals;
        }

        @Override
        public SubLObject getField10() {
            return file_translation.$trans_subl_file_native.this.$defined_functions;
        }

        @Override
        public SubLObject getField11() {
            return file_translation.$trans_subl_file_native.this.$defined_macros;
        }

        @Override
        public SubLObject getField12() {
            return file_translation.$trans_subl_file_native.this.$arglist_table;
        }

        @Override
        public SubLObject getField13() {
            return file_translation.$trans_subl_file_native.this.$binding_type_table;
        }

        @Override
        public SubLObject getField14() {
            return file_translation.$trans_subl_file_native.this.$method_visibility_table;
        }

        @Override
        public SubLObject getField15() {
            return file_translation.$trans_subl_file_native.this.$global_visibility_table;
        }

        @Override
        public SubLObject getField16() {
            return file_translation.$trans_subl_file_native.this.$rwbc_methods;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return file_translation.$trans_subl_file_native.this.$module_name = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return file_translation.$trans_subl_file_native.this.$filename = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return file_translation.$trans_subl_file_native.this.$internal_constants = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return file_translation.$trans_subl_file_native.this.$referenced_globals = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return file_translation.$trans_subl_file_native.this.$referenced_functions = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return file_translation.$trans_subl_file_native.this.$definitions = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return file_translation.$trans_subl_file_native.this.$top_level_forms = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return file_translation.$trans_subl_file_native.this.$defined_globals = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return file_translation.$trans_subl_file_native.this.$defined_functions = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return file_translation.$trans_subl_file_native.this.$defined_macros = value;
        }

        @Override
        public SubLObject setField12(final SubLObject value) {
            return file_translation.$trans_subl_file_native.this.$arglist_table = value;
        }

        @Override
        public SubLObject setField13(final SubLObject value) {
            return file_translation.$trans_subl_file_native.this.$binding_type_table = value;
        }

        @Override
        public SubLObject setField14(final SubLObject value) {
            return file_translation.$trans_subl_file_native.this.$method_visibility_table = value;
        }

        @Override
        public SubLObject setField15(final SubLObject value) {
            return file_translation.$trans_subl_file_native.this.$global_visibility_table = value;
        }

        @Override
        public SubLObject setField16(final SubLObject value) {
            return file_translation.$trans_subl_file_native.this.$rwbc_methods = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.file_translation.$trans_subl_file_native.class, TRANS_SUBL_FILE, TRANS_SUBL_FILE_P, $list2, $list3, new String[]{ "$module_name", "$filename", "$internal_constants", "$referenced_globals", "$referenced_functions", "$definitions", "$top_level_forms", "$defined_globals", "$defined_functions", "$defined_macros", "$arglist_table", "$binding_type_table", "$method_visibility_table", "$global_visibility_table", "$rwbc_methods" }, $list4, $list5, PRINT_TRANS_SUBL_FILE);
        }
    }

    static private final SubLString $str_alt53$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt54$__ = makeString("#<");

    static private final SubLSymbol $sym60$_ = makeSymbol("<");

    static private final SubLList $list_alt67 = list(makeSymbol("DEFCONSTANT"), makeSymbol("DEFLEXICAL"), makeSymbol("DEFGLOBAL"), makeSymbol("DEFPARAMETER"), makeSymbol("DEFVAR"));

    static private final SubLList $list_alt68 = list(makeSymbol("DEFINER"), makeSymbol("GLOBAL"), makeSymbol("&OPTIONAL"), makeSymbol("INIT-FORM"), makeSymbol("DOCUMENTATION"));

    static private final SubLList $list_alt69 = list(list(makeSymbol("STREAM-VAR"), makeSymbol("FILENAME")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym70$FILENAME_VAR = makeUninternedSymbol("FILENAME-VAR");

    static private final SubLList $list_alt73 = list(makeKeyword("OUTPUT"));

    static private final SubLString $str_alt74$_dev_null = makeString("/dev/null");

    static private final SubLString $str_alt77$___Trans_SubL_File____S = makeString(";; Trans SubL File : ~S");

    static private final SubLString $str_alt78$_____Location___________S = makeString("~%;; Location        : ~S");

    static private final SubLString $str_alt79$_______Referenced_Globals__ = makeString("~%~%;; Referenced Globals :");

    static private final SubLString $str_alt80$_______Referenced_Functions__ = makeString("~%~%;; Referenced Functions :");

    static private final SubLString $str_alt81$_______Internal_Constants__ = makeString("~%~%;; Internal Constants :");

    static private final SubLList $list_alt82 = cons(makeSymbol("CONSTANT"), makeSymbol("INTERNAL-ID"));

    static private final SubLString $str_alt83$___S____S = makeString("~%~S : ~S");

    static private final SubLString $str_alt84$_______Definitions__ = makeString("~%~%;; Definitions :");

    static private final SubLSymbol $sym85$_OPTIONAL = makeSymbol("&OPTIONAL");

    static private final SubLSymbol $sym86$_REST = makeSymbol("&REST");

    static private final SubLSymbol $sym87$_PC = makeSymbol("%PC");

    static private final SubLSymbol $sym88$_IC = makeSymbol("%IC");

    static private final SubLString $str_alt93$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLSymbol $sym103$_DEFSTRUCT_CLASS = makeSymbol("%DEFSTRUCT-CLASS");

    static private final SubLList $list_alt106 = cons(makeSymbol("CONSTANT-FORM"), makeSymbol("INTERNAL-ID"));

    static private final SubLSymbol $sym107$_INTERNAL_CONSTANT = makeSymbol("%INTERNAL-CONSTANT");

    static private final SubLList $list_alt108 = list(makeSymbol("OPERATOR"), makeSymbol("NAME"), makeSymbol("&REST"), makeSymbol("REST"));

    static private final SubLSymbol $sym109$_REGISTER_MACRO = makeSymbol("%REGISTER-MACRO");

    static private final SubLList $list_alt110 = list(makeSymbol("ARGLIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym111$_REGISTER_FUNCTION = makeSymbol("%REGISTER-FUNCTION");

    static private final SubLList $list_alt112 = list(makeSymbol("INITIALIZATION"), makeSymbol("&OPTIONAL"), makeSymbol("DOCUMENTATION"));

    static private final SubLSymbol $sym113$_REGISTER_GLOBAL = makeSymbol("%REGISTER-GLOBAL");

    static private final SubLString $str_alt114$DECLARE_ = makeString("DECLARE-");

    static private final SubLString $str_alt115$_FILE = makeString("-FILE");

    static private final SubLString $str_alt117$INIT_ = makeString("INIT-");

    static private final SubLString $str_alt118$SETUP_ = makeString("SETUP-");

    static private final SubLSymbol $sym122$LIST_ = makeSymbol("LIST*");

    static private final SubLSymbol $sym125$_LF = makeSymbol("%LF");

    static private final SubLString $str_alt126$Time_to_implement_function_consta = makeString("Time to implement function constant translation for ~S");

    static private final SubLList $list_alt127 = list(new SubLObject[]{ T, NIL, EQ, EQL, EQUAL, EQUALP, IDENTITY, MINUS_ONE_INTEGER, ZERO_INTEGER, ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER, ELEVEN_INTEGER, TWELVE_INTEGER, THIRTEEN_INTEGER, FOURTEEN_INTEGER, FIFTEEN_INTEGER, SIXTEEN_INTEGER, SEVENTEEN_INTEGER, EIGHTEEN_INTEGER, NINETEEN_INTEGER, TWENTY_INTEGER, CHAR_null, CHAR_backspace, CHAR_tab, CHAR_newline, CHAR_return, CHAR_page, CHAR_escape, CHAR_space, CHAR_exclamation, CHAR_quotation, CHAR_hash, CHAR_dollar, CHAR_percent, CHAR_ampersand, CHAR_quote, CHAR_lparen, CHAR_rparen, CHAR_asterisk, CHAR_plus, CHAR_comma, CHAR_hyphen, CHAR_period, CHAR_slash, CHAR_0, CHAR_1, CHAR_2, CHAR_3, CHAR_4, CHAR_5, CHAR_6, CHAR_7, CHAR_8, CHAR_9, CHAR_colon, CHAR_semicolon, CHAR_less, CHAR_equal, CHAR_greater, CHAR_question, CHAR_at, CHAR_A, CHAR_B, CHAR_C, CHAR_D, CHAR_E, CHAR_F, CHAR_G, CHAR_H, CHAR_I, CHAR_J, CHAR_K, CHAR_L, CHAR_M, CHAR_N, CHAR_O, CHAR_P, CHAR_Q, CHAR_R, CHAR_S, CHAR_T, CHAR_U, CHAR_V, CHAR_W, CHAR_X, CHAR_Y, CHAR_Z, CHAR_lbracket, CHAR_backslash, CHAR_rbracket, CHAR_caret, CHAR_underbar, CHAR_backquote, CHAR_a, CHAR_b, CHAR_c, CHAR_d, CHAR_e, CHAR_f, CHAR_g, CHAR_h, CHAR_i, CHAR_j, CHAR_k, CHAR_l, CHAR_m, CHAR_n, CHAR_o, CHAR_p, CHAR_q, CHAR_r, CHAR_s, CHAR_t, CHAR_u, CHAR_v, CHAR_w, CHAR_x, CHAR_y, CHAR_z, CHAR_lbrace, CHAR_vertical, CHAR_rbrace, CHAR_tilde, CHAR_rubout });

    static private final SubLList $list_alt135 = list(new SubLObject[]{ list(list(NIL), ZERO_INTEGER, ZERO_INTEGER, NIL), list(list(list(makeSymbol("X"))), ONE_INTEGER, ZERO_INTEGER, NIL), list(list(list(makeSymbol("X"), makeSymbol("&OPTIONAL"), makeSymbol("Y"))), ONE_INTEGER, ONE_INTEGER, NIL), list(list(list(makeSymbol("X"), makeSymbol("&OPTIONAL"), makeSymbol("Y"), makeSymbol("&REST"), makeSymbol("REST"))), ONE_INTEGER, ONE_INTEGER, T), list(list(list(makeSymbol("X"), makeSymbol("&REST"), makeSymbol("REST"))), ONE_INTEGER, ZERO_INTEGER, T), list(list(list(makeSymbol("X"), makeSymbol("A"), makeSymbol("B"), makeSymbol("C"), makeSymbol("&REST"), makeSymbol("REST"))), FOUR_INTEGER, ZERO_INTEGER, T), list(list(list(new SubLObject[]{ makeSymbol("X"), makeSymbol("A"), makeSymbol("B"), makeSymbol("C"), makeSymbol("&OPTIONAL"), makeSymbol("J"), makeSymbol("K"), makeSymbol("L"), makeSymbol("&REST"), makeSymbol("REST") })), FOUR_INTEGER, THREE_INTEGER, T), list(list(list(makeSymbol("X"), makeSymbol("A"), makeSymbol("B"), makeSymbol("C"), makeSymbol("&OPTIONAL"), makeSymbol("J"), makeSymbol("K"), makeSymbol("L"))), FOUR_INTEGER, THREE_INTEGER, NIL), list(list(list(makeSymbol("&REST"), makeSymbol("REST"))), ZERO_INTEGER, ZERO_INTEGER, T) });

    public static final class $trans_subl_file_p$UnaryFunction extends UnaryFunction {
        public $trans_subl_file_p$UnaryFunction() {
            super(extractFunctionNamed("TRANS-SUBL-FILE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return trans_subl_file_p(arg1);
        }
    }

    static private final SubLList $list_alt137 = list(new SubLObject[]{ list(list(makeInteger(212)), list(makeSymbol("%LF"), makeInteger(212))), list(list(makeDouble(1.0)), list(makeSymbol("%LF"), makeDouble(1.0))), list(list($TEST), list(makeSymbol("%LF"), $TEST)), list(list(makeString("test")), list(makeSymbol("%LF"), makeString("test"))), list(list(makeSymbol("X")), list(makeSymbol("%LF"), makeSymbol("X"))), list(list(NIL), list(makeSymbol("%PC"), NIL)), list(list(list(ONE_INTEGER)), list(makeSymbol("LIST"), list(makeSymbol("%PC"), ONE_INTEGER))), list(list(list(ONE_INTEGER, TWO_INTEGER)), list(makeSymbol("LIST"), list(makeSymbol("%PC"), ONE_INTEGER), list(makeSymbol("%PC"), TWO_INTEGER))), list(list(cons(ONE_INTEGER, TWO_INTEGER)), list(makeSymbol("CONS"), list(makeSymbol("%PC"), ONE_INTEGER), list(makeSymbol("%PC"), TWO_INTEGER))), list(list(list(ONE_INTEGER, TWO_INTEGER, THREE_INTEGER)), list(makeSymbol("LIST"), list(makeSymbol("%PC"), ONE_INTEGER), list(makeSymbol("%PC"), TWO_INTEGER), list(makeSymbol("%PC"), THREE_INTEGER))), list(list(listS(ONE_INTEGER, TWO_INTEGER, THREE_INTEGER)), list(makeSymbol("LIST*"), list(makeSymbol("%PC"), ONE_INTEGER), list(makeSymbol("%PC"), TWO_INTEGER), list(makeSymbol("%PC"), THREE_INTEGER))) });
}

/**
 * Total time: 431 ms
 */
