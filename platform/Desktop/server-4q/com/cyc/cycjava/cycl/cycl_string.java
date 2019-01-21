package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cycl_string extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cycl_string";
    public static final String myFingerPrint = "e21bb17980ddf4bfd977617842ec65a9a2bcbf539e46c84e937942ef03df033f";
    private static final SubLSymbol $sym0$CYCL_TO_UTF8_STRING;
    private static final SubLSymbol $sym1$CYCL_STRING_TO_UTF8_STRING;
    private static final SubLSymbol $sym2$CYCL_STRING_P;
    private static final SubLSymbol $sym3$NON_ASCII_CHAR_P;
    private static final SubLSymbol $sym4$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str5$Error_converting_string_to_CycL__;
    private static final SubLInteger $int6$127;
    private static final SubLSymbol $sym7$_;
    private static final SubLSymbol $sym8$CYCL_STRING_TRIM;
    private static final SubLSymbol $kw9$TEST;
    private static final SubLSymbol $kw10$OWNER;
    private static final SubLSymbol $kw11$CLASSES;
    private static final SubLSymbol $kw12$KB;
    private static final SubLSymbol $kw13$TINY;
    private static final SubLSymbol $kw14$WORKING_;
    private static final SubLList $list15;
    private static final SubLSymbol $sym16$CYCL_STRING_TO_HTML_ESCAPED_AND_BACK;
    private static final SubLList $list17;
    private static final SubLSymbol $sym18$CYCL_STRING_TO_UTF8_STRING_AND_BACK;
    private static final SubLSymbol $sym19$CONCATENATE_STRINGS;
    private static final SubLSymbol $kw20$FULL;
    private static final SubLList $list21;
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-string.lisp", position = 1411L)
    public static SubLObject cycl_string_p(final SubLObject v_object) {
        return unicode_nauts.string_or_unicode_naut_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-string.lisp", position = 1632L)
    public static SubLObject cycl_string_wXo_control_charsP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_string.NIL != cycl_string_p(v_object) && cycl_string.NIL != string_utilities.string_wXo_control_charsP(cycl_string_to_utf8_string(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-string.lisp", position = 1917L)
    public static SubLObject cycl_to_utf8_string(final SubLObject v_cycl_string) {
        return cycl_string_to_utf8_string(v_cycl_string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-string.lisp", position = 2071L)
    public static SubLObject cycl_string_to_utf8_string(final SubLObject v_cycl_string) {
        if (cycl_string.NIL != unicode_nauts.unicode_naut_p(v_cycl_string, (SubLObject)cycl_string.UNPROVIDED)) {
            return unicode_nauts.convert_unicode_string_naut_to_utf8(v_cycl_string);
        }
        return v_cycl_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-string.lisp", position = 2453L)
    public static SubLObject cycl_string_to_unicode_vector(final SubLObject string) {
        return unicode_strings.display_to_unicode_vector((cycl_string.NIL != unicode_strings.ascii_string_p(string)) ? string : cycl_utilities.nat_arg1(string, (SubLObject)cycl_string.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-string.lisp", position = 2601L)
    public static SubLObject cycl_list_to_utf8(final SubLObject cycl_stringlist) {
        return Mapping.mapcar((SubLObject)cycl_string.$sym1$CYCL_STRING_TO_UTF8_STRING, cycl_stringlist);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-string.lisp", position = 2852L)
    public static SubLObject cycl_stringE(final SubLObject cycl1, final SubLObject cycl2) {
        return Strings.stringE(cycl_string_to_utf8_string(cycl1), cycl_string_to_utf8_string(cycl2), (SubLObject)cycl_string.UNPROVIDED, (SubLObject)cycl_string.UNPROVIDED, (SubLObject)cycl_string.UNPROVIDED, (SubLObject)cycl_string.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-string.lisp", position = 2984L)
    public static SubLObject cycl_string_equal(final SubLObject cycl1, final SubLObject cycl2) {
        return Strings.string_equal(cycl_string_to_utf8_string(cycl1), cycl_string_to_utf8_string(cycl2), (SubLObject)cycl_string.UNPROVIDED, (SubLObject)cycl_string.UNPROVIDED, (SubLObject)cycl_string.UNPROVIDED, (SubLObject)cycl_string.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-string.lisp", position = 3228L)
    public static SubLObject cycl_string_L(final SubLObject cycl_string1, final SubLObject cycl_string2) {
        if (cycl_string1.isString() && cycl_string2.isString()) {
            return Strings.stringL(cycl_string1, cycl_string2, (SubLObject)cycl_string.UNPROVIDED, (SubLObject)cycl_string.UNPROVIDED, (SubLObject)cycl_string.UNPROVIDED, (SubLObject)cycl_string.UNPROVIDED);
        }
        return cycl_string_L_via_unicode_vectors(cycl_string1, cycl_string2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-string.lisp", position = 3912L)
    public static SubLObject cycl_string_L_via_unicode_vectors(final SubLObject cycl_string1, final SubLObject cycl_string2) {
        final SubLObject v1 = unicode_strings.utf8_string_to_unicode_vector(cycl_string_to_utf8_string(cycl_string1));
        final SubLObject v2 = unicode_strings.utf8_string_to_unicode_vector(cycl_string_to_utf8_string(cycl_string2));
        final SubLObject shorter = (cycl_string.NIL != list_utilities.greater_length_p(v1, v2)) ? v2 : v1;
        SubLObject end_var;
        SubLObject i;
        for (end_var = Sequences.length(shorter), i = (SubLObject)cycl_string.NIL, i = (SubLObject)cycl_string.ZERO_INTEGER; !i.numGE(end_var); i = number_utilities.f_1X(i)) {
            if (Vectors.aref(v1, i).numG(Vectors.aref(v2, i))) {
                return (SubLObject)cycl_string.NIL;
            }
            if (Vectors.aref(v1, i).numL(Vectors.aref(v2, i))) {
                return (SubLObject)cycl_string.T;
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(v1.eql(shorter) && cycl_string.NIL != list_utilities.lesser_length_p(v1, v2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-string.lisp", position = 4420L)
    public static SubLObject cycl_superstringP(final SubLObject v_cycl_string, final SubLObject little, final SubLObject test) {
        assert cycl_string.NIL != cycl_string_p(v_cycl_string) : v_cycl_string;
        assert cycl_string.NIL != cycl_string_p(little) : little;
        if (v_cycl_string.isString() && little.isString()) {
            return string_utilities.superstringP(v_cycl_string, little, test, (SubLObject)cycl_string.UNPROVIDED);
        }
        final SubLObject big_utf8 = cycl_string_to_utf8_string(v_cycl_string);
        final SubLObject big = unicode_strings.utf8_string_to_unicode_vector(big_utf8);
        final SubLObject small_utf8 = cycl_string_to_utf8_string(little);
        final SubLObject small = unicode_strings.utf8_string_to_unicode_vector(small_utf8);
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_string.NIL != list_utilities.greater_or_same_length_p(big, small) && (cycl_string.NIL != string_utilities.superstringP(big_utf8, small_utf8, test, (SubLObject)cycl_string.UNPROVIDED) || cycl_string.NIL != Sequences.search(small, big, test, (SubLObject)cycl_string.UNPROVIDED, (SubLObject)cycl_string.UNPROVIDED, (SubLObject)cycl_string.UNPROVIDED, (SubLObject)cycl_string.UNPROVIDED, (SubLObject)cycl_string.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-string.lisp", position = 5031L)
    public static SubLObject cycl_string_starts_with_by_test(final SubLObject v_cycl_string, final SubLObject starting, final SubLObject test) {
        assert cycl_string.NIL != cycl_string_p(v_cycl_string) : v_cycl_string;
        assert cycl_string.NIL != cycl_string_p(starting) : starting;
        if (v_cycl_string.isString() && starting.isString()) {
            return string_utilities.starts_with_by_test(v_cycl_string, starting, test);
        }
        final SubLObject big_utf8 = cycl_string_to_utf8_string(v_cycl_string);
        final SubLObject big = unicode_strings.utf8_string_to_unicode_vector(big_utf8);
        final SubLObject small_utf8 = cycl_string_to_utf8_string(starting);
        final SubLObject small = unicode_strings.utf8_string_to_unicode_vector(small_utf8);
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_string.NIL != list_utilities.greater_or_same_length_p(big, small) && (cycl_string.NIL != string_utilities.starts_with_by_test(big_utf8, small_utf8, test) || small.equalp(Sequences.subseq(big, (SubLObject)cycl_string.ZERO_INTEGER, Sequences.length(small)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-string.lisp", position = 5701L)
    public static SubLObject cycl_string_ends_with_by_test(final SubLObject v_cycl_string, final SubLObject ending, final SubLObject test) {
        assert cycl_string.NIL != cycl_string_p(v_cycl_string) : v_cycl_string;
        assert cycl_string.NIL != cycl_string_p(ending) : ending;
        if (v_cycl_string.isString() && ending.isString()) {
            return string_utilities.ends_with(v_cycl_string, ending, test);
        }
        final SubLObject big_utf8 = cycl_string_to_utf8_string(v_cycl_string);
        final SubLObject big = unicode_strings.utf8_string_to_unicode_vector(big_utf8);
        final SubLObject small_utf8 = cycl_string_to_utf8_string(ending);
        final SubLObject small = unicode_strings.utf8_string_to_unicode_vector(small_utf8);
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_string.NIL != list_utilities.greater_or_same_length_p(big, small) && (cycl_string.NIL != string_utilities.ends_with(big_utf8, small_utf8, test) || small.equalp(Sequences.subseq(big, Numbers.subtract(Sequences.length(big), Sequences.length(small)), (SubLObject)cycl_string.UNPROVIDED))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-string.lisp", position = 6354L)
    public static SubLObject convert_string_to_cycl(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_cycl_string = string;
        if (cycl_string.NIL != Sequences.find_if((SubLObject)cycl_string.$sym3$NON_ASCII_CHAR_P, string, (SubLObject)cycl_string.UNPROVIDED, (SubLObject)cycl_string.UNPROVIDED, (SubLObject)cycl_string.UNPROVIDED)) {
            v_cycl_string = unicode_strings.unicode_to_html_escaped(unicode_strings.utf8_string_to_unicode_vector(string), (SubLObject)cycl_string.UNPROVIDED);
        }
        if (cycl_string.NIL != string_utilities.html_escaped_string_p(v_cycl_string)) {
            SubLObject error_string = (SubLObject)cycl_string.NIL;
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)cycl_string.$sym4$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        final SubLObject display = unicode_strings.unicode_vector_to_display(unicode_strings.html_escaped_to_unicode_vector(v_cycl_string));
                        final SubLObject display_as_subl = unicode_strings.display_to_subl_string(display, (SubLObject)cycl_string.UNPROVIDED, (SubLObject)cycl_string.UNPROVIDED);
                        if (display_as_subl.equal(unicode_strings.html_escaped_to_utf8_string(v_cycl_string))) {
                            v_cycl_string = display_as_subl;
                        }
                        else {
                            v_cycl_string = unicode_nauts.make_unicode_naut(display);
                        }
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)cycl_string.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                error_string = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            finally {
                thread.throwStack.pop();
            }
            if (cycl_string.NIL != error_string) {
                Errors.warn((SubLObject)cycl_string.$str5$Error_converting_string_to_CycL__, string, error_string);
            }
        }
        return v_cycl_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-string.lisp", position = 7304L)
    public static SubLObject cycl_string_trim(final SubLObject char_list, final SubLObject string) {
        if (string.isString()) {
            return Strings.string_trim(char_list, string);
        }
        final SubLObject utf8 = unicode_nauts.convert_unicode_string_naut_to_utf8(string);
        final SubLObject trimmed = Strings.string_trim(char_list, utf8);
        return unicode_nauts.utf8_string_to_cycl_safe_string(trimmed);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-string.lisp", position = 7991L)
    public static SubLObject cycl_string_bunge(final SubLObject strings, SubLObject v_char) {
        if (v_char == cycl_string.UNPROVIDED) {
            v_char = (SubLObject)Characters.CHAR_space;
        }
        SubLObject unicodeP = (SubLObject)cycl_string.NIL;
        SubLObject done_oneP = (SubLObject)cycl_string.NIL;
        SubLObject string = (SubLObject)cycl_string.NIL;
        SubLObject stream = (SubLObject)cycl_string.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            SubLObject cdolist_list_var = strings;
            SubLObject word = (SubLObject)cycl_string.NIL;
            word = cdolist_list_var.first();
            while (cycl_string.NIL != cdolist_list_var) {
                if (cycl_string.NIL != done_oneP) {
                    print_high.princ(v_char, stream);
                }
                if (cycl_string.NIL != unicode_nauts.unicode_naut_p(word, (SubLObject)cycl_string.UNPROVIDED)) {
                    unicodeP = (SubLObject)cycl_string.T;
                    print_high.princ(cycl_utilities.nat_arg1(word, (SubLObject)cycl_string.UNPROVIDED), stream);
                }
                else {
                    print_high.princ(word, stream);
                }
                done_oneP = (SubLObject)cycl_string.T;
                cdolist_list_var = cdolist_list_var.rest();
                word = cdolist_list_var.first();
            }
            string = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)cycl_string.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)cycl_string.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return (cycl_string.NIL != unicodeP) ? unicode_nauts.make_unicode_naut(string) : string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-string.lisp", position = 8429L)
    public static SubLObject cycl_string_tokenize(final SubLObject big_string, final SubLObject separator_strings) {
        final SubLObject big_string_is_unicodeP = unicode_nauts.unicode_naut_p(big_string, (SubLObject)cycl_string.UNPROVIDED);
        final SubLObject stringy_string = (cycl_string.NIL != big_string_is_unicodeP) ? cycl_utilities.nat_arg1(big_string, (SubLObject)cycl_string.UNPROVIDED) : big_string;
        final SubLObject stringy_strings = string_utilities.string_tokenize(stringy_string, separator_strings, (SubLObject)cycl_string.UNPROVIDED, (SubLObject)cycl_string.UNPROVIDED, (SubLObject)cycl_string.UNPROVIDED, (SubLObject)cycl_string.UNPROVIDED, (SubLObject)cycl_string.UNPROVIDED);
        SubLObject cyc_strings = (SubLObject)cycl_string.NIL;
        SubLObject cdolist_list_var = stringy_strings;
        SubLObject string = (SubLObject)cycl_string.NIL;
        string = cdolist_list_var.first();
        while (cycl_string.NIL != cdolist_list_var) {
            cyc_strings = (SubLObject)ConsesLow.cons((cycl_string.NIL != big_string_is_unicodeP) ? unicode_nauts.display_vector_string_to_cycl_safe_string(string) : string, cyc_strings);
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        }
        return Sequences.nreverse(cyc_strings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-string.lisp", position = 8944L)
    public static SubLObject canonicalize_cycl_string(final SubLObject v_cycl_string) {
        if (v_cycl_string.isString()) {
            return v_cycl_string;
        }
        final SubLObject original = cycl_utilities.nat_arg1(v_cycl_string, (SubLObject)cycl_string.UNPROVIDED);
        final SubLObject unicode_vector = unicode_strings.display_to_unicode_vector(original);
        final SubLObject canonical = unicode_strings.unicode_vector_to_display(unicode_vector);
        return (cycl_string.NIL == Sequences.find((SubLObject)cycl_string.$int6$127, unicode_vector, Symbols.symbol_function((SubLObject)cycl_string.$sym7$_), (SubLObject)cycl_string.UNPROVIDED, (SubLObject)cycl_string.UNPROVIDED, (SubLObject)cycl_string.UNPROVIDED)) ? unicode_strings.display_to_utf8_string(unicode_strings.unicode_vector_to_display(unicode_vector)) : (original.equal(canonical) ? v_cycl_string : unicode_nauts.make_unicode_naut(canonical));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-string.lisp", position = 9447L)
    public static SubLObject cycl_string_to_html_escaped_and_back(final SubLObject string) {
        final SubLObject html_escaped = unicode_strings.unicode_to_html_escaped(cycl_string_to_unicode_vector(string), (SubLObject)cycl_string.UNPROVIDED);
        final SubLObject cycl_safe = convert_string_to_cycl(html_escaped);
        return cycl_safe;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-string.lisp", position = 9447L)
    public static SubLObject cycl_string_to_utf8_string_and_back(final SubLObject v_cycl_string) {
        final SubLObject utf8_string = unicode_strings.utf8_vector_to_utf8_string(unicode_strings.unicode_vector_to_utf8_vector(cycl_string_to_unicode_vector(v_cycl_string), (SubLObject)cycl_string.UNPROVIDED, (SubLObject)cycl_string.UNPROVIDED));
        final SubLObject cycl_safe = convert_string_to_cycl(utf8_string);
        return cycl_safe;
    }
    
    public static SubLObject declare_cycl_string_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_string", "cycl_string_p", "CYCL-STRING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_string", "cycl_string_wXo_control_charsP", "CYCL-STRING-W/O-CONTROL-CHARS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_string", "cycl_to_utf8_string", "CYCL-TO-UTF8-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_string", "cycl_string_to_utf8_string", "CYCL-STRING-TO-UTF8-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_string", "cycl_string_to_unicode_vector", "CYCL-STRING-TO-UNICODE-VECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_string", "cycl_list_to_utf8", "CYCL-LIST-TO-UTF8", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_string", "cycl_stringE", "CYCL-STRING=", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_string", "cycl_string_equal", "CYCL-STRING-EQUAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_string", "cycl_string_L", "CYCL-STRING-<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_string", "cycl_string_L_via_unicode_vectors", "CYCL-STRING-<-VIA-UNICODE-VECTORS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_string", "cycl_superstringP", "CYCL-SUPERSTRING?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_string", "cycl_string_starts_with_by_test", "CYCL-STRING-STARTS-WITH-BY-TEST", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_string", "cycl_string_ends_with_by_test", "CYCL-STRING-ENDS-WITH-BY-TEST", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_string", "convert_string_to_cycl", "CONVERT-STRING-TO-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_string", "cycl_string_trim", "CYCL-STRING-TRIM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_string", "cycl_string_bunge", "CYCL-STRING-BUNGE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_string", "cycl_string_tokenize", "CYCL-STRING-TOKENIZE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_string", "canonicalize_cycl_string", "CANONICALIZE-CYCL-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_string", "cycl_string_to_html_escaped_and_back", "CYCL-STRING-TO-HTML-ESCAPED-AND-BACK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_string", "cycl_string_to_utf8_string_and_back", "CYCL-STRING-TO-UTF8-STRING-AND-BACK", 1, 0, false);
        return (SubLObject)cycl_string.NIL;
    }
    
    public static SubLObject init_cycl_string_file() {
        return (SubLObject)cycl_string.NIL;
    }
    
    public static SubLObject setup_cycl_string_file() {
        access_macros.register_external_symbol((SubLObject)cycl_string.$sym0$CYCL_TO_UTF8_STRING);
        generic_testing.define_test_case_table_int((SubLObject)cycl_string.$sym8$CYCL_STRING_TRIM, (SubLObject)ConsesLow.list(new SubLObject[] { cycl_string.$kw9$TEST, cycl_string.EQUAL, cycl_string.$kw10$OWNER, cycl_string.NIL, cycl_string.$kw11$CLASSES, cycl_string.NIL, cycl_string.$kw12$KB, cycl_string.$kw13$TINY, cycl_string.$kw14$WORKING_, cycl_string.T }), (SubLObject)cycl_string.$list15);
        generic_testing.define_test_case_table_int((SubLObject)cycl_string.$sym16$CYCL_STRING_TO_HTML_ESCAPED_AND_BACK, (SubLObject)ConsesLow.list(new SubLObject[] { cycl_string.$kw9$TEST, cycl_string.EQUAL, cycl_string.$kw10$OWNER, cycl_string.NIL, cycl_string.$kw11$CLASSES, cycl_string.NIL, cycl_string.$kw12$KB, cycl_string.$kw13$TINY, cycl_string.$kw14$WORKING_, cycl_string.T }), (SubLObject)cycl_string.$list17);
        generic_testing.define_test_case_table_int((SubLObject)cycl_string.$sym18$CYCL_STRING_TO_UTF8_STRING_AND_BACK, (SubLObject)ConsesLow.list(new SubLObject[] { cycl_string.$kw9$TEST, cycl_string.EQUAL, cycl_string.$kw10$OWNER, cycl_string.NIL, cycl_string.$kw11$CLASSES, cycl_string.NIL, cycl_string.$kw12$KB, cycl_string.$kw13$TINY, cycl_string.$kw14$WORKING_, cycl_string.T }), (SubLObject)cycl_string.$list17);
        generic_testing.define_test_case_table_int((SubLObject)cycl_string.$sym19$CONCATENATE_STRINGS, (SubLObject)ConsesLow.list(new SubLObject[] { cycl_string.$kw9$TEST, cycl_string.NIL, cycl_string.$kw10$OWNER, cycl_string.NIL, cycl_string.$kw11$CLASSES, cycl_string.NIL, cycl_string.$kw12$KB, cycl_string.$kw20$FULL, cycl_string.$kw14$WORKING_, cycl_string.T }), (SubLObject)cycl_string.$list21);
        return (SubLObject)cycl_string.NIL;
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
        me = (SubLFile)new cycl_string();
        $sym0$CYCL_TO_UTF8_STRING = SubLObjectFactory.makeSymbol("CYCL-TO-UTF8-STRING");
        $sym1$CYCL_STRING_TO_UTF8_STRING = SubLObjectFactory.makeSymbol("CYCL-STRING-TO-UTF8-STRING");
        $sym2$CYCL_STRING_P = SubLObjectFactory.makeSymbol("CYCL-STRING-P");
        $sym3$NON_ASCII_CHAR_P = SubLObjectFactory.makeSymbol("NON-ASCII-CHAR-P");
        $sym4$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str5$Error_converting_string_to_CycL__ = SubLObjectFactory.makeString("Error converting string to CycL:~% ~S~% ~S");
        $int6$127 = SubLObjectFactory.makeInteger(127);
        $sym7$_ = SubLObjectFactory.makeSymbol("<");
        $sym8$CYCL_STRING_TRIM = SubLObjectFactory.makeSymbol("CYCL-STRING-TRIM");
        $kw9$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw10$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw11$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw12$KB = SubLObjectFactory.makeKeyword("KB");
        $kw13$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw14$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list15 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)Characters.CHAR_s), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnicodeStringFn")), (SubLObject)SubLObjectFactory.makeString("sup&uE9;rieur"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnicodeStringFn")), (SubLObject)SubLObjectFactory.makeString("up&uE9;rieur"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)Characters.CHAR_s, (SubLObject)Characters.CHAR_quotation), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnicodeStringFn")), (SubLObject)SubLObjectFactory.makeString("\"sup&uE9;rieur"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnicodeStringFn")), (SubLObject)SubLObjectFactory.makeString("up&uE9;rieur"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)Characters.CHAR_C), (SubLObject)SubLObjectFactory.makeString("Cycorp")), (SubLObject)SubLObjectFactory.makeString("ycorp")));
        $sym16$CYCL_STRING_TO_HTML_ESCAPED_AND_BACK = SubLObjectFactory.makeSymbol("CYCL-STRING-TO-HTML-ESCAPED-AND-BACK");
        $list17 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnicodeStringFn")), (SubLObject)SubLObjectFactory.makeString("sup&uE9;rieur"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnicodeStringFn")), (SubLObject)SubLObjectFactory.makeString("sup&uE9;rieur"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Cycorp")), (SubLObject)SubLObjectFactory.makeString("Cycorp")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString(">\"")), (SubLObject)SubLObjectFactory.makeString(">\"")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnicodeStringFn")), (SubLObject)SubLObjectFactory.makeString("&u5317;&u4EAC;&u5E02;>\\\""))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnicodeStringFn")), (SubLObject)SubLObjectFactory.makeString("&u5317;&u4EAC;&u5E02;>\\\""))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnicodeStringFn")), (SubLObject)SubLObjectFactory.makeString("&u5317;&u4EAC;&u5E02;"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnicodeStringFn")), (SubLObject)SubLObjectFactory.makeString("&u5317;&u4EAC;&u5E02;"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnicodeStringFn")), (SubLObject)SubLObjectFactory.makeString("&u5317;&u4EAC;&u5E02; sup&uE9;rieur"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnicodeStringFn")), (SubLObject)SubLObjectFactory.makeString("&u5317;&u4EAC;&u5E02; sup&uE9;rieur"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnicodeStringFn")), (SubLObject)SubLObjectFactory.makeString("1  &uD7; 8 &uF7; 9"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnicodeStringFn")), (SubLObject)SubLObjectFactory.makeString("1  &uD7; 8 &uF7; 9"))));
        $sym18$CYCL_STRING_TO_UTF8_STRING_AND_BACK = SubLObjectFactory.makeSymbol("CYCL-STRING-TO-UTF8-STRING-AND-BACK");
        $sym19$CONCATENATE_STRINGS = SubLObjectFactory.makeSymbol("CONCATENATE-STRINGS");
        $kw20$FULL = SubLObjectFactory.makeKeyword("FULL");
        $list21 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("foo"), (SubLObject)SubLObjectFactory.makeString("bar"))), (SubLObject)SubLObjectFactory.makeString("foobar")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnicodeStringFn")), (SubLObject)SubLObjectFactory.makeString("for debts not exceeding &ua3;5,000")), (SubLObject)SubLObjectFactory.makeString(" or more"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnicodeStringFn")), (SubLObject)SubLObjectFactory.makeString("for debts not exceeding &ua3;5,000 or more"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("as well as "), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnicodeStringFn")), (SubLObject)SubLObjectFactory.makeString("for debts not exceeding &ua3;5,000")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnicodeStringFn")), (SubLObject)SubLObjectFactory.makeString("as well as for debts not exceeding &ua3;5,000"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnicodeStringFn")), (SubLObject)SubLObjectFactory.makeString("for debts not exceeding &ua3;5,000")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnicodeStringFn")), (SubLObject)SubLObjectFactory.makeString(" or &ua3;6,000")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnicodeStringFn")), (SubLObject)SubLObjectFactory.makeString("for debts not exceeding &ua3;5,000 or &ua3;6,000"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("&quot;"), (SubLObject)SubLObjectFactory.makeString("US Designates Al Akhtar Trust"), (SubLObject)SubLObjectFactory.makeString("&quot;"))), (SubLObject)SubLObjectFactory.makeString("&quot;US Designates Al Akhtar Trust&quot;")));
    }
}

/*

	Total time: 245 ms
	
*/