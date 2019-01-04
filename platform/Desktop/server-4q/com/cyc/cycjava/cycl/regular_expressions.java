package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Regex;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class regular_expressions extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.regular_expressions";
    public static final String myFingerPrint = "a575562705ede9747c5314ed2ac23c36385cc8de6f68224abf23ad6a44dd03aa";
    @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 1536L)
    private static SubLSymbol $regex_compopt_anchored$;
    @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 4880L)
    private static SubLSymbol $regex_compopt_caseless$;
    @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 4940L)
    private static SubLSymbol $regex_compopt_dollar_endonly$;
    @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 5000L)
    private static SubLSymbol $regex_compopt_dotall$;
    @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 5060L)
    private static SubLSymbol $regex_compopt_extended$;
    @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 5120L)
    private static SubLSymbol $regex_compopt_multiline$;
    @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 5180L)
    private static SubLSymbol $regex_compopt_extra$;
    @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 5240L)
    private static SubLSymbol $regex_compopt_ungreedy$;
    @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 5300L)
    private static SubLSymbol $regex_compopt_utf8$;
    @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 5360L)
    private static SubLSymbol $regex_compopt_no_auto_capture$;
    @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 5420L)
    private static SubLSymbol $regex_compopt_no_utf8_check$;
    @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 5480L)
    private static SubLSymbol $regex_compopt_to_values_map$;
    @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 6776L)
    private static SubLSymbol $regex_matchopt_anchored$;
    @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 8657L)
    private static SubLSymbol $regex_matchopt_notbol$;
    @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 8712L)
    private static SubLSymbol $regex_matchopt_noteol$;
    @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 8767L)
    private static SubLSymbol $regex_matchopt_notempty$;
    @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 8822L)
    private static SubLSymbol $regex_matchopt_to_values_map$;
    private static final SubLInteger $int0$32;
    private static final SubLInteger $int1$64;
    private static final SubLInteger $int2$512;
    private static final SubLInteger $int3$2048;
    private static final SubLInteger $int4$4096;
    private static final SubLInteger $int5$8192;
    private static final SubLSymbol $kw6$ANCHORED;
    private static final SubLSymbol $kw7$CASELESS;
    private static final SubLSymbol $kw8$DOLLAR_ENDONLY;
    private static final SubLSymbol $kw9$DOTALL;
    private static final SubLSymbol $kw10$EXTENDED;
    private static final SubLSymbol $kw11$MULTILINE;
    private static final SubLSymbol $kw12$UNGREEDY;
    private static final SubLSymbol $kw13$EXTRA;
    private static final SubLSymbol $kw14$UTF8;
    private static final SubLSymbol $kw15$NO_AUTO_CAPTURE;
    private static final SubLSymbol $kw16$NO_UTF8_CHECK;
    private static final SubLSymbol $sym17$FIRST;
    private static final SubLSymbol $sym18$KEYWORDP;
    private static final SubLString $str19$Invalid_compile_option__S__only_o;
    private static final SubLSymbol $sym20$LISTP;
    private static final SubLInteger $int21$128;
    private static final SubLInteger $int22$256;
    private static final SubLInteger $int23$1024;
    private static final SubLSymbol $kw24$NOT_BOL;
    private static final SubLSymbol $kw25$NOT_EOL;
    private static final SubLSymbol $kw26$NOT_EMPTY;
    private static final SubLString $str27$Invalid_match_option__S__only_one;
    private static final SubLSymbol $sym28$REGEX_P;
    private static final SubLString $str29$_a_at_offset__a_while_compiling_r;
    private static final SubLSymbol $sym30$REGEX_PATTERN_P;
    private static final SubLSymbol $sym31$STRINGP;
    private static final SubLSymbol $sym32$FIXNUMP;
    private static final SubLList $list33;
    private static final SubLList $list34;
    private static final SubLList $list35;
    private static final SubLSymbol $kw36$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw37$COMPILE_OPTIONS;
    private static final SubLSymbol $sym38$ERROR_CODE;
    private static final SubLSymbol $sym39$ERROR_OFFSET;
    private static final SubLSymbol $sym40$ERROR_MSG;
    private static final SubLSymbol $sym41$CMULTIPLE_VALUE_BIND;
    private static final SubLSymbol $sym42$COMPILE_REGULAR_EXPRESSION;
    private static final SubLSymbol $sym43$CUNWIND_PROTECT;
    private static final SubLSymbol $sym44$PROGN;
    private static final SubLSymbol $sym45$PUNLESS;
    private static final SubLSymbol $sym46$ERROR;
    private static final SubLString $str47$Error__A___A__compiling_regular_e;
    private static final SubLSymbol $sym48$PWHEN;
    private static final SubLSymbol $sym49$DISCARD_REGULAR_EXPRESSION_PATTERN;
    
    @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 6051L)
    public static SubLObject enumerate_regex_compile_options() {
        return Mapping.mapcar((SubLObject)regular_expressions.$sym17$FIRST, regular_expressions.$regex_compopt_to_values_map$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 6160L)
    public static SubLObject map_regex_compile_option_to_value(final SubLObject option) {
        assert regular_expressions.NIL != Types.keywordp(option) : option;
        final SubLObject value = conses_high.second(conses_high.assoc(option, regular_expressions.$regex_compopt_to_values_map$.getGlobalValue(), (SubLObject)regular_expressions.UNPROVIDED, (SubLObject)regular_expressions.UNPROVIDED));
        if (!value.isFixnum()) {
            Errors.error((SubLObject)regular_expressions.$str19$Invalid_compile_option__S__only_o, option, enumerate_regex_compile_options());
        }
        return value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 6498L)
    public static SubLObject convert_regex_compile_options_to_value(final SubLObject options) {
        assert regular_expressions.NIL != Types.listp(options) : options;
        SubLObject result = (SubLObject)regular_expressions.ZERO_INTEGER;
        SubLObject cdolist_list_var = options;
        SubLObject option = (SubLObject)regular_expressions.NIL;
        option = cdolist_list_var.first();
        while (regular_expressions.NIL != cdolist_list_var) {
            final SubLObject value = map_regex_compile_option_to_value(option);
            result = Numbers.logior(result, value);
            cdolist_list_var = cdolist_list_var.rest();
            option = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 9058L)
    public static SubLObject enumerate_regex_match_options() {
        return Mapping.mapcar((SubLObject)regular_expressions.$sym17$FIRST, regular_expressions.$regex_matchopt_to_values_map$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 9165L)
    public static SubLObject map_regex_match_option_to_value(final SubLObject option) {
        assert regular_expressions.NIL != Types.keywordp(option) : option;
        final SubLObject value = conses_high.second(conses_high.assoc(option, regular_expressions.$regex_matchopt_to_values_map$.getGlobalValue(), (SubLObject)regular_expressions.UNPROVIDED, (SubLObject)regular_expressions.UNPROVIDED));
        if (!value.isFixnum()) {
            Errors.error((SubLObject)regular_expressions.$str27$Invalid_match_option__S__only_one, option, enumerate_regex_match_options());
        }
        return value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 9498L)
    public static SubLObject convert_regex_match_options_to_value(final SubLObject options) {
        assert regular_expressions.NIL != Types.listp(options) : options;
        SubLObject result = (SubLObject)regular_expressions.ZERO_INTEGER;
        SubLObject cdolist_list_var = options;
        SubLObject option = (SubLObject)regular_expressions.NIL;
        option = cdolist_list_var.first();
        while (regular_expressions.NIL != cdolist_list_var) {
            final SubLObject value = map_regex_match_option_to_value(option);
            result = Numbers.logior(result, value);
            cdolist_list_var = cdolist_list_var.rest();
            option = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 9772L)
    public static SubLObject regex_p(final SubLObject expression) {
        return Types.stringp(expression);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 9899L)
    public static SubLObject is_regular_expressions_support_availableP() {
        return Regex.is_regex_implementation_availableP();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 10006L)
    public static SubLObject compile_regular_expression(final SubLObject expression, SubLObject options) {
        if (options == regular_expressions.UNPROVIDED) {
            options = (SubLObject)regular_expressions.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert regular_expressions.NIL != regex_p(expression) : expression;
        assert regular_expressions.NIL != Types.listp(options) : options;
        final SubLObject option_value = convert_regex_compile_options_to_value(options);
        thread.resetMultipleValues();
        final SubLObject pattern = Regex.compile_regular_expression_impl(expression, option_value);
        final SubLObject error_offset = thread.secondMultipleValue();
        final SubLObject error_msg = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return Values.values(pattern, (SubLObject)regular_expressions.ZERO_INTEGER, error_offset, error_msg);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 10402L)
    public static SubLObject compile_regular_expression_raise_error(final SubLObject regex, SubLObject options) {
        if (options == regular_expressions.UNPROVIDED) {
            options = (SubLObject)regular_expressions.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject pattern = compile_regular_expression(regex, options);
        final SubLObject v_int = thread.secondMultipleValue();
        final SubLObject error_offset = thread.thirdMultipleValue();
        final SubLObject error_msg = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (regular_expressions.NIL == pattern) {
            Errors.error((SubLObject)regular_expressions.$str29$_a_at_offset__a_while_compiling_r, error_msg, error_offset, regex);
        }
        return pattern;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 10739L)
    public static SubLObject regex_pattern_p(final SubLObject pattern) {
        return Regex.regex_pattern_p_impl(pattern);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 10821L)
    public static SubLObject regular_expression_p(final SubLObject v_object) {
        return Types.stringp(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 10894L)
    public static SubLObject match_regular_expression_pattern_offsets(final SubLObject pattern, final SubLObject string, final SubLObject matches, SubLObject options, SubLObject start, SubLObject end) {
        if (options == regular_expressions.UNPROVIDED) {
            options = (SubLObject)regular_expressions.NIL;
        }
        if (start == regular_expressions.UNPROVIDED) {
            start = (SubLObject)regular_expressions.ZERO_INTEGER;
        }
        if (end == regular_expressions.UNPROVIDED) {
            end = (SubLObject)regular_expressions.NIL;
        }
        assert regular_expressions.NIL != regex_pattern_p(pattern) : pattern;
        assert regular_expressions.NIL != Types.stringp(string) : string;
        assert regular_expressions.NIL != Types.fixnump(matches) : matches;
        assert regular_expressions.NIL != Types.listp(options) : options;
        assert regular_expressions.NIL != Types.fixnump(start) : start;
        if (regular_expressions.NIL == end) {
            end = Sequences.length(string);
        }
        assert regular_expressions.NIL != Types.fixnump(end) : end;
        final SubLObject option_value = convert_regex_match_options_to_value(options);
        return Regex.match_regular_expression_pattern_offsets_impl(pattern, string, matches, option_value, start, end);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 11514L)
    public static SubLObject match_regular_expression_pattern(final SubLObject pattern, final SubLObject string, final SubLObject matches, SubLObject options, SubLObject start, SubLObject end) {
        if (options == regular_expressions.UNPROVIDED) {
            options = (SubLObject)regular_expressions.NIL;
        }
        if (start == regular_expressions.UNPROVIDED) {
            start = (SubLObject)regular_expressions.ZERO_INTEGER;
        }
        if (end == regular_expressions.UNPROVIDED) {
            end = (SubLObject)regular_expressions.NIL;
        }
        final SubLObject offsets = match_regular_expression_pattern_offsets(pattern, string, matches, options, start, end);
        SubLObject strings = (SubLObject)regular_expressions.NIL;
        SubLObject cdolist_list_var = offsets;
        SubLObject offset = (SubLObject)regular_expressions.NIL;
        offset = cdolist_list_var.first();
        while (regular_expressions.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = offset;
            SubLObject match_start = (SubLObject)regular_expressions.NIL;
            SubLObject match_end = (SubLObject)regular_expressions.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)regular_expressions.$list33);
            match_start = current.first();
            current = (match_end = current.rest());
            if (match_start.numGE((SubLObject)regular_expressions.ZERO_INTEGER) && match_end.numGE((SubLObject)regular_expressions.ZERO_INTEGER)) {
                final SubLObject match = Sequences.subseq(string, match_start, match_end);
                strings = (SubLObject)ConsesLow.cons(match, strings);
            }
            cdolist_list_var = cdolist_list_var.rest();
            offset = cdolist_list_var.first();
        }
        return Sequences.nreverse(strings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 12128L)
    public static SubLObject discard_regular_expression_pattern(final SubLObject pattern) {
        assert regular_expressions.NIL != regex_pattern_p(pattern) : pattern;
        Regex.discard_regular_expression_pattern_impl(pattern);
        return (SubLObject)regular_expressions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 12298L)
    public static SubLObject with_regular_expression_pattern(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)regular_expressions.$list34);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject pattern = (SubLObject)regular_expressions.NIL;
        SubLObject regular_expression = (SubLObject)regular_expressions.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)regular_expressions.$list34);
        pattern = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)regular_expressions.$list34);
        regular_expression = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)regular_expressions.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)regular_expressions.NIL;
        SubLObject current_$1 = (SubLObject)regular_expressions.NIL;
        while (regular_expressions.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)regular_expressions.$list34);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)regular_expressions.$list34);
            if (regular_expressions.NIL == conses_high.member(current_$1, (SubLObject)regular_expressions.$list35, (SubLObject)regular_expressions.UNPROVIDED, (SubLObject)regular_expressions.UNPROVIDED)) {
                bad = (SubLObject)regular_expressions.T;
            }
            if (current_$1 == regular_expressions.$kw36$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (regular_expressions.NIL != bad && regular_expressions.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)regular_expressions.$list34);
        }
        final SubLObject compile_options_tail = cdestructuring_bind.property_list_member((SubLObject)regular_expressions.$kw37$COMPILE_OPTIONS, current);
        final SubLObject compile_options = (SubLObject)((regular_expressions.NIL != compile_options_tail) ? conses_high.cadr(compile_options_tail) : regular_expressions.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject error_code = (SubLObject)regular_expressions.$sym38$ERROR_CODE;
        final SubLObject error_offset = (SubLObject)regular_expressions.$sym39$ERROR_OFFSET;
        final SubLObject error_msg = (SubLObject)regular_expressions.$sym40$ERROR_MSG;
        return (SubLObject)ConsesLow.list((SubLObject)regular_expressions.$sym41$CMULTIPLE_VALUE_BIND, (SubLObject)ConsesLow.list(pattern, error_code, error_offset, error_msg), (SubLObject)ConsesLow.list((SubLObject)regular_expressions.$sym42$COMPILE_REGULAR_EXPRESSION, regular_expression, compile_options), (SubLObject)ConsesLow.list((SubLObject)regular_expressions.$sym43$CUNWIND_PROTECT, (SubLObject)ConsesLow.list((SubLObject)regular_expressions.$sym44$PROGN, (SubLObject)ConsesLow.list((SubLObject)regular_expressions.$sym45$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)regular_expressions.$sym30$REGEX_PATTERN_P, pattern), (SubLObject)ConsesLow.list((SubLObject)regular_expressions.$sym46$ERROR, (SubLObject)regular_expressions.$str47$Error__A___A__compiling_regular_e, error_code, error_msg, regular_expression, error_offset)), reader.bq_cons((SubLObject)regular_expressions.$sym44$PROGN, ConsesLow.append(body, (SubLObject)regular_expressions.NIL))), (SubLObject)ConsesLow.list((SubLObject)regular_expressions.$sym48$PWHEN, (SubLObject)ConsesLow.list((SubLObject)regular_expressions.$sym30$REGEX_PATTERN_P, pattern), (SubLObject)ConsesLow.list((SubLObject)regular_expressions.$sym49$DISCARD_REGULAR_EXPRESSION_PATTERN, pattern))));
    }
    
    public static SubLObject declare_regular_expressions_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.regular_expressions", "enumerate_regex_compile_options", "ENUMERATE-REGEX-COMPILE-OPTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.regular_expressions", "map_regex_compile_option_to_value", "MAP-REGEX-COMPILE-OPTION-TO-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.regular_expressions", "convert_regex_compile_options_to_value", "CONVERT-REGEX-COMPILE-OPTIONS-TO-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.regular_expressions", "enumerate_regex_match_options", "ENUMERATE-REGEX-MATCH-OPTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.regular_expressions", "map_regex_match_option_to_value", "MAP-REGEX-MATCH-OPTION-TO-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.regular_expressions", "convert_regex_match_options_to_value", "CONVERT-REGEX-MATCH-OPTIONS-TO-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.regular_expressions", "regex_p", "REGEX-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.regular_expressions", "is_regular_expressions_support_availableP", "IS-REGULAR-EXPRESSIONS-SUPPORT-AVAILABLE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.regular_expressions", "compile_regular_expression", "COMPILE-REGULAR-EXPRESSION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.regular_expressions", "compile_regular_expression_raise_error", "COMPILE-REGULAR-EXPRESSION-RAISE-ERROR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.regular_expressions", "regex_pattern_p", "REGEX-PATTERN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.regular_expressions", "regular_expression_p", "REGULAR-EXPRESSION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.regular_expressions", "match_regular_expression_pattern_offsets", "MATCH-REGULAR-EXPRESSION-PATTERN-OFFSETS", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.regular_expressions", "match_regular_expression_pattern", "MATCH-REGULAR-EXPRESSION-PATTERN", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.regular_expressions", "discard_regular_expression_pattern", "DISCARD-REGULAR-EXPRESSION-PATTERN", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.regular_expressions", "with_regular_expression_pattern", "WITH-REGULAR-EXPRESSION-PATTERN");
        return (SubLObject)regular_expressions.NIL;
    }
    
    public static SubLObject init_regular_expressions_file() {
        regular_expressions.$regex_compopt_anchored$ = SubLFiles.deflexical("*REGEX-COMPOPT-ANCHORED*", (SubLObject)regular_expressions.SIXTEEN_INTEGER);
        regular_expressions.$regex_compopt_caseless$ = SubLFiles.deflexical("*REGEX-COMPOPT-CASELESS*", (SubLObject)regular_expressions.ONE_INTEGER);
        regular_expressions.$regex_compopt_dollar_endonly$ = SubLFiles.deflexical("*REGEX-COMPOPT-DOLLAR-ENDONLY*", (SubLObject)regular_expressions.$int0$32);
        regular_expressions.$regex_compopt_dotall$ = SubLFiles.deflexical("*REGEX-COMPOPT-DOTALL*", (SubLObject)regular_expressions.FOUR_INTEGER);
        regular_expressions.$regex_compopt_extended$ = SubLFiles.deflexical("*REGEX-COMPOPT-EXTENDED*", (SubLObject)regular_expressions.EIGHT_INTEGER);
        regular_expressions.$regex_compopt_multiline$ = SubLFiles.deflexical("*REGEX-COMPOPT-MULTILINE*", (SubLObject)regular_expressions.TWO_INTEGER);
        regular_expressions.$regex_compopt_extra$ = SubLFiles.deflexical("*REGEX-COMPOPT-EXTRA*", (SubLObject)regular_expressions.$int1$64);
        regular_expressions.$regex_compopt_ungreedy$ = SubLFiles.deflexical("*REGEX-COMPOPT-UNGREEDY*", (SubLObject)regular_expressions.$int2$512);
        regular_expressions.$regex_compopt_utf8$ = SubLFiles.deflexical("*REGEX-COMPOPT-UTF8*", (SubLObject)regular_expressions.$int3$2048);
        regular_expressions.$regex_compopt_no_auto_capture$ = SubLFiles.deflexical("*REGEX-COMPOPT-NO-AUTO-CAPTURE*", (SubLObject)regular_expressions.$int4$4096);
        regular_expressions.$regex_compopt_no_utf8_check$ = SubLFiles.deflexical("*REGEX-COMPOPT-NO-UTF8-CHECK*", (SubLObject)regular_expressions.$int5$8192);
        regular_expressions.$regex_compopt_to_values_map$ = SubLFiles.deflexical("*REGEX-COMPOPT-TO-VALUES-MAP*", (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)regular_expressions.$kw6$ANCHORED, regular_expressions.$regex_compopt_anchored$.getGlobalValue()), ConsesLow.list((SubLObject)regular_expressions.$kw7$CASELESS, regular_expressions.$regex_compopt_caseless$.getGlobalValue()), ConsesLow.list((SubLObject)regular_expressions.$kw8$DOLLAR_ENDONLY, regular_expressions.$regex_compopt_dollar_endonly$.getGlobalValue()), ConsesLow.list((SubLObject)regular_expressions.$kw9$DOTALL, regular_expressions.$regex_compopt_dotall$.getGlobalValue()), ConsesLow.list((SubLObject)regular_expressions.$kw10$EXTENDED, regular_expressions.$regex_compopt_extended$.getGlobalValue()), ConsesLow.list((SubLObject)regular_expressions.$kw11$MULTILINE, regular_expressions.$regex_compopt_multiline$.getGlobalValue()), ConsesLow.list((SubLObject)regular_expressions.$kw12$UNGREEDY, regular_expressions.$regex_compopt_ungreedy$.getGlobalValue()), ConsesLow.list((SubLObject)regular_expressions.$kw13$EXTRA, regular_expressions.$regex_compopt_extra$.getGlobalValue()), ConsesLow.list((SubLObject)regular_expressions.$kw14$UTF8, regular_expressions.$regex_compopt_utf8$.getGlobalValue()), ConsesLow.list((SubLObject)regular_expressions.$kw15$NO_AUTO_CAPTURE, regular_expressions.$regex_compopt_no_auto_capture$.getGlobalValue()), ConsesLow.list((SubLObject)regular_expressions.$kw16$NO_UTF8_CHECK, regular_expressions.$regex_compopt_no_utf8_check$.getGlobalValue()) }));
        regular_expressions.$regex_matchopt_anchored$ = SubLFiles.deflexical("*REGEX-MATCHOPT-ANCHORED*", (SubLObject)regular_expressions.SIXTEEN_INTEGER);
        regular_expressions.$regex_matchopt_notbol$ = SubLFiles.deflexical("*REGEX-MATCHOPT-NOTBOL*", (SubLObject)regular_expressions.$int21$128);
        regular_expressions.$regex_matchopt_noteol$ = SubLFiles.deflexical("*REGEX-MATCHOPT-NOTEOL*", (SubLObject)regular_expressions.$int22$256);
        regular_expressions.$regex_matchopt_notempty$ = SubLFiles.deflexical("*REGEX-MATCHOPT-NOTEMPTY*", (SubLObject)regular_expressions.$int23$1024);
        regular_expressions.$regex_matchopt_to_values_map$ = SubLFiles.deflexical("*REGEX-MATCHOPT-TO-VALUES-MAP*", (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)regular_expressions.$kw6$ANCHORED, regular_expressions.$regex_matchopt_anchored$.getGlobalValue()), (SubLObject)ConsesLow.list((SubLObject)regular_expressions.$kw24$NOT_BOL, regular_expressions.$regex_matchopt_notbol$.getGlobalValue()), (SubLObject)ConsesLow.list((SubLObject)regular_expressions.$kw25$NOT_EOL, regular_expressions.$regex_matchopt_noteol$.getGlobalValue()), (SubLObject)ConsesLow.list((SubLObject)regular_expressions.$kw26$NOT_EMPTY, regular_expressions.$regex_matchopt_notempty$.getGlobalValue())));
        return (SubLObject)regular_expressions.NIL;
    }
    
    public static SubLObject setup_regular_expressions_file() {
        return (SubLObject)regular_expressions.NIL;
    }
    
    public void declareFunctions() {
        declare_regular_expressions_file();
    }
    
    public void initializeVariables() {
        init_regular_expressions_file();
    }
    
    public void runTopLevelForms() {
        setup_regular_expressions_file();
    }
    
    static {
        me = (SubLFile)new regular_expressions();
        regular_expressions.$regex_compopt_anchored$ = null;
        regular_expressions.$regex_compopt_caseless$ = null;
        regular_expressions.$regex_compopt_dollar_endonly$ = null;
        regular_expressions.$regex_compopt_dotall$ = null;
        regular_expressions.$regex_compopt_extended$ = null;
        regular_expressions.$regex_compopt_multiline$ = null;
        regular_expressions.$regex_compopt_extra$ = null;
        regular_expressions.$regex_compopt_ungreedy$ = null;
        regular_expressions.$regex_compopt_utf8$ = null;
        regular_expressions.$regex_compopt_no_auto_capture$ = null;
        regular_expressions.$regex_compopt_no_utf8_check$ = null;
        regular_expressions.$regex_compopt_to_values_map$ = null;
        regular_expressions.$regex_matchopt_anchored$ = null;
        regular_expressions.$regex_matchopt_notbol$ = null;
        regular_expressions.$regex_matchopt_noteol$ = null;
        regular_expressions.$regex_matchopt_notempty$ = null;
        regular_expressions.$regex_matchopt_to_values_map$ = null;
        $int0$32 = SubLObjectFactory.makeInteger(32);
        $int1$64 = SubLObjectFactory.makeInteger(64);
        $int2$512 = SubLObjectFactory.makeInteger(512);
        $int3$2048 = SubLObjectFactory.makeInteger(2048);
        $int4$4096 = SubLObjectFactory.makeInteger(4096);
        $int5$8192 = SubLObjectFactory.makeInteger(8192);
        $kw6$ANCHORED = SubLObjectFactory.makeKeyword("ANCHORED");
        $kw7$CASELESS = SubLObjectFactory.makeKeyword("CASELESS");
        $kw8$DOLLAR_ENDONLY = SubLObjectFactory.makeKeyword("DOLLAR-ENDONLY");
        $kw9$DOTALL = SubLObjectFactory.makeKeyword("DOTALL");
        $kw10$EXTENDED = SubLObjectFactory.makeKeyword("EXTENDED");
        $kw11$MULTILINE = SubLObjectFactory.makeKeyword("MULTILINE");
        $kw12$UNGREEDY = SubLObjectFactory.makeKeyword("UNGREEDY");
        $kw13$EXTRA = SubLObjectFactory.makeKeyword("EXTRA");
        $kw14$UTF8 = SubLObjectFactory.makeKeyword("UTF8");
        $kw15$NO_AUTO_CAPTURE = SubLObjectFactory.makeKeyword("NO-AUTO-CAPTURE");
        $kw16$NO_UTF8_CHECK = SubLObjectFactory.makeKeyword("NO-UTF8-CHECK");
        $sym17$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym18$KEYWORDP = SubLObjectFactory.makeSymbol("KEYWORDP");
        $str19$Invalid_compile_option__S__only_o = SubLObjectFactory.makeString("Invalid compile option ~S: only one of ~S permitted.~%");
        $sym20$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $int21$128 = SubLObjectFactory.makeInteger(128);
        $int22$256 = SubLObjectFactory.makeInteger(256);
        $int23$1024 = SubLObjectFactory.makeInteger(1024);
        $kw24$NOT_BOL = SubLObjectFactory.makeKeyword("NOT-BOL");
        $kw25$NOT_EOL = SubLObjectFactory.makeKeyword("NOT-EOL");
        $kw26$NOT_EMPTY = SubLObjectFactory.makeKeyword("NOT-EMPTY");
        $str27$Invalid_match_option__S__only_one = SubLObjectFactory.makeString("Invalid match option ~S: only one of ~S permitted.~%");
        $sym28$REGEX_P = SubLObjectFactory.makeSymbol("REGEX-P");
        $str29$_a_at_offset__a_while_compiling_r = SubLObjectFactory.makeString("~a at offset ~a while compiling regex /~a/");
        $sym30$REGEX_PATTERN_P = SubLObjectFactory.makeSymbol("REGEX-PATTERN-P");
        $sym31$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym32$FIXNUMP = SubLObjectFactory.makeSymbol("FIXNUMP");
        $list33 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("MATCH-START"), (SubLObject)SubLObjectFactory.makeSymbol("MATCH-END"));
        $list34 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PATTERN"), (SubLObject)SubLObjectFactory.makeSymbol("REGULAR-EXPRESSION"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("COMPILE-OPTIONS")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list35 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COMPILE-OPTIONS"));
        $kw36$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw37$COMPILE_OPTIONS = SubLObjectFactory.makeKeyword("COMPILE-OPTIONS");
        $sym38$ERROR_CODE = SubLObjectFactory.makeUninternedSymbol("ERROR-CODE");
        $sym39$ERROR_OFFSET = SubLObjectFactory.makeUninternedSymbol("ERROR-OFFSET");
        $sym40$ERROR_MSG = SubLObjectFactory.makeUninternedSymbol("ERROR-MSG");
        $sym41$CMULTIPLE_VALUE_BIND = SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND");
        $sym42$COMPILE_REGULAR_EXPRESSION = SubLObjectFactory.makeSymbol("COMPILE-REGULAR-EXPRESSION");
        $sym43$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $sym44$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym45$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $sym46$ERROR = SubLObjectFactory.makeSymbol("ERROR");
        $str47$Error__A___A__compiling_regular_e = SubLObjectFactory.makeString("Error ~A (~A) compiling regular expression ~S at offset ~A.");
        $sym48$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym49$DISCARD_REGULAR_EXPRESSION_PATTERN = SubLObjectFactory.makeSymbol("DISCARD-REGULAR-EXPRESSION-PATTERN");
    }
}

/*

	Total time: 126 ms
	
*/