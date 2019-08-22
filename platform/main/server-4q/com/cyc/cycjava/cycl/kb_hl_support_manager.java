package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.define_obsolete_register;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_id_threshold;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class kb_hl_support_manager extends SubLTranslatedFile {
    public static final SubLFile me = new kb_hl_support_manager();

    public static final String myName = "com.cyc.cycjava.cycl.kb_hl_support_manager";

    public static final String myFingerPrint = "d2421eb5be6185dac95cc2845f6492354d5b5690e8edb824d895f54f7551fe56";



    // deflexical
    private static final SubLSymbol $kb_hl_support_lru_size_percentage$ = makeSymbol("*KB-HL-SUPPORT-LRU-SIZE-PERCENTAGE*");

    // deflexical
    private static final SubLSymbol $kb_hl_support_lru_size_max$ = makeSymbol("*KB-HL-SUPPORT-LRU-SIZE-MAX*");



    // Internal Constants
    public static final SubLSymbol $kb_hl_support_content_manager$ = makeSymbol("*KB-HL-SUPPORT-CONTENT-MANAGER*");



    private static final SubLInteger $int$10000 = makeInteger(10000);

    private static final SubLString $str3$kb_hl_support = makeString("kb-hl-support");

    private static final SubLSymbol LOAD_KB_HL_SUPPORT_DEF_FROM_CACHE = makeSymbol("LOAD-KB-HL-SUPPORT-DEF-FROM-CACHE");



    private static final SubLSymbol $sym6$_EXIT = makeSymbol("%EXIT");

    private static final SubLString $str7$kb_hl_support_index = makeString("kb-hl-support-index");

    private static final SubLSymbol $kb_hl_support_contents_from_ids$ = makeSymbol("*KB-HL-SUPPORT-CONTENTS-FROM-IDS*");

    private static final SubLSymbol POSSIBLY_INITIALIZE_KB_HL_SUPPORT_MANAGER_FROM_LEGACY_WORLD = makeSymbol("POSSIBLY-INITIALIZE-KB-HL-SUPPORT-MANAGER-FROM-LEGACY-WORLD");



    private static final SubLSymbol WITH_KBOM_FULLY_LOADED = makeSymbol("WITH-KBOM-FULLY-LOADED");

    private static final SubLList $list12 = list(makeSymbol("*KB-HL-SUPPORT-CONTENT-MANAGER*"));

    public static SubLObject setup_kb_hl_support_content_table(final SubLObject size, final SubLObject exactP) {
        $kb_hl_support_content_manager$.setGlobalValue(kb_object_manager.new_kb_object_manager($str3$kb_hl_support, size, $kb_hl_support_lru_size_percentage$.getGlobalValue(), $kb_hl_support_lru_size_max$.getGlobalValue(), LOAD_KB_HL_SUPPORT_DEF_FROM_CACHE, exactP));
        return T;
    }

    public static SubLObject resize_kb_hl_support_content_kbom_lru(SubLObject percentage, SubLObject max) {
        if (percentage == UNPROVIDED) {
            percentage = NIL;
        }
        if (max == UNPROVIDED) {
            max = NIL;
        }
        if (NIL == percentage) {
            percentage = $kb_hl_support_lru_size_percentage$.getGlobalValue();
        }
        if (NIL == max) {
            max = $kb_hl_support_lru_size_max$.getGlobalValue();
        }
        return kb_object_manager.resize_kbom_lru_cache_from_percentage_and_max($kb_hl_support_content_manager$.getGlobalValue(), percentage, max);
    }

    public static SubLObject optimize_kb_hl_support_content_table(final SubLObject new_kb_hl_support_id_threshold) {
        return kb_object_manager.optimize_kb_object_content_table($kb_hl_support_content_manager$.getGlobalValue(), new_kb_hl_support_id_threshold);
    }

    public static SubLObject clear_kb_hl_support_content_table() {
        return kb_object_manager.clear_kb_object_content_table($kb_hl_support_content_manager$.getGlobalValue());
    }

    public static SubLObject maintain_kb_hl_support_usage_counts() {
        return kb_object_manager.maintain_kb_object_usage_counts($kb_hl_support_content_manager$.getGlobalValue());
    }

    public static SubLObject dont_maintain_kb_hl_support_usage_counts() {
        return kb_object_manager.dont_maintain_kb_object_usage_counts($kb_hl_support_content_manager$.getGlobalValue());
    }

    public static SubLObject kb_hl_support_usage_counts_enabled_p() {
        return kb_object_manager.kb_object_usage_counts_enabledP($kb_hl_support_content_manager$.getGlobalValue());
    }

    public static SubLObject cached_kb_hl_support_count() {
        return kb_object_manager.cached_kb_object_count($kb_hl_support_content_manager$.getGlobalValue());
    }

    public static SubLObject kb_hl_support_content_completely_cachedP() {
        return numE(kb_hl_support_handles.kb_hl_support_count(), cached_kb_hl_support_count());
    }

    public static SubLObject kb_hl_support_content_cached_p(final SubLObject kb_hl_support) {
        return kb_object_manager.kb_object_id_cachedP($kb_hl_support_content_manager$.getGlobalValue(), kb_hl_support_handles.kb_hl_support_id(kb_hl_support));
    }

    public static SubLObject lookup_kb_hl_support_content(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding(thread);
        try {
            kb_storage_logging.$kb_storage_client$.bind(kb_storage_logging.add_kb_storage_logging_add_tag($KHM), thread);
            return kb_object_manager.lookup_kb_object_content($kb_hl_support_content_manager$.getGlobalValue(), id);
        } finally {
            kb_storage_logging.$kb_storage_client$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject get_file_backed_kb_hl_support_id_threshold() {
        return kb_object_manager.get_file_backed_kb_object_id_threshold($kb_hl_support_content_manager$.getGlobalValue());
    }

    public static SubLObject register_kb_hl_support_content(final SubLObject id, final SubLObject kb_hl_support_content) {
        return kb_object_manager.register_kb_object_content($kb_hl_support_content_manager$.getGlobalValue(), id, kb_hl_support_content);
    }

    public static SubLObject deregister_kb_hl_support_content(final SubLObject id) {
        return kb_object_manager.deregister_kb_object_content($kb_hl_support_content_manager$.getGlobalValue(), id);
    }

    public static SubLObject mark_kb_hl_support_content_as_muted(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding(thread);
        try {
            kb_storage_logging.$kb_storage_client$.bind(kb_storage_logging.add_kb_storage_logging_add_tag($KHM), thread);
            return kb_object_manager.mark_kb_object_content_as_muted($kb_hl_support_content_manager$.getGlobalValue(), id);
        } finally {
            kb_storage_logging.$kb_storage_client$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject meter_kb_hl_support_content_swap_time() {
        return kb_object_manager.meter_kb_object_content_swap_time($kb_hl_support_content_manager$.getGlobalValue());
    }

    public static SubLObject dont_meter_kb_hl_support_content_swap_time() {
        return kb_object_manager.dont_meter_kb_object_content_swap_time($kb_hl_support_content_manager$.getGlobalValue());
    }

    public static SubLObject clear_kb_hl_support_content_swap_time() {
        return kb_object_manager.clear_kb_object_content_swap_time($kb_hl_support_content_manager$.getGlobalValue());
    }

    public static SubLObject current_kb_hl_support_content_swap_time() {
        return kb_object_manager.kb_object_manager_swap_time($kb_hl_support_content_manager$.getGlobalValue());
    }

    public static SubLObject swap_out_all_pristine_kb_hl_supports() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding(thread);
        try {
            kb_storage_logging.$kb_storage_client$.bind(kb_storage_logging.add_kb_storage_logging_add_tag($KHM), thread);
            return kb_object_manager.safely_swap_out_all_pristine_kb_objects($kb_hl_support_content_manager$.getGlobalValue());
        } finally {
            kb_storage_logging.$kb_storage_client$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject initialize_kb_hl_support_hl_store_cache() {
        return kb_object_manager.initialize_kb_object_hl_store_cache($kb_hl_support_content_manager$.getGlobalValue(), $str3$kb_hl_support, $str7$kb_hl_support_index, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject verify_kb_hl_support_content_table_int(final SubLObject type_pred, SubLObject repairP) {
        if (repairP == UNPROVIDED) {
            repairP = NIL;
        }
        return kb_object_manager.verify_kb_object_content_table_int($kb_hl_support_content_manager$.getGlobalValue(), type_pred, repairP);
    }

    public static SubLObject possibly_initialize_kb_hl_support_manager_from_legacy_world() {
        if ($UNINITIALIZED == $kb_hl_support_content_manager$.getGlobalValue()) {
            final SubLObject size = id_index_sparse_id_threshold($kb_hl_support_contents_from_ids$.getGlobalValue());
            final SubLObject lru_size = min($kb_hl_support_lru_size_max$.getGlobalValue(), multiply(integerDivide(size, $int$100), $kb_hl_support_lru_size_percentage$.getGlobalValue()));
            final SubLObject lru_information = cache.new_cache(lru_size, UNPROVIDED);
            $kb_hl_support_content_manager$.setGlobalValue(kb_object_manager.new_legacy_kb_object_manager($str3$kb_hl_support, $kb_hl_support_lru_size_percentage$.getGlobalValue(), $kb_hl_support_lru_size_max$.getGlobalValue(), $kb_hl_support_contents_from_ids$.getGlobalValue(), lru_information, $UNINITIALIZED, LOAD_KB_HL_SUPPORT_DEF_FROM_CACHE));
            return T;
        }
        return NIL;
    }

    public static SubLObject kb_hl_support_content_change_stream_buffer_sizes(final SubLObject data_stream_buffer_size, final SubLObject index_stream_buffer_size) {
        return kb_object_manager.kb_object_manager_change_stream_buffer_sizes($kb_hl_support_content_manager$.getGlobalValue(), data_stream_buffer_size, index_stream_buffer_size);
    }

    public static SubLObject kb_hl_support_content_index_enable_memory_mapping() {
        return kb_object_manager.kb_object_manager_enable_memory_mapping($kb_hl_support_content_manager$.getGlobalValue());
    }

    public static SubLObject kb_hl_support_content_index_memory_mappedP() {
        return kb_object_manager.kb_object_manager_memory_mappedP($kb_hl_support_content_manager$.getGlobalValue());
    }

    public static SubLObject with_kb_hl_support_content_index_fully_loaded(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_KBOM_FULLY_LOADED, $list12, append(body, NIL));
    }

    public static SubLObject declare_kb_hl_support_manager_file() {
        declareFunction(me, "setup_kb_hl_support_content_table", "SETUP-KB-HL-SUPPORT-CONTENT-TABLE", 2, 0, false);
        declareFunction(me, "resize_kb_hl_support_content_kbom_lru", "RESIZE-KB-HL-SUPPORT-CONTENT-KBOM-LRU", 0, 2, false);
        declareFunction(me, "optimize_kb_hl_support_content_table", "OPTIMIZE-KB-HL-SUPPORT-CONTENT-TABLE", 1, 0, false);
        declareFunction(me, "clear_kb_hl_support_content_table", "CLEAR-KB-HL-SUPPORT-CONTENT-TABLE", 0, 0, false);
        declareFunction(me, "maintain_kb_hl_support_usage_counts", "MAINTAIN-KB-HL-SUPPORT-USAGE-COUNTS", 0, 0, false);
        declareFunction(me, "dont_maintain_kb_hl_support_usage_counts", "DONT-MAINTAIN-KB-HL-SUPPORT-USAGE-COUNTS", 0, 0, false);
        declareFunction(me, "kb_hl_support_usage_counts_enabled_p", "KB-HL-SUPPORT-USAGE-COUNTS-ENABLED-P", 0, 0, false);
        declareFunction(me, "cached_kb_hl_support_count", "CACHED-KB-HL-SUPPORT-COUNT", 0, 0, false);
        declareFunction(me, "kb_hl_support_content_completely_cachedP", "KB-HL-SUPPORT-CONTENT-COMPLETELY-CACHED?", 0, 0, false);
        declareFunction(me, "kb_hl_support_content_cached_p", "KB-HL-SUPPORT-CONTENT-CACHED-P", 1, 0, false);
        declareFunction(me, "lookup_kb_hl_support_content", "LOOKUP-KB-HL-SUPPORT-CONTENT", 1, 0, false);
        declareFunction(me, "get_file_backed_kb_hl_support_id_threshold", "GET-FILE-BACKED-KB-HL-SUPPORT-ID-THRESHOLD", 0, 0, false);
        declareFunction(me, "register_kb_hl_support_content", "REGISTER-KB-HL-SUPPORT-CONTENT", 2, 0, false);
        declareFunction(me, "deregister_kb_hl_support_content", "DEREGISTER-KB-HL-SUPPORT-CONTENT", 1, 0, false);
        declareFunction(me, "mark_kb_hl_support_content_as_muted", "MARK-KB-HL-SUPPORT-CONTENT-AS-MUTED", 1, 0, false);
        declareFunction(me, "meter_kb_hl_support_content_swap_time", "METER-KB-HL-SUPPORT-CONTENT-SWAP-TIME", 0, 0, false);
        declareFunction(me, "dont_meter_kb_hl_support_content_swap_time", "DONT-METER-KB-HL-SUPPORT-CONTENT-SWAP-TIME", 0, 0, false);
        declareFunction(me, "clear_kb_hl_support_content_swap_time", "CLEAR-KB-HL-SUPPORT-CONTENT-SWAP-TIME", 0, 0, false);
        declareFunction(me, "current_kb_hl_support_content_swap_time", "CURRENT-KB-HL-SUPPORT-CONTENT-SWAP-TIME", 0, 0, false);
        declareFunction(me, "swap_out_all_pristine_kb_hl_supports", "SWAP-OUT-ALL-PRISTINE-KB-HL-SUPPORTS", 0, 0, false);
        declareFunction(me, "initialize_kb_hl_support_hl_store_cache", "INITIALIZE-KB-HL-SUPPORT-HL-STORE-CACHE", 0, 0, false);
        declareFunction(me, "verify_kb_hl_support_content_table_int", "VERIFY-KB-HL-SUPPORT-CONTENT-TABLE-INT", 1, 1, false);
        declareFunction(me, "possibly_initialize_kb_hl_support_manager_from_legacy_world", "POSSIBLY-INITIALIZE-KB-HL-SUPPORT-MANAGER-FROM-LEGACY-WORLD", 0, 0, false);
        declareFunction(me, "kb_hl_support_content_change_stream_buffer_sizes", "KB-HL-SUPPORT-CONTENT-CHANGE-STREAM-BUFFER-SIZES", 2, 0, false);
        declareFunction(me, "kb_hl_support_content_index_enable_memory_mapping", "KB-HL-SUPPORT-CONTENT-INDEX-ENABLE-MEMORY-MAPPING", 0, 0, false);
        declareFunction(me, "kb_hl_support_content_index_memory_mappedP", "KB-HL-SUPPORT-CONTENT-INDEX-MEMORY-MAPPED?", 0, 0, false);
        declareMacro(me, "with_kb_hl_support_content_index_fully_loaded", "WITH-KB-HL-SUPPORT-CONTENT-INDEX-FULLY-LOADED");
        return NIL;
    }

    public static SubLObject init_kb_hl_support_manager_file() {
        deflexical("*KB-HL-SUPPORT-CONTENT-MANAGER*", SubLTrampolineFile.maybeDefault($kb_hl_support_content_manager$, $kb_hl_support_content_manager$, $UNINITIALIZED));
        deflexical("*KB-HL-SUPPORT-LRU-SIZE-PERCENTAGE*", FIVE_INTEGER);
        deflexical("*KB-HL-SUPPORT-LRU-SIZE-MAX*", $int$10000);
        deflexical("*KB-HL-SUPPORT-CONTENTS-FROM-IDS*", SubLTrampolineFile.maybeDefault($kb_hl_support_contents_from_ids$, $kb_hl_support_contents_from_ids$, NIL));
        return NIL;
    }

    public static SubLObject setup_kb_hl_support_manager_file() {
        declare_defglobal($kb_hl_support_content_manager$);
        declare_defglobal($kb_hl_support_contents_from_ids$);
        define_obsolete_register(POSSIBLY_INITIALIZE_KB_HL_SUPPORT_MANAGER_FROM_LEGACY_WORLD, NIL);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_kb_hl_support_manager_file();
    }

    @Override
    public void initializeVariables() {
        init_kb_hl_support_manager_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_kb_hl_support_manager_file();
    }

    
}

/**
 * Total time: 107 ms
 */
