package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class regular_expression_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.regular_expression_utilities";
    public static final String myFingerPrint = "082cb0ffb9b0b2897971ce33696044fdee79e98aaaf9b66d9b8c33645116ddb7";
    @SubLTranslatedFile.SubL(source = "cycl/regular-expression-utilities.lisp", position = 1276L)
    private static SubLSymbol $regular_expression_meta_characters$;
    @SubLTranslatedFile.SubL(source = "cycl/regular-expression-utilities.lisp", position = 11721L)
    private static SubLSymbol $backreference_patterns$;
    @SubLTranslatedFile.SubL(source = "cycl/regular-expression-utilities.lisp", position = 18135L)
    private static SubLSymbol $regex_special_chars$;
    private static final SubLString $str0$__________;
    private static final SubLSymbol $sym1$REGULAR_EXPRESSION_CHAR_P;
    private static final SubLSymbol $sym2$REGEX_P;
    private static final SubLSymbol $sym3$STRINGP;
    private static final SubLSymbol $kw4$REGULAR_EXPRESSION_SUPPORT_UNAVAILABLE;
    private static final SubLString $str5$Error__A___A__compiling_regular_e;
    private static final SubLSymbol $sym6$FIND_ALL_MATCHES_FOR_REGULAR_EXPRESSION;
    private static final SubLSymbol $kw7$TEST;
    private static final SubLSymbol $kw8$OWNER;
    private static final SubLSymbol $kw9$CLASSES;
    private static final SubLSymbol $kw10$KB;
    private static final SubLSymbol $kw11$TINY;
    private static final SubLSymbol $kw12$WORKING_;
    private static final SubLList $list13;
    private static final SubLSymbol $sym14$REGEX_PATTERN_P;
    private static final SubLList $list15;
    private static final SubLSymbol $sym16$FIND_ALL_CAPTURED_MATCHES_WITHIN_STRING_FROM_STRING;
    private static final SubLList $list17;
    private static final SubLSymbol $sym18$REGEXP_CAPTURING_MATCH;
    private static final SubLList $list19;
    private static final SubLString $str20$;
    private static final SubLString $str21$Invalid_backreference___a;
    private static final SubLString $str22$__;
    private static final SubLSymbol $sym23$LISTP;
    private static final SubLSymbol $sym24$REGULAR_EXPRESSION_P;
    private static final SubLSymbol $kw25$INPUT;
    private static final SubLString $str26$Unable_to_open__S;
    private static final SubLSymbol $sym27$VECTORP;
    private static final SubLSymbol $sym28$SEQUENCEP;
    private static final SubLString $str29$_________;
    private static final SubLString $str30$___A_;
    private static final SubLString $str31$__A_;
    private static final SubLSymbol $sym32$VECTOR_GREP;
    private static final SubLList $list33;
    private static final SubLSymbol $sym34$LIST_GREP;
    private static final SubLList $list35;
    
    @SubLTranslatedFile.SubL(source = "cycl/regular-expression-utilities.lisp", position = 1487L)
    public static SubLObject regular_expression_char_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isChar() && regular_expression_utilities.NIL != Sequences.find(v_object, regular_expression_utilities.$regular_expression_meta_characters$.getGlobalValue(), (SubLObject)regular_expression_utilities.UNPROVIDED, (SubLObject)regular_expression_utilities.UNPROVIDED, (SubLObject)regular_expression_utilities.UNPROVIDED, (SubLObject)regular_expression_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/regular-expression-utilities.lisp", position = 1639L)
    public static SubLObject regular_expression_string_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isString() && regular_expression_utilities.NIL != Sequences.find_if((SubLObject)regular_expression_utilities.$sym1$REGULAR_EXPRESSION_CHAR_P, v_object, (SubLObject)regular_expression_utilities.UNPROVIDED, (SubLObject)regular_expression_utilities.UNPROVIDED, (SubLObject)regular_expression_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/regular-expression-utilities.lisp", position = 1782L)
    public static SubLObject non_regular_expression_string_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isString() && regular_expression_utilities.NIL == Sequences.find_if((SubLObject)regular_expression_utilities.$sym1$REGULAR_EXPRESSION_CHAR_P, v_object, (SubLObject)regular_expression_utilities.UNPROVIDED, (SubLObject)regular_expression_utilities.UNPROVIDED, (SubLObject)regular_expression_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/regular-expression-utilities.lisp", position = 1936L)
    public static SubLObject find_all_matches_for_regular_expression(final SubLObject regular_expression, final SubLObject string, SubLObject comp_options, SubLObject match_options) {
        if (comp_options == regular_expression_utilities.UNPROVIDED) {
            comp_options = (SubLObject)regular_expression_utilities.NIL;
        }
        if (match_options == regular_expression_utilities.UNPROVIDED) {
            match_options = (SubLObject)regular_expression_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert regular_expression_utilities.NIL != regular_expressions.regex_p(regular_expression) : regular_expression;
        assert regular_expression_utilities.NIL != Types.stringp(string) : string;
        if (regular_expression_utilities.NIL != string_utilities.empty_string_p(regular_expression)) {
            return (SubLObject)regular_expression_utilities.NIL;
        }
        if (regular_expression_utilities.NIL == regular_expressions.is_regular_expressions_support_availableP()) {
            return Values.values((SubLObject)regular_expression_utilities.NIL, (SubLObject)regular_expression_utilities.$kw4$REGULAR_EXPRESSION_SUPPORT_UNAVAILABLE);
        }
        SubLObject matches = (SubLObject)regular_expression_utilities.NIL;
        thread.resetMultipleValues();
        final SubLObject pattern = regular_expressions.compile_regular_expression(regular_expression, comp_options);
        final SubLObject error_code = thread.secondMultipleValue();
        final SubLObject error_offset = thread.thirdMultipleValue();
        final SubLObject error_msg = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        try {
            if (regular_expression_utilities.NIL == regular_expressions.regex_pattern_p(pattern)) {
                Errors.error((SubLObject)regular_expression_utilities.$str5$Error__A___A__compiling_regular_e, new SubLObject[] { error_code, error_msg, regular_expression, error_offset });
            }
            matches = find_all_matches_within_string(pattern, string, match_options, (SubLObject)regular_expression_utilities.UNPROVIDED, (SubLObject)regular_expression_utilities.UNPROVIDED, (SubLObject)regular_expression_utilities.UNPROVIDED);
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)regular_expression_utilities.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (regular_expression_utilities.NIL != regular_expressions.regex_pattern_p(pattern)) {
                    regular_expressions.discard_regular_expression_pattern(pattern);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return matches;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/regular-expression-utilities.lisp", position = 3466L)
    public static SubLObject offsets_of_regex_matches(final SubLObject regex, final SubLObject string, SubLObject comp_options, SubLObject match_options) {
        if (comp_options == regular_expression_utilities.UNPROVIDED) {
            comp_options = (SubLObject)regular_expression_utilities.NIL;
        }
        if (match_options == regular_expression_utilities.UNPROVIDED) {
            match_options = (SubLObject)regular_expression_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert regular_expression_utilities.NIL != regular_expressions.regex_p(regex) : regex;
        assert regular_expression_utilities.NIL != Types.stringp(string) : string;
        if (regular_expression_utilities.NIL != string_utilities.empty_string_p(regex)) {
            return (SubLObject)regular_expression_utilities.NIL;
        }
        if (regular_expression_utilities.NIL == regular_expressions.is_regular_expressions_support_availableP()) {
            return Values.values((SubLObject)regular_expression_utilities.NIL, (SubLObject)regular_expression_utilities.$kw4$REGULAR_EXPRESSION_SUPPORT_UNAVAILABLE);
        }
        SubLObject offsets = (SubLObject)regular_expression_utilities.NIL;
        thread.resetMultipleValues();
        final SubLObject pattern = regular_expressions.compile_regular_expression(regex, comp_options);
        final SubLObject error_code = thread.secondMultipleValue();
        final SubLObject error_offset = thread.thirdMultipleValue();
        final SubLObject error_msg = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        try {
            if (regular_expression_utilities.NIL == regular_expressions.regex_pattern_p(pattern)) {
                Errors.error((SubLObject)regular_expression_utilities.$str5$Error__A___A__compiling_regular_e, new SubLObject[] { error_code, error_msg, regex, error_offset });
            }
            offsets = find_all_matches_within_string(pattern, string, match_options, (SubLObject)regular_expression_utilities.NIL, (SubLObject)regular_expression_utilities.UNPROVIDED, (SubLObject)regular_expression_utilities.UNPROVIDED);
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)regular_expression_utilities.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (regular_expression_utilities.NIL != regular_expressions.regex_pattern_p(pattern)) {
                    regular_expressions.discard_regular_expression_pattern(pattern);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return offsets;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/regular-expression-utilities.lisp", position = 4224L)
    public static SubLObject find_all_matches_for_pattern(final SubLObject pattern, final SubLObject string, SubLObject match_options) {
        if (match_options == regular_expression_utilities.UNPROVIDED) {
            match_options = (SubLObject)regular_expression_utilities.NIL;
        }
        assert regular_expression_utilities.NIL != regular_expressions.regex_pattern_p(pattern) : pattern;
        assert regular_expression_utilities.NIL != Types.stringp(string) : string;
        if (regular_expression_utilities.NIL == regular_expressions.is_regular_expressions_support_availableP()) {
            return Values.values((SubLObject)regular_expression_utilities.NIL, (SubLObject)regular_expression_utilities.$kw4$REGULAR_EXPRESSION_SUPPORT_UNAVAILABLE);
        }
        return find_all_matches_within_string(pattern, string, match_options, (SubLObject)regular_expression_utilities.UNPROVIDED, (SubLObject)regular_expression_utilities.UNPROVIDED, (SubLObject)regular_expression_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/regular-expression-utilities.lisp", position = 4770L)
    public static SubLObject find_all_matches_within_string(final SubLObject pattern, final SubLObject string, SubLObject match_options, SubLObject stringsP, SubLObject start, SubLObject end) {
        if (match_options == regular_expression_utilities.UNPROVIDED) {
            match_options = (SubLObject)regular_expression_utilities.NIL;
        }
        if (stringsP == regular_expression_utilities.UNPROVIDED) {
            stringsP = (SubLObject)regular_expression_utilities.T;
        }
        if (start == regular_expression_utilities.UNPROVIDED) {
            start = (SubLObject)regular_expression_utilities.ZERO_INTEGER;
        }
        if (end == regular_expression_utilities.UNPROVIDED) {
            end = Sequences.length(string);
        }
        SubLObject matches = (SubLObject)regular_expression_utilities.NIL;
        while (!start.isNegative()) {
            SubLObject cdolist_list_var;
            final SubLObject offsets = cdolist_list_var = regular_expressions.match_regular_expression_pattern_offsets(pattern, string, (SubLObject)regular_expression_utilities.ONE_INTEGER, match_options, start, end);
            SubLObject offset = (SubLObject)regular_expression_utilities.NIL;
            offset = cdolist_list_var.first();
            while (regular_expression_utilities.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = offset;
                SubLObject match_start = (SubLObject)regular_expression_utilities.NIL;
                SubLObject match_end = (SubLObject)regular_expression_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)regular_expression_utilities.$list15);
                match_start = current.first();
                current = (match_end = current.rest());
                if (!match_start.isNegative()) {
                    if (regular_expression_utilities.NIL != stringsP) {
                        final SubLObject match = Sequences.subseq(string, match_start, match_end);
                        matches = (SubLObject)ConsesLow.cons(match, matches);
                    }
                    else {
                        matches = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(match_start, match_end), matches);
                    }
                }
                start = match_end;
                cdolist_list_var = cdolist_list_var.rest();
                offset = cdolist_list_var.first();
            }
        }
        return Sequences.nreverse(matches);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/regular-expression-utilities.lisp", position = 5479L)
    public static SubLObject regexp_capturing_match(final SubLObject regular_expression, final SubLObject string, SubLObject comp_options, SubLObject match_options) {
        if (comp_options == regular_expression_utilities.UNPROVIDED) {
            comp_options = (SubLObject)regular_expression_utilities.NIL;
        }
        if (match_options == regular_expression_utilities.UNPROVIDED) {
            match_options = (SubLObject)regular_expression_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert regular_expression_utilities.NIL != regular_expressions.regex_p(regular_expression) : regular_expression;
        assert regular_expression_utilities.NIL != Types.stringp(string) : string;
        if (regular_expression_utilities.NIL == regular_expressions.is_regular_expressions_support_availableP()) {
            return Values.values((SubLObject)regular_expression_utilities.NIL, (SubLObject)regular_expression_utilities.$kw4$REGULAR_EXPRESSION_SUPPORT_UNAVAILABLE);
        }
        SubLObject matches = (SubLObject)regular_expression_utilities.NIL;
        thread.resetMultipleValues();
        final SubLObject pattern = regular_expressions.compile_regular_expression(regular_expression, comp_options);
        final SubLObject error_code = thread.secondMultipleValue();
        final SubLObject error_offset = thread.thirdMultipleValue();
        final SubLObject error_msg = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        try {
            if (regular_expression_utilities.NIL == regular_expressions.regex_pattern_p(pattern)) {
                Errors.error((SubLObject)regular_expression_utilities.$str5$Error__A___A__compiling_regular_e, new SubLObject[] { error_code, error_msg, regular_expression, error_offset });
            }
            matches = regexp_capturing_match_pattern(pattern, string, match_options);
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)regular_expression_utilities.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (regular_expression_utilities.NIL != regular_expressions.regex_pattern_p(pattern)) {
                    regular_expressions.discard_regular_expression_pattern(pattern);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return matches;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/regular-expression-utilities.lisp", position = 6356L)
    public static SubLObject offsets_of_regex_capturing_matches(final SubLObject regex, final SubLObject string, SubLObject comp_options, SubLObject match_options) {
        if (comp_options == regular_expression_utilities.UNPROVIDED) {
            comp_options = (SubLObject)regular_expression_utilities.NIL;
        }
        if (match_options == regular_expression_utilities.UNPROVIDED) {
            match_options = (SubLObject)regular_expression_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert regular_expression_utilities.NIL != regular_expressions.regex_p(regex) : regex;
        assert regular_expression_utilities.NIL != Types.stringp(string) : string;
        if (regular_expression_utilities.NIL != string_utilities.empty_string_p(regex)) {
            return (SubLObject)regular_expression_utilities.NIL;
        }
        if (regular_expression_utilities.NIL == regular_expressions.is_regular_expressions_support_availableP()) {
            return Values.values((SubLObject)regular_expression_utilities.NIL, (SubLObject)regular_expression_utilities.$kw4$REGULAR_EXPRESSION_SUPPORT_UNAVAILABLE);
        }
        SubLObject offsets = (SubLObject)regular_expression_utilities.NIL;
        thread.resetMultipleValues();
        final SubLObject pattern = regular_expressions.compile_regular_expression(regex, comp_options);
        final SubLObject error_code = thread.secondMultipleValue();
        final SubLObject error_offset = thread.thirdMultipleValue();
        final SubLObject error_msg = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        try {
            if (regular_expression_utilities.NIL == regular_expressions.regex_pattern_p(pattern)) {
                Errors.error((SubLObject)regular_expression_utilities.$str5$Error__A___A__compiling_regular_e, new SubLObject[] { error_code, error_msg, regex, error_offset });
            }
            offsets = find_all_captured_matches_within_string(pattern, string, match_options, (SubLObject)regular_expression_utilities.NIL, (SubLObject)regular_expression_utilities.UNPROVIDED, (SubLObject)regular_expression_utilities.UNPROVIDED);
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)regular_expression_utilities.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (regular_expression_utilities.NIL != regular_expressions.regex_pattern_p(pattern)) {
                    regular_expressions.discard_regular_expression_pattern(pattern);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return offsets;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/regular-expression-utilities.lisp", position = 7142L)
    public static SubLObject find_all_captured_matches_for_pattern(final SubLObject pattern, final SubLObject string, SubLObject match_options) {
        if (match_options == regular_expression_utilities.UNPROVIDED) {
            match_options = (SubLObject)regular_expression_utilities.NIL;
        }
        assert regular_expression_utilities.NIL != regular_expressions.regex_pattern_p(pattern) : pattern;
        assert regular_expression_utilities.NIL != Types.stringp(string) : string;
        if (regular_expression_utilities.NIL == regular_expressions.is_regular_expressions_support_availableP()) {
            return Values.values((SubLObject)regular_expression_utilities.NIL, (SubLObject)regular_expression_utilities.$kw4$REGULAR_EXPRESSION_SUPPORT_UNAVAILABLE);
        }
        return find_all_captured_matches_within_string(pattern, string, match_options, (SubLObject)regular_expression_utilities.UNPROVIDED, (SubLObject)regular_expression_utilities.UNPROVIDED, (SubLObject)regular_expression_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/regular-expression-utilities.lisp", position = 7716L)
    public static SubLObject find_all_captured_matches_within_string(final SubLObject pattern, final SubLObject string, SubLObject match_options, SubLObject stringsP, SubLObject start, SubLObject end) {
        if (match_options == regular_expression_utilities.UNPROVIDED) {
            match_options = (SubLObject)regular_expression_utilities.NIL;
        }
        if (stringsP == regular_expression_utilities.UNPROVIDED) {
            stringsP = (SubLObject)regular_expression_utilities.T;
        }
        if (start == regular_expression_utilities.UNPROVIDED) {
            start = (SubLObject)regular_expression_utilities.ZERO_INTEGER;
        }
        if (end == regular_expression_utilities.UNPROVIDED) {
            end = Sequences.length(string);
        }
        SubLObject matches = (SubLObject)regular_expression_utilities.NIL;
        while (!start.isNegative()) {
            final SubLObject offsets = regular_expressions.match_regular_expression_pattern_offsets(pattern, string, (SubLObject)regular_expression_utilities.TEN_INTEGER, match_options, start, end);
            final SubLObject offset = (SubLObject)regular_expression_utilities.NIL;
            SubLObject these_matches = (SubLObject)regular_expression_utilities.NIL;
            if (!offsets.first().first().isNegative()) {
                SubLObject list_var = (SubLObject)regular_expression_utilities.NIL;
                SubLObject offset_$1 = (SubLObject)regular_expression_utilities.NIL;
                SubLObject count = (SubLObject)regular_expression_utilities.NIL;
                list_var = offsets.rest();
                offset_$1 = list_var.first();
                for (count = (SubLObject)regular_expression_utilities.ZERO_INTEGER; regular_expression_utilities.NIL != list_var; list_var = list_var.rest(), offset_$1 = list_var.first(), count = Numbers.add((SubLObject)regular_expression_utilities.ONE_INTEGER, count)) {
                    SubLObject current;
                    final SubLObject datum = current = offset_$1;
                    SubLObject match_start = (SubLObject)regular_expression_utilities.NIL;
                    SubLObject match_end = (SubLObject)regular_expression_utilities.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)regular_expression_utilities.$list15);
                    match_start = current.first();
                    current = (match_end = current.rest());
                    if (regular_expression_utilities.NIL != stringsP) {
                        final SubLObject match = Sequences.subseq(string, match_start, match_end);
                        these_matches = (SubLObject)ConsesLow.cons(match, these_matches);
                    }
                    else {
                        these_matches = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(match_start, match_end), these_matches);
                    }
                }
                matches = (SubLObject)ConsesLow.cons(Sequences.nreverse(these_matches), matches);
            }
            start = conses_high.cdar(offsets);
        }
        return Sequences.nreverse(matches);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/regular-expression-utilities.lisp", position = 8559L)
    public static SubLObject find_all_captured_matches_within_string_from_string(final SubLObject pattern_string, final SubLObject string, SubLObject match_options) {
        if (match_options == regular_expression_utilities.UNPROVIDED) {
            match_options = (SubLObject)regular_expression_utilities.NIL;
        }
        return find_all_captured_matches_within_string(regular_expressions.compile_regular_expression(pattern_string, (SubLObject)regular_expression_utilities.UNPROVIDED), string, match_options, (SubLObject)regular_expression_utilities.UNPROVIDED, (SubLObject)regular_expression_utilities.UNPROVIDED, (SubLObject)regular_expression_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/regular-expression-utilities.lisp", position = 10259L)
    public static SubLObject regexp_capturing_match_pattern(final SubLObject pattern, final SubLObject string, SubLObject match_options) {
        if (match_options == regular_expression_utilities.UNPROVIDED) {
            match_options = (SubLObject)regular_expression_utilities.NIL;
        }
        final SubLObject offsets = regular_expressions.match_regular_expression_pattern_offsets(pattern, string, (SubLObject)regular_expression_utilities.TEN_INTEGER, match_options, (SubLObject)regular_expression_utilities.UNPROVIDED, (SubLObject)regular_expression_utilities.UNPROVIDED);
        SubLObject matches = (SubLObject)regular_expression_utilities.NIL;
        SubLObject cdolist_list_var = offsets;
        SubLObject offset = (SubLObject)regular_expression_utilities.NIL;
        offset = cdolist_list_var.first();
        while (regular_expression_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = offset;
            SubLObject match_start = (SubLObject)regular_expression_utilities.NIL;
            SubLObject match_end = (SubLObject)regular_expression_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)regular_expression_utilities.$list15);
            match_start = current.first();
            current = (match_end = current.rest());
            if (match_start.isNegative()) {
                matches = (SubLObject)ConsesLow.cons((SubLObject)regular_expression_utilities.$str20$, matches);
            }
            else {
                final SubLObject match = Sequences.subseq(string, match_start, match_end);
                matches = (SubLObject)ConsesLow.cons(match, matches);
            }
            cdolist_list_var = cdolist_list_var.rest();
            offset = cdolist_list_var.first();
        }
        if (regular_expression_utilities.NIL != list_utilities.singletonP(matches) && regular_expression_utilities.NIL != string_utilities.empty_stringP(matches.first())) {
            return (SubLObject)regular_expression_utilities.NIL;
        }
        return Sequences.nreverse(matches);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/regular-expression-utilities.lisp", position = 11209L)
    public static SubLObject regex_matchP(final SubLObject pattern, final SubLObject string) {
        return subl_promotions.non_negative_integer_p(regular_expressions.match_regular_expression_pattern_offsets(pattern, string, (SubLObject)regular_expression_utilities.ONE_INTEGER, (SubLObject)regular_expression_utilities.UNPROVIDED, (SubLObject)regular_expression_utilities.UNPROVIDED, (SubLObject)regular_expression_utilities.UNPROVIDED).first().first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/regular-expression-utilities.lisp", position = 11481L)
    public static SubLObject regex_match_compile_pattern(final SubLObject pattern_string, final SubLObject match_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject matchP = (SubLObject)regular_expression_utilities.NIL;
        thread.resetMultipleValues();
        final SubLObject regex_pattern = regular_expressions.compile_regular_expression(pattern_string, (SubLObject)regular_expression_utilities.NIL);
        final SubLObject error_code = thread.secondMultipleValue();
        final SubLObject error_offset = thread.thirdMultipleValue();
        final SubLObject error_msg = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        try {
            if (regular_expression_utilities.NIL == regular_expressions.regex_pattern_p(regex_pattern)) {
                Errors.error((SubLObject)regular_expression_utilities.$str5$Error__A___A__compiling_regular_e, new SubLObject[] { error_code, error_msg, pattern_string, error_offset });
            }
            matchP = regex_matchP(regex_pattern, match_string);
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)regular_expression_utilities.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (regular_expression_utilities.NIL != regular_expressions.regex_pattern_p(regex_pattern)) {
                    regular_expressions.discard_regular_expression_pattern(regex_pattern);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return matchP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/regular-expression-utilities.lisp", position = 11862L)
    public static SubLObject get_backreference_pattern(final SubLObject i) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (regular_expression_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (!i.numG((SubLObject)regular_expression_utilities.ZERO_INTEGER) || !i.numL((SubLObject)regular_expression_utilities.TEN_INTEGER))) {
            Errors.error((SubLObject)regular_expression_utilities.$str21$Invalid_backreference___a);
        }
        SubLObject pattern = Vectors.aref(regular_expression_utilities.$backreference_patterns$.getDynamicValue(thread), number_utilities.f_1_(i));
        if (regular_expression_utilities.NIL == pattern) {
            pattern = regular_expressions.compile_regular_expression(Sequences.cconcatenate((SubLObject)regular_expression_utilities.$str22$__, format_nil.format_nil_d_no_copy(i)), (SubLObject)regular_expression_utilities.UNPROVIDED);
            Vectors.set_aref(regular_expression_utilities.$backreference_patterns$.getDynamicValue(thread), number_utilities.f_1_(i), pattern);
        }
        return pattern;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/regular-expression-utilities.lisp", position = 12206L)
    public static SubLObject regex_subst(final SubLObject pattern, final SubLObject replacement0, final SubLObject string, SubLObject options) {
        if (options == regular_expression_utilities.UNPROVIDED) {
            options = (SubLObject)regular_expression_utilities.NIL;
        }
        assert regular_expression_utilities.NIL != regular_expressions.regex_pattern_p(pattern) : pattern;
        assert regular_expression_utilities.NIL != Types.stringp(replacement0) : replacement0;
        assert regular_expression_utilities.NIL != Types.stringp(string) : string;
        assert regular_expression_utilities.NIL != Types.listp(options) : options;
        SubLObject start = (SubLObject)regular_expression_utilities.ZERO_INTEGER;
        final SubLObject end = Sequences.length(string);
        SubLObject replaced = (SubLObject)regular_expression_utilities.NIL;
        SubLObject stream = (SubLObject)regular_expression_utilities.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            while (!start.isNegative()) {
                final SubLObject offsets = regular_expressions.match_regular_expression_pattern_offsets(pattern, string, (SubLObject)regular_expression_utilities.TEN_INTEGER, options, start, end);
                final SubLObject entire_offset = offsets.first();
                final SubLObject match_start = entire_offset.first();
                final SubLObject match_end = entire_offset.rest();
                final SubLObject captured_offsets = offsets.rest();
                SubLObject replacement = replacement0;
                SubLObject i = (SubLObject)regular_expression_utilities.ZERO_INTEGER;
                SubLObject cdolist_list_var = captured_offsets;
                SubLObject captured_offset = (SubLObject)regular_expression_utilities.NIL;
                captured_offset = cdolist_list_var.first();
                while (regular_expression_utilities.NIL != cdolist_list_var) {
                    i = Numbers.add(i, (SubLObject)regular_expression_utilities.ONE_INTEGER);
                    replacement = regex_subst(get_backreference_pattern(i), Sequences.subseq(string, captured_offset.first(), captured_offset.rest()), replacement, options);
                    cdolist_list_var = cdolist_list_var.rest();
                    captured_offset = cdolist_list_var.first();
                }
                if (match_start.isNegative()) {
                    streams_high.write_string(Sequences.subseq(string, start, end), stream, (SubLObject)regular_expression_utilities.UNPROVIDED, (SubLObject)regular_expression_utilities.UNPROVIDED);
                }
                else {
                    streams_high.write_string(Sequences.subseq(string, start, match_start), stream, (SubLObject)regular_expression_utilities.UNPROVIDED, (SubLObject)regular_expression_utilities.UNPROVIDED);
                    streams_high.write_string(replacement, stream, (SubLObject)regular_expression_utilities.UNPROVIDED, (SubLObject)regular_expression_utilities.UNPROVIDED);
                }
                start = match_end;
            }
            replaced = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)regular_expression_utilities.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)regular_expression_utilities.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return replaced;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/regular-expression-utilities.lisp", position = 13648L)
    public static SubLObject file_grep(final SubLObject regular_expression, final SubLObject filename, SubLObject comp_options, SubLObject match_options) {
        if (comp_options == regular_expression_utilities.UNPROVIDED) {
            comp_options = (SubLObject)regular_expression_utilities.NIL;
        }
        if (match_options == regular_expression_utilities.UNPROVIDED) {
            match_options = (SubLObject)regular_expression_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert regular_expression_utilities.NIL != regular_expressions.regular_expression_p(regular_expression) : regular_expression;
        assert regular_expression_utilities.NIL != Types.stringp(filename) : filename;
        if (regular_expression_utilities.NIL == regular_expressions.is_regular_expressions_support_availableP()) {
            return Values.values((SubLObject)regular_expression_utilities.NIL, (SubLObject)regular_expression_utilities.$kw4$REGULAR_EXPRESSION_SUPPORT_UNAVAILABLE);
        }
        SubLObject matches = (SubLObject)regular_expression_utilities.NIL;
        thread.resetMultipleValues();
        final SubLObject pattern = regular_expressions.compile_regular_expression(regular_expression, comp_options);
        final SubLObject error_code = thread.secondMultipleValue();
        final SubLObject error_offset = thread.thirdMultipleValue();
        final SubLObject error_msg = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        try {
            if (regular_expression_utilities.NIL == regular_expressions.regex_pattern_p(pattern)) {
                Errors.error((SubLObject)regular_expression_utilities.$str5$Error__A___A__compiling_regular_e, new SubLObject[] { error_code, error_msg, regular_expression, error_offset });
            }
            matches = file_grep_pattern(pattern, filename, match_options);
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)regular_expression_utilities.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (regular_expression_utilities.NIL != regular_expressions.regex_pattern_p(pattern)) {
                    regular_expressions.discard_regular_expression_pattern(pattern);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return matches;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/regular-expression-utilities.lisp", position = 14402L)
    public static SubLObject file_match(final SubLObject string, final SubLObject filename, SubLObject comp_options, SubLObject match_options) {
        if (comp_options == regular_expression_utilities.UNPROVIDED) {
            comp_options = (SubLObject)regular_expression_utilities.NIL;
        }
        if (match_options == regular_expression_utilities.UNPROVIDED) {
            match_options = (SubLObject)regular_expression_utilities.NIL;
        }
        return file_grep(escape_regex_special_chars(string), filename, comp_options, match_options);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/regular-expression-utilities.lisp", position = 14767L)
    public static SubLObject file_matchesP(final SubLObject string, final SubLObject filename, SubLObject comp_options, SubLObject match_options) {
        if (comp_options == regular_expression_utilities.UNPROVIDED) {
            comp_options = (SubLObject)regular_expression_utilities.NIL;
        }
        if (match_options == regular_expression_utilities.UNPROVIDED) {
            match_options = (SubLObject)regular_expression_utilities.NIL;
        }
        return list_utilities.sublisp_boolean(file_match(string, filename, comp_options, match_options));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/regular-expression-utilities.lisp", position = 14927L)
    public static SubLObject file_grep_pattern(final SubLObject pattern, final SubLObject filename, SubLObject match_options) {
        if (match_options == regular_expression_utilities.UNPROVIDED) {
            match_options = (SubLObject)regular_expression_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert regular_expression_utilities.NIL != regular_expressions.regex_pattern_p(pattern) : pattern;
        assert regular_expression_utilities.NIL != Types.stringp(filename) : filename;
        if (regular_expression_utilities.NIL == regular_expressions.is_regular_expressions_support_availableP()) {
            return Values.values((SubLObject)regular_expression_utilities.NIL, (SubLObject)regular_expression_utilities.$kw4$REGULAR_EXPRESSION_SUPPORT_UNAVAILABLE);
        }
        SubLObject matches = (SubLObject)regular_expression_utilities.NIL;
        SubLObject stream = (SubLObject)regular_expression_utilities.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)regular_expression_utilities.NIL, thread);
                stream = compatibility.open_text(filename, (SubLObject)regular_expression_utilities.$kw25$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)regular_expression_utilities.$str26$Unable_to_open__S, filename);
            }
            final SubLObject stream_$2 = stream;
            matches = file_grep_internal(pattern, stream_$2, match_options);
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)regular_expression_utilities.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)regular_expression_utilities.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return matches;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/regular-expression-utilities.lisp", position = 15602L)
    public static SubLObject file_grep_internal(final SubLObject pattern, final SubLObject stream, SubLObject match_options) {
        if (match_options == regular_expression_utilities.UNPROVIDED) {
            match_options = (SubLObject)regular_expression_utilities.NIL;
        }
        SubLObject matches = (SubLObject)regular_expression_utilities.NIL;
        SubLObject line_count = (SubLObject)regular_expression_utilities.NIL;
        SubLObject line = (SubLObject)regular_expression_utilities.NIL;
        line_count = (SubLObject)regular_expression_utilities.ONE_INTEGER;
        for (line = string_utilities.network_read_line(stream, (SubLObject)regular_expression_utilities.NIL, (SubLObject)regular_expression_utilities.NIL, (SubLObject)regular_expression_utilities.UNPROVIDED); regular_expression_utilities.NIL != line; line = streams_high.read_line(stream, (SubLObject)regular_expression_utilities.NIL, (SubLObject)regular_expression_utilities.NIL, (SubLObject)regular_expression_utilities.UNPROVIDED)) {
            final SubLObject line_matches = find_all_matches_within_string(pattern, line, match_options, (SubLObject)regular_expression_utilities.NIL, (SubLObject)regular_expression_utilities.UNPROVIDED, (SubLObject)regular_expression_utilities.UNPROVIDED);
            if (regular_expression_utilities.NIL != line_matches) {
                matches = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(line_count, line, line_matches), matches);
            }
            line_count = Numbers.add(line_count, (SubLObject)regular_expression_utilities.ONE_INTEGER);
        }
        return Sequences.nreverse(matches);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/regular-expression-utilities.lisp", position = 16062L)
    public static SubLObject vector_grep(final SubLObject regular_expression, final SubLObject vector, SubLObject comp_options, SubLObject match_options) {
        if (comp_options == regular_expression_utilities.UNPROVIDED) {
            comp_options = (SubLObject)regular_expression_utilities.NIL;
        }
        if (match_options == regular_expression_utilities.UNPROVIDED) {
            match_options = (SubLObject)regular_expression_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert regular_expression_utilities.NIL != regular_expressions.regular_expression_p(regular_expression) : regular_expression;
        assert regular_expression_utilities.NIL != Types.vectorp(vector) : vector;
        if (regular_expression_utilities.NIL == regular_expressions.is_regular_expressions_support_availableP()) {
            return Values.values((SubLObject)regular_expression_utilities.NIL, (SubLObject)regular_expression_utilities.$kw4$REGULAR_EXPRESSION_SUPPORT_UNAVAILABLE);
        }
        SubLObject matches = (SubLObject)regular_expression_utilities.NIL;
        thread.resetMultipleValues();
        final SubLObject pattern = regular_expressions.compile_regular_expression(regular_expression, comp_options);
        final SubLObject error_code = thread.secondMultipleValue();
        final SubLObject error_offset = thread.thirdMultipleValue();
        final SubLObject error_msg = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        try {
            if (regular_expression_utilities.NIL == regular_expressions.regex_pattern_p(pattern)) {
                Errors.error((SubLObject)regular_expression_utilities.$str5$Error__A___A__compiling_regular_e, new SubLObject[] { error_code, error_msg, regular_expression, error_offset });
            }
            matches = vector_grep_pattern(pattern, vector, match_options);
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)regular_expression_utilities.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (regular_expression_utilities.NIL != regular_expressions.regex_pattern_p(pattern)) {
                    regular_expressions.discard_regular_expression_pattern(pattern);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return matches;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/regular-expression-utilities.lisp", position = 16798L)
    public static SubLObject vector_grep_pattern(final SubLObject pattern, final SubLObject vector, SubLObject match_options) {
        if (match_options == regular_expression_utilities.UNPROVIDED) {
            match_options = (SubLObject)regular_expression_utilities.NIL;
        }
        assert regular_expression_utilities.NIL != Types.vectorp(vector) : vector;
        return sequence_grep_pattern(pattern, vector, match_options);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/regular-expression-utilities.lisp", position = 16971L)
    public static SubLObject list_grep(final SubLObject regular_expression, final SubLObject list, SubLObject comp_options, SubLObject match_options) {
        if (comp_options == regular_expression_utilities.UNPROVIDED) {
            comp_options = (SubLObject)regular_expression_utilities.NIL;
        }
        if (match_options == regular_expression_utilities.UNPROVIDED) {
            match_options = (SubLObject)regular_expression_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert regular_expression_utilities.NIL != regular_expressions.regular_expression_p(regular_expression) : regular_expression;
        assert regular_expression_utilities.NIL != Types.listp(list) : list;
        if (regular_expression_utilities.NIL == regular_expressions.is_regular_expressions_support_availableP()) {
            return Values.values((SubLObject)regular_expression_utilities.NIL, (SubLObject)regular_expression_utilities.$kw4$REGULAR_EXPRESSION_SUPPORT_UNAVAILABLE);
        }
        SubLObject matches = (SubLObject)regular_expression_utilities.NIL;
        thread.resetMultipleValues();
        final SubLObject pattern = regular_expressions.compile_regular_expression(regular_expression, comp_options);
        final SubLObject error_code = thread.secondMultipleValue();
        final SubLObject error_offset = thread.thirdMultipleValue();
        final SubLObject error_msg = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        try {
            if (regular_expression_utilities.NIL == regular_expressions.regex_pattern_p(pattern)) {
                Errors.error((SubLObject)regular_expression_utilities.$str5$Error__A___A__compiling_regular_e, new SubLObject[] { error_code, error_msg, regular_expression, error_offset });
            }
            matches = sequence_grep_pattern(pattern, list, match_options);
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)regular_expression_utilities.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (regular_expression_utilities.NIL != regular_expressions.regex_pattern_p(pattern)) {
                    regular_expressions.discard_regular_expression_pattern(pattern);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return matches;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/regular-expression-utilities.lisp", position = 17686L)
    public static SubLObject sequence_grep_pattern(final SubLObject pattern, final SubLObject sequence, SubLObject match_options) {
        if (match_options == regular_expression_utilities.UNPROVIDED) {
            match_options = (SubLObject)regular_expression_utilities.NIL;
        }
        assert regular_expression_utilities.NIL != regular_expressions.regex_pattern_p(pattern) : pattern;
        assert regular_expression_utilities.NIL != Types.sequencep(sequence) : sequence;
        SubLObject matches = (SubLObject)regular_expression_utilities.NIL;
        for (SubLObject sequence_var = sequence, end_index = (SubLObject)(sequence_var.isList() ? regular_expression_utilities.NIL : Sequences.length(sequence_var)), elt_num = (SubLObject)regular_expression_utilities.ZERO_INTEGER, sequence_doneP = subl_macros.do_sequence_index_doneP(elt_num, end_index, sequence_var); regular_expression_utilities.NIL == sequence_doneP; sequence_doneP = subl_macros.do_sequence_index_doneP(elt_num, end_index, sequence_var)) {
            final SubLObject elt = subl_macros.do_sequence_index_valueP(elt_num, sequence_var);
            if (elt.isString()) {
                final SubLObject elt_matches = find_all_matches_within_string(pattern, elt, match_options, (SubLObject)regular_expression_utilities.NIL, (SubLObject)regular_expression_utilities.UNPROVIDED, (SubLObject)regular_expression_utilities.UNPROVIDED);
                if (regular_expression_utilities.NIL != elt_matches) {
                    matches = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(elt_num, elt, elt_matches), matches);
                }
            }
            sequence_var = subl_macros.do_sequence_index_update(sequence_var);
            elt_num = Numbers.add(elt_num, (SubLObject)regular_expression_utilities.ONE_INTEGER);
        }
        return Sequences.nreverse(matches);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/regular-expression-utilities.lisp", position = 18308L)
    public static SubLObject escape_regex_special_chars(final SubLObject string) {
        SubLObject result = (SubLObject)regular_expression_utilities.NIL;
        SubLObject special = (SubLObject)regular_expression_utilities.NIL;
        SubLObject end_var_$3;
        SubLObject end_var;
        SubLObject char_num;
        SubLObject v_char;
        for (end_var = (end_var_$3 = Sequences.length(string)), char_num = (SubLObject)regular_expression_utilities.NIL, char_num = (SubLObject)regular_expression_utilities.ZERO_INTEGER; !char_num.numGE(end_var_$3); char_num = number_utilities.f_1X(char_num)) {
            v_char = Strings.sublisp_char(string, char_num);
            if (regular_expression_utilities.NIL != Sequences.find(v_char, regular_expression_utilities.$regex_special_chars$.getGlobalValue(), (SubLObject)regular_expression_utilities.UNPROVIDED, (SubLObject)regular_expression_utilities.UNPROVIDED, (SubLObject)regular_expression_utilities.UNPROVIDED, (SubLObject)regular_expression_utilities.UNPROVIDED)) {
                special = (SubLObject)regular_expression_utilities.T;
            }
        }
        if (regular_expression_utilities.NIL == special) {
            return string;
        }
        SubLObject stream = (SubLObject)regular_expression_utilities.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            SubLObject end_var_$4;
            SubLObject end_var2;
            SubLObject char_num2;
            SubLObject v_char2;
            for (end_var2 = (end_var_$4 = Sequences.length(string)), char_num2 = (SubLObject)regular_expression_utilities.NIL, char_num2 = (SubLObject)regular_expression_utilities.ZERO_INTEGER; !char_num2.numGE(end_var_$4); char_num2 = number_utilities.f_1X(char_num2)) {
                v_char2 = Strings.sublisp_char(string, char_num2);
                if (regular_expression_utilities.NIL != Sequences.find(v_char2, regular_expression_utilities.$regex_special_chars$.getGlobalValue(), (SubLObject)regular_expression_utilities.UNPROVIDED, (SubLObject)regular_expression_utilities.UNPROVIDED, (SubLObject)regular_expression_utilities.UNPROVIDED, (SubLObject)regular_expression_utilities.UNPROVIDED)) {
                    PrintLow.format(stream, (SubLObject)regular_expression_utilities.$str30$___A_, v_char2);
                }
                else {
                    PrintLow.format(stream, (SubLObject)regular_expression_utilities.$str31$__A_, v_char2);
                }
            }
            result = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)regular_expression_utilities.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)regular_expression_utilities.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return result;
    }
    
    public static SubLObject declare_regular_expression_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.regular_expression_utilities", "regular_expression_char_p", "REGULAR-EXPRESSION-CHAR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.regular_expression_utilities", "regular_expression_string_p", "REGULAR-EXPRESSION-STRING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.regular_expression_utilities", "non_regular_expression_string_p", "NON-REGULAR-EXPRESSION-STRING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.regular_expression_utilities", "find_all_matches_for_regular_expression", "FIND-ALL-MATCHES-FOR-REGULAR-EXPRESSION", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.regular_expression_utilities", "offsets_of_regex_matches", "OFFSETS-OF-REGEX-MATCHES", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.regular_expression_utilities", "find_all_matches_for_pattern", "FIND-ALL-MATCHES-FOR-PATTERN", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.regular_expression_utilities", "find_all_matches_within_string", "FIND-ALL-MATCHES-WITHIN-STRING", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.regular_expression_utilities", "regexp_capturing_match", "REGEXP-CAPTURING-MATCH", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.regular_expression_utilities", "offsets_of_regex_capturing_matches", "OFFSETS-OF-REGEX-CAPTURING-MATCHES", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.regular_expression_utilities", "find_all_captured_matches_for_pattern", "FIND-ALL-CAPTURED-MATCHES-FOR-PATTERN", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.regular_expression_utilities", "find_all_captured_matches_within_string", "FIND-ALL-CAPTURED-MATCHES-WITHIN-STRING", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.regular_expression_utilities", "find_all_captured_matches_within_string_from_string", "FIND-ALL-CAPTURED-MATCHES-WITHIN-STRING-FROM-STRING", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.regular_expression_utilities", "regexp_capturing_match_pattern", "REGEXP-CAPTURING-MATCH-PATTERN", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.regular_expression_utilities", "regex_matchP", "REGEX-MATCH?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.regular_expression_utilities", "regex_match_compile_pattern", "REGEX-MATCH-COMPILE-PATTERN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.regular_expression_utilities", "get_backreference_pattern", "GET-BACKREFERENCE-PATTERN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.regular_expression_utilities", "regex_subst", "REGEX-SUBST", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.regular_expression_utilities", "file_grep", "FILE-GREP", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.regular_expression_utilities", "file_match", "FILE-MATCH", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.regular_expression_utilities", "file_matchesP", "FILE-MATCHES?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.regular_expression_utilities", "file_grep_pattern", "FILE-GREP-PATTERN", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.regular_expression_utilities", "file_grep_internal", "FILE-GREP-INTERNAL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.regular_expression_utilities", "vector_grep", "VECTOR-GREP", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.regular_expression_utilities", "vector_grep_pattern", "VECTOR-GREP-PATTERN", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.regular_expression_utilities", "list_grep", "LIST-GREP", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.regular_expression_utilities", "sequence_grep_pattern", "SEQUENCE-GREP-PATTERN", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.regular_expression_utilities", "escape_regex_special_chars", "ESCAPE-REGEX-SPECIAL-CHARS", 1, 0, false);
        return (SubLObject)regular_expression_utilities.NIL;
    }
    
    public static SubLObject init_regular_expression_utilities_file() {
        regular_expression_utilities.$regular_expression_meta_characters$ = SubLFiles.defconstant("*REGULAR-EXPRESSION-META-CHARACTERS*", (SubLObject)regular_expression_utilities.$str0$__________);
        regular_expression_utilities.$backreference_patterns$ = SubLFiles.defvar("*BACKREFERENCE-PATTERNS*", Vectors.make_vector((SubLObject)regular_expression_utilities.TEN_INTEGER, (SubLObject)regular_expression_utilities.UNPROVIDED));
        regular_expression_utilities.$regex_special_chars$ = SubLFiles.deflexical("*REGEX-SPECIAL-CHARS*", (SubLObject)regular_expression_utilities.$str29$_________);
        return (SubLObject)regular_expression_utilities.NIL;
    }
    
    public static SubLObject setup_regular_expression_utilities_file() {
        generic_testing.define_test_case_table_int((SubLObject)regular_expression_utilities.$sym6$FIND_ALL_MATCHES_FOR_REGULAR_EXPRESSION, (SubLObject)ConsesLow.list(new SubLObject[] { regular_expression_utilities.$kw7$TEST, Symbols.symbol_function((SubLObject)regular_expression_utilities.EQUAL), regular_expression_utilities.$kw8$OWNER, regular_expression_utilities.NIL, regular_expression_utilities.$kw9$CLASSES, regular_expression_utilities.NIL, regular_expression_utilities.$kw10$KB, regular_expression_utilities.$kw11$TINY, regular_expression_utilities.$kw12$WORKING_, regular_expression_utilities.T }), (SubLObject)regular_expression_utilities.$list13);
        generic_testing.define_test_case_table_int((SubLObject)regular_expression_utilities.$sym16$FIND_ALL_CAPTURED_MATCHES_WITHIN_STRING_FROM_STRING, (SubLObject)ConsesLow.list(new SubLObject[] { regular_expression_utilities.$kw7$TEST, regular_expression_utilities.EQUAL, regular_expression_utilities.$kw8$OWNER, regular_expression_utilities.NIL, regular_expression_utilities.$kw9$CLASSES, regular_expression_utilities.NIL, regular_expression_utilities.$kw10$KB, regular_expression_utilities.$kw11$TINY, regular_expression_utilities.$kw12$WORKING_, regular_expression_utilities.T }), (SubLObject)regular_expression_utilities.$list17);
        generic_testing.define_test_case_table_int((SubLObject)regular_expression_utilities.$sym18$REGEXP_CAPTURING_MATCH, (SubLObject)ConsesLow.list(new SubLObject[] { regular_expression_utilities.$kw7$TEST, regular_expression_utilities.EQUAL, regular_expression_utilities.$kw8$OWNER, regular_expression_utilities.NIL, regular_expression_utilities.$kw9$CLASSES, regular_expression_utilities.NIL, regular_expression_utilities.$kw10$KB, regular_expression_utilities.$kw11$TINY, regular_expression_utilities.$kw12$WORKING_, regular_expression_utilities.T }), (SubLObject)regular_expression_utilities.$list19);
        generic_testing.define_test_case_table_int((SubLObject)regular_expression_utilities.$sym32$VECTOR_GREP, (SubLObject)ConsesLow.list(new SubLObject[] { regular_expression_utilities.$kw7$TEST, Symbols.symbol_function((SubLObject)regular_expression_utilities.EQUAL), regular_expression_utilities.$kw8$OWNER, regular_expression_utilities.NIL, regular_expression_utilities.$kw9$CLASSES, regular_expression_utilities.NIL, regular_expression_utilities.$kw10$KB, regular_expression_utilities.$kw11$TINY, regular_expression_utilities.$kw12$WORKING_, regular_expression_utilities.T }), (SubLObject)regular_expression_utilities.$list33);
        generic_testing.define_test_case_table_int((SubLObject)regular_expression_utilities.$sym34$LIST_GREP, (SubLObject)ConsesLow.list(new SubLObject[] { regular_expression_utilities.$kw7$TEST, Symbols.symbol_function((SubLObject)regular_expression_utilities.EQUAL), regular_expression_utilities.$kw8$OWNER, regular_expression_utilities.NIL, regular_expression_utilities.$kw9$CLASSES, regular_expression_utilities.NIL, regular_expression_utilities.$kw10$KB, regular_expression_utilities.$kw11$TINY, regular_expression_utilities.$kw12$WORKING_, regular_expression_utilities.T }), (SubLObject)regular_expression_utilities.$list35);
        return (SubLObject)regular_expression_utilities.NIL;
    }
    
    public void declareFunctions() {
        declare_regular_expression_utilities_file();
    }
    
    public void initializeVariables() {
        init_regular_expression_utilities_file();
    }
    
    public void runTopLevelForms() {
        setup_regular_expression_utilities_file();
    }
    
    static {
        me = (SubLFile)new regular_expression_utilities();
        regular_expression_utilities.$regular_expression_meta_characters$ = null;
        regular_expression_utilities.$backreference_patterns$ = null;
        regular_expression_utilities.$regex_special_chars$ = null;
        $str0$__________ = SubLObjectFactory.makeString(".*?[]^()|+");
        $sym1$REGULAR_EXPRESSION_CHAR_P = SubLObjectFactory.makeSymbol("REGULAR-EXPRESSION-CHAR-P");
        $sym2$REGEX_P = SubLObjectFactory.makeSymbol("REGEX-P");
        $sym3$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw4$REGULAR_EXPRESSION_SUPPORT_UNAVAILABLE = SubLObjectFactory.makeKeyword("REGULAR-EXPRESSION-SUPPORT-UNAVAILABLE");
        $str5$Error__A___A__compiling_regular_e = SubLObjectFactory.makeString("Error ~A (~A) compiling regular expression ~S at offset ~A.");
        $sym6$FIND_ALL_MATCHES_FOR_REGULAR_EXPRESSION = SubLObjectFactory.makeSymbol("FIND-ALL-MATCHES-FOR-REGULAR-EXPRESSION");
        $kw7$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw8$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw9$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw10$KB = SubLObjectFactory.makeKeyword("KB");
        $kw11$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw12$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list13 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("[a-z]+"), (SubLObject)SubLObjectFactory.makeString("UPPER lower CASING matters")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("lower"), (SubLObject)SubLObjectFactory.makeString("matters"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("[0-9]+"), (SubLObject)SubLObjectFactory.makeString("Call me after 9 on my cell -- 342-4099")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("9"), (SubLObject)SubLObjectFactory.makeString("342"), (SubLObject)SubLObjectFactory.makeString("4099"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("[0-9.]+"), (SubLObject)SubLObjectFactory.makeString("The IP address of my machine is 127.0.0.1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("127.0.0.1"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("[0-9a-z.]+@[0-9a-z.]+"), (SubLObject)SubLObjectFactory.makeString("You can email me at poohbear@hundredacrewoods.org, if you want.")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("poohbear@hundredacrewoods.org"))));
        $sym14$REGEX_PATTERN_P = SubLObjectFactory.makeSymbol("REGEX-PATTERN-P");
        $list15 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("MATCH-START"), (SubLObject)SubLObjectFactory.makeSymbol("MATCH-END"));
        $sym16$FIND_ALL_CAPTURED_MATCHES_WITHIN_STRING_FROM_STRING = SubLObjectFactory.makeSymbol("FIND-ALL-CAPTURED-MATCHES-WITHIN-STRING-FROM-STRING");
        $list17 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("(the[a-z]+) "), (SubLObject)SubLObjectFactory.makeString("their cats and these horses and them zebras and then he slept")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("their")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("these")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("them")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("then")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("([0-9]+)([a-zA-Z]+)"), (SubLObject)SubLObjectFactory.makeString("asd23asj2r;234234a")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("23"), (SubLObject)SubLObjectFactory.makeString("asj")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("2"), (SubLObject)SubLObjectFactory.makeString("r")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("234234"), (SubLObject)SubLObjectFactory.makeString("a")))));
        $sym18$REGEXP_CAPTURING_MATCH = SubLObjectFactory.makeSymbol("REGEXP-CAPTURING-MATCH");
        $list19 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString(""), (SubLObject)SubLObjectFactory.makeString("")), (SubLObject)regular_expression_utilities.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the ((red|white) (king|queen))"), (SubLObject)SubLObjectFactory.makeString("the red queen")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the red queen"), (SubLObject)SubLObjectFactory.makeString("red queen"), (SubLObject)SubLObjectFactory.makeString("red"), (SubLObject)SubLObjectFactory.makeString("queen"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("(a|(z))(bc)"), (SubLObject)SubLObjectFactory.makeString("abc")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("abc"), (SubLObject)SubLObjectFactory.makeString("a"), (SubLObject)SubLObjectFactory.makeString(""), (SubLObject)SubLObjectFactory.makeString("bc"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("(a|(z))(bc)"), (SubLObject)SubLObjectFactory.makeString("azbca")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("zbc"), (SubLObject)SubLObjectFactory.makeString("z"), (SubLObject)SubLObjectFactory.makeString("z"), (SubLObject)SubLObjectFactory.makeString("bc"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("(a)+"), (SubLObject)SubLObjectFactory.makeString("aaaaa")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("aaaaa"), (SubLObject)SubLObjectFactory.makeString("a"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("(a+)"), (SubLObject)SubLObjectFactory.makeString("aaaaa")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("aaaaa"), (SubLObject)SubLObjectFactory.makeString("aaaaa"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("(.*)(ab)+\\1"), (SubLObject)SubLObjectFactory.makeString("xyzababxyz")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("xyzababxyz"), (SubLObject)SubLObjectFactory.makeString("xyz"), (SubLObject)SubLObjectFactory.makeString("ab"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("^(\\d+)\\s+\\d+\\s+\\1$"), (SubLObject)SubLObjectFactory.makeString("212 37337 212")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("212 37337 212"), (SubLObject)SubLObjectFactory.makeString("212"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("^(a(b)?)+$"), (SubLObject)SubLObjectFactory.makeString("aba")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("aba"), (SubLObject)SubLObjectFactory.makeString("a"), (SubLObject)SubLObjectFactory.makeString("b"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("^(aa(bb)?)+$"), (SubLObject)SubLObjectFactory.makeString("aabbaa")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("aabbaa"), (SubLObject)SubLObjectFactory.makeString("aa"), (SubLObject)SubLObjectFactory.makeString("bb"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("^(aa(b(b))?)+$"), (SubLObject)SubLObjectFactory.makeString("aabbaa")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("aabbaa"), (SubLObject)SubLObjectFactory.makeString("aa"), (SubLObject)SubLObjectFactory.makeString("bb"), (SubLObject)SubLObjectFactory.makeString("b"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("^(a)?a"), (SubLObject)SubLObjectFactory.makeString("a")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("a"), (SubLObject)SubLObjectFactory.makeString(""))) });
        $str20$ = SubLObjectFactory.makeString("");
        $str21$Invalid_backreference___a = SubLObjectFactory.makeString("Invalid backreference \\~a");
        $str22$__ = SubLObjectFactory.makeString("\\\\");
        $sym23$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym24$REGULAR_EXPRESSION_P = SubLObjectFactory.makeSymbol("REGULAR-EXPRESSION-P");
        $kw25$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $str26$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $sym27$VECTORP = SubLObjectFactory.makeSymbol("VECTORP");
        $sym28$SEQUENCEP = SubLObjectFactory.makeSymbol("SEQUENCEP");
        $str29$_________ = SubLObjectFactory.makeString("[]?.*^$()");
        $str30$___A_ = SubLObjectFactory.makeString("[\\~A]");
        $str31$__A_ = SubLObjectFactory.makeString("[~A]");
        $sym32$VECTOR_GREP = SubLObjectFactory.makeSymbol("VECTOR-GREP");
        $list33 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("[a-z]+"), Vectors.vector(new SubLObject[] { SubLObjectFactory.makeString("UPPER"), SubLObjectFactory.makeString("lower"), SubLObjectFactory.makeString("CASING"), SubLObjectFactory.makeString("matters") })), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)regular_expression_utilities.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("lower"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)regular_expression_utilities.ZERO_INTEGER, (SubLObject)regular_expression_utilities.FIVE_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)regular_expression_utilities.THREE_INTEGER, (SubLObject)SubLObjectFactory.makeString("matters"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)regular_expression_utilities.ZERO_INTEGER, (SubLObject)regular_expression_utilities.SEVEN_INTEGER))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("[0-9]+"), Vectors.vector(new SubLObject[] { SubLObjectFactory.makeString("Call"), SubLObjectFactory.makeString("me"), SubLObjectFactory.makeString("after"), SubLObjectFactory.makeString("9"), SubLObjectFactory.makeString("on"), SubLObjectFactory.makeString("my"), SubLObjectFactory.makeString("cell"), SubLObjectFactory.makeString("--"), SubLObjectFactory.makeString("342-4099") })), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)regular_expression_utilities.THREE_INTEGER, (SubLObject)SubLObjectFactory.makeString("9"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)regular_expression_utilities.ZERO_INTEGER, (SubLObject)regular_expression_utilities.ONE_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)regular_expression_utilities.EIGHT_INTEGER, (SubLObject)SubLObjectFactory.makeString("342-4099"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)regular_expression_utilities.ZERO_INTEGER, (SubLObject)regular_expression_utilities.THREE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)regular_expression_utilities.FOUR_INTEGER, (SubLObject)regular_expression_utilities.EIGHT_INTEGER))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("[0-9.]+"), Vectors.vector(new SubLObject[] { SubLObjectFactory.makeString("The"), SubLObjectFactory.makeString("IP"), SubLObjectFactory.makeString("address"), SubLObjectFactory.makeString("of"), SubLObjectFactory.makeString("my"), SubLObjectFactory.makeString("machine"), SubLObjectFactory.makeString("is"), SubLObjectFactory.makeString("127.0.0.1") })), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)regular_expression_utilities.SEVEN_INTEGER, (SubLObject)SubLObjectFactory.makeString("127.0.0.1"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)regular_expression_utilities.ZERO_INTEGER, (SubLObject)regular_expression_utilities.NINE_INTEGER))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("[0-9a-z.]+@[0-9a-z.]+"), Vectors.vector(new SubLObject[] { SubLObjectFactory.makeString("You"), SubLObjectFactory.makeString("can"), SubLObjectFactory.makeString("email"), SubLObjectFactory.makeString("me"), SubLObjectFactory.makeString("at"), SubLObjectFactory.makeString("poohbear@hundredacrewoods.org,"), SubLObjectFactory.makeString("if"), SubLObjectFactory.makeString("you"), SubLObjectFactory.makeString("want.") })), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)regular_expression_utilities.FIVE_INTEGER, (SubLObject)SubLObjectFactory.makeString("poohbear@hundredacrewoods.org,"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)regular_expression_utilities.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(29)))))));
        $sym34$LIST_GREP = SubLObjectFactory.makeSymbol("LIST-GREP");
        $list35 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("[a-z]+"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("UPPER"), (SubLObject)SubLObjectFactory.makeString("lower"), (SubLObject)SubLObjectFactory.makeString("CASING"), (SubLObject)SubLObjectFactory.makeString("matters"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)regular_expression_utilities.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("lower"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)regular_expression_utilities.ZERO_INTEGER, (SubLObject)regular_expression_utilities.FIVE_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)regular_expression_utilities.THREE_INTEGER, (SubLObject)SubLObjectFactory.makeString("matters"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)regular_expression_utilities.ZERO_INTEGER, (SubLObject)regular_expression_utilities.SEVEN_INTEGER))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("[0-9]+"), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("Call"), SubLObjectFactory.makeString("me"), SubLObjectFactory.makeString("after"), SubLObjectFactory.makeString("9"), SubLObjectFactory.makeString("on"), SubLObjectFactory.makeString("my"), SubLObjectFactory.makeString("cell"), SubLObjectFactory.makeString("--"), SubLObjectFactory.makeString("342-4099") })), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)regular_expression_utilities.THREE_INTEGER, (SubLObject)SubLObjectFactory.makeString("9"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)regular_expression_utilities.ZERO_INTEGER, (SubLObject)regular_expression_utilities.ONE_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)regular_expression_utilities.EIGHT_INTEGER, (SubLObject)SubLObjectFactory.makeString("342-4099"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)regular_expression_utilities.ZERO_INTEGER, (SubLObject)regular_expression_utilities.THREE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)regular_expression_utilities.FOUR_INTEGER, (SubLObject)regular_expression_utilities.EIGHT_INTEGER))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("[0-9.]+"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("The"), (SubLObject)SubLObjectFactory.makeString("IP"), (SubLObject)SubLObjectFactory.makeString("address"), (SubLObject)SubLObjectFactory.makeString("of"), (SubLObject)SubLObjectFactory.makeString("my"), (SubLObject)SubLObjectFactory.makeString("machine"), (SubLObject)SubLObjectFactory.makeString("is"), (SubLObject)SubLObjectFactory.makeString("127.0.0.1"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)regular_expression_utilities.SEVEN_INTEGER, (SubLObject)SubLObjectFactory.makeString("127.0.0.1"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)regular_expression_utilities.ZERO_INTEGER, (SubLObject)regular_expression_utilities.NINE_INTEGER))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("[0-9a-z.]+@[0-9a-z.]+"), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("You"), SubLObjectFactory.makeString("can"), SubLObjectFactory.makeString("email"), SubLObjectFactory.makeString("me"), SubLObjectFactory.makeString("at"), SubLObjectFactory.makeString("poohbear@hundredacrewoods.org,"), SubLObjectFactory.makeString("if"), SubLObjectFactory.makeString("you"), SubLObjectFactory.makeString("want.") })), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)regular_expression_utilities.FIVE_INTEGER, (SubLObject)SubLObjectFactory.makeString("poohbear@hundredacrewoods.org,"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)regular_expression_utilities.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(29)))))));
    }
}

/*

	Total time: 324 ms
	
*/