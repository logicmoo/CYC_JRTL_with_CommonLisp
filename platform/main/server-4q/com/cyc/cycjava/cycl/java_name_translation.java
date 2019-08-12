/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class java_name_translation extends SubLTranslatedFile implements V12 {
    private static final SubLObject _constant_30_initializer() {
        return list(new SubLObject[]{ cons(T, makeString("T")), cons(NIL, makeString("NIL")), cons(EQ, makeString("EQ")), cons(EQL, makeString("EQL")), cons(EQUAL, makeString("EQUAL")), cons(EQUALP, makeString("EQUALP")), cons(IDENTITY, makeString("IDENTITY")), cons(MINUS_ONE_INTEGER, makeString("MINUS_ONE_INTEGER")), cons(ZERO_INTEGER, makeString("ZERO_INTEGER")), cons(ONE_INTEGER, makeString("ONE_INTEGER")), cons(TWO_INTEGER, makeString("TWO_INTEGER")), cons(THREE_INTEGER, makeString("THREE_INTEGER")), cons(FOUR_INTEGER, makeString("FOUR_INTEGER")), cons(FIVE_INTEGER, makeString("FIVE_INTEGER")), cons(SIX_INTEGER, makeString("SIX_INTEGER")), cons(SEVEN_INTEGER, makeString("SEVEN_INTEGER")), cons(EIGHT_INTEGER, makeString("EIGHT_INTEGER")), cons(NINE_INTEGER, makeString("NINE_INTEGER")), cons(TEN_INTEGER, makeString("TEN_INTEGER")), cons(ELEVEN_INTEGER, makeString("ELEVEN_INTEGER")), cons(TWELVE_INTEGER, makeString("TWELVE_INTEGER")), cons(THIRTEEN_INTEGER, makeString("THIRTEEN_INTEGER")), cons(FOURTEEN_INTEGER, makeString("FOURTEEN_INTEGER")), cons(FIFTEEN_INTEGER, makeString("FIFTEEN_INTEGER")), cons(SIXTEEN_INTEGER, makeString("SIXTEEN_INTEGER")), cons(SEVENTEEN_INTEGER, makeString("SEVENTEEN_INTEGER")), cons(EIGHTEEN_INTEGER, makeString("EIGHTEEN_INTEGER")), cons(NINETEEN_INTEGER, makeString("NINETEEN_INTEGER")), cons(TWENTY_INTEGER, makeString("TWENTY_INTEGER")), cons(CHAR_null, makeString("Characters.CHAR_null")), cons(CHAR_backspace, makeString("Characters.CHAR_backspace")), cons(CHAR_tab, makeString("Characters.CHAR_tab")), cons(CHAR_newline, makeString("Characters.CHAR_newline")), cons(CHAR_return, makeString("Characters.CHAR_return")), cons(CHAR_page, makeString("Characters.CHAR_page")), cons(CHAR_escape, makeString("Characters.CHAR_escape")), cons(CHAR_space, makeString("Characters.CHAR_space")), cons(CHAR_exclamation, makeString("Characters.CHAR_exclamation")), cons(CHAR_quotation, makeString("Characters.CHAR_quotation")), cons(CHAR_hash, makeString("Characters.CHAR_hash")), cons(CHAR_dollar, makeString("Characters.CHAR_dollar")), cons(CHAR_percent, makeString("Characters.CHAR_percent")), cons(CHAR_ampersand, makeString("Characters.CHAR_ampersand")), cons(CHAR_quote, makeString("Characters.CHAR_quote")), cons(CHAR_lparen, makeString("Characters.CHAR_lparen")), cons(CHAR_rparen, makeString("Characters.CHAR_rparen")), cons(CHAR_asterisk, makeString("Characters.CHAR_asterisk")), cons(CHAR_plus, makeString("Characters.CHAR_plus")), cons(CHAR_comma, makeString("Characters.CHAR_comma")), cons(CHAR_hyphen, makeString("Characters.CHAR_hyphen")), cons(CHAR_period, makeString("Characters.CHAR_period")), cons(CHAR_slash, makeString("Characters.CHAR_slash")), cons(CHAR_0, makeString("Characters.CHAR_0")), cons(CHAR_1, makeString("Characters.CHAR_1")), cons(CHAR_2, makeString("Characters.CHAR_2")), cons(CHAR_3, makeString("Characters.CHAR_3")), cons(CHAR_4, makeString("Characters.CHAR_4")), cons(CHAR_5, makeString("Characters.CHAR_5")), cons(CHAR_6, makeString("Characters.CHAR_6")), cons(CHAR_7, makeString("Characters.CHAR_7")), cons(CHAR_8, makeString("Characters.CHAR_8")), cons(CHAR_9, makeString("Characters.CHAR_9")), cons(CHAR_colon, makeString("Characters.CHAR_colon")), cons(CHAR_semicolon, makeString("Characters.CHAR_semicolon")), cons(CHAR_less, makeString("Characters.CHAR_less")), cons(CHAR_equal, makeString("Characters.CHAR_equal")), cons(CHAR_greater, makeString("Characters.CHAR_greater")), cons(CHAR_question, makeString("Characters.CHAR_question")), cons(CHAR_at, makeString("Characters.CHAR_at")), cons(CHAR_A, makeString("Characters.CHAR_A")), cons(CHAR_B, makeString("Characters.CHAR_B")), cons(CHAR_C, makeString("Characters.CHAR_C")), cons(CHAR_D, makeString("Characters.CHAR_D")), cons(CHAR_E, makeString("Characters.CHAR_E")), cons(CHAR_F, makeString("Characters.CHAR_F")), cons(CHAR_G, makeString("Characters.CHAR_G")), cons(CHAR_H, makeString("Characters.CHAR_H")), cons(CHAR_I, makeString("Characters.CHAR_I")), cons(CHAR_J, makeString("Characters.CHAR_J")), cons(CHAR_K, makeString("Characters.CHAR_K")), cons(CHAR_L, makeString("Characters.CHAR_L")), cons(CHAR_M, makeString("Characters.CHAR_M")), cons(CHAR_N, makeString("Characters.CHAR_N")), cons(CHAR_O, makeString("Characters.CHAR_O")), cons(CHAR_P, makeString("Characters.CHAR_P")), cons(CHAR_Q, makeString("Characters.CHAR_Q")), cons(CHAR_R, makeString("Characters.CHAR_R")), cons(CHAR_S, makeString("Characters.CHAR_S")), cons(CHAR_T, makeString("Characters.CHAR_T")), cons(CHAR_U, makeString("Characters.CHAR_U")), cons(CHAR_V, makeString("Characters.CHAR_V")), cons(CHAR_W, makeString("Characters.CHAR_W")), cons(CHAR_X, makeString("Characters.CHAR_X")), cons(CHAR_Y, makeString("Characters.CHAR_Y")), cons(CHAR_Z, makeString("Characters.CHAR_Z")), cons(CHAR_lbracket, makeString("Characters.CHAR_lbracket")), cons(CHAR_backslash, makeString("Characters.CHAR_backslash")), cons(CHAR_rbracket, makeString("Characters.CHAR_rbracket")), cons(CHAR_caret, makeString("Characters.CHAR_caret")), cons(CHAR_underbar, makeString("Characters.CHAR_underbar")), cons(CHAR_backquote, makeString("Characters.CHAR_backquote")), cons(CHAR_a, makeString("Characters.CHAR_a")), cons(CHAR_b, makeString("Characters.CHAR_b")), cons(CHAR_c, makeString("Characters.CHAR_c")), cons(CHAR_d, makeString("Characters.CHAR_d")), cons(CHAR_e, makeString("Characters.CHAR_e")), cons(CHAR_f, makeString("Characters.CHAR_f")), cons(CHAR_g, makeString("Characters.CHAR_g")), cons(CHAR_h, makeString("Characters.CHAR_h")), cons(CHAR_i, makeString("Characters.CHAR_i")), cons(CHAR_j, makeString("Characters.CHAR_j")), cons(CHAR_k, makeString("Characters.CHAR_k")), cons(CHAR_l, makeString("Characters.CHAR_l")), cons(CHAR_m, makeString("Characters.CHAR_m")), cons(CHAR_n, makeString("Characters.CHAR_n")), cons(CHAR_o, makeString("Characters.CHAR_o")), cons(CHAR_p, makeString("Characters.CHAR_p")), cons(CHAR_q, makeString("Characters.CHAR_q")), cons(CHAR_r, makeString("Characters.CHAR_r")), cons(CHAR_s, makeString("Characters.CHAR_s")), cons(CHAR_t, makeString("Characters.CHAR_t")), cons(CHAR_u, makeString("Characters.CHAR_u")), cons(CHAR_v, makeString("Characters.CHAR_v")), cons(CHAR_w, makeString("Characters.CHAR_w")), cons(CHAR_x, makeString("Characters.CHAR_x")), cons(CHAR_y, makeString("Characters.CHAR_y")), cons(CHAR_z, makeString("Characters.CHAR_z")), cons(CHAR_lbrace, makeString("Characters.CHAR_lbrace")), cons(CHAR_vertical, makeString("Characters.CHAR_vertical")), cons(CHAR_rbrace, makeString("Characters.CHAR_rbrace")), cons(CHAR_tilde, makeString("Characters.CHAR_tilde")), cons(CHAR_rubout, makeString("Characters.CHAR_rubout")) });
    }

    public static final SubLFile me = new java_name_translation();

 public static final String myName = "com.cyc.cycjava.cycl.java_name_translation";


    // deflexical
    @LispMethod(comment = "The complete list of Java language reserved words that cannot be used as identifiers in programs.\r\nSee http://java.sun.com/docs/books/tutorial/java/nutsandbolts/_keywords.html\ndeflexical\nThe complete list of Java language reserved words that cannot be used as identifiers in programs.\nSee http://java.sun.com/docs/books/tutorial/java/nutsandbolts/_keywords.html")
    // Definitions
    /**
     * The complete list of Java language reserved words that cannot be used as identifiers in programs.
     * See http://java.sun.com/docs/books/tutorial/java/nutsandbolts/_keywords.html
     */
    private static final SubLSymbol $java_backend_reserved_words$ = makeSymbol("*JAVA-BACKEND-RESERVED-WORDS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $java_backend_defined_function_class_data$ = makeSymbol("*JAVA-BACKEND-DEFINED-FUNCTION-CLASS-DATA*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $java_backend_defined_function_name_exceptions$ = makeSymbol("*JAVA-BACKEND-DEFINED-FUNCTION-NAME-EXCEPTIONS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $java_backend_undefined_function_name_data$ = makeSymbol("*JAVA-BACKEND-UNDEFINED-FUNCTION-NAME-DATA*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $java_backend_function_arity_version_table$ = makeSymbol("*JAVA-BACKEND-FUNCTION-ARITY-VERSION-TABLE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $java_backend_undefined_arity_function_name_data$ = makeSymbol("*JAVA-BACKEND-UNDEFINED-ARITY-FUNCTION-NAME-DATA*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $java_backend_function_boolean_method_table$ = makeSymbol("*JAVA-BACKEND-FUNCTION-BOOLEAN-METHOD-TABLE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $java_backend_function_boolean_hash$ = makeSymbol("*JAVA-BACKEND-FUNCTION-BOOLEAN-HASH*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $java_backend_function_to_method_table$ = makeSymbol("*JAVA-BACKEND-FUNCTION-TO-METHOD-TABLE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $java_backend_function_to_method_hash$ = makeSymbol("*JAVA-BACKEND-FUNCTION-TO-METHOD-HASH*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $java_backend_function_class_table$ = makeSymbol("*JAVA-BACKEND-FUNCTION-CLASS-TABLE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $java_backend_function_name_table$ = makeSymbol("*JAVA-BACKEND-FUNCTION-NAME-TABLE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $java_backend_function_arglist_table$ = makeSymbol("*JAVA-BACKEND-FUNCTION-ARGLIST-TABLE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $java_backend_predefined_constant_table$ = makeSymbol("*JAVA-BACKEND-PREDEFINED-CONSTANT-TABLE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $java_backend_defined_global_name_data$ = makeSymbol("*JAVA-BACKEND-DEFINED-GLOBAL-NAME-DATA*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $java_backend_undefined_global_name_data$ = makeSymbol("*JAVA-BACKEND-UNDEFINED-GLOBAL-NAME-DATA*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $java_backend_global_class_table$ = makeSymbol("*JAVA-BACKEND-GLOBAL-CLASS-TABLE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $java_backend_global_name_table$ = makeSymbol("*JAVA-BACKEND-GLOBAL-NAME-TABLE*");

    private static final SubLList $list0 = list(new SubLObject[]{ makeString("abstract"), makeString("assert"), makeString("boolean"), makeString("break"), makeString("byte"), makeString("case"), makeString("catch"), makeString("char"), makeString("class"), makeString("const"), makeString("continue"), makeString("default"), makeString("do"), makeString("double"), makeString("else"), makeString("enum"), makeString("extends"), makeString("false"), makeString("final"), makeString("finally"), makeString("float"), makeString("for"), makeString("goto"), makeString("if"), makeString("implements"), makeString("import"), makeString("instanceof"), makeString("int"), makeString("interface"), makeString("long"), makeString("native"), makeString("new"), makeString("null"), makeString("package"), makeString("private"), makeString("protected"), makeString("public"), makeString("return"), makeString("short"), makeString("static"), makeString("strictfp"), makeString("super"), makeString("switch"), makeString("synchronized"), makeString("this"), makeString("throw"), makeString("throws"), makeString("transient"), makeString("true"), makeString("try"), makeString("void"), makeString("volatile"), makeString("while") });

    private static final SubLObject $list1 = _constant_1_initializer();

    private static final SubLList $list2 = list(makeSymbol("CLASS-NAME"), makeSymbol("SYMBOLS"));

    private static final SubLList $list3 = list(new SubLObject[]{ list(makeSymbol("*"), makeString("multiply")), list(makeSymbol("+"), makeString("add")), list(makeSymbol("-"), makeString("subtract")), list(makeSymbol("/"), makeString("divide")), list(makeSymbol("INT/"), makeString("integerDivide")), list(makeSymbol("FIXNUM*"), makeString("fixnumMultiply")), list(makeSymbol("/="), makeString("numNE")), list(makeSymbol("<"), makeString("numL")), list(makeSymbol("<="), makeString("numLE")), list(makeSymbol("="), makeString("numE")), list(makeSymbol(">"), makeString("numG")), list(makeSymbol(">="), makeString("numGE")), list(makeSymbol("CHAR/="), makeString("charNE")), list(makeSymbol("CHAR<"), makeString("charL")), list(makeSymbol("CHAR<="), makeString("charLE")), list(makeSymbol("CHAR="), makeString("charE")), list(makeSymbol("CHAR>"), makeString("charG")), list(makeSymbol("CHAR>="), makeString("charGE")), list(makeSymbol("GUID/="), makeString("guidNE")), list(makeSymbol("GUID<"), makeString("guidL")), list(makeSymbol("GUID<="), makeString("guidLE")), list(makeSymbol("GUID="), makeString("guidE")), list(makeSymbol("GUID>"), makeString("guidG")), list(makeSymbol("GUID>="), makeString("guidGE")), list(makeSymbol("NULL"), makeString("sublisp_null")), list(makeSymbol("STRING/="), makeString("stringNE")), list(makeSymbol("STRING<"), makeString("stringL")), list(makeSymbol("STRING<="), makeString("stringLE")), list(makeSymbol("STRING="), makeString("stringE")), list(makeSymbol("STRING>"), makeString("stringG")), list(makeSymbol("STRING>="), makeString("stringGE")), list(makeSymbol("LIST*"), makeString("listS")), list(makeSymbol("BQ-LIST*"), makeString("bq_listS")) });

    private static final SubLObject $list4 = _constant_4_initializer();

    private static final SubLList $list5 = list(makeSymbol("OPERATOR"), makeSymbol("&REST"), makeSymbol("ARGS"));

    private static final SubLList $list6 = list(new SubLObject[]{ list(makeSymbol("*"), cons(TWO_INTEGER, makeSymbol("%MULT2")), cons(THREE_INTEGER, makeSymbol("%MULT3"))), list(makeSymbol("+"), cons(TWO_INTEGER, makeSymbol("%ADD2")), cons(THREE_INTEGER, makeSymbol("%ADD3"))), list(makeSymbol("-"), cons(ONE_INTEGER, makeSymbol("%MINUS")), cons(TWO_INTEGER, makeSymbol("%SUB2")), cons(THREE_INTEGER, makeSymbol("%SUB3"))), list(makeSymbol("/"), cons(ONE_INTEGER, makeSymbol("%INVERT")), cons(TWO_INTEGER, makeSymbol("%DIV2"))), list(makeSymbol("APPEND"), cons(TWO_INTEGER, makeSymbol("%APPEND2")), cons(THREE_INTEGER, makeSymbol("%APPEND3")), cons(FOUR_INTEGER, makeSymbol("%APPEND4"))), list(makeSymbol("APPLY"), cons(TWO_INTEGER, makeSymbol("%APPLY2")), cons(THREE_INTEGER, makeSymbol("%APPLY3"))), list(makeSymbol("CCONCATENATE"), cons(TWO_INTEGER, makeSymbol("%CONCAT2"))), list(makeSymbol("CERROR"), cons(TWO_INTEGER, makeSymbol("%CERROR2")), cons(THREE_INTEGER, makeSymbol("%CERROR3")), cons(FOUR_INTEGER, makeSymbol("%CERROR4")), cons(FIVE_INTEGER, makeSymbol("%CERROR5"))), list(makeSymbol("ERROR"), cons(ONE_INTEGER, makeSymbol("%ERROR1")), cons(TWO_INTEGER, makeSymbol("%ERROR2")), cons(THREE_INTEGER, makeSymbol("%ERROR3")), cons(FOUR_INTEGER, makeSymbol("%ERROR4"))), list(makeSymbol("FALSE"), cons(ZERO_INTEGER, makeSymbol("%FALSE0")), cons(ONE_INTEGER, makeSymbol("%FALSE1")), cons(TWO_INTEGER, makeSymbol("%FALSE2"))), list(makeSymbol("FORMAT"), cons(TWO_INTEGER, makeSymbol("%FORMAT2")), cons(THREE_INTEGER, makeSymbol("%FORMAT3")), cons(FOUR_INTEGER, makeSymbol("%FORMAT4"))), list(makeSymbol("FUNCALL"), cons(ONE_INTEGER, makeSymbol("%FUNCALL1")), cons(TWO_INTEGER, makeSymbol("%FUNCALL2")), cons(THREE_INTEGER, makeSymbol("%FUNCALL3")), cons(FOUR_INTEGER, makeSymbol("%FUNCALL4")), cons(FIVE_INTEGER, makeSymbol("%FUNCALL5")), cons(SIX_INTEGER, makeSymbol("%FUNCALL6")), cons(SEVEN_INTEGER, makeSymbol("%FUNCALL7"))), list(new SubLObject[]{ makeSymbol("LIST"), cons(ONE_INTEGER, makeSymbol("%LIST1")), cons(TWO_INTEGER, makeSymbol("%LIST2")), cons(THREE_INTEGER, makeSymbol("%LIST3")), cons(FOUR_INTEGER, makeSymbol("%LIST4")), cons(FIVE_INTEGER, makeSymbol("%LIST5")), cons(SIX_INTEGER, makeSymbol("%LIST6")), cons(SEVEN_INTEGER, makeSymbol("%LIST7")), cons(EIGHT_INTEGER, makeSymbol("%LIST8")) }), list(makeSymbol("LIST*"), cons(ONE_INTEGER, makeSymbol("%LIST*1")), cons(TWO_INTEGER, makeSymbol("%LIST*2")), cons(THREE_INTEGER, makeSymbol("%LIST*3")), cons(FOUR_INTEGER, makeSymbol("%LIST*4")), cons(FIVE_INTEGER, makeSymbol("%LIST*5")), cons(SIX_INTEGER, makeSymbol("%LIST*6"))), list(makeSymbol("LOGAND"), cons(TWO_INTEGER, makeSymbol("%LOGAND2"))), list(makeSymbol("LOGIOR"), cons(TWO_INTEGER, makeSymbol("%LOGIOR2")), cons(THREE_INTEGER, makeSymbol("%LOGIOR3"))), list(makeSymbol("LOGXOR"), cons(TWO_INTEGER, makeSymbol("%LOGXOR2"))), list(makeSymbol("MAPCAR"), cons(TWO_INTEGER, makeSymbol("%MAPCAR2"))), list(makeSymbol("MAX"), cons(TWO_INTEGER, makeSymbol("%MAX2"))), list(makeSymbol("MIN"), cons(TWO_INTEGER, makeSymbol("%MIN2"))), list(makeSymbol("NCONC"), cons(TWO_INTEGER, makeSymbol("%NCONC2")), cons(THREE_INTEGER, makeSymbol("%NCONC3"))), list(makeSymbol("STRING<="), cons(TWO_INTEGER, makeSymbol("%STRING<=2"))), list(makeSymbol("TRUE"), cons(ZERO_INTEGER, makeSymbol("%TRUE0")), cons(ONE_INTEGER, makeSymbol("%TRUE1")), cons(TWO_INTEGER, makeSymbol("%TRUE2"))), list(new SubLObject[]{ makeSymbol("VALUES"), cons(ONE_INTEGER, makeSymbol("%VALUES1")), cons(TWO_INTEGER, makeSymbol("%VALUES2")), cons(THREE_INTEGER, makeSymbol("%VALUES3")), cons(FOUR_INTEGER, makeSymbol("%VALUES4")), cons(FIVE_INTEGER, makeSymbol("%VALUES5")), cons(SIX_INTEGER, makeSymbol("%VALUES6")), cons(SEVEN_INTEGER, makeSymbol("%VALUES7")), cons(EIGHT_INTEGER, makeSymbol("%VALUES8")) }), list(makeSymbol("WARN"), cons(ONE_INTEGER, makeSymbol("%WARN1")), cons(TWO_INTEGER, makeSymbol("%WARN2")), cons(THREE_INTEGER, makeSymbol("%WARN3")), cons(FOUR_INTEGER, makeSymbol("%WARN4"))) });

    private static final SubLObject $list7 = _constant_7_initializer();

    private static final SubLSymbol $sym8$_DTB = makeSymbol("%DTB");

    private static final SubLSymbol $sym9$_BTD = makeSymbol("%BTD");

    private static final SubLSymbol $sym10$___ = makeSymbol("%==");

    private static final SubLList $list12 = list(makeSymbol("%PC"), NIL);

    private static final SubLSymbol $sym13$_METHOD = makeSymbol("%METHOD");

    private static final SubLSymbol $sym14$_NOT____ = makeSymbol("%NOT-%==");

    private static final SubLList $list15 = list(new SubLObject[]{ list(makeSymbol("ATOM"), makeString("isAtom")), list(makeSymbol("BIGNUMP"), makeString("isBignum")), list(makeSymbol("CHARACTERP"), makeString("isChar")), list(makeSymbol("CONSP"), makeString("isCons")), list(makeSymbol("FIXNUMP"), makeString("isFixnum")), list(makeSymbol("FLOATP"), makeString("isDouble")), list(makeSymbol("FUNCTION-SPEC-P"), makeString("isFunctionSpec")), list(makeSymbol("FUNCTIONP"), makeString("isFunction")), list(makeSymbol("HASH-TABLE-P"), makeString("isHashtable")), list(makeSymbol("INTEGERP"), makeString("isInteger")), list(makeSymbol("KEYWORDP"), makeString("isKeyword")), list(makeSymbol("LISTP"), makeString("isList")), list(makeSymbol("LOCK-P"), makeString("isLock")), list(makeSymbol("MACRO-OPERATOR-P"), makeString("isMacroOperator")), list(makeSymbol("NULL"), makeString("isNil")), list(makeSymbol("NUMBERP"), makeString("isNumber")), list(makeSymbol("PACKAGEP"), makeString("isPackage")), list(makeSymbol("PROCESS"), makeString("isProcess")), list(makeSymbol("SEQUENCEP"), makeString("isSequence")), list(makeSymbol("STREAMP"), makeString("isStream")), list(makeSymbol("STRINGP"), makeString("isString")), list(makeSymbol("STRUCTURE-P"), makeString("isStructure")), list(makeSymbol("SYMBOLP"), makeString("isSymbol")), list(makeSymbol("VECTORP"), makeString("isVector")), list(makeSymbol("PLUSP"), makeString("isPositive")), list(makeSymbol("MINUSP"), makeString("isNegative")), list(makeSymbol("ZEROP"), makeString("isZero")), list(EQL, makeString("eql")), list(EQUAL, makeString("equal")), list(EQUALP, makeString("equalp")), list(makeSymbol("<"), makeString("numL")), list(makeSymbol("<="), makeString("numLE")), list(makeSymbol(">"), makeString("numG")), list(makeSymbol(">="), makeString("numGE")), list(makeSymbol("="), makeString("numE")) });

    private static final SubLList $list17 = list(makeSymbol("FUNCTION"), makeSymbol("BOOLEAN-METHOD"));

    private static final SubLList $list18 = cons(makeSymbol("OPERATOR"), makeSymbol("ARGS"));

    private static final SubLList $list19 = list(list(makeSymbol("CAR"), makeString("first")), list(makeSymbol("FIRST"), makeString("first")), list(makeSymbol("CDR"), makeString("rest")), list(makeSymbol("REST"), makeString("rest")));

    private static final SubLList $list20 = list(makeSymbol("FUNCTION"), makeSymbol("METHOD"));

    private static final SubLInteger $int$500 = makeInteger(500);

    private static final SubLList $list22 = list(makeSymbol("CLASS-NAME"), makeSymbol("&OPTIONAL"), makeSymbol("SYMBOLS"));

    private static final SubLList $list23 = list(makeSymbol("SYMBOL"), makeSymbol("CLASS-NAME"), makeSymbol("JAVA-BACKEND-NAME"), makeSymbol("&OPTIONAL"), makeSymbol("ARGLIST"));

    private static final SubLSymbol JAVA_BACKEND_COMPUTED_FUNCTION_NAME = makeSymbol("JAVA-BACKEND-COMPUTED-FUNCTION-NAME");

    private static final SubLString $$$f = makeString("f");

    private static final SubLString $str26$sublisp_ = makeString("sublisp_");

    private static final SubLString $str27$f_ = makeString("f_");

    private static final SubLObject $list29 = _constant_29_initializer();

    private static final SubLList $list30 = list(new SubLObject[]{ list(makeSymbol("*BREAK-ON-ERROR?*"), makeString("Errors"), makeString("$break_on_errorP$")), list(makeSymbol("*BREAK-ON-WARN?*"), makeString("Errors"), makeString("$break_on_warnP$")), list(makeSymbol("*CONTINUE-CERROR?*"), makeString("Errors"), makeString("$continue_cerrorP$")), list(makeSymbol("*ERROR-ABORT-HANDLER*"), makeString("Errors"), makeString("$error_abort_handler$")), list(makeSymbol("*ERROR-HANDLER*"), makeString("Errors"), makeString("$error_handler$")), list(makeSymbol("*ERROR-MESSAGE*"), makeString("Errors"), makeString("$error_message$")), list(makeSymbol("*IGNORE-BREAKS?*"), makeString("Errors"), makeString("$ignore_breaksP$")), list(makeSymbol("*IGNORE-MUSTS?*"), makeString("Errors"), makeString("$ignore_mustsP$")), list(makeSymbol("*IGNORE-WARNS?*"), makeString("Errors"), makeString("$ignore_warnsP$")), list(makeSymbol("*"), makeString("Eval"), makeString("$star$")), list(makeSymbol("**"), makeString("Eval"), makeString("$star_star$")), list(makeSymbol("***"), makeString("Eval"), makeString("$star_star_star$")), list(makeSymbol("CALL-ARGUMENTS-LIMIT"), makeString("Functions"), makeString("$call_arguments_limit$")), list(makeSymbol("*EXP1*"), makeString("Numbers"), makeString("$exp1$")), list(makeSymbol("*MOST-NEGATIVE-FIXNUM*"), makeString("Numbers"), makeString("$most_negative_fixnum$")), list(makeSymbol("*MOST-POSITIVE-FIXNUM*"), makeString("Numbers"), makeString("$most_positive_fixnum$")), list(makeSymbol("*PI*"), makeString("Numbers"), makeString("$pi$")), list(makeSymbol("BOOLE-1"), makeString("Numbers"), makeString("$boole_1$")), list(makeSymbol("BOOLE-2"), makeString("Numbers"), makeString("$boole_2$")), list(makeSymbol("BOOLE-AND"), makeString("Numbers"), makeString("$boole_and$")), list(makeSymbol("BOOLE-ANDC1"), makeString("Numbers"), makeString("$boole_andc1$")), list(makeSymbol("BOOLE-ANDC2"), makeString("Numbers"), makeString("$boole_andc2$")), list(makeSymbol("BOOLE-C1"), makeString("Numbers"), makeString("$boole_c1$")), list(makeSymbol("BOOLE-C2"), makeString("Numbers"), makeString("$boole_c2$")), list(makeSymbol("BOOLE-CLR"), makeString("Numbers"), makeString("$boole_clr$")), list(makeSymbol("BOOLE-EQV"), makeString("Numbers"), makeString("$boole_eqv$")), list(makeSymbol("BOOLE-IOR"), makeString("Numbers"), makeString("$boole_ior$")), list(makeSymbol("BOOLE-NAND"), makeString("Numbers"), makeString("$boole_nand$")), list(makeSymbol("BOOLE-NOR"), makeString("Numbers"), makeString("$boole_nor$")), list(makeSymbol("BOOLE-ORC1"), makeString("Numbers"), makeString("$boole_orc1$")), list(makeSymbol("BOOLE-ORC2"), makeString("Numbers"), makeString("$boole_orc2$")), list(makeSymbol("BOOLE-SET"), makeString("Numbers"), makeString("$boole_set$")), list(makeSymbol("BOOLE-XOR"), makeString("Numbers"), makeString("$boole_xor$")), list(makeSymbol("*PACKAGE*"), makeString("Packages"), makeString("$package$")), list(makeSymbol("*RAND-MAX*"), makeString("random"), makeString("$rand_max$")), list(makeSymbol("*DEBUG-IO*"), makeString("StreamsLow"), makeString("$debug_io$")), list(makeSymbol("*ERROR-OUTPUT*"), makeString("StreamsLow"), makeString("$error_output$")), list(makeSymbol("*NULL-INPUT*"), makeString("StreamsLow"), makeString("$null_input$")), list(makeSymbol("*NULL-OUTPUT*"), makeString("StreamsLow"), makeString("$null_output$")), list(makeSymbol("*QUERY-IO*"), makeString("StreamsLow"), makeString("$query_io$")), list(makeSymbol("*STANDARD-INPUT*"), makeString("StreamsLow"), makeString("$standard_input$")), list(makeSymbol("*STANDARD-OUTPUT*"), makeString("StreamsLow"), makeString("$standard_output$")), list(makeSymbol("*STREAM-INITIAL-INPUT-BUFFER-SIZE*"), makeString("StreamsLow"), makeString("$stream_initial_input_buffer_size$")), list(makeSymbol("*STREAM-INITIAL-OUTPUT-BUFFER-SIZE*"), makeString("StreamsLow"), makeString("$stream_initial_output_buffer_size$")), list(makeSymbol("*TERMINAL-IO*"), makeString("StreamsLow"), makeString("$terminal_io$")), list(makeSymbol("*TRACE-OUTPUT*"), makeString("StreamsLow"), makeString("$trace_output$")), list(makeSymbol("*GENSYM-COUNTER*"), makeString("Symbols"), makeString("$gensym_counter$")), list(makeSymbol("*RETAIN-CLIENT-SOCKET?*"), makeString("Tcp"), makeString("$retain_client_socketP$")), list(makeSymbol("*TCP-LOCALHOST-ONLY?*"), makeString("Tcp"), makeString("$tcp_localhost_onlyP$")), list(makeSymbol("*PROCESS-MAX-PRIORITY*"), makeString("Threads"), makeString("$process_max_priority$")), list(makeSymbol("*PROCESS-CRITICAL-PRIORITY*"), makeString("Threads"), makeString("$process_critical_priority$")), list(makeSymbol("*PROCESS-NORMAL-PRIORITY*"), makeString("Threads"), makeString("$process_normal_priority$")), list(makeSymbol("*PROCESS-BACKGROUND-PRIORITY*"), makeString("Threads"), makeString("$process_background_priority$")), list(makeSymbol("*PROCESS-MIN-PRIORITY*"), makeString("Threads"), makeString("$process_min_priority$")), list(makeSymbol("*SUSPEND-TYPE-CHECKING?*"), makeString("Types"), makeString("$suspend_type_checkingP$")), list(makeSymbol("*MULTIPLE-VALUES-LIMIT*"), makeString("Values"), makeString("$multiple_values_limit$")), list(makeSymbol("*CALL-PROFILING-ENABLED?*", "SUBLISP"), makeString("complex_special_forms"), makeString("$call_profiling_enabledP$")), list(makeSymbol("*CALL-PROFILING-TABLE*", "SUBLISP"), makeString("complex_special_forms"), makeString("$call_profiling_table$")), list(makeSymbol("*PRINT-ARRAY*"), makeString("print_high"), makeString("$print_array$")), list(makeSymbol("*PRINT-BASE*"), makeString("print_high"), makeString("$print_base$")), list(makeSymbol("*PRINT-CASE*"), makeString("print_high"), makeString("$print_case$")), list(makeSymbol("*PRINT-CIRCLE*"), makeString("print_high"), makeString("$print_circle$")), list(makeSymbol("*PRINT-ESCAPE*"), makeString("print_high"), makeString("$print_escape$")), list(makeSymbol("*PRINT-GENSYM*"), makeString("print_high"), makeString("$print_gensym$")), list(makeSymbol("*PRINT-LENGTH*"), makeString("print_high"), makeString("$print_length$")), list(makeSymbol("*PRINT-LEVEL*"), makeString("print_high"), makeString("$print_level$")), list(makeSymbol("*PRINT-LINES*"), makeString("print_high"), makeString("$print_lines$")), list(makeSymbol("*PRINT-MISER-WIDTH*"), makeString("print_high"), makeString("$print_miser_width$")), list(makeSymbol("*PRINT-PPRINT-DISPATCH*"), makeString("print_high"), makeString("$print_pprint_dispatch$")), list(makeSymbol("*PRINT-PRETTY*"), makeString("print_high"), makeString("$print_pretty$")), list(makeSymbol("*PRINT-RADIX*"), makeString("print_high"), makeString("$print_radix$")), list(makeSymbol("*PRINT-READABLY*"), makeString("print_high"), makeString("$print_readably$")), list(makeSymbol("*PRINT-RIGHT-MARGIN*"), makeString("print_high"), makeString("$print_right_margin$")), list(makeSymbol("*FEATURES*"), makeString("reader"), makeString("$features$")), list(makeSymbol("*READ-BASE*"), makeString("reader"), makeString("$read_base$")), list(makeSymbol("*READ-DEFAULT-FLOAT-FORMAT*"), makeString("reader"), makeString("$read_default_float_format$")), list(makeSymbol("*READ-EVAL*"), makeString("reader"), makeString("$read_eval$")), list(makeSymbol("*READ-SUPPRESS*"), makeString("reader"), makeString("$read_suppress$")), list(makeSymbol("*READTABLE*"), makeString("reader"), makeString("$readtable$")), list(makeSymbol("*STREAM-REQUIRES-LOCKING*", "SUBLISP"), makeString("stream_macros"), makeString("$stream_requires_locking$")), list(makeSymbol("*INTERNAL-TIME-UNITS-PER-SECOND*"), makeString("time_high"), makeString("$internal_time_units_per_second$")) });

    private static final SubLList $list31 = list(new SubLObject[]{ list(makeSymbol("*IS-THREAD-PERFORMING-CLEANUP?*", "SUBLISP"), makeString("Threads"), makeString("$is_thread_performing_cleanupP$"), makeKeyword("DYNAMIC")), list(makeSymbol("*PRINT-OBJECT-METHOD-TABLE*", "SUBLISP"), makeString("print_high"), makeString("$print_object_method_table$"), makeKeyword("LEXICAL")), list(makeSymbol("*SXHASH-METHOD-TABLE*"), makeString("Sxhash"), makeString("$sxhash_method_table$"), makeKeyword("LEXICAL")), list(makeSymbol("*VISIT-DEFSTRUCT-OBJECT-METHOD-TABLE*", "SUBLISP"), makeString("visitation"), makeString("$visit_defstruct_object_method_table$"), makeKeyword("LEXICAL")), list(makeSymbol("*DTP-SYMBOL*"), makeString("Types"), makeString("$dtp_symbol$"), makeKeyword("CONSTANT")), list(makeSymbol("*DTP-CONS*"), makeString("Types"), makeString("$dtp_cons$"), makeKeyword("CONSTANT")), list(makeSymbol("*DTP-FIXNUM*"), makeString("Types"), makeString("$dtp_fixnum$"), makeKeyword("CONSTANT")), list(makeSymbol("*DTP-FLOAT*"), makeString("Types"), makeString("$dtp_float$"), makeKeyword("CONSTANT")), list(makeSymbol("*DTP-CHARACTER*"), makeString("Types"), makeString("$dtp_character$"), makeKeyword("CONSTANT")), list(makeSymbol("*DTP-STRING*"), makeString("Types"), makeString("$dtp_string$"), makeKeyword("CONSTANT")), list(makeSymbol("*DTP-VECTOR*"), makeString("Types"), makeString("$dtp_vector$"), makeKeyword("CONSTANT")), list(makeSymbol("*DTP-FUNCTION*"), makeString("Types"), makeString("$dtp_function$"), makeKeyword("CONSTANT")), list(makeSymbol("*DTP-HASH-TABLE*"), makeString("Types"), makeString("$dtp_hash_table$"), makeKeyword("CONSTANT")), list(makeSymbol("*DTP-PACKAGE*"), makeString("Types"), makeString("$dtp_package$"), makeKeyword("CONSTANT")), list(makeSymbol("*DTP-STREAM*"), makeString("Types"), makeString("$dtp_stream$"), makeKeyword("CONSTANT")), list(makeSymbol("*DTP-BIGNUM*"), makeString("Types"), makeString("$dtp_bignum$"), makeKeyword("CONSTANT")), list(makeSymbol("*DTP-LOCK*"), makeString("Types"), makeString("$dtp_lock$"), makeKeyword("CONSTANT")), list(makeSymbol("*DTP-PROCESS*"), makeString("Types"), makeString("$dtp_process$"), makeKeyword("CONSTANT")), list(makeSymbol("*DTP-GUID*"), makeString("Guids"), makeString("$dtp_guid$"), makeKeyword("CONSTANT")), list(makeSymbol("*DTP-STRUCTURES-BAG*"), makeString("Structures"), makeString("$dtp_structures_bag$"), makeKeyword("CONSTANT")), list(makeSymbol("*REMOTE-ADDRESS*", "SUBLISP"), makeString("Tcp"), makeString("$remote_address$"), makeKeyword("DYNAMIC")), list(makeSymbol("*REMOTE-HOSTNAME*", "SUBLISP"), makeString("Tcp"), makeString("$remote_hostname$"), makeKeyword("DYNAMIC")), list(makeSymbol("*%EVALUATOR-METHOD*", "SUBLISP"), makeString("Eval"), makeString("$evaluator_method$"), makeKeyword("DYNAMIC")), list(makeSymbol("*DOUBLE-FLOAT-MINIMUM-EXPONENT*"), makeString("Numbers"), makeString("$double_float_minimum_exponent$"), makeKeyword("CONSTANT")), list(makeSymbol("*SYSTEM-INFO*", "SUBLISP"), makeString("SystemInfo"), makeString("$system_info$"), makeKeyword("LEXICAL")), list(makeSymbol("*CURRENT-AREA*"), makeString("Storage"), makeString("$current_area$"), makeKeyword("DYNAMIC")), list(makeSymbol("*SHOULD-MEMORY-MAP-FILES?*", "SUBLISP"), makeString("StreamsLow"), makeString("$should_memory_map_files$"), makeKeyword("DYNAMIC")), list(makeSymbol("*RESTARTS*", "SUBLISP"), makeString("Errors"), makeString("$restarts$"), makeKeyword("DYNAMIC")) });

    private static final SubLList $list32 = list(makeSymbol("SYMBOL"), makeSymbol("CLASS-NAME"), makeSymbol("JAVA-BACKEND-NAME"), makeSymbol("&OPTIONAL"), makeSymbol("BINDING-TYPE"));

    private static final SubLSymbol JAVA_BACKEND_COMPUTED_GLOBAL_NAME = makeSymbol("JAVA-BACKEND-COMPUTED-GLOBAL-NAME");

    private static final SubLString $str34$_g = makeString("$g");

    private static final SubLString $str35$_ = makeString("$");

    /**
     * Return T iff OBJECT is a reserved word in Java
     */
    @LispMethod(comment = "Return T iff OBJECT is a reserved word in Java")
    public static final SubLObject java_backend_reserved_word_p_alt(SubLObject v_object) {
        if (v_object.isString()) {
            {
                SubLObject cdolist_list_var = $java_backend_reserved_words$.getGlobalValue();
                SubLObject word = NIL;
                for (word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , word = cdolist_list_var.first()) {
                    if (NIL != Strings.stringE(v_object, word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        return T;
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Return T iff OBJECT is a reserved word in Java
     */
    @LispMethod(comment = "Return T iff OBJECT is a reserved word in Java")
    public static SubLObject java_backend_reserved_word_p(final SubLObject v_object) {
        if (v_object.isString()) {
            SubLObject cdolist_list_var = $java_backend_reserved_words$.getGlobalValue();
            SubLObject word = NIL;
            word = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != Strings.stringE(v_object, word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    return T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                word = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    /**
     * Return T iff FUNCTION is a defined RTL function in the Java backend.
     */
    @LispMethod(comment = "Return T iff FUNCTION is a defined RTL function in the Java backend.")
    public static final SubLObject java_backend_defined_function_p_alt(SubLObject function) {
        {
            SubLObject cdolist_list_var = $java_backend_defined_function_class_data$.getGlobalValue();
            SubLObject datum = NIL;
            for (datum = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , datum = cdolist_list_var.first()) {
                {
                    SubLObject datum_1 = datum;
                    SubLObject current = datum_1;
                    SubLObject class_name = NIL;
                    SubLObject symbols = NIL;
                    destructuring_bind_must_consp(current, datum_1, $list_alt2);
                    class_name = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum_1, $list_alt2);
                    symbols = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject cdolist_list_var_2 = symbols;
                            SubLObject symbol = NIL;
                            for (symbol = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , symbol = cdolist_list_var_2.first()) {
                                if (function == symbol) {
                                    return T;
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum_1, $list_alt2);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Return T iff FUNCTION is a defined RTL function in the Java backend.
     */
    @LispMethod(comment = "Return T iff FUNCTION is a defined RTL function in the Java backend.")
    public static SubLObject java_backend_defined_function_p(final SubLObject function) {
        SubLObject cdolist_list_var = $java_backend_defined_function_class_data$.getGlobalValue();
        SubLObject datum = NIL;
        datum = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum_$1 = current = datum;
            SubLObject class_name = NIL;
            SubLObject symbols = NIL;
            destructuring_bind_must_consp(current, datum_$1, $list2);
            class_name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum_$1, $list2);
            symbols = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject cdolist_list_var_$2 = symbols;
                SubLObject symbol = NIL;
                symbol = cdolist_list_var_$2.first();
                while (NIL != cdolist_list_var_$2) {
                    if (function.eql(symbol)) {
                        return T;
                    }
                    cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                    symbol = cdolist_list_var_$2.first();
                } 
            } else {
                cdestructuring_bind_error(datum_$1, $list2);
            }
            cdolist_list_var = cdolist_list_var.rest();
            datum = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject java_backend_defined_function_name_exception_lookup_alt(SubLObject function) {
        return second(assoc(function, $java_backend_defined_function_name_exceptions$.getGlobalValue(), symbol_function(EQ), UNPROVIDED));
    }

    public static SubLObject java_backend_defined_function_name_exception_lookup(final SubLObject function) {
        return second(assoc(function, $java_backend_defined_function_name_exceptions$.getGlobalValue(), symbol_function(EQ), UNPROVIDED));
    }

    public static final SubLObject java_backend_function_call_arity_transform_alt(SubLObject function_call_form) {
        if (function_call_form.isCons()) {
            {
                SubLObject datum = function_call_form;
                SubLObject current = datum;
                SubLObject operator = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt5);
                operator = current.first();
                current = current.rest();
                {
                    SubLObject args = current;
                    SubLObject call_arity = length(args);
                    SubLObject call_arity_operator = com.cyc.cycjava.cycl.java_name_translation.java_backend_function_call_arity_lookup(operator, call_arity);
                    if (NIL != call_arity_operator) {
                        return bq_cons(call_arity_operator, append(args, NIL));
                    }
                }
            }
        }
        return function_call_form;
    }

    public static SubLObject java_backend_function_call_arity_transform(final SubLObject function_call_form) {
        if (function_call_form.isCons()) {
            SubLObject operator = NIL;
            destructuring_bind_must_consp(function_call_form, function_call_form, $list5);
            operator = function_call_form.first();
            final SubLObject args;
            final SubLObject current = args = function_call_form.rest();
            final SubLObject call_arity = length(args);
            final SubLObject call_arity_operator = java_backend_function_call_arity_lookup(operator, call_arity);
            if (NIL != call_arity_operator) {
                return bq_cons(call_arity_operator, append(args, NIL));
            }
        }
        return function_call_form;
    }

    public static final SubLObject java_backend_function_call_arity_lookup_alt(SubLObject operator, SubLObject call_arity) {
        {
            SubLObject operator_arity_versions = list_utilities.alist_lookup_without_values($java_backend_function_arity_version_table$.getGlobalValue(), operator, symbol_function(EQ), UNPROVIDED);
            if (NIL != operator_arity_versions) {
                return list_utilities.alist_lookup_without_values(operator_arity_versions, call_arity, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject java_backend_function_call_arity_lookup(final SubLObject operator, final SubLObject call_arity) {
        final SubLObject operator_arity_versions = list_utilities.alist_lookup_without_values($java_backend_function_arity_version_table$.getGlobalValue(), operator, symbol_function(EQ), UNPROVIDED);
        if (NIL != operator_arity_versions) {
            return list_utilities.alist_lookup_without_values(operator_arity_versions, call_arity, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject java_backend_simplify_Xdtb_transform_alt(SubLObject dtb_form) {
        if (dtb_form.isCons()) {
            if ($sym8$_DTB == dtb_form.first()) {
                {
                    SubLObject subform = second(dtb_form);
                    if (subform.isCons()) {
                        {
                            SubLObject datum = subform;
                            SubLObject current = datum;
                            SubLObject operator = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt5);
                            operator = current.first();
                            current = current.rest();
                            {
                                SubLObject args = current;
                                if (operator == $sym9$_BTD) {
                                    return args.first();
                                }
                                if (operator == EQ) {
                                    return bq_cons($sym10$___, append(args, NIL));
                                }
                                if (operator == NULL) {
                                    return list($sym10$___, $list_alt12, args.first());
                                }
                                {
                                    SubLObject boolean_method = com.cyc.cycjava.cycl.java_name_translation.java_backend_boolean_method_lookup(operator);
                                    if (NIL != boolean_method) {
                                        return listS($sym13$_METHOD, args.first(), boolean_method, append(args.rest(), NIL));
                                    }
                                }
                            }
                        }
                    }
                    return list($sym14$_NOT____, $list_alt12, subform);
                }
            }
        }
        return dtb_form;
    }

    public static SubLObject java_backend_simplify_Xdtb_transform(final SubLObject dtb_form) {
        if (dtb_form.isCons() && ($sym8$_DTB == dtb_form.first())) {
            final SubLObject subform = second(dtb_form);
            if (subform.isCons()) {
                SubLObject current;
                final SubLObject datum = current = subform;
                SubLObject operator = NIL;
                destructuring_bind_must_consp(current, datum, $list5);
                operator = current.first();
                final SubLObject args;
                current = args = current.rest();
                if (operator == $sym9$_BTD) {
                    return args.first();
                }
                if (operator == EQ) {
                    return bq_cons($sym10$___, append(args, NIL));
                }
                if (operator == NULL) {
                    return list($sym10$___, $list12, args.first());
                }
                final SubLObject boolean_method = java_backend_boolean_method_lookup(operator);
                if (NIL != boolean_method) {
                    return listS($sym13$_METHOD, args.first(), boolean_method, append(args.rest(), NIL));
                }
            }
            return list($sym14$_NOT____, $list12, subform);
        }
        return dtb_form;
    }

    public static final SubLObject initialize_java_backend_function_boolean_hash_alt() {
        {
            SubLObject table = make_hash_table(length($java_backend_function_boolean_method_table$.getGlobalValue()), symbol_function(EQ), UNPROVIDED);
            SubLObject cdolist_list_var = $java_backend_function_boolean_method_table$.getGlobalValue();
            SubLObject tuple = NIL;
            for (tuple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tuple = cdolist_list_var.first()) {
                {
                    SubLObject datum = tuple;
                    SubLObject current = datum;
                    SubLObject function = NIL;
                    SubLObject boolean_method = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt17);
                    function = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt17);
                    boolean_method = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        sethash(function, table, boolean_method);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt17);
                    }
                }
            }
            $java_backend_function_boolean_hash$.setGlobalValue(table);
            return table;
        }
    }

    public static SubLObject initialize_java_backend_function_boolean_hash() {
        final SubLObject table = make_hash_table(length($java_backend_function_boolean_method_table$.getGlobalValue()), symbol_function(EQ), UNPROVIDED);
        SubLObject cdolist_list_var = $java_backend_function_boolean_method_table$.getGlobalValue();
        SubLObject tuple = NIL;
        tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = tuple;
            SubLObject function = NIL;
            SubLObject boolean_method = NIL;
            destructuring_bind_must_consp(current, datum, $list17);
            function = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list17);
            boolean_method = current.first();
            current = current.rest();
            if (NIL == current) {
                sethash(function, table, boolean_method);
            } else {
                cdestructuring_bind_error(datum, $list17);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        } 
        $java_backend_function_boolean_hash$.setGlobalValue(table);
        return table;
    }

    public static final SubLObject java_backend_boolean_method_lookup_alt(SubLObject operator) {
        return gethash_without_values(operator, $java_backend_function_boolean_hash$.getGlobalValue(), NIL);
    }

    public static SubLObject java_backend_boolean_method_lookup(final SubLObject operator) {
        return gethash_without_values(operator, $java_backend_function_boolean_hash$.getGlobalValue(), NIL);
    }

    public static final SubLObject java_backend_function_to_method_transform_alt(SubLObject expression) {
        if (expression.isCons()) {
            {
                SubLObject datum = expression;
                SubLObject current = datum;
                SubLObject operator = NIL;
                SubLObject args = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt18);
                operator = current.first();
                current = current.rest();
                args = current;
                {
                    SubLObject method = com.cyc.cycjava.cycl.java_name_translation.java_backend_function_to_method_lookup(operator);
                    if (NIL != method) {
                        return listS($sym13$_METHOD, args.first(), method, append(args.rest(), NIL));
                    }
                }
            }
        }
        return expression;
    }

    public static SubLObject java_backend_function_to_method_transform(final SubLObject expression) {
        if (expression.isCons()) {
            SubLObject operator = NIL;
            SubLObject args = NIL;
            destructuring_bind_must_consp(expression, expression, $list18);
            operator = expression.first();
            final SubLObject current = args = expression.rest();
            final SubLObject method = java_backend_function_to_method_lookup(operator);
            if (NIL != method) {
                return listS($sym13$_METHOD, args.first(), method, append(args.rest(), NIL));
            }
        }
        return expression;
    }

    public static final SubLObject initialize_java_backend_function_to_method_hash_alt() {
        {
            SubLObject table = make_hash_table(length($java_backend_function_to_method_table$.getGlobalValue()), symbol_function(EQ), UNPROVIDED);
            SubLObject cdolist_list_var = $java_backend_function_to_method_table$.getGlobalValue();
            SubLObject tuple = NIL;
            for (tuple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tuple = cdolist_list_var.first()) {
                {
                    SubLObject datum = tuple;
                    SubLObject current = datum;
                    SubLObject function = NIL;
                    SubLObject method = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt20);
                    function = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt20);
                    method = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        sethash(function, table, method);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt20);
                    }
                }
            }
            $java_backend_function_to_method_hash$.setGlobalValue(table);
            return table;
        }
    }

    public static SubLObject initialize_java_backend_function_to_method_hash() {
        final SubLObject table = make_hash_table(length($java_backend_function_to_method_table$.getGlobalValue()), symbol_function(EQ), UNPROVIDED);
        SubLObject cdolist_list_var = $java_backend_function_to_method_table$.getGlobalValue();
        SubLObject tuple = NIL;
        tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = tuple;
            SubLObject function = NIL;
            SubLObject method = NIL;
            destructuring_bind_must_consp(current, datum, $list20);
            function = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list20);
            method = current.first();
            current = current.rest();
            if (NIL == current) {
                sethash(function, table, method);
            } else {
                cdestructuring_bind_error(datum, $list20);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        } 
        $java_backend_function_to_method_hash$.setGlobalValue(table);
        return table;
    }

    public static final SubLObject java_backend_function_to_method_lookup_alt(SubLObject operator) {
        return gethash_without_values(operator, $java_backend_function_to_method_hash$.getGlobalValue(), NIL);
    }

    public static SubLObject java_backend_function_to_method_lookup(final SubLObject operator) {
        return gethash_without_values(operator, $java_backend_function_to_method_hash$.getGlobalValue(), NIL);
    }

    /**
     * Return T iff FUNCTION is a predefined function in the Java backend.
     */
    @LispMethod(comment = "Return T iff FUNCTION is a predefined function in the Java backend.")
    public static final SubLObject java_backend_predefined_function_p_alt(SubLObject function) {
        return list_utilities.sublisp_boolean(gethash_without_values(function, $java_backend_function_name_table$.getGlobalValue(), NIL));
    }

    /**
     * Return T iff FUNCTION is a predefined function in the Java backend.
     */
    @LispMethod(comment = "Return T iff FUNCTION is a predefined function in the Java backend.")
    public static SubLObject java_backend_predefined_function_p(final SubLObject function) {
        return list_utilities.sublisp_boolean(gethash_without_values(function, $java_backend_function_name_table$.getGlobalValue(), NIL));
    }

    /**
     * Return the class to use for FUNCTION in the Java backend.
     */
    @LispMethod(comment = "Return the class to use for FUNCTION in the Java backend.")
    public static final SubLObject java_backend_function_class_lookup_alt(SubLObject function) {
        return gethash_without_values(function, $java_backend_function_class_table$.getGlobalValue(), NIL);
    }

    /**
     * Return the class to use for FUNCTION in the Java backend.
     */
    @LispMethod(comment = "Return the class to use for FUNCTION in the Java backend.")
    public static SubLObject java_backend_function_class_lookup(final SubLObject function) {
        return gethash_without_values(function, $java_backend_function_class_table$.getGlobalValue(), NIL);
    }

    /**
     * Return the name to use for FUNCTION in the Java backend.
     */
    @LispMethod(comment = "Return the name to use for FUNCTION in the Java backend.")
    public static final SubLObject java_backend_function_name_lookup_alt(SubLObject function) {
        return gethash_without_values(function, $java_backend_function_name_table$.getGlobalValue(), NIL);
    }

    /**
     * Return the name to use for FUNCTION in the Java backend.
     */
    @LispMethod(comment = "Return the name to use for FUNCTION in the Java backend.")
    public static SubLObject java_backend_function_name_lookup(final SubLObject function) {
        return gethash_without_values(function, $java_backend_function_name_table$.getGlobalValue(), NIL);
    }

    public static final SubLObject initialize_java_backend_function_tables_alt() {
        $java_backend_function_name_table$.setGlobalValue(make_hash_table($int$500, symbol_function(EQ), UNPROVIDED));
        $java_backend_function_class_table$.setGlobalValue(make_hash_table($int$500, symbol_function(EQ), UNPROVIDED));
        {
            SubLObject cdolist_list_var = $java_backend_defined_function_class_data$.getGlobalValue();
            SubLObject class_spec = NIL;
            for (class_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , class_spec = cdolist_list_var.first()) {
                {
                    SubLObject datum = class_spec;
                    SubLObject current = datum;
                    SubLObject class_name = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt22);
                    class_name = current.first();
                    current = current.rest();
                    {
                        SubLObject symbols = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt22);
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject cdolist_list_var_3 = symbols;
                                SubLObject symbol = NIL;
                                for (symbol = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest() , symbol = cdolist_list_var_3.first()) {
                                    {
                                        SubLObject java_backend_name = com.cyc.cycjava.cycl.java_name_translation.java_backend_compute_defined_function_name(symbol);
                                        sethash(symbol, $java_backend_function_name_table$.getGlobalValue(), java_backend_name);
                                        sethash(symbol, $java_backend_function_class_table$.getGlobalValue(), class_name);
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt22);
                        }
                    }
                }
            }
        }
        {
            SubLObject data = nconc(copy_list($java_backend_undefined_function_name_data$.getGlobalValue()), copy_list($java_backend_undefined_arity_function_name_data$.getGlobalValue()));
            SubLObject cdolist_list_var = data;
            SubLObject item = NIL;
            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                {
                    SubLObject datum = item;
                    SubLObject current = datum;
                    SubLObject symbol = NIL;
                    SubLObject class_name = NIL;
                    SubLObject java_backend_name = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt23);
                    symbol = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt23);
                    class_name = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt23);
                    java_backend_name = current.first();
                    current = current.rest();
                    {
                        SubLObject arglist = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt23);
                        current = current.rest();
                        if (NIL == current) {
                            sethash(symbol, $java_backend_function_name_table$.getGlobalValue(), java_backend_name);
                            sethash(symbol, $java_backend_function_class_table$.getGlobalValue(), class_name);
                        } else {
                            cdestructuring_bind_error(datum, $list_alt23);
                        }
                    }
                }
            }
        }
        return hash_table_count($java_backend_function_name_table$.getGlobalValue());
    }

    public static SubLObject initialize_java_backend_function_tables() {
        $java_backend_function_name_table$.setGlobalValue(make_hash_table($int$500, symbol_function(EQ), UNPROVIDED));
        $java_backend_function_class_table$.setGlobalValue(make_hash_table($int$500, symbol_function(EQ), UNPROVIDED));
        SubLObject cdolist_list_var = $java_backend_defined_function_class_data$.getGlobalValue();
        SubLObject class_spec = NIL;
        class_spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = class_spec;
            SubLObject class_name = NIL;
            destructuring_bind_must_consp(current, datum, $list22);
            class_name = current.first();
            current = current.rest();
            final SubLObject symbols = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, datum, $list22);
            current = current.rest();
            if (NIL == current) {
                SubLObject cdolist_list_var_$3 = symbols;
                SubLObject symbol = NIL;
                symbol = cdolist_list_var_$3.first();
                while (NIL != cdolist_list_var_$3) {
                    final SubLObject java_backend_name = java_backend_compute_defined_function_name(symbol);
                    sethash(symbol, $java_backend_function_name_table$.getGlobalValue(), java_backend_name);
                    sethash(symbol, $java_backend_function_class_table$.getGlobalValue(), class_name);
                    cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                    symbol = cdolist_list_var_$3.first();
                } 
            } else {
                cdestructuring_bind_error(datum, $list22);
            }
            cdolist_list_var = cdolist_list_var.rest();
            class_spec = cdolist_list_var.first();
        } 
        SubLObject cdolist_list_var2;
        final SubLObject data = cdolist_list_var2 = nconc(copy_list($java_backend_undefined_function_name_data$.getGlobalValue()), copy_list($java_backend_undefined_arity_function_name_data$.getGlobalValue()));
        SubLObject item = NIL;
        item = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            SubLObject current2;
            final SubLObject datum2 = current2 = item;
            SubLObject symbol2 = NIL;
            SubLObject class_name2 = NIL;
            SubLObject java_backend_name2 = NIL;
            destructuring_bind_must_consp(current2, datum2, $list23);
            symbol2 = current2.first();
            current2 = current2.rest();
            destructuring_bind_must_consp(current2, datum2, $list23);
            class_name2 = current2.first();
            current2 = current2.rest();
            destructuring_bind_must_consp(current2, datum2, $list23);
            java_backend_name2 = current2.first();
            current2 = current2.rest();
            final SubLObject arglist = (current2.isCons()) ? current2.first() : NIL;
            destructuring_bind_must_listp(current2, datum2, $list23);
            current2 = current2.rest();
            if (NIL == current2) {
                sethash(symbol2, $java_backend_function_name_table$.getGlobalValue(), java_backend_name2);
                sethash(symbol2, $java_backend_function_class_table$.getGlobalValue(), class_name2);
            } else {
                cdestructuring_bind_error(datum2, $list23);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            item = cdolist_list_var2.first();
        } 
        return hash_table_count($java_backend_function_name_table$.getGlobalValue());
    }

    public static final SubLObject java_backend_compute_defined_function_name_alt(SubLObject function) {
        {
            SubLObject exception_name = com.cyc.cycjava.cycl.java_name_translation.java_backend_defined_function_name_exception_lookup(function);
            if (NIL != exception_name) {
                return exception_name;
            }
        }
        return com.cyc.cycjava.cycl.java_name_translation.java_backend_computed_function_name(function);
    }

    public static SubLObject java_backend_compute_defined_function_name(final SubLObject function) {
        final SubLObject exception_name = java_backend_defined_function_name_exception_lookup(function);
        if (NIL != exception_name) {
            return exception_name;
        }
        return java_backend_computed_function_name(function);
    }

    public static final SubLObject java_backend_computed_function_name_internal_alt(SubLObject function) {
        {
            SubLObject secure_method_id = com.cyc.cycjava.cycl.java_name_translation.java_backend_secure_method_id(function);
            if (NIL != secure_method_id) {
                return cconcatenate($$$f, format_nil.format_nil_s_no_copy(secure_method_id));
            }
        }
        {
            SubLObject name_basis = com.cyc.cycjava.cycl.java_name_translation.java_backend_symbol_name_basis(function);
            if (NIL != com.cyc.cycjava.cycl.java_name_translation.java_backend_reserved_word_p(name_basis)) {
                return cconcatenate($str_alt26$sublisp_, format_nil.format_nil_a_no_copy(name_basis));
            } else {
                if (NIL != digit_char_p(Strings.sublisp_char(name_basis, ZERO_INTEGER), UNPROVIDED)) {
                    return cconcatenate($str_alt27$f_, format_nil.format_nil_a_no_copy(name_basis));
                } else {
                    return name_basis;
                }
            }
        }
    }

    public static SubLObject java_backend_computed_function_name_internal(final SubLObject function) {
        final SubLObject secure_method_id = java_backend_secure_method_id(function);
        if (NIL != secure_method_id) {
            return cconcatenate($$$f, format_nil.format_nil_s_no_copy(secure_method_id));
        }
        final SubLObject name_basis = java_backend_symbol_name_basis(function);
        if (NIL != java_backend_reserved_word_p(name_basis)) {
            return cconcatenate($str26$sublisp_, format_nil.format_nil_a_no_copy(name_basis));
        }
        if (NIL != digit_char_p(Strings.sublisp_char(name_basis, ZERO_INTEGER), UNPROVIDED)) {
            return cconcatenate($str27$f_, format_nil.format_nil_a_no_copy(name_basis));
        }
        return name_basis;
    }

    public static final SubLObject java_backend_computed_function_name_alt(SubLObject function) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.java_name_translation.java_backend_computed_function_name_internal(function);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, JAVA_BACKEND_COMPUTED_FUNCTION_NAME, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), JAVA_BACKEND_COMPUTED_FUNCTION_NAME, ONE_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, JAVA_BACKEND_COMPUTED_FUNCTION_NAME, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, function, $kw28$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw28$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.java_name_translation.java_backend_computed_function_name_internal(function)));
                        memoization_state.caching_state_put(caching_state, function, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject java_backend_computed_function_name(final SubLObject function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return java_backend_computed_function_name_internal(function);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, JAVA_BACKEND_COMPUTED_FUNCTION_NAME, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), JAVA_BACKEND_COMPUTED_FUNCTION_NAME, ONE_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, JAVA_BACKEND_COMPUTED_FUNCTION_NAME, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, function, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(java_backend_computed_function_name_internal(function)));
            memoization_state.caching_state_put(caching_state, function, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject java_backend_secure_method_id_alt(SubLObject function) {
        if ($cyc_package$.getGlobalValue() == symbol_package(function)) {
            if (NIL == com.cyc.cycjava.cycl.java_name_translation.java_backend_predefined_function_p(function)) {
                {
                    SubLObject sys_tran = system_translation.current_system_translation();
                    if (NIL != sys_tran) {
                        return system_translation.sys_tran_secure_method_id(sys_tran, function);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject java_backend_secure_method_id(final SubLObject function) {
        if ($cyc_package$.getGlobalValue().eql(symbol_package(function)) && (NIL == java_backend_predefined_function_p(function))) {
            final SubLObject sys_tran = system_translation.current_system_translation();
            if (NIL != sys_tran) {
                return system_translation.sys_tran_secure_method_id(sys_tran, function);
            }
        }
        return NIL;
    }

    public static final SubLObject java_backend_symbol_name_basis_alt(SubLObject variable) {
        {
            SubLObject name = symbol_name(variable);
            return com.cyc.cycjava.cycl.java_name_translation.java_backend_convert_identifier_name(name);
        }
    }

    public static SubLObject java_backend_symbol_name_basis(final SubLObject variable) {
        final SubLObject name = symbol_name(variable);
        return java_backend_convert_identifier_name(name);
    }

    public static final SubLObject java_backend_convert_identifier_name_alt(SubLObject name) {
        return c_backend.c_backed_convert_identifier_name(name);
    }

    public static SubLObject java_backend_convert_identifier_name(final SubLObject name) {
        return c_backend.c_backed_convert_identifier_name(name);
    }

    /**
     * Return the class to use for FUNCTION in the Java backend,
     * or :UNSPECIFIED if the class has not been declared.
     */
    @LispMethod(comment = "Return the class to use for FUNCTION in the Java backend,\r\nor :UNSPECIFIED if the class has not been declared.\nReturn the class to use for FUNCTION in the Java backend,\nor :UNSPECIFIED if the class has not been declared.")
    public static final SubLObject java_backend_function_class_alt(SubLObject function) {
        {
            SubLObject predefined_name = com.cyc.cycjava.cycl.java_name_translation.java_backend_function_class_lookup(function);
            if (NIL != predefined_name) {
                return predefined_name;
            }
        }
        {
            SubLObject module = xref_database.xref_method_defining_module(function);
            if (NIL != module) {
                {
                    SubLObject class_name = java_backend.java_backend_module_class_name(module);
                    return class_name;
                }
            }
        }
        return $UNSPECIFIED;
    }

    /**
     * Return the class to use for FUNCTION in the Java backend,
     * or :UNSPECIFIED if the class has not been declared.
     */
    @LispMethod(comment = "Return the class to use for FUNCTION in the Java backend,\r\nor :UNSPECIFIED if the class has not been declared.\nReturn the class to use for FUNCTION in the Java backend,\nor :UNSPECIFIED if the class has not been declared.")
    public static SubLObject java_backend_function_class(final SubLObject function) {
        final SubLObject predefined_name = java_backend_function_class_lookup(function);
        if (NIL != predefined_name) {
            return predefined_name;
        }
        final SubLObject module = xref_database.xref_method_defining_module(function);
        if (NIL != module) {
            final SubLObject class_name = java_backend.java_backend_module_class_name(module);
            return class_name;
        }
        return $UNSPECIFIED;
    }

    /**
     * Return the name to use for FUNCTION in the Java backend.
     */
    @LispMethod(comment = "Return the name to use for FUNCTION in the Java backend.")
    public static final SubLObject java_backend_function_name_alt(SubLObject function) {
        {
            SubLObject predefined_name = com.cyc.cycjava.cycl.java_name_translation.java_backend_function_name_lookup(function);
            if (NIL != predefined_name) {
                return predefined_name;
            } else {
                return com.cyc.cycjava.cycl.java_name_translation.java_backend_computed_function_name(function);
            }
        }
    }

    @LispMethod(comment = "Return the name to use for FUNCTION in the Java backend.")
    public static SubLObject java_backend_function_name(final SubLObject function) {
        final SubLObject predefined_name = java_backend_function_name_lookup(function);
        if (NIL != predefined_name) {
            return predefined_name;
        }
        return java_backend_computed_function_name(function);
    }

    public static final SubLObject java_backend_function_arglist_lookup_alt(SubLObject function) {
        return gethash_without_values(function, $java_backend_function_arglist_table$.getGlobalValue(), $UNSPECIFIED);
    }

    public static SubLObject java_backend_function_arglist_lookup(final SubLObject function) {
        return gethash_without_values(function, $java_backend_function_arglist_table$.getGlobalValue(), $UNSPECIFIED);
    }

    public static final SubLObject initialize_java_backend_function_arglist_table_alt() {
        {
            SubLObject table = make_hash_table($int$500, symbol_function(EQ), UNPROVIDED);
            {
                SubLObject cdolist_list_var = $java_backend_defined_function_class_data$.getGlobalValue();
                SubLObject class_spec = NIL;
                for (class_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , class_spec = cdolist_list_var.first()) {
                    {
                        SubLObject datum = class_spec;
                        SubLObject current = datum;
                        SubLObject class_name = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt22);
                        class_name = current.first();
                        current = current.rest();
                        {
                            SubLObject symbols = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                            destructuring_bind_must_listp(current, datum, $list_alt22);
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject cdolist_list_var_4 = symbols;
                                    SubLObject symbol = NIL;
                                    for (symbol = cdolist_list_var_4.first(); NIL != cdolist_list_var_4; cdolist_list_var_4 = cdolist_list_var_4.rest() , symbol = cdolist_list_var_4.first()) {
                                        if (NIL != subl_promotions.function_symbol_p(symbol)) {
                                            {
                                                SubLObject arglist = subl_promotions.function_symbol_arglist(symbol);
                                                sethash(symbol, table, arglist);
                                            }
                                        }
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt22);
                            }
                        }
                    }
                }
            }
            {
                SubLObject data = nconc(copy_list($java_backend_undefined_function_name_data$.getGlobalValue()), copy_list($java_backend_undefined_arity_function_name_data$.getGlobalValue()));
                SubLObject cdolist_list_var = data;
                SubLObject item = NIL;
                for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                    {
                        SubLObject datum = item;
                        SubLObject current = datum;
                        SubLObject symbol = NIL;
                        SubLObject class_name = NIL;
                        SubLObject java_backend_name = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt23);
                        symbol = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt23);
                        class_name = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt23);
                        java_backend_name = current.first();
                        current = current.rest();
                        {
                            SubLObject arglist = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                            destructuring_bind_must_listp(current, datum, $list_alt23);
                            current = current.rest();
                            if (NIL == current) {
                                sethash(symbol, table, arglist);
                            } else {
                                cdestructuring_bind_error(datum, $list_alt23);
                            }
                        }
                    }
                }
            }
            $java_backend_function_arglist_table$.setGlobalValue(table);
            return table;
        }
    }

    public static SubLObject initialize_java_backend_function_arglist_table() {
        final SubLObject table = make_hash_table($int$500, symbol_function(EQ), UNPROVIDED);
        SubLObject cdolist_list_var = $java_backend_defined_function_class_data$.getGlobalValue();
        SubLObject class_spec = NIL;
        class_spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = class_spec;
            SubLObject class_name = NIL;
            destructuring_bind_must_consp(current, datum, $list22);
            class_name = current.first();
            current = current.rest();
            final SubLObject symbols = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, datum, $list22);
            current = current.rest();
            if (NIL == current) {
                SubLObject cdolist_list_var_$4 = symbols;
                SubLObject symbol = NIL;
                symbol = cdolist_list_var_$4.first();
                while (NIL != cdolist_list_var_$4) {
                    if (NIL != subl_promotions.function_symbol_p(symbol)) {
                        final SubLObject arglist = subl_promotions.function_symbol_arglist(symbol);
                        sethash(symbol, table, arglist);
                    }
                    cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                    symbol = cdolist_list_var_$4.first();
                } 
            } else {
                cdestructuring_bind_error(datum, $list22);
            }
            cdolist_list_var = cdolist_list_var.rest();
            class_spec = cdolist_list_var.first();
        } 
        SubLObject cdolist_list_var2;
        final SubLObject data = cdolist_list_var2 = nconc(copy_list($java_backend_undefined_function_name_data$.getGlobalValue()), copy_list($java_backend_undefined_arity_function_name_data$.getGlobalValue()));
        SubLObject item = NIL;
        item = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            SubLObject current2;
            final SubLObject datum2 = current2 = item;
            SubLObject symbol2 = NIL;
            SubLObject class_name2 = NIL;
            SubLObject java_backend_name = NIL;
            destructuring_bind_must_consp(current2, datum2, $list23);
            symbol2 = current2.first();
            current2 = current2.rest();
            destructuring_bind_must_consp(current2, datum2, $list23);
            class_name2 = current2.first();
            current2 = current2.rest();
            destructuring_bind_must_consp(current2, datum2, $list23);
            java_backend_name = current2.first();
            current2 = current2.rest();
            final SubLObject arglist = (current2.isCons()) ? current2.first() : NIL;
            destructuring_bind_must_listp(current2, datum2, $list23);
            current2 = current2.rest();
            if (NIL == current2) {
                sethash(symbol2, table, arglist);
            } else {
                cdestructuring_bind_error(datum2, $list23);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            item = cdolist_list_var2.first();
        } 
        $java_backend_function_arglist_table$.setGlobalValue(table);
        return table;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(new SubLObject[]{ makeString("abstract"), makeString("assert"), makeString("boolean"), makeString("break"), makeString("byte"), makeString("case"), makeString("catch"), makeString("char"), makeString("class"), makeString("const"), makeString("continue"), makeString("default"), makeString("do"), makeString("double"), makeString("else"), makeString("enum"), makeString("extends"), makeString("false"), makeString("final"), makeString("finally"), makeString("float"), makeString("for"), makeString("goto"), makeString("if"), makeString("implements"), makeString("import"), makeString("instanceof"), makeString("int"), makeString("interface"), makeString("long"), makeString("native"), makeString("new"), makeString("null"), makeString("package"), makeString("private"), makeString("protected"), makeString("public"), makeString("return"), makeString("short"), makeString("static"), makeString("strictfp"), makeString("super"), makeString("switch"), makeString("synchronized"), makeString("this"), makeString("throw"), makeString("throws"), makeString("transient"), makeString("true"), makeString("try"), makeString("void"), makeString("volatile"), makeString("while") });

    public static final SubLObject $list_alt1 = com.cyc.cycjava.cycl.java_name_translation._constant_1_initializer();

    static private final SubLList $list_alt2 = list(makeSymbol("CLASS-NAME"), makeSymbol("SYMBOLS"));

    static private final SubLList $list_alt3 = list(new SubLObject[]{ list(makeSymbol("*"), makeString("multiply")), list(makeSymbol("+"), makeString("add")), list(makeSymbol("-"), makeString("subtract")), list(makeSymbol("/"), makeString("divide")), list(makeSymbol("INT/"), makeString("integerDivide")), list(makeSymbol("FIXNUM*"), makeString("fixnumMultiply")), list(makeSymbol("/="), makeString("numNE")), list(makeSymbol("<"), makeString("numL")), list(makeSymbol("<="), makeString("numLE")), list(makeSymbol("="), makeString("numE")), list(makeSymbol(">"), makeString("numG")), list(makeSymbol(">="), makeString("numGE")), list(makeSymbol("CHAR/="), makeString("charNE")), list(makeSymbol("CHAR<"), makeString("charL")), list(makeSymbol("CHAR<="), makeString("charLE")), list(makeSymbol("CHAR="), makeString("charE")), list(makeSymbol("CHAR>"), makeString("charG")), list(makeSymbol("CHAR>="), makeString("charGE")), list(makeSymbol("GUID/="), makeString("guidNE")), list(makeSymbol("GUID<"), makeString("guidL")), list(makeSymbol("GUID<="), makeString("guidLE")), list(makeSymbol("GUID="), makeString("guidE")), list(makeSymbol("GUID>"), makeString("guidG")), list(makeSymbol("GUID>="), makeString("guidGE")), list(makeSymbol("NULL"), makeString("sublisp_null")), list(makeSymbol("STRING/="), makeString("stringNE")), list(makeSymbol("STRING<"), makeString("stringL")), list(makeSymbol("STRING<="), makeString("stringLE")), list(makeSymbol("STRING="), makeString("stringE")), list(makeSymbol("STRING>"), makeString("stringG")), list(makeSymbol("STRING>="), makeString("stringGE")), list(makeSymbol("LIST*"), makeString("listS")), list(makeSymbol("BQ-LIST*"), makeString("bq_listS")) });

    public static final SubLObject $list_alt4 = com.cyc.cycjava.cycl.java_name_translation._constant_4_initializer();

    static private final SubLList $list_alt5 = list(makeSymbol("OPERATOR"), makeSymbol("&REST"), makeSymbol("ARGS"));

    public static final SubLObject java_backend_predefined_constant_name_alt(SubLObject constant) {
        return list_utilities.alist_lookup_without_values($java_backend_predefined_constant_table$.getGlobalValue(), constant, symbol_function(EQL), UNPROVIDED);
    }

    public static SubLObject java_backend_predefined_constant_name(final SubLObject constant) {
        return list_utilities.alist_lookup_without_values($java_backend_predefined_constant_table$.getGlobalValue(), constant, symbol_function(EQL), UNPROVIDED);
    }

    static private final SubLList $list_alt6 = list(new SubLObject[]{ list(makeSymbol("*"), cons(TWO_INTEGER, makeSymbol("%MULT2")), cons(THREE_INTEGER, makeSymbol("%MULT3"))), list(makeSymbol("+"), cons(TWO_INTEGER, makeSymbol("%ADD2")), cons(THREE_INTEGER, makeSymbol("%ADD3"))), list(makeSymbol("-"), cons(ONE_INTEGER, makeSymbol("%MINUS")), cons(TWO_INTEGER, makeSymbol("%SUB2")), cons(THREE_INTEGER, makeSymbol("%SUB3"))), list(makeSymbol("/"), cons(ONE_INTEGER, makeSymbol("%INVERT")), cons(TWO_INTEGER, makeSymbol("%DIV2"))), list(makeSymbol("APPEND"), cons(TWO_INTEGER, makeSymbol("%APPEND2")), cons(THREE_INTEGER, makeSymbol("%APPEND3")), cons(FOUR_INTEGER, makeSymbol("%APPEND4"))), list(makeSymbol("APPLY"), cons(TWO_INTEGER, makeSymbol("%APPLY2")), cons(THREE_INTEGER, makeSymbol("%APPLY3"))), list(makeSymbol("CCONCATENATE"), cons(TWO_INTEGER, makeSymbol("%CONCAT2"))), list(makeSymbol("CERROR"), cons(TWO_INTEGER, makeSymbol("%CERROR2")), cons(THREE_INTEGER, makeSymbol("%CERROR3")), cons(FOUR_INTEGER, makeSymbol("%CERROR4")), cons(FIVE_INTEGER, makeSymbol("%CERROR5"))), list(makeSymbol("ERROR"), cons(ONE_INTEGER, makeSymbol("%ERROR1")), cons(TWO_INTEGER, makeSymbol("%ERROR2")), cons(THREE_INTEGER, makeSymbol("%ERROR3")), cons(FOUR_INTEGER, makeSymbol("%ERROR4"))), list(makeSymbol("FALSE"), cons(ZERO_INTEGER, makeSymbol("%FALSE0")), cons(ONE_INTEGER, makeSymbol("%FALSE1")), cons(TWO_INTEGER, makeSymbol("%FALSE2"))), list(makeSymbol("FORMAT"), cons(TWO_INTEGER, makeSymbol("%FORMAT2")), cons(THREE_INTEGER, makeSymbol("%FORMAT3")), cons(FOUR_INTEGER, makeSymbol("%FORMAT4"))), list(makeSymbol("FUNCALL"), cons(ONE_INTEGER, makeSymbol("%FUNCALL1")), cons(TWO_INTEGER, makeSymbol("%FUNCALL2")), cons(THREE_INTEGER, makeSymbol("%FUNCALL3")), cons(FOUR_INTEGER, makeSymbol("%FUNCALL4")), cons(FIVE_INTEGER, makeSymbol("%FUNCALL5")), cons(SIX_INTEGER, makeSymbol("%FUNCALL6")), cons(SEVEN_INTEGER, makeSymbol("%FUNCALL7"))), list(new SubLObject[]{ makeSymbol("LIST"), cons(ONE_INTEGER, makeSymbol("%LIST1")), cons(TWO_INTEGER, makeSymbol("%LIST2")), cons(THREE_INTEGER, makeSymbol("%LIST3")), cons(FOUR_INTEGER, makeSymbol("%LIST4")), cons(FIVE_INTEGER, makeSymbol("%LIST5")), cons(SIX_INTEGER, makeSymbol("%LIST6")), cons(SEVEN_INTEGER, makeSymbol("%LIST7")), cons(EIGHT_INTEGER, makeSymbol("%LIST8")) }), list(makeSymbol("LIST*"), cons(ONE_INTEGER, makeSymbol("%LIST*1")), cons(TWO_INTEGER, makeSymbol("%LIST*2")), cons(THREE_INTEGER, makeSymbol("%LIST*3")), cons(FOUR_INTEGER, makeSymbol("%LIST*4")), cons(FIVE_INTEGER, makeSymbol("%LIST*5")), cons(SIX_INTEGER, makeSymbol("%LIST*6"))), list(makeSymbol("LOGAND"), cons(TWO_INTEGER, makeSymbol("%LOGAND2"))), list(makeSymbol("LOGIOR"), cons(TWO_INTEGER, makeSymbol("%LOGIOR2")), cons(THREE_INTEGER, makeSymbol("%LOGIOR3"))), list(makeSymbol("LOGXOR"), cons(TWO_INTEGER, makeSymbol("%LOGXOR2"))), list(makeSymbol("MAPCAR"), cons(TWO_INTEGER, makeSymbol("%MAPCAR2"))), list(makeSymbol("MAX"), cons(TWO_INTEGER, makeSymbol("%MAX2"))), list(makeSymbol("MIN"), cons(TWO_INTEGER, makeSymbol("%MIN2"))), list(makeSymbol("NCONC"), cons(TWO_INTEGER, makeSymbol("%NCONC2")), cons(THREE_INTEGER, makeSymbol("%NCONC3"))), list(makeSymbol("STRING<="), cons(TWO_INTEGER, makeSymbol("%STRING<=2"))), list(makeSymbol("TRUE"), cons(ZERO_INTEGER, makeSymbol("%TRUE0")), cons(ONE_INTEGER, makeSymbol("%TRUE1")), cons(TWO_INTEGER, makeSymbol("%TRUE2"))), list(new SubLObject[]{ makeSymbol("VALUES"), cons(ONE_INTEGER, makeSymbol("%VALUES1")), cons(TWO_INTEGER, makeSymbol("%VALUES2")), cons(THREE_INTEGER, makeSymbol("%VALUES3")), cons(FOUR_INTEGER, makeSymbol("%VALUES4")), cons(FIVE_INTEGER, makeSymbol("%VALUES5")), cons(SIX_INTEGER, makeSymbol("%VALUES6")), cons(SEVEN_INTEGER, makeSymbol("%VALUES7")), cons(EIGHT_INTEGER, makeSymbol("%VALUES8")) }), list(makeSymbol("WARN"), cons(ONE_INTEGER, makeSymbol("%WARN1")), cons(TWO_INTEGER, makeSymbol("%WARN2")), cons(THREE_INTEGER, makeSymbol("%WARN3")), cons(FOUR_INTEGER, makeSymbol("%WARN4"))) });

    public static final SubLObject java_backend_undefined_variable_binding_type_lookup_alt(SubLObject variable) {
        return fourth(assoc(variable, $java_backend_undefined_global_name_data$.getGlobalValue(), symbol_function(EQ), UNPROVIDED));
    }

    public static SubLObject java_backend_undefined_variable_binding_type_lookup(final SubLObject variable) {
        return fourth(assoc(variable, $java_backend_undefined_global_name_data$.getGlobalValue(), symbol_function(EQ), UNPROVIDED));
    }

    /**
     * Return T iff GLOBAL is a predefined global in the Java backend.
     */
    @LispMethod(comment = "Return T iff GLOBAL is a predefined global in the Java backend.")
    public static final SubLObject java_backend_predefined_global_p_alt(SubLObject global) {
        return list_utilities.sublisp_boolean(gethash_without_values(global, $java_backend_global_name_table$.getGlobalValue(), NIL));
    }

    @LispMethod(comment = "Return T iff GLOBAL is a predefined global in the Java backend.")
    public static SubLObject java_backend_predefined_global_p(final SubLObject global) {
        return list_utilities.sublisp_boolean(gethash_without_values(global, $java_backend_global_name_table$.getGlobalValue(), NIL));
    }

    public static final SubLObject java_backend_global_class_lookup_alt(SubLObject global) {
        return gethash_without_values(global, $java_backend_global_class_table$.getGlobalValue(), NIL);
    }

    public static SubLObject java_backend_global_class_lookup(final SubLObject global) {
        return gethash_without_values(global, $java_backend_global_class_table$.getGlobalValue(), NIL);
    }

    public static final SubLObject java_backend_global_name_lookup_alt(SubLObject global) {
        return gethash_without_values(global, $java_backend_global_name_table$.getGlobalValue(), NIL);
    }

    public static SubLObject java_backend_global_name_lookup(final SubLObject global) {
        return gethash_without_values(global, $java_backend_global_name_table$.getGlobalValue(), NIL);
    }

    public static final SubLObject initialize_java_backend_global_tables_alt() {
        {
            SubLObject data = nconc(copy_list($java_backend_defined_global_name_data$.getGlobalValue()), copy_list($java_backend_undefined_global_name_data$.getGlobalValue()));
            SubLObject class_table = make_hash_table(length(data), symbol_function(EQ), UNPROVIDED);
            SubLObject name_table = make_hash_table(length(data), symbol_function(EQ), UNPROVIDED);
            SubLObject cdolist_list_var = data;
            SubLObject item = NIL;
            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                {
                    SubLObject datum = item;
                    SubLObject current = datum;
                    SubLObject symbol = NIL;
                    SubLObject class_name = NIL;
                    SubLObject java_backend_name = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt33);
                    symbol = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt33);
                    class_name = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt33);
                    java_backend_name = current.first();
                    current = current.rest();
                    {
                        SubLObject binding_type = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt33);
                        current = current.rest();
                        if (NIL == current) {
                            sethash(symbol, class_table, class_name);
                            sethash(symbol, name_table, java_backend_name);
                        } else {
                            cdestructuring_bind_error(datum, $list_alt33);
                        }
                    }
                }
            }
            $java_backend_global_class_table$.setGlobalValue(class_table);
            $java_backend_global_name_table$.setGlobalValue(name_table);
            return hash_table_count(name_table);
        }
    }

    public static SubLObject initialize_java_backend_global_tables() {
        final SubLObject data = nconc(copy_list($java_backend_defined_global_name_data$.getGlobalValue()), copy_list($java_backend_undefined_global_name_data$.getGlobalValue()));
        final SubLObject class_table = make_hash_table(length(data), symbol_function(EQ), UNPROVIDED);
        final SubLObject name_table = make_hash_table(length(data), symbol_function(EQ), UNPROVIDED);
        SubLObject cdolist_list_var = data;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = item;
            SubLObject symbol = NIL;
            SubLObject class_name = NIL;
            SubLObject java_backend_name = NIL;
            destructuring_bind_must_consp(current, datum, $list32);
            symbol = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list32);
            class_name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list32);
            java_backend_name = current.first();
            current = current.rest();
            final SubLObject binding_type = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, datum, $list32);
            current = current.rest();
            if (NIL == current) {
                sethash(symbol, class_table, class_name);
                sethash(symbol, name_table, java_backend_name);
            } else {
                cdestructuring_bind_error(datum, $list32);
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        $java_backend_global_class_table$.setGlobalValue(class_table);
        $java_backend_global_name_table$.setGlobalValue(name_table);
        return hash_table_count(name_table);
    }

    /**
     * Return the class to use for GLOBAL in the Java backend,
     * or :UNSPECIFIED if the class has not been declared.
     */
    @LispMethod(comment = "Return the class to use for GLOBAL in the Java backend,\r\nor :UNSPECIFIED if the class has not been declared.\nReturn the class to use for GLOBAL in the Java backend,\nor :UNSPECIFIED if the class has not been declared.")
    public static final SubLObject java_backend_global_class_alt(SubLObject global) {
        {
            SubLObject predefined_name = com.cyc.cycjava.cycl.java_name_translation.java_backend_global_class_lookup(global);
            if (NIL != predefined_name) {
                return predefined_name;
            }
        }
        {
            SubLObject module = xref_database.xref_global_defining_module(global);
            if (NIL != module) {
                {
                    SubLObject class_name = java_backend.java_backend_module_class_name(module);
                    return class_name;
                }
            }
        }
        return $UNSPECIFIED;
    }

    @LispMethod(comment = "Return the class to use for GLOBAL in the Java backend,\r\nor :UNSPECIFIED if the class has not been declared.\nReturn the class to use for GLOBAL in the Java backend,\nor :UNSPECIFIED if the class has not been declared.")
    public static SubLObject java_backend_global_class(final SubLObject global) {
        final SubLObject predefined_name = java_backend_global_class_lookup(global);
        if (NIL != predefined_name) {
            return predefined_name;
        }
        final SubLObject module = xref_database.xref_global_defining_module(global);
        if (NIL != module) {
            final SubLObject class_name = java_backend.java_backend_module_class_name(module);
            return class_name;
        }
        return $UNSPECIFIED;
    }

    /**
     * Return the name to use for GLOBAL in the Java backend.
     */
    @LispMethod(comment = "Return the name to use for GLOBAL in the Java backend.")
    public static final SubLObject java_backend_global_name_alt(SubLObject global) {
        {
            SubLObject predefined_name = com.cyc.cycjava.cycl.java_name_translation.java_backend_global_name_lookup(global);
            if (NIL != predefined_name) {
                return predefined_name;
            } else {
                return com.cyc.cycjava.cycl.java_name_translation.java_backend_computed_global_name(global);
            }
        }
    }

    @LispMethod(comment = "Return the name to use for GLOBAL in the Java backend.")
    public static SubLObject java_backend_global_name(final SubLObject global) {
        final SubLObject predefined_name = java_backend_global_name_lookup(global);
        if (NIL != predefined_name) {
            return predefined_name;
        }
        return java_backend_computed_global_name(global);
    }

    public static final SubLObject $list_alt7 = com.cyc.cycjava.cycl.java_name_translation._constant_7_initializer();

    public static final SubLObject java_backend_computed_global_name_internal_alt(SubLObject global) {
        {
            SubLObject secure_global_id = com.cyc.cycjava.cycl.java_name_translation.java_backend_secure_global_id(global);
            if (NIL != secure_global_id) {
                return cconcatenate($str_alt35$_g, new SubLObject[]{ format_nil.format_nil_s_no_copy(secure_global_id), $str_alt36$_ });
            }
        }
        {
            SubLObject name_basis = com.cyc.cycjava.cycl.java_name_translation.java_backend_symbol_name_basis(global);
            return cconcatenate($str_alt36$_, new SubLObject[]{ format_nil.format_nil_a_no_copy(name_basis), $str_alt36$_ });
        }
    }

    public static SubLObject java_backend_computed_global_name_internal(final SubLObject global) {
        final SubLObject secure_global_id = java_backend_secure_global_id(global);
        if (NIL != secure_global_id) {
            return cconcatenate($str34$_g, new SubLObject[]{ format_nil.format_nil_s_no_copy(secure_global_id), $str35$_ });
        }
        final SubLObject name_basis = java_backend_symbol_name_basis(global);
        return cconcatenate($str35$_, new SubLObject[]{ format_nil.format_nil_a_no_copy(name_basis), $str35$_ });
    }

    static private final SubLList $list_alt12 = list(makeSymbol("%PC"), NIL);

    static private final SubLList $list_alt15 = list(new SubLObject[]{ list(makeSymbol("ATOM"), makeString("isAtom")), list(makeSymbol("BIGNUMP"), makeString("isBignum")), list(makeSymbol("CHARACTERP"), makeString("isChar")), list(makeSymbol("CONSP"), makeString("isCons")), list(makeSymbol("FIXNUMP"), makeString("isFixnum")), list(makeSymbol("FLOATP"), makeString("isDouble")), list(makeSymbol("FUNCTION-SPEC-P"), makeString("isFunctionSpec")), list(makeSymbol("FUNCTIONP"), makeString("isFunction")), list(makeSymbol("HASH-TABLE-P"), makeString("isHashtable")), list(makeSymbol("INTEGERP"), makeString("isInteger")), list(makeSymbol("KEYWORDP"), makeString("isKeyword")), list(makeSymbol("LISTP"), makeString("isList")), list(makeSymbol("LOCK-P"), makeString("isLock")), list(makeSymbol("MACRO-OPERATOR-P"), makeString("isMacroOperator")), list(makeSymbol("NULL"), makeString("isNil")), list(makeSymbol("NUMBERP"), makeString("isNumber")), list(makeSymbol("PACKAGEP"), makeString("isPackage")), list(makeSymbol("PROCESS"), makeString("isProcess")), list(makeSymbol("SEQUENCEP"), makeString("isSequence")), list(makeSymbol("STREAMP"), makeString("isStream")), list(makeSymbol("STRINGP"), makeString("isString")), list(makeSymbol("STRUCTURE-P"), makeString("isStructure")), list(makeSymbol("SYMBOLP"), makeString("isSymbol")), list(makeSymbol("VECTORP"), makeString("isVector")), list(makeSymbol("PLUSP"), makeString("isPositive")), list(makeSymbol("MINUSP"), makeString("isNegative")), list(makeSymbol("ZEROP"), makeString("isZero")), list(EQL, makeString("eql")), list(EQUAL, makeString("equal")), list(EQUALP, makeString("equalp")), list(makeSymbol("<"), makeString("numL")), list(makeSymbol("<="), makeString("numLE")), list(makeSymbol(">"), makeString("numG")), list(makeSymbol(">="), makeString("numGE")), list(makeSymbol("="), makeString("numE")) });

    public static final SubLObject java_backend_computed_global_name_alt(SubLObject global) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.java_name_translation.java_backend_computed_global_name_internal(global);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, JAVA_BACKEND_COMPUTED_GLOBAL_NAME, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), JAVA_BACKEND_COMPUTED_GLOBAL_NAME, ONE_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, JAVA_BACKEND_COMPUTED_GLOBAL_NAME, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, global, $kw28$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw28$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.java_name_translation.java_backend_computed_global_name_internal(global)));
                        memoization_state.caching_state_put(caching_state, global, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject java_backend_computed_global_name(final SubLObject global) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return java_backend_computed_global_name_internal(global);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, JAVA_BACKEND_COMPUTED_GLOBAL_NAME, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), JAVA_BACKEND_COMPUTED_GLOBAL_NAME, ONE_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, JAVA_BACKEND_COMPUTED_GLOBAL_NAME, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, global, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(java_backend_computed_global_name_internal(global)));
            memoization_state.caching_state_put(caching_state, global, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject java_backend_secure_global_id_alt(SubLObject global) {
        if ($cyc_package$.getGlobalValue() == symbol_package(global)) {
            if (NIL == com.cyc.cycjava.cycl.java_name_translation.java_backend_predefined_global_p(global)) {
                {
                    SubLObject sys_tran = system_translation.current_system_translation();
                    if (NIL != sys_tran) {
                        return system_translation.sys_tran_secure_global_id(sys_tran, global);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject java_backend_secure_global_id(final SubLObject global) {
        if ($cyc_package$.getGlobalValue().eql(symbol_package(global)) && (NIL == java_backend_predefined_global_p(global))) {
            final SubLObject sys_tran = system_translation.current_system_translation();
            if (NIL != sys_tran) {
                return system_translation.sys_tran_secure_global_id(sys_tran, global);
            }
        }
        return NIL;
    }

    static private final SubLList $list_alt17 = list(makeSymbol("FUNCTION"), makeSymbol("BOOLEAN-METHOD"));

    static private final SubLList $list_alt18 = cons(makeSymbol("OPERATOR"), makeSymbol("ARGS"));

    static private final SubLList $list_alt19 = list(list(makeSymbol("CAR"), makeString("first")), list(makeSymbol("FIRST"), makeString("first")), list(makeSymbol("CDR"), makeString("rest")), list(makeSymbol("REST"), makeString("rest")));

    public static SubLObject declare_java_name_translation_file() {
        declareFunction("java_backend_reserved_word_p", "JAVA-BACKEND-RESERVED-WORD-P", 1, 0, false);
        declareFunction("java_backend_defined_function_p", "JAVA-BACKEND-DEFINED-FUNCTION-P", 1, 0, false);
        declareFunction("java_backend_defined_function_name_exception_lookup", "JAVA-BACKEND-DEFINED-FUNCTION-NAME-EXCEPTION-LOOKUP", 1, 0, false);
        declareFunction("java_backend_function_call_arity_transform", "JAVA-BACKEND-FUNCTION-CALL-ARITY-TRANSFORM", 1, 0, false);
        declareFunction("java_backend_function_call_arity_lookup", "JAVA-BACKEND-FUNCTION-CALL-ARITY-LOOKUP", 2, 0, false);
        declareFunction("java_backend_simplify_Xdtb_transform", "JAVA-BACKEND-SIMPLIFY-%DTB-TRANSFORM", 1, 0, false);
        declareFunction("initialize_java_backend_function_boolean_hash", "INITIALIZE-JAVA-BACKEND-FUNCTION-BOOLEAN-HASH", 0, 0, false);
        declareFunction("java_backend_boolean_method_lookup", "JAVA-BACKEND-BOOLEAN-METHOD-LOOKUP", 1, 0, false);
        declareFunction("java_backend_function_to_method_transform", "JAVA-BACKEND-FUNCTION-TO-METHOD-TRANSFORM", 1, 0, false);
        declareFunction("initialize_java_backend_function_to_method_hash", "INITIALIZE-JAVA-BACKEND-FUNCTION-TO-METHOD-HASH", 0, 0, false);
        declareFunction("java_backend_function_to_method_lookup", "JAVA-BACKEND-FUNCTION-TO-METHOD-LOOKUP", 1, 0, false);
        declareFunction("java_backend_predefined_function_p", "JAVA-BACKEND-PREDEFINED-FUNCTION-P", 1, 0, false);
        declareFunction("java_backend_function_class_lookup", "JAVA-BACKEND-FUNCTION-CLASS-LOOKUP", 1, 0, false);
        declareFunction("java_backend_function_name_lookup", "JAVA-BACKEND-FUNCTION-NAME-LOOKUP", 1, 0, false);
        declareFunction("initialize_java_backend_function_tables", "INITIALIZE-JAVA-BACKEND-FUNCTION-TABLES", 0, 0, false);
        declareFunction("java_backend_compute_defined_function_name", "JAVA-BACKEND-COMPUTE-DEFINED-FUNCTION-NAME", 1, 0, false);
        declareFunction("java_backend_computed_function_name_internal", "JAVA-BACKEND-COMPUTED-FUNCTION-NAME-INTERNAL", 1, 0, false);
        declareFunction("java_backend_computed_function_name", "JAVA-BACKEND-COMPUTED-FUNCTION-NAME", 1, 0, false);
        declareFunction("java_backend_secure_method_id", "JAVA-BACKEND-SECURE-METHOD-ID", 1, 0, false);
        declareFunction("java_backend_symbol_name_basis", "JAVA-BACKEND-SYMBOL-NAME-BASIS", 1, 0, false);
        declareFunction("java_backend_convert_identifier_name", "JAVA-BACKEND-CONVERT-IDENTIFIER-NAME", 1, 0, false);
        declareFunction("java_backend_function_class", "JAVA-BACKEND-FUNCTION-CLASS", 1, 0, false);
        declareFunction("java_backend_function_name", "JAVA-BACKEND-FUNCTION-NAME", 1, 0, false);
        declareFunction("java_backend_function_arglist_lookup", "JAVA-BACKEND-FUNCTION-ARGLIST-LOOKUP", 1, 0, false);
        declareFunction("initialize_java_backend_function_arglist_table", "INITIALIZE-JAVA-BACKEND-FUNCTION-ARGLIST-TABLE", 0, 0, false);
        declareFunction("java_backend_predefined_constant_name", "JAVA-BACKEND-PREDEFINED-CONSTANT-NAME", 1, 0, false);
        declareFunction("java_backend_undefined_variable_binding_type_lookup", "JAVA-BACKEND-UNDEFINED-VARIABLE-BINDING-TYPE-LOOKUP", 1, 0, false);
        declareFunction("java_backend_predefined_global_p", "JAVA-BACKEND-PREDEFINED-GLOBAL-P", 1, 0, false);
        declareFunction("java_backend_global_class_lookup", "JAVA-BACKEND-GLOBAL-CLASS-LOOKUP", 1, 0, false);
        declareFunction("java_backend_global_name_lookup", "JAVA-BACKEND-GLOBAL-NAME-LOOKUP", 1, 0, false);
        declareFunction("initialize_java_backend_global_tables", "INITIALIZE-JAVA-BACKEND-GLOBAL-TABLES", 0, 0, false);
        declareFunction("java_backend_global_class", "JAVA-BACKEND-GLOBAL-CLASS", 1, 0, false);
        declareFunction("java_backend_global_name", "JAVA-BACKEND-GLOBAL-NAME", 1, 0, false);
        declareFunction("java_backend_computed_global_name_internal", "JAVA-BACKEND-COMPUTED-GLOBAL-NAME-INTERNAL", 1, 0, false);
        declareFunction("java_backend_computed_global_name", "JAVA-BACKEND-COMPUTED-GLOBAL-NAME", 1, 0, false);
        declareFunction("java_backend_secure_global_id", "JAVA-BACKEND-SECURE-GLOBAL-ID", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt20 = list(makeSymbol("FUNCTION"), makeSymbol("METHOD"));

    static private final SubLList $list_alt22 = list(makeSymbol("CLASS-NAME"), makeSymbol("&OPTIONAL"), makeSymbol("SYMBOLS"));

    static private final SubLList $list_alt23 = list(makeSymbol("SYMBOL"), makeSymbol("CLASS-NAME"), makeSymbol("JAVA-BACKEND-NAME"), makeSymbol("&OPTIONAL"), makeSymbol("ARGLIST"));

    static private final SubLString $str_alt26$sublisp_ = makeString("sublisp_");

    static private final SubLString $str_alt27$f_ = makeString("f_");

    public static final SubLSymbol $kw28$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    public static final SubLObject $list_alt30 = com.cyc.cycjava.cycl.java_name_translation._constant_30_initializer();

    static private final SubLList $list_alt31 = list(new SubLObject[]{ list(makeSymbol("*BREAK-ON-ERROR?*"), makeString("Errors"), makeString("$break_on_errorP$")), list(makeSymbol("*CONTINUE-CERROR?*"), makeString("Errors"), makeString("$continue_cerrorP$")), list(makeSymbol("*ERROR-ABORT-HANDLER*"), makeString("Errors"), makeString("$error_abort_handler$")), list(makeSymbol("*ERROR-HANDLER*"), makeString("Errors"), makeString("$error_handler$")), list(makeSymbol("*ERROR-MESSAGE*"), makeString("Errors"), makeString("$error_message$")), list(makeSymbol("*IGNORE-BREAKS?*"), makeString("Errors"), makeString("$ignore_breaksP$")), list(makeSymbol("*IGNORE-MUSTS?*"), makeString("Errors"), makeString("$ignore_mustsP$")), list(makeSymbol("*IGNORE-WARNS?*"), makeString("Errors"), makeString("$ignore_warnsP$")), list(makeSymbol("*"), makeString("Eval"), makeString("$star$")), list(makeSymbol("**"), makeString("Eval"), makeString("$star_star$")), list(makeSymbol("***"), makeString("Eval"), makeString("$star_star_star$")), list(makeSymbol("CALL-ARGUMENTS-LIMIT"), makeString("Functions"), makeString("$call_arguments_limit$")), list(makeSymbol("*EXP1*"), makeString("Numbers"), makeString("$exp1$")), list(makeSymbol("*MOST-NEGATIVE-FIXNUM*"), makeString("Numbers"), makeString("$most_negative_fixnum$")), list(makeSymbol("*MOST-POSITIVE-FIXNUM*"), makeString("Numbers"), makeString("$most_positive_fixnum$")), list(makeSymbol("*PI*"), makeString("Numbers"), makeString("$pi$")), list(makeSymbol("BOOLE-1"), makeString("Numbers"), makeString("$boole_1$")), list(makeSymbol("BOOLE-2"), makeString("Numbers"), makeString("$boole_2$")), list(makeSymbol("BOOLE-AND"), makeString("Numbers"), makeString("$boole_and$")), list(makeSymbol("BOOLE-ANDC1"), makeString("Numbers"), makeString("$boole_andc1$")), list(makeSymbol("BOOLE-ANDC2"), makeString("Numbers"), makeString("$boole_andc2$")), list(makeSymbol("BOOLE-C1"), makeString("Numbers"), makeString("$boole_c1$")), list(makeSymbol("BOOLE-C2"), makeString("Numbers"), makeString("$boole_c2$")), list(makeSymbol("BOOLE-CLR"), makeString("Numbers"), makeString("$boole_clr$")), list(makeSymbol("BOOLE-EQV"), makeString("Numbers"), makeString("$boole_eqv$")), list(makeSymbol("BOOLE-IOR"), makeString("Numbers"), makeString("$boole_ior$")), list(makeSymbol("BOOLE-NAND"), makeString("Numbers"), makeString("$boole_nand$")), list(makeSymbol("BOOLE-NOR"), makeString("Numbers"), makeString("$boole_nor$")), list(makeSymbol("BOOLE-ORC1"), makeString("Numbers"), makeString("$boole_orc1$")), list(makeSymbol("BOOLE-ORC2"), makeString("Numbers"), makeString("$boole_orc2$")), list(makeSymbol("BOOLE-SET"), makeString("Numbers"), makeString("$boole_set$")), list(makeSymbol("BOOLE-XOR"), makeString("Numbers"), makeString("$boole_xor$")), list(makeSymbol("*PACKAGE*"), makeString("Packages"), makeString("$package$")), list(makeSymbol("*RAND-MAX*"), makeString("random"), makeString("$rand_max$")), list(makeSymbol("*DEBUG-IO*"), makeString("StreamsLow"), makeString("$debug_io$")), list(makeSymbol("*ERROR-OUTPUT*"), makeString("StreamsLow"), makeString("$error_output$")), list(makeSymbol("*NULL-INPUT*"), makeString("StreamsLow"), makeString("$null_input$")), list(makeSymbol("*NULL-OUTPUT*"), makeString("StreamsLow"), makeString("$null_output$")), list(makeSymbol("*QUERY-IO*"), makeString("StreamsLow"), makeString("$query_io$")), list(makeSymbol("*STANDARD-INPUT*"), makeString("StreamsLow"), makeString("$standard_input$")), list(makeSymbol("*STANDARD-OUTPUT*"), makeString("StreamsLow"), makeString("$standard_output$")), list(makeSymbol("*TERMINAL-IO*"), makeString("StreamsLow"), makeString("$terminal_io$")), list(makeSymbol("*TRACE-OUTPUT*"), makeString("StreamsLow"), makeString("$trace_output$")), list(makeSymbol("*GENSYM-COUNTER*"), makeString("Symbols"), makeString("$gensym_counter$")), list(makeSymbol("*RETAIN-CLIENT-SOCKET?*"), makeString("Tcp"), makeString("$retain_client_socketP$")), list(makeSymbol("*TCP-LOCALHOST-ONLY?*"), makeString("Tcp"), makeString("$tcp_localhost_onlyP$")), list(makeSymbol("*PROCESS-MAX-PRIORITY*"), makeString("Threads"), makeString("$process_max_priority$")), list(makeSymbol("*PROCESS-CRITICAL-PRIORITY*"), makeString("Threads"), makeString("$process_critical_priority$")), list(makeSymbol("*PROCESS-NORMAL-PRIORITY*"), makeString("Threads"), makeString("$process_normal_priority$")), list(makeSymbol("*PROCESS-BACKGROUND-PRIORITY*"), makeString("Threads"), makeString("$process_background_priority$")), list(makeSymbol("*PROCESS-MIN-PRIORITY*"), makeString("Threads"), makeString("$process_min_priority$")), list(makeSymbol("*SUSPEND-TYPE-CHECKING?*"), makeString("Types"), makeString("$suspend_type_checkingP$")), list(makeSymbol("*MULTIPLE-VALUES-LIMIT*"), makeString("Values"), makeString("$multiple_values_limit$")), list(makeSymbol("*CALL-PROFILING-ENABLED?*", "SUBLISP"), makeString("complex_special_forms"), makeString("$call_profiling_enabledP$")), list(makeSymbol("*CALL-PROFILING-TABLE*", "SUBLISP"), makeString("complex_special_forms"), makeString("$call_profiling_table$")), list(makeSymbol("*PRINT-ARRAY*"), makeString("print_high"), makeString("$print_array$")), list(makeSymbol("*PRINT-BASE*"), makeString("print_high"), makeString("$print_base$")), list(makeSymbol("*PRINT-CASE*"), makeString("print_high"), makeString("$print_case$")), list(makeSymbol("*PRINT-CIRCLE*"), makeString("print_high"), makeString("$print_circle$")), list(makeSymbol("*PRINT-ESCAPE*"), makeString("print_high"), makeString("$print_escape$")), list(makeSymbol("*PRINT-GENSYM*"), makeString("print_high"), makeString("$print_gensym$")), list(makeSymbol("*PRINT-LENGTH*"), makeString("print_high"), makeString("$print_length$")), list(makeSymbol("*PRINT-LEVEL*"), makeString("print_high"), makeString("$print_level$")), list(makeSymbol("*PRINT-LINES*"), makeString("print_high"), makeString("$print_lines$")), list(makeSymbol("*PRINT-MISER-WIDTH*"), makeString("print_high"), makeString("$print_miser_width$")), list(makeSymbol("*PRINT-PPRINT-DISPATCH*"), makeString("print_high"), makeString("$print_pprint_dispatch$")), list(makeSymbol("*PRINT-PRETTY*"), makeString("print_high"), makeString("$print_pretty$")), list(makeSymbol("*PRINT-RADIX*"), makeString("print_high"), makeString("$print_radix$")), list(makeSymbol("*PRINT-READABLY*"), makeString("print_high"), makeString("$print_readably$")), list(makeSymbol("*PRINT-RIGHT-MARGIN*"), makeString("print_high"), makeString("$print_right_margin$")), list(makeSymbol("*FEATURES*"), makeString("reader"), makeString("$features$")), list(makeSymbol("*READ-BASE*"), makeString("reader"), makeString("$read_base$")), list(makeSymbol("*READ-DEFAULT-FLOAT-FORMAT*"), makeString("reader"), makeString("$read_default_float_format$")), list(makeSymbol("*READ-EVAL*"), makeString("reader"), makeString("$read_eval$")), list(makeSymbol("*READ-SUPPRESS*"), makeString("reader"), makeString("$read_suppress$")), list(makeSymbol("*READTABLE*"), makeString("reader"), makeString("$readtable$")), list(makeSymbol("*STREAM-REQUIRES-LOCKING*", "SUBLISP"), makeString("stream_macros"), makeString("$stream_requires_locking$")), list(makeSymbol("*INTERNAL-TIME-UNITS-PER-SECOND*"), makeString("time_high"), makeString("$internal_time_units_per_second$")) });

    public static final SubLObject init_java_name_translation_file_alt() {
        deflexical("*JAVA-BACKEND-RESERVED-WORDS*", $list_alt0);
        deflexical("*JAVA-BACKEND-DEFINED-FUNCTION-CLASS-DATA*", $list_alt1);
        deflexical("*JAVA-BACKEND-DEFINED-FUNCTION-NAME-EXCEPTIONS*", $list_alt3);
        deflexical("*JAVA-BACKEND-UNDEFINED-FUNCTION-NAME-DATA*", $list_alt4);
        deflexical("*JAVA-BACKEND-FUNCTION-ARITY-VERSION-TABLE*", $list_alt6);
        deflexical("*JAVA-BACKEND-UNDEFINED-ARITY-FUNCTION-NAME-DATA*", $list_alt7);
        deflexical("*JAVA-BACKEND-FUNCTION-BOOLEAN-METHOD-TABLE*", $list_alt15);
        deflexical("*JAVA-BACKEND-FUNCTION-BOOLEAN-HASH*", $UNINITIALIZED);
        deflexical("*JAVA-BACKEND-FUNCTION-TO-METHOD-TABLE*", $list_alt19);
        deflexical("*JAVA-BACKEND-FUNCTION-TO-METHOD-HASH*", $UNINITIALIZED);
        deflexical("*JAVA-BACKEND-FUNCTION-CLASS-TABLE*", $UNINITIALIZED);
        deflexical("*JAVA-BACKEND-FUNCTION-NAME-TABLE*", $UNINITIALIZED);
        deflexical("*JAVA-BACKEND-FUNCTION-ARGLIST-TABLE*", $UNINITIALIZED);
        deflexical("*JAVA-BACKEND-PREDEFINED-CONSTANT-TABLE*", $list_alt30);
        deflexical("*JAVA-BACKEND-DEFINED-GLOBAL-NAME-DATA*", $list_alt31);
        deflexical("*JAVA-BACKEND-UNDEFINED-GLOBAL-NAME-DATA*", $list_alt32);
        deflexical("*JAVA-BACKEND-GLOBAL-CLASS-TABLE*", $UNINITIALIZED);
        deflexical("*JAVA-BACKEND-GLOBAL-NAME-TABLE*", $UNINITIALIZED);
        return NIL;
    }

    public static SubLObject init_java_name_translation_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*JAVA-BACKEND-RESERVED-WORDS*", $list0);
            deflexical("*JAVA-BACKEND-DEFINED-FUNCTION-CLASS-DATA*", $list1);
            deflexical("*JAVA-BACKEND-DEFINED-FUNCTION-NAME-EXCEPTIONS*", $list3);
            deflexical("*JAVA-BACKEND-UNDEFINED-FUNCTION-NAME-DATA*", $list4);
            deflexical("*JAVA-BACKEND-FUNCTION-ARITY-VERSION-TABLE*", $list6);
            deflexical("*JAVA-BACKEND-UNDEFINED-ARITY-FUNCTION-NAME-DATA*", $list7);
            deflexical("*JAVA-BACKEND-FUNCTION-BOOLEAN-METHOD-TABLE*", $list15);
            deflexical("*JAVA-BACKEND-FUNCTION-BOOLEAN-HASH*", $UNINITIALIZED);
            deflexical("*JAVA-BACKEND-FUNCTION-TO-METHOD-TABLE*", $list19);
            deflexical("*JAVA-BACKEND-FUNCTION-TO-METHOD-HASH*", $UNINITIALIZED);
            deflexical("*JAVA-BACKEND-FUNCTION-CLASS-TABLE*", $UNINITIALIZED);
            deflexical("*JAVA-BACKEND-FUNCTION-NAME-TABLE*", $UNINITIALIZED);
            deflexical("*JAVA-BACKEND-FUNCTION-ARGLIST-TABLE*", $UNINITIALIZED);
            deflexical("*JAVA-BACKEND-PREDEFINED-CONSTANT-TABLE*", $list29);
            deflexical("*JAVA-BACKEND-DEFINED-GLOBAL-NAME-DATA*", $list30);
            deflexical("*JAVA-BACKEND-UNDEFINED-GLOBAL-NAME-DATA*", $list31);
            deflexical("*JAVA-BACKEND-GLOBAL-CLASS-TABLE*", $UNINITIALIZED);
            deflexical("*JAVA-BACKEND-GLOBAL-NAME-TABLE*", $UNINITIALIZED);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*JAVA-BACKEND-PREDEFINED-CONSTANT-TABLE*", $list_alt30);
            deflexical("*JAVA-BACKEND-DEFINED-GLOBAL-NAME-DATA*", $list_alt31);
            deflexical("*JAVA-BACKEND-UNDEFINED-GLOBAL-NAME-DATA*", $list_alt32);
        }
        return NIL;
    }

    public static SubLObject init_java_name_translation_file_Previous() {
        deflexical("*JAVA-BACKEND-RESERVED-WORDS*", $list0);
        deflexical("*JAVA-BACKEND-DEFINED-FUNCTION-CLASS-DATA*", $list1);
        deflexical("*JAVA-BACKEND-DEFINED-FUNCTION-NAME-EXCEPTIONS*", $list3);
        deflexical("*JAVA-BACKEND-UNDEFINED-FUNCTION-NAME-DATA*", $list4);
        deflexical("*JAVA-BACKEND-FUNCTION-ARITY-VERSION-TABLE*", $list6);
        deflexical("*JAVA-BACKEND-UNDEFINED-ARITY-FUNCTION-NAME-DATA*", $list7);
        deflexical("*JAVA-BACKEND-FUNCTION-BOOLEAN-METHOD-TABLE*", $list15);
        deflexical("*JAVA-BACKEND-FUNCTION-BOOLEAN-HASH*", $UNINITIALIZED);
        deflexical("*JAVA-BACKEND-FUNCTION-TO-METHOD-TABLE*", $list19);
        deflexical("*JAVA-BACKEND-FUNCTION-TO-METHOD-HASH*", $UNINITIALIZED);
        deflexical("*JAVA-BACKEND-FUNCTION-CLASS-TABLE*", $UNINITIALIZED);
        deflexical("*JAVA-BACKEND-FUNCTION-NAME-TABLE*", $UNINITIALIZED);
        deflexical("*JAVA-BACKEND-FUNCTION-ARGLIST-TABLE*", $UNINITIALIZED);
        deflexical("*JAVA-BACKEND-PREDEFINED-CONSTANT-TABLE*", $list29);
        deflexical("*JAVA-BACKEND-DEFINED-GLOBAL-NAME-DATA*", $list30);
        deflexical("*JAVA-BACKEND-UNDEFINED-GLOBAL-NAME-DATA*", $list31);
        deflexical("*JAVA-BACKEND-GLOBAL-CLASS-TABLE*", $UNINITIALIZED);
        deflexical("*JAVA-BACKEND-GLOBAL-NAME-TABLE*", $UNINITIALIZED);
        return NIL;
    }

    public static SubLObject setup_java_name_translation_file() {
        initialize_java_backend_function_boolean_hash();
        initialize_java_backend_function_to_method_hash();
        memoization_state.note_memoized_function(JAVA_BACKEND_COMPUTED_FUNCTION_NAME);
        initialize_java_backend_function_tables();
        initialize_java_backend_function_arglist_table();
        initialize_java_backend_global_tables();
        memoization_state.note_memoized_function(JAVA_BACKEND_COMPUTED_GLOBAL_NAME);
        return NIL;
    }

    // Internal Constant Initializer Methods
    @LispMethod(comment = "Internal Constant Initializer Methods")
    private static final SubLObject _constant_1_initializer_alt() {
        return list(new SubLObject[]{ list(makeKeyword("IMPORTED"), list(makeSymbol("CONS"), makeSymbol("LIST"), makeSymbol("LIST*"))), list(makeString("Alien"), list(makeSymbol("ALIEN-NULL-PTR?", "SUBLISP"))), list(makeString("Characters"), list(new SubLObject[]{ makeSymbol("ALPHA-CHAR-P"), makeSymbol("ALPHANUMERICP"), makeSymbol("BOTH-CASE-P"), makeSymbol("CHAR-CODE"), makeSymbol("CHAR-DOWNCASE"), makeSymbol("CHAR-EQUAL"), makeSymbol("CHAR-GREATERP"), makeSymbol("CHAR-LESSP"), makeSymbol("CHAR-NOT-EQUAL"), makeSymbol("CHAR-NOT-GREATERP"), makeSymbol("CHAR-NOT-LESSP"), makeSymbol("CHAR-UPCASE"), makeSymbol("CHAR/="), makeSymbol("CHAR<"), makeSymbol("CHAR<="), makeSymbol("CHAR="), makeSymbol("CHAR>"), makeSymbol("CHAR>="), makeSymbol("CODE-CHAR"), makeSymbol("DIGIT-CHAR"), makeSymbol("DIGIT-CHAR-P"), makeSymbol("LOWER-CASE-P"), makeSymbol("UPPER-CASE-P"), makeSymbol("NAME-CHARACTER", "SUBLISP") })), list(makeString("ConsesLow"), list(new SubLObject[]{ makeSymbol("APPEND"), makeSymbol("CAR"), makeSymbol("CDR"), makeSymbol("MAKE-LIST"), makeSymbol("NCONC"), makeSymbol("NTH"), makeSymbol("RPLACA"), makeSymbol("RPLACD"), makeSymbol("SET-NTH") })), list(makeString("Dynamic"), list(makeSymbol("THROW"))), list(makeString("Environment"), list(new SubLObject[]{ makeSymbol("GET-MACHINE-NAME"), makeSymbol("GET-NETWORK-NAME"), makeSymbol("GET-PROCESS-ID"), makeSymbol("GET-USER-NAME"), makeSymbol("LISP-IMPLEMENTATION-TYPE"), makeSymbol("LISP-IMPLEMENTATION-VERSION"), makeSymbol("LONG-SITE-NAME"), makeSymbol("MACHINE-INSTANCE"), makeSymbol("MACHINE-TYPE"), makeSymbol("MACHINE-VERSION"), makeSymbol("SHORT-SITE-NAME"), makeSymbol("SOFTWARE-TYPE"), makeSymbol("SOFTWARE-VERSION") })), list(makeString("Equality"), list(EQ, EQL, EQUAL, EQUALP, IDENTITY)), list(makeString("Errors"), list(makeSymbol("BREAK"), makeSymbol("CERROR"), makeSymbol("DEBUG"), makeSymbol("ERROR"), makeSymbol("WARN"))), list(makeString("Eval"), list(makeSymbol("CONSTANTP"), makeSymbol("EVAL"), makeSymbol("FUNCTION-INFORMATION"), makeSymbol("LOAD"), makeSymbol("MACROEXPAND"), makeSymbol("MACROEXPAND-1"), makeSymbol("VARIABLE-INFORMATION"))), list(makeString("Filesys"), list(new SubLObject[]{ makeSymbol("CONSTRUCT-FILENAME"), makeSymbol("DELETE-DIRECTORY"), makeSymbol("DELETE-FILE"), makeSymbol("DIRECTORY"), makeSymbol("DIRECTORY-P"), makeSymbol("FILE-AUTHOR"), makeSymbol("FILE-WRITE-DATE"), makeSymbol("MAKE-DIRECTORY"), makeSymbol("PROBE-FILE"), makeSymbol("RENAME-FILE") })), list(makeString("Functions"), list(makeSymbol("APPLY"), makeSymbol("FUNCALL"))), list(makeString("Guids"), list(new SubLObject[]{ makeSymbol("ASSEMBLE-FIXNUMS-TO-GUID"), makeSymbol("CRACK-DATE-RELATIVE-GUID"), makeSymbol("DATE-RELATIVE-GUID-P"), makeSymbol("DISASSEMBLE-GUID-TO-FIXNUMS"), makeSymbol("GUID-P"), makeSymbol("GUID-STRING-P"), makeSymbol("GUID-TO-STRING"), makeSymbol("GUID/="), makeSymbol("GUID<"), makeSymbol("GUID<="), makeSymbol("GUID="), makeSymbol("GUID>"), makeSymbol("GUID>="), makeSymbol("MAKE-DATE-RELATIVE-GUID"), makeSymbol("NEW-GUID"), makeSymbol("STRING-TO-GUID") })), list(makeString("Hashtables"), list(new SubLObject[]{ makeSymbol("CLRHASH"), makeSymbol("GETHASH"), makeSymbol("GETHASH-WITHOUT-VALUES"), makeSymbol("HASH-TABLE-COUNT"), makeSymbol("HASH-TABLE-SIZE"), makeSymbol("HASH-TABLE-TEST"), makeSymbol("MAKE-HASH-TABLE"), makeSymbol("MAPHASH"), makeSymbol("REMHASH"), makeSymbol("SETHASH"), makeSymbol("GETHASH-BUCKET", "SUBLISP") })), list(makeString("Locks"), list(makeSymbol("LOCK-IDLE-P"), makeSymbol("LOCK-LOCKER"), makeSymbol("LOCK-NAME"), makeSymbol("MAKE-LOCK"))), list(makeString("Mapper"), list(makeSymbol("WRITE-IMAGE"))), list(makeString("Mapping"), list(makeSymbol("MAPC"), makeSymbol("MAPCAN"), makeSymbol("MAPCAR"), makeSymbol("MAPCON"), makeSymbol("MAPL"), makeSymbol("MAPLIST"))), list(makeString("Numbers"), list(new SubLObject[]{ makeSymbol("*"), makeSymbol("+"), makeSymbol("-"), makeSymbol("/"), makeSymbol("/="), makeSymbol("<"), makeSymbol("<="), makeSymbol("="), makeSymbol(">"), makeSymbol(">="), makeSymbol("ABS"), makeSymbol("ACOS"), makeSymbol("ASH"), makeSymbol("ASIN"), makeSymbol("ASSEMBLE-FIXNUMS-TO-INTEGER"), makeSymbol("ATAN"), makeSymbol("BOOLE"), makeSymbol("CEILING"), makeSymbol("COS"), makeSymbol("DECODE-FLOAT"), makeSymbol("DISASSEMBLE-INTEGER-TO-FIXNUMS"), makeSymbol("EVENP"), makeSymbol("EXP"), makeSymbol("EXPT"), makeSymbol("FIXNUM*"), makeSymbol("FLOAT"), makeSymbol("FLOAT-DIGITS"), makeSymbol("FLOAT-RADIX"), makeSymbol("FLOAT-SIGN"), makeSymbol("FLOOR"), makeSymbol("INFINITY-P"), makeSymbol("INT/"), makeSymbol("INTEGER-DECODE-FLOAT"), makeSymbol("INTEGER-LENGTH"), makeSymbol("ISQRT"), makeSymbol("LOG"), makeSymbol("LOGAND"), makeSymbol("LOGANDC1"), makeSymbol("LOGANDC2"), makeSymbol("LOGBITP"), makeSymbol("LOGCOUNT"), makeSymbol("LOGEQV"), makeSymbol("LOGIOR"), makeSymbol("LOGNAND"), makeSymbol("LOGNOR"), makeSymbol("LOGNOT"), makeSymbol("LOGORC1"), makeSymbol("LOGORC2"), makeSymbol("LOGTEST"), makeSymbol("LOGXOR"), makeSymbol("MAX"), makeSymbol("MIN"), makeSymbol("MINUSP"), makeSymbol("MOD"), makeSymbol("NOT-A-NUMBER-P"), makeSymbol("ODDP"), makeSymbol("PLUSP"), makeSymbol("REM"), makeSymbol("ROUND"), makeSymbol("SCALE-FLOAT"), makeSymbol("SIN"), makeSymbol("SQRT"), makeSymbol("TAN"), makeSymbol("TRUNCATE"), makeSymbol("ZEROP") })), list(makeString("Packages"), list(new SubLObject[]{ makeSymbol("APROPOS"), makeSymbol("EXPORT"), makeSymbol("FIND-PACKAGE"), makeSymbol("FIND-SYMBOL"), makeSymbol("IMPORT"), makeSymbol("INTERN"), makeSymbol("LIST-ALL-PACKAGES"), makeSymbol("LOCK-PACKAGE"), makeSymbol("MAKE-PACKAGE"), makeSymbol("PACKAGE-LOCKED-P"), makeSymbol("PACKAGE-NAME"), makeSymbol("PACKAGE-NICKNAMES"), makeSymbol("PACKAGE-SHADOWING-SYMBOLS"), makeSymbol("PACKAGE-USE-LIST"), makeSymbol("PACKAGE-USED-BY-LIST"), makeSymbol("UNEXPORT"), makeSymbol("UNINTERN") })), list(makeString("PrintLow"), list(makeSymbol("FORMAT"), makeSymbol("WRITE"), makeSymbol("WRITE-TO-STRING"))), list(makeString("Processes"), list(makeSymbol("EXIT"), makeSymbol("FORK-PROCESS"), makeSymbol("RESTART-PROCESS"))), list(makeString("Regex"), list(makeSymbol("IS-REGEX-IMPLEMENTATION-AVAILABLE?"), makeSymbol("REGEX-VERSION"), makeSymbol("REGEX-PATTERN-P-IMPL"), makeSymbol("COMPILE-REGULAR-EXPRESSION-IMPL"), makeSymbol("DISCARD-REGULAR-EXPRESSION-PATTERN-IMPL"), makeSymbol("GET-REGEX-ERRORMSG"), makeSymbol("MATCH-REGULAR-EXPRESSION-PATTERN-OFFSETS-IMPL"))), list(makeString("Sequences"), list(new SubLObject[]{ makeSymbol("CCONCATENATE"), makeSymbol("COPY-SEQ"), makeSymbol("COUNT"), makeSymbol("COUNT-IF"), makeSymbol("CREDUCE"), makeSymbol("DELETE"), makeSymbol("DELETE-DUPLICATES"), makeSymbol("DELETE-IF"), makeSymbol("ELT"), makeSymbol("FILL"), makeSymbol("FIND"), makeSymbol("FIND-IF"), makeSymbol("LENGTH"), makeSymbol("MISMATCH"), makeSymbol("NREVERSE"), makeSymbol("NSUBSTITUTE"), makeSymbol("NSUBSTITUTE-IF"), makeSymbol("POSITION"), makeSymbol("POSITION-IF"), makeSymbol("REMOVE"), makeSymbol("REMOVE-DUPLICATES"), makeSymbol("REMOVE-IF"), makeSymbol("REPLACE"), makeSymbol("REVERSE"), makeSymbol("SEARCH"), makeSymbol("SUBSEQ"), makeSymbol("SUBSTITUTE"), makeSymbol("SUBSTITUTE-IF") })), list(makeString("Sort"), list(makeSymbol("CMERGE"), makeSymbol("SORT"), makeSymbol("STABLE-SORT"))), list(makeString("Storage"), list(makeSymbol("GC"), makeSymbol("GC-DYNAMIC"), makeSymbol("GC-EPHEMERAL"), makeSymbol("GC-FULL"), makeSymbol("REGISTER-LOW-MEMORY-CALLBACK"), makeSymbol("ROOM"))), list(makeString("StreamsLow"), NIL), list(makeString("Strings"), list(new SubLObject[]{ makeSymbol("CHAR"), makeSymbol("MAKE-STRING"), makeSymbol("NSTRING-CAPITALIZE"), makeSymbol("NSTRING-DOWNCASE"), makeSymbol("NSTRING-UPCASE"), makeSymbol("SET-CHAR"), makeSymbol("STRING"), makeSymbol("STRING-CAPITALIZE"), makeSymbol("STRING-DOWNCASE"), makeSymbol("STRING-EQUAL"), makeSymbol("STRING-GREATERP"), makeSymbol("STRING-LEFT-TRIM"), makeSymbol("STRING-LESSP"), makeSymbol("STRING-NOT-EQUAL"), makeSymbol("STRING-NOT-GREATERP"), makeSymbol("STRING-NOT-LESSP"), makeSymbol("STRING-RIGHT-TRIM"), makeSymbol("STRING-TRIM"), makeSymbol("STRING-UPCASE"), makeSymbol("STRING/="), makeSymbol("STRING<"), makeSymbol("STRING<="), makeSymbol("STRING="), makeSymbol("STRING>"), makeSymbol("STRING>=") })), list(makeString("Sxhash"), list(makeSymbol("SXHASH"), makeSymbol("SXHASH-ROT", "SUBLISP"))), list(makeString("Symbols"), list(new SubLObject[]{ makeSymbol("BOUNDP"), makeSymbol("FBOUNDP"), makeSymbol("FMAKUNBOUND"), makeSymbol("GENSYM"), makeSymbol("GENTEMP"), makeSymbol("GET"), makeSymbol("MAKE-KEYWORD"), makeSymbol("MAKE-SYMBOL"), makeSymbol("MAKUNBOUND"), makeSymbol("PUT"), makeSymbol("REMPROP"), makeSymbol("SET"), makeSymbol("SYMBOL-FUNCTION"), makeSymbol("SYMBOL-NAME"), makeSymbol("SYMBOL-PACKAGE"), makeSymbol("SYMBOL-PLIST"), makeSymbol("SYMBOL-VALUE") })), list(makeString("Tcp"), list(makeSymbol("OPEN-TCP-STREAM"))), list(makeString("Threads"), list(new SubLObject[]{ makeSymbol("ALL-PROCESSES"), makeSymbol("CURRENT-PROCESS"), makeSymbol("DEBUG-PROCESS"), makeSymbol("INTERRUPT-PROCESS"), makeSymbol("KILL-PROCESS"), makeSymbol("MAKE-PROCESS"), makeSymbol("NOTIFY"), makeSymbol("PROCESS-ACTIVE-P"), makeSymbol("PROCESS-BLOCK"), makeSymbol("PROCESS-NAME"), makeSymbol("PROCESS-PRIORITY"), makeSymbol("PROCESS-STATE"), makeSymbol("PROCESS-UNBLOCK"), makeSymbol("PROCESS-WAIT"), makeSymbol("PROCESS-WAIT-WITH-TIMEOUT"), makeSymbol("PROCESS-WHOSTATE"), makeSymbol("SET-PROCESS-PRIORITY"), makeSymbol("SHOW-PROCESSES"), makeSymbol("SLEEP"), makeSymbol("VALID-PROCESS-P") })), list(makeString("Time"), list(makeSymbol("DECODE-UNIVERSAL-TIME"), makeSymbol("ENCODE-UNIVERSAL-TIME"), makeSymbol("GET-DECODED-TIME"), makeSymbol("GET-INTERNAL-REAL-TIME"), makeSymbol("GET-INTERNAL-RUN-TIME"), makeSymbol("GET-UNIVERSAL-TIME"), makeSymbol("INTERNAL-REAL-TIME-HAS-ARRIVED?"), makeSymbol("TIME-HAS-ARRIVED?"))), list(makeString("Types"), list(new SubLObject[]{ makeSymbol("ATOM"), makeSymbol("CHARACTERP"), makeSymbol("CONSP"), makeSymbol("FALSE"), makeSymbol("FIXNUMP"), makeSymbol("FLOATP"), makeSymbol("FUNCTION-SPEC-P"), makeSymbol("FUNCTIONP"), makeSymbol("HASH-TABLE-P"), makeSymbol("INTEGERP"), makeSymbol("KEYWORDP"), makeSymbol("LISTP"), makeSymbol("LOCK-P"), makeSymbol("MACRO-OPERATOR-P"), makeSymbol("NULL"), makeSymbol("NUMBERP"), makeSymbol("PACKAGEP"), makeSymbol("PROCESSP"), makeSymbol("SEQUENCEP"), makeSymbol("STREAMP"), makeSymbol("STRINGP"), makeSymbol("SYMBOLP"), makeSymbol("TRUE"), makeSymbol("TYPE-OF"), makeSymbol("VECTORP") })), list(makeString("UserIO"), list(makeSymbol("ALERT-USER"), makeSymbol("GET-STRING-FROM-USER"), makeSymbol("LOG-MESSAGE"), makeSymbol("NOTIFY-USER"), makeSymbol("REPORT-ERROR"), makeSymbol("USER-CONFIRM"))), list(makeString("Values")), list(makeString("Vectors"), list(makeSymbol("AREF"), makeSymbol("MAKE-VECTOR"), makeSymbol("SET-AREF"), makeSymbol("VECTOR"))), list(makeString("bytes"), list(makeSymbol("BYTE"), makeSymbol("DPB"), makeSymbol("LDB"))), list(makeString("character_names"), list(makeSymbol("CHARACTER-NAMES", "SUBLISP"))), list(makeString("compatibility"), list(makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION"), makeSymbol("GET-FILE-POSITION"), makeSymbol("OPEN-BINARY"), makeSymbol("OPEN-TEXT"), makeSymbol("SET-FILE-POSITION"))), list(makeString("complex_special_forms"), list(makeSymbol("DEFSTRUCT-ANALYZE", "SUBLISP"), makeSymbol("POSSIBLY-NOTE-FUNCTION-ENTRY", "SUBLISP"))), list(makeString("conses_high"), list(new SubLObject[]{ makeSymbol("ACONS"), makeSymbol("ADJOIN"), makeSymbol("ASSOC"), makeSymbol("ASSOC-IF"), makeSymbol("BUTLAST"), makeSymbol("CAAR"), makeSymbol("CADR"), makeSymbol("CDAR"), makeSymbol("CDDR"), makeSymbol("COPY-ALIST"), makeSymbol("COPY-LIST"), makeSymbol("COPY-TREE"), makeSymbol("EIGHTH"), makeSymbol("ENDP"), makeSymbol("FIFTH"), makeSymbol("FIRST"), makeSymbol("FOURTH"), makeSymbol("GETF"), makeSymbol("INTERSECTION"), makeSymbol("LAST"), makeSymbol("LDIFF"), makeSymbol("LIST-LENGTH"), makeSymbol("MEMBER"), makeSymbol("MEMBER-IF"), makeSymbol("NBUTLAST"), makeSymbol("NINTERSECTION"), makeSymbol("NINTH"), makeSymbol("NRECONC"), makeSymbol("NSET-DIFFERENCE"), makeSymbol("NSET-EXCLUSIVE-OR"), makeSymbol("NSUBLIS"), makeSymbol("NSUBST"), makeSymbol("NSUBST-IF"), makeSymbol("NTHCDR"), makeSymbol("NUNION"), makeSymbol("PAIRLIS"), makeSymbol("PUTF"), makeSymbol("RASSOC"), makeSymbol("RASSOC-IF"), makeSymbol("REMF"), makeSymbol("REST"), makeSymbol("REVAPPEND"), makeSymbol("SECOND"), makeSymbol("SET-DIFFERENCE"), makeSymbol("SET-EXCLUSIVE-OR"), makeSymbol("SEVENTH"), makeSymbol("SIXTH"), makeSymbol("SUBLIS"), makeSymbol("SUBSETP"), makeSymbol("SUBST"), makeSymbol("SUBST-IF"), makeSymbol("TAILP"), makeSymbol("TENTH"), makeSymbol("THIRD"), makeSymbol("TREE-EQUAL"), makeSymbol("UNION") })), list(makeString("foreign"), list(makeSymbol("DECLARE-FOREIGN-SHARED-LIBRARY", "SUBLISP"), makeSymbol("DEFINE-FOREIGN-FUNCTION-INTERNAL", "SUBLISP"), makeSymbol("ENSURE-FOREIGN-SHARED-LIBRARY-LOADED", "SUBLISP"), makeSymbol("FOREIGN-SHARED-LIBRARY-INSTALLED?", "SUBLISP"), makeSymbol("VECTOR-FOR-MARSHALLING", "SUBLISP"))), list(makeString("hashtables_high"), list(makeSymbol("HASH-TABLE-ITERATOR-P"), makeSymbol("MAKE-HASH-TABLE-ITERATOR"), makeSymbol("DESTROY-HASH-TABLE-ITERATOR"), makeSymbol("HASH-TABLE-ITERATOR-HASH-TABLE"), makeSymbol("HASH-TABLE-ITERATOR-DONE-P"), makeSymbol("HASH-TABLE-ITERATOR-KEY"), makeSymbol("HASH-TABLE-ITERATOR-VALUE"), makeSymbol("HASH-TABLE-ITERATOR-NEXT"))), list(makeString("math_utilities"), list(makeSymbol("BELLEROPHON", "SUBLISP"), makeSymbol("FLONUM-DIGIT-LIST", "SUBLISP"))), list(makeString("print_high"), list(makeSymbol("PRIN1"), makeSymbol("PRIN1-TO-STRING"), makeSymbol("PRINC"), makeSymbol("PRINC-TO-STRING"), makeSymbol("PRINT"), makeSymbol("PRINT-OBJECT"))), list(makeString("random"), list(makeSymbol("RANDOM"), makeSymbol("SEED-RANDOM"))), list(makeString("reader"), list(new SubLObject[]{ makeSymbol("COPY-READTABLE"), makeSymbol("GET-DISPATCH-MACRO-CHARACTER"), makeSymbol("GET-MACRO-CHARACTER"), makeSymbol("MAKE-DISPATCH-MACRO-CHARACTER"), makeSymbol("PARSE-INTEGER"), makeSymbol("READ"), makeSymbol("READ-DELIMITED-LIST"), makeSymbol("READ-FROM-STRING"), makeSymbol("READ-FROM-STRING-IGNORING-ERRORS"), makeSymbol("READ-IGNORING-ERRORS"), makeSymbol("READ-PRESERVING-WHITESPACE"), makeSymbol("READTABLE-CASE"), makeSymbol("READTABLEP"), makeSymbol("READTABLE-P", "SUBLISP"), makeSymbol("SET-DISPATCH-MACRO-CHARACTER"), makeSymbol("SET-MACRO-CHARACTER"), makeSymbol("SET-SYNTAX-FROM-CHAR"), makeSymbol("SIMPLE-READER-ERROR"), makeSymbol("END-OF-FILE-ERROR", "SUBLISP"), makeSymbol("SINGLE-ESCAPE-SYNTAXP", "SUBLISP"), makeSymbol("SYMBOL-ESCAPEP", "SUBLISP"), makeSymbol("WHITESPACE-1-CHAR-P", "SUBLISP"), makeSymbol("WHITESPACE-2-CHAR-P", "SUBLISP"), makeSymbol("BQ-CONS") })), list(makeString("cdestructuring_bind"), list(makeSymbol("CDESTRUCTURING-BIND-ERROR", "SUBLISP"), makeSymbol("DESTRUCTURING-BIND-MUST-CONSP", "SUBLISP"), makeSymbol("DESTRUCTURING-BIND-MUST-LISTP", "SUBLISP"), makeSymbol("PROPERTY-LIST-MEMBER", "SUBLISP"))), list(makeString("visitation"), list(makeSymbol("VISIT-DEFSTRUCT"))), list(makeString("streams_high"), list(new SubLObject[]{ makeSymbol("BROADCAST-STREAM-STREAMS"), makeSymbol("CLEAR-INPUT"), makeSymbol("CLEAR-OUTPUT"), makeSymbol("CLOSE"), makeSymbol("CONCATENATED-STREAM-STREAMS"), makeSymbol("ECHO-STREAM-INPUT-STREAM"), makeSymbol("ECHO-STREAM-OUTPUT-STREAM"), makeSymbol("FILE-LENGTH"), makeSymbol("FILE-POSITION"), makeSymbol("FILE-STRING-LENGTH"), makeSymbol("FINISH-OUTPUT"), makeSymbol("FORCE-OUTPUT"), makeSymbol("FRESH-LINE"), makeSymbol("GET-OUTPUT-STREAM-STRING"), makeSymbol("INPUT-STREAM-P"), makeSymbol("INTERACTIVE-STREAM-P"), makeSymbol("LISTEN"), makeSymbol("MAKE-BROADCAST-STREAM"), makeSymbol("MAKE-CONCATENATED-STREAM"), makeSymbol("MAKE-ECHO-STREAM"), makeSymbol("MAKE-PRIVATE-BROADCAST-STREAM"), makeSymbol("MAKE-PRIVATE-CONCATENATED-STREAM"), makeSymbol("MAKE-PRIVATE-ECHO-STREAM"), makeSymbol("MAKE-PRIVATE-STRING-INPUT-STREAM"), makeSymbol("MAKE-PRIVATE-STRING-OUTPUT-STREAM"), makeSymbol("MAKE-PRIVATE-SYNONYM-STREAM"), makeSymbol("MAKE-PRIVATE-TWO-WAY-STREAM"), makeSymbol("MAKE-STRING-INPUT-STREAM"), makeSymbol("MAKE-STRING-OUTPUT-STREAM"), makeSymbol("MAKE-SYNONYM-STREAM"), makeSymbol("MAKE-TWO-WAY-STREAM"), makeSymbol("OPEN-STREAM-P"), makeSymbol("OUTPUT-STREAM-P"), makeSymbol("PEEK-CHAR"), makeSymbol("READ-BYTE"), makeSymbol("READ-CHAR"), makeSymbol("READ-CHAR-NO-HANG"), makeSymbol("READ-LINE"), makeSymbol("READ-SEQUENCE"), makeSymbol("STREAM-ELEMENT-TYPE"), makeSymbol("SYNONYM-STREAM-SYMBOL"), makeSymbol("TERPRI"), makeSymbol("TWO-WAY-STREAM-INPUT-STREAM"), makeSymbol("TWO-WAY-STREAM-OUTPUT-STREAM"), makeSymbol("UNREAD-CHAR"), makeSymbol("WRITE-BYTE"), makeSymbol("WRITE-CHAR"), makeSymbol("WRITE-LINE"), makeSymbol("WRITE-SEQUENCE"), makeSymbol("WRITE-STRING"), makeSymbol("STREAM-LINE-COLUMN", "SUBLISP") })) });
    }

    // Internal Constant Initializer Methods
    @LispMethod(comment = "Internal Constant Initializer Methods")
    private static SubLObject _constant_1_initializer() {
        return list(new SubLObject[]{ list(makeKeyword("IMPORTED"), list(makeSymbol("CONS"), makeSymbol("LIST"), makeSymbol("LIST*"))), list(makeString("Alien"), list(makeSymbol("ALIEN-NULL-PTR?", "SUBLISP"))), list(makeString("Characters"), list(new SubLObject[]{ makeSymbol("ALPHA-CHAR-P"), makeSymbol("ALPHANUMERICP"), makeSymbol("BOTH-CASE-P"), makeSymbol("CHAR-CODE"), makeSymbol("CHAR-DOWNCASE"), makeSymbol("CHAR-EQUAL"), makeSymbol("CHAR-GREATERP"), makeSymbol("CHAR-LESSP"), makeSymbol("CHAR-NOT-EQUAL"), makeSymbol("CHAR-NOT-GREATERP"), makeSymbol("CHAR-NOT-LESSP"), makeSymbol("CHAR-UPCASE"), makeSymbol("CHAR/="), makeSymbol("CHAR<"), makeSymbol("CHAR<="), makeSymbol("CHAR="), makeSymbol("CHAR>"), makeSymbol("CHAR>="), makeSymbol("CODE-CHAR"), makeSymbol("DIGIT-CHAR"), makeSymbol("DIGIT-CHAR-P"), makeSymbol("LOWER-CASE-P"), makeSymbol("UPPER-CASE-P"), makeSymbol("NAME-CHARACTER", "SUBLISP") })), list(makeString("ConsesLow"), list(new SubLObject[]{ makeSymbol("APPEND"), makeSymbol("CAR"), makeSymbol("CDR"), makeSymbol("MAKE-LIST"), makeSymbol("NCONC"), makeSymbol("NTH"), makeSymbol("RPLACA"), makeSymbol("RPLACD"), makeSymbol("SET-NTH") })), list(makeString("Dynamic"), list(makeSymbol("THROW"))), list(makeString("Environment"), list(new SubLObject[]{ makeSymbol("GET-MACHINE-NAME"), makeSymbol("GET-NETWORK-NAME"), makeSymbol("GET-PROCESS-ID"), makeSymbol("GET-USER-NAME"), makeSymbol("LISP-IMPLEMENTATION-TYPE"), makeSymbol("LISP-IMPLEMENTATION-VERSION"), makeSymbol("LONG-SITE-NAME"), makeSymbol("MACHINE-INSTANCE"), makeSymbol("MACHINE-TYPE"), makeSymbol("MACHINE-VERSION"), makeSymbol("SHORT-SITE-NAME"), makeSymbol("SOFTWARE-TYPE"), makeSymbol("SOFTWARE-VERSION") })), list(makeString("Equality"), list(EQ, EQL, EQUAL, EQUALP, IDENTITY)), list(makeString("Errors"), list(makeSymbol("BREAK"), makeSymbol("CERROR"), makeSymbol("DEBUG"), makeSymbol("ERROR"), makeSymbol("WARN"))), list(makeString("Eval"), list(makeSymbol("CONSTANTP"), makeSymbol("EVAL"), makeSymbol("FUNCTION-INFORMATION"), makeSymbol("LOAD"), makeSymbol("MACROEXPAND"), makeSymbol("MACROEXPAND-1"), makeSymbol("VARIABLE-INFORMATION"))), list(makeString("Filesys"), list(new SubLObject[]{ makeSymbol("CONSTRUCT-FILENAME"), makeSymbol("DELETE-DIRECTORY"), makeSymbol("DELETE-FILE"), makeSymbol("DIRECTORY"), makeSymbol("DIRECTORY-P"), makeSymbol("FILE-AUTHOR"), makeSymbol("FILE-WRITE-DATE"), makeSymbol("MAKE-DIRECTORY"), makeSymbol("PROBE-FILE"), makeSymbol("RENAME-FILE"), makeSymbol("COPY-FILE") })), list(makeString("Functions"), list(makeSymbol("APPLY"), makeSymbol("FUNCALL"))), list(makeString("Guids"), list(new SubLObject[]{ makeSymbol("ASSEMBLE-FIXNUMS-TO-GUID"), makeSymbol("CRACK-DATE-RELATIVE-GUID"), makeSymbol("DATE-RELATIVE-GUID-P"), makeSymbol("DISASSEMBLE-GUID-TO-FIXNUMS"), makeSymbol("GUID-P"), makeSymbol("GUID-STRING-P"), makeSymbol("GUID-TO-STRING"), makeSymbol("GUID/="), makeSymbol("GUID<"), makeSymbol("GUID<="), makeSymbol("GUID="), makeSymbol("GUID>"), makeSymbol("GUID>="), makeSymbol("MAKE-DATE-RELATIVE-GUID"), makeSymbol("NEW-GUID"), makeSymbol("STRING-TO-GUID") })), list(makeString("Hashtables"), list(new SubLObject[]{ makeSymbol("CLRHASH"), makeSymbol("GETHASH"), makeSymbol("GETHASH-WITHOUT-VALUES"), makeSymbol("HASH-TABLE-COUNT"), makeSymbol("HASH-TABLE-SIZE"), makeSymbol("HASH-TABLE-TEST"), makeSymbol("MAKE-HASH-TABLE"), makeSymbol("MAPHASH"), makeSymbol("REMHASH"), makeSymbol("SETHASH"), makeSymbol("GETHASH-BUCKET", "SUBLISP") })), list(makeString("JavaLink"), list(makeSymbol("JAVA-CALL"), makeSymbol("JAVA-CLASS"), makeSymbol("JAVA-CONSTRUCTOR"), makeSymbol("JAVA-METHOD"), makeSymbol("JAVA-NEW"), makeSymbol("JAVA-OBJECT-P"), makeSymbol("JAVA-STATIC"))), list(makeString("Locks"), list(makeSymbol("LOCK-IDLE-P"), makeSymbol("LOCK-LOCKER"), makeSymbol("LOCK-NAME"), makeSymbol("MAKE-LOCK"))), list(makeString("Mapper"), list(makeSymbol("WRITE-IMAGE"))), list(makeString("Mapping"), list(makeSymbol("MAPC"), makeSymbol("MAPCAN"), makeSymbol("MAPCAR"), makeSymbol("MAPCON"), makeSymbol("MAPL"), makeSymbol("MAPLIST"))), list(makeString("Numbers"), list(new SubLObject[]{ makeSymbol("*"), makeSymbol("+"), makeSymbol("-"), makeSymbol("/"), makeSymbol("/="), makeSymbol("<"), makeSymbol("<="), makeSymbol("="), makeSymbol(">"), makeSymbol(">="), makeSymbol("ABS"), makeSymbol("ACOS"), makeSymbol("ASH"), makeSymbol("ASIN"), makeSymbol("ASSEMBLE-FIXNUMS-TO-INTEGER"), makeSymbol("ATAN"), makeSymbol("BOOLE"), makeSymbol("CEILING"), makeSymbol("COS"), makeSymbol("DECODE-FLOAT"), makeSymbol("DISASSEMBLE-INTEGER-TO-FIXNUMS"), makeSymbol("EVENP"), makeSymbol("EXP"), makeSymbol("EXPT"), makeSymbol("FIXNUM*"), makeSymbol("FLOAT"), makeSymbol("FLOAT-DIGITS"), makeSymbol("FLOAT-RADIX"), makeSymbol("FLOAT-SIGN"), makeSymbol("FLOOR"), makeSymbol("INFINITY-P"), makeSymbol("INT/"), makeSymbol("INTEGER-DECODE-FLOAT"), makeSymbol("INTEGER-LENGTH"), makeSymbol("ISQRT"), makeSymbol("LOG"), makeSymbol("LOGAND"), makeSymbol("LOGANDC1"), makeSymbol("LOGANDC2"), makeSymbol("LOGBITP"), makeSymbol("LOGCOUNT"), makeSymbol("LOGEQV"), makeSymbol("LOGIOR"), makeSymbol("LOGNAND"), makeSymbol("LOGNOR"), makeSymbol("LOGNOT"), makeSymbol("LOGORC1"), makeSymbol("LOGORC2"), makeSymbol("LOGTEST"), makeSymbol("LOGXOR"), makeSymbol("MAX"), makeSymbol("MIN"), makeSymbol("MINUSP"), makeSymbol("MOD"), makeSymbol("NOT-A-NUMBER-P"), makeSymbol("ODDP"), makeSymbol("PLUSP"), makeSymbol("REM"), makeSymbol("ROUND"), makeSymbol("SCALE-FLOAT"), makeSymbol("SIN"), makeSymbol("SQRT"), makeSymbol("TAN"), makeSymbol("TRUNCATE"), makeSymbol("ZEROP") })), list(makeString("Packages"), list(new SubLObject[]{ makeSymbol("APROPOS"), makeSymbol("EXPORT"), makeSymbol("FIND-PACKAGE"), makeSymbol("FIND-SYMBOL"), makeSymbol("IMPORT"), makeSymbol("INTERN"), makeSymbol("LIST-ALL-PACKAGES"), makeSymbol("LOCK-PACKAGE"), makeSymbol("MAKE-PACKAGE"), makeSymbol("PACKAGE-LOCKED-P"), makeSymbol("PACKAGE-NAME"), makeSymbol("PACKAGE-NICKNAMES"), makeSymbol("PACKAGE-SHADOWING-SYMBOLS"), makeSymbol("PACKAGE-USE-LIST"), makeSymbol("PACKAGE-USED-BY-LIST"), makeSymbol("UNEXPORT"), makeSymbol("UNINTERN") })), list(makeString("PrintLow"), list(makeSymbol("FORMAT"), makeSymbol("WRITE"), makeSymbol("WRITE-TO-STRING"))), list(makeString("Processes"), list(makeSymbol("EXIT"), makeSymbol("FORK-PROCESS"), makeSymbol("RESTART-PROCESS"))), list(makeString("Regex"), list(makeSymbol("IS-REGEX-IMPLEMENTATION-AVAILABLE?"), makeSymbol("REGEX-VERSION"), makeSymbol("REGEX-PATTERN-P-IMPL"), makeSymbol("COMPILE-REGULAR-EXPRESSION-IMPL"), makeSymbol("DISCARD-REGULAR-EXPRESSION-PATTERN-IMPL"), makeSymbol("GET-REGEX-ERRORMSG"), makeSymbol("MATCH-REGULAR-EXPRESSION-PATTERN-OFFSETS-IMPL"))), list(makeString("Sequences"), list(new SubLObject[]{ makeSymbol("CCONCATENATE"), makeSymbol("COPY-SEQ"), makeSymbol("COUNT"), makeSymbol("COUNT-IF"), makeSymbol("CREDUCE"), makeSymbol("DELETE"), makeSymbol("DELETE-DUPLICATES"), makeSymbol("DELETE-IF"), makeSymbol("ELT"), makeSymbol("FILL"), makeSymbol("FIND"), makeSymbol("FIND-IF"), makeSymbol("LENGTH"), makeSymbol("MISMATCH"), makeSymbol("NREVERSE"), makeSymbol("NSUBSTITUTE"), makeSymbol("NSUBSTITUTE-IF"), makeSymbol("POSITION"), makeSymbol("POSITION-IF"), makeSymbol("REMOVE"), makeSymbol("REMOVE-DUPLICATES"), makeSymbol("REMOVE-IF"), makeSymbol("REPLACE"), makeSymbol("REVERSE"), makeSymbol("SEARCH"), makeSymbol("SUBSEQ"), makeSymbol("SUBSTITUTE"), makeSymbol("SUBSTITUTE-IF") })), list(makeString("Sort"), list(makeSymbol("CMERGE"), makeSymbol("SORT"), makeSymbol("STABLE-SORT"))), list(makeString("Storage"), list(new SubLObject[]{ makeSymbol("DEREGISTER-LOW-MEMORY-CALLBACK"), makeSymbol("GC"), makeSymbol("GC-DYNAMIC"), makeSymbol("GC-EPHEMERAL"), makeSymbol("GC-FULL"), makeSymbol("LOW-MEMORY-CALLBACKS"), makeSymbol("REGISTER-LOW-MEMORY-CALLBACK"), makeSymbol("ROOM"), makeSymbol("DUMP-HEAP") })), list(makeString("StreamsLow"), NIL), list(makeString("Strings"), list(new SubLObject[]{ makeSymbol("CHAR"), makeSymbol("MAKE-STRING"), makeSymbol("NSTRING-CAPITALIZE"), makeSymbol("NSTRING-DOWNCASE"), makeSymbol("NSTRING-UPCASE"), makeSymbol("SET-CHAR"), makeSymbol("STRING"), makeSymbol("STRING-CAPITALIZE"), makeSymbol("STRING-DOWNCASE"), makeSymbol("STRING-EQUAL"), makeSymbol("STRING-GREATERP"), makeSymbol("STRING-LEFT-TRIM"), makeSymbol("STRING-LESSP"), makeSymbol("STRING-NOT-EQUAL"), makeSymbol("STRING-NOT-GREATERP"), makeSymbol("STRING-NOT-LESSP"), makeSymbol("STRING-RIGHT-TRIM"), makeSymbol("STRING-TRIM"), makeSymbol("STRING-UPCASE"), makeSymbol("STRING/="), makeSymbol("STRING<"), makeSymbol("STRING<="), makeSymbol("STRING="), makeSymbol("STRING>"), makeSymbol("STRING>=") })), list(makeString("Sxhash"), list(makeSymbol("SXHASH"), makeSymbol("SXHASH-ROT", "SUBLISP"))), list(makeString("Symbols"), list(new SubLObject[]{ makeSymbol("BOUNDP"), makeSymbol("FBOUNDP"), makeSymbol("FMAKUNBOUND"), makeSymbol("GENSYM"), makeSymbol("GENTEMP"), makeSymbol("GET"), makeSymbol("MAKE-KEYWORD"), makeSymbol("MAKE-SYMBOL"), makeSymbol("MAKUNBOUND"), makeSymbol("PUT"), makeSymbol("REMPROP"), makeSymbol("SET"), makeSymbol("SYMBOL-FUNCTION"), makeSymbol("SYMBOL-NAME"), makeSymbol("SYMBOL-PACKAGE"), makeSymbol("SYMBOL-PLIST"), makeSymbol("SYMBOL-VALUE") })), list(makeString("Tcp"), list(makeSymbol("OPEN-TCP-STREAM"))), list(makeString("Threads"), list(new SubLObject[]{ makeSymbol("ALL-PROCESSES"), makeSymbol("CURRENT-PROCESS"), makeSymbol("DEBUG-PROCESS"), makeSymbol("INTERRUPT-PROCESS"), makeSymbol("KILL-PROCESS"), makeSymbol("MAKE-PROCESS"), makeSymbol("NOTIFY"), makeSymbol("PROCESS-ACTIVE-P"), makeSymbol("PROCESS-BLOCK"), makeSymbol("PROCESS-NAME"), makeSymbol("PROCESS-PRIORITY"), makeSymbol("PROCESS-STATE"), makeSymbol("PROCESS-UNBLOCK"), makeSymbol("PROCESS-WAIT"), makeSymbol("PROCESS-WAIT-WITH-TIMEOUT"), makeSymbol("PROCESS-WHOSTATE"), makeSymbol("SET-PROCESS-PRIORITY"), makeSymbol("SHOW-PROCESSES"), makeSymbol("SLEEP"), makeSymbol("VALID-PROCESS-P") })), list(makeString("Time"), list(makeSymbol("DECODE-UNIVERSAL-TIME"), makeSymbol("ENCODE-UNIVERSAL-TIME"), makeSymbol("GET-DECODED-TIME"), makeSymbol("GET-INTERNAL-REAL-TIME"), makeSymbol("GET-INTERNAL-RUN-TIME"), makeSymbol("GET-UNIVERSAL-TIME"), makeSymbol("INTERNAL-REAL-TIME-HAS-ARRIVED?"), makeSymbol("TIME-HAS-ARRIVED?"))), list(makeString("Types"), list(new SubLObject[]{ makeSymbol("ATOM"), makeSymbol("CHARACTERP"), makeSymbol("CONSP"), makeSymbol("FALSE"), makeSymbol("FIXNUMP"), makeSymbol("FLOATP"), makeSymbol("FUNCTION-SPEC-P"), makeSymbol("FUNCTIONP"), makeSymbol("HASH-TABLE-P"), makeSymbol("INTEGERP"), makeSymbol("KEYWORDP"), makeSymbol("LISTP"), makeSymbol("LOCK-P"), makeSymbol("MACRO-OPERATOR-P"), makeSymbol("NULL"), makeSymbol("NUMBERP"), makeSymbol("PACKAGEP"), makeSymbol("PROCESSP"), makeSymbol("SEQUENCEP"), makeSymbol("STREAMP"), makeSymbol("STRINGP"), makeSymbol("SYMBOLP"), makeSymbol("TRUE"), makeSymbol("TYPE-OF"), makeSymbol("VECTORP") })), list(makeString("UserIO"), list(makeSymbol("ALERT-USER"), makeSymbol("GET-STRING-FROM-USER"), makeSymbol("LOG-MESSAGE"), makeSymbol("NOTIFY-USER"), makeSymbol("REPORT-ERROR"), makeSymbol("USER-CONFIRM"))), list(makeString("Values")), list(makeString("Vectors"), list(makeSymbol("AREF"), makeSymbol("MAKE-VECTOR"), makeSymbol("SET-AREF"), makeSymbol("VECTOR"))), list(makeString("bytes"), list(makeSymbol("BYTE"), makeSymbol("DPB"), makeSymbol("LDB"))), list(makeString("character_names"), list(makeSymbol("CHARACTER-NAMES", "SUBLISP"))), list(makeString("compatibility"), list(makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION"), makeSymbol("GET-FILE-POSITION"), makeSymbol("OPEN-BINARY"), makeSymbol("OPEN-TEXT"), makeSymbol("SET-FILE-POSITION"))), list(makeString("complex_special_forms"), list(makeSymbol("DEFSTRUCT-ANALYZE", "SUBLISP"), makeSymbol("POSSIBLY-NOTE-FUNCTION-ENTRY", "SUBLISP"))), list(makeString("conses_high"), list(new SubLObject[]{ makeSymbol("ACONS"), makeSymbol("ADJOIN"), makeSymbol("ASSOC"), makeSymbol("ASSOC-IF"), makeSymbol("BUTLAST"), makeSymbol("CAAR"), makeSymbol("CADR"), makeSymbol("CDAR"), makeSymbol("CDDR"), makeSymbol("CIRCULAR-LIST-P"), makeSymbol("COPY-ALIST"), makeSymbol("COPY-LIST"), makeSymbol("COPY-TREE"), makeSymbol("EIGHTH"), makeSymbol("ENDP"), makeSymbol("FIFTH"), makeSymbol("FIRST"), makeSymbol("FOURTH"), makeSymbol("GETF"), makeSymbol("INTERSECTION"), makeSymbol("LAST"), makeSymbol("LDIFF"), makeSymbol("LIST-LENGTH"), makeSymbol("MEMBER"), makeSymbol("MEMBER-IF"), makeSymbol("NBUTLAST"), makeSymbol("NINTERSECTION"), makeSymbol("NINTH"), makeSymbol("NON-CIRCULAR-LIST-P"), makeSymbol("NRECONC"), makeSymbol("NSET-DIFFERENCE"), makeSymbol("NSET-EXCLUSIVE-OR"), makeSymbol("NSUBLIS"), makeSymbol("NSUBST"), makeSymbol("NSUBST-IF"), makeSymbol("NTHCDR"), makeSymbol("NUNION"), makeSymbol("PAIRLIS"), makeSymbol("PUTF"), makeSymbol("RASSOC"), makeSymbol("RASSOC-IF"), makeSymbol("REMF"), makeSymbol("REST"), makeSymbol("REVAPPEND"), makeSymbol("SECOND"), makeSymbol("SET-DIFFERENCE"), makeSymbol("SET-EXCLUSIVE-OR"), makeSymbol("SEVENTH"), makeSymbol("SIXTH"), makeSymbol("SUBLIS"), makeSymbol("SUBSETP"), makeSymbol("SUBST"), makeSymbol("SUBST-IF"), makeSymbol("TAILP"), makeSymbol("TENTH"), makeSymbol("THIRD"), makeSymbol("TREE-EQUAL"), makeSymbol("UNION") })), list(makeString("foreign"), list(makeSymbol("DECLARE-FOREIGN-SHARED-LIBRARY", "SUBLISP"), makeSymbol("DEFINE-FOREIGN-FUNCTION-INTERNAL", "SUBLISP"), makeSymbol("ENSURE-FOREIGN-SHARED-LIBRARY-LOADED", "SUBLISP"), makeSymbol("FOREIGN-SHARED-LIBRARY-INSTALLED?", "SUBLISP"), makeSymbol("VECTOR-FOR-MARSHALLING", "SUBLISP"))), list(makeString("hashtables_high"), list(makeSymbol("HASH-TABLE-ITERATOR-P"), makeSymbol("MAKE-HASH-TABLE-ITERATOR"), makeSymbol("DESTROY-HASH-TABLE-ITERATOR"), makeSymbol("HASH-TABLE-ITERATOR-HASH-TABLE"), makeSymbol("HASH-TABLE-ITERATOR-DONE-P"), makeSymbol("HASH-TABLE-ITERATOR-KEY"), makeSymbol("HASH-TABLE-ITERATOR-VALUE"), makeSymbol("HASH-TABLE-ITERATOR-NEXT"))), list(makeString("math_utilities"), list(makeSymbol("BELLEROPHON", "SUBLISP"), makeSymbol("FLONUM-DIGIT-LIST", "SUBLISP"))), list(makeString("print_high"), list(makeSymbol("PRIN1"), makeSymbol("PRIN1-TO-STRING"), makeSymbol("PRINC"), makeSymbol("PRINC-TO-STRING"), makeSymbol("PRINT"), makeSymbol("PRINT-OBJECT"))), list(makeString("print_macros"), list(makeSymbol("PRINT-UNREADABLE-OBJECT-PREAMBLE", "SUBLISP"), makeSymbol("PRINT-UNREADABLE-OBJECT-POSTAMBLE", "SUBLISP"))), list(makeString("random"), list(makeSymbol("RANDOM"), makeSymbol("SEED-RANDOM"))), list(makeString("reader"), list(new SubLObject[]{ makeSymbol("COPY-READTABLE"), makeSymbol("GET-DISPATCH-MACRO-CHARACTER"), makeSymbol("GET-MACRO-CHARACTER"), makeSymbol("MAKE-DISPATCH-MACRO-CHARACTER"), makeSymbol("PARSE-INTEGER"), makeSymbol("READ"), makeSymbol("READ-DELIMITED-LIST"), makeSymbol("READ-FROM-STRING"), makeSymbol("READ-FROM-STRING-IGNORING-ERRORS"), makeSymbol("READ-IGNORING-ERRORS"), makeSymbol("READ-PRESERVING-WHITESPACE"), makeSymbol("READTABLE-CASE"), makeSymbol("READTABLEP"), makeSymbol("READTABLE-P", "SUBLISP"), makeSymbol("SET-DISPATCH-MACRO-CHARACTER"), makeSymbol("SET-MACRO-CHARACTER"), makeSymbol("SET-SYNTAX-FROM-CHAR"), makeSymbol("SIMPLE-READER-ERROR"), makeSymbol("END-OF-FILE-ERROR", "SUBLISP"), makeSymbol("SINGLE-ESCAPE-SYNTAXP", "SUBLISP"), makeSymbol("SYMBOL-ESCAPEP", "SUBLISP"), makeSymbol("WHITESPACE-1-CHAR-P", "SUBLISP"), makeSymbol("WHITESPACE-2-CHAR-P", "SUBLISP"), makeSymbol("BQ-CONS"), makeSymbol("BQ-VECTOR") })), list(makeString("cdestructuring_bind"), list(makeSymbol("CDESTRUCTURING-BIND-ERROR", "SUBLISP"), makeSymbol("DESTRUCTURING-BIND-MUST-CONSP", "SUBLISP"), makeSymbol("DESTRUCTURING-BIND-MUST-LISTP", "SUBLISP"), makeSymbol("PROPERTY-LIST-MEMBER", "SUBLISP"))), list(makeString("visitation"), list(makeSymbol("VISIT-DEFSTRUCT"))), list(makeString("streams_high"), list(new SubLObject[]{ makeSymbol("BROADCAST-STREAM-STREAMS"), makeSymbol("CLEAR-INPUT"), makeSymbol("CLEAR-OUTPUT"), makeSymbol("CLOSE"), makeSymbol("CONCATENATED-STREAM-STREAMS"), makeSymbol("ECHO-STREAM-INPUT-STREAM"), makeSymbol("ECHO-STREAM-OUTPUT-STREAM"), makeSymbol("FILE-LENGTH"), makeSymbol("FILE-POSITION"), makeSymbol("FILE-STRING-LENGTH"), makeSymbol("FINISH-OUTPUT"), makeSymbol("FORCE-OUTPUT"), makeSymbol("FRESH-LINE"), makeSymbol("GET-OUTPUT-STREAM-STRING"), makeSymbol("INPUT-STREAM-P"), makeSymbol("INTERACTIVE-STREAM-P"), makeSymbol("LISTEN"), makeSymbol("MAKE-BROADCAST-STREAM"), makeSymbol("MAKE-CONCATENATED-STREAM"), makeSymbol("MAKE-ECHO-STREAM"), makeSymbol("MAKE-PRIVATE-BROADCAST-STREAM"), makeSymbol("MAKE-PRIVATE-CONCATENATED-STREAM"), makeSymbol("MAKE-PRIVATE-ECHO-STREAM"), makeSymbol("MAKE-PRIVATE-STRING-INPUT-STREAM"), makeSymbol("MAKE-PRIVATE-STRING-OUTPUT-STREAM"), makeSymbol("MAKE-PRIVATE-SYNONYM-STREAM"), makeSymbol("MAKE-PRIVATE-TWO-WAY-STREAM"), makeSymbol("MAKE-STRING-INPUT-STREAM"), makeSymbol("MAKE-STRING-OUTPUT-STREAM"), makeSymbol("MAKE-SYNONYM-STREAM"), makeSymbol("MAKE-TWO-WAY-STREAM"), makeSymbol("OPEN-STREAM-P"), makeSymbol("OUTPUT-STREAM-P"), makeSymbol("PEEK-CHAR"), makeSymbol("READ-BYTE"), makeSymbol("READ-CHAR"), makeSymbol("READ-CHAR-NO-HANG"), makeSymbol("READ-LINE"), makeSymbol("READ-SEQUENCE"), makeSymbol("STREAM-ELEMENT-TYPE"), makeSymbol("SYNONYM-STREAM-SYMBOL"), makeSymbol("TERPRI"), makeSymbol("TWO-WAY-STREAM-INPUT-STREAM"), makeSymbol("TWO-WAY-STREAM-OUTPUT-STREAM"), makeSymbol("UNREAD-CHAR"), makeSymbol("WRITE-BYTE"), makeSymbol("WRITE-CHAR"), makeSymbol("WRITE-LINE"), makeSymbol("WRITE-SEQUENCE"), makeSymbol("WRITE-STRING"), makeSymbol("STREAM-LINE-COLUMN", "SUBLISP") })) });
    }

    static private final SubLList $list_alt32 = list(new SubLObject[]{ list(makeSymbol("*IS-THREAD-PERFORMING-CLEANUP?*", "SUBLISP"), makeString("Threads"), makeString("$is_thread_performing_cleanupP$"), makeKeyword("DYNAMIC")), list(makeSymbol("*PRINT-OBJECT-METHOD-TABLE*", "SUBLISP"), makeString("print_high"), makeString("$print_object_method_table$"), makeKeyword("LEXICAL")), list(makeSymbol("*SXHASH-METHOD-TABLE*"), makeString("Sxhash"), makeString("$sxhash_method_table$"), makeKeyword("LEXICAL")), list(makeSymbol("*VISIT-DEFSTRUCT-OBJECT-METHOD-TABLE*", "SUBLISP"), makeString("visitation"), makeString("$visit_defstruct_object_method_table$"), makeKeyword("LEXICAL")), list(makeSymbol("*DTP-SYMBOL*"), makeString("Types"), makeString("$dtp_symbol$"), makeKeyword("CONSTANT")), list(makeSymbol("*DTP-CONS*"), makeString("Types"), makeString("$dtp_cons$"), makeKeyword("CONSTANT")), list(makeSymbol("*DTP-FIXNUM*"), makeString("Types"), makeString("$dtp_fixnum$"), makeKeyword("CONSTANT")), list(makeSymbol("*DTP-FLOAT*"), makeString("Types"), makeString("$dtp_float$"), makeKeyword("CONSTANT")), list(makeSymbol("*DTP-CHARACTER*"), makeString("Types"), makeString("$dtp_character$"), makeKeyword("CONSTANT")), list(makeSymbol("*DTP-STRING*"), makeString("Types"), makeString("$dtp_string$"), makeKeyword("CONSTANT")), list(makeSymbol("*DTP-VECTOR*"), makeString("Types"), makeString("$dtp_vector$"), makeKeyword("CONSTANT")), list(makeSymbol("*DTP-FUNCTION*"), makeString("Types"), makeString("$dtp_function$"), makeKeyword("CONSTANT")), list(makeSymbol("*DTP-HASH-TABLE*"), makeString("Types"), makeString("$dtp_hash_table$"), makeKeyword("CONSTANT")), list(makeSymbol("*DTP-PACKAGE*"), makeString("Types"), makeString("$dtp_package$"), makeKeyword("CONSTANT")), list(makeSymbol("*DTP-STREAM*"), makeString("Types"), makeString("$dtp_stream$"), makeKeyword("CONSTANT")), list(makeSymbol("*DTP-BIGNUM*"), makeString("Types"), makeString("$dtp_bignum$"), makeKeyword("CONSTANT")), list(makeSymbol("*DTP-LOCK*"), makeString("Types"), makeString("$dtp_lock$"), makeKeyword("CONSTANT")), list(makeSymbol("*DTP-PROCESS*"), makeString("Types"), makeString("$dtp_process$"), makeKeyword("CONSTANT")), list(makeSymbol("*DTP-GUID*"), makeString("Guids"), makeString("$dtp_guid$"), makeKeyword("CONSTANT")), list(makeSymbol("*DTP-STRUCTURES-BAG*"), makeString("Structures"), makeString("$dtp_structures_bag$"), makeKeyword("CONSTANT")), list(makeSymbol("*REMOTE-ADDRESS*", "SUBLISP"), makeString("Tcp"), makeString("$remote_address$"), makeKeyword("DYNAMIC")), list(makeSymbol("*REMOTE-HOSTNAME*", "SUBLISP"), makeString("Tcp"), makeString("$remote_hostname$"), makeKeyword("DYNAMIC")), list(makeSymbol("*%EVALUATOR-METHOD*", "SUBLISP"), makeString("Eval"), makeString("$evaluator_method$"), makeKeyword("DYNAMIC")), list(makeSymbol("*DOUBLE-FLOAT-MINIMUM-EXPONENT*"), makeString("Numbers"), makeString("$double_float_minimum_exponent$"), makeKeyword("CONSTANT")), list(makeSymbol("*SYSTEM-INFO*", "SUBLISP"), makeString("SystemInfo"), makeString("$system_info$"), makeKeyword("LEXICAL")), list(makeSymbol("*CURRENT-AREA*"), makeString("Storage"), makeString("$current_area$"), makeKeyword("DYNAMIC")), list(makeSymbol("*RESTARTS*", "SUBLISP"), makeString("Errors"), makeString("$restarts$"), makeKeyword("DYNAMIC")) });

    static private final SubLList $list_alt33 = list(makeSymbol("SYMBOL"), makeSymbol("CLASS-NAME"), makeSymbol("JAVA-BACKEND-NAME"), makeSymbol("&OPTIONAL"), makeSymbol("BINDING-TYPE"));

    static private final SubLString $str_alt35$_g = makeString("$g");

    static private final SubLString $str_alt36$_ = makeString("$");

    private static final SubLObject _constant_4_initializer_alt() {
        return list(new SubLObject[]{ list(makeSymbol("OPEN"), makeString("StreamsLow"), makeString("open"), list(makeSymbol("FILESPEC"), makeSymbol("&REST"), makeSymbol("KEYS"))), list(makeSymbol("%BTD"), makeKeyword("IMPORTED"), makeString("makeBoolean"), list(makeSymbol("OBJ"))), list(makeSymbol("%CBIG"), makeKeyword("IMPORTED"), makeString("makeInteger"), list(makeSymbol("STRING-REP"))), list(makeSymbol("%CCHAR"), makeKeyword("IMPORTED"), makeString("makeChar"), list(makeSymbol("CODE"))), list(makeSymbol("%CFIX"), makeKeyword("IMPORTED"), makeString("makeInteger"), list(makeSymbol("FIXNUM"))), list(makeSymbol("%CFLOAT"), makeKeyword("IMPORTED"), makeString("makeDouble"), list(makeSymbol("FLOAT"))), list(makeSymbol("%CGUID"), makeKeyword("IMPORTED"), makeString("makeGuid"), list(makeSymbol("STRING"))), list(makeSymbol("%CINTERN"), makeKeyword("IMPORTED"), makeString("makeSymbol"), list(makeSymbol("STRING"))), list(makeSymbol("%CKEYWORD"), makeKeyword("IMPORTED"), makeString("makeKeyword"), list(makeSymbol("STRING"))), list(makeSymbol("%CMAKE-SYMBOL"), makeKeyword("IMPORTED"), makeString("makeUninternedSymbol"), list(makeSymbol("STRING"))), list(makeSymbol("%CSTRING"), makeKeyword("IMPORTED"), makeString("makeString"), list(makeSymbol("STRING"))), list(makeSymbol("%CSYMBOL"), makeKeyword("IMPORTED"), makeString("makeSymbol"), list(makeSymbol("SYMBOL-NAME"), makeSymbol("PACKAGE-NAME"))), list(makeSymbol("%DTB"), makeString("SubLNil"), makeString("toBool"), list(makeSymbol("OBJ"))), list(makeSymbol("%DYN"), makeString("Symbols"), makeString("symbol_value"), list(makeSymbol("VAR"))), list(makeSymbol("%GET-RESULT"), makeString("Dynamic"), makeString("getResult"), list(makeSymbol("CATCHABLE-THROW"))), list(makeSymbol("%GET-TARGET"), makeString("Dynamic"), makeString("getTarget"), list(makeSymbol("CATCHABLE-THROW"))), list(makeSymbol("%HASH-INDEX-KEY", "SUBLISP"), makeString("Hashtables"), makeString("hash_index_key"), list(makeSymbol("TABLE"), makeSymbol("INDEX"))), list(makeSymbol("%HASH-INDEX-OBJ", "SUBLISP"), makeString("Hashtables"), makeString("hash_index_obj"), list(makeSymbol("TABLE"), makeSymbol("INDEX"))), list(makeSymbol("%LEX"), makeString("Symbols"), makeString("symbol_value"), list(makeSymbol("VAR"))), list(makeSymbol("%MVAL"), makeString("SubLProcess"), makeString("nthMultipleValue"), list(makeSymbol("N"))), list(makeSymbol("%NEXT-HASH-INDEX", "SUBLISP"), makeString("Hashtables"), makeString("next_hash_index"), list(makeSymbol("TABLE"), makeSymbol("INDEX"))), list(makeSymbol("PRINT-NOT-READABLE"), makeString("print_high"), makeString("print_not_readable"), list(makeSymbol("OBJECT"), makeSymbol("STREAM"))), list(makeSymbol("%SET-DYN"), makeString("Symbols"), makeString("set"), list(makeSymbol("VAR"), makeSymbol("VAL"))), list(makeSymbol("%SET-LEX"), makeString("Symbols"), makeString("set"), list(makeSymbol("VAR"), makeSymbol("VAL"))), list(makeSymbol("%GET-INITIAL-CONTINUATION", "SUBLISP"), makeString("Eval"), makeString("get_initial_continuation"), NIL), list(makeSymbol("%GET-RED-OBJECT", "SUBLISP"), makeString("SubLMain"), makeString("get_red_object"), NIL), list(makeSymbol("%SET-INITIAL-CONTINUATION", "SUBLISP"), makeString("Eval"), makeString("set_initial_continuation"), list(makeSymbol("FUNCTIONSPEC"))), list(makeSymbol("ALIEN-AS-STRING", "SUBLISP"), makeString("Alien"), makeString("alien_as_string"), list(makeSymbol("OBJECT"))), list(makeSymbol("ALIEN-P", "SUBLISP"), makeString("Alien"), makeString("alien_p"), list(makeSymbol("OBJECT"))), list(makeSymbol("CIRCULAR-REFERENCE-P", "SUBLISP"), makeString("print_high"), makeString("circular_reference_p"), list(makeSymbol("OBJECT"), makeSymbol("STREAM"))), list(makeSymbol("DEF-FOREIGN-FUNCTION", "SUBLISP"), makeString("Alien"), makeString("def_foreign_function"), list(makeSymbol("FOREIGN-SHARED-LIBRARY"), makeSymbol("FOREIGN-NAME"), makeSymbol("SYMBOL"), makeSymbol("ARG-CONVERSION"), makeSymbol("RET-TYPE"), makeSymbol("CALLING-CONVENTION"), makeSymbol("NULL-DEFAULT-RETURN"))), list(makeSymbol("DESCRIPTOR-STREAM-CLOSE", "SUBLISP"), makeString("StreamsLow"), makeString("descriptor_stream_close"), list(makeSymbol("STREAM"), makeSymbol("ABORT"))), list(makeSymbol("DESCRIPTOR-STREAM-FILE-LENGTH", "SUBLISP"), makeString("StreamsLow"), makeString("descriptor_stream_file_length"), list(makeSymbol("STREAM"))), list(makeSymbol("DESCRIPTOR-STREAM-FILE-POSITION", "SUBLISP"), makeString("StreamsLow"), makeString("descriptor_stream_file_position"), list(makeSymbol("STREAM"))), list(makeSymbol("DESCRIPTOR-STREAM-NEXT-INPUT-BUFFER", "SUBLISP"), makeString("StreamsLow"), makeString("descriptor_stream_next_input_buffer"), list(makeSymbol("STREAM"), makeSymbol("WAITP"))), list(makeSymbol("DESCRIPTOR-STREAM-SEND-OUTPUT-BUFFER", "SUBLISP"), makeString("StreamsLow"), makeString("descriptor_stream_send_output_buffer"), list(makeSymbol("STREAM"))), list(makeSymbol("DESCRIPTOR-STREAM-SET-FILE-POSITION", "SUBLISP"), makeString("StreamsLow"), makeString("descriptor_stream_set_file_position"), list(makeSymbol("STREAM"), makeSymbol("POSITION-SPEC"))), list(makeSymbol("FILE-POINTER-STREAM-CLOSE", "SUBLISP"), makeString("StreamsLow"), makeString("file_pointer_stream_close"), list(makeSymbol("STREAM"), makeSymbol("ABORT"))), list(makeSymbol("FILE-POINTER-STREAM-FILE-LENGTH", "SUBLISP"), makeString("StreamsLow"), makeString("file_pointer_stream_file_length"), list(makeSymbol("STREAM"))), list(makeSymbol("FILE-POINTER-STREAM-FILE-POSITION", "SUBLISP"), makeString("StreamsLow"), makeString("file_pointer_stream_file_position"), list(makeSymbol("STREAM"))), list(makeSymbol("FILE-POINTER-STREAM-NEXT-INPUT-BUFFER", "SUBLISP"), makeString("StreamsLow"), makeString("file_pointer_stream_next_input_buffer"), list(makeSymbol("STREAM"), makeSymbol("WAITP"))), list(makeSymbol("FILE-POINTER-STREAM-SEND-OUTPUT-BUFFER", "SUBLISP"), makeString("StreamsLow"), makeString("file_pointer_stream_send_output_buffer"), list(makeSymbol("STREAM"))), list(makeSymbol("FILE-POINTER-STREAM-SET-FILE-POSITION", "SUBLISP"), makeString("StreamsLow"), makeString("file_pointer_stream_set_file_position"), list(makeSymbol("STREAM"), makeSymbol("POSITION-SPEC"))), list(makeSymbol("GET-TIME", "SUBLISP"), makeString("Time"), makeString("get_time"), NIL), list(makeSymbol("GET-TIMEZONE", "SUBLISP"), makeString("Time"), makeString("get_timezone"), list(makeSymbol("&OPTIONAL"), makeSymbol("UNIVERSAL-TIME"))), list(makeSymbol("%COMPUTE-WITH-PROCESS-RESOURCE-TRACKING-RESULTS"), makeString("Time"), makeString("compute_with_process_resource_tracking_results"), list(makeSymbol("ENV-VAR"))), list(makeSymbol("LOAD-SHARED-OBJECT", "SUBLISP"), makeString("Alien"), makeString("load_shared_object"), list(makeSymbol("MONIKER"), makeSymbol("PATHNAME"), makeSymbol("OPTIONS"))), list(makeSymbol("OPEN-DESCRIPTOR", "SUBLISP"), makeString("StreamsLow"), makeString("open_descriptor"), list(makeSymbol("FILESPEC"), makeSymbol("DIRECTION"), makeSymbol("ELEMENT-TYPE"), makeSymbol("IF-EXISTS"), makeSymbol("IF-DOES-NOT-EXIST"), makeSymbol("EXTERNAL-FORMAT"))), list(makeSymbol("POINTER", "SUBLISP"), makeString("Equality"), makeString("pointer"), list(makeSymbol("OBJECT"))), list(makeSymbol("PRINT-CHARACTER", "SUBLISP"), makeString("print_functions"), makeString("print_character"), list(makeSymbol("CHAR"), makeSymbol("STREAM"))), list(makeSymbol("PRINT-CONS-CELLS", "SUBLISP"), makeString("print_functions"), makeString("print_cons_cells"), list(makeSymbol("CONS"), makeSymbol("STREAM"))), list(makeSymbol("PRINT-FLONUM", "SUBLISP"), makeString("print_functions"), makeString("print_flonum"), list(makeSymbol("FLONUM"), makeSymbol("STREAM"))), list(makeSymbol("PRINT-FUNCTION", "SUBLISP"), makeString("Functions"), makeString("print_function"), list(makeSymbol("FUNCTION"), makeSymbol("STREAM"))), list(makeSymbol("PRINT-HASHTABLE", "SUBLISP"), makeString("print_functions"), makeString("print_hashtable"), list(makeSymbol("HASHTABLE"), makeSymbol("STREAM"))), list(makeSymbol("PRINT-INTEGER", "SUBLISP"), makeString("print_functions"), makeString("print_integer"), list(makeSymbol("INTEGER"), makeSymbol("STREAM"))), list(makeSymbol("PRINT-SYMBOL", "SUBLISP"), makeString("print_functions"), makeString("print_symbol"), list(makeSymbol("SYMBOL"), makeSymbol("STREAM"))), list(makeSymbol("PRINT-STRING", "SUBLISP"), makeString("print_functions"), makeString("print_string"), list(makeSymbol("STRING"), makeSymbol("STREAM"))), list(makeSymbol("PRINT-VECTOR", "SUBLISP"), makeString("print_functions"), makeString("print_vector"), list(makeSymbol("VECTOR"), makeSymbol("STREAM"))), list(makeSymbol("RELEASE-LOCK", "SUBLISP"), makeString("Locks"), makeString("release_lock"), list(makeSymbol("LOCK"))), list(makeSymbol("SEIZE-LOCK", "SUBLISP"), makeString("Locks"), makeString("seize_lock"), list(makeSymbol("LOCK"))), list(makeSymbol("STREAM-INPUT-INDEX", "SUBLISP"), makeString("streams_high"), makeString("stream_input_index"), list(makeSymbol("OBJECT"))), list(makeSymbol("READ-BYTE-SEQUENCE-TO-POSITIVE-INTEGER", "SUBLISP"), makeString("streams_high"), makeString("read_byte_sequence_to_positive_integer"), list(makeSymbol("BYTES"), makeSymbol("&OPTIONAL"), makeSymbol("STREAM"), makeSymbol("EOF-ERROR-P"), makeSymbol("EOF-VALUE"))), list(makeSymbol("READ-BYTE-SEQUENCE-INTO-STRING", "SUBLISP"), makeString("streams_high"), makeString("read_byte_sequence_into_string"), list(makeSymbol("STRING"), makeSymbol("&OPTIONAL"), makeSymbol("STREAM"), makeSymbol("EOF-ERROR-P"), makeSymbol("EOF-VALUE"))), list(makeSymbol("UNREAD-BYTE", "SUBLISP"), makeString("streams_high"), makeString("unread_byte"), list(makeSymbol("BYTE"), makeSymbol("STREAM"))), list(makeSymbol("EXTERNAL-PROCESSES-SUPPORTED?"), makeString("Processes"), makeString("external_processes_supportedP"), NIL), list(makeSymbol("BIGNUMP"), makeString("Types"), makeString("bignump"), list(makeSymbol("OBJECT"))), list(makeSymbol("BOOLEANP"), makeString("Types"), makeString("booleanp"), list(makeSymbol("OBJECT"))), list(makeSymbol("READER-WRITER-LOCK-P"), makeString("ReadWriteLocks"), makeString("rw_lock_p"), list(makeSymbol("POSSIBLE-RW-LOCK"))), list(makeSymbol("RW-LOCK-P"), makeString("ReadWriteLocks"), makeString("rw_lock_p"), list(makeSymbol("POSSIBLE-RW-LOCK"))), list(makeSymbol("NEW-RW-LOCK"), makeString("ReadWriteLocks"), makeString("new_rw_lock"), list(makeSymbol("NAME"))), list(makeSymbol("RW-LOCK-NAME"), makeString("ReadWriteLocks"), makeString("rw_lock_name"), list(makeSymbol("RW-LOCK"))), list(makeSymbol("RW-LOCK-SEIZE-READ-LOCK"), makeString("ReadWriteLocks"), makeString("rw_lock_seize_read_lock"), list(makeSymbol("RW-LOCK"))), list(makeSymbol("RW-LOCK-SEIZE-WRITE-LOCK"), makeString("ReadWriteLocks"), makeString("rw_lock_seize_write_lock"), list(makeSymbol("RW-LOCK"))), list(makeSymbol("RW-LOCK-RELEASE-READ-LOCK"), makeString("ReadWriteLocks"), makeString("rw_lock_release_read_lock"), list(makeSymbol("RW-LOCK"))), list(makeSymbol("RW-LOCK-RELEASE-WRITE-LOCK"), makeString("ReadWriteLocks"), makeString("rw_lock_release_write_lock"), list(makeSymbol("RW-LOCK"))), list(makeSymbol("SEMAPHORE-P"), makeString("Semaphores"), makeString("semaphore_p"), list(makeSymbol("OBJECT"))), list(makeSymbol("NEW-SEMAPHORE"), makeString("Semaphores"), makeString("new_semaphore"), list(makeSymbol("NAME"), makeSymbol("&OPTIONAL"), makeSymbol("COUNT"))), list(makeSymbol("SEMAPHORE-NAME"), makeString("Semaphores"), makeString("semaphore_name"), list(makeSymbol("SEMAPHORE"))), list(makeSymbol("SEMAPHORE-SIGNAL"), makeString("Semaphores"), makeString("semaphore_signal"), list(makeSymbol("SEMAPHORE"))), list(makeSymbol("SEMAPHORE-CURRENT-COUNT"), makeString("Semaphores"), makeString("semaphore_current_count"), list(makeSymbol("SEMAPHORE"))), list(makeSymbol("SEMAPHORE-WAIT"), makeString("Semaphores"), makeString("semaphore_wait"), list(makeSymbol("SEMAPHORE"))), list(makeSymbol("SEMAPHORE-DRAIN"), makeString("Semaphores"), makeString("semaphore_drain"), list(makeSymbol("SEMAPHORE"))), list(makeSymbol("SEMAPHORE-WAIT-WITH-TIMEOUT"), makeString("Semaphores"), makeString("semaphore_wait_with_timeout"), list(makeSymbol("SEMAPHORE"), makeSymbol("MAX-SECS-TO-WAIT"))), list(makeSymbol("SXHASH-ROT"), makeString("Sxhash"), makeString("sxhash_rot"), list(makeSymbol("FIXNUM"), makeSymbol("HIGH-BITS"))), list(makeSymbol("UNLOAD-SHARED-OBJECT", "SUBLISP"), makeString("Alien"), makeString("unload_shared_object"), list(makeSymbol("PATHNAME"))), list(makeSymbol("WIDE-NEWLINE-STREAM-P", "SUBLISP"), makeString("StreamsLow"), makeString("wide_newline_stream_p"), list(makeSymbol("STREAM"))), list(makeSymbol("VALUES"), makeString("Values"), makeString("values"), list(makeSymbol("&REST"), makeSymbol("MORE-VALUES"))), list(makeSymbol("%RESET-MVAL"), makeString("Values"), makeString("resetMultipleValues"), NIL), list(makeSymbol("%ARG2"), makeString("Values"), makeString("arg2"), list(makeSymbol("ARG1"), makeSymbol("ARG2"))), list(makeSymbol("%MULTIPLE-VALUE-LIST"), makeString("Values"), makeString("multiple_value_list"), list(makeSymbol("EXPRESSION"))), list(makeSymbol("%NTH-VALUE-STEP-1"), makeString("Values"), makeString("nth_value_step_1"), list(makeSymbol("N"))), list(makeSymbol("%NTH-VALUE-STEP-2"), makeString("Values"), makeString("nth_value_step_2"), list(makeSymbol("N"), makeSymbol("EXPRESSION"))), list(makeSymbol("EXTERNAL-PROCESSES-SUPPORTED?", "SUBLISP"), makeString("Processes"), makeString("external_processes_supportedP"), NIL), list(makeSymbol("GET-EXTERNAL-PROCESS-STATUS", "SUBLISP"), makeString("Processes"), makeString("get_external_process_status"), list(makeSymbol("PROCESS-ID"), makeSymbol("&OPTIONAL"), makeSymbol("WAIT-UNTIL-DONE?"))), list(makeSymbol("KILL-EXTERNAL-PROCESS", "SUBLISP"), makeString("Processes"), makeString("kill_external_process"), list(makeSymbol("PROCESS-ID"))), list(makeSymbol("RUN-EXTERNAL-PROCESS", "SUBLISP"), makeString("Processes"), makeString("run_external_process"), list(makeSymbol("PROGRAM"), makeSymbol("&OPTIONAL"), makeSymbol("ARGS"), makeSymbol("STDIN-SPEC"), makeSymbol("STDOUT-SPEC"), makeSymbol("STDERR-SPEC"))), list(makeSymbol("CANONICAL-NULL-FILE-STREAM-PATH", "SUBLISP"), makeString("Filesys"), makeString("canonical_null_file_stream_path"), NIL), list(makeSymbol("%CURRENT-THREAD"), makeString("SubLProcess"), makeString("currentSubLThread"), NIL), list(makeSymbol("%THREAD-RESET-MVAL"), makeString("Values"), makeString("resetMultipleValues"), list(makeSymbol("THREAD"))), list(makeSymbol("%THREAD-MVAL-1"), makeString("Values"), makeString("firstMultipleValue"), list(makeSymbol("THREAD"))), list(makeSymbol("%THREAD-MVAL-2"), makeString("Values"), makeString("secondMultipleValue"), list(makeSymbol("THREAD"))), list(makeSymbol("%THREAD-MVAL-3"), makeString("Values"), makeString("thirdMultipleValue"), list(makeSymbol("THREAD"))), list(makeSymbol("%THREAD-MVAL-4"), makeString("Values"), makeString("fourthMultipleValue"), list(makeSymbol("THREAD"))), list(makeSymbol("%THREAD-MVAL-5"), makeString("Values"), makeString("fifthMultipleValue"), list(makeSymbol("THREAD"))), list(makeSymbol("%THREAD-MVAL-6"), makeString("Values"), makeString("sixthMultipleValue"), list(makeSymbol("THREAD"))), list(makeSymbol("%THREAD-MVAL-7"), makeString("Values"), makeString("seventhMultipleValue"), list(makeSymbol("THREAD"))), list(makeSymbol("%THREAD-MVAL-8"), makeString("Values"), makeString("eighthMultipleValue"), list(makeSymbol("THREAD"))), list(makeSymbol("%THREAD-MVAL"), makeString("Values"), makeString("nthMultipleValue"), list(makeSymbol("THREAD"), makeSymbol("N"))), list(makeSymbol("_STRUCTURES-BAG-P", "SUBLISP"), makeString("Structures"), makeString("structures_bag_p"), list(makeSymbol("X"))), list(makeSymbol("_NEW-STRUCTURE", "SUBLISP"), makeString("Structures"), makeString("new_structure"), list(makeSymbol("TYPE"), makeSymbol("SIZE"))), list(makeSymbol("_CLEAR-STRUCTURE", "SUBLISP"), makeString("Structures"), makeString("clear_structure"), list(makeSymbol("OBJECT"), makeSymbol("SIZE"))), list(makeSymbol("_CLEAR-SUB-STRUCTURE", "SUBLISP"), makeString("Structures"), makeString("clear_sub_structure"), list(makeSymbol("OBJECT"), makeSymbol("SIZE"), makeSymbol("TYPE"))), list(makeSymbol("_STRUCTURE-TYPE", "SUBLISP"), makeString("Structures"), makeString("structure_type"), list(makeSymbol("OBJECT"), makeSymbol("TYPE"))), list(makeSymbol("_STRUCTURE-SLOT", "SUBLISP"), makeString("Structures"), makeString("structure_slot"), list(makeSymbol("OBJECT"), makeSymbol("SLOT"))), list(makeSymbol("_SET-STRUCTURE-SLOT", "SUBLISP"), makeString("Structures"), makeString("set_structure_slot"), list(makeSymbol("OBJECT"), makeSymbol("SLOT"), makeSymbol("VALUE"))), list(makeSymbol("_REGISTER-DEFSTRUCT", "SUBLISP"), makeString("Structures"), makeString("register_defstruct"), list(makeSymbol("NAME"), makeSymbol("TYPE"), makeSymbol("SIZE"), makeSymbol("PRINT-FUNCTION"), makeSymbol("SLOTS"))), list(makeSymbol("_DEF-CSETF", "SUBLISP"), makeString("Structures"), makeString("def_csetf"), list(makeSymbol("ACCESSOR"), makeSymbol("SETTER"))), list(makeSymbol("%MAKE-STRUCT-DECL-NATIVE"), makeString("Structures"), makeString("makeStructDeclNative"), list(new SubLObject[]{ makeSymbol("CLASS"), makeSymbol("TYPE"), makeSymbol("PREDICATE"), makeSymbol("SLOTS"), makeSymbol("SLOT-KEYWORDS"), makeSymbol("FIELD-NAMES-ARRAY"), makeSymbol("GETTERS"), makeSymbol("SETTERS"), makeSymbol("PRINT-METHOD") })), list(makeSymbol("_METHOD", "SUBLISP"), makeString("Structures"), makeString("method_func"), list(makeSymbol("OBJECT"), makeSymbol("METHOD-TABLE"))), list(makeSymbol("_REGISTER-METHOD", "SUBLISP"), makeString("Structures"), makeString("register_method"), list(makeSymbol("METHOD-TABLE"), makeSymbol("TYPE"), makeSymbol("FUNCTION"))), list(makeSymbol("%HANDLE-CATCHABLE-THROW"), makeString("Dynamic"), makeString("handleCatchableThrow"), list(makeSymbol("CT"), makeSymbol("TAG"))), list(makeSymbol("%CDOHASH-GET-ENTRY-SET-ITERATOR"), makeString("Hashtables"), makeString("getEntrySetIterator"), list(makeSymbol("TABLE"))), list(makeSymbol("%CDOHASH-ITERATOR-HAS-NEXT"), makeString("Hashtables"), makeString("iteratorHasNext"), list(makeSymbol("ITERATOR"))), list(makeSymbol("%CDOHASH-ITERATOR-NEXT-ENTRY"), makeString("Hashtables"), makeString("iteratorNextEntry"), list(makeSymbol("ITERATOR"))), list(makeSymbol("%CDOHASH-GET-ENTRY-KEY"), makeString("Hashtables"), makeString("getEntryKey"), list(makeSymbol("ENTRY"))), list(makeSymbol("%CDOHASH-GET-ENTRY-VALUE"), makeString("Hashtables"), makeString("getEntryValue"), list(makeSymbol("ENTRY"))), list(makeSymbol("%CDOHASH-RELEASE-ENTRY-SET-ITERATOR"), makeString("Hashtables"), makeString("releaseEntrySetIterator"), list(makeSymbol("ITERATOR"))), list(makeSymbol("%CDO-SYMBOLS-MAKE-ITERATOR"), makeString("Packages"), makeString("makeSymbolIterator"), list(makeSymbol("PACKAGE"))), list(makeSymbol("%CDO-SYMBOLS-ITERATOR-HAS-NEXT"), makeString("Packages"), makeString("symbolIteratorHasNext"), list(makeSymbol("ITERATOR"))), list(makeSymbol("%CDO-SYMBOLS-ITERATOR-NEXT-VALUE"), makeString("Packages"), makeString("symbolIteratorNext"), list(makeSymbol("ITERATOR"))), list(makeSymbol("%CURRENT-BINDING"), makeString("Dynamic"), makeString("currentBinding"), list(makeSymbol("VAR"))), list(makeSymbol("%BIND"), makeString("Dynamic"), makeString("bind"), list(makeSymbol("VAR"), makeSymbol("NEW-VALUE"))), list(makeSymbol("%REBIND"), makeString("Dynamic"), makeString("rebind"), list(makeSymbol("VAR"), makeSymbol("OLD-VALUE"))), list(makeSymbol("%EXTRACT-DYNAMIC-VALUES"), makeString("Dynamic"), makeString("extract_dynamic_values"), list(makeSymbol("DYNAMIC-VARS"))), list(makeSymbol("%BIND-DYNAMIC-VARS"), makeString("Dynamic"), makeString("bind_dynamic_vars"), list(makeSymbol("DYNAMIC-VARS"), makeSymbol("BINDINGS"))), list(makeSymbol("%REBIND-DYNAMIC-VARS"), makeString("Dynamic"), makeString("rebind_dynamic_vars"), list(makeSymbol("DYNAMIC-VARS"), makeSymbol("OLD-VALUES-ARRAY"))), list(makeSymbol("_JRTL-PARSE-INTEGER", "SUBLISP"), makeString("Numbers"), makeString("jrtl_parse_integer"), list(makeSymbol("STRING"), makeSymbol("&OPTIONAL"), makeSymbol("START"), makeSymbol("END"), makeSymbol("RADIX"))), list(makeSymbol("START-TCP-SERVER", "SUBLISP"), makeString("Tcp"), makeString("start_tcp_server"), list(makeSymbol("PORT"), makeSymbol("HANDLER"))), list(makeSymbol("START-TCP-SERVER", "SUBLISP"), makeString("Tcp"), makeString("stop_tcp_server"), list(makeSymbol("PORT"))), list(makeSymbol("%HANDLE-RUNTIME-EXCEPTION"), makeString("Errors"), makeString("handleRuntimeException"), list(makeSymbol("RTE"))), list(makeSymbol("%HANDLE-THROWABLE"), makeString("Errors"), makeString("handleThrowable"), list(makeSymbol("THROWABLE"), makeSymbol("TAG"))), list(makeSymbol("%COMPUTE-WITH-PROCESS-RESOURCE-TRACKING-RESULTS"), makeString("Time"), makeString("compute_with_process_resource_tracking_results"), list(makeSymbol("ENV"))), list(makeSymbol("GET-STATIC-AREA"), makeString("Storage"), makeString("get_static_area"), NIL), list(makeSymbol("GET-THREAD-PRIVATE-AREA"), makeString("Storage"), makeString("get_thread_private_area"), NIL), list(makeSymbol("GET-WORKING-AREA"), makeString("Storage"), makeString("get_working_area"), NIL), list(makeSymbol("_CSETF-READTABLE-CASE", "SUBLISP"), makeString("reader"), makeString("_csetf_readtable_case"), list(makeSymbol("OBJECT"), makeSymbol("VALUE"))), list(makeSymbol("_CSETF-READTABLE-CHARACTER-SYNTAX", "SUBLISP"), makeString("reader"), makeString("_csetf_readtable_character_syntax"), list(makeSymbol("OBJECT"), makeSymbol("VALUE"))), list(makeSymbol("_CSETF-READTABLE-SINGLE-BYTE-CHAR-SYNTAX", "SUBLISP"), makeString("reader"), makeString("_csetf_readtable_single_byte_char_syntax"), list(makeSymbol("OBJECT"), makeSymbol("VALUE"))), list(makeSymbol("_CSETF-READTABLE-MACRO-FUNCTIONS", "SUBLISP"), makeString("reader"), makeString("_csetf_readtable_macro_functions"), list(makeSymbol("OBJECT"), makeSymbol("VALUE"))), list(makeSymbol("_CSETF-READTABLE-SINGLE-BYTE-MACRO-FUNCTIONS", "SUBLISP"), makeString("reader"), makeString("_csetf_readtable_single_byte_macro_functions"), list(makeSymbol("OBJECT"), makeSymbol("VALUE"))), list(makeSymbol("_CSETF-READTABLE-CONSTITUENT-TRAITS", "SUBLISP"), makeString("reader"), makeString("_csetf_readtable_constituent_traits"), list(makeSymbol("OBJECT"), makeSymbol("VALUE"))), list(makeSymbol("_CSETF-READTABLE-SINGLE-BYTE-CONSTIT-TRAITS", "SUBLISP"), makeString("reader"), makeString("_csetf_readtable_single_byte_constit_traits"), list(makeSymbol("OBJECT"), makeSymbol("VALUE"))), list(makeSymbol("_CSETF-READTABLE-DISPATCH-TABLES", "SUBLISP"), makeString("reader"), makeString("_csetf_readtable_dispatch_tables"), list(makeSymbol("OBJECT"), makeSymbol("VALUE"))), list(makeSymbol("IS-REGEX-IMPLEMENTATION-AVAILABLE?", "SUBLISP"), makeString("Regex"), makeString("is_regex_implementation_availableP"), NIL), list(makeSymbol("REGEX-VERSION", "SUBLISP"), makeString("Regex"), makeString("regex_version"), NIL), list(makeSymbol("REGEX-PATTERN-P-IMPL", "SUBLISP"), makeString("Regex"), makeString("regex_pattern_p_impl"), list(makeSymbol("PATTERN"))), list(makeSymbol("COMPILE-REGULAR-EXPRESSION-IMPL", "SUBLISP"), makeString("Regex"), makeString("compile_regular_expression_impl"), list(makeSymbol("EXPRESSION"), makeSymbol("OPTION-VALUE"))), list(makeSymbol("MATCH-REGULAR-EXPRESSION-PATTERN-OFFSETS-IMPL", "SUBLISP"), makeString("Regex"), makeString("match_regular_expression_pattern_offsets_impl"), list(makeSymbol("PATTERN"), makeSymbol("STRING"), makeSymbol("MATCHES"), makeSymbol("OPTION-VALUE"), makeSymbol("START"), makeSymbol("END"))), list(makeSymbol("DISCARD-REGULAR-EXPRESSION-PATTERN-IMPL", "SUBLISP"), makeString("Regex"), makeString("discard_regular_expression_pattern_impl"), list(makeSymbol("PATTERN"))), list(makeSymbol("GET-REGEX-ERRORMSG", "SUBLISP"), makeString("Regex"), makeString("get_regex_errormsg"), list(makeSymbol("CODE"))), list(makeSymbol("%UNIMPLEMENTED-METHOD"), makeString("Errors"), makeString("unimplementedMethod"), list(makeSymbol("NAME"))) });
    }

    private static SubLObject _constant_4_initializer() {
        return list(new SubLObject[]{ list(makeSymbol("OPEN"), makeString("StreamsLow"), makeString("open"), list(makeSymbol("FILESPEC"), makeSymbol("&REST"), makeSymbol("KEYS"))), list(makeSymbol("%BTD"), makeKeyword("IMPORTED"), makeString("makeBoolean"), list(makeSymbol("OBJ"))), list(makeSymbol("%CBIG"), makeKeyword("IMPORTED"), makeString("makeInteger"), list(makeSymbol("STRING-REP"))), list(makeSymbol("%CCHAR"), makeKeyword("IMPORTED"), makeString("makeChar"), list(makeSymbol("CODE"))), list(makeSymbol("%CFIX"), makeKeyword("IMPORTED"), makeString("makeInteger"), list(makeSymbol("FIXNUM"))), list(makeSymbol("%CFLOAT"), makeKeyword("IMPORTED"), makeString("makeDouble"), list(makeSymbol("FLOAT"))), list(makeSymbol("%CGUID"), makeKeyword("IMPORTED"), makeString("makeGuid"), list(makeSymbol("STRING"))), list(makeSymbol("%CINTERN"), makeKeyword("IMPORTED"), makeString("makeSymbol"), list(makeSymbol("STRING"))), list(makeSymbol("%CKEYWORD"), makeKeyword("IMPORTED"), makeString("makeKeyword"), list(makeSymbol("STRING"))), list(makeSymbol("%CMAKE-SYMBOL"), makeKeyword("IMPORTED"), makeString("makeUninternedSymbol"), list(makeSymbol("STRING"))), list(makeSymbol("%CSTRING"), makeKeyword("IMPORTED"), makeString("makeString"), list(makeSymbol("STRING"))), list(makeSymbol("%CSYMBOL"), makeKeyword("IMPORTED"), makeString("makeSymbol"), list(makeSymbol("SYMBOL-NAME"), makeSymbol("PACKAGE-NAME"))), list(makeSymbol("%DTB"), makeString("SubLNil"), makeString("toBool"), list(makeSymbol("OBJ"))), list(makeSymbol("%DYN"), makeString("Symbols"), makeString("symbol_value"), list(makeSymbol("VAR"))), list(makeSymbol("%GET-RESULT"), makeString("Dynamic"), makeString("getResult"), list(makeSymbol("CATCHABLE-THROW"))), list(makeSymbol("%GET-TARGET"), makeString("Dynamic"), makeString("getTarget"), list(makeSymbol("CATCHABLE-THROW"))), list(makeSymbol("%HASH-INDEX-KEY", "SUBLISP"), makeString("Hashtables"), makeString("hash_index_key"), list(makeSymbol("TABLE"), makeSymbol("INDEX"))), list(makeSymbol("%HASH-INDEX-OBJ", "SUBLISP"), makeString("Hashtables"), makeString("hash_index_obj"), list(makeSymbol("TABLE"), makeSymbol("INDEX"))), list(makeSymbol("%LEX"), makeString("Symbols"), makeString("symbol_value"), list(makeSymbol("VAR"))), list(makeSymbol("%MVAL"), makeString("SubLProcess"), makeString("nthMultipleValue"), list(makeSymbol("N"))), list(makeSymbol("%PROCLAIM"), makeString("SubLSpecialOperatorDeclarations"), makeString("proclaim"), list(makeSymbol("DECL"))), list(makeSymbol("%NEXT-HASH-INDEX", "SUBLISP"), makeString("Hashtables"), makeString("next_hash_index"), list(makeSymbol("TABLE"), makeSymbol("INDEX"))), list(makeSymbol("PRINT-NOT-READABLE"), makeString("print_high"), makeString("print_not_readable"), list(makeSymbol("OBJECT"), makeSymbol("STREAM"))), list(makeSymbol("%SET-DYN"), makeString("Symbols"), makeString("set"), list(makeSymbol("VAR"), makeSymbol("VAL"))), list(makeSymbol("%SET-LEX"), makeString("Symbols"), makeString("set"), list(makeSymbol("VAR"), makeSymbol("VAL"))), list(makeSymbol("%GET-INITIAL-CONTINUATION", "SUBLISP"), makeString("Eval"), makeString("get_initial_continuation"), NIL), list(makeSymbol("%GET-RED-OBJECT", "SUBLISP"), makeString("SubLMain"), makeString("get_red_object"), NIL), list(makeSymbol("%SET-INITIAL-CONTINUATION", "SUBLISP"), makeString("Eval"), makeString("set_initial_continuation"), list(makeSymbol("FUNCTIONSPEC"))), list(makeSymbol("ALIEN-AS-STRING", "SUBLISP"), makeString("Alien"), makeString("alien_as_string"), list(makeSymbol("OBJECT"))), list(makeSymbol("ALIEN-P", "SUBLISP"), makeString("Alien"), makeString("alien_p"), list(makeSymbol("OBJECT"))), list(makeSymbol("CIRCULAR-REFERENCE-P", "SUBLISP"), makeString("print_high"), makeString("circular_reference_p"), list(makeSymbol("OBJECT"), makeSymbol("STREAM"))), list(makeSymbol("DEF-FOREIGN-FUNCTION", "SUBLISP"), makeString("Alien"), makeString("def_foreign_function"), list(makeSymbol("FOREIGN-SHARED-LIBRARY"), makeSymbol("FOREIGN-NAME"), makeSymbol("SYMBOL"), makeSymbol("ARG-CONVERSION"), makeSymbol("RET-TYPE"), makeSymbol("CALLING-CONVENTION"), makeSymbol("NULL-DEFAULT-RETURN"))), list(makeSymbol("DESCRIPTOR-STREAM-CLOSE", "SUBLISP"), makeString("StreamsLow"), makeString("descriptor_stream_close"), list(makeSymbol("STREAM"), makeSymbol("ABORT"))), list(makeSymbol("DESCRIPTOR-STREAM-FILE-LENGTH", "SUBLISP"), makeString("StreamsLow"), makeString("descriptor_stream_file_length"), list(makeSymbol("STREAM"))), list(makeSymbol("DESCRIPTOR-STREAM-FILE-POSITION", "SUBLISP"), makeString("StreamsLow"), makeString("descriptor_stream_file_position"), list(makeSymbol("STREAM"))), list(makeSymbol("DESCRIPTOR-STREAM-NEXT-INPUT-BUFFER", "SUBLISP"), makeString("StreamsLow"), makeString("descriptor_stream_next_input_buffer"), list(makeSymbol("STREAM"), makeSymbol("WAITP"))), list(makeSymbol("DESCRIPTOR-STREAM-SEND-OUTPUT-BUFFER", "SUBLISP"), makeString("StreamsLow"), makeString("descriptor_stream_send_output_buffer"), list(makeSymbol("STREAM"))), list(makeSymbol("DESCRIPTOR-STREAM-SET-FILE-POSITION", "SUBLISP"), makeString("StreamsLow"), makeString("descriptor_stream_set_file_position"), list(makeSymbol("STREAM"), makeSymbol("POSITION-SPEC"))), list(makeSymbol("FILE-POINTER-STREAM-CLOSE", "SUBLISP"), makeString("StreamsLow"), makeString("file_pointer_stream_close"), list(makeSymbol("STREAM"), makeSymbol("ABORT"))), list(makeSymbol("FILE-POINTER-STREAM-FILE-LENGTH", "SUBLISP"), makeString("StreamsLow"), makeString("file_pointer_stream_file_length"), list(makeSymbol("STREAM"))), list(makeSymbol("FILE-POINTER-STREAM-FILE-POSITION", "SUBLISP"), makeString("StreamsLow"), makeString("file_pointer_stream_file_position"), list(makeSymbol("STREAM"))), list(makeSymbol("FILE-POINTER-STREAM-NEXT-INPUT-BUFFER", "SUBLISP"), makeString("StreamsLow"), makeString("file_pointer_stream_next_input_buffer"), list(makeSymbol("STREAM"), makeSymbol("WAITP"))), list(makeSymbol("FILE-POINTER-STREAM-SEND-OUTPUT-BUFFER", "SUBLISP"), makeString("StreamsLow"), makeString("file_pointer_stream_send_output_buffer"), list(makeSymbol("STREAM"))), list(makeSymbol("FILE-POINTER-STREAM-SET-FILE-POSITION", "SUBLISP"), makeString("StreamsLow"), makeString("file_pointer_stream_set_file_position"), list(makeSymbol("STREAM"), makeSymbol("POSITION-SPEC"))), list(makeSymbol("GET-TIME", "SUBLISP"), makeString("Time"), makeString("get_time"), NIL), list(makeSymbol("GET-TIMEZONE", "SUBLISP"), makeString("Time"), makeString("get_timezone"), list(makeSymbol("&OPTIONAL"), makeSymbol("UNIVERSAL-TIME"))), list(makeSymbol("%COMPUTE-WITH-PROCESS-RESOURCE-TRACKING-RESULTS"), makeString("Time"), makeString("compute_with_process_resource_tracking_results"), list(makeSymbol("ENV-VAR"))), list(makeSymbol("LOAD-SHARED-OBJECT", "SUBLISP"), makeString("Alien"), makeString("load_shared_object"), list(makeSymbol("MONIKER"), makeSymbol("PATHNAME"), makeSymbol("OPTIONS"))), list(makeSymbol("OPEN-DESCRIPTOR", "SUBLISP"), makeString("StreamsLow"), makeString("open_descriptor"), list(makeSymbol("FILESPEC"), makeSymbol("DIRECTION"), makeSymbol("ELEMENT-TYPE"), makeSymbol("IF-EXISTS"), makeSymbol("IF-DOES-NOT-EXIST"), makeSymbol("EXTERNAL-FORMAT"))), list(makeSymbol("POINTER", "SUBLISP"), makeString("Equality"), makeString("pointer"), list(makeSymbol("OBJECT"))), list(makeSymbol("PRINT-CHARACTER", "SUBLISP"), makeString("print_functions"), makeString("print_character"), list(makeSymbol("CHAR"), makeSymbol("STREAM"))), list(makeSymbol("PRINT-CONS-CELLS", "SUBLISP"), makeString("print_functions"), makeString("print_cons_cells"), list(makeSymbol("CONS"), makeSymbol("STREAM"))), list(makeSymbol("PRINT-FLONUM", "SUBLISP"), makeString("print_functions"), makeString("print_flonum"), list(makeSymbol("FLONUM"), makeSymbol("STREAM"))), list(makeSymbol("PRINT-FUNCTION", "SUBLISP"), makeString("Functions"), makeString("print_function"), list(makeSymbol("FUNCTION"), makeSymbol("STREAM"))), list(makeSymbol("PRINT-HASHTABLE", "SUBLISP"), makeString("print_functions"), makeString("print_hashtable"), list(makeSymbol("HASHTABLE"), makeSymbol("STREAM"))), list(makeSymbol("PRINT-INTEGER", "SUBLISP"), makeString("print_functions"), makeString("print_integer"), list(makeSymbol("INTEGER"), makeSymbol("STREAM"))), list(makeSymbol("PRINT-SYMBOL", "SUBLISP"), makeString("print_functions"), makeString("print_symbol"), list(makeSymbol("SYMBOL"), makeSymbol("STREAM"))), list(makeSymbol("PRINT-STRING", "SUBLISP"), makeString("print_functions"), makeString("print_string"), list(makeSymbol("STRING"), makeSymbol("STREAM"))), list(makeSymbol("PRINT-VECTOR", "SUBLISP"), makeString("print_functions"), makeString("print_vector"), list(makeSymbol("VECTOR"), makeSymbol("STREAM"))), list(makeSymbol("RELEASE-LOCK", "SUBLISP"), makeString("Locks"), makeString("release_lock"), list(makeSymbol("LOCK"))), list(makeSymbol("SEIZE-LOCK", "SUBLISP"), makeString("Locks"), makeString("seize_lock"), list(makeSymbol("LOCK"))), list(makeSymbol("STREAM-INPUT-INDEX", "SUBLISP"), makeString("streams_high"), makeString("stream_input_index"), list(makeSymbol("OBJECT"))), list(makeSymbol("READ-BYTE-SEQUENCE-TO-POSITIVE-INTEGER", "SUBLISP"), makeString("streams_high"), makeString("read_byte_sequence_to_positive_integer"), list(makeSymbol("BYTES"), makeSymbol("&OPTIONAL"), makeSymbol("STREAM"), makeSymbol("EOF-ERROR-P"), makeSymbol("EOF-VALUE"), makeSymbol("NETWORK-BYTE-ORDER?"))), list(makeSymbol("WRITE-POSITIVE-INTEGER-TO-BYTE-SEQUENCE", "SUBLISP"), makeString("streams_high"), makeString("write_positive_integer_as_byte_sequence"), list(makeSymbol("INT"), makeSymbol("BYTES"), makeSymbol("&OPTIONAL"), makeSymbol("STREAM"), makeSymbol("NETWORK-BYTE-ORDER?"))), list(makeSymbol("READ-BYTE-SEQUENCE-INTO-STRING", "SUBLISP"), makeString("streams_high"), makeString("read_byte_sequence_into_string"), list(makeSymbol("STRING"), makeSymbol("&OPTIONAL"), makeSymbol("STREAM"), makeSymbol("EOF-ERROR-P"), makeSymbol("EOF-VALUE"))), list(makeSymbol("WRITE-STRING-TO-BYTE-SEQUENCE", "SUBLISP"), makeString("streams_high"), makeString("write_string_to_byte_sequence"), list(makeSymbol("STRING"), makeSymbol("&OPTIONAL"), makeSymbol("STREAM"), makeSymbol("OFFSET"), makeSymbol("LENGTH"))), list(makeSymbol("UNREAD-BYTE", "SUBLISP"), makeString("streams_high"), makeString("unread_byte"), list(makeSymbol("BYTE"), makeSymbol("STREAM"))), list(makeSymbol("EXTERNAL-PROCESSES-SUPPORTED?"), makeString("Processes"), makeString("external_processes_supportedP"), NIL), list(makeSymbol("BIGNUMP"), makeString("Types"), makeString("bignump"), list(makeSymbol("OBJECT"))), list(makeSymbol("BOOLEANP"), makeString("Types"), makeString("booleanp"), list(makeSymbol("OBJECT"))), list(makeSymbol("READER-WRITER-LOCK-P"), makeString("ReadWriteLocks"), makeString("rw_lock_p"), list(makeSymbol("POSSIBLE-RW-LOCK"))), list(makeSymbol("RW-LOCK-P"), makeString("ReadWriteLocks"), makeString("rw_lock_p"), list(makeSymbol("POSSIBLE-RW-LOCK"))), list(makeSymbol("NEW-RW-LOCK"), makeString("ReadWriteLocks"), makeString("new_rw_lock"), list(makeSymbol("NAME"))), list(makeSymbol("RW-LOCK-NAME"), makeString("ReadWriteLocks"), makeString("rw_lock_name"), list(makeSymbol("RW-LOCK"))), list(makeSymbol("RW-LOCK-SEIZE-READ-LOCK"), makeString("ReadWriteLocks"), makeString("rw_lock_seize_read_lock"), list(makeSymbol("RW-LOCK"))), list(makeSymbol("RW-LOCK-SEIZE-WRITE-LOCK"), makeString("ReadWriteLocks"), makeString("rw_lock_seize_write_lock"), list(makeSymbol("RW-LOCK"))), list(makeSymbol("RW-LOCK-RELEASE-READ-LOCK"), makeString("ReadWriteLocks"), makeString("rw_lock_release_read_lock"), list(makeSymbol("RW-LOCK"))), list(makeSymbol("RW-LOCK-RELEASE-WRITE-LOCK"), makeString("ReadWriteLocks"), makeString("rw_lock_release_write_lock"), list(makeSymbol("RW-LOCK"))), list(makeSymbol("RW-LOCK-WRITER"), makeString("ReadWriteLocks"), makeString("rw_lock_writer"), list(makeSymbol("RW-LOCK"))), list(makeSymbol("RW-LOCK-WAITERS"), makeString("ReadWriteLocks"), makeString("rw_lock_waiters"), list(makeSymbol("RW-LOCK"))), list(makeSymbol("SEMAPHORE-P"), makeString("Semaphores"), makeString("semaphore_p"), list(makeSymbol("OBJECT"))), list(makeSymbol("NEW-SEMAPHORE"), makeString("Semaphores"), makeString("new_semaphore"), list(makeSymbol("NAME"), makeSymbol("&OPTIONAL"), makeSymbol("COUNT"))), list(makeSymbol("SEMAPHORE-NAME"), makeString("Semaphores"), makeString("semaphore_name"), list(makeSymbol("SEMAPHORE"))), list(makeSymbol("SEMAPHORE-SIGNAL"), makeString("Semaphores"), makeString("semaphore_signal"), list(makeSymbol("SEMAPHORE"))), list(makeSymbol("SEMAPHORE-CURRENT-COUNT"), makeString("Semaphores"), makeString("semaphore_current_count"), list(makeSymbol("SEMAPHORE"))), list(makeSymbol("SEMAPHORE-WAIT"), makeString("Semaphores"), makeString("semaphore_wait"), list(makeSymbol("SEMAPHORE"))), list(makeSymbol("SEMAPHORE-DRAIN"), makeString("Semaphores"), makeString("semaphore_drain"), list(makeSymbol("SEMAPHORE"))), list(makeSymbol("SEMAPHORE-WAIT-WITH-TIMEOUT"), makeString("Semaphores"), makeString("semaphore_wait_with_timeout"), list(makeSymbol("SEMAPHORE"), makeSymbol("MAX-SECS-TO-WAIT"))), list(makeSymbol("SXHASH-ROT"), makeString("Sxhash"), makeString("sxhash_rot"), list(makeSymbol("FIXNUM"), makeSymbol("HIGH-BITS"))), list(makeSymbol("UNLOAD-SHARED-OBJECT", "SUBLISP"), makeString("Alien"), makeString("unload_shared_object"), list(makeSymbol("PATHNAME"))), list(makeSymbol("WIDE-NEWLINE-STREAM-P", "SUBLISP"), makeString("StreamsLow"), makeString("wide_newline_stream_p"), list(makeSymbol("STREAM"))), list(makeSymbol("MEMORY-MAPPED-STREAM-P", "SUBLISP"), makeString("StreamsLow"), makeString("isMemoryMappedStream"), list(makeSymbol("STREAM"))), list(makeSymbol("VALUES"), makeString("Values"), makeString("values"), list(makeSymbol("&REST"), makeSymbol("MORE-VALUES"))), list(makeSymbol("%RESET-MVAL"), makeString("Values"), makeString("resetMultipleValues"), NIL), list(makeSymbol("%ARG2"), makeString("Values"), makeString("arg2"), list(makeSymbol("ARG1"), makeSymbol("ARG2"))), list(makeSymbol("%MULTIPLE-VALUE-LIST"), makeString("Values"), makeString("multiple_value_list"), list(makeSymbol("EXPRESSION"))), list(makeSymbol("%NTH-VALUE-STEP-1"), makeString("Values"), makeString("nth_value_step_1"), list(makeSymbol("N"))), list(makeSymbol("%NTH-VALUE-STEP-2"), makeString("Values"), makeString("nth_value_step_2"), list(makeSymbol("N"), makeSymbol("EXPRESSION"))), list(makeSymbol("%VALUES-AS-VECTOR"), makeString("Values"), makeString("getValuesAsVector"), NIL), list(makeSymbol("%RESTORE-VALUES-FROM-VECTOR"), makeString("Values"), makeString("restoreValuesFromVector"), list(makeSymbol("VALUES"))), list(makeSymbol("EXTERNAL-PROCESSES-SUPPORTED?", "SUBLISP"), makeString("Processes"), makeString("external_processes_supportedP"), NIL), list(makeSymbol("GET-EXTERNAL-PROCESS-STATUS", "SUBLISP"), makeString("Processes"), makeString("get_external_process_status"), list(makeSymbol("PROCESS-ID"), makeSymbol("&OPTIONAL"), makeSymbol("WAIT-UNTIL-DONE?"))), list(makeSymbol("KILL-EXTERNAL-PROCESS", "SUBLISP"), makeString("Processes"), makeString("kill_external_process"), list(makeSymbol("PROCESS-ID"))), list(makeSymbol("RUN-EXTERNAL-PROCESS", "SUBLISP"), makeString("Processes"), makeString("run_external_process"), list(makeSymbol("PROGRAM"), makeSymbol("&OPTIONAL"), makeSymbol("ARGS"), makeSymbol("STDIN-SPEC"), makeSymbol("STDOUT-SPEC"), makeSymbol("STDERR-SPEC"))), list(makeSymbol("CANONICAL-NULL-FILE-STREAM-PATH", "SUBLISP"), makeString("Filesys"), makeString("canonical_null_file_stream_path"), NIL), list(makeSymbol("%CURRENT-THREAD"), makeString("SubLProcess"), makeString("currentSubLThread"), NIL), list(makeSymbol("%THREAD-RESET-MVAL"), makeString("Values"), makeString("resetMultipleValues"), list(makeSymbol("THREAD"))), list(makeSymbol("%THREAD-MVAL-1"), makeString("Values"), makeString("firstMultipleValue"), list(makeSymbol("THREAD"))), list(makeSymbol("%THREAD-MVAL-2"), makeString("Values"), makeString("secondMultipleValue"), list(makeSymbol("THREAD"))), list(makeSymbol("%THREAD-MVAL-3"), makeString("Values"), makeString("thirdMultipleValue"), list(makeSymbol("THREAD"))), list(makeSymbol("%THREAD-MVAL-4"), makeString("Values"), makeString("fourthMultipleValue"), list(makeSymbol("THREAD"))), list(makeSymbol("%THREAD-MVAL-5"), makeString("Values"), makeString("fifthMultipleValue"), list(makeSymbol("THREAD"))), list(makeSymbol("%THREAD-MVAL-6"), makeString("Values"), makeString("sixthMultipleValue"), list(makeSymbol("THREAD"))), list(makeSymbol("%THREAD-MVAL-7"), makeString("Values"), makeString("seventhMultipleValue"), list(makeSymbol("THREAD"))), list(makeSymbol("%THREAD-MVAL-8"), makeString("Values"), makeString("eighthMultipleValue"), list(makeSymbol("THREAD"))), list(makeSymbol("%THREAD-MVAL"), makeString("Values"), makeString("nthMultipleValue"), list(makeSymbol("THREAD"), makeSymbol("N"))), list(makeSymbol("_STRUCTURES-BAG-P", "SUBLISP"), makeString("Structures"), makeString("structures_bag_p"), list(makeSymbol("X"))), list(makeSymbol("_NEW-STRUCTURE", "SUBLISP"), makeString("Structures"), makeString("new_structure"), list(makeSymbol("TYPE"), makeSymbol("SIZE"))), list(makeSymbol("_CLEAR-STRUCTURE", "SUBLISP"), makeString("Structures"), makeString("clear_structure"), list(makeSymbol("OBJECT"), makeSymbol("SIZE"))), list(makeSymbol("_CLEAR-SUB-STRUCTURE", "SUBLISP"), makeString("Structures"), makeString("clear_sub_structure"), list(makeSymbol("OBJECT"), makeSymbol("SIZE"), makeSymbol("TYPE"))), list(makeSymbol("_STRUCTURE-TYPE", "SUBLISP"), makeString("Structures"), makeString("structure_type"), list(makeSymbol("OBJECT"), makeSymbol("TYPE"))), list(makeSymbol("_STRUCTURE-SLOT", "SUBLISP"), makeString("Structures"), makeString("structure_slot"), list(makeSymbol("OBJECT"), makeSymbol("SLOT"))), list(makeSymbol("_SET-STRUCTURE-SLOT", "SUBLISP"), makeString("Structures"), makeString("set_structure_slot"), list(makeSymbol("OBJECT"), makeSymbol("SLOT"), makeSymbol("VALUE"))), list(makeSymbol("_REGISTER-DEFSTRUCT", "SUBLISP"), makeString("Structures"), makeString("register_defstruct"), list(makeSymbol("NAME"), makeSymbol("TYPE"), makeSymbol("SIZE"), makeSymbol("PRINT-FUNCTION"), makeSymbol("SLOTS"))), list(makeSymbol("_DEF-CSETF", "SUBLISP"), makeString("Structures"), makeString("def_csetf"), list(makeSymbol("ACCESSOR"), makeSymbol("SETTER"))), list(makeSymbol("%MAKE-STRUCT-DECL-NATIVE"), makeString("Structures"), makeString("makeStructDeclNative"), list(new SubLObject[]{ makeSymbol("CLASS"), makeSymbol("TYPE"), makeSymbol("PREDICATE"), makeSymbol("SLOTS"), makeSymbol("SLOT-KEYWORDS"), makeSymbol("FIELD-NAMES-ARRAY"), makeSymbol("GETTERS"), makeSymbol("SETTERS"), makeSymbol("PRINT-METHOD") })), list(makeSymbol("_METHOD", "SUBLISP"), makeString("Structures"), makeString("method_func"), list(makeSymbol("OBJECT"), makeSymbol("METHOD-TABLE"))), list(makeSymbol("_REGISTER-METHOD", "SUBLISP"), makeString("Structures"), makeString("register_method"), list(makeSymbol("METHOD-TABLE"), makeSymbol("TYPE"), makeSymbol("FUNCTION"))), list(makeSymbol("%HANDLE-CATCHABLE-THROW"), makeString("Dynamic"), makeString("handleCatchableThrow"), list(makeSymbol("CT"), makeSymbol("TAG"))), list(makeSymbol("%CDOHASH-GET-ENTRY-SET-ITERATOR"), makeString("Hashtables"), makeString("getEntrySetIterator"), list(makeSymbol("TABLE"))), list(makeSymbol("%CDOHASH-ITERATOR-HAS-NEXT"), makeString("Hashtables"), makeString("iteratorHasNext"), list(makeSymbol("ITERATOR"))), list(makeSymbol("%CDOHASH-ITERATOR-NEXT-ENTRY"), makeString("Hashtables"), makeString("iteratorNextEntry"), list(makeSymbol("ITERATOR"))), list(makeSymbol("%CDOHASH-GET-ENTRY-KEY"), makeString("Hashtables"), makeString("getEntryKey"), list(makeSymbol("ENTRY"))), list(makeSymbol("%CDOHASH-GET-ENTRY-VALUE"), makeString("Hashtables"), makeString("getEntryValue"), list(makeSymbol("ENTRY"))), list(makeSymbol("%CDOHASH-RELEASE-ENTRY-SET-ITERATOR"), makeString("Hashtables"), makeString("releaseEntrySetIterator"), list(makeSymbol("ITERATOR"))), list(makeSymbol("%CDO-SYMBOLS-MAKE-ITERATOR"), makeString("Packages"), makeString("makeSymbolIterator"), list(makeSymbol("PACKAGE"))), list(makeSymbol("%CDO-SYMBOLS-ITERATOR-HAS-NEXT"), makeString("Packages"), makeString("symbolIteratorHasNext"), list(makeSymbol("ITERATOR"))), list(makeSymbol("%CDO-SYMBOLS-ITERATOR-NEXT-VALUE"), makeString("Packages"), makeString("symbolIteratorNext"), list(makeSymbol("ITERATOR"))), list(makeSymbol("%CURRENT-BINDING"), makeString("Dynamic"), makeString("currentBinding"), list(makeSymbol("VAR"))), list(makeSymbol("%BIND"), makeString("Dynamic"), makeString("bind"), list(makeSymbol("VAR"), makeSymbol("NEW-VALUE"))), list(makeSymbol("%REBIND"), makeString("Dynamic"), makeString("rebind"), list(makeSymbol("VAR"), makeSymbol("OLD-VALUE"))), list(makeSymbol("%EXTRACT-DYNAMIC-VALUES"), makeString("Dynamic"), makeString("extract_dynamic_values"), list(makeSymbol("DYNAMIC-VARS"))), list(makeSymbol("%BIND-DYNAMIC-VARS"), makeString("Dynamic"), makeString("bind_dynamic_vars"), list(makeSymbol("DYNAMIC-VARS"), makeSymbol("BINDINGS"))), list(makeSymbol("%REBIND-DYNAMIC-VARS"), makeString("Dynamic"), makeString("rebind_dynamic_vars"), list(makeSymbol("DYNAMIC-VARS"), makeSymbol("OLD-VALUES-ARRAY"))), list(makeSymbol("_JRTL-PARSE-INTEGER", "SUBLISP"), makeString("Numbers"), makeString("jrtl_parse_integer"), list(makeSymbol("STRING"), makeSymbol("&OPTIONAL"), makeSymbol("START"), makeSymbol("END"), makeSymbol("RADIX"))), list(makeSymbol("START-TCP-SERVER", "SUBLISP"), makeString("Tcp"), makeString("start_tcp_server"), list(makeSymbol("PORT"), makeSymbol("HANDLER"))), list(makeSymbol("START-TCP-SERVER", "SUBLISP"), makeString("Tcp"), makeString("stop_tcp_server"), list(makeSymbol("PORT"))), list(makeSymbol("%HANDLE-RUNTIME-EXCEPTION"), makeString("Errors"), makeString("handleRuntimeException"), list(makeSymbol("RTE"))), list(makeSymbol("%HANDLE-THROWABLE"), makeString("Errors"), makeString("handleThrowable"), list(makeSymbol("THROWABLE"), makeSymbol("TAG"))), list(makeSymbol("%COMPUTE-WITH-PROCESS-RESOURCE-TRACKING-RESULTS"), makeString("Time"), makeString("compute_with_process_resource_tracking_results"), list(makeSymbol("ENV"))), list(makeSymbol("GET-STATIC-AREA"), makeString("Storage"), makeString("get_static_area"), NIL), list(makeSymbol("GET-THREAD-PRIVATE-AREA"), makeString("Storage"), makeString("get_thread_private_area"), NIL), list(makeSymbol("GET-WORKING-AREA"), makeString("Storage"), makeString("get_working_area"), NIL), list(makeSymbol("%SCHEDULE-CURRENT-PROCESS-FOR-TIMEOUT"), makeString("Time"), makeString("schedule_current_process_for_timeout"), list(makeSymbol("TAG"), makeSymbol("TIME"))), list(makeSymbol("%ENSURE-CURRENT-PROCESS-TIMEOUT-IS-CANCELLED"), makeString("Time"), makeString("ensure_current_process_timeout_is_cancelled"), NIL), list(makeSymbol("_CSETF-READTABLE-CASE", "SUBLISP"), makeString("reader"), makeString("_csetf_readtable_case"), list(makeSymbol("OBJECT"), makeSymbol("VALUE"))), list(makeSymbol("_CSETF-READTABLE-CHARACTER-SYNTAX", "SUBLISP"), makeString("reader"), makeString("_csetf_readtable_character_syntax"), list(makeSymbol("OBJECT"), makeSymbol("VALUE"))), list(makeSymbol("_CSETF-READTABLE-SINGLE-BYTE-CHAR-SYNTAX", "SUBLISP"), makeString("reader"), makeString("_csetf_readtable_single_byte_char_syntax"), list(makeSymbol("OBJECT"), makeSymbol("VALUE"))), list(makeSymbol("_CSETF-READTABLE-MACRO-FUNCTIONS", "SUBLISP"), makeString("reader"), makeString("_csetf_readtable_macro_functions"), list(makeSymbol("OBJECT"), makeSymbol("VALUE"))), list(makeSymbol("_CSETF-READTABLE-SINGLE-BYTE-MACRO-FUNCTIONS", "SUBLISP"), makeString("reader"), makeString("_csetf_readtable_single_byte_macro_functions"), list(makeSymbol("OBJECT"), makeSymbol("VALUE"))), list(makeSymbol("_CSETF-READTABLE-CONSTITUENT-TRAITS", "SUBLISP"), makeString("reader"), makeString("_csetf_readtable_constituent_traits"), list(makeSymbol("OBJECT"), makeSymbol("VALUE"))), list(makeSymbol("_CSETF-READTABLE-SINGLE-BYTE-CONSTIT-TRAITS", "SUBLISP"), makeString("reader"), makeString("_csetf_readtable_single_byte_constit_traits"), list(makeSymbol("OBJECT"), makeSymbol("VALUE"))), list(makeSymbol("_CSETF-READTABLE-DISPATCH-TABLES", "SUBLISP"), makeString("reader"), makeString("_csetf_readtable_dispatch_tables"), list(makeSymbol("OBJECT"), makeSymbol("VALUE"))), list(makeSymbol("IS-REGEX-IMPLEMENTATION-AVAILABLE?", "SUBLISP"), makeString("Regex"), makeString("is_regex_implementation_availableP"), NIL), list(makeSymbol("REGEX-VERSION", "SUBLISP"), makeString("Regex"), makeString("regex_version"), NIL), list(makeSymbol("REGEX-PATTERN-P-IMPL", "SUBLISP"), makeString("Regex"), makeString("regex_pattern_p_impl"), list(makeSymbol("PATTERN"))), list(makeSymbol("COMPILE-REGULAR-EXPRESSION-IMPL", "SUBLISP"), makeString("Regex"), makeString("compile_regular_expression_impl"), list(makeSymbol("EXPRESSION"), makeSymbol("OPTION-VALUE"))), list(makeSymbol("MATCH-REGULAR-EXPRESSION-PATTERN-OFFSETS-IMPL", "SUBLISP"), makeString("Regex"), makeString("match_regular_expression_pattern_offsets_impl"), list(makeSymbol("PATTERN"), makeSymbol("STRING"), makeSymbol("MATCHES"), makeSymbol("OPTION-VALUE"), makeSymbol("START"), makeSymbol("END"))), list(makeSymbol("DISCARD-REGULAR-EXPRESSION-PATTERN-IMPL", "SUBLISP"), makeString("Regex"), makeString("discard_regular_expression_pattern_impl"), list(makeSymbol("PATTERN"))), list(makeSymbol("GET-REGEX-ERRORMSG", "SUBLISP"), makeString("Regex"), makeString("get_regex_errormsg"), list(makeSymbol("CODE"))), list(makeSymbol("%UNIMPLEMENTED-METHOD"), makeString("Errors"), makeString("unimplementedMethod"), list(makeSymbol("NAME"))) });
    }

    private static final SubLObject _constant_7_initializer_alt() {
        return list(new SubLObject[]{ list(makeSymbol("%ADD2"), makeString("Numbers"), makeString("add"), list(makeSymbol("NUM1"), makeSymbol("NUM2"))), list(makeSymbol("%ADD3"), makeString("Numbers"), makeString("add"), list(makeSymbol("NUM1"), makeSymbol("NUM2"), makeSymbol("NUM3"))), list(makeSymbol("%APPEND2"), makeString("ConsesLow"), makeString("append"), list(makeSymbol("LIST1"), makeSymbol("LIST2"))), list(makeSymbol("%APPEND3"), makeString("ConsesLow"), makeString("append"), list(makeSymbol("LIST1"), makeSymbol("LIST2"), makeSymbol("LIST3"))), list(makeSymbol("%APPEND4"), makeString("ConsesLow"), makeString("append"), list(makeSymbol("LIST1"), makeSymbol("LIST2"), makeSymbol("LIST3"), makeSymbol("LIST4"))), list(makeSymbol("%APPLY2"), makeString("Functions"), makeString("apply"), list(makeSymbol("FUNC"), makeSymbol("ARG1"))), list(makeSymbol("%APPLY3"), makeString("Functions"), makeString("apply"), list(makeSymbol("FUNC"), makeSymbol("ARG1"), makeSymbol("ARG2"))), list(makeSymbol("%BREAK1"), makeString("Errors"), makeString("sublisp_break"), list(makeSymbol("FORMAT-STRING"))), list(makeSymbol("%CERROR2"), makeString("Errors"), makeString("cerror"), list(makeSymbol("CONTINUE-STRING"), makeSymbol("FORMAT-STRING"))), list(makeSymbol("%CERROR3"), makeString("Errors"), makeString("cerror"), list(makeSymbol("CONTINUE-STRING"), makeSymbol("FORMAT-STRING"), makeSymbol("ARG1"))), list(makeSymbol("%CERROR4"), makeString("Errors"), makeString("cerror"), list(makeSymbol("CONTINUE-STRING"), makeSymbol("FORMAT-STRING"), makeSymbol("ARG1"), makeSymbol("ARG2"))), list(makeSymbol("%CERROR5"), makeString("Errors"), makeString("cerror"), list(makeSymbol("CONTINUE-STRINGFORMAT-STRING"), makeSymbol("ARG1"), makeSymbol("ARG2"), makeSymbol("ARG3"))), list(makeSymbol("%CONCAT2"), makeString("Sequences"), makeString("cconcatenate"), list(makeSymbol("SEQUENCE1"), makeSymbol("SEQUENCE2"))), list(makeSymbol("%DIV2"), makeString("Numbers"), makeString("divide"), list(makeSymbol("NUM1"), makeSymbol("NUM2"))), list(makeSymbol("%ERROR1"), makeString("Errors"), makeString("error"), list(makeSymbol("FORMAT-STRING"))), list(makeSymbol("%ERROR2"), makeString("Errors"), makeString("error"), list(makeSymbol("FORMAT-STRING"), makeSymbol("ARG1"))), list(makeSymbol("%ERROR3"), makeString("Errors"), makeString("error"), list(makeSymbol("FORMAT-STRING"), makeSymbol("ARG1"), makeSymbol("ARG2"))), list(makeSymbol("%ERROR4"), makeString("Errors"), makeString("error"), list(makeSymbol("FORMAT-STRING"), makeSymbol("ARG1"), makeSymbol("ARG2"), makeSymbol("ARG3"))), list(makeSymbol("%FALSE0"), makeString("Types"), makeString("sublisp_false"), NIL), list(makeSymbol("%FALSE1"), makeString("Types"), makeString("sublisp_false"), list(makeSymbol("ARG"))), list(makeSymbol("%FALSE2"), makeString("Types"), makeString("sublisp_false"), list(makeSymbol("ARG1"), makeSymbol("ARG2"))), list(makeSymbol("%FORMAT2"), makeString("PrintLow"), makeString("format"), list(makeSymbol("DESTINATION"), makeSymbol("FORMAT-CONTROL"))), list(makeSymbol("%FORMAT3"), makeString("PrintLow"), makeString("format"), list(makeSymbol("DESTINATION"), makeSymbol("FORMAT-CONTROL"), makeSymbol("ARG1"))), list(makeSymbol("%FORMAT4"), makeString("PrintLow"), makeString("format"), list(makeSymbol("DESTINATION"), makeSymbol("FORMAT-CONTROL"), makeSymbol("ARG1"), makeSymbol("ARG2"))), list(makeSymbol("%FUNCALL1"), makeString("Functions"), makeString("funcall"), list(makeSymbol("FUNCTION"))), list(makeSymbol("%FUNCALL2"), makeString("Functions"), makeString("funcall"), list(makeSymbol("FUNCTION"), makeSymbol("ARG1"))), list(makeSymbol("%FUNCALL3"), makeString("Functions"), makeString("funcall"), list(makeSymbol("FUNCTION"), makeSymbol("ARG1"), makeSymbol("ARG2"))), list(makeSymbol("%FUNCALL4"), makeString("Functions"), makeString("funcall"), list(makeSymbol("FUNCTION"), makeSymbol("ARG1"), makeSymbol("ARG2"), makeSymbol("ARG3"))), list(makeSymbol("%FUNCALL5"), makeString("Functions"), makeString("funcall"), list(makeSymbol("FUNCTION"), makeSymbol("ARG1"), makeSymbol("ARG2"), makeSymbol("ARG3"), makeSymbol("ARG4"))), list(makeSymbol("%FUNCALL6"), makeString("Functions"), makeString("funcall"), list(makeSymbol("FUNCTION"), makeSymbol("ARG1"), makeSymbol("ARG2"), makeSymbol("ARG3"), makeSymbol("ARG4"), makeSymbol("ARG5"))), list(makeSymbol("%FUNCALL7"), makeString("Functions"), makeString("funcall"), list(makeSymbol("FUNCTION"), makeSymbol("ARG1"), makeSymbol("ARG2"), makeSymbol("ARG3"), makeSymbol("ARG4"), makeSymbol("ARG5"), makeSymbol("ARG6"))), list(makeSymbol("%INVERT"), makeString("Numbers"), makeString("invert"), list(makeSymbol("NUM"))), list(makeSymbol("%LIST*1"), makeKeyword("IMPORTED"), makeString("listS"), list(makeSymbol("FINAL-CDR"))), list(makeSymbol("%LIST*2"), makeKeyword("IMPORTED"), makeString("listS"), list(makeSymbol("OBJECT1"), makeSymbol("FINAL-CDR"))), list(makeSymbol("%LIST*3"), makeKeyword("IMPORTED"), makeString("listS"), list(makeSymbol("OBJECT1"), makeSymbol("OBJECT2"), makeSymbol("FINAL-CDR"))), list(makeSymbol("%LIST*4"), makeKeyword("IMPORTED"), makeString("listS"), list(makeSymbol("OBJECT1"), makeSymbol("OBJECT2"), makeSymbol("OBJECT3"), makeSymbol("FINAL-CDR"))), list(makeSymbol("%LIST*5"), makeKeyword("IMPORTED"), makeString("listS"), list(makeSymbol("OBJECT1"), makeSymbol("OBJECT2"), makeSymbol("OBJECT3"), makeSymbol("OBJECT4"), makeSymbol("FINAL-CDR"))), list(makeSymbol("%LIST*6"), makeKeyword("IMPORTED"), makeString("listS"), list(makeSymbol("OBJECT1"), makeSymbol("OBJECT2"), makeSymbol("OBJECT3"), makeSymbol("OBJECT4"), makeSymbol("OBJECT5"), makeSymbol("FINAL-CDR"))), list(makeSymbol("%LIST1"), makeKeyword("IMPORTED"), makeString("list"), list(makeSymbol("OBJECT1"))), list(makeSymbol("%LIST2"), makeKeyword("IMPORTED"), makeString("list"), list(makeSymbol("OBJECT1"), makeSymbol("OBJECT2"))), list(makeSymbol("%LIST3"), makeKeyword("IMPORTED"), makeString("list"), list(makeSymbol("OBJECT1"), makeSymbol("OBJECT2"), makeSymbol("OBJECT3"))), list(makeSymbol("%LIST4"), makeKeyword("IMPORTED"), makeString("list"), list(makeSymbol("OBJECT1"), makeSymbol("OBJECT2"), makeSymbol("OBJECT3"), makeSymbol("OBJECT4"))), list(makeSymbol("%LIST5"), makeKeyword("IMPORTED"), makeString("list"), list(makeSymbol("OBJECT1"), makeSymbol("OBJECT2"), makeSymbol("OBJECT3"), makeSymbol("OBJECT4"), makeSymbol("OBJECT5"))), list(makeSymbol("%LIST6"), makeKeyword("IMPORTED"), makeString("list"), list(makeSymbol("OBJECT1"), makeSymbol("OBJECT2"), makeSymbol("OBJECT3"), makeSymbol("OBJECT4"), makeSymbol("OBJECT5"), makeSymbol("OBJECT6"))), list(makeSymbol("%LIST7"), makeKeyword("IMPORTED"), makeString("list"), list(makeSymbol("OBJECT1"), makeSymbol("OBJECT2"), makeSymbol("OBJECT3"), makeSymbol("OBJECT4"), makeSymbol("OBJECT5"), makeSymbol("OBJECT6"), makeSymbol("OBJECT7"))), list(makeSymbol("%LIST8"), makeKeyword("IMPORTED"), makeString("list"), list(makeSymbol("OBJECT1"), makeSymbol("OBJECT2"), makeSymbol("OBJECT3"), makeSymbol("OBJECT4"), makeSymbol("OBJECT5"), makeSymbol("OBJECT6"), makeSymbol("OBJECT7"), makeSymbol("OBJECT8"))), list(makeSymbol("%LOGAND2"), makeString("Numbers"), makeString("logand"), list(makeSymbol("INT1"), makeSymbol("INT2"))), list(makeSymbol("%LOGIOR2"), makeString("Numbers"), makeString("logior"), list(makeSymbol("INT1"), makeSymbol("INT2"))), list(makeSymbol("%LOGIOR3"), makeString("Numbers"), makeString("logior"), list(makeSymbol("INT1"), makeSymbol("INT2"), makeSymbol("INT3"))), list(makeSymbol("%LOGXOR2"), makeString("Numbers"), makeString("logxor"), list(makeSymbol("INT1"), makeSymbol("INT2"))), list(makeSymbol("%MAPCAR2"), makeString("Mapping"), makeString("mapcar"), list(makeSymbol("FUNCTION-SPEC"), makeSymbol("LIST"))), list(makeSymbol("%MAX2"), makeString("Numbers"), makeString("max"), list(makeSymbol("NUM1"), makeSymbol("NUM2"))), list(makeSymbol("%MIN2"), makeString("Numbers"), makeString("min"), list(makeSymbol("NUM1"), makeSymbol("NUM2"))), list(makeSymbol("%MINUS"), makeString("Numbers"), makeString("minus"), list(makeSymbol("NUM"))), list(makeSymbol("%MULT2"), makeString("Numbers"), makeString("multiply"), list(makeSymbol("NUM1"), makeSymbol("NUM2"))), list(makeSymbol("%MULT3"), makeString("Numbers"), makeString("multiply"), list(makeSymbol("NUM1"), makeSymbol("NUM2"), makeSymbol("NUM3"))), list(makeSymbol("%NCONC2"), makeString("ConsesLow"), makeString("nconc"), list(makeSymbol("LIST1"), makeSymbol("LIST2"))), list(makeSymbol("%NCONC3"), makeString("ConsesLow"), makeString("nconc"), list(makeSymbol("LIST1"), makeSymbol("LIST2"), makeSymbol("LIST3"))), list(makeSymbol("%STRING<=2"), makeString("Strings"), makeString("stringLE"), list(makeSymbol("STRING1"), makeSymbol("STRING2"))), list(makeSymbol("%SUB2"), makeString("Numbers"), makeString("subtract"), list(makeSymbol("NUM1"), makeSymbol("NUM2"))), list(makeSymbol("%SUB3"), makeString("Numbers"), makeString("subtract"), list(makeSymbol("NUM1"), makeSymbol("NUM2"), makeSymbol("NUM3"))), list(makeSymbol("%TRUE0"), makeString("Types"), makeString("sublisp_true"), NIL), list(makeSymbol("%TRUE1"), makeString("Types"), makeString("sublisp_true"), list(makeSymbol("ARG"))), list(makeSymbol("%TRUE2"), makeString("Types"), makeString("sublisp_true"), list(makeSymbol("ARG1"), makeSymbol("ARG2"))), list(makeSymbol("%VALUES1"), makeString("Values"), makeString("values"), list(makeSymbol("VALUE1"))), list(makeSymbol("%VALUES2"), makeString("Values"), makeString("values"), list(makeSymbol("VALUE1"), makeSymbol("VALUE2"))), list(makeSymbol("%VALUES3"), makeString("Values"), makeString("values"), list(makeSymbol("VALUE1"), makeSymbol("VALUE2"), makeSymbol("VALUE3"))), list(makeSymbol("%VALUES4"), makeString("Values"), makeString("values"), list(makeSymbol("VALUE1"), makeSymbol("VALUE2"), makeSymbol("VALUE3"), makeSymbol("VALUE4"))), list(makeSymbol("%VALUES5"), makeString("Values"), makeString("values"), list(makeSymbol("VALUE1"), makeSymbol("VALUE2"), makeSymbol("VALUE3"), makeSymbol("VALUE4"), makeSymbol("VALUE5"))), list(makeSymbol("%VALUES6"), makeString("Values"), makeString("values"), list(makeSymbol("VALUE1"), makeSymbol("VALUE2"), makeSymbol("VALUE3"), makeSymbol("VALUE4"), makeSymbol("VALUE5"), makeSymbol("VALUE6"))), list(makeSymbol("%VALUES7"), makeString("Values"), makeString("values"), list(makeSymbol("VALUE1"), makeSymbol("VALUE2"), makeSymbol("VALUE3"), makeSymbol("VALUE4"), makeSymbol("VALUE5"), makeSymbol("VALUE6"), makeSymbol("VALUE7"))), list(makeSymbol("%VALUES8"), makeString("Values"), makeString("values"), list(makeSymbol("VALUE1"), makeSymbol("VALUE2"), makeSymbol("VALUE3"), makeSymbol("VALUE4"), makeSymbol("VALUE5"), makeSymbol("VALUE6"), makeSymbol("VALUE7"), makeSymbol("VALUE8"))), list(makeSymbol("%WARN1"), makeString("Errors"), makeString("warn"), list(makeSymbol("FORMAT-STRING"))), list(makeSymbol("%WARN2"), makeString("Errors"), makeString("warn"), list(makeSymbol("FORMAT-STRING"), makeSymbol("ARG1"))), list(makeSymbol("%WARN3"), makeString("Errors"), makeString("warn"), list(makeSymbol("FORMAT-STRING"), makeSymbol("ARG1"), makeSymbol("ARG2"))), list(makeSymbol("%WARN4"), makeString("Errors"), makeString("warn"), list(makeSymbol("FORMAT-STRING"), makeSymbol("ARG1"), makeSymbol("ARG2"), makeSymbol("ARG3"))) });
    }

    private static SubLObject _constant_7_initializer() {
        return list(new SubLObject[]{ list(makeSymbol("%ADD2"), makeString("Numbers"), makeString("add"), list(makeSymbol("NUM1"), makeSymbol("NUM2"))), list(makeSymbol("%ADD3"), makeString("Numbers"), makeString("add"), list(makeSymbol("NUM1"), makeSymbol("NUM2"), makeSymbol("NUM3"))), list(makeSymbol("%APPEND2"), makeString("ConsesLow"), makeString("append"), list(makeSymbol("LIST1"), makeSymbol("LIST2"))), list(makeSymbol("%APPEND3"), makeString("ConsesLow"), makeString("append"), list(makeSymbol("LIST1"), makeSymbol("LIST2"), makeSymbol("LIST3"))), list(makeSymbol("%APPEND4"), makeString("ConsesLow"), makeString("append"), list(makeSymbol("LIST1"), makeSymbol("LIST2"), makeSymbol("LIST3"), makeSymbol("LIST4"))), list(makeSymbol("%APPLY2"), makeString("Functions"), makeString("apply"), list(makeSymbol("FUNC"), makeSymbol("ARG1"))), list(makeSymbol("%APPLY3"), makeString("Functions"), makeString("apply"), list(makeSymbol("FUNC"), makeSymbol("ARG1"), makeSymbol("ARG2"))), list(makeSymbol("%BREAK1"), makeString("Errors"), makeString("sublisp_break"), list(makeSymbol("FORMAT-STRING"))), list(makeSymbol("%CERROR2"), makeString("Errors"), makeString("cerror"), list(makeSymbol("CONTINUE-STRING"), makeSymbol("FORMAT-STRING"))), list(makeSymbol("%CERROR3"), makeString("Errors"), makeString("cerror"), list(makeSymbol("CONTINUE-STRING"), makeSymbol("FORMAT-STRING"), makeSymbol("ARG1"))), list(makeSymbol("%CERROR4"), makeString("Errors"), makeString("cerror"), list(makeSymbol("CONTINUE-STRING"), makeSymbol("FORMAT-STRING"), makeSymbol("ARG1"), makeSymbol("ARG2"))), list(makeSymbol("%CERROR5"), makeString("Errors"), makeString("cerror"), list(makeSymbol("CONTINUE-STRING"), makeSymbol("FORMAT-STRING"), makeSymbol("ARG1"), makeSymbol("ARG2"), makeSymbol("ARG3"))), list(makeSymbol("%CONCAT2"), makeString("Sequences"), makeString("cconcatenate"), list(makeSymbol("SEQUENCE1"), makeSymbol("SEQUENCE2"))), list(makeSymbol("%DIV2"), makeString("Numbers"), makeString("divide"), list(makeSymbol("NUM1"), makeSymbol("NUM2"))), list(makeSymbol("%ERROR1"), makeString("Errors"), makeString("error"), list(makeSymbol("FORMAT-STRING"))), list(makeSymbol("%ERROR2"), makeString("Errors"), makeString("error"), list(makeSymbol("FORMAT-STRING"), makeSymbol("ARG1"))), list(makeSymbol("%ERROR3"), makeString("Errors"), makeString("error"), list(makeSymbol("FORMAT-STRING"), makeSymbol("ARG1"), makeSymbol("ARG2"))), list(makeSymbol("%ERROR4"), makeString("Errors"), makeString("error"), list(makeSymbol("FORMAT-STRING"), makeSymbol("ARG1"), makeSymbol("ARG2"), makeSymbol("ARG3"))), list(makeSymbol("%FALSE0"), makeString("Types"), makeString("sublisp_false"), NIL), list(makeSymbol("%FALSE1"), makeString("Types"), makeString("sublisp_false"), list(makeSymbol("ARG"))), list(makeSymbol("%FALSE2"), makeString("Types"), makeString("sublisp_false"), list(makeSymbol("ARG1"), makeSymbol("ARG2"))), list(makeSymbol("%FORMAT2"), makeString("PrintLow"), makeString("format"), list(makeSymbol("DESTINATION"), makeSymbol("FORMAT-CONTROL"))), list(makeSymbol("%FORMAT3"), makeString("PrintLow"), makeString("format"), list(makeSymbol("DESTINATION"), makeSymbol("FORMAT-CONTROL"), makeSymbol("ARG1"))), list(makeSymbol("%FORMAT4"), makeString("PrintLow"), makeString("format"), list(makeSymbol("DESTINATION"), makeSymbol("FORMAT-CONTROL"), makeSymbol("ARG1"), makeSymbol("ARG2"))), list(makeSymbol("%FUNCALL1"), makeString("Functions"), makeString("funcall"), list(makeSymbol("FUNCTION"))), list(makeSymbol("%FUNCALL2"), makeString("Functions"), makeString("funcall"), list(makeSymbol("FUNCTION"), makeSymbol("ARG1"))), list(makeSymbol("%FUNCALL3"), makeString("Functions"), makeString("funcall"), list(makeSymbol("FUNCTION"), makeSymbol("ARG1"), makeSymbol("ARG2"))), list(makeSymbol("%FUNCALL4"), makeString("Functions"), makeString("funcall"), list(makeSymbol("FUNCTION"), makeSymbol("ARG1"), makeSymbol("ARG2"), makeSymbol("ARG3"))), list(makeSymbol("%FUNCALL5"), makeString("Functions"), makeString("funcall"), list(makeSymbol("FUNCTION"), makeSymbol("ARG1"), makeSymbol("ARG2"), makeSymbol("ARG3"), makeSymbol("ARG4"))), list(makeSymbol("%FUNCALL6"), makeString("Functions"), makeString("funcall"), list(makeSymbol("FUNCTION"), makeSymbol("ARG1"), makeSymbol("ARG2"), makeSymbol("ARG3"), makeSymbol("ARG4"), makeSymbol("ARG5"))), list(makeSymbol("%FUNCALL7"), makeString("Functions"), makeString("funcall"), list(makeSymbol("FUNCTION"), makeSymbol("ARG1"), makeSymbol("ARG2"), makeSymbol("ARG3"), makeSymbol("ARG4"), makeSymbol("ARG5"), makeSymbol("ARG6"))), list(makeSymbol("%INVERT"), makeString("Numbers"), makeString("invert"), list(makeSymbol("NUM"))), list(makeSymbol("%LIST*1"), makeKeyword("IMPORTED"), makeString("listS"), list(makeSymbol("FINAL-CDR"))), list(makeSymbol("%LIST*2"), makeKeyword("IMPORTED"), makeString("listS"), list(makeSymbol("OBJECT1"), makeSymbol("FINAL-CDR"))), list(makeSymbol("%LIST*3"), makeKeyword("IMPORTED"), makeString("listS"), list(makeSymbol("OBJECT1"), makeSymbol("OBJECT2"), makeSymbol("FINAL-CDR"))), list(makeSymbol("%LIST*4"), makeKeyword("IMPORTED"), makeString("listS"), list(makeSymbol("OBJECT1"), makeSymbol("OBJECT2"), makeSymbol("OBJECT3"), makeSymbol("FINAL-CDR"))), list(makeSymbol("%LIST*5"), makeKeyword("IMPORTED"), makeString("listS"), list(makeSymbol("OBJECT1"), makeSymbol("OBJECT2"), makeSymbol("OBJECT3"), makeSymbol("OBJECT4"), makeSymbol("FINAL-CDR"))), list(makeSymbol("%LIST*6"), makeKeyword("IMPORTED"), makeString("listS"), list(makeSymbol("OBJECT1"), makeSymbol("OBJECT2"), makeSymbol("OBJECT3"), makeSymbol("OBJECT4"), makeSymbol("OBJECT5"), makeSymbol("FINAL-CDR"))), list(makeSymbol("%LIST1"), makeKeyword("IMPORTED"), makeString("list"), list(makeSymbol("OBJECT1"))), list(makeSymbol("%LIST2"), makeKeyword("IMPORTED"), makeString("list"), list(makeSymbol("OBJECT1"), makeSymbol("OBJECT2"))), list(makeSymbol("%LIST3"), makeKeyword("IMPORTED"), makeString("list"), list(makeSymbol("OBJECT1"), makeSymbol("OBJECT2"), makeSymbol("OBJECT3"))), list(makeSymbol("%LIST4"), makeKeyword("IMPORTED"), makeString("list"), list(makeSymbol("OBJECT1"), makeSymbol("OBJECT2"), makeSymbol("OBJECT3"), makeSymbol("OBJECT4"))), list(makeSymbol("%LIST5"), makeKeyword("IMPORTED"), makeString("list"), list(makeSymbol("OBJECT1"), makeSymbol("OBJECT2"), makeSymbol("OBJECT3"), makeSymbol("OBJECT4"), makeSymbol("OBJECT5"))), list(makeSymbol("%LIST6"), makeKeyword("IMPORTED"), makeString("list"), list(makeSymbol("OBJECT1"), makeSymbol("OBJECT2"), makeSymbol("OBJECT3"), makeSymbol("OBJECT4"), makeSymbol("OBJECT5"), makeSymbol("OBJECT6"))), list(makeSymbol("%LIST7"), makeKeyword("IMPORTED"), makeString("list"), list(makeSymbol("OBJECT1"), makeSymbol("OBJECT2"), makeSymbol("OBJECT3"), makeSymbol("OBJECT4"), makeSymbol("OBJECT5"), makeSymbol("OBJECT6"), makeSymbol("OBJECT7"))), list(makeSymbol("%LIST8"), makeKeyword("IMPORTED"), makeString("list"), list(makeSymbol("OBJECT1"), makeSymbol("OBJECT2"), makeSymbol("OBJECT3"), makeSymbol("OBJECT4"), makeSymbol("OBJECT5"), makeSymbol("OBJECT6"), makeSymbol("OBJECT7"), makeSymbol("OBJECT8"))), list(makeSymbol("%LOGAND2"), makeString("Numbers"), makeString("logand"), list(makeSymbol("INT1"), makeSymbol("INT2"))), list(makeSymbol("%LOGIOR2"), makeString("Numbers"), makeString("logior"), list(makeSymbol("INT1"), makeSymbol("INT2"))), list(makeSymbol("%LOGIOR3"), makeString("Numbers"), makeString("logior"), list(makeSymbol("INT1"), makeSymbol("INT2"), makeSymbol("INT3"))), list(makeSymbol("%LOGXOR2"), makeString("Numbers"), makeString("logxor"), list(makeSymbol("INT1"), makeSymbol("INT2"))), list(makeSymbol("%MAPCAR2"), makeString("Mapping"), makeString("mapcar"), list(makeSymbol("FUNCTION-SPEC"), makeSymbol("LIST"))), list(makeSymbol("%MAX2"), makeString("Numbers"), makeString("max"), list(makeSymbol("NUM1"), makeSymbol("NUM2"))), list(makeSymbol("%MIN2"), makeString("Numbers"), makeString("min"), list(makeSymbol("NUM1"), makeSymbol("NUM2"))), list(makeSymbol("%MINUS"), makeString("Numbers"), makeString("minus"), list(makeSymbol("NUM"))), list(makeSymbol("%MULT2"), makeString("Numbers"), makeString("multiply"), list(makeSymbol("NUM1"), makeSymbol("NUM2"))), list(makeSymbol("%MULT3"), makeString("Numbers"), makeString("multiply"), list(makeSymbol("NUM1"), makeSymbol("NUM2"), makeSymbol("NUM3"))), list(makeSymbol("%NCONC2"), makeString("ConsesLow"), makeString("nconc"), list(makeSymbol("LIST1"), makeSymbol("LIST2"))), list(makeSymbol("%NCONC3"), makeString("ConsesLow"), makeString("nconc"), list(makeSymbol("LIST1"), makeSymbol("LIST2"), makeSymbol("LIST3"))), list(makeSymbol("%STRING<=2"), makeString("Strings"), makeString("stringLE"), list(makeSymbol("STRING1"), makeSymbol("STRING2"))), list(makeSymbol("%SUB2"), makeString("Numbers"), makeString("subtract"), list(makeSymbol("NUM1"), makeSymbol("NUM2"))), list(makeSymbol("%SUB3"), makeString("Numbers"), makeString("subtract"), list(makeSymbol("NUM1"), makeSymbol("NUM2"), makeSymbol("NUM3"))), list(makeSymbol("%TRUE0"), makeString("Types"), makeString("sublisp_true"), NIL), list(makeSymbol("%TRUE1"), makeString("Types"), makeString("sublisp_true"), list(makeSymbol("ARG"))), list(makeSymbol("%TRUE2"), makeString("Types"), makeString("sublisp_true"), list(makeSymbol("ARG1"), makeSymbol("ARG2"))), list(makeSymbol("%VALUES1"), makeString("Values"), makeString("values"), list(makeSymbol("VALUE1"))), list(makeSymbol("%VALUES2"), makeString("Values"), makeString("values"), list(makeSymbol("VALUE1"), makeSymbol("VALUE2"))), list(makeSymbol("%VALUES3"), makeString("Values"), makeString("values"), list(makeSymbol("VALUE1"), makeSymbol("VALUE2"), makeSymbol("VALUE3"))), list(makeSymbol("%VALUES4"), makeString("Values"), makeString("values"), list(makeSymbol("VALUE1"), makeSymbol("VALUE2"), makeSymbol("VALUE3"), makeSymbol("VALUE4"))), list(makeSymbol("%VALUES5"), makeString("Values"), makeString("values"), list(makeSymbol("VALUE1"), makeSymbol("VALUE2"), makeSymbol("VALUE3"), makeSymbol("VALUE4"), makeSymbol("VALUE5"))), list(makeSymbol("%VALUES6"), makeString("Values"), makeString("values"), list(makeSymbol("VALUE1"), makeSymbol("VALUE2"), makeSymbol("VALUE3"), makeSymbol("VALUE4"), makeSymbol("VALUE5"), makeSymbol("VALUE6"))), list(makeSymbol("%VALUES7"), makeString("Values"), makeString("values"), list(makeSymbol("VALUE1"), makeSymbol("VALUE2"), makeSymbol("VALUE3"), makeSymbol("VALUE4"), makeSymbol("VALUE5"), makeSymbol("VALUE6"), makeSymbol("VALUE7"))), list(makeSymbol("%VALUES8"), makeString("Values"), makeString("values"), list(makeSymbol("VALUE1"), makeSymbol("VALUE2"), makeSymbol("VALUE3"), makeSymbol("VALUE4"), makeSymbol("VALUE5"), makeSymbol("VALUE6"), makeSymbol("VALUE7"), makeSymbol("VALUE8"))), list(makeSymbol("%WARN1"), makeString("Errors"), makeString("warn"), list(makeSymbol("FORMAT-STRING"))), list(makeSymbol("%WARN2"), makeString("Errors"), makeString("warn"), list(makeSymbol("FORMAT-STRING"), makeSymbol("ARG1"))), list(makeSymbol("%WARN3"), makeString("Errors"), makeString("warn"), list(makeSymbol("FORMAT-STRING"), makeSymbol("ARG1"), makeSymbol("ARG2"))), list(makeSymbol("%WARN4"), makeString("Errors"), makeString("warn"), list(makeSymbol("FORMAT-STRING"), makeSymbol("ARG1"), makeSymbol("ARG2"), makeSymbol("ARG3"))) });
    }

    private static SubLObject _constant_29_initializer() {
        return list(new SubLObject[]{ cons(T, makeString("T")), cons(NIL, makeString("NIL")), cons(EQ, makeString("EQ")), cons(EQL, makeString("EQL")), cons(EQUAL, makeString("EQUAL")), cons(EQUALP, makeString("EQUALP")), cons(IDENTITY, makeString("IDENTITY")), cons(MINUS_ONE_INTEGER, makeString("MINUS_ONE_INTEGER")), cons(ZERO_INTEGER, makeString("ZERO_INTEGER")), cons(ONE_INTEGER, makeString("ONE_INTEGER")), cons(TWO_INTEGER, makeString("TWO_INTEGER")), cons(THREE_INTEGER, makeString("THREE_INTEGER")), cons(FOUR_INTEGER, makeString("FOUR_INTEGER")), cons(FIVE_INTEGER, makeString("FIVE_INTEGER")), cons(SIX_INTEGER, makeString("SIX_INTEGER")), cons(SEVEN_INTEGER, makeString("SEVEN_INTEGER")), cons(EIGHT_INTEGER, makeString("EIGHT_INTEGER")), cons(NINE_INTEGER, makeString("NINE_INTEGER")), cons(TEN_INTEGER, makeString("TEN_INTEGER")), cons(ELEVEN_INTEGER, makeString("ELEVEN_INTEGER")), cons(TWELVE_INTEGER, makeString("TWELVE_INTEGER")), cons(THIRTEEN_INTEGER, makeString("THIRTEEN_INTEGER")), cons(FOURTEEN_INTEGER, makeString("FOURTEEN_INTEGER")), cons(FIFTEEN_INTEGER, makeString("FIFTEEN_INTEGER")), cons(SIXTEEN_INTEGER, makeString("SIXTEEN_INTEGER")), cons(SEVENTEEN_INTEGER, makeString("SEVENTEEN_INTEGER")), cons(EIGHTEEN_INTEGER, makeString("EIGHTEEN_INTEGER")), cons(NINETEEN_INTEGER, makeString("NINETEEN_INTEGER")), cons(TWENTY_INTEGER, makeString("TWENTY_INTEGER")), cons(CHAR_null, makeString("Characters.CHAR_null")), cons(CHAR_backspace, makeString("Characters.CHAR_backspace")), cons(CHAR_tab, makeString("Characters.CHAR_tab")), cons(CHAR_newline, makeString("Characters.CHAR_newline")), cons(CHAR_return, makeString("Characters.CHAR_return")), cons(CHAR_page, makeString("Characters.CHAR_page")), cons(CHAR_escape, makeString("Characters.CHAR_escape")), cons(CHAR_space, makeString("Characters.CHAR_space")), cons(CHAR_exclamation, makeString("Characters.CHAR_exclamation")), cons(CHAR_quotation, makeString("Characters.CHAR_quotation")), cons(CHAR_hash, makeString("Characters.CHAR_hash")), cons(CHAR_dollar, makeString("Characters.CHAR_dollar")), cons(CHAR_percent, makeString("Characters.CHAR_percent")), cons(CHAR_ampersand, makeString("Characters.CHAR_ampersand")), cons(CHAR_quote, makeString("Characters.CHAR_quote")), cons(CHAR_lparen, makeString("Characters.CHAR_lparen")), cons(CHAR_rparen, makeString("Characters.CHAR_rparen")), cons(CHAR_asterisk, makeString("Characters.CHAR_asterisk")), cons(CHAR_plus, makeString("Characters.CHAR_plus")), cons(CHAR_comma, makeString("Characters.CHAR_comma")), cons(CHAR_hyphen, makeString("Characters.CHAR_hyphen")), cons(CHAR_period, makeString("Characters.CHAR_period")), cons(CHAR_slash, makeString("Characters.CHAR_slash")), cons(CHAR_0, makeString("Characters.CHAR_0")), cons(CHAR_1, makeString("Characters.CHAR_1")), cons(CHAR_2, makeString("Characters.CHAR_2")), cons(CHAR_3, makeString("Characters.CHAR_3")), cons(CHAR_4, makeString("Characters.CHAR_4")), cons(CHAR_5, makeString("Characters.CHAR_5")), cons(CHAR_6, makeString("Characters.CHAR_6")), cons(CHAR_7, makeString("Characters.CHAR_7")), cons(CHAR_8, makeString("Characters.CHAR_8")), cons(CHAR_9, makeString("Characters.CHAR_9")), cons(CHAR_colon, makeString("Characters.CHAR_colon")), cons(CHAR_semicolon, makeString("Characters.CHAR_semicolon")), cons(CHAR_less, makeString("Characters.CHAR_less")), cons(CHAR_equal, makeString("Characters.CHAR_equal")), cons(CHAR_greater, makeString("Characters.CHAR_greater")), cons(CHAR_question, makeString("Characters.CHAR_question")), cons(CHAR_at, makeString("Characters.CHAR_at")), cons(CHAR_A, makeString("Characters.CHAR_A")), cons(CHAR_B, makeString("Characters.CHAR_B")), cons(CHAR_C, makeString("Characters.CHAR_C")), cons(CHAR_D, makeString("Characters.CHAR_D")), cons(CHAR_E, makeString("Characters.CHAR_E")), cons(CHAR_F, makeString("Characters.CHAR_F")), cons(CHAR_G, makeString("Characters.CHAR_G")), cons(CHAR_H, makeString("Characters.CHAR_H")), cons(CHAR_I, makeString("Characters.CHAR_I")), cons(CHAR_J, makeString("Characters.CHAR_J")), cons(CHAR_K, makeString("Characters.CHAR_K")), cons(CHAR_L, makeString("Characters.CHAR_L")), cons(CHAR_M, makeString("Characters.CHAR_M")), cons(CHAR_N, makeString("Characters.CHAR_N")), cons(CHAR_O, makeString("Characters.CHAR_O")), cons(CHAR_P, makeString("Characters.CHAR_P")), cons(CHAR_Q, makeString("Characters.CHAR_Q")), cons(CHAR_R, makeString("Characters.CHAR_R")), cons(CHAR_S, makeString("Characters.CHAR_S")), cons(CHAR_T, makeString("Characters.CHAR_T")), cons(CHAR_U, makeString("Characters.CHAR_U")), cons(CHAR_V, makeString("Characters.CHAR_V")), cons(CHAR_W, makeString("Characters.CHAR_W")), cons(CHAR_X, makeString("Characters.CHAR_X")), cons(CHAR_Y, makeString("Characters.CHAR_Y")), cons(CHAR_Z, makeString("Characters.CHAR_Z")), cons(CHAR_lbracket, makeString("Characters.CHAR_lbracket")), cons(CHAR_backslash, makeString("Characters.CHAR_backslash")), cons(CHAR_rbracket, makeString("Characters.CHAR_rbracket")), cons(CHAR_caret, makeString("Characters.CHAR_caret")), cons(CHAR_underbar, makeString("Characters.CHAR_underbar")), cons(CHAR_backquote, makeString("Characters.CHAR_backquote")), cons(CHAR_a, makeString("Characters.CHAR_a")), cons(CHAR_b, makeString("Characters.CHAR_b")), cons(CHAR_c, makeString("Characters.CHAR_c")), cons(CHAR_d, makeString("Characters.CHAR_d")), cons(CHAR_e, makeString("Characters.CHAR_e")), cons(CHAR_f, makeString("Characters.CHAR_f")), cons(CHAR_g, makeString("Characters.CHAR_g")), cons(CHAR_h, makeString("Characters.CHAR_h")), cons(CHAR_i, makeString("Characters.CHAR_i")), cons(CHAR_j, makeString("Characters.CHAR_j")), cons(CHAR_k, makeString("Characters.CHAR_k")), cons(CHAR_l, makeString("Characters.CHAR_l")), cons(CHAR_m, makeString("Characters.CHAR_m")), cons(CHAR_n, makeString("Characters.CHAR_n")), cons(CHAR_o, makeString("Characters.CHAR_o")), cons(CHAR_p, makeString("Characters.CHAR_p")), cons(CHAR_q, makeString("Characters.CHAR_q")), cons(CHAR_r, makeString("Characters.CHAR_r")), cons(CHAR_s, makeString("Characters.CHAR_s")), cons(CHAR_t, makeString("Characters.CHAR_t")), cons(CHAR_u, makeString("Characters.CHAR_u")), cons(CHAR_v, makeString("Characters.CHAR_v")), cons(CHAR_w, makeString("Characters.CHAR_w")), cons(CHAR_x, makeString("Characters.CHAR_x")), cons(CHAR_y, makeString("Characters.CHAR_y")), cons(CHAR_z, makeString("Characters.CHAR_z")), cons(CHAR_lbrace, makeString("Characters.CHAR_lbrace")), cons(CHAR_vertical, makeString("Characters.CHAR_vertical")), cons(CHAR_rbrace, makeString("Characters.CHAR_rbrace")), cons(CHAR_tilde, makeString("Characters.CHAR_tilde")), cons(CHAR_rubout, makeString("Characters.CHAR_rubout")) });
    }

    @Override
    public void declareFunctions() {
        declare_java_name_translation_file();
    }

    @Override
    public void initializeVariables() {
        init_java_name_translation_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_java_name_translation_file();
    }

    static {
    }
}

/**
 * Total time: 643 ms
 */
