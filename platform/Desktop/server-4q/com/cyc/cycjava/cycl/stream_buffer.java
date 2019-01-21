package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class stream_buffer extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.stream_buffer";
    public static final String myFingerPrint = "eeb192c7e04da8ed5f92b3ec77fef433282a90c0208014e3b99c34063371d24c";
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 3689L)
    public static SubLSymbol $dtp_string_buffer$;
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 9191L)
    public static SubLSymbol $dtp_stream_buffer$;
    private static final SubLString $str0$Improper_index_bounds__S__S;
    private static final SubLSymbol $sym1$STRING_BUFFER;
    private static final SubLSymbol $sym2$STRING_BUFFER_P;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$PRINT_STRING_BUFFER;
    private static final SubLSymbol $sym8$STRING_BUFFER_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$STRBUF_STRING;
    private static final SubLSymbol $sym11$_CSETF_STRBUF_STRING;
    private static final SubLSymbol $sym12$STRBUF_POSITION;
    private static final SubLSymbol $sym13$_CSETF_STRBUF_POSITION;
    private static final SubLSymbol $kw14$STRING;
    private static final SubLSymbol $kw15$POSITION;
    private static final SubLString $str16$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw17$BEGIN;
    private static final SubLSymbol $sym18$MAKE_STRING_BUFFER;
    private static final SubLSymbol $kw19$SLOT;
    private static final SubLSymbol $kw20$END;
    private static final SubLSymbol $sym21$VISIT_DEFSTRUCT_OBJECT_STRING_BUFFER_METHOD;
    private static final SubLString $str22$__STRING_BUFFER_capacity__S_posit;
    private static final SubLInteger $int23$64;
    private static final SubLSymbol $sym24$NON_NEGATIVE_INTEGER_P;
    private static final SubLSymbol $kw25$DESTROYED;
    private static final SubLList $list26;
    private static final SubLSymbol $sym27$CLET;
    private static final SubLSymbol $sym28$STRING_BUFFER_STRING;
    private static final SubLSymbol $sym29$STRING_BUFFER_POSITION;
    private static final SubLSymbol $sym30$STREAM_BUFFER;
    private static final SubLSymbol $sym31$STREAM_BUFFER_P;
    private static final SubLList $list32;
    private static final SubLList $list33;
    private static final SubLList $list34;
    private static final SubLList $list35;
    private static final SubLSymbol $sym36$PRINT_STREAM_BUFFER;
    private static final SubLSymbol $sym37$STREAM_BUFFER_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list38;
    private static final SubLSymbol $sym39$STRM_BUF_STREAM;
    private static final SubLSymbol $sym40$_CSETF_STRM_BUF_STREAM;
    private static final SubLSymbol $sym41$STRM_BUF_BUFFER;
    private static final SubLSymbol $sym42$_CSETF_STRM_BUF_BUFFER;
    private static final SubLSymbol $sym43$STRM_BUF_END;
    private static final SubLSymbol $sym44$_CSETF_STRM_BUF_END;
    private static final SubLSymbol $sym45$STRM_BUF_POSITION;
    private static final SubLSymbol $sym46$_CSETF_STRM_BUF_POSITION;
    private static final SubLSymbol $kw47$STREAM;
    private static final SubLSymbol $kw48$BUFFER;
    private static final SubLSymbol $sym49$MAKE_STREAM_BUFFER;
    private static final SubLSymbol $sym50$VISIT_DEFSTRUCT_OBJECT_STREAM_BUFFER_METHOD;
    private static final SubLString $str51$__STREAM_BUFFER_block_size__S_for;
    private static final SubLInteger $int52$1024;
    private static final SubLSymbol $sym53$STREAMP;
    private static final SubLSymbol $sym54$POSITIVE_INTEGER_P;
    private static final SubLString $str55$EOF_reached_on__S;
    private static final SubLList $list56;
    private static final SubLList $list57;
    private static final SubLSymbol $kw58$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw59$BLOCK_SIZE;
    private static final SubLSymbol $kw60$PROGRESS_MESSAGE;
    private static final SubLSymbol $kw61$DONE;
    private static final SubLSymbol $sym62$MESSAGE_VAR;
    private static final SubLSymbol $sym63$STREAM_VAR;
    private static final SubLSymbol $sym64$SOFAR;
    private static final SubLSymbol $sym65$TOTAL;
    private static final SubLSymbol $sym66$WITH_PRIVATE_TEXT_FILE;
    private static final SubLList $list67;
    private static final SubLSymbol $sym68$PWHEN;
    private static final SubLList $list69;
    private static final SubLSymbol $sym70$FILE_LENGTH;
    private static final SubLSymbol $sym71$NOTING_PERCENT_PROGRESS;
    private static final SubLSymbol $sym72$DO_STREAM_LINES_BUFFERED;
    private static final SubLSymbol $sym73$NOTE_PERCENT_PROGRESS;
    private static final SubLSymbol $sym74$CSETQ;
    private static final SubLSymbol $sym75$FILE_POSITION;
    private static final SubLSymbol $sym76$STREAM_VAR;
    private static final SubLList $list77;
    private static final SubLList $list78;
    private static final SubLSymbol $sym79$DONE_VAR;
    private static final SubLSymbol $sym80$STREAM_BUFFER_VAR;
    private static final SubLSymbol $sym81$CMULTIPLE_VALUE_BIND;
    private static final SubLSymbol $sym82$DO_STREAM_LINES_BUFFERED_INITIALIZE;
    private static final SubLSymbol $sym83$CUNWIND_PROTECT;
    private static final SubLSymbol $sym84$WHILE;
    private static final SubLSymbol $sym85$CNOT;
    private static final SubLSymbol $sym86$PIF;
    private static final SubLSymbol $sym87$DO_STREAM_LINES_BUFFERED_NEXT;
    private static final SubLSymbol $sym88$PROGN;
    private static final SubLList $list89;
    private static final SubLSymbol $sym90$DO_STREAM_LINES_BUFFERED_FINALIZE;
    private static final SubLSymbol $sym91$STREAM_LINE_ITERATOR_DONE_;
    private static final SubLSymbol $sym92$STREAM_LINE_ITERATOR_NEXT;
    private static final SubLSymbol $sym93$STREAM_LINE_ITERATOR_FINALIZE;
    private static final SubLList $list94;
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 1214L)
    public static SubLObject stream_buffer_read_sequence(final SubLObject vector, final SubLObject stream, SubLObject start, SubLObject end) {
        if (start == stream_buffer.UNPROVIDED) {
            start = (SubLObject)stream_buffer.ZERO_INTEGER;
        }
        if (end == stream_buffer.UNPROVIDED) {
            end = (SubLObject)stream_buffer.NIL;
        }
        if (!vector.isVector()) {
            return streams_high.read_sequence(vector, stream, start, end);
        }
        return read_text_into_vector(vector, stream, start, end);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 1884L)
    public static SubLObject string_buffer_replace(final SubLObject string, final SubLObject vector, SubLObject start1, SubLObject end1, SubLObject start2, SubLObject end2) {
        if (start1 == stream_buffer.UNPROVIDED) {
            start1 = (SubLObject)stream_buffer.ZERO_INTEGER;
        }
        if (end1 == stream_buffer.UNPROVIDED) {
            end1 = (SubLObject)stream_buffer.NIL;
        }
        if (start2 == stream_buffer.UNPROVIDED) {
            start2 = (SubLObject)stream_buffer.ZERO_INTEGER;
        }
        if (end2 == stream_buffer.UNPROVIDED) {
            end2 = (SubLObject)stream_buffer.NIL;
        }
        if (!string.isString() || !vector.isVector()) {
            return Sequences.replace(string, vector, start1, end1, start2, end2);
        }
        return Sequences.replace(string, vector, start1, end1, start2, end2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 2336L)
    public static SubLObject read_text_into_vector(final SubLObject vector, final SubLObject stream, SubLObject start, SubLObject end) {
        if (start == stream_buffer.UNPROVIDED) {
            start = (SubLObject)stream_buffer.ZERO_INTEGER;
        }
        if (end == stream_buffer.UNPROVIDED) {
            end = (SubLObject)stream_buffer.NIL;
        }
        if (stream_buffer.NIL == end) {
            end = Sequences.length(vector);
        }
        SubLObject index = start;
        SubLObject v_char = (SubLObject)stream_buffer.NIL;
        SubLObject doneP = (SubLObject)stream_buffer.NIL;
        while (stream_buffer.NIL == doneP && index.numL(end)) {
            v_char = streams_high.read_char(stream, (SubLObject)stream_buffer.NIL, (SubLObject)stream_buffer.NIL, (SubLObject)stream_buffer.UNPROVIDED);
            if (stream_buffer.NIL == v_char) {
                doneP = (SubLObject)stream_buffer.T;
            }
            else {
                Vectors.set_aref(vector, index, v_char);
                index = Numbers.add(index, (SubLObject)stream_buffer.ONE_INTEGER);
            }
        }
        return index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 2792L)
    public static SubLObject replace_string_from_vector(final SubLObject string, final SubLObject vector, SubLObject start1, SubLObject end1, SubLObject start2, SubLObject end2) {
        if (start1 == stream_buffer.UNPROVIDED) {
            start1 = (SubLObject)stream_buffer.ZERO_INTEGER;
        }
        if (end1 == stream_buffer.UNPROVIDED) {
            end1 = (SubLObject)stream_buffer.NIL;
        }
        if (start2 == stream_buffer.UNPROVIDED) {
            start2 = (SubLObject)stream_buffer.ZERO_INTEGER;
        }
        if (end2 == stream_buffer.UNPROVIDED) {
            end2 = (SubLObject)stream_buffer.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (stream_buffer.NIL == end1) {
            end1 = Sequences.length(string);
        }
        if (stream_buffer.NIL == end2) {
            end2 = Sequences.length(vector);
        }
        if (stream_buffer.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !start1.numLE(end1)) {
            Errors.error((SubLObject)stream_buffer.$str0$Improper_index_bounds__S__S, start1, end1);
        }
        if (stream_buffer.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !start2.numLE(end2)) {
            Errors.error((SubLObject)stream_buffer.$str0$Improper_index_bounds__S__S, start2, end2);
        }
        SubLObject index1 = start1;
        SubLObject index2 = start2;
        SubLObject v_char = (SubLObject)stream_buffer.NIL;
        while (index1.numL(end1) && index2.numL(end2)) {
            v_char = Vectors.aref(vector, index2);
            Strings.set_char(string, index1, v_char);
            index1 = Numbers.add(index1, (SubLObject)stream_buffer.ONE_INTEGER);
            index2 = Numbers.add(index2, (SubLObject)stream_buffer.ONE_INTEGER);
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 3689L)
    public static SubLObject string_buffer_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_string_buffer(v_object, stream, (SubLObject)stream_buffer.ZERO_INTEGER);
        return (SubLObject)stream_buffer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 3689L)
    public static SubLObject string_buffer_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $string_buffer_native.class) ? stream_buffer.T : stream_buffer.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 3689L)
    public static SubLObject strbuf_string(final SubLObject v_object) {
        assert stream_buffer.NIL != string_buffer_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 3689L)
    public static SubLObject strbuf_position(final SubLObject v_object) {
        assert stream_buffer.NIL != string_buffer_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 3689L)
    public static SubLObject _csetf_strbuf_string(final SubLObject v_object, final SubLObject value) {
        assert stream_buffer.NIL != string_buffer_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 3689L)
    public static SubLObject _csetf_strbuf_position(final SubLObject v_object, final SubLObject value) {
        assert stream_buffer.NIL != string_buffer_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 3689L)
    public static SubLObject make_string_buffer(SubLObject arglist) {
        if (arglist == stream_buffer.UNPROVIDED) {
            arglist = (SubLObject)stream_buffer.NIL;
        }
        final SubLObject v_new = (SubLObject)new $string_buffer_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)stream_buffer.NIL, next = arglist; stream_buffer.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)stream_buffer.$kw14$STRING)) {
                _csetf_strbuf_string(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)stream_buffer.$kw15$POSITION)) {
                _csetf_strbuf_position(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)stream_buffer.$str16$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 3689L)
    public static SubLObject visit_defstruct_string_buffer(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)stream_buffer.$kw17$BEGIN, (SubLObject)stream_buffer.$sym18$MAKE_STRING_BUFFER, (SubLObject)stream_buffer.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)stream_buffer.$kw19$SLOT, (SubLObject)stream_buffer.$kw14$STRING, strbuf_string(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)stream_buffer.$kw19$SLOT, (SubLObject)stream_buffer.$kw15$POSITION, strbuf_position(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)stream_buffer.$kw20$END, (SubLObject)stream_buffer.$sym18$MAKE_STRING_BUFFER, (SubLObject)stream_buffer.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 3689L)
    public static SubLObject visit_defstruct_object_string_buffer_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_string_buffer(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 3810L)
    public static SubLObject print_string_buffer(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)stream_buffer.$str22$__STRING_BUFFER_capacity__S_posit, string_buffer_capacity(v_object), string_buffer_position(v_object));
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 4033L)
    public static SubLObject new_string_buffer(SubLObject initial_capacity) {
        if (initial_capacity == stream_buffer.UNPROVIDED) {
            initial_capacity = (SubLObject)stream_buffer.$int23$64;
        }
        assert stream_buffer.NIL != subl_promotions.non_negative_integer_p(initial_capacity) : initial_capacity;
        final SubLObject string_buffer = make_string_buffer((SubLObject)stream_buffer.UNPROVIDED);
        _csetf_strbuf_string(string_buffer, Strings.make_string(initial_capacity, (SubLObject)stream_buffer.UNPROVIDED));
        string_buffer_reset(string_buffer);
        return string_buffer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 4414L)
    public static SubLObject destroy_string_buffer(final SubLObject string_buffer) {
        assert stream_buffer.NIL != string_buffer_p(string_buffer) : string_buffer;
        _csetf_strbuf_string(string_buffer, (SubLObject)stream_buffer.NIL);
        _csetf_strbuf_position(string_buffer, (SubLObject)stream_buffer.$kw25$DESTROYED);
        return string_buffer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 4691L)
    public static SubLObject string_buffer_string(final SubLObject string_buffer) {
        return strbuf_string(string_buffer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 4919L)
    public static SubLObject string_buffer_position(final SubLObject string_buffer) {
        return strbuf_position(string_buffer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 5121L)
    public static SubLObject with_string_buffer(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)stream_buffer.$list26);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject buffer_string_var = (SubLObject)stream_buffer.NIL;
        SubLObject buffer_end_var = (SubLObject)stream_buffer.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)stream_buffer.$list26);
        buffer_string_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)stream_buffer.$list26);
        buffer_end_var = current.first();
        current = current.rest();
        if (stream_buffer.NIL == current) {
            current = temp;
            SubLObject string_buffer = (SubLObject)stream_buffer.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)stream_buffer.$list26);
            string_buffer = current.first();
            final SubLObject body;
            current = (body = current.rest());
            return (SubLObject)ConsesLow.listS((SubLObject)stream_buffer.$sym27$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(buffer_string_var, (SubLObject)ConsesLow.list((SubLObject)stream_buffer.$sym28$STRING_BUFFER_STRING, string_buffer)), (SubLObject)ConsesLow.list(buffer_end_var, (SubLObject)ConsesLow.list((SubLObject)stream_buffer.$sym29$STRING_BUFFER_POSITION, string_buffer))), ConsesLow.append(body, (SubLObject)stream_buffer.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)stream_buffer.$list26);
        return (SubLObject)stream_buffer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 5472L)
    public static SubLObject string_buffer_capacity(final SubLObject string_buffer) {
        return Sequences.length(strbuf_string(string_buffer));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 5685L)
    public static SubLObject string_buffer_write(final SubLObject string_buffer, SubLObject stream) {
        if (stream == stream_buffer.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        streams_high.write_string(strbuf_string(string_buffer), stream, (SubLObject)stream_buffer.ZERO_INTEGER, strbuf_position(string_buffer));
        return string_buffer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 5982L)
    public static SubLObject string_buffer_read(final SubLObject string_buffer, SubLObject eof_error_p, SubLObject eof_value, SubLObject start) {
        if (eof_error_p == stream_buffer.UNPROVIDED) {
            eof_error_p = (SubLObject)stream_buffer.NIL;
        }
        if (eof_value == stream_buffer.UNPROVIDED) {
            eof_value = (SubLObject)stream_buffer.NIL;
        }
        if (start == stream_buffer.UNPROVIDED) {
            start = (SubLObject)stream_buffer.ZERO_INTEGER;
        }
        final SubLObject string = string_buffer_string(string_buffer);
        final SubLObject end = string_buffer_position(string_buffer);
        return reader.read_from_string_ignoring_errors(string, eof_error_p, eof_value, start, end);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 6317L)
    public static SubLObject string_buffer_reset(final SubLObject string_buffer) {
        assert stream_buffer.NIL != string_buffer_p(string_buffer) : string_buffer;
        _csetf_strbuf_position(string_buffer, (SubLObject)stream_buffer.ZERO_INTEGER);
        return string_buffer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 6617L)
    public static SubLObject string_buffer_add(final SubLObject string_buffer, final SubLObject v_char) {
        SubLObject string = strbuf_string(string_buffer);
        SubLObject current_capacity = Sequences.length(string);
        final SubLObject current_position = strbuf_position(string_buffer);
        if (current_capacity.numE(current_position)) {
            final SubLObject larger_capacity = Numbers.max((SubLObject)stream_buffer.$int23$64, Numbers.add(current_capacity, current_capacity));
            final SubLObject larger_string = Strings.make_string(larger_capacity, (SubLObject)stream_buffer.UNPROVIDED);
            Sequences.replace(larger_string, string, (SubLObject)stream_buffer.ZERO_INTEGER, current_position, (SubLObject)stream_buffer.ZERO_INTEGER, current_position);
            _csetf_strbuf_string(string_buffer, larger_string);
            string = larger_string;
            current_capacity = larger_capacity;
        }
        Strings.set_char(string, current_position, v_char);
        _csetf_strbuf_position(string_buffer, Numbers.add(strbuf_position(string_buffer), (SubLObject)stream_buffer.ONE_INTEGER));
        return string_buffer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 7505L)
    public static SubLObject string_buffer_add_sequence(final SubLObject string_buffer, final SubLObject sequence, SubLObject start, SubLObject end) {
        if (start == stream_buffer.UNPROVIDED) {
            start = (SubLObject)stream_buffer.ZERO_INTEGER;
        }
        if (end == stream_buffer.UNPROVIDED) {
            end = Sequences.length(sequence);
        }
        SubLObject string = strbuf_string(string_buffer);
        SubLObject current_capacity = Sequences.length(string);
        final SubLObject current_position = strbuf_position(string_buffer);
        final SubLObject added_size = Numbers.subtract(end, start);
        final SubLObject min_required_capacity;
        final SubLObject eventual_position = min_required_capacity = Numbers.add(current_position, added_size);
        if (!min_required_capacity.numLE(current_capacity)) {
            SubLObject larger_capacity;
            for (larger_capacity = Numbers.max((SubLObject)stream_buffer.$int23$64, current_capacity); !min_required_capacity.numLE(larger_capacity); larger_capacity = Numbers.add(larger_capacity, larger_capacity)) {}
            final SubLObject larger_string = Strings.make_string(larger_capacity, (SubLObject)stream_buffer.UNPROVIDED);
            Sequences.replace(larger_string, string, (SubLObject)stream_buffer.ZERO_INTEGER, current_position, (SubLObject)stream_buffer.ZERO_INTEGER, current_position);
            _csetf_strbuf_string(string_buffer, larger_string);
            string = larger_string;
            current_capacity = larger_capacity;
        }
        string_buffer_replace(string, sequence, current_position, eventual_position, start, end);
        _csetf_strbuf_position(string_buffer, eventual_position);
        return string_buffer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 9191L)
    public static SubLObject stream_buffer_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_stream_buffer(v_object, stream, (SubLObject)stream_buffer.ZERO_INTEGER);
        return (SubLObject)stream_buffer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 9191L)
    public static SubLObject stream_buffer_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $stream_buffer_native.class) ? stream_buffer.T : stream_buffer.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 9191L)
    public static SubLObject strm_buf_stream(final SubLObject v_object) {
        assert stream_buffer.NIL != stream_buffer_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 9191L)
    public static SubLObject strm_buf_buffer(final SubLObject v_object) {
        assert stream_buffer.NIL != stream_buffer_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 9191L)
    public static SubLObject strm_buf_end(final SubLObject v_object) {
        assert stream_buffer.NIL != stream_buffer_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 9191L)
    public static SubLObject strm_buf_position(final SubLObject v_object) {
        assert stream_buffer.NIL != stream_buffer_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 9191L)
    public static SubLObject _csetf_strm_buf_stream(final SubLObject v_object, final SubLObject value) {
        assert stream_buffer.NIL != stream_buffer_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 9191L)
    public static SubLObject _csetf_strm_buf_buffer(final SubLObject v_object, final SubLObject value) {
        assert stream_buffer.NIL != stream_buffer_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 9191L)
    public static SubLObject _csetf_strm_buf_end(final SubLObject v_object, final SubLObject value) {
        assert stream_buffer.NIL != stream_buffer_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 9191L)
    public static SubLObject _csetf_strm_buf_position(final SubLObject v_object, final SubLObject value) {
        assert stream_buffer.NIL != stream_buffer_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 9191L)
    public static SubLObject make_stream_buffer(SubLObject arglist) {
        if (arglist == stream_buffer.UNPROVIDED) {
            arglist = (SubLObject)stream_buffer.NIL;
        }
        final SubLObject v_new = (SubLObject)new $stream_buffer_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)stream_buffer.NIL, next = arglist; stream_buffer.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)stream_buffer.$kw47$STREAM)) {
                _csetf_strm_buf_stream(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)stream_buffer.$kw48$BUFFER)) {
                _csetf_strm_buf_buffer(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)stream_buffer.$kw20$END)) {
                _csetf_strm_buf_end(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)stream_buffer.$kw15$POSITION)) {
                _csetf_strm_buf_position(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)stream_buffer.$str16$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 9191L)
    public static SubLObject visit_defstruct_stream_buffer(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)stream_buffer.$kw17$BEGIN, (SubLObject)stream_buffer.$sym49$MAKE_STREAM_BUFFER, (SubLObject)stream_buffer.FOUR_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)stream_buffer.$kw19$SLOT, (SubLObject)stream_buffer.$kw47$STREAM, strm_buf_stream(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)stream_buffer.$kw19$SLOT, (SubLObject)stream_buffer.$kw48$BUFFER, strm_buf_buffer(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)stream_buffer.$kw19$SLOT, (SubLObject)stream_buffer.$kw20$END, strm_buf_end(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)stream_buffer.$kw19$SLOT, (SubLObject)stream_buffer.$kw15$POSITION, strm_buf_position(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)stream_buffer.$kw20$END, (SubLObject)stream_buffer.$sym49$MAKE_STREAM_BUFFER, (SubLObject)stream_buffer.FOUR_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 9191L)
    public static SubLObject visit_defstruct_object_stream_buffer_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_stream_buffer(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 9329L)
    public static SubLObject print_stream_buffer(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLObject size = stream_buffer_block_size(v_object);
        final SubLObject stream_int = stream_buffer_stream(v_object);
        PrintLow.format(stream, (SubLObject)stream_buffer.$str51$__STREAM_BUFFER_block_size__S_for, size, stream_int);
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 9600L)
    public static SubLObject new_stream_buffer(final SubLObject stream, SubLObject block_size) {
        if (block_size == stream_buffer.UNPROVIDED) {
            block_size = (SubLObject)stream_buffer.$int52$1024;
        }
        assert stream_buffer.NIL != Types.streamp(stream) : stream;
        assert stream_buffer.NIL != subl_promotions.positive_integer_p(block_size) : block_size;
        final SubLObject v_stream_buffer = make_stream_buffer((SubLObject)stream_buffer.UNPROVIDED);
        _csetf_strm_buf_stream(v_stream_buffer, stream);
        _csetf_strm_buf_buffer(v_stream_buffer, Vectors.make_vector(block_size, (SubLObject)stream_buffer.NIL));
        stream_buffer_reset(v_stream_buffer);
        return v_stream_buffer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 10049L)
    public static SubLObject destroy_stream_buffer(final SubLObject v_stream_buffer) {
        assert stream_buffer.NIL != stream_buffer_p(v_stream_buffer) : v_stream_buffer;
        _csetf_strm_buf_stream(v_stream_buffer, (SubLObject)stream_buffer.$kw25$DESTROYED);
        _csetf_strm_buf_buffer(v_stream_buffer, (SubLObject)stream_buffer.NIL);
        return v_stream_buffer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 10328L)
    public static SubLObject stream_buffer_stream(final SubLObject v_stream_buffer) {
        return strm_buf_stream(v_stream_buffer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 10526L)
    public static SubLObject stream_buffer_block_size(final SubLObject v_stream_buffer) {
        return Sequences.length(strm_buf_buffer(v_stream_buffer));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 10739L)
    public static SubLObject stream_buffer_reset(final SubLObject v_stream_buffer) {
        assert stream_buffer.NIL != stream_buffer_p(v_stream_buffer) : v_stream_buffer;
        final SubLObject size = stream_buffer_block_size(v_stream_buffer);
        _csetf_strm_buf_end(v_stream_buffer, size);
        _csetf_strm_buf_position(v_stream_buffer, size);
        return v_stream_buffer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 11161L)
    public static SubLObject stream_buffer_load(final SubLObject v_stream_buffer) {
        final SubLObject stream = strm_buf_stream(v_stream_buffer);
        final SubLObject buffer = strm_buf_buffer(v_stream_buffer);
        final SubLObject size = Sequences.length(buffer);
        final SubLObject new_end = stream_buffer_read_sequence(buffer, stream, (SubLObject)stream_buffer.ZERO_INTEGER, size);
        _csetf_strm_buf_position(v_stream_buffer, (SubLObject)stream_buffer.ZERO_INTEGER);
        _csetf_strm_buf_end(v_stream_buffer, new_end);
        return new_end;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 11591L)
    public static SubLObject read_line_into_string_buffer(final SubLObject stream, SubLObject string_buffer, SubLObject eof_error_p, SubLObject eof_value) {
        if (string_buffer == stream_buffer.UNPROVIDED) {
            string_buffer = (SubLObject)stream_buffer.NIL;
        }
        if (eof_error_p == stream_buffer.UNPROVIDED) {
            eof_error_p = (SubLObject)stream_buffer.NIL;
        }
        if (eof_value == stream_buffer.UNPROVIDED) {
            eof_value = (SubLObject)stream_buffer.NIL;
        }
        if (stream_buffer.NIL == string_buffer) {
            string_buffer = new_string_buffer((SubLObject)stream_buffer.UNPROVIDED);
        }
        string_buffer_reset(string_buffer);
        SubLObject v_char;
        for (v_char = (SubLObject)stream_buffer.NIL, v_char = read_line_into_string_buffer_int(stream, string_buffer); stream_buffer.NIL != v_char && !v_char.eql((SubLObject)Characters.CHAR_newline); v_char = read_line_into_string_buffer_int(stream, string_buffer)) {}
        final SubLObject position = string_buffer_position(string_buffer);
        if (stream_buffer.NIL != v_char) {
            return string_buffer;
        }
        if (position.isPositive()) {
            return string_buffer;
        }
        if (stream_buffer.NIL == eof_error_p) {
            return eof_value;
        }
        return Errors.error((SubLObject)stream_buffer.$str55$EOF_reached_on__S, stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 12571L)
    public static SubLObject stream_buffer_read_line_into_string_buffer(final SubLObject v_stream_buffer, SubLObject string_buffer, SubLObject eof_error_p, SubLObject eof_value) {
        if (string_buffer == stream_buffer.UNPROVIDED) {
            string_buffer = (SubLObject)stream_buffer.NIL;
        }
        if (eof_error_p == stream_buffer.UNPROVIDED) {
            eof_error_p = (SubLObject)stream_buffer.NIL;
        }
        if (eof_value == stream_buffer.UNPROVIDED) {
            eof_value = (SubLObject)stream_buffer.NIL;
        }
        if (stream_buffer.NIL == string_buffer) {
            string_buffer = new_string_buffer((SubLObject)stream_buffer.UNPROVIDED);
        }
        string_buffer_reset(string_buffer);
        SubLObject v_char;
        for (v_char = (SubLObject)stream_buffer.NIL, v_char = stream_buffer_read_line_into_string_buffer_int(v_stream_buffer, string_buffer); stream_buffer.NIL != v_char && !v_char.eql((SubLObject)Characters.CHAR_newline); v_char = stream_buffer_read_line_into_string_buffer_int(v_stream_buffer, string_buffer)) {}
        final SubLObject position = string_buffer_position(string_buffer);
        if (stream_buffer.NIL != v_char) {
            return string_buffer;
        }
        if (position.isPositive()) {
            return string_buffer;
        }
        if (stream_buffer.NIL == eof_error_p) {
            return eof_value;
        }
        return Errors.error((SubLObject)stream_buffer.$str55$EOF_reached_on__S, stream_buffer_stream(v_stream_buffer));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 13697L)
    public static SubLObject read_line_into_string_buffer_int(final SubLObject stream, final SubLObject string_buffer) {
        final SubLObject v_char = streams_high.read_char(stream, (SubLObject)stream_buffer.NIL, (SubLObject)stream_buffer.NIL, (SubLObject)stream_buffer.UNPROVIDED);
        if (stream_buffer.NIL != v_char && !v_char.eql((SubLObject)Characters.CHAR_newline)) {
            string_buffer_add(string_buffer, v_char);
        }
        return v_char;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 14154L)
    public static SubLObject stream_buffer_read_line_into_string_buffer_int(final SubLObject v_stream_buffer, final SubLObject string_buffer) {
        final SubLObject buffer = strm_buf_buffer(v_stream_buffer);
        final SubLObject position = strm_buf_position(v_stream_buffer);
        final SubLObject end = strm_buf_end(v_stream_buffer);
        if (position.numE(end)) {
            final SubLObject capacity = Sequences.length(buffer);
            if (end.numL(capacity)) {
                return (SubLObject)stream_buffer.NIL;
            }
            stream_buffer_load(v_stream_buffer);
            return stream_buffer_read_line_into_string_buffer_int(v_stream_buffer, string_buffer);
        }
        else {
            final SubLObject newline_position = Sequences.position((SubLObject)Characters.CHAR_newline, buffer, Symbols.symbol_function((SubLObject)stream_buffer.EQ), Symbols.symbol_function((SubLObject)stream_buffer.IDENTITY), position, end);
            if (stream_buffer.NIL == newline_position) {
                string_buffer_add_sequence(string_buffer, buffer, position, end);
                _csetf_strm_buf_position(v_stream_buffer, end);
                return Vectors.aref(buffer, Numbers.subtract(end, (SubLObject)stream_buffer.ONE_INTEGER));
            }
            string_buffer_add_sequence(string_buffer, buffer, position, newline_position);
            _csetf_strm_buf_position(v_stream_buffer, Numbers.add((SubLObject)stream_buffer.ONE_INTEGER, newline_position));
            return (SubLObject)Characters.CHAR_newline;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 15658L)
    public static SubLObject do_file_lines_buffered(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)stream_buffer.$list56);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject line_buffer_var = (SubLObject)stream_buffer.NIL;
        SubLObject filename = (SubLObject)stream_buffer.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)stream_buffer.$list56);
        line_buffer_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)stream_buffer.$list56);
        filename = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)stream_buffer.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)stream_buffer.NIL;
        SubLObject current_$1 = (SubLObject)stream_buffer.NIL;
        while (stream_buffer.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)stream_buffer.$list56);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)stream_buffer.$list56);
            if (stream_buffer.NIL == conses_high.member(current_$1, (SubLObject)stream_buffer.$list57, (SubLObject)stream_buffer.UNPROVIDED, (SubLObject)stream_buffer.UNPROVIDED)) {
                bad = (SubLObject)stream_buffer.T;
            }
            if (current_$1 == stream_buffer.$kw58$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (stream_buffer.NIL != bad && stream_buffer.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)stream_buffer.$list56);
        }
        final SubLObject block_size_tail = cdestructuring_bind.property_list_member((SubLObject)stream_buffer.$kw59$BLOCK_SIZE, current);
        final SubLObject block_size = (SubLObject)((stream_buffer.NIL != block_size_tail) ? conses_high.cadr(block_size_tail) : stream_buffer.NIL);
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)stream_buffer.$kw60$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((stream_buffer.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : stream_buffer.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)stream_buffer.$kw61$DONE, current);
        final SubLObject done = (SubLObject)((stream_buffer.NIL != done_tail) ? conses_high.cadr(done_tail) : stream_buffer.NIL);
        final SubLObject body;
        current = (body = temp);
        if (stream_buffer.NIL != progress_message) {
            final SubLObject message_var = (SubLObject)stream_buffer.$sym62$MESSAGE_VAR;
            final SubLObject stream_var = (SubLObject)stream_buffer.$sym63$STREAM_VAR;
            final SubLObject sofar = (SubLObject)stream_buffer.$sym64$SOFAR;
            final SubLObject total = (SubLObject)stream_buffer.$sym65$TOTAL;
            return (SubLObject)ConsesLow.list((SubLObject)stream_buffer.$sym66$WITH_PRIVATE_TEXT_FILE, (SubLObject)ConsesLow.listS(stream_var, filename, (SubLObject)stream_buffer.$list67), (SubLObject)ConsesLow.list((SubLObject)stream_buffer.$sym68$PWHEN, (SubLObject)ConsesLow.list((SubLObject)stream_buffer.$sym53$STREAMP, stream_var), (SubLObject)ConsesLow.list((SubLObject)stream_buffer.$sym27$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(message_var, progress_message), reader.bq_cons(sofar, (SubLObject)stream_buffer.$list69), (SubLObject)ConsesLow.list(total, (SubLObject)ConsesLow.list((SubLObject)stream_buffer.$sym70$FILE_LENGTH, stream_var))), (SubLObject)ConsesLow.list((SubLObject)stream_buffer.$sym71$NOTING_PERCENT_PROGRESS, message_var, (SubLObject)ConsesLow.listS((SubLObject)stream_buffer.$sym72$DO_STREAM_LINES_BUFFERED, (SubLObject)ConsesLow.list(line_buffer_var, stream_var, (SubLObject)stream_buffer.$kw59$BLOCK_SIZE, block_size, (SubLObject)stream_buffer.$kw61$DONE, done), (SubLObject)ConsesLow.list((SubLObject)stream_buffer.$sym73$NOTE_PERCENT_PROGRESS, sofar, total), (SubLObject)ConsesLow.list((SubLObject)stream_buffer.$sym74$CSETQ, sofar, (SubLObject)ConsesLow.list((SubLObject)stream_buffer.$sym75$FILE_POSITION, stream_var)), ConsesLow.append(body, (SubLObject)stream_buffer.NIL))))));
        }
        final SubLObject stream_var2 = (SubLObject)stream_buffer.$sym76$STREAM_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)stream_buffer.$sym66$WITH_PRIVATE_TEXT_FILE, (SubLObject)ConsesLow.listS(stream_var2, filename, (SubLObject)stream_buffer.$list67), (SubLObject)ConsesLow.list((SubLObject)stream_buffer.$sym68$PWHEN, (SubLObject)ConsesLow.list((SubLObject)stream_buffer.$sym53$STREAMP, stream_var2), (SubLObject)ConsesLow.listS((SubLObject)stream_buffer.$sym72$DO_STREAM_LINES_BUFFERED, (SubLObject)ConsesLow.list(line_buffer_var, stream_var2, (SubLObject)stream_buffer.$kw59$BLOCK_SIZE, block_size, (SubLObject)stream_buffer.$kw61$DONE, done), ConsesLow.append(body, (SubLObject)stream_buffer.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 17255L)
    public static SubLObject do_stream_lines_buffered(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)stream_buffer.$list77);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject line_buffer_var = (SubLObject)stream_buffer.NIL;
        SubLObject stream = (SubLObject)stream_buffer.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)stream_buffer.$list77);
        line_buffer_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)stream_buffer.$list77);
        stream = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)stream_buffer.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)stream_buffer.NIL;
        SubLObject current_$2 = (SubLObject)stream_buffer.NIL;
        while (stream_buffer.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)stream_buffer.$list77);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)stream_buffer.$list77);
            if (stream_buffer.NIL == conses_high.member(current_$2, (SubLObject)stream_buffer.$list78, (SubLObject)stream_buffer.UNPROVIDED, (SubLObject)stream_buffer.UNPROVIDED)) {
                bad = (SubLObject)stream_buffer.T;
            }
            if (current_$2 == stream_buffer.$kw58$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (stream_buffer.NIL != bad && stream_buffer.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)stream_buffer.$list77);
        }
        final SubLObject block_size_tail = cdestructuring_bind.property_list_member((SubLObject)stream_buffer.$kw59$BLOCK_SIZE, current);
        final SubLObject block_size = (SubLObject)((stream_buffer.NIL != block_size_tail) ? conses_high.cadr(block_size_tail) : stream_buffer.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)stream_buffer.$kw61$DONE, current);
        final SubLObject done = (SubLObject)((stream_buffer.NIL != done_tail) ? conses_high.cadr(done_tail) : stream_buffer.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject done_var = (SubLObject)stream_buffer.$sym79$DONE_VAR;
        final SubLObject stream_buffer_var = (SubLObject)stream_buffer.$sym80$STREAM_BUFFER_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)stream_buffer.$sym27$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(done_var, done)), (SubLObject)ConsesLow.list((SubLObject)stream_buffer.$sym81$CMULTIPLE_VALUE_BIND, (SubLObject)ConsesLow.list(stream_buffer_var, line_buffer_var), (SubLObject)ConsesLow.listS((SubLObject)stream_buffer.$sym82$DO_STREAM_LINES_BUFFERED_INITIALIZE, stream, ConsesLow.append((SubLObject)((stream_buffer.NIL != block_size) ? ConsesLow.list(block_size) : stream_buffer.NIL), (SubLObject)stream_buffer.NIL)), (SubLObject)ConsesLow.list((SubLObject)stream_buffer.$sym83$CUNWIND_PROTECT, (SubLObject)ConsesLow.list((SubLObject)stream_buffer.$sym84$WHILE, (SubLObject)ConsesLow.list((SubLObject)stream_buffer.$sym85$CNOT, done_var), (SubLObject)ConsesLow.list((SubLObject)stream_buffer.$sym86$PIF, (SubLObject)ConsesLow.list((SubLObject)stream_buffer.$sym87$DO_STREAM_LINES_BUFFERED_NEXT, stream_buffer_var, line_buffer_var), reader.bq_cons((SubLObject)stream_buffer.$sym88$PROGN, ConsesLow.append(body, (SubLObject)((stream_buffer.NIL != done) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)stream_buffer.$sym74$CSETQ, done_var, done)) : stream_buffer.NIL), (SubLObject)stream_buffer.NIL)), (SubLObject)ConsesLow.listS((SubLObject)stream_buffer.$sym74$CSETQ, done_var, (SubLObject)stream_buffer.$list89)))), (SubLObject)ConsesLow.list((SubLObject)stream_buffer.$sym90$DO_STREAM_LINES_BUFFERED_FINALIZE, line_buffer_var, stream_buffer_var)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 18291L)
    public static SubLObject do_stream_lines_buffered_initialize(final SubLObject stream, SubLObject block_size) {
        if (block_size == stream_buffer.UNPROVIDED) {
            block_size = (SubLObject)stream_buffer.NIL;
        }
        final SubLObject v_stream_buffer = (stream_buffer.NIL != block_size) ? new_stream_buffer(stream, block_size) : stream;
        final SubLObject line_buffer = new_string_buffer((SubLObject)stream_buffer.UNPROVIDED);
        return Values.values(v_stream_buffer, line_buffer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 18606L)
    public static SubLObject do_stream_lines_buffered_next(final SubLObject v_stream_buffer, final SubLObject line_buffer) {
        if (v_stream_buffer.isStream()) {
            return read_line_into_string_buffer(v_stream_buffer, line_buffer, (SubLObject)stream_buffer.NIL, (SubLObject)stream_buffer.NIL);
        }
        return stream_buffer_read_line_into_string_buffer(v_stream_buffer, line_buffer, (SubLObject)stream_buffer.NIL, (SubLObject)stream_buffer.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 18925L)
    public static SubLObject do_stream_lines_buffered_finalize(final SubLObject line_buffer, final SubLObject v_stream_buffer) {
        if (stream_buffer.NIL != line_buffer) {
            destroy_string_buffer(line_buffer);
        }
        if (!v_stream_buffer.isStream()) {
            destroy_stream_buffer(v_stream_buffer);
        }
        return (SubLObject)stream_buffer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 19198L)
    public static SubLObject new_stream_line_iterator(final SubLObject stream, SubLObject block_size) {
        if (block_size == stream_buffer.UNPROVIDED) {
            block_size = (SubLObject)stream_buffer.NIL;
        }
        return iteration.new_iterator(make_stream_line_iterator_state(stream, block_size), (SubLObject)stream_buffer.$sym91$STREAM_LINE_ITERATOR_DONE_, (SubLObject)stream_buffer.$sym92$STREAM_LINE_ITERATOR_NEXT, (SubLObject)stream_buffer.$sym93$STREAM_LINE_ITERATOR_FINALIZE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 19533L)
    public static SubLObject make_stream_line_iterator_state(final SubLObject stream, final SubLObject block_size) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_stream_buffer = do_stream_lines_buffered_initialize(stream, block_size);
        final SubLObject line_buffer = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return (SubLObject)ConsesLow.list(v_stream_buffer, line_buffer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 19775L)
    public static SubLObject stream_line_iterator_doneP(final SubLObject state) {
        SubLObject v_stream_buffer = (SubLObject)stream_buffer.NIL;
        SubLObject line_buffer = (SubLObject)stream_buffer.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)stream_buffer.$list94);
        v_stream_buffer = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)stream_buffer.$list94);
        line_buffer = current.first();
        current = current.rest();
        if (stream_buffer.NIL == current) {
            return Types.sublisp_null(line_buffer);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)stream_buffer.$list94);
        return (SubLObject)stream_buffer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 19950L)
    public static SubLObject stream_line_iterator_next(final SubLObject state) {
        SubLObject v_stream_buffer = (SubLObject)stream_buffer.NIL;
        SubLObject line_buffer = (SubLObject)stream_buffer.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)stream_buffer.$list94);
        v_stream_buffer = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)stream_buffer.$list94);
        line_buffer = current.first();
        current = current.rest();
        if (stream_buffer.NIL == current) {
            final SubLObject next = do_stream_lines_buffered_next(v_stream_buffer, line_buffer);
            SubLObject doneP = (SubLObject)stream_buffer.NIL;
            if (stream_buffer.NIL == next) {
                ConsesLow.set_nth((SubLObject)stream_buffer.ONE_INTEGER, state, (SubLObject)stream_buffer.NIL);
                destroy_string_buffer(line_buffer);
                doneP = (SubLObject)stream_buffer.T;
            }
            return Values.values(next, state, doneP);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)stream_buffer.$list94);
        return (SubLObject)stream_buffer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 20301L)
    public static SubLObject stream_line_iterator_finalize(final SubLObject state) {
        SubLObject v_stream_buffer = (SubLObject)stream_buffer.NIL;
        SubLObject line_buffer = (SubLObject)stream_buffer.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)stream_buffer.$list94);
        v_stream_buffer = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)stream_buffer.$list94);
        line_buffer = current.first();
        current = current.rest();
        if (stream_buffer.NIL == current) {
            do_stream_lines_buffered_finalize(line_buffer, v_stream_buffer);
            return (SubLObject)stream_buffer.T;
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)stream_buffer.$list94);
        return (SubLObject)stream_buffer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/stream-buffer.lisp", position = 20501L)
    public static SubLObject buffered_file_grep(final SubLObject pattern, final SubLObject stream, SubLObject match_options) {
        if (match_options == stream_buffer.UNPROVIDED) {
            match_options = (SubLObject)stream_buffer.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject line_count = (SubLObject)stream_buffer.ZERO_INTEGER;
        SubLObject matches = (SubLObject)stream_buffer.NIL;
        SubLObject done_var = (SubLObject)stream_buffer.NIL;
        thread.resetMultipleValues();
        final SubLObject stream_buffer_var = do_stream_lines_buffered_initialize(stream, (SubLObject)stream_buffer.UNPROVIDED);
        final SubLObject line_buffer = thread.secondMultipleValue();
        thread.resetMultipleValues();
        while (stream_buffer.NIL == done_var) {
            if (stream_buffer.NIL != do_stream_lines_buffered_next(stream_buffer_var, line_buffer)) {
                final SubLObject line_string = string_buffer_string(line_buffer);
                final SubLObject line_end = string_buffer_position(line_buffer);
                line_count = Numbers.add(line_count, (SubLObject)stream_buffer.ONE_INTEGER);
                final SubLObject line_matches = regular_expression_utilities.find_all_matches_within_string(pattern, line_string, match_options, (SubLObject)stream_buffer.NIL, (SubLObject)stream_buffer.ZERO_INTEGER, line_end);
                if (stream_buffer.NIL == line_matches) {
                    continue;
                }
                final SubLObject line = string_utilities.substring(line_string, (SubLObject)stream_buffer.ZERO_INTEGER, line_end);
                matches = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(line_count, line, line_matches), matches);
            }
            else {
                done_var = (SubLObject)stream_buffer.T;
            }
        }
        do_stream_lines_buffered_finalize(line_buffer, stream_buffer_var);
        return Sequences.nreverse(matches);
    }
    
    public static SubLObject declare_stream_buffer_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "stream_buffer_read_sequence", "STREAM-BUFFER-READ-SEQUENCE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "string_buffer_replace", "STRING-BUFFER-REPLACE", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "read_text_into_vector", "READ-TEXT-INTO-VECTOR", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "replace_string_from_vector", "REPLACE-STRING-FROM-VECTOR", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "string_buffer_print_function_trampoline", "STRING-BUFFER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "string_buffer_p", "STRING-BUFFER-P", 1, 0, false);
        new $string_buffer_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "strbuf_string", "STRBUF-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "strbuf_position", "STRBUF-POSITION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "_csetf_strbuf_string", "_CSETF-STRBUF-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "_csetf_strbuf_position", "_CSETF-STRBUF-POSITION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "make_string_buffer", "MAKE-STRING-BUFFER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "visit_defstruct_string_buffer", "VISIT-DEFSTRUCT-STRING-BUFFER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "visit_defstruct_object_string_buffer_method", "VISIT-DEFSTRUCT-OBJECT-STRING-BUFFER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "print_string_buffer", "PRINT-STRING-BUFFER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "new_string_buffer", "NEW-STRING-BUFFER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "destroy_string_buffer", "DESTROY-STRING-BUFFER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "string_buffer_string", "STRING-BUFFER-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "string_buffer_position", "STRING-BUFFER-POSITION", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.stream_buffer", "with_string_buffer", "WITH-STRING-BUFFER");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "string_buffer_capacity", "STRING-BUFFER-CAPACITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "string_buffer_write", "STRING-BUFFER-WRITE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "string_buffer_read", "STRING-BUFFER-READ", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "string_buffer_reset", "STRING-BUFFER-RESET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "string_buffer_add", "STRING-BUFFER-ADD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "string_buffer_add_sequence", "STRING-BUFFER-ADD-SEQUENCE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "stream_buffer_print_function_trampoline", "STREAM-BUFFER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "stream_buffer_p", "STREAM-BUFFER-P", 1, 0, false);
        new $stream_buffer_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "strm_buf_stream", "STRM-BUF-STREAM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "strm_buf_buffer", "STRM-BUF-BUFFER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "strm_buf_end", "STRM-BUF-END", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "strm_buf_position", "STRM-BUF-POSITION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "_csetf_strm_buf_stream", "_CSETF-STRM-BUF-STREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "_csetf_strm_buf_buffer", "_CSETF-STRM-BUF-BUFFER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "_csetf_strm_buf_end", "_CSETF-STRM-BUF-END", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "_csetf_strm_buf_position", "_CSETF-STRM-BUF-POSITION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "make_stream_buffer", "MAKE-STREAM-BUFFER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "visit_defstruct_stream_buffer", "VISIT-DEFSTRUCT-STREAM-BUFFER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "visit_defstruct_object_stream_buffer_method", "VISIT-DEFSTRUCT-OBJECT-STREAM-BUFFER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "print_stream_buffer", "PRINT-STREAM-BUFFER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "new_stream_buffer", "NEW-STREAM-BUFFER", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "destroy_stream_buffer", "DESTROY-STREAM-BUFFER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "stream_buffer_stream", "STREAM-BUFFER-STREAM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "stream_buffer_block_size", "STREAM-BUFFER-BLOCK-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "stream_buffer_reset", "STREAM-BUFFER-RESET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "stream_buffer_load", "STREAM-BUFFER-LOAD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "read_line_into_string_buffer", "READ-LINE-INTO-STRING-BUFFER", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "stream_buffer_read_line_into_string_buffer", "STREAM-BUFFER-READ-LINE-INTO-STRING-BUFFER", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "read_line_into_string_buffer_int", "READ-LINE-INTO-STRING-BUFFER-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "stream_buffer_read_line_into_string_buffer_int", "STREAM-BUFFER-READ-LINE-INTO-STRING-BUFFER-INT", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.stream_buffer", "do_file_lines_buffered", "DO-FILE-LINES-BUFFERED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.stream_buffer", "do_stream_lines_buffered", "DO-STREAM-LINES-BUFFERED");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "do_stream_lines_buffered_initialize", "DO-STREAM-LINES-BUFFERED-INITIALIZE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "do_stream_lines_buffered_next", "DO-STREAM-LINES-BUFFERED-NEXT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "do_stream_lines_buffered_finalize", "DO-STREAM-LINES-BUFFERED-FINALIZE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "new_stream_line_iterator", "NEW-STREAM-LINE-ITERATOR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "make_stream_line_iterator_state", "MAKE-STREAM-LINE-ITERATOR-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "stream_line_iterator_doneP", "STREAM-LINE-ITERATOR-DONE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "stream_line_iterator_next", "STREAM-LINE-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "stream_line_iterator_finalize", "STREAM-LINE-ITERATOR-FINALIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.stream_buffer", "buffered_file_grep", "BUFFERED-FILE-GREP", 2, 1, false);
        return (SubLObject)stream_buffer.NIL;
    }
    
    public static SubLObject init_stream_buffer_file() {
        stream_buffer.$dtp_string_buffer$ = SubLFiles.defconstant("*DTP-STRING-BUFFER*", (SubLObject)stream_buffer.$sym1$STRING_BUFFER);
        stream_buffer.$dtp_stream_buffer$ = SubLFiles.defconstant("*DTP-STREAM-BUFFER*", (SubLObject)stream_buffer.$sym30$STREAM_BUFFER);
        return (SubLObject)stream_buffer.NIL;
    }
    
    public static SubLObject setup_stream_buffer_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), stream_buffer.$dtp_string_buffer$.getGlobalValue(), Symbols.symbol_function((SubLObject)stream_buffer.$sym8$STRING_BUFFER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)stream_buffer.$list9);
        Structures.def_csetf((SubLObject)stream_buffer.$sym10$STRBUF_STRING, (SubLObject)stream_buffer.$sym11$_CSETF_STRBUF_STRING);
        Structures.def_csetf((SubLObject)stream_buffer.$sym12$STRBUF_POSITION, (SubLObject)stream_buffer.$sym13$_CSETF_STRBUF_POSITION);
        Equality.identity((SubLObject)stream_buffer.$sym1$STRING_BUFFER);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), stream_buffer.$dtp_string_buffer$.getGlobalValue(), Symbols.symbol_function((SubLObject)stream_buffer.$sym21$VISIT_DEFSTRUCT_OBJECT_STRING_BUFFER_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), stream_buffer.$dtp_stream_buffer$.getGlobalValue(), Symbols.symbol_function((SubLObject)stream_buffer.$sym37$STREAM_BUFFER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)stream_buffer.$list38);
        Structures.def_csetf((SubLObject)stream_buffer.$sym39$STRM_BUF_STREAM, (SubLObject)stream_buffer.$sym40$_CSETF_STRM_BUF_STREAM);
        Structures.def_csetf((SubLObject)stream_buffer.$sym41$STRM_BUF_BUFFER, (SubLObject)stream_buffer.$sym42$_CSETF_STRM_BUF_BUFFER);
        Structures.def_csetf((SubLObject)stream_buffer.$sym43$STRM_BUF_END, (SubLObject)stream_buffer.$sym44$_CSETF_STRM_BUF_END);
        Structures.def_csetf((SubLObject)stream_buffer.$sym45$STRM_BUF_POSITION, (SubLObject)stream_buffer.$sym46$_CSETF_STRM_BUF_POSITION);
        Equality.identity((SubLObject)stream_buffer.$sym30$STREAM_BUFFER);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), stream_buffer.$dtp_stream_buffer$.getGlobalValue(), Symbols.symbol_function((SubLObject)stream_buffer.$sym50$VISIT_DEFSTRUCT_OBJECT_STREAM_BUFFER_METHOD));
        access_macros.register_macro_helper((SubLObject)stream_buffer.$sym82$DO_STREAM_LINES_BUFFERED_INITIALIZE, (SubLObject)stream_buffer.$sym72$DO_STREAM_LINES_BUFFERED);
        access_macros.register_macro_helper((SubLObject)stream_buffer.$sym87$DO_STREAM_LINES_BUFFERED_NEXT, (SubLObject)stream_buffer.$sym72$DO_STREAM_LINES_BUFFERED);
        access_macros.register_macro_helper((SubLObject)stream_buffer.$sym90$DO_STREAM_LINES_BUFFERED_FINALIZE, (SubLObject)stream_buffer.$sym72$DO_STREAM_LINES_BUFFERED);
        utilities_macros.note_funcall_helper_function((SubLObject)stream_buffer.$sym91$STREAM_LINE_ITERATOR_DONE_);
        utilities_macros.note_funcall_helper_function((SubLObject)stream_buffer.$sym92$STREAM_LINE_ITERATOR_NEXT);
        utilities_macros.note_funcall_helper_function((SubLObject)stream_buffer.$sym93$STREAM_LINE_ITERATOR_FINALIZE);
        return (SubLObject)stream_buffer.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_stream_buffer_file();
    }
    
    @Override
	public void initializeVariables() {
        init_stream_buffer_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_stream_buffer_file();
    }
    
    static {
        me = (SubLFile)new stream_buffer();
        stream_buffer.$dtp_string_buffer$ = null;
        stream_buffer.$dtp_stream_buffer$ = null;
        $str0$Improper_index_bounds__S__S = SubLObjectFactory.makeString("Improper index bounds ~S ~S");
        $sym1$STRING_BUFFER = SubLObjectFactory.makeSymbol("STRING-BUFFER");
        $sym2$STRING_BUFFER_P = SubLObjectFactory.makeSymbol("STRING-BUFFER-P");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("POSITION"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeKeyword("POSITION"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRBUF-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRBUF-POSITION"));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-STRBUF-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-STRBUF-POSITION"));
        $sym7$PRINT_STRING_BUFFER = SubLObjectFactory.makeSymbol("PRINT-STRING-BUFFER");
        $sym8$STRING_BUFFER_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("STRING-BUFFER-PRINT-FUNCTION-TRAMPOLINE");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("STRING-BUFFER-P"));
        $sym10$STRBUF_STRING = SubLObjectFactory.makeSymbol("STRBUF-STRING");
        $sym11$_CSETF_STRBUF_STRING = SubLObjectFactory.makeSymbol("_CSETF-STRBUF-STRING");
        $sym12$STRBUF_POSITION = SubLObjectFactory.makeSymbol("STRBUF-POSITION");
        $sym13$_CSETF_STRBUF_POSITION = SubLObjectFactory.makeSymbol("_CSETF-STRBUF-POSITION");
        $kw14$STRING = SubLObjectFactory.makeKeyword("STRING");
        $kw15$POSITION = SubLObjectFactory.makeKeyword("POSITION");
        $str16$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw17$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym18$MAKE_STRING_BUFFER = SubLObjectFactory.makeSymbol("MAKE-STRING-BUFFER");
        $kw19$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw20$END = SubLObjectFactory.makeKeyword("END");
        $sym21$VISIT_DEFSTRUCT_OBJECT_STRING_BUFFER_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-STRING-BUFFER-METHOD");
        $str22$__STRING_BUFFER_capacity__S_posit = SubLObjectFactory.makeString("#<STRING-BUFFER capacity=~S position=~S>");
        $int23$64 = SubLObjectFactory.makeInteger(64);
        $sym24$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $kw25$DESTROYED = SubLObjectFactory.makeKeyword("DESTROYED");
        $list26 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BUFFER-STRING-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("BUFFER-END-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("STRING-BUFFER"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym27$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym28$STRING_BUFFER_STRING = SubLObjectFactory.makeSymbol("STRING-BUFFER-STRING");
        $sym29$STRING_BUFFER_POSITION = SubLObjectFactory.makeSymbol("STRING-BUFFER-POSITION");
        $sym30$STREAM_BUFFER = SubLObjectFactory.makeSymbol("STREAM-BUFFER");
        $sym31$STREAM_BUFFER_P = SubLObjectFactory.makeSymbol("STREAM-BUFFER-P");
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("BUFFER"), (SubLObject)SubLObjectFactory.makeSymbol("END"), (SubLObject)SubLObjectFactory.makeSymbol("POSITION"));
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STREAM"), (SubLObject)SubLObjectFactory.makeKeyword("BUFFER"), (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)SubLObjectFactory.makeKeyword("POSITION"));
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRM-BUF-STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("STRM-BUF-BUFFER"), (SubLObject)SubLObjectFactory.makeSymbol("STRM-BUF-END"), (SubLObject)SubLObjectFactory.makeSymbol("STRM-BUF-POSITION"));
        $list35 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-STRM-BUF-STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-STRM-BUF-BUFFER"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-STRM-BUF-END"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-STRM-BUF-POSITION"));
        $sym36$PRINT_STREAM_BUFFER = SubLObjectFactory.makeSymbol("PRINT-STREAM-BUFFER");
        $sym37$STREAM_BUFFER_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("STREAM-BUFFER-PRINT-FUNCTION-TRAMPOLINE");
        $list38 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM-BUFFER-P"));
        $sym39$STRM_BUF_STREAM = SubLObjectFactory.makeSymbol("STRM-BUF-STREAM");
        $sym40$_CSETF_STRM_BUF_STREAM = SubLObjectFactory.makeSymbol("_CSETF-STRM-BUF-STREAM");
        $sym41$STRM_BUF_BUFFER = SubLObjectFactory.makeSymbol("STRM-BUF-BUFFER");
        $sym42$_CSETF_STRM_BUF_BUFFER = SubLObjectFactory.makeSymbol("_CSETF-STRM-BUF-BUFFER");
        $sym43$STRM_BUF_END = SubLObjectFactory.makeSymbol("STRM-BUF-END");
        $sym44$_CSETF_STRM_BUF_END = SubLObjectFactory.makeSymbol("_CSETF-STRM-BUF-END");
        $sym45$STRM_BUF_POSITION = SubLObjectFactory.makeSymbol("STRM-BUF-POSITION");
        $sym46$_CSETF_STRM_BUF_POSITION = SubLObjectFactory.makeSymbol("_CSETF-STRM-BUF-POSITION");
        $kw47$STREAM = SubLObjectFactory.makeKeyword("STREAM");
        $kw48$BUFFER = SubLObjectFactory.makeKeyword("BUFFER");
        $sym49$MAKE_STREAM_BUFFER = SubLObjectFactory.makeSymbol("MAKE-STREAM-BUFFER");
        $sym50$VISIT_DEFSTRUCT_OBJECT_STREAM_BUFFER_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-STREAM-BUFFER-METHOD");
        $str51$__STREAM_BUFFER_block_size__S_for = SubLObjectFactory.makeString("#<STREAM-BUFFER block size=~S for ~S>");
        $int52$1024 = SubLObjectFactory.makeInteger(1024);
        $sym53$STREAMP = SubLObjectFactory.makeSymbol("STREAMP");
        $sym54$POSITIVE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $str55$EOF_reached_on__S = SubLObjectFactory.makeString("EOF reached on ~S");
        $list56 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINE-BUFFER-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("FILENAME"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("BLOCK-SIZE"), (SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list57 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BLOCK-SIZE"), (SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw58$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw59$BLOCK_SIZE = SubLObjectFactory.makeKeyword("BLOCK-SIZE");
        $kw60$PROGRESS_MESSAGE = SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE");
        $kw61$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym62$MESSAGE_VAR = SubLObjectFactory.makeUninternedSymbol("MESSAGE-VAR");
        $sym63$STREAM_VAR = SubLObjectFactory.makeUninternedSymbol("STREAM-VAR");
        $sym64$SOFAR = SubLObjectFactory.makeUninternedSymbol("SOFAR");
        $sym65$TOTAL = SubLObjectFactory.makeUninternedSymbol("TOTAL");
        $sym66$WITH_PRIVATE_TEXT_FILE = SubLObjectFactory.makeSymbol("WITH-PRIVATE-TEXT-FILE");
        $list67 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INPUT"));
        $sym68$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $list69 = ConsesLow.list((SubLObject)stream_buffer.ZERO_INTEGER);
        $sym70$FILE_LENGTH = SubLObjectFactory.makeSymbol("FILE-LENGTH");
        $sym71$NOTING_PERCENT_PROGRESS = SubLObjectFactory.makeSymbol("NOTING-PERCENT-PROGRESS");
        $sym72$DO_STREAM_LINES_BUFFERED = SubLObjectFactory.makeSymbol("DO-STREAM-LINES-BUFFERED");
        $sym73$NOTE_PERCENT_PROGRESS = SubLObjectFactory.makeSymbol("NOTE-PERCENT-PROGRESS");
        $sym74$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym75$FILE_POSITION = SubLObjectFactory.makeSymbol("FILE-POSITION");
        $sym76$STREAM_VAR = SubLObjectFactory.makeUninternedSymbol("STREAM-VAR");
        $list77 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINE-BUFFER-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("BLOCK-SIZE"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list78 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BLOCK-SIZE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $sym79$DONE_VAR = SubLObjectFactory.makeUninternedSymbol("DONE-VAR");
        $sym80$STREAM_BUFFER_VAR = SubLObjectFactory.makeUninternedSymbol("STREAM-BUFFER-VAR");
        $sym81$CMULTIPLE_VALUE_BIND = SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND");
        $sym82$DO_STREAM_LINES_BUFFERED_INITIALIZE = SubLObjectFactory.makeSymbol("DO-STREAM-LINES-BUFFERED-INITIALIZE");
        $sym83$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $sym84$WHILE = SubLObjectFactory.makeSymbol("WHILE");
        $sym85$CNOT = SubLObjectFactory.makeSymbol("CNOT");
        $sym86$PIF = SubLObjectFactory.makeSymbol("PIF");
        $sym87$DO_STREAM_LINES_BUFFERED_NEXT = SubLObjectFactory.makeSymbol("DO-STREAM-LINES-BUFFERED-NEXT");
        $sym88$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $list89 = ConsesLow.list((SubLObject)stream_buffer.T);
        $sym90$DO_STREAM_LINES_BUFFERED_FINALIZE = SubLObjectFactory.makeSymbol("DO-STREAM-LINES-BUFFERED-FINALIZE");
        $sym91$STREAM_LINE_ITERATOR_DONE_ = SubLObjectFactory.makeSymbol("STREAM-LINE-ITERATOR-DONE?");
        $sym92$STREAM_LINE_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("STREAM-LINE-ITERATOR-NEXT");
        $sym93$STREAM_LINE_ITERATOR_FINALIZE = SubLObjectFactory.makeSymbol("STREAM-LINE-ITERATOR-FINALIZE");
        $list94 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM-BUFFER"), (SubLObject)SubLObjectFactory.makeSymbol("LINE-BUFFER"));
    }
    
    public static final class $string_buffer_native extends SubLStructNative
    {
        public SubLObject $string;
        public SubLObject $position;
        private static final SubLStructDeclNative structDecl;
        
        public $string_buffer_native() {
            this.$string = (SubLObject)CommonSymbols.NIL;
            this.$position = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$string_buffer_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$string;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$position;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$string = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$position = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$string_buffer_native.class, stream_buffer.$sym1$STRING_BUFFER, stream_buffer.$sym2$STRING_BUFFER_P, stream_buffer.$list3, stream_buffer.$list4, new String[] { "$string", "$position" }, stream_buffer.$list5, stream_buffer.$list6, stream_buffer.$sym7$PRINT_STRING_BUFFER);
        }
    }
    
    public static final class $string_buffer_p$UnaryFunction extends UnaryFunction
    {
        public $string_buffer_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("STRING-BUFFER-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return stream_buffer.string_buffer_p(arg1);
        }
    }
    
    public static final class $stream_buffer_native extends SubLStructNative
    {
        public SubLObject $stream;
        public SubLObject $buffer;
        public SubLObject $end;
        public SubLObject $position;
        private static final SubLStructDeclNative structDecl;
        
        public $stream_buffer_native() {
            this.$stream = (SubLObject)CommonSymbols.NIL;
            this.$buffer = (SubLObject)CommonSymbols.NIL;
            this.$end = (SubLObject)CommonSymbols.NIL;
            this.$position = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$stream_buffer_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$stream;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$buffer;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$end;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$position;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$stream = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$buffer = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$end = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$position = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$stream_buffer_native.class, stream_buffer.$sym30$STREAM_BUFFER, stream_buffer.$sym31$STREAM_BUFFER_P, stream_buffer.$list32, stream_buffer.$list33, new String[] { "$stream", "$buffer", "$end", "$position" }, stream_buffer.$list34, stream_buffer.$list35, stream_buffer.$sym36$PRINT_STREAM_BUFFER);
        }
    }
    
    public static final class $stream_buffer_p$UnaryFunction extends UnaryFunction
    {
        public $stream_buffer_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("STREAM-BUFFER-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return stream_buffer.stream_buffer_p(arg1);
        }
    }
}

/*

	Total time: 291 ms
	
*/