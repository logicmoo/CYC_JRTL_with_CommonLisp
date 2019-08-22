/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.logior;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.fixnump;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.keywordp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Regex;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REGULAR-EXPRESSIONS
 * source file: /cyc/top/cycl/regular-expressions.lisp
 * created:     2019/07/03 17:37:10
 */
public final class regular_expressions extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new regular_expressions();

 public static final String myName = "com.cyc.cycjava.cycl.regular_expressions";


    // deflexical
    // Definitions
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $regex_compopt_anchored$ = makeSymbol("*REGEX-COMPOPT-ANCHORED*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $regex_compopt_caseless$ = makeSymbol("*REGEX-COMPOPT-CASELESS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $regex_compopt_dollar_endonly$ = makeSymbol("*REGEX-COMPOPT-DOLLAR-ENDONLY*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $regex_compopt_dotall$ = makeSymbol("*REGEX-COMPOPT-DOTALL*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $regex_compopt_extended$ = makeSymbol("*REGEX-COMPOPT-EXTENDED*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $regex_compopt_multiline$ = makeSymbol("*REGEX-COMPOPT-MULTILINE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $regex_compopt_extra$ = makeSymbol("*REGEX-COMPOPT-EXTRA*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $regex_compopt_ungreedy$ = makeSymbol("*REGEX-COMPOPT-UNGREEDY*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $regex_compopt_utf8$ = makeSymbol("*REGEX-COMPOPT-UTF8*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $regex_compopt_no_auto_capture$ = makeSymbol("*REGEX-COMPOPT-NO-AUTO-CAPTURE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $regex_compopt_no_utf8_check$ = makeSymbol("*REGEX-COMPOPT-NO-UTF8-CHECK*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $regex_compopt_to_values_map$ = makeSymbol("*REGEX-COMPOPT-TO-VALUES-MAP*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $regex_matchopt_anchored$ = makeSymbol("*REGEX-MATCHOPT-ANCHORED*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $regex_matchopt_notbol$ = makeSymbol("*REGEX-MATCHOPT-NOTBOL*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $regex_matchopt_noteol$ = makeSymbol("*REGEX-MATCHOPT-NOTEOL*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $regex_matchopt_notempty$ = makeSymbol("*REGEX-MATCHOPT-NOTEMPTY*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $regex_matchopt_to_values_map$ = makeSymbol("*REGEX-MATCHOPT-TO-VALUES-MAP*");

    private static final SubLInteger $int$2048 = makeInteger(2048);

    private static final SubLInteger $int$8192 = makeInteger(8192);

    private static final SubLSymbol $NO_AUTO_CAPTURE = makeKeyword("NO-AUTO-CAPTURE");

    static private final SubLString $str19$Invalid_compile_option__S__only_o = makeString("Invalid compile option ~S: only one of ~S permitted.~%");

    private static final SubLInteger $int$128 = makeInteger(128);

    private static final SubLInteger $int$1024 = makeInteger(1024);

    static private final SubLString $str27$Invalid_match_option__S__only_one = makeString("Invalid match option ~S: only one of ~S permitted.~%");

    private static final SubLSymbol REGEX_P = makeSymbol("REGEX-P");

    static private final SubLString $str29$_a_at_offset__a_while_compiling_r = makeString("~a at offset ~a while compiling regex /~a/");

    static private final SubLList $list33 = cons(makeSymbol("MATCH-START"), makeSymbol("MATCH-END"));

    static private final SubLList $list34 = list(list(makeSymbol("PATTERN"), makeSymbol("REGULAR-EXPRESSION"), makeSymbol("&KEY"), makeSymbol("COMPILE-OPTIONS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list35 = list(makeKeyword("COMPILE-OPTIONS"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    static private final SubLSymbol $sym38$ERROR_CODE = makeUninternedSymbol("ERROR-CODE");

    static private final SubLSymbol $sym39$ERROR_OFFSET = makeUninternedSymbol("ERROR-OFFSET");

    static private final SubLSymbol $sym40$ERROR_MSG = makeUninternedSymbol("ERROR-MSG");

    private static final SubLSymbol COMPILE_REGULAR_EXPRESSION = makeSymbol("COMPILE-REGULAR-EXPRESSION");

    static private final SubLString $str47$Error__A___A__compiling_regular_e = makeString("Error ~A (~A) compiling regular expression ~S at offset ~A.");

    private static final SubLSymbol DISCARD_REGULAR_EXPRESSION_PATTERN = makeSymbol("DISCARD-REGULAR-EXPRESSION-PATTERN");

    public static final SubLObject enumerate_regex_compile_options_alt() {
        return Mapping.mapcar(FIRST, $regex_compopt_to_values_map$.getGlobalValue());
    }

    public static SubLObject enumerate_regex_compile_options() {
        return Mapping.mapcar(FIRST, $regex_compopt_to_values_map$.getGlobalValue());
    }

    public static final SubLObject map_regex_compile_option_to_value_alt(SubLObject option) {
        SubLTrampolineFile.checkType(option, KEYWORDP);
        {
            SubLObject value = second(assoc(option, $regex_compopt_to_values_map$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
            if (!value.isFixnum()) {
                Errors.error($str_alt19$Invalid_compile_option__S__only_o, option, com.cyc.cycjava.cycl.regular_expressions.enumerate_regex_compile_options());
            }
            return value;
        }
    }

    public static SubLObject map_regex_compile_option_to_value(final SubLObject option) {
        assert NIL != keywordp(option) : "! keywordp(option) " + ("Types.keywordp(option) " + "CommonSymbols.NIL != Types.keywordp(option) ") + option;
        final SubLObject value = second(assoc(option, $regex_compopt_to_values_map$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
        if (!value.isFixnum()) {
            Errors.error($str19$Invalid_compile_option__S__only_o, option, enumerate_regex_compile_options());
        }
        return value;
    }

    public static final SubLObject convert_regex_compile_options_to_value_alt(SubLObject options) {
        SubLTrampolineFile.checkType(options, LISTP);
        {
            SubLObject result = ZERO_INTEGER;
            SubLObject cdolist_list_var = options;
            SubLObject option = NIL;
            for (option = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , option = cdolist_list_var.first()) {
                {
                    SubLObject value = com.cyc.cycjava.cycl.regular_expressions.map_regex_compile_option_to_value(option);
                    result = logior(result, value);
                }
            }
            return result;
        }
    }

    public static SubLObject convert_regex_compile_options_to_value(final SubLObject options) {
        assert NIL != listp(options) : "! listp(options) " + ("Types.listp(options) " + "CommonSymbols.NIL != Types.listp(options) ") + options;
        SubLObject result = ZERO_INTEGER;
        SubLObject cdolist_list_var = options;
        SubLObject option = NIL;
        option = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject value = map_regex_compile_option_to_value(option);
            result = logior(result, value);
            cdolist_list_var = cdolist_list_var.rest();
            option = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject enumerate_regex_match_options_alt() {
        return Mapping.mapcar(FIRST, $regex_matchopt_to_values_map$.getGlobalValue());
    }

    public static SubLObject enumerate_regex_match_options() {
        return Mapping.mapcar(FIRST, $regex_matchopt_to_values_map$.getGlobalValue());
    }

    public static final SubLObject map_regex_match_option_to_value_alt(SubLObject option) {
        SubLTrampolineFile.checkType(option, KEYWORDP);
        {
            SubLObject value = second(assoc(option, $regex_matchopt_to_values_map$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
            if (!value.isFixnum()) {
                Errors.error($str_alt27$Invalid_match_option__S__only_one, option, com.cyc.cycjava.cycl.regular_expressions.enumerate_regex_match_options());
            }
            return value;
        }
    }

    public static SubLObject map_regex_match_option_to_value(final SubLObject option) {
        assert NIL != keywordp(option) : "! keywordp(option) " + ("Types.keywordp(option) " + "CommonSymbols.NIL != Types.keywordp(option) ") + option;
        final SubLObject value = second(assoc(option, $regex_matchopt_to_values_map$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
        if (!value.isFixnum()) {
            Errors.error($str27$Invalid_match_option__S__only_one, option, enumerate_regex_match_options());
        }
        return value;
    }

    public static final SubLObject convert_regex_match_options_to_value_alt(SubLObject options) {
        SubLTrampolineFile.checkType(options, LISTP);
        {
            SubLObject result = ZERO_INTEGER;
            SubLObject cdolist_list_var = options;
            SubLObject option = NIL;
            for (option = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , option = cdolist_list_var.first()) {
                {
                    SubLObject value = com.cyc.cycjava.cycl.regular_expressions.map_regex_match_option_to_value(option);
                    result = logior(result, value);
                }
            }
            return result;
        }
    }

    public static SubLObject convert_regex_match_options_to_value(final SubLObject options) {
        assert NIL != listp(options) : "! listp(options) " + ("Types.listp(options) " + "CommonSymbols.NIL != Types.listp(options) ") + options;
        SubLObject result = ZERO_INTEGER;
        SubLObject cdolist_list_var = options;
        SubLObject option = NIL;
        option = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject value = map_regex_match_option_to_value(option);
            result = logior(result, value);
            cdolist_list_var = cdolist_list_var.rest();
            option = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject regex_p_alt(SubLObject expression) {
        return stringp(expression);
    }

    public static SubLObject regex_p(final SubLObject expression) {
        return stringp(expression);
    }

    public static final SubLObject is_regular_expressions_support_availableP_alt() {
        return Regex.is_regex_implementation_availableP();
    }

    public static SubLObject is_regular_expressions_support_availableP() {
        return Regex.is_regex_implementation_availableP();
    }

    public static final SubLObject compile_regular_expression_alt(SubLObject expression, SubLObject options) {
        if (options == UNPROVIDED) {
            options = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(expression, REGEX_P);
            SubLTrampolineFile.checkType(options, LISTP);
            {
                SubLObject option_value = com.cyc.cycjava.cycl.regular_expressions.convert_regex_compile_options_to_value(options);
                thread.resetMultipleValues();
                {
                    SubLObject pattern = Regex.compile_regular_expression_impl(expression, option_value);
                    SubLObject error_offset = thread.secondMultipleValue();
                    SubLObject error_msg = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    return values(pattern, ZERO_INTEGER, error_offset, error_msg);
                }
            }
        }
    }

    public static SubLObject compile_regular_expression(final SubLObject expression, SubLObject options) {
        if (options == UNPROVIDED) {
            options = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != regex_p(expression) : "! regular_expressions.regex_p(expression) " + ("regular_expressions.regex_p(expression) " + "CommonSymbols.NIL != regular_expressions.regex_p(expression) ") + expression;
        assert NIL != listp(options) : "! listp(options) " + ("Types.listp(options) " + "CommonSymbols.NIL != Types.listp(options) ") + options;
        final SubLObject option_value = convert_regex_compile_options_to_value(options);
        thread.resetMultipleValues();
        final SubLObject pattern = Regex.compile_regular_expression_impl(expression, option_value);
        final SubLObject error_offset = thread.secondMultipleValue();
        final SubLObject error_msg = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return values(pattern, ZERO_INTEGER, error_offset, error_msg);
    }

    public static final SubLObject compile_regular_expression_raise_error_alt(SubLObject regex, SubLObject options) {
        if (options == UNPROVIDED) {
            options = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject pattern = com.cyc.cycjava.cycl.regular_expressions.compile_regular_expression(regex, options);
                SubLObject v_int = thread.secondMultipleValue();
                SubLObject error_offset = thread.thirdMultipleValue();
                SubLObject error_msg = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                if (NIL == pattern) {
                    Errors.error($str_alt29$_a_at_offset__a_while_compiling_r, error_msg, error_offset, regex);
                }
                return pattern;
            }
        }
    }

    public static SubLObject compile_regular_expression_raise_error(final SubLObject regex, SubLObject options) {
        if (options == UNPROVIDED) {
            options = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject pattern = compile_regular_expression(regex, options);
        final SubLObject v_int = thread.secondMultipleValue();
        final SubLObject error_offset = thread.thirdMultipleValue();
        final SubLObject error_msg = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (NIL == pattern) {
            Errors.error($str29$_a_at_offset__a_while_compiling_r, error_msg, error_offset, regex);
        }
        return pattern;
    }

    public static final SubLObject regex_pattern_p_alt(SubLObject pattern) {
        return Regex.regex_pattern_p_impl(pattern);
    }

    public static SubLObject regex_pattern_p(final SubLObject pattern) {
        return Regex.regex_pattern_p_impl(pattern);
    }

    public static final SubLObject regular_expression_p_alt(SubLObject v_object) {
        return stringp(v_object);
    }

    public static SubLObject regular_expression_p(final SubLObject v_object) {
        return stringp(v_object);
    }

    public static final SubLObject match_regular_expression_pattern_offsets_alt(SubLObject pattern, SubLObject string, SubLObject matches, SubLObject options, SubLObject start, SubLObject end) {
        if (options == UNPROVIDED) {
            options = NIL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        SubLTrampolineFile.checkType(pattern, REGEX_PATTERN_P);
        SubLTrampolineFile.checkType(string, STRINGP);
        SubLTrampolineFile.checkType(matches, FIXNUMP);
        SubLTrampolineFile.checkType(options, LISTP);
        SubLTrampolineFile.checkType(start, FIXNUMP);
        if (NIL == end) {
            end = length(string);
        }
        SubLTrampolineFile.checkType(end, FIXNUMP);
        {
            SubLObject option_value = com.cyc.cycjava.cycl.regular_expressions.convert_regex_match_options_to_value(options);
            return Regex.match_regular_expression_pattern_offsets_impl(pattern, string, matches, option_value, start, end);
        }
    }

    public static SubLObject match_regular_expression_pattern_offsets(final SubLObject pattern, final SubLObject string, final SubLObject matches, SubLObject options, SubLObject start, SubLObject end) {
        if (options == UNPROVIDED) {
            options = NIL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        assert NIL != regex_pattern_p(pattern) : "! regular_expressions.regex_pattern_p(pattern) " + ("regular_expressions.regex_pattern_p(pattern) " + "CommonSymbols.NIL != regular_expressions.regex_pattern_p(pattern) ") + pattern;
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        assert NIL != fixnump(matches) : "! fixnump(matches) " + ("Types.fixnump(matches) " + "CommonSymbols.NIL != Types.fixnump(matches) ") + matches;
        assert NIL != listp(options) : "! listp(options) " + ("Types.listp(options) " + "CommonSymbols.NIL != Types.listp(options) ") + options;
        assert NIL != fixnump(start) : "! fixnump(start) " + ("Types.fixnump(start) " + "CommonSymbols.NIL != Types.fixnump(start) ") + start;
        if (NIL == end) {
            end = length(string);
        }
        assert NIL != fixnump(end) : "! fixnump(end) " + ("Types.fixnump(end) " + "CommonSymbols.NIL != Types.fixnump(end) ") + end;
        final SubLObject option_value = convert_regex_match_options_to_value(options);
        return Regex.match_regular_expression_pattern_offsets_impl(pattern, string, matches, option_value, start, end);
    }

    public static final SubLObject match_regular_expression_pattern_alt(SubLObject pattern, SubLObject string, SubLObject matches, SubLObject options, SubLObject start, SubLObject end) {
        if (options == UNPROVIDED) {
            options = NIL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        {
            SubLObject offsets = com.cyc.cycjava.cycl.regular_expressions.match_regular_expression_pattern_offsets(pattern, string, matches, options, start, end);
            SubLObject strings = NIL;
            SubLObject cdolist_list_var = offsets;
            SubLObject offset = NIL;
            for (offset = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , offset = cdolist_list_var.first()) {
                {
                    SubLObject datum = offset;
                    SubLObject current = datum;
                    SubLObject match_start = NIL;
                    SubLObject match_end = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt33);
                    match_start = current.first();
                    current = current.rest();
                    match_end = current;
                    if (match_start.numGE(ZERO_INTEGER) && match_end.numGE(ZERO_INTEGER)) {
                        {
                            SubLObject match = subseq(string, match_start, match_end);
                            strings = cons(match, strings);
                        }
                    }
                }
            }
            return nreverse(strings);
        }
    }

    public static SubLObject match_regular_expression_pattern(final SubLObject pattern, final SubLObject string, final SubLObject matches, SubLObject options, SubLObject start, SubLObject end) {
        if (options == UNPROVIDED) {
            options = NIL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        final SubLObject offsets = match_regular_expression_pattern_offsets(pattern, string, matches, options, start, end);
        SubLObject strings = NIL;
        SubLObject cdolist_list_var = offsets;
        SubLObject offset = NIL;
        offset = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = offset;
            SubLObject match_start = NIL;
            SubLObject match_end = NIL;
            destructuring_bind_must_consp(current, datum, $list33);
            match_start = current.first();
            current = match_end = current.rest();
            if (match_start.numGE(ZERO_INTEGER) && match_end.numGE(ZERO_INTEGER)) {
                final SubLObject match = subseq(string, match_start, match_end);
                strings = cons(match, strings);
            }
            cdolist_list_var = cdolist_list_var.rest();
            offset = cdolist_list_var.first();
        } 
        return nreverse(strings);
    }

    public static final SubLObject discard_regular_expression_pattern_alt(SubLObject pattern) {
        SubLTrampolineFile.checkType(pattern, REGEX_PATTERN_P);
        Regex.discard_regular_expression_pattern_impl(pattern);
        return NIL;
    }

    public static SubLObject discard_regular_expression_pattern(final SubLObject pattern) {
        assert NIL != regex_pattern_p(pattern) : "! regular_expressions.regex_pattern_p(pattern) " + ("regular_expressions.regex_pattern_p(pattern) " + "CommonSymbols.NIL != regular_expressions.regex_pattern_p(pattern) ") + pattern;
        Regex.discard_regular_expression_pattern_impl(pattern);
        return NIL;
    }

    public static final SubLObject with_regular_expression_pattern_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt34);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject pattern = NIL;
                    SubLObject regular_expression = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt34);
                    pattern = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt34);
                    regular_expression = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt34);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt34);
                            if (NIL == member(current_1, $list_alt35, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt34);
                        }
                        {
                            SubLObject compile_options_tail = property_list_member($COMPILE_OPTIONS, current);
                            SubLObject compile_options = (NIL != compile_options_tail) ? ((SubLObject) (cadr(compile_options_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject error_code = $sym38$ERROR_CODE;
                                SubLObject error_offset = $sym39$ERROR_OFFSET;
                                SubLObject error_msg = $sym40$ERROR_MSG;
                                return list(CMULTIPLE_VALUE_BIND, list(pattern, error_code, error_offset, error_msg), list(COMPILE_REGULAR_EXPRESSION, regular_expression, compile_options), list(CUNWIND_PROTECT, list(PROGN, list(PUNLESS, list(REGEX_PATTERN_P, pattern), list(ERROR, $str_alt47$Error__A___A__compiling_regular_e, error_code, error_msg, regular_expression, error_offset)), bq_cons(PROGN, append(body, NIL))), list(PWHEN, list(REGEX_PATTERN_P, pattern), list(DISCARD_REGULAR_EXPRESSION_PATTERN, pattern))));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject with_regular_expression_pattern(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list34);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject pattern = NIL;
        SubLObject regular_expression = NIL;
        destructuring_bind_must_consp(current, datum, $list34);
        pattern = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list34);
        regular_expression = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list34);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list34);
            if (NIL == member(current_$1, $list35, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list34);
        }
        final SubLObject compile_options_tail = property_list_member($COMPILE_OPTIONS, current);
        final SubLObject compile_options = (NIL != compile_options_tail) ? cadr(compile_options_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject error_code = $sym38$ERROR_CODE;
        final SubLObject error_offset = $sym39$ERROR_OFFSET;
        final SubLObject error_msg = $sym40$ERROR_MSG;
        return list(CMULTIPLE_VALUE_BIND, list(pattern, error_code, error_offset, error_msg), list(COMPILE_REGULAR_EXPRESSION, regular_expression, compile_options), list(CUNWIND_PROTECT, list(PROGN, list(PUNLESS, list(REGEX_PATTERN_P, pattern), list(ERROR, $str47$Error__A___A__compiling_regular_e, error_code, error_msg, regular_expression, error_offset)), bq_cons(PROGN, append(body, NIL))), list(PWHEN, list(REGEX_PATTERN_P, pattern), list(DISCARD_REGULAR_EXPRESSION_PATTERN, pattern))));
    }

    public static SubLObject declare_regular_expressions_file() {
        declareFunction("enumerate_regex_compile_options", "ENUMERATE-REGEX-COMPILE-OPTIONS", 0, 0, false);
        declareFunction("map_regex_compile_option_to_value", "MAP-REGEX-COMPILE-OPTION-TO-VALUE", 1, 0, false);
        declareFunction("convert_regex_compile_options_to_value", "CONVERT-REGEX-COMPILE-OPTIONS-TO-VALUE", 1, 0, false);
        declareFunction("enumerate_regex_match_options", "ENUMERATE-REGEX-MATCH-OPTIONS", 0, 0, false);
        declareFunction("map_regex_match_option_to_value", "MAP-REGEX-MATCH-OPTION-TO-VALUE", 1, 0, false);
        declareFunction("convert_regex_match_options_to_value", "CONVERT-REGEX-MATCH-OPTIONS-TO-VALUE", 1, 0, false);
        declareFunction("regex_p", "REGEX-P", 1, 0, false);
        declareFunction("is_regular_expressions_support_availableP", "IS-REGULAR-EXPRESSIONS-SUPPORT-AVAILABLE?", 0, 0, false);
        declareFunction("compile_regular_expression", "COMPILE-REGULAR-EXPRESSION", 1, 1, false);
        declareFunction("compile_regular_expression_raise_error", "COMPILE-REGULAR-EXPRESSION-RAISE-ERROR", 1, 1, false);
        declareFunction("regex_pattern_p", "REGEX-PATTERN-P", 1, 0, false);
        declareFunction("regular_expression_p", "REGULAR-EXPRESSION-P", 1, 0, false);
        declareFunction("match_regular_expression_pattern_offsets", "MATCH-REGULAR-EXPRESSION-PATTERN-OFFSETS", 3, 3, false);
        declareFunction("match_regular_expression_pattern", "MATCH-REGULAR-EXPRESSION-PATTERN", 3, 3, false);
        declareFunction("discard_regular_expression_pattern", "DISCARD-REGULAR-EXPRESSION-PATTERN", 1, 0, false);
        declareMacro("with_regular_expression_pattern", "WITH-REGULAR-EXPRESSION-PATTERN");
        return NIL;
    }

    public static SubLObject init_regular_expressions_file() {
        deflexical("*REGEX-COMPOPT-ANCHORED*", SIXTEEN_INTEGER);
        deflexical("*REGEX-COMPOPT-CASELESS*", ONE_INTEGER);
        deflexical("*REGEX-COMPOPT-DOLLAR-ENDONLY*", $int$32);
        deflexical("*REGEX-COMPOPT-DOTALL*", FOUR_INTEGER);
        deflexical("*REGEX-COMPOPT-EXTENDED*", EIGHT_INTEGER);
        deflexical("*REGEX-COMPOPT-MULTILINE*", TWO_INTEGER);
        deflexical("*REGEX-COMPOPT-EXTRA*", $int$64);
        deflexical("*REGEX-COMPOPT-UNGREEDY*", $int$512);
        deflexical("*REGEX-COMPOPT-UTF8*", $int$2048);
        deflexical("*REGEX-COMPOPT-NO-AUTO-CAPTURE*", $int$4096);
        deflexical("*REGEX-COMPOPT-NO-UTF8-CHECK*", $int$8192);
        deflexical("*REGEX-COMPOPT-TO-VALUES-MAP*", list(new SubLObject[]{ list($ANCHORED, $regex_compopt_anchored$.getGlobalValue()), list($CASELESS, $regex_compopt_caseless$.getGlobalValue()), list($DOLLAR_ENDONLY, $regex_compopt_dollar_endonly$.getGlobalValue()), list($DOTALL, $regex_compopt_dotall$.getGlobalValue()), list($EXTENDED, $regex_compopt_extended$.getGlobalValue()), list($MULTILINE, $regex_compopt_multiline$.getGlobalValue()), list($UNGREEDY, $regex_compopt_ungreedy$.getGlobalValue()), list($EXTRA, $regex_compopt_extra$.getGlobalValue()), list($UTF8, $regex_compopt_utf8$.getGlobalValue()), list($NO_AUTO_CAPTURE, $regex_compopt_no_auto_capture$.getGlobalValue()), list($NO_UTF8_CHECK, $regex_compopt_no_utf8_check$.getGlobalValue()) }));
        deflexical("*REGEX-MATCHOPT-ANCHORED*", SIXTEEN_INTEGER);
        deflexical("*REGEX-MATCHOPT-NOTBOL*", $int$128);
        deflexical("*REGEX-MATCHOPT-NOTEOL*", $int$256);
        deflexical("*REGEX-MATCHOPT-NOTEMPTY*", $int$1024);
        deflexical("*REGEX-MATCHOPT-TO-VALUES-MAP*", list(list($ANCHORED, $regex_matchopt_anchored$.getGlobalValue()), list($NOT_BOL, $regex_matchopt_notbol$.getGlobalValue()), list($NOT_EOL, $regex_matchopt_noteol$.getGlobalValue()), list($NOT_EMPTY, $regex_matchopt_notempty$.getGlobalValue())));
        return NIL;
    }

    static private final SubLString $str_alt19$Invalid_compile_option__S__only_o = makeString("Invalid compile option ~S: only one of ~S permitted.~%");

    static private final SubLString $str_alt27$Invalid_match_option__S__only_one = makeString("Invalid match option ~S: only one of ~S permitted.~%");

    static private final SubLString $str_alt29$_a_at_offset__a_while_compiling_r = makeString("~a at offset ~a while compiling regex /~a/");

    static private final SubLList $list_alt33 = cons(makeSymbol("MATCH-START"), makeSymbol("MATCH-END"));

    static private final SubLList $list_alt34 = list(list(makeSymbol("PATTERN"), makeSymbol("REGULAR-EXPRESSION"), makeSymbol("&KEY"), makeSymbol("COMPILE-OPTIONS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static SubLObject setup_regular_expressions_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_regular_expressions_file();
    }

    static private final SubLList $list_alt35 = list(makeKeyword("COMPILE-OPTIONS"));

    @Override
    public void initializeVariables() {
        init_regular_expressions_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_regular_expressions_file();
    }

    

    static private final SubLString $str_alt47$Error__A___A__compiling_regular_e = makeString("Error ~A (~A) compiling regular expression ~S at offset ~A.");
}

/**
 * Total time: 126 ms
 */
