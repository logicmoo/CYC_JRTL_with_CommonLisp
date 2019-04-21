package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_caching_policies;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.cyc_testing.cyc_testing;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.cycjava.cycl.inference.browser.cb_query;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.inference.harness.inference_metrics;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.inference.harness.inference_analysis;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class builder_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.builder_utilities";
    public static final String myFingerPrint = "9f9c4a9bf19ab5398e93f63b23ebbf4d76304c277e04963f31529e23d9546185";
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 37667L)
    public static SubLSymbol $standard_regression_conditions$;
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 38512L)
    public static SubLSymbol $all_cyc_products$;
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 40243L)
    public static SubLSymbol $cyc_product_definitions$;
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 42629L)
    private static SubLSymbol $cyc_product$;
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 42910L)
    private static SubLSymbol $code_product$;
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 43204L)
    private static SubLSymbol $kb_product$;
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 43301L)
    private static SubLSymbol $branch_tag$;
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 57246L)
    public static SubLSymbol $generic_sbhl_caching_policy_templates$;
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 63118L)
    public static SubLSymbol $cyc_tests_to_use_for_sbhl_cache_tuning$;
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 63707L)
    public static SubLSymbol $kb_queries_to_use_for_sbhl_cache_tuning$;
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 63883L)
    public static SubLSymbol $run_cyclops_for_sbhl_cache_tuningP$;
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 76654L)
    private static SubLSymbol $build_process_worker_count$;
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 77665L)
    public static SubLSymbol $allowed_obfuscation_name_spaces$;
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 79082L)
    public static SubLSymbol $constant_obfuscation_name_generator_state$;
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 79359L)
    public static SubLSymbol $constant_obfuscation_cache$;
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 98203L)
    public static SubLSymbol $ts_comment_stream$;
    private static final SubLSymbol $kw0$TERSE;
    private static final SubLString $str1$This_cyc_image_is_no_longer_usabl;
    private static final SubLSymbol $sym2$CYC_BUILD_WORLD_VERIFY;
    private static final SubLString $str3$Continue;
    private static final SubLString $str4$World_file__A_already_exists_and_;
    private static final SubLString $str5$A;
    private static final SubLString $str6$cyc_;
    private static final SubLString $str7$_;
    private static final SubLString $str8$_kb_;
    private static final SubLString $str9$_cyc_;
    private static final SubLString $str10$_;
    private static final SubLString $str11$_install_;
    private static final SubLString $str12$kb_;
    private static final SubLString $str13$_load;
    private static final SubLSymbol $sym14$DIRECTORY_P;
    private static final SubLString $str15$Writing_cyc_image_to__A__;
    private static final SubLSymbol $sym16$CYC_LOAD_KB;
    private static final SubLSymbol $sym17$CYC_LOAD_INCREMENTAL_KB;
    private static final SubLSymbol $sym18$CYC_DUMP_STANDARD_KB;
    private static final SubLString $str19$This_CYC_is_receiving_operations_;
    private static final SubLSymbol $sym20$CYC_SNAPSHOT_KB;
    private static final SubLSymbol $kw21$MINIMAL;
    private static final SubLSymbol $sym22$CYC_DUMP_SNAPSHOT_KB;
    private static final SubLString $str23$Dump_snapshot_KB_trivially_finish;
    private static final SubLString $str24$Setting_up_safe_KB_dump_environme;
    private static final SubLString $str25$Agenda_was_not_successfully_halte;
    private static final SubLSymbol $kw26$UNKNOWN;
    private static final SubLString $str27$Restoring_pre_dump_environment;
    private static final SubLSymbol $sym28$SUGGEST_KB_SNAPSHOT_DIRECTORY;
    private static final SubLString $str29$The_base_directory__A_does_not_ex;
    private static final SubLString $str30$Loaded_KB_version___A__;
    private static final SubLString $str31$TheBuilder;
    private static final SubLString $str32$yes;
    private static final SubLString $str33$Determining_total_transcript_ops_;
    private static final SubLString $str34$__Total_transcription_ops__A___;
    private static final SubLString $str35$Getting_caught_up_on_operations__;
    private static final SubLString $str36$__Catch_up_completed__Ops_remaini;
    private static final SubLString $str37$Post_catch_up_KB_version___A__;
    private static final SubLSymbol $kw38$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym39$IGNORE_ERRORS_HANDLER;
    private static final SubLString $str40$Post_load_transcript_KB_version__;
    private static final SubLString $str41$no;
    private static final SubLString $str42$__Successfully_created__S_units__;
    private static final SubLString $str43$_home_builder_logs_;
    private static final SubLString $str44$No_log_directory__A_____strange__;
    private static final SubLString $str45$forward_inference_metrics_;
    private static final SubLString $str46$_html;
    private static final SubLString $str47$The_catchup_image_expected_to_be_;
    private static final SubLString $str48$Builder_s_catchup_to_rollover_ser;
    private static final SubLSymbol $kw49$OUTPUT;
    private static final SubLString $str50$Unable_to_open__S;
    private static final SubLString $str51$Getting_caught_up_to_KB_rollover_;
    private static final SubLSymbol $sym52$KB_FULL_TRANSCRIPT_LOADED;
    private static final SubLString $str53$The_agenda_is_not_running___Fix_y;
    private static final SubLSymbol $kw54$RECEIVE_ONLY;
    private static final SubLObject $const55$Guest;
    private static final SubLString $str56$CycAdministrator;
    private static final SubLString $str57$Getting_caught_up__;
    private static final SubLString $str58$Builder_s_transcript_loading_serv;
    private static final SubLSymbol $kw59$NONE;
    private static final SubLString $str60$Builder_s_catchup_to_current_serv;
    private static final SubLString $str61$Getting_caught_up_from_KB_;
    private static final SubLString $str62$_;
    private static final SubLString $str63$_to_KB_;
    private static final SubLSymbol $kw64$DEAF;
    private static final SubLString $str65$Caught_up_to_KB__A__;
    private static final SubLSymbol $sym66$NON_NEGATIVE_INTEGER_P;
    private static final SubLString $str67$Could_not_get_total_master_transc;
    private static final SubLString $str68$Now_getting_caught_up_from_KB_;
    private static final SubLString $str69$__Catching_up_on_operations_took_;
    private static final SubLSymbol $kw70$SILENT;
    private static final SubLString $str71$___A__;
    private static final SubLString $str72$___s_constant_A__A__;
    private static final SubLString $str73$s_were;
    private static final SubLString $str74$_was;
    private static final SubLString $str75$created;
    private static final SubLString $str76$destroyed;
    private static final SubLString $str77$___s_nart_A__A__;
    private static final SubLString $str78$___s_assertion_A__A__;
    private static final SubLString $str79$___s_kb_hl_support_A__A__;
    private static final SubLString $str80$___s_deduction_A__A__;
    private static final SubLSymbol $sym81$RUN_BASELINE_TESTS;
    private static final SubLString $str82$tests_post_build_testdcl_lisp;
    private static final SubLSymbol $kw83$POST_BUILD;
    private static final SubLSymbol $kw84$ALL;
    private static final SubLString $str85$release_baseline_tests_;
    private static final SubLString $str86$_cfasl;
    private static final SubLString $str87$Writing_result_file;
    private static final SubLSymbol $sym88$BASELINE_RESULTS_TO_MAP;
    private static final SubLList $list89;
    private static final SubLInteger $int90$100;
    private static final SubLSymbol $sym91$COMPUTE_BASELINE_REGRESSIONS;
    private static final SubLList $list92;
    private static final SubLSymbol $kw93$NOT_PRESENT;
    private static final SubLSymbol $sym94$SHOW_BASELINE_REGRESSION_INFO;
    private static final SubLList $list95;
    private static final SubLString $str96$___S__;
    private static final SubLList $list97;
    private static final SubLSymbol $sym98$SHOW_BASELINE_REGRESSION_DETAILS;
    private static final SubLList $list99;
    private static final SubLSymbol $sym100$TERM__;
    private static final SubLString $str101$__S__;
    private static final SubLString $str102$___S__;
    private static final SubLSymbol $sym103$KEYWORDP;
    private static final SubLSymbol $sym104$STRINGP;
    private static final SubLString $str105$The_cyc_product___A__is_already_p;
    private static final SubLString $str106$There_already_exists_a_different_;
    private static final SubLString $str107$The_cyc_product__A_already_exists;
    private static final SubLSymbol $sym108$CDR;
    private static final SubLSymbol $kw109$HEAD;
    private static final SubLSymbol $kw110$STANDARD;
    private static final SubLSymbol $kw111$FULL;
    private static final SubLString $str112$head;
    private static final SubLSymbol $kw113$CAE_0_3;
    private static final SubLSymbol $kw114$TKB;
    private static final SubLSymbol $kw115$AKB;
    private static final SubLString $str116$cake_release_0p3_20051215;
    private static final SubLSymbol $sym117$_CYC_PRODUCT_;
    private static final SubLSymbol $sym118$_KB_PRODUCT_;
    private static final SubLSymbol $kw119$UNKNOWN_CYC_PRODUCT;
    private static final SubLSymbol $sym120$LOAD_FILE_DEPENDENCY_INFORMATION;
    private static final SubLSymbol $kw121$INPUT;
    private static final SubLSymbol $sym122$WHITESPACE_CHAR_P;
    private static final SubLSymbol $sym123$AUGMENT_FILE_SET;
    private static final SubLSymbol $sym124$COMPLETELY_AUGMENT_FILE_SET;
    private static final SubLString $str125$Augmenting_the_file_set_not_termi;
    private static final SubLSymbol $sym126$WRITE_ANT_FILESET_DECLARATION;
    private static final SubLString $str127$id;
    private static final SubLString $str128$dir;
    private static final SubLString $str129$fileset;
    private static final SubLSymbol $kw130$UNINITIALIZED;
    private static final SubLString $str131$name;
    private static final SubLSymbol $kw132$VALUE;
    private static final SubLString $str133$include;
    private static final SubLString $str134$exclude;
    private static final SubLSymbol $sym135$CONSTRUCT_ROOTED_FILE_SET_FROM_LIST;
    private static final SubLSymbol $kw136$UNIX;
    private static final SubLSymbol $sym137$ROOT_FILE_SET;
    private static final SubLSymbol $sym138$UNROOT_FILE_SET;
    private static final SubLSymbol $sym139$REROOT_FILE_SET;
    private static final SubLSymbol $sym140$TEST_REROOT_FILE_SET;
    private static final SubLSymbol $kw141$TEST;
    private static final SubLSymbol $kw142$OWNER;
    private static final SubLSymbol $kw143$CLASSES;
    private static final SubLSymbol $kw144$KB;
    private static final SubLSymbol $kw145$TINY;
    private static final SubLSymbol $kw146$WORKING_;
    private static final SubLList $list147;
    private static final SubLString $str148$Rerooting_from__A_to__A_failed_an;
    private static final SubLSymbol $kw149$SUCCESS;
    private static final SubLSymbol $sym150$SERIALIZE_KB_STORE_LRU_INFORMATION;
    private static final SubLString $str151$Serializing_LRU_information_for_K;
    private static final SubLString $str152$cdolist;
    private static final SubLSymbol $sym153$PRECACHE_KB_STORE_BY_LRU_INFORMATION;
    private static final SubLString $str154$Precaching_KB_Store_with_LRU_info;
    private static final SubLFloat $float155$0_212;
    private static final SubLInteger $int156$30000;
    private static final SubLInteger $int157$22000;
    private static final SubLFloat $float158$0_424;
    private static final SubLInteger $int159$1600;
    private static final SubLSymbol $sym160$FACT_SHEET_PATH_FOR_TERM_FILTER_AND_TRANSFORM;
    private static final SubLSymbol $kw161$DEFAULT;
    private static final SubLSymbol $kw162$STICKY;
    private static final SubLSymbol $kw163$UNDEFINED;
    private static final SubLObject $const164$genlMt;
    private static final SubLObject $const165$isa;
    private static final SubLSymbol $kw166$SWAPOUT;
    private static final SubLInteger $int167$10000;
    private static final SubLInteger $int168$8000;
    private static final SubLInteger $int169$2000;
    private static final SubLObject $const170$quotedIsa;
    private static final SubLInteger $int171$5000;
    private static final SubLInteger $int172$4000;
    private static final SubLInteger $int173$1000;
    private static final SubLObject $const174$genls;
    private static final SubLObject $const175$disjointWith;
    private static final SubLInteger $int176$1500;
    private static final SubLInteger $int177$200;
    private static final SubLObject $const178$genlPreds;
    private static final SubLObject $const179$genlInverse;
    private static final SubLObject $const180$negationPreds;
    private static final SubLObject $const181$negationInverse;
    private static final SubLSymbol $sym182$DICTIONARY_P;
    private static final SubLSymbol $sym183$FIRST;
    private static final SubLString $str184$The_templates_list__A_does_not_co;
    private static final SubLList $list185;
    private static final SubLList $list186;
    private static final SubLSymbol $kw187$RECORDING;
    private static final SubLString $str188$Gathering_SBHL_cache_tuning_data_;
    private static final SubLSymbol $sym189$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $kw190$CYC_TESTS;
    private static final SubLString $str191$Gathering_SBHL_cache_tuning_data_;
    private static final SubLString $str192$KBQ_Support_currently_not_impleme;
    private static final SubLSymbol $kw193$KB_QUERIES;
    private static final SubLString $str194$Gathering_SBHL_cache_tuning_data_;
    private static final SubLSymbol $kw195$CYCLOPS;
    private static final SubLSymbol $sym196$COMPILE_KB_SNAPSHOT_STATISTICS;
    private static final SubLSymbol $kw197$REVERSAL;
    private static final SubLSymbol $kw198$TOMBSTONE;
    private static final SubLSymbol $kw199$INDEX_ENTRIES;
    private static final SubLSymbol $kw200$DATA_BYTES;
    private static final SubLString $str201$category;
    private static final SubLString $str202$numOfEdits;
    private static final SubLString $str203$numOfDeletes;
    private static final SubLString $str204$numOfEntries;
    private static final SubLString $str205$numOfBytes;
    private static final SubLString $str206$fragBytes;
    private static final SubLSymbol $sym207$GATHER_KB_SNAPSHOT_STATISTICS;
    private static final SubLSymbol $kw208$IN_PROGRESS;
    private static final SubLList $list209;
    private static final SubLList $list210;
    private static final SubLSymbol $kw211$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw212$DATA_FILE;
    private static final SubLSymbol $kw213$INDEX_FILE;
    private static final SubLSymbol $kw214$TYPE;
    private static final SubLSymbol $kw215$COMPLEX_DATA_FILE;
    private static final SubLSymbol $kw216$COMPLEX_INDEX_FILE;
    private static final SubLSymbol $kw217$KNOWLEDGE;
    private static final SubLSymbol $kw218$INDEXING;
    private static final SubLString $str219$Unsupported_file_vector_type__A__;
    private static final SubLSymbol $sym220$TRACK_KB_SNAPSHOT_STATISTICS;
    private static final SubLString $str221$GATHER_KB_SNAPSHOT_STATISTICS;
    private static final SubLString $str222$__Check_at__A_______;
    private static final SubLString $str223$_A_____in_progress__;
    private static final SubLString $str224$_A_____errored___A___;
    private static final SubLString $str225$_A___A_edits___A_deletes___A_entr;
    private static final SubLString $str226$Unknown_category__A_____dont_know;
    private static final SubLSymbol $sym227$GET_KB_MINI_DUMP_TIMESTAMP;
    private static final SubLSymbol $sym228$PREPARE_KB_MINI_DUMP;
    private static final SubLSymbol $kw229$CYC_API;
    private static final SubLSymbol $sym230$PERFORM_KB_MINI_DUMP;
    private static final SubLString $str231$Error_while_performing_mini_dump_;
    private static final SubLSymbol $kw232$ERROR;
    private static final SubLSymbol $sym233$LAUNCH_ASYNCHRONOUS_KB_MINI_DUMP;
    private static final SubLString $str234$Mini_KB_Dumper;
    private static final SubLString $str235$mini_dump_finished_text;
    private static final SubLSymbol $sym236$BUILD_PROCESS_WORKER_COUNT;
    private static final SubLSymbol $sym237$SET_BUILD_PROCESS_WORKER_COUNT;
    private static final SubLSymbol $sym238$BUILD_PROCESS_PARALLELISM_PERMITTED_;
    private static final SubLSymbol $sym239$WITH_ALLOWED_OBFUSCATION_NAMESPACE_SUPPORT;
    private static final SubLSymbol $sym240$CLET;
    private static final SubLList $list241;
    private static final SubLSymbol $sym242$WITH_ALLOWED_OBFUSCATION_NAMESPACE;
    private static final SubLList $list243;
    private static final SubLSymbol $sym244$_ALLOWED_OBFUSCATION_NAME_SPACES_;
    private static final SubLSymbol $sym245$CONS;
    private static final SubLList $list246;
    private static final SubLSymbol $sym247$ALLOWED_OBFUSCATION_NAMESPACE_CONSTANT_;
    private static final SubLString $str248$cyc;
    private static final SubLSymbol $sym249$UN_OBFUSCATABLE_CONSTANT_;
    private static final SubLSymbol $sym250$WITH_CONSTANT_OBFUSCATION;
    private static final SubLList $list251;
    private static final SubLSymbol $kw252$UNPROVIDED;
    private static final SubLSymbol $sym253$STATE_VAL;
    private static final SubLSymbol $sym254$_CONSTANT_OBFUSCATION_NAME_GENERATOR_STATE_;
    private static final SubLSymbol $sym255$WITH_CONSTANT_NAME_OBFUSCATION;
    private static final SubLList $list256;
    private static final SubLSymbol $sym257$OBFUSCATE_CONSTANT_NAME_VIA_GENERATOR_FN;
    private static final SubLList $list258;
    private static final SubLSymbol $kw259$NOT_FOUND;
    private static final SubLString $str260$_;
    private static final SubLSymbol $sym261$NEW_CONSTANT_OBFUSCATION_CACHE;
    private static final SubLSymbol $sym262$WITH_CACHED_CONSTANT_OBFUSCATION;
    private static final SubLSymbol $sym263$KBEQ;
    private static final SubLList $list264;
    private static final SubLSymbol $sym265$MAKE_OBFUSCATION_GENSYM_STATE;
    private static final SubLString $str266$C;
    private static final SubLSymbol $kw267$ISG;
    private static final SubLSymbol $kw268$UPCASE;
    private static final SubLSymbol $kw269$DOWNCASE;
    private static final SubLSymbol $sym270$OBFUSCATE_CONSTANT_NAME_GENSYM;
    private static final SubLList $list271;
    private static final SubLList $list272;
    private static final SubLSymbol $sym273$OBFUSCATE_AND_DUMP_ESSENTIAL_KB;
    private static final SubLString $str274$Obfuscating_strings_in_Assertions;
    private static final SubLString $str275$Obfuscating_strings_in_NARTs;
    private static final SubLString $str276$KB_has_been_obfuscated__rendering;
    private static final SubLSymbol $sym277$DETERMINE_OBFUSCATION_CANDIDATES;
    private static final SubLString $str278$Identifying_needed_KB_changes;
    private static final SubLString $str279$____Old_Space;
    private static final SubLSymbol $sym280$NOT_TERM_OF_UNIT_ASSERTION_;
    private static final SubLString $str281$____New_Space;
    private static final SubLSymbol $kw282$SKIP;
    private static final SubLSymbol $sym283$DETERMINE_ASSERTION_OBFUSCATIONS;
    private static final SubLString $str284$Identifying_assertion_changes;
    private static final SubLList $list285;
    private static final SubLList $list286;
    private static final SubLSymbol $sym287$DETERMINE_NART_OBFUSCATIONS;
    private static final SubLString $str288$Identifying_NART_changes;
    private static final SubLList $list289;
    private static final SubLSymbol $sym290$APPLY_ASSERTION_OBFUSCATIONS;
    private static final SubLString $str291$Applying_assertion_changes;
    private static final SubLString $str292$Optimizing_edit_order;
    private static final SubLList $list293;
    private static final SubLString $str294$A_total_of_;
    private static final SubLString $str295$_edits_had_been_made_to_the_KB_;
    private static final SubLSymbol $kw296$NON_GAFS;
    private static final SubLSymbol $sym297$WEAKLY_SCRAMBLE_STRING_IN_ASSERTIONS;
    private static final SubLSymbol $sym298$WEAKLY_SCRAMBLE_STRING_IN_NAUTS;
    private static final SubLSymbol $sym299$MIX_CASE_STRING;
    private static final SubLSymbol $sym300$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const301$EverythingPSC;
    private static final SubLObject $const302$Collection;
    private static final SubLSymbol $sym303$RELEVANT_MT_IS_GENL_MT;
    private static final SubLSymbol $sym304$FORT_P;
    private static final SubLSymbol $sym305$HIGHER_ORDER_COLLECTION_;
    private static final SubLSymbol $sym306$_;
    private static final SubLSymbol $sym307$INSTANCE_CARDINALITY;
    private static final SubLSymbol $kw308$ASCENDING;
    private static final SubLObject $const309$CollectionType;
    private static final SubLString $str310$Nothing_to_clip_;
    private static final SubLSymbol $kw311$PERCENTAGE;
    private static final SubLString $str312$Invalid_percentage__A__cannot_cli;
    private static final SubLString $str313$___A__Deleting__A_____;
    private static final SubLSymbol $kw314$BREADTH;
    private static final SubLSymbol $kw315$QUEUE;
    private static final SubLSymbol $kw316$STACK;
    private static final SubLSymbol $sym317$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLString $str318$_A_is_not_a__A;
    private static final SubLSymbol $sym319$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw320$CERROR;
    private static final SubLString $str321$continue_anyway;
    private static final SubLSymbol $kw322$WARN;
    private static final SubLString $str323$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLString $str324$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str325$attempting_to_bind_direction_link;
    private static final SubLList $list326;
    private static final SubLString $str327$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLString $str328$_done___;
    private static final SubLSymbol $sym329$_EXIT;
    private static final SubLSymbol $kw330$EXHAUSTED;
    private static final SubLString $str331$___A__Current_FORT_Count____A__;
    private static final SubLString $str332$___A__Gathering_tabu_collections_;
    private static final SubLString $str333$___A__Selecting_clippable_collect;
    private static final SubLString $str334$___A__Clipping_collections_______;
    private static final SubLFloat $float335$0_1;
    private static final SubLSymbol $kw336$LOG;
    private static final SubLString $str337$___A__Clipping_stopped_at__A_FORT;
    private static final SubLSymbol $sym338$GENERATE_TERMS_TRANSCRIPT;
    private static final SubLObject $const339$CycAdministrator;
    private static final SubLInteger $int340$212;
    private static final SubLString $str341$Finding_assertions_about_missing_;
    private static final SubLList $list342;
    private static final SubLString $str343$Could_not_find_constant_for__S___;
    private static final SubLString $str344$_A_constants_were_skipped___;
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 1058L)
    public static SubLObject close_old_areas() {
        return (SubLObject)builder_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 1579L)
    public static SubLObject verify_cyc_build() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        generic_testing.run_all_test_case_tables(StreamsLow.$standard_output$.getDynamicValue(thread), (SubLObject)builder_utilities.$kw0$TERSE, (SubLObject)builder_utilities.NIL, (SubLObject)builder_utilities.T, (SubLObject)builder_utilities.UNPROVIDED);
        constant_completion.report_constant_names_in_code_but_not_kb();
        return (SubLObject)builder_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 1734L)
    public static SubLObject cyc_build_world(final SubLObject units_directory_path, final SubLObject world_filename) {
        dumper.load_kb(units_directory_path);
        build_write_image(world_filename);
        operation_communication.halt_cyc_image((SubLObject)builder_utilities.$str1$This_cyc_image_is_no_longer_usabl);
        return (SubLObject)builder_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 2058L)
    public static SubLObject cyc_build_world_verify(final SubLObject dump_directory, final SubLObject world_filename) {
        dumper.load_kb(dump_directory);
        verify_cyc_build();
        build_write_image(world_filename);
        operation_communication.halt_cyc_image((SubLObject)builder_utilities.$str1$This_cyc_image_is_no_longer_usabl);
        return (SubLObject)builder_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 2341L)
    public static SubLObject build_write_image(final SubLObject world_filename) {
        research_cyc_init.perform_research_cyc_build_finalizations();
        if (builder_utilities.NIL != Filesys.probe_file(world_filename)) {
            Errors.cerror((SubLObject)builder_utilities.$str3$Continue, (SubLObject)builder_utilities.$str4$World_file__A_already_exists_and_, world_filename);
        }
        operation_communication.write_cyc_image(world_filename, (SubLObject)builder_utilities.T);
        return (SubLObject)builder_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 2701L)
    public static SubLObject cyc_install_directory_name(final SubLObject cyc_product_string, SubLObject revision_letter) {
        if (revision_letter == builder_utilities.UNPROVIDED) {
            revision_letter = (SubLObject)builder_utilities.$str5$A;
        }
        return Sequences.cconcatenate((SubLObject)builder_utilities.$str6$cyc_, new SubLObject[] { format_nil.format_nil_a_no_copy(cyc_product_string), builder_utilities.$str7$_, format_nil.format_nil_a_no_copy(system_info.cyc_revision_string_s1p_format()), builder_utilities.$str8$_kb_, format_nil.format_nil_a_no_copy(operation_communication.kb_version_string()), builder_utilities.$str7$_, format_nil.format_nil_a_no_copy(revision_letter) });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 2988L)
    public static SubLObject cyc_install_directory(final SubLObject cyc_platform_string, final SubLObject cyc_product_string, final SubLObject cyc_toolset, SubLObject revision_letter) {
        if (revision_letter == builder_utilities.UNPROVIDED) {
            revision_letter = (SubLObject)builder_utilities.$str5$A;
        }
        return Sequences.cconcatenate((SubLObject)builder_utilities.$str9$_cyc_, new SubLObject[] { format_nil.format_nil_a_no_copy(cyc_platform_string), builder_utilities.$str10$_, format_nil.format_nil_a_no_copy(cyc_product_string), builder_utilities.$str11$_install_, format_nil.format_nil_a_no_copy(cyc_install_directory_name(cyc_product_string, revision_letter)), builder_utilities.$str10$_, format_nil.format_nil_a_no_copy(cyc_toolset), builder_utilities.$str10$_ });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 3355L)
    public static SubLObject cyc_versioned_world_name() {
        return Sequences.cconcatenate((SubLObject)builder_utilities.$str12$kb_, new SubLObject[] { format_nil.format_nil_a_no_copy(operation_communication.kb_version_string()), builder_utilities.$str13$_load });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 3482L)
    public static SubLObject build_write_image_versioned(final SubLObject directory) {
        assert builder_utilities.NIL != Filesys.directory_p(directory) : directory;
        final SubLObject filename = Sequences.cconcatenate(directory, cyc_versioned_world_name());
        PrintLow.format((SubLObject)builder_utilities.T, (SubLObject)builder_utilities.$str15$Writing_cyc_image_to__A__, filename);
        if (builder_utilities.NIL != build_write_image(filename)) {
            return filename;
        }
        return (SubLObject)builder_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 3858L)
    public static SubLObject cyc_load_kb(final SubLObject units_directory) {
        if (builder_utilities.NIL != operation_communication.kb_incremental_unitsP(units_directory)) {
            operation_communication.load_incremental_kb(units_directory);
            if (builder_utilities.NIL == misc_utilities.system_code_initializations_run_p()) {
                misc_utilities.system_code_initializations((SubLObject)builder_utilities.UNPROVIDED);
            }
        }
        else {
            dumper.load_kb(units_directory);
            misc_utilities.system_code_initializations((SubLObject)builder_utilities.UNPROVIDED);
        }
        return control_vars.kb_loaded();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 4321L)
    public static SubLObject cyc_load_incremental_kb(final SubLObject incremental_units_directory) {
        operation_communication.load_incremental_kb(incremental_units_directory);
        if (builder_utilities.NIL == misc_utilities.system_code_initializations_run_p()) {
            misc_utilities.system_code_initializations((SubLObject)builder_utilities.UNPROVIDED);
        }
        return Values.values(control_vars.kb_loaded(), operation_communication.kb_op_number());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 4756L)
    public static SubLObject cyc_dump_standard_kb(final SubLObject units_directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (builder_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && builder_utilities.NIL != operation_communication.receivingP()) {
            Errors.error((SubLObject)builder_utilities.$str19$This_CYC_is_receiving_operations_);
        }
        kb_utilities.swap_out_all_pristine_kb_objects();
        Storage.room((SubLObject)builder_utilities.UNPROVIDED);
        kb_utilities.kb_statistics((SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
        return dumper.dump_standard_kb(units_directory);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 5166L)
    public static SubLObject cyc_snapshot_kb(final SubLObject target_directory, SubLObject tombstoning_mode) {
        if (tombstoning_mode == builder_utilities.UNPROVIDED) {
            tombstoning_mode = (SubLObject)builder_utilities.$kw21$MINIMAL;
        }
        return cyc_dump_snapshot_kb(target_directory, tombstoning_mode);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 5323L)
    public static SubLObject cyc_dump_snapshot_kb(final SubLObject target_directory, SubLObject tombstoning_mode) {
        if (tombstoning_mode == builder_utilities.UNPROVIDED) {
            tombstoning_mode = (SubLObject)builder_utilities.$kw21$MINIMAL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (builder_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && builder_utilities.NIL != operation_communication.receivingP()) {
            Errors.error((SubLObject)builder_utilities.$str19$This_CYC_is_receiving_operations_);
        }
        if (misc_utilities.generic_caches_directory().isString() && builder_utilities.NIL != Strings.stringE(misc_utilities.generic_caches_directory(), target_directory, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED)) {
            Errors.warn((SubLObject)builder_utilities.$str23$Dump_snapshot_KB_trivially_finish, target_directory);
            return target_directory;
        }
        if (builder_utilities.NIL == operation_queues.local_queue_empty()) {
            while (builder_utilities.NIL == operation_queues.local_queue_empty()) {
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
        final SubLObject saved_communication_mode = control_vars.$communication_mode$.getGlobalValue();
        final SubLObject saved_remote_queue = queues.queue_copy(operation_queues.$remote_queue$.getGlobalValue());
        final SubLObject saved_local_queue = queues.queue_copy(operation_queues.local_queue());
        final SubLObject saved_auxiliary_queue = queues.queue_copy(operation_queues.$auxiliary_queue$.getGlobalValue());
        final SubLObject saved_transcript_queue = queues.queue_copy(operation_queues.$transcript_queue$.getGlobalValue());
        SubLObject disabled_servers = (SubLObject)builder_utilities.NIL;
        try {
            final SubLObject str = (SubLObject)builder_utilities.$str24$Setting_up_safe_KB_dump_environme;
            final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
            try {
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                utilities_macros.$progress_notification_count$.bind((SubLObject)builder_utilities.ZERO_INTEGER, thread);
                utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)builder_utilities.ZERO_INTEGER, thread);
                utilities_macros.$progress_count$.bind((SubLObject)builder_utilities.ZERO_INTEGER, thread);
                utilities_macros.$is_noting_progressP$.bind((SubLObject)builder_utilities.T, thread);
                utilities_macros.$silent_progressP$.bind((SubLObject)((builder_utilities.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : builder_utilities.T), thread);
                utilities_macros.noting_progress_preamble(str);
                Storage.room((SubLObject)builder_utilities.UNPROVIDED);
                disabled_servers = tcp_server_utilities.disable_some_tcp_servers((SubLObject)builder_utilities.UNPROVIDED);
                if (builder_utilities.NIL != agenda_runningP) {
                    operation_communication.ensure_agenda_halted((SubLObject)builder_utilities.NIL);
                }
                if (builder_utilities.NIL != agenda_runningP && builder_utilities.NIL != agenda.agenda_running()) {
                    Errors.warn((SubLObject)builder_utilities.$str25$Agenda_was_not_successfully_halte);
                }
                transcript_utilities.$master_transcript$.setGlobalValue((SubLObject)builder_utilities.NIL);
                transcript_utilities.$local_transcript$.setGlobalValue((SubLObject)builder_utilities.NIL);
                transcript_utilities.set_read_transcript((SubLObject)builder_utilities.NIL);
                control_vars.$communication_mode$.setGlobalValue((SubLObject)builder_utilities.$kw26$UNKNOWN);
                operation_queues.clear_remote_queue();
                operation_queues.clear_local_queue();
                operation_queues.clear_auxiliary_queue();
                operation_queues.clear_transcript_queue();
                kb_utilities.swap_out_all_pristine_kb_objects();
                misc_utilities.flush_all_logs();
                Storage.room((SubLObject)builder_utilities.UNPROVIDED);
                kb_utilities.kb_statistics((SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
                utilities_macros.noting_progress_postamble();
            }
            finally {
                utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
            }
            dumper.snapshot_kb(misc_utilities.generic_caches_directory(), target_directory, tombstoning_mode);
        }
        finally {
            final SubLObject _prev_bind_9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)builder_utilities.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                final SubLObject str2 = (SubLObject)builder_utilities.$str27$Restoring_pre_dump_environment;
                final SubLObject _prev_bind_0_$1 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_10 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_11 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_12 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_13 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_14 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_15 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_16 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)builder_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)builder_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)builder_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)builder_utilities.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((builder_utilities.NIL != str2) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : builder_utilities.T), thread);
                    utilities_macros.noting_progress_preamble(str2);
                    transcript_utilities.set_master_transcript((SubLObject)builder_utilities.UNPROVIDED);
                    transcript_utilities.$local_transcript$.setGlobalValue(saved_local_transcript);
                    transcript_utilities.set_read_transcript(saved_read_transcript);
                    if (builder_utilities.NIL != operation_communication.communication_modeP(saved_communication_mode)) {
                        operation_communication.set_communication_mode(saved_communication_mode);
                    }
                    operation_queues.$remote_queue$.setGlobalValue(saved_remote_queue);
                    operation_queues.set_local_queue(saved_local_queue);
                    operation_queues.$auxiliary_queue$.setGlobalValue(saved_auxiliary_queue);
                    operation_queues.$transcript_queue$.setGlobalValue(saved_transcript_queue);
                    if (builder_utilities.NIL != agenda_runningP) {
                        agenda.start_agenda((SubLObject)builder_utilities.UNPROVIDED);
                    }
                    tcp_server_utilities.re_enable_disabled_tcp_servers(disabled_servers);
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_16, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_15, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_14, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_13, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_12, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_11, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_10, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$1, thread);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_9, thread);
            }
        }
        return target_directory;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 6045L)
    public static SubLObject suggest_kb_snapshot_directory(final SubLObject base_dir) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject canonical = Filesys.probe_file(base_dir);
        if (builder_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !canonical.isString()) {
            Errors.error((SubLObject)builder_utilities.$str29$The_base_directory__A_does_not_ex, base_dir);
        }
        return operation_communication.kb_incremental_dump_directory(string_utilities.remove_last_char(dumper.kb_dump_directory(control_vars.kb_loaded(), (SubLObject)ConsesLow.list(canonical)), (SubLObject)builder_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 6405L)
    public static SubLObject builder_catchup_and_dump_pipeline(final SubLObject start_units_dir, final SubLObject dump_parent_dir, final SubLObject dump_type, SubLObject load_submittedP, SubLObject email_about_submittedP, SubLObject additional_transcripts) {
        if (load_submittedP == builder_utilities.UNPROVIDED) {
            load_submittedP = (SubLObject)builder_utilities.NIL;
        }
        if (email_about_submittedP == builder_utilities.UNPROVIDED) {
            email_about_submittedP = (SubLObject)builder_utilities.NIL;
        }
        if (additional_transcripts == builder_utilities.UNPROVIDED) {
            additional_transcripts = (SubLObject)builder_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)builder_utilities.NIL;
        cyc_load_kb(start_units_dir);
        PrintLow.format((SubLObject)builder_utilities.T, (SubLObject)builder_utilities.$str30$Loaded_KB_version___A__, operation_communication.kb_version_string());
        operation_communication.set_the_cyclist((SubLObject)builder_utilities.$str31$TheBuilder);
        inference_metrics.$gathering_forward_inference_metricsP$.setDynamicValue((SubLObject)builder_utilities.T, thread);
        control_vars.set_load_submitted_transcripts(load_submittedP);
        control_vars.set_send_submitted_transcript_loading_notices(email_about_submittedP);
        agenda.ensure_agenda_running();
        operation_communication.set_receive_state((SubLObject)builder_utilities.$str32$yes);
        SubLObject minutes = (SubLObject)builder_utilities.ZERO_INTEGER;
        SubLObject total_ops = transcript_utilities.total_master_transcript_operations((SubLObject)builder_utilities.UNPROVIDED);
        final SubLObject str = (SubLObject)builder_utilities.$str33$Determining_total_transcript_ops_;
        SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
        SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
        SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
        SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
        try {
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
            utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
            utilities_macros.$progress_notification_count$.bind((SubLObject)builder_utilities.ZERO_INTEGER, thread);
            utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)builder_utilities.ZERO_INTEGER, thread);
            utilities_macros.$progress_count$.bind((SubLObject)builder_utilities.ZERO_INTEGER, thread);
            utilities_macros.$is_noting_progressP$.bind((SubLObject)builder_utilities.T, thread);
            utilities_macros.$silent_progressP$.bind((SubLObject)((builder_utilities.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : builder_utilities.T), thread);
            utilities_macros.noting_progress_preamble(str);
            while (builder_utilities.NIL == subl_promotions.non_negative_integer_p(total_ops)) {
                minutes = Numbers.add(minutes, (SubLObject)builder_utilities.ONE_INTEGER);
                Threads.sleep((SubLObject)builder_utilities.FIVE_INTEGER);
                total_ops = transcript_utilities.total_master_transcript_operations((SubLObject)builder_utilities.UNPROVIDED);
            }
            utilities_macros.noting_progress_postamble();
        }
        finally {
            utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
            utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
            utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
            utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
        }
        format_nil.force_format((SubLObject)builder_utilities.T, (SubLObject)builder_utilities.$str34$__Total_transcription_ops__A___, total_ops, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
        minutes = (SubLObject)builder_utilities.ZERO_INTEGER;
        _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)builder_utilities.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)builder_utilities.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)builder_utilities.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble((SubLObject)builder_utilities.$str35$Getting_caught_up_on_operations__);
                while (operation_communication.kb_op_number().numL(total_ops)) {
                    utilities_macros.note_percent_progress(operation_communication.kb_op_number(), total_ops);
                    final SubLObject new_total_ops = transcript_utilities.total_master_transcript_operations((SubLObject)builder_utilities.UNPROVIDED);
                    if (builder_utilities.NIL != subl_promotions.non_negative_integer_p(new_total_ops)) {
                        total_ops = new_total_ops;
                    }
                    minutes = Numbers.add(minutes, (SubLObject)builder_utilities.ONE_INTEGER);
                    Threads.sleep((SubLObject)builder_utilities.FIVE_INTEGER);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)builder_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        format_nil.force_format((SubLObject)builder_utilities.T, (SubLObject)builder_utilities.$str36$__Catch_up_completed__Ops_remaini, total_ops, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
        PrintLow.format((SubLObject)builder_utilities.T, (SubLObject)builder_utilities.$str37$Post_catch_up_KB_version___A__, operation_communication.kb_version_string());
        operation_communication.server_summary((SubLObject)builder_utilities.UNPROVIDED);
        SubLObject cdolist_list_var = additional_transcripts;
        SubLObject transcript_file = (SubLObject)builder_utilities.NIL;
        transcript_file = cdolist_list_var.first();
        while (builder_utilities.NIL != cdolist_list_var) {
            SubLObject ignore_errors_tag = (SubLObject)builder_utilities.NIL;
            try {
                thread.throwStack.push(builder_utilities.$kw38$IGNORE_ERRORS_TARGET);
                _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)builder_utilities.$sym39$IGNORE_ERRORS_HANDLER), thread);
                    try {
                        operation_communication.load_transcript(transcript_file, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)builder_utilities.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)builder_utilities.$kw38$IGNORE_ERRORS_TARGET);
            }
            finally {
                thread.throwStack.pop();
            }
            PrintLow.format((SubLObject)builder_utilities.T, (SubLObject)builder_utilities.$str40$Post_load_transcript_KB_version__, operation_communication.kb_version_string());
            cdolist_list_var = cdolist_list_var.rest();
            transcript_file = cdolist_list_var.first();
        }
        operation_communication.server_summary((SubLObject)builder_utilities.UNPROVIDED);
        operation_communication.set_receive_state((SubLObject)builder_utilities.$str41$no);
        final SubLObject dump_dir = operation_communication.kb_incremental_dump_directory(Sequences.cconcatenate(dump_parent_dir, operation_communication.kb_loaded_string()));
        file_utilities.make_directory_recursive(dump_dir, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
        result = dumper.cyc_dump_kb(dump_dir, dump_type, (SubLObject)builder_utilities.UNPROVIDED);
        format_nil.force_format((SubLObject)builder_utilities.T, (SubLObject)builder_utilities.$str42$__Successfully_created__S_units__, dump_type, dump_dir, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 8394L)
    public static SubLObject builder_log_directory() {
        final SubLObject log_directory = Sequences.cconcatenate((SubLObject)builder_utilities.$str43$_home_builder_logs_, new SubLObject[] { operation_communication.kb_number_string(Numbers.add((SubLObject)builder_utilities.ONE_INTEGER, control_vars.kb_loaded())), builder_utilities.$str10$_ });
        if (builder_utilities.NIL == Filesys.directory_p(log_directory)) {
            Errors.warn((SubLObject)builder_utilities.$str44$No_log_directory__A_____strange__, log_directory);
            file_utilities.make_directory_recursive(log_directory, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
        }
        return log_directory;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 8950L)
    public static SubLObject builder_forward_inference_metrics_log() {
        return Sequences.cconcatenate(format_nil.format_nil_a_no_copy(builder_log_directory()), new SubLObject[] { builder_utilities.$str45$forward_inference_metrics_, format_nil.format_nil_a_no_copy(Environment.get_process_id((SubLObject)builder_utilities.UNPROVIDED)), builder_utilities.$str46$_html });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 9109L)
    public static SubLObject catchup_to_rollover_and_write_image(final SubLObject catchup_world_file, SubLObject kb_num, SubLObject send_submitted_transcript_loading_noticesP) {
        if (kb_num == builder_utilities.UNPROVIDED) {
            kb_num = (SubLObject)builder_utilities.NIL;
        }
        if (send_submitted_transcript_loading_noticesP == builder_utilities.UNPROVIDED) {
            send_submitted_transcript_loading_noticesP = (SubLObject)builder_utilities.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (builder_utilities.NIL != kb_num && !kb_num.eql(control_vars.kb_loaded()) && builder_utilities.ZERO_INTEGER.eql(operation_communication.read_master_transcript_op_number())) {
            Errors.error((SubLObject)builder_utilities.$str47$The_catchup_image_expected_to_be_, kb_num, operation_communication.kb_version_string());
        }
        cb_system_tools.note_image_purpose((SubLObject)builder_utilities.$str48$Builder_s_catchup_to_rollover_ser);
        kb_utilities.kb_statistics((SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
        inference_metrics.$gathering_forward_inference_metricsP$.setDynamicValue((SubLObject)builder_utilities.T, thread);
        control_vars.set_load_submitted_transcripts((SubLObject)builder_utilities.T);
        if (builder_utilities.NIL != send_submitted_transcript_loading_noticesP) {
            control_vars.set_send_submitted_transcript_loading_notices((SubLObject)builder_utilities.T);
        }
        control_vars.set_auto_increment_kb((SubLObject)builder_utilities.NIL);
        catchup_to_rollover();
        Storage.room((SubLObject)builder_utilities.T);
        kb_utilities.kb_statistics((SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
        build_write_image(catchup_world_file);
        final SubLObject builder_forward_inference_metrics_log = builder_forward_inference_metrics_log();
        if (builder_utilities.NIL == Filesys.probe_file(builder_forward_inference_metrics_log)) {
            SubLObject stream = (SubLObject)builder_utilities.NIL;
            try {
                stream = compatibility.open_text(builder_forward_inference_metrics_log, (SubLObject)builder_utilities.$kw49$OUTPUT);
                if (!stream.isStream()) {
                    Errors.error((SubLObject)builder_utilities.$str50$Unable_to_open__S, builder_forward_inference_metrics_log);
                }
                final SubLObject stream_$3 = stream;
                final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
                try {
                    html_macros.$html_stream$.bind(stream_$3, thread);
                    cb_query.cb_show_forward_inference_metrics((SubLObject)builder_utilities.TWENTY_INTEGER);
                }
                finally {
                    html_macros.$html_stream$.rebind(_prev_bind_0, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)builder_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)builder_utilities.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        return (SubLObject)builder_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 10406L)
    public static SubLObject catchup_to_rollover() {
        catchup_to_rollover_setup();
        Threads.process_wait(Sequences.cconcatenate((SubLObject)builder_utilities.$str51$Getting_caught_up_to_KB_rollover_, format_nil.format_nil_a_no_copy(Numbers.add((SubLObject)builder_utilities.ONE_INTEGER, control_vars.kb_loaded()))), (SubLObject)builder_utilities.$sym52$KB_FULL_TRANSCRIPT_LOADED);
        return (SubLObject)builder_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 10703L)
    public static SubLObject catchup_to_rollover_setup() {
        if (builder_utilities.NIL == agenda.agenda_running()) {
            Errors.error((SubLObject)builder_utilities.$str53$The_agenda_is_not_running___Fix_y);
        }
        operation_communication.set_communication_mode((SubLObject)builder_utilities.$kw54$RECEIVE_ONLY);
        if (operation_communication.set_the_cyclist((SubLObject)builder_utilities.$str31$TheBuilder).eql(builder_utilities.$const55$Guest)) {
            operation_communication.set_the_cyclist((SubLObject)builder_utilities.$str56$CycAdministrator);
        }
        PrintLow.format((SubLObject)builder_utilities.T, (SubLObject)builder_utilities.$str57$Getting_caught_up__);
        streams_high.force_output((SubLObject)builder_utilities.T);
        return (SubLObject)builder_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 11169L)
    public static SubLObject load_submitted_transcripts_and_write_image(final SubLObject ordered_concatenation_transcript, final SubLObject predump_world_file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_system_tools.note_image_purpose((SubLObject)builder_utilities.$str58$Builder_s_transcript_loading_serv);
        final SubLObject _prev_bind_0 = Errors.$continue_cerrorP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = control_vars.$unencapsulating_within_agenda$.currentBinding(thread);
        try {
            Errors.$continue_cerrorP$.bind((SubLObject)builder_utilities.T, thread);
            control_vars.$unencapsulating_within_agenda$.bind((SubLObject)builder_utilities.T, thread);
            operation_communication.load_transcript_file(ordered_concatenation_transcript, (SubLObject)builder_utilities.NIL, (SubLObject)builder_utilities.$kw59$NONE, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
        }
        finally {
            control_vars.$unencapsulating_within_agenda$.rebind(_prev_bind_2, thread);
            Errors.$continue_cerrorP$.rebind(_prev_bind_0, thread);
        }
        Storage.room((SubLObject)builder_utilities.T);
        kb_utilities.kb_statistics((SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
        build_write_image(predump_world_file);
        return (SubLObject)builder_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 11627L)
    public static SubLObject catchup_to_current_and_write_image_versioned(final SubLObject directory) {
        catchup_to_current_kb();
        return build_write_image_versioned(directory);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 11776L)
    public static SubLObject catchup_to_current_and_write_image(final SubLObject current_world_file) {
        catchup_to_current_kb();
        return build_write_image(current_world_file);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 12021L)
    public static SubLObject catchup_to_current_kb() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_system_tools.note_image_purpose((SubLObject)builder_utilities.$str60$Builder_s_catchup_to_current_serv);
        if (builder_utilities.NIL == agenda.agenda_running()) {
            Errors.error((SubLObject)builder_utilities.$str53$The_agenda_is_not_running___Fix_y);
        }
        kb_utilities.kb_statistics((SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
        operation_communication.set_communication_mode((SubLObject)builder_utilities.$kw54$RECEIVE_ONLY);
        if (operation_communication.set_the_cyclist((SubLObject)builder_utilities.$str31$TheBuilder).eql(builder_utilities.$const55$Guest)) {
            operation_communication.set_the_cyclist((SubLObject)builder_utilities.$str56$CycAdministrator);
        }
        Threads.sleep((SubLObject)builder_utilities.FIVE_INTEGER);
        final SubLObject start_op_num = operation_communication.read_master_transcript_op_number();
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)builder_utilities.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)builder_utilities.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)builder_utilities.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(Sequences.cconcatenate((SubLObject)builder_utilities.$str61$Getting_caught_up_from_KB_, new SubLObject[] { format_nil.format_nil_a_no_copy(control_vars.kb_loaded()), builder_utilities.$str62$_, format_nil.format_nil_a_no_copy(operation_communication.read_master_transcript_op_number()), builder_utilities.$str63$_to_KB_, format_nil.format_nil_a_no_copy(control_vars.kb_loaded()), builder_utilities.$str62$_, format_nil.format_nil_a_no_copy(transcript_utilities.total_master_transcript_operations((SubLObject)builder_utilities.UNPROVIDED)) }));
                while (builder_utilities.NIL == control_vars.caught_up_on_master_transcript()) {
                    utilities_macros.note_percent_progress(Numbers.subtract(operation_communication.read_master_transcript_op_number(), start_op_num), Numbers.subtract(transcript_utilities.total_master_transcript_operations((SubLObject)builder_utilities.UNPROVIDED), start_op_num));
                    Threads.sleep((SubLObject)builder_utilities.FIVE_INTEGER);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)builder_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        operation_communication.set_communication_mode((SubLObject)builder_utilities.$kw64$DEAF);
        PrintLow.format((SubLObject)builder_utilities.T, (SubLObject)builder_utilities.$str65$Caught_up_to_KB__A__, operation_communication.kb_version_string());
        Threads.sleep((SubLObject)builder_utilities.FIVE_INTEGER);
        kb_utilities.kb_statistics((SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
        return (SubLObject)builder_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 31349L)
    public static SubLObject caught_up_on_operationsP(SubLObject target_remote_op_count) {
        if (target_remote_op_count == builder_utilities.UNPROVIDED) {
            target_remote_op_count = transcript_server.total_master_transcript_operations_patient((SubLObject)builder_utilities.UNPROVIDED);
        }
        enforceType(target_remote_op_count, builder_utilities.$sym66$NON_NEGATIVE_INTEGER_P);
        final SubLObject actual_remote_op_count = operation_communication.kb_op_number();
        return Numbers.numLE(target_remote_op_count, actual_remote_op_count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 31766L)
    public static SubLObject catch_up_on_operations_verbose(SubLObject target_op_count, SubLObject load_submitted_operationsP, SubLObject keep_going_upon_kb_rolloverP) {
        if (target_op_count == builder_utilities.UNPROVIDED) {
            target_op_count = transcript_server.total_master_transcript_operations_patient((SubLObject)builder_utilities.UNPROVIDED);
        }
        if (load_submitted_operationsP == builder_utilities.UNPROVIDED) {
            load_submitted_operationsP = (SubLObject)builder_utilities.T;
        }
        if (keep_going_upon_kb_rolloverP == builder_utilities.UNPROVIDED) {
            keep_going_upon_kb_rolloverP = (SubLObject)builder_utilities.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        operation_communication.set_the_cyclist((SubLObject)builder_utilities.$str56$CycAdministrator);
        control_vars.set_load_submitted_transcripts(load_submitted_operationsP);
        operation_communication.set_receive_state((SubLObject)builder_utilities.$str32$yes);
        Threads.sleep((SubLObject)builder_utilities.THREE_INTEGER);
        final SubLObject start_op_count = operation_communication.kb_op_number();
        final SubLObject start_kb = control_vars.kb_loaded();
        SubLObject total_time = (SubLObject)builder_utilities.ZERO_INTEGER;
        final SubLObject time_var = Time.get_internal_real_time();
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)builder_utilities.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)builder_utilities.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)builder_utilities.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(Sequences.cconcatenate((SubLObject)builder_utilities.$str61$Getting_caught_up_from_KB_, new SubLObject[] { format_nil.format_nil_a_no_copy(start_kb), builder_utilities.$str62$_, format_nil.format_nil_a_no_copy(start_op_count), builder_utilities.$str63$_to_KB_, format_nil.format_nil_a_no_copy(start_kb), builder_utilities.$str62$_, format_nil.format_nil_a_no_copy(target_op_count) }));
                while (builder_utilities.NIL == caught_up_on_operationsP(target_op_count)) {
                    utilities_macros.note_percent_progress(Numbers.subtract(operation_communication.kb_op_number(), start_op_count), Numbers.subtract(target_op_count, start_op_count));
                    Threads.sleep((SubLObject)builder_utilities.FIVE_INTEGER);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)builder_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        if (builder_utilities.NIL != keep_going_upon_kb_rolloverP) {
            final SubLObject current_kb = control_vars.kb_loaded();
            if (!start_kb.eql(current_kb)) {
                final SubLObject current_target_op_count = transcript_utilities.total_master_transcript_operations((SubLObject)builder_utilities.UNPROVIDED);
                if (builder_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && builder_utilities.NIL == subl_promotions.non_negative_integer_p(current_target_op_count)) {
                    Errors.error((SubLObject)builder_utilities.$str67$Could_not_get_total_master_transc, current_kb, start_kb);
                }
                final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)builder_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)builder_utilities.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)builder_utilities.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(Sequences.cconcatenate((SubLObject)builder_utilities.$str68$Now_getting_caught_up_from_KB_, new SubLObject[] { format_nil.format_nil_a_no_copy(current_kb), builder_utilities.$str62$_, format_nil.format_nil_a_no_copy((SubLObject)builder_utilities.ZERO_INTEGER), builder_utilities.$str63$_to_KB_, format_nil.format_nil_a_no_copy(current_kb), builder_utilities.$str62$_, format_nil.format_nil_a_no_copy(current_target_op_count) }));
                        while (operation_communication.kb_op_number().numL(Numbers.add(target_op_count, current_target_op_count))) {
                            utilities_macros.note_percent_progress(Numbers.subtract(operation_communication.kb_op_number(), target_op_count), current_target_op_count);
                            Threads.sleep((SubLObject)builder_utilities.FIVE_INTEGER);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)builder_utilities.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                }
            }
        }
        total_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        PrintLow.format((SubLObject)builder_utilities.T, (SubLObject)builder_utilities.$str69$__Catching_up_on_operations_took_, total_time);
        operation_communication.set_receive_state((SubLObject)builder_utilities.$str41$no);
        return (SubLObject)builder_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 33607L)
    public static SubLObject catch_up_on_operations_very_verbosely(SubLObject target_op_count, SubLObject load_submitted_operationsP, SubLObject keep_going_upon_kb_rolloverP) {
        if (target_op_count == builder_utilities.UNPROVIDED) {
            target_op_count = transcript_server.total_master_transcript_operations_patient((SubLObject)builder_utilities.UNPROVIDED);
        }
        if (load_submitted_operationsP == builder_utilities.UNPROVIDED) {
            load_submitted_operationsP = (SubLObject)builder_utilities.NIL;
        }
        if (keep_going_upon_kb_rolloverP == builder_utilities.UNPROVIDED) {
            keep_going_upon_kb_rolloverP = (SubLObject)builder_utilities.T;
        }
        final SubLObject kb_object_count_list_1 = kb_utilities.kb_object_count_list();
        catch_up_on_operations_verbose(target_op_count, load_submitted_operationsP, keep_going_upon_kb_rolloverP);
        final SubLObject kb_object_count_list_2 = kb_utilities.kb_object_count_list();
        final SubLObject new_constant_count = kb_utilities.kb_object_count_lists_new_constant_count(kb_object_count_list_2, kb_object_count_list_1);
        final SubLObject new_nart_count = kb_utilities.kb_object_count_lists_new_nart_count(kb_object_count_list_2, kb_object_count_list_1);
        final SubLObject new_assertion_count = kb_utilities.kb_object_count_lists_new_assertion_count(kb_object_count_list_2, kb_object_count_list_1);
        final SubLObject new_kb_hl_support_count = kb_utilities.kb_object_count_lists_new_kb_hl_support_count(kb_object_count_list_2, kb_object_count_list_1);
        final SubLObject new_deduction_count = kb_utilities.kb_object_count_lists_new_deduction_count(kb_object_count_list_2, kb_object_count_list_1);
        if (builder_utilities.NIL != subl_promotions.non_zero_integer_p(new_constant_count) || builder_utilities.NIL != subl_promotions.non_zero_integer_p(new_nart_count) || builder_utilities.NIL != subl_promotions.non_zero_integer_p(new_assertion_count) || builder_utilities.NIL != subl_promotions.non_zero_integer_p(new_kb_hl_support_count) || builder_utilities.NIL != subl_promotions.non_zero_integer_p(new_deduction_count)) {
            if (builder_utilities.NIL.isString()) {
                PrintLow.format((SubLObject)builder_utilities.T, (SubLObject)builder_utilities.$str71$___A__, (SubLObject)builder_utilities.NIL);
            }
            if (builder_utilities.NIL != subl_promotions.non_zero_integer_p(new_constant_count)) {
                PrintLow.format((SubLObject)builder_utilities.T, (SubLObject)builder_utilities.$str72$___s_constant_A__A__, new SubLObject[] { Numbers.abs(new_constant_count), Numbers.abs(new_constant_count).numG((SubLObject)builder_utilities.ONE_INTEGER) ? builder_utilities.$str73$s_were : builder_utilities.$str74$_was, (builder_utilities.NIL != subl_promotions.positive_integer_p(new_constant_count)) ? builder_utilities.$str75$created : builder_utilities.$str76$destroyed });
            }
            if (builder_utilities.NIL != subl_promotions.non_zero_integer_p(new_nart_count)) {
                PrintLow.format((SubLObject)builder_utilities.T, (SubLObject)builder_utilities.$str77$___s_nart_A__A__, new SubLObject[] { Numbers.abs(new_nart_count), Numbers.abs(new_nart_count).numG((SubLObject)builder_utilities.ONE_INTEGER) ? builder_utilities.$str73$s_were : builder_utilities.$str74$_was, (builder_utilities.NIL != subl_promotions.positive_integer_p(new_nart_count)) ? builder_utilities.$str75$created : builder_utilities.$str76$destroyed });
            }
            if (builder_utilities.NIL != subl_promotions.non_zero_integer_p(new_assertion_count)) {
                PrintLow.format((SubLObject)builder_utilities.T, (SubLObject)builder_utilities.$str78$___s_assertion_A__A__, new SubLObject[] { Numbers.abs(new_assertion_count), Numbers.abs(new_assertion_count).numG((SubLObject)builder_utilities.ONE_INTEGER) ? builder_utilities.$str73$s_were : builder_utilities.$str74$_was, (builder_utilities.NIL != subl_promotions.positive_integer_p(new_assertion_count)) ? builder_utilities.$str75$created : builder_utilities.$str76$destroyed });
            }
            if (builder_utilities.NIL != subl_promotions.non_zero_integer_p(new_kb_hl_support_count)) {
                PrintLow.format((SubLObject)builder_utilities.T, (SubLObject)builder_utilities.$str79$___s_kb_hl_support_A__A__, new SubLObject[] { Numbers.abs(new_kb_hl_support_count), Numbers.abs(new_kb_hl_support_count).numG((SubLObject)builder_utilities.ONE_INTEGER) ? builder_utilities.$str73$s_were : builder_utilities.$str74$_was, (builder_utilities.NIL != subl_promotions.positive_integer_p(new_kb_hl_support_count)) ? builder_utilities.$str75$created : builder_utilities.$str76$destroyed });
            }
            if (builder_utilities.NIL != subl_promotions.non_zero_integer_p(new_deduction_count)) {
                PrintLow.format((SubLObject)builder_utilities.T, (SubLObject)builder_utilities.$str80$___s_deduction_A__A__, new SubLObject[] { Numbers.abs(new_deduction_count), Numbers.abs(new_deduction_count).numG((SubLObject)builder_utilities.ONE_INTEGER) ? builder_utilities.$str73$s_were : builder_utilities.$str74$_was, (builder_utilities.NIL != subl_promotions.positive_integer_p(new_deduction_count)) ? builder_utilities.$str75$created : builder_utilities.$str76$destroyed });
            }
        }
        else if (builder_utilities.NIL.isString()) {
            PrintLow.format((SubLObject)builder_utilities.T, (SubLObject)builder_utilities.$str71$___A__, (SubLObject)builder_utilities.NIL);
        }
        streams_high.force_output((SubLObject)builder_utilities.T);
        kb_utilities.kb_statistics((SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
        return (SubLObject)builder_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 34103L)
    public static SubLObject run_baseline_tests() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)builder_utilities.NIL;
        final SubLObject _prev_bind_0 = cyc_testing.$run_tiny_kb_tests_in_full_kbP$.currentBinding(thread);
        try {
            cyc_testing.$run_tiny_kb_tests_in_full_kbP$.bind((SubLObject)builder_utilities.T, thread);
            thread.resetMultipleValues();
            final SubLObject overall = cyc_testing.run_all_cyc_tests_int((SubLObject)builder_utilities.$str82$tests_post_build_testdcl_lisp, StreamsLow.$standard_output$.getDynamicValue(thread), (SubLObject)builder_utilities.$kw0$TERSE, (SubLObject)builder_utilities.NIL, (SubLObject)builder_utilities.$kw83$POST_BUILD, cyc_testing.$run_tiny_kb_tests_in_full_kbP$.getDynamicValue(thread), (SubLObject)builder_utilities.T, (SubLObject)builder_utilities.T, (SubLObject)builder_utilities.$kw84$ALL, (SubLObject)builder_utilities.NIL, (SubLObject)builder_utilities.NIL, (SubLObject)builder_utilities.NIL, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
            final SubLObject runs = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result = (SubLObject)ConsesLow.list(overall, runs);
        }
        finally {
            cyc_testing.$run_tiny_kb_tests_in_full_kbP$.rebind(_prev_bind_0, thread);
        }
        final SubLObject result_file = Sequences.cconcatenate((SubLObject)builder_utilities.$str85$release_baseline_tests_, new SubLObject[] { format_nil.format_nil_a_no_copy(operation_communication.kb_number_string((SubLObject)builder_utilities.UNPROVIDED)), builder_utilities.$str7$_, format_nil.format_nil_a_no_copy(system_info.cyc_revision_string()), builder_utilities.$str7$_, format_nil.format_nil_a_no_copy(numeric_date_utilities.timestamp((SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED)), builder_utilities.$str86$_cfasl });
        final SubLObject str = (SubLObject)builder_utilities.$str87$Writing_result_file;
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$progress_notification_count$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$progress_count$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
        final SubLObject _prev_bind_9 = utilities_macros.$silent_progressP$.currentBinding(thread);
        try {
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
            utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
            utilities_macros.$progress_notification_count$.bind((SubLObject)builder_utilities.ZERO_INTEGER, thread);
            utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)builder_utilities.ZERO_INTEGER, thread);
            utilities_macros.$progress_count$.bind((SubLObject)builder_utilities.ZERO_INTEGER, thread);
            utilities_macros.$is_noting_progressP$.bind((SubLObject)builder_utilities.T, thread);
            utilities_macros.$silent_progressP$.bind((SubLObject)((builder_utilities.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : builder_utilities.T), thread);
            utilities_macros.noting_progress_preamble(str);
            cfasl_utilities.cfasl_save_externalized(result, result_file);
            utilities_macros.noting_progress_postamble();
        }
        finally {
            utilities_macros.$silent_progressP$.rebind(_prev_bind_9, thread);
            utilities_macros.$is_noting_progressP$.rebind(_prev_bind_8, thread);
            utilities_macros.$progress_count$.rebind(_prev_bind_7, thread);
            utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_6, thread);
            utilities_macros.$progress_notification_count$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
        }
        return Values.values(result, Filesys.probe_file(result_file));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 35278L)
    public static SubLObject baseline_results_to_map(final SubLObject filename) {
        final SubLObject result_info = cfasl_utilities.cfasl_load(filename);
        final SubLObject tests_run = conses_high.second(result_info);
        final SubLObject result_map = dictionary.new_dictionary((SubLObject)builder_utilities.EQUAL, (SubLObject)builder_utilities.UNPROVIDED);
        SubLObject cdolist_list_var = tests_run;
        SubLObject test_run = (SubLObject)builder_utilities.NIL;
        test_run = cdolist_list_var.first();
        while (builder_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = test_run;
            SubLObject category = (SubLObject)builder_utilities.NIL;
            SubLObject test = (SubLObject)builder_utilities.NIL;
            SubLObject outcome = (SubLObject)builder_utilities.NIL;
            SubLObject time = (SubLObject)builder_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)builder_utilities.$list89);
            category = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)builder_utilities.$list89);
            test = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)builder_utilities.$list89);
            outcome = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)builder_utilities.$list89);
            time = current.first();
            current = current.rest();
            if (builder_utilities.NIL == current) {
                SubLObject category_map = map_utilities.map_get(result_map, category, (SubLObject)builder_utilities.UNPROVIDED);
                if (builder_utilities.NIL == map_utilities.map_p(category_map)) {
                    category_map = Hashtables.make_hash_table((SubLObject)builder_utilities.$int90$100, (SubLObject)builder_utilities.EQUAL, (SubLObject)builder_utilities.UNPROVIDED);
                    map_utilities.map_put(result_map, category, category_map);
                }
                map_utilities.map_put(category_map, test, outcome);
                map_utilities.map_push(category_map, outcome, test);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)builder_utilities.$list89);
            }
            cdolist_list_var = cdolist_list_var.rest();
            test_run = cdolist_list_var.first();
        }
        return result_map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 36111L)
    public static SubLObject compute_baseline_regressions(final SubLObject baseline, final SubLObject competition) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject categories = map_utilities.map_keys(baseline);
        final SubLObject diff_counts = dictionary.new_dictionary((SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
        final SubLObject diff_details = dictionary.new_dictionary((SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
        SubLObject cdolist_list_var = categories;
        SubLObject category = (SubLObject)builder_utilities.NIL;
        category = cdolist_list_var.first();
        while (builder_utilities.NIL != cdolist_list_var) {
            final SubLObject b_map = map_utilities.map_get(baseline, category, (SubLObject)builder_utilities.UNPROVIDED);
            final SubLObject c_map = map_utilities.map_get(competition, category, (SubLObject)builder_utilities.UNPROVIDED);
            final SubLObject cat_diff_count = dictionary.new_dictionary((SubLObject)builder_utilities.EQUAL, (SubLObject)builder_utilities.UNPROVIDED);
            final SubLObject cat_diff_detail = dictionary.new_dictionary((SubLObject)builder_utilities.EQUAL, (SubLObject)builder_utilities.UNPROVIDED);
            map_utilities.map_put(diff_counts, category, cat_diff_count);
            map_utilities.map_put(diff_details, category, cat_diff_detail);
            final SubLObject iterator = map_utilities.new_map_iterator(b_map);
            SubLObject valid;
            for (SubLObject done_var = (SubLObject)builder_utilities.NIL; builder_utilities.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(builder_utilities.NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject var = iteration.iteration_next(iterator);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (builder_utilities.NIL != valid) {
                    SubLObject current;
                    final SubLObject datum = current = var;
                    SubLObject test = (SubLObject)builder_utilities.NIL;
                    SubLObject b_outcome = (SubLObject)builder_utilities.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)builder_utilities.$list92);
                    test = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)builder_utilities.$list92);
                    b_outcome = current.first();
                    current = current.rest();
                    if (builder_utilities.NIL == current) {
                        if (!b_outcome.isList()) {
                            final SubLObject c_outcome = (SubLObject)((builder_utilities.NIL != map_utilities.map_p(c_map)) ? map_utilities.map_get(c_map, test, (SubLObject)builder_utilities.$kw93$NOT_PRESENT) : builder_utilities.$kw93$NOT_PRESENT);
                            final SubLObject key = (SubLObject)ConsesLow.cons(b_outcome, c_outcome);
                            map_utilities.map_increment(cat_diff_count, key, (SubLObject)builder_utilities.UNPROVIDED);
                            map_utilities.map_push(cat_diff_detail, key, test);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)builder_utilities.$list92);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            category = cdolist_list_var.first();
        }
        return Values.values(diff_counts, diff_details);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 37269L)
    public static SubLObject show_baseline_regression_info(final SubLObject diff_info, SubLObject stream) {
        if (stream == builder_utilities.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject iterator = map_utilities.new_map_iterator(diff_info);
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)builder_utilities.NIL; builder_utilities.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(builder_utilities.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (builder_utilities.NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject category = (SubLObject)builder_utilities.NIL;
                SubLObject info = (SubLObject)builder_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)builder_utilities.$list95);
                category = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)builder_utilities.$list95);
                info = current.first();
                current = current.rest();
                if (builder_utilities.NIL == current) {
                    PrintLow.format(stream, (SubLObject)builder_utilities.$str96$___S__, category);
                    dictionary_utilities.print_dictionary_contents(info, stream);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)builder_utilities.$list95);
                }
            }
        }
        return diff_info;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 37892L)
    public static SubLObject show_baseline_regression_details(final SubLObject diff_detail, SubLObject regression_conditions, SubLObject stream) {
        if (regression_conditions == builder_utilities.UNPROVIDED) {
            regression_conditions = builder_utilities.$standard_regression_conditions$.getGlobalValue();
        }
        if (stream == builder_utilities.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject iterator = map_utilities.new_map_iterator(diff_detail);
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)builder_utilities.NIL; builder_utilities.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(builder_utilities.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (builder_utilities.NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject category = (SubLObject)builder_utilities.NIL;
                SubLObject cat_map = (SubLObject)builder_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)builder_utilities.$list99);
                category = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)builder_utilities.$list99);
                cat_map = current.first();
                current = current.rest();
                if (builder_utilities.NIL == current) {
                    PrintLow.format(stream, (SubLObject)builder_utilities.$str96$___S__, category);
                    SubLObject cdolist_list_var = regression_conditions;
                    SubLObject condition = (SubLObject)builder_utilities.NIL;
                    condition = cdolist_list_var.first();
                    while (builder_utilities.NIL != cdolist_list_var) {
                        final SubLObject tests = Sort.sort(map_utilities.map_get(cat_map, condition, (SubLObject)builder_utilities.UNPROVIDED), (SubLObject)builder_utilities.$sym100$TERM__, (SubLObject)builder_utilities.UNPROVIDED);
                        if (builder_utilities.NIL != list_utilities.sublisp_boolean(tests)) {
                            PrintLow.format(stream, (SubLObject)builder_utilities.$str101$__S__, condition);
                            SubLObject cdolist_list_var_$7 = tests;
                            SubLObject test = (SubLObject)builder_utilities.NIL;
                            test = cdolist_list_var_$7.first();
                            while (builder_utilities.NIL != cdolist_list_var_$7) {
                                PrintLow.format(stream, (SubLObject)builder_utilities.$str102$___S__, test);
                                cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                                test = cdolist_list_var_$7.first();
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        condition = cdolist_list_var.first();
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)builder_utilities.$list99);
                }
            }
        }
        return diff_detail;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 40426L)
    public static SubLObject declare_cyc_product(final SubLObject cyc_product, final SubLObject code_product, final SubLObject kb_product, final SubLObject branch_tag) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert builder_utilities.NIL != Types.keywordp(cyc_product) : cyc_product;
        assert builder_utilities.NIL != Types.keywordp(kb_product) : kb_product;
        assert builder_utilities.NIL != Types.keywordp(code_product) : code_product;
        assert builder_utilities.NIL != Types.stringp(branch_tag) : branch_tag;
        if (builder_utilities.NIL != cyc_product_definition_presentP(cyc_product, code_product, kb_product, branch_tag)) {
            return Errors.warn((SubLObject)builder_utilities.$str105$The_cyc_product___A__is_already_p, cyc_product);
        }
        if (builder_utilities.NIL != find_cyc_product(code_product, kb_product, branch_tag)) {
            return Errors.error((SubLObject)builder_utilities.$str106$There_already_exists_a_different_, find_cyc_product(code_product, kb_product, branch_tag));
        }
        if (builder_utilities.NIL != conses_high.assoc(cyc_product, builder_utilities.$cyc_product_definitions$.getDynamicValue(thread), (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED)) {
            return Errors.error((SubLObject)builder_utilities.$str107$The_cyc_product__A_already_exists, cyc_product);
        }
        builder_utilities.$all_cyc_products$.setDynamicValue((SubLObject)ConsesLow.cons(cyc_product, builder_utilities.$all_cyc_products$.getDynamicValue(thread)), thread);
        builder_utilities.$cyc_product_definitions$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(cyc_product, kb_product, code_product, branch_tag), builder_utilities.$cyc_product_definitions$.getDynamicValue(thread)), thread);
        return builder_utilities.$cyc_product_definitions$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 41636L)
    public static SubLObject cyc_product_definition_presentP(final SubLObject cyc_product, final SubLObject code_product, final SubLObject kb_product, final SubLObject branch_tag) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return conses_high.member((SubLObject)ConsesLow.list(cyc_product, code_product, kb_product, branch_tag), builder_utilities.$cyc_product_definitions$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)builder_utilities.EQUAL), (SubLObject)builder_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 41933L)
    public static SubLObject find_cyc_product(final SubLObject code_product, final SubLObject kb_product, final SubLObject branch_tag) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Sequences.find((SubLObject)ConsesLow.list(code_product, kb_product, branch_tag), builder_utilities.$cyc_product_definitions$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)builder_utilities.EQUAL), Symbols.symbol_function((SubLObject)builder_utilities.$sym108$CDR), (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 43588L)
    public static SubLObject cyc_product() {
        return builder_utilities.$cyc_product$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 43812L)
    public static SubLObject code_product() {
        return builder_utilities.$code_product$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 43871L)
    public static SubLObject kb_product() {
        return builder_utilities.$kb_product$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 43926L)
    public static SubLObject branch_tag() {
        return builder_utilities.$branch_tag$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 43981L)
    public static SubLObject set_cyc_product(final SubLObject cyc_product) {
        assert builder_utilities.NIL != Types.keywordp(cyc_product) : cyc_product;
        builder_utilities.$cyc_product$.setGlobalValue(cyc_product);
        return cyc_product();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 44125L)
    public static SubLObject set_kb_product(final SubLObject kb_product) {
        assert builder_utilities.NIL != Types.keywordp(kb_product) : kb_product;
        builder_utilities.$kb_product$.setGlobalValue(kb_product);
        return kb_product();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 44480L)
    public static SubLObject initialize_cyc_product() {
        final SubLObject cyc_product = detect_cyc_product();
        if (builder_utilities.NIL != cyc_product) {
            set_cyc_product(cyc_product);
        }
        else {
            set_cyc_product((SubLObject)builder_utilities.$kw119$UNKNOWN_CYC_PRODUCT);
        }
        return cyc_product;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 44959L)
    public static SubLObject detect_cyc_product() {
        return find_cyc_product(code_product(), kb_product(), branch_tag());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 45067L)
    public static SubLObject load_file_dependency_information(final SubLObject path, SubLObject test) {
        if (test == builder_utilities.UNPROVIDED) {
            test = (SubLObject)builder_utilities.EQUAL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject information = dictionary.new_dictionary(test, (SubLObject)builder_utilities.UNPROVIDED);
        SubLObject stream = (SubLObject)builder_utilities.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)builder_utilities.NIL, thread);
                stream = compatibility.open_text(path, (SubLObject)builder_utilities.$kw121$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)builder_utilities.$str50$Unable_to_open__S, path);
            }
            final SubLObject stream_var = stream;
            if (stream_var.isStream()) {
                final SubLObject stream_var_$8 = stream_var;
                SubLObject line_number_var = (SubLObject)builder_utilities.NIL;
                SubLObject line = (SubLObject)builder_utilities.NIL;
                line_number_var = (SubLObject)builder_utilities.ZERO_INTEGER;
                for (line = file_utilities.do_stream_lines_get_next_line(stream_var_$8); builder_utilities.NIL != line; line = file_utilities.do_stream_lines_get_next_line(stream_var_$8)) {
                    final SubLObject split_point = Sequences.position_if((SubLObject)builder_utilities.$sym122$WHITESPACE_CHAR_P, line, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
                    final SubLObject dependent = string_utilities.substring(line, (SubLObject)builder_utilities.ZERO_INTEGER, split_point);
                    final SubLObject dependency = string_utilities.substring(line, Numbers.add((SubLObject)builder_utilities.ONE_INTEGER, split_point), (SubLObject)builder_utilities.UNPROVIDED);
                    SubLObject dependencies = map_utilities.map_get(information, dependent, (SubLObject)builder_utilities.UNPROVIDED);
                    if (builder_utilities.NIL == set.set_p(dependencies)) {
                        dependencies = set.new_set(test, (SubLObject)builder_utilities.UNPROVIDED);
                        map_utilities.map_put(information, dependent, dependencies);
                    }
                    set.set_add(dependency, dependencies);
                    line_number_var = number_utilities.f_1X(line_number_var);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)builder_utilities.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)builder_utilities.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return information;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 46138L)
    public static SubLObject augment_file_set(final SubLObject file_set, final SubLObject dependency_information) {
        final SubLObject additions = set.new_set(set.set_test(file_set), (SubLObject)builder_utilities.UNPROVIDED);
        final SubLObject set_contents_var = set.do_set_internal(file_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject file;
        SubLObject dependencies;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)builder_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); builder_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            file = set_contents.do_set_contents_next(basis_object, state);
            if (builder_utilities.NIL != set_contents.do_set_contents_element_validP(state, file)) {
                dependencies = map_utilities.map_get(dependency_information, file, (SubLObject)builder_utilities.UNPROVIDED);
                if (builder_utilities.NIL != set.set_p(dependencies)) {
                    set_utilities.set_nmerge(additions, dependencies);
                }
            }
        }
        set_utilities.set_nprune(additions, file_set);
        final SubLObject actual_additions = set.set_size(additions);
        set_utilities.set_nmerge(file_set, additions);
        return actual_additions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 47045L)
    public static SubLObject completely_augment_file_set(final SubLObject file_set, final SubLObject dependency_information) {
        final SubLObject ceiling = Numbers.add(set.set_size(file_set), map_utilities.map_size(dependency_information));
        SubLObject counter = (SubLObject)builder_utilities.ZERO_INTEGER;
        SubLObject doneP = (SubLObject)builder_utilities.NIL;
        while (builder_utilities.NIL == doneP) {
            final SubLObject additions = augment_file_set(file_set, dependency_information);
            doneP = Numbers.zerop(additions);
            counter = Numbers.add(counter, (SubLObject)builder_utilities.ONE_INTEGER);
            if (ceiling.numL(counter)) {
                Errors.error((SubLObject)builder_utilities.$str125$Augmenting_the_file_set_not_termi, ceiling);
            }
        }
        return file_set;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 47747L)
    public static SubLObject write_ant_fileset_declaration(final SubLObject fileset_id, final SubLObject dir_spec, final SubLObject files_to_include, SubLObject files_to_exclude) {
        if (files_to_exclude == builder_utilities.UNPROVIDED) {
            files_to_exclude = (SubLObject)builder_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject attributes = (SubLObject)ConsesLow.list((SubLObject)builder_utilities.$str127$id, fileset_id, (SubLObject)builder_utilities.$str128$dir, dir_spec);
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal((SubLObject)builder_utilities.$str129$fileset, attributes, (SubLObject)builder_utilities.NIL, (SubLObject)builder_utilities.NIL, (SubLObject)builder_utilities.$kw130$UNINITIALIZED);
                final SubLObject _prev_bind_0_$9 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind((SubLObject)builder_utilities.$kw130$UNINITIALIZED, thread);
                    final SubLObject name_attribute_list = (SubLObject)ConsesLow.list((SubLObject)builder_utilities.$str131$name, (SubLObject)builder_utilities.$kw132$VALUE);
                    final SubLObject name_spot = name_attribute_list.rest();
                    SubLObject cdolist_list_var = files_to_include;
                    SubLObject file_to_include = (SubLObject)builder_utilities.NIL;
                    file_to_include = cdolist_list_var.first();
                    while (builder_utilities.NIL != cdolist_list_var) {
                        ConsesLow.rplaca(name_spot, file_to_include);
                        xml_utilities.xml_terpri();
                        final SubLObject _prev_bind_0_$10 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$11 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)builder_utilities.$str133$include, name_attribute_list, (SubLObject)builder_utilities.T, (SubLObject)builder_utilities.NIL, (SubLObject)builder_utilities.$kw130$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$11 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)builder_utilities.$kw130$UNINITIALIZED, thread);
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$11, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$11, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$10, thread);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        file_to_include = cdolist_list_var.first();
                    }
                    cdolist_list_var = files_to_exclude;
                    SubLObject file_to_exclude = (SubLObject)builder_utilities.NIL;
                    file_to_exclude = cdolist_list_var.first();
                    while (builder_utilities.NIL != cdolist_list_var) {
                        ConsesLow.rplaca(name_spot, file_to_exclude);
                        xml_utilities.xml_terpri();
                        final SubLObject _prev_bind_0_$12 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$12 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)builder_utilities.$str134$exclude, name_attribute_list, (SubLObject)builder_utilities.T, (SubLObject)builder_utilities.NIL, (SubLObject)builder_utilities.$kw130$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$13 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)builder_utilities.$kw130$UNINITIALIZED, thread);
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$13, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$12, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$12, thread);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        file_to_exclude = cdolist_list_var.first();
                    }
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$9, thread);
                }
            }
            finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)builder_utilities.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal((SubLObject)builder_utilities.$str129$fileset);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return fileset_id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 48949L)
    public static SubLObject construct_rooted_file_set_from_list(final SubLObject file_list, SubLObject root, SubLObject test) {
        if (root == builder_utilities.UNPROVIDED) {
            root = file_utilities.path_separator_string((SubLObject)builder_utilities.$kw136$UNIX);
        }
        if (test == builder_utilities.UNPROVIDED) {
            test = (SubLObject)builder_utilities.EQUAL;
        }
        return root_file_set(set_utilities.construct_set_from_list(file_list, test, (SubLObject)builder_utilities.UNPROVIDED), root, test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 49362L)
    public static SubLObject root_file_set(final SubLObject file_set, SubLObject root, SubLObject test) {
        if (root == builder_utilities.UNPROVIDED) {
            root = file_utilities.path_separator_string((SubLObject)builder_utilities.$kw136$UNIX);
        }
        if (test == builder_utilities.UNPROVIDED) {
            test = (SubLObject)builder_utilities.EQUAL;
        }
        final SubLObject new_file_set = set.new_set(test, set.set_size(file_set));
        final SubLObject set_contents_var = set.do_set_internal(file_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject file;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)builder_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); builder_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            file = set_contents.do_set_contents_next(basis_object, state);
            if (builder_utilities.NIL != set_contents.do_set_contents_element_validP(state, file)) {
                set.set_add(file_utilities.make_path_absolute_relative_to(root, file), new_file_set);
            }
        }
        return new_file_set;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 49849L)
    public static SubLObject unroot_file_set(final SubLObject file_set, SubLObject root, SubLObject test) {
        if (root == builder_utilities.UNPROVIDED) {
            root = file_utilities.path_separator_string((SubLObject)builder_utilities.$kw136$UNIX);
        }
        if (test == builder_utilities.UNPROVIDED) {
            test = (SubLObject)builder_utilities.EQUAL;
        }
        final SubLObject new_file_set = set.new_set(test, set.set_size(file_set));
        final SubLObject set_contents_var = set.do_set_internal(file_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject file;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)builder_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); builder_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            file = set_contents.do_set_contents_next(basis_object, state);
            if (builder_utilities.NIL != set_contents.do_set_contents_element_validP(state, file)) {
                set.set_add(file_utilities.make_absolute_path_relative_to(file, root), new_file_set);
            }
        }
        return new_file_set;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 50509L)
    public static SubLObject reroot_file_set(final SubLObject file_set, SubLObject old_root, SubLObject new_root, SubLObject test) {
        if (test == builder_utilities.UNPROVIDED) {
            test = (SubLObject)builder_utilities.EQUAL;
        }
        old_root = file_utilities.possibly_append_path_separator_char(old_root);
        new_root = file_utilities.possibly_append_path_separator_char(new_root);
        final SubLObject absolute_target_p = file_utilities.absolute_pathP(new_root);
        SubLObject target_root = new_root;
        final SubLObject new_file_set = set.new_set(test, set.set_size(file_set));
        SubLObject path_type = (SubLObject)builder_utilities.NIL;
        SubLObject path_string = (SubLObject)builder_utilities.NIL;
        if (builder_utilities.NIL == absolute_target_p) {
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
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)builder_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); builder_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            file = set_contents.do_set_contents_next(basis_object, state);
            if (builder_utilities.NIL != set_contents.do_set_contents_element_validP(state, file)) {
                uprooted_file = file_utilities.make_absolute_path_relative_to(file, old_root);
                rerooted_file = file_utilities.make_path_absolute_relative_to(target_root, uprooted_file);
                final_file = ((builder_utilities.NIL != absolute_target_p) ? rerooted_file : file_utilities.make_absolute_path_relative_to(rerooted_file, path_string));
                set.set_add(final_file, new_file_set);
            }
        }
        return new_file_set;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 52192L)
    public static SubLObject test_reroot_file_set(final SubLObject file_list, final SubLObject old_root, final SubLObject new_root, SubLObject test) {
        if (test == builder_utilities.UNPROVIDED) {
            test = (SubLObject)builder_utilities.EQUAL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject file_set = set_utilities.construct_set_from_list(file_list, test, (SubLObject)builder_utilities.UNPROVIDED);
        final SubLObject new_file_set = reroot_file_set(file_set, old_root, new_root, test);
        final SubLObject set_contents_var = set.do_set_internal(new_file_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject new_file;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)builder_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); builder_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            new_file = set_contents.do_set_contents_next(basis_object, state);
            if (builder_utilities.NIL != set_contents.do_set_contents_element_validP(state, new_file) && builder_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && builder_utilities.NIL == string_utilities.starts_with(new_file, new_root)) {
                Errors.error((SubLObject)builder_utilities.$str148$Rerooting_from__A_to__A_failed_an, old_root, new_root, new_file);
            }
        }
        return (SubLObject)builder_utilities.$kw149$SUCCESS;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 52649L)
    public static SubLObject serialize_kb_store_lru_information(final SubLObject directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(directory, builder_utilities.$sym14$DIRECTORY_P);
        final SubLObject message = Sequences.cconcatenate((SubLObject)builder_utilities.$str151$Serializing_LRU_information_for_K, format_nil.format_nil_a_no_copy(directory));
        final SubLObject list_var = (SubLObject)ConsesLow.list(constant_index_manager.$constant_index_manager$.getGlobalValue(), nart_index_manager.$nart_index_manager$.getGlobalValue(), nart_hl_formula_manager.$nart_hl_formula_manager$.getGlobalValue(), assertion_manager.$assertion_content_manager$.getGlobalValue(), kb_hl_support_manager.$kb_hl_support_content_manager$.getGlobalValue(), deduction_manager.$deduction_content_manager$.getGlobalValue(), unrepresented_term_index_manager.$unrepresented_term_index_manager$.getGlobalValue());
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)((builder_utilities.NIL != message) ? message : builder_utilities.$str152$cdolist), thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)builder_utilities.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)builder_utilities.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)builder_utilities.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)builder_utilities.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject kbom = (SubLObject)builder_utilities.NIL;
                kbom = csome_list_var.first();
                while (builder_utilities.NIL != csome_list_var) {
                    kb_object_manager.serialize_kbom_lru_information(kbom, directory);
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)builder_utilities.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    kbom = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)builder_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        return directory;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 53666L)
    public static SubLObject precache_kb_store_by_lru_information(final SubLObject directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(directory, builder_utilities.$sym14$DIRECTORY_P);
        final SubLObject message = Sequences.cconcatenate((SubLObject)builder_utilities.$str154$Precaching_KB_Store_with_LRU_info, format_nil.format_nil_a_no_copy(directory));
        final SubLObject list_var = (SubLObject)ConsesLow.list(constant_index_manager.$constant_index_manager$.getGlobalValue(), nart_index_manager.$nart_index_manager$.getGlobalValue(), nart_hl_formula_manager.$nart_hl_formula_manager$.getGlobalValue(), assertion_manager.$assertion_content_manager$.getGlobalValue(), kb_hl_support_manager.$kb_hl_support_content_manager$.getGlobalValue(), deduction_manager.$deduction_content_manager$.getGlobalValue(), unrepresented_term_index_manager.$unrepresented_term_index_manager$.getGlobalValue());
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)((builder_utilities.NIL != message) ? message : builder_utilities.$str152$cdolist), thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)builder_utilities.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)builder_utilities.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)builder_utilities.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)builder_utilities.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject kbom = (SubLObject)builder_utilities.NIL;
                kbom = csome_list_var.first();
                while (builder_utilities.NIL != csome_list_var) {
                    kb_object_manager.precache_kbom_by_lru_information(kbom, directory);
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)builder_utilities.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    kbom = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)builder_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        return directory;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 54635L)
    public static SubLObject set_kb_store_lru_settings(SubLObject percent, SubLObject max) {
        if (percent == builder_utilities.UNPROVIDED) {
            percent = (SubLObject)builder_utilities.$int90$100;
        }
        if (max == builder_utilities.UNPROVIDED) {
            max = Numbers.$most_positive_fixnum$.getGlobalValue();
        }
        assertion_manager.resize_assertion_content_kbom_lru(percent, max);
        constant_index_manager.resize_constant_index_kbom_lru(percent, max);
        deduction_manager.resize_deduction_content_kbom_lru(percent, max);
        nart_index_manager.resize_nart_index_kbom_lru(percent, max);
        unrepresented_term_index_manager.resize_unrepresented_term_index_kbom_lru(percent, max);
        return (SubLObject)builder_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 55023L)
    public static SubLObject set_kb_store_lru_swap_level(SubLObject n) {
        if (n == builder_utilities.UNPROVIDED) {
            n = (SubLObject)builder_utilities.TEN_INTEGER;
        }
        if (n.numL((SubLObject)builder_utilities.ONE_INTEGER)) {
            n = (SubLObject)builder_utilities.ONE_INTEGER;
        }
        assertion_manager.resize_assertion_content_kbom_lru(Numbers.multiply(n, (SubLObject)builder_utilities.$float155$0_212), Numbers.multiply(n, (SubLObject)builder_utilities.$int156$30000));
        deduction_manager.resize_deduction_content_kbom_lru(Numbers.multiply(n, (SubLObject)builder_utilities.$float155$0_212), Numbers.multiply(n, (SubLObject)builder_utilities.$int157$22000));
        constant_index_manager.resize_constant_index_kbom_lru(Numbers.multiply(n, (SubLObject)builder_utilities.$float158$0_424), Numbers.multiply(n, (SubLObject)builder_utilities.$int159$1600));
        nart_index_manager.resize_nart_index_kbom_lru(Numbers.multiply(n, (SubLObject)builder_utilities.$float155$0_212), Numbers.multiply(n, (SubLObject)builder_utilities.$int159$1600));
        unrepresented_term_index_manager.resize_unrepresented_term_index_kbom_lru(Numbers.multiply(n, (SubLObject)builder_utilities.$float155$0_212), Numbers.multiply(n, (SubLObject)builder_utilities.$int159$1600));
        kb_hl_support_manager.resize_kb_hl_support_content_kbom_lru(Numbers.multiply(n, (SubLObject)builder_utilities.$float155$0_212), Numbers.multiply(n, (SubLObject)builder_utilities.$int159$1600));
        nart_hl_formula_manager.resize_nart_hl_formula_kbom_lru(Numbers.multiply(n, (SubLObject)builder_utilities.$float155$0_212), Numbers.multiply(n, (SubLObject)builder_utilities.$int159$1600));
        return (SubLObject)builder_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 55613L)
    public static SubLObject enumerate_fact_sheets_for_kb_to_file(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = (SubLObject)builder_utilities.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)builder_utilities.NIL, thread);
                stream = compatibility.open_text(filename, (SubLObject)builder_utilities.$kw49$OUTPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)builder_utilities.$str50$Unable_to_open__S, filename);
            }
            final SubLObject s = stream;
            enumerate_fact_sheets_for_kb(s);
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)builder_utilities.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)builder_utilities.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return filename;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 55819L)
    public static SubLObject enumerate_fact_sheets_for_kb(SubLObject stream) {
        if (stream == builder_utilities.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject path_iterator = iteration.new_filter_and_transform_iterator(forts.new_forts_iterator(), (SubLObject)builder_utilities.$sym160$FACT_SHEET_PATH_FOR_TERM_FILTER_AND_TRANSFORM, (SubLObject)builder_utilities.UNPROVIDED);
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)builder_utilities.NIL; builder_utilities.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(builder_utilities.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject path = iteration.iteration_next(path_iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (builder_utilities.NIL != valid) {
                streams_high.write_string(path, stream, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
                streams_high.terpri(stream);
            }
        }
        return (SubLObject)builder_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 56317L)
    public static SubLObject fact_sheet_path_for_term_filter_and_transform(final SubLObject v_term) {
        if (builder_utilities.NIL != fact_sheets.term_ok_for_fact_sheet_p(v_term, (SubLObject)builder_utilities.UNPROVIDED)) {
            return Values.values(fact_sheets.fact_sheet_file_for_fact_sheet_term(v_term), (SubLObject)builder_utilities.T);
        }
        return Values.values((SubLObject)builder_utilities.NIL, (SubLObject)builder_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 56688L)
    public static SubLObject specify_sbhl_caching_policy_template(final SubLObject link_predicate, final SubLObject policy, final SubLObject capacity, SubLObject exempts, SubLObject prefetch) {
        if (exempts == builder_utilities.UNPROVIDED) {
            exempts = (SubLObject)builder_utilities.ZERO_INTEGER;
        }
        if (prefetch == builder_utilities.UNPROVIDED) {
            prefetch = (SubLObject)builder_utilities.ZERO_INTEGER;
        }
        return (SubLObject)ConsesLow.list(link_predicate, policy, capacity, exempts, prefetch);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 58349L)
    public static SubLObject generate_kb_sbhl_caching_policies(final SubLObject tuning_data_file, final SubLObject policies_file, SubLObject externalizedP) {
        if (externalizedP == builder_utilities.UNPROVIDED) {
            externalizedP = (SubLObject)builder_utilities.T;
        }
        final SubLObject tuning_data = cfasl_utilities.cfasl_load(tuning_data_file);
        final SubLObject policies = propose_kb_sbhl_caching_policies_from_tuning_data(tuning_data, (SubLObject)builder_utilities.UNPROVIDED);
        sbhl_caching_policies.save_sbhl_caching_policies(policies, policies_file, externalizedP);
        return policies_file;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 58885L)
    public static SubLObject generate_legacy_kb_sbhl_caching_policies(final SubLObject policies_file, SubLObject externalizedP) {
        if (externalizedP == builder_utilities.UNPROVIDED) {
            externalizedP = (SubLObject)builder_utilities.T;
        }
        final SubLObject policies = propose_legacy_kb_sbhl_caching_policies((SubLObject)builder_utilities.UNPROVIDED);
        sbhl_caching_policies.save_sbhl_caching_policies(policies, policies_file, externalizedP);
        return policies_file;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 59236L)
    public static SubLObject generate_completely_cached_kb_sbhl_caching_policies(final SubLObject policies_file, SubLObject externalizedP) {
        if (externalizedP == builder_utilities.UNPROVIDED) {
            externalizedP = (SubLObject)builder_utilities.T;
        }
        final SubLObject policies = propose_completely_cached_kb_sbhl_caching_policies((SubLObject)builder_utilities.UNPROVIDED);
        sbhl_caching_policies.save_sbhl_caching_policies(policies, policies_file, externalizedP);
        return policies_file;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 59652L)
    public static SubLObject propose_kb_sbhl_caching_policies_from_tuning_data(final SubLObject tuning_data, SubLObject templates) {
        if (templates == builder_utilities.UNPROVIDED) {
            templates = builder_utilities.$generic_sbhl_caching_policy_templates$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert builder_utilities.NIL != dictionary.dictionary_p(tuning_data) : tuning_data;
        final SubLObject default_template = Sequences.find((SubLObject)builder_utilities.$kw161$DEFAULT, templates, (SubLObject)builder_utilities.EQL, (SubLObject)builder_utilities.$sym183$FIRST, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
        if (builder_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !default_template.isCons()) {
            Errors.error((SubLObject)builder_utilities.$str184$The_templates_list__A_does_not_co, templates);
        }
        SubLObject policies = (SubLObject)builder_utilities.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tuning_data)); builder_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject link_predicate = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject ref_counts = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject policy_template = Sequences.find(link_predicate, templates, (SubLObject)builder_utilities.EQL, (SubLObject)builder_utilities.$sym183$FIRST, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
            if (builder_utilities.NIL == policy_template) {
                policy_template = default_template;
            }
            SubLObject current;
            final SubLObject datum = current = policy_template;
            SubLObject pred = (SubLObject)builder_utilities.NIL;
            SubLObject policy = (SubLObject)builder_utilities.NIL;
            SubLObject capacity = (SubLObject)builder_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)builder_utilities.$list185);
            pred = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)builder_utilities.$list185);
            policy = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)builder_utilities.$list185);
            capacity = current.first();
            current = current.rest();
            final SubLObject exempt = (SubLObject)(current.isCons() ? current.first() : builder_utilities.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)builder_utilities.$list185);
            current = current.rest();
            final SubLObject prefetch = (SubLObject)(current.isCons() ? current.first() : builder_utilities.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)builder_utilities.$list185);
            current = current.rest();
            if (builder_utilities.NIL == current) {
                final SubLObject terms = sbhl_caching_policies.recommend_sbhl_caching_preference_term_list_from_ref_counts(ref_counts, sbhl_module_vars.get_sbhl_module(link_predicate));
                final SubLObject caching_policy = sbhl_caching_policies.create_sbhl_caching_policy_from_term_recommendation_list(link_predicate, policy, capacity, terms, exempt, prefetch);
                policies = (SubLObject)ConsesLow.cons(caching_policy, policies);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)builder_utilities.$list185);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return policies;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 61224L)
    public static SubLObject propose_completely_cached_kb_sbhl_caching_policies(SubLObject link_predicates) {
        if (link_predicates == builder_utilities.UNPROVIDED) {
            link_predicates = (SubLObject)builder_utilities.NIL;
        }
        return propose_all_sticky_kb_sbhl_caching_policies(link_predicates, (SubLObject)builder_utilities.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 61611L)
    public static SubLObject propose_legacy_kb_sbhl_caching_policies(SubLObject link_predicates) {
        if (link_predicates == builder_utilities.UNPROVIDED) {
            link_predicates = (SubLObject)builder_utilities.NIL;
        }
        return propose_all_sticky_kb_sbhl_caching_policies(link_predicates, (SubLObject)builder_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 62005L)
    public static SubLObject get_all_sbhl_module_link_predicates() {
        SubLObject link_predicates = (SubLObject)builder_utilities.NIL;
        SubLObject cdolist_list_var = sbhl_module_vars.get_sbhl_modules();
        SubLObject cons = (SubLObject)builder_utilities.NIL;
        cons = cdolist_list_var.first();
        while (builder_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = (SubLObject)builder_utilities.NIL;
            SubLObject module = (SubLObject)builder_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)builder_utilities.$list186);
            key = current.first();
            current = (module = current.rest());
            link_predicates = (SubLObject)ConsesLow.cons(sbhl_module_vars.get_sbhl_module_link_pred(module), link_predicates);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return link_predicates;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 62286L)
    public static SubLObject propose_all_sticky_kb_sbhl_caching_policies(SubLObject link_predicates, final SubLObject with_prefetch_p) {
        if (builder_utilities.NIL == link_predicates) {
            link_predicates = get_all_sbhl_module_link_predicates();
        }
        final SubLObject prefetch = (SubLObject)((builder_utilities.NIL != with_prefetch_p) ? builder_utilities.$kw84$ALL : builder_utilities.NIL);
        SubLObject policies = (SubLObject)builder_utilities.NIL;
        SubLObject cdolist_list_var = link_predicates;
        SubLObject link_predicate = (SubLObject)builder_utilities.NIL;
        link_predicate = cdolist_list_var.first();
        while (builder_utilities.NIL != cdolist_list_var) {
            final SubLObject legacy_policy = sbhl_caching_policies.create_sbhl_caching_policy_from_term_recommendation_list(link_predicate, (SubLObject)builder_utilities.$kw162$STICKY, (SubLObject)builder_utilities.$kw163$UNDEFINED, (SubLObject)builder_utilities.NIL, (SubLObject)builder_utilities.$kw84$ALL, prefetch);
            policies = (SubLObject)ConsesLow.cons(legacy_policy, policies);
            cdolist_list_var = cdolist_list_var.rest();
            link_predicate = cdolist_list_var.first();
        }
        return Sequences.nreverse(policies);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 64067L)
    public static SubLObject start_recording_sbhl_cache_tuning_data() {
        sbhl_cache_tuning_data_gathering_prologue();
        sbhl_cache_tuning_experiment_prologue();
        return (SubLObject)builder_utilities.$kw187$RECORDING;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 64506L)
    public static SubLObject stop_recording_sbhl_cache_tuning_data(final SubLObject data_file) {
        final SubLObject state = dictionary.new_dictionary((SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
        sbhl_cache_tuning_experiment_epilogue(state);
        sbhl_cache_tuning_data_gathering_generate_report(data_file, state);
        sbhl_cache_tuning_data_gathering_epilogue();
        return data_file;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 65221L)
    public static SubLObject gather_data_for_sbhl_cache_tuning(final SubLObject filename) {
        final SubLObject state = dictionary.new_dictionary((SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
        SubLObject failed_contributions = (SubLObject)builder_utilities.NIL;
        sbhl_cache_tuning_data_gathering_prologue();
        failed_contributions = run_sbhl_cache_tuning_data_gathering(state);
        sbhl_cache_tuning_data_gathering_generate_report(filename, state);
        sbhl_cache_tuning_data_gathering_epilogue();
        return Values.values(filename, failed_contributions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 66087L)
    public static SubLObject run_sbhl_cache_tuning_data_gathering(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject failed_contributions = (SubLObject)builder_utilities.NIL;
        if (builder_utilities.NIL != list_utilities.sublisp_boolean(builder_utilities.$cyc_tests_to_use_for_sbhl_cache_tuning$.getDynamicValue(thread))) {
            SubLObject failures = (SubLObject)builder_utilities.NIL;
            final SubLObject list_var = builder_utilities.$cyc_tests_to_use_for_sbhl_cache_tuning$.getDynamicValue(thread);
            final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)builder_utilities.$str188$Gathering_SBHL_cache_tuning_data_, thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)builder_utilities.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)builder_utilities.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)builder_utilities.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)builder_utilities.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject test_name = (SubLObject)builder_utilities.NIL;
                    test_name = csome_list_var.first();
                    while (builder_utilities.NIL != csome_list_var) {
                        SubLObject msg = (SubLObject)builder_utilities.NIL;
                        try {
                            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                            final SubLObject _prev_bind_0_$18 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind((SubLObject)builder_utilities.$sym189$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                try {
                                    sbhl_cache_tuning_experiment_prologue();
                                    cyc_testing_utilities.run_cyc_test_int(test_name, (SubLObject)builder_utilities.$kw70$SILENT, (SubLObject)builder_utilities.NIL, (SubLObject)builder_utilities.NIL, (SubLObject)builder_utilities.$kw110$STANDARD, StreamsLow.$null_output$.getDynamicValue(thread), cyc_testing.$run_tiny_kb_tests_in_full_kbP$.getDynamicValue(thread));
                                    sbhl_cache_tuning_experiment_epilogue(state);
                                }
                                catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, (SubLObject)builder_utilities.NIL);
                                }
                            }
                            finally {
                                Errors.$error_handler$.rebind(_prev_bind_0_$18, thread);
                            }
                        }
                        catch (Throwable ccatch_env_var) {
                            msg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                        }
                        finally {
                            thread.throwStack.pop();
                        }
                        if (msg.isString()) {
                            failures = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(test_name, msg), failures);
                        }
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)builder_utilities.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        test_name = csome_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)builder_utilities.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
            }
            if (builder_utilities.NIL != list_utilities.sublisp_boolean(failures)) {
                failed_contributions = conses_high.putf(failed_contributions, (SubLObject)builder_utilities.$kw190$CYC_TESTS, failures);
            }
        }
        if (builder_utilities.NIL != list_utilities.sublisp_boolean(builder_utilities.$kb_queries_to_use_for_sbhl_cache_tuning$.getDynamicValue(thread))) {
            SubLObject failures = (SubLObject)builder_utilities.NIL;
            final SubLObject list_var = builder_utilities.$kb_queries_to_use_for_sbhl_cache_tuning$.getDynamicValue(thread);
            final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)builder_utilities.$str191$Gathering_SBHL_cache_tuning_data_, thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)builder_utilities.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)builder_utilities.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)builder_utilities.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)builder_utilities.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject kbq = (SubLObject)builder_utilities.NIL;
                    kbq = csome_list_var.first();
                    while (builder_utilities.NIL != csome_list_var) {
                        failures = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(kbq, (SubLObject)builder_utilities.$str192$KBQ_Support_currently_not_impleme), failures);
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)builder_utilities.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        kbq = csome_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)builder_utilities.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
            }
            if (builder_utilities.NIL != list_utilities.sublisp_boolean(failures)) {
                failed_contributions = conses_high.putf(failed_contributions, (SubLObject)builder_utilities.$kw193$KB_QUERIES, failures);
            }
        }
        if (builder_utilities.NIL != list_utilities.sublisp_boolean(builder_utilities.$run_cyclops_for_sbhl_cache_tuningP$.getDynamicValue(thread))) {
            SubLObject failures = (SubLObject)builder_utilities.NIL;
            final SubLObject _prev_bind_9 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_10 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_11 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_12 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_13 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_14 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_15 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_16 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)builder_utilities.$str194$Gathering_SBHL_cache_tuning_data_, thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind((SubLObject)builder_utilities.ONE_INTEGER, thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)builder_utilities.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)builder_utilities.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)builder_utilities.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)builder_utilities.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject counter;
                    SubLObject msg2;
                    SubLObject _prev_bind_0_$21;
                    for (counter = (SubLObject)builder_utilities.NIL, counter = (SubLObject)builder_utilities.ZERO_INTEGER; counter.numL(utilities_macros.$progress_total$.getDynamicValue(thread)); counter = Numbers.add(counter, (SubLObject)builder_utilities.ONE_INTEGER)) {
                        msg2 = (SubLObject)builder_utilities.NIL;
                        try {
                            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                            _prev_bind_0_$21 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind((SubLObject)builder_utilities.$sym189$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                try {
                                    sbhl_cache_tuning_experiment_prologue();
                                    system_benchmarks.benchmark_cyclops_compensating_for_paging((SubLObject)builder_utilities.ZERO_INTEGER, (SubLObject)builder_utilities.ONE_INTEGER, (SubLObject)builder_utilities.SIX_INTEGER, StreamsLow.$null_output$.getDynamicValue(thread));
                                    sbhl_cache_tuning_experiment_epilogue(state);
                                }
                                catch (Throwable catch_var2) {
                                    Errors.handleThrowable(catch_var2, (SubLObject)builder_utilities.NIL);
                                }
                            }
                            finally {
                                Errors.$error_handler$.rebind(_prev_bind_0_$21, thread);
                            }
                        }
                        catch (Throwable ccatch_env_var2) {
                            msg2 = Errors.handleThrowable(ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                        }
                        finally {
                            thread.throwStack.pop();
                        }
                        if (msg2.isString()) {
                            failures = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)builder_utilities.$kw195$CYCLOPS, msg2), failures);
                        }
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)builder_utilities.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$22 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)builder_utilities.T, thread);
                        final SubLObject _values3 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values3);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_16, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_15, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_14, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_13, thread);
                utilities_macros.$progress_sofar$.rebind(_prev_bind_12, thread);
                utilities_macros.$progress_total$.rebind(_prev_bind_11, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_10, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_9, thread);
            }
            if (builder_utilities.NIL != list_utilities.sublisp_boolean(failures)) {
                failed_contributions = conses_high.putf(failed_contributions, (SubLObject)builder_utilities.$kw195$CYCLOPS, failures);
            }
        }
        return failed_contributions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 68309L)
    public static SubLObject sbhl_cache_tuning_data_gathering_prologue() {
        return sbhl_caching_policies.setup_sbhl_graphs_for_sbhl_cache_tuning_data_gathering();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 68549L)
    public static SubLObject sbhl_cache_tuning_experiment_prologue() {
        return sbhl_caching_policies.setup_sbhl_graphs_for_sbhl_cache_tuning_experiment();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 68823L)
    public static SubLObject sbhl_cache_tuning_experiment_epilogue(final SubLObject state) {
        return sbhl_caching_policies.tear_down_sbhl_graphs_for_sbhl_cache_tuning_experiment(state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 69136L)
    public static SubLObject sbhl_cache_tuning_data_gathering_generate_report(final SubLObject filename, final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = (SubLObject)builder_utilities.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)builder_utilities.NIL, thread);
                stream = compatibility.open_binary(filename, (SubLObject)builder_utilities.$kw49$OUTPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)builder_utilities.$str50$Unable_to_open__S, filename);
            }
            final SubLObject s = stream;
            sbhl_caching_policies.contribute_sbhl_graphs_data_for_sbhl_cache_tuning_experiment(s, state);
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)builder_utilities.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)builder_utilities.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return filename;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 69585L)
    public static SubLObject sbhl_cache_tuning_data_gathering_epilogue() {
        return sbhl_caching_policies.tear_down_sbhl_graphs_for_sbhl_cache_tuning_data_gathering();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 69814L)
    public static SubLObject compile_kb_snapshot_statistics(SubLObject directory) {
        if (directory == builder_utilities.UNPROVIDED) {
            directory = misc_utilities.generic_caches_directory();
        }
        final SubLObject result_map = gather_kb_snapshot_statistics(directory, (SubLObject)builder_utilities.UNPROVIDED);
        SubLObject statistics = (SubLObject)builder_utilities.NIL;
        SubLObject cdolist_list_var = dumper.get_kb_units_file_vector_categories();
        SubLObject category = (SubLObject)builder_utilities.NIL;
        category = cdolist_list_var.first();
        while (builder_utilities.NIL != cdolist_list_var) {
            final SubLObject result = map_utilities.map_get(result_map, category, (SubLObject)builder_utilities.UNPROVIDED);
            final SubLObject edits = map_utilities.map_get(result, (SubLObject)builder_utilities.$kw197$REVERSAL, (SubLObject)builder_utilities.ZERO_INTEGER);
            final SubLObject deletes = map_utilities.map_get(result, (SubLObject)builder_utilities.$kw198$TOMBSTONE, (SubLObject)builder_utilities.ZERO_INTEGER);
            final SubLObject entries = map_utilities.map_get(result, (SubLObject)builder_utilities.$kw199$INDEX_ENTRIES, (SubLObject)builder_utilities.ZERO_INTEGER);
            final SubLObject data_bytes = map_utilities.map_get(result, (SubLObject)builder_utilities.$kw200$DATA_BYTES, (SubLObject)builder_utilities.ZERO_INTEGER);
            statistics = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(new SubLObject[] { builder_utilities.$str201$category, category, builder_utilities.$str202$numOfEdits, edits, builder_utilities.$str203$numOfDeletes, deletes, builder_utilities.$str204$numOfEntries, entries, builder_utilities.$str205$numOfBytes, data_bytes, builder_utilities.$str206$fragBytes, builder_utilities.MINUS_ONE_INTEGER }), statistics);
            cdolist_list_var = cdolist_list_var.rest();
            category = cdolist_list_var.first();
        }
        return Sequences.reverse(statistics);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 70910L)
    public static SubLObject gather_kb_snapshot_statistics(final SubLObject directory, SubLObject result_map) {
        if (result_map == builder_utilities.UNPROVIDED) {
            result_map = (SubLObject)builder_utilities.NIL;
        }
        if (builder_utilities.NIL == result_map) {
            result_map = dictionary.new_dictionary((SubLObject)builder_utilities.EQUAL, (SubLObject)builder_utilities.UNPROVIDED);
        }
        SubLObject cdolist_list_var = dumper.get_kb_units_file_vector_categories();
        SubLObject fvector_label = (SubLObject)builder_utilities.NIL;
        fvector_label = cdolist_list_var.first();
        while (builder_utilities.NIL != cdolist_list_var) {
            map_utilities.map_put(result_map, fvector_label, (SubLObject)builder_utilities.$kw208$IN_PROGRESS);
            cdolist_list_var = cdolist_list_var.rest();
            fvector_label = cdolist_list_var.first();
        }
        cdolist_list_var = dumper.get_kb_units_file_vector_descriptions();
        SubLObject fvector_detail = (SubLObject)builder_utilities.NIL;
        fvector_detail = cdolist_list_var.first();
        while (builder_utilities.NIL != cdolist_list_var) {
            final SubLObject current;
            final SubLObject datum = current = fvector_detail;
            SubLObject allow_other_keys_p = (SubLObject)builder_utilities.NIL;
            SubLObject rest = current;
            SubLObject bad = (SubLObject)builder_utilities.NIL;
            SubLObject current_$23 = (SubLObject)builder_utilities.NIL;
            while (builder_utilities.NIL != rest) {
                cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)builder_utilities.$list209);
                current_$23 = rest.first();
                rest = rest.rest();
                cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)builder_utilities.$list209);
                if (builder_utilities.NIL == conses_high.member(current_$23, (SubLObject)builder_utilities.$list210, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED)) {
                    bad = (SubLObject)builder_utilities.T;
                }
                if (current_$23 == builder_utilities.$kw211$ALLOW_OTHER_KEYS) {
                    allow_other_keys_p = rest.first();
                }
                rest = rest.rest();
            }
            if (builder_utilities.NIL != bad && builder_utilities.NIL == allow_other_keys_p) {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)builder_utilities.$list209);
            }
            final SubLObject data_file_tail = cdestructuring_bind.property_list_member((SubLObject)builder_utilities.$kw212$DATA_FILE, current);
            final SubLObject data_file = (SubLObject)((builder_utilities.NIL != data_file_tail) ? conses_high.cadr(data_file_tail) : builder_utilities.NIL);
            final SubLObject index_file_tail = cdestructuring_bind.property_list_member((SubLObject)builder_utilities.$kw213$INDEX_FILE, current);
            final SubLObject index_file = (SubLObject)((builder_utilities.NIL != index_file_tail) ? conses_high.cadr(index_file_tail) : builder_utilities.NIL);
            final SubLObject type_tail = cdestructuring_bind.property_list_member((SubLObject)builder_utilities.$kw214$TYPE, current);
            final SubLObject type = (SubLObject)((builder_utilities.NIL != type_tail) ? conses_high.cadr(type_tail) : builder_utilities.NIL);
            final SubLObject complex_data_file_tail = cdestructuring_bind.property_list_member((SubLObject)builder_utilities.$kw215$COMPLEX_DATA_FILE, current);
            final SubLObject complex_data_file = (SubLObject)((builder_utilities.NIL != complex_data_file_tail) ? conses_high.cadr(complex_data_file_tail) : builder_utilities.NIL);
            final SubLObject complex_index_file_tail = cdestructuring_bind.property_list_member((SubLObject)builder_utilities.$kw216$COMPLEX_INDEX_FILE, current);
            final SubLObject complex_index_file = (SubLObject)((builder_utilities.NIL != complex_index_file_tail) ? conses_high.cadr(complex_index_file_tail) : builder_utilities.NIL);
            final SubLObject pcase_var = type;
            if (pcase_var.eql((SubLObject)builder_utilities.$kw217$KNOWLEDGE)) {
                gather_one_kb_snapshot_statistic(result_map, data_file, index_file, directory);
            }
            else if (pcase_var.eql((SubLObject)builder_utilities.$kw218$INDEXING)) {
                gather_one_kb_snapshot_statistic(result_map, data_file, index_file, directory);
                gather_one_kb_snapshot_statistic(result_map, complex_data_file, complex_index_file, directory);
            }
            else {
                Errors.error((SubLObject)builder_utilities.$str219$Unsupported_file_vector_type__A__, type);
            }
            cdolist_list_var = cdolist_list_var.rest();
            fvector_detail = cdolist_list_var.first();
        }
        return result_map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 72179L)
    public static SubLObject gather_one_kb_snapshot_statistic(final SubLObject result_map, final SubLObject data_file, final SubLObject index_file, final SubLObject directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject data_file_path = dumper.kb_dump_file(data_file, directory, (SubLObject)builder_utilities.UNPROVIDED);
        final SubLObject index_file_path = dumper.kb_dump_file(index_file, directory, (SubLObject)builder_utilities.UNPROVIDED);
        SubLObject error_msg = (SubLObject)builder_utilities.NIL;
        SubLObject stats = (SubLObject)builder_utilities.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)builder_utilities.$sym189$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    stats = file_vector.gather_file_vector_statistics_for_filenames(data_file_path, index_file_path);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)builder_utilities.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_msg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (error_msg.isString()) {
            map_utilities.map_put(result_map, data_file, error_msg);
        }
        else {
            map_utilities.map_put(result_map, data_file, stats);
        }
        return result_map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 72705L)
    public static SubLObject track_kb_snapshot_statistics(final SubLObject directory, SubLObject pollsecs) {
        if (pollsecs == builder_utilities.UNPROVIDED) {
            pollsecs = (SubLObject)builder_utilities.TEN_INTEGER;
        }
        final SubLObject categories = dumper.get_kb_units_file_vector_categories();
        final SubLObject result_map = dictionary_utilities.new_synchronized_dictionary((SubLObject)builder_utilities.EQUAL, Sequences.length(categories));
        SubLObject doneP = (SubLObject)builder_utilities.NIL;
        subl_promotions.make_process_with_args((SubLObject)builder_utilities.$str221$GATHER_KB_SNAPSHOT_STATISTICS, (SubLObject)builder_utilities.$sym207$GATHER_KB_SNAPSHOT_STATISTICS, (SubLObject)ConsesLow.list(directory, result_map));
        while (builder_utilities.NIL == doneP) {
            PrintLow.format((SubLObject)builder_utilities.T, (SubLObject)builder_utilities.$str222$__Check_at__A_______, numeric_date_utilities.timestring((SubLObject)builder_utilities.UNPROVIDED));
            doneP = (SubLObject)builder_utilities.T;
            SubLObject cdolist_list_var = dumper.get_kb_units_file_vector_categories();
            SubLObject category = (SubLObject)builder_utilities.NIL;
            category = cdolist_list_var.first();
            while (builder_utilities.NIL != cdolist_list_var) {
                final SubLObject result = map_utilities.map_get(result_map, category, (SubLObject)builder_utilities.$kw208$IN_PROGRESS);
                if (builder_utilities.$kw208$IN_PROGRESS == result) {
                    PrintLow.format((SubLObject)builder_utilities.T, (SubLObject)builder_utilities.$str223$_A_____in_progress__, category);
                    doneP = (SubLObject)builder_utilities.NIL;
                }
                else if (result.isString()) {
                    PrintLow.format((SubLObject)builder_utilities.T, (SubLObject)builder_utilities.$str224$_A_____errored___A___, category, result);
                }
                else if (builder_utilities.NIL != map_utilities.map_p(result)) {
                    PrintLow.format((SubLObject)builder_utilities.T, (SubLObject)builder_utilities.$str225$_A___A_edits___A_deletes___A_entr, new SubLObject[] { category, map_utilities.map_get(result, (SubLObject)builder_utilities.$kw197$REVERSAL, (SubLObject)builder_utilities.ZERO_INTEGER), map_utilities.map_get(result, (SubLObject)builder_utilities.$kw198$TOMBSTONE, (SubLObject)builder_utilities.ZERO_INTEGER), map_utilities.map_get(result, (SubLObject)builder_utilities.$kw199$INDEX_ENTRIES, (SubLObject)builder_utilities.ZERO_INTEGER), map_utilities.map_get(result, (SubLObject)builder_utilities.$kw200$DATA_BYTES, (SubLObject)builder_utilities.ZERO_INTEGER) });
                }
                else {
                    Errors.error((SubLObject)builder_utilities.$str226$Unknown_category__A_____dont_know, category);
                }
                cdolist_list_var = cdolist_list_var.rest();
                category = cdolist_list_var.first();
            }
            if (builder_utilities.NIL == doneP) {
                streams_high.force_output((SubLObject)builder_utilities.T);
                Threads.sleep(pollsecs);
            }
        }
        return result_map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 74261L)
    public static SubLObject get_kb_mini_dump_timestamp() {
        return Time.get_universal_time();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 74855L)
    public static SubLObject prepare_kb_mini_dump() {
        operation_communication.set_receive_state((SubLObject)builder_utilities.$str41$no);
        SubLObject cdolist_list_var = tcp_server_utilities.all_tcp_servers();
        SubLObject tcp_server = (SubLObject)builder_utilities.NIL;
        tcp_server = cdolist_list_var.first();
        while (builder_utilities.NIL != cdolist_list_var) {
            final SubLObject type = tcp_server_utilities.tcp_server_type(tcp_server);
            if (builder_utilities.$kw229$CYC_API != type) {
                tcp_server_utilities.disable_tcp_server(type);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tcp_server = cdolist_list_var.first();
        }
        while (builder_utilities.NIL != agenda.agenda_busyP()) {
            Threads.sleep((SubLObject)builder_utilities.ONE_INTEGER);
        }
        return (SubLObject)builder_utilities.$kw149$SUCCESS;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 75377L)
    public static SubLObject perform_kb_mini_dump(final SubLObject units_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject curr_kb = control_vars.kb_loaded();
        SubLObject msg = (SubLObject)builder_utilities.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)builder_utilities.$sym189$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    control_vars.set_kb_loaded(Numbers.subtract(curr_kb, (SubLObject)builder_utilities.ONE_INTEGER));
                    dumper.dump_kb(units_path);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)builder_utilities.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            msg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (msg.isString()) {
            Errors.warn((SubLObject)builder_utilities.$str231$Error_while_performing_mini_dump_, msg);
            control_vars.set_kb_loaded(curr_kb);
            return Values.values((SubLObject)builder_utilities.$kw232$ERROR, msg);
        }
        mark_kb_mini_dump_as_successful(units_path);
        return operation_communication.halt_cyc_image((SubLObject)builder_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 75964L)
    public static SubLObject launch_asynchronous_kb_mini_dump(final SubLObject units_path) {
        return subl_promotions.make_process_with_args((SubLObject)builder_utilities.$str234$Mini_KB_Dumper, (SubLObject)builder_utilities.$sym230$PERFORM_KB_MINI_DUMP, (SubLObject)ConsesLow.list(units_path));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 76322L)
    public static SubLObject mark_kb_mini_dump_as_successful(final SubLObject units_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dump_finished_file = Sequences.cconcatenate(units_path, (SubLObject)builder_utilities.$str235$mini_dump_finished_text);
        SubLObject stream = (SubLObject)builder_utilities.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)builder_utilities.NIL, thread);
                stream = compatibility.open_text(dump_finished_file, (SubLObject)builder_utilities.$kw49$OUTPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)builder_utilities.$str50$Unable_to_open__S, dump_finished_file);
            }
            final SubLObject s = stream;
            streams_high.write_string(numeric_date_utilities.timestring((SubLObject)builder_utilities.UNPROVIDED), s, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)builder_utilities.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)builder_utilities.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return units_path;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 77073L)
    public static SubLObject build_process_worker_count() {
        return builder_utilities.$build_process_worker_count$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 77216L)
    public static SubLObject set_build_process_worker_count(final SubLObject workers) {
        enforceType(workers, builder_utilities.$sym66$NON_NEGATIVE_INTEGER_P);
        final SubLObject old = builder_utilities.$build_process_worker_count$.getGlobalValue();
        builder_utilities.$build_process_worker_count$.setGlobalValue(workers);
        return old;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 77491L)
    public static SubLObject build_process_parallelism_permittedP() {
        return Numbers.numGE(build_process_worker_count(), (SubLObject)builder_utilities.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 77965L)
    public static SubLObject with_allowed_obfuscation_namespace_support(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)builder_utilities.$sym240$CLET, (SubLObject)builder_utilities.$list241, ConsesLow.append(body, (SubLObject)builder_utilities.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 78171L)
    public static SubLObject with_allowed_obfuscation_namespace(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)builder_utilities.$list243);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject namespace = (SubLObject)builder_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)builder_utilities.$list243);
        namespace = current.first();
        current = current.rest();
        if (builder_utilities.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)builder_utilities.$sym240$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)builder_utilities.$sym244$_ALLOWED_OBFUSCATION_NAME_SPACES_, (SubLObject)ConsesLow.listS((SubLObject)builder_utilities.$sym245$CONS, namespace, (SubLObject)builder_utilities.$list246))), ConsesLow.append(body, (SubLObject)builder_utilities.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)builder_utilities.$list243);
        return (SubLObject)builder_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 78442L)
    public static SubLObject allowed_obfuscation_namespace_constantP(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject namespace = constants_high.constant_namespace(constant);
        return (SubLObject)SubLObjectFactory.makeBoolean(builder_utilities.NIL != Strings.stringE((SubLObject)builder_utilities.$str248$cyc, namespace, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED) || builder_utilities.NIL != subl_promotions.memberP(namespace, builder_utilities.$allowed_obfuscation_name_spaces$.getDynamicValue(thread), (SubLObject)builder_utilities.EQUAL, (SubLObject)builder_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 78763L)
    public static SubLObject un_obfuscatable_constantP(final SubLObject constant) {
        return (SubLObject)SubLObjectFactory.makeBoolean(builder_utilities.NIL != constant_completion.constant_mentioned_in_codeP(constant) || builder_utilities.NIL == allowed_obfuscation_namespace_constantP(constant));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 79496L)
    public static SubLObject with_constant_obfuscation(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)builder_utilities.$list251);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject function = (SubLObject)builder_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)builder_utilities.$list251);
        function = current.first();
        current = current.rest();
        final SubLObject state = (SubLObject)(current.isCons() ? current.first() : builder_utilities.$kw252$UNPROVIDED);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)builder_utilities.$list251);
        current = current.rest();
        if (builder_utilities.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject state_val = (SubLObject)builder_utilities.$sym253$STATE_VAL;
            return (SubLObject)ConsesLow.list((SubLObject)builder_utilities.$sym240$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(state_val, state)), (SubLObject)ConsesLow.list((SubLObject)builder_utilities.$sym240$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)builder_utilities.$sym254$_CONSTANT_OBFUSCATION_NAME_GENERATOR_STATE_, (SubLObject)ConsesLow.list((SubLObject)builder_utilities.$sym245$CONS, function, state_val))), (SubLObject)ConsesLow.listS((SubLObject)builder_utilities.$sym255$WITH_CONSTANT_NAME_OBFUSCATION, (SubLObject)builder_utilities.$list256, ConsesLow.append(body, (SubLObject)builder_utilities.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)builder_utilities.$list251);
        return (SubLObject)builder_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 80079L)
    public static SubLObject obfuscate_constant_name_via_generator_fn(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = builder_utilities.$constant_obfuscation_name_generator_state$.getDynamicValue(thread);
        SubLObject generator = (SubLObject)builder_utilities.NIL;
        SubLObject state = (SubLObject)builder_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)builder_utilities.$list258);
        generator = current.first();
        current = (state = current.rest());
        return obfuscate_constant_name_via_generator_function(constant, generator, state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 80329L)
    public static SubLObject obfuscate_constant_name_via_generator_function(final SubLObject constant, final SubLObject generator, final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject map = builder_utilities.$constant_obfuscation_cache$.getDynamicValue(thread);
        SubLObject obfuscated_name = (SubLObject)((builder_utilities.NIL != map_utilities.map_p(map)) ? map_utilities.map_get(map, constant, (SubLObject)builder_utilities.$kw259$NOT_FOUND) : builder_utilities.NIL);
        if (!obfuscated_name.isString()) {
            if (builder_utilities.NIL != un_obfuscatable_constantP(constant)) {
                obfuscated_name = constants_high.constant_name(constant);
            }
            else {
                obfuscated_name = ((builder_utilities.$kw252$UNPROVIDED == state) ? Functions.funcall(generator, constant) : Functions.funcall(generator, constant, state));
                for (SubLObject counter = (SubLObject)builder_utilities.ZERO_INTEGER, original_guess = obfuscated_name; builder_utilities.NIL != constant_handles.constant_p(constants_high.find_constant(obfuscated_name)); obfuscated_name = Sequences.cconcatenate(format_nil.format_nil_a_no_copy(original_guess), new SubLObject[] { builder_utilities.$str260$_, format_nil.format_nil_d_no_copy(counter) })) {
                    counter = Numbers.add(counter, (SubLObject)builder_utilities.ONE_INTEGER);
                }
                if (builder_utilities.NIL != map_utilities.map_p(map)) {
                    map_utilities.map_put(map, constant, obfuscated_name);
                }
            }
        }
        return obfuscated_name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 81416L)
    public static SubLObject new_constant_obfuscation_cache() {
        return Hashtables.make_hash_table(constant_handles.constant_count(), hash_table_utilities.to_hash_test((SubLObject)builder_utilities.$sym263$KBEQ), (SubLObject)builder_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 81582L)
    public static SubLObject with_cached_constant_obfuscation(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)builder_utilities.$list251);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject function = (SubLObject)builder_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)builder_utilities.$list251);
        function = current.first();
        current = current.rest();
        final SubLObject state = (SubLObject)(current.isCons() ? current.first() : builder_utilities.$kw252$UNPROVIDED);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)builder_utilities.$list251);
        current = current.rest();
        if (builder_utilities.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)builder_utilities.$sym240$CLET, (SubLObject)builder_utilities.$list264, (SubLObject)ConsesLow.listS((SubLObject)builder_utilities.$sym250$WITH_CONSTANT_OBFUSCATION, (SubLObject)ConsesLow.list(function, state), ConsesLow.append(body, (SubLObject)builder_utilities.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)builder_utilities.$list251);
        return (SubLObject)builder_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 82159L)
    public static SubLObject make_obfuscation_gensym_state(SubLObject upcase_prefix, SubLObject downcase_prefix) {
        if (upcase_prefix == builder_utilities.UNPROVIDED) {
            upcase_prefix = (SubLObject)builder_utilities.$str266$C;
        }
        if (downcase_prefix == builder_utilities.UNPROVIDED) {
            downcase_prefix = (SubLObject)builder_utilities.NIL;
        }
        if (!downcase_prefix.isString()) {
            downcase_prefix = Strings.string_downcase(upcase_prefix, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
        }
        return (SubLObject)ConsesLow.list((SubLObject)builder_utilities.$kw267$ISG, integer_sequence_generator.new_integer_sequence_generator((SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED), (SubLObject)builder_utilities.$kw268$UPCASE, upcase_prefix, (SubLObject)builder_utilities.$kw269$DOWNCASE, downcase_prefix);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 82518L)
    public static SubLObject obfuscate_constant_name_gensym(final SubLObject constant, final SubLObject state) {
        SubLObject allow_other_keys_p = (SubLObject)builder_utilities.NIL;
        SubLObject rest = state;
        SubLObject bad = (SubLObject)builder_utilities.NIL;
        SubLObject current_$24 = (SubLObject)builder_utilities.NIL;
        while (builder_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, state, (SubLObject)builder_utilities.$list271);
            current_$24 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, state, (SubLObject)builder_utilities.$list271);
            if (builder_utilities.NIL == conses_high.member(current_$24, (SubLObject)builder_utilities.$list272, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED)) {
                bad = (SubLObject)builder_utilities.T;
            }
            if (current_$24 == builder_utilities.$kw211$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (builder_utilities.NIL != bad && builder_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)builder_utilities.$list271);
        }
        final SubLObject isg_tail = cdestructuring_bind.property_list_member((SubLObject)builder_utilities.$kw267$ISG, state);
        final SubLObject isg = (SubLObject)((builder_utilities.NIL != isg_tail) ? conses_high.cadr(isg_tail) : builder_utilities.NIL);
        final SubLObject upcase_tail = cdestructuring_bind.property_list_member((SubLObject)builder_utilities.$kw268$UPCASE, state);
        final SubLObject upcase = (SubLObject)((builder_utilities.NIL != upcase_tail) ? conses_high.cadr(upcase_tail) : builder_utilities.NIL);
        final SubLObject downcase_tail = cdestructuring_bind.property_list_member((SubLObject)builder_utilities.$kw269$DOWNCASE, state);
        final SubLObject downcase = (SubLObject)((builder_utilities.NIL != downcase_tail) ? conses_high.cadr(downcase_tail) : builder_utilities.NIL);
        final SubLObject prefix = (builder_utilities.NIL != Characters.upper_case_p(Strings.sublisp_char(constants_high.constant_name(constant), (SubLObject)builder_utilities.ZERO_INTEGER))) ? upcase : downcase;
        final SubLObject id = integer_sequence_generator.integer_sequence_generator_next(isg);
        return Sequences.cconcatenate(format_nil.format_nil_a_no_copy(prefix), new SubLObject[] { builder_utilities.$str260$_, format_nil.format_nil_d_no_copy(id) });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 82862L)
    public static SubLObject obfuscate_and_dump_essential_kb(final SubLObject dump_dir, final SubLObject assertion_fn, final SubLObject nart_fn, final SubLObject constant_fn, SubLObject constant_state) {
        if (constant_state == builder_utilities.UNPROVIDED) {
            constant_state = (SubLObject)builder_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(dump_dir, builder_utilities.$sym14$DIRECTORY_P);
        SubLObject changedP = (SubLObject)builder_utilities.NIL;
        try {
            thread.resetMultipleValues();
            final SubLObject assertion_targets = determine_obfuscation_candidates((SubLObject)builder_utilities.UNPROVIDED);
            final SubLObject nart_targets = thread.secondMultipleValue();
            thread.resetMultipleValues();
            try {
                apply_assertion_obfuscations(determine_assertion_obfuscations(assertion_targets, assertion_fn, (SubLObject)builder_utilities.UNPROVIDED), (SubLObject)builder_utilities.$str274$Obfuscating_strings_in_Assertions);
                apply_assertion_obfuscations(determine_nart_obfuscations(nart_targets, nart_fn, (SubLObject)builder_utilities.UNPROVIDED), (SubLObject)builder_utilities.$str275$Obfuscating_strings_in_NARTs);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)builder_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    changedP = (SubLObject)builder_utilities.T;
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
            final SubLObject _prev_bind_2 = builder_utilities.$constant_obfuscation_cache$.currentBinding(thread);
            try {
                builder_utilities.$constant_obfuscation_cache$.bind(new_constant_obfuscation_cache(), thread);
                final SubLObject state_val = constant_state;
                final SubLObject _prev_bind_0_$25 = builder_utilities.$constant_obfuscation_name_generator_state$.currentBinding(thread);
                final SubLObject _prev_bind_3 = constants_high.$constant_name_obfuscation_fn$.currentBinding(thread);
                try {
                    builder_utilities.$constant_obfuscation_name_generator_state$.bind((SubLObject)ConsesLow.cons(constant_fn, state_val), thread);
                    constants_high.$constant_name_obfuscation_fn$.bind((SubLObject)builder_utilities.$sym257$OBFUSCATE_CONSTANT_NAME_VIA_GENERATOR_FN, thread);
                    dumper.dump_non_computable_kb(dump_dir);
                }
                finally {
                    constants_high.$constant_name_obfuscation_fn$.rebind(_prev_bind_3, thread);
                    builder_utilities.$constant_obfuscation_name_generator_state$.rebind(_prev_bind_0_$25, thread);
                }
            }
            finally {
                builder_utilities.$constant_obfuscation_cache$.rebind(_prev_bind_2, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)builder_utilities.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                if (builder_utilities.NIL != changedP) {
                    final SubLObject str = (SubLObject)builder_utilities.$str276$KB_has_been_obfuscated__rendering;
                    final SubLObject _prev_bind_0_$26 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = utilities_macros.$progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind((SubLObject)builder_utilities.ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)builder_utilities.ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind((SubLObject)builder_utilities.ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind((SubLObject)builder_utilities.T, thread);
                        utilities_macros.$silent_progressP$.bind((SubLObject)((builder_utilities.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : builder_utilities.T), thread);
                        utilities_macros.noting_progress_preamble(str);
                        operation_communication.halt_cyc_image((SubLObject)builder_utilities.UNPROVIDED);
                        utilities_macros.noting_progress_postamble();
                    }
                    finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_11, thread);
                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_10, thread);
                        utilities_macros.$progress_count$.rebind(_prev_bind_9, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_8, thread);
                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_7, thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_6, thread);
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_5, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$26, thread);
                    }
                }
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        return dump_dir;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 84965L)
    public static SubLObject determine_obfuscation_candidates(SubLObject message) {
        if (message == builder_utilities.UNPROVIDED) {
            message = (SubLObject)builder_utilities.$str278$Identifying_needed_KB_changes;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject assertion_edits = Hashtables.make_hash_table(unrepresented_terms.kb_unrepresented_term_count(), (SubLObject)builder_utilities.EQUAL, (SubLObject)builder_utilities.UNPROVIDED);
        final SubLObject nart_edits = Hashtables.make_hash_table(unrepresented_terms.kb_unrepresented_term_count(), (SubLObject)builder_utilities.EQUAL, (SubLObject)builder_utilities.UNPROVIDED);
        if (builder_utilities.NIL != unrepresented_terms.use_unrepresented_term_fhtP()) {
            SubLObject msg = Sequences.cconcatenate(message, (SubLObject)builder_utilities.$str279$____Old_Space);
            SubLObject release = (SubLObject)builder_utilities.NIL;
            try {
                release = Locks.seize_lock(unrepresented_terms.$unrepresented_term_fht_lock$.getGlobalValue());
                final SubLObject table_var = unrepresented_terms.get_unrepresented_term_fht();
                utilities_macros.$progress_note$.setDynamicValue(msg, thread);
                utilities_macros.$progress_start_time$.setDynamicValue(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.setDynamicValue(file_hash_table.file_hash_table_count(table_var), thread);
                utilities_macros.$progress_sofar$.setDynamicValue((SubLObject)builder_utilities.ZERO_INTEGER, thread);
                final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)builder_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)builder_utilities.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)builder_utilities.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                        SubLObject continuation = (SubLObject)builder_utilities.NIL;
                        SubLObject next;
                        for (SubLObject completeP = (SubLObject)builder_utilities.NIL; builder_utilities.NIL == completeP; completeP = Types.sublisp_null(next)) {
                            thread.resetMultipleValues();
                            final SubLObject the_key = file_hash_table.get_file_hash_table_any(table_var, continuation, (SubLObject)builder_utilities.NIL);
                            final SubLObject the_value = thread.secondMultipleValue();
                            next = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if (builder_utilities.NIL != next) {
                                final SubLObject key = the_key;
                                final SubLObject unrep_term = the_value;
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)builder_utilities.ONE_INTEGER), thread);
                                if (builder_utilities.NIL == unrepresented_terms.deleted_unrepresented_term_itemP(key) && builder_utilities.NIL != unrepresented_terms.fht_suid_item_p(key)) {
                                    final SubLObject suid = unrepresented_terms.get_fht_suid_item_suid(key);
                                    if (unrep_term.isString()) {
                                        final SubLObject leaves = kb_indexing_datastructures.index_leaves(unrepresented_term_index_manager.lookup_unrepresented_term_index(suid));
                                        thread.resetMultipleValues();
                                        final SubLObject assertions = list_utilities.npartition_list(leaves, (SubLObject)builder_utilities.$sym280$NOT_TERM_OF_UNIT_ASSERTION_);
                                        final SubLObject tous = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (builder_utilities.NIL != assertions) {
                                            map_utilities.map_put(assertion_edits, unrep_term, assertions);
                                        }
                                        if (builder_utilities.NIL != tous) {
                                            map_utilities.map_put(nart_edits, unrep_term, tous);
                                        }
                                    }
                                }
                            }
                            continuation = next;
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$27 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)builder_utilities.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                }
            }
            finally {
                if (builder_utilities.NIL != release) {
                    Locks.release_lock(unrepresented_terms.$unrepresented_term_fht_lock$.getGlobalValue());
                }
            }
            msg = Sequences.cconcatenate(message, (SubLObject)builder_utilities.$str281$____New_Space);
            if (builder_utilities.NIL != unrepresented_terms.use_unrepresented_term_fhtP()) {
                final SubLObject list_var = unrepresented_terms.get_unrepresented_term_new_space_ascending_suid_keys();
                final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$progress_note$.bind((SubLObject)((builder_utilities.NIL != msg) ? msg : builder_utilities.$str152$cdolist), thread);
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                    utilities_macros.$progress_sofar$.bind((SubLObject)builder_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)builder_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)builder_utilities.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)builder_utilities.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                        SubLObject csome_list_var = list_var;
                        SubLObject suid_item = (SubLObject)builder_utilities.NIL;
                        suid_item = csome_list_var.first();
                        while (builder_utilities.NIL != csome_list_var) {
                            final SubLObject suid2 = unrepresented_terms.get_fht_suid_item_suid(suid_item);
                            final SubLObject unrep_term2 = unrepresented_terms.find_unrepresented_term_by_suid(suid2);
                            if (unrep_term2.isString()) {
                                final SubLObject leaves = kb_indexing_datastructures.index_leaves(unrepresented_term_index_manager.lookup_unrepresented_term_index(suid2));
                                thread.resetMultipleValues();
                                final SubLObject assertions = list_utilities.npartition_list(leaves, (SubLObject)builder_utilities.$sym280$NOT_TERM_OF_UNIT_ASSERTION_);
                                final SubLObject tous = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (builder_utilities.NIL != assertions) {
                                    map_utilities.map_put(assertion_edits, unrep_term2, assertions);
                                }
                                if (builder_utilities.NIL != tous) {
                                    map_utilities.map_put(nart_edits, unrep_term2, tous);
                                }
                            }
                            utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)builder_utilities.ONE_INTEGER), thread);
                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            suid_item = csome_list_var.first();
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)builder_utilities.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
                    utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
                }
            }
            else {
                final SubLObject table_var = unrepresented_terms.do_unrepresented_terms_table();
                final SubLObject first_id_var = unrepresented_terms.new_unrepresented_term_id_threshold();
                final SubLObject total = Numbers.subtract(id_index.id_index_next_id(table_var), first_id_var);
                SubLObject sofar = (SubLObject)builder_utilities.ZERO_INTEGER;
                final SubLObject _prev_bind_9 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_10 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_11 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_12 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)builder_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)builder_utilities.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)builder_utilities.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(msg);
                        SubLObject unrep_term;
                        SubLObject suid;
                        SubLObject leaves;
                        SubLObject assertions;
                        SubLObject tous;
                        SubLObject end_var;
                        SubLObject end;
                        SubLObject id;
                        for (end = (end_var = id_index.id_index_next_id(table_var)), id = (SubLObject)builder_utilities.NIL, id = first_id_var; !id.numGE(end_var); id = number_utilities.f_1X(id)) {
                            unrep_term = id_index.id_index_lookup(table_var, id, (SubLObject)builder_utilities.UNPROVIDED);
                            if (builder_utilities.NIL != unrep_term) {
                                utilities_macros.note_percent_progress(sofar, total);
                                sofar = Numbers.add(sofar, (SubLObject)builder_utilities.ONE_INTEGER);
                                suid = unrepresented_terms.unrepresented_term_suid(unrep_term);
                                if (unrep_term.isString()) {
                                    leaves = kb_indexing_datastructures.index_leaves(unrepresented_term_index_manager.lookup_unrepresented_term_index(suid));
                                    thread.resetMultipleValues();
                                    assertions = list_utilities.npartition_list(leaves, (SubLObject)builder_utilities.$sym280$NOT_TERM_OF_UNIT_ASSERTION_);
                                    tous = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (builder_utilities.NIL != assertions) {
                                        map_utilities.map_put(assertion_edits, unrep_term, assertions);
                                    }
                                    if (builder_utilities.NIL != tous) {
                                        map_utilities.map_put(nart_edits, unrep_term, tous);
                                    }
                                }
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$29 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)builder_utilities.T, thread);
                            final SubLObject _values3 = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values3);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$29, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_12, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_11, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_10, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_9, thread);
                }
            }
        }
        else {
            final SubLObject idx = unrepresented_terms.do_unrepresented_terms_table();
            final SubLObject mess = message;
            final SubLObject total2 = id_index.id_index_count(idx);
            SubLObject sofar2 = (SubLObject)builder_utilities.ZERO_INTEGER;
            assert builder_utilities.NIL != Types.stringp(mess) : mess;
            final SubLObject _prev_bind_13 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_14 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_15 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_16 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)builder_utilities.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)builder_utilities.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)builder_utilities.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(mess);
                    final SubLObject idx_$30 = idx;
                    if (builder_utilities.NIL == id_index.id_index_objects_empty_p(idx_$30, (SubLObject)builder_utilities.$kw282$SKIP)) {
                        final SubLObject idx_$31 = idx_$30;
                        if (builder_utilities.NIL == id_index.id_index_dense_objects_empty_p(idx_$31, (SubLObject)builder_utilities.$kw282$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$31);
                            final SubLObject backwardP_var = (SubLObject)builder_utilities.NIL;
                            SubLObject suid;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject unrep_term3;
                            SubLObject leaves2;
                            SubLObject assertions2;
                            SubLObject tous2;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)builder_utilities.NIL, v_iteration = (SubLObject)builder_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)builder_utilities.ONE_INTEGER)) {
                                suid = ((builder_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)builder_utilities.ONE_INTEGER) : v_iteration);
                                unrep_term3 = Vectors.aref(vector_var, suid);
                                if (builder_utilities.NIL == id_index.id_index_tombstone_p(unrep_term3) || builder_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)builder_utilities.$kw282$SKIP)) {
                                    if (builder_utilities.NIL != id_index.id_index_tombstone_p(unrep_term3)) {
                                        unrep_term3 = (SubLObject)builder_utilities.$kw282$SKIP;
                                    }
                                    if (unrep_term3.isString()) {
                                        leaves2 = kb_indexing_datastructures.index_leaves(unrepresented_term_index_manager.lookup_unrepresented_term_index(suid));
                                        thread.resetMultipleValues();
                                        assertions2 = list_utilities.npartition_list(leaves2, (SubLObject)builder_utilities.$sym280$NOT_TERM_OF_UNIT_ASSERTION_);
                                        tous2 = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (builder_utilities.NIL != assertions2) {
                                            map_utilities.map_put(assertion_edits, unrep_term3, assertions2);
                                        }
                                        if (builder_utilities.NIL != tous2) {
                                            map_utilities.map_put(nart_edits, unrep_term3, tous2);
                                        }
                                    }
                                    sofar2 = Numbers.add(sofar2, (SubLObject)builder_utilities.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar2, total2);
                                }
                            }
                        }
                        final SubLObject idx_$32 = idx_$30;
                        if (builder_utilities.NIL == id_index.id_index_sparse_objects_empty_p(idx_$32) || builder_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)builder_utilities.$kw282$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$32);
                            SubLObject suid3 = id_index.id_index_sparse_id_threshold(idx_$32);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$32);
                            final SubLObject v_default = (SubLObject)((builder_utilities.NIL != id_index.id_index_skip_tombstones_p((SubLObject)builder_utilities.$kw282$SKIP)) ? builder_utilities.NIL : builder_utilities.$kw282$SKIP);
                            while (suid3.numL(end_id)) {
                                final SubLObject unrep_term2 = Hashtables.gethash_without_values(suid3, sparse, v_default);
                                if (builder_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)builder_utilities.$kw282$SKIP) || builder_utilities.NIL == id_index.id_index_tombstone_p(unrep_term2)) {
                                    if (unrep_term2.isString()) {
                                        final SubLObject leaves = kb_indexing_datastructures.index_leaves(unrepresented_term_index_manager.lookup_unrepresented_term_index(suid3));
                                        thread.resetMultipleValues();
                                        final SubLObject assertions = list_utilities.npartition_list(leaves, (SubLObject)builder_utilities.$sym280$NOT_TERM_OF_UNIT_ASSERTION_);
                                        final SubLObject tous = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (builder_utilities.NIL != assertions) {
                                            map_utilities.map_put(assertion_edits, unrep_term2, assertions);
                                        }
                                        if (builder_utilities.NIL != tous) {
                                            map_utilities.map_put(nart_edits, unrep_term2, tous);
                                        }
                                    }
                                    sofar2 = Numbers.add(sofar2, (SubLObject)builder_utilities.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar2, total2);
                                }
                                suid3 = Numbers.add(suid3, (SubLObject)builder_utilities.ONE_INTEGER);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$30 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)builder_utilities.T, thread);
                        final SubLObject _values4 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values4);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_16, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_15, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_14, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_13, thread);
            }
        }
        return Values.values(assertion_edits, nart_edits);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 86181L)
    public static SubLObject not_term_of_unit_assertionP(final SubLObject as) {
        return (SubLObject)SubLObjectFactory.makeBoolean(builder_utilities.NIL == function_terms.tou_assertionP(as));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 86267L)
    public static SubLObject determine_assertion_obfuscations(final SubLObject assertion_edits, final SubLObject obfuscator_fn, SubLObject message) {
        if (message == builder_utilities.UNPROVIDED) {
            message = (SubLObject)builder_utilities.$str284$Identifying_assertion_changes;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject edits = Hashtables.make_hash_table(map_utilities.map_size(assertion_edits), (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
        final SubLObject mess = message;
        SubLObject sofar = (SubLObject)builder_utilities.ZERO_INTEGER;
        final SubLObject total = map_utilities.map_size(assertion_edits);
        assert builder_utilities.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)builder_utilities.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)builder_utilities.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)builder_utilities.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject iterator = map_utilities.new_map_iterator(assertion_edits);
                SubLObject valid;
                for (SubLObject done_var = (SubLObject)builder_utilities.NIL; builder_utilities.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(builder_utilities.NIL == valid)) {
                    thread.resetMultipleValues();
                    final SubLObject var = iteration.iteration_next(iterator);
                    valid = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (builder_utilities.NIL != valid) {
                        SubLObject current;
                        final SubLObject datum = current = var;
                        SubLObject unrep_term = (SubLObject)builder_utilities.NIL;
                        SubLObject assertions = (SubLObject)builder_utilities.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)builder_utilities.$list285);
                        unrep_term = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)builder_utilities.$list285);
                        assertions = current.first();
                        current = current.rest();
                        if (builder_utilities.NIL == current) {
                            utilities_macros.note_percent_progress(sofar, total);
                            sofar = Numbers.add(sofar, (SubLObject)builder_utilities.ONE_INTEGER);
                            SubLObject cdolist_list_var;
                            final SubLObject classified_assertion_sets = cdolist_list_var = Functions.funcall(obfuscator_fn, unrep_term, assertions);
                            SubLObject classified_assertion_set = (SubLObject)builder_utilities.NIL;
                            classified_assertion_set = cdolist_list_var.first();
                            while (builder_utilities.NIL != cdolist_list_var) {
                                SubLObject current_$35;
                                final SubLObject datum_$34 = current_$35 = classified_assertion_set;
                                SubLObject new_string = (SubLObject)builder_utilities.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current_$35, datum_$34, (SubLObject)builder_utilities.$list286);
                                new_string = current_$35.first();
                                current_$35 = current_$35.rest();
                                SubLObject cdolist_list_var_$36;
                                final SubLObject target_assertions = cdolist_list_var_$36 = current_$35;
                                SubLObject target_assertion = (SubLObject)builder_utilities.NIL;
                                target_assertion = cdolist_list_var_$36.first();
                                while (builder_utilities.NIL != cdolist_list_var_$36) {
                                    map_utilities.map_push(edits, target_assertion, (SubLObject)ConsesLow.cons(unrep_term, new_string));
                                    cdolist_list_var_$36 = cdolist_list_var_$36.rest();
                                    target_assertion = cdolist_list_var_$36.first();
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                classified_assertion_set = cdolist_list_var.first();
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)builder_utilities.$list285);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$37 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)builder_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return edits;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 87485L)
    public static SubLObject determine_nart_obfuscations(final SubLObject nart_edits, final SubLObject obfuscator_fn, SubLObject message) {
        if (message == builder_utilities.UNPROVIDED) {
            message = (SubLObject)builder_utilities.$str288$Identifying_NART_changes;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject edits = Hashtables.make_hash_table(map_utilities.map_size(nart_edits), (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
        final SubLObject naut_to_tou = dictionary.new_dictionary((SubLObject)builder_utilities.EQUAL, (SubLObject)builder_utilities.UNPROVIDED);
        final SubLObject mess = message;
        SubLObject sofar = (SubLObject)builder_utilities.ZERO_INTEGER;
        final SubLObject total = map_utilities.map_size(nart_edits);
        assert builder_utilities.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)builder_utilities.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)builder_utilities.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)builder_utilities.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject iterator = map_utilities.new_map_iterator(nart_edits);
                SubLObject valid;
                for (SubLObject done_var = (SubLObject)builder_utilities.NIL; builder_utilities.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(builder_utilities.NIL == valid)) {
                    thread.resetMultipleValues();
                    final SubLObject var = iteration.iteration_next(iterator);
                    valid = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (builder_utilities.NIL != valid) {
                        SubLObject current;
                        final SubLObject datum = current = var;
                        SubLObject unrep_term = (SubLObject)builder_utilities.NIL;
                        SubLObject assertions = (SubLObject)builder_utilities.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)builder_utilities.$list285);
                        unrep_term = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)builder_utilities.$list285);
                        assertions = current.first();
                        current = current.rest();
                        if (builder_utilities.NIL == current) {
                            utilities_macros.note_percent_progress(sofar, total);
                            sofar = Numbers.add(sofar, (SubLObject)builder_utilities.ONE_INTEGER);
                            map_utilities.map_remove_all(naut_to_tou);
                            SubLObject assertion_nauts = (SubLObject)builder_utilities.NIL;
                            SubLObject cdolist_list_var = assertions;
                            SubLObject tou = (SubLObject)builder_utilities.NIL;
                            tou = cdolist_list_var.first();
                            while (builder_utilities.NIL != cdolist_list_var) {
                                final SubLObject naut = assertions_high.gaf_arg2(tou);
                                map_utilities.map_put(naut_to_tou, naut, tou);
                                assertion_nauts = (SubLObject)ConsesLow.cons(naut, assertion_nauts);
                                cdolist_list_var = cdolist_list_var.rest();
                                tou = cdolist_list_var.first();
                            }
                            SubLObject cdolist_list_var2;
                            final SubLObject classified_naut_sets = cdolist_list_var2 = Functions.funcall(obfuscator_fn, unrep_term, assertion_nauts);
                            SubLObject classified_naut_set = (SubLObject)builder_utilities.NIL;
                            classified_naut_set = cdolist_list_var2.first();
                            while (builder_utilities.NIL != cdolist_list_var2) {
                                SubLObject current_$39;
                                final SubLObject datum_$38 = current_$39 = classified_naut_set;
                                SubLObject new_string = (SubLObject)builder_utilities.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current_$39, datum_$38, (SubLObject)builder_utilities.$list289);
                                new_string = current_$39.first();
                                current_$39 = current_$39.rest();
                                SubLObject cdolist_list_var_$40;
                                final SubLObject target_nauts = cdolist_list_var_$40 = current_$39;
                                SubLObject target_naut = (SubLObject)builder_utilities.NIL;
                                target_naut = cdolist_list_var_$40.first();
                                while (builder_utilities.NIL != cdolist_list_var_$40) {
                                    final SubLObject target_assertion = map_utilities.map_get(naut_to_tou, target_naut, (SubLObject)builder_utilities.UNPROVIDED);
                                    map_utilities.map_push(edits, target_assertion, (SubLObject)ConsesLow.cons(unrep_term, new_string));
                                    cdolist_list_var_$40 = cdolist_list_var_$40.rest();
                                    target_naut = cdolist_list_var_$40.first();
                                }
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                classified_naut_set = cdolist_list_var2.first();
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)builder_utilities.$list285);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$41 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)builder_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$41, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return edits;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 89004L)
    public static SubLObject apply_assertion_obfuscations(final SubLObject edits_spec, SubLObject message) {
        if (message == builder_utilities.UNPROVIDED) {
            message = (SubLObject)builder_utilities.$str291$Applying_assertion_changes;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject edits = (SubLObject)builder_utilities.ZERO_INTEGER;
        SubLObject non_gafs = (SubLObject)builder_utilities.ZERO_INTEGER;
        SubLObject assertion_order = (SubLObject)builder_utilities.NIL;
        SubLObject success = (SubLObject)builder_utilities.NIL;
        final SubLObject str = (SubLObject)builder_utilities.$str292$Optimizing_edit_order;
        SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
        SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
        SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
        SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
        SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
        SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
        SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
        SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
        try {
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
            utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
            utilities_macros.$progress_notification_count$.bind((SubLObject)builder_utilities.ZERO_INTEGER, thread);
            utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)builder_utilities.ZERO_INTEGER, thread);
            utilities_macros.$progress_count$.bind((SubLObject)builder_utilities.ZERO_INTEGER, thread);
            utilities_macros.$is_noting_progressP$.bind((SubLObject)builder_utilities.T, thread);
            utilities_macros.$silent_progressP$.bind((SubLObject)((builder_utilities.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : builder_utilities.T), thread);
            utilities_macros.noting_progress_preamble(str);
            assertion_order = assertion_utilities.sort_assertions(map_utilities.map_keys(edits_spec));
            utilities_macros.noting_progress_postamble();
        }
        finally {
            utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
            utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
            utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
            utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
        }
        try {
            final SubLObject list_var = assertion_order;
            _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
            _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
            _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)((builder_utilities.NIL != message) ? message : builder_utilities.$str152$cdolist), thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)builder_utilities.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)builder_utilities.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)builder_utilities.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)builder_utilities.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject target_assertion = (SubLObject)builder_utilities.NIL;
                    target_assertion = csome_list_var.first();
                    while (builder_utilities.NIL != csome_list_var) {
                        SubLObject cdolist_list_var;
                        final SubLObject string_mappings = cdolist_list_var = map_utilities.map_get(edits_spec, target_assertion, (SubLObject)builder_utilities.UNPROVIDED);
                        SubLObject string_mapping = (SubLObject)builder_utilities.NIL;
                        string_mapping = cdolist_list_var.first();
                        while (builder_utilities.NIL != cdolist_list_var) {
                            SubLObject current;
                            final SubLObject datum = current = string_mapping;
                            SubLObject unrep_term = (SubLObject)builder_utilities.NIL;
                            SubLObject new_string = (SubLObject)builder_utilities.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)builder_utilities.$list293);
                            unrep_term = current.first();
                            current = (new_string = current.rest());
                            final SubLObject old_formula_data = assertions_low.assertion_formula_data(target_assertion);
                            assertion_manager.mark_assertion_content_as_muted(assertion_handles.assertion_id(target_assertion));
                            if (builder_utilities.NIL != clause_strucs.clause_struc_p(old_formula_data)) {
                                final SubLObject cs = old_formula_data;
                                cycl_utilities.expression_nsubst(new_string, unrep_term, clause_strucs.clause_struc_cnf(cs), (SubLObject)builder_utilities.EQUAL, (SubLObject)builder_utilities.UNPROVIDED);
                            }
                            else if (builder_utilities.NIL != clauses.cnf_p(old_formula_data) || old_formula_data.isCons()) {
                                cycl_utilities.expression_nsubst(new_string, unrep_term, old_formula_data, (SubLObject)builder_utilities.EQUAL, (SubLObject)builder_utilities.UNPROVIDED);
                            }
                            else {
                                non_gafs = Numbers.add(non_gafs, (SubLObject)builder_utilities.ONE_INTEGER);
                            }
                            edits = Numbers.add(edits, (SubLObject)builder_utilities.ONE_INTEGER);
                            cdolist_list_var = cdolist_list_var.rest();
                            string_mapping = cdolist_list_var.first();
                        }
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)builder_utilities.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        target_assertion = csome_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$42 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)builder_utilities.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$42, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
            }
            success = (SubLObject)builder_utilities.T;
        }
        finally {
            final SubLObject _prev_bind_9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)builder_utilities.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                if (builder_utilities.NIL == success) {
                    final SubLObject str2;
                    final SubLObject msg = str2 = Sequences.cconcatenate((SubLObject)builder_utilities.$str294$A_total_of_, new SubLObject[] { format_nil.format_nil_a_no_copy(edits), builder_utilities.$str295$_edits_had_been_made_to_the_KB_ });
                    final SubLObject _prev_bind_0_$43 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_12 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_13 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_14 = utilities_macros.$progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_15 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_16 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind((SubLObject)builder_utilities.ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)builder_utilities.ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind((SubLObject)builder_utilities.ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind((SubLObject)builder_utilities.T, thread);
                        utilities_macros.$silent_progressP$.bind((SubLObject)((builder_utilities.NIL != str2) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : builder_utilities.T), thread);
                        utilities_macros.noting_progress_preamble(str2);
                        utilities_macros.noting_progress_postamble();
                    }
                    finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_16, thread);
                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_15, thread);
                        utilities_macros.$progress_count$.rebind(_prev_bind_14, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_13, thread);
                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_12, thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_11, thread);
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_10, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$43, thread);
                    }
                }
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_9, thread);
            }
        }
        return Values.values(edits, (SubLObject)ConsesLow.list((SubLObject)builder_utilities.$kw296$NON_GAFS, non_gafs));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 90910L)
    public static SubLObject weakly_scramble_string_in_assertions(final SubLObject string, final SubLObject assertions) {
        final SubLObject odd_string = Sequences.reverse(string);
        final SubLObject even_string = mix_case_string(string);
        SubLObject odd_assertions = (SubLObject)builder_utilities.NIL;
        SubLObject even_assertions = (SubLObject)builder_utilities.NIL;
        SubLObject result = (SubLObject)builder_utilities.NIL;
        SubLObject cdolist_list_var = assertions;
        SubLObject assertion = (SubLObject)builder_utilities.NIL;
        assertion = cdolist_list_var.first();
        while (builder_utilities.NIL != cdolist_list_var) {
            if (builder_utilities.NIL != Numbers.evenp(assertion_handles.assertion_id(assertion))) {
                even_assertions = (SubLObject)ConsesLow.cons(assertion, even_assertions);
            }
            else {
                odd_assertions = (SubLObject)ConsesLow.cons(assertion, odd_assertions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        if (builder_utilities.NIL == list_utilities.empty_list_p(odd_assertions)) {
            odd_assertions = (SubLObject)ConsesLow.cons(odd_string, odd_assertions);
            result = (SubLObject)ConsesLow.cons(odd_assertions, result);
        }
        if (builder_utilities.NIL == list_utilities.empty_list_p(even_assertions)) {
            even_assertions = (SubLObject)ConsesLow.cons(even_string, even_assertions);
            result = (SubLObject)ConsesLow.cons(even_assertions, result);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 91805L)
    public static SubLObject weakly_scramble_string_in_nauts(final SubLObject string, final SubLObject nauts) {
        final SubLObject odd_string = Sequences.reverse(string);
        final SubLObject even_string = mix_case_string(string);
        SubLObject odd_nauts = (SubLObject)builder_utilities.NIL;
        SubLObject even_nauts = (SubLObject)builder_utilities.NIL;
        SubLObject result = (SubLObject)builder_utilities.NIL;
        SubLObject cdolist_list_var = nauts;
        SubLObject naut = (SubLObject)builder_utilities.NIL;
        naut = cdolist_list_var.first();
        while (builder_utilities.NIL != cdolist_list_var) {
            if (builder_utilities.NIL != Numbers.evenp(Sxhash.sxhash(naut))) {
                even_nauts = (SubLObject)ConsesLow.cons(naut, even_nauts);
            }
            else {
                odd_nauts = (SubLObject)ConsesLow.cons(naut, odd_nauts);
            }
            cdolist_list_var = cdolist_list_var.rest();
            naut = cdolist_list_var.first();
        }
        if (builder_utilities.NIL == list_utilities.empty_list_p(odd_nauts)) {
            odd_nauts = (SubLObject)ConsesLow.cons(odd_string, odd_nauts);
            result = (SubLObject)ConsesLow.cons(odd_nauts, result);
        }
        if (builder_utilities.NIL == list_utilities.empty_list_p(even_nauts)) {
            even_nauts = (SubLObject)ConsesLow.cons(even_string, even_nauts);
            result = (SubLObject)ConsesLow.cons(even_nauts, result);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 92414L)
    public static SubLObject mix_case_string(final SubLObject string) {
        final SubLObject string_var;
        final SubLObject result = string_var = string_utilities.copy_string(string);
        SubLObject end_var_$44;
        SubLObject end_var;
        SubLObject index;
        SubLObject curr;
        for (end_var = (end_var_$44 = Sequences.length(string_var)), index = (SubLObject)builder_utilities.NIL, index = (SubLObject)builder_utilities.ZERO_INTEGER; !index.numGE(end_var_$44); index = number_utilities.f_1X(index)) {
            curr = Strings.sublisp_char(string_var, index);
            if (builder_utilities.NIL != Characters.alpha_char_p(curr)) {
                if (builder_utilities.NIL != Numbers.evenp(index)) {
                    Strings.set_char(result, index, Characters.char_downcase(curr));
                }
                else if (builder_utilities.NIL != Numbers.oddp(index)) {
                    Strings.set_char(result, index, Characters.char_upcase(curr));
                }
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 92769L)
    public static SubLObject select_clippable_collections(SubLObject tabu_collections, SubLObject elmt) {
        if (tabu_collections == builder_utilities.UNPROVIDED) {
            tabu_collections = (SubLObject)builder_utilities.NIL;
        }
        if (elmt == builder_utilities.UNPROVIDED) {
            elmt = (SubLObject)builder_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject collections = (SubLObject)builder_utilities.NIL;
        if (builder_utilities.NIL == elmt) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)builder_utilities.$sym300$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(builder_utilities.$const301$EverythingPSC, thread);
                collections = isa.all_instances(builder_utilities.$const302$Collection, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)builder_utilities.$sym303$RELEVANT_MT_IS_GENL_MT, thread);
                mt_relevance_macros.$mt$.bind(elmt, thread);
                collections = isa.all_instances(builder_utilities.$const302$Collection, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        SubLObject cdolist_list_var = tabu_collections;
        SubLObject tabu_collection = (SubLObject)builder_utilities.NIL;
        tabu_collection = cdolist_list_var.first();
        while (builder_utilities.NIL != cdolist_list_var) {
            collections = Sequences.delete(tabu_collection, collections, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            tabu_collection = cdolist_list_var.first();
        }
        collections = list_utilities.remove_if_not(Symbols.symbol_function((SubLObject)builder_utilities.$sym304$FORT_P), collections, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
        if (builder_utilities.NIL == elmt) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)builder_utilities.$sym300$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(builder_utilities.$const301$EverythingPSC, thread);
                collections = Sequences.remove_if(Symbols.symbol_function((SubLObject)builder_utilities.$sym305$HIGHER_ORDER_COLLECTION_), collections, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)builder_utilities.$sym303$RELEVANT_MT_IS_GENL_MT, thread);
                mt_relevance_macros.$mt$.bind(elmt, thread);
                collections = Sequences.remove_if(Symbols.symbol_function((SubLObject)builder_utilities.$sym305$HIGHER_ORDER_COLLECTION_), collections, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        collections = Sort.sort(collections, Symbols.symbol_function((SubLObject)builder_utilities.$sym306$_), (SubLObject)builder_utilities.$sym307$INSTANCE_CARDINALITY);
        collections = cardinality_estimates.stable_sort_by_generality_estimate(collections, (SubLObject)builder_utilities.$kw308$ASCENDING);
        return collections;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 94656L)
    public static SubLObject higher_order_collectionP(final SubLObject col) {
        return isa.isaP(col, builder_utilities.$const309$CollectionType, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 94793L)
    public static SubLObject gather_tabu_collections_for_clipping(final SubLObject terms, SubLObject code_constants, SubLObject elmt) {
        if (code_constants == builder_utilities.UNPROVIDED) {
            code_constants = (SubLObject)builder_utilities.NIL;
        }
        if (elmt == builder_utilities.UNPROVIDED) {
            elmt = (SubLObject)builder_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (builder_utilities.NIL == code_constants) {
            code_constants = constant_completion.constants_mentioned_in_code();
        }
        final SubLObject collections = set.new_set((SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
        final SubLObject actual_terms = Sequences.cconcatenate(terms, new SubLObject[] { code_constants, core.all_core_constants() });
        SubLObject cols_to_add = (SubLObject)builder_utilities.NIL;
        SubLObject cdolist_list_var = actual_terms;
        SubLObject v_term = (SubLObject)builder_utilities.NIL;
        v_term = cdolist_list_var.first();
        while (builder_utilities.NIL != cdolist_list_var) {
            if (builder_utilities.NIL != fort_types_interface.collectionP(v_term)) {
                if (builder_utilities.NIL != elmt) {
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)builder_utilities.$sym303$RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(elmt, thread);
                        cols_to_add = genls.all_genls(v_term, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
                    }
                    finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                else {
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)builder_utilities.$sym300$RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind(builder_utilities.$const301$EverythingPSC, thread);
                        cols_to_add = genls.all_genls(v_term, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
                    }
                    finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            else if (builder_utilities.NIL != elmt) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)builder_utilities.$sym303$RELEVANT_MT_IS_GENL_MT, thread);
                    mt_relevance_macros.$mt$.bind(elmt, thread);
                    cols_to_add = isa.all_isa(v_term, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            else {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)builder_utilities.$sym300$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(builder_utilities.$const301$EverythingPSC, thread);
                    cols_to_add = isa.all_isa(v_term, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
                }
                finally {
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
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 95794L)
    public static SubLObject clip_kb_percentage(final SubLObject permitted_collections, final SubLObject percentage, SubLObject logP) {
        if (logP == builder_utilities.UNPROVIDED) {
            logP = (SubLObject)builder_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject count_at_start = forts.fort_count();
        final SubLObject count_at_end = Numbers.floor(Numbers.multiply(percentage, count_at_start), (SubLObject)builder_utilities.UNPROVIDED);
        if (!count_at_end.numL(count_at_start)) {
            if (count_at_start.numE(count_at_end)) {
                Errors.warn((SubLObject)builder_utilities.$str310$Nothing_to_clip_);
                return Values.values(forts.fort_count(), (SubLObject)builder_utilities.$kw311$PERCENTAGE);
            }
            Errors.error((SubLObject)builder_utilities.$str312$Invalid_percentage__A__cannot_cli, percentage, count_at_end, count_at_start);
        }
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)builder_utilities.$str152$cdolist, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(permitted_collections), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)builder_utilities.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)builder_utilities.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)builder_utilities.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)builder_utilities.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = permitted_collections;
                SubLObject permitted_collection = (SubLObject)builder_utilities.NIL;
                permitted_collection = csome_list_var.first();
                while (builder_utilities.NIL != csome_list_var) {
                    SubLObject ignore_errors_tag = (SubLObject)builder_utilities.NIL;
                    try {
                        thread.throwStack.push(builder_utilities.$kw38$IGNORE_ERRORS_TARGET);
                        final SubLObject _prev_bind_0_$45 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)builder_utilities.$sym39$IGNORE_ERRORS_HANDLER), thread);
                            try {
                                if (builder_utilities.NIL != logP) {
                                    format_nil.force_format((SubLObject)builder_utilities.T, (SubLObject)builder_utilities.$str313$___A__Deleting__A_____, numeric_date_utilities.timestring((SubLObject)builder_utilities.UNPROVIDED), permitted_collection, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
                                }
                                final SubLObject _prev_bind_0_$46 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$47 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)builder_utilities.$sym300$RELEVANT_MT_IS_EVERYTHING, thread);
                                    mt_relevance_macros.$mt$.bind(builder_utilities.$const301$EverythingPSC, thread);
                                    final SubLObject node_var = permitted_collection;
                                    final SubLObject _prev_bind_0_$47 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$48 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                    try {
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(builder_utilities.$const165$isa), thread);
                                        sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                        try {
                                            SubLObject node_var_$50 = node_var;
                                            final SubLObject deck_type = (SubLObject)builder_utilities.$kw316$STACK;
                                            final SubLObject recur_deck = deck.create_deck(deck_type);
                                            final SubLObject _prev_bind_0_$48 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                            try {
                                                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                try {
                                                    final SubLObject tv_var = (SubLObject)builder_utilities.NIL;
                                                    final SubLObject _prev_bind_0_$49 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$49 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_tv$.bind((builder_utilities.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((builder_utilities.NIL != tv_var) ? builder_utilities.$sym317$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                                        if (builder_utilities.NIL != tv_var && builder_utilities.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && builder_utilities.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                            if (pcase_var.eql((SubLObject)builder_utilities.$kw232$ERROR)) {
                                                                sbhl_paranoia.sbhl_error((SubLObject)builder_utilities.ONE_INTEGER, (SubLObject)builder_utilities.$str318$_A_is_not_a__A, tv_var, (SubLObject)builder_utilities.$sym319$SBHL_TRUE_TV_P, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
                                                            }
                                                            else if (pcase_var.eql((SubLObject)builder_utilities.$kw320$CERROR)) {
                                                                sbhl_paranoia.sbhl_cerror((SubLObject)builder_utilities.ONE_INTEGER, (SubLObject)builder_utilities.$str321$continue_anyway, (SubLObject)builder_utilities.$str318$_A_is_not_a__A, tv_var, (SubLObject)builder_utilities.$sym319$SBHL_TRUE_TV_P, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
                                                            }
                                                            else if (pcase_var.eql((SubLObject)builder_utilities.$kw322$WARN)) {
                                                                Errors.warn((SubLObject)builder_utilities.$str318$_A_is_not_a__A, tv_var, (SubLObject)builder_utilities.$sym319$SBHL_TRUE_TV_P);
                                                            }
                                                            else {
                                                                Errors.warn((SubLObject)builder_utilities.$str323$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                Errors.cerror((SubLObject)builder_utilities.$str321$continue_anyway, (SubLObject)builder_utilities.$str318$_A_is_not_a__A, tv_var, (SubLObject)builder_utilities.$sym319$SBHL_TRUE_TV_P);
                                                            }
                                                        }
                                                        final SubLObject _prev_bind_0_$50 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$50 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                        final SubLObject _prev_bind_2_$56 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                        final SubLObject _prev_bind_3_$57 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        final SubLObject _prev_bind_4_$58 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        try {
                                                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(builder_utilities.$const165$isa)), thread);
                                                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(builder_utilities.$const165$isa))), thread);
                                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(builder_utilities.$const165$isa))), thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)builder_utilities.NIL, thread);
                                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(builder_utilities.$const165$isa)), thread);
                                                            if (builder_utilities.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || builder_utilities.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module((SubLObject)builder_utilities.UNPROVIDED))) {
                                                                final SubLObject _prev_bind_0_$51 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                final SubLObject _prev_bind_1_$51 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                final SubLObject _prev_bind_2_$57 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                try {
                                                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(builder_utilities.$const165$isa))), thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)builder_utilities.NIL, thread);
                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$50, (SubLObject)builder_utilities.UNPROVIDED);
                                                                    while (builder_utilities.NIL != node_var_$50) {
                                                                        final SubLObject tt_node_var = node_var_$50;
                                                                        SubLObject cdolist_list_var;
                                                                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(builder_utilities.$const165$isa));
                                                                        SubLObject module_var = (SubLObject)builder_utilities.NIL;
                                                                        module_var = cdolist_list_var.first();
                                                                        while (builder_utilities.NIL != cdolist_list_var) {
                                                                            final SubLObject _prev_bind_0_$52 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                            final SubLObject _prev_bind_1_$52 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((builder_utilities.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(builder_utilities.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                                                final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                                                if (builder_utilities.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)builder_utilities.UNPROVIDED));
                                                                                    if (builder_utilities.NIL != d_link) {
                                                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(builder_utilities.$const165$isa)), sbhl_module_vars.get_sbhl_module((SubLObject)builder_utilities.UNPROVIDED));
                                                                                        if (builder_utilities.NIL != mt_links) {
                                                                                            SubLObject iteration_state;
                                                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); builder_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                                                thread.resetMultipleValues();
                                                                                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                                                thread.resetMultipleValues();
                                                                                                if (builder_utilities.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                    final SubLObject _prev_bind_0_$53 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                    try {
                                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                        SubLObject iteration_state_$65;
                                                                                                        for (iteration_state_$65 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); builder_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$65); iteration_state_$65 = dictionary_contents.do_dictionary_contents_next(iteration_state_$65)) {
                                                                                                            thread.resetMultipleValues();
                                                                                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$65);
                                                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                            thread.resetMultipleValues();
                                                                                                            if (builder_utilities.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                final SubLObject _prev_bind_0_$54 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                    final SubLObject sol = link_nodes;
                                                                                                                    if (builder_utilities.NIL != set.set_p(sol)) {
                                                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                                        SubLObject basis_object;
                                                                                                                        SubLObject state;
                                                                                                                        SubLObject instance;
                                                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)builder_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); builder_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                                            instance = set_contents.do_set_contents_next(basis_object, state);
                                                                                                                            if (builder_utilities.NIL != set_contents.do_set_contents_element_validP(state, instance) && builder_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                cyc_kernel.cyc_kill(instance);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    else if (sol.isList()) {
                                                                                                                        SubLObject csome_list_var_$67 = sol;
                                                                                                                        SubLObject instance2 = (SubLObject)builder_utilities.NIL;
                                                                                                                        instance2 = csome_list_var_$67.first();
                                                                                                                        while (builder_utilities.NIL != csome_list_var_$67) {
                                                                                                                            if (builder_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                cyc_kernel.cyc_kill(instance2);
                                                                                                                            }
                                                                                                                            csome_list_var_$67 = csome_list_var_$67.rest();
                                                                                                                            instance2 = csome_list_var_$67.first();
                                                                                                                        }
                                                                                                                    }
                                                                                                                    else {
                                                                                                                        Errors.error((SubLObject)builder_utilities.$str324$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                                    }
                                                                                                                }
                                                                                                                finally {
                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$54, thread);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$65);
                                                                                                    }
                                                                                                    finally {
                                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$53, thread);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        sbhl_paranoia.sbhl_error((SubLObject)builder_utilities.FIVE_INTEGER, (SubLObject)builder_utilities.$str325$attempting_to_bind_direction_link, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
                                                                                    }
                                                                                    if (builder_utilities.NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module((SubLObject)builder_utilities.UNPROVIDED))) {
                                                                                        SubLObject csome_list_var_$68 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                                        SubLObject instance_tuple = (SubLObject)builder_utilities.NIL;
                                                                                        instance_tuple = csome_list_var_$68.first();
                                                                                        while (builder_utilities.NIL != csome_list_var_$68) {
                                                                                            SubLObject current;
                                                                                            final SubLObject datum = current = instance_tuple;
                                                                                            SubLObject link_node = (SubLObject)builder_utilities.NIL;
                                                                                            SubLObject mt2 = (SubLObject)builder_utilities.NIL;
                                                                                            SubLObject tv2 = (SubLObject)builder_utilities.NIL;
                                                                                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)builder_utilities.$list326);
                                                                                            link_node = current.first();
                                                                                            current = current.rest();
                                                                                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)builder_utilities.$list326);
                                                                                            mt2 = current.first();
                                                                                            current = current.rest();
                                                                                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)builder_utilities.$list326);
                                                                                            tv2 = current.first();
                                                                                            current = current.rest();
                                                                                            if (builder_utilities.NIL == current) {
                                                                                                if (builder_utilities.NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                                                    final SubLObject _prev_bind_0_$55 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                    try {
                                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                                        if (builder_utilities.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                                            final SubLObject _prev_bind_0_$56 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                            try {
                                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                                                final SubLObject sol;
                                                                                                                final SubLObject link_nodes2 = sol = (SubLObject)ConsesLow.list(link_node);
                                                                                                                if (builder_utilities.NIL != set.set_p(sol)) {
                                                                                                                    final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                                    SubLObject basis_object;
                                                                                                                    SubLObject state;
                                                                                                                    SubLObject instance;
                                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)builder_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); builder_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                                        instance = set_contents.do_set_contents_next(basis_object, state);
                                                                                                                        if (builder_utilities.NIL != set_contents.do_set_contents_element_validP(state, instance) && builder_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                            cyc_kernel.cyc_kill(instance);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                else if (sol.isList()) {
                                                                                                                    SubLObject csome_list_var_$69 = sol;
                                                                                                                    SubLObject instance2 = (SubLObject)builder_utilities.NIL;
                                                                                                                    instance2 = csome_list_var_$69.first();
                                                                                                                    while (builder_utilities.NIL != csome_list_var_$69) {
                                                                                                                        if (builder_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                            cyc_kernel.cyc_kill(instance2);
                                                                                                                        }
                                                                                                                        csome_list_var_$69 = csome_list_var_$69.rest();
                                                                                                                        instance2 = csome_list_var_$69.first();
                                                                                                                    }
                                                                                                                }
                                                                                                                else {
                                                                                                                    Errors.error((SubLObject)builder_utilities.$str324$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                                }
                                                                                                            }
                                                                                                            finally {
                                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$56, thread);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    finally {
                                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$55, thread);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)builder_utilities.$list326);
                                                                                            }
                                                                                            csome_list_var_$68 = csome_list_var_$68.rest();
                                                                                            instance_tuple = csome_list_var_$68.first();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (builder_utilities.NIL != obsolete.cnat_p(node, (SubLObject)builder_utilities.UNPROVIDED)) {
                                                                                    SubLObject cdolist_list_var_$72;
                                                                                    final SubLObject new_list = cdolist_list_var_$72 = ((builder_utilities.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(builder_utilities.$const165$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)builder_utilities.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(builder_utilities.$const165$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)builder_utilities.UNPROVIDED)));
                                                                                    SubLObject generating_fn = (SubLObject)builder_utilities.NIL;
                                                                                    generating_fn = cdolist_list_var_$72.first();
                                                                                    while (builder_utilities.NIL != cdolist_list_var_$72) {
                                                                                        final SubLObject _prev_bind_0_$57 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                            final SubLObject sol2;
                                                                                            final SubLObject link_nodes3 = sol2 = Functions.funcall(generating_fn, node);
                                                                                            if (builder_utilities.NIL != set.set_p(sol2)) {
                                                                                                final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                                                SubLObject basis_object2;
                                                                                                SubLObject state2;
                                                                                                SubLObject instance3;
                                                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)builder_utilities.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); builder_utilities.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                                    instance3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                                    if (builder_utilities.NIL != set_contents.do_set_contents_element_validP(state2, instance3) && builder_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(instance3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        cyc_kernel.cyc_kill(instance3);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol2.isList()) {
                                                                                                SubLObject csome_list_var_$70 = sol2;
                                                                                                SubLObject instance4 = (SubLObject)builder_utilities.NIL;
                                                                                                instance4 = csome_list_var_$70.first();
                                                                                                while (builder_utilities.NIL != csome_list_var_$70) {
                                                                                                    if (builder_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(instance4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        cyc_kernel.cyc_kill(instance4);
                                                                                                    }
                                                                                                    csome_list_var_$70 = csome_list_var_$70.rest();
                                                                                                    instance4 = csome_list_var_$70.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)builder_utilities.$str324$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$57, thread);
                                                                                        }
                                                                                        cdolist_list_var_$72 = cdolist_list_var_$72.rest();
                                                                                        generating_fn = cdolist_list_var_$72.first();
                                                                                    }
                                                                                }
                                                                            }
                                                                            finally {
                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$52, thread);
                                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$52, thread);
                                                                            }
                                                                            cdolist_list_var = cdolist_list_var.rest();
                                                                            module_var = cdolist_list_var.first();
                                                                        }
                                                                        SubLObject cdolist_list_var2;
                                                                        final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(builder_utilities.$const165$isa)));
                                                                        SubLObject module_var2 = (SubLObject)builder_utilities.NIL;
                                                                        module_var2 = cdolist_list_var2.first();
                                                                        while (builder_utilities.NIL != cdolist_list_var2) {
                                                                            final SubLObject _prev_bind_0_$58 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                            final SubLObject _prev_bind_1_$53 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((builder_utilities.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(builder_utilities.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                                                final SubLObject node2 = function_terms.naut_to_nart(node_var_$50);
                                                                                if (builder_utilities.NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                                                    final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module((SubLObject)builder_utilities.UNPROVIDED));
                                                                                    if (builder_utilities.NIL != d_link2) {
                                                                                        final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)builder_utilities.UNPROVIDED));
                                                                                        if (builder_utilities.NIL != mt_links2) {
                                                                                            SubLObject iteration_state2;
                                                                                            for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); builder_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                                                thread.resetMultipleValues();
                                                                                                final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                                                final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                                                thread.resetMultipleValues();
                                                                                                if (builder_utilities.NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                                                    final SubLObject _prev_bind_0_$59 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                    try {
                                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                                        SubLObject iteration_state_$66;
                                                                                                        for (iteration_state_$66 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); builder_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$66); iteration_state_$66 = dictionary_contents.do_dictionary_contents_next(iteration_state_$66)) {
                                                                                                            thread.resetMultipleValues();
                                                                                                            final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$66);
                                                                                                            final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                                            thread.resetMultipleValues();
                                                                                                            if (builder_utilities.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                                                final SubLObject _prev_bind_0_$60 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                                                    final SubLObject sol3 = link_nodes4;
                                                                                                                    if (builder_utilities.NIL != set.set_p(sol3)) {
                                                                                                                        final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                                        SubLObject basis_object3;
                                                                                                                        SubLObject state3;
                                                                                                                        SubLObject node_vars_link_node;
                                                                                                                        for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)builder_utilities.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); builder_utilities.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                                            if (builder_utilities.NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node) && builder_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)builder_utilities.UNPROVIDED)) {
                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)builder_utilities.UNPROVIDED);
                                                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    else if (sol3.isList()) {
                                                                                                                        SubLObject csome_list_var_$71 = sol3;
                                                                                                                        SubLObject node_vars_link_node2 = (SubLObject)builder_utilities.NIL;
                                                                                                                        node_vars_link_node2 = csome_list_var_$71.first();
                                                                                                                        while (builder_utilities.NIL != csome_list_var_$71) {
                                                                                                                            if (builder_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)builder_utilities.UNPROVIDED)) {
                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)builder_utilities.UNPROVIDED);
                                                                                                                                deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                                            }
                                                                                                                            csome_list_var_$71 = csome_list_var_$71.rest();
                                                                                                                            node_vars_link_node2 = csome_list_var_$71.first();
                                                                                                                        }
                                                                                                                    }
                                                                                                                    else {
                                                                                                                        Errors.error((SubLObject)builder_utilities.$str324$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                                    }
                                                                                                                }
                                                                                                                finally {
                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$60, thread);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$66);
                                                                                                    }
                                                                                                    finally {
                                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$59, thread);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        sbhl_paranoia.sbhl_error((SubLObject)builder_utilities.FIVE_INTEGER, (SubLObject)builder_utilities.$str325$attempting_to_bind_direction_link, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
                                                                                    }
                                                                                }
                                                                                else if (builder_utilities.NIL != obsolete.cnat_p(node2, (SubLObject)builder_utilities.UNPROVIDED)) {
                                                                                    SubLObject cdolist_list_var_$73;
                                                                                    final SubLObject new_list2 = cdolist_list_var_$73 = ((builder_utilities.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)builder_utilities.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)builder_utilities.UNPROVIDED)));
                                                                                    SubLObject generating_fn2 = (SubLObject)builder_utilities.NIL;
                                                                                    generating_fn2 = cdolist_list_var_$73.first();
                                                                                    while (builder_utilities.NIL != cdolist_list_var_$73) {
                                                                                        final SubLObject _prev_bind_0_$61 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                                            final SubLObject sol4;
                                                                                            final SubLObject link_nodes5 = sol4 = Functions.funcall(generating_fn2, node2);
                                                                                            if (builder_utilities.NIL != set.set_p(sol4)) {
                                                                                                final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                                                SubLObject basis_object4;
                                                                                                SubLObject state4;
                                                                                                SubLObject node_vars_link_node3;
                                                                                                for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = (SubLObject)builder_utilities.NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); builder_utilities.NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                                                    if (builder_utilities.NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3) && builder_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)builder_utilities.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)builder_utilities.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol4.isList()) {
                                                                                                SubLObject csome_list_var_$72 = sol4;
                                                                                                SubLObject node_vars_link_node4 = (SubLObject)builder_utilities.NIL;
                                                                                                node_vars_link_node4 = csome_list_var_$72.first();
                                                                                                while (builder_utilities.NIL != csome_list_var_$72) {
                                                                                                    if (builder_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)builder_utilities.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)builder_utilities.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var_$72 = csome_list_var_$72.rest();
                                                                                                    node_vars_link_node4 = csome_list_var_$72.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)builder_utilities.$str324$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$61, thread);
                                                                                        }
                                                                                        cdolist_list_var_$73 = cdolist_list_var_$73.rest();
                                                                                        generating_fn2 = cdolist_list_var_$73.first();
                                                                                    }
                                                                                }
                                                                            }
                                                                            finally {
                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$53, thread);
                                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$58, thread);
                                                                            }
                                                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                                                            module_var2 = cdolist_list_var2.first();
                                                                        }
                                                                        node_var_$50 = deck.deck_pop(recur_deck);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$57, thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$51, thread);
                                                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$51, thread);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_warn((SubLObject)builder_utilities.TWO_INTEGER, (SubLObject)builder_utilities.$str327$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)builder_utilities.UNPROVIDED)), (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4_$58, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3_$57, thread);
                                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$56, thread);
                                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$50, thread);
                                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$50, thread);
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$49, thread);
                                                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$49, thread);
                                                    }
                                                }
                                                finally {
                                                    final SubLObject _prev_bind_0_$62 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)builder_utilities.T, thread);
                                                        final SubLObject _values = Values.getValuesAsVector();
                                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                        Values.restoreValuesFromVector(_values);
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$62, thread);
                                                    }
                                                }
                                            }
                                            finally {
                                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$48, thread);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$63 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)builder_utilities.T, thread);
                                                final SubLObject _values2 = Values.getValuesAsVector();
                                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                Values.restoreValuesFromVector(_values2);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$63, thread);
                                            }
                                        }
                                    }
                                    finally {
                                        sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$48, thread);
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$47, thread);
                                    }
                                }
                                finally {
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$47, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$46, thread);
                                }
                                cyc_kernel.cyc_kill(permitted_collection);
                            }
                            catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, (SubLObject)builder_utilities.NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(_prev_bind_0_$45, thread);
                        }
                    }
                    catch (Throwable ccatch_env_var) {
                        ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)builder_utilities.$kw38$IGNORE_ERRORS_TARGET);
                    }
                    finally {
                        thread.throwStack.pop();
                    }
                    if (builder_utilities.NIL != logP) {
                        format_nil.force_format((SubLObject)builder_utilities.T, (SubLObject)builder_utilities.$str328$_done___, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
                    }
                    if (forts.fort_count().numLE(count_at_end)) {
                        return Values.values(forts.fort_count(), (SubLObject)builder_utilities.$kw311$PERCENTAGE);
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)builder_utilities.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    permitted_collection = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$64 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)builder_utilities.T, thread);
                    final SubLObject _values3 = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values3);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$64, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        return Values.values(forts.fort_count(), (SubLObject)builder_utilities.$kw330$EXHAUSTED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 97070L)
    public static SubLObject clip_kb_given_tabu_term_list(final SubLObject tabu_term_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tabu_collections = (SubLObject)builder_utilities.NIL;
        SubLObject clippable_collections = (SubLObject)builder_utilities.NIL;
        format_nil.force_format((SubLObject)builder_utilities.T, (SubLObject)builder_utilities.$str331$___A__Current_FORT_Count____A__, numeric_date_utilities.timestring((SubLObject)builder_utilities.UNPROVIDED), forts.fort_count(), (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
        format_nil.force_format((SubLObject)builder_utilities.T, (SubLObject)builder_utilities.$str332$___A__Gathering_tabu_collections_, numeric_date_utilities.timestring((SubLObject)builder_utilities.UNPROVIDED), (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
        tabu_collections = gather_tabu_collections_for_clipping(tabu_term_list, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
        format_nil.force_format((SubLObject)builder_utilities.T, (SubLObject)builder_utilities.$str333$___A__Selecting_clippable_collect, numeric_date_utilities.timestring((SubLObject)builder_utilities.UNPROVIDED), (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
        clippable_collections = select_clippable_collections(tabu_collections, (SubLObject)builder_utilities.UNPROVIDED);
        format_nil.force_format((SubLObject)builder_utilities.T, (SubLObject)builder_utilities.$str334$___A__Clipping_collections_______, numeric_date_utilities.timestring((SubLObject)builder_utilities.UNPROVIDED), (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject final_count = clip_kb_percentage(clippable_collections, (SubLObject)builder_utilities.$float335$0_1, (SubLObject)builder_utilities.$kw336$LOG);
        final SubLObject reason = thread.secondMultipleValue();
        thread.resetMultipleValues();
        format_nil.force_format((SubLObject)builder_utilities.T, (SubLObject)builder_utilities.$str337$___A__Clipping_stopped_at__A_FORT, numeric_date_utilities.timestring((SubLObject)builder_utilities.UNPROVIDED), final_count, reason, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
        return Values.values(final_count, reason);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 101271L)
    public static SubLObject generate_terms_transcript(final SubLObject term_guids, final SubLObject ts_file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = el_partitions.$el_partition_creator_override$.currentBinding(thread);
        final SubLObject _prev_bind_2 = el_partitions.$el_partition_creation_purpose_override$.currentBinding(thread);
        try {
            el_partitions.$el_partition_creator_override$.bind(builder_utilities.$const339$CycAdministrator, thread);
            el_partitions.$el_partition_creation_purpose_override$.bind((SubLObject)builder_utilities.$int340$212, thread);
            SubLObject stream = (SubLObject)builder_utilities.NIL;
            try {
                final SubLObject _prev_bind_0_$87 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)builder_utilities.NIL, thread);
                    stream = compatibility.open_text(ts_file, (SubLObject)builder_utilities.$kw49$OUTPUT);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$87, thread);
                }
                if (!stream.isStream()) {
                    Errors.error((SubLObject)builder_utilities.$str50$Unable_to_open__S, ts_file);
                }
                final SubLObject stream_$88 = stream;
                if (builder_utilities.NIL == stream_$88) {
                    return (SubLObject)builder_utilities.NIL;
                }
                final SubLObject _prev_bind_0_$88 = builder_utilities.$ts_comment_stream$.currentBinding(thread);
                try {
                    builder_utilities.$ts_comment_stream$.bind(stream_$88, thread);
                    final SubLObject ts_writer = el_partitions.new_transcript_el_partition_data_sink(stream_$88);
                    SubLObject skipped = (SubLObject)builder_utilities.ZERO_INTEGER;
                    final SubLObject _prev_bind_0_$89 = utilities_macros.$progress_note$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$91 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_note$.bind((SubLObject)builder_utilities.$str341$Finding_assertions_about_missing_, thread);
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_total$.bind(Sequences.length(term_guids), thread);
                        utilities_macros.$progress_sofar$.bind((SubLObject)builder_utilities.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)builder_utilities.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)builder_utilities.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)builder_utilities.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                            SubLObject csome_list_var = term_guids;
                            SubLObject term_guid = (SubLObject)builder_utilities.NIL;
                            term_guid = csome_list_var.first();
                            while (builder_utilities.NIL != csome_list_var) {
                                final SubLObject v_term = constants_high.find_constant_by_guid(term_guid);
                                if (builder_utilities.NIL != forts.fort_p(v_term)) {
                                    el_partitions.note_el_partition_tip_constant_create(ts_writer, v_term);
                                    final SubLObject _prev_bind_0_$90 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$92 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)builder_utilities.$sym300$RELEVANT_MT_IS_EVERYTHING, thread);
                                        mt_relevance_macros.$mt$.bind(builder_utilities.$const301$EverythingPSC, thread);
                                        SubLObject cdolist_list_var = (SubLObject)builder_utilities.$list342;
                                        SubLObject predicate = (SubLObject)builder_utilities.NIL;
                                        predicate = cdolist_list_var.first();
                                        while (builder_utilities.NIL != cdolist_list_var) {
                                            SubLObject cdolist_list_var_$94 = kb_mapping_utilities.pred_value_gafs(v_term, predicate, (SubLObject)builder_utilities.UNPROVIDED, (SubLObject)builder_utilities.UNPROVIDED);
                                            SubLObject assertion = (SubLObject)builder_utilities.NIL;
                                            assertion = cdolist_list_var_$94.first();
                                            while (builder_utilities.NIL != cdolist_list_var_$94) {
                                                if (builder_utilities.NIL != assertions_high.asserted_assertionP(assertion)) {
                                                    el_partitions.note_el_partition_tip_assertion_create(ts_writer, assertion);
                                                }
                                                cdolist_list_var_$94 = cdolist_list_var_$94.rest();
                                                assertion = cdolist_list_var_$94.first();
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            predicate = cdolist_list_var.first();
                                        }
                                        SubLObject assertions = kb_mapping.gather_term_assertions(v_term, (SubLObject)builder_utilities.UNPROVIDED);
                                        SubLObject cdolist_list_var2;
                                        assertions = (cdolist_list_var2 = assertion_utilities.sort_assertions(assertions));
                                        SubLObject assertion2 = (SubLObject)builder_utilities.NIL;
                                        assertion2 = cdolist_list_var2.first();
                                        while (builder_utilities.NIL != cdolist_list_var2) {
                                            if (builder_utilities.NIL != assertions_high.asserted_assertionP(assertion2) && builder_utilities.NIL == assertion_utilities.gaf_assertion_has_pred_p(assertion2, builder_utilities.$const165$isa) && builder_utilities.NIL == assertion_utilities.gaf_assertion_has_pred_p(assertion2, builder_utilities.$const174$genls)) {
                                                el_partitions.note_el_partition_tip_assertion_create(ts_writer, assertion2);
                                            }
                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                            assertion2 = cdolist_list_var2.first();
                                        }
                                    }
                                    finally {
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_1_$92, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$90, thread);
                                    }
                                }
                                else {
                                    skipped = Numbers.add(skipped, (SubLObject)builder_utilities.ONE_INTEGER);
                                    Errors.warn((SubLObject)builder_utilities.$str343$Could_not_find_constant_for__S___, term_guid);
                                }
                                utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)builder_utilities.ONE_INTEGER), thread);
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                csome_list_var = csome_list_var.rest();
                                term_guid = csome_list_var.first();
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$91 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)builder_utilities.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$91, thread);
                            }
                        }
                    }
                    finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                        utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                        utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_1_$91, thread);
                        utilities_macros.$progress_note$.rebind(_prev_bind_0_$89, thread);
                    }
                    if (skipped.isPositive()) {
                        Errors.warn((SubLObject)builder_utilities.$str344$_A_constants_were_skipped___, skipped);
                    }
                }
                finally {
                    builder_utilities.$ts_comment_stream$.rebind(_prev_bind_0_$88, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$92 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)builder_utilities.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)builder_utilities.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$92, thread);
                }
            }
        }
        finally {
            el_partitions.$el_partition_creation_purpose_override$.rebind(_prev_bind_2, thread);
            el_partitions.$el_partition_creator_override$.rebind(_prev_bind_0, thread);
        }
        return ts_file;
    }
    
    public static SubLObject declare_builder_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "close_old_areas", "CLOSE-OLD-AREAS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "verify_cyc_build", "VERIFY-CYC-BUILD", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "cyc_build_world", "CYC-BUILD-WORLD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "cyc_build_world_verify", "CYC-BUILD-WORLD-VERIFY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "build_write_image", "BUILD-WRITE-IMAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "cyc_install_directory_name", "CYC-INSTALL-DIRECTORY-NAME", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "cyc_install_directory", "CYC-INSTALL-DIRECTORY", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "cyc_versioned_world_name", "CYC-VERSIONED-WORLD-NAME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "build_write_image_versioned", "BUILD-WRITE-IMAGE-VERSIONED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "cyc_load_kb", "CYC-LOAD-KB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "cyc_load_incremental_kb", "CYC-LOAD-INCREMENTAL-KB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "cyc_dump_standard_kb", "CYC-DUMP-STANDARD-KB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "cyc_snapshot_kb", "CYC-SNAPSHOT-KB", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "cyc_dump_snapshot_kb", "CYC-DUMP-SNAPSHOT-KB", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "suggest_kb_snapshot_directory", "SUGGEST-KB-SNAPSHOT-DIRECTORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "builder_catchup_and_dump_pipeline", "BUILDER-CATCHUP-AND-DUMP-PIPELINE", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "builder_log_directory", "BUILDER-LOG-DIRECTORY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "builder_forward_inference_metrics_log", "BUILDER-FORWARD-INFERENCE-METRICS-LOG", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "catchup_to_rollover_and_write_image", "CATCHUP-TO-ROLLOVER-AND-WRITE-IMAGE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "catchup_to_rollover", "CATCHUP-TO-ROLLOVER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "catchup_to_rollover_setup", "CATCHUP-TO-ROLLOVER-SETUP", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "load_submitted_transcripts_and_write_image", "LOAD-SUBMITTED-TRANSCRIPTS-AND-WRITE-IMAGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "catchup_to_current_and_write_image_versioned", "CATCHUP-TO-CURRENT-AND-WRITE-IMAGE-VERSIONED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "catchup_to_current_and_write_image", "CATCHUP-TO-CURRENT-AND-WRITE-IMAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "catchup_to_current_kb", "CATCHUP-TO-CURRENT-KB", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "caught_up_on_operationsP", "CAUGHT-UP-ON-OPERATIONS?", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "catch_up_on_operations_verbose", "CATCH-UP-ON-OPERATIONS-VERBOSE", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "catch_up_on_operations_very_verbosely", "CATCH-UP-ON-OPERATIONS-VERY-VERBOSELY", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "run_baseline_tests", "RUN-BASELINE-TESTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "baseline_results_to_map", "BASELINE-RESULTS-TO-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "compute_baseline_regressions", "COMPUTE-BASELINE-REGRESSIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "show_baseline_regression_info", "SHOW-BASELINE-REGRESSION-INFO", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "show_baseline_regression_details", "SHOW-BASELINE-REGRESSION-DETAILS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "declare_cyc_product", "DECLARE-CYC-PRODUCT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "cyc_product_definition_presentP", "CYC-PRODUCT-DEFINITION-PRESENT?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "find_cyc_product", "FIND-CYC-PRODUCT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "cyc_product", "CYC-PRODUCT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "code_product", "CODE-PRODUCT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "kb_product", "KB-PRODUCT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "branch_tag", "BRANCH-TAG", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "set_cyc_product", "SET-CYC-PRODUCT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "set_kb_product", "SET-KB-PRODUCT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "initialize_cyc_product", "INITIALIZE-CYC-PRODUCT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "detect_cyc_product", "DETECT-CYC-PRODUCT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "load_file_dependency_information", "LOAD-FILE-DEPENDENCY-INFORMATION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "augment_file_set", "AUGMENT-FILE-SET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "completely_augment_file_set", "COMPLETELY-AUGMENT-FILE-SET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "write_ant_fileset_declaration", "WRITE-ANT-FILESET-DECLARATION", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "construct_rooted_file_set_from_list", "CONSTRUCT-ROOTED-FILE-SET-FROM-LIST", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "root_file_set", "ROOT-FILE-SET", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "unroot_file_set", "UNROOT-FILE-SET", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "reroot_file_set", "REROOT-FILE-SET", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "test_reroot_file_set", "TEST-REROOT-FILE-SET", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "serialize_kb_store_lru_information", "SERIALIZE-KB-STORE-LRU-INFORMATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "precache_kb_store_by_lru_information", "PRECACHE-KB-STORE-BY-LRU-INFORMATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "set_kb_store_lru_settings", "SET-KB-STORE-LRU-SETTINGS", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "set_kb_store_lru_swap_level", "SET-KB-STORE-LRU-SWAP-LEVEL", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "enumerate_fact_sheets_for_kb_to_file", "ENUMERATE-FACT-SHEETS-FOR-KB-TO-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "enumerate_fact_sheets_for_kb", "ENUMERATE-FACT-SHEETS-FOR-KB", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "fact_sheet_path_for_term_filter_and_transform", "FACT-SHEET-PATH-FOR-TERM-FILTER-AND-TRANSFORM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "specify_sbhl_caching_policy_template", "SPECIFY-SBHL-CACHING-POLICY-TEMPLATE", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "generate_kb_sbhl_caching_policies", "GENERATE-KB-SBHL-CACHING-POLICIES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "generate_legacy_kb_sbhl_caching_policies", "GENERATE-LEGACY-KB-SBHL-CACHING-POLICIES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "generate_completely_cached_kb_sbhl_caching_policies", "GENERATE-COMPLETELY-CACHED-KB-SBHL-CACHING-POLICIES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "propose_kb_sbhl_caching_policies_from_tuning_data", "PROPOSE-KB-SBHL-CACHING-POLICIES-FROM-TUNING-DATA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "propose_completely_cached_kb_sbhl_caching_policies", "PROPOSE-COMPLETELY-CACHED-KB-SBHL-CACHING-POLICIES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "propose_legacy_kb_sbhl_caching_policies", "PROPOSE-LEGACY-KB-SBHL-CACHING-POLICIES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "get_all_sbhl_module_link_predicates", "GET-ALL-SBHL-MODULE-LINK-PREDICATES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "propose_all_sticky_kb_sbhl_caching_policies", "PROPOSE-ALL-STICKY-KB-SBHL-CACHING-POLICIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "start_recording_sbhl_cache_tuning_data", "START-RECORDING-SBHL-CACHE-TUNING-DATA", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "stop_recording_sbhl_cache_tuning_data", "STOP-RECORDING-SBHL-CACHE-TUNING-DATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "gather_data_for_sbhl_cache_tuning", "GATHER-DATA-FOR-SBHL-CACHE-TUNING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "run_sbhl_cache_tuning_data_gathering", "RUN-SBHL-CACHE-TUNING-DATA-GATHERING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "sbhl_cache_tuning_data_gathering_prologue", "SBHL-CACHE-TUNING-DATA-GATHERING-PROLOGUE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "sbhl_cache_tuning_experiment_prologue", "SBHL-CACHE-TUNING-EXPERIMENT-PROLOGUE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "sbhl_cache_tuning_experiment_epilogue", "SBHL-CACHE-TUNING-EXPERIMENT-EPILOGUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "sbhl_cache_tuning_data_gathering_generate_report", "SBHL-CACHE-TUNING-DATA-GATHERING-GENERATE-REPORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "sbhl_cache_tuning_data_gathering_epilogue", "SBHL-CACHE-TUNING-DATA-GATHERING-EPILOGUE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "compile_kb_snapshot_statistics", "COMPILE-KB-SNAPSHOT-STATISTICS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "gather_kb_snapshot_statistics", "GATHER-KB-SNAPSHOT-STATISTICS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "gather_one_kb_snapshot_statistic", "GATHER-ONE-KB-SNAPSHOT-STATISTIC", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "track_kb_snapshot_statistics", "TRACK-KB-SNAPSHOT-STATISTICS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "get_kb_mini_dump_timestamp", "GET-KB-MINI-DUMP-TIMESTAMP", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "prepare_kb_mini_dump", "PREPARE-KB-MINI-DUMP", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "perform_kb_mini_dump", "PERFORM-KB-MINI-DUMP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "launch_asynchronous_kb_mini_dump", "LAUNCH-ASYNCHRONOUS-KB-MINI-DUMP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "mark_kb_mini_dump_as_successful", "MARK-KB-MINI-DUMP-AS-SUCCESSFUL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "build_process_worker_count", "BUILD-PROCESS-WORKER-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "set_build_process_worker_count", "SET-BUILD-PROCESS-WORKER-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "build_process_parallelism_permittedP", "BUILD-PROCESS-PARALLELISM-PERMITTED?", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.builder_utilities", "with_allowed_obfuscation_namespace_support", "WITH-ALLOWED-OBFUSCATION-NAMESPACE-SUPPORT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.builder_utilities", "with_allowed_obfuscation_namespace", "WITH-ALLOWED-OBFUSCATION-NAMESPACE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "allowed_obfuscation_namespace_constantP", "ALLOWED-OBFUSCATION-NAMESPACE-CONSTANT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "un_obfuscatable_constantP", "UN-OBFUSCATABLE-CONSTANT?", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.builder_utilities", "with_constant_obfuscation", "WITH-CONSTANT-OBFUSCATION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "obfuscate_constant_name_via_generator_fn", "OBFUSCATE-CONSTANT-NAME-VIA-GENERATOR-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "obfuscate_constant_name_via_generator_function", "OBFUSCATE-CONSTANT-NAME-VIA-GENERATOR-FUNCTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "new_constant_obfuscation_cache", "NEW-CONSTANT-OBFUSCATION-CACHE", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.builder_utilities", "with_cached_constant_obfuscation", "WITH-CACHED-CONSTANT-OBFUSCATION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "make_obfuscation_gensym_state", "MAKE-OBFUSCATION-GENSYM-STATE", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "obfuscate_constant_name_gensym", "OBFUSCATE-CONSTANT-NAME-GENSYM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "obfuscate_and_dump_essential_kb", "OBFUSCATE-AND-DUMP-ESSENTIAL-KB", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "determine_obfuscation_candidates", "DETERMINE-OBFUSCATION-CANDIDATES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "not_term_of_unit_assertionP", "NOT-TERM-OF-UNIT-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "determine_assertion_obfuscations", "DETERMINE-ASSERTION-OBFUSCATIONS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "determine_nart_obfuscations", "DETERMINE-NART-OBFUSCATIONS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "apply_assertion_obfuscations", "APPLY-ASSERTION-OBFUSCATIONS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "weakly_scramble_string_in_assertions", "WEAKLY-SCRAMBLE-STRING-IN-ASSERTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "weakly_scramble_string_in_nauts", "WEAKLY-SCRAMBLE-STRING-IN-NAUTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "mix_case_string", "MIX-CASE-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "select_clippable_collections", "SELECT-CLIPPABLE-COLLECTIONS", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "higher_order_collectionP", "HIGHER-ORDER-COLLECTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "gather_tabu_collections_for_clipping", "GATHER-TABU-COLLECTIONS-FOR-CLIPPING", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "clip_kb_percentage", "CLIP-KB-PERCENTAGE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "clip_kb_given_tabu_term_list", "CLIP-KB-GIVEN-TABU-TERM-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.builder_utilities", "generate_terms_transcript", "GENERATE-TERMS-TRANSCRIPT", 2, 0, false);
        return (SubLObject)builder_utilities.NIL;
    }
    
    public static SubLObject init_builder_utilities_file() {
        builder_utilities.$standard_regression_conditions$ = SubLFiles.deflexical("*STANDARD-REGRESSION-CONDITIONS*", (SubLObject)builder_utilities.$list97);
        builder_utilities.$all_cyc_products$ = SubLFiles.defparameter("*ALL-CYC-PRODUCTS*", (SubLObject)builder_utilities.NIL);
        builder_utilities.$cyc_product_definitions$ = SubLFiles.defparameter("*CYC-PRODUCT-DEFINITIONS*", (SubLObject)builder_utilities.NIL);
        builder_utilities.$cyc_product$ = SubLFiles.deflexical("*CYC-PRODUCT*", (SubLObject)(maybeDefault((SubLObject)builder_utilities.$sym117$_CYC_PRODUCT_, builder_utilities.$cyc_product$, builder_utilities.NIL)));
        builder_utilities.$code_product$ = SubLFiles.defconstant("*CODE-PRODUCT*", (SubLObject)builder_utilities.$kw110$STANDARD);
        builder_utilities.$kb_product$ = SubLFiles.deflexical("*KB-PRODUCT*", (SubLObject)(maybeDefault((SubLObject)builder_utilities.$sym118$_KB_PRODUCT_, builder_utilities.$kb_product$, builder_utilities.NIL)));
        builder_utilities.$branch_tag$ = SubLFiles.defconstant("*BRANCH-TAG*", (SubLObject)builder_utilities.$str112$head);
        builder_utilities.$generic_sbhl_caching_policy_templates$ = SubLFiles.defparameter("*GENERIC-SBHL-CACHING-POLICY-TEMPLATES*", (SubLObject)ConsesLow.list(new SubLObject[] { specify_sbhl_caching_policy_template((SubLObject)builder_utilities.$kw161$DEFAULT, (SubLObject)builder_utilities.$kw162$STICKY, (SubLObject)builder_utilities.$kw163$UNDEFINED, (SubLObject)builder_utilities.$kw84$ALL, (SubLObject)builder_utilities.UNPROVIDED), specify_sbhl_caching_policy_template(builder_utilities.$const164$genlMt, (SubLObject)builder_utilities.$kw162$STICKY, (SubLObject)builder_utilities.$kw163$UNDEFINED, (SubLObject)builder_utilities.$kw84$ALL, (SubLObject)builder_utilities.$kw84$ALL), specify_sbhl_caching_policy_template(builder_utilities.$const165$isa, (SubLObject)builder_utilities.$kw166$SWAPOUT, (SubLObject)builder_utilities.$int167$10000, (SubLObject)builder_utilities.$int168$8000, (SubLObject)builder_utilities.$int169$2000), specify_sbhl_caching_policy_template(builder_utilities.$const170$quotedIsa, (SubLObject)builder_utilities.$kw166$SWAPOUT, (SubLObject)builder_utilities.$int171$5000, (SubLObject)builder_utilities.$int172$4000, (SubLObject)builder_utilities.$int173$1000), specify_sbhl_caching_policy_template(builder_utilities.$const174$genls, (SubLObject)builder_utilities.$kw166$SWAPOUT, (SubLObject)builder_utilities.$int171$5000, (SubLObject)builder_utilities.$int171$5000, (SubLObject)builder_utilities.$int169$2000), specify_sbhl_caching_policy_template(builder_utilities.$const175$disjointWith, (SubLObject)builder_utilities.$kw166$SWAPOUT, (SubLObject)builder_utilities.$int176$1500, (SubLObject)builder_utilities.$int176$1500, (SubLObject)builder_utilities.$int177$200), specify_sbhl_caching_policy_template(builder_utilities.$const178$genlPreds, (SubLObject)builder_utilities.$kw166$SWAPOUT, (SubLObject)builder_utilities.$int176$1500, (SubLObject)builder_utilities.$int176$1500, (SubLObject)builder_utilities.$int177$200), specify_sbhl_caching_policy_template(builder_utilities.$const179$genlInverse, (SubLObject)builder_utilities.$kw166$SWAPOUT, (SubLObject)builder_utilities.$int176$1500, (SubLObject)builder_utilities.$int176$1500, (SubLObject)builder_utilities.$int177$200), specify_sbhl_caching_policy_template(builder_utilities.$const180$negationPreds, (SubLObject)builder_utilities.$kw166$SWAPOUT, (SubLObject)builder_utilities.$int176$1500, (SubLObject)builder_utilities.$int173$1000, (SubLObject)builder_utilities.ZERO_INTEGER), specify_sbhl_caching_policy_template(builder_utilities.$const181$negationInverse, (SubLObject)builder_utilities.$kw166$SWAPOUT, (SubLObject)builder_utilities.$int176$1500, (SubLObject)builder_utilities.$int173$1000, (SubLObject)builder_utilities.ZERO_INTEGER) }));
        builder_utilities.$cyc_tests_to_use_for_sbhl_cache_tuning$ = SubLFiles.defparameter("*CYC-TESTS-TO-USE-FOR-SBHL-CACHE-TUNING*", (SubLObject)builder_utilities.NIL);
        builder_utilities.$kb_queries_to_use_for_sbhl_cache_tuning$ = SubLFiles.defparameter("*KB-QUERIES-TO-USE-FOR-SBHL-CACHE-TUNING*", (SubLObject)builder_utilities.NIL);
        builder_utilities.$run_cyclops_for_sbhl_cache_tuningP$ = SubLFiles.defparameter("*RUN-CYCLOPS-FOR-SBHL-CACHE-TUNING?*", (SubLObject)builder_utilities.NIL);
        builder_utilities.$build_process_worker_count$ = SubLFiles.deflexical("*BUILD-PROCESS-WORKER-COUNT*", (SubLObject)builder_utilities.ONE_INTEGER);
        builder_utilities.$allowed_obfuscation_name_spaces$ = SubLFiles.defparameter("*ALLOWED-OBFUSCATION-NAME-SPACES*", (SubLObject)builder_utilities.NIL);
        builder_utilities.$constant_obfuscation_name_generator_state$ = SubLFiles.defparameter("*CONSTANT-OBFUSCATION-NAME-GENERATOR-STATE*", (SubLObject)builder_utilities.NIL);
        builder_utilities.$constant_obfuscation_cache$ = SubLFiles.defparameter("*CONSTANT-OBFUSCATION-CACHE*", (SubLObject)builder_utilities.NIL);
        builder_utilities.$ts_comment_stream$ = SubLFiles.defparameter("*TS-COMMENT-STREAM*", (SubLObject)builder_utilities.NIL);
        return (SubLObject)builder_utilities.NIL;
    }
    
    public static SubLObject setup_builder_utilities_file() {
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym2$CYC_BUILD_WORLD_VERIFY);
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym16$CYC_LOAD_KB);
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym17$CYC_LOAD_INCREMENTAL_KB);
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym18$CYC_DUMP_STANDARD_KB);
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym20$CYC_SNAPSHOT_KB);
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym22$CYC_DUMP_SNAPSHOT_KB);
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym28$SUGGEST_KB_SNAPSHOT_DIRECTORY);
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym81$RUN_BASELINE_TESTS);
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym88$BASELINE_RESULTS_TO_MAP);
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym91$COMPUTE_BASELINE_REGRESSIONS);
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym94$SHOW_BASELINE_REGRESSION_INFO);
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym98$SHOW_BASELINE_REGRESSION_DETAILS);
        declare_cyc_product((SubLObject)builder_utilities.$kw109$HEAD, (SubLObject)builder_utilities.$kw110$STANDARD, (SubLObject)builder_utilities.$kw111$FULL, (SubLObject)builder_utilities.$str112$head);
        declare_cyc_product((SubLObject)builder_utilities.$kw113$CAE_0_3, (SubLObject)builder_utilities.$kw114$TKB, (SubLObject)builder_utilities.$kw115$AKB, (SubLObject)builder_utilities.$str116$cake_release_0p3_20051215);
        subl_macro_promotions.declare_defglobal((SubLObject)builder_utilities.$sym117$_CYC_PRODUCT_);
        subl_macro_promotions.declare_defglobal((SubLObject)builder_utilities.$sym118$_KB_PRODUCT_);
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym120$LOAD_FILE_DEPENDENCY_INFORMATION);
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym123$AUGMENT_FILE_SET);
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym124$COMPLETELY_AUGMENT_FILE_SET);
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym126$WRITE_ANT_FILESET_DECLARATION);
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym135$CONSTRUCT_ROOTED_FILE_SET_FROM_LIST);
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym137$ROOT_FILE_SET);
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym138$UNROOT_FILE_SET);
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym139$REROOT_FILE_SET);
        generic_testing.define_test_case_table_int((SubLObject)builder_utilities.$sym140$TEST_REROOT_FILE_SET, (SubLObject)ConsesLow.list(new SubLObject[] { builder_utilities.$kw141$TEST, builder_utilities.NIL, builder_utilities.$kw142$OWNER, builder_utilities.NIL, builder_utilities.$kw143$CLASSES, builder_utilities.NIL, builder_utilities.$kw144$KB, builder_utilities.$kw145$TINY, builder_utilities.$kw146$WORKING_, builder_utilities.T }), (SubLObject)builder_utilities.$list147);
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym150$SERIALIZE_KB_STORE_LRU_INFORMATION);
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym153$PRECACHE_KB_STORE_BY_LRU_INFORMATION);
        utilities_macros.note_funcall_helper_function((SubLObject)builder_utilities.$sym160$FACT_SHEET_PATH_FOR_TERM_FILTER_AND_TRANSFORM);
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym196$COMPILE_KB_SNAPSHOT_STATISTICS);
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym207$GATHER_KB_SNAPSHOT_STATISTICS);
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym220$TRACK_KB_SNAPSHOT_STATISTICS);
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym227$GET_KB_MINI_DUMP_TIMESTAMP);
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym228$PREPARE_KB_MINI_DUMP);
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym230$PERFORM_KB_MINI_DUMP);
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym233$LAUNCH_ASYNCHRONOUS_KB_MINI_DUMP);
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym236$BUILD_PROCESS_WORKER_COUNT);
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym237$SET_BUILD_PROCESS_WORKER_COUNT);
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym238$BUILD_PROCESS_PARALLELISM_PERMITTED_);
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym239$WITH_ALLOWED_OBFUSCATION_NAMESPACE_SUPPORT);
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym242$WITH_ALLOWED_OBFUSCATION_NAMESPACE);
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym247$ALLOWED_OBFUSCATION_NAMESPACE_CONSTANT_);
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym249$UN_OBFUSCATABLE_CONSTANT_);
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym250$WITH_CONSTANT_OBFUSCATION);
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym257$OBFUSCATE_CONSTANT_NAME_VIA_GENERATOR_FN);
        access_macros.register_macro_helper((SubLObject)builder_utilities.$sym261$NEW_CONSTANT_OBFUSCATION_CACHE, (SubLObject)builder_utilities.$sym262$WITH_CACHED_CONSTANT_OBFUSCATION);
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym262$WITH_CACHED_CONSTANT_OBFUSCATION);
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym265$MAKE_OBFUSCATION_GENSYM_STATE);
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym270$OBFUSCATE_CONSTANT_NAME_GENSYM);
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym273$OBFUSCATE_AND_DUMP_ESSENTIAL_KB);
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym277$DETERMINE_OBFUSCATION_CANDIDATES);
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym283$DETERMINE_ASSERTION_OBFUSCATIONS);
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym287$DETERMINE_NART_OBFUSCATIONS);
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym290$APPLY_ASSERTION_OBFUSCATIONS);
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym297$WEAKLY_SCRAMBLE_STRING_IN_ASSERTIONS);
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym298$WEAKLY_SCRAMBLE_STRING_IN_NAUTS);
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym299$MIX_CASE_STRING);
        access_macros.register_external_symbol((SubLObject)builder_utilities.$sym338$GENERATE_TERMS_TRANSCRIPT);
        return (SubLObject)builder_utilities.NIL;
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
    
    static {
        me = (SubLFile)new builder_utilities();
        builder_utilities.$standard_regression_conditions$ = null;
        builder_utilities.$all_cyc_products$ = null;
        builder_utilities.$cyc_product_definitions$ = null;
        builder_utilities.$cyc_product$ = null;
        builder_utilities.$code_product$ = null;
        builder_utilities.$kb_product$ = null;
        builder_utilities.$branch_tag$ = null;
        builder_utilities.$generic_sbhl_caching_policy_templates$ = null;
        builder_utilities.$cyc_tests_to_use_for_sbhl_cache_tuning$ = null;
        builder_utilities.$kb_queries_to_use_for_sbhl_cache_tuning$ = null;
        builder_utilities.$run_cyclops_for_sbhl_cache_tuningP$ = null;
        builder_utilities.$build_process_worker_count$ = null;
        builder_utilities.$allowed_obfuscation_name_spaces$ = null;
        builder_utilities.$constant_obfuscation_name_generator_state$ = null;
        builder_utilities.$constant_obfuscation_cache$ = null;
        builder_utilities.$ts_comment_stream$ = null;
        $kw0$TERSE = SubLObjectFactory.makeKeyword("TERSE");
        $str1$This_cyc_image_is_no_longer_usabl = SubLObjectFactory.makeString("This cyc image is no longer usable and will now exit.");
        $sym2$CYC_BUILD_WORLD_VERIFY = SubLObjectFactory.makeSymbol("CYC-BUILD-WORLD-VERIFY");
        $str3$Continue = SubLObjectFactory.makeString("Continue");
        $str4$World_file__A_already_exists_and_ = SubLObjectFactory.makeString("World file ~A already exists and may not be overwritable if in use.");
        $str5$A = SubLObjectFactory.makeString("A");
        $str6$cyc_ = SubLObjectFactory.makeString("cyc-");
        $str7$_ = SubLObjectFactory.makeString("-");
        $str8$_kb_ = SubLObjectFactory.makeString("-kb-");
        $str9$_cyc_ = SubLObjectFactory.makeString("/cyc/");
        $str10$_ = SubLObjectFactory.makeString("/");
        $str11$_install_ = SubLObjectFactory.makeString("/install/");
        $str12$kb_ = SubLObjectFactory.makeString("kb-");
        $str13$_load = SubLObjectFactory.makeString(".load");
        $sym14$DIRECTORY_P = SubLObjectFactory.makeSymbol("DIRECTORY-P");
        $str15$Writing_cyc_image_to__A__ = SubLObjectFactory.makeString("Writing cyc image to ~A~%");
        $sym16$CYC_LOAD_KB = SubLObjectFactory.makeSymbol("CYC-LOAD-KB");
        $sym17$CYC_LOAD_INCREMENTAL_KB = SubLObjectFactory.makeSymbol("CYC-LOAD-INCREMENTAL-KB");
        $sym18$CYC_DUMP_STANDARD_KB = SubLObjectFactory.makeSymbol("CYC-DUMP-STANDARD-KB");
        $str19$This_CYC_is_receiving_operations_ = SubLObjectFactory.makeString("This CYC is receiving operations; KB changes during a snapshot will invalidate the dump.");
        $sym20$CYC_SNAPSHOT_KB = SubLObjectFactory.makeSymbol("CYC-SNAPSHOT-KB");
        $kw21$MINIMAL = SubLObjectFactory.makeKeyword("MINIMAL");
        $sym22$CYC_DUMP_SNAPSHOT_KB = SubLObjectFactory.makeSymbol("CYC-DUMP-SNAPSHOT-KB");
        $str23$Dump_snapshot_KB_trivially_finish = SubLObjectFactory.makeString("Dump snapshot KB trivially finished: dump directory and current units are both ~S");
        $str24$Setting_up_safe_KB_dump_environme = SubLObjectFactory.makeString("Setting up safe KB dump environment");
        $str25$Agenda_was_not_successfully_halte = SubLObjectFactory.makeString("Agenda was not successfully halted!");
        $kw26$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $str27$Restoring_pre_dump_environment = SubLObjectFactory.makeString("Restoring pre-dump environment");
        $sym28$SUGGEST_KB_SNAPSHOT_DIRECTORY = SubLObjectFactory.makeSymbol("SUGGEST-KB-SNAPSHOT-DIRECTORY");
        $str29$The_base_directory__A_does_not_ex = SubLObjectFactory.makeString("The base directory ~A does not exist.~%");
        $str30$Loaded_KB_version___A__ = SubLObjectFactory.makeString("Loaded KB version: ~A~%");
        $str31$TheBuilder = SubLObjectFactory.makeString("TheBuilder");
        $str32$yes = SubLObjectFactory.makeString("yes");
        $str33$Determining_total_transcript_ops_ = SubLObjectFactory.makeString("Determining total transcript ops ....");
        $str34$__Total_transcription_ops__A___ = SubLObjectFactory.makeString("~&Total transcription ops ~A.~%");
        $str35$Getting_caught_up_on_operations__ = SubLObjectFactory.makeString("Getting caught up on operations ....");
        $str36$__Catch_up_completed__Ops_remaini = SubLObjectFactory.makeString("~&Catch-up completed. Ops remaining ~A.~%");
        $str37$Post_catch_up_KB_version___A__ = SubLObjectFactory.makeString("Post catch-up KB version: ~A~%");
        $kw38$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym39$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $str40$Post_load_transcript_KB_version__ = SubLObjectFactory.makeString("Post load transcript KB version: ~A~%");
        $str41$no = SubLObjectFactory.makeString("no");
        $str42$__Successfully_created__S_units__ = SubLObjectFactory.makeString("~&Successfully created ~S units: ~A~%");
        $str43$_home_builder_logs_ = SubLObjectFactory.makeString("/home/builder/logs/");
        $str44$No_log_directory__A_____strange__ = SubLObjectFactory.makeString("No log directory ~A ... strange.~%");
        $str45$forward_inference_metrics_ = SubLObjectFactory.makeString("forward-inference-metrics-");
        $str46$_html = SubLObjectFactory.makeString(".html");
        $str47$The_catchup_image_expected_to_be_ = SubLObjectFactory.makeString("The catchup image expected to be using world ~A but has ~A.");
        $str48$Builder_s_catchup_to_rollover_ser = SubLObjectFactory.makeString("Builder's catchup-to-rollover server - DO NOT USE");
        $kw49$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $str50$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $str51$Getting_caught_up_to_KB_rollover_ = SubLObjectFactory.makeString("Getting caught up to KB rollover to ");
        $sym52$KB_FULL_TRANSCRIPT_LOADED = SubLObjectFactory.makeSymbol("KB-FULL-TRANSCRIPT-LOADED");
        $str53$The_agenda_is_not_running___Fix_y = SubLObjectFactory.makeString("The agenda is not running.  Fix your init files, probably parameters.lisp.");
        $kw54$RECEIVE_ONLY = SubLObjectFactory.makeKeyword("RECEIVE-ONLY");
        $const55$Guest = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Guest"));
        $str56$CycAdministrator = SubLObjectFactory.makeString("CycAdministrator");
        $str57$Getting_caught_up__ = SubLObjectFactory.makeString("Getting caught up~%");
        $str58$Builder_s_transcript_loading_serv = SubLObjectFactory.makeString("Builder's transcript-loading server - DO NOT USE");
        $kw59$NONE = SubLObjectFactory.makeKeyword("NONE");
        $str60$Builder_s_catchup_to_current_serv = SubLObjectFactory.makeString("Builder's catchup-to-current server - DO NOT USE");
        $str61$Getting_caught_up_from_KB_ = SubLObjectFactory.makeString("Getting caught up from KB ");
        $str62$_ = SubLObjectFactory.makeString(".");
        $str63$_to_KB_ = SubLObjectFactory.makeString(" to KB ");
        $kw64$DEAF = SubLObjectFactory.makeKeyword("DEAF");
        $str65$Caught_up_to_KB__A__ = SubLObjectFactory.makeString("Caught up to KB ~A~%");
        $sym66$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $str67$Could_not_get_total_master_transc = SubLObjectFactory.makeString("Could not get total master transcript operations for KB ~a after rolling over from KB ~a");
        $str68$Now_getting_caught_up_from_KB_ = SubLObjectFactory.makeString("Now getting caught up from KB ");
        $str69$__Catching_up_on_operations_took_ = SubLObjectFactory.makeString("~%Catching up on operations took: ~A secs~%");
        $kw70$SILENT = SubLObjectFactory.makeKeyword("SILENT");
        $str71$___A__ = SubLObjectFactory.makeString("~&~A~%");
        $str72$___s_constant_A__A__ = SubLObjectFactory.makeString("  ~s constant~A ~A~%");
        $str73$s_were = SubLObjectFactory.makeString("s were");
        $str74$_was = SubLObjectFactory.makeString(" was");
        $str75$created = SubLObjectFactory.makeString("created");
        $str76$destroyed = SubLObjectFactory.makeString("destroyed");
        $str77$___s_nart_A__A__ = SubLObjectFactory.makeString("  ~s nart~A ~A~%");
        $str78$___s_assertion_A__A__ = SubLObjectFactory.makeString("  ~s assertion~A ~A~%");
        $str79$___s_kb_hl_support_A__A__ = SubLObjectFactory.makeString("  ~s kb-hl-support~A ~A~%");
        $str80$___s_deduction_A__A__ = SubLObjectFactory.makeString("  ~s deduction~A ~A~%");
        $sym81$RUN_BASELINE_TESTS = SubLObjectFactory.makeSymbol("RUN-BASELINE-TESTS");
        $str82$tests_post_build_testdcl_lisp = SubLObjectFactory.makeString("tests/post-build-testdcl.lisp");
        $kw83$POST_BUILD = SubLObjectFactory.makeKeyword("POST-BUILD");
        $kw84$ALL = SubLObjectFactory.makeKeyword("ALL");
        $str85$release_baseline_tests_ = SubLObjectFactory.makeString("release-baseline-tests-");
        $str86$_cfasl = SubLObjectFactory.makeString(".cfasl");
        $str87$Writing_result_file = SubLObjectFactory.makeString("Writing result file");
        $sym88$BASELINE_RESULTS_TO_MAP = SubLObjectFactory.makeSymbol("BASELINE-RESULTS-TO-MAP");
        $list89 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CATEGORY"), (SubLObject)SubLObjectFactory.makeSymbol("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("OUTCOME"), (SubLObject)SubLObjectFactory.makeSymbol("TIME"));
        $int90$100 = SubLObjectFactory.makeInteger(100);
        $sym91$COMPUTE_BASELINE_REGRESSIONS = SubLObjectFactory.makeSymbol("COMPUTE-BASELINE-REGRESSIONS");
        $list92 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("B-OUTCOME"));
        $kw93$NOT_PRESENT = SubLObjectFactory.makeKeyword("NOT-PRESENT");
        $sym94$SHOW_BASELINE_REGRESSION_INFO = SubLObjectFactory.makeSymbol("SHOW-BASELINE-REGRESSION-INFO");
        $list95 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CATEGORY"), (SubLObject)SubLObjectFactory.makeSymbol("INFO"));
        $str96$___S__ = SubLObjectFactory.makeString("~%~S~%");
        $list97 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("SUCCESS"), (SubLObject)SubLObjectFactory.makeKeyword("FAILURE")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("SUCCESS"), (SubLObject)SubLObjectFactory.makeKeyword("INVALID")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("SUCCESS"), (SubLObject)SubLObjectFactory.makeKeyword("ERROR")));
        $sym98$SHOW_BASELINE_REGRESSION_DETAILS = SubLObjectFactory.makeSymbol("SHOW-BASELINE-REGRESSION-DETAILS");
        $list99 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CATEGORY"), (SubLObject)SubLObjectFactory.makeSymbol("CAT-MAP"));
        $sym100$TERM__ = SubLObjectFactory.makeSymbol("TERM-<");
        $str101$__S__ = SubLObjectFactory.makeString(" ~S~%");
        $str102$___S__ = SubLObjectFactory.makeString("  ~S~%");
        $sym103$KEYWORDP = SubLObjectFactory.makeSymbol("KEYWORDP");
        $sym104$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $str105$The_cyc_product___A__is_already_p = SubLObjectFactory.makeString("The cyc product, ~A, is already present with the declared definition.");
        $str106$There_already_exists_a_different_ = SubLObjectFactory.makeString("There already exists a different cyc product, ~A, with this definition.");
        $str107$The_cyc_product__A_already_exists = SubLObjectFactory.makeString("The cyc product ~A already exists with a different definition.");
        $sym108$CDR = SubLObjectFactory.makeSymbol("CDR");
        $kw109$HEAD = SubLObjectFactory.makeKeyword("HEAD");
        $kw110$STANDARD = SubLObjectFactory.makeKeyword("STANDARD");
        $kw111$FULL = SubLObjectFactory.makeKeyword("FULL");
        $str112$head = SubLObjectFactory.makeString("head");
        $kw113$CAE_0_3 = SubLObjectFactory.makeKeyword("CAE-0.3");
        $kw114$TKB = SubLObjectFactory.makeKeyword("TKB");
        $kw115$AKB = SubLObjectFactory.makeKeyword("AKB");
        $str116$cake_release_0p3_20051215 = SubLObjectFactory.makeString("cake-release-0p3-20051215");
        $sym117$_CYC_PRODUCT_ = SubLObjectFactory.makeSymbol("*CYC-PRODUCT*");
        $sym118$_KB_PRODUCT_ = SubLObjectFactory.makeSymbol("*KB-PRODUCT*");
        $kw119$UNKNOWN_CYC_PRODUCT = SubLObjectFactory.makeKeyword("UNKNOWN-CYC-PRODUCT");
        $sym120$LOAD_FILE_DEPENDENCY_INFORMATION = SubLObjectFactory.makeSymbol("LOAD-FILE-DEPENDENCY-INFORMATION");
        $kw121$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $sym122$WHITESPACE_CHAR_P = SubLObjectFactory.makeSymbol("WHITESPACE-CHAR-P");
        $sym123$AUGMENT_FILE_SET = SubLObjectFactory.makeSymbol("AUGMENT-FILE-SET");
        $sym124$COMPLETELY_AUGMENT_FILE_SET = SubLObjectFactory.makeSymbol("COMPLETELY-AUGMENT-FILE-SET");
        $str125$Augmenting_the_file_set_not_termi = SubLObjectFactory.makeString("Augmenting the file set not terminating after ~A iterations.");
        $sym126$WRITE_ANT_FILESET_DECLARATION = SubLObjectFactory.makeSymbol("WRITE-ANT-FILESET-DECLARATION");
        $str127$id = SubLObjectFactory.makeString("id");
        $str128$dir = SubLObjectFactory.makeString("dir");
        $str129$fileset = SubLObjectFactory.makeString("fileset");
        $kw130$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $str131$name = SubLObjectFactory.makeString("name");
        $kw132$VALUE = SubLObjectFactory.makeKeyword("VALUE");
        $str133$include = SubLObjectFactory.makeString("include");
        $str134$exclude = SubLObjectFactory.makeString("exclude");
        $sym135$CONSTRUCT_ROOTED_FILE_SET_FROM_LIST = SubLObjectFactory.makeSymbol("CONSTRUCT-ROOTED-FILE-SET-FROM-LIST");
        $kw136$UNIX = SubLObjectFactory.makeKeyword("UNIX");
        $sym137$ROOT_FILE_SET = SubLObjectFactory.makeSymbol("ROOT-FILE-SET");
        $sym138$UNROOT_FILE_SET = SubLObjectFactory.makeSymbol("UNROOT-FILE-SET");
        $sym139$REROOT_FILE_SET = SubLObjectFactory.makeSymbol("REROOT-FILE-SET");
        $sym140$TEST_REROOT_FILE_SET = SubLObjectFactory.makeSymbol("TEST-REROOT-FILE-SET");
        $kw141$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw142$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw143$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw144$KB = SubLObjectFactory.makeKeyword("KB");
        $kw145$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw146$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list147 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("/cycdoc/img/cb/red_diam.gif"), (SubLObject)SubLObjectFactory.makeString("/cycdoc/img/square-minus.gif")), (SubLObject)SubLObjectFactory.makeString("/cycdoc"), (SubLObject)SubLObjectFactory.makeString("doc")), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")));
        $str148$Rerooting_from__A_to__A_failed_an = SubLObjectFactory.makeString("Rerooting from ~A to ~A failed and produced ~A.");
        $kw149$SUCCESS = SubLObjectFactory.makeKeyword("SUCCESS");
        $sym150$SERIALIZE_KB_STORE_LRU_INFORMATION = SubLObjectFactory.makeSymbol("SERIALIZE-KB-STORE-LRU-INFORMATION");
        $str151$Serializing_LRU_information_for_K = SubLObjectFactory.makeString("Serializing LRU information for KB Store to ");
        $str152$cdolist = SubLObjectFactory.makeString("cdolist");
        $sym153$PRECACHE_KB_STORE_BY_LRU_INFORMATION = SubLObjectFactory.makeSymbol("PRECACHE-KB-STORE-BY-LRU-INFORMATION");
        $str154$Precaching_KB_Store_with_LRU_info = SubLObjectFactory.makeString("Precaching KB Store with LRU info from ");
        $float155$0_212 = (SubLFloat)SubLObjectFactory.makeDouble(0.212);
        $int156$30000 = SubLObjectFactory.makeInteger(30000);
        $int157$22000 = SubLObjectFactory.makeInteger(22000);
        $float158$0_424 = (SubLFloat)SubLObjectFactory.makeDouble(0.424);
        $int159$1600 = SubLObjectFactory.makeInteger(1600);
        $sym160$FACT_SHEET_PATH_FOR_TERM_FILTER_AND_TRANSFORM = SubLObjectFactory.makeSymbol("FACT-SHEET-PATH-FOR-TERM-FILTER-AND-TRANSFORM");
        $kw161$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $kw162$STICKY = SubLObjectFactory.makeKeyword("STICKY");
        $kw163$UNDEFINED = SubLObjectFactory.makeKeyword("UNDEFINED");
        $const164$genlMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt"));
        $const165$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $kw166$SWAPOUT = SubLObjectFactory.makeKeyword("SWAPOUT");
        $int167$10000 = SubLObjectFactory.makeInteger(10000);
        $int168$8000 = SubLObjectFactory.makeInteger(8000);
        $int169$2000 = SubLObjectFactory.makeInteger(2000);
        $const170$quotedIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $int171$5000 = SubLObjectFactory.makeInteger(5000);
        $int172$4000 = SubLObjectFactory.makeInteger(4000);
        $int173$1000 = SubLObjectFactory.makeInteger(1000);
        $const174$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $const175$disjointWith = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("disjointWith"));
        $int176$1500 = SubLObjectFactory.makeInteger(1500);
        $int177$200 = SubLObjectFactory.makeInteger(200);
        $const178$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $const179$genlInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse"));
        $const180$negationPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationPreds"));
        $const181$negationInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationInverse"));
        $sym182$DICTIONARY_P = SubLObjectFactory.makeSymbol("DICTIONARY-P");
        $sym183$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $str184$The_templates_list__A_does_not_co = SubLObjectFactory.makeString("The templates list ~A does not contain a default rule.");
        $list185 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("POLICY"), (SubLObject)SubLObjectFactory.makeSymbol("CAPACITY"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("EXEMPT"), (SubLObject)SubLObjectFactory.makeSymbol("PREFETCH"));
        $list186 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeUninternedSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE"));
        $kw187$RECORDING = SubLObjectFactory.makeKeyword("RECORDING");
        $str188$Gathering_SBHL_cache_tuning_data_ = SubLObjectFactory.makeString("Gathering SBHL cache tuning data via CYC tests ....");
        $sym189$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $kw190$CYC_TESTS = SubLObjectFactory.makeKeyword("CYC-TESTS");
        $str191$Gathering_SBHL_cache_tuning_data_ = SubLObjectFactory.makeString("Gathering SBHL cache tuning data via KB queries ....");
        $str192$KBQ_Support_currently_not_impleme = SubLObjectFactory.makeString("KBQ Support currently not implemented");
        $kw193$KB_QUERIES = SubLObjectFactory.makeKeyword("KB-QUERIES");
        $str194$Gathering_SBHL_cache_tuning_data_ = SubLObjectFactory.makeString("Gathering SBHL cache tuning data via CycLOPs ....");
        $kw195$CYCLOPS = SubLObjectFactory.makeKeyword("CYCLOPS");
        $sym196$COMPILE_KB_SNAPSHOT_STATISTICS = SubLObjectFactory.makeSymbol("COMPILE-KB-SNAPSHOT-STATISTICS");
        $kw197$REVERSAL = SubLObjectFactory.makeKeyword("REVERSAL");
        $kw198$TOMBSTONE = SubLObjectFactory.makeKeyword("TOMBSTONE");
        $kw199$INDEX_ENTRIES = SubLObjectFactory.makeKeyword("INDEX-ENTRIES");
        $kw200$DATA_BYTES = SubLObjectFactory.makeKeyword("DATA-BYTES");
        $str201$category = SubLObjectFactory.makeString("category");
        $str202$numOfEdits = SubLObjectFactory.makeString("numOfEdits");
        $str203$numOfDeletes = SubLObjectFactory.makeString("numOfDeletes");
        $str204$numOfEntries = SubLObjectFactory.makeString("numOfEntries");
        $str205$numOfBytes = SubLObjectFactory.makeString("numOfBytes");
        $str206$fragBytes = SubLObjectFactory.makeString("fragBytes");
        $sym207$GATHER_KB_SNAPSHOT_STATISTICS = SubLObjectFactory.makeSymbol("GATHER-KB-SNAPSHOT-STATISTICS");
        $kw208$IN_PROGRESS = SubLObjectFactory.makeKeyword("IN-PROGRESS");
        $list209 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DATA-FILE"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-FILE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-DATA-FILE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-INDEX-FILE")));
        $list210 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DATA-FILE"), (SubLObject)SubLObjectFactory.makeKeyword("INDEX-FILE"), (SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("COMPLEX-DATA-FILE"), (SubLObject)SubLObjectFactory.makeKeyword("COMPLEX-INDEX-FILE"));
        $kw211$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw212$DATA_FILE = SubLObjectFactory.makeKeyword("DATA-FILE");
        $kw213$INDEX_FILE = SubLObjectFactory.makeKeyword("INDEX-FILE");
        $kw214$TYPE = SubLObjectFactory.makeKeyword("TYPE");
        $kw215$COMPLEX_DATA_FILE = SubLObjectFactory.makeKeyword("COMPLEX-DATA-FILE");
        $kw216$COMPLEX_INDEX_FILE = SubLObjectFactory.makeKeyword("COMPLEX-INDEX-FILE");
        $kw217$KNOWLEDGE = SubLObjectFactory.makeKeyword("KNOWLEDGE");
        $kw218$INDEXING = SubLObjectFactory.makeKeyword("INDEXING");
        $str219$Unsupported_file_vector_type__A__ = SubLObjectFactory.makeString("Unsupported file vector type ~A ....~%");
        $sym220$TRACK_KB_SNAPSHOT_STATISTICS = SubLObjectFactory.makeSymbol("TRACK-KB-SNAPSHOT-STATISTICS");
        $str221$GATHER_KB_SNAPSHOT_STATISTICS = SubLObjectFactory.makeString("GATHER-KB-SNAPSHOT-STATISTICS");
        $str222$__Check_at__A_______ = SubLObjectFactory.makeString("~%Check at ~A ....~%");
        $str223$_A_____in_progress__ = SubLObjectFactory.makeString("~A ... in progress~%");
        $str224$_A_____errored___A___ = SubLObjectFactory.makeString("~A ... errored (~A)~%");
        $str225$_A___A_edits___A_deletes___A_entr = SubLObjectFactory.makeString("~A: ~A edits, ~A deletes, ~A entries, ~A bytes.~%");
        $str226$Unknown_category__A_____dont_know = SubLObjectFactory.makeString("Unknown category ~A ... dont know what to do.~%");
        $sym227$GET_KB_MINI_DUMP_TIMESTAMP = SubLObjectFactory.makeSymbol("GET-KB-MINI-DUMP-TIMESTAMP");
        $sym228$PREPARE_KB_MINI_DUMP = SubLObjectFactory.makeSymbol("PREPARE-KB-MINI-DUMP");
        $kw229$CYC_API = SubLObjectFactory.makeKeyword("CYC-API");
        $sym230$PERFORM_KB_MINI_DUMP = SubLObjectFactory.makeSymbol("PERFORM-KB-MINI-DUMP");
        $str231$Error_while_performing_mini_dump_ = SubLObjectFactory.makeString("Error while performing mini-dump~%~A~%");
        $kw232$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $sym233$LAUNCH_ASYNCHRONOUS_KB_MINI_DUMP = SubLObjectFactory.makeSymbol("LAUNCH-ASYNCHRONOUS-KB-MINI-DUMP");
        $str234$Mini_KB_Dumper = SubLObjectFactory.makeString("Mini KB Dumper");
        $str235$mini_dump_finished_text = SubLObjectFactory.makeString("mini-dump-finished.text");
        $sym236$BUILD_PROCESS_WORKER_COUNT = SubLObjectFactory.makeSymbol("BUILD-PROCESS-WORKER-COUNT");
        $sym237$SET_BUILD_PROCESS_WORKER_COUNT = SubLObjectFactory.makeSymbol("SET-BUILD-PROCESS-WORKER-COUNT");
        $sym238$BUILD_PROCESS_PARALLELISM_PERMITTED_ = SubLObjectFactory.makeSymbol("BUILD-PROCESS-PARALLELISM-PERMITTED?");
        $sym239$WITH_ALLOWED_OBFUSCATION_NAMESPACE_SUPPORT = SubLObjectFactory.makeSymbol("WITH-ALLOWED-OBFUSCATION-NAMESPACE-SUPPORT");
        $sym240$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list241 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*ALLOWED-OBFUSCATION-NAME-SPACES*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeString("cyc"))));
        $sym242$WITH_ALLOWED_OBFUSCATION_NAMESPACE = SubLObjectFactory.makeSymbol("WITH-ALLOWED-OBFUSCATION-NAMESPACE");
        $list243 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAMESPACE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym244$_ALLOWED_OBFUSCATION_NAME_SPACES_ = SubLObjectFactory.makeSymbol("*ALLOWED-OBFUSCATION-NAME-SPACES*");
        $sym245$CONS = SubLObjectFactory.makeSymbol("CONS");
        $list246 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*ALLOWED-OBFUSCATION-NAME-SPACES*"));
        $sym247$ALLOWED_OBFUSCATION_NAMESPACE_CONSTANT_ = SubLObjectFactory.makeSymbol("ALLOWED-OBFUSCATION-NAMESPACE-CONSTANT?");
        $str248$cyc = SubLObjectFactory.makeString("cyc");
        $sym249$UN_OBFUSCATABLE_CONSTANT_ = SubLObjectFactory.makeSymbol("UN-OBFUSCATABLE-CONSTANT?");
        $sym250$WITH_CONSTANT_OBFUSCATION = SubLObjectFactory.makeSymbol("WITH-CONSTANT-OBFUSCATION");
        $list251 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STATE"), (SubLObject)SubLObjectFactory.makeKeyword("UNPROVIDED"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $kw252$UNPROVIDED = SubLObjectFactory.makeKeyword("UNPROVIDED");
        $sym253$STATE_VAL = SubLObjectFactory.makeUninternedSymbol("STATE-VAL");
        $sym254$_CONSTANT_OBFUSCATION_NAME_GENERATOR_STATE_ = SubLObjectFactory.makeSymbol("*CONSTANT-OBFUSCATION-NAME-GENERATOR-STATE*");
        $sym255$WITH_CONSTANT_NAME_OBFUSCATION = SubLObjectFactory.makeSymbol("WITH-CONSTANT-NAME-OBFUSCATION");
        $list256 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("OBFUSCATE-CONSTANT-NAME-VIA-GENERATOR-FN"));
        $sym257$OBFUSCATE_CONSTANT_NAME_VIA_GENERATOR_FN = SubLObjectFactory.makeSymbol("OBFUSCATE-CONSTANT-NAME-VIA-GENERATOR-FN");
        $list258 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("GENERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("STATE"));
        $kw259$NOT_FOUND = SubLObjectFactory.makeKeyword("NOT-FOUND");
        $str260$_ = SubLObjectFactory.makeString("_");
        $sym261$NEW_CONSTANT_OBFUSCATION_CACHE = SubLObjectFactory.makeSymbol("NEW-CONSTANT-OBFUSCATION-CACHE");
        $sym262$WITH_CACHED_CONSTANT_OBFUSCATION = SubLObjectFactory.makeSymbol("WITH-CACHED-CONSTANT-OBFUSCATION");
        $sym263$KBEQ = SubLObjectFactory.makeSymbol("KBEQ");
        $list264 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CONSTANT-OBFUSCATION-CACHE*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CONSTANT-OBFUSCATION-CACHE"))));
        $sym265$MAKE_OBFUSCATION_GENSYM_STATE = SubLObjectFactory.makeSymbol("MAKE-OBFUSCATION-GENSYM-STATE");
        $str266$C = SubLObjectFactory.makeString("C");
        $kw267$ISG = SubLObjectFactory.makeKeyword("ISG");
        $kw268$UPCASE = SubLObjectFactory.makeKeyword("UPCASE");
        $kw269$DOWNCASE = SubLObjectFactory.makeKeyword("DOWNCASE");
        $sym270$OBFUSCATE_CONSTANT_NAME_GENSYM = SubLObjectFactory.makeSymbol("OBFUSCATE-CONSTANT-NAME-GENSYM");
        $list271 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("ISG"), (SubLObject)SubLObjectFactory.makeSymbol("UPCASE"), (SubLObject)SubLObjectFactory.makeSymbol("DOWNCASE"));
        $list272 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ISG"), (SubLObject)SubLObjectFactory.makeKeyword("UPCASE"), (SubLObject)SubLObjectFactory.makeKeyword("DOWNCASE"));
        $sym273$OBFUSCATE_AND_DUMP_ESSENTIAL_KB = SubLObjectFactory.makeSymbol("OBFUSCATE-AND-DUMP-ESSENTIAL-KB");
        $str274$Obfuscating_strings_in_Assertions = SubLObjectFactory.makeString("Obfuscating strings in Assertions");
        $str275$Obfuscating_strings_in_NARTs = SubLObjectFactory.makeString("Obfuscating strings in NARTs");
        $str276$KB_has_been_obfuscated__rendering = SubLObjectFactory.makeString("KB has been obfuscated, rendering this image unusable.");
        $sym277$DETERMINE_OBFUSCATION_CANDIDATES = SubLObjectFactory.makeSymbol("DETERMINE-OBFUSCATION-CANDIDATES");
        $str278$Identifying_needed_KB_changes = SubLObjectFactory.makeString("Identifying needed KB changes");
        $str279$____Old_Space = SubLObjectFactory.makeString(" -- Old Space");
        $sym280$NOT_TERM_OF_UNIT_ASSERTION_ = SubLObjectFactory.makeSymbol("NOT-TERM-OF-UNIT-ASSERTION?");
        $str281$____New_Space = SubLObjectFactory.makeString(" -- New Space");
        $kw282$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $sym283$DETERMINE_ASSERTION_OBFUSCATIONS = SubLObjectFactory.makeSymbol("DETERMINE-ASSERTION-OBFUSCATIONS");
        $str284$Identifying_assertion_changes = SubLObjectFactory.makeString("Identifying assertion changes");
        $list285 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNREP-TERM"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTIONS"));
        $list286 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-ASSERTIONS"));
        $sym287$DETERMINE_NART_OBFUSCATIONS = SubLObjectFactory.makeSymbol("DETERMINE-NART-OBFUSCATIONS");
        $str288$Identifying_NART_changes = SubLObjectFactory.makeString("Identifying NART changes");
        $list289 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-NAUTS"));
        $sym290$APPLY_ASSERTION_OBFUSCATIONS = SubLObjectFactory.makeSymbol("APPLY-ASSERTION-OBFUSCATIONS");
        $str291$Applying_assertion_changes = SubLObjectFactory.makeString("Applying assertion changes");
        $str292$Optimizing_edit_order = SubLObjectFactory.makeString("Optimizing edit order");
        $list293 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("UNREP-TERM"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-STRING"));
        $str294$A_total_of_ = SubLObjectFactory.makeString("A total of ");
        $str295$_edits_had_been_made_to_the_KB_ = SubLObjectFactory.makeString(" edits had been made to the KB.");
        $kw296$NON_GAFS = SubLObjectFactory.makeKeyword("NON-GAFS");
        $sym297$WEAKLY_SCRAMBLE_STRING_IN_ASSERTIONS = SubLObjectFactory.makeSymbol("WEAKLY-SCRAMBLE-STRING-IN-ASSERTIONS");
        $sym298$WEAKLY_SCRAMBLE_STRING_IN_NAUTS = SubLObjectFactory.makeSymbol("WEAKLY-SCRAMBLE-STRING-IN-NAUTS");
        $sym299$MIX_CASE_STRING = SubLObjectFactory.makeSymbol("MIX-CASE-STRING");
        $sym300$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const301$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const302$Collection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"));
        $sym303$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $sym304$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym305$HIGHER_ORDER_COLLECTION_ = SubLObjectFactory.makeSymbol("HIGHER-ORDER-COLLECTION?");
        $sym306$_ = SubLObjectFactory.makeSymbol("<");
        $sym307$INSTANCE_CARDINALITY = SubLObjectFactory.makeSymbol("INSTANCE-CARDINALITY");
        $kw308$ASCENDING = SubLObjectFactory.makeKeyword("ASCENDING");
        $const309$CollectionType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionType"));
        $str310$Nothing_to_clip_ = SubLObjectFactory.makeString("Nothing to clip.");
        $kw311$PERCENTAGE = SubLObjectFactory.makeKeyword("PERCENTAGE");
        $str312$Invalid_percentage__A__cannot_cli = SubLObjectFactory.makeString("Invalid percentage ~A: cannot clip from ~A to ~A.");
        $str313$___A__Deleting__A_____ = SubLObjectFactory.makeString("~&~A: Deleting ~A ... ");
        $kw314$BREADTH = SubLObjectFactory.makeKeyword("BREADTH");
        $kw315$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $kw316$STACK = SubLObjectFactory.makeKeyword("STACK");
        $sym317$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $str318$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym319$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw320$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str321$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw322$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str323$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $str324$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str325$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $list326 = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("LINK-NODE"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("MT"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("TV"));
        $str327$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $str328$_done___ = SubLObjectFactory.makeString(" done.~%");
        $sym329$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $kw330$EXHAUSTED = SubLObjectFactory.makeKeyword("EXHAUSTED");
        $str331$___A__Current_FORT_Count____A__ = SubLObjectFactory.makeString("~&~A: Current FORT Count : ~A~%");
        $str332$___A__Gathering_tabu_collections_ = SubLObjectFactory.makeString("~&~A: Gathering tabu-collections ....~%");
        $str333$___A__Selecting_clippable_collect = SubLObjectFactory.makeString("~&~A: Selecting clippable collections ....~%");
        $str334$___A__Clipping_collections_______ = SubLObjectFactory.makeString("~&~A: Clipping collections ....~%");
        $float335$0_1 = (SubLFloat)SubLObjectFactory.makeDouble(0.1);
        $kw336$LOG = SubLObjectFactory.makeKeyword("LOG");
        $str337$___A__Clipping_stopped_at__A_FORT = SubLObjectFactory.makeString("~&~A: Clipping stopped at ~A FORTs remaining with reason code ~A.~%");
        $sym338$GENERATE_TERMS_TRANSCRIPT = SubLObjectFactory.makeSymbol("GENERATE-TERMS-TRANSCRIPT");
        $const339$CycAdministrator = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycAdministrator"));
        $int340$212 = SubLObjectFactory.makeInteger(212);
        $str341$Finding_assertions_about_missing_ = SubLObjectFactory.makeString("Finding assertions about missing SAP terms ....");
        $list342 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")));
        $str343$Could_not_find_constant_for__S___ = SubLObjectFactory.makeString("Could not find constant for ~S ... skipping.~%");
        $str344$_A_constants_were_skipped___ = SubLObjectFactory.makeString("~A constants were skipped.~%");
    }
}

/*

	Total time: 7199 ms
	
*/