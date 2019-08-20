/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cfasl.cfasl_decoding_stream_hexchar_position;
import static com.cyc.cycjava.cycl.cfasl.cfasl_encoding_stream_encoding;
import static com.cyc.cycjava.cycl.cfasl.cfasl_encoding_string_stream_encoding;
import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output_externalized;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output_maybe_externalized;
import static com.cyc.cycjava.cycl.cfasl.close_cfasl_decoding_stream;
import static com.cyc.cycjava.cycl.cfasl.close_cfasl_encoding_stream;
import static com.cyc.cycjava.cycl.cfasl.new_cfasl_decoding_stream;
import static com.cyc.cycjava.cycl.cfasl.new_cfasl_decoding_stream_from_string;
import static com.cyc.cycjava.cycl.cfasl.new_cfasl_encoding_stream;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CFASL-UTILITIES
 * source file: /cyc/top/cycl/cfasl-utilities.lisp
 * created:     2019/07/03 17:37:14
 */
public final class cfasl_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new cfasl_utilities();



    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $cfasl_default_compression_options$ = makeSymbol("*CFASL-DEFAULT-COMPRESSION-OPTIONS*");

    static private final SubLString $str2$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str3$Cannot_open__A = makeString("Cannot open ~A");

    static private final SubLList $list6 = list(makeKeyword("ANALYZE"), makeKeyword("OBJECT"));

    private static final SubLSymbol IGNORE_ALL_CONSTANTS = makeSymbol("IGNORE-ALL-CONSTANTS");

    private static final SubLSymbol IGNORE_ALL_NARTS = makeSymbol("IGNORE-ALL-NARTS");

    private static final SubLSymbol IGNORE_ALL_ASSERTIONS = makeSymbol("IGNORE-ALL-ASSERTIONS");

    private static final SubLSymbol IGNORE_ALL_DEDUCTIONS = makeSymbol("IGNORE-ALL-DEDUCTIONS");

    private static final SubLSymbol IGNORE_ALL_KB_HL_SUPPORTS = makeSymbol("IGNORE-ALL-KB-HL-SUPPORTS");

    private static final SubLSymbol IGNORE_ALL_CLAUSE_STRUCS = makeSymbol("IGNORE-ALL-CLAUSE-STRUCS");

    private static final SubLList $list17 = list(list(makeSymbol("*CFASL-CONSTANT-HANDLE-LOOKUP-FUNC*"), list(QUOTE, makeSymbol("IGNORE-ALL-CONSTANTS"))), list(makeSymbol("*CFASL-NART-HANDLE-LOOKUP-FUNC*"), list(QUOTE, makeSymbol("IGNORE-ALL-NARTS"))), list(makeSymbol("*CFASL-ASSERTION-HANDLE-LOOKUP-FUNC*"), list(QUOTE, makeSymbol("IGNORE-ALL-ASSERTIONS"))), list(makeSymbol("*CFASL-DEDUCTION-HANDLE-LOOKUP-FUNC*"), list(QUOTE, makeSymbol("IGNORE-ALL-DEDUCTIONS"))), list(makeSymbol("*CFASL-KB-HL-SUPPORT-HANDLE-LOOKUP-FUNC*"), list(QUOTE, makeSymbol("IGNORE-ALL-KB-HL-SUPPORTS"))), list(makeSymbol("*CFASL-CLAUSE-STRUC-HANDLE-LOOKUP-FUNC*"), list(QUOTE, makeSymbol("IGNORE-ALL-CLAUSE-STRUCS"))));

    private static final SubLSymbol TEST_CFASL_DECODING_STREAM_POSITION = makeSymbol("TEST-CFASL-DECODING-STREAM-POSITION");

    private static final SubLList $list25 = list(list(list(list(makeString("abc"), makeInteger(123), list(ONE_INTEGER, TWO_INTEGER, THREE_INTEGER)), EQUAL), makeKeyword("SUCCESS")));

    private static final SubLList $list27 = list(makeSymbol("&KEY"), makeSymbol("POSITION"), makeSymbol("OBJECT"));

    private static final SubLList $list28 = list(makeKeyword("POSITION"), makeKeyword("OBJECT"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLString $str30$Expected__A__got_back__A_ = makeString("Expected ~A, got back ~A.");

    private static final SubLString $str31$Expected_stream_position__A__got_ = makeString("Expected stream position ~A, got back ~A.");

    private static final SubLString $str32$Expected_to_have_read__A_hex_char = makeString("Expected to have read ~A hex-chars from stream, got ~A.");

    // Definitions
    /**
     * Save out OBJECT to FILENAME in CFASL format.
     */
    @LispMethod(comment = "Save out OBJECT to FILENAME in CFASL format.")
    public static final SubLObject cfasl_save_alt(SubLObject v_object, SubLObject filename) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(filename, STRINGP);
            {
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_binary(filename, $OUTPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt2$Unable_to_open__S, filename);
                    }
                    {
                        SubLObject stream_1 = stream;
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!stream_1.isStream()) {
                                Errors.error($str_alt3$Cannot_open__A, filename);
                            }
                        }
                        cfasl_output(v_object, stream_1);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return T;
        }
    }

    // Definitions
    /**
     * Save out OBJECT to FILENAME in CFASL format.
     */
    @LispMethod(comment = "Save out OBJECT to FILENAME in CFASL format.")
    public static SubLObject cfasl_save(final SubLObject v_object, final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(filename) : "! stringp(filename) " + ("Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) ") + filename;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_binary(filename, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str2$Unable_to_open__S, filename);
            }
            final SubLObject stream_$1 = stream;
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!stream_$1.isStream())) {
                Errors.error($str3$Cannot_open__A, filename);
            }
            cfasl_output(v_object, stream_$1);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return T;
    }

    /**
     * Save out multiple OBJECTS to FILENAME in CFASL format.
     */
    @LispMethod(comment = "Save out multiple OBJECTS to FILENAME in CFASL format.")
    public static final SubLObject cfasl_save_all_alt(SubLObject objects, SubLObject filename) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(filename, STRINGP);
            {
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_binary(filename, $OUTPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt2$Unable_to_open__S, filename);
                    }
                    {
                        SubLObject stream_2 = stream;
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!stream_2.isStream()) {
                                Errors.error($str_alt3$Cannot_open__A, filename);
                            }
                        }
                        {
                            SubLObject cdolist_list_var = objects;
                            SubLObject v_object = NIL;
                            for (v_object = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_object = cdolist_list_var.first()) {
                                cfasl_output(v_object, stream_2);
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return T;
        }
    }

    /**
     * Save out multiple OBJECTS to FILENAME in CFASL format.
     */
    @LispMethod(comment = "Save out multiple OBJECTS to FILENAME in CFASL format.")
    public static SubLObject cfasl_save_all(final SubLObject objects, final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(filename) : "! stringp(filename) " + ("Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) ") + filename;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_binary(filename, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str2$Unable_to_open__S, filename);
            }
            final SubLObject stream_$2 = stream;
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!stream_$2.isStream())) {
                Errors.error($str3$Cannot_open__A, filename);
            }
            SubLObject cdolist_list_var = objects;
            SubLObject v_object = NIL;
            v_object = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                cfasl_output(v_object, stream_$2);
                cdolist_list_var = cdolist_list_var.rest();
                v_object = cdolist_list_var.first();
            } 
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return T;
    }

    /**
     * Return the first object saved in FILENAME in CFASL format.
     */
    @LispMethod(comment = "Return the first object saved in FILENAME in CFASL format.")
    public static final SubLObject cfasl_load_alt(SubLObject filename) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(filename, STRINGP);
            {
                SubLObject v_object = NIL;
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_binary(filename, $INPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt2$Unable_to_open__S, filename);
                    }
                    {
                        SubLObject stream_3 = stream;
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!stream_3.isStream()) {
                                Errors.error($str_alt3$Cannot_open__A, filename);
                            }
                        }
                        v_object = cfasl_input(stream_3, UNPROVIDED, UNPROVIDED);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return v_object;
            }
        }
    }

    /**
     * Return the first object saved in FILENAME in CFASL format.
     */
    @LispMethod(comment = "Return the first object saved in FILENAME in CFASL format.")
    public static SubLObject cfasl_load(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(filename) : "! stringp(filename) " + ("Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) ") + filename;
        SubLObject v_object = NIL;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_binary(filename, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str2$Unable_to_open__S, filename);
            }
            final SubLObject stream_$3 = stream;
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!stream_$3.isStream())) {
                Errors.error($str3$Cannot_open__A, filename);
            }
            v_object = cfasl_input(stream_$3, UNPROVIDED, UNPROVIDED);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return v_object;
    }

    public static final SubLObject cfasl_load_all_alt(SubLObject filename) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(filename, STRINGP);
            {
                SubLObject objects = NIL;
                SubLObject eofP = NIL;
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_binary(filename, $INPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt2$Unable_to_open__S, filename);
                    }
                    {
                        SubLObject stream_4 = stream;
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!stream_4.isStream()) {
                                Errors.error($str_alt3$Cannot_open__A, filename);
                            }
                        }
                        while (NIL == eofP) {
                            {
                                SubLObject v_object = cfasl_input(stream_4, NIL, $EOF);
                                if (v_object == $EOF) {
                                    eofP = T;
                                } else {
                                    objects = cons(v_object, objects);
                                }
                            }
                        } 
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return objects;
            }
        }
    }

    public static SubLObject cfasl_load_all(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(filename) : "! stringp(filename) " + ("Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) ") + filename;
        SubLObject objects = NIL;
        SubLObject eofP = NIL;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_binary(filename, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str2$Unable_to_open__S, filename);
            }
            final SubLObject stream_$4 = stream;
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!stream_$4.isStream())) {
                Errors.error($str3$Cannot_open__A, filename);
            }
            while (NIL == eofP) {
                final SubLObject v_object = cfasl_input(stream_$4, NIL, $EOF);
                if (v_object == $EOF) {
                    eofP = T;
                } else {
                    objects = cons(v_object, objects);
                }
            } 
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return objects;
    }

    /**
     * Save out OBJECT to FILENAME in CFASL format.
     */
    @LispMethod(comment = "Save out OBJECT to FILENAME in CFASL format.")
    public static final SubLObject cfasl_save_externalized_alt(SubLObject v_object, SubLObject filename) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(filename, STRINGP);
            {
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_binary(filename, $OUTPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt2$Unable_to_open__S, filename);
                    }
                    {
                        SubLObject stream_5 = stream;
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!stream_5.isStream()) {
                                Errors.error($str_alt3$Cannot_open__A, filename);
                            }
                        }
                        cfasl_output_externalized(v_object, stream_5);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return T;
        }
    }

    /**
     * Save out OBJECT to FILENAME in CFASL format.
     */
    @LispMethod(comment = "Save out OBJECT to FILENAME in CFASL format.")
    public static SubLObject cfasl_save_externalized(final SubLObject v_object, final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(filename) : "! stringp(filename) " + ("Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) ") + filename;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_binary(filename, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str2$Unable_to_open__S, filename);
            }
            final SubLObject stream_$5 = stream;
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!stream_$5.isStream())) {
                Errors.error($str3$Cannot_open__A, filename);
            }
            cfasl_output_externalized(v_object, stream_$5);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return T;
    }

    public static final SubLObject cfasl_save_maybe_externalized_alt(SubLObject v_object, SubLObject filename, SubLObject externalizedP) {
        if (NIL != externalizedP) {
            return com.cyc.cycjava.cycl.cfasl_utilities.cfasl_save_externalized(v_object, filename);
        } else {
            return com.cyc.cycjava.cycl.cfasl_utilities.cfasl_save(v_object, filename);
        }
    }

    public static SubLObject cfasl_save_maybe_externalized(final SubLObject v_object, final SubLObject filename, final SubLObject externalizedP) {
        if (NIL != externalizedP) {
            return cfasl_save_externalized(v_object, filename);
        }
        return cfasl_save(v_object, filename);
    }

    public static SubLObject cfasl_load_all_from_string(final SubLObject string) {
        SubLObject items = NIL;
        final SubLObject stream = new_cfasl_decoding_stream_from_string(string);
        try {
            SubLObject item;
            for (item = NIL, item = cfasl_input(stream, NIL, $EOF); item != $EOF; item = cfasl_input(stream, NIL, $EOF)) {
                items = cons(item, items);
            }
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close_cfasl_decoding_stream(stream);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return items;
    }

    public static final SubLObject cfasl_output_compressed_alt(SubLObject v_object, SubLObject stream, SubLObject options) {
        if (options == UNPROVIDED) {
            options = $cfasl_default_compression_options$.getGlobalValue();
        }
        return com.cyc.cycjava.cycl.cfasl_utilities.cfasl_output_compressed_int(v_object, stream, NIL, options);
    }

    public static SubLObject cfasl_output_compressed(final SubLObject v_object, final SubLObject stream, SubLObject options) {
        if (options == UNPROVIDED) {
            options = $cfasl_default_compression_options$.getGlobalValue();
        }
        return cfasl_output_compressed_int(v_object, stream, NIL, options);
    }

    public static final SubLObject cfasl_output_compressed_externalized_alt(SubLObject v_object, SubLObject stream, SubLObject options) {
        if (options == UNPROVIDED) {
            options = $cfasl_default_compression_options$.getGlobalValue();
        }
        return com.cyc.cycjava.cycl.cfasl_utilities.cfasl_output_compressed_int(v_object, stream, T, options);
    }

    public static SubLObject cfasl_output_compressed_externalized(final SubLObject v_object, final SubLObject stream, SubLObject options) {
        if (options == UNPROVIDED) {
            options = $cfasl_default_compression_options$.getGlobalValue();
        }
        return cfasl_output_compressed_int(v_object, stream, T, options);
    }

    public static final SubLObject cfasl_output_compressed_maybe_externalized_alt(SubLObject v_object, SubLObject stream, SubLObject externalizedP, SubLObject options) {
        if (options == UNPROVIDED) {
            options = $cfasl_default_compression_options$.getGlobalValue();
        }
        return com.cyc.cycjava.cycl.cfasl_utilities.cfasl_output_compressed_int(v_object, stream, externalizedP, options);
    }

    public static SubLObject cfasl_output_compressed_maybe_externalized(final SubLObject v_object, final SubLObject stream, final SubLObject externalizedP, SubLObject options) {
        if (options == UNPROVIDED) {
            options = $cfasl_default_compression_options$.getGlobalValue();
        }
        return cfasl_output_compressed_int(v_object, stream, externalizedP, options);
    }

    public static final SubLObject cfasl_output_compressed_int_alt(SubLObject v_object, SubLObject stream, SubLObject externalizedP, SubLObject options) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            options = copy_list(options);
            {
                SubLObject not_list = getf(options, $NOT, UNPROVIDED);
                not_list = cons(v_object, not_list);
                options = putf(options, $NOT, not_list);
            }
            {
                SubLObject analyze = getf(options, $ANALYZE, UNPROVIDED);
                if ($OBJECT == analyze) {
                    options = putf(options, $ANALYZE, v_object);
                }
            }
            {
                SubLObject _prev_bind_0 = cfasl_compression.$cfasl_output_compression_options$.currentBinding(thread);
                SubLObject _prev_bind_1 = cfasl_compression.$cfasl_output_compression_code_isg$.currentBinding(thread);
                SubLObject _prev_bind_2 = cfasl_compression.$cfasl_output_compression_table$.currentBinding(thread);
                try {
                    cfasl_compression.$cfasl_output_compression_options$.bind(options, thread);
                    cfasl_compression.$cfasl_output_compression_code_isg$.bind(integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                    cfasl_compression.$cfasl_output_compression_table$.bind(cfasl_compression.with_cfasl_compression_cfasl_output_compression_table(stream), thread);
                    cfasl_compression.with_cfasl_compression_preamble(stream);
                    cfasl_output_maybe_externalized(v_object, stream, externalizedP);
                    cfasl_compression.with_cfasl_compression_postamble(stream);
                } finally {
                    cfasl_compression.$cfasl_output_compression_table$.rebind(_prev_bind_2, thread);
                    cfasl_compression.$cfasl_output_compression_code_isg$.rebind(_prev_bind_1, thread);
                    cfasl_compression.$cfasl_output_compression_options$.rebind(_prev_bind_0, thread);
                }
            }
            return v_object;
        }
    }

    public static SubLObject cfasl_output_compressed_int(final SubLObject v_object, final SubLObject stream, final SubLObject externalizedP, SubLObject options) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        options = copy_list(options);
        SubLObject not_list = getf(options, $NOT, UNPROVIDED);
        not_list = cons(v_object, not_list);
        options = putf(options, $NOT, not_list);
        final SubLObject analyze = getf(options, $ANALYZE, UNPROVIDED);
        if ($OBJECT == analyze) {
            options = putf(options, $ANALYZE, v_object);
        }
        final SubLObject _prev_bind_0 = cfasl_compression.$cfasl_output_compression_options$.currentBinding(thread);
        final SubLObject _prev_bind_2 = cfasl_compression.$cfasl_output_compression_code_isg$.currentBinding(thread);
        final SubLObject _prev_bind_3 = cfasl_compression.$cfasl_output_compression_table$.currentBinding(thread);
        try {
            cfasl_compression.$cfasl_output_compression_options$.bind(options, thread);
            cfasl_compression.$cfasl_output_compression_code_isg$.bind(integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            cfasl_compression.$cfasl_output_compression_table$.bind(cfasl_compression.with_cfasl_compression_cfasl_output_compression_table(stream), thread);
            cfasl_compression.with_cfasl_compression_preamble(stream);
            cfasl_output_maybe_externalized(v_object, stream, externalizedP);
            cfasl_compression.with_cfasl_compression_postamble(stream);
        } finally {
            cfasl_compression.$cfasl_output_compression_table$.rebind(_prev_bind_3, thread);
            cfasl_compression.$cfasl_output_compression_code_isg$.rebind(_prev_bind_2, thread);
            cfasl_compression.$cfasl_output_compression_options$.rebind(_prev_bind_0, thread);
        }
        return v_object;
    }

    public static final SubLObject cfasl_save_compressed_alt(SubLObject v_object, SubLObject filename, SubLObject options) {
        if (options == UNPROVIDED) {
            options = $cfasl_default_compression_options$.getGlobalValue();
        }
        return com.cyc.cycjava.cycl.cfasl_utilities.cfasl_save_compressed_int(v_object, filename, NIL, options);
    }

    public static SubLObject cfasl_save_compressed(final SubLObject v_object, final SubLObject filename, SubLObject options) {
        if (options == UNPROVIDED) {
            options = $cfasl_default_compression_options$.getGlobalValue();
        }
        return cfasl_save_compressed_int(v_object, filename, NIL, options);
    }

    public static final SubLObject cfasl_save_compressed_externalized_alt(SubLObject v_object, SubLObject filename, SubLObject options) {
        if (options == UNPROVIDED) {
            options = $cfasl_default_compression_options$.getGlobalValue();
        }
        return com.cyc.cycjava.cycl.cfasl_utilities.cfasl_save_compressed_int(v_object, filename, T, options);
    }

    public static SubLObject cfasl_save_compressed_externalized(final SubLObject v_object, final SubLObject filename, SubLObject options) {
        if (options == UNPROVIDED) {
            options = $cfasl_default_compression_options$.getGlobalValue();
        }
        return cfasl_save_compressed_int(v_object, filename, T, options);
    }

    public static final SubLObject cfasl_save_compressed_maybe_externalized_alt(SubLObject v_object, SubLObject filename, SubLObject externalizedP, SubLObject options) {
        if (options == UNPROVIDED) {
            options = $cfasl_default_compression_options$.getGlobalValue();
        }
        return com.cyc.cycjava.cycl.cfasl_utilities.cfasl_save_compressed_int(v_object, filename, externalizedP, options);
    }

    public static SubLObject cfasl_save_compressed_maybe_externalized(final SubLObject v_object, final SubLObject filename, final SubLObject externalizedP, SubLObject options) {
        if (options == UNPROVIDED) {
            options = $cfasl_default_compression_options$.getGlobalValue();
        }
        return cfasl_save_compressed_int(v_object, filename, externalizedP, options);
    }

    public static final SubLObject cfasl_save_compressed_int_alt(SubLObject v_object, SubLObject filename, SubLObject externalizedP, SubLObject options) {
        if (options == UNPROVIDED) {
            options = $cfasl_default_compression_options$.getGlobalValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_binary(filename, $OUTPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt2$Unable_to_open__S, filename);
                    }
                    {
                        SubLObject stream_6 = stream;
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!stream_6.isStream()) {
                                Errors.error($str_alt3$Cannot_open__A, filename);
                            }
                        }
                        result = com.cyc.cycjava.cycl.cfasl_utilities.cfasl_output_compressed_int(v_object, stream_6, externalizedP, options);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject cfasl_save_compressed_int(final SubLObject v_object, final SubLObject filename, final SubLObject externalizedP, SubLObject options) {
        if (options == UNPROVIDED) {
            options = $cfasl_default_compression_options$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_binary(filename, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str2$Unable_to_open__S, filename);
            }
            final SubLObject stream_$6 = stream;
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!stream_$6.isStream())) {
                Errors.error($str3$Cannot_open__A, filename);
            }
            result = cfasl_output_compressed_int(v_object, stream_$6, externalizedP, options);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return result;
    }

    public static final SubLObject cfasl_save_all_compressed_alt(SubLObject objects, SubLObject filename, SubLObject options) {
        if (options == UNPROVIDED) {
            options = $cfasl_default_compression_options$.getGlobalValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(filename, STRINGP);
            {
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_binary(filename, $OUTPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt2$Unable_to_open__S, filename);
                    }
                    {
                        SubLObject stream_7 = stream;
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!stream_7.isStream()) {
                                Errors.error($str_alt3$Cannot_open__A, filename);
                            }
                        }
                        {
                            SubLObject _prev_bind_0 = cfasl_compression.$cfasl_output_compression_options$.currentBinding(thread);
                            SubLObject _prev_bind_1 = cfasl_compression.$cfasl_output_compression_code_isg$.currentBinding(thread);
                            SubLObject _prev_bind_2 = cfasl_compression.$cfasl_output_compression_table$.currentBinding(thread);
                            try {
                                cfasl_compression.$cfasl_output_compression_options$.bind(options, thread);
                                cfasl_compression.$cfasl_output_compression_code_isg$.bind(integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                                cfasl_compression.$cfasl_output_compression_table$.bind(cfasl_compression.with_cfasl_compression_cfasl_output_compression_table(stream_7), thread);
                                cfasl_compression.with_cfasl_compression_preamble(stream_7);
                                {
                                    SubLObject cdolist_list_var = objects;
                                    SubLObject v_object = NIL;
                                    for (v_object = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_object = cdolist_list_var.first()) {
                                        cfasl_output(v_object, stream_7);
                                    }
                                }
                                cfasl_compression.with_cfasl_compression_postamble(stream_7);
                            } finally {
                                cfasl_compression.$cfasl_output_compression_table$.rebind(_prev_bind_2, thread);
                                cfasl_compression.$cfasl_output_compression_code_isg$.rebind(_prev_bind_1, thread);
                                cfasl_compression.$cfasl_output_compression_options$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return T;
        }
    }

    public static SubLObject cfasl_save_all_compressed(final SubLObject objects, final SubLObject filename, SubLObject options) {
        if (options == UNPROVIDED) {
            options = $cfasl_default_compression_options$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(filename) : "! stringp(filename) " + ("Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) ") + filename;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_binary(filename, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str2$Unable_to_open__S, filename);
            }
            final SubLObject stream_$7 = stream;
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!stream_$7.isStream())) {
                Errors.error($str3$Cannot_open__A, filename);
            }
            final SubLObject _prev_bind_2 = cfasl_compression.$cfasl_output_compression_options$.currentBinding(thread);
            final SubLObject _prev_bind_3 = cfasl_compression.$cfasl_output_compression_code_isg$.currentBinding(thread);
            final SubLObject _prev_bind_4 = cfasl_compression.$cfasl_output_compression_table$.currentBinding(thread);
            try {
                cfasl_compression.$cfasl_output_compression_options$.bind(options, thread);
                cfasl_compression.$cfasl_output_compression_code_isg$.bind(integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                cfasl_compression.$cfasl_output_compression_table$.bind(cfasl_compression.with_cfasl_compression_cfasl_output_compression_table(stream_$7), thread);
                cfasl_compression.with_cfasl_compression_preamble(stream_$7);
                SubLObject cdolist_list_var = objects;
                SubLObject v_object = NIL;
                v_object = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    cfasl_output(v_object, stream_$7);
                    cdolist_list_var = cdolist_list_var.rest();
                    v_object = cdolist_list_var.first();
                } 
                cfasl_compression.with_cfasl_compression_postamble(stream_$7);
            } finally {
                cfasl_compression.$cfasl_output_compression_table$.rebind(_prev_bind_4, thread);
                cfasl_compression.$cfasl_output_compression_code_isg$.rebind(_prev_bind_3, thread);
                cfasl_compression.$cfasl_output_compression_options$.rebind(_prev_bind_2, thread);
            }
        } finally {
            final SubLObject _prev_bind_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
            }
        }
        return T;
    }

    /**
     * Reads input from FILENAME and writes a compressed version of the object(s) in FILENAME to NEW-FILENAME.
     */
    @LispMethod(comment = "Reads input from FILENAME and writes a compressed version of the object(s) in FILENAME to NEW-FILENAME.")
    public static final SubLObject cfasl_compress_alt(SubLObject filename, SubLObject new_filename, SubLObject options) {
        if (options == UNPROVIDED) {
            options = $cfasl_default_compression_options$.getGlobalValue();
        }
        {
            SubLObject objects = com.cyc.cycjava.cycl.cfasl_utilities.cfasl_load_all(filename);
            com.cyc.cycjava.cycl.cfasl_utilities.cfasl_save_all_compressed(objects, new_filename, options);
        }
        return new_filename;
    }

    @LispMethod(comment = "Reads input from FILENAME and writes a compressed version of the object(s) in FILENAME to NEW-FILENAME.")
    public static SubLObject cfasl_compress(final SubLObject filename, final SubLObject new_filename, SubLObject options) {
        if (options == UNPROVIDED) {
            options = $cfasl_default_compression_options$.getGlobalValue();
        }
        final SubLObject objects = cfasl_load_all(filename);
        cfasl_save_all_compressed(objects, new_filename, options);
        return new_filename;
    }

    /**
     * Byte compile the forms in INPUT-FILENAME into CFASL format and save to OUTPUT-FILENAME.
     */
    @LispMethod(comment = "Byte compile the forms in INPUT-FILENAME into CFASL format and save to OUTPUT-FILENAME.")
    public static final SubLObject cfasl_byte_compile_alt(SubLObject input_filename, SubLObject output_filename) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(input_filename, STRINGP);
            SubLTrampolineFile.checkType(output_filename, STRINGP);
            {
                SubLObject v_answer = NIL;
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_text(input_filename, $INPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt2$Unable_to_open__S, input_filename);
                    }
                    {
                        SubLObject in_stream = stream;
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!in_stream.isStream()) {
                                Errors.error($str_alt3$Cannot_open__A, input_filename);
                            }
                        }
                        {
                            SubLObject stream_8 = NIL;
                            try {
                                {
                                    SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                    try {
                                        stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                        stream_8 = compatibility.open_binary(output_filename, $OUTPUT, NIL);
                                    } finally {
                                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                if (!stream_8.isStream()) {
                                    Errors.error($str_alt2$Unable_to_open__S, output_filename);
                                }
                                {
                                    SubLObject out_stream = stream_8;
                                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                        if (!out_stream.isStream()) {
                                            Errors.error($str_alt3$Cannot_open__A, output_filename);
                                        }
                                    }
                                    {
                                        SubLObject form = NIL;
                                        for (form = read(in_stream, NIL, $EOF, UNPROVIDED); $EOF != form; form = read(in_stream, NIL, $EOF, UNPROVIDED)) {
                                            cfasl_output(form, out_stream);
                                        }
                                        v_answer = T;
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if (stream_8.isStream()) {
                                            close(stream_8, UNPROVIDED);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return v_answer;
            }
        }
    }

    @LispMethod(comment = "Byte compile the forms in INPUT-FILENAME into CFASL format and save to OUTPUT-FILENAME.")
    public static SubLObject cfasl_byte_compile(final SubLObject input_filename, final SubLObject output_filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(input_filename) : "! stringp(input_filename) " + ("Types.stringp(input_filename) " + "CommonSymbols.NIL != Types.stringp(input_filename) ") + input_filename;
        assert NIL != stringp(output_filename) : "! stringp(output_filename) " + ("Types.stringp(output_filename) " + "CommonSymbols.NIL != Types.stringp(output_filename) ") + output_filename;
        SubLObject v_answer = NIL;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(input_filename, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str2$Unable_to_open__S, input_filename);
            }
            final SubLObject in_stream = stream;
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!in_stream.isStream())) {
                Errors.error($str3$Cannot_open__A, input_filename);
            }
            SubLObject stream_$8 = NIL;
            try {
                final SubLObject _prev_bind_2 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream_$8 = compatibility.open_binary(output_filename, $OUTPUT);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_2, thread);
                }
                if (!stream_$8.isStream()) {
                    Errors.error($str2$Unable_to_open__S, output_filename);
                }
                final SubLObject out_stream = stream_$8;
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!out_stream.isStream())) {
                    Errors.error($str3$Cannot_open__A, output_filename);
                }
                SubLObject form;
                for (form = NIL, form = read(in_stream, NIL, $EOF, UNPROVIDED); $EOF != form; form = read(in_stream, NIL, $EOF, UNPROVIDED)) {
                    cfasl_output(form, out_stream);
                }
                v_answer = T;
            } finally {
                final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream_$8.isStream()) {
                        close(stream_$8, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
        } finally {
            final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        return v_answer;
    }

    /**
     * Read and evaluate the byte-compiled forms saved in FILENAME in CFASL format.
     */
    @LispMethod(comment = "Read and evaluate the byte-compiled forms saved in FILENAME in CFASL format.")
    public static final SubLObject cfasl_byte_load_alt(SubLObject filename) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(filename, STRINGP);
            {
                SubLObject v_answer = NIL;
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_binary(filename, $INPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt2$Unable_to_open__S, filename);
                    }
                    {
                        SubLObject stream_9 = stream;
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!stream_9.isStream()) {
                                Errors.error($str_alt3$Cannot_open__A, filename);
                            }
                        }
                        {
                            SubLObject form = NIL;
                            for (form = cfasl_input(stream_9, NIL, $EOF); $EOF != form; form = cfasl_input(stream_9, NIL, $EOF)) {
                                eval(form);
                            }
                            v_answer = T;
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return v_answer;
            }
        }
    }

    /**
     * Read and evaluate the byte-compiled forms saved in FILENAME in CFASL format.
     */
    @LispMethod(comment = "Read and evaluate the byte-compiled forms saved in FILENAME in CFASL format.")
    public static SubLObject cfasl_byte_load(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(filename) : "! stringp(filename) " + ("Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) ") + filename;
        SubLObject v_answer = NIL;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_binary(filename, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str2$Unable_to_open__S, filename);
            }
            final SubLObject stream_$9 = stream;
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!stream_$9.isStream())) {
                Errors.error($str3$Cannot_open__A, filename);
            }
            SubLObject form;
            for (form = NIL, form = cfasl_input(stream_$9, NIL, $EOF); $EOF != form; form = cfasl_input(stream_$9, NIL, $EOF)) {
                eval(form);
            }
            v_answer = T;
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return v_answer;
    }

    /**
     * Serialize the object into memory, then deserialize it again and return
     * the result to the caller.
     *
     * @return the copy of the object created through deserialization
     */
    @LispMethod(comment = "Serialize the object into memory, then deserialize it again and return\r\nthe result to the caller.\r\n\r\n@return the copy of the object created through deserialization\nSerialize the object into memory, then deserialize it again and return\nthe result to the caller.")
    public static final SubLObject cfasl_copy_object_alt(SubLObject v_object) {
        {
            SubLObject byte_vector = NIL;
            SubLObject new_object = NIL;
            {
                SubLObject s = new_cfasl_encoding_stream();
                try {
                    cfasl_output(v_object, s);
                    byte_vector = cfasl_encoding_stream_encoding(s);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            close_cfasl_encoding_stream(s);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            }
            {
                SubLObject s = new_cfasl_decoding_stream(byte_vector);
                try {
                    new_object = cfasl_input(s, UNPROVIDED, UNPROVIDED);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            close_cfasl_decoding_stream(s);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            }
            return new_object;
        }
    }

    @LispMethod(comment = "Serialize the object into memory, then deserialize it again and return\r\nthe result to the caller.\r\n\r\n@return the copy of the object created through deserialization\nSerialize the object into memory, then deserialize it again and return\nthe result to the caller.")
    public static SubLObject cfasl_copy_object(final SubLObject v_object) {
        SubLObject byte_vector = NIL;
        SubLObject new_object = NIL;
        SubLObject s = new_cfasl_encoding_stream();
        try {
            cfasl_output(v_object, s);
            byte_vector = cfasl_encoding_stream_encoding(s);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close_cfasl_encoding_stream(s);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        s = new_cfasl_decoding_stream(byte_vector);
        try {
            new_object = cfasl_input(s, UNPROVIDED, UNPROVIDED);
        } finally {
            final SubLObject _prev_bind_2 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values2 = getValuesAsVector();
                close_cfasl_decoding_stream(s);
                restoreValuesFromVector(_values2);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_2);
            }
        }
        return new_object;
    }/**
     * Serialize the object into memory, then deserialize it again and return
     * the result to the caller.
     *
     * @return the copy of the object created through deserialization
     */


    public static SubLObject ignore_all_constants(final SubLObject id) {
        return cfasl_kb_methods.cfasl_invalid_constant();
    }

    public static SubLObject ignore_all_narts(final SubLObject id) {
        return cfasl_kb_methods.cfasl_invalid_nart();
    }

    public static SubLObject ignore_all_assertions(final SubLObject id) {
        return cfasl_kb_methods.cfasl_invalid_assertion();
    }

    public static SubLObject ignore_all_deductions(final SubLObject id) {
        return cfasl_kb_methods.cfasl_invalid_deduction();
    }

    public static SubLObject ignore_all_kb_hl_supports(final SubLObject id) {
        return cfasl_kb_methods.cfasl_invalid_kb_hl_support();
    }

    public static SubLObject ignore_all_clause_strucs(final SubLObject id) {
        return cfasl_kb_methods.cfasl_invalid_clause_struc();
    }

    public static SubLObject without_valid_kb_terms(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list17, append(body, NIL));
    }

    public static SubLObject cfasl_decode_encoding_completely(final SubLObject encoding) {
        final SubLObject map = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        final SubLObject s = new_cfasl_decoding_stream_from_string(encoding);
        try {
            SubLObject spot = NIL;
            SubLObject item = NIL;
            spot = cfasl_decoding_stream_hexchar_position(s);
            for (item = cfasl_input(s, NIL, $EOF); item != $EOF; item = cfasl_input(s, NIL, $EOF)) {
                map_utilities.map_put(map, spot, item);
                spot = cfasl_decoding_stream_hexchar_position(s);
            }
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close_cfasl_decoding_stream(s);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return map;
    }

    public static SubLObject test_cfasl_decoding_stream_position(final SubLObject objects, final SubLObject test) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject curr_position = ZERO_INTEGER;
        SubLObject encodings = NIL;
        SubLObject positions = NIL;
        SubLObject s = NIL;
        try {
            s = make_private_string_output_stream();
            SubLObject cdolist_list_var = objects;
            SubLObject v_object = NIL;
            v_object = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject encoding = NIL;
                final SubLObject stream = new_cfasl_encoding_stream();
                try {
                    cfasl_output(v_object, stream);
                    encoding = cfasl_encoding_string_stream_encoding(stream);
                } finally {
                    final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        close_cfasl_encoding_stream(stream);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                    }
                }
                positions = cons(list($POSITION, curr_position, $OBJECT, v_object), positions);
                write_string(encoding, s, UNPROVIDED, UNPROVIDED);
                curr_position = add(curr_position, length(encoding));
                cdolist_list_var = cdolist_list_var.rest();
                v_object = cdolist_list_var.first();
            } 
            encodings = get_output_stream_string(s);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                close(s, UNPROVIDED);
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        positions = nreverse(positions);
        final SubLObject stream2 = new_cfasl_decoding_stream_from_string(encodings);
        try {
            SubLObject cdolist_list_var2 = positions;
            SubLObject item_info = NIL;
            item_info = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                final SubLObject current;
                final SubLObject datum = current = item_info;
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_$10 = NIL;
                while (NIL != rest) {
                    destructuring_bind_must_consp(rest, datum, $list27);
                    current_$10 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list27);
                    if (NIL == member(current_$10, $list28, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_$10 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                } 
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list27);
                }
                final SubLObject position_tail = property_list_member($POSITION, current);
                final SubLObject position = (NIL != position_tail) ? cadr(position_tail) : NIL;
                final SubLObject object_tail = property_list_member($OBJECT, current);
                final SubLObject v_object2 = (NIL != object_tail) ? cadr(object_tail) : NIL;
                final SubLObject hex_char_pos = cfasl_decoding_stream_hexchar_position(stream2);
                final SubLObject actual_object = cfasl_input(stream2, NIL, $EOF);
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == funcall(test, v_object2, actual_object))) {
                    Errors.error($str30$Expected__A__got_back__A_, v_object2, actual_object);
                }
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!hex_char_pos.numE(position))) {
                    Errors.error($str31$Expected_stream_position__A__got_, position, hex_char_pos);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                item_info = cdolist_list_var2.first();
            } 
            final SubLObject all_chars = length(encodings);
            final SubLObject actual_chars = cfasl_decoding_stream_hexchar_position(stream2);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!all_chars.numE(actual_chars))) {
                Errors.error($str32$Expected_to_have_read__A_hex_char, all_chars, actual_chars);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values3 = getValuesAsVector();
                close_cfasl_decoding_stream(stream2);
                restoreValuesFromVector(_values3);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return $SUCCESS;
    }

    static private final SubLString $str_alt2$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt3$Cannot_open__A = makeString("Cannot open ~A");

    static private final SubLList $list_alt6 = list(makeKeyword("ANALYZE"), makeKeyword("OBJECT"));

    public static SubLObject declare_cfasl_utilities_file() {
        declareFunction("cfasl_save", "CFASL-SAVE", 2, 0, false);
        declareFunction("cfasl_save_all", "CFASL-SAVE-ALL", 2, 0, false);
        declareFunction("cfasl_load", "CFASL-LOAD", 1, 0, false);
        declareFunction("cfasl_load_all", "CFASL-LOAD-ALL", 1, 0, false);
        declareFunction("cfasl_save_externalized", "CFASL-SAVE-EXTERNALIZED", 2, 0, false);
        declareFunction("cfasl_save_maybe_externalized", "CFASL-SAVE-MAYBE-EXTERNALIZED", 3, 0, false);
        declareFunction("cfasl_load_all_from_string", "CFASL-LOAD-ALL-FROM-STRING", 1, 0, false);
        declareFunction("cfasl_output_compressed", "CFASL-OUTPUT-COMPRESSED", 2, 1, false);
        declareFunction("cfasl_output_compressed_externalized", "CFASL-OUTPUT-COMPRESSED-EXTERNALIZED", 2, 1, false);
        declareFunction("cfasl_output_compressed_maybe_externalized", "CFASL-OUTPUT-COMPRESSED-MAYBE-EXTERNALIZED", 3, 1, false);
        declareFunction("cfasl_output_compressed_int", "CFASL-OUTPUT-COMPRESSED-INT", 4, 0, false);
        declareFunction("cfasl_save_compressed", "CFASL-SAVE-COMPRESSED", 2, 1, false);
        declareFunction("cfasl_save_compressed_externalized", "CFASL-SAVE-COMPRESSED-EXTERNALIZED", 2, 1, false);
        declareFunction("cfasl_save_compressed_maybe_externalized", "CFASL-SAVE-COMPRESSED-MAYBE-EXTERNALIZED", 3, 1, false);
        declareFunction("cfasl_save_compressed_int", "CFASL-SAVE-COMPRESSED-INT", 3, 1, false);
        declareFunction("cfasl_save_all_compressed", "CFASL-SAVE-ALL-COMPRESSED", 2, 1, false);
        declareFunction("cfasl_compress", "CFASL-COMPRESS", 2, 1, false);
        declareFunction("cfasl_byte_compile", "CFASL-BYTE-COMPILE", 2, 0, false);
        declareFunction("cfasl_byte_load", "CFASL-BYTE-LOAD", 1, 0, false);
        declareFunction("cfasl_copy_object", "CFASL-COPY-OBJECT", 1, 0, false);
        declareFunction("ignore_all_constants", "IGNORE-ALL-CONSTANTS", 1, 0, false);
        declareFunction("ignore_all_narts", "IGNORE-ALL-NARTS", 1, 0, false);
        declareFunction("ignore_all_assertions", "IGNORE-ALL-ASSERTIONS", 1, 0, false);
        declareFunction("ignore_all_deductions", "IGNORE-ALL-DEDUCTIONS", 1, 0, false);
        declareFunction("ignore_all_kb_hl_supports", "IGNORE-ALL-KB-HL-SUPPORTS", 1, 0, false);
        declareFunction("ignore_all_clause_strucs", "IGNORE-ALL-CLAUSE-STRUCS", 1, 0, false);
        declareMacro("without_valid_kb_terms", "WITHOUT-VALID-KB-TERMS");
        declareFunction("cfasl_decode_encoding_completely", "CFASL-DECODE-ENCODING-COMPLETELY", 1, 0, false);
        declareFunction("test_cfasl_decoding_stream_position", "TEST-CFASL-DECODING-STREAM-POSITION", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_cfasl_utilities_file() {
        deflexical("*CFASL-DEFAULT-COMPRESSION-OPTIONS*", $list6);
        return NIL;
    }

    public static SubLObject setup_cfasl_utilities_file() {
        note_funcall_helper_function(IGNORE_ALL_CONSTANTS);
        note_funcall_helper_function(IGNORE_ALL_NARTS);
        note_funcall_helper_function(IGNORE_ALL_ASSERTIONS);
        note_funcall_helper_function(IGNORE_ALL_DEDUCTIONS);
        note_funcall_helper_function(IGNORE_ALL_KB_HL_SUPPORTS);
        note_funcall_helper_function(IGNORE_ALL_CLAUSE_STRUCS);
        define_test_case_table_int(TEST_CFASL_DECODING_STREAM_POSITION, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list25);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cfasl_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_cfasl_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cfasl_utilities_file();
    }

    static {
    }
}

/**
 * Total time: 277 ms
 */
