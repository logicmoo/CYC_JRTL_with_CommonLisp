package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_C;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_s;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.search;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
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


public final class cycl_string extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new cycl_string();



    private static final SubLSymbol CYCL_TO_UTF8_STRING = makeSymbol("CYCL-TO-UTF8-STRING");

    private static final SubLSymbol CYCL_STRING_TO_UTF8_STRING = makeSymbol("CYCL-STRING-TO-UTF8-STRING");

    private static final SubLSymbol CYCL_STRING_P = makeSymbol("CYCL-STRING-P");

    private static final SubLSymbol NON_ASCII_CHAR_P = makeSymbol("NON-ASCII-CHAR-P");



    private static final SubLString $str5$Error_converting_string_to_CycL__ = makeString("Error converting string to CycL:~% ~S~% ~S");

    private static final SubLInteger $int$127 = makeInteger(127);

    private static final SubLSymbol $sym7$_ = makeSymbol("<");

    private static final SubLSymbol CYCL_STRING_TRIM = makeSymbol("CYCL-STRING-TRIM");













    private static final SubLList $list15 = list(list(list(list(CHAR_s), list(reader_make_constant_shell(makeString("UnicodeStringFn")), makeString("sup&uE9;rieur"))), list(reader_make_constant_shell(makeString("UnicodeStringFn")), makeString("up&uE9;rieur"))), list(list(list(CHAR_s, CHAR_quotation), list(reader_make_constant_shell(makeString("UnicodeStringFn")), makeString("\"sup&uE9;rieur"))), list(reader_make_constant_shell(makeString("UnicodeStringFn")), makeString("up&uE9;rieur"))), list(list(list(CHAR_C), makeString("Cycorp")), makeString("ycorp")));

    private static final SubLSymbol CYCL_STRING_TO_HTML_ESCAPED_AND_BACK = makeSymbol("CYCL-STRING-TO-HTML-ESCAPED-AND-BACK");

    private static final SubLList $list17 = list(list(list(list(reader_make_constant_shell(makeString("UnicodeStringFn")), makeString("sup&uE9;rieur"))), list(reader_make_constant_shell(makeString("UnicodeStringFn")), makeString("sup&uE9;rieur"))), list(list(makeString("Cycorp")), makeString("Cycorp")), list(list(makeString(">\"")), makeString(">\"")), list(list(list(reader_make_constant_shell(makeString("UnicodeStringFn")), makeString("&u5317;&u4EAC;&u5E02;>\\\""))), list(reader_make_constant_shell(makeString("UnicodeStringFn")), makeString("&u5317;&u4EAC;&u5E02;>\\\""))), list(list(list(reader_make_constant_shell(makeString("UnicodeStringFn")), makeString("&u5317;&u4EAC;&u5E02;"))), list(reader_make_constant_shell(makeString("UnicodeStringFn")), makeString("&u5317;&u4EAC;&u5E02;"))), list(list(list(reader_make_constant_shell(makeString("UnicodeStringFn")), makeString("&u5317;&u4EAC;&u5E02; sup&uE9;rieur"))), list(reader_make_constant_shell(makeString("UnicodeStringFn")), makeString("&u5317;&u4EAC;&u5E02; sup&uE9;rieur"))), list(list(list(reader_make_constant_shell(makeString("UnicodeStringFn")), makeString("1  &uD7; 8 &uF7; 9"))), list(reader_make_constant_shell(makeString("UnicodeStringFn")), makeString("1  &uD7; 8 &uF7; 9"))));

    private static final SubLSymbol CYCL_STRING_TO_UTF8_STRING_AND_BACK = makeSymbol("CYCL-STRING-TO-UTF8-STRING-AND-BACK");

    private static final SubLSymbol CONCATENATE_STRINGS = makeSymbol("CONCATENATE-STRINGS");



    private static final SubLList $list21 = list(list(list(list(makeString("foo"), makeString("bar"))), makeString("foobar")), list(list(list(list(reader_make_constant_shell(makeString("UnicodeStringFn")), makeString("for debts not exceeding &ua3;5,000")), makeString(" or more"))), list(reader_make_constant_shell(makeString("UnicodeStringFn")), makeString("for debts not exceeding &ua3;5,000 or more"))), list(list(list(makeString("as well as "), list(reader_make_constant_shell(makeString("UnicodeStringFn")), makeString("for debts not exceeding &ua3;5,000")))), list(reader_make_constant_shell(makeString("UnicodeStringFn")), makeString("as well as for debts not exceeding &ua3;5,000"))), list(list(list(list(reader_make_constant_shell(makeString("UnicodeStringFn")), makeString("for debts not exceeding &ua3;5,000")), list(reader_make_constant_shell(makeString("UnicodeStringFn")), makeString(" or &ua3;6,000")))), list(reader_make_constant_shell(makeString("UnicodeStringFn")), makeString("for debts not exceeding &ua3;5,000 or &ua3;6,000"))), list(list(list(makeString("&quot;"), makeString("US Designates Al Akhtar Trust"), makeString("&quot;"))), makeString("&quot;US Designates Al Akhtar Trust&quot;")));

    public static SubLObject cycl_string_p(final SubLObject v_object) {
        return unicode_nauts.string_or_unicode_naut_p(v_object);
    }

    public static SubLObject cycl_string_wXo_control_charsP(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_string_p(v_object)) && (NIL != string_utilities.string_wXo_control_charsP(cycl_string_to_utf8_string(v_object))));
    }

    public static SubLObject cycl_to_utf8_string(final SubLObject v_cycl_string) {
        return cycl_string_to_utf8_string(v_cycl_string);
    }

    public static SubLObject cycl_string_to_utf8_string(final SubLObject v_cycl_string) {
        if (NIL != unicode_nauts.unicode_naut_p(v_cycl_string, UNPROVIDED)) {
            return unicode_nauts.convert_unicode_string_naut_to_utf8(v_cycl_string);
        }
        return v_cycl_string;
    }

    public static SubLObject cycl_string_to_unicode_vector(final SubLObject string) {
        return unicode_strings.display_to_unicode_vector(NIL != unicode_strings.ascii_string_p(string) ? string : cycl_utilities.nat_arg1(string, UNPROVIDED));
    }

    public static SubLObject cycl_list_to_utf8(final SubLObject cycl_stringlist) {
        return Mapping.mapcar(CYCL_STRING_TO_UTF8_STRING, cycl_stringlist);
    }

    public static SubLObject cycl_stringE(final SubLObject cycl1, final SubLObject cycl2) {
        return Strings.stringE(cycl_string_to_utf8_string(cycl1), cycl_string_to_utf8_string(cycl2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cycl_string_equal(final SubLObject cycl1, final SubLObject cycl2) {
        return Strings.string_equal(cycl_string_to_utf8_string(cycl1), cycl_string_to_utf8_string(cycl2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cycl_string_L(final SubLObject cycl_string1, final SubLObject cycl_string2) {
        if (cycl_string1.isString() && cycl_string2.isString()) {
            return Strings.stringL(cycl_string1, cycl_string2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return cycl_string_L_via_unicode_vectors(cycl_string1, cycl_string2);
    }

    public static SubLObject cycl_string_L_via_unicode_vectors(final SubLObject cycl_string1, final SubLObject cycl_string2) {
        final SubLObject v1 = unicode_strings.utf8_string_to_unicode_vector(cycl_string_to_utf8_string(cycl_string1));
        final SubLObject v2 = unicode_strings.utf8_string_to_unicode_vector(cycl_string_to_utf8_string(cycl_string2));
        final SubLObject shorter = (NIL != list_utilities.greater_length_p(v1, v2)) ? v2 : v1;
        SubLObject end_var;
        SubLObject i;
        for (end_var = length(shorter), i = NIL, i = ZERO_INTEGER; !i.numGE(end_var); i = number_utilities.f_1X(i)) {
            if (aref(v1, i).numG(aref(v2, i))) {
                return NIL;
            }
            if (aref(v1, i).numL(aref(v2, i))) {
                return T;
            }
        }
        return makeBoolean(v1.eql(shorter) && (NIL != list_utilities.lesser_length_p(v1, v2)));
    }

    public static SubLObject cycl_superstringP(final SubLObject v_cycl_string, final SubLObject little, final SubLObject test) {
        assert NIL != cycl_string_p(v_cycl_string) : "cycl_string.cycl_string_p(v_cycl_string) " + "CommonSymbols.NIL != cycl_string.cycl_string_p(v_cycl_string) " + v_cycl_string;
        assert NIL != cycl_string_p(little) : "cycl_string.cycl_string_p(little) " + "CommonSymbols.NIL != cycl_string.cycl_string_p(little) " + little;
        if (v_cycl_string.isString() && little.isString()) {
            return string_utilities.superstringP(v_cycl_string, little, test, UNPROVIDED);
        }
        final SubLObject big_utf8 = cycl_string_to_utf8_string(v_cycl_string);
        final SubLObject big = unicode_strings.utf8_string_to_unicode_vector(big_utf8);
        final SubLObject small_utf8 = cycl_string_to_utf8_string(little);
        final SubLObject small = unicode_strings.utf8_string_to_unicode_vector(small_utf8);
        return makeBoolean((NIL != list_utilities.greater_or_same_length_p(big, small)) && ((NIL != string_utilities.superstringP(big_utf8, small_utf8, test, UNPROVIDED)) || (NIL != search(small, big, test, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))));
    }

    public static SubLObject cycl_string_starts_with_by_test(final SubLObject v_cycl_string, final SubLObject starting, final SubLObject test) {
        assert NIL != cycl_string_p(v_cycl_string) : "cycl_string.cycl_string_p(v_cycl_string) " + "CommonSymbols.NIL != cycl_string.cycl_string_p(v_cycl_string) " + v_cycl_string;
        assert NIL != cycl_string_p(starting) : "cycl_string.cycl_string_p(starting) " + "CommonSymbols.NIL != cycl_string.cycl_string_p(starting) " + starting;
        if (v_cycl_string.isString() && starting.isString()) {
            return string_utilities.starts_with_by_test(v_cycl_string, starting, test);
        }
        final SubLObject big_utf8 = cycl_string_to_utf8_string(v_cycl_string);
        final SubLObject big = unicode_strings.utf8_string_to_unicode_vector(big_utf8);
        final SubLObject small_utf8 = cycl_string_to_utf8_string(starting);
        final SubLObject small = unicode_strings.utf8_string_to_unicode_vector(small_utf8);
        return makeBoolean((NIL != list_utilities.greater_or_same_length_p(big, small)) && ((NIL != string_utilities.starts_with_by_test(big_utf8, small_utf8, test)) || small.equalp(subseq(big, ZERO_INTEGER, length(small)))));
    }

    public static SubLObject cycl_string_ends_with_by_test(final SubLObject v_cycl_string, final SubLObject ending, final SubLObject test) {
        assert NIL != cycl_string_p(v_cycl_string) : "cycl_string.cycl_string_p(v_cycl_string) " + "CommonSymbols.NIL != cycl_string.cycl_string_p(v_cycl_string) " + v_cycl_string;
        assert NIL != cycl_string_p(ending) : "cycl_string.cycl_string_p(ending) " + "CommonSymbols.NIL != cycl_string.cycl_string_p(ending) " + ending;
        if (v_cycl_string.isString() && ending.isString()) {
            return string_utilities.ends_with(v_cycl_string, ending, test);
        }
        final SubLObject big_utf8 = cycl_string_to_utf8_string(v_cycl_string);
        final SubLObject big = unicode_strings.utf8_string_to_unicode_vector(big_utf8);
        final SubLObject small_utf8 = cycl_string_to_utf8_string(ending);
        final SubLObject small = unicode_strings.utf8_string_to_unicode_vector(small_utf8);
        return makeBoolean((NIL != list_utilities.greater_or_same_length_p(big, small)) && ((NIL != string_utilities.ends_with(big_utf8, small_utf8, test)) || small.equalp(subseq(big, subtract(length(big), length(small)), UNPROVIDED))));
    }

    public static SubLObject convert_string_to_cycl(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_cycl_string = string;
        if (NIL != find_if(NON_ASCII_CHAR_P, string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            v_cycl_string = unicode_strings.unicode_to_html_escaped(unicode_strings.utf8_string_to_unicode_vector(string), UNPROVIDED);
        }
        if (NIL != string_utilities.html_escaped_string_p(v_cycl_string)) {
            SubLObject error_string = NIL;
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        final SubLObject display = unicode_strings.unicode_vector_to_display(unicode_strings.html_escaped_to_unicode_vector(v_cycl_string));
                        final SubLObject display_as_subl = unicode_strings.display_to_subl_string(display, UNPROVIDED, UNPROVIDED);
                        if (display_as_subl.equal(unicode_strings.html_escaped_to_utf8_string(v_cycl_string))) {
                            v_cycl_string = display_as_subl;
                        } else {
                            v_cycl_string = unicode_nauts.make_unicode_naut(display);
                        }
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                error_string = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
            if (NIL != error_string) {
                Errors.warn($str5$Error_converting_string_to_CycL__, string, error_string);
            }
        }
        return v_cycl_string;
    }

    public static SubLObject cycl_string_trim(final SubLObject char_list, final SubLObject string) {
        if (string.isString()) {
            return Strings.string_trim(char_list, string);
        }
        final SubLObject utf8 = unicode_nauts.convert_unicode_string_naut_to_utf8(string);
        final SubLObject trimmed = Strings.string_trim(char_list, utf8);
        return unicode_nauts.utf8_string_to_cycl_safe_string(trimmed);
    }

    public static SubLObject cycl_string_bunge(final SubLObject strings, SubLObject v_char) {
        if (v_char == UNPROVIDED) {
            v_char = CHAR_space;
        }
        SubLObject unicodeP = NIL;
        SubLObject done_oneP = NIL;
        SubLObject string = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            SubLObject cdolist_list_var = strings;
            SubLObject word = NIL;
            word = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != done_oneP) {
                    princ(v_char, stream);
                }
                if (NIL != unicode_nauts.unicode_naut_p(word, UNPROVIDED)) {
                    unicodeP = T;
                    princ(cycl_utilities.nat_arg1(word, UNPROVIDED), stream);
                } else {
                    princ(word, stream);
                }
                done_oneP = T;
                cdolist_list_var = cdolist_list_var.rest();
                word = cdolist_list_var.first();
            } 
            string = get_output_stream_string(stream);
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
        return NIL != unicodeP ? unicode_nauts.make_unicode_naut(string) : string;
    }

    public static SubLObject cycl_string_tokenize(final SubLObject big_string, final SubLObject separator_strings) {
        final SubLObject big_string_is_unicodeP = unicode_nauts.unicode_naut_p(big_string, UNPROVIDED);
        final SubLObject stringy_string = (NIL != big_string_is_unicodeP) ? cycl_utilities.nat_arg1(big_string, UNPROVIDED) : big_string;
        final SubLObject stringy_strings = string_utilities.string_tokenize(stringy_string, separator_strings, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject cyc_strings = NIL;
        SubLObject cdolist_list_var = stringy_strings;
        SubLObject string = NIL;
        string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            cyc_strings = cons(NIL != big_string_is_unicodeP ? unicode_nauts.display_vector_string_to_cycl_safe_string(string) : string, cyc_strings);
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        } 
        return nreverse(cyc_strings);
    }

    public static SubLObject canonicalize_cycl_string(final SubLObject v_cycl_string) {
        if (v_cycl_string.isString()) {
            return v_cycl_string;
        }
        final SubLObject original = cycl_utilities.nat_arg1(v_cycl_string, UNPROVIDED);
        final SubLObject unicode_vector = unicode_strings.display_to_unicode_vector(original);
        final SubLObject canonical = unicode_strings.unicode_vector_to_display(unicode_vector);
        return NIL == find($int$127, unicode_vector, symbol_function($sym7$_), UNPROVIDED, UNPROVIDED, UNPROVIDED) ? unicode_strings.display_to_utf8_string(unicode_strings.unicode_vector_to_display(unicode_vector)) : original.equal(canonical) ? v_cycl_string : unicode_nauts.make_unicode_naut(canonical);
    }

    public static SubLObject cycl_string_to_html_escaped_and_back(final SubLObject string) {
        final SubLObject html_escaped = unicode_strings.unicode_to_html_escaped(cycl_string_to_unicode_vector(string), UNPROVIDED);
        final SubLObject cycl_safe = convert_string_to_cycl(html_escaped);
        return cycl_safe;
    }

    public static SubLObject cycl_string_to_utf8_string_and_back(final SubLObject v_cycl_string) {
        final SubLObject utf8_string = unicode_strings.utf8_vector_to_utf8_string(unicode_strings.unicode_vector_to_utf8_vector(cycl_string_to_unicode_vector(v_cycl_string), UNPROVIDED, UNPROVIDED));
        final SubLObject cycl_safe = convert_string_to_cycl(utf8_string);
        return cycl_safe;
    }

    public static SubLObject declare_cycl_string_file() {
        declareFunction("cycl_string_p", "CYCL-STRING-P", 1, 0, false);
        declareFunction("cycl_string_wXo_control_charsP", "CYCL-STRING-W/O-CONTROL-CHARS?", 1, 0, false);
        declareFunction("cycl_to_utf8_string", "CYCL-TO-UTF8-STRING", 1, 0, false);
        declareFunction("cycl_string_to_utf8_string", "CYCL-STRING-TO-UTF8-STRING", 1, 0, false);
        declareFunction("cycl_string_to_unicode_vector", "CYCL-STRING-TO-UNICODE-VECTOR", 1, 0, false);
        declareFunction("cycl_list_to_utf8", "CYCL-LIST-TO-UTF8", 1, 0, false);
        declareFunction("cycl_stringE", "CYCL-STRING=", 2, 0, false);
        declareFunction("cycl_string_equal", "CYCL-STRING-EQUAL", 2, 0, false);
        declareFunction("cycl_string_L", "CYCL-STRING-<", 2, 0, false);
        declareFunction("cycl_string_L_via_unicode_vectors", "CYCL-STRING-<-VIA-UNICODE-VECTORS", 2, 0, false);
        declareFunction("cycl_superstringP", "CYCL-SUPERSTRING?", 3, 0, false);
        declareFunction("cycl_string_starts_with_by_test", "CYCL-STRING-STARTS-WITH-BY-TEST", 3, 0, false);
        declareFunction("cycl_string_ends_with_by_test", "CYCL-STRING-ENDS-WITH-BY-TEST", 3, 0, false);
        declareFunction("convert_string_to_cycl", "CONVERT-STRING-TO-CYCL", 1, 0, false);
        declareFunction("cycl_string_trim", "CYCL-STRING-TRIM", 2, 0, false);
        declareFunction("cycl_string_bunge", "CYCL-STRING-BUNGE", 1, 1, false);
        declareFunction("cycl_string_tokenize", "CYCL-STRING-TOKENIZE", 2, 0, false);
        declareFunction("canonicalize_cycl_string", "CANONICALIZE-CYCL-STRING", 1, 0, false);
        declareFunction("cycl_string_to_html_escaped_and_back", "CYCL-STRING-TO-HTML-ESCAPED-AND-BACK", 1, 0, false);
        declareFunction("cycl_string_to_utf8_string_and_back", "CYCL-STRING-TO-UTF8-STRING-AND-BACK", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_cycl_string_file() {
        return NIL;
    }

    public static SubLObject setup_cycl_string_file() {
        register_external_symbol(CYCL_TO_UTF8_STRING);
        define_test_case_table_int(CYCL_STRING_TRIM, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list15);
        define_test_case_table_int(CYCL_STRING_TO_HTML_ESCAPED_AND_BACK, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list17);
        define_test_case_table_int(CYCL_STRING_TO_UTF8_STRING_AND_BACK, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list17);
        define_test_case_table_int(CONCATENATE_STRINGS, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list21);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cycl_string_file();
    }

    @Override
    public void initializeVariables() {
        init_cycl_string_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cycl_string_file();
    }

    static {























    }
}

/**
 * Total time: 245 ms
 */
