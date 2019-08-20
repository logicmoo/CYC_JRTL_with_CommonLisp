/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sbhl;


import static com.cyc.cycjava.cycl.cache_utilities.cache_metrics_p;
import static com.cyc.cycjava.cycl.cache_utilities.cache_strategy_gather_metrics;
import static com.cyc.cycjava.cycl.cache_utilities.cache_strategy_get_metrics;
import static com.cyc.cycjava.cycl.cache_utilities.cache_strategy_keeps_metrics_p;
import static com.cyc.cycjava.cycl.cache_utilities.cache_strategy_or_symbol_p;
import static com.cyc.cycjava.cycl.cache_utilities.cache_strategy_p;
import static com.cyc.cycjava.cycl.cache_utilities.gather_cache_strategy_information;
import static com.cyc.cycjava.cycl.cfasl.$cfasl_common_symbols$;
import static com.cyc.cycjava.cycl.cfasl.cfasl_set_common_symbols_simple;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.constants_high.random_constant;
import static com.cyc.cycjava.cycl.dictionary.new_dictionary;
import static com.cyc.cycjava.cycl.file_vector.close_file_vector;
import static com.cyc.cycjava.cycl.file_vector.file_vector_change_stream_buffer_sizes;
import static com.cyc.cycjava.cycl.file_vector.file_vector_enable_memory_mapping;
import static com.cyc.cycjava.cycl.file_vector.file_vector_p;
import static com.cyc.cycjava.cycl.file_vector.new_file_vector;
import static com.cyc.cycjava.cycl.file_vector_utilities.$file_vector_backed_map_read_lock$;
import static com.cyc.cycjava.cycl.file_vector_utilities.file_vector_backed_map_cache_ratio;
import static com.cyc.cycjava.cycl.file_vector_utilities.file_vector_backed_map_wX_cache_get;
import static com.cyc.cycjava.cycl.file_vector_utilities.file_vector_backed_map_wX_cache_put;
import static com.cyc.cycjava.cycl.file_vector_utilities.file_vector_backed_map_wX_cache_remove;
import static com.cyc.cycjava.cycl.file_vector_utilities.file_vector_backed_map_wX_cache_touch;
import static com.cyc.cycjava.cycl.file_vector_utilities.file_vector_reference_deletedP;
import static com.cyc.cycjava.cycl.file_vector_utilities.file_vector_reference_p;
import static com.cyc.cycjava.cycl.file_vector_utilities.swap_out_all_pristine_file_vector_backed_map_objects;
import static com.cyc.cycjava.cycl.format_nil.format_nil_a_no_copy;
import static com.cyc.cycjava.cycl.genls.all_specs;
import static com.cyc.cycjava.cycl.isa.isa_in_any_mtP;
import static com.cyc.cycjava.cycl.iteration.iteration_next;
import static com.cyc.cycjava.cycl.kb_paths.fort_name;
import static com.cyc.cycjava.cycl.list_utilities.alist_enter;
import static com.cyc.cycjava.cycl.list_utilities.alist_lookup_without_values;
import static com.cyc.cycjava.cycl.list_utilities.sublisp_boolean;
import static com.cyc.cycjava.cycl.map_utilities.map_get;
import static com.cyc.cycjava.cycl.map_utilities.map_put;
import static com.cyc.cycjava.cycl.map_utilities.map_size;
import static com.cyc.cycjava.cycl.map_utilities.new_map_iterator;
import static com.cyc.cycjava.cycl.misc_utilities.get_hl_store_cache_filename;
import static com.cyc.cycjava.cycl.misc_utilities.get_hl_store_caches_shared_symbols_simple;
import static com.cyc.cycjava.cycl.process_utilities.ipc_dequeue;
import static com.cyc.cycjava.cycl.process_utilities.ipc_enqueue;
import static com.cyc.cycjava.cycl.string_utilities.indent;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.subl_promotions.make_process_with_args;
import static com.cyc.cycjava.cycl.subl_promotions.non_negative_integer_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.clrhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.hash_table_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.cache_utilities;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.file_vector;
import com.cyc.cycjava.cycl.file_vector_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_paths;
import com.cyc.cycjava.cycl.kb_storage_logging;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.map_utilities;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.cycjava.cycl.process_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SBHL-GRAPHS
 * source file: /cyc/top/cycl/sbhl/sbhl-graphs.lisp
 * created:     2019/07/03 17:37:25
 */
public final class sbhl_graphs extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt42$ = makeString("");

    public static final SubLFile me = new sbhl_graphs();



    // deflexical
    // Temporary -- the equality test used for sbhl-graphs.
    /**
     * Temporary -- the equality test used for sbhl-graphs.
     */
    @LispMethod(comment = "Temporary -- the equality test used for sbhl-graphs.\ndeflexical")
    private static final SubLSymbol $sbhl_graph_equality_test$ = makeSymbol("*SBHL-GRAPH-EQUALITY-TEST*");

    // defparameter
    /**
     * The percentage of the graph size for the module that should be cached in
     * memory
     */
    @LispMethod(comment = "The percentage of the graph size for the module that should be cached in\r\nmemory\ndefparameter\nThe percentage of the graph size for the module that should be cached in\nmemory")
    public static final SubLSymbol $sbhl_backing_file_vector_cache_size_percentage$ = makeSymbol("*SBHL-BACKING-FILE-VECTOR-CACHE-SIZE-PERCENTAGE*");

    // defparameter
    /**
     * The minimal size of the cache, in the case of small population (e.g.
     * #$negationMt or #$successorStrict-HL-TimePrecedence)
     */
    @LispMethod(comment = "The minimal size of the cache, in the case of small population (e.g.\r\n#$negationMt or #$successorStrict-HL-TimePrecedence)\ndefparameter\nThe minimal size of the cache, in the case of small population (e.g.\n#$negationMt or #$successorStrict-HL-TimePrecedence)")
    public static final SubLSymbol $sbhl_backing_file_vector_cache_minimum_size$ = makeSymbol("*SBHL-BACKING-FILE-VECTOR-CACHE-MINIMUM-SIZE*");

    // defparameter
    /**
     * Whether the caches are supposed to keep metrics of their performance or not.
     */
    @LispMethod(comment = "Whether the caches are supposed to keep metrics of their performance or not.\ndefparameter")
    public static final SubLSymbol $sbhl_backing_file_vector_cache_gather_cache_metricsP$ = makeSymbol("*SBHL-BACKING-FILE-VECTOR-CACHE-GATHER-CACHE-METRICS?*");

    // deflexical
    /**
     * The allocator to use to get the new caches. Each constructor takes a capacity
     * and an optional equality test.
     */
    @LispMethod(comment = "The allocator to use to get the new caches. Each constructor takes a capacity\r\nand an optional equality test.\ndeflexical\nThe allocator to use to get the new caches. Each constructor takes a capacity\nand an optional equality test.")
    public static final SubLSymbol $sbhl_backing_file_vector_cache_constructor$ = makeSymbol("*SBHL-BACKING-FILE-VECTOR-CACHE-CONSTRUCTOR*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $override_sbhl_isa_module_with_kb_lookupP$ = makeSymbol("*OVERRIDE-SBHL-ISA-MODULE-WITH-KB-LOOKUP?*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $default_number_of_concurrent_readers$ = makeSymbol("*DEFAULT-NUMBER-OF-CONCURRENT-READERS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $default_number_of_terms_checked$ = makeSymbol("*DEFAULT-NUMBER-OF-TERMS-CHECKED*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $sbhl_backing_file_vector$ = makeSymbol("*SBHL-BACKING-FILE-VECTOR*");

    public static final SubLSymbol $sbhl_backing_file_vector_caches_for_modules$ = makeSymbol("*SBHL-BACKING-FILE-VECTOR-CACHES-FOR-MODULES*");

    public static final SubLSymbol $sbhl_file_vector_data_stream_lock$ = makeSymbol("*SBHL-FILE-VECTOR-DATA-STREAM-LOCK*");

    static private final SubLString $$$SBHL_File_Vector_Data_Stream_lock = makeString("SBHL File Vector Data Stream lock");

    private static final SubLSymbol NEW_METERED_PREALLOCATED_CACHE = makeSymbol("NEW-METERED-PREALLOCATED-CACHE");

    static private final SubLString $str6$sbhl_module_graphs = makeString("sbhl-module-graphs");

    static private final SubLString $$$cfasl = makeString("cfasl");

    static private final SubLString $str8$sbhl_module_graphs_index = makeString("sbhl-module-graphs-index");

    private static final SubLSymbol CACHE_STRATEGY_OR_SYMBOL_P = makeSymbol("CACHE-STRATEGY-OR-SYMBOL-P");

    static private final SubLString $str14$_A_is_not_a__A = makeString("~A is not a ~A");

    private static final SubLSymbol SBHL_DIRECTION_LINK_P = makeSymbol("SBHL-DIRECTION-LINK-P");

    static private final SubLString $$$continue_anyway = makeString("continue anyway");

    static private final SubLString $str19$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLSymbol SBHL_NODE_OBJECT_P = makeSymbol("SBHL-NODE-OBJECT-P");

    static private final SubLList $list21 = list(list(makeSymbol("NODE-VAR"), makeSymbol("LINK-VAR"), makeSymbol("&KEY"), makeSymbol("MODULE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list22 = list(makeKeyword("MODULE"), $DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    static private final SubLSymbol $sym26$MAP = makeUninternedSymbol("MAP");

    private static final SubLSymbol WITH_FILE_VECTOR_BACKED_MAP_STREAM_LOCK = makeSymbol("WITH-FILE-VECTOR-BACKED-MAP-STREAM-LOCK");

    static private final SubLList $list28 = list(makeSymbol("*SBHL-FILE-VECTOR-DATA-STREAM-LOCK*"));

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

    static private final SubLString $str41$___ = makeString("---");

    private static final SubLString $str42$_6_d__9_d__9_d_____A__ = makeString("~6,d ~9,d ~9,d    ~A~%");

    private static final SubLString $str43$___ = makeString("!!!");

    private static final SubLString $str44$ = makeString("");

    private static final SubLInteger $int$500 = makeInteger(500);

    private static final SubLString $str46$Concurrent_Reads_Stress_Test_Prob = makeString("Concurrent Reads Stress Test Problems");

    private static final SubLString $$$Concurrent_SBHL_Reader_ = makeString("Concurrent SBHL Reader ");

    private static final SubLSymbol STRESS_TEST_READ_RANDOMLY_FROM_SBHL = makeSymbol("STRESS-TEST-READ-RANDOMLY-FROM-SBHL");

    private static final SubLFloat $float$0_1 = makeDouble(0.1);

    private static final SubLSymbol VALID_PROCESS_P = makeSymbol("VALID-PROCESS-P");



    private static final SubLString $str53$Concurrent_Cache_Strategy_Stress_ = makeString("Concurrent Cache Strategy Stress Test Problems");

    private static final SubLList $list54 = list(reader_make_constant_shell("Organism"));

    private static final SubLSymbol STRESS_TEST_CHECK_SAME_SPECS = makeSymbol("STRESS-TEST-CHECK-SAME-SPECS");



    // Definitions
    /**
     * Used after link creation to compact or otherwise optimize the storage of teh SBHL links
     */
    @LispMethod(comment = "Used after link creation to compact or otherwise optimize the storage of teh SBHL links")
    public static final SubLObject optimize_sbhl_store_alt() {
        return NIL;
    }

    // Definitions
    /**
     * Used after link creation to compact or otherwise optimize the storage of teh SBHL links
     */
    @LispMethod(comment = "Used after link creation to compact or otherwise optimize the storage of teh SBHL links")
    public static SubLObject optimize_sbhl_store() {
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; whether OBJECT is a @see hash-table-p.
     */
    @LispMethod(comment = "@return booleanp; whether OBJECT is a @see hash-table-p.")
    public static final SubLObject sbhl_graph_object_p_alt(SubLObject v_object) {
        return hash_table_p(v_object);
    }

    /**
     *
     *
     * @return booleanp; whether OBJECT is a @see hash-table-p.
     */
    @LispMethod(comment = "@return booleanp; whether OBJECT is a @see hash-table-p.")
    public static SubLObject sbhl_graph_object_p(final SubLObject v_object) {
        return hash_table_p(v_object);
    }

    public static final SubLObject make_new_sbhl_graph_alt() {
        return make_hash_table(ZERO_INTEGER, $sbhl_graph_equality_test$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject make_new_sbhl_graph() {
        return make_hash_table(ZERO_INTEGER, sbhl_graphs.$sbhl_graph_equality_test$.getGlobalValue(), UNPROVIDED);
    }

    /**
     * Clears all of the data from GRAPH.
     */
    @LispMethod(comment = "Clears all of the data from GRAPH.")
    public static final SubLObject clear_sbhl_graph_alt(SubLObject v_graph) {
        clrhash(v_graph);
        return NIL;
    }

    /**
     * Clears all of the data from GRAPH.
     */
    @LispMethod(comment = "Clears all of the data from GRAPH.")
    public static SubLObject clear_sbhl_graph(final SubLObject v_graph) {
        clrhash(v_graph);
        return NIL;
    }

    public static final SubLObject initialize_sbhl_graph_caches_alt() {
        {
            SubLObject data_file = misc_utilities.get_hl_store_cache_filename($str_alt6$sbhl_module_graphs, $$$cfasl);
            SubLObject index_file = misc_utilities.get_hl_store_cache_filename($str_alt8$sbhl_module_graphs_index, $$$cfasl);
            if ((NIL != Filesys.probe_file(data_file)) && (NIL != Filesys.probe_file(index_file))) {
                com.cyc.cycjava.cycl.sbhl.sbhl_graphs.initialize_sbhl_graph_caches_file_vector(data_file, index_file);
                return $INITIALIZED;
            }
            return $UNINITIALIZED;
        }
    }

    public static SubLObject initialize_sbhl_graph_caches() {
        final SubLObject data_file = get_hl_store_cache_filename(sbhl_graphs.$str6$sbhl_module_graphs, sbhl_graphs.$$$cfasl);
        final SubLObject index_file = get_hl_store_cache_filename(sbhl_graphs.$str8$sbhl_module_graphs_index, sbhl_graphs.$$$cfasl);
        if ((NIL != Filesys.probe_file(data_file)) && (NIL != Filesys.probe_file(index_file))) {
            sbhl_graphs.initialize_sbhl_graph_caches_file_vector(data_file, index_file);
            return $INITIALIZED;
        }
        return $UNINITIALIZED;
    }

    public static final SubLObject initialize_sbhl_graph_caches_file_vector_alt(SubLObject data_file, SubLObject index_file) {
        if (NIL != file_vector.file_vector_p($sbhl_backing_file_vector$.getGlobalValue())) {
            file_vector.close_file_vector($sbhl_backing_file_vector$.getGlobalValue());
        }
        $sbhl_backing_file_vector$.setGlobalValue(file_vector.new_file_vector(data_file, index_file, UNPROVIDED));
        return NIL;
    }

    public static SubLObject initialize_sbhl_graph_caches_file_vector(final SubLObject data_file, final SubLObject index_file) {
        SubLObject release = NIL;
        try {
            release = seize_lock(sbhl_graphs.$sbhl_file_vector_data_stream_lock$.getGlobalValue());
            if (NIL != file_vector_p(sbhl_graphs.$sbhl_backing_file_vector$.getGlobalValue())) {
                close_file_vector(sbhl_graphs.$sbhl_backing_file_vector$.getGlobalValue());
            }
            sbhl_graphs.$sbhl_backing_file_vector$.setGlobalValue(new_file_vector(data_file, index_file, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            sbhl_graphs.sbhl_enable_memory_mapping();
        } finally {
            if (NIL != release) {
                release_lock(sbhl_graphs.$sbhl_file_vector_data_stream_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject sbhl_change_stream_buffer_sizes(final SubLObject data_stream_buffer_size, final SubLObject index_stream_buffer_size) {
        SubLObject result = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(sbhl_graphs.$sbhl_file_vector_data_stream_lock$.getGlobalValue());
            result = file_vector_change_stream_buffer_sizes(sbhl_graphs.$sbhl_backing_file_vector$.getGlobalValue(), data_stream_buffer_size, index_stream_buffer_size);
        } finally {
            if (NIL != release) {
                release_lock(sbhl_graphs.$sbhl_file_vector_data_stream_lock$.getGlobalValue());
            }
        }
        return result;
    }

    public static SubLObject sbhl_enable_memory_mapping() {
        SubLObject result = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(sbhl_graphs.$sbhl_file_vector_data_stream_lock$.getGlobalValue());
            result = file_vector_enable_memory_mapping(sbhl_graphs.$sbhl_backing_file_vector$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock(sbhl_graphs.$sbhl_file_vector_data_stream_lock$.getGlobalValue());
            }
        }
        return result;
    }

    /**
     * Allocate the cache strategy object for the SBHL graph file vector.
     */
    @LispMethod(comment = "Allocate the cache strategy object for the SBHL graph file vector.")
    public static final SubLObject new_cache_strategy_for_sbhl_module_alt(SubLObject sbhl_module, SubLObject capacity) {
        if (capacity == UNPROVIDED) {
            capacity = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cache_capacity = (NIL != subl_promotions.non_negative_integer_p(capacity)) ? ((SubLObject) (capacity)) : com.cyc.cycjava.cycl.sbhl.sbhl_graphs.cache_capacity_for_cache_strategy_for_sbhl_module(sbhl_module);
                SubLObject cache_strategy = funcall($sbhl_backing_file_vector_cache_constructor$.getGlobalValue(), cache_capacity);
                if (NIL != $sbhl_backing_file_vector_cache_gather_cache_metricsP$.getDynamicValue(thread)) {
                    cache_utilities.cache_strategy_gather_metrics(cache_strategy);
                }
                return cache_strategy;
            }
        }
    }

    /**
     * Allocate the cache strategy object for the SBHL graph file vector.
     */
    @LispMethod(comment = "Allocate the cache strategy object for the SBHL graph file vector.")
    public static SubLObject new_cache_strategy_for_sbhl_module(final SubLObject sbhl_module, SubLObject capacity) {
        if (capacity == UNPROVIDED) {
            capacity = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cache_capacity = (NIL != non_negative_integer_p(capacity)) ? capacity : sbhl_graphs.cache_capacity_for_cache_strategy_for_sbhl_module(sbhl_module);
        final SubLObject cache_strategy = funcall(sbhl_graphs.$sbhl_backing_file_vector_cache_constructor$.getGlobalValue(), cache_capacity);
        if (NIL != sbhl_graphs.$sbhl_backing_file_vector_cache_gather_cache_metricsP$.getDynamicValue(thread)) {
            cache_strategy_gather_metrics(cache_strategy);
        }
        return cache_strategy;
    }

    /**
     * Either fetch or allocate the CACHE-STRATEGY-P for the SBHL module provided.
     * Assumes that the SBHL lock has already been acquired.
     */
    @LispMethod(comment = "Either fetch or allocate the CACHE-STRATEGY-P for the SBHL module provided.\r\nAssumes that the SBHL lock has already been acquired.\nEither fetch or allocate the CACHE-STRATEGY-P for the SBHL module provided.\nAssumes that the SBHL lock has already been acquired.")
    public static final SubLObject get_cache_strategy_for_sbhl_module_alt(SubLObject sbhl_module) {
        {
            SubLObject v_cache = list_utilities.alist_lookup_without_values($sbhl_backing_file_vector_caches_for_modules$.getGlobalValue(), sbhl_module, UNPROVIDED, UNPROVIDED);
            if (NIL == v_cache) {
                v_cache = com.cyc.cycjava.cycl.sbhl.sbhl_graphs.new_cache_strategy_for_sbhl_module(sbhl_module, UNPROVIDED);
                com.cyc.cycjava.cycl.sbhl.sbhl_graphs.set_cache_strategy_for_sbhl_module(sbhl_module, v_cache);
            }
            return v_cache;
        }
    }

    /**
     * Either fetch or allocate the CACHE-STRATEGY-P for the SBHL module provided.
     * Assumes that the SBHL lock has already been acquired.
     */
    @LispMethod(comment = "Either fetch or allocate the CACHE-STRATEGY-P for the SBHL module provided.\r\nAssumes that the SBHL lock has already been acquired.\nEither fetch or allocate the CACHE-STRATEGY-P for the SBHL module provided.\nAssumes that the SBHL lock has already been acquired.")
    public static SubLObject get_cache_strategy_for_sbhl_module(final SubLObject sbhl_module) {
        SubLObject v_cache = alist_lookup_without_values(sbhl_graphs.$sbhl_backing_file_vector_caches_for_modules$.getGlobalValue(), sbhl_module, UNPROVIDED, UNPROVIDED);
        if (NIL == v_cache) {
            v_cache = sbhl_graphs.new_cache_strategy_for_sbhl_module(sbhl_module, UNPROVIDED);
            sbhl_graphs.set_cache_strategy_for_sbhl_module(sbhl_module, v_cache);
        }
        return v_cache;
    }

    public static final SubLObject set_cache_strategy_for_sbhl_module_alt(SubLObject sbhl_module, SubLObject cache_strategy) {
        SubLTrampolineFile.checkType(cache_strategy, CACHE_STRATEGY_OR_SYMBOL_P);
        $sbhl_backing_file_vector_caches_for_modules$.setGlobalValue(list_utilities.alist_enter($sbhl_backing_file_vector_caches_for_modules$.getGlobalValue(), sbhl_module, cache_strategy, UNPROVIDED));
        return sbhl_module;
    }

    public static SubLObject set_cache_strategy_for_sbhl_module(final SubLObject sbhl_module, final SubLObject cache_strategy) {
        assert NIL != cache_strategy_or_symbol_p(cache_strategy) : "! cache_utilities.cache_strategy_or_symbol_p(cache_strategy) " + ("cache_utilities.cache_strategy_or_symbol_p(cache_strategy) " + "CommonSymbols.NIL != cache_utilities.cache_strategy_or_symbol_p(cache_strategy) ") + cache_strategy;
        sbhl_graphs.$sbhl_backing_file_vector_caches_for_modules$.setGlobalValue(alist_enter(sbhl_graphs.$sbhl_backing_file_vector_caches_for_modules$.getGlobalValue(), sbhl_module, cache_strategy, UNPROVIDED));
        return sbhl_module;
    }

    /**
     * Compute the cache capacity as a percentage of the known size of the SBHL module
     * graph, but clamp it to the minimum from below.
     *
     * @return POSITIVE-INTEGER-P
     */
    @LispMethod(comment = "Compute the cache capacity as a percentage of the known size of the SBHL module\r\ngraph, but clamp it to the minimum from below.\r\n\r\n@return POSITIVE-INTEGER-P\nCompute the cache capacity as a percentage of the known size of the SBHL module\ngraph, but clamp it to the minimum from below.")
    public static final SubLObject cache_capacity_for_cache_strategy_for_sbhl_module_alt(SubLObject sbhl_module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_graph = sbhl_module_vars.get_sbhl_module_graph(sbhl_module);
                SubLObject graph_size = map_utilities.map_size(v_graph);
                SubLObject estimated_cache_size = integerDivide(multiply(graph_size, $sbhl_backing_file_vector_cache_size_percentage$.getDynamicValue(thread)), $int$100);
                return max($sbhl_backing_file_vector_cache_minimum_size$.getDynamicValue(thread), estimated_cache_size);
            }
        }
    }

    /**
     * Compute the cache capacity as a percentage of the known size of the SBHL module
     * graph, but clamp it to the minimum from below.
     *
     * @return POSITIVE-INTEGER-P
     */
    @LispMethod(comment = "Compute the cache capacity as a percentage of the known size of the SBHL module\r\ngraph, but clamp it to the minimum from below.\r\n\r\n@return POSITIVE-INTEGER-P\nCompute the cache capacity as a percentage of the known size of the SBHL module\ngraph, but clamp it to the minimum from below.")
    public static SubLObject cache_capacity_for_cache_strategy_for_sbhl_module(final SubLObject sbhl_module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_graph = sbhl_module_vars.get_sbhl_module_graph(sbhl_module);
        final SubLObject graph_size = map_size(v_graph);
        final SubLObject estimated_cache_size = integerDivide(multiply(graph_size, sbhl_graphs.$sbhl_backing_file_vector_cache_size_percentage$.getDynamicValue(thread)), $int$100);
        return max(sbhl_graphs.$sbhl_backing_file_vector_cache_minimum_size$.getDynamicValue(thread), estimated_cache_size);
    }

    /**
     * This is called by the load KB command after swapping in the references.
     */
    @LispMethod(comment = "This is called by the load KB command after swapping in the references.")
    public static final SubLObject initialize_sbhl_graph_caches_during_load_kb_alt(SubLObject data_file, SubLObject index_file) {
        return com.cyc.cycjava.cycl.sbhl.sbhl_graphs.initialize_sbhl_graph_caches_file_vector(data_file, index_file);
    }

    /**
     * This is called by the load KB command after swapping in the references.
     */
    @LispMethod(comment = "This is called by the load KB command after swapping in the references.")
    public static SubLObject initialize_sbhl_graph_caches_during_load_kb(final SubLObject data_file, final SubLObject index_file) {
        return sbhl_graphs.initialize_sbhl_graph_caches_file_vector(data_file, index_file);
    }

    /**
     *
     *
     * @unknown lie about this right now
     */
    @LispMethod(comment = "@unknown lie about this right now")
    public static final SubLObject sbhl_graph_completely_cachedP_alt() {
        return T;
    }

    /**
     *
     *
     * @unknown lie about this right now
     */
    @LispMethod(comment = "@unknown lie about this right now")
    public static SubLObject sbhl_graph_completely_cachedP() {
        return T;
    }

    /**
     * Provide access to the ratio of the SBHL modules caching by giving
     *
     * @return 0 PAGED-IN
     * @return 1 TOTAL
     */
    @LispMethod(comment = "Provide access to the ratio of the SBHL modules caching by giving\r\n\r\n@return 0 PAGED-IN\r\n@return 1 TOTAL")
    public static final SubLObject get_sbhl_module_caching_ratio_alt(SubLObject module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
            {
                SubLObject v_graph = sbhl_module_utilities.get_sbhl_graph(module);
                thread.resetMultipleValues();
                {
                    SubLObject paged_in = file_vector_utilities.file_vector_backed_map_cache_ratio(v_graph);
                    SubLObject paged_out = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    return values(paged_in, add(paged_in, paged_out));
                }
            }
        }
    }

    /**
     * Provide access to the ratio of the SBHL modules caching by giving
     *
     * @return 0 PAGED-IN
     * @return 1 TOTAL
     */
    @LispMethod(comment = "Provide access to the ratio of the SBHL modules caching by giving\r\n\r\n@return 0 PAGED-IN\r\n@return 1 TOTAL")
    public static SubLObject get_sbhl_module_caching_ratio(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject v_graph = sbhl_module_utilities.get_sbhl_graph(module);
        thread.resetMultipleValues();
        final SubLObject paged_in = file_vector_backed_map_cache_ratio(v_graph);
        final SubLObject paged_out = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(paged_in, add(paged_in, paged_out));
    }

    /**
     * Get the SBHL module caching ratios for all of the modules on a per
     * module basis
     *
     * @return 0 the breakdown list for the individual modules, of the form
    (FORT-P PAGED-IN TOTAL)
     * @return 1 the sum of paged-in across all modules
     * @return 2 the sum of total across all modules
     */
    @LispMethod(comment = "Get the SBHL module caching ratios for all of the modules on a per\r\nmodule basis\r\n\r\n@return 0 the breakdown list for the individual modules, of the form\r\n(FORT-P PAGED-IN TOTAL)\r\n@return 1 the sum of paged-in across all modules\r\n@return 2 the sum of total across all modules\nGet the SBHL module caching ratios for all of the modules on a per\nmodule basis")
    public static final SubLObject get_sbhl_modules_caching_ratios_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject total_paged_in = ZERO_INTEGER;
                SubLObject sum_total = ZERO_INTEGER;
                SubLObject results = NIL;
                SubLObject cdolist_list_var = sbhl_module_vars.get_sbhl_module_list();
                SubLObject sbhl_module = NIL;
                for (sbhl_module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sbhl_module = cdolist_list_var.first()) {
                    {
                        SubLObject predicate = sbhl_module_vars.get_sbhl_module_link_pred(sbhl_module);
                        thread.resetMultipleValues();
                        {
                            SubLObject paged_in = com.cyc.cycjava.cycl.sbhl.sbhl_graphs.get_sbhl_module_caching_ratio(sbhl_module);
                            SubLObject total = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            total_paged_in = add(total_paged_in, paged_in);
                            sum_total = add(sum_total, total);
                            results = cons(list(predicate, paged_in, total), results);
                        }
                    }
                }
                return values(nreverse(results), total_paged_in, sum_total);
            }
        }
    }

    /**
     * Get the SBHL module caching ratios for all of the modules on a per
     * module basis
     *
     * @return 0 the breakdown list for the individual modules, of the form
    (FORT-P PAGED-IN TOTAL)
     * @return 1 the sum of paged-in across all modules
     * @return 2 the sum of total across all modules
     */
    @LispMethod(comment = "Get the SBHL module caching ratios for all of the modules on a per\r\nmodule basis\r\n\r\n@return 0 the breakdown list for the individual modules, of the form\r\n(FORT-P PAGED-IN TOTAL)\r\n@return 1 the sum of paged-in across all modules\r\n@return 2 the sum of total across all modules\nGet the SBHL module caching ratios for all of the modules on a per\nmodule basis")
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
            final SubLObject paged_in = sbhl_graphs.get_sbhl_module_caching_ratio(sbhl_module);
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

    /**
     * Get the graph link from the graph, potentially swapping it
     * in from the file vector backing.
     * Notice that the underlying implementation is smart enough to
     * only lock the data stream when it is actually necessary.
     */
    @LispMethod(comment = "Get the graph link from the graph, potentially swapping it\r\nin from the file vector backing.\r\nNotice that the underlying implementation is smart enough to\r\nonly lock the data stream when it is actually necessary.\nGet the graph link from the graph, potentially swapping it\nin from the file vector backing.\nNotice that the underlying implementation is smart enough to\nonly lock the data stream when it is actually necessary.")
    public static final SubLObject get_sbhl_graph_link_from_graph_alt(SubLObject node, SubLObject v_graph, SubLObject v_cache) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $cfasl_common_symbols$.currentBinding(thread);
                    try {
                        file_vector_utilities.$file_vector_backed_map_read_lock$.bind($sbhl_file_vector_data_stream_lock$.getGlobalValue(), thread);
                        $cfasl_common_symbols$.bind(NIL, thread);
                        cfasl_set_common_symbols_simple(misc_utilities.get_hl_store_caches_shared_symbols());
                        result = file_vector_utilities.file_vector_backed_map_wX_cache_get(v_graph, $sbhl_backing_file_vector$.getGlobalValue(), v_cache, node, UNPROVIDED);
                    } finally {
                        $cfasl_common_symbols$.rebind(_prev_bind_1, thread);
                        file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Get the graph link from the graph, potentially swapping it
     * in from the file vector backing.
     * Notice that the underlying implementation is smart enough to
     * only lock the data stream when it is actually necessary.
     */
    @LispMethod(comment = "Get the graph link from the graph, potentially swapping it\r\nin from the file vector backing.\r\nNotice that the underlying implementation is smart enough to\r\nonly lock the data stream when it is actually necessary.\nGet the graph link from the graph, potentially swapping it\nin from the file vector backing.\nNotice that the underlying implementation is smart enough to\nonly lock the data stream when it is actually necessary.")
    public static SubLObject get_sbhl_graph_link_from_graph(final SubLObject node, final SubLObject v_graph, final SubLObject v_cache) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $file_vector_backed_map_read_lock$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $cfasl_common_symbols$.currentBinding(thread);
        try {
            $file_vector_backed_map_read_lock$.bind(sbhl_graphs.$sbhl_file_vector_data_stream_lock$.getGlobalValue(), thread);
            $cfasl_common_symbols$.bind(NIL, thread);
            cfasl_set_common_symbols_simple(get_hl_store_caches_shared_symbols_simple());
            result = file_vector_backed_map_wX_cache_get(v_graph, sbhl_graphs.$sbhl_backing_file_vector$.getGlobalValue(), v_cache, node, UNPROVIDED);
        } finally {
            $cfasl_common_symbols$.rebind(_prev_bind_2, thread);
            $file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * Modify the graph in such a fashion that the file vector backed
     * map can track the modification.
     */
    @LispMethod(comment = "Modify the graph in such a fashion that the file vector backed\r\nmap can track the modification.\nModify the graph in such a fashion that the file vector backed\nmap can track the modification.")
    public static final SubLObject put_sbhl_graph_link_into_graph_alt(SubLObject node, SubLObject v_graph, SubLObject v_cache, SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $cfasl_common_symbols$.currentBinding(thread);
                    try {
                        file_vector_utilities.$file_vector_backed_map_read_lock$.bind($sbhl_file_vector_data_stream_lock$.getGlobalValue(), thread);
                        $cfasl_common_symbols$.bind(NIL, thread);
                        cfasl_set_common_symbols_simple(misc_utilities.get_hl_store_caches_shared_symbols());
                        result = file_vector_utilities.file_vector_backed_map_wX_cache_put(v_graph, v_cache, node, value);
                    } finally {
                        $cfasl_common_symbols$.rebind(_prev_bind_1, thread);
                        file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Modify the graph in such a fashion that the file vector backed
     * map can track the modification.
     */
    @LispMethod(comment = "Modify the graph in such a fashion that the file vector backed\r\nmap can track the modification.\nModify the graph in such a fashion that the file vector backed\nmap can track the modification.")
    public static SubLObject put_sbhl_graph_link_into_graph(final SubLObject node, final SubLObject v_graph, final SubLObject v_cache, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $file_vector_backed_map_read_lock$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $cfasl_common_symbols$.currentBinding(thread);
        try {
            $file_vector_backed_map_read_lock$.bind(sbhl_graphs.$sbhl_file_vector_data_stream_lock$.getGlobalValue(), thread);
            $cfasl_common_symbols$.bind(NIL, thread);
            cfasl_set_common_symbols_simple(get_hl_store_caches_shared_symbols_simple());
            result = file_vector_backed_map_wX_cache_put(v_graph, v_cache, node, value);
        } finally {
            $cfasl_common_symbols$.rebind(_prev_bind_2, thread);
            $file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * Remove that node from the graph, with potential modifications
     * that can be tracked by the file vector backing infrastructure.
     */
    @LispMethod(comment = "Remove that node from the graph, with potential modifications\r\nthat can be tracked by the file vector backing infrastructure.\nRemove that node from the graph, with potential modifications\nthat can be tracked by the file vector backing infrastructure.")
    public static final SubLObject remove_sbhl_graph_link_from_graph_alt(SubLObject node, SubLObject v_graph, SubLObject v_cache) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $cfasl_common_symbols$.currentBinding(thread);
                    try {
                        file_vector_utilities.$file_vector_backed_map_read_lock$.bind($sbhl_file_vector_data_stream_lock$.getGlobalValue(), thread);
                        $cfasl_common_symbols$.bind(NIL, thread);
                        cfasl_set_common_symbols_simple(misc_utilities.get_hl_store_caches_shared_symbols());
                        result = file_vector_utilities.file_vector_backed_map_wX_cache_remove(v_graph, v_cache, node, UNPROVIDED);
                    } finally {
                        $cfasl_common_symbols$.rebind(_prev_bind_1, thread);
                        file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Remove that node from the graph, with potential modifications
     * that can be tracked by the file vector backing infrastructure.
     */
    @LispMethod(comment = "Remove that node from the graph, with potential modifications\r\nthat can be tracked by the file vector backing infrastructure.\nRemove that node from the graph, with potential modifications\nthat can be tracked by the file vector backing infrastructure.")
    public static SubLObject remove_sbhl_graph_link_from_graph(final SubLObject node, final SubLObject v_graph, final SubLObject v_cache) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $file_vector_backed_map_read_lock$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $cfasl_common_symbols$.currentBinding(thread);
        try {
            $file_vector_backed_map_read_lock$.bind(sbhl_graphs.$sbhl_file_vector_data_stream_lock$.getGlobalValue(), thread);
            $cfasl_common_symbols$.bind(NIL, thread);
            cfasl_set_common_symbols_simple(get_hl_store_caches_shared_symbols_simple());
            result = file_vector_backed_map_wX_cache_remove(v_graph, v_cache, node, UNPROVIDED);
        } finally {
            $cfasl_common_symbols$.rebind(_prev_bind_2, thread);
            $file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * Inform the file vector backing infrastructure that the entry for
     * the node in the graph is mutated.
     */
    @LispMethod(comment = "Inform the file vector backing infrastructure that the entry for\r\nthe node in the graph is mutated.\nInform the file vector backing infrastructure that the entry for\nthe node in the graph is mutated.")
    public static final SubLObject touch_sbhl_link_graph_alt(SubLObject node, SubLObject v_graph, SubLObject v_cache) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $cfasl_common_symbols$.currentBinding(thread);
                    try {
                        file_vector_utilities.$file_vector_backed_map_read_lock$.bind($sbhl_file_vector_data_stream_lock$.getGlobalValue(), thread);
                        $cfasl_common_symbols$.bind(NIL, thread);
                        cfasl_set_common_symbols_simple(misc_utilities.get_hl_store_caches_shared_symbols());
                        result = file_vector_utilities.file_vector_backed_map_wX_cache_touch(v_graph, v_cache, node, $sbhl_backing_file_vector$.getGlobalValue());
                    } finally {
                        $cfasl_common_symbols$.rebind(_prev_bind_1, thread);
                        file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Inform the file vector backing infrastructure that the entry for
     * the node in the graph is mutated.
     */
    @LispMethod(comment = "Inform the file vector backing infrastructure that the entry for\r\nthe node in the graph is mutated.\nInform the file vector backing infrastructure that the entry for\nthe node in the graph is mutated.")
    public static SubLObject touch_sbhl_link_graph(final SubLObject node, final SubLObject v_graph, final SubLObject v_cache) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $file_vector_backed_map_read_lock$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $cfasl_common_symbols$.currentBinding(thread);
        try {
            $file_vector_backed_map_read_lock$.bind(sbhl_graphs.$sbhl_file_vector_data_stream_lock$.getGlobalValue(), thread);
            $cfasl_common_symbols$.bind(NIL, thread);
            cfasl_set_common_symbols_simple(get_hl_store_caches_shared_symbols_simple());
            result = file_vector_backed_map_wX_cache_touch(v_graph, v_cache, node, sbhl_graphs.$sbhl_backing_file_vector$.getGlobalValue());
        } finally {
            $cfasl_common_symbols$.rebind(_prev_bind_2, thread);
            $file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * Accessor: @return direction-link-p; the sbhl-direction-link structure for NODE within graph corresponding to PRED. uses MODULE / *sbhl-module* to access sbhl graph. @see get-sbhl-graph
     */
    @LispMethod(comment = "Accessor: @return direction-link-p; the sbhl-direction-link structure for NODE within graph corresponding to PRED. uses MODULE / *sbhl-module* to access sbhl graph. @see get-sbhl-graph")
    public static final SubLObject get_sbhl_graph_link_alt(SubLObject node, SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        {
            SubLObject result = NIL;
            SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
            SubLObject needs_to_releaseP = NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                result = com.cyc.cycjava.cycl.sbhl.sbhl_graphs.get_sbhl_graph_link_from_graph(node, sbhl_module_utilities.get_sbhl_graph(module), com.cyc.cycjava.cycl.sbhl.sbhl_graphs.get_cache_strategy_for_sbhl_module(module));
            } finally {
                if (NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                }
            }
            return result;
        }
    }

    /**
     * Accessor: @return direction-link-p; the sbhl-direction-link structure for NODE within graph corresponding to PRED. uses MODULE / *sbhl-module* to access sbhl graph. @see get-sbhl-graph
     */
    @LispMethod(comment = "Accessor: @return direction-link-p; the sbhl-direction-link structure for NODE within graph corresponding to PRED. uses MODULE / *sbhl-module* to access sbhl graph. @see get-sbhl-graph")
    public static SubLObject get_sbhl_graph_link(final SubLObject node, final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        SubLObject result = NIL;
        final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
            final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding(thread);
            try {
                kb_storage_logging.$kb_storage_client$.bind(kb_storage_logging.add_kb_storage_logging_add_tag(sbhl_graphs.logging_tag_for_module(module)), thread);
                result = sbhl_graphs.get_sbhl_graph_link_from_graph(node, sbhl_module_utilities.get_sbhl_graph(module), sbhl_graphs.get_cache_strategy_for_sbhl_module(module));
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

    /**
     * Modifier: Sets the value corresonding to NODE in graph determined by MODULE / *sbhl-module* to DIRECTION-LINK, if it is an @see sbhl-direction-link-p.
     */
    @LispMethod(comment = "Modifier: Sets the value corresonding to NODE in graph determined by MODULE / *sbhl-module* to DIRECTION-LINK, if it is an @see sbhl-direction-link-p.")
    public static final SubLObject set_sbhl_graph_link_alt(SubLObject node, SubLObject direction_link, SubLObject module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                if (NIL == sbhl_links.sbhl_direction_link_p(direction_link)) {
                    {
                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt14$_A_is_not_a__A, direction_link, SBHL_DIRECTION_LINK_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else {
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt14$_A_is_not_a__A, direction_link, SBHL_DIRECTION_LINK_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else {
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str_alt14$_A_is_not_a__A, direction_link, SBHL_DIRECTION_LINK_P);
                                } else {
                                    Errors.warn($str_alt19$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str_alt14$_A_is_not_a__A, direction_link, SBHL_DIRECTION_LINK_P);
                                }
                            }
                        }
                    }
                }
            }
            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                if (NIL == sbhl_link_vars.sbhl_node_object_p(node)) {
                    {
                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt14$_A_is_not_a__A, node, SBHL_NODE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else {
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt14$_A_is_not_a__A, node, SBHL_NODE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else {
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str_alt14$_A_is_not_a__A, node, SBHL_NODE_OBJECT_P);
                                } else {
                                    Errors.warn($str_alt19$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str_alt14$_A_is_not_a__A, node, SBHL_NODE_OBJECT_P);
                                }
                            }
                        }
                    }
                }
            }
            SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
            {
                SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                SubLObject needs_to_releaseP = NIL;
                try {
                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                    com.cyc.cycjava.cycl.sbhl.sbhl_graphs.put_sbhl_graph_link_into_graph(node, sbhl_module_utilities.get_sbhl_graph(module), com.cyc.cycjava.cycl.sbhl.sbhl_graphs.get_cache_strategy_for_sbhl_module(module), direction_link);
                } finally {
                    if (NIL != needs_to_releaseP) {
                        ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Modifier: Sets the value corresonding to NODE in graph determined by MODULE / *sbhl-module* to DIRECTION-LINK, if it is an @see sbhl-direction-link-p.
     */
    @LispMethod(comment = "Modifier: Sets the value corresonding to NODE in graph determined by MODULE / *sbhl-module* to DIRECTION-LINK, if it is an @see sbhl-direction-link-p.")
    public static SubLObject set_sbhl_graph_link(final SubLObject node, final SubLObject direction_link, final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_links.sbhl_direction_link_p(direction_link))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, sbhl_graphs.$str14$_A_is_not_a__A, direction_link, sbhl_graphs.SBHL_DIRECTION_LINK_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, sbhl_graphs.$$$continue_anyway, sbhl_graphs.$str14$_A_is_not_a__A, direction_link, sbhl_graphs.SBHL_DIRECTION_LINK_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn(sbhl_graphs.$str14$_A_is_not_a__A, direction_link, sbhl_graphs.SBHL_DIRECTION_LINK_P);
                    } else {
                        Errors.warn(sbhl_graphs.$str19$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror(sbhl_graphs.$$$continue_anyway, sbhl_graphs.$str14$_A_is_not_a__A, direction_link, sbhl_graphs.SBHL_DIRECTION_LINK_P);
                    }


        }
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_link_vars.sbhl_node_object_p(node))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, sbhl_graphs.$str14$_A_is_not_a__A, node, sbhl_graphs.SBHL_NODE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, sbhl_graphs.$$$continue_anyway, sbhl_graphs.$str14$_A_is_not_a__A, node, sbhl_graphs.SBHL_NODE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn(sbhl_graphs.$str14$_A_is_not_a__A, node, sbhl_graphs.SBHL_NODE_OBJECT_P);
                    } else {
                        Errors.warn(sbhl_graphs.$str19$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror(sbhl_graphs.$$$continue_anyway, sbhl_graphs.$str14$_A_is_not_a__A, node, sbhl_graphs.SBHL_NODE_OBJECT_P);
                    }


        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding(thread);
            try {
                kb_storage_logging.$kb_storage_client$.bind(kb_storage_logging.add_kb_storage_logging_add_tag(sbhl_graphs.logging_tag_for_module(module)), thread);
                sbhl_graphs.put_sbhl_graph_link_into_graph(node, sbhl_module_utilities.get_sbhl_graph(module), sbhl_graphs.get_cache_strategy_for_sbhl_module(module), direction_link);
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

    /**
     * Modifier: Notifies the SBHL swapping infrastructure that the NODE has been modified and that
     * the swapping mechanism needs to treat this as mutated. The graph is determined by
     * MODULE / *sbhl-module* as in @see get-sbhl-graph.
     */
    @LispMethod(comment = "Modifier: Notifies the SBHL swapping infrastructure that the NODE has been modified and that\r\nthe swapping mechanism needs to treat this as mutated. The graph is determined by\r\nMODULE / *sbhl-module* as in @see get-sbhl-graph.\nModifier: Notifies the SBHL swapping infrastructure that the NODE has been modified and that\nthe swapping mechanism needs to treat this as mutated. The graph is determined by\nMODULE / *sbhl-module* as in @see get-sbhl-graph.")
    public static final SubLObject touch_sbhl_graph_link_alt(SubLObject node, SubLObject direction_link, SubLObject module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                if (NIL == sbhl_link_vars.sbhl_node_object_p(node)) {
                    {
                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt14$_A_is_not_a__A, node, SBHL_NODE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else {
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt14$_A_is_not_a__A, node, SBHL_NODE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else {
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str_alt14$_A_is_not_a__A, node, SBHL_NODE_OBJECT_P);
                                } else {
                                    Errors.warn($str_alt19$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str_alt14$_A_is_not_a__A, node, SBHL_NODE_OBJECT_P);
                                }
                            }
                        }
                    }
                }
            }
            SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
            {
                SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                SubLObject needs_to_releaseP = NIL;
                try {
                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                    com.cyc.cycjava.cycl.sbhl.sbhl_graphs.touch_sbhl_link_graph(node, sbhl_module_utilities.get_sbhl_graph(module), com.cyc.cycjava.cycl.sbhl.sbhl_graphs.get_cache_strategy_for_sbhl_module(module));
                } finally {
                    if (NIL != needs_to_releaseP) {
                        ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                    }
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Modifier: Notifies the SBHL swapping infrastructure that the NODE has been modified and that\r\nthe swapping mechanism needs to treat this as mutated. The graph is determined by\r\nMODULE / *sbhl-module* as in @see get-sbhl-graph.\nModifier: Notifies the SBHL swapping infrastructure that the NODE has been modified and that\nthe swapping mechanism needs to treat this as mutated. The graph is determined by\nMODULE / *sbhl-module* as in @see get-sbhl-graph.")
    public static SubLObject touch_sbhl_graph_link(final SubLObject node, final SubLObject direction_link, final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_link_vars.sbhl_node_object_p(node))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, sbhl_graphs.$str14$_A_is_not_a__A, node, sbhl_graphs.SBHL_NODE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, sbhl_graphs.$$$continue_anyway, sbhl_graphs.$str14$_A_is_not_a__A, node, sbhl_graphs.SBHL_NODE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn(sbhl_graphs.$str14$_A_is_not_a__A, node, sbhl_graphs.SBHL_NODE_OBJECT_P);
                    } else {
                        Errors.warn(sbhl_graphs.$str19$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror(sbhl_graphs.$$$continue_anyway, sbhl_graphs.$str14$_A_is_not_a__A, node, sbhl_graphs.SBHL_NODE_OBJECT_P);
                    }


        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding(thread);
            try {
                kb_storage_logging.$kb_storage_client$.bind(kb_storage_logging.add_kb_storage_logging_add_tag(sbhl_graphs.logging_tag_for_module(module)), thread);
                sbhl_graphs.touch_sbhl_link_graph(node, sbhl_module_utilities.get_sbhl_graph(module), sbhl_graphs.get_cache_strategy_for_sbhl_module(module));
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

    /**
     * Modifier: performs (remhash NODE graph) on graph determined by MODULE / *sbhl-module*
     */
    @LispMethod(comment = "Modifier: performs (remhash NODE graph) on graph determined by MODULE / *sbhl-module*")
    public static final SubLObject remove_sbhl_graph_link_alt(SubLObject node, SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        {
            SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
            SubLObject needs_to_releaseP = NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                com.cyc.cycjava.cycl.sbhl.sbhl_graphs.remove_sbhl_graph_link_from_graph(node, sbhl_module_utilities.get_sbhl_graph(module), com.cyc.cycjava.cycl.sbhl.sbhl_graphs.get_cache_strategy_for_sbhl_module(module));
            } finally {
                if (NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Modifier: performs (remhash NODE graph) on graph determined by MODULE / *sbhl-module*")
    public static SubLObject remove_sbhl_graph_link(final SubLObject node, final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            sbhl_graphs.remove_sbhl_graph_link_from_graph(node, sbhl_module_utilities.get_sbhl_graph(module), sbhl_graphs.get_cache_strategy_for_sbhl_module(module));
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
        return NIL;
    }

    /**
     * Walk the SBHL graph links, swapping them in as needed
     */
    @LispMethod(comment = "Walk the SBHL graph links, swapping them in as needed")
    public static final SubLObject do_sbhl_graph_links_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt21);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject node_var = NIL;
                    SubLObject link_var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt21);
                    node_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt21);
                    link_var = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt21);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt21);
                            if (NIL == member(current_1, $list_alt22, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt21);
                        }
                        {
                            SubLObject module_tail = property_list_member($MODULE, current);
                            SubLObject module = (NIL != module_tail) ? ((SubLObject) (cadr(module_tail))) : NIL;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject map = $sym26$MAP;
                                return list(WITH_CFASL_COMMON_SYMBOLS_SIMPLE, $list_alt28, list(CLET, list(list(map, list(GET_SBHL_GRAPH, module))), listS(DO_FILE_VECTOR_BACKED_MAP, list(node_var, link_var, map, $sbhl_backing_file_vector$, $DONE, done), append(body, NIL))));
                            }
                        }
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Walk the SBHL graph links, swapping them in as needed")
    public static SubLObject do_sbhl_graph_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, sbhl_graphs.$list21);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject node_var = NIL;
        SubLObject link_var = NIL;
        destructuring_bind_must_consp(current, datum, sbhl_graphs.$list21);
        node_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, sbhl_graphs.$list21);
        link_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, sbhl_graphs.$list21);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, sbhl_graphs.$list21);
            if (NIL == member(current_$1, sbhl_graphs.$list22, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == sbhl_graphs.$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, sbhl_graphs.$list21);
        }
        final SubLObject module_tail = property_list_member($MODULE, current);
        final SubLObject module = (NIL != module_tail) ? cadr(module_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject map = sbhl_graphs.$sym26$MAP;
        return list(sbhl_graphs.WITH_FILE_VECTOR_BACKED_MAP_STREAM_LOCK, sbhl_graphs.$list28, list(sbhl_graphs.WITH_CFASL_COMMON_SYMBOLS_SIMPLE, sbhl_graphs.$list30, list(CLET, list(list(map, list(sbhl_graphs.GET_SBHL_GRAPH, module))), listS(sbhl_graphs.DO_FILE_VECTOR_BACKED_MAP, list(node_var, link_var, map, sbhl_graphs.$sbhl_backing_file_vector$, $DONE, done), append(body, NIL)))));
    }

    public static final SubLObject swap_in_all_graph_links_alt(SubLObject module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $cfasl_common_symbols$.currentBinding(thread);
                try {
                    $cfasl_common_symbols$.bind(NIL, thread);
                    cfasl_set_common_symbols_simple(misc_utilities.get_hl_store_caches_shared_symbols());
                    {
                        SubLObject map = sbhl_module_utilities.get_sbhl_graph(module);
                        SubLObject link = NIL;
                        SubLObject iterator = map_utilities.new_map_iterator(map);
                        SubLObject done_var = NIL;
                        while (NIL == done_var) {
                            thread.resetMultipleValues();
                            {
                                SubLObject var = iteration.iteration_next(iterator);
                                SubLObject valid = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != valid) {
                                    {
                                        SubLObject datum = var;
                                        SubLObject current = datum;
                                        SubLObject node = NIL;
                                        SubLObject impl_value = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt32);
                                        node = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt32);
                                        impl_value = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            if (!((NIL != file_vector_utilities.file_vector_reference_p(impl_value)) && (NIL != file_vector_utilities.file_vector_reference_deletedP(impl_value)))) {
                                                link = file_vector_utilities.file_vector_backed_map_wX_cache_get(map, $sbhl_backing_file_vector$.getGlobalValue(), NIL, node, UNPROVIDED);
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt32);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            }
                        } 
                    }
                } finally {
                    $cfasl_common_symbols$.rebind(_prev_bind_0, thread);
                }
            }
            return module;
        }
    }

    public static SubLObject swap_in_all_graph_links(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $file_vector_backed_map_read_lock$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $cfasl_common_symbols$.currentBinding(thread);
        try {
            $file_vector_backed_map_read_lock$.bind(sbhl_graphs.$sbhl_file_vector_data_stream_lock$.getGlobalValue(), thread);
            $cfasl_common_symbols$.bind(NIL, thread);
            cfasl_set_common_symbols_simple(get_hl_store_caches_shared_symbols_simple());
            final SubLObject map = sbhl_module_utilities.get_sbhl_graph(module);
            SubLObject link = NIL;
            final SubLObject iterator = new_map_iterator(map);
            SubLObject valid;
            for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject var = iteration_next(iterator);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != valid) {
                    SubLObject current;
                    final SubLObject datum = current = var;
                    SubLObject node = NIL;
                    SubLObject impl_value = NIL;
                    destructuring_bind_must_consp(current, datum, sbhl_graphs.$list34);
                    node = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, sbhl_graphs.$list34);
                    impl_value = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if ((NIL == file_vector_reference_p(impl_value)) || (NIL == file_vector_reference_deletedP(impl_value))) {
                            link = file_vector_backed_map_wX_cache_get(map, sbhl_graphs.$sbhl_backing_file_vector$.getGlobalValue(), NIL, node, UNPROVIDED);
                        }
                    } else {
                        cdestructuring_bind_error(datum, sbhl_graphs.$list34);
                    }
                }
            }
        } finally {
            $cfasl_common_symbols$.rebind(_prev_bind_2, thread);
            $file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
        }
        return module;
    }

    public static final SubLObject swap_out_all_pristine_graph_links_alt(SubLObject module) {
        file_vector_utilities.swap_out_all_pristine_file_vector_backed_map_objects(sbhl_module_utilities.get_sbhl_graph(module));
        return module;
    }

    public static SubLObject swap_out_all_pristine_graph_links(final SubLObject module) {
        swap_out_all_pristine_file_vector_backed_map_objects(sbhl_module_utilities.get_sbhl_graph(module));
        return module;
    }

    public static final SubLObject swap_out_all_pristine_sbhl_module_graph_links_alt() {
        {
            SubLObject cdolist_list_var = sbhl_module_vars.get_sbhl_module_list();
            SubLObject sbhl_module = NIL;
            for (sbhl_module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sbhl_module = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.sbhl.sbhl_graphs.swap_out_all_pristine_graph_links(sbhl_module);
            }
        }
        return T;
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
                sbhl_graphs.swap_out_all_pristine_graph_links(sbhl_module);
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

    /**
     * Return the CACHE-METRICS-P for the SBHL-MODULE, or NIL if non exist.
     */
    @LispMethod(comment = "Return the CACHE-METRICS-P for the SBHL-MODULE, or NIL if non exist.")
    public static final SubLObject get_sbhl_module_cache_strategy_metrics_alt(SubLObject module) {
        {
            SubLObject cache_strategy = com.cyc.cycjava.cycl.sbhl.sbhl_graphs.get_cache_strategy_for_sbhl_module(module);
            if (NIL != cache_utilities.cache_strategy_keeps_metrics_p(cache_strategy)) {
                return cache_utilities.cache_strategy_get_metrics(cache_strategy);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return the CACHE-METRICS-P for the SBHL-MODULE, or NIL if non exist.")
    public static SubLObject get_sbhl_module_cache_strategy_metrics(final SubLObject module) {
        final SubLObject cache_strategy = sbhl_graphs.get_cache_strategy_for_sbhl_module(module);
        if (NIL != cache_strategy_keeps_metrics_p(cache_strategy)) {
            return cache_strategy_get_metrics(cache_strategy);
        }
        return NIL;
    }

    /**
     * Gather up all module metrics for the individual SBHL modules.
     */
    @LispMethod(comment = "Gather up all module metrics for the individual SBHL modules.")
    public static final SubLObject get_all_sbhl_module_cache_strategy_metrics_alt() {
        {
            SubLObject all_metrics = NIL;
            SubLObject cdolist_list_var = sbhl_module_vars.get_sbhl_module_list();
            SubLObject module = NIL;
            for (module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module = cdolist_list_var.first()) {
                {
                    SubLObject metrics = com.cyc.cycjava.cycl.sbhl.sbhl_graphs.get_sbhl_module_cache_strategy_metrics(module);
                    if (NIL != cache_utilities.cache_metrics_p(metrics)) {
                        all_metrics = cons(cons(sbhl_module_vars.get_sbhl_module_link_pred(module), metrics), all_metrics);
                    }
                }
            }
            return nreverse(all_metrics);
        }
    }

    @LispMethod(comment = "Gather up all module metrics for the individual SBHL modules.")
    public static SubLObject get_all_sbhl_module_cache_strategy_metrics() {
        SubLObject all_metrics = NIL;
        SubLObject cdolist_list_var = sbhl_module_vars.get_sbhl_module_list();
        SubLObject module = NIL;
        module = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject metrics = sbhl_graphs.get_sbhl_module_cache_strategy_metrics(module);
            if (NIL != cache_metrics_p(metrics)) {
                all_metrics = cons(cons(sbhl_module_vars.get_sbhl_module_link_pred(module), metrics), all_metrics);
            }
            cdolist_list_var = cdolist_list_var.rest();
            module = cdolist_list_var.first();
        } 
        return nreverse(all_metrics);
    }

    public static final SubLObject get_sbhl_module_cache_strategy_information_alt(SubLObject module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject predicate = sbhl_module_vars.get_sbhl_module_link_pred(module);
                SubLObject cache_strategy = com.cyc.cycjava.cycl.sbhl.sbhl_graphs.get_cache_strategy_for_sbhl_module(module);
                if (NIL == cache_utilities.cache_strategy_p(cache_strategy)) {
                    return values(predicate, MINUS_ONE_INTEGER, MINUS_ONE_INTEGER, MINUS_ONE_INTEGER, NIL);
                }
                thread.resetMultipleValues();
                {
                    SubLObject cache_capacity = cache_utilities.gather_cache_strategy_information(cache_strategy);
                    SubLObject hits = thread.secondMultipleValue();
                    SubLObject misses = thread.thirdMultipleValue();
                    SubLObject cache_too_small_p = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    return values(predicate, cache_capacity, hits, misses, cache_too_small_p);
                }
            }
        }
    }

    public static SubLObject get_sbhl_module_cache_strategy_information(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = sbhl_module_vars.get_sbhl_module_link_pred(module);
        final SubLObject cache_strategy = sbhl_graphs.get_cache_strategy_for_sbhl_module(module);
        if (NIL == cache_strategy_p(cache_strategy)) {
            return values(predicate, MINUS_ONE_INTEGER, MINUS_ONE_INTEGER, MINUS_ONE_INTEGER, NIL);
        }
        thread.resetMultipleValues();
        final SubLObject cache_capacity = gather_cache_strategy_information(cache_strategy);
        final SubLObject hits = thread.secondMultipleValue();
        final SubLObject misses = thread.thirdMultipleValue();
        final SubLObject cache_too_small_p = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        return values(predicate, cache_capacity, hits, misses, cache_too_small_p);
    }

    /**
     * Gather useful information for all of the cache strategies and render them
     * to standard output.
     */
    @LispMethod(comment = "Gather useful information for all of the cache strategies and render them\r\nto standard output.\nGather useful information for all of the cache strategies and render them\nto standard output.")
    public static final SubLObject show_all_sbhl_module_cache_strategies_alt() {
        {
            SubLObject sbhl_modules = sbhl_module_vars.get_sbhl_module_list();
            SubLObject info = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
            SubLObject pred_list = NIL;
            SubLObject max_name_length = ZERO_INTEGER;
            {
                SubLObject cdolist_list_var = sbhl_modules;
                SubLObject module = NIL;
                for (module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module = cdolist_list_var.first()) {
                    {
                        SubLObject module_info = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sbhl.sbhl_graphs.get_sbhl_module_cache_strategy_information(module)));
                        SubLObject predicate = module_info.first();
                        map_utilities.map_put(info, predicate, module_info);
                        pred_list = cons(predicate, pred_list);
                        max_name_length = max(max_name_length, length(kb_paths.fort_name(predicate)));
                    }
                }
            }
            string_utilities.indent(T, max_name_length);
            format(T, $str_alt33$Capacity______Hits____Misses__Sma);
            string_utilities.indent(T, max_name_length);
            format(T, $str_alt34$_________________________________);
            pred_list = Sort.sort(pred_list, $sym35$FORT__, UNPROVIDED);
            {
                SubLObject cdolist_list_var = pred_list;
                SubLObject predicate = NIL;
                for (predicate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , predicate = cdolist_list_var.first()) {
                    {
                        SubLObject module_info = map_utilities.map_get(info, predicate, UNPROVIDED);
                        format(T, $str_alt36$___A, predicate);
                        string_utilities.indent(T, subtract(max_name_length, length(kb_paths.fort_name(predicate))));
                        {
                            SubLObject datum = module_info;
                            SubLObject current = datum;
                            SubLObject predicate_again = NIL;
                            SubLObject capacity = NIL;
                            SubLObject hits = NIL;
                            SubLObject misses = NIL;
                            SubLObject too_small_p = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt37);
                            predicate_again = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt37);
                            capacity = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt37);
                            hits = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt37);
                            misses = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt37);
                            too_small_p = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if (capacity.isNegative()) {
                                    format(T, $str_alt38$_6_A__9_A__9_A__, new SubLObject[]{ $str_alt39$___, $str_alt39$___, $str_alt39$___ });
                                } else {
                                    format(T, $str_alt40$_6_d__9_d__9_d_____A__, new SubLObject[]{ capacity, hits, misses, NIL != too_small_p ? ((SubLObject) ($str_alt41$___)) : $str_alt42$ });
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt37);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Gather useful information for all of the cache strategies and render them\r\nto standard output.\nGather useful information for all of the cache strategies and render them\nto standard output.")
    public static SubLObject show_all_sbhl_module_cache_strategies() {
        final SubLObject sbhl_modules = sbhl_module_vars.get_sbhl_module_list();
        final SubLObject info = new_dictionary(UNPROVIDED, UNPROVIDED);
        SubLObject pred_list = NIL;
        SubLObject max_name_length = ZERO_INTEGER;
        SubLObject cdolist_list_var = sbhl_modules;
        SubLObject module = NIL;
        module = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject module_info = arg2(resetMultipleValues(), multiple_value_list(sbhl_graphs.get_sbhl_module_cache_strategy_information(module)));
            final SubLObject predicate = module_info.first();
            map_put(info, predicate, module_info);
            pred_list = cons(predicate, pred_list);
            max_name_length = max(max_name_length, length(fort_name(predicate)));
            cdolist_list_var = cdolist_list_var.rest();
            module = cdolist_list_var.first();
        } 
        indent(T, max_name_length);
        format(T, sbhl_graphs.$str35$Capacity______Hits____Misses__Sma);
        indent(T, max_name_length);
        format(T, sbhl_graphs.$str36$_________________________________);
        pred_list = cdolist_list_var = Sort.sort(pred_list, sbhl_graphs.$sym37$FORT__, UNPROVIDED);
        SubLObject predicate2 = NIL;
        predicate2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject module_info = map_get(info, predicate2, UNPROVIDED);
            format(T, sbhl_graphs.$str38$___A, predicate2);
            indent(T, subtract(max_name_length, length(fort_name(predicate2))));
            SubLObject current;
            final SubLObject datum = current = module_info;
            SubLObject predicate_again = NIL;
            SubLObject capacity = NIL;
            SubLObject hits = NIL;
            SubLObject misses = NIL;
            SubLObject too_small_p = NIL;
            destructuring_bind_must_consp(current, datum, sbhl_graphs.$list39);
            predicate_again = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, sbhl_graphs.$list39);
            capacity = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, sbhl_graphs.$list39);
            hits = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, sbhl_graphs.$list39);
            misses = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, sbhl_graphs.$list39);
            too_small_p = current.first();
            current = current.rest();
            if (NIL == current) {
                if (capacity.isNegative()) {
                    format(T, sbhl_graphs.$str40$_6_A__9_A__9_A__, new SubLObject[]{ sbhl_graphs.$str41$___, sbhl_graphs.$str41$___, sbhl_graphs.$str41$___ });
                } else {
                    format(T, sbhl_graphs.$str42$_6_d__9_d__9_d_____A__, new SubLObject[]{ capacity, hits, misses, NIL != too_small_p ? sbhl_graphs.$str43$___ : sbhl_graphs.$str44$ });
                }
            } else {
                cdestructuring_bind_error(datum, sbhl_graphs.$list39);
            }
            cdolist_list_var = cdolist_list_var.rest();
            predicate2 = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject stress_test_sbhl_graph_concurrent_swapping_alt(SubLObject checker_count, SubLObject term_count) {
        if (checker_count == UNPROVIDED) {
            checker_count = $default_number_of_concurrent_readers$.getGlobalValue();
        }
        if (term_count == UNPROVIDED) {
            term_count = $default_number_of_terms_checked$.getGlobalValue();
        }
        {
            SubLObject problem_queue = process_utilities.new_ipc_queue($str_alt44$Concurrent_Reads_Stress_Test_Prob);
            SubLObject checkers = NIL;
            SubLObject issue_list = NIL;
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(checker_count); i = add(i, ONE_INTEGER)) {
                {
                    SubLObject name = cconcatenate($str_alt45$Concurrent_SBHL_Reader_, format_nil.format_nil_a_no_copy(add(ONE_INTEGER, i)));
                    SubLObject checker = subl_promotions.make_process_with_args(name, STRESS_TEST_READ_RANDOMLY_FROM_SBHL, list(term_count, problem_queue));
                    sleep($float$0_1);
                    checkers = cons(checker, checkers);
                }
            }
            while (position_if(VALID_PROCESS_P, checkers, UNPROVIDED, UNPROVIDED, UNPROVIDED).isNumber()) {
                sleep(ONE_INTEGER);
            } 
            while (process_utilities.ipc_current_queue_size(problem_queue).isPositive()) {
                issue_list = cons(process_utilities.ipc_dequeue(problem_queue), issue_list);
            } 
            if (NIL != list_utilities.sublisp_boolean(issue_list)) {
                com.cyc.cycjava.cycl.sbhl.sbhl_graphs.swap_out_all_pristine_sbhl_module_graph_links();
            }
            return issue_list;
        }
    }

    public static SubLObject stress_test_sbhl_graph_concurrent_swapping(SubLObject checker_count, SubLObject term_count) {
        if (checker_count == UNPROVIDED) {
            checker_count = sbhl_graphs.$default_number_of_concurrent_readers$.getGlobalValue();
        }
        if (term_count == UNPROVIDED) {
            term_count = sbhl_graphs.$default_number_of_terms_checked$.getGlobalValue();
        }
        final SubLObject problem_queue = process_utilities.new_ipc_queue(sbhl_graphs.$str46$Concurrent_Reads_Stress_Test_Prob);
        SubLObject checkers = NIL;
        SubLObject issue_list = NIL;
        SubLObject i;
        SubLObject name;
        SubLObject checker;
        for (i = NIL, i = ZERO_INTEGER; i.numL(checker_count); i = add(i, ONE_INTEGER)) {
            name = cconcatenate(sbhl_graphs.$$$Concurrent_SBHL_Reader_, format_nil_a_no_copy(add(ONE_INTEGER, i)));
            checker = make_process_with_args(name, sbhl_graphs.STRESS_TEST_READ_RANDOMLY_FROM_SBHL, list(term_count, problem_queue));
            sleep(sbhl_graphs.$float$0_1);
            checkers = cons(checker, checkers);
        }
        while (position_if(sbhl_graphs.VALID_PROCESS_P, checkers, UNPROVIDED, UNPROVIDED, UNPROVIDED).isNumber()) {
            sleep(ONE_INTEGER);
        } 
        while (process_utilities.ipc_current_queue_size(problem_queue).isPositive()) {
            issue_list = cons(ipc_dequeue(problem_queue, UNPROVIDED), issue_list);
        } 
        if (NIL != sublisp_boolean(issue_list)) {
            sbhl_graphs.swap_out_all_pristine_sbhl_module_graph_links();
        }
        return issue_list;
    }

    public static final SubLObject stress_test_read_randomly_from_sbhl_alt(SubLObject term_count, SubLObject problem_queue) {
        {
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(term_count); i = add(i, ONE_INTEGER)) {
                {
                    SubLObject curr_term = random_constant(UNPROVIDED);
                    SubLObject error_message = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                            try {
                                bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                                try {
                                    isa.isa_in_any_mtP(curr_term, $$Individual);
                                } catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                rebind(Errors.$error_handler$, _prev_bind_0);
                            }
                        }
                    } catch (Throwable ccatch_env_var) {
                        error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                    }
                    if (error_message.isString()) {
                        process_utilities.ipc_enqueue(cons(curr_term, error_message), problem_queue);
                    }
                }
            }
        }
        return $DONE;
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
                        isa_in_any_mtP(curr_term, sbhl_graphs.$$Individual);
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
                ipc_enqueue(cons(curr_term, error_message), problem_queue, UNPROVIDED);
            }
        }
        return $DONE;
    }

    public static final SubLObject stress_test_sbhl_graph_concurrent_cache_strategy_update_alt(SubLObject checker_count) {
        if (checker_count == UNPROVIDED) {
            checker_count = $default_number_of_concurrent_readers$.getGlobalValue();
        }
        {
            SubLObject problem_queue = process_utilities.new_ipc_queue($str_alt51$Concurrent_Cache_Strategy_Stress_);
            SubLObject checkers = NIL;
            SubLObject issue_list = NIL;
            SubLObject term_list = $list_alt52;
            SubLObject process_args = list(checker_count, term_list, problem_queue);
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(checker_count); i = add(i, ONE_INTEGER)) {
                {
                    SubLObject name = cconcatenate($str_alt45$Concurrent_SBHL_Reader_, format_nil.format_nil_a_no_copy(add(ONE_INTEGER, i)));
                    SubLObject checker = subl_promotions.make_process_with_args(name, STRESS_TEST_CHECK_SAME_SPECS, process_args);
                    sleep($float$0_1);
                    checkers = cons(checker, checkers);
                }
            }
            while (position_if(VALID_PROCESS_P, checkers, UNPROVIDED, UNPROVIDED, UNPROVIDED).isNumber()) {
                sleep(ONE_INTEGER);
            } 
            while (process_utilities.ipc_current_queue_size(problem_queue).isPositive()) {
                issue_list = cons(process_utilities.ipc_dequeue(problem_queue), issue_list);
            } 
            if (NIL != list_utilities.sublisp_boolean(issue_list)) {
                com.cyc.cycjava.cycl.sbhl.sbhl_graphs.swap_out_all_pristine_sbhl_module_graph_links();
            }
            return issue_list;
        }
    }

    public static SubLObject stress_test_sbhl_graph_concurrent_cache_strategy_update(SubLObject checker_count) {
        if (checker_count == UNPROVIDED) {
            checker_count = sbhl_graphs.$default_number_of_concurrent_readers$.getGlobalValue();
        }
        final SubLObject problem_queue = process_utilities.new_ipc_queue(sbhl_graphs.$str53$Concurrent_Cache_Strategy_Stress_);
        SubLObject checkers = NIL;
        SubLObject issue_list = NIL;
        final SubLObject term_list = sbhl_graphs.$list54;
        final SubLObject process_args = list(checker_count, term_list, problem_queue);
        SubLObject i;
        SubLObject name;
        SubLObject checker;
        for (i = NIL, i = ZERO_INTEGER; i.numL(checker_count); i = add(i, ONE_INTEGER)) {
            name = cconcatenate(sbhl_graphs.$$$Concurrent_SBHL_Reader_, format_nil_a_no_copy(add(ONE_INTEGER, i)));
            checker = make_process_with_args(name, sbhl_graphs.STRESS_TEST_CHECK_SAME_SPECS, process_args);
            sleep(sbhl_graphs.$float$0_1);
            checkers = cons(checker, checkers);
        }
        while (position_if(sbhl_graphs.VALID_PROCESS_P, checkers, UNPROVIDED, UNPROVIDED, UNPROVIDED).isNumber()) {
            sleep(ONE_INTEGER);
        } 
        while (process_utilities.ipc_current_queue_size(problem_queue).isPositive()) {
            issue_list = cons(ipc_dequeue(problem_queue, UNPROVIDED), issue_list);
        } 
        if (NIL != sublisp_boolean(issue_list)) {
            sbhl_graphs.swap_out_all_pristine_sbhl_module_graph_links();
        }
        return issue_list;
    }

    public static final SubLObject stress_test_check_same_specs_alt(SubLObject attempts, SubLObject term_list, SubLObject problem_queue) {
        {
            SubLObject problems = NIL;
            {
                SubLObject cdolist_list_var = term_list;
                SubLObject v_term = NIL;
                for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                    {
                        SubLObject count = NIL;
                        for (count = ZERO_INTEGER; count.numL(attempts); count = add(count, ONE_INTEGER)) {
                            {
                                SubLObject error_message = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                                        try {
                                            bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                                            try {
                                                genls.all_specs(v_term, $$InferencePSC, UNPROVIDED);
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            rebind(Errors.$error_handler$, _prev_bind_0);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                }
                                if (error_message.isString()) {
                                    problems = cons(list(v_term, count, error_message), problems);
                                }
                            }
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = nreverse(problems);
                SubLObject problem = NIL;
                for (problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , problem = cdolist_list_var.first()) {
                    process_utilities.ipc_enqueue(problem, problem_queue);
                }
            }
        }
        return $DONE;
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
                            all_specs(v_term, sbhl_graphs.$$InferencePSC, UNPROVIDED);
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
            ipc_enqueue(problem, problem_queue, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            problem = cdolist_list_var.first();
        } 
        return $DONE;
    }

    public static SubLObject declare_sbhl_graphs_file() {
        declareFunction("optimize_sbhl_store", "OPTIMIZE-SBHL-STORE", 0, 0, false);
        declareFunction("sbhl_graph_object_p", "SBHL-GRAPH-OBJECT-P", 1, 0, false);
        declareFunction("make_new_sbhl_graph", "MAKE-NEW-SBHL-GRAPH", 0, 0, false);
        declareFunction("clear_sbhl_graph", "CLEAR-SBHL-GRAPH", 1, 0, false);
        declareFunction("initialize_sbhl_graph_caches", "INITIALIZE-SBHL-GRAPH-CACHES", 0, 0, false);
        declareFunction("initialize_sbhl_graph_caches_file_vector", "INITIALIZE-SBHL-GRAPH-CACHES-FILE-VECTOR", 2, 0, false);
        declareFunction("sbhl_change_stream_buffer_sizes", "SBHL-CHANGE-STREAM-BUFFER-SIZES", 2, 0, false);
        declareFunction("sbhl_enable_memory_mapping", "SBHL-ENABLE-MEMORY-MAPPING", 0, 0, false);
        declareFunction("new_cache_strategy_for_sbhl_module", "NEW-CACHE-STRATEGY-FOR-SBHL-MODULE", 1, 1, false);
        declareFunction("get_cache_strategy_for_sbhl_module", "GET-CACHE-STRATEGY-FOR-SBHL-MODULE", 1, 0, false);
        declareFunction("set_cache_strategy_for_sbhl_module", "SET-CACHE-STRATEGY-FOR-SBHL-MODULE", 2, 0, false);
        declareFunction("cache_capacity_for_cache_strategy_for_sbhl_module", "CACHE-CAPACITY-FOR-CACHE-STRATEGY-FOR-SBHL-MODULE", 1, 0, false);
        declareFunction("initialize_sbhl_graph_caches_during_load_kb", "INITIALIZE-SBHL-GRAPH-CACHES-DURING-LOAD-KB", 2, 0, false);
        declareFunction("sbhl_graph_completely_cachedP", "SBHL-GRAPH-COMPLETELY-CACHED?", 0, 0, false);
        declareFunction("get_sbhl_module_caching_ratio", "GET-SBHL-MODULE-CACHING-RATIO", 1, 0, false);
        declareFunction("get_sbhl_modules_caching_ratios", "GET-SBHL-MODULES-CACHING-RATIOS", 0, 0, false);
        declareFunction("get_sbhl_graph_link_from_graph", "GET-SBHL-GRAPH-LINK-FROM-GRAPH", 3, 0, false);
        declareFunction("put_sbhl_graph_link_into_graph", "PUT-SBHL-GRAPH-LINK-INTO-GRAPH", 4, 0, false);
        declareFunction("remove_sbhl_graph_link_from_graph", "REMOVE-SBHL-GRAPH-LINK-FROM-GRAPH", 3, 0, false);
        declareFunction("touch_sbhl_link_graph", "TOUCH-SBHL-LINK-GRAPH", 3, 0, false);
        declareFunction("get_sbhl_graph_link", "GET-SBHL-GRAPH-LINK", 2, 0, false);
        declareFunction("set_sbhl_graph_link", "SET-SBHL-GRAPH-LINK", 3, 0, false);
        declareFunction("touch_sbhl_graph_link", "TOUCH-SBHL-GRAPH-LINK", 3, 0, false);
        declareFunction("logging_tag_for_module", "LOGGING-TAG-FOR-MODULE", 1, 0, false);
        declareFunction("remove_sbhl_graph_link", "REMOVE-SBHL-GRAPH-LINK", 2, 0, false);
        declareMacro("do_sbhl_graph_links", "DO-SBHL-GRAPH-LINKS");
        declareFunction("swap_in_all_graph_links", "SWAP-IN-ALL-GRAPH-LINKS", 1, 0, false);
        declareFunction("swap_out_all_pristine_graph_links", "SWAP-OUT-ALL-PRISTINE-GRAPH-LINKS", 1, 0, false);
        declareFunction("swap_out_all_pristine_sbhl_module_graph_links", "SWAP-OUT-ALL-PRISTINE-SBHL-MODULE-GRAPH-LINKS", 0, 0, false);
        declareFunction("get_sbhl_module_cache_strategy_metrics", "GET-SBHL-MODULE-CACHE-STRATEGY-METRICS", 1, 0, false);
        declareFunction("get_all_sbhl_module_cache_strategy_metrics", "GET-ALL-SBHL-MODULE-CACHE-STRATEGY-METRICS", 0, 0, false);
        declareFunction("get_sbhl_module_cache_strategy_information", "GET-SBHL-MODULE-CACHE-STRATEGY-INFORMATION", 1, 0, false);
        declareFunction("show_all_sbhl_module_cache_strategies", "SHOW-ALL-SBHL-MODULE-CACHE-STRATEGIES", 0, 0, false);
        declareFunction("stress_test_sbhl_graph_concurrent_swapping", "STRESS-TEST-SBHL-GRAPH-CONCURRENT-SWAPPING", 0, 2, false);
        declareFunction("stress_test_read_randomly_from_sbhl", "STRESS-TEST-READ-RANDOMLY-FROM-SBHL", 2, 0, false);
        declareFunction("stress_test_sbhl_graph_concurrent_cache_strategy_update", "STRESS-TEST-SBHL-GRAPH-CONCURRENT-CACHE-STRATEGY-UPDATE", 0, 1, false);
        declareFunction("stress_test_check_same_specs", "STRESS-TEST-CHECK-SAME-SPECS", 3, 0, false);
        return NIL;
    }

    public static final SubLObject init_sbhl_graphs_file_alt() {
        deflexical("*SBHL-GRAPH-EQUALITY-TEST*", symbol_function(EQ));
        deflexical("*SBHL-BACKING-FILE-VECTOR*", NIL != boundp($sbhl_backing_file_vector$) ? ((SubLObject) ($sbhl_backing_file_vector$.getGlobalValue())) : NIL);
        deflexical("*SBHL-BACKING-FILE-VECTOR-CACHES-FOR-MODULES*", NIL != boundp($sbhl_backing_file_vector_caches_for_modules$) ? ((SubLObject) ($sbhl_backing_file_vector_caches_for_modules$.getGlobalValue())) : NIL);
        defparameter("*SBHL-BACKING-FILE-VECTOR-CACHE-SIZE-PERCENTAGE*", TWO_INTEGER);
        defparameter("*SBHL-BACKING-FILE-VECTOR-CACHE-MINIMUM-SIZE*", $int$100);
        defparameter("*SBHL-BACKING-FILE-VECTOR-CACHE-GATHER-CACHE-METRICS?*", T);
        deflexical("*SBHL-FILE-VECTOR-DATA-STREAM-LOCK*", NIL != boundp($sbhl_file_vector_data_stream_lock$) ? ((SubLObject) ($sbhl_file_vector_data_stream_lock$.getGlobalValue())) : make_lock($$$SBHL_File_Vector_Data_Stream_lock));
        deflexical("*SBHL-BACKING-FILE-VECTOR-CACHE-CONSTRUCTOR*", NEW_METERED_PREALLOCATED_CACHE);
        deflexical("*DEFAULT-NUMBER-OF-CONCURRENT-READERS*", TWENTY_INTEGER);
        deflexical("*DEFAULT-NUMBER-OF-TERMS-CHECKED*", $int$500);
        return NIL;
    }

    public static SubLObject init_sbhl_graphs_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*SBHL-GRAPH-EQUALITY-TEST*", symbol_function(EQL));
            deflexical("*SBHL-BACKING-FILE-VECTOR*", SubLTrampolineFile.maybeDefault(sbhl_graphs.$sbhl_backing_file_vector$, sbhl_graphs.$sbhl_backing_file_vector$, NIL));
            deflexical("*SBHL-BACKING-FILE-VECTOR-CACHES-FOR-MODULES*", SubLTrampolineFile.maybeDefault(sbhl_graphs.$sbhl_backing_file_vector_caches_for_modules$, sbhl_graphs.$sbhl_backing_file_vector_caches_for_modules$, NIL));
            defparameter("*SBHL-BACKING-FILE-VECTOR-CACHE-SIZE-PERCENTAGE*", TWO_INTEGER);
            defparameter("*SBHL-BACKING-FILE-VECTOR-CACHE-MINIMUM-SIZE*", $int$100);
            defparameter("*SBHL-BACKING-FILE-VECTOR-CACHE-GATHER-CACHE-METRICS?*", T);
            deflexical("*SBHL-FILE-VECTOR-DATA-STREAM-LOCK*", SubLTrampolineFile.maybeDefault(sbhl_graphs.$sbhl_file_vector_data_stream_lock$, sbhl_graphs.$sbhl_file_vector_data_stream_lock$, () -> make_lock(sbhl_graphs.$$$SBHL_File_Vector_Data_Stream_lock)));
            deflexical("*SBHL-BACKING-FILE-VECTOR-CACHE-CONSTRUCTOR*", sbhl_graphs.NEW_METERED_PREALLOCATED_CACHE);
            defparameter("*OVERRIDE-SBHL-ISA-MODULE-WITH-KB-LOOKUP?*", NIL);
            deflexical("*DEFAULT-NUMBER-OF-CONCURRENT-READERS*", TWENTY_INTEGER);
            deflexical("*DEFAULT-NUMBER-OF-TERMS-CHECKED*", sbhl_graphs.$int$500);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*SBHL-GRAPH-EQUALITY-TEST*", symbol_function(EQ));
            deflexical("*SBHL-BACKING-FILE-VECTOR*", NIL != boundp($sbhl_backing_file_vector$) ? ((SubLObject) ($sbhl_backing_file_vector$.getGlobalValue())) : NIL);
            deflexical("*SBHL-BACKING-FILE-VECTOR-CACHES-FOR-MODULES*", NIL != boundp($sbhl_backing_file_vector_caches_for_modules$) ? ((SubLObject) ($sbhl_backing_file_vector_caches_for_modules$.getGlobalValue())) : NIL);
            deflexical("*SBHL-FILE-VECTOR-DATA-STREAM-LOCK*", NIL != boundp($sbhl_file_vector_data_stream_lock$) ? ((SubLObject) ($sbhl_file_vector_data_stream_lock$.getGlobalValue())) : make_lock($$$SBHL_File_Vector_Data_Stream_lock));
        }
        return NIL;
    }

    public static SubLObject init_sbhl_graphs_file_Previous() {
        deflexical("*SBHL-GRAPH-EQUALITY-TEST*", symbol_function(EQL));
        deflexical("*SBHL-BACKING-FILE-VECTOR*", SubLTrampolineFile.maybeDefault(sbhl_graphs.$sbhl_backing_file_vector$, sbhl_graphs.$sbhl_backing_file_vector$, NIL));
        deflexical("*SBHL-BACKING-FILE-VECTOR-CACHES-FOR-MODULES*", SubLTrampolineFile.maybeDefault(sbhl_graphs.$sbhl_backing_file_vector_caches_for_modules$, sbhl_graphs.$sbhl_backing_file_vector_caches_for_modules$, NIL));
        defparameter("*SBHL-BACKING-FILE-VECTOR-CACHE-SIZE-PERCENTAGE*", TWO_INTEGER);
        defparameter("*SBHL-BACKING-FILE-VECTOR-CACHE-MINIMUM-SIZE*", $int$100);
        defparameter("*SBHL-BACKING-FILE-VECTOR-CACHE-GATHER-CACHE-METRICS?*", T);
        deflexical("*SBHL-FILE-VECTOR-DATA-STREAM-LOCK*", SubLTrampolineFile.maybeDefault(sbhl_graphs.$sbhl_file_vector_data_stream_lock$, sbhl_graphs.$sbhl_file_vector_data_stream_lock$, () -> make_lock(sbhl_graphs.$$$SBHL_File_Vector_Data_Stream_lock)));
        deflexical("*SBHL-BACKING-FILE-VECTOR-CACHE-CONSTRUCTOR*", sbhl_graphs.NEW_METERED_PREALLOCATED_CACHE);
        defparameter("*OVERRIDE-SBHL-ISA-MODULE-WITH-KB-LOOKUP?*", NIL);
        deflexical("*DEFAULT-NUMBER-OF-CONCURRENT-READERS*", TWENTY_INTEGER);
        deflexical("*DEFAULT-NUMBER-OF-TERMS-CHECKED*", sbhl_graphs.$int$500);
        return NIL;
    }

    public static SubLObject setup_sbhl_graphs_file() {
        declare_defglobal(sbhl_graphs.$sbhl_backing_file_vector$);
        declare_defglobal(sbhl_graphs.$sbhl_backing_file_vector_caches_for_modules$);
        declare_defglobal(sbhl_graphs.$sbhl_file_vector_data_stream_lock$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        sbhl_graphs.declare_sbhl_graphs_file();
    }

    @Override
    public void initializeVariables() {
        sbhl_graphs.init_sbhl_graphs_file();
    }

    @Override
    public void runTopLevelForms() {
        sbhl_graphs.setup_sbhl_graphs_file();
    }

    static {
    }

    static private final SubLString $str_alt6$sbhl_module_graphs = makeString("sbhl-module-graphs");

    static private final SubLString $str_alt8$sbhl_module_graphs_index = makeString("sbhl-module-graphs-index");

    static private final SubLString $str_alt14$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $str_alt19$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    static private final SubLList $list_alt21 = list(list(makeSymbol("NODE-VAR"), makeSymbol("LINK-VAR"), makeSymbol("&KEY"), makeSymbol("MODULE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt22 = list(makeKeyword("MODULE"), $DONE);

    static private final SubLList $list_alt28 = list(makeSymbol("GET-HL-STORE-CACHES-SHARED-SYMBOLS"));

    static private final SubLList $list_alt32 = list(makeSymbol("NODE"), makeUninternedSymbol("IMPL-VALUE"));

    static private final SubLString $str_alt33$Capacity______Hits____Misses__Sma = makeString("Capacity      Hits    Misses  Small?~%");

    static private final SubLString $str_alt34$_________________________________ = makeString("------------------------------------~%");

    static private final SubLSymbol $sym35$FORT__ = makeSymbol("FORT-<");

    static private final SubLString $str_alt36$___A = makeString("~&~A");

    static private final SubLList $list_alt37 = list(makeSymbol("PREDICATE-AGAIN"), makeSymbol("CAPACITY"), makeSymbol("HITS"), makeSymbol("MISSES"), makeSymbol("TOO-SMALL-P"));

    static private final SubLString $str_alt38$_6_A__9_A__9_A__ = makeString("~6,A ~9,A ~9,A~%");

    static private final SubLString $str_alt39$___ = makeString("---");

    static private final SubLString $str_alt40$_6_d__9_d__9_d_____A__ = makeString("~6,d ~9,d ~9,d    ~A~%");

    static private final SubLString $str_alt41$___ = makeString("!!!");

    static private final SubLString $str_alt44$Concurrent_Reads_Stress_Test_Prob = makeString("Concurrent Reads Stress Test Problems");

    static private final SubLString $str_alt45$Concurrent_SBHL_Reader_ = makeString("Concurrent SBHL Reader ");

    static private final SubLString $str_alt51$Concurrent_Cache_Strategy_Stress_ = makeString("Concurrent Cache Strategy Stress Test Problems");

    static private final SubLList $list_alt52 = list(reader_make_constant_shell("Organism"));
}

/**
 * Total time: 287 ms
 */
