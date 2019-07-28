package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.cfasl;
import com.cyc.cycjava.cycl.convert_partitions;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.cfasl.*;
import static com.cyc.cycjava.cycl.convert_partitions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class convert_partitions extends SubLTranslatedFile {
    public static final SubLFile me = new convert_partitions();

    public static final String myName = "com.cyc.cycjava.cycl.convert_partitions";

    public static final String myFingerPrint = "cf2df32958564b35000f1e738d3046b7ea54dfcf2b9f0b4b02e1d0fd52f90546";

    // defparameter
    private static final SubLSymbol $convert_partition_source_format$ = makeSymbol("*CONVERT-PARTITION-SOURCE-FORMAT*");

    // defparameter
    private static final SubLSymbol $convert_partition_target_format$ = makeSymbol("*CONVERT-PARTITION-TARGET-FORMAT*");

    // Internal Constants
    public static final SubLString $str0$2_0 = makeString("2.0");

    public static final SubLString $str1$2_1 = makeString("2.1");





    public static final SubLString $str4$Unable_to_open__S = makeString("Unable to open ~S");







    public static final SubLString $str8$partition_format_is__A__not__A = makeString("partition format is ~A, not ~A");

    public static final SubLList $list9 = list(makeSymbol("SYSTEM-NUMBER"), makeSymbol("PATCH-NUMBER"), makeSymbol("&REST"), makeSymbol("REST"));

    public static final SubLString $str10$converting_partition_constant_she = makeString("converting partition constant shells");



    public static SubLObject convert_partition(final SubLObject in_file, final SubLObject out_file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(in_file) : "Types.stringp(in_file) " + "CommonSymbols.NIL != Types.stringp(in_file) " + in_file;
        assert NIL != stringp(out_file) : "Types.stringp(out_file) " + "CommonSymbols.NIL != Types.stringp(out_file) " + out_file;
        SubLObject success = NIL;
        if (NIL != Filesys.probe_file(in_file)) {
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_binary(in_file, $INPUT);
                if (!stream.isStream()) {
                    Errors.error($str4$Unable_to_open__S, in_file);
                }
                final SubLObject in_stream = stream;
                SubLObject stream_$1 = NIL;
                try {
                    stream_$1 = compatibility.open_binary(out_file, $OUTPUT);
                    if (!stream_$1.isStream()) {
                        Errors.error($str4$Unable_to_open__S, out_file);
                    }
                    final SubLObject out_stream = stream_$1;
                    final SubLObject _prev_bind_0 = $cfasl_common_symbols$.currentBinding(thread);
                    try {
                        $cfasl_common_symbols$.bind(NIL, thread);
                        cfasl_set_common_symbols(convert_partition_info(in_stream, out_stream));
                        convert_partition_constant_shells(in_stream, out_stream);
                    } finally {
                        $cfasl_common_symbols$.rebind(_prev_bind_0, thread);
                    }
                    convert_partition_remainder(in_stream, out_stream);
                    success = T;
                } finally {
                    final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        if (stream_$1.isStream()) {
                            close(stream_$1, UNPROVIDED);
                        }
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                    }
                }
            } finally {
                final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
        }
        return success;
    }

    public static SubLObject convert_partition_info(final SubLObject in_stream, final SubLObject out_stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject copyright_notice = cfasl_input(in_stream, UNPROVIDED, UNPROVIDED);
        final SubLObject format = cfasl_input(in_stream, UNPROVIDED, UNPROVIDED);
        final SubLObject system = cfasl_input(in_stream, UNPROVIDED, UNPROVIDED);
        final SubLObject patch_level = cfasl_input(in_stream, UNPROVIDED, UNPROVIDED);
        final SubLObject date = cfasl_input(in_stream, UNPROVIDED, UNPROVIDED);
        assert NIL != stringp(copyright_notice) : "Types.stringp(copyright_notice) " + "CommonSymbols.NIL != Types.stringp(copyright_notice) " + copyright_notice;
        assert NIL != atom(format) : "Types.atom(format) " + "CommonSymbols.NIL != Types.atom(format) " + format;
        assert NIL != integerp(system) : "Types.integerp(system) " + "CommonSymbols.NIL != Types.integerp(system) " + system;
        assert NIL != integerp(patch_level) : "Types.integerp(patch_level) " + "CommonSymbols.NIL != Types.integerp(patch_level) " + patch_level;
        assert NIL != integerp(date) : "Types.integerp(date) " + "CommonSymbols.NIL != Types.integerp(date) " + date;
        if (!format.equal($convert_partition_source_format$.getDynamicValue(thread))) {
            Errors.error($str8$partition_format_is__A__not__A, format, $convert_partition_source_format$.getDynamicValue(thread));
        }
        SubLObject current;
        final SubLObject datum = current = system_info.cyc_revision_numbers();
        SubLObject system_number = NIL;
        SubLObject patch_number = NIL;
        destructuring_bind_must_consp(current, datum, $list9);
        system_number = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list9);
        patch_number = current.first();
        final SubLObject rest;
        current = rest = current.rest();
        final SubLObject special_objects = partitions.load_partition_special_objects(in_stream);
        cfasl_output(misc_utilities.copyright_notice(), out_stream);
        cfasl_output($convert_partition_target_format$.getDynamicValue(thread), out_stream);
        cfasl_output(system_number, out_stream);
        cfasl_output(patch_number, out_stream);
        cfasl_output(numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED), out_stream);
        dumper.dump_special_objects_internal(special_objects, out_stream);
        return special_objects;
    }

    public static SubLObject convert_partition_constant_shells(final SubLObject in_stream, final SubLObject out_stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        partitions.load_partition_section_marker(in_stream, UNPROVIDED, UNPROVIDED);
        partitions.dump_partition_section_marker(out_stream);
        final SubLObject total = cfasl_input(in_stream, UNPROVIDED, UNPROVIDED);
        assert NIL != integerp(total) : "Types.integerp(total) " + "CommonSymbols.NIL != Types.integerp(total) " + total;
        cfasl_output(total, out_stream);
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($str10$converting_partition_constant_she, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(total, thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject i;
                for (i = NIL, i = ZERO_INTEGER; i.numL($progress_total$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
                    convert_partition_constant_shell(in_stream, out_stream);
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                }
            } finally {
                final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject convert_partition_constant_shell(final SubLObject in_stream, final SubLObject out_stream) {
        final SubLObject internal_id = cfasl_input(in_stream, UNPROVIDED, UNPROVIDED);
        final SubLObject name = cfasl_input(in_stream, UNPROVIDED, UNPROVIDED);
        final SubLObject scopeP = cfasl_input(in_stream, UNPROVIDED, UNPROVIDED);
        assert NIL != integerp(internal_id) : "Types.integerp(internal_id) " + "CommonSymbols.NIL != Types.integerp(internal_id) " + internal_id;
        final SubLObject external_id = constants_high.make_constant_legacy_guid(internal_id);
        cfasl_output(internal_id, out_stream);
        cfasl_output(name, out_stream);
        cfasl_output(external_id, out_stream);
        cfasl_output(scopeP, out_stream);
        return NIL;
    }

    public static SubLObject convert_partition_remainder(final SubLObject in_stream, final SubLObject out_stream) {
        SubLObject v_byte;
        for (v_byte = NIL, v_byte = read_byte(in_stream, NIL, $EOF); v_byte != $EOF; v_byte = read_byte(in_stream, NIL, $EOF)) {
            write_byte(v_byte, out_stream);
        }
        return NIL;
    }

    public static SubLObject declare_convert_partitions_file() {
        declareFunction(me, "convert_partition", "CONVERT-PARTITION", 2, 0, false);
        declareFunction(me, "convert_partition_info", "CONVERT-PARTITION-INFO", 2, 0, false);
        declareFunction(me, "convert_partition_constant_shells", "CONVERT-PARTITION-CONSTANT-SHELLS", 2, 0, false);
        declareFunction(me, "convert_partition_constant_shell", "CONVERT-PARTITION-CONSTANT-SHELL", 2, 0, false);
        declareFunction(me, "convert_partition_remainder", "CONVERT-PARTITION-REMAINDER", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_convert_partitions_file() {
        defparameter("*CONVERT-PARTITION-SOURCE-FORMAT*", $str0$2_0);
        defparameter("*CONVERT-PARTITION-TARGET-FORMAT*", $str1$2_1);
        return NIL;
    }

    public static SubLObject setup_convert_partitions_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_convert_partitions_file();
    }

    @Override
    public void initializeVariables() {
        init_convert_partitions_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_convert_partitions_file();
    }

    static {















    }
}

/**
 * Total time: 203 ms
 */
