package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kb_hl_support_manager extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.kb_hl_support_manager";
    public static final String myFingerPrint = "d2421eb5be6185dac95cc2845f6492354d5b5690e8edb824d895f54f7551fe56";
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-manager.lisp", position = 854L)
    public static SubLSymbol $kb_hl_support_content_manager$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-manager.lisp", position = 1063L)
    private static SubLSymbol $kb_hl_support_lru_size_percentage$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-manager.lisp", position = 1177L)
    private static SubLSymbol $kb_hl_support_lru_size_max$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-manager.lisp", position = 6303L)
    private static SubLSymbol $kb_hl_support_contents_from_ids$;
    private static final SubLSymbol $sym0$_KB_HL_SUPPORT_CONTENT_MANAGER_;
    private static final SubLSymbol $kw1$UNINITIALIZED;
    private static final SubLInteger $int2$10000;
    private static final SubLString $str3$kb_hl_support;
    private static final SubLSymbol $sym4$LOAD_KB_HL_SUPPORT_DEF_FROM_CACHE;
    private static final SubLSymbol $kw5$KHM;
    private static final SubLSymbol $sym6$_EXIT;
    private static final SubLString $str7$kb_hl_support_index;
    private static final SubLSymbol $sym8$_KB_HL_SUPPORT_CONTENTS_FROM_IDS_;
    private static final SubLSymbol $sym9$POSSIBLY_INITIALIZE_KB_HL_SUPPORT_MANAGER_FROM_LEGACY_WORLD;
    private static final SubLInteger $int10$100;
    private static final SubLSymbol $sym11$WITH_KBOM_FULLY_LOADED;
    private static final SubLList $list12;
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-manager.lisp", position = 1361L)
    public static SubLObject setup_kb_hl_support_content_table(final SubLObject size, final SubLObject exactP) {
        kb_hl_support_manager.$kb_hl_support_content_manager$.setGlobalValue(kb_object_manager.new_kb_object_manager((SubLObject)kb_hl_support_manager.$str3$kb_hl_support, size, kb_hl_support_manager.$kb_hl_support_lru_size_percentage$.getGlobalValue(), kb_hl_support_manager.$kb_hl_support_lru_size_max$.getGlobalValue(), (SubLObject)kb_hl_support_manager.$sym4$LOAD_KB_HL_SUPPORT_DEF_FROM_CACHE, exactP));
        return (SubLObject)kb_hl_support_manager.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-manager.lisp", position = 1650L)
    public static SubLObject resize_kb_hl_support_content_kbom_lru(SubLObject percentage, SubLObject max) {
        if (percentage == kb_hl_support_manager.UNPROVIDED) {
            percentage = (SubLObject)kb_hl_support_manager.NIL;
        }
        if (max == kb_hl_support_manager.UNPROVIDED) {
            max = (SubLObject)kb_hl_support_manager.NIL;
        }
        if (kb_hl_support_manager.NIL == percentage) {
            percentage = kb_hl_support_manager.$kb_hl_support_lru_size_percentage$.getGlobalValue();
        }
        if (kb_hl_support_manager.NIL == max) {
            max = kb_hl_support_manager.$kb_hl_support_lru_size_max$.getGlobalValue();
        }
        return kb_object_manager.resize_kbom_lru_cache_from_percentage_and_max(kb_hl_support_manager.$kb_hl_support_content_manager$.getGlobalValue(), percentage, max);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-manager.lisp", position = 2084L)
    public static SubLObject optimize_kb_hl_support_content_table(final SubLObject new_kb_hl_support_id_threshold) {
        return kb_object_manager.optimize_kb_object_content_table(kb_hl_support_manager.$kb_hl_support_content_manager$.getGlobalValue(), new_kb_hl_support_id_threshold);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-manager.lisp", position = 2280L)
    public static SubLObject clear_kb_hl_support_content_table() {
        return kb_object_manager.clear_kb_object_content_table(kb_hl_support_manager.$kb_hl_support_content_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-manager.lisp", position = 2409L)
    public static SubLObject maintain_kb_hl_support_usage_counts() {
        return kb_object_manager.maintain_kb_object_usage_counts(kb_hl_support_manager.$kb_hl_support_content_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-manager.lisp", position = 2594L)
    public static SubLObject dont_maintain_kb_hl_support_usage_counts() {
        return kb_object_manager.dont_maintain_kb_object_usage_counts(kb_hl_support_manager.$kb_hl_support_content_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-manager.lisp", position = 2790L)
    public static SubLObject kb_hl_support_usage_counts_enabled_p() {
        return kb_object_manager.kb_object_usage_counts_enabledP(kb_hl_support_manager.$kb_hl_support_content_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-manager.lisp", position = 3003L)
    public static SubLObject cached_kb_hl_support_count() {
        return kb_object_manager.cached_kb_object_count(kb_hl_support_manager.$kb_hl_support_content_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-manager.lisp", position = 3383L)
    public static SubLObject kb_hl_support_content_completely_cachedP() {
        return Numbers.numE(kb_hl_support_handles.kb_hl_support_count(), cached_kb_hl_support_count());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-manager.lisp", position = 3510L)
    public static SubLObject kb_hl_support_content_cached_p(final SubLObject kb_hl_support) {
        return kb_object_manager.kb_object_id_cachedP(kb_hl_support_manager.$kb_hl_support_content_manager$.getGlobalValue(), kb_hl_support_handles.kb_hl_support_id(kb_hl_support));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-manager.lisp", position = 3671L)
    public static SubLObject lookup_kb_hl_support_content(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding(thread);
        try {
            kb_storage_logging.$kb_storage_client$.bind(kb_storage_logging.add_kb_storage_logging_add_tag((SubLObject)kb_hl_support_manager.$kw5$KHM), thread);
            return kb_object_manager.lookup_kb_object_content(kb_hl_support_manager.$kb_hl_support_content_manager$.getGlobalValue(), id);
        }
        finally {
            kb_storage_logging.$kb_storage_client$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-manager.lisp", position = 3831L)
    public static SubLObject get_file_backed_kb_hl_support_id_threshold() {
        return kb_object_manager.get_file_backed_kb_object_id_threshold(kb_hl_support_manager.$kb_hl_support_content_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-manager.lisp", position = 3978L)
    public static SubLObject register_kb_hl_support_content(final SubLObject id, final SubLObject kb_hl_support_content) {
        return kb_object_manager.register_kb_object_content(kb_hl_support_manager.$kb_hl_support_content_manager$.getGlobalValue(), id, kb_hl_support_content);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-manager.lisp", position = 4241L)
    public static SubLObject deregister_kb_hl_support_content(final SubLObject id) {
        return kb_object_manager.deregister_kb_object_content(kb_hl_support_manager.$kb_hl_support_content_manager$.getGlobalValue(), id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-manager.lisp", position = 4435L)
    public static SubLObject mark_kb_hl_support_content_as_muted(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding(thread);
        try {
            kb_storage_logging.$kb_storage_client$.bind(kb_storage_logging.add_kb_storage_logging_add_tag((SubLObject)kb_hl_support_manager.$kw5$KHM), thread);
            return kb_object_manager.mark_kb_object_content_as_muted(kb_hl_support_manager.$kb_hl_support_content_manager$.getGlobalValue(), id);
        }
        finally {
            kb_storage_logging.$kb_storage_client$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-manager.lisp", position = 4633L)
    public static SubLObject meter_kb_hl_support_content_swap_time() {
        return kb_object_manager.meter_kb_object_content_swap_time(kb_hl_support_manager.$kb_hl_support_content_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-manager.lisp", position = 4824L)
    public static SubLObject dont_meter_kb_hl_support_content_swap_time() {
        return kb_object_manager.dont_meter_kb_object_content_swap_time(kb_hl_support_manager.$kb_hl_support_content_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-manager.lisp", position = 5026L)
    public static SubLObject clear_kb_hl_support_content_swap_time() {
        return kb_object_manager.clear_kb_object_content_swap_time(kb_hl_support_manager.$kb_hl_support_content_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-manager.lisp", position = 5208L)
    public static SubLObject current_kb_hl_support_content_swap_time() {
        return kb_object_manager.kb_object_manager_swap_time(kb_hl_support_manager.$kb_hl_support_content_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-manager.lisp", position = 5497L)
    public static SubLObject swap_out_all_pristine_kb_hl_supports() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding(thread);
        try {
            kb_storage_logging.$kb_storage_client$.bind(kb_storage_logging.add_kb_storage_logging_add_tag((SubLObject)kb_hl_support_manager.$kw5$KHM), thread);
            return kb_object_manager.safely_swap_out_all_pristine_kb_objects(kb_hl_support_manager.$kb_hl_support_content_manager$.getGlobalValue());
        }
        finally {
            kb_storage_logging.$kb_storage_client$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-manager.lisp", position = 5675L)
    public static SubLObject initialize_kb_hl_support_hl_store_cache() {
        return kb_object_manager.initialize_kb_object_hl_store_cache(kb_hl_support_manager.$kb_hl_support_content_manager$.getGlobalValue(), (SubLObject)kb_hl_support_manager.$str3$kb_hl_support, (SubLObject)kb_hl_support_manager.$str7$kb_hl_support_index, (SubLObject)kb_hl_support_manager.UNPROVIDED, (SubLObject)kb_hl_support_manager.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-manager.lisp", position = 5854L)
    public static SubLObject verify_kb_hl_support_content_table_int(final SubLObject type_pred, SubLObject repairP) {
        if (repairP == kb_hl_support_manager.UNPROVIDED) {
            repairP = (SubLObject)kb_hl_support_manager.NIL;
        }
        return kb_object_manager.verify_kb_object_content_table_int(kb_hl_support_manager.$kb_hl_support_content_manager$.getGlobalValue(), type_pred, repairP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-manager.lisp", position = 6413L)
    public static SubLObject possibly_initialize_kb_hl_support_manager_from_legacy_world() {
        if (kb_hl_support_manager.$kw1$UNINITIALIZED == kb_hl_support_manager.$kb_hl_support_content_manager$.getGlobalValue()) {
            final SubLObject size = id_index.id_index_sparse_id_threshold(kb_hl_support_manager.$kb_hl_support_contents_from_ids$.getGlobalValue());
            final SubLObject lru_size = Numbers.min(kb_hl_support_manager.$kb_hl_support_lru_size_max$.getGlobalValue(), Numbers.multiply(Numbers.integerDivide(size, (SubLObject)kb_hl_support_manager.$int10$100), kb_hl_support_manager.$kb_hl_support_lru_size_percentage$.getGlobalValue()));
            final SubLObject lru_information = cache.new_cache(lru_size, (SubLObject)kb_hl_support_manager.UNPROVIDED);
            kb_hl_support_manager.$kb_hl_support_content_manager$.setGlobalValue(kb_object_manager.new_legacy_kb_object_manager((SubLObject)kb_hl_support_manager.$str3$kb_hl_support, kb_hl_support_manager.$kb_hl_support_lru_size_percentage$.getGlobalValue(), kb_hl_support_manager.$kb_hl_support_lru_size_max$.getGlobalValue(), kb_hl_support_manager.$kb_hl_support_contents_from_ids$.getGlobalValue(), lru_information, (SubLObject)kb_hl_support_manager.$kw1$UNINITIALIZED, (SubLObject)kb_hl_support_manager.$sym4$LOAD_KB_HL_SUPPORT_DEF_FROM_CACHE));
            return (SubLObject)kb_hl_support_manager.T;
        }
        return (SubLObject)kb_hl_support_manager.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-manager.lisp", position = 7098L)
    public static SubLObject kb_hl_support_content_change_stream_buffer_sizes(final SubLObject data_stream_buffer_size, final SubLObject index_stream_buffer_size) {
        return kb_object_manager.kb_object_manager_change_stream_buffer_sizes(kb_hl_support_manager.$kb_hl_support_content_manager$.getGlobalValue(), data_stream_buffer_size, index_stream_buffer_size);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-manager.lisp", position = 7368L)
    public static SubLObject kb_hl_support_content_index_enable_memory_mapping() {
        return kb_object_manager.kb_object_manager_enable_memory_mapping(kb_hl_support_manager.$kb_hl_support_content_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-manager.lisp", position = 7520L)
    public static SubLObject kb_hl_support_content_index_memory_mappedP() {
        return kb_object_manager.kb_object_manager_memory_mappedP(kb_hl_support_manager.$kb_hl_support_content_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-support-manager.lisp", position = 7658L)
    public static SubLObject with_kb_hl_support_content_index_fully_loaded(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)kb_hl_support_manager.$sym11$WITH_KBOM_FULLY_LOADED, (SubLObject)kb_hl_support_manager.$list12, ConsesLow.append(body, (SubLObject)kb_hl_support_manager.NIL));
    }
    
    public static SubLObject declare_kb_hl_support_manager_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_manager", "setup_kb_hl_support_content_table", "SETUP-KB-HL-SUPPORT-CONTENT-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_manager", "resize_kb_hl_support_content_kbom_lru", "RESIZE-KB-HL-SUPPORT-CONTENT-KBOM-LRU", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_manager", "optimize_kb_hl_support_content_table", "OPTIMIZE-KB-HL-SUPPORT-CONTENT-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_manager", "clear_kb_hl_support_content_table", "CLEAR-KB-HL-SUPPORT-CONTENT-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_manager", "maintain_kb_hl_support_usage_counts", "MAINTAIN-KB-HL-SUPPORT-USAGE-COUNTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_manager", "dont_maintain_kb_hl_support_usage_counts", "DONT-MAINTAIN-KB-HL-SUPPORT-USAGE-COUNTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_manager", "kb_hl_support_usage_counts_enabled_p", "KB-HL-SUPPORT-USAGE-COUNTS-ENABLED-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_manager", "cached_kb_hl_support_count", "CACHED-KB-HL-SUPPORT-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_manager", "kb_hl_support_content_completely_cachedP", "KB-HL-SUPPORT-CONTENT-COMPLETELY-CACHED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_manager", "kb_hl_support_content_cached_p", "KB-HL-SUPPORT-CONTENT-CACHED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_manager", "lookup_kb_hl_support_content", "LOOKUP-KB-HL-SUPPORT-CONTENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_manager", "get_file_backed_kb_hl_support_id_threshold", "GET-FILE-BACKED-KB-HL-SUPPORT-ID-THRESHOLD", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_manager", "register_kb_hl_support_content", "REGISTER-KB-HL-SUPPORT-CONTENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_manager", "deregister_kb_hl_support_content", "DEREGISTER-KB-HL-SUPPORT-CONTENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_manager", "mark_kb_hl_support_content_as_muted", "MARK-KB-HL-SUPPORT-CONTENT-AS-MUTED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_manager", "meter_kb_hl_support_content_swap_time", "METER-KB-HL-SUPPORT-CONTENT-SWAP-TIME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_manager", "dont_meter_kb_hl_support_content_swap_time", "DONT-METER-KB-HL-SUPPORT-CONTENT-SWAP-TIME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_manager", "clear_kb_hl_support_content_swap_time", "CLEAR-KB-HL-SUPPORT-CONTENT-SWAP-TIME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_manager", "current_kb_hl_support_content_swap_time", "CURRENT-KB-HL-SUPPORT-CONTENT-SWAP-TIME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_manager", "swap_out_all_pristine_kb_hl_supports", "SWAP-OUT-ALL-PRISTINE-KB-HL-SUPPORTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_manager", "initialize_kb_hl_support_hl_store_cache", "INITIALIZE-KB-HL-SUPPORT-HL-STORE-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_manager", "verify_kb_hl_support_content_table_int", "VERIFY-KB-HL-SUPPORT-CONTENT-TABLE-INT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_manager", "possibly_initialize_kb_hl_support_manager_from_legacy_world", "POSSIBLY-INITIALIZE-KB-HL-SUPPORT-MANAGER-FROM-LEGACY-WORLD", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_manager", "kb_hl_support_content_change_stream_buffer_sizes", "KB-HL-SUPPORT-CONTENT-CHANGE-STREAM-BUFFER-SIZES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_manager", "kb_hl_support_content_index_enable_memory_mapping", "KB-HL-SUPPORT-CONTENT-INDEX-ENABLE-MEMORY-MAPPING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_support_manager", "kb_hl_support_content_index_memory_mappedP", "KB-HL-SUPPORT-CONTENT-INDEX-MEMORY-MAPPED?", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_hl_support_manager", "with_kb_hl_support_content_index_fully_loaded", "WITH-KB-HL-SUPPORT-CONTENT-INDEX-FULLY-LOADED");
        return (SubLObject)kb_hl_support_manager.NIL;
    }
    
    public static SubLObject init_kb_hl_support_manager_file() {
        kb_hl_support_manager.$kb_hl_support_content_manager$ = SubLFiles.deflexical("*KB-HL-SUPPORT-CONTENT-MANAGER*", (SubLObject)(maybeDefault((SubLObject)kb_hl_support_manager.$sym0$_KB_HL_SUPPORT_CONTENT_MANAGER_, kb_hl_support_manager.$kb_hl_support_content_manager$, kb_hl_support_manager.$kw1$UNINITIALIZED)));
        kb_hl_support_manager.$kb_hl_support_lru_size_percentage$ = SubLFiles.deflexical("*KB-HL-SUPPORT-LRU-SIZE-PERCENTAGE*", (SubLObject)kb_hl_support_manager.FIVE_INTEGER);
        kb_hl_support_manager.$kb_hl_support_lru_size_max$ = SubLFiles.deflexical("*KB-HL-SUPPORT-LRU-SIZE-MAX*", (SubLObject)kb_hl_support_manager.$int2$10000);
        kb_hl_support_manager.$kb_hl_support_contents_from_ids$ = SubLFiles.deflexical("*KB-HL-SUPPORT-CONTENTS-FROM-IDS*", (SubLObject)(maybeDefault((SubLObject)kb_hl_support_manager.$sym8$_KB_HL_SUPPORT_CONTENTS_FROM_IDS_, kb_hl_support_manager.$kb_hl_support_contents_from_ids$, kb_hl_support_manager.NIL)));
        return (SubLObject)kb_hl_support_manager.NIL;
    }
    
    public static SubLObject setup_kb_hl_support_manager_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)kb_hl_support_manager.$sym0$_KB_HL_SUPPORT_CONTENT_MANAGER_);
        subl_macro_promotions.declare_defglobal((SubLObject)kb_hl_support_manager.$sym8$_KB_HL_SUPPORT_CONTENTS_FROM_IDS_);
        access_macros.define_obsolete_register((SubLObject)kb_hl_support_manager.$sym9$POSSIBLY_INITIALIZE_KB_HL_SUPPORT_MANAGER_FROM_LEGACY_WORLD, (SubLObject)kb_hl_support_manager.NIL);
        return (SubLObject)kb_hl_support_manager.NIL;
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
    
    static {
        me = (SubLFile)new kb_hl_support_manager();
        kb_hl_support_manager.$kb_hl_support_content_manager$ = null;
        kb_hl_support_manager.$kb_hl_support_lru_size_percentage$ = null;
        kb_hl_support_manager.$kb_hl_support_lru_size_max$ = null;
        kb_hl_support_manager.$kb_hl_support_contents_from_ids$ = null;
        $sym0$_KB_HL_SUPPORT_CONTENT_MANAGER_ = SubLObjectFactory.makeSymbol("*KB-HL-SUPPORT-CONTENT-MANAGER*");
        $kw1$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $int2$10000 = SubLObjectFactory.makeInteger(10000);
        $str3$kb_hl_support = SubLObjectFactory.makeString("kb-hl-support");
        $sym4$LOAD_KB_HL_SUPPORT_DEF_FROM_CACHE = SubLObjectFactory.makeSymbol("LOAD-KB-HL-SUPPORT-DEF-FROM-CACHE");
        $kw5$KHM = SubLObjectFactory.makeKeyword("KHM");
        $sym6$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $str7$kb_hl_support_index = SubLObjectFactory.makeString("kb-hl-support-index");
        $sym8$_KB_HL_SUPPORT_CONTENTS_FROM_IDS_ = SubLObjectFactory.makeSymbol("*KB-HL-SUPPORT-CONTENTS-FROM-IDS*");
        $sym9$POSSIBLY_INITIALIZE_KB_HL_SUPPORT_MANAGER_FROM_LEGACY_WORLD = SubLObjectFactory.makeSymbol("POSSIBLY-INITIALIZE-KB-HL-SUPPORT-MANAGER-FROM-LEGACY-WORLD");
        $int10$100 = SubLObjectFactory.makeInteger(100);
        $sym11$WITH_KBOM_FULLY_LOADED = SubLObjectFactory.makeSymbol("WITH-KBOM-FULLY-LOADED");
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*KB-HL-SUPPORT-CONTENT-MANAGER*"));
    }
}

/*

	Total time: 107 ms
	
*/