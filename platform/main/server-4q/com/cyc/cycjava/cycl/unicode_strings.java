package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.cfasl;
import com.cyc.cycjava.cycl.unicode_strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.cfasl.*;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.cycjava.cycl.unicode_strings.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_0;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_U;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_ampersand;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_backslash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_semicolon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_tilde;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_u;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EIGHTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIFTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.MINUS_ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SEVEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SIX_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWELVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class unicode_strings extends SubLTranslatedFile {
    public static final SubLFile me = new unicode_strings();

    public static final String myName = "com.cyc.cycjava.cycl.unicode_strings";

    public static final String myFingerPrint = "a38923d9dc47c1b16cb82ad6b6a348dced2f87dcd7dd1ad0f0917dbbf2db8d2e";

    // defconstant
    private static final SubLSymbol $max_unicode_value$ = makeSymbol("MAX-UNICODE-VALUE");

    // defconstant
    public static final SubLSymbol $dtp_unicode_char$ = makeSymbol("*DTP-UNICODE-CHAR*");

    // defconstant
    public static final SubLSymbol $dtp_unicode_string$ = makeSymbol("*DTP-UNICODE-STRING*");

    // deflexical
    private static final SubLSymbol $default_non_ascii_placeholder_char$ = makeSymbol("*DEFAULT-NON-ASCII-PLACEHOLDER-CHAR*");

    // defparameter
    /**
     * An a-list mapping unicode-codes to ascii codes of common substitutes for
     * characters that are not part of 7-bit ascii. Currently, this only contains
     * code for 8-bit characters (e.g. the Latin-1 supplement).
     */
    private static final SubLSymbol $default_unicode_to_ascii_code_map$ = makeSymbol("*DEFAULT-UNICODE-TO-ASCII-CODE-MAP*");

    // deflexical
    private static final SubLSymbol $html_40_character_entity_table$ = makeSymbol("*HTML-40-CHARACTER-ENTITY-TABLE*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_unicode_char$ = makeSymbol("*CFASL-OPCODE-UNICODE-CHAR*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_unicode_string$ = makeSymbol("*CFASL-OPCODE-UNICODE-STRING*");

    private static final SubLInteger $int$1114111 = makeInteger(1114111);

    public static final SubLSymbol UNICODE_CHAR = makeSymbol("UNICODE-CHAR");

    public static final SubLSymbol UNICODE_CHAR_P = makeSymbol("UNICODE-CHAR-P");

    public static final SubLList $list3 = list(makeSymbol("UCHAR"));

    public static final SubLList $list4 = list(makeKeyword("UCHAR"));

    public static final SubLList $list5 = list(makeSymbol("UNICODE-CHAR-UCHAR"));

    public static final SubLList $list6 = list(makeSymbol("_CSETF-UNICODE-CHAR-UCHAR"));

    public static final SubLSymbol PRINT_UNICODE_CHAR = makeSymbol("PRINT-UNICODE-CHAR");

    public static final SubLSymbol UNICODE_CHAR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("UNICODE-CHAR-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list9 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("UNICODE-CHAR-P"));

    private static final SubLSymbol UNICODE_CHAR_UCHAR = makeSymbol("UNICODE-CHAR-UCHAR");

    private static final SubLSymbol _CSETF_UNICODE_CHAR_UCHAR = makeSymbol("_CSETF-UNICODE-CHAR-UCHAR");



    private static final SubLString $str13$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_UNICODE_CHAR = makeSymbol("MAKE-UNICODE-CHAR");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_UNICODE_CHAR_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-UNICODE-CHAR-METHOD");

    private static final SubLString $str19$_u_x = makeString("#u~x");

    private static final SubLString $str20$_u0_x = makeString("#u0~x");

    private static final SubLSymbol UNICODE_CHARACTER_P = makeSymbol("UNICODE-CHARACTER-P");

    private static final SubLSymbol UNICODE_STRING = makeSymbol("UNICODE-STRING");

    private static final SubLSymbol UNICODE_STRING_P = makeSymbol("UNICODE-STRING-P");

    private static final SubLList $list24 = list(makeSymbol("VECT"));

    private static final SubLList $list25 = list(makeKeyword("VECT"));

    private static final SubLList $list26 = list(makeSymbol("UNICODE-STRING-VECT"));

    private static final SubLList $list27 = list(makeSymbol("_CSETF-UNICODE-STRING-VECT"));

    private static final SubLSymbol PRINT_UNICODE_STRING = makeSymbol("PRINT-UNICODE-STRING");

    private static final SubLSymbol UNICODE_STRING_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("UNICODE-STRING-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list30 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("UNICODE-STRING-P"));

    private static final SubLSymbol UNICODE_STRING_VECT = makeSymbol("UNICODE-STRING-VECT");

    private static final SubLSymbol _CSETF_UNICODE_STRING_VECT = makeSymbol("_CSETF-UNICODE-STRING-VECT");



    private static final SubLSymbol MAKE_UNICODE_STRING = makeSymbol("MAKE-UNICODE-STRING");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_UNICODE_STRING_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-UNICODE-STRING-METHOD");

    private static final SubLString $str36$_u__a_ = makeString("#u\"~a\"");

    private static final SubLSymbol UNICODE_VECTOR_STRING_P = makeSymbol("UNICODE-VECTOR-STRING-P");

    private static final SubLInteger $int$127 = makeInteger(127);

    private static final SubLSymbol $HTML_ESCAPED_ASCII = makeKeyword("HTML-ESCAPED-ASCII");

    private static final SubLSymbol $ESCAPED_PROBABLY_UTF8 = makeKeyword("ESCAPED-PROBABLY-UTF8");







    private static final SubLInteger $int$128 = makeInteger(128);









    private static final SubLSymbol DISPLAY_VECTOR_STRING_P = makeSymbol("DISPLAY-VECTOR-STRING-P");

    private static final SubLSymbol ASCII_CHAR_P = makeSymbol("ASCII-CHAR-P");

    private static final SubLList $list51 = list(new SubLObject[]{ cons(makeInteger(183), makeInteger(42)), cons(makeInteger(192), makeInteger(65)), cons(makeInteger(193), makeInteger(65)), cons(makeInteger(194), makeInteger(65)), cons(makeInteger(195), makeInteger(65)), cons(makeInteger(196), makeInteger(65)), cons(makeInteger(197), makeInteger(65)), cons(makeInteger(200), makeInteger(69)), cons(makeInteger(201), makeInteger(69)), cons(makeInteger(202), makeInteger(69)), cons(makeInteger(203), makeInteger(69)), cons(makeInteger(204), makeInteger(73)), cons(makeInteger(205), makeInteger(73)), cons(makeInteger(206), makeInteger(73)), cons(makeInteger(207), makeInteger(73)), cons(makeInteger(209), makeInteger(78)), cons(makeInteger(210), makeInteger(79)), cons(makeInteger(211), makeInteger(79)), cons(makeInteger(212), makeInteger(79)), cons(makeInteger(213), makeInteger(79)), cons(makeInteger(214), makeInteger(79)), cons(makeInteger(216), makeInteger(79)), cons(makeInteger(217), makeInteger(85)), cons(makeInteger(218), makeInteger(85)), cons(makeInteger(219), makeInteger(85)), cons(makeInteger(220), makeInteger(85)), cons(makeInteger(221), makeInteger(89)), cons(makeInteger(224), makeInteger(97)), cons(makeInteger(225), makeInteger(97)), cons(makeInteger(226), makeInteger(97)), cons(makeInteger(227), makeInteger(97)), cons(makeInteger(228), makeInteger(97)), cons(makeInteger(229), makeInteger(97)), cons(makeInteger(231), makeInteger(99)), cons(makeInteger(232), makeInteger(101)), cons(makeInteger(233), makeInteger(101)), cons(makeInteger(234), makeInteger(101)), cons(makeInteger(235), makeInteger(101)), cons(makeInteger(236), makeInteger(105)), cons(makeInteger(237), makeInteger(105)), cons(makeInteger(238), makeInteger(105)), cons(makeInteger(239), makeInteger(105)), cons(makeInteger(240), makeInteger(100)), cons(makeInteger(241), makeInteger(110)), cons(makeInteger(242), makeInteger(111)), cons(makeInteger(243), makeInteger(111)), cons(makeInteger(244), makeInteger(111)), cons(makeInteger(245), makeInteger(111)), cons(makeInteger(246), makeInteger(111)), cons(makeInteger(248), makeInteger(111)), cons(makeInteger(249), makeInteger(117)), cons(makeInteger(250), makeInteger(117)), cons(makeInteger(251), makeInteger(117)), cons(makeInteger(252), makeInteger(117)), cons(makeInteger(253), makeInteger(121)), cons(makeInteger(255), makeInteger(121)), cons(makeInteger(323), makeInteger(110)), cons(makeInteger(324), makeInteger(110)), cons(makeInteger(8217), makeInteger(39)) });

    private static final SubLString $str52$__ = makeString("\\\"");

    private static final SubLString $str53$__ = makeString("\\\\");

    private static final SubLString $str54$_u26_ = makeString("&u26;");



    private static final SubLString $$$0 = makeString("0");

    private static final SubLString $str57$_u_A_ = makeString("&u~A;");

    private static final SubLSymbol UTF8_VECTOR_STRING_P = makeSymbol("UTF8-VECTOR-STRING-P");

    private static final SubLString $str59$Invalid_UTF_8_encoding_at__S_in__ = makeString("Invalid UTF-8 encoding at ~S in ~S");

    private static final SubLInteger $int$2047 = makeInteger(2047);

    private static final SubLInteger $int$65535 = makeInteger(65535);

    private static final SubLInteger $int$2097151 = makeInteger(2097151);

    private static final SubLInteger $int$67108863 = makeInteger(67108863);

    private static final SubLString $str64$__ = makeString("#(");

    private static final SubLString $str65$_x_x_ = makeString("#x~x ");

    private static final SubLString $str66$___ = makeString(")~%");

    private static final SubLInteger $int$192 = makeInteger(192);

    private static final SubLInteger $int$_6 = makeInteger(-6);

    private static final SubLInteger $int$63 = makeInteger(63);

    private static final SubLInteger $int$224 = makeInteger(224);

    private static final SubLInteger $int$_12 = makeInteger(-12);

    private static final SubLInteger $int$240 = makeInteger(240);

    private static final SubLInteger $int$_18 = makeInteger(-18);

    private static final SubLInteger $int$248 = makeInteger(248);

    private static final SubLInteger $int$_24 = makeInteger(-24);

    private static final SubLInteger $int$193 = makeInteger(193);

    private static final SubLInteger $int$245 = makeInteger(245);



    private static final SubLInteger $int$31 = makeInteger(31);

    private static final SubLInteger $int$24 = makeInteger(24);

    private static final SubLString $str81$__x = makeString("&#x");

    private static final SubLInteger $int$38 = makeInteger(38);

    private static final SubLSymbol $START_HTML_ESCAPE = makeKeyword("START-HTML-ESCAPE");

    private static final SubLInteger $int$60 = makeInteger(60);



    private static final SubLInteger $int$62 = makeInteger(62);

    private static final SubLInteger $int$35 = makeInteger(35);

    private static final SubLSymbol $HTML_NUMERIC_ESCAPE_START = makeKeyword("HTML-NUMERIC-ESCAPE-START");



    private static final SubLInteger $int$120 = makeInteger(120);

    private static final SubLSymbol $HTML_HEXADECIMAL_ESCAPE = makeKeyword("HTML-HEXADECIMAL-ESCAPE");

    private static final SubLInteger $int$48 = makeInteger(48);

    private static final SubLInteger $int$57 = makeInteger(57);

    private static final SubLSymbol $HTML_DECIMAL_ESCAPE = makeKeyword("HTML-DECIMAL-ESCAPE");

    private static final SubLInteger $int$59 = makeInteger(59);

    private static final SubLSymbol CODE_CHAR = makeSymbol("CODE-CHAR");



    private static final SubLSymbol $sym98$__ = makeSymbol("<=");

    private static final SubLSymbol CHAR_CODE = makeSymbol("CHAR-CODE");

    private static final SubLString $str100$_S__code___S__is_not_a_valid_utf8 = makeString("~S (code: ~S) is not a valid utf8 character");



    private static final SubLObject $list102 = _constant_102_initializer();

    private static final SubLInteger $int$52 = makeInteger(52);

    private static final SubLSymbol CFASL_INPUT_UNICODE_CHAR = makeSymbol("CFASL-INPUT-UNICODE-CHAR");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_UNICODE_CHAR_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-UNICODE-CHAR-METHOD");

    private static final SubLString $str106$Invalid_unicode_character__expect = makeString("Invalid unicode character, expected ~A bytes, got ~A only.");

    private static final SubLInteger $int$53 = makeInteger(53);

    private static final SubLSymbol CFASL_INPUT_UNICODE_STRING = makeSymbol("CFASL-INPUT-UNICODE-STRING");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_UNICODE_STRING_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-UNICODE-STRING-METHOD");

    private static final SubLSymbol HTML_ESCAPED_UTF8_STRING_TO_UTF8_STRING = makeSymbol("HTML-ESCAPED-UTF8-STRING-TO-UTF8-STRING");













    private static final SubLList $list117 = list(list(list(makeString("Japan&#39;s")), makeString("Japan's")));

    public static SubLObject unicode_char_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_unicode_char(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject unicode_char_p(final SubLObject v_object) {
        return v_object.getClass() == unicode_strings.$unicode_char_native.class ? T : NIL;
    }

    public static SubLObject unicode_char_uchar(final SubLObject v_object) {
        assert NIL != unicode_char_p(v_object) : "unicode_strings.unicode_char_p(v_object) " + "CommonSymbols.NIL != unicode_strings.unicode_char_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject _csetf_unicode_char_uchar(final SubLObject v_object, final SubLObject value) {
        assert NIL != unicode_char_p(v_object) : "unicode_strings.unicode_char_p(v_object) " + "CommonSymbols.NIL != unicode_strings.unicode_char_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject make_unicode_char(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new unicode_strings.$unicode_char_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($UCHAR)) {
                _csetf_unicode_char_uchar(v_new, current_value);
            } else {
                Errors.error($str13$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    public static SubLObject visit_defstruct_unicode_char(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_UNICODE_CHAR, ONE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $UCHAR, unicode_char_uchar(obj));
        funcall(visitor_fn, obj, $END, MAKE_UNICODE_CHAR, ONE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_unicode_char_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_unicode_char(obj, visitor_fn);
    }

    public static SubLObject unicode_char_create(final SubLObject uchar) {
        SubLObject ch = ZERO_INTEGER;
        if (NIL != unicode_character_p(uchar)) {
            ch = uchar;
        } else {
            if (!uchar.isChar()) {
                return NIL;
            }
            ch = char_code(uchar);
        }
        final SubLObject unicode_char_obj = make_unicode_char(UNPROVIDED);
        _csetf_unicode_char_uchar(unicode_char_obj, ch);
        return unicode_char_obj;
    }

    public static SubLObject print_unicode_char(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLObject uchar = unicode_char_uchar(v_object);
        if (uchar.numG(FIFTEEN_INTEGER)) {
            format(stream, $str19$_u_x, unicode_char_uchar(v_object));
        } else {
            format(stream, $str20$_u0_x, unicode_char_uchar(v_object));
        }
        return v_object;
    }

    public static SubLObject unicode_char_get_char(final SubLObject uchar) {
        assert NIL != unicode_char_p(uchar) : "unicode_strings.unicode_char_p(uchar) " + "CommonSymbols.NIL != unicode_strings.unicode_char_p(uchar) " + uchar;
        return unicode_char_uchar(uchar);
    }

    public static SubLObject unicode_char_set_char(final SubLObject uchar, final SubLObject v_char) {
        assert NIL != unicode_char_p(uchar) : "unicode_strings.unicode_char_p(uchar) " + "CommonSymbols.NIL != unicode_strings.unicode_char_p(uchar) " + uchar;
        assert NIL != unicode_character_p(v_char) : "unicode_strings.unicode_character_p(v_char) " + "CommonSymbols.NIL != unicode_strings.unicode_character_p(v_char) " + v_char;
        _csetf_unicode_char_uchar(uchar, v_char);
        return uchar;
    }

    public static SubLObject unicode_string_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_unicode_string(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject unicode_string_p(final SubLObject v_object) {
        return v_object.getClass() == unicode_strings.$unicode_string_native.class ? T : NIL;
    }

    public static SubLObject unicode_string_vect(final SubLObject v_object) {
        assert NIL != unicode_string_p(v_object) : "unicode_strings.unicode_string_p(v_object) " + "CommonSymbols.NIL != unicode_strings.unicode_string_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject _csetf_unicode_string_vect(final SubLObject v_object, final SubLObject value) {
        assert NIL != unicode_string_p(v_object) : "unicode_strings.unicode_string_p(v_object) " + "CommonSymbols.NIL != unicode_strings.unicode_string_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject make_unicode_string(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new unicode_strings.$unicode_string_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($VECT)) {
                _csetf_unicode_string_vect(v_new, current_value);
            } else {
                Errors.error($str13$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    public static SubLObject visit_defstruct_unicode_string(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_UNICODE_STRING, ONE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $VECT, unicode_string_vect(obj));
        funcall(visitor_fn, obj, $END, MAKE_UNICODE_STRING, ONE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_unicode_string_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_unicode_string(obj, visitor_fn);
    }

    public static SubLObject unicode_string_create(final SubLObject vect) {
        SubLObject v = NIL;
        if (NIL != unicode_character_p(vect)) {
            v = make_vector(ONE_INTEGER, UNPROVIDED);
            set_aref(vect, ZERO_INTEGER, vect);
        } else
            if (vect.isChar()) {
                v = make_vector(ONE_INTEGER, UNPROVIDED);
                set_aref(v, ZERO_INTEGER, char_code(vect));
            } else
                if (NIL != unicode_vector_string_p(vect)) {
                    v = vect;
                } else {
                    if (!vect.isString()) {
                        return NIL;
                    }
                    final SubLObject univ = display_to_unicode_vector(vect);
                    if (NIL == univ) {
                        return NIL;
                    }
                    v = univ;
                }


        final SubLObject unicode_string_obj = make_unicode_string(UNPROVIDED);
        _csetf_unicode_string_vect(unicode_string_obj, v);
        return unicode_string_obj;
    }

    public static SubLObject print_unicode_string(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str36$_u__a_, unicode_vector_to_display(unicode_string_vect(v_object)));
        return v_object;
    }

    public static SubLObject unicode_string_get_vector(final SubLObject ustring) {
        assert NIL != unicode_string_p(ustring) : "unicode_strings.unicode_string_p(ustring) " + "CommonSymbols.NIL != unicode_strings.unicode_string_p(ustring) " + ustring;
        return unicode_string_vect(ustring);
    }

    public static SubLObject unicode_string_set_vector(final SubLObject ustring, final SubLObject vect) {
        assert NIL != unicode_string_p(ustring) : "unicode_strings.unicode_string_p(ustring) " + "CommonSymbols.NIL != unicode_strings.unicode_string_p(ustring) " + ustring;
        assert NIL != unicode_vector_string_p(vect) : "unicode_strings.unicode_vector_string_p(vect) " + "CommonSymbols.NIL != unicode_strings.unicode_vector_string_p(vect) " + vect;
        _csetf_unicode_string_vect(ustring, vect);
        return ustring;
    }

    public static SubLObject unicode_vector_string_p(final SubLObject v_object) {
        if (!v_object.isVector()) {
            return NIL;
        }
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = length(v_object), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            if (NIL == unicode_character_p(aref(v_object, i))) {
                return NIL;
            }
        }
        return T;
    }

    public static SubLObject utf8_vector_string_p(final SubLObject v_object) {
        if (!v_object.isVector()) {
            return NIL;
        }
        SubLObject len;
        SubLObject index;
        SubLObject ulen;
        for (len = length(v_object), index = ZERO_INTEGER; index.numL(len); index = add(index, ulen)) {
            ulen = length_utf8_vector_codepoint(v_object, index);
            if (ulen.isNegative()) {
                return NIL;
            }
        }
        if (index.numG(len)) {
            return NIL;
        }
        return T;
    }

    public static SubLObject ascii_string_p(final SubLObject v_object) {
        if (!v_object.isString()) {
            return NIL;
        }
        SubLObject cdotimes_end_var;
        SubLObject i;
        SubLObject v_char;
        for (cdotimes_end_var = length(v_object), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            v_char = Strings.sublisp_char(v_object, i);
            if (NIL == ascii_char_p_int(v_char)) {
                return NIL;
            }
        }
        return T;
    }

    public static SubLObject non_ascii_string_p(final SubLObject v_object) {
        return makeBoolean(v_object.isString() && (NIL == ascii_string_p(v_object)));
    }

    public static SubLObject ascii_char_p(final SubLObject v_object) {
        return makeBoolean(v_object.isChar() && (NIL != ascii_char_p_int(v_object)));
    }

    public static SubLObject non_ascii_char_p(final SubLObject v_object) {
        return makeBoolean(v_object.isChar() && (NIL == ascii_char_p_int(v_object)));
    }

    public static SubLObject ascii_char_code_p(final SubLObject v_object) {
        return makeBoolean(v_object.isInteger() && v_object.numLE($int$127));
    }

    public static SubLObject ascii_char_p_int(final SubLObject v_char) {
        return numLE(char_code(v_char), $int$127);
    }

    public static SubLObject identify_string_type(final SubLObject string) {
        if ((NIL != ascii_string_p(string)) && (NIL != string_utilities.html_escaped_string_p(string))) {
            return $HTML_ESCAPED_ASCII;
        }
        if ((NIL != non_ascii_string_p(string)) && (NIL != string_utilities.html_escaped_string_p(string))) {
            return $ESCAPED_PROBABLY_UTF8;
        }
        if (NIL != cycl_grammar.subl_string_p(string)) {
            return $SUBL_STRING;
        }
        if (NIL != non_ascii_string_p(string)) {
            return $PROBABLY_UTF8;
        }
        return $UNK;
    }

    public static SubLObject display_vector_is_ascii_p(final SubLObject v_object) {
        if (NIL == display_vector_string_p(v_object)) {
            return NIL;
        }
        final SubLObject vector_var;
        final SubLObject unicode_vector = vector_var = display_to_unicode_vector(v_object);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject elt;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            elt = aref(vector_var, element_num);
            if (elt.numGE($int$128)) {
                return NIL;
            }
        }
        return T;
    }

    public static SubLObject display_vector_string_p(final SubLObject v_object) {
        if (!v_object.isString()) {
            return NIL;
        }
        SubLObject state = $OPEN;
        SubLObject ch = NIL;
        SubLObject count = ZERO_INTEGER;
        SubLObject uvalue = ZERO_INTEGER;
        SubLObject cdotimes_end_var;
        SubLObject i;
        SubLObject pcase_var;
        SubLObject pcase_var_$1;
        SubLObject pcase_var_$2;
        for (cdotimes_end_var = length(v_object), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            ch = aref(v_object, i);
            pcase_var = state;
            if (pcase_var.eql($OPEN)) {
                pcase_var_$1 = ch;
                if (pcase_var_$1.eql(CHAR_ampersand)) {
                    state = $START_UNICODE;
                }
            } else
                if (pcase_var.eql($START_UNICODE)) {
                    pcase_var_$2 = ch;
                    if (pcase_var_$2.eql(CHAR_u) || pcase_var_$2.eql(CHAR_U)) {
                        state = $UNICODE_CHAR;
                        count = ZERO_INTEGER;
                        uvalue = ZERO_INTEGER;
                    } else {
                        state = $OPEN;
                    }
                } else
                    if (pcase_var.eql($UNICODE_CHAR)) {
                        if (ch.eql(CHAR_semicolon)) {
                            state = $OPEN;
                            if (((NIL == unicode_character_p(uvalue)) || (!count.numG(ONE_INTEGER))) || (!count.numL(SEVEN_INTEGER))) {
                                return NIL;
                            }
                        } else
                            if (NIL == string_utilities.hex_char_p(ch)) {
                                return NIL;
                            }

                    }


            count = add(count, ONE_INTEGER);
        }
        pcase_var = state;
        if (pcase_var.eql($UNICODE_CHAR) || pcase_var.eql($START_UNICODE)) {
            return NIL;
        }
        return T;
    }

    public static SubLObject display_to_unicode_vector(final SubLObject v_object) {
        if (!v_object.isString()) {
            return NIL;
        }
        SubLObject state = $OPEN;
        SubLObject count = ZERO_INTEGER;
        SubLObject uvalue = ZERO_INTEGER;
        SubLObject retval = NIL;
        SubLObject elts = ZERO_INTEGER;
        SubLObject end_var_$3;
        SubLObject end_var;
        SubLObject i;
        SubLObject ch;
        SubLObject pcase_var;
        SubLObject pcase_var_$4;
        SubLObject pcase_var_$5;
        for (end_var = end_var_$3 = length(v_object), i = NIL, i = ZERO_INTEGER; !i.numGE(end_var_$3); i = number_utilities.f_1X(i)) {
            ch = Strings.sublisp_char(v_object, i);
            pcase_var = state;
            if (pcase_var.eql($OPEN)) {
                pcase_var_$4 = ch;
                if (pcase_var_$4.eql(CHAR_ampersand)) {
                    state = $START_UNICODE;
                } else
                    if (!pcase_var_$4.eql(CHAR_backslash)) {
                        retval = cons(char_code(ch), retval);
                        elts = add(elts, ONE_INTEGER);
                    }

            } else
                if (pcase_var.eql($START_UNICODE)) {
                    pcase_var_$5 = ch;
                    if (pcase_var_$5.eql(CHAR_u) || pcase_var_$5.eql(CHAR_U)) {
                        state = $UNICODE_CHAR;
                        count = ZERO_INTEGER;
                        uvalue = ZERO_INTEGER;
                    } else {
                        state = $OPEN;
                        retval = cons(char_code(CHAR_ampersand), retval);
                        retval = cons(char_code(ch), retval);
                        elts = add(elts, TWO_INTEGER);
                    }
                } else
                    if (pcase_var.eql($UNICODE_CHAR)) {
                        if (ch.eql(CHAR_semicolon)) {
                            state = $OPEN;
                            if (((NIL == unicode_character_p(uvalue)) || (!count.numG(ONE_INTEGER))) || (!count.numL(SEVEN_INTEGER))) {
                                return NIL;
                            }
                            retval = cons(uvalue, retval);
                            elts = add(elts, ONE_INTEGER);
                        } else {
                            if (NIL == string_utilities.hex_char_p(ch)) {
                                return NIL;
                            }
                            uvalue = add(ash(uvalue, FOUR_INTEGER), string_utilities.hex_char_value(ch));
                        }
                        count = add(count, ONE_INTEGER);
                    }


        }
        final SubLObject pcase_var2 = state;
        if (pcase_var2.eql($UNICDE_CHAR) || pcase_var2.eql($START_UNICODE)) {
            return NIL;
        }
        return element_vector(nreverse(retval), elts);
    }

    public static SubLObject display_to_subl_string(final SubLObject display, SubLObject placeholder_char, SubLObject subst_alist) {
        if (placeholder_char == UNPROVIDED) {
            placeholder_char = $default_non_ascii_placeholder_char$.getGlobalValue();
        }
        if (subst_alist == UNPROVIDED) {
            subst_alist = $default_unicode_to_ascii_code_map$.getDynamicValue();
        }
        assert NIL != display_vector_string_p(display) : "unicode_strings.display_vector_string_p(display) " + "CommonSymbols.NIL != unicode_strings.display_vector_string_p(display) " + display;
        assert NIL != ascii_char_p(placeholder_char) : "unicode_strings.ascii_char_p(placeholder_char) " + "CommonSymbols.NIL != unicode_strings.ascii_char_p(placeholder_char) " + placeholder_char;
        final SubLObject unicode_vector = display_to_unicode_vector(display);
        final SubLObject length = length(unicode_vector);
        final SubLObject string = Strings.make_string(length, placeholder_char);
        final SubLObject vector_var = unicode_vector;
        final SubLObject backwardP_var = NIL;
        SubLObject length_$6;
        SubLObject v_iteration;
        SubLObject index;
        SubLObject code;
        for (length_$6 = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length_$6); v_iteration = add(v_iteration, ONE_INTEGER)) {
            index = (NIL != backwardP_var) ? subtract(length_$6, v_iteration, ONE_INTEGER) : v_iteration;
            code = aref(vector_var, index);
            if (code.numGE($int$128) && (NIL != list_utilities.alist_lookup(subst_alist, code, EQ, NIL))) {
                Strings.set_char(string, index, code_char(list_utilities.alist_lookup(subst_alist, code, EQ, NIL)));
            } else
                if (code.numL($int$128)) {
                    Strings.set_char(string, index, code_char(code));
                }

        }
        return string;
    }

    public static SubLObject unicode_vector_to_display(final SubLObject ucode) {
        SubLObject retval = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject code_point;
            SubLObject hex;
            for (length = length(ucode), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                code_point = aref(ucode, element_num);
                if (code_point.eql(char_code(CHAR_quotation))) {
                    princ($str52$__, stream);
                } else
                    if (code_point.eql(char_code(CHAR_backslash))) {
                        princ($str53$__, stream);
                    } else
                        if (code_point.eql(char_code(CHAR_ampersand))) {
                            princ($str54$_u26_, stream);
                        } else
                            if (code_point.numGE($int$32) && code_point.numLE($int$127)) {
                                princ(Strings.make_string(ONE_INTEGER, code_char(code_point)), stream);
                            } else {
                                hex = Strings.string_upcase(number_utilities.convert_to_hexadecimal(code_point), UNPROVIDED, UNPROVIDED);
                                if (length(hex).eql(ONE_INTEGER)) {
                                    hex = cconcatenate($$$0, hex);
                                }
                                format(stream, $str57$_u_A_, hex);
                            }



            }
            retval = get_output_stream_string(stream);
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
        return retval;
    }

    public static SubLObject element_vector(final SubLObject list, final SubLObject elts) {
        final SubLObject vect = make_vector(elts, UNPROVIDED);
        SubLObject i = ZERO_INTEGER;
        SubLObject cdolist_list_var = list;
        SubLObject elt = NIL;
        elt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            set_aref(vect, i, elt);
            i = add(i, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            elt = cdolist_list_var.first();
        } 
        return vect;
    }

    public static SubLObject unicode_vector_to_utf8_vector(final SubLObject ucode, SubLObject start, SubLObject end) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        assert NIL != unicode_vector_string_p(ucode) : "unicode_strings.unicode_vector_string_p(ucode) " + "CommonSymbols.NIL != unicode_strings.unicode_vector_string_p(ucode) " + ucode;
        if (NIL == end) {
            end = subtract(length(ucode), ONE_INTEGER);
        }
        SubLObject utf8_len = ZERO_INTEGER;
        SubLObject utf8_str = NIL;
        SubLObject offset = ZERO_INTEGER;
        SubLObject elt;
        for (SubLObject ucode_offset = start; ucode_offset.numLE(end); ucode_offset = add(ucode_offset, ONE_INTEGER) , utf8_len = add(utf8_len, number_utf8_bytes(elt))) {
            elt = aref(ucode, ucode_offset);
        }
        utf8_str = make_vector(utf8_len, UNPROVIDED);
        for (SubLObject ucode_offset = start; ucode_offset.numLE(end); ucode_offset = add(ucode_offset, ONE_INTEGER) , offset = to_utc8_vector_internal(utf8_str, offset, elt)) {
            elt = aref(ucode, ucode_offset);
        }
        return utf8_str;
    }

    public static SubLObject utf8_vector_to_unicode_vector(final SubLObject utf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != utf8_vector_string_p(utf) : "unicode_strings.utf8_vector_string_p(utf) " + "CommonSymbols.NIL != unicode_strings.utf8_vector_string_p(utf) " + utf;
        final SubLObject len = length(utf);
        SubLObject index = ZERO_INTEGER;
        SubLObject number_ucode_elts = ZERO_INTEGER;
        SubLObject elt = ZERO_INTEGER;
        SubLObject unicode_vector = NIL;
        while (index.numL(len)) {
            final SubLObject ulen = length_utf8_vector_codepoint(utf, index);
            if (MINUS_ONE_INTEGER.eql(ulen)) {
                Errors.error($str59$Invalid_UTF_8_encoding_at__S_in__, index, utf);
            }
            number_ucode_elts = add(number_ucode_elts, ONE_INTEGER);
            index = add(index, ulen);
        } 
        unicode_vector = make_vector(number_ucode_elts, UNPROVIDED);
        index = ZERO_INTEGER;
        while (index.numL(len)) {
            thread.resetMultipleValues();
            final SubLObject value = get_unicode_char_at_offset(utf, index);
            final SubLObject next_offset = thread.secondMultipleValue();
            final SubLObject len_elt = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            index = next_offset;
            set_aref(unicode_vector, elt, value);
            elt = add(elt, ONE_INTEGER);
        } 
        return unicode_vector;
    }

    public static SubLObject unicode_char_code(final SubLObject uchar) {
        assert NIL != unicode_char_p(uchar) : "unicode_strings.unicode_char_p(uchar) " + "CommonSymbols.NIL != unicode_strings.unicode_char_p(uchar) " + uchar;
        return unicode_char_uchar(uchar);
    }

    public static SubLObject unicode_code_char(final SubLObject uchar) {
        assert NIL != unicode_character_p(uchar) : "unicode_strings.unicode_character_p(uchar) " + "CommonSymbols.NIL != unicode_strings.unicode_character_p(uchar) " + uchar;
        return unicode_char_create(uchar);
    }

    public static SubLObject unicode_character_p(final SubLObject uchar) {
        if (!uchar.isInteger()) {
            return NIL;
        }
        if (uchar.isNegative()) {
            return NIL;
        }
        return unicode_subsets.unicode_isdefined(uchar);
    }

    public static SubLObject number_utf8_bytes(final SubLObject uchar) {
        assert NIL != unicode_character_p(uchar) : "unicode_strings.unicode_character_p(uchar) " + "CommonSymbols.NIL != unicode_strings.unicode_character_p(uchar) " + uchar;
        if (uchar.numLE($int$127)) {
            return ONE_INTEGER;
        }
        if (uchar.numLE($int$2047)) {
            return TWO_INTEGER;
        }
        if (uchar.numLE($int$65535)) {
            return THREE_INTEGER;
        }
        if (uchar.numLE($int$2097151)) {
            return FOUR_INTEGER;
        }
        if (uchar.numLE($int$67108863)) {
            return FIVE_INTEGER;
        }
        return SIX_INTEGER;
    }

    public static SubLObject to_utf8_vector(final SubLObject uchar) {
        assert NIL != unicode_character_p(uchar) : "unicode_strings.unicode_character_p(uchar) " + "CommonSymbols.NIL != unicode_strings.unicode_character_p(uchar) " + uchar;
        final SubLObject vect = make_vector(number_utf8_bytes(uchar), UNPROVIDED);
        to_utc8_vector_internal(vect, ZERO_INTEGER, uchar);
        return vect;
    }

    public static SubLObject print_utf_hex_list(final SubLObject uvect) {
        format(T, $str64$__);
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = length(uvect), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            format(T, $str65$_x_x_, aref(uvect, i));
        }
        format(T, $str66$___);
        return NIL;
    }

    public static SubLObject to_utc8_vector_internal(final SubLObject char_vector, final SubLObject offset, final SubLObject uchar) {
        if (uchar.numLE($int$127)) {
            set_aref(char_vector, offset, uchar);
            return add(offset, ONE_INTEGER);
        }
        if (uchar.numLE($int$2047)) {
            set_aref(char_vector, offset, logior($int$192, ash(uchar, $int$_6)));
            set_aref(char_vector, add(offset, ONE_INTEGER), logior($int$128, logand(uchar, $int$63)));
            return add(offset, TWO_INTEGER);
        }
        if (uchar.numLE($int$65535)) {
            set_aref(char_vector, offset, logior($int$224, ash(uchar, $int$_12)));
            set_aref(char_vector, add(offset, ONE_INTEGER), logior($int$128, logand(ash(uchar, $int$_6), $int$63)));
            set_aref(char_vector, add(offset, TWO_INTEGER), logior($int$128, logand(uchar, $int$63)));
            return add(offset, THREE_INTEGER);
        }
        if (uchar.numLE($int$2097151)) {
            set_aref(char_vector, offset, logior($int$240, ash(uchar, $int$_18)));
            set_aref(char_vector, add(offset, ONE_INTEGER), logior($int$128, logand(ash(uchar, $int$_12), $int$63)));
            set_aref(char_vector, add(offset, TWO_INTEGER), logior($int$128, logand(ash(uchar, $int$_6), $int$63)));
            set_aref(char_vector, add(offset, THREE_INTEGER), logior($int$128, logand(uchar, $int$63)));
            return add(offset, FOUR_INTEGER);
        }
        if (uchar.numLE($int$67108863)) {
            set_aref(char_vector, offset, logior($int$248, ash(uchar, $int$_24)));
            set_aref(char_vector, add(offset, ONE_INTEGER), logior($int$128, logand(ash(uchar, $int$_18), $int$63)));
            set_aref(char_vector, add(offset, TWO_INTEGER), logior($int$128, logand(ash(uchar, $int$_12), $int$63)));
            set_aref(char_vector, add(offset, THREE_INTEGER), logior($int$128, logand(ash(uchar, $int$_6), $int$63)));
            set_aref(char_vector, add(offset, FOUR_INTEGER), logior($int$128, logand(uchar, $int$63)));
            return add(offset, FIVE_INTEGER);
        }
        return add(offset, ONE_INTEGER);
    }

    public static SubLObject length_utf8_vector_codepoint(final SubLObject char_vector, final SubLObject offset) {
        if (!char_vector.isVector()) {
            return MINUS_ONE_INTEGER;
        }
        final SubLObject len = length(char_vector);
        SubLObject ulen = ZERO_INTEGER;
        if (offset.numGE(len) || offset.isNegative()) {
            return MINUS_ONE_INTEGER;
        }
        final SubLObject first_byte = aref(char_vector, offset);
        ulen = length_utf8_from_first_byte(first_byte);
        if (ulen.isNegative()) {
            return ulen;
        }
        if (add(offset, ulen).numG(len)) {
            return MINUS_ONE_INTEGER;
        }
        SubLObject cdotimes_end_var;
        SubLObject i;
        SubLObject charcode;
        SubLObject logand;
        for (cdotimes_end_var = add(ulen, MINUS_ONE_INTEGER), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            charcode = aref(char_vector, add(offset, ONE_INTEGER, i));
            logand = logand($int$192, charcode);
            if (!logand.numE($int$128)) {
                return MINUS_ONE_INTEGER;
            }
        }
        return ulen;
    }

    public static SubLObject length_utf8_from_first_byte(final SubLObject first_byte) {
        if (NIL == number_utilities.bytep(first_byte)) {
            return MINUS_ONE_INTEGER;
        }
        if (logand($int$128, first_byte).numE(ZERO_INTEGER)) {
            return ONE_INTEGER;
        }
        if (logand($int$224, first_byte).numE($int$192)) {
            return first_byte.numG($int$193) ? TWO_INTEGER : MINUS_ONE_INTEGER;
        }
        if (logand($int$240, first_byte).numE($int$224)) {
            return THREE_INTEGER;
        }
        if (logand($int$248, first_byte).numE($int$240)) {
            return first_byte.numL($int$245) ? FOUR_INTEGER : MINUS_ONE_INTEGER;
        }
        return MINUS_ONE_INTEGER;
    }

    public static SubLObject utf8_vector_is_ascii_string_p(final SubLObject char_vector, SubLObject offset, SubLObject end) {
        if (offset == UNPROVIDED) {
            offset = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = subtract(length(char_vector), ONE_INTEGER);
        }
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = add(subtract(end, offset), ONE_INTEGER), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            if (NIL == utf8_char_is_ascii_p(char_vector, add(offset, i))) {
                return NIL;
            }
        }
        return T;
    }

    public static SubLObject utf8_char_is_ascii_p(final SubLObject char_vector, final SubLObject offset) {
        return numE(ONE_INTEGER, length_utf8_vector_codepoint(char_vector, offset));
    }

    public static SubLObject unicode_vector_is_ascii_string_p(final SubLObject unicode_vector, SubLObject offset, SubLObject end) {
        if (offset == UNPROVIDED) {
            offset = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = subtract(length(unicode_vector), ONE_INTEGER);
        }
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = add(subtract(end, offset), ONE_INTEGER), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            if (NIL == unicode_char_is_ascii_char_p(aref(unicode_vector, add(offset, i)))) {
                return NIL;
            }
        }
        return T;
    }

    public static SubLObject unicode_char_is_ascii_char_p(final SubLObject unicode_char) {
        if (NIL != unicode_character_p(unicode_char)) {
            return numLE(unicode_char, $int$127);
        }
        return NIL;
    }

    public static SubLObject utf8_char_p(final SubLObject char_vector, final SubLObject offset) {
        return plusp(length_utf8_vector_codepoint(char_vector, offset));
    }

    public static SubLObject get_unicode_char_at_or_after_offset(final SubLObject char_vector, final SubLObject offset) {
        assert NIL != vectorp(char_vector) : "Types.vectorp(char_vector) " + "CommonSymbols.NIL != Types.vectorp(char_vector) " + char_vector;
        SubLObject len;
        SubLObject index;
        for (len = length(char_vector), index = offset; index.numL(len) && logand($int$192, aref(char_vector, index)).numE($int$128); index = add(index, ONE_INTEGER)) {
        }
        if (index.numGE(len)) {
            return values(MINUS_ONE_INTEGER, len);
        }
        return get_unicode_char_at_offset(char_vector, index);
    }

    public static SubLObject get_unicode_char_at_or_before_offset(final SubLObject char_vector, final SubLObject offset) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != vectorp(char_vector) : "Types.vectorp(char_vector) " + "CommonSymbols.NIL != Types.vectorp(char_vector) " + char_vector;
        final SubLObject len = length(char_vector);
        SubLObject index = offset;
        if (index.numGE(len)) {
            return values(MINUS_ONE_INTEGER, MINUS_ONE_INTEGER);
        }
        while (index.numGE(ZERO_INTEGER) && logand($int$192, aref(char_vector, index)).numE($int$128)) {
            index = subtract(index, ONE_INTEGER);
        } 
        if (index.numL(ZERO_INTEGER)) {
            return values(MINUS_ONE_INTEGER, MINUS_ONE_INTEGER);
        }
        thread.resetMultipleValues();
        final SubLObject value = get_unicode_char_at_offset(char_vector, index);
        final SubLObject next_offset = thread.secondMultipleValue();
        final SubLObject len_$7 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return values(value, subtract(subtract(next_offset, len_$7), ONE_INTEGER));
    }

    public static SubLObject get_unicode_char_at_offset(final SubLObject char_vector, final SubLObject offset) {
        final SubLObject pcase_var;
        final SubLObject ulen = pcase_var = length_utf8_vector_codepoint(char_vector, offset);
        if (pcase_var.eql(ONE_INTEGER)) {
            return values(aref(char_vector, offset), add(offset, ONE_INTEGER), ulen);
        }
        if (pcase_var.eql(TWO_INTEGER)) {
            return values(add(ash(logand(aref(char_vector, offset), $int$31), SIX_INTEGER), logand(aref(char_vector, add(offset, ONE_INTEGER)), $int$63)), add(offset, TWO_INTEGER), ulen);
        }
        if (pcase_var.eql(THREE_INTEGER)) {
            return values(add(ash(logand(aref(char_vector, offset), FIFTEEN_INTEGER), TWELVE_INTEGER), ash(logand(aref(char_vector, add(offset, ONE_INTEGER)), $int$63), SIX_INTEGER), logand(aref(char_vector, add(offset, TWO_INTEGER)), $int$63)), add(offset, THREE_INTEGER), ulen);
        }
        if (pcase_var.eql(FOUR_INTEGER)) {
            return values(add(new SubLObject[]{ ash(logand(aref(char_vector, offset), SEVEN_INTEGER), EIGHTEEN_INTEGER), ash(logand(aref(char_vector, add(offset, ONE_INTEGER)), $int$63), TWELVE_INTEGER), ash(logand(aref(char_vector, add(offset, TWO_INTEGER)), $int$63), SIX_INTEGER), logand(aref(char_vector, add(offset, THREE_INTEGER)), $int$63) }), add(offset, FOUR_INTEGER), ulen);
        }
        if (pcase_var.eql(FIVE_INTEGER)) {
            return values(add(new SubLObject[]{ ash(logand(aref(char_vector, offset), THREE_INTEGER), $int$24), ash(logand(aref(char_vector, add(offset, ONE_INTEGER)), $int$63), EIGHTEEN_INTEGER), ash(logand(aref(char_vector, add(offset, TWO_INTEGER)), $int$63), TWELVE_INTEGER), ash(logand(aref(char_vector, add(offset, THREE_INTEGER)), $int$63), SIX_INTEGER), logand(aref(char_vector, add(offset, FOUR_INTEGER)), $int$63) }), add(offset, FOUR_INTEGER), ulen);
        }
        return values(MINUS_ONE_INTEGER, add(offset, ONE_INTEGER), ulen);
    }

    public static SubLObject string_from_char_list(final SubLObject list, SubLObject len) {
        if (len == UNPROVIDED) {
            len = length(list);
        }
        final SubLObject str = Strings.make_string(len, UNPROVIDED);
        SubLObject buffer = list;
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(len); i = add(i, ONE_INTEGER)) {
            set_aref(str, i, buffer.first());
            buffer = buffer.rest();
        }
        return str;
    }

    public static SubLObject unicode_to_html_escaped(final SubLObject unicode_vector, SubLObject escape_reserved_charsP) {
        if (escape_reserved_charsP == UNPROVIDED) {
            escape_reserved_charsP = T;
        }
        SubLObject html_string = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject elt;
            SubLObject hex;
            for (length = length(unicode_vector), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                elt = aref(unicode_vector, element_num);
                if ((elt.numL($int$32) || elt.numGE($int$128)) || ((NIL != escape_reserved_charsP) && (NIL != html_reserved_character_code_p(elt)))) {
                    princ($str81$__x, stream);
                    hex = number_utilities.convert_to_hexadecimal(elt);
                    if (length(hex).numLE(ONE_INTEGER)) {
                        princ(CHAR_0, stream);
                    }
                    princ(hex, stream);
                    princ(CHAR_semicolon, stream);
                } else {
                    princ(code_char(elt), stream);
                }
            }
            html_string = get_output_stream_string(stream);
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
        return html_string;
    }

    public static SubLObject unicode_string_to_utf8(final SubLObject unicode_string) {
        return unicode_display_to_utf8(unicode_vector_to_display(unicode_string_get_vector(unicode_string)));
    }

    public static SubLObject unicode_string_to_subl_string(final SubLObject unicode_string) {
        return display_to_subl_string(unicode_vector_to_display(unicode_string_get_vector(unicode_string)), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject unicode_display_to_utf8(final SubLObject string) {
        return html_escaped_to_utf8_string(unicode_display_to_html(string));
    }

    public static SubLObject unicode_display_to_html(final SubLObject string) {
        final SubLObject vector = display_to_unicode_vector(string);
        return unicode_to_html_escaped(vector, UNPROVIDED);
    }

    public static SubLObject html_escaped_to_utf8_vector(final SubLObject html_string) {
        final SubLObject uvect = html_escaped_to_unicode_vector(html_string);
        return NIL != uvect ? unicode_vector_to_utf8_vector(uvect, UNPROVIDED, UNPROVIDED) : NIL;
    }

    public static SubLObject utf8_string_to_unicode_vector(final SubLObject utf8_string) {
        return utf8_vector_to_unicode_vector(utf8_string_to_utf8_vector(utf8_string));
    }

    public static SubLObject html_escaped_to_unicode_vector(final SubLObject html_string) {
        return html_unescape_unicode_vector(utf8_string_to_unicode_vector(html_string));
    }

    public static SubLObject html_escaped_utf8_string_to_utf8_string(final SubLObject utf8_html_string) {
        return utf8_vector_to_utf8_string(unicode_vector_to_utf8_vector(html_escaped_to_unicode_vector(utf8_html_string), UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject html_unescape_unicode_vector(final SubLObject unicode_vector) {
        SubLObject unicode_char_stack = NIL;
        SubLObject state = $OPEN;
        SubLObject code = NIL;
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject i;
        SubLObject ch;
        SubLObject pcase_var;
        SubLObject pcase_var_$8;
        SubLObject pcase_var_$9;
        SubLObject pcase_var_$10;
        SubLObject raw_code_string;
        SubLObject code_string;
        SubLObject pcase_var_$11;
        SubLObject entname;
        SubLObject entval;
        for (length = length(unicode_vector), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            i = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            ch = aref(unicode_vector, i);
            pcase_var = state;
            if (pcase_var.eql($OPEN)) {
                pcase_var_$8 = ch;
                if (pcase_var_$8.eql($int$38)) {
                    state = $START_HTML_ESCAPE;
                } else
                    if (pcase_var_$8.eql($int$60)) {
                        unicode_char_stack = cons(ch, unicode_char_stack);
                        state = $INSIDE_TAG;
                    } else {
                        unicode_char_stack = cons(ch, unicode_char_stack);
                    }

            } else
                if (pcase_var.eql($INSIDE_TAG)) {
                    unicode_char_stack = cons(ch, unicode_char_stack);
                    if (ch.eql($int$62)) {
                        state = $OPEN;
                    }
                } else
                    if (pcase_var.eql($START_HTML_ESCAPE)) {
                        code = NIL;
                        pcase_var_$9 = ch;
                        if (pcase_var_$9.eql($int$35)) {
                            state = $HTML_NUMERIC_ESCAPE_START;
                        } else {
                            code = cons(ch, code);
                            state = $ENTITY_ESCAPE;
                        }
                    } else
                        if (pcase_var.eql($HTML_NUMERIC_ESCAPE_START)) {
                            if (ch.numE($int$120)) {
                                state = $HTML_HEXADECIMAL_ESCAPE;
                            } else {
                                if ((!ch.numGE($int$48)) || (!ch.numLE($int$57))) {
                                    return NIL;
                                }
                                state = $HTML_DECIMAL_ESCAPE;
                                code = cons(ch, code);
                            }
                        } else
                            if (pcase_var.eql($HTML_HEXADECIMAL_ESCAPE) || pcase_var.eql($HTML_DECIMAL_ESCAPE)) {
                                pcase_var_$10 = ch;
                                if (pcase_var_$10.eql($int$59)) {
                                    raw_code_string = string_from_char_list(Mapping.mapcar(CODE_CHAR, nreverse(code)), UNPROVIDED);
                                    code_string = (state == $HTML_HEXADECIMAL_ESCAPE) ? number_utilities.convert_hexadecimal_to_decimal(raw_code_string) : read_from_string(raw_code_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    unicode_char_stack = cons(code_string, unicode_char_stack);
                                    state = $OPEN;
                                } else {
                                    code = cons(ch, code);
                                }
                            } else
                                if (pcase_var.eql($ENTITY_ESCAPE)) {
                                    pcase_var_$11 = ch;
                                    if (pcase_var_$11.eql($int$59)) {
                                        state = $OPEN;
                                        entname = string_from_char_list(Mapping.mapcar(CODE_CHAR, nreverse(code)), UNPROVIDED);
                                        entval = map_character_entity_to_decimal_value(entname);
                                        if (NIL == entval) {
                                            return NIL;
                                        }
                                        unicode_char_stack = cons(entval, unicode_char_stack);
                                    } else {
                                        code = cons(ch, code);
                                    }
                                }





        }
        if (state != $OPEN) {
            return NIL;
        }
        return list_utilities.list2vector(nreverse(unicode_char_stack));
    }

    public static SubLObject utf8_vector_to_utf8_string(final SubLObject utf8_vector) {
        return vector_utilities.byte_vector_to_string(utf8_vector);
    }

    public static SubLObject utf8_string_to_utf8_vector(final SubLObject utf8_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject bad_char = find($int$256, utf8_string, symbol_function($sym98$__), symbol_function(CHAR_CODE), UNPROVIDED, UNPROVIDED);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != bad_char)) {
            Errors.error($str100$_S__code___S__is_not_a_valid_utf8, bad_char, char_code(bad_char));
        }
        return subl_string_to_char_code_vector(utf8_string);
    }

    public static SubLObject subl_string_to_char_code_vector(final SubLObject string) {
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        final SubLObject vector = make_vector(length(string), UNPROVIDED);
        SubLObject end_var_$12;
        SubLObject end_var;
        SubLObject i;
        SubLObject v_char;
        SubLObject code;
        for (end_var = end_var_$12 = length(string), i = NIL, i = ZERO_INTEGER; !i.numGE(end_var_$12); i = number_utilities.f_1X(i)) {
            v_char = Strings.sublisp_char(string, i);
            code = char_code(v_char);
            set_aref(vector, i, code);
        }
        return vector;
    }

    public static SubLObject utf8_string_to_subl_string(final SubLObject utf8_string) {
        return display_to_subl_string(utf8_string_to_display(utf8_string), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject utf8_string_to_display(final SubLObject utf8_string) {
        return unicode_vector_to_display(utf8_vector_to_unicode_vector(utf8_string_to_utf8_vector(utf8_string)));
    }

    public static SubLObject html_escaped_to_utf8_string(final SubLObject html_string) {
        if (NIL == find(CHAR_ampersand, html_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return html_string;
        }
        final SubLObject escvect = html_escaped_to_utf8_vector(html_string);
        if (NIL == escvect) {
            return NIL;
        }
        return utf8_vector_to_utf8_string(escvect);
    }

    public static SubLObject display_to_utf8_string(final SubLObject display) {
        final SubLObject unicode_vector = display_to_unicode_vector(display);
        final SubLObject escvect = (NIL != unicode_vector) ? unicode_vector_to_utf8_vector(unicode_vector, UNPROVIDED, UNPROVIDED) : NIL;
        return NIL != escvect ? utf8_vector_to_utf8_string(escvect) : NIL;
    }

    public static SubLObject html_escaped_to_display(final SubLObject html_string) {
        return utf8_string_to_display(html_escaped_to_utf8_string(html_string));
    }

    public static SubLObject map_character_entity_to_decimal_value(final SubLObject entity_name) {
        return list_utilities.alist_lookup_without_values($html_40_character_entity_table$.getGlobalValue(), entity_name, symbol_function(EQUAL), NIL);
    }

    public static SubLObject map_decimal_value_to_character_entity(final SubLObject char_code) {
        return list_utilities.alist_reverse_lookup_without_values($html_40_character_entity_table$.getGlobalValue(), char_code, symbol_function(EQL), NIL);
    }

    public static SubLObject unicode_string_concatenate(final SubLObject unicode_string_1, final SubLObject unicode_string_2) {
        final SubLObject vect1 = unicode_string_get_vector(unicode_string_1);
        final SubLObject length1 = length(vect1);
        final SubLObject vect2 = unicode_string_get_vector(unicode_string_2);
        final SubLObject length2 = length(vect2);
        final SubLObject new_vect = make_vector(add(length1, length2), UNPROVIDED);
        SubLObject vector_var = vect1;
        SubLObject backwardP_var = NIL;
        SubLObject length3;
        SubLObject v_iteration;
        SubLObject i;
        SubLObject code;
        for (length3 = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length3); v_iteration = add(v_iteration, ONE_INTEGER)) {
            i = (NIL != backwardP_var) ? subtract(length3, v_iteration, ONE_INTEGER) : v_iteration;
            code = aref(vector_var, i);
            set_aref(new_vect, i, code);
        }
        vector_var = vect2;
        backwardP_var = NIL;
        SubLObject j;
        for (length3 = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length3); v_iteration = add(v_iteration, ONE_INTEGER)) {
            i = (NIL != backwardP_var) ? subtract(length3, v_iteration, ONE_INTEGER) : v_iteration;
            code = aref(vector_var, i);
            j = add(i, length1);
            set_aref(new_vect, j, code);
        }
        return unicode_string_create(new_vect);
    }

    public static SubLObject cfasl_output_object_unicode_char_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_unicode_char(v_object, stream);
    }

    public static SubLObject cfasl_output_unicode_char(final SubLObject unicode_char, final SubLObject stream) {
        cfasl_raw_write_byte($cfasl_opcode_unicode_char$.getGlobalValue(), stream);
        final SubLObject utf8_vect = to_utf8_vector(unicode_char_uchar(unicode_char));
        final SubLObject length = length(utf8_vect);
        cfasl_output(length, stream);
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER)) {
            cfasl_raw_write_byte(aref(utf8_vect, i), stream);
        }
        return unicode_char;
    }

    public static SubLObject cfasl_input_unicode_char(final SubLObject stream) {
        final SubLObject length = cfasl_input_object(stream);
        SubLObject unicode_vector = NIL;
        SubLObject output_vector = NIL;
        unicode_vector = make_vector(length, UNPROVIDED);
        SubLObject i;
        SubLObject v_byte;
        for (i = NIL, i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER)) {
            v_byte = cfasl_raw_read_byte(stream);
            if (NIL != number_utilities.bytep(v_byte)) {
                set_aref(unicode_vector, i, v_byte);
            } else {
                Errors.error($str106$Invalid_unicode_character__expect, length, add(i, ONE_INTEGER));
            }
        }
        final SubLObject uchar = get_unicode_char_at_offset(unicode_vector, ZERO_INTEGER);
        output_vector = unicode_char_create(uchar);
        return output_vector;
    }

    public static SubLObject cfasl_output_object_unicode_string_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_unicode_string(v_object, stream);
    }

    public static SubLObject cfasl_output_unicode_string(final SubLObject unicode_string, final SubLObject stream) {
        cfasl_raw_write_byte($cfasl_opcode_unicode_string$.getGlobalValue(), stream);
        final SubLObject utf8_vect = unicode_vector_to_utf8_vector(unicode_string_vect(unicode_string), UNPROVIDED, UNPROVIDED);
        final SubLObject length = length(utf8_vect);
        cfasl_output(length, stream);
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER)) {
            cfasl_raw_write_byte(aref(utf8_vect, i), stream);
        }
        return unicode_string;
    }

    public static SubLObject cfasl_input_unicode_string(final SubLObject stream) {
        final SubLObject length = cfasl_input_object(stream);
        SubLObject unicode_vector = NIL;
        SubLObject output_vector = NIL;
        unicode_vector = make_vector(length, UNPROVIDED);
        SubLObject i;
        SubLObject v_byte;
        for (i = NIL, i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER)) {
            v_byte = cfasl_raw_read_byte(stream);
            if (NIL != number_utilities.bytep(v_byte)) {
                set_aref(unicode_vector, i, v_byte);
            } else {
                Errors.error($str106$Invalid_unicode_character__expect, length, add(i, ONE_INTEGER));
            }
        }
        final SubLObject vect = utf8_vector_to_unicode_vector(unicode_vector);
        output_vector = unicode_string_create(vect);
        return output_vector;
    }

    public static SubLObject declare_unicode_strings_file() {
        declareFunction(me, "unicode_char_print_function_trampoline", "UNICODE-CHAR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "unicode_char_p", "UNICODE-CHAR-P", 1, 0, false);
        new unicode_strings.$unicode_char_p$UnaryFunction();
        declareFunction(me, "unicode_char_uchar", "UNICODE-CHAR-UCHAR", 1, 0, false);
        declareFunction(me, "_csetf_unicode_char_uchar", "_CSETF-UNICODE-CHAR-UCHAR", 2, 0, false);
        declareFunction(me, "make_unicode_char", "MAKE-UNICODE-CHAR", 0, 1, false);
        declareFunction(me, "visit_defstruct_unicode_char", "VISIT-DEFSTRUCT-UNICODE-CHAR", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_unicode_char_method", "VISIT-DEFSTRUCT-OBJECT-UNICODE-CHAR-METHOD", 2, 0, false);
        declareFunction(me, "unicode_char_create", "UNICODE-CHAR-CREATE", 1, 0, false);
        declareFunction(me, "print_unicode_char", "PRINT-UNICODE-CHAR", 3, 0, false);
        declareFunction(me, "unicode_char_get_char", "UNICODE-CHAR-GET-CHAR", 1, 0, false);
        declareFunction(me, "unicode_char_set_char", "UNICODE-CHAR-SET-CHAR", 2, 0, false);
        declareFunction(me, "unicode_string_print_function_trampoline", "UNICODE-STRING-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "unicode_string_p", "UNICODE-STRING-P", 1, 0, false);
        new unicode_strings.$unicode_string_p$UnaryFunction();
        declareFunction(me, "unicode_string_vect", "UNICODE-STRING-VECT", 1, 0, false);
        declareFunction(me, "_csetf_unicode_string_vect", "_CSETF-UNICODE-STRING-VECT", 2, 0, false);
        declareFunction(me, "make_unicode_string", "MAKE-UNICODE-STRING", 0, 1, false);
        declareFunction(me, "visit_defstruct_unicode_string", "VISIT-DEFSTRUCT-UNICODE-STRING", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_unicode_string_method", "VISIT-DEFSTRUCT-OBJECT-UNICODE-STRING-METHOD", 2, 0, false);
        declareFunction(me, "unicode_string_create", "UNICODE-STRING-CREATE", 1, 0, false);
        declareFunction(me, "print_unicode_string", "PRINT-UNICODE-STRING", 3, 0, false);
        declareFunction(me, "unicode_string_get_vector", "UNICODE-STRING-GET-VECTOR", 1, 0, false);
        declareFunction(me, "unicode_string_set_vector", "UNICODE-STRING-SET-VECTOR", 2, 0, false);
        declareFunction(me, "unicode_vector_string_p", "UNICODE-VECTOR-STRING-P", 1, 0, false);
        declareFunction(me, "utf8_vector_string_p", "UTF8-VECTOR-STRING-P", 1, 0, false);
        declareFunction(me, "ascii_string_p", "ASCII-STRING-P", 1, 0, false);
        declareFunction(me, "non_ascii_string_p", "NON-ASCII-STRING-P", 1, 0, false);
        declareFunction(me, "ascii_char_p", "ASCII-CHAR-P", 1, 0, false);
        declareFunction(me, "non_ascii_char_p", "NON-ASCII-CHAR-P", 1, 0, false);
        declareFunction(me, "ascii_char_code_p", "ASCII-CHAR-CODE-P", 1, 0, false);
        declareFunction(me, "ascii_char_p_int", "ASCII-CHAR-P-INT", 1, 0, false);
        declareFunction(me, "identify_string_type", "IDENTIFY-STRING-TYPE", 1, 0, false);
        declareFunction(me, "display_vector_is_ascii_p", "DISPLAY-VECTOR-IS-ASCII-P", 1, 0, false);
        declareFunction(me, "display_vector_string_p", "DISPLAY-VECTOR-STRING-P", 1, 0, false);
        declareFunction(me, "display_to_unicode_vector", "DISPLAY-TO-UNICODE-VECTOR", 1, 0, false);
        declareFunction(me, "display_to_subl_string", "DISPLAY-TO-SUBL-STRING", 1, 2, false);
        declareFunction(me, "unicode_vector_to_display", "UNICODE-VECTOR-TO-DISPLAY", 1, 0, false);
        declareFunction(me, "element_vector", "ELEMENT-VECTOR", 2, 0, false);
        declareFunction(me, "unicode_vector_to_utf8_vector", "UNICODE-VECTOR-TO-UTF8-VECTOR", 1, 2, false);
        declareFunction(me, "utf8_vector_to_unicode_vector", "UTF8-VECTOR-TO-UNICODE-VECTOR", 1, 0, false);
        declareFunction(me, "unicode_char_code", "UNICODE-CHAR-CODE", 1, 0, false);
        declareFunction(me, "unicode_code_char", "UNICODE-CODE-CHAR", 1, 0, false);
        declareFunction(me, "unicode_character_p", "UNICODE-CHARACTER-P", 1, 0, false);
        declareFunction(me, "number_utf8_bytes", "NUMBER-UTF8-BYTES", 1, 0, false);
        declareFunction(me, "to_utf8_vector", "TO-UTF8-VECTOR", 1, 0, false);
        declareFunction(me, "print_utf_hex_list", "PRINT-UTF-HEX-LIST", 1, 0, false);
        declareFunction(me, "to_utc8_vector_internal", "TO-UTC8-VECTOR-INTERNAL", 3, 0, false);
        declareFunction(me, "length_utf8_vector_codepoint", "LENGTH-UTF8-VECTOR-CODEPOINT", 2, 0, false);
        declareFunction(me, "length_utf8_from_first_byte", "LENGTH-UTF8-FROM-FIRST-BYTE", 1, 0, false);
        declareFunction(me, "utf8_vector_is_ascii_string_p", "UTF8-VECTOR-IS-ASCII-STRING-P", 1, 2, false);
        declareFunction(me, "utf8_char_is_ascii_p", "UTF8-CHAR-IS-ASCII-P", 2, 0, false);
        declareFunction(me, "unicode_vector_is_ascii_string_p", "UNICODE-VECTOR-IS-ASCII-STRING-P", 1, 2, false);
        declareFunction(me, "unicode_char_is_ascii_char_p", "UNICODE-CHAR-IS-ASCII-CHAR-P", 1, 0, false);
        declareFunction(me, "utf8_char_p", "UTF8-CHAR-P", 2, 0, false);
        declareFunction(me, "get_unicode_char_at_or_after_offset", "GET-UNICODE-CHAR-AT-OR-AFTER-OFFSET", 2, 0, false);
        declareFunction(me, "get_unicode_char_at_or_before_offset", "GET-UNICODE-CHAR-AT-OR-BEFORE-OFFSET", 2, 0, false);
        declareFunction(me, "get_unicode_char_at_offset", "GET-UNICODE-CHAR-AT-OFFSET", 2, 0, false);
        declareFunction(me, "string_from_char_list", "STRING-FROM-CHAR-LIST", 1, 1, false);
        declareFunction(me, "unicode_to_html_escaped", "UNICODE-TO-HTML-ESCAPED", 1, 1, false);
        declareFunction(me, "unicode_string_to_utf8", "UNICODE-STRING-TO-UTF8", 1, 0, false);
        declareFunction(me, "unicode_string_to_subl_string", "UNICODE-STRING-TO-SUBL-STRING", 1, 0, false);
        declareFunction(me, "unicode_display_to_utf8", "UNICODE-DISPLAY-TO-UTF8", 1, 0, false);
        declareFunction(me, "unicode_display_to_html", "UNICODE-DISPLAY-TO-HTML", 1, 0, false);
        declareFunction(me, "html_escaped_to_utf8_vector", "HTML-ESCAPED-TO-UTF8-VECTOR", 1, 0, false);
        declareFunction(me, "utf8_string_to_unicode_vector", "UTF8-STRING-TO-UNICODE-VECTOR", 1, 0, false);
        declareFunction(me, "html_escaped_to_unicode_vector", "HTML-ESCAPED-TO-UNICODE-VECTOR", 1, 0, false);
        declareFunction(me, "html_escaped_utf8_string_to_utf8_string", "HTML-ESCAPED-UTF8-STRING-TO-UTF8-STRING", 1, 0, false);
        declareFunction(me, "html_unescape_unicode_vector", "HTML-UNESCAPE-UNICODE-VECTOR", 1, 0, false);
        declareFunction(me, "utf8_vector_to_utf8_string", "UTF8-VECTOR-TO-UTF8-STRING", 1, 0, false);
        declareFunction(me, "utf8_string_to_utf8_vector", "UTF8-STRING-TO-UTF8-VECTOR", 1, 0, false);
        declareFunction(me, "subl_string_to_char_code_vector", "SUBL-STRING-TO-CHAR-CODE-VECTOR", 1, 0, false);
        declareFunction(me, "utf8_string_to_subl_string", "UTF8-STRING-TO-SUBL-STRING", 1, 0, false);
        declareFunction(me, "utf8_string_to_display", "UTF8-STRING-TO-DISPLAY", 1, 0, false);
        declareFunction(me, "html_escaped_to_utf8_string", "HTML-ESCAPED-TO-UTF8-STRING", 1, 0, false);
        declareFunction(me, "display_to_utf8_string", "DISPLAY-TO-UTF8-STRING", 1, 0, false);
        declareFunction(me, "html_escaped_to_display", "HTML-ESCAPED-TO-DISPLAY", 1, 0, false);
        declareFunction(me, "map_character_entity_to_decimal_value", "MAP-CHARACTER-ENTITY-TO-DECIMAL-VALUE", 1, 0, false);
        declareFunction(me, "map_decimal_value_to_character_entity", "MAP-DECIMAL-VALUE-TO-CHARACTER-ENTITY", 1, 0, false);
        declareFunction(me, "unicode_string_concatenate", "UNICODE-STRING-CONCATENATE", 2, 0, false);
        declareFunction(me, "cfasl_output_object_unicode_char_method", "CFASL-OUTPUT-OBJECT-UNICODE-CHAR-METHOD", 2, 0, false);
        declareFunction(me, "cfasl_output_unicode_char", "CFASL-OUTPUT-UNICODE-CHAR", 2, 0, false);
        declareFunction(me, "cfasl_input_unicode_char", "CFASL-INPUT-UNICODE-CHAR", 1, 0, false);
        declareFunction(me, "cfasl_output_object_unicode_string_method", "CFASL-OUTPUT-OBJECT-UNICODE-STRING-METHOD", 2, 0, false);
        declareFunction(me, "cfasl_output_unicode_string", "CFASL-OUTPUT-UNICODE-STRING", 2, 0, false);
        declareFunction(me, "cfasl_input_unicode_string", "CFASL-INPUT-UNICODE-STRING", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_unicode_strings_file() {
        defconstant("MAX-UNICODE-VALUE", $int$1114111);
        defconstant("*DTP-UNICODE-CHAR*", UNICODE_CHAR);
        defconstant("*DTP-UNICODE-STRING*", UNICODE_STRING);
        deflexical("*DEFAULT-NON-ASCII-PLACEHOLDER-CHAR*", CHAR_tilde);
        defparameter("*DEFAULT-UNICODE-TO-ASCII-CODE-MAP*", $list51);
        deflexical("*HTML-40-CHARACTER-ENTITY-TABLE*", $list102);
        defconstant("*CFASL-OPCODE-UNICODE-CHAR*", $int$52);
        defconstant("*CFASL-OPCODE-UNICODE-STRING*", $int$53);
        return NIL;
    }

    public static SubLObject setup_unicode_strings_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_unicode_char$.getGlobalValue(), symbol_function(UNICODE_CHAR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list9);
        def_csetf(UNICODE_CHAR_UCHAR, _CSETF_UNICODE_CHAR_UCHAR);
        identity(UNICODE_CHAR);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_unicode_char$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_UNICODE_CHAR_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_unicode_string$.getGlobalValue(), symbol_function(UNICODE_STRING_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list30);
        def_csetf(UNICODE_STRING_VECT, _CSETF_UNICODE_STRING_VECT);
        identity(UNICODE_STRING);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_unicode_string$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_UNICODE_STRING_METHOD));
        register_cfasl_input_function($cfasl_opcode_unicode_char$.getGlobalValue(), CFASL_INPUT_UNICODE_CHAR);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_unicode_char$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_UNICODE_CHAR_METHOD));
        register_cfasl_input_function($cfasl_opcode_unicode_string$.getGlobalValue(), CFASL_INPUT_UNICODE_STRING);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_unicode_string$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_UNICODE_STRING_METHOD));
        define_test_case_table_int(HTML_ESCAPED_UTF8_STRING_TO_UTF8_STRING, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list117);
        return NIL;
    }

    private static SubLObject _constant_102_initializer() {
        return list(new SubLObject[]{ cons(makeString("AElig"), makeInteger(198)), cons(makeString("Aacute"), makeInteger(193)), cons(makeString("Acirc"), makeInteger(194)), cons(makeString("Agrave"), makeInteger(192)), cons(makeString("Alpha"), makeInteger(913)), cons(makeString("Aring"), makeInteger(197)), cons(makeString("Atilde"), makeInteger(195)), cons(makeString("Auml"), makeInteger(196)), cons(makeString("Beta"), makeInteger(914)), cons(makeString("Ccedil"), makeInteger(199)), cons(makeString("Chi"), makeInteger(935)), cons(makeString("Dagger"), makeInteger(8225)), cons(makeString("Delta"), makeInteger(916)), cons(makeString("ETH"), makeInteger(208)), cons(makeString("Eacute"), makeInteger(201)), cons(makeString("Ecirc"), makeInteger(202)), cons(makeString("Egrave"), makeInteger(200)), cons(makeString("Epsilon"), makeInteger(917)), cons(makeString("Eta"), makeInteger(919)), cons(makeString("Euml"), makeInteger(203)), cons(makeString("Gamma"), makeInteger(915)), cons(makeString("Iacute"), makeInteger(205)), cons(makeString("Icirc"), makeInteger(206)), cons(makeString("Igrave"), makeInteger(204)), cons(makeString("Iota"), makeInteger(921)), cons(makeString("Iuml"), makeInteger(207)), cons(makeString("Kappa"), makeInteger(922)), cons(makeString("Lambda"), makeInteger(923)), cons(makeString("Mu"), makeInteger(924)), cons(makeString("Ntilde"), makeInteger(209)), cons(makeString("Nu"), makeInteger(925)), cons(makeString("OElig"), makeInteger(338)), cons(makeString("Oacute"), makeInteger(211)), cons(makeString("Ocirc"), makeInteger(212)), cons(makeString("Ograve"), makeInteger(210)), cons(makeString("Omega"), makeInteger(937)), cons(makeString("Omicron"), makeInteger(927)), cons(makeString("Oslash"), makeInteger(216)), cons(makeString("Otilde"), makeInteger(213)), cons(makeString("Ouml"), makeInteger(214)), cons(makeString("Phi"), makeInteger(934)), cons(makeString("Pi"), makeInteger(928)), cons(makeString("Prime"), makeInteger(8243)), cons(makeString("Psi"), makeInteger(936)), cons(makeString("Rho"), makeInteger(929)), cons(makeString("Scaron"), makeInteger(352)), cons(makeString("Sigma"), makeInteger(931)), cons(makeString("THORN"), makeInteger(222)), cons(makeString("Tau"), makeInteger(932)), cons(makeString("Theta"), makeInteger(920)), cons(makeString("Uacute"), makeInteger(218)), cons(makeString("Ucirc"), makeInteger(219)), cons(makeString("Ugrave"), makeInteger(217)), cons(makeString("Upsilon"), makeInteger(933)), cons(makeString("Uuml"), makeInteger(220)), cons(makeString("Xi"), makeInteger(926)), cons(makeString("Yacute"), makeInteger(221)), cons(makeString("Yuml"), makeInteger(376)), cons(makeString("Zeta"), makeInteger(918)), cons(makeString("aacute"), makeInteger(225)), cons(makeString("acirc"), makeInteger(226)), cons(makeString("acute"), makeInteger(180)), cons(makeString("aelig"), makeInteger(230)), cons(makeString("agrave"), makeInteger(224)), cons(makeString("alefsym"), makeInteger(8501)), cons(makeString("alpha"), makeInteger(945)), cons(makeString("amp"), makeInteger(38)), cons(makeString("and"), makeInteger(8743)), cons(makeString("ang"), makeInteger(8736)), cons(makeString("aring"), makeInteger(229)), cons(makeString("asymp"), makeInteger(8776)), cons(makeString("atilde"), makeInteger(227)), cons(makeString("auml"), makeInteger(228)), cons(makeString("bdquo"), makeInteger(8222)), cons(makeString("beta"), makeInteger(946)), cons(makeString("brvbar"), makeInteger(166)), cons(makeString("bull"), makeInteger(8226)), cons(makeString("cap"), makeInteger(8745)), cons(makeString("ccedil"), makeInteger(231)), cons(makeString("cedil"), makeInteger(184)), cons(makeString("cent"), makeInteger(162)), cons(makeString("chi"), makeInteger(967)), cons(makeString("circ"), makeInteger(710)), cons(makeString("clubs"), makeInteger(9827)), cons(makeString("cong"), makeInteger(8773)), cons(makeString("copy"), makeInteger(169)), cons(makeString("crarr"), makeInteger(8629)), cons(makeString("cup"), makeInteger(8746)), cons(makeString("curren"), makeInteger(164)), cons(makeString("dArr"), makeInteger(8659)), cons(makeString("dagger"), makeInteger(8224)), cons(makeString("darr"), makeInteger(8595)), cons(makeString("deg"), makeInteger(176)), cons(makeString("delta"), makeInteger(948)), cons(makeString("diams"), makeInteger(9830)), cons(makeString("divide"), makeInteger(247)), cons(makeString("eacute"), makeInteger(233)), cons(makeString("ecirc"), makeInteger(234)), cons(makeString("egrave"), makeInteger(232)), cons(makeString("empty"), makeInteger(8709)), cons(makeString("emsp"), makeInteger(8195)), cons(makeString("ensp"), makeInteger(8194)), cons(makeString("epsilon"), makeInteger(949)), cons(makeString("equiv"), makeInteger(8801)), cons(makeString("eta"), makeInteger(951)), cons(makeString("eth"), makeInteger(240)), cons(makeString("euml"), makeInteger(235)), cons(makeString("euro"), makeInteger(8364)), cons(makeString("exist"), makeInteger(8707)), cons(makeString("fnof"), makeInteger(402)), cons(makeString("forall"), makeInteger(8704)), cons(makeString("frac12"), makeInteger(189)), cons(makeString("frac14"), makeInteger(188)), cons(makeString("frac34"), makeInteger(190)), cons(makeString("frasl"), makeInteger(8260)), cons(makeString("gamma"), makeInteger(947)), cons(makeString("ge"), makeInteger(8805)), cons(makeString("gt"), makeInteger(62)), cons(makeString("hArr"), makeInteger(8660)), cons(makeString("harr"), makeInteger(8596)), cons(makeString("hearts"), makeInteger(9829)), cons(makeString("hellip"), makeInteger(8230)), cons(makeString("iacute"), makeInteger(237)), cons(makeString("icirc"), makeInteger(238)), cons(makeString("iexcl"), makeInteger(161)), cons(makeString("igrave"), makeInteger(236)), cons(makeString("image"), makeInteger(8465)), cons(makeString("infin"), makeInteger(8734)), cons(makeString("int"), makeInteger(8747)), cons(makeString("iota"), makeInteger(953)), cons(makeString("iquest"), makeInteger(191)), cons(makeString("isin"), makeInteger(8712)), cons(makeString("iuml"), makeInteger(239)), cons(makeString("kappa"), makeInteger(954)), cons(makeString("lArr"), makeInteger(8656)), cons(makeString("lambda"), makeInteger(955)), cons(makeString("lang"), makeInteger(9001)), cons(makeString("laquo"), makeInteger(171)), cons(makeString("larr"), makeInteger(8592)), cons(makeString("lceil"), makeInteger(8968)), cons(makeString("ldquo"), makeInteger(8220)), cons(makeString("le"), makeInteger(8804)), cons(makeString("lfloor"), makeInteger(8970)), cons(makeString("lowast"), makeInteger(8727)), cons(makeString("loz"), makeInteger(9674)), cons(makeString("lrm"), makeInteger(8206)), cons(makeString("lsaquo"), makeInteger(8249)), cons(makeString("lsquo"), makeInteger(8216)), cons(makeString("lt"), makeInteger(60)), cons(makeString("macr"), makeInteger(175)), cons(makeString("mdash"), makeInteger(8212)), cons(makeString("micro"), makeInteger(181)), cons(makeString("middot"), makeInteger(183)), cons(makeString("minus"), makeInteger(8722)), cons(makeString("mu"), makeInteger(956)), cons(makeString("nabla"), makeInteger(8711)), cons(makeString("nbsp"), makeInteger(160)), cons(makeString("ndash"), makeInteger(8211)), cons(makeString("ne"), makeInteger(8800)), cons(makeString("ni"), makeInteger(8715)), cons(makeString("not"), makeInteger(172)), cons(makeString("notin"), makeInteger(8713)), cons(makeString("nsub"), makeInteger(8836)), cons(makeString("ntilde"), makeInteger(241)), cons(makeString("nu"), makeInteger(957)), cons(makeString("oacute"), makeInteger(243)), cons(makeString("ocirc"), makeInteger(244)), cons(makeString("oelig"), makeInteger(339)), cons(makeString("ograve"), makeInteger(242)), cons(makeString("oline"), makeInteger(8254)), cons(makeString("omega"), makeInteger(969)), cons(makeString("omicron"), makeInteger(959)), cons(makeString("oplus"), makeInteger(8853)), cons(makeString("or"), makeInteger(8744)), cons(makeString("ordf"), makeInteger(170)), cons(makeString("ordm"), makeInteger(186)), cons(makeString("oslash"), makeInteger(248)), cons(makeString("otilde"), makeInteger(245)), cons(makeString("otimes"), makeInteger(8855)), cons(makeString("ouml"), makeInteger(246)), cons(makeString("para"), makeInteger(182)), cons(makeString("part"), makeInteger(8706)), cons(makeString("permil"), makeInteger(8240)), cons(makeString("perp"), makeInteger(8869)), cons(makeString("phi"), makeInteger(966)), cons(makeString("pi"), makeInteger(960)), cons(makeString("piv"), makeInteger(982)), cons(makeString("plusmn"), makeInteger(177)), cons(makeString("pound"), makeInteger(163)), cons(makeString("prime"), makeInteger(8242)), cons(makeString("prod"), makeInteger(8719)), cons(makeString("prop"), makeInteger(8733)), cons(makeString("psi"), makeInteger(968)), cons(makeString("quot"), makeInteger(34)), cons(makeString("rArr"), makeInteger(8658)), cons(makeString("radic"), makeInteger(8730)), cons(makeString("rang"), makeInteger(9002)), cons(makeString("raquo"), makeInteger(187)), cons(makeString("rarr"), makeInteger(8594)), cons(makeString("rceil"), makeInteger(8969)), cons(makeString("rdquo"), makeInteger(8221)), cons(makeString("real"), makeInteger(8476)), cons(makeString("reg"), makeInteger(174)), cons(makeString("rfloor"), makeInteger(8971)), cons(makeString("rho"), makeInteger(961)), cons(makeString("rlm"), makeInteger(8207)), cons(makeString("rsaquo"), makeInteger(8250)), cons(makeString("rsquo"), makeInteger(8217)), cons(makeString("sbquo"), makeInteger(8218)), cons(makeString("scaron"), makeInteger(353)), cons(makeString("sdot"), makeInteger(8901)), cons(makeString("sect"), makeInteger(167)), cons(makeString("shy"), makeInteger(173)), cons(makeString("sigma"), makeInteger(963)), cons(makeString("sigmaf"), makeInteger(962)), cons(makeString("sim"), makeInteger(8764)), cons(makeString("spades"), makeInteger(9824)), cons(makeString("sub"), makeInteger(8834)), cons(makeString("sube"), makeInteger(8838)), cons(makeString("sum"), makeInteger(8721)), cons(makeString("sup"), makeInteger(8835)), cons(makeString("sup1"), makeInteger(185)), cons(makeString("sup2"), makeInteger(178)), cons(makeString("sup3"), makeInteger(179)), cons(makeString("supe"), makeInteger(8839)), cons(makeString("szlig"), makeInteger(223)), cons(makeString("tau"), makeInteger(964)), cons(makeString("there4"), makeInteger(8756)), cons(makeString("theta"), makeInteger(952)), cons(makeString("thetasym"), makeInteger(977)), cons(makeString("thinsp"), makeInteger(8201)), cons(makeString("thorn"), makeInteger(254)), cons(makeString("tilde"), makeInteger(732)), cons(makeString("times"), makeInteger(215)), cons(makeString("trade"), makeInteger(8482)), cons(makeString("uArr"), makeInteger(8657)), cons(makeString("uacute"), makeInteger(250)), cons(makeString("uarr"), makeInteger(8593)), cons(makeString("ucirc"), makeInteger(251)), cons(makeString("ugrave"), makeInteger(249)), cons(makeString("uml"), makeInteger(168)), cons(makeString("upsih"), makeInteger(978)), cons(makeString("upsilon"), makeInteger(965)), cons(makeString("uuml"), makeInteger(252)), cons(makeString("weierp"), makeInteger(8472)), cons(makeString("xi"), makeInteger(958)), cons(makeString("yacute"), makeInteger(253)), cons(makeString("yen"), makeInteger(165)), cons(makeString("yuml"), makeInteger(255)), cons(makeString("zeta"), makeInteger(950)), cons(makeString("zwj"), makeInteger(8205)), cons(makeString("zwnj"), makeInteger(8204)) });
    }

    @Override
    public void declareFunctions() {
        declare_unicode_strings_file();
    }

    @Override
    public void initializeVariables() {
        init_unicode_strings_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_unicode_strings_file();
    }

    static {































































































































    }

    public static final class $unicode_char_native extends SubLStructNative {
        public SubLObject $uchar;

        private static final SubLStructDeclNative structDecl;

        public $unicode_char_native() {
            this.$uchar = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$uchar;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$uchar = value;
        }

        static {
            structDecl = makeStructDeclNative(unicode_strings.$unicode_char_native.class, UNICODE_CHAR, UNICODE_CHAR_P, $list3, $list4, new String[]{ "$uchar" }, $list5, $list6, PRINT_UNICODE_CHAR);
        }
    }

    public static final class $unicode_char_p$UnaryFunction extends UnaryFunction {
        public $unicode_char_p$UnaryFunction() {
            super(extractFunctionNamed("UNICODE-CHAR-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return unicode_char_p(arg1);
        }
    }

    public static final class $unicode_string_native extends SubLStructNative {
        public SubLObject $vect;

        private static final SubLStructDeclNative structDecl;

        public $unicode_string_native() {
            this.$vect = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$vect;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$vect = value;
        }

        static {
            structDecl = makeStructDeclNative(unicode_strings.$unicode_string_native.class, UNICODE_STRING, UNICODE_STRING_P, $list24, $list25, new String[]{ "$vect" }, $list26, $list27, PRINT_UNICODE_STRING);
        }
    }

    public static final class $unicode_string_p$UnaryFunction extends UnaryFunction {
        public $unicode_string_p$UnaryFunction() {
            super(extractFunctionNamed("UNICODE-STRING-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return unicode_string_p(arg1);
        }
    }
}

/**
 * Total time: 410 ms
 */
