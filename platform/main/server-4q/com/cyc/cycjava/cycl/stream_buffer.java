/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;
import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      STREAM-BUFFER
 * source file: /cyc/top/cycl/stream-buffer.lisp
 * created:     2019/07/03 17:37:15
 */
public final class stream_buffer extends SubLTranslatedFile implements V12 {
    public static final class $string_buffer_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.stream_buffer.$string_buffer_native.this.$string;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.stream_buffer.$string_buffer_native.this.$position;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.stream_buffer.$string_buffer_native.this.$string = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.stream_buffer.$string_buffer_native.this.$position = value;
        }

        public SubLObject $string = Lisp.NIL;

        public SubLObject $position = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.stream_buffer.$string_buffer_native.class, STRING_BUFFER, STRING_BUFFER_P, $list_alt3, $list_alt4, new String[]{ "$string", "$position" }, $list_alt5, $list_alt6, PRINT_STRING_BUFFER);
    }

    public static final SubLFile me = new stream_buffer();

 public static final String myName = "com.cyc.cycjava.cycl.stream_buffer";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_string_buffer$ = makeSymbol("*DTP-STRING-BUFFER*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_stream_buffer$ = makeSymbol("*DTP-STREAM-BUFFER*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str0$Improper_index_bounds__S__S = makeString("Improper index bounds ~S ~S");

    private static final SubLSymbol STRING_BUFFER = makeSymbol("STRING-BUFFER");

    private static final SubLSymbol STRING_BUFFER_P = makeSymbol("STRING-BUFFER-P");

    static private final SubLList $list3 = list(makeSymbol("STRING"), makeSymbol("POSITION"));

    static private final SubLList $list4 = list(makeKeyword("STRING"), makeKeyword("POSITION"));

    static private final SubLList $list5 = list(makeSymbol("STRBUF-STRING"), makeSymbol("STRBUF-POSITION"));

    static private final SubLList $list6 = list(makeSymbol("_CSETF-STRBUF-STRING"), makeSymbol("_CSETF-STRBUF-POSITION"));

    private static final SubLSymbol PRINT_STRING_BUFFER = makeSymbol("PRINT-STRING-BUFFER");

    private static final SubLSymbol STRING_BUFFER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("STRING-BUFFER-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list9 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("STRING-BUFFER-P"));

    private static final SubLSymbol STRBUF_STRING = makeSymbol("STRBUF-STRING");

    private static final SubLSymbol _CSETF_STRBUF_STRING = makeSymbol("_CSETF-STRBUF-STRING");

    private static final SubLSymbol STRBUF_POSITION = makeSymbol("STRBUF-POSITION");

    private static final SubLSymbol _CSETF_STRBUF_POSITION = makeSymbol("_CSETF-STRBUF-POSITION");

    private static final SubLString $str16$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_STRING_BUFFER = makeSymbol("MAKE-STRING-BUFFER");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_STRING_BUFFER_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-STRING-BUFFER-METHOD");

    private static final SubLString $str22$__STRING_BUFFER_capacity__S_posit = makeString("#<STRING-BUFFER capacity=~S position=~S>");

    static private final SubLList $list26 = list(list(makeSymbol("BUFFER-STRING-VAR"), makeSymbol("BUFFER-END-VAR")), makeSymbol("STRING-BUFFER"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol STRING_BUFFER_STRING = makeSymbol("STRING-BUFFER-STRING");

    private static final SubLSymbol STRING_BUFFER_POSITION = makeSymbol("STRING-BUFFER-POSITION");

    private static final SubLSymbol STREAM_BUFFER = makeSymbol("STREAM-BUFFER");

    private static final SubLSymbol STREAM_BUFFER_P = makeSymbol("STREAM-BUFFER-P");

    private static final SubLList $list32 = list(makeSymbol("STREAM"), makeSymbol("BUFFER"), makeSymbol("END"), makeSymbol("POSITION"));

    private static final SubLList $list33 = list(makeKeyword("STREAM"), makeKeyword("BUFFER"), makeKeyword("END"), makeKeyword("POSITION"));

    private static final SubLList $list34 = list(makeSymbol("STRM-BUF-STREAM"), makeSymbol("STRM-BUF-BUFFER"), makeSymbol("STRM-BUF-END"), makeSymbol("STRM-BUF-POSITION"));

    private static final SubLList $list35 = list(makeSymbol("_CSETF-STRM-BUF-STREAM"), makeSymbol("_CSETF-STRM-BUF-BUFFER"), makeSymbol("_CSETF-STRM-BUF-END"), makeSymbol("_CSETF-STRM-BUF-POSITION"));

    private static final SubLSymbol PRINT_STREAM_BUFFER = makeSymbol("PRINT-STREAM-BUFFER");

    private static final SubLSymbol STREAM_BUFFER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("STREAM-BUFFER-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list38 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("STREAM-BUFFER-P"));

    private static final SubLSymbol STRM_BUF_STREAM = makeSymbol("STRM-BUF-STREAM");

    private static final SubLSymbol _CSETF_STRM_BUF_STREAM = makeSymbol("_CSETF-STRM-BUF-STREAM");

    private static final SubLSymbol STRM_BUF_BUFFER = makeSymbol("STRM-BUF-BUFFER");

    private static final SubLSymbol _CSETF_STRM_BUF_BUFFER = makeSymbol("_CSETF-STRM-BUF-BUFFER");

    private static final SubLSymbol STRM_BUF_END = makeSymbol("STRM-BUF-END");

    private static final SubLSymbol _CSETF_STRM_BUF_END = makeSymbol("_CSETF-STRM-BUF-END");

    private static final SubLSymbol STRM_BUF_POSITION = makeSymbol("STRM-BUF-POSITION");

    private static final SubLSymbol _CSETF_STRM_BUF_POSITION = makeSymbol("_CSETF-STRM-BUF-POSITION");

    private static final SubLSymbol MAKE_STREAM_BUFFER = makeSymbol("MAKE-STREAM-BUFFER");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_STREAM_BUFFER_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-STREAM-BUFFER-METHOD");

    private static final SubLString $str51$__STREAM_BUFFER_block_size__S_for = makeString("#<STREAM-BUFFER block size=~S for ~S>");

    private static final SubLInteger $int$1024 = makeInteger(1024);

    private static final SubLString $str55$EOF_reached_on__S = makeString("EOF reached on ~S");

    private static final SubLList $list56 = list(list(makeSymbol("LINE-BUFFER-VAR"), makeSymbol("FILENAME"), makeSymbol("&KEY"), makeSymbol("BLOCK-SIZE"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list57 = list(makeKeyword("BLOCK-SIZE"), makeKeyword("PROGRESS-MESSAGE"), $DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $sym62$MESSAGE_VAR = makeUninternedSymbol("MESSAGE-VAR");

    private static final SubLSymbol $sym63$STREAM_VAR = makeUninternedSymbol("STREAM-VAR");

    private static final SubLSymbol $sym64$SOFAR = makeUninternedSymbol("SOFAR");

    private static final SubLSymbol $sym65$TOTAL = makeUninternedSymbol("TOTAL");

    private static final SubLList $list67 = list(makeKeyword("INPUT"));

    private static final SubLList $list69 = list(ZERO_INTEGER);

    private static final SubLSymbol FILE_LENGTH = makeSymbol("FILE-LENGTH");

    private static final SubLSymbol DO_STREAM_LINES_BUFFERED = makeSymbol("DO-STREAM-LINES-BUFFERED");

    private static final SubLSymbol FILE_POSITION = makeSymbol("FILE-POSITION");

    private static final SubLSymbol $sym76$STREAM_VAR = makeUninternedSymbol("STREAM-VAR");

    private static final SubLList $list77 = list(list(makeSymbol("LINE-BUFFER-VAR"), makeSymbol("STREAM"), makeSymbol("&KEY"), makeSymbol("BLOCK-SIZE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list78 = list(makeKeyword("BLOCK-SIZE"), $DONE);

    private static final SubLSymbol $sym79$DONE_VAR = makeUninternedSymbol("DONE-VAR");

    private static final SubLSymbol $sym80$STREAM_BUFFER_VAR = makeUninternedSymbol("STREAM-BUFFER-VAR");

    private static final SubLSymbol DO_STREAM_LINES_BUFFERED_INITIALIZE = makeSymbol("DO-STREAM-LINES-BUFFERED-INITIALIZE");

    private static final SubLSymbol DO_STREAM_LINES_BUFFERED_NEXT = makeSymbol("DO-STREAM-LINES-BUFFERED-NEXT");

    private static final SubLList $list89 = list(T);

    private static final SubLSymbol DO_STREAM_LINES_BUFFERED_FINALIZE = makeSymbol("DO-STREAM-LINES-BUFFERED-FINALIZE");

    private static final SubLSymbol $sym91$STREAM_LINE_ITERATOR_DONE_ = makeSymbol("STREAM-LINE-ITERATOR-DONE?");

    private static final SubLSymbol STREAM_LINE_ITERATOR_NEXT = makeSymbol("STREAM-LINE-ITERATOR-NEXT");

    private static final SubLSymbol STREAM_LINE_ITERATOR_FINALIZE = makeSymbol("STREAM-LINE-ITERATOR-FINALIZE");

    private static final SubLList $list94 = list(makeSymbol("STREAM-BUFFER"), makeSymbol("LINE-BUFFER"));

    // Definitions
    public static final SubLObject stream_buffer_read_sequence_alt(SubLObject vector, SubLObject stream, SubLObject start, SubLObject end) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if (!vector.isVector()) {
            return read_sequence(vector, stream, start, end);
        }
        return read_text_into_vector(vector, stream, start, end);
    }

    // Definitions
    public static SubLObject stream_buffer_read_sequence(final SubLObject vector, final SubLObject stream, SubLObject start, SubLObject end) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if (!vector.isVector()) {
            return read_sequence(vector, stream, start, end);
        }
        return read_text_into_vector(vector, stream, start, end);
    }

    public static final SubLObject string_buffer_replace_alt(SubLObject string, SubLObject vector, SubLObject start1, SubLObject end1, SubLObject start2, SubLObject end2) {
        if (start1 == UNPROVIDED) {
            start1 = ZERO_INTEGER;
        }
        if (end1 == UNPROVIDED) {
            end1 = NIL;
        }
        if (start2 == UNPROVIDED) {
            start2 = ZERO_INTEGER;
        }
        if (end2 == UNPROVIDED) {
            end2 = NIL;
        }
        if (!(string.isString() && vector.isVector())) {
            return replace(string, vector, start1, end1, start2, end2);
        }
        return replace(string, vector, start1, end1, start2, end2);
    }

    public static SubLObject string_buffer_replace(final SubLObject string, final SubLObject vector, SubLObject start1, SubLObject end1, SubLObject start2, SubLObject end2) {
        if (start1 == UNPROVIDED) {
            start1 = ZERO_INTEGER;
        }
        if (end1 == UNPROVIDED) {
            end1 = NIL;
        }
        if (start2 == UNPROVIDED) {
            start2 = ZERO_INTEGER;
        }
        if (end2 == UNPROVIDED) {
            end2 = NIL;
        }
        if ((!string.isString()) || (!vector.isVector())) {
            return replace(string, vector, start1, end1, start2, end2);
        }
        return replace(string, vector, start1, end1, start2, end2);
    }

    public static final SubLObject read_text_into_vector_alt(SubLObject vector, SubLObject stream, SubLObject start, SubLObject end) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if (NIL == end) {
            end = length(vector);
        }
        {
            SubLObject index = start;
            SubLObject v_char = NIL;
            SubLObject doneP = NIL;
            while ((NIL == doneP) && index.numL(end)) {
                v_char = read_char(stream, NIL, NIL, UNPROVIDED);
                if (NIL == v_char) {
                    doneP = T;
                } else {
                    set_aref(vector, index, v_char);
                    index = add(index, ONE_INTEGER);
                }
            } 
            return index;
        }
    }

    public static SubLObject read_text_into_vector(final SubLObject vector, final SubLObject stream, SubLObject start, SubLObject end) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if (NIL == end) {
            end = length(vector);
        }
        SubLObject index = start;
        SubLObject v_char = NIL;
        SubLObject doneP = NIL;
        while ((NIL == doneP) && index.numL(end)) {
            v_char = read_char(stream, NIL, NIL, UNPROVIDED);
            if (NIL == v_char) {
                doneP = T;
            } else {
                set_aref(vector, index, v_char);
                index = add(index, ONE_INTEGER);
            }
        } 
        return index;
    }

    public static final SubLObject replace_string_from_vector_alt(SubLObject string, SubLObject vector, SubLObject start1, SubLObject end1, SubLObject start2, SubLObject end2) {
        if (start1 == UNPROVIDED) {
            start1 = ZERO_INTEGER;
        }
        if (end1 == UNPROVIDED) {
            end1 = NIL;
        }
        if (start2 == UNPROVIDED) {
            start2 = ZERO_INTEGER;
        }
        if (end2 == UNPROVIDED) {
            end2 = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == end1) {
                end1 = length(string);
            }
            if (NIL == end2) {
                end2 = length(vector);
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!start1.numLE(end1)) {
                    Errors.error($str_alt0$Improper_index_bounds__S__S, start1, end1);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!start2.numLE(end2)) {
                    Errors.error($str_alt0$Improper_index_bounds__S__S, start2, end2);
                }
            }
            {
                SubLObject index1 = start1;
                SubLObject index2 = start2;
                SubLObject v_char = NIL;
                while (index1.numL(end1) && index2.numL(end2)) {
                    v_char = aref(vector, index2);
                    Strings.set_char(string, index1, v_char);
                    index1 = add(index1, ONE_INTEGER);
                    index2 = add(index2, ONE_INTEGER);
                } 
                return string;
            }
        }
    }

    public static SubLObject replace_string_from_vector(final SubLObject string, final SubLObject vector, SubLObject start1, SubLObject end1, SubLObject start2, SubLObject end2) {
        if (start1 == UNPROVIDED) {
            start1 = ZERO_INTEGER;
        }
        if (end1 == UNPROVIDED) {
            end1 = NIL;
        }
        if (start2 == UNPROVIDED) {
            start2 = ZERO_INTEGER;
        }
        if (end2 == UNPROVIDED) {
            end2 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == end1) {
            end1 = length(string);
        }
        if (NIL == end2) {
            end2 = length(vector);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!start1.numLE(end1))) {
            Errors.error($str0$Improper_index_bounds__S__S, start1, end1);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!start2.numLE(end2))) {
            Errors.error($str0$Improper_index_bounds__S__S, start2, end2);
        }
        SubLObject index1 = start1;
        SubLObject index2 = start2;
        SubLObject v_char = NIL;
        while (index1.numL(end1) && index2.numL(end2)) {
            v_char = aref(vector, index2);
            Strings.set_char(string, index1, v_char);
            index1 = add(index1, ONE_INTEGER);
            index2 = add(index2, ONE_INTEGER);
        } 
        return string;
    }

    public static final SubLObject string_buffer_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_string_buffer(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject string_buffer_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_string_buffer(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject string_buffer_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.stream_buffer.$string_buffer_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject string_buffer_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.stream_buffer.$string_buffer_native.class ? T : NIL;
    }

    public static final SubLObject strbuf_string_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, STRING_BUFFER_P);
        return v_object.getField2();
    }

    public static SubLObject strbuf_string(final SubLObject v_object) {
        assert NIL != string_buffer_p(v_object) : "! stream_buffer.string_buffer_p(v_object) " + "stream_buffer.string_buffer_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject strbuf_position_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, STRING_BUFFER_P);
        return v_object.getField3();
    }

    public static SubLObject strbuf_position(final SubLObject v_object) {
        assert NIL != string_buffer_p(v_object) : "! stream_buffer.string_buffer_p(v_object) " + "stream_buffer.string_buffer_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject _csetf_strbuf_string_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, STRING_BUFFER_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_strbuf_string(final SubLObject v_object, final SubLObject value) {
        assert NIL != string_buffer_p(v_object) : "! stream_buffer.string_buffer_p(v_object) " + "stream_buffer.string_buffer_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_strbuf_position_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, STRING_BUFFER_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_strbuf_position(final SubLObject v_object, final SubLObject value) {
        assert NIL != string_buffer_p(v_object) : "! stream_buffer.string_buffer_p(v_object) " + "stream_buffer.string_buffer_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject make_string_buffer_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.stream_buffer.$string_buffer_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($STRING)) {
                        _csetf_strbuf_string(v_new, current_value);
                    } else {
                        if (pcase_var.eql($POSITION)) {
                            _csetf_strbuf_position(v_new, current_value);
                        } else {
                            Errors.error($str_alt15$Invalid_slot__S_for_construction_, current_arg);
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_string_buffer(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.stream_buffer.$string_buffer_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($STRING)) {
                _csetf_strbuf_string(v_new, current_value);
            } else
                if (pcase_var.eql($POSITION)) {
                    _csetf_strbuf_position(v_new, current_value);
                } else {
                    Errors.error($str16$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_string_buffer(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_STRING_BUFFER, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $STRING, strbuf_string(obj));
        funcall(visitor_fn, obj, $SLOT, $POSITION, strbuf_position(obj));
        funcall(visitor_fn, obj, $END, MAKE_STRING_BUFFER, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_string_buffer_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_string_buffer(obj, visitor_fn);
    }

    public static final SubLObject print_string_buffer_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt16$__STRING_BUFFER_capacity__S_posit, string_buffer_capacity(v_object), string_buffer_position(v_object));
        return v_object;
    }

    public static SubLObject print_string_buffer(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str22$__STRING_BUFFER_capacity__S_posit, string_buffer_capacity(v_object), string_buffer_position(v_object));
        return v_object;
    }

    /**
     * Return a new string-buffer with an INITIAL-CAPACITY
     */
    @LispMethod(comment = "Return a new string-buffer with an INITIAL-CAPACITY")
    public static final SubLObject new_string_buffer_alt(SubLObject initial_capacity) {
        if (initial_capacity == UNPROVIDED) {
            initial_capacity = $int$64;
        }
        SubLTrampolineFile.checkType(initial_capacity, NON_NEGATIVE_INTEGER_P);
        {
            SubLObject string_buffer = make_string_buffer(UNPROVIDED);
            _csetf_strbuf_string(string_buffer, Strings.make_string(initial_capacity, UNPROVIDED));
            string_buffer_reset(string_buffer);
            return string_buffer;
        }
    }

    /**
     * Return a new string-buffer with an INITIAL-CAPACITY
     */
    @LispMethod(comment = "Return a new string-buffer with an INITIAL-CAPACITY")
    public static SubLObject new_string_buffer(SubLObject initial_capacity) {
        if (initial_capacity == UNPROVIDED) {
            initial_capacity = $int$64;
        }
        assert NIL != subl_promotions.non_negative_integer_p(initial_capacity) : "! subl_promotions.non_negative_integer_p(initial_capacity) " + ("subl_promotions.non_negative_integer_p(initial_capacity) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(initial_capacity) ") + initial_capacity;
        final SubLObject string_buffer = make_string_buffer(UNPROVIDED);
        _csetf_strbuf_string(string_buffer, Strings.make_string(initial_capacity, UNPROVIDED));
        string_buffer_reset(string_buffer);
        return string_buffer;
    }

    /**
     * Render STRING-BUFFER no longer usable.
     */
    @LispMethod(comment = "Render STRING-BUFFER no longer usable.")
    public static final SubLObject destroy_string_buffer_alt(SubLObject string_buffer) {
        SubLTrampolineFile.checkType(string_buffer, STRING_BUFFER_P);
        _csetf_strbuf_string(string_buffer, NIL);
        _csetf_strbuf_position(string_buffer, $DESTROYED);
        return string_buffer;
    }

    /**
     * Render STRING-BUFFER no longer usable.
     */
    @LispMethod(comment = "Render STRING-BUFFER no longer usable.")
    public static SubLObject destroy_string_buffer(final SubLObject string_buffer) {
        assert NIL != string_buffer_p(string_buffer) : "! stream_buffer.string_buffer_p(string_buffer) " + ("stream_buffer.string_buffer_p(string_buffer) " + "CommonSymbols.NIL != stream_buffer.string_buffer_p(string_buffer) ") + string_buffer;
        _csetf_strbuf_string(string_buffer, NIL);
        _csetf_strbuf_position(string_buffer, $DESTROYED);
        return string_buffer;
    }

    /**
     * Return the current string used as the internal buffer of STRING-BUFFER.
     */
    @LispMethod(comment = "Return the current string used as the internal buffer of STRING-BUFFER.")
    public static final SubLObject string_buffer_string_alt(SubLObject string_buffer) {
        return strbuf_string(string_buffer);
    }

    /**
     * Return the current string used as the internal buffer of STRING-BUFFER.
     */
    @LispMethod(comment = "Return the current string used as the internal buffer of STRING-BUFFER.")
    public static SubLObject string_buffer_string(final SubLObject string_buffer) {
        return strbuf_string(string_buffer);
    }

    /**
     * Return the current end position index of STRING-BUFFER.
     */
    @LispMethod(comment = "Return the current end position index of STRING-BUFFER.")
    public static final SubLObject string_buffer_position_alt(SubLObject string_buffer) {
        return strbuf_position(string_buffer);
    }

    /**
     * Return the current end position index of STRING-BUFFER.
     */
    @LispMethod(comment = "Return the current end position index of STRING-BUFFER.")
    public static SubLObject string_buffer_position(final SubLObject string_buffer) {
        return strbuf_position(string_buffer);
    }

    /**
     * Evaluate BODY within the scope of binding BUFFER-STRING and BUFFER-END from STRING-BUFFER.
     */
    @LispMethod(comment = "Evaluate BODY within the scope of binding BUFFER-STRING and BUFFER-END from STRING-BUFFER.")
    public static final SubLObject with_string_buffer_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt20);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject buffer_string_var = NIL;
                    SubLObject buffer_end_var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt20);
                    buffer_string_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt20);
                    buffer_end_var = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject string_buffer = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt20);
                            string_buffer = current.first();
                            current = current.rest();
                            {
                                SubLObject body = current;
                                return listS(CLET, list(list(buffer_string_var, list(STRING_BUFFER_STRING, string_buffer)), list(buffer_end_var, list(STRING_BUFFER_POSITION, string_buffer))), append(body, NIL));
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt20);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Evaluate BODY within the scope of binding BUFFER-STRING and BUFFER-END from STRING-BUFFER.
     */
    @LispMethod(comment = "Evaluate BODY within the scope of binding BUFFER-STRING and BUFFER-END from STRING-BUFFER.")
    public static SubLObject with_string_buffer(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list26);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject buffer_string_var = NIL;
        SubLObject buffer_end_var = NIL;
        destructuring_bind_must_consp(current, datum, $list26);
        buffer_string_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list26);
        buffer_end_var = current.first();
        current = current.rest();
        if (NIL == current) {
            current = temp;
            SubLObject string_buffer = NIL;
            destructuring_bind_must_consp(current, datum, $list26);
            string_buffer = current.first();
            final SubLObject body;
            current = body = current.rest();
            return listS(CLET, list(list(buffer_string_var, list(STRING_BUFFER_STRING, string_buffer)), list(buffer_end_var, list(STRING_BUFFER_POSITION, string_buffer))), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list26);
        return NIL;
    }

    /**
     * Return the current capacity of STRING-BUFFER.
     */
    @LispMethod(comment = "Return the current capacity of STRING-BUFFER.")
    public static final SubLObject string_buffer_capacity_alt(SubLObject string_buffer) {
        return length(strbuf_string(string_buffer));
    }

    /**
     * Return the current capacity of STRING-BUFFER.
     */
    @LispMethod(comment = "Return the current capacity of STRING-BUFFER.")
    public static SubLObject string_buffer_capacity(final SubLObject string_buffer) {
        return length(strbuf_string(string_buffer));
    }

    /**
     * Write the contents of STRING-BUFFER to STREAM.
     */
    @LispMethod(comment = "Write the contents of STRING-BUFFER to STREAM.")
    public static final SubLObject string_buffer_write_alt(SubLObject string_buffer, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        write_string(strbuf_string(string_buffer), stream, ZERO_INTEGER, strbuf_position(string_buffer));
        return string_buffer;
    }

    /**
     * Write the contents of STRING-BUFFER to STREAM.
     */
    @LispMethod(comment = "Write the contents of STRING-BUFFER to STREAM.")
    public static SubLObject string_buffer_write(final SubLObject string_buffer, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        write_string(strbuf_string(string_buffer), stream, ZERO_INTEGER, strbuf_position(string_buffer));
        return string_buffer;
    }

    /**
     * Read the form at the string in STRING-BUFFER.
     */
    @LispMethod(comment = "Read the form at the string in STRING-BUFFER.")
    public static final SubLObject string_buffer_read_alt(SubLObject string_buffer, SubLObject eof_error_p, SubLObject eof_value, SubLObject start) {
        if (eof_error_p == UNPROVIDED) {
            eof_error_p = NIL;
        }
        if (eof_value == UNPROVIDED) {
            eof_value = NIL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        {
            SubLObject string = string_buffer_string(string_buffer);
            SubLObject end = string_buffer_position(string_buffer);
            return read_from_string_ignoring_errors(string, eof_error_p, eof_value, start, end);
        }
    }

    /**
     * Read the form at the string in STRING-BUFFER.
     */
    @LispMethod(comment = "Read the form at the string in STRING-BUFFER.")
    public static SubLObject string_buffer_read(final SubLObject string_buffer, SubLObject eof_error_p, SubLObject eof_value, SubLObject start) {
        if (eof_error_p == UNPROVIDED) {
            eof_error_p = NIL;
        }
        if (eof_value == UNPROVIDED) {
            eof_value = NIL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        final SubLObject string = string_buffer_string(string_buffer);
        final SubLObject end = string_buffer_position(string_buffer);
        return read_from_string_ignoring_errors(string, eof_error_p, eof_value, start, end);
    }

    /**
     * Reset STRING-BUFFER to an empty state (i.e. a position of 0).
     */
    @LispMethod(comment = "Reset STRING-BUFFER to an empty state (i.e. a position of 0).")
    public static final SubLObject string_buffer_reset_alt(SubLObject string_buffer) {
        SubLTrampolineFile.checkType(string_buffer, STRING_BUFFER_P);
        _csetf_strbuf_position(string_buffer, ZERO_INTEGER);
        return string_buffer;
    }

    /**
     * Reset STRING-BUFFER to an empty state (i.e. a position of 0).
     */
    @LispMethod(comment = "Reset STRING-BUFFER to an empty state (i.e. a position of 0).")
    public static SubLObject string_buffer_reset(final SubLObject string_buffer) {
        assert NIL != string_buffer_p(string_buffer) : "! stream_buffer.string_buffer_p(string_buffer) " + ("stream_buffer.string_buffer_p(string_buffer) " + "CommonSymbols.NIL != stream_buffer.string_buffer_p(string_buffer) ") + string_buffer;
        _csetf_strbuf_position(string_buffer, ZERO_INTEGER);
        return string_buffer;
    }

    /**
     * Add CHAR to the current end of STRING-BUFFER.
     */
    @LispMethod(comment = "Add CHAR to the current end of STRING-BUFFER.")
    public static final SubLObject string_buffer_add_alt(SubLObject string_buffer, SubLObject v_char) {
        {
            SubLObject string = strbuf_string(string_buffer);
            SubLObject current_capacity = length(string);
            SubLObject current_position = strbuf_position(string_buffer);
            if (current_capacity.numE(current_position)) {
                {
                    SubLObject larger_capacity = max($int$64, add(current_capacity, current_capacity));
                    SubLObject larger_string = Strings.make_string(larger_capacity, UNPROVIDED);
                    replace(larger_string, string, ZERO_INTEGER, current_position, ZERO_INTEGER, current_position);
                    _csetf_strbuf_string(string_buffer, larger_string);
                    string = larger_string;
                    current_capacity = larger_capacity;
                }
            }
            Strings.set_char(string, current_position, v_char);
            _csetf_strbuf_position(string_buffer, add(strbuf_position(string_buffer), ONE_INTEGER));
        }
        return string_buffer;
    }

    /**
     * Add CHAR to the current end of STRING-BUFFER.
     */
    @LispMethod(comment = "Add CHAR to the current end of STRING-BUFFER.")
    public static SubLObject string_buffer_add(final SubLObject string_buffer, final SubLObject v_char) {
        SubLObject string = strbuf_string(string_buffer);
        SubLObject current_capacity = length(string);
        final SubLObject current_position = strbuf_position(string_buffer);
        if (current_capacity.numE(current_position)) {
            final SubLObject larger_capacity = max($int$64, add(current_capacity, current_capacity));
            final SubLObject larger_string = Strings.make_string(larger_capacity, UNPROVIDED);
            replace(larger_string, string, ZERO_INTEGER, current_position, ZERO_INTEGER, current_position);
            _csetf_strbuf_string(string_buffer, larger_string);
            string = larger_string;
            current_capacity = larger_capacity;
        }
        Strings.set_char(string, current_position, v_char);
        _csetf_strbuf_position(string_buffer, add(strbuf_position(string_buffer), ONE_INTEGER));
        return string_buffer;
    }

    /**
     * Add the characters in SEQUENCE from START to END to the current end of STRING-BUFFER.
     */
    @LispMethod(comment = "Add the characters in SEQUENCE from START to END to the current end of STRING-BUFFER.")
    public static final SubLObject string_buffer_add_sequence_alt(SubLObject string_buffer, SubLObject sequence, SubLObject start, SubLObject end) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = length(sequence);
        }
        {
            SubLObject string = strbuf_string(string_buffer);
            SubLObject current_capacity = length(string);
            SubLObject current_position = strbuf_position(string_buffer);
            SubLObject added_size = subtract(end, start);
            SubLObject eventual_position = add(current_position, added_size);
            SubLObject min_required_capacity = eventual_position;
            if (!min_required_capacity.numLE(current_capacity)) {
                {
                    SubLObject larger_capacity = max($int$64, current_capacity);
                    while (!min_required_capacity.numLE(larger_capacity)) {
                        larger_capacity = add(larger_capacity, larger_capacity);
                    } 
                    {
                        SubLObject larger_string = Strings.make_string(larger_capacity, UNPROVIDED);
                        replace(larger_string, string, ZERO_INTEGER, current_position, ZERO_INTEGER, current_position);
                        _csetf_strbuf_string(string_buffer, larger_string);
                        string = larger_string;
                        current_capacity = larger_capacity;
                    }
                }
            }
            string_buffer_replace(string, sequence, current_position, eventual_position, start, end);
            _csetf_strbuf_position(string_buffer, eventual_position);
        }
        return string_buffer;
    }

    /**
     * Add the characters in SEQUENCE from START to END to the current end of STRING-BUFFER.
     */
    @LispMethod(comment = "Add the characters in SEQUENCE from START to END to the current end of STRING-BUFFER.")
    public static SubLObject string_buffer_add_sequence(final SubLObject string_buffer, final SubLObject sequence, SubLObject start, SubLObject end) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = length(sequence);
        }
        SubLObject string = strbuf_string(string_buffer);
        SubLObject current_capacity = length(string);
        final SubLObject current_position = strbuf_position(string_buffer);
        final SubLObject added_size = subtract(end, start);
        final SubLObject min_required_capacity;
        final SubLObject eventual_position = min_required_capacity = add(current_position, added_size);
        if (!min_required_capacity.numLE(current_capacity)) {
            SubLObject larger_capacity;
            for (larger_capacity = max($int$64, current_capacity); !min_required_capacity.numLE(larger_capacity); larger_capacity = add(larger_capacity, larger_capacity)) {
            }
            final SubLObject larger_string = Strings.make_string(larger_capacity, UNPROVIDED);
            replace(larger_string, string, ZERO_INTEGER, current_position, ZERO_INTEGER, current_position);
            _csetf_strbuf_string(string_buffer, larger_string);
            string = larger_string;
            current_capacity = larger_capacity;
        }
        string_buffer_replace(string, sequence, current_position, eventual_position, start, end);
        _csetf_strbuf_position(string_buffer, eventual_position);
        return string_buffer;
    }

    public static final SubLObject stream_buffer_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_stream_buffer(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject stream_buffer_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_stream_buffer(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject stream_buffer_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.stream_buffer.$stream_buffer_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject stream_buffer_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.stream_buffer.$stream_buffer_native.class ? T : NIL;
    }

    public static final SubLObject strm_buf_stream_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, STREAM_BUFFER_P);
        return v_object.getField2();
    }

    public static SubLObject strm_buf_stream(final SubLObject v_object) {
        assert NIL != stream_buffer_p(v_object) : "! stream_buffer.stream_buffer_p(v_object) " + "stream_buffer.stream_buffer_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject strm_buf_buffer_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, STREAM_BUFFER_P);
        return v_object.getField3();
    }

    public static SubLObject strm_buf_buffer(final SubLObject v_object) {
        assert NIL != stream_buffer_p(v_object) : "! stream_buffer.stream_buffer_p(v_object) " + "stream_buffer.stream_buffer_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject strm_buf_end_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, STREAM_BUFFER_P);
        return v_object.getField4();
    }

    public static SubLObject strm_buf_end(final SubLObject v_object) {
        assert NIL != stream_buffer_p(v_object) : "! stream_buffer.stream_buffer_p(v_object) " + "stream_buffer.stream_buffer_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject strm_buf_position_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, STREAM_BUFFER_P);
        return v_object.getField5();
    }

    public static SubLObject strm_buf_position(final SubLObject v_object) {
        assert NIL != stream_buffer_p(v_object) : "! stream_buffer.stream_buffer_p(v_object) " + "stream_buffer.stream_buffer_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject _csetf_strm_buf_stream_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, STREAM_BUFFER_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_strm_buf_stream(final SubLObject v_object, final SubLObject value) {
        assert NIL != stream_buffer_p(v_object) : "! stream_buffer.stream_buffer_p(v_object) " + "stream_buffer.stream_buffer_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_strm_buf_buffer_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, STREAM_BUFFER_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_strm_buf_buffer(final SubLObject v_object, final SubLObject value) {
        assert NIL != stream_buffer_p(v_object) : "! stream_buffer.stream_buffer_p(v_object) " + "stream_buffer.stream_buffer_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_strm_buf_end_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, STREAM_BUFFER_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_strm_buf_end(final SubLObject v_object, final SubLObject value) {
        assert NIL != stream_buffer_p(v_object) : "! stream_buffer.stream_buffer_p(v_object) " + "stream_buffer.stream_buffer_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_strm_buf_position_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, STREAM_BUFFER_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_strm_buf_position(final SubLObject v_object, final SubLObject value) {
        assert NIL != stream_buffer_p(v_object) : "! stream_buffer.stream_buffer_p(v_object) " + "stream_buffer.stream_buffer_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject make_stream_buffer_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.stream_buffer.$stream_buffer_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($STREAM)) {
                        _csetf_strm_buf_stream(v_new, current_value);
                    } else {
                        if (pcase_var.eql($BUFFER)) {
                            _csetf_strm_buf_buffer(v_new, current_value);
                        } else {
                            if (pcase_var.eql($END)) {
                                _csetf_strm_buf_end(v_new, current_value);
                            } else {
                                if (pcase_var.eql($POSITION)) {
                                    _csetf_strm_buf_position(v_new, current_value);
                                } else {
                                    Errors.error($str_alt15$Invalid_slot__S_for_construction_, current_arg);
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_stream_buffer(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.stream_buffer.$stream_buffer_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($STREAM)) {
                _csetf_strm_buf_stream(v_new, current_value);
            } else
                if (pcase_var.eql($BUFFER)) {
                    _csetf_strm_buf_buffer(v_new, current_value);
                } else
                    if (pcase_var.eql($END)) {
                        _csetf_strm_buf_end(v_new, current_value);
                    } else
                        if (pcase_var.eql($POSITION)) {
                            _csetf_strm_buf_position(v_new, current_value);
                        } else {
                            Errors.error($str16$Invalid_slot__S_for_construction_, current_arg);
                        }



        }
        return v_new;
    }

    public static SubLObject visit_defstruct_stream_buffer(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_STREAM_BUFFER, FOUR_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $STREAM, strm_buf_stream(obj));
        funcall(visitor_fn, obj, $SLOT, $BUFFER, strm_buf_buffer(obj));
        funcall(visitor_fn, obj, $SLOT, $END, strm_buf_end(obj));
        funcall(visitor_fn, obj, $SLOT, $POSITION, strm_buf_position(obj));
        funcall(visitor_fn, obj, $END, MAKE_STREAM_BUFFER, FOUR_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_stream_buffer_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_stream_buffer(obj, visitor_fn);
    }

    public static final SubLObject print_stream_buffer_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        {
            SubLObject size = stream_buffer_block_size(v_object);
            SubLObject stream_int = stream_buffer_stream(v_object);
            format(stream, $str_alt43$__STREAM_BUFFER_block_size__S_for, size, stream_int);
        }
        return v_object;
    }

    public static SubLObject print_stream_buffer(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLObject size = stream_buffer_block_size(v_object);
        final SubLObject stream_int = stream_buffer_stream(v_object);
        format(stream, $str51$__STREAM_BUFFER_block_size__S_for, size, stream_int);
        return v_object;
    }

    /**
     * Return a new stream-buffer with an BLOCK-SIZE
     */
    @LispMethod(comment = "Return a new stream-buffer with an BLOCK-SIZE")
    public static final SubLObject new_stream_buffer_alt(SubLObject stream, SubLObject block_size) {
        if (block_size == UNPROVIDED) {
            block_size = $int$1024;
        }
        SubLTrampolineFile.checkType(stream, STREAMP);
        SubLTrampolineFile.checkType(block_size, POSITIVE_INTEGER_P);
        {
            SubLObject v_stream_buffer = make_stream_buffer(UNPROVIDED);
            _csetf_strm_buf_stream(v_stream_buffer, stream);
            _csetf_strm_buf_buffer(v_stream_buffer, make_vector(block_size, NIL));
            stream_buffer_reset(v_stream_buffer);
            return v_stream_buffer;
        }
    }

    /**
     * Return a new stream-buffer with an BLOCK-SIZE
     */
    @LispMethod(comment = "Return a new stream-buffer with an BLOCK-SIZE")
    public static SubLObject new_stream_buffer(final SubLObject stream, SubLObject block_size) {
        if (block_size == UNPROVIDED) {
            block_size = $int$1024;
        }
        assert NIL != streamp(stream) : "! streamp(stream) " + ("Types.streamp(stream) " + "CommonSymbols.NIL != Types.streamp(stream) ") + stream;
        assert NIL != subl_promotions.positive_integer_p(block_size) : "! subl_promotions.positive_integer_p(block_size) " + ("subl_promotions.positive_integer_p(block_size) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(block_size) ") + block_size;
        final SubLObject v_stream_buffer = make_stream_buffer(UNPROVIDED);
        _csetf_strm_buf_stream(v_stream_buffer, stream);
        _csetf_strm_buf_buffer(v_stream_buffer, make_vector(block_size, NIL));
        stream_buffer_reset(v_stream_buffer);
        return v_stream_buffer;
    }

    /**
     * Render STREAM-BUFFER no longer usable.
     */
    @LispMethod(comment = "Render STREAM-BUFFER no longer usable.")
    public static final SubLObject destroy_stream_buffer_alt(SubLObject v_stream_buffer) {
        SubLTrampolineFile.checkType(v_stream_buffer, STREAM_BUFFER_P);
        _csetf_strm_buf_stream(v_stream_buffer, $DESTROYED);
        _csetf_strm_buf_buffer(v_stream_buffer, NIL);
        return v_stream_buffer;
    }

    /**
     * Render STREAM-BUFFER no longer usable.
     */
    @LispMethod(comment = "Render STREAM-BUFFER no longer usable.")
    public static SubLObject destroy_stream_buffer(final SubLObject v_stream_buffer) {
        assert NIL != stream_buffer_p(v_stream_buffer) : "! stream_buffer.stream_buffer_p(v_stream_buffer) " + ("stream_buffer.stream_buffer_p(v_stream_buffer) " + "CommonSymbols.NIL != stream_buffer.stream_buffer_p(v_stream_buffer) ") + v_stream_buffer;
        _csetf_strm_buf_stream(v_stream_buffer, $DESTROYED);
        _csetf_strm_buf_buffer(v_stream_buffer, NIL);
        return v_stream_buffer;
    }

    /**
     * Return the current size of STREAM-BUFFER.
     */
    @LispMethod(comment = "Return the current size of STREAM-BUFFER.")
    public static final SubLObject stream_buffer_stream_alt(SubLObject v_stream_buffer) {
        return strm_buf_stream(v_stream_buffer);
    }

    /**
     * Return the current size of STREAM-BUFFER.
     */
    @LispMethod(comment = "Return the current size of STREAM-BUFFER.")
    public static SubLObject stream_buffer_stream(final SubLObject v_stream_buffer) {
        return strm_buf_stream(v_stream_buffer);
    }

    /**
     * Return the current size of STREAM-BUFFER.
     */
    @LispMethod(comment = "Return the current size of STREAM-BUFFER.")
    public static final SubLObject stream_buffer_block_size_alt(SubLObject v_stream_buffer) {
        return length(strm_buf_buffer(v_stream_buffer));
    }

    /**
     * Return the current size of STREAM-BUFFER.
     */
    @LispMethod(comment = "Return the current size of STREAM-BUFFER.")
    public static SubLObject stream_buffer_block_size(final SubLObject v_stream_buffer) {
        return length(strm_buf_buffer(v_stream_buffer));
    }

    /**
     * Reset STREAM-BUFFER to an empty state (i.e. a position of 0).
     */
    @LispMethod(comment = "Reset STREAM-BUFFER to an empty state (i.e. a position of 0).")
    public static final SubLObject stream_buffer_reset_alt(SubLObject v_stream_buffer) {
        SubLTrampolineFile.checkType(v_stream_buffer, STREAM_BUFFER_P);
        {
            SubLObject size = stream_buffer_block_size(v_stream_buffer);
            _csetf_strm_buf_end(v_stream_buffer, size);
            _csetf_strm_buf_position(v_stream_buffer, size);
        }
        return v_stream_buffer;
    }

    /**
     * Reset STREAM-BUFFER to an empty state (i.e. a position of 0).
     */
    @LispMethod(comment = "Reset STREAM-BUFFER to an empty state (i.e. a position of 0).")
    public static SubLObject stream_buffer_reset(final SubLObject v_stream_buffer) {
        assert NIL != stream_buffer_p(v_stream_buffer) : "! stream_buffer.stream_buffer_p(v_stream_buffer) " + ("stream_buffer.stream_buffer_p(v_stream_buffer) " + "CommonSymbols.NIL != stream_buffer.stream_buffer_p(v_stream_buffer) ") + v_stream_buffer;
        final SubLObject size = stream_buffer_block_size(v_stream_buffer);
        _csetf_strm_buf_end(v_stream_buffer, size);
        _csetf_strm_buf_position(v_stream_buffer, size);
        return v_stream_buffer;
    }

    /**
     * Load in the next block-size characters into STREAM-BUFFER.
     */
    @LispMethod(comment = "Load in the next block-size characters into STREAM-BUFFER.")
    public static final SubLObject stream_buffer_load_alt(SubLObject v_stream_buffer) {
        {
            SubLObject stream = strm_buf_stream(v_stream_buffer);
            SubLObject buffer = strm_buf_buffer(v_stream_buffer);
            SubLObject size = length(buffer);
            SubLObject new_end = stream_buffer_read_sequence(buffer, stream, ZERO_INTEGER, size);
            _csetf_strm_buf_position(v_stream_buffer, ZERO_INTEGER);
            _csetf_strm_buf_end(v_stream_buffer, new_end);
            return new_end;
        }
    }

    /**
     * Load in the next block-size characters into STREAM-BUFFER.
     */
    @LispMethod(comment = "Load in the next block-size characters into STREAM-BUFFER.")
    public static SubLObject stream_buffer_load(final SubLObject v_stream_buffer) {
        final SubLObject stream = strm_buf_stream(v_stream_buffer);
        final SubLObject buffer = strm_buf_buffer(v_stream_buffer);
        final SubLObject size = length(buffer);
        final SubLObject new_end = stream_buffer_read_sequence(buffer, stream, ZERO_INTEGER, size);
        _csetf_strm_buf_position(v_stream_buffer, ZERO_INTEGER);
        _csetf_strm_buf_end(v_stream_buffer, new_end);
        return new_end;
    }

    /**
     * Read the next line from text STREAM into a string buffer.
     * If STRING-BUFFER is provided, and is large enough to hold the line,
     * it is reused as the string-buffer, otherwise a new one is allocated.
     * Return the resulting STRING-BUFFER, or EOF-VALUE if EOF was reached.
     */
    @LispMethod(comment = "Read the next line from text STREAM into a string buffer.\r\nIf STRING-BUFFER is provided, and is large enough to hold the line,\r\nit is reused as the string-buffer, otherwise a new one is allocated.\r\nReturn the resulting STRING-BUFFER, or EOF-VALUE if EOF was reached.\nRead the next line from text STREAM into a string buffer.\nIf STRING-BUFFER is provided, and is large enough to hold the line,\nit is reused as the string-buffer, otherwise a new one is allocated.\nReturn the resulting STRING-BUFFER, or EOF-VALUE if EOF was reached.")
    public static final SubLObject read_line_into_string_buffer_alt(SubLObject stream, SubLObject string_buffer, SubLObject eof_error_p, SubLObject eof_value) {
        if (string_buffer == UNPROVIDED) {
            string_buffer = NIL;
        }
        if (eof_error_p == UNPROVIDED) {
            eof_error_p = NIL;
        }
        if (eof_value == UNPROVIDED) {
            eof_value = NIL;
        }
        if (NIL == string_buffer) {
            string_buffer = new_string_buffer(UNPROVIDED);
        }
        string_buffer_reset(string_buffer);
        {
            SubLObject v_char = NIL;
            for (v_char = read_line_into_string_buffer_int(stream, string_buffer); !((NIL == v_char) || (v_char == CHAR_newline)); v_char = read_line_into_string_buffer_int(stream, string_buffer)) {
            }
            {
                SubLObject position = string_buffer_position(string_buffer);
                if (NIL != v_char) {
                    return string_buffer;
                } else {
                    if (position.isPositive()) {
                        return string_buffer;
                    } else {
                        if (NIL == eof_error_p) {
                            return eof_value;
                        } else {
                            return Errors.error($str_alt47$EOF_reached_on__S, stream);
                        }
                    }
                }
            }
        }
    }

    /**
     * Read the next line from text STREAM into a string buffer.
     * If STRING-BUFFER is provided, and is large enough to hold the line,
     * it is reused as the string-buffer, otherwise a new one is allocated.
     * Return the resulting STRING-BUFFER, or EOF-VALUE if EOF was reached.
     */
    @LispMethod(comment = "Read the next line from text STREAM into a string buffer.\r\nIf STRING-BUFFER is provided, and is large enough to hold the line,\r\nit is reused as the string-buffer, otherwise a new one is allocated.\r\nReturn the resulting STRING-BUFFER, or EOF-VALUE if EOF was reached.\nRead the next line from text STREAM into a string buffer.\nIf STRING-BUFFER is provided, and is large enough to hold the line,\nit is reused as the string-buffer, otherwise a new one is allocated.\nReturn the resulting STRING-BUFFER, or EOF-VALUE if EOF was reached.")
    public static SubLObject read_line_into_string_buffer(final SubLObject stream, SubLObject string_buffer, SubLObject eof_error_p, SubLObject eof_value) {
        if (string_buffer == UNPROVIDED) {
            string_buffer = NIL;
        }
        if (eof_error_p == UNPROVIDED) {
            eof_error_p = NIL;
        }
        if (eof_value == UNPROVIDED) {
            eof_value = NIL;
        }
        if (NIL == string_buffer) {
            string_buffer = new_string_buffer(UNPROVIDED);
        }
        string_buffer_reset(string_buffer);
        SubLObject v_char;
        for (v_char = NIL, v_char = read_line_into_string_buffer_int(stream, string_buffer); (NIL != v_char) && (!v_char.eql(CHAR_newline)); v_char = read_line_into_string_buffer_int(stream, string_buffer)) {
        }
        final SubLObject position = string_buffer_position(string_buffer);
        if (NIL != v_char) {
            return string_buffer;
        }
        if (position.isPositive()) {
            return string_buffer;
        }
        if (NIL == eof_error_p) {
            return eof_value;
        }
        return Errors.error($str55$EOF_reached_on__S, stream);
    }

    /**
     * Read the next line from text STREAM-BUFFER into a string buffer.
     * If STRING-BUFFER is provided, and is large enough to hold the line,
     * it is reused as the string-buffer, otherwise a new one is allocated.
     * Return the resulting STRING-BUFFER, or EOF-VALUE if EOF was reached.
     */
    @LispMethod(comment = "Read the next line from text STREAM-BUFFER into a string buffer.\r\nIf STRING-BUFFER is provided, and is large enough to hold the line,\r\nit is reused as the string-buffer, otherwise a new one is allocated.\r\nReturn the resulting STRING-BUFFER, or EOF-VALUE if EOF was reached.\nRead the next line from text STREAM-BUFFER into a string buffer.\nIf STRING-BUFFER is provided, and is large enough to hold the line,\nit is reused as the string-buffer, otherwise a new one is allocated.\nReturn the resulting STRING-BUFFER, or EOF-VALUE if EOF was reached.")
    public static final SubLObject stream_buffer_read_line_into_string_buffer_alt(SubLObject v_stream_buffer, SubLObject string_buffer, SubLObject eof_error_p, SubLObject eof_value) {
        if (string_buffer == UNPROVIDED) {
            string_buffer = NIL;
        }
        if (eof_error_p == UNPROVIDED) {
            eof_error_p = NIL;
        }
        if (eof_value == UNPROVIDED) {
            eof_value = NIL;
        }
        if (NIL == string_buffer) {
            string_buffer = new_string_buffer(UNPROVIDED);
        }
        string_buffer_reset(string_buffer);
        {
            SubLObject v_char = NIL;
            for (v_char = stream_buffer_read_line_into_string_buffer_int(v_stream_buffer, string_buffer); !((NIL == v_char) || (v_char == CHAR_newline)); v_char = stream_buffer_read_line_into_string_buffer_int(v_stream_buffer, string_buffer)) {
            }
            {
                SubLObject position = string_buffer_position(string_buffer);
                if (NIL != v_char) {
                    return string_buffer;
                } else {
                    if (position.isPositive()) {
                        return string_buffer;
                    } else {
                        if (NIL == eof_error_p) {
                            return eof_value;
                        } else {
                            return Errors.error($str_alt47$EOF_reached_on__S, stream_buffer_stream(v_stream_buffer));
                        }
                    }
                }
            }
        }
    }

    /**
     * Read the next line from text STREAM-BUFFER into a string buffer.
     * If STRING-BUFFER is provided, and is large enough to hold the line,
     * it is reused as the string-buffer, otherwise a new one is allocated.
     * Return the resulting STRING-BUFFER, or EOF-VALUE if EOF was reached.
     */
    @LispMethod(comment = "Read the next line from text STREAM-BUFFER into a string buffer.\r\nIf STRING-BUFFER is provided, and is large enough to hold the line,\r\nit is reused as the string-buffer, otherwise a new one is allocated.\r\nReturn the resulting STRING-BUFFER, or EOF-VALUE if EOF was reached.\nRead the next line from text STREAM-BUFFER into a string buffer.\nIf STRING-BUFFER is provided, and is large enough to hold the line,\nit is reused as the string-buffer, otherwise a new one is allocated.\nReturn the resulting STRING-BUFFER, or EOF-VALUE if EOF was reached.")
    public static SubLObject stream_buffer_read_line_into_string_buffer(final SubLObject v_stream_buffer, SubLObject string_buffer, SubLObject eof_error_p, SubLObject eof_value) {
        if (string_buffer == UNPROVIDED) {
            string_buffer = NIL;
        }
        if (eof_error_p == UNPROVIDED) {
            eof_error_p = NIL;
        }
        if (eof_value == UNPROVIDED) {
            eof_value = NIL;
        }
        if (NIL == string_buffer) {
            string_buffer = new_string_buffer(UNPROVIDED);
        }
        string_buffer_reset(string_buffer);
        SubLObject v_char;
        for (v_char = NIL, v_char = stream_buffer_read_line_into_string_buffer_int(v_stream_buffer, string_buffer); (NIL != v_char) && (!v_char.eql(CHAR_newline)); v_char = stream_buffer_read_line_into_string_buffer_int(v_stream_buffer, string_buffer)) {
        }
        final SubLObject position = string_buffer_position(string_buffer);
        if (NIL != v_char) {
            return string_buffer;
        }
        if (position.isPositive()) {
            return string_buffer;
        }
        if (NIL == eof_error_p) {
            return eof_value;
        }
        return Errors.error($str55$EOF_reached_on__S, stream_buffer_stream(v_stream_buffer));
    }

    /**
     * Copy the next character in the line from STREAM into STRING-BUFFER.
     * Return the character read, or NIL if STREAM-BUFFER is at EOF.
     * If the last character is #Newline, it is not copied into string-buffer.
     */
    @LispMethod(comment = "Copy the next character in the line from STREAM into STRING-BUFFER.\r\nReturn the character read, or NIL if STREAM-BUFFER is at EOF.\r\nIf the last character is #Newline, it is not copied into string-buffer.\nCopy the next character in the line from STREAM into STRING-BUFFER.\nReturn the character read, or NIL if STREAM-BUFFER is at EOF.\nIf the last character is #Newline, it is not copied into string-buffer.")
    public static final SubLObject read_line_into_string_buffer_int_alt(SubLObject stream, SubLObject string_buffer) {
        {
            SubLObject v_char = read_char(stream, NIL, NIL, UNPROVIDED);
            if (!((NIL == v_char) || (v_char == CHAR_newline))) {
                string_buffer_add(string_buffer, v_char);
            }
            return v_char;
        }
    }

    @LispMethod(comment = "Copy the next character in the line from STREAM into STRING-BUFFER.\r\nReturn the character read, or NIL if STREAM-BUFFER is at EOF.\r\nIf the last character is #Newline, it is not copied into string-buffer.\nCopy the next character in the line from STREAM into STRING-BUFFER.\nReturn the character read, or NIL if STREAM-BUFFER is at EOF.\nIf the last character is #Newline, it is not copied into string-buffer.")
    public static SubLObject read_line_into_string_buffer_int(final SubLObject stream, final SubLObject string_buffer) {
        final SubLObject v_char = read_char(stream, NIL, NIL, UNPROVIDED);
        if ((NIL != v_char) && (!v_char.eql(CHAR_newline))) {
            string_buffer_add(string_buffer, v_char);
        }
        return v_char;
    }

    /**
     * Copy the next sequence of characters in the line from STREAM-BUFFER into STRING-BUFFER.
     * Return the last character read, or NIL if STREAM-BUFFER is at EOF.
     * If the last character is #Newline, it is not copied into string-buffer.
     */
    @LispMethod(comment = "Copy the next sequence of characters in the line from STREAM-BUFFER into STRING-BUFFER.\r\nReturn the last character read, or NIL if STREAM-BUFFER is at EOF.\r\nIf the last character is #Newline, it is not copied into string-buffer.\nCopy the next sequence of characters in the line from STREAM-BUFFER into STRING-BUFFER.\nReturn the last character read, or NIL if STREAM-BUFFER is at EOF.\nIf the last character is #Newline, it is not copied into string-buffer.")
    public static final SubLObject stream_buffer_read_line_into_string_buffer_int_alt(SubLObject v_stream_buffer, SubLObject string_buffer) {
        {
            SubLObject buffer = strm_buf_buffer(v_stream_buffer);
            SubLObject position = strm_buf_position(v_stream_buffer);
            SubLObject end = strm_buf_end(v_stream_buffer);
            if (position.numE(end)) {
                {
                    SubLObject capacity = length(buffer);
                    if (end.numL(capacity)) {
                        return NIL;
                    } else {
                        stream_buffer_load(v_stream_buffer);
                        return stream_buffer_read_line_into_string_buffer_int(v_stream_buffer, string_buffer);
                    }
                }
            } else {
                {
                    SubLObject newline_position = position(CHAR_newline, buffer, symbol_function(EQ), symbol_function(IDENTITY), position, end);
                    if (NIL == newline_position) {
                        string_buffer_add_sequence(string_buffer, buffer, position, end);
                        _csetf_strm_buf_position(v_stream_buffer, end);
                        return aref(buffer, subtract(end, ONE_INTEGER));
                    } else {
                        string_buffer_add_sequence(string_buffer, buffer, position, newline_position);
                        _csetf_strm_buf_position(v_stream_buffer, add(ONE_INTEGER, newline_position));
                        return CHAR_newline;
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Copy the next sequence of characters in the line from STREAM-BUFFER into STRING-BUFFER.\r\nReturn the last character read, or NIL if STREAM-BUFFER is at EOF.\r\nIf the last character is #Newline, it is not copied into string-buffer.\nCopy the next sequence of characters in the line from STREAM-BUFFER into STRING-BUFFER.\nReturn the last character read, or NIL if STREAM-BUFFER is at EOF.\nIf the last character is #Newline, it is not copied into string-buffer.")
    public static SubLObject stream_buffer_read_line_into_string_buffer_int(final SubLObject v_stream_buffer, final SubLObject string_buffer) {
        final SubLObject buffer = strm_buf_buffer(v_stream_buffer);
        final SubLObject position = strm_buf_position(v_stream_buffer);
        final SubLObject end = strm_buf_end(v_stream_buffer);
        if (position.numE(end)) {
            final SubLObject capacity = length(buffer);
            if (end.numL(capacity)) {
                return NIL;
            }
            stream_buffer_load(v_stream_buffer);
            return stream_buffer_read_line_into_string_buffer_int(v_stream_buffer, string_buffer);
        } else {
            final SubLObject newline_position = position(CHAR_newline, buffer, symbol_function(EQ), symbol_function(IDENTITY), position, end);
            if (NIL == newline_position) {
                string_buffer_add_sequence(string_buffer, buffer, position, end);
                _csetf_strm_buf_position(v_stream_buffer, end);
                return aref(buffer, subtract(end, ONE_INTEGER));
            }
            string_buffer_add_sequence(string_buffer, buffer, position, newline_position);
            _csetf_strm_buf_position(v_stream_buffer, add(ONE_INTEGER, newline_position));
            return CHAR_newline;
        }
    }

    /**
     * Iterate over all the lines of a text stream to FILENAME, binding & updating LINE-BUFFER-VAR.
     * Evaluate BODY within the scope of each update to LINE-BUFFER-VAR.
     * LINE-BUFFER-VAR will be a string buffer which contains each line.
     * BLOCK-SIZE, if provided, enables buffering of reads from STREAM in BLOCK-SIZE blocks.
     * Halts as soon as DONE becomes non-nil, or when EOF on the stream is reached.
     */
    @LispMethod(comment = "Iterate over all the lines of a text stream to FILENAME, binding & updating LINE-BUFFER-VAR.\r\nEvaluate BODY within the scope of each update to LINE-BUFFER-VAR.\r\nLINE-BUFFER-VAR will be a string buffer which contains each line.\r\nBLOCK-SIZE, if provided, enables buffering of reads from STREAM in BLOCK-SIZE blocks.\r\nHalts as soon as DONE becomes non-nil, or when EOF on the stream is reached.\nIterate over all the lines of a text stream to FILENAME, binding & updating LINE-BUFFER-VAR.\nEvaluate BODY within the scope of each update to LINE-BUFFER-VAR.\nLINE-BUFFER-VAR will be a string buffer which contains each line.\nBLOCK-SIZE, if provided, enables buffering of reads from STREAM in BLOCK-SIZE blocks.\nHalts as soon as DONE becomes non-nil, or when EOF on the stream is reached.")
    public static final SubLObject do_file_lines_buffered_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt48);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject line_buffer_var = NIL;
                    SubLObject filename = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt48);
                    line_buffer_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt48);
                    filename = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt48);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt48);
                            if (NIL == member(current_1, $list_alt49, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt48);
                        }
                        {
                            SubLObject block_size_tail = property_list_member($BLOCK_SIZE, current);
                            SubLObject block_size = (NIL != block_size_tail) ? ((SubLObject) (cadr(block_size_tail))) : NIL;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject stream_var = $sym53$STREAM_VAR;
                                return list(WITH_PRIVATE_TEXT_FILE, listS(stream_var, filename, $list_alt55), list(PWHEN, list(STREAMP, stream_var), listS(DO_STREAM_LINES_BUFFERED, list(line_buffer_var, stream_var, $BLOCK_SIZE, block_size, $DONE, done), append(body, NIL))));
                            }
                        }
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Iterate over all the lines of a text stream to FILENAME, binding & updating LINE-BUFFER-VAR.\r\nEvaluate BODY within the scope of each update to LINE-BUFFER-VAR.\r\nLINE-BUFFER-VAR will be a string buffer which contains each line.\r\nBLOCK-SIZE, if provided, enables buffering of reads from STREAM in BLOCK-SIZE blocks.\r\nHalts as soon as DONE becomes non-nil, or when EOF on the stream is reached.\nIterate over all the lines of a text stream to FILENAME, binding & updating LINE-BUFFER-VAR.\nEvaluate BODY within the scope of each update to LINE-BUFFER-VAR.\nLINE-BUFFER-VAR will be a string buffer which contains each line.\nBLOCK-SIZE, if provided, enables buffering of reads from STREAM in BLOCK-SIZE blocks.\nHalts as soon as DONE becomes non-nil, or when EOF on the stream is reached.")
    public static SubLObject do_file_lines_buffered(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list56);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject line_buffer_var = NIL;
        SubLObject filename = NIL;
        destructuring_bind_must_consp(current, datum, $list56);
        line_buffer_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list56);
        filename = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list56);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list56);
            if (NIL == member(current_$1, $list57, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list56);
        }
        final SubLObject block_size_tail = property_list_member($BLOCK_SIZE, current);
        final SubLObject block_size = (NIL != block_size_tail) ? cadr(block_size_tail) : NIL;
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (NIL != progress_message) {
            final SubLObject message_var = $sym62$MESSAGE_VAR;
            final SubLObject stream_var = $sym63$STREAM_VAR;
            final SubLObject sofar = $sym64$SOFAR;
            final SubLObject total = $sym65$TOTAL;
            return list(WITH_PRIVATE_TEXT_FILE, listS(stream_var, filename, $list67), list(PWHEN, list(STREAMP, stream_var), list(CLET, list(list(message_var, progress_message), bq_cons(sofar, $list69), list(total, list(FILE_LENGTH, stream_var))), list(NOTING_PERCENT_PROGRESS, message_var, listS(DO_STREAM_LINES_BUFFERED, list(line_buffer_var, stream_var, $BLOCK_SIZE, block_size, $DONE, done), list(NOTE_PERCENT_PROGRESS, sofar, total), list(CSETQ, sofar, list(FILE_POSITION, stream_var)), append(body, NIL))))));
        }
        final SubLObject stream_var2 = $sym76$STREAM_VAR;
        return list(WITH_PRIVATE_TEXT_FILE, listS(stream_var2, filename, $list67), list(PWHEN, list(STREAMP, stream_var2), listS(DO_STREAM_LINES_BUFFERED, list(line_buffer_var, stream_var2, $BLOCK_SIZE, block_size, $DONE, done), append(body, NIL))));
    }

    /**
     * Iterate over all the lines of text STREAM, binding & updating LINE-BUFFER-VAR.
     * Evaluate BODY within the scope of each update to LINE-BUFFER-VAR.
     * LINE-BUFFER-VAR will be a string buffer which contains each line.
     * BLOCK-SIZE, if provided, enables buffering of reads from STREAM in BLOCK-SIZE blocks.
     * Halts as soon as DONE becomes non-nil, or when EOF on STREAM is reached.
     */
    @LispMethod(comment = "Iterate over all the lines of text STREAM, binding & updating LINE-BUFFER-VAR.\r\nEvaluate BODY within the scope of each update to LINE-BUFFER-VAR.\r\nLINE-BUFFER-VAR will be a string buffer which contains each line.\r\nBLOCK-SIZE, if provided, enables buffering of reads from STREAM in BLOCK-SIZE blocks.\r\nHalts as soon as DONE becomes non-nil, or when EOF on STREAM is reached.\nIterate over all the lines of text STREAM, binding & updating LINE-BUFFER-VAR.\nEvaluate BODY within the scope of each update to LINE-BUFFER-VAR.\nLINE-BUFFER-VAR will be a string buffer which contains each line.\nBLOCK-SIZE, if provided, enables buffering of reads from STREAM in BLOCK-SIZE blocks.\nHalts as soon as DONE becomes non-nil, or when EOF on STREAM is reached.")
    public static final SubLObject do_stream_lines_buffered_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt58);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject line_buffer_var = NIL;
                    SubLObject stream = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt58);
                    line_buffer_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt58);
                    stream = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_2 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt58);
                            current_2 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt58);
                            if (NIL == member(current_2, $list_alt49, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_2 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt58);
                        }
                        {
                            SubLObject block_size_tail = property_list_member($BLOCK_SIZE, current);
                            SubLObject block_size = (NIL != block_size_tail) ? ((SubLObject) (cadr(block_size_tail))) : NIL;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject done_var = $sym59$DONE_VAR;
                                SubLObject stream_buffer_var = $sym60$STREAM_BUFFER_VAR;
                                return list(CLET, list(list(done_var, done)), list(CMULTIPLE_VALUE_BIND, list(stream_buffer_var, line_buffer_var), listS(DO_STREAM_LINES_BUFFERED_INITIALIZE, stream, append(NIL != block_size ? ((SubLObject) (list(block_size))) : NIL, NIL)), list(CUNWIND_PROTECT, list(WHILE, list(CNOT, done_var), list(PIF, list(DO_STREAM_LINES_BUFFERED_NEXT, stream_buffer_var, line_buffer_var), bq_cons(PROGN, append(body, NIL != done ? ((SubLObject) (list(list(CSETQ, done_var, done)))) : NIL, NIL)), listS(CSETQ, done_var, $list_alt70)))), list(DO_STREAM_LINES_BUFFERED_FINALIZE, line_buffer_var, stream_buffer_var)));
                            }
                        }
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Iterate over all the lines of text STREAM, binding & updating LINE-BUFFER-VAR.\r\nEvaluate BODY within the scope of each update to LINE-BUFFER-VAR.\r\nLINE-BUFFER-VAR will be a string buffer which contains each line.\r\nBLOCK-SIZE, if provided, enables buffering of reads from STREAM in BLOCK-SIZE blocks.\r\nHalts as soon as DONE becomes non-nil, or when EOF on STREAM is reached.\nIterate over all the lines of text STREAM, binding & updating LINE-BUFFER-VAR.\nEvaluate BODY within the scope of each update to LINE-BUFFER-VAR.\nLINE-BUFFER-VAR will be a string buffer which contains each line.\nBLOCK-SIZE, if provided, enables buffering of reads from STREAM in BLOCK-SIZE blocks.\nHalts as soon as DONE becomes non-nil, or when EOF on STREAM is reached.")
    public static SubLObject do_stream_lines_buffered(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list77);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject line_buffer_var = NIL;
        SubLObject stream = NIL;
        destructuring_bind_must_consp(current, datum, $list77);
        line_buffer_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list77);
        stream = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list77);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list77);
            if (NIL == member(current_$2, $list78, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list77);
        }
        final SubLObject block_size_tail = property_list_member($BLOCK_SIZE, current);
        final SubLObject block_size = (NIL != block_size_tail) ? cadr(block_size_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject done_var = $sym79$DONE_VAR;
        final SubLObject stream_buffer_var = $sym80$STREAM_BUFFER_VAR;
        return list(CLET, list(list(done_var, done)), list(CMULTIPLE_VALUE_BIND, list(stream_buffer_var, line_buffer_var), listS(DO_STREAM_LINES_BUFFERED_INITIALIZE, stream, append(NIL != block_size ? list(block_size) : NIL, NIL)), list(CUNWIND_PROTECT, list(WHILE, list(CNOT, done_var), list(PIF, list(DO_STREAM_LINES_BUFFERED_NEXT, stream_buffer_var, line_buffer_var), bq_cons(PROGN, append(body, NIL != done ? list(list(CSETQ, done_var, done)) : NIL, NIL)), listS(CSETQ, done_var, $list89)))), list(DO_STREAM_LINES_BUFFERED_FINALIZE, line_buffer_var, stream_buffer_var)));
    }

    public static final SubLObject do_stream_lines_buffered_initialize_alt(SubLObject stream, SubLObject block_size) {
        if (block_size == UNPROVIDED) {
            block_size = NIL;
        }
        {
            SubLObject v_stream_buffer = (NIL != block_size) ? ((SubLObject) (new_stream_buffer(stream, block_size))) : stream;
            SubLObject line_buffer = new_string_buffer(UNPROVIDED);
            return values(v_stream_buffer, line_buffer);
        }
    }

    public static SubLObject do_stream_lines_buffered_initialize(final SubLObject stream, SubLObject block_size) {
        if (block_size == UNPROVIDED) {
            block_size = NIL;
        }
        final SubLObject v_stream_buffer = (NIL != block_size) ? new_stream_buffer(stream, block_size) : stream;
        final SubLObject line_buffer = new_string_buffer(UNPROVIDED);
        return values(v_stream_buffer, line_buffer);
    }

    public static final SubLObject do_stream_lines_buffered_next_alt(SubLObject v_stream_buffer, SubLObject line_buffer) {
        if (v_stream_buffer.isStream()) {
            return read_line_into_string_buffer(v_stream_buffer, line_buffer, NIL, NIL);
        } else {
            return stream_buffer_read_line_into_string_buffer(v_stream_buffer, line_buffer, NIL, NIL);
        }
    }

    public static SubLObject do_stream_lines_buffered_next(final SubLObject v_stream_buffer, final SubLObject line_buffer) {
        if (v_stream_buffer.isStream()) {
            return read_line_into_string_buffer(v_stream_buffer, line_buffer, NIL, NIL);
        }
        return stream_buffer_read_line_into_string_buffer(v_stream_buffer, line_buffer, NIL, NIL);
    }

    public static final SubLObject do_stream_lines_buffered_finalize_alt(SubLObject line_buffer, SubLObject v_stream_buffer) {
        if (NIL != line_buffer) {
            destroy_string_buffer(line_buffer);
        }
        if (!v_stream_buffer.isStream()) {
            destroy_stream_buffer(v_stream_buffer);
        }
        return NIL;
    }

    public static SubLObject do_stream_lines_buffered_finalize(final SubLObject line_buffer, final SubLObject v_stream_buffer) {
        if (NIL != line_buffer) {
            destroy_string_buffer(line_buffer);
        }
        if (!v_stream_buffer.isStream()) {
            destroy_stream_buffer(v_stream_buffer);
        }
        return NIL;
    }

    public static final SubLObject new_stream_line_iterator_alt(SubLObject stream, SubLObject block_size) {
        if (block_size == UNPROVIDED) {
            block_size = NIL;
        }
        return iteration.new_iterator(make_stream_line_iterator_state(stream, block_size), $sym72$STREAM_LINE_ITERATOR_DONE_, STREAM_LINE_ITERATOR_NEXT, STREAM_LINE_ITERATOR_FINALIZE);
    }

    public static SubLObject new_stream_line_iterator(final SubLObject stream, SubLObject block_size) {
        if (block_size == UNPROVIDED) {
            block_size = NIL;
        }
        return iteration.new_iterator(make_stream_line_iterator_state(stream, block_size), $sym91$STREAM_LINE_ITERATOR_DONE_, STREAM_LINE_ITERATOR_NEXT, STREAM_LINE_ITERATOR_FINALIZE);
    }

    public static final SubLObject make_stream_line_iterator_state_alt(SubLObject stream, SubLObject block_size) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject v_stream_buffer = do_stream_lines_buffered_initialize(stream, block_size);
                SubLObject line_buffer = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return list(v_stream_buffer, line_buffer);
            }
        }
    }

    public static SubLObject make_stream_line_iterator_state(final SubLObject stream, final SubLObject block_size) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_stream_buffer = do_stream_lines_buffered_initialize(stream, block_size);
        final SubLObject line_buffer = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return list(v_stream_buffer, line_buffer);
    }

    public static final SubLObject stream_line_iterator_doneP_alt(SubLObject state) {
        {
            SubLObject datum = state;
            SubLObject current = datum;
            SubLObject v_stream_buffer = NIL;
            SubLObject line_buffer = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt75);
            v_stream_buffer = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt75);
            line_buffer = current.first();
            current = current.rest();
            if (NIL == current) {
                return sublisp_null(line_buffer);
            } else {
                cdestructuring_bind_error(datum, $list_alt75);
            }
        }
        return NIL;
    }

    public static SubLObject stream_line_iterator_doneP(final SubLObject state) {
        SubLObject v_stream_buffer = NIL;
        SubLObject line_buffer = NIL;
        destructuring_bind_must_consp(state, state, $list94);
        v_stream_buffer = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list94);
        line_buffer = current.first();
        current = current.rest();
        if (NIL == current) {
            return sublisp_null(line_buffer);
        }
        cdestructuring_bind_error(state, $list94);
        return NIL;
    }

    public static final SubLObject stream_line_iterator_next_alt(SubLObject state) {
        {
            SubLObject datum = state;
            SubLObject current = datum;
            SubLObject v_stream_buffer = NIL;
            SubLObject line_buffer = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt75);
            v_stream_buffer = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt75);
            line_buffer = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject next = do_stream_lines_buffered_next(v_stream_buffer, line_buffer);
                    SubLObject doneP = NIL;
                    if (NIL == next) {
                        set_nth(ONE_INTEGER, state, NIL);
                        destroy_string_buffer(line_buffer);
                        doneP = T;
                    }
                    return values(next, state, doneP);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt75);
            }
        }
        return NIL;
    }

    public static SubLObject stream_line_iterator_next(final SubLObject state) {
        SubLObject v_stream_buffer = NIL;
        SubLObject line_buffer = NIL;
        destructuring_bind_must_consp(state, state, $list94);
        v_stream_buffer = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list94);
        line_buffer = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject next = do_stream_lines_buffered_next(v_stream_buffer, line_buffer);
            SubLObject doneP = NIL;
            if (NIL == next) {
                set_nth(ONE_INTEGER, state, NIL);
                destroy_string_buffer(line_buffer);
                doneP = T;
            }
            return values(next, state, doneP);
        }
        cdestructuring_bind_error(state, $list94);
        return NIL;
    }

    public static final SubLObject stream_line_iterator_finalize_alt(SubLObject state) {
        {
            SubLObject datum = state;
            SubLObject current = datum;
            SubLObject v_stream_buffer = NIL;
            SubLObject line_buffer = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt75);
            v_stream_buffer = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt75);
            line_buffer = current.first();
            current = current.rest();
            if (NIL == current) {
                do_stream_lines_buffered_finalize(line_buffer, v_stream_buffer);
                return T;
            } else {
                cdestructuring_bind_error(datum, $list_alt75);
            }
        }
        return NIL;
    }

    public static SubLObject stream_line_iterator_finalize(final SubLObject state) {
        SubLObject v_stream_buffer = NIL;
        SubLObject line_buffer = NIL;
        destructuring_bind_must_consp(state, state, $list94);
        v_stream_buffer = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list94);
        line_buffer = current.first();
        current = current.rest();
        if (NIL == current) {
            do_stream_lines_buffered_finalize(line_buffer, v_stream_buffer);
            return T;
        }
        cdestructuring_bind_error(state, $list94);
        return NIL;
    }

    public static final SubLObject buffered_file_grep_alt(SubLObject pattern, SubLObject stream, SubLObject match_options) {
        if (match_options == UNPROVIDED) {
            match_options = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject line_count = ZERO_INTEGER;
                SubLObject matches = NIL;
                SubLObject done_var = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject stream_buffer_var = do_stream_lines_buffered_initialize(stream, UNPROVIDED);
                    SubLObject line_buffer = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    while (NIL == done_var) {
                        if (NIL != do_stream_lines_buffered_next(stream_buffer_var, line_buffer)) {
                            {
                                SubLObject line_string = string_buffer_string(line_buffer);
                                SubLObject line_end = string_buffer_position(line_buffer);
                                line_count = add(line_count, ONE_INTEGER);
                                {
                                    SubLObject line_matches = regular_expression_utilities.find_all_matches_within_string(pattern, line_string, match_options, NIL, ZERO_INTEGER, line_end);
                                    if (NIL != line_matches) {
                                        {
                                            SubLObject line = string_utilities.substring(line_string, ZERO_INTEGER, line_end);
                                            matches = cons(list(line_count, line, line_matches), matches);
                                        }
                                    }
                                }
                            }
                        } else {
                            done_var = T;
                        }
                    } 
                    do_stream_lines_buffered_finalize(line_buffer, stream_buffer_var);
                }
                return nreverse(matches);
            }
        }
    }

    public static SubLObject buffered_file_grep(final SubLObject pattern, final SubLObject stream, SubLObject match_options) {
        if (match_options == UNPROVIDED) {
            match_options = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject line_count = ZERO_INTEGER;
        SubLObject matches = NIL;
        SubLObject done_var = NIL;
        thread.resetMultipleValues();
        final SubLObject stream_buffer_var = do_stream_lines_buffered_initialize(stream, UNPROVIDED);
        final SubLObject line_buffer = thread.secondMultipleValue();
        thread.resetMultipleValues();
        while (NIL == done_var) {
            if (NIL != do_stream_lines_buffered_next(stream_buffer_var, line_buffer)) {
                final SubLObject line_string = string_buffer_string(line_buffer);
                final SubLObject line_end = string_buffer_position(line_buffer);
                line_count = add(line_count, ONE_INTEGER);
                final SubLObject line_matches = regular_expression_utilities.find_all_matches_within_string(pattern, line_string, match_options, NIL, ZERO_INTEGER, line_end);
                if (NIL == line_matches) {
                    continue;
                }
                final SubLObject line = string_utilities.substring(line_string, ZERO_INTEGER, line_end);
                matches = cons(list(line_count, line, line_matches), matches);
            } else {
                done_var = T;
            }
        } 
        do_stream_lines_buffered_finalize(line_buffer, stream_buffer_var);
        return nreverse(matches);
    }

    public static SubLObject declare_stream_buffer_file() {
        declareFunction("stream_buffer_read_sequence", "STREAM-BUFFER-READ-SEQUENCE", 2, 2, false);
        declareFunction("string_buffer_replace", "STRING-BUFFER-REPLACE", 2, 4, false);
        declareFunction("read_text_into_vector", "READ-TEXT-INTO-VECTOR", 2, 2, false);
        declareFunction("replace_string_from_vector", "REPLACE-STRING-FROM-VECTOR", 2, 4, false);
        declareFunction("string_buffer_print_function_trampoline", "STRING-BUFFER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("string_buffer_p", "STRING-BUFFER-P", 1, 0, false);
        new stream_buffer.$string_buffer_p$UnaryFunction();
        declareFunction("strbuf_string", "STRBUF-STRING", 1, 0, false);
        declareFunction("strbuf_position", "STRBUF-POSITION", 1, 0, false);
        declareFunction("_csetf_strbuf_string", "_CSETF-STRBUF-STRING", 2, 0, false);
        declareFunction("_csetf_strbuf_position", "_CSETF-STRBUF-POSITION", 2, 0, false);
        declareFunction("make_string_buffer", "MAKE-STRING-BUFFER", 0, 1, false);
        declareFunction("visit_defstruct_string_buffer", "VISIT-DEFSTRUCT-STRING-BUFFER", 2, 0, false);
        declareFunction("visit_defstruct_object_string_buffer_method", "VISIT-DEFSTRUCT-OBJECT-STRING-BUFFER-METHOD", 2, 0, false);
        declareFunction("print_string_buffer", "PRINT-STRING-BUFFER", 3, 0, false);
        declareFunction("new_string_buffer", "NEW-STRING-BUFFER", 0, 1, false);
        declareFunction("destroy_string_buffer", "DESTROY-STRING-BUFFER", 1, 0, false);
        declareFunction("string_buffer_string", "STRING-BUFFER-STRING", 1, 0, false);
        declareFunction("string_buffer_position", "STRING-BUFFER-POSITION", 1, 0, false);
        declareMacro("with_string_buffer", "WITH-STRING-BUFFER");
        declareFunction("string_buffer_capacity", "STRING-BUFFER-CAPACITY", 1, 0, false);
        declareFunction("string_buffer_write", "STRING-BUFFER-WRITE", 1, 1, false);
        declareFunction("string_buffer_read", "STRING-BUFFER-READ", 1, 3, false);
        declareFunction("string_buffer_reset", "STRING-BUFFER-RESET", 1, 0, false);
        declareFunction("string_buffer_add", "STRING-BUFFER-ADD", 2, 0, false);
        declareFunction("string_buffer_add_sequence", "STRING-BUFFER-ADD-SEQUENCE", 2, 2, false);
        declareFunction("stream_buffer_print_function_trampoline", "STREAM-BUFFER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("stream_buffer_p", "STREAM-BUFFER-P", 1, 0, false);
        new stream_buffer.$stream_buffer_p$UnaryFunction();
        declareFunction("strm_buf_stream", "STRM-BUF-STREAM", 1, 0, false);
        declareFunction("strm_buf_buffer", "STRM-BUF-BUFFER", 1, 0, false);
        declareFunction("strm_buf_end", "STRM-BUF-END", 1, 0, false);
        declareFunction("strm_buf_position", "STRM-BUF-POSITION", 1, 0, false);
        declareFunction("_csetf_strm_buf_stream", "_CSETF-STRM-BUF-STREAM", 2, 0, false);
        declareFunction("_csetf_strm_buf_buffer", "_CSETF-STRM-BUF-BUFFER", 2, 0, false);
        declareFunction("_csetf_strm_buf_end", "_CSETF-STRM-BUF-END", 2, 0, false);
        declareFunction("_csetf_strm_buf_position", "_CSETF-STRM-BUF-POSITION", 2, 0, false);
        declareFunction("make_stream_buffer", "MAKE-STREAM-BUFFER", 0, 1, false);
        declareFunction("visit_defstruct_stream_buffer", "VISIT-DEFSTRUCT-STREAM-BUFFER", 2, 0, false);
        declareFunction("visit_defstruct_object_stream_buffer_method", "VISIT-DEFSTRUCT-OBJECT-STREAM-BUFFER-METHOD", 2, 0, false);
        declareFunction("print_stream_buffer", "PRINT-STREAM-BUFFER", 3, 0, false);
        declareFunction("new_stream_buffer", "NEW-STREAM-BUFFER", 1, 1, false);
        declareFunction("destroy_stream_buffer", "DESTROY-STREAM-BUFFER", 1, 0, false);
        declareFunction("stream_buffer_stream", "STREAM-BUFFER-STREAM", 1, 0, false);
        declareFunction("stream_buffer_block_size", "STREAM-BUFFER-BLOCK-SIZE", 1, 0, false);
        declareFunction("stream_buffer_reset", "STREAM-BUFFER-RESET", 1, 0, false);
        declareFunction("stream_buffer_load", "STREAM-BUFFER-LOAD", 1, 0, false);
        declareFunction("read_line_into_string_buffer", "READ-LINE-INTO-STRING-BUFFER", 1, 3, false);
        declareFunction("stream_buffer_read_line_into_string_buffer", "STREAM-BUFFER-READ-LINE-INTO-STRING-BUFFER", 1, 3, false);
        declareFunction("read_line_into_string_buffer_int", "READ-LINE-INTO-STRING-BUFFER-INT", 2, 0, false);
        declareFunction("stream_buffer_read_line_into_string_buffer_int", "STREAM-BUFFER-READ-LINE-INTO-STRING-BUFFER-INT", 2, 0, false);
        declareMacro("do_file_lines_buffered", "DO-FILE-LINES-BUFFERED");
        declareMacro("do_stream_lines_buffered", "DO-STREAM-LINES-BUFFERED");
        declareFunction("do_stream_lines_buffered_initialize", "DO-STREAM-LINES-BUFFERED-INITIALIZE", 1, 1, false);
        declareFunction("do_stream_lines_buffered_next", "DO-STREAM-LINES-BUFFERED-NEXT", 2, 0, false);
        declareFunction("do_stream_lines_buffered_finalize", "DO-STREAM-LINES-BUFFERED-FINALIZE", 2, 0, false);
        declareFunction("new_stream_line_iterator", "NEW-STREAM-LINE-ITERATOR", 1, 1, false);
        declareFunction("make_stream_line_iterator_state", "MAKE-STREAM-LINE-ITERATOR-STATE", 2, 0, false);
        declareFunction("stream_line_iterator_doneP", "STREAM-LINE-ITERATOR-DONE?", 1, 0, false);
        declareFunction("stream_line_iterator_next", "STREAM-LINE-ITERATOR-NEXT", 1, 0, false);
        declareFunction("stream_line_iterator_finalize", "STREAM-LINE-ITERATOR-FINALIZE", 1, 0, false);
        declareFunction("buffered_file_grep", "BUFFERED-FILE-GREP", 2, 1, false);
        return NIL;
    }

    public static SubLObject init_stream_buffer_file() {
        defconstant("*DTP-STRING-BUFFER*", STRING_BUFFER);
        defconstant("*DTP-STREAM-BUFFER*", STREAM_BUFFER);
        return NIL;
    }

    public static final SubLObject setup_stream_buffer_file_alt() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_string_buffer$.getGlobalValue(), symbol_function(STRING_BUFFER_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(STRBUF_STRING, _CSETF_STRBUF_STRING);
        def_csetf(STRBUF_POSITION, _CSETF_STRBUF_POSITION);
        identity(STRING_BUFFER);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_stream_buffer$.getGlobalValue(), symbol_function(STREAM_BUFFER_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(STRM_BUF_STREAM, _CSETF_STRM_BUF_STREAM);
        def_csetf(STRM_BUF_BUFFER, _CSETF_STRM_BUF_BUFFER);
        def_csetf(STRM_BUF_END, _CSETF_STRM_BUF_END);
        def_csetf(STRM_BUF_POSITION, _CSETF_STRM_BUF_POSITION);
        identity(STREAM_BUFFER);
        register_macro_helper(DO_STREAM_LINES_BUFFERED_INITIALIZE, DO_STREAM_LINES_BUFFERED);
        register_macro_helper(DO_STREAM_LINES_BUFFERED_NEXT, DO_STREAM_LINES_BUFFERED);
        register_macro_helper(DO_STREAM_LINES_BUFFERED_FINALIZE, DO_STREAM_LINES_BUFFERED);
        note_funcall_helper_function($sym72$STREAM_LINE_ITERATOR_DONE_);
        note_funcall_helper_function(STREAM_LINE_ITERATOR_NEXT);
        note_funcall_helper_function(STREAM_LINE_ITERATOR_FINALIZE);
        return NIL;
    }

    public static SubLObject setup_stream_buffer_file() {
        if (SubLFiles.USE_V1) {
            register_method($print_object_method_table$.getGlobalValue(), $dtp_string_buffer$.getGlobalValue(), symbol_function(STRING_BUFFER_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list9);
            def_csetf(STRBUF_STRING, _CSETF_STRBUF_STRING);
            def_csetf(STRBUF_POSITION, _CSETF_STRBUF_POSITION);
            identity(STRING_BUFFER);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_string_buffer$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_STRING_BUFFER_METHOD));
            register_method($print_object_method_table$.getGlobalValue(), $dtp_stream_buffer$.getGlobalValue(), symbol_function(STREAM_BUFFER_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list38);
            def_csetf(STRM_BUF_STREAM, _CSETF_STRM_BUF_STREAM);
            def_csetf(STRM_BUF_BUFFER, _CSETF_STRM_BUF_BUFFER);
            def_csetf(STRM_BUF_END, _CSETF_STRM_BUF_END);
            def_csetf(STRM_BUF_POSITION, _CSETF_STRM_BUF_POSITION);
            identity(STREAM_BUFFER);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_stream_buffer$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_STREAM_BUFFER_METHOD));
            register_macro_helper(DO_STREAM_LINES_BUFFERED_INITIALIZE, DO_STREAM_LINES_BUFFERED);
            register_macro_helper(DO_STREAM_LINES_BUFFERED_NEXT, DO_STREAM_LINES_BUFFERED);
            register_macro_helper(DO_STREAM_LINES_BUFFERED_FINALIZE, DO_STREAM_LINES_BUFFERED);
            note_funcall_helper_function($sym91$STREAM_LINE_ITERATOR_DONE_);
            note_funcall_helper_function(STREAM_LINE_ITERATOR_NEXT);
            note_funcall_helper_function(STREAM_LINE_ITERATOR_FINALIZE);
        }
        if (SubLFiles.USE_V2) {
            note_funcall_helper_function($sym72$STREAM_LINE_ITERATOR_DONE_);
        }
        return NIL;
    }

    public static SubLObject setup_stream_buffer_file_Previous() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_string_buffer$.getGlobalValue(), symbol_function(STRING_BUFFER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list9);
        def_csetf(STRBUF_STRING, _CSETF_STRBUF_STRING);
        def_csetf(STRBUF_POSITION, _CSETF_STRBUF_POSITION);
        identity(STRING_BUFFER);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_string_buffer$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_STRING_BUFFER_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_stream_buffer$.getGlobalValue(), symbol_function(STREAM_BUFFER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list38);
        def_csetf(STRM_BUF_STREAM, _CSETF_STRM_BUF_STREAM);
        def_csetf(STRM_BUF_BUFFER, _CSETF_STRM_BUF_BUFFER);
        def_csetf(STRM_BUF_END, _CSETF_STRM_BUF_END);
        def_csetf(STRM_BUF_POSITION, _CSETF_STRM_BUF_POSITION);
        identity(STREAM_BUFFER);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_stream_buffer$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_STREAM_BUFFER_METHOD));
        register_macro_helper(DO_STREAM_LINES_BUFFERED_INITIALIZE, DO_STREAM_LINES_BUFFERED);
        register_macro_helper(DO_STREAM_LINES_BUFFERED_NEXT, DO_STREAM_LINES_BUFFERED);
        register_macro_helper(DO_STREAM_LINES_BUFFERED_FINALIZE, DO_STREAM_LINES_BUFFERED);
        note_funcall_helper_function($sym91$STREAM_LINE_ITERATOR_DONE_);
        note_funcall_helper_function(STREAM_LINE_ITERATOR_NEXT);
        note_funcall_helper_function(STREAM_LINE_ITERATOR_FINALIZE);
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$Improper_index_bounds__S__S = makeString("Improper index bounds ~S ~S");

    static private final SubLList $list_alt3 = list(makeSymbol("STRING"), makeSymbol("POSITION"));

    static private final SubLList $list_alt4 = list(makeKeyword("STRING"), makeKeyword("POSITION"));

    static private final SubLList $list_alt5 = list(makeSymbol("STRBUF-STRING"), makeSymbol("STRBUF-POSITION"));

    @Override
    public void declareFunctions() {
        declare_stream_buffer_file();
    }

    static private final SubLList $list_alt6 = list(makeSymbol("_CSETF-STRBUF-STRING"), makeSymbol("_CSETF-STRBUF-POSITION"));

    @Override
    public void initializeVariables() {
        init_stream_buffer_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_stream_buffer_file();
    }

    static {
    }

    static private final SubLString $str_alt15$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt16$__STRING_BUFFER_capacity__S_posit = makeString("#<STRING-BUFFER capacity=~S position=~S>");

    static private final SubLList $list_alt20 = list(list(makeSymbol("BUFFER-STRING-VAR"), makeSymbol("BUFFER-END-VAR")), makeSymbol("STRING-BUFFER"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt26 = list(makeSymbol("STREAM"), makeSymbol("BUFFER"), makeSymbol("END"), makeSymbol("POSITION"));

    public static final class $string_buffer_p$UnaryFunction extends UnaryFunction {
        public $string_buffer_p$UnaryFunction() {
            super(extractFunctionNamed("STRING-BUFFER-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return string_buffer_p(arg1);
        }
    }

    static private final SubLList $list_alt27 = list(makeKeyword("STREAM"), makeKeyword("BUFFER"), makeKeyword("END"), makeKeyword("POSITION"));

    static private final SubLList $list_alt28 = list(makeSymbol("STRM-BUF-STREAM"), makeSymbol("STRM-BUF-BUFFER"), makeSymbol("STRM-BUF-END"), makeSymbol("STRM-BUF-POSITION"));

    public static final class $stream_buffer_native extends SubLStructNative {
        public SubLObject $stream;

        public SubLObject $buffer;

        public SubLObject $end;

        public SubLObject $position;

        private static final SubLStructDeclNative structDecl;

        public $stream_buffer_native() {
            stream_buffer.$stream_buffer_native.this.$stream = Lisp.NIL;
            stream_buffer.$stream_buffer_native.this.$buffer = Lisp.NIL;
            stream_buffer.$stream_buffer_native.this.$end = Lisp.NIL;
            stream_buffer.$stream_buffer_native.this.$position = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return stream_buffer.$stream_buffer_native.this.$stream;
        }

        @Override
        public SubLObject getField3() {
            return stream_buffer.$stream_buffer_native.this.$buffer;
        }

        @Override
        public SubLObject getField4() {
            return stream_buffer.$stream_buffer_native.this.$end;
        }

        @Override
        public SubLObject getField5() {
            return stream_buffer.$stream_buffer_native.this.$position;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return stream_buffer.$stream_buffer_native.this.$stream = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return stream_buffer.$stream_buffer_native.this.$buffer = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return stream_buffer.$stream_buffer_native.this.$end = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return stream_buffer.$stream_buffer_native.this.$position = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.stream_buffer.$stream_buffer_native.class, STREAM_BUFFER, STREAM_BUFFER_P, $list32, $list33, new String[]{ "$stream", "$buffer", "$end", "$position" }, $list34, $list35, PRINT_STREAM_BUFFER);
        }
    }

    static private final SubLList $list_alt29 = list(makeSymbol("_CSETF-STRM-BUF-STREAM"), makeSymbol("_CSETF-STRM-BUF-BUFFER"), makeSymbol("_CSETF-STRM-BUF-END"), makeSymbol("_CSETF-STRM-BUF-POSITION"));

    static private final SubLString $str_alt43$__STREAM_BUFFER_block_size__S_for = makeString("#<STREAM-BUFFER block size=~S for ~S>");

    static private final SubLString $str_alt47$EOF_reached_on__S = makeString("EOF reached on ~S");

    static private final SubLList $list_alt48 = list(list(makeSymbol("LINE-BUFFER-VAR"), makeSymbol("FILENAME"), makeSymbol("&KEY"), makeSymbol("BLOCK-SIZE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt49 = list(makeKeyword("BLOCK-SIZE"), $DONE);

    public static final class $stream_buffer_p$UnaryFunction extends UnaryFunction {
        public $stream_buffer_p$UnaryFunction() {
            super(extractFunctionNamed("STREAM-BUFFER-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return stream_buffer_p(arg1);
        }
    }

    static private final SubLSymbol $sym53$STREAM_VAR = makeUninternedSymbol("STREAM-VAR");

    static private final SubLList $list_alt55 = list(makeKeyword("INPUT"));

    static private final SubLList $list_alt58 = list(list(makeSymbol("LINE-BUFFER-VAR"), makeSymbol("STREAM"), makeSymbol("&KEY"), makeSymbol("BLOCK-SIZE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym59$DONE_VAR = makeUninternedSymbol("DONE-VAR");

    static private final SubLSymbol $sym60$STREAM_BUFFER_VAR = makeUninternedSymbol("STREAM-BUFFER-VAR");

    static private final SubLList $list_alt70 = list(T);

    static private final SubLSymbol $sym72$STREAM_LINE_ITERATOR_DONE_ = makeSymbol("STREAM-LINE-ITERATOR-DONE?");

    static private final SubLList $list_alt75 = list(makeSymbol("STREAM-BUFFER"), makeSymbol("LINE-BUFFER"));
}

/**
 * Total time: 291 ms
 */
