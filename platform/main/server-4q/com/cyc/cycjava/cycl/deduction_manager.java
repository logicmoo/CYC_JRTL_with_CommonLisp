package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numE;
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
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class deduction_manager extends SubLTranslatedFile {
    public static final SubLFile me = new deduction_manager();

    public static final String myName = "com.cyc.cycjava.cycl.deduction_manager";

    public static final String myFingerPrint = "0d5a56fb9674e8422bdcd7dc001252619f4f18ec3c5bf4430ec38717fd4f5d0d";



    // deflexical
    private static final SubLSymbol $deduction_lru_size_percentage$ = makeSymbol("*DEDUCTION-LRU-SIZE-PERCENTAGE*");

    // deflexical
    private static final SubLSymbol $deduction_lru_size_max$ = makeSymbol("*DEDUCTION-LRU-SIZE-MAX*");

    // Internal Constants
    public static final SubLSymbol $deduction_content_manager$ = makeSymbol("*DEDUCTION-CONTENT-MANAGER*");



    private static final SubLInteger $int$400000 = makeInteger(400000);

    private static final SubLString $$$deduction = makeString("deduction");

    private static final SubLSymbol LOAD_DEDUCTION_DEF_FROM_CACHE = makeSymbol("LOAD-DEDUCTION-DEF-FROM-CACHE");

    private static final SubLSymbol WITH_KBOM_FULLY_LOADED = makeSymbol("WITH-KBOM-FULLY-LOADED");

    private static final SubLList $list6 = list(makeSymbol("*DEDUCTION-CONTENT-MANAGER*"));



    private static final SubLSymbol $sym8$_EXIT = makeSymbol("%EXIT");

    private static final SubLString $str9$deduction_index = makeString("deduction-index");

    public static SubLObject setup_deduction_content_table(final SubLObject size, final SubLObject exactP) {
        $deduction_content_manager$.setGlobalValue(kb_object_manager.new_kb_object_manager($$$deduction, size, $deduction_lru_size_percentage$.getGlobalValue(), $deduction_lru_size_max$.getGlobalValue(), LOAD_DEDUCTION_DEF_FROM_CACHE, exactP));
        return T;
    }

    public static SubLObject resize_deduction_content_kbom_lru(SubLObject percentage, SubLObject max) {
        if (percentage == UNPROVIDED) {
            percentage = NIL;
        }
        if (max == UNPROVIDED) {
            max = NIL;
        }
        if (NIL == percentage) {
            percentage = $deduction_lru_size_percentage$.getGlobalValue();
        }
        if (NIL == max) {
            max = $deduction_lru_size_max$.getGlobalValue();
        }
        return kb_object_manager.resize_kbom_lru_cache_from_percentage_and_max($deduction_content_manager$.getGlobalValue(), percentage, max);
    }

    public static SubLObject optimize_deduction_content_table(final SubLObject new_deduction_id_threshold) {
        return kb_object_manager.optimize_kb_object_content_table($deduction_content_manager$.getGlobalValue(), new_deduction_id_threshold);
    }

    public static SubLObject clear_deduction_content_table() {
        return kb_object_manager.clear_kb_object_content_table($deduction_content_manager$.getGlobalValue());
    }

    public static SubLObject maintain_deduction_usage_counts() {
        return kb_object_manager.maintain_kb_object_usage_counts($deduction_content_manager$.getGlobalValue());
    }

    public static SubLObject dont_maintain_deduction_usage_counts() {
        return kb_object_manager.dont_maintain_kb_object_usage_counts($deduction_content_manager$.getGlobalValue());
    }

    public static SubLObject deduction_usage_counts_enabled_p() {
        return kb_object_manager.kb_object_usage_counts_enabledP($deduction_content_manager$.getGlobalValue());
    }

    public static SubLObject deduction_manager_dont_maintain_usages_counts() {
        return kb_object_manager.dont_maintain_kb_object_usage_counts($deduction_content_manager$.getGlobalValue());
    }

    public static SubLObject deduction_manager_maintain_usage_counts() {
        return kb_object_manager.maintain_kb_object_usage_counts($deduction_content_manager$.getGlobalValue());
    }

    public static SubLObject deduction_manager_usage_counts_enabledP() {
        return kb_object_manager.kb_object_usage_counts_enabledP($deduction_content_manager$.getGlobalValue());
    }

    public static SubLObject deduction_manager_change_stream_buffer_sizes(final SubLObject data_stream_buffer_size, final SubLObject index_stream_buffer_size) {
        return kb_object_manager.kb_object_manager_change_stream_buffer_sizes($deduction_content_manager$.getGlobalValue(), data_stream_buffer_size, index_stream_buffer_size);
    }

    public static SubLObject deduction_manager_enable_memory_mapping() {
        return kb_object_manager.kb_object_manager_enable_memory_mapping($deduction_content_manager$.getGlobalValue());
    }

    public static SubLObject deduction_manager_memory_mappedP() {
        return kb_object_manager.kb_object_manager_memory_mappedP($deduction_content_manager$.getGlobalValue());
    }

    public static SubLObject with_deduction_manager_fully_loaded(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_KBOM_FULLY_LOADED, $list6, append(body, NIL));
    }

    public static SubLObject cached_deduction_count() {
        return kb_object_manager.cached_kb_object_count($deduction_content_manager$.getGlobalValue());
    }

    public static SubLObject deduction_content_completely_cachedP() {
        return numE(deduction_handles.deduction_count(), cached_deduction_count());
    }

    public static SubLObject deduction_content_cached_p(final SubLObject deduction) {
        return kb_object_manager.kb_object_id_cachedP($deduction_content_manager$.getGlobalValue(), deduction_handles.deduction_id(deduction));
    }

    public static SubLObject lookup_deduction_content(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding(thread);
        try {
            kb_storage_logging.$kb_storage_client$.bind(kb_storage_logging.add_kb_storage_logging_add_tag($DM), thread);
            return kb_object_manager.lookup_kb_object_content($deduction_content_manager$.getGlobalValue(), id);
        } finally {
            kb_storage_logging.$kb_storage_client$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject get_file_backed_deduction_id_threshold() {
        return kb_object_manager.get_file_backed_kb_object_id_threshold($deduction_content_manager$.getGlobalValue());
    }

    public static SubLObject register_deduction_content(final SubLObject id, final SubLObject deduction_content) {
        return kb_object_manager.register_kb_object_content($deduction_content_manager$.getGlobalValue(), id, deduction_content);
    }

    public static SubLObject deregister_deduction_content(final SubLObject id) {
        return kb_object_manager.deregister_kb_object_content($deduction_content_manager$.getGlobalValue(), id);
    }

    public static SubLObject mark_deduction_content_as_muted(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding(thread);
        try {
            kb_storage_logging.$kb_storage_client$.bind(kb_storage_logging.add_kb_storage_logging_add_tag($DM), thread);
            return kb_object_manager.mark_kb_object_content_as_muted($deduction_content_manager$.getGlobalValue(), id);
        } finally {
            kb_storage_logging.$kb_storage_client$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject meter_deduction_content_swap_time() {
        return kb_object_manager.meter_kb_object_content_swap_time($deduction_content_manager$.getGlobalValue());
    }

    public static SubLObject dont_meter_deduction_content_swap_time() {
        return kb_object_manager.dont_meter_kb_object_content_swap_time($deduction_content_manager$.getGlobalValue());
    }

    public static SubLObject clear_deduction_content_swap_time() {
        return kb_object_manager.clear_kb_object_content_swap_time($deduction_content_manager$.getGlobalValue());
    }

    public static SubLObject current_deduction_content_swap_time() {
        return kb_object_manager.kb_object_manager_swap_time($deduction_content_manager$.getGlobalValue());
    }

    public static SubLObject swap_out_all_pristine_deductions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding(thread);
        try {
            kb_storage_logging.$kb_storage_client$.bind(kb_storage_logging.add_kb_storage_logging_add_tag($DM), thread);
            return kb_object_manager.safely_swap_out_all_pristine_kb_objects($deduction_content_manager$.getGlobalValue());
        } finally {
            kb_storage_logging.$kb_storage_client$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject initialize_deduction_hl_store_cache() {
        return kb_object_manager.initialize_kb_object_hl_store_cache($deduction_content_manager$.getGlobalValue(), $$$deduction, $str9$deduction_index, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject wide_deduction_hl_store_cacheP() {
        return kb_object_manager.wide_kb_object_managerP($deduction_content_manager$.getGlobalValue());
    }

    public static SubLObject declare_deduction_manager_file() {
        declareFunction(me, "setup_deduction_content_table", "SETUP-DEDUCTION-CONTENT-TABLE", 2, 0, false);
        declareFunction(me, "resize_deduction_content_kbom_lru", "RESIZE-DEDUCTION-CONTENT-KBOM-LRU", 0, 2, false);
        declareFunction(me, "optimize_deduction_content_table", "OPTIMIZE-DEDUCTION-CONTENT-TABLE", 1, 0, false);
        declareFunction(me, "clear_deduction_content_table", "CLEAR-DEDUCTION-CONTENT-TABLE", 0, 0, false);
        declareFunction(me, "maintain_deduction_usage_counts", "MAINTAIN-DEDUCTION-USAGE-COUNTS", 0, 0, false);
        declareFunction(me, "dont_maintain_deduction_usage_counts", "DONT-MAINTAIN-DEDUCTION-USAGE-COUNTS", 0, 0, false);
        declareFunction(me, "deduction_usage_counts_enabled_p", "DEDUCTION-USAGE-COUNTS-ENABLED-P", 0, 0, false);
        declareFunction(me, "deduction_manager_dont_maintain_usages_counts", "DEDUCTION-MANAGER-DONT-MAINTAIN-USAGES-COUNTS", 0, 0, false);
        declareFunction(me, "deduction_manager_maintain_usage_counts", "DEDUCTION-MANAGER-MAINTAIN-USAGE-COUNTS", 0, 0, false);
        declareFunction(me, "deduction_manager_usage_counts_enabledP", "DEDUCTION-MANAGER-USAGE-COUNTS-ENABLED?", 0, 0, false);
        declareFunction(me, "deduction_manager_change_stream_buffer_sizes", "DEDUCTION-MANAGER-CHANGE-STREAM-BUFFER-SIZES", 2, 0, false);
        declareFunction(me, "deduction_manager_enable_memory_mapping", "DEDUCTION-MANAGER-ENABLE-MEMORY-MAPPING", 0, 0, false);
        declareFunction(me, "deduction_manager_memory_mappedP", "DEDUCTION-MANAGER-MEMORY-MAPPED?", 0, 0, false);
        declareMacro(me, "with_deduction_manager_fully_loaded", "WITH-DEDUCTION-MANAGER-FULLY-LOADED");
        declareFunction(me, "cached_deduction_count", "CACHED-DEDUCTION-COUNT", 0, 0, false);
        declareFunction(me, "deduction_content_completely_cachedP", "DEDUCTION-CONTENT-COMPLETELY-CACHED?", 0, 0, false);
        declareFunction(me, "deduction_content_cached_p", "DEDUCTION-CONTENT-CACHED-P", 1, 0, false);
        declareFunction(me, "lookup_deduction_content", "LOOKUP-DEDUCTION-CONTENT", 1, 0, false);
        declareFunction(me, "get_file_backed_deduction_id_threshold", "GET-FILE-BACKED-DEDUCTION-ID-THRESHOLD", 0, 0, false);
        declareFunction(me, "register_deduction_content", "REGISTER-DEDUCTION-CONTENT", 2, 0, false);
        declareFunction(me, "deregister_deduction_content", "DEREGISTER-DEDUCTION-CONTENT", 1, 0, false);
        declareFunction(me, "mark_deduction_content_as_muted", "MARK-DEDUCTION-CONTENT-AS-MUTED", 1, 0, false);
        declareFunction(me, "meter_deduction_content_swap_time", "METER-DEDUCTION-CONTENT-SWAP-TIME", 0, 0, false);
        declareFunction(me, "dont_meter_deduction_content_swap_time", "DONT-METER-DEDUCTION-CONTENT-SWAP-TIME", 0, 0, false);
        declareFunction(me, "clear_deduction_content_swap_time", "CLEAR-DEDUCTION-CONTENT-SWAP-TIME", 0, 0, false);
        declareFunction(me, "current_deduction_content_swap_time", "CURRENT-DEDUCTION-CONTENT-SWAP-TIME", 0, 0, false);
        declareFunction(me, "swap_out_all_pristine_deductions", "SWAP-OUT-ALL-PRISTINE-DEDUCTIONS", 0, 0, false);
        declareFunction(me, "initialize_deduction_hl_store_cache", "INITIALIZE-DEDUCTION-HL-STORE-CACHE", 0, 0, false);
        declareFunction(me, "wide_deduction_hl_store_cacheP", "WIDE-DEDUCTION-HL-STORE-CACHE?", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_deduction_manager_file() {
        deflexical("*DEDUCTION-CONTENT-MANAGER*", SubLSystemTrampolineFile.maybeDefault($deduction_content_manager$, $deduction_content_manager$, $UNINITIALIZED));
        deflexical("*DEDUCTION-LRU-SIZE-PERCENTAGE*", EIGHT_INTEGER);
        deflexical("*DEDUCTION-LRU-SIZE-MAX*", $int$400000);
        return NIL;
    }

    public static SubLObject setup_deduction_manager_file() {
        declare_defglobal($deduction_content_manager$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_deduction_manager_file();
    }

    @Override
    public void initializeVariables() {
        init_deduction_manager_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_deduction_manager_file();
    }

    
}

/**
 * Total time: 100 ms
 */
