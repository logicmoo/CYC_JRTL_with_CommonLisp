// 
// 

package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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

public final class constant_index_manager extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.constant_index_manager";
    public static final String myFingerPrint = "3ee41ab57645f0de3476140d3d9397fbe6398ee7992df3b9dc655a92cdc388e1";
    @SubLTranslatedFile.SubL(source = "cycl/constant-index-manager.lisp", position = 1476L)
    public static SubLSymbol $constant_index_manager$;
    @SubLTranslatedFile.SubL(source = "cycl/constant-index-manager.lisp", position = 1659L)
    private static SubLSymbol $constant_index_lru_size_percentage$;
    @SubLTranslatedFile.SubL(source = "cycl/constant-index-manager.lisp", position = 1938L)
    private static SubLSymbol $constant_index_lru_size_max$;
    private static final SubLSymbol $sym0$_CONSTANT_INDEX_MANAGER_;
    private static final SubLSymbol $kw1$UNINITIALIZED;
    private static final SubLInteger $int2$20000;
    private static final SubLString $str3$constant_index;
    private static final SubLSymbol $sym4$LOAD_CONSTANT_INDEX_FROM_CACHE;
    private static final SubLSymbol $kw5$CIM;
    private static final SubLSymbol $sym6$_EXIT;
    private static final SubLSymbol $sym7$WITH_KBOM_FULLY_LOADED;
    private static final SubLList $list8;
    private static final SubLString $str9$indices;
    private static final SubLString $str10$indices_index;
    private static final SubLString $str11$constant_complex_indices;
    private static final SubLString $str12$constant_complex_indices_index;
    private static final SubLString $str13$cim;
    private static final SubLString $str14$ccim;
    private static final SubLSymbol $kw15$CONSTANT_INDEX;
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-index-manager.lisp", position = 2120L)
    public static SubLObject setup_constant_index_table(final SubLObject size, final SubLObject exactP) {
        constant_index_manager.$constant_index_manager$.setGlobalValue(kb_object_manager.new_kb_object_manager((SubLObject)constant_index_manager.$str3$constant_index, size, constant_index_manager.$constant_index_lru_size_percentage$.getGlobalValue(), constant_index_manager.$constant_index_lru_size_max$.getGlobalValue(), (SubLObject)constant_index_manager.$sym4$LOAD_CONSTANT_INDEX_FROM_CACHE, exactP));
        return (SubLObject)constant_index_manager.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-index-manager.lisp", position = 2395L)
    public static SubLObject resize_constant_index_kbom_lru(SubLObject percentage, SubLObject max) {
        if (percentage == constant_index_manager.UNPROVIDED) {
            percentage = (SubLObject)constant_index_manager.NIL;
        }
        if (max == constant_index_manager.UNPROVIDED) {
            max = (SubLObject)constant_index_manager.NIL;
        }
        if (constant_index_manager.NIL == percentage) {
            percentage = constant_index_manager.$constant_index_lru_size_percentage$.getGlobalValue();
        }
        if (constant_index_manager.NIL == max) {
            max = constant_index_manager.$constant_index_lru_size_max$.getGlobalValue();
        }
        return kb_object_manager.resize_kbom_lru_cache_from_percentage_and_max(constant_index_manager.$constant_index_manager$.getGlobalValue(), percentage, max);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-index-manager.lisp", position = 2810L)
    public static SubLObject optimize_constant_index_table(final SubLObject new_constant_id_threshold) {
        return kb_object_manager.optimize_kb_object_content_table(constant_index_manager.$constant_index_manager$.getGlobalValue(), new_constant_id_threshold);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-index-manager.lisp", position = 2983L)
    public static SubLObject clear_constant_index_table() {
        return kb_object_manager.clear_kb_object_content_table(constant_index_manager.$constant_index_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-index-manager.lisp", position = 3098L)
    public static SubLObject maintain_constant_index_usage_counts() {
        return kb_object_manager.maintain_kb_object_usage_counts(constant_index_manager.$constant_index_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-index-manager.lisp", position = 3278L)
    public static SubLObject dont_maintain_constant_index_usage_counts() {
        return kb_object_manager.dont_maintain_kb_object_usage_counts(constant_index_manager.$constant_index_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-index-manager.lisp", position = 3469L)
    public static SubLObject constant_index_usage_counts_enabled_p() {
        return kb_object_manager.kb_object_usage_counts_enabledP(constant_index_manager.$constant_index_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-index-manager.lisp", position = 3677L)
    public static SubLObject cached_constant_index_count() {
        return kb_object_manager.cached_kb_object_count(constant_index_manager.$constant_index_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-index-manager.lisp", position = 4055L)
    public static SubLObject constant_indices_completely_cachedP() {
        return Numbers.numE(constant_handles.constant_count(), cached_constant_index_count());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-index-manager.lisp", position = 4259L)
    public static SubLObject lookup_constant_index(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding(thread);
        try {
            kb_storage_logging.$kb_storage_client$.bind(kb_storage_logging.add_kb_storage_logging_add_tag((SubLObject)constant_index_manager.$kw5$CIM), thread);
            return kb_object_manager.lookup_kb_object_content(constant_index_manager.$constant_index_manager$.getGlobalValue(), id);
        }
        finally {
            kb_storage_logging.$kb_storage_client$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-index-manager.lisp", position = 4529L)
    public static SubLObject constant_index_cachedP(final SubLObject id) {
        return kb_object_manager.kb_object_id_cachedP(constant_index_manager.$constant_index_manager$.getGlobalValue(), id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-index-manager.lisp", position = 4636L)
    public static SubLObject get_file_backed_constant_internal_id_threshold() {
        return kb_object_manager.get_file_backed_kb_object_id_threshold(constant_index_manager.$constant_index_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-index-manager.lisp", position = 4780L)
    public static SubLObject new_muted_constant_index_iterator() {
        return kb_object_manager.new_muted_kb_object_iterator(constant_index_manager.$constant_index_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-index-manager.lisp", position = 4901L)
    public static SubLObject constant_index_dont_maintain_usages_counts() {
        return kb_object_manager.dont_maintain_kb_object_usage_counts(constant_index_manager.$constant_index_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-index-manager.lisp", position = 5054L)
    public static SubLObject constant_index_maintain_usage_counts() {
        return kb_object_manager.maintain_kb_object_usage_counts(constant_index_manager.$constant_index_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-index-manager.lisp", position = 5179L)
    public static SubLObject constant_index_usage_counts_enabledP() {
        return kb_object_manager.kb_object_usage_counts_enabledP(constant_index_manager.$constant_index_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-index-manager.lisp", position = 5304L)
    public static SubLObject constant_indexchange_stream_buffer_sizes(final SubLObject data_stream_buffer_size, final SubLObject index_stream_buffer_size) {
        return kb_object_manager.kb_object_manager_change_stream_buffer_sizes(constant_index_manager.$constant_index_manager$.getGlobalValue(), data_stream_buffer_size, index_stream_buffer_size);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-index-manager.lisp", position = 5543L)
    public static SubLObject constant_index_enable_memory_mapping() {
        return kb_object_manager.kb_object_manager_enable_memory_mapping(constant_index_manager.$constant_index_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-index-manager.lisp", position = 5676L)
    public static SubLObject constant_index_memory_mappedP() {
        return kb_object_manager.kb_object_manager_memory_mappedP(constant_index_manager.$constant_index_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-index-manager.lisp", position = 5795L)
    public static SubLObject with_constant_index_fully_loaded(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)constant_index_manager.$sym7$WITH_KBOM_FULLY_LOADED, (SubLObject)constant_index_manager.$list8, ConsesLow.append(body, (SubLObject)constant_index_manager.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-index-manager.lisp", position = 5928L)
    public static SubLObject register_constant_index(final SubLObject id, final SubLObject constant_index) {
        return kb_object_manager.register_kb_object_content(constant_index_manager.$constant_index_manager$.getGlobalValue(), id, constant_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-index-manager.lisp", position = 6156L)
    public static SubLObject deregister_constant_index(final SubLObject id) {
        return kb_object_manager.deregister_kb_object_content(constant_index_manager.$constant_index_manager$.getGlobalValue(), id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-index-manager.lisp", position = 6329L)
    public static SubLObject mark_constant_index_as_muted(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding(thread);
        try {
            kb_storage_logging.$kb_storage_client$.bind(kb_storage_logging.add_kb_storage_logging_add_tag((SubLObject)constant_index_manager.$kw5$CIM), thread);
            return kb_object_manager.mark_kb_object_content_as_muted(constant_index_manager.$constant_index_manager$.getGlobalValue(), id);
        }
        finally {
            kb_storage_logging.$kb_storage_client$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-index-manager.lisp", position = 6513L)
    public static SubLObject mark_constant_index_as_permanently_cached(final SubLObject id) {
        lookup_constant_index(id);
        return mark_constant_index_as_muted(id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-index-manager.lisp", position = 6736L)
    public static SubLObject meter_constant_index_swap_time() {
        return kb_object_manager.meter_kb_object_content_swap_time(constant_index_manager.$constant_index_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-index-manager.lisp", position = 6914L)
    public static SubLObject dont_meter_constant_index_swap_time() {
        return kb_object_manager.dont_meter_kb_object_content_swap_time(constant_index_manager.$constant_index_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-index-manager.lisp", position = 7103L)
    public static SubLObject clear_constant_index_swap_time() {
        return kb_object_manager.clear_kb_object_content_swap_time(constant_index_manager.$constant_index_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-index-manager.lisp", position = 7272L)
    public static SubLObject current_constant_index_swap_time() {
        return kb_object_manager.kb_object_manager_swap_time(constant_index_manager.$constant_index_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-index-manager.lisp", position = 7540L)
    public static SubLObject swap_out_all_pristine_constant_indices() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding(thread);
        try {
            kb_storage_logging.$kb_storage_client$.bind(kb_storage_logging.add_kb_storage_logging_add_tag((SubLObject)constant_index_manager.$kw5$CIM), thread);
            return kb_object_manager.safely_swap_out_all_pristine_kb_objects(constant_index_manager.$constant_index_manager$.getGlobalValue());
        }
        finally {
            kb_storage_logging.$kb_storage_client$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-index-manager.lisp", position = 7713L)
    public static SubLObject initialize_constant_index_hl_store_cache() {
        final SubLObject result = kb_object_manager.initialize_kb_object_hl_store_cache(constant_index_manager.$constant_index_manager$.getGlobalValue(), (SubLObject)constant_index_manager.$str9$indices, (SubLObject)constant_index_manager.$str10$indices_index, (SubLObject)constant_index_manager.$str11$constant_complex_indices, (SubLObject)constant_index_manager.$str12$constant_complex_indices_index);
        kb_storage_logging.register_kb_storage_logging_tag(kb_object_manager.kb_object_manager_file_vector(constant_index_manager.$constant_index_manager$.getGlobalValue()), (SubLObject)constant_index_manager.$str13$cim);
        final SubLObject sub_fvector = kb_object_manager.kb_object_manager_sub_file_vector(constant_index_manager.$constant_index_manager$.getGlobalValue());
        if (constant_index_manager.NIL != file_vector.file_vector_p(sub_fvector)) {
            kb_storage_logging.register_kb_storage_logging_tag(sub_fvector, (SubLObject)constant_index_manager.$str14$ccim);
            file_vector_utilities.register_indexical_file_vector_reference((SubLObject)constant_index_manager.$kw15$CONSTANT_INDEX, sub_fvector);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-index-manager.lisp", position = 8405L)
    public static SubLObject wide_constant_index_hl_store_cacheP() {
        return kb_object_manager.wide_kb_object_managerP(constant_index_manager.$constant_index_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-index-manager.lisp", position = 8523L)
    public static SubLObject wide_constant_complex_index_hl_store_cacheP() {
        return kb_object_manager.wide_kb_object_sub_managerP(constant_index_manager.$constant_index_manager$.getGlobalValue());
    }
    
    public static SubLObject declare_constant_index_manager_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_index_manager", "setup_constant_index_table", "SETUP-CONSTANT-INDEX-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_index_manager", "resize_constant_index_kbom_lru", "RESIZE-CONSTANT-INDEX-KBOM-LRU", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_index_manager", "optimize_constant_index_table", "OPTIMIZE-CONSTANT-INDEX-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_index_manager", "clear_constant_index_table", "CLEAR-CONSTANT-INDEX-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_index_manager", "maintain_constant_index_usage_counts", "MAINTAIN-CONSTANT-INDEX-USAGE-COUNTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_index_manager", "dont_maintain_constant_index_usage_counts", "DONT-MAINTAIN-CONSTANT-INDEX-USAGE-COUNTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_index_manager", "constant_index_usage_counts_enabled_p", "CONSTANT-INDEX-USAGE-COUNTS-ENABLED-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_index_manager", "cached_constant_index_count", "CACHED-CONSTANT-INDEX-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_index_manager", "constant_indices_completely_cachedP", "CONSTANT-INDICES-COMPLETELY-CACHED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_index_manager", "lookup_constant_index", "LOOKUP-CONSTANT-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_index_manager", "constant_index_cachedP", "CONSTANT-INDEX-CACHED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_index_manager", "get_file_backed_constant_internal_id_threshold", "GET-FILE-BACKED-CONSTANT-INTERNAL-ID-THRESHOLD", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_index_manager", "new_muted_constant_index_iterator", "NEW-MUTED-CONSTANT-INDEX-ITERATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_index_manager", "constant_index_dont_maintain_usages_counts", "CONSTANT-INDEX-DONT-MAINTAIN-USAGES-COUNTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_index_manager", "constant_index_maintain_usage_counts", "CONSTANT-INDEX-MAINTAIN-USAGE-COUNTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_index_manager", "constant_index_usage_counts_enabledP", "CONSTANT-INDEX-USAGE-COUNTS-ENABLED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_index_manager", "constant_indexchange_stream_buffer_sizes", "CONSTANT-INDEXCHANGE-STREAM-BUFFER-SIZES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_index_manager", "constant_index_enable_memory_mapping", "CONSTANT-INDEX-ENABLE-MEMORY-MAPPING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_index_manager", "constant_index_memory_mappedP", "CONSTANT-INDEX-MEMORY-MAPPED?", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.constant_index_manager", "with_constant_index_fully_loaded", "WITH-CONSTANT-INDEX-FULLY-LOADED");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_index_manager", "register_constant_index", "REGISTER-CONSTANT-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_index_manager", "deregister_constant_index", "DEREGISTER-CONSTANT-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_index_manager", "mark_constant_index_as_muted", "MARK-CONSTANT-INDEX-AS-MUTED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_index_manager", "mark_constant_index_as_permanently_cached", "MARK-CONSTANT-INDEX-AS-PERMANENTLY-CACHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_index_manager", "meter_constant_index_swap_time", "METER-CONSTANT-INDEX-SWAP-TIME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_index_manager", "dont_meter_constant_index_swap_time", "DONT-METER-CONSTANT-INDEX-SWAP-TIME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_index_manager", "clear_constant_index_swap_time", "CLEAR-CONSTANT-INDEX-SWAP-TIME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_index_manager", "current_constant_index_swap_time", "CURRENT-CONSTANT-INDEX-SWAP-TIME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_index_manager", "swap_out_all_pristine_constant_indices", "SWAP-OUT-ALL-PRISTINE-CONSTANT-INDICES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_index_manager", "initialize_constant_index_hl_store_cache", "INITIALIZE-CONSTANT-INDEX-HL-STORE-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_index_manager", "wide_constant_index_hl_store_cacheP", "WIDE-CONSTANT-INDEX-HL-STORE-CACHE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_index_manager", "wide_constant_complex_index_hl_store_cacheP", "WIDE-CONSTANT-COMPLEX-INDEX-HL-STORE-CACHE?", 0, 0, false);
        return (SubLObject)constant_index_manager.NIL;
    }
    
    public static SubLObject init_constant_index_manager_file() {
        constant_index_manager.$constant_index_manager$ = SubLFiles.deflexical("*CONSTANT-INDEX-MANAGER*", (SubLObject)((constant_index_manager.NIL != Symbols.boundp((SubLObject)constant_index_manager.$sym0$_CONSTANT_INDEX_MANAGER_)) ? constant_index_manager.$constant_index_manager$.getGlobalValue() : constant_index_manager.$kw1$UNINITIALIZED));
        constant_index_manager.$constant_index_lru_size_percentage$ = SubLFiles.deflexical("*CONSTANT-INDEX-LRU-SIZE-PERCENTAGE*", (SubLObject)constant_index_manager.SIXTEEN_INTEGER);
        constant_index_manager.$constant_index_lru_size_max$ = SubLFiles.deflexical("*CONSTANT-INDEX-LRU-SIZE-MAX*", (SubLObject)constant_index_manager.$int2$20000);
        return (SubLObject)constant_index_manager.NIL;
    }
    
    public static SubLObject setup_constant_index_manager_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)constant_index_manager.$sym0$_CONSTANT_INDEX_MANAGER_);
        return (SubLObject)constant_index_manager.NIL;
    }
    
    public void declareFunctions() {
        declare_constant_index_manager_file();
    }
    
    public void initializeVariables() {
        init_constant_index_manager_file();
    }
    
    public void runTopLevelForms() {
        setup_constant_index_manager_file();
    }
    
    static {
        me = (SubLFile)new constant_index_manager();
        constant_index_manager.$constant_index_manager$ = null;
        constant_index_manager.$constant_index_lru_size_percentage$ = null;
        constant_index_manager.$constant_index_lru_size_max$ = null;
        $sym0$_CONSTANT_INDEX_MANAGER_ = SubLObjectFactory.makeSymbol("*CONSTANT-INDEX-MANAGER*");
        $kw1$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $int2$20000 = SubLObjectFactory.makeInteger(20000);
        $str3$constant_index = SubLObjectFactory.makeString("constant-index");
        $sym4$LOAD_CONSTANT_INDEX_FROM_CACHE = SubLObjectFactory.makeSymbol("LOAD-CONSTANT-INDEX-FROM-CACHE");
        $kw5$CIM = SubLObjectFactory.makeKeyword("CIM");
        $sym6$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $sym7$WITH_KBOM_FULLY_LOADED = SubLObjectFactory.makeSymbol("WITH-KBOM-FULLY-LOADED");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CONSTANT-INDEX-MANAGER*"));
        $str9$indices = SubLObjectFactory.makeString("indices");
        $str10$indices_index = SubLObjectFactory.makeString("indices-index");
        $str11$constant_complex_indices = SubLObjectFactory.makeString("constant-complex-indices");
        $str12$constant_complex_indices_index = SubLObjectFactory.makeString("constant-complex-indices-index");
        $str13$cim = SubLObjectFactory.makeString("cim");
        $str14$ccim = SubLObjectFactory.makeString("ccim");
        $kw15$CONSTANT_INDEX = SubLObjectFactory.makeKeyword("CONSTANT-INDEX");
    }
}
