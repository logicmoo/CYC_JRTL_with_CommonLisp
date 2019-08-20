/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.oddp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sequencep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.vectorp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.vector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cdar;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_line;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class regular_expression_utilities extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt19$ = makeString("");

    public static final SubLFile me = new regular_expression_utilities();



    // defconstant
    @LispMethod(comment = "List of the meta-characters in the regular expressions.\ndefconstant")
    // Definitions
    /**
     * List of the meta-characters in the regular expressions.
     */
    private static final SubLSymbol $regular_expression_meta_characters$ = makeSymbol("*REGULAR-EXPRESSION-META-CHARACTERS*");

    // defvar
    // contains regular expressions for the backreference patterns 1, 2, ..., 9
    /**
     * contains regular expressions for the backreference patterns 1, 2, ..., 9
     */
    @LispMethod(comment = "contains regular expressions for the backreference patterns 1, 2, ..., 9\ndefvar")
    private static final SubLSymbol $backreference_patterns$ = makeSymbol("*BACKREFERENCE-PATTERNS*");

    // deflexical
    /**
     * a partial list of regex special chars. This list should be extended as more
     * are found.
     */
    @LispMethod(comment = "a partial list of regex special chars. This list should be extended as more\r\nare found.\ndeflexical\na partial list of regex special chars. This list should be extended as more\nare found.")
    private static final SubLSymbol $regex_special_chars$ = makeSymbol("*REGEX-SPECIAL-CHARS*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str0$__________ = makeString(".*?[]^()|+");

    private static final SubLSymbol REGULAR_EXPRESSION_CHAR_P = makeSymbol("REGULAR-EXPRESSION-CHAR-P");

    private static final SubLSymbol REGEX_P = makeSymbol("REGEX-P");

    private static final SubLSymbol $REGULAR_EXPRESSION_SUPPORT_UNAVAILABLE = makeKeyword("REGULAR-EXPRESSION-SUPPORT-UNAVAILABLE");

    static private final SubLString $str5$Error__A___A__compiling_regular_e = makeString("Error ~A (~A) compiling regular expression ~S at offset ~A.");

    private static final SubLSymbol FIND_ALL_MATCHES_FOR_REGULAR_EXPRESSION = makeSymbol("FIND-ALL-MATCHES-FOR-REGULAR-EXPRESSION");

    private static final SubLList $list13 = list(list(list(makeString("[a-z]+"), makeString("UPPER lower CASING matters")), list(makeString("lower"), makeString("matters"))), list(list(makeString("[0-9]+"), makeString("Call me after 9 on my cell -- 342-4099")), list(makeString("9"), makeString("342"), makeString("4099"))), list(list(makeString("[0-9.]+"), makeString("The IP address of my machine is 127.0.0.1")), list(makeString("127.0.0.1"))), list(list(makeString("[0-9a-z.]+@[0-9a-z.]+"), makeString("You can email me at poohbear@hundredacrewoods.org, if you want.")), list(makeString("poohbear@hundredacrewoods.org"))));

    private static final SubLList $list15 = cons(makeSymbol("MATCH-START"), makeSymbol("MATCH-END"));

    private static final SubLSymbol FIND_ALL_CAPTURED_MATCHES_WITHIN_STRING_FROM_STRING = makeSymbol("FIND-ALL-CAPTURED-MATCHES-WITHIN-STRING-FROM-STRING");

    private static final SubLList $list17 = list(list(list(makeString("(the[a-z]+) "), makeString("their cats and these horses and them zebras and then he slept")), list(list(makeString("their")), list(makeString("these")), list(makeString("them")), list(makeString("then")))), list(list(makeString("([0-9]+)([a-zA-Z]+)"), makeString("asd23asj2r;234234a")), list(list(makeString("23"), makeString("asj")), list(makeString("2"), makeString("r")), list(makeString("234234"), makeString("a")))));

    private static final SubLSymbol REGEXP_CAPTURING_MATCH = makeSymbol("REGEXP-CAPTURING-MATCH");

    private static final SubLList $list19 = list(new SubLObject[]{ list(list(makeString(""), makeString("")), NIL), list(list(makeString("the ((red|white) (king|queen))"), makeString("the red queen")), list(makeString("the red queen"), makeString("red queen"), makeString("red"), makeString("queen"))), list(list(makeString("(a|(z))(bc)"), makeString("abc")), list(makeString("abc"), makeString("a"), makeString(""), makeString("bc"))), list(list(makeString("(a|(z))(bc)"), makeString("azbca")), list(makeString("zbc"), makeString("z"), makeString("z"), makeString("bc"))), list(list(makeString("(a)+"), makeString("aaaaa")), list(makeString("aaaaa"), makeString("a"))), list(list(makeString("(a+)"), makeString("aaaaa")), list(makeString("aaaaa"), makeString("aaaaa"))), list(list(makeString("(.*)(ab)+\\1"), makeString("xyzababxyz")), list(makeString("xyzababxyz"), makeString("xyz"), makeString("ab"))), list(list(makeString("^(\\d+)\\s+\\d+\\s+\\1$"), makeString("212 37337 212")), list(makeString("212 37337 212"), makeString("212"))), list(list(makeString("^(a(b)?)+$"), makeString("aba")), list(makeString("aba"), makeString("a"), makeString("b"))), list(list(makeString("^(aa(bb)?)+$"), makeString("aabbaa")), list(makeString("aabbaa"), makeString("aa"), makeString("bb"))), list(list(makeString("^(aa(b(b))?)+$"), makeString("aabbaa")), list(makeString("aabbaa"), makeString("aa"), makeString("bb"), makeString("b"))), list(list(makeString("^(a)?a"), makeString("a")), list(makeString("a"), makeString(""))) });

    private static final SubLString $str20$ = makeString("");

    private static final SubLString $str21$Invalid_backreference___a = makeString("Invalid backreference \\~a");

    private static final SubLString $str22$__ = makeString("\\\\");

    private static final SubLSymbol REGULAR_EXPRESSION_P = makeSymbol("REGULAR-EXPRESSION-P");

    private static final SubLString $str26$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $str29$_________ = makeString("[]?.*^$()");

    private static final SubLString $str30$___A_ = makeString("[\\~A]");

    private static final SubLString $str31$__A_ = makeString("[~A]");

    private static final SubLSymbol VECTOR_GREP = makeSymbol("VECTOR-GREP");

    private static final SubLList $list33 = list(list(list(makeString("[a-z]+"), vector(new SubLObject[]{ makeString("UPPER"), makeString("lower"), makeString("CASING"), makeString("matters") })), list(list(ONE_INTEGER, makeString("lower"), list(cons(ZERO_INTEGER, FIVE_INTEGER))), list(THREE_INTEGER, makeString("matters"), list(cons(ZERO_INTEGER, SEVEN_INTEGER))))), list(list(makeString("[0-9]+"), vector(new SubLObject[]{ makeString("Call"), makeString("me"), makeString("after"), makeString("9"), makeString("on"), makeString("my"), makeString("cell"), makeString("--"), makeString("342-4099") })), list(list(THREE_INTEGER, makeString("9"), list(cons(ZERO_INTEGER, ONE_INTEGER))), list(EIGHT_INTEGER, makeString("342-4099"), list(cons(ZERO_INTEGER, THREE_INTEGER), cons(FOUR_INTEGER, EIGHT_INTEGER))))), list(list(makeString("[0-9.]+"), vector(new SubLObject[]{ makeString("The"), makeString("IP"), makeString("address"), makeString("of"), makeString("my"), makeString("machine"), makeString("is"), makeString("127.0.0.1") })), list(list(SEVEN_INTEGER, makeString("127.0.0.1"), list(cons(ZERO_INTEGER, NINE_INTEGER))))), list(list(makeString("[0-9a-z.]+@[0-9a-z.]+"), vector(new SubLObject[]{ makeString("You"), makeString("can"), makeString("email"), makeString("me"), makeString("at"), makeString("poohbear@hundredacrewoods.org,"), makeString("if"), makeString("you"), makeString("want.") })), list(list(FIVE_INTEGER, makeString("poohbear@hundredacrewoods.org,"), list(cons(ZERO_INTEGER, makeInteger(29)))))));

    private static final SubLSymbol LIST_GREP = makeSymbol("LIST-GREP");

    private static final SubLList $list35 = list(list(list(makeString("[a-z]+"), list(makeString("UPPER"), makeString("lower"), makeString("CASING"), makeString("matters"))), list(list(ONE_INTEGER, makeString("lower"), list(cons(ZERO_INTEGER, FIVE_INTEGER))), list(THREE_INTEGER, makeString("matters"), list(cons(ZERO_INTEGER, SEVEN_INTEGER))))), list(list(makeString("[0-9]+"), list(new SubLObject[]{ makeString("Call"), makeString("me"), makeString("after"), makeString("9"), makeString("on"), makeString("my"), makeString("cell"), makeString("--"), makeString("342-4099") })), list(list(THREE_INTEGER, makeString("9"), list(cons(ZERO_INTEGER, ONE_INTEGER))), list(EIGHT_INTEGER, makeString("342-4099"), list(cons(ZERO_INTEGER, THREE_INTEGER), cons(FOUR_INTEGER, EIGHT_INTEGER))))), list(list(makeString("[0-9.]+"), list(makeString("The"), makeString("IP"), makeString("address"), makeString("of"), makeString("my"), makeString("machine"), makeString("is"), makeString("127.0.0.1"))), list(list(SEVEN_INTEGER, makeString("127.0.0.1"), list(cons(ZERO_INTEGER, NINE_INTEGER))))), list(list(makeString("[0-9a-z.]+@[0-9a-z.]+"), list(new SubLObject[]{ makeString("You"), makeString("can"), makeString("email"), makeString("me"), makeString("at"), makeString("poohbear@hundredacrewoods.org,"), makeString("if"), makeString("you"), makeString("want.") })), list(list(FIVE_INTEGER, makeString("poohbear@hundredacrewoods.org,"), list(cons(ZERO_INTEGER, makeInteger(29)))))));

    public static final SubLObject regular_expression_char_p_alt(SubLObject v_object) {
        return makeBoolean(v_object.isChar() && (NIL != find(v_object, $regular_expression_meta_characters$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject regular_expression_char_p(final SubLObject v_object) {
        return makeBoolean(v_object.isChar() && (NIL != find(v_object, $regular_expression_meta_characters$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject regular_expression_string_p_alt(SubLObject v_object) {
        return makeBoolean(v_object.isString() && (NIL != find_if(REGULAR_EXPRESSION_CHAR_P, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject regular_expression_string_p(final SubLObject v_object) {
        return makeBoolean(v_object.isString() && (NIL != find_if(REGULAR_EXPRESSION_CHAR_P, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject non_regular_expression_string_p_alt(SubLObject v_object) {
        return makeBoolean(v_object.isString() && (NIL == find_if(REGULAR_EXPRESSION_CHAR_P, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject non_regular_expression_string_p(final SubLObject v_object) {
        return makeBoolean(v_object.isString() && (NIL == find_if(REGULAR_EXPRESSION_CHAR_P, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    /**
     * Given a regular expression and a string (optionally flavored with
     * compilation and match options), return all the matches within the
     * string as a list of matches ordered by occurrence within the
     * string.
     */
    @LispMethod(comment = "Given a regular expression and a string (optionally flavored with\r\ncompilation and match options), return all the matches within the\r\nstring as a list of matches ordered by occurrence within the\r\nstring.\nGiven a regular expression and a string (optionally flavored with\ncompilation and match options), return all the matches within the\nstring as a list of matches ordered by occurrence within the\nstring.")
    public static final SubLObject find_all_matches_for_regular_expression_alt(SubLObject regular_expression, SubLObject string, SubLObject comp_options, SubLObject match_options) {
        if (comp_options == UNPROVIDED) {
            comp_options = NIL;
        }
        if (match_options == UNPROVIDED) {
            match_options = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(regular_expression, REGEX_P);
            SubLTrampolineFile.checkType(string, STRINGP);
            if (NIL != string_utilities.empty_string_p(regular_expression)) {
                return NIL;
            }
            if (NIL == regular_expressions.is_regular_expressions_support_availableP()) {
                return values(NIL, $REGULAR_EXPRESSION_SUPPORT_UNAVAILABLE);
            }
            {
                SubLObject matches = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject pattern = regular_expressions.compile_regular_expression(regular_expression, comp_options);
                    SubLObject error_code = thread.secondMultipleValue();
                    SubLObject error_offset = thread.thirdMultipleValue();
                    SubLObject error_msg = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    try {
                        if (NIL == regular_expressions.regex_pattern_p(pattern)) {
                            Errors.error($str_alt5$Error__A___A__compiling_regular_e, new SubLObject[]{ error_code, error_msg, regular_expression, error_offset });
                        }
                        matches = com.cyc.cycjava.cycl.regular_expression_utilities.find_all_matches_within_string(pattern, string, match_options, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                if (NIL != regular_expressions.regex_pattern_p(pattern)) {
                                    regular_expressions.discard_regular_expression_pattern(pattern);
                                }
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return matches;
            }
        }
    }

    /**
     * Given a regular expression and a string (optionally flavored with
     * compilation and match options), return all the matches within the
     * string as a list of matches ordered by occurrence within the
     * string.
     */
    @LispMethod(comment = "Given a regular expression and a string (optionally flavored with\r\ncompilation and match options), return all the matches within the\r\nstring as a list of matches ordered by occurrence within the\r\nstring.\nGiven a regular expression and a string (optionally flavored with\ncompilation and match options), return all the matches within the\nstring as a list of matches ordered by occurrence within the\nstring.")
    public static SubLObject find_all_matches_for_regular_expression(final SubLObject regular_expression, final SubLObject string, SubLObject comp_options, SubLObject match_options) {
        if (comp_options == UNPROVIDED) {
            comp_options = NIL;
        }
        if (match_options == UNPROVIDED) {
            match_options = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != regular_expressions.regex_p(regular_expression) : "! regular_expressions.regex_p(regular_expression) " + ("regular_expressions.regex_p(regular_expression) " + "CommonSymbols.NIL != regular_expressions.regex_p(regular_expression) ") + regular_expression;
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        if (NIL != string_utilities.empty_string_p(regular_expression)) {
            return NIL;
        }
        if (NIL == regular_expressions.is_regular_expressions_support_availableP()) {
            return values(NIL, $REGULAR_EXPRESSION_SUPPORT_UNAVAILABLE);
        }
        SubLObject matches = NIL;
        thread.resetMultipleValues();
        final SubLObject pattern = regular_expressions.compile_regular_expression(regular_expression, comp_options);
        final SubLObject error_code = thread.secondMultipleValue();
        final SubLObject error_offset = thread.thirdMultipleValue();
        final SubLObject error_msg = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        try {
            if (NIL == regular_expressions.regex_pattern_p(pattern)) {
                Errors.error($str5$Error__A___A__compiling_regular_e, new SubLObject[]{ error_code, error_msg, regular_expression, error_offset });
            }
            matches = find_all_matches_within_string(pattern, string, match_options, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (NIL != regular_expressions.regex_pattern_p(pattern)) {
                    regular_expressions.discard_regular_expression_pattern(pattern);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return matches;
    }

    /**
     * Given a regular expression and a string (optionally flavored with
     * compilation and match options), return the offsets of all the matches within
     * the string.
     */
    @LispMethod(comment = "Given a regular expression and a string (optionally flavored with\r\ncompilation and match options), return the offsets of all the matches within\r\nthe string.\nGiven a regular expression and a string (optionally flavored with\ncompilation and match options), return the offsets of all the matches within\nthe string.")
    public static final SubLObject offsets_of_regex_matches_alt(SubLObject regex, SubLObject string, SubLObject comp_options, SubLObject match_options) {
        if (comp_options == UNPROVIDED) {
            comp_options = NIL;
        }
        if (match_options == UNPROVIDED) {
            match_options = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(regex, REGEX_P);
            SubLTrampolineFile.checkType(string, STRINGP);
            if (NIL != string_utilities.empty_string_p(regex)) {
                return NIL;
            }
            if (NIL == regular_expressions.is_regular_expressions_support_availableP()) {
                return values(NIL, $REGULAR_EXPRESSION_SUPPORT_UNAVAILABLE);
            }
            {
                SubLObject offsets = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject pattern = regular_expressions.compile_regular_expression(regex, comp_options);
                    SubLObject error_code = thread.secondMultipleValue();
                    SubLObject error_offset = thread.thirdMultipleValue();
                    SubLObject error_msg = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    try {
                        if (NIL == regular_expressions.regex_pattern_p(pattern)) {
                            Errors.error($str_alt5$Error__A___A__compiling_regular_e, new SubLObject[]{ error_code, error_msg, regex, error_offset });
                        }
                        offsets = com.cyc.cycjava.cycl.regular_expression_utilities.find_all_matches_within_string(pattern, string, match_options, NIL, UNPROVIDED, UNPROVIDED);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                if (NIL != regular_expressions.regex_pattern_p(pattern)) {
                                    regular_expressions.discard_regular_expression_pattern(pattern);
                                }
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return offsets;
            }
        }
    }

    /**
     * Given a regular expression and a string (optionally flavored with
     * compilation and match options), return the offsets of all the matches within
     * the string.
     */
    @LispMethod(comment = "Given a regular expression and a string (optionally flavored with\r\ncompilation and match options), return the offsets of all the matches within\r\nthe string.\nGiven a regular expression and a string (optionally flavored with\ncompilation and match options), return the offsets of all the matches within\nthe string.")
    public static SubLObject offsets_of_regex_matches(final SubLObject regex, final SubLObject string, SubLObject comp_options, SubLObject match_options) {
        if (comp_options == UNPROVIDED) {
            comp_options = NIL;
        }
        if (match_options == UNPROVIDED) {
            match_options = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != regular_expressions.regex_p(regex) : "! regular_expressions.regex_p(regex) " + ("regular_expressions.regex_p(regex) " + "CommonSymbols.NIL != regular_expressions.regex_p(regex) ") + regex;
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        if (NIL != string_utilities.empty_string_p(regex)) {
            return NIL;
        }
        if (NIL == regular_expressions.is_regular_expressions_support_availableP()) {
            return values(NIL, $REGULAR_EXPRESSION_SUPPORT_UNAVAILABLE);
        }
        SubLObject offsets = NIL;
        thread.resetMultipleValues();
        final SubLObject pattern = regular_expressions.compile_regular_expression(regex, comp_options);
        final SubLObject error_code = thread.secondMultipleValue();
        final SubLObject error_offset = thread.thirdMultipleValue();
        final SubLObject error_msg = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        try {
            if (NIL == regular_expressions.regex_pattern_p(pattern)) {
                Errors.error($str5$Error__A___A__compiling_regular_e, new SubLObject[]{ error_code, error_msg, regex, error_offset });
            }
            offsets = find_all_matches_within_string(pattern, string, match_options, NIL, UNPROVIDED, UNPROVIDED);
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (NIL != regular_expressions.regex_pattern_p(pattern)) {
                    regular_expressions.discard_regular_expression_pattern(pattern);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return offsets;
    }

    /**
     * Given an already compiled pattern and a string (optionally flavored
     * with match options), return all the matches within the string as a
     * list of matches ordered by occurrence within the string.
     */
    @LispMethod(comment = "Given an already compiled pattern and a string (optionally flavored\r\nwith match options), return all the matches within the string as a\r\nlist of matches ordered by occurrence within the string.\nGiven an already compiled pattern and a string (optionally flavored\nwith match options), return all the matches within the string as a\nlist of matches ordered by occurrence within the string.")
    public static final SubLObject find_all_matches_for_pattern_alt(SubLObject pattern, SubLObject string, SubLObject match_options) {
        if (match_options == UNPROVIDED) {
            match_options = NIL;
        }
        SubLTrampolineFile.checkType(pattern, REGEX_PATTERN_P);
        SubLTrampolineFile.checkType(string, STRINGP);
        if (NIL == regular_expressions.is_regular_expressions_support_availableP()) {
            return values(NIL, $REGULAR_EXPRESSION_SUPPORT_UNAVAILABLE);
        }
        return com.cyc.cycjava.cycl.regular_expression_utilities.find_all_matches_within_string(pattern, string, match_options, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Given an already compiled pattern and a string (optionally flavored
     * with match options), return all the matches within the string as a
     * list of matches ordered by occurrence within the string.
     */
    @LispMethod(comment = "Given an already compiled pattern and a string (optionally flavored\r\nwith match options), return all the matches within the string as a\r\nlist of matches ordered by occurrence within the string.\nGiven an already compiled pattern and a string (optionally flavored\nwith match options), return all the matches within the string as a\nlist of matches ordered by occurrence within the string.")
    public static SubLObject find_all_matches_for_pattern(final SubLObject pattern, final SubLObject string, SubLObject match_options) {
        if (match_options == UNPROVIDED) {
            match_options = NIL;
        }
        assert NIL != regular_expressions.regex_pattern_p(pattern) : "! regular_expressions.regex_pattern_p(pattern) " + ("regular_expressions.regex_pattern_p(pattern) " + "CommonSymbols.NIL != regular_expressions.regex_pattern_p(pattern) ") + pattern;
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        if (NIL == regular_expressions.is_regular_expressions_support_availableP()) {
            return values(NIL, $REGULAR_EXPRESSION_SUPPORT_UNAVAILABLE);
        }
        return find_all_matches_within_string(pattern, string, match_options, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Accumulate the individual matches within a string.
     */
    @LispMethod(comment = "Accumulate the individual matches within a string.")
    public static final SubLObject find_all_matches_within_string_alt(SubLObject pattern, SubLObject string, SubLObject match_options, SubLObject stringsP, SubLObject start, SubLObject end) {
        if (match_options == UNPROVIDED) {
            match_options = NIL;
        }
        if (stringsP == UNPROVIDED) {
            stringsP = T;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = length(string);
        }
        {
            SubLObject matches = NIL;
            while (!start.isNegative()) {
                {
                    SubLObject offsets = regular_expressions.match_regular_expression_pattern_offsets(pattern, string, ONE_INTEGER, match_options, start, end);
                    SubLObject cdolist_list_var = offsets;
                    SubLObject offset = NIL;
                    for (offset = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , offset = cdolist_list_var.first()) {
                        {
                            SubLObject datum = offset;
                            SubLObject current = datum;
                            SubLObject match_start = NIL;
                            SubLObject match_end = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt16);
                            match_start = current.first();
                            current = current.rest();
                            match_end = current;
                            if (!match_start.isNegative()) {
                                if (NIL != stringsP) {
                                    {
                                        SubLObject match = subseq(string, match_start, match_end);
                                        matches = cons(match, matches);
                                    }
                                } else {
                                    matches = cons(cons(match_start, match_end), matches);
                                }
                            }
                            start = match_end;
                        }
                    }
                }
            } 
            return nreverse(matches);
        }
    }

    /**
     * Accumulate the individual matches within a string.
     */
    @LispMethod(comment = "Accumulate the individual matches within a string.")
    public static SubLObject find_all_matches_within_string(final SubLObject pattern, final SubLObject string, SubLObject match_options, SubLObject stringsP, SubLObject start, SubLObject end) {
        if (match_options == UNPROVIDED) {
            match_options = NIL;
        }
        if (stringsP == UNPROVIDED) {
            stringsP = T;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = length(string);
        }
        SubLObject matches = NIL;
        while (!start.isNegative()) {
            SubLObject cdolist_list_var;
            final SubLObject offsets = cdolist_list_var = regular_expressions.match_regular_expression_pattern_offsets(pattern, string, ONE_INTEGER, match_options, start, end);
            SubLObject offset = NIL;
            offset = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = offset;
                SubLObject match_start = NIL;
                SubLObject match_end = NIL;
                destructuring_bind_must_consp(current, datum, $list15);
                match_start = current.first();
                current = match_end = current.rest();
                if (!match_start.isNegative()) {
                    if (NIL != stringsP) {
                        final SubLObject match = subseq(string, match_start, match_end);
                        matches = cons(match, matches);
                    } else {
                        matches = cons(cons(match_start, match_end), matches);
                    }
                }
                start = match_end;
                cdolist_list_var = cdolist_list_var.rest();
                offset = cdolist_list_var.first();
            } 
        } 
        return nreverse(matches);
    }

    /**
     * Match a capturing regular expression REGULAR-EXPRESSION against STRING with the provided options.  Returns a list of captured substrings, where the first string in the list is the complete matched substring and the rest are the explicitly captured (with parenthesis) substrings in order.  If there is no match, we return NIL (instead of (""))
     */
    @LispMethod(comment = "Match a capturing regular expression REGULAR-EXPRESSION against STRING with the provided options.  Returns a list of captured substrings, where the first string in the list is the complete matched substring and the rest are the explicitly captured (with parenthesis) substrings in order.  If there is no match, we return NIL (instead of (\"\"))")
    public static final SubLObject regexp_capturing_match_alt(SubLObject regular_expression, SubLObject string, SubLObject comp_options, SubLObject match_options) {
        if (comp_options == UNPROVIDED) {
            comp_options = NIL;
        }
        if (match_options == UNPROVIDED) {
            match_options = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(regular_expression, REGEX_P);
            SubLTrampolineFile.checkType(string, STRINGP);
            if (NIL == regular_expressions.is_regular_expressions_support_availableP()) {
                return values(NIL, $REGULAR_EXPRESSION_SUPPORT_UNAVAILABLE);
            }
            {
                SubLObject matches = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject pattern = regular_expressions.compile_regular_expression(regular_expression, comp_options);
                    SubLObject error_code = thread.secondMultipleValue();
                    SubLObject error_offset = thread.thirdMultipleValue();
                    SubLObject error_msg = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    try {
                        if (NIL == regular_expressions.regex_pattern_p(pattern)) {
                            Errors.error($str_alt5$Error__A___A__compiling_regular_e, new SubLObject[]{ error_code, error_msg, regular_expression, error_offset });
                        }
                        matches = com.cyc.cycjava.cycl.regular_expression_utilities.regexp_capturing_match_pattern(pattern, string, match_options);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                if (NIL != regular_expressions.regex_pattern_p(pattern)) {
                                    regular_expressions.discard_regular_expression_pattern(pattern);
                                }
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return matches;
            }
        }
    }

    /**
     * Match a capturing regular expression REGULAR-EXPRESSION against STRING with the provided options.  Returns a list of captured substrings, where the first string in the list is the complete matched substring and the rest are the explicitly captured (with parenthesis) substrings in order.  If there is no match, we return NIL (instead of (""))
     */
    @LispMethod(comment = "Match a capturing regular expression REGULAR-EXPRESSION against STRING with the provided options.  Returns a list of captured substrings, where the first string in the list is the complete matched substring and the rest are the explicitly captured (with parenthesis) substrings in order.  If there is no match, we return NIL (instead of (\"\"))")
    public static SubLObject regexp_capturing_match(final SubLObject regular_expression, final SubLObject string, SubLObject comp_options, SubLObject match_options) {
        if (comp_options == UNPROVIDED) {
            comp_options = NIL;
        }
        if (match_options == UNPROVIDED) {
            match_options = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != regular_expressions.regex_p(regular_expression) : "! regular_expressions.regex_p(regular_expression) " + ("regular_expressions.regex_p(regular_expression) " + "CommonSymbols.NIL != regular_expressions.regex_p(regular_expression) ") + regular_expression;
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        if (NIL == regular_expressions.is_regular_expressions_support_availableP()) {
            return values(NIL, $REGULAR_EXPRESSION_SUPPORT_UNAVAILABLE);
        }
        SubLObject matches = NIL;
        thread.resetMultipleValues();
        final SubLObject pattern = regular_expressions.compile_regular_expression(regular_expression, comp_options);
        final SubLObject error_code = thread.secondMultipleValue();
        final SubLObject error_offset = thread.thirdMultipleValue();
        final SubLObject error_msg = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        try {
            if (NIL == regular_expressions.regex_pattern_p(pattern)) {
                Errors.error($str5$Error__A___A__compiling_regular_e, new SubLObject[]{ error_code, error_msg, regular_expression, error_offset });
            }
            matches = regexp_capturing_match_pattern(pattern, string, match_options);
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (NIL != regular_expressions.regex_pattern_p(pattern)) {
                    regular_expressions.discard_regular_expression_pattern(pattern);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return matches;
    }

    /**
     * Given a regular expression and a string (optionally flavored with
     * compilation and match options), return the offsets of all the captured matches within
     * the string.
     */
    @LispMethod(comment = "Given a regular expression and a string (optionally flavored with\r\ncompilation and match options), return the offsets of all the captured matches within\r\nthe string.\nGiven a regular expression and a string (optionally flavored with\ncompilation and match options), return the offsets of all the captured matches within\nthe string.")
    public static final SubLObject offsets_of_regex_capturing_matches_alt(SubLObject regex, SubLObject string, SubLObject comp_options, SubLObject match_options) {
        if (comp_options == UNPROVIDED) {
            comp_options = NIL;
        }
        if (match_options == UNPROVIDED) {
            match_options = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(regex, REGEX_P);
            SubLTrampolineFile.checkType(string, STRINGP);
            if (NIL != string_utilities.empty_string_p(regex)) {
                return NIL;
            }
            if (NIL == regular_expressions.is_regular_expressions_support_availableP()) {
                return values(NIL, $REGULAR_EXPRESSION_SUPPORT_UNAVAILABLE);
            }
            {
                SubLObject offsets = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject pattern = regular_expressions.compile_regular_expression(regex, comp_options);
                    SubLObject error_code = thread.secondMultipleValue();
                    SubLObject error_offset = thread.thirdMultipleValue();
                    SubLObject error_msg = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    try {
                        if (NIL == regular_expressions.regex_pattern_p(pattern)) {
                            Errors.error($str_alt5$Error__A___A__compiling_regular_e, new SubLObject[]{ error_code, error_msg, regex, error_offset });
                        }
                        offsets = com.cyc.cycjava.cycl.regular_expression_utilities.find_all_captured_matches_within_string(pattern, string, match_options, NIL, UNPROVIDED, UNPROVIDED);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                if (NIL != regular_expressions.regex_pattern_p(pattern)) {
                                    regular_expressions.discard_regular_expression_pattern(pattern);
                                }
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return offsets;
            }
        }
    }

    /**
     * Given a regular expression and a string (optionally flavored with
     * compilation and match options), return the offsets of all the captured matches within
     * the string.
     */
    @LispMethod(comment = "Given a regular expression and a string (optionally flavored with\r\ncompilation and match options), return the offsets of all the captured matches within\r\nthe string.\nGiven a regular expression and a string (optionally flavored with\ncompilation and match options), return the offsets of all the captured matches within\nthe string.")
    public static SubLObject offsets_of_regex_capturing_matches(final SubLObject regex, final SubLObject string, SubLObject comp_options, SubLObject match_options) {
        if (comp_options == UNPROVIDED) {
            comp_options = NIL;
        }
        if (match_options == UNPROVIDED) {
            match_options = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != regular_expressions.regex_p(regex) : "! regular_expressions.regex_p(regex) " + ("regular_expressions.regex_p(regex) " + "CommonSymbols.NIL != regular_expressions.regex_p(regex) ") + regex;
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        if (NIL != string_utilities.empty_string_p(regex)) {
            return NIL;
        }
        if (NIL == regular_expressions.is_regular_expressions_support_availableP()) {
            return values(NIL, $REGULAR_EXPRESSION_SUPPORT_UNAVAILABLE);
        }
        SubLObject offsets = NIL;
        thread.resetMultipleValues();
        final SubLObject pattern = regular_expressions.compile_regular_expression(regex, comp_options);
        final SubLObject error_code = thread.secondMultipleValue();
        final SubLObject error_offset = thread.thirdMultipleValue();
        final SubLObject error_msg = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        try {
            if (NIL == regular_expressions.regex_pattern_p(pattern)) {
                Errors.error($str5$Error__A___A__compiling_regular_e, new SubLObject[]{ error_code, error_msg, regex, error_offset });
            }
            offsets = find_all_captured_matches_within_string(pattern, string, match_options, NIL, UNPROVIDED, UNPROVIDED);
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (NIL != regular_expressions.regex_pattern_p(pattern)) {
                    regular_expressions.discard_regular_expression_pattern(pattern);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return offsets;
    }

    /**
     * Given an already compiled pattern and a string (optionally flavored
     * with match options), return all the captured matches within the string as a
     * list of matches ordered by occurrence within the string.
     */
    @LispMethod(comment = "Given an already compiled pattern and a string (optionally flavored\r\nwith match options), return all the captured matches within the string as a\r\nlist of matches ordered by occurrence within the string.\nGiven an already compiled pattern and a string (optionally flavored\nwith match options), return all the captured matches within the string as a\nlist of matches ordered by occurrence within the string.")
    public static final SubLObject find_all_captured_matches_for_pattern_alt(SubLObject pattern, SubLObject string, SubLObject match_options) {
        if (match_options == UNPROVIDED) {
            match_options = NIL;
        }
        SubLTrampolineFile.checkType(pattern, REGEX_PATTERN_P);
        SubLTrampolineFile.checkType(string, STRINGP);
        if (NIL == regular_expressions.is_regular_expressions_support_availableP()) {
            return values(NIL, $REGULAR_EXPRESSION_SUPPORT_UNAVAILABLE);
        }
        return com.cyc.cycjava.cycl.regular_expression_utilities.find_all_captured_matches_within_string(pattern, string, match_options, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Given an already compiled pattern and a string (optionally flavored
     * with match options), return all the captured matches within the string as a
     * list of matches ordered by occurrence within the string.
     */
    @LispMethod(comment = "Given an already compiled pattern and a string (optionally flavored\r\nwith match options), return all the captured matches within the string as a\r\nlist of matches ordered by occurrence within the string.\nGiven an already compiled pattern and a string (optionally flavored\nwith match options), return all the captured matches within the string as a\nlist of matches ordered by occurrence within the string.")
    public static SubLObject find_all_captured_matches_for_pattern(final SubLObject pattern, final SubLObject string, SubLObject match_options) {
        if (match_options == UNPROVIDED) {
            match_options = NIL;
        }
        assert NIL != regular_expressions.regex_pattern_p(pattern) : "! regular_expressions.regex_pattern_p(pattern) " + ("regular_expressions.regex_pattern_p(pattern) " + "CommonSymbols.NIL != regular_expressions.regex_pattern_p(pattern) ") + pattern;
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        if (NIL == regular_expressions.is_regular_expressions_support_availableP()) {
            return values(NIL, $REGULAR_EXPRESSION_SUPPORT_UNAVAILABLE);
        }
        return find_all_captured_matches_within_string(pattern, string, match_options, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Accumulate the individual matches within a string.
     */
    @LispMethod(comment = "Accumulate the individual matches within a string.")
    public static final SubLObject find_all_captured_matches_within_string_alt(SubLObject pattern, SubLObject string, SubLObject match_options, SubLObject stringsP, SubLObject start, SubLObject end) {
        if (match_options == UNPROVIDED) {
            match_options = NIL;
        }
        if (stringsP == UNPROVIDED) {
            stringsP = T;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = length(string);
        }
        {
            SubLObject matches = NIL;
            while (!start.isNegative()) {
                {
                    SubLObject offsets = regular_expressions.match_regular_expression_pattern_offsets(pattern, string, TEN_INTEGER, match_options, start, end);
                    SubLObject offset = NIL;
                    {
                        SubLObject list_var = NIL;
                        SubLObject offset_1 = NIL;
                        SubLObject count = NIL;
                        for (list_var = offsets, offset_1 = list_var.first(), count = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , offset_1 = list_var.first() , count = add(ONE_INTEGER, count)) {
                            {
                                SubLObject datum = offset_1;
                                SubLObject current = datum;
                                SubLObject match_start = NIL;
                                SubLObject match_end = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt16);
                                match_start = current.first();
                                current = current.rest();
                                match_end = current;
                                if (NIL != oddp(count)) {
                                    if (!match_start.isNegative()) {
                                        if (NIL != stringsP) {
                                            {
                                                SubLObject match = subseq(string, match_start, match_end);
                                                matches = cons(match, matches);
                                            }
                                        } else {
                                            matches = cons(cons(match_start, match_end), matches);
                                        }
                                    }
                                }
                                start = match_end;
                            }
                        }
                    }
                }
            } 
            return nreverse(matches);
        }
    }

    /**
     * Accumulate the individual matches within a string.
     */
    @LispMethod(comment = "Accumulate the individual matches within a string.")
    public static SubLObject find_all_captured_matches_within_string(final SubLObject pattern, final SubLObject string, SubLObject match_options, SubLObject stringsP, SubLObject start, SubLObject end) {
        if (match_options == UNPROVIDED) {
            match_options = NIL;
        }
        if (stringsP == UNPROVIDED) {
            stringsP = T;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = length(string);
        }
        SubLObject matches = NIL;
        while (!start.isNegative()) {
            final SubLObject offsets = regular_expressions.match_regular_expression_pattern_offsets(pattern, string, TEN_INTEGER, match_options, start, end);
            final SubLObject offset = NIL;
            SubLObject these_matches = NIL;
            if (!offsets.first().first().isNegative()) {
                SubLObject list_var = NIL;
                SubLObject offset_$1 = NIL;
                SubLObject count = NIL;
                list_var = offsets.rest();
                offset_$1 = list_var.first();
                for (count = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , offset_$1 = list_var.first() , count = add(ONE_INTEGER, count)) {
                    SubLObject current;
                    final SubLObject datum = current = offset_$1;
                    SubLObject match_start = NIL;
                    SubLObject match_end = NIL;
                    destructuring_bind_must_consp(current, datum, $list15);
                    match_start = current.first();
                    current = match_end = current.rest();
                    if (NIL != stringsP) {
                        final SubLObject match = subseq(string, match_start, match_end);
                        these_matches = cons(match, these_matches);
                    } else {
                        these_matches = cons(cons(match_start, match_end), these_matches);
                    }
                }
                matches = cons(nreverse(these_matches), matches);
            }
            start = cdar(offsets);
        } 
        return nreverse(matches);
    }

    public static SubLObject find_all_captured_matches_within_string_from_string(final SubLObject pattern_string, final SubLObject string, SubLObject match_options) {
        if (match_options == UNPROVIDED) {
            match_options = NIL;
        }
        return find_all_captured_matches_within_string(regular_expressions.compile_regular_expression(pattern_string, UNPROVIDED), string, match_options, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Match a capturing regexp PATTERN against STRING with the provided options.  Returns a list of captured substrings, where the first string in the list is the complete matched substring and the rest are the explicitly captured (with parenthesis) substrings in order.  If there is no match, we return NIL (instead of (""))
     */
    @LispMethod(comment = "Match a capturing regexp PATTERN against STRING with the provided options.  Returns a list of captured substrings, where the first string in the list is the complete matched substring and the rest are the explicitly captured (with parenthesis) substrings in order.  If there is no match, we return NIL (instead of (\"\"))")
    public static final SubLObject regexp_capturing_match_pattern_alt(SubLObject pattern, SubLObject string, SubLObject match_options) {
        if (match_options == UNPROVIDED) {
            match_options = NIL;
        }
        {
            SubLObject offsets = regular_expressions.match_regular_expression_pattern_offsets(pattern, string, TEN_INTEGER, match_options, UNPROVIDED, UNPROVIDED);
            SubLObject matches = NIL;
            SubLObject cdolist_list_var = offsets;
            SubLObject offset = NIL;
            for (offset = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , offset = cdolist_list_var.first()) {
                {
                    SubLObject datum = offset;
                    SubLObject current = datum;
                    SubLObject match_start = NIL;
                    SubLObject match_end = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt16);
                    match_start = current.first();
                    current = current.rest();
                    match_end = current;
                    if (match_start.isNegative()) {
                        matches = cons($str_alt19$, matches);
                    } else {
                        {
                            SubLObject match = subseq(string, match_start, match_end);
                            matches = cons(match, matches);
                        }
                    }
                }
            }
            if ((NIL != list_utilities.singletonP(matches)) && (NIL != string_utilities.empty_stringP(matches.first()))) {
                return NIL;
            } else {
                return nreverse(matches);
            }
        }
    }

    /**
     * Match a capturing regexp PATTERN against STRING with the provided options.  Returns a list of captured substrings, where the first string in the list is the complete matched substring and the rest are the explicitly captured (with parenthesis) substrings in order.  If there is no match, we return NIL (instead of (""))
     */
    @LispMethod(comment = "Match a capturing regexp PATTERN against STRING with the provided options.  Returns a list of captured substrings, where the first string in the list is the complete matched substring and the rest are the explicitly captured (with parenthesis) substrings in order.  If there is no match, we return NIL (instead of (\"\"))")
    public static SubLObject regexp_capturing_match_pattern(final SubLObject pattern, final SubLObject string, SubLObject match_options) {
        if (match_options == UNPROVIDED) {
            match_options = NIL;
        }
        final SubLObject offsets = regular_expressions.match_regular_expression_pattern_offsets(pattern, string, TEN_INTEGER, match_options, UNPROVIDED, UNPROVIDED);
        SubLObject matches = NIL;
        SubLObject cdolist_list_var = offsets;
        SubLObject offset = NIL;
        offset = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = offset;
            SubLObject match_start = NIL;
            SubLObject match_end = NIL;
            destructuring_bind_must_consp(current, datum, $list15);
            match_start = current.first();
            current = match_end = current.rest();
            if (match_start.isNegative()) {
                matches = cons($str20$, matches);
            } else {
                final SubLObject match = subseq(string, match_start, match_end);
                matches = cons(match, matches);
            }
            cdolist_list_var = cdolist_list_var.rest();
            offset = cdolist_list_var.first();
        } 
        if ((NIL != list_utilities.singletonP(matches)) && (NIL != string_utilities.empty_stringP(matches.first()))) {
            return NIL;
        }
        return nreverse(matches);
    }

    /**
     *
     *
     * @param PATTERN
    regex-p
     * 		
     * @param STRING
    string-p
     * 		
     * @return boolean; t if PATTERN matches STRING, nil otherwise
     */
    @LispMethod(comment = "@param PATTERN\nregex-p\r\n\t\t\r\n@param STRING\nstring-p\r\n\t\t\r\n@return boolean; t if PATTERN matches STRING, nil otherwise")
    public static final SubLObject regex_matchP_alt(SubLObject pattern, SubLObject string) {
        return subl_promotions.non_negative_integer_p(regular_expressions.match_regular_expression_pattern_offsets(pattern, string, ONE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED).first().first());
    }

    /**
     *
     *
     * @param PATTERN
    regex-p
     * 		
     * @param STRING
    string-p
     * 		
     * @return boolean; t if PATTERN matches STRING, nil otherwise
     */
    @LispMethod(comment = "@param PATTERN\nregex-p\r\n\t\t\r\n@param STRING\nstring-p\r\n\t\t\r\n@return boolean; t if PATTERN matches STRING, nil otherwise")
    public static SubLObject regex_matchP(final SubLObject pattern, final SubLObject string) {
        return subl_promotions.non_negative_integer_p(regular_expressions.match_regular_expression_pattern_offsets(pattern, string, ONE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED).first().first());
    }

    public static SubLObject regex_match_compile_pattern(final SubLObject pattern_string, final SubLObject match_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject matchP = NIL;
        thread.resetMultipleValues();
        final SubLObject regex_pattern = regular_expressions.compile_regular_expression(pattern_string, NIL);
        final SubLObject error_code = thread.secondMultipleValue();
        final SubLObject error_offset = thread.thirdMultipleValue();
        final SubLObject error_msg = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        try {
            if (NIL == regular_expressions.regex_pattern_p(regex_pattern)) {
                Errors.error($str5$Error__A___A__compiling_regular_e, new SubLObject[]{ error_code, error_msg, pattern_string, error_offset });
            }
            matchP = regex_matchP(regex_pattern, match_string);
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (NIL != regular_expressions.regex_pattern_p(regex_pattern)) {
                    regular_expressions.discard_regular_expression_pattern(regex_pattern);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return matchP;
    }

    public static final SubLObject get_backreference_pattern_alt(SubLObject i) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!(i.numG(ZERO_INTEGER) && i.numL(TEN_INTEGER))) {
                    Errors.error($str_alt20$Invalid_backreference___a);
                }
            }
            {
                SubLObject pattern = aref($backreference_patterns$.getDynamicValue(thread), number_utilities.f_1_(i));
                if (NIL == pattern) {
                    pattern = regular_expressions.compile_regular_expression(cconcatenate($str_alt21$__, format_nil.format_nil_d_no_copy(i)), UNPROVIDED);
                    set_aref($backreference_patterns$.getDynamicValue(thread), number_utilities.f_1_(i), pattern);
                }
                return pattern;
            }
        }
    }

    public static SubLObject get_backreference_pattern(final SubLObject i) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((!i.numG(ZERO_INTEGER)) || (!i.numL(TEN_INTEGER)))) {
            Errors.error($str21$Invalid_backreference___a);
        }
        SubLObject pattern = aref($backreference_patterns$.getDynamicValue(thread), number_utilities.f_1_(i));
        if (NIL == pattern) {
            pattern = regular_expressions.compile_regular_expression(cconcatenate($str22$__, format_nil.format_nil_d_no_copy(i)), UNPROVIDED);
            set_aref($backreference_patterns$.getDynamicValue(thread), number_utilities.f_1_(i), pattern);
        }
        return pattern;
    }

    /**
     * Substitutes REPLACEMENT for each occurrence in STRING matching PATTERN
     */
    @LispMethod(comment = "Substitutes REPLACEMENT for each occurrence in STRING matching PATTERN")
    public static final SubLObject regex_subst_alt(SubLObject pattern, SubLObject replacement0, SubLObject string, SubLObject options) {
        if (options == UNPROVIDED) {
            options = NIL;
        }
        SubLTrampolineFile.checkType(pattern, REGEX_PATTERN_P);
        SubLTrampolineFile.checkType(replacement0, STRINGP);
        SubLTrampolineFile.checkType(string, STRINGP);
        SubLTrampolineFile.checkType(options, LISTP);
        {
            SubLObject start = ZERO_INTEGER;
            SubLObject end = length(string);
            SubLObject replaced = NIL;
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                while (!start.isNegative()) {
                    {
                        SubLObject offsets = regular_expressions.match_regular_expression_pattern_offsets(pattern, string, TEN_INTEGER, options, start, end);
                        SubLObject entire_offset = offsets.first();
                        SubLObject match_start = entire_offset.first();
                        SubLObject match_end = entire_offset.rest();
                        SubLObject captured_offsets = offsets.rest();
                        SubLObject replacement = replacement0;
                        SubLObject i = ZERO_INTEGER;
                        SubLObject cdolist_list_var = captured_offsets;
                        SubLObject captured_offset = NIL;
                        for (captured_offset = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , captured_offset = cdolist_list_var.first()) {
                            i = add(i, ONE_INTEGER);
                            replacement = com.cyc.cycjava.cycl.regular_expression_utilities.regex_subst(com.cyc.cycjava.cycl.regular_expression_utilities.get_backreference_pattern(i), subseq(string, captured_offset.first(), captured_offset.rest()), replacement, options);
                        }
                        if (match_start.isNegative()) {
                            write_string(subseq(string, start, end), stream, UNPROVIDED, UNPROVIDED);
                        } else {
                            write_string(subseq(string, start, match_start), stream, UNPROVIDED, UNPROVIDED);
                            write_string(replacement, stream, UNPROVIDED, UNPROVIDED);
                        }
                        start = match_end;
                    }
                } 
                replaced = get_output_stream_string(stream);
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
            return replaced;
        }
    }

    /**
     * Substitutes REPLACEMENT for each occurrence in STRING matching PATTERN
     */
    @LispMethod(comment = "Substitutes REPLACEMENT for each occurrence in STRING matching PATTERN")
    public static SubLObject regex_subst(final SubLObject pattern, final SubLObject replacement0, final SubLObject string, SubLObject options) {
        if (options == UNPROVIDED) {
            options = NIL;
        }
        assert NIL != regular_expressions.regex_pattern_p(pattern) : "! regular_expressions.regex_pattern_p(pattern) " + ("regular_expressions.regex_pattern_p(pattern) " + "CommonSymbols.NIL != regular_expressions.regex_pattern_p(pattern) ") + pattern;
        assert NIL != stringp(replacement0) : "! stringp(replacement0) " + ("Types.stringp(replacement0) " + "CommonSymbols.NIL != Types.stringp(replacement0) ") + replacement0;
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        assert NIL != listp(options) : "! listp(options) " + ("Types.listp(options) " + "CommonSymbols.NIL != Types.listp(options) ") + options;
        SubLObject start = ZERO_INTEGER;
        final SubLObject end = length(string);
        SubLObject replaced = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            while (!start.isNegative()) {
                final SubLObject offsets = regular_expressions.match_regular_expression_pattern_offsets(pattern, string, TEN_INTEGER, options, start, end);
                final SubLObject entire_offset = offsets.first();
                final SubLObject match_start = entire_offset.first();
                final SubLObject match_end = entire_offset.rest();
                final SubLObject captured_offsets = offsets.rest();
                SubLObject replacement = replacement0;
                SubLObject i = ZERO_INTEGER;
                SubLObject cdolist_list_var = captured_offsets;
                SubLObject captured_offset = NIL;
                captured_offset = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    i = add(i, ONE_INTEGER);
                    replacement = regex_subst(get_backreference_pattern(i), subseq(string, captured_offset.first(), captured_offset.rest()), replacement, options);
                    cdolist_list_var = cdolist_list_var.rest();
                    captured_offset = cdolist_list_var.first();
                } 
                if (match_start.isNegative()) {
                    write_string(subseq(string, start, end), stream, UNPROVIDED, UNPROVIDED);
                } else {
                    write_string(subseq(string, start, match_start), stream, UNPROVIDED, UNPROVIDED);
                    write_string(replacement, stream, UNPROVIDED, UNPROVIDED);
                }
                start = match_end;
            } 
            replaced = get_output_stream_string(stream);
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
        return replaced;
    }

    /**
     * Given a regular expression and a filename, scan the lines of the filename
     * for matches. Return a list of match expressions, consisting of line
     * number, line matched and 'support' for the match.
     */
    @LispMethod(comment = "Given a regular expression and a filename, scan the lines of the filename\r\nfor matches. Return a list of match expressions, consisting of line\r\nnumber, line matched and \'support\' for the match.\nGiven a regular expression and a filename, scan the lines of the filename\nfor matches. Return a list of match expressions, consisting of line\nnumber, line matched and \'support\' for the match.")
    public static final SubLObject file_grep_alt(SubLObject regular_expression, SubLObject filename, SubLObject comp_options, SubLObject match_options) {
        if (comp_options == UNPROVIDED) {
            comp_options = NIL;
        }
        if (match_options == UNPROVIDED) {
            match_options = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(regular_expression, REGULAR_EXPRESSION_P);
            SubLTrampolineFile.checkType(filename, STRINGP);
            if (NIL == regular_expressions.is_regular_expressions_support_availableP()) {
                return values(NIL, $REGULAR_EXPRESSION_SUPPORT_UNAVAILABLE);
            }
            {
                SubLObject matches = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject pattern = regular_expressions.compile_regular_expression(regular_expression, comp_options);
                    SubLObject error_code = thread.secondMultipleValue();
                    SubLObject error_offset = thread.thirdMultipleValue();
                    SubLObject error_msg = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    try {
                        if (NIL == regular_expressions.regex_pattern_p(pattern)) {
                            Errors.error($str_alt5$Error__A___A__compiling_regular_e, new SubLObject[]{ error_code, error_msg, regular_expression, error_offset });
                        }
                        matches = com.cyc.cycjava.cycl.regular_expression_utilities.file_grep_pattern(pattern, filename, match_options);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                if (NIL != regular_expressions.regex_pattern_p(pattern)) {
                                    regular_expressions.discard_regular_expression_pattern(pattern);
                                }
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return matches;
            }
        }
    }

    @LispMethod(comment = "Given a regular expression and a filename, scan the lines of the filename\r\nfor matches. Return a list of match expressions, consisting of line\r\nnumber, line matched and \'support\' for the match.\nGiven a regular expression and a filename, scan the lines of the filename\nfor matches. Return a list of match expressions, consisting of line\nnumber, line matched and \'support\' for the match.")
    public static SubLObject file_grep(final SubLObject regular_expression, final SubLObject filename, SubLObject comp_options, SubLObject match_options) {
        if (comp_options == UNPROVIDED) {
            comp_options = NIL;
        }
        if (match_options == UNPROVIDED) {
            match_options = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != regular_expressions.regular_expression_p(regular_expression) : "! regular_expressions.regular_expression_p(regular_expression) " + ("regular_expressions.regular_expression_p(regular_expression) " + "CommonSymbols.NIL != regular_expressions.regular_expression_p(regular_expression) ") + regular_expression;
        assert NIL != stringp(filename) : "! stringp(filename) " + ("Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) ") + filename;
        if (NIL == regular_expressions.is_regular_expressions_support_availableP()) {
            return values(NIL, $REGULAR_EXPRESSION_SUPPORT_UNAVAILABLE);
        }
        SubLObject matches = NIL;
        thread.resetMultipleValues();
        final SubLObject pattern = regular_expressions.compile_regular_expression(regular_expression, comp_options);
        final SubLObject error_code = thread.secondMultipleValue();
        final SubLObject error_offset = thread.thirdMultipleValue();
        final SubLObject error_msg = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        try {
            if (NIL == regular_expressions.regex_pattern_p(pattern)) {
                Errors.error($str5$Error__A___A__compiling_regular_e, new SubLObject[]{ error_code, error_msg, regular_expression, error_offset });
            }
            matches = file_grep_pattern(pattern, filename, match_options);
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (NIL != regular_expressions.regex_pattern_p(pattern)) {
                    regular_expressions.discard_regular_expression_pattern(pattern);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return matches;
    }

    public static SubLObject file_match(final SubLObject string, final SubLObject filename, SubLObject comp_options, SubLObject match_options) {
        if (comp_options == UNPROVIDED) {
            comp_options = NIL;
        }
        if (match_options == UNPROVIDED) {
            match_options = NIL;
        }
        return file_grep(escape_regex_special_chars(string), filename, comp_options, match_options);
    }

    public static SubLObject file_matchesP(final SubLObject string, final SubLObject filename, SubLObject comp_options, SubLObject match_options) {
        if (comp_options == UNPROVIDED) {
            comp_options = NIL;
        }
        if (match_options == UNPROVIDED) {
            match_options = NIL;
        }
        return list_utilities.sublisp_boolean(file_match(string, filename, comp_options, match_options));
    }

    /**
     * Given a regular expression and a filename, scan the lines of the filename
     * for matches. Return a list of match expressions, consisting of line
     * number, line matched and 'support' for the match.
     */
    @LispMethod(comment = "Given a regular expression and a filename, scan the lines of the filename\r\nfor matches. Return a list of match expressions, consisting of line\r\nnumber, line matched and \'support\' for the match.\nGiven a regular expression and a filename, scan the lines of the filename\nfor matches. Return a list of match expressions, consisting of line\nnumber, line matched and \'support\' for the match.")
    public static final SubLObject file_grep_pattern_alt(SubLObject pattern, SubLObject filename, SubLObject match_options) {
        if (match_options == UNPROVIDED) {
            match_options = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(pattern, REGEX_PATTERN_P);
            SubLTrampolineFile.checkType(filename, STRINGP);
            if (NIL == regular_expressions.is_regular_expressions_support_availableP()) {
                return values(NIL, $REGULAR_EXPRESSION_SUPPORT_UNAVAILABLE);
            }
            {
                SubLObject matches = NIL;
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
                        Errors.error($str_alt25$Unable_to_open__S, filename);
                    }
                    {
                        SubLObject stream_2 = stream;
                        matches = com.cyc.cycjava.cycl.regular_expression_utilities.file_grep_internal(pattern, stream_2, match_options);
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
                return matches;
            }
        }
    }

    /**
     * Given a regular expression and a filename, scan the lines of the filename
     * for matches. Return a list of match expressions, consisting of line
     * number, line matched and 'support' for the match.
     */
    @LispMethod(comment = "Given a regular expression and a filename, scan the lines of the filename\r\nfor matches. Return a list of match expressions, consisting of line\r\nnumber, line matched and \'support\' for the match.\nGiven a regular expression and a filename, scan the lines of the filename\nfor matches. Return a list of match expressions, consisting of line\nnumber, line matched and \'support\' for the match.")
    public static SubLObject file_grep_pattern(final SubLObject pattern, final SubLObject filename, SubLObject match_options) {
        if (match_options == UNPROVIDED) {
            match_options = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != regular_expressions.regex_pattern_p(pattern) : "! regular_expressions.regex_pattern_p(pattern) " + ("regular_expressions.regex_pattern_p(pattern) " + "CommonSymbols.NIL != regular_expressions.regex_pattern_p(pattern) ") + pattern;
        assert NIL != stringp(filename) : "! stringp(filename) " + ("Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) ") + filename;
        if (NIL == regular_expressions.is_regular_expressions_support_availableP()) {
            return values(NIL, $REGULAR_EXPRESSION_SUPPORT_UNAVAILABLE);
        }
        SubLObject matches = NIL;
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
                Errors.error($str26$Unable_to_open__S, filename);
            }
            final SubLObject stream_$2 = stream;
            matches = file_grep_internal(pattern, stream_$2, match_options);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return matches;
    }

    public static final SubLObject file_grep_internal_alt(SubLObject pattern, SubLObject stream, SubLObject match_options) {
        if (match_options == UNPROVIDED) {
            match_options = NIL;
        }
        {
            SubLObject matches = NIL;
            SubLObject line_count = NIL;
            SubLObject line = NIL;
            for (line_count = ONE_INTEGER, line = read_line(stream, NIL, NIL, UNPROVIDED); NIL != line; line_count = add(line_count, ONE_INTEGER) , line = read_line(stream, NIL, NIL, UNPROVIDED)) {
                {
                    SubLObject line_matches = com.cyc.cycjava.cycl.regular_expression_utilities.find_all_matches_within_string(pattern, line, match_options, NIL, UNPROVIDED, UNPROVIDED);
                    if (NIL != line_matches) {
                        matches = cons(list(line_count, line, line_matches), matches);
                    }
                }
            }
            return nreverse(matches);
        }
    }

    public static SubLObject file_grep_internal(final SubLObject pattern, final SubLObject stream, SubLObject match_options) {
        if (match_options == UNPROVIDED) {
            match_options = NIL;
        }
        SubLObject matches = NIL;
        SubLObject line_count = NIL;
        SubLObject line = NIL;
        line_count = ONE_INTEGER;
        for (line = string_utilities.network_read_line(stream, NIL, NIL, UNPROVIDED); NIL != line; line = read_line(stream, NIL, NIL, UNPROVIDED)) {
            final SubLObject line_matches = find_all_matches_within_string(pattern, line, match_options, NIL, UNPROVIDED, UNPROVIDED);
            if (NIL != line_matches) {
                matches = cons(list(line_count, line, line_matches), matches);
            }
            line_count = add(line_count, ONE_INTEGER);
        }
        return nreverse(matches);
    }

    /**
     * Given a regular expression and a vector, scan the cells in the vector
     * for matches. Return a list of match expressions, consisting of vector cell number
     * , vector cell contents, and 'support' (e.g. location) for the match.
     */
    @LispMethod(comment = "Given a regular expression and a vector, scan the cells in the vector\r\nfor matches. Return a list of match expressions, consisting of vector cell number\r\n, vector cell contents, and \'support\' (e.g. location) for the match.\nGiven a regular expression and a vector, scan the cells in the vector\nfor matches. Return a list of match expressions, consisting of vector cell number\n, vector cell contents, and \'support\' (e.g. location) for the match.")
    public static final SubLObject vector_grep_alt(SubLObject regular_expression, SubLObject vector, SubLObject comp_options, SubLObject match_options) {
        if (comp_options == UNPROVIDED) {
            comp_options = NIL;
        }
        if (match_options == UNPROVIDED) {
            match_options = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(regular_expression, REGULAR_EXPRESSION_P);
            SubLTrampolineFile.checkType(vector, VECTORP);
            if (NIL == regular_expressions.is_regular_expressions_support_availableP()) {
                return values(NIL, $REGULAR_EXPRESSION_SUPPORT_UNAVAILABLE);
            }
            {
                SubLObject matches = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject pattern = regular_expressions.compile_regular_expression(regular_expression, comp_options);
                    SubLObject error_code = thread.secondMultipleValue();
                    SubLObject error_offset = thread.thirdMultipleValue();
                    SubLObject error_msg = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    try {
                        if (NIL == regular_expressions.regex_pattern_p(pattern)) {
                            Errors.error($str_alt5$Error__A___A__compiling_regular_e, new SubLObject[]{ error_code, error_msg, regular_expression, error_offset });
                        }
                        matches = com.cyc.cycjava.cycl.regular_expression_utilities.vector_grep_pattern(pattern, vector, match_options);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                if (NIL != regular_expressions.regex_pattern_p(pattern)) {
                                    regular_expressions.discard_regular_expression_pattern(pattern);
                                }
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return matches;
            }
        }
    }

    @LispMethod(comment = "Given a regular expression and a vector, scan the cells in the vector\r\nfor matches. Return a list of match expressions, consisting of vector cell number\r\n, vector cell contents, and \'support\' (e.g. location) for the match.\nGiven a regular expression and a vector, scan the cells in the vector\nfor matches. Return a list of match expressions, consisting of vector cell number\n, vector cell contents, and \'support\' (e.g. location) for the match.")
    public static SubLObject vector_grep(final SubLObject regular_expression, final SubLObject vector, SubLObject comp_options, SubLObject match_options) {
        if (comp_options == UNPROVIDED) {
            comp_options = NIL;
        }
        if (match_options == UNPROVIDED) {
            match_options = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != regular_expressions.regular_expression_p(regular_expression) : "! regular_expressions.regular_expression_p(regular_expression) " + ("regular_expressions.regular_expression_p(regular_expression) " + "CommonSymbols.NIL != regular_expressions.regular_expression_p(regular_expression) ") + regular_expression;
        assert NIL != vectorp(vector) : "! vectorp(vector) " + ("Types.vectorp(vector) " + "CommonSymbols.NIL != Types.vectorp(vector) ") + vector;
        if (NIL == regular_expressions.is_regular_expressions_support_availableP()) {
            return values(NIL, $REGULAR_EXPRESSION_SUPPORT_UNAVAILABLE);
        }
        SubLObject matches = NIL;
        thread.resetMultipleValues();
        final SubLObject pattern = regular_expressions.compile_regular_expression(regular_expression, comp_options);
        final SubLObject error_code = thread.secondMultipleValue();
        final SubLObject error_offset = thread.thirdMultipleValue();
        final SubLObject error_msg = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        try {
            if (NIL == regular_expressions.regex_pattern_p(pattern)) {
                Errors.error($str5$Error__A___A__compiling_regular_e, new SubLObject[]{ error_code, error_msg, regular_expression, error_offset });
            }
            matches = vector_grep_pattern(pattern, vector, match_options);
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (NIL != regular_expressions.regex_pattern_p(pattern)) {
                    regular_expressions.discard_regular_expression_pattern(pattern);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return matches;
    }

    public static final SubLObject vector_grep_pattern_alt(SubLObject pattern, SubLObject vector, SubLObject match_options) {
        if (match_options == UNPROVIDED) {
            match_options = NIL;
        }
        SubLTrampolineFile.checkType(vector, VECTORP);
        return com.cyc.cycjava.cycl.regular_expression_utilities.sequence_grep_pattern(pattern, vector, match_options);
    }

    public static SubLObject vector_grep_pattern(final SubLObject pattern, final SubLObject vector, SubLObject match_options) {
        if (match_options == UNPROVIDED) {
            match_options = NIL;
        }
        assert NIL != vectorp(vector) : "! vectorp(vector) " + ("Types.vectorp(vector) " + "CommonSymbols.NIL != Types.vectorp(vector) ") + vector;
        return sequence_grep_pattern(pattern, vector, match_options);
    }

    /**
     * Given a regular expression and a list, scan the cells in the list
     * for matches. Return a list of match expressions, consisting of list cell number,
     * cons contents, and 'support' (e.g. location) for the match.
     */
    @LispMethod(comment = "Given a regular expression and a list, scan the cells in the list\r\nfor matches. Return a list of match expressions, consisting of list cell number,\r\ncons contents, and \'support\' (e.g. location) for the match.\nGiven a regular expression and a list, scan the cells in the list\nfor matches. Return a list of match expressions, consisting of list cell number,\ncons contents, and \'support\' (e.g. location) for the match.")
    public static final SubLObject list_grep_alt(SubLObject regular_expression, SubLObject list, SubLObject comp_options, SubLObject match_options) {
        if (comp_options == UNPROVIDED) {
            comp_options = NIL;
        }
        if (match_options == UNPROVIDED) {
            match_options = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(regular_expression, REGULAR_EXPRESSION_P);
            SubLTrampolineFile.checkType(list, LISTP);
            if (NIL == regular_expressions.is_regular_expressions_support_availableP()) {
                return values(NIL, $REGULAR_EXPRESSION_SUPPORT_UNAVAILABLE);
            }
            {
                SubLObject matches = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject pattern = regular_expressions.compile_regular_expression(regular_expression, comp_options);
                    SubLObject error_code = thread.secondMultipleValue();
                    SubLObject error_offset = thread.thirdMultipleValue();
                    SubLObject error_msg = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    try {
                        if (NIL == regular_expressions.regex_pattern_p(pattern)) {
                            Errors.error($str_alt5$Error__A___A__compiling_regular_e, new SubLObject[]{ error_code, error_msg, regular_expression, error_offset });
                        }
                        matches = com.cyc.cycjava.cycl.regular_expression_utilities.sequence_grep_pattern(pattern, list, match_options);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                if (NIL != regular_expressions.regex_pattern_p(pattern)) {
                                    regular_expressions.discard_regular_expression_pattern(pattern);
                                }
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return matches;
            }
        }
    }

    @LispMethod(comment = "Given a regular expression and a list, scan the cells in the list\r\nfor matches. Return a list of match expressions, consisting of list cell number,\r\ncons contents, and \'support\' (e.g. location) for the match.\nGiven a regular expression and a list, scan the cells in the list\nfor matches. Return a list of match expressions, consisting of list cell number,\ncons contents, and \'support\' (e.g. location) for the match.")
    public static SubLObject list_grep(final SubLObject regular_expression, final SubLObject list, SubLObject comp_options, SubLObject match_options) {
        if (comp_options == UNPROVIDED) {
            comp_options = NIL;
        }
        if (match_options == UNPROVIDED) {
            match_options = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != regular_expressions.regular_expression_p(regular_expression) : "! regular_expressions.regular_expression_p(regular_expression) " + ("regular_expressions.regular_expression_p(regular_expression) " + "CommonSymbols.NIL != regular_expressions.regular_expression_p(regular_expression) ") + regular_expression;
        assert NIL != listp(list) : "! listp(list) " + ("Types.listp(list) " + "CommonSymbols.NIL != Types.listp(list) ") + list;
        if (NIL == regular_expressions.is_regular_expressions_support_availableP()) {
            return values(NIL, $REGULAR_EXPRESSION_SUPPORT_UNAVAILABLE);
        }
        SubLObject matches = NIL;
        thread.resetMultipleValues();
        final SubLObject pattern = regular_expressions.compile_regular_expression(regular_expression, comp_options);
        final SubLObject error_code = thread.secondMultipleValue();
        final SubLObject error_offset = thread.thirdMultipleValue();
        final SubLObject error_msg = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        try {
            if (NIL == regular_expressions.regex_pattern_p(pattern)) {
                Errors.error($str5$Error__A___A__compiling_regular_e, new SubLObject[]{ error_code, error_msg, regular_expression, error_offset });
            }
            matches = sequence_grep_pattern(pattern, list, match_options);
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (NIL != regular_expressions.regex_pattern_p(pattern)) {
                    regular_expressions.discard_regular_expression_pattern(pattern);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return matches;
    }

    public static final SubLObject sequence_grep_pattern_alt(SubLObject pattern, SubLObject sequence, SubLObject match_options) {
        if (match_options == UNPROVIDED) {
            match_options = NIL;
        }
        SubLTrampolineFile.checkType(pattern, REGEX_PATTERN_P);
        SubLTrampolineFile.checkType(sequence, SEQUENCEP);
        {
            SubLObject matches = NIL;
            SubLObject sequence_var = sequence;
            SubLObject end_index = (sequence_var.isList()) ? ((SubLObject) (NIL)) : length(sequence_var);
            SubLObject elt_num = ZERO_INTEGER;
            SubLObject sequence_doneP = subl_macros.do_sequence_index_doneP(elt_num, end_index, sequence_var);
            while (NIL == sequence_doneP) {
                {
                    SubLObject elt = subl_macros.do_sequence_index_valueP(elt_num, sequence_var);
                    if (elt.isString()) {
                        {
                            SubLObject elt_matches = com.cyc.cycjava.cycl.regular_expression_utilities.find_all_matches_within_string(pattern, elt, match_options, NIL, UNPROVIDED, UNPROVIDED);
                            if (NIL != elt_matches) {
                                matches = cons(list(elt_num, elt, elt_matches), matches);
                            }
                        }
                    }
                    sequence_var = subl_macros.do_sequence_index_update(sequence_var);
                    elt_num = add(elt_num, ONE_INTEGER);
                    sequence_doneP = subl_macros.do_sequence_index_doneP(elt_num, end_index, sequence_var);
                }
            } 
            return nreverse(matches);
        }
    }

    public static SubLObject sequence_grep_pattern(final SubLObject pattern, final SubLObject sequence, SubLObject match_options) {
        if (match_options == UNPROVIDED) {
            match_options = NIL;
        }
        assert NIL != regular_expressions.regex_pattern_p(pattern) : "! regular_expressions.regex_pattern_p(pattern) " + ("regular_expressions.regex_pattern_p(pattern) " + "CommonSymbols.NIL != regular_expressions.regex_pattern_p(pattern) ") + pattern;
        assert NIL != sequencep(sequence) : "! sequencep(sequence) " + ("Types.sequencep(sequence) " + "CommonSymbols.NIL != Types.sequencep(sequence) ") + sequence;
        SubLObject matches = NIL;
        for (SubLObject sequence_var = sequence, end_index = (sequence_var.isList()) ? NIL : length(sequence_var), elt_num = ZERO_INTEGER, sequence_doneP = subl_macros.do_sequence_index_doneP(elt_num, end_index, sequence_var); NIL == sequence_doneP; sequence_doneP = subl_macros.do_sequence_index_doneP(elt_num, end_index, sequence_var)) {
            final SubLObject elt = subl_macros.do_sequence_index_valueP(elt_num, sequence_var);
            if (elt.isString()) {
                final SubLObject elt_matches = find_all_matches_within_string(pattern, elt, match_options, NIL, UNPROVIDED, UNPROVIDED);
                if (NIL != elt_matches) {
                    matches = cons(list(elt_num, elt, elt_matches), matches);
                }
            }
            sequence_var = subl_macros.do_sequence_index_update(sequence_var);
            elt_num = add(elt_num, ONE_INTEGER);
        }
        return nreverse(matches);
    }

    public static final SubLObject escape_regex_special_chars_alt(SubLObject string) {
        {
            SubLObject result = NIL;
            SubLObject special = NIL;
            {
                SubLObject string_var = string;
                SubLObject end_var = length(string_var);
                SubLObject end_var_3 = end_var;
                SubLObject char_num = NIL;
                for (char_num = ZERO_INTEGER; !char_num.numGE(end_var_3); char_num = number_utilities.f_1X(char_num)) {
                    {
                        SubLObject v_char = Strings.sublisp_char(string_var, char_num);
                        if (NIL != find(v_char, $regex_special_chars$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            special = T;
                        }
                    }
                }
            }
            if (NIL == special) {
                return string;
            }
            {
                SubLObject stream = NIL;
                try {
                    stream = make_private_string_output_stream();
                    {
                        SubLObject string_var = string;
                        SubLObject end_var = length(string_var);
                        SubLObject end_var_4 = end_var;
                        SubLObject char_num = NIL;
                        for (char_num = ZERO_INTEGER; !char_num.numGE(end_var_4); char_num = number_utilities.f_1X(char_num)) {
                            {
                                SubLObject v_char = Strings.sublisp_char(string_var, char_num);
                                if (NIL != find(v_char, $regex_special_chars$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                    format(stream, $str_alt29$___A_, v_char);
                                } else {
                                    format(stream, $str_alt30$__A_, v_char);
                                }
                            }
                        }
                    }
                    result = get_output_stream_string(stream);
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
            }
            return result;
        }
    }

    public static SubLObject escape_regex_special_chars(final SubLObject string) {
        SubLObject result = NIL;
        SubLObject special = NIL;
        SubLObject end_var_$3;
        SubLObject end_var;
        SubLObject char_num;
        SubLObject v_char;
        for (end_var = end_var_$3 = length(string), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE(end_var_$3); char_num = number_utilities.f_1X(char_num)) {
            v_char = Strings.sublisp_char(string, char_num);
            if (NIL != find(v_char, $regex_special_chars$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                special = T;
            }
        }
        if (NIL == special) {
            return string;
        }
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            SubLObject end_var_$4;
            SubLObject end_var2;
            SubLObject char_num2;
            SubLObject v_char2;
            for (end_var2 = end_var_$4 = length(string), char_num2 = NIL, char_num2 = ZERO_INTEGER; !char_num2.numGE(end_var_$4); char_num2 = number_utilities.f_1X(char_num2)) {
                v_char2 = Strings.sublisp_char(string, char_num2);
                if (NIL != find(v_char2, $regex_special_chars$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    format(stream, $str30$___A_, v_char2);
                } else {
                    format(stream, $str31$__A_, v_char2);
                }
            }
            result = get_output_stream_string(stream);
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
        return result;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$__________ = makeString(".*?[]^()|+");

    static private final SubLString $str_alt5$Error__A___A__compiling_regular_e = makeString("Error ~A (~A) compiling regular expression ~S at offset ~A.");

    static private final SubLString $$$rck = makeString("rck");

    static private final SubLList $list_alt14 = list(list(list(makeString("[a-z]+"), makeString("UPPER lower CASING matters")), list(makeString("lower"), makeString("matters"))), list(list(makeString("[0-9]+"), makeString("Call me after 9 on my cell -- 342-4099")), list(makeString("9"), makeString("342"), makeString("4099"))), list(list(makeString("[0-9.]+"), makeString("The IP address of my machine is 127.0.0.1")), list(makeString("127.0.0.1"))), list(list(makeString("[0-9a-z.]+@[0-9a-z.]+"), makeString("You can email me at poohbear@hundredacrewoods.org, if you want.")), list(makeString("poohbear@hundredacrewoods.org"))));

    public static SubLObject declare_regular_expression_utilities_file() {
        declareFunction("regular_expression_char_p", "REGULAR-EXPRESSION-CHAR-P", 1, 0, false);
        declareFunction("regular_expression_string_p", "REGULAR-EXPRESSION-STRING-P", 1, 0, false);
        declareFunction("non_regular_expression_string_p", "NON-REGULAR-EXPRESSION-STRING-P", 1, 0, false);
        declareFunction("find_all_matches_for_regular_expression", "FIND-ALL-MATCHES-FOR-REGULAR-EXPRESSION", 2, 2, false);
        declareFunction("offsets_of_regex_matches", "OFFSETS-OF-REGEX-MATCHES", 2, 2, false);
        declareFunction("find_all_matches_for_pattern", "FIND-ALL-MATCHES-FOR-PATTERN", 2, 1, false);
        declareFunction("find_all_matches_within_string", "FIND-ALL-MATCHES-WITHIN-STRING", 2, 4, false);
        declareFunction("regexp_capturing_match", "REGEXP-CAPTURING-MATCH", 2, 2, false);
        declareFunction("offsets_of_regex_capturing_matches", "OFFSETS-OF-REGEX-CAPTURING-MATCHES", 2, 2, false);
        declareFunction("find_all_captured_matches_for_pattern", "FIND-ALL-CAPTURED-MATCHES-FOR-PATTERN", 2, 1, false);
        declareFunction("find_all_captured_matches_within_string", "FIND-ALL-CAPTURED-MATCHES-WITHIN-STRING", 2, 4, false);
        declareFunction("find_all_captured_matches_within_string_from_string", "FIND-ALL-CAPTURED-MATCHES-WITHIN-STRING-FROM-STRING", 2, 1, false);
        declareFunction("regexp_capturing_match_pattern", "REGEXP-CAPTURING-MATCH-PATTERN", 2, 1, false);
        declareFunction("regex_matchP", "REGEX-MATCH?", 2, 0, false);
        declareFunction("regex_match_compile_pattern", "REGEX-MATCH-COMPILE-PATTERN", 2, 0, false);
        declareFunction("get_backreference_pattern", "GET-BACKREFERENCE-PATTERN", 1, 0, false);
        declareFunction("regex_subst", "REGEX-SUBST", 3, 1, false);
        declareFunction("file_grep", "FILE-GREP", 2, 2, false);
        declareFunction("file_match", "FILE-MATCH", 2, 2, false);
        declareFunction("file_matchesP", "FILE-MATCHES?", 2, 2, false);
        declareFunction("file_grep_pattern", "FILE-GREP-PATTERN", 2, 1, false);
        declareFunction("file_grep_internal", "FILE-GREP-INTERNAL", 2, 1, false);
        declareFunction("vector_grep", "VECTOR-GREP", 2, 2, false);
        declareFunction("vector_grep_pattern", "VECTOR-GREP-PATTERN", 2, 1, false);
        declareFunction("list_grep", "LIST-GREP", 2, 2, false);
        declareFunction("sequence_grep_pattern", "SEQUENCE-GREP-PATTERN", 2, 1, false);
        declareFunction("escape_regex_special_chars", "ESCAPE-REGEX-SPECIAL-CHARS", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt16 = cons(makeSymbol("MATCH-START"), makeSymbol("MATCH-END"));

    static private final SubLList $list_alt18 = list(new SubLObject[]{ list(list(makeString(""), makeString("")), NIL), list(list(makeString("the ((red|white) (king|queen))"), makeString("the red queen")), list(makeString("the red queen"), makeString("red queen"), makeString("red"), makeString("queen"))), list(list(makeString("(a|(z))(bc)"), makeString("abc")), list(makeString("abc"), makeString("a"), makeString(""), makeString("bc"))), list(list(makeString("(a|(z))(bc)"), makeString("azbca")), list(makeString("zbc"), makeString("z"), makeString("z"), makeString("bc"))), list(list(makeString("(a)+"), makeString("aaaaa")), list(makeString("aaaaa"), makeString("a"))), list(list(makeString("(a+)"), makeString("aaaaa")), list(makeString("aaaaa"), makeString("aaaaa"))), list(list(makeString("(.*)(ab)+\\1"), makeString("xyzababxyz")), list(makeString("xyzababxyz"), makeString("xyz"), makeString("ab"))), list(list(makeString("^(\\d+)\\s+\\d+\\s+\\1$"), makeString("212 37337 212")), list(makeString("212 37337 212"), makeString("212"))), list(list(makeString("^(a(b)?)+$"), makeString("aba")), list(makeString("aba"), makeString("a"), makeString("b"))), list(list(makeString("^(aa(bb)?)+$"), makeString("aabbaa")), list(makeString("aabbaa"), makeString("aa"), makeString("bb"))), list(list(makeString("^(aa(b(b))?)+$"), makeString("aabbaa")), list(makeString("aabbaa"), makeString("aa"), makeString("bb"), makeString("b"))), list(list(makeString("^(a)?a"), makeString("a")), list(makeString("a"), makeString(""))) });

    static private final SubLString $str_alt20$Invalid_backreference___a = makeString("Invalid backreference \\~a");

    static private final SubLString $str_alt21$__ = makeString("\\\\");

    static private final SubLString $str_alt25$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt28$_________ = makeString("[]?.*^$()");

    static private final SubLString $str_alt29$___A_ = makeString("[\\~A]");

    public static final SubLObject init_regular_expression_utilities_file_alt() {
        defconstant("*REGULAR-EXPRESSION-META-CHARACTERS*", $str_alt0$__________);
        defvar("*BACKREFERENCE-PATTERNS*", make_vector(TEN_INTEGER, UNPROVIDED));
        deflexical("*REGEX-SPECIAL-CHARS*", $str_alt28$_________);
        return NIL;
    }

    public static SubLObject init_regular_expression_utilities_file() {
        if (SubLFiles.USE_V1) {
            defconstant("*REGULAR-EXPRESSION-META-CHARACTERS*", $str0$__________);
            defvar("*BACKREFERENCE-PATTERNS*", make_vector(TEN_INTEGER, UNPROVIDED));
            deflexical("*REGEX-SPECIAL-CHARS*", $str29$_________);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*REGEX-SPECIAL-CHARS*", $str_alt28$_________);
        }
        return NIL;
    }

    public static SubLObject init_regular_expression_utilities_file_Previous() {
        defconstant("*REGULAR-EXPRESSION-META-CHARACTERS*", $str0$__________);
        defvar("*BACKREFERENCE-PATTERNS*", make_vector(TEN_INTEGER, UNPROVIDED));
        deflexical("*REGEX-SPECIAL-CHARS*", $str29$_________);
        return NIL;
    }

    static private final SubLString $str_alt30$__A_ = makeString("[~A]");

    static private final SubLList $list_alt32 = list(list(list(makeString("[a-z]+"), vector(new SubLObject[]{ makeString("UPPER"), makeString("lower"), makeString("CASING"), makeString("matters") })), list(list(ONE_INTEGER, makeString("lower"), list(cons(ZERO_INTEGER, FIVE_INTEGER))), list(THREE_INTEGER, makeString("matters"), list(cons(ZERO_INTEGER, SEVEN_INTEGER))))), list(list(makeString("[0-9]+"), vector(new SubLObject[]{ makeString("Call"), makeString("me"), makeString("after"), makeString("9"), makeString("on"), makeString("my"), makeString("cell"), makeString("--"), makeString("342-4099") })), list(list(THREE_INTEGER, makeString("9"), list(cons(ZERO_INTEGER, ONE_INTEGER))), list(EIGHT_INTEGER, makeString("342-4099"), list(cons(ZERO_INTEGER, THREE_INTEGER), cons(FOUR_INTEGER, EIGHT_INTEGER))))), list(list(makeString("[0-9.]+"), vector(new SubLObject[]{ makeString("The"), makeString("IP"), makeString("address"), makeString("of"), makeString("my"), makeString("machine"), makeString("is"), makeString("127.0.0.1") })), list(list(SEVEN_INTEGER, makeString("127.0.0.1"), list(cons(ZERO_INTEGER, NINE_INTEGER))))), list(list(makeString("[0-9a-z.]+@[0-9a-z.]+"), vector(new SubLObject[]{ makeString("You"), makeString("can"), makeString("email"), makeString("me"), makeString("at"), makeString("poohbear@hundredacrewoods.org,"), makeString("if"), makeString("you"), makeString("want.") })), list(list(FIVE_INTEGER, makeString("poohbear@hundredacrewoods.org,"), list(cons(ZERO_INTEGER, makeInteger(29)))))));

    public static final SubLObject setup_regular_expression_utilities_file_alt() {
        define_test_case_table_int(FIND_ALL_MATCHES_FOR_REGULAR_EXPRESSION, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt14);
        define_test_case_table_int(REGEXP_CAPTURING_MATCH, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt18);
        define_test_case_table_int(VECTOR_GREP, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt32);
        define_test_case_table_int(LIST_GREP, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt34);
        return NIL;
    }

    public static SubLObject setup_regular_expression_utilities_file() {
        if (SubLFiles.USE_V1) {
            define_test_case_table_int(FIND_ALL_MATCHES_FOR_REGULAR_EXPRESSION, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list13);
            define_test_case_table_int(FIND_ALL_CAPTURED_MATCHES_WITHIN_STRING_FROM_STRING, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list17);
            define_test_case_table_int(REGEXP_CAPTURING_MATCH, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list19);
            define_test_case_table_int(VECTOR_GREP, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list33);
            define_test_case_table_int(LIST_GREP, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list35);
        }
        if (SubLFiles.USE_V2) {
            define_test_case_table_int(FIND_ALL_MATCHES_FOR_REGULAR_EXPRESSION, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt14);
            define_test_case_table_int(REGEXP_CAPTURING_MATCH, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt18);
            define_test_case_table_int(VECTOR_GREP, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt32);
            define_test_case_table_int(LIST_GREP, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt34);
        }
        return NIL;
    }

    public static SubLObject setup_regular_expression_utilities_file_Previous() {
        define_test_case_table_int(FIND_ALL_MATCHES_FOR_REGULAR_EXPRESSION, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list13);
        define_test_case_table_int(FIND_ALL_CAPTURED_MATCHES_WITHIN_STRING_FROM_STRING, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list17);
        define_test_case_table_int(REGEXP_CAPTURING_MATCH, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list19);
        define_test_case_table_int(VECTOR_GREP, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list33);
        define_test_case_table_int(LIST_GREP, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list35);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_regular_expression_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_regular_expression_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_regular_expression_utilities_file();
    }

    static {
    }

    static private final SubLList $list_alt34 = list(list(list(makeString("[a-z]+"), list(makeString("UPPER"), makeString("lower"), makeString("CASING"), makeString("matters"))), list(list(ONE_INTEGER, makeString("lower"), list(cons(ZERO_INTEGER, FIVE_INTEGER))), list(THREE_INTEGER, makeString("matters"), list(cons(ZERO_INTEGER, SEVEN_INTEGER))))), list(list(makeString("[0-9]+"), list(new SubLObject[]{ makeString("Call"), makeString("me"), makeString("after"), makeString("9"), makeString("on"), makeString("my"), makeString("cell"), makeString("--"), makeString("342-4099") })), list(list(THREE_INTEGER, makeString("9"), list(cons(ZERO_INTEGER, ONE_INTEGER))), list(EIGHT_INTEGER, makeString("342-4099"), list(cons(ZERO_INTEGER, THREE_INTEGER), cons(FOUR_INTEGER, EIGHT_INTEGER))))), list(list(makeString("[0-9.]+"), list(makeString("The"), makeString("IP"), makeString("address"), makeString("of"), makeString("my"), makeString("machine"), makeString("is"), makeString("127.0.0.1"))), list(list(SEVEN_INTEGER, makeString("127.0.0.1"), list(cons(ZERO_INTEGER, NINE_INTEGER))))), list(list(makeString("[0-9a-z.]+@[0-9a-z.]+"), list(new SubLObject[]{ makeString("You"), makeString("can"), makeString("email"), makeString("me"), makeString("at"), makeString("poohbear@hundredacrewoods.org,"), makeString("if"), makeString("you"), makeString("want.") })), list(list(FIVE_INTEGER, makeString("poohbear@hundredacrewoods.org,"), list(cons(ZERO_INTEGER, makeInteger(29)))))));
}

/**
 * Total time: 324 ms
 */
