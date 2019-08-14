/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.define_obsolete_register;
import static com.cyc.cycjava.cycl.control_vars.$cyc_package$;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.el_utilities.correct_variable;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_colon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_question;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.charE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.upper_case_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.$package$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.search;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.gensym;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.gentemp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_keyword;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.keywordp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.symbolp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CYCL-VARIABLES
 * source file: /cyc/top/cycl/cycl-variables.lisp
 * created:     2019/07/03 17:37:22
 */
public final class cycl_variables extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new cycl_variables();

 public static final String myName = "com.cyc.cycjava.cycl.cycl_variables";


    // defconstant
    // Definitions
    @LispMethod(comment = "The character used as the first character of an EL variable\'s name.\ndefconstant")
    private static final SubLSymbol $el_variable_prefix_char$ = makeSymbol("*EL-VARIABLE-PREFIX-CHAR*");

    // defconstant
    @LispMethod(comment = "The string used as the first character of an EL variable\'s name.\ndefconstant")
    /**
     * The string used as the first character of an EL variable's name.
     */
    private static final SubLSymbol $el_variable_prefix_string$ = makeSymbol("*EL-VARIABLE-PREFIX-STRING*");

    // defconstant
    // The character used as the hyphen character in an EL variable's name.
    /**
     * The character used as the hyphen character in an EL variable's name.
     */
    @LispMethod(comment = "The character used as the hyphen character in an EL variable\'s name.\ndefconstant")
    private static final SubLSymbol $el_variable_hyphen_char$ = makeSymbol("*EL-VARIABLE-HYPHEN-CHAR*");

    // defconstant
    /**
     * The string which is deemed as an invalid hypen sequence in an EL variable's
     * name.
     */
    @LispMethod(comment = "The string which is deemed as an invalid hypen sequence in an EL variable\'s\r\nname.\ndefconstant\nThe string which is deemed as an invalid hypen sequence in an EL variable\'s\nname.")
    private static final SubLSymbol $el_variable_invalid_hyphen_sequence$ = makeSymbol("*EL-VARIABLE-INVALID-HYPHEN-SEQUENCE*");

    // defconstant
    /**
     * The current filter for valid el variable name in regular expression format.
     */
    @LispMethod(comment = "The current filter for valid el variable name in regular expression format.\ndefconstant")
    public static final SubLSymbol $valid_el_var_regular_expression$ = makeSymbol("*VALID-EL-VAR-REGULAR-EXPRESSION*");

    // defconstant
    // The character used as the first character of a keyword variable's name.
    /**
     * The character used as the first character of a keyword variable's name.
     */
    @LispMethod(comment = "The character used as the first character of a keyword variable\'s name.\ndefconstant")
    private static final SubLSymbol $keyword_variable_prefix_char$ = makeSymbol("*KEYWORD-VARIABLE-PREFIX-CHAR*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str0$_ = makeString("?");

    static private final SubLString $str1$______________A_Z____A_Z___0_9___ = makeString("([?]|[?][?]) [A-Z] ([A-Z]|[0-9])* ([-] ([A-Z]|[0-9])+)*");

    static private final SubLSymbol $sym2$EL_VAR_ = makeSymbol("EL-VAR?");

    static private final SubLList $list3 = list(makeSymbol("OBJECT"));

    static private final SubLString $str4$Return_T_iff_OBJECT_is_a_symbol_w = makeString("Return T iff OBJECT is a symbol which can be interpreted as an EL variable.");

    static private final SubLList $list5 = list(makeSymbol("BOOLEANP"));

    private static final SubLSymbol INVALID_VARIABLE_NAME_CHAR = makeSymbol("INVALID-VARIABLE-NAME-CHAR");

    static private final SubLSymbol $sym8$STRING_ = makeSymbol("STRING=");

    private static final SubLInteger $int$200 = makeInteger(200);

    static private final SubLString $str10$_C_A = makeString("~C~A");

    static private final SubLSymbol $sym11$VARIABLE_SYMBOL_ = makeSymbol("VARIABLE-SYMBOL?");

    static private final SubLList $list12 = list(makeSymbol("EL-VAR?"));

    static private final SubLSymbol $sym13$HL_VAR_ = makeSymbol("HL-VAR?");

    static private final SubLSymbol $sym14$TL_VAR_ = makeSymbol("TL-VAR?");

    static private final SubLSymbol $sym15$KEYWORD_VAR_ = makeSymbol("KEYWORD-VAR?");

    static private final SubLSymbol $sym16$GENERIC_ARG_VAR_ = makeSymbol("GENERIC-ARG-VAR?");

    static private final SubLSymbol $sym18$VALID_EL_VAR_NAME_ = makeSymbol("VALID-EL-VAR-NAME?");

    private static final SubLList $list25 = list(new SubLObject[]{ list(list(makeString("FOO")), NIL), list(list(makeString("?FOO")), T), list(list(makeString("??FOO")), T), list(list(makeString("???FOO")), NIL), list(list(makeString("?X")), T), list(list(makeString("?x")), NIL), list(list(makeString("??X")), T), list(list(makeString("??x")), NIL), list(list(makeString("?1")), NIL), list(list(makeString("")), NIL), list(list(makeString("?")), NIL), list(list(makeString("??")), NIL), list(list(makeString("???")), NIL) });

    /**
     *
     *
     * @return characterp; The character used as the first character of an EL variable's name.
     */
    @LispMethod(comment = "@return characterp; The character used as the first character of an EL variable\'s name.")
    public static final SubLObject el_variable_prefix_char_alt() {
        return $el_variable_prefix_char$.getGlobalValue();
    }

    /**
     *
     *
     * @return characterp; The character used as the first character of an EL variable's name.
     */
    @LispMethod(comment = "@return characterp; The character used as the first character of an EL variable\'s name.")
    public static SubLObject el_variable_prefix_char() {
        return $el_variable_prefix_char$.getGlobalValue();
    }

    /**
     *
     *
     * @return characterp; The character used as the first character of an EL variable's name.
     */
    @LispMethod(comment = "@return characterp; The character used as the first character of an EL variable\'s name.")
    public static final SubLObject el_variable_prefix_string_alt() {
        return $el_variable_prefix_string$.getGlobalValue();
    }

    /**
     *
     *
     * @return characterp; The character used as the first character of an EL variable's name.
     */
    @LispMethod(comment = "@return characterp; The character used as the first character of an EL variable\'s name.")
    public static SubLObject el_variable_prefix_string() {
        return $el_variable_prefix_string$.getGlobalValue();
    }

    /**
     *
     *
     * @return characterp; The character used as the hyphen character in an EL variable's name.
     */
    @LispMethod(comment = "@return characterp; The character used as the hyphen character in an EL variable\'s name.")
    public static final SubLObject el_variable_hyphen_char_alt() {
        return $el_variable_hyphen_char$.getGlobalValue();
    }

    /**
     *
     *
     * @return characterp; The character used as the hyphen character in an EL variable's name.
     */
    @LispMethod(comment = "@return characterp; The character used as the hyphen character in an EL variable\'s name.")
    public static SubLObject el_variable_hyphen_char() {
        return $el_variable_hyphen_char$.getGlobalValue();
    }

    /**
     *
     *
     * @return boolean; Returns T if OBJECT is the character used as the first character of an EL variable's name.
     */
    @LispMethod(comment = "@return boolean; Returns T if OBJECT is the character used as the first character of an EL variable\'s name.")
    public static final SubLObject el_variable_prefix_charP_alt(SubLObject v_object) {
        return charE(v_object, com.cyc.cycjava.cycl.cycl_variables.el_variable_prefix_char());
    }

    /**
     *
     *
     * @return boolean; Returns T if OBJECT is the character used as the first character of an EL variable's name.
     */
    @LispMethod(comment = "@return boolean; Returns T if OBJECT is the character used as the first character of an EL variable\'s name.")
    public static SubLObject el_variable_prefix_charP(final SubLObject v_object) {
        return charE(v_object, el_variable_prefix_char());
    }

    /**
     *
     *
     * @return boolean; Returns T if STRING begins with ?.  STRING assumed to be stringp.
     */
    @LispMethod(comment = "@return boolean; Returns T if STRING begins with ?.  STRING assumed to be stringp.")
    public static final SubLObject has_el_variable_prefixP_alt(SubLObject string) {
        return com.cyc.cycjava.cycl.cycl_variables.el_variable_prefix_charP(Strings.sublisp_char(string, ZERO_INTEGER));
    }

    /**
     *
     *
     * @return boolean; Returns T if STRING begins with ?.  STRING assumed to be stringp.
     */
    @LispMethod(comment = "@return boolean; Returns T if STRING begins with ?.  STRING assumed to be stringp.")
    public static SubLObject has_el_variable_prefixP(final SubLObject string) {
        return el_variable_prefix_charP(Strings.sublisp_char(string, ZERO_INTEGER));
    }

    /**
     *
     *
     * @return boolean; Returns T if STRING begins with ??.  STRING assumed to be stringp.
     */
    @LispMethod(comment = "@return boolean; Returns T if STRING begins with ??.  STRING assumed to be stringp.")
    public static final SubLObject has_dont_care_var_prefixP_alt(SubLObject string) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.cycl_variables.el_variable_prefix_charP(Strings.sublisp_char(string, ZERO_INTEGER))) && (NIL != com.cyc.cycjava.cycl.cycl_variables.el_variable_prefix_charP(Strings.sublisp_char(string, ONE_INTEGER))));
    }

    /**
     *
     *
     * @return boolean; Returns T if STRING begins with ??.  STRING assumed to be stringp.
     */
    @LispMethod(comment = "@return boolean; Returns T if STRING begins with ??.  STRING assumed to be stringp.")
    public static SubLObject has_dont_care_var_prefixP(final SubLObject string) {
        return makeBoolean((NIL != el_variable_prefix_charP(Strings.sublisp_char(string, ZERO_INTEGER))) && (NIL != el_variable_prefix_charP(Strings.sublisp_char(string, ONE_INTEGER))));
    }

    /**
     *
     *
     * @return boolean; Returns T if OBJECT is the character used as the hyphen character in an EL variable's name.
     */
    @LispMethod(comment = "@return boolean; Returns T if OBJECT is the character used as the hyphen character in an EL variable\'s name.")
    public static final SubLObject el_variable_hyphen_charP_alt(SubLObject v_object) {
        return charE(v_object, com.cyc.cycjava.cycl.cycl_variables.el_variable_hyphen_char());
    }

    /**
     *
     *
     * @return boolean; Returns T if OBJECT is the character used as the hyphen character in an EL variable's name.
     */
    @LispMethod(comment = "@return boolean; Returns T if OBJECT is the character used as the hyphen character in an EL variable\'s name.")
    public static SubLObject el_variable_hyphen_charP(final SubLObject v_object) {
        return charE(v_object, el_variable_hyphen_char());
    }

    public static final SubLObject el_variable_charP_alt(SubLObject v_char) {
        return makeBoolean(((NIL != string_utilities.upper_case_alphanumeric_p(v_char)) || (NIL != com.cyc.cycjava.cycl.cycl_variables.el_variable_hyphen_charP(v_char))) || (NIL != com.cyc.cycjava.cycl.cycl_variables.el_variable_prefix_charP(v_char)));
    }

    public static SubLObject el_variable_charP(final SubLObject v_char) {
        return makeBoolean(((NIL != string_utilities.upper_case_alphanumeric_p(v_char)) || (NIL != el_variable_hyphen_charP(v_char))) || (NIL != el_variable_prefix_charP(v_char)));
    }

    /**
     * Return T iff OBJECT is a symbol which can be interpreted as an EL variable.
     */
    @LispMethod(comment = "Return T iff OBJECT is a symbol which can be interpreted as an EL variable.")
    public static final SubLObject el_varP_alt(SubLObject v_object) {
        return makeBoolean(((v_object.isSymbol() && (NIL != v_object)) && (!v_object.isKeyword())) && (NIL != com.cyc.cycjava.cycl.cycl_variables.el_var_nameP(com.cyc.cycjava.cycl.cycl_variables.el_var_name(v_object))));
    }

    /**
     * Return T iff OBJECT is a symbol which can be interpreted as an EL variable.
     */
    @LispMethod(comment = "Return T iff OBJECT is a symbol which can be interpreted as an EL variable.")
    public static SubLObject el_varP(final SubLObject v_object) {
        return makeBoolean(((v_object.isSymbol() && (NIL != v_object)) && (!v_object.isKeyword())) && (NIL != el_var_nameP(el_var_name(v_object))));
    }

    /**
     *
     *
     * @return boolean; t iff OBJECT is a don't-care variable,
    which by convention begins with ??.
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT is a don\'t-care variable,\r\nwhich by convention begins with ??.")
    public static final SubLObject dont_care_varP_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.cycl_variables.el_varP(v_object)) && (NIL != com.cyc.cycjava.cycl.cycl_variables.el_var_nameP(subseq(com.cyc.cycjava.cycl.cycl_variables.el_var_name(v_object), ONE_INTEGER, UNPROVIDED))));
    }

    /**
     *
     *
     * @return boolean; t iff OBJECT is a don't-care variable,
    which by convention begins with ??.
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT is a don\'t-care variable,\r\nwhich by convention begins with ??.")
    public static SubLObject dont_care_varP(final SubLObject v_object) {
        return makeBoolean((NIL != el_varP(v_object)) && (NIL != el_var_nameP(subseq(el_var_name(v_object), ONE_INTEGER, UNPROVIDED))));
    }

    /**
     *
     *
     * @return stringp; the name of EL-VAR.  Includes the prefix character.
     */
    @LispMethod(comment = "@return stringp; the name of EL-VAR.  Includes the prefix character.")
    public static final SubLObject el_var_name_alt(SubLObject el_var) {
        SubLTrampolineFile.checkType(el_var, SYMBOLP);
        return symbol_name(el_var);
    }

    /**
     *
     *
     * @return stringp; the name of EL-VAR.  Includes the prefix character.
     */
    @LispMethod(comment = "@return stringp; the name of EL-VAR.  Includes the prefix character.")
    public static SubLObject el_var_name(final SubLObject el_var) {
        assert NIL != symbolp(el_var) : "! symbolp(el_var) " + ("Types.symbolp(el_var) " + "CommonSymbols.NIL != Types.symbolp(el_var) ") + el_var;
        return symbol_name(el_var);
    }

    public static final SubLObject el_var_nameP_alt(SubLObject v_object) {
        return makeBoolean((v_object.isString() && (NIL != list_utilities.lengthG(v_object, ONE_INTEGER, UNPROVIDED))) && (NIL != com.cyc.cycjava.cycl.cycl_variables.has_el_variable_prefixP(v_object)));
    }

    public static SubLObject el_var_nameP(final SubLObject v_object) {
        return makeBoolean((v_object.isString() && (NIL != list_utilities.lengthG(v_object, ONE_INTEGER, UNPROVIDED))) && (NIL != has_el_variable_prefixP(v_object)));
    }

    public static final SubLObject make_el_var_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.cycl_variables.intern_el_var(v_object);
    }

    public static SubLObject make_el_var(final SubLObject v_object) {
        final SubLObject el_var = intern_el_var(v_object);
        return el_var;
    }

    public static final SubLObject make_el_var_name_alt(SubLObject v_object) {
        if (NIL != com.cyc.cycjava.cycl.cycl_variables.el_var_nameP(v_object)) {
            return Strings.string_upcase(v_object, UNPROVIDED, UNPROVIDED);
        } else {
            return Strings.string_upcase(cconcatenate(format_nil.format_nil_a_no_copy(com.cyc.cycjava.cycl.cycl_variables.el_variable_prefix_string()), format_nil.format_nil_a_no_copy(v_object)), UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject make_el_var_name(final SubLObject v_object) {
        if (NIL != el_var_nameP(v_object)) {
            return Strings.string_upcase(v_object, UNPROVIDED, UNPROVIDED);
        }
        return Strings.string_upcase(cconcatenate(format_nil.format_nil_a_no_copy(el_variable_prefix_string()), format_nil.format_nil_a_no_copy(v_object)), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return el-var-name?; a stringified form of OBJECT.
    Tries to correct the string into a valid EL variable name string if possible.
     */
    @LispMethod(comment = "@return el-var-name?; a stringified form of OBJECT.\r\nTries to correct the string into a valid EL variable name string if possible.")
    public static final SubLObject possibly_make_valid_el_var_name_alt(SubLObject v_object) {
        if (NIL != com.cyc.cycjava.cycl.cycl_variables.valid_el_var_nameP(v_object)) {
            return v_object;
        } else {
            {
                SubLObject validated_name = correct_variable(v_object);
                if (NIL != validated_name) {
                    return validated_name;
                } else {
                    return com.cyc.cycjava.cycl.cycl_variables.make_el_var_name(v_object);
                }
            }
        }
    }

    /**
     *
     *
     * @return el-var-name?; a stringified form of OBJECT.
    Tries to correct the string into a valid EL variable name string if possible.
     */
    @LispMethod(comment = "@return el-var-name?; a stringified form of OBJECT.\r\nTries to correct the string into a valid EL variable name string if possible.")
    public static SubLObject possibly_make_valid_el_var_name(final SubLObject v_object) {
        if (NIL != valid_el_var_nameP(v_object)) {
            return v_object;
        }
        final SubLObject validated_name = correct_variable(v_object);
        if (NIL != validated_name) {
            return validated_name;
        }
        return make_el_var_name(v_object);
    }

    /**
     *
     *
     * @return el-var?; an EL variable based on the name of OBJECT.
    Tries to correct the variable into a valid EL variable if possible.
     */
    @LispMethod(comment = "@return el-var?; an EL variable based on the name of OBJECT.\r\nTries to correct the variable into a valid EL variable if possible.")
    public static final SubLObject possibly_make_valid_el_var_alt(SubLObject v_object) {
        return intern(com.cyc.cycjava.cycl.cycl_variables.possibly_make_valid_el_var_name(v_object), $cyc_package$.getGlobalValue());
    }

    /**
     *
     *
     * @return el-var?; an EL variable based on the name of OBJECT.
    Tries to correct the variable into a valid EL variable if possible.
     */
    @LispMethod(comment = "@return el-var?; an EL variable based on the name of OBJECT.\r\nTries to correct the variable into a valid EL variable if possible.")
    public static SubLObject possibly_make_valid_el_var(final SubLObject v_object) {
        return intern(possibly_make_valid_el_var_name(v_object), $cyc_package$.getGlobalValue());
    }

    /**
     *
     *
     * @return boolean; Returns T if OBJECT is a character which could not
    possibly be a valid character in an EL variable name.
     */
    @LispMethod(comment = "@return boolean; Returns T if OBJECT is a character which could not\r\npossibly be a valid character in an EL variable name.")
    public static final SubLObject invalid_variable_name_char_alt(SubLObject v_object) {
        return makeBoolean((NIL == string_utilities.upper_case_alphanumeric_p(v_object)) && (NIL == com.cyc.cycjava.cycl.cycl_variables.el_variable_hyphen_charP(v_object)));
    }

    /**
     *
     *
     * @return boolean; Returns T if OBJECT is a character which could not
    possibly be a valid character in an EL variable name.
     */
    @LispMethod(comment = "@return boolean; Returns T if OBJECT is a character which could not\r\npossibly be a valid character in an EL variable name.")
    public static SubLObject invalid_variable_name_char(final SubLObject v_object) {
        return makeBoolean((NIL == string_utilities.upper_case_alphanumeric_p(v_object)) && (NIL == el_variable_hyphen_charP(v_object)));
    }

    /**
     *
     *
     * @return boolean; Returns T if OBJECT is a symbol whose name
    satisfies the regular expression @xref *valid-el-var-regular-expression*.
     */
    @LispMethod(comment = "@return boolean; Returns T if OBJECT is a symbol whose name\r\nsatisfies the regular expression @xref *valid-el-var-regular-expression*.")
    public static final SubLObject valid_el_varP_alt(SubLObject v_object) {
        if (v_object.isSymbol()) {
            if (!v_object.isKeyword()) {
                return com.cyc.cycjava.cycl.cycl_variables.valid_el_var_nameP(com.cyc.cycjava.cycl.cycl_variables.el_var_name(v_object));
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean; Returns T if OBJECT is a symbol whose name
    satisfies the regular expression @xref *valid-el-var-regular-expression*.
     */
    @LispMethod(comment = "@return boolean; Returns T if OBJECT is a symbol whose name\r\nsatisfies the regular expression @xref *valid-el-var-regular-expression*.")
    public static SubLObject valid_el_varP(final SubLObject v_object) {
        if (v_object.isSymbol() && (!v_object.isKeyword())) {
            return valid_el_var_nameP(el_var_name(v_object));
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean; Returns T if OBJECT satisfies the regular
    expression @xref *valid-el-var-regular-expression*.
     */
    @LispMethod(comment = "@return boolean; Returns T if OBJECT satisfies the regular\r\nexpression @xref *valid-el-var-regular-expression*.")
    public static final SubLObject valid_el_var_nameP_alt(SubLObject v_object) {
        if (((!v_object.isString()) || (NIL != string_utilities.empty_string_p(v_object))) || (NIL == com.cyc.cycjava.cycl.cycl_variables.has_el_variable_prefixP(v_object))) {
            return NIL;
        }
        {
            SubLObject length = length(v_object);
            SubLObject last = subtract(length, ONE_INTEGER);
            SubLObject subseq_check_start = ONE_INTEGER;
            if (!length.numG(ONE_INTEGER)) {
                return NIL;
            }
            if (NIL != com.cyc.cycjava.cycl.cycl_variables.has_dont_care_var_prefixP(v_object)) {
                if (!length.numG(TWO_INTEGER)) {
                    return NIL;
                }
                subseq_check_start = TWO_INTEGER;
            }
            if (last.numLE(subseq_check_start)) {
                last = add(subseq_check_start, ONE_INTEGER);
            }
            if (NIL != com.cyc.cycjava.cycl.cycl_variables.valid_el_variable_name_subsequenceP(subseq(v_object, subseq_check_start, last))) {
                return string_utilities.upper_case_alphanumeric_p(Strings.sublisp_char(v_object, subtract(length, ONE_INTEGER)));
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean; Returns T if OBJECT satisfies the regular
    expression @xref *valid-el-var-regular-expression*.
     */
    @LispMethod(comment = "@return boolean; Returns T if OBJECT satisfies the regular\r\nexpression @xref *valid-el-var-regular-expression*.")
    public static SubLObject valid_el_var_nameP(final SubLObject v_object) {
        if (((!v_object.isString()) || (NIL != string_utilities.empty_string_p(v_object))) || (NIL == has_el_variable_prefixP(v_object))) {
            return NIL;
        }
        final SubLObject length = length(v_object);
        SubLObject last = subtract(length, ONE_INTEGER);
        SubLObject subseq_check_start = ONE_INTEGER;
        if (!length.numG(ONE_INTEGER)) {
            return NIL;
        }
        if (NIL != has_dont_care_var_prefixP(v_object)) {
            if (!length.numG(TWO_INTEGER)) {
                return NIL;
            }
            subseq_check_start = TWO_INTEGER;
        }
        if (last.numLE(subseq_check_start)) {
            last = add(subseq_check_start, ONE_INTEGER);
        }
        if (NIL != valid_el_variable_name_subsequenceP(subseq(v_object, subseq_check_start, last))) {
            return string_utilities.upper_case_alphanumeric_p(Strings.sublisp_char(v_object, subtract(length, ONE_INTEGER)));
        }
        return NIL;
    }

    public static final SubLObject valid_el_variable_name_subsequenceP_alt(SubLObject v_object) {
        if (NIL != list_utilities.lengthG(v_object, ZERO_INTEGER, UNPROVIDED)) {
            return makeBoolean(((NIL != upper_case_p(Strings.sublisp_char(v_object, ZERO_INTEGER))) && (NIL == find_if(INVALID_VARIABLE_NAME_CHAR, subseq(v_object, ONE_INTEGER, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL == search(com.cyc.cycjava.cycl.cycl_variables.invalid_hyphen_sequence(), v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
        return NIL;
    }

    public static SubLObject valid_el_variable_name_subsequenceP(final SubLObject v_object) {
        if (NIL != list_utilities.lengthG(v_object, ZERO_INTEGER, UNPROVIDED)) {
            return makeBoolean(((NIL != upper_case_p(Strings.sublisp_char(v_object, ZERO_INTEGER))) && (NIL == find_if(INVALID_VARIABLE_NAME_CHAR, subseq(v_object, ONE_INTEGER, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL == search(invalid_hyphen_sequence(), v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
        return NIL;
    }

    public static final SubLObject invalid_hyphen_sequence_alt() {
        return $el_variable_invalid_hyphen_sequence$.getGlobalValue();
    }

    public static SubLObject invalid_hyphen_sequence() {
        return $el_variable_invalid_hyphen_sequence$.getGlobalValue();
    }

    public static final SubLObject gensym_el_var_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject el_var = NIL;
                {
                    SubLObject _prev_bind_0 = $package$.currentBinding(thread);
                    try {
                        $package$.bind($cyc_package$.getGlobalValue(), thread);
                        el_var = gensym(com.cyc.cycjava.cycl.cycl_variables.make_el_var_name(v_object));
                    } finally {
                        $package$.rebind(_prev_bind_0, thread);
                    }
                }
                return el_var;
            }
        }
    }

    public static SubLObject gensym_el_var(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject el_var = NIL;
        final SubLObject _prev_bind_0 = $package$.currentBinding(thread);
        try {
            $package$.bind($cyc_package$.getGlobalValue(), thread);
            el_var = gensym(make_el_var_name(v_object));
        } finally {
            $package$.rebind(_prev_bind_0, thread);
        }
        return el_var;
    }

    public static final SubLObject gentemp_el_var_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject el_var = NIL;
                {
                    SubLObject _prev_bind_0 = $package$.currentBinding(thread);
                    try {
                        $package$.bind($cyc_package$.getGlobalValue(), thread);
                        el_var = gentemp(com.cyc.cycjava.cycl.cycl_variables.make_el_var_name(v_object));
                    } finally {
                        $package$.rebind(_prev_bind_0, thread);
                    }
                }
                return el_var;
            }
        }
    }

    public static SubLObject gentemp_el_var(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject el_var = NIL;
        final SubLObject _prev_bind_0 = $package$.currentBinding(thread);
        try {
            $package$.bind($cyc_package$.getGlobalValue(), thread);
            el_var = gentemp(make_el_var_name(v_object));
        } finally {
            $package$.rebind(_prev_bind_0, thread);
        }
        return el_var;
    }

    public static final SubLObject intern_el_var_alt(SubLObject v_object) {
        return intern(com.cyc.cycjava.cycl.cycl_variables.make_el_var_name(v_object), $cyc_package$.getGlobalValue());
    }

    public static SubLObject intern_el_var(final SubLObject v_object) {
        return intern(make_el_var_name(v_object), $cyc_package$.getGlobalValue());
    }

    /**
     * extract from string those substrings comprising el var names (e.g., they follow ?)
     */
    @LispMethod(comment = "extract from string those substrings comprising el var names (e.g., they follow ?)")
    public static final SubLObject var_names_in_string_alt(SubLObject string, SubLObject var_char) {
        if (var_char == UNPROVIDED) {
            var_char = com.cyc.cycjava.cycl.cycl_variables.el_variable_prefix_char();
        }
        {
            SubLObject names = NIL;
            SubLObject start = NIL;
            SubLObject varP = NIL;
            SubLObject eligibleP = T;
            SubLObject length = length(string);
            SubLObject last = subtract(length, ONE_INTEGER);
            SubLObject string_var = string;
            SubLObject end_var = length(string_var);
            SubLObject end_var_1 = end_var;
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; !i.numGE(end_var_1); i = number_utilities.f_1X(i)) {
                {
                    SubLObject ch = Strings.sublisp_char(string_var, i);
                    if ((NIL != eligibleP) && (NIL != charE(ch, var_char))) {
                        start = i;
                        varP = T;
                    } else {
                        if ((NIL != varP) && (((NIL != string_utilities.punctuation_p(ch)) || (NIL != string_utilities.whitespacep(ch))) || i.numE(last))) {
                            varP = NIL;
                            eligibleP = T;
                            {
                                SubLObject item_var = subseq(string, start, i.numE(last) ? ((SubLObject) (add(ONE_INTEGER, i))) : i);
                                if (NIL == member(item_var, names, symbol_function($sym8$STRING_), symbol_function(IDENTITY))) {
                                    names = cons(item_var, names);
                                }
                            }
                        } else {
                            if ((NIL != string_utilities.punctuation_p(ch)) || (NIL != string_utilities.whitespacep(ch))) {
                                eligibleP = T;
                            } else {
                                eligibleP = NIL;
                            }
                        }
                    }
                }
            }
            return names;
        }
    }

    /**
     * extract from string those substrings comprising el var names (e.g., they follow ?)
     */
    @LispMethod(comment = "extract from string those substrings comprising el var names (e.g., they follow ?)")
    public static SubLObject var_names_in_string(final SubLObject string, SubLObject var_char) {
        if (var_char == UNPROVIDED) {
            var_char = el_variable_prefix_char();
        }
        SubLObject names = NIL;
        SubLObject start = NIL;
        SubLObject varP = NIL;
        SubLObject eligibleP = T;
        final SubLObject length = length(string);
        final SubLObject last = subtract(length, ONE_INTEGER);
        SubLObject end_var_$1;
        SubLObject end_var;
        SubLObject i;
        SubLObject ch;
        SubLObject item_var;
        for (end_var = end_var_$1 = length(string), i = NIL, i = ZERO_INTEGER; !i.numGE(end_var_$1); i = number_utilities.f_1X(i)) {
            ch = Strings.sublisp_char(string, i);
            if ((NIL != eligibleP) && (NIL != charE(ch, var_char))) {
                start = i;
                varP = T;
            } else
                if ((NIL != varP) && (((NIL != string_utilities.punctuation_p(ch)) || (NIL != string_utilities.whitespacep(ch))) || i.numE(last))) {
                    varP = NIL;
                    eligibleP = T;
                    item_var = subseq(string, start, i.numE(last) ? add(ONE_INTEGER, i) : i);
                    if (NIL == member(item_var, names, symbol_function($sym8$STRING_), symbol_function(IDENTITY))) {
                        names = cons(item_var, names);
                    }
                } else
                    if ((NIL != string_utilities.punctuation_p(ch)) || (NIL != string_utilities.whitespacep(ch))) {
                        eligibleP = T;
                    } else {
                        eligibleP = NIL;
                    }


        }
        return names;
    }

    /**
     *
     *
     * @return stringp; the name of EL-VAR without the prefix character(s).
     */
    @LispMethod(comment = "@return stringp; the name of EL-VAR without the prefix character(s).")
    public static final SubLObject el_var_name_without_prefix_alt(SubLObject el_var) {
        return com.cyc.cycjava.cycl.cycl_variables.string_without_el_var_name_prefix(com.cyc.cycjava.cycl.cycl_variables.el_var_name(el_var));
    }

    /**
     *
     *
     * @return stringp; the name of EL-VAR without the prefix character(s).
     */
    @LispMethod(comment = "@return stringp; the name of EL-VAR without the prefix character(s).")
    public static SubLObject el_var_name_without_prefix(final SubLObject el_var) {
        return string_without_el_var_name_prefix(el_var_name(el_var));
    }

    /**
     *
     *
     * @return stringp; the name of STRING without the prefix character(s).
     */
    @LispMethod(comment = "@return stringp; the name of STRING without the prefix character(s).")
    public static final SubLObject string_without_el_var_name_prefix_alt(SubLObject string) {
        if (string.isString()) {
            if ((NIL != list_utilities.lengthG(string, TWO_INTEGER, UNPROVIDED)) && (aref(string, ONE_INTEGER) == com.cyc.cycjava.cycl.cycl_variables.el_variable_prefix_char())) {
                return subseq(string, TWO_INTEGER, UNPROVIDED);
            } else {
                return subseq(string, ONE_INTEGER, UNPROVIDED);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return stringp; the name of STRING without the prefix character(s).
     */
    @LispMethod(comment = "@return stringp; the name of STRING without the prefix character(s).")
    public static SubLObject string_without_el_var_name_prefix(final SubLObject string) {
        if (!string.isString()) {
            return NIL;
        }
        if ((NIL != list_utilities.lengthG(string, TWO_INTEGER, UNPROVIDED)) && aref(string, ONE_INTEGER).eql(el_variable_prefix_char())) {
            return subseq(string, TWO_INTEGER, UNPROVIDED);
        }
        return subseq(string, ONE_INTEGER, UNPROVIDED);
    }

    public static final SubLObject default_el_varP_alt(SubLObject symbol) {
        if ((NIL != com.cyc.cycjava.cycl.cycl_variables.el_varP(symbol)) && length(symbol_name(symbol)).numG(FOUR_INTEGER)) {
            {
                SubLObject number = read_from_string_ignoring_errors(symbol_name(symbol), NIL, NIL, FOUR_INTEGER, UNPROVIDED);
                return makeBoolean(((number.isFixnum() && number.numGE(ZERO_INTEGER)) && number.numLE($int$200)) && symbol.eql(variables.default_el_var_for_hl_var(variables.get_variable(number))));
            }
        }
        return NIL;
    }

    public static SubLObject default_el_varP(final SubLObject symbol) {
        if ((NIL != el_varP(symbol)) && length(symbol_name(symbol)).numG(FOUR_INTEGER)) {
            final SubLObject number = read_from_string_ignoring_errors(symbol_name(symbol), NIL, NIL, FOUR_INTEGER, UNPROVIDED);
            return makeBoolean(((number.isFixnum() && number.numGE(ZERO_INTEGER)) && number.numLE($int$200)) && symbol.eql(variables.default_el_var_for_hl_var(variables.get_variable(number))));
        }
        return NIL;
    }

    public static final SubLObject non_default_el_varP_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.cycl_variables.el_varP(v_object)) && (NIL == com.cyc.cycjava.cycl.cycl_variables.default_el_varP(v_object)));
    }

    public static SubLObject non_default_el_varP(final SubLObject v_object) {
        return makeBoolean((NIL != el_varP(v_object)) && (NIL == default_el_varP(v_object)));
    }

    /**
     *
     *
     * @return characterp; The character used as the first character of a keyword variable's name.
     */
    @LispMethod(comment = "@return characterp; The character used as the first character of a keyword variable\'s name.")
    public static final SubLObject keyword_variable_prefix_char_alt() {
        return $keyword_variable_prefix_char$.getGlobalValue();
    }

    /**
     *
     *
     * @return characterp; The character used as the first character of a keyword variable's name.
     */
    @LispMethod(comment = "@return characterp; The character used as the first character of a keyword variable\'s name.")
    public static SubLObject keyword_variable_prefix_char() {
        return $keyword_variable_prefix_char$.getGlobalValue();
    }

    /**
     *
     *
     * @return boolean; t iff THING is deemed a keyword variable,
    and we are allowing such things.
     */
    @LispMethod(comment = "@return boolean; t iff THING is deemed a keyword variable,\r\nand we are allowing such things.")
    public static final SubLObject permissible_keyword_varP_alt(SubLObject thing) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL != wff_vars.$permit_keyword_variablesP$.getDynamicValue(thread)) && thing.isKeyword());
        }
    }

    /**
     *
     *
     * @return boolean; t iff THING is deemed a keyword variable,
    and we are allowing such things.
     */
    @LispMethod(comment = "@return boolean; t iff THING is deemed a keyword variable,\r\nand we are allowing such things.")
    public static SubLObject permissible_keyword_varP(final SubLObject thing) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != wff_vars.$permit_keyword_variablesP$.getDynamicValue(thread)) && thing.isKeyword());
    }

    public static final SubLObject impermissible_varP_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean(((NIL == wff_vars.$permit_keyword_variablesP$.getDynamicValue(thread)) && v_object.isKeyword()) || ((NIL == wff_vars.$permit_generic_arg_variablesP$.getDynamicValue(thread)) && (NIL != at_admitted.generic_arg_p(v_object))));
        }
    }

    public static SubLObject impermissible_varP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((NIL == wff_vars.$permit_keyword_variablesP$.getDynamicValue(thread)) && v_object.isKeyword()) || ((NIL == wff_vars.$permit_generic_arg_variablesP$.getDynamicValue(thread)) && (NIL != at_admitted.generic_arg_p(v_object))));
    }

    /**
     *
     *
     * @return boolean; t iff THING is deemed a keyword variable
     */
    @LispMethod(comment = "@return boolean; t iff THING is deemed a keyword variable")
    public static final SubLObject keyword_varP_alt(SubLObject thing) {
        return keywordp(thing);
    }

    /**
     *
     *
     * @return boolean; t iff THING is deemed a keyword variable
     */
    @LispMethod(comment = "@return boolean; t iff THING is deemed a keyword variable")
    public static SubLObject keyword_varP(final SubLObject thing) {
        return keywordp(thing);
    }

    /**
     *
     *
     * @return stringp; the name of KEYWORD-VAR.  Includes the prefix character.
     */
    @LispMethod(comment = "@return stringp; the name of KEYWORD-VAR.  Includes the prefix character.")
    public static final SubLObject keyword_var_name_alt(SubLObject keyword_var) {
        SubLTrampolineFile.checkType(keyword_var, SYMBOLP);
        return symbol_name(keyword_var);
    }

    /**
     *
     *
     * @return stringp; the name of KEYWORD-VAR.  Includes the prefix character.
     */
    @LispMethod(comment = "@return stringp; the name of KEYWORD-VAR.  Includes the prefix character.")
    public static SubLObject keyword_var_name(final SubLObject keyword_var) {
        assert NIL != symbolp(keyword_var) : "! symbolp(keyword_var) " + ("Types.symbolp(keyword_var) " + "CommonSymbols.NIL != Types.symbolp(keyword_var) ") + keyword_var;
        return symbol_name(keyword_var);
    }

    public static final SubLObject keyword_var_nameP_alt(SubLObject v_object) {
        return makeBoolean((v_object.isString() && length(v_object).numG(ONE_INTEGER)) && (NIL != charE(Strings.sublisp_char(v_object, ZERO_INTEGER), com.cyc.cycjava.cycl.cycl_variables.keyword_variable_prefix_char())));
    }

    public static SubLObject keyword_var_nameP(final SubLObject v_object) {
        return makeBoolean((v_object.isString() && length(v_object).numG(ONE_INTEGER)) && (NIL != charE(Strings.sublisp_char(v_object, ZERO_INTEGER), keyword_variable_prefix_char())));
    }

    public static final SubLObject make_keyword_var_alt(SubLObject string) {
        return make_keyword(Strings.string_upcase(string, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject make_keyword_var(final SubLObject string) {
        return make_keyword(Strings.string_upcase(string, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject make_keyword_var_name_alt(SubLObject v_object) {
        if (NIL != com.cyc.cycjava.cycl.cycl_variables.keyword_var_nameP(v_object)) {
            return Strings.string_upcase(v_object, UNPROVIDED, UNPROVIDED);
        } else {
            return Strings.string_upcase(format(NIL, $str_alt10$_C_A, com.cyc.cycjava.cycl.cycl_variables.keyword_variable_prefix_char(), v_object), UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject make_keyword_var_name(final SubLObject v_object) {
        if (NIL != keyword_var_nameP(v_object)) {
            return Strings.string_upcase(v_object, UNPROVIDED, UNPROVIDED);
        }
        return Strings.string_upcase(format(NIL, $str10$_C_A, keyword_variable_prefix_char(), v_object), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @param SYMBOL--symbol
     * 		to type-check
     * @return boolean--is symbol either an el-variable or a keyword
     */
    @LispMethod(comment = "@param SYMBOL--symbol\r\n\t\tto type-check\r\n@return boolean--is symbol either an el-variable or a keyword")
    public static final SubLObject el_variable_or_keyword_p_alt(SubLObject symbol) {
        return makeBoolean((NIL != collection_defns.el_variableP(symbol)) || symbol.isKeyword());
    }

    /**
     *
     *
     * @param SYMBOL--symbol
     * 		to type-check
     * @return boolean--is symbol either an el-variable or a keyword
     */
    @LispMethod(comment = "@param SYMBOL--symbol\r\n\t\tto type-check\r\n@return boolean--is symbol either an el-variable or a keyword")
    public static SubLObject el_variable_or_keyword_p(final SubLObject symbol) {
        return makeBoolean((NIL != collection_defns.el_variableP(symbol)) || symbol.isKeyword());
    }

    /**
     *
     *
     * @param VAR;
     * 		a CycL variable.
     * @return stringp; the name of VAR.  Does not strip prefix characters.
     */
    @LispMethod(comment = "@param VAR;\r\n\t\ta CycL variable.\r\n@return stringp; the name of VAR.  Does not strip prefix characters.")
    public static final SubLObject variable_name_alt(SubLObject var) {
        if (NIL != variables.variable_p(var)) {
            return com.cyc.cycjava.cycl.cycl_variables.variable_name(variables.default_el_var_for_hl_var(var));
        } else {
            if (NIL != com.cyc.cycjava.cycl.cycl_variables.el_varP(var)) {
                return com.cyc.cycjava.cycl.cycl_variables.el_var_name(var);
            } else {
                if (NIL != com.cyc.cycjava.cycl.cycl_variables.keyword_varP(var)) {
                    return com.cyc.cycjava.cycl.cycl_variables.keyword_var_name(var);
                } else {
                    return string_utilities.object_to_string(var);
                }
            }
        }
    }

    /**
     *
     *
     * @param VAR;
     * 		a CycL variable.
     * @return stringp; the name of VAR.  Does not strip prefix characters.
     */
    @LispMethod(comment = "@param VAR;\r\n\t\ta CycL variable.\r\n@return stringp; the name of VAR.  Does not strip prefix characters.")
    public static SubLObject variable_name(final SubLObject var) {
        if (NIL != variables.variable_p(var)) {
            return variable_name(variables.default_el_var_for_hl_var(var));
        }
        if (NIL != el_varP(var)) {
            return el_var_name(var);
        }
        if (NIL != keyword_varP(var)) {
            return keyword_var_name(var);
        }
        return string_utilities.object_to_string(var);
    }

    /**
     *
     *
     * @param VAR;
     * 		a CycL variable.
     * @return stringp; the name of VAR without any prefix characters.
     */
    @LispMethod(comment = "@param VAR;\r\n\t\ta CycL variable.\r\n@return stringp; the name of VAR without any prefix characters.")
    public static final SubLObject variable_name_without_prefix_alt(SubLObject var) {
        if (NIL != variables.variable_p(var)) {
            return com.cyc.cycjava.cycl.cycl_variables.variable_name_without_prefix(variables.default_el_var_for_hl_var(var));
        } else {
            if (NIL != com.cyc.cycjava.cycl.cycl_variables.el_varP(var)) {
                return com.cyc.cycjava.cycl.cycl_variables.el_var_name_without_prefix(var);
            } else {
                return com.cyc.cycjava.cycl.cycl_variables.string_without_el_var_name_prefix(string_utilities.object_to_string(var));
            }
        }
    }

    /**
     *
     *
     * @param VAR;
     * 		a CycL variable.
     * @return stringp; the name of VAR without any prefix characters.
     */
    @LispMethod(comment = "@param VAR;\r\n\t\ta CycL variable.\r\n@return stringp; the name of VAR without any prefix characters.")
    public static SubLObject variable_name_without_prefix(final SubLObject var) {
        if (NIL != variables.variable_p(var)) {
            return variable_name_without_prefix(variables.default_el_var_for_hl_var(var));
        }
        if (NIL != el_varP(var)) {
            return el_var_name_without_prefix(var);
        }
        return string_without_el_var_name_prefix(string_utilities.object_to_string(var));
    }

    public static final SubLObject variable_symbolP_alt(SubLObject symbol) {
        return com.cyc.cycjava.cycl.cycl_variables.el_varP(symbol);
    }

    public static SubLObject variable_symbolP(final SubLObject symbol) {
        return el_varP(symbol);
    }

    public static final SubLObject el_var_or_generic_argP_alt(SubLObject candidate_variable) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.cycl_variables.el_varP(candidate_variable)) || (NIL != at_admitted.generic_arg_p(candidate_variable)));
    }

    public static SubLObject el_var_or_generic_argP(final SubLObject candidate_variable) {
        return makeBoolean((NIL != el_varP(candidate_variable)) || (NIL != at_admitted.generic_arg_p(candidate_variable)));
    }

    /**
     *
     *
     * @return boolean; t iff THING is any possible kind of variable in the CycL
    language or any of its extensions or relata, being as permissive as possible.
     */
    @LispMethod(comment = "@return boolean; t iff THING is any possible kind of variable in the CycL\r\nlanguage or any of its extensions or relata, being as permissive as possible.")
    public static final SubLObject cyc_varP_alt(SubLObject thing) {
        return makeBoolean(((((NIL != com.cyc.cycjava.cycl.cycl_variables.el_varP(thing)) || (NIL != com.cyc.cycjava.cycl.cycl_variables.kb_varP(thing))) || (NIL != canon_tl.tl_varP(thing))) || (NIL != com.cyc.cycjava.cycl.cycl_variables.permissible_keyword_varP(thing))) || (NIL != com.cyc.cycjava.cycl.cycl_variables.generic_arg_varP(thing)));
    }

    /**
     *
     *
     * @return boolean; t iff THING is any possible kind of variable in the CycL
    language or any of its extensions or relata, being as permissive as possible.
     */
    @LispMethod(comment = "@return boolean; t iff THING is any possible kind of variable in the CycL\r\nlanguage or any of its extensions or relata, being as permissive as possible.")
    public static SubLObject cyc_varP(final SubLObject thing) {
        return makeBoolean(((((NIL != el_varP(thing)) || (NIL != kb_varP(thing))) || (NIL != canon_tl.tl_varP(thing))) || (NIL != permissible_keyword_varP(thing))) || (NIL != generic_arg_varP(thing)));
    }

    /**
     *
     *
     * @return boolean; t iff THING is deemed a generic-arg variable
     */
    @LispMethod(comment = "@return boolean; t iff THING is deemed a generic-arg variable")
    public static final SubLObject generic_arg_varP_alt(SubLObject thing) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL != wff_vars.$permit_generic_arg_variablesP$.getDynamicValue(thread)) && (NIL != at_admitted.generic_arg_p(thing)));
        }
    }

    /**
     *
     *
     * @return boolean; t iff THING is deemed a generic-arg variable
     */
    @LispMethod(comment = "@return boolean; t iff THING is deemed a generic-arg variable")
    public static SubLObject generic_arg_varP(final SubLObject thing) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != wff_vars.$permit_generic_arg_variablesP$.getDynamicValue(thread)) && (NIL != at_admitted.generic_arg_p(thing)));
    }

    /**
     *
     *
     * @return the subl boolean function that admits VAR as a variable.
     */
    @LispMethod(comment = "@return the subl boolean function that admits VAR as a variable.")
    public static final SubLObject variable_predicate_fn_alt(SubLObject var) {
        if (NIL != com.cyc.cycjava.cycl.cycl_variables.hl_varP(var)) {
            return $sym13$HL_VAR_;
        } else {
            if (NIL != com.cyc.cycjava.cycl.cycl_variables.el_varP(var)) {
                return $sym2$EL_VAR_;
            } else {
                if (NIL != canon_tl.tl_varP(var)) {
                    return $sym14$TL_VAR_;
                } else {
                    if (NIL != com.cyc.cycjava.cycl.cycl_variables.permissible_keyword_varP(var)) {
                        return $sym15$KEYWORD_VAR_;
                    } else {
                        if (NIL != com.cyc.cycjava.cycl.cycl_variables.generic_arg_varP(var)) {
                            return $sym16$GENERIC_ARG_VAR_;
                        } else {
                            return FALSE;
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return the subl boolean function that admits VAR as a variable.
     */
    @LispMethod(comment = "@return the subl boolean function that admits VAR as a variable.")
    public static SubLObject variable_predicate_fn(final SubLObject var) {
        if (NIL != hl_varP(var)) {
            return $sym13$HL_VAR_;
        }
        if (NIL != el_varP(var)) {
            return $sym2$EL_VAR_;
        }
        if (NIL != canon_tl.tl_varP(var)) {
            return $sym14$TL_VAR_;
        }
        if (NIL != permissible_keyword_varP(var)) {
            return $sym15$KEYWORD_VAR_;
        }
        if (NIL != generic_arg_varP(var)) {
            return $sym16$GENERIC_ARG_VAR_;
        }
        return FALSE;
    }

    public static final SubLObject kb_varP_alt(SubLObject symbol) {
        return com.cyc.cycjava.cycl.cycl_variables.kb_variableP(symbol);
    }

    public static SubLObject kb_varP(final SubLObject symbol) {
        return kb_variableP(symbol);
    }

    public static final SubLObject kb_variableP_alt(SubLObject symbol) {
        return variables.variable_p(symbol);
    }

    public static SubLObject kb_variableP(final SubLObject symbol) {
        return variables.variable_p(symbol);
    }

    public static final SubLObject hl_varP_alt(SubLObject thing) {
        return variables.variable_p(thing);
    }

    public static SubLObject hl_varP(final SubLObject thing) {
        return variables.variable_p(thing);
    }

    public static SubLObject declare_cycl_variables_file() {
        declareFunction("el_variable_prefix_char", "EL-VARIABLE-PREFIX-CHAR", 0, 0, false);
        declareFunction("el_variable_prefix_string", "EL-VARIABLE-PREFIX-STRING", 0, 0, false);
        declareFunction("el_variable_hyphen_char", "EL-VARIABLE-HYPHEN-CHAR", 0, 0, false);
        declareFunction("el_variable_prefix_charP", "EL-VARIABLE-PREFIX-CHAR?", 1, 0, false);
        declareFunction("has_el_variable_prefixP", "HAS-EL-VARIABLE-PREFIX?", 1, 0, false);
        declareFunction("has_dont_care_var_prefixP", "HAS-DONT-CARE-VAR-PREFIX?", 1, 0, false);
        declareFunction("el_variable_hyphen_charP", "EL-VARIABLE-HYPHEN-CHAR?", 1, 0, false);
        declareFunction("el_variable_charP", "EL-VARIABLE-CHAR?", 1, 0, false);
        declareFunction("el_varP", "EL-VAR?", 1, 0, false);
        new cycl_variables.$el_varP$UnaryFunction();
        declareFunction("dont_care_varP", "DONT-CARE-VAR?", 1, 0, false);
        declareFunction("el_var_name", "EL-VAR-NAME", 1, 0, false);
        declareFunction("el_var_nameP", "EL-VAR-NAME?", 1, 0, false);
        declareFunction("make_el_var", "MAKE-EL-VAR", 1, 0, false);
        declareFunction("make_el_var_name", "MAKE-EL-VAR-NAME", 1, 0, false);
        declareFunction("possibly_make_valid_el_var_name", "POSSIBLY-MAKE-VALID-EL-VAR-NAME", 1, 0, false);
        declareFunction("possibly_make_valid_el_var", "POSSIBLY-MAKE-VALID-EL-VAR", 1, 0, false);
        declareFunction("invalid_variable_name_char", "INVALID-VARIABLE-NAME-CHAR", 1, 0, false);
        new cycl_variables.$invalid_variable_name_char$UnaryFunction();
        declareFunction("valid_el_varP", "VALID-EL-VAR?", 1, 0, false);
        declareFunction("valid_el_var_nameP", "VALID-EL-VAR-NAME?", 1, 0, false);
        declareFunction("valid_el_variable_name_subsequenceP", "VALID-EL-VARIABLE-NAME-SUBSEQUENCE?", 1, 0, false);
        declareFunction("invalid_hyphen_sequence", "INVALID-HYPHEN-SEQUENCE", 0, 0, false);
        declareFunction("gensym_el_var", "GENSYM-EL-VAR", 1, 0, false);
        declareFunction("gentemp_el_var", "GENTEMP-EL-VAR", 1, 0, false);
        declareFunction("intern_el_var", "INTERN-EL-VAR", 1, 0, false);
        declareFunction("var_names_in_string", "VAR-NAMES-IN-STRING", 1, 1, false);
        declareFunction("el_var_name_without_prefix", "EL-VAR-NAME-WITHOUT-PREFIX", 1, 0, false);
        declareFunction("string_without_el_var_name_prefix", "STRING-WITHOUT-EL-VAR-NAME-PREFIX", 1, 0, false);
        declareFunction("default_el_varP", "DEFAULT-EL-VAR?", 1, 0, false);
        new cycl_variables.$default_el_varP$UnaryFunction();
        declareFunction("non_default_el_varP", "NON-DEFAULT-EL-VAR?", 1, 0, false);
        declareFunction("keyword_variable_prefix_char", "KEYWORD-VARIABLE-PREFIX-CHAR", 0, 0, false);
        declareFunction("permissible_keyword_varP", "PERMISSIBLE-KEYWORD-VAR?", 1, 0, false);
        declareFunction("impermissible_varP", "IMPERMISSIBLE-VAR?", 1, 0, false);
        declareFunction("keyword_varP", "KEYWORD-VAR?", 1, 0, false);
        declareFunction("keyword_var_name", "KEYWORD-VAR-NAME", 1, 0, false);
        declareFunction("keyword_var_nameP", "KEYWORD-VAR-NAME?", 1, 0, false);
        declareFunction("make_keyword_var", "MAKE-KEYWORD-VAR", 1, 0, false);
        declareFunction("make_keyword_var_name", "MAKE-KEYWORD-VAR-NAME", 1, 0, false);
        declareFunction("el_variable_or_keyword_p", "EL-VARIABLE-OR-KEYWORD-P", 1, 0, false);
        declareFunction("variable_name", "VARIABLE-NAME", 1, 0, false);
        declareFunction("variable_name_without_prefix", "VARIABLE-NAME-WITHOUT-PREFIX", 1, 0, false);
        declareFunction("variable_symbolP", "VARIABLE-SYMBOL?", 1, 0, false);
        declareFunction("el_var_or_generic_argP", "EL-VAR-OR-GENERIC-ARG?", 1, 0, false);
        declareFunction("cyc_varP", "CYC-VAR?", 1, 0, false);
        new cycl_variables.$cyc_varP$UnaryFunction();
        declareFunction("generic_arg_varP", "GENERIC-ARG-VAR?", 1, 0, false);
        declareFunction("variable_predicate_fn", "VARIABLE-PREDICATE-FN", 1, 0, false);
        declareFunction("kb_varP", "KB-VAR?", 1, 0, false);
        declareFunction("kb_variableP", "KB-VARIABLE?", 1, 0, false);
        declareFunction("hl_varP", "HL-VAR?", 1, 0, false);
        new cycl_variables.$hl_varP$UnaryFunction();
        return NIL;
    }

    public static SubLObject init_cycl_variables_file() {
        defconstant("*EL-VARIABLE-PREFIX-CHAR*", CHAR_question);
        defconstant("*EL-VARIABLE-PREFIX-STRING*", $str0$_);
        defconstant("*EL-VARIABLE-HYPHEN-CHAR*", CHAR_hyphen);
        defconstant("*EL-VARIABLE-INVALID-HYPHEN-SEQUENCE*", Strings.make_string(TWO_INTEGER, $el_variable_hyphen_char$.getGlobalValue()));
        defconstant("*VALID-EL-VAR-REGULAR-EXPRESSION*", $str1$______________A_Z____A_Z___0_9___);
        defconstant("*KEYWORD-VARIABLE-PREFIX-CHAR*", CHAR_colon);
        return NIL;
    }

    public static final SubLObject setup_cycl_variables_file_alt() {
        register_cyc_api_function($sym2$EL_VAR_, $list_alt3, $str_alt4$Return_T_iff_OBJECT_is_a_symbol_w, NIL, $list_alt5);
        define_obsolete_register($sym11$VARIABLE_SYMBOL_, $list_alt12);
        define_test_case_table_int($sym18$VALID_EL_VAR_NAME_, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$ashenoy, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt26);
        return NIL;
    }

    public static SubLObject setup_cycl_variables_file() {
        if (SubLFiles.USE_V1) {
            register_cyc_api_function($sym2$EL_VAR_, $list3, $str4$Return_T_iff_OBJECT_is_a_symbol_w, NIL, $list5);
            define_obsolete_register($sym11$VARIABLE_SYMBOL_, $list12);
            define_test_case_table_int($sym18$VALID_EL_VAR_NAME_, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list25);
        }
        if (SubLFiles.USE_V2) {
            define_test_case_table_int($sym18$VALID_EL_VAR_NAME_, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$ashenoy, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt26);
        }
        return NIL;
    }

    public static SubLObject setup_cycl_variables_file_Previous() {
        register_cyc_api_function($sym2$EL_VAR_, $list3, $str4$Return_T_iff_OBJECT_is_a_symbol_w, NIL, $list5);
        define_obsolete_register($sym11$VARIABLE_SYMBOL_, $list12);
        define_test_case_table_int($sym18$VALID_EL_VAR_NAME_, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list25);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cycl_variables_file();
    }

    @Override
    public void initializeVariables() {
        init_cycl_variables_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cycl_variables_file();
    }

    static {
    }

    public static final class $el_varP$UnaryFunction extends UnaryFunction {
        public $el_varP$UnaryFunction() {
            super(extractFunctionNamed("EL-VAR?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return el_varP(arg1);
        }
    }

    public static final class $invalid_variable_name_char$UnaryFunction extends UnaryFunction {
        public $invalid_variable_name_char$UnaryFunction() {
            super(extractFunctionNamed("INVALID-VARIABLE-NAME-CHAR"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return invalid_variable_name_char(arg1);
        }
    }

    public static final class $default_el_varP$UnaryFunction extends UnaryFunction {
        public $default_el_varP$UnaryFunction() {
            super(extractFunctionNamed("DEFAULT-EL-VAR?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return default_el_varP(arg1);
        }
    }

    public static final class $cyc_varP$UnaryFunction extends UnaryFunction {
        public $cyc_varP$UnaryFunction() {
            super(extractFunctionNamed("CYC-VAR?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cyc_varP(arg1);
        }
    }

    public static final class $hl_varP$UnaryFunction extends UnaryFunction {
        public $hl_varP$UnaryFunction() {
            super(extractFunctionNamed("HL-VAR?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return hl_varP(arg1);
        }
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$_ = makeString("?");

    static private final SubLString $str_alt1$______________A_Z____A_Z___0_9___ = makeString("([?]|[?][?]) [A-Z] ([A-Z]|[0-9])* ([-] ([A-Z]|[0-9])+)*");

    static private final SubLList $list_alt3 = list(makeSymbol("OBJECT"));

    static private final SubLString $str_alt4$Return_T_iff_OBJECT_is_a_symbol_w = makeString("Return T iff OBJECT is a symbol which can be interpreted as an EL variable.");

    static private final SubLList $list_alt5 = list(makeSymbol("BOOLEANP"));

    static private final SubLString $str_alt10$_C_A = makeString("~C~A");

    static private final SubLList $list_alt12 = list(makeSymbol("EL-VAR?"));

    static private final SubLString $$$ashenoy = makeString("ashenoy");

    static private final SubLList $list_alt26 = list(new SubLObject[]{ list(list(makeString("FOO")), NIL), list(list(makeString("?FOO")), T), list(list(makeString("??FOO")), T), list(list(makeString("???FOO")), NIL), list(list(makeString("?X")), T), list(list(makeString("?x")), NIL), list(list(makeString("??X")), T), list(list(makeString("??x")), NIL), list(list(makeString("?1")), NIL), list(list(makeString("")), NIL), list(list(makeString("?")), NIL), list(list(makeString("??")), NIL), list(list(makeString("???")), NIL) });
}

/**
 * Total time: 206 ms
 */
