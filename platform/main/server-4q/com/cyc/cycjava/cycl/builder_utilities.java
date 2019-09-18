package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.constant_handles.constant_count;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$communication_mode$;
import static com.cyc.cycjava.cycl.control_vars.$unencapsulating_within_agenda$;
import static com.cyc.cycjava.cycl.control_vars.caught_up_on_master_transcript;
import static com.cyc.cycjava.cycl.control_vars.kb_loaded;
import static com.cyc.cycjava.cycl.control_vars.set_auto_increment_kb;
import static com.cyc.cycjava.cycl.control_vars.set_kb_loaded;
import static com.cyc.cycjava.cycl.control_vars.set_load_submitted_transcripts;
import static com.cyc.cycjava.cycl.control_vars.set_send_submitted_transcript_loading_notices;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.run_all_test_case_tables;
import static com.cyc.cycjava.cycl.id_index.id_index_count;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_lookup;
import static com.cyc.cycjava.cycl.id_index.id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_id_threshold;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.index_leaves;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$is_noting_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_elapsed_seconds_for_notification$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_last_pacification_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_note$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_notification_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_pacifications_since_last_nl$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_total$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$suppress_all_progress_faster_than_seconds$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.alpha_char_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.char_downcase;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.char_upcase;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.upper_case_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.$most_positive_fixnum$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.abs;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.evenp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.floor;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numGE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numLE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.oddp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.zerop;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.process_wait;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.keywordp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.cyc_testing.cyc_testing;
import com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities;
import com.cyc.cycjava.cycl.inference.browser.cb_query;
import com.cyc.cycjava.cycl.inference.harness.inference_analysis;
import com.cyc.cycjava.cycl.inference.harness.inference_metrics;
import com.cyc.cycjava.cycl.sbhl.sbhl_caching_policies;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLMain;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
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
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class builder_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new builder_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.builder_utilities";

    public static final String myFingerPrint = "9f9c4a9bf19ab5398e93f63b23ebbf4d76304c277e04963f31529e23d9546185";

    // deflexical
    public static final SubLSymbol $standard_regression_conditions$ = makeSymbol("*STANDARD-REGRESSION-CONDITIONS*");

    // defparameter
    // A list of all cyc product identifiers
    public static final SubLSymbol $all_cyc_products$ = makeSymbol("*ALL-CYC-PRODUCTS*");

    // defparameter
    /**
     * A list of cyc product definitions, each of which is of the form
     * ([CYC-PRODUCT] [CODE-PRODUCT] [KB-PRODUCT] [BRANCH-TAG])
     */
    public static final SubLSymbol $cyc_product_definitions$ = makeSymbol("*CYC-PRODUCT-DEFINITIONS*");



    // defconstant
    // The value of *CODE-PRODUCT* is set in this definition.
    private static final SubLSymbol $code_product$ = makeSymbol("*CODE-PRODUCT*");



    // defconstant
    // The value of *BRANCH-TAG* is set in this definition.
    private static final SubLSymbol $branch_tag$ = makeSymbol("*BRANCH-TAG*");

    // defparameter
    public static final SubLSymbol $generic_sbhl_caching_policy_templates$ = makeSymbol("*GENERIC-SBHL-CACHING-POLICY-TEMPLATES*");

    // defparameter
    // Processes all of the tests in this list as part of the SBHL cache tuning.
    public static final SubLSymbol $cyc_tests_to_use_for_sbhl_cache_tuning$ = makeSymbol("*CYC-TESTS-TO-USE-FOR-SBHL-CACHE-TUNING*");

    // defparameter
    /**
     * Runs all of these queries as part of the SBHL cache tuning.
     *
     * @unknown Currently not implemented.
     */
    public static final SubLSymbol $kb_queries_to_use_for_sbhl_cache_tuning$ = makeSymbol("*KB-QUERIES-TO-USE-FOR-SBHL-CACHE-TUNING*");

    // defparameter
    /**
     * When T, runs the CycLOPS benchmark once as part of the SBHL cache tuning.
     *
     * @unknown Currently not implemented
     */
    public static final SubLSymbol $run_cyclops_for_sbhl_cache_tuningP$ = makeSymbol("*RUN-CYCLOPS-FOR-SBHL-CACHE-TUNING?*");

    // deflexical
    private static final SubLSymbol $build_process_worker_count$ = makeSymbol("*BUILD-PROCESS-WORKER-COUNT*");





    // defparameter
    public static final SubLSymbol $constant_obfuscation_cache$ = makeSymbol("*CONSTANT-OBFUSCATION-CACHE*");

    // defparameter
    public static final SubLSymbol $ts_comment_stream$ = makeSymbol("*TS-COMMENT-STREAM*");



    private static final SubLString $str1$This_cyc_image_is_no_longer_usabl = makeString("This cyc image is no longer usable and will now exit.");

    private static final SubLSymbol CYC_BUILD_WORLD_VERIFY = makeSymbol("CYC-BUILD-WORLD-VERIFY");

    private static final SubLString $$$Continue = makeString("Continue");

    private static final SubLString $str4$World_file__A_already_exists_and_ = makeString("World file ~A already exists and may not be overwritable if in use.");

    private static final SubLString $$$A = makeString("A");

    private static final SubLString $str6$cyc_ = makeString("cyc-");

    private static final SubLString $str7$_ = makeString("-");

    private static final SubLString $str8$_kb_ = makeString("-kb-");

    private static final SubLString $str9$_cyc_ = makeString("/cyc/");

    private static final SubLString $str10$_ = makeString("/");

    private static final SubLString $str11$_install_ = makeString("/install/");

    private static final SubLString $str12$kb_ = makeString("kb-");

    private static final SubLString $str13$_load = makeString(".load");



    private static final SubLString $str15$Writing_cyc_image_to__A__ = makeString("Writing cyc image to ~A~%");

    private static final SubLSymbol CYC_LOAD_KB = makeSymbol("CYC-LOAD-KB");

    private static final SubLSymbol CYC_LOAD_INCREMENTAL_KB = makeSymbol("CYC-LOAD-INCREMENTAL-KB");

    private static final SubLSymbol CYC_DUMP_STANDARD_KB = makeSymbol("CYC-DUMP-STANDARD-KB");

    private static final SubLString $str19$This_CYC_is_receiving_operations_ = makeString("This CYC is receiving operations; KB changes during a snapshot will invalidate the dump.");

    private static final SubLSymbol CYC_SNAPSHOT_KB = makeSymbol("CYC-SNAPSHOT-KB");



    private static final SubLSymbol CYC_DUMP_SNAPSHOT_KB = makeSymbol("CYC-DUMP-SNAPSHOT-KB");

    private static final SubLString $str23$Dump_snapshot_KB_trivially_finish = makeString("Dump snapshot KB trivially finished: dump directory and current units are both ~S");

    private static final SubLString $str24$Setting_up_safe_KB_dump_environme = makeString("Setting up safe KB dump environment");

    private static final SubLString $str25$Agenda_was_not_successfully_halte = makeString("Agenda was not successfully halted!");



    private static final SubLString $str27$Restoring_pre_dump_environment = makeString("Restoring pre-dump environment");

    private static final SubLSymbol SUGGEST_KB_SNAPSHOT_DIRECTORY = makeSymbol("SUGGEST-KB-SNAPSHOT-DIRECTORY");

    private static final SubLString $str29$The_base_directory__A_does_not_ex = makeString("The base directory ~A does not exist.~%");

    private static final SubLString $str30$Loaded_KB_version___A__ = makeString("Loaded KB version: ~A~%");

    private static final SubLString $$$TheBuilder = makeString("TheBuilder");

    private static final SubLString $$$yes = makeString("yes");

    private static final SubLString $str33$Determining_total_transcript_ops_ = makeString("Determining total transcript ops ....");

    private static final SubLString $str34$__Total_transcription_ops__A___ = makeString("~&Total transcription ops ~A.~%");

    private static final SubLString $str35$Getting_caught_up_on_operations__ = makeString("Getting caught up on operations ....");

    private static final SubLString $str36$__Catch_up_completed__Ops_remaini = makeString("~&Catch-up completed. Ops remaining ~A.~%");

    private static final SubLString $str37$Post_catch_up_KB_version___A__ = makeString("Post catch-up KB version: ~A~%");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLString $str40$Post_load_transcript_KB_version__ = makeString("Post load transcript KB version: ~A~%");

    private static final SubLString $$$no = makeString("no");

    private static final SubLString $str42$__Successfully_created__S_units__ = makeString("~&Successfully created ~S units: ~A~%");

    private static final SubLString $str43$_home_builder_logs_ = makeString("/home/builder/logs/");

    private static final SubLString $str44$No_log_directory__A_____strange__ = makeString("No log directory ~A ... strange.~%");

    private static final SubLString $str45$forward_inference_metrics_ = makeString("forward-inference-metrics-");

    private static final SubLString $str46$_html = makeString(".html");

    private static final SubLString $str47$The_catchup_image_expected_to_be_ = makeString("The catchup image expected to be using world ~A but has ~A.");

    private static final SubLString $str48$Builder_s_catchup_to_rollover_ser = makeString("Builder's catchup-to-rollover server - DO NOT USE");



    private static final SubLString $str50$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $str51$Getting_caught_up_to_KB_rollover_ = makeString("Getting caught up to KB rollover to ");

    private static final SubLSymbol KB_FULL_TRANSCRIPT_LOADED = makeSymbol("KB-FULL-TRANSCRIPT-LOADED");

    private static final SubLString $str53$The_agenda_is_not_running___Fix_y = makeString("The agenda is not running.  Fix your init files, probably parameters.lisp.");



    private static final SubLObject $$Guest = reader_make_constant_shell(makeString("Guest"));

    private static final SubLString $$$CycAdministrator = makeString("CycAdministrator");

    private static final SubLString $str57$Getting_caught_up__ = makeString("Getting caught up~%");

    private static final SubLString $str58$Builder_s_transcript_loading_serv = makeString("Builder's transcript-loading server - DO NOT USE");



    private static final SubLString $str60$Builder_s_catchup_to_current_serv = makeString("Builder's catchup-to-current server - DO NOT USE");

    private static final SubLString $$$Getting_caught_up_from_KB_ = makeString("Getting caught up from KB ");

    private static final SubLString $str62$_ = makeString(".");

    private static final SubLString $$$_to_KB_ = makeString(" to KB ");



    private static final SubLString $str65$Caught_up_to_KB__A__ = makeString("Caught up to KB ~A~%");



    private static final SubLString $str67$Could_not_get_total_master_transc = makeString("Could not get total master transcript operations for KB ~a after rolling over from KB ~a");

    private static final SubLString $$$Now_getting_caught_up_from_KB_ = makeString("Now getting caught up from KB ");

    private static final SubLString $str69$__Catching_up_on_operations_took_ = makeString("~%Catching up on operations took: ~A secs~%");



    private static final SubLString $str71$___A__ = makeString("~&~A~%");

    private static final SubLString $str72$___s_constant_A__A__ = makeString("  ~s constant~A ~A~%");

    private static final SubLString $$$s_were = makeString("s were");

    private static final SubLString $$$_was = makeString(" was");

    private static final SubLString $$$created = makeString("created");

    private static final SubLString $$$destroyed = makeString("destroyed");

    private static final SubLString $str77$___s_nart_A__A__ = makeString("  ~s nart~A ~A~%");

    private static final SubLString $str78$___s_assertion_A__A__ = makeString("  ~s assertion~A ~A~%");

    private static final SubLString $str79$___s_kb_hl_support_A__A__ = makeString("  ~s kb-hl-support~A ~A~%");

    private static final SubLString $str80$___s_deduction_A__A__ = makeString("  ~s deduction~A ~A~%");

    private static final SubLSymbol RUN_BASELINE_TESTS = makeSymbol("RUN-BASELINE-TESTS");

    private static final SubLString $str82$tests_post_build_testdcl_lisp = makeString("tests/post-build-testdcl.lisp");





    private static final SubLString $str85$release_baseline_tests_ = makeString("release-baseline-tests-");

    private static final SubLString $str86$_cfasl = makeString(".cfasl");

    private static final SubLString $$$Writing_result_file = makeString("Writing result file");

    private static final SubLSymbol BASELINE_RESULTS_TO_MAP = makeSymbol("BASELINE-RESULTS-TO-MAP");

    private static final SubLList $list89 = list(makeSymbol("CATEGORY"), makeSymbol("TEST"), makeSymbol("OUTCOME"), makeSymbol("TIME"));



    private static final SubLSymbol COMPUTE_BASELINE_REGRESSIONS = makeSymbol("COMPUTE-BASELINE-REGRESSIONS");

    private static final SubLList $list92 = list(makeSymbol("TEST"), makeSymbol("B-OUTCOME"));



    private static final SubLSymbol SHOW_BASELINE_REGRESSION_INFO = makeSymbol("SHOW-BASELINE-REGRESSION-INFO");

    private static final SubLList $list95 = list(makeSymbol("CATEGORY"), makeSymbol("INFO"));

    private static final SubLString $str96$___S__ = makeString("~%~S~%");

    private static final SubLList $list97 = list(cons(makeKeyword("SUCCESS"), makeKeyword("FAILURE")), cons(makeKeyword("SUCCESS"), makeKeyword("INVALID")), cons(makeKeyword("SUCCESS"), makeKeyword("ERROR")));

    private static final SubLSymbol SHOW_BASELINE_REGRESSION_DETAILS = makeSymbol("SHOW-BASELINE-REGRESSION-DETAILS");

    private static final SubLList $list99 = list(makeSymbol("CATEGORY"), makeSymbol("CAT-MAP"));

    private static final SubLSymbol $sym100$TERM__ = makeSymbol("TERM-<");

    private static final SubLString $str101$__S__ = makeString(" ~S~%");

    private static final SubLString $str102$___S__ = makeString("  ~S~%");





    private static final SubLString $str105$The_cyc_product___A__is_already_p = makeString("The cyc product, ~A, is already present with the declared definition.");

    private static final SubLString $str106$There_already_exists_a_different_ = makeString("There already exists a different cyc product, ~A, with this definition.");

    private static final SubLString $str107$The_cyc_product__A_already_exists = makeString("The cyc product ~A already exists with a different definition.");









    private static final SubLString $$$head = makeString("head");







    private static final SubLString $str116$cake_release_0p3_20051215 = makeString("cake-release-0p3-20051215");

    private static final SubLSymbol $cyc_product$ = makeSymbol("*CYC-PRODUCT*");

    private static final SubLSymbol $kb_product$ = makeSymbol("*KB-PRODUCT*");

    private static final SubLSymbol $UNKNOWN_CYC_PRODUCT = makeKeyword("UNKNOWN-CYC-PRODUCT");

    private static final SubLSymbol LOAD_FILE_DEPENDENCY_INFORMATION = makeSymbol("LOAD-FILE-DEPENDENCY-INFORMATION");



    private static final SubLSymbol WHITESPACE_CHAR_P = makeSymbol("WHITESPACE-CHAR-P");

    private static final SubLSymbol AUGMENT_FILE_SET = makeSymbol("AUGMENT-FILE-SET");

    private static final SubLSymbol COMPLETELY_AUGMENT_FILE_SET = makeSymbol("COMPLETELY-AUGMENT-FILE-SET");

    private static final SubLString $str125$Augmenting_the_file_set_not_termi = makeString("Augmenting the file set not terminating after ~A iterations.");

    private static final SubLSymbol WRITE_ANT_FILESET_DECLARATION = makeSymbol("WRITE-ANT-FILESET-DECLARATION");

    private static final SubLString $$$id = makeString("id");

    private static final SubLString $$$dir = makeString("dir");

    private static final SubLString $$$fileset = makeString("fileset");



    private static final SubLString $$$name = makeString("name");



    private static final SubLString $$$include = makeString("include");

    private static final SubLString $$$exclude = makeString("exclude");

    private static final SubLSymbol CONSTRUCT_ROOTED_FILE_SET_FROM_LIST = makeSymbol("CONSTRUCT-ROOTED-FILE-SET-FROM-LIST");



    private static final SubLSymbol ROOT_FILE_SET = makeSymbol("ROOT-FILE-SET");

    private static final SubLSymbol UNROOT_FILE_SET = makeSymbol("UNROOT-FILE-SET");

    private static final SubLSymbol REROOT_FILE_SET = makeSymbol("REROOT-FILE-SET");

    private static final SubLSymbol TEST_REROOT_FILE_SET = makeSymbol("TEST-REROOT-FILE-SET");













    private static final SubLList $list147 = list(list(list(list(makeString("/cycdoc/img/cb/red_diam.gif"), makeString("/cycdoc/img/square-minus.gif")), makeString("/cycdoc"), makeString("doc")), makeKeyword("SUCCESS")));

    private static final SubLString $str148$Rerooting_from__A_to__A_failed_an = makeString("Rerooting from ~A to ~A failed and produced ~A.");



    private static final SubLSymbol SERIALIZE_KB_STORE_LRU_INFORMATION = makeSymbol("SERIALIZE-KB-STORE-LRU-INFORMATION");

    private static final SubLString $str151$Serializing_LRU_information_for_K = makeString("Serializing LRU information for KB Store to ");

    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLSymbol PRECACHE_KB_STORE_BY_LRU_INFORMATION = makeSymbol("PRECACHE-KB-STORE-BY-LRU-INFORMATION");

    private static final SubLString $str154$Precaching_KB_Store_with_LRU_info = makeString("Precaching KB Store with LRU info from ");

    private static final SubLFloat $float$0_212 = makeDouble(0.212);

    private static final SubLInteger $int$30000 = makeInteger(30000);

    private static final SubLInteger $int$22000 = makeInteger(22000);

    private static final SubLFloat $float$0_424 = makeDouble(0.424);

    private static final SubLInteger $int$1600 = makeInteger(1600);

    public static final SubLSymbol FACT_SHEET_PATH_FOR_TERM_FILTER_AND_TRANSFORM = makeSymbol("FACT-SHEET-PATH-FOR-TERM-FILTER-AND-TRANSFORM");







    private static final SubLObject $$genlMt = reader_make_constant_shell(makeString("genlMt"));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));



    private static final SubLInteger $int$10000 = makeInteger(10000);

    private static final SubLInteger $int$8000 = makeInteger(8000);

    private static final SubLInteger $int$2000 = makeInteger(2000);

    private static final SubLObject $$quotedIsa = reader_make_constant_shell(makeString("quotedIsa"));

    private static final SubLInteger $int$5000 = makeInteger(5000);

    private static final SubLInteger $int$4000 = makeInteger(4000);



    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLObject $$disjointWith = reader_make_constant_shell(makeString("disjointWith"));

    private static final SubLInteger $int$1500 = makeInteger(1500);

    private static final SubLInteger $int$200 = makeInteger(200);

    private static final SubLObject $$genlPreds = reader_make_constant_shell(makeString("genlPreds"));

    private static final SubLObject $$genlInverse = reader_make_constant_shell(makeString("genlInverse"));

    private static final SubLObject $$negationPreds = reader_make_constant_shell(makeString("negationPreds"));

    private static final SubLObject $$negationInverse = reader_make_constant_shell(makeString("negationInverse"));





    private static final SubLString $str184$The_templates_list__A_does_not_co = makeString("The templates list ~A does not contain a default rule.");

    private static final SubLList $list185 = list(makeSymbol("PRED"), makeSymbol("POLICY"), makeSymbol("CAPACITY"), makeSymbol("&OPTIONAL"), makeSymbol("EXEMPT"), makeSymbol("PREFETCH"));

    public static final SubLList $list186 = cons(makeUninternedSymbol("KEY"), makeSymbol("MODULE"));



    private static final SubLString $str188$Gathering_SBHL_cache_tuning_data_ = makeString("Gathering SBHL cache tuning data via CYC tests ....");





    private static final SubLString $str191$Gathering_SBHL_cache_tuning_data_ = makeString("Gathering SBHL cache tuning data via KB queries ....");

    private static final SubLString $str192$KBQ_Support_currently_not_impleme = makeString("KBQ Support currently not implemented");



    private static final SubLString $str194$Gathering_SBHL_cache_tuning_data_ = makeString("Gathering SBHL cache tuning data via CycLOPs ....");



    private static final SubLSymbol COMPILE_KB_SNAPSHOT_STATISTICS = makeSymbol("COMPILE-KB-SNAPSHOT-STATISTICS");









    private static final SubLString $$$category = makeString("category");

    private static final SubLString $$$numOfEdits = makeString("numOfEdits");

    private static final SubLString $$$numOfDeletes = makeString("numOfDeletes");

    private static final SubLString $$$numOfEntries = makeString("numOfEntries");

    private static final SubLString $$$numOfBytes = makeString("numOfBytes");

    private static final SubLString $$$fragBytes = makeString("fragBytes");

    private static final SubLSymbol GATHER_KB_SNAPSHOT_STATISTICS = makeSymbol("GATHER-KB-SNAPSHOT-STATISTICS");



    private static final SubLList $list209 = list(makeSymbol("&KEY"), makeSymbol("DATA-FILE"), makeSymbol("INDEX-FILE"), makeSymbol("TYPE"), list(makeSymbol("COMPLEX-DATA-FILE")), list(makeSymbol("COMPLEX-INDEX-FILE")));

    private static final SubLList $list210 = list(makeKeyword("DATA-FILE"), makeKeyword("INDEX-FILE"), makeKeyword("TYPE"), makeKeyword("COMPLEX-DATA-FILE"), makeKeyword("COMPLEX-INDEX-FILE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");







    private static final SubLSymbol $COMPLEX_DATA_FILE = makeKeyword("COMPLEX-DATA-FILE");

    private static final SubLSymbol $COMPLEX_INDEX_FILE = makeKeyword("COMPLEX-INDEX-FILE");





    private static final SubLString $str219$Unsupported_file_vector_type__A__ = makeString("Unsupported file vector type ~A ....~%");

    private static final SubLSymbol TRACK_KB_SNAPSHOT_STATISTICS = makeSymbol("TRACK-KB-SNAPSHOT-STATISTICS");

    private static final SubLString $str221$GATHER_KB_SNAPSHOT_STATISTICS = makeString("GATHER-KB-SNAPSHOT-STATISTICS");

    private static final SubLString $str222$__Check_at__A_______ = makeString("~%Check at ~A ....~%");

    private static final SubLString $str223$_A_____in_progress__ = makeString("~A ... in progress~%");

    private static final SubLString $str224$_A_____errored___A___ = makeString("~A ... errored (~A)~%");

    private static final SubLString $str225$_A___A_edits___A_deletes___A_entr = makeString("~A: ~A edits, ~A deletes, ~A entries, ~A bytes.~%");

    private static final SubLString $str226$Unknown_category__A_____dont_know = makeString("Unknown category ~A ... dont know what to do.~%");

    private static final SubLSymbol GET_KB_MINI_DUMP_TIMESTAMP = makeSymbol("GET-KB-MINI-DUMP-TIMESTAMP");

    private static final SubLSymbol PREPARE_KB_MINI_DUMP = makeSymbol("PREPARE-KB-MINI-DUMP");



    private static final SubLSymbol PERFORM_KB_MINI_DUMP = makeSymbol("PERFORM-KB-MINI-DUMP");

    private static final SubLString $str231$Error_while_performing_mini_dump_ = makeString("Error while performing mini-dump~%~A~%");



    private static final SubLSymbol LAUNCH_ASYNCHRONOUS_KB_MINI_DUMP = makeSymbol("LAUNCH-ASYNCHRONOUS-KB-MINI-DUMP");

    private static final SubLString $$$Mini_KB_Dumper = makeString("Mini KB Dumper");

    private static final SubLString $str235$mini_dump_finished_text = makeString("mini-dump-finished.text");

    private static final SubLSymbol BUILD_PROCESS_WORKER_COUNT = makeSymbol("BUILD-PROCESS-WORKER-COUNT");

    private static final SubLSymbol SET_BUILD_PROCESS_WORKER_COUNT = makeSymbol("SET-BUILD-PROCESS-WORKER-COUNT");

    private static final SubLSymbol $sym238$BUILD_PROCESS_PARALLELISM_PERMITTED_ = makeSymbol("BUILD-PROCESS-PARALLELISM-PERMITTED?");

    private static final SubLSymbol WITH_ALLOWED_OBFUSCATION_NAMESPACE_SUPPORT = makeSymbol("WITH-ALLOWED-OBFUSCATION-NAMESPACE-SUPPORT");



    private static final SubLList $list241 = list(list(makeSymbol("*ALLOWED-OBFUSCATION-NAME-SPACES*"), list(makeSymbol("LIST"), makeString("cyc"))));

    private static final SubLSymbol WITH_ALLOWED_OBFUSCATION_NAMESPACE = makeSymbol("WITH-ALLOWED-OBFUSCATION-NAMESPACE");

    private static final SubLList $list243 = list(list(makeSymbol("NAMESPACE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $allowed_obfuscation_name_spaces$ = makeSymbol("*ALLOWED-OBFUSCATION-NAME-SPACES*");



    private static final SubLList $list246 = list(makeSymbol("*ALLOWED-OBFUSCATION-NAME-SPACES*"));

    private static final SubLSymbol $sym247$ALLOWED_OBFUSCATION_NAMESPACE_CONSTANT_ = makeSymbol("ALLOWED-OBFUSCATION-NAMESPACE-CONSTANT?");

    private static final SubLString $$$cyc = makeString("cyc");

    private static final SubLSymbol $sym249$UN_OBFUSCATABLE_CONSTANT_ = makeSymbol("UN-OBFUSCATABLE-CONSTANT?");

    private static final SubLSymbol WITH_CONSTANT_OBFUSCATION = makeSymbol("WITH-CONSTANT-OBFUSCATION");

    private static final SubLList $list251 = list(list(makeSymbol("FUNCTION"), makeSymbol("&OPTIONAL"), list(makeSymbol("STATE"), makeKeyword("UNPROVIDED"))), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLSymbol $sym253$STATE_VAL = makeUninternedSymbol("STATE-VAL");

    public static final SubLSymbol $constant_obfuscation_name_generator_state$ = makeSymbol("*CONSTANT-OBFUSCATION-NAME-GENERATOR-STATE*");

    private static final SubLSymbol WITH_CONSTANT_NAME_OBFUSCATION = makeSymbol("WITH-CONSTANT-NAME-OBFUSCATION");

    private static final SubLList $list256 = list(makeSymbol("QUOTE"), makeSymbol("OBFUSCATE-CONSTANT-NAME-VIA-GENERATOR-FN"));

    private static final SubLSymbol OBFUSCATE_CONSTANT_NAME_VIA_GENERATOR_FN = makeSymbol("OBFUSCATE-CONSTANT-NAME-VIA-GENERATOR-FN");

    private static final SubLList $list258 = cons(makeSymbol("GENERATOR"), makeSymbol("STATE"));



    private static final SubLString $str260$_ = makeString("_");

    private static final SubLSymbol NEW_CONSTANT_OBFUSCATION_CACHE = makeSymbol("NEW-CONSTANT-OBFUSCATION-CACHE");

    private static final SubLSymbol WITH_CACHED_CONSTANT_OBFUSCATION = makeSymbol("WITH-CACHED-CONSTANT-OBFUSCATION");

    private static final SubLSymbol KBEQ = makeSymbol("KBEQ");

    private static final SubLList $list264 = list(list(makeSymbol("*CONSTANT-OBFUSCATION-CACHE*"), list(makeSymbol("NEW-CONSTANT-OBFUSCATION-CACHE"))));

    private static final SubLSymbol MAKE_OBFUSCATION_GENSYM_STATE = makeSymbol("MAKE-OBFUSCATION-GENSYM-STATE");

    private static final SubLString $$$C = makeString("C");







    private static final SubLSymbol OBFUSCATE_CONSTANT_NAME_GENSYM = makeSymbol("OBFUSCATE-CONSTANT-NAME-GENSYM");

    private static final SubLList $list271 = list(makeSymbol("&KEY"), makeSymbol("ISG"), makeSymbol("UPCASE"), makeSymbol("DOWNCASE"));

    private static final SubLList $list272 = list(makeKeyword("ISG"), makeKeyword("UPCASE"), makeKeyword("DOWNCASE"));

    private static final SubLSymbol OBFUSCATE_AND_DUMP_ESSENTIAL_KB = makeSymbol("OBFUSCATE-AND-DUMP-ESSENTIAL-KB");

    private static final SubLString $$$Obfuscating_strings_in_Assertions = makeString("Obfuscating strings in Assertions");

    private static final SubLString $$$Obfuscating_strings_in_NARTs = makeString("Obfuscating strings in NARTs");

    private static final SubLString $str276$KB_has_been_obfuscated__rendering = makeString("KB has been obfuscated, rendering this image unusable.");

    private static final SubLSymbol DETERMINE_OBFUSCATION_CANDIDATES = makeSymbol("DETERMINE-OBFUSCATION-CANDIDATES");

    private static final SubLString $$$Identifying_needed_KB_changes = makeString("Identifying needed KB changes");

    private static final SubLString $str279$____Old_Space = makeString(" -- Old Space");

    private static final SubLSymbol $sym280$NOT_TERM_OF_UNIT_ASSERTION_ = makeSymbol("NOT-TERM-OF-UNIT-ASSERTION?");

    private static final SubLString $str281$____New_Space = makeString(" -- New Space");



    private static final SubLSymbol DETERMINE_ASSERTION_OBFUSCATIONS = makeSymbol("DETERMINE-ASSERTION-OBFUSCATIONS");

    private static final SubLString $$$Identifying_assertion_changes = makeString("Identifying assertion changes");

    private static final SubLList $list285 = list(makeSymbol("UNREP-TERM"), makeSymbol("ASSERTIONS"));

    private static final SubLList $list286 = list(makeSymbol("NEW-STRING"), makeSymbol("&REST"), makeSymbol("TARGET-ASSERTIONS"));

    private static final SubLSymbol DETERMINE_NART_OBFUSCATIONS = makeSymbol("DETERMINE-NART-OBFUSCATIONS");

    private static final SubLString $$$Identifying_NART_changes = makeString("Identifying NART changes");

    private static final SubLList $list289 = list(makeSymbol("NEW-STRING"), makeSymbol("&REST"), makeSymbol("TARGET-NAUTS"));

    private static final SubLSymbol APPLY_ASSERTION_OBFUSCATIONS = makeSymbol("APPLY-ASSERTION-OBFUSCATIONS");

    private static final SubLString $$$Applying_assertion_changes = makeString("Applying assertion changes");

    private static final SubLString $$$Optimizing_edit_order = makeString("Optimizing edit order");

    private static final SubLList $list293 = cons(makeSymbol("UNREP-TERM"), makeSymbol("NEW-STRING"));

    private static final SubLString $$$A_total_of_ = makeString("A total of ");

    private static final SubLString $str295$_edits_had_been_made_to_the_KB_ = makeString(" edits had been made to the KB.");



    private static final SubLSymbol WEAKLY_SCRAMBLE_STRING_IN_ASSERTIONS = makeSymbol("WEAKLY-SCRAMBLE-STRING-IN-ASSERTIONS");

    private static final SubLSymbol WEAKLY_SCRAMBLE_STRING_IN_NAUTS = makeSymbol("WEAKLY-SCRAMBLE-STRING-IN-NAUTS");

    private static final SubLSymbol MIX_CASE_STRING = makeSymbol("MIX-CASE-STRING");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLObject $$Collection = reader_make_constant_shell(makeString("Collection"));





    private static final SubLSymbol $sym305$HIGHER_ORDER_COLLECTION_ = makeSymbol("HIGHER-ORDER-COLLECTION?");

    private static final SubLSymbol $sym306$_ = makeSymbol("<");

    private static final SubLSymbol INSTANCE_CARDINALITY = makeSymbol("INSTANCE-CARDINALITY");



    private static final SubLObject $$CollectionType = reader_make_constant_shell(makeString("CollectionType"));

    private static final SubLString $str310$Nothing_to_clip_ = makeString("Nothing to clip.");



    private static final SubLString $str312$Invalid_percentage__A__cannot_cli = makeString("Invalid percentage ~A: cannot clip from ~A to ~A.");

    private static final SubLString $str313$___A__Deleting__A_____ = makeString("~&~A: Deleting ~A ... ");









    private static final SubLString $str318$_A_is_not_a__A = makeString("~A is not a ~A");





    private static final SubLString $$$continue_anyway = makeString("continue anyway");



    private static final SubLString $str323$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLString $str324$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str325$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLList $list326 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));

    private static final SubLString $str327$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLString $str328$_done___ = makeString(" done.~%");

    private static final SubLSymbol $sym329$_EXIT = makeSymbol("%EXIT");



    private static final SubLString $str331$___A__Current_FORT_Count____A__ = makeString("~&~A: Current FORT Count : ~A~%");

    private static final SubLString $str332$___A__Gathering_tabu_collections_ = makeString("~&~A: Gathering tabu-collections ....~%");

    private static final SubLString $str333$___A__Selecting_clippable_collect = makeString("~&~A: Selecting clippable collections ....~%");

    private static final SubLString $str334$___A__Clipping_collections_______ = makeString("~&~A: Clipping collections ....~%");

    private static final SubLFloat $float$0_1 = makeDouble(0.1);



    private static final SubLString $str337$___A__Clipping_stopped_at__A_FORT = makeString("~&~A: Clipping stopped at ~A FORTs remaining with reason code ~A.~%");

    private static final SubLSymbol GENERATE_TERMS_TRANSCRIPT = makeSymbol("GENERATE-TERMS-TRANSCRIPT");

    private static final SubLObject $$CycAdministrator = reader_make_constant_shell(makeString("CycAdministrator"));

    private static final SubLInteger $int$212 = makeInteger(212);

    private static final SubLString $str341$Finding_assertions_about_missing_ = makeString("Finding assertions about missing SAP terms ....");

    private static final SubLList $list342 = list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("genls")));

    private static final SubLString $str343$Could_not_find_constant_for__S___ = makeString("Could not find constant for ~S ... skipping.~%");

    private static final SubLString $str344$_A_constants_were_skipped___ = makeString("~A constants were skipped.~%");

    public static SubLObject close_old_areas() {
        return NIL;
    }

    public static SubLObject verify_cyc_build() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        run_all_test_case_tables(StreamsLow.$standard_output$.getDynamicValue(thread), $TERSE, NIL, T, UNPROVIDED);
        constant_completion.report_constant_names_in_code_but_not_kb();
        return NIL;
    }

    public static SubLObject cyc_build_world(final SubLObject units_directory_path, final SubLObject world_filename) {
        dumper.load_kb(units_directory_path);
        build_write_image(world_filename);
        operation_communication.halt_cyc_image($str1$This_cyc_image_is_no_longer_usabl);
        return NIL;
    }

    public static SubLObject cyc_build_world_verify(final SubLObject dump_directory, final SubLObject world_filename) {
        dumper.load_kb(dump_directory);
        verify_cyc_build();
        build_write_image(world_filename);
        operation_communication.halt_cyc_image($str1$This_cyc_image_is_no_longer_usabl);
        return NIL;
    }

    public static SubLObject build_write_image(final SubLObject world_filename) {
        research_cyc_init.perform_research_cyc_build_finalizations();
        if (NIL != Filesys.probe_file(world_filename)) {
            Errors.cerror($$$Continue, $str4$World_file__A_already_exists_and_, world_filename);
        }
        operation_communication.write_cyc_image(world_filename, T);
        return NIL;
    }

    public static SubLObject cyc_install_directory_name(final SubLObject cyc_product_string, SubLObject revision_letter) {
        if (revision_letter == UNPROVIDED) {
            revision_letter = $$$A;
        }
        return cconcatenate($str6$cyc_, new SubLObject[]{ format_nil.format_nil_a_no_copy(cyc_product_string), $str7$_, format_nil.format_nil_a_no_copy(system_info.cyc_revision_string_s1p_format()), $str8$_kb_, format_nil.format_nil_a_no_copy(operation_communication.kb_version_string()), $str7$_, format_nil.format_nil_a_no_copy(revision_letter) });
    }

    public static SubLObject cyc_install_directory(final SubLObject cyc_platform_string, final SubLObject cyc_product_string, final SubLObject cyc_toolset, SubLObject revision_letter) {
        if (revision_letter == UNPROVIDED) {
            revision_letter = $$$A;
        }
        return cconcatenate($str9$_cyc_, new SubLObject[]{ format_nil.format_nil_a_no_copy(cyc_platform_string), $str10$_, format_nil.format_nil_a_no_copy(cyc_product_string), $str11$_install_, format_nil.format_nil_a_no_copy(cyc_install_directory_name(cyc_product_string, revision_letter)), $str10$_, format_nil.format_nil_a_no_copy(cyc_toolset), $str10$_ });
    }

    public static SubLObject cyc_versioned_world_name() {
        return cconcatenate($str12$kb_, new SubLObject[]{ format_nil.format_nil_a_no_copy(operation_communication.kb_version_string()), $str13$_load });
    }

    public static SubLObject build_write_image_versioned(final SubLObject directory) {
        assert NIL != Filesys.directory_p(directory) : "Filesys.directory_p(directory) " + "CommonSymbols.NIL != Filesys.directory_p(directory) " + directory;
        final SubLObject filename = cconcatenate(directory, cyc_versioned_world_name());
        format(T, $str15$Writing_cyc_image_to__A__, filename);
        if (NIL != build_write_image(filename)) {
            return filename;
        }
        return NIL;
    }

    public static SubLObject cyc_load_kb(final SubLObject units_directory) {
        if (NIL != operation_communication.kb_incremental_unitsP(units_directory)) {
            operation_communication.load_incremental_kb(units_directory);
            if (NIL == misc_utilities.system_code_initializations_run_p()) {
                misc_utilities.system_code_initializations(UNPROVIDED);
            }
        } else {
            dumper.load_kb(units_directory);
            misc_utilities.system_code_initializations(UNPROVIDED);
        }
        return kb_loaded();
    }

    public static SubLObject cyc_load_incremental_kb(final SubLObject incremental_units_directory) {
        operation_communication.load_incremental_kb(incremental_units_directory);
        if (NIL == misc_utilities.system_code_initializations_run_p()) {
            misc_utilities.system_code_initializations(UNPROVIDED);
        }
        return values(kb_loaded(), operation_communication.kb_op_number());
    }

    public static SubLObject cyc_dump_standard_kb(final SubLObject units_directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != operation_communication.receivingP())) {
            Errors.error($str19$This_CYC_is_receiving_operations_);
        }
        kb_utilities.swap_out_all_pristine_kb_objects();
        Storage.room(UNPROVIDED);
        kb_utilities.kb_statistics(UNPROVIDED, UNPROVIDED);
        return dumper.dump_standard_kb(units_directory);
    }

    public static SubLObject cyc_snapshot_kb(final SubLObject target_directory, SubLObject tombstoning_mode) {
        if (tombstoning_mode == UNPROVIDED) {
            tombstoning_mode = $MINIMAL;
        }
        return cyc_dump_snapshot_kb(target_directory, tombstoning_mode);
    }

    public static SubLObject cyc_dump_snapshot_kb(final SubLObject target_directory, SubLObject tombstoning_mode) {
        if (tombstoning_mode == UNPROVIDED) {
            tombstoning_mode = $MINIMAL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != operation_communication.receivingP())) {
            Errors.error($str19$This_CYC_is_receiving_operations_);
        }
        if (misc_utilities.generic_caches_directory().isString() && (NIL != Strings.stringE(misc_utilities.generic_caches_directory(), target_directory, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            Errors.warn($str23$Dump_snapshot_KB_trivially_finish, target_directory);
            return target_directory;
        }
        if (NIL == operation_queues.local_queue_empty()) {
            while (NIL == operation_queues.local_queue_empty()) {
                operation_queues.run_one_local_op();
            } 
        }
        operation_communication.save_transcript_ops();
        inference_analysis.save_recent_experience();
        inference_analysis.save_recent_asked_queries();
        hl_transcript_tracing.flush_hl_transcript_trace();
        final SubLObject agenda_runningP = agenda.agenda_running();
        final SubLObject saved_local_transcript = transcript_utilities.$local_transcript$.getGlobalValue();
        final SubLObject saved_read_transcript = transcript_utilities.$read_transcript$.getGlobalValue();
        final SubLObject saved_communication_mode = $communication_mode$.getGlobalValue();
        final SubLObject saved_remote_queue = queues.queue_copy(operation_queues.$remote_queue$.getGlobalValue());
        final SubLObject saved_local_queue = queues.queue_copy(operation_queues.local_queue());
        final SubLObject saved_auxiliary_queue = queues.queue_copy(operation_queues.$auxiliary_queue$.getGlobalValue());
        final SubLObject saved_transcript_queue = queues.queue_copy(operation_queues.$transcript_queue$.getGlobalValue());
        SubLObject disabled_servers = NIL;
        try {
            final SubLObject str = $str24$Setting_up_safe_KB_dump_environme;
            final SubLObject _prev_bind_0 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_last_pacification_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
            try {
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                $progress_notification_count$.bind(ZERO_INTEGER, thread);
                $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                $progress_count$.bind(ZERO_INTEGER, thread);
                $is_noting_progressP$.bind(T, thread);
                $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                noting_progress_preamble(str);
                Storage.room(UNPROVIDED);
                disabled_servers = tcp_server_utilities.disable_some_tcp_servers(UNPROVIDED);
                if (NIL != agenda_runningP) {
                    operation_communication.ensure_agenda_halted(NIL);
                }
                if ((NIL != agenda_runningP) && (NIL != agenda.agenda_running())) {
                    Errors.warn($str25$Agenda_was_not_successfully_halte);
                }
                transcript_utilities.$master_transcript$.setGlobalValue(NIL);
                transcript_utilities.$local_transcript$.setGlobalValue(NIL);
                transcript_utilities.set_read_transcript(NIL);
                $communication_mode$.setGlobalValue($UNKNOWN);
                operation_queues.clear_remote_queue();
                operation_queues.clear_local_queue();
                operation_queues.clear_auxiliary_queue();
                operation_queues.clear_transcript_queue();
                kb_utilities.swap_out_all_pristine_kb_objects();
                misc_utilities.flush_all_logs();
                Storage.room(UNPROVIDED);
                kb_utilities.kb_statistics(UNPROVIDED, UNPROVIDED);
                noting_progress_postamble();
            } finally {
                $silent_progressP$.rebind(_prev_bind_8, thread);
                $is_noting_progressP$.rebind(_prev_bind_7, thread);
                $progress_count$.rebind(_prev_bind_6, thread);
                $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                $progress_notification_count$.rebind(_prev_bind_4, thread);
                $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                $progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                $progress_start_time$.rebind(_prev_bind_0, thread);
            }
            dumper.snapshot_kb(misc_utilities.generic_caches_directory(), target_directory, tombstoning_mode);
        } finally {
            final SubLObject _prev_bind_9 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                final SubLObject str2 = $str27$Restoring_pre_dump_environment;
                final SubLObject _prev_bind_0_$1 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_10 = $progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_11 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_12 = $progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_13 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_14 = $progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_15 = $is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_16 = $silent_progressP$.currentBinding(thread);
                try {
                    $progress_start_time$.bind(get_universal_time(), thread);
                    $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                    $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    $progress_notification_count$.bind(ZERO_INTEGER, thread);
                    $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                    $progress_count$.bind(ZERO_INTEGER, thread);
                    $is_noting_progressP$.bind(T, thread);
                    $silent_progressP$.bind(NIL != str2 ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                    noting_progress_preamble(str2);
                    transcript_utilities.set_master_transcript(UNPROVIDED);
                    transcript_utilities.$local_transcript$.setGlobalValue(saved_local_transcript);
                    transcript_utilities.set_read_transcript(saved_read_transcript);
                    if (NIL != operation_communication.communication_modeP(saved_communication_mode)) {
                        operation_communication.set_communication_mode(saved_communication_mode);
                    }
                    operation_queues.$remote_queue$.setGlobalValue(saved_remote_queue);
                    operation_queues.set_local_queue(saved_local_queue);
                    operation_queues.$auxiliary_queue$.setGlobalValue(saved_auxiliary_queue);
                    operation_queues.$transcript_queue$.setGlobalValue(saved_transcript_queue);
                    if (NIL != agenda_runningP) {
                        agenda.start_agenda(UNPROVIDED);
                    }
                    tcp_server_utilities.re_enable_disabled_tcp_servers(disabled_servers);
                    noting_progress_postamble();
                } finally {
                    $silent_progressP$.rebind(_prev_bind_16, thread);
                    $is_noting_progressP$.rebind(_prev_bind_15, thread);
                    $progress_count$.rebind(_prev_bind_14, thread);
                    $progress_pacifications_since_last_nl$.rebind(_prev_bind_13, thread);
                    $progress_notification_count$.rebind(_prev_bind_12, thread);
                    $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_11, thread);
                    $progress_last_pacification_time$.rebind(_prev_bind_10, thread);
                    $progress_start_time$.rebind(_prev_bind_0_$1, thread);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_9, thread);
            }
        }
        return target_directory;
    }

    public static SubLObject suggest_kb_snapshot_directory(final SubLObject base_dir) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject canonical = Filesys.probe_file(base_dir);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!canonical.isString())) {
            Errors.error($str29$The_base_directory__A_does_not_ex, base_dir);
        }
        return operation_communication.kb_incremental_dump_directory(string_utilities.remove_last_char(dumper.kb_dump_directory(kb_loaded(), list(canonical)), UNPROVIDED));
    }

    public static SubLObject builder_catchup_and_dump_pipeline(final SubLObject start_units_dir, final SubLObject dump_parent_dir, final SubLObject dump_type, SubLObject load_submittedP, SubLObject email_about_submittedP, SubLObject additional_transcripts) {
        if (load_submittedP == UNPROVIDED) {
            load_submittedP = NIL;
        }
        if (email_about_submittedP == UNPROVIDED) {
            email_about_submittedP = NIL;
        }
        if (additional_transcripts == UNPROVIDED) {
            additional_transcripts = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        cyc_load_kb(start_units_dir);
        format(T, $str30$Loaded_KB_version___A__, operation_communication.kb_version_string());
        operation_communication.set_the_cyclist($$$TheBuilder);
        inference_metrics.$gathering_forward_inference_metricsP$.setDynamicValue(T, thread);
        set_load_submitted_transcripts(load_submittedP);
        set_send_submitted_transcript_loading_notices(email_about_submittedP);
        agenda.ensure_agenda_running();
        operation_communication.set_receive_state($$$yes);
        SubLObject minutes = ZERO_INTEGER;
        SubLObject total_ops = transcript_utilities.total_master_transcript_operations(UNPROVIDED);
        final SubLObject str = $str33$Determining_total_transcript_ops_;
        SubLObject _prev_bind_0 = $progress_start_time$.currentBinding(thread);
        SubLObject _prev_bind_2 = $progress_last_pacification_time$.currentBinding(thread);
        SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
        SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
        try {
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
            $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
            $progress_notification_count$.bind(ZERO_INTEGER, thread);
            $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
            $progress_count$.bind(ZERO_INTEGER, thread);
            $is_noting_progressP$.bind(T, thread);
            $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
            noting_progress_preamble(str);
            while (NIL == subl_promotions.non_negative_integer_p(total_ops)) {
                minutes = add(minutes, ONE_INTEGER);
                sleep(FIVE_INTEGER);
                total_ops = transcript_utilities.total_master_transcript_operations(UNPROVIDED);
            } 
            noting_progress_postamble();
        } finally {
            $silent_progressP$.rebind(_prev_bind_8, thread);
            $is_noting_progressP$.rebind(_prev_bind_7, thread);
            $progress_count$.rebind(_prev_bind_6, thread);
            $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
            $progress_notification_count$.rebind(_prev_bind_4, thread);
            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
            $progress_last_pacification_time$.rebind(_prev_bind_2, thread);
            $progress_start_time$.rebind(_prev_bind_0, thread);
        }
        format_nil.force_format(T, $str34$__Total_transcription_ops__A___, total_ops, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        minutes = ZERO_INTEGER;
        _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($str35$Getting_caught_up_on_operations__);
                while (operation_communication.kb_op_number().numL(total_ops)) {
                    note_percent_progress(operation_communication.kb_op_number(), total_ops);
                    final SubLObject new_total_ops = transcript_utilities.total_master_transcript_operations(UNPROVIDED);
                    if (NIL != subl_promotions.non_negative_integer_p(new_total_ops)) {
                        total_ops = new_total_ops;
                    }
                    minutes = add(minutes, ONE_INTEGER);
                    sleep(FIVE_INTEGER);
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
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        format_nil.force_format(T, $str36$__Catch_up_completed__Ops_remaini, total_ops, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        format(T, $str37$Post_catch_up_KB_version___A__, operation_communication.kb_version_string());
        operation_communication.server_summary(UNPROVIDED);
        SubLObject cdolist_list_var = additional_transcripts;
        SubLObject transcript_file = NIL;
        transcript_file = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        operation_communication.load_transcript(transcript_file, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            } finally {
                thread.throwStack.pop();
            }
            format(T, $str40$Post_load_transcript_KB_version__, operation_communication.kb_version_string());
            cdolist_list_var = cdolist_list_var.rest();
            transcript_file = cdolist_list_var.first();
        } 
        operation_communication.server_summary(UNPROVIDED);
        operation_communication.set_receive_state($$$no);
        final SubLObject dump_dir = operation_communication.kb_incremental_dump_directory(cconcatenate(dump_parent_dir, operation_communication.kb_loaded_string()));
        file_utilities.make_directory_recursive(dump_dir, UNPROVIDED, UNPROVIDED);
        result = dumper.cyc_dump_kb(dump_dir, dump_type, UNPROVIDED);
        format_nil.force_format(T, $str42$__Successfully_created__S_units__, dump_type, dump_dir, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return result;
    }

    public static SubLObject builder_log_directory() {
        final SubLObject log_directory = cconcatenate($str43$_home_builder_logs_, new SubLObject[]{ operation_communication.kb_number_string(add(ONE_INTEGER, kb_loaded())), $str10$_ });
        if (NIL == Filesys.directory_p(log_directory)) {
            Errors.warn($str44$No_log_directory__A_____strange__, log_directory);
            file_utilities.make_directory_recursive(log_directory, UNPROVIDED, UNPROVIDED);
        }
        return log_directory;
    }

    public static SubLObject builder_forward_inference_metrics_log() {
        return cconcatenate(format_nil.format_nil_a_no_copy(builder_log_directory()), new SubLObject[]{ $str45$forward_inference_metrics_, format_nil.format_nil_a_no_copy(Environment.get_process_id(UNPROVIDED)), $str46$_html });
    }

    public static SubLObject catchup_to_rollover_and_write_image(final SubLObject catchup_world_file, SubLObject kb_num, SubLObject send_submitted_transcript_loading_noticesP) {
        if (kb_num == UNPROVIDED) {
            kb_num = NIL;
        }
        if (send_submitted_transcript_loading_noticesP == UNPROVIDED) {
            send_submitted_transcript_loading_noticesP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != kb_num) && (!kb_num.eql(kb_loaded()))) && ZERO_INTEGER.eql(operation_communication.read_master_transcript_op_number())) {
            Errors.error($str47$The_catchup_image_expected_to_be_, kb_num, operation_communication.kb_version_string());
        }
        cb_system_tools.note_image_purpose($str48$Builder_s_catchup_to_rollover_ser);
        kb_utilities.kb_statistics(UNPROVIDED, UNPROVIDED);
        inference_metrics.$gathering_forward_inference_metricsP$.setDynamicValue(T, thread);
        set_load_submitted_transcripts(T);
        if (NIL != send_submitted_transcript_loading_noticesP) {
            set_send_submitted_transcript_loading_notices(T);
        }
        set_auto_increment_kb(NIL);
        catchup_to_rollover();
        Storage.room(T);
        kb_utilities.kb_statistics(UNPROVIDED, UNPROVIDED);
        build_write_image(catchup_world_file);
        final SubLObject builder_forward_inference_metrics_log = builder_forward_inference_metrics_log();
        if (NIL == Filesys.probe_file(builder_forward_inference_metrics_log)) {
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(builder_forward_inference_metrics_log, $OUTPUT);
                if (!stream.isStream()) {
                    Errors.error($str50$Unable_to_open__S, builder_forward_inference_metrics_log);
                }
                final SubLObject stream_$3 = stream;
                final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
                try {
                    html_macros.$html_stream$.bind(stream_$3, thread);
                    cb_query.cb_show_forward_inference_metrics(TWENTY_INTEGER);
                } finally {
                    html_macros.$html_stream$.rebind(_prev_bind_0, thread);
                }
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        return NIL;
    }

    public static SubLObject catchup_to_rollover() {
        catchup_to_rollover_setup();
        process_wait(cconcatenate($str51$Getting_caught_up_to_KB_rollover_, format_nil.format_nil_a_no_copy(add(ONE_INTEGER, kb_loaded()))), KB_FULL_TRANSCRIPT_LOADED);
        return NIL;
    }

    public static SubLObject catchup_to_rollover_setup() {
        if (NIL == agenda.agenda_running()) {
            Errors.error($str53$The_agenda_is_not_running___Fix_y);
        }
        operation_communication.set_communication_mode($RECEIVE_ONLY);
        if (operation_communication.set_the_cyclist($$$TheBuilder).eql($$Guest)) {
            operation_communication.set_the_cyclist($$$CycAdministrator);
        }
        format(T, $str57$Getting_caught_up__);
        force_output(T);
        return NIL;
    }

    public static SubLObject load_submitted_transcripts_and_write_image(final SubLObject ordered_concatenation_transcript, final SubLObject predump_world_file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_system_tools.note_image_purpose($str58$Builder_s_transcript_loading_serv);
        final SubLObject _prev_bind_0 = Errors.$continue_cerrorP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $unencapsulating_within_agenda$.currentBinding(thread);
        try {
            Errors.$continue_cerrorP$.bind(T, thread);
            $unencapsulating_within_agenda$.bind(T, thread);
            operation_communication.load_transcript_file(ordered_concatenation_transcript, NIL, $NONE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            $unencapsulating_within_agenda$.rebind(_prev_bind_2, thread);
            Errors.$continue_cerrorP$.rebind(_prev_bind_0, thread);
        }
        Storage.room(T);
        kb_utilities.kb_statistics(UNPROVIDED, UNPROVIDED);
        build_write_image(predump_world_file);
        return NIL;
    }

    public static SubLObject catchup_to_current_and_write_image_versioned(final SubLObject directory) {
        catchup_to_current_kb();
        return build_write_image_versioned(directory);
    }

    public static SubLObject catchup_to_current_and_write_image(final SubLObject current_world_file) {
        catchup_to_current_kb();
        return build_write_image(current_world_file);
    }

    public static SubLObject catchup_to_current_kb() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_system_tools.note_image_purpose($str60$Builder_s_catchup_to_current_serv);
        if (NIL == agenda.agenda_running()) {
            Errors.error($str53$The_agenda_is_not_running___Fix_y);
        }
        kb_utilities.kb_statistics(UNPROVIDED, UNPROVIDED);
        operation_communication.set_communication_mode($RECEIVE_ONLY);
        if (operation_communication.set_the_cyclist($$$TheBuilder).eql($$Guest)) {
            operation_communication.set_the_cyclist($$$CycAdministrator);
        }
        sleep(FIVE_INTEGER);
        final SubLObject start_op_num = operation_communication.read_master_transcript_op_number();
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
                noting_percent_progress_preamble(cconcatenate($$$Getting_caught_up_from_KB_, new SubLObject[]{ format_nil.format_nil_a_no_copy(kb_loaded()), $str62$_, format_nil.format_nil_a_no_copy(operation_communication.read_master_transcript_op_number()), $$$_to_KB_, format_nil.format_nil_a_no_copy(kb_loaded()), $str62$_, format_nil.format_nil_a_no_copy(transcript_utilities.total_master_transcript_operations(UNPROVIDED)) }));
                while (NIL == caught_up_on_master_transcript()) {
                    note_percent_progress(subtract(operation_communication.read_master_transcript_op_number(), start_op_num), subtract(transcript_utilities.total_master_transcript_operations(UNPROVIDED), start_op_num));
                    sleep(FIVE_INTEGER);
                } 
            } finally {
                final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        operation_communication.set_communication_mode($DEAF);
        format(T, $str65$Caught_up_to_KB__A__, operation_communication.kb_version_string());
        sleep(FIVE_INTEGER);
        kb_utilities.kb_statistics(UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject caught_up_on_operationsP(SubLObject target_remote_op_count) {
        if (target_remote_op_count == UNPROVIDED) {
            target_remote_op_count = transcript_server.total_master_transcript_operations_patient(UNPROVIDED);
        }
        SubLSystemTrampolineFile.enforceType(target_remote_op_count, NON_NEGATIVE_INTEGER_P);
        final SubLObject actual_remote_op_count = operation_communication.kb_op_number();
        return numLE(target_remote_op_count, actual_remote_op_count);
    }

    public static SubLObject catch_up_on_operations_verbose(SubLObject target_op_count, SubLObject load_submitted_operationsP, SubLObject keep_going_upon_kb_rolloverP) {
        if (target_op_count == UNPROVIDED) {
            target_op_count = transcript_server.total_master_transcript_operations_patient(UNPROVIDED);
        }
        if (load_submitted_operationsP == UNPROVIDED) {
            load_submitted_operationsP = T;
        }
        if (keep_going_upon_kb_rolloverP == UNPROVIDED) {
            keep_going_upon_kb_rolloverP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        operation_communication.set_the_cyclist($$$CycAdministrator);
        set_load_submitted_transcripts(load_submitted_operationsP);
        operation_communication.set_receive_state($$$yes);
        sleep(THREE_INTEGER);
        final SubLObject start_op_count = operation_communication.kb_op_number();
        final SubLObject start_kb = kb_loaded();
        SubLObject total_time = ZERO_INTEGER;
        final SubLObject time_var = get_internal_real_time();
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
                noting_percent_progress_preamble(cconcatenate($$$Getting_caught_up_from_KB_, new SubLObject[]{ format_nil.format_nil_a_no_copy(start_kb), $str62$_, format_nil.format_nil_a_no_copy(start_op_count), $$$_to_KB_, format_nil.format_nil_a_no_copy(start_kb), $str62$_, format_nil.format_nil_a_no_copy(target_op_count) }));
                while (NIL == caught_up_on_operationsP(target_op_count)) {
                    note_percent_progress(subtract(operation_communication.kb_op_number(), start_op_count), subtract(target_op_count, start_op_count));
                    sleep(FIVE_INTEGER);
                } 
            } finally {
                final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        if (NIL != keep_going_upon_kb_rolloverP) {
            final SubLObject current_kb = kb_loaded();
            if (!start_kb.eql(current_kb)) {
                final SubLObject current_target_op_count = transcript_utilities.total_master_transcript_operations(UNPROVIDED);
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subl_promotions.non_negative_integer_p(current_target_op_count))) {
                    Errors.error($str67$Could_not_get_total_master_transc, current_kb, start_kb);
                }
                final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble(cconcatenate($$$Now_getting_caught_up_from_KB_, new SubLObject[]{ format_nil.format_nil_a_no_copy(current_kb), $str62$_, format_nil.format_nil_a_no_copy(ZERO_INTEGER), $$$_to_KB_, format_nil.format_nil_a_no_copy(current_kb), $str62$_, format_nil.format_nil_a_no_copy(current_target_op_count) }));
                        while (operation_communication.kb_op_number().numL(add(target_op_count, current_target_op_count))) {
                            note_percent_progress(subtract(operation_communication.kb_op_number(), target_op_count), current_target_op_count);
                            sleep(FIVE_INTEGER);
                        } 
                    } finally {
                        final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                }
            }
        }
        total_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        format(T, $str69$__Catching_up_on_operations_took_, total_time);
        operation_communication.set_receive_state($$$no);
        return NIL;
    }

    public static SubLObject catch_up_on_operations_very_verbosely(SubLObject target_op_count, SubLObject load_submitted_operationsP, SubLObject keep_going_upon_kb_rolloverP) {
        if (target_op_count == UNPROVIDED) {
            target_op_count = transcript_server.total_master_transcript_operations_patient(UNPROVIDED);
        }
        if (load_submitted_operationsP == UNPROVIDED) {
            load_submitted_operationsP = NIL;
        }
        if (keep_going_upon_kb_rolloverP == UNPROVIDED) {
            keep_going_upon_kb_rolloverP = T;
        }
        final SubLObject kb_object_count_list_1 = kb_utilities.kb_object_count_list();
        catch_up_on_operations_verbose(target_op_count, load_submitted_operationsP, keep_going_upon_kb_rolloverP);
        final SubLObject kb_object_count_list_2 = kb_utilities.kb_object_count_list();
        final SubLObject new_constant_count = kb_utilities.kb_object_count_lists_new_constant_count(kb_object_count_list_2, kb_object_count_list_1);
        final SubLObject new_nart_count = kb_utilities.kb_object_count_lists_new_nart_count(kb_object_count_list_2, kb_object_count_list_1);
        final SubLObject new_assertion_count = kb_utilities.kb_object_count_lists_new_assertion_count(kb_object_count_list_2, kb_object_count_list_1);
        final SubLObject new_kb_hl_support_count = kb_utilities.kb_object_count_lists_new_kb_hl_support_count(kb_object_count_list_2, kb_object_count_list_1);
        final SubLObject new_deduction_count = kb_utilities.kb_object_count_lists_new_deduction_count(kb_object_count_list_2, kb_object_count_list_1);
        if (((((NIL != subl_promotions.non_zero_integer_p(new_constant_count)) || (NIL != subl_promotions.non_zero_integer_p(new_nart_count))) || (NIL != subl_promotions.non_zero_integer_p(new_assertion_count))) || (NIL != subl_promotions.non_zero_integer_p(new_kb_hl_support_count))) || (NIL != subl_promotions.non_zero_integer_p(new_deduction_count))) {
            if (NIL.isString()) {
                format(T, $str71$___A__, NIL);
            }
            if (NIL != subl_promotions.non_zero_integer_p(new_constant_count)) {
                format(T, $str72$___s_constant_A__A__, new SubLObject[]{ abs(new_constant_count), abs(new_constant_count).numG(ONE_INTEGER) ? $$$s_were : $$$_was, NIL != subl_promotions.positive_integer_p(new_constant_count) ? $$$created : $$$destroyed });
            }
            if (NIL != subl_promotions.non_zero_integer_p(new_nart_count)) {
                format(T, $str77$___s_nart_A__A__, new SubLObject[]{ abs(new_nart_count), abs(new_nart_count).numG(ONE_INTEGER) ? $$$s_were : $$$_was, NIL != subl_promotions.positive_integer_p(new_nart_count) ? $$$created : $$$destroyed });
            }
            if (NIL != subl_promotions.non_zero_integer_p(new_assertion_count)) {
                format(T, $str78$___s_assertion_A__A__, new SubLObject[]{ abs(new_assertion_count), abs(new_assertion_count).numG(ONE_INTEGER) ? $$$s_were : $$$_was, NIL != subl_promotions.positive_integer_p(new_assertion_count) ? $$$created : $$$destroyed });
            }
            if (NIL != subl_promotions.non_zero_integer_p(new_kb_hl_support_count)) {
                format(T, $str79$___s_kb_hl_support_A__A__, new SubLObject[]{ abs(new_kb_hl_support_count), abs(new_kb_hl_support_count).numG(ONE_INTEGER) ? $$$s_were : $$$_was, NIL != subl_promotions.positive_integer_p(new_kb_hl_support_count) ? $$$created : $$$destroyed });
            }
            if (NIL != subl_promotions.non_zero_integer_p(new_deduction_count)) {
                format(T, $str80$___s_deduction_A__A__, new SubLObject[]{ abs(new_deduction_count), abs(new_deduction_count).numG(ONE_INTEGER) ? $$$s_were : $$$_was, NIL != subl_promotions.positive_integer_p(new_deduction_count) ? $$$created : $$$destroyed });
            }
        } else
            if (NIL.isString()) {
                format(T, $str71$___A__, NIL);
            }

        force_output(T);
        kb_utilities.kb_statistics(UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject run_baseline_tests() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = cyc_testing.$run_tiny_kb_tests_in_full_kbP$.currentBinding(thread);
        try {
            cyc_testing.$run_tiny_kb_tests_in_full_kbP$.bind(T, thread);
            thread.resetMultipleValues();
            final SubLObject overall = cyc_testing.run_all_cyc_tests_int($str82$tests_post_build_testdcl_lisp, StreamsLow.$standard_output$.getDynamicValue(thread), $TERSE, NIL, $POST_BUILD, cyc_testing.$run_tiny_kb_tests_in_full_kbP$.getDynamicValue(thread), T, T, $ALL, NIL, NIL, NIL, UNPROVIDED, UNPROVIDED);
            final SubLObject runs = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result = list(overall, runs);
        } finally {
            cyc_testing.$run_tiny_kb_tests_in_full_kbP$.rebind(_prev_bind_0, thread);
        }
        final SubLObject result_file = cconcatenate($str85$release_baseline_tests_, new SubLObject[]{ format_nil.format_nil_a_no_copy(operation_communication.kb_number_string(UNPROVIDED)), $str7$_, format_nil.format_nil_a_no_copy(system_info.cyc_revision_string()), $str7$_, format_nil.format_nil_a_no_copy(numeric_date_utilities.timestamp(UNPROVIDED, UNPROVIDED)), $str86$_cfasl });
        final SubLObject str = $$$Writing_result_file;
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_last_pacification_time$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $progress_notification_count$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $progress_pacifications_since_last_nl$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $progress_count$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $is_noting_progressP$.currentBinding(thread);
        final SubLObject _prev_bind_9 = $silent_progressP$.currentBinding(thread);
        try {
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
            $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
            $progress_notification_count$.bind(ZERO_INTEGER, thread);
            $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
            $progress_count$.bind(ZERO_INTEGER, thread);
            $is_noting_progressP$.bind(T, thread);
            $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
            noting_progress_preamble(str);
            cfasl_utilities.cfasl_save_externalized(result, result_file);
            noting_progress_postamble();
        } finally {
            $silent_progressP$.rebind(_prev_bind_9, thread);
            $is_noting_progressP$.rebind(_prev_bind_8, thread);
            $progress_count$.rebind(_prev_bind_7, thread);
            $progress_pacifications_since_last_nl$.rebind(_prev_bind_6, thread);
            $progress_notification_count$.rebind(_prev_bind_5, thread);
            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_4, thread);
            $progress_last_pacification_time$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
        }
        return values(result, Filesys.probe_file(result_file));
    }

    public static SubLObject baseline_results_to_map(final SubLObject filename) {
        final SubLObject result_info = cfasl_utilities.cfasl_load(filename);
        final SubLObject tests_run = second(result_info);
        final SubLObject result_map = dictionary.new_dictionary(EQUAL, UNPROVIDED);
        SubLObject cdolist_list_var = tests_run;
        SubLObject test_run = NIL;
        test_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = test_run;
            SubLObject category = NIL;
            SubLObject test = NIL;
            SubLObject outcome = NIL;
            SubLObject time = NIL;
            destructuring_bind_must_consp(current, datum, $list89);
            category = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list89);
            test = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list89);
            outcome = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list89);
            time = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject category_map = map_utilities.map_get(result_map, category, UNPROVIDED);
                if (NIL == map_utilities.map_p(category_map)) {
                    category_map = make_hash_table($int$100, EQUAL, UNPROVIDED);
                    map_utilities.map_put(result_map, category, category_map);
                }
                map_utilities.map_put(category_map, test, outcome);
                map_utilities.map_push(category_map, outcome, test);
            } else {
                cdestructuring_bind_error(datum, $list89);
            }
            cdolist_list_var = cdolist_list_var.rest();
            test_run = cdolist_list_var.first();
        } 
        return result_map;
    }

    public static SubLObject compute_baseline_regressions(final SubLObject baseline, final SubLObject competition) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject categories = map_utilities.map_keys(baseline);
        final SubLObject diff_counts = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        final SubLObject diff_details = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = categories;
        SubLObject category = NIL;
        category = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject b_map = map_utilities.map_get(baseline, category, UNPROVIDED);
            final SubLObject c_map = map_utilities.map_get(competition, category, UNPROVIDED);
            final SubLObject cat_diff_count = dictionary.new_dictionary(EQUAL, UNPROVIDED);
            final SubLObject cat_diff_detail = dictionary.new_dictionary(EQUAL, UNPROVIDED);
            map_utilities.map_put(diff_counts, category, cat_diff_count);
            map_utilities.map_put(diff_details, category, cat_diff_detail);
            final SubLObject iterator = map_utilities.new_map_iterator(b_map);
            SubLObject valid;
            for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject var = iteration.iteration_next(iterator);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != valid) {
                    SubLObject current;
                    final SubLObject datum = current = var;
                    SubLObject test = NIL;
                    SubLObject b_outcome = NIL;
                    destructuring_bind_must_consp(current, datum, $list92);
                    test = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list92);
                    b_outcome = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (!b_outcome.isList()) {
                            final SubLObject c_outcome = (NIL != map_utilities.map_p(c_map)) ? map_utilities.map_get(c_map, test, $NOT_PRESENT) : $NOT_PRESENT;
                            final SubLObject key = cons(b_outcome, c_outcome);
                            map_utilities.map_increment(cat_diff_count, key, UNPROVIDED);
                            map_utilities.map_push(cat_diff_detail, key, test);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list92);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            category = cdolist_list_var.first();
        } 
        return values(diff_counts, diff_details);
    }

    public static SubLObject show_baseline_regression_info(final SubLObject diff_info, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject iterator = map_utilities.new_map_iterator(diff_info);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject category = NIL;
                SubLObject info = NIL;
                destructuring_bind_must_consp(current, datum, $list95);
                category = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list95);
                info = current.first();
                current = current.rest();
                if (NIL == current) {
                    format(stream, $str96$___S__, category);
                    dictionary_utilities.print_dictionary_contents(info, stream);
                } else {
                    cdestructuring_bind_error(datum, $list95);
                }
            }
        }
        return diff_info;
    }

    public static SubLObject show_baseline_regression_details(final SubLObject diff_detail, SubLObject regression_conditions, SubLObject stream) {
        if (regression_conditions == UNPROVIDED) {
            regression_conditions = $standard_regression_conditions$.getGlobalValue();
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject iterator = map_utilities.new_map_iterator(diff_detail);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject category = NIL;
                SubLObject cat_map = NIL;
                destructuring_bind_must_consp(current, datum, $list99);
                category = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list99);
                cat_map = current.first();
                current = current.rest();
                if (NIL == current) {
                    format(stream, $str96$___S__, category);
                    SubLObject cdolist_list_var = regression_conditions;
                    SubLObject condition = NIL;
                    condition = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject tests = Sort.sort(map_utilities.map_get(cat_map, condition, UNPROVIDED), $sym100$TERM__, UNPROVIDED);
                        if (NIL != list_utilities.sublisp_boolean(tests)) {
                            format(stream, $str101$__S__, condition);
                            SubLObject cdolist_list_var_$7 = tests;
                            SubLObject test = NIL;
                            test = cdolist_list_var_$7.first();
                            while (NIL != cdolist_list_var_$7) {
                                format(stream, $str102$___S__, test);
                                cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                                test = cdolist_list_var_$7.first();
                            } 
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        condition = cdolist_list_var.first();
                    } 
                } else {
                    cdestructuring_bind_error(datum, $list99);
                }
            }
        }
        return diff_detail;
    }

    public static SubLObject declare_cyc_product(final SubLObject cyc_product, final SubLObject code_product, final SubLObject kb_product, final SubLObject branch_tag) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != keywordp(cyc_product) : "Types.keywordp(cyc_product) " + "CommonSymbols.NIL != Types.keywordp(cyc_product) " + cyc_product;
        assert NIL != keywordp(kb_product) : "Types.keywordp(kb_product) " + "CommonSymbols.NIL != Types.keywordp(kb_product) " + kb_product;
        assert NIL != keywordp(code_product) : "Types.keywordp(code_product) " + "CommonSymbols.NIL != Types.keywordp(code_product) " + code_product;
        assert NIL != stringp(branch_tag) : "Types.stringp(branch_tag) " + "CommonSymbols.NIL != Types.stringp(branch_tag) " + branch_tag;
        if (NIL != cyc_product_definition_presentP(cyc_product, code_product, kb_product, branch_tag)) {
            return Errors.warn($str105$The_cyc_product___A__is_already_p, cyc_product);
        }
        if (NIL != find_cyc_product(code_product, kb_product, branch_tag)) {
            return Errors.error($str106$There_already_exists_a_different_, find_cyc_product(code_product, kb_product, branch_tag));
        }
        if (NIL != assoc(cyc_product, $cyc_product_definitions$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
           if(!SubLMain.BOOTY_HACKZ)  return Errors.error($str107$The_cyc_product__A_already_exists, cyc_product);
        }
        $all_cyc_products$.setDynamicValue(cons(cyc_product, $all_cyc_products$.getDynamicValue(thread)), thread);
        $cyc_product_definitions$.setDynamicValue(cons(list(cyc_product, kb_product, code_product, branch_tag), $cyc_product_definitions$.getDynamicValue(thread)), thread);
        return $cyc_product_definitions$.getDynamicValue(thread);
    }

    public static SubLObject cyc_product_definition_presentP(final SubLObject cyc_product, final SubLObject code_product, final SubLObject kb_product, final SubLObject branch_tag) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return member(list(cyc_product, code_product, kb_product, branch_tag), $cyc_product_definitions$.getDynamicValue(thread), symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject find_cyc_product(final SubLObject code_product, final SubLObject kb_product, final SubLObject branch_tag) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return find(list(code_product, kb_product, branch_tag), $cyc_product_definitions$.getDynamicValue(thread), symbol_function(EQUAL), symbol_function(CDR), UNPROVIDED, UNPROVIDED).first();
    }

    public static SubLObject cyc_product() {
        return $cyc_product$.getGlobalValue();
    }

    public static SubLObject code_product() {
        return $code_product$.getGlobalValue();
    }

    public static SubLObject kb_product() {
        return $kb_product$.getGlobalValue();
    }

    public static SubLObject branch_tag() {
        return $branch_tag$.getGlobalValue();
    }

    public static SubLObject set_cyc_product(final SubLObject cyc_product) {
        assert NIL != keywordp(cyc_product) : "Types.keywordp(cyc_product) " + "CommonSymbols.NIL != Types.keywordp(cyc_product) " + cyc_product;
        $cyc_product$.setGlobalValue(cyc_product);
        return cyc_product();
    }

    public static SubLObject set_kb_product(final SubLObject kb_product) {
        assert NIL != keywordp(kb_product) : "Types.keywordp(kb_product) " + "CommonSymbols.NIL != Types.keywordp(kb_product) " + kb_product;
        $kb_product$.setGlobalValue(kb_product);
        return kb_product();
    }

    public static SubLObject initialize_cyc_product() {
        final SubLObject cyc_product = detect_cyc_product();
        if (NIL != cyc_product) {
            set_cyc_product(cyc_product);
        } else {
            set_cyc_product($UNKNOWN_CYC_PRODUCT);
        }
        return cyc_product;
    }

    public static SubLObject detect_cyc_product() {
        return find_cyc_product(code_product(), kb_product(), branch_tag());
    }

    public static SubLObject load_file_dependency_information(final SubLObject path, SubLObject test) {
        if (test == UNPROVIDED) {
            test = EQUAL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject information = dictionary.new_dictionary(test, UNPROVIDED);
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(path, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str50$Unable_to_open__S, path);
            }
            final SubLObject stream_var = stream;
            if (stream_var.isStream()) {
                final SubLObject stream_var_$8 = stream_var;
                SubLObject line_number_var = NIL;
                SubLObject line = NIL;
                line_number_var = ZERO_INTEGER;
                for (line = file_utilities.do_stream_lines_get_next_line(stream_var_$8); NIL != line; line = file_utilities.do_stream_lines_get_next_line(stream_var_$8)) {
                    final SubLObject split_point = position_if(WHITESPACE_CHAR_P, line, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    final SubLObject dependent = string_utilities.substring(line, ZERO_INTEGER, split_point);
                    final SubLObject dependency = string_utilities.substring(line, add(ONE_INTEGER, split_point), UNPROVIDED);
                    SubLObject dependencies = map_utilities.map_get(information, dependent, UNPROVIDED);
                    if (NIL == set.set_p(dependencies)) {
                        dependencies = set.new_set(test, UNPROVIDED);
                        map_utilities.map_put(information, dependent, dependencies);
                    }
                    set.set_add(dependency, dependencies);
                    line_number_var = number_utilities.f_1X(line_number_var);
                }
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return information;
    }

    public static SubLObject augment_file_set(final SubLObject file_set, final SubLObject dependency_information) {
        final SubLObject additions = set.new_set(set.set_test(file_set), UNPROVIDED);
        final SubLObject set_contents_var = set.do_set_internal(file_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject file;
        SubLObject dependencies;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            file = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, file)) {
                dependencies = map_utilities.map_get(dependency_information, file, UNPROVIDED);
                if (NIL != set.set_p(dependencies)) {
                    set_utilities.set_nmerge(additions, dependencies);
                }
            }
        }
        set_utilities.set_nprune(additions, file_set);
        final SubLObject actual_additions = set.set_size(additions);
        set_utilities.set_nmerge(file_set, additions);
        return actual_additions;
    }

    public static SubLObject completely_augment_file_set(final SubLObject file_set, final SubLObject dependency_information) {
        final SubLObject ceiling = add(set.set_size(file_set), map_utilities.map_size(dependency_information));
        SubLObject counter = ZERO_INTEGER;
        SubLObject doneP = NIL;
        while (NIL == doneP) {
            final SubLObject additions = augment_file_set(file_set, dependency_information);
            doneP = zerop(additions);
            counter = add(counter, ONE_INTEGER);
            if (ceiling.numL(counter)) {
                Errors.error($str125$Augmenting_the_file_set_not_termi, ceiling);
            }
        } 
        return file_set;
    }

    public static SubLObject write_ant_fileset_declaration(final SubLObject fileset_id, final SubLObject dir_spec, final SubLObject files_to_include, SubLObject files_to_exclude) {
        if (files_to_exclude == UNPROVIDED) {
            files_to_exclude = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject attributes = list($$$id, fileset_id, $$$dir, dir_spec);
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal($$$fileset, attributes, NIL, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$9 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                    final SubLObject name_attribute_list = list($$$name, $VALUE);
                    final SubLObject name_spot = name_attribute_list.rest();
                    SubLObject cdolist_list_var = files_to_include;
                    SubLObject file_to_include = NIL;
                    file_to_include = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        rplaca(name_spot, file_to_include);
                        xml_utilities.xml_terpri();
                        final SubLObject _prev_bind_0_$10 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$11 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$include, name_attribute_list, T, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$11 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$11, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$11, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$10, thread);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        file_to_include = cdolist_list_var.first();
                    } 
                    cdolist_list_var = files_to_exclude;
                    SubLObject file_to_exclude = NIL;
                    file_to_exclude = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        rplaca(name_spot, file_to_exclude);
                        xml_utilities.xml_terpri();
                        final SubLObject _prev_bind_0_$12 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$12 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$exclude, name_attribute_list, T, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$13 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$13, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$12, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$12, thread);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        file_to_exclude = cdolist_list_var.first();
                    } 
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$9, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal($$$fileset);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return fileset_id;
    }

    public static SubLObject construct_rooted_file_set_from_list(final SubLObject file_list, SubLObject root, SubLObject test) {
        if (root == UNPROVIDED) {
            root = file_utilities.path_separator_string($UNIX);
        }
        if (test == UNPROVIDED) {
            test = EQUAL;
        }
        return root_file_set(set_utilities.construct_set_from_list(file_list, test, UNPROVIDED), root, test);
    }

    public static SubLObject root_file_set(final SubLObject file_set, SubLObject root, SubLObject test) {
        if (root == UNPROVIDED) {
            root = file_utilities.path_separator_string($UNIX);
        }
        if (test == UNPROVIDED) {
            test = EQUAL;
        }
        final SubLObject new_file_set = set.new_set(test, set.set_size(file_set));
        final SubLObject set_contents_var = set.do_set_internal(file_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject file;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            file = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, file)) {
                set.set_add(file_utilities.make_path_absolute_relative_to(root, file), new_file_set);
            }
        }
        return new_file_set;
    }

    public static SubLObject unroot_file_set(final SubLObject file_set, SubLObject root, SubLObject test) {
        if (root == UNPROVIDED) {
            root = file_utilities.path_separator_string($UNIX);
        }
        if (test == UNPROVIDED) {
            test = EQUAL;
        }
        final SubLObject new_file_set = set.new_set(test, set.set_size(file_set));
        final SubLObject set_contents_var = set.do_set_internal(file_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject file;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            file = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, file)) {
                set.set_add(file_utilities.make_absolute_path_relative_to(file, root), new_file_set);
            }
        }
        return new_file_set;
    }

    public static SubLObject reroot_file_set(final SubLObject file_set, SubLObject old_root, SubLObject new_root, SubLObject test) {
        if (test == UNPROVIDED) {
            test = EQUAL;
        }
        old_root = file_utilities.possibly_append_path_separator_char(old_root);
        new_root = file_utilities.possibly_append_path_separator_char(new_root);
        final SubLObject absolute_target_p = file_utilities.absolute_pathP(new_root);
        SubLObject target_root = new_root;
        final SubLObject new_file_set = set.new_set(test, set.set_size(file_set));
        SubLObject path_type = NIL;
        SubLObject path_string = NIL;
        if (NIL == absolute_target_p) {
            path_type = file_utilities.guess_path_type_robust(new_root);
            path_string = file_utilities.path_separator_string(path_type);
            target_root = file_utilities.make_path_absolute_relative_to(path_string, new_root);
        }
        final SubLObject set_contents_var = set.do_set_internal(file_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject file;
        SubLObject uprooted_file;
        SubLObject rerooted_file;
        SubLObject final_file;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            file = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, file)) {
                uprooted_file = file_utilities.make_absolute_path_relative_to(file, old_root);
                rerooted_file = file_utilities.make_path_absolute_relative_to(target_root, uprooted_file);
                final_file = (NIL != absolute_target_p) ? rerooted_file : file_utilities.make_absolute_path_relative_to(rerooted_file, path_string);
                set.set_add(final_file, new_file_set);
            }
        }
        return new_file_set;
    }

    public static SubLObject test_reroot_file_set(final SubLObject file_list, final SubLObject old_root, final SubLObject new_root, SubLObject test) {
        if (test == UNPROVIDED) {
            test = EQUAL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject file_set = set_utilities.construct_set_from_list(file_list, test, UNPROVIDED);
        final SubLObject new_file_set = reroot_file_set(file_set, old_root, new_root, test);
        final SubLObject set_contents_var = set.do_set_internal(new_file_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject new_file;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            new_file = set_contents.do_set_contents_next(basis_object, state);
            if (((NIL != set_contents.do_set_contents_element_validP(state, new_file)) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) && (NIL == string_utilities.starts_with(new_file, new_root))) {
                Errors.error($str148$Rerooting_from__A_to__A_failed_an, old_root, new_root, new_file);
            }
        }
        return $SUCCESS;
    }

    public static SubLObject serialize_kb_store_lru_information(final SubLObject directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLSystemTrampolineFile.enforceType(directory, DIRECTORY_P);
        final SubLObject message = cconcatenate($str151$Serializing_LRU_information_for_K, format_nil.format_nil_a_no_copy(directory));
        final SubLObject list_var = list(constant_index_manager.$constant_index_manager$.getGlobalValue(), nart_index_manager.$nart_index_manager$.getGlobalValue(), nart_hl_formula_manager.$nart_hl_formula_manager$.getGlobalValue(), assertion_manager.$assertion_content_manager$.getGlobalValue(), kb_hl_support_manager.$kb_hl_support_content_manager$.getGlobalValue(), deduction_manager.$deduction_content_manager$.getGlobalValue(), unrepresented_term_index_manager.$unrepresented_term_index_manager$.getGlobalValue());
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind(NIL != message ? message : $$$cdolist, thread);
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
                SubLObject kbom = NIL;
                kbom = csome_list_var.first();
                while (NIL != csome_list_var) {
                    kb_object_manager.serialize_kbom_lru_information(kbom, directory);
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    kbom = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
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
        return directory;
    }

    public static SubLObject precache_kb_store_by_lru_information(final SubLObject directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLSystemTrampolineFile.enforceType(directory, DIRECTORY_P);
        final SubLObject message = cconcatenate($str154$Precaching_KB_Store_with_LRU_info, format_nil.format_nil_a_no_copy(directory));
        final SubLObject list_var = list(constant_index_manager.$constant_index_manager$.getGlobalValue(), nart_index_manager.$nart_index_manager$.getGlobalValue(), nart_hl_formula_manager.$nart_hl_formula_manager$.getGlobalValue(), assertion_manager.$assertion_content_manager$.getGlobalValue(), kb_hl_support_manager.$kb_hl_support_content_manager$.getGlobalValue(), deduction_manager.$deduction_content_manager$.getGlobalValue(), unrepresented_term_index_manager.$unrepresented_term_index_manager$.getGlobalValue());
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind(NIL != message ? message : $$$cdolist, thread);
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
                SubLObject kbom = NIL;
                kbom = csome_list_var.first();
                while (NIL != csome_list_var) {
                    kb_object_manager.precache_kbom_by_lru_information(kbom, directory);
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    kbom = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
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
        return directory;
    }

    public static SubLObject set_kb_store_lru_settings(SubLObject percent, SubLObject max) {
        if (percent == UNPROVIDED) {
            percent = $int$100;
        }
        if (max == UNPROVIDED) {
            max = $most_positive_fixnum$.getGlobalValue();
        }
        assertion_manager.resize_assertion_content_kbom_lru(percent, max);
        constant_index_manager.resize_constant_index_kbom_lru(percent, max);
        deduction_manager.resize_deduction_content_kbom_lru(percent, max);
        nart_index_manager.resize_nart_index_kbom_lru(percent, max);
        unrepresented_term_index_manager.resize_unrepresented_term_index_kbom_lru(percent, max);
        return NIL;
    }

    public static SubLObject set_kb_store_lru_swap_level(SubLObject n) {
        if (n == UNPROVIDED) {
            n = TEN_INTEGER;
        }
        if (n.numL(ONE_INTEGER)) {
            n = ONE_INTEGER;
        }
        assertion_manager.resize_assertion_content_kbom_lru(multiply(n, $float$0_212), multiply(n, $int$30000));
        deduction_manager.resize_deduction_content_kbom_lru(multiply(n, $float$0_212), multiply(n, $int$22000));
        constant_index_manager.resize_constant_index_kbom_lru(multiply(n, $float$0_424), multiply(n, $int$1600));
        nart_index_manager.resize_nart_index_kbom_lru(multiply(n, $float$0_212), multiply(n, $int$1600));
        unrepresented_term_index_manager.resize_unrepresented_term_index_kbom_lru(multiply(n, $float$0_212), multiply(n, $int$1600));
        kb_hl_support_manager.resize_kb_hl_support_content_kbom_lru(multiply(n, $float$0_212), multiply(n, $int$1600));
        nart_hl_formula_manager.resize_nart_hl_formula_kbom_lru(multiply(n, $float$0_212), multiply(n, $int$1600));
        return NIL;
    }

    public static SubLObject enumerate_fact_sheets_for_kb_to_file(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(filename, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str50$Unable_to_open__S, filename);
            }
            final SubLObject s = stream;
            enumerate_fact_sheets_for_kb(s);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return filename;
    }

    public static SubLObject enumerate_fact_sheets_for_kb(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject path_iterator = iteration.new_filter_and_transform_iterator(forts.new_forts_iterator(), FACT_SHEET_PATH_FOR_TERM_FILTER_AND_TRANSFORM, UNPROVIDED);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject path = iteration.iteration_next(path_iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                write_string(path, stream, UNPROVIDED, UNPROVIDED);
                terpri(stream);
            }
        }
        return NIL;
    }

    public static SubLObject fact_sheet_path_for_term_filter_and_transform(final SubLObject v_term) {
        if (NIL != fact_sheets.term_ok_for_fact_sheet_p(v_term, UNPROVIDED)) {
            return values(fact_sheets.fact_sheet_file_for_fact_sheet_term(v_term), T);
        }
        return values(NIL, NIL);
    }

    public static SubLObject specify_sbhl_caching_policy_template(final SubLObject link_predicate, final SubLObject policy, final SubLObject capacity, SubLObject exempts, SubLObject prefetch) {
        if (exempts == UNPROVIDED) {
            exempts = ZERO_INTEGER;
        }
        if (prefetch == UNPROVIDED) {
            prefetch = ZERO_INTEGER;
        }
        return list(link_predicate, policy, capacity, exempts, prefetch);
    }

    public static SubLObject generate_kb_sbhl_caching_policies(final SubLObject tuning_data_file, final SubLObject policies_file, SubLObject externalizedP) {
        if (externalizedP == UNPROVIDED) {
            externalizedP = T;
        }
        final SubLObject tuning_data = cfasl_utilities.cfasl_load(tuning_data_file);
        final SubLObject policies = propose_kb_sbhl_caching_policies_from_tuning_data(tuning_data, UNPROVIDED);
        sbhl_caching_policies.save_sbhl_caching_policies(policies, policies_file, externalizedP);
        return policies_file;
    }

    public static SubLObject generate_legacy_kb_sbhl_caching_policies(final SubLObject policies_file, SubLObject externalizedP) {
        if (externalizedP == UNPROVIDED) {
            externalizedP = T;
        }
        final SubLObject policies = propose_legacy_kb_sbhl_caching_policies(UNPROVIDED);
        sbhl_caching_policies.save_sbhl_caching_policies(policies, policies_file, externalizedP);
        return policies_file;
    }

    public static SubLObject generate_completely_cached_kb_sbhl_caching_policies(final SubLObject policies_file, SubLObject externalizedP) {
        if (externalizedP == UNPROVIDED) {
            externalizedP = T;
        }
        final SubLObject policies = propose_completely_cached_kb_sbhl_caching_policies(UNPROVIDED);
        sbhl_caching_policies.save_sbhl_caching_policies(policies, policies_file, externalizedP);
        return policies_file;
    }

    public static SubLObject propose_kb_sbhl_caching_policies_from_tuning_data(final SubLObject tuning_data, SubLObject templates) {
        if (templates == UNPROVIDED) {
            templates = $generic_sbhl_caching_policy_templates$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != dictionary.dictionary_p(tuning_data) : "dictionary.dictionary_p(tuning_data) " + "CommonSymbols.NIL != dictionary.dictionary_p(tuning_data) " + tuning_data;
        final SubLObject default_template = find($DEFAULT, templates, EQL, FIRST, UNPROVIDED, UNPROVIDED);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!default_template.isCons())) {
            Errors.error($str184$The_templates_list__A_does_not_co, templates);
        }
        SubLObject policies = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tuning_data)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject link_predicate = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject ref_counts = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject policy_template = find(link_predicate, templates, EQL, FIRST, UNPROVIDED, UNPROVIDED);
            if (NIL == policy_template) {
                policy_template = default_template;
            }
            SubLObject current;
            final SubLObject datum = current = policy_template;
            SubLObject pred = NIL;
            SubLObject policy = NIL;
            SubLObject capacity = NIL;
            destructuring_bind_must_consp(current, datum, $list185);
            pred = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list185);
            policy = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list185);
            capacity = current.first();
            current = current.rest();
            final SubLObject exempt = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, datum, $list185);
            current = current.rest();
            final SubLObject prefetch = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, datum, $list185);
            current = current.rest();
            if (NIL == current) {
                final SubLObject terms = sbhl_caching_policies.recommend_sbhl_caching_preference_term_list_from_ref_counts(ref_counts, sbhl_module_vars.get_sbhl_module(link_predicate));
                final SubLObject caching_policy = sbhl_caching_policies.create_sbhl_caching_policy_from_term_recommendation_list(link_predicate, policy, capacity, terms, exempt, prefetch);
                policies = cons(caching_policy, policies);
            } else {
                cdestructuring_bind_error(datum, $list185);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return policies;
    }

    public static SubLObject propose_completely_cached_kb_sbhl_caching_policies(SubLObject link_predicates) {
        if (link_predicates == UNPROVIDED) {
            link_predicates = NIL;
        }
        return propose_all_sticky_kb_sbhl_caching_policies(link_predicates, T);
    }

    public static SubLObject propose_legacy_kb_sbhl_caching_policies(SubLObject link_predicates) {
        if (link_predicates == UNPROVIDED) {
            link_predicates = NIL;
        }
        return propose_all_sticky_kb_sbhl_caching_policies(link_predicates, NIL);
    }

    public static SubLObject get_all_sbhl_module_link_predicates() {
        SubLObject link_predicates = NIL;
        SubLObject cdolist_list_var = sbhl_module_vars.get_sbhl_modules();
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = NIL;
            SubLObject module = NIL;
            destructuring_bind_must_consp(current, datum, $list186);
            key = current.first();
            current = module = current.rest();
            link_predicates = cons(sbhl_module_vars.get_sbhl_module_link_pred(module), link_predicates);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return link_predicates;
    }

    public static SubLObject propose_all_sticky_kb_sbhl_caching_policies(SubLObject link_predicates, final SubLObject with_prefetch_p) {
        if (NIL == link_predicates) {
            link_predicates = get_all_sbhl_module_link_predicates();
        }
        final SubLObject prefetch = (NIL != with_prefetch_p) ? $ALL : NIL;
        SubLObject policies = NIL;
        SubLObject cdolist_list_var = link_predicates;
        SubLObject link_predicate = NIL;
        link_predicate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject legacy_policy = sbhl_caching_policies.create_sbhl_caching_policy_from_term_recommendation_list(link_predicate, $STICKY, $UNDEFINED, NIL, $ALL, prefetch);
            policies = cons(legacy_policy, policies);
            cdolist_list_var = cdolist_list_var.rest();
            link_predicate = cdolist_list_var.first();
        } 
        return nreverse(policies);
    }

    public static SubLObject start_recording_sbhl_cache_tuning_data() {
        sbhl_cache_tuning_data_gathering_prologue();
        sbhl_cache_tuning_experiment_prologue();
        return $RECORDING;
    }

    public static SubLObject stop_recording_sbhl_cache_tuning_data(final SubLObject data_file) {
        final SubLObject state = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        sbhl_cache_tuning_experiment_epilogue(state);
        sbhl_cache_tuning_data_gathering_generate_report(data_file, state);
        sbhl_cache_tuning_data_gathering_epilogue();
        return data_file;
    }

    public static SubLObject gather_data_for_sbhl_cache_tuning(final SubLObject filename) {
        final SubLObject state = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        SubLObject failed_contributions = NIL;
        sbhl_cache_tuning_data_gathering_prologue();
        failed_contributions = run_sbhl_cache_tuning_data_gathering(state);
        sbhl_cache_tuning_data_gathering_generate_report(filename, state);
        sbhl_cache_tuning_data_gathering_epilogue();
        return values(filename, failed_contributions);
    }

    public static SubLObject run_sbhl_cache_tuning_data_gathering(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject failed_contributions = NIL;
        if (NIL != list_utilities.sublisp_boolean($cyc_tests_to_use_for_sbhl_cache_tuning$.getDynamicValue(thread))) {
            SubLObject failures = NIL;
            final SubLObject list_var = $cyc_tests_to_use_for_sbhl_cache_tuning$.getDynamicValue(thread);
            final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($str188$Gathering_SBHL_cache_tuning_data_, thread);
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
                    SubLObject test_name = NIL;
                    test_name = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        SubLObject msg = NIL;
                        try {
                            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                            final SubLObject _prev_bind_0_$18 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                try {
                                    sbhl_cache_tuning_experiment_prologue();
                                    cyc_testing_utilities.run_cyc_test_int(test_name, $SILENT, NIL, NIL, $STANDARD, StreamsLow.$null_output$.getDynamicValue(thread), cyc_testing.$run_tiny_kb_tests_in_full_kbP$.getDynamicValue(thread));
                                    sbhl_cache_tuning_experiment_epilogue(state);
                                } catch (final Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                Errors.$error_handler$.rebind(_prev_bind_0_$18, thread);
                            }
                        } catch (final Throwable ccatch_env_var) {
                            msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                        } finally {
                            thread.throwStack.pop();
                        }
                        if (msg.isString()) {
                            failures = cons(cons(test_name, msg), failures);
                        }
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        test_name = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
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
            if (NIL != list_utilities.sublisp_boolean(failures)) {
                failed_contributions = putf(failed_contributions, $CYC_TESTS, failures);
            }
        }
        if (NIL != list_utilities.sublisp_boolean($kb_queries_to_use_for_sbhl_cache_tuning$.getDynamicValue(thread))) {
            SubLObject failures = NIL;
            final SubLObject list_var = $kb_queries_to_use_for_sbhl_cache_tuning$.getDynamicValue(thread);
            final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($str191$Gathering_SBHL_cache_tuning_data_, thread);
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
                    SubLObject kbq = NIL;
                    kbq = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        failures = cons(cons(kbq, $str192$KBQ_Support_currently_not_impleme), failures);
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        kbq = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
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
            if (NIL != list_utilities.sublisp_boolean(failures)) {
                failed_contributions = putf(failed_contributions, $KB_QUERIES, failures);
            }
        }
        if (NIL != list_utilities.sublisp_boolean($run_cyclops_for_sbhl_cache_tuningP$.getDynamicValue(thread))) {
            SubLObject failures = NIL;
            final SubLObject _prev_bind_9 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_10 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_11 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_12 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_13 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_14 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_15 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_16 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($str194$Gathering_SBHL_cache_tuning_data_, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(ONE_INTEGER, thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject counter;
                    SubLObject msg2;
                    SubLObject _prev_bind_0_$21;
                    for (counter = NIL, counter = ZERO_INTEGER; counter.numL($progress_total$.getDynamicValue(thread)); counter = add(counter, ONE_INTEGER)) {
                        msg2 = NIL;
                        try {
                            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                            _prev_bind_0_$21 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                try {
                                    sbhl_cache_tuning_experiment_prologue();
                                    system_benchmarks.benchmark_cyclops_compensating_for_paging(ZERO_INTEGER, ONE_INTEGER, SIX_INTEGER, StreamsLow.$null_output$.getDynamicValue(thread));
                                    sbhl_cache_tuning_experiment_epilogue(state);
                                } catch (final Throwable catch_var2) {
                                    Errors.handleThrowable(catch_var2, NIL);
                                }
                            } finally {
                                Errors.$error_handler$.rebind(_prev_bind_0_$21, thread);
                            }
                        } catch (final Throwable ccatch_env_var2) {
                            msg2 = Errors.handleThrowable(ccatch_env_var2, $catch_error_message_target$.getGlobalValue());
                        } finally {
                            thread.throwStack.pop();
                        }
                        if (msg2.isString()) {
                            failures = cons(cons($CYCLOPS, msg2), failures);
                        }
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    }
                } finally {
                    final SubLObject _prev_bind_0_$22 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values3 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values3);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_16, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_15, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_14, thread);
                $last_percent_progress_index$.rebind(_prev_bind_13, thread);
                $progress_sofar$.rebind(_prev_bind_12, thread);
                $progress_total$.rebind(_prev_bind_11, thread);
                $progress_start_time$.rebind(_prev_bind_10, thread);
                $progress_note$.rebind(_prev_bind_9, thread);
            }
            if (NIL != list_utilities.sublisp_boolean(failures)) {
                failed_contributions = putf(failed_contributions, $CYCLOPS, failures);
            }
        }
        return failed_contributions;
    }

    public static SubLObject sbhl_cache_tuning_data_gathering_prologue() {
        return sbhl_caching_policies.setup_sbhl_graphs_for_sbhl_cache_tuning_data_gathering();
    }

    public static SubLObject sbhl_cache_tuning_experiment_prologue() {
        return sbhl_caching_policies.setup_sbhl_graphs_for_sbhl_cache_tuning_experiment();
    }

    public static SubLObject sbhl_cache_tuning_experiment_epilogue(final SubLObject state) {
        return sbhl_caching_policies.tear_down_sbhl_graphs_for_sbhl_cache_tuning_experiment(state);
    }

    public static SubLObject sbhl_cache_tuning_data_gathering_generate_report(final SubLObject filename, final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_binary(filename, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str50$Unable_to_open__S, filename);
            }
            final SubLObject s = stream;
            sbhl_caching_policies.contribute_sbhl_graphs_data_for_sbhl_cache_tuning_experiment(s, state);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return filename;
    }

    public static SubLObject sbhl_cache_tuning_data_gathering_epilogue() {
        return sbhl_caching_policies.tear_down_sbhl_graphs_for_sbhl_cache_tuning_data_gathering();
    }

    public static SubLObject compile_kb_snapshot_statistics(SubLObject directory) {
        if (directory == UNPROVIDED) {
            directory = misc_utilities.generic_caches_directory();
        }
        final SubLObject result_map = gather_kb_snapshot_statistics(directory, UNPROVIDED);
        SubLObject statistics = NIL;
        SubLObject cdolist_list_var = dumper.get_kb_units_file_vector_categories();
        SubLObject category = NIL;
        category = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject result = map_utilities.map_get(result_map, category, UNPROVIDED);
            final SubLObject edits = map_utilities.map_get(result, $REVERSAL, ZERO_INTEGER);
            final SubLObject deletes = map_utilities.map_get(result, $TOMBSTONE, ZERO_INTEGER);
            final SubLObject entries = map_utilities.map_get(result, $INDEX_ENTRIES, ZERO_INTEGER);
            final SubLObject data_bytes = map_utilities.map_get(result, $DATA_BYTES, ZERO_INTEGER);
            statistics = cons(list(new SubLObject[]{ $$$category, category, $$$numOfEdits, edits, $$$numOfDeletes, deletes, $$$numOfEntries, entries, $$$numOfBytes, data_bytes, $$$fragBytes, MINUS_ONE_INTEGER }), statistics);
            cdolist_list_var = cdolist_list_var.rest();
            category = cdolist_list_var.first();
        } 
        return reverse(statistics);
    }

    public static SubLObject gather_kb_snapshot_statistics(final SubLObject directory, SubLObject result_map) {
        if (result_map == UNPROVIDED) {
            result_map = NIL;
        }
        if (NIL == result_map) {
            result_map = dictionary.new_dictionary(EQUAL, UNPROVIDED);
        }
        SubLObject cdolist_list_var = dumper.get_kb_units_file_vector_categories();
        SubLObject fvector_label = NIL;
        fvector_label = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            map_utilities.map_put(result_map, fvector_label, $IN_PROGRESS);
            cdolist_list_var = cdolist_list_var.rest();
            fvector_label = cdolist_list_var.first();
        } 
        cdolist_list_var = dumper.get_kb_units_file_vector_descriptions();
        SubLObject fvector_detail = NIL;
        fvector_detail = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject current;
            final SubLObject datum = current = fvector_detail;
            SubLObject allow_other_keys_p = NIL;
            SubLObject rest = current;
            SubLObject bad = NIL;
            SubLObject current_$23 = NIL;
            while (NIL != rest) {
                destructuring_bind_must_consp(rest, datum, $list209);
                current_$23 = rest.first();
                rest = rest.rest();
                destructuring_bind_must_consp(rest, datum, $list209);
                if (NIL == member(current_$23, $list210, UNPROVIDED, UNPROVIDED)) {
                    bad = T;
                }
                if (current_$23 == $ALLOW_OTHER_KEYS) {
                    allow_other_keys_p = rest.first();
                }
                rest = rest.rest();
            } 
            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                cdestructuring_bind_error(datum, $list209);
            }
            final SubLObject data_file_tail = property_list_member($DATA_FILE, current);
            final SubLObject data_file = (NIL != data_file_tail) ? cadr(data_file_tail) : NIL;
            final SubLObject index_file_tail = property_list_member($INDEX_FILE, current);
            final SubLObject index_file = (NIL != index_file_tail) ? cadr(index_file_tail) : NIL;
            final SubLObject type_tail = property_list_member($TYPE, current);
            final SubLObject type = (NIL != type_tail) ? cadr(type_tail) : NIL;
            final SubLObject complex_data_file_tail = property_list_member($COMPLEX_DATA_FILE, current);
            final SubLObject complex_data_file = (NIL != complex_data_file_tail) ? cadr(complex_data_file_tail) : NIL;
            final SubLObject complex_index_file_tail = property_list_member($COMPLEX_INDEX_FILE, current);
            final SubLObject complex_index_file = (NIL != complex_index_file_tail) ? cadr(complex_index_file_tail) : NIL;
            final SubLObject pcase_var = type;
            if (pcase_var.eql($KNOWLEDGE)) {
                gather_one_kb_snapshot_statistic(result_map, data_file, index_file, directory);
            } else
                if (pcase_var.eql($INDEXING)) {
                    gather_one_kb_snapshot_statistic(result_map, data_file, index_file, directory);
                    gather_one_kb_snapshot_statistic(result_map, complex_data_file, complex_index_file, directory);
                } else {
                    Errors.error($str219$Unsupported_file_vector_type__A__, type);
                }

            cdolist_list_var = cdolist_list_var.rest();
            fvector_detail = cdolist_list_var.first();
        } 
        return result_map;
    }

    public static SubLObject gather_one_kb_snapshot_statistic(final SubLObject result_map, final SubLObject data_file, final SubLObject index_file, final SubLObject directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject data_file_path = dumper.kb_dump_file(data_file, directory, UNPROVIDED);
        final SubLObject index_file_path = dumper.kb_dump_file(index_file, directory, UNPROVIDED);
        SubLObject error_msg = NIL;
        SubLObject stats = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    stats = file_vector.gather_file_vector_statistics_for_filenames(data_file_path, index_file_path);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (error_msg.isString()) {
            map_utilities.map_put(result_map, data_file, error_msg);
        } else {
            map_utilities.map_put(result_map, data_file, stats);
        }
        return result_map;
    }

    public static SubLObject track_kb_snapshot_statistics(final SubLObject directory, SubLObject pollsecs) {
        if (pollsecs == UNPROVIDED) {
            pollsecs = TEN_INTEGER;
        }
        final SubLObject categories = dumper.get_kb_units_file_vector_categories();
        final SubLObject result_map = dictionary_utilities.new_synchronized_dictionary(EQUAL, length(categories));
        SubLObject doneP = NIL;
        subl_promotions.make_process_with_args($str221$GATHER_KB_SNAPSHOT_STATISTICS, GATHER_KB_SNAPSHOT_STATISTICS, list(directory, result_map));
        while (NIL == doneP) {
            format(T, $str222$__Check_at__A_______, numeric_date_utilities.timestring(UNPROVIDED));
            doneP = T;
            SubLObject cdolist_list_var = dumper.get_kb_units_file_vector_categories();
            SubLObject category = NIL;
            category = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject result = map_utilities.map_get(result_map, category, $IN_PROGRESS);
                if ($IN_PROGRESS == result) {
                    format(T, $str223$_A_____in_progress__, category);
                    doneP = NIL;
                } else
                    if (result.isString()) {
                        format(T, $str224$_A_____errored___A___, category, result);
                    } else
                        if (NIL != map_utilities.map_p(result)) {
                            format(T, $str225$_A___A_edits___A_deletes___A_entr, new SubLObject[]{ category, map_utilities.map_get(result, $REVERSAL, ZERO_INTEGER), map_utilities.map_get(result, $TOMBSTONE, ZERO_INTEGER), map_utilities.map_get(result, $INDEX_ENTRIES, ZERO_INTEGER), map_utilities.map_get(result, $DATA_BYTES, ZERO_INTEGER) });
                        } else {
                            Errors.error($str226$Unknown_category__A_____dont_know, category);
                        }


                cdolist_list_var = cdolist_list_var.rest();
                category = cdolist_list_var.first();
            } 
            if (NIL == doneP) {
                force_output(T);
                sleep(pollsecs);
            }
        } 
        return result_map;
    }

    public static SubLObject get_kb_mini_dump_timestamp() {
        return get_universal_time();
    }

    public static SubLObject prepare_kb_mini_dump() {
        operation_communication.set_receive_state($$$no);
        SubLObject cdolist_list_var = tcp_server_utilities.all_tcp_servers();
        SubLObject tcp_server = NIL;
        tcp_server = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject type = tcp_server_utilities.tcp_server_type(tcp_server);
            if ($CYC_API != type) {
                tcp_server_utilities.disable_tcp_server(type);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tcp_server = cdolist_list_var.first();
        } 
        while (NIL != agenda.agenda_busyP()) {
            sleep(ONE_INTEGER);
        } 
        return $SUCCESS;
    }

    public static SubLObject perform_kb_mini_dump(final SubLObject units_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject curr_kb = kb_loaded();
        SubLObject msg = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    set_kb_loaded(subtract(curr_kb, ONE_INTEGER));
                    dumper.dump_kb(units_path);
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
        if (msg.isString()) {
            Errors.warn($str231$Error_while_performing_mini_dump_, msg);
            set_kb_loaded(curr_kb);
            return values($ERROR, msg);
        }
        mark_kb_mini_dump_as_successful(units_path);
        return operation_communication.halt_cyc_image(UNPROVIDED);
    }

    public static SubLObject launch_asynchronous_kb_mini_dump(final SubLObject units_path) {
        return subl_promotions.make_process_with_args($$$Mini_KB_Dumper, PERFORM_KB_MINI_DUMP, list(units_path));
    }

    public static SubLObject mark_kb_mini_dump_as_successful(final SubLObject units_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dump_finished_file = cconcatenate(units_path, $str235$mini_dump_finished_text);
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(dump_finished_file, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str50$Unable_to_open__S, dump_finished_file);
            }
            final SubLObject s = stream;
            write_string(numeric_date_utilities.timestring(UNPROVIDED), s, UNPROVIDED, UNPROVIDED);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return units_path;
    }

    public static SubLObject build_process_worker_count() {
        return $build_process_worker_count$.getGlobalValue();
    }

    public static SubLObject set_build_process_worker_count(final SubLObject workers) {
        SubLSystemTrampolineFile.enforceType(workers, NON_NEGATIVE_INTEGER_P);
        final SubLObject old = $build_process_worker_count$.getGlobalValue();
        $build_process_worker_count$.setGlobalValue(workers);
        return old;
    }

    public static SubLObject build_process_parallelism_permittedP() {
        return numGE(build_process_worker_count(), TWO_INTEGER);
    }

    public static SubLObject with_allowed_obfuscation_namespace_support(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list241, append(body, NIL));
    }

    public static SubLObject with_allowed_obfuscation_namespace(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list243);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject namespace = NIL;
        destructuring_bind_must_consp(current, datum, $list243);
        namespace = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($allowed_obfuscation_name_spaces$, listS(CONS, namespace, $list246))), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list243);
        return NIL;
    }

    public static SubLObject allowed_obfuscation_namespace_constantP(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject namespace = constants_high.constant_namespace(constant);
        return makeBoolean((NIL != Strings.stringE($$$cyc, namespace, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != subl_promotions.memberP(namespace, $allowed_obfuscation_name_spaces$.getDynamicValue(thread), EQUAL, UNPROVIDED)));
    }

    public static SubLObject un_obfuscatable_constantP(final SubLObject constant) {
        return makeBoolean((NIL != constant_completion.constant_mentioned_in_codeP(constant)) || (NIL == allowed_obfuscation_namespace_constantP(constant)));
    }

    public static SubLObject with_constant_obfuscation(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list251);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject function = NIL;
        destructuring_bind_must_consp(current, datum, $list251);
        function = current.first();
        current = current.rest();
        final SubLObject state = (current.isCons()) ? current.first() : $UNPROVIDED;
        destructuring_bind_must_listp(current, datum, $list251);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject state_val = $sym253$STATE_VAL;
            return list(CLET, list(list(state_val, state)), list(CLET, list(list($constant_obfuscation_name_generator_state$, list(CONS, function, state_val))), listS(WITH_CONSTANT_NAME_OBFUSCATION, $list256, append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list251);
        return NIL;
    }

    public static SubLObject obfuscate_constant_name_via_generator_fn(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = $constant_obfuscation_name_generator_state$.getDynamicValue(thread);
        SubLObject generator = NIL;
        SubLObject state = NIL;
        destructuring_bind_must_consp(current, datum, $list258);
        generator = current.first();
        current = state = current.rest();
        return obfuscate_constant_name_via_generator_function(constant, generator, state);
    }

    public static SubLObject obfuscate_constant_name_via_generator_function(final SubLObject constant, final SubLObject generator, final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject map = $constant_obfuscation_cache$.getDynamicValue(thread);
        SubLObject obfuscated_name = (NIL != map_utilities.map_p(map)) ? map_utilities.map_get(map, constant, $NOT_FOUND) : NIL;
        if (!obfuscated_name.isString()) {
            if (NIL != un_obfuscatable_constantP(constant)) {
                obfuscated_name = constants_high.constant_name(constant);
            } else {
                obfuscated_name = ($UNPROVIDED == state) ? funcall(generator, constant) : funcall(generator, constant, state);
                for (SubLObject counter = ZERO_INTEGER, original_guess = obfuscated_name; NIL != constant_p(constants_high.find_constant(obfuscated_name)); obfuscated_name = cconcatenate(format_nil.format_nil_a_no_copy(original_guess), new SubLObject[]{ $str260$_, format_nil.format_nil_d_no_copy(counter) })) {
                    counter = add(counter, ONE_INTEGER);
                }
                if (NIL != map_utilities.map_p(map)) {
                    map_utilities.map_put(map, constant, obfuscated_name);
                }
            }
        }
        return obfuscated_name;
    }

    public static SubLObject new_constant_obfuscation_cache() {
        return make_hash_table(constant_count(), hash_table_utilities.to_hash_test(KBEQ), UNPROVIDED);
    }

    public static SubLObject with_cached_constant_obfuscation(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list251);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject function = NIL;
        destructuring_bind_must_consp(current, datum, $list251);
        function = current.first();
        current = current.rest();
        final SubLObject state = (current.isCons()) ? current.first() : $UNPROVIDED;
        destructuring_bind_must_listp(current, datum, $list251);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(CLET, $list264, listS(WITH_CONSTANT_OBFUSCATION, list(function, state), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list251);
        return NIL;
    }

    public static SubLObject make_obfuscation_gensym_state(SubLObject upcase_prefix, SubLObject downcase_prefix) {
        if (upcase_prefix == UNPROVIDED) {
            upcase_prefix = $$$C;
        }
        if (downcase_prefix == UNPROVIDED) {
            downcase_prefix = NIL;
        }
        if (!downcase_prefix.isString()) {
            downcase_prefix = Strings.string_downcase(upcase_prefix, UNPROVIDED, UNPROVIDED);
        }
        return list($ISG, integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), $UPCASE, upcase_prefix, $DOWNCASE, downcase_prefix);
    }

    public static SubLObject obfuscate_constant_name_gensym(final SubLObject constant, final SubLObject state) {
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = state;
        SubLObject bad = NIL;
        SubLObject current_$24 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, state, $list271);
            current_$24 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, state, $list271);
            if (NIL == member(current_$24, $list272, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$24 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(state, $list271);
        }
        final SubLObject isg_tail = property_list_member($ISG, state);
        final SubLObject isg = (NIL != isg_tail) ? cadr(isg_tail) : NIL;
        final SubLObject upcase_tail = property_list_member($UPCASE, state);
        final SubLObject upcase = (NIL != upcase_tail) ? cadr(upcase_tail) : NIL;
        final SubLObject downcase_tail = property_list_member($DOWNCASE, state);
        final SubLObject downcase = (NIL != downcase_tail) ? cadr(downcase_tail) : NIL;
        final SubLObject prefix = (NIL != upper_case_p(Strings.sublisp_char(constants_high.constant_name(constant), ZERO_INTEGER))) ? upcase : downcase;
        final SubLObject id = integer_sequence_generator.integer_sequence_generator_next(isg);
        return cconcatenate(format_nil.format_nil_a_no_copy(prefix), new SubLObject[]{ $str260$_, format_nil.format_nil_d_no_copy(id) });
    }

    public static SubLObject obfuscate_and_dump_essential_kb(final SubLObject dump_dir, final SubLObject assertion_fn, final SubLObject nart_fn, final SubLObject constant_fn, SubLObject constant_state) {
        if (constant_state == UNPROVIDED) {
            constant_state = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLSystemTrampolineFile.enforceType(dump_dir, DIRECTORY_P);
        SubLObject changedP = NIL;
        try {
            thread.resetMultipleValues();
            final SubLObject assertion_targets = determine_obfuscation_candidates(UNPROVIDED);
            final SubLObject nart_targets = thread.secondMultipleValue();
            thread.resetMultipleValues();
            try {
                apply_assertion_obfuscations(determine_assertion_obfuscations(assertion_targets, assertion_fn, UNPROVIDED), $$$Obfuscating_strings_in_Assertions);
                apply_assertion_obfuscations(determine_nart_obfuscations(nart_targets, nart_fn, UNPROVIDED), $$$Obfuscating_strings_in_NARTs);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    changedP = T;
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
            final SubLObject _prev_bind_2 = $constant_obfuscation_cache$.currentBinding(thread);
            try {
                $constant_obfuscation_cache$.bind(new_constant_obfuscation_cache(), thread);
                final SubLObject state_val = constant_state;
                final SubLObject _prev_bind_0_$25 = $constant_obfuscation_name_generator_state$.currentBinding(thread);
                final SubLObject _prev_bind_3 = constants_high.$constant_name_obfuscation_fn$.currentBinding(thread);
                try {
                    $constant_obfuscation_name_generator_state$.bind(cons(constant_fn, state_val), thread);
                    constants_high.$constant_name_obfuscation_fn$.bind(OBFUSCATE_CONSTANT_NAME_VIA_GENERATOR_FN, thread);
                    dumper.dump_non_computable_kb(dump_dir);
                } finally {
                    constants_high.$constant_name_obfuscation_fn$.rebind(_prev_bind_3, thread);
                    $constant_obfuscation_name_generator_state$.rebind(_prev_bind_0_$25, thread);
                }
            } finally {
                $constant_obfuscation_cache$.rebind(_prev_bind_2, thread);
            }
        } finally {
            final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                if (NIL != changedP) {
                    final SubLObject str = $str276$KB_has_been_obfuscated__rendering;
                    final SubLObject _prev_bind_0_$26 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = $progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = $is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = $silent_progressP$.currentBinding(thread);
                    try {
                        $progress_start_time$.bind(get_universal_time(), thread);
                        $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                        $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        $progress_notification_count$.bind(ZERO_INTEGER, thread);
                        $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                        $progress_count$.bind(ZERO_INTEGER, thread);
                        $is_noting_progressP$.bind(T, thread);
                        $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                        noting_progress_preamble(str);
                        operation_communication.halt_cyc_image(UNPROVIDED);
                        noting_progress_postamble();
                    } finally {
                        $silent_progressP$.rebind(_prev_bind_11, thread);
                        $is_noting_progressP$.rebind(_prev_bind_10, thread);
                        $progress_count$.rebind(_prev_bind_9, thread);
                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_8, thread);
                        $progress_notification_count$.rebind(_prev_bind_7, thread);
                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_6, thread);
                        $progress_last_pacification_time$.rebind(_prev_bind_5, thread);
                        $progress_start_time$.rebind(_prev_bind_0_$26, thread);
                    }
                }
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        return dump_dir;
    }

    public static SubLObject determine_obfuscation_candidates(SubLObject message) {
        if (message == UNPROVIDED) {
            message = $$$Identifying_needed_KB_changes;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject assertion_edits = make_hash_table(unrepresented_terms.kb_unrepresented_term_count(), EQUAL, UNPROVIDED);
        final SubLObject nart_edits = make_hash_table(unrepresented_terms.kb_unrepresented_term_count(), EQUAL, UNPROVIDED);
        if (NIL != unrepresented_terms.use_unrepresented_term_fhtP()) {
            SubLObject msg = cconcatenate(message, $str279$____Old_Space);
            SubLObject release = NIL;
            try {
                release = seize_lock(unrepresented_terms.$unrepresented_term_fht_lock$.getGlobalValue());
                final SubLObject table_var = unrepresented_terms.get_unrepresented_term_fht();
                $progress_note$.setDynamicValue(msg, thread);
                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                $progress_total$.setDynamicValue(file_hash_table.file_hash_table_count(table_var), thread);
                $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
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
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        SubLObject continuation = NIL;
                        SubLObject next;
                        for (SubLObject completeP = NIL; NIL == completeP; completeP = sublisp_null(next)) {
                            thread.resetMultipleValues();
                            final SubLObject the_key = file_hash_table.get_file_hash_table_any(table_var, continuation, NIL);
                            final SubLObject the_value = thread.secondMultipleValue();
                            next = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != next) {
                                final SubLObject key = the_key;
                                final SubLObject unrep_term = the_value;
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                if ((NIL == unrepresented_terms.deleted_unrepresented_term_itemP(key)) && (NIL != unrepresented_terms.fht_suid_item_p(key))) {
                                    final SubLObject suid = unrepresented_terms.get_fht_suid_item_suid(key);
                                    if (unrep_term.isString()) {
                                        final SubLObject leaves = index_leaves(unrepresented_term_index_manager.lookup_unrepresented_term_index(suid));
                                        thread.resetMultipleValues();
                                        final SubLObject assertions = list_utilities.npartition_list(leaves, $sym280$NOT_TERM_OF_UNIT_ASSERTION_);
                                        final SubLObject tous = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL != assertions) {
                                            map_utilities.map_put(assertion_edits, unrep_term, assertions);
                                        }
                                        if (NIL != tous) {
                                            map_utilities.map_put(nart_edits, unrep_term, tous);
                                        }
                                    }
                                }
                            }
                            continuation = next;
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$27 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                }
            } finally {
                if (NIL != release) {
                    release_lock(unrepresented_terms.$unrepresented_term_fht_lock$.getGlobalValue());
                }
            }
            msg = cconcatenate(message, $str281$____New_Space);
            if (NIL != unrepresented_terms.use_unrepresented_term_fhtP()) {
                final SubLObject list_var = unrepresented_terms.get_unrepresented_term_new_space_ascending_suid_keys();
                final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $progress_note$.bind(NIL != msg ? msg : $$$cdolist, thread);
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
                        SubLObject suid_item = NIL;
                        suid_item = csome_list_var.first();
                        while (NIL != csome_list_var) {
                            final SubLObject suid2 = unrepresented_terms.get_fht_suid_item_suid(suid_item);
                            final SubLObject unrep_term2 = unrepresented_terms.find_unrepresented_term_by_suid(suid2);
                            if (unrep_term2.isString()) {
                                final SubLObject leaves = index_leaves(unrepresented_term_index_manager.lookup_unrepresented_term_index(suid2));
                                thread.resetMultipleValues();
                                final SubLObject assertions = list_utilities.npartition_list(leaves, $sym280$NOT_TERM_OF_UNIT_ASSERTION_);
                                final SubLObject tous = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != assertions) {
                                    map_utilities.map_put(assertion_edits, unrep_term2, assertions);
                                }
                                if (NIL != tous) {
                                    map_utilities.map_put(nart_edits, unrep_term2, tous);
                                }
                            }
                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            suid_item = csome_list_var.first();
                        } 
                    } finally {
                        final SubLObject _prev_bind_0_$28 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
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
            } else {
                final SubLObject table_var = unrepresented_terms.do_unrepresented_terms_table();
                final SubLObject first_id_var = unrepresented_terms.new_unrepresented_term_id_threshold();
                final SubLObject total = subtract(id_index_next_id(table_var), first_id_var);
                SubLObject sofar = ZERO_INTEGER;
                final SubLObject _prev_bind_9 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_10 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_11 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_12 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble(msg);
                        SubLObject unrep_term;
                        SubLObject suid;
                        SubLObject leaves;
                        SubLObject assertions;
                        SubLObject tous;
                        SubLObject end_var;
                        SubLObject end;
                        SubLObject id;
                        for (end = end_var = id_index_next_id(table_var), id = NIL, id = first_id_var; !id.numGE(end_var); id = number_utilities.f_1X(id)) {
                            unrep_term = id_index_lookup(table_var, id, UNPROVIDED);
                            if (NIL != unrep_term) {
                                note_percent_progress(sofar, total);
                                sofar = add(sofar, ONE_INTEGER);
                                suid = unrepresented_terms.unrepresented_term_suid(unrep_term);
                                if (unrep_term.isString()) {
                                    leaves = index_leaves(unrepresented_term_index_manager.lookup_unrepresented_term_index(suid));
                                    thread.resetMultipleValues();
                                    assertions = list_utilities.npartition_list(leaves, $sym280$NOT_TERM_OF_UNIT_ASSERTION_);
                                    tous = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != assertions) {
                                        map_utilities.map_put(assertion_edits, unrep_term, assertions);
                                    }
                                    if (NIL != tous) {
                                        map_utilities.map_put(nart_edits, unrep_term, tous);
                                    }
                                }
                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$29 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values3 = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values3);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$29, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_12, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_11, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_10, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_9, thread);
                }
            }
        } else {
            final SubLObject idx = unrepresented_terms.do_unrepresented_terms_table();
            final SubLObject mess = message;
            final SubLObject total2 = id_index_count(idx);
            SubLObject sofar2 = ZERO_INTEGER;
            assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
            final SubLObject _prev_bind_13 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_14 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_15 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_16 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(mess);
                    final SubLObject idx_$30 = idx;
                    if (NIL == id_index_objects_empty_p(idx_$30, $SKIP)) {
                        final SubLObject idx_$31 = idx_$30;
                        if (NIL == id_index_dense_objects_empty_p(idx_$31, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$31);
                            final SubLObject backwardP_var = NIL;
                            SubLObject suid;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject unrep_term3;
                            SubLObject leaves2;
                            SubLObject assertions2;
                            SubLObject tous2;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                suid = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                unrep_term3 = aref(vector_var, suid);
                                if ((NIL == id_index_tombstone_p(unrep_term3)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(unrep_term3)) {
                                        unrep_term3 = $SKIP;
                                    }
                                    if (unrep_term3.isString()) {
                                        leaves2 = index_leaves(unrepresented_term_index_manager.lookup_unrepresented_term_index(suid));
                                        thread.resetMultipleValues();
                                        assertions2 = list_utilities.npartition_list(leaves2, $sym280$NOT_TERM_OF_UNIT_ASSERTION_);
                                        tous2 = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL != assertions2) {
                                            map_utilities.map_put(assertion_edits, unrep_term3, assertions2);
                                        }
                                        if (NIL != tous2) {
                                            map_utilities.map_put(nart_edits, unrep_term3, tous2);
                                        }
                                    }
                                    sofar2 = add(sofar2, ONE_INTEGER);
                                    note_percent_progress(sofar2, total2);
                                }
                            }
                        }
                        final SubLObject idx_$32 = idx_$30;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$32)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$32);
                            SubLObject suid3 = id_index_sparse_id_threshold(idx_$32);
                            final SubLObject end_id = id_index_next_id(idx_$32);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (suid3.numL(end_id)) {
                                final SubLObject unrep_term2 = gethash_without_values(suid3, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(unrep_term2))) {
                                    if (unrep_term2.isString()) {
                                        final SubLObject leaves = index_leaves(unrepresented_term_index_manager.lookup_unrepresented_term_index(suid3));
                                        thread.resetMultipleValues();
                                        final SubLObject assertions = list_utilities.npartition_list(leaves, $sym280$NOT_TERM_OF_UNIT_ASSERTION_);
                                        final SubLObject tous = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL != assertions) {
                                            map_utilities.map_put(assertion_edits, unrep_term2, assertions);
                                        }
                                        if (NIL != tous) {
                                            map_utilities.map_put(nart_edits, unrep_term2, tous);
                                        }
                                    }
                                    sofar2 = add(sofar2, ONE_INTEGER);
                                    note_percent_progress(sofar2, total2);
                                }
                                suid3 = add(suid3, ONE_INTEGER);
                            } 
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$30 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values4 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values4);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_16, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_15, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_14, thread);
                $last_percent_progress_index$.rebind(_prev_bind_13, thread);
            }
        }
        return values(assertion_edits, nart_edits);
    }

    public static SubLObject not_term_of_unit_assertionP(final SubLObject as) {
        return makeBoolean(NIL == function_terms.tou_assertionP(as));
    }

    public static SubLObject determine_assertion_obfuscations(final SubLObject assertion_edits, final SubLObject obfuscator_fn, SubLObject message) {
        if (message == UNPROVIDED) {
            message = $$$Identifying_assertion_changes;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject edits = make_hash_table(map_utilities.map_size(assertion_edits), UNPROVIDED, UNPROVIDED);
        final SubLObject mess = message;
        SubLObject sofar = ZERO_INTEGER;
        final SubLObject total = map_utilities.map_size(assertion_edits);
        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
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
                noting_percent_progress_preamble(mess);
                final SubLObject iterator = map_utilities.new_map_iterator(assertion_edits);
                SubLObject valid;
                for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                    thread.resetMultipleValues();
                    final SubLObject var = iteration.iteration_next(iterator);
                    valid = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != valid) {
                        SubLObject current;
                        final SubLObject datum = current = var;
                        SubLObject unrep_term = NIL;
                        SubLObject assertions = NIL;
                        destructuring_bind_must_consp(current, datum, $list285);
                        unrep_term = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list285);
                        assertions = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            note_percent_progress(sofar, total);
                            sofar = add(sofar, ONE_INTEGER);
                            SubLObject cdolist_list_var;
                            final SubLObject classified_assertion_sets = cdolist_list_var = funcall(obfuscator_fn, unrep_term, assertions);
                            SubLObject classified_assertion_set = NIL;
                            classified_assertion_set = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                SubLObject current_$35;
                                final SubLObject datum_$34 = current_$35 = classified_assertion_set;
                                SubLObject new_string = NIL;
                                destructuring_bind_must_consp(current_$35, datum_$34, $list286);
                                new_string = current_$35.first();
                                current_$35 = current_$35.rest();
                                SubLObject cdolist_list_var_$36;
                                final SubLObject target_assertions = cdolist_list_var_$36 = current_$35;
                                SubLObject target_assertion = NIL;
                                target_assertion = cdolist_list_var_$36.first();
                                while (NIL != cdolist_list_var_$36) {
                                    map_utilities.map_push(edits, target_assertion, cons(unrep_term, new_string));
                                    cdolist_list_var_$36 = cdolist_list_var_$36.rest();
                                    target_assertion = cdolist_list_var_$36.first();
                                } 
                                cdolist_list_var = cdolist_list_var.rest();
                                classified_assertion_set = cdolist_list_var.first();
                            } 
                        } else {
                            cdestructuring_bind_error(datum, $list285);
                        }
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$37 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return edits;
    }

    public static SubLObject determine_nart_obfuscations(final SubLObject nart_edits, final SubLObject obfuscator_fn, SubLObject message) {
        if (message == UNPROVIDED) {
            message = $$$Identifying_NART_changes;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject edits = make_hash_table(map_utilities.map_size(nart_edits), UNPROVIDED, UNPROVIDED);
        final SubLObject naut_to_tou = dictionary.new_dictionary(EQUAL, UNPROVIDED);
        final SubLObject mess = message;
        SubLObject sofar = ZERO_INTEGER;
        final SubLObject total = map_utilities.map_size(nart_edits);
        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
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
                noting_percent_progress_preamble(mess);
                final SubLObject iterator = map_utilities.new_map_iterator(nart_edits);
                SubLObject valid;
                for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                    thread.resetMultipleValues();
                    final SubLObject var = iteration.iteration_next(iterator);
                    valid = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != valid) {
                        SubLObject current;
                        final SubLObject datum = current = var;
                        SubLObject unrep_term = NIL;
                        SubLObject assertions = NIL;
                        destructuring_bind_must_consp(current, datum, $list285);
                        unrep_term = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list285);
                        assertions = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            note_percent_progress(sofar, total);
                            sofar = add(sofar, ONE_INTEGER);
                            map_utilities.map_remove_all(naut_to_tou);
                            SubLObject assertion_nauts = NIL;
                            SubLObject cdolist_list_var = assertions;
                            SubLObject tou = NIL;
                            tou = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                final SubLObject naut = assertions_high.gaf_arg2(tou);
                                map_utilities.map_put(naut_to_tou, naut, tou);
                                assertion_nauts = cons(naut, assertion_nauts);
                                cdolist_list_var = cdolist_list_var.rest();
                                tou = cdolist_list_var.first();
                            } 
                            SubLObject cdolist_list_var2;
                            final SubLObject classified_naut_sets = cdolist_list_var2 = funcall(obfuscator_fn, unrep_term, assertion_nauts);
                            SubLObject classified_naut_set = NIL;
                            classified_naut_set = cdolist_list_var2.first();
                            while (NIL != cdolist_list_var2) {
                                SubLObject current_$39;
                                final SubLObject datum_$38 = current_$39 = classified_naut_set;
                                SubLObject new_string = NIL;
                                destructuring_bind_must_consp(current_$39, datum_$38, $list289);
                                new_string = current_$39.first();
                                current_$39 = current_$39.rest();
                                SubLObject cdolist_list_var_$40;
                                final SubLObject target_nauts = cdolist_list_var_$40 = current_$39;
                                SubLObject target_naut = NIL;
                                target_naut = cdolist_list_var_$40.first();
                                while (NIL != cdolist_list_var_$40) {
                                    final SubLObject target_assertion = map_utilities.map_get(naut_to_tou, target_naut, UNPROVIDED);
                                    map_utilities.map_push(edits, target_assertion, cons(unrep_term, new_string));
                                    cdolist_list_var_$40 = cdolist_list_var_$40.rest();
                                    target_naut = cdolist_list_var_$40.first();
                                } 
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                classified_naut_set = cdolist_list_var2.first();
                            } 
                        } else {
                            cdestructuring_bind_error(datum, $list285);
                        }
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$41 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$41, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return edits;
    }

    public static SubLObject apply_assertion_obfuscations(final SubLObject edits_spec, SubLObject message) {
        if (message == UNPROVIDED) {
            message = $$$Applying_assertion_changes;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject edits = ZERO_INTEGER;
        SubLObject non_gafs = ZERO_INTEGER;
        SubLObject assertion_order = NIL;
        SubLObject success = NIL;
        final SubLObject str = $$$Optimizing_edit_order;
        SubLObject _prev_bind_0 = $progress_start_time$.currentBinding(thread);
        SubLObject _prev_bind_2 = $progress_last_pacification_time$.currentBinding(thread);
        SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
        SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
        SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
        SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
        SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
        SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
        try {
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
            $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
            $progress_notification_count$.bind(ZERO_INTEGER, thread);
            $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
            $progress_count$.bind(ZERO_INTEGER, thread);
            $is_noting_progressP$.bind(T, thread);
            $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
            noting_progress_preamble(str);
            assertion_order = assertion_utilities.sort_assertions(map_utilities.map_keys(edits_spec));
            noting_progress_postamble();
        } finally {
            $silent_progressP$.rebind(_prev_bind_8, thread);
            $is_noting_progressP$.rebind(_prev_bind_7, thread);
            $progress_count$.rebind(_prev_bind_6, thread);
            $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
            $progress_notification_count$.rebind(_prev_bind_4, thread);
            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
            $progress_last_pacification_time$.rebind(_prev_bind_2, thread);
            $progress_start_time$.rebind(_prev_bind_0, thread);
        }
        try {
            final SubLObject list_var = assertion_order;
            _prev_bind_0 = $progress_note$.currentBinding(thread);
            _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            _prev_bind_3 = $progress_total$.currentBinding(thread);
            _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind(NIL != message ? message : $$$cdolist, thread);
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
                    SubLObject target_assertion = NIL;
                    target_assertion = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        SubLObject cdolist_list_var;
                        final SubLObject string_mappings = cdolist_list_var = map_utilities.map_get(edits_spec, target_assertion, UNPROVIDED);
                        SubLObject string_mapping = NIL;
                        string_mapping = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            SubLObject current;
                            final SubLObject datum = current = string_mapping;
                            SubLObject unrep_term = NIL;
                            SubLObject new_string = NIL;
                            destructuring_bind_must_consp(current, datum, $list293);
                            unrep_term = current.first();
                            current = new_string = current.rest();
                            final SubLObject old_formula_data = assertions_low.assertion_formula_data(target_assertion);
                            assertion_manager.mark_assertion_content_as_muted(assertion_handles.assertion_id(target_assertion));
                            if (NIL != clause_strucs.clause_struc_p(old_formula_data)) {
                                final SubLObject cs = old_formula_data;
                                cycl_utilities.expression_nsubst(new_string, unrep_term, clause_strucs.clause_struc_cnf(cs), EQUAL, UNPROVIDED);
                            } else
                                if ((NIL != clauses.cnf_p(old_formula_data)) || old_formula_data.isCons()) {
                                    cycl_utilities.expression_nsubst(new_string, unrep_term, old_formula_data, EQUAL, UNPROVIDED);
                                } else {
                                    non_gafs = add(non_gafs, ONE_INTEGER);
                                }

                            edits = add(edits, ONE_INTEGER);
                            cdolist_list_var = cdolist_list_var.rest();
                            string_mapping = cdolist_list_var.first();
                        } 
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        target_assertion = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$42 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$42, thread);
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
            success = T;
        } finally {
            final SubLObject _prev_bind_9 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                if (NIL == success) {
                    final SubLObject str2;
                    final SubLObject msg = str2 = cconcatenate($$$A_total_of_, new SubLObject[]{ format_nil.format_nil_a_no_copy(edits), $str295$_edits_had_been_made_to_the_KB_ });
                    final SubLObject _prev_bind_0_$43 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = $progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_12 = $progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_13 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_14 = $progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_15 = $is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_16 = $silent_progressP$.currentBinding(thread);
                    try {
                        $progress_start_time$.bind(get_universal_time(), thread);
                        $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                        $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        $progress_notification_count$.bind(ZERO_INTEGER, thread);
                        $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                        $progress_count$.bind(ZERO_INTEGER, thread);
                        $is_noting_progressP$.bind(T, thread);
                        $silent_progressP$.bind(NIL != str2 ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                        noting_progress_preamble(str2);
                        noting_progress_postamble();
                    } finally {
                        $silent_progressP$.rebind(_prev_bind_16, thread);
                        $is_noting_progressP$.rebind(_prev_bind_15, thread);
                        $progress_count$.rebind(_prev_bind_14, thread);
                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_13, thread);
                        $progress_notification_count$.rebind(_prev_bind_12, thread);
                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_11, thread);
                        $progress_last_pacification_time$.rebind(_prev_bind_10, thread);
                        $progress_start_time$.rebind(_prev_bind_0_$43, thread);
                    }
                }
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_9, thread);
            }
        }
        return values(edits, list($NON_GAFS, non_gafs));
    }

    public static SubLObject weakly_scramble_string_in_assertions(final SubLObject string, final SubLObject assertions) {
        final SubLObject odd_string = reverse(string);
        final SubLObject even_string = mix_case_string(string);
        SubLObject odd_assertions = NIL;
        SubLObject even_assertions = NIL;
        SubLObject result = NIL;
        SubLObject cdolist_list_var = assertions;
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != evenp(assertion_handles.assertion_id(assertion))) {
                even_assertions = cons(assertion, even_assertions);
            } else {
                odd_assertions = cons(assertion, odd_assertions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        if (NIL == list_utilities.empty_list_p(odd_assertions)) {
            odd_assertions = cons(odd_string, odd_assertions);
            result = cons(odd_assertions, result);
        }
        if (NIL == list_utilities.empty_list_p(even_assertions)) {
            even_assertions = cons(even_string, even_assertions);
            result = cons(even_assertions, result);
        }
        return result;
    }

    public static SubLObject weakly_scramble_string_in_nauts(final SubLObject string, final SubLObject nauts) {
        final SubLObject odd_string = reverse(string);
        final SubLObject even_string = mix_case_string(string);
        SubLObject odd_nauts = NIL;
        SubLObject even_nauts = NIL;
        SubLObject result = NIL;
        SubLObject cdolist_list_var = nauts;
        SubLObject naut = NIL;
        naut = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != evenp(Sxhash.sxhash(naut))) {
                even_nauts = cons(naut, even_nauts);
            } else {
                odd_nauts = cons(naut, odd_nauts);
            }
            cdolist_list_var = cdolist_list_var.rest();
            naut = cdolist_list_var.first();
        } 
        if (NIL == list_utilities.empty_list_p(odd_nauts)) {
            odd_nauts = cons(odd_string, odd_nauts);
            result = cons(odd_nauts, result);
        }
        if (NIL == list_utilities.empty_list_p(even_nauts)) {
            even_nauts = cons(even_string, even_nauts);
            result = cons(even_nauts, result);
        }
        return result;
    }

    public static SubLObject mix_case_string(final SubLObject string) {
        final SubLObject string_var;
        final SubLObject result = string_var = string_utilities.copy_string(string);
        SubLObject end_var_$44;
        SubLObject end_var;
        SubLObject index;
        SubLObject curr;
        for (end_var = end_var_$44 = length(string_var), index = NIL, index = ZERO_INTEGER; !index.numGE(end_var_$44); index = number_utilities.f_1X(index)) {
            curr = Strings.sublisp_char(string_var, index);
            if (NIL != alpha_char_p(curr)) {
                if (NIL != evenp(index)) {
                    Strings.set_char(result, index, char_downcase(curr));
                } else
                    if (NIL != oddp(index)) {
                        Strings.set_char(result, index, char_upcase(curr));
                    }

            }
        }
        return result;
    }

    public static SubLObject select_clippable_collections(SubLObject tabu_collections, SubLObject elmt) {
        if (tabu_collections == UNPROVIDED) {
            tabu_collections = NIL;
        }
        if (elmt == UNPROVIDED) {
            elmt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject collections = NIL;
        if (NIL == elmt) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                collections = isa.all_instances($$Collection, UNPROVIDED, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        } else {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                mt_relevance_macros.$mt$.bind(elmt, thread);
                collections = isa.all_instances($$Collection, UNPROVIDED, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        SubLObject cdolist_list_var = tabu_collections;
        SubLObject tabu_collection = NIL;
        tabu_collection = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            collections = delete(tabu_collection, collections, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            tabu_collection = cdolist_list_var.first();
        } 
        collections = list_utilities.remove_if_not(symbol_function(FORT_P), collections, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == elmt) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                collections = remove_if(symbol_function($sym305$HIGHER_ORDER_COLLECTION_), collections, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        } else {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                mt_relevance_macros.$mt$.bind(elmt, thread);
                collections = remove_if(symbol_function($sym305$HIGHER_ORDER_COLLECTION_), collections, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        collections = Sort.sort(collections, symbol_function($sym306$_), INSTANCE_CARDINALITY);
        collections = cardinality_estimates.stable_sort_by_generality_estimate(collections, $ASCENDING);
        return collections;
    }

    public static SubLObject higher_order_collectionP(final SubLObject col) {
        return isa.isaP(col, $$CollectionType, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject gather_tabu_collections_for_clipping(final SubLObject terms, SubLObject code_constants, SubLObject elmt) {
        if (code_constants == UNPROVIDED) {
            code_constants = NIL;
        }
        if (elmt == UNPROVIDED) {
            elmt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == code_constants) {
            code_constants = constant_completion.constants_mentioned_in_code();
        }
        final SubLObject collections = set.new_set(UNPROVIDED, UNPROVIDED);
        final SubLObject actual_terms = cconcatenate(terms, new SubLObject[]{ code_constants, core.all_core_constants() });
        SubLObject cols_to_add = NIL;
        SubLObject cdolist_list_var = actual_terms;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != fort_types_interface.collectionP(v_term)) {
                if (NIL != elmt) {
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(elmt, thread);
                        cols_to_add = genls.all_genls(v_term, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                } else {
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        cols_to_add = genls.all_genls(v_term, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
            } else
                if (NIL != elmt) {
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(elmt, thread);
                        cols_to_add = isa.all_isa(v_term, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                } else {
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        cols_to_add = isa.all_isa(v_term, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }

            set_utilities.set_add_all(cols_to_add, collections);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return set.set_element_list(collections);
    }

    public static SubLObject clip_kb_percentage(final SubLObject permitted_collections, final SubLObject percentage, SubLObject logP) {
        if (logP == UNPROVIDED) {
            logP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject count_at_start = forts.fort_count();
        final SubLObject count_at_end = floor(multiply(percentage, count_at_start), UNPROVIDED);
        if (!count_at_end.numL(count_at_start)) {
            if (count_at_start.numE(count_at_end)) {
                Errors.warn($str310$Nothing_to_clip_);
                return values(forts.fort_count(), $PERCENTAGE);
            }
            Errors.error($str312$Invalid_percentage__A__cannot_cli, percentage, count_at_end, count_at_start);
        }
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$cdolist, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(permitted_collections), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = permitted_collections;
                SubLObject permitted_collection = NIL;
                permitted_collection = csome_list_var.first();
                while (NIL != csome_list_var) {
                    SubLObject ignore_errors_tag = NIL;
                    try {
                        thread.throwStack.push($IGNORE_ERRORS_TARGET);
                        final SubLObject _prev_bind_0_$45 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                            try {
                                if (NIL != logP) {
                                    format_nil.force_format(T, $str313$___A__Deleting__A_____, numeric_date_utilities.timestring(UNPROVIDED), permitted_collection, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                                final SubLObject _prev_bind_0_$46 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$47 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                    final SubLObject node_var = permitted_collection;
                                    final SubLObject _prev_bind_0_$47 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$48 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                    try {
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                                        sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                        try {
                                            SubLObject node_var_$50 = node_var;
                                            final SubLObject deck_type = $STACK;
                                            final SubLObject recur_deck = deck.create_deck(deck_type);
                                            final SubLObject _prev_bind_0_$48 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                            try {
                                                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                try {
                                                    final SubLObject tv_var = NIL;
                                                    final SubLObject _prev_bind_0_$49 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$49 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                        if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                            if (pcase_var.eql($ERROR)) {
                                                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str318$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            } else
                                                                if (pcase_var.eql($CERROR)) {
                                                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str318$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } else
                                                                    if (pcase_var.eql($WARN)) {
                                                                        Errors.warn($str318$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                    } else {
                                                                        Errors.warn($str323$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                        Errors.cerror($$$continue_anyway, $str318$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                    }


                                                        }
                                                        final SubLObject _prev_bind_0_$50 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$50 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                        final SubLObject _prev_bind_2_$56 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                        final SubLObject _prev_bind_3_$57 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        final SubLObject _prev_bind_4_$58 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        try {
                                                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                                final SubLObject _prev_bind_0_$51 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                final SubLObject _prev_bind_1_$51 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                final SubLObject _prev_bind_2_$57 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                try {
                                                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$50, UNPROVIDED);
                                                                    while (NIL != node_var_$50) {
                                                                        final SubLObject tt_node_var = node_var_$50;
                                                                        SubLObject cdolist_list_var;
                                                                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                                        SubLObject module_var = NIL;
                                                                        module_var = cdolist_list_var.first();
                                                                        while (NIL != cdolist_list_var) {
                                                                            final SubLObject _prev_bind_0_$52 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                            final SubLObject _prev_bind_1_$52 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                    if (NIL != d_link) {
                                                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                        if (NIL != mt_links) {
                                                                                            SubLObject iteration_state;
                                                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                                                thread.resetMultipleValues();
                                                                                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                                                thread.resetMultipleValues();
                                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                    final SubLObject _prev_bind_0_$53 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                    try {
                                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                        SubLObject iteration_state_$65;
                                                                                                        for (iteration_state_$65 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$65); iteration_state_$65 = dictionary_contents.do_dictionary_contents_next(iteration_state_$65)) {
                                                                                                            thread.resetMultipleValues();
                                                                                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$65);
                                                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                            thread.resetMultipleValues();
                                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                final SubLObject _prev_bind_0_$54 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                    final SubLObject sol = link_nodes;
                                                                                                                    if (NIL != set.set_p(sol)) {
                                                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                                        SubLObject basis_object;
                                                                                                                        SubLObject state;
                                                                                                                        SubLObject instance;
                                                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                                            instance = set_contents.do_set_contents_next(basis_object, state);
                                                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state, instance)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                cyc_kernel.cyc_kill(instance);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } else
                                                                                                                        if (sol.isList()) {
                                                                                                                            SubLObject csome_list_var_$67 = sol;
                                                                                                                            SubLObject instance2 = NIL;
                                                                                                                            instance2 = csome_list_var_$67.first();
                                                                                                                            while (NIL != csome_list_var_$67) {
                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                    cyc_kernel.cyc_kill(instance2);
                                                                                                                                }
                                                                                                                                csome_list_var_$67 = csome_list_var_$67.rest();
                                                                                                                                instance2 = csome_list_var_$67.first();
                                                                                                                            } 
                                                                                                                        } else {
                                                                                                                            Errors.error($str324$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                                        }

                                                                                                                } finally {
                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$54, thread);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$65);
                                                                                                    } finally {
                                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$53, thread);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                        }
                                                                                    } else {
                                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str325$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                    }
                                                                                    if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                                                        SubLObject csome_list_var_$68 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                                        SubLObject instance_tuple = NIL;
                                                                                        instance_tuple = csome_list_var_$68.first();
                                                                                        while (NIL != csome_list_var_$68) {
                                                                                            SubLObject current;
                                                                                            final SubLObject datum = current = instance_tuple;
                                                                                            SubLObject link_node = NIL;
                                                                                            SubLObject mt2 = NIL;
                                                                                            SubLObject tv2 = NIL;
                                                                                            destructuring_bind_must_consp(current, datum, $list326);
                                                                                            link_node = current.first();
                                                                                            current = current.rest();
                                                                                            destructuring_bind_must_consp(current, datum, $list326);
                                                                                            mt2 = current.first();
                                                                                            current = current.rest();
                                                                                            destructuring_bind_must_consp(current, datum, $list326);
                                                                                            tv2 = current.first();
                                                                                            current = current.rest();
                                                                                            if (NIL == current) {
                                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                                                    final SubLObject _prev_bind_0_$55 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                    try {
                                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                                            final SubLObject _prev_bind_0_$56 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                            try {
                                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                                                final SubLObject sol;
                                                                                                                final SubLObject link_nodes2 = sol = list(link_node);
                                                                                                                if (NIL != set.set_p(sol)) {
                                                                                                                    final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                                    SubLObject basis_object;
                                                                                                                    SubLObject state;
                                                                                                                    SubLObject instance;
                                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                                        instance = set_contents.do_set_contents_next(basis_object, state);
                                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state, instance)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                            cyc_kernel.cyc_kill(instance);
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else
                                                                                                                    if (sol.isList()) {
                                                                                                                        SubLObject csome_list_var_$69 = sol;
                                                                                                                        SubLObject instance2 = NIL;
                                                                                                                        instance2 = csome_list_var_$69.first();
                                                                                                                        while (NIL != csome_list_var_$69) {
                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                cyc_kernel.cyc_kill(instance2);
                                                                                                                            }
                                                                                                                            csome_list_var_$69 = csome_list_var_$69.rest();
                                                                                                                            instance2 = csome_list_var_$69.first();
                                                                                                                        } 
                                                                                                                    } else {
                                                                                                                        Errors.error($str324$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                                    }

                                                                                                            } finally {
                                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$56, thread);
                                                                                                            }
                                                                                                        }
                                                                                                    } finally {
                                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$55, thread);
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                cdestructuring_bind_error(datum, $list326);
                                                                                            }
                                                                                            csome_list_var_$68 = csome_list_var_$68.rest();
                                                                                            instance_tuple = csome_list_var_$68.first();
                                                                                        } 
                                                                                    }
                                                                                } else
                                                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                        SubLObject cdolist_list_var_$72;
                                                                                        final SubLObject new_list = cdolist_list_var_$72 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                        SubLObject generating_fn = NIL;
                                                                                        generating_fn = cdolist_list_var_$72.first();
                                                                                        while (NIL != cdolist_list_var_$72) {
                                                                                            final SubLObject _prev_bind_0_$57 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                final SubLObject sol2;
                                                                                                final SubLObject link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                                                if (NIL != set.set_p(sol2)) {
                                                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                                                    SubLObject basis_object2;
                                                                                                    SubLObject state2;
                                                                                                    SubLObject instance3;
                                                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                                        instance3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state2, instance3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(instance3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            cyc_kernel.cyc_kill(instance3);
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol2.isList()) {
                                                                                                        SubLObject csome_list_var_$70 = sol2;
                                                                                                        SubLObject instance4 = NIL;
                                                                                                        instance4 = csome_list_var_$70.first();
                                                                                                        while (NIL != csome_list_var_$70) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(instance4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                cyc_kernel.cyc_kill(instance4);
                                                                                                            }
                                                                                                            csome_list_var_$70 = csome_list_var_$70.rest();
                                                                                                            instance4 = csome_list_var_$70.first();
                                                                                                        } 
                                                                                                    } else {
                                                                                                        Errors.error($str324$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$57, thread);
                                                                                            }
                                                                                            cdolist_list_var_$72 = cdolist_list_var_$72.rest();
                                                                                            generating_fn = cdolist_list_var_$72.first();
                                                                                        } 
                                                                                    }

                                                                            } finally {
                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$52, thread);
                                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$52, thread);
                                                                            }
                                                                            cdolist_list_var = cdolist_list_var.rest();
                                                                            module_var = cdolist_list_var.first();
                                                                        } 
                                                                        SubLObject cdolist_list_var2;
                                                                        final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                                        SubLObject module_var2 = NIL;
                                                                        module_var2 = cdolist_list_var2.first();
                                                                        while (NIL != cdolist_list_var2) {
                                                                            final SubLObject _prev_bind_0_$58 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                            final SubLObject _prev_bind_1_$53 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                final SubLObject node2 = function_terms.naut_to_nart(node_var_$50);
                                                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                                                    final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                    if (NIL != d_link2) {
                                                                                        final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                        if (NIL != mt_links2) {
                                                                                            SubLObject iteration_state2;
                                                                                            for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                                                thread.resetMultipleValues();
                                                                                                final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                                                final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                                                thread.resetMultipleValues();
                                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                                                    final SubLObject _prev_bind_0_$59 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                    try {
                                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                                        SubLObject iteration_state_$66;
                                                                                                        for (iteration_state_$66 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$66); iteration_state_$66 = dictionary_contents.do_dictionary_contents_next(iteration_state_$66)) {
                                                                                                            thread.resetMultipleValues();
                                                                                                            final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$66);
                                                                                                            final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                                            thread.resetMultipleValues();
                                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                                                final SubLObject _prev_bind_0_$60 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                                                    final SubLObject sol3 = link_nodes4;
                                                                                                                    if (NIL != set.set_p(sol3)) {
                                                                                                                        final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                                        SubLObject basis_object3;
                                                                                                                        SubLObject state3;
                                                                                                                        SubLObject node_vars_link_node;
                                                                                                                        for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } else
                                                                                                                        if (sol3.isList()) {
                                                                                                                            SubLObject csome_list_var_$71 = sol3;
                                                                                                                            SubLObject node_vars_link_node2 = NIL;
                                                                                                                            node_vars_link_node2 = csome_list_var_$71.first();
                                                                                                                            while (NIL != csome_list_var_$71) {
                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                                    deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                                                }
                                                                                                                                csome_list_var_$71 = csome_list_var_$71.rest();
                                                                                                                                node_vars_link_node2 = csome_list_var_$71.first();
                                                                                                                            } 
                                                                                                                        } else {
                                                                                                                            Errors.error($str324$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                                        }

                                                                                                                } finally {
                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$60, thread);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$66);
                                                                                                    } finally {
                                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$59, thread);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                                        }
                                                                                    } else {
                                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str325$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                    }
                                                                                } else
                                                                                    if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                                                        SubLObject cdolist_list_var_$73;
                                                                                        final SubLObject new_list2 = cdolist_list_var_$73 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                        SubLObject generating_fn2 = NIL;
                                                                                        generating_fn2 = cdolist_list_var_$73.first();
                                                                                        while (NIL != cdolist_list_var_$73) {
                                                                                            final SubLObject _prev_bind_0_$61 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                                                final SubLObject sol4;
                                                                                                final SubLObject link_nodes5 = sol4 = funcall(generating_fn2, node2);
                                                                                                if (NIL != set.set_p(sol4)) {
                                                                                                    final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                                                    SubLObject basis_object4;
                                                                                                    SubLObject state4;
                                                                                                    SubLObject node_vars_link_node3;
                                                                                                    for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol4.isList()) {
                                                                                                        SubLObject csome_list_var_$72 = sol4;
                                                                                                        SubLObject node_vars_link_node4 = NIL;
                                                                                                        node_vars_link_node4 = csome_list_var_$72.first();
                                                                                                        while (NIL != csome_list_var_$72) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                                            }
                                                                                                            csome_list_var_$72 = csome_list_var_$72.rest();
                                                                                                            node_vars_link_node4 = csome_list_var_$72.first();
                                                                                                        } 
                                                                                                    } else {
                                                                                                        Errors.error($str324$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$61, thread);
                                                                                            }
                                                                                            cdolist_list_var_$73 = cdolist_list_var_$73.rest();
                                                                                            generating_fn2 = cdolist_list_var_$73.first();
                                                                                        } 
                                                                                    }

                                                                            } finally {
                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$53, thread);
                                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$58, thread);
                                                                            }
                                                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                                                            module_var2 = cdolist_list_var2.first();
                                                                        } 
                                                                        node_var_$50 = deck.deck_pop(recur_deck);
                                                                    } 
                                                                } finally {
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$57, thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$51, thread);
                                                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$51, thread);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str327$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } finally {
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4_$58, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3_$57, thread);
                                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$56, thread);
                                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$50, thread);
                                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$50, thread);
                                                        }
                                                    } finally {
                                                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$49, thread);
                                                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$49, thread);
                                                    }
                                                } finally {
                                                    final SubLObject _prev_bind_0_$62 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        final SubLObject _values = getValuesAsVector();
                                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                        restoreValuesFromVector(_values);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$62, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$48, thread);
                                            }
                                        } finally {
                                            final SubLObject _prev_bind_0_$63 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values2 = getValuesAsVector();
                                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                restoreValuesFromVector(_values2);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$63, thread);
                                            }
                                        }
                                    } finally {
                                        sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$48, thread);
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$47, thread);
                                    }
                                } finally {
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$47, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$46, thread);
                                }
                                cyc_kernel.cyc_kill(permitted_collection);
                            } catch (final Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0_$45, thread);
                        }
                    } catch (final Throwable ccatch_env_var) {
                        ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                    } finally {
                        thread.throwStack.pop();
                    }
                    if (NIL != logP) {
                        format_nil.force_format(T, $str328$_done___, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    if (forts.fort_count().numLE(count_at_end)) {
                        return values(forts.fort_count(), $PERCENTAGE);
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    permitted_collection = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$64 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values3 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values3);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$64, thread);
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
        return values(forts.fort_count(), $EXHAUSTED);
    }

    public static SubLObject clip_kb_given_tabu_term_list(final SubLObject tabu_term_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tabu_collections = NIL;
        SubLObject clippable_collections = NIL;
        format_nil.force_format(T, $str331$___A__Current_FORT_Count____A__, numeric_date_utilities.timestring(UNPROVIDED), forts.fort_count(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        format_nil.force_format(T, $str332$___A__Gathering_tabu_collections_, numeric_date_utilities.timestring(UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        tabu_collections = gather_tabu_collections_for_clipping(tabu_term_list, UNPROVIDED, UNPROVIDED);
        format_nil.force_format(T, $str333$___A__Selecting_clippable_collect, numeric_date_utilities.timestring(UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        clippable_collections = select_clippable_collections(tabu_collections, UNPROVIDED);
        format_nil.force_format(T, $str334$___A__Clipping_collections_______, numeric_date_utilities.timestring(UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject final_count = clip_kb_percentage(clippable_collections, $float$0_1, $LOG);
        final SubLObject reason = thread.secondMultipleValue();
        thread.resetMultipleValues();
        format_nil.force_format(T, $str337$___A__Clipping_stopped_at__A_FORT, numeric_date_utilities.timestring(UNPROVIDED), final_count, reason, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return values(final_count, reason);
    }

    public static SubLObject generate_terms_transcript(final SubLObject term_guids, final SubLObject ts_file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = el_partitions.$el_partition_creator_override$.currentBinding(thread);
        final SubLObject _prev_bind_2 = el_partitions.$el_partition_creation_purpose_override$.currentBinding(thread);
        try {
            el_partitions.$el_partition_creator_override$.bind($$CycAdministrator, thread);
            el_partitions.$el_partition_creation_purpose_override$.bind($int$212, thread);
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0_$87 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text(ts_file, $OUTPUT);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$87, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str50$Unable_to_open__S, ts_file);
                }
                final SubLObject stream_$88 = stream;
                if (NIL == stream_$88) {
                    return NIL;
                }
                final SubLObject _prev_bind_0_$88 = $ts_comment_stream$.currentBinding(thread);
                try {
                    $ts_comment_stream$.bind(stream_$88, thread);
                    final SubLObject ts_writer = el_partitions.new_transcript_el_partition_data_sink(stream_$88);
                    SubLObject skipped = ZERO_INTEGER;
                    final SubLObject _prev_bind_0_$89 = $progress_note$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$91 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $progress_note$.bind($str341$Finding_assertions_about_missing_, thread);
                        $progress_start_time$.bind(get_universal_time(), thread);
                        $progress_total$.bind(length(term_guids), thread);
                        $progress_sofar$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        try {
                            noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                            SubLObject csome_list_var = term_guids;
                            SubLObject term_guid = NIL;
                            term_guid = csome_list_var.first();
                            while (NIL != csome_list_var) {
                                final SubLObject v_term = constants_high.find_constant_by_guid(term_guid);
                                if (NIL != forts.fort_p(v_term)) {
                                    el_partitions.note_el_partition_tip_constant_create(ts_writer, v_term);
                                    final SubLObject _prev_bind_0_$90 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$92 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                        SubLObject cdolist_list_var = $list342;
                                        SubLObject predicate = NIL;
                                        predicate = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            SubLObject cdolist_list_var_$94 = kb_mapping_utilities.pred_value_gafs(v_term, predicate, UNPROVIDED, UNPROVIDED);
                                            SubLObject assertion = NIL;
                                            assertion = cdolist_list_var_$94.first();
                                            while (NIL != cdolist_list_var_$94) {
                                                if (NIL != assertions_high.asserted_assertionP(assertion)) {
                                                    el_partitions.note_el_partition_tip_assertion_create(ts_writer, assertion);
                                                }
                                                cdolist_list_var_$94 = cdolist_list_var_$94.rest();
                                                assertion = cdolist_list_var_$94.first();
                                            } 
                                            cdolist_list_var = cdolist_list_var.rest();
                                            predicate = cdolist_list_var.first();
                                        } 
                                        SubLObject assertions = kb_mapping.gather_term_assertions(v_term, UNPROVIDED);
                                        SubLObject cdolist_list_var2;
                                        assertions = cdolist_list_var2 = assertion_utilities.sort_assertions(assertions);
                                        SubLObject assertion2 = NIL;
                                        assertion2 = cdolist_list_var2.first();
                                        while (NIL != cdolist_list_var2) {
                                            if (((NIL != assertions_high.asserted_assertionP(assertion2)) && (NIL == assertion_utilities.gaf_assertion_has_pred_p(assertion2, $$isa))) && (NIL == assertion_utilities.gaf_assertion_has_pred_p(assertion2, $$genls))) {
                                                el_partitions.note_el_partition_tip_assertion_create(ts_writer, assertion2);
                                            }
                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                            assertion2 = cdolist_list_var2.first();
                                        } 
                                    } finally {
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_1_$92, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$90, thread);
                                    }
                                } else {
                                    skipped = add(skipped, ONE_INTEGER);
                                    Errors.warn($str343$Could_not_find_constant_for__S___, term_guid);
                                }
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                csome_list_var = csome_list_var.rest();
                                term_guid = csome_list_var.first();
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$91 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$91, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                        $progress_sofar$.rebind(_prev_bind_4, thread);
                        $progress_total$.rebind(_prev_bind_3, thread);
                        $progress_start_time$.rebind(_prev_bind_1_$91, thread);
                        $progress_note$.rebind(_prev_bind_0_$89, thread);
                    }
                    if (skipped.isPositive()) {
                        Errors.warn($str344$_A_constants_were_skipped___, skipped);
                    }
                } finally {
                    $ts_comment_stream$.rebind(_prev_bind_0_$88, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$92 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$92, thread);
                }
            }
        } finally {
            el_partitions.$el_partition_creation_purpose_override$.rebind(_prev_bind_2, thread);
            el_partitions.$el_partition_creator_override$.rebind(_prev_bind_0, thread);
        }
        return ts_file;
    }

    public static SubLObject declare_builder_utilities_file() {
        declareFunction(me, "close_old_areas", "CLOSE-OLD-AREAS", 0, 0, false);
        declareFunction(me, "verify_cyc_build", "VERIFY-CYC-BUILD", 0, 0, false);
        declareFunction(me, "cyc_build_world", "CYC-BUILD-WORLD", 2, 0, false);
        declareFunction(me, "cyc_build_world_verify", "CYC-BUILD-WORLD-VERIFY", 2, 0, false);
        declareFunction(me, "build_write_image", "BUILD-WRITE-IMAGE", 1, 0, false);
        declareFunction(me, "cyc_install_directory_name", "CYC-INSTALL-DIRECTORY-NAME", 1, 1, false);
        declareFunction(me, "cyc_install_directory", "CYC-INSTALL-DIRECTORY", 3, 1, false);
        declareFunction(me, "cyc_versioned_world_name", "CYC-VERSIONED-WORLD-NAME", 0, 0, false);
        declareFunction(me, "build_write_image_versioned", "BUILD-WRITE-IMAGE-VERSIONED", 1, 0, false);
        declareFunction(me, "cyc_load_kb", "CYC-LOAD-KB", 1, 0, false);
        declareFunction(me, "cyc_load_incremental_kb", "CYC-LOAD-INCREMENTAL-KB", 1, 0, false);
        declareFunction(me, "cyc_dump_standard_kb", "CYC-DUMP-STANDARD-KB", 1, 0, false);
        declareFunction(me, "cyc_snapshot_kb", "CYC-SNAPSHOT-KB", 1, 1, false);
        declareFunction(me, "cyc_dump_snapshot_kb", "CYC-DUMP-SNAPSHOT-KB", 1, 1, false);
        declareFunction(me, "suggest_kb_snapshot_directory", "SUGGEST-KB-SNAPSHOT-DIRECTORY", 1, 0, false);
        declareFunction(me, "builder_catchup_and_dump_pipeline", "BUILDER-CATCHUP-AND-DUMP-PIPELINE", 3, 3, false);
        declareFunction(me, "builder_log_directory", "BUILDER-LOG-DIRECTORY", 0, 0, false);
        declareFunction(me, "builder_forward_inference_metrics_log", "BUILDER-FORWARD-INFERENCE-METRICS-LOG", 0, 0, false);
        declareFunction(me, "catchup_to_rollover_and_write_image", "CATCHUP-TO-ROLLOVER-AND-WRITE-IMAGE", 1, 2, false);
        declareFunction(me, "catchup_to_rollover", "CATCHUP-TO-ROLLOVER", 0, 0, false);
        declareFunction(me, "catchup_to_rollover_setup", "CATCHUP-TO-ROLLOVER-SETUP", 0, 0, false);
        declareFunction(me, "load_submitted_transcripts_and_write_image", "LOAD-SUBMITTED-TRANSCRIPTS-AND-WRITE-IMAGE", 2, 0, false);
        declareFunction(me, "catchup_to_current_and_write_image_versioned", "CATCHUP-TO-CURRENT-AND-WRITE-IMAGE-VERSIONED", 1, 0, false);
        declareFunction(me, "catchup_to_current_and_write_image", "CATCHUP-TO-CURRENT-AND-WRITE-IMAGE", 1, 0, false);
        declareFunction(me, "catchup_to_current_kb", "CATCHUP-TO-CURRENT-KB", 0, 0, false);
        declareFunction(me, "caught_up_on_operationsP", "CAUGHT-UP-ON-OPERATIONS?", 0, 1, false);
        declareFunction(me, "catch_up_on_operations_verbose", "CATCH-UP-ON-OPERATIONS-VERBOSE", 0, 3, false);
        declareFunction(me, "catch_up_on_operations_very_verbosely", "CATCH-UP-ON-OPERATIONS-VERY-VERBOSELY", 0, 3, false);
        declareFunction(me, "run_baseline_tests", "RUN-BASELINE-TESTS", 0, 0, false);
        declareFunction(me, "baseline_results_to_map", "BASELINE-RESULTS-TO-MAP", 1, 0, false);
        declareFunction(me, "compute_baseline_regressions", "COMPUTE-BASELINE-REGRESSIONS", 2, 0, false);
        declareFunction(me, "show_baseline_regression_info", "SHOW-BASELINE-REGRESSION-INFO", 1, 1, false);
        declareFunction(me, "show_baseline_regression_details", "SHOW-BASELINE-REGRESSION-DETAILS", 1, 2, false);
        declareFunction(me, "declare_cyc_product", "DECLARE-CYC-PRODUCT", 4, 0, false);
        declareFunction(me, "cyc_product_definition_presentP", "CYC-PRODUCT-DEFINITION-PRESENT?", 4, 0, false);
        declareFunction(me, "find_cyc_product", "FIND-CYC-PRODUCT", 3, 0, false);
        declareFunction(me, "cyc_product", "CYC-PRODUCT", 0, 0, false);
        declareFunction(me, "code_product", "CODE-PRODUCT", 0, 0, false);
        declareFunction(me, "kb_product", "KB-PRODUCT", 0, 0, false);
        declareFunction(me, "branch_tag", "BRANCH-TAG", 0, 0, false);
        declareFunction(me, "set_cyc_product", "SET-CYC-PRODUCT", 1, 0, false);
        declareFunction(me, "set_kb_product", "SET-KB-PRODUCT", 1, 0, false);
        declareFunction(me, "initialize_cyc_product", "INITIALIZE-CYC-PRODUCT", 0, 0, false);
        declareFunction(me, "detect_cyc_product", "DETECT-CYC-PRODUCT", 0, 0, false);
        declareFunction(me, "load_file_dependency_information", "LOAD-FILE-DEPENDENCY-INFORMATION", 1, 1, false);
        declareFunction(me, "augment_file_set", "AUGMENT-FILE-SET", 2, 0, false);
        declareFunction(me, "completely_augment_file_set", "COMPLETELY-AUGMENT-FILE-SET", 2, 0, false);
        declareFunction(me, "write_ant_fileset_declaration", "WRITE-ANT-FILESET-DECLARATION", 3, 1, false);
        declareFunction(me, "construct_rooted_file_set_from_list", "CONSTRUCT-ROOTED-FILE-SET-FROM-LIST", 1, 2, false);
        declareFunction(me, "root_file_set", "ROOT-FILE-SET", 1, 2, false);
        declareFunction(me, "unroot_file_set", "UNROOT-FILE-SET", 1, 2, false);
        declareFunction(me, "reroot_file_set", "REROOT-FILE-SET", 3, 1, false);
        declareFunction(me, "test_reroot_file_set", "TEST-REROOT-FILE-SET", 3, 1, false);
        declareFunction(me, "serialize_kb_store_lru_information", "SERIALIZE-KB-STORE-LRU-INFORMATION", 1, 0, false);
        declareFunction(me, "precache_kb_store_by_lru_information", "PRECACHE-KB-STORE-BY-LRU-INFORMATION", 1, 0, false);
        declareFunction(me, "set_kb_store_lru_settings", "SET-KB-STORE-LRU-SETTINGS", 0, 2, false);
        declareFunction(me, "set_kb_store_lru_swap_level", "SET-KB-STORE-LRU-SWAP-LEVEL", 0, 1, false);
        declareFunction(me, "enumerate_fact_sheets_for_kb_to_file", "ENUMERATE-FACT-SHEETS-FOR-KB-TO-FILE", 1, 0, false);
        declareFunction(me, "enumerate_fact_sheets_for_kb", "ENUMERATE-FACT-SHEETS-FOR-KB", 0, 1, false);
        declareFunction(me, "fact_sheet_path_for_term_filter_and_transform", "FACT-SHEET-PATH-FOR-TERM-FILTER-AND-TRANSFORM", 1, 0, false);
        declareFunction(me, "specify_sbhl_caching_policy_template", "SPECIFY-SBHL-CACHING-POLICY-TEMPLATE", 3, 2, false);
        declareFunction(me, "generate_kb_sbhl_caching_policies", "GENERATE-KB-SBHL-CACHING-POLICIES", 2, 1, false);
        declareFunction(me, "generate_legacy_kb_sbhl_caching_policies", "GENERATE-LEGACY-KB-SBHL-CACHING-POLICIES", 1, 1, false);
        declareFunction(me, "generate_completely_cached_kb_sbhl_caching_policies", "GENERATE-COMPLETELY-CACHED-KB-SBHL-CACHING-POLICIES", 1, 1, false);
        declareFunction(me, "propose_kb_sbhl_caching_policies_from_tuning_data", "PROPOSE-KB-SBHL-CACHING-POLICIES-FROM-TUNING-DATA", 1, 1, false);
        declareFunction(me, "propose_completely_cached_kb_sbhl_caching_policies", "PROPOSE-COMPLETELY-CACHED-KB-SBHL-CACHING-POLICIES", 0, 1, false);
        declareFunction(me, "propose_legacy_kb_sbhl_caching_policies", "PROPOSE-LEGACY-KB-SBHL-CACHING-POLICIES", 0, 1, false);
        declareFunction(me, "get_all_sbhl_module_link_predicates", "GET-ALL-SBHL-MODULE-LINK-PREDICATES", 0, 0, false);
        declareFunction(me, "propose_all_sticky_kb_sbhl_caching_policies", "PROPOSE-ALL-STICKY-KB-SBHL-CACHING-POLICIES", 2, 0, false);
        declareFunction(me, "start_recording_sbhl_cache_tuning_data", "START-RECORDING-SBHL-CACHE-TUNING-DATA", 0, 0, false);
        declareFunction(me, "stop_recording_sbhl_cache_tuning_data", "STOP-RECORDING-SBHL-CACHE-TUNING-DATA", 1, 0, false);
        declareFunction(me, "gather_data_for_sbhl_cache_tuning", "GATHER-DATA-FOR-SBHL-CACHE-TUNING", 1, 0, false);
        declareFunction(me, "run_sbhl_cache_tuning_data_gathering", "RUN-SBHL-CACHE-TUNING-DATA-GATHERING", 1, 0, false);
        declareFunction(me, "sbhl_cache_tuning_data_gathering_prologue", "SBHL-CACHE-TUNING-DATA-GATHERING-PROLOGUE", 0, 0, false);
        declareFunction(me, "sbhl_cache_tuning_experiment_prologue", "SBHL-CACHE-TUNING-EXPERIMENT-PROLOGUE", 0, 0, false);
        declareFunction(me, "sbhl_cache_tuning_experiment_epilogue", "SBHL-CACHE-TUNING-EXPERIMENT-EPILOGUE", 1, 0, false);
        declareFunction(me, "sbhl_cache_tuning_data_gathering_generate_report", "SBHL-CACHE-TUNING-DATA-GATHERING-GENERATE-REPORT", 2, 0, false);
        declareFunction(me, "sbhl_cache_tuning_data_gathering_epilogue", "SBHL-CACHE-TUNING-DATA-GATHERING-EPILOGUE", 0, 0, false);
        declareFunction(me, "compile_kb_snapshot_statistics", "COMPILE-KB-SNAPSHOT-STATISTICS", 0, 1, false);
        declareFunction(me, "gather_kb_snapshot_statistics", "GATHER-KB-SNAPSHOT-STATISTICS", 1, 1, false);
        declareFunction(me, "gather_one_kb_snapshot_statistic", "GATHER-ONE-KB-SNAPSHOT-STATISTIC", 4, 0, false);
        declareFunction(me, "track_kb_snapshot_statistics", "TRACK-KB-SNAPSHOT-STATISTICS", 1, 1, false);
        declareFunction(me, "get_kb_mini_dump_timestamp", "GET-KB-MINI-DUMP-TIMESTAMP", 0, 0, false);
        declareFunction(me, "prepare_kb_mini_dump", "PREPARE-KB-MINI-DUMP", 0, 0, false);
        declareFunction(me, "perform_kb_mini_dump", "PERFORM-KB-MINI-DUMP", 1, 0, false);
        declareFunction(me, "launch_asynchronous_kb_mini_dump", "LAUNCH-ASYNCHRONOUS-KB-MINI-DUMP", 1, 0, false);
        declareFunction(me, "mark_kb_mini_dump_as_successful", "MARK-KB-MINI-DUMP-AS-SUCCESSFUL", 1, 0, false);
        declareFunction(me, "build_process_worker_count", "BUILD-PROCESS-WORKER-COUNT", 0, 0, false);
        declareFunction(me, "set_build_process_worker_count", "SET-BUILD-PROCESS-WORKER-COUNT", 1, 0, false);
        declareFunction(me, "build_process_parallelism_permittedP", "BUILD-PROCESS-PARALLELISM-PERMITTED?", 0, 0, false);
        declareMacro(me, "with_allowed_obfuscation_namespace_support", "WITH-ALLOWED-OBFUSCATION-NAMESPACE-SUPPORT");
        declareMacro(me, "with_allowed_obfuscation_namespace", "WITH-ALLOWED-OBFUSCATION-NAMESPACE");
        declareFunction(me, "allowed_obfuscation_namespace_constantP", "ALLOWED-OBFUSCATION-NAMESPACE-CONSTANT?", 1, 0, false);
        declareFunction(me, "un_obfuscatable_constantP", "UN-OBFUSCATABLE-CONSTANT?", 1, 0, false);
        declareMacro(me, "with_constant_obfuscation", "WITH-CONSTANT-OBFUSCATION");
        declareFunction(me, "obfuscate_constant_name_via_generator_fn", "OBFUSCATE-CONSTANT-NAME-VIA-GENERATOR-FN", 1, 0, false);
        declareFunction(me, "obfuscate_constant_name_via_generator_function", "OBFUSCATE-CONSTANT-NAME-VIA-GENERATOR-FUNCTION", 3, 0, false);
        declareFunction(me, "new_constant_obfuscation_cache", "NEW-CONSTANT-OBFUSCATION-CACHE", 0, 0, false);
        declareMacro(me, "with_cached_constant_obfuscation", "WITH-CACHED-CONSTANT-OBFUSCATION");
        declareFunction(me, "make_obfuscation_gensym_state", "MAKE-OBFUSCATION-GENSYM-STATE", 0, 2, false);
        declareFunction(me, "obfuscate_constant_name_gensym", "OBFUSCATE-CONSTANT-NAME-GENSYM", 2, 0, false);
        declareFunction(me, "obfuscate_and_dump_essential_kb", "OBFUSCATE-AND-DUMP-ESSENTIAL-KB", 4, 1, false);
        declareFunction(me, "determine_obfuscation_candidates", "DETERMINE-OBFUSCATION-CANDIDATES", 0, 1, false);
        declareFunction(me, "not_term_of_unit_assertionP", "NOT-TERM-OF-UNIT-ASSERTION?", 1, 0, false);
        declareFunction(me, "determine_assertion_obfuscations", "DETERMINE-ASSERTION-OBFUSCATIONS", 2, 1, false);
        declareFunction(me, "determine_nart_obfuscations", "DETERMINE-NART-OBFUSCATIONS", 2, 1, false);
        declareFunction(me, "apply_assertion_obfuscations", "APPLY-ASSERTION-OBFUSCATIONS", 1, 1, false);
        declareFunction(me, "weakly_scramble_string_in_assertions", "WEAKLY-SCRAMBLE-STRING-IN-ASSERTIONS", 2, 0, false);
        declareFunction(me, "weakly_scramble_string_in_nauts", "WEAKLY-SCRAMBLE-STRING-IN-NAUTS", 2, 0, false);
        declareFunction(me, "mix_case_string", "MIX-CASE-STRING", 1, 0, false);
        declareFunction(me, "select_clippable_collections", "SELECT-CLIPPABLE-COLLECTIONS", 0, 2, false);
        declareFunction(me, "higher_order_collectionP", "HIGHER-ORDER-COLLECTION?", 1, 0, false);
        declareFunction(me, "gather_tabu_collections_for_clipping", "GATHER-TABU-COLLECTIONS-FOR-CLIPPING", 1, 2, false);
        declareFunction(me, "clip_kb_percentage", "CLIP-KB-PERCENTAGE", 2, 1, false);
        declareFunction(me, "clip_kb_given_tabu_term_list", "CLIP-KB-GIVEN-TABU-TERM-LIST", 1, 0, false);
        declareFunction(me, "generate_terms_transcript", "GENERATE-TERMS-TRANSCRIPT", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_builder_utilities_file() {
        deflexical("*STANDARD-REGRESSION-CONDITIONS*", $list97);
        defparameter("*ALL-CYC-PRODUCTS*", NIL);
        defparameter("*CYC-PRODUCT-DEFINITIONS*", NIL);
        deflexical("*CYC-PRODUCT*", SubLSystemTrampolineFile.maybeDefault($cyc_product$, $cyc_product$, NIL));
        defconstant("*CODE-PRODUCT*", $STANDARD);
        deflexical("*KB-PRODUCT*", SubLSystemTrampolineFile.maybeDefault($kb_product$, $kb_product$, NIL));
        defconstant("*BRANCH-TAG*", $$$head);
        defparameter("*GENERIC-SBHL-CACHING-POLICY-TEMPLATES*", list(new SubLObject[]{ specify_sbhl_caching_policy_template($DEFAULT, $STICKY, $UNDEFINED, $ALL, UNPROVIDED), specify_sbhl_caching_policy_template($$genlMt, $STICKY, $UNDEFINED, $ALL, $ALL), specify_sbhl_caching_policy_template($$isa, $SWAPOUT, $int$10000, $int$8000, $int$2000), specify_sbhl_caching_policy_template($$quotedIsa, $SWAPOUT, $int$5000, $int$4000, $int$1000), specify_sbhl_caching_policy_template($$genls, $SWAPOUT, $int$5000, $int$5000, $int$2000), specify_sbhl_caching_policy_template($$disjointWith, $SWAPOUT, $int$1500, $int$1500, $int$200), specify_sbhl_caching_policy_template($$genlPreds, $SWAPOUT, $int$1500, $int$1500, $int$200), specify_sbhl_caching_policy_template($$genlInverse, $SWAPOUT, $int$1500, $int$1500, $int$200), specify_sbhl_caching_policy_template($$negationPreds, $SWAPOUT, $int$1500, $int$1000, ZERO_INTEGER), specify_sbhl_caching_policy_template($$negationInverse, $SWAPOUT, $int$1500, $int$1000, ZERO_INTEGER) }));
        defparameter("*CYC-TESTS-TO-USE-FOR-SBHL-CACHE-TUNING*", NIL);
        defparameter("*KB-QUERIES-TO-USE-FOR-SBHL-CACHE-TUNING*", NIL);
        defparameter("*RUN-CYCLOPS-FOR-SBHL-CACHE-TUNING?*", NIL);
        deflexical("*BUILD-PROCESS-WORKER-COUNT*", ONE_INTEGER);
        defparameter("*ALLOWED-OBFUSCATION-NAME-SPACES*", NIL);
        defparameter("*CONSTANT-OBFUSCATION-NAME-GENERATOR-STATE*", NIL);
        defparameter("*CONSTANT-OBFUSCATION-CACHE*", NIL);
        defparameter("*TS-COMMENT-STREAM*", NIL);
        return NIL;
    }

    public static SubLObject setup_builder_utilities_file() {
        register_external_symbol(CYC_BUILD_WORLD_VERIFY);
        register_external_symbol(CYC_LOAD_KB);
        register_external_symbol(CYC_LOAD_INCREMENTAL_KB);
        register_external_symbol(CYC_DUMP_STANDARD_KB);
        register_external_symbol(CYC_SNAPSHOT_KB);
        register_external_symbol(CYC_DUMP_SNAPSHOT_KB);
        register_external_symbol(SUGGEST_KB_SNAPSHOT_DIRECTORY);
        register_external_symbol(RUN_BASELINE_TESTS);
        register_external_symbol(BASELINE_RESULTS_TO_MAP);
        register_external_symbol(COMPUTE_BASELINE_REGRESSIONS);
        register_external_symbol(SHOW_BASELINE_REGRESSION_INFO);
        register_external_symbol(SHOW_BASELINE_REGRESSION_DETAILS);
        declare_cyc_product($HEAD, $STANDARD, $FULL, $$$head);
        declare_cyc_product($CAE_0_3, $TKB, $AKB, $str116$cake_release_0p3_20051215);
        declare_defglobal($cyc_product$);
        declare_defglobal($kb_product$);
        register_external_symbol(LOAD_FILE_DEPENDENCY_INFORMATION);
        register_external_symbol(AUGMENT_FILE_SET);
        register_external_symbol(COMPLETELY_AUGMENT_FILE_SET);
        register_external_symbol(WRITE_ANT_FILESET_DECLARATION);
        register_external_symbol(CONSTRUCT_ROOTED_FILE_SET_FROM_LIST);
        register_external_symbol(ROOT_FILE_SET);
        register_external_symbol(UNROOT_FILE_SET);
        register_external_symbol(REROOT_FILE_SET);
        define_test_case_table_int(TEST_REROOT_FILE_SET, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list147);
        register_external_symbol(SERIALIZE_KB_STORE_LRU_INFORMATION);
        register_external_symbol(PRECACHE_KB_STORE_BY_LRU_INFORMATION);
        note_funcall_helper_function(FACT_SHEET_PATH_FOR_TERM_FILTER_AND_TRANSFORM);
        register_external_symbol(COMPILE_KB_SNAPSHOT_STATISTICS);
        register_external_symbol(GATHER_KB_SNAPSHOT_STATISTICS);
        register_external_symbol(TRACK_KB_SNAPSHOT_STATISTICS);
        register_external_symbol(GET_KB_MINI_DUMP_TIMESTAMP);
        register_external_symbol(PREPARE_KB_MINI_DUMP);
        register_external_symbol(PERFORM_KB_MINI_DUMP);
        register_external_symbol(LAUNCH_ASYNCHRONOUS_KB_MINI_DUMP);
        register_external_symbol(BUILD_PROCESS_WORKER_COUNT);
        register_external_symbol(SET_BUILD_PROCESS_WORKER_COUNT);
        register_external_symbol($sym238$BUILD_PROCESS_PARALLELISM_PERMITTED_);
        register_external_symbol(WITH_ALLOWED_OBFUSCATION_NAMESPACE_SUPPORT);
        register_external_symbol(WITH_ALLOWED_OBFUSCATION_NAMESPACE);
        register_external_symbol($sym247$ALLOWED_OBFUSCATION_NAMESPACE_CONSTANT_);
        register_external_symbol($sym249$UN_OBFUSCATABLE_CONSTANT_);
        register_external_symbol(WITH_CONSTANT_OBFUSCATION);
        register_external_symbol(OBFUSCATE_CONSTANT_NAME_VIA_GENERATOR_FN);
        register_macro_helper(NEW_CONSTANT_OBFUSCATION_CACHE, WITH_CACHED_CONSTANT_OBFUSCATION);
        register_external_symbol(WITH_CACHED_CONSTANT_OBFUSCATION);
        register_external_symbol(MAKE_OBFUSCATION_GENSYM_STATE);
        register_external_symbol(OBFUSCATE_CONSTANT_NAME_GENSYM);
        register_external_symbol(OBFUSCATE_AND_DUMP_ESSENTIAL_KB);
        register_external_symbol(DETERMINE_OBFUSCATION_CANDIDATES);
        register_external_symbol(DETERMINE_ASSERTION_OBFUSCATIONS);
        register_external_symbol(DETERMINE_NART_OBFUSCATIONS);
        register_external_symbol(APPLY_ASSERTION_OBFUSCATIONS);
        register_external_symbol(WEAKLY_SCRAMBLE_STRING_IN_ASSERTIONS);
        register_external_symbol(WEAKLY_SCRAMBLE_STRING_IN_NAUTS);
        register_external_symbol(MIX_CASE_STRING);
        register_external_symbol(GENERATE_TERMS_TRANSCRIPT);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_builder_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_builder_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_builder_utilities_file();
    }

    
}

/**
 * Total time: 7199 ms
 */
