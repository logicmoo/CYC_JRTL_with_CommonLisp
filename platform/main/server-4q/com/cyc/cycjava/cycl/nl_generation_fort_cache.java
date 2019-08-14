/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output_externalized;
import static com.cyc.cycjava.cycl.constant_handles.do_constants_table;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.build_kb_loaded;
import static com.cyc.cycjava.cycl.control_vars.kb_loaded;
import static com.cyc.cycjava.cycl.id_index.do_id_index_empty_p;
import static com.cyc.cycjava.cycl.id_index.do_id_index_id_and_object_validP;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_state;
import static com.cyc.cycjava.cycl.id_index.do_id_index_state_object;
import static com.cyc.cycjava.cycl.id_index.id_index_count;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_id_threshold;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.cycjava.cycl.operation_communication.kb_op_number;
import static com.cyc.cycjava.cycl.operation_communication.kb_version_string;
import static com.cyc.cycjava.cycl.set.clear_set;
import static com.cyc.cycjava.cycl.set.new_set;
import static com.cyc.cycjava.cycl.set.set_add;
import static com.cyc.cycjava.cycl.set.set_memberP;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$with_timeout_nesting_depth$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$within_with_timeout$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_make_tag;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_start_timer;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_stop_timer;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_note$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_total$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.ceiling;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.expt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.floor;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.log;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.minus;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.mod;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numGE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_value;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.nth_value_step_1;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.nth_value_step_2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      NL-GENERATION-FORT-CACHE
 * source file: /cyc/top/cycl/nl-generation-fort-cache.lisp
 * created:     2019/07/03 17:38:17
 */
public final class nl_generation_fort_cache extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt90$ = makeString("");

    public static final SubLFile me = new nl_generation_fort_cache();

 public static final String myName = "com.cyc.cycjava.cycl.nl_generation_fort_cache";


    // defparameter
    @LispMethod(comment = "Whether we want to do cache lookups of generic singular NL generations..\ndefparameter")
    /**
     * Whether we want to do cache lookups of generic singular NL generations..
     */
    public static final SubLSymbol $use_generic_singular_nl_generation_fort_cacheP$ = makeSymbol("*USE-GENERIC-SINGULAR-NL-GENERATION-FORT-CACHE?*");

    // deflexical
    /**
     * Lock used for opening the file hashtable to prevent multiple version from
     * being opened
     */
    @LispMethod(comment = "Lock used for opening the file hashtable to prevent multiple version from\r\nbeing opened\ndeflexical\nLock used for opening the file hashtable to prevent multiple version from\nbeing opened")
    private static final SubLSymbol $nl_generation_fht_lock$ = makeSymbol("*NL-GENERATION-FHT-LOCK*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $max_kbs_backward_to_look_for_generation_cache$ = makeSymbol("*MAX-KBS-BACKWARD-TO-LOOK-FOR-GENERATION-CACHE*");

    // deflexical
    // Set back to T if it is ever fast enough for the CRTL.
    /**
     * Set back to T if it is ever fast enough for the CRTL.
     */
    @LispMethod(comment = "Set back to T if it is ever fast enough for the CRTL.\ndeflexical")
    private static final SubLSymbol $preload_nl_generation_cachesP$ = makeSymbol("*PRELOAD-NL-GENERATION-CACHES?*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $nl_generation_fort_cache_generator_timestamp$ = makeSymbol("*NL-GENERATION-FORT-CACHE-GENERATOR-TIMESTAMP*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $nl_generation_fort_cache_paraphrase_mt$ = makeSymbol("*NL-GENERATION-FORT-CACHE-PARAPHRASE-MT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $nl_generation_fort_cache_nl_preds$ = makeSymbol("*NL-GENERATION-FORT-CACHE-NL-PREDS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $nl_generation_fort_cache_break_on_timeoutP$ = makeSymbol("*NL-GENERATION-FORT-CACHE-BREAK-ON-TIMEOUT?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $nl_generation_fort_cache_retry_on_timeoutP$ = makeSymbol("*NL-GENERATION-FORT-CACHE-RETRY-ON-TIMEOUT?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $nl_generation_fort_cache_timeout$ = makeSymbol("*NL-GENERATION-FORT-CACHE-TIMEOUT*");

    // defparameter
    // Should we create graphs of various statistics while generating the cache?
    /**
     * Should we create graphs of various statistics while generating the cache?
     */
    @LispMethod(comment = "Should we create graphs of various statistics while generating the cache?\ndefparameter")
    public static final SubLSymbol $nl_generation_fort_cache_generate_plotsP$ = makeSymbol("*NL-GENERATION-FORT-CACHE-GENERATE-PLOTS?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $nl_generation_fort_cache_median_times$ = makeSymbol("*NL-GENERATION-FORT-CACHE-MEDIAN-TIMES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $nl_generation_fort_cache_total_times$ = makeSymbol("*NL-GENERATION-FORT-CACHE-TOTAL-TIMES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $nl_generation_fort_cache_cpu_times$ = makeSymbol("*NL-GENERATION-FORT-CACHE-CPU-TIMES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $nl_generation_fort_cache_swap_times$ = makeSymbol("*NL-GENERATION-FORT-CACHE-SWAP-TIMES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $nl_generation_fort_cache_failed_fort_counts$ = makeSymbol("*NL-GENERATION-FORT-CACHE-FAILED-FORT-COUNTS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $nl_generation_fort_cache_gc_times$ = makeSymbol("*NL-GENERATION-FORT-CACHE-GC-TIMES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $nl_generation_fort_cache_working_directory$ = makeSymbol("*NL-GENERATION-FORT-CACHE-WORKING-DIRECTORY*");

    // deflexical
    /**
     * How many FORTs do we paraphrase in a batch, for purposes of gathering
     * statistics?
     */
    @LispMethod(comment = "How many FORTs do we paraphrase in a batch, for purposes of gathering\r\nstatistics?\ndeflexical\nHow many FORTs do we paraphrase in a batch, for purposes of gathering\nstatistics?")
    private static final SubLSymbol $nl_generation_fort_cache_batch_size$ = makeSymbol("*NL-GENERATION-FORT-CACHE-BATCH-SIZE*");

    // deflexical
    /**
     * How many FORTs do we paraphrase in a single image? Must be a multiple of
     * NL-GENERATION-FORT-CACHE-BATCH-SIZE*.
     */
    @LispMethod(comment = "How many FORTs do we paraphrase in a single image? Must be a multiple of\r\nNL-GENERATION-FORT-CACHE-BATCH-SIZE*.\ndeflexical\nHow many FORTs do we paraphrase in a single image? Must be a multiple of\nNL-GENERATION-FORT-CACHE-BATCH-SIZE*.")
    private static final SubLSymbol $nl_generation_fort_cache_assignment_size$ = makeSymbol("*NL-GENERATION-FORT-CACHE-ASSIGNMENT-SIZE*");

    // defparameter
    /**
     * This is where the parent will deposit the tasks for the children to perform.
     */
    @LispMethod(comment = "This is where the parent will deposit the tasks for the children to perform.\ndefparameter")
    private static final SubLSymbol $nl_fort_generation_task$ = makeSymbol("*NL-FORT-GENERATION-TASK*");

    // deflexical
    /**
     * This is where the callback will deposit the results for the parent to wait
     * for.
     */
    @LispMethod(comment = "This is where the callback will deposit the results for the parent to wait\r\nfor.\ndeflexical\nThis is where the callback will deposit the results for the parent to wait\nfor.")
    private static final SubLSymbol $nl_fort_generation_results_queue$ = makeSymbol("*NL-FORT-GENERATION-RESULTS-QUEUE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $rich_nl_generation_cache_styleP$ = makeSymbol("*RICH-NL-GENERATION-CACHE-STYLE?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $nl_generation_fort_cache_use_forked_processesP$ = makeSymbol("*NL-GENERATION-FORT-CACHE-USE-FORKED-PROCESSES?*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $failed_nl_fort_generation_tasks$ = makeSymbol("*FAILED-NL-FORT-GENERATION-TASKS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $nl_generation_fort_cache_retry_failed_tasksP$ = makeSymbol("*NL-GENERATION-FORT-CACHE-RETRY-FAILED-TASKS?*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $nanoseconds_per_second$ = makeSymbol("*NANOSECONDS-PER-SECOND*");

    // defparameter
    /**
     * Don't cache paraphrases of NARTs whose sister-to-gaf ratio exceeds this
     * number.
     */
    @LispMethod(comment = "Don\'t cache paraphrases of NARTs whose sister-to-gaf ratio exceeds this\r\nnumber.\ndefparameter\nDon\'t cache paraphrases of NARTs whose sister-to-gaf ratio exceeds this\nnumber.")
    private static final SubLSymbol $nart_max_sister_to_gaf_ratio$ = makeSymbol("*NART-MAX-SISTER-TO-GAF-RATIO*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $english_generation_fort_cache$ = makeSymbol("*ENGLISH-GENERATION-FORT-CACHE*");

    static private final SubLList $list1 = list(makeString("application.file-backed-cache.generic-singular-nl-generation-fort-cache-file-name"));

    public static final SubLSymbol $english_generation_base_file_name$ = makeSymbol("*ENGLISH-GENERATION-BASE-FILE-NAME*");

    static private final SubLString $str3$generic_singular_nl_generation_fo = makeString("generic-singular-nl-generation-fort-cache.fht");

    static private final SubLString $str5$nl_generation_fht_lock = makeString("nl-generation-fht-lock");

    static private final SubLList $list6 = list(list(makeSymbol("FILENAME")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym7$CACHE = makeUninternedSymbol("CACHE");

    static private final SubLSymbol $sym8$BASE_FILE_NAME = makeUninternedSymbol("BASE-FILE-NAME");

    public static final SubLSymbol $english_generation_fht_name$ = makeSymbol("*ENGLISH-GENERATION-FHT-NAME*");

    static private final SubLList $list11 = list(list(makeSymbol("GET-ENGLISH-GENERATION-FORT-CACHE")));

    static private final SubLList $list12 = list(makeSymbol("*ENGLISH-GENERATION-BASE-FILE-NAME*"));

    private static final SubLSymbol SET_TEMPORARY_ENGLISH_GENERATION_FORT_CACHE = makeSymbol("SET-TEMPORARY-ENGLISH-GENERATION-FORT-CACHE");

    private static final SubLSymbol RESTORE_ENGLISH_GENERATION_FORT_CACHE = makeSymbol("RESTORE-ENGLISH-GENERATION-FORT-CACHE");

    private static final SubLSymbol GET_ENGLISH_GENERATION_FORT_CACHE = makeSymbol("GET-ENGLISH-GENERATION-FORT-CACHE");

    private static final SubLSymbol WITH_DEFAULT_NL_GENERATION_CACHE_FILE_PATH = makeSymbol("WITH-DEFAULT-NL-GENERATION-CACHE-FILE-PATH");

    private static final SubLString $str19$_ = makeString("/");

    private static final SubLSymbol INITIALIZE_NL_GENERATION_CACHES = makeSymbol("INITIALIZE-NL-GENERATION-CACHES");

    private static final SubLSymbol $HL_EXTERNALIZED_KEYS = makeKeyword("HL-EXTERNALIZED-KEYS");

    private static final SubLList $list24 = list(reader_make_constant_shell("nonPlural-Generic"));

    private static final SubLInteger $int$60 = makeInteger(60);

    private static final SubLInteger $int$10000 = makeInteger(10000);

    private static final SubLString $$$NL_FORT_Generation_Results_Queue = makeString("NL FORT Generation Results Queue");

    private static final SubLString $str31$tmp_ = makeString("tmp/");

    private static final SubLString $str32$Gen_template_store_is_stale_ = makeString("Gen-template store is stale.");

    private static final SubLString $str33$Generating_nl_cache_to_file___A = makeString("Generating nl cache to file: ~A");

    private static final SubLString $str35$fort_count_cfasl = makeString("fort-count.cfasl");

    private static final SubLString $str36$Generating_FORT_paraphrases__ = makeString("Generating FORT paraphrases (");

    private static final SubLString $str37$____ = makeString(")...");

    private static final SubLString $str38$_S_already_exists_ = makeString("~S already exists.");

    private static final SubLSymbol CREATE_FILTERED_NL_GENERATION_FHT_FROM_DATA = makeSymbol("CREATE-FILTERED-NL-GENERATION-FHT-FROM-DATA");

    private static final SubLString $str40$Cannot_filter_without_a_set__got_ = makeString("Cannot filter without a set, got ~A.");

    private static final SubLString $str41$Compiling_file_hashtable_from_par = makeString("Compiling file hashtable from paraphrase data...");

    private static final SubLSymbol $sym43$STRING_ = makeSymbol("STRING<");

    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLString $str45$_done = makeString("/done");

    private static final SubLString $str46$Skipping_assignment_directory_wit = makeString("Skipping assignment directory with no \"done\" file: ~S");

    private static final SubLString $str47$build_kb_loaded_cfasl = makeString("build-kb-loaded.cfasl");

    private static final SubLString $str48$_results_cfasl = makeString("/results.cfasl");

    private static final SubLString $str49$_fast_results_cfasl = makeString("/fast-results.cfasl");

    private static final SubLString $str50$Using_results_file__S = makeString("Using results file ~S");

    private static final SubLString $str52$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $str54$Non_FORT__S_in_paraphrase_data___ = makeString("Non-FORT ~S in paraphrase data: ~S");

    private static final SubLString $str55$Bad_paraphrase_data_for__S_in__S_ = makeString("Bad paraphrase data for ~S in ~S:~% ~S");

    private static final SubLString $str56$Skipping_black_listed_term__A___ = makeString("Skipping black-listed term ~A.~%");

    private static final SubLString $str58$nl_generation_cache_work_ = makeString("nl-generation-cache-work/");

    private static final SubLString $$$777 = makeString("777");

    private static final SubLString $str60$assignment_size_cfasl = makeString("assignment-size.cfasl");

    private static final SubLString $str61$paraphrase_mt_cfasl = makeString("paraphrase-mt.cfasl");

    private static final SubLString $str62$Assignment_size_is__S__Must_be_a_ = makeString("Assignment size is ~S. Must be a multiple of ~D.");

    private static final SubLString $str63$_ = makeString("~");

    private static final SubLString $str64$__0D__ = makeString(",'0D-~");

    private static final SubLString $str65$__0D_ = makeString(",'0D/");

    private static final SubLString $str66$error_output_log = makeString("error-output.log");

    private static final SubLString $str67$__Assigning_task__S__ = makeString("~&Assigning task ~S~%");

    private static final SubLSymbol DO_NEXT_FORT_PARAPHRASE_CACHE_GENERATION_TASK = makeSymbol("DO-NEXT-FORT-PARAPHRASE-CACHE-GENERATION-TASK");

    private static final SubLSymbol WAKE_UP_FORT_PARAPHRASE_CACHE_TASKMASTER = makeSymbol("WAKE-UP-FORT-PARAPHRASE-CACHE-TASKMASTER");

    private static final SubLString $str70$__Just_dequeued__S_after_enqueuei = makeString("~&Just dequeued ~S after enqueueing ~S~%");

    private static final SubLString $str71$__Successfully_completed__S__ = makeString("~&Successfully completed ~S~%");

    private static final SubLString $str72$Received_failure_code_on_task__S = makeString("Received failure code on task ~S");

    private static final SubLString $str73$Didn_t_recognize_exit_code__S = makeString("Didn't recognize exit code ~S");

    private static final SubLString $str74$NL_FORT_Generation_subtask_report = makeString("NL FORT Generation subtask reported failure:~% ~S");

    private static final SubLString $str75$__About_to_enqueue_new_exit_code_ = makeString("~&About to enqueue new exit code ~S~%");

    private static final SubLString $str76$Just_received_task_specification_ = makeString("Just received task specification ~S");

    private static final SubLList $list77 = list(makeSymbol("TASK-ID"), makeSymbol("MY-TASK-DIRECTORY"), makeSymbol("START-NUM"), makeSymbol("END-NUM"));

    private static final SubLString $str78$Returning__S = makeString("Returning ~S");

    private static final SubLString $str79$results_cfasl = makeString("results.cfasl");

    private static final SubLString $str80$fast_results_cfasl = makeString("fast-results.cfasl");

    private static final SubLSymbol DO_FORT_PARAPHRASE_CACHE_GENERATION_FOR_DIRECTORY = makeSymbol("DO-FORT-PARAPHRASE-CACHE-GENERATION-FOR-DIRECTORY");

    private static final SubLString $$$done = makeString("done");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLList $list85 = list(makeSymbol("NL-FORT-GENERATION-TASK-FAILED?"), list(makeSymbol("LIST"), makeSymbol("SUBDIRECTORY")));

    private static final SubLString $str86$prior_results_cfasl = makeString("prior-results.cfasl");

    private static final SubLString $str88$stats_log = makeString("stats.log");

    private static final SubLString $$$Generating_nl_for_forts_ = makeString("Generating nl for forts ");

    private static final SubLString $$$_through_ = makeString(" through ");

    private static final SubLString $str92$__PPH_phrase_count___ = makeString(" (PPH phrase count = ");

    private static final SubLString $str93$_____ = makeString(")....");

    private static final SubLString $str94$ = makeString("");

    private static final SubLList $list96 = list(makeUninternedSymbol("START"), makeUninternedSymbol("END"), makeUninternedSymbol("DELTA"));

    private static final SubLString $str97$Timed_out_on_first_try_after__A_g = makeString("Timed out on first try after ~A generating paraphrase of ~S.~% Trying again...");

    private static final SubLSymbol BREAK = makeSymbol("BREAK");

    private static final SubLString $str100$Timed_out_after__A_generating_par = makeString("Timed out after ~A generating paraphrase of ~S");

    private static final SubLString $str101$Failed_to_generate_a_string_for__ = makeString("Failed to generate a string for ~S");

    private static final SubLString $str102$Generated_empty_string_for__S = makeString("Generated empty string for ~S");

    private static final SubLString $str103$PPH_phrase_count_grew_from__D_to_ = makeString("PPH phrase count grew from ~D to ~D~% while paraphrasing ~S");

    private static final SubLInteger $int$500 = makeInteger(500);

    private static final SubLString $$$Verifying_ = makeString("Verifying ");

    private static final SubLString $str107$_constants___ = makeString(" constants...");

    private static final SubLString $str108$_S____Cached___S___Generated___S_ = makeString("~S:~% Cached: ~S~% Generated: ~S~%");

    private static final SubLString $str109$_NARTs___ = makeString(" NARTs...");

    private static final SubLString $str110$_D_of__D_constants_verified___F__ = makeString("~D of ~D constants verified (~F%)~%");

    private static final SubLString $str111$_D_of__D_narts_verified___F____ = makeString("~D of ~D narts verified (~F%)~%");

    private static final SubLString $str112$__First_non_finished__missing__di = makeString("~&First non-finished (missing) directory: ~S");

    private static final SubLString $str113$__First_non_finished__failed__dir = makeString("~&First non-finished (failed) directory: ~S");

    private static final SubLInteger $int$128 = makeInteger(128);

    private static final SubLString $str115$Clearing_PPH_memoization_for__S = makeString("Clearing PPH memoization for ~S");

    private static final SubLString $str116$__Paraphrased_batch___D_of__S_FOR = makeString("~&Paraphrased batch #~D of ~S FORTs in ~A~%");

    private static final SubLSymbol $sym117$_ = makeSymbol("+");

    private static final SubLString $str118$__Total_paraphrase_time___S__ = makeString("~&Total paraphrase time: ~S~%");

    private static final SubLString $str119$__Median_paraphrase_time___S__ = makeString("~&Median paraphrase time: ~S~%");

    private static final SubLString $str120$___Sth_percentile_paraphrase_time = makeString("~&~Sth percentile paraphrase time: ~S~%");

    private static final SubLString $str121$____SWAP_time___A___ = makeString("~& (SWAP time: ~A)~%");

    private static final SubLList $list122 = list(makeString("Total FORT Paraphrase Time in ~D-FORT Batches"), makeString("Median FORT Paraphrase Time in ~D-FORT Batches"), makeString("Total CPU Time per ~D-FORT Batch"), makeString("Total GC Time per ~D-FORT Batch"), makeString("Total Swap Time per ~D-FORT Batch"), makeString("Failed FORT count per ~D-FORT Batch"));

    private static final SubLList $list123 = list(makeString("total"), makeString("median"), makeString("cpu"), makeString("gc"), makeString("swap"), makeString("failed-fort-count"));

    private static final SubLList $list124 = list(makeString("Seconds"), makeString("Seconds"), makeString("Seconds"), makeString("Seconds"), makeString("Seconds"), makeString("FORTs"));

    private static final SubLString $str126$Batch__ = makeString("Batch #");

    private static final SubLString $str130$_cfasl = makeString(".cfasl");

    private static final SubLList $list131 = list(makeString("Total FORT Paraphrase Time per Batch"), makeString("Median FORT Paraphrase Time by Batch"), makeString("Total CPU Time per Batch"), makeString("Total GC Time per Batch"), makeString("Total Swap Time per Batch"), makeString("Failed FORT Count per Batch"));

    private static final SubLSymbol $sym132$_ = makeSymbol("<");

    private static final SubLInteger $int$1000000000 = makeInteger(1000000000);

    private static final SubLList $list136 = list(makeSymbol("NL-GENERATION-CACHE-METHOD"));



    private static final SubLString $str139$Error_in_paraphrase_fort_for_cach = makeString("Error in paraphrase-fort-for-cache for ~S:~% ~S");

    private static final SubLString $str140$Cached_paraphrase_for__S___is__S_ = makeString("Cached paraphrase for ~S~% is ~S.~% Should be ~S.");

    private static final SubLFloat $float$0_001 = makeDouble(0.001);

    private static final SubLString $str142$__Checking_NL_Generation_cache_ba = makeString("~%Checking NL Generation cache based on~% ~S~% with ~S local cache entries~% against KB ~A started from KB ~S~%");

    private static final SubLString $str143$__Done__D__Current_estimate____3F = makeString("~&Done ~D. Current estimate: ~,3F%~%");

    private static final SubLString $str144$Done__S__but_variance_of_approxim = makeString("Done ~S, but variance of approximately ~S exceeds ~S. Doing at least ~S more.");

    private static final SubLString $str145$__The_estimated_staleness_percent = makeString("~&The estimated staleness percentage of the NL generation FORT cache~% (based on ~D FORTs) is between ~,");

    private static final SubLString $str146$F__and___ = makeString("F% and ~,");

    private static final SubLString $str147$F____ = makeString("F%.~%");

    private static final SubLSymbol FILE_BACKED_CACHE_P = makeSymbol("FILE-BACKED-CACHE-P");

    private static final SubLString $str149$Looking_up_nl_generation_for_all_ = makeString("Looking up nl generation for all forts ....");



    private static final SubLString $str152$Timed_out_after__S_seconds_genera = makeString("Timed out after ~S seconds generating paraphrase of ~S");





    private static final SubLSymbol CYCL_STRING_P = makeSymbol("CYCL-STRING-P");

    private static final SubLSymbol $nl_generation_cache_exceptions$ = makeSymbol("*NL-GENERATION-CACHE-EXCEPTIONS*");



    private static final SubLString $str166$Finding_collections_that_don_t_us = makeString("Finding collections that don't use cache when doing nl generation of instances...");

    private static final SubLInteger $int$50 = makeInteger(50);

    private static final SubLString $str169$Testing___A__generate_cache_ratio = makeString("Testing: ~A, generate cache ratio: ~5F.~%");

    private static final SubLFloat $float$1_2 = makeDouble(1.2);

    private static final SubLString $str171$__Extra_cache_hits_for__S___S_per = makeString("~&Extra cache hits for ~S: ~S per result.~%");

    private static final SubLFloat $float$0_8 = makeDouble(0.8);

    private static final SubLString $str173$__Insufficient_cache_hits_for__S_ = makeString("~&Insufficient cache hits for ~S: ~S per result.~%");

    /**
     * Temporarily use FILENAME for the NL generation FORT cache.
     *
     * @unknown -- since the cache is global for the image, any other processes running at the same time will be affected as well.
     */
    @LispMethod(comment = "Temporarily use FILENAME for the NL generation FORT cache.\r\n\r\n@unknown -- since the cache is global for the image, any other processes running at the same time will be affected as well.")
    public static final SubLObject with_default_nl_generation_cache_file_path_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt6);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject filename = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt6);
                    filename = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject v_cache = $sym7$CACHE;
                            SubLObject base_file_name = $sym8$BASE_FILE_NAME;
                            return list(CLET, list(list($english_generation_fht_name$, filename), bq_cons(v_cache, $list_alt11), bq_cons(base_file_name, $list_alt12)), list(CUNWIND_PROTECT, listS(PROGN, list(SET_TEMPORARY_ENGLISH_GENERATION_FORT_CACHE, filename), append(body, NIL)), list(RESTORE_ENGLISH_GENERATION_FORT_CACHE, v_cache, base_file_name)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt6);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Temporarily use FILENAME for the NL generation FORT cache.
     *
     * @unknown -- since the cache is global for the image, any other processes running at the same time will be affected as well.
     */
    @LispMethod(comment = "Temporarily use FILENAME for the NL generation FORT cache.\r\n\r\n@unknown -- since the cache is global for the image, any other processes running at the same time will be affected as well.")
    public static SubLObject with_default_nl_generation_cache_file_path(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, nl_generation_fort_cache.$list6);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject filename = NIL;
        destructuring_bind_must_consp(current, datum, nl_generation_fort_cache.$list6);
        filename = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject v_cache = nl_generation_fort_cache.$sym7$CACHE;
            final SubLObject base_file_name = nl_generation_fort_cache.$sym8$BASE_FILE_NAME;
            return list(CLET, list(list(nl_generation_fort_cache.$english_generation_fht_name$, filename), bq_cons(v_cache, nl_generation_fort_cache.$list11), bq_cons(base_file_name, nl_generation_fort_cache.$list12)), list(CUNWIND_PROTECT, listS(PROGN, list(nl_generation_fort_cache.SET_TEMPORARY_ENGLISH_GENERATION_FORT_CACHE, filename), append(body, NIL)), list(nl_generation_fort_cache.RESTORE_ENGLISH_GENERATION_FORT_CACHE, v_cache, base_file_name)));
        }
        cdestructuring_bind_error(datum, nl_generation_fort_cache.$list6);
        return NIL;
    }

    public static final SubLObject get_english_generation_fort_cache_alt() {
        return $english_generation_fort_cache$.getGlobalValue();
    }

    public static SubLObject get_english_generation_fort_cache() {
        return nl_generation_fort_cache.$english_generation_fort_cache$.getGlobalValue();
    }

    public static final SubLObject set_temporary_english_generation_fort_cache_alt(SubLObject filename) {
        $english_generation_fort_cache$.setGlobalValue(NIL);
        $english_generation_base_file_name$.setGlobalValue(nth_value_step_2(nth_value_step_1(ONE_INTEGER), file_utilities.deconstruct_path(filename)));
        com.cyc.cycjava.cycl.nl_generation_fort_cache.ensure_nl_generation_fort_cache_is_best_available();
        return $english_generation_fort_cache$.getGlobalValue();
    }

    public static SubLObject set_temporary_english_generation_fort_cache(final SubLObject filename) {
        nl_generation_fort_cache.$english_generation_fort_cache$.setGlobalValue(NIL);
        nl_generation_fort_cache.$english_generation_base_file_name$.setGlobalValue(nth_value_step_2(nth_value_step_1(ONE_INTEGER), file_utilities.deconstruct_path(filename)));
        nl_generation_fort_cache.ensure_nl_generation_fort_cache_is_best_available();
        return nl_generation_fort_cache.$english_generation_fort_cache$.getGlobalValue();
    }

    public static final SubLObject restore_english_generation_fort_cache_alt(SubLObject backup, SubLObject base_file_name) {
        $english_generation_fort_cache$.setGlobalValue(backup);
        $english_generation_base_file_name$.setGlobalValue(base_file_name);
        return $english_generation_fort_cache$.getGlobalValue();
    }

    public static SubLObject restore_english_generation_fort_cache(final SubLObject backup, final SubLObject base_file_name) {
        nl_generation_fort_cache.$english_generation_fort_cache$.setGlobalValue(backup);
        nl_generation_fort_cache.$english_generation_base_file_name$.setGlobalValue(base_file_name);
        return nl_generation_fort_cache.$english_generation_fort_cache$.getGlobalValue();
    }

    /**
     * Returns the default file path name for the file hash table for this cache.
     */
    @LispMethod(comment = "Returns the default file path name for the file hash table for this cache.")
    public static final SubLObject get_default_nl_generation_cache_file_path_alt(SubLObject kb) {
        if (kb == UNPROVIDED) {
            kb = kb_loaded();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != subl_promotions.positive_integer_p(kb)) {
                if (!($english_generation_fht_name$.getDynamicValue(thread).isString() && (NIL != Filesys.probe_file($english_generation_fht_name$.getDynamicValue(thread))))) {
                    $english_generation_fht_name$.setDynamicValue(com.cyc.cycjava.cycl.nl_generation_fort_cache.get_nl_generation_cache_file_path_internal(kb), thread);
                }
            }
            return $english_generation_fht_name$.getDynamicValue(thread);
        }
    }

    /**
     * Returns the default file path name for the file hash table for this cache.
     */
    @LispMethod(comment = "Returns the default file path name for the file hash table for this cache.")
    public static SubLObject get_default_nl_generation_cache_file_path(SubLObject kb) {
        if (kb == UNPROVIDED) {
            kb = kb_loaded();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != subl_promotions.positive_integer_p(kb)) && ((!nl_generation_fort_cache.$english_generation_fht_name$.getDynamicValue(thread).isString()) || (NIL == Filesys.probe_file(nl_generation_fort_cache.$english_generation_fht_name$.getDynamicValue(thread))))) {
            nl_generation_fort_cache.$english_generation_fht_name$.setDynamicValue(nl_generation_fort_cache.get_nl_generation_cache_file_path_internal(kb), thread);
        }
        return nl_generation_fort_cache.$english_generation_fht_name$.getDynamicValue(thread);
    }

    /**
     * Returns the file path name for the latest NL generation file hash table.
     */
    @LispMethod(comment = "Returns the file path name for the latest NL generation file hash table.")
    public static final SubLObject get_latest_nl_generation_cache_file_path_alt() {
        {
            SubLObject kb = kb_loaded();
            SubLObject path = NIL;
            while ((NIL != subl_promotions.positive_integer_p(kb)) && (!(path.isString() && (NIL != Filesys.probe_file(path))))) {
                path = com.cyc.cycjava.cycl.nl_generation_fort_cache.get_nl_generation_cache_file_path_internal(kb);
                kb = subtract(kb, ONE_INTEGER);
            } 
            return path;
        }
    }

    /**
     * Returns the file path name for the latest NL generation file hash table.
     */
    @LispMethod(comment = "Returns the file path name for the latest NL generation file hash table.")
    public static SubLObject get_latest_nl_generation_cache_file_path() {
        SubLObject kb;
        SubLObject path;
        for (kb = kb_loaded(), path = NIL; ((NIL != subl_promotions.positive_integer_p(kb)) && subtract(kb_loaded(), kb).numLE(nl_generation_fort_cache.$max_kbs_backward_to_look_for_generation_cache$.getGlobalValue())) && ((!path.isString()) || (NIL == Filesys.probe_file(path))); path = nl_generation_fort_cache.get_nl_generation_cache_file_path_internal(kb) , kb = subtract(kb, ONE_INTEGER)) {
        }
        return path;
    }

    /**
     * Returns the file path name for the NL generation file hash table for KB.
     */
    @LispMethod(comment = "Returns the file path name for the NL generation file hash table for KB.")
    public static final SubLObject get_nl_generation_cache_file_path_internal_alt(SubLObject kb) {
        {
            SubLObject path = cconcatenate(file_backed_cache.$file_backed_cache_base_path$.getGlobalValue(), new SubLObject[]{ format(NIL, $str_alt19$_4__0d, kb), $str_alt20$_, $english_generation_base_file_name$.getGlobalValue() });
            return path;
        }
    }

    /**
     * Returns the file path name for the NL generation file hash table for KB.
     */
    @LispMethod(comment = "Returns the file path name for the NL generation file hash table for KB.")
    public static SubLObject get_nl_generation_cache_file_path_internal(final SubLObject kb) {
        final SubLObject path = cconcatenate(file_backed_cache.$file_backed_cache_base_path$.getGlobalValue(), new SubLObject[]{ operation_communication.kb_number_string(kb), nl_generation_fort_cache.$str19$_, nl_generation_fort_cache.$english_generation_base_file_name$.getGlobalValue() });
        return path;
    }

    public static SubLObject enable_nl_generation_cache_memory_mapping() {
        file_backed_cache.file_backed_cache_enable_memory_mapping(nl_generation_fort_cache.$english_generation_fort_cache$.getGlobalValue());
        return NIL;
    }

    public static SubLObject disable_nl_generation_cache_memory_mapping() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        nl_generation_fort_cache.$english_generation_fort_cache$.setGlobalValue(file_backed_cache.file_backed_cache_change_stream_buffer_size(nl_generation_fort_cache.$english_generation_fort_cache$.getGlobalValue(), StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread)));
        return NIL;
    }

    public static SubLObject nl_generation_cache_memory_mappedP() {
        return makeBoolean((NIL != nl_generation_fort_cache.$english_generation_fort_cache$.getGlobalValue()) && (NIL != file_backed_cache.file_backed_cache_memory_mappedP(nl_generation_fort_cache.$english_generation_fort_cache$.getGlobalValue())));
    }

    /**
     * Initializes the file hashtables and internal caches used to cache nl generations of FORTs.
     * In a C image prefetches all the items in file the hashtable caches.
     */
    @LispMethod(comment = "Initializes the file hashtables and internal caches used to cache nl generations of FORTs.\r\nIn a C image prefetches all the items in file the hashtable caches.\nInitializes the file hashtables and internal caches used to cache nl generations of FORTs.\nIn a C image prefetches all the items in file the hashtable caches.")
    public static final SubLObject initialize_nl_generation_caches_alt() {
        if (NIL == kb_loaded()) {
            com.cyc.cycjava.cycl.nl_generation_fort_cache.reconnect_english_generation_fort_cache();
        } else {
            if ((NIL != file_backed_cache.file_backed_cache_p($english_generation_fort_cache$.getGlobalValue())) && kb_op_number().isPositive()) {
                com.cyc.cycjava.cycl.nl_generation_fort_cache.reconnect_english_generation_fort_cache();
            } else {
                com.cyc.cycjava.cycl.nl_generation_fort_cache.ensure_nl_generation_fort_cache_is_best_available();
            }
        }
        return NIL;
    }

    /**
     * Initializes the file hashtables and internal caches used to cache nl generations of FORTs.
     * In a C image prefetches all the items in file the hashtable caches.
     */
    @LispMethod(comment = "Initializes the file hashtables and internal caches used to cache nl generations of FORTs.\r\nIn a C image prefetches all the items in file the hashtable caches.\nInitializes the file hashtables and internal caches used to cache nl generations of FORTs.\nIn a C image prefetches all the items in file the hashtable caches.")
    public static SubLObject initialize_nl_generation_caches() {
        if (NIL == kb_loaded()) {
            nl_generation_fort_cache.reconnect_english_generation_fort_cache();
        } else
            if ((NIL != file_backed_cache.file_backed_cache_p(nl_generation_fort_cache.$english_generation_fort_cache$.getGlobalValue())) && operation_communication.kb_op_number().isPositive()) {
                nl_generation_fort_cache.reconnect_english_generation_fort_cache();
            } else {
                nl_generation_fort_cache.ensure_nl_generation_fort_cache_is_best_available();
            }

        return NIL;
    }

    public static final SubLObject ensure_nl_generation_fort_cache_is_best_available_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (((NIL != file_backed_cache.file_backed_cache_p($english_generation_fort_cache$.getGlobalValue())) && (NIL != Filesys.probe_file(file_backed_cache.file_backed_cache_file_hash_table_path($english_generation_fort_cache$.getGlobalValue())))) && (NIL != com.cyc.cycjava.cycl.nl_generation_fort_cache.english_generation_fort_cache_for_current_kbP())) {
                com.cyc.cycjava.cycl.nl_generation_fort_cache.reconnect_english_generation_fort_cache();
            } else {
                if (((NIL != file_backed_cache.file_backed_cache_p($english_generation_fort_cache$.getGlobalValue())) && (NIL != Filesys.probe_file(file_backed_cache.file_backed_cache_file_hash_table_path($english_generation_fort_cache$.getGlobalValue())))) && (NIL != com.cyc.cycjava.cycl.nl_generation_fort_cache.english_generation_fort_cache_most_recent_availableP())) {
                    com.cyc.cycjava.cycl.nl_generation_fort_cache.reconnect_english_generation_fort_cache();
                } else {
                    {
                        SubLObject old = $english_generation_fort_cache$.getGlobalValue();
                        SubLObject lock = $nl_generation_fht_lock$.getGlobalValue();
                        SubLObject release = NIL;
                        try {
                            release = seize_lock(lock);
                            if ($english_generation_fort_cache$.getGlobalValue() == old) {
                                {
                                    SubLObject _prev_bind_0 = file_hash_table.$fht_cache_percentage$.currentBinding(thread);
                                    try {
                                        file_hash_table.$fht_cache_percentage$.bind($int$100, thread);
                                        $english_generation_fort_cache$.setGlobalValue(file_backed_cache.file_backed_cache_create(com.cyc.cycjava.cycl.nl_generation_fort_cache.get_latest_nl_generation_cache_file_path(), $preload_nl_generation_cachesP$.getGlobalValue(), T, file_hash_table.$fht_cache_percentage$.getDynamicValue(thread), symbol_function(EQUAL), $HL_EXTERNALIZED_KEYS));
                                    } finally {
                                        file_hash_table.$fht_cache_percentage$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                if ((NIL != com.cyc.cycjava.cycl.nl_generation_fort_cache.english_generation_fort_cache_for_current_kbP()) && kb_op_number().isZero()) {
                                    com.cyc.cycjava.cycl.nl_generation_fort_cache.clear_nl_generation_cache_exceptions();
                                }
                            }
                        } finally {
                            if (NIL != release) {
                                release_lock(lock);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject ensure_nl_generation_fort_cache_is_best_available() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != file_backed_cache.file_backed_cache_p(nl_generation_fort_cache.$english_generation_fort_cache$.getGlobalValue())) && (NIL != Filesys.probe_file(file_backed_cache.file_backed_cache_file_hash_table_path(nl_generation_fort_cache.$english_generation_fort_cache$.getGlobalValue())))) && (NIL != nl_generation_fort_cache.english_generation_fort_cache_for_current_kbP())) {
            nl_generation_fort_cache.reconnect_english_generation_fort_cache();
        } else
            if (((NIL != file_backed_cache.file_backed_cache_p(nl_generation_fort_cache.$english_generation_fort_cache$.getGlobalValue())) && (NIL != Filesys.probe_file(file_backed_cache.file_backed_cache_file_hash_table_path(nl_generation_fort_cache.$english_generation_fort_cache$.getGlobalValue())))) && (NIL != nl_generation_fort_cache.english_generation_fort_cache_most_recent_availableP())) {
                nl_generation_fort_cache.reconnect_english_generation_fort_cache();
            } else {
                final SubLObject old = nl_generation_fort_cache.$english_generation_fort_cache$.getGlobalValue();
                SubLObject release = NIL;
                try {
                    release = seize_lock(nl_generation_fort_cache.$nl_generation_fht_lock$.getGlobalValue());
                    if (nl_generation_fort_cache.$english_generation_fort_cache$.getGlobalValue().eql(old)) {
                        final SubLObject _prev_bind_0 = file_hash_table.$fht_cache_percentage$.currentBinding(thread);
                        try {
                            file_hash_table.$fht_cache_percentage$.bind($int$100, thread);
                            final SubLObject path = nl_generation_fort_cache.get_latest_nl_generation_cache_file_path();
                            nl_generation_fort_cache.$english_generation_fort_cache$.setGlobalValue(NIL != Filesys.probe_file(path) ? file_backed_cache.file_backed_cache_create(path, nl_generation_fort_cache.$preload_nl_generation_cachesP$.getGlobalValue(), T, file_hash_table.$fht_cache_percentage$.getDynamicValue(thread), symbol_function(EQUAL), nl_generation_fort_cache.$HL_EXTERNALIZED_KEYS) : NIL);
                        } finally {
                            file_hash_table.$fht_cache_percentage$.rebind(_prev_bind_0, thread);
                        }
                        if ((NIL != nl_generation_fort_cache.english_generation_fort_cache_for_current_kbP()) && operation_communication.kb_op_number().isZero()) {
                            nl_generation_fort_cache.clear_nl_generation_cache_exceptions();
                        }
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(nl_generation_fort_cache.$nl_generation_fht_lock$.getGlobalValue());
                    }
                }
            }

        return NIL;
    }

    public static final SubLObject reconnect_english_generation_fort_cache_alt() {
        {
            SubLObject fbc_fht_path = file_backed_cache.file_backed_cache_file_hash_table_path($english_generation_fort_cache$.getGlobalValue());
            SubLObject path = (NIL != Filesys.probe_file(fbc_fht_path)) ? ((SubLObject) (fbc_fht_path)) : com.cyc.cycjava.cycl.nl_generation_fort_cache.get_default_nl_generation_cache_file_path(UNPROVIDED);
            file_backed_cache.file_backed_cache_reconnect($english_generation_fort_cache$.getGlobalValue(), path);
            return $english_generation_fort_cache$.getGlobalValue();
        }
    }

    public static SubLObject reconnect_english_generation_fort_cache() {
        if (NIL != nl_generation_fort_cache.$english_generation_fort_cache$.getGlobalValue()) {
            final SubLObject fbc_fht_path = file_backed_cache.file_backed_cache_file_hash_table_path(nl_generation_fort_cache.$english_generation_fort_cache$.getGlobalValue());
            final SubLObject path = (NIL != Filesys.probe_file(fbc_fht_path)) ? fbc_fht_path : nl_generation_fort_cache.get_default_nl_generation_cache_file_path(UNPROVIDED);
            file_backed_cache.file_backed_cache_reconnect(nl_generation_fort_cache.$english_generation_fort_cache$.getGlobalValue(), path);
        }
        return nl_generation_fort_cache.$english_generation_fort_cache$.getGlobalValue();
    }

    public static final SubLObject english_generation_fort_cache_for_current_kbP_alt() {
        return equal(last(file_utilities.deconstruct_path(file_backed_cache.file_backed_cache_file_hash_table_path($english_generation_fort_cache$.getGlobalValue())), UNPROVIDED), last(file_utilities.deconstruct_path(com.cyc.cycjava.cycl.nl_generation_fort_cache.get_default_nl_generation_cache_file_path(kb_loaded())), UNPROVIDED));
    }

    public static SubLObject english_generation_fort_cache_for_current_kbP() {
        return makeBoolean((NIL != nl_generation_fort_cache.$english_generation_fort_cache$.getGlobalValue()) && last(file_utilities.deconstruct_path(file_backed_cache.file_backed_cache_file_hash_table_path(nl_generation_fort_cache.$english_generation_fort_cache$.getGlobalValue())), UNPROVIDED).equal(last(file_utilities.deconstruct_path(nl_generation_fort_cache.get_default_nl_generation_cache_file_path(kb_loaded())), UNPROVIDED)));
    }

    public static final SubLObject english_generation_fort_cache_most_recent_availableP_alt() {
        return equal(last(file_utilities.deconstruct_path(file_backed_cache.file_backed_cache_file_hash_table_path($english_generation_fort_cache$.getGlobalValue())), UNPROVIDED), last(file_utilities.deconstruct_path(com.cyc.cycjava.cycl.nl_generation_fort_cache.get_latest_nl_generation_cache_file_path()), UNPROVIDED));
    }

    public static SubLObject english_generation_fort_cache_most_recent_availableP() {
        return makeBoolean((NIL != nl_generation_fort_cache.$english_generation_fort_cache$.getGlobalValue()) && last(file_utilities.deconstruct_path(file_backed_cache.file_backed_cache_file_hash_table_path(nl_generation_fort_cache.$english_generation_fort_cache$.getGlobalValue())), UNPROVIDED).equal(last(file_utilities.deconstruct_path(nl_generation_fort_cache.get_latest_nl_generation_cache_file_path()), UNPROVIDED)));
    }

    /**
     * Closes all filehashtables and reinitializes the nl generation caches.
     * Any dynamic updating of the live cache is lost.
     */
    @LispMethod(comment = "Closes all filehashtables and reinitializes the nl generation caches.\r\nAny dynamic updating of the live cache is lost.\nCloses all filehashtables and reinitializes the nl generation caches.\nAny dynamic updating of the live cache is lost.")
    public static final SubLObject reset_nl_generation_caches_alt() {
        {
            SubLObject lock = $nl_generation_fht_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                if (NIL != $english_generation_fort_cache$.getGlobalValue()) {
                    $english_generation_fht_name$.setDynamicValue(NIL);
                    file_backed_cache.file_backed_cache_reset($english_generation_fort_cache$.getGlobalValue(), UNPROVIDED);
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return NIL;
    }

    /**
     * Closes all filehashtables and reinitializes the nl generation caches.
     * Any dynamic updating of the live cache is lost.
     */
    @LispMethod(comment = "Closes all filehashtables and reinitializes the nl generation caches.\r\nAny dynamic updating of the live cache is lost.\nCloses all filehashtables and reinitializes the nl generation caches.\nAny dynamic updating of the live cache is lost.")
    public static SubLObject reset_nl_generation_caches() {
        SubLObject release = NIL;
        try {
            release = seize_lock(nl_generation_fort_cache.$nl_generation_fht_lock$.getGlobalValue());
            if (NIL != nl_generation_fort_cache.$english_generation_fort_cache$.getGlobalValue()) {
                nl_generation_fort_cache.$english_generation_fht_name$.setDynamicValue(NIL);
                file_backed_cache.file_backed_cache_reset(nl_generation_fort_cache.$english_generation_fort_cache$.getGlobalValue(), UNPROVIDED);
            }
        } finally {
            if (NIL != release) {
                release_lock(nl_generation_fort_cache.$nl_generation_fht_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return VALID-EXTERNAL-PPH-NL-PREDS? used to initialize CACHE.
     */
    @LispMethod(comment = "@return VALID-EXTERNAL-PPH-NL-PREDS? used to initialize CACHE.")
    public static final SubLObject nl_generation_fort_cache_nl_preds_alt(SubLObject v_cache) {
        if (v_cache == UNPROVIDED) {
            v_cache = $english_generation_fort_cache$.getGlobalValue();
        }
        {
            SubLObject stored = (NIL != file_backed_cache.file_backed_cache_p(v_cache)) ? ((SubLObject) (file_backed_cache.file_backed_cache_lookup($NL_PREDS, v_cache, NIL, UNPROVIDED))) : NIL;
            return NIL != stored ? ((SubLObject) (stored)) : $list_alt25;
        }
    }

    /**
     *
     *
     * @return VALID-EXTERNAL-PPH-NL-PREDS? used to initialize CACHE.
     */
    @LispMethod(comment = "@return VALID-EXTERNAL-PPH-NL-PREDS? used to initialize CACHE.")
    public static SubLObject nl_generation_fort_cache_nl_preds(SubLObject v_cache) {
        if (v_cache == UNPROVIDED) {
            v_cache = nl_generation_fort_cache.$english_generation_fort_cache$.getGlobalValue();
        }
        final SubLObject stored = (NIL != file_backed_cache.file_backed_cache_p(v_cache)) ? file_backed_cache.file_backed_cache_lookup($NL_PREDS, v_cache, NIL, UNPROVIDED) : NIL;
        return NIL != stored ? stored : nl_generation_fort_cache.$list24;
    }

    /**
     *
     *
     * @return HLMT-P used as language mt to initialize CACHE.
     */
    @LispMethod(comment = "@return HLMT-P used as language mt to initialize CACHE.")
    public static final SubLObject nl_generation_fort_cache_paraphrase_mt_alt(SubLObject v_cache) {
        if (v_cache == UNPROVIDED) {
            v_cache = $english_generation_fort_cache$.getGlobalValue();
        }
        {
            SubLObject stored = (NIL != file_backed_cache.file_backed_cache_p(v_cache)) ? ((SubLObject) (file_backed_cache.file_backed_cache_lookup($LANGUAGE_MT, v_cache, NIL, UNPROVIDED))) : NIL;
            return NIL != stored ? ((SubLObject) (stored)) : com.cyc.cycjava.cycl.nl_generation_fort_cache.default_nl_generation_fort_cache_paraphrase_mt();
        }
    }

    /**
     *
     *
     * @return HLMT-P used as language mt to initialize CACHE.
     */
    @LispMethod(comment = "@return HLMT-P used as language mt to initialize CACHE.")
    public static SubLObject nl_generation_fort_cache_paraphrase_mt(SubLObject v_cache) {
        if (v_cache == UNPROVIDED) {
            v_cache = nl_generation_fort_cache.$english_generation_fort_cache$.getGlobalValue();
        }
        final SubLObject stored = (NIL != file_backed_cache.file_backed_cache_p(v_cache)) ? file_backed_cache.file_backed_cache_lookup($LANGUAGE_MT, v_cache, NIL, UNPROVIDED) : NIL;
        return NIL != stored ? stored : nl_generation_fort_cache.default_nl_generation_fort_cache_paraphrase_mt();
    }

    public static final SubLObject default_nl_generation_fort_cache_paraphrase_mt_alt() {
        return pph_vars.default_pph_language_mt(UNPROVIDED);
    }

    public static SubLObject default_nl_generation_fort_cache_paraphrase_mt() {
        return pph_vars.default_pph_language_mt(UNPROVIDED);
    }

    public static final SubLObject nl_fort_generation_task_success_code_alt() {
        return ONE_INTEGER;
    }

    public static SubLObject nl_fort_generation_task_success_code() {
        return ONE_INTEGER;
    }

    public static final SubLObject nl_fort_generation_task_failure_code_alt() {
        return $int$255;
    }

    public static SubLObject nl_fort_generation_task_failure_code() {
        return $int$255;
    }

    /**
     * Creates a cache of all the forts in the current KB where the key is the fort being
     * generated and the value is a cons with the first element being the nl generation and
     * the second element being the nl-pred for that generation.
     *
     * @param FILENAME
     * 		the file name of the file hashtable
     * 		Defaults to: *english-generation-fht-name*
     * @param PARAPHRASE-MT
     * 		the MT to do the generation in.
     * @param NL-PREDS
     * 		the nl predicates to use for generation.
     * 		Defaults to: '(#$nonPlural-Generic)
     */
    @LispMethod(comment = "Creates a cache of all the forts in the current KB where the key is the fort being\r\ngenerated and the value is a cons with the first element being the nl generation and\r\nthe second element being the nl-pred for that generation.\r\n\r\n@param FILENAME\r\n\t\tthe file name of the file hashtable\r\n\t\tDefaults to: *english-generation-fht-name*\r\n@param PARAPHRASE-MT\r\n\t\tthe MT to do the generation in.\r\n@param NL-PREDS\r\n\t\tthe nl predicates to use for generation.\r\n\t\tDefaults to: \'(#$nonPlural-Generic)\nCreates a cache of all the forts in the current KB where the key is the fort being\ngenerated and the value is a cons with the first element being the nl generation and\nthe second element being the nl-pred for that generation.")
    public static final SubLObject create_cached_nl_generation_for_all_forts_alt(SubLObject filename, SubLObject tmp_dir, SubLObject paraphrase_mt, SubLObject nl_preds) {
        if (filename == UNPROVIDED) {
            filename = com.cyc.cycjava.cycl.nl_generation_fort_cache.get_default_nl_generation_cache_file_path(UNPROVIDED);
        }
        if (tmp_dir == UNPROVIDED) {
            tmp_dir = $str_alt32$tmp_;
        }
        if (paraphrase_mt == UNPROVIDED) {
            paraphrase_mt = com.cyc.cycjava.cycl.nl_generation_fort_cache.default_nl_generation_fort_cache_paraphrase_mt();
        }
        if (nl_preds == UNPROVIDED) {
            nl_preds = $nl_generation_fort_cache_nl_preds$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL != pph_staleness_test.gen_template_store_staleness_acceptableP()) || (NIL == pph_staleness_test.gen_template_store_staleP()))) {
                    Errors.error($str_alt33$Gen_template_store_is_stale_);
                }
            }
            format(T, $str_alt34$Generating_nl_cache_to_file___A, filename);
            SubLTrampolineFile.checkType(paraphrase_mt, HLMT_P);
            {
                SubLObject _prev_bind_0 = $nl_generation_fort_cache_paraphrase_mt$.currentBinding(thread);
                SubLObject _prev_bind_1 = $nl_generation_fort_cache_nl_preds$.currentBinding(thread);
                SubLObject _prev_bind_2 = $nl_generation_fort_cache_working_directory$.currentBinding(thread);
                try {
                    $nl_generation_fort_cache_paraphrase_mt$.bind(paraphrase_mt, thread);
                    $nl_generation_fort_cache_nl_preds$.bind(nl_preds, thread);
                    $nl_generation_fort_cache_working_directory$.bind(com.cyc.cycjava.cycl.nl_generation_fort_cache.find_or_create_nl_generation_fort_cache_working_directory(tmp_dir), thread);
                    kb_cleanup.kill_duplicate_narts();
                    {
                        SubLObject fort_count = cfasl_utilities.cfasl_load(cconcatenate($nl_generation_fort_cache_working_directory$.getDynamicValue(thread), $str_alt36$fort_count_cfasl));
                        SubLObject progress_message = cconcatenate($str_alt37$Generating_FORT_paraphrases__, new SubLObject[]{ format_nil.format_nil_a_no_copy($nl_generation_fort_cache_generator_timestamp$.getGlobalValue()), $str_alt38$____ });
                        {
                            SubLObject _prev_bind_0_1 = $last_percent_progress_index$.currentBinding(thread);
                            SubLObject _prev_bind_1_2 = $last_percent_progress_prediction$.currentBinding(thread);
                            SubLObject _prev_bind_2_3 = $within_noting_percent_progress$.currentBinding(thread);
                            SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                            try {
                                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                $last_percent_progress_prediction$.bind(NIL, thread);
                                $within_noting_percent_progress$.bind(T, thread);
                                $percent_progress_start_time$.bind(get_universal_time(), thread);
                                noting_percent_progress_preamble(progress_message);
                                while (NIL == com.cyc.cycjava.cycl.nl_generation_fort_cache.nl_generation_fort_cache_data_generatedP()) {
                                    {
                                        SubLObject done_count = com.cyc.cycjava.cycl.nl_generation_fort_cache.assign_next_fort_paraphrase_cache_generation_task_and_wait_for_result();
                                        if (NIL != $nl_generation_fort_cache_generate_plotsP$.getDynamicValue(thread)) {
                                            com.cyc.cycjava.cycl.nl_generation_fort_cache.stitch_together_nl_generation_cache_time_plots();
                                        }
                                        if (done_count.isInteger()) {
                                            note_percent_progress(done_count, fort_count);
                                        }
                                    }
                                } 
                                noting_percent_progress_postamble();
                            } finally {
                                $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                $within_noting_percent_progress$.rebind(_prev_bind_2_3, thread);
                                $last_percent_progress_prediction$.rebind(_prev_bind_1_2, thread);
                                $last_percent_progress_index$.rebind(_prev_bind_0_1, thread);
                            }
                        }
                    }
                    if (NIL != Filesys.probe_file(filename)) {
                        Errors.warn($str_alt39$_S_already_exists_, filename);
                    } else {
                        com.cyc.cycjava.cycl.nl_generation_fort_cache.create_nl_generation_fht_from_data(filename, nl_preds, tmp_dir, $nl_generation_fort_cache_working_directory$.getDynamicValue(thread));
                    }
                } finally {
                    $nl_generation_fort_cache_working_directory$.rebind(_prev_bind_2, thread);
                    $nl_generation_fort_cache_nl_preds$.rebind(_prev_bind_1, thread);
                    $nl_generation_fort_cache_paraphrase_mt$.rebind(_prev_bind_0, thread);
                }
            }
            return filename;
        }
    }

    /**
     * Creates a cache of all the forts in the current KB where the key is the fort being
     * generated and the value is a cons with the first element being the nl generation and
     * the second element being the nl-pred for that generation.
     *
     * @param FILENAME
     * 		the file name of the file hashtable
     * 		Defaults to: *english-generation-fht-name*
     * @param PARAPHRASE-MT
     * 		the MT to do the generation in.
     * @param NL-PREDS
     * 		the nl predicates to use for generation.
     * 		Defaults to: '(#$nonPlural-Generic)
     */
    @LispMethod(comment = "Creates a cache of all the forts in the current KB where the key is the fort being\r\ngenerated and the value is a cons with the first element being the nl generation and\r\nthe second element being the nl-pred for that generation.\r\n\r\n@param FILENAME\r\n\t\tthe file name of the file hashtable\r\n\t\tDefaults to: *english-generation-fht-name*\r\n@param PARAPHRASE-MT\r\n\t\tthe MT to do the generation in.\r\n@param NL-PREDS\r\n\t\tthe nl predicates to use for generation.\r\n\t\tDefaults to: \'(#$nonPlural-Generic)\nCreates a cache of all the forts in the current KB where the key is the fort being\ngenerated and the value is a cons with the first element being the nl generation and\nthe second element being the nl-pred for that generation.")
    public static SubLObject create_cached_nl_generation_for_all_forts(SubLObject filename, SubLObject tmp_dir, SubLObject paraphrase_mt, SubLObject nl_preds) {
        if (filename == UNPROVIDED) {
            filename = nl_generation_fort_cache.get_default_nl_generation_cache_file_path(UNPROVIDED);
        }
        if (tmp_dir == UNPROVIDED) {
            tmp_dir = nl_generation_fort_cache.$str31$tmp_;
        }
        if (paraphrase_mt == UNPROVIDED) {
            paraphrase_mt = nl_generation_fort_cache.default_nl_generation_fort_cache_paraphrase_mt();
        }
        if (nl_preds == UNPROVIDED) {
            nl_preds = nl_generation_fort_cache.$nl_generation_fort_cache_nl_preds$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == pph_staleness_test.gen_template_store_staleness_acceptableP())) && (NIL != pph_staleness_test.gen_template_store_staleP())) {
            Errors.error(nl_generation_fort_cache.$str32$Gen_template_store_is_stale_);
        }
        format(T, nl_generation_fort_cache.$str33$Generating_nl_cache_to_file___A, filename);
        assert NIL != hlmt.hlmt_p(paraphrase_mt) : "! hlmt.hlmt_p(paraphrase_mt) " + ("hlmt.hlmt_p(paraphrase_mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(paraphrase_mt) ") + paraphrase_mt;
        final SubLObject _prev_bind_0 = nl_generation_fort_cache.$nl_generation_fort_cache_paraphrase_mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = nl_generation_fort_cache.$nl_generation_fort_cache_nl_preds$.currentBinding(thread);
        final SubLObject _prev_bind_3 = nl_generation_fort_cache.$nl_generation_fort_cache_working_directory$.currentBinding(thread);
        try {
            nl_generation_fort_cache.$nl_generation_fort_cache_paraphrase_mt$.bind(paraphrase_mt, thread);
            nl_generation_fort_cache.$nl_generation_fort_cache_nl_preds$.bind(nl_preds, thread);
            nl_generation_fort_cache.$nl_generation_fort_cache_working_directory$.bind(nl_generation_fort_cache.find_or_create_nl_generation_fort_cache_working_directory(tmp_dir), thread);
            kb_cleanup.kill_duplicate_narts();
            final SubLObject fort_count = cfasl_utilities.cfasl_load(cconcatenate(nl_generation_fort_cache.$nl_generation_fort_cache_working_directory$.getDynamicValue(thread), nl_generation_fort_cache.$str35$fort_count_cfasl));
            final SubLObject progress_message = cconcatenate(nl_generation_fort_cache.$str36$Generating_FORT_paraphrases__, new SubLObject[]{ format_nil.format_nil_a_no_copy(nl_generation_fort_cache.$nl_generation_fort_cache_generator_timestamp$.getGlobalValue()), nl_generation_fort_cache.$str37$____ });
            final SubLObject _prev_bind_0_$1 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_1_$2 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_2_$3 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(progress_message);
                    while (NIL == nl_generation_fort_cache.nl_generation_fort_cache_data_generatedP()) {
                        final SubLObject done_count = nl_generation_fort_cache.assign_next_fort_paraphrase_cache_generation_task_and_wait_for_result();
                        if (NIL != nl_generation_fort_cache.$nl_generation_fort_cache_generate_plotsP$.getDynamicValue(thread)) {
                            nl_generation_fort_cache.stitch_together_nl_generation_cache_time_plots();
                        }
                        if (done_count.isInteger()) {
                            note_percent_progress(done_count, fort_count);
                        }
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_2_$3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_1_$2, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0_$1, thread);
            }
            if (NIL != Filesys.probe_file(filename)) {
                Errors.warn(nl_generation_fort_cache.$str38$_S_already_exists_, filename);
            } else {
                nl_generation_fort_cache.create_nl_generation_fht_from_data(filename, nl_preds, tmp_dir, nl_generation_fort_cache.$nl_generation_fort_cache_working_directory$.getDynamicValue(thread));
            }
        } finally {
            nl_generation_fort_cache.$nl_generation_fort_cache_working_directory$.rebind(_prev_bind_3, thread);
            nl_generation_fort_cache.$nl_generation_fort_cache_nl_preds$.rebind(_prev_bind_2, thread);
            nl_generation_fort_cache.$nl_generation_fort_cache_paraphrase_mt$.rebind(_prev_bind_0, thread);
        }
        return filename;
    }

    public static final SubLObject create_nl_generation_fht_from_data_alt(SubLObject filename, SubLObject nl_preds, SubLObject tmp_dir, SubLObject working_directory) {
        if (filename == UNPROVIDED) {
            filename = com.cyc.cycjava.cycl.nl_generation_fort_cache.get_default_nl_generation_cache_file_path(UNPROVIDED);
        }
        if (nl_preds == UNPROVIDED) {
            nl_preds = $nl_generation_fort_cache_nl_preds$.getDynamicValue();
        }
        if (tmp_dir == UNPROVIDED) {
            tmp_dir = $str_alt32$tmp_;
        }
        if (working_directory == UNPROVIDED) {
            working_directory = com.cyc.cycjava.cycl.nl_generation_fort_cache.find_or_create_nl_generation_fort_cache_working_directory(tmp_dir);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject fht = file_hash_table.fast_create_file_hash_table(filename, tmp_dir, symbol_function(EQUAL), $HL_EXTERNALIZED_KEYS);
                SubLObject progress_message = $str_alt40$Compiling_file_hashtable_from_par;
                SubLTrampolineFile.checkType(working_directory, DIRECTORY_P);
                {
                    SubLObject directory_contents_var = Filesys.directory(working_directory, T);
                    SubLObject progress_message_var = progress_message;
                    {
                        SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
                        try {
                            $silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
                            {
                                SubLObject list_var = directory_contents_var;
                                $progress_note$.setDynamicValue(progress_message_var, thread);
                                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                $progress_total$.setDynamicValue(length(list_var), thread);
                                $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                {
                                    SubLObject _prev_bind_0_4 = $last_percent_progress_index$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                    try {
                                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                        $last_percent_progress_prediction$.bind(NIL, thread);
                                        $within_noting_percent_progress$.bind(T, thread);
                                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                        {
                                            SubLObject csome_list_var = list_var;
                                            SubLObject assignment_directory = NIL;
                                            for (assignment_directory = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , assignment_directory = csome_list_var.first()) {
                                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                if (NIL == Filesys.directory_p(assignment_directory)) {
                                                } else {
                                                    if (NIL == Filesys.probe_file(cconcatenate(assignment_directory, $str_alt42$_done))) {
                                                        Errors.warn($str_alt43$Skipping_assignment_directory_wit, assignment_directory);
                                                    } else {
                                                        {
                                                            SubLObject same_kbP = eql(build_kb_loaded(), cfasl_utilities.cfasl_load(cconcatenate(working_directory, $str_alt44$build_kb_loaded_cfasl)));
                                                            SubLObject slow_results_file = cconcatenate(assignment_directory, $str_alt45$_results_cfasl);
                                                            SubLObject fast_results_file = cconcatenate(assignment_directory, $str_alt46$_fast_results_cfasl);
                                                            SubLObject results_file = ((NIL != same_kbP) && (NIL != Filesys.probe_file(fast_results_file))) ? ((SubLObject) (fast_results_file)) : slow_results_file;
                                                            SubLObject fort = NIL;
                                                            SubLObject paraphrase_data = NIL;
                                                            SubLObject doneP = NIL;
                                                            Errors.warn($str_alt47$Using_results_file__S, results_file);
                                                            {
                                                                SubLObject stream = NIL;
                                                                try {
                                                                    {
                                                                        SubLObject _prev_bind_0_5 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                                                        try {
                                                                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                                                            stream = compatibility.open_binary(results_file, $INPUT, NIL);
                                                                        } finally {
                                                                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_5, thread);
                                                                        }
                                                                    }
                                                                    if (!stream.isStream()) {
                                                                        Errors.error($str_alt49$Unable_to_open__S, results_file);
                                                                    }
                                                                    {
                                                                        SubLObject stream_6 = stream;
                                                                        while (NIL == doneP) {
                                                                            fort = cfasl_input(stream_6, NIL, $EOF);
                                                                            paraphrase_data = cfasl_input(stream_6, NIL, UNPROVIDED);
                                                                            if ($EOF == fort) {
                                                                                doneP = T;
                                                                            } else {
                                                                                if (NIL == forts.fort_p(fort)) {
                                                                                    Errors.warn($str_alt51$Non_FORT__S_in_paraphrase_data___, fort, results_file);
                                                                                } else {
                                                                                    if (!(paraphrase_data.isList() && (NIL != list_utilities.lengthE(paraphrase_data, FOUR_INTEGER, UNPROVIDED)))) {
                                                                                        Errors.warn($str_alt52$Bad_paraphrase_data_for__S_in__S_, fort, results_file, paraphrase_data);
                                                                                    } else {
                                                                                        {
                                                                                            SubLObject data_to_store = (NIL != $rich_nl_generation_cache_styleP$.getDynamicValue(thread)) ? ((SubLObject) (paraphrase_data)) : cons(paraphrase_data.first(), second(paraphrase_data));
                                                                                            file_hash_table.fast_put_file_hash_table(fort, fht, data_to_store);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } 
                                                                    }
                                                                } finally {
                                                                    {
                                                                        SubLObject _prev_bind_0_7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            if (stream.isStream()) {
                                                                                close(stream, UNPROVIDED);
                                                                            }
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_7, thread);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        noting_percent_progress_postamble();
                                    } finally {
                                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                        $last_percent_progress_index$.rebind(_prev_bind_0_4, thread);
                                    }
                                }
                            }
                        } finally {
                            $silent_progressP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                file_hash_table.fast_put_file_hash_table($NL_PREDS, fht, nl_preds);
                file_hash_table.fast_put_file_hash_table($LANGUAGE_MT, fht, $nl_generation_fort_cache_paraphrase_mt$.getDynamicValue(thread));
                file_hash_table.finalize_fast_create_file_hash_table(fht, $USE_FIRST, UNPROVIDED);
            }
            return filename;
        }
    }

    public static SubLObject create_nl_generation_fht_from_data(SubLObject filename, SubLObject nl_preds, SubLObject tmp_dir, SubLObject working_directory) {
        if (filename == UNPROVIDED) {
            filename = nl_generation_fort_cache.get_default_nl_generation_cache_file_path(UNPROVIDED);
        }
        if (nl_preds == UNPROVIDED) {
            nl_preds = nl_generation_fort_cache.$nl_generation_fort_cache_nl_preds$.getDynamicValue();
        }
        if (tmp_dir == UNPROVIDED) {
            tmp_dir = nl_generation_fort_cache.$str31$tmp_;
        }
        if (working_directory == UNPROVIDED) {
            working_directory = nl_generation_fort_cache.find_or_create_nl_generation_fort_cache_working_directory(tmp_dir);
        }
        nl_generation_fort_cache.create_filtered_nl_generation_fht_from_data(set.new_set(UNPROVIDED, UNPROVIDED), filename, nl_preds, tmp_dir, working_directory);
        return filename;
    }

    public static SubLObject create_filtered_nl_generation_fht_from_data(final SubLObject skip_terms, SubLObject filename, SubLObject nl_preds, SubLObject tmp_dir, SubLObject working_directory) {
        if (filename == UNPROVIDED) {
            filename = nl_generation_fort_cache.get_default_nl_generation_cache_file_path(UNPROVIDED);
        }
        if (nl_preds == UNPROVIDED) {
            nl_preds = nl_generation_fort_cache.$nl_generation_fort_cache_nl_preds$.getDynamicValue();
        }
        if (tmp_dir == UNPROVIDED) {
            tmp_dir = nl_generation_fort_cache.$str31$tmp_;
        }
        if (working_directory == UNPROVIDED) {
            working_directory = nl_generation_fort_cache.find_or_create_nl_generation_fort_cache_working_directory(tmp_dir);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == set.set_p(skip_terms))) {
            Errors.error(nl_generation_fort_cache.$str40$Cannot_filter_without_a_set__got_, skip_terms);
        }
        final SubLObject fht = file_hash_table.fast_create_file_hash_table(filename, tmp_dir, symbol_function(EQUAL), nl_generation_fort_cache.$HL_EXTERNALIZED_KEYS);
        final SubLObject progress_message = nl_generation_fort_cache.$str41$Compiling_file_hashtable_from_par;
        assert NIL != Filesys.directory_p(working_directory) : "! Filesys.directory_p(working_directory) " + ("Filesys.directory_p(working_directory) " + "CommonSymbols.NIL != Filesys.directory_p(working_directory) ") + working_directory;
        SubLObject directory_contents_var = Filesys.directory(working_directory, T);
        final SubLObject progress_message_var = progress_message;
        final SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
        try {
            $silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
            if (nl_generation_fort_cache.$sym43$STRING_.isFunctionSpec()) {
                directory_contents_var = Sort.sort(directory_contents_var, nl_generation_fort_cache.$sym43$STRING_, UNPROVIDED);
            }
            final SubLObject list_var = directory_contents_var;
            final SubLObject _prev_bind_0_$5 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind(NIL != progress_message_var ? progress_message_var : nl_generation_fort_cache.$$$cdolist, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject assignment_directory = NIL;
                    assignment_directory = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        if (NIL != Filesys.directory_p(assignment_directory)) {
                            if (NIL == Filesys.probe_file(cconcatenate(assignment_directory, nl_generation_fort_cache.$str45$_done))) {
                                Errors.warn(nl_generation_fort_cache.$str46$Skipping_assignment_directory_wit, assignment_directory);
                            } else {
                                final SubLObject same_kbP = eql(build_kb_loaded(), cfasl_utilities.cfasl_load(cconcatenate(working_directory, nl_generation_fort_cache.$str47$build_kb_loaded_cfasl)));
                                final SubLObject slow_results_file = cconcatenate(assignment_directory, nl_generation_fort_cache.$str48$_results_cfasl);
                                final SubLObject fast_results_file = cconcatenate(assignment_directory, nl_generation_fort_cache.$str49$_fast_results_cfasl);
                                final SubLObject results_file = ((NIL != same_kbP) && (NIL != Filesys.probe_file(fast_results_file))) ? fast_results_file : slow_results_file;
                                SubLObject fort = NIL;
                                SubLObject paraphrase_data = NIL;
                                SubLObject doneP = NIL;
                                Errors.warn(nl_generation_fort_cache.$str50$Using_results_file__S, results_file);
                                SubLObject stream = NIL;
                                try {
                                    final SubLObject _prev_bind_0_$6 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                    try {
                                        stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                        stream = compatibility.open_binary(results_file, $INPUT);
                                    } finally {
                                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$6, thread);
                                    }
                                    if (!stream.isStream()) {
                                        Errors.error(nl_generation_fort_cache.$str52$Unable_to_open__S, results_file);
                                    }
                                    final SubLObject stream_$7 = stream;
                                    while (NIL == doneP) {
                                        fort = cfasl_input(stream_$7, NIL, $EOF);
                                        paraphrase_data = cfasl_input(stream_$7, NIL, UNPROVIDED);
                                        if ($EOF == fort) {
                                            doneP = T;
                                        } else
                                            if (NIL == forts.fort_p(fort)) {
                                                Errors.warn(nl_generation_fort_cache.$str54$Non_FORT__S_in_paraphrase_data___, fort, results_file);
                                            } else
                                                if ((!paraphrase_data.isList()) || (NIL == list_utilities.lengthE(paraphrase_data, FOUR_INTEGER, UNPROVIDED))) {
                                                    Errors.warn(nl_generation_fort_cache.$str55$Bad_paraphrase_data_for__S_in__S_, fort, results_file, paraphrase_data);
                                                } else
                                                    if (NIL != set.set_memberP(fort, skip_terms)) {
                                                        Errors.warn(nl_generation_fort_cache.$str56$Skipping_black_listed_term__A___, fort);
                                                    } else {
                                                        final SubLObject data_to_store = (NIL != nl_generation_fort_cache.$rich_nl_generation_cache_styleP$.getDynamicValue(thread)) ? paraphrase_data : cons(paraphrase_data.first(), second(paraphrase_data));
                                                        file_hash_table.fast_put_file_hash_table(fort, fht, data_to_store);
                                                    }



                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (stream.isStream()) {
                                            close(stream, UNPROVIDED);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                                    }
                                }
                            }
                        }
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        assignment_directory = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_2, thread);
                $progress_note$.rebind(_prev_bind_0_$5, thread);
            }
        } finally {
            $silent_progressP$.rebind(_prev_bind_0, thread);
        }
        file_hash_table.fast_put_file_hash_table($NL_PREDS, fht, nl_preds);
        file_hash_table.fast_put_file_hash_table($LANGUAGE_MT, fht, nl_generation_fort_cache.$nl_generation_fort_cache_paraphrase_mt$.getDynamicValue(thread));
        file_hash_table.finalize_fast_create_file_hash_table(fht, $USE_FIRST, UNPROVIDED);
        return filename;
    }

    public static final SubLObject find_or_create_nl_generation_fort_cache_working_directory_alt(SubLObject parent_directory) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject working_directory = format(NIL, $str_alt54$_Anl_generation_cache_work__4__0D, parent_directory, build_kb_loaded());
                if (NIL == Filesys.directory_p(working_directory)) {
                    file_utilities.make_directory_recursive(working_directory, NIL, $$$777);
                    cfasl_utilities.cfasl_save($nl_generation_fort_cache_assignment_size$.getGlobalValue(), cconcatenate(working_directory, $str_alt56$assignment_size_cfasl));
                    cfasl_utilities.cfasl_save(forts.fort_count(), cconcatenate(working_directory, $str_alt36$fort_count_cfasl));
                    cfasl_utilities.cfasl_save(build_kb_loaded(), cconcatenate(working_directory, $str_alt44$build_kb_loaded_cfasl));
                    cfasl_utilities.cfasl_save_externalized($nl_generation_fort_cache_paraphrase_mt$.getDynamicValue(thread), cconcatenate(working_directory, $str_alt57$paraphrase_mt_cfasl));
                }
                return working_directory;
            }
        }
    }

    public static SubLObject find_or_create_nl_generation_fort_cache_working_directory(final SubLObject parent_directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject working_directory = cconcatenate(format_nil.format_nil_a_no_copy(parent_directory), new SubLObject[]{ nl_generation_fort_cache.$str58$nl_generation_cache_work_, format_nil.format_nil_a_no_copy(operation_communication.kb_number_string(build_kb_loaded())), nl_generation_fort_cache.$str19$_ });
        if (NIL == Filesys.directory_p(working_directory)) {
            file_utilities.make_directory_recursive(working_directory, NIL, nl_generation_fort_cache.$$$777);
            cfasl_utilities.cfasl_save(nl_generation_fort_cache.$nl_generation_fort_cache_assignment_size$.getGlobalValue(), cconcatenate(working_directory, nl_generation_fort_cache.$str60$assignment_size_cfasl));
            cfasl_utilities.cfasl_save(forts.fort_count(), cconcatenate(working_directory, nl_generation_fort_cache.$str35$fort_count_cfasl));
            cfasl_utilities.cfasl_save(build_kb_loaded(), cconcatenate(working_directory, nl_generation_fort_cache.$str47$build_kb_loaded_cfasl));
            cfasl_utilities.cfasl_save_externalized(nl_generation_fort_cache.$nl_generation_fort_cache_paraphrase_mt$.getDynamicValue(thread), cconcatenate(working_directory, nl_generation_fort_cache.$str61$paraphrase_mt_cfasl));
        }
        return working_directory;
    }

    public static final SubLObject nl_generation_fort_cache_subdirectory_alt(SubLObject working_directory, SubLObject start_num, SubLObject fort_count, SubLObject assignment_size) {
        if (fort_count == UNPROVIDED) {
            fort_count = NIL;
        }
        if (assignment_size == UNPROVIDED) {
            assignment_size = NIL;
        }
        if (NIL == fort_count) {
            fort_count = cfasl_utilities.cfasl_load(cconcatenate(working_directory, $str_alt36$fort_count_cfasl));
        }
        if (NIL == assignment_size) {
            assignment_size = cfasl_utilities.cfasl_load(cconcatenate(working_directory, $str_alt56$assignment_size_cfasl));
        }
        if (!mod(assignment_size, $nl_generation_fort_cache_batch_size$.getGlobalValue()).isZero()) {
            Errors.error($str_alt58$Assignment_size_is__S__Must_be_a_, $nl_generation_fort_cache_batch_size$.getGlobalValue());
        }
        {
            SubLObject digits = number_utilities.f_1X(floor(log(fort_count, TEN_INTEGER), UNPROVIDED));
            SubLObject format_string = cconcatenate($str_alt59$_, new SubLObject[]{ princ_to_string(digits), $str_alt60$__0D__, princ_to_string(digits), $str_alt61$__0D_ });
            SubLObject end_num = add(start_num, number_utilities.f_1_(assignment_size));
            SubLObject last_oneP = numGE(end_num, fort_count);
            if (NIL != last_oneP) {
                end_num = fort_count;
            }
            {
                SubLObject subdirectory = cconcatenate(working_directory, format(NIL, format_string, start_num, end_num));
                return values(subdirectory, last_oneP, end_num);
            }
        }
    }

    public static SubLObject nl_generation_fort_cache_subdirectory(final SubLObject working_directory, final SubLObject start_num, SubLObject fort_count, SubLObject assignment_size) {
        if (fort_count == UNPROVIDED) {
            fort_count = NIL;
        }
        if (assignment_size == UNPROVIDED) {
            assignment_size = NIL;
        }
        if (NIL == fort_count) {
            fort_count = cfasl_utilities.cfasl_load(cconcatenate(working_directory, nl_generation_fort_cache.$str35$fort_count_cfasl));
        }
        if (NIL == assignment_size) {
            assignment_size = cfasl_utilities.cfasl_load(cconcatenate(working_directory, nl_generation_fort_cache.$str60$assignment_size_cfasl));
        }
        if (!mod(assignment_size, nl_generation_fort_cache.$nl_generation_fort_cache_batch_size$.getGlobalValue()).isZero()) {
            Errors.error(nl_generation_fort_cache.$str62$Assignment_size_is__S__Must_be_a_, nl_generation_fort_cache.$nl_generation_fort_cache_batch_size$.getGlobalValue());
        }
        final SubLObject digits = number_utilities.f_1X(floor(log(fort_count, TEN_INTEGER), UNPROVIDED));
        final SubLObject format_string = cconcatenate(nl_generation_fort_cache.$str63$_, new SubLObject[]{ princ_to_string(digits), nl_generation_fort_cache.$str64$__0D__, princ_to_string(digits), nl_generation_fort_cache.$str65$__0D_ });
        SubLObject end_num = add(start_num, number_utilities.f_1_(assignment_size));
        final SubLObject last_oneP = numGE(end_num, fort_count);
        if (NIL != last_oneP) {
            end_num = fort_count;
        }
        final SubLObject subdirectory = cconcatenate(working_directory, format(NIL, format_string, start_num, end_num));
        return values(subdirectory, last_oneP, end_num);
    }

    public static final SubLObject assign_next_fort_paraphrase_cache_generation_task_and_wait_for_result_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject my_task_directory = com.cyc.cycjava.cycl.nl_generation_fort_cache.find_nl_generation_assignment_directory();
                SubLObject start_num = thread.secondMultipleValue();
                SubLObject end_num = thread.thirdMultipleValue();
                SubLObject task_id = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                if (NIL != Filesys.directory_p(my_task_directory)) {
                    {
                        SubLObject task_specification = list(task_id, my_task_directory, start_num, end_num);
                        SubLObject error_output_file = cconcatenate(my_task_directory, $str_alt62$error_output_log);
                        {
                            SubLObject _prev_bind_0 = $nl_fort_generation_task$.currentBinding(thread);
                            try {
                                $nl_fort_generation_task$.bind(task_specification, thread);
                                format(T, $str_alt63$__Assigning_task__S__, task_specification);
                                force_output(T);
                                if (NIL != $nl_generation_fort_cache_use_forked_processesP$.getDynamicValue(thread)) {
                                    os_process_utilities.fork_cyc_server_process(DO_NEXT_FORT_PARAPHRASE_CACHE_GENERATION_TASK, WAKE_UP_FORT_PARAPHRASE_CACHE_TASKMASTER, error_output_file);
                                } else {
                                    {
                                        SubLObject exit_code = com.cyc.cycjava.cycl.nl_generation_fort_cache.do_next_fort_paraphrase_cache_generation_task();
                                        com.cyc.cycjava.cycl.nl_generation_fort_cache.wake_up_fort_paraphrase_cache_taskmaster(exit_code);
                                    }
                                }
                                {
                                    SubLObject exit_code = process_utilities.ipc_dequeue($nl_fort_generation_results_queue$.getGlobalValue());
                                    format(T, $str_alt66$__Just_dequeued__S_after_enqueuei, exit_code, task_specification);
                                    if (task_id.eql(exit_code)) {
                                        format(T, $str_alt67$__Successfully_completed__S__, task_specification);
                                    } else {
                                        if (com.cyc.cycjava.cycl.nl_generation_fort_cache.nl_fort_generation_task_failure_code().eql(exit_code)) {
                                            com.cyc.cycjava.cycl.nl_generation_fort_cache.note_nl_fort_generation_task_failed(task_specification);
                                            Errors.sublisp_break($str_alt68$Received_failure_code_on_task__S, new SubLObject[]{ task_specification });
                                        } else {
                                            Errors.sublisp_break($str_alt69$Didn_t_recognize_exit_code__S, new SubLObject[]{ exit_code });
                                        }
                                    }
                                }
                            } finally {
                                $nl_fort_generation_task$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return end_num;
            }
        }
    }

    public static SubLObject assign_next_fort_paraphrase_cache_generation_task_and_wait_for_result() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject my_task_directory = nl_generation_fort_cache.find_nl_generation_assignment_directory();
        final SubLObject start_num = thread.secondMultipleValue();
        final SubLObject end_num = thread.thirdMultipleValue();
        final SubLObject task_id = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != Filesys.directory_p(my_task_directory)) {
            final SubLObject task_specification = list(task_id, my_task_directory, start_num, end_num);
            final SubLObject error_output_file = cconcatenate(my_task_directory, nl_generation_fort_cache.$str66$error_output_log);
            final SubLObject _prev_bind_0 = nl_generation_fort_cache.$nl_fort_generation_task$.currentBinding(thread);
            try {
                nl_generation_fort_cache.$nl_fort_generation_task$.bind(task_specification, thread);
                format(T, nl_generation_fort_cache.$str67$__Assigning_task__S__, task_specification);
                force_output(T);
                if (NIL != nl_generation_fort_cache.$nl_generation_fort_cache_use_forked_processesP$.getDynamicValue(thread)) {
                    os_process_utilities.fork_cyc_server_process(nl_generation_fort_cache.DO_NEXT_FORT_PARAPHRASE_CACHE_GENERATION_TASK, nl_generation_fort_cache.WAKE_UP_FORT_PARAPHRASE_CACHE_TASKMASTER, error_output_file);
                } else {
                    final SubLObject exit_code = nl_generation_fort_cache.do_next_fort_paraphrase_cache_generation_task();
                    nl_generation_fort_cache.wake_up_fort_paraphrase_cache_taskmaster(exit_code);
                }
                final SubLObject exit_code = process_utilities.ipc_dequeue(nl_generation_fort_cache.$nl_fort_generation_results_queue$.getGlobalValue(), UNPROVIDED);
                format(T, nl_generation_fort_cache.$str70$__Just_dequeued__S_after_enqueuei, exit_code, task_specification);
                if (task_id.eql(exit_code)) {
                    format(T, nl_generation_fort_cache.$str71$__Successfully_completed__S__, task_specification);
                } else
                    if (nl_generation_fort_cache.nl_fort_generation_task_failure_code().eql(exit_code)) {
                        nl_generation_fort_cache.note_nl_fort_generation_task_failed(task_specification);
                        Errors.sublisp_break(nl_generation_fort_cache.$str72$Received_failure_code_on_task__S, new SubLObject[]{ task_specification });
                    } else {
                        Errors.sublisp_break(nl_generation_fort_cache.$str73$Didn_t_recognize_exit_code__S, new SubLObject[]{ exit_code });
                    }

            } finally {
                nl_generation_fort_cache.$nl_fort_generation_task$.rebind(_prev_bind_0, thread);
            }
        }
        return end_num;
    }

    public static final SubLObject note_nl_fort_generation_task_failed_alt(SubLObject specification) {
        {
            SubLObject directory = specification.first();
            Errors.warn($str_alt70$NL_FORT_Generation_subtask_report, specification);
            set_add(directory, $failed_nl_fort_generation_tasks$.getGlobalValue());
        }
        return $failed_nl_fort_generation_tasks$.getGlobalValue();
    }

    public static SubLObject note_nl_fort_generation_task_failed(final SubLObject specification) {
        final SubLObject directory = specification.first();
        Errors.warn(nl_generation_fort_cache.$str74$NL_FORT_Generation_subtask_report, specification);
        set.set_add(directory, nl_generation_fort_cache.$failed_nl_fort_generation_tasks$.getGlobalValue());
        return nl_generation_fort_cache.$failed_nl_fort_generation_tasks$.getGlobalValue();
    }

    public static final SubLObject nl_fort_generation_task_failedP_alt(SubLObject specification) {
        {
            SubLObject directory = specification.first();
            return set_memberP(directory, $failed_nl_fort_generation_tasks$.getGlobalValue());
        }
    }

    public static SubLObject nl_fort_generation_task_failedP(final SubLObject specification) {
        final SubLObject directory = specification.first();
        return set.set_memberP(directory, nl_generation_fort_cache.$failed_nl_fort_generation_tasks$.getGlobalValue());
    }

    public static final SubLObject wake_up_fort_paraphrase_cache_taskmaster_alt(SubLObject exit_code) {
        format(T, $str_alt71$__About_to_enqueue_new_exit_code_, exit_code);
        return process_utilities.ipc_enqueue(exit_code, $nl_fort_generation_results_queue$.getGlobalValue());
    }

    public static SubLObject wake_up_fort_paraphrase_cache_taskmaster(final SubLObject exit_code) {
        format(T, nl_generation_fort_cache.$str75$__About_to_enqueue_new_exit_code_, exit_code);
        return process_utilities.ipc_enqueue(exit_code, nl_generation_fort_cache.$nl_fort_generation_results_queue$.getGlobalValue(), UNPROVIDED);
    }

    public static final SubLObject do_next_fort_paraphrase_cache_generation_task_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject task_specification = $nl_fort_generation_task$.getDynamicValue(thread);
                SubLObject exit_code = com.cyc.cycjava.cycl.nl_generation_fort_cache.nl_fort_generation_task_failure_code();
                Errors.warn($str_alt72$Just_received_task_specification_, task_specification);
                if (task_specification.isList() && (NIL != list_utilities.lengthE(task_specification, FOUR_INTEGER, UNPROVIDED))) {
                    {
                        SubLObject datum = task_specification;
                        SubLObject current = datum;
                        SubLObject task_id = NIL;
                        SubLObject my_task_directory = NIL;
                        SubLObject start_num = NIL;
                        SubLObject end_num = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt73);
                        task_id = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt73);
                        my_task_directory = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt73);
                        start_num = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt73);
                        end_num = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if (NIL != Filesys.directory_p(my_task_directory)) {
                                com.cyc.cycjava.cycl.nl_generation_fort_cache.do_fort_paraphrase_cache_generation_for_directory(my_task_directory, start_num, end_num);
                            }
                            exit_code = task_id;
                            Errors.warn($str_alt74$Returning__S, exit_code);
                        } else {
                            cdestructuring_bind_error(datum, $list_alt73);
                        }
                    }
                }
                return exit_code;
            }
        }
    }

    public static SubLObject do_next_fort_paraphrase_cache_generation_task() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject task_specification = nl_generation_fort_cache.$nl_fort_generation_task$.getDynamicValue(thread);
        SubLObject exit_code = nl_generation_fort_cache.nl_fort_generation_task_failure_code();
        Errors.warn(nl_generation_fort_cache.$str76$Just_received_task_specification_, task_specification);
        if (task_specification.isList() && (NIL != list_utilities.lengthE(task_specification, FOUR_INTEGER, UNPROVIDED))) {
            SubLObject current;
            final SubLObject datum = current = task_specification;
            SubLObject task_id = NIL;
            SubLObject my_task_directory = NIL;
            SubLObject start_num = NIL;
            SubLObject end_num = NIL;
            destructuring_bind_must_consp(current, datum, nl_generation_fort_cache.$list77);
            task_id = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, nl_generation_fort_cache.$list77);
            my_task_directory = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, nl_generation_fort_cache.$list77);
            start_num = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, nl_generation_fort_cache.$list77);
            end_num = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != Filesys.directory_p(my_task_directory)) {
                    nl_generation_fort_cache.do_fort_paraphrase_cache_generation_for_directory(my_task_directory, start_num, end_num);
                }
                exit_code = task_id;
                Errors.warn(nl_generation_fort_cache.$str78$Returning__S, exit_code);
            } else {
                cdestructuring_bind_error(datum, nl_generation_fort_cache.$list77);
            }
        }
        return exit_code;
    }

    public static final SubLObject do_fort_paraphrase_cache_generation_for_directory_alt(SubLObject my_task_directory, SubLObject start_num, SubLObject end_num) {
        {
            SubLObject results_file = cconcatenate(my_task_directory, $str_alt75$results_cfasl);
            SubLObject fast_results_file = cconcatenate(my_task_directory, $str_alt76$fast_results_cfasl);
            SubLObject previously_done_forts = new_set(UNPROVIDED, UNPROVIDED);
            if (NIL != Filesys.probe_file(results_file)) {
                com.cyc.cycjava.cycl.nl_generation_fort_cache.recopy_nl_generation_fort_cache_results(my_task_directory, previously_done_forts);
            }
            com.cyc.cycjava.cycl.nl_generation_fort_cache.do_fort_paraphrase_cache_generation_for_directory_internal(my_task_directory, start_num, end_num, results_file, fast_results_file, previously_done_forts);
        }
        return my_task_directory;
    }

    public static SubLObject do_fort_paraphrase_cache_generation_for_directory(final SubLObject my_task_directory, final SubLObject start_num, final SubLObject end_num) {
        final SubLObject results_file = cconcatenate(my_task_directory, nl_generation_fort_cache.$str79$results_cfasl);
        final SubLObject fast_results_file = cconcatenate(my_task_directory, nl_generation_fort_cache.$str80$fast_results_cfasl);
        final SubLObject previously_done_forts = set.new_set(UNPROVIDED, UNPROVIDED);
        if (NIL != Filesys.probe_file(results_file)) {
            nl_generation_fort_cache.recopy_nl_generation_fort_cache_results(my_task_directory, previously_done_forts);
        }
        nl_generation_fort_cache.do_fort_paraphrase_cache_generation_for_directory_internal(my_task_directory, start_num, end_num, results_file, fast_results_file, previously_done_forts);
        return my_task_directory;
    }

    public static final SubLObject find_nl_generation_assignment_directory_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject start_num = ONE_INTEGER;
                SubLObject my_task_directory = NIL;
                SubLObject end_num = NIL;
                SubLObject task_id = NIL;
                SubLObject working_directory = $nl_generation_fort_cache_working_directory$.getDynamicValue(thread);
                SubLObject fort_count = cfasl_utilities.cfasl_load(cconcatenate(working_directory, $str_alt36$fort_count_cfasl));
                SubLObject assignment_size = cfasl_utilities.cfasl_load(cconcatenate(working_directory, $str_alt56$assignment_size_cfasl));
                SubLObject doneP = NIL;
                while (NIL == doneP) {
                    thread.resetMultipleValues();
                    {
                        SubLObject subdirectory = com.cyc.cycjava.cycl.nl_generation_fort_cache.nl_generation_fort_cache_subdirectory(working_directory, start_num, fort_count, assignment_size);
                        SubLObject last_oneP = thread.secondMultipleValue();
                        SubLObject this_end_num = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject newP = list_utilities.sublisp_boolean(Filesys.make_directory(subdirectory, UNPROVIDED, UNPROVIDED));
                            if (NIL != newP) {
                                my_task_directory = subdirectory;
                                doneP = T;
                            } else {
                                if (NIL != Filesys.probe_file(cconcatenate(subdirectory, $$$done))) {
                                } else {
                                    if (NIL != $nl_generation_fort_cache_retry_failed_tasksP$.getDynamicValue(thread)) {
                                        {
                                            SubLObject failedP = NIL;
                                            SubLObject ignore_errors_tag = NIL;
                                            try {
                                                {
                                                    SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                                    try {
                                                        Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                                        try {
                                                            failedP = cfasl_kernel.cfasl_api_remote_eval($list_alt81, Environment.get_machine_name(UNPROVIDED), cfasl_kernel.cfasl_port());
                                                        } catch (Throwable catch_var) {
                                                            Errors.handleThrowable(catch_var, NIL);
                                                        }
                                                    } finally {
                                                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                                                    }
                                                }
                                            } catch (Throwable ccatch_env_var) {
                                                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                                            }
                                            if (NIL != failedP) {
                                                my_task_directory = subdirectory;
                                                doneP = T;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (NIL != Filesys.directory_p(my_task_directory)) {
                            end_num = this_end_num;
                            task_id = mod(integerDivide(end_num, assignment_size), $int$255);
                        }
                        if (NIL != last_oneP) {
                            doneP = T;
                        }
                    }
                    if (NIL == doneP) {
                        start_num = add(start_num, assignment_size);
                    }
                } 
                return values(my_task_directory, start_num, end_num, task_id);
            }
        }
    }

    public static SubLObject find_nl_generation_assignment_directory() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject start_num = ONE_INTEGER;
        SubLObject my_task_directory = NIL;
        SubLObject end_num = NIL;
        SubLObject task_id = NIL;
        final SubLObject working_directory = nl_generation_fort_cache.$nl_generation_fort_cache_working_directory$.getDynamicValue(thread);
        final SubLObject fort_count = cfasl_utilities.cfasl_load(cconcatenate(working_directory, nl_generation_fort_cache.$str35$fort_count_cfasl));
        final SubLObject assignment_size = cfasl_utilities.cfasl_load(cconcatenate(working_directory, nl_generation_fort_cache.$str60$assignment_size_cfasl));
        SubLObject doneP = NIL;
        while (NIL == doneP) {
            thread.resetMultipleValues();
            final SubLObject subdirectory = nl_generation_fort_cache.nl_generation_fort_cache_subdirectory(working_directory, start_num, fort_count, assignment_size);
            final SubLObject last_oneP = thread.secondMultipleValue();
            final SubLObject this_end_num = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            final SubLObject newP = list_utilities.sublisp_boolean(Filesys.make_directory(subdirectory, UNPROVIDED, UNPROVIDED));
            if (NIL != newP) {
                my_task_directory = subdirectory;
                doneP = T;
            } else
                if (NIL == Filesys.probe_file(cconcatenate(subdirectory, nl_generation_fort_cache.$$$done))) {
                    if (NIL != nl_generation_fort_cache.$nl_generation_fort_cache_retry_failed_tasksP$.getDynamicValue(thread)) {
                        SubLObject failedP = NIL;
                        SubLObject ignore_errors_tag = NIL;
                        try {
                            thread.throwStack.push(nl_generation_fort_cache.$IGNORE_ERRORS_TARGET);
                            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(symbol_function(nl_generation_fort_cache.IGNORE_ERRORS_HANDLER), thread);
                                try {
                                    failedP = cfasl_kernel.cfasl_api_remote_eval(nl_generation_fort_cache.$list85, Environment.get_machine_name(UNPROVIDED), cfasl_kernel.cfasl_port());
                                } catch (final Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                Errors.$error_handler$.rebind(_prev_bind_0, thread);
                            }
                        } catch (final Throwable ccatch_env_var) {
                            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, nl_generation_fort_cache.$IGNORE_ERRORS_TARGET);
                        } finally {
                            thread.throwStack.pop();
                        }
                        if (NIL != failedP) {
                            my_task_directory = subdirectory;
                            doneP = T;
                        }
                    }
                }

            if (NIL != Filesys.directory_p(my_task_directory)) {
                end_num = this_end_num;
                task_id = mod(ceiling(divide(end_num, assignment_size), UNPROVIDED), $int$255);
            }
            if (NIL != last_oneP) {
                doneP = T;
            }
            if (NIL == doneP) {
                start_num = add(start_num, assignment_size);
            }
        } 
        return values(my_task_directory, start_num, end_num, task_id);
    }

    public static final SubLObject recopy_nl_generation_fort_cache_results_alt(SubLObject my_task_directory, SubLObject previously_done_forts) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject results_file = cconcatenate(my_task_directory, $str_alt75$results_cfasl);
                SubLObject fast_results_file = cconcatenate(my_task_directory, $str_alt76$fast_results_cfasl);
                SubLObject prior_results_file = cconcatenate(my_task_directory, $str_alt82$prior_results_cfasl);
                SubLObject doneP = NIL;
                file_utilities.move_file(results_file, prior_results_file);
                {
                    SubLObject stream = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                            try {
                                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                stream = compatibility.open_binary(prior_results_file, $INPUT, NIL);
                            } finally {
                                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                            }
                        }
                        if (!stream.isStream()) {
                            Errors.error($str_alt49$Unable_to_open__S, prior_results_file);
                        }
                        {
                            SubLObject stream_8 = stream;
                            SubLObject stream_9 = NIL;
                            try {
                                {
                                    SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                    try {
                                        stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                        stream_9 = compatibility.open_binary(results_file, $OUTPUT, NIL);
                                    } finally {
                                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                if (!stream_9.isStream()) {
                                    Errors.error($str_alt49$Unable_to_open__S, results_file);
                                }
                                {
                                    SubLObject results_stream = stream_9;
                                    SubLObject stream_10 = NIL;
                                    try {
                                        {
                                            SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                            try {
                                                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                                stream_10 = compatibility.open_binary(fast_results_file, $OUTPUT, NIL);
                                            } finally {
                                                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                        if (!stream_10.isStream()) {
                                            Errors.error($str_alt49$Unable_to_open__S, fast_results_file);
                                        }
                                        {
                                            SubLObject fast_results_stream = stream_10;
                                            while (NIL == doneP) {
                                                {
                                                    SubLObject fort = cfasl_input(stream_8, NIL, $EOF);
                                                    SubLObject paraphrase_data = cfasl_input(stream_8, NIL, UNPROVIDED);
                                                    if (NIL != forts.fort_p(fort)) {
                                                        cfasl_output_externalized(fort, results_stream);
                                                        cfasl_output_externalized(paraphrase_data, results_stream);
                                                        cfasl_output(fort, fast_results_stream);
                                                        cfasl_output(paraphrase_data, fast_results_stream);
                                                        set_add(fort, previously_done_forts);
                                                    } else {
                                                        doneP = T;
                                                    }
                                                }
                                            } 
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                if (stream_10.isStream()) {
                                                    close(stream_10, UNPROVIDED);
                                                }
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if (stream_9.isStream()) {
                                            close(stream_9, UNPROVIDED);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                if (stream.isStream()) {
                                    close(stream, UNPROVIDED);
                                }
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                Filesys.delete_file(prior_results_file);
            }
            return my_task_directory;
        }
    }

    public static SubLObject recopy_nl_generation_fort_cache_results(final SubLObject my_task_directory, final SubLObject previously_done_forts) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject results_file = cconcatenate(my_task_directory, nl_generation_fort_cache.$str79$results_cfasl);
        final SubLObject fast_results_file = cconcatenate(my_task_directory, nl_generation_fort_cache.$str80$fast_results_cfasl);
        final SubLObject prior_results_file = cconcatenate(my_task_directory, nl_generation_fort_cache.$str86$prior_results_cfasl);
        SubLObject doneP = NIL;
        file_utilities.move_file(results_file, prior_results_file);
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_binary(prior_results_file, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error(nl_generation_fort_cache.$str52$Unable_to_open__S, prior_results_file);
            }
            final SubLObject stream_$10 = stream;
            SubLObject stream_$11 = NIL;
            try {
                final SubLObject _prev_bind_2 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream_$11 = compatibility.open_binary(results_file, $OUTPUT);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_2, thread);
                }
                if (!stream_$11.isStream()) {
                    Errors.error(nl_generation_fort_cache.$str52$Unable_to_open__S, results_file);
                }
                final SubLObject results_stream = stream_$11;
                SubLObject stream_$12 = NIL;
                try {
                    final SubLObject _prev_bind_3 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                    try {
                        stream_macros.$stream_requires_locking$.bind(NIL, thread);
                        stream_$12 = compatibility.open_binary(fast_results_file, $OUTPUT);
                    } finally {
                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_3, thread);
                    }
                    if (!stream_$12.isStream()) {
                        Errors.error(nl_generation_fort_cache.$str52$Unable_to_open__S, fast_results_file);
                    }
                    final SubLObject fast_results_stream = stream_$12;
                    while (NIL == doneP) {
                        final SubLObject fort = cfasl_input(stream_$10, NIL, $EOF);
                        final SubLObject paraphrase_data = cfasl_input(stream_$10, NIL, UNPROVIDED);
                        if (NIL != forts.fort_p(fort)) {
                            cfasl_output_externalized(fort, results_stream);
                            cfasl_output_externalized(paraphrase_data, results_stream);
                            cfasl_output(fort, fast_results_stream);
                            cfasl_output(paraphrase_data, fast_results_stream);
                            set.set_add(fort, previously_done_forts);
                        } else {
                            doneP = T;
                        }
                    } 
                } finally {
                    final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        if (stream_$12.isStream()) {
                            close(stream_$12, UNPROVIDED);
                        }
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                    }
                }
            } finally {
                final SubLObject _prev_bind_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    if (stream_$11.isStream()) {
                        close(stream_$11, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
                }
            }
        } finally {
            final SubLObject _prev_bind_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values3 = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values3);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_6, thread);
            }
        }
        Filesys.delete_file(prior_results_file);
        return my_task_directory;
    }

    public static final SubLObject do_fort_paraphrase_cache_generation_for_directory_internal_alt(SubLObject my_task_directory, SubLObject start_num, SubLObject end_num, SubLObject results_file, SubLObject fast_results_file, SubLObject previously_done_forts) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject log_file = cconcatenate(my_task_directory, $str_alt84$stats_log);
                SubLObject doneP = NIL;
                SubLObject i = ZERO_INTEGER;
                SubLObject batch_size = $nl_generation_fort_cache_batch_size$.getGlobalValue();
                SubLObject batch_times = NIL;
                SubLObject batch_failed_forts = NIL;
                SubLObject batch_start_time = get_universal_time();
                SubLObject batch_start_cpu_time = pph_diagnostics.image_elapsed_cpu_time();
                SubLObject paraphrase_mt = $nl_generation_fort_cache_paraphrase_mt$.getDynamicValue(thread);
                SubLObject nl_preds = $nl_generation_fort_cache_nl_preds$.getDynamicValue(thread);
                {
                    SubLObject _prev_bind_0 = $nl_generation_fort_cache_median_times$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $nl_generation_fort_cache_total_times$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $nl_generation_fort_cache_cpu_times$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $nl_generation_fort_cache_swap_times$.currentBinding(thread);
                    SubLObject _prev_bind_4 = $nl_generation_fort_cache_failed_fort_counts$.currentBinding(thread);
                    SubLObject _prev_bind_5 = $nl_generation_fort_cache_gc_times$.currentBinding(thread);
                    try {
                        $nl_generation_fort_cache_median_times$.bind(NIL, thread);
                        $nl_generation_fort_cache_total_times$.bind(NIL, thread);
                        $nl_generation_fort_cache_cpu_times$.bind(NIL, thread);
                        $nl_generation_fort_cache_swap_times$.bind(NIL, thread);
                        $nl_generation_fort_cache_failed_fort_counts$.bind(NIL, thread);
                        $nl_generation_fort_cache_gc_times$.bind(NIL, thread);
                        {
                            SubLObject stream = NIL;
                            try {
                                stream = compatibility.open_text(log_file, $APPEND, NIL);
                                if (!stream.isStream()) {
                                    Errors.error($str_alt49$Unable_to_open__S, log_file);
                                }
                                {
                                    SubLObject log_stream = stream;
                                    SubLObject stream_11 = NIL;
                                    try {
                                        {
                                            SubLObject _prev_bind_0_12 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                            try {
                                                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                                stream_11 = compatibility.open_binary(results_file, $APPEND, NIL);
                                            } finally {
                                                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_12, thread);
                                            }
                                        }
                                        if (!stream_11.isStream()) {
                                            Errors.error($str_alt49$Unable_to_open__S, results_file);
                                        }
                                        {
                                            SubLObject results_stream = stream_11;
                                            SubLObject stream_13 = NIL;
                                            try {
                                                {
                                                    SubLObject _prev_bind_0_14 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                                    try {
                                                        stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                                        stream_13 = compatibility.open_binary(fast_results_file, $APPEND, NIL);
                                                    } finally {
                                                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_14, thread);
                                                    }
                                                }
                                                if (!stream_13.isStream()) {
                                                    Errors.error($str_alt49$Unable_to_open__S, fast_results_file);
                                                }
                                                {
                                                    SubLObject fast_results_stream = stream_13;
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject _prev_bind_0_15 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                                                        try {
                                                            pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                                                            {
                                                                SubLObject reuseP = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                try {
                                                                    thread.resetMultipleValues();
                                                                    {
                                                                        SubLObject _prev_bind_0_16 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                                                        try {
                                                                            pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                                                            {
                                                                                SubLObject new_or_reused = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                {
                                                                                    SubLObject _prev_bind_0_17 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                                                                    try {
                                                                                        pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                                                        {
                                                                                            SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                                                            {
                                                                                                SubLObject _prev_bind_0_18 = memoization_state.$memoization_state$.currentBinding(thread);
                                                                                                try {
                                                                                                    memoization_state.$memoization_state$.bind(local_state, thread);
                                                                                                    {
                                                                                                        SubLObject original_memoization_process = NIL;
                                                                                                        if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                                                                                            original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                                                                                            {
                                                                                                                SubLObject current_proc = current_process();
                                                                                                                if (NIL == original_memoization_process) {
                                                                                                                    memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                                                                                                } else {
                                                                                                                    if (original_memoization_process != current_proc) {
                                                                                                                        Errors.error($str_alt86$Invalid_attempt_to_reuse_memoizat);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        try {
                                                                                                        } finally {
                                                                                                            {
                                                                                                                SubLObject _prev_bind_0_19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                    assertion_manager.clear_assertion_content_swap_time();
                                                                                                                    assertion_manager.meter_assertion_content_swap_time();
                                                                                                                    {
                                                                                                                        SubLObject _prev_bind_0_20 = $last_percent_progress_index$.currentBinding(thread);
                                                                                                                        SubLObject _prev_bind_1_21 = $last_percent_progress_prediction$.currentBinding(thread);
                                                                                                                        SubLObject _prev_bind_2_22 = $within_noting_percent_progress$.currentBinding(thread);
                                                                                                                        SubLObject _prev_bind_3_23 = $percent_progress_start_time$.currentBinding(thread);
                                                                                                                        try {
                                                                                                                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                                                                                                            $last_percent_progress_prediction$.bind(NIL, thread);
                                                                                                                            $within_noting_percent_progress$.bind(T, thread);
                                                                                                                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                                                                                                                            noting_percent_progress_preamble(cconcatenate($str_alt87$Generating_nl_for_forts_, new SubLObject[]{ format_nil.format_nil_s_no_copy(start_num), $str_alt88$_through_, format_nil.format_nil_s_no_copy(end_num), $str_alt89$_____ }));
                                                                                                                            {
                                                                                                                                SubLObject _prev_bind_0_24 = $silent_progressP$.currentBinding(thread);
                                                                                                                                try {
                                                                                                                                    $silent_progressP$.bind(T, thread);
                                                                                                                                    {
                                                                                                                                        SubLObject message = $str_alt90$;
                                                                                                                                        SubLObject total = forts.fort_count();
                                                                                                                                        SubLObject sofar = ZERO_INTEGER;
                                                                                                                                        {
                                                                                                                                            SubLObject _prev_bind_0_25 = $last_percent_progress_index$.currentBinding(thread);
                                                                                                                                            SubLObject _prev_bind_1_26 = $last_percent_progress_prediction$.currentBinding(thread);
                                                                                                                                            SubLObject _prev_bind_2_27 = $within_noting_percent_progress$.currentBinding(thread);
                                                                                                                                            SubLObject _prev_bind_3_28 = $percent_progress_start_time$.currentBinding(thread);
                                                                                                                                            try {
                                                                                                                                                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                                                                                                                                $last_percent_progress_prediction$.bind(NIL, thread);
                                                                                                                                                $within_noting_percent_progress$.bind(T, thread);
                                                                                                                                                $percent_progress_start_time$.bind(get_universal_time(), thread);
                                                                                                                                                noting_percent_progress_preamble(message);
                                                                                                                                                {
                                                                                                                                                    SubLObject rest = NIL;
                                                                                                                                                    for (rest = forts.do_forts_tables(); !((NIL != doneP) || (NIL == rest)); rest = rest.rest()) {
                                                                                                                                                        {
                                                                                                                                                            SubLObject table_var = rest.first();
                                                                                                                                                            if (NIL == do_id_index_empty_p(table_var, $SKIP)) {
                                                                                                                                                                {
                                                                                                                                                                    SubLObject id = do_id_index_next_id(table_var, T, NIL, NIL);
                                                                                                                                                                    SubLObject state_var = do_id_index_next_state(table_var, T, id, NIL);
                                                                                                                                                                    SubLObject fort = NIL;
                                                                                                                                                                    while ((NIL != id) && (NIL == doneP)) {
                                                                                                                                                                        fort = do_id_index_state_object(table_var, $SKIP, id, state_var);
                                                                                                                                                                        if (NIL != do_id_index_id_and_object_validP(id, fort, $SKIP)) {
                                                                                                                                                                            sofar = add(sofar, ONE_INTEGER);
                                                                                                                                                                            note_percent_progress(sofar, total);
                                                                                                                                                                            i = add(i, ONE_INTEGER);
                                                                                                                                                                            {
                                                                                                                                                                                SubLObject _prev_bind_0_29 = $silent_progressP$.currentBinding(thread);
                                                                                                                                                                                try {
                                                                                                                                                                                    $silent_progressP$.bind(NIL, thread);
                                                                                                                                                                                    note_percent_progress(subtract(i, start_num), number_utilities.f_1X(subtract(end_num, start_num)));
                                                                                                                                                                                } finally {
                                                                                                                                                                                    $silent_progressP$.rebind(_prev_bind_0_29, thread);
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            if (!((i.numL(start_num) || (NIL != set_memberP(fort, previously_done_forts))) || (NIL != com.cyc.cycjava.cycl.nl_generation_fort_cache.dont_want_to_generate_this_oneP(fort)))) {
                                                                                                                                                                                {
                                                                                                                                                                                    SubLObject max_time = $nl_generation_fort_cache_timeout$.getDynamicValue(thread);
                                                                                                                                                                                    SubLObject timed_outP = NIL;
                                                                                                                                                                                    SubLObject time = NIL;
                                                                                                                                                                                    SubLObject str = NIL;
                                                                                                                                                                                    SubLObject pred = NIL;
                                                                                                                                                                                    SubLObject justifications = NIL;
                                                                                                                                                                                    SubLObject demerits = NIL;
                                                                                                                                                                                    {
                                                                                                                                                                                        SubLObject time_var = get_internal_real_time();
                                                                                                                                                                                        {
                                                                                                                                                                                            SubLObject tag = with_timeout_make_tag();
                                                                                                                                                                                            try {
                                                                                                                                                                                                {
                                                                                                                                                                                                    SubLObject _prev_bind_0_30 = $within_with_timeout$.currentBinding(thread);
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        $within_with_timeout$.bind(T, thread);
                                                                                                                                                                                                        {
                                                                                                                                                                                                            SubLObject timer = NIL;
                                                                                                                                                                                                            try {
                                                                                                                                                                                                                {
                                                                                                                                                                                                                    SubLObject _prev_bind_0_31 = $with_timeout_nesting_depth$.currentBinding(thread);
                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                        $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                                                                                                                                                                                        timer = with_timeout_start_timer(max_time, tag);
                                                                                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                                                                                        {
                                                                                                                                                                                                                            SubLObject str_32 = com.cyc.cycjava.cycl.nl_generation_fort_cache.paraphrase_fort_for_cache(fort, paraphrase_mt, nl_preds);
                                                                                                                                                                                                                            SubLObject pred_33 = thread.secondMultipleValue();
                                                                                                                                                                                                                            SubLObject demerits_34 = thread.thirdMultipleValue();
                                                                                                                                                                                                                            SubLObject justifications_35 = thread.fourthMultipleValue();
                                                                                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                                                                                            str = str_32;
                                                                                                                                                                                                                            pred = pred_33;
                                                                                                                                                                                                                            demerits = demerits_34;
                                                                                                                                                                                                                            justifications = justifications_35;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    } finally {
                                                                                                                                                                                                                        $with_timeout_nesting_depth$.rebind(_prev_bind_0_31, thread);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                            } finally {
                                                                                                                                                                                                                {
                                                                                                                                                                                                                    SubLObject _prev_bind_0_36 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                                                                                                                        with_timeout_stop_timer(timer);
                                                                                                                                                                                                                    } finally {
                                                                                                                                                                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_36, thread);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                    } finally {
                                                                                                                                                                                                        $within_with_timeout$.rebind(_prev_bind_0_30, thread);
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            } catch (Throwable ccatch_env_var) {
                                                                                                                                                                                                timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                                                                                                                                                                                    }
                                                                                                                                                                                    if ((NIL != timed_outP) && (NIL != $nl_generation_fort_cache_retry_on_timeoutP$.getDynamicValue(thread))) {
                                                                                                                                                                                        Errors.warn($str_alt92$Timed_out_on_first_try_after__A_g, numeric_date_utilities.readable_elapsed_time_string(max_time, UNPROVIDED), fort);
                                                                                                                                                                                        {
                                                                                                                                                                                            SubLObject time_var = get_internal_real_time();
                                                                                                                                                                                            {
                                                                                                                                                                                                SubLObject tag = with_timeout_make_tag();
                                                                                                                                                                                                try {
                                                                                                                                                                                                    {
                                                                                                                                                                                                        SubLObject _prev_bind_0_37 = $within_with_timeout$.currentBinding(thread);
                                                                                                                                                                                                        try {
                                                                                                                                                                                                            $within_with_timeout$.bind(T, thread);
                                                                                                                                                                                                            {
                                                                                                                                                                                                                SubLObject timer = NIL;
                                                                                                                                                                                                                try {
                                                                                                                                                                                                                    {
                                                                                                                                                                                                                        SubLObject _prev_bind_0_38 = $with_timeout_nesting_depth$.currentBinding(thread);
                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                            $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                                                                                                                                                                                            timer = with_timeout_start_timer(max_time, tag);
                                                                                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                                                                                            {
                                                                                                                                                                                                                                SubLObject str_39 = com.cyc.cycjava.cycl.nl_generation_fort_cache.paraphrase_fort_for_cache(fort, paraphrase_mt, nl_preds);
                                                                                                                                                                                                                                SubLObject pred_40 = thread.secondMultipleValue();
                                                                                                                                                                                                                                SubLObject demerits_41 = thread.thirdMultipleValue();
                                                                                                                                                                                                                                SubLObject justifications_42 = thread.fourthMultipleValue();
                                                                                                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                                                                                                str = str_39;
                                                                                                                                                                                                                                pred = pred_40;
                                                                                                                                                                                                                                demerits = demerits_41;
                                                                                                                                                                                                                                justifications = justifications_42;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        } finally {
                                                                                                                                                                                                                            $with_timeout_nesting_depth$.rebind(_prev_bind_0_38, thread);
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                } finally {
                                                                                                                                                                                                                    {
                                                                                                                                                                                                                        SubLObject _prev_bind_0_43 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                                                                                                                            with_timeout_stop_timer(timer);
                                                                                                                                                                                                                        } finally {
                                                                                                                                                                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_43, thread);
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                        } finally {
                                                                                                                                                                                                            $within_with_timeout$.rebind(_prev_bind_0_37, thread);
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                } catch (Throwable ccatch_env_var) {
                                                                                                                                                                                                    timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                            time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                    batch_times = cons(time, batch_times);
                                                                                                                                                                                    if (NIL != timed_outP) {
                                                                                                                                                                                        funcall(NIL != $nl_generation_fort_cache_break_on_timeoutP$.getDynamicValue(thread) ? ((SubLObject) (BREAK)) : WARN, $str_alt95$Timed_out_after__A_generating_par, numeric_date_utilities.readable_elapsed_time_string(max_time, UNPROVIDED), fort);
                                                                                                                                                                                        batch_failed_forts = cons(fort, batch_failed_forts);
                                                                                                                                                                                    } else {
                                                                                                                                                                                        if (NIL != string_utilities.non_empty_stringP(str)) {
                                                                                                                                                                                            {
                                                                                                                                                                                                SubLObject paraphrase_data = list(str, pred, demerits, justifications);
                                                                                                                                                                                                cfasl_output_externalized(fort, results_stream);
                                                                                                                                                                                                cfasl_output_externalized(paraphrase_data, results_stream);
                                                                                                                                                                                                cfasl_output(fort, fast_results_stream);
                                                                                                                                                                                                cfasl_output(paraphrase_data, fast_results_stream);
                                                                                                                                                                                            }
                                                                                                                                                                                        } else {
                                                                                                                                                                                            if (NIL != string_utilities.empty_string_p(str)) {
                                                                                                                                                                                                Errors.warn($str_alt96$Generated_empty_string_for__S, fort);
                                                                                                                                                                                                batch_failed_forts = cons(fort, batch_failed_forts);
                                                                                                                                                                                            } else {
                                                                                                                                                                                                if (!str.isString()) {
                                                                                                                                                                                                    Errors.warn($str_alt97$Failed_to_generate_a_string_for__, fort);
                                                                                                                                                                                                    batch_failed_forts = cons(fort, batch_failed_forts);
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            if (mod(i, batch_size).isZero() && (NIL != list_utilities.non_empty_list_p(batch_times))) {
                                                                                                                                                                                com.cyc.cycjava.cycl.nl_generation_fort_cache.trim_pph_memoization_state_caches(UNPROVIDED);
                                                                                                                                                                                {
                                                                                                                                                                                    SubLObject batch_number = integerDivide(i, batch_size);
                                                                                                                                                                                    $nl_generation_fort_cache_failed_fort_counts$.setDynamicValue(list_utilities.add_to_end(list(batch_number, length(batch_failed_forts)), $nl_generation_fort_cache_failed_fort_counts$.getDynamicValue(thread)), thread);
                                                                                                                                                                                }
                                                                                                                                                                                batch_failed_forts = NIL;
                                                                                                                                                                                com.cyc.cycjava.cycl.nl_generation_fort_cache.print_nl_generation_cache_times(i, batch_size, batch_start_time, batch_start_cpu_time, batch_times, my_task_directory, log_stream);
                                                                                                                                                                                batch_start_time = get_universal_time();
                                                                                                                                                                                batch_times = NIL;
                                                                                                                                                                                batch_start_cpu_time = pph_diagnostics.image_elapsed_cpu_time();
                                                                                                                                                                            }
                                                                                                                                                                            if (i.numGE(end_num)) {
                                                                                                                                                                                doneP = T;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        id = do_id_index_next_id(table_var, T, id, state_var);
                                                                                                                                                                        state_var = do_id_index_next_state(table_var, T, id, state_var);
                                                                                                                                                                    } 
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                noting_percent_progress_postamble();
                                                                                                                                            } finally {
                                                                                                                                                $percent_progress_start_time$.rebind(_prev_bind_3_28, thread);
                                                                                                                                                $within_noting_percent_progress$.rebind(_prev_bind_2_27, thread);
                                                                                                                                                $last_percent_progress_prediction$.rebind(_prev_bind_1_26, thread);
                                                                                                                                                $last_percent_progress_index$.rebind(_prev_bind_0_25, thread);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                } finally {
                                                                                                                                    $silent_progressP$.rebind(_prev_bind_0_24, thread);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            noting_percent_progress_postamble();
                                                                                                                        } finally {
                                                                                                                            $percent_progress_start_time$.rebind(_prev_bind_3_23, thread);
                                                                                                                            $within_noting_percent_progress$.rebind(_prev_bind_2_22, thread);
                                                                                                                            $last_percent_progress_prediction$.rebind(_prev_bind_1_21, thread);
                                                                                                                            $last_percent_progress_index$.rebind(_prev_bind_0_20, thread);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    if (NIL != doneP) {
                                                                                                                        file_utilities.write_text_file(cconcatenate(my_task_directory, $$$done), NIL);
                                                                                                                    }
                                                                                                                    if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                                                                                        memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                                                                                    }
                                                                                                                } finally {
                                                                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_19, thread);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } finally {
                                                                                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_18, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_17, thread);
                                                                                    }
                                                                                }
                                                                                if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                                                                    memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_16, thread);
                                                                        }
                                                                    }
                                                                } finally {
                                                                    {
                                                                        SubLObject _prev_bind_0_44 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            if (NIL == reuseP) {
                                                                                pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                                                            }
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_44, thread);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } finally {
                                                            pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_15, thread);
                                                        }
                                                    }
                                                }
                                            } finally {
                                                {
                                                    SubLObject _prev_bind_0_45 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        if (stream_13.isStream()) {
                                                            close(stream_13, UNPROVIDED);
                                                        }
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_45, thread);
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0_46 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                if (stream_11.isStream()) {
                                                    close(stream_11, UNPROVIDED);
                                                }
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_46, thread);
                                            }
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_47 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if (stream.isStream()) {
                                            close(stream, UNPROVIDED);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_47, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        $nl_generation_fort_cache_gc_times$.rebind(_prev_bind_5, thread);
                        $nl_generation_fort_cache_failed_fort_counts$.rebind(_prev_bind_4, thread);
                        $nl_generation_fort_cache_swap_times$.rebind(_prev_bind_3, thread);
                        $nl_generation_fort_cache_cpu_times$.rebind(_prev_bind_2, thread);
                        $nl_generation_fort_cache_total_times$.rebind(_prev_bind_1, thread);
                        $nl_generation_fort_cache_median_times$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return my_task_directory;
        }
    }

    public static SubLObject do_fort_paraphrase_cache_generation_for_directory_internal(final SubLObject my_task_directory, final SubLObject start_num, final SubLObject end_num, final SubLObject results_file, final SubLObject fast_results_file, final SubLObject previously_done_forts) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject log_file = cconcatenate(my_task_directory, nl_generation_fort_cache.$str88$stats_log);
        SubLObject doneP = NIL;
        SubLObject i = ZERO_INTEGER;
        final SubLObject batch_size = nl_generation_fort_cache.$nl_generation_fort_cache_batch_size$.getGlobalValue();
        SubLObject batch_times = NIL;
        SubLObject batch_failed_forts = NIL;
        SubLObject batch_start_time = get_universal_time();
        final SubLObject batch_start_cpu_time = NIL;
        final SubLObject paraphrase_mt = nl_generation_fort_cache.$nl_generation_fort_cache_paraphrase_mt$.getDynamicValue(thread);
        final SubLObject nl_preds = nl_generation_fort_cache.$nl_generation_fort_cache_nl_preds$.getDynamicValue(thread);
        final SubLObject _prev_bind_0 = nl_generation_fort_cache.$nl_generation_fort_cache_median_times$.currentBinding(thread);
        final SubLObject _prev_bind_2 = nl_generation_fort_cache.$nl_generation_fort_cache_total_times$.currentBinding(thread);
        final SubLObject _prev_bind_3 = nl_generation_fort_cache.$nl_generation_fort_cache_cpu_times$.currentBinding(thread);
        final SubLObject _prev_bind_4 = nl_generation_fort_cache.$nl_generation_fort_cache_swap_times$.currentBinding(thread);
        final SubLObject _prev_bind_5 = nl_generation_fort_cache.$nl_generation_fort_cache_failed_fort_counts$.currentBinding(thread);
        final SubLObject _prev_bind_6 = nl_generation_fort_cache.$nl_generation_fort_cache_gc_times$.currentBinding(thread);
        final SubLObject _prev_bind_7 = pph_vars.$bypass_pph_phrase_destroyerP$.currentBinding(thread);
        try {
            nl_generation_fort_cache.$nl_generation_fort_cache_median_times$.bind(NIL, thread);
            nl_generation_fort_cache.$nl_generation_fort_cache_total_times$.bind(NIL, thread);
            nl_generation_fort_cache.$nl_generation_fort_cache_cpu_times$.bind(NIL, thread);
            nl_generation_fort_cache.$nl_generation_fort_cache_swap_times$.bind(NIL, thread);
            nl_generation_fort_cache.$nl_generation_fort_cache_failed_fort_counts$.bind(NIL, thread);
            nl_generation_fort_cache.$nl_generation_fort_cache_gc_times$.bind(NIL, thread);
            pph_vars.$bypass_pph_phrase_destroyerP$.bind(T, thread);
            SubLObject pph_phrase_count = pph_data_structures.pph_phrase_count();
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(log_file, $APPEND);
                if (!stream.isStream()) {
                    Errors.error(nl_generation_fort_cache.$str52$Unable_to_open__S, log_file);
                }
                final SubLObject log_stream = stream;
                SubLObject stream_$13 = NIL;
                try {
                    final SubLObject _prev_bind_0_$14 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                    try {
                        stream_macros.$stream_requires_locking$.bind(NIL, thread);
                        stream_$13 = compatibility.open_binary(results_file, $APPEND);
                    } finally {
                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$14, thread);
                    }
                    if (!stream_$13.isStream()) {
                        Errors.error(nl_generation_fort_cache.$str52$Unable_to_open__S, results_file);
                    }
                    final SubLObject results_stream = stream_$13;
                    SubLObject stream_$14 = NIL;
                    try {
                        final SubLObject _prev_bind_0_$15 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream_$14 = compatibility.open_binary(fast_results_file, $APPEND);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$15, thread);
                        }
                        if (!stream_$14.isStream()) {
                            Errors.error(nl_generation_fort_cache.$str52$Unable_to_open__S, fast_results_file);
                        }
                        final SubLObject fast_results_stream = stream_$14;
                        final SubLObject _prev_bind_0_$16 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
                        try {
                            pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
                            thread.resetMultipleValues();
                            final SubLObject _prev_bind_0_$17 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                            try {
                                pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                                final SubLObject reuseP = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                try {
                                    thread.resetMultipleValues();
                                    final SubLObject _prev_bind_0_$18 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                    try {
                                        pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                        final SubLObject new_or_reused = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        final SubLObject _prev_bind_0_$19 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                        try {
                                            pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                            final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                            final SubLObject _prev_bind_0_$20 = memoization_state.$memoization_state$.currentBinding(thread);
                                            try {
                                                memoization_state.$memoization_state$.bind(local_state, thread);
                                                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                                try {
                                                    assertion_manager.clear_assertion_content_swap_time();
                                                    assertion_manager.meter_assertion_content_swap_time();
                                                    final SubLObject _prev_bind_0_$21 = $last_percent_progress_index$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$23 = $last_percent_progress_prediction$.currentBinding(thread);
                                                    final SubLObject _prev_bind_2_$24 = $within_noting_percent_progress$.currentBinding(thread);
                                                    final SubLObject _prev_bind_3_$25 = $percent_progress_start_time$.currentBinding(thread);
                                                    try {
                                                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                                        $last_percent_progress_prediction$.bind(NIL, thread);
                                                        $within_noting_percent_progress$.bind(T, thread);
                                                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                                                        try {
                                                            noting_percent_progress_preamble(cconcatenate(nl_generation_fort_cache.$$$Generating_nl_for_forts_, new SubLObject[]{ format_nil.format_nil_s_no_copy(start_num), nl_generation_fort_cache.$$$_through_, format_nil.format_nil_s_no_copy(end_num), nl_generation_fort_cache.$str92$__PPH_phrase_count___, format_nil.format_nil_d_no_copy(pph_phrase_count), nl_generation_fort_cache.$str93$_____ }));
                                                            final SubLObject _prev_bind_0_$22 = $silent_progressP$.currentBinding(thread);
                                                            try {
                                                                $silent_progressP$.bind(T, thread);
                                                                final SubLObject message = nl_generation_fort_cache.$str94$;
                                                                final SubLObject total = forts.fort_count();
                                                                SubLObject sofar = ZERO_INTEGER;
                                                                final SubLObject _prev_bind_0_$23 = $last_percent_progress_index$.currentBinding(thread);
                                                                final SubLObject _prev_bind_1_$24 = $last_percent_progress_prediction$.currentBinding(thread);
                                                                final SubLObject _prev_bind_2_$25 = $within_noting_percent_progress$.currentBinding(thread);
                                                                final SubLObject _prev_bind_3_$26 = $percent_progress_start_time$.currentBinding(thread);
                                                                try {
                                                                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                                                    $last_percent_progress_prediction$.bind(NIL, thread);
                                                                    $within_noting_percent_progress$.bind(T, thread);
                                                                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                                                                    try {
                                                                        noting_percent_progress_preamble(message);
                                                                        SubLObject rest;
                                                                        SubLObject idx;
                                                                        SubLObject table_var;
                                                                        SubLObject idx_$31;
                                                                        SubLObject vector_var;
                                                                        SubLObject backwardP_var;
                                                                        SubLObject length;
                                                                        SubLObject current;
                                                                        SubLObject datum;
                                                                        SubLObject start;
                                                                        SubLObject end;
                                                                        SubLObject delta;
                                                                        SubLObject end_var;
                                                                        SubLObject id;
                                                                        SubLObject fort;
                                                                        SubLObject _prev_bind_0_$24;
                                                                        SubLObject max_time;
                                                                        SubLObject timed_outP;
                                                                        SubLObject time;
                                                                        SubLObject str;
                                                                        SubLObject pred;
                                                                        SubLObject justifications;
                                                                        SubLObject demerits;
                                                                        SubLObject time_var;
                                                                        SubLObject tag;
                                                                        SubLObject _prev_bind_0_$25;
                                                                        SubLObject timer;
                                                                        SubLObject _prev_bind_0_$26;
                                                                        SubLObject str_$35;
                                                                        SubLObject pred_$36;
                                                                        SubLObject demerits_$37;
                                                                        SubLObject justifications_$38;
                                                                        SubLObject _prev_bind_0_$27;
                                                                        SubLObject _values;
                                                                        SubLObject _prev_bind_0_$28;
                                                                        SubLObject _prev_bind_0_$29;
                                                                        SubLObject str_$36;
                                                                        SubLObject pred_$37;
                                                                        SubLObject demerits_$38;
                                                                        SubLObject justifications_$39;
                                                                        SubLObject _prev_bind_0_$30;
                                                                        SubLObject _values2;
                                                                        SubLObject paraphrase_data;
                                                                        SubLObject new_pph_phrase_count;
                                                                        SubLObject batch_number;
                                                                        SubLObject idx_$32;
                                                                        SubLObject sparse;
                                                                        SubLObject id2;
                                                                        SubLObject end_id;
                                                                        SubLObject v_default;
                                                                        SubLObject fort2;
                                                                        SubLObject _prev_bind_0_$31;
                                                                        SubLObject max_time2;
                                                                        SubLObject timed_outP2;
                                                                        SubLObject time2;
                                                                        SubLObject str2;
                                                                        SubLObject pred2;
                                                                        SubLObject justifications2;
                                                                        SubLObject demerits2;
                                                                        SubLObject time_var2;
                                                                        SubLObject tag2;
                                                                        SubLObject _prev_bind_0_$32;
                                                                        SubLObject timer2;
                                                                        SubLObject _prev_bind_0_$33;
                                                                        SubLObject str_$37;
                                                                        SubLObject pred_$38;
                                                                        SubLObject demerits_$39;
                                                                        SubLObject justifications_$40;
                                                                        SubLObject _prev_bind_0_$34;
                                                                        SubLObject _values3;
                                                                        SubLObject _prev_bind_0_$35;
                                                                        SubLObject _prev_bind_0_$36;
                                                                        SubLObject str_$38;
                                                                        SubLObject pred_$39;
                                                                        SubLObject demerits_$40;
                                                                        SubLObject justifications_$41;
                                                                        SubLObject _prev_bind_0_$37;
                                                                        SubLObject _values4;
                                                                        SubLObject paraphrase_data2;
                                                                        SubLObject new_pph_phrase_count2;
                                                                        SubLObject batch_number2;
                                                                        for (rest = NIL, rest = forts.do_forts_tables(); (NIL == doneP) && (NIL != rest); rest = rest.rest()) {
                                                                            table_var = idx = rest.first();
                                                                            if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                                                                                idx_$31 = idx;
                                                                                if (NIL == id_index_dense_objects_empty_p(idx_$31, $SKIP)) {
                                                                                    vector_var = id_index_dense_objects(idx_$31);
                                                                                    backwardP_var = NIL;
                                                                                    length = length(vector_var);
                                                                                    datum = current = (NIL != backwardP_var) ? list(subtract(length, ONE_INTEGER), MINUS_ONE_INTEGER, MINUS_ONE_INTEGER) : list(ZERO_INTEGER, length, ONE_INTEGER);
                                                                                    start = NIL;
                                                                                    end = NIL;
                                                                                    delta = NIL;
                                                                                    destructuring_bind_must_consp(current, datum, nl_generation_fort_cache.$list96);
                                                                                    start = current.first();
                                                                                    current = current.rest();
                                                                                    destructuring_bind_must_consp(current, datum, nl_generation_fort_cache.$list96);
                                                                                    end = current.first();
                                                                                    current = current.rest();
                                                                                    destructuring_bind_must_consp(current, datum, nl_generation_fort_cache.$list96);
                                                                                    delta = current.first();
                                                                                    current = current.rest();
                                                                                    if (NIL == current) {
                                                                                        if (NIL == doneP) {
                                                                                            for (end_var = end, id = NIL, id = start; (NIL == doneP) && (NIL == subl_macros.do_numbers_endtest(id, delta, end_var)); id = add(id, delta)) {
                                                                                                fort = aref(vector_var, id);
                                                                                                if ((NIL == id_index_tombstone_p(fort)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                                                                                    if (NIL != id_index_tombstone_p(fort)) {
                                                                                                        fort = $SKIP;
                                                                                                    }
                                                                                                    sofar = add(sofar, ONE_INTEGER);
                                                                                                    note_percent_progress(sofar, total);
                                                                                                    i = add(i, ONE_INTEGER);
                                                                                                    _prev_bind_0_$24 = $silent_progressP$.currentBinding(thread);
                                                                                                    try {
                                                                                                        $silent_progressP$.bind(NIL, thread);
                                                                                                        note_percent_progress(subtract(i, start_num), number_utilities.f_1X(subtract(end_num, start_num)));
                                                                                                    } finally {
                                                                                                        $silent_progressP$.rebind(_prev_bind_0_$24, thread);
                                                                                                    }
                                                                                                    if (((!i.numL(start_num)) && (NIL == set.set_memberP(fort, previously_done_forts))) && (NIL == nl_generation_fort_cache.dont_want_to_generate_this_oneP(fort))) {
                                                                                                        max_time = nl_generation_fort_cache.$nl_generation_fort_cache_timeout$.getDynamicValue(thread);
                                                                                                        timed_outP = NIL;
                                                                                                        time = NIL;
                                                                                                        str = NIL;
                                                                                                        pred = NIL;
                                                                                                        justifications = NIL;
                                                                                                        demerits = NIL;
                                                                                                        time_var = get_internal_real_time();
                                                                                                        tag = with_timeout_make_tag();
                                                                                                        try {
                                                                                                            thread.throwStack.push(tag);
                                                                                                            _prev_bind_0_$25 = $within_with_timeout$.currentBinding(thread);
                                                                                                            try {
                                                                                                                $within_with_timeout$.bind(T, thread);
                                                                                                                timer = NIL;
                                                                                                                try {
                                                                                                                    _prev_bind_0_$26 = $with_timeout_nesting_depth$.currentBinding(thread);
                                                                                                                    try {
                                                                                                                        $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                                                                                        timer = with_timeout_start_timer(max_time, tag);
                                                                                                                        thread.resetMultipleValues();
                                                                                                                        str_$35 = nl_generation_fort_cache.paraphrase_fort_for_cache(fort, paraphrase_mt, nl_preds);
                                                                                                                        pred_$36 = thread.secondMultipleValue();
                                                                                                                        demerits_$37 = thread.thirdMultipleValue();
                                                                                                                        justifications_$38 = thread.fourthMultipleValue();
                                                                                                                        thread.resetMultipleValues();
                                                                                                                        str = str_$35;
                                                                                                                        pred = pred_$36;
                                                                                                                        demerits = demerits_$37;
                                                                                                                        justifications = justifications_$38;
                                                                                                                    } finally {
                                                                                                                        $with_timeout_nesting_depth$.rebind(_prev_bind_0_$26, thread);
                                                                                                                    }
                                                                                                                } finally {
                                                                                                                    _prev_bind_0_$27 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                                    try {
                                                                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                        _values = getValuesAsVector();
                                                                                                                        with_timeout_stop_timer(timer);
                                                                                                                        restoreValuesFromVector(_values);
                                                                                                                    } finally {
                                                                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                                                                                                                    }
                                                                                                                }
                                                                                                            } finally {
                                                                                                                $within_with_timeout$.rebind(_prev_bind_0_$25, thread);
                                                                                                            }
                                                                                                        } catch (final Throwable ccatch_env_var) {
                                                                                                            timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
                                                                                                        } finally {
                                                                                                            thread.throwStack.pop();
                                                                                                        }
                                                                                                        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                                                                                                        if ((NIL != timed_outP) && (NIL != nl_generation_fort_cache.$nl_generation_fort_cache_retry_on_timeoutP$.getDynamicValue(thread))) {
                                                                                                            Errors.warn(nl_generation_fort_cache.$str97$Timed_out_on_first_try_after__A_g, numeric_date_utilities.readable_elapsed_time_string(max_time, UNPROVIDED), fort);
                                                                                                            time_var = get_internal_real_time();
                                                                                                            tag = with_timeout_make_tag();
                                                                                                            try {
                                                                                                                thread.throwStack.push(tag);
                                                                                                                _prev_bind_0_$28 = $within_with_timeout$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    $within_with_timeout$.bind(T, thread);
                                                                                                                    timer = NIL;
                                                                                                                    try {
                                                                                                                        _prev_bind_0_$29 = $with_timeout_nesting_depth$.currentBinding(thread);
                                                                                                                        try {
                                                                                                                            $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                                                                                            timer = with_timeout_start_timer(max_time, tag);
                                                                                                                            thread.resetMultipleValues();
                                                                                                                            str_$36 = nl_generation_fort_cache.paraphrase_fort_for_cache(fort, paraphrase_mt, nl_preds);
                                                                                                                            pred_$37 = thread.secondMultipleValue();
                                                                                                                            demerits_$38 = thread.thirdMultipleValue();
                                                                                                                            justifications_$39 = thread.fourthMultipleValue();
                                                                                                                            thread.resetMultipleValues();
                                                                                                                            str = str_$36;
                                                                                                                            pred = pred_$37;
                                                                                                                            demerits = demerits_$38;
                                                                                                                            justifications = justifications_$39;
                                                                                                                        } finally {
                                                                                                                            $with_timeout_nesting_depth$.rebind(_prev_bind_0_$29, thread);
                                                                                                                        }
                                                                                                                    } finally {
                                                                                                                        _prev_bind_0_$30 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                                        try {
                                                                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                            _values2 = getValuesAsVector();
                                                                                                                            with_timeout_stop_timer(timer);
                                                                                                                            restoreValuesFromVector(_values2);
                                                                                                                        } finally {
                                                                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                                                                                                                        }
                                                                                                                    }
                                                                                                                } finally {
                                                                                                                    $within_with_timeout$.rebind(_prev_bind_0_$28, thread);
                                                                                                                }
                                                                                                            } catch (final Throwable ccatch_env_var) {
                                                                                                                timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
                                                                                                            } finally {
                                                                                                                thread.throwStack.pop();
                                                                                                            }
                                                                                                            time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                                                                                                        }
                                                                                                        batch_times = cons(time, batch_times);
                                                                                                        if (NIL != timed_outP) {
                                                                                                            funcall(NIL != nl_generation_fort_cache.$nl_generation_fort_cache_break_on_timeoutP$.getDynamicValue(thread) ? nl_generation_fort_cache.BREAK : WARN, nl_generation_fort_cache.$str100$Timed_out_after__A_generating_par, numeric_date_utilities.readable_elapsed_time_string(max_time, UNPROVIDED), fort);
                                                                                                            batch_failed_forts = cons(fort, batch_failed_forts);
                                                                                                        } else
                                                                                                            if (NIL == cycl_string.cycl_string_p(str)) {
                                                                                                                Errors.warn(nl_generation_fort_cache.$str101$Failed_to_generate_a_string_for__, fort);
                                                                                                                batch_failed_forts = cons(fort, batch_failed_forts);
                                                                                                            } else
                                                                                                                if (NIL != cycl_string.cycl_string_equal(str, nl_generation_fort_cache.$str94$)) {
                                                                                                                    Errors.warn(nl_generation_fort_cache.$str102$Generated_empty_string_for__S, fort);
                                                                                                                    batch_failed_forts = cons(fort, batch_failed_forts);
                                                                                                                } else {
                                                                                                                    paraphrase_data = list(str, pred, demerits, justifications);
                                                                                                                    cfasl_output_externalized(fort, results_stream);
                                                                                                                    cfasl_output_externalized(paraphrase_data, results_stream);
                                                                                                                    cfasl_output(fort, fast_results_stream);
                                                                                                                    cfasl_output(paraphrase_data, fast_results_stream);
                                                                                                                    new_pph_phrase_count = pph_data_structures.pph_phrase_count();
                                                                                                                    if (subtract(new_pph_phrase_count, pph_phrase_count).numG(TEN_INTEGER)) {
                                                                                                                        Errors.warn(nl_generation_fort_cache.$str103$PPH_phrase_count_grew_from__D_to_, pph_phrase_count, new_pph_phrase_count, fort);
                                                                                                                        pph_phrase_count = new_pph_phrase_count;
                                                                                                                    }
                                                                                                                }


                                                                                                    }
                                                                                                    if (mod(i, batch_size).isZero() && (NIL != list_utilities.non_empty_list_p(batch_times))) {
                                                                                                        nl_generation_fort_cache.trim_pph_memoization_state_caches(UNPROVIDED);
                                                                                                        batch_number = integerDivide(i, batch_size);
                                                                                                        nl_generation_fort_cache.$nl_generation_fort_cache_failed_fort_counts$.setDynamicValue(list_utilities.add_to_end(list(batch_number, length(batch_failed_forts)), nl_generation_fort_cache.$nl_generation_fort_cache_failed_fort_counts$.getDynamicValue(thread)), thread);
                                                                                                        batch_failed_forts = NIL;
                                                                                                        nl_generation_fort_cache.print_nl_generation_cache_times(i, batch_size, batch_start_time, batch_start_cpu_time, batch_times, my_task_directory, log_stream);
                                                                                                        batch_start_time = get_universal_time();
                                                                                                        batch_times = NIL;
                                                                                                    }
                                                                                                    if (i.numGE(end_num)) {
                                                                                                        doneP = T;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        cdestructuring_bind_error(datum, nl_generation_fort_cache.$list96);
                                                                                    }
                                                                                }
                                                                                idx_$32 = idx;
                                                                                if ((NIL == id_index_sparse_objects_empty_p(idx_$32)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                                                                    sparse = id_index_sparse_objects(idx_$32);
                                                                                    id2 = id_index_sparse_id_threshold(idx_$32);
                                                                                    end_id = id_index_next_id(idx_$32);
                                                                                    v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                                                                    while (id2.numL(end_id) && (NIL == doneP)) {
                                                                                        fort2 = gethash_without_values(id2, sparse, v_default);
                                                                                        if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(fort2))) {
                                                                                            sofar = add(sofar, ONE_INTEGER);
                                                                                            note_percent_progress(sofar, total);
                                                                                            i = add(i, ONE_INTEGER);
                                                                                            _prev_bind_0_$31 = $silent_progressP$.currentBinding(thread);
                                                                                            try {
                                                                                                $silent_progressP$.bind(NIL, thread);
                                                                                                note_percent_progress(subtract(i, start_num), number_utilities.f_1X(subtract(end_num, start_num)));
                                                                                            } finally {
                                                                                                $silent_progressP$.rebind(_prev_bind_0_$31, thread);
                                                                                            }
                                                                                            if (((!i.numL(start_num)) && (NIL == set.set_memberP(fort2, previously_done_forts))) && (NIL == nl_generation_fort_cache.dont_want_to_generate_this_oneP(fort2))) {
                                                                                                max_time2 = nl_generation_fort_cache.$nl_generation_fort_cache_timeout$.getDynamicValue(thread);
                                                                                                timed_outP2 = NIL;
                                                                                                time2 = NIL;
                                                                                                str2 = NIL;
                                                                                                pred2 = NIL;
                                                                                                justifications2 = NIL;
                                                                                                demerits2 = NIL;
                                                                                                time_var2 = get_internal_real_time();
                                                                                                tag2 = with_timeout_make_tag();
                                                                                                try {
                                                                                                    thread.throwStack.push(tag2);
                                                                                                    _prev_bind_0_$32 = $within_with_timeout$.currentBinding(thread);
                                                                                                    try {
                                                                                                        $within_with_timeout$.bind(T, thread);
                                                                                                        timer2 = NIL;
                                                                                                        try {
                                                                                                            _prev_bind_0_$33 = $with_timeout_nesting_depth$.currentBinding(thread);
                                                                                                            try {
                                                                                                                $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                                                                                timer2 = with_timeout_start_timer(max_time2, tag2);
                                                                                                                thread.resetMultipleValues();
                                                                                                                str_$37 = nl_generation_fort_cache.paraphrase_fort_for_cache(fort2, paraphrase_mt, nl_preds);
                                                                                                                pred_$38 = thread.secondMultipleValue();
                                                                                                                demerits_$39 = thread.thirdMultipleValue();
                                                                                                                justifications_$40 = thread.fourthMultipleValue();
                                                                                                                thread.resetMultipleValues();
                                                                                                                str2 = str_$37;
                                                                                                                pred2 = pred_$38;
                                                                                                                demerits2 = demerits_$39;
                                                                                                                justifications2 = justifications_$40;
                                                                                                            } finally {
                                                                                                                $with_timeout_nesting_depth$.rebind(_prev_bind_0_$33, thread);
                                                                                                            }
                                                                                                        } finally {
                                                                                                            _prev_bind_0_$34 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                            try {
                                                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                _values3 = getValuesAsVector();
                                                                                                                with_timeout_stop_timer(timer2);
                                                                                                                restoreValuesFromVector(_values3);
                                                                                                            } finally {
                                                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                                                                                                            }
                                                                                                        }
                                                                                                    } finally {
                                                                                                        $within_with_timeout$.rebind(_prev_bind_0_$32, thread);
                                                                                                    }
                                                                                                } catch (final Throwable ccatch_env_var2) {
                                                                                                    timed_outP2 = Errors.handleThrowable(ccatch_env_var2, tag2);
                                                                                                } finally {
                                                                                                    thread.throwStack.pop();
                                                                                                }
                                                                                                time2 = divide(subtract(get_internal_real_time(), time_var2), time_high.$internal_time_units_per_second$.getGlobalValue());
                                                                                                if ((NIL != timed_outP2) && (NIL != nl_generation_fort_cache.$nl_generation_fort_cache_retry_on_timeoutP$.getDynamicValue(thread))) {
                                                                                                    Errors.warn(nl_generation_fort_cache.$str97$Timed_out_on_first_try_after__A_g, numeric_date_utilities.readable_elapsed_time_string(max_time2, UNPROVIDED), fort2);
                                                                                                    time_var2 = get_internal_real_time();
                                                                                                    tag2 = with_timeout_make_tag();
                                                                                                    try {
                                                                                                        thread.throwStack.push(tag2);
                                                                                                        _prev_bind_0_$35 = $within_with_timeout$.currentBinding(thread);
                                                                                                        try {
                                                                                                            $within_with_timeout$.bind(T, thread);
                                                                                                            timer2 = NIL;
                                                                                                            try {
                                                                                                                _prev_bind_0_$36 = $with_timeout_nesting_depth$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                                                                                    timer2 = with_timeout_start_timer(max_time2, tag2);
                                                                                                                    thread.resetMultipleValues();
                                                                                                                    str_$38 = nl_generation_fort_cache.paraphrase_fort_for_cache(fort2, paraphrase_mt, nl_preds);
                                                                                                                    pred_$39 = thread.secondMultipleValue();
                                                                                                                    demerits_$40 = thread.thirdMultipleValue();
                                                                                                                    justifications_$41 = thread.fourthMultipleValue();
                                                                                                                    thread.resetMultipleValues();
                                                                                                                    str2 = str_$38;
                                                                                                                    pred2 = pred_$39;
                                                                                                                    demerits2 = demerits_$40;
                                                                                                                    justifications2 = justifications_$41;
                                                                                                                } finally {
                                                                                                                    $with_timeout_nesting_depth$.rebind(_prev_bind_0_$36, thread);
                                                                                                                }
                                                                                                            } finally {
                                                                                                                _prev_bind_0_$37 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                    _values4 = getValuesAsVector();
                                                                                                                    with_timeout_stop_timer(timer2);
                                                                                                                    restoreValuesFromVector(_values4);
                                                                                                                } finally {
                                                                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
                                                                                                                }
                                                                                                            }
                                                                                                        } finally {
                                                                                                            $within_with_timeout$.rebind(_prev_bind_0_$35, thread);
                                                                                                        }
                                                                                                    } catch (final Throwable ccatch_env_var2) {
                                                                                                        timed_outP2 = Errors.handleThrowable(ccatch_env_var2, tag2);
                                                                                                    } finally {
                                                                                                        thread.throwStack.pop();
                                                                                                    }
                                                                                                    time2 = divide(subtract(get_internal_real_time(), time_var2), time_high.$internal_time_units_per_second$.getGlobalValue());
                                                                                                }
                                                                                                batch_times = cons(time2, batch_times);
                                                                                                if (NIL != timed_outP2) {
                                                                                                    funcall(NIL != nl_generation_fort_cache.$nl_generation_fort_cache_break_on_timeoutP$.getDynamicValue(thread) ? nl_generation_fort_cache.BREAK : WARN, nl_generation_fort_cache.$str100$Timed_out_after__A_generating_par, numeric_date_utilities.readable_elapsed_time_string(max_time2, UNPROVIDED), fort2);
                                                                                                    batch_failed_forts = cons(fort2, batch_failed_forts);
                                                                                                } else
                                                                                                    if (NIL == cycl_string.cycl_string_p(str2)) {
                                                                                                        Errors.warn(nl_generation_fort_cache.$str101$Failed_to_generate_a_string_for__, fort2);
                                                                                                        batch_failed_forts = cons(fort2, batch_failed_forts);
                                                                                                    } else
                                                                                                        if (NIL != cycl_string.cycl_string_equal(str2, nl_generation_fort_cache.$str94$)) {
                                                                                                            Errors.warn(nl_generation_fort_cache.$str102$Generated_empty_string_for__S, fort2);
                                                                                                            batch_failed_forts = cons(fort2, batch_failed_forts);
                                                                                                        } else {
                                                                                                            paraphrase_data2 = list(str2, pred2, demerits2, justifications2);
                                                                                                            cfasl_output_externalized(fort2, results_stream);
                                                                                                            cfasl_output_externalized(paraphrase_data2, results_stream);
                                                                                                            cfasl_output(fort2, fast_results_stream);
                                                                                                            cfasl_output(paraphrase_data2, fast_results_stream);
                                                                                                            new_pph_phrase_count2 = pph_data_structures.pph_phrase_count();
                                                                                                            if (subtract(new_pph_phrase_count2, pph_phrase_count).numG(TEN_INTEGER)) {
                                                                                                                Errors.warn(nl_generation_fort_cache.$str103$PPH_phrase_count_grew_from__D_to_, pph_phrase_count, new_pph_phrase_count2, fort2);
                                                                                                                pph_phrase_count = new_pph_phrase_count2;
                                                                                                            }
                                                                                                        }


                                                                                            }
                                                                                            if (mod(i, batch_size).isZero() && (NIL != list_utilities.non_empty_list_p(batch_times))) {
                                                                                                nl_generation_fort_cache.trim_pph_memoization_state_caches(UNPROVIDED);
                                                                                                batch_number2 = integerDivide(i, batch_size);
                                                                                                nl_generation_fort_cache.$nl_generation_fort_cache_failed_fort_counts$.setDynamicValue(list_utilities.add_to_end(list(batch_number2, length(batch_failed_forts)), nl_generation_fort_cache.$nl_generation_fort_cache_failed_fort_counts$.getDynamicValue(thread)), thread);
                                                                                                batch_failed_forts = NIL;
                                                                                                nl_generation_fort_cache.print_nl_generation_cache_times(i, batch_size, batch_start_time, batch_start_cpu_time, batch_times, my_task_directory, log_stream);
                                                                                                batch_start_time = get_universal_time();
                                                                                                batch_times = NIL;
                                                                                            }
                                                                                            if (i.numGE(end_num)) {
                                                                                                doneP = T;
                                                                                            }
                                                                                        }
                                                                                        id2 = add(id2, ONE_INTEGER);
                                                                                    } 
                                                                                }
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        final SubLObject _prev_bind_0_$38 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            final SubLObject _values5 = getValuesAsVector();
                                                                            noting_percent_progress_postamble();
                                                                            restoreValuesFromVector(_values5);
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$38, thread);
                                                                        }
                                                                    }
                                                                } finally {
                                                                    $percent_progress_start_time$.rebind(_prev_bind_3_$26, thread);
                                                                    $within_noting_percent_progress$.rebind(_prev_bind_2_$25, thread);
                                                                    $last_percent_progress_prediction$.rebind(_prev_bind_1_$24, thread);
                                                                    $last_percent_progress_index$.rebind(_prev_bind_0_$23, thread);
                                                                }
                                                            } finally {
                                                                $silent_progressP$.rebind(_prev_bind_0_$22, thread);
                                                            }
                                                        } finally {
                                                            final SubLObject _prev_bind_0_$39 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                final SubLObject _values6 = getValuesAsVector();
                                                                noting_percent_progress_postamble();
                                                                restoreValuesFromVector(_values6);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$39, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        $percent_progress_start_time$.rebind(_prev_bind_3_$25, thread);
                                                        $within_noting_percent_progress$.rebind(_prev_bind_2_$24, thread);
                                                        $last_percent_progress_prediction$.rebind(_prev_bind_1_$23, thread);
                                                        $last_percent_progress_index$.rebind(_prev_bind_0_$21, thread);
                                                    }
                                                    if (NIL != doneP) {
                                                        file_utilities.write_text_file(cconcatenate(my_task_directory, nl_generation_fort_cache.$$$done), NIL);
                                                    }
                                                } finally {
                                                    final SubLObject _prev_bind_0_$40 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        final SubLObject _values7 = getValuesAsVector();
                                                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                                        restoreValuesFromVector(_values7);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$40, thread);
                                                    }
                                                }
                                            } finally {
                                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$20, thread);
                                            }
                                        } finally {
                                            pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$19, thread);
                                        }
                                        if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                        }
                                    } finally {
                                        pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$18, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$41 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values8 = getValuesAsVector();
                                        if (NIL == reuseP) {
                                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                        }
                                        restoreValuesFromVector(_values8);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$41, thread);
                                    }
                                }
                            } finally {
                                pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$17, thread);
                            }
                        } finally {
                            pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0_$16, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$42 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values9 = getValuesAsVector();
                            if (stream_$14.isStream()) {
                                close(stream_$14, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values9);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$42, thread);
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$43 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values10 = getValuesAsVector();
                        if (stream_$13.isStream()) {
                            close(stream_$13, UNPROVIDED);
                        }
                        restoreValuesFromVector(_values10);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$43, thread);
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$44 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values11 = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values11);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$44, thread);
                }
            }
        } finally {
            pph_vars.$bypass_pph_phrase_destroyerP$.rebind(_prev_bind_7, thread);
            nl_generation_fort_cache.$nl_generation_fort_cache_gc_times$.rebind(_prev_bind_6, thread);
            nl_generation_fort_cache.$nl_generation_fort_cache_failed_fort_counts$.rebind(_prev_bind_5, thread);
            nl_generation_fort_cache.$nl_generation_fort_cache_swap_times$.rebind(_prev_bind_4, thread);
            nl_generation_fort_cache.$nl_generation_fort_cache_cpu_times$.rebind(_prev_bind_3, thread);
            nl_generation_fort_cache.$nl_generation_fort_cache_total_times$.rebind(_prev_bind_2, thread);
            nl_generation_fort_cache.$nl_generation_fort_cache_median_times$.rebind(_prev_bind_0, thread);
        }
        return my_task_directory;
    }

    /**
     * Verify that the cached paraphrase for a random selection of constants and NARTs matches what the
     * system would currently generate.
     */
    @LispMethod(comment = "Verify that the cached paraphrase for a random selection of constants and NARTs matches what the\r\nsystem would currently generate.\nVerify that the cached paraphrase for a random selection of constants and NARTs matches what the\nsystem would currently generate.")
    public static final SubLObject verify_cached_paraphrases_alt(SubLObject number_of_constants_to_check, SubLObject number_of_narts_to_check) {
        if (number_of_constants_to_check == UNPROVIDED) {
            number_of_constants_to_check = $int$500;
        }
        if (number_of_narts_to_check == UNPROVIDED) {
            number_of_narts_to_check = $int$500;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject constant_verified_count = ZERO_INTEGER;
                SubLObject nart_verified_count = ZERO_INTEGER;
                $progress_note$.setDynamicValue(cconcatenate($str_alt100$Verifying_, new SubLObject[]{ format_nil.format_nil_d_no_copy(number_of_constants_to_check), $str_alt101$_constants___ }), thread);
                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                $progress_total$.setDynamicValue(number_of_constants_to_check, thread);
                $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        {
                            SubLObject i = NIL;
                            for (i = ZERO_INTEGER; i.numL($progress_total$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                {
                                    SubLObject constant = constants_high.random_constant(UNPROVIDED);
                                    if (NIL != com.cyc.cycjava.cycl.nl_generation_fort_cache.verify_cached_paraphrase(constant)) {
                                        constant_verified_count = add(constant_verified_count, ONE_INTEGER);
                                    } else {
                                        Errors.warn($str_alt102$_S____Cached___S___Generated___S_, constant, arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.nl_generation_fort_cache.nl_generation_cache_lookup(constant, UNPROVIDED, UNPROVIDED))), arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.nl_generation_fort_cache.paraphrase_fort_for_cache(constant, UNPROVIDED, UNPROVIDED))));
                                    }
                                }
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                $progress_note$.setDynamicValue(cconcatenate($str_alt100$Verifying_, new SubLObject[]{ format_nil.format_nil_d_no_copy(number_of_narts_to_check), $str_alt103$_NARTs___ }), thread);
                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                $progress_total$.setDynamicValue(number_of_narts_to_check, thread);
                $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        {
                            SubLObject i = NIL;
                            for (i = ZERO_INTEGER; i.numL($progress_total$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                {
                                    SubLObject nart = narts_high.random_nart(UNPROVIDED);
                                    if (NIL != com.cyc.cycjava.cycl.nl_generation_fort_cache.verify_cached_paraphrase(nart)) {
                                        nart_verified_count = add(nart_verified_count, ONE_INTEGER);
                                    } else {
                                        Errors.warn($str_alt102$_S____Cached___S___Generated___S_, nart, arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.nl_generation_fort_cache.nl_generation_cache_lookup(nart, UNPROVIDED, UNPROVIDED))), arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.nl_generation_fort_cache.paraphrase_fort_for_cache(nart, UNPROVIDED, UNPROVIDED))));
                                    }
                                }
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                format(T, $str_alt104$_D_of__D_constants_verified___F__, new SubLObject[]{ constant_verified_count, number_of_constants_to_check, number_utilities.percent(constant_verified_count, number_of_constants_to_check, THREE_INTEGER) });
                format(T, $str_alt105$_D_of__D_narts_verified___F____, new SubLObject[]{ nart_verified_count, number_of_narts_to_check, number_utilities.percent(nart_verified_count, number_of_narts_to_check, THREE_INTEGER) });
                return makeBoolean(number_of_constants_to_check.eql(constant_verified_count) && number_of_narts_to_check.eql(nart_verified_count));
            }
        }
    }

    /**
     * Verify that the cached paraphrase for a random selection of constants and NARTs matches what the
     * system would currently generate.
     */
    @LispMethod(comment = "Verify that the cached paraphrase for a random selection of constants and NARTs matches what the\r\nsystem would currently generate.\nVerify that the cached paraphrase for a random selection of constants and NARTs matches what the\nsystem would currently generate.")
    public static SubLObject verify_cached_paraphrases(SubLObject number_of_constants_to_check, SubLObject number_of_narts_to_check) {
        if (number_of_constants_to_check == UNPROVIDED) {
            number_of_constants_to_check = nl_generation_fort_cache.$int$500;
        }
        if (number_of_narts_to_check == UNPROVIDED) {
            number_of_narts_to_check = nl_generation_fort_cache.$int$500;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject constant_verified_count = ZERO_INTEGER;
        SubLObject nart_verified_count = ZERO_INTEGER;
        SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind(cconcatenate(nl_generation_fort_cache.$$$Verifying_, new SubLObject[]{ format_nil.format_nil_d_no_copy(number_of_constants_to_check), nl_generation_fort_cache.$str107$_constants___ }), thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(number_of_constants_to_check, thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject i;
                SubLObject constant;
                for (i = NIL, i = ZERO_INTEGER; i.numL($progress_total$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
                    constant = constants_high.random_constant(UNPROVIDED);
                    if (NIL != nl_generation_fort_cache.verify_cached_paraphrase(constant)) {
                        constant_verified_count = add(constant_verified_count, ONE_INTEGER);
                    } else {
                        Errors.warn(nl_generation_fort_cache.$str108$_S____Cached___S___Generated___S_, constant, arg2(thread.resetMultipleValues(), multiple_value_list(nl_generation_fort_cache.nl_generation_cache_lookup(constant, UNPROVIDED, UNPROVIDED))), arg2(thread.resetMultipleValues(), multiple_value_list(nl_generation_fort_cache.paraphrase_fort_for_cache(constant, UNPROVIDED, UNPROVIDED))));
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                }
            } finally {
                final SubLObject _prev_bind_0_$70 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$70, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        _prev_bind_0 = $progress_note$.currentBinding(thread);
        _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        _prev_bind_3 = $progress_total$.currentBinding(thread);
        _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind(cconcatenate(nl_generation_fort_cache.$$$Verifying_, new SubLObject[]{ format_nil.format_nil_d_no_copy(number_of_narts_to_check), nl_generation_fort_cache.$str109$_NARTs___ }), thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(number_of_narts_to_check, thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject i;
                SubLObject nart;
                for (i = NIL, i = ZERO_INTEGER; i.numL($progress_total$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
                    nart = narts_high.random_nart(UNPROVIDED);
                    if (NIL != nl_generation_fort_cache.verify_cached_paraphrase(nart)) {
                        nart_verified_count = add(nart_verified_count, ONE_INTEGER);
                    } else {
                        Errors.warn(nl_generation_fort_cache.$str108$_S____Cached___S___Generated___S_, nart, arg2(thread.resetMultipleValues(), multiple_value_list(nl_generation_fort_cache.nl_generation_cache_lookup(nart, UNPROVIDED, UNPROVIDED))), arg2(thread.resetMultipleValues(), multiple_value_list(nl_generation_fort_cache.paraphrase_fort_for_cache(nart, UNPROVIDED, UNPROVIDED))));
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                }
            } finally {
                final SubLObject _prev_bind_0_$71 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$71, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        format(T, nl_generation_fort_cache.$str110$_D_of__D_constants_verified___F__, new SubLObject[]{ constant_verified_count, number_of_constants_to_check, number_utilities.percent(constant_verified_count, number_of_constants_to_check, THREE_INTEGER) });
        format(T, nl_generation_fort_cache.$str111$_D_of__D_narts_verified___F____, new SubLObject[]{ nart_verified_count, number_of_narts_to_check, number_utilities.percent(nart_verified_count, number_of_narts_to_check, THREE_INTEGER) });
        return makeBoolean(number_of_constants_to_check.eql(constant_verified_count) && number_of_narts_to_check.eql(nart_verified_count));
    }

    public static final SubLObject verify_cached_paraphrase_alt(SubLObject fort) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.nl_generation_fort_cache.dont_want_to_generate_this_oneP(fort)) || arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.nl_generation_fort_cache.paraphrase_fort_for_cache(fort, UNPROVIDED, UNPROVIDED))).equal(arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.nl_generation_fort_cache.nl_generation_cache_lookup(fort, UNPROVIDED, UNPROVIDED)))));
    }

    public static SubLObject verify_cached_paraphrase(final SubLObject fort) {
        return makeBoolean((NIL != nl_generation_fort_cache.dont_want_to_generate_this_oneP(fort)) || arg2(resetMultipleValues(), multiple_value_list(nl_generation_fort_cache.paraphrase_fort_for_cache(fort, UNPROVIDED, UNPROVIDED))).equal(arg2(resetMultipleValues(), multiple_value_list(nl_generation_fort_cache.nl_generation_cache_lookup(fort, UNPROVIDED, UNPROVIDED)))));
    }

    public static final SubLObject nl_generation_fort_cache_data_generatedP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject start_num = ONE_INTEGER;
                SubLObject first_nonfinished_directory = NIL;
                SubLObject working_directory = $nl_generation_fort_cache_working_directory$.getDynamicValue(thread);
                SubLObject fort_count = cfasl_utilities.cfasl_load(cconcatenate(working_directory, $str_alt36$fort_count_cfasl));
                SubLObject assignment_size = cfasl_utilities.cfasl_load(cconcatenate(working_directory, $str_alt56$assignment_size_cfasl));
                SubLObject doneP = NIL;
                while (NIL == doneP) {
                    thread.resetMultipleValues();
                    {
                        SubLObject subdirectory = com.cyc.cycjava.cycl.nl_generation_fort_cache.nl_generation_fort_cache_subdirectory(working_directory, start_num, fort_count, assignment_size);
                        SubLObject last_oneP = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject missingP = makeBoolean(NIL == Filesys.directory_p(subdirectory));
                            if (NIL != missingP) {
                                first_nonfinished_directory = subdirectory;
                                format(T, $str_alt106$__First_non_finished__missing__di, subdirectory);
                                doneP = T;
                            } else {
                                if (NIL != Filesys.probe_file(cconcatenate(subdirectory, $$$done))) {
                                } else {
                                    if (NIL != com.cyc.cycjava.cycl.nl_generation_fort_cache.nl_fort_generation_task_failedP(list(subdirectory))) {
                                        format(T, $str_alt107$__First_non_finished__failed__dir, subdirectory);
                                        first_nonfinished_directory = subdirectory;
                                        doneP = T;
                                    }
                                }
                            }
                        }
                        if (NIL != last_oneP) {
                            doneP = T;
                        }
                    }
                    if (NIL == doneP) {
                        start_num = add(start_num, assignment_size);
                    }
                } 
                return sublisp_null(first_nonfinished_directory);
            }
        }
    }

    public static SubLObject nl_generation_fort_cache_data_generatedP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject start_num = ONE_INTEGER;
        SubLObject first_nonfinished_directory = NIL;
        final SubLObject working_directory = nl_generation_fort_cache.$nl_generation_fort_cache_working_directory$.getDynamicValue(thread);
        final SubLObject fort_count = cfasl_utilities.cfasl_load(cconcatenate(working_directory, nl_generation_fort_cache.$str35$fort_count_cfasl));
        final SubLObject assignment_size = cfasl_utilities.cfasl_load(cconcatenate(working_directory, nl_generation_fort_cache.$str60$assignment_size_cfasl));
        SubLObject doneP = NIL;
        while (NIL == doneP) {
            thread.resetMultipleValues();
            final SubLObject subdirectory = nl_generation_fort_cache.nl_generation_fort_cache_subdirectory(working_directory, start_num, fort_count, assignment_size);
            final SubLObject last_oneP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject missingP = makeBoolean(NIL == Filesys.directory_p(subdirectory));
            if (NIL != missingP) {
                first_nonfinished_directory = subdirectory;
                format(T, nl_generation_fort_cache.$str112$__First_non_finished__missing__di, subdirectory);
                doneP = T;
            } else
                if (NIL == Filesys.probe_file(cconcatenate(subdirectory, nl_generation_fort_cache.$$$done))) {
                    if (NIL != nl_generation_fort_cache.nl_fort_generation_task_failedP(list(subdirectory))) {
                        format(T, nl_generation_fort_cache.$str113$__First_non_finished__failed__dir, subdirectory);
                        first_nonfinished_directory = subdirectory;
                        doneP = T;
                    }
                }

            if (NIL != last_oneP) {
                doneP = T;
            }
            if (NIL == doneP) {
                start_num = add(start_num, assignment_size);
            }
        } 
        return sublisp_null(first_nonfinished_directory);
    }

    public static final SubLObject trim_pph_memoization_state_caches_alt(SubLObject cutoff) {
        if (cutoff == UNPROVIDED) {
            cutoff = $int$128;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != dictionary.dictionary_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread))) {
                {
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(pph_macros.$pph_memoization_state$.getDynamicValue(thread)));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject function_spec = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject v_cache = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if ((NIL != dictionary.dictionary_p(v_cache)) && dictionary.dictionary_length(v_cache).numG(cutoff)) {
                                Errors.warn($str_alt109$Clearing_PPH_memoization_for__S, function_spec);
                                dictionary.clear_dictionary(v_cache);
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
            } else {
                if (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread))) {
                }
            }
            return pph_macros.$pph_memoization_state$.getDynamicValue(thread);
        }
    }

    public static SubLObject trim_pph_memoization_state_caches(SubLObject cutoff) {
        if (cutoff == UNPROVIDED) {
            cutoff = nl_generation_fort_cache.$int$128;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != dictionary.dictionary_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread))) {
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(pph_macros.$pph_memoization_state$.getDynamicValue(thread))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject function_spec = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject v_cache = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if ((NIL != dictionary.dictionary_p(v_cache)) && dictionary.dictionary_length(v_cache).numG(cutoff)) {
                    Errors.warn(nl_generation_fort_cache.$str115$Clearing_PPH_memoization_for__S, function_spec);
                    dictionary.clear_dictionary(v_cache);
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        } else
            if (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread))) {
            }

        return pph_macros.$pph_memoization_state$.getDynamicValue(thread);
    }

    public static final SubLObject print_nl_generation_cache_times_alt(SubLObject i, SubLObject batch_size, SubLObject batch_start_time, SubLObject batch_start_cpu_time, SubLObject batch_times, SubLObject working_directory, SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject batch_number = integerDivide(i, batch_size);
                SubLObject total_real_time = subtract(get_universal_time(), batch_start_time);
                format(stream, $str_alt110$__Paraphrased_batch___D_of__S_FOR, new SubLObject[]{ batch_number, batch_size, numeric_date_utilities.readable_elapsed_time_string(total_real_time, ZERO_INTEGER) });
                {
                    SubLObject total_time = apply(symbol_function($sym111$_), batch_times);
                    format(stream, $str_alt112$__Total_paraphrase_time___S__, total_time);
                    $nl_generation_fort_cache_total_times$.setDynamicValue(list_utilities.add_to_end(list(batch_number, total_time), $nl_generation_fort_cache_total_times$.getDynamicValue(thread)), thread);
                }
                {
                    SubLObject median_time = number_utilities.median(batch_times, UNPROVIDED);
                    format(stream, $str_alt113$__Median_paraphrase_time___S__, median_time);
                    $nl_generation_fort_cache_median_times$.setDynamicValue(list_utilities.add_to_end(list(batch_number, median_time), $nl_generation_fort_cache_median_times$.getDynamicValue(thread)), thread);
                }
                {
                    SubLObject enoughP = NIL;
                    if (NIL == enoughP) {
                        {
                            SubLObject n = NIL;
                            for (n = ONE_INTEGER; NIL == enoughP; n = number_utilities.f_1X(n)) {
                                if (batch_size.numGE(divide(expt(TEN_INTEGER, n), TWO_INTEGER))) {
                                    {
                                        SubLObject ile = subtract(ONE_INTEGER, expt(TEN_INTEGER, minus(n)));
                                        format(stream, $str_alt114$___Sth_percentile_paraphrase_time, multiply(ile, $int$100), number_utilities.percentile(batch_times, ile, UNPROVIDED));
                                    }
                                } else {
                                    enoughP = T;
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject elapsed_cpu_time = pph_diagnostics.image_elapsed_cpu_time();
                    if (NIL != elapsed_cpu_time) {
                        {
                            SubLObject cpu_time = subtract(elapsed_cpu_time, batch_start_cpu_time);
                            format(stream, $str_alt115$___CPU_time___A__, numeric_date_utilities.readable_elapsed_time_string(cpu_time, ZERO_INTEGER));
                            $nl_generation_fort_cache_cpu_times$.setDynamicValue(list_utilities.add_to_end(list(batch_number, cpu_time), $nl_generation_fort_cache_cpu_times$.getDynamicValue(thread)), thread);
                        }
                    }
                }
                {
                    SubLObject total_swap_seconds = assertion_manager.current_assertion_content_swap_time();
                    format(stream, $str_alt116$____SWAP_time___A___, numeric_date_utilities.readable_elapsed_time_string(total_swap_seconds, UNPROVIDED));
                    $nl_generation_fort_cache_swap_times$.setDynamicValue(list_utilities.add_to_end(list(batch_number, total_swap_seconds), $nl_generation_fort_cache_swap_times$.getDynamicValue(thread)), thread);
                }
                assertion_manager.clear_assertion_content_swap_time();
            }
            if (NIL != $nl_generation_fort_cache_generate_plotsP$.getDynamicValue(thread)) {
                com.cyc.cycjava.cycl.nl_generation_fort_cache.generate_nl_generation_cache_time_plots(batch_size, working_directory);
            }
            force_output(stream);
            return NIL;
        }
    }

    public static SubLObject print_nl_generation_cache_times(final SubLObject i, final SubLObject batch_size, final SubLObject batch_start_time, final SubLObject batch_start_cpu_time, final SubLObject batch_times, final SubLObject working_directory, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject batch_number = integerDivide(i, batch_size);
        final SubLObject total_real_time = subtract(get_universal_time(), batch_start_time);
        format(stream, nl_generation_fort_cache.$str116$__Paraphrased_batch___D_of__S_FOR, new SubLObject[]{ batch_number, batch_size, numeric_date_utilities.readable_elapsed_time_string(total_real_time, ZERO_INTEGER) });
        final SubLObject total_time = apply(symbol_function(nl_generation_fort_cache.$sym117$_), batch_times);
        format(stream, nl_generation_fort_cache.$str118$__Total_paraphrase_time___S__, total_time);
        nl_generation_fort_cache.$nl_generation_fort_cache_total_times$.setDynamicValue(list_utilities.add_to_end(list(batch_number, total_time), nl_generation_fort_cache.$nl_generation_fort_cache_total_times$.getDynamicValue(thread)), thread);
        final SubLObject median_time = number_utilities.median(batch_times, UNPROVIDED, UNPROVIDED);
        format(stream, nl_generation_fort_cache.$str119$__Median_paraphrase_time___S__, median_time);
        nl_generation_fort_cache.$nl_generation_fort_cache_median_times$.setDynamicValue(list_utilities.add_to_end(list(batch_number, median_time), nl_generation_fort_cache.$nl_generation_fort_cache_median_times$.getDynamicValue(thread)), thread);
        SubLObject enoughP = NIL;
        if (NIL == enoughP) {
            SubLObject n = NIL;
            n = ONE_INTEGER;
            while (NIL == enoughP) {
                if (batch_size.numGE(divide(expt(TEN_INTEGER, n), TWO_INTEGER))) {
                    final SubLObject ile = subtract(ONE_INTEGER, expt(TEN_INTEGER, minus(n)));
                    format(stream, nl_generation_fort_cache.$str120$___Sth_percentile_paraphrase_time, multiply(ile, $int$100), number_utilities.percentile(batch_times, ile, UNPROVIDED, UNPROVIDED));
                } else {
                    enoughP = T;
                }
                n = number_utilities.f_1X(n);
            } 
        }
        final SubLObject total_swap_seconds = assertion_manager.current_assertion_content_swap_time();
        format(stream, nl_generation_fort_cache.$str121$____SWAP_time___A___, numeric_date_utilities.readable_elapsed_time_string(total_swap_seconds, UNPROVIDED));
        nl_generation_fort_cache.$nl_generation_fort_cache_swap_times$.setDynamicValue(list_utilities.add_to_end(list(batch_number, total_swap_seconds), nl_generation_fort_cache.$nl_generation_fort_cache_swap_times$.getDynamicValue(thread)), thread);
        assertion_manager.clear_assertion_content_swap_time();
        if (NIL != nl_generation_fort_cache.$nl_generation_fort_cache_generate_plotsP$.getDynamicValue(thread)) {
            nl_generation_fort_cache.generate_nl_generation_cache_time_plots(batch_size, working_directory);
        }
        force_output(stream);
        return NIL;
    }

    public static final SubLObject generate_nl_generation_cache_time_plots_alt(SubLObject batch_size, SubLObject directory) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = NIL;
                SubLObject datum_48 = NIL;
                SubLObject plot_title_format_string = NIL;
                SubLObject plot_title_format_string_49 = NIL;
                SubLObject output_file = NIL;
                SubLObject output_file_50 = NIL;
                SubLObject ylabel = NIL;
                SubLObject ylabel_51 = NIL;
                for (datum = list($nl_generation_fort_cache_total_times$.getDynamicValue(thread), $nl_generation_fort_cache_median_times$.getDynamicValue(thread), $nl_generation_fort_cache_cpu_times$.getDynamicValue(thread), $nl_generation_fort_cache_gc_times$.getDynamicValue(thread), $nl_generation_fort_cache_swap_times$.getDynamicValue(thread), $nl_generation_fort_cache_failed_fort_counts$.getDynamicValue(thread)), datum_48 = datum.first(), plot_title_format_string = $list_alt117, plot_title_format_string_49 = plot_title_format_string.first(), output_file = $list_alt118, output_file_50 = output_file.first(), ylabel = $list_alt119, ylabel_51 = ylabel.first(); !((((NIL == ylabel) && (NIL == output_file)) && (NIL == plot_title_format_string)) && (NIL == datum)); datum = datum.rest() , datum_48 = datum.first() , plot_title_format_string = plot_title_format_string.rest() , plot_title_format_string_49 = plot_title_format_string.first() , output_file = output_file.rest() , output_file_50 = output_file.first() , ylabel = ylabel.rest() , ylabel_51 = ylabel.first()) {
                    if (NIL != list_utilities.lengthG(datum_48, ONE_INTEGER, UNPROVIDED)) {
                        {
                            SubLObject plot_title = format(NIL, plot_title_format_string_49, batch_size);
                            SubLObject full_output_file = cconcatenate(directory, output_file_50);
                            plot_generation.generate_lines_graph(list(datum_48), list($XLABEL, $str_alt121$Batch__, $YLABEL, ylabel_51, $PLOT_TITLE, plot_title, $OUTPUT_FILE, full_output_file));
                            cfasl_utilities.cfasl_save(datum_48, cconcatenate(full_output_file, $str_alt125$_cfasl));
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject generate_nl_generation_cache_time_plots(final SubLObject batch_size, final SubLObject directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject datum = NIL;
        SubLObject datum_$72 = NIL;
        SubLObject plot_title_format_string = NIL;
        SubLObject plot_title_format_string_$73 = NIL;
        SubLObject output_file = NIL;
        SubLObject output_file_$74 = NIL;
        SubLObject ylabel = NIL;
        SubLObject ylabel_$75 = NIL;
        datum = list(nl_generation_fort_cache.$nl_generation_fort_cache_total_times$.getDynamicValue(thread), nl_generation_fort_cache.$nl_generation_fort_cache_median_times$.getDynamicValue(thread), nl_generation_fort_cache.$nl_generation_fort_cache_cpu_times$.getDynamicValue(thread), nl_generation_fort_cache.$nl_generation_fort_cache_gc_times$.getDynamicValue(thread), nl_generation_fort_cache.$nl_generation_fort_cache_swap_times$.getDynamicValue(thread), nl_generation_fort_cache.$nl_generation_fort_cache_failed_fort_counts$.getDynamicValue(thread));
        datum_$72 = datum.first();
        plot_title_format_string = nl_generation_fort_cache.$list122;
        plot_title_format_string_$73 = plot_title_format_string.first();
        output_file = nl_generation_fort_cache.$list123;
        output_file_$74 = output_file.first();
        ylabel = nl_generation_fort_cache.$list124;
        ylabel_$75 = ylabel.first();
        while ((((NIL != ylabel) || (NIL != output_file)) || (NIL != plot_title_format_string)) || (NIL != datum)) {
            if (NIL != list_utilities.lengthG(datum_$72, ONE_INTEGER, UNPROVIDED)) {
                final SubLObject plot_title = format(NIL, plot_title_format_string_$73, batch_size);
                final SubLObject full_output_file = cconcatenate(directory, output_file_$74);
                plot_generation.generate_lines_graph(list(datum_$72), list($XLABEL, nl_generation_fort_cache.$str126$Batch__, $YLABEL, ylabel_$75, $PLOT_TITLE, plot_title, $OUTPUT_FILE, full_output_file));
                cfasl_utilities.cfasl_save(datum_$72, cconcatenate(full_output_file, nl_generation_fort_cache.$str130$_cfasl));
            }
            datum = datum.rest();
            datum_$72 = datum.first();
            plot_title_format_string = plot_title_format_string.rest();
            plot_title_format_string_$73 = plot_title_format_string.first();
            output_file = output_file.rest();
            output_file_$74 = output_file.first();
            ylabel = ylabel.rest();
            ylabel_$75 = ylabel.first();
        } 
        return NIL;
    }

    public static final SubLObject stitch_together_nl_generation_cache_time_plots_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject plot_title = NIL;
                SubLObject plot_title_52 = NIL;
                SubLObject output_file = NIL;
                SubLObject output_file_53 = NIL;
                SubLObject ylabel = NIL;
                SubLObject ylabel_54 = NIL;
                for (plot_title = $list_alt126, plot_title_52 = plot_title.first(), output_file = $list_alt118, output_file_53 = output_file.first(), ylabel = $list_alt119, ylabel_54 = ylabel.first(); !(((NIL == ylabel) && (NIL == output_file)) && (NIL == plot_title)); plot_title = plot_title.rest() , plot_title_52 = plot_title.first() , output_file = output_file.rest() , output_file_53 = output_file.first() , ylabel = ylabel.rest() , ylabel_54 = ylabel.first()) {
                    {
                        SubLObject progress_message = NIL;
                        SubLObject main_directory = $nl_generation_fort_cache_working_directory$.getDynamicValue(thread);
                        SubLObject datum = NIL;
                        SubLTrampolineFile.checkType(main_directory, DIRECTORY_P);
                        {
                            SubLObject directory_contents_var = Filesys.directory(main_directory, T);
                            SubLObject progress_message_var = progress_message;
                            {
                                SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
                                try {
                                    $silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
                                    {
                                        SubLObject list_var = directory_contents_var;
                                        $progress_note$.setDynamicValue(progress_message_var, thread);
                                        $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                        $progress_total$.setDynamicValue(length(list_var), thread);
                                        $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                        {
                                            SubLObject _prev_bind_0_55 = $last_percent_progress_index$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                            SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                            try {
                                                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                                $last_percent_progress_prediction$.bind(NIL, thread);
                                                $within_noting_percent_progress$.bind(T, thread);
                                                $percent_progress_start_time$.bind(get_universal_time(), thread);
                                                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                                {
                                                    SubLObject csome_list_var = list_var;
                                                    SubLObject assignment_directory = NIL;
                                                    for (assignment_directory = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , assignment_directory = csome_list_var.first()) {
                                                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                        if ((NIL != Filesys.directory_p(assignment_directory)) && (NIL != Filesys.probe_file(cconcatenate(assignment_directory, new SubLObject[]{ $str_alt20$_, output_file_53, $str_alt125$_cfasl })))) {
                                                            {
                                                                SubLObject subdatum = cfasl_utilities.cfasl_load(cconcatenate(assignment_directory, new SubLObject[]{ $str_alt20$_, output_file_53, $str_alt125$_cfasl }));
                                                                datum = append(subdatum, datum);
                                                            }
                                                        }
                                                    }
                                                }
                                                noting_percent_progress_postamble();
                                            } finally {
                                                $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                                $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                                $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                                $last_percent_progress_index$.rebind(_prev_bind_0_55, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    $silent_progressP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                        datum = Sort.sort(datum, symbol_function($sym127$_), symbol_function(FIRST));
                        {
                            SubLObject full_output_file = cconcatenate(main_directory, output_file_53);
                            plot_generation.generate_lines_graph(list(datum), list($XLABEL, $str_alt121$Batch__, $YLABEL, ylabel_54, $PLOT_TITLE, plot_title_52, $OUTPUT_FILE, full_output_file));
                            cfasl_utilities.cfasl_save(datum, cconcatenate(full_output_file, $str_alt125$_cfasl));
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject stitch_together_nl_generation_cache_time_plots() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject plot_title = NIL;
        SubLObject plot_title_$76 = NIL;
        SubLObject output_file = NIL;
        SubLObject output_file_$77 = NIL;
        SubLObject ylabel = NIL;
        SubLObject ylabel_$78 = NIL;
        plot_title = nl_generation_fort_cache.$list131;
        plot_title_$76 = plot_title.first();
        output_file = nl_generation_fort_cache.$list123;
        output_file_$77 = output_file.first();
        ylabel = nl_generation_fort_cache.$list124;
        ylabel_$78 = ylabel.first();
        while (((NIL != ylabel) || (NIL != output_file)) || (NIL != plot_title)) {
            final SubLObject progress_message = NIL;
            final SubLObject main_directory = nl_generation_fort_cache.$nl_generation_fort_cache_working_directory$.getDynamicValue(thread);
            SubLObject datum = NIL;
            assert NIL != Filesys.directory_p(main_directory) : "! Filesys.directory_p(main_directory) " + ("Filesys.directory_p(main_directory) " + "CommonSymbols.NIL != Filesys.directory_p(main_directory) ") + main_directory;
            SubLObject directory_contents_var = Filesys.directory(main_directory, T);
            final SubLObject progress_message_var = progress_message;
            final SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
            try {
                $silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
                if (NIL.isFunctionSpec()) {
                    directory_contents_var = Sort.sort(directory_contents_var, NIL, UNPROVIDED);
                }
                final SubLObject list_var = directory_contents_var;
                final SubLObject _prev_bind_0_$79 = $progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $progress_note$.bind(NIL != progress_message_var ? progress_message_var : nl_generation_fort_cache.$$$cdolist, thread);
                    $progress_start_time$.bind(get_universal_time(), thread);
                    $progress_total$.bind(length(list_var), thread);
                    $progress_sofar$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        SubLObject csome_list_var = list_var;
                        SubLObject assignment_directory = NIL;
                        assignment_directory = csome_list_var.first();
                        while (NIL != csome_list_var) {
                            if ((NIL != Filesys.directory_p(assignment_directory)) && (NIL != Filesys.probe_file(cconcatenate(assignment_directory, new SubLObject[]{ nl_generation_fort_cache.$str19$_, output_file_$77, nl_generation_fort_cache.$str130$_cfasl })))) {
                                final SubLObject subdatum = cfasl_utilities.cfasl_load(cconcatenate(assignment_directory, new SubLObject[]{ nl_generation_fort_cache.$str19$_, output_file_$77, nl_generation_fort_cache.$str130$_cfasl }));
                                datum = append(subdatum, datum);
                            }
                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            assignment_directory = csome_list_var.first();
                        } 
                    } finally {
                        final SubLObject _prev_bind_0_$80 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$80, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                    $progress_sofar$.rebind(_prev_bind_4, thread);
                    $progress_total$.rebind(_prev_bind_3, thread);
                    $progress_start_time$.rebind(_prev_bind_2, thread);
                    $progress_note$.rebind(_prev_bind_0_$79, thread);
                }
            } finally {
                $silent_progressP$.rebind(_prev_bind_0, thread);
            }
            datum = Sort.sort(datum, symbol_function(nl_generation_fort_cache.$sym132$_), symbol_function(FIRST));
            final SubLObject full_output_file = cconcatenate(main_directory, output_file_$77);
            plot_generation.generate_lines_graph(list(datum), list($XLABEL, nl_generation_fort_cache.$str126$Batch__, $YLABEL, ylabel_$78, $PLOT_TITLE, plot_title_$76, $OUTPUT_FILE, full_output_file));
            cfasl_utilities.cfasl_save(datum, cconcatenate(full_output_file, nl_generation_fort_cache.$str130$_cfasl));
            plot_title = plot_title.rest();
            plot_title_$76 = plot_title.first();
            output_file = output_file.rest();
            output_file_$77 = output_file.first();
            ylabel = ylabel.rest();
            ylabel_$78 = ylabel.first();
        } 
        return NIL;
    }

    public static final SubLObject nanoseconds_per_second_alt() {
        return $nanoseconds_per_second$.getGlobalValue();
    }

    public static SubLObject nanoseconds_per_second() {
        return nl_generation_fort_cache.$nanoseconds_per_second$.getGlobalValue();
    }

    public static final SubLObject paraphrase_fort_for_cache_alt(SubLObject fort, SubLObject paraphrase_mt, SubLObject nl_preds) {
        if (paraphrase_mt == UNPROVIDED) {
            paraphrase_mt = com.cyc.cycjava.cycl.nl_generation_fort_cache.default_nl_generation_fort_cache_paraphrase_mt();
        }
        if (nl_preds == UNPROVIDED) {
            nl_preds = $nl_generation_fort_cache_nl_preds$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject str = NIL;
                SubLObject pred = NIL;
                SubLObject justifications = NIL;
                SubLObject demerits = NIL;
                {
                    SubLObject _prev_bind_0 = $use_generic_singular_nl_generation_fort_cacheP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = pph_vars.$select_string_methods_to_omit$.currentBinding(thread);
                    SubLObject _prev_bind_2 = pph_vars.$pph_track_discourse_referentsP$.currentBinding(thread);
                    try {
                        $use_generic_singular_nl_generation_fort_cacheP$.bind(NIL, thread);
                        pph_vars.$select_string_methods_to_omit$.bind($list_alt130, thread);
                        pph_vars.$pph_track_discourse_referentsP$.bind(NIL, thread);
                        {
                            SubLObject output_list = NIL;
                            thread.resetMultipleValues();
                            {
                                SubLObject str_56 = pph_main.generate_phrase_no_checks(fort, nl_preds, NIL, paraphrase_mt, $$InferencePSC, $TEXT, UNPROVIDED, UNPROVIDED);
                                SubLObject pred_57 = thread.secondMultipleValue();
                                SubLObject justifications_58 = thread.thirdMultipleValue();
                                SubLObject output_list_59 = thread.fourthMultipleValue();
                                SubLObject demerits_60 = thread.fifthMultipleValue();
                                thread.resetMultipleValues();
                                str = str_56;
                                pred = pred_57;
                                justifications = justifications_58;
                                output_list = output_list_59;
                                demerits = demerits_60;
                            }
                        }
                    } finally {
                        pph_vars.$pph_track_discourse_referentsP$.rebind(_prev_bind_2, thread);
                        pph_vars.$select_string_methods_to_omit$.rebind(_prev_bind_1, thread);
                        $use_generic_singular_nl_generation_fort_cacheP$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(str, pred, demerits, justifications);
            }
        }
    }

    public static SubLObject paraphrase_fort_for_cache(final SubLObject fort, SubLObject paraphrase_mt, SubLObject nl_preds) {
        if (paraphrase_mt == UNPROVIDED) {
            paraphrase_mt = nl_generation_fort_cache.default_nl_generation_fort_cache_paraphrase_mt();
        }
        if (nl_preds == UNPROVIDED) {
            nl_preds = nl_generation_fort_cache.$nl_generation_fort_cache_nl_preds$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject str = NIL;
        SubLObject pred = NIL;
        SubLObject justifications = NIL;
        SubLObject demerits = NIL;
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject _prev_bind_0_$81 = nl_generation_fort_cache.$use_generic_singular_nl_generation_fort_cacheP$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = pph_vars.$retain_pph_queriesP$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = pph_vars.$select_string_methods_to_omit$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = pph_vars.$pph_track_discourse_referentsP$.currentBinding(thread);
                    try {
                        nl_generation_fort_cache.$use_generic_singular_nl_generation_fort_cacheP$.bind(NIL, thread);
                        pph_vars.$retain_pph_queriesP$.bind(NIL, thread);
                        pph_vars.$select_string_methods_to_omit$.bind(nl_generation_fort_cache.$list136, thread);
                        pph_vars.$pph_track_discourse_referentsP$.bind(NIL, thread);
                        SubLObject output_list = NIL;
                        thread.resetMultipleValues();
                        final SubLObject str_$82 = pph_main.generate_phrase_no_checks(fort, nl_preds, NIL, paraphrase_mt, nl_generation_fort_cache.$$InferencePSC, $TEXT, UNPROVIDED, UNPROVIDED);
                        final SubLObject pred_$83 = thread.secondMultipleValue();
                        final SubLObject justifications_$84 = thread.thirdMultipleValue();
                        final SubLObject output_list_$85 = thread.fourthMultipleValue();
                        final SubLObject demerits_$86 = thread.fifthMultipleValue();
                        thread.resetMultipleValues();
                        str = str_$82;
                        pred = pred_$83;
                        justifications = justifications_$84;
                        output_list = output_list_$85;
                        demerits = demerits_$86;
                    } finally {
                        pph_vars.$pph_track_discourse_referentsP$.rebind(_prev_bind_4, thread);
                        pph_vars.$select_string_methods_to_omit$.rebind(_prev_bind_3, thread);
                        pph_vars.$retain_pph_queriesP$.rebind(_prev_bind_2, thread);
                        nl_generation_fort_cache.$use_generic_singular_nl_generation_fort_cacheP$.rebind(_prev_bind_0_$81, thread);
                    }
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
        if (NIL != error_message) {
            Errors.warn(nl_generation_fort_cache.$str139$Error_in_paraphrase_fort_for_cach, fort, error_message);
        }
        return values(str, pred, demerits, justifications);
    }

    public static final SubLObject nl_generation_fort_cache_stale_for_fortP_alt(SubLObject fort) {
        {
            SubLObject staleP = NIL;
            SubLObject check_justificationsP = NIL;
            if (NIL == com.cyc.cycjava.cycl.nl_generation_fort_cache.dont_want_to_generate_this_oneP(fort)) {
                {
                    SubLObject cached = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.nl_generation_fort_cache.nl_generation_cache_lookup(fort, UNPROVIDED, UNPROVIDED)));
                    if (cached.first().isString()) {
                        {
                            SubLObject v_new = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.nl_generation_fort_cache.paraphrase_fort_for_cache(fort, UNPROVIDED, UNPROVIDED)));
                            if (!(list_utilities.first_n(THREE_INTEGER, v_new).equal(list_utilities.first_n(THREE_INTEGER, cached)) && ((NIL == check_justificationsP) || (NIL != list_utilities.sets_equalP(list_utilities.last_one(v_new), list_utilities.last_one(cached), symbol_function(EQUAL)))))) {
                                Errors.warn($str_alt133$Cached_paraphrase_for__S___is__S_, fort, cached, v_new);
                                staleP = T;
                            }
                        }
                    }
                }
            }
            return staleP;
        }
    }

    public static SubLObject nl_generation_fort_cache_stale_for_fortP(final SubLObject fort) {
        SubLObject staleP = NIL;
        final SubLObject check_justificationsP = NIL;
        if (NIL == nl_generation_fort_cache.dont_want_to_generate_this_oneP(fort)) {
            final SubLObject cached = arg2(resetMultipleValues(), multiple_value_list(nl_generation_fort_cache.nl_generation_cache_lookup(fort, UNPROVIDED, UNPROVIDED)));
            if (NIL != cycl_string.cycl_string_p(cached.first())) {
                final SubLObject v_new = arg2(resetMultipleValues(), multiple_value_list(nl_generation_fort_cache.paraphrase_fort_for_cache(fort, UNPROVIDED, UNPROVIDED)));
                if ((!list_utilities.first_n(THREE_INTEGER, v_new).equal(list_utilities.first_n(THREE_INTEGER, cached))) || ((NIL != check_justificationsP) && (NIL == list_utilities.sets_equalP(list_utilities.last_one(v_new), list_utilities.last_one(cached), symbol_function(EQUAL))))) {
                    Errors.warn(nl_generation_fort_cache.$str140$Cached_paraphrase_for__S___is__S_, fort, cached, v_new);
                    staleP = T;
                }
            }
        }
        return staleP;
    }

    public static final SubLObject estimate_nl_generation_cache_stale_percentage_alt(SubLObject window, SubLObject max_variance, SubLObject minimum_to_sample) {
        if (window == UNPROVIDED) {
            window = $int$100;
        }
        if (max_variance == UNPROVIDED) {
            max_variance = $float$0_001;
        }
        if (minimum_to_sample == UNPROVIDED) {
            minimum_to_sample = multiply(TWO_INTEGER, window);
        }
        format(T, $str_alt135$__Checking_NL_Generation_cache_ba, new SubLObject[]{ file_backed_cache.file_backed_cache_file_hash_table_path($english_generation_fort_cache$.getGlobalValue()), file_backed_cache.file_backed_cache_local_cache_count($english_generation_fort_cache$.getGlobalValue()), kb_version_string(), build_kb_loaded() });
        {
            SubLObject done_forts = new_set(UNPROVIDED, UNPROVIDED);
            SubLObject done_count = ZERO_INTEGER;
            SubLObject stale_forts = NIL;
            SubLObject stale_count = ZERO_INTEGER;
            SubLObject min_percent = NIL;
            SubLObject max_percent = NIL;
            SubLObject variance_precision = ceiling(minus(log(max_variance, TEN_INTEGER)), UNPROVIDED);
            SubLObject remaining_count = window;
            while (!remaining_count.isZero()) {
                {
                    SubLObject fort = forts.random_fort();
                    if (NIL == set_memberP(fort, done_forts)) {
                        if (NIL != com.cyc.cycjava.cycl.nl_generation_fort_cache.nl_generation_fort_cache_stale_for_fortP(fort)) {
                            stale_forts = cons(fort, stale_forts);
                            stale_count = add(stale_count, ONE_INTEGER);
                        }
                        if (done_count.numGE(subtract(minimum_to_sample, window))) {
                            {
                                SubLObject current_percent = divide(stale_count, done_count);
                                if (mod(done_count, integerDivide(minimum_to_sample, TEN_INTEGER)).isZero()) {
                                    format(T, $str_alt136$__Done__D__Current_estimate____3F, done_count, number_utilities.percent(current_percent, ONE_INTEGER, FOUR_INTEGER));
                                }
                                if ((NIL == min_percent) || current_percent.numL(min_percent)) {
                                    min_percent = current_percent;
                                }
                                if ((NIL == max_percent) || current_percent.numG(max_percent)) {
                                    max_percent = current_percent;
                                }
                                if (subtract(max_percent, min_percent).numG(max_variance)) {
                                    Errors.warn($str_alt137$Done__S__but_variance_of_approxim, new SubLObject[]{ done_count, number_utilities.significant_digits(subtract(max_percent, min_percent), variance_precision), max_variance, window });
                                    remaining_count = window;
                                    min_percent = NIL;
                                    max_percent = NIL;
                                } else {
                                    remaining_count = subtract(remaining_count, ONE_INTEGER);
                                }
                            }
                        }
                        set_add(fort, done_forts);
                        done_count = add(done_count, ONE_INTEGER);
                    }
                }
            } 
            {
                SubLObject format_precision = princ_to_string(variance_precision);
                SubLObject format_string = cconcatenate($str_alt138$__The_estimated_staleness_percent, new SubLObject[]{ format_precision, $str_alt139$F__and___, format_precision, $str_alt140$F____ });
                format(T, format_string, new SubLObject[]{ done_count, number_utilities.percent(min_percent, UNPROVIDED, UNPROVIDED), number_utilities.percent(max_percent, UNPROVIDED, UNPROVIDED) });
            }
            return values(min_percent, max_percent, done_count);
        }
    }

    public static SubLObject estimate_nl_generation_cache_stale_percentage(SubLObject window, SubLObject max_variance, SubLObject minimum_to_sample) {
        if (window == UNPROVIDED) {
            window = $int$100;
        }
        if (max_variance == UNPROVIDED) {
            max_variance = nl_generation_fort_cache.$float$0_001;
        }
        if (minimum_to_sample == UNPROVIDED) {
            minimum_to_sample = multiply(TWO_INTEGER, window);
        }
        format(T, nl_generation_fort_cache.$str142$__Checking_NL_Generation_cache_ba, new SubLObject[]{ file_backed_cache.file_backed_cache_file_hash_table_path(nl_generation_fort_cache.$english_generation_fort_cache$.getGlobalValue()), file_backed_cache.file_backed_cache_local_cache_count(nl_generation_fort_cache.$english_generation_fort_cache$.getGlobalValue()), operation_communication.kb_version_string(), build_kb_loaded() });
        final SubLObject done_forts = set.new_set(UNPROVIDED, UNPROVIDED);
        SubLObject done_count = ZERO_INTEGER;
        SubLObject stale_forts = NIL;
        SubLObject stale_count = ZERO_INTEGER;
        SubLObject min_percent = NIL;
        SubLObject max_percent = NIL;
        final SubLObject variance_precision = ceiling(minus(log(max_variance, TEN_INTEGER)), UNPROVIDED);
        SubLObject remaining_count = window;
        while (!remaining_count.isZero()) {
            final SubLObject fort = forts.random_fort(UNPROVIDED);
            if (NIL == set.set_memberP(fort, done_forts)) {
                if (NIL != nl_generation_fort_cache.nl_generation_fort_cache_stale_for_fortP(fort)) {
                    stale_forts = cons(fort, stale_forts);
                    stale_count = add(stale_count, ONE_INTEGER);
                }
                if (done_count.numGE(subtract(minimum_to_sample, window))) {
                    final SubLObject current_percent = divide(stale_count, done_count);
                    if (mod(done_count, integerDivide(minimum_to_sample, TEN_INTEGER)).isZero()) {
                        format(T, nl_generation_fort_cache.$str143$__Done__D__Current_estimate____3F, done_count, number_utilities.percent(current_percent, ONE_INTEGER, FOUR_INTEGER));
                    }
                    if ((NIL == min_percent) || current_percent.numL(min_percent)) {
                        min_percent = current_percent;
                    }
                    if ((NIL == max_percent) || current_percent.numG(max_percent)) {
                        max_percent = current_percent;
                    }
                    if (subtract(max_percent, min_percent).numG(max_variance)) {
                        Errors.warn(nl_generation_fort_cache.$str144$Done__S__but_variance_of_approxim, new SubLObject[]{ done_count, number_utilities.significant_digits(subtract(max_percent, min_percent), variance_precision), max_variance, window });
                        remaining_count = window;
                        min_percent = NIL;
                        max_percent = NIL;
                    } else {
                        remaining_count = subtract(remaining_count, ONE_INTEGER);
                    }
                }
                set.set_add(fort, done_forts);
                done_count = add(done_count, ONE_INTEGER);
            }
        } 
        final SubLObject format_precision = princ_to_string(variance_precision);
        final SubLObject format_string = cconcatenate(nl_generation_fort_cache.$str145$__The_estimated_staleness_percent, new SubLObject[]{ format_precision, nl_generation_fort_cache.$str146$F__and___, format_precision, nl_generation_fort_cache.$str147$F____ });
        format(T, format_string, new SubLObject[]{ done_count, number_utilities.percent(min_percent, UNPROVIDED, UNPROVIDED), number_utilities.percent(max_percent, UNPROVIDED, UNPROVIDED) });
        return values(min_percent, max_percent, done_count);
    }

    /**
     * Returns a list of all the forts in the current KB that aren't pregenerated in the
     * given generation cache.
     *
     * @param FBC
     * 		The file backed cache of nl generations to verify. The file backed cache
     * 		should be of the form
     * 		Key:fort -> Value:(cons string nl-pred).
     * @return list of all forts that don't have a cached generation in the current KB
     */
    @LispMethod(comment = "Returns a list of all the forts in the current KB that aren\'t pregenerated in the\r\ngiven generation cache.\r\n\r\n@param FBC\r\n\t\tThe file backed cache of nl generations to verify. The file backed cache\r\n\t\tshould be of the form\r\n\t\tKey:fort -> Value:(cons string nl-pred).\r\n@return list of all forts that don\'t have a cached generation in the current KB\nReturns a list of all the forts in the current KB that aren\'t pregenerated in the\ngiven generation cache.")
    public static final SubLObject verify_cached_nl_generation_for_all_forts_alt(SubLObject fbc) {
        if (fbc == UNPROVIDED) {
            fbc = $english_generation_fort_cache$.getGlobalValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(fbc, FILE_BACKED_CACHE_P);
            {
                SubLObject bad_forts = NIL;
                SubLObject message = $str_alt142$Looking_up_nl_generation_for_all_;
                SubLObject total = forts.fort_count();
                SubLObject sofar = ZERO_INTEGER;
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble(message);
                        {
                            SubLObject cdolist_list_var = forts.do_forts_tables();
                            SubLObject table_var = NIL;
                            for (table_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , table_var = cdolist_list_var.first()) {
                                if (NIL == do_id_index_empty_p(table_var, $SKIP)) {
                                    {
                                        SubLObject id = do_id_index_next_id(table_var, T, NIL, NIL);
                                        SubLObject state_var = do_id_index_next_state(table_var, T, id, NIL);
                                        SubLObject fort = NIL;
                                        while (NIL != id) {
                                            fort = do_id_index_state_object(table_var, $SKIP, id, state_var);
                                            if (NIL != do_id_index_id_and_object_validP(id, fort, $SKIP)) {
                                                sofar = add(sofar, ONE_INTEGER);
                                                note_percent_progress(sofar, total);
                                                {
                                                    SubLObject nl_cons = file_backed_cache.file_backed_cache_lookup(fort, fbc, $NOT_FOUND, UNPROVIDED);
                                                    if (nl_cons == $NOT_FOUND) {
                                                        if (NIL == com.cyc.cycjava.cycl.nl_generation_fort_cache.dont_want_to_generate_this_oneP(fort)) {
                                                            bad_forts = cons(fort, bad_forts);
                                                        }
                                                    }
                                                }
                                            }
                                            id = do_id_index_next_id(table_var, T, id, state_var);
                                            state_var = do_id_index_next_state(table_var, T, id, state_var);
                                        } 
                                    }
                                }
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return bad_forts;
            }
        }
    }

    /**
     * Returns a list of all the forts in the current KB that aren't pregenerated in the
     * given generation cache.
     *
     * @param FBC
     * 		The file backed cache of nl generations to verify. The file backed cache
     * 		should be of the form
     * 		Key:fort -> Value:(cons string nl-pred).
     * @return list of all forts that don't have a cached generation in the current KB
     */
    @LispMethod(comment = "Returns a list of all the forts in the current KB that aren\'t pregenerated in the\r\ngiven generation cache.\r\n\r\n@param FBC\r\n\t\tThe file backed cache of nl generations to verify. The file backed cache\r\n\t\tshould be of the form\r\n\t\tKey:fort -> Value:(cons string nl-pred).\r\n@return list of all forts that don\'t have a cached generation in the current KB\nReturns a list of all the forts in the current KB that aren\'t pregenerated in the\ngiven generation cache.")
    public static SubLObject verify_cached_nl_generation_for_all_forts(SubLObject fbc) {
        if (fbc == UNPROVIDED) {
            fbc = nl_generation_fort_cache.$english_generation_fort_cache$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != file_backed_cache.file_backed_cache_p(fbc) : "! file_backed_cache.file_backed_cache_p(fbc) " + ("file_backed_cache.file_backed_cache_p(fbc) " + "CommonSymbols.NIL != file_backed_cache.file_backed_cache_p(fbc) ") + fbc;
        SubLObject bad_forts = NIL;
        final SubLObject message = nl_generation_fort_cache.$str149$Looking_up_nl_generation_for_all_;
        final SubLObject total = forts.fort_count();
        SubLObject sofar = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(message);
                SubLObject cdolist_list_var = forts.do_forts_tables();
                SubLObject table_var = NIL;
                table_var = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject idx = table_var;
                    if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                        final SubLObject idx_$87 = idx;
                        if (NIL == id_index_dense_objects_empty_p(idx_$87, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$87);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id;
                            SubLObject fort;
                            SubLObject nl_cons;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                fort = aref(vector_var, id);
                                if ((NIL == id_index_tombstone_p(fort)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(fort)) {
                                        fort = $SKIP;
                                    }
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                    nl_cons = file_backed_cache.file_backed_cache_lookup(fort, fbc, $NOT_FOUND, UNPROVIDED);
                                    if ((nl_cons == $NOT_FOUND) && (NIL == nl_generation_fort_cache.dont_want_to_generate_this_oneP(fort))) {
                                        bad_forts = cons(fort, bad_forts);
                                    }
                                }
                            }
                        }
                        final SubLObject idx_$88 = idx;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$88)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$88);
                            SubLObject id2 = id_index_sparse_id_threshold(idx_$88);
                            final SubLObject end_id = id_index_next_id(idx_$88);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (id2.numL(end_id)) {
                                final SubLObject fort2 = gethash_without_values(id2, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(fort2))) {
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                    final SubLObject nl_cons2 = file_backed_cache.file_backed_cache_lookup(fort2, fbc, $NOT_FOUND, UNPROVIDED);
                                    if ((nl_cons2 == $NOT_FOUND) && (NIL == nl_generation_fort_cache.dont_want_to_generate_this_oneP(fort2))) {
                                        bad_forts = cons(fort2, bad_forts);
                                    }
                                }
                                id2 = add(id2, ONE_INTEGER);
                            } 
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    table_var = cdolist_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$89 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$89, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return bad_forts;
    }

    /**
     * Fills out the contents of the cache at FHT-PATH.  If there is already an entry for a particular FORT in the cache, nothing is done.  If there is no
     * entry for FORT in the cache, the correct entry is generated and added to the cache.  This will NOT pick up changes to the generation for terms that
     * are already in the cache.
     */
    @LispMethod(comment = "Fills out the contents of the cache at FHT-PATH.  If there is already an entry for a particular FORT in the cache, nothing is done.  If there is no\r\nentry for FORT in the cache, the correct entry is generated and added to the cache.  This will NOT pick up changes to the generation for terms that\r\nare already in the cache.\nFills out the contents of the cache at FHT-PATH.  If there is already an entry for a particular FORT in the cache, nothing is done.  If there is no\nentry for FORT in the cache, the correct entry is generated and added to the cache.  This will NOT pick up changes to the generation for terms that\nare already in the cache.")
    public static final SubLObject update_cached_nl_generation_for_all_forts_alt(SubLObject fht_path, SubLObject paraphrase_mt, SubLObject nl_preds) {
        if (paraphrase_mt == UNPROVIDED) {
            paraphrase_mt = $$EnglishParaphraseMt;
        }
        if (nl_preds == UNPROVIDED) {
            nl_preds = $list_alt25;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject fht = file_hash_table.open_file_hash_table(fht_path, symbol_function(EQUAL), $HL_EXTERNALIZED_KEYS);
                SubLObject fbc = file_backed_cache.file_backed_cache_create(fht_path, $preload_nl_generation_cachesP$.getGlobalValue(), T, $int$100, symbol_function(EQUAL), $HL_EXTERNALIZED_KEYS);
                SubLObject missing_forts = com.cyc.cycjava.cycl.nl_generation_fort_cache.verify_cached_nl_generation_for_all_forts(fbc);
                SubLObject list_var = missing_forts;
                $progress_note$.setDynamicValue($$$cdolist, thread);
                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                $progress_total$.setDynamicValue(length(list_var), thread);
                $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        {
                            SubLObject csome_list_var = list_var;
                            SubLObject fort = NIL;
                            for (fort = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , fort = csome_list_var.first()) {
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                if (NIL == com.cyc.cycjava.cycl.nl_generation_fort_cache.dont_want_to_generate_this_oneP(fort)) {
                                    {
                                        SubLObject max_time = $int$60;
                                        SubLObject timed_outP = NIL;
                                        SubLObject str = NIL;
                                        SubLObject pred = NIL;
                                        SubLObject tag = with_timeout_make_tag();
                                        try {
                                            {
                                                SubLObject _prev_bind_0_61 = $within_with_timeout$.currentBinding(thread);
                                                try {
                                                    $within_with_timeout$.bind(T, thread);
                                                    {
                                                        SubLObject timer = NIL;
                                                        try {
                                                            {
                                                                SubLObject _prev_bind_0_62 = $with_timeout_nesting_depth$.currentBinding(thread);
                                                                try {
                                                                    $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                                    timer = with_timeout_start_timer(max_time, tag);
                                                                    thread.resetMultipleValues();
                                                                    {
                                                                        SubLObject str_63 = pph_main.generate_phrase(fort, nl_preds, NIL, paraphrase_mt, $$InferencePSC, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                        SubLObject pred_64 = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        str = str_63;
                                                                        pred = pred_64;
                                                                    }
                                                                } finally {
                                                                    $with_timeout_nesting_depth$.rebind(_prev_bind_0_62, thread);
                                                                }
                                                            }
                                                        } finally {
                                                            {
                                                                SubLObject _prev_bind_0_65 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    with_timeout_stop_timer(timer);
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_65, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                } finally {
                                                    $within_with_timeout$.rebind(_prev_bind_0_61, thread);
                                                }
                                            }
                                        } catch (Throwable ccatch_env_var) {
                                            timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
                                        }
                                        if (NIL != timed_outP) {
                                            Errors.warn($str_alt146$Timed_out_after__S_seconds_genera, max_time, fort);
                                        } else {
                                            if (NIL != string_utilities.non_empty_stringP(str)) {
                                                file_hash_table.put_file_hash_table(fort, fht, cons(str, pred));
                                            } else {
                                                if (NIL != string_utilities.empty_string_p(str)) {
                                                    Errors.warn($str_alt96$Generated_empty_string_for__S, fort);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                file_hash_table.finalize_file_hash_table(fht);
            }
            return fht_path;
        }
    }

    /**
     * Fills out the contents of the cache at FHT-PATH.  If there is already an entry for a particular FORT in the cache, nothing is done.  If there is no
     * entry for FORT in the cache, the correct entry is generated and added to the cache.  This will NOT pick up changes to the generation for terms that
     * are already in the cache.
     */
    @LispMethod(comment = "Fills out the contents of the cache at FHT-PATH.  If there is already an entry for a particular FORT in the cache, nothing is done.  If there is no\r\nentry for FORT in the cache, the correct entry is generated and added to the cache.  This will NOT pick up changes to the generation for terms that\r\nare already in the cache.\nFills out the contents of the cache at FHT-PATH.  If there is already an entry for a particular FORT in the cache, nothing is done.  If there is no\nentry for FORT in the cache, the correct entry is generated and added to the cache.  This will NOT pick up changes to the generation for terms that\nare already in the cache.")
    public static SubLObject update_cached_nl_generation_for_all_forts(final SubLObject fht_path, SubLObject paraphrase_mt, SubLObject nl_preds) {
        if (paraphrase_mt == UNPROVIDED) {
            paraphrase_mt = nl_generation_fort_cache.$$EnglishParaphraseMt;
        }
        if (nl_preds == UNPROVIDED) {
            nl_preds = nl_generation_fort_cache.$list24;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fht = file_hash_table.open_file_hash_table(fht_path, symbol_function(EQUAL), nl_generation_fort_cache.$HL_EXTERNALIZED_KEYS);
        final SubLObject fbc = file_backed_cache.file_backed_cache_create(fht_path, nl_generation_fort_cache.$preload_nl_generation_cachesP$.getGlobalValue(), T, $int$100, symbol_function(EQUAL), nl_generation_fort_cache.$HL_EXTERNALIZED_KEYS);
        final SubLObject list_var;
        final SubLObject missing_forts = list_var = nl_generation_fort_cache.verify_cached_nl_generation_for_all_forts(fbc);
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind(nl_generation_fort_cache.$$$cdolist, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject fort = NIL;
                fort = csome_list_var.first();
                while (NIL != csome_list_var) {
                    if (NIL == nl_generation_fort_cache.dont_want_to_generate_this_oneP(fort)) {
                        final SubLObject max_time = nl_generation_fort_cache.$int$60;
                        SubLObject timed_outP = NIL;
                        SubLObject str = NIL;
                        SubLObject pred = NIL;
                        final SubLObject tag = with_timeout_make_tag();
                        try {
                            thread.throwStack.push(tag);
                            final SubLObject _prev_bind_0_$90 = $within_with_timeout$.currentBinding(thread);
                            try {
                                $within_with_timeout$.bind(T, thread);
                                SubLObject timer = NIL;
                                try {
                                    final SubLObject _prev_bind_0_$91 = $with_timeout_nesting_depth$.currentBinding(thread);
                                    try {
                                        $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                        timer = with_timeout_start_timer(max_time, tag);
                                        thread.resetMultipleValues();
                                        final SubLObject str_$92 = pph_main.generate_phrase(fort, nl_preds, NIL, paraphrase_mt, nl_generation_fort_cache.$$InferencePSC, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        final SubLObject pred_$93 = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        str = str_$92;
                                        pred = pred_$93;
                                    } finally {
                                        $with_timeout_nesting_depth$.rebind(_prev_bind_0_$91, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$92 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        with_timeout_stop_timer(timer);
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$92, thread);
                                    }
                                }
                            } finally {
                                $within_with_timeout$.rebind(_prev_bind_0_$90, thread);
                            }
                        } catch (final Throwable ccatch_env_var) {
                            timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
                        } finally {
                            thread.throwStack.pop();
                        }
                        if (NIL != timed_outP) {
                            Errors.warn(nl_generation_fort_cache.$str152$Timed_out_after__S_seconds_genera, max_time, fort);
                        } else
                            if (NIL != string_utilities.non_empty_stringP(str)) {
                                file_hash_table.put_file_hash_table(fort, fht, cons(str, pred));
                            } else
                                if (NIL != string_utilities.empty_string_p(str)) {
                                    Errors.warn(nl_generation_fort_cache.$str102$Generated_empty_string_for__S, fort);
                                }


                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    fort = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$93 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$93, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        file_hash_table.finalize_file_hash_table(fht);
        return fht_path;
    }

    public static final SubLObject nart_sister_to_gaf_ratio_alt(SubLObject nart) {
        return integerDivide(kb_indexing.num_function_extent_index(cycl_utilities.nat_functor(nart)), kb_indexing.num_gaf_arg_index(nart, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject nart_sister_to_gaf_ratio(final SubLObject nart) {
        return integerDivide(kb_indexing.num_function_extent_index(cycl_utilities.nat_functor(nart)), kb_indexing.num_gaf_arg_index(nart, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    /**
     * Return wether the given fort is not worth performing an nl generating on.
     * Currently we don't bother performing nl generations on skolems.
     *
     * @param FORT
     * 		the fort to check if it's not worth perfoming an nl generation on
     * @return true if we shouldn't perform nl generation on this FORT
     */
    @LispMethod(comment = "Return wether the given fort is not worth performing an nl generating on.\r\nCurrently we don\'t bother performing nl generations on skolems.\r\n\r\n@param FORT\r\n\t\tthe fort to check if it\'s not worth perfoming an nl generation on\r\n@return true if we shouldn\'t perform nl generation on this FORT\nReturn wether the given fort is not worth performing an nl generating on.\nCurrently we don\'t bother performing nl generations on skolems.")
    public static final SubLObject dont_want_to_generate_this_oneP_alt(SubLObject fort) {
        return makeBoolean(((NIL != term.reified_skolem_fnP(fort)) || (NIL != isa.isa_in_any_mtP(fort, $$LogicalFieldAttribute))) || ((NIL != nart_handles.nart_p(fort)) && ((NIL != term.skolem_nartP(fort)) || (NIL != com.cyc.cycjava.cycl.nl_generation_fort_cache.nart_non_wffP(fort)))));
    }

    /**
     * Return wether the given fort is not worth performing an nl generating on.
     * Currently we don't bother performing nl generations on skolems.
     *
     * @param FORT
     * 		the fort to check if it's not worth perfoming an nl generation on
     * @return true if we shouldn't perform nl generation on this FORT
     */
    @LispMethod(comment = "Return wether the given fort is not worth performing an nl generating on.\r\nCurrently we don\'t bother performing nl generations on skolems.\r\n\r\n@param FORT\r\n\t\tthe fort to check if it\'s not worth perfoming an nl generation on\r\n@return true if we shouldn\'t perform nl generation on this FORT\nReturn wether the given fort is not worth performing an nl generating on.\nCurrently we don\'t bother performing nl generations on skolems.")
    public static SubLObject dont_want_to_generate_this_oneP(final SubLObject fort) {
        return makeBoolean(((NIL != term.reified_skolem_fnP(fort)) || (NIL != isa.isa_in_any_mtP(fort, nl_generation_fort_cache.$$LogicalFieldAttribute))) || ((NIL != nart_handles.nart_p(fort)) && ((NIL != term.skolem_nartP(fort)) || (NIL != nl_generation_fort_cache.nart_non_wffP(fort)))));
    }

    public static final SubLObject nart_non_wffP_alt(SubLObject nart) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject is_wffP = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        is_wffP = wff.el_wft_fastP(narts_high.nart_el_formula(nart), UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return makeBoolean(NIL == is_wffP);
            }
        }
    }

    public static SubLObject nart_non_wffP(final SubLObject nart) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject is_wffP = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(nl_generation_fort_cache.$$EverythingPSC, thread);
            is_wffP = wff.el_wft_fastP(narts_high.nart_el_formula(nart), UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return makeBoolean(NIL == is_wffP);
    }

    /**
     * Returns cached nl-generation value (values String nl-pred) for the given FORT. First,
     * looks in the nl generation local hash and returns that value. If not found in the local
     * hash, looks in the file backed cache, FBC.
     *
     * @param FORT
     * 		The fort we want to look up the nl generation for
     * @param FBC
     * 		The file backed cache of nl generations to verify. The file backed cache
     * 		should be of the form Key:fort -> Value:(cons string nl-pred).
     * @return 0 stringp or NIL; The default nl generation for the given FORT
     * @return 1 fort-p or NIL; The nl pred showing the agreement of the generated phrase
     * @return 2 non-negative-integer-or-nil-p; The number of demerits, if known.
     * @unknown 3 listp; of justifications for the cached paraphrase.
    returns nil nil if not found.
     */
    @LispMethod(comment = "Returns cached nl-generation value (values String nl-pred) for the given FORT. First,\r\nlooks in the nl generation local hash and returns that value. If not found in the local\r\nhash, looks in the file backed cache, FBC.\r\n\r\n@param FORT\r\n\t\tThe fort we want to look up the nl generation for\r\n@param FBC\r\n\t\tThe file backed cache of nl generations to verify. The file backed cache\r\n\t\tshould be of the form Key:fort -> Value:(cons string nl-pred).\r\n@return 0 stringp or NIL; The default nl generation for the given FORT\r\n@return 1 fort-p or NIL; The nl pred showing the agreement of the generated phrase\r\n@return 2 non-negative-integer-or-nil-p; The number of demerits, if known.\r\n@unknown 3 listp; of justifications for the cached paraphrase.\r\nreturns nil nil if not found.\nReturns cached nl-generation value (values String nl-pred) for the given FORT. First,\nlooks in the nl generation local hash and returns that value. If not found in the local\nhash, looks in the file backed cache, FBC.")
    public static final SubLObject nl_generation_cache_lookup_alt(SubLObject fort, SubLObject fbc, SubLObject warn_on_errorP) {
        if (fbc == UNPROVIDED) {
            fbc = $english_generation_fort_cache$.getGlobalValue();
        }
        if (warn_on_errorP == UNPROVIDED) {
            warn_on_errorP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject msg = NIL;
                SubLObject info = NIL;
                if (NIL == com.cyc.cycjava.cycl.nl_generation_fort_cache.nl_generate_cache_exceptionP(fort)) {
                    if (NIL != $use_generic_singular_nl_generation_fort_cacheP$.getDynamicValue(thread)) {
                        try {
                            {
                                SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                    try {
                                        SubLTrampolineFile.checkType(fort, FORT_P);
                                        if ((fbc == $english_generation_fort_cache$.getGlobalValue()) && (NIL == file_backed_cache.file_backed_cache_p(fbc))) {
                                            com.cyc.cycjava.cycl.nl_generation_fort_cache.initialize_nl_generation_caches();
                                            fbc = $english_generation_fort_cache$.getGlobalValue();
                                        }
                                        SubLTrampolineFile.checkType(fbc, FILE_BACKED_CACHE_P);
                                    } catch (Throwable catch_var) {
                                        Errors.handleThrowable(catch_var, NIL);
                                    }
                                } finally {
                                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                                }
                            }
                        } catch (Throwable ccatch_env_var) {
                            msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                        }
                        if (NIL != msg) {
                            if (NIL != warn_on_errorP) {
                                Errors.warn(msg);
                            }
                            return values(NIL, NIL);
                        }
                        try {
                            {
                                SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                    try {
                                        info = file_backed_cache.file_backed_cache_lookup(fort, fbc, info, T);
                                    } catch (Throwable catch_var) {
                                        Errors.handleThrowable(catch_var, NIL);
                                    }
                                } finally {
                                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                                }
                            }
                        } catch (Throwable ccatch_env_var) {
                            msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                        }
                        if (NIL != msg) {
                            if (NIL != warn_on_errorP) {
                                Errors.warn(msg);
                            }
                        }
                    }
                }
                if (((NIL != list_utilities.proper_list_p(info)) && (NIL != list_utilities.lengthE(info, FOUR_INTEGER, UNPROVIDED))) && (NIL != string_utilities.non_empty_stringP(info.first()))) {
                    return subl_promotions.values_list(info);
                } else {
                    if (info.isCons() && (NIL != string_utilities.non_empty_stringP(info.first()))) {
                        return values(info.first(), info.rest(), NIL, NIL);
                    } else {
                        return values(NIL, NIL, NIL, NIL);
                    }
                }
            }
        }
    }

    /**
     * Returns cached nl-generation value (values String nl-pred) for the given FORT. First,
     * looks in the nl generation local hash and returns that value. If not found in the local
     * hash, looks in the file backed cache, FBC.
     *
     * @param FORT
     * 		The fort we want to look up the nl generation for
     * @param FBC
     * 		The file backed cache of nl generations to verify. The file backed cache
     * 		should be of the form Key:fort -> Value:(cons string nl-pred).
     * @return 0 stringp or NIL; The default nl generation for the given FORT
     * @return 1 fort-p or NIL; The nl pred showing the agreement of the generated phrase
     * @return 2 non-negative-integer-or-nil-p; The number of demerits, if known.
     * @unknown 3 listp; of justifications for the cached paraphrase.
    returns nil nil if not found.
     */
    @LispMethod(comment = "Returns cached nl-generation value (values String nl-pred) for the given FORT. First,\r\nlooks in the nl generation local hash and returns that value. If not found in the local\r\nhash, looks in the file backed cache, FBC.\r\n\r\n@param FORT\r\n\t\tThe fort we want to look up the nl generation for\r\n@param FBC\r\n\t\tThe file backed cache of nl generations to verify. The file backed cache\r\n\t\tshould be of the form Key:fort -> Value:(cons string nl-pred).\r\n@return 0 stringp or NIL; The default nl generation for the given FORT\r\n@return 1 fort-p or NIL; The nl pred showing the agreement of the generated phrase\r\n@return 2 non-negative-integer-or-nil-p; The number of demerits, if known.\r\n@unknown 3 listp; of justifications for the cached paraphrase.\r\nreturns nil nil if not found.\nReturns cached nl-generation value (values String nl-pred) for the given FORT. First,\nlooks in the nl generation local hash and returns that value. If not found in the local\nhash, looks in the file backed cache, FBC.")
    public static SubLObject nl_generation_cache_lookup(final SubLObject fort, SubLObject fbc, SubLObject warn_on_errorP) {
        if (fbc == UNPROVIDED) {
            fbc = nl_generation_fort_cache.$english_generation_fort_cache$.getGlobalValue();
        }
        if (warn_on_errorP == UNPROVIDED) {
            warn_on_errorP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject msg = NIL;
        SubLObject info = NIL;
        if ((NIL == nl_generation_fort_cache.nl_generate_cache_exceptionP(fort)) && (NIL != nl_generation_fort_cache.$use_generic_singular_nl_generation_fort_cacheP$.getDynamicValue(thread))) {
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        assert NIL != forts.fort_p(fort) : "! forts.fort_p(fort) " + ("forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) ") + fort;
                        if (fbc.eql(nl_generation_fort_cache.$english_generation_fort_cache$.getGlobalValue()) && (NIL == file_backed_cache.file_backed_cache_p(fbc))) {
                            nl_generation_fort_cache.initialize_nl_generation_caches();
                            fbc = nl_generation_fort_cache.$english_generation_fort_cache$.getGlobalValue();
                        }
                        assert NIL != file_backed_cache.file_backed_cache_p(fbc) : "! file_backed_cache.file_backed_cache_p(fbc) " + ("file_backed_cache.file_backed_cache_p(fbc) " + "CommonSymbols.NIL != file_backed_cache.file_backed_cache_p(fbc) ") + fbc;
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
            if (NIL != msg) {
                if (NIL != warn_on_errorP) {
                    Errors.warn(msg);
                }
                return values(NIL, NIL);
            }
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        info = file_backed_cache.file_backed_cache_lookup(fort, fbc, info, T);
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
            if ((NIL != msg) && (NIL != warn_on_errorP)) {
                Errors.warn(msg);
            }
        }
        if ((((NIL != list_utilities.proper_list_p(info)) && (NIL != list_utilities.lengthE(info, FOUR_INTEGER, UNPROVIDED))) && (NIL != cycl_string.cycl_string_p(info.first()))) && (NIL == cycl_string.cycl_string_equal(nl_generation_fort_cache.$str94$, info.first()))) {
            return subl_promotions.values_list(info);
        }
        if ((info.isCons() && (NIL != cycl_string.cycl_string_p(info.first()))) && (NIL == cycl_string.cycl_string_equal(nl_generation_fort_cache.$str94$, info.first()))) {
            return values(info.first(), info.rest(), NIL, NIL);
        }
        return values(NIL, NIL, NIL, NIL);
    }

    /**
     * Allows one to enter a cached nl generation value for a new fort, or to override a
     * cached value in *ENGLISH-GENERATION-FORT-CACHE*.
     * Stores Key:FORT -> Value:(cons STRING NL-PRED). Any new cache entries
     * are memory-based and ephemeral. If you want to permanently save the value,
     * you'll have to regenerate the file-based cache.
     *
     * @param FORT
     * 		The fort we want to look up the nl generation for, assumes canonicalized
     * 		values.
     * @param STRING
     * 		The nl generation
     * @param NL-PRED
     * 		The nl-pred for the generation
     * @return The nl generation for the given FORT as (values String nl-pred)
     */
    @LispMethod(comment = "Allows one to enter a cached nl generation value for a new fort, or to override a\r\ncached value in *ENGLISH-GENERATION-FORT-CACHE*.\r\nStores Key:FORT -> Value:(cons STRING NL-PRED). Any new cache entries\r\nare memory-based and ephemeral. If you want to permanently save the value,\r\nyou\'ll have to regenerate the file-based cache.\r\n\r\n@param FORT\r\n\t\tThe fort we want to look up the nl generation for, assumes canonicalized\r\n\t\tvalues.\r\n@param STRING\r\n\t\tThe nl generation\r\n@param NL-PRED\r\n\t\tThe nl-pred for the generation\r\n@return The nl generation for the given FORT as (values String nl-pred)\nAllows one to enter a cached nl generation value for a new fort, or to override a\ncached value in *ENGLISH-GENERATION-FORT-CACHE*.\nStores Key:FORT -> Value:(cons STRING NL-PRED). Any new cache entries\nare memory-based and ephemeral. If you want to permanently save the value,\nyou\'ll have to regenerate the file-based cache.")
    public static final SubLObject nl_generation_cache_enter_alt(SubLObject fort, SubLObject string, SubLObject nl_pred, SubLObject demerits, SubLObject justification) {
        if (demerits == UNPROVIDED) {
            demerits = NIL;
        }
        if (justification == UNPROVIDED) {
            justification = NIL;
        }
        SubLTrampolineFile.checkType(fort, FORT_P);
        SubLTrampolineFile.checkType(string, STRINGP);
        if (NIL != nl_pred) {
            SubLTrampolineFile.checkType(nl_pred, FORT_P);
        }
        if (NIL == $english_generation_fort_cache$.getGlobalValue()) {
            {
                SubLObject msg = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                        try {
                            bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                            try {
                                com.cyc.cycjava.cycl.nl_generation_fort_cache.initialize_nl_generation_caches();
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            rebind(Errors.$error_handler$, _prev_bind_0);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                }
                if (NIL != msg) {
                    return values(NIL, NIL);
                }
            }
        }
        return com.cyc.cycjava.cycl.nl_generation_fort_cache.nl_generation_cache_enter_low(fort, string, nl_pred, demerits, justification, $english_generation_fort_cache$.getGlobalValue());
    }

    /**
     * Allows one to enter a cached nl generation value for a new fort, or to override a
     * cached value in *ENGLISH-GENERATION-FORT-CACHE*.
     * Stores Key:FORT -> Value:(cons STRING NL-PRED). Any new cache entries
     * are memory-based and ephemeral. If you want to permanently save the value,
     * you'll have to regenerate the file-based cache.
     *
     * @param FORT
     * 		The fort we want to look up the nl generation for, assumes canonicalized
     * 		values.
     * @param STRING
     * 		The nl generation
     * @param NL-PRED
     * 		The nl-pred for the generation
     * @return The nl generation for the given FORT as (values String nl-pred)
     */
    @LispMethod(comment = "Allows one to enter a cached nl generation value for a new fort, or to override a\r\ncached value in *ENGLISH-GENERATION-FORT-CACHE*.\r\nStores Key:FORT -> Value:(cons STRING NL-PRED). Any new cache entries\r\nare memory-based and ephemeral. If you want to permanently save the value,\r\nyou\'ll have to regenerate the file-based cache.\r\n\r\n@param FORT\r\n\t\tThe fort we want to look up the nl generation for, assumes canonicalized\r\n\t\tvalues.\r\n@param STRING\r\n\t\tThe nl generation\r\n@param NL-PRED\r\n\t\tThe nl-pred for the generation\r\n@return The nl generation for the given FORT as (values String nl-pred)\nAllows one to enter a cached nl generation value for a new fort, or to override a\ncached value in *ENGLISH-GENERATION-FORT-CACHE*.\nStores Key:FORT -> Value:(cons STRING NL-PRED). Any new cache entries\nare memory-based and ephemeral. If you want to permanently save the value,\nyou\'ll have to regenerate the file-based cache.")
    public static SubLObject nl_generation_cache_enter(final SubLObject fort, final SubLObject string, final SubLObject nl_pred, SubLObject demerits, SubLObject justification) {
        if (demerits == UNPROVIDED) {
            demerits = NIL;
        }
        if (justification == UNPROVIDED) {
            justification = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(fort) : "! forts.fort_p(fort) " + ("forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) ") + fort;
        assert NIL != cycl_string.cycl_string_p(string) : "! cycl_string.cycl_string_p(string) " + ("cycl_string.cycl_string_p(string) " + "CommonSymbols.NIL != cycl_string.cycl_string_p(string) ") + string;
        if (((NIL != nl_pred) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == forts.fort_p(nl_pred))) {
            throw new AssertionError(nl_pred);
        }
        if (NIL == nl_generation_fort_cache.$english_generation_fort_cache$.getGlobalValue()) {
            SubLObject msg = NIL;
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        nl_generation_fort_cache.initialize_nl_generation_caches();
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
            if (NIL != msg) {
                return values(NIL, NIL);
            }
        }
        return nl_generation_fort_cache.nl_generation_cache_enter_low(fort, string, nl_pred, demerits, justification, nl_generation_fort_cache.$english_generation_fort_cache$.getGlobalValue());
    }

    public static final SubLObject note_nl_generate_cache_exception_alt(SubLObject fort) {
        set_add(fort, $nl_generation_cache_exceptions$.getGlobalValue());
        return fort;
    }

    public static SubLObject note_nl_generate_cache_exception(final SubLObject fort) {
        set.set_add(fort, nl_generation_fort_cache.$nl_generation_cache_exceptions$.getGlobalValue());
        return fort;
    }

    public static final SubLObject nl_generate_cache_exceptionP_alt(SubLObject fort) {
        return set_memberP(fort, $nl_generation_cache_exceptions$.getGlobalValue());
    }

    public static SubLObject nl_generate_cache_exceptionP(final SubLObject fort) {
        return set.set_memberP(fort, nl_generation_fort_cache.$nl_generation_cache_exceptions$.getGlobalValue());
    }

    public static final SubLObject clear_nl_generation_cache_exceptions_alt() {
        return clear_set($nl_generation_cache_exceptions$.getGlobalValue());
    }

    public static SubLObject clear_nl_generation_cache_exceptions() {
        return set.clear_set(nl_generation_fort_cache.$nl_generation_cache_exceptions$.getGlobalValue());
    }

    /**
     * Clears any cached nl generation value for FORT in *ENGLISH-GENERATION-FORT-CACHE*.
     */
    @LispMethod(comment = "Clears any cached nl generation value for FORT in *ENGLISH-GENERATION-FORT-CACHE*.")
    public static final SubLObject nl_generation_cache_clear_alt(SubLObject fort) {
        SubLTrampolineFile.checkType(fort, FORT_P);
        {
            SubLObject fbc = $english_generation_fort_cache$.getGlobalValue();
            if (NIL == $english_generation_fort_cache$.getGlobalValue()) {
                {
                    SubLObject msg = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                            try {
                                bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                                try {
                                    com.cyc.cycjava.cycl.nl_generation_fort_cache.initialize_nl_generation_caches();
                                    fbc = $english_generation_fort_cache$.getGlobalValue();
                                } catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                rebind(Errors.$error_handler$, _prev_bind_0);
                            }
                        }
                    } catch (Throwable ccatch_env_var) {
                        msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                    }
                    if (NIL != msg) {
                        return values(NIL, NIL);
                    }
                }
            }
            com.cyc.cycjava.cycl.nl_generation_fort_cache.note_nl_generate_cache_exception(fort);
            return com.cyc.cycjava.cycl.nl_generation_fort_cache.nl_generation_cache_enter_low(fort, NIL, NIL, NIL, NIL, fbc);
        }
    }

    /**
     * Clears any cached nl generation value for FORT in *ENGLISH-GENERATION-FORT-CACHE*.
     */
    @LispMethod(comment = "Clears any cached nl generation value for FORT in *ENGLISH-GENERATION-FORT-CACHE*.")
    public static SubLObject nl_generation_cache_clear(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(fort) : "! forts.fort_p(fort) " + ("forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) ") + fort;
        SubLObject fbc = nl_generation_fort_cache.$english_generation_fort_cache$.getGlobalValue();
        if (NIL == nl_generation_fort_cache.$english_generation_fort_cache$.getGlobalValue()) {
            SubLObject msg = NIL;
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        nl_generation_fort_cache.initialize_nl_generation_caches();
                        fbc = nl_generation_fort_cache.$english_generation_fort_cache$.getGlobalValue();
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
            if (NIL != msg) {
                return values(NIL, NIL);
            }
        }
        if (NIL == file_backed_cache.file_backed_cache_p(fbc)) {
            return NIL;
        }
        nl_generation_fort_cache.note_nl_generate_cache_exception(fort);
        return nl_generation_fort_cache.nl_generation_cache_enter_low(fort, NIL, NIL, NIL, NIL, fbc);
    }

    public static final SubLObject nl_generation_cache_enter_low_alt(SubLObject fort, SubLObject string, SubLObject nl_pred, SubLObject demerits, SubLObject justification, SubLObject fbc) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject data = (NIL != $rich_nl_generation_cache_styleP$.getDynamicValue(thread)) ? ((SubLObject) (list(string, nl_pred, demerits, justification))) : cons(string, nl_pred);
                return file_backed_cache.file_backed_cache_enter(fort, data, fbc);
            }
        }
    }

    public static SubLObject nl_generation_cache_enter_low(final SubLObject fort, final SubLObject string, final SubLObject nl_pred, final SubLObject demerits, final SubLObject justification, final SubLObject fbc) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject data = (NIL != nl_generation_fort_cache.$rich_nl_generation_cache_styleP$.getDynamicValue(thread)) ? list(string, nl_pred, demerits, justification) : cons(string, nl_pred);
        return file_backed_cache.file_backed_cache_enter(fort, data, fbc);
    }

    public static final SubLObject internal_test_nl_generation_of_collection_instances_alt(SubLObject collection, SubLObject max_number) {
        if (max_number == UNPROVIDED) {
            max_number = $int$10000;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = pph_vars.$pph_replace_bulleted_list_tagsP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = pph_vars.$paraphrase_precision$.currentBinding(thread);
                    SubLObject _prev_bind_3 = pph_vars.$pph_terse_mt_scopeP$.currentBinding(thread);
                    SubLObject _prev_bind_4 = pph_vars.$pph_maximize_linksP$.currentBinding(thread);
                    SubLObject _prev_bind_5 = pph_vars.$pph_link_arg0P$.currentBinding(thread);
                    SubLObject _prev_bind_6 = pph_vars.$pph_use_smart_variable_replacementP$.currentBinding(thread);
                    SubLObject _prev_bind_7 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                    SubLObject _prev_bind_8 = pph_vars.$pph_use_title_capitalizationP$.currentBinding(thread);
                    SubLObject _prev_bind_9 = pph_vars.$pph_use_indexical_datesP$.currentBinding(thread);
                    SubLObject _prev_bind_10 = pph_vars.$pph_addressee$.currentBinding(thread);
                    SubLObject _prev_bind_11 = pph_vars.$pph_speaker$.currentBinding(thread);
                    try {
                        pph_vars.$pph_use_bulleted_listsP$.bind(T, thread);
                        pph_vars.$pph_replace_bulleted_list_tagsP$.bind(NIL, thread);
                        pph_vars.$paraphrase_precision$.bind(NIL, thread);
                        pph_vars.$pph_terse_mt_scopeP$.bind(T, thread);
                        pph_vars.$pph_maximize_linksP$.bind(T, thread);
                        pph_vars.$pph_link_arg0P$.bind(T, thread);
                        pph_vars.$pph_use_smart_variable_replacementP$.bind(T, thread);
                        pph_vars.$pph_demerit_cutoff$.bind(number_utilities.positive_infinity(), thread);
                        pph_vars.$pph_use_title_capitalizationP$.bind(NIL, thread);
                        pph_vars.$pph_use_indexical_datesP$.bind(NIL, thread);
                        pph_vars.$pph_addressee$.bind($UNKNOWN, thread);
                        pph_vars.$pph_speaker$.bind($UNKNOWN, thread);
                        result = api_widgets.get_example_instances_as_renderings_new(collection, max_number, $$EverythingPSC, $IMMEDIATE_INSTANTIATIONS, $UPWARD_CLOSURE, T, $NONE, $$TerrorismParaphraseMt, $DEFAULT);
                    } finally {
                        pph_vars.$pph_speaker$.rebind(_prev_bind_11, thread);
                        pph_vars.$pph_addressee$.rebind(_prev_bind_10, thread);
                        pph_vars.$pph_use_indexical_datesP$.rebind(_prev_bind_9, thread);
                        pph_vars.$pph_use_title_capitalizationP$.rebind(_prev_bind_8, thread);
                        pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_7, thread);
                        pph_vars.$pph_use_smart_variable_replacementP$.rebind(_prev_bind_6, thread);
                        pph_vars.$pph_link_arg0P$.rebind(_prev_bind_5, thread);
                        pph_vars.$pph_maximize_linksP$.rebind(_prev_bind_4, thread);
                        pph_vars.$pph_terse_mt_scopeP$.rebind(_prev_bind_3, thread);
                        pph_vars.$paraphrase_precision$.rebind(_prev_bind_2, thread);
                        pph_vars.$pph_replace_bulleted_list_tagsP$.rebind(_prev_bind_1, thread);
                        pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject internal_test_nl_generation_of_collection_instances(final SubLObject collection, SubLObject max_number) {
        if (max_number == UNPROVIDED) {
            max_number = nl_generation_fort_cache.$int$10000;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_replace_bulleted_list_tagsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_vars.$paraphrase_precision$.currentBinding(thread);
        final SubLObject _prev_bind_4 = pph_vars.$pph_terse_mt_scopeP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = pph_vars.$pph_maximize_linksP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = pph_vars.$pph_link_arg0P$.currentBinding(thread);
        final SubLObject _prev_bind_7 = pph_vars.$pph_use_smart_variable_replacementP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
        final SubLObject _prev_bind_9 = pph_vars.$pph_use_title_capitalizationP$.currentBinding(thread);
        final SubLObject _prev_bind_10 = pph_vars.$pph_use_indexical_datesP$.currentBinding(thread);
        final SubLObject _prev_bind_11 = pph_vars.$pph_addressee$.currentBinding(thread);
        final SubLObject _prev_bind_12 = pph_vars.$pph_speaker$.currentBinding(thread);
        try {
            pph_vars.$pph_use_bulleted_listsP$.bind(T, thread);
            pph_vars.$pph_replace_bulleted_list_tagsP$.bind(NIL, thread);
            pph_vars.$paraphrase_precision$.bind(NIL, thread);
            pph_vars.$pph_terse_mt_scopeP$.bind(T, thread);
            pph_vars.$pph_maximize_linksP$.bind(T, thread);
            pph_vars.$pph_link_arg0P$.bind(T, thread);
            pph_vars.$pph_use_smart_variable_replacementP$.bind(T, thread);
            pph_vars.$pph_demerit_cutoff$.bind(number_utilities.positive_infinity(), thread);
            pph_vars.$pph_use_title_capitalizationP$.bind(NIL, thread);
            pph_vars.$pph_use_indexical_datesP$.bind(NIL, thread);
            pph_vars.$pph_addressee$.bind($UNKNOWN, thread);
            pph_vars.$pph_speaker$.bind($UNKNOWN, thread);
            result = api_widgets.get_example_instances_as_renderings_new(collection, max_number, nl_generation_fort_cache.$$EverythingPSC, $IMMEDIATE_INSTANTIATIONS, $UPWARD_CLOSURE, T, $NONE, nl_generation_fort_cache.$$TerrorismParaphraseMt, $DEFAULT);
        } finally {
            pph_vars.$pph_speaker$.rebind(_prev_bind_12, thread);
            pph_vars.$pph_addressee$.rebind(_prev_bind_11, thread);
            pph_vars.$pph_use_indexical_datesP$.rebind(_prev_bind_10, thread);
            pph_vars.$pph_use_title_capitalizationP$.rebind(_prev_bind_9, thread);
            pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_8, thread);
            pph_vars.$pph_use_smart_variable_replacementP$.rebind(_prev_bind_7, thread);
            pph_vars.$pph_link_arg0P$.rebind(_prev_bind_6, thread);
            pph_vars.$pph_maximize_linksP$.rebind(_prev_bind_5, thread);
            pph_vars.$pph_terse_mt_scopeP$.rebind(_prev_bind_4, thread);
            pph_vars.$paraphrase_precision$.rebind(_prev_bind_3, thread);
            pph_vars.$pph_replace_bulleted_list_tagsP$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject test_nl_generation_of_collection_alt(SubLObject v_const, SubLObject max_number) {
        if (max_number == UNPROVIDED) {
            max_number = $int$10000;
        }
        {
            SubLObject before_cache_lookup_count = pph_methods.select_string_method_count(NL_GENERATION_CACHE_METHOD);
            SubLObject result = com.cyc.cycjava.cycl.nl_generation_fort_cache.internal_test_nl_generation_of_collection_instances(v_const, max_number);
            SubLObject after_cache_lookup_count = pph_methods.select_string_method_count(NL_GENERATION_CACHE_METHOD);
            SubLObject new_lookup_count = subtract(after_cache_lookup_count, before_cache_lookup_count);
            SubLObject result_count = length(result);
            SubLObject ratio = (NIL != result) ? ((SubLObject) (divide(new_lookup_count, result_count))) : MINUS_ONE_INTEGER;
            return ratio;
        }
    }

    public static SubLObject test_nl_generation_of_collection(final SubLObject v_const, SubLObject max_number) {
        if (max_number == UNPROVIDED) {
            max_number = nl_generation_fort_cache.$int$10000;
        }
        final SubLObject before_cache_lookup_count = pph_methods.select_string_method_count(NL_GENERATION_CACHE_METHOD);
        final SubLObject result = nl_generation_fort_cache.internal_test_nl_generation_of_collection_instances(v_const, max_number);
        final SubLObject after_cache_lookup_count = pph_methods.select_string_method_count(NL_GENERATION_CACHE_METHOD);
        final SubLObject new_lookup_count = subtract(after_cache_lookup_count, before_cache_lookup_count);
        final SubLObject result_count = length(result);
        final SubLObject ratio = (NIL != result) ? divide(new_lookup_count, result_count) : MINUS_ONE_INTEGER;
        return ratio;
    }

    public static final SubLObject test_nl_generation_of_collection_instances_alt(SubLObject max_count, SubLObject max_instances) {
        if (max_count == UNPROVIDED) {
            max_count = ZERO_INTEGER;
        }
        if (max_instances == UNPROVIDED) {
            max_instances = TEN_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject bad_forts = NIL;
                SubLObject result = NIL;
                SubLObject doneP = NIL;
                SubLObject gc_count = ZERO_INTEGER;
                SubLObject cur_count = ZERO_INTEGER;
                {
                    SubLObject _prev_bind_0 = pph_vars.$pph_track_discourse_referentsP$.currentBinding(thread);
                    try {
                        pph_vars.$pph_track_discourse_referentsP$.bind(NIL, thread);
                        {
                            SubLObject idx = do_constants_table();
                            SubLObject total = id_index_count(idx);
                            SubLObject sofar = ZERO_INTEGER;
                            SubLTrampolineFile.checkType($str_alt161$Finding_collections_that_don_t_us, STRINGP);
                            {
                                SubLObject _prev_bind_0_66 = $last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                try {
                                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    $last_percent_progress_prediction$.bind(NIL, thread);
                                    $within_noting_percent_progress$.bind(T, thread);
                                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                                    noting_percent_progress_preamble($str_alt161$Finding_collections_that_don_t_us);
                                    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                                        {
                                            SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                            SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                            SubLObject v_const = NIL;
                                            while ((NIL != id) && (NIL == doneP)) {
                                                v_const = do_id_index_state_object(idx, $SKIP, id, state_var);
                                                if (NIL != do_id_index_id_and_object_validP(id, v_const, $SKIP)) {
                                                    note_percent_progress(sofar, total);
                                                    sofar = add(sofar, ONE_INTEGER);
                                                    if ((NIL != fort_types_interface.collection_p(v_const)) && (NIL == com.cyc.cycjava.cycl.nl_generation_fort_cache.dont_want_to_generate_this_oneP(v_const))) {
                                                        if (ZERO_INTEGER.numG(length(result))) {
                                                            gc_count = add(gc_count, ONE_INTEGER);
                                                            if (gc_count.numG($int$50)) {
                                                                gc_count = ZERO_INTEGER;
                                                            }
                                                        }
                                                        if (max_count.numG(ZERO_INTEGER)) {
                                                            cur_count = add(cur_count, ONE_INTEGER);
                                                            if (cur_count.numGE(max_count)) {
                                                                doneP = T;
                                                            }
                                                        }
                                                        {
                                                            SubLObject new_lookup_counts_per_result = com.cyc.cycjava.cycl.nl_generation_fort_cache.test_nl_generation_of_collection(v_const, max_instances);
                                                            format(T, $str_alt163$Testing___A__generate_cache_ratio, v_const, new_lookup_counts_per_result);
                                                            if (new_lookup_counts_per_result.numL(ZERO_INTEGER)) {
                                                            } else {
                                                                if (new_lookup_counts_per_result.numG($float$1_2)) {
                                                                    format(T, $str_alt165$__Extra_cache_hits_for__S___S_per, v_const, new_lookup_counts_per_result);
                                                                    bad_forts = cons(v_const, bad_forts);
                                                                } else {
                                                                    if (new_lookup_counts_per_result.numL($float$0_8)) {
                                                                        format(T, $str_alt167$__Insufficient_cache_hits_for__S_, v_const, new_lookup_counts_per_result);
                                                                        bad_forts = cons(v_const, bad_forts);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                id = do_id_index_next_id(idx, T, id, state_var);
                                                state_var = do_id_index_next_state(idx, T, id, state_var);
                                            } 
                                        }
                                    }
                                    noting_percent_progress_postamble();
                                } finally {
                                    $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                    $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                    $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                    $last_percent_progress_index$.rebind(_prev_bind_0_66, thread);
                                }
                            }
                        }
                    } finally {
                        pph_vars.$pph_track_discourse_referentsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return bad_forts;
            }
        }
    }

    public static SubLObject test_nl_generation_of_collection_instances(SubLObject max_count, SubLObject max_instances) {
        if (max_count == UNPROVIDED) {
            max_count = ZERO_INTEGER;
        }
        if (max_instances == UNPROVIDED) {
            max_instances = TEN_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject bad_forts = NIL;
        final SubLObject result = NIL;
        SubLObject doneP = NIL;
        SubLObject gc_count = ZERO_INTEGER;
        SubLObject cur_count = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = pph_vars.$pph_track_discourse_referentsP$.currentBinding(thread);
        try {
            pph_vars.$pph_track_discourse_referentsP$.bind(NIL, thread);
            final SubLObject idx = do_constants_table();
            final SubLObject mess = nl_generation_fort_cache.$str166$Finding_collections_that_don_t_us;
            final SubLObject total = id_index_count(idx);
            SubLObject sofar = ZERO_INTEGER;
            assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
            final SubLObject _prev_bind_0_$96 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(mess);
                    final SubLObject idx_$97 = idx;
                    if (NIL == id_index_objects_empty_p(idx_$97, $SKIP)) {
                        final SubLObject idx_$98 = idx_$97;
                        if (NIL == id_index_dense_objects_empty_p(idx_$98, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$98);
                            final SubLObject backwardP_var = NIL;
                            final SubLObject length = length(vector_var);
                            SubLObject current;
                            final SubLObject datum = current = (NIL != backwardP_var) ? list(subtract(length, ONE_INTEGER), MINUS_ONE_INTEGER, MINUS_ONE_INTEGER) : list(ZERO_INTEGER, length, ONE_INTEGER);
                            SubLObject start = NIL;
                            SubLObject end = NIL;
                            SubLObject delta = NIL;
                            destructuring_bind_must_consp(current, datum, nl_generation_fort_cache.$list96);
                            start = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, nl_generation_fort_cache.$list96);
                            end = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, nl_generation_fort_cache.$list96);
                            delta = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if (NIL == doneP) {
                                    SubLObject end_var;
                                    SubLObject id;
                                    SubLObject v_const;
                                    SubLObject new_lookup_counts_per_result;
                                    for (end_var = end, id = NIL, id = start; (NIL == doneP) && (NIL == subl_macros.do_numbers_endtest(id, delta, end_var)); id = add(id, delta)) {
                                        v_const = aref(vector_var, id);
                                        if ((NIL == id_index_tombstone_p(v_const)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                            if (NIL != id_index_tombstone_p(v_const)) {
                                                v_const = $SKIP;
                                            }
                                            if ((NIL != fort_types_interface.collection_p(v_const)) && (NIL == nl_generation_fort_cache.dont_want_to_generate_this_oneP(v_const))) {
                                                if (ZERO_INTEGER.numG(length(result))) {
                                                    gc_count = add(gc_count, ONE_INTEGER);
                                                    if (gc_count.numG(nl_generation_fort_cache.$int$50)) {
                                                        gc_count = ZERO_INTEGER;
                                                    }
                                                }
                                                if (max_count.numG(ZERO_INTEGER)) {
                                                    cur_count = add(cur_count, ONE_INTEGER);
                                                    if (cur_count.numGE(max_count)) {
                                                        doneP = T;
                                                    }
                                                }
                                                new_lookup_counts_per_result = nl_generation_fort_cache.test_nl_generation_of_collection(v_const, max_instances);
                                                format(T, nl_generation_fort_cache.$str169$Testing___A__generate_cache_ratio, v_const, new_lookup_counts_per_result);
                                                if (!new_lookup_counts_per_result.numL(ZERO_INTEGER)) {
                                                    if (new_lookup_counts_per_result.numG(nl_generation_fort_cache.$float$1_2)) {
                                                        format(T, nl_generation_fort_cache.$str171$__Extra_cache_hits_for__S___S_per, v_const, new_lookup_counts_per_result);
                                                        bad_forts = cons(v_const, bad_forts);
                                                    } else
                                                        if (new_lookup_counts_per_result.numL(nl_generation_fort_cache.$float$0_8)) {
                                                            format(T, nl_generation_fort_cache.$str173$__Insufficient_cache_hits_for__S_, v_const, new_lookup_counts_per_result);
                                                            bad_forts = cons(v_const, bad_forts);
                                                        }

                                                }
                                            }
                                            sofar = add(sofar, ONE_INTEGER);
                                            note_percent_progress(sofar, total);
                                        }
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, nl_generation_fort_cache.$list96);
                            }
                        }
                        final SubLObject idx_$99 = idx_$97;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$99)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$99);
                            SubLObject id2 = id_index_sparse_id_threshold(idx_$99);
                            final SubLObject end_id = id_index_next_id(idx_$99);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (id2.numL(end_id) && (NIL == doneP)) {
                                final SubLObject v_const2 = gethash_without_values(id2, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(v_const2))) {
                                    if ((NIL != fort_types_interface.collection_p(v_const2)) && (NIL == nl_generation_fort_cache.dont_want_to_generate_this_oneP(v_const2))) {
                                        if (ZERO_INTEGER.numG(length(result))) {
                                            gc_count = add(gc_count, ONE_INTEGER);
                                            if (gc_count.numG(nl_generation_fort_cache.$int$50)) {
                                                gc_count = ZERO_INTEGER;
                                            }
                                        }
                                        if (max_count.numG(ZERO_INTEGER)) {
                                            cur_count = add(cur_count, ONE_INTEGER);
                                            if (cur_count.numGE(max_count)) {
                                                doneP = T;
                                            }
                                        }
                                        final SubLObject new_lookup_counts_per_result2 = nl_generation_fort_cache.test_nl_generation_of_collection(v_const2, max_instances);
                                        format(T, nl_generation_fort_cache.$str169$Testing___A__generate_cache_ratio, v_const2, new_lookup_counts_per_result2);
                                        if (!new_lookup_counts_per_result2.numL(ZERO_INTEGER)) {
                                            if (new_lookup_counts_per_result2.numG(nl_generation_fort_cache.$float$1_2)) {
                                                format(T, nl_generation_fort_cache.$str171$__Extra_cache_hits_for__S___S_per, v_const2, new_lookup_counts_per_result2);
                                                bad_forts = cons(v_const2, bad_forts);
                                            } else
                                                if (new_lookup_counts_per_result2.numL(nl_generation_fort_cache.$float$0_8)) {
                                                    format(T, nl_generation_fort_cache.$str173$__Insufficient_cache_hits_for__S_, v_const2, new_lookup_counts_per_result2);
                                                    bad_forts = cons(v_const2, bad_forts);
                                                }

                                        }
                                    }
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                                id2 = add(id2, ONE_INTEGER);
                            } 
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$97 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$97, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0_$96, thread);
            }
        } finally {
            pph_vars.$pph_track_discourse_referentsP$.rebind(_prev_bind_0, thread);
        }
        return bad_forts;
    }

    public static SubLObject declare_nl_generation_fort_cache_file() {
        declareMacro("with_default_nl_generation_cache_file_path", "WITH-DEFAULT-NL-GENERATION-CACHE-FILE-PATH");
        declareFunction("get_english_generation_fort_cache", "GET-ENGLISH-GENERATION-FORT-CACHE", 0, 0, false);
        declareFunction("set_temporary_english_generation_fort_cache", "SET-TEMPORARY-ENGLISH-GENERATION-FORT-CACHE", 1, 0, false);
        declareFunction("restore_english_generation_fort_cache", "RESTORE-ENGLISH-GENERATION-FORT-CACHE", 2, 0, false);
        declareFunction("get_default_nl_generation_cache_file_path", "GET-DEFAULT-NL-GENERATION-CACHE-FILE-PATH", 0, 1, false);
        declareFunction("get_latest_nl_generation_cache_file_path", "GET-LATEST-NL-GENERATION-CACHE-FILE-PATH", 0, 0, false);
        declareFunction("get_nl_generation_cache_file_path_internal", "GET-NL-GENERATION-CACHE-FILE-PATH-INTERNAL", 1, 0, false);
        declareFunction("enable_nl_generation_cache_memory_mapping", "ENABLE-NL-GENERATION-CACHE-MEMORY-MAPPING", 0, 0, false);
        declareFunction("disable_nl_generation_cache_memory_mapping", "DISABLE-NL-GENERATION-CACHE-MEMORY-MAPPING", 0, 0, false);
        declareFunction("nl_generation_cache_memory_mappedP", "NL-GENERATION-CACHE-MEMORY-MAPPED?", 0, 0, false);
        declareFunction("initialize_nl_generation_caches", "INITIALIZE-NL-GENERATION-CACHES", 0, 0, false);
        declareFunction("ensure_nl_generation_fort_cache_is_best_available", "ENSURE-NL-GENERATION-FORT-CACHE-IS-BEST-AVAILABLE", 0, 0, false);
        declareFunction("reconnect_english_generation_fort_cache", "RECONNECT-ENGLISH-GENERATION-FORT-CACHE", 0, 0, false);
        declareFunction("english_generation_fort_cache_for_current_kbP", "ENGLISH-GENERATION-FORT-CACHE-FOR-CURRENT-KB?", 0, 0, false);
        declareFunction("english_generation_fort_cache_most_recent_availableP", "ENGLISH-GENERATION-FORT-CACHE-MOST-RECENT-AVAILABLE?", 0, 0, false);
        declareFunction("reset_nl_generation_caches", "RESET-NL-GENERATION-CACHES", 0, 0, false);
        declareFunction("nl_generation_fort_cache_nl_preds", "NL-GENERATION-FORT-CACHE-NL-PREDS", 0, 1, false);
        declareFunction("nl_generation_fort_cache_paraphrase_mt", "NL-GENERATION-FORT-CACHE-PARAPHRASE-MT", 0, 1, false);
        declareFunction("default_nl_generation_fort_cache_paraphrase_mt", "DEFAULT-NL-GENERATION-FORT-CACHE-PARAPHRASE-MT", 0, 0, false);
        declareFunction("nl_fort_generation_task_success_code", "NL-FORT-GENERATION-TASK-SUCCESS-CODE", 0, 0, false);
        declareFunction("nl_fort_generation_task_failure_code", "NL-FORT-GENERATION-TASK-FAILURE-CODE", 0, 0, false);
        declareFunction("create_cached_nl_generation_for_all_forts", "CREATE-CACHED-NL-GENERATION-FOR-ALL-FORTS", 0, 4, false);
        declareFunction("create_nl_generation_fht_from_data", "CREATE-NL-GENERATION-FHT-FROM-DATA", 0, 4, false);
        declareFunction("create_filtered_nl_generation_fht_from_data", "CREATE-FILTERED-NL-GENERATION-FHT-FROM-DATA", 1, 4, false);
        declareFunction("find_or_create_nl_generation_fort_cache_working_directory", "FIND-OR-CREATE-NL-GENERATION-FORT-CACHE-WORKING-DIRECTORY", 1, 0, false);
        declareFunction("nl_generation_fort_cache_subdirectory", "NL-GENERATION-FORT-CACHE-SUBDIRECTORY", 2, 2, false);
        declareFunction("assign_next_fort_paraphrase_cache_generation_task_and_wait_for_result", "ASSIGN-NEXT-FORT-PARAPHRASE-CACHE-GENERATION-TASK-AND-WAIT-FOR-RESULT", 0, 0, false);
        declareFunction("note_nl_fort_generation_task_failed", "NOTE-NL-FORT-GENERATION-TASK-FAILED", 1, 0, false);
        declareFunction("nl_fort_generation_task_failedP", "NL-FORT-GENERATION-TASK-FAILED?", 1, 0, false);
        declareFunction("wake_up_fort_paraphrase_cache_taskmaster", "WAKE-UP-FORT-PARAPHRASE-CACHE-TASKMASTER", 1, 0, false);
        declareFunction("do_next_fort_paraphrase_cache_generation_task", "DO-NEXT-FORT-PARAPHRASE-CACHE-GENERATION-TASK", 0, 0, false);
        declareFunction("do_fort_paraphrase_cache_generation_for_directory", "DO-FORT-PARAPHRASE-CACHE-GENERATION-FOR-DIRECTORY", 3, 0, false);
        declareFunction("find_nl_generation_assignment_directory", "FIND-NL-GENERATION-ASSIGNMENT-DIRECTORY", 0, 0, false);
        declareFunction("recopy_nl_generation_fort_cache_results", "RECOPY-NL-GENERATION-FORT-CACHE-RESULTS", 2, 0, false);
        declareFunction("do_fort_paraphrase_cache_generation_for_directory_internal", "DO-FORT-PARAPHRASE-CACHE-GENERATION-FOR-DIRECTORY-INTERNAL", 6, 0, false);
        declareFunction("verify_cached_paraphrases", "VERIFY-CACHED-PARAPHRASES", 0, 2, false);
        declareFunction("verify_cached_paraphrase", "VERIFY-CACHED-PARAPHRASE", 1, 0, false);
        declareFunction("nl_generation_fort_cache_data_generatedP", "NL-GENERATION-FORT-CACHE-DATA-GENERATED?", 0, 0, false);
        declareFunction("trim_pph_memoization_state_caches", "TRIM-PPH-MEMOIZATION-STATE-CACHES", 0, 1, false);
        declareFunction("print_nl_generation_cache_times", "PRINT-NL-GENERATION-CACHE-TIMES", 7, 0, false);
        declareFunction("generate_nl_generation_cache_time_plots", "GENERATE-NL-GENERATION-CACHE-TIME-PLOTS", 2, 0, false);
        declareFunction("stitch_together_nl_generation_cache_time_plots", "STITCH-TOGETHER-NL-GENERATION-CACHE-TIME-PLOTS", 0, 0, false);
        declareFunction("nanoseconds_per_second", "NANOSECONDS-PER-SECOND", 0, 0, false);
        declareFunction("paraphrase_fort_for_cache", "PARAPHRASE-FORT-FOR-CACHE", 1, 2, false);
        declareFunction("nl_generation_fort_cache_stale_for_fortP", "NL-GENERATION-FORT-CACHE-STALE-FOR-FORT?", 1, 0, false);
        declareFunction("estimate_nl_generation_cache_stale_percentage", "ESTIMATE-NL-GENERATION-CACHE-STALE-PERCENTAGE", 0, 3, false);
        declareFunction("verify_cached_nl_generation_for_all_forts", "VERIFY-CACHED-NL-GENERATION-FOR-ALL-FORTS", 0, 1, false);
        declareFunction("update_cached_nl_generation_for_all_forts", "UPDATE-CACHED-NL-GENERATION-FOR-ALL-FORTS", 1, 2, false);
        declareFunction("nart_sister_to_gaf_ratio", "NART-SISTER-TO-GAF-RATIO", 1, 0, false);
        declareFunction("dont_want_to_generate_this_oneP", "DONT-WANT-TO-GENERATE-THIS-ONE?", 1, 0, false);
        declareFunction("nart_non_wffP", "NART-NON-WFF?", 1, 0, false);
        declareFunction("nl_generation_cache_lookup", "NL-GENERATION-CACHE-LOOKUP", 1, 2, false);
        declareFunction("nl_generation_cache_enter", "NL-GENERATION-CACHE-ENTER", 3, 2, false);
        declareFunction("note_nl_generate_cache_exception", "NOTE-NL-GENERATE-CACHE-EXCEPTION", 1, 0, false);
        declareFunction("nl_generate_cache_exceptionP", "NL-GENERATE-CACHE-EXCEPTION?", 1, 0, false);
        declareFunction("clear_nl_generation_cache_exceptions", "CLEAR-NL-GENERATION-CACHE-EXCEPTIONS", 0, 0, false);
        declareFunction("nl_generation_cache_clear", "NL-GENERATION-CACHE-CLEAR", 1, 0, false);
        declareFunction("nl_generation_cache_enter_low", "NL-GENERATION-CACHE-ENTER-LOW", 6, 0, false);
        declareFunction("internal_test_nl_generation_of_collection_instances", "INTERNAL-TEST-NL-GENERATION-OF-COLLECTION-INSTANCES", 1, 1, false);
        declareFunction("test_nl_generation_of_collection", "TEST-NL-GENERATION-OF-COLLECTION", 1, 1, false);
        declareFunction("test_nl_generation_of_collection_instances", "TEST-NL-GENERATION-OF-COLLECTION-INSTANCES", 0, 2, false);
        return NIL;
    }

    static private final SubLList $list_alt1 = list(makeString("application.file-backed-cache.generic-singular-nl-generation-fort-cache-file-name"));

    static private final SubLString $str_alt3$generic_singular_nl_generation_fo = makeString("generic-singular-nl-generation-fort-cache.fht");

    static private final SubLString $str_alt5$nl_generation_fht_lock = makeString("nl-generation-fht-lock");

    static private final SubLList $list_alt6 = list(list(makeSymbol("FILENAME")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt11 = list(list(makeSymbol("GET-ENGLISH-GENERATION-FORT-CACHE")));

    static private final SubLList $list_alt12 = list(makeSymbol("*ENGLISH-GENERATION-BASE-FILE-NAME*"));

    static private final SubLString $str_alt19$_4__0d = makeString("~4,'0d");

    static private final SubLString $str_alt20$_ = makeString("/");

    static private final SubLList $list_alt25 = list(reader_make_constant_shell("nonPlural-Generic"));

    static private final SubLString $str_alt32$tmp_ = makeString("tmp/");

    static private final SubLString $str_alt33$Gen_template_store_is_stale_ = makeString("Gen-template store is stale.");

    static private final SubLString $str_alt34$Generating_nl_cache_to_file___A = makeString("Generating nl cache to file: ~A");

    static private final SubLString $str_alt36$fort_count_cfasl = makeString("fort-count.cfasl");

    static private final SubLString $str_alt37$Generating_FORT_paraphrases__ = makeString("Generating FORT paraphrases (");

    static private final SubLString $str_alt38$____ = makeString(")...");

    static private final SubLString $str_alt39$_S_already_exists_ = makeString("~S already exists.");

    static private final SubLString $str_alt40$Compiling_file_hashtable_from_par = makeString("Compiling file hashtable from paraphrase data...");

    static private final SubLString $str_alt42$_done = makeString("/done");

    static private final SubLString $str_alt43$Skipping_assignment_directory_wit = makeString("Skipping assignment directory with no \"done\" file: ~S");

    static private final SubLString $str_alt44$build_kb_loaded_cfasl = makeString("build-kb-loaded.cfasl");

    static private final SubLString $str_alt45$_results_cfasl = makeString("/results.cfasl");

    static private final SubLString $str_alt46$_fast_results_cfasl = makeString("/fast-results.cfasl");

    static private final SubLString $str_alt47$Using_results_file__S = makeString("Using results file ~S");

    static private final SubLString $str_alt49$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt51$Non_FORT__S_in_paraphrase_data___ = makeString("Non-FORT ~S in paraphrase data: ~S");

    static private final SubLString $str_alt52$Bad_paraphrase_data_for__S_in__S_ = makeString("Bad paraphrase data for ~S in ~S:~% ~S");

    static private final SubLString $str_alt54$_Anl_generation_cache_work__4__0D = makeString("~Anl-generation-cache-work/~4,'0D/");

    static private final SubLString $str_alt56$assignment_size_cfasl = makeString("assignment-size.cfasl");

    static private final SubLString $str_alt57$paraphrase_mt_cfasl = makeString("paraphrase-mt.cfasl");

    static private final SubLString $str_alt58$Assignment_size_is__S__Must_be_a_ = makeString("Assignment size is ~S. Must be a multiple of ~D.");

    static private final SubLString $str_alt59$_ = makeString("~");

    static private final SubLString $str_alt60$__0D__ = makeString(",'0D-~");

    static private final SubLString $str_alt61$__0D_ = makeString(",'0D/");

    static private final SubLString $str_alt62$error_output_log = makeString("error-output.log");

    static private final SubLString $str_alt63$__Assigning_task__S__ = makeString("~&Assigning task ~S~%");

    static private final SubLString $str_alt66$__Just_dequeued__S_after_enqueuei = makeString("~&Just dequeued ~S after enqueueing ~S~%");

    public static final SubLObject init_nl_generation_fort_cache_file_alt() {
        deflexical("*ENGLISH-GENERATION-FORT-CACHE*", NIL != boundp($english_generation_fort_cache$) ? ((SubLObject) ($english_generation_fort_cache$.getGlobalValue())) : NIL);
        defparameter("*ENGLISH-GENERATION-FHT-NAME*", NIL);
        defparameter("*USE-GENERIC-SINGULAR-NL-GENERATION-FORT-CACHE?*", T);
        deflexical("*ENGLISH-GENERATION-BASE-FILE-NAME*", red_infrastructure_macros.red_def_helper($list_alt1.isSymbol() ? ((SubLObject) (symbol_value($list_alt1))) : $list_alt1, $english_generation_base_file_name$, $str_alt3$generic_singular_nl_generation_fo.isSymbol() ? ((SubLObject) (symbol_value($str_alt3$generic_singular_nl_generation_fo))) : $str_alt3$generic_singular_nl_generation_fo, $LEXICAL, UNPROVIDED));
        deflexical("*NL-GENERATION-FHT-LOCK*", make_lock($str_alt5$nl_generation_fht_lock));
        deflexical("*PRELOAD-NL-GENERATION-CACHES?*", NIL);
        deflexical("*NL-GENERATION-FORT-CACHE-GENERATOR-TIMESTAMP*", numeric_date_utilities.timestamp(UNPROVIDED, UNPROVIDED));
        defparameter("*NL-GENERATION-FORT-CACHE-PARAPHRASE-MT*", $UNINITIALIZED);
        defparameter("*NL-GENERATION-FORT-CACHE-NL-PREDS*", $list_alt25);
        defparameter("*NL-GENERATION-FORT-CACHE-BREAK-ON-TIMEOUT?*", NIL);
        defparameter("*NL-GENERATION-FORT-CACHE-RETRY-ON-TIMEOUT?*", T);
        defparameter("*NL-GENERATION-FORT-CACHE-TIMEOUT*", $int$60);
        defparameter("*NL-GENERATION-FORT-CACHE-GENERATE-PLOTS?*", NIL);
        defparameter("*NL-GENERATION-FORT-CACHE-MEDIAN-TIMES*", NIL);
        defparameter("*NL-GENERATION-FORT-CACHE-TOTAL-TIMES*", NIL);
        defparameter("*NL-GENERATION-FORT-CACHE-CPU-TIMES*", NIL);
        defparameter("*NL-GENERATION-FORT-CACHE-SWAP-TIMES*", NIL);
        defparameter("*NL-GENERATION-FORT-CACHE-FAILED-FORT-COUNTS*", NIL);
        defparameter("*NL-GENERATION-FORT-CACHE-GC-TIMES*", NIL);
        defparameter("*NL-GENERATION-FORT-CACHE-WORKING-DIRECTORY*", NIL);
        deflexical("*NL-GENERATION-FORT-CACHE-BATCH-SIZE*", $int$100);
        deflexical("*NL-GENERATION-FORT-CACHE-ASSIGNMENT-SIZE*", $int$10000);
        defparameter("*NL-FORT-GENERATION-TASK*", NIL);
        deflexical("*NL-FORT-GENERATION-RESULTS-QUEUE*", process_utilities.new_ipc_queue($$$NL_FORT_Generation_Results_Queue));
        defparameter("*RICH-NL-GENERATION-CACHE-STYLE?*", T);
        defparameter("*NL-GENERATION-FORT-CACHE-USE-FORKED-PROCESSES?*", NIL);
        deflexical("*FAILED-NL-FORT-GENERATION-TASKS*", new_set(symbol_function(EQUAL), UNPROVIDED));
        defparameter("*NL-GENERATION-FORT-CACHE-RETRY-FAILED-TASKS?*", NIL);
        defconstant("*NANOSECONDS-PER-SECOND*", $int$1000000000);
        defparameter("*NART-MAX-SISTER-TO-GAF-RATIO*", number_utilities.positive_infinity());
        deflexical("*NL-GENERATION-CACHE-EXCEPTIONS*", NIL != boundp($nl_generation_cache_exceptions$) ? ((SubLObject) ($nl_generation_cache_exceptions$.getGlobalValue())) : new_set(symbol_function(EQL), UNPROVIDED));
        return NIL;
    }

    public static SubLObject init_nl_generation_fort_cache_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*ENGLISH-GENERATION-FORT-CACHE*", SubLTrampolineFile.maybeDefault(nl_generation_fort_cache.$english_generation_fort_cache$, nl_generation_fort_cache.$english_generation_fort_cache$, NIL));
            defparameter("*ENGLISH-GENERATION-FHT-NAME*", NIL);
            defparameter("*USE-GENERIC-SINGULAR-NL-GENERATION-FORT-CACHE?*", T);
            deflexical("*ENGLISH-GENERATION-BASE-FILE-NAME*", red_infrastructure_macros.red_def_helper(nl_generation_fort_cache.$list1.isSymbol() ? symbol_value(nl_generation_fort_cache.$list1) : nl_generation_fort_cache.$list1, nl_generation_fort_cache.$english_generation_base_file_name$, nl_generation_fort_cache.$str3$generic_singular_nl_generation_fo.isSymbol() ? symbol_value(nl_generation_fort_cache.$str3$generic_singular_nl_generation_fo) : nl_generation_fort_cache.$str3$generic_singular_nl_generation_fo, $LEXICAL, UNPROVIDED));
            deflexical("*NL-GENERATION-FHT-LOCK*", make_lock(nl_generation_fort_cache.$str5$nl_generation_fht_lock));
            deflexical("*MAX-KBS-BACKWARD-TO-LOOK-FOR-GENERATION-CACHE*", FIVE_INTEGER);
            deflexical("*PRELOAD-NL-GENERATION-CACHES?*", NIL);
            deflexical("*NL-GENERATION-FORT-CACHE-GENERATOR-TIMESTAMP*", numeric_date_utilities.timestamp(UNPROVIDED, UNPROVIDED));
            defparameter("*NL-GENERATION-FORT-CACHE-PARAPHRASE-MT*", $UNINITIALIZED);
            defparameter("*NL-GENERATION-FORT-CACHE-NL-PREDS*", nl_generation_fort_cache.$list24);
            defparameter("*NL-GENERATION-FORT-CACHE-BREAK-ON-TIMEOUT?*", NIL);
            defparameter("*NL-GENERATION-FORT-CACHE-RETRY-ON-TIMEOUT?*", T);
            defparameter("*NL-GENERATION-FORT-CACHE-TIMEOUT*", nl_generation_fort_cache.$int$60);
            defparameter("*NL-GENERATION-FORT-CACHE-GENERATE-PLOTS?*", NIL);
            defparameter("*NL-GENERATION-FORT-CACHE-MEDIAN-TIMES*", NIL);
            defparameter("*NL-GENERATION-FORT-CACHE-TOTAL-TIMES*", NIL);
            defparameter("*NL-GENERATION-FORT-CACHE-CPU-TIMES*", NIL);
            defparameter("*NL-GENERATION-FORT-CACHE-SWAP-TIMES*", NIL);
            defparameter("*NL-GENERATION-FORT-CACHE-FAILED-FORT-COUNTS*", NIL);
            defparameter("*NL-GENERATION-FORT-CACHE-GC-TIMES*", NIL);
            defparameter("*NL-GENERATION-FORT-CACHE-WORKING-DIRECTORY*", NIL);
            deflexical("*NL-GENERATION-FORT-CACHE-BATCH-SIZE*", $int$100);
            deflexical("*NL-GENERATION-FORT-CACHE-ASSIGNMENT-SIZE*", nl_generation_fort_cache.$int$10000);
            defparameter("*NL-FORT-GENERATION-TASK*", NIL);
            deflexical("*NL-FORT-GENERATION-RESULTS-QUEUE*", process_utilities.new_ipc_queue(nl_generation_fort_cache.$$$NL_FORT_Generation_Results_Queue));
            defparameter("*RICH-NL-GENERATION-CACHE-STYLE?*", T);
            defparameter("*NL-GENERATION-FORT-CACHE-USE-FORKED-PROCESSES?*", NIL);
            deflexical("*FAILED-NL-FORT-GENERATION-TASKS*", set.new_set(symbol_function(EQUAL), UNPROVIDED));
            defparameter("*NL-GENERATION-FORT-CACHE-RETRY-FAILED-TASKS?*", NIL);
            defconstant("*NANOSECONDS-PER-SECOND*", nl_generation_fort_cache.$int$1000000000);
            defparameter("*NART-MAX-SISTER-TO-GAF-RATIO*", number_utilities.positive_infinity());
            deflexical("*NL-GENERATION-CACHE-EXCEPTIONS*", SubLTrampolineFile.maybeDefault(nl_generation_fort_cache.$nl_generation_cache_exceptions$, nl_generation_fort_cache.$nl_generation_cache_exceptions$, () -> set.new_set(symbol_function(EQL), UNPROVIDED)));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*ENGLISH-GENERATION-FORT-CACHE*", NIL != boundp($english_generation_fort_cache$) ? ((SubLObject) ($english_generation_fort_cache$.getGlobalValue())) : NIL);
            deflexical("*ENGLISH-GENERATION-BASE-FILE-NAME*", red_infrastructure_macros.red_def_helper($list_alt1.isSymbol() ? ((SubLObject) (symbol_value($list_alt1))) : $list_alt1, $english_generation_base_file_name$, $str_alt3$generic_singular_nl_generation_fo.isSymbol() ? ((SubLObject) (symbol_value($str_alt3$generic_singular_nl_generation_fo))) : $str_alt3$generic_singular_nl_generation_fo, $LEXICAL, UNPROVIDED));
            defparameter("*NL-GENERATION-FORT-CACHE-NL-PREDS*", $list_alt25);
            deflexical("*NL-GENERATION-CACHE-EXCEPTIONS*", NIL != boundp($nl_generation_cache_exceptions$) ? ((SubLObject) ($nl_generation_cache_exceptions$.getGlobalValue())) : new_set(symbol_function(EQL), UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject init_nl_generation_fort_cache_file_Previous() {
        deflexical("*ENGLISH-GENERATION-FORT-CACHE*", SubLTrampolineFile.maybeDefault(nl_generation_fort_cache.$english_generation_fort_cache$, nl_generation_fort_cache.$english_generation_fort_cache$, NIL));
        defparameter("*ENGLISH-GENERATION-FHT-NAME*", NIL);
        defparameter("*USE-GENERIC-SINGULAR-NL-GENERATION-FORT-CACHE?*", T);
        deflexical("*ENGLISH-GENERATION-BASE-FILE-NAME*", red_infrastructure_macros.red_def_helper(nl_generation_fort_cache.$list1.isSymbol() ? symbol_value(nl_generation_fort_cache.$list1) : nl_generation_fort_cache.$list1, nl_generation_fort_cache.$english_generation_base_file_name$, nl_generation_fort_cache.$str3$generic_singular_nl_generation_fo.isSymbol() ? symbol_value(nl_generation_fort_cache.$str3$generic_singular_nl_generation_fo) : nl_generation_fort_cache.$str3$generic_singular_nl_generation_fo, $LEXICAL, UNPROVIDED));
        deflexical("*NL-GENERATION-FHT-LOCK*", make_lock(nl_generation_fort_cache.$str5$nl_generation_fht_lock));
        deflexical("*MAX-KBS-BACKWARD-TO-LOOK-FOR-GENERATION-CACHE*", FIVE_INTEGER);
        deflexical("*PRELOAD-NL-GENERATION-CACHES?*", NIL);
        deflexical("*NL-GENERATION-FORT-CACHE-GENERATOR-TIMESTAMP*", numeric_date_utilities.timestamp(UNPROVIDED, UNPROVIDED));
        defparameter("*NL-GENERATION-FORT-CACHE-PARAPHRASE-MT*", $UNINITIALIZED);
        defparameter("*NL-GENERATION-FORT-CACHE-NL-PREDS*", nl_generation_fort_cache.$list24);
        defparameter("*NL-GENERATION-FORT-CACHE-BREAK-ON-TIMEOUT?*", NIL);
        defparameter("*NL-GENERATION-FORT-CACHE-RETRY-ON-TIMEOUT?*", T);
        defparameter("*NL-GENERATION-FORT-CACHE-TIMEOUT*", nl_generation_fort_cache.$int$60);
        defparameter("*NL-GENERATION-FORT-CACHE-GENERATE-PLOTS?*", NIL);
        defparameter("*NL-GENERATION-FORT-CACHE-MEDIAN-TIMES*", NIL);
        defparameter("*NL-GENERATION-FORT-CACHE-TOTAL-TIMES*", NIL);
        defparameter("*NL-GENERATION-FORT-CACHE-CPU-TIMES*", NIL);
        defparameter("*NL-GENERATION-FORT-CACHE-SWAP-TIMES*", NIL);
        defparameter("*NL-GENERATION-FORT-CACHE-FAILED-FORT-COUNTS*", NIL);
        defparameter("*NL-GENERATION-FORT-CACHE-GC-TIMES*", NIL);
        defparameter("*NL-GENERATION-FORT-CACHE-WORKING-DIRECTORY*", NIL);
        deflexical("*NL-GENERATION-FORT-CACHE-BATCH-SIZE*", $int$100);
        deflexical("*NL-GENERATION-FORT-CACHE-ASSIGNMENT-SIZE*", nl_generation_fort_cache.$int$10000);
        defparameter("*NL-FORT-GENERATION-TASK*", NIL);
        deflexical("*NL-FORT-GENERATION-RESULTS-QUEUE*", process_utilities.new_ipc_queue(nl_generation_fort_cache.$$$NL_FORT_Generation_Results_Queue));
        defparameter("*RICH-NL-GENERATION-CACHE-STYLE?*", T);
        defparameter("*NL-GENERATION-FORT-CACHE-USE-FORKED-PROCESSES?*", NIL);
        deflexical("*FAILED-NL-FORT-GENERATION-TASKS*", set.new_set(symbol_function(EQUAL), UNPROVIDED));
        defparameter("*NL-GENERATION-FORT-CACHE-RETRY-FAILED-TASKS?*", NIL);
        defconstant("*NANOSECONDS-PER-SECOND*", nl_generation_fort_cache.$int$1000000000);
        defparameter("*NART-MAX-SISTER-TO-GAF-RATIO*", number_utilities.positive_infinity());
        deflexical("*NL-GENERATION-CACHE-EXCEPTIONS*", SubLTrampolineFile.maybeDefault(nl_generation_fort_cache.$nl_generation_cache_exceptions$, nl_generation_fort_cache.$nl_generation_cache_exceptions$, () -> set.new_set(symbol_function(EQL), UNPROVIDED)));
        return NIL;
    }

    static private final SubLString $str_alt67$__Successfully_completed__S__ = makeString("~&Successfully completed ~S~%");

    static private final SubLString $str_alt68$Received_failure_code_on_task__S = makeString("Received failure code on task ~S");

    static private final SubLString $str_alt69$Didn_t_recognize_exit_code__S = makeString("Didn't recognize exit code ~S");

    static private final SubLString $str_alt70$NL_FORT_Generation_subtask_report = makeString("NL FORT Generation subtask reported failure:~% ~S");

    static private final SubLString $str_alt71$__About_to_enqueue_new_exit_code_ = makeString("~&About to enqueue new exit code ~S~%");

    static private final SubLString $str_alt72$Just_received_task_specification_ = makeString("Just received task specification ~S");

    static private final SubLList $list_alt73 = list(makeSymbol("TASK-ID"), makeSymbol("MY-TASK-DIRECTORY"), makeSymbol("START-NUM"), makeSymbol("END-NUM"));

    static private final SubLString $str_alt74$Returning__S = makeString("Returning ~S");

    static private final SubLString $str_alt75$results_cfasl = makeString("results.cfasl");

    static private final SubLString $str_alt76$fast_results_cfasl = makeString("fast-results.cfasl");

    static private final SubLList $list_alt81 = list(makeSymbol("NL-FORT-GENERATION-TASK-FAILED?"), list(makeSymbol("LIST"), makeSymbol("SUBDIRECTORY")));

    static private final SubLString $str_alt82$prior_results_cfasl = makeString("prior-results.cfasl");

    static private final SubLString $str_alt84$stats_log = makeString("stats.log");

    static private final SubLString $str_alt86$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLString $str_alt87$Generating_nl_for_forts_ = makeString("Generating nl for forts ");

    static private final SubLString $str_alt88$_through_ = makeString(" through ");

    static private final SubLString $str_alt89$_____ = makeString(" ....");

    static private final SubLString $str_alt92$Timed_out_on_first_try_after__A_g = makeString("Timed out on first try after ~A generating paraphrase of ~S.~% Trying again...");

    static private final SubLString $str_alt95$Timed_out_after__A_generating_par = makeString("Timed out after ~A generating paraphrase of ~S");

    static private final SubLString $str_alt96$Generated_empty_string_for__S = makeString("Generated empty string for ~S");

    public static SubLObject setup_nl_generation_fort_cache_file() {
        declare_defglobal(nl_generation_fort_cache.$english_generation_fort_cache$);
        register_macro_helper(nl_generation_fort_cache.GET_ENGLISH_GENERATION_FORT_CACHE, nl_generation_fort_cache.WITH_DEFAULT_NL_GENERATION_CACHE_FILE_PATH);
        register_macro_helper(nl_generation_fort_cache.SET_TEMPORARY_ENGLISH_GENERATION_FORT_CACHE, nl_generation_fort_cache.WITH_DEFAULT_NL_GENERATION_CACHE_FILE_PATH);
        register_macro_helper(nl_generation_fort_cache.RESTORE_ENGLISH_GENERATION_FORT_CACHE, nl_generation_fort_cache.WITH_DEFAULT_NL_GENERATION_CACHE_FILE_PATH);
        note_funcall_helper_function(nl_generation_fort_cache.INITIALIZE_NL_GENERATION_CACHES);
        register_external_symbol(nl_generation_fort_cache.CREATE_FILTERED_NL_GENERATION_FHT_FROM_DATA);
        note_funcall_helper_function(nl_generation_fort_cache.WAKE_UP_FORT_PARAPHRASE_CACHE_TASKMASTER);
        note_funcall_helper_function(nl_generation_fort_cache.DO_NEXT_FORT_PARAPHRASE_CACHE_GENERATION_TASK);
        note_funcall_helper_function(nl_generation_fort_cache.DO_FORT_PARAPHRASE_CACHE_GENERATION_FOR_DIRECTORY);
        declare_defglobal(nl_generation_fort_cache.$nl_generation_cache_exceptions$);
        return NIL;
    }

    static private final SubLString $str_alt97$Failed_to_generate_a_string_for__ = makeString("Failed to generate a string for ~S");

    static private final SubLString $str_alt100$Verifying_ = makeString("Verifying ");

    static private final SubLString $str_alt101$_constants___ = makeString(" constants...");

    static private final SubLString $str_alt102$_S____Cached___S___Generated___S_ = makeString("~S:~% Cached: ~S~% Generated: ~S~%");

    static private final SubLString $str_alt103$_NARTs___ = makeString(" NARTs...");

    static private final SubLString $str_alt104$_D_of__D_constants_verified___F__ = makeString("~D of ~D constants verified (~F%)~%");

    static private final SubLString $str_alt105$_D_of__D_narts_verified___F____ = makeString("~D of ~D narts verified (~F%)~%");

    @Override
    public void declareFunctions() {
        nl_generation_fort_cache.declare_nl_generation_fort_cache_file();
    }

    static private final SubLString $str_alt106$__First_non_finished__missing__di = makeString("~&First non-finished (missing) directory: ~S");

    @Override
    public void initializeVariables() {
        nl_generation_fort_cache.init_nl_generation_fort_cache_file();
    }

    static private final SubLString $str_alt107$__First_non_finished__failed__dir = makeString("~&First non-finished (failed) directory: ~S");

    @Override
    public void runTopLevelForms() {
        nl_generation_fort_cache.setup_nl_generation_fort_cache_file();
    }

    static {
    }

    static private final SubLString $str_alt109$Clearing_PPH_memoization_for__S = makeString("Clearing PPH memoization for ~S");

    static private final SubLString $str_alt110$__Paraphrased_batch___D_of__S_FOR = makeString("~&Paraphrased batch #~D of ~S FORTs in ~A~%");

    static private final SubLSymbol $sym111$_ = makeSymbol("+");

    static private final SubLString $str_alt112$__Total_paraphrase_time___S__ = makeString("~&Total paraphrase time: ~S~%");

    static private final SubLString $str_alt113$__Median_paraphrase_time___S__ = makeString("~&Median paraphrase time: ~S~%");

    static private final SubLString $str_alt114$___Sth_percentile_paraphrase_time = makeString("~&~Sth percentile paraphrase time: ~S~%");

    static private final SubLString $str_alt115$___CPU_time___A__ = makeString("~& CPU time: ~A~%");

    static private final SubLString $str_alt116$____SWAP_time___A___ = makeString("~& (SWAP time: ~A)~%");

    static private final SubLList $list_alt117 = list(makeString("Total FORT Paraphrase Time in ~D-FORT Batches"), makeString("Median FORT Paraphrase Time in ~D-FORT Batches"), makeString("Total CPU Time per ~D-FORT Batch"), makeString("Total GC Time per ~D-FORT Batch"), makeString("Total Swap Time per ~D-FORT Batch"), makeString("Failed FORT count per ~D-FORT Batch"));

    static private final SubLList $list_alt118 = list(makeString("total"), makeString("median"), makeString("cpu"), makeString("gc"), makeString("swap"), makeString("failed-fort-count"));

    static private final SubLList $list_alt119 = list(makeString("Seconds"), makeString("Seconds"), makeString("Seconds"), makeString("Seconds"), makeString("Seconds"), makeString("FORTs"));

    static private final SubLString $str_alt121$Batch__ = makeString("Batch #");

    static private final SubLString $str_alt125$_cfasl = makeString(".cfasl");

    static private final SubLList $list_alt126 = list(makeString("Total FORT Paraphrase Time per Batch"), makeString("Median FORT Paraphrase Time by Batch"), makeString("Total CPU Time per Batch"), makeString("Total GC Time per Batch"), makeString("Total Swap Time per Batch"), makeString("Failed FORT Count per Batch"));

    static private final SubLSymbol $sym127$_ = makeSymbol("<");

    static private final SubLList $list_alt130 = list(makeSymbol("NL-GENERATION-CACHE-METHOD"));

    static private final SubLString $str_alt133$Cached_paraphrase_for__S___is__S_ = makeString("Cached paraphrase for ~S~% is ~S.~% Should be ~S.");

    static private final SubLString $str_alt135$__Checking_NL_Generation_cache_ba = makeString("~%Checking NL Generation cache based on~% ~S~% with ~S local cache entries~% against KB ~A started from KB ~S~%");

    static private final SubLString $str_alt136$__Done__D__Current_estimate____3F = makeString("~&Done ~D. Current estimate: ~,3F%~%");

    static private final SubLString $str_alt137$Done__S__but_variance_of_approxim = makeString("Done ~S, but variance of approximately ~S exceeds ~S. Doing at least ~S more.");

    static private final SubLString $str_alt138$__The_estimated_staleness_percent = makeString("~&The estimated staleness percentage of the NL generation FORT cache~% (based on ~D FORTs) is between ~,");

    static private final SubLString $str_alt139$F__and___ = makeString("F% and ~,");

    static private final SubLString $str_alt140$F____ = makeString("F%.~%");

    static private final SubLString $str_alt142$Looking_up_nl_generation_for_all_ = makeString("Looking up nl generation for all forts ....");

    static private final SubLString $str_alt146$Timed_out_after__S_seconds_genera = makeString("Timed out after ~S seconds generating paraphrase of ~S");

    static private final SubLString $str_alt161$Finding_collections_that_don_t_us = makeString("Finding collections that don't use cache when doing nl generation of instances...");

    static private final SubLString $str_alt163$Testing___A__generate_cache_ratio = makeString("Testing: ~A, generate cache ratio: ~5F.~%");

    static private final SubLString $str_alt165$__Extra_cache_hits_for__S___S_per = makeString("~&Extra cache hits for ~S: ~S per result.~%");

    static private final SubLString $str_alt167$__Insufficient_cache_hits_for__S_ = makeString("~&Insufficient cache hits for ~S: ~S per result.~%");
}

/**
 * Total time: 3960 ms synthetic
 */
