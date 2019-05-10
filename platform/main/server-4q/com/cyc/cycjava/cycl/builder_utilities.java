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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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

public final class builder_utilities
    extends
      SubLTranslatedFile
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
  public static SubLObject close_old_areas()
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 1579L)
  public static SubLObject verify_cyc_build()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    generic_testing.run_all_test_case_tables( StreamsLow.$standard_output$.getDynamicValue( thread ), $kw0$TERSE, NIL, T, UNPROVIDED );
    constant_completion.report_constant_names_in_code_but_not_kb();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 1734L)
  public static SubLObject cyc_build_world(final SubLObject units_directory_path, final SubLObject world_filename)
  {
    dumper.load_kb( units_directory_path );
    build_write_image( world_filename );
    operation_communication.halt_cyc_image( $str1$This_cyc_image_is_no_longer_usabl );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 2058L)
  public static SubLObject cyc_build_world_verify(final SubLObject dump_directory, final SubLObject world_filename)
  {
    dumper.load_kb( dump_directory );
    verify_cyc_build();
    build_write_image( world_filename );
    operation_communication.halt_cyc_image( $str1$This_cyc_image_is_no_longer_usabl );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 2341L)
  public static SubLObject build_write_image(final SubLObject world_filename)
  {
    research_cyc_init.perform_research_cyc_build_finalizations();
    if( NIL != Filesys.probe_file( world_filename ) )
    {
      Errors.cerror( $str3$Continue, $str4$World_file__A_already_exists_and_, world_filename );
    }
    operation_communication.write_cyc_image( world_filename, T );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 2701L)
  public static SubLObject cyc_install_directory_name(final SubLObject cyc_product_string, SubLObject revision_letter)
  {
    if( revision_letter == UNPROVIDED )
    {
      revision_letter = $str5$A;
    }
    return Sequences.cconcatenate( $str6$cyc_, new SubLObject[] { format_nil.format_nil_a_no_copy( cyc_product_string ), $str7$_, format_nil.format_nil_a_no_copy( system_info.cyc_revision_string_s1p_format() ),
      $str8$_kb_, format_nil.format_nil_a_no_copy( operation_communication.kb_version_string() ), $str7$_, format_nil.format_nil_a_no_copy( revision_letter )
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 2988L)
  public static SubLObject cyc_install_directory(final SubLObject cyc_platform_string, final SubLObject cyc_product_string, final SubLObject cyc_toolset, SubLObject revision_letter)
  {
    if( revision_letter == UNPROVIDED )
    {
      revision_letter = $str5$A;
    }
    return Sequences.cconcatenate( $str9$_cyc_, new SubLObject[] { format_nil.format_nil_a_no_copy( cyc_platform_string ), $str10$_, format_nil.format_nil_a_no_copy( cyc_product_string ), $str11$_install_, format_nil
        .format_nil_a_no_copy( cyc_install_directory_name( cyc_product_string, revision_letter ) ), $str10$_, format_nil.format_nil_a_no_copy( cyc_toolset ), $str10$_
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 3355L)
  public static SubLObject cyc_versioned_world_name()
  {
    return Sequences.cconcatenate( $str12$kb_, new SubLObject[] { format_nil.format_nil_a_no_copy( operation_communication.kb_version_string() ), $str13$_load
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 3482L)
  public static SubLObject build_write_image_versioned(final SubLObject directory)
  {
    assert NIL != Filesys.directory_p( directory ) : directory;
    final SubLObject filename = Sequences.cconcatenate( directory, cyc_versioned_world_name() );
    PrintLow.format( T, $str15$Writing_cyc_image_to__A__, filename );
    if( NIL != build_write_image( filename ) )
    {
      return filename;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 3858L)
  public static SubLObject cyc_load_kb(final SubLObject units_directory)
  {
    if( NIL != operation_communication.kb_incremental_unitsP( units_directory ) )
    {
      operation_communication.load_incremental_kb( units_directory );
      if( NIL == misc_utilities.system_code_initializations_run_p() )
      {
        misc_utilities.system_code_initializations( UNPROVIDED );
      }
    }
    else
    {
      dumper.load_kb( units_directory );
      misc_utilities.system_code_initializations( UNPROVIDED );
    }
    return control_vars.kb_loaded();
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 4321L)
  public static SubLObject cyc_load_incremental_kb(final SubLObject incremental_units_directory)
  {
    operation_communication.load_incremental_kb( incremental_units_directory );
    if( NIL == misc_utilities.system_code_initializations_run_p() )
    {
      misc_utilities.system_code_initializations( UNPROVIDED );
    }
    return Values.values( control_vars.kb_loaded(), operation_communication.kb_op_number() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 4756L)
  public static SubLObject cyc_dump_standard_kb(final SubLObject units_directory)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != operation_communication.receivingP() )
    {
      Errors.error( $str19$This_CYC_is_receiving_operations_ );
    }
    kb_utilities.swap_out_all_pristine_kb_objects();
    Storage.room( UNPROVIDED );
    kb_utilities.kb_statistics( UNPROVIDED, UNPROVIDED );
    return dumper.dump_standard_kb( units_directory );
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 5166L)
  public static SubLObject cyc_snapshot_kb(final SubLObject target_directory, SubLObject tombstoning_mode)
  {
    if( tombstoning_mode == UNPROVIDED )
    {
      tombstoning_mode = $kw21$MINIMAL;
    }
    return cyc_dump_snapshot_kb( target_directory, tombstoning_mode );
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 5323L)
  public static SubLObject cyc_dump_snapshot_kb(final SubLObject target_directory, SubLObject tombstoning_mode)
  {
    if( tombstoning_mode == UNPROVIDED )
    {
      tombstoning_mode = $kw21$MINIMAL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != operation_communication.receivingP() )
    {
      Errors.error( $str19$This_CYC_is_receiving_operations_ );
    }
    if( misc_utilities.generic_caches_directory().isString() && NIL != Strings.stringE( misc_utilities.generic_caches_directory(), target_directory, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      Errors.warn( $str23$Dump_snapshot_KB_trivially_finish, target_directory );
      return target_directory;
    }
    if( NIL == operation_queues.local_queue_empty() )
    {
      while ( NIL == operation_queues.local_queue_empty())
      {
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
    final SubLObject saved_remote_queue = queues.queue_copy( operation_queues.$remote_queue$.getGlobalValue() );
    final SubLObject saved_local_queue = queues.queue_copy( operation_queues.local_queue() );
    final SubLObject saved_auxiliary_queue = queues.queue_copy( operation_queues.$auxiliary_queue$.getGlobalValue() );
    final SubLObject saved_transcript_queue = queues.queue_copy( operation_queues.$transcript_queue$.getGlobalValue() );
    SubLObject disabled_servers = NIL;
    try
    {
      final SubLObject str = $str24$Setting_up_safe_KB_dump_environme;
      final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
      final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
      final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
      final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
        utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
        utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
        utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
        utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
        utilities_macros.$is_noting_progressP$.bind( T, thread );
        utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
        utilities_macros.noting_progress_preamble( str );
        Storage.room( UNPROVIDED );
        disabled_servers = tcp_server_utilities.disable_some_tcp_servers( UNPROVIDED );
        if( NIL != agenda_runningP )
        {
          operation_communication.ensure_agenda_halted( NIL );
        }
        if( NIL != agenda_runningP && NIL != agenda.agenda_running() )
        {
          Errors.warn( $str25$Agenda_was_not_successfully_halte );
        }
        transcript_utilities.$master_transcript$.setGlobalValue( NIL );
        transcript_utilities.$local_transcript$.setGlobalValue( NIL );
        transcript_utilities.set_read_transcript( NIL );
        control_vars.$communication_mode$.setGlobalValue( $kw26$UNKNOWN );
        operation_queues.clear_remote_queue();
        operation_queues.clear_local_queue();
        operation_queues.clear_auxiliary_queue();
        operation_queues.clear_transcript_queue();
        kb_utilities.swap_out_all_pristine_kb_objects();
        misc_utilities.flush_all_logs();
        Storage.room( UNPROVIDED );
        kb_utilities.kb_statistics( UNPROVIDED, UNPROVIDED );
        utilities_macros.noting_progress_postamble();
      }
      finally
      {
        utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
        utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
        utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
        utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
        utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
        utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_2, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_0, thread );
      }
      dumper.snapshot_kb( misc_utilities.generic_caches_directory(), target_directory, tombstoning_mode );
    }
    finally
    {
      final SubLObject _prev_bind_9 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        final SubLObject str2 = $str27$Restoring_pre_dump_environment;
        final SubLObject _prev_bind_0_$1 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_10 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
        final SubLObject _prev_bind_11 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
        final SubLObject _prev_bind_12 = utilities_macros.$progress_notification_count$.currentBinding( thread );
        final SubLObject _prev_bind_13 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
        final SubLObject _prev_bind_14 = utilities_macros.$progress_count$.currentBinding( thread );
        final SubLObject _prev_bind_15 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
        final SubLObject _prev_bind_16 = utilities_macros.$silent_progressP$.currentBinding( thread );
        try
        {
          utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
          utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$is_noting_progressP$.bind( T, thread );
          utilities_macros.$silent_progressP$.bind( ( NIL != str2 ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
          utilities_macros.noting_progress_preamble( str2 );
          transcript_utilities.set_master_transcript( UNPROVIDED );
          transcript_utilities.$local_transcript$.setGlobalValue( saved_local_transcript );
          transcript_utilities.set_read_transcript( saved_read_transcript );
          if( NIL != operation_communication.communication_modeP( saved_communication_mode ) )
          {
            operation_communication.set_communication_mode( saved_communication_mode );
          }
          operation_queues.$remote_queue$.setGlobalValue( saved_remote_queue );
          operation_queues.set_local_queue( saved_local_queue );
          operation_queues.$auxiliary_queue$.setGlobalValue( saved_auxiliary_queue );
          operation_queues.$transcript_queue$.setGlobalValue( saved_transcript_queue );
          if( NIL != agenda_runningP )
          {
            agenda.start_agenda( UNPROVIDED );
          }
          tcp_server_utilities.re_enable_disabled_tcp_servers( disabled_servers );
          utilities_macros.noting_progress_postamble();
        }
        finally
        {
          utilities_macros.$silent_progressP$.rebind( _prev_bind_16, thread );
          utilities_macros.$is_noting_progressP$.rebind( _prev_bind_15, thread );
          utilities_macros.$progress_count$.rebind( _prev_bind_14, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_13, thread );
          utilities_macros.$progress_notification_count$.rebind( _prev_bind_12, thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_11, thread );
          utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_10, thread );
          utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$1, thread );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_9, thread );
      }
    }
    return target_directory;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 6045L)
  public static SubLObject suggest_kb_snapshot_directory(final SubLObject base_dir)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject canonical = Filesys.probe_file( base_dir );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !canonical.isString() )
    {
      Errors.error( $str29$The_base_directory__A_does_not_ex, base_dir );
    }
    return operation_communication.kb_incremental_dump_directory( string_utilities.remove_last_char( dumper.kb_dump_directory( control_vars.kb_loaded(), ConsesLow.list( canonical ) ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 6405L)
  public static SubLObject builder_catchup_and_dump_pipeline(final SubLObject start_units_dir, final SubLObject dump_parent_dir, final SubLObject dump_type, SubLObject load_submittedP, SubLObject email_about_submittedP,
      SubLObject additional_transcripts)
  {
    if( load_submittedP == UNPROVIDED )
    {
      load_submittedP = NIL;
    }
    if( email_about_submittedP == UNPROVIDED )
    {
      email_about_submittedP = NIL;
    }
    if( additional_transcripts == UNPROVIDED )
    {
      additional_transcripts = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    cyc_load_kb( start_units_dir );
    PrintLow.format( T, $str30$Loaded_KB_version___A__, operation_communication.kb_version_string() );
    operation_communication.set_the_cyclist( $str31$TheBuilder );
    inference_metrics.$gathering_forward_inference_metricsP$.setDynamicValue( T, thread );
    control_vars.set_load_submitted_transcripts( load_submittedP );
    control_vars.set_send_submitted_transcript_loading_notices( email_about_submittedP );
    agenda.ensure_agenda_running();
    operation_communication.set_receive_state( $str32$yes );
    SubLObject minutes = ZERO_INTEGER;
    SubLObject total_ops = transcript_utilities.total_master_transcript_operations( UNPROVIDED );
    final SubLObject str = $str33$Determining_total_transcript_ops_;
    SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding( thread );
    SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
    SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
    SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
      utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
      utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
      utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
      utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
      utilities_macros.$is_noting_progressP$.bind( T, thread );
      utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
      utilities_macros.noting_progress_preamble( str );
      while ( NIL == subl_promotions.non_negative_integer_p( total_ops ))
      {
        minutes = Numbers.add( minutes, ONE_INTEGER );
        Threads.sleep( FIVE_INTEGER );
        total_ops = transcript_utilities.total_master_transcript_operations( UNPROVIDED );
      }
      utilities_macros.noting_progress_postamble();
    }
    finally
    {
      utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
      utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
      utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
      utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_0, thread );
    }
    format_nil.force_format( T, $str34$__Total_transcription_ops__A___, total_ops, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    minutes = ZERO_INTEGER;
    _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( $str35$Getting_caught_up_on_operations__ );
        while ( operation_communication.kb_op_number().numL( total_ops ))
        {
          utilities_macros.note_percent_progress( operation_communication.kb_op_number(), total_ops );
          final SubLObject new_total_ops = transcript_utilities.total_master_transcript_operations( UNPROVIDED );
          if( NIL != subl_promotions.non_negative_integer_p( new_total_ops ) )
          {
            total_ops = new_total_ops;
          }
          minutes = Numbers.add( minutes, ONE_INTEGER );
          Threads.sleep( FIVE_INTEGER );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    format_nil.force_format( T, $str36$__Catch_up_completed__Ops_remaini, total_ops, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    PrintLow.format( T, $str37$Post_catch_up_KB_version___A__, operation_communication.kb_version_string() );
    operation_communication.server_summary( UNPROVIDED );
    SubLObject cdolist_list_var = additional_transcripts;
    SubLObject transcript_file = NIL;
    transcript_file = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject ignore_errors_tag = NIL;
      try
      {
        thread.throwStack.push( $kw38$IGNORE_ERRORS_TARGET );
        _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( Symbols.symbol_function( $sym39$IGNORE_ERRORS_HANDLER ), thread );
          try
          {
            operation_communication.load_transcript( transcript_file, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          catch( final Throwable catch_var )
          {
            Errors.handleThrowable( catch_var, NIL );
          }
        }
        finally
        {
          Errors.$error_handler$.rebind( _prev_bind_0, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw38$IGNORE_ERRORS_TARGET );
      }
      finally
      {
        thread.throwStack.pop();
      }
      PrintLow.format( T, $str40$Post_load_transcript_KB_version__, operation_communication.kb_version_string() );
      cdolist_list_var = cdolist_list_var.rest();
      transcript_file = cdolist_list_var.first();
    }
    operation_communication.server_summary( UNPROVIDED );
    operation_communication.set_receive_state( $str41$no );
    final SubLObject dump_dir = operation_communication.kb_incremental_dump_directory( Sequences.cconcatenate( dump_parent_dir, operation_communication.kb_loaded_string() ) );
    file_utilities.make_directory_recursive( dump_dir, UNPROVIDED, UNPROVIDED );
    result = dumper.cyc_dump_kb( dump_dir, dump_type, UNPROVIDED );
    format_nil.force_format( T, $str42$__Successfully_created__S_units__, dump_type, dump_dir, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 8394L)
  public static SubLObject builder_log_directory()
  {
    final SubLObject log_directory = Sequences.cconcatenate( $str43$_home_builder_logs_, new SubLObject[] { operation_communication.kb_number_string( Numbers.add( ONE_INTEGER, control_vars.kb_loaded() ) ), $str10$_
    } );
    if( NIL == Filesys.directory_p( log_directory ) )
    {
      Errors.warn( $str44$No_log_directory__A_____strange__, log_directory );
      file_utilities.make_directory_recursive( log_directory, UNPROVIDED, UNPROVIDED );
    }
    return log_directory;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 8950L)
  public static SubLObject builder_forward_inference_metrics_log()
  {
    return Sequences.cconcatenate( format_nil.format_nil_a_no_copy( builder_log_directory() ), new SubLObject[] { $str45$forward_inference_metrics_, format_nil.format_nil_a_no_copy( Environment.get_process_id(
        UNPROVIDED ) ), $str46$_html
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 9109L)
  public static SubLObject catchup_to_rollover_and_write_image(final SubLObject catchup_world_file, SubLObject kb_num, SubLObject send_submitted_transcript_loading_noticesP)
  {
    if( kb_num == UNPROVIDED )
    {
      kb_num = NIL;
    }
    if( send_submitted_transcript_loading_noticesP == UNPROVIDED )
    {
      send_submitted_transcript_loading_noticesP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != kb_num && !kb_num.eql( control_vars.kb_loaded() ) && ZERO_INTEGER.eql( operation_communication.read_master_transcript_op_number() ) )
    {
      Errors.error( $str47$The_catchup_image_expected_to_be_, kb_num, operation_communication.kb_version_string() );
    }
    cb_system_tools.note_image_purpose( $str48$Builder_s_catchup_to_rollover_ser );
    kb_utilities.kb_statistics( UNPROVIDED, UNPROVIDED );
    inference_metrics.$gathering_forward_inference_metricsP$.setDynamicValue( T, thread );
    control_vars.set_load_submitted_transcripts( T );
    if( NIL != send_submitted_transcript_loading_noticesP )
    {
      control_vars.set_send_submitted_transcript_loading_notices( T );
    }
    control_vars.set_auto_increment_kb( NIL );
    catchup_to_rollover();
    Storage.room( T );
    kb_utilities.kb_statistics( UNPROVIDED, UNPROVIDED );
    build_write_image( catchup_world_file );
    final SubLObject builder_forward_inference_metrics_log = builder_forward_inference_metrics_log();
    if( NIL == Filesys.probe_file( builder_forward_inference_metrics_log ) )
    {
      SubLObject stream = NIL;
      try
      {
        stream = compatibility.open_text( builder_forward_inference_metrics_log, $kw49$OUTPUT );
        if( !stream.isStream() )
        {
          Errors.error( $str50$Unable_to_open__S, builder_forward_inference_metrics_log );
        }
        final SubLObject stream_$3 = stream;
        final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding( thread );
        try
        {
          html_macros.$html_stream$.bind( stream_$3, thread );
          cb_query.cb_show_forward_inference_metrics( TWENTY_INTEGER );
        }
        finally
        {
          html_macros.$html_stream$.rebind( _prev_bind_0, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 10406L)
  public static SubLObject catchup_to_rollover()
  {
    catchup_to_rollover_setup();
    Threads.process_wait( Sequences.cconcatenate( $str51$Getting_caught_up_to_KB_rollover_, format_nil.format_nil_a_no_copy( Numbers.add( ONE_INTEGER, control_vars.kb_loaded() ) ) ), $sym52$KB_FULL_TRANSCRIPT_LOADED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 10703L)
  public static SubLObject catchup_to_rollover_setup()
  {
    if( NIL == agenda.agenda_running() )
    {
      Errors.error( $str53$The_agenda_is_not_running___Fix_y );
    }
    operation_communication.set_communication_mode( $kw54$RECEIVE_ONLY );
    if( operation_communication.set_the_cyclist( $str31$TheBuilder ).eql( $const55$Guest ) )
    {
      operation_communication.set_the_cyclist( $str56$CycAdministrator );
    }
    PrintLow.format( T, $str57$Getting_caught_up__ );
    streams_high.force_output( T );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 11169L)
  public static SubLObject load_submitted_transcripts_and_write_image(final SubLObject ordered_concatenation_transcript, final SubLObject predump_world_file)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    cb_system_tools.note_image_purpose( $str58$Builder_s_transcript_loading_serv );
    final SubLObject _prev_bind_0 = Errors.$continue_cerrorP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = control_vars.$unencapsulating_within_agenda$.currentBinding( thread );
    try
    {
      Errors.$continue_cerrorP$.bind( T, thread );
      control_vars.$unencapsulating_within_agenda$.bind( T, thread );
      operation_communication.load_transcript_file( ordered_concatenation_transcript, NIL, $kw59$NONE, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      control_vars.$unencapsulating_within_agenda$.rebind( _prev_bind_2, thread );
      Errors.$continue_cerrorP$.rebind( _prev_bind_0, thread );
    }
    Storage.room( T );
    kb_utilities.kb_statistics( UNPROVIDED, UNPROVIDED );
    build_write_image( predump_world_file );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 11627L)
  public static SubLObject catchup_to_current_and_write_image_versioned(final SubLObject directory)
  {
    catchup_to_current_kb();
    return build_write_image_versioned( directory );
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 11776L)
  public static SubLObject catchup_to_current_and_write_image(final SubLObject current_world_file)
  {
    catchup_to_current_kb();
    return build_write_image( current_world_file );
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 12021L)
  public static SubLObject catchup_to_current_kb()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    cb_system_tools.note_image_purpose( $str60$Builder_s_catchup_to_current_serv );
    if( NIL == agenda.agenda_running() )
    {
      Errors.error( $str53$The_agenda_is_not_running___Fix_y );
    }
    kb_utilities.kb_statistics( UNPROVIDED, UNPROVIDED );
    operation_communication.set_communication_mode( $kw54$RECEIVE_ONLY );
    if( operation_communication.set_the_cyclist( $str31$TheBuilder ).eql( $const55$Guest ) )
    {
      operation_communication.set_the_cyclist( $str56$CycAdministrator );
    }
    Threads.sleep( FIVE_INTEGER );
    final SubLObject start_op_num = operation_communication.read_master_transcript_op_number();
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( Sequences.cconcatenate( $str61$Getting_caught_up_from_KB_, new SubLObject[] { format_nil.format_nil_a_no_copy( control_vars.kb_loaded() ), $str62$_, format_nil
            .format_nil_a_no_copy( operation_communication.read_master_transcript_op_number() ), $str63$_to_KB_, format_nil.format_nil_a_no_copy( control_vars.kb_loaded() ), $str62$_, format_nil.format_nil_a_no_copy(
                transcript_utilities.total_master_transcript_operations( UNPROVIDED ) )
        } ) );
        while ( NIL == control_vars.caught_up_on_master_transcript())
        {
          utilities_macros.note_percent_progress( Numbers.subtract( operation_communication.read_master_transcript_op_number(), start_op_num ), Numbers.subtract( transcript_utilities.total_master_transcript_operations(
              UNPROVIDED ), start_op_num ) );
          Threads.sleep( FIVE_INTEGER );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$4, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    operation_communication.set_communication_mode( $kw64$DEAF );
    PrintLow.format( T, $str65$Caught_up_to_KB__A__, operation_communication.kb_version_string() );
    Threads.sleep( FIVE_INTEGER );
    kb_utilities.kb_statistics( UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 31349L)
  public static SubLObject caught_up_on_operationsP(SubLObject target_remote_op_count)
  {
    if( target_remote_op_count == UNPROVIDED )
    {
      target_remote_op_count = transcript_server.total_master_transcript_operations_patient( UNPROVIDED );
    }
    enforceType( target_remote_op_count, $sym66$NON_NEGATIVE_INTEGER_P );
    final SubLObject actual_remote_op_count = operation_communication.kb_op_number();
    return Numbers.numLE( target_remote_op_count, actual_remote_op_count );
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 31766L)
  public static SubLObject catch_up_on_operations_verbose(SubLObject target_op_count, SubLObject load_submitted_operationsP, SubLObject keep_going_upon_kb_rolloverP)
  {
    if( target_op_count == UNPROVIDED )
    {
      target_op_count = transcript_server.total_master_transcript_operations_patient( UNPROVIDED );
    }
    if( load_submitted_operationsP == UNPROVIDED )
    {
      load_submitted_operationsP = T;
    }
    if( keep_going_upon_kb_rolloverP == UNPROVIDED )
    {
      keep_going_upon_kb_rolloverP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    operation_communication.set_the_cyclist( $str56$CycAdministrator );
    control_vars.set_load_submitted_transcripts( load_submitted_operationsP );
    operation_communication.set_receive_state( $str32$yes );
    Threads.sleep( THREE_INTEGER );
    final SubLObject start_op_count = operation_communication.kb_op_number();
    final SubLObject start_kb = control_vars.kb_loaded();
    SubLObject total_time = ZERO_INTEGER;
    final SubLObject time_var = Time.get_internal_real_time();
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( Sequences.cconcatenate( $str61$Getting_caught_up_from_KB_, new SubLObject[] { format_nil.format_nil_a_no_copy( start_kb ), $str62$_, format_nil
            .format_nil_a_no_copy( start_op_count ), $str63$_to_KB_, format_nil.format_nil_a_no_copy( start_kb ), $str62$_, format_nil.format_nil_a_no_copy( target_op_count )
        } ) );
        while ( NIL == caught_up_on_operationsP( target_op_count ))
        {
          utilities_macros.note_percent_progress( Numbers.subtract( operation_communication.kb_op_number(), start_op_count ), Numbers.subtract( target_op_count, start_op_count ) );
          Threads.sleep( FIVE_INTEGER );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$5, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    if( NIL != keep_going_upon_kb_rolloverP )
    {
      final SubLObject current_kb = control_vars.kb_loaded();
      if( !start_kb.eql( current_kb ) )
      {
        final SubLObject current_target_op_count = transcript_utilities.total_master_transcript_operations( UNPROVIDED );
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subl_promotions.non_negative_integer_p( current_target_op_count ) )
        {
          Errors.error( $str67$Could_not_get_total_master_transc, current_kb, start_kb );
        }
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
        try
        {
          utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
          utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
          utilities_macros.$within_noting_percent_progress$.bind( T, thread );
          utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
          try
          {
            utilities_macros.noting_percent_progress_preamble( Sequences.cconcatenate( $str68$Now_getting_caught_up_from_KB_, new SubLObject[] { format_nil.format_nil_a_no_copy( current_kb ), $str62$_, format_nil
                .format_nil_a_no_copy( ZERO_INTEGER ), $str63$_to_KB_, format_nil.format_nil_a_no_copy( current_kb ), $str62$_, format_nil.format_nil_a_no_copy( current_target_op_count )
            } ) );
            while ( operation_communication.kb_op_number().numL( Numbers.add( target_op_count, current_target_op_count ) ))
            {
              utilities_macros.note_percent_progress( Numbers.subtract( operation_communication.kb_op_number(), target_op_count ), current_target_op_count );
              Threads.sleep( FIVE_INTEGER );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values2 = Values.getValuesAsVector();
              utilities_macros.noting_percent_progress_postamble();
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$6, thread );
            }
          }
        }
        finally
        {
          utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
          utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
          utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
          utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
        }
      }
    }
    total_time = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var ), time_high.$internal_time_units_per_second$.getGlobalValue() );
    PrintLow.format( T, $str69$__Catching_up_on_operations_took_, total_time );
    operation_communication.set_receive_state( $str41$no );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 33607L)
  public static SubLObject catch_up_on_operations_very_verbosely(SubLObject target_op_count, SubLObject load_submitted_operationsP, SubLObject keep_going_upon_kb_rolloverP)
  {
    if( target_op_count == UNPROVIDED )
    {
      target_op_count = transcript_server.total_master_transcript_operations_patient( UNPROVIDED );
    }
    if( load_submitted_operationsP == UNPROVIDED )
    {
      load_submitted_operationsP = NIL;
    }
    if( keep_going_upon_kb_rolloverP == UNPROVIDED )
    {
      keep_going_upon_kb_rolloverP = T;
    }
    final SubLObject kb_object_count_list_1 = kb_utilities.kb_object_count_list();
    catch_up_on_operations_verbose( target_op_count, load_submitted_operationsP, keep_going_upon_kb_rolloverP );
    final SubLObject kb_object_count_list_2 = kb_utilities.kb_object_count_list();
    final SubLObject new_constant_count = kb_utilities.kb_object_count_lists_new_constant_count( kb_object_count_list_2, kb_object_count_list_1 );
    final SubLObject new_nart_count = kb_utilities.kb_object_count_lists_new_nart_count( kb_object_count_list_2, kb_object_count_list_1 );
    final SubLObject new_assertion_count = kb_utilities.kb_object_count_lists_new_assertion_count( kb_object_count_list_2, kb_object_count_list_1 );
    final SubLObject new_kb_hl_support_count = kb_utilities.kb_object_count_lists_new_kb_hl_support_count( kb_object_count_list_2, kb_object_count_list_1 );
    final SubLObject new_deduction_count = kb_utilities.kb_object_count_lists_new_deduction_count( kb_object_count_list_2, kb_object_count_list_1 );
    if( NIL != subl_promotions.non_zero_integer_p( new_constant_count ) || NIL != subl_promotions.non_zero_integer_p( new_nart_count ) || NIL != subl_promotions.non_zero_integer_p( new_assertion_count )
        || NIL != subl_promotions.non_zero_integer_p( new_kb_hl_support_count ) || NIL != subl_promotions.non_zero_integer_p( new_deduction_count ) )
    {
      if( NIL.isString() )
      {
        PrintLow.format( T, $str71$___A__, NIL );
      }
      if( NIL != subl_promotions.non_zero_integer_p( new_constant_count ) )
      {
        PrintLow.format( T, $str72$___s_constant_A__A__, new SubLObject[] { Numbers.abs( new_constant_count ), Numbers.abs( new_constant_count ).numG( ONE_INTEGER ) ? $str73$s_were : $str74$_was, ( NIL != subl_promotions
            .positive_integer_p( new_constant_count ) ) ? $str75$created : $str76$destroyed
        } );
      }
      if( NIL != subl_promotions.non_zero_integer_p( new_nart_count ) )
      {
        PrintLow.format( T, $str77$___s_nart_A__A__, new SubLObject[] { Numbers.abs( new_nart_count ), Numbers.abs( new_nart_count ).numG( ONE_INTEGER ) ? $str73$s_were : $str74$_was, ( NIL != subl_promotions
            .positive_integer_p( new_nart_count ) ) ? $str75$created : $str76$destroyed
        } );
      }
      if( NIL != subl_promotions.non_zero_integer_p( new_assertion_count ) )
      {
        PrintLow.format( T, $str78$___s_assertion_A__A__, new SubLObject[] { Numbers.abs( new_assertion_count ), Numbers.abs( new_assertion_count ).numG( ONE_INTEGER ) ? $str73$s_were : $str74$_was,
          ( NIL != subl_promotions.positive_integer_p( new_assertion_count ) ) ? $str75$created : $str76$destroyed
        } );
      }
      if( NIL != subl_promotions.non_zero_integer_p( new_kb_hl_support_count ) )
      {
        PrintLow.format( T, $str79$___s_kb_hl_support_A__A__, new SubLObject[] { Numbers.abs( new_kb_hl_support_count ), Numbers.abs( new_kb_hl_support_count ).numG( ONE_INTEGER ) ? $str73$s_were : $str74$_was,
          ( NIL != subl_promotions.positive_integer_p( new_kb_hl_support_count ) ) ? $str75$created : $str76$destroyed
        } );
      }
      if( NIL != subl_promotions.non_zero_integer_p( new_deduction_count ) )
      {
        PrintLow.format( T, $str80$___s_deduction_A__A__, new SubLObject[] { Numbers.abs( new_deduction_count ), Numbers.abs( new_deduction_count ).numG( ONE_INTEGER ) ? $str73$s_were : $str74$_was,
          ( NIL != subl_promotions.positive_integer_p( new_deduction_count ) ) ? $str75$created : $str76$destroyed
        } );
      }
    }
    else if( NIL.isString() )
    {
      PrintLow.format( T, $str71$___A__, NIL );
    }
    streams_high.force_output( T );
    kb_utilities.kb_statistics( UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 34103L)
  public static SubLObject run_baseline_tests()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = cyc_testing.$run_tiny_kb_tests_in_full_kbP$.currentBinding( thread );
    try
    {
      cyc_testing.$run_tiny_kb_tests_in_full_kbP$.bind( T, thread );
      thread.resetMultipleValues();
      final SubLObject overall = cyc_testing.run_all_cyc_tests_int( $str82$tests_post_build_testdcl_lisp, StreamsLow.$standard_output$.getDynamicValue( thread ), $kw0$TERSE, NIL, $kw83$POST_BUILD,
          cyc_testing.$run_tiny_kb_tests_in_full_kbP$.getDynamicValue( thread ), T, T, $kw84$ALL, NIL, NIL, NIL, UNPROVIDED, UNPROVIDED );
      final SubLObject runs = thread.secondMultipleValue();
      thread.resetMultipleValues();
      result = ConsesLow.list( overall, runs );
    }
    finally
    {
      cyc_testing.$run_tiny_kb_tests_in_full_kbP$.rebind( _prev_bind_0, thread );
    }
    final SubLObject result_file = Sequences.cconcatenate( $str85$release_baseline_tests_, new SubLObject[] { format_nil.format_nil_a_no_copy( operation_communication.kb_number_string( UNPROVIDED ) ), $str7$_, format_nil
        .format_nil_a_no_copy( system_info.cyc_revision_string() ), $str7$_, format_nil.format_nil_a_no_copy( numeric_date_utilities.timestamp( UNPROVIDED, UNPROVIDED ) ), $str86$_cfasl
    } );
    final SubLObject str = $str87$Writing_result_file;
    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$progress_notification_count$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$progress_count$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
    final SubLObject _prev_bind_9 = utilities_macros.$silent_progressP$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
      utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
      utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
      utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
      utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
      utilities_macros.$is_noting_progressP$.bind( T, thread );
      utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
      utilities_macros.noting_progress_preamble( str );
      cfasl_utilities.cfasl_save_externalized( result, result_file );
      utilities_macros.noting_progress_postamble();
    }
    finally
    {
      utilities_macros.$silent_progressP$.rebind( _prev_bind_9, thread );
      utilities_macros.$is_noting_progressP$.rebind( _prev_bind_8, thread );
      utilities_macros.$progress_count$.rebind( _prev_bind_7, thread );
      utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_6, thread );
      utilities_macros.$progress_notification_count$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
    }
    return Values.values( result, Filesys.probe_file( result_file ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 35278L)
  public static SubLObject baseline_results_to_map(final SubLObject filename)
  {
    final SubLObject result_info = cfasl_utilities.cfasl_load( filename );
    final SubLObject tests_run = conses_high.second( result_info );
    final SubLObject result_map = dictionary.new_dictionary( EQUAL, UNPROVIDED );
    SubLObject cdolist_list_var = tests_run;
    SubLObject test_run = NIL;
    test_run = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = test_run;
      SubLObject category = NIL;
      SubLObject test = NIL;
      SubLObject outcome = NIL;
      SubLObject time = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list89 );
      category = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list89 );
      test = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list89 );
      outcome = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list89 );
      time = current.first();
      current = current.rest();
      if( NIL == current )
      {
        SubLObject category_map = map_utilities.map_get( result_map, category, UNPROVIDED );
        if( NIL == map_utilities.map_p( category_map ) )
        {
          category_map = Hashtables.make_hash_table( $int90$100, EQUAL, UNPROVIDED );
          map_utilities.map_put( result_map, category, category_map );
        }
        map_utilities.map_put( category_map, test, outcome );
        map_utilities.map_push( category_map, outcome, test );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list89 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      test_run = cdolist_list_var.first();
    }
    return result_map;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 36111L)
  public static SubLObject compute_baseline_regressions(final SubLObject baseline, final SubLObject competition)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject categories = map_utilities.map_keys( baseline );
    final SubLObject diff_counts = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
    final SubLObject diff_details = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var = categories;
    SubLObject category = NIL;
    category = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject b_map = map_utilities.map_get( baseline, category, UNPROVIDED );
      final SubLObject c_map = map_utilities.map_get( competition, category, UNPROVIDED );
      final SubLObject cat_diff_count = dictionary.new_dictionary( EQUAL, UNPROVIDED );
      final SubLObject cat_diff_detail = dictionary.new_dictionary( EQUAL, UNPROVIDED );
      map_utilities.map_put( diff_counts, category, cat_diff_count );
      map_utilities.map_put( diff_details, category, cat_diff_detail );
      final SubLObject iterator = map_utilities.new_map_iterator( b_map );
      SubLObject valid;
      for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
      {
        thread.resetMultipleValues();
        final SubLObject var = iteration.iteration_next( iterator );
        valid = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != valid )
        {
          SubLObject current;
          final SubLObject datum = current = var;
          SubLObject test = NIL;
          SubLObject b_outcome = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
          test = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
          b_outcome = current.first();
          current = current.rest();
          if( NIL == current )
          {
            if( !b_outcome.isList() )
            {
              final SubLObject c_outcome = ( NIL != map_utilities.map_p( c_map ) ) ? map_utilities.map_get( c_map, test, $kw93$NOT_PRESENT ) : $kw93$NOT_PRESENT;
              final SubLObject key = ConsesLow.cons( b_outcome, c_outcome );
              map_utilities.map_increment( cat_diff_count, key, UNPROVIDED );
              map_utilities.map_push( cat_diff_detail, key, test );
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list92 );
          }
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      category = cdolist_list_var.first();
    }
    return Values.values( diff_counts, diff_details );
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 37269L)
  public static SubLObject show_baseline_regression_info(final SubLObject diff_info, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject iterator = map_utilities.new_map_iterator( diff_info );
    SubLObject valid;
    for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
    {
      thread.resetMultipleValues();
      final SubLObject var = iteration.iteration_next( iterator );
      valid = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != valid )
      {
        SubLObject current;
        final SubLObject datum = current = var;
        SubLObject category = NIL;
        SubLObject info = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list95 );
        category = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list95 );
        info = current.first();
        current = current.rest();
        if( NIL == current )
        {
          PrintLow.format( stream, $str96$___S__, category );
          dictionary_utilities.print_dictionary_contents( info, stream );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list95 );
        }
      }
    }
    return diff_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 37892L)
  public static SubLObject show_baseline_regression_details(final SubLObject diff_detail, SubLObject regression_conditions, SubLObject stream)
  {
    if( regression_conditions == UNPROVIDED )
    {
      regression_conditions = $standard_regression_conditions$.getGlobalValue();
    }
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject iterator = map_utilities.new_map_iterator( diff_detail );
    SubLObject valid;
    for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
    {
      thread.resetMultipleValues();
      final SubLObject var = iteration.iteration_next( iterator );
      valid = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != valid )
      {
        SubLObject current;
        final SubLObject datum = current = var;
        SubLObject category = NIL;
        SubLObject cat_map = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list99 );
        category = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list99 );
        cat_map = current.first();
        current = current.rest();
        if( NIL == current )
        {
          PrintLow.format( stream, $str96$___S__, category );
          SubLObject cdolist_list_var = regression_conditions;
          SubLObject condition = NIL;
          condition = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            final SubLObject tests = Sort.sort( map_utilities.map_get( cat_map, condition, UNPROVIDED ), $sym100$TERM__, UNPROVIDED );
            if( NIL != list_utilities.sublisp_boolean( tests ) )
            {
              PrintLow.format( stream, $str101$__S__, condition );
              SubLObject cdolist_list_var_$7 = tests;
              SubLObject test = NIL;
              test = cdolist_list_var_$7.first();
              while ( NIL != cdolist_list_var_$7)
              {
                PrintLow.format( stream, $str102$___S__, test );
                cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                test = cdolist_list_var_$7.first();
              }
            }
            cdolist_list_var = cdolist_list_var.rest();
            condition = cdolist_list_var.first();
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list99 );
        }
      }
    }
    return diff_detail;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 40426L)
  public static SubLObject declare_cyc_product(final SubLObject cyc_product, final SubLObject code_product, final SubLObject kb_product, final SubLObject branch_tag)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.keywordp( cyc_product ) : cyc_product;
    assert NIL != Types.keywordp( kb_product ) : kb_product;
    assert NIL != Types.keywordp( code_product ) : code_product;
    assert NIL != Types.stringp( branch_tag ) : branch_tag;
    if( NIL != cyc_product_definition_presentP( cyc_product, code_product, kb_product, branch_tag ) )
    {
      return Errors.warn( $str105$The_cyc_product___A__is_already_p, cyc_product );
    }
    if( NIL != find_cyc_product( code_product, kb_product, branch_tag ) )
    {
      return Errors.error( $str106$There_already_exists_a_different_, find_cyc_product( code_product, kb_product, branch_tag ) );
    }
    if( NIL != conses_high.assoc( cyc_product, $cyc_product_definitions$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) )
    {
      return Errors.error( $str107$The_cyc_product__A_already_exists, cyc_product );
    }
    $all_cyc_products$.setDynamicValue( ConsesLow.cons( cyc_product, $all_cyc_products$.getDynamicValue( thread ) ), thread );
    $cyc_product_definitions$.setDynamicValue( ConsesLow.cons( ConsesLow.list( cyc_product, kb_product, code_product, branch_tag ), $cyc_product_definitions$.getDynamicValue( thread ) ), thread );
    return $cyc_product_definitions$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 41636L)
  public static SubLObject cyc_product_definition_presentP(final SubLObject cyc_product, final SubLObject code_product, final SubLObject kb_product, final SubLObject branch_tag)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return conses_high.member( ConsesLow.list( cyc_product, code_product, kb_product, branch_tag ), $cyc_product_definitions$.getDynamicValue( thread ), Symbols.symbol_function( EQUAL ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 41933L)
  public static SubLObject find_cyc_product(final SubLObject code_product, final SubLObject kb_product, final SubLObject branch_tag)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Sequences.find( ConsesLow.list( code_product, kb_product, branch_tag ), $cyc_product_definitions$.getDynamicValue( thread ), Symbols.symbol_function( EQUAL ), Symbols.symbol_function( $sym108$CDR ),
        UNPROVIDED, UNPROVIDED ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 43588L)
  public static SubLObject cyc_product()
  {
    return $cyc_product$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 43812L)
  public static SubLObject code_product()
  {
    return $code_product$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 43871L)
  public static SubLObject kb_product()
  {
    return $kb_product$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 43926L)
  public static SubLObject branch_tag()
  {
    return $branch_tag$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 43981L)
  public static SubLObject set_cyc_product(final SubLObject cyc_product)
  {
    assert NIL != Types.keywordp( cyc_product ) : cyc_product;
    $cyc_product$.setGlobalValue( cyc_product );
    return cyc_product();
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 44125L)
  public static SubLObject set_kb_product(final SubLObject kb_product)
  {
    assert NIL != Types.keywordp( kb_product ) : kb_product;
    $kb_product$.setGlobalValue( kb_product );
    return kb_product();
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 44480L)
  public static SubLObject initialize_cyc_product()
  {
    final SubLObject cyc_product = detect_cyc_product();
    if( NIL != cyc_product )
    {
      set_cyc_product( cyc_product );
    }
    else
    {
      set_cyc_product( $kw119$UNKNOWN_CYC_PRODUCT );
    }
    return cyc_product;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 44959L)
  public static SubLObject detect_cyc_product()
  {
    return find_cyc_product( code_product(), kb_product(), branch_tag() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 45067L)
  public static SubLObject load_file_dependency_information(final SubLObject path, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = EQUAL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject information = dictionary.new_dictionary( test, UNPROVIDED );
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( path, $kw121$INPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str50$Unable_to_open__S, path );
      }
      final SubLObject stream_var = stream;
      if( stream_var.isStream() )
      {
        final SubLObject stream_var_$8 = stream_var;
        SubLObject line_number_var = NIL;
        SubLObject line = NIL;
        line_number_var = ZERO_INTEGER;
        for( line = file_utilities.do_stream_lines_get_next_line( stream_var_$8 ); NIL != line; line = file_utilities.do_stream_lines_get_next_line( stream_var_$8 ) )
        {
          final SubLObject split_point = Sequences.position_if( $sym122$WHITESPACE_CHAR_P, line, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          final SubLObject dependent = string_utilities.substring( line, ZERO_INTEGER, split_point );
          final SubLObject dependency = string_utilities.substring( line, Numbers.add( ONE_INTEGER, split_point ), UNPROVIDED );
          SubLObject dependencies = map_utilities.map_get( information, dependent, UNPROVIDED );
          if( NIL == set.set_p( dependencies ) )
          {
            dependencies = set.new_set( test, UNPROVIDED );
            map_utilities.map_put( information, dependent, dependencies );
          }
          set.set_add( dependency, dependencies );
          line_number_var = number_utilities.f_1X( line_number_var );
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    return information;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 46138L)
  public static SubLObject augment_file_set(final SubLObject file_set, final SubLObject dependency_information)
  {
    final SubLObject additions = set.new_set( set.set_test( file_set ), UNPROVIDED );
    final SubLObject set_contents_var = set.do_set_internal( file_set );
    SubLObject basis_object;
    SubLObject state;
    SubLObject file;
    SubLObject dependencies;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      file = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, file ) )
      {
        dependencies = map_utilities.map_get( dependency_information, file, UNPROVIDED );
        if( NIL != set.set_p( dependencies ) )
        {
          set_utilities.set_nmerge( additions, dependencies );
        }
      }
    }
    set_utilities.set_nprune( additions, file_set );
    final SubLObject actual_additions = set.set_size( additions );
    set_utilities.set_nmerge( file_set, additions );
    return actual_additions;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 47045L)
  public static SubLObject completely_augment_file_set(final SubLObject file_set, final SubLObject dependency_information)
  {
    final SubLObject ceiling = Numbers.add( set.set_size( file_set ), map_utilities.map_size( dependency_information ) );
    SubLObject counter = ZERO_INTEGER;
    SubLObject doneP = NIL;
    while ( NIL == doneP)
    {
      final SubLObject additions = augment_file_set( file_set, dependency_information );
      doneP = Numbers.zerop( additions );
      counter = Numbers.add( counter, ONE_INTEGER );
      if( ceiling.numL( counter ) )
      {
        Errors.error( $str125$Augmenting_the_file_set_not_termi, ceiling );
      }
    }
    return file_set;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 47747L)
  public static SubLObject write_ant_fileset_declaration(final SubLObject fileset_id, final SubLObject dir_spec, final SubLObject files_to_include, SubLObject files_to_exclude)
  {
    if( files_to_exclude == UNPROVIDED )
    {
      files_to_exclude = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject attributes = ConsesLow.list( $str127$id, fileset_id, $str128$dir, dir_spec );
    try
    {
      final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
      final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
      try
      {
        xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
        xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
        xml_utilities.xml_start_tag_internal( $str129$fileset, attributes, NIL, NIL, $kw130$UNINITIALIZED );
        final SubLObject _prev_bind_0_$9 = xml_vars.$xml_default_namespace$.currentBinding( thread );
        try
        {
          xml_vars.$xml_default_namespace$.bind( $kw130$UNINITIALIZED, thread );
          final SubLObject name_attribute_list = ConsesLow.list( $str131$name, $kw132$VALUE );
          final SubLObject name_spot = name_attribute_list.rest();
          SubLObject cdolist_list_var = files_to_include;
          SubLObject file_to_include = NIL;
          file_to_include = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            ConsesLow.rplaca( name_spot, file_to_include );
            xml_utilities.xml_terpri();
            final SubLObject _prev_bind_0_$10 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_1_$11 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str133$include, name_attribute_list, T, NIL, $kw130$UNINITIALIZED );
              final SubLObject _prev_bind_0_$11 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( $kw130$UNINITIALIZED, thread );
              }
              finally
              {
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$11, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$11, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$10, thread );
            }
            cdolist_list_var = cdolist_list_var.rest();
            file_to_include = cdolist_list_var.first();
          }
          cdolist_list_var = files_to_exclude;
          SubLObject file_to_exclude = NIL;
          file_to_exclude = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            ConsesLow.rplaca( name_spot, file_to_exclude );
            xml_utilities.xml_terpri();
            final SubLObject _prev_bind_0_$12 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_1_$12 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str134$exclude, name_attribute_list, T, NIL, $kw130$UNINITIALIZED );
              final SubLObject _prev_bind_0_$13 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( $kw130$UNINITIALIZED, thread );
              }
              finally
              {
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$13, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$12, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$12, thread );
            }
            cdolist_list_var = cdolist_list_var.rest();
            file_to_exclude = cdolist_list_var.first();
          }
        }
        finally
        {
          xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$9, thread );
        }
      }
      finally
      {
        xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
        xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        xml_utilities.xml_terpri();
        xml_utilities.xml_end_tag_internal( $str129$fileset );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    return fileset_id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 48949L)
  public static SubLObject construct_rooted_file_set_from_list(final SubLObject file_list, SubLObject root, SubLObject test)
  {
    if( root == UNPROVIDED )
    {
      root = file_utilities.path_separator_string( $kw136$UNIX );
    }
    if( test == UNPROVIDED )
    {
      test = EQUAL;
    }
    return root_file_set( set_utilities.construct_set_from_list( file_list, test, UNPROVIDED ), root, test );
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 49362L)
  public static SubLObject root_file_set(final SubLObject file_set, SubLObject root, SubLObject test)
  {
    if( root == UNPROVIDED )
    {
      root = file_utilities.path_separator_string( $kw136$UNIX );
    }
    if( test == UNPROVIDED )
    {
      test = EQUAL;
    }
    final SubLObject new_file_set = set.new_set( test, set.set_size( file_set ) );
    final SubLObject set_contents_var = set.do_set_internal( file_set );
    SubLObject basis_object;
    SubLObject state;
    SubLObject file;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      file = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, file ) )
      {
        set.set_add( file_utilities.make_path_absolute_relative_to( root, file ), new_file_set );
      }
    }
    return new_file_set;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 49849L)
  public static SubLObject unroot_file_set(final SubLObject file_set, SubLObject root, SubLObject test)
  {
    if( root == UNPROVIDED )
    {
      root = file_utilities.path_separator_string( $kw136$UNIX );
    }
    if( test == UNPROVIDED )
    {
      test = EQUAL;
    }
    final SubLObject new_file_set = set.new_set( test, set.set_size( file_set ) );
    final SubLObject set_contents_var = set.do_set_internal( file_set );
    SubLObject basis_object;
    SubLObject state;
    SubLObject file;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      file = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, file ) )
      {
        set.set_add( file_utilities.make_absolute_path_relative_to( file, root ), new_file_set );
      }
    }
    return new_file_set;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 50509L)
  public static SubLObject reroot_file_set(final SubLObject file_set, SubLObject old_root, SubLObject new_root, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = EQUAL;
    }
    old_root = file_utilities.possibly_append_path_separator_char( old_root );
    new_root = file_utilities.possibly_append_path_separator_char( new_root );
    final SubLObject absolute_target_p = file_utilities.absolute_pathP( new_root );
    SubLObject target_root = new_root;
    final SubLObject new_file_set = set.new_set( test, set.set_size( file_set ) );
    SubLObject path_type = NIL;
    SubLObject path_string = NIL;
    if( NIL == absolute_target_p )
    {
      path_type = file_utilities.guess_path_type_robust( new_root );
      path_string = file_utilities.path_separator_string( path_type );
      target_root = file_utilities.make_path_absolute_relative_to( path_string, new_root );
    }
    final SubLObject set_contents_var = set.do_set_internal( file_set );
    SubLObject basis_object;
    SubLObject state;
    SubLObject file;
    SubLObject uprooted_file;
    SubLObject rerooted_file;
    SubLObject final_file;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      file = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, file ) )
      {
        uprooted_file = file_utilities.make_absolute_path_relative_to( file, old_root );
        rerooted_file = file_utilities.make_path_absolute_relative_to( target_root, uprooted_file );
        final_file = ( ( NIL != absolute_target_p ) ? rerooted_file : file_utilities.make_absolute_path_relative_to( rerooted_file, path_string ) );
        set.set_add( final_file, new_file_set );
      }
    }
    return new_file_set;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 52192L)
  public static SubLObject test_reroot_file_set(final SubLObject file_list, final SubLObject old_root, final SubLObject new_root, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = EQUAL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject file_set = set_utilities.construct_set_from_list( file_list, test, UNPROVIDED );
    final SubLObject new_file_set = reroot_file_set( file_set, old_root, new_root, test );
    final SubLObject set_contents_var = set.do_set_internal( new_file_set );
    SubLObject basis_object;
    SubLObject state;
    SubLObject new_file;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      new_file = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, new_file ) && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == string_utilities.starts_with( new_file, new_root ) )
      {
        Errors.error( $str148$Rerooting_from__A_to__A_failed_an, old_root, new_root, new_file );
      }
    }
    return $kw149$SUCCESS;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 52649L)
  public static SubLObject serialize_kb_store_lru_information(final SubLObject directory)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( directory, $sym14$DIRECTORY_P );
    final SubLObject message = Sequences.cconcatenate( $str151$Serializing_LRU_information_for_K, format_nil.format_nil_a_no_copy( directory ) );
    final SubLObject list_var = ConsesLow.list( constant_index_manager.$constant_index_manager$.getGlobalValue(), nart_index_manager.$nart_index_manager$.getGlobalValue(),
        nart_hl_formula_manager.$nart_hl_formula_manager$.getGlobalValue(), assertion_manager.$assertion_content_manager$.getGlobalValue(), kb_hl_support_manager.$kb_hl_support_content_manager$.getGlobalValue(),
        deduction_manager.$deduction_content_manager$.getGlobalValue(), unrepresented_term_index_manager.$unrepresented_term_index_manager$.getGlobalValue() );
    final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( ( NIL != message ) ? message : $str152$cdolist, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject csome_list_var = list_var;
        SubLObject kbom = NIL;
        kbom = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          kb_object_manager.serialize_kbom_lru_information( kbom, directory );
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var = csome_list_var.rest();
          kbom = csome_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$16, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    return directory;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 53666L)
  public static SubLObject precache_kb_store_by_lru_information(final SubLObject directory)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( directory, $sym14$DIRECTORY_P );
    final SubLObject message = Sequences.cconcatenate( $str154$Precaching_KB_Store_with_LRU_info, format_nil.format_nil_a_no_copy( directory ) );
    final SubLObject list_var = ConsesLow.list( constant_index_manager.$constant_index_manager$.getGlobalValue(), nart_index_manager.$nart_index_manager$.getGlobalValue(),
        nart_hl_formula_manager.$nart_hl_formula_manager$.getGlobalValue(), assertion_manager.$assertion_content_manager$.getGlobalValue(), kb_hl_support_manager.$kb_hl_support_content_manager$.getGlobalValue(),
        deduction_manager.$deduction_content_manager$.getGlobalValue(), unrepresented_term_index_manager.$unrepresented_term_index_manager$.getGlobalValue() );
    final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( ( NIL != message ) ? message : $str152$cdolist, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject csome_list_var = list_var;
        SubLObject kbom = NIL;
        kbom = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          kb_object_manager.precache_kbom_by_lru_information( kbom, directory );
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var = csome_list_var.rest();
          kbom = csome_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$17, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    return directory;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 54635L)
  public static SubLObject set_kb_store_lru_settings(SubLObject percent, SubLObject max)
  {
    if( percent == UNPROVIDED )
    {
      percent = $int90$100;
    }
    if( max == UNPROVIDED )
    {
      max = Numbers.$most_positive_fixnum$.getGlobalValue();
    }
    assertion_manager.resize_assertion_content_kbom_lru( percent, max );
    constant_index_manager.resize_constant_index_kbom_lru( percent, max );
    deduction_manager.resize_deduction_content_kbom_lru( percent, max );
    nart_index_manager.resize_nart_index_kbom_lru( percent, max );
    unrepresented_term_index_manager.resize_unrepresented_term_index_kbom_lru( percent, max );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 55023L)
  public static SubLObject set_kb_store_lru_swap_level(SubLObject n)
  {
    if( n == UNPROVIDED )
    {
      n = TEN_INTEGER;
    }
    if( n.numL( ONE_INTEGER ) )
    {
      n = ONE_INTEGER;
    }
    assertion_manager.resize_assertion_content_kbom_lru( Numbers.multiply( n, $float155$0_212 ), Numbers.multiply( n, $int156$30000 ) );
    deduction_manager.resize_deduction_content_kbom_lru( Numbers.multiply( n, $float155$0_212 ), Numbers.multiply( n, $int157$22000 ) );
    constant_index_manager.resize_constant_index_kbom_lru( Numbers.multiply( n, $float158$0_424 ), Numbers.multiply( n, $int159$1600 ) );
    nart_index_manager.resize_nart_index_kbom_lru( Numbers.multiply( n, $float155$0_212 ), Numbers.multiply( n, $int159$1600 ) );
    unrepresented_term_index_manager.resize_unrepresented_term_index_kbom_lru( Numbers.multiply( n, $float155$0_212 ), Numbers.multiply( n, $int159$1600 ) );
    kb_hl_support_manager.resize_kb_hl_support_content_kbom_lru( Numbers.multiply( n, $float155$0_212 ), Numbers.multiply( n, $int159$1600 ) );
    nart_hl_formula_manager.resize_nart_hl_formula_kbom_lru( Numbers.multiply( n, $float155$0_212 ), Numbers.multiply( n, $int159$1600 ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 55613L)
  public static SubLObject enumerate_fact_sheets_for_kb_to_file(final SubLObject filename)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( filename, $kw49$OUTPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str50$Unable_to_open__S, filename );
      }
      final SubLObject s = stream;
      enumerate_fact_sheets_for_kb( s );
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    return filename;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 55819L)
  public static SubLObject enumerate_fact_sheets_for_kb(SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject path_iterator = iteration.new_filter_and_transform_iterator( forts.new_forts_iterator(), $sym160$FACT_SHEET_PATH_FOR_TERM_FILTER_AND_TRANSFORM, UNPROVIDED );
    SubLObject valid;
    for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
    {
      thread.resetMultipleValues();
      final SubLObject path = iteration.iteration_next( path_iterator );
      valid = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != valid )
      {
        streams_high.write_string( path, stream, UNPROVIDED, UNPROVIDED );
        streams_high.terpri( stream );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 56317L)
  public static SubLObject fact_sheet_path_for_term_filter_and_transform(final SubLObject v_term)
  {
    if( NIL != fact_sheets.term_ok_for_fact_sheet_p( v_term, UNPROVIDED ) )
    {
      return Values.values( fact_sheets.fact_sheet_file_for_fact_sheet_term( v_term ), T );
    }
    return Values.values( NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 56688L)
  public static SubLObject specify_sbhl_caching_policy_template(final SubLObject link_predicate, final SubLObject policy, final SubLObject capacity, SubLObject exempts, SubLObject prefetch)
  {
    if( exempts == UNPROVIDED )
    {
      exempts = ZERO_INTEGER;
    }
    if( prefetch == UNPROVIDED )
    {
      prefetch = ZERO_INTEGER;
    }
    return ConsesLow.list( link_predicate, policy, capacity, exempts, prefetch );
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 58349L)
  public static SubLObject generate_kb_sbhl_caching_policies(final SubLObject tuning_data_file, final SubLObject policies_file, SubLObject externalizedP)
  {
    if( externalizedP == UNPROVIDED )
    {
      externalizedP = T;
    }
    final SubLObject tuning_data = cfasl_utilities.cfasl_load( tuning_data_file );
    final SubLObject policies = propose_kb_sbhl_caching_policies_from_tuning_data( tuning_data, UNPROVIDED );
    sbhl_caching_policies.save_sbhl_caching_policies( policies, policies_file, externalizedP );
    return policies_file;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 58885L)
  public static SubLObject generate_legacy_kb_sbhl_caching_policies(final SubLObject policies_file, SubLObject externalizedP)
  {
    if( externalizedP == UNPROVIDED )
    {
      externalizedP = T;
    }
    final SubLObject policies = propose_legacy_kb_sbhl_caching_policies( UNPROVIDED );
    sbhl_caching_policies.save_sbhl_caching_policies( policies, policies_file, externalizedP );
    return policies_file;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 59236L)
  public static SubLObject generate_completely_cached_kb_sbhl_caching_policies(final SubLObject policies_file, SubLObject externalizedP)
  {
    if( externalizedP == UNPROVIDED )
    {
      externalizedP = T;
    }
    final SubLObject policies = propose_completely_cached_kb_sbhl_caching_policies( UNPROVIDED );
    sbhl_caching_policies.save_sbhl_caching_policies( policies, policies_file, externalizedP );
    return policies_file;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 59652L)
  public static SubLObject propose_kb_sbhl_caching_policies_from_tuning_data(final SubLObject tuning_data, SubLObject templates)
  {
    if( templates == UNPROVIDED )
    {
      templates = $generic_sbhl_caching_policy_templates$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != dictionary.dictionary_p( tuning_data ) : tuning_data;
    final SubLObject default_template = Sequences.find( $kw161$DEFAULT, templates, EQL, $sym183$FIRST, UNPROVIDED, UNPROVIDED );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !default_template.isCons() )
    {
      Errors.error( $str184$The_templates_list__A_does_not_co, templates );
    }
    SubLObject policies = NIL;
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tuning_data ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject link_predicate = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject ref_counts = thread.secondMultipleValue();
      thread.resetMultipleValues();
      SubLObject policy_template = Sequences.find( link_predicate, templates, EQL, $sym183$FIRST, UNPROVIDED, UNPROVIDED );
      if( NIL == policy_template )
      {
        policy_template = default_template;
      }
      SubLObject current;
      final SubLObject datum = current = policy_template;
      SubLObject pred = NIL;
      SubLObject policy = NIL;
      SubLObject capacity = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list185 );
      pred = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list185 );
      policy = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list185 );
      capacity = current.first();
      current = current.rest();
      final SubLObject exempt = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list185 );
      current = current.rest();
      final SubLObject prefetch = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list185 );
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject terms = sbhl_caching_policies.recommend_sbhl_caching_preference_term_list_from_ref_counts( ref_counts, sbhl_module_vars.get_sbhl_module( link_predicate ) );
        final SubLObject caching_policy = sbhl_caching_policies.create_sbhl_caching_policy_from_term_recommendation_list( link_predicate, policy, capacity, terms, exempt, prefetch );
        policies = ConsesLow.cons( caching_policy, policies );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list185 );
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return policies;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 61224L)
  public static SubLObject propose_completely_cached_kb_sbhl_caching_policies(SubLObject link_predicates)
  {
    if( link_predicates == UNPROVIDED )
    {
      link_predicates = NIL;
    }
    return propose_all_sticky_kb_sbhl_caching_policies( link_predicates, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 61611L)
  public static SubLObject propose_legacy_kb_sbhl_caching_policies(SubLObject link_predicates)
  {
    if( link_predicates == UNPROVIDED )
    {
      link_predicates = NIL;
    }
    return propose_all_sticky_kb_sbhl_caching_policies( link_predicates, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 62005L)
  public static SubLObject get_all_sbhl_module_link_predicates()
  {
    SubLObject link_predicates = NIL;
    SubLObject cdolist_list_var = sbhl_module_vars.get_sbhl_modules();
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject key = NIL;
      SubLObject module = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list186 );
      key = current.first();
      current = ( module = current.rest() );
      link_predicates = ConsesLow.cons( sbhl_module_vars.get_sbhl_module_link_pred( module ), link_predicates );
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    return link_predicates;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 62286L)
  public static SubLObject propose_all_sticky_kb_sbhl_caching_policies(SubLObject link_predicates, final SubLObject with_prefetch_p)
  {
    if( NIL == link_predicates )
    {
      link_predicates = get_all_sbhl_module_link_predicates();
    }
    final SubLObject prefetch = ( NIL != with_prefetch_p ) ? $kw84$ALL : NIL;
    SubLObject policies = NIL;
    SubLObject cdolist_list_var = link_predicates;
    SubLObject link_predicate = NIL;
    link_predicate = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject legacy_policy = sbhl_caching_policies.create_sbhl_caching_policy_from_term_recommendation_list( link_predicate, $kw162$STICKY, $kw163$UNDEFINED, NIL, $kw84$ALL, prefetch );
      policies = ConsesLow.cons( legacy_policy, policies );
      cdolist_list_var = cdolist_list_var.rest();
      link_predicate = cdolist_list_var.first();
    }
    return Sequences.nreverse( policies );
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 64067L)
  public static SubLObject start_recording_sbhl_cache_tuning_data()
  {
    sbhl_cache_tuning_data_gathering_prologue();
    sbhl_cache_tuning_experiment_prologue();
    return $kw187$RECORDING;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 64506L)
  public static SubLObject stop_recording_sbhl_cache_tuning_data(final SubLObject data_file)
  {
    final SubLObject state = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
    sbhl_cache_tuning_experiment_epilogue( state );
    sbhl_cache_tuning_data_gathering_generate_report( data_file, state );
    sbhl_cache_tuning_data_gathering_epilogue();
    return data_file;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 65221L)
  public static SubLObject gather_data_for_sbhl_cache_tuning(final SubLObject filename)
  {
    final SubLObject state = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
    SubLObject failed_contributions = NIL;
    sbhl_cache_tuning_data_gathering_prologue();
    failed_contributions = run_sbhl_cache_tuning_data_gathering( state );
    sbhl_cache_tuning_data_gathering_generate_report( filename, state );
    sbhl_cache_tuning_data_gathering_epilogue();
    return Values.values( filename, failed_contributions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 66087L)
  public static SubLObject run_sbhl_cache_tuning_data_gathering(final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject failed_contributions = NIL;
    if( NIL != list_utilities.sublisp_boolean( $cyc_tests_to_use_for_sbhl_cache_tuning$.getDynamicValue( thread ) ) )
    {
      SubLObject failures = NIL;
      final SubLObject list_var = $cyc_tests_to_use_for_sbhl_cache_tuning$.getDynamicValue( thread );
      final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( $str188$Gathering_SBHL_cache_tuning_data_, thread );
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
        utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
          SubLObject csome_list_var = list_var;
          SubLObject test_name = NIL;
          test_name = csome_list_var.first();
          while ( NIL != csome_list_var)
          {
            SubLObject msg = NIL;
            try
            {
              thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
              final SubLObject _prev_bind_0_$18 = Errors.$error_handler$.currentBinding( thread );
              try
              {
                Errors.$error_handler$.bind( $sym189$CATCH_ERROR_MESSAGE_HANDLER, thread );
                try
                {
                  sbhl_cache_tuning_experiment_prologue();
                  cyc_testing_utilities.run_cyc_test_int( test_name, $kw70$SILENT, NIL, NIL, $kw110$STANDARD, StreamsLow.$null_output$.getDynamicValue( thread ), cyc_testing.$run_tiny_kb_tests_in_full_kbP$
                      .getDynamicValue( thread ) );
                  sbhl_cache_tuning_experiment_epilogue( state );
                }
                catch( final Throwable catch_var )
                {
                  Errors.handleThrowable( catch_var, NIL );
                }
              }
              finally
              {
                Errors.$error_handler$.rebind( _prev_bind_0_$18, thread );
              }
            }
            catch( final Throwable ccatch_env_var )
            {
              msg = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
            }
            finally
            {
              thread.throwStack.pop();
            }
            if( msg.isString() )
            {
              failures = ConsesLow.cons( ConsesLow.cons( test_name, msg ), failures );
            }
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            csome_list_var = csome_list_var.rest();
            test_name = csome_list_var.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$19, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
        utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
        utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
        utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
      }
      if( NIL != list_utilities.sublisp_boolean( failures ) )
      {
        failed_contributions = conses_high.putf( failed_contributions, $kw190$CYC_TESTS, failures );
      }
    }
    if( NIL != list_utilities.sublisp_boolean( $kb_queries_to_use_for_sbhl_cache_tuning$.getDynamicValue( thread ) ) )
    {
      SubLObject failures = NIL;
      final SubLObject list_var = $kb_queries_to_use_for_sbhl_cache_tuning$.getDynamicValue( thread );
      final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( $str191$Gathering_SBHL_cache_tuning_data_, thread );
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
        utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
          SubLObject csome_list_var = list_var;
          SubLObject kbq = NIL;
          kbq = csome_list_var.first();
          while ( NIL != csome_list_var)
          {
            failures = ConsesLow.cons( ConsesLow.cons( kbq, $str192$KBQ_Support_currently_not_impleme ), failures );
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            csome_list_var = csome_list_var.rest();
            kbq = csome_list_var.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$20, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
        utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
        utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
        utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
      }
      if( NIL != list_utilities.sublisp_boolean( failures ) )
      {
        failed_contributions = conses_high.putf( failed_contributions, $kw193$KB_QUERIES, failures );
      }
    }
    if( NIL != list_utilities.sublisp_boolean( $run_cyclops_for_sbhl_cache_tuningP$.getDynamicValue( thread ) ) )
    {
      SubLObject failures = NIL;
      final SubLObject _prev_bind_9 = utilities_macros.$progress_note$.currentBinding( thread );
      final SubLObject _prev_bind_10 = utilities_macros.$progress_start_time$.currentBinding( thread );
      final SubLObject _prev_bind_11 = utilities_macros.$progress_total$.currentBinding( thread );
      final SubLObject _prev_bind_12 = utilities_macros.$progress_sofar$.currentBinding( thread );
      final SubLObject _prev_bind_13 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_14 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_15 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_16 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( $str194$Gathering_SBHL_cache_tuning_data_, thread );
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_total$.bind( ONE_INTEGER, thread );
        utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
          SubLObject counter;
          SubLObject msg2;
          SubLObject _prev_bind_0_$21;
          for( counter = NIL, counter = ZERO_INTEGER; counter.numL( utilities_macros.$progress_total$.getDynamicValue( thread ) ); counter = Numbers.add( counter, ONE_INTEGER ) )
          {
            msg2 = NIL;
            try
            {
              thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
              _prev_bind_0_$21 = Errors.$error_handler$.currentBinding( thread );
              try
              {
                Errors.$error_handler$.bind( $sym189$CATCH_ERROR_MESSAGE_HANDLER, thread );
                try
                {
                  sbhl_cache_tuning_experiment_prologue();
                  system_benchmarks.benchmark_cyclops_compensating_for_paging( ZERO_INTEGER, ONE_INTEGER, SIX_INTEGER, StreamsLow.$null_output$.getDynamicValue( thread ) );
                  sbhl_cache_tuning_experiment_epilogue( state );
                }
                catch( final Throwable catch_var2 )
                {
                  Errors.handleThrowable( catch_var2, NIL );
                }
              }
              finally
              {
                Errors.$error_handler$.rebind( _prev_bind_0_$21, thread );
              }
            }
            catch( final Throwable ccatch_env_var2 )
            {
              msg2 = Errors.handleThrowable( ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
            }
            finally
            {
              thread.throwStack.pop();
            }
            if( msg2.isString() )
            {
              failures = ConsesLow.cons( ConsesLow.cons( $kw195$CYCLOPS, msg2 ), failures );
            }
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$22 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values3 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values3 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$22, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_16, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_15, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_14, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_13, thread );
        utilities_macros.$progress_sofar$.rebind( _prev_bind_12, thread );
        utilities_macros.$progress_total$.rebind( _prev_bind_11, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_10, thread );
        utilities_macros.$progress_note$.rebind( _prev_bind_9, thread );
      }
      if( NIL != list_utilities.sublisp_boolean( failures ) )
      {
        failed_contributions = conses_high.putf( failed_contributions, $kw195$CYCLOPS, failures );
      }
    }
    return failed_contributions;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 68309L)
  public static SubLObject sbhl_cache_tuning_data_gathering_prologue()
  {
    return sbhl_caching_policies.setup_sbhl_graphs_for_sbhl_cache_tuning_data_gathering();
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 68549L)
  public static SubLObject sbhl_cache_tuning_experiment_prologue()
  {
    return sbhl_caching_policies.setup_sbhl_graphs_for_sbhl_cache_tuning_experiment();
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 68823L)
  public static SubLObject sbhl_cache_tuning_experiment_epilogue(final SubLObject state)
  {
    return sbhl_caching_policies.tear_down_sbhl_graphs_for_sbhl_cache_tuning_experiment( state );
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 69136L)
  public static SubLObject sbhl_cache_tuning_data_gathering_generate_report(final SubLObject filename, final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_binary( filename, $kw49$OUTPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str50$Unable_to_open__S, filename );
      }
      final SubLObject s = stream;
      sbhl_caching_policies.contribute_sbhl_graphs_data_for_sbhl_cache_tuning_experiment( s, state );
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    return filename;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 69585L)
  public static SubLObject sbhl_cache_tuning_data_gathering_epilogue()
  {
    return sbhl_caching_policies.tear_down_sbhl_graphs_for_sbhl_cache_tuning_data_gathering();
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 69814L)
  public static SubLObject compile_kb_snapshot_statistics(SubLObject directory)
  {
    if( directory == UNPROVIDED )
    {
      directory = misc_utilities.generic_caches_directory();
    }
    final SubLObject result_map = gather_kb_snapshot_statistics( directory, UNPROVIDED );
    SubLObject statistics = NIL;
    SubLObject cdolist_list_var = dumper.get_kb_units_file_vector_categories();
    SubLObject category = NIL;
    category = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject result = map_utilities.map_get( result_map, category, UNPROVIDED );
      final SubLObject edits = map_utilities.map_get( result, $kw197$REVERSAL, ZERO_INTEGER );
      final SubLObject deletes = map_utilities.map_get( result, $kw198$TOMBSTONE, ZERO_INTEGER );
      final SubLObject entries = map_utilities.map_get( result, $kw199$INDEX_ENTRIES, ZERO_INTEGER );
      final SubLObject data_bytes = map_utilities.map_get( result, $kw200$DATA_BYTES, ZERO_INTEGER );
      statistics = ConsesLow.cons( ConsesLow.list( new SubLObject[] { $str201$category, category, $str202$numOfEdits, edits, $str203$numOfDeletes, deletes, $str204$numOfEntries, entries, $str205$numOfBytes, data_bytes,
        $str206$fragBytes, MINUS_ONE_INTEGER
      } ), statistics );
      cdolist_list_var = cdolist_list_var.rest();
      category = cdolist_list_var.first();
    }
    return Sequences.reverse( statistics );
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 70910L)
  public static SubLObject gather_kb_snapshot_statistics(final SubLObject directory, SubLObject result_map)
  {
    if( result_map == UNPROVIDED )
    {
      result_map = NIL;
    }
    if( NIL == result_map )
    {
      result_map = dictionary.new_dictionary( EQUAL, UNPROVIDED );
    }
    SubLObject cdolist_list_var = dumper.get_kb_units_file_vector_categories();
    SubLObject fvector_label = NIL;
    fvector_label = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      map_utilities.map_put( result_map, fvector_label, $kw208$IN_PROGRESS );
      cdolist_list_var = cdolist_list_var.rest();
      fvector_label = cdolist_list_var.first();
    }
    cdolist_list_var = dumper.get_kb_units_file_vector_descriptions();
    SubLObject fvector_detail = NIL;
    fvector_detail = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject current;
      final SubLObject datum = current = fvector_detail;
      SubLObject allow_other_keys_p = NIL;
      SubLObject rest = current;
      SubLObject bad = NIL;
      SubLObject current_$23 = NIL;
      while ( NIL != rest)
      {
        cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list209 );
        current_$23 = rest.first();
        rest = rest.rest();
        cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list209 );
        if( NIL == conses_high.member( current_$23, $list210, UNPROVIDED, UNPROVIDED ) )
        {
          bad = T;
        }
        if( current_$23 == $kw211$ALLOW_OTHER_KEYS )
        {
          allow_other_keys_p = rest.first();
        }
        rest = rest.rest();
      }
      if( NIL != bad && NIL == allow_other_keys_p )
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list209 );
      }
      final SubLObject data_file_tail = cdestructuring_bind.property_list_member( $kw212$DATA_FILE, current );
      final SubLObject data_file = ( NIL != data_file_tail ) ? conses_high.cadr( data_file_tail ) : NIL;
      final SubLObject index_file_tail = cdestructuring_bind.property_list_member( $kw213$INDEX_FILE, current );
      final SubLObject index_file = ( NIL != index_file_tail ) ? conses_high.cadr( index_file_tail ) : NIL;
      final SubLObject type_tail = cdestructuring_bind.property_list_member( $kw214$TYPE, current );
      final SubLObject type = ( NIL != type_tail ) ? conses_high.cadr( type_tail ) : NIL;
      final SubLObject complex_data_file_tail = cdestructuring_bind.property_list_member( $kw215$COMPLEX_DATA_FILE, current );
      final SubLObject complex_data_file = ( NIL != complex_data_file_tail ) ? conses_high.cadr( complex_data_file_tail ) : NIL;
      final SubLObject complex_index_file_tail = cdestructuring_bind.property_list_member( $kw216$COMPLEX_INDEX_FILE, current );
      final SubLObject complex_index_file = ( NIL != complex_index_file_tail ) ? conses_high.cadr( complex_index_file_tail ) : NIL;
      final SubLObject pcase_var = type;
      if( pcase_var.eql( $kw217$KNOWLEDGE ) )
      {
        gather_one_kb_snapshot_statistic( result_map, data_file, index_file, directory );
      }
      else if( pcase_var.eql( $kw218$INDEXING ) )
      {
        gather_one_kb_snapshot_statistic( result_map, data_file, index_file, directory );
        gather_one_kb_snapshot_statistic( result_map, complex_data_file, complex_index_file, directory );
      }
      else
      {
        Errors.error( $str219$Unsupported_file_vector_type__A__, type );
      }
      cdolist_list_var = cdolist_list_var.rest();
      fvector_detail = cdolist_list_var.first();
    }
    return result_map;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 72179L)
  public static SubLObject gather_one_kb_snapshot_statistic(final SubLObject result_map, final SubLObject data_file, final SubLObject index_file, final SubLObject directory)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject data_file_path = dumper.kb_dump_file( data_file, directory, UNPROVIDED );
    final SubLObject index_file_path = dumper.kb_dump_file( index_file, directory, UNPROVIDED );
    SubLObject error_msg = NIL;
    SubLObject stats = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym189$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          stats = file_vector.gather_file_vector_statistics_for_filenames( data_file_path, index_file_path );
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      error_msg = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( error_msg.isString() )
    {
      map_utilities.map_put( result_map, data_file, error_msg );
    }
    else
    {
      map_utilities.map_put( result_map, data_file, stats );
    }
    return result_map;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 72705L)
  public static SubLObject track_kb_snapshot_statistics(final SubLObject directory, SubLObject pollsecs)
  {
    if( pollsecs == UNPROVIDED )
    {
      pollsecs = TEN_INTEGER;
    }
    final SubLObject categories = dumper.get_kb_units_file_vector_categories();
    final SubLObject result_map = dictionary_utilities.new_synchronized_dictionary( EQUAL, Sequences.length( categories ) );
    SubLObject doneP = NIL;
    subl_promotions.make_process_with_args( $str221$GATHER_KB_SNAPSHOT_STATISTICS, $sym207$GATHER_KB_SNAPSHOT_STATISTICS, ConsesLow.list( directory, result_map ) );
    while ( NIL == doneP)
    {
      PrintLow.format( T, $str222$__Check_at__A_______, numeric_date_utilities.timestring( UNPROVIDED ) );
      doneP = T;
      SubLObject cdolist_list_var = dumper.get_kb_units_file_vector_categories();
      SubLObject category = NIL;
      category = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject result = map_utilities.map_get( result_map, category, $kw208$IN_PROGRESS );
        if( $kw208$IN_PROGRESS == result )
        {
          PrintLow.format( T, $str223$_A_____in_progress__, category );
          doneP = NIL;
        }
        else if( result.isString() )
        {
          PrintLow.format( T, $str224$_A_____errored___A___, category, result );
        }
        else if( NIL != map_utilities.map_p( result ) )
        {
          PrintLow.format( T, $str225$_A___A_edits___A_deletes___A_entr, new SubLObject[] { category, map_utilities.map_get( result, $kw197$REVERSAL, ZERO_INTEGER ), map_utilities.map_get( result, $kw198$TOMBSTONE,
              ZERO_INTEGER ), map_utilities.map_get( result, $kw199$INDEX_ENTRIES, ZERO_INTEGER ), map_utilities.map_get( result, $kw200$DATA_BYTES, ZERO_INTEGER )
          } );
        }
        else
        {
          Errors.error( $str226$Unknown_category__A_____dont_know, category );
        }
        cdolist_list_var = cdolist_list_var.rest();
        category = cdolist_list_var.first();
      }
      if( NIL == doneP )
      {
        streams_high.force_output( T );
        Threads.sleep( pollsecs );
      }
    }
    return result_map;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 74261L)
  public static SubLObject get_kb_mini_dump_timestamp()
  {
    return Time.get_universal_time();
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 74855L)
  public static SubLObject prepare_kb_mini_dump()
  {
    operation_communication.set_receive_state( $str41$no );
    SubLObject cdolist_list_var = tcp_server_utilities.all_tcp_servers();
    SubLObject tcp_server = NIL;
    tcp_server = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject type = tcp_server_utilities.tcp_server_type( tcp_server );
      if( $kw229$CYC_API != type )
      {
        tcp_server_utilities.disable_tcp_server( type );
      }
      cdolist_list_var = cdolist_list_var.rest();
      tcp_server = cdolist_list_var.first();
    }
    while ( NIL != agenda.agenda_busyP())
    {
      Threads.sleep( ONE_INTEGER );
    }
    return $kw149$SUCCESS;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 75377L)
  public static SubLObject perform_kb_mini_dump(final SubLObject units_path)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject curr_kb = control_vars.kb_loaded();
    SubLObject msg = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym189$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          control_vars.set_kb_loaded( Numbers.subtract( curr_kb, ONE_INTEGER ) );
          dumper.dump_kb( units_path );
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      msg = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( msg.isString() )
    {
      Errors.warn( $str231$Error_while_performing_mini_dump_, msg );
      control_vars.set_kb_loaded( curr_kb );
      return Values.values( $kw232$ERROR, msg );
    }
    mark_kb_mini_dump_as_successful( units_path );
    return operation_communication.halt_cyc_image( UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 75964L)
  public static SubLObject launch_asynchronous_kb_mini_dump(final SubLObject units_path)
  {
    return subl_promotions.make_process_with_args( $str234$Mini_KB_Dumper, $sym230$PERFORM_KB_MINI_DUMP, ConsesLow.list( units_path ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 76322L)
  public static SubLObject mark_kb_mini_dump_as_successful(final SubLObject units_path)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject dump_finished_file = Sequences.cconcatenate( units_path, $str235$mini_dump_finished_text );
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( dump_finished_file, $kw49$OUTPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str50$Unable_to_open__S, dump_finished_file );
      }
      final SubLObject s = stream;
      streams_high.write_string( numeric_date_utilities.timestring( UNPROVIDED ), s, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    return units_path;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 77073L)
  public static SubLObject build_process_worker_count()
  {
    return $build_process_worker_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 77216L)
  public static SubLObject set_build_process_worker_count(final SubLObject workers)
  {
    enforceType( workers, $sym66$NON_NEGATIVE_INTEGER_P );
    final SubLObject old = $build_process_worker_count$.getGlobalValue();
    $build_process_worker_count$.setGlobalValue( workers );
    return old;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 77491L)
  public static SubLObject build_process_parallelism_permittedP()
  {
    return Numbers.numGE( build_process_worker_count(), TWO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 77965L)
  public static SubLObject with_allowed_obfuscation_namespace_support(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym240$CLET, $list241, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 78171L)
  public static SubLObject with_allowed_obfuscation_namespace(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list243 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject namespace = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list243 );
    namespace = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym240$CLET, ConsesLow.list( ConsesLow.list( $sym244$_ALLOWED_OBFUSCATION_NAME_SPACES_, ConsesLow.listS( $sym245$CONS, namespace, $list246 ) ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list243 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 78442L)
  public static SubLObject allowed_obfuscation_namespace_constantP(final SubLObject constant)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject namespace = constants_high.constant_namespace( constant );
    return makeBoolean( NIL != Strings.stringE( $str248$cyc, namespace, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) || NIL != subl_promotions.memberP( namespace, $allowed_obfuscation_name_spaces$.getDynamicValue(
        thread ), EQUAL, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 78763L)
  public static SubLObject un_obfuscatable_constantP(final SubLObject constant)
  {
    return makeBoolean( NIL != constant_completion.constant_mentioned_in_codeP( constant ) || NIL == allowed_obfuscation_namespace_constantP( constant ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 79496L)
  public static SubLObject with_constant_obfuscation(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list251 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject function = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list251 );
    function = current.first();
    current = current.rest();
    final SubLObject state = current.isCons() ? current.first() : $kw252$UNPROVIDED;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list251 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject state_val = $sym253$STATE_VAL;
      return ConsesLow.list( $sym240$CLET, ConsesLow.list( ConsesLow.list( state_val, state ) ), ConsesLow.list( $sym240$CLET, ConsesLow.list( ConsesLow.list( $sym254$_CONSTANT_OBFUSCATION_NAME_GENERATOR_STATE_,
          ConsesLow.list( $sym245$CONS, function, state_val ) ) ), ConsesLow.listS( $sym255$WITH_CONSTANT_NAME_OBFUSCATION, $list256, ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list251 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 80079L)
  public static SubLObject obfuscate_constant_name_via_generator_fn(final SubLObject constant)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = $constant_obfuscation_name_generator_state$.getDynamicValue( thread );
    SubLObject generator = NIL;
    SubLObject state = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list258 );
    generator = current.first();
    current = ( state = current.rest() );
    return obfuscate_constant_name_via_generator_function( constant, generator, state );
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 80329L)
  public static SubLObject obfuscate_constant_name_via_generator_function(final SubLObject constant, final SubLObject generator, final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject map = $constant_obfuscation_cache$.getDynamicValue( thread );
    SubLObject obfuscated_name = ( NIL != map_utilities.map_p( map ) ) ? map_utilities.map_get( map, constant, $kw259$NOT_FOUND ) : NIL;
    if( !obfuscated_name.isString() )
    {
      if( NIL != un_obfuscatable_constantP( constant ) )
      {
        obfuscated_name = constants_high.constant_name( constant );
      }
      else
      {
        obfuscated_name = ( ( $kw252$UNPROVIDED == state ) ? Functions.funcall( generator, constant ) : Functions.funcall( generator, constant, state ) );
        for( SubLObject counter = ZERO_INTEGER, original_guess = obfuscated_name; NIL != constant_handles.constant_p( constants_high.find_constant( obfuscated_name ) ); obfuscated_name = Sequences.cconcatenate(
            format_nil.format_nil_a_no_copy( original_guess ), new SubLObject[]
            { $str260$_, format_nil.format_nil_d_no_copy( counter )
            } ) )
        {
          counter = Numbers.add( counter, ONE_INTEGER );
        }
        if( NIL != map_utilities.map_p( map ) )
        {
          map_utilities.map_put( map, constant, obfuscated_name );
        }
      }
    }
    return obfuscated_name;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 81416L)
  public static SubLObject new_constant_obfuscation_cache()
  {
    return Hashtables.make_hash_table( constant_handles.constant_count(), hash_table_utilities.to_hash_test( $sym263$KBEQ ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 81582L)
  public static SubLObject with_cached_constant_obfuscation(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list251 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject function = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list251 );
    function = current.first();
    current = current.rest();
    final SubLObject state = current.isCons() ? current.first() : $kw252$UNPROVIDED;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list251 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym240$CLET, $list264, ConsesLow.listS( $sym250$WITH_CONSTANT_OBFUSCATION, ConsesLow.list( function, state ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list251 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 82159L)
  public static SubLObject make_obfuscation_gensym_state(SubLObject upcase_prefix, SubLObject downcase_prefix)
  {
    if( upcase_prefix == UNPROVIDED )
    {
      upcase_prefix = $str266$C;
    }
    if( downcase_prefix == UNPROVIDED )
    {
      downcase_prefix = NIL;
    }
    if( !downcase_prefix.isString() )
    {
      downcase_prefix = Strings.string_downcase( upcase_prefix, UNPROVIDED, UNPROVIDED );
    }
    return ConsesLow.list( $kw267$ISG, integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), $kw268$UPCASE, upcase_prefix, $kw269$DOWNCASE, downcase_prefix );
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 82518L)
  public static SubLObject obfuscate_constant_name_gensym(final SubLObject constant, final SubLObject state)
  {
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = state;
    SubLObject bad = NIL;
    SubLObject current_$24 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, state, $list271 );
      current_$24 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, state, $list271 );
      if( NIL == conses_high.member( current_$24, $list272, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$24 == $kw211$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( state, $list271 );
    }
    final SubLObject isg_tail = cdestructuring_bind.property_list_member( $kw267$ISG, state );
    final SubLObject isg = ( NIL != isg_tail ) ? conses_high.cadr( isg_tail ) : NIL;
    final SubLObject upcase_tail = cdestructuring_bind.property_list_member( $kw268$UPCASE, state );
    final SubLObject upcase = ( NIL != upcase_tail ) ? conses_high.cadr( upcase_tail ) : NIL;
    final SubLObject downcase_tail = cdestructuring_bind.property_list_member( $kw269$DOWNCASE, state );
    final SubLObject downcase = ( NIL != downcase_tail ) ? conses_high.cadr( downcase_tail ) : NIL;
    final SubLObject prefix = ( NIL != Characters.upper_case_p( Strings.sublisp_char( constants_high.constant_name( constant ), ZERO_INTEGER ) ) ) ? upcase : downcase;
    final SubLObject id = integer_sequence_generator.integer_sequence_generator_next( isg );
    return Sequences.cconcatenate( format_nil.format_nil_a_no_copy( prefix ), new SubLObject[] { $str260$_, format_nil.format_nil_d_no_copy( id )
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 82862L)
  public static SubLObject obfuscate_and_dump_essential_kb(final SubLObject dump_dir, final SubLObject assertion_fn, final SubLObject nart_fn, final SubLObject constant_fn, SubLObject constant_state)
  {
    if( constant_state == UNPROVIDED )
    {
      constant_state = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( dump_dir, $sym14$DIRECTORY_P );
    SubLObject changedP = NIL;
    try
    {
      thread.resetMultipleValues();
      final SubLObject assertion_targets = determine_obfuscation_candidates( UNPROVIDED );
      final SubLObject nart_targets = thread.secondMultipleValue();
      thread.resetMultipleValues();
      try
      {
        apply_assertion_obfuscations( determine_assertion_obfuscations( assertion_targets, assertion_fn, UNPROVIDED ), $str274$Obfuscating_strings_in_Assertions );
        apply_assertion_obfuscations( determine_nart_obfuscations( nart_targets, nart_fn, UNPROVIDED ), $str275$Obfuscating_strings_in_NARTs );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          changedP = T;
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
      final SubLObject _prev_bind_2 = $constant_obfuscation_cache$.currentBinding( thread );
      try
      {
        $constant_obfuscation_cache$.bind( new_constant_obfuscation_cache(), thread );
        final SubLObject state_val = constant_state;
        final SubLObject _prev_bind_0_$25 = $constant_obfuscation_name_generator_state$.currentBinding( thread );
        final SubLObject _prev_bind_3 = constants_high.$constant_name_obfuscation_fn$.currentBinding( thread );
        try
        {
          $constant_obfuscation_name_generator_state$.bind( ConsesLow.cons( constant_fn, state_val ), thread );
          constants_high.$constant_name_obfuscation_fn$.bind( $sym257$OBFUSCATE_CONSTANT_NAME_VIA_GENERATOR_FN, thread );
          dumper.dump_non_computable_kb( dump_dir );
        }
        finally
        {
          constants_high.$constant_name_obfuscation_fn$.rebind( _prev_bind_3, thread );
          $constant_obfuscation_name_generator_state$.rebind( _prev_bind_0_$25, thread );
        }
      }
      finally
      {
        $constant_obfuscation_cache$.rebind( _prev_bind_2, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values2 = Values.getValuesAsVector();
        if( NIL != changedP )
        {
          final SubLObject str = $str276$KB_has_been_obfuscated__rendering;
          final SubLObject _prev_bind_0_$26 = utilities_macros.$progress_start_time$.currentBinding( thread );
          final SubLObject _prev_bind_5 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
          final SubLObject _prev_bind_6 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
          final SubLObject _prev_bind_7 = utilities_macros.$progress_notification_count$.currentBinding( thread );
          final SubLObject _prev_bind_8 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
          final SubLObject _prev_bind_9 = utilities_macros.$progress_count$.currentBinding( thread );
          final SubLObject _prev_bind_10 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
          final SubLObject _prev_bind_11 = utilities_macros.$silent_progressP$.currentBinding( thread );
          try
          {
            utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
            utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
            utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
            utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
            utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
            utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
            utilities_macros.$is_noting_progressP$.bind( T, thread );
            utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
            utilities_macros.noting_progress_preamble( str );
            operation_communication.halt_cyc_image( UNPROVIDED );
            utilities_macros.noting_progress_postamble();
          }
          finally
          {
            utilities_macros.$silent_progressP$.rebind( _prev_bind_11, thread );
            utilities_macros.$is_noting_progressP$.rebind( _prev_bind_10, thread );
            utilities_macros.$progress_count$.rebind( _prev_bind_9, thread );
            utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_8, thread );
            utilities_macros.$progress_notification_count$.rebind( _prev_bind_7, thread );
            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_6, thread );
            utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_5, thread );
            utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$26, thread );
          }
        }
        Values.restoreValuesFromVector( _values2 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_4, thread );
      }
    }
    return dump_dir;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 84965L)
  public static SubLObject determine_obfuscation_candidates(SubLObject message)
  {
    if( message == UNPROVIDED )
    {
      message = $str278$Identifying_needed_KB_changes;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject assertion_edits = Hashtables.make_hash_table( unrepresented_terms.kb_unrepresented_term_count(), EQUAL, UNPROVIDED );
    final SubLObject nart_edits = Hashtables.make_hash_table( unrepresented_terms.kb_unrepresented_term_count(), EQUAL, UNPROVIDED );
    if( NIL != unrepresented_terms.use_unrepresented_term_fhtP() )
    {
      SubLObject msg = Sequences.cconcatenate( message, $str279$____Old_Space );
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( unrepresented_terms.$unrepresented_term_fht_lock$.getGlobalValue() );
        final SubLObject table_var = unrepresented_terms.get_unrepresented_term_fht();
        utilities_macros.$progress_note$.setDynamicValue( msg, thread );
        utilities_macros.$progress_start_time$.setDynamicValue( Time.get_universal_time(), thread );
        utilities_macros.$progress_total$.setDynamicValue( file_hash_table.file_hash_table_count( table_var ), thread );
        utilities_macros.$progress_sofar$.setDynamicValue( ZERO_INTEGER, thread );
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
        try
        {
          utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
          utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
          utilities_macros.$within_noting_percent_progress$.bind( T, thread );
          utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
          try
          {
            utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
            SubLObject continuation = NIL;
            SubLObject next;
            for( SubLObject completeP = NIL; NIL == completeP; completeP = Types.sublisp_null( next ) )
            {
              thread.resetMultipleValues();
              final SubLObject the_key = file_hash_table.get_file_hash_table_any( table_var, continuation, NIL );
              final SubLObject the_value = thread.secondMultipleValue();
              next = thread.thirdMultipleValue();
              thread.resetMultipleValues();
              if( NIL != next )
              {
                final SubLObject key = the_key;
                final SubLObject unrep_term = the_value;
                utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
                utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
                if( NIL == unrepresented_terms.deleted_unrepresented_term_itemP( key ) && NIL != unrepresented_terms.fht_suid_item_p( key ) )
                {
                  final SubLObject suid = unrepresented_terms.get_fht_suid_item_suid( key );
                  if( unrep_term.isString() )
                  {
                    final SubLObject leaves = kb_indexing_datastructures.index_leaves( unrepresented_term_index_manager.lookup_unrepresented_term_index( suid ) );
                    thread.resetMultipleValues();
                    final SubLObject assertions = list_utilities.npartition_list( leaves, $sym280$NOT_TERM_OF_UNIT_ASSERTION_ );
                    final SubLObject tous = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if( NIL != assertions )
                    {
                      map_utilities.map_put( assertion_edits, unrep_term, assertions );
                    }
                    if( NIL != tous )
                    {
                      map_utilities.map_put( nart_edits, unrep_term, tous );
                    }
                  }
                }
              }
              continuation = next;
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$27 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              utilities_macros.noting_percent_progress_postamble();
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$27, thread );
            }
          }
        }
        finally
        {
          utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
          utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
          utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
          utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
        }
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( unrepresented_terms.$unrepresented_term_fht_lock$.getGlobalValue() );
        }
      }
      msg = Sequences.cconcatenate( message, $str281$____New_Space );
      if( NIL != unrepresented_terms.use_unrepresented_term_fhtP() )
      {
        final SubLObject list_var = unrepresented_terms.get_unrepresented_term_new_space_ascending_suid_keys();
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
        try
        {
          utilities_macros.$progress_note$.bind( ( NIL != msg ) ? msg : $str152$cdolist, thread );
          utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
          utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
          utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
          utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
          utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
          utilities_macros.$within_noting_percent_progress$.bind( T, thread );
          utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
          try
          {
            utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
            SubLObject csome_list_var = list_var;
            SubLObject suid_item = NIL;
            suid_item = csome_list_var.first();
            while ( NIL != csome_list_var)
            {
              final SubLObject suid2 = unrepresented_terms.get_fht_suid_item_suid( suid_item );
              final SubLObject unrep_term2 = unrepresented_terms.find_unrepresented_term_by_suid( suid2 );
              if( unrep_term2.isString() )
              {
                final SubLObject leaves = kb_indexing_datastructures.index_leaves( unrepresented_term_index_manager.lookup_unrepresented_term_index( suid2 ) );
                thread.resetMultipleValues();
                final SubLObject assertions = list_utilities.npartition_list( leaves, $sym280$NOT_TERM_OF_UNIT_ASSERTION_ );
                final SubLObject tous = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if( NIL != assertions )
                {
                  map_utilities.map_put( assertion_edits, unrep_term2, assertions );
                }
                if( NIL != tous )
                {
                  map_utilities.map_put( nart_edits, unrep_term2, tous );
                }
              }
              utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
              utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
              csome_list_var = csome_list_var.rest();
              suid_item = csome_list_var.first();
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values2 = Values.getValuesAsVector();
              utilities_macros.noting_percent_progress_postamble();
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$28, thread );
            }
          }
        }
        finally
        {
          utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
          utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
          utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
          utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
          utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
          utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
          utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
          utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
        }
      }
      else
      {
        final SubLObject table_var = unrepresented_terms.do_unrepresented_terms_table();
        final SubLObject first_id_var = unrepresented_terms.new_unrepresented_term_id_threshold();
        final SubLObject total = Numbers.subtract( id_index.id_index_next_id( table_var ), first_id_var );
        SubLObject sofar = ZERO_INTEGER;
        final SubLObject _prev_bind_9 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
        final SubLObject _prev_bind_10 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
        final SubLObject _prev_bind_11 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
        final SubLObject _prev_bind_12 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
        try
        {
          utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
          utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
          utilities_macros.$within_noting_percent_progress$.bind( T, thread );
          utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
          try
          {
            utilities_macros.noting_percent_progress_preamble( msg );
            SubLObject unrep_term;
            SubLObject suid;
            SubLObject leaves;
            SubLObject assertions;
            SubLObject tous;
            SubLObject end_var;
            SubLObject end;
            SubLObject id;
            for( end = ( end_var = id_index.id_index_next_id( table_var ) ), id = NIL, id = first_id_var; !id.numGE( end_var ); id = number_utilities.f_1X( id ) )
            {
              unrep_term = id_index.id_index_lookup( table_var, id, UNPROVIDED );
              if( NIL != unrep_term )
              {
                utilities_macros.note_percent_progress( sofar, total );
                sofar = Numbers.add( sofar, ONE_INTEGER );
                suid = unrepresented_terms.unrepresented_term_suid( unrep_term );
                if( unrep_term.isString() )
                {
                  leaves = kb_indexing_datastructures.index_leaves( unrepresented_term_index_manager.lookup_unrepresented_term_index( suid ) );
                  thread.resetMultipleValues();
                  assertions = list_utilities.npartition_list( leaves, $sym280$NOT_TERM_OF_UNIT_ASSERTION_ );
                  tous = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  if( NIL != assertions )
                  {
                    map_utilities.map_put( assertion_edits, unrep_term, assertions );
                  }
                  if( NIL != tous )
                  {
                    map_utilities.map_put( nart_edits, unrep_term, tous );
                  }
                }
              }
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$29 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values3 = Values.getValuesAsVector();
              utilities_macros.noting_percent_progress_postamble();
              Values.restoreValuesFromVector( _values3 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$29, thread );
            }
          }
        }
        finally
        {
          utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_12, thread );
          utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_11, thread );
          utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_10, thread );
          utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_9, thread );
        }
      }
    }
    else
    {
      final SubLObject idx = unrepresented_terms.do_unrepresented_terms_table();
      final SubLObject mess = message;
      final SubLObject total2 = id_index.id_index_count( idx );
      SubLObject sofar2 = ZERO_INTEGER;
      assert NIL != Types.stringp( mess ) : mess;
      final SubLObject _prev_bind_13 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_14 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_15 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_16 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( mess );
          final SubLObject idx_$30 = idx;
          if( NIL == id_index.id_index_objects_empty_p( idx_$30, $kw282$SKIP ) )
          {
            final SubLObject idx_$31 = idx_$30;
            if( NIL == id_index.id_index_dense_objects_empty_p( idx_$31, $kw282$SKIP ) )
            {
              final SubLObject vector_var = id_index.id_index_dense_objects( idx_$31 );
              final SubLObject backwardP_var = NIL;
              SubLObject suid;
              SubLObject length;
              SubLObject v_iteration;
              SubLObject unrep_term3;
              SubLObject leaves2;
              SubLObject assertions2;
              SubLObject tous2;
              for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
              {
                suid = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                unrep_term3 = Vectors.aref( vector_var, suid );
                if( NIL == id_index.id_index_tombstone_p( unrep_term3 ) || NIL == id_index.id_index_skip_tombstones_p( $kw282$SKIP ) )
                {
                  if( NIL != id_index.id_index_tombstone_p( unrep_term3 ) )
                  {
                    unrep_term3 = $kw282$SKIP;
                  }
                  if( unrep_term3.isString() )
                  {
                    leaves2 = kb_indexing_datastructures.index_leaves( unrepresented_term_index_manager.lookup_unrepresented_term_index( suid ) );
                    thread.resetMultipleValues();
                    assertions2 = list_utilities.npartition_list( leaves2, $sym280$NOT_TERM_OF_UNIT_ASSERTION_ );
                    tous2 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if( NIL != assertions2 )
                    {
                      map_utilities.map_put( assertion_edits, unrep_term3, assertions2 );
                    }
                    if( NIL != tous2 )
                    {
                      map_utilities.map_put( nart_edits, unrep_term3, tous2 );
                    }
                  }
                  sofar2 = Numbers.add( sofar2, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar2, total2 );
                }
              }
            }
            final SubLObject idx_$32 = idx_$30;
            if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$32 ) || NIL == id_index.id_index_skip_tombstones_p( $kw282$SKIP ) )
            {
              final SubLObject sparse = id_index.id_index_sparse_objects( idx_$32 );
              SubLObject suid3 = id_index.id_index_sparse_id_threshold( idx_$32 );
              final SubLObject end_id = id_index.id_index_next_id( idx_$32 );
              final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw282$SKIP ) ) ? NIL : $kw282$SKIP;
              while ( suid3.numL( end_id ))
              {
                final SubLObject unrep_term2 = Hashtables.gethash_without_values( suid3, sparse, v_default );
                if( NIL == id_index.id_index_skip_tombstones_p( $kw282$SKIP ) || NIL == id_index.id_index_tombstone_p( unrep_term2 ) )
                {
                  if( unrep_term2.isString() )
                  {
                    final SubLObject leaves = kb_indexing_datastructures.index_leaves( unrepresented_term_index_manager.lookup_unrepresented_term_index( suid3 ) );
                    thread.resetMultipleValues();
                    final SubLObject assertions = list_utilities.npartition_list( leaves, $sym280$NOT_TERM_OF_UNIT_ASSERTION_ );
                    final SubLObject tous = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if( NIL != assertions )
                    {
                      map_utilities.map_put( assertion_edits, unrep_term2, assertions );
                    }
                    if( NIL != tous )
                    {
                      map_utilities.map_put( nart_edits, unrep_term2, tous );
                    }
                  }
                  sofar2 = Numbers.add( sofar2, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar2, total2 );
                }
                suid3 = Numbers.add( suid3, ONE_INTEGER );
              }
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$30 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values4 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values4 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$30, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_16, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_15, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_14, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_13, thread );
      }
    }
    return Values.values( assertion_edits, nart_edits );
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 86181L)
  public static SubLObject not_term_of_unit_assertionP(final SubLObject as)
  {
    return makeBoolean( NIL == function_terms.tou_assertionP( as ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 86267L)
  public static SubLObject determine_assertion_obfuscations(final SubLObject assertion_edits, final SubLObject obfuscator_fn, SubLObject message)
  {
    if( message == UNPROVIDED )
    {
      message = $str284$Identifying_assertion_changes;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject edits = Hashtables.make_hash_table( map_utilities.map_size( assertion_edits ), UNPROVIDED, UNPROVIDED );
    final SubLObject mess = message;
    SubLObject sofar = ZERO_INTEGER;
    final SubLObject total = map_utilities.map_size( assertion_edits );
    assert NIL != Types.stringp( mess ) : mess;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( mess );
        final SubLObject iterator = map_utilities.new_map_iterator( assertion_edits );
        SubLObject valid;
        for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
        {
          thread.resetMultipleValues();
          final SubLObject var = iteration.iteration_next( iterator );
          valid = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( NIL != valid )
          {
            SubLObject current;
            final SubLObject datum = current = var;
            SubLObject unrep_term = NIL;
            SubLObject assertions = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list285 );
            unrep_term = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list285 );
            assertions = current.first();
            current = current.rest();
            if( NIL == current )
            {
              utilities_macros.note_percent_progress( sofar, total );
              sofar = Numbers.add( sofar, ONE_INTEGER );
              SubLObject cdolist_list_var;
              final SubLObject classified_assertion_sets = cdolist_list_var = Functions.funcall( obfuscator_fn, unrep_term, assertions );
              SubLObject classified_assertion_set = NIL;
              classified_assertion_set = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                SubLObject current_$35;
                final SubLObject datum_$34 = current_$35 = classified_assertion_set;
                SubLObject new_string = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current_$35, datum_$34, $list286 );
                new_string = current_$35.first();
                current_$35 = current_$35.rest();
                SubLObject cdolist_list_var_$36;
                final SubLObject target_assertions = cdolist_list_var_$36 = current_$35;
                SubLObject target_assertion = NIL;
                target_assertion = cdolist_list_var_$36.first();
                while ( NIL != cdolist_list_var_$36)
                {
                  map_utilities.map_push( edits, target_assertion, ConsesLow.cons( unrep_term, new_string ) );
                  cdolist_list_var_$36 = cdolist_list_var_$36.rest();
                  target_assertion = cdolist_list_var_$36.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                classified_assertion_set = cdolist_list_var.first();
              }
            }
            else
            {
              cdestructuring_bind.cdestructuring_bind_error( datum, $list285 );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$37 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$37, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    return edits;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 87485L)
  public static SubLObject determine_nart_obfuscations(final SubLObject nart_edits, final SubLObject obfuscator_fn, SubLObject message)
  {
    if( message == UNPROVIDED )
    {
      message = $str288$Identifying_NART_changes;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject edits = Hashtables.make_hash_table( map_utilities.map_size( nart_edits ), UNPROVIDED, UNPROVIDED );
    final SubLObject naut_to_tou = dictionary.new_dictionary( EQUAL, UNPROVIDED );
    final SubLObject mess = message;
    SubLObject sofar = ZERO_INTEGER;
    final SubLObject total = map_utilities.map_size( nart_edits );
    assert NIL != Types.stringp( mess ) : mess;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( mess );
        final SubLObject iterator = map_utilities.new_map_iterator( nart_edits );
        SubLObject valid;
        for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
        {
          thread.resetMultipleValues();
          final SubLObject var = iteration.iteration_next( iterator );
          valid = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( NIL != valid )
          {
            SubLObject current;
            final SubLObject datum = current = var;
            SubLObject unrep_term = NIL;
            SubLObject assertions = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list285 );
            unrep_term = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list285 );
            assertions = current.first();
            current = current.rest();
            if( NIL == current )
            {
              utilities_macros.note_percent_progress( sofar, total );
              sofar = Numbers.add( sofar, ONE_INTEGER );
              map_utilities.map_remove_all( naut_to_tou );
              SubLObject assertion_nauts = NIL;
              SubLObject cdolist_list_var = assertions;
              SubLObject tou = NIL;
              tou = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                final SubLObject naut = assertions_high.gaf_arg2( tou );
                map_utilities.map_put( naut_to_tou, naut, tou );
                assertion_nauts = ConsesLow.cons( naut, assertion_nauts );
                cdolist_list_var = cdolist_list_var.rest();
                tou = cdolist_list_var.first();
              }
              SubLObject cdolist_list_var2;
              final SubLObject classified_naut_sets = cdolist_list_var2 = Functions.funcall( obfuscator_fn, unrep_term, assertion_nauts );
              SubLObject classified_naut_set = NIL;
              classified_naut_set = cdolist_list_var2.first();
              while ( NIL != cdolist_list_var2)
              {
                SubLObject current_$39;
                final SubLObject datum_$38 = current_$39 = classified_naut_set;
                SubLObject new_string = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current_$39, datum_$38, $list289 );
                new_string = current_$39.first();
                current_$39 = current_$39.rest();
                SubLObject cdolist_list_var_$40;
                final SubLObject target_nauts = cdolist_list_var_$40 = current_$39;
                SubLObject target_naut = NIL;
                target_naut = cdolist_list_var_$40.first();
                while ( NIL != cdolist_list_var_$40)
                {
                  final SubLObject target_assertion = map_utilities.map_get( naut_to_tou, target_naut, UNPROVIDED );
                  map_utilities.map_push( edits, target_assertion, ConsesLow.cons( unrep_term, new_string ) );
                  cdolist_list_var_$40 = cdolist_list_var_$40.rest();
                  target_naut = cdolist_list_var_$40.first();
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                classified_naut_set = cdolist_list_var2.first();
              }
            }
            else
            {
              cdestructuring_bind.cdestructuring_bind_error( datum, $list285 );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$41 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$41, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    return edits;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 89004L)
  public static SubLObject apply_assertion_obfuscations(final SubLObject edits_spec, SubLObject message)
  {
    if( message == UNPROVIDED )
    {
      message = $str291$Applying_assertion_changes;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject edits = ZERO_INTEGER;
    SubLObject non_gafs = ZERO_INTEGER;
    SubLObject assertion_order = NIL;
    SubLObject success = NIL;
    final SubLObject str = $str292$Optimizing_edit_order;
    SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding( thread );
    SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
    SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
    SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
    SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
    SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
    SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
    SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
      utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
      utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
      utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
      utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
      utilities_macros.$is_noting_progressP$.bind( T, thread );
      utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
      utilities_macros.noting_progress_preamble( str );
      assertion_order = assertion_utilities.sort_assertions( map_utilities.map_keys( edits_spec ) );
      utilities_macros.noting_progress_postamble();
    }
    finally
    {
      utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
      utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
      utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
      utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_0, thread );
    }
    try
    {
      final SubLObject list_var = assertion_order;
      _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
      _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
      _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
      _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
      _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( ( NIL != message ) ? message : $str152$cdolist, thread );
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
        utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
          SubLObject csome_list_var = list_var;
          SubLObject target_assertion = NIL;
          target_assertion = csome_list_var.first();
          while ( NIL != csome_list_var)
          {
            SubLObject cdolist_list_var;
            final SubLObject string_mappings = cdolist_list_var = map_utilities.map_get( edits_spec, target_assertion, UNPROVIDED );
            SubLObject string_mapping = NIL;
            string_mapping = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              SubLObject current;
              final SubLObject datum = current = string_mapping;
              SubLObject unrep_term = NIL;
              SubLObject new_string = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list293 );
              unrep_term = current.first();
              current = ( new_string = current.rest() );
              final SubLObject old_formula_data = assertions_low.assertion_formula_data( target_assertion );
              assertion_manager.mark_assertion_content_as_muted( assertion_handles.assertion_id( target_assertion ) );
              if( NIL != clause_strucs.clause_struc_p( old_formula_data ) )
              {
                final SubLObject cs = old_formula_data;
                cycl_utilities.expression_nsubst( new_string, unrep_term, clause_strucs.clause_struc_cnf( cs ), EQUAL, UNPROVIDED );
              }
              else if( NIL != clauses.cnf_p( old_formula_data ) || old_formula_data.isCons() )
              {
                cycl_utilities.expression_nsubst( new_string, unrep_term, old_formula_data, EQUAL, UNPROVIDED );
              }
              else
              {
                non_gafs = Numbers.add( non_gafs, ONE_INTEGER );
              }
              edits = Numbers.add( edits, ONE_INTEGER );
              cdolist_list_var = cdolist_list_var.rest();
              string_mapping = cdolist_list_var.first();
            }
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            csome_list_var = csome_list_var.rest();
            target_assertion = csome_list_var.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$42 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$42, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
        utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
        utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
        utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
      }
      success = T;
    }
    finally
    {
      final SubLObject _prev_bind_9 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values2 = Values.getValuesAsVector();
        if( NIL == success )
        {
          final SubLObject str2;
          final SubLObject msg = str2 = Sequences.cconcatenate( $str294$A_total_of_, new SubLObject[] { format_nil.format_nil_a_no_copy( edits ), $str295$_edits_had_been_made_to_the_KB_
          } );
          final SubLObject _prev_bind_0_$43 = utilities_macros.$progress_start_time$.currentBinding( thread );
          final SubLObject _prev_bind_10 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
          final SubLObject _prev_bind_11 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
          final SubLObject _prev_bind_12 = utilities_macros.$progress_notification_count$.currentBinding( thread );
          final SubLObject _prev_bind_13 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
          final SubLObject _prev_bind_14 = utilities_macros.$progress_count$.currentBinding( thread );
          final SubLObject _prev_bind_15 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
          final SubLObject _prev_bind_16 = utilities_macros.$silent_progressP$.currentBinding( thread );
          try
          {
            utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
            utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
            utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
            utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
            utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
            utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
            utilities_macros.$is_noting_progressP$.bind( T, thread );
            utilities_macros.$silent_progressP$.bind( ( NIL != str2 ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
            utilities_macros.noting_progress_preamble( str2 );
            utilities_macros.noting_progress_postamble();
          }
          finally
          {
            utilities_macros.$silent_progressP$.rebind( _prev_bind_16, thread );
            utilities_macros.$is_noting_progressP$.rebind( _prev_bind_15, thread );
            utilities_macros.$progress_count$.rebind( _prev_bind_14, thread );
            utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_13, thread );
            utilities_macros.$progress_notification_count$.rebind( _prev_bind_12, thread );
            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_11, thread );
            utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_10, thread );
            utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$43, thread );
          }
        }
        Values.restoreValuesFromVector( _values2 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_9, thread );
      }
    }
    return Values.values( edits, ConsesLow.list( $kw296$NON_GAFS, non_gafs ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 90910L)
  public static SubLObject weakly_scramble_string_in_assertions(final SubLObject string, final SubLObject assertions)
  {
    final SubLObject odd_string = Sequences.reverse( string );
    final SubLObject even_string = mix_case_string( string );
    SubLObject odd_assertions = NIL;
    SubLObject even_assertions = NIL;
    SubLObject result = NIL;
    SubLObject cdolist_list_var = assertions;
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != Numbers.evenp( assertion_handles.assertion_id( assertion ) ) )
      {
        even_assertions = ConsesLow.cons( assertion, even_assertions );
      }
      else
      {
        odd_assertions = ConsesLow.cons( assertion, odd_assertions );
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    if( NIL == list_utilities.empty_list_p( odd_assertions ) )
    {
      odd_assertions = ConsesLow.cons( odd_string, odd_assertions );
      result = ConsesLow.cons( odd_assertions, result );
    }
    if( NIL == list_utilities.empty_list_p( even_assertions ) )
    {
      even_assertions = ConsesLow.cons( even_string, even_assertions );
      result = ConsesLow.cons( even_assertions, result );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 91805L)
  public static SubLObject weakly_scramble_string_in_nauts(final SubLObject string, final SubLObject nauts)
  {
    final SubLObject odd_string = Sequences.reverse( string );
    final SubLObject even_string = mix_case_string( string );
    SubLObject odd_nauts = NIL;
    SubLObject even_nauts = NIL;
    SubLObject result = NIL;
    SubLObject cdolist_list_var = nauts;
    SubLObject naut = NIL;
    naut = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != Numbers.evenp( Sxhash.sxhash( naut ) ) )
      {
        even_nauts = ConsesLow.cons( naut, even_nauts );
      }
      else
      {
        odd_nauts = ConsesLow.cons( naut, odd_nauts );
      }
      cdolist_list_var = cdolist_list_var.rest();
      naut = cdolist_list_var.first();
    }
    if( NIL == list_utilities.empty_list_p( odd_nauts ) )
    {
      odd_nauts = ConsesLow.cons( odd_string, odd_nauts );
      result = ConsesLow.cons( odd_nauts, result );
    }
    if( NIL == list_utilities.empty_list_p( even_nauts ) )
    {
      even_nauts = ConsesLow.cons( even_string, even_nauts );
      result = ConsesLow.cons( even_nauts, result );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 92414L)
  public static SubLObject mix_case_string(final SubLObject string)
  {
    final SubLObject string_var;
    final SubLObject result = string_var = string_utilities.copy_string( string );
    SubLObject end_var_$44;
    SubLObject end_var;
    SubLObject index;
    SubLObject curr;
    for( end_var = ( end_var_$44 = Sequences.length( string_var ) ), index = NIL, index = ZERO_INTEGER; !index.numGE( end_var_$44 ); index = number_utilities.f_1X( index ) )
    {
      curr = Strings.sublisp_char( string_var, index );
      if( NIL != Characters.alpha_char_p( curr ) )
      {
        if( NIL != Numbers.evenp( index ) )
        {
          Strings.set_char( result, index, Characters.char_downcase( curr ) );
        }
        else if( NIL != Numbers.oddp( index ) )
        {
          Strings.set_char( result, index, Characters.char_upcase( curr ) );
        }
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 92769L)
  public static SubLObject select_clippable_collections(SubLObject tabu_collections, SubLObject elmt)
  {
    if( tabu_collections == UNPROVIDED )
    {
      tabu_collections = NIL;
    }
    if( elmt == UNPROVIDED )
    {
      elmt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject collections = NIL;
    if( NIL == elmt )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym300$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const301$EverythingPSC, thread );
        collections = isa.all_instances( $const302$Collection, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym303$RELEVANT_MT_IS_GENL_MT, thread );
        mt_relevance_macros.$mt$.bind( elmt, thread );
        collections = isa.all_instances( $const302$Collection, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    SubLObject cdolist_list_var = tabu_collections;
    SubLObject tabu_collection = NIL;
    tabu_collection = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      collections = Sequences.delete( tabu_collection, collections, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      tabu_collection = cdolist_list_var.first();
    }
    collections = list_utilities.remove_if_not( Symbols.symbol_function( $sym304$FORT_P ), collections, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL == elmt )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym300$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const301$EverythingPSC, thread );
        collections = Sequences.remove_if( Symbols.symbol_function( $sym305$HIGHER_ORDER_COLLECTION_ ), collections, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym303$RELEVANT_MT_IS_GENL_MT, thread );
        mt_relevance_macros.$mt$.bind( elmt, thread );
        collections = Sequences.remove_if( Symbols.symbol_function( $sym305$HIGHER_ORDER_COLLECTION_ ), collections, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    collections = Sort.sort( collections, Symbols.symbol_function( $sym306$_ ), $sym307$INSTANCE_CARDINALITY );
    collections = cardinality_estimates.stable_sort_by_generality_estimate( collections, $kw308$ASCENDING );
    return collections;
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 94656L)
  public static SubLObject higher_order_collectionP(final SubLObject col)
  {
    return isa.isaP( col, $const309$CollectionType, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 94793L)
  public static SubLObject gather_tabu_collections_for_clipping(final SubLObject terms, SubLObject code_constants, SubLObject elmt)
  {
    if( code_constants == UNPROVIDED )
    {
      code_constants = NIL;
    }
    if( elmt == UNPROVIDED )
    {
      elmt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == code_constants )
    {
      code_constants = constant_completion.constants_mentioned_in_code();
    }
    final SubLObject collections = set.new_set( UNPROVIDED, UNPROVIDED );
    final SubLObject actual_terms = Sequences.cconcatenate( terms, new SubLObject[] { code_constants, core.all_core_constants()
    } );
    SubLObject cols_to_add = NIL;
    SubLObject cdolist_list_var = actual_terms;
    SubLObject v_term = NIL;
    v_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != fort_types_interface.collectionP( v_term ) )
      {
        if( NIL != elmt )
        {
          final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$relevant_mt_function$.bind( $sym303$RELEVANT_MT_IS_GENL_MT, thread );
            mt_relevance_macros.$mt$.bind( elmt, thread );
            cols_to_add = genls.all_genls( v_term, UNPROVIDED, UNPROVIDED );
          }
          finally
          {
            mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
          }
        }
        else
        {
          final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$relevant_mt_function$.bind( $sym300$RELEVANT_MT_IS_EVERYTHING, thread );
            mt_relevance_macros.$mt$.bind( $const301$EverythingPSC, thread );
            cols_to_add = genls.all_genls( v_term, UNPROVIDED, UNPROVIDED );
          }
          finally
          {
            mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
          }
        }
      }
      else if( NIL != elmt )
      {
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym303$RELEVANT_MT_IS_GENL_MT, thread );
          mt_relevance_macros.$mt$.bind( elmt, thread );
          cols_to_add = isa.all_isa( v_term, UNPROVIDED, UNPROVIDED );
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
        }
      }
      else
      {
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym300$RELEVANT_MT_IS_EVERYTHING, thread );
          mt_relevance_macros.$mt$.bind( $const301$EverythingPSC, thread );
          cols_to_add = isa.all_isa( v_term, UNPROVIDED, UNPROVIDED );
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
        }
      }
      set_utilities.set_add_all( cols_to_add, collections );
      cdolist_list_var = cdolist_list_var.rest();
      v_term = cdolist_list_var.first();
    }
    return set.set_element_list( collections );
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 95794L)
  public static SubLObject clip_kb_percentage(final SubLObject permitted_collections, final SubLObject percentage, SubLObject logP)
  {
    if( logP == UNPROVIDED )
    {
      logP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject count_at_start = forts.fort_count();
    final SubLObject count_at_end = Numbers.floor( Numbers.multiply( percentage, count_at_start ), UNPROVIDED );
    if( !count_at_end.numL( count_at_start ) )
    {
      if( count_at_start.numE( count_at_end ) )
      {
        Errors.warn( $str310$Nothing_to_clip_ );
        return Values.values( forts.fort_count(), $kw311$PERCENTAGE );
      }
      Errors.error( $str312$Invalid_percentage__A__cannot_cli, percentage, count_at_end, count_at_start );
    }
    final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( $str152$cdolist, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( Sequences.length( permitted_collections ), thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject csome_list_var = permitted_collections;
        SubLObject permitted_collection = NIL;
        permitted_collection = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          SubLObject ignore_errors_tag = NIL;
          try
          {
            thread.throwStack.push( $kw38$IGNORE_ERRORS_TARGET );
            final SubLObject _prev_bind_0_$45 = Errors.$error_handler$.currentBinding( thread );
            try
            {
              Errors.$error_handler$.bind( Symbols.symbol_function( $sym39$IGNORE_ERRORS_HANDLER ), thread );
              try
              {
                if( NIL != logP )
                {
                  format_nil.force_format( T, $str313$___A__Deleting__A_____, numeric_date_utilities.timestring( UNPROVIDED ), permitted_collection, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
                      UNPROVIDED );
                }
                final SubLObject _prev_bind_0_$46 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
                final SubLObject _prev_bind_1_$47 = mt_relevance_macros.$mt$.currentBinding( thread );
                try
                {
                  mt_relevance_macros.$relevant_mt_function$.bind( $sym300$RELEVANT_MT_IS_EVERYTHING, thread );
                  mt_relevance_macros.$mt$.bind( $const301$EverythingPSC, thread );
                  final SubLObject node_var = permitted_collection;
                  final SubLObject _prev_bind_0_$47 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$48 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
                  try
                  {
                    sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const165$isa ), thread );
                    sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
                    try
                    {
                      SubLObject node_var_$50 = node_var;
                      final SubLObject deck_type = $kw316$STACK;
                      final SubLObject recur_deck = deck.create_deck( deck_type );
                      final SubLObject _prev_bind_0_$48 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
                      try
                      {
                        sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
                        try
                        {
                          final SubLObject tv_var = NIL;
                          final SubLObject _prev_bind_0_$49 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$49 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
                          try
                          {
                            sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym317$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ),
                                thread );
                            if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                            {
                              final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                              if( pcase_var.eql( $kw232$ERROR ) )
                              {
                                sbhl_paranoia.sbhl_error( ONE_INTEGER, $str318$_A_is_not_a__A, tv_var, $sym319$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                              else if( pcase_var.eql( $kw320$CERROR ) )
                              {
                                sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str321$continue_anyway, $str318$_A_is_not_a__A, tv_var, $sym319$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                              else if( pcase_var.eql( $kw322$WARN ) )
                              {
                                Errors.warn( $str318$_A_is_not_a__A, tv_var, $sym319$SBHL_TRUE_TV_P );
                              }
                              else
                              {
                                Errors.warn( $str323$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                                Errors.cerror( $str321$continue_anyway, $str318$_A_is_not_a__A, tv_var, $sym319$SBHL_TRUE_TV_P );
                              }
                            }
                            final SubLObject _prev_bind_0_$50 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                            final SubLObject _prev_bind_1_$50 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                            final SubLObject _prev_bind_2_$56 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                            final SubLObject _prev_bind_3_$57 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                            final SubLObject _prev_bind_4_$58 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                            try
                            {
                              sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const165$isa ) ), thread );
                              sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                                  $const165$isa ) ) ), thread );
                              sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars
                                  .get_sbhl_module( $const165$isa ) ) ), thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                              sbhl_module_vars.$sbhl_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const165$isa ) ), thread );
                              if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( node_var, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                              {
                                final SubLObject _prev_bind_0_$51 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                                final SubLObject _prev_bind_1_$51 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                                final SubLObject _prev_bind_2_$57 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                                try
                                {
                                  sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                                  sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities
                                      .get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const165$isa ) ) ), thread );
                                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_var_$50, UNPROVIDED );
                                  while ( NIL != node_var_$50)
                                  {
                                    final SubLObject tt_node_var = node_var_$50;
                                    SubLObject cdolist_list_var;
                                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const165$isa ) );
                                    SubLObject module_var = NIL;
                                    module_var = cdolist_list_var.first();
                                    while ( NIL != cdolist_list_var)
                                    {
                                      final SubLObject _prev_bind_0_$52 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                                      final SubLObject _prev_bind_1_$52 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean(
                                            NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                                        final SubLObject node = function_terms.naut_to_nart( tt_node_var );
                                        if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                                        {
                                          final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                          if( NIL != d_link )
                                          {
                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const165$isa ) ),
                                                sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                            if( NIL != mt_links )
                                            {
                                              SubLObject iteration_state;
                                              for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents
                                                  .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                              {
                                                thread.resetMultipleValues();
                                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                                {
                                                  final SubLObject _prev_bind_0_$53 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                                  try
                                                  {
                                                    sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                                    SubLObject iteration_state_$65;
                                                    for( iteration_state_$65 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents
                                                        .do_dictionary_contents_doneP( iteration_state_$65 ); iteration_state_$65 = dictionary_contents.do_dictionary_contents_next( iteration_state_$65 ) )
                                                    {
                                                      thread.resetMultipleValues();
                                                      final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$65 );
                                                      final SubLObject link_nodes = thread.secondMultipleValue();
                                                      thread.resetMultipleValues();
                                                      if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                                      {
                                                        final SubLObject _prev_bind_0_$54 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                                        try
                                                        {
                                                          sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                                          final SubLObject sol = link_nodes;
                                                          if( NIL != set.set_p( sol ) )
                                                          {
                                                            final SubLObject set_contents_var = set.do_set_internal( sol );
                                                            SubLObject basis_object;
                                                            SubLObject state;
                                                            SubLObject instance;
                                                            for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state(
                                                                basis_object, set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state(
                                                                    state ) )
                                                            {
                                                              instance = set_contents.do_set_contents_next( basis_object, state );
                                                              if( NIL != set_contents.do_set_contents_element_validP( state, instance ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( instance,
                                                                  sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                              {
                                                                sbhl_marking_utilities.sbhl_mark_node_marked( instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                                cyc_kernel.cyc_kill( instance );
                                                              }
                                                            }
                                                          }
                                                          else if( sol.isList() )
                                                          {
                                                            SubLObject csome_list_var_$67 = sol;
                                                            SubLObject instance2 = NIL;
                                                            instance2 = csome_list_var_$67.first();
                                                            while ( NIL != csome_list_var_$67)
                                                            {
                                                              if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                              {
                                                                sbhl_marking_utilities.sbhl_mark_node_marked( instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                                cyc_kernel.cyc_kill( instance2 );
                                                              }
                                                              csome_list_var_$67 = csome_list_var_$67.rest();
                                                              instance2 = csome_list_var_$67.first();
                                                            }
                                                          }
                                                          else
                                                          {
                                                            Errors.error( $str324$_A_is_neither_SET_P_nor_LISTP_, sol );
                                                          }
                                                        }
                                                        finally
                                                        {
                                                          sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$54, thread );
                                                        }
                                                      }
                                                    }
                                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state_$65 );
                                                  }
                                                  finally
                                                  {
                                                    sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$53, thread );
                                                  }
                                                }
                                              }
                                              dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                            }
                                          }
                                          else
                                          {
                                            sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str325$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                          }
                                          if( NIL != sbhl_macros.do_sbhl_non_fort_linksP( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                          {
                                            SubLObject csome_list_var_$68 = sbhl_link_methods.non_fort_instance_table_lookup( node );
                                            SubLObject instance_tuple = NIL;
                                            instance_tuple = csome_list_var_$68.first();
                                            while ( NIL != csome_list_var_$68)
                                            {
                                              SubLObject current;
                                              final SubLObject datum = current = instance_tuple;
                                              SubLObject link_node = NIL;
                                              SubLObject mt2 = NIL;
                                              SubLObject tv2 = NIL;
                                              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list326 );
                                              link_node = current.first();
                                              current = current.rest();
                                              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list326 );
                                              mt2 = current.first();
                                              current = current.rest();
                                              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list326 );
                                              tv2 = current.first();
                                              current = current.rest();
                                              if( NIL == current )
                                              {
                                                if( NIL != mt_relevance_macros.relevant_mtP( mt2 ) )
                                                {
                                                  final SubLObject _prev_bind_0_$55 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                                  try
                                                  {
                                                    sbhl_link_vars.$sbhl_link_mt$.bind( mt2, thread );
                                                    if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                                    {
                                                      final SubLObject _prev_bind_0_$56 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                                      try
                                                      {
                                                        sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                                        final SubLObject sol;
                                                        final SubLObject link_nodes2 = sol = ConsesLow.list( link_node );
                                                        if( NIL != set.set_p( sol ) )
                                                        {
                                                          final SubLObject set_contents_var = set.do_set_internal( sol );
                                                          SubLObject basis_object;
                                                          SubLObject state;
                                                          SubLObject instance;
                                                          for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                              set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                          {
                                                            instance = set_contents.do_set_contents_next( basis_object, state );
                                                            if( NIL != set_contents.do_set_contents_element_validP( state, instance ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( instance,
                                                                sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                            {
                                                              sbhl_marking_utilities.sbhl_mark_node_marked( instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                              cyc_kernel.cyc_kill( instance );
                                                            }
                                                          }
                                                        }
                                                        else if( sol.isList() )
                                                        {
                                                          SubLObject csome_list_var_$69 = sol;
                                                          SubLObject instance2 = NIL;
                                                          instance2 = csome_list_var_$69.first();
                                                          while ( NIL != csome_list_var_$69)
                                                          {
                                                            if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                            {
                                                              sbhl_marking_utilities.sbhl_mark_node_marked( instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                              cyc_kernel.cyc_kill( instance2 );
                                                            }
                                                            csome_list_var_$69 = csome_list_var_$69.rest();
                                                            instance2 = csome_list_var_$69.first();
                                                          }
                                                        }
                                                        else
                                                        {
                                                          Errors.error( $str324$_A_is_neither_SET_P_nor_LISTP_, sol );
                                                        }
                                                      }
                                                      finally
                                                      {
                                                        sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$56, thread );
                                                      }
                                                    }
                                                  }
                                                  finally
                                                  {
                                                    sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$55, thread );
                                                  }
                                                }
                                              }
                                              else
                                              {
                                                cdestructuring_bind.cdestructuring_bind_error( datum, $list326 );
                                              }
                                              csome_list_var_$68 = csome_list_var_$68.rest();
                                              instance_tuple = csome_list_var_$68.first();
                                            }
                                          }
                                        }
                                        else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                                        {
                                          SubLObject cdolist_list_var_$72;
                                          final SubLObject new_list = cdolist_list_var_$72 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                              .get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const165$isa ) ),
                                                  sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                              : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module(
                                                  $const165$isa ) ), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                                          SubLObject generating_fn = NIL;
                                          generating_fn = cdolist_list_var_$72.first();
                                          while ( NIL != cdolist_list_var_$72)
                                          {
                                            final SubLObject _prev_bind_0_$57 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                              final SubLObject sol2;
                                              final SubLObject link_nodes3 = sol2 = Functions.funcall( generating_fn, node );
                                              if( NIL != set.set_p( sol2 ) )
                                              {
                                                final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                                SubLObject basis_object2;
                                                SubLObject state2;
                                                SubLObject instance3;
                                                for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                                    set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                                {
                                                  instance3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state2, instance3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( instance3,
                                                      sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( instance3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                    cyc_kernel.cyc_kill( instance3 );
                                                  }
                                                }
                                              }
                                              else if( sol2.isList() )
                                              {
                                                SubLObject csome_list_var_$70 = sol2;
                                                SubLObject instance4 = NIL;
                                                instance4 = csome_list_var_$70.first();
                                                while ( NIL != csome_list_var_$70)
                                                {
                                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( instance4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( instance4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                    cyc_kernel.cyc_kill( instance4 );
                                                  }
                                                  csome_list_var_$70 = csome_list_var_$70.rest();
                                                  instance4 = csome_list_var_$70.first();
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str324$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$57, thread );
                                            }
                                            cdolist_list_var_$72 = cdolist_list_var_$72.rest();
                                            generating_fn = cdolist_list_var_$72.first();
                                          }
                                        }
                                      }
                                      finally
                                      {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$52, thread );
                                        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$52, thread );
                                      }
                                      cdolist_list_var = cdolist_list_var.rest();
                                      module_var = cdolist_list_var.first();
                                    }
                                    SubLObject cdolist_list_var2;
                                    final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars
                                        .get_sbhl_module( $const165$isa ) ) );
                                    SubLObject module_var2 = NIL;
                                    module_var2 = cdolist_list_var2.first();
                                    while ( NIL != cdolist_list_var2)
                                    {
                                      final SubLObject _prev_bind_0_$58 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                                      final SubLObject _prev_bind_1_$53 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_module_vars.$sbhl_module$.bind( module_var2, thread );
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean(
                                            NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                                        final SubLObject node2 = function_terms.naut_to_nart( node_var_$50 );
                                        if( NIL != sbhl_link_vars.sbhl_node_object_p( node2 ) )
                                        {
                                          final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link( node2, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                          if( NIL != d_link2 )
                                          {
                                            final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links( d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                            if( NIL != mt_links2 )
                                            {
                                              SubLObject iteration_state2;
                                              for( iteration_state2 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links2 ) ); NIL == dictionary_contents
                                                  .do_dictionary_contents_doneP( iteration_state2 ); iteration_state2 = dictionary_contents.do_dictionary_contents_next( iteration_state2 ) )
                                              {
                                                thread.resetMultipleValues();
                                                final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value( iteration_state2 );
                                                final SubLObject tv_links2 = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                if( NIL != mt_relevance_macros.relevant_mtP( mt3 ) )
                                                {
                                                  final SubLObject _prev_bind_0_$59 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                                  try
                                                  {
                                                    sbhl_link_vars.$sbhl_link_mt$.bind( mt3, thread );
                                                    SubLObject iteration_state_$66;
                                                    for( iteration_state_$66 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links2 ) ); NIL == dictionary_contents
                                                        .do_dictionary_contents_doneP( iteration_state_$66 ); iteration_state_$66 = dictionary_contents.do_dictionary_contents_next( iteration_state_$66 ) )
                                                    {
                                                      thread.resetMultipleValues();
                                                      final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$66 );
                                                      final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                      thread.resetMultipleValues();
                                                      if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                                      {
                                                        final SubLObject _prev_bind_0_$60 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                                        try
                                                        {
                                                          sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                                          final SubLObject sol3 = link_nodes4;
                                                          if( NIL != set.set_p( sol3 ) )
                                                          {
                                                            final SubLObject set_contents_var3 = set.do_set_internal( sol3 );
                                                            SubLObject basis_object3;
                                                            SubLObject state3;
                                                            SubLObject node_vars_link_node;
                                                            for( basis_object3 = set_contents.do_set_contents_basis_object( set_contents_var3 ), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(
                                                                basis_object3, set_contents_var3 ); NIL == set_contents.do_set_contents_doneP( basis_object3, state3 ); state3 = set_contents.do_set_contents_update_state(
                                                                    state3 ) )
                                                            {
                                                              node_vars_link_node = set_contents.do_set_contents_next( basis_object3, state3 );
                                                              if( NIL != set_contents.do_set_contents_element_validP( state3, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                                  node_vars_link_node, UNPROVIDED ) )
                                                              {
                                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                                deck.deck_push( node_vars_link_node, recur_deck );
                                                              }
                                                            }
                                                          }
                                                          else if( sol3.isList() )
                                                          {
                                                            SubLObject csome_list_var_$71 = sol3;
                                                            SubLObject node_vars_link_node2 = NIL;
                                                            node_vars_link_node2 = csome_list_var_$71.first();
                                                            while ( NIL != csome_list_var_$71)
                                                            {
                                                              if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                              {
                                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                                deck.deck_push( node_vars_link_node2, recur_deck );
                                                              }
                                                              csome_list_var_$71 = csome_list_var_$71.rest();
                                                              node_vars_link_node2 = csome_list_var_$71.first();
                                                            }
                                                          }
                                                          else
                                                          {
                                                            Errors.error( $str324$_A_is_neither_SET_P_nor_LISTP_, sol3 );
                                                          }
                                                        }
                                                        finally
                                                        {
                                                          sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$60, thread );
                                                        }
                                                      }
                                                    }
                                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state_$66 );
                                                  }
                                                  finally
                                                  {
                                                    sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$59, thread );
                                                  }
                                                }
                                              }
                                              dictionary_contents.do_dictionary_contents_finalize( iteration_state2 );
                                            }
                                          }
                                          else
                                          {
                                            sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str325$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                          }
                                        }
                                        else if( NIL != obsolete.cnat_p( node2, UNPROVIDED ) )
                                        {
                                          SubLObject cdolist_list_var_$73;
                                          final SubLObject new_list2 = cdolist_list_var_$73 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                              .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                                  .get_sbhl_module( UNPROVIDED ) ) )
                                              : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ),
                                                  sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                                          SubLObject generating_fn2 = NIL;
                                          generating_fn2 = cdolist_list_var_$73.first();
                                          while ( NIL != cdolist_list_var_$73)
                                          {
                                            final SubLObject _prev_bind_0_$61 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn2, thread );
                                              final SubLObject sol4;
                                              final SubLObject link_nodes5 = sol4 = Functions.funcall( generating_fn2, node2 );
                                              if( NIL != set.set_p( sol4 ) )
                                              {
                                                final SubLObject set_contents_var4 = set.do_set_internal( sol4 );
                                                SubLObject basis_object4;
                                                SubLObject state4;
                                                SubLObject node_vars_link_node3;
                                                for( basis_object4 = set_contents.do_set_contents_basis_object( set_contents_var4 ), state4 = NIL, state4 = set_contents.do_set_contents_initial_state( basis_object4,
                                                    set_contents_var4 ); NIL == set_contents.do_set_contents_doneP( basis_object4, state4 ); state4 = set_contents.do_set_contents_update_state( state4 ) )
                                                {
                                                  node_vars_link_node3 = set_contents.do_set_contents_next( basis_object4, state4 );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state4, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                      node_vars_link_node3, UNPROVIDED ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                                    deck.deck_push( node_vars_link_node3, recur_deck );
                                                  }
                                                }
                                              }
                                              else if( sol4.isList() )
                                              {
                                                SubLObject csome_list_var_$72 = sol4;
                                                SubLObject node_vars_link_node4 = NIL;
                                                node_vars_link_node4 = csome_list_var_$72.first();
                                                while ( NIL != csome_list_var_$72)
                                                {
                                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                                    deck.deck_push( node_vars_link_node4, recur_deck );
                                                  }
                                                  csome_list_var_$72 = csome_list_var_$72.rest();
                                                  node_vars_link_node4 = csome_list_var_$72.first();
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str324$_A_is_neither_SET_P_nor_LISTP_, sol4 );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$61, thread );
                                            }
                                            cdolist_list_var_$73 = cdolist_list_var_$73.rest();
                                            generating_fn2 = cdolist_list_var_$73.first();
                                          }
                                        }
                                      }
                                      finally
                                      {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$53, thread );
                                        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$58, thread );
                                      }
                                      cdolist_list_var2 = cdolist_list_var2.rest();
                                      module_var2 = cdolist_list_var2.first();
                                    }
                                    node_var_$50 = deck.deck_pop( recur_deck );
                                  }
                                }
                                finally
                                {
                                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$57, thread );
                                  sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$51, thread );
                                  sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$51, thread );
                                }
                              }
                              else
                              {
                                sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str327$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ),
                                    UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                            }
                            finally
                            {
                              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_4_$58, thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_3_$57, thread );
                              sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$56, thread );
                              sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$50, thread );
                              sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$50, thread );
                            }
                          }
                          finally
                          {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$49, thread );
                            sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$49, thread );
                          }
                        }
                        finally
                        {
                          final SubLObject _prev_bind_0_$62 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                          try
                          {
                            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                            final SubLObject _values = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                            Values.restoreValuesFromVector( _values );
                          }
                          finally
                          {
                            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$62, thread );
                          }
                        }
                      }
                      finally
                      {
                        sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$48, thread );
                      }
                    }
                    finally
                    {
                      final SubLObject _prev_bind_0_$63 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                      try
                      {
                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                        final SubLObject _values2 = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                        Values.restoreValuesFromVector( _values2 );
                      }
                      finally
                      {
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$63, thread );
                      }
                    }
                  }
                  finally
                  {
                    sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_1_$48, thread );
                    sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$47, thread );
                  }
                }
                finally
                {
                  mt_relevance_macros.$mt$.rebind( _prev_bind_1_$47, thread );
                  mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$46, thread );
                }
                cyc_kernel.cyc_kill( permitted_collection );
              }
              catch( final Throwable catch_var )
              {
                Errors.handleThrowable( catch_var, NIL );
              }
            }
            finally
            {
              Errors.$error_handler$.rebind( _prev_bind_0_$45, thread );
            }
          }
          catch( final Throwable ccatch_env_var )
          {
            ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw38$IGNORE_ERRORS_TARGET );
          }
          finally
          {
            thread.throwStack.pop();
          }
          if( NIL != logP )
          {
            format_nil.force_format( T, $str328$_done___, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          if( forts.fort_count().numLE( count_at_end ) )
          {
            return Values.values( forts.fort_count(), $kw311$PERCENTAGE );
          }
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var = csome_list_var.rest();
          permitted_collection = csome_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$64 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values3 = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values3 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$64, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    return Values.values( forts.fort_count(), $kw330$EXHAUSTED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 97070L)
  public static SubLObject clip_kb_given_tabu_term_list(final SubLObject tabu_term_list)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject tabu_collections = NIL;
    SubLObject clippable_collections = NIL;
    format_nil.force_format( T, $str331$___A__Current_FORT_Count____A__, numeric_date_utilities.timestring( UNPROVIDED ), forts.fort_count(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    format_nil.force_format( T, $str332$___A__Gathering_tabu_collections_, numeric_date_utilities.timestring( UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    tabu_collections = gather_tabu_collections_for_clipping( tabu_term_list, UNPROVIDED, UNPROVIDED );
    format_nil.force_format( T, $str333$___A__Selecting_clippable_collect, numeric_date_utilities.timestring( UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    clippable_collections = select_clippable_collections( tabu_collections, UNPROVIDED );
    format_nil.force_format( T, $str334$___A__Clipping_collections_______, numeric_date_utilities.timestring( UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    thread.resetMultipleValues();
    final SubLObject final_count = clip_kb_percentage( clippable_collections, $float335$0_1, $kw336$LOG );
    final SubLObject reason = thread.secondMultipleValue();
    thread.resetMultipleValues();
    format_nil.force_format( T, $str337$___A__Clipping_stopped_at__A_FORT, numeric_date_utilities.timestring( UNPROVIDED ), final_count, reason, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return Values.values( final_count, reason );
  }

  @SubLTranslatedFile.SubL(source = "cycl/builder-utilities.lisp", position = 101271L)
  public static SubLObject generate_terms_transcript(final SubLObject term_guids, final SubLObject ts_file)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = el_partitions.$el_partition_creator_override$.currentBinding( thread );
    final SubLObject _prev_bind_2 = el_partitions.$el_partition_creation_purpose_override$.currentBinding( thread );
    try
    {
      el_partitions.$el_partition_creator_override$.bind( $const339$CycAdministrator, thread );
      el_partitions.$el_partition_creation_purpose_override$.bind( $int340$212, thread );
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0_$87 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( ts_file, $kw49$OUTPUT );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_$87, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str50$Unable_to_open__S, ts_file );
        }
        final SubLObject stream_$88 = stream;
        if( NIL == stream_$88 )
        {
          return NIL;
        }
        final SubLObject _prev_bind_0_$88 = $ts_comment_stream$.currentBinding( thread );
        try
        {
          $ts_comment_stream$.bind( stream_$88, thread );
          final SubLObject ts_writer = el_partitions.new_transcript_el_partition_data_sink( stream_$88 );
          SubLObject skipped = ZERO_INTEGER;
          final SubLObject _prev_bind_0_$89 = utilities_macros.$progress_note$.currentBinding( thread );
          final SubLObject _prev_bind_1_$91 = utilities_macros.$progress_start_time$.currentBinding( thread );
          final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
          final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
          final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
          final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
          final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
          final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
          try
          {
            utilities_macros.$progress_note$.bind( $str341$Finding_assertions_about_missing_, thread );
            utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
            utilities_macros.$progress_total$.bind( Sequences.length( term_guids ), thread );
            utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
            utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
            utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
            utilities_macros.$within_noting_percent_progress$.bind( T, thread );
            utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
            try
            {
              utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
              SubLObject csome_list_var = term_guids;
              SubLObject term_guid = NIL;
              term_guid = csome_list_var.first();
              while ( NIL != csome_list_var)
              {
                final SubLObject v_term = constants_high.find_constant_by_guid( term_guid );
                if( NIL != forts.fort_p( v_term ) )
                {
                  el_partitions.note_el_partition_tip_constant_create( ts_writer, v_term );
                  final SubLObject _prev_bind_0_$90 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$92 = mt_relevance_macros.$mt$.currentBinding( thread );
                  try
                  {
                    mt_relevance_macros.$relevant_mt_function$.bind( $sym300$RELEVANT_MT_IS_EVERYTHING, thread );
                    mt_relevance_macros.$mt$.bind( $const301$EverythingPSC, thread );
                    SubLObject cdolist_list_var = $list342;
                    SubLObject predicate = NIL;
                    predicate = cdolist_list_var.first();
                    while ( NIL != cdolist_list_var)
                    {
                      SubLObject cdolist_list_var_$94 = kb_mapping_utilities.pred_value_gafs( v_term, predicate, UNPROVIDED, UNPROVIDED );
                      SubLObject assertion = NIL;
                      assertion = cdolist_list_var_$94.first();
                      while ( NIL != cdolist_list_var_$94)
                      {
                        if( NIL != assertions_high.asserted_assertionP( assertion ) )
                        {
                          el_partitions.note_el_partition_tip_assertion_create( ts_writer, assertion );
                        }
                        cdolist_list_var_$94 = cdolist_list_var_$94.rest();
                        assertion = cdolist_list_var_$94.first();
                      }
                      cdolist_list_var = cdolist_list_var.rest();
                      predicate = cdolist_list_var.first();
                    }
                    SubLObject assertions = kb_mapping.gather_term_assertions( v_term, UNPROVIDED );
                    SubLObject cdolist_list_var2;
                    assertions = ( cdolist_list_var2 = assertion_utilities.sort_assertions( assertions ) );
                    SubLObject assertion2 = NIL;
                    assertion2 = cdolist_list_var2.first();
                    while ( NIL != cdolist_list_var2)
                    {
                      if( NIL != assertions_high.asserted_assertionP( assertion2 ) && NIL == assertion_utilities.gaf_assertion_has_pred_p( assertion2, $const165$isa ) && NIL == assertion_utilities
                          .gaf_assertion_has_pred_p( assertion2, $const174$genls ) )
                      {
                        el_partitions.note_el_partition_tip_assertion_create( ts_writer, assertion2 );
                      }
                      cdolist_list_var2 = cdolist_list_var2.rest();
                      assertion2 = cdolist_list_var2.first();
                    }
                  }
                  finally
                  {
                    mt_relevance_macros.$mt$.rebind( _prev_bind_1_$92, thread );
                    mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$90, thread );
                  }
                }
                else
                {
                  skipped = Numbers.add( skipped, ONE_INTEGER );
                  Errors.warn( $str343$Could_not_find_constant_for__S___, term_guid );
                }
                utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
                utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
                csome_list_var = csome_list_var.rest();
                term_guid = csome_list_var.first();
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$91 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                utilities_macros.noting_percent_progress_postamble();
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$91, thread );
              }
            }
          }
          finally
          {
            utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
            utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
            utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
            utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
            utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
            utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
            utilities_macros.$progress_start_time$.rebind( _prev_bind_1_$91, thread );
            utilities_macros.$progress_note$.rebind( _prev_bind_0_$89, thread );
          }
          if( skipped.isPositive() )
          {
            Errors.warn( $str344$_A_constants_were_skipped___, skipped );
          }
        }
        finally
        {
          $ts_comment_stream$.rebind( _prev_bind_0_$88, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$92 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$92, thread );
        }
      }
    }
    finally
    {
      el_partitions.$el_partition_creation_purpose_override$.rebind( _prev_bind_2, thread );
      el_partitions.$el_partition_creator_override$.rebind( _prev_bind_0, thread );
    }
    return ts_file;
  }

  public static SubLObject declare_builder_utilities_file()
  {
    SubLFiles.declareFunction( me, "close_old_areas", "CLOSE-OLD-AREAS", 0, 0, false );
    SubLFiles.declareFunction( me, "verify_cyc_build", "VERIFY-CYC-BUILD", 0, 0, false );
    SubLFiles.declareFunction( me, "cyc_build_world", "CYC-BUILD-WORLD", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_build_world_verify", "CYC-BUILD-WORLD-VERIFY", 2, 0, false );
    SubLFiles.declareFunction( me, "build_write_image", "BUILD-WRITE-IMAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_install_directory_name", "CYC-INSTALL-DIRECTORY-NAME", 1, 1, false );
    SubLFiles.declareFunction( me, "cyc_install_directory", "CYC-INSTALL-DIRECTORY", 3, 1, false );
    SubLFiles.declareFunction( me, "cyc_versioned_world_name", "CYC-VERSIONED-WORLD-NAME", 0, 0, false );
    SubLFiles.declareFunction( me, "build_write_image_versioned", "BUILD-WRITE-IMAGE-VERSIONED", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_load_kb", "CYC-LOAD-KB", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_load_incremental_kb", "CYC-LOAD-INCREMENTAL-KB", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_dump_standard_kb", "CYC-DUMP-STANDARD-KB", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_snapshot_kb", "CYC-SNAPSHOT-KB", 1, 1, false );
    SubLFiles.declareFunction( me, "cyc_dump_snapshot_kb", "CYC-DUMP-SNAPSHOT-KB", 1, 1, false );
    SubLFiles.declareFunction( me, "suggest_kb_snapshot_directory", "SUGGEST-KB-SNAPSHOT-DIRECTORY", 1, 0, false );
    SubLFiles.declareFunction( me, "builder_catchup_and_dump_pipeline", "BUILDER-CATCHUP-AND-DUMP-PIPELINE", 3, 3, false );
    SubLFiles.declareFunction( me, "builder_log_directory", "BUILDER-LOG-DIRECTORY", 0, 0, false );
    SubLFiles.declareFunction( me, "builder_forward_inference_metrics_log", "BUILDER-FORWARD-INFERENCE-METRICS-LOG", 0, 0, false );
    SubLFiles.declareFunction( me, "catchup_to_rollover_and_write_image", "CATCHUP-TO-ROLLOVER-AND-WRITE-IMAGE", 1, 2, false );
    SubLFiles.declareFunction( me, "catchup_to_rollover", "CATCHUP-TO-ROLLOVER", 0, 0, false );
    SubLFiles.declareFunction( me, "catchup_to_rollover_setup", "CATCHUP-TO-ROLLOVER-SETUP", 0, 0, false );
    SubLFiles.declareFunction( me, "load_submitted_transcripts_and_write_image", "LOAD-SUBMITTED-TRANSCRIPTS-AND-WRITE-IMAGE", 2, 0, false );
    SubLFiles.declareFunction( me, "catchup_to_current_and_write_image_versioned", "CATCHUP-TO-CURRENT-AND-WRITE-IMAGE-VERSIONED", 1, 0, false );
    SubLFiles.declareFunction( me, "catchup_to_current_and_write_image", "CATCHUP-TO-CURRENT-AND-WRITE-IMAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "catchup_to_current_kb", "CATCHUP-TO-CURRENT-KB", 0, 0, false );
    SubLFiles.declareFunction( me, "caught_up_on_operationsP", "CAUGHT-UP-ON-OPERATIONS?", 0, 1, false );
    SubLFiles.declareFunction( me, "catch_up_on_operations_verbose", "CATCH-UP-ON-OPERATIONS-VERBOSE", 0, 3, false );
    SubLFiles.declareFunction( me, "catch_up_on_operations_very_verbosely", "CATCH-UP-ON-OPERATIONS-VERY-VERBOSELY", 0, 3, false );
    SubLFiles.declareFunction( me, "run_baseline_tests", "RUN-BASELINE-TESTS", 0, 0, false );
    SubLFiles.declareFunction( me, "baseline_results_to_map", "BASELINE-RESULTS-TO-MAP", 1, 0, false );
    SubLFiles.declareFunction( me, "compute_baseline_regressions", "COMPUTE-BASELINE-REGRESSIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "show_baseline_regression_info", "SHOW-BASELINE-REGRESSION-INFO", 1, 1, false );
    SubLFiles.declareFunction( me, "show_baseline_regression_details", "SHOW-BASELINE-REGRESSION-DETAILS", 1, 2, false );
    SubLFiles.declareFunction( me, "declare_cyc_product", "DECLARE-CYC-PRODUCT", 4, 0, false );
    SubLFiles.declareFunction( me, "cyc_product_definition_presentP", "CYC-PRODUCT-DEFINITION-PRESENT?", 4, 0, false );
    SubLFiles.declareFunction( me, "find_cyc_product", "FIND-CYC-PRODUCT", 3, 0, false );
    SubLFiles.declareFunction( me, "cyc_product", "CYC-PRODUCT", 0, 0, false );
    SubLFiles.declareFunction( me, "code_product", "CODE-PRODUCT", 0, 0, false );
    SubLFiles.declareFunction( me, "kb_product", "KB-PRODUCT", 0, 0, false );
    SubLFiles.declareFunction( me, "branch_tag", "BRANCH-TAG", 0, 0, false );
    SubLFiles.declareFunction( me, "set_cyc_product", "SET-CYC-PRODUCT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_kb_product", "SET-KB-PRODUCT", 1, 0, false );
    SubLFiles.declareFunction( me, "initialize_cyc_product", "INITIALIZE-CYC-PRODUCT", 0, 0, false );
    SubLFiles.declareFunction( me, "detect_cyc_product", "DETECT-CYC-PRODUCT", 0, 0, false );
    SubLFiles.declareFunction( me, "load_file_dependency_information", "LOAD-FILE-DEPENDENCY-INFORMATION", 1, 1, false );
    SubLFiles.declareFunction( me, "augment_file_set", "AUGMENT-FILE-SET", 2, 0, false );
    SubLFiles.declareFunction( me, "completely_augment_file_set", "COMPLETELY-AUGMENT-FILE-SET", 2, 0, false );
    SubLFiles.declareFunction( me, "write_ant_fileset_declaration", "WRITE-ANT-FILESET-DECLARATION", 3, 1, false );
    SubLFiles.declareFunction( me, "construct_rooted_file_set_from_list", "CONSTRUCT-ROOTED-FILE-SET-FROM-LIST", 1, 2, false );
    SubLFiles.declareFunction( me, "root_file_set", "ROOT-FILE-SET", 1, 2, false );
    SubLFiles.declareFunction( me, "unroot_file_set", "UNROOT-FILE-SET", 1, 2, false );
    SubLFiles.declareFunction( me, "reroot_file_set", "REROOT-FILE-SET", 3, 1, false );
    SubLFiles.declareFunction( me, "test_reroot_file_set", "TEST-REROOT-FILE-SET", 3, 1, false );
    SubLFiles.declareFunction( me, "serialize_kb_store_lru_information", "SERIALIZE-KB-STORE-LRU-INFORMATION", 1, 0, false );
    SubLFiles.declareFunction( me, "precache_kb_store_by_lru_information", "PRECACHE-KB-STORE-BY-LRU-INFORMATION", 1, 0, false );
    SubLFiles.declareFunction( me, "set_kb_store_lru_settings", "SET-KB-STORE-LRU-SETTINGS", 0, 2, false );
    SubLFiles.declareFunction( me, "set_kb_store_lru_swap_level", "SET-KB-STORE-LRU-SWAP-LEVEL", 0, 1, false );
    SubLFiles.declareFunction( me, "enumerate_fact_sheets_for_kb_to_file", "ENUMERATE-FACT-SHEETS-FOR-KB-TO-FILE", 1, 0, false );
    SubLFiles.declareFunction( me, "enumerate_fact_sheets_for_kb", "ENUMERATE-FACT-SHEETS-FOR-KB", 0, 1, false );
    SubLFiles.declareFunction( me, "fact_sheet_path_for_term_filter_and_transform", "FACT-SHEET-PATH-FOR-TERM-FILTER-AND-TRANSFORM", 1, 0, false );
    SubLFiles.declareFunction( me, "specify_sbhl_caching_policy_template", "SPECIFY-SBHL-CACHING-POLICY-TEMPLATE", 3, 2, false );
    SubLFiles.declareFunction( me, "generate_kb_sbhl_caching_policies", "GENERATE-KB-SBHL-CACHING-POLICIES", 2, 1, false );
    SubLFiles.declareFunction( me, "generate_legacy_kb_sbhl_caching_policies", "GENERATE-LEGACY-KB-SBHL-CACHING-POLICIES", 1, 1, false );
    SubLFiles.declareFunction( me, "generate_completely_cached_kb_sbhl_caching_policies", "GENERATE-COMPLETELY-CACHED-KB-SBHL-CACHING-POLICIES", 1, 1, false );
    SubLFiles.declareFunction( me, "propose_kb_sbhl_caching_policies_from_tuning_data", "PROPOSE-KB-SBHL-CACHING-POLICIES-FROM-TUNING-DATA", 1, 1, false );
    SubLFiles.declareFunction( me, "propose_completely_cached_kb_sbhl_caching_policies", "PROPOSE-COMPLETELY-CACHED-KB-SBHL-CACHING-POLICIES", 0, 1, false );
    SubLFiles.declareFunction( me, "propose_legacy_kb_sbhl_caching_policies", "PROPOSE-LEGACY-KB-SBHL-CACHING-POLICIES", 0, 1, false );
    SubLFiles.declareFunction( me, "get_all_sbhl_module_link_predicates", "GET-ALL-SBHL-MODULE-LINK-PREDICATES", 0, 0, false );
    SubLFiles.declareFunction( me, "propose_all_sticky_kb_sbhl_caching_policies", "PROPOSE-ALL-STICKY-KB-SBHL-CACHING-POLICIES", 2, 0, false );
    SubLFiles.declareFunction( me, "start_recording_sbhl_cache_tuning_data", "START-RECORDING-SBHL-CACHE-TUNING-DATA", 0, 0, false );
    SubLFiles.declareFunction( me, "stop_recording_sbhl_cache_tuning_data", "STOP-RECORDING-SBHL-CACHE-TUNING-DATA", 1, 0, false );
    SubLFiles.declareFunction( me, "gather_data_for_sbhl_cache_tuning", "GATHER-DATA-FOR-SBHL-CACHE-TUNING", 1, 0, false );
    SubLFiles.declareFunction( me, "run_sbhl_cache_tuning_data_gathering", "RUN-SBHL-CACHE-TUNING-DATA-GATHERING", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_cache_tuning_data_gathering_prologue", "SBHL-CACHE-TUNING-DATA-GATHERING-PROLOGUE", 0, 0, false );
    SubLFiles.declareFunction( me, "sbhl_cache_tuning_experiment_prologue", "SBHL-CACHE-TUNING-EXPERIMENT-PROLOGUE", 0, 0, false );
    SubLFiles.declareFunction( me, "sbhl_cache_tuning_experiment_epilogue", "SBHL-CACHE-TUNING-EXPERIMENT-EPILOGUE", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_cache_tuning_data_gathering_generate_report", "SBHL-CACHE-TUNING-DATA-GATHERING-GENERATE-REPORT", 2, 0, false );
    SubLFiles.declareFunction( me, "sbhl_cache_tuning_data_gathering_epilogue", "SBHL-CACHE-TUNING-DATA-GATHERING-EPILOGUE", 0, 0, false );
    SubLFiles.declareFunction( me, "compile_kb_snapshot_statistics", "COMPILE-KB-SNAPSHOT-STATISTICS", 0, 1, false );
    SubLFiles.declareFunction( me, "gather_kb_snapshot_statistics", "GATHER-KB-SNAPSHOT-STATISTICS", 1, 1, false );
    SubLFiles.declareFunction( me, "gather_one_kb_snapshot_statistic", "GATHER-ONE-KB-SNAPSHOT-STATISTIC", 4, 0, false );
    SubLFiles.declareFunction( me, "track_kb_snapshot_statistics", "TRACK-KB-SNAPSHOT-STATISTICS", 1, 1, false );
    SubLFiles.declareFunction( me, "get_kb_mini_dump_timestamp", "GET-KB-MINI-DUMP-TIMESTAMP", 0, 0, false );
    SubLFiles.declareFunction( me, "prepare_kb_mini_dump", "PREPARE-KB-MINI-DUMP", 0, 0, false );
    SubLFiles.declareFunction( me, "perform_kb_mini_dump", "PERFORM-KB-MINI-DUMP", 1, 0, false );
    SubLFiles.declareFunction( me, "launch_asynchronous_kb_mini_dump", "LAUNCH-ASYNCHRONOUS-KB-MINI-DUMP", 1, 0, false );
    SubLFiles.declareFunction( me, "mark_kb_mini_dump_as_successful", "MARK-KB-MINI-DUMP-AS-SUCCESSFUL", 1, 0, false );
    SubLFiles.declareFunction( me, "build_process_worker_count", "BUILD-PROCESS-WORKER-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "set_build_process_worker_count", "SET-BUILD-PROCESS-WORKER-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "build_process_parallelism_permittedP", "BUILD-PROCESS-PARALLELISM-PERMITTED?", 0, 0, false );
    SubLFiles.declareMacro( me, "with_allowed_obfuscation_namespace_support", "WITH-ALLOWED-OBFUSCATION-NAMESPACE-SUPPORT" );
    SubLFiles.declareMacro( me, "with_allowed_obfuscation_namespace", "WITH-ALLOWED-OBFUSCATION-NAMESPACE" );
    SubLFiles.declareFunction( me, "allowed_obfuscation_namespace_constantP", "ALLOWED-OBFUSCATION-NAMESPACE-CONSTANT?", 1, 0, false );
    SubLFiles.declareFunction( me, "un_obfuscatable_constantP", "UN-OBFUSCATABLE-CONSTANT?", 1, 0, false );
    SubLFiles.declareMacro( me, "with_constant_obfuscation", "WITH-CONSTANT-OBFUSCATION" );
    SubLFiles.declareFunction( me, "obfuscate_constant_name_via_generator_fn", "OBFUSCATE-CONSTANT-NAME-VIA-GENERATOR-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "obfuscate_constant_name_via_generator_function", "OBFUSCATE-CONSTANT-NAME-VIA-GENERATOR-FUNCTION", 3, 0, false );
    SubLFiles.declareFunction( me, "new_constant_obfuscation_cache", "NEW-CONSTANT-OBFUSCATION-CACHE", 0, 0, false );
    SubLFiles.declareMacro( me, "with_cached_constant_obfuscation", "WITH-CACHED-CONSTANT-OBFUSCATION" );
    SubLFiles.declareFunction( me, "make_obfuscation_gensym_state", "MAKE-OBFUSCATION-GENSYM-STATE", 0, 2, false );
    SubLFiles.declareFunction( me, "obfuscate_constant_name_gensym", "OBFUSCATE-CONSTANT-NAME-GENSYM", 2, 0, false );
    SubLFiles.declareFunction( me, "obfuscate_and_dump_essential_kb", "OBFUSCATE-AND-DUMP-ESSENTIAL-KB", 4, 1, false );
    SubLFiles.declareFunction( me, "determine_obfuscation_candidates", "DETERMINE-OBFUSCATION-CANDIDATES", 0, 1, false );
    SubLFiles.declareFunction( me, "not_term_of_unit_assertionP", "NOT-TERM-OF-UNIT-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "determine_assertion_obfuscations", "DETERMINE-ASSERTION-OBFUSCATIONS", 2, 1, false );
    SubLFiles.declareFunction( me, "determine_nart_obfuscations", "DETERMINE-NART-OBFUSCATIONS", 2, 1, false );
    SubLFiles.declareFunction( me, "apply_assertion_obfuscations", "APPLY-ASSERTION-OBFUSCATIONS", 1, 1, false );
    SubLFiles.declareFunction( me, "weakly_scramble_string_in_assertions", "WEAKLY-SCRAMBLE-STRING-IN-ASSERTIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "weakly_scramble_string_in_nauts", "WEAKLY-SCRAMBLE-STRING-IN-NAUTS", 2, 0, false );
    SubLFiles.declareFunction( me, "mix_case_string", "MIX-CASE-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "select_clippable_collections", "SELECT-CLIPPABLE-COLLECTIONS", 0, 2, false );
    SubLFiles.declareFunction( me, "higher_order_collectionP", "HIGHER-ORDER-COLLECTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "gather_tabu_collections_for_clipping", "GATHER-TABU-COLLECTIONS-FOR-CLIPPING", 1, 2, false );
    SubLFiles.declareFunction( me, "clip_kb_percentage", "CLIP-KB-PERCENTAGE", 2, 1, false );
    SubLFiles.declareFunction( me, "clip_kb_given_tabu_term_list", "CLIP-KB-GIVEN-TABU-TERM-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_terms_transcript", "GENERATE-TERMS-TRANSCRIPT", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_builder_utilities_file()
  {
    $standard_regression_conditions$ = SubLFiles.deflexical( "*STANDARD-REGRESSION-CONDITIONS*", $list97 );
    $all_cyc_products$ = SubLFiles.defparameter( "*ALL-CYC-PRODUCTS*", NIL );
    $cyc_product_definitions$ = SubLFiles.defparameter( "*CYC-PRODUCT-DEFINITIONS*", NIL );
    $cyc_product$ = SubLFiles.deflexical( "*CYC-PRODUCT*", ( maybeDefault( $sym117$_CYC_PRODUCT_, $cyc_product$, NIL ) ) );
    $code_product$ = SubLFiles.defconstant( "*CODE-PRODUCT*", $kw110$STANDARD );
    $kb_product$ = SubLFiles.deflexical( "*KB-PRODUCT*", ( maybeDefault( $sym118$_KB_PRODUCT_, $kb_product$, NIL ) ) );
    $branch_tag$ = SubLFiles.defconstant( "*BRANCH-TAG*", $str112$head );
    $generic_sbhl_caching_policy_templates$ = SubLFiles.defparameter( "*GENERIC-SBHL-CACHING-POLICY-TEMPLATES*", ConsesLow.list( new SubLObject[] { specify_sbhl_caching_policy_template( $kw161$DEFAULT, $kw162$STICKY,
        $kw163$UNDEFINED, $kw84$ALL, UNPROVIDED ), specify_sbhl_caching_policy_template( $const164$genlMt, $kw162$STICKY, $kw163$UNDEFINED, $kw84$ALL, $kw84$ALL ), specify_sbhl_caching_policy_template( $const165$isa,
            $kw166$SWAPOUT, $int167$10000, $int168$8000, $int169$2000 ), specify_sbhl_caching_policy_template( $const170$quotedIsa, $kw166$SWAPOUT, $int171$5000, $int172$4000, $int173$1000 ),
      specify_sbhl_caching_policy_template( $const174$genls, $kw166$SWAPOUT, $int171$5000, $int171$5000, $int169$2000 ), specify_sbhl_caching_policy_template( $const175$disjointWith, $kw166$SWAPOUT, $int176$1500,
          $int176$1500, $int177$200 ), specify_sbhl_caching_policy_template( $const178$genlPreds, $kw166$SWAPOUT, $int176$1500, $int176$1500, $int177$200 ), specify_sbhl_caching_policy_template( $const179$genlInverse,
              $kw166$SWAPOUT, $int176$1500, $int176$1500, $int177$200 ), specify_sbhl_caching_policy_template( $const180$negationPreds, $kw166$SWAPOUT, $int176$1500, $int173$1000, ZERO_INTEGER ),
      specify_sbhl_caching_policy_template( $const181$negationInverse, $kw166$SWAPOUT, $int176$1500, $int173$1000, ZERO_INTEGER )
    } ) );
    $cyc_tests_to_use_for_sbhl_cache_tuning$ = SubLFiles.defparameter( "*CYC-TESTS-TO-USE-FOR-SBHL-CACHE-TUNING*", NIL );
    $kb_queries_to_use_for_sbhl_cache_tuning$ = SubLFiles.defparameter( "*KB-QUERIES-TO-USE-FOR-SBHL-CACHE-TUNING*", NIL );
    $run_cyclops_for_sbhl_cache_tuningP$ = SubLFiles.defparameter( "*RUN-CYCLOPS-FOR-SBHL-CACHE-TUNING?*", NIL );
    $build_process_worker_count$ = SubLFiles.deflexical( "*BUILD-PROCESS-WORKER-COUNT*", ONE_INTEGER );
    $allowed_obfuscation_name_spaces$ = SubLFiles.defparameter( "*ALLOWED-OBFUSCATION-NAME-SPACES*", NIL );
    $constant_obfuscation_name_generator_state$ = SubLFiles.defparameter( "*CONSTANT-OBFUSCATION-NAME-GENERATOR-STATE*", NIL );
    $constant_obfuscation_cache$ = SubLFiles.defparameter( "*CONSTANT-OBFUSCATION-CACHE*", NIL );
    $ts_comment_stream$ = SubLFiles.defparameter( "*TS-COMMENT-STREAM*", NIL );
    return NIL;
  }

  public static SubLObject setup_builder_utilities_file()
  {
    access_macros.register_external_symbol( $sym2$CYC_BUILD_WORLD_VERIFY );
    access_macros.register_external_symbol( $sym16$CYC_LOAD_KB );
    access_macros.register_external_symbol( $sym17$CYC_LOAD_INCREMENTAL_KB );
    access_macros.register_external_symbol( $sym18$CYC_DUMP_STANDARD_KB );
    access_macros.register_external_symbol( $sym20$CYC_SNAPSHOT_KB );
    access_macros.register_external_symbol( $sym22$CYC_DUMP_SNAPSHOT_KB );
    access_macros.register_external_symbol( $sym28$SUGGEST_KB_SNAPSHOT_DIRECTORY );
    access_macros.register_external_symbol( $sym81$RUN_BASELINE_TESTS );
    access_macros.register_external_symbol( $sym88$BASELINE_RESULTS_TO_MAP );
    access_macros.register_external_symbol( $sym91$COMPUTE_BASELINE_REGRESSIONS );
    access_macros.register_external_symbol( $sym94$SHOW_BASELINE_REGRESSION_INFO );
    access_macros.register_external_symbol( $sym98$SHOW_BASELINE_REGRESSION_DETAILS );
    declare_cyc_product( $kw109$HEAD, $kw110$STANDARD, $kw111$FULL, $str112$head );
    declare_cyc_product( $kw113$CAE_0_3, $kw114$TKB, $kw115$AKB, $str116$cake_release_0p3_20051215 );
    subl_macro_promotions.declare_defglobal( $sym117$_CYC_PRODUCT_ );
    subl_macro_promotions.declare_defglobal( $sym118$_KB_PRODUCT_ );
    access_macros.register_external_symbol( $sym120$LOAD_FILE_DEPENDENCY_INFORMATION );
    access_macros.register_external_symbol( $sym123$AUGMENT_FILE_SET );
    access_macros.register_external_symbol( $sym124$COMPLETELY_AUGMENT_FILE_SET );
    access_macros.register_external_symbol( $sym126$WRITE_ANT_FILESET_DECLARATION );
    access_macros.register_external_symbol( $sym135$CONSTRUCT_ROOTED_FILE_SET_FROM_LIST );
    access_macros.register_external_symbol( $sym137$ROOT_FILE_SET );
    access_macros.register_external_symbol( $sym138$UNROOT_FILE_SET );
    access_macros.register_external_symbol( $sym139$REROOT_FILE_SET );
    generic_testing.define_test_case_table_int( $sym140$TEST_REROOT_FILE_SET, ConsesLow.list( new SubLObject[] { $kw141$TEST, NIL, $kw142$OWNER, NIL, $kw143$CLASSES, NIL, $kw144$KB, $kw145$TINY, $kw146$WORKING_, T
    } ), $list147 );
    access_macros.register_external_symbol( $sym150$SERIALIZE_KB_STORE_LRU_INFORMATION );
    access_macros.register_external_symbol( $sym153$PRECACHE_KB_STORE_BY_LRU_INFORMATION );
    utilities_macros.note_funcall_helper_function( $sym160$FACT_SHEET_PATH_FOR_TERM_FILTER_AND_TRANSFORM );
    access_macros.register_external_symbol( $sym196$COMPILE_KB_SNAPSHOT_STATISTICS );
    access_macros.register_external_symbol( $sym207$GATHER_KB_SNAPSHOT_STATISTICS );
    access_macros.register_external_symbol( $sym220$TRACK_KB_SNAPSHOT_STATISTICS );
    access_macros.register_external_symbol( $sym227$GET_KB_MINI_DUMP_TIMESTAMP );
    access_macros.register_external_symbol( $sym228$PREPARE_KB_MINI_DUMP );
    access_macros.register_external_symbol( $sym230$PERFORM_KB_MINI_DUMP );
    access_macros.register_external_symbol( $sym233$LAUNCH_ASYNCHRONOUS_KB_MINI_DUMP );
    access_macros.register_external_symbol( $sym236$BUILD_PROCESS_WORKER_COUNT );
    access_macros.register_external_symbol( $sym237$SET_BUILD_PROCESS_WORKER_COUNT );
    access_macros.register_external_symbol( $sym238$BUILD_PROCESS_PARALLELISM_PERMITTED_ );
    access_macros.register_external_symbol( $sym239$WITH_ALLOWED_OBFUSCATION_NAMESPACE_SUPPORT );
    access_macros.register_external_symbol( $sym242$WITH_ALLOWED_OBFUSCATION_NAMESPACE );
    access_macros.register_external_symbol( $sym247$ALLOWED_OBFUSCATION_NAMESPACE_CONSTANT_ );
    access_macros.register_external_symbol( $sym249$UN_OBFUSCATABLE_CONSTANT_ );
    access_macros.register_external_symbol( $sym250$WITH_CONSTANT_OBFUSCATION );
    access_macros.register_external_symbol( $sym257$OBFUSCATE_CONSTANT_NAME_VIA_GENERATOR_FN );
    access_macros.register_macro_helper( $sym261$NEW_CONSTANT_OBFUSCATION_CACHE, $sym262$WITH_CACHED_CONSTANT_OBFUSCATION );
    access_macros.register_external_symbol( $sym262$WITH_CACHED_CONSTANT_OBFUSCATION );
    access_macros.register_external_symbol( $sym265$MAKE_OBFUSCATION_GENSYM_STATE );
    access_macros.register_external_symbol( $sym270$OBFUSCATE_CONSTANT_NAME_GENSYM );
    access_macros.register_external_symbol( $sym273$OBFUSCATE_AND_DUMP_ESSENTIAL_KB );
    access_macros.register_external_symbol( $sym277$DETERMINE_OBFUSCATION_CANDIDATES );
    access_macros.register_external_symbol( $sym283$DETERMINE_ASSERTION_OBFUSCATIONS );
    access_macros.register_external_symbol( $sym287$DETERMINE_NART_OBFUSCATIONS );
    access_macros.register_external_symbol( $sym290$APPLY_ASSERTION_OBFUSCATIONS );
    access_macros.register_external_symbol( $sym297$WEAKLY_SCRAMBLE_STRING_IN_ASSERTIONS );
    access_macros.register_external_symbol( $sym298$WEAKLY_SCRAMBLE_STRING_IN_NAUTS );
    access_macros.register_external_symbol( $sym299$MIX_CASE_STRING );
    access_macros.register_external_symbol( $sym338$GENERATE_TERMS_TRANSCRIPT );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_builder_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_builder_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_builder_utilities_file();
  }
  static
  {
    me = new builder_utilities();
    $standard_regression_conditions$ = null;
    $all_cyc_products$ = null;
    $cyc_product_definitions$ = null;
    $cyc_product$ = null;
    $code_product$ = null;
    $kb_product$ = null;
    $branch_tag$ = null;
    $generic_sbhl_caching_policy_templates$ = null;
    $cyc_tests_to_use_for_sbhl_cache_tuning$ = null;
    $kb_queries_to_use_for_sbhl_cache_tuning$ = null;
    $run_cyclops_for_sbhl_cache_tuningP$ = null;
    $build_process_worker_count$ = null;
    $allowed_obfuscation_name_spaces$ = null;
    $constant_obfuscation_name_generator_state$ = null;
    $constant_obfuscation_cache$ = null;
    $ts_comment_stream$ = null;
    $kw0$TERSE = makeKeyword( "TERSE" );
    $str1$This_cyc_image_is_no_longer_usabl = makeString( "This cyc image is no longer usable and will now exit." );
    $sym2$CYC_BUILD_WORLD_VERIFY = makeSymbol( "CYC-BUILD-WORLD-VERIFY" );
    $str3$Continue = makeString( "Continue" );
    $str4$World_file__A_already_exists_and_ = makeString( "World file ~A already exists and may not be overwritable if in use." );
    $str5$A = makeString( "A" );
    $str6$cyc_ = makeString( "cyc-" );
    $str7$_ = makeString( "-" );
    $str8$_kb_ = makeString( "-kb-" );
    $str9$_cyc_ = makeString( "/cyc/" );
    $str10$_ = makeString( "/" );
    $str11$_install_ = makeString( "/install/" );
    $str12$kb_ = makeString( "kb-" );
    $str13$_load = makeString( ".load" );
    $sym14$DIRECTORY_P = makeSymbol( "DIRECTORY-P" );
    $str15$Writing_cyc_image_to__A__ = makeString( "Writing cyc image to ~A~%" );
    $sym16$CYC_LOAD_KB = makeSymbol( "CYC-LOAD-KB" );
    $sym17$CYC_LOAD_INCREMENTAL_KB = makeSymbol( "CYC-LOAD-INCREMENTAL-KB" );
    $sym18$CYC_DUMP_STANDARD_KB = makeSymbol( "CYC-DUMP-STANDARD-KB" );
    $str19$This_CYC_is_receiving_operations_ = makeString( "This CYC is receiving operations; KB changes during a snapshot will invalidate the dump." );
    $sym20$CYC_SNAPSHOT_KB = makeSymbol( "CYC-SNAPSHOT-KB" );
    $kw21$MINIMAL = makeKeyword( "MINIMAL" );
    $sym22$CYC_DUMP_SNAPSHOT_KB = makeSymbol( "CYC-DUMP-SNAPSHOT-KB" );
    $str23$Dump_snapshot_KB_trivially_finish = makeString( "Dump snapshot KB trivially finished: dump directory and current units are both ~S" );
    $str24$Setting_up_safe_KB_dump_environme = makeString( "Setting up safe KB dump environment" );
    $str25$Agenda_was_not_successfully_halte = makeString( "Agenda was not successfully halted!" );
    $kw26$UNKNOWN = makeKeyword( "UNKNOWN" );
    $str27$Restoring_pre_dump_environment = makeString( "Restoring pre-dump environment" );
    $sym28$SUGGEST_KB_SNAPSHOT_DIRECTORY = makeSymbol( "SUGGEST-KB-SNAPSHOT-DIRECTORY" );
    $str29$The_base_directory__A_does_not_ex = makeString( "The base directory ~A does not exist.~%" );
    $str30$Loaded_KB_version___A__ = makeString( "Loaded KB version: ~A~%" );
    $str31$TheBuilder = makeString( "TheBuilder" );
    $str32$yes = makeString( "yes" );
    $str33$Determining_total_transcript_ops_ = makeString( "Determining total transcript ops ...." );
    $str34$__Total_transcription_ops__A___ = makeString( "~&Total transcription ops ~A.~%" );
    $str35$Getting_caught_up_on_operations__ = makeString( "Getting caught up on operations ...." );
    $str36$__Catch_up_completed__Ops_remaini = makeString( "~&Catch-up completed. Ops remaining ~A.~%" );
    $str37$Post_catch_up_KB_version___A__ = makeString( "Post catch-up KB version: ~A~%" );
    $kw38$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym39$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $str40$Post_load_transcript_KB_version__ = makeString( "Post load transcript KB version: ~A~%" );
    $str41$no = makeString( "no" );
    $str42$__Successfully_created__S_units__ = makeString( "~&Successfully created ~S units: ~A~%" );
    $str43$_home_builder_logs_ = makeString( "/home/builder/logs/" );
    $str44$No_log_directory__A_____strange__ = makeString( "No log directory ~A ... strange.~%" );
    $str45$forward_inference_metrics_ = makeString( "forward-inference-metrics-" );
    $str46$_html = makeString( ".html" );
    $str47$The_catchup_image_expected_to_be_ = makeString( "The catchup image expected to be using world ~A but has ~A." );
    $str48$Builder_s_catchup_to_rollover_ser = makeString( "Builder's catchup-to-rollover server - DO NOT USE" );
    $kw49$OUTPUT = makeKeyword( "OUTPUT" );
    $str50$Unable_to_open__S = makeString( "Unable to open ~S" );
    $str51$Getting_caught_up_to_KB_rollover_ = makeString( "Getting caught up to KB rollover to " );
    $sym52$KB_FULL_TRANSCRIPT_LOADED = makeSymbol( "KB-FULL-TRANSCRIPT-LOADED" );
    $str53$The_agenda_is_not_running___Fix_y = makeString( "The agenda is not running.  Fix your init files, probably parameters.lisp." );
    $kw54$RECEIVE_ONLY = makeKeyword( "RECEIVE-ONLY" );
    $const55$Guest = constant_handles.reader_make_constant_shell( makeString( "Guest" ) );
    $str56$CycAdministrator = makeString( "CycAdministrator" );
    $str57$Getting_caught_up__ = makeString( "Getting caught up~%" );
    $str58$Builder_s_transcript_loading_serv = makeString( "Builder's transcript-loading server - DO NOT USE" );
    $kw59$NONE = makeKeyword( "NONE" );
    $str60$Builder_s_catchup_to_current_serv = makeString( "Builder's catchup-to-current server - DO NOT USE" );
    $str61$Getting_caught_up_from_KB_ = makeString( "Getting caught up from KB " );
    $str62$_ = makeString( "." );
    $str63$_to_KB_ = makeString( " to KB " );
    $kw64$DEAF = makeKeyword( "DEAF" );
    $str65$Caught_up_to_KB__A__ = makeString( "Caught up to KB ~A~%" );
    $sym66$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $str67$Could_not_get_total_master_transc = makeString( "Could not get total master transcript operations for KB ~a after rolling over from KB ~a" );
    $str68$Now_getting_caught_up_from_KB_ = makeString( "Now getting caught up from KB " );
    $str69$__Catching_up_on_operations_took_ = makeString( "~%Catching up on operations took: ~A secs~%" );
    $kw70$SILENT = makeKeyword( "SILENT" );
    $str71$___A__ = makeString( "~&~A~%" );
    $str72$___s_constant_A__A__ = makeString( "  ~s constant~A ~A~%" );
    $str73$s_were = makeString( "s were" );
    $str74$_was = makeString( " was" );
    $str75$created = makeString( "created" );
    $str76$destroyed = makeString( "destroyed" );
    $str77$___s_nart_A__A__ = makeString( "  ~s nart~A ~A~%" );
    $str78$___s_assertion_A__A__ = makeString( "  ~s assertion~A ~A~%" );
    $str79$___s_kb_hl_support_A__A__ = makeString( "  ~s kb-hl-support~A ~A~%" );
    $str80$___s_deduction_A__A__ = makeString( "  ~s deduction~A ~A~%" );
    $sym81$RUN_BASELINE_TESTS = makeSymbol( "RUN-BASELINE-TESTS" );
    $str82$tests_post_build_testdcl_lisp = makeString( "tests/post-build-testdcl.lisp" );
    $kw83$POST_BUILD = makeKeyword( "POST-BUILD" );
    $kw84$ALL = makeKeyword( "ALL" );
    $str85$release_baseline_tests_ = makeString( "release-baseline-tests-" );
    $str86$_cfasl = makeString( ".cfasl" );
    $str87$Writing_result_file = makeString( "Writing result file" );
    $sym88$BASELINE_RESULTS_TO_MAP = makeSymbol( "BASELINE-RESULTS-TO-MAP" );
    $list89 = ConsesLow.list( makeSymbol( "CATEGORY" ), makeSymbol( "TEST" ), makeSymbol( "OUTCOME" ), makeSymbol( "TIME" ) );
    $int90$100 = makeInteger( 100 );
    $sym91$COMPUTE_BASELINE_REGRESSIONS = makeSymbol( "COMPUTE-BASELINE-REGRESSIONS" );
    $list92 = ConsesLow.list( makeSymbol( "TEST" ), makeSymbol( "B-OUTCOME" ) );
    $kw93$NOT_PRESENT = makeKeyword( "NOT-PRESENT" );
    $sym94$SHOW_BASELINE_REGRESSION_INFO = makeSymbol( "SHOW-BASELINE-REGRESSION-INFO" );
    $list95 = ConsesLow.list( makeSymbol( "CATEGORY" ), makeSymbol( "INFO" ) );
    $str96$___S__ = makeString( "~%~S~%" );
    $list97 = ConsesLow.list( ConsesLow.cons( makeKeyword( "SUCCESS" ), makeKeyword( "FAILURE" ) ), ConsesLow.cons( makeKeyword( "SUCCESS" ), makeKeyword( "INVALID" ) ), ConsesLow.cons( makeKeyword( "SUCCESS" ),
        makeKeyword( "ERROR" ) ) );
    $sym98$SHOW_BASELINE_REGRESSION_DETAILS = makeSymbol( "SHOW-BASELINE-REGRESSION-DETAILS" );
    $list99 = ConsesLow.list( makeSymbol( "CATEGORY" ), makeSymbol( "CAT-MAP" ) );
    $sym100$TERM__ = makeSymbol( "TERM-<" );
    $str101$__S__ = makeString( " ~S~%" );
    $str102$___S__ = makeString( "  ~S~%" );
    $sym103$KEYWORDP = makeSymbol( "KEYWORDP" );
    $sym104$STRINGP = makeSymbol( "STRINGP" );
    $str105$The_cyc_product___A__is_already_p = makeString( "The cyc product, ~A, is already present with the declared definition." );
    $str106$There_already_exists_a_different_ = makeString( "There already exists a different cyc product, ~A, with this definition." );
    $str107$The_cyc_product__A_already_exists = makeString( "The cyc product ~A already exists with a different definition." );
    $sym108$CDR = makeSymbol( "CDR" );
    $kw109$HEAD = makeKeyword( "HEAD" );
    $kw110$STANDARD = makeKeyword( "STANDARD" );
    $kw111$FULL = makeKeyword( "FULL" );
    $str112$head = makeString( "head" );
    $kw113$CAE_0_3 = makeKeyword( "CAE-0.3" );
    $kw114$TKB = makeKeyword( "TKB" );
    $kw115$AKB = makeKeyword( "AKB" );
    $str116$cake_release_0p3_20051215 = makeString( "cake-release-0p3-20051215" );
    $sym117$_CYC_PRODUCT_ = makeSymbol( "*CYC-PRODUCT*" );
    $sym118$_KB_PRODUCT_ = makeSymbol( "*KB-PRODUCT*" );
    $kw119$UNKNOWN_CYC_PRODUCT = makeKeyword( "UNKNOWN-CYC-PRODUCT" );
    $sym120$LOAD_FILE_DEPENDENCY_INFORMATION = makeSymbol( "LOAD-FILE-DEPENDENCY-INFORMATION" );
    $kw121$INPUT = makeKeyword( "INPUT" );
    $sym122$WHITESPACE_CHAR_P = makeSymbol( "WHITESPACE-CHAR-P" );
    $sym123$AUGMENT_FILE_SET = makeSymbol( "AUGMENT-FILE-SET" );
    $sym124$COMPLETELY_AUGMENT_FILE_SET = makeSymbol( "COMPLETELY-AUGMENT-FILE-SET" );
    $str125$Augmenting_the_file_set_not_termi = makeString( "Augmenting the file set not terminating after ~A iterations." );
    $sym126$WRITE_ANT_FILESET_DECLARATION = makeSymbol( "WRITE-ANT-FILESET-DECLARATION" );
    $str127$id = makeString( "id" );
    $str128$dir = makeString( "dir" );
    $str129$fileset = makeString( "fileset" );
    $kw130$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $str131$name = makeString( "name" );
    $kw132$VALUE = makeKeyword( "VALUE" );
    $str133$include = makeString( "include" );
    $str134$exclude = makeString( "exclude" );
    $sym135$CONSTRUCT_ROOTED_FILE_SET_FROM_LIST = makeSymbol( "CONSTRUCT-ROOTED-FILE-SET-FROM-LIST" );
    $kw136$UNIX = makeKeyword( "UNIX" );
    $sym137$ROOT_FILE_SET = makeSymbol( "ROOT-FILE-SET" );
    $sym138$UNROOT_FILE_SET = makeSymbol( "UNROOT-FILE-SET" );
    $sym139$REROOT_FILE_SET = makeSymbol( "REROOT-FILE-SET" );
    $sym140$TEST_REROOT_FILE_SET = makeSymbol( "TEST-REROOT-FILE-SET" );
    $kw141$TEST = makeKeyword( "TEST" );
    $kw142$OWNER = makeKeyword( "OWNER" );
    $kw143$CLASSES = makeKeyword( "CLASSES" );
    $kw144$KB = makeKeyword( "KB" );
    $kw145$TINY = makeKeyword( "TINY" );
    $kw146$WORKING_ = makeKeyword( "WORKING?" );
    $list147 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "/cycdoc/img/cb/red_diam.gif" ), makeString( "/cycdoc/img/square-minus.gif" ) ), makeString( "/cycdoc" ), makeString( "doc" ) ),
        makeKeyword( "SUCCESS" ) ) );
    $str148$Rerooting_from__A_to__A_failed_an = makeString( "Rerooting from ~A to ~A failed and produced ~A." );
    $kw149$SUCCESS = makeKeyword( "SUCCESS" );
    $sym150$SERIALIZE_KB_STORE_LRU_INFORMATION = makeSymbol( "SERIALIZE-KB-STORE-LRU-INFORMATION" );
    $str151$Serializing_LRU_information_for_K = makeString( "Serializing LRU information for KB Store to " );
    $str152$cdolist = makeString( "cdolist" );
    $sym153$PRECACHE_KB_STORE_BY_LRU_INFORMATION = makeSymbol( "PRECACHE-KB-STORE-BY-LRU-INFORMATION" );
    $str154$Precaching_KB_Store_with_LRU_info = makeString( "Precaching KB Store with LRU info from " );
    $float155$0_212 = makeDouble( 0.212 );
    $int156$30000 = makeInteger( 30000 );
    $int157$22000 = makeInteger( 22000 );
    $float158$0_424 = makeDouble( 0.424 );
    $int159$1600 = makeInteger( 1600 );
    $sym160$FACT_SHEET_PATH_FOR_TERM_FILTER_AND_TRANSFORM = makeSymbol( "FACT-SHEET-PATH-FOR-TERM-FILTER-AND-TRANSFORM" );
    $kw161$DEFAULT = makeKeyword( "DEFAULT" );
    $kw162$STICKY = makeKeyword( "STICKY" );
    $kw163$UNDEFINED = makeKeyword( "UNDEFINED" );
    $const164$genlMt = constant_handles.reader_make_constant_shell( makeString( "genlMt" ) );
    $const165$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $kw166$SWAPOUT = makeKeyword( "SWAPOUT" );
    $int167$10000 = makeInteger( 10000 );
    $int168$8000 = makeInteger( 8000 );
    $int169$2000 = makeInteger( 2000 );
    $const170$quotedIsa = constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) );
    $int171$5000 = makeInteger( 5000 );
    $int172$4000 = makeInteger( 4000 );
    $int173$1000 = makeInteger( 1000 );
    $const174$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $const175$disjointWith = constant_handles.reader_make_constant_shell( makeString( "disjointWith" ) );
    $int176$1500 = makeInteger( 1500 );
    $int177$200 = makeInteger( 200 );
    $const178$genlPreds = constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) );
    $const179$genlInverse = constant_handles.reader_make_constant_shell( makeString( "genlInverse" ) );
    $const180$negationPreds = constant_handles.reader_make_constant_shell( makeString( "negationPreds" ) );
    $const181$negationInverse = constant_handles.reader_make_constant_shell( makeString( "negationInverse" ) );
    $sym182$DICTIONARY_P = makeSymbol( "DICTIONARY-P" );
    $sym183$FIRST = makeSymbol( "FIRST" );
    $str184$The_templates_list__A_does_not_co = makeString( "The templates list ~A does not contain a default rule." );
    $list185 = ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "POLICY" ), makeSymbol( "CAPACITY" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "EXEMPT" ), makeSymbol( "PREFETCH" ) );
    $list186 = ConsesLow.cons( makeUninternedSymbol( "KEY" ), makeSymbol( "MODULE" ) );
    $kw187$RECORDING = makeKeyword( "RECORDING" );
    $str188$Gathering_SBHL_cache_tuning_data_ = makeString( "Gathering SBHL cache tuning data via CYC tests ...." );
    $sym189$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $kw190$CYC_TESTS = makeKeyword( "CYC-TESTS" );
    $str191$Gathering_SBHL_cache_tuning_data_ = makeString( "Gathering SBHL cache tuning data via KB queries ...." );
    $str192$KBQ_Support_currently_not_impleme = makeString( "KBQ Support currently not implemented" );
    $kw193$KB_QUERIES = makeKeyword( "KB-QUERIES" );
    $str194$Gathering_SBHL_cache_tuning_data_ = makeString( "Gathering SBHL cache tuning data via CycLOPs ...." );
    $kw195$CYCLOPS = makeKeyword( "CYCLOPS" );
    $sym196$COMPILE_KB_SNAPSHOT_STATISTICS = makeSymbol( "COMPILE-KB-SNAPSHOT-STATISTICS" );
    $kw197$REVERSAL = makeKeyword( "REVERSAL" );
    $kw198$TOMBSTONE = makeKeyword( "TOMBSTONE" );
    $kw199$INDEX_ENTRIES = makeKeyword( "INDEX-ENTRIES" );
    $kw200$DATA_BYTES = makeKeyword( "DATA-BYTES" );
    $str201$category = makeString( "category" );
    $str202$numOfEdits = makeString( "numOfEdits" );
    $str203$numOfDeletes = makeString( "numOfDeletes" );
    $str204$numOfEntries = makeString( "numOfEntries" );
    $str205$numOfBytes = makeString( "numOfBytes" );
    $str206$fragBytes = makeString( "fragBytes" );
    $sym207$GATHER_KB_SNAPSHOT_STATISTICS = makeSymbol( "GATHER-KB-SNAPSHOT-STATISTICS" );
    $kw208$IN_PROGRESS = makeKeyword( "IN-PROGRESS" );
    $list209 = ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "DATA-FILE" ), makeSymbol( "INDEX-FILE" ), makeSymbol( "TYPE" ), ConsesLow.list( makeSymbol( "COMPLEX-DATA-FILE" ) ), ConsesLow.list( makeSymbol(
        "COMPLEX-INDEX-FILE" ) ) );
    $list210 = ConsesLow.list( makeKeyword( "DATA-FILE" ), makeKeyword( "INDEX-FILE" ), makeKeyword( "TYPE" ), makeKeyword( "COMPLEX-DATA-FILE" ), makeKeyword( "COMPLEX-INDEX-FILE" ) );
    $kw211$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw212$DATA_FILE = makeKeyword( "DATA-FILE" );
    $kw213$INDEX_FILE = makeKeyword( "INDEX-FILE" );
    $kw214$TYPE = makeKeyword( "TYPE" );
    $kw215$COMPLEX_DATA_FILE = makeKeyword( "COMPLEX-DATA-FILE" );
    $kw216$COMPLEX_INDEX_FILE = makeKeyword( "COMPLEX-INDEX-FILE" );
    $kw217$KNOWLEDGE = makeKeyword( "KNOWLEDGE" );
    $kw218$INDEXING = makeKeyword( "INDEXING" );
    $str219$Unsupported_file_vector_type__A__ = makeString( "Unsupported file vector type ~A ....~%" );
    $sym220$TRACK_KB_SNAPSHOT_STATISTICS = makeSymbol( "TRACK-KB-SNAPSHOT-STATISTICS" );
    $str221$GATHER_KB_SNAPSHOT_STATISTICS = makeString( "GATHER-KB-SNAPSHOT-STATISTICS" );
    $str222$__Check_at__A_______ = makeString( "~%Check at ~A ....~%" );
    $str223$_A_____in_progress__ = makeString( "~A ... in progress~%" );
    $str224$_A_____errored___A___ = makeString( "~A ... errored (~A)~%" );
    $str225$_A___A_edits___A_deletes___A_entr = makeString( "~A: ~A edits, ~A deletes, ~A entries, ~A bytes.~%" );
    $str226$Unknown_category__A_____dont_know = makeString( "Unknown category ~A ... dont know what to do.~%" );
    $sym227$GET_KB_MINI_DUMP_TIMESTAMP = makeSymbol( "GET-KB-MINI-DUMP-TIMESTAMP" );
    $sym228$PREPARE_KB_MINI_DUMP = makeSymbol( "PREPARE-KB-MINI-DUMP" );
    $kw229$CYC_API = makeKeyword( "CYC-API" );
    $sym230$PERFORM_KB_MINI_DUMP = makeSymbol( "PERFORM-KB-MINI-DUMP" );
    $str231$Error_while_performing_mini_dump_ = makeString( "Error while performing mini-dump~%~A~%" );
    $kw232$ERROR = makeKeyword( "ERROR" );
    $sym233$LAUNCH_ASYNCHRONOUS_KB_MINI_DUMP = makeSymbol( "LAUNCH-ASYNCHRONOUS-KB-MINI-DUMP" );
    $str234$Mini_KB_Dumper = makeString( "Mini KB Dumper" );
    $str235$mini_dump_finished_text = makeString( "mini-dump-finished.text" );
    $sym236$BUILD_PROCESS_WORKER_COUNT = makeSymbol( "BUILD-PROCESS-WORKER-COUNT" );
    $sym237$SET_BUILD_PROCESS_WORKER_COUNT = makeSymbol( "SET-BUILD-PROCESS-WORKER-COUNT" );
    $sym238$BUILD_PROCESS_PARALLELISM_PERMITTED_ = makeSymbol( "BUILD-PROCESS-PARALLELISM-PERMITTED?" );
    $sym239$WITH_ALLOWED_OBFUSCATION_NAMESPACE_SUPPORT = makeSymbol( "WITH-ALLOWED-OBFUSCATION-NAMESPACE-SUPPORT" );
    $sym240$CLET = makeSymbol( "CLET" );
    $list241 = ConsesLow.list( ConsesLow.list( makeSymbol( "*ALLOWED-OBFUSCATION-NAME-SPACES*" ), ConsesLow.list( makeSymbol( "LIST" ), makeString( "cyc" ) ) ) );
    $sym242$WITH_ALLOWED_OBFUSCATION_NAMESPACE = makeSymbol( "WITH-ALLOWED-OBFUSCATION-NAMESPACE" );
    $list243 = ConsesLow.list( ConsesLow.list( makeSymbol( "NAMESPACE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym244$_ALLOWED_OBFUSCATION_NAME_SPACES_ = makeSymbol( "*ALLOWED-OBFUSCATION-NAME-SPACES*" );
    $sym245$CONS = makeSymbol( "CONS" );
    $list246 = ConsesLow.list( makeSymbol( "*ALLOWED-OBFUSCATION-NAME-SPACES*" ) );
    $sym247$ALLOWED_OBFUSCATION_NAMESPACE_CONSTANT_ = makeSymbol( "ALLOWED-OBFUSCATION-NAMESPACE-CONSTANT?" );
    $str248$cyc = makeString( "cyc" );
    $sym249$UN_OBFUSCATABLE_CONSTANT_ = makeSymbol( "UN-OBFUSCATABLE-CONSTANT?" );
    $sym250$WITH_CONSTANT_OBFUSCATION = makeSymbol( "WITH-CONSTANT-OBFUSCATION" );
    $list251 = ConsesLow.list( ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "STATE" ), makeKeyword( "UNPROVIDED" ) ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $kw252$UNPROVIDED = makeKeyword( "UNPROVIDED" );
    $sym253$STATE_VAL = makeUninternedSymbol( "STATE-VAL" );
    $sym254$_CONSTANT_OBFUSCATION_NAME_GENERATOR_STATE_ = makeSymbol( "*CONSTANT-OBFUSCATION-NAME-GENERATOR-STATE*" );
    $sym255$WITH_CONSTANT_NAME_OBFUSCATION = makeSymbol( "WITH-CONSTANT-NAME-OBFUSCATION" );
    $list256 = ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "OBFUSCATE-CONSTANT-NAME-VIA-GENERATOR-FN" ) );
    $sym257$OBFUSCATE_CONSTANT_NAME_VIA_GENERATOR_FN = makeSymbol( "OBFUSCATE-CONSTANT-NAME-VIA-GENERATOR-FN" );
    $list258 = ConsesLow.cons( makeSymbol( "GENERATOR" ), makeSymbol( "STATE" ) );
    $kw259$NOT_FOUND = makeKeyword( "NOT-FOUND" );
    $str260$_ = makeString( "_" );
    $sym261$NEW_CONSTANT_OBFUSCATION_CACHE = makeSymbol( "NEW-CONSTANT-OBFUSCATION-CACHE" );
    $sym262$WITH_CACHED_CONSTANT_OBFUSCATION = makeSymbol( "WITH-CACHED-CONSTANT-OBFUSCATION" );
    $sym263$KBEQ = makeSymbol( "KBEQ" );
    $list264 = ConsesLow.list( ConsesLow.list( makeSymbol( "*CONSTANT-OBFUSCATION-CACHE*" ), ConsesLow.list( makeSymbol( "NEW-CONSTANT-OBFUSCATION-CACHE" ) ) ) );
    $sym265$MAKE_OBFUSCATION_GENSYM_STATE = makeSymbol( "MAKE-OBFUSCATION-GENSYM-STATE" );
    $str266$C = makeString( "C" );
    $kw267$ISG = makeKeyword( "ISG" );
    $kw268$UPCASE = makeKeyword( "UPCASE" );
    $kw269$DOWNCASE = makeKeyword( "DOWNCASE" );
    $sym270$OBFUSCATE_CONSTANT_NAME_GENSYM = makeSymbol( "OBFUSCATE-CONSTANT-NAME-GENSYM" );
    $list271 = ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "ISG" ), makeSymbol( "UPCASE" ), makeSymbol( "DOWNCASE" ) );
    $list272 = ConsesLow.list( makeKeyword( "ISG" ), makeKeyword( "UPCASE" ), makeKeyword( "DOWNCASE" ) );
    $sym273$OBFUSCATE_AND_DUMP_ESSENTIAL_KB = makeSymbol( "OBFUSCATE-AND-DUMP-ESSENTIAL-KB" );
    $str274$Obfuscating_strings_in_Assertions = makeString( "Obfuscating strings in Assertions" );
    $str275$Obfuscating_strings_in_NARTs = makeString( "Obfuscating strings in NARTs" );
    $str276$KB_has_been_obfuscated__rendering = makeString( "KB has been obfuscated, rendering this image unusable." );
    $sym277$DETERMINE_OBFUSCATION_CANDIDATES = makeSymbol( "DETERMINE-OBFUSCATION-CANDIDATES" );
    $str278$Identifying_needed_KB_changes = makeString( "Identifying needed KB changes" );
    $str279$____Old_Space = makeString( " -- Old Space" );
    $sym280$NOT_TERM_OF_UNIT_ASSERTION_ = makeSymbol( "NOT-TERM-OF-UNIT-ASSERTION?" );
    $str281$____New_Space = makeString( " -- New Space" );
    $kw282$SKIP = makeKeyword( "SKIP" );
    $sym283$DETERMINE_ASSERTION_OBFUSCATIONS = makeSymbol( "DETERMINE-ASSERTION-OBFUSCATIONS" );
    $str284$Identifying_assertion_changes = makeString( "Identifying assertion changes" );
    $list285 = ConsesLow.list( makeSymbol( "UNREP-TERM" ), makeSymbol( "ASSERTIONS" ) );
    $list286 = ConsesLow.list( makeSymbol( "NEW-STRING" ), makeSymbol( "&REST" ), makeSymbol( "TARGET-ASSERTIONS" ) );
    $sym287$DETERMINE_NART_OBFUSCATIONS = makeSymbol( "DETERMINE-NART-OBFUSCATIONS" );
    $str288$Identifying_NART_changes = makeString( "Identifying NART changes" );
    $list289 = ConsesLow.list( makeSymbol( "NEW-STRING" ), makeSymbol( "&REST" ), makeSymbol( "TARGET-NAUTS" ) );
    $sym290$APPLY_ASSERTION_OBFUSCATIONS = makeSymbol( "APPLY-ASSERTION-OBFUSCATIONS" );
    $str291$Applying_assertion_changes = makeString( "Applying assertion changes" );
    $str292$Optimizing_edit_order = makeString( "Optimizing edit order" );
    $list293 = ConsesLow.cons( makeSymbol( "UNREP-TERM" ), makeSymbol( "NEW-STRING" ) );
    $str294$A_total_of_ = makeString( "A total of " );
    $str295$_edits_had_been_made_to_the_KB_ = makeString( " edits had been made to the KB." );
    $kw296$NON_GAFS = makeKeyword( "NON-GAFS" );
    $sym297$WEAKLY_SCRAMBLE_STRING_IN_ASSERTIONS = makeSymbol( "WEAKLY-SCRAMBLE-STRING-IN-ASSERTIONS" );
    $sym298$WEAKLY_SCRAMBLE_STRING_IN_NAUTS = makeSymbol( "WEAKLY-SCRAMBLE-STRING-IN-NAUTS" );
    $sym299$MIX_CASE_STRING = makeSymbol( "MIX-CASE-STRING" );
    $sym300$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const301$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const302$Collection = constant_handles.reader_make_constant_shell( makeString( "Collection" ) );
    $sym303$RELEVANT_MT_IS_GENL_MT = makeSymbol( "RELEVANT-MT-IS-GENL-MT" );
    $sym304$FORT_P = makeSymbol( "FORT-P" );
    $sym305$HIGHER_ORDER_COLLECTION_ = makeSymbol( "HIGHER-ORDER-COLLECTION?" );
    $sym306$_ = makeSymbol( "<" );
    $sym307$INSTANCE_CARDINALITY = makeSymbol( "INSTANCE-CARDINALITY" );
    $kw308$ASCENDING = makeKeyword( "ASCENDING" );
    $const309$CollectionType = constant_handles.reader_make_constant_shell( makeString( "CollectionType" ) );
    $str310$Nothing_to_clip_ = makeString( "Nothing to clip." );
    $kw311$PERCENTAGE = makeKeyword( "PERCENTAGE" );
    $str312$Invalid_percentage__A__cannot_cli = makeString( "Invalid percentage ~A: cannot clip from ~A to ~A." );
    $str313$___A__Deleting__A_____ = makeString( "~&~A: Deleting ~A ... " );
    $kw314$BREADTH = makeKeyword( "BREADTH" );
    $kw315$QUEUE = makeKeyword( "QUEUE" );
    $kw316$STACK = makeKeyword( "STACK" );
    $sym317$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol( "RELEVANT-SBHL-TV-IS-GENERAL-TV" );
    $str318$_A_is_not_a__A = makeString( "~A is not a ~A" );
    $sym319$SBHL_TRUE_TV_P = makeSymbol( "SBHL-TRUE-TV-P" );
    $kw320$CERROR = makeKeyword( "CERROR" );
    $str321$continue_anyway = makeString( "continue anyway" );
    $kw322$WARN = makeKeyword( "WARN" );
    $str323$_A_is_not_a_valid__sbhl_type_erro = makeString( "~A is not a valid *sbhl-type-error-action* value" );
    $str324$_A_is_neither_SET_P_nor_LISTP_ = makeString( "~A is neither SET-P nor LISTP." );
    $str325$attempting_to_bind_direction_link = makeString( "attempting to bind direction link variable, to NIL. macro body not executed." );
    $list326 = ConsesLow.list( makeUninternedSymbol( "LINK-NODE" ), makeUninternedSymbol( "MT" ), makeUninternedSymbol( "TV" ) );
    $str327$Node__a_does_not_pass_sbhl_type_t = makeString( "Node ~a does not pass sbhl-type-test ~a~%" );
    $str328$_done___ = makeString( " done.~%" );
    $sym329$_EXIT = makeSymbol( "%EXIT" );
    $kw330$EXHAUSTED = makeKeyword( "EXHAUSTED" );
    $str331$___A__Current_FORT_Count____A__ = makeString( "~&~A: Current FORT Count : ~A~%" );
    $str332$___A__Gathering_tabu_collections_ = makeString( "~&~A: Gathering tabu-collections ....~%" );
    $str333$___A__Selecting_clippable_collect = makeString( "~&~A: Selecting clippable collections ....~%" );
    $str334$___A__Clipping_collections_______ = makeString( "~&~A: Clipping collections ....~%" );
    $float335$0_1 = makeDouble( 0.1 );
    $kw336$LOG = makeKeyword( "LOG" );
    $str337$___A__Clipping_stopped_at__A_FORT = makeString( "~&~A: Clipping stopped at ~A FORTs remaining with reason code ~A.~%" );
    $sym338$GENERATE_TERMS_TRANSCRIPT = makeSymbol( "GENERATE-TERMS-TRANSCRIPT" );
    $const339$CycAdministrator = constant_handles.reader_make_constant_shell( makeString( "CycAdministrator" ) );
    $int340$212 = makeInteger( 212 );
    $str341$Finding_assertions_about_missing_ = makeString( "Finding assertions about missing SAP terms ...." );
    $list342 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "genls" ) ) );
    $str343$Could_not_find_constant_for__S___ = makeString( "Could not find constant for ~S ... skipping.~%" );
    $str344$_A_constants_were_skipped___ = makeString( "~A constants were skipped.~%" );
  }
}
/*
 * 
 * Total time: 7199 ms
 * 
 */