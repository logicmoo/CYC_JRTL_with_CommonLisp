// 
// 

package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.inference.arete;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class assertion_manager extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.assertion_manager";
    public static final String myFingerPrint = "5d83c4a3f02aaf1f0e6aa32f7fbb2b3d73b8abd29c38c22f7b685132a5a48cea";
    @SubLTranslatedFile.SubL(source = "cycl/assertion-manager.lisp", position = 1357L)
    public static SubLSymbol $assertion_content_manager$;
    @SubLTranslatedFile.SubL(source = "cycl/assertion-manager.lisp", position = 1546L)
    private static SubLSymbol $assertion_lru_size_percentage$;
    @SubLTranslatedFile.SubL(source = "cycl/assertion-manager.lisp", position = 1868L)
    private static SubLSymbol $assertion_lru_size_max$;
    private static final SubLSymbol $sym0$_ASSERTION_CONTENT_MANAGER_;
    private static final SubLSymbol $kw1$UNINITIALIZED;
    private static final SubLInteger $int2$600000;
    private static final SubLString $str3$assertion;
    private static final SubLSymbol $sym4$LOAD_ASSERTION_DEF_FROM_CACHE;
    private static final SubLSymbol $kw5$AM;
    private static final SubLSymbol $sym6$_EXIT;
    private static final SubLSymbol $sym7$WITH_KBOM_FULLY_LOADED;
    private static final SubLList $list8;
    private static final SubLString $str9$assertion_index;
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-manager.lisp", position = 2046L)
    public static SubLObject setup_assertion_content_table(final SubLObject size, final SubLObject exactP) {
        assertion_manager.$assertion_content_manager$.setGlobalValue(kb_object_manager.new_kb_object_manager((SubLObject)assertion_manager.$str3$assertion, size, assertion_manager.$assertion_lru_size_percentage$.getGlobalValue(), assertion_manager.$assertion_lru_size_max$.getGlobalValue(), (SubLObject)assertion_manager.$sym4$LOAD_ASSERTION_DEF_FROM_CACHE, exactP));
        return (SubLObject)assertion_manager.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-manager.lisp", position = 2311L)
    public static SubLObject resize_assertion_content_kbom_lru(SubLObject percentage, SubLObject max) {
        if (percentage == assertion_manager.UNPROVIDED) {
            percentage = (SubLObject)assertion_manager.NIL;
        }
        if (max == assertion_manager.UNPROVIDED) {
            max = (SubLObject)assertion_manager.NIL;
        }
        if (assertion_manager.NIL == percentage) {
            percentage = assertion_manager.$assertion_lru_size_percentage$.getGlobalValue();
        }
        if (assertion_manager.NIL == max) {
            max = assertion_manager.$assertion_lru_size_max$.getGlobalValue();
        }
        return kb_object_manager.resize_kbom_lru_cache_from_percentage_and_max(assertion_manager.$assertion_content_manager$.getGlobalValue(), percentage, max);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-manager.lisp", position = 2725L)
    public static SubLObject optimize_assertion_content_table(final SubLObject new_assertion_id_threshold) {
        return kb_object_manager.optimize_kb_object_content_table(assertion_manager.$assertion_content_manager$.getGlobalValue(), new_assertion_id_threshold);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-manager.lisp", position = 2905L)
    public static SubLObject clear_assertion_content_table() {
        return kb_object_manager.clear_kb_object_content_table(assertion_manager.$assertion_content_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-manager.lisp", position = 3026L)
    public static SubLObject maintain_assertion_usage_counts() {
        return kb_object_manager.maintain_kb_object_usage_counts(assertion_manager.$assertion_content_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-manager.lisp", position = 3199L)
    public static SubLObject dont_maintain_assertion_usage_counts() {
        return kb_object_manager.dont_maintain_kb_object_usage_counts(assertion_manager.$assertion_content_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-manager.lisp", position = 3383L)
    public static SubLObject assertion_usage_counts_enabled_p() {
        return kb_object_manager.kb_object_usage_counts_enabledP(assertion_manager.$assertion_content_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-manager.lisp", position = 3584L)
    public static SubLObject cached_assertion_count() {
        return kb_object_manager.cached_kb_object_count(assertion_manager.$assertion_content_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-manager.lisp", position = 3944L)
    public static SubLObject assertion_content_completely_cachedP() {
        return Numbers.numE(assertion_handles.assertion_count(), cached_assertion_count());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-manager.lisp", position = 4141L)
    public static SubLObject assertion_content_cached_p(final SubLObject assertion) {
        return kb_object_manager.kb_object_id_cachedP(assertion_manager.$assertion_content_manager$.getGlobalValue(), assertion_handles.assertion_id(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-manager.lisp", position = 4284L)
    public static SubLObject assertion_content_cachable_p(final SubLObject assertion) {
        return kb_object_manager.kb_object_id_cachableP(assertion_manager.$assertion_content_manager$.getGlobalValue(), assertion_handles.assertion_id(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-manager.lisp", position = 4431L)
    public static SubLObject lookup_assertion_content(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        arete.arete_note_assertion_touched(assertion_handles.find_assertion_by_id(id));
        final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding(thread);
        try {
            kb_storage_logging.$kb_storage_client$.bind(kb_storage_logging.add_kb_storage_logging_add_tag((SubLObject)assertion_manager.$kw5$AM), thread);
            return kb_object_manager.lookup_kb_object_content(assertion_manager.$assertion_content_manager$.getGlobalValue(), id);
        }
        finally {
            kb_storage_logging.$kb_storage_client$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-manager.lisp", position = 4641L)
    public static SubLObject get_file_backed_assertion_id_threshold() {
        return kb_object_manager.get_file_backed_kb_object_id_threshold(assertion_manager.$assertion_content_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-manager.lisp", position = 4780L)
    public static SubLObject new_muted_assertion_content_iterator() {
        return kb_object_manager.new_muted_kb_object_iterator(assertion_manager.$assertion_content_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-manager.lisp", position = 4907L)
    public static SubLObject assertion_manager_dont_maintain_usages_counts() {
        return kb_object_manager.dont_maintain_kb_object_usage_counts(assertion_manager.$assertion_content_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-manager.lisp", position = 5065L)
    public static SubLObject assertion_manager_maintain_usage_counts() {
        return kb_object_manager.maintain_kb_object_usage_counts(assertion_manager.$assertion_content_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-manager.lisp", position = 5195L)
    public static SubLObject assertion_manager_usage_counts_enabledP() {
        return kb_object_manager.kb_object_usage_counts_enabledP(assertion_manager.$assertion_content_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-manager.lisp", position = 5325L)
    public static SubLObject assertion_manager_change_stream_buffer_sizes(final SubLObject data_stream_buffer_size, final SubLObject index_stream_buffer_size) {
        return kb_object_manager.kb_object_manager_change_stream_buffer_sizes(assertion_manager.$assertion_content_manager$.getGlobalValue(), data_stream_buffer_size, index_stream_buffer_size);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-manager.lisp", position = 5570L)
    public static SubLObject assertion_manager_enable_memory_mapping() {
        return kb_object_manager.kb_object_manager_enable_memory_mapping(assertion_manager.$assertion_content_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-manager.lisp", position = 5708L)
    public static SubLObject assertion_manager_memory_mappedP() {
        return kb_object_manager.kb_object_manager_memory_mappedP(assertion_manager.$assertion_content_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-manager.lisp", position = 5832L)
    public static SubLObject with_assertion_manager_fully_loaded(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)assertion_manager.$sym7$WITH_KBOM_FULLY_LOADED, (SubLObject)assertion_manager.$list8, ConsesLow.append(body, (SubLObject)assertion_manager.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-manager.lisp", position = 5971L)
    public static SubLObject register_assertion_content(final SubLObject id, final SubLObject assertion_content) {
        return kb_object_manager.register_kb_object_content(assertion_manager.$assertion_content_manager$.getGlobalValue(), id, assertion_content);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-manager.lisp", position = 6214L)
    public static SubLObject deregister_assertion_content(final SubLObject id) {
        return kb_object_manager.deregister_kb_object_content(assertion_manager.$assertion_content_manager$.getGlobalValue(), id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-manager.lisp", position = 6396L)
    public static SubLObject mark_assertion_content_as_muted(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding(thread);
        try {
            kb_storage_logging.$kb_storage_client$.bind(kb_storage_logging.add_kb_storage_logging_add_tag((SubLObject)assertion_manager.$kw5$AM), thread);
            return kb_object_manager.mark_kb_object_content_as_muted(assertion_manager.$assertion_content_manager$.getGlobalValue(), id);
        }
        finally {
            kb_storage_logging.$kb_storage_client$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-manager.lisp", position = 6585L)
    public static SubLObject meter_assertion_content_swap_time() {
        return kb_object_manager.meter_kb_object_content_swap_time(assertion_manager.$assertion_content_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-manager.lisp", position = 6764L)
    public static SubLObject dont_meter_assertion_content_swap_time() {
        return kb_object_manager.dont_meter_kb_object_content_swap_time(assertion_manager.$assertion_content_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-manager.lisp", position = 6954L)
    public static SubLObject clear_assertion_content_swap_time() {
        return kb_object_manager.clear_kb_object_content_swap_time(assertion_manager.$assertion_content_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-manager.lisp", position = 7124L)
    public static SubLObject current_assertion_content_swap_time() {
        return kb_object_manager.kb_object_manager_swap_time(assertion_manager.$assertion_content_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-manager.lisp", position = 7401L)
    public static SubLObject swap_out_all_pristine_assertions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding(thread);
        try {
            kb_storage_logging.$kb_storage_client$.bind(kb_storage_logging.add_kb_storage_logging_add_tag((SubLObject)assertion_manager.$kw5$AM), thread);
            return kb_object_manager.safely_swap_out_all_pristine_kb_objects(assertion_manager.$assertion_content_manager$.getGlobalValue());
        }
        finally {
            kb_storage_logging.$kb_storage_client$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-manager.lisp", position = 7570L)
    public static SubLObject initialize_assertion_hl_store_cache() {
        return kb_object_manager.initialize_kb_object_hl_store_cache(assertion_manager.$assertion_content_manager$.getGlobalValue(), (SubLObject)assertion_manager.$str3$assertion, (SubLObject)assertion_manager.$str9$assertion_index, (SubLObject)assertion_manager.UNPROVIDED, (SubLObject)assertion_manager.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-manager.lisp", position = 7733L)
    public static SubLObject wide_assertion_hl_store_cacheP() {
        return kb_object_manager.wide_kb_object_managerP(assertion_manager.$assertion_content_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertion-manager.lisp", position = 7849L)
    public static SubLObject verify_assertion_content_table_int(final SubLObject type_pred, SubLObject repairP) {
        if (repairP == assertion_manager.UNPROVIDED) {
            repairP = (SubLObject)assertion_manager.NIL;
        }
        return kb_object_manager.verify_kb_object_content_table_int(assertion_manager.$assertion_content_manager$.getGlobalValue(), type_pred, repairP);
    }
    
    public static SubLObject declare_assertion_manager_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_manager", "setup_assertion_content_table", "SETUP-ASSERTION-CONTENT-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_manager", "resize_assertion_content_kbom_lru", "RESIZE-ASSERTION-CONTENT-KBOM-LRU", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_manager", "optimize_assertion_content_table", "OPTIMIZE-ASSERTION-CONTENT-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_manager", "clear_assertion_content_table", "CLEAR-ASSERTION-CONTENT-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_manager", "maintain_assertion_usage_counts", "MAINTAIN-ASSERTION-USAGE-COUNTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_manager", "dont_maintain_assertion_usage_counts", "DONT-MAINTAIN-ASSERTION-USAGE-COUNTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_manager", "assertion_usage_counts_enabled_p", "ASSERTION-USAGE-COUNTS-ENABLED-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_manager", "cached_assertion_count", "CACHED-ASSERTION-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_manager", "assertion_content_completely_cachedP", "ASSERTION-CONTENT-COMPLETELY-CACHED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_manager", "assertion_content_cached_p", "ASSERTION-CONTENT-CACHED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_manager", "assertion_content_cachable_p", "ASSERTION-CONTENT-CACHABLE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_manager", "lookup_assertion_content", "LOOKUP-ASSERTION-CONTENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_manager", "get_file_backed_assertion_id_threshold", "GET-FILE-BACKED-ASSERTION-ID-THRESHOLD", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_manager", "new_muted_assertion_content_iterator", "NEW-MUTED-ASSERTION-CONTENT-ITERATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_manager", "assertion_manager_dont_maintain_usages_counts", "ASSERTION-MANAGER-DONT-MAINTAIN-USAGES-COUNTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_manager", "assertion_manager_maintain_usage_counts", "ASSERTION-MANAGER-MAINTAIN-USAGE-COUNTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_manager", "assertion_manager_usage_counts_enabledP", "ASSERTION-MANAGER-USAGE-COUNTS-ENABLED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_manager", "assertion_manager_change_stream_buffer_sizes", "ASSERTION-MANAGER-CHANGE-STREAM-BUFFER-SIZES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_manager", "assertion_manager_enable_memory_mapping", "ASSERTION-MANAGER-ENABLE-MEMORY-MAPPING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_manager", "assertion_manager_memory_mappedP", "ASSERTION-MANAGER-MEMORY-MAPPED?", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.assertion_manager", "with_assertion_manager_fully_loaded", "WITH-ASSERTION-MANAGER-FULLY-LOADED");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_manager", "register_assertion_content", "REGISTER-ASSERTION-CONTENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_manager", "deregister_assertion_content", "DEREGISTER-ASSERTION-CONTENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_manager", "mark_assertion_content_as_muted", "MARK-ASSERTION-CONTENT-AS-MUTED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_manager", "meter_assertion_content_swap_time", "METER-ASSERTION-CONTENT-SWAP-TIME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_manager", "dont_meter_assertion_content_swap_time", "DONT-METER-ASSERTION-CONTENT-SWAP-TIME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_manager", "clear_assertion_content_swap_time", "CLEAR-ASSERTION-CONTENT-SWAP-TIME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_manager", "current_assertion_content_swap_time", "CURRENT-ASSERTION-CONTENT-SWAP-TIME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_manager", "swap_out_all_pristine_assertions", "SWAP-OUT-ALL-PRISTINE-ASSERTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_manager", "initialize_assertion_hl_store_cache", "INITIALIZE-ASSERTION-HL-STORE-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_manager", "wide_assertion_hl_store_cacheP", "WIDE-ASSERTION-HL-STORE-CACHE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertion_manager", "verify_assertion_content_table_int", "VERIFY-ASSERTION-CONTENT-TABLE-INT", 1, 1, false);
        return (SubLObject)assertion_manager.NIL;
    }
    
    public static SubLObject init_assertion_manager_file() {
        assertion_manager.$assertion_content_manager$ = SubLFiles.deflexical("*ASSERTION-CONTENT-MANAGER*", (SubLObject)((assertion_manager.NIL != Symbols.boundp((SubLObject)assertion_manager.$sym0$_ASSERTION_CONTENT_MANAGER_)) ? assertion_manager.$assertion_content_manager$.getGlobalValue() : assertion_manager.$kw1$UNINITIALIZED));
        assertion_manager.$assertion_lru_size_percentage$ = SubLFiles.deflexical("*ASSERTION-LRU-SIZE-PERCENTAGE*", (SubLObject)assertion_manager.SIXTEEN_INTEGER);
        assertion_manager.$assertion_lru_size_max$ = SubLFiles.deflexical("*ASSERTION-LRU-SIZE-MAX*", (SubLObject)assertion_manager.$int2$600000);
        return (SubLObject)assertion_manager.NIL;
    }
    
    public static SubLObject setup_assertion_manager_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)assertion_manager.$sym0$_ASSERTION_CONTENT_MANAGER_);
        return (SubLObject)assertion_manager.NIL;
    }
    
    public void declareFunctions() {
        declare_assertion_manager_file();
    }
    
    public void initializeVariables() {
        init_assertion_manager_file();
    }
    
    public void runTopLevelForms() {
        setup_assertion_manager_file();
    }
    
    static {
        me = (SubLFile)new assertion_manager();
        assertion_manager.$assertion_content_manager$ = null;
        assertion_manager.$assertion_lru_size_percentage$ = null;
        assertion_manager.$assertion_lru_size_max$ = null;
        $sym0$_ASSERTION_CONTENT_MANAGER_ = SubLObjectFactory.makeSymbol("*ASSERTION-CONTENT-MANAGER*");
        $kw1$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $int2$600000 = SubLObjectFactory.makeInteger(600000);
        $str3$assertion = SubLObjectFactory.makeString("assertion");
        $sym4$LOAD_ASSERTION_DEF_FROM_CACHE = SubLObjectFactory.makeSymbol("LOAD-ASSERTION-DEF-FROM-CACHE");
        $kw5$AM = SubLObjectFactory.makeKeyword("AM");
        $sym6$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $sym7$WITH_KBOM_FULLY_LOADED = SubLObjectFactory.makeSymbol("WITH-KBOM-FULLY-LOADED");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*ASSERTION-CONTENT-MANAGER*"));
        $str9$assertion_index = SubLObjectFactory.makeString("assertion-index");
    }
}
