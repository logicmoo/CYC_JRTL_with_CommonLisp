package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.PACKAGE_CL;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.PACKAGE_EXT;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.PACKAGE_JAVA;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.PACKAGE_LISP;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.PACKAGE_MOP;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.PACKAGE_SYS;

import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class LispSymbols {


  // External symbols in CL package.
  public static final SubLSymbol AND_ALLOW_OTHER_KEYS =
    PACKAGE_CL.addExternalSymbol("&ALLOW-OTHER-KEYS");
  public static final SubLSymbol AND_AUX =
    PACKAGE_CL.addExternalSymbol("&AUX");
  public static final SubLSymbol AND_BODY =
    PACKAGE_CL.addExternalSymbol("&BODY");
  public static final SubLSymbol AND_ENVIRONMENT =
    PACKAGE_CL.addExternalSymbol("&ENVIRONMENT");
  public static final SubLSymbol AND_KEY =
    PACKAGE_CL.addExternalSymbol("&KEY");
  public static final SubLSymbol AND_OPTIONAL =
    PACKAGE_CL.addExternalSymbol("&OPTIONAL");
  public static final SubLSymbol AND_REST =
    PACKAGE_CL.addExternalSymbol("&REST");
  public static final SubLSymbol AND_WHOLE =
    PACKAGE_CL.addExternalSymbol("&WHOLE");
  public static final SubLSymbol STAR =
    PACKAGE_CL.addExternalSymbol("*");
  public static final SubLSymbol STAR_STAR =
    PACKAGE_CL.addExternalSymbol("**");
  public static final SubLSymbol STAR_STAR_STAR =
    PACKAGE_CL.addExternalSymbol("***");
  public static final SubLSymbol BREAK_ON_SIGNALS =
    PACKAGE_CL.addExternalSymbol("*BREAK-ON-SIGNALS*");
  public static final SubLSymbol _COMPILE_FILE_PATHNAME_ =
    PACKAGE_CL.addExternalSymbol("*COMPILE-FILE-PATHNAME*");
  public static final SubLSymbol COMPILE_FILE_TRUENAME =
    PACKAGE_CL.addExternalSymbol("*COMPILE-FILE-TRUENAME*");
  public static final SubLSymbol COMPILE_PRINT =
    PACKAGE_CL.addExternalSymbol("*COMPILE-PRINT*");
  public static final SubLSymbol COMPILE_VERBOSE =
    PACKAGE_CL.addExternalSymbol("*COMPILE-VERBOSE*");
  public static final SubLSymbol DEBUG_IO =
    PACKAGE_CL.addExternalSymbol("*DEBUG-IO*");
  public static final SubLSymbol DEBUGGER_HOOK =
    PACKAGE_CL.addExternalSymbol("*DEBUGGER-HOOK*");
  public static final SubLSymbol DEFAULT_PATHNAME_DEFAULTS =
    PACKAGE_CL.addExternalSymbol("*DEFAULT-PATHNAME-DEFAULTS*");
  public static final SubLSymbol ERROR_OUTPUT =
    PACKAGE_CL.addExternalSymbol("*ERROR-OUTPUT*");
  public static final SubLSymbol FEATURES =
    PACKAGE_CL.addExternalSymbol("*FEATURES*");
  public static final SubLSymbol GENSYM_COUNTER =
    PACKAGE_CL.addExternalSymbol("*GENSYM-COUNTER*");
  public static final SubLSymbol LOAD_PATHNAME =
    PACKAGE_CL.addExternalSymbol("*LOAD-PATHNAME*");
  public static final SubLSymbol LOAD_PRINT =
    PACKAGE_CL.addExternalSymbol("*LOAD-PRINT*");
  public static final SubLSymbol LOAD_TRUENAME =
    PACKAGE_CL.addExternalSymbol("*LOAD-TRUENAME*");
  public static final SubLSymbol LOAD_VERBOSE =
    PACKAGE_CL.addExternalSymbol("*LOAD-VERBOSE*");
  public static final SubLSymbol MACROEXPAND_HOOK =
    PACKAGE_CL.addExternalSymbol("*MACROEXPAND-HOOK*");
  public static final SubLSymbol MODULES =
    PACKAGE_CL.addExternalSymbol("*MODULES*");
  public static final SubLSymbol _PACKAGE_ =
    PACKAGE_CL.addExternalSymbol("*PACKAGE*");
  public static final SubLSymbol PRINT_ARRAY =
    PACKAGE_CL.addExternalSymbol("*PRINT-ARRAY*");
  public static final SubLSymbol PRINT_BASE =
    PACKAGE_CL.addExternalSymbol("*PRINT-BASE*");
  public static final SubLSymbol PRINT_CASE =
    PACKAGE_CL.addExternalSymbol("*PRINT-CASE*");
  public static final SubLSymbol PRINT_CIRCLE =
    PACKAGE_CL.addExternalSymbol("*PRINT-CIRCLE*");
  public static final SubLSymbol PRINT_ESCAPE =
    PACKAGE_CL.addExternalSymbol("*PRINT-ESCAPE*");
  public static final SubLSymbol PRINT_GENSYM =
    PACKAGE_CL.addExternalSymbol("*PRINT-GENSYM*");
  public static final SubLSymbol PRINT_LENGTH =
    PACKAGE_CL.addExternalSymbol("*PRINT-LENGTH*");
  public static final SubLSymbol PRINT_LEVEL =
    PACKAGE_CL.addExternalSymbol("*PRINT-LEVEL*");
  public static final SubLSymbol PRINT_LINES =
    PACKAGE_CL.addExternalSymbol("*PRINT-LINES*");
  public static final SubLSymbol PRINT_MISER_WIDTH =
    PACKAGE_CL.addExternalSymbol("*PRINT-MISER-WIDTH*");
  public static final SubLSymbol PRINT_PPRINT_DISPATCH =
    PACKAGE_CL.addExternalSymbol("*PRINT-PPRINT-DISPATCH*");
  public static final SubLSymbol PRINT_PRETTY =
    PACKAGE_CL.addExternalSymbol("*PRINT-PRETTY*");
  public static final SubLSymbol PRINT_RADIX =
    PACKAGE_CL.addExternalSymbol("*PRINT-RADIX*");
  public static final SubLSymbol PRINT_READABLY =
    PACKAGE_CL.addExternalSymbol("*PRINT-READABLY*");
  public static final SubLSymbol PRINT_RIGHT_MARGIN =
    PACKAGE_CL.addExternalSymbol("*PRINT-RIGHT-MARGIN*");
  public static final SubLSymbol QUERY_IO =
    PACKAGE_CL.addExternalSymbol("*QUERY-IO*");
  public static final SubLSymbol _RANDOM_STATE_ =
    PACKAGE_CL.addExternalSymbol("*RANDOM-STATE*");
  public static final SubLSymbol READ_BASE =
    PACKAGE_CL.addExternalSymbol("*READ-BASE*");
  public static final SubLSymbol READ_DEFAULT_FLOAT_FORMAT =
    PACKAGE_CL.addExternalSymbol("*READ-DEFAULT-FLOAT-FORMAT*");
  public static final SubLSymbol READ_EVAL =
    PACKAGE_CL.addExternalSymbol("*READ-EVAL*");
  public static final SubLSymbol READ_SUPPRESS =
    PACKAGE_CL.addExternalSymbol("*READ-SUPPRESS*");
  public static final SubLSymbol CURRENT_READTABLE =
    PACKAGE_CL.addExternalSymbol("*READTABLE*");
  public static final SubLSymbol STANDARD_INPUT =
    PACKAGE_CL.addExternalSymbol("*STANDARD-INPUT*");
  public static final SubLSymbol STANDARD_OUTPUT =
    PACKAGE_CL.addExternalSymbol("*STANDARD-OUTPUT*");
  public static final SubLSymbol TERMINAL_IO =
    PACKAGE_CL.addExternalSymbol("*TERMINAL-IO*");
  public static final SubLSymbol TRACE_OUTPUT =
    PACKAGE_CL.addExternalSymbol("*TRACE-OUTPUT*");
  public static final SubLSymbol PLUS =
    PACKAGE_CL.addExternalSymbol("+");
  public static final SubLSymbol PLUS_PLUS =
    PACKAGE_CL.addExternalSymbol("++");
  public static final SubLSymbol PLUS_PLUS_PLUS =
    PACKAGE_CL.addExternalSymbol("+++");
  public static final SubLSymbol MINUS =
    PACKAGE_CL.addExternalSymbol("-");
  public static final SubLSymbol SLASH =
    PACKAGE_CL.addExternalSymbol("/");
  public static final SubLSymbol SLASH_SLASH =
    PACKAGE_CL.addExternalSymbol("//");
  public static final SubLSymbol SLASH_SLASH_SLASH =
    PACKAGE_CL.addExternalSymbol("///");
  public static final SubLSymbol NOT_EQUALS =
    PACKAGE_CL.addExternalSymbol("/=");
  public static final SubLSymbol ONE_PLUS =
    PACKAGE_CL.addExternalSymbol("1+");
  public static final SubLSymbol ONE_MINUS =
    PACKAGE_CL.addExternalSymbol("1-");
  public static final SubLSymbol LT =
    PACKAGE_CL.addExternalSymbol("<");
  public static final SubLSymbol LE =
    PACKAGE_CL.addExternalSymbol("<=");
  public static final SubLSymbol EQUALS =
    PACKAGE_CL.addExternalSymbol("=");
  public static final SubLSymbol GT =
    PACKAGE_CL.addExternalSymbol(">");
  public static final SubLSymbol GE =
    PACKAGE_CL.addExternalSymbol(">=");
  public static final SubLSymbol ABORT =
    PACKAGE_CL.addExternalSymbol("ABORT");
  public static final SubLSymbol ABS =
    PACKAGE_CL.addExternalSymbol("ABS");
  public static final SubLSymbol ACONS =
    PACKAGE_CL.addExternalSymbol("ACONS");
  public static final SubLSymbol ACOS =
    PACKAGE_CL.addExternalSymbol("ACOS");
  public static final SubLSymbol ACOSH =
    PACKAGE_CL.addExternalSymbol("ACOSH");
  public static final SubLSymbol ADD_METHOD =
    PACKAGE_CL.addExternalSymbol("ADD-METHOD");
  public static final SubLSymbol ADJOIN =
    PACKAGE_CL.addExternalSymbol("ADJOIN");
  public static final SubLSymbol ADJUST_ARRAY =
    PACKAGE_CL.addExternalSymbol("ADJUST-ARRAY");
  public static final SubLSymbol ADJUSTABLE_ARRAY_P =
    PACKAGE_CL.addExternalSymbol("ADJUSTABLE-ARRAY-P");
  public static final SubLSymbol ALLOCATE_INSTANCE =
    PACKAGE_CL.addExternalSymbol("ALLOCATE-INSTANCE");
  public static final SubLSymbol ALPHA_CHAR_P =
    PACKAGE_CL.addExternalSymbol("ALPHA-CHAR-P");
  public static final SubLSymbol ALPHANUMERICP =
    PACKAGE_CL.addExternalSymbol("ALPHANUMERICP");
  public static final SubLSymbol AND =
    PACKAGE_CL.addExternalSymbol("AND");
  public static final SubLSymbol APPEND =
    PACKAGE_CL.addExternalSymbol("APPEND");
  public static final SubLSymbol APPLY =
    PACKAGE_CL.addExternalSymbol("APPLY");
  public static final SubLSymbol APROPOS =
    PACKAGE_CL.addExternalSymbol("APROPOS");
  public static final SubLSymbol APROPOS_LIST =
    PACKAGE_CL.addExternalSymbol("APROPOS-LIST");
  public static final SubLSymbol AREF =
    PACKAGE_CL.addExternalSymbol("AREF");
  public static final SubLSymbol ARITHMETIC_ERROR =
    PACKAGE_CL.addExternalSymbol("ARITHMETIC-ERROR");
  public static final SubLSymbol ARITHMETIC_ERROR_OPERANDS =
    PACKAGE_CL.addExternalSymbol("ARITHMETIC-ERROR-OPERANDS");
  public static final SubLSymbol ARITHMETIC_ERROR_OPERATION =
    PACKAGE_CL.addExternalSymbol("ARITHMETIC-ERROR-OPERATION");
  public static final SubLSymbol ARRAY =
    PACKAGE_CL.addExternalSymbol("ARRAY");
  public static final SubLSymbol ARRAY_DIMENSION =
    PACKAGE_CL.addExternalSymbol("ARRAY-DIMENSION");
  public static final SubLSymbol ARRAY_DIMENSION_LIMIT =
    PACKAGE_CL.addExternalSymbol("ARRAY-DIMENSION-LIMIT");
  public static final SubLSymbol ARRAY_DIMENSIONS =
    PACKAGE_CL.addExternalSymbol("ARRAY-DIMENSIONS");
  public static final SubLSymbol ARRAY_DISPLACEMENT =
    PACKAGE_CL.addExternalSymbol("ARRAY-DISPLACEMENT");
  public static final SubLSymbol ARRAY_ELEMENT_TYPE =
    PACKAGE_CL.addExternalSymbol("ARRAY-ELEMENT-TYPE");
  public static final SubLSymbol ARRAY_HAS_FILL_POINTER_P =
    PACKAGE_CL.addExternalSymbol("ARRAY-HAS-FILL-POINTER-P");
  public static final SubLSymbol ARRAY_IN_BOUNDS_P =
    PACKAGE_CL.addExternalSymbol("ARRAY-IN-BOUNDS-P");
  public static final SubLSymbol ARRAY_RANK =
    PACKAGE_CL.addExternalSymbol("ARRAY-RANK");
  public static final SubLSymbol ARRAY_RANK_LIMIT =
    PACKAGE_CL.addExternalSymbol("ARRAY-RANK-LIMIT");
  public static final SubLSymbol ARRAY_ROW_MAJOR_INDEX =
    PACKAGE_CL.addExternalSymbol("ARRAY-ROW-MAJOR-INDEX");
  public static final SubLSymbol ARRAY_TOTAL_SIZE =
    PACKAGE_CL.addExternalSymbol("ARRAY-TOTAL-SIZE");
  public static final SubLSymbol ARRAY_TOTAL_SIZE_LIMIT =
    PACKAGE_CL.addExternalSymbol("ARRAY-TOTAL-SIZE-LIMIT");
  public static final SubLSymbol ARRAYP =
    PACKAGE_CL.addExternalSymbol("ARRAYP");
  public static final SubLSymbol ASH =
    PACKAGE_CL.addExternalSymbol("ASH");
  public static final SubLSymbol ASIN =
    PACKAGE_CL.addExternalSymbol("ASIN");
  public static final SubLSymbol ASINH =
    PACKAGE_CL.addExternalSymbol("ASINH");
  public static final SubLSymbol ASSERT =
    PACKAGE_CL.addExternalSymbol("ASSERT");
  public static final SubLSymbol ASSOC =
    PACKAGE_CL.addExternalSymbol("ASSOC");
  public static final SubLSymbol ASSOC_IF =
    PACKAGE_CL.addExternalSymbol("ASSOC-IF");
  public static final SubLSymbol ASSOC_IF_NOT =
    PACKAGE_CL.addExternalSymbol("ASSOC-IF-NOT");
  public static final SubLSymbol ATAN =
    PACKAGE_CL.addExternalSymbol("ATAN");
  public static final SubLSymbol ATANH =
    PACKAGE_CL.addExternalSymbol("ATANH");
  public static final SubLSymbol ATOM =
    PACKAGE_CL.addExternalSymbol("ATOM");
  public static final SubLSymbol BASE_CHAR =
    PACKAGE_CL.addExternalSymbol("BASE-CHAR");
  public static final SubLSymbol BASE_STRING =
    PACKAGE_CL.addExternalSymbol("BASE-STRING");
  public static final SubLSymbol BIGNUM =
    PACKAGE_CL.addExternalSymbol("BIGNUM");
  public static final SubLSymbol BIT =
    PACKAGE_CL.addExternalSymbol("BIT");
  public static final SubLSymbol BIT_AND =
    PACKAGE_CL.addExternalSymbol("BIT-AND");
  public static final SubLSymbol BIT_ANDC1 =
    PACKAGE_CL.addExternalSymbol("BIT-ANDC1");
  public static final SubLSymbol BIT_ANDC2 =
    PACKAGE_CL.addExternalSymbol("BIT-ANDC2");
  public static final SubLSymbol BIT_EQV =
    PACKAGE_CL.addExternalSymbol("BIT-EQV");
  public static final SubLSymbol BIT_IOR =
    PACKAGE_CL.addExternalSymbol("BIT-IOR");
  public static final SubLSymbol BIT_NAND =
    PACKAGE_CL.addExternalSymbol("BIT-NAND");
  public static final SubLSymbol BIT_NOR =
    PACKAGE_CL.addExternalSymbol("BIT-NOR");
  public static final SubLSymbol BIT_NOT =
    PACKAGE_CL.addExternalSymbol("BIT-NOT");
  public static final SubLSymbol BIT_ORC1 =
    PACKAGE_CL.addExternalSymbol("BIT-ORC1");
  public static final SubLSymbol BIT_ORC2 =
    PACKAGE_CL.addExternalSymbol("BIT-ORC2");
  public static final SubLSymbol BIT_VECTOR =
    PACKAGE_CL.addExternalSymbol("BIT-VECTOR");
  public static final SubLSymbol BIT_VECTOR_P =
    PACKAGE_CL.addExternalSymbol("BIT-VECTOR-P");
  public static final SubLSymbol BIT_XOR =
    PACKAGE_CL.addExternalSymbol("BIT-XOR");
  public static final SubLSymbol BLOCK =
    PACKAGE_CL.addExternalSymbol("BLOCK");
  public static final SubLSymbol BOOLE =
    PACKAGE_CL.addExternalSymbol("BOOLE");
  public static final SubLSymbol BOOLE_1 =
    PACKAGE_CL.addExternalSymbol("BOOLE-1");
  public static final SubLSymbol BOOLE_2 =
    PACKAGE_CL.addExternalSymbol("BOOLE-2");
  public static final SubLSymbol BOOLE_AND =
    PACKAGE_CL.addExternalSymbol("BOOLE-AND");
  public static final SubLSymbol BOOLE_ANDC1 =
    PACKAGE_CL.addExternalSymbol("BOOLE-ANDC1");
  public static final SubLSymbol BOOLE_ANDC2 =
    PACKAGE_CL.addExternalSymbol("BOOLE-ANDC2");
  public static final SubLSymbol BOOLE_C1 =
    PACKAGE_CL.addExternalSymbol("BOOLE-C1");
  public static final SubLSymbol BOOLE_C2 =
    PACKAGE_CL.addExternalSymbol("BOOLE-C2");
  public static final SubLSymbol BOOLE_CLR =
    PACKAGE_CL.addExternalSymbol("BOOLE-CLR");
  public static final SubLSymbol BOOLE_EQV =
    PACKAGE_CL.addExternalSymbol("BOOLE-EQV");
  public static final SubLSymbol BOOLE_IOR =
    PACKAGE_CL.addExternalSymbol("BOOLE-IOR");
  public static final SubLSymbol BOOLE_NAND =
    PACKAGE_CL.addExternalSymbol("BOOLE-NAND");
  public static final SubLSymbol BOOLE_NOR =
    PACKAGE_CL.addExternalSymbol("BOOLE-NOR");
  public static final SubLSymbol BOOLE_ORC1 =
    PACKAGE_CL.addExternalSymbol("BOOLE-ORC1");
  public static final SubLSymbol BOOLE_ORC2 =
    PACKAGE_CL.addExternalSymbol("BOOLE-ORC2");
  public static final SubLSymbol BOOLE_SET =
    PACKAGE_CL.addExternalSymbol("BOOLE-SET");
  public static final SubLSymbol BOOLE_XOR =
    PACKAGE_CL.addExternalSymbol("BOOLE-XOR");
  public static final SubLSymbol BOOLEAN =
    PACKAGE_CL.addExternalSymbol("BOOLEAN");
  public static final SubLSymbol BOTH_CASE_P =
    PACKAGE_CL.addExternalSymbol("BOTH-CASE-P");
  public static final SubLSymbol BOUNDP =
    PACKAGE_CL.addExternalSymbol("BOUNDP");
  public static final SubLSymbol BREAK =
    PACKAGE_CL.addExternalSymbol("BREAK");
  public static final SubLSymbol BROADCAST_STREAM =
    PACKAGE_CL.addExternalSymbol("BROADCAST-STREAM");
  public static final SubLSymbol BROADCAST_STREAM_STREAMS =
    PACKAGE_CL.addExternalSymbol("BROADCAST-STREAM-STREAMS");
  public static final SubLSymbol BUILT_IN_CLASS =
    PACKAGE_CL.addExternalSymbol("BUILT-IN-CLASS");
  public static final SubLSymbol BUTLAST =
    PACKAGE_CL.addExternalSymbol("BUTLAST");
  public static final SubLSymbol BYTE =
    PACKAGE_CL.addExternalSymbol("BYTE");
  public static final SubLSymbol BYTE_POSITION =
    PACKAGE_CL.addExternalSymbol("BYTE-POSITION");
  public static final SubLSymbol BYTE_SIZE =
    PACKAGE_CL.addExternalSymbol("BYTE-SIZE");
  public static final SubLSymbol CAAAAR =
    PACKAGE_CL.addExternalSymbol("CAAAAR");
  public static final SubLSymbol CAAADR =
    PACKAGE_CL.addExternalSymbol("CAAADR");
  public static final SubLSymbol CAAAR =
    PACKAGE_CL.addExternalSymbol("CAAAR");
  public static final SubLSymbol CAADAR =
    PACKAGE_CL.addExternalSymbol("CAADAR");
  public static final SubLSymbol CAADDR =
    PACKAGE_CL.addExternalSymbol("CAADDR");
  public static final SubLSymbol CAADR =
    PACKAGE_CL.addExternalSymbol("CAADR");
  public static final SubLSymbol CAAR =
    PACKAGE_CL.addExternalSymbol("CAAR");
  public static final SubLSymbol CADAAR =
    PACKAGE_CL.addExternalSymbol("CADAAR");
  public static final SubLSymbol CADADR =
    PACKAGE_CL.addExternalSymbol("CADADR");
  public static final SubLSymbol CADAR =
    PACKAGE_CL.addExternalSymbol("CADAR");
  public static final SubLSymbol CADDAR =
    PACKAGE_CL.addExternalSymbol("CADDAR");
  public static final SubLSymbol CADDDR =
    PACKAGE_CL.addExternalSymbol("CADDDR");
  public static final SubLSymbol CADDR =
    PACKAGE_CL.addExternalSymbol("CADDR");
  public static final SubLSymbol CADR =
    PACKAGE_CL.addExternalSymbol("CADR");
  public static final SubLSymbol CALL_ARGUMENTS_LIMIT =
    PACKAGE_CL.addExternalSymbol("CALL-ARGUMENTS-LIMIT");
  public static final SubLSymbol CALL_METHOD =
    PACKAGE_CL.addExternalSymbol("CALL-METHOD");
  public static final SubLSymbol CALL_NEXT_METHOD =
    PACKAGE_CL.addExternalSymbol("CALL-NEXT-METHOD");
  public static final SubLSymbol CAR =
    PACKAGE_CL.addExternalSymbol("CAR");
  public static final SubLSymbol CASE =
    PACKAGE_CL.addExternalSymbol("CASE");
  public static final SubLSymbol CATCH =
    PACKAGE_CL.addExternalSymbol("CATCH");
  public static final SubLSymbol CCASE =
    PACKAGE_CL.addExternalSymbol("CCASE");
  public static final SubLSymbol CDAAAR =
    PACKAGE_CL.addExternalSymbol("CDAAAR");
  public static final SubLSymbol CDAADR =
    PACKAGE_CL.addExternalSymbol("CDAADR");
  public static final SubLSymbol CDAAR =
    PACKAGE_CL.addExternalSymbol("CDAAR");
  public static final SubLSymbol CDADAR =
    PACKAGE_CL.addExternalSymbol("CDADAR");
  public static final SubLSymbol CDADDR =
    PACKAGE_CL.addExternalSymbol("CDADDR");
  public static final SubLSymbol CDADR =
    PACKAGE_CL.addExternalSymbol("CDADR");
  public static final SubLSymbol CDAR =
    PACKAGE_CL.addExternalSymbol("CDAR");
  public static final SubLSymbol CDDAAR =
    PACKAGE_CL.addExternalSymbol("CDDAAR");
  public static final SubLSymbol CDDADR =
    PACKAGE_CL.addExternalSymbol("CDDADR");
  public static final SubLSymbol CDDAR =
    PACKAGE_CL.addExternalSymbol("CDDAR");
  public static final SubLSymbol CDDDAR =
    PACKAGE_CL.addExternalSymbol("CDDDAR");
  public static final SubLSymbol CDDDDR =
    PACKAGE_CL.addExternalSymbol("CDDDDR");
  public static final SubLSymbol CDDDR =
    PACKAGE_CL.addExternalSymbol("CDDDR");
  public static final SubLSymbol CDDR =
    PACKAGE_CL.addExternalSymbol("CDDR");
  public static final SubLSymbol CDR =
    PACKAGE_CL.addExternalSymbol("CDR");
  public static final SubLSymbol CEILING =
    PACKAGE_CL.addExternalSymbol("CEILING");
  public static final SubLSymbol CELL_ERROR =
    PACKAGE_CL.addExternalSymbol("CELL-ERROR");
  public static final SubLSymbol CELL_ERROR_NAME =
    PACKAGE_CL.addExternalSymbol("CELL-ERROR-NAME");
  public static final SubLSymbol CERROR =
    PACKAGE_CL.addExternalSymbol("CERROR");
  public static final SubLSymbol CHANGE_CLASS =
    PACKAGE_CL.addExternalSymbol("CHANGE-CLASS");
  public static final SubLSymbol CHAR =
    PACKAGE_CL.addExternalSymbol("CHAR");
  public static final SubLSymbol CHAR_CODE =
    PACKAGE_CL.addExternalSymbol("CHAR-CODE");
  public static final SubLSymbol CHAR_CODE_LIMIT =
    PACKAGE_CL.addExternalSymbol("CHAR-CODE-LIMIT");
  public static final SubLSymbol CHAR_DOWNCASE =
    PACKAGE_CL.addExternalSymbol("CHAR-DOWNCASE");
  public static final SubLSymbol CHAR_EQUAL =
    PACKAGE_CL.addExternalSymbol("CHAR-EQUAL");
  public static final SubLSymbol CHAR_GREATERP =
    PACKAGE_CL.addExternalSymbol("CHAR-GREATERP");
  public static final SubLSymbol CHAR_INT =
    PACKAGE_CL.addExternalSymbol("CHAR-INT");
  public static final SubLSymbol CHAR_LESSP =
    PACKAGE_CL.addExternalSymbol("CHAR-LESSP");
  public static final SubLSymbol CHAR_NAME =
    PACKAGE_CL.addExternalSymbol("CHAR-NAME");
  public static final SubLSymbol CHAR_NOT_EQUAL =
    PACKAGE_CL.addExternalSymbol("CHAR-NOT-EQUAL");
  public static final SubLSymbol CHAR_NOT_GREATERP =
    PACKAGE_CL.addExternalSymbol("CHAR-NOT-GREATERP");
  public static final SubLSymbol CHAR_NOT_LESSP =
    PACKAGE_CL.addExternalSymbol("CHAR-NOT-LESSP");
  public static final SubLSymbol CHAR_UPCASE =
    PACKAGE_CL.addExternalSymbol("CHAR-UPCASE");
  public static final SubLSymbol CHAR_NE =
    PACKAGE_CL.addExternalSymbol("CHAR/=");
  public static final SubLSymbol CHAR_LT =
    PACKAGE_CL.addExternalSymbol("CHAR<");
  public static final SubLSymbol CHAR_LE =
    PACKAGE_CL.addExternalSymbol("CHAR<=");
  public static final SubLSymbol CHAR_EQUALS =
    PACKAGE_CL.addExternalSymbol("CHAR=");
  public static final SubLSymbol CHAR_GT =
    PACKAGE_CL.addExternalSymbol("CHAR>");
  public static final SubLSymbol CHAR_GE =
    PACKAGE_CL.addExternalSymbol("CHAR>=");
  public static final SubLSymbol CHARACTER =
    PACKAGE_CL.addExternalSymbol("CHARACTER");
  public static final SubLSymbol CHARACTERP =
    PACKAGE_CL.addExternalSymbol("CHARACTERP");
  public static final SubLSymbol CHECK_TYPE =
    PACKAGE_CL.addExternalSymbol("CHECK-TYPE");
  public static final SubLSymbol CIS =
    PACKAGE_CL.addExternalSymbol("CIS");
  public static final SubLSymbol CLASS =
    PACKAGE_CL.addExternalSymbol("CLASS");
  public static final SubLSymbol CLASS_NAME =
    PACKAGE_CL.addExternalSymbol("CLASS-NAME");
  public static final SubLSymbol CLASS_OF =
    PACKAGE_CL.addExternalSymbol("CLASS-OF");
  public static final SubLSymbol CLEAR_INPUT =
    PACKAGE_CL.addExternalSymbol("CLEAR-INPUT");
  public static final SubLSymbol CLEAR_OUTPUT =
    PACKAGE_CL.addExternalSymbol("CLEAR-OUTPUT");
  public static final SubLSymbol CLOSE =
    PACKAGE_CL.addExternalSymbol("CLOSE");
  public static final SubLSymbol CLRHASH =
    PACKAGE_CL.addExternalSymbol("CLRHASH");
  public static final SubLSymbol CODE_CHAR =
    PACKAGE_CL.addExternalSymbol("CODE-CHAR");
  public static final SubLSymbol COERCE =
    PACKAGE_CL.addExternalSymbol("COERCE");
  public static final SubLSymbol COMPILATION_SPEED =
    PACKAGE_CL.addExternalSymbol("COMPILATION-SPEED");
  public static final SubLSymbol COMPILE =
    PACKAGE_CL.addExternalSymbol("COMPILE");
  public static final SubLSymbol COMPILE_FILE =
    PACKAGE_CL.addExternalSymbol("COMPILE-FILE");
  public static final SubLSymbol COMPILE_FILE_PATHNAME =
    PACKAGE_CL.addExternalSymbol("COMPILE-FILE-PATHNAME");
  public static final SubLSymbol COMPILED_FUNCTION =
    PACKAGE_CL.addExternalSymbol("COMPILED-FUNCTION");
  public static final SubLSymbol COMPILED_FUNCTION_P =
    PACKAGE_CL.addExternalSymbol("COMPILED-FUNCTION-P");
  public static final SubLSymbol COMPILER_MACRO =
    PACKAGE_CL.addExternalSymbol("COMPILER-MACRO");
  public static final SubLSymbol COMPILER_MACRO_FUNCTION =
    PACKAGE_CL.addExternalSymbol("COMPILER-MACRO-FUNCTION");
  public static final SubLSymbol COMPLEMENT =
    PACKAGE_CL.addExternalSymbol("COMPLEMENT");
  public static final SubLSymbol COMPLEX =
    PACKAGE_CL.addExternalSymbol("COMPLEX");
  public static final SubLSymbol COMPLEXP =
    PACKAGE_CL.addExternalSymbol("COMPLEXP");
  public static final SubLSymbol COMPUTE_APPLICABLE_METHODS =
    PACKAGE_CL.addExternalSymbol("COMPUTE-APPLICABLE-METHODS");
  public static final SubLSymbol COMPUTE_RESTARTS =
    PACKAGE_CL.addExternalSymbol("COMPUTE-RESTARTS");
  public static final SubLSymbol CONCATENATE =
    PACKAGE_CL.addExternalSymbol("CONCATENATE");
  public static final SubLSymbol CONCATENATED_STREAM =
    PACKAGE_CL.addExternalSymbol("CONCATENATED-STREAM");
  public static final SubLSymbol CONCATENATED_STREAM_STREAMS =
    PACKAGE_CL.addExternalSymbol("CONCATENATED-STREAM-STREAMS");
  public static final SubLSymbol COND =
    PACKAGE_CL.addExternalSymbol("COND");
  public static final SubLSymbol CONDITION =
    PACKAGE_CL.addExternalSymbol("CONDITION");
  public static final SubLSymbol CONJUGATE =
    PACKAGE_CL.addExternalSymbol("CONJUGATE");
  public static final SubLSymbol CONS =
    PACKAGE_CL.addExternalSymbol("CONS");
  public static final SubLSymbol CONSP =
    PACKAGE_CL.addExternalSymbol("CONSP");
  public static final SubLSymbol CONSTANTLY =
    PACKAGE_CL.addExternalSymbol("CONSTANTLY");
  public static final SubLSymbol CONSTANTP =
    PACKAGE_CL.addExternalSymbol("CONSTANTP");
  public static final SubLSymbol CONTINUE =
    PACKAGE_CL.addExternalSymbol("CONTINUE");
  public static final SubLSymbol CONTROL_ERROR =
    PACKAGE_CL.addExternalSymbol("CONTROL-ERROR");
  public static final SubLSymbol COPY_ALIST =
    PACKAGE_CL.addExternalSymbol("COPY-ALIST");
  public static final SubLSymbol COPY_LIST =
    PACKAGE_CL.addExternalSymbol("COPY-LIST");
  public static final SubLSymbol COPY_PPRINT_DISPATCH =
    PACKAGE_CL.addExternalSymbol("COPY-PPRINT-DISPATCH");
  public static final SubLSymbol COPY_READTABLE =
    PACKAGE_CL.addExternalSymbol("COPY-READTABLE");
  public static final SubLSymbol COPY_SEQ =
    PACKAGE_CL.addExternalSymbol("COPY-SEQ");
  public static final SubLSymbol COPY_STRUCTURE =
    PACKAGE_CL.addExternalSymbol("COPY-STRUCTURE");
  public static final SubLSymbol COPY_SYMBOL =
    PACKAGE_CL.addExternalSymbol("COPY-SYMBOL");
  public static final SubLSymbol COPY_TREE =
    PACKAGE_CL.addExternalSymbol("COPY-TREE");
  public static final SubLSymbol COS =
    PACKAGE_CL.addExternalSymbol("COS");
  public static final SubLSymbol COSH =
    PACKAGE_CL.addExternalSymbol("COSH");
  public static final SubLSymbol COUNT =
    PACKAGE_CL.addExternalSymbol("COUNT");
  public static final SubLSymbol COUNT_IF =
    PACKAGE_CL.addExternalSymbol("COUNT-IF");
  public static final SubLSymbol COUNT_IF_NOT =
    PACKAGE_CL.addExternalSymbol("COUNT-IF-NOT");
  public static final SubLSymbol CTYPECASE =
    PACKAGE_CL.addExternalSymbol("CTYPECASE");
  public static final SubLSymbol DEBUG =
    PACKAGE_CL.addExternalSymbol("DEBUG");
  public static final SubLSymbol DECF =
    PACKAGE_CL.addExternalSymbol("DECF");
  public static final SubLSymbol DECLAIM =
    PACKAGE_CL.addExternalSymbol("DECLAIM");
  public static final SubLSymbol DECLARATION =
    PACKAGE_CL.addExternalSymbol("DECLARATION");
  public static final SubLSymbol DECLARE =
    PACKAGE_CL.addExternalSymbol("DECLARE");
  public static final SubLSymbol DECODE_FLOAT =
    PACKAGE_CL.addExternalSymbol("DECODE-FLOAT");
  public static final SubLSymbol DECODE_UNIVERSAL_TIME =
    PACKAGE_CL.addExternalSymbol("DECODE-UNIVERSAL-TIME");
  public static final SubLSymbol DEFCLASS =
    PACKAGE_CL.addExternalSymbol("DEFCLASS");
  public static final SubLSymbol DEFCONSTANT =
    PACKAGE_CL.addExternalSymbol("DEFCONSTANT");
  public static final SubLSymbol DEFGENERIC =
    PACKAGE_CL.addExternalSymbol("DEFGENERIC");
  public static final SubLSymbol DEFINE_COMPILER_MACRO =
    PACKAGE_CL.addExternalSymbol("DEFINE-COMPILER-MACRO");
  public static final SubLSymbol DEFINE_CONDITION =
    PACKAGE_CL.addExternalSymbol("DEFINE-CONDITION");
  public static final SubLSymbol DEFINE_METHOD_COMBINATION =
    PACKAGE_CL.addExternalSymbol("DEFINE-METHOD-COMBINATION");
  public static final SubLSymbol DEFINE_MODIFY_MACRO =
    PACKAGE_CL.addExternalSymbol("DEFINE-MODIFY-MACRO");
  public static final SubLSymbol DEFINE_SETF_EXPANDER =
    PACKAGE_CL.addExternalSymbol("DEFINE-SETF-EXPANDER");
  public static final SubLSymbol DEFINE_SYMBOL_MACRO =
    PACKAGE_CL.addExternalSymbol("DEFINE-SYMBOL-MACRO");
  public static final SubLSymbol DEFMACRO =
    PACKAGE_CL.addExternalSymbol("DEFMACRO");
  public static final SubLSymbol DEFMETHOD =
    PACKAGE_CL.addExternalSymbol("DEFMETHOD");
  public static final SubLSymbol DEFPACKAGE =
    PACKAGE_CL.addExternalSymbol("DEFPACKAGE");
  public static final SubLSymbol DEFPARAMETER =
    PACKAGE_CL.addExternalSymbol("DEFPARAMETER");
  public static final SubLSymbol DEFSETF =
    PACKAGE_CL.addExternalSymbol("DEFSETF");
  public static final SubLSymbol DEFSTRUCT =
    PACKAGE_CL.addExternalSymbol("DEFSTRUCT");
  public static final SubLSymbol DEFTYPE =
    PACKAGE_CL.addExternalSymbol("DEFTYPE");
  public static final SubLSymbol DEFUN =
    PACKAGE_CL.addExternalSymbol("DEFUN");
  public static final SubLSymbol DEFVAR =
    PACKAGE_CL.addExternalSymbol("DEFVAR");
  public static final SubLSymbol DELETE =
    PACKAGE_CL.addExternalSymbol("DELETE");
  public static final SubLSymbol DELETE_DUPLICATES =
    PACKAGE_CL.addExternalSymbol("DELETE-DUPLICATES");
  public static final SubLSymbol DELETE_FILE =
    PACKAGE_CL.addExternalSymbol("DELETE-FILE");
  public static final SubLSymbol DELETE_IF =
    PACKAGE_CL.addExternalSymbol("DELETE-IF");
  public static final SubLSymbol DELETE_IF_NOT =
    PACKAGE_CL.addExternalSymbol("DELETE-IF-NOT");
  public static final SubLSymbol DELETE_PACKAGE =
    PACKAGE_CL.addExternalSymbol("DELETE-PACKAGE");
  public static final SubLSymbol DENOMINATOR =
    PACKAGE_CL.addExternalSymbol("DENOMINATOR");
  public static final SubLSymbol DEPOSIT_FIELD =
    PACKAGE_CL.addExternalSymbol("DEPOSIT-FIELD");
  public static final SubLSymbol DESCRIBE =
    PACKAGE_CL.addExternalSymbol("DESCRIBE");
  public static final SubLSymbol DESCRIBE_OBJECT =
    PACKAGE_CL.addExternalSymbol("DESCRIBE-OBJECT");
  public static final SubLSymbol DESTRUCTURING_BIND =
    PACKAGE_CL.addExternalSymbol("DESTRUCTURING-BIND");
  public static final SubLSymbol DIGIT_CHAR =
    PACKAGE_CL.addExternalSymbol("DIGIT-CHAR");
  public static final SubLSymbol DIGIT_CHAR_P =
    PACKAGE_CL.addExternalSymbol("DIGIT-CHAR-P");
  public static final SubLSymbol DIRECTORY =
    PACKAGE_CL.addExternalSymbol("DIRECTORY");
  public static final SubLSymbol DIRECTORY_NAMESTRING =
    PACKAGE_CL.addExternalSymbol("DIRECTORY-NAMESTRING");
  public static final SubLSymbol DISASSEMBLE =
    PACKAGE_CL.addExternalSymbol("DISASSEMBLE");
  public static final SubLSymbol DIVISION_BY_ZERO =
    PACKAGE_CL.addExternalSymbol("DIVISION-BY-ZERO");
  public static final SubLSymbol DO =
    PACKAGE_CL.addExternalSymbol("DO");
  public static final SubLSymbol DO_STAR =
    PACKAGE_CL.addExternalSymbol("DO*");
  public static final SubLSymbol DO_ALL_SYMBOLS =
    PACKAGE_CL.addExternalSymbol("DO-ALL-SYMBOLS");
  public static final SubLSymbol DO_EXTERNAL_SYMBOLS =
    PACKAGE_CL.addExternalSymbol("DO-EXTERNAL-SYMBOLS");
  public static final SubLSymbol DO_SYMBOLS =
    PACKAGE_CL.addExternalSymbol("DO-SYMBOLS");
  public static final SubLSymbol DOCUMENTATION =
    PACKAGE_CL.addExternalSymbol("DOCUMENTATION");
  public static final SubLSymbol DOLIST =
    PACKAGE_CL.addExternalSymbol("DOLIST");
  public static final SubLSymbol DOTIMES =
    PACKAGE_CL.addExternalSymbol("DOTIMES");
  public static final SubLSymbol DOUBLE_FLOAT =
    PACKAGE_CL.addExternalSymbol("DOUBLE-FLOAT");
  public static final SubLSymbol DOUBLE_FLOAT_EPSILON =
    PACKAGE_CL.addExternalSymbol("DOUBLE-FLOAT-EPSILON");
  public static final SubLSymbol DOUBLE_FLOAT_NEGATIVE_EPSILON =
    PACKAGE_CL.addExternalSymbol("DOUBLE-FLOAT-NEGATIVE-EPSILON");
  public static final SubLSymbol DPB =
    PACKAGE_CL.addExternalSymbol("DPB");
  public static final SubLSymbol DRIBBLE =
    PACKAGE_CL.addExternalSymbol("DRIBBLE");
  public static final SubLSymbol DYNAMIC_EXTENT =
    PACKAGE_CL.addExternalSymbol("DYNAMIC-EXTENT");
  public static final SubLSymbol ECASE =
    PACKAGE_CL.addExternalSymbol("ECASE");
  public static final SubLSymbol ECHO_STREAM =
    PACKAGE_CL.addExternalSymbol("ECHO-STREAM");
  public static final SubLSymbol ECHO_STREAM_INPUT_STREAM =
    PACKAGE_CL.addExternalSymbol("ECHO-STREAM-INPUT-STREAM");
  public static final SubLSymbol ECHO_STREAM_OUTPUT_STREAM =
    PACKAGE_CL.addExternalSymbol("ECHO-STREAM-OUTPUT-STREAM");
  public static final SubLSymbol ED =
    PACKAGE_CL.addExternalSymbol("ED");
  public static final SubLSymbol EIGHTH =
    PACKAGE_CL.addExternalSymbol("EIGHTH");
  public static final SubLSymbol ELT =
    PACKAGE_CL.addExternalSymbol("ELT");
  public static final SubLSymbol ENCODE_UNIVERSAL_TIME =
    PACKAGE_CL.addExternalSymbol("ENCODE-UNIVERSAL-TIME");
  public static final SubLSymbol END_OF_FILE =
    PACKAGE_CL.addExternalSymbol("END-OF-FILE");
  public static final SubLSymbol ENDP =
    PACKAGE_CL.addExternalSymbol("ENDP");
  public static final SubLSymbol ENOUGH_NAMESTRING =
    PACKAGE_CL.addExternalSymbol("ENOUGH-NAMESTRING");
  public static final SubLSymbol ENSURE_DIRECTORIES_EXIST =
    PACKAGE_CL.addExternalSymbol("ENSURE-DIRECTORIES-EXIST");
  public static final SubLSymbol ENSURE_GENERIC_FUNCTION =
    PACKAGE_CL.addExternalSymbol("ENSURE-GENERIC-FUNCTION");
  public static final SubLSymbol EQ =
    PACKAGE_CL.addExternalSymbol("EQ");
  public static final SubLSymbol EQL =
    PACKAGE_CL.addExternalSymbol("EQL");
  public static final SubLSymbol EQUAL =
    PACKAGE_CL.addExternalSymbol("EQUAL");
  public static final SubLSymbol EQUALP =
    PACKAGE_CL.addExternalSymbol("EQUALP");
  public static final SubLSymbol ERROR =
    PACKAGE_CL.addExternalSymbol("ERROR");
  public static final SubLSymbol ETYPECASE =
    PACKAGE_CL.addExternalSymbol("ETYPECASE");
  public static final SubLSymbol EVAL =
    PACKAGE_CL.addExternalSymbol("EVAL");
  public static final SubLSymbol EVAL_WHEN =
    PACKAGE_CL.addExternalSymbol("EVAL-WHEN");
  public static final SubLSymbol EVENP =
    PACKAGE_CL.addExternalSymbol("EVENP");
  public static final SubLSymbol EVERY =
    PACKAGE_CL.addExternalSymbol("EVERY");
  public static final SubLSymbol EXP =
    PACKAGE_CL.addExternalSymbol("EXP");
  public static final SubLSymbol EXPORT =
    PACKAGE_CL.addExternalSymbol("EXPORT");
  public static final SubLSymbol EXPT =
    PACKAGE_CL.addExternalSymbol("EXPT");
  public static final SubLSymbol EXTENDED_CHAR =
    PACKAGE_CL.addExternalSymbol("EXTENDED-CHAR");
  public static final SubLSymbol FBOUNDP =
    PACKAGE_CL.addExternalSymbol("FBOUNDP");
  public static final SubLSymbol FCEILING =
    PACKAGE_CL.addExternalSymbol("FCEILING");
  public static final SubLSymbol FDEFINITION =
    PACKAGE_CL.addExternalSymbol("FDEFINITION");
  public static final SubLSymbol FFLOOR =
    PACKAGE_CL.addExternalSymbol("FFLOOR");
  public static final SubLSymbol FIFTH =
    PACKAGE_CL.addExternalSymbol("FIFTH");
  public static final SubLSymbol FILE_AUTHOR =
    PACKAGE_CL.addExternalSymbol("FILE-AUTHOR");
  public static final SubLSymbol FILE_ERROR =
    PACKAGE_CL.addExternalSymbol("FILE-ERROR");
  public static final SubLSymbol FILE_ERROR_PATHNAME =
    PACKAGE_CL.addExternalSymbol("FILE-ERROR-PATHNAME");
  public static final SubLSymbol FILE_LENGTH =
    PACKAGE_CL.addExternalSymbol("FILE-LENGTH");
  public static final SubLSymbol FILE_NAMESTRING =
    PACKAGE_CL.addExternalSymbol("FILE-NAMESTRING");
  public static final SubLSymbol FILE_POSITION =
    PACKAGE_CL.addExternalSymbol("FILE-POSITION");
  public static final SubLSymbol FILE_STREAM =
    PACKAGE_CL.addExternalSymbol("FILE-STREAM");
  public static final SubLSymbol FILE_STRING_LENGTH =
    PACKAGE_CL.addExternalSymbol("FILE-STRING-LENGTH");
  public static final SubLSymbol FILE_WRITE_DATE =
    PACKAGE_CL.addExternalSymbol("FILE-WRITE-DATE");
  public static final SubLSymbol FILL =
    PACKAGE_CL.addExternalSymbol("FILL");
  public static final SubLSymbol FILL_POINTER =
    PACKAGE_CL.addExternalSymbol("FILL-POINTER");
  public static final SubLSymbol FIND =
    PACKAGE_CL.addExternalSymbol("FIND");
  public static final SubLSymbol FIND_ALL_SYMBOLS =
    PACKAGE_CL.addExternalSymbol("FIND-ALL-SYMBOLS");
  public static final SubLSymbol FIND_CLASS =
    PACKAGE_CL.addExternalSymbol("FIND-CLASS");
  public static final SubLSymbol FIND_IF =
    PACKAGE_CL.addExternalSymbol("FIND-IF");
  public static final SubLSymbol FIND_IF_NOT =
    PACKAGE_CL.addExternalSymbol("FIND-IF-NOT");
  public static final SubLSymbol FIND_METHOD =
    PACKAGE_CL.addExternalSymbol("FIND-METHOD");
  public static final SubLSymbol FIND_PACKAGE =
    PACKAGE_CL.addExternalSymbol("FIND-PACKAGE");
  public static final SubLSymbol FIND_RESTART =
    PACKAGE_CL.addExternalSymbol("FIND-RESTART");
  public static final SubLSymbol FIND_SYMBOL =
    PACKAGE_CL.addExternalSymbol("FIND-SYMBOL");
  public static final SubLSymbol FINISH_OUTPUT =
    PACKAGE_CL.addExternalSymbol("FINISH-OUTPUT");
  public static final SubLSymbol FIRST =
    PACKAGE_CL.addExternalSymbol("FIRST");
  public static final SubLSymbol FIXNUM =
    PACKAGE_CL.addExternalSymbol("FIXNUM");
  public static final SubLSymbol FLET =
    PACKAGE_CL.addExternalSymbol("FLET");
  public static final SubLSymbol FLOAT =
    PACKAGE_CL.addExternalSymbol("FLOAT");
  public static final SubLSymbol FLOAT_DIGITS =
    PACKAGE_CL.addExternalSymbol("FLOAT-DIGITS");
  public static final SubLSymbol FLOAT_PRECISION =
    PACKAGE_CL.addExternalSymbol("FLOAT-PRECISION");
  public static final SubLSymbol FLOAT_RADIX =
    PACKAGE_CL.addExternalSymbol("FLOAT-RADIX");
  public static final SubLSymbol FLOAT_SIGN =
    PACKAGE_CL.addExternalSymbol("FLOAT-SIGN");
  public static final SubLSymbol FLOATING_POINT_INEXACT =
    PACKAGE_CL.addExternalSymbol("FLOATING-POINT-INEXACT");
  public static final SubLSymbol FLOATING_POINT_INVALID_OPERATION =
    PACKAGE_CL.addExternalSymbol("FLOATING-POINT-INVALID-OPERATION");
  public static final SubLSymbol FLOATING_POINT_OVERFLOW =
    PACKAGE_CL.addExternalSymbol("FLOATING-POINT-OVERFLOW");
  public static final SubLSymbol FLOATING_POINT_UNDERFLOW =
    PACKAGE_CL.addExternalSymbol("FLOATING-POINT-UNDERFLOW");
  public static final SubLSymbol FLOATP =
    PACKAGE_CL.addExternalSymbol("FLOATP");
  public static final SubLSymbol FLOOR =
    PACKAGE_CL.addExternalSymbol("FLOOR");
  public static final SubLSymbol FMAKUNBOUND =
    PACKAGE_CL.addExternalSymbol("FMAKUNBOUND");
  public static final SubLSymbol FORCE_OUTPUT =
    PACKAGE_CL.addExternalSymbol("FORCE-OUTPUT");
  public static final SubLSymbol FORMAT =
    PACKAGE_CL.addExternalSymbol("FORMAT");
  public static final SubLSymbol FORMATTER =
    PACKAGE_CL.addExternalSymbol("FORMATTER");
  public static final SubLSymbol FOURTH =
    PACKAGE_CL.addExternalSymbol("FOURTH");
  public static final SubLSymbol FRESH_LINE =
    PACKAGE_CL.addExternalSymbol("FRESH-LINE");
  public static final SubLSymbol FROUND =
    PACKAGE_CL.addExternalSymbol("FROUND");
  public static final SubLSymbol FTRUNCATE =
    PACKAGE_CL.addExternalSymbol("FTRUNCATE");
  public static final SubLSymbol FTYPE =
    PACKAGE_CL.addExternalSymbol("FTYPE");
  public static final SubLSymbol FUNCALL =
    PACKAGE_CL.addExternalSymbol("FUNCALL");
  public static final SubLSymbol FUNCTION =
    PACKAGE_CL.addExternalSymbol("FUNCTION");
  public static final SubLSymbol FUNCTION_KEYWORDS =
    PACKAGE_CL.addExternalSymbol("FUNCTION-KEYWORDS");
  public static final SubLSymbol FUNCTION_LAMBDA_EXPRESSION =
    PACKAGE_CL.addExternalSymbol("FUNCTION-LAMBDA-EXPRESSION");
  public static final SubLSymbol FUNCTIONP =
    PACKAGE_CL.addExternalSymbol("FUNCTIONP");
  public static final SubLSymbol GCD =
    PACKAGE_CL.addExternalSymbol("GCD");
  public static final SubLSymbol GENERIC_FUNCTION =
    PACKAGE_CL.addExternalSymbol("GENERIC-FUNCTION");
  public static final SubLSymbol GENSYM =
    PACKAGE_CL.addExternalSymbol("GENSYM");
  public static final SubLSymbol GENTEMP =
    PACKAGE_CL.addExternalSymbol("GENTEMP");
  public static final SubLSymbol GET =
    PACKAGE_CL.addExternalSymbol("GET");
  public static final SubLSymbol GET_DECODED_TIME =
    PACKAGE_CL.addExternalSymbol("GET-DECODED-TIME");
  public static final SubLSymbol GET_DISPATCH_MACRO_CHARACTER =
    PACKAGE_CL.addExternalSymbol("GET-DISPATCH-MACRO-CHARACTER");
  public static final SubLSymbol GET_INTERNAL_REAL_TIME =
    PACKAGE_CL.addExternalSymbol("GET-INTERNAL-REAL-TIME");
  public static final SubLSymbol GET_INTERNAL_RUN_TIME =
    PACKAGE_CL.addExternalSymbol("GET-INTERNAL-RUN-TIME");
  public static final SubLSymbol GET_MACRO_CHARACTER =
    PACKAGE_CL.addExternalSymbol("GET-MACRO-CHARACTER");
  public static final SubLSymbol GET_OUTPUT_STREAM_STRING =
    PACKAGE_CL.addExternalSymbol("GET-OUTPUT-STREAM-STRING");
  public static final SubLSymbol GET_PROPERTIES =
    PACKAGE_CL.addExternalSymbol("GET-PROPERTIES");
  public static final SubLSymbol GET_SETF_EXPANSION =
    PACKAGE_CL.addExternalSymbol("GET-SETF-EXPANSION");
  public static final SubLSymbol GET_UNIVERSAL_TIME =
    PACKAGE_CL.addExternalSymbol("GET-UNIVERSAL-TIME");
  public static final SubLSymbol GETF =
    PACKAGE_CL.addExternalSymbol("GETF");
  public static final SubLSymbol GETHASH =
    PACKAGE_CL.addExternalSymbol("GETHASH");
  public static final SubLSymbol GO =
    PACKAGE_CL.addExternalSymbol("GO");
  public static final SubLSymbol GRAPHIC_CHAR_P =
    PACKAGE_CL.addExternalSymbol("GRAPHIC-CHAR-P");
  public static final SubLSymbol HANDLER_BIND =
    PACKAGE_CL.addExternalSymbol("HANDLER-BIND");
  public static final SubLSymbol HANDLER_CASE =
    PACKAGE_CL.addExternalSymbol("HANDLER-CASE");
  public static final SubLSymbol HASH_TABLE =
    PACKAGE_CL.addExternalSymbol("HASH-TABLE");
  public static final SubLSymbol HASH_TABLE_COUNT =
    PACKAGE_CL.addExternalSymbol("HASH-TABLE-COUNT");
  public static final SubLSymbol HASH_TABLE_P =
    PACKAGE_CL.addExternalSymbol("HASH-TABLE-P");
  public static final SubLSymbol HASH_TABLE_REHASH_SIZE =
    PACKAGE_CL.addExternalSymbol("HASH-TABLE-REHASH-SIZE");
  public static final SubLSymbol HASH_TABLE_REHASH_THRESHOLD =
    PACKAGE_CL.addExternalSymbol("HASH-TABLE-REHASH-THRESHOLD");
  public static final SubLSymbol HASH_TABLE_SIZE =
    PACKAGE_CL.addExternalSymbol("HASH-TABLE-SIZE");
  public static final SubLSymbol HASH_TABLE_TEST =
    PACKAGE_CL.addExternalSymbol("HASH-TABLE-TEST");
  public static final SubLSymbol HOST_NAMESTRING =
    PACKAGE_CL.addExternalSymbol("HOST-NAMESTRING");
  public static final SubLSymbol IDENTITY =
    PACKAGE_CL.addExternalSymbol("IDENTITY");
  public static final SubLSymbol IF =
    PACKAGE_CL.addExternalSymbol("IF");
  public static final SubLSymbol IGNORABLE =
    PACKAGE_CL.addExternalSymbol("IGNORABLE");
  public static final SubLSymbol IGNORE =
    PACKAGE_CL.addExternalSymbol("IGNORE");
  public static final SubLSymbol IGNORE_ERRORS =
    PACKAGE_CL.addExternalSymbol("IGNORE-ERRORS");
  public static final SubLSymbol IMAGPART =
    PACKAGE_CL.addExternalSymbol("IMAGPART");
  public static final SubLSymbol IMPORT =
    PACKAGE_CL.addExternalSymbol("IMPORT");
  public static final SubLSymbol IN_PACKAGE =
    PACKAGE_CL.addExternalSymbol("IN-PACKAGE");
  public static final SubLSymbol INCF =
    PACKAGE_CL.addExternalSymbol("INCF");
  public static final SubLSymbol INITIALIZE_INSTANCE =
    PACKAGE_CL.addExternalSymbol("INITIALIZE-INSTANCE");
  public static final SubLSymbol INLINE =
    PACKAGE_CL.addExternalSymbol("INLINE");
  public static final SubLSymbol INPUT_STREAM_P =
    PACKAGE_CL.addExternalSymbol("INPUT-STREAM-P");
  public static final SubLSymbol INSPECT =
    PACKAGE_CL.addExternalSymbol("INSPECT");
  public static final SubLSymbol INTEGER =
    PACKAGE_CL.addExternalSymbol("INTEGER");
  public static final SubLSymbol INTEGER_DECODE_FLOAT =
    PACKAGE_CL.addExternalSymbol("INTEGER-DECODE-FLOAT");
  public static final SubLSymbol INTEGER_LENGTH =
    PACKAGE_CL.addExternalSymbol("INTEGER-LENGTH");
  public static final SubLSymbol INTEGERP =
    PACKAGE_CL.addExternalSymbol("INTEGERP");
  public static final SubLSymbol INTERACTIVE_STREAM_P =
    PACKAGE_CL.addExternalSymbol("INTERACTIVE-STREAM-P");
  public static final SubLSymbol INTERN =
    PACKAGE_CL.addExternalSymbol("INTERN");
  public static final SubLSymbol INTERNAL_TIME_UNITS_PER_SECOND =
    PACKAGE_CL.addExternalSymbol("INTERNAL-TIME-UNITS-PER-SECOND");
  public static final SubLSymbol INTERSECTION =
    PACKAGE_CL.addExternalSymbol("INTERSECTION");
  public static final SubLSymbol INVALID_METHOD_ERROR =
    PACKAGE_CL.addExternalSymbol("INVALID-METHOD-ERROR");
  public static final SubLSymbol INVOKE_DEBUGGER =
    PACKAGE_CL.addExternalSymbol("INVOKE-DEBUGGER");
  public static final SubLSymbol INVOKE_RESTART =
    PACKAGE_CL.addExternalSymbol("INVOKE-RESTART");
  public static final SubLSymbol INVOKE_RESTART_INTERACTIVELY =
    PACKAGE_CL.addExternalSymbol("INVOKE-RESTART-INTERACTIVELY");
  public static final SubLSymbol ISQRT =
    PACKAGE_CL.addExternalSymbol("ISQRT");
  public static final SubLSymbol KEYWORD =
    PACKAGE_CL.addExternalSymbol("KEYWORD");
  public static final SubLSymbol KEYWORDP =
    PACKAGE_CL.addExternalSymbol("KEYWORDP");
  public static final SubLSymbol LABELS =
    PACKAGE_CL.addExternalSymbol("LABELS");
  public static final SubLSymbol LAMBDA =
    PACKAGE_CL.addExternalSymbol("LAMBDA");
  public static final SubLSymbol LAMBDA_LIST_KEYWORDS =
    PACKAGE_CL.addExternalSymbol("LAMBDA-LIST-KEYWORDS");
  public static final SubLSymbol LAMBDA_PARAMETERS_LIMIT =
    PACKAGE_CL.addExternalSymbol("LAMBDA-PARAMETERS-LIMIT");
  public static final SubLSymbol LAST =
    PACKAGE_CL.addExternalSymbol("LAST");
  public static final SubLSymbol LCM =
    PACKAGE_CL.addExternalSymbol("LCM");
  public static final SubLSymbol LDB =
    PACKAGE_CL.addExternalSymbol("LDB");
  public static final SubLSymbol LDB_TEST =
    PACKAGE_CL.addExternalSymbol("LDB-TEST");
  public static final SubLSymbol LDIFF =
    PACKAGE_CL.addExternalSymbol("LDIFF");
  public static final SubLSymbol LEAST_NEGATIVE_DOUBLE_FLOAT =
    PACKAGE_CL.addExternalSymbol("LEAST-NEGATIVE-DOUBLE-FLOAT");
  public static final SubLSymbol LEAST_NEGATIVE_LONG_FLOAT =
    PACKAGE_CL.addExternalSymbol("LEAST-NEGATIVE-LONG-FLOAT");
  public static final SubLSymbol LEAST_NEGATIVE_NORMALIZED_DOUBLE_FLOAT =
    PACKAGE_CL.addExternalSymbol("LEAST-NEGATIVE-NORMALIZED-DOUBLE-FLOAT");
  public static final SubLSymbol LEAST_NEGATIVE_NORMALIZED_LONG_FLOAT =
    PACKAGE_CL.addExternalSymbol("LEAST-NEGATIVE-NORMALIZED-LONG-FLOAT");
  public static final SubLSymbol LEAST_NEGATIVE_NORMALIZED_SHORT_FLOAT =
    PACKAGE_CL.addExternalSymbol("LEAST-NEGATIVE-NORMALIZED-SHORT-FLOAT");
  public static final SubLSymbol LEAST_NEGATIVE_NORMALIZED_SINGLE_FLOAT =
    PACKAGE_CL.addExternalSymbol("LEAST-NEGATIVE-NORMALIZED-SINGLE-FLOAT");
  public static final SubLSymbol LEAST_NEGATIVE_SHORT_FLOAT =
    PACKAGE_CL.addExternalSymbol("LEAST-NEGATIVE-SHORT-FLOAT");
  public static final SubLSymbol LEAST_NEGATIVE_SINGLE_FLOAT =
    PACKAGE_CL.addExternalSymbol("LEAST-NEGATIVE-SINGLE-FLOAT");
  public static final SubLSymbol LEAST_POSITIVE_DOUBLE_FLOAT =
    PACKAGE_CL.addExternalSymbol("LEAST-POSITIVE-DOUBLE-FLOAT");
  public static final SubLSymbol LEAST_POSITIVE_LONG_FLOAT =
    PACKAGE_CL.addExternalSymbol("LEAST-POSITIVE-LONG-FLOAT");
  public static final SubLSymbol LEAST_POSITIVE_NORMALIZED_DOUBLE_FLOAT =
    PACKAGE_CL.addExternalSymbol("LEAST-POSITIVE-NORMALIZED-DOUBLE-FLOAT");
  public static final SubLSymbol LEAST_POSITIVE_NORMALIZED_LONG_FLOAT =
    PACKAGE_CL.addExternalSymbol("LEAST-POSITIVE-NORMALIZED-LONG-FLOAT");
  public static final SubLSymbol LEAST_POSITIVE_NORMALIZED_SHORT_FLOAT =
    PACKAGE_CL.addExternalSymbol("LEAST-POSITIVE-NORMALIZED-SHORT-FLOAT");
  public static final SubLSymbol LEAST_POSITIVE_NORMALIZED_SINGLE_FLOAT =
    PACKAGE_CL.addExternalSymbol("LEAST-POSITIVE-NORMALIZED-SINGLE-FLOAT");
  public static final SubLSymbol LEAST_POSITIVE_SHORT_FLOAT =
    PACKAGE_CL.addExternalSymbol("LEAST-POSITIVE-SHORT-FLOAT");
  public static final SubLSymbol LEAST_POSITIVE_SINGLE_FLOAT =
    PACKAGE_CL.addExternalSymbol("LEAST-POSITIVE-SINGLE-FLOAT");
  public static final SubLSymbol LENGTH =
    PACKAGE_CL.addExternalSymbol("LENGTH");
  public static final SubLSymbol LET =
    PACKAGE_CL.addExternalSymbol("LET");
  public static final SubLSymbol LET_STAR =
    PACKAGE_CL.addExternalSymbol("LET*");
  public static final SubLSymbol LISP_IMPLEMENTATION_TYPE =
    PACKAGE_CL.addExternalSymbol("LISP-IMPLEMENTATION-TYPE");
  public static final SubLSymbol LISP_IMPLEMENTATION_VERSION =
    PACKAGE_CL.addExternalSymbol("LISP-IMPLEMENTATION-VERSION");
  public static final SubLSymbol LIST =
    PACKAGE_CL.addExternalSymbol("LIST");
  public static final SubLSymbol LIST_STAR =
    PACKAGE_CL.addExternalSymbol("LIST*");
  public static final SubLSymbol LIST_ALL_PACKAGES =
    PACKAGE_CL.addExternalSymbol("LIST-ALL-PACKAGES");
  public static final SubLSymbol LIST_LENGTH =
    PACKAGE_CL.addExternalSymbol("LIST-LENGTH");
  public static final SubLSymbol LISTEN =
    PACKAGE_CL.addExternalSymbol("LISTEN");
  public static final SubLSymbol LISTP =
    PACKAGE_CL.addExternalSymbol("LISTP");
  public static final SubLSymbol LOAD =
    PACKAGE_CL.addExternalSymbol("LOAD");
  public static final SubLSymbol LOAD_LOGICAL_PATHNAME_TRANSLATIONS =
    PACKAGE_CL.addExternalSymbol("LOAD-LOGICAL-PATHNAME-TRANSLATIONS");
  public static final SubLSymbol LOAD_TIME_VALUE =
    PACKAGE_CL.addExternalSymbol("LOAD-TIME-VALUE");
  public static final SubLSymbol LOCALLY =
    PACKAGE_CL.addExternalSymbol("LOCALLY");
  public static final SubLSymbol LOG =
    PACKAGE_CL.addExternalSymbol("LOG");
  public static final SubLSymbol LOGAND =
    PACKAGE_CL.addExternalSymbol("LOGAND");
  public static final SubLSymbol LOGANDC1 =
    PACKAGE_CL.addExternalSymbol("LOGANDC1");
  public static final SubLSymbol LOGANDC2 =
    PACKAGE_CL.addExternalSymbol("LOGANDC2");
  public static final SubLSymbol LOGBITP =
    PACKAGE_CL.addExternalSymbol("LOGBITP");
  public static final SubLSymbol LOGCOUNT =
    PACKAGE_CL.addExternalSymbol("LOGCOUNT");
  public static final SubLSymbol LOGEQV =
    PACKAGE_CL.addExternalSymbol("LOGEQV");
  public static final SubLSymbol LOGICAL_PATHNAME =
    PACKAGE_CL.addExternalSymbol("LOGICAL-PATHNAME");
  public static final SubLSymbol LOGICAL_PATHNAME_TRANSLATIONS =
    PACKAGE_CL.addExternalSymbol("LOGICAL-PATHNAME-TRANSLATIONS");
  public static final SubLSymbol LOGIOR =
    PACKAGE_CL.addExternalSymbol("LOGIOR");
  public static final SubLSymbol LOGNAND =
    PACKAGE_CL.addExternalSymbol("LOGNAND");
  public static final SubLSymbol LOGNOR =
    PACKAGE_CL.addExternalSymbol("LOGNOR");
  public static final SubLSymbol LOGNOT =
    PACKAGE_CL.addExternalSymbol("LOGNOT");
  public static final SubLSymbol LOGORC1 =
    PACKAGE_CL.addExternalSymbol("LOGORC1");
  public static final SubLSymbol LOGORC2 =
    PACKAGE_CL.addExternalSymbol("LOGORC2");
  public static final SubLSymbol LOGTEST =
    PACKAGE_CL.addExternalSymbol("LOGTEST");
  public static final SubLSymbol LOGXOR =
    PACKAGE_CL.addExternalSymbol("LOGXOR");
  public static final SubLSymbol LONG_FLOAT =
    PACKAGE_CL.addExternalSymbol("LONG-FLOAT");
  public static final SubLSymbol LONG_FLOAT_EPSILON =
    PACKAGE_CL.addExternalSymbol("LONG-FLOAT-EPSILON");
  public static final SubLSymbol LONG_FLOAT_NEGATIVE_EPSILON =
    PACKAGE_CL.addExternalSymbol("LONG-FLOAT-NEGATIVE-EPSILON");
  public static final SubLSymbol LONG_SITE_NAME =
    PACKAGE_CL.addExternalSymbol("LONG-SITE-NAME");
  public static final SubLSymbol LOOP =
    PACKAGE_CL.addExternalSymbol("LOOP");
  public static final SubLSymbol LOOP_FINISH =
    PACKAGE_CL.addExternalSymbol("LOOP-FINISH");
  public static final SubLSymbol LOWER_CASE_P =
    PACKAGE_CL.addExternalSymbol("LOWER-CASE-P");
  public static final SubLSymbol MACHINE_INSTANCE =
    PACKAGE_CL.addExternalSymbol("MACHINE-INSTANCE");
  public static final SubLSymbol MACHINE_TYPE =
    PACKAGE_CL.addExternalSymbol("MACHINE-TYPE");
  public static final SubLSymbol MACHINE_VERSION =
    PACKAGE_CL.addExternalSymbol("MACHINE-VERSION");
  public static final SubLSymbol MACRO_FUNCTION =
    PACKAGE_CL.addExternalSymbol("MACRO-FUNCTION");
  public static final SubLSymbol MACROEXPAND =
    PACKAGE_CL.addExternalSymbol("MACROEXPAND");
  public static final SubLSymbol MACROEXPAND_1 =
    PACKAGE_CL.addExternalSymbol("MACROEXPAND-1");
  public static final SubLSymbol MACROLET =
    PACKAGE_CL.addExternalSymbol("MACROLET");
  public static final SubLSymbol MAKE_ARRAY =
    PACKAGE_CL.addExternalSymbol("MAKE-ARRAY");
  public static final SubLSymbol MAKE_BROADCAST_STREAM =
    PACKAGE_CL.addExternalSymbol("MAKE-BROADCAST-STREAM");
  public static final SubLSymbol MAKE_CONCATENATED_STREAM =
    PACKAGE_CL.addExternalSymbol("MAKE-CONCATENATED-STREAM");
  public static final SubLSymbol MAKE_CONDITION =
    PACKAGE_CL.addExternalSymbol("MAKE-CONDITION");
  public static final SubLSymbol MAKE_DISPATCH_MACRO_CHARACTER =
    PACKAGE_CL.addExternalSymbol("MAKE-DISPATCH-MACRO-CHARACTER");
  public static final SubLSymbol MAKE_ECHO_STREAM =
    PACKAGE_CL.addExternalSymbol("MAKE-ECHO-STREAM");
  public static final SubLSymbol MAKE_HASH_TABLE =
    PACKAGE_CL.addExternalSymbol("MAKE-HASH-TABLE");
  public static final SubLSymbol MAKE_INSTANCE =
    PACKAGE_CL.addExternalSymbol("MAKE-INSTANCE");
  public static final SubLSymbol MAKE_INSTANCES_OBSOLETE =
    PACKAGE_CL.addExternalSymbol("MAKE-INSTANCES-OBSOLETE");
  public static final SubLSymbol MAKE_LIST =
    PACKAGE_CL.addExternalSymbol("MAKE-LIST");
  public static final SubLSymbol MAKE_LOAD_FORM =
    PACKAGE_CL.addExternalSymbol("MAKE-LOAD-FORM");
  public static final SubLSymbol MAKE_LOAD_FORM_SAVING_SLOTS =
    PACKAGE_CL.addExternalSymbol("MAKE-LOAD-FORM-SAVING-SLOTS");
  public static final SubLSymbol MAKE_METHOD =
    PACKAGE_CL.addExternalSymbol("MAKE-METHOD");
  public static final SubLSymbol MAKE_PACKAGE =
    PACKAGE_CL.addExternalSymbol("MAKE-PACKAGE");
  public static final SubLSymbol MAKE_PATHNAME =
    PACKAGE_CL.addExternalSymbol("MAKE-PATHNAME");
  public static final SubLSymbol MAKE_RANDOM_STATE =
    PACKAGE_CL.addExternalSymbol("MAKE-RANDOM-STATE");
  public static final SubLSymbol MAKE_SEQUENCE =
    PACKAGE_CL.addExternalSymbol("MAKE-SEQUENCE");
  public static final SubLSymbol MAKE_STRING =
    PACKAGE_CL.addExternalSymbol("MAKE-STRING");
  public static final SubLSymbol MAKE_STRING_INPUT_STREAM =
    PACKAGE_CL.addExternalSymbol("MAKE-STRING-INPUT-STREAM");
  public static final SubLSymbol MAKE_STRING_OUTPUT_STREAM =
    PACKAGE_CL.addExternalSymbol("MAKE-STRING-OUTPUT-STREAM");
  public static final SubLSymbol MAKE_SYMBOL =
    PACKAGE_CL.addExternalSymbol("MAKE-SYMBOL");
  public static final SubLSymbol MAKE_SYNONYM_STREAM =
    PACKAGE_CL.addExternalSymbol("MAKE-SYNONYM-STREAM");
  public static final SubLSymbol MAKE_TWO_WAY_STREAM =
    PACKAGE_CL.addExternalSymbol("MAKE-TWO-WAY-STREAM");
  public static final SubLSymbol MAKUNBOUND =
    PACKAGE_CL.addExternalSymbol("MAKUNBOUND");
  public static final SubLSymbol MAP =
    PACKAGE_CL.addExternalSymbol("MAP");
  public static final SubLSymbol MAP_INTO =
    PACKAGE_CL.addExternalSymbol("MAP-INTO");
  public static final SubLSymbol MAPC =
    PACKAGE_CL.addExternalSymbol("MAPC");
  public static final SubLSymbol MAPCAN =
    PACKAGE_CL.addExternalSymbol("MAPCAN");
  public static final SubLSymbol MAPCAR =
    PACKAGE_CL.addExternalSymbol("MAPCAR");
  public static final SubLSymbol MAPCON =
    PACKAGE_CL.addExternalSymbol("MAPCON");
  public static final SubLSymbol MAPHASH =
    PACKAGE_CL.addExternalSymbol("MAPHASH");
  public static final SubLSymbol MAPL =
    PACKAGE_CL.addExternalSymbol("MAPL");
  public static final SubLSymbol MAPLIST =
    PACKAGE_CL.addExternalSymbol("MAPLIST");
  public static final SubLSymbol MASK_FIELD =
    PACKAGE_CL.addExternalSymbol("MASK-FIELD");
  public static final SubLSymbol MAX =
    PACKAGE_CL.addExternalSymbol("MAX");
  public static final SubLSymbol MEMBER =
    PACKAGE_CL.addExternalSymbol("MEMBER");
  public static final SubLSymbol MEMBER_IF =
    PACKAGE_CL.addExternalSymbol("MEMBER-IF");
  public static final SubLSymbol MEMBER_IF_NOT =
    PACKAGE_CL.addExternalSymbol("MEMBER-IF-NOT");
  public static final SubLSymbol MERGE =
    PACKAGE_CL.addExternalSymbol("MERGE");
  public static final SubLSymbol MERGE_PATHNAMES =
    PACKAGE_CL.addExternalSymbol("MERGE-PATHNAMES");
  public static final SubLSymbol METHOD =
    PACKAGE_CL.addExternalSymbol("METHOD");
  public static final SubLSymbol METHOD_COMBINATION =
    PACKAGE_CL.addExternalSymbol("METHOD-COMBINATION");
  public static final SubLSymbol METHOD_COMBINATION_ERROR =
    PACKAGE_CL.addExternalSymbol("METHOD-COMBINATION-ERROR");
  public static final SubLSymbol METHOD_QUALIFIERS =
    PACKAGE_CL.addExternalSymbol("METHOD-QUALIFIERS");
  public static final SubLSymbol MIN =
    PACKAGE_CL.addExternalSymbol("MIN");
  public static final SubLSymbol MINUSP =
    PACKAGE_CL.addExternalSymbol("MINUSP");
  public static final SubLSymbol MISMATCH =
    PACKAGE_CL.addExternalSymbol("MISMATCH");
  public static final SubLSymbol MOD =
    PACKAGE_CL.addExternalSymbol("MOD");
  public static final SubLSymbol MOST_NEGATIVE_DOUBLE_FLOAT =
    PACKAGE_CL.addExternalSymbol("MOST-NEGATIVE-DOUBLE-FLOAT");
  public static final SubLSymbol MOST_NEGATIVE_FIXNUM =
    PACKAGE_CL.addExternalSymbol("MOST-NEGATIVE-FIXNUM");
  public static final SubLSymbol MOST_NEGATIVE_LONG_FLOAT =
    PACKAGE_CL.addExternalSymbol("MOST-NEGATIVE-LONG-FLOAT");
  public static final SubLSymbol MOST_NEGATIVE_SHORT_FLOAT =
    PACKAGE_CL.addExternalSymbol("MOST-NEGATIVE-SHORT-FLOAT");
  public static final SubLSymbol MOST_NEGATIVE_SINGLE_FLOAT =
    PACKAGE_CL.addExternalSymbol("MOST-NEGATIVE-SINGLE-FLOAT");
  public static final SubLSymbol MOST_POSITIVE_DOUBLE_FLOAT =
    PACKAGE_CL.addExternalSymbol("MOST-POSITIVE-DOUBLE-FLOAT");
  public static final SubLSymbol MOST_POSITIVE_FIXNUM =
    PACKAGE_CL.addExternalSymbol("MOST-POSITIVE-FIXNUM");
  public static final SubLSymbol MOST_POSITIVE_LONG_FLOAT =
    PACKAGE_CL.addExternalSymbol("MOST-POSITIVE-LONG-FLOAT");
  public static final SubLSymbol MOST_POSITIVE_SHORT_FLOAT =
    PACKAGE_CL.addExternalSymbol("MOST-POSITIVE-SHORT-FLOAT");
  public static final SubLSymbol MOST_POSITIVE_SINGLE_FLOAT =
    PACKAGE_CL.addExternalSymbol("MOST-POSITIVE-SINGLE-FLOAT");
  public static final SubLSymbol MUFFLE_WARNING =
    PACKAGE_CL.addExternalSymbol("MUFFLE-WARNING");
  public static final SubLSymbol MULTIPLE_VALUE_BIND =
    PACKAGE_CL.addExternalSymbol("MULTIPLE-VALUE-BIND");
  public static final SubLSymbol MULTIPLE_VALUE_CALL =
    PACKAGE_CL.addExternalSymbol("MULTIPLE-VALUE-CALL");
  public static final SubLSymbol MULTIPLE_VALUE_LIST =
    PACKAGE_CL.addExternalSymbol("MULTIPLE-VALUE-LIST");
  public static final SubLSymbol MULTIPLE_VALUE_PROG1 =
    PACKAGE_CL.addExternalSymbol("MULTIPLE-VALUE-PROG1");
  public static final SubLSymbol MULTIPLE_VALUE_SETQ =
    PACKAGE_CL.addExternalSymbol("MULTIPLE-VALUE-SETQ");
  public static final SubLSymbol MULTIPLE_VALUES_LIMIT =
    PACKAGE_CL.addExternalSymbol("MULTIPLE-VALUES-LIMIT");
  public static final SubLSymbol NAME_CHAR =
    PACKAGE_CL.addExternalSymbol("NAME-CHAR");
  public static final SubLSymbol NAMESTRING =
    PACKAGE_CL.addExternalSymbol("NAMESTRING");
  public static final SubLSymbol NBUTLAST =
    PACKAGE_CL.addExternalSymbol("NBUTLAST");
  public static final SubLSymbol NCONC =
    PACKAGE_CL.addExternalSymbol("NCONC");
  public static final SubLSymbol NEXT_METHOD_P =
    PACKAGE_CL.addExternalSymbol("NEXT-METHOD-P");
  // NIL is a special case.
  //     public static final Symbol NIL =
  //         PACKAGE_CL.addExternalSymbol("NIL");
  public static final SubLSymbol NINTERSECTION =
    PACKAGE_CL.addExternalSymbol("NINTERSECTION");
  public static final SubLSymbol NINTH =
    PACKAGE_CL.addExternalSymbol("NINTH");
  public static final SubLSymbol NO_APPLICABLE_METHOD =
    PACKAGE_CL.addExternalSymbol("NO-APPLICABLE-METHOD");
  public static final SubLSymbol NO_NEXT_METHOD =
    PACKAGE_CL.addExternalSymbol("NO-NEXT-METHOD");
  public static final SubLSymbol NOT =
    PACKAGE_CL.addExternalSymbol("NOT");
  public static final SubLSymbol NOTANY =
    PACKAGE_CL.addExternalSymbol("NOTANY");
  public static final SubLSymbol NOTEVERY =
    PACKAGE_CL.addExternalSymbol("NOTEVERY");
  public static final SubLSymbol NOTINLINE =
    PACKAGE_CL.addExternalSymbol("NOTINLINE");
  public static final SubLSymbol NRECONC =
    PACKAGE_CL.addExternalSymbol("NRECONC");
  public static final SubLSymbol NREVERSE =
    PACKAGE_CL.addExternalSymbol("NREVERSE");
  public static final SubLSymbol NSET_DIFFERENCE =
    PACKAGE_CL.addExternalSymbol("NSET-DIFFERENCE");
  public static final SubLSymbol NSET_EXCLUSIVE_OR =
    PACKAGE_CL.addExternalSymbol("NSET-EXCLUSIVE-OR");
  public static final SubLSymbol NSTRING_CAPITALIZE =
    PACKAGE_CL.addExternalSymbol("NSTRING-CAPITALIZE");
  public static final SubLSymbol NSTRING_DOWNCASE =
    PACKAGE_CL.addExternalSymbol("NSTRING-DOWNCASE");
  public static final SubLSymbol NSTRING_UPCASE =
    PACKAGE_CL.addExternalSymbol("NSTRING-UPCASE");
  public static final SubLSymbol NSUBLIS =
    PACKAGE_CL.addExternalSymbol("NSUBLIS");
  public static final SubLSymbol NSUBST =
    PACKAGE_CL.addExternalSymbol("NSUBST");
  public static final SubLSymbol NSUBST_IF =
    PACKAGE_CL.addExternalSymbol("NSUBST-IF");
  public static final SubLSymbol NSUBST_IF_NOT =
    PACKAGE_CL.addExternalSymbol("NSUBST-IF-NOT");
  public static final SubLSymbol NSUBSTITUTE =
    PACKAGE_CL.addExternalSymbol("NSUBSTITUTE");
  public static final SubLSymbol NSUBSTITUTE_IF =
    PACKAGE_CL.addExternalSymbol("NSUBSTITUTE-IF");
  public static final SubLSymbol NSUBSTITUTE_IF_NOT =
    PACKAGE_CL.addExternalSymbol("NSUBSTITUTE-IF-NOT");
  public static final SubLSymbol NTH =
    PACKAGE_CL.addExternalSymbol("NTH");
  public static final SubLSymbol NTH_VALUE =
    PACKAGE_CL.addExternalSymbol("NTH-VALUE");
  public static final SubLSymbol NTHCDR =
    PACKAGE_CL.addExternalSymbol("NTHCDR");
  public static final SubLSymbol NULL =
    PACKAGE_CL.addExternalSymbol("NULL");
  public static final SubLSymbol NUMBER =
    PACKAGE_CL.addExternalSymbol("NUMBER");
  public static final SubLSymbol NUMBERP =
    PACKAGE_CL.addExternalSymbol("NUMBERP");
  public static final SubLSymbol NUMERATOR =
    PACKAGE_CL.addExternalSymbol("NUMERATOR");
  public static final SubLSymbol NUNION =
    PACKAGE_CL.addExternalSymbol("NUNION");
  public static final SubLSymbol ODDP =
    PACKAGE_CL.addExternalSymbol("ODDP");
  public static final SubLSymbol OPEN =
    PACKAGE_CL.addExternalSymbol("OPEN");
  public static final SubLSymbol OPEN_STREAM_P =
    PACKAGE_CL.addExternalSymbol("OPEN-STREAM-P");
  public static final SubLSymbol OPTIMIZE =
    PACKAGE_CL.addExternalSymbol("OPTIMIZE");
  public static final SubLSymbol OR =
    PACKAGE_CL.addExternalSymbol("OR");
  public static final SubLSymbol OTHERWISE =
    PACKAGE_CL.addExternalSymbol("OTHERWISE");
  public static final SubLSymbol OUTPUT_STREAM_P =
    PACKAGE_CL.addExternalSymbol("OUTPUT-STREAM-P");
  public static final SubLSymbol PACKAGE =
    PACKAGE_CL.addExternalSymbol("PACKAGE");
  public static final SubLSymbol PACKAGE_ERROR =
    PACKAGE_CL.addExternalSymbol("PACKAGE-ERROR");
  public static final SubLSymbol PACKAGE_ERROR_PACKAGE =
    PACKAGE_CL.addExternalSymbol("PACKAGE-ERROR-PACKAGE");
  public static final SubLSymbol PACKAGE_NAME =
    PACKAGE_CL.addExternalSymbol("PACKAGE-NAME");
  public static final SubLSymbol PACKAGE_NICKNAMES =
    PACKAGE_CL.addExternalSymbol("PACKAGE-NICKNAMES");
  public static final SubLSymbol PACKAGE_SHADOWING_SYMBOLS =
    PACKAGE_CL.addExternalSymbol("PACKAGE-SHADOWING-SYMBOLS");
  public static final SubLSymbol PACKAGE_USE_LIST =
    PACKAGE_CL.addExternalSymbol("PACKAGE-USE-LIST");
  public static final SubLSymbol PACKAGE_USED_BY_LIST =
    PACKAGE_CL.addExternalSymbol("PACKAGE-USED-BY-LIST");
  public static final SubLSymbol PACKAGEP =
    PACKAGE_CL.addExternalSymbol("PACKAGEP");
  public static final SubLSymbol PAIRLIS =
    PACKAGE_CL.addExternalSymbol("PAIRLIS");
  public static final SubLSymbol PARSE_ERROR =
    PACKAGE_CL.addExternalSymbol("PARSE-ERROR");
  public static final SubLSymbol PARSE_INTEGER =
    PACKAGE_CL.addExternalSymbol("PARSE-INTEGER");
  public static final SubLSymbol PARSE_NAMESTRING =
    PACKAGE_CL.addExternalSymbol("PARSE-NAMESTRING");
  public static final SubLSymbol PATHNAME =
    PACKAGE_CL.addExternalSymbol("PATHNAME");
  public static final SubLSymbol PATHNAME_DEVICE =
    PACKAGE_CL.addExternalSymbol("PATHNAME-DEVICE");
  public static final SubLSymbol PATHNAME_DIRECTORY =
    PACKAGE_CL.addExternalSymbol("PATHNAME-DIRECTORY");
  public static final SubLSymbol PATHNAME_HOST =
    PACKAGE_CL.addExternalSymbol("PATHNAME-HOST");
  public static final SubLSymbol PATHNAME_MATCH_P =
    PACKAGE_CL.addExternalSymbol("PATHNAME-MATCH-P");
  public static final SubLSymbol PATHNAME_NAME =
    PACKAGE_CL.addExternalSymbol("PATHNAME-NAME");
  public static final SubLSymbol PATHNAME_TYPE =
    PACKAGE_CL.addExternalSymbol("PATHNAME-TYPE");
  public static final SubLSymbol PATHNAME_VERSION =
    PACKAGE_CL.addExternalSymbol("PATHNAME-VERSION");
  public static final SubLSymbol PATHNAMEP =
    PACKAGE_CL.addExternalSymbol("PATHNAMEP");
  public static final SubLSymbol PEEK_CHAR =
    PACKAGE_CL.addExternalSymbol("PEEK-CHAR");
  public static final SubLSymbol PHASE =
    PACKAGE_CL.addExternalSymbol("PHASE");
  public static final SubLSymbol PI =
    PACKAGE_CL.addExternalSymbol("PI");
  public static final SubLSymbol PLUSP =
    PACKAGE_CL.addExternalSymbol("PLUSP");
  public static final SubLSymbol POP =
    PACKAGE_CL.addExternalSymbol("POP");
  public static final SubLSymbol POSITION =
    PACKAGE_CL.addExternalSymbol("POSITION");
  public static final SubLSymbol POSITION_IF =
    PACKAGE_CL.addExternalSymbol("POSITION-IF");
  public static final SubLSymbol POSITION_IF_NOT =
    PACKAGE_CL.addExternalSymbol("POSITION-IF-NOT");
  public static final SubLSymbol PPRINT =
    PACKAGE_CL.addExternalSymbol("PPRINT");
  public static final SubLSymbol PPRINT_DISPATCH =
    PACKAGE_CL.addExternalSymbol("PPRINT-DISPATCH");
  public static final SubLSymbol PPRINT_EXIT_IF_LIST_EXHAUSTED =
    PACKAGE_CL.addExternalSymbol("PPRINT-EXIT-IF-LIST-EXHAUSTED");
  public static final SubLSymbol PPRINT_FILL =
    PACKAGE_CL.addExternalSymbol("PPRINT-FILL");
  public static final SubLSymbol PPRINT_INDENT =
    PACKAGE_CL.addExternalSymbol("PPRINT-INDENT");
  public static final SubLSymbol PPRINT_LINEAR =
    PACKAGE_CL.addExternalSymbol("PPRINT-LINEAR");
  public static final SubLSymbol PPRINT_LOGICAL_BLOCK =
    PACKAGE_CL.addExternalSymbol("PPRINT-LOGICAL-BLOCK");
  public static final SubLSymbol PPRINT_NEWLINE =
    PACKAGE_CL.addExternalSymbol("PPRINT-NEWLINE");
  public static final SubLSymbol PPRINT_POP =
    PACKAGE_CL.addExternalSymbol("PPRINT-POP");
  public static final SubLSymbol PPRINT_TAB =
    PACKAGE_CL.addExternalSymbol("PPRINT-TAB");
  public static final SubLSymbol PPRINT_TABULAR =
    PACKAGE_CL.addExternalSymbol("PPRINT-TABULAR");
  public static final SubLSymbol PRIN1 =
    PACKAGE_CL.addExternalSymbol("PRIN1");
  public static final SubLSymbol PRIN1_TO_STRING =
    PACKAGE_CL.addExternalSymbol("PRIN1-TO-STRING");
  public static final SubLSymbol PRINC =
    PACKAGE_CL.addExternalSymbol("PRINC");
  public static final SubLSymbol PRINC_TO_STRING =
    PACKAGE_CL.addExternalSymbol("PRINC-TO-STRING");
  public static final SubLSymbol PRINT =
    PACKAGE_CL.addExternalSymbol("PRINT");
  public static final SubLSymbol PRINT_NOT_READABLE =
    PACKAGE_CL.addExternalSymbol("PRINT-NOT-READABLE");
  public static final SubLSymbol PRINT_NOT_READABLE_OBJECT =
    PACKAGE_CL.addExternalSymbol("PRINT-NOT-READABLE-OBJECT");
  public static final SubLSymbol PRINT_OBJECT =
    PACKAGE_CL.addExternalSymbol("PRINT-OBJECT");
  public static final SubLSymbol PRINT_UNREADABLE_OBJECT =
    PACKAGE_CL.addExternalSymbol("PRINT-UNREADABLE-OBJECT");
  public static final SubLSymbol PROBE_FILE =
    PACKAGE_CL.addExternalSymbol("PROBE-FILE");
  public static final SubLSymbol PROCLAIM =
    PACKAGE_CL.addExternalSymbol("PROCLAIM");
  public static final SubLSymbol PROG =
    PACKAGE_CL.addExternalSymbol("PROG");
  public static final SubLSymbol PROG_STAR =
    PACKAGE_CL.addExternalSymbol("PROG*");
  public static final SubLSymbol PROG1 =
    PACKAGE_CL.addExternalSymbol("PROG1");
  public static final SubLSymbol PROG2 =
    PACKAGE_CL.addExternalSymbol("PROG2");
  public static final SubLSymbol PROGN =
    PACKAGE_CL.addExternalSymbol("PROGN");
  public static final SubLSymbol PROGRAM_ERROR =
    PACKAGE_CL.addExternalSymbol("PROGRAM-ERROR");
  public static final SubLSymbol PROGV =
    PACKAGE_CL.addExternalSymbol("PROGV");
  public static final SubLSymbol PROVIDE =
    PACKAGE_CL.addExternalSymbol("PROVIDE");
  public static final SubLSymbol PSETF =
    PACKAGE_CL.addExternalSymbol("PSETF");
  public static final SubLSymbol PSETQ =
    PACKAGE_CL.addExternalSymbol("PSETQ");
  public static final SubLSymbol PUSH =
    PACKAGE_CL.addExternalSymbol("PUSH");
  public static final SubLSymbol PUSHNEW =
    PACKAGE_CL.addExternalSymbol("PUSHNEW");
  public static final SubLSymbol QUOTE =
    PACKAGE_CL.addExternalSymbol("QUOTE");
  public static final SubLSymbol RANDOM =
    PACKAGE_CL.addExternalSymbol("RANDOM");
  public static final SubLSymbol RANDOM_STATE =
    PACKAGE_CL.addExternalSymbol("RANDOM-STATE");
  public static final SubLSymbol RANDOM_STATE_P =
    PACKAGE_CL.addExternalSymbol("RANDOM-STATE-P");
  public static final SubLSymbol RASSOC =
    PACKAGE_CL.addExternalSymbol("RASSOC");
  public static final SubLSymbol RASSOC_IF =
    PACKAGE_CL.addExternalSymbol("RASSOC-IF");
  public static final SubLSymbol RASSOC_IF_NOT =
    PACKAGE_CL.addExternalSymbol("RASSOC-IF-NOT");
  public static final SubLSymbol RATIO =
    PACKAGE_CL.addExternalSymbol("RATIO");
  public static final SubLSymbol RATIONAL =
    PACKAGE_CL.addExternalSymbol("RATIONAL");
  public static final SubLSymbol RATIONALIZE =
    PACKAGE_CL.addExternalSymbol("RATIONALIZE");
  public static final SubLSymbol RATIONALP =
    PACKAGE_CL.addExternalSymbol("RATIONALP");
  public static final SubLSymbol READ =
    PACKAGE_CL.addExternalSymbol("READ");
  public static final SubLSymbol READ_BYTE =
    PACKAGE_CL.addExternalSymbol("READ-BYTE");
  public static final SubLSymbol READ_CHAR =
    PACKAGE_CL.addExternalSymbol("READ-CHAR");
  public static final SubLSymbol READ_CHAR_NO_HANG =
    PACKAGE_CL.addExternalSymbol("READ-CHAR-NO-HANG");
  public static final SubLSymbol READ_DELIMITED_LIST =
    PACKAGE_CL.addExternalSymbol("READ-DELIMITED-LIST");
  public static final SubLSymbol READ_FROM_STRING =
    PACKAGE_CL.addExternalSymbol("READ-FROM-STRING");
  public static final SubLSymbol READ_LINE =
    PACKAGE_CL.addExternalSymbol("READ-LINE");
  public static final SubLSymbol READ_PRESERVING_WHITESPACE =
    PACKAGE_CL.addExternalSymbol("READ-PRESERVING-WHITESPACE");
  public static final SubLSymbol READ_SEQUENCE =
    PACKAGE_CL.addExternalSymbol("READ-SEQUENCE");
  public static final SubLSymbol READER_ERROR =
    PACKAGE_CL.addExternalSymbol("READER-ERROR");
  public static final SubLSymbol READTABLE =
    PACKAGE_CL.addExternalSymbol("READTABLE");
  public static final SubLSymbol READTABLE_CASE =
    PACKAGE_CL.addExternalSymbol("READTABLE-CASE");
  public static final SubLSymbol READTABLEP =
    PACKAGE_CL.addExternalSymbol("READTABLEP");
  public static final SubLSymbol REAL =
    PACKAGE_CL.addExternalSymbol("REAL");
  public static final SubLSymbol REALP =
    PACKAGE_CL.addExternalSymbol("REALP");
  public static final SubLSymbol REALPART =
    PACKAGE_CL.addExternalSymbol("REALPART");
  public static final SubLSymbol REDUCE =
    PACKAGE_CL.addExternalSymbol("REDUCE");
  public static final SubLSymbol REINITIALIZE_INSTANCE =
    PACKAGE_CL.addExternalSymbol("REINITIALIZE-INSTANCE");
  public static final SubLSymbol REM =
    PACKAGE_CL.addExternalSymbol("REM");
  public static final SubLSymbol REMF =
    PACKAGE_CL.addExternalSymbol("REMF");
  public static final SubLSymbol REMHASH =
    PACKAGE_CL.addExternalSymbol("REMHASH");
  public static final SubLSymbol REMOVE =
    PACKAGE_CL.addExternalSymbol("REMOVE");
  public static final SubLSymbol REMOVE_DUPLICATES =
    PACKAGE_CL.addExternalSymbol("REMOVE-DUPLICATES");
  public static final SubLSymbol REMOVE_IF =
    PACKAGE_CL.addExternalSymbol("REMOVE-IF");
  public static final SubLSymbol REMOVE_IF_NOT =
    PACKAGE_CL.addExternalSymbol("REMOVE-IF-NOT");
  public static final SubLSymbol REMOVE_METHOD =
    PACKAGE_CL.addExternalSymbol("REMOVE-METHOD");
  public static final SubLSymbol REMPROP =
    PACKAGE_CL.addExternalSymbol("REMPROP");
  public static final SubLSymbol RENAME_FILE =
    PACKAGE_CL.addExternalSymbol("RENAME-FILE");
  public static final SubLSymbol RENAME_PACKAGE =
    PACKAGE_CL.addExternalSymbol("RENAME-PACKAGE");
  public static final SubLSymbol REPLACE =
    PACKAGE_CL.addExternalSymbol("REPLACE");
  public static final SubLSymbol REQUIRE =
    PACKAGE_CL.addExternalSymbol("REQUIRE");
  public static final SubLSymbol REST =
    PACKAGE_CL.addExternalSymbol("REST");
  public static final SubLSymbol RESTART =
    PACKAGE_CL.addExternalSymbol("RESTART");
  public static final SubLSymbol RESTART_BIND =
    PACKAGE_CL.addExternalSymbol("RESTART-BIND");
  public static final SubLSymbol RESTART_CASE =
    PACKAGE_CL.addExternalSymbol("RESTART-CASE");
  public static final SubLSymbol RESTART_NAME =
    PACKAGE_CL.addExternalSymbol("RESTART-NAME");
  public static final SubLSymbol RETURN =
    PACKAGE_CL.addExternalSymbol("RETURN");
  public static final SubLSymbol RETURN_FROM =
    PACKAGE_CL.addExternalSymbol("RETURN-FROM");
  public static final SubLSymbol REVAPPEND =
    PACKAGE_CL.addExternalSymbol("REVAPPEND");
  public static final SubLSymbol REVERSE =
    PACKAGE_CL.addExternalSymbol("REVERSE");
  public static final SubLSymbol ROOM =
    PACKAGE_CL.addExternalSymbol("ROOM");
  public static final SubLSymbol ROTATEF =
    PACKAGE_CL.addExternalSymbol("ROTATEF");
  public static final SubLSymbol ROUND =
    PACKAGE_CL.addExternalSymbol("ROUND");
  public static final SubLSymbol ROW_MAJOR_AREF =
    PACKAGE_CL.addExternalSymbol("ROW-MAJOR-AREF");
  public static final SubLSymbol RPLACA =
    PACKAGE_CL.addExternalSymbol("RPLACA");
  public static final SubLSymbol RPLACD =
    PACKAGE_CL.addExternalSymbol("RPLACD");
  public static final SubLSymbol SAFETY =
    PACKAGE_CL.addExternalSymbol("SAFETY");
  public static final SubLSymbol SATISFIES =
    PACKAGE_CL.addExternalSymbol("SATISFIES");
  public static final SubLSymbol SBIT =
    PACKAGE_CL.addExternalSymbol("SBIT");
  public static final SubLSymbol SCALE_FLOAT =
    PACKAGE_CL.addExternalSymbol("SCALE-FLOAT");
  public static final SubLSymbol SCHAR =
    PACKAGE_CL.addExternalSymbol("SCHAR");
  public static final SubLSymbol SEARCH =
    PACKAGE_CL.addExternalSymbol("SEARCH");
  public static final SubLSymbol SECOND =
    PACKAGE_CL.addExternalSymbol("SECOND");
  public static final SubLSymbol SEQUENCE =
    PACKAGE_CL.addExternalSymbol("SEQUENCE");
  public static final SubLSymbol SERIOUS_CONDITION =
    PACKAGE_CL.addExternalSymbol("SERIOUS-CONDITION");
  public static final SubLSymbol SET =
    PACKAGE_CL.addExternalSymbol("SET");
  public static final SubLSymbol SET_DIFFERENCE =
    PACKAGE_CL.addExternalSymbol("SET-DIFFERENCE");
  public static final SubLSymbol SET_DISPATCH_MACRO_CHARACTER =
    PACKAGE_CL.addExternalSymbol("SET-DISPATCH-MACRO-CHARACTER");
  public static final SubLSymbol SET_EXCLUSIVE_OR =
    PACKAGE_CL.addExternalSymbol("SET-EXCLUSIVE-OR");
  public static final SubLSymbol SET_MACRO_CHARACTER =
    PACKAGE_CL.addExternalSymbol("SET-MACRO-CHARACTER");
  public static final SubLSymbol SET_PPRINT_DISPATCH =
    PACKAGE_CL.addExternalSymbol("SET-PPRINT-DISPATCH");
  public static final SubLSymbol SET_SYNTAX_FROM_CHAR =
    PACKAGE_CL.addExternalSymbol("SET-SYNTAX-FROM-CHAR");
  public static final SubLSymbol SETF =
    PACKAGE_CL.addExternalSymbol("SETF");
  public static final SubLSymbol SETQ =
    PACKAGE_CL.addExternalSymbol("SETQ");
  public static final SubLSymbol SEVENTH =
    PACKAGE_CL.addExternalSymbol("SEVENTH");
  public static final SubLSymbol SHADOW =
    PACKAGE_CL.addExternalSymbol("SHADOW");
  public static final SubLSymbol SHADOWING_IMPORT =
    PACKAGE_CL.addExternalSymbol("SHADOWING-IMPORT");
  public static final SubLSymbol SHARED_INITIALIZE =
    PACKAGE_CL.addExternalSymbol("SHARED-INITIALIZE");
  public static final SubLSymbol SHIFTF =
    PACKAGE_CL.addExternalSymbol("SHIFTF");
  public static final SubLSymbol SHORT_FLOAT =
    PACKAGE_CL.addExternalSymbol("SHORT-FLOAT");
  public static final SubLSymbol SHORT_FLOAT_EPSILON =
    PACKAGE_CL.addExternalSymbol("SHORT-FLOAT-EPSILON");
  public static final SubLSymbol SHORT_FLOAT_NEGATIVE_EPSILON =
    PACKAGE_CL.addExternalSymbol("SHORT-FLOAT-NEGATIVE-EPSILON");
  public static final SubLSymbol SHORT_SITE_NAME =
    PACKAGE_CL.addExternalSymbol("SHORT-SITE-NAME");
  public static final SubLSymbol SIGNAL =
    PACKAGE_CL.addExternalSymbol("SIGNAL");
  public static final SubLSymbol SIGNED_BYTE =
    PACKAGE_CL.addExternalSymbol("SIGNED-BYTE");
  public static final SubLSymbol SIGNUM =
    PACKAGE_CL.addExternalSymbol("SIGNUM");
  public static final SubLSymbol SIMPLE_ARRAY =
    PACKAGE_CL.addExternalSymbol("SIMPLE-ARRAY");
  public static final SubLSymbol SIMPLE_BASE_STRING =
    PACKAGE_CL.addExternalSymbol("SIMPLE-BASE-STRING");
  public static final SubLSymbol SIMPLE_BIT_VECTOR =
    PACKAGE_CL.addExternalSymbol("SIMPLE-BIT-VECTOR");
  public static final SubLSymbol SIMPLE_BIT_VECTOR_P =
    PACKAGE_CL.addExternalSymbol("SIMPLE-BIT-VECTOR-P");
  public static final SubLSymbol SIMPLE_CONDITION =
    PACKAGE_CL.addExternalSymbol("SIMPLE-CONDITION");
  public static final SubLSymbol SIMPLE_CONDITION_FORMAT_ARGUMENTS =
    PACKAGE_CL.addExternalSymbol("SIMPLE-CONDITION-FORMAT-ARGUMENTS");
  public static final SubLSymbol SIMPLE_CONDITION_FORMAT_CONTROL =
    PACKAGE_CL.addExternalSymbol("SIMPLE-CONDITION-FORMAT-CONTROL");
  public static final SubLSymbol SIMPLE_ERROR =
    PACKAGE_CL.addExternalSymbol("SIMPLE-ERROR");
  public static final SubLSymbol SIMPLE_STRING =
    PACKAGE_CL.addExternalSymbol("SIMPLE-STRING");
  public static final SubLSymbol SIMPLE_STRING_P =
    PACKAGE_CL.addExternalSymbol("SIMPLE-STRING-P");
  public static final SubLSymbol SIMPLE_TYPE_ERROR =
    PACKAGE_CL.addExternalSymbol("SIMPLE-TYPE-ERROR");
  public static final SubLSymbol SIMPLE_VECTOR =
    PACKAGE_CL.addExternalSymbol("SIMPLE-VECTOR");
  public static final SubLSymbol SIMPLE_VECTOR_P =
    PACKAGE_CL.addExternalSymbol("SIMPLE-VECTOR-P");
  public static final SubLSymbol SIMPLE_WARNING =
    PACKAGE_CL.addExternalSymbol("SIMPLE-WARNING");
  public static final SubLSymbol SIN =
    PACKAGE_CL.addExternalSymbol("SIN");
  public static final SubLSymbol SINGLE_FLOAT =
    PACKAGE_CL.addExternalSymbol("SINGLE-FLOAT");
  public static final SubLSymbol SINGLE_FLOAT_EPSILON =
    PACKAGE_CL.addExternalSymbol("SINGLE-FLOAT-EPSILON");
  public static final SubLSymbol SINGLE_FLOAT_NEGATIVE_EPSILON =
    PACKAGE_CL.addExternalSymbol("SINGLE-FLOAT-NEGATIVE-EPSILON");
  public static final SubLSymbol SINH =
    PACKAGE_CL.addExternalSymbol("SINH");
  public static final SubLSymbol SIXTH =
    PACKAGE_CL.addExternalSymbol("SIXTH");
  public static final SubLSymbol SLEEP =
    PACKAGE_CL.addExternalSymbol("SLEEP");
  public static final SubLSymbol SLOT_BOUNDP =
    PACKAGE_CL.addExternalSymbol("SLOT-BOUNDP");
  public static final SubLSymbol SLOT_EXISTS_P =
    PACKAGE_CL.addExternalSymbol("SLOT-EXISTS-P");
  public static final SubLSymbol SLOT_MAKUNBOUND =
    PACKAGE_CL.addExternalSymbol("SLOT-MAKUNBOUND");
  public static final SubLSymbol SLOT_MISSING =
    PACKAGE_CL.addExternalSymbol("SLOT-MISSING");
  public static final SubLSymbol SLOT_UNBOUND =
    PACKAGE_CL.addExternalSymbol("SLOT-UNBOUND");
  public static final SubLSymbol SLOT_VALUE =
    PACKAGE_CL.addExternalSymbol("SLOT-VALUE");
  public static final SubLSymbol SOFTWARE_TYPE =
    PACKAGE_CL.addExternalSymbol("SOFTWARE-TYPE");
  public static final SubLSymbol SOFTWARE_VERSION =
    PACKAGE_CL.addExternalSymbol("SOFTWARE-VERSION");
  public static final SubLSymbol SOME =
    PACKAGE_CL.addExternalSymbol("SOME");
  public static final SubLSymbol SORT =
    PACKAGE_CL.addExternalSymbol("SORT");
  public static final SubLSymbol SPACE =
    PACKAGE_CL.addExternalSymbol("SPACE");
  public static final SubLSymbol SPECIAL =
    PACKAGE_CL.addExternalSymbol("SPECIAL");
  public static final SubLSymbol SPECIAL_OPERATOR_P =
    PACKAGE_CL.addExternalSymbol("SPECIAL-OPERATOR-P");
  public static final SubLSymbol SPEED =
    PACKAGE_CL.addExternalSymbol("SPEED");
  public static final SubLSymbol SQRT =
    PACKAGE_CL.addExternalSymbol("SQRT");
  public static final SubLSymbol STABLE_SORT =
    PACKAGE_CL.addExternalSymbol("STABLE-SORT");
  public static final SubLSymbol STANDARD =
    PACKAGE_CL.addExternalSymbol("STANDARD");
  public static final SubLSymbol STANDARD_CHAR =
    PACKAGE_CL.addExternalSymbol("STANDARD-CHAR");
  public static final SubLSymbol STANDARD_CHAR_P =
    PACKAGE_CL.addExternalSymbol("STANDARD-CHAR-P");
  public static final SubLSymbol STANDARD_CLASS =
    PACKAGE_CL.addExternalSymbol("STANDARD-CLASS");
  public static final SubLSymbol STANDARD_GENERIC_FUNCTION =
    PACKAGE_CL.addExternalSymbol("STANDARD-GENERIC-FUNCTION");
  public static final SubLSymbol STANDARD_METHOD =
    PACKAGE_CL.addExternalSymbol("STANDARD-METHOD");
  public static final SubLSymbol STANDARD_OBJECT =
    PACKAGE_CL.addExternalSymbol("STANDARD-OBJECT");
  public static final SubLSymbol STEP =
    PACKAGE_CL.addExternalSymbol("STEP");
  public static final SubLSymbol STORAGE_CONDITION =
    PACKAGE_CL.addExternalSymbol("STORAGE-CONDITION");
  public static final SubLSymbol STORE_VALUE =
    PACKAGE_CL.addExternalSymbol("STORE-VALUE");
  public static final SubLSymbol STREAM =
    PACKAGE_CL.addExternalSymbol("STREAM");
  public static final SubLSymbol STREAM_ELEMENT_TYPE =
    PACKAGE_CL.addExternalSymbol("STREAM-ELEMENT-TYPE");
  public static final SubLSymbol STREAM_ERROR =
    PACKAGE_CL.addExternalSymbol("STREAM-ERROR");
  public static final SubLSymbol STREAM_ERROR_STREAM =
    PACKAGE_CL.addExternalSymbol("STREAM-ERROR-STREAM");
  public static final SubLSymbol STREAM_EXTERNAL_FORMAT =
    PACKAGE_CL.addExternalSymbol("STREAM-EXTERNAL-FORMAT");
  public static final SubLSymbol STREAMP =
    PACKAGE_CL.addExternalSymbol("STREAMP");
  public static final SubLSymbol STRING =
    PACKAGE_CL.addExternalSymbol("STRING");
  public static final SubLSymbol STRING_CAPITALIZE =
    PACKAGE_CL.addExternalSymbol("STRING-CAPITALIZE");
  public static final SubLSymbol STRING_DOWNCASE =
    PACKAGE_CL.addExternalSymbol("STRING-DOWNCASE");
  public static final SubLSymbol STRING_EQUAL =
    PACKAGE_CL.addExternalSymbol("STRING-EQUAL");
  public static final SubLSymbol STRING_GREATERP =
    PACKAGE_CL.addExternalSymbol("STRING-GREATERP");
  public static final SubLSymbol STRING_LEFT_TRIM =
    PACKAGE_CL.addExternalSymbol("STRING-LEFT-TRIM");
  public static final SubLSymbol STRING_LESSP =
    PACKAGE_CL.addExternalSymbol("STRING-LESSP");
  public static final SubLSymbol STRING_NOT_EQUAL =
    PACKAGE_CL.addExternalSymbol("STRING-NOT-EQUAL");
  public static final SubLSymbol STRING_NOT_GREATERP =
    PACKAGE_CL.addExternalSymbol("STRING-NOT-GREATERP");
  public static final SubLSymbol STRING_NOT_LESSP =
    PACKAGE_CL.addExternalSymbol("STRING-NOT-LESSP");
  public static final SubLSymbol STRING_RIGHT_TRIM =
    PACKAGE_CL.addExternalSymbol("STRING-RIGHT-TRIM");
  public static final SubLSymbol STRING_STREAM =
    PACKAGE_CL.addExternalSymbol("STRING-STREAM");
  public static final SubLSymbol STRING_TRIM =
    PACKAGE_CL.addExternalSymbol("STRING-TRIM");
  public static final SubLSymbol STRING_UPCASE =
    PACKAGE_CL.addExternalSymbol("STRING-UPCASE");
  public static final SubLSymbol STRING_NE =
    PACKAGE_CL.addExternalSymbol("STRING/=");
  public static final SubLSymbol STRING_LT =
    PACKAGE_CL.addExternalSymbol("STRING<");
  public static final SubLSymbol STRING_LE =
    PACKAGE_CL.addExternalSymbol("STRING<=");
  public static final SubLSymbol STRING_EQUALS =
    PACKAGE_CL.addExternalSymbol("STRING=");
  public static final SubLSymbol STRING_GT =
    PACKAGE_CL.addExternalSymbol("STRING>");
  public static final SubLSymbol STRING_GE =
    PACKAGE_CL.addExternalSymbol("STRING>=");
  public static final SubLSymbol STRINGP =
    PACKAGE_CL.addExternalSymbol("STRINGP");
  public static final SubLSymbol STRUCTURE =
    PACKAGE_CL.addExternalSymbol("STRUCTURE");
  public static final SubLSymbol STRUCTURE_CLASS =
    PACKAGE_CL.addExternalSymbol("STRUCTURE-CLASS");
  public static final SubLSymbol STRUCTURE_OBJECT =
    PACKAGE_CL.addExternalSymbol("STRUCTURE-OBJECT");
  public static final SubLSymbol STYLE_WARNING =
    PACKAGE_CL.addExternalSymbol("STYLE-WARNING");
  public static final SubLSymbol SUBLIS =
    PACKAGE_CL.addExternalSymbol("SUBLIS");
  public static final SubLSymbol SUBSEQ =
    PACKAGE_CL.addExternalSymbol("SUBSEQ");
  public static final SubLSymbol SUBSETP =
    PACKAGE_CL.addExternalSymbol("SUBSETP");
  public static final SubLSymbol SUBST =
    PACKAGE_CL.addExternalSymbol("SUBST");
  public static final SubLSymbol SUBST_IF =
    PACKAGE_CL.addExternalSymbol("SUBST-IF");
  public static final SubLSymbol SUBST_IF_NOT =
    PACKAGE_CL.addExternalSymbol("SUBST-IF-NOT");
  public static final SubLSymbol SUBSTITUTE =
    PACKAGE_CL.addExternalSymbol("SUBSTITUTE");
  public static final SubLSymbol SUBSTITUTE_IF =
    PACKAGE_CL.addExternalSymbol("SUBSTITUTE-IF");
  public static final SubLSymbol SUBSTITUTE_IF_NOT =
    PACKAGE_CL.addExternalSymbol("SUBSTITUTE-IF-NOT");
  public static final SubLSymbol SUBTYPEP =
    PACKAGE_CL.addExternalSymbol("SUBTYPEP");
  public static final SubLSymbol SVREF =
    PACKAGE_CL.addExternalSymbol("SVREF");
  public static final SubLSymbol SXHASH =
    PACKAGE_CL.addExternalSymbol("SXHASH");
  public static final SubLSymbol SYMBOL =
    PACKAGE_CL.addExternalSymbol("SYMBOL");
  public static final SubLSymbol SYMBOL_FUNCTION =
    PACKAGE_CL.addExternalSymbol("SYMBOL-FUNCTION");
  public static final SubLSymbol SYMBOL_MACROLET =
    PACKAGE_CL.addExternalSymbol("SYMBOL-MACROLET");
  public static final SubLSymbol SYMBOL_NAME =
    PACKAGE_CL.addExternalSymbol("SYMBOL-NAME");
  public static final SubLSymbol SYMBOL_PACKAGE =
    PACKAGE_CL.addExternalSymbol("SYMBOL-PACKAGE");
  public static final SubLSymbol SYMBOL_PLIST =
    PACKAGE_CL.addExternalSymbol("SYMBOL-PLIST");
  public static final SubLSymbol SYMBOL_VALUE =
    PACKAGE_CL.addExternalSymbol("SYMBOL-VALUE");
  public static final SubLSymbol SYMBOLP =
    PACKAGE_CL.addExternalSymbol("SYMBOLP");
  public static final SubLSymbol SYNONYM_STREAM =
    PACKAGE_CL.addExternalSymbol("SYNONYM-STREAM");
  public static final SubLSymbol SYNONYM_STREAM_SYMBOL =
    PACKAGE_CL.addExternalSymbol("SYNONYM-STREAM-SYMBOL");
  public static final SubLSymbol T =
    PACKAGE_CL.addExternalSymbol("T");
  public static final SubLSymbol TAGBODY =
    PACKAGE_CL.addExternalSymbol("TAGBODY");
  public static final SubLSymbol TAILP =
    PACKAGE_CL.addExternalSymbol("TAILP");
  public static final SubLSymbol TAN =
    PACKAGE_CL.addExternalSymbol("TAN");
  public static final SubLSymbol TANH =
    PACKAGE_CL.addExternalSymbol("TANH");
  public static final SubLSymbol TENTH =
    PACKAGE_CL.addExternalSymbol("TENTH");
  public static final SubLSymbol TERPRI =
    PACKAGE_CL.addExternalSymbol("TERPRI");
  public static final SubLSymbol THE =
    PACKAGE_CL.addExternalSymbol("THE");
  public static final SubLSymbol THIRD =
    PACKAGE_CL.addExternalSymbol("THIRD");
  public static final SubLSymbol THROW =
    PACKAGE_CL.addExternalSymbol("THROW");
  public static final SubLSymbol TIME =
    PACKAGE_CL.addExternalSymbol("TIME");
  public static final SubLSymbol TRACE =
    PACKAGE_CL.addExternalSymbol("TRACE");
  public static final SubLSymbol TRANSLATE_LOGICAL_PATHNAME =
    PACKAGE_CL.addExternalSymbol("TRANSLATE-LOGICAL-PATHNAME");
  public static final SubLSymbol TRANSLATE_PATHNAME =
    PACKAGE_CL.addExternalSymbol("TRANSLATE-PATHNAME");
  public static final SubLSymbol TREE_EQUAL =
    PACKAGE_CL.addExternalSymbol("TREE-EQUAL");
  public static final SubLSymbol TRUENAME =
    PACKAGE_CL.addExternalSymbol("TRUENAME");
  public static final SubLSymbol TRUNCATE =
    PACKAGE_CL.addExternalSymbol("TRUNCATE");
  public static final SubLSymbol TWO_WAY_STREAM =
    PACKAGE_CL.addExternalSymbol("TWO-WAY-STREAM");
  public static final SubLSymbol TWO_WAY_STREAM_INPUT_STREAM =
    PACKAGE_CL.addExternalSymbol("TWO-WAY-STREAM-INPUT-STREAM");
  public static final SubLSymbol TWO_WAY_STREAM_OUTPUT_STREAM =
    PACKAGE_CL.addExternalSymbol("TWO-WAY-STREAM-OUTPUT-STREAM");
  public static final SubLSymbol TYPE =
    PACKAGE_CL.addExternalSymbol("TYPE");
  public static final SubLSymbol TYPE_ERROR =
    PACKAGE_CL.addExternalSymbol("TYPE-ERROR");
  public static final SubLSymbol TYPE_ERROR_DATUM =
    PACKAGE_CL.addExternalSymbol("TYPE-ERROR-DATUM");
  public static final SubLSymbol TYPE_ERROR_EXPECTED_TYPE =
    PACKAGE_CL.addExternalSymbol("TYPE-ERROR-EXPECTED-TYPE");
  public static final SubLSymbol TYPE_OF =
    PACKAGE_CL.addExternalSymbol("TYPE-OF");
  public static final SubLSymbol TYPECASE =
    PACKAGE_CL.addExternalSymbol("TYPECASE");
  public static final SubLSymbol TYPEP =
    PACKAGE_CL.addExternalSymbol("TYPEP");
  public static final SubLSymbol UNBOUND_SLOT =
    PACKAGE_CL.addExternalSymbol("UNBOUND-SLOT");
  public static final SubLSymbol UNBOUND_SLOT_INSTANCE =
    PACKAGE_CL.addExternalSymbol("UNBOUND-SLOT-INSTANCE");
  public static final SubLSymbol UNBOUND_VARIABLE =
    PACKAGE_CL.addExternalSymbol("UNBOUND-VARIABLE");
  public static final SubLSymbol UNDEFINED_FUNCTION =
    PACKAGE_CL.addExternalSymbol("UNDEFINED-FUNCTION");
  public static final SubLSymbol UNEXPORT =
    PACKAGE_CL.addExternalSymbol("UNEXPORT");
  public static final SubLSymbol UNINTERN =
    PACKAGE_CL.addExternalSymbol("UNINTERN");
  public static final SubLSymbol UNION =
    PACKAGE_CL.addExternalSymbol("UNION");
  public static final SubLSymbol UNLESS =
    PACKAGE_CL.addExternalSymbol("UNLESS");
  public static final SubLSymbol UNREAD_CHAR =
    PACKAGE_CL.addExternalSymbol("UNREAD-CHAR");
  public static final SubLSymbol UNSIGNED_BYTE =
    PACKAGE_CL.addExternalSymbol("UNSIGNED-BYTE");
  public static final SubLSymbol UNTRACE =
    PACKAGE_CL.addExternalSymbol("UNTRACE");
  public static final SubLSymbol UNUSE_PACKAGE =
    PACKAGE_CL.addExternalSymbol("UNUSE-PACKAGE");
  public static final SubLSymbol UNWIND_PROTECT =
    PACKAGE_CL.addExternalSymbol("UNWIND-PROTECT");
  public static final SubLSymbol UPDATE_INSTANCE_FOR_DIFFERENT_CLASS =
    PACKAGE_CL.addExternalSymbol("UPDATE-INSTANCE-FOR-DIFFERENT-CLASS");
  public static final SubLSymbol UPDATE_INSTANCE_FOR_REDEFINED_CLASS =
    PACKAGE_CL.addExternalSymbol("UPDATE-INSTANCE-FOR-REDEFINED-CLASS");
  public static final SubLSymbol UPGRADED_ARRAY_ELEMENT_TYPE =
    PACKAGE_CL.addExternalSymbol("UPGRADED-ARRAY-ELEMENT-TYPE");
  public static final SubLSymbol UPGRADED_COMPLEX_PART_TYPE =
    PACKAGE_CL.addExternalSymbol("UPGRADED-COMPLEX-PART-TYPE");
  public static final SubLSymbol UPPER_CASE_P =
    PACKAGE_CL.addExternalSymbol("UPPER-CASE-P");
  public static final SubLSymbol USE_PACKAGE =
    PACKAGE_CL.addExternalSymbol("USE-PACKAGE");
  public static final SubLSymbol USE_VALUE =
    PACKAGE_CL.addExternalSymbol("USE-VALUE");
  public static final SubLSymbol USER_HOMEDIR_PATHNAME =
    PACKAGE_CL.addExternalSymbol("USER-HOMEDIR-PATHNAME");
  public static final SubLSymbol VALUES =
    PACKAGE_CL.addExternalSymbol("VALUES");
  public static final SubLSymbol VALUES_LIST =
    PACKAGE_CL.addExternalSymbol("VALUES-LIST");
  public static final SubLSymbol VARIABLE =
    PACKAGE_CL.addExternalSymbol("VARIABLE");
  public static final SubLSymbol VECTOR =
    PACKAGE_CL.addExternalSymbol("VECTOR");
  public static final SubLSymbol VECTOR_POP =
    PACKAGE_CL.addExternalSymbol("VECTOR-POP");
  public static final SubLSymbol VECTOR_PUSH =
    PACKAGE_CL.addExternalSymbol("VECTOR-PUSH");
  public static final SubLSymbol VECTOR_PUSH_EXTEND =
    PACKAGE_CL.addExternalSymbol("VECTOR-PUSH-EXTEND");
  public static final SubLSymbol VECTORP =
    PACKAGE_CL.addExternalSymbol("VECTORP");
  public static final SubLSymbol WARN =
    PACKAGE_CL.addExternalSymbol("WARN");
  public static final SubLSymbol WARNING =
    PACKAGE_CL.addExternalSymbol("WARNING");
  public static final SubLSymbol WHEN =
    PACKAGE_CL.addExternalSymbol("WHEN");
  public static final SubLSymbol WILD_PATHNAME_P =
    PACKAGE_CL.addExternalSymbol("WILD-PATHNAME-P");
  public static final SubLSymbol WITH_ACCESSORS =
    PACKAGE_CL.addExternalSymbol("WITH-ACCESSORS");
  public static final SubLSymbol WITH_COMPILATION_UNIT =
    PACKAGE_CL.addExternalSymbol("WITH-COMPILATION-UNIT");
  public static final SubLSymbol WITH_CONDITION_RESTARTS =
    PACKAGE_CL.addExternalSymbol("WITH-CONDITION-RESTARTS");
  public static final SubLSymbol WITH_HASH_TABLE_ITERATOR =
    PACKAGE_CL.addExternalSymbol("WITH-HASH-TABLE-ITERATOR");
  public static final SubLSymbol WITH_INPUT_FROM_STRING =
    PACKAGE_CL.addExternalSymbol("WITH-INPUT-FROM-STRING");
  public static final SubLSymbol WITH_OPEN_FILE =
    PACKAGE_CL.addExternalSymbol("WITH-OPEN-FILE");
  public static final SubLSymbol WITH_OPEN_STREAM =
    PACKAGE_CL.addExternalSymbol("WITH-OPEN-STREAM");
  public static final SubLSymbol WITH_OUTPUT_TO_STRING =
    PACKAGE_CL.addExternalSymbol("WITH-OUTPUT-TO-STRING");
  public static final SubLSymbol WITH_PACKAGE_ITERATOR =
    PACKAGE_CL.addExternalSymbol("WITH-PACKAGE-ITERATOR");
  public static final SubLSymbol WITH_SIMPLE_RESTART =
    PACKAGE_CL.addExternalSymbol("WITH-SIMPLE-RESTART");
  public static final SubLSymbol WITH_SLOTS =
    PACKAGE_CL.addExternalSymbol("WITH-SLOTS");
  public static final SubLSymbol WITH_STANDARD_IO_SYNTAX =
    PACKAGE_CL.addExternalSymbol("WITH-STANDARD-IO-SYNTAX");
  public static final SubLSymbol WRITE =
    PACKAGE_CL.addExternalSymbol("WRITE");
  public static final SubLSymbol WRITE_BYTE =
    PACKAGE_CL.addExternalSymbol("WRITE-BYTE");
  public static final SubLSymbol WRITE_CHAR =
    PACKAGE_CL.addExternalSymbol("WRITE-CHAR");
  public static final SubLSymbol WRITE_LINE =
    PACKAGE_CL.addExternalSymbol("WRITE-LINE");
  public static final SubLSymbol WRITE_SEQUENCE =
    PACKAGE_CL.addExternalSymbol("WRITE-SEQUENCE");
  public static final SubLSymbol WRITE_STRING =
    PACKAGE_CL.addExternalSymbol("WRITE-STRING");
  public static final SubLSymbol WRITE_TO_STRING =
    PACKAGE_CL.addExternalSymbol("WRITE-TO-STRING");
  public static final SubLSymbol Y_OR_N_P =
    PACKAGE_CL.addExternalSymbol("Y-OR-N-P");
  public static final SubLSymbol YES_OR_NO_P =
    PACKAGE_CL.addExternalSymbol("YES-OR-NO-P");
  public static final SubLSymbol ZEROP =
    PACKAGE_CL.addExternalSymbol("ZEROP");
  // End of CL symbols.

  // Extensions.
  public static final SubLSymbol MOST_POSITIVE_JAVA_LONG =
    PACKAGE_EXT.addExternalSymbol("MOST-POSITIVE-JAVA-LONG");
  public static final SubLSymbol MOST_NEGATIVE_JAVA_LONG=
    PACKAGE_EXT.addExternalSymbol("MOST-NEGATIVE-JAVA-LONG");
  public static final SubLSymbol JAVA_COMPILED_FUNCTION =
  	PACKAGE_EXT.addExternalSymbol("JAVA-COMPILED-FUNCTION");
  public static final SubLSymbol SINGLE_FLOAT_POSITIVE_INFINITY =
    PACKAGE_EXT.addExternalSymbol("SINGLE-FLOAT-POSITIVE-INFINITY");
  public static final SubLSymbol SINGLE_FLOAT_NEGATIVE_INFINITY =
    PACKAGE_EXT.addExternalSymbol("SINGLE-FLOAT-NEGATIVE-INFINITY");
  public static final SubLSymbol DOUBLE_FLOAT_POSITIVE_INFINITY =
    PACKAGE_EXT.addExternalSymbol("DOUBLE-FLOAT-POSITIVE-INFINITY");
  public static final SubLSymbol DOUBLE_FLOAT_NEGATIVE_INFINITY =
    PACKAGE_EXT.addExternalSymbol("DOUBLE-FLOAT-NEGATIVE-INFINITY");
  public static final SubLSymbol STYLE_WARN =
    PACKAGE_EXT.addExternalSymbol("STYLE-WARN");
  public static final SubLSymbol MEMQ =
    PACKAGE_EXT.addExternalSymbol("MEMQ");
  public static final SubLSymbol MEMQL =
    PACKAGE_EXT.addExternalSymbol("MEMQL");
  public static final SubLSymbol NIL_VECTOR =
    PACKAGE_EXT.addExternalSymbol("NIL-VECTOR");
  public static final SubLSymbol COMPILER_ERROR =
    PACKAGE_EXT.addExternalSymbol("COMPILER-ERROR");
  public static final SubLSymbol COMPILER_UNSUPPORTED_FEATURE_ERROR =
    PACKAGE_EXT.addExternalSymbol("COMPILER-UNSUPPORTED-FEATURE-ERROR");
  public static final SubLSymbol MAILBOX =
    PACKAGE_EXT.addExternalSymbol("MAILBOX");
  public static final SubLSymbol MUTEX =
    PACKAGE_EXT.addExternalSymbol("MUTEX");
  public static final SubLSymbol THREAD =
    PACKAGE_EXT.addExternalSymbol("THREAD");
  public static final SubLSymbol SUPPRESS_COMPILER_WARNINGS =
    PACKAGE_EXT.addExternalSymbol("*SUPPRESS-COMPILER-WARNINGS*");
  public static final SubLSymbol NEQ =
    PACKAGE_EXT.addExternalSymbol("NEQ");
  public static final SubLSymbol ADJOIN_EQL =
    PACKAGE_EXT.addExternalSymbol("ADJOIN-EQL");
  public static final SubLSymbol CHARACTER_DESIGNATOR =
    PACKAGE_EXT.addExternalSymbol("CHARACTER-DESIGNATOR");
  public static final SubLSymbol INTERRUPT_LISP =
    PACKAGE_EXT.addExternalSymbol("INTERRUPT-LISP");
  public static final SubLSymbol GETENV =
    PACKAGE_EXT.addExternalSymbol("GETENV");
  public static final SubLSymbol MACROEXPAND_ALL =
    PACKAGE_EXT.addExternalSymbol("MACROEXPAND-ALL");
  public static final SubLSymbol LOAD_TRUENAME_FASL =
    PACKAGE_EXT.addExternalSymbol("*LOAD-TRUENAME-FASL*");
  public static final SubLSymbol SLIME_INPUT_STREAM =
    PACKAGE_EXT.addExternalSymbol("SLIME-INPUT-STREAM");
  public static final SubLSymbol SLIME_OUTPUT_STREAM =
    PACKAGE_EXT.addExternalSymbol("SLIME-OUTPUT-STREAM");

  // MOP.
  public static final SubLSymbol STANDARD_READER_METHOD =
    PACKAGE_MOP.addExternalSymbol("STANDARD-READER-METHOD");

  // Java interface.
  public static final SubLSymbol JAVA_EXCEPTION =
    PACKAGE_JAVA.addExternalSymbol("JAVA-EXCEPTION");
  public static final SubLSymbol JAVA_EXCEPTION_CAUSE =
    PACKAGE_JAVA.addExternalSymbol("JAVA-EXCEPTION-CAUSE");
  public static final SubLSymbol JAVA_OBJECT =
    PACKAGE_JAVA.addExternalSymbol("JAVA-OBJECT");
  public static final SubLSymbol JAVA_CLASS =
	    PACKAGE_JAVA.addExternalSymbol("JAVA-CLASS");
  public static final SubLSymbol JCALL =
    PACKAGE_JAVA.addExternalSymbol("JCALL");
  public static final SubLSymbol JCALL_RAW =
    PACKAGE_JAVA.addExternalSymbol("JCALL-RAW");
  public static final SubLSymbol JCLASS =
    PACKAGE_JAVA.addExternalSymbol("JCLASS");
  public static final SubLSymbol JCLASS_NAME =
    PACKAGE_JAVA.addExternalSymbol("JCLASS-NAME");
  public static final SubLSymbol JCLASS_OF =
    PACKAGE_JAVA.addExternalSymbol("JCLASS-OF");
  public static final SubLSymbol JMETHOD_RETURN_TYPE =
    PACKAGE_JAVA.addExternalSymbol("JMETHOD-RETURN-TYPE");

  // External symbols in SYSTEM package.
  public static final SubLSymbol _ENABLE_AUTOCOMPILE_ =
    PACKAGE_SYS.addExternalSymbol("*ENABLE-AUTOCOMPILE*");
  public static final SubLSymbol AUTOCOMPILE =
    PACKAGE_SYS.addExternalSymbol("AUTOCOMPILE");
  public static final SubLSymbol ENVIRONMENT =
    PACKAGE_SYS.addExternalSymbol("ENVIRONMENT");
  public static final SubLSymbol FORWARD_REFERENCED_CLASS =
    PACKAGE_SYS.addExternalSymbol("FORWARD-REFERENCED-CLASS");
  public static final SubLSymbol CLASS_BYTES =
    PACKAGE_SYS.addExternalSymbol("CLASS-BYTES");
  public static final SubLSymbol _CLASS_SLOTS =
    PACKAGE_SYS.addExternalSymbol("%CLASS-SLOTS");
  public static final SubLSymbol LAYOUT =
    PACKAGE_SYS.addExternalSymbol("LAYOUT");
  public static final SubLSymbol NAMED_LAMBDA =
    PACKAGE_SYS.addExternalSymbol("NAMED-LAMBDA");
  public static final SubLSymbol OUTPUT_OBJECT =
    PACKAGE_SYS.addExternalSymbol("OUTPUT-OBJECT");
  public static final SubLSymbol SET_CLASS_SLOTS =
    PACKAGE_SYS.addExternalSymbol("SET-CLASS-SLOTS");
  public static final SubLSymbol SETF_FUNCTION =
    PACKAGE_SYS.addExternalSymbol("SETF-FUNCTION");
  public static final SubLSymbol SETF_INVERSE =
    PACKAGE_SYS.addExternalSymbol("SETF-INVERSE");
  public static final SubLSymbol SLOT_DEFINITION =
    PACKAGE_SYS.addExternalSymbol("SLOT-DEFINITION");
  public static final SubLSymbol _SLOT_DEFINITION_NAME =
    PACKAGE_SYS.addExternalSymbol("%SLOT-DEFINITION-NAME");
  public static final SubLSymbol _SLOT_DEFINITION_INITARGS =
    PACKAGE_SYS.addExternalSymbol("%SLOT-DEFINITION-INITARGS");
  public static final SubLSymbol _SLOT_DEFINITION_INITFUNCTION =
    PACKAGE_SYS.addExternalSymbol("%SLOT-DEFINITION-INITFUNCTION");
  public static final SubLSymbol _DOCUMENTATION =
    PACKAGE_SYS.addExternalSymbol("%DOCUMENTATION");
  public static final SubLSymbol STD_SLOT_BOUNDP =
    PACKAGE_SYS.addExternalSymbol("STD-SLOT-BOUNDP");
  public static final SubLSymbol STD_SLOT_VALUE =
    PACKAGE_SYS.addExternalSymbol("STD-SLOT-VALUE");
  public static final SubLSymbol SET_STD_SLOT_VALUE =
    PACKAGE_SYS.addExternalSymbol("SET-STD-SLOT-VALUE");
  public static final SubLSymbol SUBCLASSP =
    PACKAGE_SYS.addExternalSymbol("SUBCLASSP");
  public static final SubLSymbol GETHASH1 =
    PACKAGE_SYS.addExternalSymbol("GETHASH1");
  public static final SubLSymbol PUTHASH =
    PACKAGE_SYS.addExternalSymbol("PUTHASH");
  public static final SubLSymbol UNDEFINED_FUNCTION_CALLED =
    PACKAGE_SYS.addExternalSymbol("UNDEFINED-FUNCTION-CALLED");
  public static final SubLSymbol SET_CHAR =
    PACKAGE_SYS.addExternalSymbol("SET-CHAR");
  public static final SubLSymbol SET_SCHAR =
    PACKAGE_SYS.addExternalSymbol("SET-SCHAR");

  // Internal symbols in SYSTEM package.
  public static final SubLSymbol BACKQUOTE_MACRO =
    PACKAGE_SYS.addInternalSymbol("BACKQUOTE-MACRO");
  public static final SubLSymbol CASE_FROB_STREAM =
    PACKAGE_SYS.addInternalSymbol("CASE-FROB-STREAM");
  public static final SubLSymbol CAUSE =
    PACKAGE_SYS.addInternalSymbol("CAUSE");
  public static final SubLSymbol COMMA_MACRO =
    PACKAGE_SYS.addInternalSymbol("COMMA-MACRO");
  public static final SubLSymbol DATUM =
    PACKAGE_SYS.addInternalSymbol("DATUM");
  public static final SubLSymbol DEFTYPE_DEFINITION =
    PACKAGE_SYS.addInternalSymbol("DEFTYPE-DEFINITION");
  public static final SubLSymbol EXPECTED_TYPE =
    PACKAGE_SYS.addInternalSymbol("EXPECTED-TYPE");
  public static final SubLSymbol FORMAT_ARGUMENTS =
    PACKAGE_SYS.addInternalSymbol("FORMAT-ARGUMENTS");
  public static final SubLSymbol FORMAT_CONTROL =
    PACKAGE_SYS.addInternalSymbol("FORMAT-CONTROL");
  public static final SubLSymbol FSET =
    PACKAGE_SYS.addInternalSymbol("FSET");
  public static final SubLSymbol FUNCTION_PRELOAD =
    PACKAGE_SYS.addInternalSymbol("FUNCTION-PRELOAD");
  public static final SubLSymbol INSTANCE =
    PACKAGE_SYS.addInternalSymbol("INSTANCE");
  public static final SubLSymbol MACROEXPAND_MACRO =
    PACKAGE_SYS.addInternalSymbol("MACROEXPAND-MACRO");
  public static final SubLSymbol MAKE_FUNCTION_PRELOADING_CONTEXT =
    PACKAGE_SYS.addInternalSymbol("MAKE-FUNCTION-PRELOADING-CONTEXT");
  public static final SubLSymbol NAME =
    PACKAGE_SYS.addInternalSymbol("NAME");
  public static final SubLSymbol OBJECT =
    PACKAGE_SYS.addInternalSymbol("OBJECT");
  public static final SubLSymbol OPERANDS =
    PACKAGE_SYS.addInternalSymbol("OPERANDS");
  public static final SubLSymbol OPERATION =
    PACKAGE_SYS.addInternalSymbol("OPERATION");
  public static final SubLSymbol PROXY_PRELOADED_FUNCTION =
    PACKAGE_SYS.addInternalSymbol("PROXY-PRELOADED-FUNCTION");
  public static final SubLSymbol _SOURCE =
    PACKAGE_SYS.addInternalSymbol("%SOURCE");
  public static final SubLSymbol SOCKET_STREAM =
    PACKAGE_SYS.addInternalSymbol("SOCKET-STREAM");
  public static final SubLSymbol STRING_INPUT_STREAM =
    PACKAGE_SYS.addInternalSymbol("STRING-INPUT-STREAM");
  public static final SubLSymbol STRING_OUTPUT_STREAM =
    PACKAGE_SYS.addInternalSymbol("STRING-OUTPUT-STREAM");
  public static final SubLSymbol SYSTEM_STREAM =
    PACKAGE_SYS.addInternalSymbol("SYSTEM-STREAM");
  public static final SubLSymbol STACK_FRAME =
    PACKAGE_SYS.addInternalSymbol("STACK-FRAME");
  public static final SubLSymbol LISP_STACK_FRAME =
    PACKAGE_SYS.addInternalSymbol("LISP-STACK-FRAME");
  public static final SubLSymbol JAVA_STACK_FRAME =
    PACKAGE_SYS.addInternalSymbol("JAVA-STACK-FRAME");

  // CDR6
  public static final SubLSymbol _INSPECTOR_HOOK_ =
    PACKAGE_EXT.addExternalSymbol("*INSPECTOR-HOOK*");

  public static final SubLSymbol COMPILER_LET=
    PACKAGE_LISP.addExternalSymbol("COMPILER-LET");
}
