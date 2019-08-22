/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      REMOTE-OPERATION-FILTERS
 *  source file: /cyc/top/cycl/remote-operation-filters.lisp
 *  created:     2019/07/03 17:37:50
 */
public final class remote_operation_filters extends SubLTranslatedFile implements V02 {
    // // Constructor
    private remote_operation_filters() {
    }

    public static final SubLFile me = new remote_operation_filters();


    // // Definitions
    // deflexical
    private static final SubLSymbol $remote_operation_filter_lock$ = makeSymbol("*REMOTE-OPERATION-FILTER-LOCK*");







    // deflexical
    private static final SubLSymbol $filter_state_variables$ = makeSymbol("*FILTER-STATE-VARIABLES*");





    // defparameter
    public static final SubLSymbol $user_filter_file_extension$ = makeSymbol("*USER-FILTER-FILE-EXTENSION*");

    // defparameter
    public static final SubLSymbol $user_filter_directory_list$ = makeSymbol("*USER-FILTER-DIRECTORY-LIST*");

    /**
     * Turn off all remote operation filtering.
     */
    public static final SubLObject disable_remote_operation_filtering() {
        {
            SubLObject lock = $remote_operation_filter_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                $active_remote_operation_filter_terms$.setGlobalValue(NIL);
                $active_remote_operation_filter_collections$.setGlobalValue(NIL);
                $active_remote_operation_filters$.setGlobalValue(NIL);
                $remote_operation_filter_collections$.setGlobalValue(NIL);
                $remote_operation_filter_terms$.setGlobalValue(NIL);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return NIL;
    }

    /**
     * Return T iff OPERATION passes all currently active remote-operation filters.
     */
    public static final SubLObject passes_remote_operation_filters(SubLObject operation) {
        if ((NIL != $remote_operation_filter_collections$.getGlobalValue()) || (NIL != $remote_operation_filter_terms$.getGlobalValue())) {
            {
                SubLObject v_forts = list_utilities.tree_gather(operation, symbol_function(FORT_P), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject cdolist_list_var = v_forts;
                SubLObject fort = NIL;
                for (fort = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , fort = cdolist_list_var.first()) {
                    {
                        SubLObject cdolist_list_var_1 = $remote_operation_filter_collections$.getGlobalValue();
                        SubLObject collection = NIL;
                        for (collection = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , collection = cdolist_list_var_1.first()) {
                            if ((NIL != isa.isa_in_any_mtP(fort, collection)) || (NIL != isa.quoted_isa_in_any_mtP(fort, collection))) {
                                return NIL;
                            }
                        }
                    }
                    if (NIL != subl_promotions.memberP(fort, $remote_operation_filter_terms$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
                        return NIL;
                    }
                }
            }
        }
        return T;
    }

    /**
     * Return a list of all currently active remote-operation filter terms.
     * This list is initially empty.
     */
    public static final SubLObject active_remote_operation_filter_terms() {
        return copy_list($active_remote_operation_filter_terms$.getGlobalValue());
    }

    /**
     * Add FORT to the set of terms being filtered from remote operations.
     */
    public static final SubLObject add_remote_operation_filter_term(SubLObject fort) {
        SubLTrampolineFile.checkType(fort, FORT_P);
        {
            SubLObject lock = $remote_operation_filter_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                if (NIL == subl_promotions.memberP(fort, $active_remote_operation_filter_terms$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
                    $active_remote_operation_filter_terms$.setGlobalValue(cons(fort, $active_remote_operation_filter_terms$.getGlobalValue()));
                    recompute_remote_operation_filter_terms();
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return NIL;
    }

    /**
     * Remove FORT from the set of terms being filtered from remote operations.
     */
    public static final SubLObject remove_remote_operation_filter_term(SubLObject fort) {
        SubLTrampolineFile.checkType(fort, FORT_P);
        {
            SubLObject lock = $remote_operation_filter_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                if (NIL != subl_promotions.memberP(fort, $active_remote_operation_filter_terms$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
                    $active_remote_operation_filter_terms$.setGlobalValue(delete(fort, $active_remote_operation_filter_terms$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    recompute_remote_operation_filter_terms();
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return NIL;
    }

    /**
     * Return a list of all currently active remote-operation filter collections.
     * This list is initially empty.
     */
    public static final SubLObject active_remote_operation_filter_collections() {
        return copy_list($active_remote_operation_filter_collections$.getGlobalValue());
    }

    /**
     * Add COLLECTION to the set of collections whose elements are all being
     * filtered from remote operations.
     */
    public static final SubLObject add_remote_operation_filter_collection(SubLObject collection) {
        SubLTrampolineFile.checkType(collection, FORT_P);
        {
            SubLObject lock = $remote_operation_filter_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                if (NIL == subl_promotions.memberP(collection, $active_remote_operation_filter_collections$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
                    $active_remote_operation_filter_collections$.setGlobalValue(cons(collection, $active_remote_operation_filter_collections$.getGlobalValue()));
                    recompute_remote_operation_filter_collections();
                    recompute_remote_operation_filter_terms();
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return NIL;
    }

    /**
     * Remove COLLECTION to the set of collections whose elements are all
     * being filtered from remote operations.
     */
    public static final SubLObject remove_remote_operation_filter_collection(SubLObject collection) {
        SubLTrampolineFile.checkType(collection, FORT_P);
        {
            SubLObject lock = $remote_operation_filter_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                if (NIL != subl_promotions.memberP(collection, $active_remote_operation_filter_collections$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
                    $active_remote_operation_filter_collections$.setGlobalValue(delete(collection, $active_remote_operation_filter_collections$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    recompute_remote_operation_filter_collections();
                    recompute_remote_operation_filter_terms();
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return NIL;
    }

    /**
     * This returns a list of all currently active remote-operation filters.
     * This list is initially empty.
     *
     * @return list; a list of the active filters.
     * @unknown william
     */
    public static final SubLObject active_remote_operation_filters() {
        return copy_list($active_remote_operation_filters$.getGlobalValue());
    }

    /**
     * Add FILTER to the set of filters whose elements are all being
     * filtered from remote operations.
     *
     * @return nil.
     * @unknown william
     */
    public static final SubLObject add_remote_operation_filter(SubLObject filter) {
        SubLTrampolineFile.checkType(filter, FILTER_P);
        {
            SubLObject lock = $remote_operation_filter_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                if (NIL == subl_promotions.memberP(filter, $active_remote_operation_filters$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
                    $active_remote_operation_filters$.setGlobalValue(cons(filter, $active_remote_operation_filters$.getGlobalValue()));
                    recompute_remote_operation_filter_collections();
                    recompute_remote_operation_filter_terms();
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return NIL;
    }

    /**
     * Remove FILTER from the set of filters whose elements are all
     * being filtered from remote operations.
     *
     * @return nil.
     * @unknown william
     */
    public static final SubLObject remove_remote_operation_filter(SubLObject filter) {
        SubLTrampolineFile.checkType(filter, FORT_P);
        {
            SubLObject lock = $remote_operation_filter_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                if (NIL != subl_promotions.memberP(filter, $active_remote_operation_filters$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
                    $active_remote_operation_filters$.setGlobalValue(delete(filter, $active_remote_operation_filters$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    recompute_remote_operation_filter_collections();
                    recompute_remote_operation_filter_terms();
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return NIL;
    }

    /**
     * This function checks that OBJECT is a #$TranscriptFilter.
     *
     * @return boolean; t if test is a success.
     * @unknown william
     */
    public static final SubLObject filter_p(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject isaP = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        isaP = isa.isaP(v_object, $$TranscriptFilter, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return isaP;
            }
        }
    }

    /**
     *
     *
     * @return list; list of all terms associated (via #$filterTerms) with FILTER.
     * @unknown william
     */
    public static final SubLObject filter_terms(SubLObject filter) {
        SubLTrampolineFile.checkType(filter, FILTER_P);
        return kb_mapping_utilities.pred_values_in_any_mt(filter, $$filterTerms, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return list; all collections associated (via #$filterCollections) with FILTER.
     * @unknown william
     */
    public static final SubLObject filter_collections(SubLObject filter) {
        SubLTrampolineFile.checkType(filter, FILTER_P);
        return kb_mapping_utilities.pred_values_in_any_mt(filter, $$filterCollections, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * This function saves out the current filters to a user-specific file in
     * /cyc/top/filters/users .
     *
     * @return boolean; t if save was succesful.
     * @unknown william
     */
    public static final SubLObject save_user_filters() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject filename = Strings.string_downcase(Filesys.construct_filename($user_filter_directory_list$.getDynamicValue(thread), constants_high.constant_name(operation_communication.the_cyclist()), $user_filter_file_extension$.getDynamicValue(thread), T), UNPROVIDED, UNPROVIDED);
                SubLObject filters_savedP = NIL;
                filters_savedP = save_transcript_filters_to_file(filename);
                return filters_savedP;
            }
        }
    }

    /**
     * This function loads filter settings from user's file in /cyc/top/filters/users .
     *
     * @return boolean; t if operation was successful.
     * @unknown william
     */
    public static final SubLObject load_user_filters() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject filename = Strings.string_downcase(Filesys.construct_filename($user_filter_directory_list$.getDynamicValue(thread), constants_high.constant_name(operation_communication.the_cyclist()), $user_filter_file_extension$.getDynamicValue(thread), T), UNPROVIDED, UNPROVIDED);
                SubLObject filters_loadedP = NIL;
                if (NIL != Filesys.probe_file(filename)) {
                    load_transcript_filters_from_file(filename);
                    filters_loadedP = T;
                }
                return filters_loadedP;
            }
        }
    }

    public static final SubLObject recompute_remote_operation_filter_collections() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject collections = active_remote_operation_filter_collections();
                SubLObject cdolist_list_var = active_remote_operation_filters();
                SubLObject filter = NIL;
                for (filter = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , filter = cdolist_list_var.first()) {
                    collections = append(filter_collections(filter), collections);
                }
                collections = remove_duplicates(collections, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != collections) {
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            collections = genls.max_cols(collections, UNPROVIDED, UNPROVIDED);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                    collections = Sort.sort(collections, symbol_function($sym17$_), symbol_function(GENERALITY_ESTIMATE));
                }
                $remote_operation_filter_collections$.setGlobalValue(collections);
            }
            return NIL;
        }
    }

    public static final SubLObject recompute_remote_operation_filter_terms() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject terms = active_remote_operation_filter_terms();
                SubLObject cdolist_list_var = active_remote_operation_filters();
                SubLObject filter = NIL;
                for (filter = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , filter = cdolist_list_var.first()) {
                    terms = append(filter_terms(filter), terms);
                }
                terms = remove_duplicates(terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        terms = delete_if(symbol_function(RECOMPUTE_REMOTE_OPERATION_FILTER_TERM_COVERED), terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                $remote_operation_filter_terms$.setGlobalValue(terms);
            }
            return NIL;
        }
    }

    public static final SubLObject recompute_remote_operation_filter_term_covered(SubLObject v_term) {
        return isa.isa_anyP(v_term, $remote_operation_filter_collections$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    /**
     * This function is called by save-user-filters.  It writes values for three variables
     * (one each for filters, collections and terms in that order) to the file <user>.filter
     * in /cyc/top/filters/users .
     *
     * @param filename
     * 		string; a filename generated by construct-filename.
     * @return boolean; t if successful.
     */
    public static final SubLObject save_transcript_filters_to_file(SubLObject filename) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(filename, STRINGP);
            {
                SubLObject saved = NIL;
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(filename, $OUTPUT, NIL);
                    if (!stream.isStream()) {
                        Errors.error($str_alt22$Unable_to_open__S, filename);
                    }
                    {
                        SubLObject stream_2 = stream;
                        SubLObject cdolist_list_var = $filter_state_variables$.getGlobalValue();
                        SubLObject var = NIL;
                        for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                            if (var.isSymbol()) {
                                {
                                    SubLObject value = eval(var);
                                    SubLObject printed_value = format(NIL, $str_alt23$_s, value);
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject re_read_value = read_from_string_ignoring_errors(printed_value, NIL, NIL, UNPROVIDED, UNPROVIDED);
                                        SubLObject error = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (!error.eql($ERROR)) {
                                            if (re_read_value.equal(value)) {
                                                format(stream_2, $str_alt25$_s________a__, var, printed_value);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        saved = T;
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
                return saved;
            }
        }
    }

    /**
     * This function is called by load-user-filters.  It loads filter settings from the file
     * <user>.filter in /cyc/top/filters/users .
     *
     * @param filename
     * 		string; a filename generated by construct-filename.
     * @return boolean; t if successful.
     */
    public static final SubLObject load_transcript_filters_from_file(SubLObject filename) {
        SubLTrampolineFile.checkType(filename, STRINGP);
        {
            SubLObject restored = NIL;
            SubLObject error_message = NIL;
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(filename, $INPUT, NIL);
                if (!stream.isStream()) {
                    Errors.error($str_alt22$Unable_to_open__S, filename);
                }
                {
                    SubLObject stream_3 = stream;
                    SubLObject var = NIL;
                    SubLObject value = NIL;
                    SubLObject done = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                            try {
                                bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                                try {
                                    while (NIL == done) {
                                        var = read_ignoring_errors(stream_3, NIL, $EOF);
                                        done = eq(var, $EOF);
                                        if (NIL == done) {
                                            value = read_ignoring_errors(stream_3, NIL, $EOF);
                                            value = list_utilities.remove_if_not($sym29$VALID_FORT_, value, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            done = eq(value, $EOF);
                                            if (NIL == done) {
                                                if (var.isSymbol() && (NIL != member(var, $filter_state_variables$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) {
                                                    eval(list(CSETQ, var, list(QUOTE, value)));
                                                }
                                            }
                                        }
                                    } 
                                } catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                rebind(Errors.$error_handler$, _prev_bind_0);
                            }
                        }
                    } catch (Throwable ccatch_env_var) {
                        error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    }
                    if (NIL == error_message) {
                        recompute_remote_operation_filter_collections();
                        recompute_remote_operation_filter_terms();
                        restored = T;
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
            return restored;
        }
    }

    public static final SubLObject declare_remote_operation_filters_file() {
        declareFunction("disable_remote_operation_filtering", "DISABLE-REMOTE-OPERATION-FILTERING", 0, 0, false);
        declareFunction("passes_remote_operation_filters", "PASSES-REMOTE-OPERATION-FILTERS", 1, 0, false);
        declareFunction("active_remote_operation_filter_terms", "ACTIVE-REMOTE-OPERATION-FILTER-TERMS", 0, 0, false);
        declareFunction("add_remote_operation_filter_term", "ADD-REMOTE-OPERATION-FILTER-TERM", 1, 0, false);
        declareFunction("remove_remote_operation_filter_term", "REMOVE-REMOTE-OPERATION-FILTER-TERM", 1, 0, false);
        declareFunction("active_remote_operation_filter_collections", "ACTIVE-REMOTE-OPERATION-FILTER-COLLECTIONS", 0, 0, false);
        declareFunction("add_remote_operation_filter_collection", "ADD-REMOTE-OPERATION-FILTER-COLLECTION", 1, 0, false);
        declareFunction("remove_remote_operation_filter_collection", "REMOVE-REMOTE-OPERATION-FILTER-COLLECTION", 1, 0, false);
        declareFunction("active_remote_operation_filters", "ACTIVE-REMOTE-OPERATION-FILTERS", 0, 0, false);
        declareFunction("add_remote_operation_filter", "ADD-REMOTE-OPERATION-FILTER", 1, 0, false);
        declareFunction("remove_remote_operation_filter", "REMOVE-REMOTE-OPERATION-FILTER", 1, 0, false);
        declareFunction("filter_p", "FILTER-P", 1, 0, false);
        declareFunction("filter_terms", "FILTER-TERMS", 1, 0, false);
        declareFunction("filter_collections", "FILTER-COLLECTIONS", 1, 0, false);
        declareFunction("save_user_filters", "SAVE-USER-FILTERS", 0, 0, false);
        declareFunction("load_user_filters", "LOAD-USER-FILTERS", 0, 0, false);
        declareFunction("recompute_remote_operation_filter_collections", "RECOMPUTE-REMOTE-OPERATION-FILTER-COLLECTIONS", 0, 0, false);
        declareFunction("recompute_remote_operation_filter_terms", "RECOMPUTE-REMOTE-OPERATION-FILTER-TERMS", 0, 0, false);
        declareFunction("recompute_remote_operation_filter_term_covered", "RECOMPUTE-REMOTE-OPERATION-FILTER-TERM-COVERED", 1, 0, false);
        declareFunction("save_transcript_filters_to_file", "SAVE-TRANSCRIPT-FILTERS-TO-FILE", 1, 0, false);
        declareFunction("load_transcript_filters_from_file", "LOAD-TRANSCRIPT-FILTERS-FROM-FILE", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_remote_operation_filters_file() {
        deflexical("*REMOTE-OPERATION-FILTER-LOCK*", make_lock($$$Remote_Operation_Filter));
        deflexical("*ACTIVE-REMOTE-OPERATION-FILTERS*", NIL != boundp($active_remote_operation_filters$) ? ((SubLObject) ($active_remote_operation_filters$.getGlobalValue())) : NIL);
        deflexical("*ACTIVE-REMOTE-OPERATION-FILTER-COLLECTIONS*", NIL != boundp($active_remote_operation_filter_collections$) ? ((SubLObject) ($active_remote_operation_filter_collections$.getGlobalValue())) : NIL);
        deflexical("*ACTIVE-REMOTE-OPERATION-FILTER-TERMS*", NIL != boundp($active_remote_operation_filter_terms$) ? ((SubLObject) ($active_remote_operation_filter_terms$.getGlobalValue())) : NIL);
        deflexical("*FILTER-STATE-VARIABLES*", $list_alt4);
        deflexical("*REMOTE-OPERATION-FILTER-COLLECTIONS*", NIL != boundp($remote_operation_filter_collections$) ? ((SubLObject) ($remote_operation_filter_collections$.getGlobalValue())) : NIL);
        deflexical("*REMOTE-OPERATION-FILTER-TERMS*", NIL != boundp($remote_operation_filter_terms$) ? ((SubLObject) ($remote_operation_filter_terms$.getGlobalValue())) : NIL);
        defparameter("*USER-FILTER-FILE-EXTENSION*", $$$filter);
        defparameter("*USER-FILTER-DIRECTORY-LIST*", list($$$filters, $$$users));
        return NIL;
    }

    public static final SubLObject setup_remote_operation_filters_file() {
                subl_macro_promotions.declare_defglobal($active_remote_operation_filters$);
        subl_macro_promotions.declare_defglobal($active_remote_operation_filter_collections$);
        subl_macro_promotions.declare_defglobal($active_remote_operation_filter_terms$);
        subl_macro_promotions.declare_defglobal($remote_operation_filter_collections$);
        subl_macro_promotions.declare_defglobal($remote_operation_filter_terms$);
        return NIL;
    }

    // // Internal Constants
    static private final SubLString $$$Remote_Operation_Filter = makeString("Remote Operation Filter");

    public static final SubLSymbol $active_remote_operation_filters$ = makeSymbol("*ACTIVE-REMOTE-OPERATION-FILTERS*");

    public static final SubLSymbol $active_remote_operation_filter_collections$ = makeSymbol("*ACTIVE-REMOTE-OPERATION-FILTER-COLLECTIONS*");

    public static final SubLSymbol $active_remote_operation_filter_terms$ = makeSymbol("*ACTIVE-REMOTE-OPERATION-FILTER-TERMS*");

    static private final SubLList $list_alt4 = list(makeSymbol("*ACTIVE-REMOTE-OPERATION-FILTERS*"), makeSymbol("*ACTIVE-REMOTE-OPERATION-FILTER-COLLECTIONS*"), makeSymbol("*ACTIVE-REMOTE-OPERATION-FILTER-TERMS*"));

    public static final SubLSymbol $remote_operation_filter_collections$ = makeSymbol("*REMOTE-OPERATION-FILTER-COLLECTIONS*");

    public static final SubLSymbol $remote_operation_filter_terms$ = makeSymbol("*REMOTE-OPERATION-FILTER-TERMS*");

    static private final SubLString $$$filter = makeString("filter");

    static private final SubLString $$$filters = makeString("filters");

    static private final SubLString $$$users = makeString("users");



    private static final SubLSymbol FILTER_P = makeSymbol("FILTER-P");



    public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));

    public static final SubLObject $$TranscriptFilter = constant_handles.reader_make_constant_shell(makeString("TranscriptFilter"));

    public static final SubLObject $$filterTerms = constant_handles.reader_make_constant_shell(makeString("filterTerms"));

    public static final SubLObject $$filterCollections = constant_handles.reader_make_constant_shell(makeString("filterCollections"));

    static private final SubLSymbol $sym17$_ = makeSymbol(">");



    private static final SubLSymbol RECOMPUTE_REMOTE_OPERATION_FILTER_TERM_COVERED = makeSymbol("RECOMPUTE-REMOTE-OPERATION-FILTER-TERM-COVERED");





    static private final SubLString $str_alt22$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt23$_s = makeString("~s");



    static private final SubLString $str_alt25$_s________a__ = makeString("~s ~%    ~a~%");







    static private final SubLSymbol $sym29$VALID_FORT_ = makeSymbol("VALID-FORT?");





    // // Initializers
    public void declareFunctions() {
        declare_remote_operation_filters_file();
    }

    public void initializeVariables() {
        init_remote_operation_filters_file();
    }

    public void runTopLevelForms() {
        setup_remote_operation_filters_file();
    }
}

