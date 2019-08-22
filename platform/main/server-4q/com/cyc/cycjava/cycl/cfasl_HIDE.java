///**
// * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
// */
//package com.cyc.cycjava.cycl;
//import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
//import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
//import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
//import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
//import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
//import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
//import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
//import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.*;
//import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
//import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
//import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
//import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
//import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
//import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
//import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
//import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
//import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
//import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
//import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
//import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
//import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
//import static com.cyc.tool.subl.util.SubLFiles.*;
//
//import java.util.Iterator;
//import java.util.Map;
//
//import org.armedbear.lisp.Lisp;
//
//import com.cyc.cycjava.cycl.*;
//import com.cyc.cycjava.cycl.cfasl.$cfasl_encoding_stream_native;
//import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
//import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
//import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
//import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
//import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
//import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
//import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
//import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
//import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
//import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
//import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
//import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
//import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
//import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
//import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
//import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
//import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
//import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
//import com.cyc.tool.subl.util.SubLFile;
//import com.cyc.tool.subl.util.SubLTrampolineFile;
//import com.cyc.tool.subl.util.SubLTranslatedFile;
//
//
///**
// * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
// *  module:      CFASL
// *  source file: /cyc/top/cycl/cfasl.lisp
// *  created:     2019/07/03 17:37:10
// */
//class cfasl_HIDE extends SubLTranslatedFile implements V02 {
//    // // Constructor
//    private cfasl_HIDE() {
//    }
//
//    public static final SubLFile me = new cfasl_HIDE();
//
//
//    // // Definitions
//    /**
//     * Return T iff OBJECT is a possible cfasl encoding.
//     */
//    public static final SubLObject cfasl_encoding_p(SubLObject v_object) {
//        return vector_utilities.byte_vector_p(v_object);
//    }
//
//    public static final SubLObject cfasl_encodable_stream_p(SubLObject v_object) {
//        return makeBoolean(v_object.isStream() || (NIL != cfasl_encoding_stream_p(v_object)));
//    }
//
//    //    public static final class $cfasl_encoding_stream_native_HIDE extends SubLStructNative {
//    //        @Override
//    //	public SubLStructDecl getStructDecl() {
//    //	    return structDecl;
//    //        }
//    //
//    //        @Override
//    //	public SubLObject getField2() {
//    //            return $internal_stream;
//    //        }
//    //
//    //        @Override
//    //	public SubLObject setField2(SubLObject value) {
//    //            return $internal_stream = value;
//    //        }
//    //
//    //        public SubLObject $internal_stream = Lisp.NIL;
//    //
//    //	private static final SubLStructDeclNative structDecl = makeStructDeclNative($cfasl_encoding_stream_native.class, CFASL_ENCODING_STREAM, CFASL_ENCODING_STREAM_P, $list_alt2, $list_alt3, new String[] { "$internal_stream" }, $list_alt4, $list_alt5, DEFAULT_STRUCT_PRINT_FUNCTION);
//    //    }
//
//    // defconstant
//    public static final SubLSymbol $dtp_cfasl_encoding_stream$ = makeSymbol("*DTP-CFASL-ENCODING-STREAM*");
//
//    public static final SubLObject cfasl_encoding_stream_print_function_trampoline(SubLObject v_object, SubLObject stream) {
//        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
//        return NIL;
//    }
//
//    public static final SubLObject cfasl_encoding_stream_p(SubLObject v_object) {
//	return v_object.getJavaClass() ==$cfasl_encoding_stream_native.class ? ((SubLObject) (T)) : NIL;
//    }
//
//    public static final class $cfasl_encoding_stream_p$UnaryFunction extends UnaryFunction {
//        public $cfasl_encoding_stream_p$UnaryFunction() {
//            super(extractFunctionNamed("CFASL-ENCODING-STREAM-P"));
//        }
//
//        @Override
//	public SubLObject processItem(SubLObject arg1) {
//            return cfasl_encoding_stream_p(arg1);
//        }
//    }
//
//    public static final SubLObject cfasl_encoding_stream_internal_stream(SubLObject v_object) {
//        SubLTrampolineFile.checkType(v_object, CFASL_ENCODING_STREAM_P);
//        return v_object.getField2();
//    }
//
//    public static final SubLObject _csetf_cfasl_encoding_stream_internal_stream(SubLObject v_object, SubLObject value) {
//        SubLTrampolineFile.checkType(v_object, CFASL_ENCODING_STREAM_P);
//        return v_object.setField2(value);
//    }
//
//    public static final SubLObject make_cfasl_encoding_stream(SubLObject arglist) {
//        if (arglist == UNPROVIDED) {
//            arglist = NIL;
//        }
//        {
//	    SubLObject v_new = new $cfasl_encoding_stream_native();
//            SubLObject next = NIL;
//            for (next = arglist; NIL != next; next = cddr(next)) {
//                {
//                    SubLObject current_arg = next.first();
//                    SubLObject current_value = cadr(next);
//                    SubLObject pcase_var = current_arg;
//                    if (pcase_var.eql($INTERNAL_STREAM)) {
//                        _csetf_cfasl_encoding_stream_internal_stream(v_new, current_value);
//                    } else {
//                        Errors.error($str_alt11$Invalid_slot__S_for_construction_, current_arg);
//                    }
//                }
//            }
//            return v_new;
//        }
//    }
//
//    public static final SubLObject with_cfasl_output_to_hex_string(SubLObject macroform, SubLObject environment) {
//        {
//            SubLObject datum = macroform.rest();
//            SubLObject current = datum;
//            destructuring_bind_must_consp(current, datum, $list_alt12);
//            {
//                SubLObject temp = current.rest();
//                current = current.first();
//                {
//                    SubLObject stream = NIL;
//                    SubLObject string = NIL;
//                    destructuring_bind_must_consp(current, datum, $list_alt12);
//                    stream = current.first();
//                    current = current.rest();
//                    destructuring_bind_must_consp(current, datum, $list_alt12);
//                    string = current.first();
//                    current = current.rest();
//                    if (NIL == current) {
//                        current = temp;
//                        {
//                            SubLObject body = current;
//                            SubLTrampolineFile.checkType(stream, SYMBOLP);
//                            SubLTrampolineFile.checkType(string, SYMBOLP);
//                            return list(CLET, list(bq_cons(stream, $list_alt15)), list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, list(list(CSETQ, string, list(CFASL_ENCODING_STRING_STREAM_ENCODING, stream))))), list(CLOSE_CFASL_ENCODING_STREAM, stream)));
//                        }
//                    } else {
//                        cdestructuring_bind_error(datum, $list_alt12);
//                    }
//                }
//            }
//        }
//        return NIL;
//    }
//
//    public static final SubLObject cfasl_encoding_string_stream_encoding(SubLObject encoding_stream) {
//        return get_output_stream_string(cfasl_encoding_stream_internal_stream(encoding_stream));
//    }
//
//    public static final SubLObject with_cfasl_output_to_byte_vector(SubLObject macroform, SubLObject environment) {
//        {
//            SubLObject datum = macroform.rest();
//            SubLObject current = datum;
//            destructuring_bind_must_consp(current, datum, $list_alt22);
//            {
//                SubLObject temp = current.rest();
//                current = current.first();
//                {
//                    SubLObject stream = NIL;
//                    SubLObject byte_vector = NIL;
//                    destructuring_bind_must_consp(current, datum, $list_alt22);
//                    stream = current.first();
//                    current = current.rest();
//                    destructuring_bind_must_consp(current, datum, $list_alt22);
//                    byte_vector = current.first();
//                    current = current.rest();
//                    if (NIL == current) {
//                        current = temp;
//                        {
//                            SubLObject body = current;
//                            SubLTrampolineFile.checkType(stream, SYMBOLP);
//                            SubLTrampolineFile.checkType(byte_vector, SYMBOLP);
//                            return list(CLET, list(bq_cons(stream, $list_alt15)), list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, list(list(CSETQ, byte_vector, list(CFASL_ENCODING_STREAM_ENCODING, stream))))), list(CLOSE_CFASL_ENCODING_STREAM, stream)));
//                        }
//                    } else {
//                        cdestructuring_bind_error(datum, $list_alt22);
//                    }
//                }
//            }
//        }
//        return NIL;
//    }
//
//    public static final SubLObject new_cfasl_encoding_stream() {
//        {
//            SubLObject encoding_stream = make_cfasl_encoding_stream(UNPROVIDED);
//            SubLObject string_stream = make_private_string_output_stream();
//            _csetf_cfasl_encoding_stream_internal_stream(encoding_stream, string_stream);
//            return encoding_stream;
//        }
//    }
//
//    public static final SubLObject cfasl_encoding_stream_write_byte(SubLObject v_byte, SubLObject encoding_stream) {
//        {
//            final SubLThread thread = SubLProcess.currentSubLThread();
//            {
//                SubLObject internal_stream = cfasl_encoding_stream_internal_stream(encoding_stream);
//                thread.resetMultipleValues();
//                {
//                    SubLObject high_char = vector_utilities.byte_to_hex_chars(v_byte);
//                    SubLObject low_char = thread.secondMultipleValue();
//                    thread.resetMultipleValues();
//                    write_char(high_char, internal_stream);
//                    write_char(low_char, internal_stream);
//                }
//            }
//            return v_byte;
//        }
//    }
//
//    public static final SubLObject cfasl_encoding_stream_encoding(SubLObject encoding_stream) {
//        SubLTrampolineFile.checkType(encoding_stream, CFASL_ENCODING_STREAM_P);
//        {
//            SubLObject encoding_string = cfasl_encoding_string_stream_encoding(encoding_stream);
//            SubLObject encoding = vector_utilities.hex_char_string_to_byte_vector(encoding_string);
//            return encoding;
//        }
//    }
//
//    public static final SubLObject close_cfasl_encoding_stream(SubLObject encoding_stream) {
//        SubLTrampolineFile.checkType(encoding_stream, CFASL_ENCODING_STREAM_P);
//        return close(cfasl_encoding_stream_internal_stream(encoding_stream), UNPROVIDED);
//    }
//
//    /**
//     * Return the cfasl encoding of OBJECT as a vector of bytes.
//     * The encoding is relevant to this image only.
//     */
//    public static final SubLObject cfasl_encode(SubLObject v_object) {
//        {
//            SubLObject encoding = NIL;
//            SubLObject stream = new_cfasl_encoding_stream();
//            try {
//                cfasl_output(v_object, stream);
//                encoding = cfasl_encoding_stream_encoding(stream);
//            } finally {
//                {
//                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
//                    try {
//                        bind($is_thread_performing_cleanupP$, T);
//                        close_cfasl_encoding_stream(stream);
//                    } finally {
//                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
//                    }
//                }
//            }
//            return encoding;
//        }
//    }
//
//    /**
//     * Return the cfasl encoding of OBJECT as a vector of bytes.
//     * The encoding is relevant to any image, not just this one.
//     */
//    public static final SubLObject cfasl_encode_externalized(SubLObject v_object) {
//        {
//            SubLObject encoding = NIL;
//            SubLObject stream = new_cfasl_encoding_stream();
//            try {
//                cfasl_output_externalized(v_object, stream);
//                encoding = cfasl_encoding_stream_encoding(stream);
//            } finally {
//                {
//                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
//                    try {
//                        bind($is_thread_performing_cleanupP$, T);
//                        close_cfasl_encoding_stream(stream);
//                    } finally {
//                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
//                    }
//                }
//            }
//            return encoding;
//        }
//    }
//
//    /**
//     * Temporary control variable, should eventually stay T.
//     */
//    // defparameter
//    private static final SubLSymbol $terse_guid_serialization_enabledP$ = makeSymbol("*TERSE-GUID-SERIALIZATION-ENABLED?*");
//
//    /**
//     * Temporary control variable, the only controls whether cfasl-econde-externalized-terse uses terse GUID serialization
//     */
//    // defparameter
//    public static final SubLSymbol $terse_guid_serialization_enabled_for_cfasl_encode_externalizedP$ = makeSymbol("*TERSE-GUID-SERIALIZATION-ENABLED-FOR-CFASL-ENCODE-EXTERNALIZED?*");
//
//    /**
//     * Return the cfasl encoding of OBJECT as a vector of bytes.
//     * The encoding is relevant to any image, not just this one.
//     * GUIDs are encoded tersely.
//     */
//    public static final SubLObject cfasl_encode_externalized_terse(SubLObject v_object) {
//        {
//            final SubLThread thread = SubLProcess.currentSubLThread();
//            {
//                SubLObject encoding = NIL;
//                {
//                    SubLObject _prev_bind_0 = $terse_guid_serialization_enabledP$.currentBinding(thread);
//                    try {
//                        $terse_guid_serialization_enabledP$.bind($terse_guid_serialization_enabled_for_cfasl_encode_externalizedP$.getDynamicValue(thread) == $UNINITIALIZED ? ((SubLObject) (T)) : $terse_guid_serialization_enabled_for_cfasl_encode_externalizedP$.getDynamicValue(thread), thread);
//                        {
//                            SubLObject stream = new_cfasl_encoding_stream();
//                            try {
//                                cfasl_output_externalized(v_object, stream);
//                                encoding = cfasl_encoding_stream_encoding(stream);
//                            } finally {
//                                {
//                                    SubLObject _prev_bind_0_1 = $is_thread_performing_cleanupP$.currentBinding(thread);
//                                    try {
//                                        $is_thread_performing_cleanupP$.bind(T, thread);
//                                        close_cfasl_encoding_stream(stream);
//                                    } finally {
//                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_1, thread);
//                                    }
//                                }
//                            }
//                        }
//                    } finally {
//                        $terse_guid_serialization_enabledP$.rebind(_prev_bind_0, thread);
//                    }
//                }
//                return encoding;
//            }
//        }
//    }
//
//    public static final SubLObject cfasl_decodable_stream_p(SubLObject v_object) {
//        return makeBoolean(v_object.isStream() || (NIL != cfasl_decoding_stream_p(v_object)));
//    }
//
//    public static final class $cfasl_decoding_stream_native extends SubLStructNative {
//        @Override
//	public SubLStructDecl getStructDecl() {
//            return cfasl_HIDE.$cfasl_decoding_stream_native.structDecl;
//        }
//
//        @Override
//	public SubLObject getField2() {
//            return $internal_stream;
//        }
//
//        @Override
//	public SubLObject setField2(SubLObject value) {
//            return $internal_stream = value;
//        }
//
//        public SubLObject $internal_stream = Lisp.NIL;
//
//        private static final SubLStructDeclNative structDecl = makeStructDeclNative(cfasl_HIDE.$cfasl_decoding_stream_native.class, CFASL_DECODING_STREAM, CFASL_DECODING_STREAM_P, $list_alt2, $list_alt3, new String[]{ "$internal_stream" }, $list_alt30, $list_alt31, DEFAULT_STRUCT_PRINT_FUNCTION);
//    }
//
//    // defconstant
//    public static final SubLSymbol $dtp_cfasl_decoding_stream$ = makeSymbol("*DTP-CFASL-DECODING-STREAM*");
//
//    public static final SubLObject cfasl_decoding_stream_print_function_trampoline(SubLObject v_object, SubLObject stream) {
//        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
//        return NIL;
//    }
//
//    public static final SubLObject cfasl_decoding_stream_p(SubLObject v_object) {
//        return v_object.getJavaClass() ==cfasl_HIDE.$cfasl_decoding_stream_native.class ? ((SubLObject) (T)) : NIL;
//    }
//
//    public static final class $cfasl_decoding_stream_p$UnaryFunction extends UnaryFunction {
//        public $cfasl_decoding_stream_p$UnaryFunction() {
//            super(extractFunctionNamed("CFASL-DECODING-STREAM-P"));
//        }
//
//        @Override
//	public SubLObject processItem(SubLObject arg1) {
//            return cfasl_decoding_stream_p(arg1);
//        }
//    }
//
//    public static final SubLObject cfasl_decoding_stream_internal_stream(SubLObject v_object) {
//        SubLTrampolineFile.checkType(v_object, CFASL_DECODING_STREAM_P);
//        return v_object.getField2();
//    }
//
//    public static final SubLObject _csetf_cfasl_decoding_stream_internal_stream(SubLObject v_object, SubLObject value) {
//        SubLTrampolineFile.checkType(v_object, CFASL_DECODING_STREAM_P);
//        return v_object.setField2(value);
//    }
//
//    public static final SubLObject make_cfasl_decoding_stream(SubLObject arglist) {
//        if (arglist == UNPROVIDED) {
//            arglist = NIL;
//        }
//        {
//            SubLObject v_new = new cfasl_HIDE.$cfasl_decoding_stream_native();
//            SubLObject next = NIL;
//            for (next = arglist; NIL != next; next = cddr(next)) {
//                {
//                    SubLObject current_arg = next.first();
//                    SubLObject current_value = cadr(next);
//                    SubLObject pcase_var = current_arg;
//                    if (pcase_var.eql($INTERNAL_STREAM)) {
//                        _csetf_cfasl_decoding_stream_internal_stream(v_new, current_value);
//                    } else {
//                        Errors.error($str_alt11$Invalid_slot__S_for_construction_, current_arg);
//                    }
//                }
//            }
//            return v_new;
//        }
//    }
//
//    public static final SubLObject with_cfasl_input_from_string(SubLObject macroform, SubLObject environment) {
//        {
//            SubLObject datum = macroform.rest();
//            SubLObject current = datum;
//            destructuring_bind_must_consp(current, datum, $list_alt12);
//            {
//                SubLObject temp = current.rest();
//                current = current.first();
//                {
//                    SubLObject stream = NIL;
//                    SubLObject string = NIL;
//                    destructuring_bind_must_consp(current, datum, $list_alt12);
//                    stream = current.first();
//                    current = current.rest();
//                    destructuring_bind_must_consp(current, datum, $list_alt12);
//                    string = current.first();
//                    current = current.rest();
//                    if (NIL == current) {
//                        current = temp;
//                        {
//                            SubLObject body = current;
//                            SubLTrampolineFile.checkType(stream, SYMBOLP);
//                            return list(CLET, list(list(stream, list(NEW_CFASL_DECODING_STREAM_FROM_STRING, string))), list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), list(CLOSE_CFASL_DECODING_STREAM, stream)));
//                        }
//                    } else {
//                        cdestructuring_bind_error(datum, $list_alt12);
//                    }
//                }
//            }
//        }
//        return NIL;
//    }
//
//    public static final SubLObject new_cfasl_decoding_stream_from_string(SubLObject encoding_string) {
//        {
//            SubLObject decoding_stream = make_cfasl_decoding_stream(UNPROVIDED);
//            SubLObject internal_stream = make_private_string_input_stream(encoding_string, UNPROVIDED, UNPROVIDED);
//            _csetf_cfasl_decoding_stream_internal_stream(decoding_stream, internal_stream);
//            return decoding_stream;
//        }
//    }
//
//    public static final SubLObject with_cfasl_input_from_byte_vector(SubLObject macroform, SubLObject environment) {
//        {
//            SubLObject datum = macroform.rest();
//            SubLObject current = datum;
//            destructuring_bind_must_consp(current, datum, $list_alt22);
//            {
//                SubLObject temp = current.rest();
//                current = current.first();
//                {
//                    SubLObject stream = NIL;
//                    SubLObject byte_vector = NIL;
//                    destructuring_bind_must_consp(current, datum, $list_alt22);
//                    stream = current.first();
//                    current = current.rest();
//                    destructuring_bind_must_consp(current, datum, $list_alt22);
//                    byte_vector = current.first();
//                    current = current.rest();
//                    if (NIL == current) {
//                        current = temp;
//                        {
//                            SubLObject body = current;
//                            SubLTrampolineFile.checkType(stream, SYMBOLP);
//                            return list(CLET, list(list(stream, list(NEW_CFASL_DECODING_STREAM, byte_vector))), list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), list(CLOSE_CFASL_DECODING_STREAM, stream)));
//                        }
//                    } else {
//                        cdestructuring_bind_error(datum, $list_alt22);
//                    }
//                }
//            }
//        }
//        return NIL;
//    }
//
//    public static final SubLObject new_cfasl_decoding_stream(SubLObject encoding) {
//        SubLTrampolineFile.checkType(encoding, CFASL_ENCODING_P);
//        {
//            SubLObject encoding_string = vector_utilities.byte_vector_to_hex_char_string(encoding);
//            return new_cfasl_decoding_stream_from_string(encoding_string);
//        }
//    }
//
//    public static final SubLObject cfasl_decoding_stream_read_byte(SubLObject decoding_stream, SubLObject eof_error_p, SubLObject eof_value) {
//        if (eof_error_p == UNPROVIDED) {
//            eof_error_p = T;
//        }
//        if (eof_value == UNPROVIDED) {
//            eof_value = $EOF;
//        }
//        {
//            SubLObject internal_stream = cfasl_decoding_stream_internal_stream(decoding_stream);
//            SubLObject high_char = read_char(internal_stream, eof_error_p, eof_value, UNPROVIDED);
//            SubLObject low_char = read_char(internal_stream, eof_error_p, eof_value, UNPROVIDED);
//            if (eof_value.eql(high_char) || eof_value.eql(low_char)) {
//                return eof_value;
//            }
//            return vector_utilities.hex_chars_to_byte(high_char, low_char);
//        }
//    }
//
//    public static final SubLObject close_cfasl_decoding_stream(SubLObject decoding_stream) {
//        SubLTrampolineFile.checkType(decoding_stream, CFASL_DECODING_STREAM_P);
//        return close(cfasl_decoding_stream_internal_stream(decoding_stream), UNPROVIDED);
//    }
//
//    /**
//     * Return the object encoded in the cfasl ENCODING.
//     */
//    public static final SubLObject cfasl_decode(SubLObject encoding) {
//        SubLTrampolineFile.checkType(encoding, CFASL_ENCODING_P);
//        {
//            SubLObject v_object = NIL;
//            SubLObject stream = new_cfasl_decoding_stream(encoding);
//            try {
//                v_object = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
//            } finally {
//                {
//                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
//                    try {
//                        bind($is_thread_performing_cleanupP$, T);
//                        close_cfasl_decoding_stream(stream);
//                    } finally {
//                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
//                    }
//                }
//            }
//            return v_object;
//        }
//    }
//
//    public static final class $cfasl_count_stream_native extends SubLStructNative {
//        @Override
//	public SubLStructDecl getStructDecl() {
//            return cfasl_HIDE.$cfasl_count_stream_native.structDecl;
//        }
//
//        @Override
//	public SubLObject getField2() {
//            return $position;
//        }
//
//        @Override
//	public SubLObject setField2(SubLObject value) {
//            return $position = value;
//        }
//
//        public SubLObject $position = Lisp.NIL;
//
//        private static final SubLStructDeclNative structDecl = makeStructDeclNative(cfasl_HIDE.$cfasl_count_stream_native.class, CFASL_COUNT_STREAM, CFASL_COUNT_STREAM_P, $list_alt45, $list_alt46, new String[]{ "$position" }, $list_alt47, $list_alt48, DEFAULT_STRUCT_PRINT_FUNCTION);
//    }
//
//    // defconstant
//    public static final SubLSymbol $dtp_cfasl_count_stream$ = makeSymbol("*DTP-CFASL-COUNT-STREAM*");
//
//    public static final SubLObject cfasl_count_stream_print_function_trampoline(SubLObject v_object, SubLObject stream) {
//        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
//        return NIL;
//    }
//
//    public static final SubLObject cfasl_count_stream_p(SubLObject v_object) {
//        return v_object.getJavaClass() ==cfasl_HIDE.$cfasl_count_stream_native.class ? ((SubLObject) (T)) : NIL;
//    }
//
//    public static final class $cfasl_count_stream_p$UnaryFunction extends UnaryFunction {
//        public $cfasl_count_stream_p$UnaryFunction() {
//            super(extractFunctionNamed("CFASL-COUNT-STREAM-P"));
//        }
//
//        @Override
//	public SubLObject processItem(SubLObject arg1) {
//            return cfasl_count_stream_p(arg1);
//        }
//    }
//
//    public static final SubLObject cfasl_count_stream_position(SubLObject v_object) {
//        SubLTrampolineFile.checkType(v_object, CFASL_COUNT_STREAM_P);
//        return v_object.getField2();
//    }
//
//    public static final SubLObject _csetf_cfasl_count_stream_position(SubLObject v_object, SubLObject value) {
//        SubLTrampolineFile.checkType(v_object, CFASL_COUNT_STREAM_P);
//        return v_object.setField2(value);
//    }
//
//    public static final SubLObject make_cfasl_count_stream(SubLObject arglist) {
//        if (arglist == UNPROVIDED) {
//            arglist = NIL;
//        }
//        {
//            SubLObject v_new = new cfasl_HIDE.$cfasl_count_stream_native();
//            SubLObject next = NIL;
//            for (next = arglist; NIL != next; next = cddr(next)) {
//                {
//                    SubLObject current_arg = next.first();
//                    SubLObject current_value = cadr(next);
//                    SubLObject pcase_var = current_arg;
//                    if (pcase_var.eql($POSITION)) {
//                        _csetf_cfasl_count_stream_position(v_new, current_value);
//                    } else {
//                        Errors.error($str_alt11$Invalid_slot__S_for_construction_, current_arg);
//                    }
//                }
//            }
//            return v_new;
//        }
//    }
//
//    public static final SubLObject with_cfasl_output_to_count_stream(SubLObject macroform, SubLObject environment) {
//        {
//            SubLObject datum = macroform.rest();
//            SubLObject current = datum;
//            destructuring_bind_must_consp(current, datum, $list_alt53);
//            {
//                SubLObject temp = current.rest();
//                current = current.first();
//                {
//                    SubLObject stream = NIL;
//                    SubLObject count = NIL;
//                    destructuring_bind_must_consp(current, datum, $list_alt53);
//                    stream = current.first();
//                    current = current.rest();
//                    destructuring_bind_must_consp(current, datum, $list_alt53);
//                    count = current.first();
//                    current = current.rest();
//                    if (NIL == current) {
//                        current = temp;
//                        {
//                            SubLObject body = current;
//                            SubLTrampolineFile.checkType(stream, SYMBOLP);
//                            SubLTrampolineFile.checkType(count, SYMBOLP);
//                            return list(CLET, list(bq_cons(stream, $list_alt54)), list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, list(list(CSETQ, count, list(CFASL_COUNT_STREAM_SIZE, stream))))), list(CLOSE_CFASL_COUNT_STREAM, stream)));
//                        }
//                    } else {
//                        cdestructuring_bind_error(datum, $list_alt53);
//                    }
//                }
//            }
//        }
//        return NIL;
//    }
//
//    public static final SubLObject new_cfasl_count_stream() {
//        {
//            SubLObject stream = make_cfasl_count_stream(UNPROVIDED);
//            _csetf_cfasl_count_stream_position(stream, ZERO_INTEGER);
//            return stream;
//        }
//    }
//
//    public static final SubLObject cfasl_count_stream_write_byte(SubLObject v_byte, SubLObject count_stream) {
//        _csetf_cfasl_count_stream_position(count_stream, add(cfasl_count_stream_position(count_stream), ONE_INTEGER));
//        return v_byte;
//    }
//
//    public static final SubLObject cfasl_count_stream_size(SubLObject count_stream) {
//        SubLTrampolineFile.checkType(count_stream, CFASL_COUNT_STREAM_P);
//        return cfasl_count_stream_position(count_stream);
//    }
//
//    public static final SubLObject close_cfasl_count_stream(SubLObject count_stream) {
//        SubLTrampolineFile.checkType(count_stream, CFASL_COUNT_STREAM_P);
//        return NIL;
//    }
//
//    /**
//     * Return the number of bytes in the cfasl encoding of OBJECT.
//     */
//    public static final SubLObject cfasl_object_size(SubLObject v_object) {
//        {
//            SubLObject size = NIL;
//            SubLObject stream = new_cfasl_count_stream();
//            try {
//                cfasl_output(v_object, stream);
//                size = cfasl_count_stream_size(stream);
//            } finally {
//                {
//                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
//                    try {
//                        bind($is_thread_performing_cleanupP$, T);
//                        close_cfasl_count_stream(stream);
//                    } finally {
//                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
//                    }
//                }
//            }
//            return size;
//        }
//    }
//
//    /**
//     * Return the number of bytes in the external cfasl encoding of OBJECT.
//     */
//    public static final SubLObject cfasl_externalized_object_size(SubLObject v_object) {
//        {
//            SubLObject size = NIL;
//            SubLObject stream = new_cfasl_count_stream();
//            try {
//                cfasl_output_externalized(v_object, stream);
//                size = cfasl_count_stream_size(stream);
//            } finally {
//                {
//                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
//                    try {
//                        bind($is_thread_performing_cleanupP$, T);
//                        close_cfasl_count_stream(stream);
//                    } finally {
//                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
//                    }
//                }
//            }
//            return size;
//        }
//    }
//
//    // defparameter
//    public static final SubLSymbol $cfasl_stream_extensions_enabled$ = makeSymbol("*CFASL-STREAM-EXTENSIONS-ENABLED*");
//
//    // defparameter
//    public static final SubLSymbol $cfasl_unread_byte$ = makeSymbol("*CFASL-UNREAD-BYTE*");
//
//    /**
//     * Evaluate BODY with extended CFASL stream support enabled.
//     */
//    public static final SubLObject with_cfasl_stream_extensions(SubLObject macroform, SubLObject environment) {
//        {
//            SubLObject datum = macroform.rest();
//            SubLObject current = datum;
//            SubLObject body = current;
//            return listS(CLET, $list_alt57, append(body, NIL));
//        }
//    }
//
//    /**
//     * Output OBJECT to STREAM in the CFASL protocol.
//     * The encoding is relevant to this image only.
//     */
//    public static final SubLObject cfasl_output(SubLObject v_object, SubLObject stream) {
//        if (NIL != cfasl_compression.cfasl_compress_objectP(v_object)) {
//            return cfasl_compression.cfasl_output_object_compressed(v_object, stream);
//        } else {
//            return cfasl_output_object(v_object, stream);
//        }
//    }
//
//    /**
//     * Output OBJECT to STREAM in the CFASL protocol.
//     * The encoding is relevant to any image, not just this one.
//     */
//    public static final SubLObject cfasl_output_externalized(SubLObject v_object, SubLObject stream) {
//        return cfasl_output_externalization(v_object, stream);
//    }
//
//    public static final SubLObject cfasl_output_maybe_externalized(SubLObject v_object, SubLObject stream, SubLObject externalizedP) {
//        if (NIL != externalizedP) {
//            return cfasl_output_externalized(v_object, stream);
//        } else {
//            return cfasl_output(v_object, stream);
//        }
//    }
//
//    // deflexical
//    public static final SubLSymbol $cfasl_output_object_method_table$ = makeSymbol("*CFASL-OUTPUT-OBJECT-METHOD-TABLE*");
//
//    public static final SubLObject cfasl_output_object(SubLObject v_object, SubLObject stream) {
//        {
//            SubLObject method_function = method_func(v_object, $cfasl_output_object_method_table$.getGlobalValue());
//            if (NIL != method_function) {
//                return funcall(method_function, v_object, stream);
//            }
//            if (NIL == handle_cfasl_extensions(v_object, stream)) {
//                {
//                    SubLObject msg = NIL;
//                    try {
//                        {
//                            SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
//                            try {
//                                bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
//                                try {
//                                    cfasl_output_defstruct_recipe(v_object, stream);
//                                } catch (Throwable catch_var) {
//                                    Errors.handleThrowable(catch_var, NIL);
//                                }
//                            } finally {
//                                rebind(Errors.$error_handler$, _prev_bind_0);
//                            }
//                        }
//                    } catch (Throwable ccatch_env_var) {
//                        msg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
//                    }
//                    if (msg.isString()) {
//                        cfasl_output_error(v_object, stream);
//                        return NIL;
//                    }
//                }
//            }
//            return v_object;
//        }
//    }
//
//    public static final SubLObject cfasl_output_error(SubLObject v_object, SubLObject stream) {
//        Errors.cerror($$$Use_NIL_instead, $str_alt61$CFASL_cannot_handle____S, v_object);
//        return cfasl_output_nil(stream);
//    }
//
//    public static final SubLObject cfasl_raw_write_byte(SubLObject v_byte, SubLObject stream) {
//        if (NIL != cfasl_count_stream_p(stream)) {
//            return cfasl_count_stream_write_byte(v_byte, stream);
//        } else
//            if (NIL != cfasl_encoding_stream_p(stream)) {
//                return cfasl_encoding_stream_write_byte(v_byte, stream);
//            }
//
//        return write_byte(v_byte, stream);
//    }
//
//
//
//    /**
//     * Input an object from STREAM in the CFASL protocol.
//     * EOF-ERROR-P indicates whether an end-of-file is considered an error.
//     * EOF-VALUE indicates a value to return when end-of-file is encountered and eof-error-p is nil.
//     */
//    public static final SubLObject cfasl_input(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value) {
//        if (eof_error_p == UNPROVIDED) {
//            eof_error_p = T;
//        }
//        if (eof_value == UNPROVIDED) {
//            eof_value = $EOF;
//        }
//        return cfasl_input_internal(stream, eof_error_p, eof_value);
//    }
//
//    /**
//     * Peek at STREAM to return the opcode for the next object to be read in CFASL protocol.
//     * EOF-ERROR-P indicates whether an end-of-file is considered an error.
//     * EOF-VALUE indicates a value to return when end-of-file is encountered and eof-error-p is nil.
//     */
//    public static final SubLObject cfasl_opcode_peek(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value) {
//        if (eof_error_p == UNPROVIDED) {
//            eof_error_p = T;
//        }
//        if (eof_value == UNPROVIDED) {
//            eof_value = $EOF;
//        }
//        return cfasl_opcode_peek_internal(stream, eof_error_p, eof_value);
//    }
//
//    public static final SubLObject cfasl_input_object(SubLObject stream) {
//        return cfasl_input_internal(stream, NIL, NIL);
//    }
//
//    public static final SubLObject cfasl_input_error(SubLObject stream) {
//        Errors.error($str_alt62$Undefined_cfasl_opcode_in__S, stream);
//        return NIL;
//    }
//
//    public static final SubLObject cfasl_input_internal(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value) {
//        {
//            SubLObject opcode = cfasl_raw_read_byte(stream);
//            if (NIL == opcode) {
//                if (NIL != eof_error_p) {
//                    Errors.error($str_alt63$end_of_file_on_stream__S, stream);
//                }
//                return eof_value;
//            }
//            if (NIL != cfasl_immediate_fixnum_opcode(opcode)) {
//                return cfasl_extract_immediate_fixnum(opcode);
//            }
//            {
//                SubLObject cfasl_input_method = cfasl_input_method(opcode);
//                if (CFASL_INPUT_ERROR == cfasl_input_method) {
//                    return Errors.error($str_alt65$Undefined_cfasl_opcode__A_in__S, opcode, stream);
//                } else {
//                    return funcall(cfasl_input_method, stream);
//                }
//            }
//        }
//    }
//
//    public static final SubLObject cfasl_opcode_peek_internal(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value) {
//        {
//            SubLObject opcode = cfasl_raw_peek_byte(stream);
//            if (NIL == opcode) {
//                if (NIL != eof_error_p) {
//                    Errors.error($str_alt63$end_of_file_on_stream__S, stream);
//                }
//                return eof_value;
//            }
//            return opcode;
//        }
//    }
//
//    // defconstant
//    private static final SubLSymbol $cfasl_max_opcode$ = makeSymbol("*CFASL-MAX-OPCODE*");
//
//
//
//    public static final SubLObject cfasl_input_method(SubLObject cfasl_opcode) {
//        return aref($cfasl_input_method_table$.getGlobalValue(), cfasl_opcode);
//    }
//
//    public static final SubLObject declare_cfasl_opcode(SubLObject macroform, SubLObject environment) {
//        {
//            SubLObject datum = macroform.rest();
//            SubLObject current = datum;
//            SubLObject variable = NIL;
//            SubLObject cfasl_opcode = NIL;
//            SubLObject input_function = NIL;
//            destructuring_bind_must_consp(current, datum, $list_alt68);
//            variable = current.first();
//            current = current.rest();
//            destructuring_bind_must_consp(current, datum, $list_alt68);
//            cfasl_opcode = current.first();
//            current = current.rest();
//            destructuring_bind_must_consp(current, datum, $list_alt68);
//            input_function = current.first();
//            current = current.rest();
//            if (NIL == current) {
//                SubLTrampolineFile.checkType(variable, SYMBOLP);
//                SubLTrampolineFile.checkType(cfasl_opcode, INTEGERP);
//                SubLTrampolineFile.checkType(input_function, SYMBOLP);
//                return list(PROGN, list(DEFCONSTANT_PRIVATE, variable, cfasl_opcode), list(REGISTER_CFASL_INPUT_FUNCTION, variable, list(QUOTE, input_function)));
//            } else {
//                cdestructuring_bind_error(datum, $list_alt68);
//            }
//        }
//        return NIL;
//    }
//
//    public static final SubLObject register_cfasl_input_function(SubLObject cfasl_opcode, SubLObject function) {
//        set_aref($cfasl_input_method_table$.getGlobalValue(), cfasl_opcode, function);
//        return function;
//    }
//
//    public static final SubLObject cfasl_raw_peek_byte(SubLObject stream) {
//        {
//            SubLObject v_byte = cfasl_raw_read_byte(stream);
//            if (NIL != number_utilities.bytep(v_byte)) {
//                unread_byte(v_byte, stream);
//            }
//            return v_byte;
//        }
//    }
//
//    public static final SubLObject cfasl_raw_read_byte(SubLObject stream) {
//        if (NIL != cfasl_decoding_stream_p(stream)) {
//            return cfasl_decoding_stream_read_byte(stream, NIL, NIL);
//        }
//        return read_byte(stream, NIL, NIL);
//    }
//
//    /**
//     * perform all memory allocation inside BODY in the area intended for CFASL.
//     */
//    public static final SubLObject with_cfasl_area_allocation(SubLObject macroform, SubLObject environment) {
//        {
//            final SubLThread thread = SubLProcess.currentSubLThread();
//            {
//                SubLObject datum = macroform.rest();
//                SubLObject current = datum;
//                SubLObject body = current;
//                if (NIL != find($SL2JAVA, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
//                    return bq_cons(PROGN, append(body, NIL));
//                }
//                return list(PIF, $cfasl_input_to_static_area$, bq_cons(WITH_STATIC_AREA, append(body, NIL)), bq_cons(PROGN, append(body, NIL)));
//            }
//        }
//    }
//
//    // defparameter
//    public static final SubLSymbol $within_cfasl_externalization$ = makeSymbol("*WITHIN-CFASL-EXTERNALIZATION*");
//
//    public static final SubLObject within_cfasl_externalization(SubLObject macroform, SubLObject environment) {
//        {
//            SubLObject datum = macroform.rest();
//            SubLObject current = datum;
//            SubLObject body = current;
//            return listS(CLET, $list_alt78, append(body, NIL));
//        }
//    }
//
//    public static final SubLObject without_cfasl_externalization(SubLObject macroform, SubLObject environment) {
//        {
//            SubLObject datum = macroform.rest();
//            SubLObject current = datum;
//            SubLObject body = current;
//            return listS(CLET, $list_alt79, append(body, NIL));
//        }
//    }
//
//    /**
//     * Return T iff we are assuming CFASL externalization.
//     */
//    public static final SubLObject within_cfasl_externalization_p() {
//        {
//            final SubLThread thread = SubLProcess.currentSubLThread();
//            return $within_cfasl_externalization$.getDynamicValue(thread);
//        }
//    }
//
//    // defparameter
//    public static final SubLSymbol $cfasl_channel_externalizedP$ = makeSymbol("*CFASL-CHANNEL-EXTERNALIZED?*");
//
//    public static final SubLObject without_cfasl_channel_externalization(SubLObject macroform, SubLObject environment) {
//        {
//            SubLObject datum = macroform.rest();
//            SubLObject current = datum;
//            SubLObject body = current;
//            return listS(CLET, $list_alt80, append(body, NIL));
//        }
//    }
//
//    /**
//     * Return T iff we are assuming CFASL channel externalization.
//     */
//    public static final SubLObject cfasl_channel_externalizedP() {
//        {
//            final SubLThread thread = SubLProcess.currentSubLThread();
//            return $cfasl_channel_externalizedP$.getDynamicValue(thread);
//        }
//    }
//
//
//
//    public static final SubLObject declare_cfasl_extension_opcode(SubLObject macroform, SubLObject environment) {
//        {
//            SubLObject datum = macroform.rest();
//            SubLObject current = datum;
//            SubLObject variable = NIL;
//            SubLObject cfasl_opcode = NIL;
//            SubLObject pred_func = NIL;
//            SubLObject output_func = NIL;
//            SubLObject input_func = NIL;
//            destructuring_bind_must_consp(current, datum, $list_alt82);
//            variable = current.first();
//            current = current.rest();
//            destructuring_bind_must_consp(current, datum, $list_alt82);
//            cfasl_opcode = current.first();
//            current = current.rest();
//            destructuring_bind_must_consp(current, datum, $list_alt82);
//            pred_func = current.first();
//            current = current.rest();
//            destructuring_bind_must_consp(current, datum, $list_alt82);
//            output_func = current.first();
//            current = current.rest();
//            destructuring_bind_must_consp(current, datum, $list_alt82);
//            input_func = current.first();
//            current = current.rest();
//            if (NIL == current) {
//                SubLTrampolineFile.checkType(variable, SYMBOLP);
//                SubLTrampolineFile.checkType(cfasl_opcode, INTEGERP);
//                SubLTrampolineFile.checkType(pred_func, SYMBOLP);
//                SubLTrampolineFile.checkType(output_func, SYMBOLP);
//                SubLTrampolineFile.checkType(input_func, SYMBOLP);
//                return list(PROGN, list(DECLARE_CFASL_OPCODE, variable, cfasl_opcode, input_func), list(REGISTER_CFASL_EXTENSION, variable, list(QUOTE, pred_func), list(QUOTE, output_func), list(QUOTE, input_func)));
//            } else {
//                cdestructuring_bind_error(datum, $list_alt82);
//            }
//        }
//        return NIL;
//    }
//
//    public static final SubLObject register_cfasl_extension(SubLObject cfasl_number, SubLObject pred_func, SubLObject output_func, SubLObject input_func) {
//        {
//            SubLObject existing = assoc(cfasl_number, $cfasl_extensions$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
//            if (NIL == existing) {
//                existing = make_list(FOUR_INTEGER, cfasl_number);
//                $cfasl_extensions$.setGlobalValue(cons(existing, $cfasl_extensions$.getGlobalValue()));
//            }
//            set_nth(ONE_INTEGER, existing, pred_func);
//            set_nth(TWO_INTEGER, existing, output_func);
//            set_nth(THREE_INTEGER, existing, input_func);
//            return cfasl_number;
//        }
//    }
//
//    public static final SubLObject handle_cfasl_extensions(SubLObject v_object, SubLObject stream) {
//        {
//            SubLObject handled = NIL;
//            if (NIL == handled) {
//                {
//                    SubLObject csome_list_var = $cfasl_extensions$.getGlobalValue();
//                    SubLObject extension = NIL;
//                    for (extension = csome_list_var.first(); !((NIL != handled) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , extension = csome_list_var.first()) {
//                        if (NIL != funcall(second(extension), v_object)) {
//                            funcall(third(extension), v_object, stream);
//                            handled = T;
//                        }
//                    }
//                }
//            }
//            return handled;
//        }
//    }
//
//    public static final SubLObject cfasl_output_narrow_opcode(SubLObject opcode, SubLObject stream) {
//        cfasl_raw_write_byte(opcode, stream);
//        return opcode;
//    }
//
//    public static final SubLObject cfasl_output_opcode(SubLObject opcode, SubLObject stream) {
//        if (NIL != cfasl_narrow_opcode_p(opcode)) {
//            cfasl_output_narrow_opcode(opcode, stream);
//        } else {
//            cfasl_output_wide_opcode(opcode, stream);
//        }
//        return opcode;
//    }
//
//    // defconstant
//    private static final SubLSymbol $cfasl_opcode_externalization$ = makeSymbol("*CFASL-OPCODE-EXTERNALIZATION*");
//
//    public static final SubLObject cfasl_output_externalization(SubLObject v_object, SubLObject stream) {
//        {
//            final SubLThread thread = SubLProcess.currentSubLThread();
//            cfasl_raw_write_byte($cfasl_opcode_externalization$.getGlobalValue(), stream);
//            {
//                SubLObject v_answer = NIL;
//                {
//                    SubLObject _prev_bind_0 = $within_cfasl_externalization$.currentBinding(thread);
//                    try {
//                        $within_cfasl_externalization$.bind(T, thread);
//                        v_answer = cfasl_output(v_object, stream);
//                    } finally {
//                        $within_cfasl_externalization$.rebind(_prev_bind_0, thread);
//                    }
//                }
//                return v_answer;
//            }
//        }
//    }
//
//    public static final SubLObject cfasl_input_externalization(SubLObject stream) {
//        {
//            final SubLThread thread = SubLProcess.currentSubLThread();
//            {
//                SubLObject v_answer = NIL;
//                {
//                    SubLObject _prev_bind_0 = $within_cfasl_externalization$.currentBinding(thread);
//                    try {
//                        $within_cfasl_externalization$.bind(T, thread);
//                        v_answer = cfasl_input_object(stream);
//                    } finally {
//                        $within_cfasl_externalization$.rebind(_prev_bind_0, thread);
//                    }
//                }
//                return v_answer;
//            }
//        }
//    }
//
//    /**
//     * The current stream to which the CFASL-DEFSTRUCT-RECIPE-OUTPUT-METHOD
//     * is writing.
//     */
//    // defparameter
//    private static final SubLSymbol $current_cfasl_defstruct_output_stream$ = makeSymbol("*CURRENT-CFASL-DEFSTRUCT-OUTPUT-STREAM*");
//
//    // defconstant
//    private static final SubLSymbol $cfasl_opcode_defstruct_recipe$ = makeSymbol("*CFASL-OPCODE-DEFSTRUCT-RECIPE*");
//
//    /**
//     * This method expects to be called by CFASL-OUTPUT in the case
//     * where no implementation is available for a STRUCTURE-P.
//     */
//    public static final SubLObject cfasl_output_defstruct_recipe(SubLObject v_object, SubLObject stream) {
//        {
//            final SubLThread thread = SubLProcess.currentSubLThread();
//            cfasl_output_opcode($cfasl_opcode_defstruct_recipe$.getGlobalValue(), stream);
//            {
//                SubLObject _prev_bind_0 = $current_cfasl_defstruct_output_stream$.currentBinding(thread);
//                try {
//                    $current_cfasl_defstruct_output_stream$.bind(stream, thread);
//                    visitation.visit_defstruct(v_object, symbol_function(CFASL_OUTPUT_DEFSTRUCT_RECIPE_VISITORFN));
//                } finally {
//                    $current_cfasl_defstruct_output_stream$.rebind(_prev_bind_0, thread);
//                }
//            }
//            return v_object;
//        }
//    }
//
//    public static final SubLObject cfasl_output_defstruct_recipe_visitorfn(SubLObject obj, SubLObject phase, SubLObject param_a, SubLObject param_b) {
//        {
//            final SubLThread thread = SubLProcess.currentSubLThread();
//            {
//                SubLObject stream = $current_cfasl_defstruct_output_stream$.getDynamicValue(thread);
//                SubLObject pcase_var = phase;
//                if (pcase_var.eql($BEGIN)) {
//                    {
//                        SubLObject constructor_fn = param_a;
//                        SubLObject num_of_slots = param_b;
//                        cfasl_output(constructor_fn, stream);
//                        cfasl_output(num_of_slots, stream);
//                    }
//                } else
//                    if (pcase_var.eql($SLOT)) {
//                        {
//                            SubLObject slot_name = param_a;
//                            SubLObject slot_value = param_b;
//                            cfasl_output(slot_name, stream);
//                            cfasl_output(slot_value, stream);
//                        }
//                    } else
//                        if (pcase_var.eql($END)) {
//                        }
//
//
//            }
//            return obj;
//        }
//    }
//
//    /**
//     *
//     *
//     * @unknown this method is dispatched to by the CFASL-INPUT infrastructure
//    after the *CFASL-OPCODE-DEFSTRUCT-RECIPE* has been read.
//     * @return STRUCTURE-P
//     */
//    public static final SubLObject cfasl_input_defstruct_recipe(SubLObject stream) {
//        {
//            final SubLThread thread = SubLProcess.currentSubLThread();
//            {
//                SubLObject constructor_fn = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
//                SubLObject num_of_slots = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
//                SubLObject plist = NIL;
//                SubLObject cursor = NIL;
//                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
//                    if (!constructor_fn.isFunctionSpec()) {
//                        Errors.error($str_alt93$Error__expected_constructor_for_d, constructor_fn);
//                    }
//                }
//                plist = make_list(add(num_of_slots, num_of_slots), UNPROVIDED);
//                cursor = plist;
//                {
//                    SubLObject i = NIL;
//                    for (i = ZERO_INTEGER; i.numL(num_of_slots); i = add(i, ONE_INTEGER)) {
//                        {
//                            SubLObject slot_name = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
//                            SubLObject slot_value = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
//                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
//                                if (!slot_name.isKeyword()) {
//                                    Errors.error($str_alt94$Expected_keyword_at_slot___A_of_s, i, constructor_fn, slot_name);
//                                }
//                            }
//                            set_nth(ZERO_INTEGER, cursor, slot_name);
//                            set_nth(ONE_INTEGER, cursor, slot_value);
//                            cursor = cddr(cursor);
//                        }
//                    }
//                }
//                return funcall(constructor_fn, plist);
//            }
//        }
//    }
//
//    // defconstant
//    private static final SubLSymbol $cfasl_immediate_fixnum_cutoff$ = makeSymbol("*CFASL-IMMEDIATE-FIXNUM-CUTOFF*");
//
//    // defconstant
//    private static final SubLSymbol $cfasl_immediate_fixnum_offset$ = makeSymbol("*CFASL-IMMEDIATE-FIXNUM-OFFSET*");
//
//    public static final SubLObject cfasl_immediate_fixnump(SubLObject v_object) {
//        return makeBoolean((v_object.isFixnum() && v_object.numGE(ZERO_INTEGER)) && v_object.numL($cfasl_immediate_fixnum_cutoff$.getGlobalValue()));
//    }
//
//    public static final SubLObject cfasl_output_immediate_fixnum(SubLObject v_object, SubLObject stream) {
//        cfasl_raw_write_byte(add($cfasl_immediate_fixnum_offset$.getGlobalValue(), v_object), stream);
//        return v_object;
//    }
//
//    public static final SubLObject cfasl_immediate_fixnum_opcode(SubLObject opcode) {
//        return numGE(opcode, $cfasl_immediate_fixnum_offset$.getGlobalValue());
//    }
//
//    public static final SubLObject cfasl_extract_immediate_fixnum(SubLObject opcode) {
//        return subtract(opcode, $cfasl_immediate_fixnum_offset$.getGlobalValue());
//    }
//
//    // defconstant
//    private static final SubLSymbol $cfasl_opcode_p_8bit_int$ = makeSymbol("*CFASL-OPCODE-P-8BIT-INT*");
//
//    // defconstant
//    private static final SubLSymbol $cfasl_opcode_n_8bit_int$ = makeSymbol("*CFASL-OPCODE-N-8BIT-INT*");
//
//    // defconstant
//    private static final SubLSymbol $cfasl_opcode_p_16bit_int$ = makeSymbol("*CFASL-OPCODE-P-16BIT-INT*");
//
//    // defconstant
//    private static final SubLSymbol $cfasl_opcode_n_16bit_int$ = makeSymbol("*CFASL-OPCODE-N-16BIT-INT*");
//
//    // defconstant
//    private static final SubLSymbol $cfasl_opcode_p_24bit_int$ = makeSymbol("*CFASL-OPCODE-P-24BIT-INT*");
//
//    // defconstant
//    private static final SubLSymbol $cfasl_opcode_n_24bit_int$ = makeSymbol("*CFASL-OPCODE-N-24BIT-INT*");
//
//    // defconstant
//    private static final SubLSymbol $cfasl_opcode_p_32bit_int$ = makeSymbol("*CFASL-OPCODE-P-32BIT-INT*");
//
//    // defconstant
//    private static final SubLSymbol $cfasl_opcode_n_32bit_int$ = makeSymbol("*CFASL-OPCODE-N-32BIT-INT*");
//
//    // defconstant
//    private static final SubLSymbol $cfasl_opcode_p_bignum$ = makeSymbol("*CFASL-OPCODE-P-BIGNUM*");
//
//    // defconstant
//    private static final SubLSymbol $cfasl_opcode_n_bignum$ = makeSymbol("*CFASL-OPCODE-N-BIGNUM*");
//
//    public static final SubLObject cfasl_output_object_integer_method(SubLObject v_object, SubLObject stream) {
//        return cfasl_output_integer(v_object, stream);
//    }
//
//    public static final SubLObject cfasl_output_integer(SubLObject integer, SubLObject stream) {
//        if (NIL != cfasl_immediate_fixnump(integer)) {
//            return cfasl_output_immediate_fixnum(integer, stream);
//        }
//        {
//            SubLObject positive = plusp(integer);
//            SubLObject value = (NIL != positive) ? ((SubLObject) (integer)) : abs(integer);
//            if (value.numL($int$128)) {
//                if (NIL != positive) {
//                    cfasl_raw_write_byte($cfasl_opcode_p_8bit_int$.getGlobalValue(), stream);
//                } else {
//                    cfasl_raw_write_byte($cfasl_opcode_n_8bit_int$.getGlobalValue(), stream);
//                }
//                cfasl_output_integer_internal(value, ONE_INTEGER, stream);
//            } else
//                if (value.numL($int$32768)) {
//                    if (NIL != positive) {
//                        cfasl_raw_write_byte($cfasl_opcode_p_16bit_int$.getGlobalValue(), stream);
//                    } else {
//                        cfasl_raw_write_byte($cfasl_opcode_n_16bit_int$.getGlobalValue(), stream);
//                    }
//                    cfasl_output_integer_internal(value, TWO_INTEGER, stream);
//                } else
//                    if (value.numL($int$8388608)) {
//                        if (NIL != positive) {
//                            cfasl_raw_write_byte($cfasl_opcode_p_24bit_int$.getGlobalValue(), stream);
//                        } else {
//                            cfasl_raw_write_byte($cfasl_opcode_n_24bit_int$.getGlobalValue(), stream);
//                        }
//                        cfasl_output_integer_internal(value, THREE_INTEGER, stream);
//                    } else
//                        if (value.numL($int$2147483648)) {
//                            if (NIL != positive) {
//                                cfasl_raw_write_byte($cfasl_opcode_p_32bit_int$.getGlobalValue(), stream);
//                            } else {
//                                cfasl_raw_write_byte($cfasl_opcode_n_32bit_int$.getGlobalValue(), stream);
//                            }
//                            cfasl_output_integer_internal(value, FOUR_INTEGER, stream);
//                        } else {
//                            {
//                                SubLObject bignum_spec = disassemble_integer_to_fixnums(integer);
//                                SubLObject datum = bignum_spec;
//                                SubLObject current = datum;
//                                SubLObject sign = NIL;
//                                destructuring_bind_must_consp(current, datum, $list_alt111);
//                                sign = current.first();
//                                current = current.rest();
//                                {
//                                    SubLObject fixnums = current;
//                                    if (sign.isNegative()) {
//                                        cfasl_raw_write_byte($cfasl_opcode_n_bignum$.getGlobalValue(), stream);
//                                    } else {
//                                        cfasl_raw_write_byte($cfasl_opcode_p_bignum$.getGlobalValue(), stream);
//                                    }
//                                    cfasl_output(length(fixnums), stream);
//                                    {
//                                        SubLObject cdolist_list_var = fixnums;
//                                        SubLObject fixnum = NIL;
//                                        for (fixnum = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , fixnum = cdolist_list_var.first()) {
//                                            cfasl_output(fixnum, stream);
//                                        }
//                                    }
//                                }
//                            }
//                        }
//
//
//
//        }
//        return integer;
//    }
//
//    public static final SubLObject cfasl_output_integer_internal(SubLObject integer, SubLObject bytes, SubLObject stream) {
//        if (bytes.numE(ONE_INTEGER)) {
//            cfasl_raw_write_byte(integer, stream);
//        } else {
//            {
//                SubLObject low_part = mod(integer, $int$256);
//                SubLObject high_part = integerDivide(subtract(integer, low_part), $int$256);
//                cfasl_raw_write_byte(low_part, stream);
//                cfasl_output_integer_internal(high_part, subtract(bytes, ONE_INTEGER), stream);
//            }
//        }
//        return integer;
//    }
//
//    public static final SubLObject cfasl_input_p_8bit_int(SubLObject stream) {
//        return cfasl_input_integer(ONE_INTEGER, stream);
//    }
//
//    public static final SubLObject cfasl_input_n_8bit_int(SubLObject stream) {
//        return minus(cfasl_input_integer(ONE_INTEGER, stream));
//    }
//
//    public static final class $cfasl_input_n_8bit_int$UnaryFunction extends UnaryFunction {
//        public $cfasl_input_n_8bit_int$UnaryFunction() {
//            super(extractFunctionNamed("CFASL-INPUT-N-8BIT-INT"));
//        }
//
//        @Override
//	public SubLObject processItem(SubLObject arg1) {
//            return cfasl_input_n_8bit_int(arg1);
//        }
//    }
//
//    public static final SubLObject cfasl_input_p_16bit_int(SubLObject stream) {
//        return cfasl_input_integer(TWO_INTEGER, stream);
//    }
//
//    public static final class $cfasl_input_p_16bit_int$UnaryFunction extends UnaryFunction {
//        public $cfasl_input_p_16bit_int$UnaryFunction() {
//            super(extractFunctionNamed("CFASL-INPUT-P-16BIT-INT"));
//        }
//
//        @Override
//	public SubLObject processItem(SubLObject arg1) {
//            return cfasl_input_p_16bit_int(arg1);
//        }
//    }
//
//    public static final SubLObject cfasl_input_n_16bit_int(SubLObject stream) {
//        return minus(cfasl_input_integer(TWO_INTEGER, stream));
//    }
//
//    public static final SubLObject cfasl_input_p_24bit_int(SubLObject stream) {
//        return cfasl_input_integer(THREE_INTEGER, stream);
//    }
//
//    public static final class $cfasl_input_p_24bit_int$UnaryFunction extends UnaryFunction {
//        public $cfasl_input_p_24bit_int$UnaryFunction() {
//            super(extractFunctionNamed("CFASL-INPUT-P-24BIT-INT"));
//        }
//
//        @Override
//	public SubLObject processItem(SubLObject arg1) {
//            return cfasl_input_p_24bit_int(arg1);
//        }
//    }
//
//    public static final SubLObject cfasl_input_n_24bit_int(SubLObject stream) {
//        return minus(cfasl_input_integer(THREE_INTEGER, stream));
//    }
//
//    public static final class $cfasl_input_n_24bit_int$UnaryFunction extends UnaryFunction {
//        public $cfasl_input_n_24bit_int$UnaryFunction() {
//            super(extractFunctionNamed("CFASL-INPUT-N-24BIT-INT"));
//        }
//
//        @Override
//	public SubLObject processItem(SubLObject arg1) {
//            return cfasl_input_n_24bit_int(arg1);
//        }
//    }
//
//    public static final SubLObject cfasl_input_p_32bit_int(SubLObject stream) {
//        return cfasl_input_integer(FOUR_INTEGER, stream);
//    }
//
//    public static final class $cfasl_input_p_32bit_int$UnaryFunction extends UnaryFunction {
//        public $cfasl_input_p_32bit_int$UnaryFunction() {
//            super(extractFunctionNamed("CFASL-INPUT-P-32BIT-INT"));
//        }
//
//        @Override
//	public SubLObject processItem(SubLObject arg1) {
//            return cfasl_input_p_32bit_int(arg1);
//        }
//    }
//
//    public static final SubLObject cfasl_input_n_32bit_int(SubLObject stream) {
//        return minus(cfasl_input_integer(FOUR_INTEGER, stream));
//    }
//
//    public static final SubLObject assemble_2_fixnums_to_non_negative_integer(SubLObject fixnum0, SubLObject fixnum1) {
//        return add(fixnum0, ash(fixnum1, EIGHT_INTEGER));
//    }
//
//    public static final SubLObject assemble_3_fixnums_to_non_negative_integer(SubLObject fixnum0, SubLObject fixnum1, SubLObject fixnum2) {
//        return add(assemble_2_fixnums_to_non_negative_integer(fixnum0, fixnum1), ash(fixnum2, SIXTEEN_INTEGER));
//    }
//
//    public static final SubLObject assemble_4_fixnums_to_non_negative_integer(SubLObject fixnum0, SubLObject fixnum1, SubLObject fixnum2, SubLObject fixnum3) {
//        return add(assemble_3_fixnums_to_non_negative_integer(fixnum0, fixnum1, fixnum2), ash(fixnum3, $int$24));
//    }
//
//    public static final SubLObject cfasl_input_integer(SubLObject bytes, SubLObject stream) {
//        if (NIL == cfasl_decoding_stream_p(stream)) {
//            return read_byte_sequence_to_positive_integer(bytes, stream, UNPROVIDED, UNPROVIDED);
//        }
//        if (bytes.numG(FOUR_INTEGER)) {
//            {
//                SubLObject high_recursive = cfasl_input_integer(subtract(bytes, FOUR_INTEGER), stream);
//                SubLObject low_4 = cfasl_input_integer(FOUR_INTEGER, stream);
//                return add(ash(high_recursive, $int$32), low_4);
//            }
//        }
//        {
//            SubLObject pcase_var = bytes;
//            if (pcase_var.eql(FOUR_INTEGER)) {
//                {
//                    SubLObject fixnum0 = cfasl_raw_read_byte(stream);
//                    SubLObject fixnum1 = cfasl_raw_read_byte(stream);
//                    SubLObject fixnum2 = cfasl_raw_read_byte(stream);
//                    SubLObject fixnum3 = cfasl_raw_read_byte(stream);
//                    return assemble_4_fixnums_to_non_negative_integer(fixnum0, fixnum1, fixnum2, fixnum3);
//                }
//            } else
//                if (pcase_var.eql(THREE_INTEGER)) {
//                    {
//                        SubLObject fixnum0 = cfasl_raw_read_byte(stream);
//                        SubLObject fixnum1 = cfasl_raw_read_byte(stream);
//                        SubLObject fixnum2 = cfasl_raw_read_byte(stream);
//                        return assemble_3_fixnums_to_non_negative_integer(fixnum0, fixnum1, fixnum2);
//                    }
//                } else
//                    if (pcase_var.eql(TWO_INTEGER)) {
//                        {
//                            SubLObject fixnum0 = cfasl_raw_read_byte(stream);
//                            SubLObject fixnum1 = cfasl_raw_read_byte(stream);
//                            return assemble_2_fixnums_to_non_negative_integer(fixnum0, fixnum1);
//                        }
//                    } else
//                        if (pcase_var.eql(ONE_INTEGER)) {
//                            {
//                                SubLObject fixnum0 = cfasl_raw_read_byte(stream);
//                                return fixnum0;
//                            }
//                        } else
//                            if (pcase_var.eql(ZERO_INTEGER)) {
//                                return ZERO_INTEGER;
//                            }
//
//
//
//
//        }
//        return NIL;
//    }
//
//    public static final SubLObject cfasl_input_p_bignum(SubLObject stream) {
//        return cfasl_input_bignum(ONE_INTEGER, stream);
//    }
//
//    public static final class $cfasl_input_p_bignum$UnaryFunction extends UnaryFunction {
//        public $cfasl_input_p_bignum$UnaryFunction() {
//            super(extractFunctionNamed("CFASL-INPUT-P-BIGNUM"));
//        }
//
//        @Override
//	public SubLObject processItem(SubLObject arg1) {
//            return cfasl_input_p_bignum(arg1);
//        }
//    }
//
//    public static final SubLObject cfasl_input_n_bignum(SubLObject stream) {
//        return cfasl_input_bignum(MINUS_ONE_INTEGER, stream);
//    }
//
//    public static final SubLObject cfasl_input_bignum(SubLObject sign, SubLObject stream) {
//        {
//            SubLObject count = cfasl_input_object(stream);
//            SubLObject fixnums = make_list(add(count, ONE_INTEGER), ZERO_INTEGER);
//            rplaca(fixnums, sign);
//            {
//                SubLObject tail = NIL;
//                for (tail = fixnums.rest(); NIL != tail; tail = tail.rest()) {
//                    rplaca(tail, cfasl_input_object(stream));
//                }
//            }
//            {
//                SubLObject bignum = NIL;
//                bignum = apply(symbol_function(ASSEMBLE_FIXNUMS_TO_INTEGER), fixnums);
//                return bignum;
//            }
//        }
//    }
//
//    // defconstant
//    private static final SubLSymbol $cfasl_opcode_p_float$ = makeSymbol("*CFASL-OPCODE-P-FLOAT*");
//
//    // defconstant
//    private static final SubLSymbol $cfasl_opcode_n_float$ = makeSymbol("*CFASL-OPCODE-N-FLOAT*");
//
//    public static final SubLObject cfasl_output_object_float_method(SubLObject v_object, SubLObject stream) {
//        return cfasl_output_float(v_object, stream);
//    }
//
//    public static final SubLObject cfasl_output_float(SubLObject v_object, SubLObject stream) {
//        {
//            final SubLThread thread = SubLProcess.currentSubLThread();
//            thread.resetMultipleValues();
//            {
//                SubLObject signif = integer_decode_float(v_object);
//                SubLObject exp = thread.secondMultipleValue();
//                SubLObject sign = thread.thirdMultipleValue();
//                thread.resetMultipleValues();
//                if (v_object.isNegative()) {
//                    cfasl_raw_write_byte($cfasl_opcode_n_float$.getGlobalValue(), stream);
//                } else {
//                    cfasl_raw_write_byte($cfasl_opcode_p_float$.getGlobalValue(), stream);
//                }
//                cfasl_output_integer(signif, stream);
//                cfasl_output_integer(exp, stream);
//            }
//            return v_object;
//        }
//    }
//
//    public static final SubLObject cfasl_input_p_float(SubLObject stream) {
//        return cfasl_input_float(stream);
//    }
//
//    public static final class $cfasl_input_p_float$UnaryFunction extends UnaryFunction {
//        public $cfasl_input_p_float$UnaryFunction() {
//            super(extractFunctionNamed("CFASL-INPUT-P-FLOAT"));
//        }
//
//        @Override
//	public SubLObject processItem(SubLObject arg1) {
//            return cfasl_input_p_float(arg1);
//        }
//    }
//
//    public static final SubLObject cfasl_input_n_float(SubLObject stream) {
//        return minus(cfasl_input_float(stream));
//    }
//
//    public static final class $cfasl_input_n_float$UnaryFunction extends UnaryFunction {
//        public $cfasl_input_n_float$UnaryFunction() {
//            super(extractFunctionNamed("CFASL-INPUT-N-FLOAT"));
//        }
//
//        @Override
//	public SubLObject processItem(SubLObject arg1) {
//            return cfasl_input_n_float(arg1);
//        }
//    }
//
//    public static final SubLObject cfasl_input_float(SubLObject stream) {
//        {
//            SubLObject signif = cfasl_input_object(stream);
//            SubLObject exp = cfasl_input_object(stream);
//            return scale_float(sublisp_float(signif, UNPROVIDED), exp);
//        }
//    }
//
//    public static final SubLObject cfasl_output_object_symbol_method(SubLObject v_object, SubLObject stream) {
//        if (NIL == v_object) {
//            return cfasl_output_nil(stream);
//        } else
//            if (NIL != cfasl_common_symbol_p(v_object)) {
//                return cfasl_output_common_symbol(v_object, stream);
//            } else
//                if (v_object.isKeyword()) {
//                    return cfasl_output_keyword(v_object, stream);
//                } else {
//                    return cfasl_output_other_symbol(v_object, stream);
//                }
//
//
//    }
//
//    // defconstant
//    private static final SubLSymbol $cfasl_opcode_keyword$ = makeSymbol("*CFASL-OPCODE-KEYWORD*");
//
//    public static final SubLObject cfasl_output_keyword(SubLObject v_object, SubLObject stream) {
//        cfasl_raw_write_byte($cfasl_opcode_keyword$.getGlobalValue(), stream);
//        cfasl_output_string(symbol_name(v_object), stream);
//        return v_object;
//    }
//
//    public static final SubLObject cfasl_input_keyword(SubLObject stream) {
//        {
//            SubLObject name = cfasl_input_object(stream);
//            if (CHAR_colon.eql(Strings.sublisp_char(name, ZERO_INTEGER))) {
//                name = subseq(name, ONE_INTEGER, UNPROVIDED);
//            }
//            return make_keyword(name);
//        }
//    }
//
//    public static final class $cfasl_input_keyword$UnaryFunction extends UnaryFunction {
//        public $cfasl_input_keyword$UnaryFunction() {
//            super(extractFunctionNamed("CFASL-INPUT-KEYWORD"));
//        }
//
//        @Override
//	public SubLObject processItem(SubLObject arg1) {
//            return cfasl_input_keyword(arg1);
//        }
//    }
//
//    // defconstant
//    private static final SubLSymbol $cfasl_opcode_other_symbol$ = makeSymbol("*CFASL-OPCODE-OTHER-SYMBOL*");
//
//    public static final SubLObject cfasl_output_other_symbol(SubLObject v_object, SubLObject stream) {
//        cfasl_raw_write_byte($cfasl_opcode_other_symbol$.getGlobalValue(), stream);
//        if (NIL == cyc_package_symbol_p(v_object)) {
//            {
//                SubLObject v_package = symbol_package(v_object);
//                cfasl_output(v_package, stream);
//            }
//        }
//        cfasl_output_string(symbol_name(v_object), stream);
//        return v_object;
//    }
//
//    /**
//     * Return T iff OBJECT is a symbol in the Cyc package.
//     */
//    public static final SubLObject cyc_package_symbol_p(SubLObject v_object) {
//        return makeBoolean((v_object.isSymbol() && (!v_object.isKeyword())) && ((control_vars.$cyc_package$.getGlobalValue() == symbol_package(v_object)) || (v_object == find_symbol(symbol_name(v_object), control_vars.$cyc_package$.getGlobalValue()))));
//    }
//
//    public static final SubLObject cfasl_input_other_symbol(SubLObject stream) {
//        {
//            SubLObject input = cfasl_input_object(stream);
//            if (input.isString()) {
//                {
//                    SubLObject name = input;
//                    return intern(name, control_vars.$cyc_package$.getGlobalValue());
//                }
//            }
//            {
//                SubLObject v_package = input;
//                SubLObject name = cfasl_input_object(stream);
//                if (NIL == v_package) {
//                    return make_symbol(name);
//                } else {
//                    return intern(name, v_package);
//                }
//            }
//        }
//    }
//
//    public static final class $cfasl_input_other_symbol$UnaryFunction extends UnaryFunction {
//        public $cfasl_input_other_symbol$UnaryFunction() {
//            super(extractFunctionNamed("CFASL-INPUT-OTHER-SYMBOL"));
//        }
//
//        @Override
//	public SubLObject processItem(SubLObject arg1) {
//            return cfasl_input_other_symbol(arg1);
//        }
//    }
//
//    // defconstant
//    private static final SubLSymbol $cfasl_opcode_nil$ = makeSymbol("*CFASL-OPCODE-NIL*");
//
//    public static final SubLObject cfasl_output_nil(SubLObject stream) {
//        cfasl_raw_write_byte($cfasl_opcode_nil$.getGlobalValue(), stream);
//        return NIL;
//    }
//
//    public static final SubLObject cfasl_input_nil(SubLObject stream) {
//        return NIL;
//    }
//
//    public static final class $cfasl_input_nil$UnaryFunction extends UnaryFunction {
//        public $cfasl_input_nil$UnaryFunction() {
//            super(extractFunctionNamed("CFASL-INPUT-NIL"));
//        }
//
//        @Override
//	public SubLObject processItem(SubLObject arg1) {
//            return cfasl_input_nil(arg1);
//        }
//    }
//
//    // defconstant
//    private static final SubLSymbol $cfasl_opcode_common_symbol$ = makeSymbol("*CFASL-OPCODE-COMMON-SYMBOL*");
//
//
//
//    /**
//     * Set the currently used list of common symbols for CFASL to be SYMBOLS.
//     */
//    public static final SubLObject cfasl_set_common_symbols(SubLObject symbols) {
//        $cfasl_common_symbols$.setDynamicValue(apply(symbol_function(VECTOR), symbols));
//        return NIL;
//    }
//
//    public static final SubLObject with_cfasl_common_symbols(SubLObject macroform, SubLObject environment) {
//        {
//            SubLObject datum = macroform.rest();
//            SubLObject current = datum;
//            SubLObject symbols = NIL;
//            destructuring_bind_must_consp(current, datum, $list_alt124);
//            symbols = current.first();
//            current = current.rest();
//            {
//                SubLObject body = current;
//                return listS(CLET, $list_alt125, list(CFASL_SET_COMMON_SYMBOLS, symbols), append(body, NIL));
//            }
//        }
//    }
//
//    /**
//     * Set the currently used list of common symbols for CFASL to be SYMBOLS, assuming that we're only doing a few cfasl functions and so will sacrifice time for space and not make a vector
//     */
//    public static final SubLObject cfasl_set_common_symbols_simple(SubLObject symbols) {
//        $cfasl_common_symbols$.setDynamicValue(symbols);
//        return NIL;
//    }
//
//    public static final SubLObject with_cfasl_common_symbols_simple(SubLObject macroform, SubLObject environment) {
//        {
//            SubLObject datum = macroform.rest();
//            SubLObject current = datum;
//            SubLObject symbols = NIL;
//            destructuring_bind_must_consp(current, datum, $list_alt124);
//            symbols = current.first();
//            current = current.rest();
//            {
//                SubLObject body = current;
//                return listS(CLET, $list_alt125, list(CFASL_SET_COMMON_SYMBOLS_SIMPLE, symbols), append(body, NIL));
//            }
//        }
//    }
//
//    /**
//     * Get the currently active common symbol;s in a form that can be
//     * used in conjunction with CFASL-SET-COMMON-SYMBOLS.
//     *
//     * @return SYMBOL-LIST-P
//     */
//    public static final SubLObject cfasl_current_common_symbols() {
//        {
//            final SubLThread thread = SubLProcess.currentSubLThread();
//            if ($cfasl_common_symbols$.getDynamicValue(thread).isVector()) {
//                return vector_utilities.vector_elements($cfasl_common_symbols$.getDynamicValue(thread), UNPROVIDED);
//            } else {
//                return $cfasl_common_symbols$.getDynamicValue(thread);
//            }
//        }
//    }
//
//    public static final SubLObject cfasl_common_symbol_p(SubLObject v_object) {
//        {
//            final SubLThread thread = SubLProcess.currentSubLThread();
//            return makeBoolean(((NIL != $cfasl_common_symbols$.getDynamicValue(thread)) && v_object.isSymbol()) && (NIL != position(v_object, $cfasl_common_symbols$.getDynamicValue(thread), symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
//        }
//    }
//
//    public static final SubLObject cfasl_encode_common_symbol(SubLObject symbol) {
//        {
//            final SubLThread thread = SubLProcess.currentSubLThread();
//            return position(symbol, $cfasl_common_symbols$.getDynamicValue(thread), symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED);
//        }
//    }
//
//    public static final SubLObject cfasl_decode_common_symbol(SubLObject integer) {
//        {
//            final SubLThread thread = SubLProcess.currentSubLThread();
//            return $cfasl_common_symbols$.getDynamicValue(thread).isVector() ? ((SubLObject) (aref($cfasl_common_symbols$.getDynamicValue(thread), integer))) : nth(integer, $cfasl_common_symbols$.getDynamicValue(thread));
//        }
//    }
//
//    public static final SubLObject cfasl_output_common_symbol(SubLObject symbol, SubLObject stream) {
//        {
//            SubLObject encoding = cfasl_encode_common_symbol(symbol);
//            cfasl_raw_write_byte($cfasl_opcode_common_symbol$.getGlobalValue(), stream);
//            cfasl_output_integer(encoding, stream);
//        }
//        return symbol;
//    }
//
//    public static final SubLObject cfasl_input_common_symbol(SubLObject stream) {
//        {
//            SubLObject encoding = cfasl_input_object(stream);
//            SubLObject symbol = cfasl_decode_common_symbol(encoding);
//            if (NIL == symbol) {
//                Errors.cerror($str_alt128$Use_NIL_, $str_alt129$Common_symbol_at_index__D_was_not, encoding, $cfasl_common_symbols$);
//            }
//            return symbol;
//        }
//    }
//
//    public static final class $cfasl_input_common_symbol$UnaryFunction extends UnaryFunction {
//        public $cfasl_input_common_symbol$UnaryFunction() {
//            super(extractFunctionNamed("CFASL-INPUT-COMMON-SYMBOL"));
//        }
//
//        @Override
//	public SubLObject processItem(SubLObject arg1) {
//            return cfasl_input_common_symbol(arg1);
//        }
//    }
//
//    public static final SubLObject cfasl_output_object_cons_method(SubLObject v_object, SubLObject stream) {
//        if (NIL != list_utilities.proper_list_p(v_object)) {
//            return cfasl_output_list(v_object, stream);
//        } else {
//            return cfasl_output_dotted_list(v_object, stream);
//        }
//    }
//
//
//
//    public static final SubLObject register_cfasl_list_method(SubLObject method_key, SubLObject pred_func, SubLObject output_func) {
//        {
//            SubLObject existing = assoc(method_key, $cfasl_list_methods$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
//            if (NIL == existing) {
//                existing = make_list(THREE_INTEGER, method_key);
//                $cfasl_list_methods$.setGlobalValue(cons(existing, $cfasl_list_methods$.getGlobalValue()));
//            }
//            set_nth(ONE_INTEGER, existing, pred_func);
//            set_nth(TWO_INTEGER, existing, output_func);
//            return method_key;
//        }
//    }
//
//    public static final SubLObject handle_cfasl_list_methods(SubLObject v_object, SubLObject stream) {
//        {
//            SubLObject handled = NIL;
//            if (NIL == handled) {
//                {
//                    SubLObject csome_list_var = $cfasl_list_methods$.getGlobalValue();
//                    SubLObject list_method = NIL;
//                    for (list_method = csome_list_var.first(); !((NIL != handled) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , list_method = csome_list_var.first()) {
//                        if (NIL != funcall(second(list_method), v_object)) {
//                            funcall(third(list_method), v_object, stream);
//                            handled = T;
//                        }
//                    }
//                }
//            }
//            return handled;
//        }
//    }
//
//    // defconstant
//    private static final SubLSymbol $cfasl_opcode_list$ = makeSymbol("*CFASL-OPCODE-LIST*");
//
//    public static final SubLObject cfasl_output_list(SubLObject list, SubLObject stream) {
//        {
//            SubLObject length = list_length(list);
//            if (NIL == length) {
//                Errors.cerror($$$Output_NIL_instead, $str_alt135$Trying_to_output_a_circular_list_);
//                return cfasl_output_nil(stream);
//            } else
//                if (length.numE(ZERO_INTEGER)) {
//                    return cfasl_output_nil(stream);
//                } else
//                    if ((NIL != $cfasl_list_methods$.getGlobalValue()) && (NIL != handle_cfasl_list_methods(list, stream))) {
//                    } else {
//                        cfasl_raw_write_byte($cfasl_opcode_list$.getGlobalValue(), stream);
//                        cfasl_output_integer(length, stream);
//                        {
//                            SubLObject cdolist_list_var = list;
//                            SubLObject item = NIL;
//                            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
//                                cfasl_output(item, stream);
//                            }
//                        }
//                        return list;
//                    }
//
//
//        }
//        return NIL;
//    }
//
//    public static final SubLObject cfasl_input_list(SubLObject stream) {
//        {
//            SubLObject length = cfasl_input_object(stream);
//            SubLObject list = NIL;
//            SubLObject list_item = NIL;
//            list = make_list(length, UNPROVIDED);
//            {
//                SubLObject cell = NIL;
//                for (cell = list; NIL != cell; cell = cell.rest()) {
//                    list_item = cfasl_input_object(stream);
//                    rplaca(cell, list_item);
//                }
//            }
//            return list;
//        }
//    }
//
//    public static final class $cfasl_input_list$UnaryFunction extends UnaryFunction {
//        public $cfasl_input_list$UnaryFunction() {
//            super(extractFunctionNamed("CFASL-INPUT-LIST"));
//        }
//
//        @Override
//	public SubLObject processItem(SubLObject arg1) {
//            return cfasl_input_list(arg1);
//        }
//    }
//
//    // defconstant
//    private static final SubLSymbol $cfasl_opcode_dotted_list$ = makeSymbol("*CFASL-OPCODE-DOTTED-LIST*");
//
//    public static final SubLObject cfasl_output_dotted_list(SubLObject v_object, SubLObject stream) {
//        {
//            SubLObject length = list_utilities.dotted_length(v_object);
//            cfasl_raw_write_byte($cfasl_opcode_dotted_list$.getGlobalValue(), stream);
//            cfasl_output_integer(length, stream);
//            {
//                SubLObject i = NIL;
//                SubLObject cons = NIL;
//                for (i = ZERO_INTEGER, cons = v_object; !i.numE(length); i = add(i, ONE_INTEGER) , cons = cons.rest()) {
//                    cfasl_output(cons.first(), stream);
//                }
//                cfasl_output(cons, stream);
//            }
//        }
//        return v_object;
//    }
//
//    public static final SubLObject cfasl_input_dotted_list(SubLObject stream) {
//        {
//            SubLObject length = cfasl_input_object(stream);
//            SubLObject list = NIL;
//            if (length.numE(ONE_INTEGER)) {
//                list = cons(NIL, NIL);
//                rplaca(list, cfasl_input_object(stream));
//                rplacd(list, cfasl_input_object(stream));
//            } else {
//                list = make_list(length, UNPROVIDED);
//                {
//                    SubLObject cell = NIL;
//                    for (cell = list; NIL != cell.rest(); cell = cell.rest()) {
//                        rplaca(cell, cfasl_input_object(stream));
//                    }
//                    rplaca(cell, cfasl_input_object(stream));
//                    rplacd(cell, cfasl_input_object(stream));
//                }
//            }
//            return list;
//        }
//    }
//
//    public static final class $cfasl_input_dotted_list$UnaryFunction extends UnaryFunction {
//        public $cfasl_input_dotted_list$UnaryFunction() {
//            super(extractFunctionNamed("CFASL-INPUT-DOTTED-LIST"));
//        }
//
//        @Override
//	public SubLObject processItem(SubLObject arg1) {
//            return cfasl_input_dotted_list(arg1);
//        }
//    }
//
//    public static final SubLObject cfasl_output_object_vector_method(SubLObject v_object, SubLObject stream) {
//        if (NIL != vector_utilities.byte_vector_p(v_object)) {
//            return cfasl_output_byte_vector(v_object, stream);
//        } else {
//            return cfasl_output_general_vector(v_object, stream);
//        }
//    }
//
//    // defconstant
//    private static final SubLSymbol $cfasl_opcode_general_vector$ = makeSymbol("*CFASL-OPCODE-GENERAL-VECTOR*");
//
//    public static final SubLObject cfasl_output_general_vector(SubLObject vector, SubLObject stream) {
//        cfasl_raw_write_byte($cfasl_opcode_general_vector$.getGlobalValue(), stream);
//        {
//            SubLObject length = length(vector);
//            cfasl_output_integer(length, stream);
//            {
//                SubLObject i = NIL;
//                for (i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER)) {
//                    cfasl_output(aref(vector, i), stream);
//                }
//            }
//        }
//        return vector;
//    }
//
//    public static final SubLObject cfasl_input_general_vector(SubLObject stream) {
//        {
//            SubLObject length = cfasl_input_object(stream);
//            SubLObject vector = NIL;
//            vector = make_vector(length, UNPROVIDED);
//            {
//                SubLObject i = NIL;
//                for (i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER)) {
//                    set_aref(vector, i, cfasl_input_object(stream));
//                }
//            }
//            return vector;
//        }
//    }
//
//    public static final class $cfasl_input_general_vector$UnaryFunction extends UnaryFunction {
//        public $cfasl_input_general_vector$UnaryFunction() {
//            super(extractFunctionNamed("CFASL-INPUT-GENERAL-VECTOR"));
//        }
//
//        @Override
//	public SubLObject processItem(SubLObject arg1) {
//            return cfasl_input_general_vector(arg1);
//        }
//    }
//
//    // defconstant
//    private static final SubLSymbol $cfasl_opcode_byte_vector$ = makeSymbol("*CFASL-OPCODE-BYTE-VECTOR*");
//
//    public static final SubLObject cfasl_output_byte_vector(SubLObject byte_vector, SubLObject stream) {
//        cfasl_raw_write_byte($cfasl_opcode_byte_vector$.getGlobalValue(), stream);
//        {
//            SubLObject length = length(byte_vector);
//            cfasl_output_integer(length, stream);
//            {
//                SubLObject i = NIL;
//                for (i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER)) {
//                    cfasl_raw_write_byte(aref(byte_vector, i), stream);
//                }
//            }
//        }
//        return byte_vector;
//    }
//
//    public static final SubLObject cfasl_input_byte_vector(SubLObject stream) {
//        {
//            SubLObject length = cfasl_input_object(stream);
//            SubLObject byte_vector = NIL;
//            byte_vector = make_vector(length, UNPROVIDED);
//            {
//                SubLObject i = NIL;
//                for (i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER)) {
//                    set_aref(byte_vector, i, cfasl_raw_read_byte(stream));
//                }
//            }
//            return byte_vector;
//        }
//    }
//
//    // defconstant
//    private static final SubLSymbol $cfasl_opcode_string$ = makeSymbol("*CFASL-OPCODE-STRING*");
//
//    public static final SubLObject cfasl_output_object_string_method(SubLObject v_object, SubLObject stream) {
//        return cfasl_output_string(v_object, stream);
//    }
//
//    public static final SubLObject cfasl_output_string(SubLObject string, SubLObject stream) {
//        cfasl_raw_write_byte($cfasl_opcode_string$.getGlobalValue(), stream);
//        {
//            SubLObject length = length(string);
//            cfasl_output_integer(length, stream);
//            {
//                SubLObject i = NIL;
//                for (i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER)) {
//                    cfasl_raw_write_byte(char_code(Strings.sublisp_char(string, i)), stream);
//                }
//            }
//        }
//        return string;
//    }
//
//    /**
//     * If non-nil, a string that is destructively re-used when loading a string of the same length.
//     */
//    // defparameter
//    private static final SubLSymbol $cfasl_input_string_resource$ = makeSymbol("*CFASL-INPUT-STRING-RESOURCE*");
//
//    public static final SubLObject cfasl_input_string(SubLObject stream) {
//        {
//            final SubLThread thread = SubLProcess.currentSubLThread();
//            {
//                SubLObject length = cfasl_input_object(stream);
//                SubLObject string = NIL;
//                if ($cfasl_input_string_resource$.getDynamicValue(thread).isString() && length.numE(length($cfasl_input_string_resource$.getDynamicValue(thread)))) {
//                    string = $cfasl_input_string_resource$.getDynamicValue(thread);
//                } else {
//                    string = Strings.make_string(length, UNPROVIDED);
//                }
//                if (NIL == cfasl_decoding_stream_p(stream)) {
//                    return read_byte_sequence_into_string(string, stream, UNPROVIDED, UNPROVIDED);
//                }
//                {
//                    SubLObject i = NIL;
//                    for (i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER)) {
//                        Strings.set_char(string, i, code_char(cfasl_raw_read_byte(stream)));
//                    }
//                }
//                return string;
//            }
//        }
//    }
//
//    public static final class $cfasl_input_string$UnaryFunction extends UnaryFunction {
//        public $cfasl_input_string$UnaryFunction() {
//            super(extractFunctionNamed("CFASL-INPUT-STRING"));
//        }
//
//        @Override
//	public SubLObject processItem(SubLObject arg1) {
//            return cfasl_input_string(arg1);
//        }
//    }
//
//    // defconstant
//    private static final SubLSymbol $cfasl_opcode_character$ = makeSymbol("*CFASL-OPCODE-CHARACTER*");
//
//    public static final SubLObject cfasl_output_object_character_method(SubLObject v_object, SubLObject stream) {
//        return cfasl_output_character(v_object, stream);
//    }
//
//    public static final SubLObject cfasl_output_character(SubLObject v_object, SubLObject stream) {
//        cfasl_raw_write_byte($cfasl_opcode_character$.getGlobalValue(), stream);
//        cfasl_raw_write_byte(char_code(v_object), stream);
//        return v_object;
//    }
//
//    public static final SubLObject cfasl_input_character(SubLObject stream) {
//        return code_char(cfasl_raw_read_byte(stream));
//    }
//
//    public static final class $cfasl_input_character$UnaryFunction extends UnaryFunction {
//        public $cfasl_input_character$UnaryFunction() {
//            super(extractFunctionNamed("CFASL-INPUT-CHARACTER"));
//        }
//
//        @Override
//	public SubLObject processItem(SubLObject arg1) {
//            return cfasl_input_character(arg1);
//        }
//    }
//
//    // defconstant
//    private static final SubLSymbol $cfasl_opcode_hashtable$ = makeSymbol("*CFASL-OPCODE-HASHTABLE*");
//
//    public static final SubLObject cfasl_output_object_hash_table_method(SubLObject v_object, SubLObject stream) {
//        return cfasl_output_hashtable(v_object, stream);
//    }
//
//    public static final SubLObject cfasl_output_hashtable(SubLObject v_object, SubLObject stream) {
//        cfasl_raw_write_byte($cfasl_opcode_hashtable$.getGlobalValue(), stream);
//        {
//            SubLObject test = hash_table_utilities.hash_test_to_symbol(hash_table_test(v_object));
//            SubLObject size = hash_table_count(v_object);
//            cfasl_output(test, stream);
//            cfasl_output_integer(size, stream);
//            {
//                SubLObject key = NIL;
//                SubLObject value = NIL;
//                {
//                    final Iterator cdohash_iterator = getEntrySetIterator(v_object);
//                    try {
//                        while (iteratorHasNext(cdohash_iterator)) {
//                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
//                            key = getEntryKey(cdohash_entry);
//                            value = getEntryValue(cdohash_entry);
//                            cfasl_output(key, stream);
//                            cfasl_output(value, stream);
//                        } 
//                    } finally {
//                        releaseEntrySetIterator(cdohash_iterator);
//                    }
//                }
//            }
//        }
//        return v_object;
//    }
//
//    public static final SubLObject cfasl_input_hashtable(SubLObject stream) {
//        {
//            SubLObject test = cfasl_input_object(stream);
//            SubLObject size = cfasl_input_object(stream);
//            SubLObject hashtable = NIL;
//            SubLObject pcase_var = test;
//            if (((pcase_var.eql(EQ) || pcase_var.eql(EQL)) || pcase_var.eql(EQUAL)) || pcase_var.eql(EQUALP)) {
//                test = symbol_function(test);
//            }
//            hashtable = make_hash_table(size, test, UNPROVIDED);
//            {
//                SubLObject i = NIL;
//                for (i = ZERO_INTEGER; i.numL(size); i = add(i, ONE_INTEGER)) {
//                    {
//                        SubLObject key = cfasl_input_object(stream);
//                        SubLObject value = cfasl_input_object(stream);
//                        sethash(key, hashtable, value);
//                    }
//                }
//            }
//            return hashtable;
//        }
//    }
//
//    // defconstant
//    private static final SubLSymbol $cfasl_opcode_guid$ = makeSymbol("*CFASL-OPCODE-GUID*");
//
//    public static final SubLObject cfasl_output_object_guid_method(SubLObject v_object, SubLObject stream) {
//        return cfasl_output_guid(v_object, stream);
//    }
//
//    public static final SubLObject cfasl_output_guid(SubLObject guid, SubLObject stream) {
//        {
//            final SubLThread thread = SubLProcess.currentSubLThread();
//            if (NIL == $terse_guid_serialization_enabledP$.getDynamicValue(thread)) {
//                return cfasl_output_legacy_guid(guid, stream);
//            }
//            cfasl_raw_write_byte($cfasl_opcode_guid$.getGlobalValue(), stream);
//            {
//                SubLObject byte_vector = Guids.disassemble_guid_to_fixnums(guid, UNPROVIDED);
//                SubLObject i = NIL;
//                for (i = ZERO_INTEGER; i.numL(SIXTEEN_INTEGER); i = add(i, ONE_INTEGER)) {
//                    cfasl_raw_write_byte(aref(byte_vector, i), stream);
//                }
//            }
//            return guid;
//        }
//    }
//
//    public static final SubLObject cfasl_input_guid(SubLObject stream) {
//        {
//            SubLObject byte_vector = cfasl_input_guid_byte_vector(stream);
//            SubLObject guid = NIL;
//            guid = Guids.assemble_fixnums_to_guid(byte_vector);
//            return guid;
//        }
//    }
//
//    public static final class $cfasl_input_guid$UnaryFunction extends UnaryFunction {
//        public $cfasl_input_guid$UnaryFunction() {
//            super(extractFunctionNamed("CFASL-INPUT-GUID"));
//        }
//
//        @Override
//	public SubLObject processItem(SubLObject arg1) {
//            return cfasl_input_guid(arg1);
//        }
//    }
//
//    public static final SubLObject cfasl_input_guid_byte_vector(SubLObject stream) {
//        {
//            SubLObject byte_vector = make_vector(SIXTEEN_INTEGER, NIL);
//            SubLObject i = NIL;
//            for (i = ZERO_INTEGER; i.numL(SIXTEEN_INTEGER); i = add(i, ONE_INTEGER)) {
//                set_aref(byte_vector, i, cfasl_raw_read_byte(stream));
//            }
//            return byte_vector;
//        }
//    }
//
//    // defconstant
//    private static final SubLSymbol $cfasl_opcode_legacy_guid$ = makeSymbol("*CFASL-OPCODE-LEGACY-GUID*");
//
//    public static final SubLObject cfasl_output_legacy_guid(SubLObject guid, SubLObject stream) {
//        cfasl_raw_write_byte($cfasl_opcode_legacy_guid$.getGlobalValue(), stream);
//        {
//            SubLObject string = Guids.guid_to_string(guid);
//            cfasl_output_string(string, stream);
//        }
//        return guid;
//    }
//
//    public static final SubLObject cfasl_input_legacy_guid(SubLObject stream) {
//        {
//            SubLObject string = cfasl_input_guid_string(stream);
//            SubLObject guid = NIL;
//            guid = Guids.string_to_guid(string);
//            return guid;
//        }
//    }
//
//    // defparameter
//    public static final SubLSymbol $cfasl_input_guid_string_resource$ = makeSymbol("*CFASL-INPUT-GUID-STRING-RESOURCE*");
//
//    public static final SubLObject cfasl_input_guid_string(SubLObject stream) {
//        {
//            final SubLThread thread = SubLProcess.currentSubLThread();
//            {
//                SubLObject string = NIL;
//                {
//                    SubLObject _prev_bind_0 = $cfasl_input_string_resource$.currentBinding(thread);
//                    try {
//                        $cfasl_input_string_resource$.bind($cfasl_input_guid_string_resource$.getDynamicValue(thread), thread);
//                        string = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
//                    } finally {
//                        $cfasl_input_string_resource$.rebind(_prev_bind_0, thread);
//                    }
//                }
//                return string;
//            }
//        }
//    }
//
//    /**
//     * Allocates and provides access to a new GUID string resource
//     * object.
//     *
//     * @see *CFASL-INPUT-GUID-STRING-RESOURCE*
//     * @return STRINGP
//     */
//    public static final SubLObject get_new_cfasl_input_guid_string_resource() {
//        return Strings.make_string($int$36, UNPROVIDED);
//    }
//
//    /**
//     * Allocates a new GUID string resource and makes it available to the
//     * GUID loading infrastructure.
//     */
//    public static final SubLObject with_new_cfasl_input_guid_string_resource(SubLObject macroform, SubLObject environment) {
//        {
//            SubLObject datum = macroform.rest();
//            SubLObject current = datum;
//            SubLObject body = current;
//            return listS(CLET, $list_alt153, append(body, NIL));
//        }
//    }
//
//    // defconstant
//    private static final SubLSymbol $cfasl_opcode_result_set$ = makeSymbol("*CFASL-OPCODE-RESULT-SET*");
//
//    public static final SubLObject cfasl_input_result_set(SubLObject stream) {
//        {
//            SubLObject total_row_count = cfasl_input_object(stream);
//            SubLObject slice_row_count = cfasl_input_object(stream);
//            SubLObject column_count = cfasl_input_object(stream);
//            SubLObject first = cfasl_input_object(stream);
//            SubLObject rows = make_vector(slice_row_count, UNPROVIDED);
//            SubLObject r = NIL;
//            for (r = ZERO_INTEGER; r.numL(slice_row_count); r = add(r, ONE_INTEGER)) {
//                {
//                    SubLObject row = make_vector(column_count, UNPROVIDED);
//                    SubLObject c = NIL;
//                    for (c = ZERO_INTEGER; c.numL(column_count); c = add(c, ONE_INTEGER)) {
//                        set_aref(row, c, cfasl_input_object(stream));
//                    }
//                    set_aref(rows, r, row);
//                }
//            }
//            return sdbc.new_sql_result_set(first, rows, total_row_count);
//        }
//    }
//
//    // defconstant
//    private static final SubLSymbol $cfasl_opcode_package$ = makeSymbol("*CFASL-OPCODE-PACKAGE*");
//
//    public static final SubLObject cfasl_output_object_package_method(SubLObject v_object, SubLObject stream) {
//        return cfasl_output_package(v_object, stream);
//    }
//
//    public static final SubLObject cfasl_output_package(SubLObject v_package, SubLObject stream) {
//        cfasl_raw_write_byte($cfasl_opcode_package$.getGlobalValue(), stream);
//        cfasl_output_string(package_name(v_package), stream);
//        return v_package;
//    }
//
//    public static final SubLObject cfasl_input_package(SubLObject stream) {
//        {
//            SubLObject name = cfasl_input_object(stream);
//            return find_package(name);
//        }
//    }
//
//    // defconstant
//    private static final SubLSymbol $cfasl_opcode_wide_cfasl_opcode$ = makeSymbol("*CFASL-OPCODE-WIDE-CFASL-OPCODE*");
//
//    /**
//     * All wide opcodes have to be more than one byte, so that all narrow opcodes
//     * can be re-encoded as wide opcodes without loss of functionality.
//     */
//    // defconstant
//    public static final SubLSymbol $cfasl_min_wide_opcode$ = makeSymbol("*CFASL-MIN-WIDE-OPCODE*");
//
//    /**
//     * Predicate for identifying narrow opcodes.
//     */
//    public static final SubLObject cfasl_narrow_opcode_p(SubLObject opcode) {
//        return makeBoolean((NIL != subl_promotions.non_negative_integer_p(opcode)) && opcode.numL($cfasl_max_opcode$.getGlobalValue()));
//    }
//
//
//
//    public static final SubLObject cfasl_wide_opcode_input_method(SubLObject cfasl_wide_opcode) {
//        {
//            SubLObject result = gethash(cfasl_wide_opcode, $cfasl_wide_opcode_input_method_table$.getGlobalValue(), $NOT_FOUND);
//            if ($NOT_FOUND == result) {
//                if (NIL != cfasl_narrow_opcode_p(cfasl_wide_opcode)) {
//                    return cfasl_input_method(cfasl_wide_opcode);
//                }
//                return CFASL_INPUT_ERROR;
//            }
//            return result;
//        }
//    }
//
//    public static final SubLObject cfasl_input_wide_opcode_encoded(SubLObject stream) {
//        {
//            SubLObject code = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
//            SubLObject method = cfasl_wide_opcode_input_method(code);
//            return funcall(method, stream);
//        }
//    }
//
//    public static final SubLObject declare_wide_cfasl_opcode(SubLObject macroform, SubLObject environment) {
//        {
//            final SubLThread thread = SubLProcess.currentSubLThread();
//            {
//                SubLObject datum = macroform.rest();
//                SubLObject current = datum;
//                SubLObject variable = NIL;
//                SubLObject wide_opcode = NIL;
//                SubLObject input_function = NIL;
//                destructuring_bind_must_consp(current, datum, $list_alt163);
//                variable = current.first();
//                current = current.rest();
//                destructuring_bind_must_consp(current, datum, $list_alt163);
//                wide_opcode = current.first();
//                current = current.rest();
//                destructuring_bind_must_consp(current, datum, $list_alt163);
//                input_function = current.first();
//                current = current.rest();
//                if (NIL == current) {
//                    SubLTrampolineFile.checkType(variable, SYMBOLP);
//                    SubLTrampolineFile.checkType(wide_opcode, INTEGERP);
//                    SubLTrampolineFile.checkType(input_function, SYMBOLP);
//                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
//                        if (!wide_opcode.numGE($cfasl_min_wide_opcode$.getGlobalValue())) {
//                            Errors.error($str_alt164$_A_is_too_small_to_be_a_wide_opco, wide_opcode);
//                        }
//                    }
//                    return list(PROGN, list(DEFCONSTANT_PRIVATE, variable, wide_opcode), list(REGISTER_WIDE_CFASL_OPCODE_INPUT_FUNCTION, variable, list(QUOTE, input_function)));
//                } else {
//                    cdestructuring_bind_error(datum, $list_alt163);
//                }
//            }
//            return NIL;
//        }
//    }
//
//    public static final SubLObject register_wide_cfasl_opcode_input_function(SubLObject wide_opcode, SubLObject function) {
//        sethash(wide_opcode, $cfasl_wide_opcode_input_method_table$.getGlobalValue(), function);
//        return function;
//    }
//
//    public static final SubLObject cfasl_output_wide_opcode(SubLObject wide_opcode, SubLObject stream) {
//        cfasl_output_narrow_opcode($cfasl_opcode_wide_cfasl_opcode$.getGlobalValue(), stream);
//        cfasl_output(wide_opcode, stream);
//        return wide_opcode;
//    }
//
//    // defconstant
//    private static final SubLSymbol $cfasl_opcode_instance$ = makeSymbol("*CFASL-OPCODE-INSTANCE*");
//
//    public static final SubLObject cfasl_output_object_instance_method(SubLObject v_object, SubLObject stream) {
//        cfasl_raw_write_byte($cfasl_opcode_instance$.getGlobalValue(), stream);
//        return methods.funcall_instance_method_with_1_args(v_object, CFASL_OUTPUT, stream);
//    }
//
//    public static final SubLObject cfasl_input_instance(SubLObject stream) {
//        {
//            SubLObject class_name = cfasl_input_object(stream);
//            SubLTrampolineFile.checkType(class_name, SYMBOLP);
//            return methods.funcall_class_method_with_1_args(class_name, CFASL_INPUT, stream);
//        }
//    }
//
//    // defconstant
//    private static final SubLSymbol $cfasl_opcode_guid_denoted_type$ = makeSymbol("*CFASL-OPCODE-GUID-DENOTED-TYPE*");
//
//
//
//    public static final SubLObject declare_cfasl_guid_opcode(SubLObject macroform, SubLObject environment) {
//        {
//            SubLObject datum = macroform.rest();
//            SubLObject current = datum;
//            SubLObject variable = NIL;
//            SubLObject cfasl_guid_opcode = NIL;
//            SubLObject input_function = NIL;
//            destructuring_bind_must_consp(current, datum, $list_alt176);
//            variable = current.first();
//            current = current.rest();
//            destructuring_bind_must_consp(current, datum, $list_alt176);
//            cfasl_guid_opcode = current.first();
//            current = current.rest();
//            destructuring_bind_must_consp(current, datum, $list_alt176);
//            input_function = current.first();
//            current = current.rest();
//            if (NIL == current) {
//                SubLTrampolineFile.checkType(variable, SYMBOLP);
//                SubLTrampolineFile.checkType(cfasl_guid_opcode, GUID_P);
//                SubLTrampolineFile.checkType(input_function, SYMBOLP);
//                return list(PROGN, list(DEFLEXICAL_PRIVATE, variable, cfasl_guid_opcode), list(REGISTER_CFASL_GUID_DENOTED_TYPE_INPUT_FUNCTION, variable, list(QUOTE, input_function)));
//            } else {
//                cdestructuring_bind_error(datum, $list_alt176);
//            }
//        }
//        return NIL;
//    }
//
//    public static final SubLObject declare_cfasl_guid_string_opcode(SubLObject macroform, SubLObject environment) {
//        {
//            SubLObject datum = macroform.rest();
//            SubLObject current = datum;
//            SubLObject variable = NIL;
//            SubLObject cfasl_guid_string_opcode = NIL;
//            SubLObject input_function = NIL;
//            destructuring_bind_must_consp(current, datum, $list_alt180);
//            variable = current.first();
//            current = current.rest();
//            destructuring_bind_must_consp(current, datum, $list_alt180);
//            cfasl_guid_string_opcode = current.first();
//            current = current.rest();
//            destructuring_bind_must_consp(current, datum, $list_alt180);
//            input_function = current.first();
//            current = current.rest();
//            if (NIL == current) {
//                SubLTrampolineFile.checkType(variable, SYMBOLP);
//                SubLTrampolineFile.checkType(cfasl_guid_string_opcode, GUID_STRING_P);
//                SubLTrampolineFile.checkType(input_function, SYMBOLP);
//                return list(PROGN, list(DEFLEXICAL_PRIVATE, variable, list(STRING_TO_GUID, cfasl_guid_string_opcode)), list(REGISTER_CFASL_GUID_DENOTED_TYPE_INPUT_FUNCTION, variable, list(QUOTE, input_function)));
//            } else {
//                cdestructuring_bind_error(datum, $list_alt180);
//            }
//        }
//        return NIL;
//    }
//
//    public static final SubLObject register_cfasl_guid_denoted_type_input_function(SubLObject cfasl_guid_opcode, SubLObject function) {
//        sethash(cfasl_guid_opcode, $cfasl_guid_denoted_type_input_method_table$.getGlobalValue(), function);
//        return function;
//    }
//
//    public static final SubLObject write_cfasl_guid_denoted_type_opcode(SubLObject stream, SubLObject guid) {
//        cfasl_raw_write_byte($cfasl_opcode_guid_denoted_type$.getGlobalValue(), stream);
//        return cfasl_output(guid, stream);
//    }
//
//    public static final SubLObject cfasl_guid_denoted_type_input_method(SubLObject guid_for_type) {
//        return gethash(guid_for_type, $cfasl_guid_denoted_type_input_method_table$.getGlobalValue(), UNPROVIDED);
//    }
//
//    public static final SubLObject cfasl_input_guid_denoted_type(SubLObject stream) {
//        {
//            SubLObject guid_for_type = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
//            SubLObject result = funcall(cfasl_guid_denoted_type_input_method(guid_for_type), stream);
//            return result;
//        }
//    }
//
//    public static final SubLObject with_guid_denoted_type_cfasl_encoding(SubLObject macroform, SubLObject environment) {
//        {
//            SubLObject datum = macroform.rest();
//            SubLObject current = datum;
//            destructuring_bind_must_consp(current, datum, $list_alt184);
//            {
//                SubLObject temp = current.rest();
//                current = current.first();
//                {
//                    SubLObject type_denoting_guid = NIL;
//                    SubLObject stream = NIL;
//                    destructuring_bind_must_consp(current, datum, $list_alt184);
//                    type_denoting_guid = current.first();
//                    current = current.rest();
//                    destructuring_bind_must_consp(current, datum, $list_alt184);
//                    stream = current.first();
//                    current = current.rest();
//                    if (NIL == current) {
//                        current = temp;
//                        {
//                            SubLObject body = current;
//                            return listS(PROGN, list(WRITE_CFASL_GUID_DENOTED_TYPE_OPCODE, stream, type_denoting_guid), append(body, NIL));
//                        }
//                    } else {
//                        cdestructuring_bind_error(datum, $list_alt184);
//                    }
//                }
//            }
//        }
//        return NIL;
//    }
//
//    public static final SubLObject cfasl_test(SubLObject v_object) {
//        {
//            SubLObject v_answer = cfasl_decode(cfasl_encode(v_object));
//            return values(v_answer, equalp(v_answer, v_object));
//        }
//    }
//
//    public static final SubLObject show_cfasl_file(SubLObject filename, SubLObject stream) {
//        if (stream == UNPROVIDED) {
//            stream = StreamsLow.$standard_output$.getDynamicValue();
//        }
//        {
//            final SubLThread thread = SubLProcess.currentSubLThread();
//            {
//                SubLObject stream_2 = NIL;
//                try {
//                    {
//                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
//                        try {
//                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
//                            stream_2 = compatibility.open_binary(filename, $INPUT, NIL);
//                        } finally {
//                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
//                        }
//                    }
//                    if (!stream_2.isStream()) {
//                        Errors.error($str_alt187$Unable_to_open__S, filename);
//                    }
//                    {
//                        SubLObject input_stream = stream_2;
//                        SubLObject thing = NIL;
//                        for (thing = cfasl_input(input_stream, NIL, $EOF); thing != $EOF; thing = cfasl_input(input_stream, NIL, $EOF)) {
//                            print(thing, stream);
//                        }
//                    }
//                } finally {
//                    {
//                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
//                        try {
//                            $is_thread_performing_cleanupP$.bind(T, thread);
//                            if (stream_2.isStream()) {
//                                close(stream_2, UNPROVIDED);
//                            }
//                        } finally {
//                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
//                        }
//                    }
//                }
//            }
//            return NIL;
//        }
//    }
//
//    public static final SubLObject declare_cfasl_file() {
//        declareFunction("cfasl_encoding_p", "CFASL-ENCODING-P", 1, 0, false);
//        declareFunction("cfasl_encodable_stream_p", "CFASL-ENCODABLE-STREAM-P", 1, 0, false);
//        declareFunction("cfasl_encoding_stream_print_function_trampoline", "CFASL-ENCODING-STREAM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
//        declareFunction("cfasl_encoding_stream_p", "CFASL-ENCODING-STREAM-P", 1, 0, false);
//        new cfasl_HIDE.$cfasl_encoding_stream_p$UnaryFunction();
//        declareFunction("cfasl_encoding_stream_internal_stream", "CFASL-ENCODING-STREAM-INTERNAL-STREAM", 1, 0, false);
//        declareFunction("_csetf_cfasl_encoding_stream_internal_stream", "_CSETF-CFASL-ENCODING-STREAM-INTERNAL-STREAM", 2, 0, false);
//        declareFunction("make_cfasl_encoding_stream", "MAKE-CFASL-ENCODING-STREAM", 0, 1, false);
//        declareMacro("with_cfasl_output_to_hex_string", "WITH-CFASL-OUTPUT-TO-HEX-STRING");
//        declareFunction("cfasl_encoding_string_stream_encoding", "CFASL-ENCODING-STRING-STREAM-ENCODING", 1, 0, false);
//        declareMacro("with_cfasl_output_to_byte_vector", "WITH-CFASL-OUTPUT-TO-BYTE-VECTOR");
//        declareFunction("new_cfasl_encoding_stream", "NEW-CFASL-ENCODING-STREAM", 0, 0, false);
//        declareFunction("cfasl_encoding_stream_write_byte", "CFASL-ENCODING-STREAM-WRITE-BYTE", 2, 0, false);
//        declareFunction("cfasl_encoding_stream_encoding", "CFASL-ENCODING-STREAM-ENCODING", 1, 0, false);
//        declareFunction("close_cfasl_encoding_stream", "CLOSE-CFASL-ENCODING-STREAM", 1, 0, false);
//        declareFunction("cfasl_encode", "CFASL-ENCODE", 1, 0, false);
//        declareFunction("cfasl_encode_externalized", "CFASL-ENCODE-EXTERNALIZED", 1, 0, false);
//        declareFunction("cfasl_encode_externalized_terse", "CFASL-ENCODE-EXTERNALIZED-TERSE", 1, 0, false);
//        declareFunction("cfasl_decodable_stream_p", "CFASL-DECODABLE-STREAM-P", 1, 0, false);
//        declareFunction("cfasl_decoding_stream_print_function_trampoline", "CFASL-DECODING-STREAM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
//        declareFunction("cfasl_decoding_stream_p", "CFASL-DECODING-STREAM-P", 1, 0, false);
//        new cfasl_HIDE.$cfasl_decoding_stream_p$UnaryFunction();
//        declareFunction("cfasl_decoding_stream_internal_stream", "CFASL-DECODING-STREAM-INTERNAL-STREAM", 1, 0, false);
//        declareFunction("_csetf_cfasl_decoding_stream_internal_stream", "_CSETF-CFASL-DECODING-STREAM-INTERNAL-STREAM", 2, 0, false);
//        declareFunction("make_cfasl_decoding_stream", "MAKE-CFASL-DECODING-STREAM", 0, 1, false);
//        declareMacro("with_cfasl_input_from_string", "WITH-CFASL-INPUT-FROM-STRING");
//        declareFunction("new_cfasl_decoding_stream_from_string", "NEW-CFASL-DECODING-STREAM-FROM-STRING", 1, 0, false);
//        declareMacro("with_cfasl_input_from_byte_vector", "WITH-CFASL-INPUT-FROM-BYTE-VECTOR");
//        declareFunction("new_cfasl_decoding_stream", "NEW-CFASL-DECODING-STREAM", 1, 0, false);
//        declareFunction("cfasl_decoding_stream_read_byte", "CFASL-DECODING-STREAM-READ-BYTE", 1, 2, false);
//        declareFunction("close_cfasl_decoding_stream", "CLOSE-CFASL-DECODING-STREAM", 1, 0, false);
//        declareFunction("cfasl_decode", "CFASL-DECODE", 1, 0, false);
//        declareFunction("cfasl_count_stream_print_function_trampoline", "CFASL-COUNT-STREAM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
//        declareFunction("cfasl_count_stream_p", "CFASL-COUNT-STREAM-P", 1, 0, false);
//        new cfasl_HIDE.$cfasl_count_stream_p$UnaryFunction();
//        declareFunction("cfasl_count_stream_position", "CFASL-COUNT-STREAM-POSITION", 1, 0, false);
//        declareFunction("_csetf_cfasl_count_stream_position", "_CSETF-CFASL-COUNT-STREAM-POSITION", 2, 0, false);
//        declareFunction("make_cfasl_count_stream", "MAKE-CFASL-COUNT-STREAM", 0, 1, false);
//        declareMacro("with_cfasl_output_to_count_stream", "WITH-CFASL-OUTPUT-TO-COUNT-STREAM");
//        declareFunction("new_cfasl_count_stream", "NEW-CFASL-COUNT-STREAM", 0, 0, false);
//        declareFunction("cfasl_count_stream_write_byte", "CFASL-COUNT-STREAM-WRITE-BYTE", 2, 0, false);
//        declareFunction("cfasl_count_stream_size", "CFASL-COUNT-STREAM-SIZE", 1, 0, false);
//        declareFunction("close_cfasl_count_stream", "CLOSE-CFASL-COUNT-STREAM", 1, 0, false);
//        declareFunction("cfasl_object_size", "CFASL-OBJECT-SIZE", 1, 0, false);
//        declareFunction("cfasl_externalized_object_size", "CFASL-EXTERNALIZED-OBJECT-SIZE", 1, 0, false);
//        declareMacro("with_cfasl_stream_extensions", "WITH-CFASL-STREAM-EXTENSIONS");
//        declareFunction("cfasl_output", "CFASL-OUTPUT", 2, 0, false);
//        declareFunction("cfasl_output_externalized", "CFASL-OUTPUT-EXTERNALIZED", 2, 0, false);
//        declareFunction("cfasl_output_maybe_externalized", "CFASL-OUTPUT-MAYBE-EXTERNALIZED", 3, 0, false);
//        declareFunction("cfasl_output_object", "CFASL-OUTPUT-OBJECT", 2, 0, false);
//        declareFunction("cfasl_output_error", "CFASL-OUTPUT-ERROR", 2, 0, false);
//        declareFunction("cfasl_raw_write_byte", "CFASL-RAW-WRITE-BYTE", 2, 0, false);
//        declareFunction("cfasl_input", "CFASL-INPUT", 1, 2, false);
//        declareFunction("cfasl_opcode_peek", "CFASL-OPCODE-PEEK", 1, 2, false);
//        declareFunction("cfasl_input_object", "CFASL-INPUT-OBJECT", 1, 0, false);
//        declareFunction("cfasl_input_error", "CFASL-INPUT-ERROR", 1, 0, false);
//        declareFunction("cfasl_input_internal", "CFASL-INPUT-INTERNAL", 3, 0, false);
//        declareFunction("cfasl_opcode_peek_internal", "CFASL-OPCODE-PEEK-INTERNAL", 3, 0, false);
//        declareFunction("cfasl_input_method", "CFASL-INPUT-METHOD", 1, 0, false);
//        declareMacro("declare_cfasl_opcode", "DECLARE-CFASL-OPCODE");
//        declareFunction("register_cfasl_input_function", "REGISTER-CFASL-INPUT-FUNCTION", 2, 0, false);
//        declareFunction("cfasl_raw_peek_byte", "CFASL-RAW-PEEK-BYTE", 1, 0, false);
//        declareFunction("cfasl_raw_read_byte", "CFASL-RAW-READ-BYTE", 1, 0, false);
//        declareMacro("with_cfasl_area_allocation", "WITH-CFASL-AREA-ALLOCATION");
//        declareMacro("within_cfasl_externalization", "WITHIN-CFASL-EXTERNALIZATION");
//        declareMacro("without_cfasl_externalization", "WITHOUT-CFASL-EXTERNALIZATION");
//        declareFunction("within_cfasl_externalization_p", "WITHIN-CFASL-EXTERNALIZATION-P", 0, 0, false);
//        declareMacro("without_cfasl_channel_externalization", "WITHOUT-CFASL-CHANNEL-EXTERNALIZATION");
//        declareFunction("cfasl_channel_externalizedP", "CFASL-CHANNEL-EXTERNALIZED?", 0, 0, false);
//        declareMacro("declare_cfasl_extension_opcode", "DECLARE-CFASL-EXTENSION-OPCODE");
//        declareFunction("register_cfasl_extension", "REGISTER-CFASL-EXTENSION", 4, 0, false);
//        declareFunction("handle_cfasl_extensions", "HANDLE-CFASL-EXTENSIONS", 2, 0, false);
//        declareFunction("cfasl_output_narrow_opcode", "CFASL-OUTPUT-NARROW-OPCODE", 2, 0, false);
//        declareFunction("cfasl_output_opcode", "CFASL-OUTPUT-OPCODE", 2, 0, false);
//        declareFunction("cfasl_output_externalization", "CFASL-OUTPUT-EXTERNALIZATION", 2, 0, false);
//        declareFunction("cfasl_input_externalization", "CFASL-INPUT-EXTERNALIZATION", 1, 0, false);
//        declareFunction("cfasl_output_defstruct_recipe", "CFASL-OUTPUT-DEFSTRUCT-RECIPE", 2, 0, false);
//        declareFunction("cfasl_output_defstruct_recipe_visitorfn", "CFASL-OUTPUT-DEFSTRUCT-RECIPE-VISITORFN", 4, 0, false);
//        declareFunction("cfasl_input_defstruct_recipe", "CFASL-INPUT-DEFSTRUCT-RECIPE", 1, 0, false);
//        declareFunction("cfasl_immediate_fixnump", "CFASL-IMMEDIATE-FIXNUMP", 1, 0, false);
//        declareFunction("cfasl_output_immediate_fixnum", "CFASL-OUTPUT-IMMEDIATE-FIXNUM", 2, 0, false);
//        declareFunction("cfasl_immediate_fixnum_opcode", "CFASL-IMMEDIATE-FIXNUM-OPCODE", 1, 0, false);
//        declareFunction("cfasl_extract_immediate_fixnum", "CFASL-EXTRACT-IMMEDIATE-FIXNUM", 1, 0, false);
//        declareFunction("cfasl_output_object_integer_method", "CFASL-OUTPUT-OBJECT-INTEGER-METHOD", 2, 0, false);
//        declareFunction("cfasl_output_integer", "CFASL-OUTPUT-INTEGER", 2, 0, false);
//        declareFunction("cfasl_output_integer_internal", "CFASL-OUTPUT-INTEGER-INTERNAL", 3, 0, false);
//        declareFunction("cfasl_input_p_8bit_int", "CFASL-INPUT-P-8BIT-INT", 1, 0, false);
//        declareFunction("cfasl_input_n_8bit_int", "CFASL-INPUT-N-8BIT-INT", 1, 0, false);
//        new cfasl_HIDE.$cfasl_input_n_8bit_int$UnaryFunction();
//        declareFunction("cfasl_input_p_16bit_int", "CFASL-INPUT-P-16BIT-INT", 1, 0, false);
//        new cfasl_HIDE.$cfasl_input_p_16bit_int$UnaryFunction();
//        declareFunction("cfasl_input_n_16bit_int", "CFASL-INPUT-N-16BIT-INT", 1, 0, false);
//        declareFunction("cfasl_input_p_24bit_int", "CFASL-INPUT-P-24BIT-INT", 1, 0, false);
//        new cfasl_HIDE.$cfasl_input_p_24bit_int$UnaryFunction();
//        declareFunction("cfasl_input_n_24bit_int", "CFASL-INPUT-N-24BIT-INT", 1, 0, false);
//        new cfasl_HIDE.$cfasl_input_n_24bit_int$UnaryFunction();
//        declareFunction("cfasl_input_p_32bit_int", "CFASL-INPUT-P-32BIT-INT", 1, 0, false);
//        new cfasl_HIDE.$cfasl_input_p_32bit_int$UnaryFunction();
//        declareFunction("cfasl_input_n_32bit_int", "CFASL-INPUT-N-32BIT-INT", 1, 0, false);
//        declareFunction("assemble_2_fixnums_to_non_negative_integer", "ASSEMBLE-2-FIXNUMS-TO-NON-NEGATIVE-INTEGER", 2, 0, false);
//        declareFunction("assemble_3_fixnums_to_non_negative_integer", "ASSEMBLE-3-FIXNUMS-TO-NON-NEGATIVE-INTEGER", 3, 0, false);
//        declareFunction("assemble_4_fixnums_to_non_negative_integer", "ASSEMBLE-4-FIXNUMS-TO-NON-NEGATIVE-INTEGER", 4, 0, false);
//        declareFunction("cfasl_input_integer", "CFASL-INPUT-INTEGER", 2, 0, false);
//        declareFunction("cfasl_input_p_bignum", "CFASL-INPUT-P-BIGNUM", 1, 0, false);
//        new cfasl_HIDE.$cfasl_input_p_bignum$UnaryFunction();
//        declareFunction("cfasl_input_n_bignum", "CFASL-INPUT-N-BIGNUM", 1, 0, false);
//        declareFunction("cfasl_input_bignum", "CFASL-INPUT-BIGNUM", 2, 0, false);
//        declareFunction("cfasl_output_object_float_method", "CFASL-OUTPUT-OBJECT-FLOAT-METHOD", 2, 0, false);
//        declareFunction("cfasl_output_float", "CFASL-OUTPUT-FLOAT", 2, 0, false);
//        declareFunction("cfasl_input_p_float", "CFASL-INPUT-P-FLOAT", 1, 0, false);
//        new cfasl_HIDE.$cfasl_input_p_float$UnaryFunction();
//        declareFunction("cfasl_input_n_float", "CFASL-INPUT-N-FLOAT", 1, 0, false);
//        new cfasl_HIDE.$cfasl_input_n_float$UnaryFunction();
//        declareFunction("cfasl_input_float", "CFASL-INPUT-FLOAT", 1, 0, false);
//        declareFunction("cfasl_output_object_symbol_method", "CFASL-OUTPUT-OBJECT-SYMBOL-METHOD", 2, 0, false);
//        declareFunction("cfasl_output_keyword", "CFASL-OUTPUT-KEYWORD", 2, 0, false);
//        declareFunction("cfasl_input_keyword", "CFASL-INPUT-KEYWORD", 1, 0, false);
//        new cfasl_HIDE.$cfasl_input_keyword$UnaryFunction();
//        declareFunction("cfasl_output_other_symbol", "CFASL-OUTPUT-OTHER-SYMBOL", 2, 0, false);
//        declareFunction("cyc_package_symbol_p", "CYC-PACKAGE-SYMBOL-P", 1, 0, false);
//        declareFunction("cfasl_input_other_symbol", "CFASL-INPUT-OTHER-SYMBOL", 1, 0, false);
//        new cfasl_HIDE.$cfasl_input_other_symbol$UnaryFunction();
//        declareFunction("cfasl_output_nil", "CFASL-OUTPUT-NIL", 1, 0, false);
//        declareFunction("cfasl_input_nil", "CFASL-INPUT-NIL", 1, 0, false);
//        new cfasl_HIDE.$cfasl_input_nil$UnaryFunction();
//        declareFunction("cfasl_set_common_symbols", "CFASL-SET-COMMON-SYMBOLS", 1, 0, false);
//        declareMacro("with_cfasl_common_symbols", "WITH-CFASL-COMMON-SYMBOLS");
//        declareFunction("cfasl_set_common_symbols_simple", "CFASL-SET-COMMON-SYMBOLS-SIMPLE", 1, 0, false);
//        declareMacro("with_cfasl_common_symbols_simple", "WITH-CFASL-COMMON-SYMBOLS-SIMPLE");
//        declareFunction("cfasl_current_common_symbols", "CFASL-CURRENT-COMMON-SYMBOLS", 0, 0, false);
//        declareFunction("cfasl_common_symbol_p", "CFASL-COMMON-SYMBOL-P", 1, 0, false);
//        declareFunction("cfasl_encode_common_symbol", "CFASL-ENCODE-COMMON-SYMBOL", 1, 0, false);
//        declareFunction("cfasl_decode_common_symbol", "CFASL-DECODE-COMMON-SYMBOL", 1, 0, false);
//        declareFunction("cfasl_output_common_symbol", "CFASL-OUTPUT-COMMON-SYMBOL", 2, 0, false);
//        declareFunction("cfasl_input_common_symbol", "CFASL-INPUT-COMMON-SYMBOL", 1, 0, false);
//        new cfasl_HIDE.$cfasl_input_common_symbol$UnaryFunction();
//        declareFunction("cfasl_output_object_cons_method", "CFASL-OUTPUT-OBJECT-CONS-METHOD", 2, 0, false);
//        declareFunction("register_cfasl_list_method", "REGISTER-CFASL-LIST-METHOD", 3, 0, false);
//        declareFunction("handle_cfasl_list_methods", "HANDLE-CFASL-LIST-METHODS", 2, 0, false);
//        declareFunction("cfasl_output_list", "CFASL-OUTPUT-LIST", 2, 0, false);
//        declareFunction("cfasl_input_list", "CFASL-INPUT-LIST", 1, 0, false);
//        new cfasl_HIDE.$cfasl_input_list$UnaryFunction();
//        declareFunction("cfasl_output_dotted_list", "CFASL-OUTPUT-DOTTED-LIST", 2, 0, false);
//        declareFunction("cfasl_input_dotted_list", "CFASL-INPUT-DOTTED-LIST", 1, 0, false);
//        new cfasl_HIDE.$cfasl_input_dotted_list$UnaryFunction();
//        declareFunction("cfasl_output_object_vector_method", "CFASL-OUTPUT-OBJECT-VECTOR-METHOD", 2, 0, false);
//        declareFunction("cfasl_output_general_vector", "CFASL-OUTPUT-GENERAL-VECTOR", 2, 0, false);
//        declareFunction("cfasl_input_general_vector", "CFASL-INPUT-GENERAL-VECTOR", 1, 0, false);
//        new cfasl_HIDE.$cfasl_input_general_vector$UnaryFunction();
//        declareFunction("cfasl_output_byte_vector", "CFASL-OUTPUT-BYTE-VECTOR", 2, 0, false);
//        declareFunction("cfasl_input_byte_vector", "CFASL-INPUT-BYTE-VECTOR", 1, 0, false);
//        declareFunction("cfasl_output_object_string_method", "CFASL-OUTPUT-OBJECT-STRING-METHOD", 2, 0, false);
//        declareFunction("cfasl_output_string", "CFASL-OUTPUT-STRING", 2, 0, false);
//        declareFunction("cfasl_input_string", "CFASL-INPUT-STRING", 1, 0, false);
//        new cfasl_HIDE.$cfasl_input_string$UnaryFunction();
//        declareFunction("cfasl_output_object_character_method", "CFASL-OUTPUT-OBJECT-CHARACTER-METHOD", 2, 0, false);
//        declareFunction("cfasl_output_character", "CFASL-OUTPUT-CHARACTER", 2, 0, false);
//        declareFunction("cfasl_input_character", "CFASL-INPUT-CHARACTER", 1, 0, false);
//        new cfasl_HIDE.$cfasl_input_character$UnaryFunction();
//        declareFunction("cfasl_output_object_hash_table_method", "CFASL-OUTPUT-OBJECT-HASH-TABLE-METHOD", 2, 0, false);
//        declareFunction("cfasl_output_hashtable", "CFASL-OUTPUT-HASHTABLE", 2, 0, false);
//        declareFunction("cfasl_input_hashtable", "CFASL-INPUT-HASHTABLE", 1, 0, false);
//        declareFunction("cfasl_output_object_guid_method", "CFASL-OUTPUT-OBJECT-GUID-METHOD", 2, 0, false);
//        declareFunction("cfasl_output_guid", "CFASL-OUTPUT-GUID", 2, 0, false);
//        declareFunction("cfasl_input_guid", "CFASL-INPUT-GUID", 1, 0, false);
//        new cfasl_HIDE.$cfasl_input_guid$UnaryFunction();
//        declareFunction("cfasl_input_guid_byte_vector", "CFASL-INPUT-GUID-BYTE-VECTOR", 1, 0, false);
//        declareFunction("cfasl_output_legacy_guid", "CFASL-OUTPUT-LEGACY-GUID", 2, 0, false);
//        declareFunction("cfasl_input_legacy_guid", "CFASL-INPUT-LEGACY-GUID", 1, 0, false);
//        declareFunction("cfasl_input_guid_string", "CFASL-INPUT-GUID-STRING", 1, 0, false);
//        declareFunction("get_new_cfasl_input_guid_string_resource", "GET-NEW-CFASL-INPUT-GUID-STRING-RESOURCE", 0, 0, false);
//        declareMacro("with_new_cfasl_input_guid_string_resource", "WITH-NEW-CFASL-INPUT-GUID-STRING-RESOURCE");
//        declareFunction("cfasl_input_result_set", "CFASL-INPUT-RESULT-SET", 1, 0, false);
//        declareFunction("cfasl_output_object_package_method", "CFASL-OUTPUT-OBJECT-PACKAGE-METHOD", 2, 0, false);
//        declareFunction("cfasl_output_package", "CFASL-OUTPUT-PACKAGE", 2, 0, false);
//        declareFunction("cfasl_input_package", "CFASL-INPUT-PACKAGE", 1, 0, false);
//        declareFunction("cfasl_narrow_opcode_p", "CFASL-NARROW-OPCODE-P", 1, 0, false);
//        declareFunction("cfasl_wide_opcode_input_method", "CFASL-WIDE-OPCODE-INPUT-METHOD", 1, 0, false);
//        declareFunction("cfasl_input_wide_opcode_encoded", "CFASL-INPUT-WIDE-OPCODE-ENCODED", 1, 0, false);
//        declareMacro("declare_wide_cfasl_opcode", "DECLARE-WIDE-CFASL-OPCODE");
//        declareFunction("register_wide_cfasl_opcode_input_function", "REGISTER-WIDE-CFASL-OPCODE-INPUT-FUNCTION", 2, 0, false);
//        declareFunction("cfasl_output_wide_opcode", "CFASL-OUTPUT-WIDE-OPCODE", 2, 0, false);
//        declareFunction("cfasl_output_object_instance_method", "CFASL-OUTPUT-OBJECT-INSTANCE-METHOD", 2, 0, false);
//        declareFunction("cfasl_input_instance", "CFASL-INPUT-INSTANCE", 1, 0, false);
//        declareMacro("declare_cfasl_guid_opcode", "DECLARE-CFASL-GUID-OPCODE");
//        declareMacro("declare_cfasl_guid_string_opcode", "DECLARE-CFASL-GUID-STRING-OPCODE");
//        declareFunction("register_cfasl_guid_denoted_type_input_function", "REGISTER-CFASL-GUID-DENOTED-TYPE-INPUT-FUNCTION", 2, 0, false);
//        declareFunction("write_cfasl_guid_denoted_type_opcode", "WRITE-CFASL-GUID-DENOTED-TYPE-OPCODE", 2, 0, false);
//        declareFunction("cfasl_guid_denoted_type_input_method", "CFASL-GUID-DENOTED-TYPE-INPUT-METHOD", 1, 0, false);
//        declareFunction("cfasl_input_guid_denoted_type", "CFASL-INPUT-GUID-DENOTED-TYPE", 1, 0, false);
//        declareMacro("with_guid_denoted_type_cfasl_encoding", "WITH-GUID-DENOTED-TYPE-CFASL-ENCODING");
//        declareFunction("cfasl_test", "CFASL-TEST", 1, 0, false);
//        declareFunction("show_cfasl_file", "SHOW-CFASL-FILE", 1, 1, false);
//        return NIL;
//    }
//
//    public static final SubLObject init_cfasl_file() {
//        defconstant("*DTP-CFASL-ENCODING-STREAM*", CFASL_ENCODING_STREAM);
//        defparameter("*TERSE-GUID-SERIALIZATION-ENABLED?*", NIL);
//        defparameter("*TERSE-GUID-SERIALIZATION-ENABLED-FOR-CFASL-ENCODE-EXTERNALIZED?*", $UNINITIALIZED);
//        defconstant("*DTP-CFASL-DECODING-STREAM*", CFASL_DECODING_STREAM);
//        defconstant("*DTP-CFASL-COUNT-STREAM*", CFASL_COUNT_STREAM);
//        defparameter("*CFASL-STREAM-EXTENSIONS-ENABLED*", NIL);
//        defparameter("*CFASL-UNREAD-BYTE*", NIL);
//        deflexical("*CFASL-OUTPUT-OBJECT-METHOD-TABLE*", make_vector($int$256, NIL));
//        defparameter("*CFASL-INPUT-TO-STATIC-AREA*", NIL);
//        defconstant("*CFASL-MAX-OPCODE*", $int$128);
//        deflexical("*CFASL-INPUT-METHOD-TABLE*", NIL != boundp($cfasl_input_method_table$) ? ((SubLObject) ($cfasl_input_method_table$.getGlobalValue())) : make_vector($cfasl_max_opcode$.getGlobalValue(), CFASL_INPUT_ERROR));
//        defparameter("*WITHIN-CFASL-EXTERNALIZATION*", NIL);
//        defparameter("*CFASL-CHANNEL-EXTERNALIZED?*", T);
//        deflexical("*CFASL-EXTENSIONS*", NIL != boundp($cfasl_extensions$) ? ((SubLObject) ($cfasl_extensions$.getGlobalValue())) : NIL);
//        defconstant("*CFASL-OPCODE-EXTERNALIZATION*", $int$51);
//        defparameter("*CURRENT-CFASL-DEFSTRUCT-OUTPUT-STREAM*", NIL);
//        defconstant("*CFASL-OPCODE-DEFSTRUCT-RECIPE*", $int$44);
//        defconstant("*CFASL-IMMEDIATE-FIXNUM-CUTOFF*", $cfasl_max_opcode$.getGlobalValue());
//        defconstant("*CFASL-IMMEDIATE-FIXNUM-OFFSET*", subtract($int$256, $cfasl_immediate_fixnum_cutoff$.getGlobalValue()));
//        defconstant("*CFASL-OPCODE-P-8BIT-INT*", ZERO_INTEGER);
//        defconstant("*CFASL-OPCODE-N-8BIT-INT*", ONE_INTEGER);
//        defconstant("*CFASL-OPCODE-P-16BIT-INT*", TWO_INTEGER);
//        defconstant("*CFASL-OPCODE-N-16BIT-INT*", THREE_INTEGER);
//        defconstant("*CFASL-OPCODE-P-24BIT-INT*", FOUR_INTEGER);
//        defconstant("*CFASL-OPCODE-N-24BIT-INT*", FIVE_INTEGER);
//        defconstant("*CFASL-OPCODE-P-32BIT-INT*", SIX_INTEGER);
//        defconstant("*CFASL-OPCODE-N-32BIT-INT*", SEVEN_INTEGER);
//        defconstant("*CFASL-OPCODE-P-BIGNUM*", $int$23);
//        defconstant("*CFASL-OPCODE-N-BIGNUM*", $int$24);
//        defconstant("*CFASL-OPCODE-P-FLOAT*", EIGHT_INTEGER);
//        defconstant("*CFASL-OPCODE-N-FLOAT*", NINE_INTEGER);
//        defconstant("*CFASL-OPCODE-KEYWORD*", TEN_INTEGER);
//        defconstant("*CFASL-OPCODE-OTHER-SYMBOL*", ELEVEN_INTEGER);
//        defconstant("*CFASL-OPCODE-NIL*", TWELVE_INTEGER);
//        defconstant("*CFASL-OPCODE-COMMON-SYMBOL*", $int$50);
//        defparameter("*CFASL-COMMON-SYMBOLS*", NIL);
//        deflexical("*CFASL-LIST-METHODS*", NIL != boundp($cfasl_list_methods$) ? ((SubLObject) ($cfasl_list_methods$.getGlobalValue())) : NIL);
//        defconstant("*CFASL-OPCODE-LIST*", THIRTEEN_INTEGER);
//        defconstant("*CFASL-OPCODE-DOTTED-LIST*", SEVENTEEN_INTEGER);
//        defconstant("*CFASL-OPCODE-GENERAL-VECTOR*", FOURTEEN_INTEGER);
//        defconstant("*CFASL-OPCODE-BYTE-VECTOR*", $int$26);
//        defconstant("*CFASL-OPCODE-STRING*", FIFTEEN_INTEGER);
//        defparameter("*CFASL-INPUT-STRING-RESOURCE*", NIL);
//        defconstant("*CFASL-OPCODE-CHARACTER*", SIXTEEN_INTEGER);
//        defconstant("*CFASL-OPCODE-HASHTABLE*", EIGHTEEN_INTEGER);
//        defconstant("*CFASL-OPCODE-GUID*", $int$43);
//        defconstant("*CFASL-OPCODE-LEGACY-GUID*", $int$25);
//        defparameter("*CFASL-INPUT-GUID-STRING-RESOURCE*", NIL);
//        defconstant("*CFASL-OPCODE-RESULT-SET*", $int$27);
//        defconstant("*CFASL-OPCODE-PACKAGE*", $int$28);
//        defconstant("*CFASL-OPCODE-WIDE-CFASL-OPCODE*", $int$29);
//        defconstant("*CFASL-MIN-WIDE-OPCODE*", $cfasl_max_opcode$.getGlobalValue());
//        deflexical("*CFASL-WIDE-OPCODE-INPUT-METHOD-TABLE*", NIL != boundp($cfasl_wide_opcode_input_method_table$) ? ((SubLObject) ($cfasl_wide_opcode_input_method_table$.getGlobalValue())) : make_hash_table($int$32, symbol_function(EQL), UNPROVIDED));
//        defconstant("*CFASL-OPCODE-INSTANCE*", $int$124);
//        defconstant("*CFASL-OPCODE-GUID-DENOTED-TYPE*", $int$126);
//        deflexical("*CFASL-GUID-DENOTED-TYPE-INPUT-METHOD-TABLE*", NIL != boundp($cfasl_guid_denoted_type_input_method_table$) ? ((SubLObject) ($cfasl_guid_denoted_type_input_method_table$.getGlobalValue())) : make_hash_table($int$100, symbol_function(EQUALP), UNPROVIDED));
//        return NIL;
//    }
//
//    public static final SubLObject setup_cfasl_file() {
//                register_method($print_object_method_table$.getGlobalValue(), $dtp_cfasl_encoding_stream$.getGlobalValue(), symbol_function(CFASL_ENCODING_STREAM_PRINT_FUNCTION_TRAMPOLINE));
//        def_csetf(CFASL_ENCODING_STREAM_INTERNAL_STREAM, _CSETF_CFASL_ENCODING_STREAM_INTERNAL_STREAM);
//        identity(CFASL_ENCODING_STREAM);
//        access_macros.register_macro_helper(CFASL_ENCODING_STRING_STREAM_ENCODING, WITH_CFASL_OUTPUT_TO_HEX_STRING);
//        access_macros.register_macro_helper(NEW_CFASL_ENCODING_STREAM, WITH_CFASL_OUTPUT_TO_BYTE_VECTOR);
//        access_macros.register_macro_helper(CFASL_ENCODING_STREAM_WRITE_BYTE, WITH_CFASL_OUTPUT_TO_BYTE_VECTOR);
//        access_macros.register_macro_helper(CFASL_ENCODING_STREAM_ENCODING, WITH_CFASL_OUTPUT_TO_BYTE_VECTOR);
//        access_macros.register_macro_helper(CLOSE_CFASL_ENCODING_STREAM, WITH_CFASL_OUTPUT_TO_BYTE_VECTOR);
//        register_method($print_object_method_table$.getGlobalValue(), $dtp_cfasl_decoding_stream$.getGlobalValue(), symbol_function(CFASL_DECODING_STREAM_PRINT_FUNCTION_TRAMPOLINE));
//        def_csetf(CFASL_DECODING_STREAM_INTERNAL_STREAM, _CSETF_CFASL_DECODING_STREAM_INTERNAL_STREAM);
//        identity(CFASL_DECODING_STREAM);
//        access_macros.register_macro_helper(NEW_CFASL_DECODING_STREAM_FROM_STRING, WITH_CFASL_INPUT_FROM_STRING);
//        access_macros.register_macro_helper(NEW_CFASL_DECODING_STREAM, WITH_CFASL_INPUT_FROM_BYTE_VECTOR);
//        access_macros.register_macro_helper(CFASL_DECODING_STREAM_READ_BYTE, WITH_CFASL_INPUT_FROM_BYTE_VECTOR);
//        access_macros.register_macro_helper(CLOSE_CFASL_DECODING_STREAM, WITH_CFASL_INPUT_FROM_BYTE_VECTOR);
//        register_method($print_object_method_table$.getGlobalValue(), $dtp_cfasl_count_stream$.getGlobalValue(), symbol_function(CFASL_COUNT_STREAM_PRINT_FUNCTION_TRAMPOLINE));
//        def_csetf(CFASL_COUNT_STREAM_POSITION, _CSETF_CFASL_COUNT_STREAM_POSITION);
//        identity(CFASL_COUNT_STREAM);
//        subl_macro_promotions.declare_defglobal($cfasl_input_method_table$);
//        access_macros.register_macro_helper(REGISTER_CFASL_INPUT_FUNCTION, DECLARE_CFASL_OPCODE);
//        subl_macro_promotions.declare_defglobal($cfasl_extensions$);
//        access_macros.register_macro_helper(REGISTER_CFASL_EXTENSION, DECLARE_CFASL_EXTENSION_OPCODE);
//        register_cfasl_input_function($cfasl_opcode_externalization$.getGlobalValue(), CFASL_INPUT_EXTERNALIZATION);
//        register_cfasl_input_function($cfasl_opcode_defstruct_recipe$.getGlobalValue(), CFASL_INPUT_DEFSTRUCT_RECIPE);
//        register_cfasl_input_function($cfasl_opcode_p_8bit_int$.getGlobalValue(), CFASL_INPUT_P_8BIT_INT);
//        register_cfasl_input_function($cfasl_opcode_n_8bit_int$.getGlobalValue(), CFASL_INPUT_N_8BIT_INT);
//        register_cfasl_input_function($cfasl_opcode_p_16bit_int$.getGlobalValue(), CFASL_INPUT_P_16BIT_INT);
//        register_cfasl_input_function($cfasl_opcode_n_16bit_int$.getGlobalValue(), CFASL_INPUT_N_16BIT_INT);
//        register_cfasl_input_function($cfasl_opcode_p_24bit_int$.getGlobalValue(), CFASL_INPUT_P_24BIT_INT);
//        register_cfasl_input_function($cfasl_opcode_n_24bit_int$.getGlobalValue(), CFASL_INPUT_N_24BIT_INT);
//        register_cfasl_input_function($cfasl_opcode_p_32bit_int$.getGlobalValue(), CFASL_INPUT_P_32BIT_INT);
//        register_cfasl_input_function($cfasl_opcode_n_32bit_int$.getGlobalValue(), CFASL_INPUT_N_32BIT_INT);
//        register_cfasl_input_function($cfasl_opcode_p_bignum$.getGlobalValue(), CFASL_INPUT_P_BIGNUM);
//        register_cfasl_input_function($cfasl_opcode_n_bignum$.getGlobalValue(), CFASL_INPUT_N_BIGNUM);
//        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_bignum$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_INTEGER_METHOD));
//        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_fixnum$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_INTEGER_METHOD));
//        register_cfasl_input_function($cfasl_opcode_p_float$.getGlobalValue(), CFASL_INPUT_P_FLOAT);
//        register_cfasl_input_function($cfasl_opcode_n_float$.getGlobalValue(), CFASL_INPUT_N_FLOAT);
//        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_float$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_FLOAT_METHOD));
//        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_symbol$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_SYMBOL_METHOD));
//        register_cfasl_input_function($cfasl_opcode_keyword$.getGlobalValue(), CFASL_INPUT_KEYWORD);
//        register_cfasl_input_function($cfasl_opcode_other_symbol$.getGlobalValue(), CFASL_INPUT_OTHER_SYMBOL);
//        register_cfasl_input_function($cfasl_opcode_nil$.getGlobalValue(), CFASL_INPUT_NIL);
//        register_cfasl_input_function($cfasl_opcode_common_symbol$.getGlobalValue(), CFASL_INPUT_COMMON_SYMBOL);
//        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_cons$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_CONS_METHOD));
//        subl_macro_promotions.declare_defglobal($cfasl_list_methods$);
//        register_cfasl_input_function($cfasl_opcode_list$.getGlobalValue(), CFASL_INPUT_LIST);
//        register_cfasl_input_function($cfasl_opcode_dotted_list$.getGlobalValue(), CFASL_INPUT_DOTTED_LIST);
//        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_vector$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_VECTOR_METHOD));
//        register_cfasl_input_function($cfasl_opcode_general_vector$.getGlobalValue(), CFASL_INPUT_GENERAL_VECTOR);
//        register_cfasl_input_function($cfasl_opcode_byte_vector$.getGlobalValue(), CFASL_INPUT_BYTE_VECTOR);
//        register_cfasl_input_function($cfasl_opcode_string$.getGlobalValue(), CFASL_INPUT_STRING);
//        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_string$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_STRING_METHOD));
//        register_cfasl_input_function($cfasl_opcode_character$.getGlobalValue(), CFASL_INPUT_CHARACTER);
//        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_character$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_CHARACTER_METHOD));
//        register_cfasl_input_function($cfasl_opcode_hashtable$.getGlobalValue(), CFASL_INPUT_HASHTABLE);
//        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_hash_table$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_HASH_TABLE_METHOD));
//        register_cfasl_input_function($cfasl_opcode_guid$.getGlobalValue(), CFASL_INPUT_GUID);
//        register_method($cfasl_output_object_method_table$.getGlobalValue(), Guids.$dtp_guid$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_GUID_METHOD));
//        register_cfasl_input_function($cfasl_opcode_legacy_guid$.getGlobalValue(), CFASL_INPUT_LEGACY_GUID);
//        register_cfasl_input_function($cfasl_opcode_result_set$.getGlobalValue(), CFASL_INPUT_RESULT_SET);
//        register_cfasl_input_function($cfasl_opcode_package$.getGlobalValue(), CFASL_INPUT_PACKAGE);
//        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_package$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_PACKAGE_METHOD));
//        register_cfasl_input_function($cfasl_opcode_wide_cfasl_opcode$.getGlobalValue(), CFASL_INPUT_WIDE_OPCODE_ENCODED);
//        subl_macro_promotions.declare_defglobal($cfasl_wide_opcode_input_method_table$);
//        access_macros.register_macro_helper(REGISTER_WIDE_CFASL_OPCODE_INPUT_FUNCTION, DECLARE_WIDE_CFASL_OPCODE);
//        register_cfasl_input_function($cfasl_opcode_instance$.getGlobalValue(), CFASL_INPUT_INSTANCE);
//        register_method($cfasl_output_object_method_table$.getGlobalValue(), subloop_structures.$dtp_instance$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_INSTANCE_METHOD));
//        register_cfasl_input_function($cfasl_opcode_guid_denoted_type$.getGlobalValue(), CFASL_INPUT_GUID_DENOTED_TYPE);
//        subl_macro_promotions.declare_defglobal($cfasl_guid_denoted_type_input_method_table$);
//        access_macros.register_macro_helper(REGISTER_CFASL_GUID_DENOTED_TYPE_INPUT_FUNCTION, DECLARE_CFASL_GUID_OPCODE);
//        return NIL;
//    }
//
//    // // Internal Constants
//    private static final SubLSymbol CFASL_ENCODING_STREAM = makeSymbol("CFASL-ENCODING-STREAM");
//
//    private static final SubLSymbol CFASL_ENCODING_STREAM_P = makeSymbol("CFASL-ENCODING-STREAM-P");
//
//    static private final SubLList $list_alt2 = list(makeSymbol("INTERNAL-STREAM"));
//
//    static private final SubLList $list_alt3 = list(makeKeyword("INTERNAL-STREAM"));
//
//    static private final SubLList $list_alt4 = list(makeSymbol("CFASL-ENCODING-STREAM-INTERNAL-STREAM"));
//
//    static private final SubLList $list_alt5 = list(makeSymbol("_CSETF-CFASL-ENCODING-STREAM-INTERNAL-STREAM"));
//
//
//
//    private static final SubLSymbol CFASL_ENCODING_STREAM_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CFASL-ENCODING-STREAM-PRINT-FUNCTION-TRAMPOLINE");
//
//    private static final SubLSymbol CFASL_ENCODING_STREAM_INTERNAL_STREAM = makeSymbol("CFASL-ENCODING-STREAM-INTERNAL-STREAM");
//
//    public static final SubLSymbol _CSETF_CFASL_ENCODING_STREAM_INTERNAL_STREAM = makeSymbol("_CSETF-CFASL-ENCODING-STREAM-INTERNAL-STREAM");
//
//
//
//    static private final SubLString $str_alt11$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
//
//    static private final SubLList $list_alt12 = list(list(makeSymbol("STREAM"), makeSymbol("STRING")), makeSymbol("&BODY"), makeSymbol("BODY"));
//
//
//
//
//
//    static private final SubLList $list_alt15 = list(list(makeSymbol("NEW-CFASL-ENCODING-STREAM")));
//
//
//
//
//
//
//
//    private static final SubLSymbol CFASL_ENCODING_STRING_STREAM_ENCODING = makeSymbol("CFASL-ENCODING-STRING-STREAM-ENCODING");
//
//    private static final SubLSymbol CLOSE_CFASL_ENCODING_STREAM = makeSymbol("CLOSE-CFASL-ENCODING-STREAM");
//
//    private static final SubLSymbol WITH_CFASL_OUTPUT_TO_HEX_STRING = makeSymbol("WITH-CFASL-OUTPUT-TO-HEX-STRING");
//
//    static private final SubLList $list_alt22 = list(list(makeSymbol("STREAM"), makeSymbol("BYTE-VECTOR")), makeSymbol("&BODY"), makeSymbol("BODY"));
//
//    private static final SubLSymbol CFASL_ENCODING_STREAM_ENCODING = makeSymbol("CFASL-ENCODING-STREAM-ENCODING");
//
//    private static final SubLSymbol NEW_CFASL_ENCODING_STREAM = makeSymbol("NEW-CFASL-ENCODING-STREAM");
//
//    private static final SubLSymbol WITH_CFASL_OUTPUT_TO_BYTE_VECTOR = makeSymbol("WITH-CFASL-OUTPUT-TO-BYTE-VECTOR");
//
//    private static final SubLSymbol CFASL_ENCODING_STREAM_WRITE_BYTE = makeSymbol("CFASL-ENCODING-STREAM-WRITE-BYTE");
//
//
//
//    private static final SubLSymbol CFASL_DECODING_STREAM = makeSymbol("CFASL-DECODING-STREAM");
//
//    private static final SubLSymbol CFASL_DECODING_STREAM_P = makeSymbol("CFASL-DECODING-STREAM-P");
//
//    static private final SubLList $list_alt30 = list(makeSymbol("CFASL-DECODING-STREAM-INTERNAL-STREAM"));
//
//    static private final SubLList $list_alt31 = list(makeSymbol("_CSETF-CFASL-DECODING-STREAM-INTERNAL-STREAM"));
//
//    private static final SubLSymbol CFASL_DECODING_STREAM_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CFASL-DECODING-STREAM-PRINT-FUNCTION-TRAMPOLINE");
//
//    private static final SubLSymbol CFASL_DECODING_STREAM_INTERNAL_STREAM = makeSymbol("CFASL-DECODING-STREAM-INTERNAL-STREAM");
//
//    public static final SubLSymbol _CSETF_CFASL_DECODING_STREAM_INTERNAL_STREAM = makeSymbol("_CSETF-CFASL-DECODING-STREAM-INTERNAL-STREAM");
//
//    private static final SubLSymbol NEW_CFASL_DECODING_STREAM_FROM_STRING = makeSymbol("NEW-CFASL-DECODING-STREAM-FROM-STRING");
//
//    private static final SubLSymbol CLOSE_CFASL_DECODING_STREAM = makeSymbol("CLOSE-CFASL-DECODING-STREAM");
//
//    private static final SubLSymbol WITH_CFASL_INPUT_FROM_STRING = makeSymbol("WITH-CFASL-INPUT-FROM-STRING");
//
//    private static final SubLSymbol NEW_CFASL_DECODING_STREAM = makeSymbol("NEW-CFASL-DECODING-STREAM");
//
//    private static final SubLSymbol WITH_CFASL_INPUT_FROM_BYTE_VECTOR = makeSymbol("WITH-CFASL-INPUT-FROM-BYTE-VECTOR");
//
//    private static final SubLSymbol CFASL_ENCODING_P = makeSymbol("CFASL-ENCODING-P");
//
//    private static final SubLSymbol CFASL_DECODING_STREAM_READ_BYTE = makeSymbol("CFASL-DECODING-STREAM-READ-BYTE");
//
//
//
//    private static final SubLSymbol CFASL_COUNT_STREAM = makeSymbol("CFASL-COUNT-STREAM");
//
//    private static final SubLSymbol CFASL_COUNT_STREAM_P = makeSymbol("CFASL-COUNT-STREAM-P");
//
//    static private final SubLList $list_alt45 = list(makeSymbol("POSITION"));
//
//    static private final SubLList $list_alt46 = list(makeKeyword("POSITION"));
//
//    static private final SubLList $list_alt47 = list(makeSymbol("CFASL-COUNT-STREAM-POSITION"));
//
//    static private final SubLList $list_alt48 = list(makeSymbol("_CSETF-CFASL-COUNT-STREAM-POSITION"));
//
//    private static final SubLSymbol CFASL_COUNT_STREAM_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CFASL-COUNT-STREAM-PRINT-FUNCTION-TRAMPOLINE");
//
//    private static final SubLSymbol CFASL_COUNT_STREAM_POSITION = makeSymbol("CFASL-COUNT-STREAM-POSITION");
//
//    public static final SubLSymbol _CSETF_CFASL_COUNT_STREAM_POSITION = makeSymbol("_CSETF-CFASL-COUNT-STREAM-POSITION");
//
//
//
//    static private final SubLList $list_alt53 = list(list(makeSymbol("STREAM"), makeSymbol("COUNT")), makeSymbol("&BODY"), makeSymbol("BODY"));
//
//    static private final SubLList $list_alt54 = list(list(makeSymbol("NEW-CFASL-COUNT-STREAM")));
//
//    private static final SubLSymbol CFASL_COUNT_STREAM_SIZE = makeSymbol("CFASL-COUNT-STREAM-SIZE");
//
//    private static final SubLSymbol CLOSE_CFASL_COUNT_STREAM = makeSymbol("CLOSE-CFASL-COUNT-STREAM");
//
//    static private final SubLList $list_alt57 = list(list(makeSymbol("*CFASL-STREAM-EXTENSIONS-ENABLED*"), T), list(makeSymbol("*CFASL-UNREAD-BYTE*"), NIL));
//
//
//
//
//
//    static private final SubLString $$$Use_NIL_instead = makeString("Use NIL instead");
//
//    static private final SubLString $str_alt61$CFASL_cannot_handle____S = makeString("CFASL cannot handle : ~S");
//
//    static private final SubLString $str_alt62$Undefined_cfasl_opcode_in__S = makeString("Undefined cfasl opcode in ~S");
//
//    static private final SubLString $str_alt63$end_of_file_on_stream__S = makeString("end-of-file on stream ~S");
//
//    private static final SubLSymbol CFASL_INPUT_ERROR = makeSymbol("CFASL-INPUT-ERROR");
//
//    static private final SubLString $str_alt65$Undefined_cfasl_opcode__A_in__S = makeString("Undefined cfasl opcode ~A in ~S");
//
//    public static final SubLInteger $int$128 = makeInteger(128);
//
//    public static final SubLSymbol $cfasl_input_method_table$ = makeSymbol("*CFASL-INPUT-METHOD-TABLE*");
//
//    static private final SubLList $list_alt68 = list(makeSymbol("VARIABLE"), makeSymbol("CFASL-OPCODE"), makeSymbol("INPUT-FUNCTION"));
//
//
//
//    private static final SubLSymbol DEFCONSTANT_PRIVATE = makeSymbol("DEFCONSTANT-PRIVATE");
//
//    private static final SubLSymbol REGISTER_CFASL_INPUT_FUNCTION = makeSymbol("REGISTER-CFASL-INPUT-FUNCTION");
//
//
//
//    private static final SubLSymbol DECLARE_CFASL_OPCODE = makeSymbol("DECLARE-CFASL-OPCODE");
//
//
//
//
//
//    public static final SubLSymbol $cfasl_input_to_static_area$ = makeSymbol("*CFASL-INPUT-TO-STATIC-AREA*");
//
//
//
//    static private final SubLList $list_alt78 = list(list(makeSymbol("*WITHIN-CFASL-EXTERNALIZATION*"), T));
//
//    static private final SubLList $list_alt79 = list(list(makeSymbol("*WITHIN-CFASL-EXTERNALIZATION*"), NIL));
//
//    static private final SubLList $list_alt80 = list(list(makeSymbol("*CFASL-CHANNEL-EXTERNALIZED?*"), NIL));
//
//    public static final SubLSymbol $cfasl_extensions$ = makeSymbol("*CFASL-EXTENSIONS*");
//
//    static private final SubLList $list_alt82 = list(makeSymbol("VARIABLE"), makeSymbol("CFASL-OPCODE"), makeSymbol("PRED-FUNC"), makeSymbol("OUTPUT-FUNC"), makeSymbol("INPUT-FUNC"));
//
//    private static final SubLSymbol REGISTER_CFASL_EXTENSION = makeSymbol("REGISTER-CFASL-EXTENSION");
//
//    private static final SubLSymbol DECLARE_CFASL_EXTENSION_OPCODE = makeSymbol("DECLARE-CFASL-EXTENSION-OPCODE");
//
//    public static final SubLInteger $int$51 = makeInteger(51);
//
//    private static final SubLSymbol CFASL_INPUT_EXTERNALIZATION = makeSymbol("CFASL-INPUT-EXTERNALIZATION");
//
//    public static final SubLInteger $int$44 = makeInteger(44);
//
//    private static final SubLSymbol CFASL_INPUT_DEFSTRUCT_RECIPE = makeSymbol("CFASL-INPUT-DEFSTRUCT-RECIPE");
//
//    private static final SubLSymbol CFASL_OUTPUT_DEFSTRUCT_RECIPE_VISITORFN = makeSymbol("CFASL-OUTPUT-DEFSTRUCT-RECIPE-VISITORFN");
//
//
//
//
//
//
//
//    static private final SubLString $str_alt93$Error__expected_constructor_for_d = makeString("Error, expected constructor for defstruct, got ~A.");
//
//    static private final SubLString $str_alt94$Expected_keyword_at_slot___A_of_s = makeString("Expected keyword at slot #~A of structure with constructor ~A, got ~A.");
//
//    private static final SubLSymbol CFASL_INPUT_P_8BIT_INT = makeSymbol("CFASL-INPUT-P-8BIT-INT");
//
//    private static final SubLSymbol CFASL_INPUT_N_8BIT_INT = makeSymbol("CFASL-INPUT-N-8BIT-INT");
//
//    private static final SubLSymbol CFASL_INPUT_P_16BIT_INT = makeSymbol("CFASL-INPUT-P-16BIT-INT");
//
//    private static final SubLSymbol CFASL_INPUT_N_16BIT_INT = makeSymbol("CFASL-INPUT-N-16BIT-INT");
//
//    private static final SubLSymbol CFASL_INPUT_P_24BIT_INT = makeSymbol("CFASL-INPUT-P-24BIT-INT");
//
//    private static final SubLSymbol CFASL_INPUT_N_24BIT_INT = makeSymbol("CFASL-INPUT-N-24BIT-INT");
//
//    private static final SubLSymbol CFASL_INPUT_P_32BIT_INT = makeSymbol("CFASL-INPUT-P-32BIT-INT");
//
//    private static final SubLSymbol CFASL_INPUT_N_32BIT_INT = makeSymbol("CFASL-INPUT-N-32BIT-INT");
//
//    public static final SubLInteger $int$23 = makeInteger(23);
//
//    private static final SubLSymbol CFASL_INPUT_P_BIGNUM = makeSymbol("CFASL-INPUT-P-BIGNUM");
//
//    public static final SubLInteger $int$24 = makeInteger(24);
//
//    private static final SubLSymbol CFASL_INPUT_N_BIGNUM = makeSymbol("CFASL-INPUT-N-BIGNUM");
//
//    private static final SubLSymbol CFASL_OUTPUT_OBJECT_INTEGER_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-INTEGER-METHOD");
//
//    public static final SubLInteger $int$32768 = makeInteger(32768);
//
//    public static final SubLInteger $int$8388608 = makeInteger(8388608);
//
//    public static final SubLInteger $int$2147483648 = makeInteger("2147483648");
//
//    static private final SubLList $list_alt111 = list(makeSymbol("SIGN"), makeSymbol("&REST"), makeSymbol("FIXNUMS"));
//
//
//
//
//
//    private static final SubLSymbol CFASL_INPUT_P_FLOAT = makeSymbol("CFASL-INPUT-P-FLOAT");
//
//    private static final SubLSymbol CFASL_INPUT_N_FLOAT = makeSymbol("CFASL-INPUT-N-FLOAT");
//
//    private static final SubLSymbol CFASL_OUTPUT_OBJECT_FLOAT_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-FLOAT-METHOD");
//
//    private static final SubLSymbol CFASL_OUTPUT_OBJECT_SYMBOL_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-SYMBOL-METHOD");
//
//    private static final SubLSymbol CFASL_INPUT_KEYWORD = makeSymbol("CFASL-INPUT-KEYWORD");
//
//    private static final SubLSymbol CFASL_INPUT_OTHER_SYMBOL = makeSymbol("CFASL-INPUT-OTHER-SYMBOL");
//
//    private static final SubLSymbol CFASL_INPUT_NIL = makeSymbol("CFASL-INPUT-NIL");
//
//    public static final SubLInteger $int$50 = makeInteger(50);
//
//    private static final SubLSymbol CFASL_INPUT_COMMON_SYMBOL = makeSymbol("CFASL-INPUT-COMMON-SYMBOL");
//
//
//
//    static private final SubLList $list_alt124 = list(makeSymbol("SYMBOLS"), makeSymbol("&BODY"), makeSymbol("BODY"));
//
//    static private final SubLList $list_alt125 = list(list(makeSymbol("*CFASL-COMMON-SYMBOLS*"), NIL));
//
//    private static final SubLSymbol CFASL_SET_COMMON_SYMBOLS = makeSymbol("CFASL-SET-COMMON-SYMBOLS");
//
//    private static final SubLSymbol CFASL_SET_COMMON_SYMBOLS_SIMPLE = makeSymbol("CFASL-SET-COMMON-SYMBOLS-SIMPLE");
//
//    static private final SubLString $str_alt128$Use_NIL_ = makeString("Use NIL.");
//
//    static private final SubLString $str_alt129$Common_symbol_at_index__D_was_not = makeString("Common symbol at index ~D was not found in ~S.");
//
//    public static final SubLSymbol $cfasl_common_symbols$ = makeSymbol("*CFASL-COMMON-SYMBOLS*");
//
//    private static final SubLSymbol CFASL_OUTPUT_OBJECT_CONS_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-CONS-METHOD");
//
//    public static final SubLSymbol $cfasl_list_methods$ = makeSymbol("*CFASL-LIST-METHODS*");
//
//    private static final SubLSymbol CFASL_INPUT_LIST = makeSymbol("CFASL-INPUT-LIST");
//
//    static private final SubLString $$$Output_NIL_instead = makeString("Output NIL instead");
//
//    static private final SubLString $str_alt135$Trying_to_output_a_circular_list_ = makeString("Trying to output a circular list!");
//
//    private static final SubLSymbol CFASL_INPUT_DOTTED_LIST = makeSymbol("CFASL-INPUT-DOTTED-LIST");
//
//    private static final SubLSymbol CFASL_OUTPUT_OBJECT_VECTOR_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-VECTOR-METHOD");
//
//    private static final SubLSymbol CFASL_INPUT_GENERAL_VECTOR = makeSymbol("CFASL-INPUT-GENERAL-VECTOR");
//
//    public static final SubLInteger $int$26 = makeInteger(26);
//
//    private static final SubLSymbol CFASL_INPUT_BYTE_VECTOR = makeSymbol("CFASL-INPUT-BYTE-VECTOR");
//
//    private static final SubLSymbol CFASL_INPUT_STRING = makeSymbol("CFASL-INPUT-STRING");
//
//    private static final SubLSymbol CFASL_OUTPUT_OBJECT_STRING_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-STRING-METHOD");
//
//    private static final SubLSymbol CFASL_INPUT_CHARACTER = makeSymbol("CFASL-INPUT-CHARACTER");
//
//    private static final SubLSymbol CFASL_OUTPUT_OBJECT_CHARACTER_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-CHARACTER-METHOD");
//
//    private static final SubLSymbol CFASL_INPUT_HASHTABLE = makeSymbol("CFASL-INPUT-HASHTABLE");
//
//    private static final SubLSymbol CFASL_OUTPUT_OBJECT_HASH_TABLE_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-HASH-TABLE-METHOD");
//
//    public static final SubLInteger $int$43 = makeInteger(43);
//
//    private static final SubLSymbol CFASL_INPUT_GUID = makeSymbol("CFASL-INPUT-GUID");
//
//    private static final SubLSymbol CFASL_OUTPUT_OBJECT_GUID_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-GUID-METHOD");
//
//    public static final SubLInteger $int$25 = makeInteger(25);
//
//    private static final SubLSymbol CFASL_INPUT_LEGACY_GUID = makeSymbol("CFASL-INPUT-LEGACY-GUID");
//
//    public static final SubLInteger $int$36 = makeInteger(36);
//
//    static private final SubLList $list_alt153 = list(list(makeSymbol("*CFASL-INPUT-GUID-STRING-RESOURCE*"), list(makeSymbol("GET-NEW-CFASL-INPUT-GUID-STRING-RESOURCE"))));
//
//    public static final SubLInteger $int$27 = makeInteger(27);
//
//    private static final SubLSymbol CFASL_INPUT_RESULT_SET = makeSymbol("CFASL-INPUT-RESULT-SET");
//
//    public static final SubLInteger $int$28 = makeInteger(28);
//
//    private static final SubLSymbol CFASL_INPUT_PACKAGE = makeSymbol("CFASL-INPUT-PACKAGE");
//
//    private static final SubLSymbol CFASL_OUTPUT_OBJECT_PACKAGE_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-PACKAGE-METHOD");
//
//    public static final SubLInteger $int$29 = makeInteger(29);
//
//    private static final SubLSymbol CFASL_INPUT_WIDE_OPCODE_ENCODED = makeSymbol("CFASL-INPUT-WIDE-OPCODE-ENCODED");
//
//    public static final SubLSymbol $cfasl_wide_opcode_input_method_table$ = makeSymbol("*CFASL-WIDE-OPCODE-INPUT-METHOD-TABLE*");
//
//
//
//    static private final SubLList $list_alt163 = list(makeSymbol("VARIABLE"), makeSymbol("WIDE-OPCODE"), makeSymbol("INPUT-FUNCTION"));
//
//    static private final SubLString $str_alt164$_A_is_too_small_to_be_a_wide_opco = makeString("~A is too small to be a wide opcode.");
//
//    private static final SubLSymbol REGISTER_WIDE_CFASL_OPCODE_INPUT_FUNCTION = makeSymbol("REGISTER-WIDE-CFASL-OPCODE-INPUT-FUNCTION");
//
//    private static final SubLSymbol DECLARE_WIDE_CFASL_OPCODE = makeSymbol("DECLARE-WIDE-CFASL-OPCODE");
//
//    public static final SubLInteger $int$124 = makeInteger(124);
//
//    private static final SubLSymbol CFASL_INPUT_INSTANCE = makeSymbol("CFASL-INPUT-INSTANCE");
//
//
//
//    private static final SubLSymbol CFASL_OUTPUT_OBJECT_INSTANCE_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-INSTANCE-METHOD");
//
//
//
//    public static final SubLInteger $int$126 = makeInteger(126);
//
//    private static final SubLSymbol CFASL_INPUT_GUID_DENOTED_TYPE = makeSymbol("CFASL-INPUT-GUID-DENOTED-TYPE");
//
//    public static final SubLSymbol $cfasl_guid_denoted_type_input_method_table$ = makeSymbol("*CFASL-GUID-DENOTED-TYPE-INPUT-METHOD-TABLE*");
//
//
//
//    static private final SubLList $list_alt176 = list(makeSymbol("VARIABLE"), makeSymbol("CFASL-GUID-OPCODE"), makeSymbol("INPUT-FUNCTION"));
//
//
//
//
//
//    private static final SubLSymbol REGISTER_CFASL_GUID_DENOTED_TYPE_INPUT_FUNCTION = makeSymbol("REGISTER-CFASL-GUID-DENOTED-TYPE-INPUT-FUNCTION");
//
//    static private final SubLList $list_alt180 = list(makeSymbol("VARIABLE"), makeSymbol("CFASL-GUID-STRING-OPCODE"), makeSymbol("INPUT-FUNCTION"));
//
//    private static final SubLSymbol GUID_STRING_P = makeSymbol("GUID-STRING-P");
//
//    private static final SubLSymbol STRING_TO_GUID = makeSymbol("STRING-TO-GUID");
//
//    private static final SubLSymbol DECLARE_CFASL_GUID_OPCODE = makeSymbol("DECLARE-CFASL-GUID-OPCODE");
//
//    static private final SubLList $list_alt184 = list(list(makeSymbol("TYPE-DENOTING-GUID"), makeSymbol("STREAM")), makeSymbol("&BODY"), makeSymbol("BODY"));
//
//    private static final SubLSymbol WRITE_CFASL_GUID_DENOTED_TYPE_OPCODE = makeSymbol("WRITE-CFASL-GUID-DENOTED-TYPE-OPCODE");
//
//
//
//    static private final SubLString $str_alt187$Unable_to_open__S = makeString("Unable to open ~S");
//
//    // // Initializers
//    @Override
//    public void declareFunctions() {
//        declare_cfasl_file();
//    }
//
//    @Override
//    public void initializeVariables() {
//        init_cfasl_file();
//    }
//
//    @Override
//    public void runTopLevelForms() {
//        setup_cfasl_file();
//    }
//}
//
