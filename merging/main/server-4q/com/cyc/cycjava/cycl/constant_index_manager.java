/**
 *
 */
/**
 *
 */
/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.constant_count;
import static com.cyc.cycjava.cycl.constant_handles.constant_suid;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
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
 * module:      CONSTANT-INDEX-MANAGER
 * source file: /cyc/top/cycl/constant-index-manager.lisp
 * created:     2019/07/03 17:37:20
 */
public final class constant_index_manager extends SubLTranslatedFile implements V12 {
    /**
     * We never want to swap out the indices of these constants
     */
    // deflexical
    @LispMethod(comment = "We never want to swap out the indices of these constants\ndeflexical")
    private static final SubLSymbol $permanently_cached_constant_indices$ = makeSymbol("*PERMANENTLY-CACHED-CONSTANT-INDICES*");

    public static final SubLFile me = new constant_index_manager();

 public static final String myName = "com.cyc.cycjava.cycl.constant_index_manager";


    // deflexical
    /**
     * Based on arete experiments, only 16% of all constants are touched during normal inference,
     * so we'll make a conservative guess that every one of those touched the constant's index.
     */
    @LispMethod(comment = "Based on arete experiments, only 16% of all constants are touched during normal inference,\r\nso we\'ll make a conservative guess that every one of those touched the constant\'s index.\ndeflexical\nBased on arete experiments, only 16% of all constants are touched during normal inference,\nso we\'ll make a conservative guess that every one of those touched the constant\'s index.")
    private static final SubLSymbol $constant_index_lru_size_percentage$ = makeSymbol("*CONSTANT-INDEX-LRU-SIZE-PERCENTAGE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $constant_index_lru_size_max$ = makeSymbol("*CONSTANT-INDEX-LRU-SIZE-MAX*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $constant_index_manager$ = makeSymbol("*CONSTANT-INDEX-MANAGER*");

    private static final SubLInteger $int$20000 = makeInteger(20000);

    private static final SubLString $str3$constant_index = makeString("constant-index");

    private static final SubLSymbol LOAD_CONSTANT_INDEX_FROM_CACHE = makeSymbol("LOAD-CONSTANT-INDEX-FROM-CACHE");

    private static final SubLSymbol $sym6$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol WITH_KBOM_FULLY_LOADED = makeSymbol("WITH-KBOM-FULLY-LOADED");

    private static final SubLList $list8 = list(makeSymbol("*CONSTANT-INDEX-MANAGER*"));

    private static final SubLString $$$indices = makeString("indices");

    private static final SubLString $str10$indices_index = makeString("indices-index");

    private static final SubLString $str11$constant_complex_indices = makeString("constant-complex-indices");

    private static final SubLString $str12$constant_complex_indices_index = makeString("constant-complex-indices-index");

    private static final SubLString $$$cim = makeString("cim");

    private static final SubLString $$$ccim = makeString("ccim");

    public static final SubLObject setup_constant_index_table_alt(SubLObject size, SubLObject exactP) {
        $constant_index_manager$.setGlobalValue(kb_object_manager.new_kb_object_manager($str_alt2$constant_index, size, $constant_index_lru_size_percentage$.getGlobalValue(), LOAD_CONSTANT_INDEX_FROM_CACHE, exactP));
        return T;
    }

    public static SubLObject setup_constant_index_table(final SubLObject size, final SubLObject exactP) {
        $constant_index_manager$.setGlobalValue(kb_object_manager.new_kb_object_manager($str3$constant_index, size, $constant_index_lru_size_percentage$.getGlobalValue(), $constant_index_lru_size_max$.getGlobalValue(), LOAD_CONSTANT_INDEX_FROM_CACHE, exactP));
        return T;
    }

    public static SubLObject resize_constant_index_kbom_lru(SubLObject percentage, SubLObject max) {
        if (percentage == UNPROVIDED) {
            percentage = NIL;
        }
        if (max == UNPROVIDED) {
            max = NIL;
        }
        if (NIL == percentage) {
            percentage = $constant_index_lru_size_percentage$.getGlobalValue();
        }
        if (NIL == max) {
            max = $constant_index_lru_size_max$.getGlobalValue();
        }
        return kb_object_manager.resize_kbom_lru_cache_from_percentage_and_max($constant_index_manager$.getGlobalValue(), percentage, max);
    }

    public static final SubLObject optimize_constant_index_table_alt(SubLObject new_constant_id_threshold) {
        return kb_object_manager.optimize_kb_object_content_table($constant_index_manager$.getGlobalValue(), new_constant_id_threshold);
    }

    public static SubLObject optimize_constant_index_table(final SubLObject new_constant_id_threshold) {
        return kb_object_manager.optimize_kb_object_content_table($constant_index_manager$.getGlobalValue(), new_constant_id_threshold);
    }

    public static final SubLObject clear_constant_index_table_alt() {
        return kb_object_manager.clear_kb_object_content_table($constant_index_manager$.getGlobalValue());
    }

    public static SubLObject clear_constant_index_table() {
        return kb_object_manager.clear_kb_object_content_table($constant_index_manager$.getGlobalValue());
    }

    /**
     * Enable the tracking of constant-index usage counts.
     */
    @LispMethod(comment = "Enable the tracking of constant-index usage counts.")
    public static final SubLObject maintain_constant_index_usage_counts_alt() {
        return kb_object_manager.maintain_kb_object_usage_counts($constant_index_manager$.getGlobalValue());
    }

    /**
     * Enable the tracking of constant-index usage counts.
     */
    @LispMethod(comment = "Enable the tracking of constant-index usage counts.")
    public static SubLObject maintain_constant_index_usage_counts() {
        return kb_object_manager.maintain_kb_object_usage_counts($constant_index_manager$.getGlobalValue());
    }

    /**
     * Disable the tracking of constant-index usage counts.
     */
    @LispMethod(comment = "Disable the tracking of constant-index usage counts.")
    public static final SubLObject dont_maintain_constant_index_usage_counts_alt() {
        return kb_object_manager.dont_maintain_kb_object_usage_counts($constant_index_manager$.getGlobalValue());
    }

    /**
     * Disable the tracking of constant-index usage counts.
     */
    @LispMethod(comment = "Disable the tracking of constant-index usage counts.")
    public static SubLObject dont_maintain_constant_index_usage_counts() {
        return kb_object_manager.dont_maintain_kb_object_usage_counts($constant_index_manager$.getGlobalValue());
    }

    /**
     * Test predicate whether constant-index usage counts are already enabled or not.
     */
    @LispMethod(comment = "Test predicate whether constant-index usage counts are already enabled or not.")
    public static final SubLObject constant_index_usage_counts_enabled_p_alt() {
        return kb_object_manager.kb_object_usage_counts_enabledP($constant_index_manager$.getGlobalValue());
    }

    /**
     * Test predicate whether constant-index usage counts are already enabled or not.
     */
    @LispMethod(comment = "Test predicate whether constant-index usage counts are already enabled or not.")
    public static SubLObject constant_index_usage_counts_enabled_p() {
        return kb_object_manager.kb_object_usage_counts_enabledP($constant_index_manager$.getGlobalValue());
    }

    /**
     * Return the number of constant-indices whose content is cached in memory.
     */
    @LispMethod(comment = "Return the number of constant-indices whose content is cached in memory.")
    public static final SubLObject cached_constant_index_count_alt() {
        return kb_object_manager.cached_kb_object_count($constant_index_manager$.getGlobalValue());
    }

    /**
     * Return the number of constant-indices whose content is cached in memory.
     */
    @LispMethod(comment = "Return the number of constant-indices whose content is cached in memory.")
    public static SubLObject cached_constant_index_count() {
        return kb_object_manager.cached_kb_object_count($constant_index_manager$.getGlobalValue());
    }

    public static final SubLObject constant_indices_completely_cachedP_alt() {
        return numE(constant_count(), com.cyc.cycjava.cycl.constant_index_manager.cached_constant_index_count());
    }

    public static SubLObject constant_indices_completely_cachedP() {
        return numE(constant_count(), cached_constant_index_count());
    }

    public static final SubLObject lookup_constant_index_alt(SubLObject id) {
        return kb_object_manager.lookup_kb_object_content($constant_index_manager$.getGlobalValue(), id);
    }

    public static SubLObject lookup_constant_index(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding(thread);
        try {
            kb_storage_logging.$kb_storage_client$.bind(kb_storage_logging.add_kb_storage_logging_add_tag($CIM), thread);
            return kb_object_manager.lookup_kb_object_content($constant_index_manager$.getGlobalValue(), id);
        } finally {
            kb_storage_logging.$kb_storage_client$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject constant_index_cachedP(final SubLObject id) {
        return kb_object_manager.kb_object_id_cachedP($constant_index_manager$.getGlobalValue(), id);
    }

    public static final SubLObject get_file_backed_constant_internal_id_threshold_alt() {
        return kb_object_manager.get_file_backed_kb_object_id_threshold($constant_index_manager$.getGlobalValue());
    }

    public static SubLObject get_file_backed_constant_internal_id_threshold() {
        return kb_object_manager.get_file_backed_kb_object_id_threshold($constant_index_manager$.getGlobalValue());
    }

    public static SubLObject new_muted_constant_index_iterator() {
        return kb_object_manager.new_muted_kb_object_iterator($constant_index_manager$.getGlobalValue());
    }

    public static SubLObject constant_index_dont_maintain_usages_counts() {
        return kb_object_manager.dont_maintain_kb_object_usage_counts($constant_index_manager$.getGlobalValue());
    }

    public static SubLObject constant_index_maintain_usage_counts() {
        return kb_object_manager.maintain_kb_object_usage_counts($constant_index_manager$.getGlobalValue());
    }

    public static SubLObject constant_index_usage_counts_enabledP() {
        return kb_object_manager.kb_object_usage_counts_enabledP($constant_index_manager$.getGlobalValue());
    }

    public static SubLObject constant_indexchange_stream_buffer_sizes(final SubLObject data_stream_buffer_size, final SubLObject index_stream_buffer_size) {
        return kb_object_manager.kb_object_manager_change_stream_buffer_sizes($constant_index_manager$.getGlobalValue(), data_stream_buffer_size, index_stream_buffer_size);
    }

    public static SubLObject constant_index_enable_memory_mapping() {
        return kb_object_manager.kb_object_manager_enable_memory_mapping($constant_index_manager$.getGlobalValue());
    }

    public static SubLObject constant_index_memory_mappedP() {
        return kb_object_manager.kb_object_manager_memory_mappedP($constant_index_manager$.getGlobalValue());
    }

    public static SubLObject with_constant_index_fully_loaded(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_KBOM_FULLY_LOADED, $list8, append(body, NIL));
    }

    /**
     * Note that ID will be used as the id for CONSTANT-INDEX.
     */
    @LispMethod(comment = "Note that ID will be used as the id for CONSTANT-INDEX.")
    public static final SubLObject register_constant_index_alt(SubLObject id, SubLObject constant_index) {
        return kb_object_manager.register_kb_object_content($constant_index_manager$.getGlobalValue(), id, constant_index);
    }

    /**
     * Note that ID will be used as the id for CONSTANT-INDEX.
     */
    @LispMethod(comment = "Note that ID will be used as the id for CONSTANT-INDEX.")
    public static SubLObject register_constant_index(final SubLObject id, final SubLObject constant_index) {
        return kb_object_manager.register_kb_object_content($constant_index_manager$.getGlobalValue(), id, constant_index);
    }

    /**
     * Note that ID is not in use as an CONSTANT-INDEX id
     */
    @LispMethod(comment = "Note that ID is not in use as an CONSTANT-INDEX id")
    public static final SubLObject deregister_constant_index_alt(SubLObject id) {
        return kb_object_manager.deregister_kb_object_content($constant_index_manager$.getGlobalValue(), id);
    }

    /**
     * Note that ID is not in use as an CONSTANT-INDEX id
     */
    @LispMethod(comment = "Note that ID is not in use as an CONSTANT-INDEX id")
    public static SubLObject deregister_constant_index(final SubLObject id) {
        return kb_object_manager.deregister_kb_object_content($constant_index_manager$.getGlobalValue(), id);
    }

    public static final SubLObject mark_constant_index_as_muted_alt(SubLObject id) {
        return kb_object_manager.mark_kb_object_content_as_muted($constant_index_manager$.getGlobalValue(), id);
    }

    public static SubLObject mark_constant_index_as_muted(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding(thread);
        try {
            kb_storage_logging.$kb_storage_client$.bind(kb_storage_logging.add_kb_storage_logging_add_tag($CIM), thread);
            return kb_object_manager.mark_kb_object_content_as_muted($constant_index_manager$.getGlobalValue(), id);
        } finally {
            kb_storage_logging.$kb_storage_client$.rebind(_prev_bind_0, thread);
        }
    }

    /**
     * First, make sure it's swapped in.  Then make sure it won't ever get swapped out.
     */
    @LispMethod(comment = "First, make sure it\'s swapped in.  Then make sure it won\'t ever get swapped out.")
    public static final SubLObject mark_constant_index_as_permanently_cached_alt(SubLObject id) {
        com.cyc.cycjava.cycl.constant_index_manager.lookup_constant_index(id);
        return com.cyc.cycjava.cycl.constant_index_manager.mark_constant_index_as_muted(id);
    }

    /**
     * First, make sure it's swapped in.  Then make sure it won't ever get swapped out.
     */
    @LispMethod(comment = "First, make sure it\'s swapped in.  Then make sure it won\'t ever get swapped out.")
    public static SubLObject mark_constant_index_as_permanently_cached(final SubLObject id) {
        lookup_constant_index(id);
        return mark_constant_index_as_muted(id);
    }

    /**
     * Turn metering of constant-index content swap time on.
     */
    @LispMethod(comment = "Turn metering of constant-index content swap time on.")
    public static final SubLObject meter_constant_index_swap_time_alt() {
        return kb_object_manager.meter_kb_object_content_swap_time($constant_index_manager$.getGlobalValue());
    }

    /**
     * Turn metering of constant-index content swap time on.
     */
    @LispMethod(comment = "Turn metering of constant-index content swap time on.")
    public static SubLObject meter_constant_index_swap_time() {
        return kb_object_manager.meter_kb_object_content_swap_time($constant_index_manager$.getGlobalValue());
    }

    /**
     * Turn metering of constant-index content swap time off.
     */
    @LispMethod(comment = "Turn metering of constant-index content swap time off.")
    public static final SubLObject dont_meter_constant_index_swap_time_alt() {
        return kb_object_manager.dont_meter_kb_object_content_swap_time($constant_index_manager$.getGlobalValue());
    }

    /**
     * Turn metering of constant-index content swap time off.
     */
    @LispMethod(comment = "Turn metering of constant-index content swap time off.")
    public static SubLObject dont_meter_constant_index_swap_time() {
        return kb_object_manager.dont_meter_kb_object_content_swap_time($constant_index_manager$.getGlobalValue());
    }

    /**
     * Reset constant-index content swap time to 0.
     */
    @LispMethod(comment = "Reset constant-index content swap time to 0.")
    public static final SubLObject clear_constant_index_swap_time_alt() {
        return kb_object_manager.clear_kb_object_content_swap_time($constant_index_manager$.getGlobalValue());
    }

    /**
     * Reset constant-index content swap time to 0.
     */
    @LispMethod(comment = "Reset constant-index content swap time to 0.")
    public static SubLObject clear_constant_index_swap_time() {
        return kb_object_manager.clear_kb_object_content_swap_time($constant_index_manager$.getGlobalValue());
    }

    /**
     *
     *
     * @return NON-NEGATIVE-NUMBER-P; How many seconds have been spent inside
    SWAP-IN-CONSTANT-INDEX with metering on since the last time it was cleared?
     */
    @LispMethod(comment = "@return NON-NEGATIVE-NUMBER-P; How many seconds have been spent inside\r\nSWAP-IN-CONSTANT-INDEX with metering on since the last time it was cleared?")
    public static final SubLObject current_constant_index_swap_time_alt() {
        return kb_object_manager.kb_object_manager_swap_time($constant_index_manager$.getGlobalValue());
    }

    /**
     *
     *
     * @return NON-NEGATIVE-NUMBER-P; How many seconds have been spent inside
    SWAP-IN-CONSTANT-INDEX with metering on since the last time it was cleared?
     */
    @LispMethod(comment = "@return NON-NEGATIVE-NUMBER-P; How many seconds have been spent inside\r\nSWAP-IN-CONSTANT-INDEX with metering on since the last time it was cleared?")
    public static SubLObject current_constant_index_swap_time() {
        return kb_object_manager.kb_object_manager_swap_time($constant_index_manager$.getGlobalValue());
    }

    public static final SubLObject swap_out_all_pristine_constant_indices_alt() {
        return kb_object_manager.swap_out_all_pristine_kb_objects_int($constant_index_manager$.getGlobalValue());
    }

    public static SubLObject swap_out_all_pristine_constant_indices() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding(thread);
        try {
            kb_storage_logging.$kb_storage_client$.bind(kb_storage_logging.add_kb_storage_logging_add_tag($CIM), thread);
            return kb_object_manager.safely_swap_out_all_pristine_kb_objects($constant_index_manager$.getGlobalValue());
        } finally {
            kb_storage_logging.$kb_storage_client$.rebind(_prev_bind_0, thread);
        }
    }

    static private final SubLString $str_alt2$constant_index = makeString("constant-index");

    public static final SubLObject initialize_constant_index_hl_store_cache_alt() {
        {
            SubLObject result = kb_object_manager.initialize_kb_object_hl_store_cache($constant_index_manager$.getGlobalValue(), $$$indices, $str_alt6$indices_index);
            SubLObject cdolist_list_var = $permanently_cached_constant_indices$.getGlobalValue();
            SubLObject constant = NIL;
            for (constant = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constant = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.constant_index_manager.mark_constant_index_as_permanently_cached(constant_suid(constant));
            }
            return result;
        }
    }

    public static SubLObject initialize_constant_index_hl_store_cache() {
        final SubLObject result = kb_object_manager.initialize_kb_object_hl_store_cache($constant_index_manager$.getGlobalValue(), $$$indices, $str10$indices_index, $str11$constant_complex_indices, $str12$constant_complex_indices_index);
        kb_storage_logging.register_kb_storage_logging_tag(kb_object_manager.kb_object_manager_file_vector($constant_index_manager$.getGlobalValue()), $$$cim);
        final SubLObject sub_fvector = kb_object_manager.kb_object_manager_sub_file_vector($constant_index_manager$.getGlobalValue());
        if (NIL != file_vector.file_vector_p(sub_fvector)) {
            kb_storage_logging.register_kb_storage_logging_tag(sub_fvector, $$$ccim);
            file_vector_utilities.register_indexical_file_vector_reference($CONSTANT_INDEX, sub_fvector);
        }
        return result;
    }

    static private final SubLList $list_alt4 = list(reader_make_constant_shell("isa"), reader_make_constant_shell("genls"));

    static private final SubLString $str_alt6$indices_index = makeString("indices-index");

    public static SubLObject wide_constant_index_hl_store_cacheP() {
        return kb_object_manager.wide_kb_object_managerP($constant_index_manager$.getGlobalValue());
    }

    public static SubLObject wide_constant_complex_index_hl_store_cacheP() {
        return kb_object_manager.wide_kb_object_sub_managerP($constant_index_manager$.getGlobalValue());
    }

    public static SubLObject declare_constant_index_manager_file() {
        declareFunction("setup_constant_index_table", "SETUP-CONSTANT-INDEX-TABLE", 2, 0, false);
        declareFunction("resize_constant_index_kbom_lru", "RESIZE-CONSTANT-INDEX-KBOM-LRU", 0, 2, false);
        declareFunction("optimize_constant_index_table", "OPTIMIZE-CONSTANT-INDEX-TABLE", 1, 0, false);
        declareFunction("clear_constant_index_table", "CLEAR-CONSTANT-INDEX-TABLE", 0, 0, false);
        declareFunction("maintain_constant_index_usage_counts", "MAINTAIN-CONSTANT-INDEX-USAGE-COUNTS", 0, 0, false);
        declareFunction("dont_maintain_constant_index_usage_counts", "DONT-MAINTAIN-CONSTANT-INDEX-USAGE-COUNTS", 0, 0, false);
        declareFunction("constant_index_usage_counts_enabled_p", "CONSTANT-INDEX-USAGE-COUNTS-ENABLED-P", 0, 0, false);
        declareFunction("cached_constant_index_count", "CACHED-CONSTANT-INDEX-COUNT", 0, 0, false);
        declareFunction("constant_indices_completely_cachedP", "CONSTANT-INDICES-COMPLETELY-CACHED?", 0, 0, false);
        declareFunction("lookup_constant_index", "LOOKUP-CONSTANT-INDEX", 1, 0, false);
        declareFunction("constant_index_cachedP", "CONSTANT-INDEX-CACHED?", 1, 0, false);
        declareFunction("get_file_backed_constant_internal_id_threshold", "GET-FILE-BACKED-CONSTANT-INTERNAL-ID-THRESHOLD", 0, 0, false);
        declareFunction("new_muted_constant_index_iterator", "NEW-MUTED-CONSTANT-INDEX-ITERATOR", 0, 0, false);
        declareFunction("constant_index_dont_maintain_usages_counts", "CONSTANT-INDEX-DONT-MAINTAIN-USAGES-COUNTS", 0, 0, false);
        declareFunction("constant_index_maintain_usage_counts", "CONSTANT-INDEX-MAINTAIN-USAGE-COUNTS", 0, 0, false);
        declareFunction("constant_index_usage_counts_enabledP", "CONSTANT-INDEX-USAGE-COUNTS-ENABLED?", 0, 0, false);
        declareFunction("constant_indexchange_stream_buffer_sizes", "CONSTANT-INDEXCHANGE-STREAM-BUFFER-SIZES", 2, 0, false);
        declareFunction("constant_index_enable_memory_mapping", "CONSTANT-INDEX-ENABLE-MEMORY-MAPPING", 0, 0, false);
        declareFunction("constant_index_memory_mappedP", "CONSTANT-INDEX-MEMORY-MAPPED?", 0, 0, false);
        declareMacro("with_constant_index_fully_loaded", "WITH-CONSTANT-INDEX-FULLY-LOADED");
        declareFunction("register_constant_index", "REGISTER-CONSTANT-INDEX", 2, 0, false);
        declareFunction("deregister_constant_index", "DEREGISTER-CONSTANT-INDEX", 1, 0, false);
        declareFunction("mark_constant_index_as_muted", "MARK-CONSTANT-INDEX-AS-MUTED", 1, 0, false);
        declareFunction("mark_constant_index_as_permanently_cached", "MARK-CONSTANT-INDEX-AS-PERMANENTLY-CACHED", 1, 0, false);
        declareFunction("meter_constant_index_swap_time", "METER-CONSTANT-INDEX-SWAP-TIME", 0, 0, false);
        declareFunction("dont_meter_constant_index_swap_time", "DONT-METER-CONSTANT-INDEX-SWAP-TIME", 0, 0, false);
        declareFunction("clear_constant_index_swap_time", "CLEAR-CONSTANT-INDEX-SWAP-TIME", 0, 0, false);
        declareFunction("current_constant_index_swap_time", "CURRENT-CONSTANT-INDEX-SWAP-TIME", 0, 0, false);
        declareFunction("swap_out_all_pristine_constant_indices", "SWAP-OUT-ALL-PRISTINE-CONSTANT-INDICES", 0, 0, false);
        declareFunction("initialize_constant_index_hl_store_cache", "INITIALIZE-CONSTANT-INDEX-HL-STORE-CACHE", 0, 0, false);
        declareFunction("wide_constant_index_hl_store_cacheP", "WIDE-CONSTANT-INDEX-HL-STORE-CACHE?", 0, 0, false);
        declareFunction("wide_constant_complex_index_hl_store_cacheP", "WIDE-CONSTANT-COMPLEX-INDEX-HL-STORE-CACHE?", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_constant_index_manager_file_alt() {
        deflexical("*CONSTANT-INDEX-MANAGER*", NIL != boundp($constant_index_manager$) ? ((SubLObject) ($constant_index_manager$.getGlobalValue())) : $UNINITIALIZED);
        deflexical("*CONSTANT-INDEX-LRU-SIZE-PERCENTAGE*", SIXTEEN_INTEGER);
        deflexical("*PERMANENTLY-CACHED-CONSTANT-INDICES*", $list_alt4);
        return NIL;
    }

    public static SubLObject init_constant_index_manager_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*CONSTANT-INDEX-MANAGER*", SubLTrampolineFile.maybeDefault($constant_index_manager$, $constant_index_manager$, $UNINITIALIZED));
            deflexical("*CONSTANT-INDEX-LRU-SIZE-PERCENTAGE*", SIXTEEN_INTEGER);
            deflexical("*CONSTANT-INDEX-LRU-SIZE-MAX*", $int$20000);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*CONSTANT-INDEX-MANAGER*", NIL != boundp($constant_index_manager$) ? ((SubLObject) ($constant_index_manager$.getGlobalValue())) : $UNINITIALIZED);
            deflexical("*PERMANENTLY-CACHED-CONSTANT-INDICES*", $list_alt4);
        }
        return NIL;
    }

    public static SubLObject init_constant_index_manager_file_Previous() {
        deflexical("*CONSTANT-INDEX-MANAGER*", SubLTrampolineFile.maybeDefault($constant_index_manager$, $constant_index_manager$, $UNINITIALIZED));
        deflexical("*CONSTANT-INDEX-LRU-SIZE-PERCENTAGE*", SIXTEEN_INTEGER);
        deflexical("*CONSTANT-INDEX-LRU-SIZE-MAX*", $int$20000);
        return NIL;
    }

    public static SubLObject setup_constant_index_manager_file() {
        declare_defglobal($constant_index_manager$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_constant_index_manager_file();
    }

    @Override
    public void initializeVariables() {
        init_constant_index_manager_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_constant_index_manager_file();
    }

    
}

