package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class c_backend
    extends
      SubLTranslatedFile
{
  public static final SubLFile me = new c_backend();
  public static final String myName = "com.cyc.cycjava.cycl.c_backend";
  public static final String myFingerPrint = "f3a42c566a988e591be6cf89f43280096afa18018c2c839dd031741860556742";
  public static SubLSymbol $anonymous_variable_counter$ = null;
  private static SubLSymbol $c_backend_write_global_definition_as_comment$ = null;
  private static SubLSymbol $c_backend_convert_char_map$ = null;
  private static SubLSymbol $c_backend_writers$ = null;
  private static SubLSymbol $c_backend_volatilize_localsP$ = null;
  private static final SubLSymbol $sym0$TRANS_SUBL_FILE_P = makeSymbol( "TRANS-SUBL-FILE-P" );
  private static final SubLSymbol $sym1$STRINGP = makeSymbol( "STRINGP" );
  private static final SubLInteger $int2$1048576 = makeInteger( 0x100000 );
  private static final SubLSymbol $kw3$OUTPUT = makeKeyword( "OUTPUT" );
  private static final SubLString $str4$Unable_to_open__S = makeString( "Unable to open ~S" );
  private static final SubLString $str5$_dev_null = makeString( "/dev/null" );
  private static final SubLString $str6$_c = makeString( ".c" );
  private static final SubLString $str7$_h = makeString( ".h" );
  private static final SubLString $str8$_C = makeString( ".C" );
  private static final SubLString $str9$_H = makeString( ".H" );
  private static final SubLString $str10$unexpected_C_filename__S = makeString( "unexpected C filename ~S" );
  private static final SubLSymbol $sym11$DOUBLE_FLOAT = makeSymbol( "DOUBLE-FLOAT" );
  private static final SubLString $str12$_include__rtl_h_ = makeString( "#include \"rtl.h\"" );
  private static final SubLString $str13$CYCL = makeString( "CYCL" );
  private static final SubLString $str14$_____ifdef__A_PROFILING = makeString( "~%~%#ifdef ~A_PROFILING" );
  private static final SubLString $str15$___define__A_PROFILING = makeString( "~%#define ~A_PROFILING" );
  private static final SubLString $str16$___endif = makeString( "~%#endif" );
  private static final SubLString $str17$___define_PROFILING = makeString( "~%#define PROFILING" );
  private static final SubLString $str18$_____include__code_flow_hooks_h_ = makeString( "~%~%#include \"code-flow-hooks.h\"" );
  private static final SubLString $str19$____ = makeString( "/*~%" );
  private static final SubLString $str20$____A__ = makeString( "   ~A~%" );
  private static final SubLString $str21$SUBLISP = makeString( "SUBLISP" );
  private static final SubLList $list22 = ConsesLow.list( makeKeyword( "NONE" ), makeKeyword( "MEDIUM" ) );
  private static final SubLString $str23$___file__________a___ = makeString( "   file:        ~a ~%" );
  private static final SubLSymbol $kw24$HIGH = makeKeyword( "HIGH" );
  private static final SubLString $str25$___created_______4__0D__2__0D__2_ = makeString( "   created:     ~4,'0D/~2,'0D/~2,'0D ~2,'0D:~2,'0D:~2,'0D~%" );
  private static final SubLString $str26$___source_file___a___ = makeString( "   source file: ~a ~%" );
  private static final SubLString $str27$___ = makeString( " */" );
  private static final SubLString $str28$____A__ = makeString( "#  ~A~%" );
  private static final SubLString $str29$____created_______4__0D__2__0D__2 = makeString( "#   created:     ~4,'0D/~2,'0D/~2,'0D ~2,'0D:~2,'0D:~2,'0D~%" );
  private static final SubLString $str30$Copyright__c__1995___2014_Cycorp_ = makeString( "Copyright (c) 1995 - 2014 Cycorp, Inc.  All rights reserved." );
  private static final SubLString $str31$_______referenced_globals___ = makeString( "~%~%/* referenced globals */" );
  private static final SubLString $str32$_______referenced_functions___ = makeString( "~%~%/* referenced functions */" );
  private static final SubLString $str33$extern_ = makeString( "extern " );
  private static final SubLString $str34$_ = makeString( " " );
  private static final SubLString $str35$_ = makeString( ";" );
  private static final SubLString $str36$static_ = makeString( "static " );
  private static final SubLSymbol $kw37$UNPROVIDED = makeKeyword( "UNPROVIDED" );
  private static final SubLString $str38$static_Dp__constants__A__ = makeString( "static Dp _constants[~A];" );
  private static final SubLString $str39$_____container_for_all_constant_v = makeString( "  /* container for all constant values in file */" );
  private static final SubLString $str40$_______private_globals___ = makeString( "~%~%/* private globals */" );
  private static final SubLString $str41$_______private_functions___ = makeString( "~%~%/* private functions */" );
  private static final SubLString $str42$__ = makeString( "  " );
  private static final SubLString $str43$Unexpected_C_backend_atom____S = makeString( "Unexpected C backend atom : ~S" );
  private static final SubLList $list44 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "CONSTANT" ) );
  private static final SubLSymbol $sym45$_PC = makeSymbol( "%PC" );
  private static final SubLString $str46$Time_to_implement_a_C_backend_tra = makeString( "Time to implement a C backend translation for predefined constant ~S" );
  private static final SubLSymbol $kw47$DYNAMIC = makeKeyword( "DYNAMIC" );
  private static final SubLSymbol $kw48$LEXICAL = makeKeyword( "LEXICAL" );
  private static final SubLSymbol $kw49$CONSTANT = makeKeyword( "CONSTANT" );
  private static final SubLSymbol $kw50$LOCAL = makeKeyword( "LOCAL" );
  private static final SubLString $str51$unexpected_variable_binding_type_ = makeString( "unexpected variable binding type ~S for ~S" );
  private static final SubLList $list52 = ConsesLow.list( makeKeyword( "LOW" ), makeKeyword( "HIGH" ) );
  private static final SubLString $str53$_gv_S_ = makeString( "_gv~S_" );
  private static final SubLString $str54$_v_S_ = makeString( "_v~S_" );
  private static final SubLSymbol $sym55$C_BACKEND_SECURE_LOCAL_ID = makeSymbol( "C-BACKEND-SECURE-LOCAL-ID" );
  private static final SubLSymbol $sym56$C_BACKEND_LOCAL_VARIABLE_NAME = makeSymbol( "C-BACKEND-LOCAL-VARIABLE-NAME" );
  private static final SubLString $str57$v_ = makeString( "v_" );
  private static final SubLString $str58$_ = makeString( "_" );
  private static final SubLSymbol $sym59$C_BACKEND_COMPUTE_GLOBAL_VARIABLE_NAME = makeSymbol( "C-BACKEND-COMPUTE-GLOBAL-VARIABLE-NAME" );
  private static final SubLString $str60$gv_ = makeString( "gv_" );
  private static final SubLList $list61;
  private static final SubLList $list62 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "&REST" ), makeSymbol( "ARGS" ) );
  private static final SubLSymbol $kw63$UNKNOWN = makeKeyword( "UNKNOWN" );
  private static final SubLString $str64$translating__S_call_as_funcall = makeString( "translating ~S call as funcall" );
  private static final SubLSymbol $sym65$FUNCALL = makeSymbol( "FUNCALL" );
  private static final SubLSymbol $sym66$_LF = makeSymbol( "%LF" );
  private static final SubLString $str67$_S_called_with__S_missing_require = makeString( "~S called with ~S missing required arguments" );
  private static final SubLString $str68$_S_called_with__S_excess_argument = makeString( "~S called with ~S excess arguments" );
  private static final SubLString $str69$_ = makeString( "(" );
  private static final SubLString $str70$_ = makeString( ")" );
  private static final SubLSymbol $sym71$C_BACKEND_COMPUTED_FUNCTION_NAME = makeSymbol( "C-BACKEND-COMPUTED-FUNCTION-NAME" );
  private static final SubLString $str72$f_ = makeString( "f_" );
  private static final SubLSymbol $kw73$UNSPECIFIED = makeKeyword( "UNSPECIFIED" );
  private static final SubLString $str74$_CSETF_ = makeString( "_CSETF-" );
  private static final SubLList $list75 = ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "VALUE" ) );
  private static final SubLSymbol $kw76$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
  private static final SubLSymbol $sym77$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
  private static final SubLString $str78$unable_to_introspect_on__S = makeString( "unable to introspect on ~S" );
  private static final SubLString $str79$Unexpected_function__S = makeString( "Unexpected function ~S" );
  private static final SubLString $str80$__ = makeString( ", " );
  private static final SubLString $str81$DUM = makeString( "DUM" );
  private static final SubLSymbol $sym82$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
  private static final SubLList $list83 = ConsesLow.list( new SubLObject[] { ConsesLow.cons( makeSymbol( "%AND" ), makeSymbol( "C-BACKEND-WRITE-%AND" ) ), ConsesLow.cons( makeSymbol( "%B-CHECK-TYPE" ), makeSymbol(
      "C-BACKEND-WRITE-%B-CHECK-TYPE" ) ), ConsesLow.cons( makeSymbol( "%CCATCH" ), makeSymbol( "C-BACKEND-WRITE-%CCATCH" ) ), ConsesLow.cons( makeSymbol( "%CDO-SYMBOLS" ), makeSymbol( "C-BACKEND-WRITE-%CDO-SYMBOLS" ) ),
    ConsesLow.cons( makeSymbol( "%CDOHASH" ), makeSymbol( "C-BACKEND-WRITE-%CDOHASH" ) ), ConsesLow.cons( makeSymbol( "CLET-BIND" ), makeSymbol( "C-BACKEND-WRITE-CLET-BIND" ) ), ConsesLow.cons( makeSymbol(
        "CLET-LOCAL" ), makeSymbol( "C-BACKEND-WRITE-CLET-LOCAL" ) ), ConsesLow.cons( makeSymbol( "CODE-COMMENT" ), makeSymbol( "C-BACKEND-WRITE-CODE-COMMENT" ) ), ConsesLow.cons( makeSymbol( "%CPROGV" ), makeSymbol(
            "C-BACKEND-WRITE-%CPROGV" ) ), ConsesLow.cons( makeSymbol( "CSETQ" ), makeSymbol( "C-BACKEND-WRITE-CSETQ" ) ), ConsesLow.cons( makeSymbol( "CSETQ-DYNAMIC" ), makeSymbol( "C-BACKEND-WRITE-CSETQ-DYNAMIC" ) ),
    ConsesLow.cons( makeSymbol( "CSETQ-LEXICAL" ), makeSymbol( "C-BACKEND-WRITE-CSETQ-LEXICAL" ) ), ConsesLow.cons( makeSymbol( "CSETQ-LOCAL" ), makeSymbol( "C-BACKEND-WRITE-CSETQ-LOCAL" ) ), ConsesLow.cons( makeSymbol(
        "%CUNWIND-PROTECT" ), makeSymbol( "C-BACKEND-WRITE-%CUNWIND-PROTECT" ) ), ConsesLow.cons( makeSymbol( "CVS-ID" ), makeSymbol( "C-BACKEND-WRITE-CVS-ID" ) ), ConsesLow.cons( makeSymbol( "DEFCONSTANT" ), makeSymbol(
            "C-BACKEND-WRITE-DEFCONSTANT" ) ), ConsesLow.cons( makeSymbol( "DEFINE" ), makeSymbol( "C-BACKEND-WRITE-DEFINE" ) ), ConsesLow.cons( makeSymbol( "DEFINE-MACROEXPANDER" ), makeSymbol(
                "C-BACKEND-WRITE-DEFINE-MACROEXPANDER" ) ), ConsesLow.cons( makeSymbol( "DEFLEXICAL" ), makeSymbol( "C-BACKEND-WRITE-DEFLEXICAL" ) ), ConsesLow.cons( makeSymbol( "DEFPARAMETER" ), makeSymbol(
                    "C-BACKEND-WRITE-DEFPARAMETER" ) ), ConsesLow.cons( makeSymbol( "%DEFSTRUCT-CLASS" ), makeSymbol( "C-BACKEND-WRITE-%DEFSTRUCT-CLASS" ) ), ConsesLow.cons( makeSymbol( "_DEFSTRUCT-CONSTRUCT",
                        "SUBLISP" ), makeSymbol( "C-BACKEND-WRITE-DEFSTRUCT-CONSTRUCT" ) ), ConsesLow.cons( makeSymbol( "_DEFSTRUCT-GET-SLOT", "SUBLISP" ), makeSymbol( "C-BACKEND-WRITE-DEFSTRUCT-GET-SLOT" ) ), ConsesLow
                            .cons( makeSymbol( "_DEFSTRUCT-OBJECT-P", "SUBLISP" ), makeSymbol( "C-BACKEND-WRITE-DEFSTRUCT-OBJECT-P" ) ), ConsesLow.cons( makeSymbol( "_DEFSTRUCT-SET-SLOT", "SUBLISP" ), makeSymbol(
                                "C-BACKEND-WRITE-DEFSTRUCT-SET-SLOT" ) ), ConsesLow.cons( makeSymbol( "DEFVAR" ), makeSymbol( "C-BACKEND-WRITE-DEFVAR" ) ), ConsesLow.cons( makeSymbol( "%DP-CHECK-TYPE" ), makeSymbol(
                                    "C-BACKEND-WRITE-%DP-CHECK-TYPE" ) ), ConsesLow.cons( makeSymbol( "%DP-ENFORCE-TYPE" ), makeSymbol( "C-BACKEND-WRITE-%DP-ENFORCE-TYPE" ) ), ConsesLow.cons( makeSymbol( "%ENTER" ),
                                        makeSymbol( "C-BACKEND-WRITE-%ENTER" ) ), ConsesLow.cons( makeSymbol( "FIF" ), makeSymbol( "C-BACKEND-WRITE-FIF" ) ), ConsesLow.cons( makeSymbol( "%FOR" ), makeSymbol(
                                            "C-BACKEND-WRITE-%FOR" ) ), ConsesLow.cons( makeSymbol( "%IC" ), makeSymbol( "C-BACKEND-WRITE-%IC" ) ), ConsesLow.cons( makeSymbol( "%INTERNAL-CONSTANT" ), makeSymbol(
                                                "C-BACKEND-WRITE-%INTERNAL-CONSTANT" ) ), ConsesLow.cons( makeSymbol( "%LF" ), makeSymbol( "C-BACKEND-WRITE-%LF" ) ), ConsesLow.cons( makeSymbol( "%LOCAL" ), makeSymbol(
                                                    "C-BACKEND-WRITE-%LOCAL" ) ), ConsesLow.cons( makeSymbol( "MULTIPLE-VALUE-LIST" ), makeSymbol( "C-BACKEND-WRITE-MULTIPLE-VALUE-LIST" ) ), ConsesLow.cons( makeSymbol(
                                                        "%NC" ), makeSymbol( "C-BACKEND-WRITE-%NC" ) ), ConsesLow.cons( makeSymbol( "%NOT" ), makeSymbol( "C-BACKEND-WRITE-%NOT" ) ), ConsesLow.cons( makeSymbol(
                                                            "NTH-VALUE" ), makeSymbol( "C-BACKEND-WRITE-NTH-VALUE" ) ), ConsesLow.cons( makeSymbol( "%OR" ), makeSymbol( "C-BACKEND-WRITE-%OR" ) ), ConsesLow.cons(
                                                                makeSymbol( "%PC" ), makeSymbol( "C-BACKEND-WRITE-%PC" ) ), ConsesLow.cons( makeSymbol( "PCOND" ), makeSymbol( "C-BACKEND-WRITE-PCOND" ) ), ConsesLow.cons(
                                                                    makeSymbol( "PROGN" ), makeSymbol( "C-BACKEND-WRITE-PROGN" ) ), ConsesLow.cons( makeSymbol( "%PROCLAIM" ), makeSymbol( "C-BACKEND-WRITE-%PROCLAIM" ) ),
    ConsesLow.cons( makeSymbol( "%REGISTER-FUNCTION" ), makeSymbol( "C-BACKEND-WRITE-%REGISTER-FUNCTION" ) ), ConsesLow.cons( makeSymbol( "%REGISTER-GLOBAL" ), makeSymbol( "C-BACKEND-WRITE-%REGISTER-GLOBAL" ) ),
    ConsesLow.cons( makeSymbol( "%REGISTER-MACRO" ), makeSymbol( "C-BACKEND-WRITE-%REGISTER-MACRO" ) ), ConsesLow.cons( makeSymbol( "RET" ), makeSymbol( "C-BACKEND-WRITE-RET" ) ), ConsesLow.cons( makeSymbol( "WHILE" ),
        makeSymbol( "C-BACKEND-WRITE-WHILE" ) ), ConsesLow.cons( makeSymbol( "%WITH-CURRENT-THREAD" ), makeSymbol( "C-BACKEND-WRITE-%WITH-CURRENT-THREAD" ) ), ConsesLow.cons( makeSymbol( "%WITH-ERROR-HANDLER" ),
            makeSymbol( "C-BACKEND-WRITE-%WITH-ERROR-HANDLER" ) ), ConsesLow.cons( makeSymbol( "%WITH-PROCESS-RESOURCE-TRACKING" ), makeSymbol( "C-BACKEND-WRITE-%WITH-PROCESS-RESOURCE-TRACKING" ) ), ConsesLow.cons(
                makeSymbol( "%THREAD-MVAL" ), makeSymbol( "C-BACKEND-WRITE-%THREAD-MVAL" ) ), ConsesLow.cons( makeSymbol( "%THREAD-RESET-MVAL" ), makeSymbol( "C-BACKEND-WRITE-%THREAD-RESET-MVAL" ) )
  } );
  private static final SubLString $str84$Time_to_implement_the_writer_for_ = makeString( "Time to implement the writer for ~S" );
  private static final SubLList $list85 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "OBJECT" ), makeSymbol( "PRED" ) );
  private static final SubLSymbol $sym86$_B_CHECK_TYPE = makeSymbol( "%B-CHECK-TYPE" );
  private static final SubLSymbol $sym87$_DP_CHECK_TYPE = makeSymbol( "%DP-CHECK-TYPE" );
  private static final SubLSymbol $sym88$_DP_ENFORCE_TYPE = makeSymbol( "%DP-ENFORCE-TYPE" );
  private static final SubLList $list89 = ConsesLow.list( makeSymbol( "OPERATOR" ), ConsesLow.list( makeSymbol( "TAG" ), makeSymbol( "ANS-VAR" ), makeSymbol( "ENV-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
  private static final SubLSymbol $sym90$_CCATCH = makeSymbol( "%CCATCH" );
  private static final SubLSymbol $sym91$PROGN = makeSymbol( "PROGN" );
  private static final SubLSymbol $sym92$_SET_CATCH = makeSymbol( "%SET-CATCH" );
  private static final SubLSymbol $sym93$PCOND = makeSymbol( "PCOND" );
  private static final SubLSymbol $sym94$_DTB = makeSymbol( "%DTB" );
  private static final SubLSymbol $sym95$_THROWN_TO = makeSymbol( "%THROWN-TO" );
  private static final SubLSymbol $sym96$CSETQ = makeSymbol( "CSETQ" );
  private static final SubLList $list97 = ConsesLow.list( ConsesLow.list( makeSymbol( "%CATCH-VALUE" ) ) );
  private static final SubLList $list98 = ConsesLow.list( makeSymbol( "%NC" ), makeSymbol( "%TRUE" ) );
  private static final SubLSymbol $sym99$_FINISH_CATCH = makeSymbol( "%FINISH-CATCH" );
  private static final SubLList $list100 = ConsesLow.list( makeSymbol( "OPERATOR" ), ConsesLow.list( makeSymbol( "SYM" ), makeSymbol( "PACKAGE-VAR" ), makeSymbol( "ITERATOR-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol(
      "BODY" ) );
  private static final SubLSymbol $sym101$_CDO_SYMBOLS = makeSymbol( "%CDO-SYMBOLS" );
  private static final SubLSymbol $sym102$_CDO_SYMBOLS_SETUP = makeSymbol( "%CDO-SYMBOLS-SETUP" );
  private static final SubLSymbol $sym103$_CDO_SYMBOLS_LOOP = makeSymbol( "%CDO-SYMBOLS-LOOP" );
  private static final SubLSymbol $sym104$_CDO_SYMBOLS_END = makeSymbol( "%CDO-SYMBOLS-END" );
  private static final SubLList $list105 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "BINDINGS" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
  private static final SubLSymbol $sym106$CLET_BIND = makeSymbol( "CLET-BIND" );
  private static final SubLList $list107 = ConsesLow.list( makeSymbol( "VARIABLE" ), makeSymbol( "INITIALIZATION" ) );
  private static final SubLSymbol $sym108$_BIND = makeSymbol( "%BIND" );
  private static final SubLSymbol $sym109$_REBIND = makeSymbol( "%REBIND" );
  private static final SubLSymbol $sym110$CLET_LOCAL = makeSymbol( "CLET-LOCAL" );
  private static final SubLSymbol $sym111$_LOCAL = makeSymbol( "%LOCAL" );
  private static final SubLList $list112 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "COMMENT-STRING" ) );
  private static final SubLSymbol $sym113$CODE_COMMENT = makeSymbol( "CODE-COMMENT" );
  private static final SubLString $str114$___ = makeString( "// " );
  private static final SubLList $list115 = ConsesLow.list( makeSymbol( "OPERATOR" ), ConsesLow.list( makeSymbol( "SPECIAL-VARS" ), makeSymbol( "BINDINGS" ), makeSymbol( "INTERNAL-VAR" ) ), makeSymbol( "&BODY" ),
      makeSymbol( "BODY" ) );
  private static final SubLSymbol $sym116$_CPROGV = makeSymbol( "%CPROGV" );
  private static final SubLSymbol $sym117$_BIND_SPECIAL_VARS = makeSymbol( "%BIND-SPECIAL-VARS" );
  private static final SubLSymbol $sym118$_REBIND_SPECIAL_VARS = makeSymbol( "%REBIND-SPECIAL-VARS" );
  private static final SubLList $list119 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "VARIABLE" ), makeSymbol( "VALUE" ) );
  private static final SubLSymbol $sym120$CSETQ_LOCAL = makeSymbol( "CSETQ-LOCAL" );
  private static final SubLSymbol $sym121$CSETQ_DYNAMIC = makeSymbol( "CSETQ-DYNAMIC" );
  private static final SubLSymbol $sym122$CSETQ_LEXICAL = makeSymbol( "CSETQ-LEXICAL" );
  private static final SubLString $str123$The_constant_variable__S_cannot_b = makeString( "The constant variable ~S cannot be set" );
  private static final SubLString $str124$Unexpected_variable__S = makeString( "Unexpected variable ~S" );
  private static final SubLSymbol $sym125$_SET_DYN = makeSymbol( "%SET-DYN" );
  private static final SubLSymbol $sym126$_SET_LEX = makeSymbol( "%SET-LEX" );
  private static final SubLString $str127$___ = makeString( " = " );
  private static final SubLList $list128 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "ENV-VAR" ), makeSymbol( "PROTECTED-FORM" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
  private static final SubLSymbol $sym129$_CUNWIND_PROTECT = makeSymbol( "%CUNWIND-PROTECT" );
  private static final SubLSymbol $sym130$_SET_UNWIND = makeSymbol( "%SET-UNWIND" );
  private static final SubLSymbol $sym131$_START_UNWIND = makeSymbol( "%START-UNWIND" );
  private static final SubLSymbol $sym132$_FINISH_UNWIND = makeSymbol( "%FINISH-UNWIND" );
  private static final SubLList $list133 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "ID-STRING" ) );
  private static final SubLSymbol $sym134$CVS_ID = makeSymbol( "CVS-ID" );
  private static final SubLString $str135$CVS_ID_ = makeString( "CVS_ID(" );
  private static final SubLSymbol $sym136$DEFCONSTANT = makeSymbol( "DEFCONSTANT" );
  private static final SubLList $list137 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "VARIABLE" ), makeSymbol( "INITIALIZATION" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DOCUMENTATION" ) );
  private static final SubLList $list138 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "NAME" ), makeSymbol( "ARGLIST" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
  private static final SubLSymbol $sym139$DEFINE = makeSymbol( "DEFINE" );
  private static final SubLString $str140$_S_was_not_a_top_level_define = makeString( "~S was not a top-level define" );
  private static final SubLSymbol $sym141$SKIP_FUNCTION = makeSymbol( "SKIP-FUNCTION" );
  private static final SubLString $str142$Skip_function__S = makeString( "Skip function ~S" );
  private static final SubLList $list143 = ConsesLow.list( makeSymbol( "DOCUMENTATION" ), makeSymbol( "&BODY" ), makeSymbol( "REAL-BODY" ) );
  private static final SubLString $str144$Method__S_returns_within_a_bindin = makeString( "Method ~S returns within a binding construct" );
  private static final SubLList $list145 = ConsesLow.list( makeSymbol( "%ENTER" ) );
  private static final SubLString $str146$___ = makeString( "/* " );
  private static final SubLString $str147$_f_S_ = makeString( "_f~S_" );
  private static final SubLSymbol $sym148$_OPTIONAL = makeSymbol( "&OPTIONAL" );
  private static final SubLSymbol $sym149$_REST = makeSymbol( "&REST" );
  private static final SubLList $list150 = ConsesLow.list( makeSymbol( "VARIABLE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "INITIALIZATION" ), makeSymbol( "PROVIDED" ) );
  private static final SubLSymbol $sym151$_NOTE_SUPPLIED = makeSymbol( "%NOTE-SUPPLIED" );
  private static final SubLSymbol $sym152$_INIT_OPT_ARG = makeSymbol( "%INIT-OPT-ARG" );
  private static final SubLList $list153;
  private static final SubLString $str154$Dp = makeString( "Dp" );
  private static final SubLString $str155$_void_ = makeString( "(void)" );
  private static final SubLSymbol $sym156$TRANSLATOR_RET_FORM_P = makeSymbol( "TRANSLATOR-RET-FORM-P" );
  private static final SubLSymbol $sym157$TRANSLATOR_RET_TO_THROW = makeSymbol( "TRANSLATOR-RET-TO-THROW" );
  private static final SubLList $list158 = ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "%EXIT" ) );
  private static final SubLSymbol $sym159$ANSWER = makeUninternedSymbol( "ANSWER" );
  private static final SubLSymbol $sym160$EXIT_ENV = makeUninternedSymbol( "EXIT-ENV" );
  private static final SubLSymbol $sym161$RET = makeSymbol( "RET" );
  private static final SubLList $list162 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "EXPRESSION" ) );
  private static final SubLSymbol $sym163$THROW = makeSymbol( "THROW" );
  private static final SubLSymbol $sym164$DEFINE_MACROEXPANDER = makeSymbol( "DEFINE-MACROEXPANDER" );
  private static final SubLSymbol $sym165$DEFLEXICAL = makeSymbol( "DEFLEXICAL" );
  private static final SubLSymbol $sym166$DEFPARAMETER = makeSymbol( "DEFPARAMETER" );
  private static final SubLList $list167 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "&REST" ), makeSymbol( "ANALYSIS" ) );
  private static final SubLSymbol $sym168$_DEFSTRUCT_CLASS = makeSymbol( "%DEFSTRUCT-CLASS" );
  private static final SubLSymbol $kw169$NAME = makeKeyword( "NAME" );
  private static final SubLString $str170$___defstruct__A___ = makeString( "/* defstruct ~A */" );
  private static final SubLSymbol $sym171$_DEFSTRUCT_CONSTRUCT = makeSymbol( "_DEFSTRUCT-CONSTRUCT", "SUBLISP" );
  private static final SubLSymbol $sym172$_DEFSTRUCT_GET_SLOT = makeSymbol( "_DEFSTRUCT-GET-SLOT", "SUBLISP" );
  private static final SubLSymbol $sym173$_DEFSTRUCT_OBJECT_P = makeSymbol( "_DEFSTRUCT-OBJECT-P", "SUBLISP" );
  private static final SubLSymbol $sym174$_DEFSTRUCT_SET_SLOT = makeSymbol( "_DEFSTRUCT-SET-SLOT", "SUBLISP" );
  private static final SubLSymbol $sym175$DEFVAR = makeSymbol( "DEFVAR" );
  private static final SubLList $list176 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "CONDITION" ), makeSymbol( "TRUE-VALUE" ), makeSymbol( "FALSE-VALUE" ) );
  private static final SubLSymbol $sym177$FIF = makeSymbol( "FIF" );
  private static final SubLString $str178$___ = makeString( " ? " );
  private static final SubLString $str179$___ = makeString( " : " );
  private static final SubLList $list180 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "&REST" ), makeSymbol( "PCOND-CLAUSES" ) );
  private static final SubLList $list181 = ConsesLow.list( makeSymbol( "PROGN" ) );
  private static final SubLList $list182 = ConsesLow.list( makeSymbol( "FIRST-CLAUSE" ), makeSymbol( "&REST" ), makeSymbol( "REST-CLAUSES" ) );
  private static final SubLList $list183 = ConsesLow.list( makeSymbol( "TEST" ), makeSymbol( "&BODY" ), makeSymbol( "ACTIONS" ) );
  private static final SubLString $str184$if__ = makeString( "if (" );
  private static final SubLString $str185$__ = makeString( ") " );
  private static final SubLString $str186$_else_ = makeString( " else " );
  private static final SubLString $str187$_else_if__ = makeString( " else if (" );
  private static final SubLList $list188 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
  private static final SubLString $str189$_ = makeString( "{" );
  private static final SubLString $str190$_ = makeString( "}" );
  private static final SubLList $list191 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "RESULT" ) );
  private static final SubLString $str192$RETURN_ = makeString( "RETURN(" );
  private static final SubLList $list193 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "TEST" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
  private static final SubLSymbol $sym194$WHILE = makeSymbol( "WHILE" );
  private static final SubLString $str195$while__ = makeString( "while (" );
  private static final SubLList $list196 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "&REST" ), makeSymbol( "EXPRESSIONS" ) );
  private static final SubLSymbol $sym197$_AND = makeSymbol( "%AND" );
  private static final SubLString $str198$____ = makeString( " && " );
  private static final SubLList $list199 = ConsesLow.list( makeSymbol( "OPERATOR" ), ConsesLow.list( makeSymbol( "KEY" ), makeSymbol( "VAL" ), makeSymbol( "TABLE-VAR" ), makeSymbol( "ITERATOR-VAR" ), makeSymbol(
      "ENTRY-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
  private static final SubLSymbol $sym200$_CDOHASH = makeSymbol( "%CDOHASH" );
  private static final SubLSymbol $sym201$_FOR = makeSymbol( "%FOR" );
  private static final SubLSymbol $sym202$_NEXT_HASH_INDEX = makeSymbol( "%NEXT-HASH-INDEX", "SUBLISP" );
  private static final SubLSymbol $sym203$_HASH_INDEX_KEY = makeSymbol( "%HASH-INDEX-KEY", "SUBLISP" );
  private static final SubLSymbol $sym204$_HASH_INDEX_OBJ = makeSymbol( "%HASH-INDEX-OBJ", "SUBLISP" );
  private static final SubLList $list205 = ConsesLow.list( makeSymbol( "OPERATOR" ) );
  private static final SubLSymbol $sym206$_ENTER = makeSymbol( "%ENTER" );
  private static final SubLString $str207$ENTER__ = makeString( "ENTER()" );
  private static final SubLList $list208 = ConsesLow.list( makeSymbol( "OPERATOR" ), ConsesLow.list( makeSymbol( "INITIALIZATIONS" ), makeSymbol( "TEST" ), makeSymbol( "UPDATES" ) ), makeSymbol( "&BODY" ), makeSymbol(
      "BODY" ) );
  private static final SubLString $str209$for__ = makeString( "for (" );
  private static final SubLList $list210 = ConsesLow.cons( makeSymbol( "FIRST-INITIALIZATION" ), makeSymbol( "REST-INITIALIATIONS" ) );
  private static final SubLString $str211$__ = makeString( "; " );
  private static final SubLList $list212 = ConsesLow.cons( makeSymbol( "FIRST-UPDATE" ), makeSymbol( "REST-UPDATES" ) );
  private static final SubLList $list213 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "CONSTANT-ID" ), makeSymbol( "CONSTANT-FORM" ) );
  private static final SubLSymbol $sym214$_IC = makeSymbol( "%IC" );
  private static final SubLString $str215$_constants_ = makeString( "_constants[" );
  private static final SubLString $str216$_ = makeString( "]" );
  private static final SubLList $list217 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "CONSTANT-ID" ), makeSymbol( "CONSTANT-FORM" ), makeSymbol( "LOAD-FORM" ) );
  private static final SubLSymbol $sym218$_INTERNAL_CONSTANT = makeSymbol( "%INTERNAL-CONSTANT" );
  private static final SubLString $str219$INITIALIZE_CONSTANT_ = makeString( "INITIALIZE_CONSTANT(" );
  private static final SubLList $list220 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "OBJECT" ) );
  private static final SubLSymbol $sym221$_CSTRING = makeSymbol( "%CSTRING" );
  private static final SubLSymbol $sym222$_CFIX = makeSymbol( "%CFIX" );
  private static final SubLSymbol $sym223$_CBIG = makeSymbol( "%CBIG" );
  private static final SubLSymbol $sym224$_CFLOAT = makeSymbol( "%CFLOAT" );
  private static final SubLSymbol $sym225$_CCHAR = makeSymbol( "%CCHAR" );
  private static final SubLSymbol $sym226$_CPACKAGE = makeSymbol( "%CPACKAGE" );
  private static final SubLSymbol $sym227$_CGUID = makeSymbol( "%CGUID" );
  private static final SubLString $str228$Time_to_add__LF_support_for__S = makeString( "Time to add %LF support for ~S" );
  private static final SubLSymbol $sym229$_CMAKE_SYMBOL = makeSymbol( "%CMAKE-SYMBOL" );
  private static final SubLSymbol $sym230$_CKEYWORD = makeSymbol( "%CKEYWORD" );
  private static final SubLSymbol $sym231$_CINTERN = makeSymbol( "%CINTERN" );
  private static final SubLSymbol $sym232$_CSYMBOL = makeSymbol( "%CSYMBOL" );
  private static final SubLInteger $int233$134217727 = makeInteger( 0x7ffffff );
  private static final SubLInteger $int234$_134217728 = makeInteger( 0xf8000000 );
  private static final SubLList $list235;
  private static final SubLString $str236$volatile_ = makeString( "volatile " );
  private static final SubLSymbol $sym237$MULTIPLE_VALUE_LIST = makeSymbol( "MULTIPLE-VALUE-LIST" );
  private static final SubLSymbol $sym238$_MULTIPLE_VALUE_LIST = makeSymbol( "%MULTIPLE-VALUE-LIST" );
  private static final SubLSymbol $sym239$_NC = makeSymbol( "%NC" );
  private static final SubLSymbol $sym240$_TRUE = makeSymbol( "%TRUE" );
  private static final SubLString $str241$TRUE = makeString( "TRUE" );
  private static final SubLSymbol $sym242$_FALSE = makeSymbol( "%FALSE" );
  private static final SubLString $str243$FALSE = makeString( "FALSE" );
  private static final SubLString $str244$Unexpected_native_constant__S = makeString( "Unexpected native constant ~S" );
  private static final SubLSymbol $sym245$_NOT = makeSymbol( "%NOT" );
  private static final SubLString $str246$___ = makeString( "(!(" );
  private static final SubLString $str247$__ = makeString( "))" );
  private static final SubLList $list248 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "N" ), makeSymbol( "EXPRESSION" ) );
  private static final SubLSymbol $sym249$NTH_VALUE = makeSymbol( "NTH-VALUE" );
  private static final SubLSymbol $sym250$_NTH_VALUE = makeSymbol( "%NTH-VALUE" );
  private static final SubLSymbol $sym251$_OR = makeSymbol( "%OR" );
  private static final SubLList $list252 = ConsesLow.list( makeSymbol( "%NC" ), makeSymbol( "%FALSE" ) );
  private static final SubLString $str253$___ = makeString( "|| " );
  private static final SubLList $list254 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "FUNCTION" ), makeSymbol( "REQUIRED-COUNT" ), makeSymbol( "OPTIONAL-COUNT" ), makeSymbol( "REST?" ) );
  private static final SubLSymbol $sym255$_REGISTER_FUNCTION = makeSymbol( "%REGISTER-FUNCTION" );
  private static final SubLString $str256$DEFINE_ = makeString( "DEFINE(" );
  private static final SubLList $list257 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "DEFINER" ), makeSymbol( "GLOBAL" ), makeSymbol( "INITIALIZATION" ) );
  private static final SubLSymbol $sym258$_REGISTER_GLOBAL = makeSymbol( "%REGISTER-GLOBAL" );
  private static final SubLList $list259 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "FUNCTION" ) );
  private static final SubLSymbol $sym260$_REGISTER_MACRO = makeSymbol( "%REGISTER-MACRO" );
  private static final SubLString $str261$DEFMACRO_ = makeString( "DEFMACRO(" );
  private static final SubLList $list262 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "THREAD-VAR" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
  private static final SubLSymbol $sym263$_WITH_CURRENT_THREAD = makeSymbol( "%WITH-CURRENT-THREAD" );
  private static final SubLList $list264 = ConsesLow.list( makeSymbol( "OPERATOR" ), ConsesLow.list( makeSymbol( "HANDLER" ), makeSymbol( "CATCH-VAR" ), makeSymbol( "ERROR-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol(
      "BODY" ) );
  private static final SubLSymbol $sym265$_WITH_ERROR_HANDLER = makeSymbol( "%WITH-ERROR-HANDLER" );
  private static final SubLSymbol $sym266$_ERROR_HANDLER_ = makeSymbol( "*ERROR-HANDLER*" );
  private static final SubLList $list267 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "ENV-VAR" ), makeSymbol( "RESULT-VAR" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
  private static final SubLSymbol $sym268$_WITH_PROCESS_RESOURCE_TRACKING = makeSymbol( "%WITH-PROCESS-RESOURCE-TRACKING" );
  private static final SubLSymbol $sym269$_BEGIN_WITH_PROCESS_RESOURCE_TRACKING = makeSymbol( "%BEGIN-WITH-PROCESS-RESOURCE-TRACKING" );
  private static final SubLSymbol $sym270$_END_WITH_PROCESS_RESOURCE_TRACKING = makeSymbol( "%END-WITH-PROCESS-RESOURCE-TRACKING" );
  private static final SubLList $list271 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "THREAD" ), makeSymbol( "N" ) );
  private static final SubLSymbol $sym272$_THREAD_MVAL = makeSymbol( "%THREAD-MVAL" );
  private static final SubLSymbol $sym273$_MVAL = makeSymbol( "%MVAL" );
  private static final SubLList $list274 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "THREAD" ) );
  private static final SubLSymbol $sym275$_THREAD_RESET_MVAL = makeSymbol( "%THREAD-RESET-MVAL" );
  private static final SubLList $list276 = ConsesLow.list( makeSymbol( "%RESET-MVAL" ) );
  private static final SubLString $str277$module_4__0D = makeString( "module~4,'0D" );
  private static final SubLString $str278$c = makeString( "c" );
  private static final SubLString $str279$_____include___A_h_____ = makeString( "~%~%#include \"~A.h\"~%~%" );
  private static final SubLString $str280$void_init__A_void___ = makeString( "void init_~A(void) {" );
  private static final SubLString $str281$____ = makeString( "~%  " );
  private static final SubLString $str282$___ = makeString( "();" );
  private static final SubLString $str283$_____ = makeString( "~%}~%" );
  private static final SubLString $str284$h = makeString( "h" );
  private static final SubLString $str285$_____ifdef_CYC_PROFILING = makeString( "~%~%#ifdef CYC_PROFILING" );
  private static final SubLString $str286$___endif__ = makeString( "~%#endif~%" );
  private static final SubLList $list287 = ConsesLow.list( makeSymbol( "MODULE-PATH" ), makeSymbol( "MODULE" ) );
  private static final SubLString $str288$___include___A_A_h_ = makeString( "~%#include \"~A~A.h\"" );
  private static final SubLString $str289$____extern_void_init__A_void____ = makeString( "~%~%extern void init_~A(void);~%" );
  private static final SubLString $str290$ = makeString( "" );
  private static final SubLString $str291$filelist = makeString( "filelist" );
  private static final SubLString $str292$text = makeString( "text" );
  private static final SubLList $list293 = ConsesLow.list( makeSymbol( "MODULE-PATH" ), makeSymbol( "MODULES" ) );
  private static final SubLString $str294$_A_HEADERS___ = makeString( "~A_HEADERS = " );
  private static final SubLString $str295$____c_A_h_ = makeString( "\\~%~c~A.h " );
  private static final SubLString $str296$____c_A_A_h_ = makeString( "\\~%~c~A~A.h " );
  private static final SubLString $str297$_____A_SOURCES___ = makeString( "~%~%~A_SOURCES = " );
  private static final SubLString $str298$____c_A_c_ = makeString( "\\~%~c~A.c " );
  private static final SubLString $str299$____c_A_A_c_ = makeString( "\\~%~c~A~A.c " );
  private static final SubLString $str300$_____A_OBJECTS___ = makeString( "~%~%~A_OBJECTS = " );
  private static final SubLString $str301$____c_A_o_ = makeString( "\\~%~c~A.o " );
  private static final SubLString $str302$____c_A_A_o_ = makeString( "\\~%~c~A~A.o " );
  private static final SubLString $str303$____lib_A_a_____A_OBJECTS_____ = makeString( "~%~%lib~A.a: $(~A_OBJECTS)~%~%" );
  private static final SubLString $str304$build_index = makeString( "build-index" );
  private static final SubLSymbol $sym305$C_BACKEND_IFDEF_NAME_FROM_STRING = makeSymbol( "C-BACKEND-IFDEF-NAME-FROM-STRING" );
  private static final SubLString $str306$BUILD_OBJECTS___ = makeString( "BUILD_OBJECTS = " );
  private static final SubLString $str307$__ = makeString( "$(" );
  private static final SubLString $str308$_OBJECTS_ = makeString( "_OBJECTS)" );
  private static final SubLString $str309$BUILD_SOURCES___ = makeString( "BUILD_SOURCES = " );
  private static final SubLString $str310$_SOURCES_ = makeString( "_SOURCES)" );
  private static final SubLString $str311$BUILD_HEADERS___ = makeString( "BUILD_HEADERS = " );
  private static final SubLString $str312$_HEADERS_ = makeString( "_HEADERS)" );
  private static final SubLSymbol $sym313$C_BACKEND_FILE_NAME_FROM_STRING = makeSymbol( "C-BACKEND-FILE-NAME-FROM-STRING" );
  private static final SubLString $str314$BUILD_LIBRARIES___ = makeString( "BUILD_LIBRARIES = " );
  private static final SubLString $str315$lib = makeString( "lib" );
  private static final SubLString $str316$_a = makeString( ".a" );
  private static final SubLString $str317$___A = makeString( "~%~A" );
  private static final SubLString $str318$_A_A_A_ = makeString( "~A~A~A " );
  private static final SubLString $str319$build_instructions = makeString( "build-instructions" );
  private static final SubLString $str320$__curr_dir______shell_pwd___PWD__ = makeString( "~%curr-dir := $(shell pwd)~%PWD = ${curr-dir}~%MKDIR=mkdir -p" );
  private static final SubLString $str321$______DIRS___ = makeString( "~%~%~%DIRS = " );
  private static final SubLString $str322$__C______ = makeString( " ~C~%    " );
  private static final SubLString $str323$__PWD___A = makeString( "$(PWD)/~A" );
  private static final SubLString $str324$______PWD___A____C__MKDIR____ = makeString( "~%~%$(PWD)/~A:~%~C$(MKDIR) $@" );
  private static final SubLString $str325$_ = makeString( "/" );
  private static final SubLSymbol $sym326$CCONCATENATE = makeSymbol( "CCONCATENATE" );
  // static final boolean assertionsDisabledInClass =
  // !com/cyc/cycjava/cycl/desiredAssertionStatus();
  static
  {
    $list61 = ConsesLow.list( ConsesLow.cons( Characters.CHAR_question, Characters.CHAR_P ), ConsesLow.cons( Characters.CHAR_hyphen, Characters.CHAR_underbar ), ConsesLow.cons( Characters.CHAR_space,
        Characters.CHAR_underbar ), ConsesLow.cons( Characters.CHAR_less, Characters.CHAR_L ), ConsesLow.cons( Characters.CHAR_equal, Characters.CHAR_E ), ConsesLow.cons( Characters.CHAR_greater, Characters.CHAR_G ) );
    $list153 = ConsesLow.list( ConsesLow.list( makeSymbol( "%PC" ), NIL ) );
    $list235 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "VARIABLE" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "INITIALIZATION" ), NIL, makeSymbol( "INITIALIZED?" ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 854L)
  public static SubLObject c_backend_output_file_and_header_file(final SubLObject ts_file, final SubLObject c_output_filename, SubLObject finger_print)
  {
    if( finger_print == UNPROVIDED )
    {
      finger_print = NIL;
    }
    assert NIL != file_translation.trans_subl_file_p( ts_file ) : ts_file;
    assert NIL != Types.stringp( c_output_filename ) : c_output_filename;
    final SubLObject h_output_filename = c_backend_associated_header_file( c_output_filename );
    c_backend_output_header_file( ts_file, h_output_filename );
    c_backend_output_file( ts_file, c_output_filename );
    return ts_file;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 1495L)
  public static SubLObject c_backend_output_file(final SubLObject ts_file, final SubLObject output_filename)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != file_translation.trans_subl_file_p( ts_file ) : ts_file;
    assert NIL != Types.stringp( output_filename ) : output_filename;
    SubLObject result = NIL;
    file_utilities.ensure_directories_exist( output_filename );
    final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding( thread );
    final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding( thread );
    try
    {
      StreamsLow.$stream_initial_input_buffer_size$.bind( $int2$1048576, thread );
      StreamsLow.$stream_initial_output_buffer_size$.bind( StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue( thread ), thread );
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0_$1 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( output_filename, $kw3$OUTPUT );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_$1, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str4$Unable_to_open__S, output_filename );
        }
        final SubLObject stream_$2 = stream;
        result = c_backend_output_to_stream( ts_file, stream_$2, output_filename );
      }
      finally
      {
        final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2, thread );
        }
      }
    }
    finally
    {
      StreamsLow.$stream_initial_output_buffer_size$.rebind( _prev_bind_2, thread );
      StreamsLow.$stream_initial_input_buffer_size$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 1865L)
  public static SubLObject c_backend_output_header_file(final SubLObject ts_file, final SubLObject output_filename)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != file_translation.trans_subl_file_p( ts_file ) : ts_file;
    assert NIL != Types.stringp( output_filename ) : output_filename;
    SubLObject result = NIL;
    file_utilities.ensure_directories_exist( output_filename );
    final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding( thread );
    final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding( thread );
    try
    {
      StreamsLow.$stream_initial_input_buffer_size$.bind( $int2$1048576, thread );
      StreamsLow.$stream_initial_output_buffer_size$.bind( StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue( thread ), thread );
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0_$4 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( output_filename, $kw3$OUTPUT );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_$4, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str4$Unable_to_open__S, output_filename );
        }
        final SubLObject stream_$5 = stream;
        result = c_backend_output_definition_headers_to_stream( ts_file, stream_$5, output_filename );
      }
      finally
      {
        final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$5, thread );
        }
      }
    }
    finally
    {
      StreamsLow.$stream_initial_output_buffer_size$.rebind( _prev_bind_2, thread );
      StreamsLow.$stream_initial_input_buffer_size$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 2261L)
  public static SubLObject c_backend_associated_header_file(final SubLObject c_output_filename)
  {
    assert NIL != Types.stringp( c_output_filename ) : c_output_filename;
    if( c_output_filename.equal( $str5$_dev_null ) )
    {
      return $str5$_dev_null;
    }
    if( NIL != string_utilities.ends_with( c_output_filename, $str6$_c, UNPROVIDED ) )
    {
      return Sequences.cconcatenate( format_nil.format_nil_a_no_copy( string_utilities.substring( c_output_filename, ZERO_INTEGER, Numbers.subtract( Sequences.length( c_output_filename ), TWO_INTEGER ) ) ), $str7$_h );
    }
    if( NIL != string_utilities.ends_with( c_output_filename, $str8$_C, UNPROVIDED ) )
    {
      return Sequences.cconcatenate( format_nil.format_nil_a_no_copy( string_utilities.substring( c_output_filename, ZERO_INTEGER, Numbers.subtract( Sequences.length( c_output_filename ), TWO_INTEGER ) ) ), $str9$_H );
    }
    return Errors.error( $str10$unexpected_C_filename__S, c_output_filename );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 2899L)
  public static SubLObject c_backend_output_to_stream(final SubLObject ts_file, SubLObject stream, SubLObject output_filename)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    if( output_filename == UNPROVIDED )
    {
      output_filename = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != file_translation.trans_subl_file_p( ts_file ) : ts_file;
    final SubLObject _prev_bind_0 = reader.$read_default_float_format$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $anonymous_variable_counter$.currentBinding( thread );
    final SubLObject _prev_bind_3 = file_translation.$current_ts_file$.currentBinding( thread );
    try
    {
      reader.$read_default_float_format$.bind( $sym11$DOUBLE_FLOAT, thread );
      $anonymous_variable_counter$.bind( ZERO_INTEGER, thread );
      file_translation.$current_ts_file$.bind( ts_file, thread );
      final SubLObject local_state;
      final SubLObject state = local_state = memoization_state.new_memoization_state( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject _prev_bind_0_$7 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          c_backend_output_header_section( ts_file, output_filename, stream );
          c_backend_output_forward_global_declarations( ts_file, stream );
          c_backend_output_forward_function_declarations( ts_file, stream );
          c_backend_output_internal_constant_array_definition( ts_file, stream );
          c_backend_output_private_global_definitions( ts_file, stream );
          c_backend_output_private_function_definitions( ts_file, stream );
          c_backend_output_definitions( ts_file, stream );
          streams_high.terpri( stream );
        }
        finally
        {
          final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$8, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$7, thread );
      }
    }
    finally
    {
      file_translation.$current_ts_file$.rebind( _prev_bind_3, thread );
      $anonymous_variable_counter$.rebind( _prev_bind_2, thread );
      reader.$read_default_float_format$.rebind( _prev_bind_0, thread );
    }
    return ts_file;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 3769L)
  public static SubLObject c_backend_output_definition_headers_to_stream(final SubLObject ts_file, SubLObject stream, SubLObject output_filename)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    if( output_filename == UNPROVIDED )
    {
      output_filename = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != file_translation.trans_subl_file_p( ts_file ) : ts_file;
    final SubLObject _prev_bind_0 = reader.$read_default_float_format$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $anonymous_variable_counter$.currentBinding( thread );
    final SubLObject _prev_bind_3 = file_translation.$current_ts_file$.currentBinding( thread );
    try
    {
      reader.$read_default_float_format$.bind( $sym11$DOUBLE_FLOAT, thread );
      $anonymous_variable_counter$.bind( ZERO_INTEGER, thread );
      file_translation.$current_ts_file$.bind( ts_file, thread );
      final SubLObject local_state;
      final SubLObject state = local_state = memoization_state.new_memoization_state( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject _prev_bind_0_$9 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          c_backend_write_preamble( stream, output_filename, file_translation.ts_file_module_name( ts_file ) );
          c_backend_output_global_headers( ts_file, stream );
          c_backend_output_function_headers( ts_file, stream );
        }
        finally
        {
          final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$10, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$9, thread );
      }
    }
    finally
    {
      file_translation.$current_ts_file$.rebind( _prev_bind_3, thread );
      $anonymous_variable_counter$.rebind( _prev_bind_2, thread );
      reader.$read_default_float_format$.rebind( _prev_bind_0, thread );
    }
    return ts_file;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 4306L)
  public static SubLObject c_backend_output_global_headers(final SubLObject ts_file, final SubLObject stream)
  {
    streams_high.terpri( stream );
    SubLObject cdolist_list_var = file_translation.ts_file_all_defined_globals( ts_file );
    SubLObject global = NIL;
    global = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == file_translation.current_ts_file_defined_private_global_p( global ) )
      {
        c_backend_output_forward_global_declaration( global, stream );
      }
      cdolist_list_var = cdolist_list_var.rest();
      global = cdolist_list_var.first();
    }
    streams_high.terpri( stream );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 4629L)
  public static SubLObject c_backend_output_function_headers(final SubLObject ts_file, final SubLObject stream)
  {
    streams_high.terpri( stream );
    SubLObject cdolist_list_var = file_translation.ts_file_all_defined_functions( ts_file );
    SubLObject function = NIL;
    function = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == file_translation.current_ts_file_defined_private_method_p( function ) )
      {
        c_backend_output_forward_function_declaration( function, stream );
      }
      cdolist_list_var = cdolist_list_var.rest();
      function = cdolist_list_var.first();
    }
    streams_high.terpri( stream );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 4966L)
  public static SubLObject c_backend_output_header_section(final SubLObject ts_file, final SubLObject output_filename, final SubLObject stream)
  {
    c_backend_write_preamble( stream, output_filename, file_translation.ts_file_module_name( ts_file ) );
    streams_high.terpri( stream );
    streams_high.terpri( stream );
    streams_high.write_string( $str12$_include__rtl_h_, stream, UNPROVIDED, UNPROVIDED );
    if( NIL == system_translation.current_system_translation_secureP() )
    {
      SubLObject module_name = file_translation.ts_file_module_name( ts_file );
      final SubLObject system_name = $str13$CYCL;
      module_name = Sequences.substitute( Characters.CHAR_underbar, Characters.CHAR_hyphen, module_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      PrintLow.format( stream, $str14$_____ifdef__A_PROFILING, system_name );
      PrintLow.format( stream, $str15$___define__A_PROFILING, module_name );
      PrintLow.format( stream, $str16$___endif );
      PrintLow.format( stream, $str14$_____ifdef__A_PROFILING, module_name );
      PrintLow.format( stream, $str17$___define_PROFILING );
      PrintLow.format( stream, $str16$___endif );
    }
    PrintLow.format( stream, $str18$_____include__code_flow_hooks_h_ );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 5836L)
  public static SubLObject c_backend_write_preamble(final SubLObject stream, final SubLObject output_filename, SubLObject module_name)
  {
    if( module_name == UNPROVIDED )
    {
      module_name = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    PrintLow.format( stream, $str19$____ );
    PrintLow.format( stream, $str20$____A__, translation_copyright_string() );
    if( !$str21$SUBLISP.equal( java_backend.current_system_translation_system() ) )
    {
      if( NIL != list_utilities.member_eqP( system_translation.current_system_translation_security_level(), $list22 ) )
      {
        PrintLow.format( stream, $str23$___file__________a___, output_filename );
      }
      if( $kw24$HIGH != system_translation.current_system_translation_security_level() )
      {
        thread.resetMultipleValues();
        final SubLObject second = Time.get_decoded_time();
        final SubLObject minute = thread.secondMultipleValue();
        final SubLObject hour = thread.thirdMultipleValue();
        final SubLObject date = thread.fourthMultipleValue();
        final SubLObject month = thread.fifthMultipleValue();
        final SubLObject year = thread.sixthMultipleValue();
        thread.resetMultipleValues();
        PrintLow.format( stream, $str25$___created_______4__0D__2__0D__2_, new SubLObject[] { year, month, date, hour, minute, second
        } );
      }
    }
    if( NIL != module_name && NIL != list_utilities.member_eqP( system_translation.current_system_translation_security_level(), $list22 ) )
    {
      PrintLow.format( stream, $str26$___source_file___a___, module_name );
    }
    PrintLow.format( stream, $str27$___ );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 6873L)
  public static SubLObject c_backend_write_makefile_preamble(final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    PrintLow.format( stream, $str28$____A__, translation_copyright_string() );
    thread.resetMultipleValues();
    final SubLObject second = Time.get_decoded_time();
    final SubLObject minute = thread.secondMultipleValue();
    final SubLObject hour = thread.thirdMultipleValue();
    final SubLObject date = thread.fourthMultipleValue();
    final SubLObject month = thread.fifthMultipleValue();
    final SubLObject year = thread.sixthMultipleValue();
    thread.resetMultipleValues();
    PrintLow.format( stream, $str29$____created_______4__0D__2__0D__2, new SubLObject[] { year, month, date, hour, minute, second
    } );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 7215L)
  public static SubLObject translation_copyright_string()
  {
    return $str30$Copyright__c__1995___2014_Cycorp_;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 7404L)
  public static SubLObject c_backend_output_forward_global_declarations(final SubLObject ts_file, final SubLObject stream)
  {
    final SubLObject globals = ts_file_all_forward_referenced_globals( ts_file );
    if( NIL != globals )
    {
      PrintLow.format( stream, $str31$_______referenced_globals___ );
    }
    SubLObject cdolist_list_var = globals;
    SubLObject global = NIL;
    global = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      c_backend_output_forward_global_declaration( global, stream );
      cdolist_list_var = cdolist_list_var.rest();
      global = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 7772L)
  public static SubLObject c_backend_output_forward_function_declarations(final SubLObject ts_file, final SubLObject stream)
  {
    final SubLObject functions = ts_file_all_forward_referenced_functions( ts_file );
    if( NIL != functions )
    {
      PrintLow.format( stream, $str32$_______referenced_functions___ );
    }
    SubLObject cdolist_list_var = functions;
    SubLObject function = NIL;
    function = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      c_backend_output_forward_function_declaration( function, stream );
      cdolist_list_var = cdolist_list_var.rest();
      function = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 8122L)
  public static SubLObject forward_global_reference_via_rtlP(final SubLObject global)
  {
    return c_name_translation.c_backend_predefined_global_p( global );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 8263L)
  public static SubLObject forward_function_reference_via_rtlP(final SubLObject function)
  {
    return c_name_translation.c_backend_predefined_function_p( function );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 8411L)
  public static SubLObject ts_file_all_forward_referenced_globals(final SubLObject ts_file)
  {
    final SubLObject globals = file_translation.ts_file_all_referenced_globals( ts_file );
    SubLObject forward_globals = NIL;
    SubLObject cdolist_list_var = globals;
    SubLObject global = NIL;
    global = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == forward_global_reference_via_rtlP( global ) && NIL == file_translation.ts_file_defined_private_global_p( ts_file, global ) )
      {
        forward_globals = ConsesLow.cons( global, forward_globals );
      }
      cdolist_list_var = cdolist_list_var.rest();
      global = cdolist_list_var.first();
    }
    return Sequences.nreverse( forward_globals );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 8784L)
  public static SubLObject ts_file_all_forward_referenced_functions(final SubLObject ts_file)
  {
    final SubLObject functions = file_translation.ts_file_all_referenced_functions( ts_file );
    SubLObject forward_functions = NIL;
    SubLObject cdolist_list_var = functions;
    SubLObject function = NIL;
    function = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == forward_function_reference_via_rtlP( function ) )
      {
        forward_functions = ConsesLow.cons( function, forward_functions );
      }
      cdolist_list_var = cdolist_list_var.rest();
      function = cdolist_list_var.first();
    }
    return Sequences.nreverse( forward_functions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 9117L)
  public static SubLObject c_backend_output_forward_global_declaration(final SubLObject global, final SubLObject stream)
  {
    streams_high.terpri( stream );
    streams_high.write_string( $str33$extern_, stream, UNPROVIDED, UNPROVIDED );
    c_backend_write_object_data_type( stream );
    streams_high.write_string( $str34$_, stream, UNPROVIDED, UNPROVIDED );
    c_backend_write_form( global, stream, UNPROVIDED );
    streams_high.write_string( $str35$_, stream, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 9399L)
  public static SubLObject c_backend_output_forward_function_declaration(final SubLObject function, final SubLObject stream)
  {
    streams_high.terpri( stream );
    if( NIL != file_translation.current_ts_file_defined_private_method_p( function ) )
    {
      streams_high.write_string( $str36$static_, stream, UNPROVIDED, UNPROVIDED );
    }
    else
    {
      streams_high.write_string( $str33$extern_, stream, UNPROVIDED, UNPROVIDED );
    }
    c_backend_write_function_declaration( stream, function, $kw37$UNPROVIDED, ZERO_INTEGER );
    streams_high.write_string( $str35$_, stream, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 9750L)
  public static SubLObject c_backend_output_internal_constant_array_definition(final SubLObject ts_file, final SubLObject stream)
  {
    final SubLObject internal_constant_count = file_translation.ts_file_internal_constant_count( ts_file );
    streams_high.terpri( stream );
    streams_high.terpri( stream );
    PrintLow.format( stream, $str38$static_Dp__constants__A__, internal_constant_count );
    streams_high.write_string( $str39$_____container_for_all_constant_v, stream, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 10331L)
  public static SubLObject c_backend_output_private_global_definitions(final SubLObject ts_file, final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject definitions = file_translation.ts_file_private_global_definitions( ts_file );
    if( NIL != definitions )
    {
      PrintLow.format( stream, $str40$_______private_globals___ );
    }
    final SubLObject _prev_bind_0 = $c_backend_write_global_definition_as_comment$.currentBinding( thread );
    try
    {
      $c_backend_write_global_definition_as_comment$.bind( NIL, thread );
      SubLObject cdolist_list_var = definitions;
      SubLObject definition = NIL;
      definition = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        streams_high.terpri( stream );
        c_backend_write_statement( definition, stream, ZERO_INTEGER );
        cdolist_list_var = cdolist_list_var.rest();
        definition = cdolist_list_var.first();
      }
    }
    finally
    {
      $c_backend_write_global_definition_as_comment$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 10739L)
  public static SubLObject c_backend_output_private_function_definitions(final SubLObject ts_file, final SubLObject stream)
  {
    if( $str21$SUBLISP.equal( java_backend.current_system_translation_system() ) )
    {
      final SubLObject functions = file_translation.ts_file_all_defined_private_functions( ts_file );
      if( NIL != functions )
      {
        PrintLow.format( stream, $str41$_______private_functions___ );
      }
      SubLObject cdolist_list_var = functions;
      SubLObject function = NIL;
      function = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        streams_high.terpri( stream );
        c_backend_output_forward_function_declaration( function, stream );
        cdolist_list_var = cdolist_list_var.rest();
        function = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 11192L)
  public static SubLObject c_backend_output_definitions(final SubLObject ts_file, final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cdolist_list_var;
    final SubLObject definitions = cdolist_list_var = file_translation.ts_file_definitions( ts_file );
    SubLObject definition = NIL;
    definition = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject _prev_bind_0 = $c_backend_write_global_definition_as_comment$.currentBinding( thread );
      try
      {
        $c_backend_write_global_definition_as_comment$.bind( file_translation.ts_file_private_global_definition_p( ts_file, definition ), thread );
        streams_high.terpri( stream );
        c_backend_write_statement( definition, stream, ZERO_INTEGER );
      }
      finally
      {
        $c_backend_write_global_definition_as_comment$.rebind( _prev_bind_0, thread );
      }
      cdolist_list_var = cdolist_list_var.rest();
      definition = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 11650L)
  public static SubLObject c_backend_write_statement(final SubLObject statement_form, final SubLObject stream, SubLObject depth)
  {
    if( depth == UNPROVIDED )
    {
      depth = ZERO_INTEGER;
    }
    streams_high.terpri( stream );
    c_backend_indent( stream, depth );
    if( NIL != c_backend_write_form( statement_form, stream, depth ) )
    {
      streams_high.write_string( $str35$_, stream, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 12117L)
  public static SubLObject c_backend_write_form(SubLObject form, final SubLObject stream, SubLObject depth)
  {
    if( depth == UNPROVIDED )
    {
      depth = ZERO_INTEGER;
    }
    form = c_backend_optimize_function_call_form( form );
    if( form.isAtom() )
    {
      return c_backend_print_atom( form, stream, depth );
    }
    final SubLObject operator = form.first();
    final SubLObject writer = c_backend_writer( operator );
    if( NIL != writer )
    {
      return c_backend_write_via_writer( writer, form, stream, depth );
    }
    return c_backend_write_function_call( form, stream, depth );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 12559L)
  public static SubLObject c_backend_test_translate_write_form(final SubLObject form, final SubLObject stream, SubLObject depth)
  {
    if( depth == UNPROVIDED )
    {
      depth = ZERO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = reader.$read_default_float_format$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $anonymous_variable_counter$.currentBinding( thread );
    try
    {
      reader.$read_default_float_format$.bind( $sym11$DOUBLE_FLOAT, thread );
      $anonymous_variable_counter$.bind( ZERO_INTEGER, thread );
      final SubLObject local_state;
      final SubLObject state = local_state = memoization_state.new_memoization_state( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject _prev_bind_0_$11 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          c_backend_write_form( form, stream, depth );
        }
        finally
        {
          final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$12, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$11, thread );
      }
    }
    finally
    {
      $anonymous_variable_counter$.rebind( _prev_bind_2, thread );
      reader.$read_default_float_format$.rebind( _prev_bind_0, thread );
    }
    return form;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 12874L)
  public static SubLObject c_backend_indent(final SubLObject stream, final SubLObject depth)
  {
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( depth ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      streams_high.write_string( $str42$__, stream, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 13004L)
  public static SubLObject c_backend_print_atom(final SubLObject atom, final SubLObject stream, final SubLObject depth)
  {
    if( atom.isSymbol() )
    {
      c_backend_print_variable( atom, stream );
    }
    else
    {
      if( NIL == c_backend_native_constant_p( atom ) )
      {
        return Errors.error( $str43$Unexpected_C_backend_atom____S, atom );
      }
      c_backend_write_native_constant( atom, stream );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 13318L)
  public static SubLObject c_backend_native_constant_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isInteger() || v_object.isString() || v_object.isDouble() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 13658L)
  public static SubLObject c_backend_write_native_constant(final SubLObject atom, final SubLObject stream)
  {
    if( atom.isInteger() )
    {
      return print_high.princ( atom, stream );
    }
    if( atom.isString() )
    {
      return c_backend_write_native_string_constant( atom, stream );
    }
    if( atom.isDouble() )
    {
      final SubLObject base_form = string_utilities.to_string( atom );
      final SubLObject cleaned = Strings.string_upcase( Sequences.remove( Characters.CHAR_plus, base_form, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
      streams_high.write_string( cleaned, stream, UNPROVIDED, UNPROVIDED );
      return atom;
    }
    return print_high.princ( atom, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 14121L)
  public static SubLObject c_backend_write_native_string_constant(final SubLObject string, final SubLObject stream)
  {
    if( NIL == Sequences.position( Characters.CHAR_newline, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL == Sequences.position( Characters.CHAR_return, string, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED ) && NIL == Sequences.position( Characters.CHAR_quotation, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL == Sequences.position( Characters.CHAR_backslash, string, UNPROVIDED,
            UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return print_high.prin1( string, stream );
    }
    streams_high.write_char( Characters.CHAR_quotation, stream );
    SubLObject end_var_$13;
    SubLObject end_var;
    SubLObject char_num;
    SubLObject pcase_var;
    SubLObject v_char;
    for( end_var = ( end_var_$13 = Sequences.length( string ) ), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE( end_var_$13 ); char_num = number_utilities.f_1X( char_num ) )
    {
      v_char = ( pcase_var = Strings.sublisp_char( string, char_num ) );
      if( pcase_var.eql( Characters.CHAR_newline ) )
      {
        streams_high.write_char( Characters.CHAR_backslash, stream );
        streams_high.write_char( Characters.CHAR_n, stream );
      }
      else if( pcase_var.eql( Characters.CHAR_return ) )
      {
        streams_high.write_char( Characters.CHAR_backslash, stream );
        streams_high.write_char( Characters.CHAR_r, stream );
      }
      else if( pcase_var.eql( Characters.CHAR_quotation ) )
      {
        streams_high.write_char( Characters.CHAR_backslash, stream );
        streams_high.write_char( Characters.CHAR_quotation, stream );
      }
      else if( pcase_var.eql( Characters.CHAR_backslash ) )
      {
        streams_high.write_char( Characters.CHAR_backslash, stream );
        streams_high.write_char( Characters.CHAR_backslash, stream );
      }
      else
      {
        streams_high.write_char( v_char, stream );
      }
    }
    streams_high.write_char( Characters.CHAR_quotation, stream );
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 14820L)
  public static SubLObject c_backend_write_Xpc(final SubLObject pc_form, final SubLObject stream, SubLObject depth)
  {
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    SubLObject operator = NIL;
    SubLObject constant = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( pc_form, pc_form, $list44 );
    operator = pc_form.first();
    SubLObject current = pc_form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, pc_form, $list44 );
    constant = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( pc_form, $list44 );
      return NIL;
    }
    list_utilities.verify_operator( operator, $sym45$_PC );
    final SubLObject pc_string = c_name_translation.c_backend_predefined_constant_name( constant );
    if( NIL == pc_string )
    {
      return Errors.error( $str46$Time_to_implement_a_C_backend_tra, constant );
    }
    return streams_high.write_string( pc_string, stream, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 15257L)
  public static SubLObject c_backend_print_variable(final SubLObject variable, final SubLObject stream)
  {
    final SubLObject pcase_var;
    final SubLObject binding_type = pcase_var = c_backend_variable_binding_type( variable );
    if( pcase_var.eql( $kw47$DYNAMIC ) )
    {
      c_backend_write_global_variable_name( variable, stream );
    }
    else if( pcase_var.eql( $kw48$LEXICAL ) )
    {
      c_backend_write_global_variable_name( variable, stream );
    }
    else if( pcase_var.eql( $kw49$CONSTANT ) )
    {
      c_backend_write_global_variable_name( variable, stream );
    }
    else
    {
      if( !pcase_var.eql( $kw50$LOCAL ) )
      {
        return Errors.error( $str51$unexpected_variable_binding_type_, binding_type, variable );
      }
      c_backend_write_local_variable_name( variable, stream );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 16001L)
  public static SubLObject c_backend_variable_binding_type(final SubLObject variable)
  {
    final SubLObject binding_type = c_name_translation.c_backend_undefined_variable_binding_type_lookup( variable );
    if( NIL != binding_type )
    {
      return binding_type;
    }
    return form_translation.translator_variable_binding_type( variable );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 16246L)
  public static SubLObject c_backend_write_global_variable_name(final SubLObject global, final SubLObject stream)
  {
    if( NIL != list_utilities.member_eqP( system_translation.current_system_translation_security_level(), $list52 ) )
    {
      final SubLObject secure_global_id = c_backend_secure_global_id( global );
      if( NIL != secure_global_id )
      {
        return PrintLow.format( stream, $str53$_gv_S_, secure_global_id );
      }
    }
    return streams_high.write_string( c_backend_global_variable_name( global ), stream, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 16619L)
  public static SubLObject c_backend_write_local_variable_name(final SubLObject local, final SubLObject stream)
  {
    if( NIL != list_utilities.member_eqP( system_translation.current_system_translation_security_level(), $list52 ) )
    {
      final SubLObject secure_local_id = c_backend_secure_local_id( local );
      return PrintLow.format( stream, $str54$_v_S_, secure_local_id );
    }
    return streams_high.write_string( c_backend_local_variable_name( local ), stream, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 16954L)
  public static SubLObject c_backend_secure_global_id(final SubLObject global)
  {
    if( control_vars.$cyc_package$.getGlobalValue().eql( Symbols.symbol_package( global ) ) && NIL == c_name_translation.c_backend_predefined_global_p( global ) )
    {
      final SubLObject sys_tran = system_translation.current_system_translation();
      if( NIL != sys_tran )
      {
        return system_translation.sys_tran_secure_global_id( sys_tran, global );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 17241L)
  public static SubLObject c_backend_secure_local_id_internal(final SubLObject local)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $anonymous_variable_counter$.setDynamicValue( Numbers.add( $anonymous_variable_counter$.getDynamicValue( thread ), ONE_INTEGER ), thread );
    return $anonymous_variable_counter$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 17241L)
  public static SubLObject c_backend_secure_local_id(final SubLObject local)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return c_backend_secure_local_id_internal( local );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym55$C_BACKEND_SECURE_LOCAL_ID, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym55$C_BACKEND_SECURE_LOCAL_ID, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym55$C_BACKEND_SECURE_LOCAL_ID, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, local, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( c_backend_secure_local_id_internal( local ) ) );
      memoization_state.caching_state_put( caching_state, local, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 17418L)
  public static SubLObject c_backend_local_variable_name_internal(final SubLObject variable)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject name_basis = c_backend_symbol_name_basis( variable );
    if( NIL != Symbols.symbol_package( variable ) )
    {
      return Sequences.cconcatenate( $str57$v_, format_nil.format_nil_a_no_copy( name_basis ) );
    }
    $anonymous_variable_counter$.setDynamicValue( Numbers.add( $anonymous_variable_counter$.getDynamicValue( thread ), ONE_INTEGER ), thread );
    return Sequences.cconcatenate( $str57$v_, new SubLObject[] { format_nil.format_nil_a_no_copy( name_basis ), $str58$_, format_nil.format_nil_a_no_copy( $anonymous_variable_counter$.getDynamicValue( thread ) )
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 17418L)
  public static SubLObject c_backend_local_variable_name(final SubLObject variable)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return c_backend_local_variable_name_internal( variable );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym56$C_BACKEND_LOCAL_VARIABLE_NAME, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym56$C_BACKEND_LOCAL_VARIABLE_NAME, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym56$C_BACKEND_LOCAL_VARIABLE_NAME, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, variable, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( c_backend_local_variable_name_internal( variable ) ) );
      memoization_state.caching_state_put( caching_state, variable, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 17774L)
  public static SubLObject c_backend_global_variable_name(final SubLObject variable)
  {
    final SubLObject predefined_name = c_name_translation.c_backend_global_name_lookup( variable );
    if( NIL != predefined_name )
    {
      return predefined_name;
    }
    return c_backend_compute_global_variable_name( variable );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 18013L)
  public static SubLObject c_backend_compute_global_variable_name_internal(final SubLObject variable)
  {
    final SubLObject name_basis = c_backend_symbol_name_basis( variable );
    return Sequences.cconcatenate( $str60$gv_, format_nil.format_nil_a_no_copy( name_basis ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 18013L)
  public static SubLObject c_backend_compute_global_variable_name(final SubLObject variable)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return c_backend_compute_global_variable_name_internal( variable );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym59$C_BACKEND_COMPUTE_GLOBAL_VARIABLE_NAME, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym59$C_BACKEND_COMPUTE_GLOBAL_VARIABLE_NAME, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym59$C_BACKEND_COMPUTE_GLOBAL_VARIABLE_NAME, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, variable, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( c_backend_compute_global_variable_name_internal( variable ) ) );
      memoization_state.caching_state_put( caching_state, variable, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 18219L)
  public static SubLObject c_backend_symbol_name_basis(final SubLObject variable)
  {
    final SubLObject name = Symbols.symbol_name( variable );
    return c_backed_convert_identifier_name( name );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 18405L)
  public static SubLObject c_backed_convert_identifier_name(final SubLObject name)
  {
    assert NIL != Types.stringp( name ) : name;
    final SubLObject length = Sequences.length( name );
    final SubLObject start = ( length.isPositive() && NIL != Characters.charE( Strings.sublisp_char( name, ZERO_INTEGER ), Characters.CHAR_asterisk ) ) ? ONE_INTEGER : ZERO_INTEGER;
    final SubLObject end = ( length.numG( ONE_INTEGER ) && start.numE( ONE_INTEGER ) && NIL != Characters.charE( Strings.sublisp_char( name, number_utilities.f_1_( length ) ), Characters.CHAR_asterisk ) )
        ? number_utilities.f_1_( length )
        : length;
    final SubLObject string_var;
    final SubLObject name_basis = string_var = string_utilities.substring( name, start, end );
    SubLObject end_var_$14;
    SubLObject end_var;
    SubLObject index;
    SubLObject v_char;
    for( end_var = ( end_var_$14 = Sequences.length( string_var ) ), index = NIL, index = ZERO_INTEGER; !index.numGE( end_var_$14 ); index = number_utilities.f_1X( index ) )
    {
      v_char = Strings.sublisp_char( string_var, index );
      Strings.set_char( name_basis, index, c_backend_convert_char( Characters.char_downcase( v_char ) ) );
    }
    return name_basis;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 19149L)
  public static SubLObject c_backend_convert_char(final SubLObject v_char)
  {
    if( NIL != Characters.alphanumericp( v_char ) || NIL != Characters.charE( v_char, Characters.CHAR_underbar ) )
    {
      return v_char;
    }
    return list_utilities.alist_lookup_without_values( $c_backend_convert_char_map$.getGlobalValue(), v_char, Symbols.symbol_function( EQL ), Characters.CHAR_X );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 19365L)
  public static SubLObject c_backend_write_function_call(final SubLObject function_call_form, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject operator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( function_call_form, function_call_form, $list62 );
    operator = function_call_form.first();
    final SubLObject args;
    final SubLObject current = args = function_call_form.rest();
    thread.resetMultipleValues();
    final SubLObject required_count = c_backend_function_signature_info( operator );
    final SubLObject optional_count = thread.secondMultipleValue();
    final SubLObject restP = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( $kw63$UNKNOWN == required_count )
    {
      Errors.warn( $str64$translating__S_call_as_funcall, operator );
      return c_backend_write_function_call( ConsesLow.listS( $sym65$FUNCALL, ConsesLow.list( $sym66$_LF, operator ), ConsesLow.append( args, NIL ) ), stream, depth );
    }
    final SubLObject call_arity = Sequences.length( args );
    final SubLObject non_rest_count = Numbers.add( required_count, optional_count );
    final SubLObject rest_count = Numbers.max( ZERO_INTEGER, Numbers.subtract( call_arity, non_rest_count ) );
    final SubLObject defaulted_optional_count = Numbers.max( ZERO_INTEGER, Numbers.subtract( non_rest_count, call_arity ) );
    final SubLObject missing_required_count = Numbers.max( ZERO_INTEGER, Numbers.subtract( required_count, call_arity ) );
    final SubLObject excess_provided_count = ( NIL != restP ) ? ZERO_INTEGER : rest_count;
    if( missing_required_count.isPositive() )
    {
      Errors.warn( $str67$_S_called_with__S_missing_require, operator, missing_required_count );
    }
    if( excess_provided_count.isPositive() )
    {
      Errors.warn( $str68$_S_called_with__S_excess_argument, operator, excess_provided_count );
    }
    c_backend_write_function_name( operator, stream );
    streams_high.write_string( $str69$_, stream, UNPROVIDED, UNPROVIDED );
    SubLObject processed_args = ZERO_INTEGER;
    if( NIL != restP )
    {
      c_backend_write_call_arity( call_arity, stream );
      processed_args = Numbers.add( processed_args, ONE_INTEGER );
    }
    SubLObject list_var = NIL;
    SubLObject arg = NIL;
    SubLObject i = NIL;
    list_var = args;
    arg = list_var.first();
    for( i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), arg = list_var.first(), i = Numbers.add( ONE_INTEGER, i ) )
    {
      if( !processed_args.isZero() )
      {
        c_backend_write_function_call_argument_separator( stream );
      }
      c_backend_write_form( arg, stream, number_utilities.f_1X( depth ) );
      processed_args = Numbers.add( processed_args, ONE_INTEGER );
    }
    if( !missing_required_count.isPositive() )
    {
      SubLObject j;
      for( j = NIL, j = ZERO_INTEGER; j.numL( defaulted_optional_count ); j = Numbers.add( j, ONE_INTEGER ) )
      {
        if( !processed_args.isZero() )
        {
          c_backend_write_function_call_argument_separator( stream );
        }
        c_backend_write_function_call_unprovided_argument( stream );
        processed_args = Numbers.add( processed_args, ONE_INTEGER );
      }
    }
    streams_high.write_string( $str70$_, stream, UNPROVIDED, UNPROVIDED );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 21381L)
  public static SubLObject c_backend_function_name(final SubLObject function)
  {
    final SubLObject predefined_name = c_name_translation.c_backend_function_name_lookup( function );
    if( NIL != predefined_name )
    {
      return predefined_name;
    }
    return c_backend_computed_function_name( function );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 21623L)
  public static SubLObject c_backend_computed_function_name_internal(final SubLObject function)
  {
    final SubLObject name_basis = c_backend_symbol_name_basis( function );
    return Sequences.cconcatenate( $str72$f_, format_nil.format_nil_a_no_copy( name_basis ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 21623L)
  public static SubLObject c_backend_computed_function_name(final SubLObject function)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return c_backend_computed_function_name_internal( function );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym71$C_BACKEND_COMPUTED_FUNCTION_NAME, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym71$C_BACKEND_COMPUTED_FUNCTION_NAME, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym71$C_BACKEND_COMPUTED_FUNCTION_NAME, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, function, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( c_backend_computed_function_name_internal( function ) ) );
      memoization_state.caching_state_put( caching_state, function, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 21822L)
  public static SubLObject c_backend_function_signature_info(final SubLObject function)
  {
    final SubLObject specified_arglist = c_backend_function_arglist( function );
    if( specified_arglist == $kw63$UNKNOWN )
    {
      return Values.values( $kw63$UNKNOWN, $kw63$UNKNOWN, $kw63$UNKNOWN );
    }
    if( specified_arglist == $kw73$UNSPECIFIED )
    {
      return file_translation.function_signature_info( function );
    }
    return file_translation.function_arglist_signature_info( specified_arglist );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 22216L)
  public static SubLObject c_backend_function_arglist(final SubLObject function)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject arglist = c_name_translation.c_backend_function_arglist_lookup( function );
    if( arglist != $kw73$UNSPECIFIED )
    {
      return arglist;
    }
    arglist = file_translation.current_ts_file_defined_function_arglist( function );
    if( arglist != $kw73$UNSPECIFIED )
    {
      return arglist;
    }
    arglist = xref_database.xref_method_formal_arglist( function );
    if( arglist != $kw73$UNSPECIFIED )
    {
      return arglist;
    }
    final SubLObject name = Symbols.symbol_name( function );
    if( NIL != string_utilities.starts_with( name, $str74$_CSETF_ ) )
    {
      return $list75;
    }
    if( NIL == file_translation.current_ts_file() && NIL != Symbols.fboundp( function ) )
    {
      arglist = $kw73$UNSPECIFIED;
      SubLObject ignore_errors_tag = NIL;
      try
      {
        thread.throwStack.push( $kw76$IGNORE_ERRORS_TARGET );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( Symbols.symbol_function( $sym77$IGNORE_ERRORS_HANDLER ), thread );
          try
          {
            arglist = subl_promotions.function_symbol_arglist( function );
          }
          catch( final Throwable catch_var )
          {
            Errors.handleThrowable( catch_var, NIL );
          }
        }
        finally
        {
          Errors.$error_handler$.rebind( _prev_bind_0, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw76$IGNORE_ERRORS_TARGET );
      }
      finally
      {
        thread.throwStack.pop();
      }
      if( arglist != $kw73$UNSPECIFIED )
      {
        return arglist;
      }
      Errors.warn( $str78$unable_to_introspect_on__S, function );
    }
    Errors.warn( $str79$Unexpected_function__S, function );
    return $kw63$UNKNOWN;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 23241L)
  public static SubLObject c_backend_write_function_call_argument_separator(final SubLObject stream)
  {
    return streams_high.write_string( $str80$__, stream, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 23354L)
  public static SubLObject c_backend_write_function_call_unprovided_argument(final SubLObject stream)
  {
    return streams_high.write_string( $str81$DUM, stream, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 23467L)
  public static SubLObject c_backend_write_call_arity(final SubLObject call_arity, final SubLObject stream)
  {
    assert NIL != subl_promotions.non_negative_integer_p( call_arity ) : call_arity;
    if( call_arity.numL( TWENTY_INTEGER ) )
    {
      return c_backend_write_form( ConsesLow.list( $sym45$_PC, call_arity ), stream, UNPROVIDED );
    }
    return c_backend_write_form( ConsesLow.list( $sym66$_LF, call_arity ), stream, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 27215L)
  public static SubLObject c_backend_writer(final SubLObject operator)
  {
    return list_utilities.alist_lookup_without_values( $c_backend_writers$.getGlobalValue(), operator, Symbols.symbol_function( EQ ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 27339L)
  public static SubLObject c_backend_write_via_writer(final SubLObject writer, final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subl_promotions.function_symbol_p( writer ) )
    {
      Errors.error( $str84$Time_to_implement_the_writer_for_, writer );
    }
    return Functions.funcall( writer, form, stream, depth );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 27539L)
  public static SubLObject c_backend_write_Xb_check_type(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    SubLObject operator = NIL;
    SubLObject v_object = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list85 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list85 );
    v_object = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list85 );
    pred = current.first();
    current = current.rest();
    if( NIL == current )
    {
      list_utilities.verify_operator( operator, $sym86$_B_CHECK_TYPE );
      c_backend_write_check_type( operator, v_object, pred, stream, depth );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( form, $list85 );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 27800L)
  public static SubLObject c_backend_write_check_type(final SubLObject operator, final SubLObject v_object, final SubLObject pred, final SubLObject stream, final SubLObject depth)
  {
    c_backend_write_function_name( operator, stream );
    streams_high.write_string( $str69$_, stream, UNPROVIDED, UNPROVIDED );
    c_backend_write_form( v_object, stream, number_utilities.f_1X( depth ) );
    c_backend_write_function_call_argument_separator( stream );
    c_backend_write_function_name( pred, stream );
    streams_high.write_string( $str70$_, stream, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 28155L)
  public static SubLObject c_backend_write_Xdp_check_type(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    SubLObject operator = NIL;
    SubLObject v_object = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list85 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list85 );
    v_object = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list85 );
    pred = current.first();
    current = current.rest();
    if( NIL == current )
    {
      list_utilities.verify_operator( operator, $sym87$_DP_CHECK_TYPE );
      c_backend_write_check_type( operator, v_object, pred, stream, depth );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( form, $list85 );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 28419L)
  public static SubLObject c_backend_write_Xdp_enforce_type(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    SubLObject operator = NIL;
    SubLObject v_object = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list85 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list85 );
    v_object = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list85 );
    pred = current.first();
    current = current.rest();
    if( NIL == current )
    {
      list_utilities.verify_operator( operator, $sym88$_DP_ENFORCE_TYPE );
      c_backend_write_check_type( operator, v_object, pred, stream, depth );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( form, $list85 );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 28689L)
  public static SubLObject c_backend_write_Xccatch(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject operator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list89 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list89 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject tag = NIL;
    SubLObject ans_var = NIL;
    SubLObject env_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list89 );
    tag = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list89 );
    ans_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list89 );
    env_var = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      list_utilities.verify_operator( operator, $sym90$_CCATCH );
      return c_backend_write_progn( ConsesLow.list( $sym91$PROGN, ConsesLow.list( $sym92$_SET_CATCH, tag, env_var ), ConsesLow.list( $sym93$PCOND, ConsesLow.list( ConsesLow.list( $sym94$_DTB, ConsesLow.list(
          $sym95$_THROWN_TO, env_var ) ), ConsesLow.listS( $sym96$CSETQ, ans_var, $list97 ) ), reader.bq_cons( $list98, ConsesLow.append( body, NIL ) ) ), ConsesLow.list( $sym99$_FINISH_CATCH, tag, env_var ) ), stream,
          depth );
    }
    cdestructuring_bind.cdestructuring_bind_error( form, $list89 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 29135L)
  public static SubLObject c_backend_write_Xcdo_symbols(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    SubLObject operator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list100 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list100 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject sym = NIL;
    SubLObject package_var = NIL;
    SubLObject iterator_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list100 );
    sym = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list100 );
    package_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list100 );
    iterator_var = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      list_utilities.verify_operator( operator, $sym101$_CDO_SYMBOLS );
      return c_backend_write_progn( ConsesLow.listS( $sym91$PROGN, ConsesLow.list( $sym102$_CDO_SYMBOLS_SETUP, package_var, iterator_var ), ConsesLow.list( $sym103$_CDO_SYMBOLS_LOOP, sym, iterator_var ), ConsesLow
          .append( body, ConsesLow.list( ConsesLow.list( $sym104$_CDO_SYMBOLS_END, package_var, iterator_var ) ) ) ), stream, depth );
    }
    cdestructuring_bind.cdestructuring_bind_error( form, $list100 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 29572L)
  public static SubLObject c_backend_write_clet_bind(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject operator = NIL;
    SubLObject v_bindings = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list105 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list105 );
    v_bindings = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    list_utilities.verify_operator( operator, $sym106$CLET_BIND );
    SubLObject binders = NIL;
    SubLObject rebinders = NIL;
    SubLObject cdolist_list_var = v_bindings;
    SubLObject binding = NIL;
    binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current_$16;
      final SubLObject datum_$15 = current_$16 = binding;
      SubLObject variable = NIL;
      SubLObject initialization = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current_$16, datum_$15, $list107 );
      variable = current_$16.first();
      current_$16 = current_$16.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current_$16, datum_$15, $list107 );
      initialization = current_$16.first();
      current_$16 = current_$16.rest();
      if( NIL == current_$16 )
      {
        binders = ConsesLow.cons( ConsesLow.list( $sym108$_BIND, variable, initialization ), binders );
        rebinders = ConsesLow.cons( ConsesLow.list( $sym109$_REBIND, variable ), rebinders );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum_$15, $list107 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      binding = cdolist_list_var.first();
    }
    return c_backend_write_progn( reader.bq_cons( $sym91$PROGN, ConsesLow.append( Sequences.nreverse( binders ), body, rebinders, NIL ) ), stream, depth );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 30137L)
  public static SubLObject c_backend_write_clet_local(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    SubLObject operator = NIL;
    SubLObject v_bindings = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list105 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list105 );
    v_bindings = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    list_utilities.verify_operator( operator, $sym110$CLET_LOCAL );
    SubLObject locals = NIL;
    SubLObject cdolist_list_var = v_bindings;
    SubLObject binding = NIL;
    binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current_$18;
      final SubLObject datum_$17 = current_$18 = binding;
      SubLObject variable = NIL;
      SubLObject initialization = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current_$18, datum_$17, $list107 );
      variable = current_$18.first();
      current_$18 = current_$18.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current_$18, datum_$17, $list107 );
      initialization = current_$18.first();
      current_$18 = current_$18.rest();
      if( NIL == current_$18 )
      {
        locals = ConsesLow.cons( ConsesLow.list( $sym111$_LOCAL, variable, initialization ), locals );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum_$17, $list107 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      binding = cdolist_list_var.first();
    }
    return c_backend_write_form( reader.bq_cons( $sym91$PROGN, ConsesLow.append( Sequences.nreverse( locals ), body, NIL ) ), stream, depth );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 30602L)
  public static SubLObject c_backend_write_code_comment(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    SubLObject operator = NIL;
    SubLObject comment_string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list112 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list112 );
    comment_string = current.first();
    current = current.rest();
    if( NIL == current )
    {
      list_utilities.verify_operator( operator, $sym113$CODE_COMMENT );
      streams_high.write_string( $str114$___, stream, UNPROVIDED, UNPROVIDED );
      streams_high.write_string( comment_string, stream, UNPROVIDED, UNPROVIDED );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( form, $list112 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 30935L)
  public static SubLObject c_backend_write_Xcprogv(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    SubLObject operator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list115 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list115 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject special_vars = NIL;
    SubLObject v_bindings = NIL;
    SubLObject internal_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list115 );
    special_vars = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list115 );
    v_bindings = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list115 );
    internal_var = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      list_utilities.verify_operator( operator, $sym116$_CPROGV );
      return c_backend_write_clet_local( ConsesLow.listS( $sym110$CLET_LOCAL, ConsesLow.list( ConsesLow.list( internal_var, special_vars ) ), ConsesLow.list( $sym117$_BIND_SPECIAL_VARS, internal_var, v_bindings ),
          ConsesLow.append( body, ConsesLow.list( ConsesLow.list( $sym118$_REBIND_SPECIAL_VARS, internal_var ) ) ) ), stream, depth );
    }
    cdestructuring_bind.cdestructuring_bind_error( form, $list115 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 31348L)
  public static SubLObject c_backend_write_csetq(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    SubLObject operator = NIL;
    SubLObject variable = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list119 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list119 );
    variable = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list119 );
    value = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( form, $list119 );
      return NIL;
    }
    list_utilities.verify_operator( operator, $sym96$CSETQ );
    final SubLObject pcase_var = c_backend_variable_binding_type( variable );
    if( pcase_var.eql( $kw50$LOCAL ) )
    {
      return c_backend_write_csetq_local( ConsesLow.list( $sym120$CSETQ_LOCAL, variable, value ), stream, depth );
    }
    if( pcase_var.eql( $kw47$DYNAMIC ) )
    {
      return c_backend_write_csetq_dynamic( ConsesLow.list( $sym121$CSETQ_DYNAMIC, variable, value ), stream, depth );
    }
    if( pcase_var.eql( $kw48$LEXICAL ) )
    {
      return c_backend_write_csetq_lexical( ConsesLow.list( $sym122$CSETQ_LEXICAL, variable, value ), stream, depth );
    }
    if( pcase_var.eql( $kw49$CONSTANT ) )
    {
      return Errors.error( $str123$The_constant_variable__S_cannot_b, variable );
    }
    return Errors.error( $str124$Unexpected_variable__S, variable );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 32069L)
  public static SubLObject c_backend_write_csetq_dynamic(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    SubLObject operator = NIL;
    SubLObject variable = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list119 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list119 );
    variable = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list119 );
    value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      list_utilities.verify_operator( operator, $sym121$CSETQ_DYNAMIC );
      c_backend_write_form( ConsesLow.list( $sym125$_SET_DYN, variable, value ), stream, depth );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( form, $list119 );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 32335L)
  public static SubLObject c_backend_write_csetq_lexical(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    SubLObject operator = NIL;
    SubLObject variable = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list119 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list119 );
    variable = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list119 );
    value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      list_utilities.verify_operator( operator, $sym122$CSETQ_LEXICAL );
      c_backend_write_form( ConsesLow.list( $sym126$_SET_LEX, variable, value ), stream, depth );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( form, $list119 );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 32601L)
  public static SubLObject c_backend_write_csetq_local(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    SubLObject operator = NIL;
    SubLObject variable = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list119 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list119 );
    variable = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list119 );
    value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      list_utilities.verify_operator( operator, $sym120$CSETQ_LOCAL );
      c_backend_write_form( variable, stream, number_utilities.f_1X( depth ) );
      c_backend_write_assignment_operator( stream );
      c_backend_write_form( value, stream, number_utilities.f_1X( depth ) );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( form, $list119 );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 32946L)
  public static SubLObject c_backend_write_assignment_operator(final SubLObject stream)
  {
    return streams_high.write_string( $str127$___, stream, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 33047L)
  public static SubLObject c_backend_write_Xcunwind_protect(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    SubLObject operator = NIL;
    SubLObject env_var = NIL;
    SubLObject protected_form = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list128 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list128 );
    env_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list128 );
    protected_form = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    list_utilities.verify_operator( operator, $sym129$_CUNWIND_PROTECT );
    return c_backend_write_progn( ConsesLow.listS( $sym91$PROGN, ConsesLow.list( $sym130$_SET_UNWIND, env_var ), protected_form, ConsesLow.list( $sym131$_START_UNWIND, env_var ), ConsesLow.append( body, ConsesLow.list(
        ConsesLow.list( $sym132$_FINISH_UNWIND, env_var ) ) ) ), stream, depth );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 33451L)
  public static SubLObject c_backend_write_cvs_id(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    if( $kw24$HIGH != system_translation.current_system_translation_security_level() )
    {
      SubLObject operator = NIL;
      SubLObject id_string = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( form, form, $list133 );
      operator = form.first();
      SubLObject current = form.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, form, $list133 );
      id_string = current.first();
      current = current.rest();
      if( NIL == current )
      {
        list_utilities.verify_operator( operator, $sym134$CVS_ID );
        streams_high.write_string( $str135$CVS_ID_, stream, UNPROVIDED, UNPROVIDED );
        c_backend_write_form( string_utilities.substring( id_string, ONE_INTEGER, number_utilities.f_1_( Sequences.length( id_string ) ) ), stream, number_utilities.f_1X( depth ) );
        streams_high.write_string( $str70$_, stream, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( form, $list133 );
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 33861L)
  public static SubLObject c_backend_write_defconstant(final SubLObject form, final SubLObject stream, SubLObject depth)
  {
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    final SubLObject operator = form.first();
    list_utilities.verify_operator( operator, $sym136$DEFCONSTANT );
    return c_backend_write_global( form, stream, depth );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 34085L)
  public static SubLObject c_backend_write_global(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject operator = NIL;
    SubLObject variable = NIL;
    SubLObject initialization = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list137 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list137 );
    variable = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list137 );
    initialization = current.first();
    current = current.rest();
    final SubLObject documentation = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, form, $list137 );
    current = current.rest();
    if( NIL == current )
    {
      if( NIL != documentation )
      {
        c_backend_write_definer_comment( documentation, stream );
      }
      if( NIL != $c_backend_write_global_definition_as_comment$.getDynamicValue( thread ) )
      {
        streams_high.write_string( $str114$___, stream, UNPROVIDED, UNPROVIDED );
      }
      if( NIL != file_translation.current_ts_file_defined_private_global_p( variable ) )
      {
        streams_high.write_string( $str36$static_, stream, UNPROVIDED, UNPROVIDED );
      }
      c_backend_write_object_data_type( stream );
      streams_high.write_string( $str34$_, stream, UNPROVIDED, UNPROVIDED );
      c_backend_write_form( variable, stream, depth );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( form, $list137 );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 34824L)
  public static SubLObject c_backend_volatilize_localsP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $c_backend_volatilize_localsP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 34913L)
  public static SubLObject c_backend_write_define(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject operator = NIL;
    SubLObject name = NIL;
    SubLObject arglist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list138 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list138 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list138 );
    arglist = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    list_utilities.verify_operator( operator, $sym139$DEFINE );
    if( NIL != file_translation.current_ts_file() && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !depth.numE( ZERO_INTEGER ) )
    {
      Errors.error( $str140$_S_was_not_a_top_level_define, operator );
    }
    final SubLObject restart_tag = $sym141$SKIP_FUNCTION;
    SubLObject dummy = NIL;
    final SubLObject _prev_bind_0 = Errors.$restarts$.currentBinding( thread );
    try
    {
      Errors.$restarts$.bind( ConsesLow.cons( ConsesLow.list( restart_tag, $str142$Skip_function__S, name ), Errors.$restarts$.getDynamicValue( thread ) ), thread );
      try
      {
        thread.throwStack.push( restart_tag );
        final SubLObject documentation = java_backend.translator_extract_function_documentation( body );
        final SubLObject body_statement = c_backend_compute_function_body_statement( name, arglist, body );
        if( NIL != documentation )
        {
          c_backend_write_definer_comment( documentation, stream );
        }
        c_backend_write_method_source_definition_comment( name, stream, depth );
        if( NIL != file_translation.current_ts_file_defined_private_method_p( name ) )
        {
          streams_high.write_string( $str36$static_, stream, UNPROVIDED, UNPROVIDED );
        }
        c_backend_write_function_declaration( stream, name, arglist, depth );
        streams_high.write_string( $str34$_, stream, UNPROVIDED, UNPROVIDED );
        final SubLObject _prev_bind_0_$19 = $c_backend_volatilize_localsP$.currentBinding( thread );
        try
        {
          $c_backend_volatilize_localsP$.bind( c_backend_volatilize_defineP( body_statement ), thread );
          c_backend_write_form( body_statement, stream, depth );
        }
        finally
        {
          $c_backend_volatilize_localsP$.rebind( _prev_bind_0_$19, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        dummy = Errors.handleThrowable( ccatch_env_var, restart_tag );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    finally
    {
      Errors.$restarts$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 35899L)
  public static SubLObject c_backend_compute_function_body_statement(final SubLObject name, final SubLObject arglist, SubLObject body)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = body;
    SubLObject documentation = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list143 );
    documentation = current.first();
    final SubLObject real_body;
    current = ( real_body = current.rest() );
    if( documentation.isString() )
    {
      body = real_body;
    }
    if( NIL != c_backend_method_returns_within_binding_constructP( name ) )
    {
      Errors.warn( $str144$Method__S_returns_within_a_bindin, name );
      body = c_backend_transform_returns_to_throws( body );
    }
    thread.resetMultipleValues();
    final SubLObject optional_argument_initializations = c_backend_optional_argument_initializations( arglist );
    final SubLObject provided_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    SubLObject final_body = ConsesLow.append( optional_argument_initializations, body, NIL );
    if( NIL != provided_bindings )
    {
      final_body = ConsesLow.list( ConsesLow.listS( $sym110$CLET_LOCAL, provided_bindings, ConsesLow.append( final_body, NIL ) ) );
    }
    final_body = reader.bq_cons( $list145, ConsesLow.append( final_body, NIL ) );
    final SubLObject optimized_body = common_optimization.translator_optimize_body( final_body );
    return reader.bq_cons( $sym91$PROGN, ConsesLow.append( optimized_body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 36810L)
  public static SubLObject c_backend_write_definer_comment(final SubLObject documentation, final SubLObject stream)
  {
    if( $kw24$HIGH != system_translation.current_system_translation_security_level() )
    {
      streams_high.write_string( $str146$___, stream, UNPROVIDED, UNPROVIDED );
      streams_high.write_string( documentation, stream, UNPROVIDED, UNPROVIDED );
      streams_high.write_string( $str27$___, stream, UNPROVIDED, UNPROVIDED );
      streams_high.terpri( stream );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 37130L)
  public static SubLObject c_backend_write_method_source_definition_comment(final SubLObject method, final SubLObject stream, final SubLObject depth)
  {
    if( NIL == system_translation.current_system_translation_secureP() )
    {
      final SubLObject source_comment = xref_database.xref_method_source_definition_comment( method );
      if( NIL != source_comment )
      {
        c_backend_write_form( source_comment, stream, depth );
        streams_high.terpri( stream );
        c_backend_indent( stream, depth );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 37493L)
  public static SubLObject c_backend_write_global_source_definition_comment(final SubLObject global, final SubLObject stream, final SubLObject depth)
  {
    if( NIL == system_translation.current_system_translation_secureP() )
    {
      final SubLObject source_comment = xref_database.xref_global_source_definition_comment( global );
      if( NIL != source_comment )
      {
        c_backend_write_form( source_comment, stream, depth );
        streams_high.terpri( stream );
        c_backend_indent( stream, depth );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 37856L)
  public static SubLObject c_backend_write_function_declaration(final SubLObject stream, final SubLObject function, SubLObject arglist, SubLObject depth)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = $kw37$UNPROVIDED;
    }
    if( depth == UNPROVIDED )
    {
      depth = ZERO_INTEGER;
    }
    if( arglist == $kw37$UNPROVIDED )
    {
      arglist = c_backend_function_arglist( function );
    }
    if( arglist == $kw63$UNKNOWN )
    {
      arglist = NIL;
    }
    c_backend_write_object_data_type( stream );
    streams_high.write_string( $str34$_, stream, UNPROVIDED, UNPROVIDED );
    c_backend_write_function_name( function, stream );
    c_backend_write_function_arglist( arglist, stream, depth );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 38330L)
  public static SubLObject c_backend_write_function_name(final SubLObject function, final SubLObject stream)
  {
    if( NIL != list_utilities.member_eqP( system_translation.current_system_translation_security_level(), $list52 ) )
    {
      final SubLObject secure_method_id = c_backend_secure_method_id( function );
      if( NIL != secure_method_id )
      {
        return PrintLow.format( stream, $str147$_f_S_, secure_method_id );
      }
    }
    return streams_high.write_string( c_backend_function_name( function ), stream, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 38691L)
  public static SubLObject c_backend_secure_method_id(final SubLObject function)
  {
    if( control_vars.$cyc_package$.getGlobalValue().eql( Symbols.symbol_package( function ) ) && NIL == c_name_translation.c_backend_predefined_function_p( function ) )
    {
      final SubLObject sys_tran = system_translation.current_system_translation();
      if( NIL != sys_tran )
      {
        return system_translation.sys_tran_secure_method_id( sys_tran, function );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 38987L)
  public static SubLObject c_backend_optional_argument_initializations(final SubLObject arglist)
  {
    final SubLObject optional_arguments = conses_high.member( $sym148$_OPTIONAL, arglist, Symbols.symbol_function( EQ ), UNPROVIDED ).rest();
    SubLObject provided_bindings = NIL;
    SubLObject optional_argument_initializations = NIL;
    SubLObject restP = NIL;
    if( NIL == restP )
    {
      SubLObject csome_list_var = optional_arguments;
      SubLObject arg = NIL;
      arg = csome_list_var.first();
      while ( NIL == restP && NIL != csome_list_var)
      {
        if( arg == $sym149$_REST )
        {
          restP = T;
        }
        else if( arg.isCons() )
        {
          SubLObject current;
          final SubLObject datum = current = arg;
          SubLObject variable = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list150 );
          variable = current.first();
          current = current.rest();
          final SubLObject initialization = current.isCons() ? current.first() : NIL;
          cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list150 );
          current = current.rest();
          final SubLObject provided = current.isCons() ? current.first() : NIL;
          cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list150 );
          current = current.rest();
          if( NIL == current )
          {
            if( NIL != provided )
            {
              provided_bindings = ConsesLow.cons( ConsesLow.list( provided, ConsesLow.list( $sym151$_NOTE_SUPPLIED, variable ) ), provided_bindings );
            }
            optional_argument_initializations = ConsesLow.cons( ConsesLow.list( $sym152$_INIT_OPT_ARG, variable, initialization ), optional_argument_initializations );
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list150 );
          }
        }
        else
        {
          optional_argument_initializations = ConsesLow.cons( ConsesLow.listS( $sym152$_INIT_OPT_ARG, arg, $list153 ), optional_argument_initializations );
        }
        csome_list_var = csome_list_var.rest();
        arg = csome_list_var.first();
      }
    }
    return Values.values( Sequences.nreverse( optional_argument_initializations ), Sequences.nreverse( provided_bindings ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 39754L)
  public static SubLObject c_backend_write_object_data_type(final SubLObject stream)
  {
    return streams_high.write_string( $str154$Dp, stream, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 39849L)
  public static SubLObject c_backend_write_function_arglist(final SubLObject arglist, final SubLObject stream, final SubLObject depth)
  {
    if( NIL == arglist )
    {
      streams_high.write_string( $str155$_void_, stream, UNPROVIDED, UNPROVIDED );
      return NIL;
    }
    streams_high.write_string( $str69$_, stream, UNPROVIDED, UNPROVIDED );
    SubLObject processed_args = ZERO_INTEGER;
    SubLObject list_var = NIL;
    SubLObject arg = NIL;
    SubLObject argnum = NIL;
    list_var = arglist;
    arg = list_var.first();
    for( argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), arg = list_var.first(), argnum = Numbers.add( ONE_INTEGER, argnum ) )
    {
      if( arg != $sym148$_OPTIONAL )
      {
        if( !processed_args.isZero() )
        {
          c_backend_write_function_argument_separator( stream );
        }
        if( NIL == c_backend_volatilize_localsP() )
        {
          c_backend_write_object_data_type( stream );
          streams_high.write_string( $str34$_, stream, UNPROVIDED, UNPROVIDED );
        }
        c_backend_write_function_arglist_arg( arg, stream );
        processed_args = Numbers.add( processed_args, ONE_INTEGER );
      }
    }
    streams_high.write_string( $str70$_, stream, UNPROVIDED, UNPROVIDED );
    if( NIL != c_backend_volatilize_localsP() )
    {
      SubLObject cdolist_list_var = arglist;
      SubLObject arg2 = NIL;
      arg2 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( arg2 != $sym148$_OPTIONAL )
        {
          final SubLObject variable = translator_arglist_arg_variable( arg2 );
          c_backend_write_statement( ConsesLow.list( $sym111$_LOCAL, variable ), stream, depth );
        }
        cdolist_list_var = cdolist_list_var.rest();
        arg2 = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 40683L)
  public static SubLObject c_backend_write_function_argument_separator(final SubLObject stream)
  {
    return streams_high.write_string( $str80$__, stream, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 40791L)
  public static SubLObject c_backend_write_function_arglist_arg(final SubLObject arg, final SubLObject stream)
  {
    return c_backend_write_form( translator_arglist_arg_variable( arg ), stream, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 40937L)
  public static SubLObject translator_arglist_arg_variable(final SubLObject arg)
  {
    return arg.isCons() ? arg.first() : arg;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 41082L)
  public static SubLObject c_backend_volatilize_defineP(final SubLObject form)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != list_utilities.simple_tree_findP( $sym129$_CUNWIND_PROTECT, form ) || NIL != list_utilities.simple_tree_findP( $sym90$_CCATCH, form ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 41323L)
  public static SubLObject c_backend_method_returns_within_binding_constructP(final SubLObject name)
  {
    final SubLObject ts_file = file_translation.current_ts_file();
    if( NIL != ts_file )
    {
      return file_translation.ts_file_method_returns_within_binding_constructP( ts_file, name );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 41535L)
  public static SubLObject c_backend_transform_returns_to_throws(SubLObject body)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    body = transform_list_utilities.transform( body, $sym156$TRANSLATOR_RET_FORM_P, $sym157$TRANSLATOR_RET_TO_THROW, UNPROVIDED );
    final SubLObject translated_tag = form_translation.translate_form( $list158 );
    final SubLObject v_answer = $sym159$ANSWER;
    final SubLObject exit_env = $sym160$EXIT_ENV;
    return ConsesLow.list( ConsesLow.list( $sym110$CLET_LOCAL, ConsesLow.list( reader.bq_cons( v_answer, $list153 ) ), ConsesLow.listS( $sym90$_CCATCH, ConsesLow.list( translated_tag, v_answer, exit_env ), ConsesLow
        .append( body, NIL ) ), ConsesLow.list( $sym161$RET, v_answer ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 41996L)
  public static SubLObject translator_ret_form_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != list_utilities.form_with_operator_p( v_object, $sym161$RET ) && NIL != list_utilities.lengthE( v_object, TWO_INTEGER, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 42128L)
  public static SubLObject translator_ret_to_throw(final SubLObject ret_form)
  {
    SubLObject operator = NIL;
    SubLObject expression = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( ret_form, ret_form, $list162 );
    operator = ret_form.first();
    SubLObject current = ret_form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, ret_form, $list162 );
    expression = current.first();
    current = current.rest();
    if( NIL == current )
    {
      list_utilities.verify_operator( operator, $sym161$RET );
      final SubLObject translated_tag = form_translation.translate_form( $list158 );
      return ConsesLow.list( $sym163$THROW, translated_tag, expression );
    }
    cdestructuring_bind.cdestructuring_bind_error( ret_form, $list162 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 42476L)
  public static SubLObject c_backend_write_define_macroexpander(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    SubLObject operator = NIL;
    SubLObject name = NIL;
    SubLObject arglist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list138 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list138 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list138 );
    arglist = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    list_utilities.verify_operator( operator, $sym164$DEFINE_MACROEXPANDER );
    return c_backend_write_form( ConsesLow.listS( $sym139$DEFINE, name, arglist, ConsesLow.append( body, NIL ) ), stream, depth );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 42777L)
  public static SubLObject c_backend_write_deflexical(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    final SubLObject operator = form.first();
    list_utilities.verify_operator( operator, $sym165$DEFLEXICAL );
    return c_backend_write_global( form, stream, depth );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 42988L)
  public static SubLObject c_backend_write_defparameter(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    final SubLObject operator = form.first();
    list_utilities.verify_operator( operator, $sym166$DEFPARAMETER );
    return c_backend_write_global( form, stream, depth );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 43205L)
  public static SubLObject c_backend_write_Xdefstruct_class(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    SubLObject operator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list167 );
    operator = form.first();
    final SubLObject analysis;
    final SubLObject current = analysis = form.rest();
    list_utilities.verify_operator( operator, $sym168$_DEFSTRUCT_CLASS );
    final SubLObject current_$21;
    final SubLObject datum_$20 = current_$21 = analysis;
    final SubLObject name_tail = cdestructuring_bind.property_list_member( $kw169$NAME, current_$21 );
    final SubLObject name = ( NIL != name_tail ) ? conses_high.cadr( name_tail ) : NIL;
    PrintLow.format( stream, $str170$___defstruct__A___, name );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 43543L)
  public static SubLObject c_backend_write_defstruct_construct(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    SubLObject operator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list62 );
    operator = form.first();
    final SubLObject args;
    final SubLObject current = args = form.rest();
    list_utilities.verify_operator( operator, $sym171$_DEFSTRUCT_CONSTRUCT );
    final SubLObject expanded_form = form_translation.translate_form( Eval.macroexpand_1( form, UNPROVIDED ) );
    return c_backend_write_form( expanded_form, stream, depth );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 43901L)
  public static SubLObject c_backend_write_defstruct_get_slot(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    SubLObject operator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list62 );
    operator = form.first();
    final SubLObject args;
    final SubLObject current = args = form.rest();
    list_utilities.verify_operator( operator, $sym172$_DEFSTRUCT_GET_SLOT );
    final SubLObject expanded_form = form_translation.translate_form( Eval.macroexpand_1( form, UNPROVIDED ) );
    return c_backend_write_form( expanded_form, stream, depth );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 44256L)
  public static SubLObject c_backend_write_defstruct_object_p(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    SubLObject operator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list62 );
    operator = form.first();
    final SubLObject args;
    final SubLObject current = args = form.rest();
    list_utilities.verify_operator( operator, $sym173$_DEFSTRUCT_OBJECT_P );
    final SubLObject expanded_form = form_translation.translate_form( Eval.macroexpand_1( form, UNPROVIDED ) );
    return c_backend_write_form( expanded_form, stream, depth );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 44611L)
  public static SubLObject c_backend_write_defstruct_set_slot(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    SubLObject operator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list62 );
    operator = form.first();
    final SubLObject args;
    final SubLObject current = args = form.rest();
    list_utilities.verify_operator( operator, $sym174$_DEFSTRUCT_SET_SLOT );
    final SubLObject expanded_form = form_translation.translate_form( Eval.macroexpand_1( form, UNPROVIDED ) );
    return c_backend_write_form( expanded_form, stream, depth );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 44966L)
  public static SubLObject c_backend_write_defvar(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    final SubLObject operator = form.first();
    list_utilities.verify_operator( operator, $sym175$DEFVAR );
    return c_backend_write_global( form, stream, depth );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 45165L)
  public static SubLObject c_backend_write_fif(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    SubLObject operator = NIL;
    SubLObject condition = NIL;
    SubLObject true_value = NIL;
    SubLObject false_value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list176 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list176 );
    condition = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list176 );
    true_value = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list176 );
    false_value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      list_utilities.verify_operator( operator, $sym177$FIF );
      streams_high.write_string( $str69$_, stream, UNPROVIDED, UNPROVIDED );
      c_backend_write_form( condition, stream, number_utilities.f_1X( depth ) );
      streams_high.write_string( $str178$___, stream, UNPROVIDED, UNPROVIDED );
      c_backend_write_form( true_value, stream, number_utilities.f_1X( depth ) );
      streams_high.write_string( $str179$___, stream, UNPROVIDED, UNPROVIDED );
      c_backend_write_form( false_value, stream, number_utilities.f_1X( depth ) );
      streams_high.write_string( $str70$_, stream, UNPROVIDED, UNPROVIDED );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( form, $list176 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 45644L)
  public static SubLObject c_backend_write_pcond(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    SubLObject operator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list180 );
    operator = form.first();
    final SubLObject pcond_clauses;
    final SubLObject current = pcond_clauses = form.rest();
    list_utilities.verify_operator( operator, $sym93$PCOND );
    if( NIL == pcond_clauses )
    {
      return c_backend_write_progn( $list181, stream, depth );
    }
    SubLObject current_$23;
    final SubLObject datum_$22 = current_$23 = pcond_clauses;
    SubLObject first_clause = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current_$23, datum_$22, $list182 );
    first_clause = current_$23.first();
    final SubLObject rest_clauses;
    current_$23 = ( rest_clauses = current_$23.rest() );
    SubLObject current_$24;
    final SubLObject datum_$23 = current_$24 = first_clause;
    SubLObject test = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current_$24, datum_$23, $list183 );
    test = current_$24.first();
    final SubLObject actions;
    current_$24 = ( actions = current_$24.rest() );
    streams_high.write_string( $str184$if__, stream, UNPROVIDED, UNPROVIDED );
    c_backend_write_form( test, stream, number_utilities.f_1X( depth ) );
    streams_high.write_string( $str185$__, stream, UNPROVIDED, UNPROVIDED );
    c_backend_write_progn( reader.bq_cons( $sym91$PROGN, ConsesLow.append( actions, NIL ) ), stream, depth );
    SubLObject cdolist_list_var = rest_clauses;
    SubLObject rest_clause = NIL;
    rest_clause = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current_$25;
      final SubLObject datum_$24 = current_$25 = rest_clause;
      SubLObject test_$28 = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current_$25, datum_$24, $list183 );
      test_$28 = current_$25.first();
      final SubLObject actions_$29;
      current_$25 = ( actions_$29 = current_$25.rest() );
      if( test_$28.equal( $list98 ) )
      {
        if( NIL != actions_$29 )
        {
          streams_high.write_string( $str186$_else_, stream, UNPROVIDED, UNPROVIDED );
          c_backend_write_progn( reader.bq_cons( $sym91$PROGN, ConsesLow.append( actions_$29, NIL ) ), stream, depth );
        }
      }
      else
      {
        streams_high.write_string( $str187$_else_if__, stream, UNPROVIDED, UNPROVIDED );
        c_backend_write_form( test_$28, stream, number_utilities.f_1X( depth ) );
        streams_high.write_string( $str185$__, stream, UNPROVIDED, UNPROVIDED );
        c_backend_write_progn( reader.bq_cons( $sym91$PROGN, ConsesLow.append( actions_$29, NIL ) ), stream, depth );
      }
      cdolist_list_var = cdolist_list_var.rest();
      rest_clause = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 46674L)
  public static SubLObject c_backend_write_progn(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    SubLObject operator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list188 );
    operator = form.first();
    final SubLObject body;
    final SubLObject current = body = form.rest();
    list_utilities.verify_operator( operator, $sym91$PROGN );
    streams_high.write_string( $str189$_, stream, UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var = body;
    SubLObject statement = NIL;
    statement = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      c_backend_write_statement( statement, stream, number_utilities.f_1X( depth ) );
      cdolist_list_var = cdolist_list_var.rest();
      statement = cdolist_list_var.first();
    }
    streams_high.terpri( stream );
    c_backend_indent( stream, depth );
    streams_high.write_string( $str190$_, stream, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 47054L)
  public static SubLObject c_backend_write_Xproclaim(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 47278L)
  public static SubLObject c_backend_write_ret(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    SubLObject operator = NIL;
    SubLObject result = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list191 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list191 );
    result = current.first();
    current = current.rest();
    if( NIL == current )
    {
      list_utilities.verify_operator( operator, $sym161$RET );
      streams_high.write_string( $str192$RETURN_, stream, UNPROVIDED, UNPROVIDED );
      c_backend_write_form( result, stream, number_utilities.f_1X( depth ) );
      streams_high.write_string( $str70$_, stream, UNPROVIDED, UNPROVIDED );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( form, $list191 );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 47555L)
  public static SubLObject c_backend_write_while(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    SubLObject operator = NIL;
    SubLObject test = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list193 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list193 );
    test = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    list_utilities.verify_operator( operator, $sym194$WHILE );
    streams_high.write_string( $str195$while__, stream, UNPROVIDED, UNPROVIDED );
    c_backend_write_form( test, stream, number_utilities.f_1X( depth ) );
    streams_high.write_string( $str185$__, stream, UNPROVIDED, UNPROVIDED );
    c_backend_write_form( reader.bq_cons( $sym91$PROGN, ConsesLow.append( body, NIL ) ), stream, depth );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 47904L)
  public static SubLObject c_backend_write_Xand(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    SubLObject operator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list196 );
    operator = form.first();
    final SubLObject expressions;
    final SubLObject current = expressions = form.rest();
    list_utilities.verify_operator( operator, $sym197$_AND );
    if( NIL == expressions )
    {
      c_backend_write_Xnc( $list98, stream, number_utilities.f_1X( depth ) );
    }
    else if( NIL != list_utilities.singletonP( expressions ) )
    {
      c_backend_write_form( expressions.first(), stream, number_utilities.f_1X( depth ) );
    }
    else
    {
      streams_high.write_string( $str69$_, stream, UNPROVIDED, UNPROVIDED );
      c_backend_write_form( expressions.first(), stream, number_utilities.f_1X( depth ) );
      SubLObject cdolist_list_var = expressions.rest();
      SubLObject expression = NIL;
      expression = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        streams_high.terpri( stream );
        c_backend_indent( stream, number_utilities.f_1X( depth ) );
        streams_high.write_string( $str198$____, stream, UNPROVIDED, UNPROVIDED );
        c_backend_write_form( expression, stream, number_utilities.f_1X( depth ) );
        cdolist_list_var = cdolist_list_var.rest();
        expression = cdolist_list_var.first();
      }
      streams_high.write_string( $str70$_, stream, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 48612L)
  public static SubLObject c_backend_write_Xcdohash(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    SubLObject operator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list199 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list199 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject key = NIL;
    SubLObject val = NIL;
    SubLObject table_var = NIL;
    SubLObject iterator_var = NIL;
    SubLObject entry_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list199 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list199 );
    val = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list199 );
    table_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list199 );
    iterator_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list199 );
    entry_var = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      list_utilities.verify_operator( operator, $sym200$_CDOHASH );
      return c_backend_write_form( ConsesLow.list( $sym110$CLET_LOCAL, ConsesLow.list( reader.bq_cons( iterator_var, $list153 ) ), ConsesLow.listS( $sym201$_FOR, ConsesLow.list( ConsesLow.list( ConsesLow.list(
          $sym120$CSETQ_LOCAL, iterator_var, ConsesLow.listS( $sym202$_NEXT_HASH_INDEX, table_var, $list153 ) ) ), ConsesLow.list( $sym94$_DTB, iterator_var ), ConsesLow.list( ConsesLow.list( $sym120$CSETQ_LOCAL,
              iterator_var, ConsesLow.list( $sym202$_NEXT_HASH_INDEX, table_var, iterator_var ) ) ) ), ConsesLow.list( $sym96$CSETQ, key, ConsesLow.list( $sym203$_HASH_INDEX_KEY, table_var, iterator_var ) ), ConsesLow
                  .list( $sym96$CSETQ, val, ConsesLow.list( $sym204$_HASH_INDEX_OBJ, table_var, iterator_var ) ), ConsesLow.append( body, NIL ) ) ), stream, depth );
    }
    cdestructuring_bind.cdestructuring_bind_error( form, $list199 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 49293L)
  public static SubLObject c_backend_write_Xenter(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    SubLObject operator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list205 );
    operator = form.first();
    final SubLObject current = form.rest();
    if( NIL == current )
    {
      list_utilities.verify_operator( operator, $sym206$_ENTER );
      streams_high.write_string( $str207$ENTER__, stream, UNPROVIDED, UNPROVIDED );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( form, $list205 );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 49507L)
  public static SubLObject c_backend_write_Xfor(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    SubLObject operator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list208 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list208 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject initializations = NIL;
    SubLObject test = NIL;
    SubLObject updates = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list208 );
    initializations = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list208 );
    test = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list208 );
    updates = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      list_utilities.verify_operator( operator, $sym201$_FOR );
      streams_high.write_string( $str209$for__, stream, UNPROVIDED, UNPROVIDED );
      if( NIL != initializations )
      {
        SubLObject current_$31;
        final SubLObject datum_$30 = current_$31 = initializations;
        SubLObject first_initialization = NIL;
        SubLObject rest_initialiations = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current_$31, datum_$30, $list210 );
        first_initialization = current_$31.first();
        current_$31 = ( rest_initialiations = current_$31.rest() );
        c_backend_write_form( first_initialization, stream, number_utilities.f_1X( depth ) );
        SubLObject cdolist_list_var = rest_initialiations;
        SubLObject rest_initialiation = NIL;
        rest_initialiation = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          c_backend_write_function_call_argument_separator( stream );
          c_backend_write_form( rest_initialiation, stream, number_utilities.f_1X( depth ) );
          cdolist_list_var = cdolist_list_var.rest();
          rest_initialiation = cdolist_list_var.first();
        }
      }
      streams_high.write_string( $str211$__, stream, UNPROVIDED, UNPROVIDED );
      c_backend_write_form( test, stream, number_utilities.f_1X( depth ) );
      streams_high.write_string( $str211$__, stream, UNPROVIDED, UNPROVIDED );
      if( NIL != updates )
      {
        SubLObject current_$32;
        final SubLObject datum_$31 = current_$32 = updates;
        SubLObject first_update = NIL;
        SubLObject rest_updates = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current_$32, datum_$31, $list212 );
        first_update = current_$32.first();
        current_$32 = ( rest_updates = current_$32.rest() );
        c_backend_write_form( first_update, stream, number_utilities.f_1X( depth ) );
        SubLObject cdolist_list_var = rest_updates;
        SubLObject rest_update = NIL;
        rest_update = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          c_backend_write_function_call_argument_separator( stream );
          c_backend_write_form( rest_update, stream, number_utilities.f_1X( depth ) );
          cdolist_list_var = cdolist_list_var.rest();
          rest_update = cdolist_list_var.first();
        }
      }
      streams_high.write_string( $str185$__, stream, UNPROVIDED, UNPROVIDED );
      c_backend_write_form( reader.bq_cons( $sym91$PROGN, ConsesLow.append( body, NIL ) ), stream, depth );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( form, $list208 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 50626L)
  public static SubLObject c_backend_write_Xic(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    SubLObject operator = NIL;
    SubLObject constant_id = NIL;
    SubLObject constant_form = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list213 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list213 );
    constant_id = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list213 );
    constant_form = current.first();
    current = current.rest();
    if( NIL == current )
    {
      list_utilities.verify_operator( operator, $sym214$_IC );
      c_backend_write_internal_constant_reference( constant_id, constant_form, stream );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( form, $list213 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 50933L)
  public static SubLObject c_backend_write_internal_constant_reference(final SubLObject constant_id, final SubLObject constant_form, final SubLObject stream)
  {
    streams_high.write_string( $str215$_constants_, stream, UNPROVIDED, UNPROVIDED );
    c_backend_write_native_constant( constant_id, stream );
    streams_high.write_string( $str216$_, stream, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 51251L)
  public static SubLObject c_backend_write_Xinternal_constant(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    SubLObject operator = NIL;
    SubLObject constant_id = NIL;
    SubLObject constant_form = NIL;
    SubLObject load_form = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list217 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list217 );
    constant_id = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list217 );
    constant_form = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list217 );
    load_form = current.first();
    current = current.rest();
    if( NIL == current )
    {
      list_utilities.verify_operator( operator, $sym218$_INTERNAL_CONSTANT );
      streams_high.write_string( $str219$INITIALIZE_CONSTANT_, stream, UNPROVIDED, UNPROVIDED );
      c_backend_write_internal_constant_reference( constant_id, constant_form, stream );
      c_backend_write_function_call_argument_separator( stream );
      c_backend_write_form( load_form, stream, number_utilities.f_1X( depth ) );
      streams_high.write_string( $str70$_, stream, UNPROVIDED, UNPROVIDED );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( form, $list217 );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 51763L)
  public static SubLObject c_backend_write_Xlf(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    SubLObject operator = NIL;
    SubLObject v_object = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list220 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list220 );
    v_object = current.first();
    current = current.rest();
    if( NIL == current )
    {
      list_utilities.verify_operator( operator, $sym66$_LF );
      SubLObject load_form = NIL;
      if( v_object.isString() )
      {
        load_form = ConsesLow.list( $sym221$_CSTRING, v_object );
      }
      else if( v_object.isSymbol() )
      {
        load_form = c_backend_symbol_load_form( v_object );
      }
      else if( NIL != c_backend_fixnum_p( v_object ) )
      {
        load_form = ConsesLow.list( $sym222$_CFIX, v_object );
      }
      else if( v_object.isInteger() )
      {
        load_form = ConsesLow.list( $sym223$_CBIG, print_high.princ_to_string( v_object ) );
      }
      else if( v_object.isDouble() )
      {
        load_form = ConsesLow.list( $sym224$_CFLOAT, v_object );
      }
      else if( v_object.isChar() )
      {
        load_form = ConsesLow.list( $sym225$_CCHAR, Characters.char_code( v_object ) );
      }
      else if( v_object.isPackage() )
      {
        load_form = ConsesLow.list( $sym226$_CPACKAGE, Packages.package_name( v_object ) );
      }
      else if( NIL != Guids.guid_p( v_object ) )
      {
        load_form = ConsesLow.list( $sym227$_CGUID, Guids.guid_to_string( v_object ) );
      }
      else
      {
        Errors.error( $str228$Time_to_add__LF_support_for__S, v_object );
      }
      c_backend_write_form( load_form, stream, depth );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( form, $list220 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 52765L)
  public static SubLObject c_backend_symbol_load_form(final SubLObject symbol)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject name = system_translation.current_system_translation_secure_symbol_name( symbol );
    final SubLObject v_package = control_vars.subl_symbol_package( symbol );
    if( NIL == v_package )
    {
      return ConsesLow.list( $sym229$_CMAKE_SYMBOL, name );
    }
    if( v_package.eql( control_vars.$keyword_package$.getGlobalValue() ) )
    {
      return ConsesLow.list( $sym230$_CKEYWORD, name );
    }
    if( symbol.eql( Packages.find_symbol( name, Packages.$package$.getDynamicValue( thread ) ) ) )
    {
      return ConsesLow.list( $sym231$_CINTERN, name );
    }
    return ConsesLow.list( $sym232$_CSYMBOL, name, Packages.package_name( v_package ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 53305L)
  public static SubLObject c_backend_fixnum_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isInteger() && v_object.numLE( $int233$134217727 ) && v_object.numGE( $int234$_134217728 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 53516L)
  public static SubLObject c_backend_write_Xlocal(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    SubLObject operator = NIL;
    SubLObject variable = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list235 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list235 );
    variable = current.first();
    current = current.rest();
    final SubLObject initialization = current.isCons() ? current.first() : NIL;
    final SubLObject initializedP = Types.consp( current );
    cdestructuring_bind.destructuring_bind_must_listp( current, form, $list235 );
    current = current.rest();
    if( NIL == current )
    {
      list_utilities.verify_operator( operator, $sym111$_LOCAL );
      if( NIL != c_backend_volatilize_localsP() )
      {
        streams_high.write_string( $str236$volatile_, stream, UNPROVIDED, UNPROVIDED );
      }
      c_backend_write_object_data_type( stream );
      streams_high.write_string( $str34$_, stream, UNPROVIDED, UNPROVIDED );
      c_backend_write_form( variable, stream, depth );
      if( NIL != initializedP )
      {
        c_backend_write_assignment_operator( stream );
        c_backend_write_form( initialization, stream, depth );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( form, $list235 );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 54071L)
  public static SubLObject c_backend_write_multiple_value_list(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    SubLObject operator = NIL;
    SubLObject expression = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list162 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list162 );
    expression = current.first();
    current = current.rest();
    if( NIL == current )
    {
      list_utilities.verify_operator( operator, $sym237$MULTIPLE_VALUE_LIST );
      return c_backend_write_form( ConsesLow.list( $sym238$_MULTIPLE_VALUE_LIST, expression ), stream, depth );
    }
    cdestructuring_bind.cdestructuring_bind_error( form, $list162 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 54360L)
  public static SubLObject c_backend_write_Xnc(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    SubLObject operator = NIL;
    SubLObject constant = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list44 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list44 );
    constant = current.first();
    current = current.rest();
    if( NIL == current )
    {
      list_utilities.verify_operator( operator, $sym239$_NC );
      final SubLObject pcase_var = constant;
      if( pcase_var.eql( $sym240$_TRUE ) )
      {
        streams_high.write_string( $str241$TRUE, stream, UNPROVIDED, UNPROVIDED );
      }
      else if( pcase_var.eql( $sym242$_FALSE ) )
      {
        streams_high.write_string( $str243$FALSE, stream, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        Errors.error( $str244$Unexpected_native_constant__S, constant );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( form, $list44 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 54718L)
  public static SubLObject c_backend_write_Xnot(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    SubLObject operator = NIL;
    SubLObject expression = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list162 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list162 );
    expression = current.first();
    current = current.rest();
    if( NIL == current )
    {
      list_utilities.verify_operator( operator, $sym245$_NOT );
      streams_high.write_string( $str246$___, stream, UNPROVIDED, UNPROVIDED );
      c_backend_write_form( expression, stream, number_utilities.f_1X( depth ) );
      streams_high.write_string( $str247$__, stream, UNPROVIDED, UNPROVIDED );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( form, $list162 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 55005L)
  public static SubLObject c_backend_write_nth_value(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    SubLObject operator = NIL;
    SubLObject n = NIL;
    SubLObject expression = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list248 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list248 );
    n = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list248 );
    expression = current.first();
    current = current.rest();
    if( NIL == current )
    {
      list_utilities.verify_operator( operator, $sym249$NTH_VALUE );
      return c_backend_write_form( ConsesLow.list( $sym250$_NTH_VALUE, n, expression ), stream, depth );
    }
    cdestructuring_bind.cdestructuring_bind_error( form, $list248 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 55259L)
  public static SubLObject c_backend_write_Xor(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    SubLObject operator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list196 );
    operator = form.first();
    final SubLObject expressions;
    final SubLObject current = expressions = form.rest();
    list_utilities.verify_operator( operator, $sym251$_OR );
    if( NIL == expressions )
    {
      c_backend_write_Xnc( $list252, stream, number_utilities.f_1X( depth ) );
    }
    else if( NIL != list_utilities.singletonP( expressions ) )
    {
      c_backend_write_form( expressions.first(), stream, number_utilities.f_1X( depth ) );
    }
    else
    {
      streams_high.write_string( $str69$_, stream, UNPROVIDED, UNPROVIDED );
      c_backend_write_form( expressions.first(), stream, number_utilities.f_1X( depth ) );
      SubLObject cdolist_list_var = expressions.rest();
      SubLObject expression = NIL;
      expression = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        streams_high.terpri( stream );
        c_backend_indent( stream, number_utilities.f_1X( depth ) );
        streams_high.write_string( $str253$___, stream, UNPROVIDED, UNPROVIDED );
        c_backend_write_form( expression, stream, number_utilities.f_1X( depth ) );
        cdolist_list_var = cdolist_list_var.rest();
        expression = cdolist_list_var.first();
      }
      streams_high.write_string( $str70$_, stream, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 55964L)
  public static SubLObject c_backend_write_Xregister_function(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    SubLObject operator = NIL;
    SubLObject function = NIL;
    SubLObject required_count = NIL;
    SubLObject optional_count = NIL;
    SubLObject restP = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list254 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list254 );
    function = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list254 );
    required_count = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list254 );
    optional_count = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list254 );
    restP = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject name = system_translation.current_system_translation_secure_symbol_name( function );
      list_utilities.verify_operator( operator, $sym255$_REGISTER_FUNCTION );
      streams_high.write_string( $str256$DEFINE_, stream, UNPROVIDED, UNPROVIDED );
      c_backend_write_function_name( function, stream );
      c_backend_write_function_call_argument_separator( stream );
      c_backend_write_form( name, stream, number_utilities.f_1X( depth ) );
      c_backend_write_function_call_argument_separator( stream );
      c_backend_write_form( required_count, stream, number_utilities.f_1X( depth ) );
      c_backend_write_function_call_argument_separator( stream );
      c_backend_write_form( optional_count, stream, number_utilities.f_1X( depth ) );
      c_backend_write_function_call_argument_separator( stream );
      c_backend_write_Xnc( ( NIL != restP ) ? $list98 : $list252, stream, number_utilities.f_1X( depth ) );
      streams_high.write_string( $str70$_, stream, UNPROVIDED, UNPROVIDED );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( form, $list254 );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 56967L)
  public static SubLObject c_backend_write_Xregister_global(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    SubLObject operator = NIL;
    SubLObject definer = NIL;
    SubLObject global = NIL;
    SubLObject initialization = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list257 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list257 );
    definer = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list257 );
    global = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list257 );
    initialization = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject name = system_translation.current_system_translation_secure_symbol_name( global );
      list_utilities.verify_operator( operator, $sym258$_REGISTER_GLOBAL );
      print_high.princ( definer, stream );
      streams_high.write_string( $str69$_, stream, UNPROVIDED, UNPROVIDED );
      c_backend_write_global_variable_name( global, stream );
      c_backend_write_function_call_argument_separator( stream );
      c_backend_write_form( name, stream, number_utilities.f_1X( depth ) );
      c_backend_write_function_call_argument_separator( stream );
      c_backend_write_form( initialization, stream, number_utilities.f_1X( depth ) );
      streams_high.write_string( $str70$_, stream, UNPROVIDED, UNPROVIDED );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( form, $list257 );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 57669L)
  public static SubLObject c_backend_write_Xregister_macro(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    SubLObject operator = NIL;
    SubLObject function = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list259 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list259 );
    function = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject name = system_translation.current_system_translation_secure_symbol_name( function );
      list_utilities.verify_operator( operator, $sym260$_REGISTER_MACRO );
      streams_high.write_string( $str261$DEFMACRO_, stream, UNPROVIDED, UNPROVIDED );
      c_backend_write_function_name( function, stream );
      c_backend_write_function_call_argument_separator( stream );
      c_backend_write_form( name, stream, number_utilities.f_1X( depth ) );
      streams_high.write_string( $str70$_, stream, UNPROVIDED, UNPROVIDED );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( form, $list259 );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 58187L)
  public static SubLObject c_backend_write_Xwith_current_thread(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    SubLObject operator = NIL;
    SubLObject thread_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list262 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list262 );
    thread_var = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    list_utilities.verify_operator( operator, $sym263$_WITH_CURRENT_THREAD );
    SubLObject expanded_form = reader.bq_cons( $sym91$PROGN, ConsesLow.append( body, NIL ) );
    expanded_form = common_optimization.translator_optimize_progn( expanded_form );
    return c_backend_write_form( expanded_form, stream, depth );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 58616L)
  public static SubLObject c_backend_write_Xwith_error_handler(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject operator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list264 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list264 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject handler = NIL;
    SubLObject catch_var = NIL;
    SubLObject error_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list264 );
    handler = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list264 );
    catch_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list264 );
    error_var = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      list_utilities.verify_operator( operator, $sym265$_WITH_ERROR_HANDLER );
      final SubLObject expanded_form = ConsesLow.listS( $sym106$CLET_BIND, ConsesLow.list( ConsesLow.list( $sym266$_ERROR_HANDLER_, handler ) ), ConsesLow.append( body, NIL ) );
      return c_backend_write_form( expanded_form, stream, depth );
    }
    cdestructuring_bind.cdestructuring_bind_error( form, $list264 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 59105L)
  public static SubLObject c_backend_write_Xwith_process_resource_tracking(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    SubLObject operator = NIL;
    SubLObject env_var = NIL;
    SubLObject result_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list267 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list267 );
    env_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list267 );
    result_var = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    list_utilities.verify_operator( operator, $sym268$_WITH_PROCESS_RESOURCE_TRACKING );
    return c_backend_write_progn( ConsesLow.listS( $sym91$PROGN, ConsesLow.list( $sym269$_BEGIN_WITH_PROCESS_RESOURCE_TRACKING, env_var, result_var ), ConsesLow.append( body, ConsesLow.list( ConsesLow.list(
        $sym270$_END_WITH_PROCESS_RESOURCE_TRACKING, env_var, result_var ) ) ) ), stream, depth );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 59568L)
  public static SubLObject c_backend_write_Xthread_mval(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject operator = NIL;
    SubLObject thread_$34 = NIL;
    SubLObject n = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list271 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list271 );
    thread_$34 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list271 );
    n = current.first();
    current = current.rest();
    if( NIL == current )
    {
      list_utilities.verify_operator( operator, $sym272$_THREAD_MVAL );
      return c_backend_write_form( ConsesLow.list( $sym273$_MVAL, n ), stream, depth );
    }
    cdestructuring_bind.cdestructuring_bind_error( form, $list271 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 60050L)
  public static SubLObject c_backend_write_Xthread_reset_mval(final SubLObject form, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject operator = NIL;
    SubLObject thread_$35 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list274 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list274 );
    thread_$35 = current.first();
    current = current.rest();
    if( NIL == current )
    {
      list_utilities.verify_operator( operator, $sym275$_THREAD_RESET_MVAL );
      return c_backend_write_form( $list276, stream, depth );
    }
    cdestructuring_bind.cdestructuring_bind_error( form, $list274 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 60357L)
  public static SubLObject c_backend_optimize_function_call_form(SubLObject function_call_form)
  {
    function_call_form = c_name_translation.c_backend_function_call_arity_transform( function_call_form );
    function_call_form = c_name_translation.c_backend_simplify_Xdtb_transform( function_call_form );
    return function_call_form;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 60830L)
  public static SubLObject c_backend_output_system_level_files(final SubLObject system, final SubLObject output_directory, final SubLObject system_default_path, final SubLObject init_functions,
      final SubLObject module_paths, final SubLObject directory_module_map)
  {
    assert NIL != Types.stringp( system ) : system;
    assert NIL != Types.stringp( output_directory ) : output_directory;
    final SubLObject libraries = system_translation.translator_libraries_from_directory_module_map( system, directory_module_map );
    final SubLObject paths = system_translation.translator_paths_from_directory_module_map( directory_module_map );
    c_backend_output_system_init_file( system, output_directory, system_default_path, init_functions );
    c_backend_output_system_header_file( system, output_directory, system_default_path, module_paths );
    c_backend_output_system_filelist_file( system, output_directory, system_default_path, directory_module_map );
    c_backend_output_system_build_index_file( output_directory, system_default_path, libraries );
    c_backend_output_system_build_instructions_file( output_directory, system_default_path, paths );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 61971L)
  public static SubLObject c_backend_file_name_from_string(final SubLObject string)
  {
    assert NIL != Types.stringp( string ) : string;
    return Strings.string_downcase( string, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 62114L)
  public static SubLObject c_backend_output_module_filename(final SubLObject module, SubLObject secure_module_id)
  {
    if( secure_module_id == UNPROVIDED )
    {
      secure_module_id = NIL;
    }
    if( NIL != secure_module_id )
    {
      return PrintLow.format( NIL, $str277$module_4__0D, secure_module_id );
    }
    return c_backend_file_name_from_string( module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 62334L)
  public static SubLObject c_backend_module_name_from_string(final SubLObject module)
  {
    assert NIL != Types.stringp( module ) : module;
    final SubLObject sys_tran = system_translation.current_system_translation();
    final SubLObject secure_module_id = ( NIL != sys_tran ) ? system_translation.sys_tran_secure_module_id( sys_tran, module ) : NIL;
    return c_backend_output_module_filename( module, secure_module_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 62627L)
  public static SubLObject c_backend_method_name_from_string(final SubLObject string)
  {
    assert NIL != Types.stringp( string ) : string;
    return Sequences.nsubstitute( Characters.CHAR_hyphen, Characters.CHAR_underbar, Strings.string_downcase( string, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 62773L)
  public static SubLObject c_backend_ifdef_name_from_string(final SubLObject string)
  {
    assert NIL != Types.stringp( string ) : string;
    return Sequences.nsubstitute( Characters.CHAR_hyphen, Characters.CHAR_underbar, Strings.string_upcase( string, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 62916L)
  public static SubLObject c_backend_output_system_init_file(final SubLObject system, final SubLObject output_directory, final SubLObject system_default_path, final SubLObject init_functions)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject system_file_name = c_backend_file_name_from_string( system );
    final SubLObject system_method_name = c_backend_method_name_from_string( system );
    SubLObject system_init_filename = system_translation.translator_compute_full_filename( output_directory, system_default_path, system_file_name, $str278$c );
    if( NIL == system_translation.translator_output_enabled_p() )
    {
      system_init_filename = $str5$_dev_null;
    }
    final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding( thread );
    final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding( thread );
    try
    {
      StreamsLow.$stream_initial_input_buffer_size$.bind( $int2$1048576, thread );
      StreamsLow.$stream_initial_output_buffer_size$.bind( StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue( thread ), thread );
      final SubLObject filename_var = system_init_filename;
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0_$36 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( filename_var, $kw3$OUTPUT );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_$36, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str4$Unable_to_open__S, filename_var );
        }
        final SubLObject stream_$37 = stream;
        c_backend_write_preamble( stream_$37, system_init_filename, UNPROVIDED );
        PrintLow.format( stream_$37, $str279$_____include___A_h_____, system_file_name );
        PrintLow.format( stream_$37, $str280$void_init__A_void___, system_method_name );
        SubLObject list_var = NIL;
        SubLObject init_function = NIL;
        SubLObject index = NIL;
        list_var = init_functions;
        init_function = list_var.first();
        for( index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), init_function = list_var.first(), index = Numbers.add( ONE_INTEGER, index ) )
        {
          PrintLow.format( stream_$37, $str281$____ );
          c_backend_write_function_name( init_function, stream_$37 );
          PrintLow.format( stream_$37, $str282$___ );
          if( TWO_INTEGER.numE( Numbers.mod( index, THREE_INTEGER ) ) )
          {
            streams_high.terpri( stream_$37 );
          }
        }
        PrintLow.format( stream_$37, $str283$_____ );
      }
      finally
      {
        final SubLObject _prev_bind_0_$37 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$37, thread );
        }
      }
    }
    finally
    {
      StreamsLow.$stream_initial_output_buffer_size$.rebind( _prev_bind_2, thread );
      StreamsLow.$stream_initial_input_buffer_size$.rebind( _prev_bind_0, thread );
    }
    return system_init_filename;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 63950L)
  public static SubLObject c_backend_output_system_header_file(final SubLObject system, final SubLObject output_directory, final SubLObject system_default_path, final SubLObject module_path_tuples)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject system_file_name = c_backend_file_name_from_string( system );
    final SubLObject system_method_name = c_backend_method_name_from_string( system );
    final SubLObject system_header_filename = system_translation.translator_compute_full_filename( output_directory, system_default_path, system_file_name, $str284$h );
    final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding( thread );
    final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding( thread );
    try
    {
      StreamsLow.$stream_initial_input_buffer_size$.bind( $int2$1048576, thread );
      StreamsLow.$stream_initial_output_buffer_size$.bind( StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue( thread ), thread );
      final SubLObject filename_var = system_header_filename;
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0_$39 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( filename_var, $kw3$OUTPUT );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_$39, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str4$Unable_to_open__S, filename_var );
        }
        final SubLObject stream_$40 = stream;
        c_backend_write_preamble( stream_$40, system_header_filename, UNPROVIDED );
        streams_high.terpri( stream_$40 );
        streams_high.terpri( stream_$40 );
        streams_high.write_string( $str12$_include__rtl_h_, stream_$40, UNPROVIDED, UNPROVIDED );
        final SubLObject system_ifdef_name = c_backend_ifdef_name_from_string( system );
        PrintLow.format( stream_$40, $str285$_____ifdef_CYC_PROFILING );
        PrintLow.format( stream_$40, $str15$___define__A_PROFILING, system_ifdef_name );
        PrintLow.format( stream_$40, $str286$___endif__ );
        SubLObject cdolist_list_var = module_path_tuples;
        SubLObject module_path_tuple = NIL;
        module_path_tuple = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject current;
          final SubLObject datum = current = module_path_tuple;
          SubLObject module_path = NIL;
          SubLObject module = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list287 );
          module_path = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list287 );
          module = current.first();
          current = current.rest();
          if( NIL == current )
          {
            PrintLow.format( stream_$40, $str288$___include___A_A_h_, c_backend_relative_directory( module_path ), c_backend_module_name_from_string( module ) );
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list287 );
          }
          cdolist_list_var = cdolist_list_var.rest();
          module_path_tuple = cdolist_list_var.first();
        }
        PrintLow.format( stream_$40, $str289$____extern_void_init__A_void____, system_method_name );
      }
      finally
      {
        final SubLObject _prev_bind_0_$40 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$40, thread );
        }
      }
    }
    finally
    {
      StreamsLow.$stream_initial_output_buffer_size$.rebind( _prev_bind_2, thread );
      StreamsLow.$stream_initial_input_buffer_size$.rebind( _prev_bind_0, thread );
    }
    return system_header_filename;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 65173L)
  public static SubLObject c_backend_relative_directory(final SubLObject module_path)
  {
    return Strings.string_downcase( file_utilities.reconstruct_path( module_path, $str290$, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 65294L)
  public static SubLObject c_backend_output_system_filelist_file(final SubLObject system, final SubLObject output_directory, final SubLObject system_default_path, final SubLObject directory_module_map)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject system_filelist_filename = system_translation.translator_compute_full_filename( output_directory, system_default_path, $str291$filelist, $str292$text );
    if( NIL == system_translation.translator_output_enabled_p() )
    {
      system_filelist_filename = $str5$_dev_null;
    }
    final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding( thread );
    final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding( thread );
    try
    {
      StreamsLow.$stream_initial_input_buffer_size$.bind( $int2$1048576, thread );
      StreamsLow.$stream_initial_output_buffer_size$.bind( StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue( thread ), thread );
      final SubLObject filename_var = system_filelist_filename;
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0_$42 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( filename_var, $kw3$OUTPUT );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_$42, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str4$Unable_to_open__S, filename_var );
        }
        final SubLObject stream_$43 = stream;
        c_backend_write_makefile_preamble( stream_$43 );
        streams_high.terpri( stream_$43 );
        SubLObject cdolist_list_var = directory_module_map;
        SubLObject module_map_info = NIL;
        module_map_info = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject current;
          final SubLObject datum = current = module_map_info;
          SubLObject module_path = NIL;
          SubLObject v_modules = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list293 );
          module_path = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list293 );
          v_modules = current.first();
          current = current.rest();
          if( NIL == current )
          {
            final SubLObject library = ( NIL != module_path ) ? list_utilities.last_one( module_path ) : system;
            c_backend_output_system_directory_make_file_info( stream_$43, system, library, module_path, v_modules );
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list293 );
          }
          cdolist_list_var = cdolist_list_var.rest();
          module_map_info = cdolist_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$43 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$43, thread );
        }
      }
    }
    finally
    {
      StreamsLow.$stream_initial_output_buffer_size$.rebind( _prev_bind_2, thread );
      StreamsLow.$stream_initial_input_buffer_size$.rebind( _prev_bind_0, thread );
    }
    return system_filelist_filename;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 66156L)
  public static SubLObject c_backend_output_system_directory_make_file_info(final SubLObject stream, final SubLObject system, final SubLObject library, final SubLObject module_path, final SubLObject v_modules)
  {
    final SubLObject library_ifdef_name = c_backend_ifdef_name_from_string( library );
    final SubLObject library_file_name = c_backend_file_name_from_string( library );
    final SubLObject system_file_name = c_backend_file_name_from_string( system );
    PrintLow.format( stream, $str294$_A_HEADERS___, library_ifdef_name );
    if( NIL == module_path )
    {
      PrintLow.format( stream, $str295$____c_A_h_, Characters.CHAR_tab, system_file_name );
    }
    SubLObject cdolist_list_var = v_modules;
    SubLObject module = NIL;
    module = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      PrintLow.format( stream, $str296$____c_A_A_h_, new SubLObject[] { Characters.CHAR_tab, c_backend_relative_directory( module_path ), c_backend_module_name_from_string( module )
      } );
      cdolist_list_var = cdolist_list_var.rest();
      module = cdolist_list_var.first();
    }
    PrintLow.format( stream, $str297$_____A_SOURCES___, library_ifdef_name );
    if( NIL == module_path )
    {
      PrintLow.format( stream, $str298$____c_A_c_, Characters.CHAR_tab, system_file_name );
    }
    cdolist_list_var = v_modules;
    module = NIL;
    module = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      PrintLow.format( stream, $str299$____c_A_A_c_, new SubLObject[] { Characters.CHAR_tab, c_backend_relative_directory( module_path ), c_backend_module_name_from_string( module )
      } );
      cdolist_list_var = cdolist_list_var.rest();
      module = cdolist_list_var.first();
    }
    PrintLow.format( stream, $str300$_____A_OBJECTS___, library_ifdef_name );
    if( NIL == module_path )
    {
      PrintLow.format( stream, $str301$____c_A_o_, Characters.CHAR_tab, system_file_name );
    }
    cdolist_list_var = v_modules;
    module = NIL;
    module = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      PrintLow.format( stream, $str302$____c_A_A_o_, new SubLObject[] { Characters.CHAR_tab, c_backend_relative_directory( module_path ), c_backend_module_name_from_string( module )
      } );
      cdolist_list_var = cdolist_list_var.rest();
      module = cdolist_list_var.first();
    }
    PrintLow.format( stream, $str303$____lib_A_a_____A_OBJECTS_____, library_file_name, library_ifdef_name );
    return library;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 67770L)
  public static SubLObject c_backend_output_system_build_index_file(final SubLObject output_directory, final SubLObject system_default_path, final SubLObject libraries)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject system_build_index_filename = system_translation.translator_compute_full_filename( output_directory, system_default_path, $str304$build_index, $str292$text );
    if( NIL == system_translation.translator_output_enabled_p() )
    {
      system_build_index_filename = $str5$_dev_null;
    }
    final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding( thread );
    final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding( thread );
    try
    {
      StreamsLow.$stream_initial_input_buffer_size$.bind( $int2$1048576, thread );
      StreamsLow.$stream_initial_output_buffer_size$.bind( StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue( thread ), thread );
      final SubLObject filename_var = system_build_index_filename;
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0_$45 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( filename_var, $kw3$OUTPUT );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_$45, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str4$Unable_to_open__S, filename_var );
        }
        final SubLObject stream_$46 = stream;
        c_backend_write_makefile_preamble( stream_$46 );
        streams_high.terpri( stream_$46 );
        c_backend_output_system_build_index_libraries( stream_$46, libraries, Symbols.symbol_function( $sym305$C_BACKEND_IFDEF_NAME_FROM_STRING ), $str306$BUILD_OBJECTS___, $str307$__, $str308$_OBJECTS_ );
        c_backend_output_system_build_index_libraries( stream_$46, libraries, Symbols.symbol_function( $sym305$C_BACKEND_IFDEF_NAME_FROM_STRING ), $str309$BUILD_SOURCES___, $str307$__, $str310$_SOURCES_ );
        c_backend_output_system_build_index_libraries( stream_$46, libraries, Symbols.symbol_function( $sym305$C_BACKEND_IFDEF_NAME_FROM_STRING ), $str311$BUILD_HEADERS___, $str307$__, $str312$_HEADERS_ );
        c_backend_output_system_build_index_libraries( stream_$46, libraries, Symbols.symbol_function( $sym313$C_BACKEND_FILE_NAME_FROM_STRING ), $str314$BUILD_LIBRARIES___, $str315$lib, $str316$_a );
      }
      finally
      {
        final SubLObject _prev_bind_0_$46 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$46, thread );
        }
      }
    }
    finally
    {
      StreamsLow.$stream_initial_output_buffer_size$.rebind( _prev_bind_2, thread );
      StreamsLow.$stream_initial_input_buffer_size$.rebind( _prev_bind_0, thread );
    }
    return system_build_index_filename;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 68967L)
  public static SubLObject c_backend_output_system_build_index_libraries(final SubLObject stream, final SubLObject libraries, final SubLObject library_converter, final SubLObject header, final SubLObject prefix,
      final SubLObject suffix)
  {
    PrintLow.format( stream, $str317$___A, header );
    SubLObject cdolist_list_var = libraries;
    SubLObject library = NIL;
    library = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      PrintLow.format( stream, $str318$_A_A_A_, new SubLObject[] { prefix, Functions.funcall( library_converter, library ), suffix
      } );
      cdolist_list_var = cdolist_list_var.rest();
      library = cdolist_list_var.first();
    }
    streams_high.terpri( stream );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 69282L)
  public static SubLObject c_backend_output_system_build_instructions_file(final SubLObject output_directory, final SubLObject system_default_path, final SubLObject paths)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject system_build_instructions_filename = system_translation.translator_compute_full_filename( output_directory, system_default_path, $str319$build_instructions, $str292$text );
    if( NIL == system_translation.translator_output_enabled_p() )
    {
      system_build_instructions_filename = $str5$_dev_null;
    }
    final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding( thread );
    final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding( thread );
    try
    {
      StreamsLow.$stream_initial_input_buffer_size$.bind( $int2$1048576, thread );
      StreamsLow.$stream_initial_output_buffer_size$.bind( StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue( thread ), thread );
      final SubLObject filename_var = system_build_instructions_filename;
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0_$48 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( filename_var, $kw3$OUTPUT );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_$48, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str4$Unable_to_open__S, filename_var );
        }
        final SubLObject stream_$49 = stream;
        c_backend_write_makefile_preamble( stream_$49 );
        PrintLow.format( stream_$49, $str320$__curr_dir______shell_pwd___PWD__ );
        PrintLow.format( stream_$49, $str321$______DIRS___ );
        SubLObject list_var = NIL;
        SubLObject path = NIL;
        SubLObject index = NIL;
        list_var = paths;
        path = list_var.first();
        for( index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), path = list_var.first(), index = Numbers.add( ONE_INTEGER, index ) )
        {
          if( !index.isZero() )
          {
            PrintLow.format( stream_$49, $str322$__C______, Characters.CHAR_backslash );
          }
          final SubLObject path_spec = c_backend_system_build_instructions_path_spec( path );
          PrintLow.format( stream_$49, $str323$__PWD___A, path_spec );
        }
        SubLObject cdolist_list_var = paths;
        path = NIL;
        path = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject path_spec2 = c_backend_system_build_instructions_path_spec( path );
          PrintLow.format( stream_$49, $str324$______PWD___A____C__MKDIR____, path_spec2, Characters.CHAR_tab );
          cdolist_list_var = cdolist_list_var.rest();
          path = cdolist_list_var.first();
        }
        streams_high.terpri( stream_$49 );
        streams_high.terpri( stream_$49 );
      }
      finally
      {
        final SubLObject _prev_bind_0_$49 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$49, thread );
        }
      }
    }
    finally
    {
      StreamsLow.$stream_initial_output_buffer_size$.rebind( _prev_bind_2, thread );
      StreamsLow.$stream_initial_input_buffer_size$.rebind( _prev_bind_0, thread );
    }
    return system_build_instructions_filename;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-backend.lisp", position = 70604L)
  public static SubLObject c_backend_system_build_instructions_path_spec(final SubLObject path)
  {
    SubLObject strings = NIL;
    SubLObject cdolist_list_var = path;
    SubLObject subdir = NIL;
    subdir = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject sub_path_spec = c_backend_file_name_from_string( subdir );
      strings = ConsesLow.cons( sub_path_spec, strings );
      strings = ConsesLow.cons( $str325$_, strings );
      cdolist_list_var = cdolist_list_var.rest();
      subdir = cdolist_list_var.first();
    }
    return Functions.apply( Symbols.symbol_function( $sym326$CCONCATENATE ), Sequences.nreverse( strings ) );
  }

  public static SubLObject declare_c_backend_file()
  {
    SubLFiles.declareFunction( me, "c_backend_output_file_and_header_file", "C-BACKEND-OUTPUT-FILE-AND-HEADER-FILE", 2, 1, false );
    SubLFiles.declareFunction( me, "c_backend_output_file", "C-BACKEND-OUTPUT-FILE", 2, 0, false );
    SubLFiles.declareFunction( me, "c_backend_output_header_file", "C-BACKEND-OUTPUT-HEADER-FILE", 2, 0, false );
    SubLFiles.declareFunction( me, "c_backend_associated_header_file", "C-BACKEND-ASSOCIATED-HEADER-FILE", 1, 0, false );
    SubLFiles.declareFunction( me, "c_backend_output_to_stream", "C-BACKEND-OUTPUT-TO-STREAM", 1, 2, false );
    SubLFiles.declareFunction( me, "c_backend_output_definition_headers_to_stream", "C-BACKEND-OUTPUT-DEFINITION-HEADERS-TO-STREAM", 1, 2, false );
    SubLFiles.declareFunction( me, "c_backend_output_global_headers", "C-BACKEND-OUTPUT-GLOBAL-HEADERS", 2, 0, false );
    SubLFiles.declareFunction( me, "c_backend_output_function_headers", "C-BACKEND-OUTPUT-FUNCTION-HEADERS", 2, 0, false );
    SubLFiles.declareFunction( me, "c_backend_output_header_section", "C-BACKEND-OUTPUT-HEADER-SECTION", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_preamble", "C-BACKEND-WRITE-PREAMBLE", 2, 1, false );
    SubLFiles.declareFunction( me, "c_backend_write_makefile_preamble", "C-BACKEND-WRITE-MAKEFILE-PREAMBLE", 1, 0, false );
    SubLFiles.declareFunction( me, "translation_copyright_string", "TRANSLATION-COPYRIGHT-STRING", 0, 0, false );
    SubLFiles.declareFunction( me, "c_backend_output_forward_global_declarations", "C-BACKEND-OUTPUT-FORWARD-GLOBAL-DECLARATIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "c_backend_output_forward_function_declarations", "C-BACKEND-OUTPUT-FORWARD-FUNCTION-DECLARATIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_global_reference_via_rtlP", "FORWARD-GLOBAL-REFERENCE-VIA-RTL?", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_function_reference_via_rtlP", "FORWARD-FUNCTION-REFERENCE-VIA-RTL?", 1, 0, false );
    SubLFiles.declareFunction( me, "ts_file_all_forward_referenced_globals", "TS-FILE-ALL-FORWARD-REFERENCED-GLOBALS", 1, 0, false );
    SubLFiles.declareFunction( me, "ts_file_all_forward_referenced_functions", "TS-FILE-ALL-FORWARD-REFERENCED-FUNCTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "c_backend_output_forward_global_declaration", "C-BACKEND-OUTPUT-FORWARD-GLOBAL-DECLARATION", 2, 0, false );
    SubLFiles.declareFunction( me, "c_backend_output_forward_function_declaration", "C-BACKEND-OUTPUT-FORWARD-FUNCTION-DECLARATION", 2, 0, false );
    SubLFiles.declareFunction( me, "c_backend_output_internal_constant_array_definition", "C-BACKEND-OUTPUT-INTERNAL-CONSTANT-ARRAY-DEFINITION", 2, 0, false );
    SubLFiles.declareFunction( me, "c_backend_output_private_global_definitions", "C-BACKEND-OUTPUT-PRIVATE-GLOBAL-DEFINITIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "c_backend_output_private_function_definitions", "C-BACKEND-OUTPUT-PRIVATE-FUNCTION-DEFINITIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "c_backend_output_definitions", "C-BACKEND-OUTPUT-DEFINITIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_statement", "C-BACKEND-WRITE-STATEMENT", 2, 1, false );
    SubLFiles.declareFunction( me, "c_backend_write_form", "C-BACKEND-WRITE-FORM", 2, 1, false );
    SubLFiles.declareFunction( me, "c_backend_test_translate_write_form", "C-BACKEND-TEST-TRANSLATE-WRITE-FORM", 2, 1, false );
    SubLFiles.declareFunction( me, "c_backend_indent", "C-BACKEND-INDENT", 2, 0, false );
    SubLFiles.declareFunction( me, "c_backend_print_atom", "C-BACKEND-PRINT-ATOM", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_native_constant_p", "C-BACKEND-NATIVE-CONSTANT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_native_constant", "C-BACKEND-WRITE-NATIVE-CONSTANT", 2, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_native_string_constant", "C-BACKEND-WRITE-NATIVE-STRING-CONSTANT", 2, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_Xpc", "C-BACKEND-WRITE-%PC", 2, 1, false );
    SubLFiles.declareFunction( me, "c_backend_print_variable", "C-BACKEND-PRINT-VARIABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "c_backend_variable_binding_type", "C-BACKEND-VARIABLE-BINDING-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_global_variable_name", "C-BACKEND-WRITE-GLOBAL-VARIABLE-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_local_variable_name", "C-BACKEND-WRITE-LOCAL-VARIABLE-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "c_backend_secure_global_id", "C-BACKEND-SECURE-GLOBAL-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "c_backend_secure_local_id_internal", "C-BACKEND-SECURE-LOCAL-ID-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "c_backend_secure_local_id", "C-BACKEND-SECURE-LOCAL-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "c_backend_local_variable_name_internal", "C-BACKEND-LOCAL-VARIABLE-NAME-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "c_backend_local_variable_name", "C-BACKEND-LOCAL-VARIABLE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "c_backend_global_variable_name", "C-BACKEND-GLOBAL-VARIABLE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "c_backend_compute_global_variable_name_internal", "C-BACKEND-COMPUTE-GLOBAL-VARIABLE-NAME-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "c_backend_compute_global_variable_name", "C-BACKEND-COMPUTE-GLOBAL-VARIABLE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "c_backend_symbol_name_basis", "C-BACKEND-SYMBOL-NAME-BASIS", 1, 0, false );
    SubLFiles.declareFunction( me, "c_backed_convert_identifier_name", "C-BACKED-CONVERT-IDENTIFIER-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "c_backend_convert_char", "C-BACKEND-CONVERT-CHAR", 1, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_function_call", "C-BACKEND-WRITE-FUNCTION-CALL", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_function_name", "C-BACKEND-FUNCTION-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "c_backend_computed_function_name_internal", "C-BACKEND-COMPUTED-FUNCTION-NAME-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "c_backend_computed_function_name", "C-BACKEND-COMPUTED-FUNCTION-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "c_backend_function_signature_info", "C-BACKEND-FUNCTION-SIGNATURE-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "c_backend_function_arglist", "C-BACKEND-FUNCTION-ARGLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_function_call_argument_separator", "C-BACKEND-WRITE-FUNCTION-CALL-ARGUMENT-SEPARATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_function_call_unprovided_argument", "C-BACKEND-WRITE-FUNCTION-CALL-UNPROVIDED-ARGUMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_call_arity", "C-BACKEND-WRITE-CALL-ARITY", 2, 0, false );
    SubLFiles.declareFunction( me, "c_backend_writer", "C-BACKEND-WRITER", 1, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_via_writer", "C-BACKEND-WRITE-VIA-WRITER", 4, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_Xb_check_type", "C-BACKEND-WRITE-%B-CHECK-TYPE", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_check_type", "C-BACKEND-WRITE-CHECK-TYPE", 5, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_Xdp_check_type", "C-BACKEND-WRITE-%DP-CHECK-TYPE", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_Xdp_enforce_type", "C-BACKEND-WRITE-%DP-ENFORCE-TYPE", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_Xccatch", "C-BACKEND-WRITE-%CCATCH", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_Xcdo_symbols", "C-BACKEND-WRITE-%CDO-SYMBOLS", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_clet_bind", "C-BACKEND-WRITE-CLET-BIND", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_clet_local", "C-BACKEND-WRITE-CLET-LOCAL", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_code_comment", "C-BACKEND-WRITE-CODE-COMMENT", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_Xcprogv", "C-BACKEND-WRITE-%CPROGV", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_csetq", "C-BACKEND-WRITE-CSETQ", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_csetq_dynamic", "C-BACKEND-WRITE-CSETQ-DYNAMIC", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_csetq_lexical", "C-BACKEND-WRITE-CSETQ-LEXICAL", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_csetq_local", "C-BACKEND-WRITE-CSETQ-LOCAL", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_assignment_operator", "C-BACKEND-WRITE-ASSIGNMENT-OPERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_Xcunwind_protect", "C-BACKEND-WRITE-%CUNWIND-PROTECT", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_cvs_id", "C-BACKEND-WRITE-CVS-ID", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_defconstant", "C-BACKEND-WRITE-DEFCONSTANT", 2, 1, false );
    SubLFiles.declareFunction( me, "c_backend_write_global", "C-BACKEND-WRITE-GLOBAL", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_volatilize_localsP", "C-BACKEND-VOLATILIZE-LOCALS?", 0, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_define", "C-BACKEND-WRITE-DEFINE", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_compute_function_body_statement", "C-BACKEND-COMPUTE-FUNCTION-BODY-STATEMENT", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_definer_comment", "C-BACKEND-WRITE-DEFINER-COMMENT", 2, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_method_source_definition_comment", "C-BACKEND-WRITE-METHOD-SOURCE-DEFINITION-COMMENT", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_global_source_definition_comment", "C-BACKEND-WRITE-GLOBAL-SOURCE-DEFINITION-COMMENT", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_function_declaration", "C-BACKEND-WRITE-FUNCTION-DECLARATION", 2, 2, false );
    SubLFiles.declareFunction( me, "c_backend_write_function_name", "C-BACKEND-WRITE-FUNCTION-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "c_backend_secure_method_id", "C-BACKEND-SECURE-METHOD-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "c_backend_optional_argument_initializations", "C-BACKEND-OPTIONAL-ARGUMENT-INITIALIZATIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_object_data_type", "C-BACKEND-WRITE-OBJECT-DATA-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_function_arglist", "C-BACKEND-WRITE-FUNCTION-ARGLIST", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_function_argument_separator", "C-BACKEND-WRITE-FUNCTION-ARGUMENT-SEPARATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_function_arglist_arg", "C-BACKEND-WRITE-FUNCTION-ARGLIST-ARG", 2, 0, false );
    SubLFiles.declareFunction( me, "translator_arglist_arg_variable", "TRANSLATOR-ARGLIST-ARG-VARIABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "c_backend_volatilize_defineP", "C-BACKEND-VOLATILIZE-DEFINE?", 1, 0, false );
    SubLFiles.declareFunction( me, "c_backend_method_returns_within_binding_constructP", "C-BACKEND-METHOD-RETURNS-WITHIN-BINDING-CONSTRUCT?", 1, 0, false );
    SubLFiles.declareFunction( me, "c_backend_transform_returns_to_throws", "C-BACKEND-TRANSFORM-RETURNS-TO-THROWS", 1, 0, false );
    SubLFiles.declareFunction( me, "translator_ret_form_p", "TRANSLATOR-RET-FORM-P", 1, 0, false );
    SubLFiles.declareFunction( me, "translator_ret_to_throw", "TRANSLATOR-RET-TO-THROW", 1, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_define_macroexpander", "C-BACKEND-WRITE-DEFINE-MACROEXPANDER", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_deflexical", "C-BACKEND-WRITE-DEFLEXICAL", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_defparameter", "C-BACKEND-WRITE-DEFPARAMETER", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_Xdefstruct_class", "C-BACKEND-WRITE-%DEFSTRUCT-CLASS", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_defstruct_construct", "C-BACKEND-WRITE-DEFSTRUCT-CONSTRUCT", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_defstruct_get_slot", "C-BACKEND-WRITE-DEFSTRUCT-GET-SLOT", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_defstruct_object_p", "C-BACKEND-WRITE-DEFSTRUCT-OBJECT-P", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_defstruct_set_slot", "C-BACKEND-WRITE-DEFSTRUCT-SET-SLOT", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_defvar", "C-BACKEND-WRITE-DEFVAR", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_fif", "C-BACKEND-WRITE-FIF", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_pcond", "C-BACKEND-WRITE-PCOND", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_progn", "C-BACKEND-WRITE-PROGN", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_Xproclaim", "C-BACKEND-WRITE-%PROCLAIM", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_ret", "C-BACKEND-WRITE-RET", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_while", "C-BACKEND-WRITE-WHILE", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_Xand", "C-BACKEND-WRITE-%AND", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_Xcdohash", "C-BACKEND-WRITE-%CDOHASH", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_Xenter", "C-BACKEND-WRITE-%ENTER", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_Xfor", "C-BACKEND-WRITE-%FOR", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_Xic", "C-BACKEND-WRITE-%IC", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_internal_constant_reference", "C-BACKEND-WRITE-INTERNAL-CONSTANT-REFERENCE", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_Xinternal_constant", "C-BACKEND-WRITE-%INTERNAL-CONSTANT", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_Xlf", "C-BACKEND-WRITE-%LF", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_symbol_load_form", "C-BACKEND-SYMBOL-LOAD-FORM", 1, 0, false );
    SubLFiles.declareFunction( me, "c_backend_fixnum_p", "C-BACKEND-FIXNUM-P", 1, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_Xlocal", "C-BACKEND-WRITE-%LOCAL", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_multiple_value_list", "C-BACKEND-WRITE-MULTIPLE-VALUE-LIST", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_Xnc", "C-BACKEND-WRITE-%NC", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_Xnot", "C-BACKEND-WRITE-%NOT", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_nth_value", "C-BACKEND-WRITE-NTH-VALUE", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_Xor", "C-BACKEND-WRITE-%OR", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_Xregister_function", "C-BACKEND-WRITE-%REGISTER-FUNCTION", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_Xregister_global", "C-BACKEND-WRITE-%REGISTER-GLOBAL", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_Xregister_macro", "C-BACKEND-WRITE-%REGISTER-MACRO", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_Xwith_current_thread", "C-BACKEND-WRITE-%WITH-CURRENT-THREAD", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_Xwith_error_handler", "C-BACKEND-WRITE-%WITH-ERROR-HANDLER", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_Xwith_process_resource_tracking", "C-BACKEND-WRITE-%WITH-PROCESS-RESOURCE-TRACKING", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_Xthread_mval", "C-BACKEND-WRITE-%THREAD-MVAL", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_write_Xthread_reset_mval", "C-BACKEND-WRITE-%THREAD-RESET-MVAL", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_optimize_function_call_form", "C-BACKEND-OPTIMIZE-FUNCTION-CALL-FORM", 1, 0, false );
    SubLFiles.declareFunction( me, "c_backend_output_system_level_files", "C-BACKEND-OUTPUT-SYSTEM-LEVEL-FILES", 6, 0, false );
    SubLFiles.declareFunction( me, "c_backend_file_name_from_string", "C-BACKEND-FILE-NAME-FROM-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "c_backend_output_module_filename", "C-BACKEND-OUTPUT-MODULE-FILENAME", 1, 1, false );
    SubLFiles.declareFunction( me, "c_backend_module_name_from_string", "C-BACKEND-MODULE-NAME-FROM-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "c_backend_method_name_from_string", "C-BACKEND-METHOD-NAME-FROM-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "c_backend_ifdef_name_from_string", "C-BACKEND-IFDEF-NAME-FROM-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "c_backend_output_system_init_file", "C-BACKEND-OUTPUT-SYSTEM-INIT-FILE", 4, 0, false );
    SubLFiles.declareFunction( me, "c_backend_output_system_header_file", "C-BACKEND-OUTPUT-SYSTEM-HEADER-FILE", 4, 0, false );
    SubLFiles.declareFunction( me, "c_backend_relative_directory", "C-BACKEND-RELATIVE-DIRECTORY", 1, 0, false );
    SubLFiles.declareFunction( me, "c_backend_output_system_filelist_file", "C-BACKEND-OUTPUT-SYSTEM-FILELIST-FILE", 4, 0, false );
    SubLFiles.declareFunction( me, "c_backend_output_system_directory_make_file_info", "C-BACKEND-OUTPUT-SYSTEM-DIRECTORY-MAKE-FILE-INFO", 5, 0, false );
    SubLFiles.declareFunction( me, "c_backend_output_system_build_index_file", "C-BACKEND-OUTPUT-SYSTEM-BUILD-INDEX-FILE", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_output_system_build_index_libraries", "C-BACKEND-OUTPUT-SYSTEM-BUILD-INDEX-LIBRARIES", 6, 0, false );
    SubLFiles.declareFunction( me, "c_backend_output_system_build_instructions_file", "C-BACKEND-OUTPUT-SYSTEM-BUILD-INSTRUCTIONS-FILE", 3, 0, false );
    SubLFiles.declareFunction( me, "c_backend_system_build_instructions_path_spec", "C-BACKEND-SYSTEM-BUILD-INSTRUCTIONS-PATH-SPEC", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_c_backend_file()
  {
    $anonymous_variable_counter$ = SubLFiles.defparameter( "*ANONYMOUS-VARIABLE-COUNTER*", NIL );
    $c_backend_write_global_definition_as_comment$ = SubLFiles.defparameter( "*C-BACKEND-WRITE-GLOBAL-DEFINITION-AS-COMMENT*", NIL );
    $c_backend_convert_char_map$ = SubLFiles.deflexical( "*C-BACKEND-CONVERT-CHAR-MAP*", $list61 );
    $c_backend_writers$ = SubLFiles.deflexical( "*C-BACKEND-WRITERS*", $list83 );
    $c_backend_volatilize_localsP$ = SubLFiles.defparameter( "*C-BACKEND-VOLATILIZE-LOCALS?*", NIL );
    return NIL;
  }

  public static SubLObject setup_c_backend_file()
  {
    memoization_state.note_memoized_function( $sym55$C_BACKEND_SECURE_LOCAL_ID );
    memoization_state.note_memoized_function( $sym56$C_BACKEND_LOCAL_VARIABLE_NAME );
    memoization_state.note_memoized_function( $sym59$C_BACKEND_COMPUTE_GLOBAL_VARIABLE_NAME );
    memoization_state.note_memoized_function( $sym71$C_BACKEND_COMPUTED_FUNCTION_NAME );
    utilities_macros.note_funcall_helper_function( $sym156$TRANSLATOR_RET_FORM_P );
    utilities_macros.note_funcall_helper_function( $sym157$TRANSLATOR_RET_TO_THROW );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_c_backend_file();
  }

  @Override
  public void initializeVariables()
  {
    init_c_backend_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_c_backend_file();
  }
}
/*
 * 
 * Total time: 1135 ms ~%"); $str20$____A__ = makeString("   ~A~%");
 * $str21$SUBLISP = makeString("SUBLISP"); $list22 =
 * ConsesLow.list((SubLObject)makeKeyword("NONE"),
 * (SubLObject)makeKeyword("MEDIUM")); $str23$___file__________a___ =
 * makeString("   file:        ~a ~%"); $kw24$HIGH = makeKeyword("HIGH");
 * $str25$___created_______4__0D__2__0D__2_ =
 * makeString("   created:     ~4,'0D/~2,'0D/~2,'0D ~2,'0D:~2,'0D:~2,'0D~%");
 * $str26$___source_file___a___ = makeString("   source file: ~a ~%");
 * $str27$___ = makeString(" referenced globals referenced functions container
 * for all constant values in file private globals private functions ");
 * $str147$_f_S_ = makeString("_f~S_"); $sym148$_OPTIONAL =
 * makeSymbol("&OPTIONAL"); $sym149$_REST = makeSymbol("&REST"); $list150 =
 * ConsesLow.list((SubLObject)makeSymbol("VARIABLE"),
 * (SubLObject)makeSymbol("&OPTIONAL"),
 * (SubLObject)makeSymbol("INITIALIZATION"),
 * (SubLObject)makeSymbol("PROVIDED")); $sym151$_NOTE_SUPPLIED =
 * makeSymbol("%NOTE-SUPPLIED"); $sym152$_INIT_OPT_ARG =
 * makeSymbol("%INIT-OPT-ARG"); $list153 =
 * ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("%PC"),
 * (SubLObject)NIL)); $str154$Dp = makeString("Dp"); $str155$_void_ =
 * makeString("(void)"); $sym156$TRANSLATOR_RET_FORM_P =
 * makeSymbol("TRANSLATOR-RET-FORM-P"); $sym157$TRANSLATOR_RET_TO_THROW =
 * makeSymbol("TRANSLATOR-RET-TO-THROW"); $list158 =
 * ConsesLow.list((SubLObject)makeSymbol("QUOTE"),
 * (SubLObject)makeSymbol("%EXIT")); $sym159$ANSWER =
 * makeUninternedSymbol("ANSWER"); $sym160$EXIT_ENV =
 * makeUninternedSymbol("EXIT-ENV"); $sym161$RET = makeSymbol("RET"); $list162 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("EXPRESSION")); $sym163$THROW = makeSymbol("THROW");
 * $sym164$DEFINE_MACROEXPANDER = makeSymbol("DEFINE-MACROEXPANDER");
 * $sym165$DEFLEXICAL = makeSymbol("DEFLEXICAL"); $sym166$DEFPARAMETER =
 * makeSymbol("DEFPARAMETER"); $list167 =
 * ConsesLow.list((SubLObject)makeSymbol("OPERATOR"),
 * (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("ANALYSIS"));
 * $sym168$_DEFSTRUCT_CLASS = makeSymbol("%DEFSTRUCT-CLASS"); $kw169$NAME =
 * makeKeyword("NAME"); $str170$___defstruct__A___ = makeString(" defstruct ~A
 */