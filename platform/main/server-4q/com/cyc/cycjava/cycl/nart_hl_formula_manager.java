/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.define_obsolete_register;
import static com.cyc.cycjava.cycl.id_index.id_index_new_id_threshold;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_id_threshold;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.min;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

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


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      NART-HL-FORMULA-MANAGER
 * source file: /cyc/top/cycl/nart-hl-formula-manager.lisp
 * created:     2019/07/03 17:37:20
 */
public final class nart_hl_formula_manager extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new nart_hl_formula_manager();



    // deflexical
    @LispMethod(comment = "A wild guess\ndeflexical")
    private static final SubLSymbol $nart_hl_formula_lru_size_percentage$ = makeSymbol("*NART-HL-FORMULA-LRU-SIZE-PERCENTAGE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $nart_hl_formula_lru_size_max$ = makeSymbol("*NART-HL-FORMULA-LRU-SIZE-MAX*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $nart_hl_formula_manager$ = makeSymbol("*NART-HL-FORMULA-MANAGER*");

    private static final SubLInteger $int$10000 = makeInteger(10000);

    private static final SubLString $str3$nart_hl_formula = makeString("nart-hl-formula");

    private static final SubLSymbol LOAD_NART_HL_FORMULA_FROM_CACHE = makeSymbol("LOAD-NART-HL-FORMULA-FROM-CACHE");

    private static final SubLSymbol $sym6$_EXIT = makeSymbol("%EXIT");

    private static final SubLString $str7$nart_hl_formula_index = makeString("nart-hl-formula-index");

    private static final SubLSymbol $nart_hl_formula_table$ = makeSymbol("*NART-HL-FORMULA-TABLE*");

    private static final SubLSymbol POSSIBLY_INITIALIZE_NART_HL_FORMULA_MANAGER_FROM_LEGACY_WORLD = makeSymbol("POSSIBLY-INITIALIZE-NART-HL-FORMULA-MANAGER-FROM-LEGACY-WORLD");

    public static final SubLObject setup_nart_hl_formula_table_alt(SubLObject size, SubLObject exactP) {
        $nart_hl_formula_manager$.setGlobalValue(kb_object_manager.new_kb_object_manager($str_alt2$nart_hl_formula, size, $nart_hl_formula_lru_size_percentage$.getGlobalValue(), LOAD_NART_HL_FORMULA_FROM_CACHE, exactP));
        return T;
    }

    public static SubLObject setup_nart_hl_formula_table(final SubLObject size, final SubLObject exactP) {
        $nart_hl_formula_manager$.setGlobalValue(kb_object_manager.new_kb_object_manager($str3$nart_hl_formula, size, $nart_hl_formula_lru_size_percentage$.getGlobalValue(), $nart_hl_formula_lru_size_max$.getGlobalValue(), LOAD_NART_HL_FORMULA_FROM_CACHE, exactP));
        return T;
    }

    public static SubLObject resize_nart_hl_formula_kbom_lru(SubLObject percentage, SubLObject max) {
        if (percentage == UNPROVIDED) {
            percentage = NIL;
        }
        if (max == UNPROVIDED) {
            max = NIL;
        }
        if (NIL == percentage) {
            percentage = $nart_hl_formula_lru_size_percentage$.getGlobalValue();
        }
        if (NIL == max) {
            max = $nart_hl_formula_lru_size_max$.getGlobalValue();
        }
        return kb_object_manager.resize_kbom_lru_cache_from_percentage_and_max($nart_hl_formula_manager$.getGlobalValue(), percentage, max);
    }

    public static final SubLObject optimize_nart_hl_formula_table_alt(SubLObject new_nart_hl_formula_id_threshold) {
        return kb_object_manager.optimize_kb_object_content_table($nart_hl_formula_manager$.getGlobalValue(), new_nart_hl_formula_id_threshold);
    }

    public static SubLObject optimize_nart_hl_formula_table(final SubLObject new_nart_hl_formula_id_threshold) {
        return kb_object_manager.optimize_kb_object_content_table($nart_hl_formula_manager$.getGlobalValue(), new_nart_hl_formula_id_threshold);
    }

    public static final SubLObject clear_nart_hl_formula_table_alt() {
        return kb_object_manager.clear_kb_object_content_table($nart_hl_formula_manager$.getGlobalValue());
    }

    public static SubLObject clear_nart_hl_formula_table() {
        return kb_object_manager.clear_kb_object_content_table($nart_hl_formula_manager$.getGlobalValue());
    }

    /**
     * Enable the tracking of nart-hl-formula usage counts.
     */
    @LispMethod(comment = "Enable the tracking of nart-hl-formula usage counts.")
    public static final SubLObject maintain_nart_hl_formula_usage_counts_alt() {
        return kb_object_manager.maintain_kb_object_usage_counts($nart_hl_formula_manager$.getGlobalValue());
    }

    /**
     * Enable the tracking of nart-hl-formula usage counts.
     */
    @LispMethod(comment = "Enable the tracking of nart-hl-formula usage counts.")
    public static SubLObject maintain_nart_hl_formula_usage_counts() {
        return kb_object_manager.maintain_kb_object_usage_counts($nart_hl_formula_manager$.getGlobalValue());
    }

    /**
     * Disable the tracking of nart-hl-formula usage counts.
     */
    @LispMethod(comment = "Disable the tracking of nart-hl-formula usage counts.")
    public static final SubLObject dont_maintain_nart_hl_formula_usage_counts_alt() {
        return kb_object_manager.dont_maintain_kb_object_usage_counts($nart_hl_formula_manager$.getGlobalValue());
    }

    /**
     * Disable the tracking of nart-hl-formula usage counts.
     */
    @LispMethod(comment = "Disable the tracking of nart-hl-formula usage counts.")
    public static SubLObject dont_maintain_nart_hl_formula_usage_counts() {
        return kb_object_manager.dont_maintain_kb_object_usage_counts($nart_hl_formula_manager$.getGlobalValue());
    }

    /**
     * Test predicate whether nart-hl-formula usage counts are already enabled or not.
     */
    @LispMethod(comment = "Test predicate whether nart-hl-formula usage counts are already enabled or not.")
    public static final SubLObject nart_hl_formula_usage_counts_enabled_p_alt() {
        return kb_object_manager.kb_object_usage_counts_enabledP($nart_hl_formula_manager$.getGlobalValue());
    }

    /**
     * Test predicate whether nart-hl-formula usage counts are already enabled or not.
     */
    @LispMethod(comment = "Test predicate whether nart-hl-formula usage counts are already enabled or not.")
    public static SubLObject nart_hl_formula_usage_counts_enabled_p() {
        return kb_object_manager.kb_object_usage_counts_enabledP($nart_hl_formula_manager$.getGlobalValue());
    }

    /**
     * Return the number of nart-hl-formulas whose content is cached in memory.
     */
    @LispMethod(comment = "Return the number of nart-hl-formulas whose content is cached in memory.")
    public static final SubLObject cached_nart_hl_formula_count_alt() {
        return kb_object_manager.cached_kb_object_count($nart_hl_formula_manager$.getGlobalValue());
    }

    /**
     * Return the number of nart-hl-formulas whose content is cached in memory.
     */
    @LispMethod(comment = "Return the number of nart-hl-formulas whose content is cached in memory.")
    public static SubLObject cached_nart_hl_formula_count() {
        return kb_object_manager.cached_kb_object_count($nart_hl_formula_manager$.getGlobalValue());
    }

    public static final SubLObject nart_hl_formula_completely_cachedP_alt() {
        return numE(nart_handles.nart_count(), com.cyc.cycjava.cycl.nart_hl_formula_manager.cached_nart_hl_formula_count());
    }

    public static SubLObject nart_hl_formula_completely_cachedP() {
        return numE(nart_handles.nart_count(), cached_nart_hl_formula_count());
    }

    public static final SubLObject lookup_nart_hl_formula_alt(SubLObject id) {
        return kb_object_manager.lookup_kb_object_content($nart_hl_formula_manager$.getGlobalValue(), id);
    }

    public static SubLObject lookup_nart_hl_formula(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding(thread);
        try {
            kb_storage_logging.$kb_storage_client$.bind(kb_storage_logging.add_kb_storage_logging_add_tag($NHM), thread);
            return kb_object_manager.lookup_kb_object_content($nart_hl_formula_manager$.getGlobalValue(), id);
        } finally {
            kb_storage_logging.$kb_storage_client$.rebind(_prev_bind_0, thread);
        }
    }

    public static final SubLObject get_file_backed_nart_id_threshold_alt() {
        return kb_object_manager.get_file_backed_kb_object_id_threshold($nart_hl_formula_manager$.getGlobalValue());
    }

    public static SubLObject get_file_backed_nart_id_threshold() {
        return kb_object_manager.get_file_backed_kb_object_id_threshold($nart_hl_formula_manager$.getGlobalValue());
    }

    public static final SubLObject nart_hl_formulas_unbuiltP_alt() {
        if (nart_handles.nart_count().isZero()) {
            return NIL;
        }
        return kb_object_manager.kb_object_manager_unbuiltP($nart_hl_formula_manager$.getGlobalValue());
    }

    public static SubLObject nart_hl_formulas_unbuiltP() {
        if (nart_handles.nart_count().isZero()) {
            return NIL;
        }
        return kb_object_manager.kb_object_manager_unbuiltP($nart_hl_formula_manager$.getGlobalValue());
    }

    /**
     * Note that ID will be used as the id for NART-HL-FORMULA.
     */
    @LispMethod(comment = "Note that ID will be used as the id for NART-HL-FORMULA.")
    public static final SubLObject register_nart_hl_formula_alt(SubLObject id, SubLObject nart_hl_formula) {
        return kb_object_manager.register_kb_object_content($nart_hl_formula_manager$.getGlobalValue(), id, nart_hl_formula);
    }

    /**
     * Note that ID will be used as the id for NART-HL-FORMULA.
     */
    @LispMethod(comment = "Note that ID will be used as the id for NART-HL-FORMULA.")
    public static SubLObject register_nart_hl_formula(final SubLObject id, final SubLObject nart_hl_formula) {
        return kb_object_manager.register_kb_object_content($nart_hl_formula_manager$.getGlobalValue(), id, nart_hl_formula);
    }

    /**
     * Note that ID is not in use as an NART-HL-FORMULA id
     */
    @LispMethod(comment = "Note that ID is not in use as an NART-HL-FORMULA id")
    public static final SubLObject deregister_nart_hl_formula_alt(SubLObject id) {
        return kb_object_manager.deregister_kb_object_content($nart_hl_formula_manager$.getGlobalValue(), id);
    }

    /**
     * Note that ID is not in use as an NART-HL-FORMULA id
     */
    @LispMethod(comment = "Note that ID is not in use as an NART-HL-FORMULA id")
    public static SubLObject deregister_nart_hl_formula(final SubLObject id) {
        return kb_object_manager.deregister_kb_object_content($nart_hl_formula_manager$.getGlobalValue(), id);
    }

    public static final SubLObject mark_nart_hl_formula_as_muted_alt(SubLObject id) {
        return kb_object_manager.mark_kb_object_content_as_muted($nart_hl_formula_manager$.getGlobalValue(), id);
    }

    public static SubLObject mark_nart_hl_formula_as_muted(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding(thread);
        try {
            kb_storage_logging.$kb_storage_client$.bind(kb_storage_logging.add_kb_storage_logging_add_tag($NHM), thread);
            return kb_object_manager.mark_kb_object_content_as_muted($nart_hl_formula_manager$.getGlobalValue(), id);
        } finally {
            kb_storage_logging.$kb_storage_client$.rebind(_prev_bind_0, thread);
        }
    }

    /**
     * Turn metering of nart-hl-formula content swap time on.
     */
    @LispMethod(comment = "Turn metering of nart-hl-formula content swap time on.")
    public static final SubLObject meter_nart_hl_formula_swap_time_alt() {
        return kb_object_manager.meter_kb_object_content_swap_time($nart_hl_formula_manager$.getGlobalValue());
    }

    /**
     * Turn metering of nart-hl-formula content swap time on.
     */
    @LispMethod(comment = "Turn metering of nart-hl-formula content swap time on.")
    public static SubLObject meter_nart_hl_formula_swap_time() {
        return kb_object_manager.meter_kb_object_content_swap_time($nart_hl_formula_manager$.getGlobalValue());
    }

    /**
     * Turn metering of nart-hl-formula content swap time off.
     */
    @LispMethod(comment = "Turn metering of nart-hl-formula content swap time off.")
    public static final SubLObject dont_meter_nart_hl_formula_swap_time_alt() {
        return kb_object_manager.dont_meter_kb_object_content_swap_time($nart_hl_formula_manager$.getGlobalValue());
    }

    /**
     * Turn metering of nart-hl-formula content swap time off.
     */
    @LispMethod(comment = "Turn metering of nart-hl-formula content swap time off.")
    public static SubLObject dont_meter_nart_hl_formula_swap_time() {
        return kb_object_manager.dont_meter_kb_object_content_swap_time($nart_hl_formula_manager$.getGlobalValue());
    }

    /**
     * Reset nart-hl-formula content swap time to 0.
     */
    @LispMethod(comment = "Reset nart-hl-formula content swap time to 0.")
    public static final SubLObject clear_nart_hl_formula_swap_time_alt() {
        return kb_object_manager.clear_kb_object_content_swap_time($nart_hl_formula_manager$.getGlobalValue());
    }

    /**
     * Reset nart-hl-formula content swap time to 0.
     */
    @LispMethod(comment = "Reset nart-hl-formula content swap time to 0.")
    public static SubLObject clear_nart_hl_formula_swap_time() {
        return kb_object_manager.clear_kb_object_content_swap_time($nart_hl_formula_manager$.getGlobalValue());
    }

    /**
     *
     *
     * @return NON-NEGATIVE-NUMBER-P; How many seconds have been spent inside
    SWAP-IN-NART-HL-FORMULA with metering on since the last time it was cleared?
     */
    @LispMethod(comment = "@return NON-NEGATIVE-NUMBER-P; How many seconds have been spent inside\r\nSWAP-IN-NART-HL-FORMULA with metering on since the last time it was cleared?")
    public static final SubLObject current_nart_hl_formula_swap_time_alt() {
        return kb_object_manager.kb_object_manager_swap_time($nart_hl_formula_manager$.getGlobalValue());
    }

    /**
     *
     *
     * @return NON-NEGATIVE-NUMBER-P; How many seconds have been spent inside
    SWAP-IN-NART-HL-FORMULA with metering on since the last time it was cleared?
     */
    @LispMethod(comment = "@return NON-NEGATIVE-NUMBER-P; How many seconds have been spent inside\r\nSWAP-IN-NART-HL-FORMULA with metering on since the last time it was cleared?")
    public static SubLObject current_nart_hl_formula_swap_time() {
        return kb_object_manager.kb_object_manager_swap_time($nart_hl_formula_manager$.getGlobalValue());
    }

    public static final SubLObject swap_out_all_pristine_nart_hl_formulas_alt() {
        return kb_object_manager.swap_out_all_pristine_kb_objects_int($nart_hl_formula_manager$.getGlobalValue());
    }

    public static SubLObject swap_out_all_pristine_nart_hl_formulas() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding(thread);
        try {
            kb_storage_logging.$kb_storage_client$.bind(kb_storage_logging.add_kb_storage_logging_add_tag($NHM), thread);
            return kb_object_manager.safely_swap_out_all_pristine_kb_objects($nart_hl_formula_manager$.getGlobalValue());
        } finally {
            kb_storage_logging.$kb_storage_client$.rebind(_prev_bind_0, thread);
        }
    }

    public static final SubLObject initialize_nart_hl_formula_hl_store_cache_alt() {
        return kb_object_manager.initialize_kb_object_hl_store_cache($nart_hl_formula_manager$.getGlobalValue(), $str_alt2$nart_hl_formula, $str_alt4$nart_hl_formula_index);
    }

    public static SubLObject initialize_nart_hl_formula_hl_store_cache() {
        return kb_object_manager.initialize_kb_object_hl_store_cache($nart_hl_formula_manager$.getGlobalValue(), $str3$nart_hl_formula, $str7$nart_hl_formula_index, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject nart_hl_formula_table_initializedP_alt() {
        return misc_utilities.initialized_p($nart_hl_formula_manager$.getGlobalValue());
    }

    public static SubLObject nart_hl_formula_table_initializedP() {
        return misc_utilities.initialized_p($nart_hl_formula_manager$.getGlobalValue());
    }

    public static final SubLObject possibly_initialize_nart_hl_formula_manager_from_legacy_world_alt() {
        if ($UNINITIALIZED == $nart_hl_formula_manager$.getGlobalValue()) {
            {
                SubLObject size = id_index_new_id_threshold($nart_hl_formula_table$.getGlobalValue());
                SubLObject lru_size = multiply(integerDivide(size, $int$100), $nart_hl_formula_lru_size_percentage$.getGlobalValue());
                SubLObject lru_information = cache.new_cache(lru_size, UNPROVIDED);
                $nart_hl_formula_manager$.setGlobalValue(kb_object_manager.new_legacy_kb_object_manager($str_alt2$nart_hl_formula, $nart_hl_formula_lru_size_percentage$.getGlobalValue(), $nart_hl_formula_table$.getGlobalValue(), lru_information, $UNINITIALIZED, LOAD_NART_HL_FORMULA_FROM_CACHE));
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject possibly_initialize_nart_hl_formula_manager_from_legacy_world() {
        if ($UNINITIALIZED == $nart_hl_formula_manager$.getGlobalValue()) {
            final SubLObject size = id_index_sparse_id_threshold($nart_hl_formula_table$.getGlobalValue());
            final SubLObject lru_size = min($nart_hl_formula_lru_size_max$.getGlobalValue(), multiply(integerDivide(size, $int$100), $nart_hl_formula_lru_size_percentage$.getGlobalValue()));
            final SubLObject lru_information = cache.new_cache(lru_size, UNPROVIDED);
            $nart_hl_formula_manager$.setGlobalValue(kb_object_manager.new_legacy_kb_object_manager($str3$nart_hl_formula, $nart_hl_formula_lru_size_percentage$.getGlobalValue(), $nart_hl_formula_lru_size_max$.getGlobalValue(), $nart_hl_formula_table$.getGlobalValue(), lru_information, $UNINITIALIZED, LOAD_NART_HL_FORMULA_FROM_CACHE));
            return T;
        }
        return NIL;
    }

    public static SubLObject declare_nart_hl_formula_manager_file() {
        declareFunction("setup_nart_hl_formula_table", "SETUP-NART-HL-FORMULA-TABLE", 2, 0, false);
        declareFunction("resize_nart_hl_formula_kbom_lru", "RESIZE-NART-HL-FORMULA-KBOM-LRU", 0, 2, false);
        declareFunction("optimize_nart_hl_formula_table", "OPTIMIZE-NART-HL-FORMULA-TABLE", 1, 0, false);
        declareFunction("clear_nart_hl_formula_table", "CLEAR-NART-HL-FORMULA-TABLE", 0, 0, false);
        declareFunction("maintain_nart_hl_formula_usage_counts", "MAINTAIN-NART-HL-FORMULA-USAGE-COUNTS", 0, 0, false);
        declareFunction("dont_maintain_nart_hl_formula_usage_counts", "DONT-MAINTAIN-NART-HL-FORMULA-USAGE-COUNTS", 0, 0, false);
        declareFunction("nart_hl_formula_usage_counts_enabled_p", "NART-HL-FORMULA-USAGE-COUNTS-ENABLED-P", 0, 0, false);
        declareFunction("cached_nart_hl_formula_count", "CACHED-NART-HL-FORMULA-COUNT", 0, 0, false);
        declareFunction("nart_hl_formula_completely_cachedP", "NART-HL-FORMULA-COMPLETELY-CACHED?", 0, 0, false);
        declareFunction("lookup_nart_hl_formula", "LOOKUP-NART-HL-FORMULA", 1, 0, false);
        declareFunction("get_file_backed_nart_id_threshold", "GET-FILE-BACKED-NART-ID-THRESHOLD", 0, 0, false);
        declareFunction("nart_hl_formulas_unbuiltP", "NART-HL-FORMULAS-UNBUILT?", 0, 0, false);
        declareFunction("register_nart_hl_formula", "REGISTER-NART-HL-FORMULA", 2, 0, false);
        declareFunction("deregister_nart_hl_formula", "DEREGISTER-NART-HL-FORMULA", 1, 0, false);
        declareFunction("mark_nart_hl_formula_as_muted", "MARK-NART-HL-FORMULA-AS-MUTED", 1, 0, false);
        declareFunction("meter_nart_hl_formula_swap_time", "METER-NART-HL-FORMULA-SWAP-TIME", 0, 0, false);
        declareFunction("dont_meter_nart_hl_formula_swap_time", "DONT-METER-NART-HL-FORMULA-SWAP-TIME", 0, 0, false);
        declareFunction("clear_nart_hl_formula_swap_time", "CLEAR-NART-HL-FORMULA-SWAP-TIME", 0, 0, false);
        declareFunction("current_nart_hl_formula_swap_time", "CURRENT-NART-HL-FORMULA-SWAP-TIME", 0, 0, false);
        declareFunction("swap_out_all_pristine_nart_hl_formulas", "SWAP-OUT-ALL-PRISTINE-NART-HL-FORMULAS", 0, 0, false);
        declareFunction("initialize_nart_hl_formula_hl_store_cache", "INITIALIZE-NART-HL-FORMULA-HL-STORE-CACHE", 0, 0, false);
        declareFunction("nart_hl_formula_table_initializedP", "NART-HL-FORMULA-TABLE-INITIALIZED?", 0, 0, false);
        declareFunction("possibly_initialize_nart_hl_formula_manager_from_legacy_world", "POSSIBLY-INITIALIZE-NART-HL-FORMULA-MANAGER-FROM-LEGACY-WORLD", 0, 0, false);
        return NIL;
    }

    static private final SubLString $str_alt2$nart_hl_formula = makeString("nart-hl-formula");

    static private final SubLString $str_alt4$nart_hl_formula_index = makeString("nart-hl-formula-index");

    public static final SubLObject init_nart_hl_formula_manager_file_alt() {
        deflexical("*NART-HL-FORMULA-MANAGER*", NIL != boundp($nart_hl_formula_manager$) ? ((SubLObject) ($nart_hl_formula_manager$.getGlobalValue())) : $UNINITIALIZED);
        deflexical("*NART-HL-FORMULA-LRU-SIZE-PERCENTAGE*", FIVE_INTEGER);
        deflexical("*NART-HL-FORMULA-TABLE*", NIL != boundp($nart_hl_formula_table$) ? ((SubLObject) ($nart_hl_formula_table$.getGlobalValue())) : NIL);
        return NIL;
    }

    public static SubLObject init_nart_hl_formula_manager_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*NART-HL-FORMULA-MANAGER*", SubLTrampolineFile.maybeDefault($nart_hl_formula_manager$, $nart_hl_formula_manager$, $UNINITIALIZED));
            deflexical("*NART-HL-FORMULA-LRU-SIZE-PERCENTAGE*", FIVE_INTEGER);
            deflexical("*NART-HL-FORMULA-LRU-SIZE-MAX*", $int$10000);
            deflexical("*NART-HL-FORMULA-TABLE*", SubLTrampolineFile.maybeDefault($nart_hl_formula_table$, $nart_hl_formula_table$, NIL));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*NART-HL-FORMULA-MANAGER*", NIL != boundp($nart_hl_formula_manager$) ? ((SubLObject) ($nart_hl_formula_manager$.getGlobalValue())) : $UNINITIALIZED);
            deflexical("*NART-HL-FORMULA-TABLE*", NIL != boundp($nart_hl_formula_table$) ? ((SubLObject) ($nart_hl_formula_table$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_nart_hl_formula_manager_file_Previous() {
        deflexical("*NART-HL-FORMULA-MANAGER*", SubLTrampolineFile.maybeDefault($nart_hl_formula_manager$, $nart_hl_formula_manager$, $UNINITIALIZED));
        deflexical("*NART-HL-FORMULA-LRU-SIZE-PERCENTAGE*", FIVE_INTEGER);
        deflexical("*NART-HL-FORMULA-LRU-SIZE-MAX*", $int$10000);
        deflexical("*NART-HL-FORMULA-TABLE*", SubLTrampolineFile.maybeDefault($nart_hl_formula_table$, $nart_hl_formula_table$, NIL));
        return NIL;
    }

    public static SubLObject setup_nart_hl_formula_manager_file() {
        declare_defglobal($nart_hl_formula_manager$);
        declare_defglobal($nart_hl_formula_table$);
        define_obsolete_register(POSSIBLY_INITIALIZE_NART_HL_FORMULA_MANAGER_FROM_LEGACY_WORLD, NIL);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_nart_hl_formula_manager_file();
    }

    @Override
    public void initializeVariables() {
        init_nart_hl_formula_manager_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_nart_hl_formula_manager_file();
    }

    static {
    }
}

/**
 * Total time: 56 ms
 */
