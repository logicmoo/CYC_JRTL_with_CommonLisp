package com.cyc.cycjava.cycl.sbhl;


import static com.cyc.cycjava.cycl.cfasl.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.process_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class sbhl_graphs extends SubLTranslatedFile {
    public static final SubLFile me = new sbhl_graphs();

    public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_graphs";

    public static final String myFingerPrint = "76e981aba1a0b3ec9ef5be18955f17dffcc6831e162872d756153175e40433be";

    // deflexical
    // Temporary -- the equality test used for sbhl-graphs.
    private static final SubLSymbol $sbhl_graph_equality_test$ = makeSymbol("*SBHL-GRAPH-EQUALITY-TEST*");





    // defparameter
    /**
     * The percentage of the graph size for the module that should be cached in
     * memory
     */
    public static final SubLSymbol $sbhl_backing_file_vector_cache_size_percentage$ = makeSymbol("*SBHL-BACKING-FILE-VECTOR-CACHE-SIZE-PERCENTAGE*");

    // defparameter
    /**
     * The minimal size of the cache, in the case of small population (e.g.
     * #$negationMt or #$successorStrict-HL-TimePrecedence)
     */
    public static final SubLSymbol $sbhl_backing_file_vector_cache_minimum_size$ = makeSymbol("*SBHL-BACKING-FILE-VECTOR-CACHE-MINIMUM-SIZE*");

    // defparameter
    /**
     * Whether the caches are supposed to keep metrics of their performance or not.
     */
    public static final SubLSymbol $sbhl_backing_file_vector_cache_gather_cache_metricsP$ = makeSymbol("*SBHL-BACKING-FILE-VECTOR-CACHE-GATHER-CACHE-METRICS?*");



    // deflexical
    /**
     * The allocator to use to get the new caches. Each constructor takes a capacity
     * and an optional equality test.
     */
    public static final SubLSymbol $sbhl_backing_file_vector_cache_constructor$ = makeSymbol("*SBHL-BACKING-FILE-VECTOR-CACHE-CONSTRUCTOR*");

    // defparameter
    private static final SubLSymbol $override_sbhl_isa_module_with_kb_lookupP$ = makeSymbol("*OVERRIDE-SBHL-ISA-MODULE-WITH-KB-LOOKUP?*");

    // deflexical
    public static final SubLSymbol $default_number_of_concurrent_readers$ = makeSymbol("*DEFAULT-NUMBER-OF-CONCURRENT-READERS*");

    // deflexical
    public static final SubLSymbol $default_number_of_terms_checked$ = makeSymbol("*DEFAULT-NUMBER-OF-TERMS-CHECKED*");

    // Internal Constants
    public static final SubLSymbol $sbhl_backing_file_vector$ = makeSymbol("*SBHL-BACKING-FILE-VECTOR*");

    public static final SubLSymbol $sbhl_backing_file_vector_caches_for_modules$ = makeSymbol("*SBHL-BACKING-FILE-VECTOR-CACHES-FOR-MODULES*");



    public static final SubLSymbol $sbhl_file_vector_data_stream_lock$ = makeSymbol("*SBHL-FILE-VECTOR-DATA-STREAM-LOCK*");

    public static final SubLString $$$SBHL_File_Vector_Data_Stream_lock = makeString("SBHL File Vector Data Stream lock");

    public static final SubLSymbol NEW_METERED_PREALLOCATED_CACHE = makeSymbol("NEW-METERED-PREALLOCATED-CACHE");

    public static final SubLString $str6$sbhl_module_graphs = makeString("sbhl-module-graphs");

    public static final SubLString $$$cfasl = makeString("cfasl");

    public static final SubLString $str8$sbhl_module_graphs_index = makeString("sbhl-module-graphs-index");





    public static final SubLSymbol CACHE_STRATEGY_OR_SYMBOL_P = makeSymbol("CACHE-STRATEGY-OR-SYMBOL-P");





    public static final SubLString $str14$_A_is_not_a__A = makeString("~A is not a ~A");

    public static final SubLSymbol SBHL_DIRECTION_LINK_P = makeSymbol("SBHL-DIRECTION-LINK-P");



    public static final SubLString $$$continue_anyway = makeString("continue anyway");



    public static final SubLString $str19$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    public static final SubLSymbol SBHL_NODE_OBJECT_P = makeSymbol("SBHL-NODE-OBJECT-P");

    public static final SubLList $list21 = list(list(makeSymbol("NODE-VAR"), makeSymbol("LINK-VAR"), makeSymbol("&KEY"), makeSymbol("MODULE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list22 = list(makeKeyword("MODULE"), makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");





    public static final SubLSymbol $sym26$MAP = makeUninternedSymbol("MAP");

    private static final SubLSymbol WITH_FILE_VECTOR_BACKED_MAP_STREAM_LOCK = makeSymbol("WITH-FILE-VECTOR-BACKED-MAP-STREAM-LOCK");

    public static final SubLList $list28 = list(makeSymbol("*SBHL-FILE-VECTOR-DATA-STREAM-LOCK*"));

    private static final SubLSymbol WITH_CFASL_COMMON_SYMBOLS_SIMPLE = makeSymbol("WITH-CFASL-COMMON-SYMBOLS-SIMPLE");

    private static final SubLList $list30 = list(makeSymbol("GET-HL-STORE-CACHES-SHARED-SYMBOLS-SIMPLE"));



    private static final SubLSymbol GET_SBHL_GRAPH = makeSymbol("GET-SBHL-GRAPH");

    private static final SubLSymbol DO_FILE_VECTOR_BACKED_MAP = makeSymbol("DO-FILE-VECTOR-BACKED-MAP");

    private static final SubLList $list34 = list(makeSymbol("NODE"), makeUninternedSymbol("IMPL-VALUE"));

    private static final SubLString $str35$Capacity______Hits____Misses__Sma = makeString("Capacity      Hits    Misses  Small?~%");

    private static final SubLString $str36$_________________________________ = makeString("------------------------------------~%");

    private static final SubLSymbol $sym37$FORT__ = makeSymbol("FORT-<");

    private static final SubLString $str38$___A = makeString("~&~A");

    private static final SubLList $list39 = list(makeSymbol("PREDICATE-AGAIN"), makeSymbol("CAPACITY"), makeSymbol("HITS"), makeSymbol("MISSES"), makeSymbol("TOO-SMALL-P"));

    private static final SubLString $str40$_6_A__9_A__9_A__ = makeString("~6,A ~9,A ~9,A~%");

    public static final SubLString $str41$___ = makeString("---");

    private static final SubLString $str42$_6_d__9_d__9_d_____A__ = makeString("~6,d ~9,d ~9,d    ~A~%");

    private static final SubLString $str43$___ = makeString("!!!");

    private static final SubLString $str44$ = makeString("");

    private static final SubLInteger $int$500 = makeInteger(500);

    private static final SubLString $str46$Concurrent_Reads_Stress_Test_Prob = makeString("Concurrent Reads Stress Test Problems");

    private static final SubLString $$$Concurrent_SBHL_Reader_ = makeString("Concurrent SBHL Reader ");

    private static final SubLSymbol STRESS_TEST_READ_RANDOMLY_FROM_SBHL = makeSymbol("STRESS-TEST-READ-RANDOMLY-FROM-SBHL");

    private static final SubLFloat $float$0_1 = makeDouble(0.1);

    private static final SubLSymbol VALID_PROCESS_P = makeSymbol("VALID-PROCESS-P");



    private static final SubLObject $$Individual = reader_make_constant_shell(makeString("Individual"));

    private static final SubLString $str53$Concurrent_Cache_Strategy_Stress_ = makeString("Concurrent Cache Strategy Stress Test Problems");

    private static final SubLList $list54 = list(reader_make_constant_shell(makeString("Organism")));

    private static final SubLSymbol STRESS_TEST_CHECK_SAME_SPECS = makeSymbol("STRESS-TEST-CHECK-SAME-SPECS");

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    public static SubLObject optimize_sbhl_store() {
        return NIL;
    }

    public static SubLObject sbhl_graph_object_p(final SubLObject v_object) {
        return hash_table_p(v_object);
    }

    public static SubLObject make_new_sbhl_graph() {
        return make_hash_table(ZERO_INTEGER, $sbhl_graph_equality_test$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject clear_sbhl_graph(final SubLObject v_graph) {
        clrhash(v_graph);
        return NIL;
    }

    public static SubLObject initialize_sbhl_graph_caches() {
        final SubLObject data_file = misc_utilities.get_hl_store_cache_filename($str6$sbhl_module_graphs, $$$cfasl);
        final SubLObject index_file = misc_utilities.get_hl_store_cache_filename($str8$sbhl_module_graphs_index, $$$cfasl);
        if ((NIL != Filesys.probe_file(data_file)) && (NIL != Filesys.probe_file(index_file))) {
            initialize_sbhl_graph_caches_file_vector(data_file, index_file);
            return $INITIALIZED;
        }
        return $UNINITIALIZED;
    }

    public static SubLObject initialize_sbhl_graph_caches_file_vector(final SubLObject data_file, final SubLObject index_file) {
        SubLObject release = NIL;
        try {
            release = seize_lock($sbhl_file_vector_data_stream_lock$.getGlobalValue());
            if (NIL != file_vector.file_vector_p($sbhl_backing_file_vector$.getGlobalValue())) {
                file_vector.close_file_vector($sbhl_backing_file_vector$.getGlobalValue());
            }
            $sbhl_backing_file_vector$.setGlobalValue(file_vector.new_file_vector(data_file, index_file, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            sbhl_enable_memory_mapping();
        } finally {
            if (NIL != release) {
                release_lock($sbhl_file_vector_data_stream_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject sbhl_change_stream_buffer_sizes(final SubLObject data_stream_buffer_size, final SubLObject index_stream_buffer_size) {
        SubLObject result = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($sbhl_file_vector_data_stream_lock$.getGlobalValue());
            result = file_vector.file_vector_change_stream_buffer_sizes($sbhl_backing_file_vector$.getGlobalValue(), data_stream_buffer_size, index_stream_buffer_size);
        } finally {
            if (NIL != release) {
                release_lock($sbhl_file_vector_data_stream_lock$.getGlobalValue());
            }
        }
        return result;
    }

    public static SubLObject sbhl_enable_memory_mapping() {
        SubLObject result = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($sbhl_file_vector_data_stream_lock$.getGlobalValue());
            result = file_vector.file_vector_enable_memory_mapping($sbhl_backing_file_vector$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock($sbhl_file_vector_data_stream_lock$.getGlobalValue());
            }
        }
        return result;
    }

    public static SubLObject new_cache_strategy_for_sbhl_module(final SubLObject sbhl_module, SubLObject capacity) {
        if (capacity == UNPROVIDED) {
            capacity = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cache_capacity = (NIL != subl_promotions.non_negative_integer_p(capacity)) ? capacity : cache_capacity_for_cache_strategy_for_sbhl_module(sbhl_module);
        final SubLObject cache_strategy = funcall($sbhl_backing_file_vector_cache_constructor$.getGlobalValue(), cache_capacity);
        if (NIL != $sbhl_backing_file_vector_cache_gather_cache_metricsP$.getDynamicValue(thread)) {
            cache_utilities.cache_strategy_gather_metrics(cache_strategy);
        }
        return cache_strategy;
    }

    public static SubLObject get_cache_strategy_for_sbhl_module(final SubLObject sbhl_module) {
        SubLObject v_cache = list_utilities.alist_lookup_without_values($sbhl_backing_file_vector_caches_for_modules$.getGlobalValue(), sbhl_module, UNPROVIDED, UNPROVIDED);
        if (NIL == v_cache) {
            v_cache = new_cache_strategy_for_sbhl_module(sbhl_module, UNPROVIDED);
            set_cache_strategy_for_sbhl_module(sbhl_module, v_cache);
        }
        return v_cache;
    }

    public static SubLObject set_cache_strategy_for_sbhl_module(final SubLObject sbhl_module, final SubLObject cache_strategy) {
        assert NIL != cache_utilities.cache_strategy_or_symbol_p(cache_strategy) : "cache_utilities.cache_strategy_or_symbol_p(cache_strategy) " + "CommonSymbols.NIL != cache_utilities.cache_strategy_or_symbol_p(cache_strategy) " + cache_strategy;
        $sbhl_backing_file_vector_caches_for_modules$.setGlobalValue(list_utilities.alist_enter($sbhl_backing_file_vector_caches_for_modules$.getGlobalValue(), sbhl_module, cache_strategy, UNPROVIDED));
        return sbhl_module;
    }

    public static SubLObject cache_capacity_for_cache_strategy_for_sbhl_module(final SubLObject sbhl_module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_graph = sbhl_module_vars.get_sbhl_module_graph(sbhl_module);
        final SubLObject graph_size = map_utilities.map_size(v_graph);
        final SubLObject estimated_cache_size = integerDivide(multiply(graph_size, $sbhl_backing_file_vector_cache_size_percentage$.getDynamicValue(thread)), $int$100);
        return max($sbhl_backing_file_vector_cache_minimum_size$.getDynamicValue(thread), estimated_cache_size);
    }

    public static SubLObject initialize_sbhl_graph_caches_during_load_kb(final SubLObject data_file, final SubLObject index_file) {
        return initialize_sbhl_graph_caches_file_vector(data_file, index_file);
    }

    public static SubLObject sbhl_graph_completely_cachedP() {
        return T;
    }

    public static SubLObject get_sbhl_module_caching_ratio(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        final SubLObject v_graph = sbhl_module_utilities.get_sbhl_graph(module);
        thread.resetMultipleValues();
        final SubLObject paged_in = file_vector_utilities.file_vector_backed_map_cache_ratio(v_graph);
        final SubLObject paged_out = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(paged_in, add(paged_in, paged_out));
    }

    public static SubLObject get_sbhl_modules_caching_ratios() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total_paged_in = ZERO_INTEGER;
        SubLObject sum_total = ZERO_INTEGER;
        SubLObject results = NIL;
        SubLObject cdolist_list_var = sbhl_module_vars.get_sbhl_module_list();
        SubLObject sbhl_module = NIL;
        sbhl_module = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject predicate = sbhl_module_vars.get_sbhl_module_link_pred(sbhl_module);
            thread.resetMultipleValues();
            final SubLObject paged_in = get_sbhl_module_caching_ratio(sbhl_module);
            final SubLObject total = thread.secondMultipleValue();
            thread.resetMultipleValues();
            total_paged_in = add(total_paged_in, paged_in);
            sum_total = add(sum_total, total);
            results = cons(list(predicate, paged_in, total), results);
            cdolist_list_var = cdolist_list_var.rest();
            sbhl_module = cdolist_list_var.first();
        } 
        return values(nreverse(results), total_paged_in, sum_total);
    }

    public static SubLObject get_sbhl_graph_link_from_graph(final SubLObject node, final SubLObject v_graph, final SubLObject v_cache) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $cfasl_common_symbols$.currentBinding(thread);
        try {
            file_vector_utilities.$file_vector_backed_map_read_lock$.bind($sbhl_file_vector_data_stream_lock$.getGlobalValue(), thread);
            $cfasl_common_symbols$.bind(NIL, thread);
            cfasl_set_common_symbols_simple(misc_utilities.get_hl_store_caches_shared_symbols_simple());
            result = file_vector_utilities.file_vector_backed_map_wX_cache_get(v_graph, $sbhl_backing_file_vector$.getGlobalValue(), v_cache, node, UNPROVIDED);
        } finally {
            $cfasl_common_symbols$.rebind(_prev_bind_2, thread);
            file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject put_sbhl_graph_link_into_graph(final SubLObject node, final SubLObject v_graph, final SubLObject v_cache, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $cfasl_common_symbols$.currentBinding(thread);
        try {
            file_vector_utilities.$file_vector_backed_map_read_lock$.bind($sbhl_file_vector_data_stream_lock$.getGlobalValue(), thread);
            $cfasl_common_symbols$.bind(NIL, thread);
            cfasl_set_common_symbols_simple(misc_utilities.get_hl_store_caches_shared_symbols_simple());
            result = file_vector_utilities.file_vector_backed_map_wX_cache_put(v_graph, v_cache, node, value);
        } finally {
            $cfasl_common_symbols$.rebind(_prev_bind_2, thread);
            file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject remove_sbhl_graph_link_from_graph(final SubLObject node, final SubLObject v_graph, final SubLObject v_cache) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $cfasl_common_symbols$.currentBinding(thread);
        try {
            file_vector_utilities.$file_vector_backed_map_read_lock$.bind($sbhl_file_vector_data_stream_lock$.getGlobalValue(), thread);
            $cfasl_common_symbols$.bind(NIL, thread);
            cfasl_set_common_symbols_simple(misc_utilities.get_hl_store_caches_shared_symbols_simple());
            result = file_vector_utilities.file_vector_backed_map_wX_cache_remove(v_graph, v_cache, node, UNPROVIDED);
        } finally {
            $cfasl_common_symbols$.rebind(_prev_bind_2, thread);
            file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject touch_sbhl_link_graph(final SubLObject node, final SubLObject v_graph, final SubLObject v_cache) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $cfasl_common_symbols$.currentBinding(thread);
        try {
            file_vector_utilities.$file_vector_backed_map_read_lock$.bind($sbhl_file_vector_data_stream_lock$.getGlobalValue(), thread);
            $cfasl_common_symbols$.bind(NIL, thread);
            cfasl_set_common_symbols_simple(misc_utilities.get_hl_store_caches_shared_symbols_simple());
            result = file_vector_utilities.file_vector_backed_map_wX_cache_touch(v_graph, v_cache, node, $sbhl_backing_file_vector$.getGlobalValue());
        } finally {
            $cfasl_common_symbols$.rebind(_prev_bind_2, thread);
            file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject get_sbhl_graph_link(final SubLObject node, final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        SubLObject result = NIL;
        final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
            final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding(thread);
            try {
                kb_storage_logging.$kb_storage_client$.bind(kb_storage_logging.add_kb_storage_logging_add_tag(logging_tag_for_module(module)), thread);
                result = get_sbhl_graph_link_from_graph(node, sbhl_module_utilities.get_sbhl_graph(module), get_cache_strategy_for_sbhl_module(module));
            } finally {
                kb_storage_logging.$kb_storage_client$.rebind(_prev_bind_0, thread);
            }
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
            }
        }
        return result;
    }

    public static SubLObject set_sbhl_graph_link(final SubLObject node, final SubLObject direction_link, final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_links.sbhl_direction_link_p(direction_link))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str14$_A_is_not_a__A, direction_link, SBHL_DIRECTION_LINK_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str14$_A_is_not_a__A, direction_link, SBHL_DIRECTION_LINK_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn($str14$_A_is_not_a__A, direction_link, SBHL_DIRECTION_LINK_P);
                    } else {
                        Errors.warn($str19$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror($$$continue_anyway, $str14$_A_is_not_a__A, direction_link, SBHL_DIRECTION_LINK_P);
                    }


        }
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_link_vars.sbhl_node_object_p(node))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str14$_A_is_not_a__A, node, SBHL_NODE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str14$_A_is_not_a__A, node, SBHL_NODE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn($str14$_A_is_not_a__A, node, SBHL_NODE_OBJECT_P);
                    } else {
                        Errors.warn($str19$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror($$$continue_anyway, $str14$_A_is_not_a__A, node, SBHL_NODE_OBJECT_P);
                    }


        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding(thread);
            try {
                kb_storage_logging.$kb_storage_client$.bind(kb_storage_logging.add_kb_storage_logging_add_tag(logging_tag_for_module(module)), thread);
                put_sbhl_graph_link_into_graph(node, sbhl_module_utilities.get_sbhl_graph(module), get_cache_strategy_for_sbhl_module(module), direction_link);
            } finally {
                kb_storage_logging.$kb_storage_client$.rebind(_prev_bind_0, thread);
            }
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
        return NIL;
    }

    public static SubLObject touch_sbhl_graph_link(final SubLObject node, final SubLObject direction_link, final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_link_vars.sbhl_node_object_p(node))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str14$_A_is_not_a__A, node, SBHL_NODE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str14$_A_is_not_a__A, node, SBHL_NODE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn($str14$_A_is_not_a__A, node, SBHL_NODE_OBJECT_P);
                    } else {
                        Errors.warn($str19$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror($$$continue_anyway, $str14$_A_is_not_a__A, node, SBHL_NODE_OBJECT_P);
                    }


        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding(thread);
            try {
                kb_storage_logging.$kb_storage_client$.bind(kb_storage_logging.add_kb_storage_logging_add_tag(logging_tag_for_module(module)), thread);
                touch_sbhl_link_graph(node, sbhl_module_utilities.get_sbhl_graph(module), get_cache_strategy_for_sbhl_module(module));
            } finally {
                kb_storage_logging.$kb_storage_client$.rebind(_prev_bind_0, thread);
            }
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
        return NIL;
    }

    public static SubLObject logging_tag_for_module(final SubLObject module) {
        return constants_high.constant_name(sbhl_module_vars.get_sbhl_module_link_pred(module));
    }

    public static SubLObject remove_sbhl_graph_link(final SubLObject node, final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            remove_sbhl_graph_link_from_graph(node, sbhl_module_utilities.get_sbhl_graph(module), get_cache_strategy_for_sbhl_module(module));
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
        return NIL;
    }

    public static SubLObject do_sbhl_graph_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list21);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject node_var = NIL;
        SubLObject link_var = NIL;
        destructuring_bind_must_consp(current, datum, $list21);
        node_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list21);
        link_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list21);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list21);
            if (NIL == member(current_$1, $list22, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list21);
        }
        final SubLObject module_tail = property_list_member($MODULE, current);
        final SubLObject module = (NIL != module_tail) ? cadr(module_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject map = $sym26$MAP;
        return list(WITH_FILE_VECTOR_BACKED_MAP_STREAM_LOCK, $list28, list(WITH_CFASL_COMMON_SYMBOLS_SIMPLE, $list30, list(CLET, list(list(map, list(GET_SBHL_GRAPH, module))), listS(DO_FILE_VECTOR_BACKED_MAP, list(node_var, link_var, map, $sbhl_backing_file_vector$, $DONE, done), append(body, NIL)))));
    }

    public static SubLObject swap_in_all_graph_links(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $cfasl_common_symbols$.currentBinding(thread);
        try {
            file_vector_utilities.$file_vector_backed_map_read_lock$.bind($sbhl_file_vector_data_stream_lock$.getGlobalValue(), thread);
            $cfasl_common_symbols$.bind(NIL, thread);
            cfasl_set_common_symbols_simple(misc_utilities.get_hl_store_caches_shared_symbols_simple());
            final SubLObject map = sbhl_module_utilities.get_sbhl_graph(module);
            SubLObject link = NIL;
            final SubLObject iterator = map_utilities.new_map_iterator(map);
            SubLObject valid;
            for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject var = iteration.iteration_next(iterator);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != valid) {
                    SubLObject current;
                    final SubLObject datum = current = var;
                    SubLObject node = NIL;
                    SubLObject impl_value = NIL;
                    destructuring_bind_must_consp(current, datum, $list34);
                    node = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list34);
                    impl_value = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if ((NIL == file_vector_utilities.file_vector_reference_p(impl_value)) || (NIL == file_vector_utilities.file_vector_reference_deletedP(impl_value))) {
                            link = file_vector_utilities.file_vector_backed_map_wX_cache_get(map, $sbhl_backing_file_vector$.getGlobalValue(), NIL, node, UNPROVIDED);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list34);
                    }
                }
            }
        } finally {
            $cfasl_common_symbols$.rebind(_prev_bind_2, thread);
            file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
        }
        return module;
    }

    public static SubLObject swap_out_all_pristine_graph_links(final SubLObject module) {
        file_vector_utilities.swap_out_all_pristine_file_vector_backed_map_objects(sbhl_module_utilities.get_sbhl_graph(module));
        return module;
    }

    public static SubLObject swap_out_all_pristine_sbhl_module_graph_links() {
        SubLObject cdolist_list_var = sbhl_module_vars.get_sbhl_module_list();
        SubLObject sbhl_module = NIL;
        sbhl_module = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
            SubLObject needs_to_releaseP = NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                swap_out_all_pristine_graph_links(sbhl_module);
            } finally {
                if (NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            sbhl_module = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject get_sbhl_module_cache_strategy_metrics(final SubLObject module) {
        final SubLObject cache_strategy = get_cache_strategy_for_sbhl_module(module);
        if (NIL != cache_utilities.cache_strategy_keeps_metrics_p(cache_strategy)) {
            return cache_utilities.cache_strategy_get_metrics(cache_strategy);
        }
        return NIL;
    }

    public static SubLObject get_all_sbhl_module_cache_strategy_metrics() {
        SubLObject all_metrics = NIL;
        SubLObject cdolist_list_var = sbhl_module_vars.get_sbhl_module_list();
        SubLObject module = NIL;
        module = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject metrics = get_sbhl_module_cache_strategy_metrics(module);
            if (NIL != cache_utilities.cache_metrics_p(metrics)) {
                all_metrics = cons(cons(sbhl_module_vars.get_sbhl_module_link_pred(module), metrics), all_metrics);
            }
            cdolist_list_var = cdolist_list_var.rest();
            module = cdolist_list_var.first();
        } 
        return nreverse(all_metrics);
    }

    public static SubLObject get_sbhl_module_cache_strategy_information(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = sbhl_module_vars.get_sbhl_module_link_pred(module);
        final SubLObject cache_strategy = get_cache_strategy_for_sbhl_module(module);
        if (NIL == cache_utilities.cache_strategy_p(cache_strategy)) {
            return values(predicate, MINUS_ONE_INTEGER, MINUS_ONE_INTEGER, MINUS_ONE_INTEGER, NIL);
        }
        thread.resetMultipleValues();
        final SubLObject cache_capacity = cache_utilities.gather_cache_strategy_information(cache_strategy);
        final SubLObject hits = thread.secondMultipleValue();
        final SubLObject misses = thread.thirdMultipleValue();
        final SubLObject cache_too_small_p = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        return values(predicate, cache_capacity, hits, misses, cache_too_small_p);
    }

    public static SubLObject show_all_sbhl_module_cache_strategies() {
        final SubLObject sbhl_modules = sbhl_module_vars.get_sbhl_module_list();
        final SubLObject info = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        SubLObject pred_list = NIL;
        SubLObject max_name_length = ZERO_INTEGER;
        SubLObject cdolist_list_var = sbhl_modules;
        SubLObject module = NIL;
        module = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject module_info = arg2(resetMultipleValues(), multiple_value_list(get_sbhl_module_cache_strategy_information(module)));
            final SubLObject predicate = module_info.first();
            map_utilities.map_put(info, predicate, module_info);
            pred_list = cons(predicate, pred_list);
            max_name_length = max(max_name_length, length(kb_paths.fort_name(predicate)));
            cdolist_list_var = cdolist_list_var.rest();
            module = cdolist_list_var.first();
        } 
        string_utilities.indent(T, max_name_length);
        format(T, $str35$Capacity______Hits____Misses__Sma);
        string_utilities.indent(T, max_name_length);
        format(T, $str36$_________________________________);
        pred_list = cdolist_list_var = Sort.sort(pred_list, $sym37$FORT__, UNPROVIDED);
        SubLObject predicate2 = NIL;
        predicate2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject module_info = map_utilities.map_get(info, predicate2, UNPROVIDED);
            format(T, $str38$___A, predicate2);
            string_utilities.indent(T, subtract(max_name_length, length(kb_paths.fort_name(predicate2))));
            SubLObject current;
            final SubLObject datum = current = module_info;
            SubLObject predicate_again = NIL;
            SubLObject capacity = NIL;
            SubLObject hits = NIL;
            SubLObject misses = NIL;
            SubLObject too_small_p = NIL;
            destructuring_bind_must_consp(current, datum, $list39);
            predicate_again = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list39);
            capacity = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list39);
            hits = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list39);
            misses = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list39);
            too_small_p = current.first();
            current = current.rest();
            if (NIL == current) {
                if (capacity.isNegative()) {
                    format(T, $str40$_6_A__9_A__9_A__, new SubLObject[]{ $str41$___, $str41$___, $str41$___ });
                } else {
                    format(T, $str42$_6_d__9_d__9_d_____A__, new SubLObject[]{ capacity, hits, misses, NIL != too_small_p ? $str43$___ : $str44$ });
                }
            } else {
                cdestructuring_bind_error(datum, $list39);
            }
            cdolist_list_var = cdolist_list_var.rest();
            predicate2 = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject stress_test_sbhl_graph_concurrent_swapping(SubLObject checker_count, SubLObject term_count) {
        if (checker_count == UNPROVIDED) {
            checker_count = $default_number_of_concurrent_readers$.getGlobalValue();
        }
        if (term_count == UNPROVIDED) {
            term_count = $default_number_of_terms_checked$.getGlobalValue();
        }
        final SubLObject problem_queue = process_utilities.new_ipc_queue($str46$Concurrent_Reads_Stress_Test_Prob);
        SubLObject checkers = NIL;
        SubLObject issue_list = NIL;
        SubLObject i;
        SubLObject name;
        SubLObject checker;
        for (i = NIL, i = ZERO_INTEGER; i.numL(checker_count); i = add(i, ONE_INTEGER)) {
            name = cconcatenate($$$Concurrent_SBHL_Reader_, format_nil.format_nil_a_no_copy(add(ONE_INTEGER, i)));
            checker = subl_promotions.make_process_with_args(name, STRESS_TEST_READ_RANDOMLY_FROM_SBHL, list(term_count, problem_queue));
            sleep($float$0_1);
            checkers = cons(checker, checkers);
        }
        while (position_if(VALID_PROCESS_P, checkers, UNPROVIDED, UNPROVIDED, UNPROVIDED).isNumber()) {
            sleep(ONE_INTEGER);
        } 
        while (process_utilities.ipc_current_queue_size(problem_queue).isPositive()) {
            issue_list = cons(process_utilities.ipc_dequeue(problem_queue, UNPROVIDED), issue_list);
        } 
        if (NIL != list_utilities.sublisp_boolean(issue_list)) {
            swap_out_all_pristine_sbhl_module_graph_links();
        }
        return issue_list;
    }

    public static SubLObject stress_test_read_randomly_from_sbhl(final SubLObject term_count, final SubLObject problem_queue) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject i;
        SubLObject curr_term;
        SubLObject error_message;
        SubLObject _prev_bind_0;
        for (i = NIL, i = ZERO_INTEGER; i.numL(term_count); i = add(i, ONE_INTEGER)) {
            curr_term = constants_high.random_constant(UNPROVIDED);
            error_message = NIL;
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        isa.isa_in_any_mtP(curr_term, $$Individual);
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
            if (error_message.isString()) {
                process_utilities.ipc_enqueue(cons(curr_term, error_message), problem_queue, UNPROVIDED);
            }
        }
        return $DONE;
    }

    public static SubLObject stress_test_sbhl_graph_concurrent_cache_strategy_update(SubLObject checker_count) {
        if (checker_count == UNPROVIDED) {
            checker_count = $default_number_of_concurrent_readers$.getGlobalValue();
        }
        final SubLObject problem_queue = process_utilities.new_ipc_queue($str53$Concurrent_Cache_Strategy_Stress_);
        SubLObject checkers = NIL;
        SubLObject issue_list = NIL;
        final SubLObject term_list = $list54;
        final SubLObject process_args = list(checker_count, term_list, problem_queue);
        SubLObject i;
        SubLObject name;
        SubLObject checker;
        for (i = NIL, i = ZERO_INTEGER; i.numL(checker_count); i = add(i, ONE_INTEGER)) {
            name = cconcatenate($$$Concurrent_SBHL_Reader_, format_nil.format_nil_a_no_copy(add(ONE_INTEGER, i)));
            checker = subl_promotions.make_process_with_args(name, STRESS_TEST_CHECK_SAME_SPECS, process_args);
            sleep($float$0_1);
            checkers = cons(checker, checkers);
        }
        while (position_if(VALID_PROCESS_P, checkers, UNPROVIDED, UNPROVIDED, UNPROVIDED).isNumber()) {
            sleep(ONE_INTEGER);
        } 
        while (process_utilities.ipc_current_queue_size(problem_queue).isPositive()) {
            issue_list = cons(process_utilities.ipc_dequeue(problem_queue, UNPROVIDED), issue_list);
        } 
        if (NIL != list_utilities.sublisp_boolean(issue_list)) {
            swap_out_all_pristine_sbhl_module_graph_links();
        }
        return issue_list;
    }

    public static SubLObject stress_test_check_same_specs(final SubLObject attempts, final SubLObject term_list, final SubLObject problem_queue) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject problems = NIL;
        SubLObject cdolist_list_var = term_list;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject count;
            SubLObject error_message;
            SubLObject _prev_bind_0;
            for (count = NIL, count = ZERO_INTEGER; count.numL(attempts); count = add(count, ONE_INTEGER)) {
                error_message = NIL;
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            genls.all_specs(v_term, $$InferencePSC, UNPROVIDED);
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
                if (error_message.isString()) {
                    problems = cons(list(v_term, count, error_message), problems);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        cdolist_list_var = nreverse(problems);
        SubLObject problem = NIL;
        problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            process_utilities.ipc_enqueue(problem, problem_queue, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            problem = cdolist_list_var.first();
        } 
        return $DONE;
    }

    public static SubLObject declare_sbhl_graphs_file() {
        declareFunction(me, "optimize_sbhl_store", "OPTIMIZE-SBHL-STORE", 0, 0, false);
        declareFunction(me, "sbhl_graph_object_p", "SBHL-GRAPH-OBJECT-P", 1, 0, false);
        declareFunction(me, "make_new_sbhl_graph", "MAKE-NEW-SBHL-GRAPH", 0, 0, false);
        declareFunction(me, "clear_sbhl_graph", "CLEAR-SBHL-GRAPH", 1, 0, false);
        declareFunction(me, "initialize_sbhl_graph_caches", "INITIALIZE-SBHL-GRAPH-CACHES", 0, 0, false);
        declareFunction(me, "initialize_sbhl_graph_caches_file_vector", "INITIALIZE-SBHL-GRAPH-CACHES-FILE-VECTOR", 2, 0, false);
        declareFunction(me, "sbhl_change_stream_buffer_sizes", "SBHL-CHANGE-STREAM-BUFFER-SIZES", 2, 0, false);
        declareFunction(me, "sbhl_enable_memory_mapping", "SBHL-ENABLE-MEMORY-MAPPING", 0, 0, false);
        declareFunction(me, "new_cache_strategy_for_sbhl_module", "NEW-CACHE-STRATEGY-FOR-SBHL-MODULE", 1, 1, false);
        declareFunction(me, "get_cache_strategy_for_sbhl_module", "GET-CACHE-STRATEGY-FOR-SBHL-MODULE", 1, 0, false);
        declareFunction(me, "set_cache_strategy_for_sbhl_module", "SET-CACHE-STRATEGY-FOR-SBHL-MODULE", 2, 0, false);
        declareFunction(me, "cache_capacity_for_cache_strategy_for_sbhl_module", "CACHE-CAPACITY-FOR-CACHE-STRATEGY-FOR-SBHL-MODULE", 1, 0, false);
        declareFunction(me, "initialize_sbhl_graph_caches_during_load_kb", "INITIALIZE-SBHL-GRAPH-CACHES-DURING-LOAD-KB", 2, 0, false);
        declareFunction(me, "sbhl_graph_completely_cachedP", "SBHL-GRAPH-COMPLETELY-CACHED?", 0, 0, false);
        declareFunction(me, "get_sbhl_module_caching_ratio", "GET-SBHL-MODULE-CACHING-RATIO", 1, 0, false);
        declareFunction(me, "get_sbhl_modules_caching_ratios", "GET-SBHL-MODULES-CACHING-RATIOS", 0, 0, false);
        declareFunction(me, "get_sbhl_graph_link_from_graph", "GET-SBHL-GRAPH-LINK-FROM-GRAPH", 3, 0, false);
        declareFunction(me, "put_sbhl_graph_link_into_graph", "PUT-SBHL-GRAPH-LINK-INTO-GRAPH", 4, 0, false);
        declareFunction(me, "remove_sbhl_graph_link_from_graph", "REMOVE-SBHL-GRAPH-LINK-FROM-GRAPH", 3, 0, false);
        declareFunction(me, "touch_sbhl_link_graph", "TOUCH-SBHL-LINK-GRAPH", 3, 0, false);
        declareFunction(me, "get_sbhl_graph_link", "GET-SBHL-GRAPH-LINK", 2, 0, false);
        declareFunction(me, "set_sbhl_graph_link", "SET-SBHL-GRAPH-LINK", 3, 0, false);
        declareFunction(me, "touch_sbhl_graph_link", "TOUCH-SBHL-GRAPH-LINK", 3, 0, false);
        declareFunction(me, "logging_tag_for_module", "LOGGING-TAG-FOR-MODULE", 1, 0, false);
        declareFunction(me, "remove_sbhl_graph_link", "REMOVE-SBHL-GRAPH-LINK", 2, 0, false);
        declareMacro(me, "do_sbhl_graph_links", "DO-SBHL-GRAPH-LINKS");
        declareFunction(me, "swap_in_all_graph_links", "SWAP-IN-ALL-GRAPH-LINKS", 1, 0, false);
        declareFunction(me, "swap_out_all_pristine_graph_links", "SWAP-OUT-ALL-PRISTINE-GRAPH-LINKS", 1, 0, false);
        declareFunction(me, "swap_out_all_pristine_sbhl_module_graph_links", "SWAP-OUT-ALL-PRISTINE-SBHL-MODULE-GRAPH-LINKS", 0, 0, false);
        declareFunction(me, "get_sbhl_module_cache_strategy_metrics", "GET-SBHL-MODULE-CACHE-STRATEGY-METRICS", 1, 0, false);
        declareFunction(me, "get_all_sbhl_module_cache_strategy_metrics", "GET-ALL-SBHL-MODULE-CACHE-STRATEGY-METRICS", 0, 0, false);
        declareFunction(me, "get_sbhl_module_cache_strategy_information", "GET-SBHL-MODULE-CACHE-STRATEGY-INFORMATION", 1, 0, false);
        declareFunction(me, "show_all_sbhl_module_cache_strategies", "SHOW-ALL-SBHL-MODULE-CACHE-STRATEGIES", 0, 0, false);
        declareFunction(me, "stress_test_sbhl_graph_concurrent_swapping", "STRESS-TEST-SBHL-GRAPH-CONCURRENT-SWAPPING", 0, 2, false);
        declareFunction(me, "stress_test_read_randomly_from_sbhl", "STRESS-TEST-READ-RANDOMLY-FROM-SBHL", 2, 0, false);
        declareFunction(me, "stress_test_sbhl_graph_concurrent_cache_strategy_update", "STRESS-TEST-SBHL-GRAPH-CONCURRENT-CACHE-STRATEGY-UPDATE", 0, 1, false);
        declareFunction(me, "stress_test_check_same_specs", "STRESS-TEST-CHECK-SAME-SPECS", 3, 0, false);
        return NIL;
    }

    public static SubLObject init_sbhl_graphs_file() {
        deflexical("*SBHL-GRAPH-EQUALITY-TEST*", symbol_function(EQL));
        deflexical("*SBHL-BACKING-FILE-VECTOR*", SubLTrampolineFile.maybeDefault($sbhl_backing_file_vector$, $sbhl_backing_file_vector$, NIL));
        deflexical("*SBHL-BACKING-FILE-VECTOR-CACHES-FOR-MODULES*", SubLTrampolineFile.maybeDefault($sbhl_backing_file_vector_caches_for_modules$, $sbhl_backing_file_vector_caches_for_modules$, NIL));
        defparameter("*SBHL-BACKING-FILE-VECTOR-CACHE-SIZE-PERCENTAGE*", TWO_INTEGER);
        defparameter("*SBHL-BACKING-FILE-VECTOR-CACHE-MINIMUM-SIZE*", $int$100);
        defparameter("*SBHL-BACKING-FILE-VECTOR-CACHE-GATHER-CACHE-METRICS?*", T);
        deflexical("*SBHL-FILE-VECTOR-DATA-STREAM-LOCK*", SubLTrampolineFile.maybeDefault($sbhl_file_vector_data_stream_lock$, $sbhl_file_vector_data_stream_lock$, () -> make_lock($$$SBHL_File_Vector_Data_Stream_lock)));
        deflexical("*SBHL-BACKING-FILE-VECTOR-CACHE-CONSTRUCTOR*", NEW_METERED_PREALLOCATED_CACHE);
        defparameter("*OVERRIDE-SBHL-ISA-MODULE-WITH-KB-LOOKUP?*", NIL);
        deflexical("*DEFAULT-NUMBER-OF-CONCURRENT-READERS*", TWENTY_INTEGER);
        deflexical("*DEFAULT-NUMBER-OF-TERMS-CHECKED*", $int$500);
        return NIL;
    }

    public static SubLObject setup_sbhl_graphs_file() {
        declare_defglobal($sbhl_backing_file_vector$);
        declare_defglobal($sbhl_backing_file_vector_caches_for_modules$);
        declare_defglobal($sbhl_file_vector_data_stream_lock$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sbhl_graphs_file();
    }

    @Override
    public void initializeVariables() {
        init_sbhl_graphs_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sbhl_graphs_file();
    }

    static {





































































    }
}

/**
 * Total time: 287 ms
 */
