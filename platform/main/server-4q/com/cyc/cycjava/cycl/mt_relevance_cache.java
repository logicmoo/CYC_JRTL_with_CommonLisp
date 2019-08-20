/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.remhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
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


public final class mt_relevance_cache extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new mt_relevance_cache();



    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $mt_relevance_cache_unknown$ = makeSymbol("*MT-RELEVANCE-CACHE-UNKNOWN*");

    static private final SubLString $str1$Unsupported_Mt_relevance_cache_ty = makeString("Unsupported Mt relevance cache type.");

    static private final SubLString $str2$Corrupt_entry_in_Mt_relevance_cac = makeString("Corrupt entry in Mt relevance cache for ~s.  Removing entry.");

    static private final SubLString $str3$Previous_entry_for__s_corrupt___R = makeString("Previous entry for ~s corrupt.  Replacing entry.");

    public static final SubLSymbol $monad_mt_fort_cache$ = makeSymbol("*MONAD-MT-FORT-CACHE*");

    public static final SubLSymbol $monad_mt_naut_cache$ = makeSymbol("*MONAD-MT-NAUT-CACHE*");

    public static final SubLSymbol $time_mt_cache$ = makeSymbol("*TIME-MT-CACHE*");

    private static final SubLInteger $int$1024 = makeInteger(1024);

    // Definitions
    /**
     * optimized for kb-mapping: this assumes all baseMt assertions are visible in BaseKB
     */
    @LispMethod(comment = "optimized for kb-mapping: this assumes all baseMt assertions are visible in BaseKB")
    public static final SubLObject basemtP_alt(SubLObject mt, SubLObject basemt) {
        mt = com.cyc.cycjava.cycl.mt_relevance_cache.bind_mt_indexicals(mt);
        basemt = com.cyc.cycjava.cycl.mt_relevance_cache.bind_mt_indexicals(basemt);
        if (NIL != hlmt.hlmts_supportedP()) {
            return (NIL != forts.fort_p(mt)) && (NIL != forts.fort_p(basemt)) ? ((SubLObject) (com.cyc.cycjava.cycl.mt_relevance_cache.monad_basemtP(mt, basemt))) : com.cyc.cycjava.cycl.mt_relevance_cache.hlmt_basemtP(mt, basemt);
        } else {
            return com.cyc.cycjava.cycl.mt_relevance_cache.monad_basemtP(mt, basemt);
        }
    }

    // Definitions
    /**
     * optimized for kb-mapping: this assumes all baseMt assertions are visible in BaseKB
     */
    @LispMethod(comment = "optimized for kb-mapping: this assumes all baseMt assertions are visible in BaseKB")
    public static SubLObject basemtP(SubLObject mt, SubLObject basemt) {
        if ((NIL != hlmt.hlmt_temporal_mt(mt)) && (NIL != hlmt.hlmt_temporal_mt(basemt))) {
            mt = bind_mt_indexicals(mt);
            basemt = bind_mt_indexicals(basemt);
        }
        if (NIL != hlmt.hlmts_supportedP()) {
            return (NIL != forts.fort_p(mt)) && (NIL != forts.fort_p(basemt)) ? monad_basemtP(mt, basemt) : hlmt_basemtP(mt, basemt);
        }
        return monad_basemtP(mt, basemt);
    }

    /**
     * Clear the Mt relevance cache.
     */
    @LispMethod(comment = "Clear the Mt relevance cache.")
    public static final SubLObject clear_mt_relevance_cache_alt() {
        com.cyc.cycjava.cycl.mt_relevance_cache.clear_monad_mt_fort_cache();
        com.cyc.cycjava.cycl.mt_relevance_cache.clear_monad_mt_naut_cache();
        if (NIL != hlmt.hlmts_supportedP()) {
            com.cyc.cycjava.cycl.mt_relevance_cache.clear_time_mt_cache();
        }
        return T;
    }

    /**
     * Clear the Mt relevance cache.
     */
    @LispMethod(comment = "Clear the Mt relevance cache.")
    public static SubLObject clear_mt_relevance_cache() {
        clear_monad_mt_fort_cache();
        clear_monad_mt_naut_cache();
        if (NIL != hlmt.hlmts_supportedP()) {
            clear_time_mt_cache();
        }
        return T;
    }

    /**
     * Update the Mt relevance cache with information that ASSERTION is
     * being added to or removed from the KB.
     */
    @LispMethod(comment = "Update the Mt relevance cache with information that ASSERTION is\r\nbeing added to or removed from the KB.\nUpdate the Mt relevance cache with information that ASSERTION is\nbeing added to or removed from the KB.")
    public static final SubLObject update_mt_relevance_cache_alt(SubLObject argument, SubLObject assertion) {
        return com.cyc.cycjava.cycl.mt_relevance_cache.clear_mt_relevance_cache();
    }

    /**
     * Update the Mt relevance cache with information that ASSERTION is
     * being added to or removed from the KB.
     */
    @LispMethod(comment = "Update the Mt relevance cache with information that ASSERTION is\r\nbeing added to or removed from the KB.\nUpdate the Mt relevance cache with information that ASSERTION is\nbeing added to or removed from the KB.")
    public static SubLObject update_mt_relevance_cache(final SubLObject argument, final SubLObject assertion) {
        return clear_mt_relevance_cache();
    }

    public static final SubLObject bind_mt_indexicals_alt(SubLObject mt) {
        if (NIL == forts.fort_p(mt)) {
            mt = date_utilities.possibly_bind_temporal_indexical_in_object(mt);
        }
        return mt;
    }

    public static SubLObject bind_mt_indexicals(SubLObject mt) {
        if (NIL == forts.fort_p(mt)) {
            mt = date_utilities.possibly_bind_temporal_indexical_in_object(mt);
        }
        return mt;
    }

    public static final SubLObject monad_basemtP_alt(SubLObject mt, SubLObject basemt) {
        if (mt.equal(basemt)) {
            return T;
        } else {
            if ((NIL != forts.fort_p(mt)) && (NIL != forts.fort_p(basemt))) {
                return com.cyc.cycjava.cycl.mt_relevance_cache.monad_mt_fort_cache_base_mt(mt, basemt);
            } else {
                return com.cyc.cycjava.cycl.mt_relevance_cache.monad_mt_naut_cache_base_mt(mt, basemt);
            }
        }
    }

    public static SubLObject monad_basemtP(final SubLObject mt, final SubLObject basemt) {
        if (mt.equal(basemt)) {
            return T;
        }
        if ((NIL != forts.fort_p(mt)) && (NIL != forts.fort_p(basemt))) {
            return monad_mt_fort_cache_base_mt(mt, basemt);
        }
        return monad_mt_naut_cache_base_mt(mt, basemt);
    }

    public static final SubLObject hlmt_basemtP_alt(SubLObject mt, SubLObject basemt) {
        if (mt.equal(basemt)) {
            return T;
        } else {
            if ((NIL != hlmt.monad_mt_p(mt)) && (NIL != hlmt.monad_mt_p(basemt))) {
                return com.cyc.cycjava.cycl.mt_relevance_cache.monad_basemtP(mt, basemt);
            } else {
                return makeBoolean((NIL != com.cyc.cycjava.cycl.mt_relevance_cache.monad_basemtP(hlmt.hlmt_monad_mt(mt), hlmt.hlmt_monad_mt(basemt))) && (NIL != com.cyc.cycjava.cycl.mt_relevance_cache.non_monad_basemtP(mt, basemt)));
            }
        }
    }

    public static SubLObject hlmt_basemtP(final SubLObject mt, final SubLObject basemt) {
        if (mt.equal(basemt)) {
            return T;
        }
        if ((NIL != hlmt.monad_mt_p(mt)) && (NIL != hlmt.monad_mt_p(basemt))) {
            return monad_basemtP(mt, basemt);
        }
        return makeBoolean((NIL != monad_basemtP(hlmt.hlmt_monad_mt(mt), hlmt.hlmt_monad_mt(basemt))) && (NIL != non_monad_basemtP(mt, basemt)));
    }

    public static final SubLObject non_monad_basemtP_alt(SubLObject mt, SubLObject basemt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject failureP = NIL;
                SubLObject mt_time = hlmt.hlmt_temporal_mt(mt);
                SubLObject basemt_time = hlmt.hlmt_temporal_mt(basemt);
                SubLObject mt_monad = hlmt.hlmt_monad_mt(mt);
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt_monad);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        if (NIL == com.cyc.cycjava.cycl.mt_relevance_cache.time_basemtP(mt_time, basemt_time)) {
                            failureP = T;
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return makeBoolean(NIL == failureP);
            }
        }
    }

    public static SubLObject non_monad_basemtP(final SubLObject mt, final SubLObject basemt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject failureP = NIL;
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
            if (NIL == time_basemtP(mt_time, basemt_time)) {
                failureP = T;
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return makeBoolean(NIL == failureP);
    }

    public static final SubLObject time_basemtP_alt(SubLObject mt, SubLObject basemt) {
        if (NIL == basemt) {
            return T;
        } else {
            if (mt.equal(basemt)) {
                return T;
            } else {
                return com.cyc.cycjava.cycl.mt_relevance_cache.time_mt_cache_base_mt(mt, basemt);
            }
        }
    }

    public static SubLObject time_basemtP(final SubLObject mt, final SubLObject basemt) {
        if (NIL == basemt) {
            return T;
        }
        if (mt.equal(basemt)) {
            return T;
        }
        return time_mt_cache_base_mt(mt, basemt);
    }

    public static final SubLObject mt_relevance_cache_unknown_p_alt(SubLObject v_object) {
        return eq(v_object, $mt_relevance_cache_unknown$.getGlobalValue());
    }

    public static SubLObject mt_relevance_cache_unknown_p(final SubLObject v_object) {
        return eql(v_object, $mt_relevance_cache_unknown$.getGlobalValue());
    }

    public static final SubLObject mt_relevance_cache_get_alt(SubLObject v_cache, SubLObject key) {
        if (NIL != cache.cache_p(v_cache)) {
            return cache.cache_get(v_cache, key);
        } else {
            if (v_cache.isHashtable()) {
                return gethash(key, v_cache, UNPROVIDED);
            } else {
                return Errors.error($str_alt1$Unsupported_Mt_relevance_cache_ty);
            }
        }
    }

    public static SubLObject mt_relevance_cache_get(final SubLObject v_cache, final SubLObject key) {
        if (NIL != cache.cache_p(v_cache)) {
            return cache.cache_get(v_cache, key);
        }
        if (v_cache.isHashtable()) {
            return gethash(key, v_cache, UNPROVIDED);
        }
        return Errors.error($str1$Unsupported_Mt_relevance_cache_ty);
    }

    public static final SubLObject mt_relevance_cache_set_alt(SubLObject v_cache, SubLObject key, SubLObject value) {
        if (NIL != cache.cache_p(v_cache)) {
            return cache.cache_set(v_cache, key, value);
        } else {
            if (v_cache.isHashtable()) {
                return sethash(key, v_cache, value);
            } else {
                return Errors.error($str_alt1$Unsupported_Mt_relevance_cache_ty);
            }
        }
    }

    public static SubLObject mt_relevance_cache_set(final SubLObject v_cache, final SubLObject key, final SubLObject value) {
        if (NIL != cache.cache_p(v_cache)) {
            return cache.cache_set(v_cache, key, value);
        }
        if (v_cache.isHashtable()) {
            return sethash(key, v_cache, value);
        }
        return Errors.error($str1$Unsupported_Mt_relevance_cache_ty);
    }

    public static final SubLObject mt_relevance_cache_remove_alt(SubLObject v_cache, SubLObject key) {
        if (NIL != cache.cache_p(v_cache)) {
            return cache.cache_remove(v_cache, key);
        } else {
            if (v_cache.isHashtable()) {
                return remhash(key, v_cache);
            } else {
                return Errors.error($str_alt1$Unsupported_Mt_relevance_cache_ty);
            }
        }
    }

    public static SubLObject mt_relevance_cache_remove(final SubLObject v_cache, final SubLObject key) {
        if (NIL != cache.cache_p(v_cache)) {
            return cache.cache_remove(v_cache, key);
        }
        if (v_cache.isHashtable()) {
            return remhash(key, v_cache);
        }
        return Errors.error($str1$Unsupported_Mt_relevance_cache_ty);
    }

    public static final SubLObject mt_relevance_cache_base_mt_alt(SubLObject mt, SubLObject basemt, SubLObject v_cache, SubLObject test) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject value = com.cyc.cycjava.cycl.mt_relevance_cache.mt_relevance_cache_get(v_cache, mt);
                SubLObject entryP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (value.isVector()) {
                    {
                        SubLObject v_genl_mts = aref(value, ZERO_INTEGER);
                        SubLObject not_genl_mts = aref(value, ONE_INTEGER);
                        if (NIL != set_contents.set_contents_memberP(basemt, v_genl_mts, test)) {
                            return T;
                        } else {
                            if (NIL != set_contents.set_contents_memberP(basemt, not_genl_mts, test)) {
                                return NIL;
                            } else {
                                return $mt_relevance_cache_unknown$.getGlobalValue();
                            }
                        }
                    }
                } else {
                    if (NIL != entryP) {
                        Errors.warn($str_alt2$Corrupt_entry_in_Mt_relevance_cac, mt);
                        com.cyc.cycjava.cycl.mt_relevance_cache.mt_relevance_cache_remove(v_cache, mt);
                    }
                    return $mt_relevance_cache_unknown$.getGlobalValue();
                }
            }
        }
    }

    public static SubLObject mt_relevance_cache_base_mt(final SubLObject mt, final SubLObject basemt, final SubLObject v_cache, final SubLObject test) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject value = mt_relevance_cache_get(v_cache, mt);
        final SubLObject entryP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (!value.isVector()) {
            if (NIL != entryP) {
                Errors.warn($str2$Corrupt_entry_in_Mt_relevance_cac, mt);
                mt_relevance_cache_remove(v_cache, mt);
            }
            return $mt_relevance_cache_unknown$.getGlobalValue();
        }
        final SubLObject v_genl_mts = aref(value, ZERO_INTEGER);
        final SubLObject not_genl_mts = aref(value, ONE_INTEGER);
        if (NIL != set_contents.set_contents_memberP(basemt, v_genl_mts, test)) {
            return T;
        }
        if (NIL != set_contents.set_contents_memberP(basemt, not_genl_mts, test)) {
            return NIL;
        }
        return $mt_relevance_cache_unknown$.getGlobalValue();
    }

    public static final SubLObject mt_relevance_cache_update_alt(SubLObject mt, SubLObject basemt, SubLObject genl_mtP, SubLObject v_cache, SubLObject test) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject value = com.cyc.cycjava.cycl.mt_relevance_cache.mt_relevance_cache_get(v_cache, mt);
                SubLObject entryP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (!value.isVector()) {
                    if (NIL != entryP) {
                        Errors.warn($str_alt3$Previous_entry_for__s_corrupt___R, mt);
                    }
                    value = make_vector(TWO_INTEGER, UNPROVIDED);
                    com.cyc.cycjava.cycl.mt_relevance_cache.mt_relevance_cache_set(v_cache, mt, value);
                }
                if (NIL != genl_mtP) {
                    set_aref(value, ZERO_INTEGER, set_contents.set_contents_add(basemt, aref(value, ZERO_INTEGER), test));
                } else {
                    set_aref(value, ONE_INTEGER, set_contents.set_contents_add(basemt, aref(value, ONE_INTEGER), test));
                }
            }
            return T;
        }
    }

    public static SubLObject mt_relevance_cache_update(final SubLObject mt, final SubLObject basemt, final SubLObject genl_mtP, final SubLObject v_cache, final SubLObject test) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject value = mt_relevance_cache_get(v_cache, mt);
        final SubLObject entryP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (!value.isVector()) {
            if (NIL != entryP) {
                Errors.warn($str3$Previous_entry_for__s_corrupt___R, mt);
            }
            value = make_vector(TWO_INTEGER, UNPROVIDED);
            mt_relevance_cache_set(v_cache, mt, value);
        }
        if (NIL != genl_mtP) {
            set_aref(value, ZERO_INTEGER, set_contents.set_contents_add(basemt, aref(value, ZERO_INTEGER), test));
        } else {
            set_aref(value, ONE_INTEGER, set_contents.set_contents_add(basemt, aref(value, ONE_INTEGER), test));
        }
        return T;
    }

    public static final SubLObject monad_mt_fort_cache_base_mt_alt(SubLObject mt, SubLObject basemt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject v_genl_mts = cache.cache_get($monad_mt_fort_cache$.getGlobalValue(), mt);
                SubLObject entryP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL == entryP) {
                    v_genl_mts = set_utilities.construct_set_contents_from_list(genl_mts.all_genl_mts(mt, UNPROVIDED, UNPROVIDED), symbol_function(EQ), UNPROVIDED);
                    cache.cache_set($monad_mt_fort_cache$.getGlobalValue(), mt, v_genl_mts);
                }
                return set_contents.set_contents_memberP(basemt, v_genl_mts, symbol_function(EQ));
            }
        }
    }

    public static SubLObject monad_mt_fort_cache_base_mt(final SubLObject mt, final SubLObject basemt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject v_genl_mts = cache.cache_get($monad_mt_fort_cache$.getGlobalValue(), mt);
        final SubLObject entryP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == entryP) {
            v_genl_mts = set_utilities.construct_set_contents_from_list(genl_mts.all_genl_mts(mt, UNPROVIDED, UNPROVIDED), symbol_function(EQL), UNPROVIDED);
            cache.cache_set($monad_mt_fort_cache$.getGlobalValue(), mt, v_genl_mts);
        }
        return set_contents.set_contents_memberP(basemt, v_genl_mts, symbol_function(EQL));
    }

    public static final SubLObject clear_monad_mt_fort_cache_alt() {
        return cache.cache_clear($monad_mt_fort_cache$.getGlobalValue());
    }

    public static SubLObject clear_monad_mt_fort_cache() {
        return cache.cache_clear($monad_mt_fort_cache$.getGlobalValue());
    }

    public static final SubLObject monad_mt_naut_cache_base_mt_alt(SubLObject mt, SubLObject basemt) {
        {
            SubLObject genl_mtP = com.cyc.cycjava.cycl.mt_relevance_cache.mt_relevance_cache_base_mt(mt, basemt, $monad_mt_naut_cache$.getGlobalValue(), symbol_function(EQUAL));
            if (NIL != com.cyc.cycjava.cycl.mt_relevance_cache.mt_relevance_cache_unknown_p(genl_mtP)) {
                genl_mtP = genl_mts.monad_genl_mtP(mt, basemt, UNPROVIDED, UNPROVIDED);
                com.cyc.cycjava.cycl.mt_relevance_cache.mt_relevance_cache_update(mt, basemt, genl_mtP, $monad_mt_naut_cache$.getGlobalValue(), symbol_function(EQUAL));
            }
            return genl_mtP;
        }
    }

    public static SubLObject monad_mt_naut_cache_base_mt(final SubLObject mt, final SubLObject basemt) {
        SubLObject genl_mtP = mt_relevance_cache_base_mt(mt, basemt, $monad_mt_naut_cache$.getGlobalValue(), symbol_function(EQUAL));
        if (NIL != mt_relevance_cache_unknown_p(genl_mtP)) {
            genl_mtP = genl_mts.monad_genl_mtP(mt, basemt, UNPROVIDED, UNPROVIDED);
            mt_relevance_cache_update(mt, basemt, genl_mtP, $monad_mt_naut_cache$.getGlobalValue(), symbol_function(EQUAL));
        }
        return genl_mtP;
    }

    public static final SubLObject clear_monad_mt_naut_cache_alt() {
        return cache.cache_clear($monad_mt_naut_cache$.getGlobalValue());
    }

    public static SubLObject clear_monad_mt_naut_cache() {
        return cache.cache_clear($monad_mt_naut_cache$.getGlobalValue());
    }

    public static final SubLObject time_mt_cache_base_mt_alt(SubLObject mt, SubLObject basemt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cached_value = com.cyc.cycjava.cycl.mt_relevance_cache.mt_relevance_cache_base_mt(mt, basemt, $time_mt_cache$.getGlobalValue(), symbol_function(EQUAL));
                if (NIL != com.cyc.cycjava.cycl.mt_relevance_cache.mt_relevance_cache_unknown_p(cached_value)) {
                    {
                        SubLObject mt_time_index = NIL;
                        SubLObject mt_time_param = NIL;
                        thread.resetMultipleValues();
                        {
                            SubLObject mt_time_index_1 = hlmt.explode_hlmt_temporal_facets(mt, hlmt.$default_mt_time_interval$.getGlobalValue(), hlmt.$default_temporal_mt_time_parameter$.getGlobalValue());
                            SubLObject mt_time_param_2 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            mt_time_index = mt_time_index_1;
                            mt_time_param = mt_time_param_2;
                        }
                        {
                            SubLObject basemt_time_index = NIL;
                            SubLObject basemt_time_param = NIL;
                            thread.resetMultipleValues();
                            {
                                SubLObject basemt_time_index_3 = hlmt.explode_hlmt_temporal_facets(basemt, hlmt.$default_mt_time_interval$.getGlobalValue(), hlmt.$default_temporal_mt_time_parameter$.getGlobalValue());
                                SubLObject basemt_time_param_4 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                basemt_time_index = basemt_time_index_3;
                                basemt_time_param = basemt_time_param_4;
                            }
                            {
                                SubLObject genl_mtP = hlmt_relevance.mt_times_visible_p(mt_time_index, basemt_time_index, mt_time_param, basemt_time_param);
                                com.cyc.cycjava.cycl.mt_relevance_cache.mt_relevance_cache_update(mt, basemt, genl_mtP, $time_mt_cache$.getGlobalValue(), symbol_function(EQUAL));
                                return genl_mtP;
                            }
                        }
                    }
                } else {
                    return cached_value;
                }
            }
        }
    }

    public static SubLObject time_mt_cache_base_mt(final SubLObject mt, final SubLObject basemt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cached_value = mt_relevance_cache_base_mt(mt, basemt, $time_mt_cache$.getGlobalValue(), symbol_function(EQUAL));
        if (NIL != mt_relevance_cache_unknown_p(cached_value)) {
            SubLObject mt_time_index = NIL;
            SubLObject mt_time_param = NIL;
            thread.resetMultipleValues();
            final SubLObject mt_time_index_$1 = hlmt.explode_hlmt_temporal_facets(mt, hlmt.$default_mt_time_interval$.getGlobalValue(), hlmt.$default_temporal_mt_time_parameter$.getGlobalValue());
            final SubLObject mt_time_param_$2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            mt_time_index = mt_time_index_$1;
            mt_time_param = mt_time_param_$2;
            SubLObject basemt_time_index = NIL;
            SubLObject basemt_time_param = NIL;
            thread.resetMultipleValues();
            final SubLObject basemt_time_index_$3 = hlmt.explode_hlmt_temporal_facets(basemt, hlmt.$default_mt_time_interval$.getGlobalValue(), hlmt.$default_temporal_mt_time_parameter$.getGlobalValue());
            final SubLObject basemt_time_param_$4 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            basemt_time_index = basemt_time_index_$3;
            basemt_time_param = basemt_time_param_$4;
            final SubLObject genl_mtP = hlmt_relevance.mt_times_visible_p(mt_time_index, basemt_time_index, mt_time_param, basemt_time_param);
            mt_relevance_cache_update(mt, basemt, genl_mtP, $time_mt_cache$.getGlobalValue(), symbol_function(EQUAL));
            return genl_mtP;
        }
        return cached_value;
    }

    public static final SubLObject clear_time_mt_cache_alt() {
        return cache.cache_clear($time_mt_cache$.getGlobalValue());
    }

    public static SubLObject clear_time_mt_cache() {
        return cache.cache_clear($time_mt_cache$.getGlobalValue());
    }

    public static SubLObject declare_mt_relevance_cache_file() {
        declareFunction("basemtP", "BASEMT?", 2, 0, false);
        declareFunction("clear_mt_relevance_cache", "CLEAR-MT-RELEVANCE-CACHE", 0, 0, false);
        declareFunction("update_mt_relevance_cache", "UPDATE-MT-RELEVANCE-CACHE", 2, 0, false);
        declareFunction("bind_mt_indexicals", "BIND-MT-INDEXICALS", 1, 0, false);
        declareFunction("monad_basemtP", "MONAD-BASEMT?", 2, 0, false);
        declareFunction("hlmt_basemtP", "HLMT-BASEMT?", 2, 0, false);
        declareFunction("non_monad_basemtP", "NON-MONAD-BASEMT?", 2, 0, false);
        declareFunction("time_basemtP", "TIME-BASEMT?", 2, 0, false);
        declareFunction("mt_relevance_cache_unknown_p", "MT-RELEVANCE-CACHE-UNKNOWN-P", 1, 0, false);
        declareFunction("mt_relevance_cache_get", "MT-RELEVANCE-CACHE-GET", 2, 0, false);
        declareFunction("mt_relevance_cache_set", "MT-RELEVANCE-CACHE-SET", 3, 0, false);
        declareFunction("mt_relevance_cache_remove", "MT-RELEVANCE-CACHE-REMOVE", 2, 0, false);
        declareFunction("mt_relevance_cache_base_mt", "MT-RELEVANCE-CACHE-BASE-MT", 4, 0, false);
        declareFunction("mt_relevance_cache_update", "MT-RELEVANCE-CACHE-UPDATE", 5, 0, false);
        declareFunction("monad_mt_fort_cache_base_mt", "MONAD-MT-FORT-CACHE-BASE-MT", 2, 0, false);
        declareFunction("clear_monad_mt_fort_cache", "CLEAR-MONAD-MT-FORT-CACHE", 0, 0, false);
        declareFunction("monad_mt_naut_cache_base_mt", "MONAD-MT-NAUT-CACHE-BASE-MT", 2, 0, false);
        declareFunction("clear_monad_mt_naut_cache", "CLEAR-MONAD-MT-NAUT-CACHE", 0, 0, false);
        declareFunction("time_mt_cache_base_mt", "TIME-MT-CACHE-BASE-MT", 2, 0, false);
        declareFunction("clear_time_mt_cache", "CLEAR-TIME-MT-CACHE", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_mt_relevance_cache_file_alt() {
        deflexical("*MT-RELEVANCE-CACHE-UNKNOWN*", $UNKNOWN);
        deflexical("*MONAD-MT-FORT-CACHE*", NIL != boundp($monad_mt_fort_cache$) ? ((SubLObject) ($monad_mt_fort_cache$.getGlobalValue())) : cache.new_cache($int$256, symbol_function(EQ)));
        deflexical("*MONAD-MT-NAUT-CACHE*", NIL != boundp($monad_mt_naut_cache$) ? ((SubLObject) ($monad_mt_naut_cache$.getGlobalValue())) : cache.new_cache($int$256, symbol_function(EQUAL)));
        deflexical("*TIME-MT-CACHE*", NIL != boundp($time_mt_cache$) ? ((SubLObject) ($time_mt_cache$.getGlobalValue())) : cache.new_cache($int$1024, symbol_function(EQUAL)));
        return NIL;
    }

    public static SubLObject init_mt_relevance_cache_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*MT-RELEVANCE-CACHE-UNKNOWN*", $UNKNOWN);
            deflexical("*MONAD-MT-FORT-CACHE*", SubLTrampolineFile.maybeDefault($monad_mt_fort_cache$, $monad_mt_fort_cache$, () -> cache.new_cache($int$256, symbol_function(EQL))));
            deflexical("*MONAD-MT-NAUT-CACHE*", SubLTrampolineFile.maybeDefault($monad_mt_naut_cache$, $monad_mt_naut_cache$, () -> cache.new_cache($int$256, symbol_function(EQUAL))));
            deflexical("*TIME-MT-CACHE*", SubLTrampolineFile.maybeDefault($time_mt_cache$, $time_mt_cache$, () -> cache.new_cache($int$1024, symbol_function(EQUAL))));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*MONAD-MT-FORT-CACHE*", NIL != boundp($monad_mt_fort_cache$) ? ((SubLObject) ($monad_mt_fort_cache$.getGlobalValue())) : cache.new_cache($int$256, symbol_function(EQ)));
            deflexical("*MONAD-MT-NAUT-CACHE*", NIL != boundp($monad_mt_naut_cache$) ? ((SubLObject) ($monad_mt_naut_cache$.getGlobalValue())) : cache.new_cache($int$256, symbol_function(EQUAL)));
            deflexical("*TIME-MT-CACHE*", NIL != boundp($time_mt_cache$) ? ((SubLObject) ($time_mt_cache$.getGlobalValue())) : cache.new_cache($int$1024, symbol_function(EQUAL)));
        }
        return NIL;
    }

    public static SubLObject init_mt_relevance_cache_file_Previous() {
        deflexical("*MT-RELEVANCE-CACHE-UNKNOWN*", $UNKNOWN);
        deflexical("*MONAD-MT-FORT-CACHE*", SubLTrampolineFile.maybeDefault($monad_mt_fort_cache$, $monad_mt_fort_cache$, () -> cache.new_cache($int$256, symbol_function(EQL))));
        deflexical("*MONAD-MT-NAUT-CACHE*", SubLTrampolineFile.maybeDefault($monad_mt_naut_cache$, $monad_mt_naut_cache$, () -> cache.new_cache($int$256, symbol_function(EQUAL))));
        deflexical("*TIME-MT-CACHE*", SubLTrampolineFile.maybeDefault($time_mt_cache$, $time_mt_cache$, () -> cache.new_cache($int$1024, symbol_function(EQUAL))));
        return NIL;
    }

    public static SubLObject setup_mt_relevance_cache_file() {
        declare_defglobal($monad_mt_fort_cache$);
        declare_defglobal($monad_mt_naut_cache$);
        declare_defglobal($time_mt_cache$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_mt_relevance_cache_file();
    }

    @Override
    public void initializeVariables() {
        init_mt_relevance_cache_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_mt_relevance_cache_file();
    }

    static {
    }

    static private final SubLString $str_alt1$Unsupported_Mt_relevance_cache_ty = makeString("Unsupported Mt relevance cache type.");

    static private final SubLString $str_alt2$Corrupt_entry_in_Mt_relevance_cac = makeString("Corrupt entry in Mt relevance cache for ~s.  Removing entry.");

    static private final SubLString $str_alt3$Previous_entry_for__s_corrupt___R = makeString("Previous entry for ~s corrupt.  Replacing entry.");
}

/**
 * Total time: 131 ms
 */
