/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_value;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
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
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      ASSERTION-GLOSS-CACHE
 *  source file: /cyc/top/cycl/assertion-gloss-cache.lisp
 *  created:     2019/07/03 17:38:17
 */
public final class assertion_gloss_cache extends SubLTranslatedFile implements V02 {
    // // Constructor
    private assertion_gloss_cache() {
    }

    public static final SubLFile me = new assertion_gloss_cache();

    public static final String myName = "com.cyc.cycjava.cycl.assertion_gloss_cache";

    // // Definitions
    /**
     * File backed cache of assertion -> stringp of
     * all assertions in the KB when the file was last generated.
     */
    // deflexical
    private static final SubLSymbol $assertion_gloss_cache$ = makeSymbol("*ASSERTION-GLOSS-CACHE*");



    /**
     * Whether we want to do cache lookups of assertion gloss values of assertions.
     */
    // defparameter
    public static final SubLSymbol $use_assertion_gloss_cacheP$ = makeSymbol("*USE-ASSERTION-GLOSS-CACHE?*");

    /**
     * Lock used for opening the file hashtable to prevent multiple version from being opened
     */
    // deflexical
    private static final SubLSymbol $assertion_gloss_fht_lock$ = makeSymbol("*ASSERTION-GLOSS-FHT-LOCK*");



    public static final SubLObject with_default_assertion_gloss_cache_file_path(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt5);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject filename = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt5);
                    filename = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CLET, list(list($assertion_gloss_fht_name$, filename)), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt5);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Returns the default file path name for the file hash table for this cache.
     */
    public static final SubLObject get_default_assertion_gloss_cache_file_path(SubLObject kb) {
        if (kb == UNPROVIDED) {
            kb = TWO_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != subl_promotions.positive_integer_p(kb)) {
                if (!($assertion_gloss_fht_name$.getDynamicValue(thread).isString() && (NIL != Filesys.probe_file($assertion_gloss_fht_name$.getDynamicValue(thread))))) {
                    $assertion_gloss_fht_name$.setDynamicValue(cconcatenate(file_backed_cache.$file_backed_cache_base_path$.getGlobalValue(), new SubLObject[]{ format(NIL, $str_alt8$_4__0d, kb), $str_alt9$_, $assertion_gloss_cache_base_file_name$.getGlobalValue() }), thread);
                }
            }
            return $assertion_gloss_fht_name$.getDynamicValue(thread);
        }
    }

    /**
     * Set to T if this becomes fast enough.
     */
    // deflexical
    private static final SubLSymbol $preload_assertion_gloss_cacheP$ = makeSymbol("*PRELOAD-ASSERTION-GLOSS-CACHE?*");

    /**
     * Initializes the file hashtables and internal caches used to cache
     * assertion gloss values for FORTs. Also prefetches all the items in
     * the file hashtable cache.
     */
    public static final SubLObject initialize_assertion_gloss_cache() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == control_vars.kb_loaded()) {
                return NIL;
            }
            if (NIL == $assertion_gloss_cache$.getGlobalValue()) {
                {
                    SubLObject lock = $assertion_gloss_fht_lock$.getGlobalValue();
                    SubLObject release = NIL;
                    try {
                        release = seize_lock(lock);
                        if (NIL == $assertion_gloss_cache$.getGlobalValue()) {
                            {
                                SubLObject _prev_bind_0 = file_hash_table.$fht_cache_percentage$.currentBinding(thread);
                                try {
                                    file_hash_table.$fht_cache_percentage$.bind($int$100, thread);
                                    $assertion_gloss_cache$.setGlobalValue(file_backed_cache.file_backed_cache_create(get_default_assertion_gloss_cache_file_path(UNPROVIDED), $preload_assertion_gloss_cacheP$.getGlobalValue(), T, file_hash_table.$fht_cache_percentage$.getDynamicValue(thread), symbol_function(EQ), $IMAGE_INDEPENDENT_CFASL));
                                } finally {
                                    file_hash_table.$fht_cache_percentage$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    } finally {
                        if (NIL != release) {
                            release_lock(lock);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Closes all file hashtables and reinitializes the assertion gloss caches.
     * Any dynamic updating of the live cache is lost.
     */
    public static final SubLObject reset_assertion_gloss_cache() {
        {
            SubLObject lock = $assertion_gloss_fht_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                if (NIL != $assertion_gloss_cache$.getGlobalValue()) {
                    $assertion_gloss_fht_name$.setDynamicValue(NIL);
                    file_backed_cache.file_backed_cache_reset($assertion_gloss_cache$.getGlobalValue(), get_default_assertion_gloss_cache_file_path(UNPROVIDED));
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject create_assertion_gloss_cache(SubLObject filename, SubLObject tmp_dir) {
        if (filename == UNPROVIDED) {
            filename = get_default_assertion_gloss_cache_file_path(UNPROVIDED);
        }
        if (tmp_dir == UNPROVIDED) {
            tmp_dir = $str_alt12$_home_jantos_space_;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            format(T, $str_alt13$Generating_full_assertion_gloss_c, filename);
            {
                SubLObject _prev_bind_0 = $use_assertion_gloss_cacheP$.currentBinding(thread);
                try {
                    $use_assertion_gloss_cacheP$.bind(NIL, thread);
                    {
                        SubLObject i = ZERO_INTEGER;
                        SubLObject doneP = NIL;
                        SubLObject fht = file_hash_table.fast_create_file_hash_table(filename, tmp_dir, symbol_function(EQ), $IMAGE_INDEPENDENT_CFASL);
                        try {
                            thread.resetMultipleValues();
                            {
                                SubLObject _prev_bind_0_1 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                                try {
                                    pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                                    {
                                        SubLObject reuseP = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        try {
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject _prev_bind_0_2 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                                try {
                                                    pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                                    {
                                                        SubLObject new_or_reused = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        {
                                                            SubLObject _prev_bind_0_3 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                                            try {
                                                                pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                                {
                                                                    SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                                    {
                                                                        SubLObject _prev_bind_0_4 = memoization_state.$memoization_state$.currentBinding(thread);
                                                                        try {
                                                                            memoization_state.$memoization_state$.bind(local_state, thread);
                                                                            {
                                                                                SubLObject original_memoization_process = NIL;
                                                                                if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                                                                    original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                                                                    {
                                                                                        SubLObject current_proc = current_process();
                                                                                        if (NIL == original_memoization_process) {
                                                                                            memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                                                                        } else {
                                                                                            if (original_memoization_process != current_proc) {
                                                                                                Errors.error($str_alt14$Invalid_attempt_to_reuse_memoizat);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    {
                                                                                        SubLObject idx = assertion_handles.do_assertions_table();
                                                                                        SubLObject total = id_index.id_index_count(idx);
                                                                                        SubLObject sofar = ZERO_INTEGER;
                                                                                        SubLTrampolineFile.checkType($str_alt15$Generating_assertion_gloss_string, STRINGP);
                                                                                        {
                                                                                            SubLObject _prev_bind_0_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                                                                            SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                                                                            SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                                                                            SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                                                                            try {
                                                                                                utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                                                                                utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                                                                                utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                                                                                utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                                                                                utilities_macros.noting_percent_progress_preamble($str_alt15$Generating_assertion_gloss_string);
                                                                                                if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                                                                                                    {
                                                                                                        SubLObject id = id_index.do_id_index_next_id(idx, T, NIL, NIL);
                                                                                                        SubLObject state_var = id_index.do_id_index_next_state(idx, T, id, NIL);
                                                                                                        SubLObject assertion = NIL;
                                                                                                        while ((NIL != id) && (NIL == doneP)) {
                                                                                                            assertion = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                                                                                                            if (NIL != id_index.do_id_index_id_and_object_validP(id, assertion, $SKIP)) {
                                                                                                                utilities_macros.note_percent_progress(sofar, total);
                                                                                                                sofar = add(sofar, ONE_INTEGER);
                                                                                                                if ((NIL != kbs_identification.kbs_assertion_p(assertion)) && (NIL == assertion_gloss_skip_assertionP(assertion))) {
                                                                                                                    i = add(i, ONE_INTEGER);
                                                                                                                    {
                                                                                                                        SubLObject gloss = pph_main.generate_assertion_output_list(assertion, UNPROVIDED);
                                                                                                                        file_hash_table.fast_put_file_hash_table(assertion, fht, gloss);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            id = id_index.do_id_index_next_id(idx, T, id, state_var);
                                                                                                            state_var = id_index.do_id_index_next_state(idx, T, id, state_var);
                                                                                                        } 
                                                                                                    }
                                                                                                }
                                                                                                utilities_macros.noting_percent_progress_postamble();
                                                                                            } finally {
                                                                                                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                                                                                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                                                                                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                                                                                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_5, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    {
                                                                                        SubLObject _prev_bind_0_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                        try {
                                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                            if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                                                                memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                                                            }
                                                                                        } finally {
                                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_6, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            memoization_state.$memoization_state$.rebind(_prev_bind_0_4, thread);
                                                                        }
                                                                    }
                                                                }
                                                            } finally {
                                                                pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_3, thread);
                                                            }
                                                        }
                                                        if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                                        }
                                                    }
                                                } finally {
                                                    pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_2, thread);
                                                }
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    if (NIL == reuseP) {
                                                        pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                                    }
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_7, thread);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0_8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    format(T, $str_alt19$Finalizing_full_assertion_gloss_c, i);
                                    file_hash_table.finalize_fast_create_file_hash_table(fht, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_8, thread);
                                }
                            }
                        }
                    }
                } finally {
                    $use_assertion_gloss_cacheP$.rebind(_prev_bind_0, thread);
                }
            }
            return filename;
        }
    }

    public static final SubLObject create_empty_assertion_gloss_cache(SubLObject filename, SubLObject tmp_dir) {
        if (filename == UNPROVIDED) {
            filename = get_default_assertion_gloss_cache_file_path(UNPROVIDED);
        }
        if (tmp_dir == UNPROVIDED) {
            tmp_dir = $str_alt12$_home_jantos_space_;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            format(T, $str_alt20$Generating_empty_assertion_gloss_, filename);
            {
                SubLObject _prev_bind_0 = $use_assertion_gloss_cacheP$.currentBinding(thread);
                try {
                    $use_assertion_gloss_cacheP$.bind(NIL, thread);
                    {
                        SubLObject i = ZERO_INTEGER;
                        SubLObject doneP = NIL;
                        SubLObject fht = file_hash_table.fast_create_file_hash_table(filename, tmp_dir, symbol_function(EQ), $IMAGE_INDEPENDENT_CFASL);
                        SubLObject idx = assertion_handles.do_assertions_table();
                        SubLObject total = id_index.id_index_count(idx);
                        SubLObject sofar = ZERO_INTEGER;
                        SubLTrampolineFile.checkType($str_alt21$Writing_empty_assertion_gloss_str, STRINGP);
                        {
                            SubLObject _prev_bind_0_9 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                            SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                            SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                            SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                            try {
                                utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                utilities_macros.noting_percent_progress_preamble($str_alt21$Writing_empty_assertion_gloss_str);
                                if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                                    {
                                        SubLObject id = id_index.do_id_index_next_id(idx, T, NIL, NIL);
                                        SubLObject state_var = id_index.do_id_index_next_state(idx, T, id, NIL);
                                        SubLObject assertion = NIL;
                                        while ((NIL != id) && (NIL == doneP)) {
                                            assertion = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                                            if (NIL != id_index.do_id_index_id_and_object_validP(id, assertion, $SKIP)) {
                                                utilities_macros.note_percent_progress(sofar, total);
                                                sofar = add(sofar, ONE_INTEGER);
                                                if ((NIL != kbs_identification.kbs_assertion_p(assertion)) && (NIL == assertion_gloss_skip_assertionP(assertion))) {
                                                    i = add(i, ONE_INTEGER);
                                                    file_hash_table.fast_put_file_hash_table(assertion, fht, NIL);
                                                }
                                            }
                                            id = id_index.do_id_index_next_id(idx, T, id, state_var);
                                            state_var = id_index.do_id_index_next_state(idx, T, id, state_var);
                                        } 
                                    }
                                }
                                utilities_macros.noting_percent_progress_postamble();
                            } finally {
                                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_9, thread);
                            }
                        }
                        format(T, $str_alt22$Finalizing_empty_assertion_gloss_, i);
                        file_hash_table.finalize_fast_create_file_hash_table(fht, UNPROVIDED, UNPROVIDED);
                    }
                } finally {
                    $use_assertion_gloss_cacheP$.rebind(_prev_bind_0, thread);
                }
            }
            return filename;
        }
    }

    public static final SubLObject update_assertion_gloss_cache(SubLObject start_assertion, SubLObject end_assertion, SubLObject filename) {
        if (start_assertion == UNPROVIDED) {
            start_assertion = ZERO_INTEGER;
        }
        if (end_assertion == UNPROVIDED) {
            end_assertion = NIL;
        }
        if (filename == UNPROVIDED) {
            filename = get_default_assertion_gloss_cache_file_path(UNPROVIDED);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Filesys.probe_file(filename)) {
                Errors.error($str_alt23$Assertion_gloss_cache_file_not_fo, filename);
            }
            format(T, $str_alt24$Generating_assertion_gloss_cache_, filename);
            {
                SubLObject _prev_bind_0 = $use_assertion_gloss_cacheP$.currentBinding(thread);
                try {
                    $use_assertion_gloss_cacheP$.bind(NIL, thread);
                    {
                        SubLObject fht = file_hash_table.open_file_hash_table(filename, symbol_function(EQ), $IMAGE_INDEPENDENT_CFASL);
                        if (!end_assertion.isInteger()) {
                            end_assertion = file_hash_table.file_hash_table_count(fht);
                        }
                        try {
                            thread.resetMultipleValues();
                            {
                                SubLObject _prev_bind_0_10 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                                try {
                                    pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                                    {
                                        SubLObject reuseP = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        try {
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject _prev_bind_0_11 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                                try {
                                                    pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                                    {
                                                        SubLObject new_or_reused = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        {
                                                            SubLObject _prev_bind_0_12 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                                            try {
                                                                pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                                {
                                                                    SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                                    {
                                                                        SubLObject _prev_bind_0_13 = memoization_state.$memoization_state$.currentBinding(thread);
                                                                        try {
                                                                            memoization_state.$memoization_state$.bind(local_state, thread);
                                                                            {
                                                                                SubLObject original_memoization_process = NIL;
                                                                                if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                                                                    original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                                                                    {
                                                                                        SubLObject current_proc = current_process();
                                                                                        if (NIL == original_memoization_process) {
                                                                                            memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                                                                        } else {
                                                                                            if (original_memoization_process != current_proc) {
                                                                                                Errors.error($str_alt14$Invalid_attempt_to_reuse_memoizat);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    {
                                                                                        SubLObject num_assertions = subtract(end_assertion, start_assertion);
                                                                                        SubLObject message = cconcatenate($str_alt25$Generating_assertion_gloss_values, new SubLObject[]{ format_nil.format_nil_a_no_copy(num_assertions), $str_alt26$_assertions_____ });
                                                                                        {
                                                                                            SubLObject _prev_bind_0_14 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                                                                            SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                                                                            SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                                                                            SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                                                                            try {
                                                                                                utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                                                                                utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                                                                                utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                                                                                utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                                                                                utilities_macros.noting_percent_progress_preamble(message);
                                                                                                {
                                                                                                    SubLObject _prev_bind_0_15 = utilities_macros.$silent_progressP$.currentBinding(thread);
                                                                                                    try {
                                                                                                        utilities_macros.$silent_progressP$.bind(NIL, thread);
                                                                                                        {
                                                                                                            SubLObject i = ZERO_INTEGER;
                                                                                                            SubLObject doneP = NIL;
                                                                                                            SubLObject continuation = NIL;
                                                                                                            SubLObject completeP = NIL;
                                                                                                            while ((NIL == doneP) && (NIL == completeP)) {
                                                                                                                thread.resetMultipleValues();
                                                                                                                {
                                                                                                                    SubLObject the_key = file_hash_table.get_file_hash_table_any(fht, continuation, T);
                                                                                                                    SubLObject the_value = thread.secondMultipleValue();
                                                                                                                    SubLObject next = thread.thirdMultipleValue();
                                                                                                                    thread.resetMultipleValues();
                                                                                                                    if (NIL != next) {
                                                                                                                        {
                                                                                                                            SubLObject assertion = the_key;
                                                                                                                            SubLObject value = the_value;
                                                                                                                            i = add(i, ONE_INTEGER);
                                                                                                                            if (i.numG(start_assertion)) {
                                                                                                                                thread.resetMultipleValues();
                                                                                                                                {
                                                                                                                                    SubLObject value_16 = file_hash_table.get_file_hash_table(assertion, fht, UNPROVIDED);
                                                                                                                                    SubLObject foundP = thread.secondMultipleValue();
                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                    if (NIL == foundP) {
                                                                                                                                        Errors.warn($str_alt27$Assertion__A_from_fht_not_found_i, assertion);
                                                                                                                                    } else {
                                                                                                                                        {
                                                                                                                                            SubLObject _prev_bind_0_17 = utilities_macros.$silent_progressP$.currentBinding(thread);
                                                                                                                                            try {
                                                                                                                                                utilities_macros.$silent_progressP$.bind(T, thread);
                                                                                                                                                utilities_macros.note_percent_progress(subtract(i, start_assertion), num_assertions);
                                                                                                                                            } finally {
                                                                                                                                                utilities_macros.$silent_progressP$.rebind(_prev_bind_0_17, thread);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        {
                                                                                                                                            SubLObject gloss = pph_main.generate_assertion_output_list(assertion, UNPROVIDED);
                                                                                                                                            file_hash_table.put_file_hash_table(assertion, fht, gloss);
                                                                                                                                        }
                                                                                                                                        if (i.numG(end_assertion)) {
                                                                                                                                            doneP = T;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    continuation = next;
                                                                                                                    completeP = sublisp_null(next);
                                                                                                                }
                                                                                                            } 
                                                                                                        }
                                                                                                    } finally {
                                                                                                        utilities_macros.$silent_progressP$.rebind(_prev_bind_0_15, thread);
                                                                                                    }
                                                                                                }
                                                                                                utilities_macros.noting_percent_progress_postamble();
                                                                                            } finally {
                                                                                                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                                                                                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                                                                                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                                                                                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_14, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    {
                                                                                        SubLObject _prev_bind_0_18 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                        try {
                                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                            if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                                                                memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                                                            }
                                                                                        } finally {
                                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_18, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            memoization_state.$memoization_state$.rebind(_prev_bind_0_13, thread);
                                                                        }
                                                                    }
                                                                }
                                                            } finally {
                                                                pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_12, thread);
                                                            }
                                                        }
                                                        if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                                        }
                                                    }
                                                } finally {
                                                    pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_11, thread);
                                                }
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    if (NIL == reuseP) {
                                                        pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                                    }
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_19, thread);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_10, thread);
                                }
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0_20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    file_hash_table.finalize_file_hash_table(fht);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_20, thread);
                                }
                            }
                        }
                    }
                } finally {
                    $use_assertion_gloss_cacheP$.rebind(_prev_bind_0, thread);
                }
            }
            return filename;
        }
    }

    public static final SubLObject verify_assertion_gloss_cache(SubLObject fbc) {
        if (fbc == UNPROVIDED) {
            fbc = $assertion_gloss_cache$.getGlobalValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(fbc, FILE_BACKED_CACHE_P);
            {
                SubLObject bad_assertions = NIL;
                SubLObject idx = assertion_handles.do_assertions_table();
                SubLObject total = id_index.id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                SubLTrampolineFile.checkType($str_alt29$Looking_up_assertion_gloss_status, STRINGP);
                {
                    SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                        utilities_macros.noting_percent_progress_preamble($str_alt29$Looking_up_assertion_gloss_status);
                        if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                            {
                                SubLObject id = id_index.do_id_index_next_id(idx, T, NIL, NIL);
                                SubLObject state_var = id_index.do_id_index_next_state(idx, T, id, NIL);
                                SubLObject assertion = NIL;
                                while (NIL != id) {
                                    assertion = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                                    if (NIL != id_index.do_id_index_id_and_object_validP(id, assertion, $SKIP)) {
                                        utilities_macros.note_percent_progress(sofar, total);
                                        sofar = add(sofar, ONE_INTEGER);
                                        if (NIL == assertion_gloss_skip_assertionP(assertion)) {
                                            {
                                                SubLObject val = file_backed_cache.file_backed_cache_lookup(assertion, fbc, $NOT_FOUND, UNPROVIDED);
                                                if (val == $NOT_FOUND) {
                                                    assertion = cons(bad_assertions, assertion);
                                                }
                                            }
                                        }
                                    }
                                    id = id_index.do_id_index_next_id(idx, T, id, state_var);
                                    state_var = id_index.do_id_index_next_state(idx, T, id, state_var);
                                } 
                            }
                        }
                        utilities_macros.noting_percent_progress_postamble();
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return bad_assertions;
            }
        }
    }

    public static final SubLObject assertion_gloss_skip_assertionP(SubLObject assertion) {
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            {
                SubLObject pred = assertions_high.gaf_arg0(assertion);
                if ((NIL != isa.isa_in_any_mtP(pred, $$NLRelation)) || (NIL != isa.quoted_isa_in_any_mtP(pred, $$ImplementationConstant))) {
                    return T;
                }
            }
        }
        return NIL;
    }

    public static final SubLObject assertion_gloss_cache_lookup(SubLObject key, SubLObject fbc, SubLObject default_value, SubLObject should_warn) {
        if (fbc == UNPROVIDED) {
            fbc = $assertion_gloss_cache$.getGlobalValue();
        }
        if (default_value == UNPROVIDED) {
            default_value = $NOT_FOUND;
        }
        if (should_warn == UNPROVIDED) {
            should_warn = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $use_assertion_gloss_cacheP$.getDynamicValue(thread)) {
                return default_value;
            }
            if (NIL == assertion_handles.assertion_p(key)) {
                return default_value;
            }
            {
                SubLObject msg = NIL;
                SubLObject abortP = NIL;
                SubLObject result = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                SubLTrampolineFile.checkType(fbc, FILE_BACKED_CACHE_P);
                                if (NIL == $assertion_gloss_cache$.getGlobalValue()) {
                                    {
                                        SubLObject msg_21 = NIL;
                                        try {
                                            {
                                                SubLObject _prev_bind_0_22 = Errors.$error_handler$.currentBinding(thread);
                                                try {
                                                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                    try {
                                                        initialize_assertion_gloss_cache();
                                                        fbc = $assertion_gloss_cache$.getGlobalValue();
                                                    } catch (Throwable catch_var) {
                                                        Errors.handleThrowable(catch_var, NIL);
                                                    }
                                                } finally {
                                                    Errors.$error_handler$.rebind(_prev_bind_0_22, thread);
                                                }
                                            }
                                        } catch (Throwable ccatch_env_var) {
                                            msg_21 = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                        }
                                        if (NIL != msg_21) {
                                            if (NIL != should_warn) {
                                                Errors.warn(msg_21);
                                            }
                                            abortP = T;
                                        }
                                    }
                                }
                                if (NIL == abortP) {
                                    {
                                        SubLObject val = file_backed_cache.file_backed_cache_lookup(key, fbc, default_value, UNPROVIDED);
                                        result = (val.isString()) ? ((SubLObject) (val)) : Errors.error($str_alt34$Found_an_invalid_value_in_asserti, val, key);
                                    }
                                }
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    msg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                }
                if (NIL != msg) {
                    if (NIL != should_warn) {
                        Errors.warn(msg);
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject assertion_gloss_cache_enter(SubLObject key, SubLObject val, SubLObject fbc) {
        if (fbc == UNPROVIDED) {
            fbc = $assertion_gloss_cache$.getGlobalValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $use_assertion_gloss_cacheP$.getDynamicValue(thread)) {
                return NIL;
            }
            SubLTrampolineFile.checkType(fbc, FILE_BACKED_CACHE_P);
            if (NIL == $assertion_gloss_cache$.getGlobalValue()) {
                {
                    SubLObject msg = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                try {
                                    initialize_assertion_gloss_cache();
                                    fbc = $assertion_gloss_cache$.getGlobalValue();
                                } catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                Errors.$error_handler$.rebind(_prev_bind_0, thread);
                            }
                        }
                    } catch (Throwable ccatch_env_var) {
                        msg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    }
                    if (NIL != msg) {
                        Errors.warn(msg);
                        return NIL;
                    }
                }
            }
            {
                SubLObject value = (val.isString()) ? ((SubLObject) (val)) : Errors.error($str_alt35$Trying_to_insert_invalid_value_in, val, key);
                return file_backed_cache.file_backed_cache_enter(key, value, fbc);
            }
        }
    }

    /**
     * Returns the the assertion gloss cache as a file backed cache.
     */
    public static final SubLObject get_assertion_gloss_cache() {
        return $assertion_gloss_cache$.getGlobalValue();
    }

    public static final SubLObject declare_assertion_gloss_cache_file() {
        declareMacro("with_default_assertion_gloss_cache_file_path", "WITH-DEFAULT-ASSERTION-GLOSS-CACHE-FILE-PATH");
        declareFunction("get_default_assertion_gloss_cache_file_path", "GET-DEFAULT-ASSERTION-GLOSS-CACHE-FILE-PATH", 0, 1, false);
        declareFunction("initialize_assertion_gloss_cache", "INITIALIZE-ASSERTION-GLOSS-CACHE", 0, 0, false);
        declareFunction("reset_assertion_gloss_cache", "RESET-ASSERTION-GLOSS-CACHE", 0, 0, false);
        declareFunction("create_assertion_gloss_cache", "CREATE-ASSERTION-GLOSS-CACHE", 0, 2, false);
        declareFunction("create_empty_assertion_gloss_cache", "CREATE-EMPTY-ASSERTION-GLOSS-CACHE", 0, 2, false);
        declareFunction("update_assertion_gloss_cache", "UPDATE-ASSERTION-GLOSS-CACHE", 0, 3, false);
        declareFunction("verify_assertion_gloss_cache", "VERIFY-ASSERTION-GLOSS-CACHE", 0, 1, false);
        declareFunction("assertion_gloss_skip_assertionP", "ASSERTION-GLOSS-SKIP-ASSERTION?", 1, 0, false);
        declareFunction("assertion_gloss_cache_lookup", "ASSERTION-GLOSS-CACHE-LOOKUP", 1, 3, false);
        declareFunction("assertion_gloss_cache_enter", "ASSERTION-GLOSS-CACHE-ENTER", 2, 1, false);
        declareFunction("get_assertion_gloss_cache", "GET-ASSERTION-GLOSS-CACHE", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_assertion_gloss_cache_file() {
        deflexical("*ASSERTION-GLOSS-CACHE*", NIL);
        defparameter("*ASSERTION-GLOSS-FHT-NAME*", NIL);
        defparameter("*USE-ASSERTION-GLOSS-CACHE?*", T);
        deflexical("*ASSERTION-GLOSS-FHT-LOCK*", make_lock($str_alt0$assertion_gloss_fht_lock));
        deflexical("*ASSERTION-GLOSS-CACHE-BASE-FILE-NAME*", red_infrastructure_macros.red_def_helper($list_alt1.isSymbol() ? ((SubLObject) (symbol_value($list_alt1))) : $list_alt1, $assertion_gloss_cache_base_file_name$, $str_alt3$assertion_gloss_cache_fht.isSymbol() ? ((SubLObject) (symbol_value($str_alt3$assertion_gloss_cache_fht))) : $str_alt3$assertion_gloss_cache_fht, $LEXICAL, UNPROVIDED));
        deflexical("*PRELOAD-ASSERTION-GLOSS-CACHE?*", NIL);
        return NIL;
    }

    public static final SubLObject setup_assertion_gloss_cache_file() {
                return NIL;
    }

    // // Internal Constants
    static private final SubLString $str_alt0$assertion_gloss_fht_lock = makeString("assertion-gloss-fht-lock");

    static private final SubLList $list_alt1 = list(makeString("application.file-backed-cache.assertion-gloss-cache-file-name"));

    public static final SubLSymbol $assertion_gloss_cache_base_file_name$ = makeSymbol("*ASSERTION-GLOSS-CACHE-BASE-FILE-NAME*");

    static private final SubLString $str_alt3$assertion_gloss_cache_fht = makeString("assertion-gloss-cache.fht");



    static private final SubLList $list_alt5 = list(list(makeSymbol("FILENAME")), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol $assertion_gloss_fht_name$ = makeSymbol("*ASSERTION-GLOSS-FHT-NAME*");

    static private final SubLString $str_alt8$_4__0d = makeString("~4,'0d");

    static private final SubLString $str_alt9$_ = makeString("/");



    private static final SubLSymbol $IMAGE_INDEPENDENT_CFASL = makeKeyword("IMAGE-INDEPENDENT-CFASL");

    static private final SubLString $str_alt12$_home_jantos_space_ = makeString("/home/jantos/space/");

    static private final SubLString $str_alt13$Generating_full_assertion_gloss_c = makeString("Generating full assertion gloss cache to file: ~A");

    static private final SubLString $str_alt14$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLString $str_alt15$Generating_assertion_gloss_string = makeString("Generating assertion gloss strings for all relevant KBS assertions ....");







    static private final SubLString $str_alt19$Finalizing_full_assertion_gloss_c = makeString("Finalizing full assertion gloss cache for ~A assertions.");

    static private final SubLString $str_alt20$Generating_empty_assertion_gloss_ = makeString("Generating empty assertion gloss cache to file: ~A");

    static private final SubLString $str_alt21$Writing_empty_assertion_gloss_str = makeString("Writing empty assertion gloss strings for all relevant KBS assertions ....");

    static private final SubLString $str_alt22$Finalizing_empty_assertion_gloss_ = makeString("Finalizing empty assertion gloss cache for ~A assertions.");

    static private final SubLString $str_alt23$Assertion_gloss_cache_file_not_fo = makeString("Assertion gloss cache file not found: ~A");

    static private final SubLString $str_alt24$Generating_assertion_gloss_cache_ = makeString("Generating assertion gloss cache to file: ~A");

    static private final SubLString $str_alt25$Generating_assertion_gloss_values = makeString("Generating assertion gloss values for ");

    static private final SubLString $str_alt26$_assertions_____ = makeString(" assertions ....");

    static private final SubLString $str_alt27$Assertion__A_from_fht_not_found_i = makeString("Assertion ~A from fht not found in fht?!");

    private static final SubLSymbol FILE_BACKED_CACHE_P = makeSymbol("FILE-BACKED-CACHE-P");

    static private final SubLString $str_alt29$Looking_up_assertion_gloss_status = makeString("Looking up assertion gloss status for all assertions ....");



    public static final SubLObject $$NLRelation = constant_handles.reader_make_constant_shell(makeString("NLRelation"));

    public static final SubLObject $$ImplementationConstant = constant_handles.reader_make_constant_shell(makeString("ImplementationConstant"));



    static private final SubLString $str_alt34$Found_an_invalid_value_in_asserti = makeString("Found an invalid value in assertion-gloss-cache value: ~A for key ~A.");

    static private final SubLString $str_alt35$Trying_to_insert_invalid_value_in = makeString("Trying to insert invalid value into assertion-gloss-cache value: ~A for key: ~A.");

    // // Initializers
    @Override
    public void declareFunctions() {
        declare_assertion_gloss_cache_file();
    }

    @Override
    public void initializeVariables() {
        init_assertion_gloss_cache_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_assertion_gloss_cache_file();
    }
}

