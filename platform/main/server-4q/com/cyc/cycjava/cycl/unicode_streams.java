package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile; 
 public final class unicode_streams extends SubLTranslatedFile {
    public static final SubLFile me = new unicode_streams();

    public static final String myName = "com.cyc.cycjava.cycl.unicode_streams";

    public static final String myFingerPrint = "14bf9cb315d3916ff5dceb5432c10726a6d202645bc60cf01952124ad17b49c2";

    // defconstant
    private static final SubLSymbol $unicode_linefeed$ = makeSymbol("UNICODE-LINEFEED");

    // defconstant
    private static final SubLSymbol $unicode_carriage_return$ = makeSymbol("UNICODE-CARRIAGE-RETURN");

    // defconstant
    public static final SubLSymbol $dtp_utf8_stream$ = makeSymbol("*DTP-UTF8-STREAM*");

    // Internal Constants
    public static final SubLSymbol UTF8_STREAM = makeSymbol("UTF8-STREAM");

    public static final SubLSymbol UTF8_STREAM_P = makeSymbol("UTF8-STREAM-P");

    public static final SubLList $list2 = list(makeSymbol("STREAM"), makeSymbol("CACHE"));

    public static final SubLList $list3 = list(makeKeyword("STREAM"), makeKeyword("CACHE"));

    public static final SubLList $list4 = list(makeSymbol("UTF8-STREAM-STREAM"), makeSymbol("UTF8-STREAM-CACHE"));

    public static final SubLList $list5 = list(makeSymbol("_CSETF-UTF8-STREAM-STREAM"), makeSymbol("_CSETF-UTF8-STREAM-CACHE"));

    public static final SubLSymbol PRINT_UTF8_STREAM = makeSymbol("PRINT-UTF8-STREAM");

    public static final SubLSymbol UTF8_STREAM_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("UTF8-STREAM-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("UTF8-STREAM-P"));

    private static final SubLSymbol UTF8_STREAM_STREAM = makeSymbol("UTF8-STREAM-STREAM");

    private static final SubLSymbol _CSETF_UTF8_STREAM_STREAM = makeSymbol("_CSETF-UTF8-STREAM-STREAM");

    private static final SubLSymbol UTF8_STREAM_CACHE = makeSymbol("UTF8-STREAM-CACHE");

    private static final SubLSymbol _CSETF_UTF8_STREAM_CACHE = makeSymbol("_CSETF-UTF8-STREAM-CACHE");





    private static final SubLString $str15$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_UTF8_STREAM = makeSymbol("MAKE-UTF8-STREAM");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_UTF8_STREAM_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-UTF8-STREAM-METHOD");

    private static final SubLString $str21$__utf8_stream__s_cache___s_ = makeString("#<utf8-stream ~s cache: ~s>");



    private static final SubLString $str23$Invalid_utf8_stream___s__ = makeString("Invalid utf8 stream: ~s~%");

    private static final SubLSymbol UNICODE_CHARACTER_P = makeSymbol("UNICODE-CHARACTER-P");

    private static final SubLSymbol UNICODE_STRING_P = makeSymbol("UNICODE-STRING-P");



    private static final SubLString $str27$Invalid_Unicode_character_in_Stre = makeString("Invalid Unicode character in Stream ~s, its first byte was ~x~%");

    private static final SubLString $str28$Invalid_Unicode_character_in_Stre = makeString("Invalid Unicode character in Stream ~s, Stream EOF in the middle of unicode character, its first byte was ~x~%");



    private static final SubLString $str30$EOF_in_Unicode_stream___s__ = makeString("EOF in Unicode stream: ~s~%");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLString $str33$Internal_Error_in_Unicode_stream_ = makeString("Internal Error in Unicode stream: ~s~%");

    public static SubLObject utf8_stream_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_utf8_stream(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject utf8_stream_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$utf8_stream_native.class ? T : NIL;
    }

    public static SubLObject utf8_stream_stream(final SubLObject v_object) {
        assert NIL != utf8_stream_p(v_object) : "unicode_streams.utf8_stream_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject utf8_stream_cache(final SubLObject v_object) {
        assert NIL != utf8_stream_p(v_object) : "unicode_streams.utf8_stream_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_utf8_stream_stream(final SubLObject v_object, final SubLObject value) {
        assert NIL != utf8_stream_p(v_object) : "unicode_streams.utf8_stream_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_utf8_stream_cache(final SubLObject v_object, final SubLObject value) {
        assert NIL != utf8_stream_p(v_object) : "unicode_streams.utf8_stream_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_utf8_stream(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $utf8_stream_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($STREAM)) {
                _csetf_utf8_stream_stream(v_new, current_value);
            } else
                if (pcase_var.eql($CACHE)) {
                    _csetf_utf8_stream_cache(v_new, current_value);
                } else {
                    Errors.error($str15$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_utf8_stream(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_UTF8_STREAM, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $STREAM, utf8_stream_stream(obj));
        funcall(visitor_fn, obj, $SLOT, $CACHE, utf8_stream_cache(obj));
        funcall(visitor_fn, obj, $END, MAKE_UTF8_STREAM, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_utf8_stream_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_utf8_stream(obj, visitor_fn);
    }

    public static SubLObject utf8_stream_create(final SubLObject stream) {
        final SubLObject utf8_stream_obj = make_utf8_stream(UNPROVIDED);
        _csetf_utf8_stream_stream(utf8_stream_obj, stream);
        _csetf_utf8_stream_cache(utf8_stream_obj, NIL);
        return utf8_stream_obj;
    }

    public static SubLObject print_utf8_stream(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str21$__utf8_stream__s_cache___s_, utf8_stream_stream(v_object), utf8_stream_cache(v_object));
        return v_object;
    }

    public static SubLObject open_utf8(final SubLObject filename, final SubLObject direction) {
        final SubLObject stream = compatibility.open_binary(filename, direction);
        if (NIL == stream) {
            return NIL;
        }
        return utf8_stream_create(stream);
    }

    public static SubLObject close_utf8(final SubLObject stream) {
        if (NIL == utf8_stream_p(stream)) {
            return NIL;
        }
        final SubLObject utf8_stream = utf8_stream_stream(stream);
        if (NIL != utf8_stream) {
            close(utf8_stream, UNPROVIDED);
            _csetf_utf8_stream_stream(stream, NIL);
        }
        return $CLOSED;
    }

    public static SubLObject write_unicode_char_to_utf8(final SubLObject unicode_character, SubLObject ustream) {
        if (ustream == UNPROVIDED) {
            ustream = utf8_stream_create(StreamsLow.$standard_output$.getDynamicValue());
        }
        if (NIL == utf8_stream_p(ustream)) {
            Errors.error($str23$Invalid_utf8_stream___s__, ustream);
        }
        assert NIL != unicode_strings.unicode_character_p(unicode_character) : "unicode_strings.unicode_character_p(unicode_character) " + "CommonSymbols.NIL != unicode_strings.unicode_character_p(unicode_character) " + unicode_character;
        final SubLObject vect = unicode_strings.to_utf8_vector(unicode_character);
        final SubLObject stream = utf8_stream_stream(ustream);
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = length(vect), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            write_byte(aref(vect, i), stream);
        }
        return unicode_character;
    }

    public static SubLObject write_unicode_string_to_utf8(final SubLObject ucode_string, SubLObject ustream, SubLObject start, SubLObject end) {
        if (ustream == UNPROVIDED) {
            ustream = utf8_stream_create(StreamsLow.$standard_output$.getDynamicValue());
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if (NIL == utf8_stream_p(ustream)) {
            Errors.error($str23$Invalid_utf8_stream___s__, ustream);
        }
        assert NIL != unicode_strings.unicode_string_p(ucode_string) : "unicode_strings.unicode_string_p(ucode_string) " + "CommonSymbols.NIL != unicode_strings.unicode_string_p(ucode_string) " + ucode_string;
        if (NIL == end) {
            end = subtract(length(unicode_strings.unicode_string_vect(ucode_string)), ONE_INTEGER);
        }
        assert NIL != integerp(end) : "Types.integerp(end) " + "CommonSymbols.NIL != Types.integerp(end) " + end;
        assert NIL != integerp(start) : "Types.integerp(start) " + "CommonSymbols.NIL != Types.integerp(start) " + start;
        final SubLObject stream = utf8_stream_stream(ustream);
        final SubLObject ucode_vector = unicode_strings.unicode_string_vect(ucode_string);
        final SubLObject utf8_vector = unicode_strings.unicode_vector_to_utf8_vector(ucode_vector, start, end);
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = length(utf8_vector), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            write_byte(aref(utf8_vector, i), stream);
        }
        return ucode_string;
    }

    public static SubLObject write_unicode_string_to_utf8_line(final SubLObject ucode_string, SubLObject ustream, SubLObject start, SubLObject end) {
        if (ustream == UNPROVIDED) {
            ustream = utf8_stream_create(StreamsLow.$standard_output$.getDynamicValue());
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if (NIL == utf8_stream_p(ustream)) {
            Errors.error($str23$Invalid_utf8_stream___s__, ustream);
        }
        write_unicode_string_to_utf8(ucode_string, ustream, start, end);
        write_byte($unicode_linefeed$.getGlobalValue(), utf8_stream_stream(ustream));
        return ucode_string;
    }

    public static SubLObject read_utf8_char(SubLObject ustream, SubLObject eof_error_p, SubLObject eof_value, SubLObject recursive_p) {
        if (ustream == UNPROVIDED) {
            ustream = utf8_stream_create(StreamsLow.$standard_input$.getDynamicValue());
        }
        if (eof_error_p == UNPROVIDED) {
            eof_error_p = T;
        }
        if (eof_value == UNPROVIDED) {
            eof_value = NIL;
        }
        if (recursive_p == UNPROVIDED) {
            recursive_p = NIL;
        }
        final SubLObject val = read_utf8_char_helper(ustream, eof_error_p, eof_value, recursive_p);
        if ((NIL == eof_error_p) && eof_value.equal(val)) {
            return eof_value;
        }
        return unicode_strings.unicode_char_create(val);
    }

    public static SubLObject read_utf8_char_helper(SubLObject ustream, SubLObject eof_error_p, SubLObject eof_value, SubLObject recursive_p) {
        if (ustream == UNPROVIDED) {
            ustream = utf8_stream_create(StreamsLow.$standard_input$.getDynamicValue());
        }
        if (eof_error_p == UNPROVIDED) {
            eof_error_p = T;
        }
        if (eof_value == UNPROVIDED) {
            eof_value = NIL;
        }
        if (recursive_p == UNPROVIDED) {
            recursive_p = NIL;
        }
        if (NIL == utf8_stream_p(ustream)) {
            Errors.error($str23$Invalid_utf8_stream___s__, ustream);
        }
        final SubLObject stream = utf8_stream_stream(ustream);
        final SubLObject v_char = utf8_stream_cache(ustream);
        if (NIL != v_char) {
            _csetf_utf8_stream_cache(ustream, NIL);
            return v_char;
        }
        final SubLObject first = read_byte(stream, eof_error_p, eof_value);
        if (eof_value.equal(first)) {
            return first;
        }
        final SubLObject len = unicode_strings.length_utf8_from_first_byte(first);
        if (len.isNegative()) {
            Errors.error($str27$Invalid_Unicode_character_in_Stre, stream, first);
            return eof_value;
        }
        if (len.eql(ONE_INTEGER)) {
            return first;
        }
        final SubLObject vect = make_vector(len, UNPROVIDED);
        set_aref(vect, ZERO_INTEGER, first);
        SubLObject cdotimes_end_var;
        SubLObject i;
        SubLObject v_byte;
        for (cdotimes_end_var = subtract(len, ONE_INTEGER), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            v_byte = read_byte(stream, eof_error_p, eof_value);
            if (eof_value.equal(v_byte) && (NIL != eof_error_p)) {
                Errors.error($str28$Invalid_Unicode_character_in_Stre, stream, first);
                return eof_value;
            }
            set_aref(vect, add(i, ONE_INTEGER), v_byte);
        }
        final SubLObject v_char2 = unicode_strings.get_unicode_char_at_offset(vect, ZERO_INTEGER);
        if (v_char2.isNegative()) {
            Errors.error($str27$Invalid_Unicode_character_in_Stre, stream, first);
        }
        return v_char2;
    }

    public static SubLObject read_utf8_line(SubLObject ustream, SubLObject eof_error_p, SubLObject eof_value, SubLObject recursive_p) {
        if (ustream == UNPROVIDED) {
            ustream = utf8_stream_create(StreamsLow.$standard_input$.getDynamicValue());
        }
        if (eof_error_p == UNPROVIDED) {
            eof_error_p = T;
        }
        if (eof_value == UNPROVIDED) {
            eof_value = NIL;
        }
        if (recursive_p == UNPROVIDED) {
            recursive_p = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == utf8_stream_p(ustream)) {
            Errors.error($str23$Invalid_utf8_stream___s__, ustream);
        }
        SubLObject output_buffer = make_vector($int$256, UNPROVIDED);
        SubLObject offset = ZERO_INTEGER;
        SubLObject v_char;
        SubLObject newlen;
        SubLObject new_o_buffer;
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (v_char = eof_value, v_char = read_utf8_char_helper(ustream, eof_error_p, eof_value, recursive_p); ((!v_char.equal(eof_value)) && (NIL != numNE(v_char, $unicode_linefeed$.getGlobalValue()))) && (NIL != numNE(v_char, $unicode_carriage_return$.getGlobalValue())); v_char = read_utf8_char_helper(ustream, eof_error_p, eof_value, recursive_p)) {
            if (offset.numGE(length(output_buffer))) {
                newlen = add(length(output_buffer), $int$256);
                new_o_buffer = make_vector(newlen, UNPROVIDED);
                for (cdotimes_end_var = length(output_buffer), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                    set_aref(new_o_buffer, i, aref(output_buffer, i));
                }
                output_buffer = new_o_buffer;
            }
            set_aref(output_buffer, offset, v_char);
            offset = add(offset, ONE_INTEGER);
        }
        if (v_char.equal(eof_value)) {
            if (offset.isZero()) {
                if (NIL == eof_error_p) {
                    return eof_value;
                }
                Errors.error($str30$EOF_in_Unicode_stream___s__, ustream);
            }
        } else
            if (v_char.numE($unicode_linefeed$.getGlobalValue())) {
                SubLObject ignore_errors_tag = NIL;
                try {
                    thread.throwStack.push($IGNORE_ERRORS_TARGET);
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                        try {
                            final SubLObject next_char = read_utf8_char_helper(ustream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            if (!next_char.numE($unicode_carriage_return$.getGlobalValue())) {
                                _csetf_utf8_stream_cache(ustream, next_char);
                            }
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                } finally {
                    thread.throwStack.pop();
                }
            } else
                if (v_char.numE($unicode_carriage_return$.getGlobalValue())) {
                    SubLObject ignore_errors_tag = NIL;
                    try {
                        thread.throwStack.push($IGNORE_ERRORS_TARGET);
                        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                            try {
                                final SubLObject next_char = read_utf8_char_helper(ustream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                if (!next_char.numE($unicode_linefeed$.getGlobalValue())) {
                                    _csetf_utf8_stream_cache(ustream, next_char);
                                }
                            } catch (final Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    } catch (final Throwable ccatch_env_var) {
                        ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                    } finally {
                        thread.throwStack.pop();
                    }
                } else {
                    Errors.error($str33$Internal_Error_in_Unicode_stream_, ustream);
                }


        return unicode_strings.unicode_string_create(subseq(output_buffer, ZERO_INTEGER, offset));
    }

    public static SubLObject declare_unicode_streams_file() {
        declareFunction(me, "utf8_stream_print_function_trampoline", "UTF8-STREAM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "utf8_stream_p", "UTF8-STREAM-P", 1, 0, false);
        new unicode_streams.$utf8_stream_p$UnaryFunction();
        declareFunction(me, "utf8_stream_stream", "UTF8-STREAM-STREAM", 1, 0, false);
        declareFunction(me, "utf8_stream_cache", "UTF8-STREAM-CACHE", 1, 0, false);
        declareFunction(me, "_csetf_utf8_stream_stream", "_CSETF-UTF8-STREAM-STREAM", 2, 0, false);
        declareFunction(me, "_csetf_utf8_stream_cache", "_CSETF-UTF8-STREAM-CACHE", 2, 0, false);
        declareFunction(me, "make_utf8_stream", "MAKE-UTF8-STREAM", 0, 1, false);
        declareFunction(me, "visit_defstruct_utf8_stream", "VISIT-DEFSTRUCT-UTF8-STREAM", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_utf8_stream_method", "VISIT-DEFSTRUCT-OBJECT-UTF8-STREAM-METHOD", 2, 0, false);
        declareFunction(me, "utf8_stream_create", "UTF8-STREAM-CREATE", 1, 0, false);
        declareFunction(me, "print_utf8_stream", "PRINT-UTF8-STREAM", 3, 0, false);
        declareFunction(me, "open_utf8", "OPEN-UTF8", 2, 0, false);
        declareFunction(me, "close_utf8", "CLOSE-UTF8", 1, 0, false);
        declareFunction(me, "write_unicode_char_to_utf8", "WRITE-UNICODE-CHAR-TO-UTF8", 1, 1, false);
        declareFunction(me, "write_unicode_string_to_utf8", "WRITE-UNICODE-STRING-TO-UTF8", 1, 3, false);
        declareFunction(me, "write_unicode_string_to_utf8_line", "WRITE-UNICODE-STRING-TO-UTF8-LINE", 1, 3, false);
        declareFunction(me, "read_utf8_char", "READ-UTF8-CHAR", 0, 4, false);
        declareFunction(me, "read_utf8_char_helper", "READ-UTF8-CHAR-HELPER", 0, 4, false);
        declareFunction(me, "read_utf8_line", "READ-UTF8-LINE", 0, 4, false);
        return NIL;
    }

    public static SubLObject init_unicode_streams_file() {
        defconstant("UNICODE-LINEFEED", TEN_INTEGER);
        defconstant("UNICODE-CARRIAGE-RETURN", THIRTEEN_INTEGER);
        defconstant("*DTP-UTF8-STREAM*", UTF8_STREAM);
        return NIL;
    }

    public static SubLObject setup_unicode_streams_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_utf8_stream$.getGlobalValue(), symbol_function(UTF8_STREAM_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(UTF8_STREAM_STREAM, _CSETF_UTF8_STREAM_STREAM);
        def_csetf(UTF8_STREAM_CACHE, _CSETF_UTF8_STREAM_CACHE);
        identity(UTF8_STREAM);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_utf8_stream$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_UTF8_STREAM_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_unicode_streams_file();
    }

    @Override
    public void initializeVariables() {
        init_unicode_streams_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_unicode_streams_file();
    }

    

    public static final class $utf8_stream_native extends SubLStructNative {
        public SubLObject $stream;

        public SubLObject $cache;

        private static final SubLStructDeclNative structDecl;

        private $utf8_stream_native() {
            this.$stream = Lisp.NIL;
            this.$cache = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$stream;
        }

        @Override
        public SubLObject getField3() {
            return this.$cache;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$stream = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$cache = value;
        }

        static {
            structDecl = makeStructDeclNative($utf8_stream_native.class, UTF8_STREAM, UTF8_STREAM_P, $list2, $list3, new String[]{ "$stream", "$cache" }, $list4, $list5, PRINT_UTF8_STREAM);
        }
    }

    public static final class $utf8_stream_p$UnaryFunction extends UnaryFunction {
        public $utf8_stream_p$UnaryFunction() {
            super(extractFunctionNamed("UTF8-STREAM-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return utf8_stream_p(arg1);
        }
    }
}

/**
 * Total time: 177 ms
 */
