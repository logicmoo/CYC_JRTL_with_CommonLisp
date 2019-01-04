package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class mt_relevance_cache extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.mt_relevance_cache";
    public static final String myFingerPrint = "58a1c8dd59f16a3f6a46f274e218d29563bab55951059b2f081a01d6f1559e23";
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-cache.lisp", position = 3528L)
    private static SubLSymbol $mt_relevance_cache_unknown$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-cache.lisp", position = 5661L)
    private static SubLSymbol $monad_mt_fort_cache$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-cache.lisp", position = 6242L)
    private static SubLSymbol $monad_mt_naut_cache$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-cache.lisp", position = 6824L)
    private static SubLSymbol $time_mt_cache$;
    private static final SubLSymbol $kw0$UNKNOWN;
    private static final SubLString $str1$Unsupported_Mt_relevance_cache_ty;
    private static final SubLString $str2$Corrupt_entry_in_Mt_relevance_cac;
    private static final SubLString $str3$Previous_entry_for__s_corrupt___R;
    private static final SubLSymbol $sym4$_MONAD_MT_FORT_CACHE_;
    private static final SubLInteger $int5$256;
    private static final SubLSymbol $sym6$_MONAD_MT_NAUT_CACHE_;
    private static final SubLSymbol $sym7$_TIME_MT_CACHE_;
    private static final SubLInteger $int8$1024;
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-cache.lisp", position = 1045L)
    public static SubLObject basemtP(SubLObject mt, SubLObject basemt) {
        if (mt_relevance_cache.NIL != hlmt.hlmt_temporal_mt(mt) && mt_relevance_cache.NIL != hlmt.hlmt_temporal_mt(basemt)) {
            mt = bind_mt_indexicals(mt);
            basemt = bind_mt_indexicals(basemt);
        }
        if (mt_relevance_cache.NIL != hlmt.hlmts_supportedP()) {
            return (mt_relevance_cache.NIL != forts.fort_p(mt) && mt_relevance_cache.NIL != forts.fort_p(basemt)) ? monad_basemtP(mt, basemt) : hlmt_basemtP(mt, basemt);
        }
        return monad_basemtP(mt, basemt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-cache.lisp", position = 1713L)
    public static SubLObject clear_mt_relevance_cache() {
        clear_monad_mt_fort_cache();
        clear_monad_mt_naut_cache();
        if (mt_relevance_cache.NIL != hlmt.hlmts_supportedP()) {
            clear_time_mt_cache();
        }
        return (SubLObject)mt_relevance_cache.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-cache.lisp", position = 1949L)
    public static SubLObject update_mt_relevance_cache(final SubLObject argument, final SubLObject assertion) {
        return clear_mt_relevance_cache();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-cache.lisp", position = 2200L)
    public static SubLObject bind_mt_indexicals(SubLObject mt) {
        if (mt_relevance_cache.NIL == forts.fort_p(mt)) {
            mt = date_utilities.possibly_bind_temporal_indexical_in_object(mt);
        }
        return mt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-cache.lisp", position = 2402L)
    public static SubLObject monad_basemtP(final SubLObject mt, final SubLObject basemt) {
        if (mt.equal(basemt)) {
            return (SubLObject)mt_relevance_cache.T;
        }
        if (mt_relevance_cache.NIL != forts.fort_p(mt) && mt_relevance_cache.NIL != forts.fort_p(basemt)) {
            return monad_mt_fort_cache_base_mt(mt, basemt);
        }
        return monad_mt_naut_cache_base_mt(mt, basemt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-cache.lisp", position = 2633L)
    public static SubLObject hlmt_basemtP(final SubLObject mt, final SubLObject basemt) {
        if (mt.equal(basemt)) {
            return (SubLObject)mt_relevance_cache.T;
        }
        if (mt_relevance_cache.NIL != hlmt.monad_mt_p(mt) && mt_relevance_cache.NIL != hlmt.monad_mt_p(basemt)) {
            return monad_basemtP(mt, basemt);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(mt_relevance_cache.NIL != monad_basemtP(hlmt.hlmt_monad_mt(mt), hlmt.hlmt_monad_mt(basemt)) && mt_relevance_cache.NIL != non_monad_basemtP(mt, basemt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-cache.lisp", position = 2918L)
    public static SubLObject non_monad_basemtP(final SubLObject mt, final SubLObject basemt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject failureP = (SubLObject)mt_relevance_cache.NIL;
        final SubLObject mt_time = hlmt.hlmt_temporal_mt(mt);
        final SubLObject basemt_time = hlmt.hlmt_temporal_mt(basemt);
        final SubLObject mt_monad = hlmt.hlmt_monad_mt(mt);
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt_monad);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (mt_relevance_cache.NIL == time_basemtP(mt_time, basemt_time)) {
                failureP = (SubLObject)mt_relevance_cache.T;
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(mt_relevance_cache.NIL == failureP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-cache.lisp", position = 3337L)
    public static SubLObject time_basemtP(final SubLObject mt, final SubLObject basemt) {
        if (mt_relevance_cache.NIL == basemt) {
            return (SubLObject)mt_relevance_cache.T;
        }
        if (mt.equal(basemt)) {
            return (SubLObject)mt_relevance_cache.T;
        }
        return time_mt_cache_base_mt(mt, basemt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-cache.lisp", position = 3706L)
    public static SubLObject mt_relevance_cache_unknown_p(final SubLObject v_object) {
        return Equality.eql(v_object, mt_relevance_cache.$mt_relevance_cache_unknown$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-cache.lisp", position = 3812L)
    public static SubLObject mt_relevance_cache_get(final SubLObject v_cache, final SubLObject key) {
        if (mt_relevance_cache.NIL != cache.cache_p(v_cache)) {
            return cache.cache_get(v_cache, key);
        }
        if (v_cache.isHashtable()) {
            return Hashtables.gethash(key, v_cache, (SubLObject)mt_relevance_cache.UNPROVIDED);
        }
        return Errors.error((SubLObject)mt_relevance_cache.$str1$Unsupported_Mt_relevance_cache_ty);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-cache.lisp", position = 4041L)
    public static SubLObject mt_relevance_cache_set(final SubLObject v_cache, final SubLObject key, final SubLObject value) {
        if (mt_relevance_cache.NIL != cache.cache_p(v_cache)) {
            return cache.cache_set(v_cache, key, value);
        }
        if (v_cache.isHashtable()) {
            return Hashtables.sethash(key, v_cache, value);
        }
        return Errors.error((SubLObject)mt_relevance_cache.$str1$Unsupported_Mt_relevance_cache_ty);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-cache.lisp", position = 4287L)
    public static SubLObject mt_relevance_cache_remove(final SubLObject v_cache, final SubLObject key) {
        if (mt_relevance_cache.NIL != cache.cache_p(v_cache)) {
            return cache.cache_remove(v_cache, key);
        }
        if (v_cache.isHashtable()) {
            return Hashtables.remhash(key, v_cache);
        }
        return Errors.error((SubLObject)mt_relevance_cache.$str1$Unsupported_Mt_relevance_cache_ty);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-cache.lisp", position = 4521L)
    public static SubLObject mt_relevance_cache_base_mt(final SubLObject mt, final SubLObject basemt, final SubLObject v_cache, final SubLObject test) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject value = mt_relevance_cache_get(v_cache, mt);
        final SubLObject entryP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (!value.isVector()) {
            if (mt_relevance_cache.NIL != entryP) {
                Errors.warn((SubLObject)mt_relevance_cache.$str2$Corrupt_entry_in_Mt_relevance_cac, mt);
                mt_relevance_cache_remove(v_cache, mt);
            }
            return mt_relevance_cache.$mt_relevance_cache_unknown$.getGlobalValue();
        }
        final SubLObject v_genl_mts = Vectors.aref(value, (SubLObject)mt_relevance_cache.ZERO_INTEGER);
        final SubLObject not_genl_mts = Vectors.aref(value, (SubLObject)mt_relevance_cache.ONE_INTEGER);
        if (mt_relevance_cache.NIL != set_contents.set_contents_memberP(basemt, v_genl_mts, test)) {
            return (SubLObject)mt_relevance_cache.T;
        }
        if (mt_relevance_cache.NIL != set_contents.set_contents_memberP(basemt, not_genl_mts, test)) {
            return (SubLObject)mt_relevance_cache.NIL;
        }
        return mt_relevance_cache.$mt_relevance_cache_unknown$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-cache.lisp", position = 5147L)
    public static SubLObject mt_relevance_cache_update(final SubLObject mt, final SubLObject basemt, final SubLObject genl_mtP, final SubLObject v_cache, final SubLObject test) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject value = mt_relevance_cache_get(v_cache, mt);
        final SubLObject entryP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (!value.isVector()) {
            if (mt_relevance_cache.NIL != entryP) {
                Errors.warn((SubLObject)mt_relevance_cache.$str3$Previous_entry_for__s_corrupt___R, mt);
            }
            value = Vectors.make_vector((SubLObject)mt_relevance_cache.TWO_INTEGER, (SubLObject)mt_relevance_cache.UNPROVIDED);
            mt_relevance_cache_set(v_cache, mt, value);
        }
        if (mt_relevance_cache.NIL != genl_mtP) {
            Vectors.set_aref(value, (SubLObject)mt_relevance_cache.ZERO_INTEGER, set_contents.set_contents_add(basemt, Vectors.aref(value, (SubLObject)mt_relevance_cache.ZERO_INTEGER), test));
        }
        else {
            Vectors.set_aref(value, (SubLObject)mt_relevance_cache.ONE_INTEGER, set_contents.set_contents_add(basemt, Vectors.aref(value, (SubLObject)mt_relevance_cache.ONE_INTEGER), test));
        }
        return (SubLObject)mt_relevance_cache.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-cache.lisp", position = 5797L)
    public static SubLObject monad_mt_fort_cache_base_mt(final SubLObject mt, final SubLObject basemt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject v_genl_mts = cache.cache_get(mt_relevance_cache.$monad_mt_fort_cache$.getGlobalValue(), mt);
        final SubLObject entryP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (mt_relevance_cache.NIL == entryP) {
            v_genl_mts = set_utilities.construct_set_contents_from_list(genl_mts.all_genl_mts(mt, (SubLObject)mt_relevance_cache.UNPROVIDED, (SubLObject)mt_relevance_cache.UNPROVIDED), Symbols.symbol_function((SubLObject)mt_relevance_cache.EQL), (SubLObject)mt_relevance_cache.UNPROVIDED);
            cache.cache_set(mt_relevance_cache.$monad_mt_fort_cache$.getGlobalValue(), mt, v_genl_mts);
        }
        return set_contents.set_contents_memberP(basemt, v_genl_mts, Symbols.symbol_function((SubLObject)mt_relevance_cache.EQL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-cache.lisp", position = 6151L)
    public static SubLObject clear_monad_mt_fort_cache() {
        return cache.cache_clear(mt_relevance_cache.$monad_mt_fort_cache$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-cache.lisp", position = 6380L)
    public static SubLObject monad_mt_naut_cache_base_mt(final SubLObject mt, final SubLObject basemt) {
        SubLObject genl_mtP = mt_relevance_cache_base_mt(mt, basemt, mt_relevance_cache.$monad_mt_naut_cache$.getGlobalValue(), Symbols.symbol_function((SubLObject)mt_relevance_cache.EQUAL));
        if (mt_relevance_cache.NIL != mt_relevance_cache_unknown_p(genl_mtP)) {
            genl_mtP = genl_mts.monad_genl_mtP(mt, basemt, (SubLObject)mt_relevance_cache.UNPROVIDED, (SubLObject)mt_relevance_cache.UNPROVIDED);
            mt_relevance_cache_update(mt, basemt, genl_mtP, mt_relevance_cache.$monad_mt_naut_cache$.getGlobalValue(), Symbols.symbol_function((SubLObject)mt_relevance_cache.EQUAL));
        }
        return genl_mtP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-cache.lisp", position = 6733L)
    public static SubLObject clear_monad_mt_naut_cache() {
        return cache.cache_clear(mt_relevance_cache.$monad_mt_naut_cache$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-cache.lisp", position = 6824L)
    public static SubLObject time_mt_cache_base_mt(final SubLObject mt, final SubLObject basemt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cached_value = mt_relevance_cache_base_mt(mt, basemt, mt_relevance_cache.$time_mt_cache$.getGlobalValue(), Symbols.symbol_function((SubLObject)mt_relevance_cache.EQUAL));
        if (mt_relevance_cache.NIL != mt_relevance_cache_unknown_p(cached_value)) {
            SubLObject mt_time_index = (SubLObject)mt_relevance_cache.NIL;
            SubLObject mt_time_param = (SubLObject)mt_relevance_cache.NIL;
            thread.resetMultipleValues();
            final SubLObject mt_time_index_$1 = hlmt.explode_hlmt_temporal_facets(mt, hlmt.$default_mt_time_interval$.getGlobalValue(), hlmt.$default_temporal_mt_time_parameter$.getGlobalValue());
            final SubLObject mt_time_param_$2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            mt_time_index = mt_time_index_$1;
            mt_time_param = mt_time_param_$2;
            SubLObject basemt_time_index = (SubLObject)mt_relevance_cache.NIL;
            SubLObject basemt_time_param = (SubLObject)mt_relevance_cache.NIL;
            thread.resetMultipleValues();
            final SubLObject basemt_time_index_$3 = hlmt.explode_hlmt_temporal_facets(basemt, hlmt.$default_mt_time_interval$.getGlobalValue(), hlmt.$default_temporal_mt_time_parameter$.getGlobalValue());
            final SubLObject basemt_time_param_$4 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            basemt_time_index = basemt_time_index_$3;
            basemt_time_param = basemt_time_param_$4;
            final SubLObject genl_mtP = hlmt_relevance.mt_times_visible_p(mt_time_index, basemt_time_index, mt_time_param, basemt_time_param);
            mt_relevance_cache_update(mt, basemt, genl_mtP, mt_relevance_cache.$time_mt_cache$.getGlobalValue(), Symbols.symbol_function((SubLObject)mt_relevance_cache.EQUAL));
            return genl_mtP;
        }
        return cached_value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-cache.lisp", position = 6824L)
    public static SubLObject clear_time_mt_cache() {
        return cache.cache_clear(mt_relevance_cache.$time_mt_cache$.getGlobalValue());
    }
    
    public static SubLObject declare_mt_relevance_cache_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_cache", "basemtP", "BASEMT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_cache", "clear_mt_relevance_cache", "CLEAR-MT-RELEVANCE-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_cache", "update_mt_relevance_cache", "UPDATE-MT-RELEVANCE-CACHE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_cache", "bind_mt_indexicals", "BIND-MT-INDEXICALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_cache", "monad_basemtP", "MONAD-BASEMT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_cache", "hlmt_basemtP", "HLMT-BASEMT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_cache", "non_monad_basemtP", "NON-MONAD-BASEMT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_cache", "time_basemtP", "TIME-BASEMT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_cache", "mt_relevance_cache_unknown_p", "MT-RELEVANCE-CACHE-UNKNOWN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_cache", "mt_relevance_cache_get", "MT-RELEVANCE-CACHE-GET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_cache", "mt_relevance_cache_set", "MT-RELEVANCE-CACHE-SET", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_cache", "mt_relevance_cache_remove", "MT-RELEVANCE-CACHE-REMOVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_cache", "mt_relevance_cache_base_mt", "MT-RELEVANCE-CACHE-BASE-MT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_cache", "mt_relevance_cache_update", "MT-RELEVANCE-CACHE-UPDATE", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_cache", "monad_mt_fort_cache_base_mt", "MONAD-MT-FORT-CACHE-BASE-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_cache", "clear_monad_mt_fort_cache", "CLEAR-MONAD-MT-FORT-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_cache", "monad_mt_naut_cache_base_mt", "MONAD-MT-NAUT-CACHE-BASE-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_cache", "clear_monad_mt_naut_cache", "CLEAR-MONAD-MT-NAUT-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_cache", "time_mt_cache_base_mt", "TIME-MT-CACHE-BASE-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_cache", "clear_time_mt_cache", "CLEAR-TIME-MT-CACHE", 0, 0, false);
        return (SubLObject)mt_relevance_cache.NIL;
    }
    
    public static SubLObject init_mt_relevance_cache_file() {
        mt_relevance_cache.$mt_relevance_cache_unknown$ = SubLFiles.deflexical("*MT-RELEVANCE-CACHE-UNKNOWN*", (SubLObject)mt_relevance_cache.$kw0$UNKNOWN);
        mt_relevance_cache.$monad_mt_fort_cache$ = SubLFiles.deflexical("*MONAD-MT-FORT-CACHE*", (mt_relevance_cache.NIL != Symbols.boundp((SubLObject)mt_relevance_cache.$sym4$_MONAD_MT_FORT_CACHE_)) ? mt_relevance_cache.$monad_mt_fort_cache$.getGlobalValue() : cache.new_cache((SubLObject)mt_relevance_cache.$int5$256, Symbols.symbol_function((SubLObject)mt_relevance_cache.EQL)));
        mt_relevance_cache.$monad_mt_naut_cache$ = SubLFiles.deflexical("*MONAD-MT-NAUT-CACHE*", (mt_relevance_cache.NIL != Symbols.boundp((SubLObject)mt_relevance_cache.$sym6$_MONAD_MT_NAUT_CACHE_)) ? mt_relevance_cache.$monad_mt_naut_cache$.getGlobalValue() : cache.new_cache((SubLObject)mt_relevance_cache.$int5$256, Symbols.symbol_function((SubLObject)mt_relevance_cache.EQUAL)));
        mt_relevance_cache.$time_mt_cache$ = SubLFiles.deflexical("*TIME-MT-CACHE*", (mt_relevance_cache.NIL != Symbols.boundp((SubLObject)mt_relevance_cache.$sym7$_TIME_MT_CACHE_)) ? mt_relevance_cache.$time_mt_cache$.getGlobalValue() : cache.new_cache((SubLObject)mt_relevance_cache.$int8$1024, Symbols.symbol_function((SubLObject)mt_relevance_cache.EQUAL)));
        return (SubLObject)mt_relevance_cache.NIL;
    }
    
    public static SubLObject setup_mt_relevance_cache_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)mt_relevance_cache.$sym4$_MONAD_MT_FORT_CACHE_);
        subl_macro_promotions.declare_defglobal((SubLObject)mt_relevance_cache.$sym6$_MONAD_MT_NAUT_CACHE_);
        subl_macro_promotions.declare_defglobal((SubLObject)mt_relevance_cache.$sym7$_TIME_MT_CACHE_);
        return (SubLObject)mt_relevance_cache.NIL;
    }
    
    public void declareFunctions() {
        declare_mt_relevance_cache_file();
    }
    
    public void initializeVariables() {
        init_mt_relevance_cache_file();
    }
    
    public void runTopLevelForms() {
        setup_mt_relevance_cache_file();
    }
    
    static {
        me = (SubLFile)new mt_relevance_cache();
        mt_relevance_cache.$mt_relevance_cache_unknown$ = null;
        mt_relevance_cache.$monad_mt_fort_cache$ = null;
        mt_relevance_cache.$monad_mt_naut_cache$ = null;
        mt_relevance_cache.$time_mt_cache$ = null;
        $kw0$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $str1$Unsupported_Mt_relevance_cache_ty = SubLObjectFactory.makeString("Unsupported Mt relevance cache type.");
        $str2$Corrupt_entry_in_Mt_relevance_cac = SubLObjectFactory.makeString("Corrupt entry in Mt relevance cache for ~s.  Removing entry.");
        $str3$Previous_entry_for__s_corrupt___R = SubLObjectFactory.makeString("Previous entry for ~s corrupt.  Replacing entry.");
        $sym4$_MONAD_MT_FORT_CACHE_ = SubLObjectFactory.makeSymbol("*MONAD-MT-FORT-CACHE*");
        $int5$256 = SubLObjectFactory.makeInteger(256);
        $sym6$_MONAD_MT_NAUT_CACHE_ = SubLObjectFactory.makeSymbol("*MONAD-MT-NAUT-CACHE*");
        $sym7$_TIME_MT_CACHE_ = SubLObjectFactory.makeSymbol("*TIME-MT-CACHE*");
        $int8$1024 = SubLObjectFactory.makeInteger(1024);
    }
}

/*

	Total time: 131 ms
	
*/