/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      UNREPRESENTED-TERM-INDEX-MANAGER
 * source file: /cyc/top/cycl/unrepresented-term-index-manager.lisp
 * created:     2019/07/03 17:37:21
 */
public final class unrepresented_term_index_manager extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new unrepresented_term_index_manager();

 public static final String myName = "com.cyc.cycjava.cycl.unrepresented_term_index_manager";


    // deflexical
    // Wild guess
    /**
     * Wild guess
     */
    @LispMethod(comment = "Wild guess\ndeflexical")
    private static final SubLSymbol $unrepresented_term_index_lru_size_percentage$ = makeSymbol("*UNREPRESENTED-TERM-INDEX-LRU-SIZE-PERCENTAGE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $unrepresented_term_index_lru_size_max$ = makeSymbol("*UNREPRESENTED-TERM-INDEX-LRU-SIZE-MAX*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $unrepresented_term_index_manager$ = makeSymbol("*UNREPRESENTED-TERM-INDEX-MANAGER*");

    private static final SubLInteger $int$40000 = makeInteger(40000);

    private static final SubLString $str3$unrepresented_term_index = makeString("unrepresented-term-index");

    private static final SubLSymbol LOAD_UNREPRESENTED_TERM_INDEX_FROM_CACHE = makeSymbol("LOAD-UNREPRESENTED-TERM-INDEX-FROM-CACHE");

    private static final SubLSymbol $sym6$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol WITH_KBOM_FULLY_LOADED = makeSymbol("WITH-KBOM-FULLY-LOADED");

    private static final SubLList $list8 = list(makeSymbol("*UNREPRESENTED-TERM-INDEX-MANAGER*"));

    private static final SubLString $str9$unrepresented_term_indices = makeString("unrepresented-term-indices");

    private static final SubLString $str10$unrepresented_term_indices_index = makeString("unrepresented-term-indices-index");

    private static final SubLString $str11$unrepresented_term_complex_indice = makeString("unrepresented-term-complex-indices");

    private static final SubLString $str12$unrepresented_term_complex_indice = makeString("unrepresented-term-complex-indices-index");

    private static final SubLString $$$uti = makeString("uti");

    private static final SubLString $$$cuti = makeString("cuti");

    private static final SubLSymbol $UNREPRESENTED_TERM_INDEX = makeKeyword("UNREPRESENTED-TERM-INDEX");

    public static final SubLObject setup_unrepresented_term_index_table_alt(SubLObject size, SubLObject exactP) {
        $unrepresented_term_index_manager$.setGlobalValue(kb_object_manager.new_kb_object_manager($str_alt2$unrepresented_term_index, size, $unrepresented_term_index_lru_size_percentage$.getGlobalValue(), LOAD_UNREPRESENTED_TERM_INDEX_FROM_CACHE, exactP));
        return T;
    }

    public static SubLObject setup_unrepresented_term_index_table(final SubLObject size, final SubLObject exactP) {
        $unrepresented_term_index_manager$.setGlobalValue(kb_object_manager.new_kb_object_manager($str3$unrepresented_term_index, size, $unrepresented_term_index_lru_size_percentage$.getGlobalValue(), $unrepresented_term_index_lru_size_max$.getGlobalValue(), LOAD_UNREPRESENTED_TERM_INDEX_FROM_CACHE, exactP));
        return T;
    }

    public static SubLObject resize_unrepresented_term_index_kbom_lru(SubLObject percentage, SubLObject max) {
        if (percentage == UNPROVIDED) {
            percentage = NIL;
        }
        if (max == UNPROVIDED) {
            max = NIL;
        }
        if (NIL == percentage) {
            percentage = $unrepresented_term_index_lru_size_percentage$.getGlobalValue();
        }
        if (NIL == max) {
            max = $unrepresented_term_index_lru_size_max$.getGlobalValue();
        }
        return kb_object_manager.resize_kbom_lru_cache_from_percentage_and_max($unrepresented_term_index_manager$.getGlobalValue(), percentage, max);
    }

    public static final SubLObject optimize_unrepresented_term_index_table_alt(SubLObject new_unrepresented_term_id_threshold) {
        return kb_object_manager.optimize_kb_object_content_table($unrepresented_term_index_manager$.getGlobalValue(), new_unrepresented_term_id_threshold);
    }

    public static SubLObject optimize_unrepresented_term_index_table(final SubLObject new_unrepresented_term_id_threshold) {
        return kb_object_manager.optimize_kb_object_content_table($unrepresented_term_index_manager$.getGlobalValue(), new_unrepresented_term_id_threshold);
    }

    public static final SubLObject clear_unrepresented_term_index_table_alt() {
        return kb_object_manager.clear_kb_object_content_table($unrepresented_term_index_manager$.getGlobalValue());
    }

    public static SubLObject clear_unrepresented_term_index_table() {
        return kb_object_manager.clear_kb_object_content_table($unrepresented_term_index_manager$.getGlobalValue());
    }

    /**
     * Enable the tracking of unrepresented-term-index usage counts.
     */
    @LispMethod(comment = "Enable the tracking of unrepresented-term-index usage counts.")
    public static final SubLObject maintain_unrepresented_term_index_usage_counts_alt() {
        return kb_object_manager.maintain_kb_object_usage_counts($unrepresented_term_index_manager$.getGlobalValue());
    }

    /**
     * Enable the tracking of unrepresented-term-index usage counts.
     */
    @LispMethod(comment = "Enable the tracking of unrepresented-term-index usage counts.")
    public static SubLObject maintain_unrepresented_term_index_usage_counts() {
        return kb_object_manager.maintain_kb_object_usage_counts($unrepresented_term_index_manager$.getGlobalValue());
    }

    /**
     * Disable the tracking of unrepresented-term-index usage counts.
     */
    @LispMethod(comment = "Disable the tracking of unrepresented-term-index usage counts.")
    public static final SubLObject dont_maintain_unrepresented_term_index_usage_counts_alt() {
        return kb_object_manager.dont_maintain_kb_object_usage_counts($unrepresented_term_index_manager$.getGlobalValue());
    }

    /**
     * Disable the tracking of unrepresented-term-index usage counts.
     */
    @LispMethod(comment = "Disable the tracking of unrepresented-term-index usage counts.")
    public static SubLObject dont_maintain_unrepresented_term_index_usage_counts() {
        return kb_object_manager.dont_maintain_kb_object_usage_counts($unrepresented_term_index_manager$.getGlobalValue());
    }

    /**
     * Test predicate whether unrepresented-term-index usage counts are already enabled or not.
     */
    @LispMethod(comment = "Test predicate whether unrepresented-term-index usage counts are already enabled or not.")
    public static final SubLObject unrepresented_term_index_usage_counts_enabled_p_alt() {
        return kb_object_manager.kb_object_usage_counts_enabledP($unrepresented_term_index_manager$.getGlobalValue());
    }

    /**
     * Test predicate whether unrepresented-term-index usage counts are already enabled or not.
     */
    @LispMethod(comment = "Test predicate whether unrepresented-term-index usage counts are already enabled or not.")
    public static SubLObject unrepresented_term_index_usage_counts_enabled_p() {
        return kb_object_manager.kb_object_usage_counts_enabledP($unrepresented_term_index_manager$.getGlobalValue());
    }

    /**
     * Return the number of unrepresented-term-indices whose content is cached in memory.
     */
    @LispMethod(comment = "Return the number of unrepresented-term-indices whose content is cached in memory.")
    public static final SubLObject cached_unrepresented_term_index_count_alt() {
        return kb_object_manager.cached_kb_object_count($unrepresented_term_index_manager$.getGlobalValue());
    }

    /**
     * Return the number of unrepresented-term-indices whose content is cached in memory.
     */
    @LispMethod(comment = "Return the number of unrepresented-term-indices whose content is cached in memory.")
    public static SubLObject cached_unrepresented_term_index_count() {
        return kb_object_manager.cached_kb_object_count($unrepresented_term_index_manager$.getGlobalValue());
    }

    public static final SubLObject unrepresented_term_indices_completely_cachedP_alt() {
        return numE(unrepresented_terms.kb_unrepresented_term_count(), com.cyc.cycjava.cycl.unrepresented_term_index_manager.cached_unrepresented_term_index_count());
    }

    public static SubLObject unrepresented_term_indices_completely_cachedP() {
        return numE(unrepresented_terms.kb_unrepresented_term_count(), cached_unrepresented_term_index_count());
    }

    public static final SubLObject lookup_unrepresented_term_index_alt(SubLObject id) {
        return kb_object_manager.lookup_kb_object_content($unrepresented_term_index_manager$.getGlobalValue(), id);
    }

    public static SubLObject lookup_unrepresented_term_index(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding(thread);
        try {
            kb_storage_logging.$kb_storage_client$.bind(kb_storage_logging.add_kb_storage_logging_add_tag($UTI), thread);
            return kb_object_manager.lookup_kb_object_content($unrepresented_term_index_manager$.getGlobalValue(), id);
        } finally {
            kb_storage_logging.$kb_storage_client$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject get_file_backed_unrepresented_term_internal_id_threshold() {
        return kb_object_manager.get_file_backed_kb_object_id_threshold($unrepresented_term_index_manager$.getGlobalValue());
    }

    public static SubLObject new_muted_unrepresented_term_index_iterator() {
        return kb_object_manager.new_muted_kb_object_iterator($unrepresented_term_index_manager$.getGlobalValue());
    }

    public static SubLObject unrepresented_term_index_dont_maintain_usages_counts() {
        return kb_object_manager.dont_maintain_kb_object_usage_counts($unrepresented_term_index_manager$.getGlobalValue());
    }

    public static SubLObject unrepresented_term_index_maintain_usage_counts() {
        return kb_object_manager.maintain_kb_object_usage_counts($unrepresented_term_index_manager$.getGlobalValue());
    }

    public static SubLObject unrepresented_term_index_usage_counts_enabledP() {
        return kb_object_manager.kb_object_usage_counts_enabledP($unrepresented_term_index_manager$.getGlobalValue());
    }

    public static SubLObject unrepresented_term_index_change_stream_buffer_sizes(final SubLObject data_stream_buffer_size, final SubLObject index_stream_buffer_size) {
        return kb_object_manager.kb_object_manager_change_stream_buffer_sizes($unrepresented_term_index_manager$.getGlobalValue(), data_stream_buffer_size, index_stream_buffer_size);
    }

    public static SubLObject unrepresented_term_index_enable_memory_mapping() {
        return kb_object_manager.kb_object_manager_enable_memory_mapping($unrepresented_term_index_manager$.getGlobalValue());
    }

    public static SubLObject unrepresented_term_index_memory_mappedP() {
        return kb_object_manager.kb_object_manager_memory_mappedP($unrepresented_term_index_manager$.getGlobalValue());
    }

    public static SubLObject with_unrepresented_term_index_fully_loaded(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_KBOM_FULLY_LOADED, $list8, append(body, NIL));
    }

    /**
     * Note that ID will be used as the id for UNREPRESENTED-TERM-INDEX.
     */
    @LispMethod(comment = "Note that ID will be used as the id for UNREPRESENTED-TERM-INDEX.")
    public static final SubLObject register_unrepresented_term_index_alt(SubLObject id, SubLObject unrepresented_term_index) {
        return kb_object_manager.register_kb_object_content($unrepresented_term_index_manager$.getGlobalValue(), id, unrepresented_term_index);
    }

    /**
     * Note that ID will be used as the id for UNREPRESENTED-TERM-INDEX.
     */
    @LispMethod(comment = "Note that ID will be used as the id for UNREPRESENTED-TERM-INDEX.")
    public static SubLObject register_unrepresented_term_index(final SubLObject id, final SubLObject unrepresented_term_index) {
        return kb_object_manager.register_kb_object_content($unrepresented_term_index_manager$.getGlobalValue(), id, unrepresented_term_index);
    }

    /**
     * Note that ID is not in use as an UNREPRESENTED-TERM-INDEX id
     */
    @LispMethod(comment = "Note that ID is not in use as an UNREPRESENTED-TERM-INDEX id")
    public static final SubLObject deregister_unrepresented_term_index_alt(SubLObject id) {
        return kb_object_manager.deregister_kb_object_content($unrepresented_term_index_manager$.getGlobalValue(), id);
    }

    /**
     * Note that ID is not in use as an UNREPRESENTED-TERM-INDEX id
     */
    @LispMethod(comment = "Note that ID is not in use as an UNREPRESENTED-TERM-INDEX id")
    public static SubLObject deregister_unrepresented_term_index(final SubLObject id) {
        return kb_object_manager.deregister_kb_object_content($unrepresented_term_index_manager$.getGlobalValue(), id);
    }

    public static final SubLObject mark_unrepresented_term_index_as_muted_alt(SubLObject id) {
        return kb_object_manager.mark_kb_object_content_as_muted($unrepresented_term_index_manager$.getGlobalValue(), id);
    }

    public static SubLObject mark_unrepresented_term_index_as_muted(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding(thread);
        try {
            kb_storage_logging.$kb_storage_client$.bind(kb_storage_logging.add_kb_storage_logging_add_tag($UTI), thread);
            return kb_object_manager.mark_kb_object_content_as_muted($unrepresented_term_index_manager$.getGlobalValue(), id);
        } finally {
            kb_storage_logging.$kb_storage_client$.rebind(_prev_bind_0, thread);
        }
    }

    /**
     * Turn metering of unrepresented-term-index content swap time on.
     */
    @LispMethod(comment = "Turn metering of unrepresented-term-index content swap time on.")
    public static final SubLObject meter_unrepresented_term_index_swap_time_alt() {
        return kb_object_manager.meter_kb_object_content_swap_time($unrepresented_term_index_manager$.getGlobalValue());
    }

    /**
     * Turn metering of unrepresented-term-index content swap time on.
     */
    @LispMethod(comment = "Turn metering of unrepresented-term-index content swap time on.")
    public static SubLObject meter_unrepresented_term_index_swap_time() {
        return kb_object_manager.meter_kb_object_content_swap_time($unrepresented_term_index_manager$.getGlobalValue());
    }

    static private final SubLString $str_alt2$unrepresented_term_index = makeString("unrepresented-term-index");

    /**
     * Turn metering of unrepresented-term-index content swap time off.
     */
    @LispMethod(comment = "Turn metering of unrepresented-term-index content swap time off.")
    public static final SubLObject dont_meter_unrepresented_term_index_swap_time_alt() {
        return kb_object_manager.dont_meter_kb_object_content_swap_time($unrepresented_term_index_manager$.getGlobalValue());
    }

    /**
     * Turn metering of unrepresented-term-index content swap time off.
     */
    @LispMethod(comment = "Turn metering of unrepresented-term-index content swap time off.")
    public static SubLObject dont_meter_unrepresented_term_index_swap_time() {
        return kb_object_manager.dont_meter_kb_object_content_swap_time($unrepresented_term_index_manager$.getGlobalValue());
    }

    static private final SubLString $str_alt4$unrepresented_term_indices = makeString("unrepresented-term-indices");

    static private final SubLString $str_alt5$unrepresented_term_indices_index = makeString("unrepresented-term-indices-index");

    /**
     * Reset unrepresented-term-index content swap time to 0.
     */
    @LispMethod(comment = "Reset unrepresented-term-index content swap time to 0.")
    public static final SubLObject clear_unrepresented_term_index_swap_time_alt() {
        return kb_object_manager.clear_kb_object_content_swap_time($unrepresented_term_index_manager$.getGlobalValue());
    }

    /**
     * Reset unrepresented-term-index content swap time to 0.
     */
    @LispMethod(comment = "Reset unrepresented-term-index content swap time to 0.")
    public static SubLObject clear_unrepresented_term_index_swap_time() {
        return kb_object_manager.clear_kb_object_content_swap_time($unrepresented_term_index_manager$.getGlobalValue());
    }

    /**
     *
     *
     * @return NON-NEGATIVE-NUMBER-P; How many seconds have been spent inside
    SWAP-IN-UNREPRESENTED-TERM-INDEX with metering on since the last time it was cleared?
     */
    @LispMethod(comment = "@return NON-NEGATIVE-NUMBER-P; How many seconds have been spent inside\r\nSWAP-IN-UNREPRESENTED-TERM-INDEX with metering on since the last time it was cleared?")
    public static final SubLObject current_unrepresented_term_index_swap_time_alt() {
        return kb_object_manager.kb_object_manager_swap_time($unrepresented_term_index_manager$.getGlobalValue());
    }

    /**
     *
     *
     * @return NON-NEGATIVE-NUMBER-P; How many seconds have been spent inside
    SWAP-IN-UNREPRESENTED-TERM-INDEX with metering on since the last time it was cleared?
     */
    @LispMethod(comment = "@return NON-NEGATIVE-NUMBER-P; How many seconds have been spent inside\r\nSWAP-IN-UNREPRESENTED-TERM-INDEX with metering on since the last time it was cleared?")
    public static SubLObject current_unrepresented_term_index_swap_time() {
        return kb_object_manager.kb_object_manager_swap_time($unrepresented_term_index_manager$.getGlobalValue());
    }

    public static final SubLObject swap_out_all_pristine_unrepresented_term_indices_alt() {
        return kb_object_manager.swap_out_all_pristine_kb_objects_int($unrepresented_term_index_manager$.getGlobalValue());
    }

    public static SubLObject swap_out_all_pristine_unrepresented_term_indices() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding(thread);
        try {
            kb_storage_logging.$kb_storage_client$.bind(kb_storage_logging.add_kb_storage_logging_add_tag($UTI), thread);
            return kb_object_manager.safely_swap_out_all_pristine_kb_objects($unrepresented_term_index_manager$.getGlobalValue());
        } finally {
            kb_storage_logging.$kb_storage_client$.rebind(_prev_bind_0, thread);
        }
    }

    public static final SubLObject initialize_unrepresented_term_index_hl_store_cache_alt() {
        return kb_object_manager.initialize_kb_object_hl_store_cache($unrepresented_term_index_manager$.getGlobalValue(), $str_alt4$unrepresented_term_indices, $str_alt5$unrepresented_term_indices_index);
    }

    public static SubLObject initialize_unrepresented_term_index_hl_store_cache() {
        final SubLObject result = kb_object_manager.initialize_kb_object_hl_store_cache($unrepresented_term_index_manager$.getGlobalValue(), $str9$unrepresented_term_indices, $str10$unrepresented_term_indices_index, $str11$unrepresented_term_complex_indice, $str12$unrepresented_term_complex_indice);
        kb_storage_logging.register_kb_storage_logging_tag(kb_object_manager.kb_object_manager_file_vector($unrepresented_term_index_manager$.getGlobalValue()), $$$uti);
        final SubLObject sub_fvector = kb_object_manager.kb_object_manager_sub_file_vector($unrepresented_term_index_manager$.getGlobalValue());
        if (NIL != file_vector.file_vector_p(sub_fvector)) {
            kb_storage_logging.register_kb_storage_logging_tag(sub_fvector, $$$cuti);
            file_vector_utilities.register_indexical_file_vector_reference($UNREPRESENTED_TERM_INDEX, sub_fvector);
        }
        return result;
    }

    public static SubLObject wide_unrepresented_term_index_hl_store_cacheP() {
        return kb_object_manager.wide_kb_object_managerP($unrepresented_term_index_manager$.getGlobalValue());
    }

    public static SubLObject wide_unrepresented_term_complex_index_hl_store_cacheP() {
        return kb_object_manager.wide_kb_object_sub_managerP($unrepresented_term_index_manager$.getGlobalValue());
    }

    public static SubLObject declare_unrepresented_term_index_manager_file() {
        declareFunction("setup_unrepresented_term_index_table", "SETUP-UNREPRESENTED-TERM-INDEX-TABLE", 2, 0, false);
        declareFunction("resize_unrepresented_term_index_kbom_lru", "RESIZE-UNREPRESENTED-TERM-INDEX-KBOM-LRU", 0, 2, false);
        declareFunction("optimize_unrepresented_term_index_table", "OPTIMIZE-UNREPRESENTED-TERM-INDEX-TABLE", 1, 0, false);
        declareFunction("clear_unrepresented_term_index_table", "CLEAR-UNREPRESENTED-TERM-INDEX-TABLE", 0, 0, false);
        declareFunction("maintain_unrepresented_term_index_usage_counts", "MAINTAIN-UNREPRESENTED-TERM-INDEX-USAGE-COUNTS", 0, 0, false);
        declareFunction("dont_maintain_unrepresented_term_index_usage_counts", "DONT-MAINTAIN-UNREPRESENTED-TERM-INDEX-USAGE-COUNTS", 0, 0, false);
        declareFunction("unrepresented_term_index_usage_counts_enabled_p", "UNREPRESENTED-TERM-INDEX-USAGE-COUNTS-ENABLED-P", 0, 0, false);
        declareFunction("cached_unrepresented_term_index_count", "CACHED-UNREPRESENTED-TERM-INDEX-COUNT", 0, 0, false);
        declareFunction("unrepresented_term_indices_completely_cachedP", "UNREPRESENTED-TERM-INDICES-COMPLETELY-CACHED?", 0, 0, false);
        declareFunction("lookup_unrepresented_term_index", "LOOKUP-UNREPRESENTED-TERM-INDEX", 1, 0, false);
        declareFunction("get_file_backed_unrepresented_term_internal_id_threshold", "GET-FILE-BACKED-UNREPRESENTED-TERM-INTERNAL-ID-THRESHOLD", 0, 0, false);
        declareFunction("new_muted_unrepresented_term_index_iterator", "NEW-MUTED-UNREPRESENTED-TERM-INDEX-ITERATOR", 0, 0, false);
        declareFunction("unrepresented_term_index_dont_maintain_usages_counts", "UNREPRESENTED-TERM-INDEX-DONT-MAINTAIN-USAGES-COUNTS", 0, 0, false);
        declareFunction("unrepresented_term_index_maintain_usage_counts", "UNREPRESENTED-TERM-INDEX-MAINTAIN-USAGE-COUNTS", 0, 0, false);
        declareFunction("unrepresented_term_index_usage_counts_enabledP", "UNREPRESENTED-TERM-INDEX-USAGE-COUNTS-ENABLED?", 0, 0, false);
        declareFunction("unrepresented_term_index_change_stream_buffer_sizes", "UNREPRESENTED-TERM-INDEX-CHANGE-STREAM-BUFFER-SIZES", 2, 0, false);
        declareFunction("unrepresented_term_index_enable_memory_mapping", "UNREPRESENTED-TERM-INDEX-ENABLE-MEMORY-MAPPING", 0, 0, false);
        declareFunction("unrepresented_term_index_memory_mappedP", "UNREPRESENTED-TERM-INDEX-MEMORY-MAPPED?", 0, 0, false);
        declareMacro("with_unrepresented_term_index_fully_loaded", "WITH-UNREPRESENTED-TERM-INDEX-FULLY-LOADED");
        declareFunction("register_unrepresented_term_index", "REGISTER-UNREPRESENTED-TERM-INDEX", 2, 0, false);
        declareFunction("deregister_unrepresented_term_index", "DEREGISTER-UNREPRESENTED-TERM-INDEX", 1, 0, false);
        declareFunction("mark_unrepresented_term_index_as_muted", "MARK-UNREPRESENTED-TERM-INDEX-AS-MUTED", 1, 0, false);
        declareFunction("meter_unrepresented_term_index_swap_time", "METER-UNREPRESENTED-TERM-INDEX-SWAP-TIME", 0, 0, false);
        declareFunction("dont_meter_unrepresented_term_index_swap_time", "DONT-METER-UNREPRESENTED-TERM-INDEX-SWAP-TIME", 0, 0, false);
        declareFunction("clear_unrepresented_term_index_swap_time", "CLEAR-UNREPRESENTED-TERM-INDEX-SWAP-TIME", 0, 0, false);
        declareFunction("current_unrepresented_term_index_swap_time", "CURRENT-UNREPRESENTED-TERM-INDEX-SWAP-TIME", 0, 0, false);
        declareFunction("swap_out_all_pristine_unrepresented_term_indices", "SWAP-OUT-ALL-PRISTINE-UNREPRESENTED-TERM-INDICES", 0, 0, false);
        declareFunction("initialize_unrepresented_term_index_hl_store_cache", "INITIALIZE-UNREPRESENTED-TERM-INDEX-HL-STORE-CACHE", 0, 0, false);
        declareFunction("wide_unrepresented_term_index_hl_store_cacheP", "WIDE-UNREPRESENTED-TERM-INDEX-HL-STORE-CACHE?", 0, 0, false);
        declareFunction("wide_unrepresented_term_complex_index_hl_store_cacheP", "WIDE-UNREPRESENTED-TERM-COMPLEX-INDEX-HL-STORE-CACHE?", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_unrepresented_term_index_manager_file_alt() {
        deflexical("*UNREPRESENTED-TERM-INDEX-MANAGER*", NIL != boundp($unrepresented_term_index_manager$) ? ((SubLObject) ($unrepresented_term_index_manager$.getGlobalValue())) : $UNINITIALIZED);
        deflexical("*UNREPRESENTED-TERM-INDEX-LRU-SIZE-PERCENTAGE*", TEN_INTEGER);
        return NIL;
    }

    public static SubLObject init_unrepresented_term_index_manager_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*UNREPRESENTED-TERM-INDEX-MANAGER*", SubLTrampolineFile.maybeDefault($unrepresented_term_index_manager$, $unrepresented_term_index_manager$, $UNINITIALIZED));
            deflexical("*UNREPRESENTED-TERM-INDEX-LRU-SIZE-PERCENTAGE*", TEN_INTEGER);
            deflexical("*UNREPRESENTED-TERM-INDEX-LRU-SIZE-MAX*", $int$40000);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*UNREPRESENTED-TERM-INDEX-MANAGER*", NIL != boundp($unrepresented_term_index_manager$) ? ((SubLObject) ($unrepresented_term_index_manager$.getGlobalValue())) : $UNINITIALIZED);
        }
        return NIL;
    }

    public static SubLObject init_unrepresented_term_index_manager_file_Previous() {
        deflexical("*UNREPRESENTED-TERM-INDEX-MANAGER*", SubLTrampolineFile.maybeDefault($unrepresented_term_index_manager$, $unrepresented_term_index_manager$, $UNINITIALIZED));
        deflexical("*UNREPRESENTED-TERM-INDEX-LRU-SIZE-PERCENTAGE*", TEN_INTEGER);
        deflexical("*UNREPRESENTED-TERM-INDEX-LRU-SIZE-MAX*", $int$40000);
        return NIL;
    }

    public static SubLObject setup_unrepresented_term_index_manager_file() {
        declare_defglobal($unrepresented_term_index_manager$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_unrepresented_term_index_manager_file();
    }

    @Override
    public void initializeVariables() {
        init_unrepresented_term_index_manager_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_unrepresented_term_index_manager_file();
    }

    static {
    }
}

/**
 * Total time: 109 ms
 */
