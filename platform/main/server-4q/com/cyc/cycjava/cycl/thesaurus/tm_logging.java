/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.thesaurus;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.time_has_arrivedP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.misc_kb_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      TM-LOGGING
 *  source file: /cyc/top/cycl/thesaurus/tm-logging.lisp
 *  created:     2019/07/03 17:38:29
 */
public final class tm_logging extends SubLTranslatedFile implements V02 {
    // // Constructor
    private tm_logging() {
    }

    public static final SubLFile me = new tm_logging();


    // // Definitions
    /**
     * A list of keywords, indicating the result types of operations
     * that are currently being logged.  If we are not logging
     * any operations, then the list is empty.  (:ok :warning :error) means
     * that we are logging all operations attempted, even those
     * which generate warnings or fi errors.
     */
    // defparameter
    public static final SubLSymbol $tm_op_result_types_to_log$ = makeSymbol("*TM-OP-RESULT-TYPES-TO-LOG*");

    /**
     * How many operation results to queue up before
     * writing them out to the log file.
     */
    // defparameter
    private static final SubLSymbol $tm_op_log_worry_size$ = makeSymbol("*TM-OP-LOG-WORRY-SIZE*");

    // defparameter
    private static final SubLSymbol $tm_op_log_save_quantum$ = makeSymbol("*TM-OP-LOG-SAVE-QUANTUM*");

    // defparameter
    private static final SubLSymbol $tm_op_log_next_save_time$ = makeSymbol("*TM-OP-LOG-NEXT-SAVE-TIME*");

    // defparameter
    private static final SubLSymbol $tm_op_log_queue$ = makeSymbol("*TM-OP-LOG-QUEUE*");

    // defparameter
    private static final SubLSymbol $tm_op_log_identifier$ = makeSymbol("*TM-OP-LOG-IDENTIFIER*");

    // defparameter
    private static final SubLSymbol $tm_op_log_filename_extension$ = makeSymbol("*TM-OP-LOG-FILENAME-EXTENSION*");

    // defparameter
    private static final SubLSymbol $tm_op_log_pathname$ = makeSymbol("*TM-OP-LOG-PATHNAME*");

    // defparameter
    private static final SubLSymbol $tm_op_log_version$ = makeSymbol("*TM-OP-LOG-VERSION*");

    // defparameter
    private static final SubLSymbol $tm_op_log_max_filesize$ = makeSymbol("*TM-OP-LOG-MAX-FILESIZE*");



    /**
     * A file in which each line consists of a thesaurus id followed by
     * one thesaurus name.  This file is used to keep track of all the thesauri
     * names ever used for logging operations.
     */
    // defparameter
    private static final SubLSymbol $thesaurus_name_filename$ = makeSymbol("*THESAURUS-NAME-FILENAME*");

    /**
     * The complete pathname for the file containing thesaurus id - name
     * information.
     */
    // defparameter
    private static final SubLSymbol $thesaurus_name_file_pathname$ = makeSymbol("*THESAURUS-NAME-FILE-PATHNAME*");

    /**
     * Used for output in some report generating functions.
     */
    // defconstant
    private static final SubLSymbol $tm_user_print_label$ = makeSymbol("*TM-USER-PRINT-LABEL*");

    /**
     * never set only bind.  For use in tmap report generating
     * functions.
     */
    // defvar
    private static final SubLSymbol $tmap_stats_start_month$ = makeSymbol("*TMAP-STATS-START-MONTH*");

    /**
     * never set only bind.  For use in tmap report generating
     * functions.
     */
    // defvar
    private static final SubLSymbol $tmap_stats_end_month$ = makeSymbol("*TMAP-STATS-END-MONTH*");

    /**
     * Versions:
     * :INT = use internal ids to identify thesauri in log files
     * :GUID = use GUID strings
     * :HL = use HL external ID strings
     */
    // defparameter
    private static final SubLSymbol $tm_log_id_version$ = makeSymbol("*TM-LOG-ID-VERSION*");

    /**
     *
     *
     * @unknown because CRTL for tm release errors on (guid-string-p <integer>).
     */
    public static final SubLObject tm_guid_string_p(SubLObject v_object) {
        if (v_object.isString()) {
            return Guids.guid_string_p(v_object);
        }
        return NIL;
    }

    public static final SubLObject tm_log_id(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = $tm_log_id_version$.getDynamicValue(thread);
                if (pcase_var.eql($INT)) {
                    return misc_kb_utilities.get_term_id(fort);
                } else
                    if (pcase_var.eql($GUID)) {
                        return Guids.guid_to_string(constants_high.constant_guid(fort));
                    } else
                        if (pcase_var.eql($HL)) {
                            return kb_utilities.hl_external_id_string(fort);
                        } else {
                            Errors.error($str_alt11$Unknown_type__A_for__tm_log_id_ve, $tm_log_id_version$.getDynamicValue(thread));
                        }


            }
            return NIL;
        }
    }

    public static final SubLObject tm_find_term_by_log_id(SubLObject id, SubLObject strictP) {
        if (strictP == UNPROVIDED) {
            strictP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject fort = NIL;
                SubLObject pcase_var = $tm_log_id_version$.getDynamicValue(thread);
                if (pcase_var.eql($INT)) {
                    fort = (id.isInteger()) ? ((SubLObject) (constants_high.find_constant_by_internal_id(id))) : NIL;
                } else
                    if (pcase_var.eql($GUID)) {
                        fort = (NIL != tm_guid_string_p(id)) ? ((SubLObject) (constants_high.find_constant_by_guid(Guids.string_to_guid(id)))) : NIL;
                    } else
                        if (pcase_var.eql($HL)) {
                            fort = (NIL != kb_utilities.hl_external_id_string_p(id)) ? ((SubLObject) (kb_utilities.find_object_by_hl_external_id_string(id))) : NIL;
                        } else {
                            Errors.error($str_alt11$Unknown_type__A_for__tm_log_id_ve, $tm_log_id_version$.getDynamicValue(thread));
                        }


                if ((NIL != strictP) || (NIL != fort)) {
                    return fort;
                } else
                    if (id.isInteger()) {
                        return constants_high.find_constant_by_internal_id(id);
                    } else
                        if (NIL != tm_guid_string_p(id)) {
                            return constants_high.find_constant_by_guid(Guids.string_to_guid(id));
                        } else
                            if (NIL != kb_utilities.hl_external_id_string_p(id)) {
                                return kb_utilities.find_object_by_hl_external_id_string(id);
                            } else {
                                return NIL;
                            }



            }
        }
    }

    public static final SubLObject tm_log_id_p(SubLObject id, SubLObject strictP) {
        if (strictP == UNPROVIDED) {
            strictP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject pcase_var = $tm_log_id_version$.getDynamicValue(thread);
                if (pcase_var.eql($INT)) {
                    result = integerp(id);
                } else
                    if (pcase_var.eql($GUID)) {
                        result = tm_guid_string_p(id);
                    } else
                        if (pcase_var.eql($HL)) {
                            result = kb_utilities.hl_external_id_string_p(id);
                        } else {
                            Errors.error($str_alt11$Unknown_type__A_for__tm_log_id_ve, $tm_log_id_version$.getDynamicValue(thread));
                        }


                if ((NIL != strictP) || (NIL != result)) {
                    return result;
                } else {
                    return makeBoolean((id.isInteger() || (NIL != tm_guid_string_p(id))) || (NIL != kb_utilities.hl_external_id_string_p(id)));
                }
            }
        }
    }

    public static final SubLObject init_tm_op_log_thesaurus_table() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($tm_op_log_thesaurus_table$.getDynamicValue(thread).isHashtable()) {
                clrhash($tm_op_log_thesaurus_table$.getDynamicValue(thread));
            } else {
                $tm_op_log_thesaurus_table$.setDynamicValue(make_hash_table($int$50, symbol_function(EQUALP), UNPROVIDED), thread);
            }
            set_thesaurus_name_file_pathname(UNPROVIDED);
            return NIL;
        }
    }

    public static final SubLObject save_thesaurus_name_file() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text($thesaurus_name_file_pathname$.getDynamicValue(thread), $OUTPUT, NIL);
                    if (!stream.isStream()) {
                        Errors.error($str_alt14$Unable_to_open__S, $thesaurus_name_file_pathname$.getDynamicValue(thread));
                    }
                    {
                        SubLObject stream_1 = stream;
                        if ($tm_op_log_thesaurus_table$.getDynamicValue(thread).isHashtable() && hash_table_count($tm_op_log_thesaurus_table$.getDynamicValue(thread)).numG(ZERO_INTEGER)) {
                            {
                                SubLObject cdohash_table = $tm_op_log_thesaurus_table$.getDynamicValue(thread);
                                SubLObject key = NIL;
                                SubLObject val = NIL;
                                {
                                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                                    try {
                                        while (iteratorHasNext(cdohash_iterator)) {
                                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                            key = getEntryKey(cdohash_entry);
                                            val = getEntryValue(cdohash_entry);
                                            {
                                                SubLObject cdolist_list_var = val;
                                                SubLObject v = NIL;
                                                for (v = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v = cdolist_list_var.first()) {
                                                    if ((NIL != tm_log_id_p(key, UNPROVIDED)) && (NIL != string_utilities.non_empty_stringP(v))) {
                                                        format(stream_1, $str_alt15$__s__s___, key, v);
                                                    }
                                                }
                                            }
                                        } 
                                    } finally {
                                        releaseEntrySetIterator(cdohash_iterator);
                                    }
                                }
                            }
                        } else {
                            {
                                SubLObject cdolist_list_var = tm_internals.browsable_thesauri(tm_datastructures.$tm_user$.getDynamicValue(thread), UNPROVIDED);
                                SubLObject mt = NIL;
                                for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt = cdolist_list_var.first()) {
                                    {
                                        SubLObject id = tm_log_id(mt);
                                        SubLObject name = tm_internals.thesaurus_name(mt);
                                        if ((NIL != tm_log_id_p(id, UNPROVIDED)) && (NIL != string_utilities.non_empty_stringP(name))) {
                                            format(stream_1, $str_alt15$__s__s___, id, name);
                                        }
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
            }
            return NIL;
        }
    }

    public static final SubLObject get_logged_thesaurus_names(SubLObject id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject names = gethash(id, $tm_op_log_thesaurus_table$.getDynamicValue(thread), UNPROVIDED);
                SubLObject first_name = names.first();
                SubLObject string = $str_alt16$;
                if (NIL != names) {
                    if (length(names).numE(ONE_INTEGER)) {
                        string = names.first();
                    } else {
                        {
                            SubLObject cdolist_list_var = names;
                            SubLObject n = NIL;
                            for (n = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , n = cdolist_list_var.first()) {
                                if (n.equalp(first_name)) {
                                    string = cconcatenate(string, n);
                                } else {
                                    string = cconcatenate(string, new SubLObject[]{ $str_alt17$_, n });
                                }
                            }
                        }
                    }
                }
                return string;
            }
        }
    }

    public static final SubLObject thesaurus_name_list_char_p(SubLObject ch) {
        return makeBoolean(ch != CHAR_slash);
    }

    public static final SubLObject explode_thesaurus_name_sequence(SubLObject string) {
        return string_utilities.break_words(string, symbol_function(THESAURUS_NAME_LIST_CHAR_P), T);
    }

    public static final SubLObject get_logged_thesaurus_id(SubLObject name_list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject done = NIL;
                if ($tm_op_log_thesaurus_table$.getDynamicValue(thread).isHashtable() && hash_table_count($tm_op_log_thesaurus_table$.getDynamicValue(thread)).numG(ZERO_INTEGER)) {
                    if (NIL == done) {
                        {
                            SubLObject catch_var = NIL;
                            try {
                                {
                                    SubLObject cdohash_table = $tm_op_log_thesaurus_table$.getDynamicValue(thread);
                                    SubLObject key = NIL;
                                    SubLObject val = NIL;
                                    {
                                        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                                        try {
                                            while (iteratorHasNext(cdohash_iterator)) {
                                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                                key = getEntryKey(cdohash_entry);
                                                val = getEntryValue(cdohash_entry);
                                                subl_macros.do_hash_table_done_check(done);
                                                if (NIL != list_utilities.sets_equalP(val, name_list, symbol_function(EQUALP))) {
                                                    ans = key;
                                                    done = T;
                                                }
                                            } 
                                        } finally {
                                            releaseEntrySetIterator(cdohash_iterator);
                                        }
                                    }
                                }
                            } catch (Throwable ccatch_env_var) {
                                catch_var = Errors.handleThrowable(ccatch_env_var, $DO_HASH_TABLE);
                            }
                        }
                    }
                }
                return ans;
            }
        }
    }

    public static final SubLObject get_logged_thesauri_ids() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject cdohash_table = $tm_op_log_thesaurus_table$.getDynamicValue(thread);
                SubLObject key = NIL;
                SubLObject val = NIL;
                {
                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            key = getEntryKey(cdohash_entry);
                            val = getEntryValue(cdohash_entry);
                            if (NIL != tm_log_id_p(key, UNPROVIDED)) {
                                ans = cons(key, ans);
                            }
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
                return ans;
            }
        }
    }

    public static final SubLObject fill_tm_op_log_thesaurus_table() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            init_tm_op_log_thesaurus_table();
            if (NIL != Filesys.probe_file($thesaurus_name_file_pathname$.getDynamicValue(thread))) {
                {
                    SubLObject stream = NIL;
                    try {
                        stream = compatibility.open_text($thesaurus_name_file_pathname$.getDynamicValue(thread), $INPUT, NIL);
                        if (!stream.isStream()) {
                            Errors.error($str_alt14$Unable_to_open__S, $thesaurus_name_file_pathname$.getDynamicValue(thread));
                        }
                        {
                            SubLObject stream_2 = stream;
                            SubLObject form = NIL;
                            for (form = read_ignoring_errors(stream_2, NIL, UNPROVIDED); form != $EOF; form = read_ignoring_errors(stream_2, NIL, UNPROVIDED)) {
                                {
                                    SubLObject id = form.first();
                                    SubLObject name = second(form);
                                    if ((NIL != tm_log_id_p(id, UNPROVIDED)) && (NIL != string_utilities.non_empty_stringP(name))) {
                                        {
                                            SubLObject old = gethash(id, $tm_op_log_thesaurus_table$.getDynamicValue(thread), UNPROVIDED);
                                            SubLObject v_new = adjoin(name, old, symbol_function(EQUALP), UNPROVIDED);
                                            v_new = Sort.sort(v_new, symbol_function(STRING_LESSP), UNPROVIDED);
                                            sethash(id, $tm_op_log_thesaurus_table$.getDynamicValue(thread), v_new);
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
                }
            }
            {
                SubLObject cdolist_list_var = tm_internals.browsable_thesauri(tm_datastructures.$tm_user$.getDynamicValue(thread), UNPROVIDED);
                SubLObject mt = NIL;
                for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt = cdolist_list_var.first()) {
                    {
                        SubLObject id = tm_log_id(mt);
                        SubLObject name = tm_internals.thesaurus_name(mt);
                        SubLObject old = gethash(id, $tm_op_log_thesaurus_table$.getDynamicValue(thread), UNPROVIDED);
                        SubLObject v_new = adjoin(name, old, symbol_function(EQUALP), UNPROVIDED);
                        v_new = Sort.sort(v_new, symbol_function(STRING_LESSP), UNPROVIDED);
                        sethash(id, $tm_op_log_thesaurus_table$.getDynamicValue(thread), v_new);
                    }
                }
            }
            save_thesaurus_name_file();
            return NIL;
        }
    }

    public static final SubLObject construct_op_log_pathname(SubLObject filename) {
        return format(NIL, $str_alt23$_a_a, tm_datastructures.$tm_report_directory$.getGlobalValue(), filename);
    }

    public static final SubLObject construct_op_log_filename() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == control_vars.cyc_image_id()) {
                control_vars.set_cyc_image_id();
            }
            {
                SubLObject filename = format(NIL, $str_alt24$_a__a__a__a_a, new SubLObject[]{ control_vars.cyc_image_id(), $tm_op_log_identifier$.getDynamicValue(thread), cyc_month(), format(NIL, $str_alt25$_4__0D, $tm_op_log_version$.getDynamicValue(thread)), NIL != string_utilities.non_empty_stringP($tm_op_log_filename_extension$.getDynamicValue(thread)) ? ((SubLObject) (format(NIL, $str_alt26$__a, $tm_op_log_filename_extension$.getDynamicValue(thread)))) : $str_alt16$ });
                return filename;
            }
        }
    }

    public static final SubLObject set_tm_op_log_pathname(SubLObject full_pathname) {
        if (full_pathname == UNPROVIDED) {
            full_pathname = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!$tm_op_log_version$.getDynamicValue(thread).isInteger()) {
                $tm_op_log_version$.setDynamicValue(ZERO_INTEGER, thread);
            }
            if (!$tm_op_log_max_filesize$.getDynamicValue(thread).isInteger()) {
                $tm_op_log_max_filesize$.setDynamicValue($int$100000, thread);
            }
            {
                SubLObject pathname = (full_pathname.isString()) ? ((SubLObject) (full_pathname)) : construct_op_log_pathname(construct_op_log_filename());
                SubLObject size = file_utilities.get_file_length(pathname);
                for (; !size.numL($tm_op_log_max_filesize$.getDynamicValue(thread));) {
                    $tm_op_log_version$.setDynamicValue(add($tm_op_log_version$.getDynamicValue(thread), ONE_INTEGER), thread);
                    pathname = construct_op_log_pathname(construct_op_log_filename());
                    size = file_utilities.get_file_length(pathname);
                }
                $tm_op_log_pathname$.setDynamicValue(pathname, thread);
                return $tm_op_log_pathname$.getDynamicValue(thread);
            }
        }
    }

    public static final SubLObject set_thesaurus_name_file_pathname(SubLObject full_pathname) {
        if (full_pathname == UNPROVIDED) {
            full_pathname = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pathname = (NIL != string_utilities.non_empty_stringP(full_pathname)) ? ((SubLObject) (full_pathname)) : construct_op_log_pathname($thesaurus_name_filename$.getDynamicValue(thread));
                $thesaurus_name_file_pathname$.setDynamicValue(pathname, thread);
                return $thesaurus_name_file_pathname$.getDynamicValue(thread);
            }
        }
    }

    public static final SubLObject tm_mt_token_list(SubLObject mt) {
        {
            SubLObject token = NIL;
            if (NIL != tm_internals.thesaurusP(mt)) {
                token = tm_log_id(mt);
            }
            if (NIL == string_utilities.non_empty_stringP(token)) {
                if (mt == tm_datastructures.$tm_mt$.getGlobalValue()) {
                    token = $ADMIN;
                }
            }
            if (NIL == token) {
                token = $UNKNOWN;
            }
            return list(token);
        }
    }

    /**
     * OPERATION can be a tm-op structure, in which case the value of
     * its tm-op-english slot is used to construct log-string, else
     * OPERATION is a string, in which case it is used to construct
     * log-string.  This kludginess makes it possible for this
     * function to handle logging both tm-ops and other types of
     * editing operations. RESULT is a keyword indicating the status
     * of the operation ... usually :OK.
     * If a consp mt-token-list is passed in, use it, else compute
     * the mt token list.
     */
    public static final SubLObject tm_enqueue_op_for_log(SubLObject operation, SubLObject result, SubLObject operation_mt, SubLObject mt_token_list) {
        if (operation_mt == UNPROVIDED) {
            operation_mt = NIL;
        }
        if (mt_token_list == UNPROVIDED) {
            mt_token_list = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject user = (NIL != string_utilities.non_empty_stringP(tm_datastructures.$tm_user$.getDynamicValue(thread))) ? ((SubLObject) (tm_datastructures.$tm_user$.getDynamicValue(thread))) : $$$UNKNOWN;
                SubLObject log_string = NIL;
                if ((NIL != tm_datastructures.tm_op_p(operation)) && (NIL != tm_datastructures.tm_op_hiddenP(operation))) {
                    return NIL;
                } else
                    if ((NIL != tm_datastructures.tm_op_p(operation)) && (NIL != find(result, $tm_op_result_types_to_log$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                        {
                            SubLObject english = tm_datastructures.tm_op_english(operation);
                            SubLObject mt = tm_datastructures.tm_op_thesaurus(operation);
                            SubLObject opcode = tm_datastructures.tm_op_opcode(operation);
                            SubLObject relation = tm_datastructures.tm_op_relation(operation);
                            SubLObject op_thes = second(tm_datastructures.tm_op_args(operation));
                            SubLObject thes_to_log = ((opcode == $ADD) && (relation == $$topInThesaurus)) ? ((SubLObject) (tm_mt_token_list(op_thes))) : mt_token_list.isCons() ? ((SubLObject) (mt_token_list)) : tm_mt_token_list(mt);
                            log_string = format(NIL, $str_alt32$__s__s__s__s__s__s__s_, new SubLObject[]{ NIL != english ? ((SubLObject) (english)) : $$$No_English_available, user, result, control_vars.$cyc_image_id$.getDynamicValue(thread), cyc_date(), cyc_time(), thes_to_log });
                        }
                    } else
                        if (operation.isString()) {
                            log_string = format(NIL, $str_alt32$__s__s__s__s__s__s__s_, new SubLObject[]{ operation, user, result, control_vars.$cyc_image_id$.getDynamicValue(thread), cyc_date(), cyc_time(), mt_token_list.isCons() ? ((SubLObject) (mt_token_list)) : tm_mt_token_list(operation_mt) });
                        } else {
                            log_string = format(NIL, $str_alt32$__s__s__s__s__s__s__s_, new SubLObject[]{ $str_alt34$Bad_operation__No_English_availab, user, result, control_vars.$cyc_image_id$.getDynamicValue(thread), cyc_date(), cyc_time(), mt_token_list.isCons() ? ((SubLObject) (mt_token_list)) : tm_mt_token_list(operation_mt) });
                        }


                if (log_string.isString()) {
                    queues.enqueue(log_string, $tm_op_log_queue$.getDynamicValue(thread));
                }
            }
            return NIL;
        }
    }

    public static final SubLObject log_tm_opsP() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject size = queues.queue_size($tm_op_log_queue$.getDynamicValue(thread));
                SubLObject v_boolean = NIL;
                if (NIL != $tm_op_result_types_to_log$.getDynamicValue(thread)) {
                    v_boolean = makeBoolean(size.numG($tm_op_log_worry_size$.getDynamicValue(thread)) || (size.numG(ZERO_INTEGER) && (NIL != time_has_arrivedP($tm_op_log_next_save_time$.getDynamicValue(thread)))));
                }
                return v_boolean;
            }
        }
    }

    public static final SubLObject tm_save_ops_to_log() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            set_tm_op_log_pathname(UNPROVIDED);
            {
                SubLObject size = queues.queue_size($tm_op_log_queue$.getDynamicValue(thread));
                SubLObject something_writtenP = NIL;
                if ($tm_op_log_pathname$.getDynamicValue(thread).isString() && size.numG(ZERO_INTEGER)) {
                    {
                        SubLObject stream = NIL;
                        try {
                            stream = compatibility.open_text($tm_op_log_pathname$.getDynamicValue(thread), $APPEND, NIL);
                            if (!stream.isStream()) {
                                Errors.error($str_alt14$Unable_to_open__S, $tm_op_log_pathname$.getDynamicValue(thread));
                            }
                            {
                                SubLObject stream_3 = stream;
                                SubLObject cdotimes_end_var = queues.queue_size($tm_op_log_queue$.getDynamicValue(thread));
                                SubLObject i = NIL;
                                for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                                    {
                                        SubLObject op_description = queues.dequeue($tm_op_log_queue$.getDynamicValue(thread));
                                        if (NIL != op_description) {
                                            format(stream_3, $str_alt36$_a__, op_description);
                                            something_writtenP = T;
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
                return something_writtenP;
            }
        }
    }

    public static final SubLObject non_hyphen_charP(SubLObject ch) {
        return makeBoolean(ch != CHAR_hyphen);
    }

    public static final SubLObject non_semi_colon_charP(SubLObject ch) {
        return makeBoolean(ch != CHAR_semicolon);
    }

    public static final SubLObject log_thesaurus_ops() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            tm_save_ops_to_log();
            $tm_op_log_next_save_time$.setDynamicValue(numeric_date_utilities.time_from_now($tm_op_log_save_quantum$.getDynamicValue(thread)), thread);
            return NIL;
        }
    }

    public static final SubLObject convert_ops_log_file(SubLObject filename, SubLObject report_directory) {
        if (report_directory == UNPROVIDED) {
            report_directory = tm_datastructures.$tm_report_directory$.getGlobalValue();
        }
        {
            SubLObject strings = string_utilities.break_words(filename, symbol_function($sym37$NON_HYPHEN_CHAR_), UNPROVIDED);
            SubLObject image_id = string_utilities.string_subst($str_alt16$, $str_alt38$_ops_0000_log, filename, UNPROVIDED);
            SubLObject image_timestring = last(butlast(strings, TWO_INTEGER), UNPROVIDED).first();
            SubLObject cyc_month_string = subseq(image_timestring, ZERO_INTEGER, SIX_INTEGER);
            SubLObject substring = cconcatenate($str_alt39$_ops_, cyc_month_string);
            SubLObject new_filename = string_utilities.string_subst(substring, $str_alt40$_ops, filename, UNPROVIDED);
            SubLObject infile = cconcatenate(report_directory, filename);
            SubLObject outfile = cconcatenate(report_directory, new_filename);
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(outfile, $OUTPUT, NIL);
                if (!stream.isStream()) {
                    Errors.error($str_alt14$Unable_to_open__S, outfile);
                }
                {
                    SubLObject out = stream;
                    SubLObject stream_4 = NIL;
                    try {
                        stream_4 = compatibility.open_text(infile, $INPUT, NIL);
                        if (!stream_4.isStream()) {
                            Errors.error($str_alt14$Unable_to_open__S, infile);
                        }
                        {
                            SubLObject in = stream_4;
                            SubLObject line = NIL;
                            for (line = read_line(in, NIL, UNPROVIDED, UNPROVIDED); !((line == $EOF) || (NIL == line)); line = read_line(in, NIL, UNPROVIDED, UNPROVIDED)) {
                                {
                                    SubLObject ss = string_utilities.break_words(line, symbol_function($sym41$NON_SEMI_COLON_CHAR_), UNPROVIDED);
                                    SubLObject description = string_utilities.trim_sides(ss.first(), UNPROVIDED);
                                    SubLObject user = string_utilities.trim_sides(second(ss), UNPROVIDED);
                                    SubLObject timestamp = string_utilities.trim_sides(third(ss), UNPROVIDED);
                                    SubLObject status = read_from_string_ignoring_errors(format(NIL, $str_alt42$__a, string_utilities.trim_sides(string_utilities.trim_sides(fourth(ss), UNPROVIDED), CHAR_period)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    SubLObject time_fragments = string_utilities.break_words(timestamp, symbol_function(DIGIT_CHAR_P), UNPROVIDED);
                                    SubLObject cyc_date = read_from_string_ignoring_errors(cconcatenate(third(time_fragments), new SubLObject[]{ time_fragments.first(), second(time_fragments) }), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    SubLObject cyc_time = read_from_string_ignoring_errors(cconcatenate(fourth(time_fragments), new SubLObject[]{ fifth(time_fragments), sixth(time_fragments) }), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    format(out, $str_alt44$__s__s__s__s__s__s___, new SubLObject[]{ description, user, status, image_id, cyc_date, cyc_time });
                                }
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                if (stream_4.isStream()) {
                                    close(stream_4, UNPROVIDED);
                                }
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                }
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        if (stream.isStream()) {
                            close(stream, UNPROVIDED);
                        }
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return outfile;
        }
    }

    public static final SubLObject convert_ops_log_files(SubLObject report_directory) {
        if (report_directory == UNPROVIDED) {
            report_directory = tm_datastructures.$tm_report_directory$.getGlobalValue();
        }
        {
            SubLObject filenames = get_log_filenames($OP_LOG, report_directory);
            SubLObject cdolist_list_var = filenames;
            SubLObject name = NIL;
            for (name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , name = cdolist_list_var.first()) {
                if (NIL != string_utilities.substringP($str_alt38$_ops_0000_log, name, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    convert_ops_log_file(name, report_directory);
                }
            }
        }
        return NIL;
    }

    // defparameter
    private static final SubLSymbol $tm_ops_log_dispatch_table$ = makeSymbol("*TM-OPS-LOG-DISPATCH-TABLE*");

    /**
     * Returns a list of the values stored in *tm-ops-log-dispatch-table*
     * where each element is of the form (<sort-method-key> . <table-building-procedure>)
     */
    public static final SubLObject get_ops_log_dispatch_table_value() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $tm_ops_log_dispatch_table$.getDynamicValue(thread);
        }
    }

    public static final SubLObject clear_ops_log_tables() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject table_1 = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $UTILITY_TABLE_1);
                SubLObject table_2 = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $UTILITY_TABLE_2);
                if (table_1.isHashtable()) {
                    clrhash(table_1);
                } else {
                    tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $UTILITY_TABLE_1, make_hash_table($int$100, symbol_function(EQUAL), UNPROVIDED), UNPROVIDED);
                }
                if (table_2.isHashtable()) {
                    clrhash(table_2);
                } else {
                    tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $UTILITY_TABLE_2, make_hash_table($int$100, symbol_function(EQUAL), UNPROVIDED), UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject update_ops_user_date_table(SubLObject user_table, SubLObject form, SubLObject start_date, SubLObject end_date) {
        {
            SubLObject string = second(form);
            SubLObject user = (string.isString()) ? ((SubLObject) (string)) : $$$UNKNOWN;
            SubLObject cyc_date = fifth(form);
            SubLObject date_table = gethash(user, user_table, UNPROVIDED);
            SubLObject updateP = NIL;
            if (!date_table.isHashtable()) {
                date_table = make_hash_table($int$50, UNPROVIDED, UNPROVIDED);
            }
            if (cyc_date.numGE(start_date) && cyc_date.numLE(end_date)) {
                {
                    SubLObject val = gethash(cyc_date, date_table, UNPROVIDED);
                    val = cons(form, val);
                    sethash(cyc_date, date_table, val);
                    sethash(user, user_table, date_table);
                    updateP = T;
                }
            }
            return updateP;
        }
    }

    public static final SubLObject update_ops_date_user_table(SubLObject date_table, SubLObject form, SubLObject start_date, SubLObject end_date) {
        {
            SubLObject string = second(form);
            SubLObject user = (string.isString()) ? ((SubLObject) (string)) : $$$UNKNOWN;
            SubLObject cyc_date = fifth(form);
            SubLObject user_table = gethash(cyc_date, date_table, UNPROVIDED);
            SubLObject updateP = NIL;
            if (!user_table.isHashtable()) {
                user_table = make_hash_table($int$50, symbol_function(EQUALP), UNPROVIDED);
            }
            if (cyc_date.numGE(start_date) && cyc_date.numLE(end_date)) {
                {
                    SubLObject val = gethash(user, user_table, UNPROVIDED);
                    val = cons(form, val);
                    sethash(user, user_table, val);
                    sethash(cyc_date, date_table, user_table);
                    updateP = T;
                }
            }
            return updateP;
        }
    }

    public static final SubLObject update_ops_date_time_table(SubLObject date_table, SubLObject form, SubLObject start_date, SubLObject end_date) {
        {
            SubLObject cyc_date = fifth(form);
            SubLObject updateP = NIL;
            if (cyc_date.numGE(start_date) && cyc_date.numLE(end_date)) {
                {
                    SubLObject val = gethash(cyc_date, date_table, UNPROVIDED);
                    val = cons(form, val);
                    sethash(cyc_date, date_table, val);
                    updateP = T;
                }
            }
            return updateP;
        }
    }

    public static final SubLObject tm_process_ops_log_file(SubLObject filename, SubLObject function, SubLObject table, SubLObject start_date, SubLObject end_date, SubLObject thesauri_ids, SubLObject optype) {
        {
            SubLObject pathname = construct_op_log_pathname(filename);
            if (NIL != Filesys.probe_file(pathname)) {
                {
                    SubLObject stream = NIL;
                    try {
                        stream = compatibility.open_text(pathname, $INPUT, NIL);
                        if (!stream.isStream()) {
                            Errors.error($str_alt14$Unable_to_open__S, pathname);
                        }
                        {
                            SubLObject stream_5 = stream;
                            SubLObject form = NIL;
                            for (form = read_ignoring_errors(stream_5, NIL, $EOF); form != $EOF; form = read_ignoring_errors(stream_5, NIL, $EOF)) {
                                if (form.isCons() && (NIL != list_utilities.lengthE(form, SEVEN_INTEGER, UNPROVIDED))) {
                                    {
                                        SubLObject form_thesauri_ids = seventh(form);
                                        SubLObject adminP = find($ADMIN, form_thesauri_ids, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        if ((((NIL == thesauri_ids) || (NIL != find($str_alt50$_ALL_, thesauri_ids, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED))) || (NIL != intersection(thesauri_ids, form_thesauri_ids, symbol_function(EQUALP), UNPROVIDED))) && ((optype.equalp($str_alt51$admin_and_ordinary) || ((NIL != adminP) && optype.equalp($str_alt52$admin_only))) || ((NIL == adminP) && optype.equalp($str_alt53$ordinary_only)))) {
                                            funcall(function, table, form, start_date, end_date);
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                if (stream.isStream()) {
                                    close(stream, UNPROVIDED);
                                }
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject tm_process_ops_log_files(SubLObject start_date, SubLObject end_date, SubLObject sort_key, SubLObject thesauri_ids, SubLObject optype, SubLObject directory) {
        if (directory == UNPROVIDED) {
            directory = tm_datastructures.$tm_report_directory$.getGlobalValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            clear_ops_log_tables();
            {
                SubLObject files_in_directory = get_log_filenames($OP_LOG, directory);
                SubLObject function = second(assoc(sort_key, $tm_ops_log_dispatch_table$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
                SubLObject table = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $UTILITY_TABLE_1);
                SubLObject start_month = integerDivide(start_date, $int$100);
                SubLObject end_month = integerDivide(end_date, $int$100);
                SubLObject files_to_use = NIL;
                {
                    SubLObject cdolist_list_var = files_in_directory;
                    SubLObject f = NIL;
                    for (f = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , f = cdolist_list_var.first()) {
                        {
                            SubLObject strings = string_utilities.break_words(f, symbol_function($sym37$NON_HYPHEN_CHAR_), UNPROVIDED);
                            SubLObject month_string = second(reverse(strings));
                            SubLObject some_non_digitsP = NIL;
                            SubLObject month_int = NIL;
                            if (NIL != string_utilities.non_empty_stringP(month_string)) {
                                {
                                    SubLObject cdotimes_end_var = length(month_string);
                                    SubLObject i = NIL;
                                    for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                                        if (NIL == digit_char_p(Strings.sublisp_char(month_string, i), UNPROVIDED)) {
                                            some_non_digitsP = T;
                                        }
                                    }
                                }
                                if (NIL == some_non_digitsP) {
                                    month_int = read_from_string_ignoring_errors(month_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                                if ((month_int.isInteger() && month_int.numGE(start_month)) && month_int.numLE(end_month)) {
                                    files_to_use = cons(f, files_to_use);
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = files_to_use;
                    SubLObject f = NIL;
                    for (f = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , f = cdolist_list_var.first()) {
                        tm_process_ops_log_file(f, function, table, start_date, end_date, thesauri_ids, optype);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_count_dtu_ops() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject table1 = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $UTILITY_TABLE_1);
                SubLObject values1 = hash_table_utilities.hash_table_keys(table1);
                SubLObject thecount = ZERO_INTEGER;
                SubLObject cdolist_list_var = values1;
                SubLObject v1 = NIL;
                for (v1 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v1 = cdolist_list_var.first()) {
                    thecount = add(thecount, length(gethash(v1, table1, UNPROVIDED)));
                }
                return thecount;
            }
        }
    }

    public static final SubLObject tm_count_ops(SubLObject sort_key) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (sort_key.equal($DATE_TIME_USER)) {
                return tm_count_dtu_ops();
            }
            {
                SubLObject table1 = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $UTILITY_TABLE_1);
                SubLObject values1 = hash_table_utilities.hash_table_keys(table1);
                SubLObject thecount = ZERO_INTEGER;
                SubLObject cdolist_list_var = values1;
                SubLObject v1 = NIL;
                for (v1 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v1 = cdolist_list_var.first()) {
                    {
                        SubLObject table2 = gethash(v1, table1, UNPROVIDED);
                        SubLObject values2 = hash_table_utilities.hash_table_keys(table2);
                        SubLObject cdolist_list_var_6 = values2;
                        SubLObject v2 = NIL;
                        for (v2 = cdolist_list_var_6.first(); NIL != cdolist_list_var_6; cdolist_list_var_6 = cdolist_list_var_6.rest() , v2 = cdolist_list_var_6.first()) {
                            thecount = add(thecount, length(gethash(v2, table2, UNPROVIDED)));
                        }
                    }
                }
                return thecount;
            }
        }
    }

    // defparameter
    public static final SubLSymbol $tm_log_events$ = makeSymbol("*TM-LOG-EVENTS*");

    /**
     * How many events to queue up before
     * writing them out to the event log file.
     */
    // defparameter
    private static final SubLSymbol $tm_event_log_worry_size$ = makeSymbol("*TM-EVENT-LOG-WORRY-SIZE*");

    // defparameter
    private static final SubLSymbol $tm_event_log_table$ = makeSymbol("*TM-EVENT-LOG-TABLE*");

    // defparameter
    private static final SubLSymbol $tm_event_log_identifier$ = makeSymbol("*TM-EVENT-LOG-IDENTIFIER*");

    // defparameter
    private static final SubLSymbol $tm_event_log_filename_extension$ = makeSymbol("*TM-EVENT-LOG-FILENAME-EXTENSION*");

    // defparameter
    private static final SubLSymbol $tm_event_log_pathname$ = makeSymbol("*TM-EVENT-LOG-PATHNAME*");

    // defparameter
    private static final SubLSymbol $tm_user_report_identifier$ = makeSymbol("*TM-USER-REPORT-IDENTIFIER*");

    // defparameter
    private static final SubLSymbol $tm_user_report_filename_base$ = makeSymbol("*TM-USER-REPORT-FILENAME-BASE*");

    // defparameter
    private static final SubLSymbol $tm_user_report_filename_extension$ = makeSymbol("*TM-USER-REPORT-FILENAME-EXTENSION*");

    // defparameter
    private static final SubLSymbol $tm_thesaurus_report_identifier$ = makeSymbol("*TM-THESAURUS-REPORT-IDENTIFIER*");

    // defparameter
    private static final SubLSymbol $tm_event_log_next_save_time$ = makeSymbol("*TM-EVENT-LOG-NEXT-SAVE-TIME*");

    // defparameter
    private static final SubLSymbol $tm_event_log_version$ = makeSymbol("*TM-EVENT-LOG-VERSION*");

    /**
     * Start a new event log file when the filesize reaches this number
     */
    // defparameter
    private static final SubLSymbol $tm_event_log_max_filesize$ = makeSymbol("*TM-EVENT-LOG-MAX-FILESIZE*");

    // defparameter
    public static final SubLSymbol $tm_password_page_title$ = makeSymbol("*TM-PASSWORD-PAGE-TITLE*");

    public static final SubLObject construct_event_log_pathname(SubLObject filename) {
        return format(NIL, $str_alt23$_a_a, tm_datastructures.$tm_report_directory$.getGlobalValue(), filename);
    }

    public static final SubLObject construct_event_log_filename() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!$tm_event_log_version$.getDynamicValue(thread).isInteger()) {
                $tm_event_log_version$.setDynamicValue(ZERO_INTEGER, thread);
            }
            {
                SubLObject filename = format(NIL, $str_alt59$_a__a__a_a, new SubLObject[]{ control_vars.cyc_image_id(), $tm_event_log_identifier$.getDynamicValue(thread), format(NIL, $str_alt25$_4__0D, $tm_event_log_version$.getDynamicValue(thread)), NIL != string_utilities.non_empty_stringP($tm_event_log_filename_extension$.getDynamicValue(thread)) ? ((SubLObject) (format(NIL, $str_alt26$__a, $tm_event_log_filename_extension$.getDynamicValue(thread)))) : $str_alt16$ });
                return filename;
            }
        }
    }

    public static final SubLObject set_tm_event_log_pathname(SubLObject full_pathname) {
        if (full_pathname == UNPROVIDED) {
            full_pathname = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!$tm_event_log_version$.getDynamicValue(thread).isInteger()) {
                $tm_event_log_version$.setDynamicValue(ZERO_INTEGER, thread);
            }
            if (!$tm_event_log_max_filesize$.getDynamicValue(thread).isInteger()) {
                $tm_event_log_max_filesize$.setDynamicValue($int$500000, thread);
            }
            {
                SubLObject pathname = (full_pathname.isString()) ? ((SubLObject) (full_pathname)) : construct_event_log_pathname(construct_event_log_filename());
                SubLObject size = file_utilities.get_file_length(pathname);
                for (; !size.numL($tm_event_log_max_filesize$.getDynamicValue(thread));) {
                    $tm_event_log_version$.setDynamicValue(add($tm_event_log_version$.getDynamicValue(thread), ONE_INTEGER), thread);
                    pathname = construct_event_log_pathname(construct_event_log_filename());
                    size = file_utilities.get_file_length(pathname);
                }
                $tm_event_log_pathname$.setDynamicValue(pathname, thread);
                return $tm_event_log_pathname$.getDynamicValue(thread);
            }
        }
    }

    public static final SubLObject tm_enqueue_event(SubLObject page) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return tm_update_event_table(tm_datastructures.$tm_user$.getDynamicValue(thread), page, tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI));
        }
    }

    public static final SubLObject tm_update_event_table(SubLObject user, SubLObject page, SubLObject thesauri) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != constant_handles.valid_constantP(user, UNPROVIDED)) || (NIL != string_utilities.non_empty_stringP(user)))) {
                user = $$$UNKNOWN;
            }
            thesauri = remove(NIL, thesauri, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            {
                SubLObject thes_names = (NIL != thesauri) ? ((SubLObject) (Mapping.mapcar(symbol_function(THESAURUS_NAME), thesauri))) : list($$$No_thesauri_selected);
                SubLObject sorted_names = Sort.sort(thes_names, symbol_function(STRING_LESSP), UNPROVIDED);
                SubLObject date = numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED);
                SubLObject login_int = (page.equalp($tm_password_page_title$.getDynamicValue(thread))) ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER;
                if (NIL != $tm_log_events$.getDynamicValue(thread)) {
                    {
                        SubLObject key = list(login_int, user, sorted_names, date);
                        SubLObject val = gethash(key, $tm_event_log_table$.getDynamicValue(thread), UNPROVIDED);
                        val = (val.isInteger()) ? ((SubLObject) (add(val, ONE_INTEGER))) : ONE_INTEGER;
                        sethash(key, $tm_event_log_table$.getDynamicValue(thread), val);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject log_tm_eventsP() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject size = hash_table_count($tm_event_log_table$.getDynamicValue(thread));
                SubLObject v_boolean = NIL;
                if (NIL != $tm_log_events$.getDynamicValue(thread)) {
                    v_boolean = makeBoolean(size.numG($tm_event_log_worry_size$.getDynamicValue(thread)) || (size.numG(ZERO_INTEGER) && (NIL != time_has_arrivedP($tm_event_log_next_save_time$.getDynamicValue(thread)))));
                }
                return v_boolean;
            }
        }
    }

    public static final SubLObject tm_save_events_to_log() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            set_tm_event_log_pathname(UNPROVIDED);
            {
                SubLObject size = hash_table_count($tm_event_log_table$.getDynamicValue(thread));
                SubLObject something_writtenP = NIL;
                if ($tm_event_log_pathname$.getDynamicValue(thread).isString() && size.numG(ZERO_INTEGER)) {
                    {
                        SubLObject stream = NIL;
                        try {
                            stream = compatibility.open_text($tm_event_log_pathname$.getDynamicValue(thread), $APPEND, NIL);
                            if (!stream.isStream()) {
                                Errors.error($str_alt14$Unable_to_open__S, $tm_event_log_pathname$.getDynamicValue(thread));
                            }
                            {
                                SubLObject stream_7 = stream;
                                SubLObject cdohash_table = $tm_event_log_table$.getDynamicValue(thread);
                                SubLObject key = NIL;
                                SubLObject val = NIL;
                                {
                                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                                    try {
                                        while (iteratorHasNext(cdohash_iterator)) {
                                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                            key = getEntryKey(cdohash_entry);
                                            val = getEntryValue(cdohash_entry);
                                            {
                                                SubLObject event_tuple = cons(val, key);
                                                if (NIL != event_tuple) {
                                                    format(stream_7, $str_alt64$_s__, event_tuple);
                                                    something_writtenP = T;
                                                }
                                            }
                                        } 
                                    } finally {
                                        releaseEntrySetIterator(cdohash_iterator);
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
                    clrhash($tm_event_log_table$.getDynamicValue(thread));
                }
                return something_writtenP;
            }
        }
    }

    public static final SubLObject log_thesaurus_events() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            tm_save_events_to_log();
            $tm_event_log_next_save_time$.setDynamicValue(numeric_date_utilities.time_from_now(tm_control_vars.$tm_event_log_save_quantum$.getDynamicValue(thread)), thread);
            return NIL;
        }
    }

    /**
     * How many tmap events to queue up before
     * writing them out to the tmap log file.
     */
    // defparameter
    private static final SubLSymbol $tm_tmap_log_worry_size$ = makeSymbol("*TM-TMAP-LOG-WORRY-SIZE*");

    // defparameter
    private static final SubLSymbol $tm_tmap_log_table$ = makeSymbol("*TM-TMAP-LOG-TABLE*");

    // defparameter
    private static final SubLSymbol $tm_tmap_log_identifier$ = makeSymbol("*TM-TMAP-LOG-IDENTIFIER*");

    // defparameter
    private static final SubLSymbol $tm_tmap_log_filename_extension$ = makeSymbol("*TM-TMAP-LOG-FILENAME-EXTENSION*");

    // defparameter
    private static final SubLSymbol $tm_tmap_log_pathname$ = makeSymbol("*TM-TMAP-LOG-PATHNAME*");

    // defparameter
    private static final SubLSymbol $tm_tmap_report_identifier$ = makeSymbol("*TM-TMAP-REPORT-IDENTIFIER*");

    // defparameter
    private static final SubLSymbol $tm_tmap_report_filename_base$ = makeSymbol("*TM-TMAP-REPORT-FILENAME-BASE*");

    // defparameter
    private static final SubLSymbol $tm_tmap_report_filename_extension$ = makeSymbol("*TM-TMAP-REPORT-FILENAME-EXTENSION*");

    // defparameter
    private static final SubLSymbol $tm_tmap_log_next_save_time$ = makeSymbol("*TM-TMAP-LOG-NEXT-SAVE-TIME*");

    // defparameter
    private static final SubLSymbol $tm_tmap_log_version$ = makeSymbol("*TM-TMAP-LOG-VERSION*");

    /**
     * Start a new tmap log file when the filesize reaches this number
     */
    // defparameter
    private static final SubLSymbol $tm_tmap_log_max_filesize$ = makeSymbol("*TM-TMAP-LOG-MAX-FILESIZE*");

    public static final SubLObject construct_tmap_log_pathname(SubLObject filename) {
        return format(NIL, $str_alt23$_a_a, tm_datastructures.$tm_report_directory$.getGlobalValue(), filename);
    }

    public static final SubLObject construct_tmap_log_filename() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!$tm_tmap_log_version$.getDynamicValue(thread).isInteger()) {
                $tm_tmap_log_version$.setDynamicValue(ZERO_INTEGER, thread);
            }
            {
                SubLObject filename = format(NIL, $str_alt59$_a__a__a_a, new SubLObject[]{ control_vars.cyc_image_id(), $tm_tmap_log_identifier$.getDynamicValue(thread), format(NIL, $str_alt25$_4__0D, $tm_tmap_log_version$.getDynamicValue(thread)), NIL != string_utilities.non_empty_stringP($tm_tmap_log_filename_extension$.getDynamicValue(thread)) ? ((SubLObject) (format(NIL, $str_alt26$__a, $tm_tmap_log_filename_extension$.getDynamicValue(thread)))) : $str_alt16$ });
                return filename;
            }
        }
    }

    public static final SubLObject set_tm_tmap_log_pathname(SubLObject full_pathname) {
        if (full_pathname == UNPROVIDED) {
            full_pathname = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!$tm_tmap_log_version$.getDynamicValue(thread).isInteger()) {
                $tm_tmap_log_version$.setDynamicValue(ZERO_INTEGER, thread);
            }
            if (!$tm_tmap_log_max_filesize$.getDynamicValue(thread).isInteger()) {
                $tm_tmap_log_max_filesize$.setDynamicValue($int$500000, thread);
            }
            {
                SubLObject pathname = (full_pathname.isString()) ? ((SubLObject) (full_pathname)) : construct_tmap_log_pathname(construct_tmap_log_filename());
                SubLObject size = file_utilities.get_file_length(pathname);
                for (; !size.numL($tm_tmap_log_max_filesize$.getDynamicValue(thread));) {
                    $tm_tmap_log_version$.setDynamicValue(add($tm_tmap_log_version$.getDynamicValue(thread), ONE_INTEGER), thread);
                    pathname = construct_tmap_log_pathname(construct_tmap_log_filename());
                    size = file_utilities.get_file_length(pathname);
                }
                $tm_tmap_log_pathname$.setDynamicValue(pathname, thread);
                return $tm_tmap_log_pathname$.getDynamicValue(thread);
            }
        }
    }

    public static final SubLObject tm_update_tmap_log_table(SubLObject command, SubLObject thesauri, SubLObject user, SubLObject application) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != forts.valid_fortP(user)) || (NIL != string_utilities.non_empty_stringP(user)))) {
                user = $$$UNKNOWN;
            }
            if (NIL != forts.valid_fortP(user)) {
                user = tm_internals.user_name(user);
            }
            if (!((NIL != forts.valid_fortP(application)) || (NIL != string_utilities.non_empty_stringP(application)))) {
                application = $$$UNKNOWN;
            }
            if (NIL != forts.valid_fortP(application)) {
                application = tm_internals.application_name(application);
            }
            {
                SubLObject thes_names = (NIL != thesauri) ? ((SubLObject) (Mapping.mapcar(symbol_function(THESAURUS_NAME), thesauri))) : list($$$No_thesauri_selected);
                SubLObject sorted_names = Sort.sort(thes_names, symbol_function(STRING_LESSP), UNPROVIDED);
                SubLObject date = numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED);
                SubLObject login_int = (command.equalp($$$TMAP_login)) ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER;
                SubLObject key = list(login_int, user, application, sorted_names, date);
                SubLObject val = gethash(key, $tm_tmap_log_table$.getDynamicValue(thread), UNPROVIDED);
                val = (val.isInteger()) ? ((SubLObject) (add(val, ONE_INTEGER))) : ONE_INTEGER;
                sethash(key, $tm_tmap_log_table$.getDynamicValue(thread), val);
            }
            return NIL;
        }
    }

    public static final SubLObject log_tmap_eventsP() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject size = hash_table_count($tm_tmap_log_table$.getDynamicValue(thread));
                SubLObject v_boolean = NIL;
                v_boolean = makeBoolean(size.numG($tm_tmap_log_worry_size$.getDynamicValue(thread)) || (size.numG(ZERO_INTEGER) && (NIL != time_has_arrivedP($tm_tmap_log_next_save_time$.getDynamicValue(thread)))));
                return v_boolean;
            }
        }
    }

    public static final SubLObject tm_save_tmap_events_to_log() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            set_tm_tmap_log_pathname(UNPROVIDED);
            {
                SubLObject size = hash_table_count($tm_tmap_log_table$.getDynamicValue(thread));
                SubLObject something_writtenP = NIL;
                if ($tm_tmap_log_pathname$.getDynamicValue(thread).isString() && size.numG(ZERO_INTEGER)) {
                    {
                        SubLObject stream = NIL;
                        try {
                            stream = compatibility.open_text($tm_tmap_log_pathname$.getDynamicValue(thread), $APPEND, NIL);
                            if (!stream.isStream()) {
                                Errors.error($str_alt14$Unable_to_open__S, $tm_tmap_log_pathname$.getDynamicValue(thread));
                            }
                            {
                                SubLObject stream_8 = stream;
                                SubLObject cdohash_table = $tm_tmap_log_table$.getDynamicValue(thread);
                                SubLObject key = NIL;
                                SubLObject val = NIL;
                                {
                                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                                    try {
                                        while (iteratorHasNext(cdohash_iterator)) {
                                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                            key = getEntryKey(cdohash_entry);
                                            val = getEntryValue(cdohash_entry);
                                            {
                                                SubLObject event_tuple = cons(val, key);
                                                if (NIL != event_tuple) {
                                                    format(stream_8, $str_alt64$_s__, event_tuple);
                                                    something_writtenP = T;
                                                }
                                            }
                                        } 
                                    } finally {
                                        releaseEntrySetIterator(cdohash_iterator);
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
                    clrhash($tm_tmap_log_table$.getDynamicValue(thread));
                }
                return something_writtenP;
            }
        }
    }

    public static final SubLObject log_tmap_events() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            tm_save_tmap_events_to_log();
            $tm_tmap_log_next_save_time$.setDynamicValue(numeric_date_utilities.time_from_now(tm_control_vars.$tm_event_log_save_quantum$.getDynamicValue(thread)), thread);
            return NIL;
        }
    }

    // defparameter
    public static final SubLSymbol $integer_month_name_table$ = makeSymbol("*INTEGER-MONTH-NAME-TABLE*");

    /**
     * Return the integer corresponding to the month named month
     */
    public static final SubLObject month_Ginteger(SubLObject month) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return rassoc(month, $integer_month_name_table$.getDynamicValue(thread), symbol_function(EQUALP), UNPROVIDED).first();
        }
    }

    /**
     * Return the name of the month corresponding to integer
     */
    public static final SubLObject integer_Gmonth(SubLObject integer) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return assoc(integer, $integer_month_name_table$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest();
        }
    }

    /**
     * Return the name of the month corresponding to the integer string string
     */
    public static final SubLObject integer_string_Gmonth(SubLObject string) {
        {
            SubLObject v_int = read_from_string_ignoring_errors(string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return integer_Gmonth(v_int);
        }
    }

    /**
     * Return the two-digit integer string corresponding to month
     */
    public static final SubLObject month_Ginteger_string(SubLObject month) {
        return format(NIL, $str_alt69$_2__0D, month_Ginteger(month));
    }

    public static final SubLObject cyc_date() {
        return numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cyc_month() {
        return integerDivide(cyc_date(), $int$100);
    }

    public static final SubLObject cyc_day_integer() {
        return mod(cyc_date(), $int$100);
    }

    public static final SubLObject cyc_month_integer() {
        return mod(cyc_month(), $int$100);
    }

    public static final SubLObject cyc_year_integer() {
        return integerDivide(cyc_date(), $int$10000);
    }

    public static final SubLObject extract_day_integer_from_date(SubLObject date) {
        return mod(date, $int$100);
    }

    public static final SubLObject extract_month_integer_from_date(SubLObject date) {
        return mod(integerDivide(date, $int$100), $int$100);
    }

    public static final SubLObject extract_year_integer_from_date(SubLObject date) {
        return integerDivide(date, $int$10000);
    }

    public static final SubLObject add_day_to_month_year_integer(SubLObject month, SubLObject day) {
        return add(multiply(month, $int$100), day);
    }

    public static final SubLObject current_date_string() {
        {
            SubLObject day = cyc_day_integer();
            SubLObject year = cyc_year_integer();
            SubLObject month = integer_Gmonth(cyc_month_integer());
            return format(NIL, $str_alt71$_A__A___A, new SubLObject[]{ month, day, year });
        }
    }

    public static final SubLObject cyc_time() {
        {
            SubLObject string = numeric_date_utilities.timestring(UNPROVIDED);
            SubLObject date_time_list = string_utilities.break_words(string, symbol_function($sym72$VALID_TIMESTRING_CHAR_), UNPROVIDED);
            SubLObject time_string = second(date_time_list);
            SubLObject time_list = string_utilities.break_words(time_string, symbol_function(ALPHANUMERICP), UNPROVIDED);
            SubLObject integer = read_from_string_ignoring_errors(string_utilities.strcat(time_list), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return integer;
        }
    }

    public static final SubLObject tm_make_cyc_date(SubLObject day_int_string, SubLObject month_name_string, SubLObject year_int_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject day_string = format(NIL, $str_alt69$_2__0D, read_from_string_ignoring_errors(day_int_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                SubLObject month_int = rassoc(month_name_string, $integer_month_name_table$.getDynamicValue(thread), symbol_function(EQUALP), UNPROVIDED).first();
                SubLObject month_string = format(NIL, $str_alt69$_2__0D, month_int);
                SubLObject cyc_date_string = format(NIL, $str_alt74$_a_a_a, new SubLObject[]{ year_int_string, month_string, day_string });
                return read_from_string_ignoring_errors(cyc_date_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    public static final SubLObject tm_make_datestring(SubLObject cyc_date) {
        if (cyc_date.isInteger()) {
            {
                SubLObject date_string = format(NIL, $str_alt75$_8__0D, cyc_date);
                SubLObject day = subseq(date_string, SIX_INTEGER, EIGHT_INTEGER);
                SubLObject year = subseq(date_string, TWO_INTEGER, FOUR_INTEGER);
                SubLObject month = subseq(date_string, FOUR_INTEGER, SIX_INTEGER);
                return format(NIL, $str_alt76$_a__a__a, new SubLObject[]{ month, day, year });
            }
        } else {
            return $$$UNKNOWN;
        }
    }

    public static final SubLObject tm_make_timestring(SubLObject cyc_time) {
        if (cyc_time.isInteger()) {
            {
                SubLObject string = format(NIL, $str_alt77$_6__0D, cyc_time);
                SubLObject hours = subseq(string, ZERO_INTEGER, TWO_INTEGER);
                SubLObject minutes = subseq(string, TWO_INTEGER, FOUR_INTEGER);
                SubLObject seconds = subseq(string, FOUR_INTEGER, SIX_INTEGER);
                return format(NIL, $str_alt78$_a__a__a, new SubLObject[]{ hours, minutes, seconds });
            }
        } else {
            return $$$UNKNOWN;
        }
    }

    public static final SubLObject make_month_user_vector() {
        {
            SubLObject vec = make_vector(FOUR_INTEGER, UNPROVIDED);
            set_aref(vec, ZERO_INTEGER, ZERO_INTEGER);
            set_aref(vec, ONE_INTEGER, make_hash_table($int$50, symbol_function(EQUALP), UNPROVIDED));
            set_aref(vec, TWO_INTEGER, ZERO_INTEGER);
            return vec;
        }
    }

    public static final SubLObject ok_user_event_formP(SubLObject form) {
        return makeBoolean((((((form.isCons() && length(form).numE(FIVE_INTEGER)) && form.first().isInteger()) && second(form).isInteger()) && third(form).isString()) && fourth(form).isList()) && fifth(form).isInteger());
    }

    public static final SubLObject update_month_user_vector(SubLObject vector, SubLObject form) {
        {
            SubLObject login_count = aref(vector, ZERO_INTEGER);
            SubLObject table = aref(vector, ONE_INTEGER);
            SubLObject total_pages_accessed = aref(vector, TWO_INTEGER);
            SubLObject login_increase = second(form);
            SubLObject total_increase = form.first();
            set_aref(vector, ZERO_INTEGER, add(login_count, login_increase));
            {
                SubLObject thesauri_token = fourth(form);
                SubLObject thesauri = (thesauri_token.isCons()) ? ((SubLObject) (thesauri_token)) : $list_alt79;
                SubLObject cdolist_list_var = thesauri;
                SubLObject thes = NIL;
                for (thes = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thes = cdolist_list_var.first()) {
                    if (!thes.isString()) {
                        thes = format(NIL, $str_alt80$_A, thes);
                    }
                    if (thes.isString()) {
                        {
                            SubLObject val = gethash(thes, table, UNPROVIDED);
                            sethash(thes, table, val.isInteger() ? ((SubLObject) (add(val, total_increase))) : total_increase);
                        }
                    }
                }
            }
            set_aref(vector, TWO_INTEGER, add(total_pages_accessed, total_increase));
        }
        return vector;
    }

    public static final SubLObject month_from_cyc_date(SubLObject cyc_date) {
        return integerDivide(cyc_date, $int$100);
    }

    public static final SubLObject tm_update_month_user_tables(SubLObject form) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != ok_user_event_formP(form)) {
                {
                    SubLObject month = month_from_cyc_date(fifth(form));
                    SubLObject month_table = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $MONTH_EVENT_LOG_TABLE);
                    SubLObject user_table = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $USER_EVENT_LOG_TABLE);
                    SubLObject alist_1 = gethash(month, month_table, UNPROVIDED);
                    SubLObject user_token = third(form);
                    SubLObject user = (NIL != string_utilities.non_empty_stringP(user_token)) ? ((SubLObject) (user_token)) : $$$UNKNOWN;
                    SubLObject alist_2 = gethash(user, user_table, UNPROVIDED);
                    SubLObject vec = assoc(user, alist_1, symbol_function(EQUALP), UNPROVIDED).rest();
                    if (vec.isVector()) {
                        update_month_user_vector(vec, form);
                    } else {
                        vec = make_month_user_vector();
                        update_month_user_vector(vec, form);
                        alist_1 = cons(cons(user, vec), alist_1);
                        sethash(month, month_table, alist_1);
                        alist_2 = cons(cons(month, vec), alist_2);
                        sethash(user, user_table, alist_2);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject make_thesaurus_month_vector() {
        {
            SubLObject vec = make_vector(TWO_INTEGER, UNPROVIDED);
            set_aref(vec, ZERO_INTEGER, ZERO_INTEGER);
            set_aref(vec, ONE_INTEGER, make_hash_table(TWENTY_INTEGER, symbol_function(EQUALP), UNPROVIDED));
            return vec;
        }
    }

    public static final SubLObject update_thesaurus_month_vector(SubLObject vector, SubLObject form) {
        {
            SubLObject count = aref(vector, ZERO_INTEGER);
            SubLObject increase = form.first();
            SubLObject table = aref(vector, ONE_INTEGER);
            SubLObject user_token = third(form);
            SubLObject user = (NIL != string_utilities.non_empty_stringP(user_token)) ? ((SubLObject) (user_token)) : $$$UNKNOWN;
            set_aref(vector, ZERO_INTEGER, add(count, increase));
            {
                SubLObject val = gethash(user, table, UNPROVIDED);
                sethash(user, table, val.isInteger() ? ((SubLObject) (add(val, increase))) : increase);
            }
            return vector;
        }
    }

    public static final SubLObject tm_update_thesaurus_month_table(SubLObject form) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != ok_user_event_formP(form)) {
                {
                    SubLObject table = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURUS_EVENT_LOG_TABLE);
                    SubLObject month = month_from_cyc_date(fifth(form));
                    SubLObject thesaurus_token = fourth(form);
                    SubLObject thesauri = (thesaurus_token.isCons()) ? ((SubLObject) (thesaurus_token)) : $list_alt79;
                    SubLObject cdolist_list_var = thesauri;
                    SubLObject thes = NIL;
                    for (thes = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thes = cdolist_list_var.first()) {
                        if (!thes.isString()) {
                            thes = format(NIL, $str_alt80$_A, thes);
                        }
                        if (thes.isString()) {
                            {
                                SubLObject thesaurus_month_val = gethash(thes, table, UNPROVIDED);
                                SubLObject vec = assoc(month, thesaurus_month_val, symbol_function(EQUALP), UNPROVIDED).rest();
                                if (vec.isVector()) {
                                    update_thesaurus_month_vector(vec, form);
                                } else {
                                    vec = make_thesaurus_month_vector();
                                    update_thesaurus_month_vector(vec, form);
                                    thesaurus_month_val = cons(cons(month, vec), thesaurus_month_val);
                                    sethash(thes, table, thesaurus_month_val);
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject get_log_filenames(SubLObject type, SubLObject report_directory) {
        if (report_directory == UNPROVIDED) {
            report_directory = tm_datastructures.$tm_report_directory$.getGlobalValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject identifiers = NIL;
                SubLObject files = NIL;
                SubLObject pcase_var = type;
                if (pcase_var.eql($OP_LOG)) {
                    identifiers = list($tm_op_log_identifier$.getDynamicValue(thread));
                } else
                    if (pcase_var.eql($EVENT_LOG)) {
                        identifiers = list($tm_event_log_identifier$.getDynamicValue(thread));
                    } else
                        if (pcase_var.eql($TMAP_LOG)) {
                            identifiers = list($tm_tmap_log_identifier$.getDynamicValue(thread));
                        } else
                            if (pcase_var.eql($USER_REPORT)) {
                                identifiers = list($tm_user_report_identifier$.getDynamicValue(thread));
                            } else
                                if (pcase_var.eql($THESAURUS_REPORT)) {
                                    identifiers = list($tm_thesaurus_report_identifier$.getDynamicValue(thread));
                                } else
                                    if (pcase_var.eql($REPORT)) {
                                        identifiers = list($tm_user_report_identifier$.getDynamicValue(thread), $tm_thesaurus_report_identifier$.getDynamicValue(thread));
                                    } else {
                                        Errors.error($str_alt89$Unknown_type__a, type);
                                    }





                {
                    SubLObject cdolist_list_var = Filesys.directory(report_directory, UNPROVIDED);
                    SubLObject f = NIL;
                    for (f = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , f = cdolist_list_var.first()) {
                        if (NIL != string_utilities.some_are_substringsP(identifiers, f, UNPROVIDED)) {
                            files = cons(f, files);
                        }
                    }
                }
                return files;
            }
        }
    }

    public static final SubLObject clear_event_log_tables() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject month_table = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $MONTH_EVENT_LOG_TABLE);
                SubLObject user_table = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $USER_EVENT_LOG_TABLE);
                SubLObject thes_table = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURUS_EVENT_LOG_TABLE);
                if (month_table.isHashtable()) {
                    clrhash(month_table);
                } else {
                    tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $MONTH_EVENT_LOG_TABLE, make_hash_table($int$100, UNPROVIDED, UNPROVIDED), UNPROVIDED);
                }
                if (user_table.isHashtable()) {
                    clrhash(user_table);
                } else {
                    tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $USER_EVENT_LOG_TABLE, make_hash_table($int$100, symbol_function(EQUALP), UNPROVIDED), UNPROVIDED);
                }
                if (thes_table.isHashtable()) {
                    clrhash(thes_table);
                } else {
                    tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURUS_EVENT_LOG_TABLE, make_hash_table($int$100, symbol_function(EQUALP), UNPROVIDED), UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_process_event_log_file(SubLObject filename) {
        {
            SubLObject pathname = construct_event_log_pathname(filename);
            if (NIL != Filesys.probe_file(pathname)) {
                {
                    SubLObject stream = NIL;
                    try {
                        stream = compatibility.open_text(pathname, $INPUT, NIL);
                        if (!stream.isStream()) {
                            Errors.error($str_alt14$Unable_to_open__S, pathname);
                        }
                        {
                            SubLObject stream_9 = stream;
                            SubLObject form = NIL;
                            for (form = read_ignoring_errors(stream_9, NIL, $EOF); form != $EOF; form = read_ignoring_errors(stream_9, NIL, $EOF)) {
                                tm_update_month_user_tables(form);
                                tm_update_thesaurus_month_table(form);
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                if (stream.isStream()) {
                                    close(stream, UNPROVIDED);
                                }
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject tm_process_event_log_files(SubLObject directory) {
        if (directory == UNPROVIDED) {
            directory = tm_datastructures.$tm_report_directory$.getGlobalValue();
        }
        {
            SubLObject files = get_log_filenames($EVENT_LOG, directory);
            if (NIL != files) {
                clear_event_log_tables();
            }
            {
                SubLObject cdolist_list_var = files;
                SubLObject f = NIL;
                for (f = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , f = cdolist_list_var.first()) {
                    tm_process_event_log_file(f);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject clear_tmap_log_tables() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject app_table = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $APPLICATION_TMAP_LOG_TABLE);
                SubLObject thes_table = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURUS_TMAP_LOG_TABLE);
                if (app_table.isHashtable()) {
                    clrhash(app_table);
                } else {
                    tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $APPLICATION_TMAP_LOG_TABLE, make_hash_table($int$100, UNPROVIDED, UNPROVIDED), UNPROVIDED);
                }
                if (thes_table.isHashtable()) {
                    clrhash(thes_table);
                } else {
                    tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURUS_TMAP_LOG_TABLE, make_hash_table($int$100, UNPROVIDED, UNPROVIDED), UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_process_tmap_log_file(SubLObject filename) {
        {
            SubLObject pathname = construct_tmap_log_pathname(filename);
            if (NIL != Filesys.probe_file(pathname)) {
                {
                    SubLObject stream = NIL;
                    try {
                        stream = compatibility.open_text(pathname, $INPUT, NIL);
                        if (!stream.isStream()) {
                            Errors.error($str_alt14$Unable_to_open__S, pathname);
                        }
                        {
                            SubLObject stream_10 = stream;
                            SubLObject form = NIL;
                            for (form = read_ignoring_errors(stream_10, NIL, $EOF); form != $EOF; form = read_ignoring_errors(stream_10, NIL, $EOF)) {
                                tm_update_thesaurus_tmap_table(form);
                                tm_update_application_tmap_table(form);
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                if (stream.isStream()) {
                                    close(stream, UNPROVIDED);
                                }
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject tm_process_tmap_log_files(SubLObject directory) {
        if (directory == UNPROVIDED) {
            directory = tm_datastructures.$tm_report_directory$.getGlobalValue();
        }
        {
            SubLObject files = get_log_filenames($TMAP_LOG, directory);
            if (NIL != files) {
                clear_tmap_log_tables();
            }
            {
                SubLObject cdolist_list_var = files;
                SubLObject f = NIL;
                for (f = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , f = cdolist_list_var.first()) {
                    tm_process_tmap_log_file(f);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject ok_tmap_event_formP(SubLObject form) {
        return makeBoolean(((((((form.isCons() && length(form).numE(SIX_INTEGER)) && form.first().isInteger()) && second(form).isInteger()) && third(form).isString()) && fourth(form).isString()) && fifth(form).isList()) && sixth(form).isInteger());
    }

    public static final SubLObject make_tmap_thesaurus_month_vector() {
        {
            SubLObject vec = make_vector(TWO_INTEGER, UNPROVIDED);
            set_aref(vec, ZERO_INTEGER, ZERO_INTEGER);
            set_aref(vec, ONE_INTEGER, make_hash_table(TWENTY_INTEGER, symbol_function(EQUALP), UNPROVIDED));
            return vec;
        }
    }

    public static final SubLObject update_tmap_thesaurus_month_vector(SubLObject vector, SubLObject form) {
        {
            SubLObject count = aref(vector, ZERO_INTEGER);
            SubLObject increase = form.first();
            SubLObject table = aref(vector, ONE_INTEGER);
            SubLObject app_token = fourth(form);
            SubLObject app = (NIL != string_utilities.non_empty_stringP(app_token)) ? ((SubLObject) (app_token)) : $$$UNKNOWN;
            set_aref(vector, ZERO_INTEGER, add(count, increase));
            {
                SubLObject val = gethash(app, table, UNPROVIDED);
                sethash(app, table, val.isInteger() ? ((SubLObject) (add(val, increase))) : increase);
            }
            return vector;
        }
    }

    public static final SubLObject tm_update_thesaurus_tmap_table(SubLObject form) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != ok_tmap_event_formP(form)) {
                {
                    SubLObject table = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURUS_TMAP_LOG_TABLE);
                    SubLObject month = month_from_cyc_date(sixth(form));
                    SubLObject thesaurus_token = fifth(form);
                    SubLObject commands_formP = eq(second(form), ZERO_INTEGER);
                    SubLObject thesauri = (thesaurus_token.isCons()) ? ((SubLObject) (thesaurus_token)) : $list_alt79;
                    if (NIL != commands_formP) {
                        {
                            SubLObject cdolist_list_var = thesauri;
                            SubLObject thes = NIL;
                            for (thes = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thes = cdolist_list_var.first()) {
                                {
                                    SubLObject thesaurus_month_val = gethash(thes, table, UNPROVIDED);
                                    SubLObject vec = assoc(month, thesaurus_month_val, symbol_function(EQUALP), UNPROVIDED).rest();
                                    if (vec.isVector()) {
                                        update_tmap_thesaurus_month_vector(vec, form);
                                    } else {
                                        vec = make_tmap_thesaurus_month_vector();
                                        update_tmap_thesaurus_month_vector(vec, form);
                                        thesaurus_month_val = cons(cons(month, vec), thesaurus_month_val);
                                        sethash(thes, table, thesaurus_month_val);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject make_tmap_month_application_vector() {
        {
            SubLObject vec = make_vector(FOUR_INTEGER, UNPROVIDED);
            set_aref(vec, ZERO_INTEGER, ZERO_INTEGER);
            set_aref(vec, ONE_INTEGER, ZERO_INTEGER);
            set_aref(vec, TWO_INTEGER, make_hash_table($int$50, symbol_function(EQUALP), UNPROVIDED));
            return vec;
        }
    }

    public static final SubLObject update_tmap_month_application_vector(SubLObject vector, SubLObject form) {
        {
            SubLObject login_count = aref(vector, ZERO_INTEGER);
            SubLObject total_pages_accessed = aref(vector, ONE_INTEGER);
            SubLObject table = aref(vector, TWO_INTEGER);
            SubLObject login_increase = second(form);
            SubLObject total_increase = (second(form).eql(ZERO_INTEGER)) ? ((SubLObject) (form.first())) : ZERO_INTEGER;
            if (login_increase.numG(ZERO_INTEGER)) {
                set_aref(vector, ZERO_INTEGER, add(login_count, login_increase));
                return vector;
            }
            {
                SubLObject thesauri_token = fifth(form);
                SubLObject thesauri = (thesauri_token.isCons()) ? ((SubLObject) (thesauri_token)) : $list_alt79;
                SubLObject cdolist_list_var = thesauri;
                SubLObject thes = NIL;
                for (thes = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thes = cdolist_list_var.first()) {
                    {
                        SubLObject val = gethash(thes, table, UNPROVIDED);
                        sethash(thes, table, val.isInteger() ? ((SubLObject) (add(val, total_increase))) : total_increase);
                    }
                }
            }
            set_aref(vector, ONE_INTEGER, add(total_pages_accessed, total_increase));
        }
        return vector;
    }

    public static final SubLObject tm_update_application_tmap_table(SubLObject form) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != ok_tmap_event_formP(form)) {
                {
                    SubLObject month = month_from_cyc_date(sixth(form));
                    SubLObject app_table = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $APPLICATION_TMAP_LOG_TABLE);
                    SubLObject app_token = fourth(form);
                    SubLObject app = (NIL != string_utilities.non_empty_stringP(app_token)) ? ((SubLObject) (app_token)) : $$$UNKNOWN;
                    SubLObject alist = gethash(app, app_table, UNPROVIDED);
                    SubLObject vec = assoc(month, alist, symbol_function(EQUALP), UNPROVIDED).rest();
                    if (vec.isVector()) {
                        update_tmap_month_application_vector(vec, form);
                    } else {
                        vec = make_tmap_month_application_vector();
                        update_tmap_month_application_vector(vec, form);
                        alist = cons(cons(month, vec), alist);
                        sethash(app, app_table, alist);
                    }
                }
            }
            return NIL;
        }
    }

    // defparameter
    public static final SubLSymbol $tm_user_report_indent$ = makeSymbol("*TM-USER-REPORT-INDENT*");

    public static final SubLObject sort_table_keys(SubLObject hashtable, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(STRING_LESSP);
        }
        {
            SubLObject result = NIL;
            SubLObject key = NIL;
            SubLObject val = NIL;
            {
                final Iterator cdohash_iterator = getEntrySetIterator(hashtable);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        key = getEntryKey(cdohash_entry);
                        val = getEntryValue(cdohash_entry);
                        result = cons(key, result);
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
            return Sort.sort(result, test, UNPROVIDED);
        }
    }

    public static final SubLObject tm_sort_month_keys() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject table = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $MONTH_EVENT_LOG_TABLE);
                return sort_table_keys(table, symbol_function($sym92$_));
            }
        }
    }

    public static final SubLObject tm_sort_user_keys() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject table = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $USER_EVENT_LOG_TABLE);
                return sort_table_keys(table, UNPROVIDED);
            }
        }
    }

    public static final SubLObject tm_sort_thesaurus_keys() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject table = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURUS_EVENT_LOG_TABLE);
                return sort_table_keys(table, UNPROVIDED);
            }
        }
    }

    public static final SubLObject extract_month_integer(SubLObject year_month_integer) {
        return mod(year_month_integer, $int$100);
    }

    public static final SubLObject extract_year_integer(SubLObject year_month_integer) {
        return integerDivide(year_month_integer, $int$100);
    }

    public static final SubLObject readable_month(SubLObject year_month_integer) {
        {
            SubLObject month_int = extract_month_integer(year_month_integer);
            SubLObject month = integer_Gmonth(month_int);
            SubLObject year_int = extract_year_integer(year_month_integer);
            return format(NIL, $str_alt93$_a__a, month, year_int);
        }
    }

    public static final SubLObject readable_day(SubLObject thedate) {
        {
            SubLObject day_int = extract_day_integer_from_date(thedate);
            SubLObject month_int = extract_month_integer_from_date(thedate);
            SubLObject month = integer_Gmonth(month_int);
            SubLObject year_int = extract_year_integer_from_date(thedate);
            return format(NIL, $str_alt94$_a__a__a, new SubLObject[]{ day_int, month, year_int });
        }
    }

    /**
     * If object can be determined to be a user, returns
     * a nice print string for it else returns "Unknown user"
     */
    public static final SubLObject tm_print_name_for_user_in_report(SubLObject v_object) {
        {
            SubLObject unknown_string = $$$UNKNOWN;
            SubLObject empty_string = $str_alt16$;
            SubLObject user_not_found = $str_alt95$_User_Not_Found_;
            SubLObject print_name = NIL;
            if (NIL == v_object) {
                print_name = unknown_string;
            } else
                if ((NIL != tm_internals.tm_userP(v_object)) || (v_object.isString() && ((NIL != tm_internals.tm_user_constant_from_user_name(v_object)) || (NIL != tm_internals.tm_userP(constants_high.find_constant(v_object)))))) {
                    {
                        SubLObject user_constant = (NIL != tm_internals.tm_userP(v_object)) ? ((SubLObject) (v_object)) : NIL != tm_internals.tm_user_constant_from_user_name(v_object) ? ((SubLObject) (tm_internals.tm_user_constant_from_user_name(v_object))) : constants_high.find_constant(v_object);
                        SubLObject user_name = empty_string;
                        SubLObject personal_name = empty_string;
                        SubLObject inactive = NIL;
                        if (NIL != tm_internals.personal_name(user_constant)) {
                            personal_name = tm_internals.personal_name(user_constant);
                        }
                        if (NIL != tm_internals.user_name(user_constant)) {
                            user_name = tm_internals.user_name(user_constant);
                        } else {
                            if (v_object.isString()) {
                                user_name = v_object;
                            }
                        }
                        if (NIL == tm_internals.active_entityP(user_constant)) {
                            inactive = $$$inactive;
                        }
                        if (!personal_name.eql(empty_string)) {
                            print_name = cconcatenate(personal_name, new SubLObject[]{ $str_alt97$__, user_name, NIL != inactive ? ((SubLObject) (cconcatenate($str_alt98$___, inactive))) : empty_string, $str_alt99$_ });
                        } else {
                            print_name = cconcatenate(user_name, NIL != inactive ? ((SubLObject) (cconcatenate($str_alt97$__, new SubLObject[]{ inactive, $str_alt99$_ }))) : empty_string);
                        }
                    }
                } else
                    if (v_object.isString()) {
                        if (v_object.equalp(unknown_string)) {
                            print_name = unknown_string;
                        } else {
                            print_name = cconcatenate(v_object, new SubLObject[]{ $str_alt100$_, user_not_found });
                        }
                    } else {
                        print_name = unknown_string;
                    }


            return print_name;
        }
    }

    public static final SubLObject select_numbers_in_range(SubLObject number_list, SubLObject lower_bound, SubLObject upper_bound) {
        if (lower_bound == UNPROVIDED) {
            lower_bound = NIL;
        }
        if (upper_bound == UNPROVIDED) {
            upper_bound = NIL;
        }
        {
            SubLObject ans = NIL;
            if (lower_bound.isNumber() && upper_bound.isNumber()) {
                {
                    SubLObject cdolist_list_var = number_list;
                    SubLObject number = NIL;
                    for (number = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , number = cdolist_list_var.first()) {
                        if (number.numGE(lower_bound) && number.numLE(upper_bound)) {
                            ans = cons(number, ans);
                        }
                    }
                }
            } else
                if (lower_bound.isNumber()) {
                    {
                        SubLObject cdolist_list_var = number_list;
                        SubLObject number = NIL;
                        for (number = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , number = cdolist_list_var.first()) {
                            if (number.numGE(lower_bound)) {
                                ans = cons(number, ans);
                            }
                        }
                    }
                } else
                    if (upper_bound.isNumber()) {
                        {
                            SubLObject cdolist_list_var = number_list;
                            SubLObject number = NIL;
                            for (number = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , number = cdolist_list_var.first()) {
                                if (number.numLE(upper_bound)) {
                                    ans = cons(number, ans);
                                }
                            }
                        }
                    } else {
                        ans = number_list;
                    }


            return ans;
        }
    }

    public static final SubLObject tm_event_use_herald(SubLObject stream, SubLObject start_month, SubLObject end_month) {
        if (start_month == UNPROVIDED) {
            start_month = NIL;
        }
        if (end_month == UNPROVIDED) {
            end_month = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            format(stream, $str_alt101$__);
            format(stream, $$$THESAURUS_USE_REPORT);
            format(stream, $str_alt103$____);
            format(stream, $str_alt104$This_report_requested_by___a, tm_print_name_for_user_in_report(tm_datastructures.$tm_user$.getDynamicValue(thread)));
            format(stream, $str_alt101$__);
            format(stream, $str_alt105$__Report_generation_time___a, numeric_date_utilities.timestring(UNPROVIDED));
            if ((NIL != start_month) && (NIL != end_month)) {
                format(stream, $str_alt101$__);
                if (end_month.numGE(cyc_month())) {
                    format(stream, $str_alt106$__Report_for_period_covering_from, readable_month(start_month), current_date_string());
                } else {
                    format(stream, $str_alt107$__Report_for_period_covering_from, readable_month(start_month), readable_month(end_month));
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_output_user_statistics(SubLObject stream, SubLObject start_month, SubLObject end_month, SubLObject multiple_month_aggregateP, SubLObject monthP, SubLObject userP, SubLObject thesaurusP) {
        if (start_month == UNPROVIDED) {
            start_month = NIL;
        }
        if (end_month == UNPROVIDED) {
            end_month = NIL;
        }
        if (multiple_month_aggregateP == UNPROVIDED) {
            multiple_month_aggregateP = NIL;
        }
        if (monthP == UNPROVIDED) {
            monthP = NIL;
        }
        if (userP == UNPROVIDED) {
            userP = NIL;
        }
        if (thesaurusP == UNPROVIDED) {
            thesaurusP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject month_table = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $MONTH_EVENT_LOG_TABLE);
                SubLObject user_table = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $USER_EVENT_LOG_TABLE);
                SubLObject thesaurus_table = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURUS_EVENT_LOG_TABLE);
                SubLObject months = hash_table_utilities.hash_table_keys(month_table);
                SubLObject users = hash_table_utilities.hash_table_keys(user_table);
                SubLObject thesauri = hash_table_utilities.hash_table_keys(thesaurus_table);
                SubLObject section_break = Strings.make_string($int$70, CHAR_hyphen);
                SubLObject aggregateP = (multiple_month_aggregateP.equalp($$$yes)) ? ((SubLObject) (T)) : NIL;
                SubLObject first_month_in_period = NIL;
                SubLObject last_month_in_period = NIL;
                months = select_numbers_in_range(months, start_month, end_month);
                if (NIL != months) {
                    months = Sort.sort(months, symbol_function($sym92$_), UNPROVIDED);
                    users = Sort.sort(users, symbol_function(STRING_LESSP), symbol_function(TM_PRINT_NAME_FOR_USER_IN_REPORT));
                    thesauri = Sort.sort(thesauri, symbol_function(STRING_LESSP), UNPROVIDED);
                    if (NIL != start_month) {
                        first_month_in_period = start_month;
                    } else {
                        first_month_in_period = months.first();
                    }
                    if (NIL != end_month) {
                        last_month_in_period = end_month;
                    } else {
                        last_month_in_period = last(months, UNPROVIDED).first();
                    }
                    tm_event_use_herald(stream, first_month_in_period, last_month_in_period);
                    if ((NIL == aggregateP) && (NIL != monthP)) {
                        output_data_for_months(months, stream);
                        format(stream, $str_alt111$_______a___a__, section_break, section_break);
                    }
                    if (NIL != userP) {
                        output_data_for_users(users, months, stream, aggregateP);
                        format(stream, $str_alt111$_______a___a__, section_break, section_break);
                    }
                    if (NIL != thesaurusP) {
                        output_data_for_thesauri(thesauri, months, stream, aggregateP);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject output_data_for_months(SubLObject months, SubLObject stream) {
        if (NIL != months) {
            format(stream, $str_alt112$______);
            format(stream, $str_alt113$_________________________________);
            format(stream, $str_alt114$______USER_STATISTICS_BY_MONTH___);
            format(stream, $str_alt113$_________________________________);
            {
                SubLObject cdolist_list_var = months;
                SubLObject month = NIL;
                for (month = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , month = cdolist_list_var.first()) {
                    output_data_for_month(month, stream);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject find_longest_car(SubLObject list) {
        {
            SubLObject len = ZERO_INTEGER;
            SubLObject cdolist_list_var = list;
            SubLObject x = NIL;
            for (x = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , x = cdolist_list_var.first()) {
                {
                    SubLObject l = length(x.first());
                    if (l.numG(len)) {
                        len = l;
                    }
                }
            }
            return len;
        }
    }

    public static final SubLObject print_month_user_vector(SubLObject string, SubLObject key, SubLObject vector, SubLObject stream) {
        {
            SubLObject len = length(string);
            SubLObject fill = subtract($int$32, len);
            SubLObject fillstring = Strings.make_string(fill, UNPROVIDED);
            SubLObject logins = aref(vector, ZERO_INTEGER);
            SubLObject table = aref(vector, ONE_INTEGER);
            SubLObject total_pages = aref(vector, TWO_INTEGER);
            SubLObject vals = hash_table_utilities.get_table_values(table);
            SubLObject sorted_vals = Sort.sort(vals, symbol_function(STRING_LESSP), symbol_function(CAR));
            SubLObject first_sorted_vals = sorted_vals.first();
            SubLObject rest_sorted_vals = sorted_vals.rest();
            SubLObject user_not_found = $str_alt95$_User_Not_Found_;
            SubLObject activityP = T;
            format(stream, $str_alt103$____);
            if ((NIL != tm_internals.tm_user_constant_from_user_name(key)) || (key.isString() && (NIL != tm_internals.tm_userP(constants_high.find_constant(key))))) {
                {
                    SubLObject user_constant = (NIL != tm_internals.tm_user_constant_from_user_name(key)) ? ((SubLObject) (tm_internals.tm_user_constant_from_user_name(key))) : constants_high.find_constant(key);
                    SubLObject user_name = (NIL != tm_internals.user_name(user_constant)) ? ((SubLObject) (tm_internals.user_name(user_constant))) : key;
                    SubLObject personal_name = tm_internals.personal_name(user_constant);
                    SubLObject personal_label = $$$Name;
                    SubLObject fill_personal = NIL;
                    SubLObject fillstring_personal = NIL;
                    if (NIL != personal_name) {
                        fill_personal = subtract($int$32, length(personal_label));
                        fillstring_personal = Strings.make_string(fill_personal, UNPROVIDED);
                        format(stream, $str_alt118$_a_a___a, new SubLObject[]{ fillstring, string, user_name });
                        if (NIL != tm_internals.active_entityP(user_constant)) {
                            format(stream, $str_alt101$__);
                        } else {
                            format(stream, $str_alt119$__inactive___);
                        }
                        format(stream, $str_alt118$_a_a___a, new SubLObject[]{ fillstring_personal, personal_label, personal_name });
                    } else {
                        format(stream, $str_alt118$_a_a___a, new SubLObject[]{ fillstring, string, user_name });
                    }
                }
            } else {
                if ($tm_user_print_label$.getGlobalValue().eql(string) && (!key.equalp($$$unknown))) {
                    format(stream, $str_alt121$_a_a___a__a, new SubLObject[]{ fillstring, string, key, user_not_found });
                } else {
                    format(stream, $str_alt118$_a_a___a, new SubLObject[]{ fillstring, string, key });
                }
            }
            format(stream, $str_alt101$__);
            format(stream, $str_alt122$____________________Total_logins_, logins);
            if (NIL != vals) {
                format(stream, $str_alt101$__);
                format(stream, $str_alt123$Total_pages_per_active_thesaurus_);
                {
                    SubLObject n = find_longest_car(sorted_vals);
                    SubLObject diff = subtract(n, length(first_sorted_vals.first()));
                    SubLObject s = Strings.make_string(diff, UNPROVIDED);
                    format(stream, $str_alt118$_a_a___a, new SubLObject[]{ s, first_sorted_vals.first(), second(first_sorted_vals) });
                    {
                        SubLObject cdolist_list_var = rest_sorted_vals;
                        SubLObject pair = NIL;
                        for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                            {
                                SubLObject diff2 = subtract(n, length(pair.first()));
                                SubLObject s2 = Strings.make_string(diff2, UNPROVIDED);
                                format(stream, $str_alt101$__);
                                format(stream, $str_alt124$_________________________________);
                                format(stream, $str_alt118$_a_a___a, new SubLObject[]{ s2, pair.first(), second(pair) });
                            }
                        }
                    }
                }
            }
            format(stream, $str_alt101$__);
            format(stream, $str_alt125$____________Total_pages_accessed_, total_pages);
            return activityP;
        }
    }

    public static final SubLObject print_aggregate_months_user_vector(SubLObject vecs_list, SubLObject stream, SubLObject start_month, SubLObject end_month) {
        {
            SubLObject string = $str_alt126$Time_period_;
            SubLObject len = length(string);
            SubLObject fill = subtract($int$32, len);
            SubLObject fillstring = Strings.make_string(fill, UNPROVIDED);
            SubLObject num_thesauri = length(tm_internals.all_thesauri());
            SubLObject thesauri = make_hash_table(num_thesauri, symbol_function(EQUALP), UNPROVIDED);
            SubLObject activityP = T;
            SubLObject aggregate_logins = ZERO_INTEGER;
            SubLObject aggregate_pages = ZERO_INTEGER;
            {
                SubLObject cdolist_list_var = vecs_list;
                SubLObject pair = NIL;
                for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                    {
                        SubLObject vector = pair.rest();
                        SubLObject table = aref(vector, ONE_INTEGER);
                        SubLObject vals = hash_table_utilities.get_table_values(table);
                        aggregate_logins = add(aref(vector, ZERO_INTEGER), aggregate_logins);
                        aggregate_pages = add(aref(vector, TWO_INTEGER), aggregate_pages);
                        {
                            SubLObject cdolist_list_var_11 = vals;
                            SubLObject value = NIL;
                            for (value = cdolist_list_var_11.first(); NIL != cdolist_list_var_11; cdolist_list_var_11 = cdolist_list_var_11.rest() , value = cdolist_list_var_11.first()) {
                                if (gethash(value.first(), thesauri, UNPROVIDED) == NIL) {
                                    sethash(value.first(), thesauri, second(value));
                                } else {
                                    sethash(value.first(), thesauri, add(second(value), gethash(value.first(), thesauri, UNPROVIDED)));
                                }
                            }
                        }
                    }
                }
            }
            {
                SubLObject vals = hash_table_utilities.get_table_values(thesauri);
                SubLObject sorted_vals = Sort.sort(vals, symbol_function(STRING_LESSP), symbol_function(CAR));
                SubLObject first_sorted_vals = sorted_vals.first();
                SubLObject rest_sorted_vals = sorted_vals.rest();
                format(stream, $str_alt103$____);
                if (start_month.equalp(end_month)) {
                    format(stream, $str_alt118$_a_a___a, new SubLObject[]{ fillstring, string, start_month });
                } else {
                    format(stream, $str_alt127$_a_a___a_to__a, new SubLObject[]{ fillstring, string, start_month, end_month });
                }
                format(stream, $str_alt101$__);
                format(stream, $str_alt122$____________________Total_logins_, aggregate_logins);
                if (NIL != vals) {
                    format(stream, $str_alt101$__);
                    format(stream, $str_alt123$Total_pages_per_active_thesaurus_);
                    {
                        SubLObject n = find_longest_car(sorted_vals);
                        SubLObject diff = subtract(n, length(first_sorted_vals.first()));
                        SubLObject s = Strings.make_string(diff, UNPROVIDED);
                        format(stream, $str_alt118$_a_a___a, new SubLObject[]{ s, first_sorted_vals.first(), second(first_sorted_vals) });
                        {
                            SubLObject cdolist_list_var = rest_sorted_vals;
                            SubLObject pair = NIL;
                            for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                                {
                                    SubLObject diff2 = subtract(n, length(pair.first()));
                                    SubLObject s2 = Strings.make_string(diff2, UNPROVIDED);
                                    format(stream, $str_alt101$__);
                                    format(stream, $str_alt124$_________________________________);
                                    format(stream, $str_alt118$_a_a___a, new SubLObject[]{ s2, pair.first(), second(pair) });
                                }
                            }
                        }
                    }
                }
                format(stream, $str_alt101$__);
                format(stream, $str_alt125$____________Total_pages_accessed_, aggregate_pages);
            }
            return activityP;
        }
    }

    public static final SubLObject total_logins_and_pages_accessed(SubLObject month) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject table = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $MONTH_EVENT_LOG_TABLE);
                SubLObject alist = gethash(month, table, UNPROVIDED);
                SubLObject login_count = ZERO_INTEGER;
                SubLObject page_count = ZERO_INTEGER;
                SubLObject cdolist_list_var = alist;
                SubLObject pair = NIL;
                for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                    {
                        SubLObject vec = pair.rest();
                        SubLObject logins = aref(vec, ZERO_INTEGER);
                        SubLObject pages = aref(vec, TWO_INTEGER);
                        login_count = add(login_count, logins);
                        page_count = add(page_count, pages);
                    }
                }
                return values(login_count, page_count);
            }
        }
    }

    public static final SubLObject output_data_for_month(SubLObject month, SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pretty_month = readable_month(month);
                SubLObject pml = length(pretty_month);
                SubLObject line = Strings.make_string(pml, CHAR_hyphen);
                thread.resetMultipleValues();
                {
                    SubLObject logins = total_logins_and_pages_accessed(month);
                    SubLObject pages = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    format(stream, $str_alt128$_____a___a___a, new SubLObject[]{ line, pretty_month, line });
                    format(stream, $str_alt103$____);
                    format(stream, $str_alt129$________Total_logins_for_the_mont, logins);
                    format(stream, $str_alt101$__);
                    format(stream, $str_alt130$Total_pages_accessed_for_the_mont, pages);
                    {
                        SubLObject table = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $MONTH_EVENT_LOG_TABLE);
                        SubLObject val = gethash(month, table, UNPROVIDED);
                        SubLObject sorted = Sort.sort(val, symbol_function(STRING_LESSP), symbol_function(CAR));
                        SubLObject cdolist_list_var = sorted;
                        SubLObject pair = NIL;
                        for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                            {
                                SubLObject user = pair.first();
                                SubLObject vec = pair.rest();
                                print_month_user_vector($tm_user_print_label$.getGlobalValue(), user, vec, stream);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject output_data_for_users(SubLObject users, SubLObject months, SubLObject stream, SubLObject aggregateP) {
        if (NIL != months) {
            format(stream, $str_alt112$______);
            format(stream, $str_alt131$________________________________);
            format(stream, $str_alt132$______USER_STATISTICS_BY_USER____);
            format(stream, $str_alt131$________________________________);
            {
                SubLObject cdolist_list_var = users;
                SubLObject user = NIL;
                for (user = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , user = cdolist_list_var.first()) {
                    {
                        SubLObject activityP = NIL;
                        activityP = output_data_for_user(user, months, stream, aggregateP);
                        if (NIL == activityP) {
                            format(stream, $str_alt133$______No_activity_during_report_p);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject output_data_for_user(SubLObject user, SubLObject months, SubLObject stream, SubLObject aggregateP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject user_print_string = tm_print_name_for_user_in_report(user);
                SubLObject ul = length(user_print_string);
                SubLObject line = Strings.make_string(ul, CHAR_hyphen);
                SubLObject vecs_list = NIL;
                SubLObject activityP = NIL;
                format(stream, $str_alt128$_____a___a___a, new SubLObject[]{ line, user_print_string, line });
                {
                    SubLObject table = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $USER_EVENT_LOG_TABLE);
                    SubLObject val = gethash(user, table, UNPROVIDED);
                    SubLObject sorted = Sort.sort(val, symbol_function($sym92$_), symbol_function(CAR));
                    SubLObject cdolist_list_var = sorted;
                    SubLObject pair = NIL;
                    for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                        {
                            SubLObject month = pair.first();
                            if (NIL != find(month, months, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                {
                                    SubLObject vec = pair.rest();
                                    SubLObject activity_for_monthP = NIL;
                                    if (NIL != aggregateP) {
                                        vecs_list = cons(pair, vecs_list);
                                    } else {
                                        activity_for_monthP = print_month_user_vector($$$Month, readable_month(month), vec, stream);
                                    }
                                    if (NIL == aggregateP) {
                                        if (NIL != activity_for_monthP) {
                                            activityP = T;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if ((NIL != aggregateP) && (NIL != vecs_list)) {
                    return print_aggregate_months_user_vector(vecs_list, stream, readable_month(months.first()), readable_month(last(months, UNPROVIDED).first()));
                } else {
                    return activityP;
                }
            }
        }
    }

    public static final SubLObject output_data_for_thesauri(SubLObject thesauri, SubLObject months, SubLObject stream, SubLObject aggregateP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject users = make_hash_table($int$200, symbol_function(EQUALP), UNPROVIDED);
                SubLObject num_users = NIL;
                if (NIL != months) {
                    format(stream, $str_alt112$______);
                    format(stream, $str_alt136$_________________________________);
                    format(stream, $str_alt137$______USER_STATISTICS_BY_THESAURU);
                    format(stream, $str_alt136$_________________________________);
                    {
                        SubLObject cdolist_list_var = thesauri;
                        SubLObject thesaurus = NIL;
                        for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                            {
                                SubLObject thes_table = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURUS_EVENT_LOG_TABLE);
                                SubLObject val = gethash(thesaurus, thes_table, UNPROVIDED);
                                SubLObject cdolist_list_var_12 = val;
                                SubLObject pair = NIL;
                                for (pair = cdolist_list_var_12.first(); NIL != cdolist_list_var_12; cdolist_list_var_12 = cdolist_list_var_12.rest() , pair = cdolist_list_var_12.first()) {
                                    {
                                        SubLObject month = pair.first();
                                        if (NIL != find(month, months, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                            {
                                                SubLObject vec = pair.rest();
                                                SubLObject table = aref(vec, ONE_INTEGER);
                                                SubLObject vals = hash_table_utilities.get_table_values(table);
                                                SubLObject cdolist_list_var_13 = vals;
                                                SubLObject value = NIL;
                                                for (value = cdolist_list_var_13.first(); NIL != cdolist_list_var_13; cdolist_list_var_13 = cdolist_list_var_13.rest() , value = cdolist_list_var_13.first()) {
                                                    sethash(value.first(), users, T);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    num_users = hash_table_count(users);
                    format(stream, $str_alt138$__Number_of_users_for_all_thesaur, num_users);
                    {
                        SubLObject cdolist_list_var = thesauri;
                        SubLObject thesaurus = NIL;
                        for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                            {
                                SubLObject activityP = NIL;
                                if (NIL != aggregateP) {
                                    activityP = output_aggregate_data_for_thesaurus(thesaurus, months, stream);
                                } else {
                                    activityP = output_data_for_thesaurus(thesaurus, months, stream);
                                }
                                if (NIL == activityP) {
                                    format(stream, $str_alt133$______No_activity_during_report_p);
                                }
                            }
                        }
                    }
                    format(stream, $str_alt101$__);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject output_data_for_thesaurus(SubLObject thesaurus, SubLObject months, SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject tl = length(thesaurus);
                SubLObject line = Strings.make_string(tl, CHAR_hyphen);
                SubLObject month_label = $str_alt139$Month_;
                SubLObject month_label_length = length($str_alt139$Month_);
                SubLObject tot_pages_accessed_label = $str_alt140$Total_pages_accessed_;
                SubLObject tot_pages_accessed_label_length = length(tot_pages_accessed_label);
                SubLObject num_users_period_label = $str_alt141$Number_of_users_in_report_period_;
                SubLObject num_users_period_label_length = length(num_users_period_label);
                SubLObject tot_pages_per_user_label = $str_alt142$Total_pages_per_user_;
                SubLObject tot_pages_per_user_label_length = length(tot_pages_per_user_label);
                SubLObject main_label_align_column = max(month_label_length, new SubLObject[]{ tot_pages_accessed_label_length, num_users_period_label_length, tot_pages_per_user_label_length });
                SubLObject month_label_fill = Strings.make_string(subtract(main_label_align_column, month_label_length), CHAR_space);
                SubLObject tot_pages_accessed_fill = Strings.make_string(subtract(main_label_align_column, tot_pages_accessed_label_length), CHAR_space);
                SubLObject num_users_period_fill = Strings.make_string(subtract(main_label_align_column, num_users_period_label_length), CHAR_space);
                SubLObject tot_pages_per_user_fill = Strings.make_string(subtract(main_label_align_column, tot_pages_per_user_label_length), CHAR_space);
                SubLObject main_column_align_fill = Strings.make_string(main_label_align_column, CHAR_space);
                SubLObject activityP = NIL;
                format(stream, $str_alt128$_____a___a___a, new SubLObject[]{ line, thesaurus, line });
                {
                    SubLObject thes_table = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURUS_EVENT_LOG_TABLE);
                    SubLObject val = gethash(thesaurus, thes_table, UNPROVIDED);
                    SubLObject sorted = Sort.sort(val, symbol_function($sym92$_), symbol_function(CAR));
                    SubLObject cdolist_list_var = sorted;
                    SubLObject pair = NIL;
                    for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                        {
                            SubLObject month = pair.first();
                            if (NIL != find(month, months, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                activityP = T;
                                {
                                    SubLObject vec = pair.rest();
                                    SubLObject total_pages = aref(vec, ZERO_INTEGER);
                                    SubLObject table = aref(vec, ONE_INTEGER);
                                    SubLObject vals = hash_table_utilities.get_table_values(table);
                                    SubLObject sorted_vals = Sort.sort(vals, symbol_function(STRING_LESSP), symbol_function(CAR));
                                    format(stream, $str_alt103$____);
                                    format(stream, $str_alt143$_a_a__a, new SubLObject[]{ month_label_fill, month_label, readable_month(month) });
                                    format(stream, $str_alt101$__);
                                    format(stream, $str_alt143$_a_a__a, new SubLObject[]{ tot_pages_accessed_fill, tot_pages_accessed_label, total_pages });
                                    format(stream, $str_alt101$__);
                                    format(stream, $str_alt143$_a_a__a, new SubLObject[]{ num_users_period_fill, num_users_period_label, length(remove_duplicates(vals, symbol_function(EQUALP), symbol_function(CAR), UNPROVIDED, UNPROVIDED)) });
                                    if (NIL != vals) {
                                        format(stream, $str_alt101$__);
                                        format(stream, $str_alt144$_a_a_, tot_pages_per_user_fill, tot_pages_per_user_label);
                                        {
                                            SubLObject n = tm_find_longest_print_name(sorted_vals);
                                            SubLObject form = sorted_vals.first();
                                            SubLObject u = tm_print_name_for_user_in_report(form.first());
                                            SubLObject fill = subtract(n, length(u));
                                            SubLObject s = Strings.make_string(fill, UNPROVIDED);
                                            format(stream, $str_alt118$_a_a___a, new SubLObject[]{ s, u, second(form) });
                                            {
                                                SubLObject cdolist_list_var_14 = sorted_vals.rest();
                                                SubLObject x = NIL;
                                                for (x = cdolist_list_var_14.first(); NIL != cdolist_list_var_14; cdolist_list_var_14 = cdolist_list_var_14.rest() , x = cdolist_list_var_14.first()) {
                                                    {
                                                        SubLObject u2 = tm_print_name_for_user_in_report(x.first());
                                                        SubLObject fill2 = subtract(n, length(u2));
                                                        SubLObject s2 = Strings.make_string(fill2, UNPROVIDED);
                                                        format(stream, $str_alt101$__);
                                                        format(stream, $str_alt145$_a_, main_column_align_fill);
                                                        format(stream, $str_alt118$_a_a___a, new SubLObject[]{ s2, u2, second(x) });
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return activityP;
            }
        }
    }

    public static final SubLObject output_aggregate_data_for_thesaurus(SubLObject thesaurus, SubLObject months, SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject tl = length(thesaurus);
                SubLObject line = Strings.make_string(tl, CHAR_hyphen);
                SubLObject time_period_label = $str_alt126$Time_period_;
                SubLObject time_period_label_length = length($str_alt126$Time_period_);
                SubLObject tot_pages_accessed_label = $str_alt140$Total_pages_accessed_;
                SubLObject tot_pages_accessed_label_length = length(tot_pages_accessed_label);
                SubLObject num_users_period_label = $str_alt141$Number_of_users_in_report_period_;
                SubLObject num_users_period_label_length = length(num_users_period_label);
                SubLObject tot_pages_per_user_label = $str_alt142$Total_pages_per_user_;
                SubLObject tot_pages_per_user_label_length = length(tot_pages_per_user_label);
                SubLObject main_label_align_column = max(time_period_label_length, new SubLObject[]{ tot_pages_accessed_label_length, num_users_period_label_length, tot_pages_per_user_label_length });
                SubLObject time_period_label_fill = Strings.make_string(subtract(main_label_align_column, time_period_label_length), CHAR_space);
                SubLObject tot_pages_accessed_fill = Strings.make_string(subtract(main_label_align_column, tot_pages_accessed_label_length), CHAR_space);
                SubLObject num_users_period_fill = Strings.make_string(subtract(main_label_align_column, num_users_period_label_length), CHAR_space);
                SubLObject tot_pages_per_user_fill = Strings.make_string(subtract(main_label_align_column, tot_pages_per_user_label_length), CHAR_space);
                SubLObject main_column_align_fill = Strings.make_string(main_label_align_column, CHAR_space);
                SubLObject start_month = readable_month(months.first());
                SubLObject end_month = readable_month(last(months, UNPROVIDED).first());
                SubLObject activityP = NIL;
                SubLObject thes_table = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURUS_EVENT_LOG_TABLE);
                SubLObject val = gethash(thesaurus, thes_table, UNPROVIDED);
                SubLObject sorted = Sort.sort(val, symbol_function($sym92$_), symbol_function(CAR));
                SubLObject aggregate_pages = ZERO_INTEGER;
                SubLObject users = make_hash_table($int$200, symbol_function(EQUALP), UNPROVIDED);
                {
                    SubLObject cdolist_list_var = sorted;
                    SubLObject pair = NIL;
                    for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                        {
                            SubLObject month = pair.first();
                            if (NIL != find(month, months, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                activityP = T;
                                {
                                    SubLObject vec = pair.rest();
                                    SubLObject month_pages = aref(vec, ZERO_INTEGER);
                                    SubLObject table = aref(vec, ONE_INTEGER);
                                    SubLObject vals = hash_table_utilities.get_table_values(table);
                                    aggregate_pages = add(month_pages, aggregate_pages);
                                    {
                                        SubLObject cdolist_list_var_15 = vals;
                                        SubLObject value = NIL;
                                        for (value = cdolist_list_var_15.first(); NIL != cdolist_list_var_15; cdolist_list_var_15 = cdolist_list_var_15.rest() , value = cdolist_list_var_15.first()) {
                                            if (gethash(value.first(), users, UNPROVIDED) == NIL) {
                                                sethash(value.first(), users, second(value));
                                            } else {
                                                sethash(value.first(), users, add(second(value), gethash(value.first(), users, UNPROVIDED)));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject vals_users = hash_table_utilities.get_table_values(users);
                    SubLObject sorted_users = Sort.sort(vals_users, symbol_function(STRING_LESSP), symbol_function(CAR));
                    format(stream, $str_alt128$_____a___a___a, new SubLObject[]{ line, thesaurus, line });
                    format(stream, $str_alt103$____);
                    if (NIL != activityP) {
                        if (start_month.equalp(end_month)) {
                            format(stream, $str_alt143$_a_a__a, new SubLObject[]{ time_period_label_fill, time_period_label, start_month });
                        } else {
                            format(stream, $str_alt146$_a_a__a_to__a, new SubLObject[]{ time_period_label_fill, time_period_label, start_month, end_month });
                        }
                        format(stream, $str_alt101$__);
                        format(stream, $str_alt143$_a_a__a, new SubLObject[]{ tot_pages_accessed_fill, tot_pages_accessed_label, aggregate_pages });
                        format(stream, $str_alt101$__);
                        format(stream, $str_alt143$_a_a__a, new SubLObject[]{ num_users_period_fill, num_users_period_label, hash_table_count(users) });
                        if (NIL != vals_users) {
                            format(stream, $str_alt101$__);
                            format(stream, $str_alt144$_a_a_, tot_pages_per_user_fill, tot_pages_per_user_label);
                            {
                                SubLObject n = tm_find_longest_print_name(sorted_users);
                                SubLObject form = sorted_users.first();
                                SubLObject u = tm_print_name_for_user_in_report(form.first());
                                SubLObject fill = subtract(n, length(u));
                                SubLObject s = Strings.make_string(fill, UNPROVIDED);
                                format(stream, $str_alt118$_a_a___a, new SubLObject[]{ s, u, second(form) });
                                {
                                    SubLObject cdolist_list_var = sorted_users.rest();
                                    SubLObject x = NIL;
                                    for (x = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , x = cdolist_list_var.first()) {
                                        {
                                            SubLObject u2 = tm_print_name_for_user_in_report(x.first());
                                            SubLObject fill2 = subtract(n, length(u2));
                                            SubLObject s2 = Strings.make_string(fill2, UNPROVIDED);
                                            format(stream, $str_alt101$__);
                                            format(stream, $str_alt145$_a_, main_column_align_fill);
                                            format(stream, $str_alt118$_a_a___a, new SubLObject[]{ s2, u2, second(x) });
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return activityP;
            }
        }
    }

    public static final SubLObject tm_find_longest_print_name(SubLObject sorted_vals) {
        {
            SubLObject longest = ZERO_INTEGER;
            SubLObject current = ZERO_INTEGER;
            SubLObject cdolist_list_var = sorted_vals;
            SubLObject pair = NIL;
            for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                current = length(tm_print_name_for_user_in_report(pair.first()));
                if (current.numG(longest)) {
                    longest = current;
                }
            }
            return longest;
        }
    }

    public static final SubLObject construct_user_report_pathname(SubLObject filename) {
        return format(NIL, $str_alt23$_a_a, tm_datastructures.$tm_report_directory$.getGlobalValue(), filename);
    }

    public static final SubLObject make_date_identifier() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject day = numeric_date_utilities.decode_universal_date(numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED));
                SubLObject month = thread.secondMultipleValue();
                SubLObject year = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                return format(NIL, $str_alt147$_a__a__a, new SubLObject[]{ year, month, day });
            }
        }
    }

    public static final SubLObject construct_user_report_filename(SubLObject start_month, SubLObject end_month) {
        if (start_month == UNPROVIDED) {
            start_month = NIL;
        }
        if (end_month == UNPROVIDED) {
            end_month = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject extension = (NIL != string_utilities.non_empty_stringP($tm_user_report_filename_extension$.getDynamicValue(thread))) ? ((SubLObject) (format(NIL, $str_alt26$__a, $tm_user_report_filename_extension$.getDynamicValue(thread)))) : $str_alt16$;
                SubLObject filename = format(NIL, $str_alt148$_a_, $tm_user_report_filename_base$.getDynamicValue(thread));
                SubLObject date = NIL;
                if ((NIL != start_month) && (NIL != end_month)) {
                    {
                        SubLObject start_date = add_day_to_month_year_integer(start_month, ONE_INTEGER);
                        SubLObject end_date = (end_month.numGE(cyc_month())) ? ((SubLObject) (cyc_date())) : add_day_to_month_year_integer(end_month, $int$31);
                        if (end_month.numGE(cyc_month())) {
                            date = format(NIL, $str_alt150$_a__a__a_to__a__a__a, new SubLObject[]{ extract_month_integer_from_date(start_date), extract_day_integer_from_date(start_date), extract_year_integer_from_date(start_date), extract_month_integer_from_date(end_date), extract_day_integer_from_date(end_date), extract_year_integer_from_date(end_date) });
                        } else {
                            date = format(NIL, $str_alt151$_a__a__a_through__a__a, new SubLObject[]{ extract_month_integer_from_date(start_date), extract_day_integer_from_date(start_date), extract_year_integer_from_date(start_date), extract_month_integer_from_date(end_date), extract_year_integer_from_date(end_date) });
                        }
                    }
                } else {
                    date = make_date_identifier();
                }
                filename = cconcatenate(filename, new SubLObject[]{ date, extension });
                return filename;
            }
        }
    }

    public static final SubLObject tm_user_report_filename(SubLObject start_month, SubLObject end_month) {
        if (start_month == UNPROVIDED) {
            start_month = NIL;
        }
        if (end_month == UNPROVIDED) {
            end_month = NIL;
        }
        return construct_user_report_pathname(construct_user_report_filename(start_month, end_month));
    }

    public static final SubLObject tm_maybe_generate_user_report(SubLObject start_month, SubLObject end_month, SubLObject aggregateP, SubLObject monthP, SubLObject userP, SubLObject thesaurusP) {
        if (start_month == UNPROVIDED) {
            start_month = NIL;
        }
        if (end_month == UNPROVIDED) {
            end_month = NIL;
        }
        if (aggregateP == UNPROVIDED) {
            aggregateP = NIL;
        }
        if (monthP == UNPROVIDED) {
            monthP = NIL;
        }
        if (userP == UNPROVIDED) {
            userP = NIL;
        }
        if (thesaurusP == UNPROVIDED) {
            thesaurusP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject outfile = tm_user_report_filename(start_month, end_month);
                SubLObject data_processedP = NIL;
                tm_process_event_log_files(UNPROVIDED);
                if (hash_table_count(tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $MONTH_EVENT_LOG_TABLE)).numG(ZERO_INTEGER)) {
                    data_processedP = T;
                    {
                        SubLObject stream = NIL;
                        try {
                            stream = compatibility.open_text(outfile, $OUTPUT, NIL);
                            if (!stream.isStream()) {
                                Errors.error($str_alt14$Unable_to_open__S, outfile);
                            }
                            {
                                SubLObject stream_16 = stream;
                                tm_output_user_statistics(stream_16, start_month, end_month, aggregateP, monthP, userP, thesaurusP);
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
                if (NIL != data_processedP) {
                    return outfile;
                } else {
                    return NIL;
                }
            }
        }
    }

    public static final SubLObject tm_tmap_activity_herald(SubLObject stream, SubLObject start_month, SubLObject end_month) {
        if (start_month == UNPROVIDED) {
            start_month = NIL;
        }
        if (end_month == UNPROVIDED) {
            end_month = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            format(stream, $str_alt101$__);
            format(stream, $$$TMAP_ACTIVITY_REPORT);
            format(stream, $str_alt103$____);
            format(stream, $str_alt104$This_report_requested_by___a, tm_print_name_for_user_in_report(tm_datastructures.$tm_user$.getDynamicValue(thread)));
            format(stream, $str_alt101$__);
            format(stream, $str_alt105$__Report_generation_time___a, numeric_date_utilities.timestring(UNPROVIDED));
            if ((NIL != start_month) && (NIL != end_month)) {
                format(stream, $str_alt101$__);
                if (end_month.numGE(cyc_month())) {
                    format(stream, $str_alt106$__Report_for_period_covering_from, readable_month(start_month), current_date_string());
                } else {
                    format(stream, $str_alt107$__Report_for_period_covering_from, readable_month(start_month), readable_month(end_month));
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cyc_month_falls_between(SubLObject cyc_month) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL == $tmap_stats_start_month$.getDynamicValue(thread)) && (NIL == $tmap_stats_end_month$.getDynamicValue(thread))) {
                return T;
            } else
                if (NIL == $tmap_stats_start_month$.getDynamicValue(thread)) {
                    return numLE(cyc_month, $tmap_stats_end_month$.getDynamicValue(thread));
                } else
                    if (NIL == $tmap_stats_end_month$.getDynamicValue(thread)) {
                        return numGE(cyc_month, $tmap_stats_start_month$.getDynamicValue(thread));
                    } else
                        if (cyc_month.numLE($tmap_stats_end_month$.getDynamicValue(thread)) && cyc_month.numGE($tmap_stats_start_month$.getDynamicValue(thread))) {
                            return T;
                        } else {
                            return NIL;
                        }



        }
    }

    public static final SubLObject select_tmap_data_for_months(SubLObject start_month, SubLObject end_month, SubLObject table) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $tmap_stats_start_month$.currentBinding(thread);
                SubLObject _prev_bind_1 = $tmap_stats_end_month$.currentBinding(thread);
                try {
                    $tmap_stats_start_month$.bind(start_month, thread);
                    $tmap_stats_end_month$.bind(end_month, thread);
                    {
                        SubLObject key = NIL;
                        SubLObject list_of_month_vals = NIL;
                        {
                            final Iterator cdohash_iterator = getEntrySetIterator(table);
                            try {
                                while (iteratorHasNext(cdohash_iterator)) {
                                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                    key = getEntryKey(cdohash_entry);
                                    list_of_month_vals = getEntryValue(cdohash_entry);
                                    list_of_month_vals = list_utilities.delete_if_not(symbol_function(CYC_MONTH_FALLS_BETWEEN), list_of_month_vals, symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    list_of_month_vals = Sort.sort(list_of_month_vals, symbol_function($sym92$_), symbol_function(CAR));
                                    sethash(key, table, list_of_month_vals);
                                } 
                            } finally {
                                releaseEntrySetIterator(cdohash_iterator);
                            }
                        }
                    }
                } finally {
                    $tmap_stats_end_month$.rebind(_prev_bind_1, thread);
                    $tmap_stats_start_month$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_output_tmap_statistics(SubLObject stream, SubLObject start_month, SubLObject end_month) {
        if (start_month == UNPROVIDED) {
            start_month = NIL;
        }
        if (end_month == UNPROVIDED) {
            end_month = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject application_table = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $APPLICATION_TMAP_LOG_TABLE);
                SubLObject thesaurus_table = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURUS_TMAP_LOG_TABLE);
                SubLObject applications = hash_table_utilities.hash_table_keys(application_table);
                SubLObject thesauri = hash_table_utilities.hash_table_keys(thesaurus_table);
                SubLObject section_break = Strings.make_string($int$70, CHAR_hyphen);
                SubLObject first_month_in_period = NIL;
                SubLObject last_month_in_period = NIL;
                applications = Sort.sort(applications, symbol_function(STRING_LESSP), UNPROVIDED);
                thesauri = Sort.sort(thesauri, symbol_function(STRING_LESSP), UNPROVIDED);
                select_tmap_data_for_months(start_month, end_month, thesaurus_table);
                select_tmap_data_for_months(start_month, end_month, application_table);
                if (NIL != start_month) {
                    first_month_in_period = start_month;
                }
                if (NIL != end_month) {
                    last_month_in_period = end_month;
                }
                tm_tmap_activity_herald(stream, first_month_in_period, last_month_in_period);
                output_tmap_data_for_applications(applications, stream);
                format(stream, $str_alt111$_______a___a__, section_break, section_break);
                output_tmap_data_for_thesauri(thesauri, stream);
            }
            return NIL;
        }
    }

    public static final SubLObject output_tmap_data_for_applications(SubLObject applications, SubLObject stream) {
        format(stream, $str_alt112$______);
        format(stream, $str_alt154$_________________________________);
        format(stream, $str_alt155$______TMAP_STATISTICS_BY_APPLICAT);
        format(stream, $str_alt154$_________________________________);
        {
            SubLObject cdolist_list_var = applications;
            SubLObject application = NIL;
            for (application = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , application = cdolist_list_var.first()) {
                {
                    SubLObject activityP = NIL;
                    activityP = output_tmap_data_for_application(application, stream);
                    if (NIL == activityP) {
                        format(stream, $str_alt133$______No_activity_during_report_p);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject output_tmap_data_for_application(SubLObject application, SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject application_print_string = application;
                SubLObject ul = length(application_print_string);
                SubLObject line = Strings.make_string(ul, CHAR_hyphen);
                SubLObject activityP = NIL;
                format(stream, $str_alt128$_____a___a___a, new SubLObject[]{ line, application_print_string, line });
                {
                    SubLObject table = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $APPLICATION_TMAP_LOG_TABLE);
                    SubLObject val = gethash(application, table, UNPROVIDED);
                    SubLObject sorted = val;
                    SubLObject cdolist_list_var = sorted;
                    SubLObject pair = NIL;
                    for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                        {
                            SubLObject month = pair.first();
                            SubLObject vec = pair.rest();
                            SubLObject activity_for_monthP = NIL;
                            activity_for_monthP = print_application_vector_for_month($$$Month, readable_month(month), vec, stream);
                            if (NIL != activity_for_monthP) {
                                activityP = T;
                            }
                        }
                    }
                }
                return activityP;
            }
        }
    }

    public static final SubLObject print_application_vector_for_month(SubLObject string, SubLObject key, SubLObject vector, SubLObject stream) {
        {
            SubLObject len = length(string);
            SubLObject fill = subtract($int$32, len);
            SubLObject fillstring = Strings.make_string(fill, UNPROVIDED);
            SubLObject logins = aref(vector, ZERO_INTEGER);
            SubLObject total_pages = aref(vector, ONE_INTEGER);
            SubLObject table = aref(vector, TWO_INTEGER);
            SubLObject vals = hash_table_utilities.get_table_values(table);
            SubLObject sorted_vals = Sort.sort(vals, symbol_function(STRING_LESSP), symbol_function(CAR));
            SubLObject first_sorted_vals = sorted_vals.first();
            SubLObject rest_sorted_vals = sorted_vals.rest();
            SubLObject activityP = T;
            format(stream, $str_alt103$____);
            format(stream, $str_alt118$_a_a___a, new SubLObject[]{ fillstring, string, key });
            format(stream, $str_alt101$__);
            format(stream, $str_alt156$____________Total_session_starts_, logins);
            if (NIL != vals) {
                format(stream, $str_alt101$__);
                format(stream, $str_alt123$Total_pages_per_active_thesaurus_);
                {
                    SubLObject n = find_longest_car(sorted_vals);
                    SubLObject diff = subtract(n, length(first_sorted_vals.first()));
                    SubLObject s = Strings.make_string(diff, UNPROVIDED);
                    format(stream, $str_alt118$_a_a___a, new SubLObject[]{ s, first_sorted_vals.first(), second(first_sorted_vals) });
                    {
                        SubLObject cdolist_list_var = rest_sorted_vals;
                        SubLObject pair = NIL;
                        for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                            {
                                SubLObject diff2 = subtract(n, length(pair.first()));
                                SubLObject s2 = Strings.make_string(diff2, UNPROVIDED);
                                format(stream, $str_alt101$__);
                                format(stream, $str_alt124$_________________________________);
                                format(stream, $str_alt118$_a_a___a, new SubLObject[]{ s2, pair.first(), second(pair) });
                            }
                        }
                    }
                }
            }
            format(stream, $str_alt101$__);
            format(stream, $str_alt157$_________Total_commands_executed_, total_pages);
            return activityP;
        }
    }

    public static final SubLObject output_tmap_data_for_thesauri(SubLObject thesauri, SubLObject stream) {
        format(stream, $str_alt112$______);
        format(stream, $str_alt136$_________________________________);
        format(stream, $str_alt158$______TMAP_STATISTICS_BY_THESAURU);
        format(stream, $str_alt136$_________________________________);
        {
            SubLObject cdolist_list_var = thesauri;
            SubLObject thesaurus = NIL;
            for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                {
                    SubLObject activityP = NIL;
                    activityP = output_tmap_data_for_thesaurus(thesaurus, stream);
                    if (NIL == activityP) {
                        format(stream, $str_alt133$______No_activity_during_report_p);
                    }
                }
            }
        }
        format(stream, $str_alt101$__);
        return NIL;
    }

    public static final SubLObject output_tmap_data_for_thesaurus(SubLObject thesaurus, SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject tl = length(thesaurus);
                SubLObject line = Strings.make_string(tl, CHAR_hyphen);
                SubLObject month_label = $str_alt139$Month_;
                SubLObject month_label_length = length($str_alt139$Month_);
                SubLObject tot_commands_label = $str_alt159$Total_commands_involving_thesauru;
                SubLObject tot_commands_label_length = length(tot_commands_label);
                SubLObject tot_commands_per_application_label = $str_alt160$Total_commands_per_application_;
                SubLObject tot_commands_per_application_label_length = length(tot_commands_per_application_label);
                SubLObject main_label_align_column = max(month_label_length, new SubLObject[]{ tot_commands_label_length, tot_commands_per_application_label_length });
                SubLObject month_label_fill = Strings.make_string(subtract(main_label_align_column, month_label_length), CHAR_space);
                SubLObject tot_commands_fill = Strings.make_string(subtract(main_label_align_column, tot_commands_label_length), CHAR_space);
                SubLObject tot_commands_per_application_fill = Strings.make_string(subtract(main_label_align_column, tot_commands_per_application_label_length), CHAR_space);
                SubLObject main_column_align_fill = Strings.make_string(main_label_align_column, CHAR_space);
                SubLObject activityP = NIL;
                format(stream, $str_alt128$_____a___a___a, new SubLObject[]{ line, thesaurus, line });
                {
                    SubLObject thes_table = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURUS_TMAP_LOG_TABLE);
                    SubLObject val = gethash(thesaurus, thes_table, UNPROVIDED);
                    SubLObject cdolist_list_var = val;
                    SubLObject pair = NIL;
                    for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                        {
                            SubLObject month = pair.first();
                            activityP = T;
                            {
                                SubLObject vec = pair.rest();
                                SubLObject total_commands = aref(vec, ZERO_INTEGER);
                                SubLObject table = aref(vec, ONE_INTEGER);
                                SubLObject vals = hash_table_utilities.get_table_values(table);
                                SubLObject sorted_vals = Sort.sort(vals, symbol_function(STRING_LESSP), symbol_function(CAR));
                                format(stream, $str_alt103$____);
                                format(stream, $str_alt143$_a_a__a, new SubLObject[]{ month_label_fill, month_label, readable_month(month) });
                                format(stream, $str_alt101$__);
                                format(stream, $str_alt143$_a_a__a, new SubLObject[]{ tot_commands_fill, tot_commands_label, total_commands });
                                if (NIL != vals) {
                                    format(stream, $str_alt101$__);
                                    format(stream, $str_alt144$_a_a_, tot_commands_per_application_fill, tot_commands_per_application_label);
                                    {
                                        SubLObject longest = find_longest_car(sorted_vals);
                                        SubLObject first_app_value_pair = sorted_vals.first();
                                        SubLObject print_name_for_app = first_app_value_pair.first();
                                        SubLObject fill = subtract(longest, length(print_name_for_app));
                                        SubLObject s = Strings.make_string(fill, UNPROVIDED);
                                        format(stream, $str_alt118$_a_a___a, new SubLObject[]{ s, print_name_for_app, second(first_app_value_pair) });
                                        {
                                            SubLObject cdolist_list_var_17 = sorted_vals.rest();
                                            SubLObject app_value_pair = NIL;
                                            for (app_value_pair = cdolist_list_var_17.first(); NIL != cdolist_list_var_17; cdolist_list_var_17 = cdolist_list_var_17.rest() , app_value_pair = cdolist_list_var_17.first()) {
                                                {
                                                    SubLObject app_print_name = app_value_pair.first();
                                                    SubLObject fill2 = subtract(longest, length(app_print_name));
                                                    SubLObject s2 = Strings.make_string(fill2, UNPROVIDED);
                                                    format(stream, $str_alt101$__);
                                                    format(stream, $str_alt145$_a_, main_column_align_fill);
                                                    format(stream, $str_alt118$_a_a___a, new SubLObject[]{ s2, app_print_name, second(app_value_pair) });
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return activityP;
            }
        }
    }

    public static final SubLObject construct_tmap_report_pathname(SubLObject filename) {
        return format(NIL, $str_alt23$_a_a, tm_datastructures.$tm_report_directory$.getGlobalValue(), filename);
    }

    public static final SubLObject construct_tmap_report_filename(SubLObject start_month, SubLObject end_month) {
        if (start_month == UNPROVIDED) {
            start_month = NIL;
        }
        if (end_month == UNPROVIDED) {
            end_month = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject extension = (NIL != string_utilities.non_empty_stringP($tm_tmap_report_filename_extension$.getDynamicValue(thread))) ? ((SubLObject) (format(NIL, $str_alt26$__a, $tm_tmap_report_filename_extension$.getDynamicValue(thread)))) : $str_alt16$;
                SubLObject filename = format(NIL, $str_alt148$_a_, $tm_tmap_report_filename_base$.getDynamicValue(thread));
                SubLObject date = NIL;
                if ((NIL != start_month) && (NIL != end_month)) {
                    {
                        SubLObject start_date = add_day_to_month_year_integer(start_month, ONE_INTEGER);
                        SubLObject end_date = (end_month.numGE(cyc_month())) ? ((SubLObject) (cyc_date())) : add_day_to_month_year_integer(end_month, $int$31);
                        if (end_month.numGE(cyc_month())) {
                            date = format(NIL, $str_alt150$_a__a__a_to__a__a__a, new SubLObject[]{ extract_month_integer_from_date(start_date), extract_day_integer_from_date(start_date), extract_year_integer_from_date(start_date), extract_month_integer_from_date(end_date), extract_day_integer_from_date(end_date), extract_year_integer_from_date(end_date) });
                        } else {
                            date = format(NIL, $str_alt151$_a__a__a_through__a__a, new SubLObject[]{ extract_month_integer_from_date(start_date), extract_day_integer_from_date(start_date), extract_year_integer_from_date(start_date), extract_month_integer_from_date(end_date), extract_year_integer_from_date(end_date) });
                        }
                    }
                } else {
                    date = make_date_identifier();
                }
                filename = cconcatenate(filename, new SubLObject[]{ date, extension });
                return filename;
            }
        }
    }

    public static final SubLObject tm_tmap_report_filename(SubLObject start_month, SubLObject end_month) {
        if (start_month == UNPROVIDED) {
            start_month = NIL;
        }
        if (end_month == UNPROVIDED) {
            end_month = NIL;
        }
        return construct_tmap_report_pathname(construct_tmap_report_filename(start_month, end_month));
    }

    public static final SubLObject tm_maybe_generate_tmap_report(SubLObject start_month, SubLObject end_month) {
        if (start_month == UNPROVIDED) {
            start_month = NIL;
        }
        if (end_month == UNPROVIDED) {
            end_month = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject outfile = tm_tmap_report_filename(start_month, end_month);
                SubLObject data_processedP = NIL;
                tm_process_tmap_log_files(UNPROVIDED);
                if (hash_table_count(tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURUS_TMAP_LOG_TABLE)).numG(ZERO_INTEGER) || hash_table_count(tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $APPLICATION_TMAP_LOG_TABLE)).numG(ZERO_INTEGER)) {
                    data_processedP = T;
                    {
                        SubLObject stream = NIL;
                        try {
                            stream = compatibility.open_text(outfile, $OUTPUT, NIL);
                            if (!stream.isStream()) {
                                Errors.error($str_alt14$Unable_to_open__S, outfile);
                            }
                            {
                                SubLObject stream_18 = stream;
                                tm_output_tmap_statistics(stream_18, start_month, end_month);
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
                if (NIL != data_processedP) {
                    return outfile;
                } else {
                    return NIL;
                }
            }
        }
    }

    // defparameter
    private static final SubLSymbol $tm_ops_report_filename_base$ = makeSymbol("*TM-OPS-REPORT-FILENAME-BASE*");

    // defparameter
    private static final SubLSymbol $tm_ops_report_filename_extension$ = makeSymbol("*TM-OPS-REPORT-FILENAME-EXTENSION*");

    public static final SubLObject construct_ops_report_pathname(SubLObject filename) {
        return format(NIL, $str_alt23$_a_a, tm_datastructures.$tm_report_directory$.getGlobalValue(), filename);
    }

    public static final SubLObject construct_ops_report_filename(SubLObject start_date, SubLObject end_date) {
        if (start_date == UNPROVIDED) {
            start_date = NIL;
        }
        if (end_date == UNPROVIDED) {
            end_date = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject extension = (NIL != string_utilities.non_empty_stringP($tm_ops_report_filename_extension$.getDynamicValue(thread))) ? ((SubLObject) (format(NIL, $str_alt26$__a, $tm_ops_report_filename_extension$.getDynamicValue(thread)))) : $str_alt16$;
                SubLObject filename = format(NIL, $str_alt148$_a_, $tm_ops_report_filename_base$.getDynamicValue(thread));
                SubLObject date = NIL;
                if ((NIL != start_date) && (NIL != end_date)) {
                    if (start_date.numE(end_date)) {
                        date = format(NIL, $str_alt147$_a__a__a, new SubLObject[]{ extract_month_integer_from_date(start_date), extract_day_integer_from_date(start_date), extract_year_integer_from_date(start_date) });
                    } else {
                        date = format(NIL, $str_alt150$_a__a__a_to__a__a__a, new SubLObject[]{ extract_month_integer_from_date(start_date), extract_day_integer_from_date(start_date), extract_year_integer_from_date(start_date), extract_month_integer_from_date(end_date), extract_day_integer_from_date(end_date), extract_year_integer_from_date(end_date) });
                    }
                } else {
                    date = make_date_identifier();
                }
                filename = cconcatenate(filename, new SubLObject[]{ date, extension });
                return filename;
            }
        }
    }

    public static final SubLObject tm_ops_report_filename(SubLObject start_day, SubLObject end_day) {
        return construct_ops_report_pathname(construct_ops_report_filename(start_day, end_day));
    }

    public static final SubLObject tm_maybe_generate_ops_report(SubLObject sort_key, SubLObject start_date, SubLObject end_date) {
        if (start_date == UNPROVIDED) {
            start_date = NIL;
        }
        if (end_date == UNPROVIDED) {
            end_date = NIL;
        }
        {
            SubLObject outfile = tm_ops_report_filename(start_date, end_date);
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(outfile, $OUTPUT, NIL);
                if (!stream.isStream()) {
                    Errors.error($str_alt14$Unable_to_open__S, outfile);
                }
                {
                    SubLObject stream_19 = stream;
                    html_tm_utilities.tm_file_ops_report(stream_19, sort_key, start_date, end_date);
                }
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        if (stream.isStream()) {
                            close(stream, UNPROVIDED);
                        }
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return outfile;
        }
    }

    public static final SubLObject declare_tm_logging_file() {
        declareFunction("tm_guid_string_p", "TM-GUID-STRING-P", 1, 0, false);
        declareFunction("tm_log_id", "TM-LOG-ID", 1, 0, false);
        declareFunction("tm_find_term_by_log_id", "TM-FIND-TERM-BY-LOG-ID", 1, 1, false);
        declareFunction("tm_log_id_p", "TM-LOG-ID-P", 1, 1, false);
        declareFunction("init_tm_op_log_thesaurus_table", "INIT-TM-OP-LOG-THESAURUS-TABLE", 0, 0, false);
        declareFunction("save_thesaurus_name_file", "SAVE-THESAURUS-NAME-FILE", 0, 0, false);
        declareFunction("get_logged_thesaurus_names", "GET-LOGGED-THESAURUS-NAMES", 1, 0, false);
        declareFunction("thesaurus_name_list_char_p", "THESAURUS-NAME-LIST-CHAR-P", 1, 0, false);
        declareFunction("explode_thesaurus_name_sequence", "EXPLODE-THESAURUS-NAME-SEQUENCE", 1, 0, false);
        declareFunction("get_logged_thesaurus_id", "GET-LOGGED-THESAURUS-ID", 1, 0, false);
        declareFunction("get_logged_thesauri_ids", "GET-LOGGED-THESAURI-IDS", 0, 0, false);
        declareFunction("fill_tm_op_log_thesaurus_table", "FILL-TM-OP-LOG-THESAURUS-TABLE", 0, 0, false);
        declareFunction("construct_op_log_pathname", "CONSTRUCT-OP-LOG-PATHNAME", 1, 0, false);
        declareFunction("construct_op_log_filename", "CONSTRUCT-OP-LOG-FILENAME", 0, 0, false);
        declareFunction("set_tm_op_log_pathname", "SET-TM-OP-LOG-PATHNAME", 0, 1, false);
        declareFunction("set_thesaurus_name_file_pathname", "SET-THESAURUS-NAME-FILE-PATHNAME", 0, 1, false);
        declareFunction("tm_mt_token_list", "TM-MT-TOKEN-LIST", 1, 0, false);
        declareFunction("tm_enqueue_op_for_log", "TM-ENQUEUE-OP-FOR-LOG", 2, 2, false);
        declareFunction("log_tm_opsP", "LOG-TM-OPS?", 0, 0, false);
        declareFunction("tm_save_ops_to_log", "TM-SAVE-OPS-TO-LOG", 0, 0, false);
        declareFunction("non_hyphen_charP", "NON-HYPHEN-CHAR?", 1, 0, false);
        declareFunction("non_semi_colon_charP", "NON-SEMI-COLON-CHAR?", 1, 0, false);
        declareFunction("log_thesaurus_ops", "LOG-THESAURUS-OPS", 0, 0, false);
        declareFunction("convert_ops_log_file", "CONVERT-OPS-LOG-FILE", 1, 1, false);
        declareFunction("convert_ops_log_files", "CONVERT-OPS-LOG-FILES", 0, 1, false);
        declareFunction("get_ops_log_dispatch_table_value", "GET-OPS-LOG-DISPATCH-TABLE-VALUE", 0, 0, false);
        declareFunction("clear_ops_log_tables", "CLEAR-OPS-LOG-TABLES", 0, 0, false);
        declareFunction("update_ops_user_date_table", "UPDATE-OPS-USER-DATE-TABLE", 4, 0, false);
        declareFunction("update_ops_date_user_table", "UPDATE-OPS-DATE-USER-TABLE", 4, 0, false);
        declareFunction("update_ops_date_time_table", "UPDATE-OPS-DATE-TIME-TABLE", 4, 0, false);
        declareFunction("tm_process_ops_log_file", "TM-PROCESS-OPS-LOG-FILE", 7, 0, false);
        declareFunction("tm_process_ops_log_files", "TM-PROCESS-OPS-LOG-FILES", 5, 1, false);
        declareFunction("tm_count_dtu_ops", "TM-COUNT-DTU-OPS", 0, 0, false);
        declareFunction("tm_count_ops", "TM-COUNT-OPS", 1, 0, false);
        declareFunction("construct_event_log_pathname", "CONSTRUCT-EVENT-LOG-PATHNAME", 1, 0, false);
        declareFunction("construct_event_log_filename", "CONSTRUCT-EVENT-LOG-FILENAME", 0, 0, false);
        declareFunction("set_tm_event_log_pathname", "SET-TM-EVENT-LOG-PATHNAME", 0, 1, false);
        declareFunction("tm_enqueue_event", "TM-ENQUEUE-EVENT", 1, 0, false);
        declareFunction("tm_update_event_table", "TM-UPDATE-EVENT-TABLE", 3, 0, false);
        declareFunction("log_tm_eventsP", "LOG-TM-EVENTS?", 0, 0, false);
        declareFunction("tm_save_events_to_log", "TM-SAVE-EVENTS-TO-LOG", 0, 0, false);
        declareFunction("log_thesaurus_events", "LOG-THESAURUS-EVENTS", 0, 0, false);
        declareFunction("construct_tmap_log_pathname", "CONSTRUCT-TMAP-LOG-PATHNAME", 1, 0, false);
        declareFunction("construct_tmap_log_filename", "CONSTRUCT-TMAP-LOG-FILENAME", 0, 0, false);
        declareFunction("set_tm_tmap_log_pathname", "SET-TM-TMAP-LOG-PATHNAME", 0, 1, false);
        declareFunction("tm_update_tmap_log_table", "TM-UPDATE-TMAP-LOG-TABLE", 4, 0, false);
        declareFunction("log_tmap_eventsP", "LOG-TMAP-EVENTS?", 0, 0, false);
        declareFunction("tm_save_tmap_events_to_log", "TM-SAVE-TMAP-EVENTS-TO-LOG", 0, 0, false);
        declareFunction("log_tmap_events", "LOG-TMAP-EVENTS", 0, 0, false);
        declareFunction("month_Ginteger", "MONTH->INTEGER", 1, 0, false);
        declareFunction("integer_Gmonth", "INTEGER->MONTH", 1, 0, false);
        declareFunction("integer_string_Gmonth", "INTEGER-STRING->MONTH", 1, 0, false);
        declareFunction("month_Ginteger_string", "MONTH->INTEGER-STRING", 1, 0, false);
        declareFunction("cyc_date", "CYC-DATE", 0, 0, false);
        declareFunction("cyc_month", "CYC-MONTH", 0, 0, false);
        declareFunction("cyc_day_integer", "CYC-DAY-INTEGER", 0, 0, false);
        declareFunction("cyc_month_integer", "CYC-MONTH-INTEGER", 0, 0, false);
        declareFunction("cyc_year_integer", "CYC-YEAR-INTEGER", 0, 0, false);
        declareFunction("extract_day_integer_from_date", "EXTRACT-DAY-INTEGER-FROM-DATE", 1, 0, false);
        declareFunction("extract_month_integer_from_date", "EXTRACT-MONTH-INTEGER-FROM-DATE", 1, 0, false);
        declareFunction("extract_year_integer_from_date", "EXTRACT-YEAR-INTEGER-FROM-DATE", 1, 0, false);
        declareFunction("add_day_to_month_year_integer", "ADD-DAY-TO-MONTH-YEAR-INTEGER", 2, 0, false);
        declareFunction("current_date_string", "CURRENT-DATE-STRING", 0, 0, false);
        declareFunction("cyc_time", "CYC-TIME", 0, 0, false);
        declareFunction("tm_make_cyc_date", "TM-MAKE-CYC-DATE", 3, 0, false);
        declareFunction("tm_make_datestring", "TM-MAKE-DATESTRING", 1, 0, false);
        declareFunction("tm_make_timestring", "TM-MAKE-TIMESTRING", 1, 0, false);
        declareFunction("make_month_user_vector", "MAKE-MONTH-USER-VECTOR", 0, 0, false);
        declareFunction("ok_user_event_formP", "OK-USER-EVENT-FORM?", 1, 0, false);
        declareFunction("update_month_user_vector", "UPDATE-MONTH-USER-VECTOR", 2, 0, false);
        declareFunction("month_from_cyc_date", "MONTH-FROM-CYC-DATE", 1, 0, false);
        declareFunction("tm_update_month_user_tables", "TM-UPDATE-MONTH-USER-TABLES", 1, 0, false);
        declareFunction("make_thesaurus_month_vector", "MAKE-THESAURUS-MONTH-VECTOR", 0, 0, false);
        declareFunction("update_thesaurus_month_vector", "UPDATE-THESAURUS-MONTH-VECTOR", 2, 0, false);
        declareFunction("tm_update_thesaurus_month_table", "TM-UPDATE-THESAURUS-MONTH-TABLE", 1, 0, false);
        declareFunction("get_log_filenames", "GET-LOG-FILENAMES", 1, 1, false);
        declareFunction("clear_event_log_tables", "CLEAR-EVENT-LOG-TABLES", 0, 0, false);
        declareFunction("tm_process_event_log_file", "TM-PROCESS-EVENT-LOG-FILE", 1, 0, false);
        declareFunction("tm_process_event_log_files", "TM-PROCESS-EVENT-LOG-FILES", 0, 1, false);
        declareFunction("clear_tmap_log_tables", "CLEAR-TMAP-LOG-TABLES", 0, 0, false);
        declareFunction("tm_process_tmap_log_file", "TM-PROCESS-TMAP-LOG-FILE", 1, 0, false);
        declareFunction("tm_process_tmap_log_files", "TM-PROCESS-TMAP-LOG-FILES", 0, 1, false);
        declareFunction("ok_tmap_event_formP", "OK-TMAP-EVENT-FORM?", 1, 0, false);
        declareFunction("make_tmap_thesaurus_month_vector", "MAKE-TMAP-THESAURUS-MONTH-VECTOR", 0, 0, false);
        declareFunction("update_tmap_thesaurus_month_vector", "UPDATE-TMAP-THESAURUS-MONTH-VECTOR", 2, 0, false);
        declareFunction("tm_update_thesaurus_tmap_table", "TM-UPDATE-THESAURUS-TMAP-TABLE", 1, 0, false);
        declareFunction("make_tmap_month_application_vector", "MAKE-TMAP-MONTH-APPLICATION-VECTOR", 0, 0, false);
        declareFunction("update_tmap_month_application_vector", "UPDATE-TMAP-MONTH-APPLICATION-VECTOR", 2, 0, false);
        declareFunction("tm_update_application_tmap_table", "TM-UPDATE-APPLICATION-TMAP-TABLE", 1, 0, false);
        declareFunction("sort_table_keys", "SORT-TABLE-KEYS", 1, 1, false);
        declareFunction("tm_sort_month_keys", "TM-SORT-MONTH-KEYS", 0, 0, false);
        declareFunction("tm_sort_user_keys", "TM-SORT-USER-KEYS", 0, 0, false);
        declareFunction("tm_sort_thesaurus_keys", "TM-SORT-THESAURUS-KEYS", 0, 0, false);
        declareFunction("extract_month_integer", "EXTRACT-MONTH-INTEGER", 1, 0, false);
        declareFunction("extract_year_integer", "EXTRACT-YEAR-INTEGER", 1, 0, false);
        declareFunction("readable_month", "READABLE-MONTH", 1, 0, false);
        declareFunction("readable_day", "READABLE-DAY", 1, 0, false);
        declareFunction("tm_print_name_for_user_in_report", "TM-PRINT-NAME-FOR-USER-IN-REPORT", 1, 0, false);
        declareFunction("select_numbers_in_range", "SELECT-NUMBERS-IN-RANGE", 1, 2, false);
        declareFunction("tm_event_use_herald", "TM-EVENT-USE-HERALD", 1, 2, false);
        declareFunction("tm_output_user_statistics", "TM-OUTPUT-USER-STATISTICS", 1, 6, false);
        declareFunction("output_data_for_months", "OUTPUT-DATA-FOR-MONTHS", 2, 0, false);
        declareFunction("find_longest_car", "FIND-LONGEST-CAR", 1, 0, false);
        declareFunction("print_month_user_vector", "PRINT-MONTH-USER-VECTOR", 4, 0, false);
        declareFunction("print_aggregate_months_user_vector", "PRINT-AGGREGATE-MONTHS-USER-VECTOR", 4, 0, false);
        declareFunction("total_logins_and_pages_accessed", "TOTAL-LOGINS-AND-PAGES-ACCESSED", 1, 0, false);
        declareFunction("output_data_for_month", "OUTPUT-DATA-FOR-MONTH", 2, 0, false);
        declareFunction("output_data_for_users", "OUTPUT-DATA-FOR-USERS", 4, 0, false);
        declareFunction("output_data_for_user", "OUTPUT-DATA-FOR-USER", 4, 0, false);
        declareFunction("output_data_for_thesauri", "OUTPUT-DATA-FOR-THESAURI", 4, 0, false);
        declareFunction("output_data_for_thesaurus", "OUTPUT-DATA-FOR-THESAURUS", 3, 0, false);
        declareFunction("output_aggregate_data_for_thesaurus", "OUTPUT-AGGREGATE-DATA-FOR-THESAURUS", 3, 0, false);
        declareFunction("tm_find_longest_print_name", "TM-FIND-LONGEST-PRINT-NAME", 1, 0, false);
        declareFunction("construct_user_report_pathname", "CONSTRUCT-USER-REPORT-PATHNAME", 1, 0, false);
        declareFunction("make_date_identifier", "MAKE-DATE-IDENTIFIER", 0, 0, false);
        declareFunction("construct_user_report_filename", "CONSTRUCT-USER-REPORT-FILENAME", 0, 2, false);
        declareFunction("tm_user_report_filename", "TM-USER-REPORT-FILENAME", 0, 2, false);
        declareFunction("tm_maybe_generate_user_report", "TM-MAYBE-GENERATE-USER-REPORT", 0, 6, false);
        declareFunction("tm_tmap_activity_herald", "TM-TMAP-ACTIVITY-HERALD", 1, 2, false);
        declareFunction("cyc_month_falls_between", "CYC-MONTH-FALLS-BETWEEN", 1, 0, false);
        declareFunction("select_tmap_data_for_months", "SELECT-TMAP-DATA-FOR-MONTHS", 3, 0, false);
        declareFunction("tm_output_tmap_statistics", "TM-OUTPUT-TMAP-STATISTICS", 1, 2, false);
        declareFunction("output_tmap_data_for_applications", "OUTPUT-TMAP-DATA-FOR-APPLICATIONS", 2, 0, false);
        declareFunction("output_tmap_data_for_application", "OUTPUT-TMAP-DATA-FOR-APPLICATION", 2, 0, false);
        declareFunction("print_application_vector_for_month", "PRINT-APPLICATION-VECTOR-FOR-MONTH", 4, 0, false);
        declareFunction("output_tmap_data_for_thesauri", "OUTPUT-TMAP-DATA-FOR-THESAURI", 2, 0, false);
        declareFunction("output_tmap_data_for_thesaurus", "OUTPUT-TMAP-DATA-FOR-THESAURUS", 2, 0, false);
        declareFunction("construct_tmap_report_pathname", "CONSTRUCT-TMAP-REPORT-PATHNAME", 1, 0, false);
        declareFunction("construct_tmap_report_filename", "CONSTRUCT-TMAP-REPORT-FILENAME", 0, 2, false);
        declareFunction("tm_tmap_report_filename", "TM-TMAP-REPORT-FILENAME", 0, 2, false);
        declareFunction("tm_maybe_generate_tmap_report", "TM-MAYBE-GENERATE-TMAP-REPORT", 0, 2, false);
        declareFunction("construct_ops_report_pathname", "CONSTRUCT-OPS-REPORT-PATHNAME", 1, 0, false);
        declareFunction("construct_ops_report_filename", "CONSTRUCT-OPS-REPORT-FILENAME", 0, 2, false);
        declareFunction("tm_ops_report_filename", "TM-OPS-REPORT-FILENAME", 2, 0, false);
        declareFunction("tm_maybe_generate_ops_report", "TM-MAYBE-GENERATE-OPS-REPORT", 1, 2, false);
        return NIL;
    }

    public static final SubLObject init_tm_logging_file() {
        defparameter("*TM-OP-RESULT-TYPES-TO-LOG*", $list_alt0);
        defparameter("*TM-OP-LOG-WORRY-SIZE*", TWENTY_INTEGER);
        defparameter("*TM-OP-LOG-SAVE-QUANTUM*", $int$300);
        defparameter("*TM-OP-LOG-NEXT-SAVE-TIME*", ZERO_INTEGER);
        defparameter("*TM-OP-LOG-QUEUE*", queues.create_queue());
        defparameter("*TM-OP-LOG-IDENTIFIER*", $$$ops);
        defparameter("*TM-OP-LOG-FILENAME-EXTENSION*", $$$log);
        defparameter("*TM-OP-LOG-PATHNAME*", NIL);
        defparameter("*TM-OP-LOG-VERSION*", ZERO_INTEGER);
        defparameter("*TM-OP-LOG-MAX-FILESIZE*", $int$100000);
        defparameter("*TM-OP-LOG-THESAURUS-TABLE*", NIL);
        defparameter("*THESAURUS-NAME-FILENAME*", $str_alt6$thesaurus_names);
        defparameter("*THESAURUS-NAME-FILE-PATHNAME*", NIL);
        defconstant("*TM-USER-PRINT-LABEL*", $$$User);
        defvar("*TMAP-STATS-START-MONTH*", NIL);
        defvar("*TMAP-STATS-END-MONTH*", NIL);
        defparameter("*TM-LOG-ID-VERSION*", $HL);
        defparameter("*TM-OPS-LOG-DISPATCH-TABLE*", $list_alt46);
        defparameter("*TM-LOG-EVENTS*", T);
        defparameter("*TM-EVENT-LOG-WORRY-SIZE*", TWENTY_INTEGER);
        defparameter("*TM-EVENT-LOG-TABLE*", make_hash_table($int$100, symbol_function(EQUAL), UNPROVIDED));
        defparameter("*TM-EVENT-LOG-IDENTIFIER*", $$$evt);
        defparameter("*TM-EVENT-LOG-FILENAME-EXTENSION*", $$$log);
        defparameter("*TM-EVENT-LOG-PATHNAME*", NIL);
        defparameter("*TM-USER-REPORT-IDENTIFIER*", $$$rpt);
        defparameter("*TM-USER-REPORT-FILENAME-BASE*", $str_alt57$thesauri_users);
        defparameter("*TM-USER-REPORT-FILENAME-EXTENSION*", $$$rpt);
        defparameter("*TM-THESAURUS-REPORT-IDENTIFIER*", $$$stats);
        defparameter("*TM-EVENT-LOG-NEXT-SAVE-TIME*", ZERO_INTEGER);
        defparameter("*TM-EVENT-LOG-VERSION*", ZERO_INTEGER);
        defparameter("*TM-EVENT-LOG-MAX-FILESIZE*", $int$100000);
        defparameter("*TM-PASSWORD-PAGE-TITLE*", $str_alt16$);
        defparameter("*TM-TMAP-LOG-WORRY-SIZE*", TWENTY_INTEGER);
        defparameter("*TM-TMAP-LOG-TABLE*", make_hash_table($int$100, symbol_function(EQUAL), UNPROVIDED));
        defparameter("*TM-TMAP-LOG-IDENTIFIER*", $$$tmap);
        defparameter("*TM-TMAP-LOG-FILENAME-EXTENSION*", $$$log);
        defparameter("*TM-TMAP-LOG-PATHNAME*", NIL);
        defparameter("*TM-TMAP-REPORT-IDENTIFIER*", $$$rpt);
        defparameter("*TM-TMAP-REPORT-FILENAME-BASE*", $$$api);
        defparameter("*TM-TMAP-REPORT-FILENAME-EXTENSION*", $$$rpt);
        defparameter("*TM-TMAP-LOG-NEXT-SAVE-TIME*", ZERO_INTEGER);
        defparameter("*TM-TMAP-LOG-VERSION*", ZERO_INTEGER);
        defparameter("*TM-TMAP-LOG-MAX-FILESIZE*", $int$100000);
        defparameter("*INTEGER-MONTH-NAME-TABLE*", $list_alt68);
        defparameter("*TM-USER-REPORT-INDENT*", ZERO_INTEGER);
        defparameter("*TM-OPS-REPORT-FILENAME-BASE*", $$$ops);
        defparameter("*TM-OPS-REPORT-FILENAME-EXTENSION*", $$$rpt);
        return NIL;
    }

    public static final SubLObject setup_tm_logging_file() {
                utilities_macros.register_html_state_variable($tm_op_log_thesaurus_table$);
        return NIL;
    }

    // // Internal Constants
    static private final SubLList $list_alt0 = list(makeKeyword("OK"), makeKeyword("WARNING"), makeKeyword("ERROR"));

    public static final SubLInteger $int$300 = makeInteger(300);

    static private final SubLString $$$ops = makeString("ops");

    static private final SubLString $$$log = makeString("log");

    public static final SubLInteger $int$100000 = makeInteger(100000);

    public static final SubLSymbol $tm_op_log_thesaurus_table$ = makeSymbol("*TM-OP-LOG-THESAURUS-TABLE*");

    static private final SubLString $str_alt6$thesaurus_names = makeString("thesaurus-names");

    static private final SubLString $$$User = makeString("User");







    static private final SubLString $str_alt11$Unknown_type__A_for__tm_log_id_ve = makeString("Unknown type ~A for *tm-log-id-version*");

    public static final SubLInteger $int$50 = makeInteger(50);



    static private final SubLString $str_alt14$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt15$__s__s___ = makeString("(~s ~s)~%");

    static private final SubLString $str_alt16$ = makeString("");

    static private final SubLString $str_alt17$_ = makeString("/");

    private static final SubLSymbol THESAURUS_NAME_LIST_CHAR_P = makeSymbol("THESAURUS-NAME-LIST-CHAR-P");

    private static final SubLSymbol $DO_HASH_TABLE = makeKeyword("DO-HASH-TABLE");







    static private final SubLString $str_alt23$_a_a = makeString("~a~a");

    static private final SubLString $str_alt24$_a__a__a__a_a = makeString("~a-~a-~a-~a~a");

    static private final SubLString $str_alt25$_4__0D = makeString("~4,'0D");

    static private final SubLString $str_alt26$__a = makeString(".~a");

    private static final SubLSymbol $ADMIN = makeKeyword("ADMIN");



    static private final SubLString $$$UNKNOWN = makeString("UNKNOWN");



    public static final SubLObject $$topInThesaurus = constant_handles.reader_make_constant_shell(makeString("topInThesaurus"));

    static private final SubLString $str_alt32$__s__s__s__s__s__s__s_ = makeString("(~s ~s ~s ~s ~s ~s ~s)");

    static private final SubLString $$$No_English_available = makeString("No English available");

    static private final SubLString $str_alt34$Bad_operation__No_English_availab = makeString("Bad operation: No English available");



    static private final SubLString $str_alt36$_a__ = makeString("~a~%");

    static private final SubLSymbol $sym37$NON_HYPHEN_CHAR_ = makeSymbol("NON-HYPHEN-CHAR?");

    static private final SubLString $str_alt38$_ops_0000_log = makeString("-ops-0000.log");

    static private final SubLString $str_alt39$_ops_ = makeString("-ops-");

    static private final SubLString $str_alt40$_ops = makeString("-ops");

    static private final SubLSymbol $sym41$NON_SEMI_COLON_CHAR_ = makeSymbol("NON-SEMI-COLON-CHAR?");

    static private final SubLString $str_alt42$__a = makeString(":~a");



    static private final SubLString $str_alt44$__s__s__s__s__s__s___ = makeString("(~s ~s ~s ~s ~s ~s)~%");

    private static final SubLSymbol $OP_LOG = makeKeyword("OP-LOG");

    static private final SubLList $list_alt46 = list(list(makeKeyword("DATE-TIME-USER"), makeSymbol("UPDATE-OPS-DATE-TIME-TABLE"), makeString("date, time, user")), list(makeKeyword("USER-DATE-TIME"), makeSymbol("UPDATE-OPS-USER-DATE-TABLE"), makeString("user, date, time")), list(makeKeyword("DATE-USER-TIME"), makeSymbol("UPDATE-OPS-DATE-USER-TABLE"), makeString("date, user, time")));

    private static final SubLSymbol $UTILITY_TABLE_1 = makeKeyword("UTILITY-TABLE-1");

    private static final SubLSymbol $UTILITY_TABLE_2 = makeKeyword("UTILITY-TABLE-2");



    static private final SubLString $str_alt50$_ALL_ = makeString("[ALL]");

    static private final SubLString $str_alt51$admin_and_ordinary = makeString("admin-and-ordinary");

    static private final SubLString $str_alt52$admin_only = makeString("admin-only");

    static private final SubLString $str_alt53$ordinary_only = makeString("ordinary-only");

    private static final SubLSymbol $DATE_TIME_USER = makeKeyword("DATE-TIME-USER");

    static private final SubLString $$$evt = makeString("evt");

    static private final SubLString $$$rpt = makeString("rpt");

    static private final SubLString $str_alt57$thesauri_users = makeString("thesauri-users");

    static private final SubLString $$$stats = makeString("stats");

    static private final SubLString $str_alt59$_a__a__a_a = makeString("~a-~a-~a~a");

    public static final SubLInteger $int$500000 = makeInteger(500000);

    private static final SubLSymbol $THESAURI = makeKeyword("THESAURI");



    static private final SubLString $$$No_thesauri_selected = makeString("No thesauri selected");

    static private final SubLString $str_alt64$_s__ = makeString("~s~%");

    static private final SubLString $$$tmap = makeString("tmap");

    static private final SubLString $$$api = makeString("api");

    static private final SubLString $$$TMAP_login = makeString("TMAP login");

    static private final SubLList $list_alt68 = list(new SubLObject[]{ cons(ONE_INTEGER, makeString("January")), cons(TWO_INTEGER, makeString("February")), cons(THREE_INTEGER, makeString("March")), cons(FOUR_INTEGER, makeString("April")), cons(FIVE_INTEGER, makeString("May")), cons(SIX_INTEGER, makeString("June")), cons(SEVEN_INTEGER, makeString("July")), cons(EIGHT_INTEGER, makeString("August")), cons(NINE_INTEGER, makeString("September")), cons(TEN_INTEGER, makeString("October")), cons(ELEVEN_INTEGER, makeString("November")), cons(TWELVE_INTEGER, makeString("December")) });

    static private final SubLString $str_alt69$_2__0D = makeString("~2,'0D");

    public static final SubLInteger $int$10000 = makeInteger(10000);

    static private final SubLString $str_alt71$_A__A___A = makeString("~A ~A, ~A");

    static private final SubLSymbol $sym72$VALID_TIMESTRING_CHAR_ = makeSymbol("VALID-TIMESTRING-CHAR?");



    static private final SubLString $str_alt74$_a_a_a = makeString("~a~a~a");

    static private final SubLString $str_alt75$_8__0D = makeString("~8,'0D");

    static private final SubLString $str_alt76$_a__a__a = makeString("~a/~a/~a");

    static private final SubLString $str_alt77$_6__0D = makeString("~6,'0D");

    static private final SubLString $str_alt78$_a__a__a = makeString("~a:~a:~a");

    static private final SubLList $list_alt79 = list(makeString("No active thesaurus"));

    static private final SubLString $str_alt80$_A = makeString("~A");

    private static final SubLSymbol $MONTH_EVENT_LOG_TABLE = makeKeyword("MONTH-EVENT-LOG-TABLE");

    private static final SubLSymbol $USER_EVENT_LOG_TABLE = makeKeyword("USER-EVENT-LOG-TABLE");

    private static final SubLSymbol $THESAURUS_EVENT_LOG_TABLE = makeKeyword("THESAURUS-EVENT-LOG-TABLE");

    private static final SubLSymbol $EVENT_LOG = makeKeyword("EVENT-LOG");

    private static final SubLSymbol $TMAP_LOG = makeKeyword("TMAP-LOG");

    private static final SubLSymbol $USER_REPORT = makeKeyword("USER-REPORT");

    private static final SubLSymbol $THESAURUS_REPORT = makeKeyword("THESAURUS-REPORT");



    static private final SubLString $str_alt89$Unknown_type__a = makeString("Unknown type ~a");

    private static final SubLSymbol $APPLICATION_TMAP_LOG_TABLE = makeKeyword("APPLICATION-TMAP-LOG-TABLE");

    private static final SubLSymbol $THESAURUS_TMAP_LOG_TABLE = makeKeyword("THESAURUS-TMAP-LOG-TABLE");

    static private final SubLSymbol $sym92$_ = makeSymbol("<");

    static private final SubLString $str_alt93$_a__a = makeString("~a ~a");

    static private final SubLString $str_alt94$_a__a__a = makeString("~a ~a ~a");

    static private final SubLString $str_alt95$_User_Not_Found_ = makeString("(User Not Found)");

    static private final SubLString $$$inactive = makeString("inactive");

    static private final SubLString $str_alt97$__ = makeString(" (");

    static private final SubLString $str_alt98$___ = makeString(" - ");

    static private final SubLString $str_alt99$_ = makeString(")");

    static private final SubLString $str_alt100$_ = makeString(" ");

    static private final SubLString $str_alt101$__ = makeString("~%");

    static private final SubLString $$$THESAURUS_USE_REPORT = makeString("THESAURUS USE REPORT");

    static private final SubLString $str_alt103$____ = makeString("~%~%");

    static private final SubLString $str_alt104$This_report_requested_by___a = makeString("This report requested by: ~a");

    static private final SubLString $str_alt105$__Report_generation_time___a = makeString("  Report generation time: ~a");

    static private final SubLString $str_alt106$__Report_for_period_covering_from = makeString("  Report for period covering from beginning of ~a until ~a");

    static private final SubLString $str_alt107$__Report_for_period_covering_from = makeString("  Report for period covering from beginning of ~a through the end of ~a");

    public static final SubLInteger $int$70 = makeInteger(70);

    static private final SubLString $$$yes = makeString("yes");

    private static final SubLSymbol TM_PRINT_NAME_FOR_USER_IN_REPORT = makeSymbol("TM-PRINT-NAME-FOR-USER-IN-REPORT");

    static private final SubLString $str_alt111$_______a___a__ = makeString("~%~%~%~a~%~a~%");

    static private final SubLString $str_alt112$______ = makeString("~%~%~%");

    static private final SubLString $str_alt113$_________________________________ = makeString("     --------------------------~%");

    static private final SubLString $str_alt114$______USER_STATISTICS_BY_MONTH___ = makeString("    | USER STATISTICS BY MONTH |~%");





    static private final SubLString $$$Name = makeString("Name");

    static private final SubLString $str_alt118$_a_a___a = makeString("~a~a: ~a");

    static private final SubLString $str_alt119$__inactive___ = makeString(" (inactive)~%");

    static private final SubLString $$$unknown = makeString("unknown");

    static private final SubLString $str_alt121$_a_a___a__a = makeString("~a~a: ~a ~a");

    static private final SubLString $str_alt122$____________________Total_logins_ = makeString("                    Total logins: ~a");

    static private final SubLString $str_alt123$Total_pages_per_active_thesaurus_ = makeString("Total pages per active thesaurus: ");

    static private final SubLString $str_alt124$_________________________________ = makeString("                                  ");

    static private final SubLString $str_alt125$____________Total_pages_accessed_ = makeString("            Total pages accessed: ~a");

    static private final SubLString $str_alt126$Time_period_ = makeString("Time period:");

    static private final SubLString $str_alt127$_a_a___a_to__a = makeString("~a~a: ~a to ~a");

    static private final SubLString $str_alt128$_____a___a___a = makeString("~%~%~a~%~a~%~a");

    static private final SubLString $str_alt129$________Total_logins_for_the_mont = makeString("        Total logins for the month: ~a");

    static private final SubLString $str_alt130$Total_pages_accessed_for_the_mont = makeString("Total pages accessed for the month: ~a");

    static private final SubLString $str_alt131$________________________________ = makeString("     -------------------------~%");

    static private final SubLString $str_alt132$______USER_STATISTICS_BY_USER____ = makeString("    | USER STATISTICS BY USER |~%");

    static private final SubLString $str_alt133$______No_activity_during_report_p = makeString("~%~%  No activity during report period.");

    static private final SubLString $$$Month = makeString("Month");

    public static final SubLInteger $int$200 = makeInteger(200);

    static private final SubLString $str_alt136$_________________________________ = makeString("     ------------------------------~%");

    static private final SubLString $str_alt137$______USER_STATISTICS_BY_THESAURU = makeString("    | USER STATISTICS BY THESAURUS |~%");

    static private final SubLString $str_alt138$__Number_of_users_for_all_thesaur = makeString("~%Number of users for all thesauri for report period: ~a~%");

    static private final SubLString $str_alt139$Month_ = makeString("Month:");

    static private final SubLString $str_alt140$Total_pages_accessed_ = makeString("Total pages accessed:");

    static private final SubLString $str_alt141$Number_of_users_in_report_period_ = makeString("Number of users in report period:");

    static private final SubLString $str_alt142$Total_pages_per_user_ = makeString("Total pages per user:");

    static private final SubLString $str_alt143$_a_a__a = makeString("~a~a ~a");

    static private final SubLString $str_alt144$_a_a_ = makeString("~a~a ");

    static private final SubLString $str_alt145$_a_ = makeString("~a ");

    static private final SubLString $str_alt146$_a_a__a_to__a = makeString("~a~a ~a to ~a");

    static private final SubLString $str_alt147$_a__a__a = makeString("~a-~a-~a");

    static private final SubLString $str_alt148$_a_ = makeString("~a-");

    public static final SubLInteger $int$31 = makeInteger(31);

    static private final SubLString $str_alt150$_a__a__a_to__a__a__a = makeString("~a-~a-~a-to-~a-~a-~a");

    static private final SubLString $str_alt151$_a__a__a_through__a__a = makeString("~a-~a-~a-through-~a-~a");

    static private final SubLString $$$TMAP_ACTIVITY_REPORT = makeString("TMAP ACTIVITY REPORT");

    private static final SubLSymbol CYC_MONTH_FALLS_BETWEEN = makeSymbol("CYC-MONTH-FALLS-BETWEEN");

    static private final SubLString $str_alt154$_________________________________ = makeString("     --------------------------------~%");

    static private final SubLString $str_alt155$______TMAP_STATISTICS_BY_APPLICAT = makeString("    | TMAP STATISTICS BY APPLICATION |~%");

    static private final SubLString $str_alt156$____________Total_session_starts_ = makeString("            Total session starts: ~a");

    static private final SubLString $str_alt157$_________Total_commands_executed_ = makeString("         Total commands executed: ~a");

    static private final SubLString $str_alt158$______TMAP_STATISTICS_BY_THESAURU = makeString("    | TMAP STATISTICS BY THESAURUS |~%");

    static private final SubLString $str_alt159$Total_commands_involving_thesauru = makeString("Total commands involving thesaurus:");

    static private final SubLString $str_alt160$Total_commands_per_application_ = makeString("Total commands per application:");

    // // Initializers
    public void declareFunctions() {
        declare_tm_logging_file();
    }

    public void initializeVariables() {
        init_tm_logging_file();
    }

    public void runTopLevelForms() {
        setup_tm_logging_file();
    }
}

