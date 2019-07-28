/**
 *
 */
/**
 *
 */
package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.assertion_manager;
import com.cyc.cycjava.cycl.inference.arete;
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
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.assertion_manager.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SIXTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class assertion_manager extends SubLTranslatedFile {
    public static final SubLFile me = new assertion_manager();

    public static final String myName = "com.cyc.cycjava.cycl.assertion_manager";

    public static final String myFingerPrint = "5d83c4a3f02aaf1f0e6aa32f7fbb2b3d73b8abd29c38c22f7b685132a5a48cea";



    // deflexical
    /**
     * based on arete experiments, only 16% of all assertions are need for normal
     * inference
     */
    private static final SubLSymbol $assertion_lru_size_percentage$ = makeSymbol("*ASSERTION-LRU-SIZE-PERCENTAGE*");

    // deflexical
    private static final SubLSymbol $assertion_lru_size_max$ = makeSymbol("*ASSERTION-LRU-SIZE-MAX*");

    public static final SubLSymbol $assertion_content_manager$ = makeSymbol("*ASSERTION-CONTENT-MANAGER*");



    private static final SubLInteger $int$600000 = makeInteger(600000);

    public static final SubLString $$$assertion = makeString("assertion");

    public static final SubLSymbol LOAD_ASSERTION_DEF_FROM_CACHE = makeSymbol("LOAD-ASSERTION-DEF-FROM-CACHE");



    private static final SubLSymbol $sym6$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol WITH_KBOM_FULLY_LOADED = makeSymbol("WITH-KBOM-FULLY-LOADED");

    private static final SubLList $list8 = list($assertion_content_manager$);

    private static final SubLString $str9$assertion_index = makeString("assertion-index");

    public static SubLObject setup_assertion_content_table(final SubLObject size, final SubLObject exactP) {
        $assertion_content_manager$.setGlobalValue(kb_object_manager.new_kb_object_manager($$$assertion, size, $assertion_lru_size_percentage$.getGlobalValue(), $assertion_lru_size_max$.getGlobalValue(), LOAD_ASSERTION_DEF_FROM_CACHE, exactP));
        return T;
    }

    public static SubLObject resize_assertion_content_kbom_lru(SubLObject percentage, SubLObject max) {
        if (percentage == UNPROVIDED) {
            percentage = NIL;
        }
        if (max == UNPROVIDED) {
            max = NIL;
        }
        if (NIL == percentage) {
            percentage = $assertion_lru_size_percentage$.getGlobalValue();
        }
        if (NIL == max) {
            max = $assertion_lru_size_max$.getGlobalValue();
        }
        return kb_object_manager.resize_kbom_lru_cache_from_percentage_and_max($assertion_content_manager$.getGlobalValue(), percentage, max);
    }

    public static SubLObject optimize_assertion_content_table(final SubLObject new_assertion_id_threshold) {
        return kb_object_manager.optimize_kb_object_content_table($assertion_content_manager$.getGlobalValue(), new_assertion_id_threshold);
    }

    public static SubLObject clear_assertion_content_table() {
        return kb_object_manager.clear_kb_object_content_table($assertion_content_manager$.getGlobalValue());
    }

    public static SubLObject maintain_assertion_usage_counts() {
        return kb_object_manager.maintain_kb_object_usage_counts($assertion_content_manager$.getGlobalValue());
    }

    public static SubLObject dont_maintain_assertion_usage_counts() {
        return kb_object_manager.dont_maintain_kb_object_usage_counts($assertion_content_manager$.getGlobalValue());
    }

    public static SubLObject assertion_usage_counts_enabled_p() {
        return kb_object_manager.kb_object_usage_counts_enabledP($assertion_content_manager$.getGlobalValue());
    }

    public static SubLObject cached_assertion_count() {
        return kb_object_manager.cached_kb_object_count($assertion_content_manager$.getGlobalValue());
    }

    public static SubLObject assertion_content_completely_cachedP() {
        return numE(assertion_handles.assertion_count(), cached_assertion_count());
    }

    public static SubLObject assertion_content_cached_p(final SubLObject assertion) {
        return kb_object_manager.kb_object_id_cachedP($assertion_content_manager$.getGlobalValue(), assertion_handles.assertion_id(assertion));
    }

    public static SubLObject assertion_content_cachable_p(final SubLObject assertion) {
        return kb_object_manager.kb_object_id_cachableP($assertion_content_manager$.getGlobalValue(), assertion_handles.assertion_id(assertion));
    }

    public static SubLObject lookup_assertion_contentEx(final SubLObject id) {
        // final SubLThread thread = SubLProcess.currentSubLThread();
        SubLThread thread = Lisp.pushRebinds();
        arete.arete_note_assertion_touched(assertion_handles.find_assertion_by_id(id));
        // final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding( thread );
        try {
            kb_storage_logging.$kb_storage_client$.bind(kb_storage_logging.add_kb_storage_logging_add_tag($AM), thread);
            return kb_object_manager.lookup_kb_object_content($assertion_content_manager$.getGlobalValue(), id);
        } finally {
            Lisp.popRebinds(thread);
            // kb_storage_logging.$kb_storage_client$.rebind( _prev_bind_0, thread );
        }
    }

    public static SubLObject lookup_assertion_content(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        arete.arete_note_assertion_touched(assertion_handles.find_assertion_by_id(id));
        final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding(thread);
        try {
            kb_storage_logging.$kb_storage_client$.bind(kb_storage_logging.add_kb_storage_logging_add_tag($AM), thread);
            return kb_object_manager.lookup_kb_object_content($assertion_content_manager$.getGlobalValue(), id);
        } finally {
            kb_storage_logging.$kb_storage_client$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject get_file_backed_assertion_id_threshold() {
        return kb_object_manager.get_file_backed_kb_object_id_threshold($assertion_content_manager$.getGlobalValue());
    }

    public static SubLObject new_muted_assertion_content_iterator() {
        return kb_object_manager.new_muted_kb_object_iterator($assertion_content_manager$.getGlobalValue());
    }

    public static SubLObject assertion_manager_dont_maintain_usages_counts() {
        return kb_object_manager.dont_maintain_kb_object_usage_counts($assertion_content_manager$.getGlobalValue());
    }

    public static SubLObject assertion_manager_maintain_usage_counts() {
        return kb_object_manager.maintain_kb_object_usage_counts($assertion_content_manager$.getGlobalValue());
    }

    public static SubLObject assertion_manager_usage_counts_enabledP() {
        return kb_object_manager.kb_object_usage_counts_enabledP($assertion_content_manager$.getGlobalValue());
    }

    public static SubLObject assertion_manager_change_stream_buffer_sizes(final SubLObject data_stream_buffer_size, final SubLObject index_stream_buffer_size) {
        return kb_object_manager.kb_object_manager_change_stream_buffer_sizes($assertion_content_manager$.getGlobalValue(), data_stream_buffer_size, index_stream_buffer_size);
    }

    public static SubLObject assertion_manager_enable_memory_mapping() {
        return kb_object_manager.kb_object_manager_enable_memory_mapping($assertion_content_manager$.getGlobalValue());
    }

    public static SubLObject assertion_manager_memory_mappedP() {
        return kb_object_manager.kb_object_manager_memory_mappedP($assertion_content_manager$.getGlobalValue());
    }

    public static SubLObject with_assertion_manager_fully_loaded(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body = datum;
        return listS(WITH_KBOM_FULLY_LOADED, $list8, append(body, NIL));
    }

    public static SubLObject register_assertion_content(final SubLObject id, final SubLObject assertion_content) {
        return kb_object_manager.register_kb_object_content($assertion_content_manager$.getGlobalValue(), id, assertion_content);
    }

    public static SubLObject deregister_assertion_content(final SubLObject id) {
        return kb_object_manager.deregister_kb_object_content($assertion_content_manager$.getGlobalValue(), id);
    }

    public static SubLObject mark_assertion_content_as_muted(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding(thread);
        try {
            kb_storage_logging.$kb_storage_client$.bind(kb_storage_logging.add_kb_storage_logging_add_tag($AM), thread);
            return kb_object_manager.mark_kb_object_content_as_muted($assertion_content_manager$.getGlobalValue(), id);
        } finally {
            kb_storage_logging.$kb_storage_client$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject meter_assertion_content_swap_time() {
        return kb_object_manager.meter_kb_object_content_swap_time($assertion_content_manager$.getGlobalValue());
    }

    public static SubLObject dont_meter_assertion_content_swap_time() {
        return kb_object_manager.dont_meter_kb_object_content_swap_time($assertion_content_manager$.getGlobalValue());
    }

    public static SubLObject clear_assertion_content_swap_time() {
        return kb_object_manager.clear_kb_object_content_swap_time($assertion_content_manager$.getGlobalValue());
    }

    public static SubLObject current_assertion_content_swap_time() {
        return kb_object_manager.kb_object_manager_swap_time($assertion_content_manager$.getGlobalValue());
    }

    public static SubLObject swap_out_all_pristine_assertions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding(thread);
        try {
            kb_storage_logging.$kb_storage_client$.bind(kb_storage_logging.add_kb_storage_logging_add_tag($AM), thread);
            return kb_object_manager.safely_swap_out_all_pristine_kb_objects($assertion_content_manager$.getGlobalValue());
        } finally {
            kb_storage_logging.$kb_storage_client$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject initialize_assertion_hl_store_cache() {
        return kb_object_manager.initialize_kb_object_hl_store_cache($assertion_content_manager$.getGlobalValue(), $$$assertion, $str9$assertion_index, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject wide_assertion_hl_store_cacheP() {
        return kb_object_manager.wide_kb_object_managerP($assertion_content_manager$.getGlobalValue());
    }

    public static SubLObject verify_assertion_content_table_int(final SubLObject type_pred, SubLObject repairP) {
        if (repairP == UNPROVIDED) {
            repairP = NIL;
        }
        return kb_object_manager.verify_kb_object_content_table_int($assertion_content_manager$.getGlobalValue(), type_pred, repairP);
    }

    public static SubLObject declare_assertion_manager_file() {
        declareFunction(me, "setup_assertion_content_table", "SETUP-ASSERTION-CONTENT-TABLE", 2, 0, false);
        declareFunction(me, "resize_assertion_content_kbom_lru", "RESIZE-ASSERTION-CONTENT-KBOM-LRU", 0, 2, false);
        declareFunction(me, "optimize_assertion_content_table", "OPTIMIZE-ASSERTION-CONTENT-TABLE", 1, 0, false);
        declareFunction(me, "clear_assertion_content_table", "CLEAR-ASSERTION-CONTENT-TABLE", 0, 0, false);
        declareFunction(me, "maintain_assertion_usage_counts", "MAINTAIN-ASSERTION-USAGE-COUNTS", 0, 0, false);
        declareFunction(me, "dont_maintain_assertion_usage_counts", "DONT-MAINTAIN-ASSERTION-USAGE-COUNTS", 0, 0, false);
        declareFunction(me, "assertion_usage_counts_enabled_p", "ASSERTION-USAGE-COUNTS-ENABLED-P", 0, 0, false);
        declareFunction(me, "cached_assertion_count", "CACHED-ASSERTION-COUNT", 0, 0, false);
        declareFunction(me, "assertion_content_completely_cachedP", "ASSERTION-CONTENT-COMPLETELY-CACHED?", 0, 0, false);
        declareFunction(me, "assertion_content_cached_p", "ASSERTION-CONTENT-CACHED-P", 1, 0, false);
        declareFunction(me, "assertion_content_cachable_p", "ASSERTION-CONTENT-CACHABLE-P", 1, 0, false);
        declareFunction(me, "lookup_assertion_content", "LOOKUP-ASSERTION-CONTENT", 1, 0, false);
        declareFunction(me, "get_file_backed_assertion_id_threshold", "GET-FILE-BACKED-ASSERTION-ID-THRESHOLD", 0, 0, false);
        declareFunction(me, "new_muted_assertion_content_iterator", "NEW-MUTED-ASSERTION-CONTENT-ITERATOR", 0, 0, false);
        declareFunction(me, "assertion_manager_dont_maintain_usages_counts", "ASSERTION-MANAGER-DONT-MAINTAIN-USAGES-COUNTS", 0, 0, false);
        declareFunction(me, "assertion_manager_maintain_usage_counts", "ASSERTION-MANAGER-MAINTAIN-USAGE-COUNTS", 0, 0, false);
        declareFunction(me, "assertion_manager_usage_counts_enabledP", "ASSERTION-MANAGER-USAGE-COUNTS-ENABLED?", 0, 0, false);
        declareFunction(me, "assertion_manager_change_stream_buffer_sizes", "ASSERTION-MANAGER-CHANGE-STREAM-BUFFER-SIZES", 2, 0, false);
        declareFunction(me, "assertion_manager_enable_memory_mapping", "ASSERTION-MANAGER-ENABLE-MEMORY-MAPPING", 0, 0, false);
        declareFunction(me, "assertion_manager_memory_mappedP", "ASSERTION-MANAGER-MEMORY-MAPPED?", 0, 0, false);
        // / 6666
        declareMacro(me, "with_assertion_manager_fully_loaded", "WITH-ASSERTION-MANAGER-FULLY-LOADED");
        declareFunction(me, "register_assertion_content", "REGISTER-ASSERTION-CONTENT", 2, 0, false);
        declareFunction(me, "deregister_assertion_content", "DEREGISTER-ASSERTION-CONTENT", 1, 0, false);
        declareFunction(me, "mark_assertion_content_as_muted", "MARK-ASSERTION-CONTENT-AS-MUTED", 1, 0, false);
        declareFunction(me, "meter_assertion_content_swap_time", "METER-ASSERTION-CONTENT-SWAP-TIME", 0, 0, false);
        declareFunction(me, "dont_meter_assertion_content_swap_time", "DONT-METER-ASSERTION-CONTENT-SWAP-TIME", 0, 0, false);
        declareFunction(me, "clear_assertion_content_swap_time", "CLEAR-ASSERTION-CONTENT-SWAP-TIME", 0, 0, false);
        declareFunction(me, "current_assertion_content_swap_time", "CURRENT-ASSERTION-CONTENT-SWAP-TIME", 0, 0, false);
        declareFunction(me, "swap_out_all_pristine_assertions", "SWAP-OUT-ALL-PRISTINE-ASSERTIONS", 0, 0, false);
        declareFunction(me, "initialize_assertion_hl_store_cache", "INITIALIZE-ASSERTION-HL-STORE-CACHE", 0, 0, false);
        declareFunction(me, "wide_assertion_hl_store_cacheP", "WIDE-ASSERTION-HL-STORE-CACHE?", 0, 0, false);
        declareFunction(me, "verify_assertion_content_table_int", "VERIFY-ASSERTION-CONTENT-TABLE-INT", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_assertion_manager_file() {
        deflexical("*ASSERTION-CONTENT-MANAGER*", SubLTrampolineFile.maybeDefault($assertion_content_manager$, $assertion_content_manager$, $UNINITIALIZED));
        deflexical("*ASSERTION-LRU-SIZE-PERCENTAGE*", SIXTEEN_INTEGER);
        deflexical("*ASSERTION-LRU-SIZE-MAX*", $int$600000);
        return NIL;
    }

    public static SubLObject setup_assertion_manager_file() {
        declare_defglobal($assertion_content_manager$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_assertion_manager_file();
    }

    @Override
    public void initializeVariables() {
        init_assertion_manager_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_assertion_manager_file();
    }

    static {














    }
}

