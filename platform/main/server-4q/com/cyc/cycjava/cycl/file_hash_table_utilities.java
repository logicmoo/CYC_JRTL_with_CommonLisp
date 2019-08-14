/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
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
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_symbol;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
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
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class file_hash_table_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new file_hash_table_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.file_hash_table_utilities";


    // defparameter
    // Override this value for RAMDISK testing, for example.
    /**
     * Override this value for RAMDISK testing, for example.
     */
    @LispMethod(comment = "Override this value for RAMDISK testing, for example.\ndefparameter")
    public static final SubLSymbol $default_test_file_hash_table_tmpdir$ = makeSymbol("*DEFAULT-TEST-FILE-HASH-TABLE-TMPDIR*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeSymbol("KEY"), makeSymbol("VALUES"));

    static private final SubLString $$$Not_Found = makeString("Not Found");

    static private final SubLString $str3$Checking_the_map_against_the_FHT_ = makeString("Checking the map against the FHT ....");

    static private final SubLString $str5$Given_size_mismatch__check_for_ex = makeString("Given size mismatch, check for extra keys ...");

    private static final SubLSymbol TEST_FILE_HASH_TABLE_RETRIEVAL = makeSymbol("TEST-FILE-HASH-TABLE-RETRIEVAL");

    private static final SubLList $list16 = list(list(list(list(cons(makeString("bd5880ee-9c29-11b1-9dad-c379636f7270"), ZERO_INTEGER), cons(makeString("bd588052-9c29-11b1-9dad-c379636f7270"), ONE_INTEGER), cons(makeString("bd588044-9c29-11b1-9dad-c379636f7270"), TWO_INTEGER), cons(makeString("bd58810e-9c29-11b1-9dad-c379636f7270"), THREE_INTEGER)), EQUAL, makeKeyword("IMAGE-DEPENDENT-CFASL"), $SLOW, makeSymbol("=")), makeKeyword("SUCCESS")));

    private static final SubLList $list18 = cons(makeSymbol("KEY"), makeSymbol("VALUE"));

    private static final SubLString $str21$Unknown_write_style__A_ = makeString("Unknown write style ~A.");

    private static final SubLList $list22 = list(makeSymbol("&KEY"), makeSymbol("MAP-ONLY"), makeSymbol("FHT-ONLY"), makeSymbol("VALUES-DIFFER"));

    static private final SubLList $list23 = list(makeKeyword("MAP-ONLY"), makeKeyword("FHT-ONLY"), makeKeyword("VALUES-DIFFER"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    // Definitions
    /**
     * Writes a MAP-P to a file hash table at FILENAME using the fast method.
     *
     * @return FILENAME
     */
    @LispMethod(comment = "Writes a MAP-P to a file hash table at FILENAME using the fast method.\r\n\r\n@return FILENAME")
    public static final SubLObject write_map_to_file_hash_table_alt(SubLObject map, SubLObject filename, SubLObject serialization_fn, SubLObject tempdir) {
        if (serialization_fn == UNPROVIDED) {
            serialization_fn = file_hash_table.$default_fht_serialization_protocol$.getGlobalValue();
        }
        if (tempdir == UNPROVIDED) {
            tempdir = file_utilities.temp_directory();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject test = map_utilities.map_test(map);
                SubLObject size = map_utilities.map_size(map);
                SubLObject fast_fht = NIL;
                try {
                    fast_fht = file_hash_table.fast_create_file_hash_table(filename, tempdir, test, serialization_fn);
                    {
                        SubLObject iterator = map_utilities.new_map_iterator(map);
                        SubLObject done_var = NIL;
                        while (NIL == done_var) {
                            thread.resetMultipleValues();
                            {
                                SubLObject var = iteration.iteration_next(iterator);
                                SubLObject valid = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != valid) {
                                    {
                                        SubLObject datum = var;
                                        SubLObject current = datum;
                                        SubLObject key = NIL;
                                        SubLObject values = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt0);
                                        key = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt0);
                                        values = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            file_hash_table.fast_put_file_hash_table(key, fast_fht, values);
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt0);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            }
                        } 
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (NIL != file_hash_table.fast_create_fht_p(fast_fht)) {
                                file_hash_table.finalize_fast_create_file_hash_table(fast_fht, NIL, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return filename;
        }
    }

    // Definitions
    /**
     * Writes a MAP-P to a file hash table at FILENAME using the fast method.
     *
     * @return FILENAME
     */
    @LispMethod(comment = "Writes a MAP-P to a file hash table at FILENAME using the fast method.\r\n\r\n@return FILENAME")
    public static SubLObject write_map_to_file_hash_table(final SubLObject map, final SubLObject filename, SubLObject serialization_fn, SubLObject tempdir) {
        if (serialization_fn == UNPROVIDED) {
            serialization_fn = file_hash_table.$default_fht_serialization_protocol$.getGlobalValue();
        }
        if (tempdir == UNPROVIDED) {
            tempdir = file_utilities.temp_directory();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject test = map_utilities.map_test(map);
        final SubLObject size = map_utilities.map_size(map);
        SubLObject fast_fht = NIL;
        try {
            fast_fht = file_hash_table.fast_create_file_hash_table(filename, tempdir, test, serialization_fn);
            final SubLObject iterator = map_utilities.new_map_iterator(map);
            SubLObject valid;
            for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject var = iteration.iteration_next(iterator);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != valid) {
                    SubLObject current;
                    final SubLObject datum = current = var;
                    SubLObject key = NIL;
                    SubLObject values = NIL;
                    destructuring_bind_must_consp(current, datum, $list0);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list0);
                    values = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        file_hash_table.fast_put_file_hash_table(key, fast_fht, values);
                    } else {
                        cdestructuring_bind_error(datum, $list0);
                    }
                }
            }
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (NIL != file_hash_table.fast_create_fht_p(fast_fht)) {
                    file_hash_table.finalize_fast_create_file_hash_table(fast_fht, NIL, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return filename;
    }

    /**
     * Writes a MAP-P to a FILE-HASH-TABLE-P at FILENAME using the non-fast method.
     *
     * @return FILENAME
     */
    @LispMethod(comment = "Writes a MAP-P to a FILE-HASH-TABLE-P at FILENAME using the non-fast method.\r\n\r\n@return FILENAME")
    public static final SubLObject write_map_to_file_hash_table_slow_alt(SubLObject map, SubLObject filename, SubLObject serialization_fn) {
        if (serialization_fn == UNPROVIDED) {
            serialization_fn = file_hash_table.$default_fht_serialization_protocol$.getGlobalValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject test = map_utilities.map_test(map);
                SubLObject size = map_utilities.map_size(map);
                SubLObject fht = NIL;
                try {
                    fht = file_hash_table.create_file_hash_table(filename, size, $int$256, test, serialization_fn);
                    {
                        SubLObject iterator = map_utilities.new_map_iterator(map);
                        SubLObject done_var = NIL;
                        while (NIL == done_var) {
                            thread.resetMultipleValues();
                            {
                                SubLObject var = iteration.iteration_next(iterator);
                                SubLObject valid = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != valid) {
                                    {
                                        SubLObject datum = var;
                                        SubLObject current = datum;
                                        SubLObject key = NIL;
                                        SubLObject values = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt0);
                                        key = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt0);
                                        values = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            file_hash_table.put_file_hash_table(key, fht, values);
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt0);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            }
                        } 
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (NIL != file_hash_table.file_hash_table_p(fht)) {
                                file_hash_table.finalize_file_hash_table(fht);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return filename;
        }
    }

    /**
     * Writes a MAP-P to a FILE-HASH-TABLE-P at FILENAME using the non-fast method.
     *
     * @return FILENAME
     */
    @LispMethod(comment = "Writes a MAP-P to a FILE-HASH-TABLE-P at FILENAME using the non-fast method.\r\n\r\n@return FILENAME")
    public static SubLObject write_map_to_file_hash_table_slow(final SubLObject map, final SubLObject filename, SubLObject serialization_fn) {
        if (serialization_fn == UNPROVIDED) {
            serialization_fn = file_hash_table.$default_fht_serialization_protocol$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject test = map_utilities.map_test(map);
        final SubLObject size = map_utilities.map_size(map);
        SubLObject fht = NIL;
        try {
            fht = file_hash_table.create_file_hash_table(filename, size, $int$256, test, serialization_fn);
            final SubLObject iterator = map_utilities.new_map_iterator(map);
            SubLObject valid;
            for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject var = iteration.iteration_next(iterator);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != valid) {
                    SubLObject current;
                    final SubLObject datum = current = var;
                    SubLObject key = NIL;
                    SubLObject values = NIL;
                    destructuring_bind_must_consp(current, datum, $list0);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list0);
                    values = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        file_hash_table.put_file_hash_table(key, fht, values);
                    } else {
                        cdestructuring_bind_error(datum, $list0);
                    }
                }
            }
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (NIL != file_hash_table.file_hash_table_p(fht)) {
                    file_hash_table.finalize_file_hash_table(fht);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return filename;
    }

    /**
     * Compare a map to a file hash table and compile the following pieces of information
     * (a) missing keys that are in map but not in the FHT
     * (b) missing keys that are in the FHT but not in the MAP
     * (c) keys for which the values differ
     *
     * @return PLIST of :map-only, :fht-only, and :values-differ
     */
    @LispMethod(comment = "Compare a map to a file hash table and compile the following pieces of information\r\n(a) missing keys that are in map but not in the FHT\r\n(b) missing keys that are in the FHT but not in the MAP\r\n(c) keys for which the values differ\r\n\r\n@return PLIST of :map-only, :fht-only, and :values-differ\nCompare a map to a file hash table and compile the following pieces of information\n(a) missing keys that are in map but not in the FHT\n(b) missing keys that are in the FHT but not in the MAP\n(c) keys for which the values differ")
    public static final SubLObject compare_map_to_file_hash_table_alt(SubLObject map, SubLObject filename, SubLObject value_compare_fn, SubLObject serialization_fn) {
        if (serialization_fn == UNPROVIDED) {
            serialization_fn = file_hash_table.$default_fht_serialization_protocol$.getGlobalValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject test = map_utilities.map_test(map);
                SubLObject not_found_symbol = make_symbol($$$Not_Found);
                SubLObject map_only = NIL;
                SubLObject fht_only = NIL;
                SubLObject values_differ = NIL;
                SubLObject fht = NIL;
                try {
                    fht = file_hash_table.open_file_hash_table_read_only(filename, test, serialization_fn);
                    {
                        SubLObject the_map = map;
                        SubLObject mess = $str_alt3$Checking_the_map_against_the_FHT_;
                        SubLObject sofar = ZERO_INTEGER;
                        SubLObject total = map_utilities.map_size(the_map);
                        SubLTrampolineFile.checkType(mess, STRINGP);
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
                                noting_percent_progress_preamble(mess);
                                {
                                    SubLObject iterator = map_utilities.new_map_iterator(the_map);
                                    SubLObject done_var = NIL;
                                    while (NIL == done_var) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject var = iteration.iteration_next(iterator);
                                            SubLObject valid = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != valid) {
                                                {
                                                    SubLObject datum = var;
                                                    SubLObject current = datum;
                                                    SubLObject key = NIL;
                                                    SubLObject values = NIL;
                                                    destructuring_bind_must_consp(current, datum, $list_alt0);
                                                    key = current.first();
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list_alt0);
                                                    values = current.first();
                                                    current = current.rest();
                                                    if (NIL == current) {
                                                        note_percent_progress(sofar, total);
                                                        sofar = add(sofar, ONE_INTEGER);
                                                        {
                                                            SubLObject fht_values = file_hash_table.get_file_hash_table(key, fht, not_found_symbol);
                                                            if (not_found_symbol == fht_values) {
                                                                map_only = cons(key, map_only);
                                                            } else {
                                                                {
                                                                    SubLObject result = funcall(value_compare_fn, values, fht_values);
                                                                    if (NIL == list_utilities.sublisp_boolean(result)) {
                                                                        values_differ = cons(key, values_differ);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        cdestructuring_bind_error(datum, $list_alt0);
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean(NIL == valid);
                                        }
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
                    if (!map_utilities.map_size(map).numE(file_hash_table.file_hash_table_count(fht))) {
                        {
                            SubLObject fht_var = fht;
                            $progress_note$.setDynamicValue($str_alt5$Given_size_mismatch__check_for_ex, thread);
                            $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                            $progress_total$.setDynamicValue(file_hash_table.file_hash_table_count(fht_var), thread);
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
                                        SubLObject continuation = NIL;
                                        SubLObject completeP = NIL;
                                        while (NIL == completeP) {
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject the_key = file_hash_table.get_file_hash_table_any(fht_var, continuation, T);
                                                SubLObject the_value = thread.secondMultipleValue();
                                                SubLObject next = thread.thirdMultipleValue();
                                                thread.resetMultipleValues();
                                                if (NIL != next) {
                                                    {
                                                        SubLObject key = the_key;
                                                        SubLObject value = the_value;
                                                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                        {
                                                            SubLObject map_values = map_utilities.map_get(map, key, not_found_symbol);
                                                            if (not_found_symbol == map_values) {
                                                                fht_only = cons(key, fht_only);
                                                            }
                                                        }
                                                    }
                                                }
                                                continuation = next;
                                                completeP = sublisp_null(next);
                                            }
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
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (NIL != file_hash_table.file_hash_table_p(fht)) {
                                file_hash_table.finalize_file_hash_table(fht);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return list($MAP_ONLY, map_only, $FHT_ONLY, fht_only, $VALUES_DIFFER, values_differ);
            }
        }
    }

    /**
     * Compare a map to a file hash table and compile the following pieces of information
     * (a) missing keys that are in map but not in the FHT
     * (b) missing keys that are in the FHT but not in the MAP
     * (c) keys for which the values differ
     *
     * @return PLIST of :map-only, :fht-only, and :values-differ
     */
    @LispMethod(comment = "Compare a map to a file hash table and compile the following pieces of information\r\n(a) missing keys that are in map but not in the FHT\r\n(b) missing keys that are in the FHT but not in the MAP\r\n(c) keys for which the values differ\r\n\r\n@return PLIST of :map-only, :fht-only, and :values-differ\nCompare a map to a file hash table and compile the following pieces of information\n(a) missing keys that are in map but not in the FHT\n(b) missing keys that are in the FHT but not in the MAP\n(c) keys for which the values differ")
    public static SubLObject compare_map_to_file_hash_table(final SubLObject map, final SubLObject filename, final SubLObject value_compare_fn, SubLObject serialization_fn) {
        if (serialization_fn == UNPROVIDED) {
            serialization_fn = file_hash_table.$default_fht_serialization_protocol$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject test = map_utilities.map_test(map);
        final SubLObject not_found_symbol = make_symbol($$$Not_Found);
        SubLObject map_only = NIL;
        SubLObject fht_only = NIL;
        SubLObject values_differ = NIL;
        SubLObject fht = NIL;
        try {
            fht = file_hash_table.open_file_hash_table_read_only(filename, test, serialization_fn);
            final SubLObject mess = $str3$Checking_the_map_against_the_FHT_;
            SubLObject sofar = ZERO_INTEGER;
            final SubLObject total = map_utilities.map_size(map);
            assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
            final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(mess);
                    final SubLObject iterator = map_utilities.new_map_iterator(map);
                    SubLObject valid;
                    for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                        thread.resetMultipleValues();
                        final SubLObject var = iteration.iteration_next(iterator);
                        valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != valid) {
                            SubLObject current;
                            final SubLObject datum = current = var;
                            SubLObject key = NIL;
                            SubLObject values = NIL;
                            destructuring_bind_must_consp(current, datum, $list0);
                            key = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list0);
                            values = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                note_percent_progress(sofar, total);
                                sofar = add(sofar, ONE_INTEGER);
                                final SubLObject fht_values = file_hash_table.get_file_hash_table(key, fht, not_found_symbol);
                                if (not_found_symbol.eql(fht_values)) {
                                    map_only = cons(key, map_only);
                                } else {
                                    final SubLObject result = funcall(value_compare_fn, values, fht_values);
                                    if (NIL == list_utilities.sublisp_boolean(result)) {
                                        values_differ = cons(key, values_differ);
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list0);
                            }
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
            if (!map_utilities.map_size(map).numE(file_hash_table.file_hash_table_count(fht))) {
                final SubLObject fht_var = fht;
                $progress_note$.setDynamicValue($str5$Given_size_mismatch__check_for_ex, thread);
                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                $progress_total$.setDynamicValue(file_hash_table.file_hash_table_count(fht_var), thread);
                $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        SubLObject continuation = NIL;
                        SubLObject next;
                        for (SubLObject completeP = NIL; NIL == completeP; completeP = sublisp_null(next)) {
                            thread.resetMultipleValues();
                            final SubLObject the_key = file_hash_table.get_file_hash_table_any(fht_var, continuation, T);
                            final SubLObject the_value = thread.secondMultipleValue();
                            next = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != next) {
                                final SubLObject key2 = the_key;
                                final SubLObject value = the_value;
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                final SubLObject map_values = map_utilities.map_get(map, key2, not_found_symbol);
                                if (not_found_symbol.eql(map_values)) {
                                    fht_only = cons(key2, fht_only);
                                }
                            }
                            continuation = next;
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                }
            }
        } finally {
            final SubLObject _prev_bind_9 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values3 = getValuesAsVector();
                if (NIL != file_hash_table.file_hash_table_p(fht)) {
                    file_hash_table.finalize_file_hash_table(fht);
                }
                restoreValuesFromVector(_values3);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_9, thread);
            }
        }
        return list($MAP_ONLY, map_only, $FHT_ONLY, fht_only, $VALUES_DIFFER, values_differ);
    }

    /**
     * Make sure that all of the pairs can be found again in the representation
     * that they were sent in.
     */
    @LispMethod(comment = "Make sure that all of the pairs can be found again in the representation\r\nthat they were sent in.\nMake sure that all of the pairs can be found again in the representation\nthat they were sent in.")
    public static final SubLObject test_file_hash_table_retrieval_alt(SubLObject pairs, SubLObject test_fn, SubLObject serialization_fn, SubLObject write_style, SubLObject value_test_fn) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject map = dictionary.new_dictionary(test_fn, UNPROVIDED);
                SubLObject temp_dir = $default_test_file_hash_table_tmpdir$.getDynamicValue(thread);
                SubLObject filename = file_utilities.make_temp_filename(temp_dir);
                SubLObject outcome = $SUCCESS;
                try {
                    {
                        SubLObject cdolist_list_var = pairs;
                        SubLObject pair = NIL;
                        for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                            {
                                SubLObject datum = pair;
                                SubLObject current = datum;
                                SubLObject key = NIL;
                                SubLObject value = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt19);
                                key = current.first();
                                current = current.rest();
                                value = current;
                                map_utilities.map_put(map, key, value);
                            }
                        }
                        {
                            SubLObject pcase_var = write_style;
                            if (pcase_var.eql($SLOW)) {
                                com.cyc.cycjava.cycl.file_hash_table_utilities.write_map_to_file_hash_table_slow(map, filename, serialization_fn);
                            } else {
                                if (pcase_var.eql($FAST)) {
                                    com.cyc.cycjava.cycl.file_hash_table_utilities.write_map_to_file_hash_table(map, filename, serialization_fn, temp_dir);
                                } else {
                                    Errors.error($str_alt22$Unknown_write_style__A_, write_style);
                                }
                            }
                        }
                        {
                            SubLObject results = com.cyc.cycjava.cycl.file_hash_table_utilities.compare_map_to_file_hash_table(map, filename, value_test_fn, serialization_fn);
                            SubLObject datum = results;
                            SubLObject current = datum;
                            SubLObject allow_other_keys_p = NIL;
                            SubLObject rest = current;
                            SubLObject bad = NIL;
                            SubLObject current_1 = NIL;
                            for (; NIL != rest;) {
                                destructuring_bind_must_consp(rest, datum, $list_alt23);
                                current_1 = rest.first();
                                rest = rest.rest();
                                destructuring_bind_must_consp(rest, datum, $list_alt23);
                                if (NIL == member(current_1, $list_alt24, UNPROVIDED, UNPROVIDED)) {
                                    bad = T;
                                }
                                if (current_1 == $ALLOW_OTHER_KEYS) {
                                    allow_other_keys_p = rest.first();
                                }
                                rest = rest.rest();
                            }
                            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                cdestructuring_bind_error(datum, $list_alt23);
                            }
                            {
                                SubLObject map_only_tail = property_list_member($MAP_ONLY, current);
                                SubLObject map_only = (NIL != map_only_tail) ? ((SubLObject) (cadr(map_only_tail))) : NIL;
                                SubLObject fht_only_tail = property_list_member($FHT_ONLY, current);
                                SubLObject fht_only = (NIL != fht_only_tail) ? ((SubLObject) (cadr(fht_only_tail))) : NIL;
                                SubLObject values_differ_tail = property_list_member($VALUES_DIFFER, current);
                                SubLObject values_differ = (NIL != values_differ_tail) ? ((SubLObject) (cadr(values_differ_tail))) : NIL;
                                if (!(((NIL == values_differ) && (NIL == fht_only)) && (NIL == map_only))) {
                                    outcome = results;
                                }
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            {
                                SubLObject ignore_errors_tag = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_2 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                            try {
                                                Filesys.delete_file(filename);
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_2, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                                }
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return outcome;
            }
        }
    }

    /**
     * Make sure that all of the pairs can be found again in the representation
     * that they were sent in.
     */
    @LispMethod(comment = "Make sure that all of the pairs can be found again in the representation\r\nthat they were sent in.\nMake sure that all of the pairs can be found again in the representation\nthat they were sent in.")
    public static SubLObject test_file_hash_table_retrieval(final SubLObject pairs, final SubLObject test_fn, final SubLObject serialization_fn, final SubLObject write_style, final SubLObject value_test_fn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject map = dictionary.new_dictionary(test_fn, UNPROVIDED);
        final SubLObject temp_dir = $default_test_file_hash_table_tmpdir$.getDynamicValue(thread);
        final SubLObject filename = file_utilities.make_temp_filename(temp_dir);
        SubLObject outcome = $SUCCESS;
        try {
            SubLObject cdolist_list_var = pairs;
            SubLObject pair = NIL;
            pair = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = pair;
                SubLObject key = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list18);
                key = current.first();
                current = value = current.rest();
                map_utilities.map_put(map, key, value);
                cdolist_list_var = cdolist_list_var.rest();
                pair = cdolist_list_var.first();
            } 
            if (write_style.eql($SLOW)) {
                write_map_to_file_hash_table_slow(map, filename, serialization_fn);
            } else
                if (write_style.eql($FAST)) {
                    write_map_to_file_hash_table(map, filename, serialization_fn, temp_dir);
                } else {
                    Errors.error($str21$Unknown_write_style__A_, write_style);
                }

            final SubLObject results = compare_map_to_file_hash_table(map, filename, value_test_fn, serialization_fn);
            final SubLObject current2;
            final SubLObject datum2 = current2 = results;
            SubLObject allow_other_keys_p = NIL;
            SubLObject rest = current2;
            SubLObject bad = NIL;
            SubLObject current_$3 = NIL;
            while (NIL != rest) {
                destructuring_bind_must_consp(rest, datum2, $list22);
                current_$3 = rest.first();
                rest = rest.rest();
                destructuring_bind_must_consp(rest, datum2, $list22);
                if (NIL == member(current_$3, $list23, UNPROVIDED, UNPROVIDED)) {
                    bad = T;
                }
                if (current_$3 == $ALLOW_OTHER_KEYS) {
                    allow_other_keys_p = rest.first();
                }
                rest = rest.rest();
            } 
            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                cdestructuring_bind_error(datum2, $list22);
            }
            final SubLObject map_only_tail = property_list_member($MAP_ONLY, current2);
            final SubLObject map_only = (NIL != map_only_tail) ? cadr(map_only_tail) : NIL;
            final SubLObject fht_only_tail = property_list_member($FHT_ONLY, current2);
            final SubLObject fht_only = (NIL != fht_only_tail) ? cadr(fht_only_tail) : NIL;
            final SubLObject values_differ_tail = property_list_member($VALUES_DIFFER, current2);
            final SubLObject values_differ = (NIL != values_differ_tail) ? cadr(values_differ_tail) : NIL;
            if (((NIL != values_differ) || (NIL != fht_only)) || (NIL != map_only)) {
                outcome = results;
            }
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                SubLObject ignore_errors_tag = NIL;
                try {
                    thread.throwStack.push($IGNORE_ERRORS_TARGET);
                    final SubLObject _prev_bind_0_$4 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                        try {
                            Filesys.delete_file(filename);
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$4, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                    thread.throwStack.pop();
                } finally {
                    thread.throwStack.pop();
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return outcome;
    }

    public static SubLObject declare_file_hash_table_utilities_file() {
        declareFunction("write_map_to_file_hash_table", "WRITE-MAP-TO-FILE-HASH-TABLE", 2, 2, false);
        declareFunction("write_map_to_file_hash_table_slow", "WRITE-MAP-TO-FILE-HASH-TABLE-SLOW", 2, 1, false);
        declareFunction("compare_map_to_file_hash_table", "COMPARE-MAP-TO-FILE-HASH-TABLE", 3, 1, false);
        declareFunction("test_file_hash_table_retrieval", "TEST-FILE-HASH-TABLE-RETRIEVAL", 5, 0, false);
        return NIL;
    }

    public static SubLObject init_file_hash_table_utilities_file() {
        defparameter("*DEFAULT-TEST-FILE-HASH-TABLE-TMPDIR*", file_utilities.temp_directory());
        return NIL;
    }

    public static final SubLObject setup_file_hash_table_utilities_file_alt() {
        define_test_case_table_int(TEST_FILE_HASH_TABLE_RETRIEVAL, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt17);
        return NIL;
    }

    public static SubLObject setup_file_hash_table_utilities_file() {
        if (SubLFiles.USE_V1) {
            define_test_case_table_int(TEST_FILE_HASH_TABLE_RETRIEVAL, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list16);
        }
        if (SubLFiles.USE_V2) {
            define_test_case_table_int(TEST_FILE_HASH_TABLE_RETRIEVAL, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt17);
        }
        return NIL;
    }

    public static SubLObject setup_file_hash_table_utilities_file_Previous() {
        define_test_case_table_int(TEST_FILE_HASH_TABLE_RETRIEVAL, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list16);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_file_hash_table_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_file_hash_table_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_file_hash_table_utilities_file();
    }

    static {
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeSymbol("KEY"), makeSymbol("VALUES"));

    static private final SubLString $str_alt3$Checking_the_map_against_the_FHT_ = makeString("Checking the map against the FHT ....");

    static private final SubLString $str_alt5$Given_size_mismatch__check_for_ex = makeString("Given size mismatch, check for extra keys ...");

    static private final SubLString $$$rck = makeString("rck");

    static private final SubLList $list_alt17 = list(list(list(list(cons(makeString("bd5880ee-9c29-11b1-9dad-c379636f7270"), ZERO_INTEGER), cons(makeString("bd588052-9c29-11b1-9dad-c379636f7270"), ONE_INTEGER), cons(makeString("bd588044-9c29-11b1-9dad-c379636f7270"), TWO_INTEGER), cons(makeString("bd58810e-9c29-11b1-9dad-c379636f7270"), THREE_INTEGER)), EQUAL, makeKeyword("IMAGE-DEPENDENT-CFASL"), $SLOW, makeSymbol("=")), makeKeyword("SUCCESS")));

    static private final SubLList $list_alt19 = cons(makeSymbol("KEY"), makeSymbol("VALUE"));

    static private final SubLString $str_alt22$Unknown_write_style__A_ = makeString("Unknown write style ~A.");

    static private final SubLList $list_alt23 = list(makeSymbol("&KEY"), makeSymbol("MAP-ONLY"), makeSymbol("FHT-ONLY"), makeSymbol("VALUES-DIFFER"));

    static private final SubLList $list_alt24 = list(makeKeyword("MAP-ONLY"), makeKeyword("FHT-ONLY"), makeKeyword("VALUES-DIFFER"));
}

/**
 * Total time: 273 ms
 */
