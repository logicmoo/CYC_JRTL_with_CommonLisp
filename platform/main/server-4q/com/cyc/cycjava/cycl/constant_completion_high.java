/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.cycjava.cycl.utilities_macros.register_obsolete_cyc_api_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.alphanumericp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CONSTANT-COMPLETION-HIGH
 * source file: /cyc/top/cycl/constant-completion-high.lisp
 * created:     2019/07/03 17:37:18
 */
public final class constant_completion_high extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new constant_completion_high();



    // defparameter
    // Do we require that constant names be case-insensitively unique?
    /**
     * Do we require that constant names be case-insensitively unique?
     */
    @LispMethod(comment = "Do we require that constant names be case-insensitively unique?\ndefparameter")
    public static final SubLSymbol $require_case_insensitive_name_uniqueness$ = makeSymbol("*REQUIRE-CASE-INSENSITIVE-NAME-UNIQUENESS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $last_known_index_for_constant_prefix_dict$ = makeSymbol("*LAST-KNOWN-INDEX-FOR-CONSTANT-PREFIX-DICT*");

    private static final SubLSymbol VALID_CONSTANT_NAME_CHAR = makeSymbol("VALID-CONSTANT-NAME-CHAR");

    static private final SubLList $list2 = list(makeSymbol("VALID-CONSTANT-NAME-CHAR-P"));

    static private final SubLList $list3 = list(makeSymbol("CHAR"));

    static private final SubLString $str4$Deprecated_in_favor_of_valid_cons = makeString("Deprecated in favor of valid-constant-name-char-p\n   Return T iff CHAR is a character which is allowed in a valid constant name.");

    static private final SubLList $list5 = list(list(makeSymbol("CHAR"), makeSymbol("CHARACTERP")));

    static private final SubLList $list6 = list(makeSymbol("BOOLEANP"));

    static private final SubLString $str7$___ = makeString("-_:");

    static private final SubLString $str9$Return_T_iff_CHAR_is_a_character_ = makeString("Return T iff CHAR is a character which is allowed in a valid constant name.");

    private static final SubLSymbol VALID_CONSTANT_NAME = makeSymbol("VALID-CONSTANT-NAME");

    static private final SubLList $list11 = list(makeSymbol("VALID-CONSTANT-NAME-P"));

    static private final SubLList $list12 = list(makeSymbol("STRING"));

    static private final SubLString $str13$Deprecated_in_favor_of_valid_cons = makeString("Deprecated in favor of valid-constant-name-p\n   Return T iff STRING is a valid name for a constant.");

    private static final SubLSymbol INVALID_CONSTANT_NAME_CHAR_P = makeSymbol("INVALID-CONSTANT-NAME-CHAR-P");

    static private final SubLString $str16$Return_T_iff_STRING_is_a_valid_na = makeString("Return T iff STRING is a valid name for a constant.");

    private static final SubLSymbol CONSTANT_NAME_AVAILABLE = makeSymbol("CONSTANT-NAME-AVAILABLE");

    static private final SubLList $list20 = list(makeSymbol("NAME"));

    static private final SubLString $str21$Return_T_iff_NAME_is_a_valid_cons = makeString("Return T iff NAME is a valid constant name currently available for use.");

    static private final SubLList $list22 = list(list(makeSymbol("NAME"), makeSymbol("STRINGP")));

    private static final SubLString $str24$_ = makeString("-");

    private static final SubLSymbol UNIQUIFY_CONSTANT_NAME = makeSymbol("UNIQUIFY-CONSTANT-NAME");

    static private final SubLList $list26 = list(makeSymbol("NAME"), makeSymbol("&OPTIONAL"), list(makeSymbol("SEQUENTIAL?"), NIL));

    private static final SubLString $str27$Return_a_unique__currently_unused = makeString("Return a unique, currently unused constant name based on NAME, which must be a valid constant name. If sequential is set to true it picks the first available sequential digit if NAME is already in use (default is false).");

    private static final SubLList $list28 = list(list(makeSymbol("NAME"), makeSymbol("VALID-CONSTANT-NAME-P")), list(makeSymbol("SEQUENTIAL?"), makeSymbol("BOOLEANP")));

    private static final SubLList $list29 = list(makeSymbol("STRINGP"));

    private static final SubLSymbol CONSTANT_NAME_CASE_COLLISIONS = makeSymbol("CONSTANT-NAME-CASE-COLLISIONS");

    private static final SubLString $str32$Return_a_list_of_constants_whose_ = makeString("Return a list of constants whose names differ from STRING only by case.");

    private static final SubLList $list33 = list(list(makeSymbol("STRING"), makeSymbol("VALID-CONSTANT-NAME-P")));

    private static final SubLList $list34 = list(makeSymbol("LISTP"));

    private static final SubLSymbol CONSTANT_NAME_CASE_COLLISION = makeSymbol("CONSTANT-NAME-CASE-COLLISION");

    private static final SubLString $str36$Return_a_constant_whose_name_diff = makeString("Return a constant whose name differs from STRING only by case.");

    private static final SubLList $list37 = list(makeSymbol("CONSTANT-P"));

    private static final SubLSymbol CONSTANT_COMPLETE_EXACT = makeSymbol("CONSTANT-COMPLETE-EXACT");

    static private final SubLList $list40 = list(makeSymbol("STRING"), makeSymbol("&OPTIONAL"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"));

    private static final SubLString $str41$Return_a_valid_constant_whose_nam = makeString("Return a valid constant whose name exactly matches STRING.\nOptionally the START and END character positions can be\nspecified, such that the STRING matches characters between the START and \nEND range.  If no constant exists, return NIL.");

    private static final SubLList $list42 = list(list(makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("START"), makeSymbol("FIXNUMP")));

    private static final SubLSymbol CONSTANT_COMPLETE = makeSymbol("CONSTANT-COMPLETE");

    private static final SubLList $list44 = list(makeSymbol("PREFIX"), makeSymbol("&OPTIONAL"), makeSymbol("CASE-SENSITIVE?"), makeSymbol("EXACT-LENGTH?"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"));

    private static final SubLString $str45$Return_all_valid_constants_with_P = makeString("Return all valid constants with PREFIX as a prefix of their name\nWhen CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\nWhen EXACT-LENGTH? is non-nil, the prefix must be the entire string\nOptionally the START and END character positions can be\nspecified, such that the PREFIX matches characters between the START and \nEND range.  If no constant exists, return NIL.");

    private static final SubLList $list46 = list(list(makeSymbol("PREFIX"), makeSymbol("STRINGP")), list(makeSymbol("CASE-SENSITIVE?"), makeSymbol("BOOLEANP")), list(makeSymbol("EXACT-LENGTH?"), makeSymbol("BOOLEANP")), list(makeSymbol("START"), makeSymbol("FIXNUMP")));

    private static final SubLSymbol CONSTANT_APROPOS = makeSymbol("CONSTANT-APROPOS");

    private static final SubLList $list48 = list(makeSymbol("SUBSTRING"), makeSymbol("&OPTIONAL"), makeSymbol("CASE-SENSITIVE?"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"));

    private static final SubLString $str49$Return_all_valid_constants_with_S = makeString("Return all valid constants with SUBSTRING somewhere in their name\nWhen CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\nOptionally the START and END character positions can be\nspecified, such that the SUBSTRING matches characters between the START and \nEND range.  If no constant exists, return NIL.");

    private static final SubLList $list50 = list(list(makeSymbol("SUBSTRING"), makeSymbol("STRINGP")), list(makeSymbol("CASE-SENSITIVE?"), makeSymbol("BOOLEANP")), list(makeSymbol("START"), makeSymbol("FIXNUMP")));

    private static final SubLSymbol CONSTANT_POSTFIX = makeSymbol("CONSTANT-POSTFIX");

    private static final SubLList $list52 = list(makeSymbol("POSTFIX"), makeSymbol("&OPTIONAL"), makeSymbol("CASE-SENSITIVE?"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"));

    private static final SubLString $str53$Return_all_valid_constants_with_P = makeString("Return all valid constants with POSTFIX as a postfix of their name\nWhen CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\nOptionally the START and END character positions can be\nspecified, such that the SUBSTRING matches characters between the START and \nEND range.  If no constant exists, return NIL.");

    static private final SubLList $list54 = list(list(makeSymbol("POSTFIX"), makeSymbol("STRINGP")), list(makeSymbol("CASE-SENSITIVE?"), makeSymbol("BOOLEANP")), list(makeSymbol("START"), makeSymbol("FIXNUMP")));

    static private final SubLList $list55 = list(list(makeSymbol("CONSTANT"), makeSymbol("&KEY"), makeSymbol("DONE"), list(makeSymbol("FORWARD"), T)), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list56 = list($DONE, makeKeyword("FORWARD"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $sym60$ITERATOR = makeUninternedSymbol("ITERATOR");

    private static final SubLSymbol NEW_CONSTANT_COMPLETION_ITERATOR = makeSymbol("NEW-CONSTANT-COMPLETION-ITERATOR");

    private static final SubLSymbol ITERATION_FINALIZE = makeSymbol("ITERATION-FINALIZE");

    static private final SubLList $list65 = list(list(makeSymbol("CONSTANT"), makeSymbol("STRING"), makeSymbol("&KEY"), makeSymbol("DONE"), list(makeSymbol("FORWARD"), T), list(makeSymbol("CASE-SENSITIVE"), T), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list66 = list($DONE, makeKeyword("FORWARD"), makeKeyword("CASE-SENSITIVE"), makeKeyword("START"), makeKeyword("END"));

    private static final SubLSymbol $sym70$ITERATOR = makeUninternedSymbol("ITERATOR");

    private static final SubLSymbol NEW_DIRECTED_CONSTANT_COMPLETION_ITERATOR = makeSymbol("NEW-DIRECTED-CONSTANT-COMPLETION-ITERATOR");

    // Definitions
    /**
     * Deprecated in favor of valid-constant-name-char-p
     * Return T iff CHAR is a character which is allowed in a valid constant name.
     */
    @LispMethod(comment = "Deprecated in favor of valid-constant-name-char-p\r\nReturn T iff CHAR is a character which is allowed in a valid constant name.\nDeprecated in favor of valid-constant-name-char-p\nReturn T iff CHAR is a character which is allowed in a valid constant name.")
    public static final SubLObject valid_constant_name_char_alt(SubLObject v_char) {
        SubLTrampolineFile.checkType(v_char, CHARACTERP);
        return com.cyc.cycjava.cycl.constant_completion_high.valid_constant_name_char_p(v_char);
    }

    // Definitions
    /**
     * Deprecated in favor of valid-constant-name-char-p
     * Return T iff CHAR is a character which is allowed in a valid constant name.
     */
    @LispMethod(comment = "Deprecated in favor of valid-constant-name-char-p\r\nReturn T iff CHAR is a character which is allowed in a valid constant name.\nDeprecated in favor of valid-constant-name-char-p\nReturn T iff CHAR is a character which is allowed in a valid constant name.")
    public static SubLObject valid_constant_name_char(final SubLObject v_char) {
        SubLTrampolineFile.enforceType(v_char, CHARACTERP);
        return valid_constant_name_char_p(v_char);
    }

    /**
     * Return T iff CHAR is a character which is allowed in a valid constant name.
     */
    @LispMethod(comment = "Return T iff CHAR is a character which is allowed in a valid constant name.")
    public static final SubLObject valid_constant_name_char_p_alt(SubLObject v_char) {
        SubLTrampolineFile.checkType(v_char, CHARACTERP);
        return makeBoolean((NIL != alphanumericp(v_char)) || (NIL != find(v_char, $str_alt7$___, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    /**
     * Return T iff CHAR is a character which is allowed in a valid constant name.
     */
    @LispMethod(comment = "Return T iff CHAR is a character which is allowed in a valid constant name.")
    public static SubLObject valid_constant_name_char_p(final SubLObject v_char) {
        SubLTrampolineFile.enforceType(v_char, CHARACTERP);
        return makeBoolean(((NIL != alphanumericp(v_char)) && (NIL != unicode_strings.ascii_char_p(v_char))) || (NIL != find(v_char, $str7$___, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    /**
     * Deprecated in favor of valid-constant-name-p
     * Return T iff STRING is a valid name for a constant.
     */
    @LispMethod(comment = "Deprecated in favor of valid-constant-name-p\r\nReturn T iff STRING is a valid name for a constant.\nDeprecated in favor of valid-constant-name-p\nReturn T iff STRING is a valid name for a constant.")
    public static final SubLObject valid_constant_name_alt(SubLObject string) {
        return com.cyc.cycjava.cycl.constant_completion_high.valid_constant_name_p(string);
    }

    /**
     * Deprecated in favor of valid-constant-name-p
     * Return T iff STRING is a valid name for a constant.
     */
    @LispMethod(comment = "Deprecated in favor of valid-constant-name-p\r\nReturn T iff STRING is a valid name for a constant.\nDeprecated in favor of valid-constant-name-p\nReturn T iff STRING is a valid name for a constant.")
    public static SubLObject valid_constant_name(final SubLObject string) {
        return valid_constant_name_p(string);
    }

    /**
     * Return T iff STRING is a valid name for a constant.
     */
    @LispMethod(comment = "Return T iff STRING is a valid name for a constant.")
    public static final SubLObject valid_constant_name_p_alt(SubLObject string) {
        return makeBoolean((string.isString() && length(string).numGE(TWO_INTEGER)) && (NIL == find_if(symbol_function(INVALID_CONSTANT_NAME_CHAR_P), string, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    /**
     * Return T iff STRING is a valid name for a constant.
     */
    @LispMethod(comment = "Return T iff STRING is a valid name for a constant.")
    public static SubLObject valid_constant_name_p(final SubLObject string) {
        return makeBoolean((string.isString() && length(string).numGE(TWO_INTEGER)) && (NIL == find_if(symbol_function(INVALID_CONSTANT_NAME_CHAR_P), string, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    /**
     * Return T iff CHAR is a character which is not allowed in a valid constant name.
     */
    @LispMethod(comment = "Return T iff CHAR is a character which is not allowed in a valid constant name.")
    public static final SubLObject invalid_constant_name_char_p_alt(SubLObject v_char) {
        return makeBoolean(NIL == com.cyc.cycjava.cycl.constant_completion_high.valid_constant_name_char_p(v_char));
    }

    /**
     * Return T iff CHAR is a character which is not allowed in a valid constant name.
     */
    @LispMethod(comment = "Return T iff CHAR is a character which is not allowed in a valid constant name.")
    public static SubLObject invalid_constant_name_char_p(final SubLObject v_char) {
        return makeBoolean(NIL == valid_constant_name_char_p(v_char));
    }

    /**
     *
     *
     * @return booleanp; whether OBJECT is a specification for a constant name,
    i.e. either a valid constant name or :unnamed.
     */
    @LispMethod(comment = "@return booleanp; whether OBJECT is a specification for a constant name,\r\ni.e. either a valid constant name or :unnamed.")
    public static final SubLObject constant_name_spec_p_alt(SubLObject v_object) {
        return makeBoolean(($UNNAMED == v_object) || (NIL != com.cyc.cycjava.cycl.constant_completion_high.valid_constant_name_p(v_object)));
    }

    /**
     *
     *
     * @return booleanp; whether OBJECT is a specification for a constant name,
    i.e. either a valid constant name or :unnamed.
     */
    @LispMethod(comment = "@return booleanp; whether OBJECT is a specification for a constant name,\r\ni.e. either a valid constant name or :unnamed.")
    public static SubLObject constant_name_spec_p(final SubLObject v_object) {
        return makeBoolean(($UNNAMED == v_object) || (NIL != valid_constant_name_p(v_object)));
    }

    /**
     * Return T iff NAME is a valid constant name currently available for use.
     */
    @LispMethod(comment = "Return T iff NAME is a valid constant name currently available for use.")
    public static final SubLObject constant_name_available_alt(SubLObject name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(name, STRINGP);
            if (NIL == com.cyc.cycjava.cycl.constant_completion_high.valid_constant_name_p(name)) {
                return NIL;
            } else {
                if (NIL != $require_case_insensitive_name_uniqueness$.getDynamicValue(thread)) {
                    return sublisp_null(com.cyc.cycjava.cycl.constant_completion_high.constant_complete(name, NIL, T, UNPROVIDED, UNPROVIDED));
                } else {
                    return sublisp_null(com.cyc.cycjava.cycl.constant_completion_high.constant_complete_exact(name, UNPROVIDED, UNPROVIDED));
                }
            }
        }
    }

    /**
     * Return T iff NAME is a valid constant name currently available for use.
     */
    @LispMethod(comment = "Return T iff NAME is a valid constant name currently available for use.")
    public static SubLObject constant_name_available(final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(name, STRINGP);
        if (NIL == valid_constant_name_p(name)) {
            return NIL;
        }
        if (NIL != $require_case_insensitive_name_uniqueness$.getDynamicValue(thread)) {
            return sublisp_null(constant_complete(name, NIL, T, UNPROVIDED, UNPROVIDED));
        }
        return sublisp_null(constant_complete_exact(name, UNPROVIDED, UNPROVIDED));
    }

    /**
     * Return a unique, currently unused constant name based on NAME, which must be a valid constant name.
     */
    @LispMethod(comment = "Return a unique, currently unused constant name based on NAME, which must be a valid constant name.")
    public static final SubLObject uniquify_constant_name(SubLObject name) {
        SubLTrampolineFile.checkType(name, VALID_CONSTANT_NAME_P);
        if (NIL != com.cyc.cycjava.cycl.constant_completion_high.constant_name_available(name)) {
            return name;
        }
        {
            SubLObject suffix = number_utilities.f_1X(random.random(NINE_INTEGER));
            SubLObject new_name = cconcatenate(format_nil.format_nil_a_no_copy(name), new SubLObject[]{ $str_alt23$_, format_nil.format_nil_a_no_copy(suffix) });
            while (NIL == com.cyc.cycjava.cycl.constant_completion_high.constant_name_available(new_name)) {
                suffix = add(multiply(TEN_INTEGER, suffix), random.random(TEN_INTEGER));
                new_name = cconcatenate(format_nil.format_nil_a_no_copy(name), new SubLObject[]{ $str_alt23$_, format_nil.format_nil_a_no_copy(suffix) });
            } 
            return new_name;
        }
    }

    public static SubLObject uniquify_constant_name(final SubLObject name, SubLObject sequentialP) {
        if (sequentialP == UNPROVIDED) {
            sequentialP = NIL;
        }
        SubLTrampolineFile.enforceType(name, VALID_CONSTANT_NAME_P);
        SubLTrampolineFile.enforceType(sequentialP, BOOLEANP);
        if (NIL != constant_name_available(name)) {
            return name;
        }
        if (NIL != sequentialP) {
            final SubLObject known_previous_index = get_last_known_index_for_constant_prefix(name);
            SubLObject index = NIL;
            index = known_previous_index;
            SubLObject new_name;
            while (true) {
                new_name = cconcatenate(format_nil.format_nil_a_no_copy(name), new SubLObject[]{ $str24$_, format_nil.format_nil_a_no_copy(index) });
                if (NIL != constant_name_available(new_name)) {
                    break;
                }
                index = number_utilities.f_1X(index);
            } 
            set_last_known_index_for_constant_prefix(name, index);
            return new_name;
        }
        SubLObject suffix;
        SubLObject new_name2;
        for (suffix = number_utilities.f_1X(random.random(NINE_INTEGER)), new_name2 = cconcatenate(format_nil.format_nil_a_no_copy(name), new SubLObject[]{ $str24$_, format_nil.format_nil_a_no_copy(suffix) }); NIL == constant_name_available(new_name2); new_name2 = cconcatenate(format_nil.format_nil_a_no_copy(name), new SubLObject[]{ $str24$_, format_nil.format_nil_a_no_copy(suffix) })) {
            suffix = add(multiply(TEN_INTEGER, suffix), random.random(TEN_INTEGER));
        }
        return new_name2;
    }

    public static SubLObject get_last_known_index_for_constant_prefix(final SubLObject prefix) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return dictionary.dictionary_lookup($last_known_index_for_constant_prefix_dict$.getDynamicValue(thread), prefix, ONE_INTEGER);
    }

    public static SubLObject set_last_known_index_for_constant_prefix(final SubLObject prefix, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return dictionary.dictionary_enter($last_known_index_for_constant_prefix_dict$.getDynamicValue(thread), prefix, value);
    }

    /**
     * Return a list of constants whose names differ from STRING only by case.
     */
    @LispMethod(comment = "Return a list of constants whose names differ from STRING only by case.")
    public static final SubLObject constant_name_case_collisions_alt(SubLObject string) {
        SubLTrampolineFile.checkType(string, VALID_CONSTANT_NAME_P);
        {
            SubLObject uses = com.cyc.cycjava.cycl.constant_completion_high.constant_complete(string, NIL, T, UNPROVIDED, UNPROVIDED);
            uses = delete(string, uses, symbol_function(EQUAL), symbol_function(CONSTANT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return uses;
        }
    }

    /**
     * Return a list of constants whose names differ from STRING only by case.
     */
    @LispMethod(comment = "Return a list of constants whose names differ from STRING only by case.")
    public static SubLObject constant_name_case_collisions(final SubLObject string) {
        SubLTrampolineFile.enforceType(string, VALID_CONSTANT_NAME_P);
        SubLObject uses = constant_complete(string, NIL, T, UNPROVIDED, UNPROVIDED);
        uses = delete(string, uses, symbol_function(EQUAL), symbol_function(CONSTANT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return uses;
    }

    /**
     * Return a constant whose name differs from STRING only by case.
     */
    @LispMethod(comment = "Return a constant whose name differs from STRING only by case.")
    public static final SubLObject constant_name_case_collision_alt(SubLObject string) {
        SubLTrampolineFile.checkType(string, VALID_CONSTANT_NAME_P);
        return com.cyc.cycjava.cycl.constant_completion_high.constant_name_case_collisions(string).first();
    }

    /**
     * Return a constant whose name differs from STRING only by case.
     */
    @LispMethod(comment = "Return a constant whose name differs from STRING only by case.")
    public static SubLObject constant_name_case_collision(final SubLObject string) {
        SubLTrampolineFile.enforceType(string, VALID_CONSTANT_NAME_P);
        return constant_name_case_collisions(string).first();
    }

    /**
     * Return a valid constant whose name exactly matches STRING.
     * Optionally the START and END character positions can be
     * specified, such that the STRING matches characters between the START and
     * END range.  If no constant exists, return NIL.
     */
    @LispMethod(comment = "Return a valid constant whose name exactly matches STRING.\r\nOptionally the START and END character positions can be\r\nspecified, such that the STRING matches characters between the START and\r\nEND range.  If no constant exists, return NIL.\nReturn a valid constant whose name exactly matches STRING.\nOptionally the START and END character positions can be\nspecified, such that the STRING matches characters between the START and\nEND range.  If no constant exists, return NIL.")
    public static final SubLObject constant_complete_exact_alt(SubLObject string, SubLObject start, SubLObject end) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        SubLTrampolineFile.checkType(string, STRINGP);
        SubLTrampolineFile.checkType(start, FIXNUMP);
        return constant_completion_interface.kb_constant_complete_exact(string, start, end);
    }

    /**
     * Return a valid constant whose name exactly matches STRING.
     * Optionally the START and END character positions can be
     * specified, such that the STRING matches characters between the START and
     * END range.  If no constant exists, return NIL.
     */
    @LispMethod(comment = "Return a valid constant whose name exactly matches STRING.\r\nOptionally the START and END character positions can be\r\nspecified, such that the STRING matches characters between the START and\r\nEND range.  If no constant exists, return NIL.\nReturn a valid constant whose name exactly matches STRING.\nOptionally the START and END character positions can be\nspecified, such that the STRING matches characters between the START and\nEND range.  If no constant exists, return NIL.")
    public static SubLObject constant_complete_exact(final SubLObject string, SubLObject start, SubLObject end) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        // com.cyc.cycjava.cycl.constants_low.lookup_constant_by_guid();
        SubLTrampolineFile.enforceType(string, STRINGP);
        SubLTrampolineFile.enforceType(start, FIXNUMP);
        return constant_completion_interface.kb_constant_complete_exact(string, start, end);
    }

    /**
     * Return all valid constants with PREFIX as a prefix of their name
     * When CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.
     * When EXACT-LENGTH? is non-nil, the prefix must be the entire string
     * Optionally the START and END character positions can be
     * specified, such that the PREFIX matches characters between the START and
     * END range.  If no constant exists, return NIL.
     */
    @LispMethod(comment = "Return all valid constants with PREFIX as a prefix of their name\r\nWhen CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\r\nWhen EXACT-LENGTH? is non-nil, the prefix must be the entire string\r\nOptionally the START and END character positions can be\r\nspecified, such that the PREFIX matches characters between the START and\r\nEND range.  If no constant exists, return NIL.\nReturn all valid constants with PREFIX as a prefix of their name\nWhen CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\nWhen EXACT-LENGTH? is non-nil, the prefix must be the entire string\nOptionally the START and END character positions can be\nspecified, such that the PREFIX matches characters between the START and\nEND range.  If no constant exists, return NIL.")
    public static final SubLObject constant_complete_alt(SubLObject prefix, SubLObject case_sensitiveP, SubLObject exact_lengthP, SubLObject start, SubLObject end) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        if (exact_lengthP == UNPROVIDED) {
            exact_lengthP = NIL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        SubLTrampolineFile.checkType(prefix, STRINGP);
        SubLTrampolineFile.checkType(case_sensitiveP, BOOLEANP);
        SubLTrampolineFile.checkType(exact_lengthP, BOOLEANP);
        SubLTrampolineFile.checkType(start, FIXNUMP);
        return constant_completion_interface.kb_constant_complete(prefix, case_sensitiveP, exact_lengthP, start, end);
    }

    /**
     * Return all valid constants with PREFIX as a prefix of their name
     * When CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.
     * When EXACT-LENGTH? is non-nil, the prefix must be the entire string
     * Optionally the START and END character positions can be
     * specified, such that the PREFIX matches characters between the START and
     * END range.  If no constant exists, return NIL.
     */
    @LispMethod(comment = "Return all valid constants with PREFIX as a prefix of their name\r\nWhen CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\r\nWhen EXACT-LENGTH? is non-nil, the prefix must be the entire string\r\nOptionally the START and END character positions can be\r\nspecified, such that the PREFIX matches characters between the START and\r\nEND range.  If no constant exists, return NIL.\nReturn all valid constants with PREFIX as a prefix of their name\nWhen CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\nWhen EXACT-LENGTH? is non-nil, the prefix must be the entire string\nOptionally the START and END character positions can be\nspecified, such that the PREFIX matches characters between the START and\nEND range.  If no constant exists, return NIL.")
    public static SubLObject constant_complete(final SubLObject prefix, SubLObject case_sensitiveP, SubLObject exact_lengthP, SubLObject start, SubLObject end) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        if (exact_lengthP == UNPROVIDED) {
            exact_lengthP = NIL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        SubLTrampolineFile.enforceType(prefix, STRINGP);
        SubLTrampolineFile.enforceType(case_sensitiveP, BOOLEANP);
        SubLTrampolineFile.enforceType(exact_lengthP, BOOLEANP);
        SubLTrampolineFile.enforceType(start, FIXNUMP);
        return constant_completion_interface.kb_constant_complete(prefix, case_sensitiveP, exact_lengthP, start, end);
    }

    /**
     * Return all valid constants with SUBSTRING somewhere in their name
     * When CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.
     * Optionally the START and END character positions can be
     * specified, such that the SUBSTRING matches characters between the START and
     * END range.  If no constant exists, return NIL.
     */
    @LispMethod(comment = "Return all valid constants with SUBSTRING somewhere in their name\r\nWhen CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\r\nOptionally the START and END character positions can be\r\nspecified, such that the SUBSTRING matches characters between the START and\r\nEND range.  If no constant exists, return NIL.\nReturn all valid constants with SUBSTRING somewhere in their name\nWhen CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\nOptionally the START and END character positions can be\nspecified, such that the SUBSTRING matches characters between the START and\nEND range.  If no constant exists, return NIL.")
    public static final SubLObject constant_apropos_alt(SubLObject substring, SubLObject case_sensitiveP, SubLObject start, SubLObject end) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        SubLTrampolineFile.checkType(substring, STRINGP);
        SubLTrampolineFile.checkType(case_sensitiveP, BOOLEANP);
        SubLTrampolineFile.checkType(start, FIXNUMP);
        return constant_completion_interface.kb_constant_apropos(substring, case_sensitiveP, start, end);
    }

    /**
     * Return all valid constants with SUBSTRING somewhere in their name
     * When CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.
     * Optionally the START and END character positions can be
     * specified, such that the SUBSTRING matches characters between the START and
     * END range.  If no constant exists, return NIL.
     */
    @LispMethod(comment = "Return all valid constants with SUBSTRING somewhere in their name\r\nWhen CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\r\nOptionally the START and END character positions can be\r\nspecified, such that the SUBSTRING matches characters between the START and\r\nEND range.  If no constant exists, return NIL.\nReturn all valid constants with SUBSTRING somewhere in their name\nWhen CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\nOptionally the START and END character positions can be\nspecified, such that the SUBSTRING matches characters between the START and\nEND range.  If no constant exists, return NIL.")
    public static SubLObject constant_apropos(final SubLObject substring, SubLObject case_sensitiveP, SubLObject start, SubLObject end) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        SubLTrampolineFile.enforceType(substring, STRINGP);
        SubLTrampolineFile.enforceType(case_sensitiveP, BOOLEANP);
        SubLTrampolineFile.enforceType(start, FIXNUMP);
        return constant_completion_interface.kb_constant_apropos(substring, case_sensitiveP, start, end);
    }

    /**
     * Return all valid constants with POSTFIX as a postfix of their name
     * When CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.
     * Optionally the START and END character positions can be
     * specified, such that the SUBSTRING matches characters between the START and
     * END range.  If no constant exists, return NIL.
     */
    @LispMethod(comment = "Return all valid constants with POSTFIX as a postfix of their name\r\nWhen CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\r\nOptionally the START and END character positions can be\r\nspecified, such that the SUBSTRING matches characters between the START and\r\nEND range.  If no constant exists, return NIL.\nReturn all valid constants with POSTFIX as a postfix of their name\nWhen CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\nOptionally the START and END character positions can be\nspecified, such that the SUBSTRING matches characters between the START and\nEND range.  If no constant exists, return NIL.")
    public static final SubLObject constant_postfix_alt(SubLObject postfix, SubLObject case_sensitiveP, SubLObject start, SubLObject end) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        SubLTrampolineFile.checkType(postfix, STRINGP);
        SubLTrampolineFile.checkType(case_sensitiveP, BOOLEANP);
        SubLTrampolineFile.checkType(start, FIXNUMP);
        return constant_completion_interface.kb_constant_postfix(postfix, case_sensitiveP, start, end);
    }

    /**
     * Return all valid constants with POSTFIX as a postfix of their name
     * When CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.
     * Optionally the START and END character positions can be
     * specified, such that the SUBSTRING matches characters between the START and
     * END range.  If no constant exists, return NIL.
     */
    @LispMethod(comment = "Return all valid constants with POSTFIX as a postfix of their name\r\nWhen CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\r\nOptionally the START and END character positions can be\r\nspecified, such that the SUBSTRING matches characters between the START and\r\nEND range.  If no constant exists, return NIL.\nReturn all valid constants with POSTFIX as a postfix of their name\nWhen CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\nOptionally the START and END character positions can be\nspecified, such that the SUBSTRING matches characters between the START and\nEND range.  If no constant exists, return NIL.")
    public static SubLObject constant_postfix(final SubLObject postfix, SubLObject case_sensitiveP, SubLObject start, SubLObject end) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        SubLTrampolineFile.enforceType(postfix, STRINGP);
        SubLTrampolineFile.enforceType(case_sensitiveP, BOOLEANP);
        SubLTrampolineFile.enforceType(start, FIXNUMP);
        return constant_completion_interface.kb_constant_postfix(postfix, case_sensitiveP, start, end);
    }

    /**
     * Return the N constants with names before STRING.  When CASE-SENSITIVE? is non-nil,
     * the comparison is done in a case-sensitive fashion.  Optionally the START and END
     * character positions can be specified, such that STRING matches characters between
     * the START and END range.  If STRICT? is non-nil, then only constants strictly
     * before the string are returned.
     */
    @LispMethod(comment = "Return the N constants with names before STRING.  When CASE-SENSITIVE? is non-nil,\r\nthe comparison is done in a case-sensitive fashion.  Optionally the START and END\r\ncharacter positions can be specified, such that STRING matches characters between\r\nthe START and END range.  If STRICT? is non-nil, then only constants strictly\r\nbefore the string are returned.\nReturn the N constants with names before STRING.  When CASE-SENSITIVE? is non-nil,\nthe comparison is done in a case-sensitive fashion.  Optionally the START and END\ncharacter positions can be specified, such that STRING matches characters between\nthe START and END range.  If STRICT? is non-nil, then only constants strictly\nbefore the string are returned.")
    public static final SubLObject n_constants_before_alt(SubLObject n, SubLObject string, SubLObject case_sensitiveP, SubLObject start, SubLObject end, SubLObject strictP) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if (strictP == UNPROVIDED) {
            strictP = NIL;
        }
        return constant_completion_interface.kb_n_constants_before(n, string, case_sensitiveP, start, end, strictP);
    }

    /**
     * Return the N constants with names before STRING.  When CASE-SENSITIVE? is non-nil,
     * the comparison is done in a case-sensitive fashion.  Optionally the START and END
     * character positions can be specified, such that STRING matches characters between
     * the START and END range.  If STRICT? is non-nil, then only constants strictly
     * before the string are returned.
     */
    @LispMethod(comment = "Return the N constants with names before STRING.  When CASE-SENSITIVE? is non-nil,\r\nthe comparison is done in a case-sensitive fashion.  Optionally the START and END\r\ncharacter positions can be specified, such that STRING matches characters between\r\nthe START and END range.  If STRICT? is non-nil, then only constants strictly\r\nbefore the string are returned.\nReturn the N constants with names before STRING.  When CASE-SENSITIVE? is non-nil,\nthe comparison is done in a case-sensitive fashion.  Optionally the START and END\ncharacter positions can be specified, such that STRING matches characters between\nthe START and END range.  If STRICT? is non-nil, then only constants strictly\nbefore the string are returned.")
    public static SubLObject n_constants_before(final SubLObject n, final SubLObject string, SubLObject case_sensitiveP, SubLObject start, SubLObject end, SubLObject strictP) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if (strictP == UNPROVIDED) {
            strictP = NIL;
        }
        return constant_completion_interface.kb_n_constants_before(n, string, case_sensitiveP, start, end, strictP);
    }

    /**
     * Return the N constants with names after STRING.  When CASE-SENSITIVE? is non-nil,
     * the comparison is done in a case-sensitive fashion.  Optionally the START and END
     * character positions can be specified, such that STRING matches characters between
     * the START and END range. If STRICT? is non-nil, then only constants strictly after
     * the string are returned.
     */
    @LispMethod(comment = "Return the N constants with names after STRING.  When CASE-SENSITIVE? is non-nil,\r\nthe comparison is done in a case-sensitive fashion.  Optionally the START and END\r\ncharacter positions can be specified, such that STRING matches characters between\r\nthe START and END range. If STRICT? is non-nil, then only constants strictly after\r\nthe string are returned.\nReturn the N constants with names after STRING.  When CASE-SENSITIVE? is non-nil,\nthe comparison is done in a case-sensitive fashion.  Optionally the START and END\ncharacter positions can be specified, such that STRING matches characters between\nthe START and END range. If STRICT? is non-nil, then only constants strictly after\nthe string are returned.")
    public static final SubLObject n_constants_after_alt(SubLObject n, SubLObject string, SubLObject case_sensitiveP, SubLObject start, SubLObject end, SubLObject strictP) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if (strictP == UNPROVIDED) {
            strictP = NIL;
        }
        return constant_completion_interface.kb_n_constants_after(n, string, case_sensitiveP, start, end, strictP);
    }

    /**
     * Return the N constants with names after STRING.  When CASE-SENSITIVE? is non-nil,
     * the comparison is done in a case-sensitive fashion.  Optionally the START and END
     * character positions can be specified, such that STRING matches characters between
     * the START and END range. If STRICT? is non-nil, then only constants strictly after
     * the string are returned.
     */
    @LispMethod(comment = "Return the N constants with names after STRING.  When CASE-SENSITIVE? is non-nil,\r\nthe comparison is done in a case-sensitive fashion.  Optionally the START and END\r\ncharacter positions can be specified, such that STRING matches characters between\r\nthe START and END range. If STRICT? is non-nil, then only constants strictly after\r\nthe string are returned.\nReturn the N constants with names after STRING.  When CASE-SENSITIVE? is non-nil,\nthe comparison is done in a case-sensitive fashion.  Optionally the START and END\ncharacter positions can be specified, such that STRING matches characters between\nthe START and END range. If STRICT? is non-nil, then only constants strictly after\nthe string are returned.")
    public static SubLObject n_constants_after(final SubLObject n, final SubLObject string, SubLObject case_sensitiveP, SubLObject start, SubLObject end, SubLObject strictP) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if (strictP == UNPROVIDED) {
            strictP = NIL;
        }
        return constant_completion_interface.kb_n_constants_after(n, string, case_sensitiveP, start, end, strictP);
    }

    public static final SubLObject new_constant_completion_iterator_alt(SubLObject forwardP, SubLObject buffer_size) {
        if (forwardP == UNPROVIDED) {
            forwardP = T;
        }
        if (buffer_size == UNPROVIDED) {
            buffer_size = ONE_INTEGER;
        }
        return constant_completion_interface.kb_new_constant_completion_iterator(forwardP, buffer_size);
    }

    public static SubLObject new_constant_completion_iterator(SubLObject forwardP, SubLObject buffer_size) {
        if (forwardP == UNPROVIDED) {
            forwardP = T;
        }
        if (buffer_size == UNPROVIDED) {
            buffer_size = ONE_INTEGER;
        }
        return constant_completion_interface.kb_new_constant_completion_iterator(forwardP, buffer_size);
    }

    public static final SubLObject new_directed_constant_completion_iterator_alt(SubLObject string, SubLObject case_sensitiveP, SubLObject start, SubLObject end, SubLObject forwardP, SubLObject buffer_size) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = T;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if (forwardP == UNPROVIDED) {
            forwardP = T;
        }
        if (buffer_size == UNPROVIDED) {
            buffer_size = ONE_INTEGER;
        }
        return constant_completion_interface.kb_new_directed_constant_completion_iterator(string, case_sensitiveP, start, end, forwardP, buffer_size);
    }

    public static SubLObject new_directed_constant_completion_iterator(final SubLObject string, SubLObject case_sensitiveP, SubLObject start, SubLObject end, SubLObject forwardP, SubLObject buffer_size) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = T;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if (forwardP == UNPROVIDED) {
            forwardP = T;
        }
        if (buffer_size == UNPROVIDED) {
            buffer_size = ONE_INTEGER;
        }
        return constant_completion_interface.kb_new_directed_constant_completion_iterator(string, case_sensitiveP, start, end, forwardP, buffer_size);
    }

    /**
     * Call FUNCTION on each constant in the completion table
     */
    @LispMethod(comment = "Call FUNCTION on each constant in the completion table")
    public static final SubLObject map_constants_in_completions_alt(SubLObject function) {
        {
            SubLObject iterator = com.cyc.cycjava.cycl.constant_completion_high.new_constant_completion_iterator(UNPROVIDED, UNPROVIDED);
            return iteration.map_iterator(function, iterator);
        }
    }

    /**
     * Call FUNCTION on each constant in the completion table
     */
    @LispMethod(comment = "Call FUNCTION on each constant in the completion table")
    public static SubLObject map_constants_in_completions(final SubLObject function) {
        final SubLObject iterator = new_constant_completion_iterator(UNPROVIDED, UNPROVIDED);
        return iteration.map_iterator(function, iterator);
    }

    /**
     * Call FUNCTION on each constant in the completion table starting with STRING.
     * Map alphabetically forward if FORWARD is non-nil, else map backward.
     */
    @LispMethod(comment = "Call FUNCTION on each constant in the completion table starting with STRING.\r\nMap alphabetically forward if FORWARD is non-nil, else map backward.\nCall FUNCTION on each constant in the completion table starting with STRING.\nMap alphabetically forward if FORWARD is non-nil, else map backward.")
    public static final SubLObject map_constant_completions_around_alt(SubLObject function, SubLObject string, SubLObject v_forward, SubLObject start, SubLObject end) {
        if (v_forward == UNPROVIDED) {
            v_forward = T;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        {
            SubLObject iterator = com.cyc.cycjava.cycl.constant_completion_high.new_directed_constant_completion_iterator(string, T, start, end, v_forward, UNPROVIDED);
            return iteration.map_iterator(function, iterator);
        }
    }

    /**
     * Call FUNCTION on each constant in the completion table starting with STRING.
     * Map alphabetically forward if FORWARD is non-nil, else map backward.
     */
    @LispMethod(comment = "Call FUNCTION on each constant in the completion table starting with STRING.\r\nMap alphabetically forward if FORWARD is non-nil, else map backward.\nCall FUNCTION on each constant in the completion table starting with STRING.\nMap alphabetically forward if FORWARD is non-nil, else map backward.")
    public static SubLObject map_constant_completions_around(final SubLObject function, final SubLObject string, SubLObject v_forward, SubLObject start, SubLObject end) {
        if (v_forward == UNPROVIDED) {
            v_forward = T;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        final SubLObject iterator = new_directed_constant_completion_iterator(string, T, start, end, v_forward, UNPROVIDED);
        return iteration.map_iterator(function, iterator);
    }

    public static final SubLObject do_constants_in_completions_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt54);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject constant = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt54);
                    constant = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt54);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt54);
                            if (NIL == member(current_1, $list_alt55, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt54);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            SubLObject forward_tail = property_list_member($FORWARD, current);
                            SubLObject v_forward = (NIL != forward_tail) ? ((SubLObject) (cadr(forward_tail))) : T;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject iterator = $sym59$ITERATOR;
                                return list(CLET, list(list(iterator, list(NEW_CONSTANT_COMPLETION_ITERATOR, v_forward))), listS(DO_ITERATOR, list(constant, iterator, $DONE, done), append(body, NIL)), list(ITERATION_FINALIZE, iterator));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_constants_in_completions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list55);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject constant = NIL;
        destructuring_bind_must_consp(current, datum, $list55);
        constant = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list55);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list55);
            if (NIL == member(current_$1, $list56, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list55);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject forward_tail = property_list_member($FORWARD, current);
        final SubLObject v_forward = (NIL != forward_tail) ? cadr(forward_tail) : T;
        final SubLObject body;
        current = body = temp;
        final SubLObject iterator = $sym60$ITERATOR;
        return list(CLET, list(list(iterator, list(NEW_CONSTANT_COMPLETION_ITERATOR, v_forward))), listS(DO_ITERATOR, list(constant, iterator, $DONE, done), append(body, NIL)), list(ITERATION_FINALIZE, iterator));
    }

    public static final SubLObject do_constant_completions_around_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt64);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject constant = NIL;
                    SubLObject string = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt64);
                    constant = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt64);
                    string = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_2 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt64);
                            current_2 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt64);
                            if (NIL == member(current_2, $list_alt65, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_2 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt64);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            SubLObject forward_tail = property_list_member($FORWARD, current);
                            SubLObject v_forward = (NIL != forward_tail) ? ((SubLObject) (cadr(forward_tail))) : T;
                            SubLObject case_sensitive_tail = property_list_member($CASE_SENSITIVE, current);
                            SubLObject case_sensitive = (NIL != case_sensitive_tail) ? ((SubLObject) (cadr(case_sensitive_tail))) : T;
                            SubLObject start_tail = property_list_member($START, current);
                            SubLObject start = (NIL != start_tail) ? ((SubLObject) (cadr(start_tail))) : ZERO_INTEGER;
                            SubLObject end_tail = property_list_member($END, current);
                            SubLObject end = (NIL != end_tail) ? ((SubLObject) (cadr(end_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject iterator = $sym69$ITERATOR;
                                return list(CLET, list(list(iterator, list(NEW_DIRECTED_CONSTANT_COMPLETION_ITERATOR, string, case_sensitive, start, end, v_forward))), listS(DO_ITERATOR, list(constant, iterator, $DONE, done), append(body, NIL)), list(ITERATION_FINALIZE, iterator));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_constant_completions_around(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list65);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject constant = NIL;
        SubLObject string = NIL;
        destructuring_bind_must_consp(current, datum, $list65);
        constant = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list65);
        string = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list65);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list65);
            if (NIL == member(current_$2, $list66, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list65);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject forward_tail = property_list_member($FORWARD, current);
        final SubLObject v_forward = (NIL != forward_tail) ? cadr(forward_tail) : T;
        final SubLObject case_sensitive_tail = property_list_member($CASE_SENSITIVE, current);
        final SubLObject case_sensitive = (NIL != case_sensitive_tail) ? cadr(case_sensitive_tail) : T;
        final SubLObject start_tail = property_list_member($START, current);
        final SubLObject start = (NIL != start_tail) ? cadr(start_tail) : ZERO_INTEGER;
        final SubLObject end_tail = property_list_member($END, current);
        final SubLObject end = (NIL != end_tail) ? cadr(end_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject iterator = $sym70$ITERATOR;
        return list(CLET, list(list(iterator, list(NEW_DIRECTED_CONSTANT_COMPLETION_ITERATOR, string, case_sensitive, start, end, v_forward))), listS(DO_ITERATOR, list(constant, iterator, $DONE, done), append(body, NIL)), list(ITERATION_FINALIZE, iterator));
    }

    public static final SubLObject declare_constant_completion_high_file_alt() {
        declareFunction("valid_constant_name_char", "VALID-CONSTANT-NAME-CHAR", 1, 0, false);
        declareFunction("valid_constant_name_char_p", "VALID-CONSTANT-NAME-CHAR-P", 1, 0, false);
        declareFunction("valid_constant_name", "VALID-CONSTANT-NAME", 1, 0, false);
        declareFunction("valid_constant_name_p", "VALID-CONSTANT-NAME-P", 1, 0, false);
        declareFunction("invalid_constant_name_char_p", "INVALID-CONSTANT-NAME-CHAR-P", 1, 0, false);
        new com.cyc.cycjava.cycl.constant_completion_high.$invalid_constant_name_char_p$UnaryFunction();
        declareFunction("constant_name_spec_p", "CONSTANT-NAME-SPEC-P", 1, 0, false);
        declareFunction("constant_name_available", "CONSTANT-NAME-AVAILABLE", 1, 0, false);
        declareFunction("uniquify_constant_name", "UNIQUIFY-CONSTANT-NAME", 1, 0, false);
        declareFunction("constant_name_case_collisions", "CONSTANT-NAME-CASE-COLLISIONS", 1, 0, false);
        declareFunction("constant_name_case_collision", "CONSTANT-NAME-CASE-COLLISION", 1, 0, false);
        declareFunction("constant_complete_exact", "CONSTANT-COMPLETE-EXACT", 1, 2, false);
        declareFunction("constant_complete", "CONSTANT-COMPLETE", 1, 4, false);
        declareFunction("constant_apropos", "CONSTANT-APROPOS", 1, 3, false);
        declareFunction("constant_postfix", "CONSTANT-POSTFIX", 1, 3, false);
        declareFunction("n_constants_before", "N-CONSTANTS-BEFORE", 2, 4, false);
        declareFunction("n_constants_after", "N-CONSTANTS-AFTER", 2, 4, false);
        declareFunction("new_constant_completion_iterator", "NEW-CONSTANT-COMPLETION-ITERATOR", 0, 2, false);
        declareFunction("new_directed_constant_completion_iterator", "NEW-DIRECTED-CONSTANT-COMPLETION-ITERATOR", 1, 5, false);
        declareFunction("map_constants_in_completions", "MAP-CONSTANTS-IN-COMPLETIONS", 1, 0, false);
        declareFunction("map_constant_completions_around", "MAP-CONSTANT-COMPLETIONS-AROUND", 2, 3, false);
        declareMacro("do_constants_in_completions", "DO-CONSTANTS-IN-COMPLETIONS");
        declareMacro("do_constant_completions_around", "DO-CONSTANT-COMPLETIONS-AROUND");
        return NIL;
    }

    public static SubLObject declare_constant_completion_high_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("valid_constant_name_char", "VALID-CONSTANT-NAME-CHAR", 1, 0, false);
            declareFunction("valid_constant_name_char_p", "VALID-CONSTANT-NAME-CHAR-P", 1, 0, false);
            declareFunction("valid_constant_name", "VALID-CONSTANT-NAME", 1, 0, false);
            declareFunction("valid_constant_name_p", "VALID-CONSTANT-NAME-P", 1, 0, false);
            declareFunction("invalid_constant_name_char_p", "INVALID-CONSTANT-NAME-CHAR-P", 1, 0, false);
            new constant_completion_high.$invalid_constant_name_char_p$UnaryFunction();
            declareFunction("constant_name_spec_p", "CONSTANT-NAME-SPEC-P", 1, 0, false);
            declareFunction("constant_name_available", "CONSTANT-NAME-AVAILABLE", 1, 0, false);
            declareFunction("uniquify_constant_name", "UNIQUIFY-CONSTANT-NAME", 1, 1, false);
            declareFunction("get_last_known_index_for_constant_prefix", "GET-LAST-KNOWN-INDEX-FOR-CONSTANT-PREFIX", 1, 0, false);
            declareFunction("set_last_known_index_for_constant_prefix", "SET-LAST-KNOWN-INDEX-FOR-CONSTANT-PREFIX", 2, 0, false);
            declareFunction("constant_name_case_collisions", "CONSTANT-NAME-CASE-COLLISIONS", 1, 0, false);
            declareFunction("constant_name_case_collision", "CONSTANT-NAME-CASE-COLLISION", 1, 0, false);
            declareFunction("constant_complete_exact", "CONSTANT-COMPLETE-EXACT", 1, 2, false);
            declareFunction("constant_complete", "CONSTANT-COMPLETE", 1, 4, false);
            declareFunction("constant_apropos", "CONSTANT-APROPOS", 1, 3, false);
            declareFunction("constant_postfix", "CONSTANT-POSTFIX", 1, 3, false);
            declareFunction("n_constants_before", "N-CONSTANTS-BEFORE", 2, 4, false);
            declareFunction("n_constants_after", "N-CONSTANTS-AFTER", 2, 4, false);
            declareFunction("new_constant_completion_iterator", "NEW-CONSTANT-COMPLETION-ITERATOR", 0, 2, false);
            declareFunction("new_directed_constant_completion_iterator", "NEW-DIRECTED-CONSTANT-COMPLETION-ITERATOR", 1, 5, false);
            declareFunction("map_constants_in_completions", "MAP-CONSTANTS-IN-COMPLETIONS", 1, 0, false);
            declareFunction("map_constant_completions_around", "MAP-CONSTANT-COMPLETIONS-AROUND", 2, 3, false);
            declareMacro("do_constants_in_completions", "DO-CONSTANTS-IN-COMPLETIONS");
            declareMacro("do_constant_completions_around", "DO-CONSTANT-COMPLETIONS-AROUND");
        }
        if (SubLFiles.USE_V2) {
            declareFunction("uniquify_constant_name", "UNIQUIFY-CONSTANT-NAME", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_constant_completion_high_file_Previous() {
        declareFunction("valid_constant_name_char", "VALID-CONSTANT-NAME-CHAR", 1, 0, false);
        declareFunction("valid_constant_name_char_p", "VALID-CONSTANT-NAME-CHAR-P", 1, 0, false);
        declareFunction("valid_constant_name", "VALID-CONSTANT-NAME", 1, 0, false);
        declareFunction("valid_constant_name_p", "VALID-CONSTANT-NAME-P", 1, 0, false);
        declareFunction("invalid_constant_name_char_p", "INVALID-CONSTANT-NAME-CHAR-P", 1, 0, false);
        new constant_completion_high.$invalid_constant_name_char_p$UnaryFunction();
        declareFunction("constant_name_spec_p", "CONSTANT-NAME-SPEC-P", 1, 0, false);
        declareFunction("constant_name_available", "CONSTANT-NAME-AVAILABLE", 1, 0, false);
        declareFunction("uniquify_constant_name", "UNIQUIFY-CONSTANT-NAME", 1, 1, false);
        declareFunction("get_last_known_index_for_constant_prefix", "GET-LAST-KNOWN-INDEX-FOR-CONSTANT-PREFIX", 1, 0, false);
        declareFunction("set_last_known_index_for_constant_prefix", "SET-LAST-KNOWN-INDEX-FOR-CONSTANT-PREFIX", 2, 0, false);
        declareFunction("constant_name_case_collisions", "CONSTANT-NAME-CASE-COLLISIONS", 1, 0, false);
        declareFunction("constant_name_case_collision", "CONSTANT-NAME-CASE-COLLISION", 1, 0, false);
        declareFunction("constant_complete_exact", "CONSTANT-COMPLETE-EXACT", 1, 2, false);
        declareFunction("constant_complete", "CONSTANT-COMPLETE", 1, 4, false);
        declareFunction("constant_apropos", "CONSTANT-APROPOS", 1, 3, false);
        declareFunction("constant_postfix", "CONSTANT-POSTFIX", 1, 3, false);
        declareFunction("n_constants_before", "N-CONSTANTS-BEFORE", 2, 4, false);
        declareFunction("n_constants_after", "N-CONSTANTS-AFTER", 2, 4, false);
        declareFunction("new_constant_completion_iterator", "NEW-CONSTANT-COMPLETION-ITERATOR", 0, 2, false);
        declareFunction("new_directed_constant_completion_iterator", "NEW-DIRECTED-CONSTANT-COMPLETION-ITERATOR", 1, 5, false);
        declareFunction("map_constants_in_completions", "MAP-CONSTANTS-IN-COMPLETIONS", 1, 0, false);
        declareFunction("map_constant_completions_around", "MAP-CONSTANT-COMPLETIONS-AROUND", 2, 3, false);
        declareMacro("do_constants_in_completions", "DO-CONSTANTS-IN-COMPLETIONS");
        declareMacro("do_constant_completions_around", "DO-CONSTANT-COMPLETIONS-AROUND");
        return NIL;
    }

    static private final SubLList $list_alt2 = list(makeSymbol("VALID-CONSTANT-NAME-CHAR-P"));

    static private final SubLList $list_alt3 = list(makeSymbol("CHAR"));

    static private final SubLString $str_alt4$Deprecated_in_favor_of_valid_cons = makeString("Deprecated in favor of valid-constant-name-char-p\n   Return T iff CHAR is a character which is allowed in a valid constant name.");

    static private final SubLList $list_alt5 = list(list(makeSymbol("CHAR"), makeSymbol("CHARACTERP")));

    static private final SubLList $list_alt6 = list(makeSymbol("BOOLEANP"));

    static private final SubLString $str_alt7$___ = makeString("-_:");

    static private final SubLString $str_alt9$Return_T_iff_CHAR_is_a_character_ = makeString("Return T iff CHAR is a character which is allowed in a valid constant name.");

    static private final SubLList $list_alt11 = list(makeSymbol("VALID-CONSTANT-NAME-P"));

    static private final SubLList $list_alt12 = list(makeSymbol("STRING"));

    static private final SubLString $str_alt13$Deprecated_in_favor_of_valid_cons = makeString("Deprecated in favor of valid-constant-name-p\n   Return T iff STRING is a valid name for a constant.");

    static private final SubLString $str_alt16$Return_T_iff_STRING_is_a_valid_na = makeString("Return T iff STRING is a valid name for a constant.");

    static private final SubLList $list_alt20 = list(makeSymbol("NAME"));

    static private final SubLString $str_alt21$Return_T_iff_NAME_is_a_valid_cons = makeString("Return T iff NAME is a valid constant name currently available for use.");

    static private final SubLList $list_alt22 = list(list(makeSymbol("NAME"), makeSymbol("STRINGP")));

    static private final SubLString $str_alt23$_ = makeString("-");

    static private final SubLString $str_alt25$Return_a_unique__currently_unused = makeString("Return a unique, currently unused constant name based on NAME, which must be a valid constant name.");

    public static SubLObject init_constant_completion_high_file() {
        defparameter("*REQUIRE-CASE-INSENSITIVE-NAME-UNIQUENESS*", T);
        defparameter("*LAST-KNOWN-INDEX-FOR-CONSTANT-PREFIX-DICT*", dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
        return NIL;
    }

    static private final SubLList $list_alt26 = list(list(makeSymbol("NAME"), makeSymbol("VALID-CONSTANT-NAME-P")));

    static private final SubLList $list_alt27 = list(makeSymbol("STRINGP"));

    public static final SubLObject setup_constant_completion_high_file_alt() {
        register_obsolete_cyc_api_function(VALID_CONSTANT_NAME_CHAR, $list_alt2, $list_alt3, $str_alt4$Deprecated_in_favor_of_valid_cons, $list_alt5, $list_alt6);
        register_cyc_api_function(VALID_CONSTANT_NAME_CHAR_P, $list_alt3, $str_alt9$Return_T_iff_CHAR_is_a_character_, $list_alt5, $list_alt6);
        register_obsolete_cyc_api_function(VALID_CONSTANT_NAME, $list_alt11, $list_alt12, $str_alt13$Deprecated_in_favor_of_valid_cons, NIL, $list_alt6);
        register_cyc_api_function(VALID_CONSTANT_NAME_P, $list_alt12, $str_alt16$Return_T_iff_STRING_is_a_valid_na, NIL, $list_alt6);
        register_cyc_api_function(CONSTANT_NAME_AVAILABLE, $list_alt20, $str_alt21$Return_T_iff_NAME_is_a_valid_cons, $list_alt22, $list_alt6);
        register_cyc_api_function(UNIQUIFY_CONSTANT_NAME, $list_alt20, $str_alt25$Return_a_unique__currently_unused, $list_alt26, $list_alt27);
        register_cyc_api_function(CONSTANT_NAME_CASE_COLLISIONS, $list_alt12, $str_alt30$Return_a_list_of_constants_whose_, $list_alt31, $list_alt32);
        register_cyc_api_function(CONSTANT_NAME_CASE_COLLISION, $list_alt12, $str_alt34$Return_a_constant_whose_name_diff, $list_alt31, $list_alt35);
        register_cyc_api_function(CONSTANT_COMPLETE_EXACT, $list_alt38, $str_alt39$Return_a_valid_constant_whose_nam, $list_alt40, NIL);
        register_cyc_api_function(CONSTANT_COMPLETE, $list_alt43, $str_alt44$Return_all_valid_constants_with_P, $list_alt45, NIL);
        register_cyc_api_function(CONSTANT_APROPOS, $list_alt47, $str_alt48$Return_all_valid_constants_with_S, $list_alt49, NIL);
        register_cyc_api_function(CONSTANT_POSTFIX, $list_alt51, $str_alt52$Return_all_valid_constants_with_P, $list_alt53, NIL);
        return NIL;
    }

    public static SubLObject setup_constant_completion_high_file() {
        if (SubLFiles.USE_V1) {
            register_obsolete_cyc_api_function(VALID_CONSTANT_NAME_CHAR, $list2, $list3, $str4$Deprecated_in_favor_of_valid_cons, $list5, $list6);
            register_cyc_api_function(VALID_CONSTANT_NAME_CHAR_P, $list3, $str9$Return_T_iff_CHAR_is_a_character_, $list5, $list6);
            register_obsolete_cyc_api_function(VALID_CONSTANT_NAME, $list11, $list12, $str13$Deprecated_in_favor_of_valid_cons, NIL, $list6);
            register_cyc_api_function(VALID_CONSTANT_NAME_P, $list12, $str16$Return_T_iff_STRING_is_a_valid_na, NIL, $list6);
            register_cyc_api_function(CONSTANT_NAME_AVAILABLE, $list20, $str21$Return_T_iff_NAME_is_a_valid_cons, $list22, $list6);
            register_cyc_api_function(UNIQUIFY_CONSTANT_NAME, $list26, $str27$Return_a_unique__currently_unused, $list28, $list29);
            register_cyc_api_function(CONSTANT_NAME_CASE_COLLISIONS, $list12, $str32$Return_a_list_of_constants_whose_, $list33, $list34);
            register_cyc_api_function(CONSTANT_NAME_CASE_COLLISION, $list12, $str36$Return_a_constant_whose_name_diff, $list33, $list37);
            register_cyc_api_function(CONSTANT_COMPLETE_EXACT, $list40, $str41$Return_a_valid_constant_whose_nam, $list42, NIL);
            register_cyc_api_function(CONSTANT_COMPLETE, $list44, $str45$Return_all_valid_constants_with_P, $list46, NIL);
            register_cyc_api_function(CONSTANT_APROPOS, $list48, $str49$Return_all_valid_constants_with_S, $list50, NIL);
            register_cyc_api_function(CONSTANT_POSTFIX, $list52, $str53$Return_all_valid_constants_with_P, $list54, NIL);
        }
        if (SubLFiles.USE_V2) {
            register_cyc_api_function(UNIQUIFY_CONSTANT_NAME, $list_alt20, $str_alt25$Return_a_unique__currently_unused, $list_alt26, $list_alt27);
            register_cyc_api_function(CONSTANT_NAME_CASE_COLLISIONS, $list_alt12, $str_alt30$Return_a_list_of_constants_whose_, $list_alt31, $list_alt32);
            register_cyc_api_function(CONSTANT_NAME_CASE_COLLISION, $list_alt12, $str_alt34$Return_a_constant_whose_name_diff, $list_alt31, $list_alt35);
            register_cyc_api_function(CONSTANT_COMPLETE_EXACT, $list_alt38, $str_alt39$Return_a_valid_constant_whose_nam, $list_alt40, NIL);
            register_cyc_api_function(CONSTANT_COMPLETE, $list_alt43, $str_alt44$Return_all_valid_constants_with_P, $list_alt45, NIL);
            register_cyc_api_function(CONSTANT_APROPOS, $list_alt47, $str_alt48$Return_all_valid_constants_with_S, $list_alt49, NIL);
            register_cyc_api_function(CONSTANT_POSTFIX, $list_alt51, $str_alt52$Return_all_valid_constants_with_P, $list_alt53, NIL);
        }
        return NIL;
    }

    public static SubLObject setup_constant_completion_high_file_Previous() {
        register_obsolete_cyc_api_function(VALID_CONSTANT_NAME_CHAR, $list2, $list3, $str4$Deprecated_in_favor_of_valid_cons, $list5, $list6);
        register_cyc_api_function(VALID_CONSTANT_NAME_CHAR_P, $list3, $str9$Return_T_iff_CHAR_is_a_character_, $list5, $list6);
        register_obsolete_cyc_api_function(VALID_CONSTANT_NAME, $list11, $list12, $str13$Deprecated_in_favor_of_valid_cons, NIL, $list6);
        register_cyc_api_function(VALID_CONSTANT_NAME_P, $list12, $str16$Return_T_iff_STRING_is_a_valid_na, NIL, $list6);
        register_cyc_api_function(CONSTANT_NAME_AVAILABLE, $list20, $str21$Return_T_iff_NAME_is_a_valid_cons, $list22, $list6);
        register_cyc_api_function(UNIQUIFY_CONSTANT_NAME, $list26, $str27$Return_a_unique__currently_unused, $list28, $list29);
        register_cyc_api_function(CONSTANT_NAME_CASE_COLLISIONS, $list12, $str32$Return_a_list_of_constants_whose_, $list33, $list34);
        register_cyc_api_function(CONSTANT_NAME_CASE_COLLISION, $list12, $str36$Return_a_constant_whose_name_diff, $list33, $list37);
        register_cyc_api_function(CONSTANT_COMPLETE_EXACT, $list40, $str41$Return_a_valid_constant_whose_nam, $list42, NIL);
        register_cyc_api_function(CONSTANT_COMPLETE, $list44, $str45$Return_all_valid_constants_with_P, $list46, NIL);
        register_cyc_api_function(CONSTANT_APROPOS, $list48, $str49$Return_all_valid_constants_with_S, $list50, NIL);
        register_cyc_api_function(CONSTANT_POSTFIX, $list52, $str53$Return_all_valid_constants_with_P, $list54, NIL);
        return NIL;
    }

    static private final SubLString $str_alt30$Return_a_list_of_constants_whose_ = makeString("Return a list of constants whose names differ from STRING only by case.");

    static private final SubLList $list_alt31 = list(list(makeSymbol("STRING"), makeSymbol("VALID-CONSTANT-NAME-P")));

    static private final SubLList $list_alt32 = list(makeSymbol("LISTP"));

    static private final SubLString $str_alt34$Return_a_constant_whose_name_diff = makeString("Return a constant whose name differs from STRING only by case.");

    static private final SubLList $list_alt35 = list(makeSymbol("CONSTANT-P"));

    static private final SubLList $list_alt38 = list(makeSymbol("STRING"), makeSymbol("&OPTIONAL"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"));

    static private final SubLString $str_alt39$Return_a_valid_constant_whose_nam = makeString("Return a valid constant whose name exactly matches STRING.\nOptionally the START and END character positions can be\nspecified, such that the STRING matches characters between the START and \nEND range.  If no constant exists, return NIL.");

    static private final SubLList $list_alt40 = list(list(makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("START"), makeSymbol("FIXNUMP")));

    @Override
    public void declareFunctions() {
        declare_constant_completion_high_file();
    }

    static private final SubLList $list_alt43 = list(makeSymbol("PREFIX"), makeSymbol("&OPTIONAL"), makeSymbol("CASE-SENSITIVE?"), makeSymbol("EXACT-LENGTH?"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"));

    @Override
    public void initializeVariables() {
        init_constant_completion_high_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_constant_completion_high_file();
    }

    static private final SubLString $str_alt44$Return_all_valid_constants_with_P = makeString("Return all valid constants with PREFIX as a prefix of their name\nWhen CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\nWhen EXACT-LENGTH? is non-nil, the prefix must be the entire string\nOptionally the START and END character positions can be\nspecified, such that the PREFIX matches characters between the START and \nEND range.  If no constant exists, return NIL.");

    static {
    }

    public static final class $invalid_constant_name_char_p$UnaryFunction extends UnaryFunction {
        public $invalid_constant_name_char_p$UnaryFunction() {
            super(extractFunctionNamed("INVALID-CONSTANT-NAME-CHAR-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return invalid_constant_name_char_p(arg1);
        }
    }

    static private final SubLList $list_alt45 = list(list(makeSymbol("PREFIX"), makeSymbol("STRINGP")), list(makeSymbol("CASE-SENSITIVE?"), makeSymbol("BOOLEANP")), list(makeSymbol("EXACT-LENGTH?"), makeSymbol("BOOLEANP")), list(makeSymbol("START"), makeSymbol("FIXNUMP")));

    static private final SubLList $list_alt47 = list(makeSymbol("SUBSTRING"), makeSymbol("&OPTIONAL"), makeSymbol("CASE-SENSITIVE?"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"));

    static private final SubLString $str_alt48$Return_all_valid_constants_with_S = makeString("Return all valid constants with SUBSTRING somewhere in their name\nWhen CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\nOptionally the START and END character positions can be\nspecified, such that the SUBSTRING matches characters between the START and \nEND range.  If no constant exists, return NIL.");

    static private final SubLList $list_alt49 = list(list(makeSymbol("SUBSTRING"), makeSymbol("STRINGP")), list(makeSymbol("CASE-SENSITIVE?"), makeSymbol("BOOLEANP")), list(makeSymbol("START"), makeSymbol("FIXNUMP")));

    static private final SubLList $list_alt51 = list(makeSymbol("POSTFIX"), makeSymbol("&OPTIONAL"), makeSymbol("CASE-SENSITIVE?"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"));

    static private final SubLString $str_alt52$Return_all_valid_constants_with_P = makeString("Return all valid constants with POSTFIX as a postfix of their name\nWhen CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\nOptionally the START and END character positions can be\nspecified, such that the SUBSTRING matches characters between the START and \nEND range.  If no constant exists, return NIL.");

    static private final SubLList $list_alt53 = list(list(makeSymbol("POSTFIX"), makeSymbol("STRINGP")), list(makeSymbol("CASE-SENSITIVE?"), makeSymbol("BOOLEANP")), list(makeSymbol("START"), makeSymbol("FIXNUMP")));

    static private final SubLList $list_alt54 = list(list(makeSymbol("CONSTANT"), makeSymbol("&KEY"), makeSymbol("DONE"), list(makeSymbol("FORWARD"), T)), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt55 = list($DONE, makeKeyword("FORWARD"));

    static private final SubLSymbol $sym59$ITERATOR = makeUninternedSymbol("ITERATOR");

    static private final SubLList $list_alt64 = list(list(makeSymbol("CONSTANT"), makeSymbol("STRING"), makeSymbol("&KEY"), makeSymbol("DONE"), list(makeSymbol("FORWARD"), T), list(makeSymbol("CASE-SENSITIVE"), T), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt65 = list($DONE, makeKeyword("FORWARD"), makeKeyword("CASE-SENSITIVE"), makeKeyword("START"), makeKeyword("END"));

    static private final SubLSymbol $sym69$ITERATOR = makeUninternedSymbol("ITERATOR");
}

/**
 * Total time: 100 ms
 */
