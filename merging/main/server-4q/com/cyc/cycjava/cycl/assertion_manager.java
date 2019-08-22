/**
 *
 */
/**
 *
 */
/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.inference.arete;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
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
 * module:      ASSERTION-MANAGER
 * source file: /cyc/top/cycl/assertion-manager.lisp
 * created:     2019/07/03 17:37:20
 */
public final class assertion_manager extends SubLTranslatedFile implements V12 {
    public static final SubLObject arete_note_assertion_touched(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            kb_access_metering.possibly_note_kb_access_assertion(assertion);
            if (NIL != arete.$arete_log_kb_touchesP$.getDynamicValue(thread)) {
                dictionary_utilities.dictionary_increment($arete_assertions_touched$.getGlobalValue(), assertion, UNPROVIDED);
            }
            return NIL;
        }
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $arete_assertions_touched$ = makeSymbol("*ARETE-ASSERTIONS-TOUCHED*");

    public static final SubLFile me = new assertion_manager();

 public static final String myName = "com.cyc.cycjava.cycl.assertion_manager";


    // deflexical
    /**
     * based on arete experiments, only 16% of all assertions are need for normal
     * inference
     */
    @LispMethod(comment = "based on arete experiments, only 16% of all assertions are need for normal\r\ninference\ndeflexical\nbased on arete experiments, only 16% of all assertions are need for normal\ninference")
    private static final SubLSymbol $assertion_lru_size_percentage$ = makeSymbol("*ASSERTION-LRU-SIZE-PERCENTAGE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $assertion_lru_size_max$ = makeSymbol("*ASSERTION-LRU-SIZE-MAX*");

    public static final SubLSymbol $assertion_content_manager$ = makeSymbol("*ASSERTION-CONTENT-MANAGER*");

    private static final SubLInteger $int$600000 = makeInteger(600000);

    static private final SubLString $$$assertion = makeString("assertion");

    private static final SubLSymbol LOAD_ASSERTION_DEF_FROM_CACHE = makeSymbol("LOAD-ASSERTION-DEF-FROM-CACHE");

    private static final SubLSymbol $sym6$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol WITH_KBOM_FULLY_LOADED = makeSymbol("WITH-KBOM-FULLY-LOADED");

    private static final SubLList $list8 = list($assertion_content_manager$);

    private static final SubLString $str9$assertion_index = makeString("assertion-index");

    public static final SubLObject setup_assertion_content_table_alt(SubLObject size, SubLObject exactP) {
        $assertion_content_manager$.setGlobalValue(kb_object_manager.new_kb_object_manager($$$assertion, size, $assertion_lru_size_percentage$.getGlobalValue(), LOAD_ASSERTION_DEF_FROM_CACHE, exactP));
        return T;
    }

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

    public static final SubLObject optimize_assertion_content_table_alt(SubLObject new_assertion_id_threshold) {
        return kb_object_manager.optimize_kb_object_content_table($assertion_content_manager$.getGlobalValue(), new_assertion_id_threshold);
    }

    public static SubLObject optimize_assertion_content_table(final SubLObject new_assertion_id_threshold) {
        return kb_object_manager.optimize_kb_object_content_table($assertion_content_manager$.getGlobalValue(), new_assertion_id_threshold);
    }

    public static final SubLObject clear_assertion_content_table_alt() {
        return kb_object_manager.clear_kb_object_content_table($assertion_content_manager$.getGlobalValue());
    }

    public static SubLObject clear_assertion_content_table() {
        return kb_object_manager.clear_kb_object_content_table($assertion_content_manager$.getGlobalValue());
    }

    /**
     * Enable the tracking of assertion usage counts.
     */
    @LispMethod(comment = "Enable the tracking of assertion usage counts.")
    public static final SubLObject maintain_assertion_usage_counts_alt() {
        return kb_object_manager.maintain_kb_object_usage_counts($assertion_content_manager$.getGlobalValue());
    }

    /**
     * Enable the tracking of assertion usage counts.
     */
    @LispMethod(comment = "Enable the tracking of assertion usage counts.")
    public static SubLObject maintain_assertion_usage_counts() {
        return kb_object_manager.maintain_kb_object_usage_counts($assertion_content_manager$.getGlobalValue());
    }

    /**
     * Disable the tracking of assertion usage counts.
     */
    @LispMethod(comment = "Disable the tracking of assertion usage counts.")
    public static final SubLObject dont_maintain_assertion_usage_counts_alt() {
        return kb_object_manager.dont_maintain_kb_object_usage_counts($assertion_content_manager$.getGlobalValue());
    }

    /**
     * Disable the tracking of assertion usage counts.
     */
    @LispMethod(comment = "Disable the tracking of assertion usage counts.")
    public static SubLObject dont_maintain_assertion_usage_counts() {
        return kb_object_manager.dont_maintain_kb_object_usage_counts($assertion_content_manager$.getGlobalValue());
    }

    /**
     * Test predicate whether assertion usage counts are already enabled or not.
     */
    @LispMethod(comment = "Test predicate whether assertion usage counts are already enabled or not.")
    public static final SubLObject assertion_usage_counts_enabled_p_alt() {
        return kb_object_manager.kb_object_usage_counts_enabledP($assertion_content_manager$.getGlobalValue());
    }

    /**
     * Test predicate whether assertion usage counts are already enabled or not.
     */
    @LispMethod(comment = "Test predicate whether assertion usage counts are already enabled or not.")
    public static SubLObject assertion_usage_counts_enabled_p() {
        return kb_object_manager.kb_object_usage_counts_enabledP($assertion_content_manager$.getGlobalValue());
    }

    /**
     * Return the number of assertions whose content is cached in memory.
     */
    @LispMethod(comment = "Return the number of assertions whose content is cached in memory.")
    public static final SubLObject cached_assertion_count_alt() {
        return kb_object_manager.cached_kb_object_count($assertion_content_manager$.getGlobalValue());
    }

    /**
     * Return the number of assertions whose content is cached in memory.
     */
    @LispMethod(comment = "Return the number of assertions whose content is cached in memory.")
    public static SubLObject cached_assertion_count() {
        return kb_object_manager.cached_kb_object_count($assertion_content_manager$.getGlobalValue());
    }

    public static final SubLObject assertion_content_completely_cachedP_alt() {
        return numE(assertion_handles.assertion_count(), com.cyc.cycjava.cycl.assertion_manager.cached_assertion_count());
    }

    public static SubLObject assertion_content_completely_cachedP() {
        return numE(assertion_handles.assertion_count(), cached_assertion_count());
    }

    public static final SubLObject assertion_content_cached_p_alt(SubLObject assertion) {
        return kb_object_manager.kb_object_id_cachedP($assertion_content_manager$.getGlobalValue(), assertion_handles.assertion_id(assertion));
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

    public static final SubLObject lookup_assertion_content_alt(SubLObject id) {
        com.cyc.cycjava.cycl.assertion_manager.arete_note_assertion_touched(assertion_handles.find_assertion_by_id(id));
        return kb_object_manager.lookup_kb_object_content($assertion_content_manager$.getGlobalValue(), id);
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

    public static final SubLObject get_file_backed_assertion_id_threshold_alt() {
        return kb_object_manager.get_file_backed_kb_object_id_threshold($assertion_content_manager$.getGlobalValue());
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

    /**
     * Note that ID will be used as the id for ASSERTION-CONTENT.
     */
    @LispMethod(comment = "Note that ID will be used as the id for ASSERTION-CONTENT.")
    public static final SubLObject register_assertion_content_alt(SubLObject id, SubLObject assertion_content) {
        return kb_object_manager.register_kb_object_content($assertion_content_manager$.getGlobalValue(), id, assertion_content);
    }

    /**
     * Note that ID will be used as the id for ASSERTION-CONTENT.
     */
    @LispMethod(comment = "Note that ID will be used as the id for ASSERTION-CONTENT.")
    public static SubLObject register_assertion_content(final SubLObject id, final SubLObject assertion_content) {
        return kb_object_manager.register_kb_object_content($assertion_content_manager$.getGlobalValue(), id, assertion_content);
    }

    /**
     * Note that ID is not in use as an ASSERTION-CONTENT id
     */
    @LispMethod(comment = "Note that ID is not in use as an ASSERTION-CONTENT id")
    public static final SubLObject deregister_assertion_content_alt(SubLObject id) {
        return kb_object_manager.deregister_kb_object_content($assertion_content_manager$.getGlobalValue(), id);
    }

    /**
     * Note that ID is not in use as an ASSERTION-CONTENT id
     */
    @LispMethod(comment = "Note that ID is not in use as an ASSERTION-CONTENT id")
    public static SubLObject deregister_assertion_content(final SubLObject id) {
        return kb_object_manager.deregister_kb_object_content($assertion_content_manager$.getGlobalValue(), id);
    }

    public static final SubLObject mark_assertion_content_as_muted_alt(SubLObject id) {
        return kb_object_manager.mark_kb_object_content_as_muted($assertion_content_manager$.getGlobalValue(), id);
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

    /**
     * Turn metering of assertion content swap time on.
     */
    @LispMethod(comment = "Turn metering of assertion content swap time on.")
    public static final SubLObject meter_assertion_content_swap_time_alt() {
        return kb_object_manager.meter_kb_object_content_swap_time($assertion_content_manager$.getGlobalValue());
    }

    /**
     * Turn metering of assertion content swap time on.
     */
    @LispMethod(comment = "Turn metering of assertion content swap time on.")
    public static SubLObject meter_assertion_content_swap_time() {
        return kb_object_manager.meter_kb_object_content_swap_time($assertion_content_manager$.getGlobalValue());
    }

    /**
     * Turn metering of assertion content swap time off.
     */
    @LispMethod(comment = "Turn metering of assertion content swap time off.")
    public static final SubLObject dont_meter_assertion_content_swap_time_alt() {
        return kb_object_manager.dont_meter_kb_object_content_swap_time($assertion_content_manager$.getGlobalValue());
    }

    /**
     * Turn metering of assertion content swap time off.
     */
    @LispMethod(comment = "Turn metering of assertion content swap time off.")
    public static SubLObject dont_meter_assertion_content_swap_time() {
        return kb_object_manager.dont_meter_kb_object_content_swap_time($assertion_content_manager$.getGlobalValue());
    }

    /**
     * Reset assertion content swap time to 0.
     */
    @LispMethod(comment = "Reset assertion content swap time to 0.")
    public static final SubLObject clear_assertion_content_swap_time_alt() {
        return kb_object_manager.clear_kb_object_content_swap_time($assertion_content_manager$.getGlobalValue());
    }

    /**
     * Reset assertion content swap time to 0.
     */
    @LispMethod(comment = "Reset assertion content swap time to 0.")
    public static SubLObject clear_assertion_content_swap_time() {
        return kb_object_manager.clear_kb_object_content_swap_time($assertion_content_manager$.getGlobalValue());
    }

    /**
     *
     *
     * @return NON-NEGATIVE-NUMBER-P; How many seconds have been spent inside
    SWAP-IN-ASSERTION-CONTENT with metering on since the last time it was cleared?
     */
    @LispMethod(comment = "@return NON-NEGATIVE-NUMBER-P; How many seconds have been spent inside\r\nSWAP-IN-ASSERTION-CONTENT with metering on since the last time it was cleared?")
    public static final SubLObject current_assertion_content_swap_time_alt() {
        return kb_object_manager.kb_object_manager_swap_time($assertion_content_manager$.getGlobalValue());
    }

    /**
     *
     *
     * @return NON-NEGATIVE-NUMBER-P; How many seconds have been spent inside
    SWAP-IN-ASSERTION-CONTENT with metering on since the last time it was cleared?
     */
    @LispMethod(comment = "@return NON-NEGATIVE-NUMBER-P; How many seconds have been spent inside\r\nSWAP-IN-ASSERTION-CONTENT with metering on since the last time it was cleared?")
    public static SubLObject current_assertion_content_swap_time() {
        return kb_object_manager.kb_object_manager_swap_time($assertion_content_manager$.getGlobalValue());
    }

    public static final SubLObject swap_out_all_pristine_assertions_alt() {
        return kb_object_manager.swap_out_all_pristine_kb_objects_int($assertion_content_manager$.getGlobalValue());
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

    public static final SubLObject initialize_assertion_hl_store_cache_alt() {
        return kb_object_manager.initialize_kb_object_hl_store_cache($assertion_content_manager$.getGlobalValue(), $$$assertion, $str_alt5$assertion_index);
    }

    public static SubLObject initialize_assertion_hl_store_cache() {
        return kb_object_manager.initialize_kb_object_hl_store_cache($assertion_content_manager$.getGlobalValue(), $$$assertion, $str9$assertion_index, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject wide_assertion_hl_store_cacheP() {
        return kb_object_manager.wide_kb_object_managerP($assertion_content_manager$.getGlobalValue());
    }

    /**
     *
     *
     * @param REPAIR?
     * 		booleanp; whether to repair any errors found in the assertion content table
     * @return 0 booleanp; whether the assertion content table is valid
     * @return 1 integerp; the number of invalid entries found in the table
     */
    @LispMethod(comment = "@param REPAIR?\r\n\t\tbooleanp; whether to repair any errors found in the assertion content table\r\n@return 0 booleanp; whether the assertion content table is valid\r\n@return 1 integerp; the number of invalid entries found in the table")
    public static final SubLObject verify_assertion_content_table_int_alt(SubLObject type_pred, SubLObject repairP) {
        if (repairP == UNPROVIDED) {
            repairP = NIL;
        }
        return kb_object_manager.verify_kb_object_content_table_int($assertion_content_manager$.getGlobalValue(), type_pred, repairP);
    }

    /**
     *
     *
     * @param REPAIR?
     * 		booleanp; whether to repair any errors found in the assertion content table
     * @return 0 booleanp; whether the assertion content table is valid
     * @return 1 integerp; the number of invalid entries found in the table
     */
    @LispMethod(comment = "@param REPAIR?\r\n\t\tbooleanp; whether to repair any errors found in the assertion content table\r\n@return 0 booleanp; whether the assertion content table is valid\r\n@return 1 integerp; the number of invalid entries found in the table")
    public static SubLObject verify_assertion_content_table_int(final SubLObject type_pred, SubLObject repairP) {
        if (repairP == UNPROVIDED) {
            repairP = NIL;
        }
        return kb_object_manager.verify_kb_object_content_table_int($assertion_content_manager$.getGlobalValue(), type_pred, repairP);
    }

    static private final SubLString $str_alt5$assertion_index = makeString("assertion-index");

    public static final SubLObject declare_assertion_manager_file_alt() {
        declareFunction("arete_note_assertion_touched", "ARETE-NOTE-ASSERTION-TOUCHED", 1, 0, false);
        declareFunction("setup_assertion_content_table", "SETUP-ASSERTION-CONTENT-TABLE", 2, 0, false);
        declareFunction("optimize_assertion_content_table", "OPTIMIZE-ASSERTION-CONTENT-TABLE", 1, 0, false);
        declareFunction("clear_assertion_content_table", "CLEAR-ASSERTION-CONTENT-TABLE", 0, 0, false);
        declareFunction("maintain_assertion_usage_counts", "MAINTAIN-ASSERTION-USAGE-COUNTS", 0, 0, false);
        declareFunction("dont_maintain_assertion_usage_counts", "DONT-MAINTAIN-ASSERTION-USAGE-COUNTS", 0, 0, false);
        declareFunction("assertion_usage_counts_enabled_p", "ASSERTION-USAGE-COUNTS-ENABLED-P", 0, 0, false);
        declareFunction("cached_assertion_count", "CACHED-ASSERTION-COUNT", 0, 0, false);
        declareFunction("assertion_content_completely_cachedP", "ASSERTION-CONTENT-COMPLETELY-CACHED?", 0, 0, false);
        declareFunction("assertion_content_cached_p", "ASSERTION-CONTENT-CACHED-P", 1, 0, false);
        declareFunction("lookup_assertion_content", "LOOKUP-ASSERTION-CONTENT", 1, 0, false);
        declareFunction("get_file_backed_assertion_id_threshold", "GET-FILE-BACKED-ASSERTION-ID-THRESHOLD", 0, 0, false);
        declareFunction("register_assertion_content", "REGISTER-ASSERTION-CONTENT", 2, 0, false);
        declareFunction("deregister_assertion_content", "DEREGISTER-ASSERTION-CONTENT", 1, 0, false);
        declareFunction("mark_assertion_content_as_muted", "MARK-ASSERTION-CONTENT-AS-MUTED", 1, 0, false);
        declareFunction("meter_assertion_content_swap_time", "METER-ASSERTION-CONTENT-SWAP-TIME", 0, 0, false);
        declareFunction("dont_meter_assertion_content_swap_time", "DONT-METER-ASSERTION-CONTENT-SWAP-TIME", 0, 0, false);
        declareFunction("clear_assertion_content_swap_time", "CLEAR-ASSERTION-CONTENT-SWAP-TIME", 0, 0, false);
        declareFunction("current_assertion_content_swap_time", "CURRENT-ASSERTION-CONTENT-SWAP-TIME", 0, 0, false);
        declareFunction("swap_out_all_pristine_assertions", "SWAP-OUT-ALL-PRISTINE-ASSERTIONS", 0, 0, false);
        declareFunction("initialize_assertion_hl_store_cache", "INITIALIZE-ASSERTION-HL-STORE-CACHE", 0, 0, false);
        declareFunction("verify_assertion_content_table_int", "VERIFY-ASSERTION-CONTENT-TABLE-INT", 1, 1, false);
        return NIL;
    }

    public static SubLObject declare_assertion_manager_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("setup_assertion_content_table", "SETUP-ASSERTION-CONTENT-TABLE", 2, 0, false);
            declareFunction("resize_assertion_content_kbom_lru", "RESIZE-ASSERTION-CONTENT-KBOM-LRU", 0, 2, false);
            declareFunction("optimize_assertion_content_table", "OPTIMIZE-ASSERTION-CONTENT-TABLE", 1, 0, false);
            declareFunction("clear_assertion_content_table", "CLEAR-ASSERTION-CONTENT-TABLE", 0, 0, false);
            declareFunction("maintain_assertion_usage_counts", "MAINTAIN-ASSERTION-USAGE-COUNTS", 0, 0, false);
            declareFunction("dont_maintain_assertion_usage_counts", "DONT-MAINTAIN-ASSERTION-USAGE-COUNTS", 0, 0, false);
            declareFunction("assertion_usage_counts_enabled_p", "ASSERTION-USAGE-COUNTS-ENABLED-P", 0, 0, false);
            declareFunction("cached_assertion_count", "CACHED-ASSERTION-COUNT", 0, 0, false);
            declareFunction("assertion_content_completely_cachedP", "ASSERTION-CONTENT-COMPLETELY-CACHED?", 0, 0, false);
            declareFunction("assertion_content_cached_p", "ASSERTION-CONTENT-CACHED-P", 1, 0, false);
            declareFunction("assertion_content_cachable_p", "ASSERTION-CONTENT-CACHABLE-P", 1, 0, false);
            declareFunction("lookup_assertion_content", "LOOKUP-ASSERTION-CONTENT", 1, 0, false);
            declareFunction("get_file_backed_assertion_id_threshold", "GET-FILE-BACKED-ASSERTION-ID-THRESHOLD", 0, 0, false);
            declareFunction("new_muted_assertion_content_iterator", "NEW-MUTED-ASSERTION-CONTENT-ITERATOR", 0, 0, false);
            declareFunction("assertion_manager_dont_maintain_usages_counts", "ASSERTION-MANAGER-DONT-MAINTAIN-USAGES-COUNTS", 0, 0, false);
            declareFunction("assertion_manager_maintain_usage_counts", "ASSERTION-MANAGER-MAINTAIN-USAGE-COUNTS", 0, 0, false);
            declareFunction("assertion_manager_usage_counts_enabledP", "ASSERTION-MANAGER-USAGE-COUNTS-ENABLED?", 0, 0, false);
            declareFunction("assertion_manager_change_stream_buffer_sizes", "ASSERTION-MANAGER-CHANGE-STREAM-BUFFER-SIZES", 2, 0, false);
            declareFunction("assertion_manager_enable_memory_mapping", "ASSERTION-MANAGER-ENABLE-MEMORY-MAPPING", 0, 0, false);
            declareFunction("assertion_manager_memory_mappedP", "ASSERTION-MANAGER-MEMORY-MAPPED?", 0, 0, false);
            // / 6666
            declareMacro("with_assertion_manager_fully_loaded", "WITH-ASSERTION-MANAGER-FULLY-LOADED");
            declareFunction("register_assertion_content", "REGISTER-ASSERTION-CONTENT", 2, 0, false);
            declareFunction("deregister_assertion_content", "DEREGISTER-ASSERTION-CONTENT", 1, 0, false);
            declareFunction("mark_assertion_content_as_muted", "MARK-ASSERTION-CONTENT-AS-MUTED", 1, 0, false);
            declareFunction("meter_assertion_content_swap_time", "METER-ASSERTION-CONTENT-SWAP-TIME", 0, 0, false);
            declareFunction("dont_meter_assertion_content_swap_time", "DONT-METER-ASSERTION-CONTENT-SWAP-TIME", 0, 0, false);
            declareFunction("clear_assertion_content_swap_time", "CLEAR-ASSERTION-CONTENT-SWAP-TIME", 0, 0, false);
            declareFunction("current_assertion_content_swap_time", "CURRENT-ASSERTION-CONTENT-SWAP-TIME", 0, 0, false);
            declareFunction("swap_out_all_pristine_assertions", "SWAP-OUT-ALL-PRISTINE-ASSERTIONS", 0, 0, false);
            declareFunction("initialize_assertion_hl_store_cache", "INITIALIZE-ASSERTION-HL-STORE-CACHE", 0, 0, false);
            declareFunction("wide_assertion_hl_store_cacheP", "WIDE-ASSERTION-HL-STORE-CACHE?", 0, 0, false);
            declareFunction("verify_assertion_content_table_int", "VERIFY-ASSERTION-CONTENT-TABLE-INT", 1, 1, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("arete_note_assertion_touched", "ARETE-NOTE-ASSERTION-TOUCHED", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_assertion_manager_file_Previous() {
        declareFunction("setup_assertion_content_table", "SETUP-ASSERTION-CONTENT-TABLE", 2, 0, false);
        declareFunction("resize_assertion_content_kbom_lru", "RESIZE-ASSERTION-CONTENT-KBOM-LRU", 0, 2, false);
        declareFunction("optimize_assertion_content_table", "OPTIMIZE-ASSERTION-CONTENT-TABLE", 1, 0, false);
        declareFunction("clear_assertion_content_table", "CLEAR-ASSERTION-CONTENT-TABLE", 0, 0, false);
        declareFunction("maintain_assertion_usage_counts", "MAINTAIN-ASSERTION-USAGE-COUNTS", 0, 0, false);
        declareFunction("dont_maintain_assertion_usage_counts", "DONT-MAINTAIN-ASSERTION-USAGE-COUNTS", 0, 0, false);
        declareFunction("assertion_usage_counts_enabled_p", "ASSERTION-USAGE-COUNTS-ENABLED-P", 0, 0, false);
        declareFunction("cached_assertion_count", "CACHED-ASSERTION-COUNT", 0, 0, false);
        declareFunction("assertion_content_completely_cachedP", "ASSERTION-CONTENT-COMPLETELY-CACHED?", 0, 0, false);
        declareFunction("assertion_content_cached_p", "ASSERTION-CONTENT-CACHED-P", 1, 0, false);
        declareFunction("assertion_content_cachable_p", "ASSERTION-CONTENT-CACHABLE-P", 1, 0, false);
        declareFunction("lookup_assertion_content", "LOOKUP-ASSERTION-CONTENT", 1, 0, false);
        declareFunction("get_file_backed_assertion_id_threshold", "GET-FILE-BACKED-ASSERTION-ID-THRESHOLD", 0, 0, false);
        declareFunction("new_muted_assertion_content_iterator", "NEW-MUTED-ASSERTION-CONTENT-ITERATOR", 0, 0, false);
        declareFunction("assertion_manager_dont_maintain_usages_counts", "ASSERTION-MANAGER-DONT-MAINTAIN-USAGES-COUNTS", 0, 0, false);
        declareFunction("assertion_manager_maintain_usage_counts", "ASSERTION-MANAGER-MAINTAIN-USAGE-COUNTS", 0, 0, false);
        declareFunction("assertion_manager_usage_counts_enabledP", "ASSERTION-MANAGER-USAGE-COUNTS-ENABLED?", 0, 0, false);
        declareFunction("assertion_manager_change_stream_buffer_sizes", "ASSERTION-MANAGER-CHANGE-STREAM-BUFFER-SIZES", 2, 0, false);
        declareFunction("assertion_manager_enable_memory_mapping", "ASSERTION-MANAGER-ENABLE-MEMORY-MAPPING", 0, 0, false);
        declareFunction("assertion_manager_memory_mappedP", "ASSERTION-MANAGER-MEMORY-MAPPED?", 0, 0, false);
        // / 6666
        declareMacro("with_assertion_manager_fully_loaded", "WITH-ASSERTION-MANAGER-FULLY-LOADED");
        declareFunction("register_assertion_content", "REGISTER-ASSERTION-CONTENT", 2, 0, false);
        declareFunction("deregister_assertion_content", "DEREGISTER-ASSERTION-CONTENT", 1, 0, false);
        declareFunction("mark_assertion_content_as_muted", "MARK-ASSERTION-CONTENT-AS-MUTED", 1, 0, false);
        declareFunction("meter_assertion_content_swap_time", "METER-ASSERTION-CONTENT-SWAP-TIME", 0, 0, false);
        declareFunction("dont_meter_assertion_content_swap_time", "DONT-METER-ASSERTION-CONTENT-SWAP-TIME", 0, 0, false);
        declareFunction("clear_assertion_content_swap_time", "CLEAR-ASSERTION-CONTENT-SWAP-TIME", 0, 0, false);
        declareFunction("current_assertion_content_swap_time", "CURRENT-ASSERTION-CONTENT-SWAP-TIME", 0, 0, false);
        declareFunction("swap_out_all_pristine_assertions", "SWAP-OUT-ALL-PRISTINE-ASSERTIONS", 0, 0, false);
        declareFunction("initialize_assertion_hl_store_cache", "INITIALIZE-ASSERTION-HL-STORE-CACHE", 0, 0, false);
        declareFunction("wide_assertion_hl_store_cacheP", "WIDE-ASSERTION-HL-STORE-CACHE?", 0, 0, false);
        declareFunction("verify_assertion_content_table_int", "VERIFY-ASSERTION-CONTENT-TABLE-INT", 1, 1, false);
        return NIL;
    }

    public static final SubLObject init_assertion_manager_file_alt() {
        deflexical("*ARETE-ASSERTIONS-TOUCHED*", NIL != boundp($arete_assertions_touched$) ? ((SubLObject) ($arete_assertions_touched$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
        deflexical("*ASSERTION-CONTENT-MANAGER*", NIL != boundp($assertion_content_manager$) ? ((SubLObject) ($assertion_content_manager$.getGlobalValue())) : $UNINITIALIZED);
        deflexical("*ASSERTION-LRU-SIZE-PERCENTAGE*", SIXTEEN_INTEGER);
        return NIL;
    }

    public static SubLObject init_assertion_manager_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*ASSERTION-CONTENT-MANAGER*", SubLTrampolineFile.maybeDefault($assertion_content_manager$, $assertion_content_manager$, $UNINITIALIZED));
            deflexical("*ASSERTION-LRU-SIZE-PERCENTAGE*", SIXTEEN_INTEGER);
            deflexical("*ASSERTION-LRU-SIZE-MAX*", $int$600000);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*ARETE-ASSERTIONS-TOUCHED*", NIL != boundp($arete_assertions_touched$) ? ((SubLObject) ($arete_assertions_touched$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
            deflexical("*ASSERTION-CONTENT-MANAGER*", NIL != boundp($assertion_content_manager$) ? ((SubLObject) ($assertion_content_manager$.getGlobalValue())) : $UNINITIALIZED);
        }
        return NIL;
    }

    public static SubLObject init_assertion_manager_file_Previous() {
        deflexical("*ASSERTION-CONTENT-MANAGER*", SubLTrampolineFile.maybeDefault($assertion_content_manager$, $assertion_content_manager$, $UNINITIALIZED));
        deflexical("*ASSERTION-LRU-SIZE-PERCENTAGE*", SIXTEEN_INTEGER);
        deflexical("*ASSERTION-LRU-SIZE-MAX*", $int$600000);
        return NIL;
    }

    public static final SubLObject setup_assertion_manager_file_alt() {
        declare_defglobal($arete_assertions_touched$);
        declare_defglobal($assertion_content_manager$);
        return NIL;
    }

    public static SubLObject setup_assertion_manager_file() {
        if (SubLFiles.USE_V1) {
            declare_defglobal($assertion_content_manager$);
        }
        if (SubLFiles.USE_V2) {
            declare_defglobal($arete_assertions_touched$);
        }
        return NIL;
    }

    public static SubLObject setup_assertion_manager_file_Previous() {
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

    
}

