/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      UNICODE-NAUTS
 * source file: /cyc/top/cycl/unicode-nauts.lisp
 * created:     2019/07/03 17:37:23
 */
public final class unicode_nauts extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new unicode_nauts();

 public static final String myName = "com.cyc.cycjava.cycl.unicode_nauts";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $empty_unicode_naut$ = makeSymbol("*EMPTY-UNICODE-NAUT*");

    private static final SubLList $list0 = list(reader_make_constant_shell("UnicodeStringFn"), makeString(""));

    @LispMethod(comment = "Internal Constants")
    // Internal Constants
    private static final SubLSymbol UNICODE_NAUT_P = makeSymbol("UNICODE-NAUT-P");

    private static final SubLSymbol CONVERT_UNICODE_STRING_NAUT_TO_UTF8 = makeSymbol("CONVERT-UNICODE-STRING-NAUT-TO-UTF8");



    private static final SubLList $list4 = list(reader_make_constant_shell("UnicodeStringFn"), list($TEST, makeSymbol("DISPLAY-VECTOR-STRING-P")));

    private static final SubLSymbol DISPLAY_VECTOR_STRING_P = makeSymbol("DISPLAY-VECTOR-STRING-P");

    private static final SubLString $str6$_u = makeString("&u");

    private static final SubLSymbol $sym8$UNICODE_CHAR_CODE_EQUAL_ = makeSymbol("UNICODE-CHAR-CODE-EQUAL?");

    private static final SubLString $str9$Can_t_get_substring_from__S_to__S = makeString("Can't get substring from ~S to ~S of ~S");

    private static final SubLSymbol ASCII_CHAR_P = makeSymbol("ASCII-CHAR-P");

    private static final SubLSymbol CODE_CHAR = makeSymbol("CODE-CHAR");

    public static SubLObject empty_cycl_string_p(final SubLObject v_object) {
        return makeBoolean((NIL != string_utilities.empty_string_p(v_object)) || $empty_unicode_naut$.getGlobalValue().equal(v_object));
    }

    // Definitions
    /**
     * Used to convert CycL that might contain UnicodeStringFn nauts into UTF8
     */
    @LispMethod(comment = "Used to convert CycL that might contain UnicodeStringFn nauts into UTF8")
    public static final SubLObject convert_unicode_nauts_to_utf8_strings_alt(SubLObject sexpr) {
        return transform_list_utilities.transform(sexpr, UNICODE_NAUT_P, CONVERT_UNICODE_STRING_NAUT_TO_UTF8, UNPROVIDED);
    }

    // Definitions
    /**
     * Used to convert CycL that might contain UnicodeStringFn nauts into UTF8
     */
    @LispMethod(comment = "Used to convert CycL that might contain UnicodeStringFn nauts into UTF8")
    public static SubLObject convert_unicode_nauts_to_utf8_strings(final SubLObject sexpr) {
        return transform_list_utilities.transform(sexpr, UNICODE_NAUT_P, CONVERT_UNICODE_STRING_NAUT_TO_UTF8, UNPROVIDED);
    }

    public static final SubLObject convert_unicode_string_naut_to_utf8_alt(SubLObject obj) {
        return unicode_strings.unicode_display_to_utf8(cycl_utilities.formula_arg1(obj, UNPROVIDED));
    }

    public static SubLObject convert_unicode_string_naut_to_utf8(final SubLObject obj) {
        return unicode_strings.unicode_display_to_utf8(cycl_utilities.formula_arg1(obj, UNPROVIDED));
    }

    public static final SubLObject unicode_naut_p(SubLObject v_object) {
        return makeBoolean((NIL != possibly_naut_p(v_object)) && (NIL != pattern_match.tree_matches_pattern(v_object, $list_alt2)));
    }

    public static SubLObject unicode_naut_p(final SubLObject string, SubLObject strict) {
        if (strict == UNPROVIDED) {
            strict = NIL;
        }
        return makeBoolean(((NIL != cycl_grammar.cycl_nat_p(string)) && cycl_utilities.nat_functor(string).eql($$UnicodeStringFn)) && ((NIL == strict) || (NIL != pattern_match.tree_matches_pattern(string, $list4))));
    }

    public static final SubLObject make_unicode_naut_alt(SubLObject unicode_display) {
        SubLTrampolineFile.checkType(unicode_display, DISPLAY_VECTOR_STRING_P);
        return make_unary_formula($$UnicodeStringFn, unicode_display);
    }

    public static SubLObject make_unicode_naut(final SubLObject unicode_display) {
        assert NIL != unicode_strings.display_vector_string_p(unicode_display) : "! unicode_strings.display_vector_string_p(unicode_display) " + ("unicode_strings.display_vector_string_p(unicode_display) " + "CommonSymbols.NIL != unicode_strings.display_vector_string_p(unicode_display) ") + unicode_display;
        return make_unary_formula($$UnicodeStringFn, unicode_display);
    }

    public static SubLObject utf8_string_to_cycl_safe_string(final SubLObject utf8_string) {
        if (NIL != unicode_strings.ascii_string_p(utf8_string)) {
            return utf8_string;
        }
        return make_unicode_naut(unicode_strings.utf8_string_to_display(utf8_string));
    }

    public static SubLObject unicode_string_to_cycl_safe_string(final SubLObject unicode_string) {
        if (NIL != unicode_strings.unicode_string_p(unicode_string)) {
            return utf8_string_to_cycl_safe_string(unicode_strings.unicode_string_to_utf8(unicode_string));
        }
        return utf8_string_to_cycl_safe_string(unicode_string);
    }

    /**
     *
     *
     * @return STRING-OR-UNICODE-NAUT-P; CycL string version of DISPLAY-VECTOR-STRING.
     */
    @LispMethod(comment = "@return STRING-OR-UNICODE-NAUT-P; CycL string version of DISPLAY-VECTOR-STRING.")
    public static final SubLObject display_vector_string_to_cycl_safe_string_alt(SubLObject display_vector_string) {
        SubLTrampolineFile.checkType(display_vector_string, DISPLAY_VECTOR_STRING_P);
        if (NIL != search($str_alt5$_u, display_vector_string, symbol_function(CHAR_EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return com.cyc.cycjava.cycl.unicode_nauts.make_unicode_naut(display_vector_string);
        } else {
            return unicode_strings.display_to_subl_string(display_vector_string, UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     *
     *
     * @return STRING-OR-UNICODE-NAUT-P; CycL string version of DISPLAY-VECTOR-STRING.
     */
    @LispMethod(comment = "@return STRING-OR-UNICODE-NAUT-P; CycL string version of DISPLAY-VECTOR-STRING.")
    public static SubLObject display_vector_string_to_cycl_safe_string(final SubLObject display_vector_string) {
        assert NIL != unicode_strings.display_vector_string_p(display_vector_string) : "! unicode_strings.display_vector_string_p(display_vector_string) " + ("unicode_strings.display_vector_string_p(display_vector_string) " + "CommonSymbols.NIL != unicode_strings.display_vector_string_p(display_vector_string) ") + display_vector_string;
        if (NIL != search($str6$_u, display_vector_string, symbol_function(CHAR_EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return make_unicode_naut(display_vector_string);
        }
        return unicode_strings.display_to_subl_string(display_vector_string, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return STRING-OR-UNICODE-NAUT-P; CycL string version of STRING
     */
    @LispMethod(comment = "@return STRING-OR-UNICODE-NAUT-P; CycL string version of STRING")
    public static final SubLObject non_ascii_string_to_unicode_alt(SubLObject string) {
        return com.cyc.cycjava.cycl.unicode_nauts.make_unicode_naut(unicode_strings.utf8_string_to_display(string));
    }

    /**
     *
     *
     * @return STRING-OR-UNICODE-NAUT-P; CycL string version of STRING
     */
    @LispMethod(comment = "@return STRING-OR-UNICODE-NAUT-P; CycL string version of STRING")
    public static SubLObject non_ascii_string_to_unicode(final SubLObject string) {
        return make_unicode_naut(unicode_strings.utf8_string_to_display(string));
    }

    public static final SubLObject string_or_unicode_naut_p_alt(SubLObject v_object) {
        return makeBoolean(v_object.isString() || (NIL != com.cyc.cycjava.cycl.unicode_nauts.unicode_naut_p(v_object)));
    }

    public static SubLObject string_or_unicode_naut_p(final SubLObject v_object) {
        return makeBoolean(v_object.isString() || (NIL != unicode_naut_p(v_object, UNPROVIDED)));
    }

    /**
     *
     *
     * @return BOOLEANP; Is SUBSTRING a substring of STRING, where either or both
    of them is a #$UnicodeStringFn NAUT?
     * @unknown baxter
     */
    @LispMethod(comment = "@return BOOLEANP; Is SUBSTRING a substring of STRING, where either or both\r\nof them is a #$UnicodeStringFn NAUT?\r\n@unknown baxter")
    public static final SubLObject unicode_substringP_alt(SubLObject substring, SubLObject string, SubLObject case_sensitiveP) {
        {
            SubLObject subvector = com.cyc.cycjava.cycl.unicode_nauts.string_or_unicode_naut_to_unicode_vector(substring);
            SubLObject vector = com.cyc.cycjava.cycl.unicode_nauts.string_or_unicode_naut_to_unicode_vector(string);
            SubLObject test = (NIL != case_sensitiveP) ? ((SubLObject) (symbol_function(EQL))) : $sym7$UNICODE_CHAR_CODE_EQUAL_;
            return list_utilities.sublisp_boolean(search(subvector, vector, test, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
    }

    /**
     *
     *
     * @return BOOLEANP; Is SUBSTRING a substring of STRING, where either or both
    of them is a #$UnicodeStringFn NAUT?
     * @unknown baxter
     */
    @LispMethod(comment = "@return BOOLEANP; Is SUBSTRING a substring of STRING, where either or both\r\nof them is a #$UnicodeStringFn NAUT?\r\n@unknown baxter")
    public static SubLObject unicode_substringP(final SubLObject substring, final SubLObject string, final SubLObject case_sensitiveP) {
        final SubLObject subvector = string_or_unicode_naut_to_unicode_vector(substring);
        final SubLObject vector = string_or_unicode_naut_to_unicode_vector(string);
        final SubLObject test = (NIL != case_sensitiveP) ? symbol_function(EQL) : $sym8$UNICODE_CHAR_CODE_EQUAL_;
        return list_utilities.sublisp_boolean(search(subvector, vector, test, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject string_or_unicode_naut_to_unicode_vector_alt(SubLObject string) {
        if (NIL != com.cyc.cycjava.cycl.unicode_nauts.unicode_naut_p(string)) {
            return unicode_strings.display_to_unicode_vector(cycl_utilities.nat_arg1(string, UNPROVIDED));
        }
        {
            SubLObject as_html_escaped = unicode_strings.html_escaped_to_unicode_vector(string);
            return NIL != as_html_escaped ? ((SubLObject) (as_html_escaped)) : unicode_strings.display_to_unicode_vector(unicode_strings.utf8_string_to_display(string));
        }
    }

    public static SubLObject string_or_unicode_naut_to_unicode_vector(final SubLObject string) {
        if (NIL != unicode_naut_p(string, UNPROVIDED)) {
            return unicode_strings.display_to_unicode_vector(cycl_utilities.nat_arg1(string, UNPROVIDED));
        }
        final SubLObject as_html_escaped = unicode_strings.html_escaped_to_unicode_vector(string);
        return NIL != as_html_escaped ? as_html_escaped : unicode_strings.display_to_unicode_vector(unicode_strings.utf8_string_to_display(string));
    }

    /**
     *
     *
     * @return BOOLEANP; Do CODE1 and CODE2 represent the same character, modulo case?
     */
    @LispMethod(comment = "@return BOOLEANP; Do CODE1 and CODE2 represent the same character, modulo case?")
    public static final SubLObject unicode_char_code_equalP_alt(SubLObject code1, SubLObject code2) {
        if (code1.eql(code2)) {
            return T;
        }
        {
            SubLObject char1 = code_char(code1);
            SubLObject char2 = code_char(code2);
            return makeBoolean(((NIL != char1) && (NIL != char2)) && (NIL != char_equal(char1, char2)));
        }
    }

    /**
     *
     *
     * @return BOOLEANP; Do CODE1 and CODE2 represent the same character, modulo case?
     */
    @LispMethod(comment = "@return BOOLEANP; Do CODE1 and CODE2 represent the same character, modulo case?")
    public static SubLObject unicode_char_code_equalP(final SubLObject code1, final SubLObject code2) {
        if (code1.eql(code2)) {
            return T;
        }
        final SubLObject char1 = code_char(code1);
        final SubLObject char2 = code_char(code2);
        return makeBoolean(((NIL != char1) && (NIL != char2)) && (NIL != char_equal(char1, char2)));
    }

    /**
     *
     *
     * @return STRING-OR-UNICODE-NAUT-P; substring of STRING from START to END.
     * @unknown baxter
     */
    @LispMethod(comment = "@return STRING-OR-UNICODE-NAUT-P; substring of STRING from START to END.\r\n@unknown baxter")
    public static final SubLObject unicode_substring_alt(SubLObject string, SubLObject start, SubLObject end) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(string, UNICODE_NAUT_P);
            {
                SubLObject vector = unicode_strings.display_to_unicode_vector(cycl_utilities.nat_arg1(string, UNPROVIDED));
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!(((NIL != list_utilities.lengthGE(vector, start, UNPROVIDED)) && ((NIL == end) || (NIL != list_utilities.lengthGE(vector, end, UNPROVIDED)))) && end.numGE(start))) {
                        Errors.error($str_alt8$Can_t_get_substring_from__S_to__S, start, end, string);
                    }
                }
                {
                    SubLObject subvector = subseq(vector, start, end);
                    return NIL != list_utilities.find_if_not(ASCII_CHAR_P, subvector, CODE_CHAR, UNPROVIDED, UNPROVIDED) ? ((SubLObject) (com.cyc.cycjava.cycl.unicode_nauts.make_unicode_naut(unicode_strings.unicode_vector_to_display(subvector)))) : unicode_strings.utf8_vector_to_utf8_string(unicode_strings.unicode_vector_to_utf8_vector(subvector, UNPROVIDED, UNPROVIDED));
                }
            }
        }
    }

    /**
     *
     *
     * @return STRING-OR-UNICODE-NAUT-P; substring of STRING from START to END.
     * @unknown baxter
     */
    @LispMethod(comment = "@return STRING-OR-UNICODE-NAUT-P; substring of STRING from START to END.\r\n@unknown baxter")
    public static SubLObject unicode_substring(final SubLObject string, final SubLObject start, final SubLObject end) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != unicode_naut_p(string, UNPROVIDED) : "! unicode_nauts.unicode_naut_p(string, .UNPROVIDED) " + ("unicode_nauts.unicode_naut_p(string, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != unicode_nauts.unicode_naut_p(string, CommonSymbols.UNPROVIDED) ") + string;
        final SubLObject vector = unicode_strings.display_to_unicode_vector(cycl_utilities.nat_arg1(string, UNPROVIDED));
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (((NIL == list_utilities.lengthGE(vector, start, UNPROVIDED)) || ((NIL != end) && (NIL == list_utilities.lengthGE(vector, end, UNPROVIDED)))) || (!end.numGE(start)))) {
            Errors.error($str9$Can_t_get_substring_from__S_to__S, start, end, string);
        }
        final SubLObject subvector = subseq(vector, start, end);
        return NIL != list_utilities.find_if_not(ASCII_CHAR_P, subvector, CODE_CHAR, UNPROVIDED, UNPROVIDED) ? make_unicode_naut(unicode_strings.unicode_vector_to_display(subvector)) : unicode_strings.utf8_vector_to_utf8_string(unicode_strings.unicode_vector_to_utf8_vector(subvector, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject declare_unicode_nauts_file_alt() {
        declareFunction("convert_unicode_nauts_to_utf8_strings", "CONVERT-UNICODE-NAUTS-TO-UTF8-STRINGS", 1, 0, false);
        declareFunction("convert_unicode_string_naut_to_utf8", "CONVERT-UNICODE-STRING-NAUT-TO-UTF8", 1, 0, false);
        declareFunction("unicode_naut_p", "UNICODE-NAUT-P", 1, 0, false);
        declareFunction("make_unicode_naut", "MAKE-UNICODE-NAUT", 1, 0, false);
        declareFunction("display_vector_string_to_cycl_safe_string", "DISPLAY-VECTOR-STRING-TO-CYCL-SAFE-STRING", 1, 0, false);
        declareFunction("non_ascii_string_to_unicode", "NON-ASCII-STRING-TO-UNICODE", 1, 0, false);
        declareFunction("string_or_unicode_naut_p", "STRING-OR-UNICODE-NAUT-P", 1, 0, false);
        declareFunction("unicode_substringP", "UNICODE-SUBSTRING?", 3, 0, false);
        declareFunction("string_or_unicode_naut_to_unicode_vector", "STRING-OR-UNICODE-NAUT-TO-UNICODE-VECTOR", 1, 0, false);
        declareFunction("unicode_char_code_equalP", "UNICODE-CHAR-CODE-EQUAL?", 2, 0, false);
        declareFunction("unicode_substring", "UNICODE-SUBSTRING", 3, 0, false);
        return NIL;
    }

    public static SubLObject declare_unicode_nauts_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("empty_cycl_string_p", "EMPTY-CYCL-STRING-P", 1, 0, false);
            declareFunction("convert_unicode_nauts_to_utf8_strings", "CONVERT-UNICODE-NAUTS-TO-UTF8-STRINGS", 1, 0, false);
            declareFunction("convert_unicode_string_naut_to_utf8", "CONVERT-UNICODE-STRING-NAUT-TO-UTF8", 1, 0, false);
            declareFunction("unicode_naut_p", "UNICODE-NAUT-P", 1, 1, false);
            declareFunction("make_unicode_naut", "MAKE-UNICODE-NAUT", 1, 0, false);
            declareFunction("utf8_string_to_cycl_safe_string", "UTF8-STRING-TO-CYCL-SAFE-STRING", 1, 0, false);
            declareFunction("unicode_string_to_cycl_safe_string", "UNICODE-STRING-TO-CYCL-SAFE-STRING", 1, 0, false);
            declareFunction("display_vector_string_to_cycl_safe_string", "DISPLAY-VECTOR-STRING-TO-CYCL-SAFE-STRING", 1, 0, false);
            declareFunction("non_ascii_string_to_unicode", "NON-ASCII-STRING-TO-UNICODE", 1, 0, false);
            declareFunction("string_or_unicode_naut_p", "STRING-OR-UNICODE-NAUT-P", 1, 0, false);
            declareFunction("unicode_substringP", "UNICODE-SUBSTRING?", 3, 0, false);
            declareFunction("string_or_unicode_naut_to_unicode_vector", "STRING-OR-UNICODE-NAUT-TO-UNICODE-VECTOR", 1, 0, false);
            declareFunction("unicode_char_code_equalP", "UNICODE-CHAR-CODE-EQUAL?", 2, 0, false);
            declareFunction("unicode_substring", "UNICODE-SUBSTRING", 3, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("unicode_naut_p", "UNICODE-NAUT-P", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_unicode_nauts_file_Previous() {
        declareFunction("empty_cycl_string_p", "EMPTY-CYCL-STRING-P", 1, 0, false);
        declareFunction("convert_unicode_nauts_to_utf8_strings", "CONVERT-UNICODE-NAUTS-TO-UTF8-STRINGS", 1, 0, false);
        declareFunction("convert_unicode_string_naut_to_utf8", "CONVERT-UNICODE-STRING-NAUT-TO-UTF8", 1, 0, false);
        declareFunction("unicode_naut_p", "UNICODE-NAUT-P", 1, 1, false);
        declareFunction("make_unicode_naut", "MAKE-UNICODE-NAUT", 1, 0, false);
        declareFunction("utf8_string_to_cycl_safe_string", "UTF8-STRING-TO-CYCL-SAFE-STRING", 1, 0, false);
        declareFunction("unicode_string_to_cycl_safe_string", "UNICODE-STRING-TO-CYCL-SAFE-STRING", 1, 0, false);
        declareFunction("display_vector_string_to_cycl_safe_string", "DISPLAY-VECTOR-STRING-TO-CYCL-SAFE-STRING", 1, 0, false);
        declareFunction("non_ascii_string_to_unicode", "NON-ASCII-STRING-TO-UNICODE", 1, 0, false);
        declareFunction("string_or_unicode_naut_p", "STRING-OR-UNICODE-NAUT-P", 1, 0, false);
        declareFunction("unicode_substringP", "UNICODE-SUBSTRING?", 3, 0, false);
        declareFunction("string_or_unicode_naut_to_unicode_vector", "STRING-OR-UNICODE-NAUT-TO-UNICODE-VECTOR", 1, 0, false);
        declareFunction("unicode_char_code_equalP", "UNICODE-CHAR-CODE-EQUAL?", 2, 0, false);
        declareFunction("unicode_substring", "UNICODE-SUBSTRING", 3, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt2 = list(reader_make_constant_shell("UnicodeStringFn"), list($TEST, makeSymbol("DISPLAY-VECTOR-STRING-P")));

    static private final SubLString $str_alt5$_u = makeString("&u");

    static private final SubLSymbol $sym7$UNICODE_CHAR_CODE_EQUAL_ = makeSymbol("UNICODE-CHAR-CODE-EQUAL?");

    static private final SubLString $str_alt8$Can_t_get_substring_from__S_to__S = makeString("Can't get substring from ~S to ~S of ~S");

    public static SubLObject init_unicode_nauts_file() {
        defconstant("*EMPTY-UNICODE-NAUT*", $list0);
        return NIL;
    }

    public static SubLObject setup_unicode_nauts_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_unicode_nauts_file();
    }

    @Override
    public void initializeVariables() {
        init_unicode_nauts_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_unicode_nauts_file();
    }

    static {
    }
}

/**
 * Total time: 94 ms
 */
