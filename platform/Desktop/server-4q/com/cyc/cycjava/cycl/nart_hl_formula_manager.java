package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class nart_hl_formula_manager extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.nart_hl_formula_manager";
    public static final String myFingerPrint = "57f8162b5328e6c283621e3319dd5d2bdad15683ffa444695cc0b10bf1fa7b12";
    @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 860L)
    public static SubLSymbol $nart_hl_formula_manager$;
    @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 1065L)
    private static SubLSymbol $nart_hl_formula_lru_size_percentage$;
    @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 1181L)
    private static SubLSymbol $nart_hl_formula_lru_size_max$;
    @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 5817L)
    private static SubLSymbol $nart_hl_formula_table$;
    private static final SubLSymbol $sym0$_NART_HL_FORMULA_MANAGER_;
    private static final SubLSymbol $kw1$UNINITIALIZED;
    private static final SubLInteger $int2$10000;
    private static final SubLString $str3$nart_hl_formula;
    private static final SubLSymbol $sym4$LOAD_NART_HL_FORMULA_FROM_CACHE;
    private static final SubLSymbol $kw5$NHM;
    private static final SubLSymbol $sym6$_EXIT;
    private static final SubLString $str7$nart_hl_formula_index;
    private static final SubLSymbol $sym8$_NART_HL_FORMULA_TABLE_;
    private static final SubLSymbol $sym9$POSSIBLY_INITIALIZE_NART_HL_FORMULA_MANAGER_FROM_LEGACY_WORLD;
    private static final SubLInteger $int10$100;
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 1367L)
    public static SubLObject setup_nart_hl_formula_table(final SubLObject size, final SubLObject exactP) {
        nart_hl_formula_manager.$nart_hl_formula_manager$.setGlobalValue(kb_object_manager.new_kb_object_manager((SubLObject)nart_hl_formula_manager.$str3$nart_hl_formula, size, nart_hl_formula_manager.$nart_hl_formula_lru_size_percentage$.getGlobalValue(), nart_hl_formula_manager.$nart_hl_formula_lru_size_max$.getGlobalValue(), (SubLObject)nart_hl_formula_manager.$sym4$LOAD_NART_HL_FORMULA_FROM_CACHE, exactP));
        return (SubLObject)nart_hl_formula_manager.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 1648L)
    public static SubLObject resize_nart_hl_formula_kbom_lru(SubLObject percentage, SubLObject max) {
        if (percentage == nart_hl_formula_manager.UNPROVIDED) {
            percentage = (SubLObject)nart_hl_formula_manager.NIL;
        }
        if (max == nart_hl_formula_manager.UNPROVIDED) {
            max = (SubLObject)nart_hl_formula_manager.NIL;
        }
        if (nart_hl_formula_manager.NIL == percentage) {
            percentage = nart_hl_formula_manager.$nart_hl_formula_lru_size_percentage$.getGlobalValue();
        }
        if (nart_hl_formula_manager.NIL == max) {
            max = nart_hl_formula_manager.$nart_hl_formula_lru_size_max$.getGlobalValue();
        }
        return kb_object_manager.resize_kbom_lru_cache_from_percentage_and_max(nart_hl_formula_manager.$nart_hl_formula_manager$.getGlobalValue(), percentage, max);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 2068L)
    public static SubLObject optimize_nart_hl_formula_table(final SubLObject new_nart_hl_formula_id_threshold) {
        return kb_object_manager.optimize_kb_object_content_table(nart_hl_formula_manager.$nart_hl_formula_manager$.getGlobalValue(), new_nart_hl_formula_id_threshold);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 2256L)
    public static SubLObject clear_nart_hl_formula_table() {
        return kb_object_manager.clear_kb_object_content_table(nart_hl_formula_manager.$nart_hl_formula_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 2373L)
    public static SubLObject maintain_nart_hl_formula_usage_counts() {
        return kb_object_manager.maintain_kb_object_usage_counts(nart_hl_formula_manager.$nart_hl_formula_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 2556L)
    public static SubLObject dont_maintain_nart_hl_formula_usage_counts() {
        return kb_object_manager.dont_maintain_kb_object_usage_counts(nart_hl_formula_manager.$nart_hl_formula_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 2750L)
    public static SubLObject nart_hl_formula_usage_counts_enabled_p() {
        return kb_object_manager.kb_object_usage_counts_enabledP(nart_hl_formula_manager.$nart_hl_formula_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 2961L)
    public static SubLObject cached_nart_hl_formula_count() {
        return kb_object_manager.cached_kb_object_count(nart_hl_formula_manager.$nart_hl_formula_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 3343L)
    public static SubLObject nart_hl_formula_completely_cachedP() {
        return Numbers.numE(nart_handles.nart_count(), cached_nart_hl_formula_count());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 3457L)
    public static SubLObject lookup_nart_hl_formula(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding(thread);
        try {
            kb_storage_logging.$kb_storage_client$.bind(kb_storage_logging.add_kb_storage_logging_add_tag((SubLObject)nart_hl_formula_manager.$kw5$NHM), thread);
            return kb_object_manager.lookup_kb_object_content(nart_hl_formula_manager.$nart_hl_formula_manager$.getGlobalValue(), id);
        }
        finally {
            kb_storage_logging.$kb_storage_client$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 3605L)
    public static SubLObject get_file_backed_nart_id_threshold() {
        return kb_object_manager.get_file_backed_kb_object_id_threshold(nart_hl_formula_manager.$nart_hl_formula_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 3737L)
    public static SubLObject nart_hl_formulas_unbuiltP() {
        if (nart_handles.nart_count().isZero()) {
            return (SubLObject)nart_hl_formula_manager.NIL;
        }
        return kb_object_manager.kb_object_manager_unbuiltP(nart_hl_formula_manager.$nart_hl_formula_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 3894L)
    public static SubLObject register_nart_hl_formula(final SubLObject id, final SubLObject nart_hl_formula) {
        return kb_object_manager.register_kb_object_content(nart_hl_formula_manager.$nart_hl_formula_manager$.getGlobalValue(), id, nart_hl_formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 4127L)
    public static SubLObject deregister_nart_hl_formula(final SubLObject id) {
        return kb_object_manager.deregister_kb_object_content(nart_hl_formula_manager.$nart_hl_formula_manager$.getGlobalValue(), id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 4303L)
    public static SubLObject mark_nart_hl_formula_as_muted(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding(thread);
        try {
            kb_storage_logging.$kb_storage_client$.bind(kb_storage_logging.add_kb_storage_logging_add_tag((SubLObject)nart_hl_formula_manager.$kw5$NHM), thread);
            return kb_object_manager.mark_kb_object_content_as_muted(nart_hl_formula_manager.$nart_hl_formula_manager$.getGlobalValue(), id);
        }
        finally {
            kb_storage_logging.$kb_storage_client$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 4489L)
    public static SubLObject meter_nart_hl_formula_swap_time() {
        return kb_object_manager.meter_kb_object_content_swap_time(nart_hl_formula_manager.$nart_hl_formula_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 4670L)
    public static SubLObject dont_meter_nart_hl_formula_swap_time() {
        return kb_object_manager.dont_meter_kb_object_content_swap_time(nart_hl_formula_manager.$nart_hl_formula_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 4862L)
    public static SubLObject clear_nart_hl_formula_swap_time() {
        return kb_object_manager.clear_kb_object_content_swap_time(nart_hl_formula_manager.$nart_hl_formula_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 5034L)
    public static SubLObject current_nart_hl_formula_swap_time() {
        return kb_object_manager.kb_object_manager_swap_time(nart_hl_formula_manager.$nart_hl_formula_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 5305L)
    public static SubLObject swap_out_all_pristine_nart_hl_formulas() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding(thread);
        try {
            kb_storage_logging.$kb_storage_client$.bind(kb_storage_logging.add_kb_storage_logging_add_tag((SubLObject)nart_hl_formula_manager.$kw5$NHM), thread);
            return kb_object_manager.safely_swap_out_all_pristine_kb_objects(nart_hl_formula_manager.$nart_hl_formula_manager$.getGlobalValue());
        }
        finally {
            kb_storage_logging.$kb_storage_client$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 5479L)
    public static SubLObject initialize_nart_hl_formula_hl_store_cache() {
        return kb_object_manager.initialize_kb_object_hl_store_cache(nart_hl_formula_manager.$nart_hl_formula_manager$.getGlobalValue(), (SubLObject)nart_hl_formula_manager.$str3$nart_hl_formula, (SubLObject)nart_hl_formula_manager.$str7$nart_hl_formula_index, (SubLObject)nart_hl_formula_manager.UNPROVIDED, (SubLObject)nart_hl_formula_manager.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 5658L)
    public static SubLObject nart_hl_formula_table_initializedP() {
        return misc_utilities.initialized_p(nart_hl_formula_manager.$nart_hl_formula_manager$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 5866L)
    public static SubLObject possibly_initialize_nart_hl_formula_manager_from_legacy_world() {
        if (nart_hl_formula_manager.$kw1$UNINITIALIZED == nart_hl_formula_manager.$nart_hl_formula_manager$.getGlobalValue()) {
            final SubLObject size = id_index.id_index_sparse_id_threshold(nart_hl_formula_manager.$nart_hl_formula_table$.getGlobalValue());
            final SubLObject lru_size = Numbers.min(nart_hl_formula_manager.$nart_hl_formula_lru_size_max$.getGlobalValue(), Numbers.multiply(Numbers.integerDivide(size, (SubLObject)nart_hl_formula_manager.$int10$100), nart_hl_formula_manager.$nart_hl_formula_lru_size_percentage$.getGlobalValue()));
            final SubLObject lru_information = cache.new_cache(lru_size, (SubLObject)nart_hl_formula_manager.UNPROVIDED);
            nart_hl_formula_manager.$nart_hl_formula_manager$.setGlobalValue(kb_object_manager.new_legacy_kb_object_manager((SubLObject)nart_hl_formula_manager.$str3$nart_hl_formula, nart_hl_formula_manager.$nart_hl_formula_lru_size_percentage$.getGlobalValue(), nart_hl_formula_manager.$nart_hl_formula_lru_size_max$.getGlobalValue(), nart_hl_formula_manager.$nart_hl_formula_table$.getGlobalValue(), lru_information, (SubLObject)nart_hl_formula_manager.$kw1$UNINITIALIZED, (SubLObject)nart_hl_formula_manager.$sym4$LOAD_NART_HL_FORMULA_FROM_CACHE));
            return (SubLObject)nart_hl_formula_manager.T;
        }
        return (SubLObject)nart_hl_formula_manager.NIL;
    }
    
    public static SubLObject declare_nart_hl_formula_manager_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_hl_formula_manager", "setup_nart_hl_formula_table", "SETUP-NART-HL-FORMULA-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_hl_formula_manager", "resize_nart_hl_formula_kbom_lru", "RESIZE-NART-HL-FORMULA-KBOM-LRU", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_hl_formula_manager", "optimize_nart_hl_formula_table", "OPTIMIZE-NART-HL-FORMULA-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_hl_formula_manager", "clear_nart_hl_formula_table", "CLEAR-NART-HL-FORMULA-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_hl_formula_manager", "maintain_nart_hl_formula_usage_counts", "MAINTAIN-NART-HL-FORMULA-USAGE-COUNTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_hl_formula_manager", "dont_maintain_nart_hl_formula_usage_counts", "DONT-MAINTAIN-NART-HL-FORMULA-USAGE-COUNTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_hl_formula_manager", "nart_hl_formula_usage_counts_enabled_p", "NART-HL-FORMULA-USAGE-COUNTS-ENABLED-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_hl_formula_manager", "cached_nart_hl_formula_count", "CACHED-NART-HL-FORMULA-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_hl_formula_manager", "nart_hl_formula_completely_cachedP", "NART-HL-FORMULA-COMPLETELY-CACHED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_hl_formula_manager", "lookup_nart_hl_formula", "LOOKUP-NART-HL-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_hl_formula_manager", "get_file_backed_nart_id_threshold", "GET-FILE-BACKED-NART-ID-THRESHOLD", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_hl_formula_manager", "nart_hl_formulas_unbuiltP", "NART-HL-FORMULAS-UNBUILT?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_hl_formula_manager", "register_nart_hl_formula", "REGISTER-NART-HL-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_hl_formula_manager", "deregister_nart_hl_formula", "DEREGISTER-NART-HL-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_hl_formula_manager", "mark_nart_hl_formula_as_muted", "MARK-NART-HL-FORMULA-AS-MUTED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_hl_formula_manager", "meter_nart_hl_formula_swap_time", "METER-NART-HL-FORMULA-SWAP-TIME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_hl_formula_manager", "dont_meter_nart_hl_formula_swap_time", "DONT-METER-NART-HL-FORMULA-SWAP-TIME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_hl_formula_manager", "clear_nart_hl_formula_swap_time", "CLEAR-NART-HL-FORMULA-SWAP-TIME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_hl_formula_manager", "current_nart_hl_formula_swap_time", "CURRENT-NART-HL-FORMULA-SWAP-TIME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_hl_formula_manager", "swap_out_all_pristine_nart_hl_formulas", "SWAP-OUT-ALL-PRISTINE-NART-HL-FORMULAS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_hl_formula_manager", "initialize_nart_hl_formula_hl_store_cache", "INITIALIZE-NART-HL-FORMULA-HL-STORE-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_hl_formula_manager", "nart_hl_formula_table_initializedP", "NART-HL-FORMULA-TABLE-INITIALIZED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_hl_formula_manager", "possibly_initialize_nart_hl_formula_manager_from_legacy_world", "POSSIBLY-INITIALIZE-NART-HL-FORMULA-MANAGER-FROM-LEGACY-WORLD", 0, 0, false);
        return (SubLObject)nart_hl_formula_manager.NIL;
    }
    
    public static SubLObject init_nart_hl_formula_manager_file() {
        nart_hl_formula_manager.$nart_hl_formula_manager$ = SubLFiles.deflexical("*NART-HL-FORMULA-MANAGER*", (SubLObject)((nart_hl_formula_manager.NIL != Symbols.boundp((SubLObject)nart_hl_formula_manager.$sym0$_NART_HL_FORMULA_MANAGER_)) ? nart_hl_formula_manager.$nart_hl_formula_manager$.getGlobalValue() : nart_hl_formula_manager.$kw1$UNINITIALIZED));
        nart_hl_formula_manager.$nart_hl_formula_lru_size_percentage$ = SubLFiles.deflexical("*NART-HL-FORMULA-LRU-SIZE-PERCENTAGE*", (SubLObject)nart_hl_formula_manager.FIVE_INTEGER);
        nart_hl_formula_manager.$nart_hl_formula_lru_size_max$ = SubLFiles.deflexical("*NART-HL-FORMULA-LRU-SIZE-MAX*", (SubLObject)nart_hl_formula_manager.$int2$10000);
        nart_hl_formula_manager.$nart_hl_formula_table$ = SubLFiles.deflexical("*NART-HL-FORMULA-TABLE*", (SubLObject)((nart_hl_formula_manager.NIL != Symbols.boundp((SubLObject)nart_hl_formula_manager.$sym8$_NART_HL_FORMULA_TABLE_)) ? nart_hl_formula_manager.$nart_hl_formula_table$.getGlobalValue() : nart_hl_formula_manager.NIL));
        return (SubLObject)nart_hl_formula_manager.NIL;
    }
    
    public static SubLObject setup_nart_hl_formula_manager_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)nart_hl_formula_manager.$sym0$_NART_HL_FORMULA_MANAGER_);
        subl_macro_promotions.declare_defglobal((SubLObject)nart_hl_formula_manager.$sym8$_NART_HL_FORMULA_TABLE_);
        access_macros.define_obsolete_register((SubLObject)nart_hl_formula_manager.$sym9$POSSIBLY_INITIALIZE_NART_HL_FORMULA_MANAGER_FROM_LEGACY_WORLD, (SubLObject)nart_hl_formula_manager.NIL);
        return (SubLObject)nart_hl_formula_manager.NIL;
    }
    
    public void declareFunctions() {
        declare_nart_hl_formula_manager_file();
    }
    
    public void initializeVariables() {
        init_nart_hl_formula_manager_file();
    }
    
    public void runTopLevelForms() {
        setup_nart_hl_formula_manager_file();
    }
    
    static {
        me = (SubLFile)new nart_hl_formula_manager();
        nart_hl_formula_manager.$nart_hl_formula_manager$ = null;
        nart_hl_formula_manager.$nart_hl_formula_lru_size_percentage$ = null;
        nart_hl_formula_manager.$nart_hl_formula_lru_size_max$ = null;
        nart_hl_formula_manager.$nart_hl_formula_table$ = null;
        $sym0$_NART_HL_FORMULA_MANAGER_ = SubLObjectFactory.makeSymbol("*NART-HL-FORMULA-MANAGER*");
        $kw1$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $int2$10000 = SubLObjectFactory.makeInteger(10000);
        $str3$nart_hl_formula = SubLObjectFactory.makeString("nart-hl-formula");
        $sym4$LOAD_NART_HL_FORMULA_FROM_CACHE = SubLObjectFactory.makeSymbol("LOAD-NART-HL-FORMULA-FROM-CACHE");
        $kw5$NHM = SubLObjectFactory.makeKeyword("NHM");
        $sym6$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $str7$nart_hl_formula_index = SubLObjectFactory.makeString("nart-hl-formula-index");
        $sym8$_NART_HL_FORMULA_TABLE_ = SubLObjectFactory.makeSymbol("*NART-HL-FORMULA-TABLE*");
        $sym9$POSSIBLY_INITIALIZE_NART_HL_FORMULA_MANAGER_FROM_LEGACY_WORLD = SubLObjectFactory.makeSymbol("POSSIBLY-INITIALIZE-NART-HL-FORMULA-MANAGER-FROM-LEGACY-WORLD");
        $int10$100 = SubLObjectFactory.makeInteger(100);
    }
}

/*

	Total time: 56 ms
	
*/