package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cfasl_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cfasl_utilities";
    public static final String myFingerPrint = "741bc8815276cacf2d22c804d69b03a5920c08dce7b5b60b98690bc7979298fc";
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-utilities.lisp", position = 3207L)
    private static SubLSymbol $cfasl_default_compression_options$;
    private static final SubLSymbol $sym0$STRINGP;
    private static final SubLSymbol $kw1$OUTPUT;
    private static final SubLString $str2$Unable_to_open__S;
    private static final SubLString $str3$Cannot_open__A;
    private static final SubLSymbol $kw4$INPUT;
    private static final SubLSymbol $kw5$EOF;
    private static final SubLList $list6;
    private static final SubLSymbol $kw7$NOT;
    private static final SubLSymbol $kw8$ANALYZE;
    private static final SubLSymbol $kw9$OBJECT;
    private static final SubLSymbol $sym10$IGNORE_ALL_CONSTANTS;
    private static final SubLSymbol $sym11$IGNORE_ALL_NARTS;
    private static final SubLSymbol $sym12$IGNORE_ALL_ASSERTIONS;
    private static final SubLSymbol $sym13$IGNORE_ALL_DEDUCTIONS;
    private static final SubLSymbol $sym14$IGNORE_ALL_KB_HL_SUPPORTS;
    private static final SubLSymbol $sym15$IGNORE_ALL_CLAUSE_STRUCS;
    private static final SubLSymbol $sym16$CLET;
    private static final SubLList $list17;
    private static final SubLSymbol $sym18$TEST_CFASL_DECODING_STREAM_POSITION;
    private static final SubLSymbol $kw19$TEST;
    private static final SubLSymbol $kw20$OWNER;
    private static final SubLSymbol $kw21$CLASSES;
    private static final SubLSymbol $kw22$KB;
    private static final SubLSymbol $kw23$TINY;
    private static final SubLSymbol $kw24$WORKING_;
    private static final SubLList $list25;
    private static final SubLSymbol $kw26$POSITION;
    private static final SubLList $list27;
    private static final SubLList $list28;
    private static final SubLSymbol $kw29$ALLOW_OTHER_KEYS;
    private static final SubLString $str30$Expected__A__got_back__A_;
    private static final SubLString $str31$Expected_stream_position__A__got_;
    private static final SubLString $str32$Expected_to_have_read__A_hex_char;
    private static final SubLSymbol $kw33$SUCCESS;
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-utilities.lisp", position = 804L)
    public static SubLObject cfasl_save(final SubLObject v_object, final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cfasl_utilities.NIL != Types.stringp(filename) : filename;
        SubLObject stream = (SubLObject)cfasl_utilities.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)cfasl_utilities.NIL, thread);
                stream = compatibility.open_binary(filename, (SubLObject)cfasl_utilities.$kw1$OUTPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)cfasl_utilities.$str2$Unable_to_open__S, filename);
            }
            final SubLObject stream_$1 = stream;
            if (cfasl_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !stream_$1.isStream()) {
                Errors.error((SubLObject)cfasl_utilities.$str3$Cannot_open__A, filename);
            }
            cfasl.cfasl_output(v_object, stream_$1);
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cfasl_utilities.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)cfasl_utilities.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return (SubLObject)cfasl_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-utilities.lisp", position = 1146L)
    public static SubLObject cfasl_save_all(final SubLObject objects, final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cfasl_utilities.NIL != Types.stringp(filename) : filename;
        SubLObject stream = (SubLObject)cfasl_utilities.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)cfasl_utilities.NIL, thread);
                stream = compatibility.open_binary(filename, (SubLObject)cfasl_utilities.$kw1$OUTPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)cfasl_utilities.$str2$Unable_to_open__S, filename);
            }
            final SubLObject stream_$2 = stream;
            if (cfasl_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !stream_$2.isStream()) {
                Errors.error((SubLObject)cfasl_utilities.$str3$Cannot_open__A, filename);
            }
            SubLObject cdolist_list_var = objects;
            SubLObject v_object = (SubLObject)cfasl_utilities.NIL;
            v_object = cdolist_list_var.first();
            while (cfasl_utilities.NIL != cdolist_list_var) {
                cfasl.cfasl_output(v_object, stream_$2);
                cdolist_list_var = cdolist_list_var.rest();
                v_object = cdolist_list_var.first();
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cfasl_utilities.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)cfasl_utilities.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return (SubLObject)cfasl_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-utilities.lisp", position = 1479L)
    public static SubLObject cfasl_load(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cfasl_utilities.NIL != Types.stringp(filename) : filename;
        SubLObject v_object = (SubLObject)cfasl_utilities.NIL;
        SubLObject stream = (SubLObject)cfasl_utilities.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)cfasl_utilities.NIL, thread);
                stream = compatibility.open_binary(filename, (SubLObject)cfasl_utilities.$kw4$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)cfasl_utilities.$str2$Unable_to_open__S, filename);
            }
            final SubLObject stream_$3 = stream;
            if (cfasl_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !stream_$3.isStream()) {
                Errors.error((SubLObject)cfasl_utilities.$str3$Cannot_open__A, filename);
            }
            v_object = cfasl.cfasl_input(stream_$3, (SubLObject)cfasl_utilities.UNPROVIDED, (SubLObject)cfasl_utilities.UNPROVIDED);
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cfasl_utilities.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)cfasl_utilities.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-utilities.lisp", position = 1805L)
    public static SubLObject cfasl_load_all(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cfasl_utilities.NIL != Types.stringp(filename) : filename;
        SubLObject objects = (SubLObject)cfasl_utilities.NIL;
        SubLObject eofP = (SubLObject)cfasl_utilities.NIL;
        SubLObject stream = (SubLObject)cfasl_utilities.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)cfasl_utilities.NIL, thread);
                stream = compatibility.open_binary(filename, (SubLObject)cfasl_utilities.$kw4$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)cfasl_utilities.$str2$Unable_to_open__S, filename);
            }
            final SubLObject stream_$4 = stream;
            if (cfasl_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !stream_$4.isStream()) {
                Errors.error((SubLObject)cfasl_utilities.$str3$Cannot_open__A, filename);
            }
            while (cfasl_utilities.NIL == eofP) {
                final SubLObject v_object = cfasl.cfasl_input(stream_$4, (SubLObject)cfasl_utilities.NIL, (SubLObject)cfasl_utilities.$kw5$EOF);
                if (v_object == cfasl_utilities.$kw5$EOF) {
                    eofP = (SubLObject)cfasl_utilities.T;
                }
                else {
                    objects = (SubLObject)ConsesLow.cons(v_object, objects);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cfasl_utilities.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)cfasl_utilities.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return objects;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-utilities.lisp", position = 2185L)
    public static SubLObject cfasl_save_externalized(final SubLObject v_object, final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cfasl_utilities.NIL != Types.stringp(filename) : filename;
        SubLObject stream = (SubLObject)cfasl_utilities.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)cfasl_utilities.NIL, thread);
                stream = compatibility.open_binary(filename, (SubLObject)cfasl_utilities.$kw1$OUTPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)cfasl_utilities.$str2$Unable_to_open__S, filename);
            }
            final SubLObject stream_$5 = stream;
            if (cfasl_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !stream_$5.isStream()) {
                Errors.error((SubLObject)cfasl_utilities.$str3$Cannot_open__A, filename);
            }
            cfasl.cfasl_output_externalized(v_object, stream_$5);
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cfasl_utilities.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)cfasl_utilities.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return (SubLObject)cfasl_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-utilities.lisp", position = 2496L)
    public static SubLObject cfasl_save_maybe_externalized(final SubLObject v_object, final SubLObject filename, final SubLObject externalizedP) {
        if (cfasl_utilities.NIL != externalizedP) {
            return cfasl_save_externalized(v_object, filename);
        }
        return cfasl_save(v_object, filename);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-utilities.lisp", position = 2694L)
    public static SubLObject cfasl_load_all_from_string(final SubLObject string) {
        SubLObject items = (SubLObject)cfasl_utilities.NIL;
        final SubLObject stream = cfasl.new_cfasl_decoding_stream_from_string(string);
        try {
            SubLObject item;
            for (item = (SubLObject)cfasl_utilities.NIL, item = cfasl.cfasl_input(stream, (SubLObject)cfasl_utilities.NIL, (SubLObject)cfasl_utilities.$kw5$EOF); item != cfasl_utilities.$kw5$EOF; item = cfasl.cfasl_input(stream, (SubLObject)cfasl_utilities.NIL, (SubLObject)cfasl_utilities.$kw5$EOF)) {
                items = (SubLObject)ConsesLow.cons(item, items);
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)cfasl_utilities.T);
                final SubLObject _values = Values.getValuesAsVector();
                cfasl.close_cfasl_decoding_stream(stream);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return items;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-utilities.lisp", position = 3361L)
    public static SubLObject cfasl_output_compressed(final SubLObject v_object, final SubLObject stream, SubLObject options) {
        if (options == cfasl_utilities.UNPROVIDED) {
            options = cfasl_utilities.$cfasl_default_compression_options$.getGlobalValue();
        }
        return cfasl_output_compressed_int(v_object, stream, (SubLObject)cfasl_utilities.NIL, options);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-utilities.lisp", position = 3538L)
    public static SubLObject cfasl_output_compressed_externalized(final SubLObject v_object, final SubLObject stream, SubLObject options) {
        if (options == cfasl_utilities.UNPROVIDED) {
            options = cfasl_utilities.$cfasl_default_compression_options$.getGlobalValue();
        }
        return cfasl_output_compressed_int(v_object, stream, (SubLObject)cfasl_utilities.T, options);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-utilities.lisp", position = 3726L)
    public static SubLObject cfasl_output_compressed_maybe_externalized(final SubLObject v_object, final SubLObject stream, final SubLObject externalizedP, SubLObject options) {
        if (options == cfasl_utilities.UNPROVIDED) {
            options = cfasl_utilities.$cfasl_default_compression_options$.getGlobalValue();
        }
        return cfasl_output_compressed_int(v_object, stream, externalizedP, options);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-utilities.lisp", position = 3946L)
    public static SubLObject cfasl_output_compressed_int(final SubLObject v_object, final SubLObject stream, final SubLObject externalizedP, SubLObject options) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        options = conses_high.copy_list(options);
        SubLObject not_list = conses_high.getf(options, (SubLObject)cfasl_utilities.$kw7$NOT, (SubLObject)cfasl_utilities.UNPROVIDED);
        not_list = (SubLObject)ConsesLow.cons(v_object, not_list);
        options = conses_high.putf(options, (SubLObject)cfasl_utilities.$kw7$NOT, not_list);
        final SubLObject analyze = conses_high.getf(options, (SubLObject)cfasl_utilities.$kw8$ANALYZE, (SubLObject)cfasl_utilities.UNPROVIDED);
        if (cfasl_utilities.$kw9$OBJECT == analyze) {
            options = conses_high.putf(options, (SubLObject)cfasl_utilities.$kw8$ANALYZE, v_object);
        }
        final SubLObject _prev_bind_0 = cfasl_compression.$cfasl_output_compression_options$.currentBinding(thread);
        final SubLObject _prev_bind_2 = cfasl_compression.$cfasl_output_compression_code_isg$.currentBinding(thread);
        final SubLObject _prev_bind_3 = cfasl_compression.$cfasl_output_compression_table$.currentBinding(thread);
        try {
            cfasl_compression.$cfasl_output_compression_options$.bind(options, thread);
            cfasl_compression.$cfasl_output_compression_code_isg$.bind(integer_sequence_generator.new_integer_sequence_generator((SubLObject)cfasl_utilities.UNPROVIDED, (SubLObject)cfasl_utilities.UNPROVIDED, (SubLObject)cfasl_utilities.UNPROVIDED), thread);
            cfasl_compression.$cfasl_output_compression_table$.bind(cfasl_compression.with_cfasl_compression_cfasl_output_compression_table(stream), thread);
            cfasl_compression.with_cfasl_compression_preamble(stream);
            cfasl.cfasl_output_maybe_externalized(v_object, stream, externalizedP);
            cfasl_compression.with_cfasl_compression_postamble(stream);
        }
        finally {
            cfasl_compression.$cfasl_output_compression_table$.rebind(_prev_bind_3, thread);
            cfasl_compression.$cfasl_output_compression_code_isg$.rebind(_prev_bind_2, thread);
            cfasl_compression.$cfasl_output_compression_options$.rebind(_prev_bind_0, thread);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-utilities.lisp", position = 4569L)
    public static SubLObject cfasl_save_compressed(final SubLObject v_object, final SubLObject filename, SubLObject options) {
        if (options == cfasl_utilities.UNPROVIDED) {
            options = cfasl_utilities.$cfasl_default_compression_options$.getGlobalValue();
        }
        return cfasl_save_compressed_int(v_object, filename, (SubLObject)cfasl_utilities.NIL, options);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-utilities.lisp", position = 4746L)
    public static SubLObject cfasl_save_compressed_externalized(final SubLObject v_object, final SubLObject filename, SubLObject options) {
        if (options == cfasl_utilities.UNPROVIDED) {
            options = cfasl_utilities.$cfasl_default_compression_options$.getGlobalValue();
        }
        return cfasl_save_compressed_int(v_object, filename, (SubLObject)cfasl_utilities.T, options);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-utilities.lisp", position = 4934L)
    public static SubLObject cfasl_save_compressed_maybe_externalized(final SubLObject v_object, final SubLObject filename, final SubLObject externalizedP, SubLObject options) {
        if (options == cfasl_utilities.UNPROVIDED) {
            options = cfasl_utilities.$cfasl_default_compression_options$.getGlobalValue();
        }
        return cfasl_save_compressed_int(v_object, filename, externalizedP, options);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-utilities.lisp", position = 5154L)
    public static SubLObject cfasl_save_compressed_int(final SubLObject v_object, final SubLObject filename, final SubLObject externalizedP, SubLObject options) {
        if (options == cfasl_utilities.UNPROVIDED) {
            options = cfasl_utilities.$cfasl_default_compression_options$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)cfasl_utilities.NIL;
        SubLObject stream = (SubLObject)cfasl_utilities.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)cfasl_utilities.NIL, thread);
                stream = compatibility.open_binary(filename, (SubLObject)cfasl_utilities.$kw1$OUTPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)cfasl_utilities.$str2$Unable_to_open__S, filename);
            }
            final SubLObject stream_$6 = stream;
            if (cfasl_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !stream_$6.isStream()) {
                Errors.error((SubLObject)cfasl_utilities.$str3$Cannot_open__A, filename);
            }
            result = cfasl_output_compressed_int(v_object, stream_$6, externalizedP, options);
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cfasl_utilities.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)cfasl_utilities.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-utilities.lisp", position = 5522L)
    public static SubLObject cfasl_save_all_compressed(final SubLObject objects, final SubLObject filename, SubLObject options) {
        if (options == cfasl_utilities.UNPROVIDED) {
            options = cfasl_utilities.$cfasl_default_compression_options$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cfasl_utilities.NIL != Types.stringp(filename) : filename;
        SubLObject stream = (SubLObject)cfasl_utilities.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)cfasl_utilities.NIL, thread);
                stream = compatibility.open_binary(filename, (SubLObject)cfasl_utilities.$kw1$OUTPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)cfasl_utilities.$str2$Unable_to_open__S, filename);
            }
            final SubLObject stream_$7 = stream;
            if (cfasl_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !stream_$7.isStream()) {
                Errors.error((SubLObject)cfasl_utilities.$str3$Cannot_open__A, filename);
            }
            final SubLObject _prev_bind_2 = cfasl_compression.$cfasl_output_compression_options$.currentBinding(thread);
            final SubLObject _prev_bind_3 = cfasl_compression.$cfasl_output_compression_code_isg$.currentBinding(thread);
            final SubLObject _prev_bind_4 = cfasl_compression.$cfasl_output_compression_table$.currentBinding(thread);
            try {
                cfasl_compression.$cfasl_output_compression_options$.bind(options, thread);
                cfasl_compression.$cfasl_output_compression_code_isg$.bind(integer_sequence_generator.new_integer_sequence_generator((SubLObject)cfasl_utilities.UNPROVIDED, (SubLObject)cfasl_utilities.UNPROVIDED, (SubLObject)cfasl_utilities.UNPROVIDED), thread);
                cfasl_compression.$cfasl_output_compression_table$.bind(cfasl_compression.with_cfasl_compression_cfasl_output_compression_table(stream_$7), thread);
                cfasl_compression.with_cfasl_compression_preamble(stream_$7);
                SubLObject cdolist_list_var = objects;
                SubLObject v_object = (SubLObject)cfasl_utilities.NIL;
                v_object = cdolist_list_var.first();
                while (cfasl_utilities.NIL != cdolist_list_var) {
                    cfasl.cfasl_output(v_object, stream_$7);
                    cdolist_list_var = cdolist_list_var.rest();
                    v_object = cdolist_list_var.first();
                }
                cfasl_compression.with_cfasl_compression_postamble(stream_$7);
            }
            finally {
                cfasl_compression.$cfasl_output_compression_table$.rebind(_prev_bind_4, thread);
                cfasl_compression.$cfasl_output_compression_code_isg$.rebind(_prev_bind_3, thread);
                cfasl_compression.$cfasl_output_compression_options$.rebind(_prev_bind_2, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cfasl_utilities.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)cfasl_utilities.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
            }
        }
        return (SubLObject)cfasl_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-utilities.lisp", position = 5906L)
    public static SubLObject cfasl_compress(final SubLObject filename, final SubLObject new_filename, SubLObject options) {
        if (options == cfasl_utilities.UNPROVIDED) {
            options = cfasl_utilities.$cfasl_default_compression_options$.getGlobalValue();
        }
        final SubLObject objects = cfasl_load_all(filename);
        cfasl_save_all_compressed(objects, new_filename, options);
        return new_filename;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-utilities.lisp", position = 6255L)
    public static SubLObject cfasl_byte_compile(final SubLObject input_filename, final SubLObject output_filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cfasl_utilities.NIL != Types.stringp(input_filename) : input_filename;
        assert cfasl_utilities.NIL != Types.stringp(output_filename) : output_filename;
        SubLObject v_answer = (SubLObject)cfasl_utilities.NIL;
        SubLObject stream = (SubLObject)cfasl_utilities.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)cfasl_utilities.NIL, thread);
                stream = compatibility.open_text(input_filename, (SubLObject)cfasl_utilities.$kw4$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)cfasl_utilities.$str2$Unable_to_open__S, input_filename);
            }
            final SubLObject in_stream = stream;
            if (cfasl_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !in_stream.isStream()) {
                Errors.error((SubLObject)cfasl_utilities.$str3$Cannot_open__A, input_filename);
            }
            SubLObject stream_$8 = (SubLObject)cfasl_utilities.NIL;
            try {
                final SubLObject _prev_bind_2 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)cfasl_utilities.NIL, thread);
                    stream_$8 = compatibility.open_binary(output_filename, (SubLObject)cfasl_utilities.$kw1$OUTPUT);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_2, thread);
                }
                if (!stream_$8.isStream()) {
                    Errors.error((SubLObject)cfasl_utilities.$str2$Unable_to_open__S, output_filename);
                }
                final SubLObject out_stream = stream_$8;
                if (cfasl_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !out_stream.isStream()) {
                    Errors.error((SubLObject)cfasl_utilities.$str3$Cannot_open__A, output_filename);
                }
                SubLObject form;
                for (form = (SubLObject)cfasl_utilities.NIL, form = reader.read(in_stream, (SubLObject)cfasl_utilities.NIL, (SubLObject)cfasl_utilities.$kw5$EOF, (SubLObject)cfasl_utilities.UNPROVIDED); cfasl_utilities.$kw5$EOF != form; form = reader.read(in_stream, (SubLObject)cfasl_utilities.NIL, (SubLObject)cfasl_utilities.$kw5$EOF, (SubLObject)cfasl_utilities.UNPROVIDED)) {
                    cfasl.cfasl_output(form, out_stream);
                }
                v_answer = (SubLObject)cfasl_utilities.T;
            }
            finally {
                final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cfasl_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (stream_$8.isStream()) {
                        streams_high.close(stream_$8, (SubLObject)cfasl_utilities.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cfasl_utilities.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)cfasl_utilities.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-utilities.lisp", position = 7441L)
    public static SubLObject cfasl_byte_load(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cfasl_utilities.NIL != Types.stringp(filename) : filename;
        SubLObject v_answer = (SubLObject)cfasl_utilities.NIL;
        SubLObject stream = (SubLObject)cfasl_utilities.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)cfasl_utilities.NIL, thread);
                stream = compatibility.open_binary(filename, (SubLObject)cfasl_utilities.$kw4$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)cfasl_utilities.$str2$Unable_to_open__S, filename);
            }
            final SubLObject stream_$9 = stream;
            if (cfasl_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !stream_$9.isStream()) {
                Errors.error((SubLObject)cfasl_utilities.$str3$Cannot_open__A, filename);
            }
            SubLObject form;
            for (form = (SubLObject)cfasl_utilities.NIL, form = cfasl.cfasl_input(stream_$9, (SubLObject)cfasl_utilities.NIL, (SubLObject)cfasl_utilities.$kw5$EOF); cfasl_utilities.$kw5$EOF != form; form = cfasl.cfasl_input(stream_$9, (SubLObject)cfasl_utilities.NIL, (SubLObject)cfasl_utilities.$kw5$EOF)) {
                Eval.eval(form);
            }
            v_answer = (SubLObject)cfasl_utilities.T;
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cfasl_utilities.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)cfasl_utilities.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-utilities.lisp", position = 7885L)
    public static SubLObject cfasl_copy_object(final SubLObject v_object) {
        SubLObject byte_vector = (SubLObject)cfasl_utilities.NIL;
        SubLObject new_object = (SubLObject)cfasl_utilities.NIL;
        SubLObject s = cfasl.new_cfasl_encoding_stream();
        try {
            cfasl.cfasl_output(v_object, s);
            byte_vector = cfasl.cfasl_encoding_stream_encoding(s);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)cfasl_utilities.T);
                final SubLObject _values = Values.getValuesAsVector();
                cfasl.close_cfasl_encoding_stream(s);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        s = cfasl.new_cfasl_decoding_stream(byte_vector);
        try {
            new_object = cfasl.cfasl_input(s, (SubLObject)cfasl_utilities.UNPROVIDED, (SubLObject)cfasl_utilities.UNPROVIDED);
        }
        finally {
            final SubLObject _prev_bind_2 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)cfasl_utilities.T);
                final SubLObject _values2 = Values.getValuesAsVector();
                cfasl.close_cfasl_decoding_stream(s);
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_2);
            }
        }
        return new_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-utilities.lisp", position = 8624L)
    public static SubLObject ignore_all_constants(final SubLObject id) {
        return cfasl_kb_methods.cfasl_invalid_constant();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-utilities.lisp", position = 8877L)
    public static SubLObject ignore_all_narts(final SubLObject id) {
        return cfasl_kb_methods.cfasl_invalid_nart();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-utilities.lisp", position = 8972L)
    public static SubLObject ignore_all_assertions(final SubLObject id) {
        return cfasl_kb_methods.cfasl_invalid_assertion();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-utilities.lisp", position = 9072L)
    public static SubLObject ignore_all_deductions(final SubLObject id) {
        return cfasl_kb_methods.cfasl_invalid_deduction();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-utilities.lisp", position = 9172L)
    public static SubLObject ignore_all_kb_hl_supports(final SubLObject id) {
        return cfasl_kb_methods.cfasl_invalid_kb_hl_support();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-utilities.lisp", position = 9276L)
    public static SubLObject ignore_all_clause_strucs(final SubLObject id) {
        return cfasl_kb_methods.cfasl_invalid_clause_struc();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-utilities.lisp", position = 9379L)
    public static SubLObject without_valid_kb_terms(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)cfasl_utilities.$sym16$CLET, (SubLObject)cfasl_utilities.$list17, ConsesLow.append(body, (SubLObject)cfasl_utilities.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-utilities.lisp", position = 9971L)
    public static SubLObject cfasl_decode_encoding_completely(final SubLObject encoding) {
        final SubLObject map = dictionary.new_dictionary((SubLObject)cfasl_utilities.UNPROVIDED, (SubLObject)cfasl_utilities.UNPROVIDED);
        final SubLObject s = cfasl.new_cfasl_decoding_stream_from_string(encoding);
        try {
            SubLObject spot = (SubLObject)cfasl_utilities.NIL;
            SubLObject item = (SubLObject)cfasl_utilities.NIL;
            spot = cfasl.cfasl_decoding_stream_hexchar_position(s);
            for (item = cfasl.cfasl_input(s, (SubLObject)cfasl_utilities.NIL, (SubLObject)cfasl_utilities.$kw5$EOF); item != cfasl_utilities.$kw5$EOF; item = cfasl.cfasl_input(s, (SubLObject)cfasl_utilities.NIL, (SubLObject)cfasl_utilities.$kw5$EOF)) {
                map_utilities.map_put(map, spot, item);
                spot = cfasl.cfasl_decoding_stream_hexchar_position(s);
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)cfasl_utilities.T);
                final SubLObject _values = Values.getValuesAsVector();
                cfasl.close_cfasl_decoding_stream(s);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-utilities.lisp", position = 10869L)
    public static SubLObject test_cfasl_decoding_stream_position(final SubLObject objects, final SubLObject test) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject curr_position = (SubLObject)cfasl_utilities.ZERO_INTEGER;
        SubLObject encodings = (SubLObject)cfasl_utilities.NIL;
        SubLObject positions = (SubLObject)cfasl_utilities.NIL;
        SubLObject s = (SubLObject)cfasl_utilities.NIL;
        try {
            s = streams_high.make_private_string_output_stream();
            SubLObject cdolist_list_var = objects;
            SubLObject v_object = (SubLObject)cfasl_utilities.NIL;
            v_object = cdolist_list_var.first();
            while (cfasl_utilities.NIL != cdolist_list_var) {
                SubLObject encoding = (SubLObject)cfasl_utilities.NIL;
                final SubLObject stream = cfasl.new_cfasl_encoding_stream();
                try {
                    cfasl.cfasl_output(v_object, stream);
                    encoding = cfasl.cfasl_encoding_string_stream_encoding(stream);
                }
                finally {
                    final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cfasl_utilities.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        cfasl.close_cfasl_encoding_stream(stream);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                    }
                }
                positions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)cfasl_utilities.$kw26$POSITION, curr_position, (SubLObject)cfasl_utilities.$kw9$OBJECT, v_object), positions);
                streams_high.write_string(encoding, s, (SubLObject)cfasl_utilities.UNPROVIDED, (SubLObject)cfasl_utilities.UNPROVIDED);
                curr_position = Numbers.add(curr_position, Sequences.length(encoding));
                cdolist_list_var = cdolist_list_var.rest();
                v_object = cdolist_list_var.first();
            }
            encodings = streams_high.get_output_stream_string(s);
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cfasl_utilities.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                streams_high.close(s, (SubLObject)cfasl_utilities.UNPROVIDED);
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        positions = Sequences.nreverse(positions);
        final SubLObject stream2 = cfasl.new_cfasl_decoding_stream_from_string(encodings);
        try {
            SubLObject cdolist_list_var2 = positions;
            SubLObject item_info = (SubLObject)cfasl_utilities.NIL;
            item_info = cdolist_list_var2.first();
            while (cfasl_utilities.NIL != cdolist_list_var2) {
                final SubLObject current;
                final SubLObject datum = current = item_info;
                SubLObject allow_other_keys_p = (SubLObject)cfasl_utilities.NIL;
                SubLObject rest = current;
                SubLObject bad = (SubLObject)cfasl_utilities.NIL;
                SubLObject current_$10 = (SubLObject)cfasl_utilities.NIL;
                while (cfasl_utilities.NIL != rest) {
                    cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cfasl_utilities.$list27);
                    current_$10 = rest.first();
                    rest = rest.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cfasl_utilities.$list27);
                    if (cfasl_utilities.NIL == conses_high.member(current_$10, (SubLObject)cfasl_utilities.$list28, (SubLObject)cfasl_utilities.UNPROVIDED, (SubLObject)cfasl_utilities.UNPROVIDED)) {
                        bad = (SubLObject)cfasl_utilities.T;
                    }
                    if (current_$10 == cfasl_utilities.$kw29$ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if (cfasl_utilities.NIL != bad && cfasl_utilities.NIL == allow_other_keys_p) {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cfasl_utilities.$list27);
                }
                final SubLObject position_tail = cdestructuring_bind.property_list_member((SubLObject)cfasl_utilities.$kw26$POSITION, current);
                final SubLObject position = (SubLObject)((cfasl_utilities.NIL != position_tail) ? conses_high.cadr(position_tail) : cfasl_utilities.NIL);
                final SubLObject object_tail = cdestructuring_bind.property_list_member((SubLObject)cfasl_utilities.$kw9$OBJECT, current);
                final SubLObject v_object2 = (SubLObject)((cfasl_utilities.NIL != object_tail) ? conses_high.cadr(object_tail) : cfasl_utilities.NIL);
                final SubLObject hex_char_pos = cfasl.cfasl_decoding_stream_hexchar_position(stream2);
                final SubLObject actual_object = cfasl.cfasl_input(stream2, (SubLObject)cfasl_utilities.NIL, (SubLObject)cfasl_utilities.$kw5$EOF);
                if (cfasl_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && cfasl_utilities.NIL == Functions.funcall(test, v_object2, actual_object)) {
                    Errors.error((SubLObject)cfasl_utilities.$str30$Expected__A__got_back__A_, v_object2, actual_object);
                }
                if (cfasl_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !hex_char_pos.numE(position)) {
                    Errors.error((SubLObject)cfasl_utilities.$str31$Expected_stream_position__A__got_, position, hex_char_pos);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                item_info = cdolist_list_var2.first();
            }
            final SubLObject all_chars = Sequences.length(encodings);
            final SubLObject actual_chars = cfasl.cfasl_decoding_stream_hexchar_position(stream2);
            if (cfasl_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !all_chars.numE(actual_chars)) {
                Errors.error((SubLObject)cfasl_utilities.$str32$Expected_to_have_read__A_hex_char, all_chars, actual_chars);
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cfasl_utilities.T, thread);
                final SubLObject _values3 = Values.getValuesAsVector();
                cfasl.close_cfasl_decoding_stream(stream2);
                Values.restoreValuesFromVector(_values3);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return (SubLObject)cfasl_utilities.$kw33$SUCCESS;
    }
    
    public static SubLObject declare_cfasl_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_utilities", "cfasl_save", "CFASL-SAVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_utilities", "cfasl_save_all", "CFASL-SAVE-ALL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_utilities", "cfasl_load", "CFASL-LOAD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_utilities", "cfasl_load_all", "CFASL-LOAD-ALL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_utilities", "cfasl_save_externalized", "CFASL-SAVE-EXTERNALIZED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_utilities", "cfasl_save_maybe_externalized", "CFASL-SAVE-MAYBE-EXTERNALIZED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_utilities", "cfasl_load_all_from_string", "CFASL-LOAD-ALL-FROM-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_utilities", "cfasl_output_compressed", "CFASL-OUTPUT-COMPRESSED", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_utilities", "cfasl_output_compressed_externalized", "CFASL-OUTPUT-COMPRESSED-EXTERNALIZED", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_utilities", "cfasl_output_compressed_maybe_externalized", "CFASL-OUTPUT-COMPRESSED-MAYBE-EXTERNALIZED", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_utilities", "cfasl_output_compressed_int", "CFASL-OUTPUT-COMPRESSED-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_utilities", "cfasl_save_compressed", "CFASL-SAVE-COMPRESSED", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_utilities", "cfasl_save_compressed_externalized", "CFASL-SAVE-COMPRESSED-EXTERNALIZED", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_utilities", "cfasl_save_compressed_maybe_externalized", "CFASL-SAVE-COMPRESSED-MAYBE-EXTERNALIZED", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_utilities", "cfasl_save_compressed_int", "CFASL-SAVE-COMPRESSED-INT", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_utilities", "cfasl_save_all_compressed", "CFASL-SAVE-ALL-COMPRESSED", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_utilities", "cfasl_compress", "CFASL-COMPRESS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_utilities", "cfasl_byte_compile", "CFASL-BYTE-COMPILE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_utilities", "cfasl_byte_load", "CFASL-BYTE-LOAD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_utilities", "cfasl_copy_object", "CFASL-COPY-OBJECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_utilities", "ignore_all_constants", "IGNORE-ALL-CONSTANTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_utilities", "ignore_all_narts", "IGNORE-ALL-NARTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_utilities", "ignore_all_assertions", "IGNORE-ALL-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_utilities", "ignore_all_deductions", "IGNORE-ALL-DEDUCTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_utilities", "ignore_all_kb_hl_supports", "IGNORE-ALL-KB-HL-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_utilities", "ignore_all_clause_strucs", "IGNORE-ALL-CLAUSE-STRUCS", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cfasl_utilities", "without_valid_kb_terms", "WITHOUT-VALID-KB-TERMS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_utilities", "cfasl_decode_encoding_completely", "CFASL-DECODE-ENCODING-COMPLETELY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_utilities", "test_cfasl_decoding_stream_position", "TEST-CFASL-DECODING-STREAM-POSITION", 2, 0, false);
        return (SubLObject)cfasl_utilities.NIL;
    }
    
    public static SubLObject init_cfasl_utilities_file() {
        cfasl_utilities.$cfasl_default_compression_options$ = SubLFiles.deflexical("*CFASL-DEFAULT-COMPRESSION-OPTIONS*", (SubLObject)cfasl_utilities.$list6);
        return (SubLObject)cfasl_utilities.NIL;
    }
    
    public static SubLObject setup_cfasl_utilities_file() {
        utilities_macros.note_funcall_helper_function((SubLObject)cfasl_utilities.$sym10$IGNORE_ALL_CONSTANTS);
        utilities_macros.note_funcall_helper_function((SubLObject)cfasl_utilities.$sym11$IGNORE_ALL_NARTS);
        utilities_macros.note_funcall_helper_function((SubLObject)cfasl_utilities.$sym12$IGNORE_ALL_ASSERTIONS);
        utilities_macros.note_funcall_helper_function((SubLObject)cfasl_utilities.$sym13$IGNORE_ALL_DEDUCTIONS);
        utilities_macros.note_funcall_helper_function((SubLObject)cfasl_utilities.$sym14$IGNORE_ALL_KB_HL_SUPPORTS);
        utilities_macros.note_funcall_helper_function((SubLObject)cfasl_utilities.$sym15$IGNORE_ALL_CLAUSE_STRUCS);
        generic_testing.define_test_case_table_int((SubLObject)cfasl_utilities.$sym18$TEST_CFASL_DECODING_STREAM_POSITION, (SubLObject)ConsesLow.list(new SubLObject[] { cfasl_utilities.$kw19$TEST, cfasl_utilities.NIL, cfasl_utilities.$kw20$OWNER, cfasl_utilities.NIL, cfasl_utilities.$kw21$CLASSES, cfasl_utilities.NIL, cfasl_utilities.$kw22$KB, cfasl_utilities.$kw23$TINY, cfasl_utilities.$kw24$WORKING_, cfasl_utilities.T }), (SubLObject)cfasl_utilities.$list25);
        return (SubLObject)cfasl_utilities.NIL;
    }
    
    public void declareFunctions() {
        declare_cfasl_utilities_file();
    }
    
    public void initializeVariables() {
        init_cfasl_utilities_file();
    }
    
    public void runTopLevelForms() {
        setup_cfasl_utilities_file();
    }
    
    static {
        me = (SubLFile)new cfasl_utilities();
        cfasl_utilities.$cfasl_default_compression_options$ = null;
        $sym0$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw1$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $str2$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $str3$Cannot_open__A = SubLObjectFactory.makeString("Cannot open ~A");
        $kw4$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $kw5$EOF = SubLObjectFactory.makeKeyword("EOF");
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANALYZE"), (SubLObject)SubLObjectFactory.makeKeyword("OBJECT"));
        $kw7$NOT = SubLObjectFactory.makeKeyword("NOT");
        $kw8$ANALYZE = SubLObjectFactory.makeKeyword("ANALYZE");
        $kw9$OBJECT = SubLObjectFactory.makeKeyword("OBJECT");
        $sym10$IGNORE_ALL_CONSTANTS = SubLObjectFactory.makeSymbol("IGNORE-ALL-CONSTANTS");
        $sym11$IGNORE_ALL_NARTS = SubLObjectFactory.makeSymbol("IGNORE-ALL-NARTS");
        $sym12$IGNORE_ALL_ASSERTIONS = SubLObjectFactory.makeSymbol("IGNORE-ALL-ASSERTIONS");
        $sym13$IGNORE_ALL_DEDUCTIONS = SubLObjectFactory.makeSymbol("IGNORE-ALL-DEDUCTIONS");
        $sym14$IGNORE_ALL_KB_HL_SUPPORTS = SubLObjectFactory.makeSymbol("IGNORE-ALL-KB-HL-SUPPORTS");
        $sym15$IGNORE_ALL_CLAUSE_STRUCS = SubLObjectFactory.makeSymbol("IGNORE-ALL-CLAUSE-STRUCS");
        $sym16$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list17 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CFASL-CONSTANT-HANDLE-LOOKUP-FUNC*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("IGNORE-ALL-CONSTANTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CFASL-NART-HANDLE-LOOKUP-FUNC*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("IGNORE-ALL-NARTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CFASL-ASSERTION-HANDLE-LOOKUP-FUNC*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("IGNORE-ALL-ASSERTIONS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CFASL-DEDUCTION-HANDLE-LOOKUP-FUNC*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("IGNORE-ALL-DEDUCTIONS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CFASL-KB-HL-SUPPORT-HANDLE-LOOKUP-FUNC*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("IGNORE-ALL-KB-HL-SUPPORTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CFASL-CLAUSE-STRUC-HANDLE-LOOKUP-FUNC*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("IGNORE-ALL-CLAUSE-STRUCS"))));
        $sym18$TEST_CFASL_DECODING_STREAM_POSITION = SubLObjectFactory.makeSymbol("TEST-CFASL-DECODING-STREAM-POSITION");
        $kw19$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw20$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw21$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw22$KB = SubLObjectFactory.makeKeyword("KB");
        $kw23$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw24$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list25 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("abc"), (SubLObject)SubLObjectFactory.makeInteger(123), (SubLObject)ConsesLow.list((SubLObject)cfasl_utilities.ONE_INTEGER, (SubLObject)cfasl_utilities.TWO_INTEGER, (SubLObject)cfasl_utilities.THREE_INTEGER)), (SubLObject)cfasl_utilities.EQUAL), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")));
        $kw26$POSITION = SubLObjectFactory.makeKeyword("POSITION");
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("POSITION"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"));
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("POSITION"), (SubLObject)SubLObjectFactory.makeKeyword("OBJECT"));
        $kw29$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $str30$Expected__A__got_back__A_ = SubLObjectFactory.makeString("Expected ~A, got back ~A.");
        $str31$Expected_stream_position__A__got_ = SubLObjectFactory.makeString("Expected stream position ~A, got back ~A.");
        $str32$Expected_to_have_read__A_hex_char = SubLObjectFactory.makeString("Expected to have read ~A hex-chars from stream, got ~A.");
        $kw33$SUCCESS = SubLObjectFactory.makeKeyword("SUCCESS");
    }
}

/*

	Total time: 277 ms
	
*/