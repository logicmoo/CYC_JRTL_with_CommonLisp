/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cfasl.$cfasl_common_symbols$;
import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.cycjava.cycl.cfasl.cfasl_set_common_symbols;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_note$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_total$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.atom;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_byte;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_byte;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

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
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class convert_partitions extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new convert_partitions();

 public static final String myName = "com.cyc.cycjava.cycl.convert_partitions";


    // defparameter
    // Definitions
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $convert_partition_source_format$ = makeSymbol("*CONVERT-PARTITION-SOURCE-FORMAT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $convert_partition_target_format$ = makeSymbol("*CONVERT-PARTITION-TARGET-FORMAT*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str0$2_0 = makeString("2.0");

    static private final SubLString $str1$2_1 = makeString("2.1");

    static private final SubLString $str4$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str8$partition_format_is__A__not__A = makeString("partition format is ~A, not ~A");

    static private final SubLList $list9 = list(makeSymbol("SYSTEM-NUMBER"), makeSymbol("PATCH-NUMBER"), makeSymbol("&REST"), makeSymbol("REST"));

    static private final SubLString $str10$converting_partition_constant_she = makeString("converting partition constant shells");

    /**
     * Convert a 2.0 partition into a 2.1 partition
     */
    @LispMethod(comment = "Convert a 2.0 partition into a 2.1 partition")
    public static final SubLObject convert_partition_alt(SubLObject in_file, SubLObject out_file) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(in_file, STRINGP);
            SubLTrampolineFile.checkType(out_file, STRINGP);
            {
                SubLObject success = NIL;
                if (NIL != Filesys.probe_file(in_file)) {
                    {
                        SubLObject stream = NIL;
                        try {
                            stream = compatibility.open_binary(in_file, $INPUT, NIL);
                            if (!stream.isStream()) {
                                Errors.error($str_alt4$Unable_to_open__S, in_file);
                            }
                            {
                                SubLObject in_stream = stream;
                                SubLObject stream_1 = NIL;
                                try {
                                    stream_1 = compatibility.open_binary(out_file, $OUTPUT, NIL);
                                    if (!stream_1.isStream()) {
                                        Errors.error($str_alt4$Unable_to_open__S, out_file);
                                    }
                                    {
                                        SubLObject out_stream = stream_1;
                                        {
                                            SubLObject _prev_bind_0 = $cfasl_common_symbols$.currentBinding(thread);
                                            try {
                                                $cfasl_common_symbols$.bind(NIL, thread);
                                                cfasl_set_common_symbols(com.cyc.cycjava.cycl.convert_partitions.convert_partition_info(in_stream, out_stream));
                                                com.cyc.cycjava.cycl.convert_partitions.convert_partition_constant_shells(in_stream, out_stream);
                                            } finally {
                                                $cfasl_common_symbols$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                        com.cyc.cycjava.cycl.convert_partitions.convert_partition_remainder(in_stream, out_stream);
                                        success = T;
                                    }
                                } finally {
                                    {
                                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            if (stream_1.isStream()) {
                                                close(stream_1, UNPROVIDED);
                                            }
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
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
                    }
                }
                return success;
            }
        }
    }

    /**
     * Convert a 2.0 partition into a 2.1 partition
     */
    @LispMethod(comment = "Convert a 2.0 partition into a 2.1 partition")
    public static SubLObject convert_partition(final SubLObject in_file, final SubLObject out_file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(in_file) : "! stringp(in_file) " + ("Types.stringp(in_file) " + "CommonSymbols.NIL != Types.stringp(in_file) ") + in_file;
        assert NIL != stringp(out_file) : "! stringp(out_file) " + ("Types.stringp(out_file) " + "CommonSymbols.NIL != Types.stringp(out_file) ") + out_file;
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

    public static final SubLObject convert_partition_info_alt(SubLObject in_stream, SubLObject out_stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject copyright_notice = cfasl_input(in_stream, UNPROVIDED, UNPROVIDED);
                SubLObject format = cfasl_input(in_stream, UNPROVIDED, UNPROVIDED);
                SubLObject system = cfasl_input(in_stream, UNPROVIDED, UNPROVIDED);
                SubLObject patch_level = cfasl_input(in_stream, UNPROVIDED, UNPROVIDED);
                SubLObject date = cfasl_input(in_stream, UNPROVIDED, UNPROVIDED);
                SubLTrampolineFile.checkType(copyright_notice, STRINGP);
                SubLTrampolineFile.checkType(format, ATOM);
                SubLTrampolineFile.checkType(system, INTEGERP);
                SubLTrampolineFile.checkType(patch_level, INTEGERP);
                SubLTrampolineFile.checkType(date, INTEGERP);
                if (!format.equal($convert_partition_source_format$.getDynamicValue(thread))) {
                    Errors.error($str_alt8$partition_format_is__A__not__A, format, $convert_partition_source_format$.getDynamicValue(thread));
                }
                {
                    SubLObject datum = system_info.cyc_revision_numbers();
                    SubLObject current = datum;
                    SubLObject system_number = NIL;
                    SubLObject patch_number = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt9);
                    system_number = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt9);
                    patch_number = current.first();
                    current = current.rest();
                    {
                        SubLObject rest = current;
                        SubLObject special_objects = partitions.load_partition_special_objects(in_stream);
                        cfasl_output(misc_utilities.copyright_notice(), out_stream);
                        cfasl_output($convert_partition_target_format$.getDynamicValue(thread), out_stream);
                        cfasl_output(system_number, out_stream);
                        cfasl_output(patch_number, out_stream);
                        cfasl_output(numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED), out_stream);
                        dumper.dump_special_objects_internal(special_objects, out_stream);
                        return special_objects;
                    }
                }
            }
        }
    }

    public static SubLObject convert_partition_info(final SubLObject in_stream, final SubLObject out_stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject copyright_notice = cfasl_input(in_stream, UNPROVIDED, UNPROVIDED);
        final SubLObject format = cfasl_input(in_stream, UNPROVIDED, UNPROVIDED);
        final SubLObject system = cfasl_input(in_stream, UNPROVIDED, UNPROVIDED);
        final SubLObject patch_level = cfasl_input(in_stream, UNPROVIDED, UNPROVIDED);
        final SubLObject date = cfasl_input(in_stream, UNPROVIDED, UNPROVIDED);
        assert NIL != stringp(copyright_notice) : "! stringp(copyright_notice) " + ("Types.stringp(copyright_notice) " + "CommonSymbols.NIL != Types.stringp(copyright_notice) ") + copyright_notice;
        assert NIL != atom(format) : "! atom(format) " + ("Types.atom(format) " + "CommonSymbols.NIL != Types.atom(format) ") + format;
        assert NIL != integerp(system) : "! integerp(system) " + ("Types.integerp(system) " + "CommonSymbols.NIL != Types.integerp(system) ") + system;
        assert NIL != integerp(patch_level) : "! integerp(patch_level) " + ("Types.integerp(patch_level) " + "CommonSymbols.NIL != Types.integerp(patch_level) ") + patch_level;
        assert NIL != integerp(date) : "! integerp(date) " + ("Types.integerp(date) " + "CommonSymbols.NIL != Types.integerp(date) ") + date;
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

    public static final SubLObject convert_partition_constant_shells_alt(SubLObject in_stream, SubLObject out_stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            partitions.load_partition_section_marker(in_stream, UNPROVIDED, UNPROVIDED);
            partitions.dump_partition_section_marker(out_stream);
            {
                SubLObject total = cfasl_input(in_stream, UNPROVIDED, UNPROVIDED);
                SubLTrampolineFile.checkType(total, INTEGERP);
                cfasl_output(total, out_stream);
                $progress_note$.setDynamicValue($str_alt10$converting_partition_constant_she, thread);
                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                $progress_total$.setDynamicValue(total, thread);
                $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        {
                            SubLObject i = NIL;
                            for (i = ZERO_INTEGER; i.numL($progress_total$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                com.cyc.cycjava.cycl.convert_partitions.convert_partition_constant_shell(in_stream, out_stream);
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject convert_partition_constant_shells(final SubLObject in_stream, final SubLObject out_stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        partitions.load_partition_section_marker(in_stream, UNPROVIDED, UNPROVIDED);
        partitions.dump_partition_section_marker(out_stream);
        final SubLObject total = cfasl_input(in_stream, UNPROVIDED, UNPROVIDED);
        assert NIL != integerp(total) : "! integerp(total) " + ("Types.integerp(total) " + "CommonSymbols.NIL != Types.integerp(total) ") + total;
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

    public static final SubLObject convert_partition_constant_shell_alt(SubLObject in_stream, SubLObject out_stream) {
        {
            SubLObject internal_id = cfasl_input(in_stream, UNPROVIDED, UNPROVIDED);
            SubLObject name = cfasl_input(in_stream, UNPROVIDED, UNPROVIDED);
            SubLObject scopeP = cfasl_input(in_stream, UNPROVIDED, UNPROVIDED);
            SubLTrampolineFile.checkType(internal_id, INTEGERP);
            {
                SubLObject external_id = constants_high.make_constant_legacy_guid(internal_id);
                cfasl_output(internal_id, out_stream);
                cfasl_output(name, out_stream);
                cfasl_output(external_id, out_stream);
                cfasl_output(scopeP, out_stream);
                return NIL;
            }
        }
    }

    public static SubLObject convert_partition_constant_shell(final SubLObject in_stream, final SubLObject out_stream) {
        final SubLObject internal_id = cfasl_input(in_stream, UNPROVIDED, UNPROVIDED);
        final SubLObject name = cfasl_input(in_stream, UNPROVIDED, UNPROVIDED);
        final SubLObject scopeP = cfasl_input(in_stream, UNPROVIDED, UNPROVIDED);
        assert NIL != integerp(internal_id) : "! integerp(internal_id) " + ("Types.integerp(internal_id) " + "CommonSymbols.NIL != Types.integerp(internal_id) ") + internal_id;
        final SubLObject external_id = constants_high.make_constant_legacy_guid(internal_id);
        cfasl_output(internal_id, out_stream);
        cfasl_output(name, out_stream);
        cfasl_output(external_id, out_stream);
        cfasl_output(scopeP, out_stream);
        return NIL;
    }

    public static final SubLObject convert_partition_remainder_alt(SubLObject in_stream, SubLObject out_stream) {
        {
            SubLObject v_byte = NIL;
            for (v_byte = read_byte(in_stream, NIL, $EOF); v_byte != $EOF; v_byte = read_byte(in_stream, NIL, $EOF)) {
                write_byte(v_byte, out_stream);
            }
        }
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
        declareFunction("convert_partition", "CONVERT-PARTITION", 2, 0, false);
        declareFunction("convert_partition_info", "CONVERT-PARTITION-INFO", 2, 0, false);
        declareFunction("convert_partition_constant_shells", "CONVERT-PARTITION-CONSTANT-SHELLS", 2, 0, false);
        declareFunction("convert_partition_constant_shell", "CONVERT-PARTITION-CONSTANT-SHELL", 2, 0, false);
        declareFunction("convert_partition_remainder", "CONVERT-PARTITION-REMAINDER", 2, 0, false);
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

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$2_0 = makeString("2.0");

    

    static private final SubLString $str_alt1$2_1 = makeString("2.1");

    static private final SubLString $str_alt4$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt8$partition_format_is__A__not__A = makeString("partition format is ~A, not ~A");

    static private final SubLList $list_alt9 = list(makeSymbol("SYSTEM-NUMBER"), makeSymbol("PATCH-NUMBER"), makeSymbol("&REST"), makeSymbol("REST"));

    static private final SubLString $str_alt10$converting_partition_constant_she = makeString("converting partition constant shells");
}

/**
 * Total time: 203 ms
 */
