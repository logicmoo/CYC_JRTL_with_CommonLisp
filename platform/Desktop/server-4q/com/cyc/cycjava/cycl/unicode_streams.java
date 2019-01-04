package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class unicode_streams extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.unicode_streams";
    public static final String myFingerPrint = "14bf9cb315d3916ff5dceb5432c10726a6d202645bc60cf01952124ad17b49c2";
    @SubLTranslatedFile.SubL(source = "cycl/unicode-streams.lisp", position = 912L)
    private static SubLSymbol $unicode_linefeed$;
    @SubLTranslatedFile.SubL(source = "cycl/unicode-streams.lisp", position = 955L)
    private static SubLSymbol $unicode_carriage_return$;
    @SubLTranslatedFile.SubL(source = "cycl/unicode-streams.lisp", position = 1005L)
    public static SubLSymbol $dtp_utf8_stream$;
    private static final SubLSymbol $sym0$UTF8_STREAM;
    private static final SubLSymbol $sym1$UTF8_STREAM_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$PRINT_UTF8_STREAM;
    private static final SubLSymbol $sym7$UTF8_STREAM_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$UTF8_STREAM_STREAM;
    private static final SubLSymbol $sym10$_CSETF_UTF8_STREAM_STREAM;
    private static final SubLSymbol $sym11$UTF8_STREAM_CACHE;
    private static final SubLSymbol $sym12$_CSETF_UTF8_STREAM_CACHE;
    private static final SubLSymbol $kw13$STREAM;
    private static final SubLSymbol $kw14$CACHE;
    private static final SubLString $str15$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw16$BEGIN;
    private static final SubLSymbol $sym17$MAKE_UTF8_STREAM;
    private static final SubLSymbol $kw18$SLOT;
    private static final SubLSymbol $kw19$END;
    private static final SubLSymbol $sym20$VISIT_DEFSTRUCT_OBJECT_UTF8_STREAM_METHOD;
    private static final SubLString $str21$__utf8_stream__s_cache___s_;
    private static final SubLSymbol $kw22$CLOSED;
    private static final SubLString $str23$Invalid_utf8_stream___s__;
    private static final SubLSymbol $sym24$UNICODE_CHARACTER_P;
    private static final SubLSymbol $sym25$UNICODE_STRING_P;
    private static final SubLSymbol $sym26$INTEGERP;
    private static final SubLString $str27$Invalid_Unicode_character_in_Stre;
    private static final SubLString $str28$Invalid_Unicode_character_in_Stre;
    private static final SubLInteger $int29$256;
    private static final SubLString $str30$EOF_in_Unicode_stream___s__;
    private static final SubLSymbol $kw31$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym32$IGNORE_ERRORS_HANDLER;
    private static final SubLString $str33$Internal_Error_in_Unicode_stream_;
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-streams.lisp", position = 1005L)
    public static SubLObject utf8_stream_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_utf8_stream(v_object, stream, (SubLObject)unicode_streams.ZERO_INTEGER);
        return (SubLObject)unicode_streams.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-streams.lisp", position = 1005L)
    public static SubLObject utf8_stream_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $utf8_stream_native.class) ? unicode_streams.T : unicode_streams.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-streams.lisp", position = 1005L)
    public static SubLObject utf8_stream_stream(final SubLObject v_object) {
        assert unicode_streams.NIL != utf8_stream_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-streams.lisp", position = 1005L)
    public static SubLObject utf8_stream_cache(final SubLObject v_object) {
        assert unicode_streams.NIL != utf8_stream_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-streams.lisp", position = 1005L)
    public static SubLObject _csetf_utf8_stream_stream(final SubLObject v_object, final SubLObject value) {
        assert unicode_streams.NIL != utf8_stream_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-streams.lisp", position = 1005L)
    public static SubLObject _csetf_utf8_stream_cache(final SubLObject v_object, final SubLObject value) {
        assert unicode_streams.NIL != utf8_stream_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-streams.lisp", position = 1005L)
    public static SubLObject make_utf8_stream(SubLObject arglist) {
        if (arglist == unicode_streams.UNPROVIDED) {
            arglist = (SubLObject)unicode_streams.NIL;
        }
        final SubLObject v_new = (SubLObject)new $utf8_stream_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)unicode_streams.NIL, next = arglist; unicode_streams.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)unicode_streams.$kw13$STREAM)) {
                _csetf_utf8_stream_stream(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)unicode_streams.$kw14$CACHE)) {
                _csetf_utf8_stream_cache(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)unicode_streams.$str15$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-streams.lisp", position = 1005L)
    public static SubLObject visit_defstruct_utf8_stream(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)unicode_streams.$kw16$BEGIN, (SubLObject)unicode_streams.$sym17$MAKE_UTF8_STREAM, (SubLObject)unicode_streams.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)unicode_streams.$kw18$SLOT, (SubLObject)unicode_streams.$kw13$STREAM, utf8_stream_stream(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)unicode_streams.$kw18$SLOT, (SubLObject)unicode_streams.$kw14$CACHE, utf8_stream_cache(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)unicode_streams.$kw19$END, (SubLObject)unicode_streams.$sym17$MAKE_UTF8_STREAM, (SubLObject)unicode_streams.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-streams.lisp", position = 1005L)
    public static SubLObject visit_defstruct_object_utf8_stream_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_utf8_stream(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-streams.lisp", position = 1162L)
    public static SubLObject utf8_stream_create(final SubLObject stream) {
        final SubLObject utf8_stream_obj = make_utf8_stream((SubLObject)unicode_streams.UNPROVIDED);
        _csetf_utf8_stream_stream(utf8_stream_obj, stream);
        _csetf_utf8_stream_cache(utf8_stream_obj, (SubLObject)unicode_streams.NIL);
        return utf8_stream_obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-streams.lisp", position = 1408L)
    public static SubLObject print_utf8_stream(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)unicode_streams.$str21$__utf8_stream__s_cache___s_, utf8_stream_stream(v_object), utf8_stream_cache(v_object));
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-streams.lisp", position = 1651L)
    public static SubLObject open_utf8(final SubLObject filename, final SubLObject direction) {
        final SubLObject stream = compatibility.open_binary(filename, direction);
        if (unicode_streams.NIL == stream) {
            return (SubLObject)unicode_streams.NIL;
        }
        return utf8_stream_create(stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-streams.lisp", position = 1839L)
    public static SubLObject close_utf8(final SubLObject stream) {
        if (unicode_streams.NIL == utf8_stream_p(stream)) {
            return (SubLObject)unicode_streams.NIL;
        }
        final SubLObject utf8_stream = utf8_stream_stream(stream);
        if (unicode_streams.NIL != utf8_stream) {
            streams_high.close(utf8_stream, (SubLObject)unicode_streams.UNPROVIDED);
            _csetf_utf8_stream_stream(stream, (SubLObject)unicode_streams.NIL);
        }
        return (SubLObject)unicode_streams.$kw22$CLOSED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-streams.lisp", position = 2107L)
    public static SubLObject write_unicode_char_to_utf8(final SubLObject unicode_character, SubLObject ustream) {
        if (ustream == unicode_streams.UNPROVIDED) {
            ustream = utf8_stream_create(StreamsLow.$standard_output$.getDynamicValue());
        }
        if (unicode_streams.NIL == utf8_stream_p(ustream)) {
            Errors.error((SubLObject)unicode_streams.$str23$Invalid_utf8_stream___s__, ustream);
        }
        assert unicode_streams.NIL != unicode_strings.unicode_character_p(unicode_character) : unicode_character;
        final SubLObject vect = unicode_strings.to_utf8_vector(unicode_character);
        final SubLObject stream = utf8_stream_stream(ustream);
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = Sequences.length(vect), i = (SubLObject)unicode_streams.NIL, i = (SubLObject)unicode_streams.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)unicode_streams.ONE_INTEGER)) {
            streams_high.write_byte(Vectors.aref(vect, i), stream);
        }
        return unicode_character;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-streams.lisp", position = 2662L)
    public static SubLObject write_unicode_string_to_utf8(final SubLObject ucode_string, SubLObject ustream, SubLObject start, SubLObject end) {
        if (ustream == unicode_streams.UNPROVIDED) {
            ustream = utf8_stream_create(StreamsLow.$standard_output$.getDynamicValue());
        }
        if (start == unicode_streams.UNPROVIDED) {
            start = (SubLObject)unicode_streams.ZERO_INTEGER;
        }
        if (end == unicode_streams.UNPROVIDED) {
            end = (SubLObject)unicode_streams.NIL;
        }
        if (unicode_streams.NIL == utf8_stream_p(ustream)) {
            Errors.error((SubLObject)unicode_streams.$str23$Invalid_utf8_stream___s__, ustream);
        }
        assert unicode_streams.NIL != unicode_strings.unicode_string_p(ucode_string) : ucode_string;
        if (unicode_streams.NIL == end) {
            end = Numbers.subtract(Sequences.length(unicode_strings.unicode_string_vect(ucode_string)), (SubLObject)unicode_streams.ONE_INTEGER);
        }
        assert unicode_streams.NIL != Types.integerp(end) : end;
        assert unicode_streams.NIL != Types.integerp(start) : start;
        final SubLObject stream = utf8_stream_stream(ustream);
        final SubLObject ucode_vector = unicode_strings.unicode_string_vect(ucode_string);
        final SubLObject utf8_vector = unicode_strings.unicode_vector_to_utf8_vector(ucode_vector, start, end);
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = Sequences.length(utf8_vector), i = (SubLObject)unicode_streams.NIL, i = (SubLObject)unicode_streams.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)unicode_streams.ONE_INTEGER)) {
            streams_high.write_byte(Vectors.aref(utf8_vector, i), stream);
        }
        return ucode_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-streams.lisp", position = 3507L)
    public static SubLObject write_unicode_string_to_utf8_line(final SubLObject ucode_string, SubLObject ustream, SubLObject start, SubLObject end) {
        if (ustream == unicode_streams.UNPROVIDED) {
            ustream = utf8_stream_create(StreamsLow.$standard_output$.getDynamicValue());
        }
        if (start == unicode_streams.UNPROVIDED) {
            start = (SubLObject)unicode_streams.ZERO_INTEGER;
        }
        if (end == unicode_streams.UNPROVIDED) {
            end = (SubLObject)unicode_streams.NIL;
        }
        if (unicode_streams.NIL == utf8_stream_p(ustream)) {
            Errors.error((SubLObject)unicode_streams.$str23$Invalid_utf8_stream___s__, ustream);
        }
        write_unicode_string_to_utf8(ucode_string, ustream, start, end);
        streams_high.write_byte(unicode_streams.$unicode_linefeed$.getGlobalValue(), utf8_stream_stream(ustream));
        return ucode_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-streams.lisp", position = 4011L)
    public static SubLObject read_utf8_char(SubLObject ustream, SubLObject eof_error_p, SubLObject eof_value, SubLObject recursive_p) {
        if (ustream == unicode_streams.UNPROVIDED) {
            ustream = utf8_stream_create(StreamsLow.$standard_input$.getDynamicValue());
        }
        if (eof_error_p == unicode_streams.UNPROVIDED) {
            eof_error_p = (SubLObject)unicode_streams.T;
        }
        if (eof_value == unicode_streams.UNPROVIDED) {
            eof_value = (SubLObject)unicode_streams.NIL;
        }
        if (recursive_p == unicode_streams.UNPROVIDED) {
            recursive_p = (SubLObject)unicode_streams.NIL;
        }
        final SubLObject val = read_utf8_char_helper(ustream, eof_error_p, eof_value, recursive_p);
        if (unicode_streams.NIL == eof_error_p && eof_value.equal(val)) {
            return eof_value;
        }
        return unicode_strings.unicode_char_create(val);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-streams.lisp", position = 4877L)
    public static SubLObject read_utf8_char_helper(SubLObject ustream, SubLObject eof_error_p, SubLObject eof_value, SubLObject recursive_p) {
        if (ustream == unicode_streams.UNPROVIDED) {
            ustream = utf8_stream_create(StreamsLow.$standard_input$.getDynamicValue());
        }
        if (eof_error_p == unicode_streams.UNPROVIDED) {
            eof_error_p = (SubLObject)unicode_streams.T;
        }
        if (eof_value == unicode_streams.UNPROVIDED) {
            eof_value = (SubLObject)unicode_streams.NIL;
        }
        if (recursive_p == unicode_streams.UNPROVIDED) {
            recursive_p = (SubLObject)unicode_streams.NIL;
        }
        if (unicode_streams.NIL == utf8_stream_p(ustream)) {
            Errors.error((SubLObject)unicode_streams.$str23$Invalid_utf8_stream___s__, ustream);
        }
        final SubLObject stream = utf8_stream_stream(ustream);
        final SubLObject v_char = utf8_stream_cache(ustream);
        if (unicode_streams.NIL != v_char) {
            _csetf_utf8_stream_cache(ustream, (SubLObject)unicode_streams.NIL);
            return v_char;
        }
        final SubLObject first = streams_high.read_byte(stream, eof_error_p, eof_value);
        if (eof_value.equal(first)) {
            return first;
        }
        final SubLObject len = unicode_strings.length_utf8_from_first_byte(first);
        if (len.isNegative()) {
            Errors.error((SubLObject)unicode_streams.$str27$Invalid_Unicode_character_in_Stre, stream, first);
            return eof_value;
        }
        if (len.eql((SubLObject)unicode_streams.ONE_INTEGER)) {
            return first;
        }
        final SubLObject vect = Vectors.make_vector(len, (SubLObject)unicode_streams.UNPROVIDED);
        Vectors.set_aref(vect, (SubLObject)unicode_streams.ZERO_INTEGER, first);
        SubLObject cdotimes_end_var;
        SubLObject i;
        SubLObject v_byte;
        for (cdotimes_end_var = Numbers.subtract(len, (SubLObject)unicode_streams.ONE_INTEGER), i = (SubLObject)unicode_streams.NIL, i = (SubLObject)unicode_streams.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)unicode_streams.ONE_INTEGER)) {
            v_byte = streams_high.read_byte(stream, eof_error_p, eof_value);
            if (eof_value.equal(v_byte) && unicode_streams.NIL != eof_error_p) {
                Errors.error((SubLObject)unicode_streams.$str28$Invalid_Unicode_character_in_Stre, stream, first);
                return eof_value;
            }
            Vectors.set_aref(vect, Numbers.add(i, (SubLObject)unicode_streams.ONE_INTEGER), v_byte);
        }
        final SubLObject v_char2 = unicode_strings.get_unicode_char_at_offset(vect, (SubLObject)unicode_streams.ZERO_INTEGER);
        if (v_char2.isNegative()) {
            Errors.error((SubLObject)unicode_streams.$str27$Invalid_Unicode_character_in_Stre, stream, first);
        }
        return v_char2;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-streams.lisp", position = 6511L)
    public static SubLObject read_utf8_line(SubLObject ustream, SubLObject eof_error_p, SubLObject eof_value, SubLObject recursive_p) {
        if (ustream == unicode_streams.UNPROVIDED) {
            ustream = utf8_stream_create(StreamsLow.$standard_input$.getDynamicValue());
        }
        if (eof_error_p == unicode_streams.UNPROVIDED) {
            eof_error_p = (SubLObject)unicode_streams.T;
        }
        if (eof_value == unicode_streams.UNPROVIDED) {
            eof_value = (SubLObject)unicode_streams.NIL;
        }
        if (recursive_p == unicode_streams.UNPROVIDED) {
            recursive_p = (SubLObject)unicode_streams.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (unicode_streams.NIL == utf8_stream_p(ustream)) {
            Errors.error((SubLObject)unicode_streams.$str23$Invalid_utf8_stream___s__, ustream);
        }
        SubLObject output_buffer = Vectors.make_vector((SubLObject)unicode_streams.$int29$256, (SubLObject)unicode_streams.UNPROVIDED);
        SubLObject offset = (SubLObject)unicode_streams.ZERO_INTEGER;
        SubLObject v_char;
        SubLObject newlen;
        SubLObject new_o_buffer;
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (v_char = eof_value, v_char = read_utf8_char_helper(ustream, eof_error_p, eof_value, recursive_p); !v_char.equal(eof_value) && unicode_streams.NIL != Numbers.numNE(v_char, unicode_streams.$unicode_linefeed$.getGlobalValue()) && unicode_streams.NIL != Numbers.numNE(v_char, unicode_streams.$unicode_carriage_return$.getGlobalValue()); v_char = read_utf8_char_helper(ustream, eof_error_p, eof_value, recursive_p)) {
            if (offset.numGE(Sequences.length(output_buffer))) {
                newlen = Numbers.add(Sequences.length(output_buffer), (SubLObject)unicode_streams.$int29$256);
                new_o_buffer = Vectors.make_vector(newlen, (SubLObject)unicode_streams.UNPROVIDED);
                for (cdotimes_end_var = Sequences.length(output_buffer), i = (SubLObject)unicode_streams.NIL, i = (SubLObject)unicode_streams.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)unicode_streams.ONE_INTEGER)) {
                    Vectors.set_aref(new_o_buffer, i, Vectors.aref(output_buffer, i));
                }
                output_buffer = new_o_buffer;
            }
            Vectors.set_aref(output_buffer, offset, v_char);
            offset = Numbers.add(offset, (SubLObject)unicode_streams.ONE_INTEGER);
        }
        if (v_char.equal(eof_value)) {
            if (offset.isZero()) {
                if (unicode_streams.NIL == eof_error_p) {
                    return eof_value;
                }
                Errors.error((SubLObject)unicode_streams.$str30$EOF_in_Unicode_stream___s__, ustream);
            }
        }
        else if (v_char.numE(unicode_streams.$unicode_linefeed$.getGlobalValue())) {
            SubLObject ignore_errors_tag = (SubLObject)unicode_streams.NIL;
            try {
                thread.throwStack.push(unicode_streams.$kw31$IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)unicode_streams.$sym32$IGNORE_ERRORS_HANDLER), thread);
                    try {
                        final SubLObject next_char = read_utf8_char_helper(ustream, (SubLObject)unicode_streams.UNPROVIDED, (SubLObject)unicode_streams.UNPROVIDED, (SubLObject)unicode_streams.UNPROVIDED);
                        if (!next_char.numE(unicode_streams.$unicode_carriage_return$.getGlobalValue())) {
                            _csetf_utf8_stream_cache(ustream, next_char);
                        }
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)unicode_streams.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)unicode_streams.$kw31$IGNORE_ERRORS_TARGET);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        else if (v_char.numE(unicode_streams.$unicode_carriage_return$.getGlobalValue())) {
            SubLObject ignore_errors_tag = (SubLObject)unicode_streams.NIL;
            try {
                thread.throwStack.push(unicode_streams.$kw31$IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)unicode_streams.$sym32$IGNORE_ERRORS_HANDLER), thread);
                    try {
                        final SubLObject next_char = read_utf8_char_helper(ustream, (SubLObject)unicode_streams.UNPROVIDED, (SubLObject)unicode_streams.UNPROVIDED, (SubLObject)unicode_streams.UNPROVIDED);
                        if (!next_char.numE(unicode_streams.$unicode_linefeed$.getGlobalValue())) {
                            _csetf_utf8_stream_cache(ustream, next_char);
                        }
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)unicode_streams.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)unicode_streams.$kw31$IGNORE_ERRORS_TARGET);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        else {
            Errors.error((SubLObject)unicode_streams.$str33$Internal_Error_in_Unicode_stream_, ustream);
        }
        return unicode_strings.unicode_string_create(Sequences.subseq(output_buffer, (SubLObject)unicode_streams.ZERO_INTEGER, offset));
    }
    
    public static SubLObject declare_unicode_streams_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_streams", "utf8_stream_print_function_trampoline", "UTF8-STREAM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_streams", "utf8_stream_p", "UTF8-STREAM-P", 1, 0, false);
        new $utf8_stream_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_streams", "utf8_stream_stream", "UTF8-STREAM-STREAM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_streams", "utf8_stream_cache", "UTF8-STREAM-CACHE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_streams", "_csetf_utf8_stream_stream", "_CSETF-UTF8-STREAM-STREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_streams", "_csetf_utf8_stream_cache", "_CSETF-UTF8-STREAM-CACHE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_streams", "make_utf8_stream", "MAKE-UTF8-STREAM", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_streams", "visit_defstruct_utf8_stream", "VISIT-DEFSTRUCT-UTF8-STREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_streams", "visit_defstruct_object_utf8_stream_method", "VISIT-DEFSTRUCT-OBJECT-UTF8-STREAM-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_streams", "utf8_stream_create", "UTF8-STREAM-CREATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_streams", "print_utf8_stream", "PRINT-UTF8-STREAM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_streams", "open_utf8", "OPEN-UTF8", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_streams", "close_utf8", "CLOSE-UTF8", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_streams", "write_unicode_char_to_utf8", "WRITE-UNICODE-CHAR-TO-UTF8", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_streams", "write_unicode_string_to_utf8", "WRITE-UNICODE-STRING-TO-UTF8", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_streams", "write_unicode_string_to_utf8_line", "WRITE-UNICODE-STRING-TO-UTF8-LINE", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_streams", "read_utf8_char", "READ-UTF8-CHAR", 0, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_streams", "read_utf8_char_helper", "READ-UTF8-CHAR-HELPER", 0, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_streams", "read_utf8_line", "READ-UTF8-LINE", 0, 4, false);
        return (SubLObject)unicode_streams.NIL;
    }
    
    public static SubLObject init_unicode_streams_file() {
        unicode_streams.$unicode_linefeed$ = SubLFiles.defconstant("UNICODE-LINEFEED", (SubLObject)unicode_streams.TEN_INTEGER);
        unicode_streams.$unicode_carriage_return$ = SubLFiles.defconstant("UNICODE-CARRIAGE-RETURN", (SubLObject)unicode_streams.THIRTEEN_INTEGER);
        unicode_streams.$dtp_utf8_stream$ = SubLFiles.defconstant("*DTP-UTF8-STREAM*", (SubLObject)unicode_streams.$sym0$UTF8_STREAM);
        return (SubLObject)unicode_streams.NIL;
    }
    
    public static SubLObject setup_unicode_streams_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), unicode_streams.$dtp_utf8_stream$.getGlobalValue(), Symbols.symbol_function((SubLObject)unicode_streams.$sym7$UTF8_STREAM_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)unicode_streams.$list8);
        Structures.def_csetf((SubLObject)unicode_streams.$sym9$UTF8_STREAM_STREAM, (SubLObject)unicode_streams.$sym10$_CSETF_UTF8_STREAM_STREAM);
        Structures.def_csetf((SubLObject)unicode_streams.$sym11$UTF8_STREAM_CACHE, (SubLObject)unicode_streams.$sym12$_CSETF_UTF8_STREAM_CACHE);
        Equality.identity((SubLObject)unicode_streams.$sym0$UTF8_STREAM);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), unicode_streams.$dtp_utf8_stream$.getGlobalValue(), Symbols.symbol_function((SubLObject)unicode_streams.$sym20$VISIT_DEFSTRUCT_OBJECT_UTF8_STREAM_METHOD));
        return (SubLObject)unicode_streams.NIL;
    }
    
    public void declareFunctions() {
        declare_unicode_streams_file();
    }
    
    public void initializeVariables() {
        init_unicode_streams_file();
    }
    
    public void runTopLevelForms() {
        setup_unicode_streams_file();
    }
    
    static {
        me = (SubLFile)new unicode_streams();
        unicode_streams.$unicode_linefeed$ = null;
        unicode_streams.$unicode_carriage_return$ = null;
        unicode_streams.$dtp_utf8_stream$ = null;
        $sym0$UTF8_STREAM = SubLObjectFactory.makeSymbol("UTF8-STREAM");
        $sym1$UTF8_STREAM_P = SubLObjectFactory.makeSymbol("UTF8-STREAM-P");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("CACHE"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STREAM"), (SubLObject)SubLObjectFactory.makeKeyword("CACHE"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UTF8-STREAM-STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("UTF8-STREAM-CACHE"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-UTF8-STREAM-STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-UTF8-STREAM-CACHE"));
        $sym6$PRINT_UTF8_STREAM = SubLObjectFactory.makeSymbol("PRINT-UTF8-STREAM");
        $sym7$UTF8_STREAM_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("UTF8-STREAM-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("UTF8-STREAM-P"));
        $sym9$UTF8_STREAM_STREAM = SubLObjectFactory.makeSymbol("UTF8-STREAM-STREAM");
        $sym10$_CSETF_UTF8_STREAM_STREAM = SubLObjectFactory.makeSymbol("_CSETF-UTF8-STREAM-STREAM");
        $sym11$UTF8_STREAM_CACHE = SubLObjectFactory.makeSymbol("UTF8-STREAM-CACHE");
        $sym12$_CSETF_UTF8_STREAM_CACHE = SubLObjectFactory.makeSymbol("_CSETF-UTF8-STREAM-CACHE");
        $kw13$STREAM = SubLObjectFactory.makeKeyword("STREAM");
        $kw14$CACHE = SubLObjectFactory.makeKeyword("CACHE");
        $str15$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw16$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym17$MAKE_UTF8_STREAM = SubLObjectFactory.makeSymbol("MAKE-UTF8-STREAM");
        $kw18$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw19$END = SubLObjectFactory.makeKeyword("END");
        $sym20$VISIT_DEFSTRUCT_OBJECT_UTF8_STREAM_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-UTF8-STREAM-METHOD");
        $str21$__utf8_stream__s_cache___s_ = SubLObjectFactory.makeString("#<utf8-stream ~s cache: ~s>");
        $kw22$CLOSED = SubLObjectFactory.makeKeyword("CLOSED");
        $str23$Invalid_utf8_stream___s__ = SubLObjectFactory.makeString("Invalid utf8 stream: ~s~%");
        $sym24$UNICODE_CHARACTER_P = SubLObjectFactory.makeSymbol("UNICODE-CHARACTER-P");
        $sym25$UNICODE_STRING_P = SubLObjectFactory.makeSymbol("UNICODE-STRING-P");
        $sym26$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $str27$Invalid_Unicode_character_in_Stre = SubLObjectFactory.makeString("Invalid Unicode character in Stream ~s, its first byte was ~x~%");
        $str28$Invalid_Unicode_character_in_Stre = SubLObjectFactory.makeString("Invalid Unicode character in Stream ~s, Stream EOF in the middle of unicode character, its first byte was ~x~%");
        $int29$256 = SubLObjectFactory.makeInteger(256);
        $str30$EOF_in_Unicode_stream___s__ = SubLObjectFactory.makeString("EOF in Unicode stream: ~s~%");
        $kw31$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym32$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $str33$Internal_Error_in_Unicode_stream_ = SubLObjectFactory.makeString("Internal Error in Unicode stream: ~s~%");
    }
    
    public static final class $utf8_stream_native extends SubLStructNative
    {
        public SubLObject $stream;
        public SubLObject $cache;
        private static final SubLStructDeclNative structDecl;
        
        public $utf8_stream_native() {
            this.$stream = (SubLObject)CommonSymbols.NIL;
            this.$cache = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$utf8_stream_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$stream;
        }
        
        public SubLObject getField3() {
            return this.$cache;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$stream = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$cache = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$utf8_stream_native.class, unicode_streams.$sym0$UTF8_STREAM, unicode_streams.$sym1$UTF8_STREAM_P, unicode_streams.$list2, unicode_streams.$list3, new String[] { "$stream", "$cache" }, unicode_streams.$list4, unicode_streams.$list5, unicode_streams.$sym6$PRINT_UTF8_STREAM);
        }
    }
    
    public static final class $utf8_stream_p$UnaryFunction extends UnaryFunction
    {
        public $utf8_stream_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("UTF8-STREAM-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return unicode_streams.utf8_stream_p(arg1);
        }
    }
}

/*

	Total time: 177 ms
	
*/